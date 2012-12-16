/*
* generated by Xtext
*/
grammar InternalLettuce;

options {
	superClass=AbstractInternalAntlrParser;
	
}

@lexer::header {
package dk.itu.bddctransform.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;
}

@parser::header {
package dk.itu.bddctransform.parser.antlr.internal; 

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import dk.itu.bddctransform.services.LettuceGrammarAccess;

}

@parser::members {

 	private LettuceGrammarAccess grammarAccess;
 	
    public InternalLettuceParser(TokenStream input, LettuceGrammarAccess grammarAccess) {
        this(input);
        this.grammarAccess = grammarAccess;
        registerRules(grammarAccess.getGrammar());
    }
    
    @Override
    protected String getFirstRuleName() {
    	return "TransformModel_";	
   	}
   	
   	@Override
   	protected LettuceGrammarAccess getGrammarAccess() {
   		return grammarAccess;
   	}
}

@rulecatch { 
    catch (RecognitionException re) { 
        recover(input,re); 
        appendSkippedTokens();
    } 
}




// Entry rule entryRuleTransformModel_
entryRuleTransformModel_ returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getTransformModel_Rule()); }
	 iv_ruleTransformModel_=ruleTransformModel_ 
	 { $current=$iv_ruleTransformModel_.current; } 
	 EOF 
;

// Rule TransformModel_
ruleTransformModel_ returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(	otherlv_0='transform' 
    {
    	newLeafNode(otherlv_0, grammarAccess.getTransformModel_Access().getTransformKeyword_0());
    }
	otherlv_1='package' 
    {
    	newLeafNode(otherlv_1, grammarAccess.getTransformModel_Access().getPackageKeyword_1());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getTransformModel_Access().getNameEStringParserRuleCall_2_0()); 
	    }
		lv_name_2_0=ruleEString		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getTransformModel_Rule());
	        }
       		set(
       			$current, 
       			"name",
        		lv_name_2_0, 
        		"EString");
	        afterParserOrEnumRuleCall();
	    }

)
)((
(
		{ 
	        newCompositeNode(grammarAccess.getTransformModel_Access().getRulesRuleParserRuleCall_3_0_0()); 
	    }
		lv_rules_3_0=ruleRule		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getTransformModel_Rule());
	        }
       		add(
       			$current, 
       			"rules",
        		lv_rules_3_0, 
        		"Rule");
	        afterParserOrEnumRuleCall();
	    }

)
)
    |(
(
		{ 
	        newCompositeNode(grammarAccess.getTransformModel_Access().getBehaviorsBehaviorParserRuleCall_3_1_0()); 
	    }
		lv_behaviors_4_0=ruleBehavior		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getTransformModel_Rule());
	        }
       		add(
       			$current, 
       			"behaviors",
        		lv_behaviors_4_0, 
        		"Behavior");
	        afterParserOrEnumRuleCall();
	    }

)
))+)
;





// Entry rule entryRulePattern
entryRulePattern returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getPatternRule()); }
	 iv_rulePattern=rulePattern 
	 { $current=$iv_rulePattern.current; } 
	 EOF 
;

// Rule Pattern
rulePattern returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(
    { 
        newCompositeNode(grammarAccess.getPatternAccess().getExactStingParserRuleCall_0()); 
    }
    this_ExactSting_0=ruleExactSting
    { 
        $current = $this_ExactSting_0.current; 
        afterParserOrEnumRuleCall();
    }

    |
    { 
        newCompositeNode(grammarAccess.getPatternAccess().getVariableParserRuleCall_1()); 
    }
    this_Variable_1=ruleVariable
    { 
        $current = $this_Variable_1.current; 
        afterParserOrEnumRuleCall();
    }

    |
    { 
        newCompositeNode(grammarAccess.getPatternAccess().getAlternationParserRuleCall_2()); 
    }
    this_Alternation_2=ruleAlternation
    { 
        $current = $this_Alternation_2.current; 
        afterParserOrEnumRuleCall();
    }

    |
    { 
        newCompositeNode(grammarAccess.getPatternAccess().getOptionalParserRuleCall_3()); 
    }
    this_Optional_3=ruleOptional
    { 
        $current = $this_Optional_3.current; 
        afterParserOrEnumRuleCall();
    }
)
;





