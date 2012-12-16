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



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalLettuceParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'transform'", "'package'", "'behavior'", "'class'", "'signature'", "'end'", "'rule'", "'$'", "'('", "'|'", "')'", "'['", "']'", "'expr'", "'if'", "'def?'", "','", "'then'", "'else'", "'match'", "'fail'", "'message'", "'='"
    };
    public static final int RULE_ID=4;
    public static final int T__29=29;
    public static final int T__28=28;
    public static final int T__27=27;
    public static final int T__26=26;
    public static final int T__25=25;
    public static final int T__24=24;
    public static final int T__23=23;
    public static final int T__22=22;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__21=21;
    public static final int T__20=20;
    public static final int RULE_SL_COMMENT=8;
    public static final int EOF=-1;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__30=30;
    public static final int T__19=19;
    public static final int T__31=31;
    public static final int RULE_STRING=5;
    public static final int T__32=32;
    public static final int T__33=33;
    public static final int T__16=16;
    public static final int T__15=15;
    public static final int T__18=18;
    public static final int T__17=17;
    public static final int T__12=12;
    public static final int T__11=11;
    public static final int T__14=14;
    public static final int T__13=13;
    public static final int RULE_INT=6;
    public static final int RULE_WS=9;

    // delegates
    // delegators


        public InternalLettuceParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalLettuceParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalLettuceParser.tokenNames; }
    public String getGrammarFileName() { return "../dk.itu.bddtransform/src-gen/dk/itu/bddctransform/parser/antlr/internal/InternalLettuce.g"; }



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



    // $ANTLR start "entryRuleTransformModel_"
    // ../dk.itu.bddtransform/src-gen/dk/itu/bddctransform/parser/antlr/internal/InternalLettuce.g:67:1: entryRuleTransformModel_ returns [EObject current=null] : iv_ruleTransformModel_= ruleTransformModel_ EOF ;
    public final EObject entryRuleTransformModel_() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTransformModel_ = null;


        try {
            // ../dk.itu.bddtransform/src-gen/dk/itu/bddctransform/parser/antlr/internal/InternalLettuce.g:68:2: (iv_ruleTransformModel_= ruleTransformModel_ EOF )
            // ../dk.itu.bddtransform/src-gen/dk/itu/bddctransform/parser/antlr/internal/InternalLettuce.g:69:2: iv_ruleTransformModel_= ruleTransformModel_ EOF
            {
             newCompositeNode(grammarAccess.getTransformModel_Rule()); 
            pushFollow(FollowSets000.FOLLOW_ruleTransformModel__in_entryRuleTransformModel_75);
            iv_ruleTransformModel_=ruleTransformModel_();

            state._fsp--;

             current =iv_ruleTransformModel_; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleTransformModel_85); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleTransformModel_"


    // $ANTLR start "ruleTransformModel_"
    // ../dk.itu.bddtransform/src-gen/dk/itu/bddctransform/parser/antlr/internal/InternalLettuce.g:76:1: ruleTransformModel_ returns [EObject current=null] : (otherlv_0= 'transform' otherlv_1= 'package' ( (lv_name_2_0= ruleEString ) ) ( ( (lv_rules_3_0= ruleRule ) ) | ( (lv_behaviors_4_0= ruleBehavior ) ) )+ ) ;
    public final EObject ruleTransformModel_() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        EObject lv_rules_3_0 = null;

        EObject lv_behaviors_4_0 = null;


         enterRule(); 
            
        try {
            // ../dk.itu.bddtransform/src-gen/dk/itu/bddctransform/parser/antlr/internal/InternalLettuce.g:79:28: ( (otherlv_0= 'transform' otherlv_1= 'package' ( (lv_name_2_0= ruleEString ) ) ( ( (lv_rules_3_0= ruleRule ) ) | ( (lv_behaviors_4_0= ruleBehavior ) ) )+ ) )
            // ../dk.itu.bddtransform/src-gen/dk/itu/bddctransform/parser/antlr/internal/InternalLettuce.g:80:1: (otherlv_0= 'transform' otherlv_1= 'package' ( (lv_name_2_0= ruleEString ) ) ( ( (lv_rules_3_0= ruleRule ) ) | ( (lv_behaviors_4_0= ruleBehavior ) ) )+ )
            {
            // ../dk.itu.bddtransform/src-gen/dk/itu/bddctransform/parser/antlr/internal/InternalLettuce.g:80:1: (otherlv_0= 'transform' otherlv_1= 'package' ( (lv_name_2_0= ruleEString ) ) ( ( (lv_rules_3_0= ruleRule ) ) | ( (lv_behaviors_4_0= ruleBehavior ) ) )+ )
            // ../dk.itu.bddtransform/src-gen/dk/itu/bddctransform/parser/antlr/internal/InternalLettuce.g:80:3: otherlv_0= 'transform' otherlv_1= 'package' ( (lv_name_2_0= ruleEString ) ) ( ( (lv_rules_3_0= ruleRule ) ) | ( (lv_behaviors_4_0= ruleBehavior ) ) )+
            {
            otherlv_0=(Token)match(input,11,FollowSets000.FOLLOW_11_in_ruleTransformModel_122); 

                	newLeafNode(otherlv_0, grammarAccess.getTransformModel_Access().getTransformKeyword_0());
                
            otherlv_1=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleTransformModel_134); 

                	newLeafNode(otherlv_1, grammarAccess.getTransformModel_Access().getPackageKeyword_1());
                
            // ../dk.itu.bddtransform/src-gen/dk/itu/bddctransform/parser/antlr/internal/InternalLettuce.g:88:1: ( (lv_name_2_0= ruleEString ) )
            // ../dk.itu.bddtransform/src-gen/dk/itu/bddctransform/parser/antlr/internal/InternalLettuce.g:89:1: (lv_name_2_0= ruleEString )
            {
            // ../dk.itu.bddtransform/src-gen/dk/itu/bddctransform/parser/antlr/internal/InternalLettuce.g:89:1: (lv_name_2_0= ruleEString )
            // ../dk.itu.bddtransform/src-gen/dk/itu/bddctransform/parser/antlr/internal/InternalLettuce.g:90:3: lv_name_2_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getTransformModel_Access().getNameEStringParserRuleCall_2_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleTransformModel_155);
            lv_name_2_0=ruleEString();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getTransformModel_Rule());
            	        }
                   		set(
                   			current, 
                   			"name",
                    		lv_name_2_0, 
                    		"EString");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../dk.itu.bddtransform/src-gen/dk/itu/bddctransform/parser/antlr/internal/InternalLettuce.g:106:2: ( ( (lv_rules_3_0= ruleRule ) ) | ( (lv_behaviors_4_0= ruleBehavior ) ) )+
            int cnt1=0;
            loop1:
            do {
                int alt1=3;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==17) ) {
                    alt1=1;
                }
                else if ( (LA1_0==13) ) {
                    alt1=2;
                }


                switch (alt1) {
            	case 1 :
            	    // ../dk.itu.bddtransform/src-gen/dk/itu/bddctransform/parser/antlr/internal/InternalLettuce.g:106:3: ( (lv_rules_3_0= ruleRule ) )
            	    {
            	    // ../dk.itu.bddtransform/src-gen/dk/itu/bddctransform/parser/antlr/internal/InternalLettuce.g:106:3: ( (lv_rules_3_0= ruleRule ) )
            	    // ../dk.itu.bddtransform/src-gen/dk/itu/bddctransform/parser/antlr/internal/InternalLettuce.g:107:1: (lv_rules_3_0= ruleRule )
            	    {
            	    // ../dk.itu.bddtransform/src-gen/dk/itu/bddctransform/parser/antlr/internal/InternalLettuce.g:107:1: (lv_rules_3_0= ruleRule )
            	    // ../dk.itu.bddtransform/src-gen/dk/itu/bddctransform/parser/antlr/internal/InternalLettuce.g:108:3: lv_rules_3_0= ruleRule
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getTransformModel_Access().getRulesRuleParserRuleCall_3_0_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_ruleRule_in_ruleTransformModel_177);
            	    lv_rules_3_0=ruleRule();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getTransformModel_Rule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"rules",
            	            		lv_rules_3_0, 
            	            		"Rule");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // ../dk.itu.bddtransform/src-gen/dk/itu/bddctransform/parser/antlr/internal/InternalLettuce.g:125:6: ( (lv_behaviors_4_0= ruleBehavior ) )
            	    {
            	    // ../dk.itu.bddtransform/src-gen/dk/itu/bddctransform/parser/antlr/internal/InternalLettuce.g:125:6: ( (lv_behaviors_4_0= ruleBehavior ) )
            	    // ../dk.itu.bddtransform/src-gen/dk/itu/bddctransform/parser/antlr/internal/InternalLettuce.g:126:1: (lv_behaviors_4_0= ruleBehavior )
            	    {
            	    // ../dk.itu.bddtransform/src-gen/dk/itu/bddctransform/parser/antlr/internal/InternalLettuce.g:126:1: (lv_behaviors_4_0= ruleBehavior )
            	    // ../dk.itu.bddtransform/src-gen/dk/itu/bddctransform/parser/antlr/internal/InternalLettuce.g:127:3: lv_behaviors_4_0= ruleBehavior
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getTransformModel_Access().getBehaviorsBehaviorParserRuleCall_3_1_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_ruleBehavior_in_ruleTransformModel_204);
            	    lv_behaviors_4_0=ruleBehavior();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getTransformModel_Rule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"behaviors",
            	            		lv_behaviors_4_0, 
            	            		"Behavior");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt1 >= 1 ) break loop1;
                        EarlyExitException eee =
                            new EarlyExitException(1, input);
                        throw eee;
                }
                cnt1++;
            } while (true);


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTransformModel_"


    // $ANTLR start "entryRulePattern"
    // ../dk.itu.bddtransform/src-gen/dk/itu/bddctransform/parser/antlr/internal/InternalLettuce.g:151:1: entryRulePattern returns [EObject current=null] : iv_rulePattern= rulePattern EOF ;
    public final EObject entryRulePattern() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePattern = null;


        try {
            // ../dk.itu.bddtransform/src-gen/dk/itu/bddctransform/parser/antlr/internal/InternalLettuce.g:152:2: (iv_rulePattern= rulePattern EOF )
            // ../dk.itu.bddtransform/src-gen/dk/itu/bddctransform/parser/antlr/internal/InternalLettuce.g:153:2: iv_rulePattern= rulePattern EOF
            {
             newCompositeNode(grammarAccess.getPatternRule()); 
            pushFollow(FollowSets000.FOLLOW_rulePattern_in_entryRulePattern242);
            iv_rulePattern=rulePattern();

            state._fsp--;

             current =iv_rulePattern; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRulePattern252); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePattern"


    // $ANTLR start "rulePattern"
    // ../dk.itu.bddtransform/src-gen/dk/itu/bddctransform/parser/antlr/internal/InternalLettuce.g:160:1: rulePattern returns [EObject current=null] : (this_ExactSting_0= ruleExactSting | this_Variable_1= ruleVariable | this_Alternation_2= ruleAlternation | this_Optional_3= ruleOptional ) ;
    public final EObject rulePattern() throws RecognitionException {
        EObject current = null;

        EObject this_ExactSting_0 = null;

        EObject this_Variable_1 = null;

        EObject this_Alternation_2 = null;

        EObject this_Optional_3 = null;


         enterRule(); 
            
        try {
            // ../dk.itu.bddtransform/src-gen/dk/itu/bddctransform/parser/antlr/internal/InternalLettuce.g:163:28: ( (this_ExactSting_0= ruleExactSting | this_Variable_1= ruleVariable | this_Alternation_2= ruleAlternation | this_Optional_3= ruleOptional ) )
            // ../dk.itu.bddtransform/src-gen/dk/itu/bddctransform/parser/antlr/internal/InternalLettuce.g:164:1: (this_ExactSting_0= ruleExactSting | this_Variable_1= ruleVariable | this_Alternation_2= ruleAlternation | this_Optional_3= ruleOptional )
            {
            // ../dk.itu.bddtransform/src-gen/dk/itu/bddctransform/parser/antlr/internal/InternalLettuce.g:164:1: (this_ExactSting_0= ruleExactSting | this_Variable_1= ruleVariable | this_Alternation_2= ruleAlternation | this_Optional_3= ruleOptional )
            int alt2=4;
            switch ( input.LA(1) ) {
            case RULE_ID:
            case RULE_STRING:
                {
                alt2=1;
                }
                break;
            case 18:
                {
                alt2=2;
                }
                break;
            case 19:
                {
                alt2=3;
                }
                break;
            case 22:
                {
                alt2=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }

            switch (alt2) {
                case 1 :
                    // ../dk.itu.bddtransform/src-gen/dk/itu/bddctransform/parser/antlr/internal/InternalLettuce.g:165:5: this_ExactSting_0= ruleExactSting
                    {
                     
                            newCompositeNode(grammarAccess.getPatternAccess().getExactStingParserRuleCall_0()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleExactSting_in_rulePattern299);
                    this_ExactSting_0=ruleExactSting();

                    state._fsp--;

                     
                            current = this_ExactSting_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../dk.itu.bddtransform/src-gen/dk/itu/bddctransform/parser/antlr/internal/InternalLettuce.g:175:5: this_Variable_1= ruleVariable
                    {
                     
                            newCompositeNode(grammarAccess.getPatternAccess().getVariableParserRuleCall_1()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleVariable_in_rulePattern326);
                    this_Variable_1=ruleVariable();

                    state._fsp--;

                     
                            current = this_Variable_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // ../dk.itu.bddtransform/src-gen/dk/itu/bddctransform/parser/antlr/internal/InternalLettuce.g:185:5: this_Alternation_2= ruleAlternation
                    {
                     
                            newCompositeNode(grammarAccess.getPatternAccess().getAlternationParserRuleCall_2()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleAlternation_in_rulePattern353);
                    this_Alternation_2=ruleAlternation();

                    state._fsp--;

                     
                            current = this_Alternation_2; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 4 :
                    // ../dk.itu.bddtransform/src-gen/dk/itu/bddctransform/parser/antlr/internal/InternalLettuce.g:195:5: this_Optional_3= ruleOptional
                    {
                     
                            newCompositeNode(grammarAccess.getPatternAccess().getOptionalParserRuleCall_3()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleOptional_in_rulePattern380);
                    this_Optional_3=ruleOptional();

                    state._fsp--;

                     
                            current = this_Optional_3; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePattern"


    // $ANTLR start "entryRuleTransformation"
    // ../dk.itu.bddtransform/src-gen/dk/itu/bddctransform/parser/antlr/internal/InternalLettuce.g:211:1: entryRuleTransformation returns [EObject current=null] : iv_ruleTransformation= ruleTransformation EOF ;
    public final EObject entryRuleTransformation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTransformation = null;


        try {
            // ../dk.itu.bddtransform/src-gen/dk/itu/bddctransform/parser/antlr/internal/InternalLettuce.g:212:2: (iv_ruleTransformation= ruleTransformation EOF )
            // ../dk.itu.bddtransform/src-gen/dk/itu/bddctransform/parser/antlr/internal/InternalLettuce.g:213:2: iv_ruleTransformation= ruleTransformation EOF
            {
             newCompositeNode(grammarAccess.getTransformationRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleTransformation_in_entryRuleTransformation415);
            iv_ruleTransformation=ruleTransformation();

            state._fsp--;

             current =iv_ruleTransformation; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleTransformation425); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleTransformation"


    // $ANTLR start "ruleTransformation"
    // ../dk.itu.bddtransform/src-gen/dk/itu/bddctransform/parser/antlr/internal/InternalLettuce.g:220:1: ruleTransformation returns [EObject current=null] : (this_Expression_0= ruleExpression | this_IfDef_1= ruleIfDef | this_Match_2= ruleMatch | this_Fail_3= ruleFail ) ;
    public final EObject ruleTransformation() throws RecognitionException {
        EObject current = null;

        EObject this_Expression_0 = null;

        EObject this_IfDef_1 = null;

        EObject this_Match_2 = null;

        EObject this_Fail_3 = null;


         enterRule(); 
            
        try {
            // ../dk.itu.bddtransform/src-gen/dk/itu/bddctransform/parser/antlr/internal/InternalLettuce.g:223:28: ( (this_Expression_0= ruleExpression | this_IfDef_1= ruleIfDef | this_Match_2= ruleMatch | this_Fail_3= ruleFail ) )
            // ../dk.itu.bddtransform/src-gen/dk/itu/bddctransform/parser/antlr/internal/InternalLettuce.g:224:1: (this_Expression_0= ruleExpression | this_IfDef_1= ruleIfDef | this_Match_2= ruleMatch | this_Fail_3= ruleFail )
            {
            // ../dk.itu.bddtransform/src-gen/dk/itu/bddctransform/parser/antlr/internal/InternalLettuce.g:224:1: (this_Expression_0= ruleExpression | this_IfDef_1= ruleIfDef | this_Match_2= ruleMatch | this_Fail_3= ruleFail )
            int alt3=4;
            switch ( input.LA(1) ) {
            case 24:
                {
                alt3=1;
                }
                break;
            case 25:
                {
                alt3=2;
                }
                break;
            case 30:
                {
                alt3=3;
                }
                break;
            case 31:
                {
                alt3=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }

            switch (alt3) {
                case 1 :
                    // ../dk.itu.bddtransform/src-gen/dk/itu/bddctransform/parser/antlr/internal/InternalLettuce.g:225:5: this_Expression_0= ruleExpression
                    {
                     
                            newCompositeNode(grammarAccess.getTransformationAccess().getExpressionParserRuleCall_0()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleExpression_in_ruleTransformation472);
                    this_Expression_0=ruleExpression();

                    state._fsp--;

                     
                            current = this_Expression_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../dk.itu.bddtransform/src-gen/dk/itu/bddctransform/parser/antlr/internal/InternalLettuce.g:235:5: this_IfDef_1= ruleIfDef
                    {
                     
                            newCompositeNode(grammarAccess.getTransformationAccess().getIfDefParserRuleCall_1()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleIfDef_in_ruleTransformation499);
                    this_IfDef_1=ruleIfDef();

                    state._fsp--;

                     
                            current = this_IfDef_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // ../dk.itu.bddtransform/src-gen/dk/itu/bddctransform/parser/antlr/internal/InternalLettuce.g:245:5: this_Match_2= ruleMatch
                    {
                     
                            newCompositeNode(grammarAccess.getTransformationAccess().getMatchParserRuleCall_2()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleMatch_in_ruleTransformation526);
                    this_Match_2=ruleMatch();

                    state._fsp--;

                     
                            current = this_Match_2; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 4 :
                    // ../dk.itu.bddtransform/src-gen/dk/itu/bddctransform/parser/antlr/internal/InternalLettuce.g:255:5: this_Fail_3= ruleFail
                    {
                     
                            newCompositeNode(grammarAccess.getTransformationAccess().getFailParserRuleCall_3()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleFail_in_ruleTransformation553);
                    this_Fail_3=ruleFail();

                    state._fsp--;

                     
                            current = this_Fail_3; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTransformation"


    // $ANTLR start "entryRuleBehavior"
    // ../dk.itu.bddtransform/src-gen/dk/itu/bddctransform/parser/antlr/internal/InternalLettuce.g:271:1: entryRuleBehavior returns [EObject current=null] : iv_ruleBehavior= ruleBehavior EOF ;
    public final EObject entryRuleBehavior() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBehavior = null;


        try {
            // ../dk.itu.bddtransform/src-gen/dk/itu/bddctransform/parser/antlr/internal/InternalLettuce.g:272:2: (iv_ruleBehavior= ruleBehavior EOF )
            // ../dk.itu.bddtransform/src-gen/dk/itu/bddctransform/parser/antlr/internal/InternalLettuce.g:273:2: iv_ruleBehavior= ruleBehavior EOF
            {
             newCompositeNode(grammarAccess.getBehaviorRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleBehavior_in_entryRuleBehavior588);
            iv_ruleBehavior=ruleBehavior();

            state._fsp--;

             current =iv_ruleBehavior; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleBehavior598); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleBehavior"


    // $ANTLR start "ruleBehavior"
    // ../dk.itu.bddtransform/src-gen/dk/itu/bddctransform/parser/antlr/internal/InternalLettuce.g:280:1: ruleBehavior returns [EObject current=null] : (otherlv_0= 'behavior' ( (lv_description_1_0= ruleEString ) ) otherlv_2= 'class' ( (lv_class_3_0= ruleEString ) ) otherlv_4= 'signature' ( (lv_signature_5_0= ruleEString ) ) otherlv_6= 'end' ) ;
    public final EObject ruleBehavior() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        AntlrDatatypeRuleToken lv_description_1_0 = null;

        AntlrDatatypeRuleToken lv_class_3_0 = null;

        AntlrDatatypeRuleToken lv_signature_5_0 = null;


         enterRule(); 
            
        try {
            // ../dk.itu.bddtransform/src-gen/dk/itu/bddctransform/parser/antlr/internal/InternalLettuce.g:283:28: ( (otherlv_0= 'behavior' ( (lv_description_1_0= ruleEString ) ) otherlv_2= 'class' ( (lv_class_3_0= ruleEString ) ) otherlv_4= 'signature' ( (lv_signature_5_0= ruleEString ) ) otherlv_6= 'end' ) )
            // ../dk.itu.bddtransform/src-gen/dk/itu/bddctransform/parser/antlr/internal/InternalLettuce.g:284:1: (otherlv_0= 'behavior' ( (lv_description_1_0= ruleEString ) ) otherlv_2= 'class' ( (lv_class_3_0= ruleEString ) ) otherlv_4= 'signature' ( (lv_signature_5_0= ruleEString ) ) otherlv_6= 'end' )
            {
            // ../dk.itu.bddtransform/src-gen/dk/itu/bddctransform/parser/antlr/internal/InternalLettuce.g:284:1: (otherlv_0= 'behavior' ( (lv_description_1_0= ruleEString ) ) otherlv_2= 'class' ( (lv_class_3_0= ruleEString ) ) otherlv_4= 'signature' ( (lv_signature_5_0= ruleEString ) ) otherlv_6= 'end' )
            // ../dk.itu.bddtransform/src-gen/dk/itu/bddctransform/parser/antlr/internal/InternalLettuce.g:284:3: otherlv_0= 'behavior' ( (lv_description_1_0= ruleEString ) ) otherlv_2= 'class' ( (lv_class_3_0= ruleEString ) ) otherlv_4= 'signature' ( (lv_signature_5_0= ruleEString ) ) otherlv_6= 'end'
            {
            otherlv_0=(Token)match(input,13,FollowSets000.FOLLOW_13_in_ruleBehavior635); 

                	newLeafNode(otherlv_0, grammarAccess.getBehaviorAccess().getBehaviorKeyword_0());
                
            // ../dk.itu.bddtransform/src-gen/dk/itu/bddctransform/parser/antlr/internal/InternalLettuce.g:288:1: ( (lv_description_1_0= ruleEString ) )
            // ../dk.itu.bddtransform/src-gen/dk/itu/bddctransform/parser/antlr/internal/InternalLettuce.g:289:1: (lv_description_1_0= ruleEString )
            {
            // ../dk.itu.bddtransform/src-gen/dk/itu/bddctransform/parser/antlr/internal/InternalLettuce.g:289:1: (lv_description_1_0= ruleEString )
            // ../dk.itu.bddtransform/src-gen/dk/itu/bddctransform/parser/antlr/internal/InternalLettuce.g:290:3: lv_description_1_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getBehaviorAccess().getDescriptionEStringParserRuleCall_1_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleBehavior656);
            lv_description_1_0=ruleEString();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getBehaviorRule());
            	        }
                   		set(
                   			current, 
                   			"description",
                    		lv_description_1_0, 
                    		"EString");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_2=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleBehavior668); 

                	newLeafNode(otherlv_2, grammarAccess.getBehaviorAccess().getClassKeyword_2());
                
            // ../dk.itu.bddtransform/src-gen/dk/itu/bddctransform/parser/antlr/internal/InternalLettuce.g:310:1: ( (lv_class_3_0= ruleEString ) )
            // ../dk.itu.bddtransform/src-gen/dk/itu/bddctransform/parser/antlr/internal/InternalLettuce.g:311:1: (lv_class_3_0= ruleEString )
            {
            // ../dk.itu.bddtransform/src-gen/dk/itu/bddctransform/parser/antlr/internal/InternalLettuce.g:311:1: (lv_class_3_0= ruleEString )
            // ../dk.itu.bddtransform/src-gen/dk/itu/bddctransform/parser/antlr/internal/InternalLettuce.g:312:3: lv_class_3_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getBehaviorAccess().getClassEStringParserRuleCall_3_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleBehavior689);
            lv_class_3_0=ruleEString();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getBehaviorRule());
            	        }
                   		set(
                   			current, 
                   			"class",
                    		lv_class_3_0, 
                    		"EString");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_4=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleBehavior701); 

                	newLeafNode(otherlv_4, grammarAccess.getBehaviorAccess().getSignatureKeyword_4());
                
            // ../dk.itu.bddtransform/src-gen/dk/itu/bddctransform/parser/antlr/internal/InternalLettuce.g:332:1: ( (lv_signature_5_0= ruleEString ) )
            // ../dk.itu.bddtransform/src-gen/dk/itu/bddctransform/parser/antlr/internal/InternalLettuce.g:333:1: (lv_signature_5_0= ruleEString )
            {
            // ../dk.itu.bddtransform/src-gen/dk/itu/bddctransform/parser/antlr/internal/InternalLettuce.g:333:1: (lv_signature_5_0= ruleEString )
            // ../dk.itu.bddtransform/src-gen/dk/itu/bddctransform/parser/antlr/internal/InternalLettuce.g:334:3: lv_signature_5_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getBehaviorAccess().getSignatureEStringParserRuleCall_5_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleBehavior722);
            lv_signature_5_0=ruleEString();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getBehaviorRule());
            	        }
                   		set(
                   			current, 
                   			"signature",
                    		lv_signature_5_0, 
                    		"EString");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_6=(Token)match(input,16,FollowSets000.FOLLOW_16_in_ruleBehavior734); 

                	newLeafNode(otherlv_6, grammarAccess.getBehaviorAccess().getEndKeyword_6());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleBehavior"


    // $ANTLR start "entryRuleRule"
    // ../dk.itu.bddtransform/src-gen/dk/itu/bddctransform/parser/antlr/internal/InternalLettuce.g:362:1: entryRuleRule returns [EObject current=null] : iv_ruleRule= ruleRule EOF ;
    public final EObject entryRuleRule() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRule = null;


        try {
            // ../dk.itu.bddtransform/src-gen/dk/itu/bddctransform/parser/antlr/internal/InternalLettuce.g:363:2: (iv_ruleRule= ruleRule EOF )
            // ../dk.itu.bddtransform/src-gen/dk/itu/bddctransform/parser/antlr/internal/InternalLettuce.g:364:2: iv_ruleRule= ruleRule EOF
            {
             newCompositeNode(grammarAccess.getRuleRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleRule_in_entryRuleRule770);
            iv_ruleRule=ruleRule();

            state._fsp--;

             current =iv_ruleRule; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleRule780); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleRule"


    // $ANTLR start "ruleRule"
    // ../dk.itu.bddtransform/src-gen/dk/itu/bddctransform/parser/antlr/internal/InternalLettuce.g:371:1: ruleRule returns [EObject current=null] : (otherlv_0= 'rule' ( (lv_name_1_0= ruleRuleId ) ) ( (lv_patterns_2_0= rulePattern ) ) ( (lv_patterns_3_0= rulePattern ) )* ( (lv_transformation_4_0= ruleTransformation ) ) otherlv_5= 'end' ) ;
    public final EObject ruleRule() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_5=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        EObject lv_patterns_2_0 = null;

        EObject lv_patterns_3_0 = null;

        EObject lv_transformation_4_0 = null;


         enterRule(); 
            
        try {
            // ../dk.itu.bddtransform/src-gen/dk/itu/bddctransform/parser/antlr/internal/InternalLettuce.g:374:28: ( (otherlv_0= 'rule' ( (lv_name_1_0= ruleRuleId ) ) ( (lv_patterns_2_0= rulePattern ) ) ( (lv_patterns_3_0= rulePattern ) )* ( (lv_transformation_4_0= ruleTransformation ) ) otherlv_5= 'end' ) )
            // ../dk.itu.bddtransform/src-gen/dk/itu/bddctransform/parser/antlr/internal/InternalLettuce.g:375:1: (otherlv_0= 'rule' ( (lv_name_1_0= ruleRuleId ) ) ( (lv_patterns_2_0= rulePattern ) ) ( (lv_patterns_3_0= rulePattern ) )* ( (lv_transformation_4_0= ruleTransformation ) ) otherlv_5= 'end' )
            {
            // ../dk.itu.bddtransform/src-gen/dk/itu/bddctransform/parser/antlr/internal/InternalLettuce.g:375:1: (otherlv_0= 'rule' ( (lv_name_1_0= ruleRuleId ) ) ( (lv_patterns_2_0= rulePattern ) ) ( (lv_patterns_3_0= rulePattern ) )* ( (lv_transformation_4_0= ruleTransformation ) ) otherlv_5= 'end' )
            // ../dk.itu.bddtransform/src-gen/dk/itu/bddctransform/parser/antlr/internal/InternalLettuce.g:375:3: otherlv_0= 'rule' ( (lv_name_1_0= ruleRuleId ) ) ( (lv_patterns_2_0= rulePattern ) ) ( (lv_patterns_3_0= rulePattern ) )* ( (lv_transformation_4_0= ruleTransformation ) ) otherlv_5= 'end'
            {
            otherlv_0=(Token)match(input,17,FollowSets000.FOLLOW_17_in_ruleRule817); 

                	newLeafNode(otherlv_0, grammarAccess.getRuleAccess().getRuleKeyword_0());
                
            // ../dk.itu.bddtransform/src-gen/dk/itu/bddctransform/parser/antlr/internal/InternalLettuce.g:379:1: ( (lv_name_1_0= ruleRuleId ) )
            // ../dk.itu.bddtransform/src-gen/dk/itu/bddctransform/parser/antlr/internal/InternalLettuce.g:380:1: (lv_name_1_0= ruleRuleId )
            {
            // ../dk.itu.bddtransform/src-gen/dk/itu/bddctransform/parser/antlr/internal/InternalLettuce.g:380:1: (lv_name_1_0= ruleRuleId )
            // ../dk.itu.bddtransform/src-gen/dk/itu/bddctransform/parser/antlr/internal/InternalLettuce.g:381:3: lv_name_1_0= ruleRuleId
            {
             
            	        newCompositeNode(grammarAccess.getRuleAccess().getNameRuleIdParserRuleCall_1_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleRuleId_in_ruleRule838);
            lv_name_1_0=ruleRuleId();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getRuleRule());
            	        }
                   		set(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"RuleId");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../dk.itu.bddtransform/src-gen/dk/itu/bddctransform/parser/antlr/internal/InternalLettuce.g:397:2: ( (lv_patterns_2_0= rulePattern ) )
            // ../dk.itu.bddtransform/src-gen/dk/itu/bddctransform/parser/antlr/internal/InternalLettuce.g:398:1: (lv_patterns_2_0= rulePattern )
            {
            // ../dk.itu.bddtransform/src-gen/dk/itu/bddctransform/parser/antlr/internal/InternalLettuce.g:398:1: (lv_patterns_2_0= rulePattern )
            // ../dk.itu.bddtransform/src-gen/dk/itu/bddctransform/parser/antlr/internal/InternalLettuce.g:399:3: lv_patterns_2_0= rulePattern
            {
             
            	        newCompositeNode(grammarAccess.getRuleAccess().getPatternsPatternParserRuleCall_2_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_rulePattern_in_ruleRule859);
            lv_patterns_2_0=rulePattern();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getRuleRule());
            	        }
                   		add(
                   			current, 
                   			"patterns",
                    		lv_patterns_2_0, 
                    		"Pattern");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../dk.itu.bddtransform/src-gen/dk/itu/bddctransform/parser/antlr/internal/InternalLettuce.g:415:2: ( (lv_patterns_3_0= rulePattern ) )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( ((LA4_0>=RULE_ID && LA4_0<=RULE_STRING)||(LA4_0>=18 && LA4_0<=19)||LA4_0==22) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // ../dk.itu.bddtransform/src-gen/dk/itu/bddctransform/parser/antlr/internal/InternalLettuce.g:416:1: (lv_patterns_3_0= rulePattern )
            	    {
            	    // ../dk.itu.bddtransform/src-gen/dk/itu/bddctransform/parser/antlr/internal/InternalLettuce.g:416:1: (lv_patterns_3_0= rulePattern )
            	    // ../dk.itu.bddtransform/src-gen/dk/itu/bddctransform/parser/antlr/internal/InternalLettuce.g:417:3: lv_patterns_3_0= rulePattern
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getRuleAccess().getPatternsPatternParserRuleCall_3_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_rulePattern_in_ruleRule880);
            	    lv_patterns_3_0=rulePattern();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getRuleRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"patterns",
            	            		lv_patterns_3_0, 
            	            		"Pattern");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

            // ../dk.itu.bddtransform/src-gen/dk/itu/bddctransform/parser/antlr/internal/InternalLettuce.g:433:3: ( (lv_transformation_4_0= ruleTransformation ) )
            // ../dk.itu.bddtransform/src-gen/dk/itu/bddctransform/parser/antlr/internal/InternalLettuce.g:434:1: (lv_transformation_4_0= ruleTransformation )
            {
            // ../dk.itu.bddtransform/src-gen/dk/itu/bddctransform/parser/antlr/internal/InternalLettuce.g:434:1: (lv_transformation_4_0= ruleTransformation )
            // ../dk.itu.bddtransform/src-gen/dk/itu/bddctransform/parser/antlr/internal/InternalLettuce.g:435:3: lv_transformation_4_0= ruleTransformation
            {
             
            	        newCompositeNode(grammarAccess.getRuleAccess().getTransformationTransformationParserRuleCall_4_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleTransformation_in_ruleRule902);
            lv_transformation_4_0=ruleTransformation();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getRuleRule());
            	        }
                   		set(
                   			current, 
                   			"transformation",
                    		lv_transformation_4_0, 
                    		"Transformation");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_5=(Token)match(input,16,FollowSets000.FOLLOW_16_in_ruleRule914); 

                	newLeafNode(otherlv_5, grammarAccess.getRuleAccess().getEndKeyword_5());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleRule"


    // $ANTLR start "entryRuleRuleId"
    // ../dk.itu.bddtransform/src-gen/dk/itu/bddctransform/parser/antlr/internal/InternalLettuce.g:463:1: entryRuleRuleId returns [String current=null] : iv_ruleRuleId= ruleRuleId EOF ;
    public final String entryRuleRuleId() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleRuleId = null;


        try {
            // ../dk.itu.bddtransform/src-gen/dk/itu/bddctransform/parser/antlr/internal/InternalLettuce.g:464:2: (iv_ruleRuleId= ruleRuleId EOF )
            // ../dk.itu.bddtransform/src-gen/dk/itu/bddctransform/parser/antlr/internal/InternalLettuce.g:465:2: iv_ruleRuleId= ruleRuleId EOF
            {
             newCompositeNode(grammarAccess.getRuleIdRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleRuleId_in_entryRuleRuleId951);
            iv_ruleRuleId=ruleRuleId();

            state._fsp--;

             current =iv_ruleRuleId.getText(); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleRuleId962); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleRuleId"


    // $ANTLR start "ruleRuleId"
    // ../dk.itu.bddtransform/src-gen/dk/itu/bddctransform/parser/antlr/internal/InternalLettuce.g:472:1: ruleRuleId returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_ID_0= RULE_ID ;
    public final AntlrDatatypeRuleToken ruleRuleId() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;

         enterRule(); 
            
        try {
            // ../dk.itu.bddtransform/src-gen/dk/itu/bddctransform/parser/antlr/internal/InternalLettuce.g:475:28: (this_ID_0= RULE_ID )
            // ../dk.itu.bddtransform/src-gen/dk/itu/bddctransform/parser/antlr/internal/InternalLettuce.g:476:5: this_ID_0= RULE_ID
            {
            this_ID_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleRuleId1001); 

            		current.merge(this_ID_0);
                
             
                newLeafNode(this_ID_0, grammarAccess.getRuleIdAccess().getIDTerminalRuleCall()); 
                

            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleRuleId"


    // $ANTLR start "entryRuleVariableId"
    // ../dk.itu.bddtransform/src-gen/dk/itu/bddctransform/parser/antlr/internal/InternalLettuce.g:491:1: entryRuleVariableId returns [String current=null] : iv_ruleVariableId= ruleVariableId EOF ;
    public final String entryRuleVariableId() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleVariableId = null;


        try {
            // ../dk.itu.bddtransform/src-gen/dk/itu/bddctransform/parser/antlr/internal/InternalLettuce.g:492:2: (iv_ruleVariableId= ruleVariableId EOF )
            // ../dk.itu.bddtransform/src-gen/dk/itu/bddctransform/parser/antlr/internal/InternalLettuce.g:493:2: iv_ruleVariableId= ruleVariableId EOF
            {
             newCompositeNode(grammarAccess.getVariableIdRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleVariableId_in_entryRuleVariableId1046);
            iv_ruleVariableId=ruleVariableId();

            state._fsp--;

             current =iv_ruleVariableId.getText(); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleVariableId1057); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleVariableId"


    // $ANTLR start "ruleVariableId"
    // ../dk.itu.bddtransform/src-gen/dk/itu/bddctransform/parser/antlr/internal/InternalLettuce.g:500:1: ruleVariableId returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '$' this_ID_1= RULE_ID ) ;
    public final AntlrDatatypeRuleToken ruleVariableId() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_ID_1=null;

         enterRule(); 
            
        try {
            // ../dk.itu.bddtransform/src-gen/dk/itu/bddctransform/parser/antlr/internal/InternalLettuce.g:503:28: ( (kw= '$' this_ID_1= RULE_ID ) )
            // ../dk.itu.bddtransform/src-gen/dk/itu/bddctransform/parser/antlr/internal/InternalLettuce.g:504:1: (kw= '$' this_ID_1= RULE_ID )
            {
            // ../dk.itu.bddtransform/src-gen/dk/itu/bddctransform/parser/antlr/internal/InternalLettuce.g:504:1: (kw= '$' this_ID_1= RULE_ID )
            // ../dk.itu.bddtransform/src-gen/dk/itu/bddctransform/parser/antlr/internal/InternalLettuce.g:505:2: kw= '$' this_ID_1= RULE_ID
            {
            kw=(Token)match(input,18,FollowSets000.FOLLOW_18_in_ruleVariableId1095); 

                    current.merge(kw);
                    newLeafNode(kw, grammarAccess.getVariableIdAccess().getDollarSignKeyword_0()); 
                
            this_ID_1=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleVariableId1110); 

            		current.merge(this_ID_1);
                
             
                newLeafNode(this_ID_1, grammarAccess.getVariableIdAccess().getIDTerminalRuleCall_1()); 
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleVariableId"


    // $ANTLR start "entryRuleEString"
    // ../dk.itu.bddtransform/src-gen/dk/itu/bddctransform/parser/antlr/internal/InternalLettuce.g:525:1: entryRuleEString returns [String current=null] : iv_ruleEString= ruleEString EOF ;
    public final String entryRuleEString() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEString = null;


        try {
            // ../dk.itu.bddtransform/src-gen/dk/itu/bddctransform/parser/antlr/internal/InternalLettuce.g:526:2: (iv_ruleEString= ruleEString EOF )
            // ../dk.itu.bddtransform/src-gen/dk/itu/bddctransform/parser/antlr/internal/InternalLettuce.g:527:2: iv_ruleEString= ruleEString EOF
            {
             newCompositeNode(grammarAccess.getEStringRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_entryRuleEString1156);
            iv_ruleEString=ruleEString();

            state._fsp--;

             current =iv_ruleEString.getText(); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleEString1167); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEString"


    // $ANTLR start "ruleEString"
    // ../dk.itu.bddtransform/src-gen/dk/itu/bddctransform/parser/antlr/internal/InternalLettuce.g:534:1: ruleEString returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) ;
    public final AntlrDatatypeRuleToken ruleEString() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;
        Token this_ID_1=null;

         enterRule(); 
            
        try {
            // ../dk.itu.bddtransform/src-gen/dk/itu/bddctransform/parser/antlr/internal/InternalLettuce.g:537:28: ( (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) )
            // ../dk.itu.bddtransform/src-gen/dk/itu/bddctransform/parser/antlr/internal/InternalLettuce.g:538:1: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            {
            // ../dk.itu.bddtransform/src-gen/dk/itu/bddctransform/parser/antlr/internal/InternalLettuce.g:538:1: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==RULE_STRING) ) {
                alt5=1;
            }
            else if ( (LA5_0==RULE_ID) ) {
                alt5=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // ../dk.itu.bddtransform/src-gen/dk/itu/bddctransform/parser/antlr/internal/InternalLettuce.g:538:6: this_STRING_0= RULE_STRING
                    {
                    this_STRING_0=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_RULE_STRING_in_ruleEString1207); 

                    		current.merge(this_STRING_0);
                        
                     
                        newLeafNode(this_STRING_0, grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 
                        

                    }
                    break;
                case 2 :
                    // ../dk.itu.bddtransform/src-gen/dk/itu/bddctransform/parser/antlr/internal/InternalLettuce.g:546:10: this_ID_1= RULE_ID
                    {
                    this_ID_1=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleEString1233); 

                    		current.merge(this_ID_1);
                        
                     
                        newLeafNode(this_ID_1, grammarAccess.getEStringAccess().getIDTerminalRuleCall_1()); 
                        

                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEString"


    // $ANTLR start "entryRuleExactSting"
    // ../dk.itu.bddtransform/src-gen/dk/itu/bddctransform/parser/antlr/internal/InternalLettuce.g:561:1: entryRuleExactSting returns [EObject current=null] : iv_ruleExactSting= ruleExactSting EOF ;
    public final EObject entryRuleExactSting() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExactSting = null;


        try {
            // ../dk.itu.bddtransform/src-gen/dk/itu/bddctransform/parser/antlr/internal/InternalLettuce.g:562:2: (iv_ruleExactSting= ruleExactSting EOF )
            // ../dk.itu.bddtransform/src-gen/dk/itu/bddctransform/parser/antlr/internal/InternalLettuce.g:563:2: iv_ruleExactSting= ruleExactSting EOF
            {
             newCompositeNode(grammarAccess.getExactStingRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleExactSting_in_entryRuleExactSting1278);
            iv_ruleExactSting=ruleExactSting();

            state._fsp--;

             current =iv_ruleExactSting; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleExactSting1288); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleExactSting"


    // $ANTLR start "ruleExactSting"
    // ../dk.itu.bddtransform/src-gen/dk/itu/bddctransform/parser/antlr/internal/InternalLettuce.g:570:1: ruleExactSting returns [EObject current=null] : ( (lv_content_0_0= ruleEString ) ) ;
    public final EObject ruleExactSting() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_content_0_0 = null;


         enterRule(); 
            
        try {
            // ../dk.itu.bddtransform/src-gen/dk/itu/bddctransform/parser/antlr/internal/InternalLettuce.g:573:28: ( ( (lv_content_0_0= ruleEString ) ) )
            // ../dk.itu.bddtransform/src-gen/dk/itu/bddctransform/parser/antlr/internal/InternalLettuce.g:574:1: ( (lv_content_0_0= ruleEString ) )
            {
            // ../dk.itu.bddtransform/src-gen/dk/itu/bddctransform/parser/antlr/internal/InternalLettuce.g:574:1: ( (lv_content_0_0= ruleEString ) )
            // ../dk.itu.bddtransform/src-gen/dk/itu/bddctransform/parser/antlr/internal/InternalLettuce.g:575:1: (lv_content_0_0= ruleEString )
            {
            // ../dk.itu.bddtransform/src-gen/dk/itu/bddctransform/parser/antlr/internal/InternalLettuce.g:575:1: (lv_content_0_0= ruleEString )
            // ../dk.itu.bddtransform/src-gen/dk/itu/bddctransform/parser/antlr/internal/InternalLettuce.g:576:3: lv_content_0_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getExactStingAccess().getContentEStringParserRuleCall_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleExactSting1333);
            lv_content_0_0=ruleEString();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getExactStingRule());
            	        }
                   		set(
                   			current, 
                   			"content",
                    		lv_content_0_0, 
                    		"EString");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleExactSting"


    // $ANTLR start "entryRuleVariable"
    // ../dk.itu.bddtransform/src-gen/dk/itu/bddctransform/parser/antlr/internal/InternalLettuce.g:600:1: entryRuleVariable returns [EObject current=null] : iv_ruleVariable= ruleVariable EOF ;
    public final EObject entryRuleVariable() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVariable = null;


        try {
            // ../dk.itu.bddtransform/src-gen/dk/itu/bddctransform/parser/antlr/internal/InternalLettuce.g:601:2: (iv_ruleVariable= ruleVariable EOF )
            // ../dk.itu.bddtransform/src-gen/dk/itu/bddctransform/parser/antlr/internal/InternalLettuce.g:602:2: iv_ruleVariable= ruleVariable EOF
            {
             newCompositeNode(grammarAccess.getVariableRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleVariable_in_entryRuleVariable1368);
            iv_ruleVariable=ruleVariable();

            state._fsp--;

             current =iv_ruleVariable; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleVariable1378); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleVariable"


    // $ANTLR start "ruleVariable"
    // ../dk.itu.bddtransform/src-gen/dk/itu/bddctransform/parser/antlr/internal/InternalLettuce.g:609:1: ruleVariable returns [EObject current=null] : ( () ( (lv_name_1_0= ruleVariableId ) ) ) ;
    public final EObject ruleVariable() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_name_1_0 = null;


         enterRule(); 
            
        try {
            // ../dk.itu.bddtransform/src-gen/dk/itu/bddctransform/parser/antlr/internal/InternalLettuce.g:612:28: ( ( () ( (lv_name_1_0= ruleVariableId ) ) ) )
            // ../dk.itu.bddtransform/src-gen/dk/itu/bddctransform/parser/antlr/internal/InternalLettuce.g:613:1: ( () ( (lv_name_1_0= ruleVariableId ) ) )
            {
            // ../dk.itu.bddtransform/src-gen/dk/itu/bddctransform/parser/antlr/internal/InternalLettuce.g:613:1: ( () ( (lv_name_1_0= ruleVariableId ) ) )
            // ../dk.itu.bddtransform/src-gen/dk/itu/bddctransform/parser/antlr/internal/InternalLettuce.g:613:2: () ( (lv_name_1_0= ruleVariableId ) )
            {
            // ../dk.itu.bddtransform/src-gen/dk/itu/bddctransform/parser/antlr/internal/InternalLettuce.g:613:2: ()
            // ../dk.itu.bddtransform/src-gen/dk/itu/bddctransform/parser/antlr/internal/InternalLettuce.g:614:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getVariableAccess().getVariableAction_0(),
                        current);
                

            }

            // ../dk.itu.bddtransform/src-gen/dk/itu/bddctransform/parser/antlr/internal/InternalLettuce.g:619:2: ( (lv_name_1_0= ruleVariableId ) )
            // ../dk.itu.bddtransform/src-gen/dk/itu/bddctransform/parser/antlr/internal/InternalLettuce.g:620:1: (lv_name_1_0= ruleVariableId )
            {
            // ../dk.itu.bddtransform/src-gen/dk/itu/bddctransform/parser/antlr/internal/InternalLettuce.g:620:1: (lv_name_1_0= ruleVariableId )
            // ../dk.itu.bddtransform/src-gen/dk/itu/bddctransform/parser/antlr/internal/InternalLettuce.g:621:3: lv_name_1_0= ruleVariableId
            {
             
            	        newCompositeNode(grammarAccess.getVariableAccess().getNameVariableIdParserRuleCall_1_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleVariableId_in_ruleVariable1433);
            lv_name_1_0=ruleVariableId();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getVariableRule());
            	        }
                   		set(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"VariableId");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleVariable"


    // $ANTLR start "entryRuleAlternation"
    // ../dk.itu.bddtransform/src-gen/dk/itu/bddctransform/parser/antlr/internal/InternalLettuce.g:645:1: entryRuleAlternation returns [EObject current=null] : iv_ruleAlternation= ruleAlternation EOF ;
    public final EObject entryRuleAlternation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAlternation = null;


        try {
            // ../dk.itu.bddtransform/src-gen/dk/itu/bddctransform/parser/antlr/internal/InternalLettuce.g:646:2: (iv_ruleAlternation= ruleAlternation EOF )
            // ../dk.itu.bddtransform/src-gen/dk/itu/bddctransform/parser/antlr/internal/InternalLettuce.g:647:2: iv_ruleAlternation= ruleAlternation EOF
            {
             newCompositeNode(grammarAccess.getAlternationRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleAlternation_in_entryRuleAlternation1469);
            iv_ruleAlternation=ruleAlternation();

            state._fsp--;

             current =iv_ruleAlternation; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleAlternation1479); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAlternation"


    // $ANTLR start "ruleAlternation"
    // ../dk.itu.bddtransform/src-gen/dk/itu/bddctransform/parser/antlr/internal/InternalLettuce.g:654:1: ruleAlternation returns [EObject current=null] : (otherlv_0= '(' ( (lv_choices_1_0= rulePattern ) ) otherlv_2= '|' ( (lv_choices_3_0= rulePattern ) ) (otherlv_4= '|' ( (lv_choices_5_0= rulePattern ) ) )* otherlv_6= ')' ) ;
    public final EObject ruleAlternation() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        EObject lv_choices_1_0 = null;

        EObject lv_choices_3_0 = null;

        EObject lv_choices_5_0 = null;


         enterRule(); 
            
        try {
            // ../dk.itu.bddtransform/src-gen/dk/itu/bddctransform/parser/antlr/internal/InternalLettuce.g:657:28: ( (otherlv_0= '(' ( (lv_choices_1_0= rulePattern ) ) otherlv_2= '|' ( (lv_choices_3_0= rulePattern ) ) (otherlv_4= '|' ( (lv_choices_5_0= rulePattern ) ) )* otherlv_6= ')' ) )
            // ../dk.itu.bddtransform/src-gen/dk/itu/bddctransform/parser/antlr/internal/InternalLettuce.g:658:1: (otherlv_0= '(' ( (lv_choices_1_0= rulePattern ) ) otherlv_2= '|' ( (lv_choices_3_0= rulePattern ) ) (otherlv_4= '|' ( (lv_choices_5_0= rulePattern ) ) )* otherlv_6= ')' )
            {
            // ../dk.itu.bddtransform/src-gen/dk/itu/bddctransform/parser/antlr/internal/InternalLettuce.g:658:1: (otherlv_0= '(' ( (lv_choices_1_0= rulePattern ) ) otherlv_2= '|' ( (lv_choices_3_0= rulePattern ) ) (otherlv_4= '|' ( (lv_choices_5_0= rulePattern ) ) )* otherlv_6= ')' )
            // ../dk.itu.bddtransform/src-gen/dk/itu/bddctransform/parser/antlr/internal/InternalLettuce.g:658:3: otherlv_0= '(' ( (lv_choices_1_0= rulePattern ) ) otherlv_2= '|' ( (lv_choices_3_0= rulePattern ) ) (otherlv_4= '|' ( (lv_choices_5_0= rulePattern ) ) )* otherlv_6= ')'
            {
            otherlv_0=(Token)match(input,19,FollowSets000.FOLLOW_19_in_ruleAlternation1516); 

                	newLeafNode(otherlv_0, grammarAccess.getAlternationAccess().getLeftParenthesisKeyword_0());
                
            // ../dk.itu.bddtransform/src-gen/dk/itu/bddctransform/parser/antlr/internal/InternalLettuce.g:662:1: ( (lv_choices_1_0= rulePattern ) )
            // ../dk.itu.bddtransform/src-gen/dk/itu/bddctransform/parser/antlr/internal/InternalLettuce.g:663:1: (lv_choices_1_0= rulePattern )
            {
            // ../dk.itu.bddtransform/src-gen/dk/itu/bddctransform/parser/antlr/internal/InternalLettuce.g:663:1: (lv_choices_1_0= rulePattern )
            // ../dk.itu.bddtransform/src-gen/dk/itu/bddctransform/parser/antlr/internal/InternalLettuce.g:664:3: lv_choices_1_0= rulePattern
            {
             
            	        newCompositeNode(grammarAccess.getAlternationAccess().getChoicesPatternParserRuleCall_1_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_rulePattern_in_ruleAlternation1537);
            lv_choices_1_0=rulePattern();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getAlternationRule());
            	        }
                   		add(
                   			current, 
                   			"choices",
                    		lv_choices_1_0, 
                    		"Pattern");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_2=(Token)match(input,20,FollowSets000.FOLLOW_20_in_ruleAlternation1549); 

                	newLeafNode(otherlv_2, grammarAccess.getAlternationAccess().getVerticalLineKeyword_2());
                
            // ../dk.itu.bddtransform/src-gen/dk/itu/bddctransform/parser/antlr/internal/InternalLettuce.g:684:1: ( (lv_choices_3_0= rulePattern ) )
            // ../dk.itu.bddtransform/src-gen/dk/itu/bddctransform/parser/antlr/internal/InternalLettuce.g:685:1: (lv_choices_3_0= rulePattern )
            {
            // ../dk.itu.bddtransform/src-gen/dk/itu/bddctransform/parser/antlr/internal/InternalLettuce.g:685:1: (lv_choices_3_0= rulePattern )
            // ../dk.itu.bddtransform/src-gen/dk/itu/bddctransform/parser/antlr/internal/InternalLettuce.g:686:3: lv_choices_3_0= rulePattern
            {
             
            	        newCompositeNode(grammarAccess.getAlternationAccess().getChoicesPatternParserRuleCall_3_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_rulePattern_in_ruleAlternation1570);
            lv_choices_3_0=rulePattern();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getAlternationRule());
            	        }
                   		add(
                   			current, 
                   			"choices",
                    		lv_choices_3_0, 
                    		"Pattern");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../dk.itu.bddtransform/src-gen/dk/itu/bddctransform/parser/antlr/internal/InternalLettuce.g:702:2: (otherlv_4= '|' ( (lv_choices_5_0= rulePattern ) ) )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==20) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // ../dk.itu.bddtransform/src-gen/dk/itu/bddctransform/parser/antlr/internal/InternalLettuce.g:702:4: otherlv_4= '|' ( (lv_choices_5_0= rulePattern ) )
            	    {
            	    otherlv_4=(Token)match(input,20,FollowSets000.FOLLOW_20_in_ruleAlternation1583); 

            	        	newLeafNode(otherlv_4, grammarAccess.getAlternationAccess().getVerticalLineKeyword_4_0());
            	        
            	    // ../dk.itu.bddtransform/src-gen/dk/itu/bddctransform/parser/antlr/internal/InternalLettuce.g:706:1: ( (lv_choices_5_0= rulePattern ) )
            	    // ../dk.itu.bddtransform/src-gen/dk/itu/bddctransform/parser/antlr/internal/InternalLettuce.g:707:1: (lv_choices_5_0= rulePattern )
            	    {
            	    // ../dk.itu.bddtransform/src-gen/dk/itu/bddctransform/parser/antlr/internal/InternalLettuce.g:707:1: (lv_choices_5_0= rulePattern )
            	    // ../dk.itu.bddtransform/src-gen/dk/itu/bddctransform/parser/antlr/internal/InternalLettuce.g:708:3: lv_choices_5_0= rulePattern
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getAlternationAccess().getChoicesPatternParserRuleCall_4_1_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_rulePattern_in_ruleAlternation1604);
            	    lv_choices_5_0=rulePattern();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getAlternationRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"choices",
            	            		lv_choices_5_0, 
            	            		"Pattern");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);

            otherlv_6=(Token)match(input,21,FollowSets000.FOLLOW_21_in_ruleAlternation1618); 

                	newLeafNode(otherlv_6, grammarAccess.getAlternationAccess().getRightParenthesisKeyword_5());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAlternation"


    // $ANTLR start "entryRuleOptional"
    // ../dk.itu.bddtransform/src-gen/dk/itu/bddctransform/parser/antlr/internal/InternalLettuce.g:736:1: entryRuleOptional returns [EObject current=null] : iv_ruleOptional= ruleOptional EOF ;
    public final EObject entryRuleOptional() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOptional = null;


        try {
            // ../dk.itu.bddtransform/src-gen/dk/itu/bddctransform/parser/antlr/internal/InternalLettuce.g:737:2: (iv_ruleOptional= ruleOptional EOF )
            // ../dk.itu.bddtransform/src-gen/dk/itu/bddctransform/parser/antlr/internal/InternalLettuce.g:738:2: iv_ruleOptional= ruleOptional EOF
            {
             newCompositeNode(grammarAccess.getOptionalRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleOptional_in_entryRuleOptional1654);
            iv_ruleOptional=ruleOptional();

            state._fsp--;

             current =iv_ruleOptional; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleOptional1664); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleOptional"


    // $ANTLR start "ruleOptional"
    // ../dk.itu.bddtransform/src-gen/dk/itu/bddctransform/parser/antlr/internal/InternalLettuce.g:745:1: ruleOptional returns [EObject current=null] : (otherlv_0= '[' ( (lv_value_1_0= rulePattern ) ) ( (lv_value_2_0= rulePattern ) )* otherlv_3= ']' ) ;
    public final EObject ruleOptional() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_3=null;
        EObject lv_value_1_0 = null;

        EObject lv_value_2_0 = null;


         enterRule(); 
            
        try {
            // ../dk.itu.bddtransform/src-gen/dk/itu/bddctransform/parser/antlr/internal/InternalLettuce.g:748:28: ( (otherlv_0= '[' ( (lv_value_1_0= rulePattern ) ) ( (lv_value_2_0= rulePattern ) )* otherlv_3= ']' ) )
            // ../dk.itu.bddtransform/src-gen/dk/itu/bddctransform/parser/antlr/internal/InternalLettuce.g:749:1: (otherlv_0= '[' ( (lv_value_1_0= rulePattern ) ) ( (lv_value_2_0= rulePattern ) )* otherlv_3= ']' )
            {
            // ../dk.itu.bddtransform/src-gen/dk/itu/bddctransform/parser/antlr/internal/InternalLettuce.g:749:1: (otherlv_0= '[' ( (lv_value_1_0= rulePattern ) ) ( (lv_value_2_0= rulePattern ) )* otherlv_3= ']' )
            // ../dk.itu.bddtransform/src-gen/dk/itu/bddctransform/parser/antlr/internal/InternalLettuce.g:749:3: otherlv_0= '[' ( (lv_value_1_0= rulePattern ) ) ( (lv_value_2_0= rulePattern ) )* otherlv_3= ']'
            {
            otherlv_0=(Token)match(input,22,FollowSets000.FOLLOW_22_in_ruleOptional1701); 

                	newLeafNode(otherlv_0, grammarAccess.getOptionalAccess().getLeftSquareBracketKeyword_0());
                
            // ../dk.itu.bddtransform/src-gen/dk/itu/bddctransform/parser/antlr/internal/InternalLettuce.g:753:1: ( (lv_value_1_0= rulePattern ) )
            // ../dk.itu.bddtransform/src-gen/dk/itu/bddctransform/parser/antlr/internal/InternalLettuce.g:754:1: (lv_value_1_0= rulePattern )
            {
            // ../dk.itu.bddtransform/src-gen/dk/itu/bddctransform/parser/antlr/internal/InternalLettuce.g:754:1: (lv_value_1_0= rulePattern )
            // ../dk.itu.bddtransform/src-gen/dk/itu/bddctransform/parser/antlr/internal/InternalLettuce.g:755:3: lv_value_1_0= rulePattern
            {
             
            	        newCompositeNode(grammarAccess.getOptionalAccess().getValuePatternParserRuleCall_1_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_rulePattern_in_ruleOptional1722);
            lv_value_1_0=rulePattern();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getOptionalRule());
            	        }
                   		add(
                   			current, 
                   			"value",
                    		lv_value_1_0, 
                    		"Pattern");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../dk.itu.bddtransform/src-gen/dk/itu/bddctransform/parser/antlr/internal/InternalLettuce.g:771:2: ( (lv_value_2_0= rulePattern ) )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( ((LA7_0>=RULE_ID && LA7_0<=RULE_STRING)||(LA7_0>=18 && LA7_0<=19)||LA7_0==22) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // ../dk.itu.bddtransform/src-gen/dk/itu/bddctransform/parser/antlr/internal/InternalLettuce.g:772:1: (lv_value_2_0= rulePattern )
            	    {
            	    // ../dk.itu.bddtransform/src-gen/dk/itu/bddctransform/parser/antlr/internal/InternalLettuce.g:772:1: (lv_value_2_0= rulePattern )
            	    // ../dk.itu.bddtransform/src-gen/dk/itu/bddctransform/parser/antlr/internal/InternalLettuce.g:773:3: lv_value_2_0= rulePattern
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getOptionalAccess().getValuePatternParserRuleCall_2_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_rulePattern_in_ruleOptional1743);
            	    lv_value_2_0=rulePattern();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getOptionalRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"value",
            	            		lv_value_2_0, 
            	            		"Pattern");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

            otherlv_3=(Token)match(input,23,FollowSets000.FOLLOW_23_in_ruleOptional1756); 

                	newLeafNode(otherlv_3, grammarAccess.getOptionalAccess().getRightSquareBracketKeyword_3());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleOptional"


    // $ANTLR start "entryRuleExpression"
    // ../dk.itu.bddtransform/src-gen/dk/itu/bddctransform/parser/antlr/internal/InternalLettuce.g:801:1: entryRuleExpression returns [EObject current=null] : iv_ruleExpression= ruleExpression EOF ;
    public final EObject entryRuleExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpression = null;


        try {
            // ../dk.itu.bddtransform/src-gen/dk/itu/bddctransform/parser/antlr/internal/InternalLettuce.g:802:2: (iv_ruleExpression= ruleExpression EOF )
            // ../dk.itu.bddtransform/src-gen/dk/itu/bddctransform/parser/antlr/internal/InternalLettuce.g:803:2: iv_ruleExpression= ruleExpression EOF
            {
             newCompositeNode(grammarAccess.getExpressionRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleExpression_in_entryRuleExpression1792);
            iv_ruleExpression=ruleExpression();

            state._fsp--;

             current =iv_ruleExpression; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleExpression1802); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleExpression"


    // $ANTLR start "ruleExpression"
    // ../dk.itu.bddtransform/src-gen/dk/itu/bddctransform/parser/antlr/internal/InternalLettuce.g:810:1: ruleExpression returns [EObject current=null] : (otherlv_0= 'expr' ( (lv_value_1_0= ruleEString ) ) ) ;
    public final EObject ruleExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        AntlrDatatypeRuleToken lv_value_1_0 = null;


         enterRule(); 
            
        try {
            // ../dk.itu.bddtransform/src-gen/dk/itu/bddctransform/parser/antlr/internal/InternalLettuce.g:813:28: ( (otherlv_0= 'expr' ( (lv_value_1_0= ruleEString ) ) ) )
            // ../dk.itu.bddtransform/src-gen/dk/itu/bddctransform/parser/antlr/internal/InternalLettuce.g:814:1: (otherlv_0= 'expr' ( (lv_value_1_0= ruleEString ) ) )
            {
            // ../dk.itu.bddtransform/src-gen/dk/itu/bddctransform/parser/antlr/internal/InternalLettuce.g:814:1: (otherlv_0= 'expr' ( (lv_value_1_0= ruleEString ) ) )
            // ../dk.itu.bddtransform/src-gen/dk/itu/bddctransform/parser/antlr/internal/InternalLettuce.g:814:3: otherlv_0= 'expr' ( (lv_value_1_0= ruleEString ) )
            {
            otherlv_0=(Token)match(input,24,FollowSets000.FOLLOW_24_in_ruleExpression1839); 

                	newLeafNode(otherlv_0, grammarAccess.getExpressionAccess().getExprKeyword_0());
                
            // ../dk.itu.bddtransform/src-gen/dk/itu/bddctransform/parser/antlr/internal/InternalLettuce.g:818:1: ( (lv_value_1_0= ruleEString ) )
            // ../dk.itu.bddtransform/src-gen/dk/itu/bddctransform/parser/antlr/internal/InternalLettuce.g:819:1: (lv_value_1_0= ruleEString )
            {
            // ../dk.itu.bddtransform/src-gen/dk/itu/bddctransform/parser/antlr/internal/InternalLettuce.g:819:1: (lv_value_1_0= ruleEString )
            // ../dk.itu.bddtransform/src-gen/dk/itu/bddctransform/parser/antlr/internal/InternalLettuce.g:820:3: lv_value_1_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getExpressionAccess().getValueEStringParserRuleCall_1_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleExpression1860);
            lv_value_1_0=ruleEString();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getExpressionRule());
            	        }
                   		set(
                   			current, 
                   			"value",
                    		lv_value_1_0, 
                    		"EString");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleExpression"


    // $ANTLR start "entryRuleIfDef"
    // ../dk.itu.bddtransform/src-gen/dk/itu/bddctransform/parser/antlr/internal/InternalLettuce.g:844:1: entryRuleIfDef returns [EObject current=null] : iv_ruleIfDef= ruleIfDef EOF ;
    public final EObject entryRuleIfDef() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIfDef = null;


        try {
            // ../dk.itu.bddtransform/src-gen/dk/itu/bddctransform/parser/antlr/internal/InternalLettuce.g:845:2: (iv_ruleIfDef= ruleIfDef EOF )
            // ../dk.itu.bddtransform/src-gen/dk/itu/bddctransform/parser/antlr/internal/InternalLettuce.g:846:2: iv_ruleIfDef= ruleIfDef EOF
            {
             newCompositeNode(grammarAccess.getIfDefRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleIfDef_in_entryRuleIfDef1896);
            iv_ruleIfDef=ruleIfDef();

            state._fsp--;

             current =iv_ruleIfDef; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleIfDef1906); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleIfDef"


    // $ANTLR start "ruleIfDef"
    // ../dk.itu.bddtransform/src-gen/dk/itu/bddctransform/parser/antlr/internal/InternalLettuce.g:853:1: ruleIfDef returns [EObject current=null] : (otherlv_0= 'if' otherlv_1= 'def?' ( (lv_variables_2_0= ruleVariableId ) ) (otherlv_3= ',' ( (lv_variables_4_0= ruleVariableId ) ) )* otherlv_5= 'then' ( (lv_true_body_6_0= ruleTransformation ) ) otherlv_7= 'else' ( (lv_false_body_8_0= ruleTransformation ) ) otherlv_9= 'end' ) ;
    public final EObject ruleIfDef() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        AntlrDatatypeRuleToken lv_variables_2_0 = null;

        AntlrDatatypeRuleToken lv_variables_4_0 = null;

        EObject lv_true_body_6_0 = null;

        EObject lv_false_body_8_0 = null;


         enterRule(); 
            
        try {
            // ../dk.itu.bddtransform/src-gen/dk/itu/bddctransform/parser/antlr/internal/InternalLettuce.g:856:28: ( (otherlv_0= 'if' otherlv_1= 'def?' ( (lv_variables_2_0= ruleVariableId ) ) (otherlv_3= ',' ( (lv_variables_4_0= ruleVariableId ) ) )* otherlv_5= 'then' ( (lv_true_body_6_0= ruleTransformation ) ) otherlv_7= 'else' ( (lv_false_body_8_0= ruleTransformation ) ) otherlv_9= 'end' ) )
            // ../dk.itu.bddtransform/src-gen/dk/itu/bddctransform/parser/antlr/internal/InternalLettuce.g:857:1: (otherlv_0= 'if' otherlv_1= 'def?' ( (lv_variables_2_0= ruleVariableId ) ) (otherlv_3= ',' ( (lv_variables_4_0= ruleVariableId ) ) )* otherlv_5= 'then' ( (lv_true_body_6_0= ruleTransformation ) ) otherlv_7= 'else' ( (lv_false_body_8_0= ruleTransformation ) ) otherlv_9= 'end' )
            {
            // ../dk.itu.bddtransform/src-gen/dk/itu/bddctransform/parser/antlr/internal/InternalLettuce.g:857:1: (otherlv_0= 'if' otherlv_1= 'def?' ( (lv_variables_2_0= ruleVariableId ) ) (otherlv_3= ',' ( (lv_variables_4_0= ruleVariableId ) ) )* otherlv_5= 'then' ( (lv_true_body_6_0= ruleTransformation ) ) otherlv_7= 'else' ( (lv_false_body_8_0= ruleTransformation ) ) otherlv_9= 'end' )
            // ../dk.itu.bddtransform/src-gen/dk/itu/bddctransform/parser/antlr/internal/InternalLettuce.g:857:3: otherlv_0= 'if' otherlv_1= 'def?' ( (lv_variables_2_0= ruleVariableId ) ) (otherlv_3= ',' ( (lv_variables_4_0= ruleVariableId ) ) )* otherlv_5= 'then' ( (lv_true_body_6_0= ruleTransformation ) ) otherlv_7= 'else' ( (lv_false_body_8_0= ruleTransformation ) ) otherlv_9= 'end'
            {
            otherlv_0=(Token)match(input,25,FollowSets000.FOLLOW_25_in_ruleIfDef1943); 

                	newLeafNode(otherlv_0, grammarAccess.getIfDefAccess().getIfKeyword_0());
                
            otherlv_1=(Token)match(input,26,FollowSets000.FOLLOW_26_in_ruleIfDef1955); 

                	newLeafNode(otherlv_1, grammarAccess.getIfDefAccess().getDefKeyword_1());
                
            // ../dk.itu.bddtransform/src-gen/dk/itu/bddctransform/parser/antlr/internal/InternalLettuce.g:865:1: ( (lv_variables_2_0= ruleVariableId ) )
            // ../dk.itu.bddtransform/src-gen/dk/itu/bddctransform/parser/antlr/internal/InternalLettuce.g:866:1: (lv_variables_2_0= ruleVariableId )
            {
            // ../dk.itu.bddtransform/src-gen/dk/itu/bddctransform/parser/antlr/internal/InternalLettuce.g:866:1: (lv_variables_2_0= ruleVariableId )
            // ../dk.itu.bddtransform/src-gen/dk/itu/bddctransform/parser/antlr/internal/InternalLettuce.g:867:3: lv_variables_2_0= ruleVariableId
            {
             
            	        newCompositeNode(grammarAccess.getIfDefAccess().getVariablesVariableIdParserRuleCall_2_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleVariableId_in_ruleIfDef1976);
            lv_variables_2_0=ruleVariableId();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getIfDefRule());
            	        }
                   		add(
                   			current, 
                   			"variables",
                    		lv_variables_2_0, 
                    		"VariableId");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../dk.itu.bddtransform/src-gen/dk/itu/bddctransform/parser/antlr/internal/InternalLettuce.g:883:2: (otherlv_3= ',' ( (lv_variables_4_0= ruleVariableId ) ) )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==27) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // ../dk.itu.bddtransform/src-gen/dk/itu/bddctransform/parser/antlr/internal/InternalLettuce.g:883:4: otherlv_3= ',' ( (lv_variables_4_0= ruleVariableId ) )
            	    {
            	    otherlv_3=(Token)match(input,27,FollowSets000.FOLLOW_27_in_ruleIfDef1989); 

            	        	newLeafNode(otherlv_3, grammarAccess.getIfDefAccess().getCommaKeyword_3_0());
            	        
            	    // ../dk.itu.bddtransform/src-gen/dk/itu/bddctransform/parser/antlr/internal/InternalLettuce.g:887:1: ( (lv_variables_4_0= ruleVariableId ) )
            	    // ../dk.itu.bddtransform/src-gen/dk/itu/bddctransform/parser/antlr/internal/InternalLettuce.g:888:1: (lv_variables_4_0= ruleVariableId )
            	    {
            	    // ../dk.itu.bddtransform/src-gen/dk/itu/bddctransform/parser/antlr/internal/InternalLettuce.g:888:1: (lv_variables_4_0= ruleVariableId )
            	    // ../dk.itu.bddtransform/src-gen/dk/itu/bddctransform/parser/antlr/internal/InternalLettuce.g:889:3: lv_variables_4_0= ruleVariableId
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getIfDefAccess().getVariablesVariableIdParserRuleCall_3_1_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_ruleVariableId_in_ruleIfDef2010);
            	    lv_variables_4_0=ruleVariableId();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getIfDefRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"variables",
            	            		lv_variables_4_0, 
            	            		"VariableId");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

            otherlv_5=(Token)match(input,28,FollowSets000.FOLLOW_28_in_ruleIfDef2024); 

                	newLeafNode(otherlv_5, grammarAccess.getIfDefAccess().getThenKeyword_4());
                
            // ../dk.itu.bddtransform/src-gen/dk/itu/bddctransform/parser/antlr/internal/InternalLettuce.g:909:1: ( (lv_true_body_6_0= ruleTransformation ) )
            // ../dk.itu.bddtransform/src-gen/dk/itu/bddctransform/parser/antlr/internal/InternalLettuce.g:910:1: (lv_true_body_6_0= ruleTransformation )
            {
            // ../dk.itu.bddtransform/src-gen/dk/itu/bddctransform/parser/antlr/internal/InternalLettuce.g:910:1: (lv_true_body_6_0= ruleTransformation )
            // ../dk.itu.bddtransform/src-gen/dk/itu/bddctransform/parser/antlr/internal/InternalLettuce.g:911:3: lv_true_body_6_0= ruleTransformation
            {
             
            	        newCompositeNode(grammarAccess.getIfDefAccess().getTrue_bodyTransformationParserRuleCall_5_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleTransformation_in_ruleIfDef2045);
            lv_true_body_6_0=ruleTransformation();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getIfDefRule());
            	        }
                   		set(
                   			current, 
                   			"true_body",
                    		lv_true_body_6_0, 
                    		"Transformation");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_7=(Token)match(input,29,FollowSets000.FOLLOW_29_in_ruleIfDef2057); 

                	newLeafNode(otherlv_7, grammarAccess.getIfDefAccess().getElseKeyword_6());
                
            // ../dk.itu.bddtransform/src-gen/dk/itu/bddctransform/parser/antlr/internal/InternalLettuce.g:931:1: ( (lv_false_body_8_0= ruleTransformation ) )
            // ../dk.itu.bddtransform/src-gen/dk/itu/bddctransform/parser/antlr/internal/InternalLettuce.g:932:1: (lv_false_body_8_0= ruleTransformation )
            {
            // ../dk.itu.bddtransform/src-gen/dk/itu/bddctransform/parser/antlr/internal/InternalLettuce.g:932:1: (lv_false_body_8_0= ruleTransformation )
            // ../dk.itu.bddtransform/src-gen/dk/itu/bddctransform/parser/antlr/internal/InternalLettuce.g:933:3: lv_false_body_8_0= ruleTransformation
            {
             
            	        newCompositeNode(grammarAccess.getIfDefAccess().getFalse_bodyTransformationParserRuleCall_7_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleTransformation_in_ruleIfDef2078);
            lv_false_body_8_0=ruleTransformation();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getIfDefRule());
            	        }
                   		set(
                   			current, 
                   			"false_body",
                    		lv_false_body_8_0, 
                    		"Transformation");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_9=(Token)match(input,16,FollowSets000.FOLLOW_16_in_ruleIfDef2090); 

                	newLeafNode(otherlv_9, grammarAccess.getIfDefAccess().getEndKeyword_8());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleIfDef"


    // $ANTLR start "entryRuleMatch"
    // ../dk.itu.bddtransform/src-gen/dk/itu/bddctransform/parser/antlr/internal/InternalLettuce.g:961:1: entryRuleMatch returns [EObject current=null] : iv_ruleMatch= ruleMatch EOF ;
    public final EObject entryRuleMatch() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMatch = null;


        try {
            // ../dk.itu.bddtransform/src-gen/dk/itu/bddctransform/parser/antlr/internal/InternalLettuce.g:962:2: (iv_ruleMatch= ruleMatch EOF )
            // ../dk.itu.bddtransform/src-gen/dk/itu/bddctransform/parser/antlr/internal/InternalLettuce.g:963:2: iv_ruleMatch= ruleMatch EOF
            {
             newCompositeNode(grammarAccess.getMatchRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleMatch_in_entryRuleMatch2126);
            iv_ruleMatch=ruleMatch();

            state._fsp--;

             current =iv_ruleMatch; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleMatch2136); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleMatch"


    // $ANTLR start "ruleMatch"
    // ../dk.itu.bddtransform/src-gen/dk/itu/bddctransform/parser/antlr/internal/InternalLettuce.g:970:1: ruleMatch returns [EObject current=null] : (otherlv_0= 'match' ( ( ruleRuleId ) ) ( ( (lv_assignments_2_0= ruleKeyValue ) ) ( (lv_assignments_3_0= ruleKeyValue ) )* )? ) ;
    public final EObject ruleMatch() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_assignments_2_0 = null;

        EObject lv_assignments_3_0 = null;


         enterRule(); 
            
        try {
            // ../dk.itu.bddtransform/src-gen/dk/itu/bddctransform/parser/antlr/internal/InternalLettuce.g:973:28: ( (otherlv_0= 'match' ( ( ruleRuleId ) ) ( ( (lv_assignments_2_0= ruleKeyValue ) ) ( (lv_assignments_3_0= ruleKeyValue ) )* )? ) )
            // ../dk.itu.bddtransform/src-gen/dk/itu/bddctransform/parser/antlr/internal/InternalLettuce.g:974:1: (otherlv_0= 'match' ( ( ruleRuleId ) ) ( ( (lv_assignments_2_0= ruleKeyValue ) ) ( (lv_assignments_3_0= ruleKeyValue ) )* )? )
            {
            // ../dk.itu.bddtransform/src-gen/dk/itu/bddctransform/parser/antlr/internal/InternalLettuce.g:974:1: (otherlv_0= 'match' ( ( ruleRuleId ) ) ( ( (lv_assignments_2_0= ruleKeyValue ) ) ( (lv_assignments_3_0= ruleKeyValue ) )* )? )
            // ../dk.itu.bddtransform/src-gen/dk/itu/bddctransform/parser/antlr/internal/InternalLettuce.g:974:3: otherlv_0= 'match' ( ( ruleRuleId ) ) ( ( (lv_assignments_2_0= ruleKeyValue ) ) ( (lv_assignments_3_0= ruleKeyValue ) )* )?
            {
            otherlv_0=(Token)match(input,30,FollowSets000.FOLLOW_30_in_ruleMatch2173); 

                	newLeafNode(otherlv_0, grammarAccess.getMatchAccess().getMatchKeyword_0());
                
            // ../dk.itu.bddtransform/src-gen/dk/itu/bddctransform/parser/antlr/internal/InternalLettuce.g:978:1: ( ( ruleRuleId ) )
            // ../dk.itu.bddtransform/src-gen/dk/itu/bddctransform/parser/antlr/internal/InternalLettuce.g:979:1: ( ruleRuleId )
            {
            // ../dk.itu.bddtransform/src-gen/dk/itu/bddctransform/parser/antlr/internal/InternalLettuce.g:979:1: ( ruleRuleId )
            // ../dk.itu.bddtransform/src-gen/dk/itu/bddctransform/parser/antlr/internal/InternalLettuce.g:980:3: ruleRuleId
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getMatchRule());
            	        }
                    
             
            	        newCompositeNode(grammarAccess.getMatchAccess().getRuleRuleCrossReference_1_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleRuleId_in_ruleMatch2196);
            ruleRuleId();

            state._fsp--;

             
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../dk.itu.bddtransform/src-gen/dk/itu/bddctransform/parser/antlr/internal/InternalLettuce.g:993:2: ( ( (lv_assignments_2_0= ruleKeyValue ) ) ( (lv_assignments_3_0= ruleKeyValue ) )* )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==18) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // ../dk.itu.bddtransform/src-gen/dk/itu/bddctransform/parser/antlr/internal/InternalLettuce.g:993:3: ( (lv_assignments_2_0= ruleKeyValue ) ) ( (lv_assignments_3_0= ruleKeyValue ) )*
                    {
                    // ../dk.itu.bddtransform/src-gen/dk/itu/bddctransform/parser/antlr/internal/InternalLettuce.g:993:3: ( (lv_assignments_2_0= ruleKeyValue ) )
                    // ../dk.itu.bddtransform/src-gen/dk/itu/bddctransform/parser/antlr/internal/InternalLettuce.g:994:1: (lv_assignments_2_0= ruleKeyValue )
                    {
                    // ../dk.itu.bddtransform/src-gen/dk/itu/bddctransform/parser/antlr/internal/InternalLettuce.g:994:1: (lv_assignments_2_0= ruleKeyValue )
                    // ../dk.itu.bddtransform/src-gen/dk/itu/bddctransform/parser/antlr/internal/InternalLettuce.g:995:3: lv_assignments_2_0= ruleKeyValue
                    {
                     
                    	        newCompositeNode(grammarAccess.getMatchAccess().getAssignmentsKeyValueParserRuleCall_2_0_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleKeyValue_in_ruleMatch2218);
                    lv_assignments_2_0=ruleKeyValue();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getMatchRule());
                    	        }
                           		add(
                           			current, 
                           			"assignments",
                            		lv_assignments_2_0, 
                            		"KeyValue");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../dk.itu.bddtransform/src-gen/dk/itu/bddctransform/parser/antlr/internal/InternalLettuce.g:1011:2: ( (lv_assignments_3_0= ruleKeyValue ) )*
                    loop9:
                    do {
                        int alt9=2;
                        int LA9_0 = input.LA(1);

                        if ( (LA9_0==18) ) {
                            alt9=1;
                        }


                        switch (alt9) {
                    	case 1 :
                    	    // ../dk.itu.bddtransform/src-gen/dk/itu/bddctransform/parser/antlr/internal/InternalLettuce.g:1012:1: (lv_assignments_3_0= ruleKeyValue )
                    	    {
                    	    // ../dk.itu.bddtransform/src-gen/dk/itu/bddctransform/parser/antlr/internal/InternalLettuce.g:1012:1: (lv_assignments_3_0= ruleKeyValue )
                    	    // ../dk.itu.bddtransform/src-gen/dk/itu/bddctransform/parser/antlr/internal/InternalLettuce.g:1013:3: lv_assignments_3_0= ruleKeyValue
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getMatchAccess().getAssignmentsKeyValueParserRuleCall_2_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleKeyValue_in_ruleMatch2239);
                    	    lv_assignments_3_0=ruleKeyValue();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getMatchRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"assignments",
                    	            		lv_assignments_3_0, 
                    	            		"KeyValue");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop9;
                        }
                    } while (true);


                    }
                    break;

            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleMatch"


    // $ANTLR start "entryRuleFail"
    // ../dk.itu.bddtransform/src-gen/dk/itu/bddctransform/parser/antlr/internal/InternalLettuce.g:1037:1: entryRuleFail returns [EObject current=null] : iv_ruleFail= ruleFail EOF ;
    public final EObject entryRuleFail() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFail = null;


        try {
            // ../dk.itu.bddtransform/src-gen/dk/itu/bddctransform/parser/antlr/internal/InternalLettuce.g:1038:2: (iv_ruleFail= ruleFail EOF )
            // ../dk.itu.bddtransform/src-gen/dk/itu/bddctransform/parser/antlr/internal/InternalLettuce.g:1039:2: iv_ruleFail= ruleFail EOF
            {
             newCompositeNode(grammarAccess.getFailRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleFail_in_entryRuleFail2278);
            iv_ruleFail=ruleFail();

            state._fsp--;

             current =iv_ruleFail; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleFail2288); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleFail"


    // $ANTLR start "ruleFail"
    // ../dk.itu.bddtransform/src-gen/dk/itu/bddctransform/parser/antlr/internal/InternalLettuce.g:1046:1: ruleFail returns [EObject current=null] : ( () otherlv_1= 'fail' (otherlv_2= 'message' ( (lv_message_3_0= ruleEString ) ) )? ) ;
    public final EObject ruleFail() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        AntlrDatatypeRuleToken lv_message_3_0 = null;


         enterRule(); 
            
        try {
            // ../dk.itu.bddtransform/src-gen/dk/itu/bddctransform/parser/antlr/internal/InternalLettuce.g:1049:28: ( ( () otherlv_1= 'fail' (otherlv_2= 'message' ( (lv_message_3_0= ruleEString ) ) )? ) )
            // ../dk.itu.bddtransform/src-gen/dk/itu/bddctransform/parser/antlr/internal/InternalLettuce.g:1050:1: ( () otherlv_1= 'fail' (otherlv_2= 'message' ( (lv_message_3_0= ruleEString ) ) )? )
            {
            // ../dk.itu.bddtransform/src-gen/dk/itu/bddctransform/parser/antlr/internal/InternalLettuce.g:1050:1: ( () otherlv_1= 'fail' (otherlv_2= 'message' ( (lv_message_3_0= ruleEString ) ) )? )
            // ../dk.itu.bddtransform/src-gen/dk/itu/bddctransform/parser/antlr/internal/InternalLettuce.g:1050:2: () otherlv_1= 'fail' (otherlv_2= 'message' ( (lv_message_3_0= ruleEString ) ) )?
            {
            // ../dk.itu.bddtransform/src-gen/dk/itu/bddctransform/parser/antlr/internal/InternalLettuce.g:1050:2: ()
            // ../dk.itu.bddtransform/src-gen/dk/itu/bddctransform/parser/antlr/internal/InternalLettuce.g:1051:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getFailAccess().getFailAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,31,FollowSets000.FOLLOW_31_in_ruleFail2334); 

                	newLeafNode(otherlv_1, grammarAccess.getFailAccess().getFailKeyword_1());
                
            // ../dk.itu.bddtransform/src-gen/dk/itu/bddctransform/parser/antlr/internal/InternalLettuce.g:1060:1: (otherlv_2= 'message' ( (lv_message_3_0= ruleEString ) ) )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==32) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // ../dk.itu.bddtransform/src-gen/dk/itu/bddctransform/parser/antlr/internal/InternalLettuce.g:1060:3: otherlv_2= 'message' ( (lv_message_3_0= ruleEString ) )
                    {
                    otherlv_2=(Token)match(input,32,FollowSets000.FOLLOW_32_in_ruleFail2347); 

                        	newLeafNode(otherlv_2, grammarAccess.getFailAccess().getMessageKeyword_2_0());
                        
                    // ../dk.itu.bddtransform/src-gen/dk/itu/bddctransform/parser/antlr/internal/InternalLettuce.g:1064:1: ( (lv_message_3_0= ruleEString ) )
                    // ../dk.itu.bddtransform/src-gen/dk/itu/bddctransform/parser/antlr/internal/InternalLettuce.g:1065:1: (lv_message_3_0= ruleEString )
                    {
                    // ../dk.itu.bddtransform/src-gen/dk/itu/bddctransform/parser/antlr/internal/InternalLettuce.g:1065:1: (lv_message_3_0= ruleEString )
                    // ../dk.itu.bddtransform/src-gen/dk/itu/bddctransform/parser/antlr/internal/InternalLettuce.g:1066:3: lv_message_3_0= ruleEString
                    {
                     
                    	        newCompositeNode(grammarAccess.getFailAccess().getMessageEStringParserRuleCall_2_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleFail2368);
                    lv_message_3_0=ruleEString();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getFailRule());
                    	        }
                           		set(
                           			current, 
                           			"message",
                            		lv_message_3_0, 
                            		"EString");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleFail"


    // $ANTLR start "entryRuleKeyValue"
    // ../dk.itu.bddtransform/src-gen/dk/itu/bddctransform/parser/antlr/internal/InternalLettuce.g:1090:1: entryRuleKeyValue returns [EObject current=null] : iv_ruleKeyValue= ruleKeyValue EOF ;
    public final EObject entryRuleKeyValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleKeyValue = null;


        try {
            // ../dk.itu.bddtransform/src-gen/dk/itu/bddctransform/parser/antlr/internal/InternalLettuce.g:1091:2: (iv_ruleKeyValue= ruleKeyValue EOF )
            // ../dk.itu.bddtransform/src-gen/dk/itu/bddctransform/parser/antlr/internal/InternalLettuce.g:1092:2: iv_ruleKeyValue= ruleKeyValue EOF
            {
             newCompositeNode(grammarAccess.getKeyValueRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleKeyValue_in_entryRuleKeyValue2406);
            iv_ruleKeyValue=ruleKeyValue();

            state._fsp--;

             current =iv_ruleKeyValue; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleKeyValue2416); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleKeyValue"


    // $ANTLR start "ruleKeyValue"
    // ../dk.itu.bddtransform/src-gen/dk/itu/bddctransform/parser/antlr/internal/InternalLettuce.g:1099:1: ruleKeyValue returns [EObject current=null] : ( () ( (lv_key_1_0= ruleVariableId ) ) otherlv_2= '=' ( ( (lv_value_3_0= ruleEString ) ) | ( (lv_value_4_0= ruleVariableId ) ) ) ) ;
    public final EObject ruleKeyValue() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        AntlrDatatypeRuleToken lv_key_1_0 = null;

        AntlrDatatypeRuleToken lv_value_3_0 = null;

        AntlrDatatypeRuleToken lv_value_4_0 = null;


         enterRule(); 
            
        try {
            // ../dk.itu.bddtransform/src-gen/dk/itu/bddctransform/parser/antlr/internal/InternalLettuce.g:1102:28: ( ( () ( (lv_key_1_0= ruleVariableId ) ) otherlv_2= '=' ( ( (lv_value_3_0= ruleEString ) ) | ( (lv_value_4_0= ruleVariableId ) ) ) ) )
            // ../dk.itu.bddtransform/src-gen/dk/itu/bddctransform/parser/antlr/internal/InternalLettuce.g:1103:1: ( () ( (lv_key_1_0= ruleVariableId ) ) otherlv_2= '=' ( ( (lv_value_3_0= ruleEString ) ) | ( (lv_value_4_0= ruleVariableId ) ) ) )
            {
            // ../dk.itu.bddtransform/src-gen/dk/itu/bddctransform/parser/antlr/internal/InternalLettuce.g:1103:1: ( () ( (lv_key_1_0= ruleVariableId ) ) otherlv_2= '=' ( ( (lv_value_3_0= ruleEString ) ) | ( (lv_value_4_0= ruleVariableId ) ) ) )
            // ../dk.itu.bddtransform/src-gen/dk/itu/bddctransform/parser/antlr/internal/InternalLettuce.g:1103:2: () ( (lv_key_1_0= ruleVariableId ) ) otherlv_2= '=' ( ( (lv_value_3_0= ruleEString ) ) | ( (lv_value_4_0= ruleVariableId ) ) )
            {
            // ../dk.itu.bddtransform/src-gen/dk/itu/bddctransform/parser/antlr/internal/InternalLettuce.g:1103:2: ()
            // ../dk.itu.bddtransform/src-gen/dk/itu/bddctransform/parser/antlr/internal/InternalLettuce.g:1104:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getKeyValueAccess().getKeyValueAction_0(),
                        current);
                

            }

            // ../dk.itu.bddtransform/src-gen/dk/itu/bddctransform/parser/antlr/internal/InternalLettuce.g:1109:2: ( (lv_key_1_0= ruleVariableId ) )
            // ../dk.itu.bddtransform/src-gen/dk/itu/bddctransform/parser/antlr/internal/InternalLettuce.g:1110:1: (lv_key_1_0= ruleVariableId )
            {
            // ../dk.itu.bddtransform/src-gen/dk/itu/bddctransform/parser/antlr/internal/InternalLettuce.g:1110:1: (lv_key_1_0= ruleVariableId )
            // ../dk.itu.bddtransform/src-gen/dk/itu/bddctransform/parser/antlr/internal/InternalLettuce.g:1111:3: lv_key_1_0= ruleVariableId
            {
             
            	        newCompositeNode(grammarAccess.getKeyValueAccess().getKeyVariableIdParserRuleCall_1_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleVariableId_in_ruleKeyValue2471);
            lv_key_1_0=ruleVariableId();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getKeyValueRule());
            	        }
                   		set(
                   			current, 
                   			"key",
                    		lv_key_1_0, 
                    		"VariableId");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_2=(Token)match(input,33,FollowSets000.FOLLOW_33_in_ruleKeyValue2483); 

                	newLeafNode(otherlv_2, grammarAccess.getKeyValueAccess().getEqualsSignKeyword_2());
                
            // ../dk.itu.bddtransform/src-gen/dk/itu/bddctransform/parser/antlr/internal/InternalLettuce.g:1131:1: ( ( (lv_value_3_0= ruleEString ) ) | ( (lv_value_4_0= ruleVariableId ) ) )
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( ((LA12_0>=RULE_ID && LA12_0<=RULE_STRING)) ) {
                alt12=1;
            }
            else if ( (LA12_0==18) ) {
                alt12=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;
            }
            switch (alt12) {
                case 1 :
                    // ../dk.itu.bddtransform/src-gen/dk/itu/bddctransform/parser/antlr/internal/InternalLettuce.g:1131:2: ( (lv_value_3_0= ruleEString ) )
                    {
                    // ../dk.itu.bddtransform/src-gen/dk/itu/bddctransform/parser/antlr/internal/InternalLettuce.g:1131:2: ( (lv_value_3_0= ruleEString ) )
                    // ../dk.itu.bddtransform/src-gen/dk/itu/bddctransform/parser/antlr/internal/InternalLettuce.g:1132:1: (lv_value_3_0= ruleEString )
                    {
                    // ../dk.itu.bddtransform/src-gen/dk/itu/bddctransform/parser/antlr/internal/InternalLettuce.g:1132:1: (lv_value_3_0= ruleEString )
                    // ../dk.itu.bddtransform/src-gen/dk/itu/bddctransform/parser/antlr/internal/InternalLettuce.g:1133:3: lv_value_3_0= ruleEString
                    {
                     
                    	        newCompositeNode(grammarAccess.getKeyValueAccess().getValueEStringParserRuleCall_3_0_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleKeyValue2505);
                    lv_value_3_0=ruleEString();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getKeyValueRule());
                    	        }
                           		set(
                           			current, 
                           			"value",
                            		lv_value_3_0, 
                            		"EString");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../dk.itu.bddtransform/src-gen/dk/itu/bddctransform/parser/antlr/internal/InternalLettuce.g:1150:6: ( (lv_value_4_0= ruleVariableId ) )
                    {
                    // ../dk.itu.bddtransform/src-gen/dk/itu/bddctransform/parser/antlr/internal/InternalLettuce.g:1150:6: ( (lv_value_4_0= ruleVariableId ) )
                    // ../dk.itu.bddtransform/src-gen/dk/itu/bddctransform/parser/antlr/internal/InternalLettuce.g:1151:1: (lv_value_4_0= ruleVariableId )
                    {
                    // ../dk.itu.bddtransform/src-gen/dk/itu/bddctransform/parser/antlr/internal/InternalLettuce.g:1151:1: (lv_value_4_0= ruleVariableId )
                    // ../dk.itu.bddtransform/src-gen/dk/itu/bddctransform/parser/antlr/internal/InternalLettuce.g:1152:3: lv_value_4_0= ruleVariableId
                    {
                     
                    	        newCompositeNode(grammarAccess.getKeyValueAccess().getValueVariableIdParserRuleCall_3_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleVariableId_in_ruleKeyValue2532);
                    lv_value_4_0=ruleVariableId();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getKeyValueRule());
                    	        }
                           		set(
                           			current, 
                           			"value",
                            		lv_value_4_0, 
                            		"VariableId");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleKeyValue"

    // Delegated rules


 

    
    private static class FollowSets000 {
        public static final BitSet FOLLOW_ruleTransformModel__in_entryRuleTransformModel_75 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleTransformModel_85 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_11_in_ruleTransformModel_122 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleTransformModel_134 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleTransformModel_155 = new BitSet(new long[]{0x0000000000022000L});
        public static final BitSet FOLLOW_ruleRule_in_ruleTransformModel_177 = new BitSet(new long[]{0x0000000000022002L});
        public static final BitSet FOLLOW_ruleBehavior_in_ruleTransformModel_204 = new BitSet(new long[]{0x0000000000022002L});
        public static final BitSet FOLLOW_rulePattern_in_entryRulePattern242 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRulePattern252 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleExactSting_in_rulePattern299 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleVariable_in_rulePattern326 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAlternation_in_rulePattern353 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleOptional_in_rulePattern380 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleTransformation_in_entryRuleTransformation415 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleTransformation425 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleExpression_in_ruleTransformation472 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleIfDef_in_ruleTransformation499 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleMatch_in_ruleTransformation526 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleFail_in_ruleTransformation553 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleBehavior_in_entryRuleBehavior588 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleBehavior598 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_13_in_ruleBehavior635 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleBehavior656 = new BitSet(new long[]{0x0000000000004000L});
        public static final BitSet FOLLOW_14_in_ruleBehavior668 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleBehavior689 = new BitSet(new long[]{0x0000000000008000L});
        public static final BitSet FOLLOW_15_in_ruleBehavior701 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleBehavior722 = new BitSet(new long[]{0x0000000000010000L});
        public static final BitSet FOLLOW_16_in_ruleBehavior734 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleRule_in_entryRuleRule770 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleRule780 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_17_in_ruleRule817 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_ruleRuleId_in_ruleRule838 = new BitSet(new long[]{0x00000000004C0030L});
        public static final BitSet FOLLOW_rulePattern_in_ruleRule859 = new BitSet(new long[]{0x00000000C34C0030L});
        public static final BitSet FOLLOW_rulePattern_in_ruleRule880 = new BitSet(new long[]{0x00000000C34C0030L});
        public static final BitSet FOLLOW_ruleTransformation_in_ruleRule902 = new BitSet(new long[]{0x0000000000010000L});
        public static final BitSet FOLLOW_16_in_ruleRule914 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleRuleId_in_entryRuleRuleId951 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleRuleId962 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleRuleId1001 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleVariableId_in_entryRuleVariableId1046 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleVariableId1057 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_18_in_ruleVariableId1095 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleVariableId1110 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_entryRuleEString1156 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleEString1167 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_STRING_in_ruleEString1207 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleEString1233 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleExactSting_in_entryRuleExactSting1278 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleExactSting1288 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_ruleExactSting1333 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleVariable_in_entryRuleVariable1368 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleVariable1378 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleVariableId_in_ruleVariable1433 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAlternation_in_entryRuleAlternation1469 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleAlternation1479 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_19_in_ruleAlternation1516 = new BitSet(new long[]{0x00000000004C0030L});
        public static final BitSet FOLLOW_rulePattern_in_ruleAlternation1537 = new BitSet(new long[]{0x0000000000100000L});
        public static final BitSet FOLLOW_20_in_ruleAlternation1549 = new BitSet(new long[]{0x00000000004C0030L});
        public static final BitSet FOLLOW_rulePattern_in_ruleAlternation1570 = new BitSet(new long[]{0x0000000000300000L});
        public static final BitSet FOLLOW_20_in_ruleAlternation1583 = new BitSet(new long[]{0x00000000004C0030L});
        public static final BitSet FOLLOW_rulePattern_in_ruleAlternation1604 = new BitSet(new long[]{0x0000000000300000L});
        public static final BitSet FOLLOW_21_in_ruleAlternation1618 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleOptional_in_entryRuleOptional1654 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleOptional1664 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_22_in_ruleOptional1701 = new BitSet(new long[]{0x00000000004C0030L});
        public static final BitSet FOLLOW_rulePattern_in_ruleOptional1722 = new BitSet(new long[]{0x0000000000CC0030L});
        public static final BitSet FOLLOW_rulePattern_in_ruleOptional1743 = new BitSet(new long[]{0x0000000000CC0030L});
        public static final BitSet FOLLOW_23_in_ruleOptional1756 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleExpression_in_entryRuleExpression1792 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleExpression1802 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_24_in_ruleExpression1839 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleExpression1860 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleIfDef_in_entryRuleIfDef1896 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleIfDef1906 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_25_in_ruleIfDef1943 = new BitSet(new long[]{0x0000000004000000L});
        public static final BitSet FOLLOW_26_in_ruleIfDef1955 = new BitSet(new long[]{0x0000000000040000L});
        public static final BitSet FOLLOW_ruleVariableId_in_ruleIfDef1976 = new BitSet(new long[]{0x0000000018000000L});
        public static final BitSet FOLLOW_27_in_ruleIfDef1989 = new BitSet(new long[]{0x0000000000040000L});
        public static final BitSet FOLLOW_ruleVariableId_in_ruleIfDef2010 = new BitSet(new long[]{0x0000000018000000L});
        public static final BitSet FOLLOW_28_in_ruleIfDef2024 = new BitSet(new long[]{0x00000000C34C0030L});
        public static final BitSet FOLLOW_ruleTransformation_in_ruleIfDef2045 = new BitSet(new long[]{0x0000000020000000L});
        public static final BitSet FOLLOW_29_in_ruleIfDef2057 = new BitSet(new long[]{0x00000000C34C0030L});
        public static final BitSet FOLLOW_ruleTransformation_in_ruleIfDef2078 = new BitSet(new long[]{0x0000000000010000L});
        public static final BitSet FOLLOW_16_in_ruleIfDef2090 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleMatch_in_entryRuleMatch2126 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleMatch2136 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_30_in_ruleMatch2173 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_ruleRuleId_in_ruleMatch2196 = new BitSet(new long[]{0x0000000000040002L});
        public static final BitSet FOLLOW_ruleKeyValue_in_ruleMatch2218 = new BitSet(new long[]{0x0000000000040002L});
        public static final BitSet FOLLOW_ruleKeyValue_in_ruleMatch2239 = new BitSet(new long[]{0x0000000000040002L});
        public static final BitSet FOLLOW_ruleFail_in_entryRuleFail2278 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleFail2288 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_31_in_ruleFail2334 = new BitSet(new long[]{0x0000000100000002L});
        public static final BitSet FOLLOW_32_in_ruleFail2347 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleFail2368 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleKeyValue_in_entryRuleKeyValue2406 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleKeyValue2416 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleVariableId_in_ruleKeyValue2471 = new BitSet(new long[]{0x0000000200000000L});
        public static final BitSet FOLLOW_33_in_ruleKeyValue2483 = new BitSet(new long[]{0x0000000000040030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleKeyValue2505 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleVariableId_in_ruleKeyValue2532 = new BitSet(new long[]{0x0000000000000002L});
    }


}