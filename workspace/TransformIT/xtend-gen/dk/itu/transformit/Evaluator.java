package dk.itu.transformit;

import TransformModel.Expression;
import TransformModel.Fail;
import TransformModel.IfDef;
import TransformModel.KeyValue;
import TransformModel.Match;
import TransformModel.Rule;
import TransformModel.Transformation;
import com.google.code.regexp.NamedMatcher;
import com.google.code.regexp.NamedPattern;
import com.google.common.base.Objects;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.eclipse.emf.common.util.EList;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.xbase.lib.Conversions;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xbase.lib.ListExtensions;
import org.eclipse.xtext.xbase.lib.Procedures.Procedure1;

@SuppressWarnings("all")
public class Evaluator {
  private NamedPattern _pattern;
  
  public NamedPattern getPattern() {
    return this._pattern;
  }
  
  public void setPattern(final NamedPattern pattern) {
    this._pattern = pattern;
  }
  
  private Transformation _transformation;
  
  public Transformation getTransformation() {
    return this._transformation;
  }
  
  public void setTransformation(final Transformation transformation) {
    this._transformation = transformation;
  }
  
  private Map<String,Evaluator> _rules;
  
  public Map<String,Evaluator> getRules() {
    return this._rules;
  }
  
  public void setRules(final Map<String,Evaluator> rules) {
    this._rules = rules;
  }
  
  public Evaluator(final NamedPattern pattern, final Transformation transformation) {
    this.setPattern(pattern);
    this.setTransformation(transformation);
  }
  
  public boolean matches(final String str) {
    NamedPattern _pattern = this.getPattern();
    NamedMatcher _matcher = _pattern.matcher(str);
    boolean _matches = _matcher.matches();
    return _matches;
  }
  
  public String eval(final String str) {
    String _xblockexpression = null;
    {
      NamedPattern _pattern = this.getPattern();
      final NamedMatcher matcher = _pattern.matcher(str);
      HashMap<String,String> _hashMap = new HashMap<String,String>();
      final HashMap<String,String> finalParameters = _hashMap;
      String _xifexpression = null;
      boolean _matches = matcher.matches();
      if (_matches) {
        String _xblockexpression_1 = null;
        {
          Map<String,String> _namedGroups = matcher.namedGroups();
          finalParameters.putAll(_namedGroups);
          Transformation _transformation = this.getTransformation();
          String _evalSpecific = this.evalSpecific(_transformation, str, finalParameters);
          _xblockexpression_1 = (_evalSpecific);
        }
        _xifexpression = _xblockexpression_1;
      } else {
        StringConcatenation _builder = new StringConcatenation();
        _builder.append("Evaluating a matcher which does not match: ");
        _builder.append(str, "");
        RuntimeException _runtimeException = new RuntimeException(_builder.toString());
        throw _runtimeException;
      }
      _xblockexpression = (_xifexpression);
    }
    return _xblockexpression;
  }
  
  public String eval(final String str, final Map<String,String> assignedParameters) {
    Transformation _transformation = this.getTransformation();
    String _evalSpecific = this.evalSpecific(_transformation, str, assignedParameters);
    return _evalSpecific;
  }
  
  protected String _evalSpecific(final Expression expr, final String str, final Map<String,String> params) {
    String _value = expr.getValue();
    String[] _split = _value.split("\\s");
    final Function1<String,String> _function = new Function1<String,String>() {
        public String apply(final String w) {
          String _xifexpression = null;
          boolean _startsWith = w.startsWith("$");
          if (_startsWith) {
            String _substring = w.substring(1);
            String _get = params.get(_substring);
            _xifexpression = _get;
          } else {
            _xifexpression = w;
          }
          return _xifexpression;
        }
      };
    List<String> _map = ListExtensions.<String, String>map(((List<String>)Conversions.doWrapArray(_split)), _function);
    final Function1<String,Boolean> _function_1 = new Function1<String,Boolean>() {
        public Boolean apply(final String w) {
          boolean _and = false;
          boolean _notEquals = (!Objects.equal(w, null));
          if (!_notEquals) {
            _and = false;
          } else {
            String _trim = w.trim();
            boolean _notEquals_1 = (!Objects.equal(_trim, null));
            _and = (_notEquals && _notEquals_1);
          }
          return Boolean.valueOf(_and);
        }
      };
    Iterable<String> _filter = IterableExtensions.<String>filter(_map, _function_1);
    final Function1<String,String> _function_2 = new Function1<String,String>() {
        public String apply(final String w) {
          String _xifexpression = null;
          String _trim = w.trim();
          boolean _equalsIgnoreCase = _trim.equalsIgnoreCase("result");
          if (_equalsIgnoreCase) {
            _xifexpression = "\\result";
          } else {
            _xifexpression = w;
          }
          return _xifexpression;
        }
      };
    Iterable<String> _map_1 = IterableExtensions.<String, String>map(_filter, _function_2);
    String _join = IterableExtensions.join(_map_1, " ");
    return _join;
  }
  