// Entry rule entryRuleTransformation
entryRuleTransformation returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getTransformationRule()); }
	 iv_ruleTransformation=ruleTransformation 
	 { $current=$iv_ruleTransformation.current; } 
	 EOF 
;

// Rule Transformation
ruleTransformation returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(
    { 
        newCompositeNode(grammarAccess.getTransformationAccess().getExpressionParserRuleCall_0()); 
    }
    this_Expression_0=ruleExpression
    { 
        $current = $this_Expression_0.current; 
        afterParserOrEnumRuleCall();
    }

    |
    { 
        newCompositeNode(grammarAccess.getTransformationAccess().getIfDefParserRuleCall_1()); 
    }
    this_IfDef_1=ruleIfDef
    { 
        $current = $this_IfDef_1.current; 
        afterParserOrEnumRuleCall();
    }

    |
    { 
        newCompositeNode(grammarAccess.getTransformationAccess().getMatchParserRuleCall_2()); 
    }
    this_Match_2=ruleMatch
    { 
        $current = $this_Match_2.current; 
        afterParserOrEnumRuleCall();
    }

    |
    { 
        newCompositeNode(grammarAccess.getTransformationAccess().getFailParserRuleCall_3()); 
    }
    this_Fail_3=ruleFail
    { 
        $current = $this_Fail_3.current; 
        afterParserOrEnumRuleCall();
    }
)
;





// Entry rule entryRuleBehavior
entryRuleBehavior returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getBehaviorRule()); }
	 iv_ruleBehavior=ruleBehavior 
	 { $current=$iv_ruleBehavior.current; } 
	 EOF 
;

// Rule Behavior
ruleBehavior returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(	otherlv_0='behavior' 
    {
    	newLeafNode(otherlv_0, grammarAccess.getBehaviorAccess().getBehaviorKeyword_0());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getBehaviorAccess().getDescriptionEStringParserRuleCall_1_0()); 
	    }
		lv_description_1_0=ruleEString		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getBehaviorRule());
	        }
       		set(
       			$current, 
       			"description",
        		lv_description_1_0, 
        		"EString");
	        afterParserOrEnumRuleCall();
	    }

)
)	otherlv_2='class' 
    {
    	newLeafNode(otherlv_2, grammarAccess.getBehaviorAccess().getClassKeyword_2());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getBehaviorAccess().getClassEStringParserRuleCall_3_0()); 
	    }
		lv_class_3_0=ruleEString		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getBehaviorRule());
	        }
       		set(
       			$current, 
       			"class",
        		lv_class_3_0, 
        		"EString");
	        afterParserOrEnumRuleCall();
	    }

)
)	otherlv_4='signature' 
    {
    	newLeafNode(otherlv_4, grammarAccess.getBehaviorAccess().getSignatureKeyword_4());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getBehaviorAccess().getSignatureEStringParserRuleCall_5_0()); 
	    }
		lv_signature_5_0=ruleEString		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getBehaviorRule());
	        }
       		set(
       			$current, 
       			"signature",
        		lv_signature_5_0, 
        		"EString");
	        afterParserOrEnumRuleCall();
	    }

)
)	otherlv_6='end' 
    {
    	newLeafNode(otherlv_6, grammarAccess.getBehaviorAccess().getEndKeyword_6());
    }
)
;





// Entry rule entryRuleRule
entryRuleRule returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getRuleRule()); }
	 iv_ruleRule=ruleRule 
	 { $current=$iv_ruleRule.current; } 
	 EOF 
;

