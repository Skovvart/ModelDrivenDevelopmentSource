package dk.itu.bddcontracts.parser.antlr.internal; 

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import dk.itu.bddcontracts.services.GherkinGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalGherkinParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ANY_OTHER", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "'Feature:'", "'Background:'", "'Given'", "'And'", "'Behavior:'", "'Requiring'", "'Ensuring'", "'Scenario:'", "'When'", "'Then'", "'Scenario Outline:'", "'Examples:'", "'<'", "'>'", "'|'", "'\\n'"
    };
    public static final int RULE_ID=5;
    public static final int T__26=26;
    public static final int T__25=25;
    public static final int T__24=24;
    public static final int T__23=23;
    public static final int T__22=22;
    public static final int RULE_ANY_OTHER=7;
    public static final int T__21=21;
    public static final int T__20=20;
    public static final int RULE_SL_COMMENT=9;
    public static final int EOF=-1;
    public static final int RULE_ML_COMMENT=8;
    public static final int T__19=19;
    public static final int RULE_STRING=4;
    public static final int T__16=16;
    public static final int T__15=15;
    public static final int T__18=18;
    public static final int T__17=17;
    public static final int T__12=12;
    public static final int T__11=11;
    public static final int T__14=14;
    public static final int T__13=13;
    public static final int RULE_INT=6;
    public static final int RULE_WS=10;

    // delegates
    // delegators


        public InternalGherkinParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalGherkinParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalGherkinParser.tokenNames; }
    public String getGrammarFileName() { return "../dk.itu.bddcontracts/src-gen/dk/itu/bddcontracts/parser/antlr/internal/InternalGherkin.g"; }



     	private GherkinGrammarAccess grammarAccess;
     	
        public InternalGherkinParser(TokenStream input, GherkinGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }
        
        @Override
        protected String getFirstRuleName() {
        	return "Model";	
       	}
       	
       	@Override
       	protected GherkinGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}



    // $ANTLR start "entryRuleModel"
    // ../dk.itu.bddcontracts/src-gen/dk/itu/bddcontracts/parser/antlr/internal/InternalGherkin.g:67:1: entryRuleModel returns [EObject current=null] : iv_ruleModel= ruleModel EOF ;
    public final EObject entryRuleModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModel = null;


        try {
            // ../dk.itu.bddcontracts/src-gen/dk/itu/bddcontracts/parser/antlr/internal/InternalGherkin.g:68:2: (iv_ruleModel= ruleModel EOF )
            // ../dk.itu.bddcontracts/src-gen/dk/itu/bddcontracts/parser/antlr/internal/InternalGherkin.g:69:2: iv_ruleModel= ruleModel EOF
            {
             newCompositeNode(grammarAccess.getModelRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleModel_in_entryRuleModel75);
            iv_ruleModel=ruleModel();

            state._fsp--;

             current =iv_ruleModel; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleModel85); 

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
    // $ANTLR end "entryRuleModel"


    // $ANTLR start "ruleModel"
    // ../dk.itu.bddcontracts/src-gen/dk/itu/bddcontracts/parser/antlr/internal/InternalGherkin.g:76:1: ruleModel returns [EObject current=null] : ( () ( ( (lv_Features_1_0= ruleFeature ) ) ( (lv_Features_2_0= ruleFeature ) )* )? ) ;
    public final EObject ruleModel() throws RecognitionException {
        EObject current = null;

        EObject lv_Features_1_0 = null;

        EObject lv_Features_2_0 = null;


         enterRule(); 
            
        try {
            // ../dk.itu.bddcontracts/src-gen/dk/itu/bddcontracts/parser/antlr/internal/InternalGherkin.g:79:28: ( ( () ( ( (lv_Features_1_0= ruleFeature ) ) ( (lv_Features_2_0= ruleFeature ) )* )? ) )
            // ../dk.itu.bddcontracts/src-gen/dk/itu/bddcontracts/parser/antlr/internal/InternalGherkin.g:80:1: ( () ( ( (lv_Features_1_0= ruleFeature ) ) ( (lv_Features_2_0= ruleFeature ) )* )? )
            {
            // ../dk.itu.bddcontracts/src-gen/dk/itu/bddcontracts/parser/antlr/internal/InternalGherkin.g:80:1: ( () ( ( (lv_Features_1_0= ruleFeature ) ) ( (lv_Features_2_0= ruleFeature ) )* )? )
            // ../dk.itu.bddcontracts/src-gen/dk/itu/bddcontracts/parser/antlr/internal/InternalGherkin.g:80:2: () ( ( (lv_Features_1_0= ruleFeature ) ) ( (lv_Features_2_0= ruleFeature ) )* )?
            {
            // ../dk.itu.bddcontracts/src-gen/dk/itu/bddcontracts/parser/antlr/internal/InternalGherkin.g:80:2: ()
            // ../dk.itu.bddcontracts/src-gen/dk/itu/bddcontracts/parser/antlr/internal/InternalGherkin.g:81:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getModelAccess().getModelAction_0(),
                        current);
                

            }

            // ../dk.itu.bddcontracts/src-gen/dk/itu/bddcontracts/parser/antlr/internal/InternalGherkin.g:86:2: ( ( (lv_Features_1_0= ruleFeature ) ) ( (lv_Features_2_0= ruleFeature ) )* )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==11) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // ../dk.itu.bddcontracts/src-gen/dk/itu/bddcontracts/parser/antlr/internal/InternalGherkin.g:86:3: ( (lv_Features_1_0= ruleFeature ) ) ( (lv_Features_2_0= ruleFeature ) )*
                    {
                    // ../dk.itu.bddcontracts/src-gen/dk/itu/bddcontracts/parser/antlr/internal/InternalGherkin.g:86:3: ( (lv_Features_1_0= ruleFeature ) )
                    // ../dk.itu.bddcontracts/src-gen/dk/itu/bddcontracts/parser/antlr/internal/InternalGherkin.g:87:1: (lv_Features_1_0= ruleFeature )
                    {
                    // ../dk.itu.bddcontracts/src-gen/dk/itu/bddcontracts/parser/antlr/internal/InternalGherkin.g:87:1: (lv_Features_1_0= ruleFeature )
                    // ../dk.itu.bddcontracts/src-gen/dk/itu/bddcontracts/parser/antlr/internal/InternalGherkin.g:88:3: lv_Features_1_0= ruleFeature
                    {
                     
                    	        newCompositeNode(grammarAccess.getModelAccess().getFeaturesFeatureParserRuleCall_1_0_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleFeature_in_ruleModel141);
                    lv_Features_1_0=ruleFeature();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getModelRule());
                    	        }
                           		add(
                           			current, 
                           			"Features",
                            		lv_Features_1_0, 
                            		"Feature");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../dk.itu.bddcontracts/src-gen/dk/itu/bddcontracts/parser/antlr/internal/InternalGherkin.g:104:2: ( (lv_Features_2_0= ruleFeature ) )*
                    loop1:
                    do {
                        int alt1=2;
                        int LA1_0 = input.LA(1);

                        if ( (LA1_0==11) ) {
                            alt1=1;
                        }


                        switch (alt1) {
                    	case 1 :
                    	    // ../dk.itu.bddcontracts/src-gen/dk/itu/bddcontracts/parser/antlr/internal/InternalGherkin.g:105:1: (lv_Features_2_0= ruleFeature )
                    	    {
                    	    // ../dk.itu.bddcontracts/src-gen/dk/itu/bddcontracts/parser/antlr/internal/InternalGherkin.g:105:1: (lv_Features_2_0= ruleFeature )
                    	    // ../dk.itu.bddcontracts/src-gen/dk/itu/bddcontracts/parser/antlr/internal/InternalGherkin.g:106:3: lv_Features_2_0= ruleFeature
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getModelAccess().getFeaturesFeatureParserRuleCall_1_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleFeature_in_ruleModel162);
                    	    lv_Features_2_0=ruleFeature();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getModelRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"Features",
                    	            		lv_Features_2_0, 
                    	            		"Feature");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop1;
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
    // $ANTLR end "ruleModel"


    // $ANTLR start "entryRuleScenario"
    // ../dk.itu.bddcontracts/src-gen/dk/itu/bddcontracts/parser/antlr/internal/InternalGherkin.g:130:1: entryRuleScenario returns [EObject current=null] : iv_ruleScenario= ruleScenario EOF ;
    public final EObject entryRuleScenario() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleScenario = null;


        try {
            // ../dk.itu.bddcontracts/src-gen/dk/itu/bddcontracts/parser/antlr/internal/InternalGherkin.g:131:2: (iv_ruleScenario= ruleScenario EOF )
            // ../dk.itu.bddcontracts/src-gen/dk/itu/bddcontracts/parser/antlr/internal/InternalGherkin.g:132:2: iv_ruleScenario= ruleScenario EOF
            {
             newCompositeNode(grammarAccess.getScenarioRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleScenario_in_entryRuleScenario201);
            iv_ruleScenario=ruleScenario();

            state._fsp--;

             current =iv_ruleScenario; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleScenario211); 

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
    // $ANTLR end "entryRuleScenario"


    // $ANTLR start "ruleScenario"
    // ../dk.itu.bddcontracts/src-gen/dk/itu/bddcontracts/parser/antlr/internal/InternalGherkin.g:139:1: ruleScenario returns [EObject current=null] : (this_ScenarioSpecific_0= ruleScenarioSpecific | this_ScenarioOutline_1= ruleScenarioOutline ) ;
    public final EObject ruleScenario() throws RecognitionException {
        EObject current = null;

        EObject this_ScenarioSpecific_0 = null;

        EObject this_ScenarioOutline_1 = null;


         enterRule(); 
            
        try {
            // ../dk.itu.bddcontracts/src-gen/dk/itu/bddcontracts/parser/antlr/internal/InternalGherkin.g:142:28: ( (this_ScenarioSpecific_0= ruleScenarioSpecific | this_ScenarioOutline_1= ruleScenarioOutline ) )
            // ../dk.itu.bddcontracts/src-gen/dk/itu/bddcontracts/parser/antlr/internal/InternalGherkin.g:143:1: (this_ScenarioSpecific_0= ruleScenarioSpecific | this_ScenarioOutline_1= ruleScenarioOutline )
            {
            // ../dk.itu.bddcontracts/src-gen/dk/itu/bddcontracts/parser/antlr/internal/InternalGherkin.g:143:1: (this_ScenarioSpecific_0= ruleScenarioSpecific | this_ScenarioOutline_1= ruleScenarioOutline )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==18) ) {
                alt3=1;
            }
            else if ( (LA3_0==21) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // ../dk.itu.bddcontracts/src-gen/dk/itu/bddcontracts/parser/antlr/internal/InternalGherkin.g:144:5: this_ScenarioSpecific_0= ruleScenarioSpecific
                    {
                     
                            newCompositeNode(grammarAccess.getScenarioAccess().getScenarioSpecificParserRuleCall_0()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleScenarioSpecific_in_ruleScenario258);
                    this_ScenarioSpecific_0=ruleScenarioSpecific();

                    state._fsp--;

                     
                            current = this_ScenarioSpecific_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../dk.itu.bddcontracts/src-gen/dk/itu/bddcontracts/parser/antlr/internal/InternalGherkin.g:154:5: this_ScenarioOutline_1= ruleScenarioOutline
                    {
                     
                            newCompositeNode(grammarAccess.getScenarioAccess().getScenarioOutlineParserRuleCall_1()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleScenarioOutline_in_ruleScenario285);
                    this_ScenarioOutline_1=ruleScenarioOutline();

                    state._fsp--;

                     
                            current = this_ScenarioOutline_1; 
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
    // $ANTLR end "ruleScenario"


    // $ANTLR start "entryRuleContent"
    // ../dk.itu.bddcontracts/src-gen/dk/itu/bddcontracts/parser/antlr/internal/InternalGherkin.g:170:1: entryRuleContent returns [EObject current=null] : iv_ruleContent= ruleContent EOF ;
    public final EObject entryRuleContent() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleContent = null;


        try {
            // ../dk.itu.bddcontracts/src-gen/dk/itu/bddcontracts/parser/antlr/internal/InternalGherkin.g:171:2: (iv_ruleContent= ruleContent EOF )
            // ../dk.itu.bddcontracts/src-gen/dk/itu/bddcontracts/parser/antlr/internal/InternalGherkin.g:172:2: iv_ruleContent= ruleContent EOF
            {
             newCompositeNode(grammarAccess.getContentRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleContent_in_entryRuleContent320);
            iv_ruleContent=ruleContent();

            state._fsp--;

             current =iv_ruleContent; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleContent330); 

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
    // $ANTLR end "entryRuleContent"


    // $ANTLR start "ruleContent"
    // ../dk.itu.bddcontracts/src-gen/dk/itu/bddcontracts/parser/antlr/internal/InternalGherkin.g:179:1: ruleContent returns [EObject current=null] : (this_Reference_0= ruleReference | this_Word_1= ruleWord ) ;
    public final EObject ruleContent() throws RecognitionException {
        EObject current = null;

        EObject this_Reference_0 = null;

        EObject this_Word_1 = null;


         enterRule(); 
            
        try {
            // ../dk.itu.bddcontracts/src-gen/dk/itu/bddcontracts/parser/antlr/internal/InternalGherkin.g:182:28: ( (this_Reference_0= ruleReference | this_Word_1= ruleWord ) )
            // ../dk.itu.bddcontracts/src-gen/dk/itu/bddcontracts/parser/antlr/internal/InternalGherkin.g:183:1: (this_Reference_0= ruleReference | this_Word_1= ruleWord )
            {
            // ../dk.itu.bddcontracts/src-gen/dk/itu/bddcontracts/parser/antlr/internal/InternalGherkin.g:183:1: (this_Reference_0= ruleReference | this_Word_1= ruleWord )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==23) ) {
                alt4=1;
            }
            else if ( ((LA4_0>=RULE_STRING && LA4_0<=RULE_ANY_OTHER)) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // ../dk.itu.bddcontracts/src-gen/dk/itu/bddcontracts/parser/antlr/internal/InternalGherkin.g:184:5: this_Reference_0= ruleReference
                    {
                     
                            newCompositeNode(grammarAccess.getContentAccess().getReferenceParserRuleCall_0()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleReference_in_ruleContent377);
                    this_Reference_0=ruleReference();

                    state._fsp--;

                     
                            current = this_Reference_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../dk.itu.bddcontracts/src-gen/dk/itu/bddcontracts/parser/antlr/internal/InternalGherkin.g:194:5: this_Word_1= ruleWord
                    {
                     
                            newCompositeNode(grammarAccess.getContentAccess().getWordParserRuleCall_1()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleWord_in_ruleContent404);
                    this_Word_1=ruleWord();

                    state._fsp--;

                     
                            current = this_Word_1; 
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
    // $ANTLR end "ruleContent"


    // $ANTLR start "entryRuleFeature"
    // ../dk.itu.bddcontracts/src-gen/dk/itu/bddcontracts/parser/antlr/internal/InternalGherkin.g:210:1: entryRuleFeature returns [EObject current=null] : iv_ruleFeature= ruleFeature EOF ;
    public final EObject entryRuleFeature() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFeature = null;


        try {
            // ../dk.itu.bddcontracts/src-gen/dk/itu/bddcontracts/parser/antlr/internal/InternalGherkin.g:211:2: (iv_ruleFeature= ruleFeature EOF )
            // ../dk.itu.bddcontracts/src-gen/dk/itu/bddcontracts/parser/antlr/internal/InternalGherkin.g:212:2: iv_ruleFeature= ruleFeature EOF
            {
             newCompositeNode(grammarAccess.getFeatureRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleFeature_in_entryRuleFeature439);
            iv_ruleFeature=ruleFeature();

            state._fsp--;

             current =iv_ruleFeature; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleFeature449); 

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
    // $ANTLR end "entryRuleFeature"


    // $ANTLR start "ruleFeature"
    // ../dk.itu.bddcontracts/src-gen/dk/itu/bddcontracts/parser/antlr/internal/InternalGherkin.g:219:1: ruleFeature returns [EObject current=null] : (otherlv_0= 'Feature:' ( (lv_description_1_0= ruleEString ) ) ( (lv_summary_2_0= ruleMAny ) )? ( (lv_Background_3_0= ruleBackground ) )? ( ( (lv_Scenarios_4_0= ruleScenario ) ) ( (lv_Scenarios_5_0= ruleScenario ) )* )? ( ( (lv_Behaviors_6_0= ruleBehavior ) ) ( (lv_Behaviors_7_0= ruleBehavior ) )* )? ) ;
    public final EObject ruleFeature() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        AntlrDatatypeRuleToken lv_description_1_0 = null;

        AntlrDatatypeRuleToken lv_summary_2_0 = null;

        EObject lv_Background_3_0 = null;

        EObject lv_Scenarios_4_0 = null;

        EObject lv_Scenarios_5_0 = null;

        EObject lv_Behaviors_6_0 = null;

        EObject lv_Behaviors_7_0 = null;


         enterRule(); 
            
        try {
            // ../dk.itu.bddcontracts/src-gen/dk/itu/bddcontracts/parser/antlr/internal/InternalGherkin.g:222:28: ( (otherlv_0= 'Feature:' ( (lv_description_1_0= ruleEString ) ) ( (lv_summary_2_0= ruleMAny ) )? ( (lv_Background_3_0= ruleBackground ) )? ( ( (lv_Scenarios_4_0= ruleScenario ) ) ( (lv_Scenarios_5_0= ruleScenario ) )* )? ( ( (lv_Behaviors_6_0= ruleBehavior ) ) ( (lv_Behaviors_7_0= ruleBehavior ) )* )? ) )
            // ../dk.itu.bddcontracts/src-gen/dk/itu/bddcontracts/parser/antlr/internal/InternalGherkin.g:223:1: (otherlv_0= 'Feature:' ( (lv_description_1_0= ruleEString ) ) ( (lv_summary_2_0= ruleMAny ) )? ( (lv_Background_3_0= ruleBackground ) )? ( ( (lv_Scenarios_4_0= ruleScenario ) ) ( (lv_Scenarios_5_0= ruleScenario ) )* )? ( ( (lv_Behaviors_6_0= ruleBehavior ) ) ( (lv_Behaviors_7_0= ruleBehavior ) )* )? )
            {
            // ../dk.itu.bddcontracts/src-gen/dk/itu/bddcontracts/parser/antlr/internal/InternalGherkin.g:223:1: (otherlv_0= 'Feature:' ( (lv_description_1_0= ruleEString ) ) ( (lv_summary_2_0= ruleMAny ) )? ( (lv_Background_3_0= ruleBackground ) )? ( ( (lv_Scenarios_4_0= ruleScenario ) ) ( (lv_Scenarios_5_0= ruleScenario ) )* )? ( ( (lv_Behaviors_6_0= ruleBehavior ) ) ( (lv_Behaviors_7_0= ruleBehavior ) )* )? )
            // ../dk.itu.bddcontracts/src-gen/dk/itu/bddcontracts/parser/antlr/internal/InternalGherkin.g:223:3: otherlv_0= 'Feature:' ( (lv_description_1_0= ruleEString ) ) ( (lv_summary_2_0= ruleMAny ) )? ( (lv_Background_3_0= ruleBackground ) )? ( ( (lv_Scenarios_4_0= ruleScenario ) ) ( (lv_Scenarios_5_0= ruleScenario ) )* )? ( ( (lv_Behaviors_6_0= ruleBehavior ) ) ( (lv_Behaviors_7_0= ruleBehavior ) )* )?
            {
            otherlv_0=(Token)match(input,11,FollowSets000.FOLLOW_11_in_ruleFeature486); 

                	newLeafNode(otherlv_0, grammarAccess.getFeatureAccess().getFeatureKeyword_0());
                
            // ../dk.itu.bddcontracts/src-gen/dk/itu/bddcontracts/parser/antlr/internal/InternalGherkin.g:227:1: ( (lv_description_1_0= ruleEString ) )
            // ../dk.itu.bddcontracts/src-gen/dk/itu/bddcontracts/parser/antlr/internal/InternalGherkin.g:228:1: (lv_description_1_0= ruleEString )
            {
            // ../dk.itu.bddcontracts/src-gen/dk/itu/bddcontracts/parser/antlr/internal/InternalGherkin.g:228:1: (lv_description_1_0= ruleEString )
            // ../dk.itu.bddcontracts/src-gen/dk/itu/bddcontracts/parser/antlr/internal/InternalGherkin.g:229:3: lv_description_1_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getFeatureAccess().getDescriptionEStringParserRuleCall_1_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleFeature507);
            lv_description_1_0=ruleEString();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getFeatureRule());
            	        }
                   		set(
                   			current, 
                   			"description",
                    		lv_description_1_0, 
                    		"EString");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../dk.itu.bddcontracts/src-gen/dk/itu/bddcontracts/parser/antlr/internal/InternalGherkin.g:245:2: ( (lv_summary_2_0= ruleMAny ) )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( ((LA5_0>=RULE_STRING && LA5_0<=RULE_ANY_OTHER)) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // ../dk.itu.bddcontracts/src-gen/dk/itu/bddcontracts/parser/antlr/internal/InternalGherkin.g:246:1: (lv_summary_2_0= ruleMAny )
                    {
                    // ../dk.itu.bddcontracts/src-gen/dk/itu/bddcontracts/parser/antlr/internal/InternalGherkin.g:246:1: (lv_summary_2_0= ruleMAny )
                    // ../dk.itu.bddcontracts/src-gen/dk/itu/bddcontracts/parser/antlr/internal/InternalGherkin.g:247:3: lv_summary_2_0= ruleMAny
                    {
                     
                    	        newCompositeNode(grammarAccess.getFeatureAccess().getSummaryMAnyParserRuleCall_2_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleMAny_in_ruleFeature528);
                    lv_summary_2_0=ruleMAny();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getFeatureRule());
                    	        }
                           		set(
                           			current, 
                           			"summary",
                            		lv_summary_2_0, 
                            		"MAny");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }
                    break;

            }

            // ../dk.itu.bddcontracts/src-gen/dk/itu/bddcontracts/parser/antlr/internal/InternalGherkin.g:263:3: ( (lv_Background_3_0= ruleBackground ) )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==12) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // ../dk.itu.bddcontracts/src-gen/dk/itu/bddcontracts/parser/antlr/internal/InternalGherkin.g:264:1: (lv_Background_3_0= ruleBackground )
                    {
                    // ../dk.itu.bddcontracts/src-gen/dk/itu/bddcontracts/parser/antlr/internal/InternalGherkin.g:264:1: (lv_Background_3_0= ruleBackground )
                    // ../dk.itu.bddcontracts/src-gen/dk/itu/bddcontracts/parser/antlr/internal/InternalGherkin.g:265:3: lv_Background_3_0= ruleBackground
                    {
                     
                    	        newCompositeNode(grammarAccess.getFeatureAccess().getBackgroundBackgroundParserRuleCall_3_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleBackground_in_ruleFeature550);
                    lv_Background_3_0=ruleBackground();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getFeatureRule());
                    	        }
                           		set(
                           			current, 
                           			"Background",
                            		lv_Background_3_0, 
                            		"Background");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }
                    break;

            }

            // ../dk.itu.bddcontracts/src-gen/dk/itu/bddcontracts/parser/antlr/internal/InternalGherkin.g:281:3: ( ( (lv_Scenarios_4_0= ruleScenario ) ) ( (lv_Scenarios_5_0= ruleScenario ) )* )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==18||LA8_0==21) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // ../dk.itu.bddcontracts/src-gen/dk/itu/bddcontracts/parser/antlr/internal/InternalGherkin.g:281:4: ( (lv_Scenarios_4_0= ruleScenario ) ) ( (lv_Scenarios_5_0= ruleScenario ) )*
                    {
                    // ../dk.itu.bddcontracts/src-gen/dk/itu/bddcontracts/parser/antlr/internal/InternalGherkin.g:281:4: ( (lv_Scenarios_4_0= ruleScenario ) )
                    // ../dk.itu.bddcontracts/src-gen/dk/itu/bddcontracts/parser/antlr/internal/InternalGherkin.g:282:1: (lv_Scenarios_4_0= ruleScenario )
                    {
                    // ../dk.itu.bddcontracts/src-gen/dk/itu/bddcontracts/parser/antlr/internal/InternalGherkin.g:282:1: (lv_Scenarios_4_0= ruleScenario )
                    // ../dk.itu.bddcontracts/src-gen/dk/itu/bddcontracts/parser/antlr/internal/InternalGherkin.g:283:3: lv_Scenarios_4_0= ruleScenario
                    {
                     
                    	        newCompositeNode(grammarAccess.getFeatureAccess().getScenariosScenarioParserRuleCall_4_0_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleScenario_in_ruleFeature573);
                    lv_Scenarios_4_0=ruleScenario();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getFeatureRule());
                    	        }
                           		add(
                           			current, 
                           			"Scenarios",
                            		lv_Scenarios_4_0, 
                            		"Scenario");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../dk.itu.bddcontracts/src-gen/dk/itu/bddcontracts/parser/antlr/internal/InternalGherkin.g:299:2: ( (lv_Scenarios_5_0= ruleScenario ) )*
                    loop7:
                    do {
                        int alt7=2;
                        int LA7_0 = input.LA(1);

                        if ( (LA7_0==18||LA7_0==21) ) {
                            alt7=1;
                        }


                        switch (alt7) {
                    	case 1 :
                    	    // ../dk.itu.bddcontracts/src-gen/dk/itu/bddcontracts/parser/antlr/internal/InternalGherkin.g:300:1: (lv_Scenarios_5_0= ruleScenario )
                    	    {
                    	    // ../dk.itu.bddcontracts/src-gen/dk/itu/bddcontracts/parser/antlr/internal/InternalGherkin.g:300:1: (lv_Scenarios_5_0= ruleScenario )
                    	    // ../dk.itu.bddcontracts/src-gen/dk/itu/bddcontracts/parser/antlr/internal/InternalGherkin.g:301:3: lv_Scenarios_5_0= ruleScenario
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getFeatureAccess().getScenariosScenarioParserRuleCall_4_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleScenario_in_ruleFeature594);
                    	    lv_Scenarios_5_0=ruleScenario();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getFeatureRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"Scenarios",
                    	            		lv_Scenarios_5_0, 
                    	            		"Scenario");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop7;
                        }
                    } while (true);


                    }
                    break;

            }

            // ../dk.itu.bddcontracts/src-gen/dk/itu/bddcontracts/parser/antlr/internal/InternalGherkin.g:317:5: ( ( (lv_Behaviors_6_0= ruleBehavior ) ) ( (lv_Behaviors_7_0= ruleBehavior ) )* )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==15) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // ../dk.itu.bddcontracts/src-gen/dk/itu/bddcontracts/parser/antlr/internal/InternalGherkin.g:317:6: ( (lv_Behaviors_6_0= ruleBehavior ) ) ( (lv_Behaviors_7_0= ruleBehavior ) )*
                    {
                    // ../dk.itu.bddcontracts/src-gen/dk/itu/bddcontracts/parser/antlr/internal/InternalGherkin.g:317:6: ( (lv_Behaviors_6_0= ruleBehavior ) )
                    // ../dk.itu.bddcontracts/src-gen/dk/itu/bddcontracts/parser/antlr/internal/InternalGherkin.g:318:1: (lv_Behaviors_6_0= ruleBehavior )
                    {
                    // ../dk.itu.bddcontracts/src-gen/dk/itu/bddcontracts/parser/antlr/internal/InternalGherkin.g:318:1: (lv_Behaviors_6_0= ruleBehavior )
                    // ../dk.itu.bddcontracts/src-gen/dk/itu/bddcontracts/parser/antlr/internal/InternalGherkin.g:319:3: lv_Behaviors_6_0= ruleBehavior
                    {
                     
                    	        newCompositeNode(grammarAccess.getFeatureAccess().getBehaviorsBehaviorParserRuleCall_5_0_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleBehavior_in_ruleFeature619);
                    lv_Behaviors_6_0=ruleBehavior();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getFeatureRule());
                    	        }
                           		add(
                           			current, 
                           			"Behaviors",
                            		lv_Behaviors_6_0, 
                            		"Behavior");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../dk.itu.bddcontracts/src-gen/dk/itu/bddcontracts/parser/antlr/internal/InternalGherkin.g:335:2: ( (lv_Behaviors_7_0= ruleBehavior ) )*
                    loop9:
                    do {
                        int alt9=2;
                        int LA9_0 = input.LA(1);

                        if ( (LA9_0==15) ) {
                            alt9=1;
                        }


                        switch (alt9) {
                    	case 1 :
                    	    // ../dk.itu.bddcontracts/src-gen/dk/itu/bddcontracts/parser/antlr/internal/InternalGherkin.g:336:1: (lv_Behaviors_7_0= ruleBehavior )
                    	    {
                    	    // ../dk.itu.bddcontracts/src-gen/dk/itu/bddcontracts/parser/antlr/internal/InternalGherkin.g:336:1: (lv_Behaviors_7_0= ruleBehavior )
                    	    // ../dk.itu.bddcontracts/src-gen/dk/itu/bddcontracts/parser/antlr/internal/InternalGherkin.g:337:3: lv_Behaviors_7_0= ruleBehavior
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getFeatureAccess().getBehaviorsBehaviorParserRuleCall_5_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleBehavior_in_ruleFeature640);
                    	    lv_Behaviors_7_0=ruleBehavior();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getFeatureRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"Behaviors",
                    	            		lv_Behaviors_7_0, 
                    	            		"Behavior");
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
    // $ANTLR end "ruleFeature"


    // $ANTLR start "entryRuleEString"
    // ../dk.itu.bddcontracts/src-gen/dk/itu/bddcontracts/parser/antlr/internal/InternalGherkin.g:361:1: entryRuleEString returns [String current=null] : iv_ruleEString= ruleEString EOF ;
    public final String entryRuleEString() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEString = null;


        try {
            // ../dk.itu.bddcontracts/src-gen/dk/itu/bddcontracts/parser/antlr/internal/InternalGherkin.g:362:2: (iv_ruleEString= ruleEString EOF )
            // ../dk.itu.bddcontracts/src-gen/dk/itu/bddcontracts/parser/antlr/internal/InternalGherkin.g:363:2: iv_ruleEString= ruleEString EOF
            {
             newCompositeNode(grammarAccess.getEStringRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_entryRuleEString680);
            iv_ruleEString=ruleEString();

            state._fsp--;

             current =iv_ruleEString.getText(); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleEString691); 

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
    // ../dk.itu.bddcontracts/src-gen/dk/itu/bddcontracts/parser/antlr/internal/InternalGherkin.g:370:1: ruleEString returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID | this_INT_2= RULE_INT ) ;
    public final AntlrDatatypeRuleToken ruleEString() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;
        Token this_ID_1=null;
        Token this_INT_2=null;

         enterRule(); 
            
        try {
            // ../dk.itu.bddcontracts/src-gen/dk/itu/bddcontracts/parser/antlr/internal/InternalGherkin.g:373:28: ( (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID | this_INT_2= RULE_INT ) )
            // ../dk.itu.bddcontracts/src-gen/dk/itu/bddcontracts/parser/antlr/internal/InternalGherkin.g:374:1: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID | this_INT_2= RULE_INT )
            {
            // ../dk.itu.bddcontracts/src-gen/dk/itu/bddcontracts/parser/antlr/internal/InternalGherkin.g:374:1: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID | this_INT_2= RULE_INT )
            int alt11=3;
            switch ( input.LA(1) ) {
            case RULE_STRING:
                {
                alt11=1;
                }
                break;
            case RULE_ID:
                {
                alt11=2;
                }
                break;
            case RULE_INT:
                {
                alt11=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }

            switch (alt11) {
                case 1 :
                    // ../dk.itu.bddcontracts/src-gen/dk/itu/bddcontracts/parser/antlr/internal/InternalGherkin.g:374:6: this_STRING_0= RULE_STRING
                    {
                    this_STRING_0=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_RULE_STRING_in_ruleEString731); 

                    		current.merge(this_STRING_0);
                        
                     
                        newLeafNode(this_STRING_0, grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 
                        

                    }
                    break;
                case 2 :
                    // ../dk.itu.bddcontracts/src-gen/dk/itu/bddcontracts/parser/antlr/internal/InternalGherkin.g:382:10: this_ID_1= RULE_ID
                    {
                    this_ID_1=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleEString757); 

                    		current.merge(this_ID_1);
                        
                     
                        newLeafNode(this_ID_1, grammarAccess.getEStringAccess().getIDTerminalRuleCall_1()); 
                        

                    }
                    break;
                case 3 :
                    // ../dk.itu.bddcontracts/src-gen/dk/itu/bddcontracts/parser/antlr/internal/InternalGherkin.g:390:10: this_INT_2= RULE_INT
                    {
                    this_INT_2=(Token)match(input,RULE_INT,FollowSets000.FOLLOW_RULE_INT_in_ruleEString783); 

                    		current.merge(this_INT_2);
                        
                     
                        newLeafNode(this_INT_2, grammarAccess.getEStringAccess().getINTTerminalRuleCall_2()); 
                        

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


    // $ANTLR start "entryRuleMAny"
    // ../dk.itu.bddcontracts/src-gen/dk/itu/bddcontracts/parser/antlr/internal/InternalGherkin.g:405:1: entryRuleMAny returns [String current=null] : iv_ruleMAny= ruleMAny EOF ;
    public final String entryRuleMAny() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleMAny = null;


        try {
            // ../dk.itu.bddcontracts/src-gen/dk/itu/bddcontracts/parser/antlr/internal/InternalGherkin.g:406:2: (iv_ruleMAny= ruleMAny EOF )
            // ../dk.itu.bddcontracts/src-gen/dk/itu/bddcontracts/parser/antlr/internal/InternalGherkin.g:407:2: iv_ruleMAny= ruleMAny EOF
            {
             newCompositeNode(grammarAccess.getMAnyRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleMAny_in_entryRuleMAny829);
            iv_ruleMAny=ruleMAny();

            state._fsp--;

             current =iv_ruleMAny.getText(); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleMAny840); 

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
    // $ANTLR end "entryRuleMAny"


    // $ANTLR start "ruleMAny"
    // ../dk.itu.bddcontracts/src-gen/dk/itu/bddcontracts/parser/antlr/internal/InternalGherkin.g:414:1: ruleMAny returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_Any_0= ruleAny )+ ;
    public final AntlrDatatypeRuleToken ruleMAny() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        AntlrDatatypeRuleToken this_Any_0 = null;


         enterRule(); 
            
        try {
            // ../dk.itu.bddcontracts/src-gen/dk/itu/bddcontracts/parser/antlr/internal/InternalGherkin.g:417:28: ( (this_Any_0= ruleAny )+ )
            // ../dk.itu.bddcontracts/src-gen/dk/itu/bddcontracts/parser/antlr/internal/InternalGherkin.g:418:1: (this_Any_0= ruleAny )+
            {
            // ../dk.itu.bddcontracts/src-gen/dk/itu/bddcontracts/parser/antlr/internal/InternalGherkin.g:418:1: (this_Any_0= ruleAny )+
            int cnt12=0;
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( ((LA12_0>=RULE_STRING && LA12_0<=RULE_ANY_OTHER)) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // ../dk.itu.bddcontracts/src-gen/dk/itu/bddcontracts/parser/antlr/internal/InternalGherkin.g:419:5: this_Any_0= ruleAny
            	    {
            	     
            	            newCompositeNode(grammarAccess.getMAnyAccess().getAnyParserRuleCall()); 
            	        
            	    pushFollow(FollowSets000.FOLLOW_ruleAny_in_ruleMAny887);
            	    this_Any_0=ruleAny();

            	    state._fsp--;


            	    		current.merge(this_Any_0);
            	        
            	     
            	            afterParserOrEnumRuleCall();
            	        

            	    }
            	    break;

            	default :
            	    if ( cnt12 >= 1 ) break loop12;
                        EarlyExitException eee =
                            new EarlyExitException(12, input);
                        throw eee;
                }
                cnt12++;
            } while (true);


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
    // $ANTLR end "ruleMAny"


    // $ANTLR start "entryRuleAny"
    // ../dk.itu.bddcontracts/src-gen/dk/itu/bddcontracts/parser/antlr/internal/InternalGherkin.g:437:1: entryRuleAny returns [String current=null] : iv_ruleAny= ruleAny EOF ;
    public final String entryRuleAny() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleAny = null;


        try {
            // ../dk.itu.bddcontracts/src-gen/dk/itu/bddcontracts/parser/antlr/internal/InternalGherkin.g:438:2: (iv_ruleAny= ruleAny EOF )
            // ../dk.itu.bddcontracts/src-gen/dk/itu/bddcontracts/parser/antlr/internal/InternalGherkin.g:439:2: iv_ruleAny= ruleAny EOF
            {
             newCompositeNode(grammarAccess.getAnyRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleAny_in_entryRuleAny934);
            iv_ruleAny=ruleAny();

            state._fsp--;

             current =iv_ruleAny.getText(); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleAny945); 

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
    // $ANTLR end "entryRuleAny"


    // $ANTLR start "ruleAny"
    // ../dk.itu.bddcontracts/src-gen/dk/itu/bddcontracts/parser/antlr/internal/InternalGherkin.g:446:1: ruleAny returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID | this_INT_1= RULE_INT | this_STRING_2= RULE_STRING | this_ANY_OTHER_3= RULE_ANY_OTHER ) ;
    public final AntlrDatatypeRuleToken ruleAny() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token this_INT_1=null;
        Token this_STRING_2=null;
        Token this_ANY_OTHER_3=null;

         enterRule(); 
            
        try {
            // ../dk.itu.bddcontracts/src-gen/dk/itu/bddcontracts/parser/antlr/internal/InternalGherkin.g:449:28: ( (this_ID_0= RULE_ID | this_INT_1= RULE_INT | this_STRING_2= RULE_STRING | this_ANY_OTHER_3= RULE_ANY_OTHER ) )
            // ../dk.itu.bddcontracts/src-gen/dk/itu/bddcontracts/parser/antlr/internal/InternalGherkin.g:450:1: (this_ID_0= RULE_ID | this_INT_1= RULE_INT | this_STRING_2= RULE_STRING | this_ANY_OTHER_3= RULE_ANY_OTHER )
            {
            // ../dk.itu.bddcontracts/src-gen/dk/itu/bddcontracts/parser/antlr/internal/InternalGherkin.g:450:1: (this_ID_0= RULE_ID | this_INT_1= RULE_INT | this_STRING_2= RULE_STRING | this_ANY_OTHER_3= RULE_ANY_OTHER )
            int alt13=4;
            switch ( input.LA(1) ) {
            case RULE_ID:
                {
                alt13=1;
                }
                break;
            case RULE_INT:
                {
                alt13=2;
                }
                break;
            case RULE_STRING:
                {
                alt13=3;
                }
                break;
            case RULE_ANY_OTHER:
                {
                alt13=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 13, 0, input);

                throw nvae;
            }

            switch (alt13) {
                case 1 :
                    // ../dk.itu.bddcontracts/src-gen/dk/itu/bddcontracts/parser/antlr/internal/InternalGherkin.g:450:6: this_ID_0= RULE_ID
                    {
                    this_ID_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleAny985); 

                    		current.merge(this_ID_0);
                        
                     
                        newLeafNode(this_ID_0, grammarAccess.getAnyAccess().getIDTerminalRuleCall_0()); 
                        

                    }
                    break;
                case 2 :
                    // ../dk.itu.bddcontracts/src-gen/dk/itu/bddcontracts/parser/antlr/internal/InternalGherkin.g:458:10: this_INT_1= RULE_INT
                    {
                    this_INT_1=(Token)match(input,RULE_INT,FollowSets000.FOLLOW_RULE_INT_in_ruleAny1011); 

                    		current.merge(this_INT_1);
                        
                     
                        newLeafNode(this_INT_1, grammarAccess.getAnyAccess().getINTTerminalRuleCall_1()); 
                        

                    }
                    break;
                case 3 :
                    // ../dk.itu.bddcontracts/src-gen/dk/itu/bddcontracts/parser/antlr/internal/InternalGherkin.g:466:10: this_STRING_2= RULE_STRING
                    {
                    this_STRING_2=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_RULE_STRING_in_ruleAny1037); 

                    		current.merge(this_STRING_2);
                        
                     
                        newLeafNode(this_STRING_2, grammarAccess.getAnyAccess().getSTRINGTerminalRuleCall_2()); 
                        

                    }
                    break;
                case 4 :
                    // ../dk.itu.bddcontracts/src-gen/dk/itu/bddcontracts/parser/antlr/internal/InternalGherkin.g:474:10: this_ANY_OTHER_3= RULE_ANY_OTHER
                    {
                    this_ANY_OTHER_3=(Token)match(input,RULE_ANY_OTHER,FollowSets000.FOLLOW_RULE_ANY_OTHER_in_ruleAny1063); 

                    		current.merge(this_ANY_OTHER_3);
                        
                     
                        newLeafNode(this_ANY_OTHER_3, grammarAccess.getAnyAccess().getANY_OTHERTerminalRuleCall_3()); 
                        

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
    // $ANTLR end "ruleAny"


    // $ANTLR start "entryRuleBackground"
    // ../dk.itu.bddcontracts/src-gen/dk/itu/bddcontracts/parser/antlr/internal/InternalGherkin.g:489:1: entryRuleBackground returns [EObject current=null] : iv_ruleBackground= ruleBackground EOF ;
    public final EObject entryRuleBackground() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBackground = null;


        try {
            // ../dk.itu.bddcontracts/src-gen/dk/itu/bddcontracts/parser/antlr/internal/InternalGherkin.g:490:2: (iv_ruleBackground= ruleBackground EOF )
            // ../dk.itu.bddcontracts/src-gen/dk/itu/bddcontracts/parser/antlr/internal/InternalGherkin.g:491:2: iv_ruleBackground= ruleBackground EOF
            {
             newCompositeNode(grammarAccess.getBackgroundRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleBackground_in_entryRuleBackground1108);
            iv_ruleBackground=ruleBackground();

            state._fsp--;

             current =iv_ruleBackground; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleBackground1118); 

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
    // $ANTLR end "entryRuleBackground"


    // $ANTLR start "ruleBackground"
    // ../dk.itu.bddcontracts/src-gen/dk/itu/bddcontracts/parser/antlr/internal/InternalGherkin.g:498:1: ruleBackground returns [EObject current=null] : (otherlv_0= 'Background:' otherlv_1= 'Given' ( (lv_GivenBlocks_2_0= ruleSentence ) ) (otherlv_3= 'And' ( (lv_GivenBlocks_4_0= ruleSentence ) ) )* ) ;
    public final EObject ruleBackground() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_GivenBlocks_2_0 = null;

        EObject lv_GivenBlocks_4_0 = null;


         enterRule(); 
            
        try {
            // ../dk.itu.bddcontracts/src-gen/dk/itu/bddcontracts/parser/antlr/internal/InternalGherkin.g:501:28: ( (otherlv_0= 'Background:' otherlv_1= 'Given' ( (lv_GivenBlocks_2_0= ruleSentence ) ) (otherlv_3= 'And' ( (lv_GivenBlocks_4_0= ruleSentence ) ) )* ) )
            // ../dk.itu.bddcontracts/src-gen/dk/itu/bddcontracts/parser/antlr/internal/InternalGherkin.g:502:1: (otherlv_0= 'Background:' otherlv_1= 'Given' ( (lv_GivenBlocks_2_0= ruleSentence ) ) (otherlv_3= 'And' ( (lv_GivenBlocks_4_0= ruleSentence ) ) )* )
            {
            // ../dk.itu.bddcontracts/src-gen/dk/itu/bddcontracts/parser/antlr/internal/InternalGherkin.g:502:1: (otherlv_0= 'Background:' otherlv_1= 'Given' ( (lv_GivenBlocks_2_0= ruleSentence ) ) (otherlv_3= 'And' ( (lv_GivenBlocks_4_0= ruleSentence ) ) )* )
            // ../dk.itu.bddcontracts/src-gen/dk/itu/bddcontracts/parser/antlr/internal/InternalGherkin.g:502:3: otherlv_0= 'Background:' otherlv_1= 'Given' ( (lv_GivenBlocks_2_0= ruleSentence ) ) (otherlv_3= 'And' ( (lv_GivenBlocks_4_0= ruleSentence ) ) )*
            {
            otherlv_0=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleBackground1155); 

                	newLeafNode(otherlv_0, grammarAccess.getBackgroundAccess().getBackgroundKeyword_0());
                
            otherlv_1=(Token)match(input,13,FollowSets000.FOLLOW_13_in_ruleBackground1167); 

                	newLeafNode(otherlv_1, grammarAccess.getBackgroundAccess().getGivenKeyword_1());
                
            // ../dk.itu.bddcontracts/src-gen/dk/itu/bddcontracts/parser/antlr/internal/InternalGherkin.g:510:1: ( (lv_GivenBlocks_2_0= ruleSentence ) )
            // ../dk.itu.bddcontracts/src-gen/dk/itu/bddcontracts/parser/antlr/internal/InternalGherkin.g:511:1: (lv_GivenBlocks_2_0= ruleSentence )
            {
            // ../dk.itu.bddcontracts/src-gen/dk/itu/bddcontracts/parser/antlr/internal/InternalGherkin.g:511:1: (lv_GivenBlocks_2_0= ruleSentence )
            // ../dk.itu.bddcontracts/src-gen/dk/itu/bddcontracts/parser/antlr/internal/InternalGherkin.g:512:3: lv_GivenBlocks_2_0= ruleSentence
            {
             
            	        newCompositeNode(grammarAccess.getBackgroundAccess().getGivenBlocksSentenceParserRuleCall_2_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleSentence_in_ruleBackground1188);
            lv_GivenBlocks_2_0=ruleSentence();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getBackgroundRule());
            	        }
                   		add(
                   			current, 
                   			"GivenBlocks",
                    		lv_GivenBlocks_2_0, 
                    		"Sentence");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../dk.itu.bddcontracts/src-gen/dk/itu/bddcontracts/parser/antlr/internal/InternalGherkin.g:528:2: (otherlv_3= 'And' ( (lv_GivenBlocks_4_0= ruleSentence ) ) )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==14) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // ../dk.itu.bddcontracts/src-gen/dk/itu/bddcontracts/parser/antlr/internal/InternalGherkin.g:528:4: otherlv_3= 'And' ( (lv_GivenBlocks_4_0= ruleSentence ) )
            	    {
            	    otherlv_3=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleBackground1201); 

            	        	newLeafNode(otherlv_3, grammarAccess.getBackgroundAccess().getAndKeyword_3_0());
            	        
            	    // ../dk.itu.bddcontracts/src-gen/dk/itu/bddcontracts/parser/antlr/internal/InternalGherkin.g:532:1: ( (lv_GivenBlocks_4_0= ruleSentence ) )
            	    // ../dk.itu.bddcontracts/src-gen/dk/itu/bddcontracts/parser/antlr/internal/InternalGherkin.g:533:1: (lv_GivenBlocks_4_0= ruleSentence )
            	    {
            	    // ../dk.itu.bddcontracts/src-gen/dk/itu/bddcontracts/parser/antlr/internal/InternalGherkin.g:533:1: (lv_GivenBlocks_4_0= ruleSentence )
            	    // ../dk.itu.bddcontracts/src-gen/dk/itu/bddcontracts/parser/antlr/internal/InternalGherkin.g:534:3: lv_GivenBlocks_4_0= ruleSentence
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getBackgroundAccess().getGivenBlocksSentenceParserRuleCall_3_1_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_ruleSentence_in_ruleBackground1222);
            	    lv_GivenBlocks_4_0=ruleSentence();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getBackgroundRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"GivenBlocks",
            	            		lv_GivenBlocks_4_0, 
            	            		"Sentence");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop14;
                }
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
    // $ANTLR end "ruleBackground"


    // $ANTLR start "entryRuleBehavior"
    // ../dk.itu.bddcontracts/src-gen/dk/itu/bddcontracts/parser/antlr/internal/InternalGherkin.g:558:1: entryRuleBehavior returns [EObject current=null] : iv_ruleBehavior= ruleBehavior EOF ;
    public final EObject entryRuleBehavior() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBehavior = null;


        try {
            // ../dk.itu.bddcontracts/src-gen/dk/itu/bddcontracts/parser/antlr/internal/InternalGherkin.g:559:2: (iv_ruleBehavior= ruleBehavior EOF )
            // ../dk.itu.bddcontracts/src-gen/dk/itu/bddcontracts/parser/antlr/internal/InternalGherkin.g:560:2: iv_ruleBehavior= ruleBehavior EOF
            {
             newCompositeNode(grammarAccess.getBehaviorRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleBehavior_in_entryRuleBehavior1260);
            iv_ruleBehavior=ruleBehavior();

            state._fsp--;

             current =iv_ruleBehavior; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleBehavior1270); 

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
    // ../dk.itu.bddcontracts/src-gen/dk/itu/bddcontracts/parser/antlr/internal/InternalGherkin.g:567:1: ruleBehavior returns [EObject current=null] : (otherlv_0= 'Behavior:' ( (lv_description_1_0= ruleMAny ) ) (otherlv_2= 'Requiring' ( (lv_RequiringBlocks_3_0= ruleSentence ) ) (otherlv_4= 'And' ( (lv_RequiringBlocks_5_0= ruleSentence ) ) )* )? (otherlv_6= 'Ensuring' ( (lv_EnsuringBlocks_7_0= ruleSentence ) ) (otherlv_8= 'And' ( (lv_EnsuringBlocks_9_0= ruleSentence ) ) )* )? ) ;
    public final EObject ruleBehavior() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        AntlrDatatypeRuleToken lv_description_1_0 = null;

        EObject lv_RequiringBlocks_3_0 = null;

        EObject lv_RequiringBlocks_5_0 = null;

        EObject lv_EnsuringBlocks_7_0 = null;

        EObject lv_EnsuringBlocks_9_0 = null;


         enterRule(); 
            
        try {
            // ../dk.itu.bddcontracts/src-gen/dk/itu/bddcontracts/parser/antlr/internal/InternalGherkin.g:570:28: ( (otherlv_0= 'Behavior:' ( (lv_description_1_0= ruleMAny ) ) (otherlv_2= 'Requiring' ( (lv_RequiringBlocks_3_0= ruleSentence ) ) (otherlv_4= 'And' ( (lv_RequiringBlocks_5_0= ruleSentence ) ) )* )? (otherlv_6= 'Ensuring' ( (lv_EnsuringBlocks_7_0= ruleSentence ) ) (otherlv_8= 'And' ( (lv_EnsuringBlocks_9_0= ruleSentence ) ) )* )? ) )
            // ../dk.itu.bddcontracts/src-gen/dk/itu/bddcontracts/parser/antlr/internal/InternalGherkin.g:571:1: (otherlv_0= 'Behavior:' ( (lv_description_1_0= ruleMAny ) ) (otherlv_2= 'Requiring' ( (lv_RequiringBlocks_3_0= ruleSentence ) ) (otherlv_4= 'And' ( (lv_RequiringBlocks_5_0= ruleSentence ) ) )* )? (otherlv_6= 'Ensuring' ( (lv_EnsuringBlocks_7_0= ruleSentence ) ) (otherlv_8= 'And' ( (lv_EnsuringBlocks_9_0= ruleSentence ) ) )* )? )
            {
            // ../dk.itu.bddcontracts/src-gen/dk/itu/bddcontracts/parser/antlr/internal/InternalGherkin.g:571:1: (otherlv_0= 'Behavior:' ( (lv_description_1_0= ruleMAny ) ) (otherlv_2= 'Requiring' ( (lv_RequiringBlocks_3_0= ruleSentence ) ) (otherlv_4= 'And' ( (lv_RequiringBlocks_5_0= ruleSentence ) ) )* )? (otherlv_6= 'Ensuring' ( (lv_EnsuringBlocks_7_0= ruleSentence ) ) (otherlv_8= 'And' ( (lv_EnsuringBlocks_9_0= ruleSentence ) ) )* )? )
            // ../dk.itu.bddcontracts/src-gen/dk/itu/bddcontracts/parser/antlr/internal/InternalGherkin.g:571:3: otherlv_0= 'Behavior:' ( (lv_description_1_0= ruleMAny ) ) (otherlv_2= 'Requiring' ( (lv_RequiringBlocks_3_0= ruleSentence ) ) (otherlv_4= 'And' ( (lv_RequiringBlocks_5_0= ruleSentence ) ) )* )? (otherlv_6= 'Ensuring' ( (lv_EnsuringBlocks_7_0= ruleSentence ) ) (otherlv_8= 'And' ( (lv_EnsuringBlocks_9_0= ruleSentence ) ) )* )?
            {
            otherlv_0=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleBehavior1307); 

                	newLeafNode(otherlv_0, grammarAccess.getBehaviorAccess().getBehaviorKeyword_0());
                
            // ../dk.itu.bddcontracts/src-gen/dk/itu/bddcontracts/parser/antlr/internal/InternalGherkin.g:575:1: ( (lv_description_1_0= ruleMAny ) )
            // ../dk.itu.bddcontracts/src-gen/dk/itu/bddcontracts/parser/antlr/internal/InternalGherkin.g:576:1: (lv_description_1_0= ruleMAny )
            {
            // ../dk.itu.bddcontracts/src-gen/dk/itu/bddcontracts/parser/antlr/internal/InternalGherkin.g:576:1: (lv_description_1_0= ruleMAny )
            // ../dk.itu.bddcontracts/src-gen/dk/itu/bddcontracts/parser/antlr/internal/InternalGherkin.g:577:3: lv_description_1_0= ruleMAny
            {
             
            	        newCompositeNode(grammarAccess.getBehaviorAccess().getDescriptionMAnyParserRuleCall_1_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleMAny_in_ruleBehavior1328);
            lv_description_1_0=ruleMAny();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getBehaviorRule());
            	        }
                   		set(
                   			current, 
                   			"description",
                    		lv_description_1_0, 
                    		"MAny");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../dk.itu.bddcontracts/src-gen/dk/itu/bddcontracts/parser/antlr/internal/InternalGherkin.g:593:2: (otherlv_2= 'Requiring' ( (lv_RequiringBlocks_3_0= ruleSentence ) ) (otherlv_4= 'And' ( (lv_RequiringBlocks_5_0= ruleSentence ) ) )* )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==16) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // ../dk.itu.bddcontracts/src-gen/dk/itu/bddcontracts/parser/antlr/internal/InternalGherkin.g:593:4: otherlv_2= 'Requiring' ( (lv_RequiringBlocks_3_0= ruleSentence ) ) (otherlv_4= 'And' ( (lv_RequiringBlocks_5_0= ruleSentence ) ) )*
                    {
                    otherlv_2=(Token)match(input,16,FollowSets000.FOLLOW_16_in_ruleBehavior1341); 

                        	newLeafNode(otherlv_2, grammarAccess.getBehaviorAccess().getRequiringKeyword_2_0());
                        
                    // ../dk.itu.bddcontracts/src-gen/dk/itu/bddcontracts/parser/antlr/internal/InternalGherkin.g:597:1: ( (lv_RequiringBlocks_3_0= ruleSentence ) )
                    // ../dk.itu.bddcontracts/src-gen/dk/itu/bddcontracts/parser/antlr/internal/InternalGherkin.g:598:1: (lv_RequiringBlocks_3_0= ruleSentence )
                    {
                    // ../dk.itu.bddcontracts/src-gen/dk/itu/bddcontracts/parser/antlr/internal/InternalGherkin.g:598:1: (lv_RequiringBlocks_3_0= ruleSentence )
                    // ../dk.itu.bddcontracts/src-gen/dk/itu/bddcontracts/parser/antlr/internal/InternalGherkin.g:599:3: lv_RequiringBlocks_3_0= ruleSentence
                    {
                     
                    	        newCompositeNode(grammarAccess.getBehaviorAccess().getRequiringBlocksSentenceParserRuleCall_2_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleSentence_in_ruleBehavior1362);
                    lv_RequiringBlocks_3_0=ruleSentence();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getBehaviorRule());
                    	        }
                           		add(
                           			current, 
                           			"RequiringBlocks",
                            		lv_RequiringBlocks_3_0, 
                            		"Sentence");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../dk.itu.bddcontracts/src-gen/dk/itu/bddcontracts/parser/antlr/internal/InternalGherkin.g:615:2: (otherlv_4= 'And' ( (lv_RequiringBlocks_5_0= ruleSentence ) ) )*
                    loop15:
                    do {
                        int alt15=2;
                        int LA15_0 = input.LA(1);

                        if ( (LA15_0==14) ) {
                            alt15=1;
                        }


                        switch (alt15) {
                    	case 1 :
                    	    // ../dk.itu.bddcontracts/src-gen/dk/itu/bddcontracts/parser/antlr/internal/InternalGherkin.g:615:4: otherlv_4= 'And' ( (lv_RequiringBlocks_5_0= ruleSentence ) )
                    	    {
                    	    otherlv_4=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleBehavior1375); 

                    	        	newLeafNode(otherlv_4, grammarAccess.getBehaviorAccess().getAndKeyword_2_2_0());
                    	        
                    	    // ../dk.itu.bddcontracts/src-gen/dk/itu/bddcontracts/parser/antlr/internal/InternalGherkin.g:619:1: ( (lv_RequiringBlocks_5_0= ruleSentence ) )
                    	    // ../dk.itu.bddcontracts/src-gen/dk/itu/bddcontracts/parser/antlr/internal/InternalGherkin.g:620:1: (lv_RequiringBlocks_5_0= ruleSentence )
                    	    {
                    	    // ../dk.itu.bddcontracts/src-gen/dk/itu/bddcontracts/parser/antlr/internal/InternalGherkin.g:620:1: (lv_RequiringBlocks_5_0= ruleSentence )
                    	    // ../dk.itu.bddcontracts/src-gen/dk/itu/bddcontracts/parser/antlr/internal/InternalGherkin.g:621:3: lv_RequiringBlocks_5_0= ruleSentence
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getBehaviorAccess().getRequiringBlocksSentenceParserRuleCall_2_2_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleSentence_in_ruleBehavior1396);
                    	    lv_RequiringBlocks_5_0=ruleSentence();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getBehaviorRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"RequiringBlocks",
                    	            		lv_RequiringBlocks_5_0, 
                    	            		"Sentence");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop15;
                        }
                    } while (true);


                    }
                    break;

            }

            // ../dk.itu.bddcontracts/src-gen/dk/itu/bddcontracts/parser/antlr/internal/InternalGherkin.g:637:6: (otherlv_6= 'Ensuring' ( (lv_EnsuringBlocks_7_0= ruleSentence ) ) (otherlv_8= 'And' ( (lv_EnsuringBlocks_9_0= ruleSentence ) ) )* )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==17) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // ../dk.itu.bddcontracts/src-gen/dk/itu/bddcontracts/parser/antlr/internal/InternalGherkin.g:637:8: otherlv_6= 'Ensuring' ( (lv_EnsuringBlocks_7_0= ruleSentence ) ) (otherlv_8= 'And' ( (lv_EnsuringBlocks_9_0= ruleSentence ) ) )*
                    {
                    otherlv_6=(Token)match(input,17,FollowSets000.FOLLOW_17_in_ruleBehavior1413); 

                        	newLeafNode(otherlv_6, grammarAccess.getBehaviorAccess().getEnsuringKeyword_3_0());
                        
                    // ../dk.itu.bddcontracts/src-gen/dk/itu/bddcontracts/parser/antlr/internal/InternalGherkin.g:641:1: ( (lv_EnsuringBlocks_7_0= ruleSentence ) )
                    // ../dk.itu.bddcontracts/src-gen/dk/itu/bddcontracts/parser/antlr/internal/InternalGherkin.g:642:1: (lv_EnsuringBlocks_7_0= ruleSentence )
                    {
                    // ../dk.itu.bddcontracts/src-gen/dk/itu/bddcontracts/parser/antlr/internal/InternalGherkin.g:642:1: (lv_EnsuringBlocks_7_0= ruleSentence )
                    // ../dk.itu.bddcontracts/src-gen/dk/itu/bddcontracts/parser/antlr/internal/InternalGherkin.g:643:3: lv_EnsuringBlocks_7_0= ruleSentence
                    {
                     
                    	        newCompositeNode(grammarAccess.getBehaviorAccess().getEnsuringBlocksSentenceParserRuleCall_3_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleSentence_in_ruleBehavior1434);
                    lv_EnsuringBlocks_7_0=ruleSentence();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getBehaviorRule());
                    	        }
                           		add(
                           			current, 
                           			"EnsuringBlocks",
                            		lv_EnsuringBlocks_7_0, 
                            		"Sentence");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../dk.itu.bddcontracts/src-gen/dk/itu/bddcontracts/parser/antlr/internal/InternalGherkin.g:659:2: (otherlv_8= 'And' ( (lv_EnsuringBlocks_9_0= ruleSentence ) ) )*
                    loop17:
                    do {
                        int alt17=2;
                        int LA17_0 = input.LA(1);

                        if ( (LA17_0==14) ) {
                            alt17=1;
                        }


                        switch (alt17) {
                    	case 1 :
                    	    // ../dk.itu.bddcontracts/src-gen/dk/itu/bddcontracts/parser/antlr/internal/InternalGherkin.g:659:4: otherlv_8= 'And' ( (lv_EnsuringBlocks_9_0= ruleSentence ) )
                    	    {
                    	    otherlv_8=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleBehavior1447); 

                    	        	newLeafNode(otherlv_8, grammarAccess.getBehaviorAccess().getAndKeyword_3_2_0());
                    	        
                    	    // ../dk.itu.bddcontracts/src-gen/dk/itu/bddcontracts/parser/antlr/internal/InternalGherkin.g:663:1: ( (lv_EnsuringBlocks_9_0= ruleSentence ) )
                    	    // ../dk.itu.bddcontracts/src-gen/dk/itu/bddcontracts/parser/antlr/internal/InternalGherkin.g:664:1: (lv_EnsuringBlocks_9_0= ruleSentence )
                    	    {
                    	    // ../dk.itu.bddcontracts/src-gen/dk/itu/bddcontracts/parser/antlr/internal/InternalGherkin.g:664:1: (lv_EnsuringBlocks_9_0= ruleSentence )
                    	    // ../dk.itu.bddcontracts/src-gen/dk/itu/bddcontracts/parser/antlr/internal/InternalGherkin.g:665:3: lv_EnsuringBlocks_9_0= ruleSentence
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getBehaviorAccess().getEnsuringBlocksSentenceParserRuleCall_3_2_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleSentence_in_ruleBehavior1468);
                    	    lv_EnsuringBlocks_9_0=ruleSentence();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getBehaviorRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"EnsuringBlocks",
                    	            		lv_EnsuringBlocks_9_0, 
                    	            		"Sentence");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop17;
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
    // $ANTLR end "ruleBehavior"


    // $ANTLR start "entryRuleSentence"
    // ../dk.itu.bddcontracts/src-gen/dk/itu/bddcontracts/parser/antlr/internal/InternalGherkin.g:689:1: entryRuleSentence returns [EObject current=null] : iv_ruleSentence= ruleSentence EOF ;
    public final EObject entryRuleSentence() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSentence = null;


        try {
            // ../dk.itu.bddcontracts/src-gen/dk/itu/bddcontracts/parser/antlr/internal/InternalGherkin.g:690:2: (iv_ruleSentence= ruleSentence EOF )
            // ../dk.itu.bddcontracts/src-gen/dk/itu/bddcontracts/parser/antlr/internal/InternalGherkin.g:691:2: iv_ruleSentence= ruleSentence EOF
            {
             newCompositeNode(grammarAccess.getSentenceRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleSentence_in_entryRuleSentence1508);
            iv_ruleSentence=ruleSentence();

            state._fsp--;

             current =iv_ruleSentence; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleSentence1518); 

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
    // $ANTLR end "entryRuleSentence"


    // $ANTLR start "ruleSentence"
    // ../dk.itu.bddcontracts/src-gen/dk/itu/bddcontracts/parser/antlr/internal/InternalGherkin.g:698:1: ruleSentence returns [EObject current=null] : ( ( (lv_words_0_0= ruleContent ) ) ( (lv_words_1_0= ruleContent ) )* ) ;
    public final EObject ruleSentence() throws RecognitionException {
        EObject current = null;

        EObject lv_words_0_0 = null;

        EObject lv_words_1_0 = null;


         enterRule(); 
            
        try {
            // ../dk.itu.bddcontracts/src-gen/dk/itu/bddcontracts/parser/antlr/internal/InternalGherkin.g:701:28: ( ( ( (lv_words_0_0= ruleContent ) ) ( (lv_words_1_0= ruleContent ) )* ) )
            // ../dk.itu.bddcontracts/src-gen/dk/itu/bddcontracts/parser/antlr/internal/InternalGherkin.g:702:1: ( ( (lv_words_0_0= ruleContent ) ) ( (lv_words_1_0= ruleContent ) )* )
            {
            // ../dk.itu.bddcontracts/src-gen/dk/itu/bddcontracts/parser/antlr/internal/InternalGherkin.g:702:1: ( ( (lv_words_0_0= ruleContent ) ) ( (lv_words_1_0= ruleContent ) )* )
            // ../dk.itu.bddcontracts/src-gen/dk/itu/bddcontracts/parser/antlr/internal/InternalGherkin.g:702:2: ( (lv_words_0_0= ruleContent ) ) ( (lv_words_1_0= ruleContent ) )*
            {
            // ../dk.itu.bddcontracts/src-gen/dk/itu/bddcontracts/parser/antlr/internal/InternalGherkin.g:702:2: ( (lv_words_0_0= ruleContent ) )
            // ../dk.itu.bddcontracts/src-gen/dk/itu/bddcontracts/parser/antlr/internal/InternalGherkin.g:703:1: (lv_words_0_0= ruleContent )
            {
            // ../dk.itu.bddcontracts/src-gen/dk/itu/bddcontracts/parser/antlr/internal/InternalGherkin.g:703:1: (lv_words_0_0= ruleContent )
            // ../dk.itu.bddcontracts/src-gen/dk/itu/bddcontracts/parser/antlr/internal/InternalGherkin.g:704:3: lv_words_0_0= ruleContent
            {
             
            	        newCompositeNode(grammarAccess.getSentenceAccess().getWordsContentParserRuleCall_0_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleContent_in_ruleSentence1564);
            lv_words_0_0=ruleContent();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getSentenceRule());
            	        }
                   		add(
                   			current, 
                   			"words",
                    		lv_words_0_0, 
                    		"Content");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../dk.itu.bddcontracts/src-gen/dk/itu/bddcontracts/parser/antlr/internal/InternalGherkin.g:720:2: ( (lv_words_1_0= ruleContent ) )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( ((LA19_0>=RULE_STRING && LA19_0<=RULE_ANY_OTHER)||LA19_0==23) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // ../dk.itu.bddcontracts/src-gen/dk/itu/bddcontracts/parser/antlr/internal/InternalGherkin.g:721:1: (lv_words_1_0= ruleContent )
            	    {
            	    // ../dk.itu.bddcontracts/src-gen/dk/itu/bddcontracts/parser/antlr/internal/InternalGherkin.g:721:1: (lv_words_1_0= ruleContent )
            	    // ../dk.itu.bddcontracts/src-gen/dk/itu/bddcontracts/parser/antlr/internal/InternalGherkin.g:722:3: lv_words_1_0= ruleContent
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getSentenceAccess().getWordsContentParserRuleCall_1_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_ruleContent_in_ruleSentence1585);
            	    lv_words_1_0=ruleContent();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getSentenceRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"words",
            	            		lv_words_1_0, 
            	            		"Content");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop19;
                }
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
    // $ANTLR end "ruleSentence"


    // $ANTLR start "entryRuleScenarioSpecific"
    // ../dk.itu.bddcontracts/src-gen/dk/itu/bddcontracts/parser/antlr/internal/InternalGherkin.g:746:1: entryRuleScenarioSpecific returns [EObject current=null] : iv_ruleScenarioSpecific= ruleScenarioSpecific EOF ;
    public final EObject entryRuleScenarioSpecific() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleScenarioSpecific = null;


        try {
            // ../dk.itu.bddcontracts/src-gen/dk/itu/bddcontracts/parser/antlr/internal/InternalGherkin.g:747:2: (iv_ruleScenarioSpecific= ruleScenarioSpecific EOF )
            // ../dk.itu.bddcontracts/src-gen/dk/itu/bddcontracts/parser/antlr/internal/InternalGherkin.g:748:2: iv_ruleScenarioSpecific= ruleScenarioSpecific EOF
            {
             newCompositeNode(grammarAccess.getScenarioSpecificRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleScenarioSpecific_in_entryRuleScenarioSpecific1622);
            iv_ruleScenarioSpecific=ruleScenarioSpecific();

            state._fsp--;

             current =iv_ruleScenarioSpecific; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleScenarioSpecific1632); 

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
    // $ANTLR end "entryRuleScenarioSpecific"


    // $ANTLR start "ruleScenarioSpecific"
    // ../dk.itu.bddcontracts/src-gen/dk/itu/bddcontracts/parser/antlr/internal/InternalGherkin.g:755:1: ruleScenarioSpecific returns [EObject current=null] : (otherlv_0= 'Scenario:' ( (lv_description_1_0= ruleMAny ) ) otherlv_2= 'Given' ( (lv_GivenBlocks_3_0= ruleSentence ) ) (otherlv_4= 'And' ( (lv_GivenBlocks_5_0= ruleSentence ) ) )* (otherlv_6= 'When' ( (lv_WhenBlocks_7_0= ruleSentence ) ) (otherlv_8= 'And' ( (lv_WhenBlocks_9_0= ruleSentence ) ) )* )? otherlv_10= 'Then' ( (lv_ThenBlocks_11_0= ruleSentence ) ) (otherlv_12= 'And' ( (lv_ThenBlocks_13_0= ruleSentence ) ) )* ) ;
    public final EObject ruleScenarioSpecific() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        AntlrDatatypeRuleToken lv_description_1_0 = null;

        EObject lv_GivenBlocks_3_0 = null;

        EObject lv_GivenBlocks_5_0 = null;

        EObject lv_WhenBlocks_7_0 = null;

        EObject lv_WhenBlocks_9_0 = null;

        EObject lv_ThenBlocks_11_0 = null;

        EObject lv_ThenBlocks_13_0 = null;


         enterRule(); 
            
        try {
            // ../dk.itu.bddcontracts/src-gen/dk/itu/bddcontracts/parser/antlr/internal/InternalGherkin.g:758:28: ( (otherlv_0= 'Scenario:' ( (lv_description_1_0= ruleMAny ) ) otherlv_2= 'Given' ( (lv_GivenBlocks_3_0= ruleSentence ) ) (otherlv_4= 'And' ( (lv_GivenBlocks_5_0= ruleSentence ) ) )* (otherlv_6= 'When' ( (lv_WhenBlocks_7_0= ruleSentence ) ) (otherlv_8= 'And' ( (lv_WhenBlocks_9_0= ruleSentence ) ) )* )? otherlv_10= 'Then' ( (lv_ThenBlocks_11_0= ruleSentence ) ) (otherlv_12= 'And' ( (lv_ThenBlocks_13_0= ruleSentence ) ) )* ) )
            // ../dk.itu.bddcontracts/src-gen/dk/itu/bddcontracts/parser/antlr/internal/InternalGherkin.g:759:1: (otherlv_0= 'Scenario:' ( (lv_description_1_0= ruleMAny ) ) otherlv_2= 'Given' ( (lv_GivenBlocks_3_0= ruleSentence ) ) (otherlv_4= 'And' ( (lv_GivenBlocks_5_0= ruleSentence ) ) )* (otherlv_6= 'When' ( (lv_WhenBlocks_7_0= ruleSentence ) ) (otherlv_8= 'And' ( (lv_WhenBlocks_9_0= ruleSentence ) ) )* )? otherlv_10= 'Then' ( (lv_ThenBlocks_11_0= ruleSentence ) ) (otherlv_12= 'And' ( (lv_ThenBlocks_13_0= ruleSentence ) ) )* )
            {
            // ../dk.itu.bddcontracts/src-gen/dk/itu/bddcontracts/parser/antlr/internal/InternalGherkin.g:759:1: (otherlv_0= 'Scenario:' ( (lv_description_1_0= ruleMAny ) ) otherlv_2= 'Given' ( (lv_GivenBlocks_3_0= ruleSentence ) ) (otherlv_4= 'And' ( (lv_GivenBlocks_5_0= ruleSentence ) ) )* (otherlv_6= 'When' ( (lv_WhenBlocks_7_0= ruleSentence ) ) (otherlv_8= 'And' ( (lv_WhenBlocks_9_0= ruleSentence ) ) )* )? otherlv_10= 'Then' ( (lv_ThenBlocks_11_0= ruleSentence ) ) (otherlv_12= 'And' ( (lv_ThenBlocks_13_0= ruleSentence ) ) )* )
            // ../dk.itu.bddcontracts/src-gen/dk/itu/bddcontracts/parser/antlr/internal/InternalGherkin.g:759:3: otherlv_0= 'Scenario:' ( (lv_description_1_0= ruleMAny ) ) otherlv_2= 'Given' ( (lv_GivenBlocks_3_0= ruleSentence ) ) (otherlv_4= 'And' ( (lv_GivenBlocks_5_0= ruleSentence ) ) )* (otherlv_6= 'When' ( (lv_WhenBlocks_7_0= ruleSentence ) ) (otherlv_8= 'And' ( (lv_WhenBlocks_9_0= ruleSentence ) ) )* )? otherlv_10= 'Then' ( (lv_ThenBlocks_11_0= ruleSentence ) ) (otherlv_12= 'And' ( (lv_ThenBlocks_13_0= ruleSentence ) ) )*
            {
            otherlv_0=(Token)match(input,18,FollowSets000.FOLLOW_18_in_ruleScenarioSpecific1669); 

                	newLeafNode(otherlv_0, grammarAccess.getScenarioSpecificAccess().getScenarioKeyword_0());
                
            // ../dk.itu.bddcontracts/src-gen/dk/itu/bddcontracts/parser/antlr/internal/InternalGherkin.g:763:1: ( (lv_description_1_0= ruleMAny ) )
            // ../dk.itu.bddcontracts/src-gen/dk/itu/bddcontracts/parser/antlr/internal/InternalGherkin.g:764:1: (lv_description_1_0= ruleMAny )
            {
            // ../dk.itu.bddcontracts/src-gen/dk/itu/bddcontracts/parser/antlr/internal/InternalGherkin.g:764:1: (lv_description_1_0= ruleMAny )
            // ../dk.itu.bddcontracts/src-gen/dk/itu/bddcontracts/parser/antlr/internal/InternalGherkin.g:765:3: lv_description_1_0= ruleMAny
            {
             
            	        newCompositeNode(grammarAccess.getScenarioSpecificAccess().getDescriptionMAnyParserRuleCall_1_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleMAny_in_ruleScenarioSpecific1690);
            lv_description_1_0=ruleMAny();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getScenarioSpecificRule());
            	        }
                   		set(
                   			current, 
                   			"description",
                    		lv_description_1_0, 
                    		"MAny");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_2=(Token)match(input,13,FollowSets000.FOLLOW_13_in_ruleScenarioSpecific1702); 

                	newLeafNode(otherlv_2, grammarAccess.getScenarioSpecificAccess().getGivenKeyword_2());
                
            // ../dk.itu.bddcontracts/src-gen/dk/itu/bddcontracts/parser/antlr/internal/InternalGherkin.g:785:1: ( (lv_GivenBlocks_3_0= ruleSentence ) )
            // ../dk.itu.bddcontracts/src-gen/dk/itu/bddcontracts/parser/antlr/internal/InternalGherkin.g:786:1: (lv_GivenBlocks_3_0= ruleSentence )
            {
            // ../dk.itu.bddcontracts/src-gen/dk/itu/bddcontracts/parser/antlr/internal/InternalGherkin.g:786:1: (lv_GivenBlocks_3_0= ruleSentence )
            // ../dk.itu.bddcontracts/src-gen/dk/itu/bddcontracts/parser/antlr/internal/InternalGherkin.g:787:3: lv_GivenBlocks_3_0= ruleSentence
            {
             
            	        newCompositeNode(grammarAccess.getScenarioSpecificAccess().getGivenBlocksSentenceParserRuleCall_3_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleSentence_in_ruleScenarioSpecific1723);
            lv_GivenBlocks_3_0=ruleSentence();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getScenarioSpecificRule());
            	        }
                   		add(
                   			current, 
                   			"GivenBlocks",
                    		lv_GivenBlocks_3_0, 
                    		"Sentence");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../dk.itu.bddcontracts/src-gen/dk/itu/bddcontracts/parser/antlr/internal/InternalGherkin.g:803:2: (otherlv_4= 'And' ( (lv_GivenBlocks_5_0= ruleSentence ) ) )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( (LA20_0==14) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // ../dk.itu.bddcontracts/src-gen/dk/itu/bddcontracts/parser/antlr/internal/InternalGherkin.g:803:4: otherlv_4= 'And' ( (lv_GivenBlocks_5_0= ruleSentence ) )
            	    {
            	    otherlv_4=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleScenarioSpecific1736); 

            	        	newLeafNode(otherlv_4, grammarAccess.getScenarioSpecificAccess().getAndKeyword_4_0());
            	        
            	    // ../dk.itu.bddcontracts/src-gen/dk/itu/bddcontracts/parser/antlr/internal/InternalGherkin.g:807:1: ( (lv_GivenBlocks_5_0= ruleSentence ) )
            	    // ../dk.itu.bddcontracts/src-gen/dk/itu/bddcontracts/parser/antlr/internal/InternalGherkin.g:808:1: (lv_GivenBlocks_5_0= ruleSentence )
            	    {
            	    // ../dk.itu.bddcontracts/src-gen/dk/itu/bddcontracts/parser/antlr/internal/InternalGherkin.g:808:1: (lv_GivenBlocks_5_0= ruleSentence )
            	    // ../dk.itu.bddcontracts/src-gen/dk/itu/bddcontracts/parser/antlr/internal/InternalGherkin.g:809:3: lv_GivenBlocks_5_0= ruleSentence
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getScenarioSpecificAccess().getGivenBlocksSentenceParserRuleCall_4_1_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_ruleSentence_in_ruleScenarioSpecific1757);
            	    lv_GivenBlocks_5_0=ruleSentence();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getScenarioSpecificRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"GivenBlocks",
            	            		lv_GivenBlocks_5_0, 
            	            		"Sentence");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop20;
                }
            } while (true);

            // ../dk.itu.bddcontracts/src-gen/dk/itu/bddcontracts/parser/antlr/internal/InternalGherkin.g:825:4: (otherlv_6= 'When' ( (lv_WhenBlocks_7_0= ruleSentence ) ) (otherlv_8= 'And' ( (lv_WhenBlocks_9_0= ruleSentence ) ) )* )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==19) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // ../dk.itu.bddcontracts/src-gen/dk/itu/bddcontracts/parser/antlr/internal/InternalGherkin.g:825:6: otherlv_6= 'When' ( (lv_WhenBlocks_7_0= ruleSentence ) ) (otherlv_8= 'And' ( (lv_WhenBlocks_9_0= ruleSentence ) ) )*
                    {
                    otherlv_6=(Token)match(input,19,FollowSets000.FOLLOW_19_in_ruleScenarioSpecific1772); 

                        	newLeafNode(otherlv_6, grammarAccess.getScenarioSpecificAccess().getWhenKeyword_5_0());
                        
                    // ../dk.itu.bddcontracts/src-gen/dk/itu/bddcontracts/parser/antlr/internal/InternalGherkin.g:829:1: ( (lv_WhenBlocks_7_0= ruleSentence ) )
                    // ../dk.itu.bddcontracts/src-gen/dk/itu/bddcontracts/parser/antlr/internal/InternalGherkin.g:830:1: (lv_WhenBlocks_7_0= ruleSentence )
                    {
                    // ../dk.itu.bddcontracts/src-gen/dk/itu/bddcontracts/parser/antlr/internal/InternalGherkin.g:830:1: (lv_WhenBlocks_7_0= ruleSentence )
                    // ../dk.itu.bddcontracts/src-gen/dk/itu/bddcontracts/parser/antlr/internal/InternalGherkin.g:831:3: lv_WhenBlocks_7_0= ruleSentence
                    {
                     
                    	        newCompositeNode(grammarAccess.getScenarioSpecificAccess().getWhenBlocksSentenceParserRuleCall_5_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleSentence_in_ruleScenarioSpecific1793);
                    lv_WhenBlocks_7_0=ruleSentence();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getScenarioSpecificRule());
                    	        }
                           		add(
                           			current, 
                           			"WhenBlocks",
                            		lv_WhenBlocks_7_0, 
                            		"Sentence");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../dk.itu.bddcontracts/src-gen/dk/itu/bddcontracts/parser/antlr/internal/InternalGherkin.g:847:2: (otherlv_8= 'And' ( (lv_WhenBlocks_9_0= ruleSentence ) ) )*
                    loop21:
                    do {
                        int alt21=2;
                        int LA21_0 = input.LA(1);

                        if ( (LA21_0==14) ) {
                            alt21=1;
                        }


                        switch (alt21) {
                    	case 1 :
                    	    // ../dk.itu.bddcontracts/src-gen/dk/itu/bddcontracts/parser/antlr/internal/InternalGherkin.g:847:4: otherlv_8= 'And' ( (lv_WhenBlocks_9_0= ruleSentence ) )
                    	    {
                    	    otherlv_8=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleScenarioSpecific1806); 

                    	        	newLeafNode(otherlv_8, grammarAccess.getScenarioSpecificAccess().getAndKeyword_5_2_0());
                    	        
                    	    // ../dk.itu.bddcontracts/src-gen/dk/itu/bddcontracts/parser/antlr/internal/InternalGherkin.g:851:1: ( (lv_WhenBlocks_9_0= ruleSentence ) )
                    	    // ../dk.itu.bddcontracts/src-gen/dk/itu/bddcontracts/parser/antlr/internal/InternalGherkin.g:852:1: (lv_WhenBlocks_9_0= ruleSentence )
                    	    {
                    	    // ../dk.itu.bddcontracts/src-gen/dk/itu/bddcontracts/parser/antlr/internal/InternalGherkin.g:852:1: (lv_WhenBlocks_9_0= ruleSentence )
                    	    // ../dk.itu.bddcontracts/src-gen/dk/itu/bddcontracts/parser/antlr/internal/InternalGherkin.g:853:3: lv_WhenBlocks_9_0= ruleSentence
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getScenarioSpecificAccess().getWhenBlocksSentenceParserRuleCall_5_2_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleSentence_in_ruleScenarioSpecific1827);
                    	    lv_WhenBlocks_9_0=ruleSentence();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getScenarioSpecificRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"WhenBlocks",
                    	            		lv_WhenBlocks_9_0, 
                    	            		"Sentence");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop21;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_10=(Token)match(input,20,FollowSets000.FOLLOW_20_in_ruleScenarioSpecific1843); 

                	newLeafNode(otherlv_10, grammarAccess.getScenarioSpecificAccess().getThenKeyword_6());
                
            // ../dk.itu.bddcontracts/src-gen/dk/itu/bddcontracts/parser/antlr/internal/InternalGherkin.g:873:1: ( (lv_ThenBlocks_11_0= ruleSentence ) )
            // ../dk.itu.bddcontracts/src-gen/dk/itu/bddcontracts/parser/antlr/internal/InternalGherkin.g:874:1: (lv_ThenBlocks_11_0= ruleSentence )
            {
            // ../dk.itu.bddcontracts/src-gen/dk/itu/bddcontracts/parser/antlr/internal/InternalGherkin.g:874:1: (lv_ThenBlocks_11_0= ruleSentence )
            // ../dk.itu.bddcontracts/src-gen/dk/itu/bddcontracts/parser/antlr/internal/InternalGherkin.g:875:3: lv_ThenBlocks_11_0= ruleSentence
            {
             
            	        newCompositeNode(grammarAccess.getScenarioSpecificAccess().getThenBlocksSentenceParserRuleCall_7_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleSentence_in_ruleScenarioSpecific1864);
            lv_ThenBlocks_11_0=ruleSentence();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getScenarioSpecificRule());
            	        }
                   		add(
                   			current, 
                   			"ThenBlocks",
                    		lv_ThenBlocks_11_0, 
                    		"Sentence");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../dk.itu.bddcontracts/src-gen/dk/itu/bddcontracts/parser/antlr/internal/InternalGherkin.g:891:2: (otherlv_12= 'And' ( (lv_ThenBlocks_13_0= ruleSentence ) ) )*
            loop23:
            do {
                int alt23=2;
                int LA23_0 = input.LA(1);

                if ( (LA23_0==14) ) {
                    alt23=1;
                }


                switch (alt23) {
            	case 1 :
            	    // ../dk.itu.bddcontracts/src-gen/dk/itu/bddcontracts/parser/antlr/internal/InternalGherkin.g:891:4: otherlv_12= 'And' ( (lv_ThenBlocks_13_0= ruleSentence ) )
            	    {
            	    otherlv_12=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleScenarioSpecific1877); 

            	        	newLeafNode(otherlv_12, grammarAccess.getScenarioSpecificAccess().getAndKeyword_8_0());
            	        
            	    // ../dk.itu.bddcontracts/src-gen/dk/itu/bddcontracts/parser/antlr/internal/InternalGherkin.g:895:1: ( (lv_ThenBlocks_13_0= ruleSentence ) )
            	    // ../dk.itu.bddcontracts/src-gen/dk/itu/bddcontracts/parser/antlr/internal/InternalGherkin.g:896:1: (lv_ThenBlocks_13_0= ruleSentence )
            	    {
            	    // ../dk.itu.bddcontracts/src-gen/dk/itu/bddcontracts/parser/antlr/internal/InternalGherkin.g:896:1: (lv_ThenBlocks_13_0= ruleSentence )
            	    // ../dk.itu.bddcontracts/src-gen/dk/itu/bddcontracts/parser/antlr/internal/InternalGherkin.g:897:3: lv_ThenBlocks_13_0= ruleSentence
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getScenarioSpecificAccess().getThenBlocksSentenceParserRuleCall_8_1_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_ruleSentence_in_ruleScenarioSpecific1898);
            	    lv_ThenBlocks_13_0=ruleSentence();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getScenarioSpecificRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"ThenBlocks",
            	            		lv_ThenBlocks_13_0, 
            	            		"Sentence");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop23;
                }
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
    // $ANTLR end "ruleScenarioSpecific"


    // $ANTLR start "entryRuleScenarioOutline"
    // ../dk.itu.bddcontracts/src-gen/dk/itu/bddcontracts/parser/antlr/internal/InternalGherkin.g:921:1: entryRuleScenarioOutline returns [EObject current=null] : iv_ruleScenarioOutline= ruleScenarioOutline EOF ;
    public final EObject entryRuleScenarioOutline() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleScenarioOutline = null;


        try {
            // ../dk.itu.bddcontracts/src-gen/dk/itu/bddcontracts/parser/antlr/internal/InternalGherkin.g:922:2: (iv_ruleScenarioOutline= ruleScenarioOutline EOF )
            // ../dk.itu.bddcontracts/src-gen/dk/itu/bddcontracts/parser/antlr/internal/InternalGherkin.g:923:2: iv_ruleScenarioOutline= ruleScenarioOutline EOF
            {
             newCompositeNode(grammarAccess.getScenarioOutlineRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleScenarioOutline_in_entryRuleScenarioOutline1936);
            iv_ruleScenarioOutline=ruleScenarioOutline();

            state._fsp--;

             current =iv_ruleScenarioOutline; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleScenarioOutline1946); 

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
    // $ANTLR end "entryRuleScenarioOutline"


    // $ANTLR start "ruleScenarioOutline"
    // ../dk.itu.bddcontracts/src-gen/dk/itu/bddcontracts/parser/antlr/internal/InternalGherkin.g:930:1: ruleScenarioOutline returns [EObject current=null] : (otherlv_0= 'Scenario Outline:' ( (lv_description_1_0= ruleMAny ) ) otherlv_2= 'Given' ( (lv_GivenBlocks_3_0= ruleSentence ) ) (otherlv_4= 'And' ( (lv_GivenBlocks_5_0= ruleSentence ) ) )* (otherlv_6= 'When' ( (lv_WhenBlocks_7_0= ruleSentence ) ) (otherlv_8= 'And' ( (lv_WhenBlocks_9_0= ruleSentence ) ) )* )? otherlv_10= 'Then' ( (lv_ThenBlocks_11_0= ruleSentence ) ) (otherlv_12= 'And' ( (lv_ThenBlocks_13_0= ruleSentence ) ) )* otherlv_14= 'Examples:' ( (lv_Examples_15_0= ruleExample ) ) ( (lv_Examples_16_0= ruleExample ) )* ) ;
    public final EObject ruleScenarioOutline() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        Token otherlv_14=null;
        AntlrDatatypeRuleToken lv_description_1_0 = null;

        EObject lv_GivenBlocks_3_0 = null;

        EObject lv_GivenBlocks_5_0 = null;

        EObject lv_WhenBlocks_7_0 = null;

        EObject lv_WhenBlocks_9_0 = null;

        EObject lv_ThenBlocks_11_0 = null;

        EObject lv_ThenBlocks_13_0 = null;

        EObject lv_Examples_15_0 = null;

        EObject lv_Examples_16_0 = null;


         enterRule(); 
            
        try {
            // ../dk.itu.bddcontracts/src-gen/dk/itu/bddcontracts/parser/antlr/internal/InternalGherkin.g:933:28: ( (otherlv_0= 'Scenario Outline:' ( (lv_description_1_0= ruleMAny ) ) otherlv_2= 'Given' ( (lv_GivenBlocks_3_0= ruleSentence ) ) (otherlv_4= 'And' ( (lv_GivenBlocks_5_0= ruleSentence ) ) )* (otherlv_6= 'When' ( (lv_WhenBlocks_7_0= ruleSentence ) ) (otherlv_8= 'And' ( (lv_WhenBlocks_9_0= ruleSentence ) ) )* )? otherlv_10= 'Then' ( (lv_ThenBlocks_11_0= ruleSentence ) ) (otherlv_12= 'And' ( (lv_ThenBlocks_13_0= ruleSentence ) ) )* otherlv_14= 'Examples:' ( (lv_Examples_15_0= ruleExample ) ) ( (lv_Examples_16_0= ruleExample ) )* ) )
            // ../dk.itu.bddcontracts/src-gen/dk/itu/bddcontracts/parser/antlr/internal/InternalGherkin.g:934:1: (otherlv_0= 'Scenario Outline:' ( (lv_description_1_0= ruleMAny ) ) otherlv_2= 'Given' ( (lv_GivenBlocks_3_0= ruleSentence ) ) (otherlv_4= 'And' ( (lv_GivenBlocks_5_0= ruleSentence ) ) )* (otherlv_6= 'When' ( (lv_WhenBlocks_7_0= ruleSentence ) ) (otherlv_8= 'And' ( (lv_WhenBlocks_9_0= ruleSentence ) ) )* )? otherlv_10= 'Then' ( (lv_ThenBlocks_11_0= ruleSentence ) ) (otherlv_12= 'And' ( (lv_ThenBlocks_13_0= ruleSentence ) ) )* otherlv_14= 'Examples:' ( (lv_Examples_15_0= ruleExample ) ) ( (lv_Examples_16_0= ruleExample ) )* )
            {
            // ../dk.itu.bddcontracts/src-gen/dk/itu/bddcontracts/parser/antlr/internal/InternalGherkin.g:934:1: (otherlv_0= 'Scenario Outline:' ( (lv_description_1_0= ruleMAny ) ) otherlv_2= 'Given' ( (lv_GivenBlocks_3_0= ruleSentence ) ) (otherlv_4= 'And' ( (lv_GivenBlocks_5_0= ruleSentence ) ) )* (otherlv_6= 'When' ( (lv_WhenBlocks_7_0= ruleSentence ) ) (otherlv_8= 'And' ( (lv_WhenBlocks_9_0= ruleSentence ) ) )* )? otherlv_10= 'Then' ( (lv_ThenBlocks_11_0= ruleSentence ) ) (otherlv_12= 'And' ( (lv_ThenBlocks_13_0= ruleSentence ) ) )* otherlv_14= 'Examples:' ( (lv_Examples_15_0= ruleExample ) ) ( (lv_Examples_16_0= ruleExample ) )* )
            // ../dk.itu.bddcontracts/src-gen/dk/itu/bddcontracts/parser/antlr/internal/InternalGherkin.g:934:3: otherlv_0= 'Scenario Outline:' ( (lv_description_1_0= ruleMAny ) ) otherlv_2= 'Given' ( (lv_GivenBlocks_3_0= ruleSentence ) ) (otherlv_4= 'And' ( (lv_GivenBlocks_5_0= ruleSentence ) ) )* (otherlv_6= 'When' ( (lv_WhenBlocks_7_0= ruleSentence ) ) (otherlv_8= 'And' ( (lv_WhenBlocks_9_0= ruleSentence ) ) )* )? otherlv_10= 'Then' ( (lv_ThenBlocks_11_0= ruleSentence ) ) (otherlv_12= 'And' ( (lv_ThenBlocks_13_0= ruleSentence ) ) )* otherlv_14= 'Examples:' ( (lv_Examples_15_0= ruleExample ) ) ( (lv_Examples_16_0= ruleExample ) )*
            {
            otherlv_0=(Token)match(input,21,FollowSets000.FOLLOW_21_in_ruleScenarioOutline1983); 

                	newLeafNode(otherlv_0, grammarAccess.getScenarioOutlineAccess().getScenarioOutlineKeyword_0());
                
            // ../dk.itu.bddcontracts/src-gen/dk/itu/bddcontracts/parser/antlr/internal/InternalGherkin.g:938:1: ( (lv_description_1_0= ruleMAny ) )
            // ../dk.itu.bddcontracts/src-gen/dk/itu/bddcontracts/parser/antlr/internal/InternalGherkin.g:939:1: (lv_description_1_0= ruleMAny )
            {
            // ../dk.itu.bddcontracts/src-gen/dk/itu/bddcontracts/parser/antlr/internal/InternalGherkin.g:939:1: (lv_description_1_0= ruleMAny )
            // ../dk.itu.bddcontracts/src-gen/dk/itu/bddcontracts/parser/antlr/internal/InternalGherkin.g:940:3: lv_description_1_0= ruleMAny
            {
             
            	        newCompositeNode(grammarAccess.getScenarioOutlineAccess().getDescriptionMAnyParserRuleCall_1_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleMAny_in_ruleScenarioOutline2004);
            lv_description_1_0=ruleMAny();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getScenarioOutlineRule());
            	        }
                   		set(
                   			current, 
                   			"description",
                    		lv_description_1_0, 
                    		"MAny");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_2=(Token)match(input,13,FollowSets000.FOLLOW_13_in_ruleScenarioOutline2016); 

                	newLeafNode(otherlv_2, grammarAccess.getScenarioOutlineAccess().getGivenKeyword_2());
                
            // ../dk.itu.bddcontracts/src-gen/dk/itu/bddcontracts/parser/antlr/internal/InternalGherkin.g:960:1: ( (lv_GivenBlocks_3_0= ruleSentence ) )
            // ../dk.itu.bddcontracts/src-gen/dk/itu/bddcontracts/parser/antlr/internal/InternalGherkin.g:961:1: (lv_GivenBlocks_3_0= ruleSentence )
            {
            // ../dk.itu.bddcontracts/src-gen/dk/itu/bddcontracts/parser/antlr/internal/InternalGherkin.g:961:1: (lv_GivenBlocks_3_0= ruleSentence )
            // ../dk.itu.bddcontracts/src-gen/dk/itu/bddcontracts/parser/antlr/internal/InternalGherkin.g:962:3: lv_GivenBlocks_3_0= ruleSentence
            {
             
            	        newCompositeNode(grammarAccess.getScenarioOutlineAccess().getGivenBlocksSentenceParserRuleCall_3_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleSentence_in_ruleScenarioOutline2037);
            lv_GivenBlocks_3_0=ruleSentence();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getScenarioOutlineRule());
            	        }
                   		add(
                   			current, 
                   			"GivenBlocks",
                    		lv_GivenBlocks_3_0, 
                    		"Sentence");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../dk.itu.bddcontracts/src-gen/dk/itu/bddcontracts/parser/antlr/internal/InternalGherkin.g:978:2: (otherlv_4= 'And' ( (lv_GivenBlocks_5_0= ruleSentence ) ) )*
            loop24:
            do {
                int alt24=2;
                int LA24_0 = input.LA(1);

                if ( (LA24_0==14) ) {
                    alt24=1;
                }


                switch (alt24) {
            	case 1 :
            	    // ../dk.itu.bddcontracts/src-gen/dk/itu/bddcontracts/parser/antlr/internal/InternalGherkin.g:978:4: otherlv_4= 'And' ( (lv_GivenBlocks_5_0= ruleSentence ) )
            	    {
            	    otherlv_4=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleScenarioOutline2050); 

            	        	newLeafNode(otherlv_4, grammarAccess.getScenarioOutlineAccess().getAndKeyword_4_0());
            	        
            	    // ../dk.itu.bddcontracts/src-gen/dk/itu/bddcontracts/parser/antlr/internal/InternalGherkin.g:982:1: ( (lv_GivenBlocks_5_0= ruleSentence ) )
            	    // ../dk.itu.bddcontracts/src-gen/dk/itu/bddcontracts/parser/antlr/internal/InternalGherkin.g:983:1: (lv_GivenBlocks_5_0= ruleSentence )
            	    {
            	    // ../dk.itu.bddcontracts/src-gen/dk/itu/bddcontracts/parser/antlr/internal/InternalGherkin.g:983:1: (lv_GivenBlocks_5_0= ruleSentence )
            	    // ../dk.itu.bddcontracts/src-gen/dk/itu/bddcontracts/parser/antlr/internal/InternalGherkin.g:984:3: lv_GivenBlocks_5_0= ruleSentence
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getScenarioOutlineAccess().getGivenBlocksSentenceParserRuleCall_4_1_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_ruleSentence_in_ruleScenarioOutline2071);
            	    lv_GivenBlocks_5_0=ruleSentence();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getScenarioOutlineRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"GivenBlocks",
            	            		lv_GivenBlocks_5_0, 
            	            		"Sentence");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop24;
                }
            } while (true);

            // ../dk.itu.bddcontracts/src-gen/dk/itu/bddcontracts/parser/antlr/internal/InternalGherkin.g:1000:4: (otherlv_6= 'When' ( (lv_WhenBlocks_7_0= ruleSentence ) ) (otherlv_8= 'And' ( (lv_WhenBlocks_9_0= ruleSentence ) ) )* )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==19) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // ../dk.itu.bddcontracts/src-gen/dk/itu/bddcontracts/parser/antlr/internal/InternalGherkin.g:1000:6: otherlv_6= 'When' ( (lv_WhenBlocks_7_0= ruleSentence ) ) (otherlv_8= 'And' ( (lv_WhenBlocks_9_0= ruleSentence ) ) )*
                    {
                    otherlv_6=(Token)match(input,19,FollowSets000.FOLLOW_19_in_ruleScenarioOutline2086); 

                        	newLeafNode(otherlv_6, grammarAccess.getScenarioOutlineAccess().getWhenKeyword_5_0());
                        
                    // ../dk.itu.bddcontracts/src-gen/dk/itu/bddcontracts/parser/antlr/internal/InternalGherkin.g:1004:1: ( (lv_WhenBlocks_7_0= ruleSentence ) )
                    // ../dk.itu.bddcontracts/src-gen/dk/itu/bddcontracts/parser/antlr/internal/InternalGherkin.g:1005:1: (lv_WhenBlocks_7_0= ruleSentence )
                    {
                    // ../dk.itu.bddcontracts/src-gen/dk/itu/bddcontracts/parser/antlr/internal/InternalGherkin.g:1005:1: (lv_WhenBlocks_7_0= ruleSentence )
                    // ../dk.itu.bddcontracts/src-gen/dk/itu/bddcontracts/parser/antlr/internal/InternalGherkin.g:1006:3: lv_WhenBlocks_7_0= ruleSentence
                    {
                     
                    	        newCompositeNode(grammarAccess.getScenarioOutlineAccess().getWhenBlocksSentenceParserRuleCall_5_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleSentence_in_ruleScenarioOutline2107);
                    lv_WhenBlocks_7_0=ruleSentence();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getScenarioOutlineRule());
                    	        }
                           		add(
                           			current, 
                           			"WhenBlocks",
                            		lv_WhenBlocks_7_0, 
                            		"Sentence");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../dk.itu.bddcontracts/src-gen/dk/itu/bddcontracts/parser/antlr/internal/InternalGherkin.g:1022:2: (otherlv_8= 'And' ( (lv_WhenBlocks_9_0= ruleSentence ) ) )*
                    loop25:
                    do {
                        int alt25=2;
                        int LA25_0 = input.LA(1);

                        if ( (LA25_0==14) ) {
                            alt25=1;
                        }


                        switch (alt25) {
                    	case 1 :
                    	    // ../dk.itu.bddcontracts/src-gen/dk/itu/bddcontracts/parser/antlr/internal/InternalGherkin.g:1022:4: otherlv_8= 'And' ( (lv_WhenBlocks_9_0= ruleSentence ) )
                    	    {
                    	    otherlv_8=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleScenarioOutline2120); 

                    	        	newLeafNode(otherlv_8, grammarAccess.getScenarioOutlineAccess().getAndKeyword_5_2_0());
                    	        
                    	    // ../dk.itu.bddcontracts/src-gen/dk/itu/bddcontracts/parser/antlr/internal/InternalGherkin.g:1026:1: ( (lv_WhenBlocks_9_0= ruleSentence ) )
                    	    // ../dk.itu.bddcontracts/src-gen/dk/itu/bddcontracts/parser/antlr/internal/InternalGherkin.g:1027:1: (lv_WhenBlocks_9_0= ruleSentence )
                    	    {
                    	    // ../dk.itu.bddcontracts/src-gen/dk/itu/bddcontracts/parser/antlr/internal/InternalGherkin.g:1027:1: (lv_WhenBlocks_9_0= ruleSentence )
                    	    // ../dk.itu.bddcontracts/src-gen/dk/itu/bddcontracts/parser/antlr/internal/InternalGherkin.g:1028:3: lv_WhenBlocks_9_0= ruleSentence
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getScenarioOutlineAccess().getWhenBlocksSentenceParserRuleCall_5_2_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleSentence_in_ruleScenarioOutline2141);
                    	    lv_WhenBlocks_9_0=ruleSentence();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getScenarioOutlineRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"WhenBlocks",
                    	            		lv_WhenBlocks_9_0, 
                    	            		"Sentence");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop25;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_10=(Token)match(input,20,FollowSets000.FOLLOW_20_in_ruleScenarioOutline2157); 

                	newLeafNode(otherlv_10, grammarAccess.getScenarioOutlineAccess().getThenKeyword_6());
                
            // ../dk.itu.bddcontracts/src-gen/dk/itu/bddcontracts/parser/antlr/internal/InternalGherkin.g:1048:1: ( (lv_ThenBlocks_11_0= ruleSentence ) )
            // ../dk.itu.bddcontracts/src-gen/dk/itu/bddcontracts/parser/antlr/internal/InternalGherkin.g:1049:1: (lv_ThenBlocks_11_0= ruleSentence )
            {
            // ../dk.itu.bddcontracts/src-gen/dk/itu/bddcontracts/parser/antlr/internal/InternalGherkin.g:1049:1: (lv_ThenBlocks_11_0= ruleSentence )
            // ../dk.itu.bddcontracts/src-gen/dk/itu/bddcontracts/parser/antlr/internal/InternalGherkin.g:1050:3: lv_ThenBlocks_11_0= ruleSentence
            {
             
            	        newCompositeNode(grammarAccess.getScenarioOutlineAccess().getThenBlocksSentenceParserRuleCall_7_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleSentence_in_ruleScenarioOutline2178);
            lv_ThenBlocks_11_0=ruleSentence();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getScenarioOutlineRule());
            	        }
                   		add(
                   			current, 
                   			"ThenBlocks",
                    		lv_ThenBlocks_11_0, 
                    		"Sentence");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../dk.itu.bddcontracts/src-gen/dk/itu/bddcontracts/parser/antlr/internal/InternalGherkin.g:1066:2: (otherlv_12= 'And' ( (lv_ThenBlocks_13_0= ruleSentence ) ) )*
            loop27:
            do {
                int alt27=2;
                int LA27_0 = input.LA(1);

                if ( (LA27_0==14) ) {
                    alt27=1;
                }


                switch (alt27) {
            	case 1 :
            	    // ../dk.itu.bddcontracts/src-gen/dk/itu/bddcontracts/parser/antlr/internal/InternalGherkin.g:1066:4: otherlv_12= 'And' ( (lv_ThenBlocks_13_0= ruleSentence ) )
            	    {
            	    otherlv_12=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleScenarioOutline2191); 

            	        	newLeafNode(otherlv_12, grammarAccess.getScenarioOutlineAccess().getAndKeyword_8_0());
            	        
            	    // ../dk.itu.bddcontracts/src-gen/dk/itu/bddcontracts/parser/antlr/internal/InternalGherkin.g:1070:1: ( (lv_ThenBlocks_13_0= ruleSentence ) )
            	    // ../dk.itu.bddcontracts/src-gen/dk/itu/bddcontracts/parser/antlr/internal/InternalGherkin.g:1071:1: (lv_ThenBlocks_13_0= ruleSentence )
            	    {
            	    // ../dk.itu.bddcontracts/src-gen/dk/itu/bddcontracts/parser/antlr/internal/InternalGherkin.g:1071:1: (lv_ThenBlocks_13_0= ruleSentence )
            	    // ../dk.itu.bddcontracts/src-gen/dk/itu/bddcontracts/parser/antlr/internal/InternalGherkin.g:1072:3: lv_ThenBlocks_13_0= ruleSentence
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getScenarioOutlineAccess().getThenBlocksSentenceParserRuleCall_8_1_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_ruleSentence_in_ruleScenarioOutline2212);
            	    lv_ThenBlocks_13_0=ruleSentence();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getScenarioOutlineRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"ThenBlocks",
            	            		lv_ThenBlocks_13_0, 
            	            		"Sentence");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop27;
                }
            } while (true);

            otherlv_14=(Token)match(input,22,FollowSets000.FOLLOW_22_in_ruleScenarioOutline2226); 

                	newLeafNode(otherlv_14, grammarAccess.getScenarioOutlineAccess().getExamplesKeyword_9());
                
            // ../dk.itu.bddcontracts/src-gen/dk/itu/bddcontracts/parser/antlr/internal/InternalGherkin.g:1092:1: ( (lv_Examples_15_0= ruleExample ) )
            // ../dk.itu.bddcontracts/src-gen/dk/itu/bddcontracts/parser/antlr/internal/InternalGherkin.g:1093:1: (lv_Examples_15_0= ruleExample )
            {
            // ../dk.itu.bddcontracts/src-gen/dk/itu/bddcontracts/parser/antlr/internal/InternalGherkin.g:1093:1: (lv_Examples_15_0= ruleExample )
            // ../dk.itu.bddcontracts/src-gen/dk/itu/bddcontracts/parser/antlr/internal/InternalGherkin.g:1094:3: lv_Examples_15_0= ruleExample
            {
             
            	        newCompositeNode(grammarAccess.getScenarioOutlineAccess().getExamplesExampleParserRuleCall_10_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleExample_in_ruleScenarioOutline2247);
            lv_Examples_15_0=ruleExample();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getScenarioOutlineRule());
            	        }
                   		add(
                   			current, 
                   			"Examples",
                    		lv_Examples_15_0, 
                    		"Example");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../dk.itu.bddcontracts/src-gen/dk/itu/bddcontracts/parser/antlr/internal/InternalGherkin.g:1110:2: ( (lv_Examples_16_0= ruleExample ) )*
            loop28:
            do {
                int alt28=2;
                int LA28_0 = input.LA(1);

                if ( (LA28_0==25) ) {
                    alt28=1;
                }


                switch (alt28) {
            	case 1 :
            	    // ../dk.itu.bddcontracts/src-gen/dk/itu/bddcontracts/parser/antlr/internal/InternalGherkin.g:1111:1: (lv_Examples_16_0= ruleExample )
            	    {
            	    // ../dk.itu.bddcontracts/src-gen/dk/itu/bddcontracts/parser/antlr/internal/InternalGherkin.g:1111:1: (lv_Examples_16_0= ruleExample )
            	    // ../dk.itu.bddcontracts/src-gen/dk/itu/bddcontracts/parser/antlr/internal/InternalGherkin.g:1112:3: lv_Examples_16_0= ruleExample
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getScenarioOutlineAccess().getExamplesExampleParserRuleCall_11_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_ruleExample_in_ruleScenarioOutline2268);
            	    lv_Examples_16_0=ruleExample();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getScenarioOutlineRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"Examples",
            	            		lv_Examples_16_0, 
            	            		"Example");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop28;
                }
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
    // $ANTLR end "ruleScenarioOutline"


    // $ANTLR start "entryRuleReference"
    // ../dk.itu.bddcontracts/src-gen/dk/itu/bddcontracts/parser/antlr/internal/InternalGherkin.g:1136:1: entryRuleReference returns [EObject current=null] : iv_ruleReference= ruleReference EOF ;
    public final EObject entryRuleReference() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleReference = null;


        try {
            // ../dk.itu.bddcontracts/src-gen/dk/itu/bddcontracts/parser/antlr/internal/InternalGherkin.g:1137:2: (iv_ruleReference= ruleReference EOF )
            // ../dk.itu.bddcontracts/src-gen/dk/itu/bddcontracts/parser/antlr/internal/InternalGherkin.g:1138:2: iv_ruleReference= ruleReference EOF
            {
             newCompositeNode(grammarAccess.getReferenceRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleReference_in_entryRuleReference2305);
            iv_ruleReference=ruleReference();

            state._fsp--;

             current =iv_ruleReference; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleReference2315); 

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
    // $ANTLR end "entryRuleReference"


    // $ANTLR start "ruleReference"
    // ../dk.itu.bddcontracts/src-gen/dk/itu/bddcontracts/parser/antlr/internal/InternalGherkin.g:1145:1: ruleReference returns [EObject current=null] : ( () otherlv_1= '<' ( (lv_value_2_0= RULE_ID ) ) otherlv_3= '>' ) ;
    public final EObject ruleReference() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_value_2_0=null;
        Token otherlv_3=null;

         enterRule(); 
            
        try {
            // ../dk.itu.bddcontracts/src-gen/dk/itu/bddcontracts/parser/antlr/internal/InternalGherkin.g:1148:28: ( ( () otherlv_1= '<' ( (lv_value_2_0= RULE_ID ) ) otherlv_3= '>' ) )
            // ../dk.itu.bddcontracts/src-gen/dk/itu/bddcontracts/parser/antlr/internal/InternalGherkin.g:1149:1: ( () otherlv_1= '<' ( (lv_value_2_0= RULE_ID ) ) otherlv_3= '>' )
            {
            // ../dk.itu.bddcontracts/src-gen/dk/itu/bddcontracts/parser/antlr/internal/InternalGherkin.g:1149:1: ( () otherlv_1= '<' ( (lv_value_2_0= RULE_ID ) ) otherlv_3= '>' )
            // ../dk.itu.bddcontracts/src-gen/dk/itu/bddcontracts/parser/antlr/internal/InternalGherkin.g:1149:2: () otherlv_1= '<' ( (lv_value_2_0= RULE_ID ) ) otherlv_3= '>'
            {
            // ../dk.itu.bddcontracts/src-gen/dk/itu/bddcontracts/parser/antlr/internal/InternalGherkin.g:1149:2: ()
            // ../dk.itu.bddcontracts/src-gen/dk/itu/bddcontracts/parser/antlr/internal/InternalGherkin.g:1150:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getReferenceAccess().getReferenceAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,23,FollowSets000.FOLLOW_23_in_ruleReference2361); 

                	newLeafNode(otherlv_1, grammarAccess.getReferenceAccess().getLessThanSignKeyword_1());
                
            // ../dk.itu.bddcontracts/src-gen/dk/itu/bddcontracts/parser/antlr/internal/InternalGherkin.g:1159:1: ( (lv_value_2_0= RULE_ID ) )
            // ../dk.itu.bddcontracts/src-gen/dk/itu/bddcontracts/parser/antlr/internal/InternalGherkin.g:1160:1: (lv_value_2_0= RULE_ID )
            {
            // ../dk.itu.bddcontracts/src-gen/dk/itu/bddcontracts/parser/antlr/internal/InternalGherkin.g:1160:1: (lv_value_2_0= RULE_ID )
            // ../dk.itu.bddcontracts/src-gen/dk/itu/bddcontracts/parser/antlr/internal/InternalGherkin.g:1161:3: lv_value_2_0= RULE_ID
            {
            lv_value_2_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleReference2378); 

            			newLeafNode(lv_value_2_0, grammarAccess.getReferenceAccess().getValueIDTerminalRuleCall_2_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getReferenceRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"value",
                    		lv_value_2_0, 
                    		"ID");
            	    

            }


            }

            otherlv_3=(Token)match(input,24,FollowSets000.FOLLOW_24_in_ruleReference2395); 

                	newLeafNode(otherlv_3, grammarAccess.getReferenceAccess().getGreaterThanSignKeyword_3());
                

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
    // $ANTLR end "ruleReference"


    // $ANTLR start "entryRuleWord"
    // ../dk.itu.bddcontracts/src-gen/dk/itu/bddcontracts/parser/antlr/internal/InternalGherkin.g:1189:1: entryRuleWord returns [EObject current=null] : iv_ruleWord= ruleWord EOF ;
    public final EObject entryRuleWord() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleWord = null;


        try {
            // ../dk.itu.bddcontracts/src-gen/dk/itu/bddcontracts/parser/antlr/internal/InternalGherkin.g:1190:2: (iv_ruleWord= ruleWord EOF )
            // ../dk.itu.bddcontracts/src-gen/dk/itu/bddcontracts/parser/antlr/internal/InternalGherkin.g:1191:2: iv_ruleWord= ruleWord EOF
            {
             newCompositeNode(grammarAccess.getWordRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleWord_in_entryRuleWord2431);
            iv_ruleWord=ruleWord();

            state._fsp--;

             current =iv_ruleWord; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleWord2441); 

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
    // $ANTLR end "entryRuleWord"


    // $ANTLR start "ruleWord"
    // ../dk.itu.bddcontracts/src-gen/dk/itu/bddcontracts/parser/antlr/internal/InternalGherkin.g:1198:1: ruleWord returns [EObject current=null] : ( (lv_value_0_0= ruleAny ) ) ;
    public final EObject ruleWord() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_value_0_0 = null;


         enterRule(); 
            
        try {
            // ../dk.itu.bddcontracts/src-gen/dk/itu/bddcontracts/parser/antlr/internal/InternalGherkin.g:1201:28: ( ( (lv_value_0_0= ruleAny ) ) )
            // ../dk.itu.bddcontracts/src-gen/dk/itu/bddcontracts/parser/antlr/internal/InternalGherkin.g:1202:1: ( (lv_value_0_0= ruleAny ) )
            {
            // ../dk.itu.bddcontracts/src-gen/dk/itu/bddcontracts/parser/antlr/internal/InternalGherkin.g:1202:1: ( (lv_value_0_0= ruleAny ) )
            // ../dk.itu.bddcontracts/src-gen/dk/itu/bddcontracts/parser/antlr/internal/InternalGherkin.g:1203:1: (lv_value_0_0= ruleAny )
            {
            // ../dk.itu.bddcontracts/src-gen/dk/itu/bddcontracts/parser/antlr/internal/InternalGherkin.g:1203:1: (lv_value_0_0= ruleAny )
            // ../dk.itu.bddcontracts/src-gen/dk/itu/bddcontracts/parser/antlr/internal/InternalGherkin.g:1204:3: lv_value_0_0= ruleAny
            {
             
            	        newCompositeNode(grammarAccess.getWordAccess().getValueAnyParserRuleCall_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleAny_in_ruleWord2486);
            lv_value_0_0=ruleAny();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getWordRule());
            	        }
                   		set(
                   			current, 
                   			"value",
                    		lv_value_0_0, 
                    		"Any");
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
    // $ANTLR end "ruleWord"


    // $ANTLR start "entryRuleExample"
    // ../dk.itu.bddcontracts/src-gen/dk/itu/bddcontracts/parser/antlr/internal/InternalGherkin.g:1228:1: entryRuleExample returns [EObject current=null] : iv_ruleExample= ruleExample EOF ;
    public final EObject entryRuleExample() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExample = null;


        try {
            // ../dk.itu.bddcontracts/src-gen/dk/itu/bddcontracts/parser/antlr/internal/InternalGherkin.g:1229:2: (iv_ruleExample= ruleExample EOF )
            // ../dk.itu.bddcontracts/src-gen/dk/itu/bddcontracts/parser/antlr/internal/InternalGherkin.g:1230:2: iv_ruleExample= ruleExample EOF
            {
             newCompositeNode(grammarAccess.getExampleRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleExample_in_entryRuleExample2521);
            iv_ruleExample=ruleExample();

            state._fsp--;

             current =iv_ruleExample; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleExample2531); 

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
    // $ANTLR end "entryRuleExample"


    // $ANTLR start "ruleExample"
    // ../dk.itu.bddcontracts/src-gen/dk/itu/bddcontracts/parser/antlr/internal/InternalGherkin.g:1237:1: ruleExample returns [EObject current=null] : (otherlv_0= '|' ( (lv_keys_1_0= ruleEString ) ) (otherlv_2= '|' ( (lv_keys_3_0= ruleEString ) ) )* otherlv_4= '|' ( (lv_values_5_0= ruleValue ) ) (otherlv_6= '\\n' ( (lv_values_7_0= ruleValue ) ) )* ) ;
    public final EObject ruleExample() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        AntlrDatatypeRuleToken lv_keys_1_0 = null;

        AntlrDatatypeRuleToken lv_keys_3_0 = null;

        EObject lv_values_5_0 = null;

        EObject lv_values_7_0 = null;


         enterRule(); 
            
        try {
            // ../dk.itu.bddcontracts/src-gen/dk/itu/bddcontracts/parser/antlr/internal/InternalGherkin.g:1240:28: ( (otherlv_0= '|' ( (lv_keys_1_0= ruleEString ) ) (otherlv_2= '|' ( (lv_keys_3_0= ruleEString ) ) )* otherlv_4= '|' ( (lv_values_5_0= ruleValue ) ) (otherlv_6= '\\n' ( (lv_values_7_0= ruleValue ) ) )* ) )
            // ../dk.itu.bddcontracts/src-gen/dk/itu/bddcontracts/parser/antlr/internal/InternalGherkin.g:1241:1: (otherlv_0= '|' ( (lv_keys_1_0= ruleEString ) ) (otherlv_2= '|' ( (lv_keys_3_0= ruleEString ) ) )* otherlv_4= '|' ( (lv_values_5_0= ruleValue ) ) (otherlv_6= '\\n' ( (lv_values_7_0= ruleValue ) ) )* )
            {
            // ../dk.itu.bddcontracts/src-gen/dk/itu/bddcontracts/parser/antlr/internal/InternalGherkin.g:1241:1: (otherlv_0= '|' ( (lv_keys_1_0= ruleEString ) ) (otherlv_2= '|' ( (lv_keys_3_0= ruleEString ) ) )* otherlv_4= '|' ( (lv_values_5_0= ruleValue ) ) (otherlv_6= '\\n' ( (lv_values_7_0= ruleValue ) ) )* )
            // ../dk.itu.bddcontracts/src-gen/dk/itu/bddcontracts/parser/antlr/internal/InternalGherkin.g:1241:3: otherlv_0= '|' ( (lv_keys_1_0= ruleEString ) ) (otherlv_2= '|' ( (lv_keys_3_0= ruleEString ) ) )* otherlv_4= '|' ( (lv_values_5_0= ruleValue ) ) (otherlv_6= '\\n' ( (lv_values_7_0= ruleValue ) ) )*
            {
            otherlv_0=(Token)match(input,25,FollowSets000.FOLLOW_25_in_ruleExample2568); 

                	newLeafNode(otherlv_0, grammarAccess.getExampleAccess().getVerticalLineKeyword_0());
                
            // ../dk.itu.bddcontracts/src-gen/dk/itu/bddcontracts/parser/antlr/internal/InternalGherkin.g:1245:1: ( (lv_keys_1_0= ruleEString ) )
            // ../dk.itu.bddcontracts/src-gen/dk/itu/bddcontracts/parser/antlr/internal/InternalGherkin.g:1246:1: (lv_keys_1_0= ruleEString )
            {
            // ../dk.itu.bddcontracts/src-gen/dk/itu/bddcontracts/parser/antlr/internal/InternalGherkin.g:1246:1: (lv_keys_1_0= ruleEString )
            // ../dk.itu.bddcontracts/src-gen/dk/itu/bddcontracts/parser/antlr/internal/InternalGherkin.g:1247:3: lv_keys_1_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getExampleAccess().getKeysEStringParserRuleCall_1_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleExample2589);
            lv_keys_1_0=ruleEString();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getExampleRule());
            	        }
                   		add(
                   			current, 
                   			"keys",
                    		lv_keys_1_0, 
                    		"EString");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../dk.itu.bddcontracts/src-gen/dk/itu/bddcontracts/parser/antlr/internal/InternalGherkin.g:1263:2: (otherlv_2= '|' ( (lv_keys_3_0= ruleEString ) ) )*
            loop29:
            do {
                int alt29=2;
                int LA29_0 = input.LA(1);

                if ( (LA29_0==25) ) {
                    int LA29_1 = input.LA(2);

                    if ( ((LA29_1>=RULE_STRING && LA29_1<=RULE_INT)) ) {
                        alt29=1;
                    }


                }


                switch (alt29) {
            	case 1 :
            	    // ../dk.itu.bddcontracts/src-gen/dk/itu/bddcontracts/parser/antlr/internal/InternalGherkin.g:1263:4: otherlv_2= '|' ( (lv_keys_3_0= ruleEString ) )
            	    {
            	    otherlv_2=(Token)match(input,25,FollowSets000.FOLLOW_25_in_ruleExample2602); 

            	        	newLeafNode(otherlv_2, grammarAccess.getExampleAccess().getVerticalLineKeyword_2_0());
            	        
            	    // ../dk.itu.bddcontracts/src-gen/dk/itu/bddcontracts/parser/antlr/internal/InternalGherkin.g:1267:1: ( (lv_keys_3_0= ruleEString ) )
            	    // ../dk.itu.bddcontracts/src-gen/dk/itu/bddcontracts/parser/antlr/internal/InternalGherkin.g:1268:1: (lv_keys_3_0= ruleEString )
            	    {
            	    // ../dk.itu.bddcontracts/src-gen/dk/itu/bddcontracts/parser/antlr/internal/InternalGherkin.g:1268:1: (lv_keys_3_0= ruleEString )
            	    // ../dk.itu.bddcontracts/src-gen/dk/itu/bddcontracts/parser/antlr/internal/InternalGherkin.g:1269:3: lv_keys_3_0= ruleEString
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getExampleAccess().getKeysEStringParserRuleCall_2_1_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleExample2623);
            	    lv_keys_3_0=ruleEString();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getExampleRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"keys",
            	            		lv_keys_3_0, 
            	            		"EString");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop29;
                }
            } while (true);

            otherlv_4=(Token)match(input,25,FollowSets000.FOLLOW_25_in_ruleExample2637); 

                	newLeafNode(otherlv_4, grammarAccess.getExampleAccess().getVerticalLineKeyword_3());
                
            // ../dk.itu.bddcontracts/src-gen/dk/itu/bddcontracts/parser/antlr/internal/InternalGherkin.g:1289:1: ( (lv_values_5_0= ruleValue ) )
            // ../dk.itu.bddcontracts/src-gen/dk/itu/bddcontracts/parser/antlr/internal/InternalGherkin.g:1290:1: (lv_values_5_0= ruleValue )
            {
            // ../dk.itu.bddcontracts/src-gen/dk/itu/bddcontracts/parser/antlr/internal/InternalGherkin.g:1290:1: (lv_values_5_0= ruleValue )
            // ../dk.itu.bddcontracts/src-gen/dk/itu/bddcontracts/parser/antlr/internal/InternalGherkin.g:1291:3: lv_values_5_0= ruleValue
            {
             
            	        newCompositeNode(grammarAccess.getExampleAccess().getValuesValueParserRuleCall_4_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleValue_in_ruleExample2658);
            lv_values_5_0=ruleValue();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getExampleRule());
            	        }
                   		add(
                   			current, 
                   			"values",
                    		lv_values_5_0, 
                    		"Value");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../dk.itu.bddcontracts/src-gen/dk/itu/bddcontracts/parser/antlr/internal/InternalGherkin.g:1307:2: (otherlv_6= '\\n' ( (lv_values_7_0= ruleValue ) ) )*
            loop30:
            do {
                int alt30=2;
                int LA30_0 = input.LA(1);

                if ( (LA30_0==26) ) {
                    alt30=1;
                }


                switch (alt30) {
            	case 1 :
            	    // ../dk.itu.bddcontracts/src-gen/dk/itu/bddcontracts/parser/antlr/internal/InternalGherkin.g:1307:4: otherlv_6= '\\n' ( (lv_values_7_0= ruleValue ) )
            	    {
            	    otherlv_6=(Token)match(input,26,FollowSets000.FOLLOW_26_in_ruleExample2671); 

            	        	newLeafNode(otherlv_6, grammarAccess.getExampleAccess().getLineFeedLfKeyword_5_0());
            	        
            	    // ../dk.itu.bddcontracts/src-gen/dk/itu/bddcontracts/parser/antlr/internal/InternalGherkin.g:1311:1: ( (lv_values_7_0= ruleValue ) )
            	    // ../dk.itu.bddcontracts/src-gen/dk/itu/bddcontracts/parser/antlr/internal/InternalGherkin.g:1312:1: (lv_values_7_0= ruleValue )
            	    {
            	    // ../dk.itu.bddcontracts/src-gen/dk/itu/bddcontracts/parser/antlr/internal/InternalGherkin.g:1312:1: (lv_values_7_0= ruleValue )
            	    // ../dk.itu.bddcontracts/src-gen/dk/itu/bddcontracts/parser/antlr/internal/InternalGherkin.g:1313:3: lv_values_7_0= ruleValue
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getExampleAccess().getValuesValueParserRuleCall_5_1_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_ruleValue_in_ruleExample2692);
            	    lv_values_7_0=ruleValue();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getExampleRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"values",
            	            		lv_values_7_0, 
            	            		"Value");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop30;
                }
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
    // $ANTLR end "ruleExample"


    // $ANTLR start "entryRuleValue"
    // ../dk.itu.bddcontracts/src-gen/dk/itu/bddcontracts/parser/antlr/internal/InternalGherkin.g:1337:1: entryRuleValue returns [EObject current=null] : iv_ruleValue= ruleValue EOF ;
    public final EObject entryRuleValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleValue = null;


        try {
            // ../dk.itu.bddcontracts/src-gen/dk/itu/bddcontracts/parser/antlr/internal/InternalGherkin.g:1338:2: (iv_ruleValue= ruleValue EOF )
            // ../dk.itu.bddcontracts/src-gen/dk/itu/bddcontracts/parser/antlr/internal/InternalGherkin.g:1339:2: iv_ruleValue= ruleValue EOF
            {
             newCompositeNode(grammarAccess.getValueRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleValue_in_entryRuleValue2730);
            iv_ruleValue=ruleValue();

            state._fsp--;

             current =iv_ruleValue; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleValue2740); 

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
    // $ANTLR end "entryRuleValue"


    // $ANTLR start "ruleValue"
    // ../dk.itu.bddcontracts/src-gen/dk/itu/bddcontracts/parser/antlr/internal/InternalGherkin.g:1346:1: ruleValue returns [EObject current=null] : (otherlv_0= '|' ( (lv_elements_1_0= ruleEString ) ) (otherlv_2= '|' ( (lv_elements_3_0= ruleEString ) ) )* otherlv_4= '|' ) ;
    public final EObject ruleValue() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        AntlrDatatypeRuleToken lv_elements_1_0 = null;

        AntlrDatatypeRuleToken lv_elements_3_0 = null;


         enterRule(); 
            
        try {
            // ../dk.itu.bddcontracts/src-gen/dk/itu/bddcontracts/parser/antlr/internal/InternalGherkin.g:1349:28: ( (otherlv_0= '|' ( (lv_elements_1_0= ruleEString ) ) (otherlv_2= '|' ( (lv_elements_3_0= ruleEString ) ) )* otherlv_4= '|' ) )
            // ../dk.itu.bddcontracts/src-gen/dk/itu/bddcontracts/parser/antlr/internal/InternalGherkin.g:1350:1: (otherlv_0= '|' ( (lv_elements_1_0= ruleEString ) ) (otherlv_2= '|' ( (lv_elements_3_0= ruleEString ) ) )* otherlv_4= '|' )
            {
            // ../dk.itu.bddcontracts/src-gen/dk/itu/bddcontracts/parser/antlr/internal/InternalGherkin.g:1350:1: (otherlv_0= '|' ( (lv_elements_1_0= ruleEString ) ) (otherlv_2= '|' ( (lv_elements_3_0= ruleEString ) ) )* otherlv_4= '|' )
            // ../dk.itu.bddcontracts/src-gen/dk/itu/bddcontracts/parser/antlr/internal/InternalGherkin.g:1350:3: otherlv_0= '|' ( (lv_elements_1_0= ruleEString ) ) (otherlv_2= '|' ( (lv_elements_3_0= ruleEString ) ) )* otherlv_4= '|'
            {
            otherlv_0=(Token)match(input,25,FollowSets000.FOLLOW_25_in_ruleValue2777); 

                	newLeafNode(otherlv_0, grammarAccess.getValueAccess().getVerticalLineKeyword_0());
                
            // ../dk.itu.bddcontracts/src-gen/dk/itu/bddcontracts/parser/antlr/internal/InternalGherkin.g:1354:1: ( (lv_elements_1_0= ruleEString ) )
            // ../dk.itu.bddcontracts/src-gen/dk/itu/bddcontracts/parser/antlr/internal/InternalGherkin.g:1355:1: (lv_elements_1_0= ruleEString )
            {
            // ../dk.itu.bddcontracts/src-gen/dk/itu/bddcontracts/parser/antlr/internal/InternalGherkin.g:1355:1: (lv_elements_1_0= ruleEString )
            // ../dk.itu.bddcontracts/src-gen/dk/itu/bddcontracts/parser/antlr/internal/InternalGherkin.g:1356:3: lv_elements_1_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getValueAccess().getElementsEStringParserRuleCall_1_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleValue2798);
            lv_elements_1_0=ruleEString();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getValueRule());
            	        }
                   		add(
                   			current, 
                   			"elements",
                    		lv_elements_1_0, 
                    		"EString");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../dk.itu.bddcontracts/src-gen/dk/itu/bddcontracts/parser/antlr/internal/InternalGherkin.g:1372:2: (otherlv_2= '|' ( (lv_elements_3_0= ruleEString ) ) )*
            loop31:
            do {
                int alt31=2;
                int LA31_0 = input.LA(1);

                if ( (LA31_0==25) ) {
                    int LA31_1 = input.LA(2);

                    if ( ((LA31_1>=RULE_STRING && LA31_1<=RULE_INT)) ) {
                        alt31=1;
                    }


                }


                switch (alt31) {
            	case 1 :
            	    // ../dk.itu.bddcontracts/src-gen/dk/itu/bddcontracts/parser/antlr/internal/InternalGherkin.g:1372:4: otherlv_2= '|' ( (lv_elements_3_0= ruleEString ) )
            	    {
            	    otherlv_2=(Token)match(input,25,FollowSets000.FOLLOW_25_in_ruleValue2811); 

            	        	newLeafNode(otherlv_2, grammarAccess.getValueAccess().getVerticalLineKeyword_2_0());
            	        
            	    // ../dk.itu.bddcontracts/src-gen/dk/itu/bddcontracts/parser/antlr/internal/InternalGherkin.g:1376:1: ( (lv_elements_3_0= ruleEString ) )
            	    // ../dk.itu.bddcontracts/src-gen/dk/itu/bddcontracts/parser/antlr/internal/InternalGherkin.g:1377:1: (lv_elements_3_0= ruleEString )
            	    {
            	    // ../dk.itu.bddcontracts/src-gen/dk/itu/bddcontracts/parser/antlr/internal/InternalGherkin.g:1377:1: (lv_elements_3_0= ruleEString )
            	    // ../dk.itu.bddcontracts/src-gen/dk/itu/bddcontracts/parser/antlr/internal/InternalGherkin.g:1378:3: lv_elements_3_0= ruleEString
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getValueAccess().getElementsEStringParserRuleCall_2_1_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleValue2832);
            	    lv_elements_3_0=ruleEString();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getValueRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"elements",
            	            		lv_elements_3_0, 
            	            		"EString");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop31;
                }
            } while (true);

            otherlv_4=(Token)match(input,25,FollowSets000.FOLLOW_25_in_ruleValue2846); 

                	newLeafNode(otherlv_4, grammarAccess.getValueAccess().getVerticalLineKeyword_3());
                

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
    // $ANTLR end "ruleValue"

    // Delegated rules


 

    
    private static class FollowSets000 {
        public static final BitSet FOLLOW_ruleModel_in_entryRuleModel75 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleModel85 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleFeature_in_ruleModel141 = new BitSet(new long[]{0x0000000000000802L});
        public static final BitSet FOLLOW_ruleFeature_in_ruleModel162 = new BitSet(new long[]{0x0000000000000802L});
        public static final BitSet FOLLOW_ruleScenario_in_entryRuleScenario201 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleScenario211 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleScenarioSpecific_in_ruleScenario258 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleScenarioOutline_in_ruleScenario285 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleContent_in_entryRuleContent320 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleContent330 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleReference_in_ruleContent377 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleWord_in_ruleContent404 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleFeature_in_entryRuleFeature439 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleFeature449 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_11_in_ruleFeature486 = new BitSet(new long[]{0x0000000000000070L});
        public static final BitSet FOLLOW_ruleEString_in_ruleFeature507 = new BitSet(new long[]{0x00000000002490F2L});
        public static final BitSet FOLLOW_ruleMAny_in_ruleFeature528 = new BitSet(new long[]{0x0000000000249002L});
        public static final BitSet FOLLOW_ruleBackground_in_ruleFeature550 = new BitSet(new long[]{0x0000000000248002L});
        public static final BitSet FOLLOW_ruleScenario_in_ruleFeature573 = new BitSet(new long[]{0x0000000000248002L});
        public static final BitSet FOLLOW_ruleScenario_in_ruleFeature594 = new BitSet(new long[]{0x0000000000248002L});
        public static final BitSet FOLLOW_ruleBehavior_in_ruleFeature619 = new BitSet(new long[]{0x0000000000008002L});
        public static final BitSet FOLLOW_ruleBehavior_in_ruleFeature640 = new BitSet(new long[]{0x0000000000008002L});
        public static final BitSet FOLLOW_ruleEString_in_entryRuleEString680 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleEString691 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_STRING_in_ruleEString731 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleEString757 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_INT_in_ruleEString783 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleMAny_in_entryRuleMAny829 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleMAny840 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAny_in_ruleMAny887 = new BitSet(new long[]{0x00000000000000F2L});
        public static final BitSet FOLLOW_ruleAny_in_entryRuleAny934 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleAny945 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleAny985 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_INT_in_ruleAny1011 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_STRING_in_ruleAny1037 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ANY_OTHER_in_ruleAny1063 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleBackground_in_entryRuleBackground1108 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleBackground1118 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_12_in_ruleBackground1155 = new BitSet(new long[]{0x0000000000002000L});
        public static final BitSet FOLLOW_13_in_ruleBackground1167 = new BitSet(new long[]{0x00000000008000F0L});
        public static final BitSet FOLLOW_ruleSentence_in_ruleBackground1188 = new BitSet(new long[]{0x0000000000004002L});
        public static final BitSet FOLLOW_14_in_ruleBackground1201 = new BitSet(new long[]{0x00000000008000F0L});
        public static final BitSet FOLLOW_ruleSentence_in_ruleBackground1222 = new BitSet(new long[]{0x0000000000004002L});
        public static final BitSet FOLLOW_ruleBehavior_in_entryRuleBehavior1260 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleBehavior1270 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_15_in_ruleBehavior1307 = new BitSet(new long[]{0x00000000000000F0L});
        public static final BitSet FOLLOW_ruleMAny_in_ruleBehavior1328 = new BitSet(new long[]{0x0000000000030002L});
        public static final BitSet FOLLOW_16_in_ruleBehavior1341 = new BitSet(new long[]{0x00000000008000F0L});
        public static final BitSet FOLLOW_ruleSentence_in_ruleBehavior1362 = new BitSet(new long[]{0x0000000000024002L});
        public static final BitSet FOLLOW_14_in_ruleBehavior1375 = new BitSet(new long[]{0x00000000008000F0L});
        public static final BitSet FOLLOW_ruleSentence_in_ruleBehavior1396 = new BitSet(new long[]{0x0000000000024002L});
        public static final BitSet FOLLOW_17_in_ruleBehavior1413 = new BitSet(new long[]{0x00000000008000F0L});
        public static final BitSet FOLLOW_ruleSentence_in_ruleBehavior1434 = new BitSet(new long[]{0x0000000000004002L});
        public static final BitSet FOLLOW_14_in_ruleBehavior1447 = new BitSet(new long[]{0x00000000008000F0L});
        public static final BitSet FOLLOW_ruleSentence_in_ruleBehavior1468 = new BitSet(new long[]{0x0000000000004002L});
        public static final BitSet FOLLOW_ruleSentence_in_entryRuleSentence1508 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleSentence1518 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleContent_in_ruleSentence1564 = new BitSet(new long[]{0x00000000008000F2L});
        public static final BitSet FOLLOW_ruleContent_in_ruleSentence1585 = new BitSet(new long[]{0x00000000008000F2L});
        public static final BitSet FOLLOW_ruleScenarioSpecific_in_entryRuleScenarioSpecific1622 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleScenarioSpecific1632 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_18_in_ruleScenarioSpecific1669 = new BitSet(new long[]{0x00000000000000F0L});
        public static final BitSet FOLLOW_ruleMAny_in_ruleScenarioSpecific1690 = new BitSet(new long[]{0x0000000000002000L});
        public static final BitSet FOLLOW_13_in_ruleScenarioSpecific1702 = new BitSet(new long[]{0x00000000008000F0L});
        public static final BitSet FOLLOW_ruleSentence_in_ruleScenarioSpecific1723 = new BitSet(new long[]{0x0000000000184000L});
        public static final BitSet FOLLOW_14_in_ruleScenarioSpecific1736 = new BitSet(new long[]{0x00000000008000F0L});
        public static final BitSet FOLLOW_ruleSentence_in_ruleScenarioSpecific1757 = new BitSet(new long[]{0x0000000000184000L});
        public static final BitSet FOLLOW_19_in_ruleScenarioSpecific1772 = new BitSet(new long[]{0x00000000008000F0L});
        public static final BitSet FOLLOW_ruleSentence_in_ruleScenarioSpecific1793 = new BitSet(new long[]{0x0000000000104000L});
        public static final BitSet FOLLOW_14_in_ruleScenarioSpecific1806 = new BitSet(new long[]{0x00000000008000F0L});
        public static final BitSet FOLLOW_ruleSentence_in_ruleScenarioSpecific1827 = new BitSet(new long[]{0x0000000000104000L});
        public static final BitSet FOLLOW_20_in_ruleScenarioSpecific1843 = new BitSet(new long[]{0x00000000008000F0L});
        public static final BitSet FOLLOW_ruleSentence_in_ruleScenarioSpecific1864 = new BitSet(new long[]{0x0000000000004002L});
        public static final BitSet FOLLOW_14_in_ruleScenarioSpecific1877 = new BitSet(new long[]{0x00000000008000F0L});
        public static final BitSet FOLLOW_ruleSentence_in_ruleScenarioSpecific1898 = new BitSet(new long[]{0x0000000000004002L});
        public static final BitSet FOLLOW_ruleScenarioOutline_in_entryRuleScenarioOutline1936 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleScenarioOutline1946 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_21_in_ruleScenarioOutline1983 = new BitSet(new long[]{0x00000000000000F0L});
        public static final BitSet FOLLOW_ruleMAny_in_ruleScenarioOutline2004 = new BitSet(new long[]{0x0000000000002000L});
        public static final BitSet FOLLOW_13_in_ruleScenarioOutline2016 = new BitSet(new long[]{0x00000000008000F0L});
        public static final BitSet FOLLOW_ruleSentence_in_ruleScenarioOutline2037 = new BitSet(new long[]{0x0000000000184000L});
        public static final BitSet FOLLOW_14_in_ruleScenarioOutline2050 = new BitSet(new long[]{0x00000000008000F0L});
        public static final BitSet FOLLOW_ruleSentence_in_ruleScenarioOutline2071 = new BitSet(new long[]{0x0000000000184000L});
        public static final BitSet FOLLOW_19_in_ruleScenarioOutline2086 = new BitSet(new long[]{0x00000000008000F0L});
        public static final BitSet FOLLOW_ruleSentence_in_ruleScenarioOutline2107 = new BitSet(new long[]{0x0000000000104000L});
        public static final BitSet FOLLOW_14_in_ruleScenarioOutline2120 = new BitSet(new long[]{0x00000000008000F0L});
        public static final BitSet FOLLOW_ruleSentence_in_ruleScenarioOutline2141 = new BitSet(new long[]{0x0000000000104000L});
        public static final BitSet FOLLOW_20_in_ruleScenarioOutline2157 = new BitSet(new long[]{0x00000000008000F0L});
        public static final BitSet FOLLOW_ruleSentence_in_ruleScenarioOutline2178 = new BitSet(new long[]{0x0000000000404000L});
        public static final BitSet FOLLOW_14_in_ruleScenarioOutline2191 = new BitSet(new long[]{0x00000000008000F0L});
        public static final BitSet FOLLOW_ruleSentence_in_ruleScenarioOutline2212 = new BitSet(new long[]{0x0000000000404000L});
        public static final BitSet FOLLOW_22_in_ruleScenarioOutline2226 = new BitSet(new long[]{0x0000000002000000L});
        public static final BitSet FOLLOW_ruleExample_in_ruleScenarioOutline2247 = new BitSet(new long[]{0x0000000002000002L});
        public static final BitSet FOLLOW_ruleExample_in_ruleScenarioOutline2268 = new BitSet(new long[]{0x0000000002000002L});
        public static final BitSet FOLLOW_ruleReference_in_entryRuleReference2305 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleReference2315 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_23_in_ruleReference2361 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleReference2378 = new BitSet(new long[]{0x0000000001000000L});
        public static final BitSet FOLLOW_24_in_ruleReference2395 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleWord_in_entryRuleWord2431 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleWord2441 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAny_in_ruleWord2486 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleExample_in_entryRuleExample2521 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleExample2531 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_25_in_ruleExample2568 = new BitSet(new long[]{0x0000000000000070L});
        public static final BitSet FOLLOW_ruleEString_in_ruleExample2589 = new BitSet(new long[]{0x0000000002000000L});
        public static final BitSet FOLLOW_25_in_ruleExample2602 = new BitSet(new long[]{0x0000000000000070L});
        public static final BitSet FOLLOW_ruleEString_in_ruleExample2623 = new BitSet(new long[]{0x0000000002000000L});
        public static final BitSet FOLLOW_25_in_ruleExample2637 = new BitSet(new long[]{0x0000000002000000L});
        public static final BitSet FOLLOW_ruleValue_in_ruleExample2658 = new BitSet(new long[]{0x0000000004000002L});
        public static final BitSet FOLLOW_26_in_ruleExample2671 = new BitSet(new long[]{0x0000000002000000L});
        public static final BitSet FOLLOW_ruleValue_in_ruleExample2692 = new BitSet(new long[]{0x0000000004000002L});
        public static final BitSet FOLLOW_ruleValue_in_entryRuleValue2730 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleValue2740 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_25_in_ruleValue2777 = new BitSet(new long[]{0x0000000000000070L});
        public static final BitSet FOLLOW_ruleEString_in_ruleValue2798 = new BitSet(new long[]{0x0000000002000000L});
        public static final BitSet FOLLOW_25_in_ruleValue2811 = new BitSet(new long[]{0x0000000000000070L});
        public static final BitSet FOLLOW_ruleEString_in_ruleValue2832 = new BitSet(new long[]{0x0000000002000000L});
        public static final BitSet FOLLOW_25_in_ruleValue2846 = new BitSet(new long[]{0x0000000000000002L});
    }


}