package dk.itu.transformit;

import BDDModel.Behavior;
import BDDModel.Content;
import BDDModel.Feature;
import BDDModel.Model;
import BDDModel.Sentence;
import SimplifiedJML.Method;
import SimplifiedJML.SimplifiedJMLFactory;
import SimplifiedJML.SimplifiedJMLModel;
import SimplifiedJML.Structure;
import SimplifiedJML.impl.SimplifiedJMLFactoryImpl;
import TransformModel.Alternation;
import TransformModel.ExactSting;
import TransformModel.Optional;
import TransformModel.Pattern;
import TransformModel.Rule;
import TransformModel.TransformModel_;
import TransformModel.Transformation;
import TransformModel.Variable;
import com.google.code.regexp.NamedPattern;
import com.google.common.base.Objects;
import com.google.common.collect.Iterables;
import dk.itu.transformit.Evaluator;
import dk.itu.transformit.ObjectDumper;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.mwe2.runtime.workflow.IWorkflowComponent;
import org.eclipse.emf.mwe2.runtime.workflow.IWorkflowContext;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.InputOutput;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xbase.lib.ListExtensions;
import org.eclipse.xtext.xbase.lib.MapExtensions;
import org.eclipse.xtext.xbase.lib.Pair;
import org.eclipse.xtext.xbase.lib.Procedures.Procedure1;
import org.eclipse.xtext.xbase.lib.Procedures.Procedure2;

@SuppressWarnings("all")
public class MakeJmlModel implements IWorkflowComponent {
  private SimplifiedJMLFactory factory;
  
  private String _slot;
  
  public String getSlot() {
    return this._slot;
  }
  
  public void setSlot(final String slot) {
    this._slot = slot;
  }
  
  public void invoke(final IWorkflowContext ctx) {
    Object _get = ctx.get("bddmodel");
    final List<Model> bddmodels = ((List<Model>) _get);
    Object _get_1 = ctx.get("transformmodel");
    final List<TransformModel_> transformmodels = ((List<TransformModel_>) _get_1);
    final Function1<Model,EList<Feature>> _function = new Function1<Model,EList<Feature>>() {
        public EList<Feature> apply(final Model b) {
          EList<Feature> _features = b.getFeatures();
          return _features;
        }
      };
    List<EList<Feature>> _map = ListExtensions.<Model, EList<Feature>>map(bddmodels, _function);
    Iterable<Feature> _flatten = Iterables.<Feature>concat(_map);
    final Function1<Feature,EList<Behavior>> _function_1 = new Function1<Feature,EList<Behavior>>() {
        public EList<Behavior> apply(final Feature f) {
          EList<Behavior> _behaviors = f.getBehaviors();
          return _behaviors;
        }
      };
    Iterable<EList<Behavior>> _map_1 = IterableExtensions.<Feature, EList<Behavior>>map(_flatten, _function_1);
    final Iterable<Behavior> behaviors = Iterables.<Behavior>concat(_map_1);
    final Function1<TransformModel_,EList<TransformModel.Behavior>> _function_2 = new Function1<TransformModel_,EList<TransformModel.Behavior>>() {
        public EList<TransformModel.Behavior> apply(final TransformModel_ m) {
          EList<TransformModel.Behavior> _behaviors = m.getBehaviors();
          return _behaviors;
        }
      };
    List<EList<TransformModel.Behavior>> _map_2 = ListExtensions.<TransformModel_, EList<TransformModel.Behavior>>map(transformmodels, _function_2);
    final Iterable<TransformModel.Behavior> tbehaviors = Iterables.<TransformModel.Behavior>concat(_map_2);
    final Function1<TransformModel_,EList<Rule>> _function_3 = new Function1<TransformModel_,EList<Rule>>() {
        public EList<Rule> apply(final TransformModel_ m) {
          EList<Rule> _rules = m.getRules();
          return _rules;
        }
      };
    List<EList<Rule>> _map_3 = ListExtensions.<TransformModel_, EList<Rule>>map(transformmodels, _function_3);
    Iterable<Rule> _flatten_1 = Iterables.<Rule>concat(_map_3);
    final Collection<Evaluator> compiled = this.compileTransforms(_flatten_1);
    final SimplifiedJMLModel applied = this.applyTransforms(behaviors, tbehaviors, compiled);
    String _slot = this.getSlot();
    ctx.put(_slot, applied);
  }
  
  public static String p(final Object o) {
    ObjectDumper _dumper = ObjectDumper.getDumper();
    String _dump = _dumper.dump(o);
    return _dump;
  }
  