// Rule Rule
ruleRule returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(	otherlv_0='rule' 
    {
    	newLeafNode(otherlv_0, grammarAccess.getRuleAccess().getRuleKeyword_0());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getRuleAccess().getNameRuleIdParserRuleCall_1_0()); 
	    }
		lv_name_1_0=ruleRuleId		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getRuleRule());
	        }
       		set(
       			$current, 
       			"name",
        		lv_name_1_0, 
        		"RuleId");
	        afterParserOrEnumRuleCall();
	    }

)
)(
(
		{ 
	        newCompositeNode(grammarAccess.getRuleAccess().getPatternsPatternParserRuleCall_2_0()); 
	    }
		lv_patterns_2_0=rulePattern		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getRuleRule());
	        }
       		add(
       			$current, 
       			"patterns",
        		lv_patterns_2_0, 
        		"Pattern");
	        afterParserOrEnumRuleCall();
	    }

)
)(
(
		{ 
	        newCompositeNode(grammarAccess.getRuleAccess().getPatternsPatternParserRuleCall_3_0()); 
	    }
		lv_patterns_3_0=rulePattern		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getRuleRule());
	        }
       		add(
       			$current, 
       			"patterns",
        		lv_patterns_3_0, 
        		"Pattern");
	        afterParserOrEnumRuleCall();
	    }

)
)*(
(
		{ 
	        newCompositeNode(grammarAccess.getRuleAccess().getTransformationTransformationParserRuleCall_4_0()); 
	    }
		lv_transformation_4_0=ruleTransformation		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getRuleRule());
	        }
       		set(
       			$current, 
       			"transformation",
        		lv_transformation_4_0, 
        		"Transformation");
	        afterParserOrEnumRuleCall();
	    }

)
)	otherlv_5='end' 
    {
    	newLeafNode(otherlv_5, grammarAccess.getRuleAccess().getEndKeyword_5());
    }
)
;





// Entry rule entryRuleRuleId
entryRuleRuleId returns [String current=null] 
	:
	{ newCompositeNode(grammarAccess.getRuleIdRule()); } 
	 iv_ruleRuleId=ruleRuleId 
	 { $current=$iv_ruleRuleId.current.getText(); }  
	 EOF 
;

// Rule RuleId
ruleRuleId returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
    this_ID_0=RULE_ID    {
		$current.merge(this_ID_0);
    }

    { 
    newLeafNode(this_ID_0, grammarAccess.getRuleIdAccess().getIDTerminalRuleCall()); 
    }

    ;





// Entry rule entryRuleVariableId
entryRuleVariableId returns [String current=null] 
	:
	{ newCompositeNode(grammarAccess.getVariableIdRule()); } 
	 iv_ruleVariableId=ruleVariableId 
	 { $current=$iv_ruleVariableId.current.getText(); }  
	 EOF 
;

// Rule VariableId
ruleVariableId returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(
	kw='$' 
    {
        $current.merge(kw);
        newLeafNode(kw, grammarAccess.getVariableIdAccess().getDollarSignKeyword_0()); 
    }
    this_ID_1=RULE_ID    {
		$current.merge(this_ID_1);
    }

    { 
    newLeafNode(this_ID_1, grammarAccess.getVariableIdAccess().getIDTerminalRuleCall_1()); 
    }
)
    ;





// Entry rule entryRuleEString
entryRuleEString returns [String current=null] 
	:
	{ newCompositeNode(grammarAccess.getEStringRule()); } 
	 iv_ruleEString=ruleEString 
	 { $current=$iv_ruleEString.current.getText(); }  
	 EOF 
;

// Rule EString
ruleEString returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(    this_STRING_0=RULE_STRING    {
		$current.merge(this_STRING_0);
    }

    { 
    newLeafNode(this_STRING_0, grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 
    }

    |    this_ID_1=RULE_ID    {
		$current.merge(this_ID_1);
    }

    { 
    newLeafNode(this_ID_1, grammarAccess.getEStringAccess().getIDTerminalRuleCall_1()); 
    }
)
    ;





// Entry rule entryRuleExactSting
entryRuleExactSting returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getExactStingRule()); }
	 iv_ruleExactSting=ruleExactSting 
	 { $current=$iv_ruleExactSting.current; } 
	 EOF 
;

// Rule ExactSting
ruleExactSting returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(
(
		{ 
	        newCompositeNode(grammarAccess.getExactStingAccess().getContentEStringParserRuleCall_0()); 
	    }
		lv_content_0_0=ruleEString		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getExactStingRule());
	        }
       		set(
       			$current, 
       			"content",
        		lv_content_0_0, 
        		"EString");
	        afterParserOrEnumRuleCall();
	    }

)
)
;





