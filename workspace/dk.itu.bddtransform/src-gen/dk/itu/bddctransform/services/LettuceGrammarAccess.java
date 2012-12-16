/*
* generated by Xtext
*/

package dk.itu.bddctransform.services;

import com.google.inject.Singleton;
import com.google.inject.Inject;

import java.util.List;

import org.eclipse.xtext.*;
import org.eclipse.xtext.service.GrammarProvider;
import org.eclipse.xtext.service.AbstractElementFinder.*;

import org.eclipse.xtext.common.services.TerminalsGrammarAccess;

@Singleton
public class LettuceGrammarAccess extends AbstractGrammarElementFinder {
	
	
	public class TransformModel_Elements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "TransformModel_");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cTransformKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Keyword cPackageKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Assignment cNameAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cNameEStringParserRuleCall_2_0 = (RuleCall)cNameAssignment_2.eContents().get(0);
		private final Alternatives cAlternatives_3 = (Alternatives)cGroup.eContents().get(3);
		private final Assignment cRulesAssignment_3_0 = (Assignment)cAlternatives_3.eContents().get(0);
		private final RuleCall cRulesRuleParserRuleCall_3_0_0 = (RuleCall)cRulesAssignment_3_0.eContents().get(0);
		private final Assignment cBehaviorsAssignment_3_1 = (Assignment)cAlternatives_3.eContents().get(1);
		private final RuleCall cBehaviorsBehaviorParserRuleCall_3_1_0 = (RuleCall)cBehaviorsAssignment_3_1.eContents().get(0);
		
		//TransformModel_:
		//	"transform" "package" name=EString (rules+=Rule | behaviors+=Behavior)+;
		public ParserRule getRule() { return rule; }

		//"transform" "package" name=EString (rules+=Rule | behaviors+=Behavior)+
		public Group getGroup() { return cGroup; }

		//"transform"
		public Keyword getTransformKeyword_0() { return cTransformKeyword_0; }

		//"package"
		public Keyword getPackageKeyword_1() { return cPackageKeyword_1; }

		//name=EString
		public Assignment getNameAssignment_2() { return cNameAssignment_2; }

		//EString
		public RuleCall getNameEStringParserRuleCall_2_0() { return cNameEStringParserRuleCall_2_0; }

		//(rules+=Rule | behaviors+=Behavior)+
		public Alternatives getAlternatives_3() { return cAlternatives_3; }

		//rules+=Rule
		public Assignment getRulesAssignment_3_0() { return cRulesAssignment_3_0; }

		//Rule
		public RuleCall getRulesRuleParserRuleCall_3_0_0() { return cRulesRuleParserRuleCall_3_0_0; }

		//behaviors+=Behavior
		public Assignment getBehaviorsAssignment_3_1() { return cBehaviorsAssignment_3_1; }

		//Behavior
		public RuleCall getBehaviorsBehaviorParserRuleCall_3_1_0() { return cBehaviorsBehaviorParserRuleCall_3_1_0; }
	}

	public class PatternElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "Pattern");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final RuleCall cExactStingParserRuleCall_0 = (RuleCall)cAlternatives.eContents().get(0);
		private final RuleCall cVariableParserRuleCall_1 = (RuleCall)cAlternatives.eContents().get(1);
		private final RuleCall cAlternationParserRuleCall_2 = (RuleCall)cAlternatives.eContents().get(2);
		private final RuleCall cOptionalParserRuleCall_3 = (RuleCall)cAlternatives.eContents().get(3);
		
		//Pattern:
		//	ExactSting | Variable | Alternation | Optional;
		public ParserRule getRule() { return rule; }

		//ExactSting | Variable | Alternation | Optional
		public Alternatives getAlternatives() { return cAlternatives; }

		//ExactSting
		public RuleCall getExactStingParserRuleCall_0() { return cExactStingParserRuleCall_0; }

		//Variable
		public RuleCall getVariableParserRuleCall_1() { return cVariableParserRuleCall_1; }

		//Alternation
		public RuleCall getAlternationParserRuleCall_2() { return cAlternationParserRuleCall_2; }

		//Optional
		public RuleCall getOptionalParserRuleCall_3() { return cOptionalParserRuleCall_3; }
	}

	public class TransformationElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "Transformation");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final RuleCall cExpressionParserRuleCall_0 = (RuleCall)cAlternatives.eContents().get(0);
		private final RuleCall cIfDefParserRuleCall_1 = (RuleCall)cAlternatives.eContents().get(1);
		private final RuleCall cMatchParserRuleCall_2 = (RuleCall)cAlternatives.eContents().get(2);
		private final RuleCall cFailParserRuleCall_3 = (RuleCall)cAlternatives.eContents().get(3);
		
		//Transformation:
		//	Expression | IfDef | Match | Fail;
		public ParserRule getRule() { return rule; }

		//Expression | IfDef | Match | Fail
		public Alternatives getAlternatives() { return cAlternatives; }

		//Expression
		public RuleCall getExpressionParserRuleCall_0() { return cExpressionParserRuleCall_0; }

		//IfDef
		public RuleCall getIfDefParserRuleCall_1() { return cIfDefParserRuleCall_1; }

		//Match
		public RuleCall getMatchParserRuleCall_2() { return cMatchParserRuleCall_2; }

		//Fail
		public RuleCall getFailParserRuleCall_3() { return cFailParserRuleCall_3; }
	}

	public class BehaviorElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "Behavior");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cBehaviorKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cDescriptionAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cDescriptionEStringParserRuleCall_1_0 = (RuleCall)cDescriptionAssignment_1.eContents().get(0);
		private final Keyword cClassKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Assignment cClassAssignment_3 = (Assignment)cGroup.eContents().get(3);
		private final RuleCall cClassEStringParserRuleCall_3_0 = (RuleCall)cClassAssignment_3.eContents().get(0);
		private final Keyword cSignatureKeyword_4 = (Keyword)cGroup.eContents().get(4);
		private final Assignment cSignatureAssignment_5 = (Assignment)cGroup.eContents().get(5);
		private final RuleCall cSignatureEStringParserRuleCall_5_0 = (RuleCall)cSignatureAssignment_5.eContents().get(0);
		private final Keyword cEndKeyword_6 = (Keyword)cGroup.eContents().get(6);
		
		//Behavior:
		//	"behavior" description=EString "class" class=EString "signature" signature=EString "end";
		public ParserRule getRule() { return rule; }

		//"behavior" description=EString "class" class=EString "signature" signature=EString "end"
		public Group getGroup() { return cGroup; }

		//"behavior"
		public Keyword getBehaviorKeyword_0() { return cBehaviorKeyword_0; }

		//description=EString
		public Assignment getDescriptionAssignment_1() { return cDescriptionAssignment_1; }

		//EString
		public RuleCall getDescriptionEStringParserRuleCall_1_0() { return cDescriptionEStringParserRuleCall_1_0; }

		//"class"
		public Keyword getClassKeyword_2() { return cClassKeyword_2; }

		//class=EString
		public Assignment getClassAssignment_3() { return cClassAssignment_3; }

		//EString
		public RuleCall getClassEStringParserRuleCall_3_0() { return cClassEStringParserRuleCall_3_0; }

		//"signature"
		public Keyword getSignatureKeyword_4() { return cSignatureKeyword_4; }

		//signature=EString
		public Assignment getSignatureAssignment_5() { return cSignatureAssignment_5; }

		//EString
		public RuleCall getSignatureEStringParserRuleCall_5_0() { return cSignatureEStringParserRuleCall_5_0; }

		//"end"
		public Keyword getEndKeyword_6() { return cEndKeyword_6; }
	}

	public class RuleElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "Rule");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cRuleKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cNameAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cNameRuleIdParserRuleCall_1_0 = (RuleCall)cNameAssignment_1.eContents().get(0);
		private final Assignment cPatternsAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cPatternsPatternParserRuleCall_2_0 = (RuleCall)cPatternsAssignment_2.eContents().get(0);
		private final Assignment cPatternsAssignment_3 = (Assignment)cGroup.eContents().get(3);
		private final RuleCall cPatternsPatternParserRuleCall_3_0 = (RuleCall)cPatternsAssignment_3.eContents().get(0);
		private final Assignment cTransformationAssignment_4 = (Assignment)cGroup.eContents().get(4);
		private final RuleCall cTransformationTransformationParserRuleCall_4_0 = (RuleCall)cTransformationAssignment_4.eContents().get(0);
		private final Keyword cEndKeyword_5 = (Keyword)cGroup.eContents().get(5);
		
		//Rule:
		//	"rule" name=RuleId patterns+=Pattern patterns+=Pattern* transformation=Transformation "end";
		public ParserRule getRule() { return rule; }

		//"rule" name=RuleId patterns+=Pattern patterns+=Pattern* transformation=Transformation "end"
		public Group getGroup() { return cGroup; }

		//"rule"
		public Keyword getRuleKeyword_0() { return cRuleKeyword_0; }

		//name=RuleId
		public Assignment getNameAssignment_1() { return cNameAssignment_1; }

		//RuleId
		public RuleCall getNameRuleIdParserRuleCall_1_0() { return cNameRuleIdParserRuleCall_1_0; }

		//patterns+=Pattern
		public Assignment getPatternsAssignment_2() { return cPatternsAssignment_2; }

		//Pattern
		public RuleCall getPatternsPatternParserRuleCall_2_0() { return cPatternsPatternParserRuleCall_2_0; }

		//patterns+=Pattern*
		public Assignment getPatternsAssignment_3() { return cPatternsAssignment_3; }

		//Pattern
		public RuleCall getPatternsPatternParserRuleCall_3_0() { return cPatternsPatternParserRuleCall_3_0; }

		//transformation=Transformation
		public Assignment getTransformationAssignment_4() { return cTransformationAssignment_4; }

		//Transformation
		public RuleCall getTransformationTransformationParserRuleCall_4_0() { return cTransformationTransformationParserRuleCall_4_0; }

		//"end"
		public Keyword getEndKeyword_5() { return cEndKeyword_5; }
	}

	public class RuleIdElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "RuleId");
		private final RuleCall cIDTerminalRuleCall = (RuleCall)rule.eContents().get(1);
		
		//RuleId returns ecore::EString:
		//	ID;
		public ParserRule getRule() { return rule; }

		//ID
		public RuleCall getIDTerminalRuleCall() { return cIDTerminalRuleCall; }
	}

	public class VariableIdElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "VariableId");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cDollarSignKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final RuleCall cIDTerminalRuleCall_1 = (RuleCall)cGroup.eContents().get(1);
		
		//VariableId returns ecore::EString:
		//	"$" ID;
		public ParserRule getRule() { return rule; }

		//"$" ID
		public Group getGroup() { return cGroup; }

		//"$"
		public Keyword getDollarSignKeyword_0() { return cDollarSignKeyword_0; }

		//ID
		public RuleCall getIDTerminalRuleCall_1() { return cIDTerminalRuleCall_1; }
	}

	public class EStringElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "EString");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final RuleCall cSTRINGTerminalRuleCall_0 = (RuleCall)cAlternatives.eContents().get(0);
		private final RuleCall cIDTerminalRuleCall_1 = (RuleCall)cAlternatives.eContents().get(1);
		
		//EString returns ecore::EString:
		//	STRING | ID;
		public ParserRule getRule() { return rule; }

		//STRING | ID
		public Alternatives getAlternatives() { return cAlternatives; }

		//STRING
		public RuleCall getSTRINGTerminalRuleCall_0() { return cSTRINGTerminalRuleCall_0; }

		//ID
		public RuleCall getIDTerminalRuleCall_1() { return cIDTerminalRuleCall_1; }
	}

	public class ExactStingElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "ExactSting");
		private final Assignment cContentAssignment = (Assignment)rule.eContents().get(1);
		private final RuleCall cContentEStringParserRuleCall_0 = (RuleCall)cContentAssignment.eContents().get(0);
		
		//ExactSting:
		//	content=EString;
		public ParserRule getRule() { return rule; }

		//content=EString
		public Assignment getContentAssignment() { return cContentAssignment; }

		//EString
		public RuleCall getContentEStringParserRuleCall_0() { return cContentEStringParserRuleCall_0; }
	}

	public class VariableElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "Variable");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Action cVariableAction_0 = (Action)cGroup.eContents().get(0);
		private final Assignment cNameAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cNameVariableIdParserRuleCall_1_0 = (RuleCall)cNameAssignment_1.eContents().get(0);
		
		//Variable:
		//	{Variable} name=VariableId;
		public ParserRule getRule() { return rule; }

		//{Variable} name=VariableId
		public Group getGroup() { return cGroup; }

		//{Variable}
		public Action getVariableAction_0() { return cVariableAction_0; }

		//name=VariableId
		public Assignment getNameAssignment_1() { return cNameAssignment_1; }

		//VariableId
		public RuleCall getNameVariableIdParserRuleCall_1_0() { return cNameVariableIdParserRuleCall_1_0; }
	}

	public class AlternationElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "Alternation");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cLeftParenthesisKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cChoicesAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cChoicesPatternParserRuleCall_1_0 = (RuleCall)cChoicesAssignment_1.eContents().get(0);
		private final Keyword cVerticalLineKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Assignment cChoicesAssignment_3 = (Assignment)cGroup.eContents().get(3);
		private final RuleCall cChoicesPatternParserRuleCall_3_0 = (RuleCall)cChoicesAssignment_3.eContents().get(0);
		private final Group cGroup_4 = (Group)cGroup.eContents().get(4);
		private final Keyword cVerticalLineKeyword_4_0 = (Keyword)cGroup_4.eContents().get(0);
		private final Assignment cChoicesAssignment_4_1 = (Assignment)cGroup_4.eContents().get(1);
		private final RuleCall cChoicesPatternParserRuleCall_4_1_0 = (RuleCall)cChoicesAssignment_4_1.eContents().get(0);
		private final Keyword cRightParenthesisKeyword_5 = (Keyword)cGroup.eContents().get(5);
		
		//Alternation:
		//	"(" choices+=Pattern "|" choices+=Pattern ("|" choices+=Pattern)* ")";
		public ParserRule getRule() { return rule; }

		//"(" choices+=Pattern "|" choices+=Pattern ("|" choices+=Pattern)* ")"
		public Group getGroup() { return cGroup; }

		//"("
		public Keyword getLeftParenthesisKeyword_0() { return cLeftParenthesisKeyword_0; }

		//choices+=Pattern
		public Assignment getChoicesAssignment_1() { return cChoicesAssignment_1; }

		//Pattern
		public RuleCall getChoicesPatternParserRuleCall_1_0() { return cChoicesPatternParserRuleCall_1_0; }

		//"|"
		public Keyword getVerticalLineKeyword_2() { return cVerticalLineKeyword_2; }

		//choices+=Pattern
		public Assignment getChoicesAssignment_3() { return cChoicesAssignment_3; }

		//Pattern
		public RuleCall getChoicesPatternParserRuleCall_3_0() { return cChoicesPatternParserRuleCall_3_0; }

		//("|" choices+=Pattern)*
		public Group getGroup_4() { return cGroup_4; }

		//"|"
		public Keyword getVerticalLineKeyword_4_0() { return cVerticalLineKeyword_4_0; }

		//choices+=Pattern
		public Assignment getChoicesAssignment_4_1() { return cChoicesAssignment_4_1; }

		//Pattern
		public RuleCall getChoicesPatternParserRuleCall_4_1_0() { return cChoicesPatternParserRuleCall_4_1_0; }

		//")"
		public Keyword getRightParenthesisKeyword_5() { return cRightParenthesisKeyword_5; }
	}

	public class OptionalElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "Optional");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cLeftSquareBracketKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cValueAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cValuePatternParserRuleCall_1_0 = (RuleCall)cValueAssignment_1.eContents().get(0);
		private final Assignment cValueAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cValuePatternParserRuleCall_2_0 = (RuleCall)cValueAssignment_2.eContents().get(0);
		private final Keyword cRightSquareBracketKeyword_3 = (Keyword)cGroup.eContents().get(3);
		
		//Optional:
		//	"[" value+=Pattern value+=Pattern* "]";
		public ParserRule getRule() { return rule; }

		//"[" value+=Pattern value+=Pattern* "]"
		public Group getGroup() { return cGroup; }

		//"["
		public Keyword getLeftSquareBracketKeyword_0() { return cLeftSquareBracketKeyword_0; }

		//value+=Pattern
		public Assignment getValueAssignment_1() { return cValueAssignment_1; }

		//Pattern
		public RuleCall getValuePatternParserRuleCall_1_0() { return cValuePatternParserRuleCall_1_0; }

		//value+=Pattern*
		public Assignment getValueAssignment_2() { return cValueAssignment_2; }

		//Pattern
		public RuleCall getValuePatternParserRuleCall_2_0() { return cValuePatternParserRuleCall_2_0; }

		//"]"
		public Keyword getRightSquareBracketKeyword_3() { return cRightSquareBracketKeyword_3; }
	}

	public class ExpressionElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "Expression");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cExprKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cValueAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cValueEStringParserRuleCall_1_0 = (RuleCall)cValueAssignment_1.eContents().get(0);
		
		//Expression:
		//	"expr" value=EString;
		public ParserRule getRule() { return rule; }

		//"expr" value=EString
		public Group getGroup() { return cGroup; }

		//"expr"
		public Keyword getExprKeyword_0() { return cExprKeyword_0; }

		//value=EString
		public Assignment getValueAssignment_1() { return cValueAssignment_1; }

		//EString
		public RuleCall getValueEStringParserRuleCall_1_0() { return cValueEStringParserRuleCall_1_0; }
	}

	public class IfDefElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "IfDef");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cIfKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Keyword cDefKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Assignment cVariablesAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cVariablesVariableIdParserRuleCall_2_0 = (RuleCall)cVariablesAssignment_2.eContents().get(0);
		private final Group cGroup_3 = (Group)cGroup.eContents().get(3);
		private final Keyword cCommaKeyword_3_0 = (Keyword)cGroup_3.eContents().get(0);
		private final Assignment cVariablesAssignment_3_1 = (Assignment)cGroup_3.eContents().get(1);
		private final RuleCall cVariablesVariableIdParserRuleCall_3_1_0 = (RuleCall)cVariablesAssignment_3_1.eContents().get(0);
		private final Keyword cThenKeyword_4 = (Keyword)cGroup.eContents().get(4);
		private final Assignment cTrue_bodyAssignment_5 = (Assignment)cGroup.eContents().get(5);
		private final RuleCall cTrue_bodyTransformationParserRuleCall_5_0 = (RuleCall)cTrue_bodyAssignment_5.eContents().get(0);
		private final Keyword cElseKeyword_6 = (Keyword)cGroup.eContents().get(6);
		private final Assignment cFalse_bodyAssignment_7 = (Assignment)cGroup.eContents().get(7);
		private final RuleCall cFalse_bodyTransformationParserRuleCall_7_0 = (RuleCall)cFalse_bodyAssignment_7.eContents().get(0);
		private final Keyword cEndKeyword_8 = (Keyword)cGroup.eContents().get(8);
		
		//IfDef:
		//	"if" "def?" variables+=VariableId ("," variables+=VariableId)* "then" true_body=Transformation "else"
		//	false_body=Transformation "end";
		public ParserRule getRule() { return rule; }

		//"if" "def?" variables+=VariableId ("," variables+=VariableId)* "then" true_body=Transformation "else"
		//false_body=Transformation "end"
		public Group getGroup() { return cGroup; }

		//"if"
		public Keyword getIfKeyword_0() { return cIfKeyword_0; }

		//"def?"
		public Keyword getDefKeyword_1() { return cDefKeyword_1; }

		//variables+=VariableId
		public Assignment getVariablesAssignment_2() { return cVariablesAssignment_2; }

		//VariableId
		public RuleCall getVariablesVariableIdParserRuleCall_2_0() { return cVariablesVariableIdParserRuleCall_2_0; }

		//("," variables+=VariableId)*
		public Group getGroup_3() { return cGroup_3; }

		//","
		public Keyword getCommaKeyword_3_0() { return cCommaKeyword_3_0; }

		//variables+=VariableId
		public Assignment getVariablesAssignment_3_1() { return cVariablesAssignment_3_1; }

		//VariableId
		public RuleCall getVariablesVariableIdParserRuleCall_3_1_0() { return cVariablesVariableIdParserRuleCall_3_1_0; }

		//"then"
		public Keyword getThenKeyword_4() { return cThenKeyword_4; }

		//true_body=Transformation
		public Assignment getTrue_bodyAssignment_5() { return cTrue_bodyAssignment_5; }

		//Transformation
		public RuleCall getTrue_bodyTransformationParserRuleCall_5_0() { return cTrue_bodyTransformationParserRuleCall_5_0; }

		//"else"
		public Keyword getElseKeyword_6() { return cElseKeyword_6; }

		//false_body=Transformation
		public Assignment getFalse_bodyAssignment_7() { return cFalse_bodyAssignment_7; }

		//Transformation
		public RuleCall getFalse_bodyTransformationParserRuleCall_7_0() { return cFalse_bodyTransformationParserRuleCall_7_0; }

		//"end"
		public Keyword getEndKeyword_8() { return cEndKeyword_8; }
	}

	public class MatchElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "Match");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cMatchKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cRuleAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final CrossReference cRuleRuleCrossReference_1_0 = (CrossReference)cRuleAssignment_1.eContents().get(0);
		private final RuleCall cRuleRuleRuleIdParserRuleCall_1_0_1 = (RuleCall)cRuleRuleCrossReference_1_0.eContents().get(1);
		private final Group cGroup_2 = (Group)cGroup.eContents().get(2);
		private final Assignment cAssignmentsAssignment_2_0 = (Assignment)cGroup_2.eContents().get(0);
		private final RuleCall cAssignmentsKeyValueParserRuleCall_2_0_0 = (RuleCall)cAssignmentsAssignment_2_0.eContents().get(0);
		private final Assignment cAssignmentsAssignment_2_1 = (Assignment)cGroup_2.eContents().get(1);
		private final RuleCall cAssignmentsKeyValueParserRuleCall_2_1_0 = (RuleCall)cAssignmentsAssignment_2_1.eContents().get(0);
		
		//Match:
		//	"match" rule=[Rule|RuleId] (assignments+=KeyValue assignments+=KeyValue*)?;
		public ParserRule getRule() { return rule; }

		//"match" rule=[Rule|RuleId] (assignments+=KeyValue assignments+=KeyValue*)?
		public Group getGroup() { return cGroup; }

		//"match"
		public Keyword getMatchKeyword_0() { return cMatchKeyword_0; }

		//rule=[Rule|RuleId]
		public Assignment getRuleAssignment_1() { return cRuleAssignment_1; }

		//[Rule|RuleId]
		public CrossReference getRuleRuleCrossReference_1_0() { return cRuleRuleCrossReference_1_0; }

		//RuleId
		public RuleCall getRuleRuleRuleIdParserRuleCall_1_0_1() { return cRuleRuleRuleIdParserRuleCall_1_0_1; }

		//(assignments+=KeyValue assignments+=KeyValue*)?
		public Group getGroup_2() { return cGroup_2; }

		//assignments+=KeyValue
		public Assignment getAssignmentsAssignment_2_0() { return cAssignmentsAssignment_2_0; }

		//KeyValue
		public RuleCall getAssignmentsKeyValueParserRuleCall_2_0_0() { return cAssignmentsKeyValueParserRuleCall_2_0_0; }

		//assignments+=KeyValue*
		public Assignment getAssignmentsAssignment_2_1() { return cAssignmentsAssignment_2_1; }

		//KeyValue
		public RuleCall getAssignmentsKeyValueParserRuleCall_2_1_0() { return cAssignmentsKeyValueParserRuleCall_2_1_0; }
	}

	public class FailElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "Fail");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Action cFailAction_0 = (Action)cGroup.eContents().get(0);
		private final Keyword cFailKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Group cGroup_2 = (Group)cGroup.eContents().get(2);
		private final Keyword cMessageKeyword_2_0 = (Keyword)cGroup_2.eContents().get(0);
		private final Assignment cMessageAssignment_2_1 = (Assignment)cGroup_2.eContents().get(1);
		private final RuleCall cMessageEStringParserRuleCall_2_1_0 = (RuleCall)cMessageAssignment_2_1.eContents().get(0);
		
		//Fail:
		//	{Fail} "fail" ("message" message=EString)?;
		public ParserRule getRule() { return rule; }

		//{Fail} "fail" ("message" message=EString)?
		public Group getGroup() { return cGroup; }

		//{Fail}
		public Action getFailAction_0() { return cFailAction_0; }

		//"fail"
		public Keyword getFailKeyword_1() { return cFailKeyword_1; }

		//("message" message=EString)?
		public Group getGroup_2() { return cGroup_2; }

		//"message"
		public Keyword getMessageKeyword_2_0() { return cMessageKeyword_2_0; }

		//message=EString
		public Assignment getMessageAssignment_2_1() { return cMessageAssignment_2_1; }

		//EString
		public RuleCall getMessageEStringParserRuleCall_2_1_0() { return cMessageEStringParserRuleCall_2_1_0; }
	}

	public class KeyValueElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "KeyValue");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Action cKeyValueAction_0 = (Action)cGroup.eContents().get(0);
		private final Assignment cKeyAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cKeyVariableIdParserRuleCall_1_0 = (RuleCall)cKeyAssignment_1.eContents().get(0);
		private final Keyword cEqualsSignKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Alternatives cAlternatives_3 = (Alternatives)cGroup.eContents().get(3);
		private final Assignment cValueAssignment_3_0 = (Assignment)cAlternatives_3.eContents().get(0);
		private final RuleCall cValueEStringParserRuleCall_3_0_0 = (RuleCall)cValueAssignment_3_0.eContents().get(0);
		private final Assignment cValueAssignment_3_1 = (Assignment)cAlternatives_3.eContents().get(1);
		private final RuleCall cValueVariableIdParserRuleCall_3_1_0 = (RuleCall)cValueAssignment_3_1.eContents().get(0);
		
		//KeyValue:
		//	{KeyValue} key=VariableId "=" (value=EString | value=VariableId);
		public ParserRule getRule() { return rule; }

		//{KeyValue} key=VariableId "=" (value=EString | value=VariableId)
		public Group getGroup() { return cGroup; }

		//{KeyValue}
		public Action getKeyValueAction_0() { return cKeyValueAction_0; }

		//key=VariableId
		public Assignment getKeyAssignment_1() { return cKeyAssignment_1; }

		//VariableId
		public RuleCall getKeyVariableIdParserRuleCall_1_0() { return cKeyVariableIdParserRuleCall_1_0; }

		//"="
		public Keyword getEqualsSignKeyword_2() { return cEqualsSignKeyword_2; }

		//value=EString | value=VariableId
		public Alternatives getAlternatives_3() { return cAlternatives_3; }

		//value=EString
		public Assignment getValueAssignment_3_0() { return cValueAssignment_3_0; }

		//EString
		public RuleCall getValueEStringParserRuleCall_3_0_0() { return cValueEStringParserRuleCall_3_0_0; }

		//value=VariableId
		public Assignment getValueAssignment_3_1() { return cValueAssignment_3_1; }

		//VariableId
		public RuleCall getValueVariableIdParserRuleCall_3_1_0() { return cValueVariableIdParserRuleCall_3_1_0; }
	}
	
	
	private TransformModel_Elements pTransformModel_;
	private PatternElements pPattern;
	private TransformationElements pTransformation;
	private BehaviorElements pBehavior;
	private RuleElements pRule;
	private RuleIdElements pRuleId;
	private VariableIdElements pVariableId;
	private EStringElements pEString;
	private ExactStingElements pExactSting;
	private VariableElements pVariable;
	private AlternationElements pAlternation;
	private OptionalElements pOptional;
	private ExpressionElements pExpression;
	private IfDefElements pIfDef;
	private MatchElements pMatch;
	private FailElements pFail;
	private KeyValueElements pKeyValue;
	
	private final Grammar grammar;

	private TerminalsGrammarAccess gaTerminals;

	@Inject
	public LettuceGrammarAccess(GrammarProvider grammarProvider,
		TerminalsGrammarAccess gaTerminals) {
		this.grammar = internalFindGrammar(grammarProvider);
		this.gaTerminals = gaTerminals;
	}
	
	protected Grammar internalFindGrammar(GrammarProvider grammarProvider) {
		Grammar grammar = grammarProvider.getGrammar(this);
		while (grammar != null) {
			if ("dk.itu.bddctransform.Lettuce".equals(grammar.getName())) {
				return grammar;
			}
			List<Grammar> grammars = grammar.getUsedGrammars();
			if (!grammars.isEmpty()) {
				grammar = grammars.iterator().next();
			} else {
				return null;
			}
		}
		return grammar;
	}
	
	
	public Grammar getGrammar() {
		return grammar;
	}
	

	public TerminalsGrammarAccess getTerminalsGrammarAccess() {
		return gaTerminals;
	}

	
	//TransformModel_:
	//	"transform" "package" name=EString (rules+=Rule | behaviors+=Behavior)+;
	public TransformModel_Elements getTransformModel_Access() {
		return (pTransformModel_ != null) ? pTransformModel_ : (pTransformModel_ = new TransformModel_Elements());
	}
	
	public ParserRule getTransformModel_Rule() {
		return getTransformModel_Access().getRule();
	}

	//Pattern:
	//	ExactSting | Variable | Alternation | Optional;
	public PatternElements getPatternAccess() {
		return (pPattern != null) ? pPattern : (pPattern = new PatternElements());
	}
	
	public ParserRule getPatternRule() {
		return getPatternAccess().getRule();
	}

	//Transformation:
	//	Expression | IfDef | Match | Fail;
	public TransformationElements getTransformationAccess() {
		return (pTransformation != null) ? pTransformation : (pTransformation = new TransformationElements());
	}
	
	public ParserRule getTransformationRule() {
		return getTransformationAccess().getRule();
	}

	//Behavior:
	//	"behavior" description=EString "class" class=EString "signature" signature=EString "end";
	public BehaviorElements getBehaviorAccess() {
		return (pBehavior != null) ? pBehavior : (pBehavior = new BehaviorElements());
	}
	
	public ParserRule getBehaviorRule() {
		return getBehaviorAccess().getRule();
	}

	//Rule:
	//	"rule" name=RuleId patterns+=Pattern patterns+=Pattern* transformation=Transformation "end";
	public RuleElements getRuleAccess() {
		return (pRule != null) ? pRule : (pRule = new RuleElements());
	}
	
	public ParserRule getRuleRule() {
		return getRuleAccess().getRule();
	}

	//RuleId returns ecore::EString:
	//	ID;
	public RuleIdElements getRuleIdAccess() {
		return (pRuleId != null) ? pRuleId : (pRuleId = new RuleIdElements());
	}
	
	public ParserRule getRuleIdRule() {
		return getRuleIdAccess().getRule();
	}

	//VariableId returns ecore::EString:
	//	"$" ID;
	public VariableIdElements getVariableIdAccess() {
		return (pVariableId != null) ? pVariableId : (pVariableId = new VariableIdElements());
	}
	
	public ParserRule getVariableIdRule() {
		return getVariableIdAccess().getRule();
	}

	//EString returns ecore::EString:
	//	STRING | ID;
	public EStringElements getEStringAccess() {
		return (pEString != null) ? pEString : (pEString = new EStringElements());
	}
	
	public ParserRule getEStringRule() {
		return getEStringAccess().getRule();
	}

	//ExactSting:
	//	content=EString;
	public ExactStingElements getExactStingAccess() {
		return (pExactSting != null) ? pExactSting : (pExactSting = new ExactStingElements());
	}
	
	public ParserRule getExactStingRule() {
		return getExactStingAccess().getRule();
	}

	//Variable:
	//	{Variable} name=VariableId;
	public VariableElements getVariableAccess() {
		return (pVariable != null) ? pVariable : (pVariable = new VariableElements());
	}
	
	public ParserRule getVariableRule() {
		return getVariableAccess().getRule();
	}

	//Alternation:
	//	"(" choices+=Pattern "|" choices+=Pattern ("|" choices+=Pattern)* ")";
	public AlternationElements getAlternationAccess() {
		return (pAlternation != null) ? pAlternation : (pAlternation = new AlternationElements());
	}
	
	public ParserRule getAlternationRule() {
		return getAlternationAccess().getRule();
	}

	//Optional:
	//	"[" value+=Pattern value+=Pattern* "]";
	public OptionalElements getOptionalAccess() {
		return (pOptional != null) ? pOptional : (pOptional = new OptionalElements());
	}
	
	public ParserRule getOptionalRule() {
		return getOptionalAccess().getRule();
	}

	//Expression:
	//	"expr" value=EString;
	public ExpressionElements getExpressionAccess() {
		return (pExpression != null) ? pExpression : (pExpression = new ExpressionElements());
	}
	
	public ParserRule getExpressionRule() {
		return getExpressionAccess().getRule();
	}

	//IfDef:
	//	"if" "def?" variables+=VariableId ("," variables+=VariableId)* "then" true_body=Transformation "else"
	//	false_body=Transformation "end";
	public IfDefElements getIfDefAccess() {
		return (pIfDef != null) ? pIfDef : (pIfDef = new IfDefElements());
	}
	
	public ParserRule getIfDefRule() {
		return getIfDefAccess().getRule();
	}

	//Match:
	//	"match" rule=[Rule|RuleId] (assignments+=KeyValue assignments+=KeyValue*)?;
	public MatchElements getMatchAccess() {
		return (pMatch != null) ? pMatch : (pMatch = new MatchElements());
	}
	
	public ParserRule getMatchRule() {
		return getMatchAccess().getRule();
	}

	//Fail:
	//	{Fail} "fail" ("message" message=EString)?;
	public FailElements getFailAccess() {
		return (pFail != null) ? pFail : (pFail = new FailElements());
	}
	
	public ParserRule getFailRule() {
		return getFailAccess().getRule();
	}

	//KeyValue:
	//	{KeyValue} key=VariableId "=" (value=EString | value=VariableId);
	public KeyValueElements getKeyValueAccess() {
		return (pKeyValue != null) ? pKeyValue : (pKeyValue = new KeyValueElements());
	}
	
	public ParserRule getKeyValueRule() {
		return getKeyValueAccess().getRule();
	}

	//terminal ID:
	//	"^"? ("a".."z" | "A".."Z" | "_") ("a".."z" | "A".."Z" | "_" | "0".."9")*;
	public TerminalRule getIDRule() {
		return gaTerminals.getIDRule();
	} 

	//terminal INT returns ecore::EInt:
	//	"0".."9"+;
	public TerminalRule getINTRule() {
		return gaTerminals.getINTRule();
	} 

	//terminal STRING:
	//	"\"" ("\\" ("b" | "t" | "n" | "f" | "r" | "u" | "\"" | "\'" | "\\") | !("\\" | "\""))* "\"" | "\'" ("\\" ("b" | "t" |
	//	"n" | "f" | "r" | "u" | "\"" | "\'" | "\\") | !("\\" | "\'"))* "\'";
	public TerminalRule getSTRINGRule() {
		return gaTerminals.getSTRINGRule();
	} 

	//terminal ML_COMMENT:
	//	"/ *"->"* /";
	public TerminalRule getML_COMMENTRule() {
		return gaTerminals.getML_COMMENTRule();
	} 

	//terminal SL_COMMENT:
	//	"//" !("\n" | "\r")* ("\r"? "\n")?;
	public TerminalRule getSL_COMMENTRule() {
		return gaTerminals.getSL_COMMENTRule();
	} 

	//terminal WS:
	//	(" " | "\t" | "\r" | "\n")+;
	public TerminalRule getWSRule() {
		return gaTerminals.getWSRule();
	} 

	//terminal ANY_OTHER:
	//	.;
	public TerminalRule getANY_OTHERRule() {
		return gaTerminals.getANY_OTHERRule();
	} 
}
