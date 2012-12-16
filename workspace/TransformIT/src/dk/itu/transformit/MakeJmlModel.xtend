package dk.itu.transformit

import org.eclipse.emf.mwe2.runtime.workflow.IWorkflowComponent
import org.eclipse.emf.mwe2.runtime.workflow.IWorkflowContext
import BDDModel.Model
import TransformModel.TransformModel_
import TransformModel.Pattern
import TransformModel.ExactSting
import TransformModel.Variable
import TransformModel.Alternation
import TransformModel.Optional
import com.google.code.regexp.NamedPattern
import java.util.HashMap
import SimplifiedJML.impl.SimplifiedJMLFactoryImpl
import BDDModel.Behavior
import SimplifiedJML.SimplifiedJMLModel
import dk.itu.transformit.Evaluator
import SimplifiedJML.SimplifiedJMLFactory
import SimplifiedJML.Method
import BDDModel.Sentence
import BDDModel.Word
import BDDModel.Reference

class MakeJmlModel implements IWorkflowComponent {

	private SimplifiedJMLFactory factory
	@Property String slot
	
	override invoke(IWorkflowContext ctx) {
		val bddmodels = ctx.get("bddmodel") as java.util.List<Model>
		val transformmodels = ctx.get("transformmodel") as java.util.List<TransformModel_>
		val behaviors = bddmodels.map[b | b.features].flatten.map[f | f.behaviors].flatten
		val tbehaviors = transformmodels.map[m | m.behaviors].flatten
		val compiled = compileTransforms(transformmodels.map[m | m.rules].flatten)
		val applied = applyTransforms(behaviors, tbehaviors, compiled)
		ctx.put(slot, applied)
	}
	
	def static p(Object o) {
		ObjectDumper::getDumper().dump(o)
	}
	
	def compileTransforms(Iterable<TransformModel.Rule> rules) {
		val res = rules.map[r | r.name -> new Evaluator(compileRule(r), r.transformation)]
		val ruleMap = new HashMap<String, Evaluator>()
		res.forEach [pair | ruleMap.put(pair.key, pair.value)]
		ruleMap.forEach[k, v| v.rules = ruleMap]
		ruleMap.values
	}
	
	def compileRule(TransformModel.Rule r) {
		NamedPattern::compile(compilePatterns(r.patterns))
	}
	
	def compilePatterns(Iterable<Pattern> patterns) {
		patterns.map[p | compilePattern(p)].join(" ")
	}
	
	def dispatch String compilePattern(ExactSting str) {
		str.content
	}
	
	def dispatch String compilePattern(Variable vr) {
		'''\s*(?<«vr.name.substring(1)»>\S+)\s*'''
	}	
	
	def dispatch String compilePattern(Alternation al) {
		val patterns = al.choices.map[c | compilePattern(c)].join(" | ")
		'''(«patterns»)'''
	}
	
	def dispatch String compilePattern(Optional opt) {
		val patterns = compilePatterns(opt.value)
		'''(«patterns»)?'''
	}
	
	def applyTransforms(Iterable<BDDModel.Behavior> bs, Iterable<TransformModel.Behavior> tbs, Iterable<Evaluator> compiledTransforms) {
		factory = new SimplifiedJMLFactoryImpl()
		val jmlmodel = factory.createSimplifiedJMLModel()
		bs.forEach [b | mapBehavior(b, tbs, compiledTransforms, jmlmodel)]
		jmlmodel
	}
	
	def mapBehavior(Behavior behavior, Iterable<TransformModel.Behavior> tbehaviors, Iterable<Evaluator> evaluators, SimplifiedJMLModel model) {
		val tb = tbehaviors.findFirst [t | t.description.trim().equalsIgnoreCase(behavior.description.trim())]
		if (tb == null) {
			throw new RuntimeException('''Could not find any transformation for following behavior: «behavior.description»''')
		} else {
			var cl = model.structures.findFirst [s | s.name == tb.class_]
			if (cl == null) {
				cl = factory.createStructure()
				cl.name = tb.class_
				//TODO: Invariants go here
				model.structures.add(cl)
			}
			val method = factory.createMethod()
			method.signature = tb.signature
			mapContracts(behavior, evaluators, method)
			cl.methods.add(method)
		}
	}
	
	def mapContracts(Behavior behavior, Iterable<Evaluator> evaluators, Method method) { 
		behavior.requiringBlocks.forEach [sentence | method.requirements.add(mapContract(sentence, evaluators))]
		behavior.ensuringBlocks.forEach [sentence | method.ensures.add(mapContract(sentence, evaluators))]
	}
	
	def mapContract(Sentence sentence, Iterable<Evaluator> evaluators) {
		val sentenceStr = sentence.words.map [c | c.value].join(" ")
		val evaluator = evaluators.findFirst [eval | eval.matches(sentenceStr)]
		println(sentenceStr)
		println(evaluator.pattern)
		if (evaluator == null) {
			throw new RuntimeException('''Could not find any matching transformation rule for following sentence: «sentenceStr»''')
		}
		evaluator.eval(sentenceStr)
	}
	override postInvoke() {}
	override preInvoke() {}
}