// Entry rule entryRuleVariable
entryRuleVariable returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getVariableRule()); }
	 iv_ruleVariable=ruleVariable 
	 { $current=$iv_ruleVariable.current; } 
	 EOF 
;

// Rule Variable
ruleVariable returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
((
    {
        $current = forceCreateModelElement(
            grammarAccess.getVariableAccess().getVariableAction_0(),
            $current);
    }
)(
(
		{ 
	        newCompositeNode(grammarAccess.getVariableAccess().getNameVariableIdParserRuleCall_1_0()); 
	    }
		lv_name_1_0=ruleVariableId		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getVariableRule());
	        }
       		set(
       			$current, 
       			"name",
        		lv_name_1_0, 
        		"VariableId");
	        afterParserOrEnumRuleCall();
	    }

)
))
;





// Entry rule entryRuleAlternation
entryRuleAlternation returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getAlternationRule()); }
	 iv_ruleAlternation=ruleAlternation 
	 { $current=$iv_ruleAlternation.current; } 
	 EOF 
;

// Rule Alternation
ruleAlternation returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(	otherlv_0='(' 
    {
    	newLeafNode(otherlv_0, grammarAccess.getAlternationAccess().getLeftParenthesisKeyword_0());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getAlternationAccess().getChoicesPatternParserRuleCall_1_0()); 
	    }
		lv_choices_1_0=rulePattern		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getAlternationRule());
	        }
       		add(
       			$current, 
       			"choices",
        		lv_choices_1_0, 
        		"Pattern");
	        afterParserOrEnumRuleCall();
	    }

)
)	otherlv_2='|' 
    {
    	newLeafNode(otherlv_2, grammarAccess.getAlternationAccess().getVerticalLineKeyword_2());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getAlternationAccess().getChoicesPatternParserRuleCall_3_0()); 
	    }
		lv_choices_3_0=rulePattern		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getAlternationRule());
	        }
       		add(
       			$current, 
       			"choices",
        		lv_choices_3_0, 
        		"Pattern");
	        afterParserOrEnumRuleCall();
	    }

)
)(	otherlv_4='|' 
    {
    	newLeafNode(otherlv_4, grammarAccess.getAlternationAccess().getVerticalLineKeyword_4_0());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getAlternationAccess().getChoicesPatternParserRuleCall_4_1_0()); 
	    }
		lv_choices_5_0=rulePattern		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getAlternationRule());
	        }
       		add(
       			$current, 
       			"choices",
        		lv_choices_5_0, 
        		"Pattern");
	        afterParserOrEnumRuleCall();
	    }

)
))*	otherlv_6=')' 
    {
    	newLeafNode(otherlv_6, grammarAccess.getAlternationAccess().getRightParenthesisKeyword_5());
    }
)
;





// Entry rule entryRuleOptional
entryRuleOptional returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getOptionalRule()); }
	 iv_ruleOptional=ruleOptional 
	 { $current=$iv_ruleOptional.current; } 
	 EOF 
;

// Rule Optional
ruleOptional returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(	otherlv_0='[' 
    {
    	newLeafNode(otherlv_0, grammarAccess.getOptionalAccess().getLeftSquareBracketKeyword_0());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getOptionalAccess().getValuePatternParserRuleCall_1_0()); 
	    }
		lv_value_1_0=rulePattern		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getOptionalRule());
	        }
       		add(
       			$current, 
       			"value",
        		lv_value_1_0, 
        		"Pattern");
	        afterParserOrEnumRuleCall();
	    }

)
)(
(
		{ 
	        newCompositeNode(grammarAccess.getOptionalAccess().getValuePatternParserRuleCall_2_0()); 
	    }
		lv_value_2_0=rulePattern		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getOptionalRule());
	        }
       		add(
       			$current, 
       			"value",
        		lv_value_2_0, 
        		"Pattern");
	        afterParserOrEnumRuleCall();
	    }

)
)*	otherlv_3=']' 
    {
    	newLeafNode(otherlv_3, grammarAccess.getOptionalAccess().getRightSquareBracketKeyword_3());
    }
)
;