  protected String _evalSpecific(final Match match, final String str, final Map<String,String> params) {
    String _xblockexpression = null;
    {
      HashMap<String,String> _hashMap = new HashMap<String,String>();
      final HashMap<String,String> matchArgs = _hashMap;
      EList<KeyValue> _assignments = match.getAssignments();
      final Procedure1<KeyValue> _function = new Procedure1<KeyValue>() {
          public void apply(final KeyValue kv) {
            String _key = kv.getKey();
            String _substring = _key.substring(1);
            String _xifexpression = null;
            String _value = kv.getValue();
            String _trim = _value.trim();
            boolean _startsWith = _trim.startsWith("$");
            if (_startsWith) {
              String _value_1 = kv.getValue();
              String _trim_1 = _value_1.trim();
              String _substring_1 = _trim_1.substring(1);
              String _get = params.get(_substring_1);
              _xifexpression = _get;
            } else {
              String _value_2 = kv.getValue();
              String _trim_2 = _value_2.trim();
              _xifexpression = _trim_2;
            }
            matchArgs.put(_substring, _xifexpression);
          }
        };
      IterableExtensions.<KeyValue>forEach(_assignments, _function);
      Map<String,Evaluator> _rules = this.getRules();
      Rule _rule = match.getRule();
      String _name = _rule.getName();
      Evaluator _get = _rules.get(_name);
      String _eval = _get.eval(str, matchArgs);
      _xblockexpression = (_eval);
    }
    return _xblockexpression;
  }
  
  protected String _evalSpecific(final Fail fail, final String str, final Map<String,String> params) {
    String _message = fail.getMessage();
    RuntimeException _runtimeException = new RuntimeException(_message);
    throw _runtimeException;
  }
  
  protected String _evalSpecific(final IfDef ifdef, final String str, final Map<String,String> params) {
    String _xblockexpression = null;
    {
      EList<String> _variables = ifdef.getVariables();
      final Function1<String,Boolean> _function = new Function1<String,Boolean>() {
          public Boolean apply(final String el) {
            boolean _containsKey = params.containsKey(el);
            return Boolean.valueOf(_containsKey);
          }
        };
      final boolean res = IterableExtensions.<String>forall(_variables, _function);
      String _xifexpression = null;
      if (res) {
        Transformation _true_body = ifdef.getTrue_body();
        String _evalSpecific = this.evalSpecific(_true_body, str, params);
        _xifexpression = _evalSpecific;
      } else {
        Transformation _false_body = ifdef.getFalse_body();
        String _evalSpecific_1 = this.evalSpecific(_false_body, str, params);
        _xifexpression = _evalSpecific_1;
      }
      _xblockexpression = (_xifexpression);
    }
    return _xblockexpression;
  }
  
  public String evalSpecific(final Transformation expr, final String str, final Map<String,String> params) {
    if (expr instanceof Expression) {
      return _evalSpecific((Expression)expr, str, params);
    } else if (expr instanceof Fail) {
      return _evalSpecific((Fail)expr, str, params);
    } else if (expr instanceof IfDef) {
      return _evalSpecific((IfDef)expr, str, params);
    } else if (expr instanceof Match) {
      return _evalSpecific((Match)expr, str, params);
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(expr, str, params).toString());
    }
  }
}
