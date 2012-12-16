package dk.itu.transformit

import TransformModel.Expression
import TransformModel.Fail
import TransformModel.IfDef
import TransformModel.Match
import TransformModel.Transformation
import com.google.code.regexp.NamedPattern
import java.util.HashMap
import java.util.Map
import org.eclipse.xtend.lib.Property

class Evaluator {
	@Property NamedPattern pattern
	@Property Transformation transformation
	@Property Map<String, Evaluator> rules
	
	public new(NamedPattern pattern, Transformation transformation) {
		this.pattern = pattern
		this.transformation = transformation
	}
	
	def public matches(String str) {
		pattern.matcher(str).matches
	}
	
	def public eval(String str) {
		val matcher = pattern.matcher(str)
		val finalParameters = new HashMap<String,String>()
		if(matcher.matches) {
			finalParameters.putAll(matcher.namedGroups)
			evalSpecific(transformation, str, finalParameters)
		} else {
			throw new RuntimeException('''Evaluating a matcher which does not match: «str»''')
		}
	}
	
	def eval(String str, Map<String, String> assignedParameters) {
		evalSpecific(transformation, str, assignedParameters)
	}
	
	def dispatch String evalSpecific(Expression expr, String str, Map<String, String> params) {
		expr.value.split('\\s')
			.map[w | if (w.startsWith('$')) params.get(w.substring(1)) 
					 else w
			]
			.filter [w | w != null && w.trim != null]
			.map[w |  
					 if (w.trim.equalsIgnoreCase('result')) '\\result'
					 else w
			].join(" ")
	}
	
	def dispatch String evalSpecific(Match match, String str, Map<String, String> params) {
		val matchArgs = new HashMap<String, String>()
		match.assignments.forEach[kv | matchArgs.put(kv.key.substring(1), 
				if(kv.value.trim.startsWith('$')) params.get(kv.value.trim.substring(1)) 
			     else kv.value.trim)]
		
		rules.get(match.rule.name).eval(str, matchArgs)
	}
	
	def dispatch String evalSpecific(Fail fail, String str, Map<String, String> params) {
		throw new RuntimeException(fail.message)
	}
	
	def dispatch String evalSpecific(IfDef ifdef, String str, Map<String, String> params) {
		val res = ifdef.variables.forall [el | params.containsKey(el)]
		if (res) {
			evalSpecific(ifdef.true_body, str, params)
		} else {
			evalSpecific(ifdef.false_body, str, params)
		}
	}
}