// Entry rule entryRuleExpression
entryRuleExpression returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getExpressionRule()); }
	 iv_ruleExpression=ruleExpression 
	 { $current=$iv_ruleExpression.current; } 
	 EOF 
;

// Rule Expression
ruleExpression returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(	otherlv_0='expr' 
    {
    	newLeafNode(otherlv_0, grammarAccess.getExpressionAccess().getExprKeyword_0());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getExpressionAccess().getValueEStringParserRuleCall_1_0()); 
	    }
		lv_value_1_0=ruleEString		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getExpressionRule());
	        }
       		set(
       			$current, 
       			"value",
        		lv_value_1_0, 
        		"EString");
	        afterParserOrEnumRuleCall();
	    }

)
))
;





// Entry rule entryRuleIfDef
entryRuleIfDef returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getIfDefRule()); }
	 iv_ruleIfDef=ruleIfDef 
	 { $current=$iv_ruleIfDef.current; } 
	 EOF 
;

// Rule IfDef
ruleIfDef returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(	otherlv_0='if' 
    {
    	newLeafNode(otherlv_0, grammarAccess.getIfDefAccess().getIfKeyword_0());
    }
	otherlv_1='def?' 
    {
    	newLeafNode(otherlv_1, grammarAccess.getIfDefAccess().getDefKeyword_1());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getIfDefAccess().getVariablesVariableIdParserRuleCall_2_0()); 
	    }
		lv_variables_2_0=ruleVariableId		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getIfDefRule());
	        }
       		add(
       			$current, 
       			"variables",
        		lv_variables_2_0, 
        		"VariableId");
	        afterParserOrEnumRuleCall();
	    }

)
)(	otherlv_3=',' 
    {
    	newLeafNode(otherlv_3, grammarAccess.getIfDefAccess().getCommaKeyword_3_0());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getIfDefAccess().getVariablesVariableIdParserRuleCall_3_1_0()); 
	    }
		lv_variables_4_0=ruleVariableId		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getIfDefRule());
	        }
       		add(
       			$current, 
       			"variables",
        		lv_variables_4_0, 
        		"VariableId");
	        afterParserOrEnumRuleCall();
	    }

)
))*	otherlv_5='then' 
    {
    	newLeafNode(otherlv_5, grammarAccess.getIfDefAccess().getThenKeyword_4());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getIfDefAccess().getTrue_bodyTransformationParserRuleCall_5_0()); 
	    }
		lv_true_body_6_0=ruleTransformation		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getIfDefRule());
	        }
       		set(
       			$current, 
       			"true_body",
        		lv_true_body_6_0, 
        		"Transformation");
	        afterParserOrEnumRuleCall();
	    }

)
)	otherlv_7='else' 
    {
    	newLeafNode(otherlv_7, grammarAccess.getIfDefAccess().getElseKeyword_6());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getIfDefAccess().getFalse_bodyTransformationParserRuleCall_7_0()); 
	    }
		lv_false_body_8_0=ruleTransformation		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getIfDefRule());
	        }
       		set(
       			$current, 
       			"false_body",
        		lv_false_body_8_0, 
        		"Transformation");
	        afterParserOrEnumRuleCall();
	    }

)
)	otherlv_9='end' 
    {
    	newLeafNode(otherlv_9, grammarAccess.getIfDefAccess().getEndKeyword_8());
    }
)
;





// Entry rule entryRuleMatch
entryRuleMatch returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getMatchRule()); }
	 iv_ruleMatch=ruleMatch 
	 { $current=$iv_ruleMatch.current; } 
	 EOF 
;

