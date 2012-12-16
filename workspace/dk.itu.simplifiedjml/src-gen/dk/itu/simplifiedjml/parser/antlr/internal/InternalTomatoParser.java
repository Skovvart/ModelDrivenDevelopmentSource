package dk.itu.simplifiedjml.parser.antlr.internal; 

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import dk.itu.simplifiedjml.services.TomatoGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalTomatoParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_ANY_OTHER", "RULE_HACKY_SIGN", "RULE_INT", "RULE_SL_COMMENT", "RULE_ML_COMMENT", "RULE_WS", "'class'", "'{'", "'//@ invariant'", "'}'", "'//@ requires'", "'\\n'", "'//@ ensures'", "'/*< AUTO GENERATED >*/'", "'/* TODO: Implementation */'", "'throw new UnsupportedOperationException(\"Not Implemented\");'"
    };
    public static final int RULE_ID=5;
    public static final int T__21=21;
    public static final int RULE_ANY_OTHER=6;
    public static final int T__20=20;
    public static final int RULE_HACKY_SIGN=7;
    public static final int EOF=-1;
    public static final int RULE_SL_COMMENT=9;
    public static final int RULE_ML_COMMENT=10;
    public static final int T__19=19;
    public static final int RULE_STRING=4;
    public static final int T__16=16;
    public static final int T__15=15;
    public static final int T__18=18;
    public static final int T__17=17;
    public static final int T__12=12;
    public static final int T__14=14;
    public static final int T__13=13;
    public static final int RULE_INT=8;
    public static final int RULE_WS=11;

    // delegates
    // delegators


        public InternalTomatoParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalTomatoParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalTomatoParser.tokenNames; }
    public String getGrammarFileName() { return "../dk.itu.simplifiedjml/src-gen/dk/itu/simplifiedjml/parser/antlr/internal/InternalTomato.g"; }



     	private TomatoGrammarAccess grammarAccess;
     	
        public InternalTomatoParser(TokenStream input, TomatoGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }
        
        @Override
        protected String getFirstRuleName() {
        	return "SimplifiedJMLModel";	
       	}
       	
       	@Override
       	protected TomatoGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}



    // $ANTLR start "entryRuleSimplifiedJMLModel"
    // ../dk.itu.simplifiedjml/src-gen/dk/itu/simplifiedjml/parser/antlr/internal/InternalTomato.g:67:1: entryRuleSimplifiedJMLModel returns [EObject current=null] : iv_ruleSimplifiedJMLModel= ruleSimplifiedJMLModel EOF ;
    public final EObject entryRuleSimplifiedJMLModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSimplifiedJMLModel = null;


        try {
            // ../dk.itu.simplifiedjml/src-gen/dk/itu/simplifiedjml/parser/antlr/internal/InternalTomato.g:68:2: (iv_ruleSimplifiedJMLModel= ruleSimplifiedJMLModel EOF )
            // ../dk.itu.simplifiedjml/src-gen/dk/itu/simplifiedjml/parser/antlr/internal/InternalTomato.g:69:2: iv_ruleSimplifiedJMLModel= ruleSimplifiedJMLModel EOF
            {
             newCompositeNode(grammarAccess.getSimplifiedJMLModelRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleSimplifiedJMLModel_in_entryRuleSimplifiedJMLModel75);
            iv_ruleSimplifiedJMLModel=ruleSimplifiedJMLModel();

            state._fsp--;

             current =iv_ruleSimplifiedJMLModel; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleSimplifiedJMLModel85); 

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
    // $ANTLR end "entryRuleSimplifiedJMLModel"


    // $ANTLR start "ruleSimplifiedJMLModel"
    // ../dk.itu.simplifiedjml/src-gen/dk/itu/simplifiedjml/parser/antlr/internal/InternalTomato.g:76:1: ruleSimplifiedJMLModel returns [EObject current=null] : ( ( (lv_structures_0_0= ruleStructure ) ) ( (lv_structures_1_0= ruleStructure ) )* ) ;
    public final EObject ruleSimplifiedJMLModel() throws RecognitionException {
        EObject current = null;

        EObject lv_structures_0_0 = null;

        EObject lv_structures_1_0 = null;


         enterRule(); 
            
        try {
            // ../dk.itu.simplifiedjml/src-gen/dk/itu/simplifiedjml/parser/antlr/internal/InternalTomato.g:79:28: ( ( ( (lv_structures_0_0= ruleStructure ) ) ( (lv_structures_1_0= ruleStructure ) )* ) )
            // ../dk.itu.simplifiedjml/src-gen/dk/itu/simplifiedjml/parser/antlr/internal/InternalTomato.g:80:1: ( ( (lv_structures_0_0= ruleStructure ) ) ( (lv_structures_1_0= ruleStructure ) )* )
            {
            // ../dk.itu.simplifiedjml/src-gen/dk/itu/simplifiedjml/parser/antlr/internal/InternalTomato.g:80:1: ( ( (lv_structures_0_0= ruleStructure ) ) ( (lv_structures_1_0= ruleStructure ) )* )
            // ../dk.itu.simplifiedjml/src-gen/dk/itu/simplifiedjml/parser/antlr/internal/InternalTomato.g:80:2: ( (lv_structures_0_0= ruleStructure ) ) ( (lv_structures_1_0= ruleStructure ) )*
            {
            // ../dk.itu.simplifiedjml/src-gen/dk/itu/simplifiedjml/parser/antlr/internal/InternalTomato.g:80:2: ( (lv_structures_0_0= ruleStructure ) )
            // ../dk.itu.simplifiedjml/src-gen/dk/itu/simplifiedjml/parser/antlr/internal/InternalTomato.g:81:1: (lv_structures_0_0= ruleStructure )
            {
            // ../dk.itu.simplifiedjml/src-gen/dk/itu/simplifiedjml/parser/antlr/internal/InternalTomato.g:81:1: (lv_structures_0_0= ruleStructure )
            // ../dk.itu.simplifiedjml/src-gen/dk/itu/simplifiedjml/parser/antlr/internal/InternalTomato.g:82:3: lv_structures_0_0= ruleStructure
            {
             
            	        newCompositeNode(grammarAccess.getSimplifiedJMLModelAccess().getStructuresStructureParserRuleCall_0_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleStructure_in_ruleSimplifiedJMLModel131);
            lv_structures_0_0=ruleStructure();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getSimplifiedJMLModelRule());
            	        }
                   		add(
                   			current, 
                   			"structures",
                    		lv_structures_0_0, 
                    		"Structure");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../dk.itu.simplifiedjml/src-gen/dk/itu/simplifiedjml/parser/antlr/internal/InternalTomato.g:98:2: ( (lv_structures_1_0= ruleStructure ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==12) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ../dk.itu.simplifiedjml/src-gen/dk/itu/simplifiedjml/parser/antlr/internal/InternalTomato.g:99:1: (lv_structures_1_0= ruleStructure )
            	    {
            	    // ../dk.itu.simplifiedjml/src-gen/dk/itu/simplifiedjml/parser/antlr/internal/InternalTomato.g:99:1: (lv_structures_1_0= ruleStructure )
            	    // ../dk.itu.simplifiedjml/src-gen/dk/itu/simplifiedjml/parser/antlr/internal/InternalTomato.g:100:3: lv_structures_1_0= ruleStructure
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getSimplifiedJMLModelAccess().getStructuresStructureParserRuleCall_1_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_ruleStructure_in_ruleSimplifiedJMLModel152);
            	    lv_structures_1_0=ruleStructure();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getSimplifiedJMLModelRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"structures",
            	            		lv_structures_1_0, 
            	            		"Structure");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
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
    // $ANTLR end "ruleSimplifiedJMLModel"


    // $ANTLR start "entryRuleStructure"
    // ../dk.itu.simplifiedjml/src-gen/dk/itu/simplifiedjml/parser/antlr/internal/InternalTomato.g:124:1: entryRuleStructure returns [EObject current=null] : iv_ruleStructure= ruleStructure EOF ;
    public final EObject entryRuleStructure() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStructure = null;


        try {
            // ../dk.itu.simplifiedjml/src-gen/dk/itu/simplifiedjml/parser/antlr/internal/InternalTomato.g:125:2: (iv_ruleStructure= ruleStructure EOF )
            // ../dk.itu.simplifiedjml/src-gen/dk/itu/simplifiedjml/parser/antlr/internal/InternalTomato.g:126:2: iv_ruleStructure= ruleStructure EOF
            {
             newCompositeNode(grammarAccess.getStructureRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleStructure_in_entryRuleStructure189);
            iv_ruleStructure=ruleStructure();

            state._fsp--;

             current =iv_ruleStructure; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleStructure199); 

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
    // $ANTLR end "entryRuleStructure"


    // $ANTLR start "ruleStructure"
    // ../dk.itu.simplifiedjml/src-gen/dk/itu/simplifiedjml/parser/antlr/internal/InternalTomato.g:133:1: ruleStructure returns [EObject current=null] : ( () otherlv_1= 'class' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= '//@ invariant' ( (lv_invariants_5_0= ruleAnyOther ) ) (otherlv_6= '//@ invariant' ( (lv_invariants_7_0= ruleAnyOther ) ) )* )? ( ( (lv_methods_8_0= ruleMethod ) ) ( (lv_methods_9_0= ruleMethod ) )* )? otherlv_10= '}' ) ;
    public final EObject ruleStructure() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_10=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        AntlrDatatypeRuleToken lv_invariants_5_0 = null;

        AntlrDatatypeRuleToken lv_invariants_7_0 = null;

        EObject lv_methods_8_0 = null;

        EObject lv_methods_9_0 = null;


         enterRule(); 
            
        try {
            // ../dk.itu.simplifiedjml/src-gen/dk/itu/simplifiedjml/parser/antlr/internal/InternalTomato.g:136:28: ( ( () otherlv_1= 'class' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= '//@ invariant' ( (lv_invariants_5_0= ruleAnyOther ) ) (otherlv_6= '//@ invariant' ( (lv_invariants_7_0= ruleAnyOther ) ) )* )? ( ( (lv_methods_8_0= ruleMethod ) ) ( (lv_methods_9_0= ruleMethod ) )* )? otherlv_10= '}' ) )
            // ../dk.itu.simplifiedjml/src-gen/dk/itu/simplifiedjml/parser/antlr/internal/InternalTomato.g:137:1: ( () otherlv_1= 'class' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= '//@ invariant' ( (lv_invariants_5_0= ruleAnyOther ) ) (otherlv_6= '//@ invariant' ( (lv_invariants_7_0= ruleAnyOther ) ) )* )? ( ( (lv_methods_8_0= ruleMethod ) ) ( (lv_methods_9_0= ruleMethod ) )* )? otherlv_10= '}' )
            {
            // ../dk.itu.simplifiedjml/src-gen/dk/itu/simplifiedjml/parser/antlr/internal/InternalTomato.g:137:1: ( () otherlv_1= 'class' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= '//@ invariant' ( (lv_invariants_5_0= ruleAnyOther ) ) (otherlv_6= '//@ invariant' ( (lv_invariants_7_0= ruleAnyOther ) ) )* )? ( ( (lv_methods_8_0= ruleMethod ) ) ( (lv_methods_9_0= ruleMethod ) )* )? otherlv_10= '}' )
            // ../dk.itu.simplifiedjml/src-gen/dk/itu/simplifiedjml/parser/antlr/internal/InternalTomato.g:137:2: () otherlv_1= 'class' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= '//@ invariant' ( (lv_invariants_5_0= ruleAnyOther ) ) (otherlv_6= '//@ invariant' ( (lv_invariants_7_0= ruleAnyOther ) ) )* )? ( ( (lv_methods_8_0= ruleMethod ) ) ( (lv_methods_9_0= ruleMethod ) )* )? otherlv_10= '}'
            {
            // ../dk.itu.simplifiedjml/src-gen/dk/itu/simplifiedjml/parser/antlr/internal/InternalTomato.g:137:2: ()
            // ../dk.itu.simplifiedjml/src-gen/dk/itu/simplifiedjml/parser/antlr/internal/InternalTomato.g:138:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getStructureAccess().getStructureAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleStructure245); 

                	newLeafNode(otherlv_1, grammarAccess.getStructureAccess().getClassKeyword_1());
                
            // ../dk.itu.simplifiedjml/src-gen/dk/itu/simplifiedjml/parser/antlr/internal/InternalTomato.g:147:1: ( (lv_name_2_0= ruleEString ) )
            // ../dk.itu.simplifiedjml/src-gen/dk/itu/simplifiedjml/parser/antlr/internal/InternalTomato.g:148:1: (lv_name_2_0= ruleEString )
            {
            // ../dk.itu.simplifiedjml/src-gen/dk/itu/simplifiedjml/parser/antlr/internal/InternalTomato.g:148:1: (lv_name_2_0= ruleEString )
            // ../dk.itu.simplifiedjml/src-gen/dk/itu/simplifiedjml/parser/antlr/internal/InternalTomato.g:149:3: lv_name_2_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getStructureAccess().getNameEStringParserRuleCall_2_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleStructure266);
            lv_name_2_0=ruleEString();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getStructureRule());
            	        }
                   		set(
                   			current, 
                   			"name",
                    		lv_name_2_0, 
                    		"EString");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_3=(Token)match(input,13,FollowSets000.FOLLOW_13_in_ruleStructure278); 

                	newLeafNode(otherlv_3, grammarAccess.getStructureAccess().getLeftCurlyBracketKeyword_3());
                
            // ../dk.itu.simplifiedjml/src-gen/dk/itu/simplifiedjml/parser/antlr/internal/InternalTomato.g:169:1: (otherlv_4= '//@ invariant' ( (lv_invariants_5_0= ruleAnyOther ) ) (otherlv_6= '//@ invariant' ( (lv_invariants_7_0= ruleAnyOther ) ) )* )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==14) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // ../dk.itu.simplifiedjml/src-gen/dk/itu/simplifiedjml/parser/antlr/internal/InternalTomato.g:169:3: otherlv_4= '//@ invariant' ( (lv_invariants_5_0= ruleAnyOther ) ) (otherlv_6= '//@ invariant' ( (lv_invariants_7_0= ruleAnyOther ) ) )*
                    {
                    otherlv_4=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleStructure291); 

                        	newLeafNode(otherlv_4, grammarAccess.getStructureAccess().getInvariantKeyword_4_0());
                        
                    // ../dk.itu.simplifiedjml/src-gen/dk/itu/simplifiedjml/parser/antlr/internal/InternalTomato.g:173:1: ( (lv_invariants_5_0= ruleAnyOther ) )
                    // ../dk.itu.simplifiedjml/src-gen/dk/itu/simplifiedjml/parser/antlr/internal/InternalTomato.g:174:1: (lv_invariants_5_0= ruleAnyOther )
                    {
                    // ../dk.itu.simplifiedjml/src-gen/dk/itu/simplifiedjml/parser/antlr/internal/InternalTomato.g:174:1: (lv_invariants_5_0= ruleAnyOther )
                    // ../dk.itu.simplifiedjml/src-gen/dk/itu/simplifiedjml/parser/antlr/internal/InternalTomato.g:175:3: lv_invariants_5_0= ruleAnyOther
                    {
                     
                    	        newCompositeNode(grammarAccess.getStructureAccess().getInvariantsAnyOtherParserRuleCall_4_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleAnyOther_in_ruleStructure312);
                    lv_invariants_5_0=ruleAnyOther();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getStructureRule());
                    	        }
                           		add(
                           			current, 
                           			"invariants",
                            		lv_invariants_5_0, 
                            		"AnyOther");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../dk.itu.simplifiedjml/src-gen/dk/itu/simplifiedjml/parser/antlr/internal/InternalTomato.g:191:2: (otherlv_6= '//@ invariant' ( (lv_invariants_7_0= ruleAnyOther ) ) )*
                    loop2:
                    do {
                        int alt2=2;
                        int LA2_0 = input.LA(1);

                        if ( (LA2_0==14) ) {
                            alt2=1;
                        }


                        switch (alt2) {
                    	case 1 :
                    	    // ../dk.itu.simplifiedjml/src-gen/dk/itu/simplifiedjml/parser/antlr/internal/InternalTomato.g:191:4: otherlv_6= '//@ invariant' ( (lv_invariants_7_0= ruleAnyOther ) )
                    	    {
                    	    otherlv_6=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleStructure325); 

                    	        	newLeafNode(otherlv_6, grammarAccess.getStructureAccess().getInvariantKeyword_4_2_0());
                    	        
                    	    // ../dk.itu.simplifiedjml/src-gen/dk/itu/simplifiedjml/parser/antlr/internal/InternalTomato.g:195:1: ( (lv_invariants_7_0= ruleAnyOther ) )
                    	    // ../dk.itu.simplifiedjml/src-gen/dk/itu/simplifiedjml/parser/antlr/internal/InternalTomato.g:196:1: (lv_invariants_7_0= ruleAnyOther )
                    	    {
                    	    // ../dk.itu.simplifiedjml/src-gen/dk/itu/simplifiedjml/parser/antlr/internal/InternalTomato.g:196:1: (lv_invariants_7_0= ruleAnyOther )
                    	    // ../dk.itu.simplifiedjml/src-gen/dk/itu/simplifiedjml/parser/antlr/internal/InternalTomato.g:197:3: lv_invariants_7_0= ruleAnyOther
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getStructureAccess().getInvariantsAnyOtherParserRuleCall_4_2_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleAnyOther_in_ruleStructure346);
                    	    lv_invariants_7_0=ruleAnyOther();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getStructureRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"invariants",
                    	            		lv_invariants_7_0, 
                    	            		"AnyOther");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop2;
                        }
                    } while (true);


                    }
                    break;

            }

            // ../dk.itu.simplifiedjml/src-gen/dk/itu/simplifiedjml/parser/antlr/internal/InternalTomato.g:213:6: ( ( (lv_methods_8_0= ruleMethod ) ) ( (lv_methods_9_0= ruleMethod ) )* )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==16||(LA5_0>=18 && LA5_0<=19)) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // ../dk.itu.simplifiedjml/src-gen/dk/itu/simplifiedjml/parser/antlr/internal/InternalTomato.g:213:7: ( (lv_methods_8_0= ruleMethod ) ) ( (lv_methods_9_0= ruleMethod ) )*
                    {
                    // ../dk.itu.simplifiedjml/src-gen/dk/itu/simplifiedjml/parser/antlr/internal/InternalTomato.g:213:7: ( (lv_methods_8_0= ruleMethod ) )
                    // ../dk.itu.simplifiedjml/src-gen/dk/itu/simplifiedjml/parser/antlr/internal/InternalTomato.g:214:1: (lv_methods_8_0= ruleMethod )
                    {
                    // ../dk.itu.simplifiedjml/src-gen/dk/itu/simplifiedjml/parser/antlr/internal/InternalTomato.g:214:1: (lv_methods_8_0= ruleMethod )
                    // ../dk.itu.simplifiedjml/src-gen/dk/itu/simplifiedjml/parser/antlr/internal/InternalTomato.g:215:3: lv_methods_8_0= ruleMethod
                    {
                     
                    	        newCompositeNode(grammarAccess.getStructureAccess().getMethodsMethodParserRuleCall_5_0_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleMethod_in_ruleStructure372);
                    lv_methods_8_0=ruleMethod();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getStructureRule());
                    	        }
                           		add(
                           			current, 
                           			"methods",
                            		lv_methods_8_0, 
                            		"Method");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../dk.itu.simplifiedjml/src-gen/dk/itu/simplifiedjml/parser/antlr/internal/InternalTomato.g:231:2: ( (lv_methods_9_0= ruleMethod ) )*
                    loop4:
                    do {
                        int alt4=2;
                        int LA4_0 = input.LA(1);

                        if ( (LA4_0==16||(LA4_0>=18 && LA4_0<=19)) ) {
                            alt4=1;
                        }


                        switch (alt4) {
                    	case 1 :
                    	    // ../dk.itu.simplifiedjml/src-gen/dk/itu/simplifiedjml/parser/antlr/internal/InternalTomato.g:232:1: (lv_methods_9_0= ruleMethod )
                    	    {
                    	    // ../dk.itu.simplifiedjml/src-gen/dk/itu/simplifiedjml/parser/antlr/internal/InternalTomato.g:232:1: (lv_methods_9_0= ruleMethod )
                    	    // ../dk.itu.simplifiedjml/src-gen/dk/itu/simplifiedjml/parser/antlr/internal/InternalTomato.g:233:3: lv_methods_9_0= ruleMethod
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getStructureAccess().getMethodsMethodParserRuleCall_5_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleMethod_in_ruleStructure393);
                    	    lv_methods_9_0=ruleMethod();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getStructureRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"methods",
                    	            		lv_methods_9_0, 
                    	            		"Method");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop4;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_10=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleStructure408); 

                	newLeafNode(otherlv_10, grammarAccess.getStructureAccess().getRightCurlyBracketKeyword_6());
                

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
    // $ANTLR end "ruleStructure"


    // $ANTLR start "entryRuleMethod"
    // ../dk.itu.simplifiedjml/src-gen/dk/itu/simplifiedjml/parser/antlr/internal/InternalTomato.g:261:1: entryRuleMethod returns [EObject current=null] : iv_ruleMethod= ruleMethod EOF ;
    public final EObject entryRuleMethod() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMethod = null;


        try {
            // ../dk.itu.simplifiedjml/src-gen/dk/itu/simplifiedjml/parser/antlr/internal/InternalTomato.g:262:2: (iv_ruleMethod= ruleMethod EOF )
            // ../dk.itu.simplifiedjml/src-gen/dk/itu/simplifiedjml/parser/antlr/internal/InternalTomato.g:263:2: iv_ruleMethod= ruleMethod EOF
            {
             newCompositeNode(grammarAccess.getMethodRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleMethod_in_entryRuleMethod444);
            iv_ruleMethod=ruleMethod();

            state._fsp--;

             current =iv_ruleMethod; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleMethod454); 

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
    // $ANTLR end "entryRuleMethod"


    // $ANTLR start "ruleMethod"
    // ../dk.itu.simplifiedjml/src-gen/dk/itu/simplifiedjml/parser/antlr/internal/InternalTomato.g:270:1: ruleMethod returns [EObject current=null] : ( () (otherlv_1= '//@ requires' ( (lv_requirements_2_0= ruleAnyOther ) ) otherlv_3= '\\n' (otherlv_4= '//@ requires' ( (lv_requirements_5_0= ruleAnyOther ) ) otherlv_6= '\\n' )* )? (otherlv_7= '//@ ensures' ( (lv_ensures_8_0= ruleAnyOther ) ) otherlv_9= '\\n' (otherlv_10= '//@ ensures' ( (lv_ensures_11_0= ruleAnyOther ) ) otherlv_12= '\\n' )* )? otherlv_13= '/*< AUTO GENERATED >*/' ( (lv_signature_14_0= ruleHackySignature ) ) otherlv_15= '{' otherlv_16= '/* TODO: Implementation */' otherlv_17= 'throw new UnsupportedOperationException(\"Not Implemented\");' otherlv_18= '}' ) ;
    public final EObject ruleMethod() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        Token otherlv_13=null;
        Token otherlv_15=null;
        Token otherlv_16=null;
        Token otherlv_17=null;
        Token otherlv_18=null;
        AntlrDatatypeRuleToken lv_requirements_2_0 = null;

        AntlrDatatypeRuleToken lv_requirements_5_0 = null;

        AntlrDatatypeRuleToken lv_ensures_8_0 = null;

        AntlrDatatypeRuleToken lv_ensures_11_0 = null;

        AntlrDatatypeRuleToken lv_signature_14_0 = null;


         enterRule(); 
            
        try {
            // ../dk.itu.simplifiedjml/src-gen/dk/itu/simplifiedjml/parser/antlr/internal/InternalTomato.g:273:28: ( ( () (otherlv_1= '//@ requires' ( (lv_requirements_2_0= ruleAnyOther ) ) otherlv_3= '\\n' (otherlv_4= '//@ requires' ( (lv_requirements_5_0= ruleAnyOther ) ) otherlv_6= '\\n' )* )? (otherlv_7= '//@ ensures' ( (lv_ensures_8_0= ruleAnyOther ) ) otherlv_9= '\\n' (otherlv_10= '//@ ensures' ( (lv_ensures_11_0= ruleAnyOther ) ) otherlv_12= '\\n' )* )? otherlv_13= '/*< AUTO GENERATED >*/' ( (lv_signature_14_0= ruleHackySignature ) ) otherlv_15= '{' otherlv_16= '/* TODO: Implementation */' otherlv_17= 'throw new UnsupportedOperationException(\"Not Implemented\");' otherlv_18= '}' ) )
            // ../dk.itu.simplifiedjml/src-gen/dk/itu/simplifiedjml/parser/antlr/internal/InternalTomato.g:274:1: ( () (otherlv_1= '//@ requires' ( (lv_requirements_2_0= ruleAnyOther ) ) otherlv_3= '\\n' (otherlv_4= '//@ requires' ( (lv_requirements_5_0= ruleAnyOther ) ) otherlv_6= '\\n' )* )? (otherlv_7= '//@ ensures' ( (lv_ensures_8_0= ruleAnyOther ) ) otherlv_9= '\\n' (otherlv_10= '//@ ensures' ( (lv_ensures_11_0= ruleAnyOther ) ) otherlv_12= '\\n' )* )? otherlv_13= '/*< AUTO GENERATED >*/' ( (lv_signature_14_0= ruleHackySignature ) ) otherlv_15= '{' otherlv_16= '/* TODO: Implementation */' otherlv_17= 'throw new UnsupportedOperationException(\"Not Implemented\");' otherlv_18= '}' )
            {
            // ../dk.itu.simplifiedjml/src-gen/dk/itu/simplifiedjml/parser/antlr/internal/InternalTomato.g:274:1: ( () (otherlv_1= '//@ requires' ( (lv_requirements_2_0= ruleAnyOther ) ) otherlv_3= '\\n' (otherlv_4= '//@ requires' ( (lv_requirements_5_0= ruleAnyOther ) ) otherlv_6= '\\n' )* )? (otherlv_7= '//@ ensures' ( (lv_ensures_8_0= ruleAnyOther ) ) otherlv_9= '\\n' (otherlv_10= '//@ ensures' ( (lv_ensures_11_0= ruleAnyOther ) ) otherlv_12= '\\n' )* )? otherlv_13= '/*< AUTO GENERATED >*/' ( (lv_signature_14_0= ruleHackySignature ) ) otherlv_15= '{' otherlv_16= '/* TODO: Implementation */' otherlv_17= 'throw new UnsupportedOperationException(\"Not Implemented\");' otherlv_18= '}' )
            // ../dk.itu.simplifiedjml/src-gen/dk/itu/simplifiedjml/parser/antlr/internal/InternalTomato.g:274:2: () (otherlv_1= '//@ requires' ( (lv_requirements_2_0= ruleAnyOther ) ) otherlv_3= '\\n' (otherlv_4= '//@ requires' ( (lv_requirements_5_0= ruleAnyOther ) ) otherlv_6= '\\n' )* )? (otherlv_7= '//@ ensures' ( (lv_ensures_8_0= ruleAnyOther ) ) otherlv_9= '\\n' (otherlv_10= '//@ ensures' ( (lv_ensures_11_0= ruleAnyOther ) ) otherlv_12= '\\n' )* )? otherlv_13= '/*< AUTO GENERATED >*/' ( (lv_signature_14_0= ruleHackySignature ) ) otherlv_15= '{' otherlv_16= '/* TODO: Implementation */' otherlv_17= 'throw new UnsupportedOperationException(\"Not Implemented\");' otherlv_18= '}'
            {
            // ../dk.itu.simplifiedjml/src-gen/dk/itu/simplifiedjml/parser/antlr/internal/InternalTomato.g:274:2: ()
            // ../dk.itu.simplifiedjml/src-gen/dk/itu/simplifiedjml/parser/antlr/internal/InternalTomato.g:275:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getMethodAccess().getMethodAction_0(),
                        current);
                

            }

            // ../dk.itu.simplifiedjml/src-gen/dk/itu/simplifiedjml/parser/antlr/internal/InternalTomato.g:280:2: (otherlv_1= '//@ requires' ( (lv_requirements_2_0= ruleAnyOther ) ) otherlv_3= '\\n' (otherlv_4= '//@ requires' ( (lv_requirements_5_0= ruleAnyOther ) ) otherlv_6= '\\n' )* )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==16) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // ../dk.itu.simplifiedjml/src-gen/dk/itu/simplifiedjml/parser/antlr/internal/InternalTomato.g:280:4: otherlv_1= '//@ requires' ( (lv_requirements_2_0= ruleAnyOther ) ) otherlv_3= '\\n' (otherlv_4= '//@ requires' ( (lv_requirements_5_0= ruleAnyOther ) ) otherlv_6= '\\n' )*
                    {
                    otherlv_1=(Token)match(input,16,FollowSets000.FOLLOW_16_in_ruleMethod501); 

                        	newLeafNode(otherlv_1, grammarAccess.getMethodAccess().getRequiresKeyword_1_0());
                        
                    // ../dk.itu.simplifiedjml/src-gen/dk/itu/simplifiedjml/parser/antlr/internal/InternalTomato.g:284:1: ( (lv_requirements_2_0= ruleAnyOther ) )
                    // ../dk.itu.simplifiedjml/src-gen/dk/itu/simplifiedjml/parser/antlr/internal/InternalTomato.g:285:1: (lv_requirements_2_0= ruleAnyOther )
                    {
                    // ../dk.itu.simplifiedjml/src-gen/dk/itu/simplifiedjml/parser/antlr/internal/InternalTomato.g:285:1: (lv_requirements_2_0= ruleAnyOther )
                    // ../dk.itu.simplifiedjml/src-gen/dk/itu/simplifiedjml/parser/antlr/internal/InternalTomato.g:286:3: lv_requirements_2_0= ruleAnyOther
                    {
                     
                    	        newCompositeNode(grammarAccess.getMethodAccess().getRequirementsAnyOtherParserRuleCall_1_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleAnyOther_in_ruleMethod522);
                    lv_requirements_2_0=ruleAnyOther();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getMethodRule());
                    	        }
                           		add(
                           			current, 
                           			"requirements",
                            		lv_requirements_2_0, 
                            		"AnyOther");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    otherlv_3=(Token)match(input,17,FollowSets000.FOLLOW_17_in_ruleMethod534); 

                        	newLeafNode(otherlv_3, grammarAccess.getMethodAccess().getLineFeedLfKeyword_1_2());
                        
                    // ../dk.itu.simplifiedjml/src-gen/dk/itu/simplifiedjml/parser/antlr/internal/InternalTomato.g:306:1: (otherlv_4= '//@ requires' ( (lv_requirements_5_0= ruleAnyOther ) ) otherlv_6= '\\n' )*
                    loop6:
                    do {
                        int alt6=2;
                        int LA6_0 = input.LA(1);

                        if ( (LA6_0==16) ) {
                            alt6=1;
                        }


                        switch (alt6) {
                    	case 1 :
                    	    // ../dk.itu.simplifiedjml/src-gen/dk/itu/simplifiedjml/parser/antlr/internal/InternalTomato.g:306:3: otherlv_4= '//@ requires' ( (lv_requirements_5_0= ruleAnyOther ) ) otherlv_6= '\\n'
                    	    {
                    	    otherlv_4=(Token)match(input,16,FollowSets000.FOLLOW_16_in_ruleMethod547); 

                    	        	newLeafNode(otherlv_4, grammarAccess.getMethodAccess().getRequiresKeyword_1_3_0());
                    	        
                    	    // ../dk.itu.simplifiedjml/src-gen/dk/itu/simplifiedjml/parser/antlr/internal/InternalTomato.g:310:1: ( (lv_requirements_5_0= ruleAnyOther ) )
                    	    // ../dk.itu.simplifiedjml/src-gen/dk/itu/simplifiedjml/parser/antlr/internal/InternalTomato.g:311:1: (lv_requirements_5_0= ruleAnyOther )
                    	    {
                    	    // ../dk.itu.simplifiedjml/src-gen/dk/itu/simplifiedjml/parser/antlr/internal/InternalTomato.g:311:1: (lv_requirements_5_0= ruleAnyOther )
                    	    // ../dk.itu.simplifiedjml/src-gen/dk/itu/simplifiedjml/parser/antlr/internal/InternalTomato.g:312:3: lv_requirements_5_0= ruleAnyOther
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getMethodAccess().getRequirementsAnyOtherParserRuleCall_1_3_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleAnyOther_in_ruleMethod568);
                    	    lv_requirements_5_0=ruleAnyOther();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getMethodRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"requirements",
                    	            		lv_requirements_5_0, 
                    	            		"AnyOther");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }

                    	    otherlv_6=(Token)match(input,17,FollowSets000.FOLLOW_17_in_ruleMethod580); 

                    	        	newLeafNode(otherlv_6, grammarAccess.getMethodAccess().getLineFeedLfKeyword_1_3_2());
                    	        

                    	    }
                    	    break;

                    	default :
                    	    break loop6;
                        }
                    } while (true);


                    }
                    break;

            }

            // ../dk.itu.simplifiedjml/src-gen/dk/itu/simplifiedjml/parser/antlr/internal/InternalTomato.g:332:5: (otherlv_7= '//@ ensures' ( (lv_ensures_8_0= ruleAnyOther ) ) otherlv_9= '\\n' (otherlv_10= '//@ ensures' ( (lv_ensures_11_0= ruleAnyOther ) ) otherlv_12= '\\n' )* )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==18) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // ../dk.itu.simplifiedjml/src-gen/dk/itu/simplifiedjml/parser/antlr/internal/InternalTomato.g:332:7: otherlv_7= '//@ ensures' ( (lv_ensures_8_0= ruleAnyOther ) ) otherlv_9= '\\n' (otherlv_10= '//@ ensures' ( (lv_ensures_11_0= ruleAnyOther ) ) otherlv_12= '\\n' )*
                    {
                    otherlv_7=(Token)match(input,18,FollowSets000.FOLLOW_18_in_ruleMethod597); 

                        	newLeafNode(otherlv_7, grammarAccess.getMethodAccess().getEnsuresKeyword_2_0());
                        
                    // ../dk.itu.simplifiedjml/src-gen/dk/itu/simplifiedjml/parser/antlr/internal/InternalTomato.g:336:1: ( (lv_ensures_8_0= ruleAnyOther ) )
                    // ../dk.itu.simplifiedjml/src-gen/dk/itu/simplifiedjml/parser/antlr/internal/InternalTomato.g:337:1: (lv_ensures_8_0= ruleAnyOther )
                    {
                    // ../dk.itu.simplifiedjml/src-gen/dk/itu/simplifiedjml/parser/antlr/internal/InternalTomato.g:337:1: (lv_ensures_8_0= ruleAnyOther )
                    // ../dk.itu.simplifiedjml/src-gen/dk/itu/simplifiedjml/parser/antlr/internal/InternalTomato.g:338:3: lv_ensures_8_0= ruleAnyOther
                    {
                     
                    	        newCompositeNode(grammarAccess.getMethodAccess().getEnsuresAnyOtherParserRuleCall_2_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleAnyOther_in_ruleMethod618);
                    lv_ensures_8_0=ruleAnyOther();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getMethodRule());
                    	        }
                           		add(
                           			current, 
                           			"ensures",
                            		lv_ensures_8_0, 
                            		"AnyOther");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    otherlv_9=(Token)match(input,17,FollowSets000.FOLLOW_17_in_ruleMethod630); 

                        	newLeafNode(otherlv_9, grammarAccess.getMethodAccess().getLineFeedLfKeyword_2_2());
                        
                    // ../dk.itu.simplifiedjml/src-gen/dk/itu/simplifiedjml/parser/antlr/internal/InternalTomato.g:358:1: (otherlv_10= '//@ ensures' ( (lv_ensures_11_0= ruleAnyOther ) ) otherlv_12= '\\n' )*
                    loop8:
                    do {
                        int alt8=2;
                        int LA8_0 = input.LA(1);

                        if ( (LA8_0==18) ) {
                            alt8=1;
                        }


                        switch (alt8) {
                    	case 1 :
                    	    // ../dk.itu.simplifiedjml/src-gen/dk/itu/simplifiedjml/parser/antlr/internal/InternalTomato.g:358:3: otherlv_10= '//@ ensures' ( (lv_ensures_11_0= ruleAnyOther ) ) otherlv_12= '\\n'
                    	    {
                    	    otherlv_10=(Token)match(input,18,FollowSets000.FOLLOW_18_in_ruleMethod643); 

                    	        	newLeafNode(otherlv_10, grammarAccess.getMethodAccess().getEnsuresKeyword_2_3_0());
                    	        
                    	    // ../dk.itu.simplifiedjml/src-gen/dk/itu/simplifiedjml/parser/antlr/internal/InternalTomato.g:362:1: ( (lv_ensures_11_0= ruleAnyOther ) )
                    	    // ../dk.itu.simplifiedjml/src-gen/dk/itu/simplifiedjml/parser/antlr/internal/InternalTomato.g:363:1: (lv_ensures_11_0= ruleAnyOther )
                    	    {
                    	    // ../dk.itu.simplifiedjml/src-gen/dk/itu/simplifiedjml/parser/antlr/internal/InternalTomato.g:363:1: (lv_ensures_11_0= ruleAnyOther )
                    	    // ../dk.itu.simplifiedjml/src-gen/dk/itu/simplifiedjml/parser/antlr/internal/InternalTomato.g:364:3: lv_ensures_11_0= ruleAnyOther
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getMethodAccess().getEnsuresAnyOtherParserRuleCall_2_3_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleAnyOther_in_ruleMethod664);
                    	    lv_ensures_11_0=ruleAnyOther();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getMethodRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"ensures",
                    	            		lv_ensures_11_0, 
                    	            		"AnyOther");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }

                    	    otherlv_12=(Token)match(input,17,FollowSets000.FOLLOW_17_in_ruleMethod676); 

                    	        	newLeafNode(otherlv_12, grammarAccess.getMethodAccess().getLineFeedLfKeyword_2_3_2());
                    	        

                    	    }
                    	    break;

                    	default :
                    	    break loop8;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_13=(Token)match(input,19,FollowSets000.FOLLOW_19_in_ruleMethod692); 

                	newLeafNode(otherlv_13, grammarAccess.getMethodAccess().getAUTOGENERATEDKeyword_3());
                
            // ../dk.itu.simplifiedjml/src-gen/dk/itu/simplifiedjml/parser/antlr/internal/InternalTomato.g:388:1: ( (lv_signature_14_0= ruleHackySignature ) )
            // ../dk.itu.simplifiedjml/src-gen/dk/itu/simplifiedjml/parser/antlr/internal/InternalTomato.g:389:1: (lv_signature_14_0= ruleHackySignature )
            {
            // ../dk.itu.simplifiedjml/src-gen/dk/itu/simplifiedjml/parser/antlr/internal/InternalTomato.g:389:1: (lv_signature_14_0= ruleHackySignature )
            // ../dk.itu.simplifiedjml/src-gen/dk/itu/simplifiedjml/parser/antlr/internal/InternalTomato.g:390:3: lv_signature_14_0= ruleHackySignature
            {
             
            	        newCompositeNode(grammarAccess.getMethodAccess().getSignatureHackySignatureParserRuleCall_4_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleHackySignature_in_ruleMethod713);
            lv_signature_14_0=ruleHackySignature();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getMethodRule());
            	        }
                   		set(
                   			current, 
                   			"signature",
                    		lv_signature_14_0, 
                    		"HackySignature");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_15=(Token)match(input,13,FollowSets000.FOLLOW_13_in_ruleMethod725); 

                	newLeafNode(otherlv_15, grammarAccess.getMethodAccess().getLeftCurlyBracketKeyword_5());
                
            otherlv_16=(Token)match(input,20,FollowSets000.FOLLOW_20_in_ruleMethod737); 

                	newLeafNode(otherlv_16, grammarAccess.getMethodAccess().getTODOImplementationKeyword_6());
                
            otherlv_17=(Token)match(input,21,FollowSets000.FOLLOW_21_in_ruleMethod749); 

                	newLeafNode(otherlv_17, grammarAccess.getMethodAccess().getThrowNewUnsupportedOperationExceptionNotImplementedKeyword_7());
                
            otherlv_18=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleMethod761); 

                	newLeafNode(otherlv_18, grammarAccess.getMethodAccess().getRightCurlyBracketKeyword_8());
                

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
    // $ANTLR end "ruleMethod"


    // $ANTLR start "entryRuleEString"
    // ../dk.itu.simplifiedjml/src-gen/dk/itu/simplifiedjml/parser/antlr/internal/InternalTomato.g:430:1: entryRuleEString returns [String current=null] : iv_ruleEString= ruleEString EOF ;
    public final String entryRuleEString() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEString = null;


        try {
            // ../dk.itu.simplifiedjml/src-gen/dk/itu/simplifiedjml/parser/antlr/internal/InternalTomato.g:431:2: (iv_ruleEString= ruleEString EOF )
            // ../dk.itu.simplifiedjml/src-gen/dk/itu/simplifiedjml/parser/antlr/internal/InternalTomato.g:432:2: iv_ruleEString= ruleEString EOF
            {
             newCompositeNode(grammarAccess.getEStringRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_entryRuleEString798);
            iv_ruleEString=ruleEString();

            state._fsp--;

             current =iv_ruleEString.getText(); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleEString809); 

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
    // ../dk.itu.simplifiedjml/src-gen/dk/itu/simplifiedjml/parser/antlr/internal/InternalTomato.g:439:1: ruleEString returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) ;
    public final AntlrDatatypeRuleToken ruleEString() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;
        Token this_ID_1=null;

         enterRule(); 
            
        try {
            // ../dk.itu.simplifiedjml/src-gen/dk/itu/simplifiedjml/parser/antlr/internal/InternalTomato.g:442:28: ( (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) )
            // ../dk.itu.simplifiedjml/src-gen/dk/itu/simplifiedjml/parser/antlr/internal/InternalTomato.g:443:1: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            {
            // ../dk.itu.simplifiedjml/src-gen/dk/itu/simplifiedjml/parser/antlr/internal/InternalTomato.g:443:1: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==RULE_STRING) ) {
                alt10=1;
            }
            else if ( (LA10_0==RULE_ID) ) {
                alt10=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }
            switch (alt10) {
                case 1 :
                    // ../dk.itu.simplifiedjml/src-gen/dk/itu/simplifiedjml/parser/antlr/internal/InternalTomato.g:443:6: this_STRING_0= RULE_STRING
                    {
                    this_STRING_0=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_RULE_STRING_in_ruleEString849); 

                    		current.merge(this_STRING_0);
                        
                     
                        newLeafNode(this_STRING_0, grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 
                        

                    }
                    break;
                case 2 :
                    // ../dk.itu.simplifiedjml/src-gen/dk/itu/simplifiedjml/parser/antlr/internal/InternalTomato.g:451:10: this_ID_1= RULE_ID
                    {
                    this_ID_1=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleEString875); 

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


    // $ANTLR start "entryRuleAnyOther"
    // ../dk.itu.simplifiedjml/src-gen/dk/itu/simplifiedjml/parser/antlr/internal/InternalTomato.g:466:1: entryRuleAnyOther returns [String current=null] : iv_ruleAnyOther= ruleAnyOther EOF ;
    public final String entryRuleAnyOther() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleAnyOther = null;


        try {
            // ../dk.itu.simplifiedjml/src-gen/dk/itu/simplifiedjml/parser/antlr/internal/InternalTomato.g:467:2: (iv_ruleAnyOther= ruleAnyOther EOF )
            // ../dk.itu.simplifiedjml/src-gen/dk/itu/simplifiedjml/parser/antlr/internal/InternalTomato.g:468:2: iv_ruleAnyOther= ruleAnyOther EOF
            {
             newCompositeNode(grammarAccess.getAnyOtherRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleAnyOther_in_entryRuleAnyOther921);
            iv_ruleAnyOther=ruleAnyOther();

            state._fsp--;

             current =iv_ruleAnyOther.getText(); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleAnyOther932); 

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
    // $ANTLR end "entryRuleAnyOther"


    // $ANTLR start "ruleAnyOther"
    // ../dk.itu.simplifiedjml/src-gen/dk/itu/simplifiedjml/parser/antlr/internal/InternalTomato.g:475:1: ruleAnyOther returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ANY_OTHER_0= RULE_ANY_OTHER | this_ID_1= RULE_ID )* ;
    public final AntlrDatatypeRuleToken ruleAnyOther() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ANY_OTHER_0=null;
        Token this_ID_1=null;

         enterRule(); 
            
        try {
            // ../dk.itu.simplifiedjml/src-gen/dk/itu/simplifiedjml/parser/antlr/internal/InternalTomato.g:478:28: ( (this_ANY_OTHER_0= RULE_ANY_OTHER | this_ID_1= RULE_ID )* )
            // ../dk.itu.simplifiedjml/src-gen/dk/itu/simplifiedjml/parser/antlr/internal/InternalTomato.g:479:1: (this_ANY_OTHER_0= RULE_ANY_OTHER | this_ID_1= RULE_ID )*
            {
            // ../dk.itu.simplifiedjml/src-gen/dk/itu/simplifiedjml/parser/antlr/internal/InternalTomato.g:479:1: (this_ANY_OTHER_0= RULE_ANY_OTHER | this_ID_1= RULE_ID )*
            loop11:
            do {
                int alt11=3;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==RULE_ANY_OTHER) ) {
                    alt11=1;
                }
                else if ( (LA11_0==RULE_ID) ) {
                    alt11=2;
                }


                switch (alt11) {
            	case 1 :
            	    // ../dk.itu.simplifiedjml/src-gen/dk/itu/simplifiedjml/parser/antlr/internal/InternalTomato.g:479:6: this_ANY_OTHER_0= RULE_ANY_OTHER
            	    {
            	    this_ANY_OTHER_0=(Token)match(input,RULE_ANY_OTHER,FollowSets000.FOLLOW_RULE_ANY_OTHER_in_ruleAnyOther972); 

            	    		current.merge(this_ANY_OTHER_0);
            	        
            	     
            	        newLeafNode(this_ANY_OTHER_0, grammarAccess.getAnyOtherAccess().getANY_OTHERTerminalRuleCall_0()); 
            	        

            	    }
            	    break;
            	case 2 :
            	    // ../dk.itu.simplifiedjml/src-gen/dk/itu/simplifiedjml/parser/antlr/internal/InternalTomato.g:487:10: this_ID_1= RULE_ID
            	    {
            	    this_ID_1=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleAnyOther998); 

            	    		current.merge(this_ID_1);
            	        
            	     
            	        newLeafNode(this_ID_1, grammarAccess.getAnyOtherAccess().getIDTerminalRuleCall_1()); 
            	        

            	    }
            	    break;

            	default :
            	    break loop11;
                }
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
    // $ANTLR end "ruleAnyOther"


    // $ANTLR start "entryRuleHackySignature"
    // ../dk.itu.simplifiedjml/src-gen/dk/itu/simplifiedjml/parser/antlr/internal/InternalTomato.g:502:1: entryRuleHackySignature returns [String current=null] : iv_ruleHackySignature= ruleHackySignature EOF ;
    public final String entryRuleHackySignature() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleHackySignature = null;


        try {
            // ../dk.itu.simplifiedjml/src-gen/dk/itu/simplifiedjml/parser/antlr/internal/InternalTomato.g:503:2: (iv_ruleHackySignature= ruleHackySignature EOF )
            // ../dk.itu.simplifiedjml/src-gen/dk/itu/simplifiedjml/parser/antlr/internal/InternalTomato.g:504:2: iv_ruleHackySignature= ruleHackySignature EOF
            {
             newCompositeNode(grammarAccess.getHackySignatureRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleHackySignature_in_entryRuleHackySignature1045);
            iv_ruleHackySignature=ruleHackySignature();

            state._fsp--;

             current =iv_ruleHackySignature.getText(); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleHackySignature1056); 

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
    // $ANTLR end "entryRuleHackySignature"


    // $ANTLR start "ruleHackySignature"
    // ../dk.itu.simplifiedjml/src-gen/dk/itu/simplifiedjml/parser/antlr/internal/InternalTomato.g:511:1: ruleHackySignature returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_HACKY_SIGN_0= RULE_HACKY_SIGN ;
    public final AntlrDatatypeRuleToken ruleHackySignature() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_HACKY_SIGN_0=null;

         enterRule(); 
            
        try {
            // ../dk.itu.simplifiedjml/src-gen/dk/itu/simplifiedjml/parser/antlr/internal/InternalTomato.g:514:28: (this_HACKY_SIGN_0= RULE_HACKY_SIGN )
            // ../dk.itu.simplifiedjml/src-gen/dk/itu/simplifiedjml/parser/antlr/internal/InternalTomato.g:515:5: this_HACKY_SIGN_0= RULE_HACKY_SIGN
            {
            this_HACKY_SIGN_0=(Token)match(input,RULE_HACKY_SIGN,FollowSets000.FOLLOW_RULE_HACKY_SIGN_in_ruleHackySignature1095); 

            		current.merge(this_HACKY_SIGN_0);
                
             
                newLeafNode(this_HACKY_SIGN_0, grammarAccess.getHackySignatureAccess().getHACKY_SIGNTerminalRuleCall()); 
                

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
    // $ANTLR end "ruleHackySignature"

    // Delegated rules


 

    
    private static class FollowSets000 {
        public static final BitSet FOLLOW_ruleSimplifiedJMLModel_in_entryRuleSimplifiedJMLModel75 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleSimplifiedJMLModel85 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleStructure_in_ruleSimplifiedJMLModel131 = new BitSet(new long[]{0x0000000000001002L});
        public static final BitSet FOLLOW_ruleStructure_in_ruleSimplifiedJMLModel152 = new BitSet(new long[]{0x0000000000001002L});
        public static final BitSet FOLLOW_ruleStructure_in_entryRuleStructure189 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleStructure199 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_12_in_ruleStructure245 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleStructure266 = new BitSet(new long[]{0x0000000000002000L});
        public static final BitSet FOLLOW_13_in_ruleStructure278 = new BitSet(new long[]{0x00000000000DC000L});
        public static final BitSet FOLLOW_14_in_ruleStructure291 = new BitSet(new long[]{0x00000000000DC060L});
        public static final BitSet FOLLOW_ruleAnyOther_in_ruleStructure312 = new BitSet(new long[]{0x00000000000DC000L});
        public static final BitSet FOLLOW_14_in_ruleStructure325 = new BitSet(new long[]{0x00000000000DC060L});
        public static final BitSet FOLLOW_ruleAnyOther_in_ruleStructure346 = new BitSet(new long[]{0x00000000000DC000L});
        public static final BitSet FOLLOW_ruleMethod_in_ruleStructure372 = new BitSet(new long[]{0x00000000000D8000L});
        public static final BitSet FOLLOW_ruleMethod_in_ruleStructure393 = new BitSet(new long[]{0x00000000000D8000L});
        public static final BitSet FOLLOW_15_in_ruleStructure408 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleMethod_in_entryRuleMethod444 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleMethod454 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_16_in_ruleMethod501 = new BitSet(new long[]{0x0000000000020060L});
        public static final BitSet FOLLOW_ruleAnyOther_in_ruleMethod522 = new BitSet(new long[]{0x0000000000020000L});
        public static final BitSet FOLLOW_17_in_ruleMethod534 = new BitSet(new long[]{0x00000000000D0000L});
        public static final BitSet FOLLOW_16_in_ruleMethod547 = new BitSet(new long[]{0x0000000000020060L});
        public static final BitSet FOLLOW_ruleAnyOther_in_ruleMethod568 = new BitSet(new long[]{0x0000000000020000L});
        public static final BitSet FOLLOW_17_in_ruleMethod580 = new BitSet(new long[]{0x00000000000D0000L});
        public static final BitSet FOLLOW_18_in_ruleMethod597 = new BitSet(new long[]{0x0000000000020060L});
        public static final BitSet FOLLOW_ruleAnyOther_in_ruleMethod618 = new BitSet(new long[]{0x0000000000020000L});
        public static final BitSet FOLLOW_17_in_ruleMethod630 = new BitSet(new long[]{0x00000000000C0000L});
        public static final BitSet FOLLOW_18_in_ruleMethod643 = new BitSet(new long[]{0x0000000000020060L});
        public static final BitSet FOLLOW_ruleAnyOther_in_ruleMethod664 = new BitSet(new long[]{0x0000000000020000L});
        public static final BitSet FOLLOW_17_in_ruleMethod676 = new BitSet(new long[]{0x00000000000C0000L});
        public static final BitSet FOLLOW_19_in_ruleMethod692 = new BitSet(new long[]{0x0000000000000080L});
        public static final BitSet FOLLOW_ruleHackySignature_in_ruleMethod713 = new BitSet(new long[]{0x0000000000002000L});
        public static final BitSet FOLLOW_13_in_ruleMethod725 = new BitSet(new long[]{0x0000000000100000L});
        public static final BitSet FOLLOW_20_in_ruleMethod737 = new BitSet(new long[]{0x0000000000200000L});
        public static final BitSet FOLLOW_21_in_ruleMethod749 = new BitSet(new long[]{0x0000000000008000L});
        public static final BitSet FOLLOW_15_in_ruleMethod761 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_entryRuleEString798 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleEString809 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_STRING_in_ruleEString849 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleEString875 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAnyOther_in_entryRuleAnyOther921 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleAnyOther932 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ANY_OTHER_in_ruleAnyOther972 = new BitSet(new long[]{0x0000000000000062L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleAnyOther998 = new BitSet(new long[]{0x0000000000000062L});
        public static final BitSet FOLLOW_ruleHackySignature_in_entryRuleHackySignature1045 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleHackySignature1056 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_HACKY_SIGN_in_ruleHackySignature1095 = new BitSet(new long[]{0x0000000000000002L});
    }


}