  public Collection<Evaluator> compileTransforms(final Iterable<Rule> rules) {
    Collection<Evaluator> _xblockexpression = null;
    {
      final Function1<Rule,Pair<String,Evaluator>> _function = new Function1<Rule,Pair<String,Evaluator>>() {
          public Pair<String,Evaluator> apply(final Rule r) {
            String _name = r.getName();
            NamedPattern _compileRule = MakeJmlModel.this.compileRule(r);
            Transformation _transformation = r.getTransformation();
            Evaluator _evaluator = new Evaluator(_compileRule, _transformation);
            Pair<String,Evaluator> _mappedTo = Pair.<String, Evaluator>of(_name, _evaluator);
            return _mappedTo;
          }
        };
      final Iterable<Pair<String,Evaluator>> res = IterableExtensions.<Rule, Pair<String,Evaluator>>map(rules, _function);
      HashMap<String,Evaluator> _hashMap = new HashMap<String,Evaluator>();
      final HashMap<String,Evaluator> ruleMap = _hashMap;
      final Procedure1<Pair<String,Evaluator>> _function_1 = new Procedure1<Pair<String,Evaluator>>() {
          public void apply(final Pair<String,Evaluator> pair) {
            String _key = pair.getKey();
            Evaluator _value = pair.getValue();
            ruleMap.put(_key, _value);
          }
        };
      IterableExtensions.<Pair<String,Evaluator>>forEach(res, _function_1);
      final Procedure2<String,Evaluator> _function_2 = new Procedure2<String,Evaluator>() {
          public void apply(final String k, final Evaluator v) {
            v.setRules(ruleMap);
          }
        };
      MapExtensions.<String, Evaluator>forEach(ruleMap, _function_2);
      Collection<Evaluator> _values = ruleMap.values();
      _xblockexpression = (_values);
    }
    return _xblockexpression;
  }
  
  public NamedPattern compileRule(final Rule r) {
    EList<Pattern> _patterns = r.getPatterns();
    String _compilePatterns = this.compilePatterns(_patterns);
    NamedPattern _compile = NamedPattern.compile(_compilePatterns);
    return _compile;
  }
  
  public String compilePatterns(final Iterable<Pattern> patterns) {
    final Function1<Pattern,String> _function = new Function1<Pattern,String>() {
        public String apply(final Pattern p) {
          String _compilePattern = MakeJmlModel.this.compilePattern(p);
          return _compilePattern;
        }
      };
    Iterable<String> _map = IterableExtensions.<Pattern, String>map(patterns, _function);
    String _join = IterableExtensions.join(_map, " ");
    return _join;
  }
  
  protected String _compilePattern(final ExactSting str) {
    String _content = str.getContent();
    return _content;
  }
  