// Rule Match
ruleMatch returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(	otherlv_0='match' 
    {
    	newLeafNode(otherlv_0, grammarAccess.getMatchAccess().getMatchKeyword_0());
    }
(
(
		{
			if ($current==null) {
	            $current = createModelElement(grammarAccess.getMatchRule());
	        }
        }
		{ 
	        newCompositeNode(grammarAccess.getMatchAccess().getRuleRuleCrossReference_1_0()); 
	    }
		ruleRuleId		{ 
	        afterParserOrEnumRuleCall();
	    }

)
)((
(
		{ 
	        newCompositeNode(grammarAccess.getMatchAccess().getAssignmentsKeyValueParserRuleCall_2_0_0()); 
	    }
		lv_assignments_2_0=ruleKeyValue		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getMatchRule());
	        }
       		add(
       			$current, 
       			"assignments",
        		lv_assignments_2_0, 
        		"KeyValue");
	        afterParserOrEnumRuleCall();
	    }

)
)(
(
		{ 
	        newCompositeNode(grammarAccess.getMatchAccess().getAssignmentsKeyValueParserRuleCall_2_1_0()); 
	    }
		lv_assignments_3_0=ruleKeyValue		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getMatchRule());
	        }
       		add(
       			$current, 
       			"assignments",
        		lv_assignments_3_0, 
        		"KeyValue");
	        afterParserOrEnumRuleCall();
	    }

)
)*)?)
;





// Entry rule entryRuleFail
entryRuleFail returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getFailRule()); }
	 iv_ruleFail=ruleFail 
	 { $current=$iv_ruleFail.current; } 
	 EOF 
;

// Rule Fail
ruleFail returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
((
    {
        $current = forceCreateModelElement(
            grammarAccess.getFailAccess().getFailAction_0(),
            $current);
    }
)	otherlv_1='fail' 
    {
    	newLeafNode(otherlv_1, grammarAccess.getFailAccess().getFailKeyword_1());
    }
(	otherlv_2='message' 
    {
    	newLeafNode(otherlv_2, grammarAccess.getFailAccess().getMessageKeyword_2_0());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getFailAccess().getMessageEStringParserRuleCall_2_1_0()); 
	    }
		lv_message_3_0=ruleEString		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getFailRule());
	        }
       		set(
       			$current, 
       			"message",
        		lv_message_3_0, 
        		"EString");
	        afterParserOrEnumRuleCall();
	    }

)
))?)
;





// Entry rule entryRuleKeyValue
entryRuleKeyValue returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getKeyValueRule()); }
	 iv_ruleKeyValue=ruleKeyValue 
	 { $current=$iv_ruleKeyValue.current; } 
	 EOF 
;

// Rule KeyValue
ruleKeyValue returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
((
    {
        $current = forceCreateModelElement(
            grammarAccess.getKeyValueAccess().getKeyValueAction_0(),
            $current);
    }
)(
(
		{ 
	        newCompositeNode(grammarAccess.getKeyValueAccess().getKeyVariableIdParserRuleCall_1_0()); 
	    }
		lv_key_1_0=ruleVariableId		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getKeyValueRule());
	        }
       		set(
       			$current, 
       			"key",
        		lv_key_1_0, 
        		"VariableId");
	        afterParserOrEnumRuleCall();
	    }

)
)	otherlv_2='=' 
    {
    	newLeafNode(otherlv_2, grammarAccess.getKeyValueAccess().getEqualsSignKeyword_2());
    }
((
(
		{ 
	        newCompositeNode(grammarAccess.getKeyValueAccess().getValueEStringParserRuleCall_3_0_0()); 
	    }
		lv_value_3_0=ruleEString		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getKeyValueRule());
	        }
       		set(
       			$current, 
       			"value",
        		lv_value_3_0, 
        		"EString");
	        afterParserOrEnumRuleCall();
	    }

)
)
    |(
(
		{ 
	        newCompositeNode(grammarAccess.getKeyValueAccess().getValueVariableIdParserRuleCall_3_1_0()); 
	    }
		lv_value_4_0=ruleVariableId		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getKeyValueRule());
	        }
       		set(
       			$current, 
       			"value",
        		lv_value_4_0, 
        		"VariableId");
	        afterParserOrEnumRuleCall();
	    }

)
)))
;





RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

RULE_INT : ('0'..'9')+;

RULE_STRING : ('"' ('\\' ('b'|'t'|'n'|'f'|'r'|'u'|'"'|'\''|'\\')|~(('\\'|'"')))* '"'|'\'' ('\\' ('b'|'t'|'n'|'f'|'r'|'u'|'"'|'\''|'\\')|~(('\\'|'\'')))* '\'');

RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

RULE_WS : (' '|'\t'|'\r'|'\n')+;

RULE_ANY_OTHER : .;