  protected String _compilePattern(final Variable vr) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("\\s*(?<");
    String _name = vr.getName();
    String _substring = _name.substring(1);
    _builder.append(_substring, "");
    _builder.append(">\\S+)\\s*");
    return _builder.toString();
  }
  
  protected String _compilePattern(final Alternation al) {
    String _xblockexpression = null;
    {
      EList<Pattern> _choices = al.getChoices();
      final Function1<Pattern,String> _function = new Function1<Pattern,String>() {
          public String apply(final Pattern c) {
            String _compilePattern = MakeJmlModel.this.compilePattern(c);
            return _compilePattern;
          }
        };
      List<String> _map = ListExtensions.<Pattern, String>map(_choices, _function);
      final String patterns = IterableExtensions.join(_map, " | ");
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("(");
      _builder.append(patterns, "");
      _builder.append(")");
      _xblockexpression = (_builder.toString());
    }
    return _xblockexpression;
  }
  
  protected String _compilePattern(final Optional opt) {
    String _xblockexpression = null;
    {
      EList<Pattern> _value = opt.getValue();
      final String patterns = this.compilePatterns(_value);
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("(");
      _builder.append(patterns, "");
      _builder.append(")?");
      _xblockexpression = (_builder.toString());
    }
    return _xblockexpression;
  }
  
  public SimplifiedJMLModel applyTransforms(final Iterable<Behavior> bs, final Iterable<TransformModel.Behavior> tbs, final Iterable<Evaluator> compiledTransforms) {
    SimplifiedJMLModel _xblockexpression = null;
    {
      SimplifiedJMLFactoryImpl _simplifiedJMLFactoryImpl = new SimplifiedJMLFactoryImpl();
      this.factory = _simplifiedJMLFactoryImpl;
      final SimplifiedJMLModel jmlmodel = this.factory.createSimplifiedJMLModel();
      final Procedure1<Behavior> _function = new Procedure1<Behavior>() {
          public void apply(final Behavior b) {
            MakeJmlModel.this.mapBehavior(b, tbs, compiledTransforms, jmlmodel);
          }
        };
      IterableExtensions.<Behavior>forEach(bs, _function);
      _xblockexpression = (jmlmodel);
    }
    return _xblockexpression;
  }
  
  public boolean mapBehavior(final Behavior behavior, final Iterable<TransformModel.Behavior> tbehaviors, final Iterable<Evaluator> evaluators, final SimplifiedJMLModel model) {
    boolean _xblockexpression = false;
    {
      final Function1<TransformModel.Behavior,Boolean> _function = new Function1<TransformModel.Behavior,Boolean>() {
          public Boolean apply(final TransformModel.Behavior t) {
            String _description = t.getDescription();
            String _trim = _description.trim();
            String _description_1 = behavior.getDescription();
            String _trim_1 = _description_1.trim();
            boolean _equalsIgnoreCase = _trim.equalsIgnoreCase(_trim_1);
            return Boolean.valueOf(_equalsIgnoreCase);
          }
        };
      final TransformModel.Behavior tb = IterableExtensions.<TransformModel.Behavior>findFirst(tbehaviors, _function);
      boolean _xifexpression = false;
      boolean _equals = Objects.equal(tb, null);
      if (_equals) {
        StringConcatenation _builder = new StringConcatenation();
        _builder.append("Could not find any transformation for following behavior: ");
        String _description = behavior.getDescription();
        _builder.append(_description, "");
        RuntimeException _runtimeException = new RuntimeException(_builder.toString());
        throw _runtimeException;
      } else {
        boolean _xblockexpression_1 = false;
        {
          EList<Structure> _structures = model.getStructures();
          final Function1<Structure,Boolean> _function_1 = new Function1<Structure,Boolean>() {
              public Boolean apply(final Structure s) {
                String _name = s.getName();
                String _class_ = tb.getClass_();
                boolean _equals = Objects.equal(_name, _class_);
                return Boolean.valueOf(_equals);
              }
            };
          Structure cl = IterableExtensions.<Structure>findFirst(_structures, _function_1);
          boolean _equals_1 = Objects.equal(cl, null);
          if (_equals_1) {
            Structure _createStructure = this.factory.createStructure();
            cl = _createStructure;
            String _class_ = tb.getClass_();
            cl.setName(_class_);
            EList<Structure> _structures_1 = model.getStructures();
            _structures_1.add(cl);
          }
          final Method method = this.factory.createMethod();
          String _signature = tb.getSignature();
          method.setSignature(_signature);
          this.mapContracts(behavior, evaluators, method);
          EList<Method> _methods = cl.getMethods();
          boolean _add = _methods.add(method);
          _xblockexpression_1 = (_add);
        }
        _xifexpression = _xblockexpression_1;
      }
      _xblockexpression = (_xifexpression);
    }
    return _xblockexpression;
  }
  
  public void mapContracts(final Behavior behavior, final Iterable<Evaluator> evaluators, final Method method) {
    EList<Sentence> _requiringBlocks = behavior.getRequiringBlocks();
    final Procedure1<Sentence> _function = new Procedure1<Sentence>() {
        public void apply(final Sentence sentence) {
          EList<String> _requirements = method.getRequirements();
          String _mapContract = MakeJmlModel.this.mapContract(sentence, evaluators);
          _requirements.add(_mapContract);
        }
      };
    IterableExtensions.<Sentence>forEach(_requiringBlocks, _function);
    EList<Sentence> _ensuringBlocks = behavior.getEnsuringBlocks();
    final Procedure1<Sentence> _function_1 = new Procedure1<Sentence>() {
        public void apply(final Sentence sentence) {
          EList<String> _ensures = method.getEnsures();
          String _mapContract = MakeJmlModel.this.mapContract(sentence, evaluators);
          _ensures.add(_mapContract);
        }
      };
    IterableExtensions.<Sentence>forEach(_ensuringBlocks, _function_1);
  }
  
  public String mapContract(final Sentence sentence, final Iterable<Evaluator> evaluators) {
    String _xblockexpression = null;
    {
      EList<Content> _words = sentence.getWords();
      final Function1<Content,String> _function = new Function1<Content,String>() {
          public String apply(final Content c) {
            String _value = c.getValue();
            return _value;
          }
        };
      List<String> _map = ListExtensions.<Content, String>map(_words, _function);
      final String sentenceStr = IterableExtensions.join(_map, " ");
      final Function1<Evaluator,Boolean> _function_1 = new Function1<Evaluator,Boolean>() {
          public Boolean apply(final Evaluator eval) {
            boolean _matches = eval.matches(sentenceStr);
            return Boolean.valueOf(_matches);
          }
        };
      final Evaluator evaluator = IterableExtensions.<Evaluator>findFirst(evaluators, _function_1);
      InputOutput.<String>println(sentenceStr);
      NamedPattern _pattern = evaluator.getPattern();
      InputOutput.<NamedPattern>println(_pattern);
      boolean _equals = Objects.equal(evaluator, null);
      if (_equals) {
        StringConcatenation _builder = new StringConcatenation();
        _builder.append("Could not find any matching transformation rule for following sentence: ");
        _builder.append(sentenceStr, "");
        RuntimeException _runtimeException = new RuntimeException(_builder.toString());
        throw _runtimeException;
      }
      String _eval = evaluator.eval(sentenceStr);
      _xblockexpression = (_eval);
    }
    return _xblockexpression;
  }
  
  public void postInvoke() {
  }
  
  public void preInvoke() {
  }
  
  public String compilePattern(final Pattern al) {
    if (al instanceof Alternation) {
      return _compilePattern((Alternation)al);
    } else if (al instanceof ExactSting) {
      return _compilePattern((ExactSting)al);
    } else if (al instanceof Optional) {
      return _compilePattern((Optional)al);
    } else if (al instanceof Variable) {
      return _compilePattern((Variable)al);
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(al).toString());
    }
  }
}
