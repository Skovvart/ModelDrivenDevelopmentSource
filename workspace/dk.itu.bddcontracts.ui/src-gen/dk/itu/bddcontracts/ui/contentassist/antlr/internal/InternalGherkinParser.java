package dk.itu.bddcontracts.ui.contentassist.antlr.internal; 

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.DFA;
import dk.itu.bddcontracts.services.GherkinGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalGherkinParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ANY_OTHER", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "'Feature:'", "'Background:'", "'Given'", "'And'", "'Behavior:'", "'Requiring'", "'Ensuring'", "'Scenario:'", "'Then'", "'When'", "'Scenario Outline:'", "'Examples:'", "'<'", "'>'", "'|'", "'\\n'"
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
    public String getGrammarFileName() { return "../dk.itu.bddcontracts.ui/src-gen/dk/itu/bddcontracts/ui/contentassist/antlr/internal/InternalGherkin.g"; }


     
     	private GherkinGrammarAccess grammarAccess;
     	
        public void setGrammarAccess(GherkinGrammarAccess grammarAccess) {
        	this.grammarAccess = grammarAccess;
        }
        
        @Override
        protected Grammar getGrammar() {
        	return grammarAccess.getGrammar();
        }
        
        @Override
        protected String getValueForTokenName(String tokenName) {
        	return tokenName;
        }




    // $ANTLR start "entryRuleModel"
    // ../dk.itu.bddcontracts.ui/src-gen/dk/itu/bddcontracts/ui/contentassist/antlr/internal/InternalGherkin.g:60:1: entryRuleModel : ruleModel EOF ;
    public final void entryRuleModel() throws RecognitionException {
        try {
            // ../dk.itu.bddcontracts.ui/src-gen/dk/itu/bddcontracts/ui/contentassist/antlr/internal/InternalGherkin.g:61:1: ( ruleModel EOF )
            // ../dk.itu.bddcontracts.ui/src-gen/dk/itu/bddcontracts/ui/contentassist/antlr/internal/InternalGherkin.g:62:1: ruleModel EOF
            {
             before(grammarAccess.getModelRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleModel_in_entryRuleModel61);
            ruleModel();

            state._fsp--;

             after(grammarAccess.getModelRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleModel68); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleModel"


    // $ANTLR start "ruleModel"
    // ../dk.itu.bddcontracts.ui/src-gen/dk/itu/bddcontracts/ui/contentassist/antlr/internal/InternalGherkin.g:69:1: ruleModel : ( ( rule__Model__Group__0 ) ) ;
    public final void ruleModel() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.bddcontracts.ui/src-gen/dk/itu/bddcontracts/ui/contentassist/antlr/internal/InternalGherkin.g:73:2: ( ( ( rule__Model__Group__0 ) ) )
            // ../dk.itu.bddcontracts.ui/src-gen/dk/itu/bddcontracts/ui/contentassist/antlr/internal/InternalGherkin.g:74:1: ( ( rule__Model__Group__0 ) )
            {
            // ../dk.itu.bddcontracts.ui/src-gen/dk/itu/bddcontracts/ui/contentassist/antlr/internal/InternalGherkin.g:74:1: ( ( rule__Model__Group__0 ) )
            // ../dk.itu.bddcontracts.ui/src-gen/dk/itu/bddcontracts/ui/contentassist/antlr/internal/InternalGherkin.g:75:1: ( rule__Model__Group__0 )
            {
             before(grammarAccess.getModelAccess().getGroup()); 
            // ../dk.itu.bddcontracts.ui/src-gen/dk/itu/bddcontracts/ui/contentassist/antlr/internal/InternalGherkin.g:76:1: ( rule__Model__Group__0 )
            // ../dk.itu.bddcontracts.ui/src-gen/dk/itu/bddcontracts/ui/contentassist/antlr/internal/InternalGherkin.g:76:2: rule__Model__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__Model__Group__0_in_ruleModel94);
            rule__Model__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getModelAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleModel"


    // $ANTLR start "entryRuleScenario"
    // ../dk.itu.bddcontracts.ui/src-gen/dk/itu/bddcontracts/ui/contentassist/antlr/internal/InternalGherkin.g:88:1: entryRuleScenario : ruleScenario EOF ;
    public final void entryRuleScenario() throws RecognitionException {
        try {
            // ../dk.itu.bddcontracts.ui/src-gen/dk/itu/bddcontracts/ui/contentassist/antlr/internal/InternalGherkin.g:89:1: ( ruleScenario EOF )
            // ../dk.itu.bddcontracts.ui/src-gen/dk/itu/bddcontracts/ui/contentassist/antlr/internal/InternalGherkin.g:90:1: ruleScenario EOF
            {
             before(grammarAccess.getScenarioRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleScenario_in_entryRuleScenario121);
            ruleScenario();

            state._fsp--;

             after(grammarAccess.getScenarioRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleScenario128); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleScenario"


    // $ANTLR start "ruleScenario"
    // ../dk.itu.bddcontracts.ui/src-gen/dk/itu/bddcontracts/ui/contentassist/antlr/internal/InternalGherkin.g:97:1: ruleScenario : ( ( rule__Scenario__Alternatives ) ) ;
    public final void ruleScenario() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.bddcontracts.ui/src-gen/dk/itu/bddcontracts/ui/contentassist/antlr/internal/InternalGherkin.g:101:2: ( ( ( rule__Scenario__Alternatives ) ) )
            // ../dk.itu.bddcontracts.ui/src-gen/dk/itu/bddcontracts/ui/contentassist/antlr/internal/InternalGherkin.g:102:1: ( ( rule__Scenario__Alternatives ) )
            {
            // ../dk.itu.bddcontracts.ui/src-gen/dk/itu/bddcontracts/ui/contentassist/antlr/internal/InternalGherkin.g:102:1: ( ( rule__Scenario__Alternatives ) )
            // ../dk.itu.bddcontracts.ui/src-gen/dk/itu/bddcontracts/ui/contentassist/antlr/internal/InternalGherkin.g:103:1: ( rule__Scenario__Alternatives )
            {
             before(grammarAccess.getScenarioAccess().getAlternatives()); 
            // ../dk.itu.bddcontracts.ui/src-gen/dk/itu/bddcontracts/ui/contentassist/antlr/internal/InternalGherkin.g:104:1: ( rule__Scenario__Alternatives )
            // ../dk.itu.bddcontracts.ui/src-gen/dk/itu/bddcontracts/ui/contentassist/antlr/internal/InternalGherkin.g:104:2: rule__Scenario__Alternatives
            {
            pushFollow(FollowSets000.FOLLOW_rule__Scenario__Alternatives_in_ruleScenario154);
            rule__Scenario__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getScenarioAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleScenario"


    // $ANTLR start "entryRuleContent"
    // ../dk.itu.bddcontracts.ui/src-gen/dk/itu/bddcontracts/ui/contentassist/antlr/internal/InternalGherkin.g:116:1: entryRuleContent : ruleContent EOF ;
    public final void entryRuleContent() throws RecognitionException {
        try {
            // ../dk.itu.bddcontracts.ui/src-gen/dk/itu/bddcontracts/ui/contentassist/antlr/internal/InternalGherkin.g:117:1: ( ruleContent EOF )
            // ../dk.itu.bddcontracts.ui/src-gen/dk/itu/bddcontracts/ui/contentassist/antlr/internal/InternalGherkin.g:118:1: ruleContent EOF
            {
             before(grammarAccess.getContentRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleContent_in_entryRuleContent181);
            ruleContent();

            state._fsp--;

             after(grammarAccess.getContentRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleContent188); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleContent"


    // $ANTLR start "ruleContent"
    // ../dk.itu.bddcontracts.ui/src-gen/dk/itu/bddcontracts/ui/contentassist/antlr/internal/InternalGherkin.g:125:1: ruleContent : ( ( rule__Content__Alternatives ) ) ;
    public final void ruleContent() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.bddcontracts.ui/src-gen/dk/itu/bddcontracts/ui/contentassist/antlr/internal/InternalGherkin.g:129:2: ( ( ( rule__Content__Alternatives ) ) )
            // ../dk.itu.bddcontracts.ui/src-gen/dk/itu/bddcontracts/ui/contentassist/antlr/internal/InternalGherkin.g:130:1: ( ( rule__Content__Alternatives ) )
            {
            // ../dk.itu.bddcontracts.ui/src-gen/dk/itu/bddcontracts/ui/contentassist/antlr/internal/InternalGherkin.g:130:1: ( ( rule__Content__Alternatives ) )
            // ../dk.itu.bddcontracts.ui/src-gen/dk/itu/bddcontracts/ui/contentassist/antlr/internal/InternalGherkin.g:131:1: ( rule__Content__Alternatives )
            {
             before(grammarAccess.getContentAccess().getAlternatives()); 
            // ../dk.itu.bddcontracts.ui/src-gen/dk/itu/bddcontracts/ui/contentassist/antlr/internal/InternalGherkin.g:132:1: ( rule__Content__Alternatives )
            // ../dk.itu.bddcontracts.ui/src-gen/dk/itu/bddcontracts/ui/contentassist/antlr/internal/InternalGherkin.g:132:2: rule__Content__Alternatives
            {
            pushFollow(FollowSets000.FOLLOW_rule__Content__Alternatives_in_ruleContent214);
            rule__Content__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getContentAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleContent"


    // $ANTLR start "entryRuleFeature"
    // ../dk.itu.bddcontracts.ui/src-gen/dk/itu/bddcontracts/ui/contentassist/antlr/internal/InternalGherkin.g:144:1: entryRuleFeature : ruleFeature EOF ;
    public final void entryRuleFeature() throws RecognitionException {
        try {
            // ../dk.itu.bddcontracts.ui/src-gen/dk/itu/bddcontracts/ui/contentassist/antlr/internal/InternalGherkin.g:145:1: ( ruleFeature EOF )
            // ../dk.itu.bddcontracts.ui/src-gen/dk/itu/bddcontracts/ui/contentassist/antlr/internal/InternalGherkin.g:146:1: ruleFeature EOF
            {
             before(grammarAccess.getFeatureRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleFeature_in_entryRuleFeature241);
            ruleFeature();

            state._fsp--;

             after(grammarAccess.getFeatureRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleFeature248); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleFeature"


    // $ANTLR start "ruleFeature"
    // ../dk.itu.bddcontracts.ui/src-gen/dk/itu/bddcontracts/ui/contentassist/antlr/internal/InternalGherkin.g:153:1: ruleFeature : ( ( rule__Feature__Group__0 ) ) ;
    public final void ruleFeature() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.bddcontracts.ui/src-gen/dk/itu/bddcontracts/ui/contentassist/antlr/internal/InternalGherkin.g:157:2: ( ( ( rule__Feature__Group__0 ) ) )
            // ../dk.itu.bddcontracts.ui/src-gen/dk/itu/bddcontracts/ui/contentassist/antlr/internal/InternalGherkin.g:158:1: ( ( rule__Feature__Group__0 ) )
            {
            // ../dk.itu.bddcontracts.ui/src-gen/dk/itu/bddcontracts/ui/contentassist/antlr/internal/InternalGherkin.g:158:1: ( ( rule__Feature__Group__0 ) )
            // ../dk.itu.bddcontracts.ui/src-gen/dk/itu/bddcontracts/ui/contentassist/antlr/internal/InternalGherkin.g:159:1: ( rule__Feature__Group__0 )
            {
             before(grammarAccess.getFeatureAccess().getGroup()); 
            // ../dk.itu.bddcontracts.ui/src-gen/dk/itu/bddcontracts/ui/contentassist/antlr/internal/InternalGherkin.g:160:1: ( rule__Feature__Group__0 )
            // ../dk.itu.bddcontracts.ui/src-gen/dk/itu/bddcontracts/ui/contentassist/antlr/internal/InternalGherkin.g:160:2: rule__Feature__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__Feature__Group__0_in_ruleFeature274);
            rule__Feature__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getFeatureAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleFeature"


    // $ANTLR start "entryRuleEString"
    // ../dk.itu.bddcontracts.ui/src-gen/dk/itu/bddcontracts/ui/contentassist/antlr/internal/InternalGherkin.g:172:1: entryRuleEString : ruleEString EOF ;
    public final void entryRuleEString() throws RecognitionException {
        try {
            // ../dk.itu.bddcontracts.ui/src-gen/dk/itu/bddcontracts/ui/contentassist/antlr/internal/InternalGherkin.g:173:1: ( ruleEString EOF )
            // ../dk.itu.bddcontracts.ui/src-gen/dk/itu/bddcontracts/ui/contentassist/antlr/internal/InternalGherkin.g:174:1: ruleEString EOF
            {
             before(grammarAccess.getEStringRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_entryRuleEString301);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getEStringRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleEString308); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleEString"


    // $ANTLR start "ruleEString"
    // ../dk.itu.bddcontracts.ui/src-gen/dk/itu/bddcontracts/ui/contentassist/antlr/internal/InternalGherkin.g:181:1: ruleEString : ( ( rule__EString__Alternatives ) ) ;
    public final void ruleEString() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.bddcontracts.ui/src-gen/dk/itu/bddcontracts/ui/contentassist/antlr/internal/InternalGherkin.g:185:2: ( ( ( rule__EString__Alternatives ) ) )
            // ../dk.itu.bddcontracts.ui/src-gen/dk/itu/bddcontracts/ui/contentassist/antlr/internal/InternalGherkin.g:186:1: ( ( rule__EString__Alternatives ) )
            {
            // ../dk.itu.bddcontracts.ui/src-gen/dk/itu/bddcontracts/ui/contentassist/antlr/internal/InternalGherkin.g:186:1: ( ( rule__EString__Alternatives ) )
            // ../dk.itu.bddcontracts.ui/src-gen/dk/itu/bddcontracts/ui/contentassist/antlr/internal/InternalGherkin.g:187:1: ( rule__EString__Alternatives )
            {
             before(grammarAccess.getEStringAccess().getAlternatives()); 
            // ../dk.itu.bddcontracts.ui/src-gen/dk/itu/bddcontracts/ui/contentassist/antlr/internal/InternalGherkin.g:188:1: ( rule__EString__Alternatives )
            // ../dk.itu.bddcontracts.ui/src-gen/dk/itu/bddcontracts/ui/contentassist/antlr/internal/InternalGherkin.g:188:2: rule__EString__Alternatives
            {
            pushFollow(FollowSets000.FOLLOW_rule__EString__Alternatives_in_ruleEString334);
            rule__EString__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getEStringAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEString"


    // $ANTLR start "entryRuleMAny"
    // ../dk.itu.bddcontracts.ui/src-gen/dk/itu/bddcontracts/ui/contentassist/antlr/internal/InternalGherkin.g:200:1: entryRuleMAny : ruleMAny EOF ;
    public final void entryRuleMAny() throws RecognitionException {
        try {
            // ../dk.itu.bddcontracts.ui/src-gen/dk/itu/bddcontracts/ui/contentassist/antlr/internal/InternalGherkin.g:201:1: ( ruleMAny EOF )
            // ../dk.itu.bddcontracts.ui/src-gen/dk/itu/bddcontracts/ui/contentassist/antlr/internal/InternalGherkin.g:202:1: ruleMAny EOF
            {
             before(grammarAccess.getMAnyRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleMAny_in_entryRuleMAny361);
            ruleMAny();

            state._fsp--;

             after(grammarAccess.getMAnyRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleMAny368); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleMAny"


    // $ANTLR start "ruleMAny"
    // ../dk.itu.bddcontracts.ui/src-gen/dk/itu/bddcontracts/ui/contentassist/antlr/internal/InternalGherkin.g:209:1: ruleMAny : ( ( ( ruleAny ) ) ( ( ruleAny )* ) ) ;
    public final void ruleMAny() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.bddcontracts.ui/src-gen/dk/itu/bddcontracts/ui/contentassist/antlr/internal/InternalGherkin.g:213:2: ( ( ( ( ruleAny ) ) ( ( ruleAny )* ) ) )
            // ../dk.itu.bddcontracts.ui/src-gen/dk/itu/bddcontracts/ui/contentassist/antlr/internal/InternalGherkin.g:214:1: ( ( ( ruleAny ) ) ( ( ruleAny )* ) )
            {
            // ../dk.itu.bddcontracts.ui/src-gen/dk/itu/bddcontracts/ui/contentassist/antlr/internal/InternalGherkin.g:214:1: ( ( ( ruleAny ) ) ( ( ruleAny )* ) )
            // ../dk.itu.bddcontracts.ui/src-gen/dk/itu/bddcontracts/ui/contentassist/antlr/internal/InternalGherkin.g:215:1: ( ( ruleAny ) ) ( ( ruleAny )* )
            {
            // ../dk.itu.bddcontracts.ui/src-gen/dk/itu/bddcontracts/ui/contentassist/antlr/internal/InternalGherkin.g:215:1: ( ( ruleAny ) )
            // ../dk.itu.bddcontracts.ui/src-gen/dk/itu/bddcontracts/ui/contentassist/antlr/internal/InternalGherkin.g:216:1: ( ruleAny )
            {
             before(grammarAccess.getMAnyAccess().getAnyParserRuleCall()); 
            // ../dk.itu.bddcontracts.ui/src-gen/dk/itu/bddcontracts/ui/contentassist/antlr/internal/InternalGherkin.g:217:1: ( ruleAny )
            // ../dk.itu.bddcontracts.ui/src-gen/dk/itu/bddcontracts/ui/contentassist/antlr/internal/InternalGherkin.g:217:3: ruleAny
            {
            pushFollow(FollowSets000.FOLLOW_ruleAny_in_ruleMAny397);
            ruleAny();

            state._fsp--;


            }

             after(grammarAccess.getMAnyAccess().getAnyParserRuleCall()); 

            }

            // ../dk.itu.bddcontracts.ui/src-gen/dk/itu/bddcontracts/ui/contentassist/antlr/internal/InternalGherkin.g:220:1: ( ( ruleAny )* )
            // ../dk.itu.bddcontracts.ui/src-gen/dk/itu/bddcontracts/ui/contentassist/antlr/internal/InternalGherkin.g:221:1: ( ruleAny )*
            {
             before(grammarAccess.getMAnyAccess().getAnyParserRuleCall()); 
            // ../dk.itu.bddcontracts.ui/src-gen/dk/itu/bddcontracts/ui/contentassist/antlr/internal/InternalGherkin.g:222:1: ( ruleAny )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0>=RULE_STRING && LA1_0<=RULE_ANY_OTHER)) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ../dk.itu.bddcontracts.ui/src-gen/dk/itu/bddcontracts/ui/contentassist/antlr/internal/InternalGherkin.g:222:3: ruleAny
            	    {
            	    pushFollow(FollowSets000.FOLLOW_ruleAny_in_ruleMAny410);
            	    ruleAny();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

             after(grammarAccess.getMAnyAccess().getAnyParserRuleCall()); 

            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleMAny"


    // $ANTLR start "entryRuleAny"
    // ../dk.itu.bddcontracts.ui/src-gen/dk/itu/bddcontracts/ui/contentassist/antlr/internal/InternalGherkin.g:235:1: entryRuleAny : ruleAny EOF ;
    public final void entryRuleAny() throws RecognitionException {
        try {
            // ../dk.itu.bddcontracts.ui/src-gen/dk/itu/bddcontracts/ui/contentassist/antlr/internal/InternalGherkin.g:236:1: ( ruleAny EOF )
            // ../dk.itu.bddcontracts.ui/src-gen/dk/itu/bddcontracts/ui/contentassist/antlr/internal/InternalGherkin.g:237:1: ruleAny EOF
            {
             before(grammarAccess.getAnyRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleAny_in_entryRuleAny440);
            ruleAny();

            state._fsp--;

             after(grammarAccess.getAnyRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleAny447); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleAny"


    // $ANTLR start "ruleAny"
    // ../dk.itu.bddcontracts.ui/src-gen/dk/itu/bddcontracts/ui/contentassist/antlr/internal/InternalGherkin.g:244:1: ruleAny : ( ( rule__Any__Alternatives ) ) ;
    public final void ruleAny() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.bddcontracts.ui/src-gen/dk/itu/bddcontracts/ui/contentassist/antlr/internal/InternalGherkin.g:248:2: ( ( ( rule__Any__Alternatives ) ) )
            // ../dk.itu.bddcontracts.ui/src-gen/dk/itu/bddcontracts/ui/contentassist/antlr/internal/InternalGherkin.g:249:1: ( ( rule__Any__Alternatives ) )
            {
            // ../dk.itu.bddcontracts.ui/src-gen/dk/itu/bddcontracts/ui/contentassist/antlr/internal/InternalGherkin.g:249:1: ( ( rule__Any__Alternatives ) )
            // ../dk.itu.bddcontracts.ui/src-gen/dk/itu/bddcontracts/ui/contentassist/antlr/internal/InternalGherkin.g:250:1: ( rule__Any__Alternatives )
            {
             before(grammarAccess.getAnyAccess().getAlternatives()); 
            // ../dk.itu.bddcontracts.ui/src-gen/dk/itu/bddcontracts/ui/contentassist/antlr/internal/InternalGherkin.g:251:1: ( rule__Any__Alternatives )
            // ../dk.itu.bddcontracts.ui/src-gen/dk/itu/bddcontracts/ui/contentassist/antlr/internal/InternalGherkin.g:251:2: rule__Any__Alternatives
            {
            pushFollow(FollowSets000.FOLLOW_rule__Any__Alternatives_in_ruleAny473);
            rule__Any__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getAnyAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAny"


    // $ANTLR start "entryRuleBackground"
    // ../dk.itu.bddcontracts.ui/src-gen/dk/itu/bddcontracts/ui/contentassist/antlr/internal/InternalGherkin.g:263:1: entryRuleBackground : ruleBackground EOF ;
    public final void entryRuleBackground() throws RecognitionException {
        try {
            // ../dk.itu.bddcontracts.ui/src-gen/dk/itu/bddcontracts/ui/contentassist/antlr/internal/InternalGherkin.g:264:1: ( ruleBackground EOF )
            // ../dk.itu.bddcontracts.ui/src-gen/dk/itu/bddcontracts/ui/contentassist/antlr/internal/InternalGherkin.g:265:1: ruleBackground EOF
            {
             before(grammarAccess.getBackgroundRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleBackground_in_entryRuleBackground500);
            ruleBackground();

            state._fsp--;

             after(grammarAccess.getBackgroundRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleBackground507); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleBackground"


    // $ANTLR start "ruleBackground"
    // ../dk.itu.bddcontracts.ui/src-gen/dk/itu/bddcontracts/ui/contentassist/antlr/internal/InternalGherkin.g:272:1: ruleBackground : ( ( rule__Background__Group__0 ) ) ;
    public final void ruleBackground() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.bddcontracts.ui/src-gen/dk/itu/bddcontracts/ui/contentassist/antlr/internal/InternalGherkin.g:276:2: ( ( ( rule__Background__Group__0 ) ) )
            // ../dk.itu.bddcontracts.ui/src-gen/dk/itu/bddcontracts/ui/contentassist/antlr/internal/InternalGherkin.g:277:1: ( ( rule__Background__Group__0 ) )
            {
            // ../dk.itu.bddcontracts.ui/src-gen/dk/itu/bddcontracts/ui/contentassist/antlr/internal/InternalGherkin.g:277:1: ( ( rule__Background__Group__0 ) )
            // ../dk.itu.bddcontracts.ui/src-gen/dk/itu/bddcontracts/ui/contentassist/antlr/internal/InternalGherkin.g:278:1: ( rule__Background__Group__0 )
            {
             before(grammarAccess.getBackgroundAccess().getGroup()); 
            // ../dk.itu.bddcontracts.ui/src-gen/dk/itu/bddcontracts/ui/contentassist/antlr/internal/InternalGherkin.g:279:1: ( rule__Background__Group__0 )
            // ../dk.itu.bddcontracts.ui/src-gen/dk/itu/bddcontracts/ui/contentassist/antlr/internal/InternalGherkin.g:279:2: rule__Background__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__Background__Group__0_in_ruleBackground533);
            rule__Background__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getBackgroundAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleBackground"


    // $ANTLR start "entryRuleBehavior"
    // ../dk.itu.bddcontracts.ui/src-gen/dk/itu/bddcontracts/ui/contentassist/antlr/internal/InternalGherkin.g:291:1: entryRuleBehavior : ruleBehavior EOF ;
    public final void entryRuleBehavior() throws RecognitionException {
        try {
            // ../dk.itu.bddcontracts.ui/src-gen/dk/itu/bddcontracts/ui/contentassist/antlr/internal/InternalGherkin.g:292:1: ( ruleBehavior EOF )
            // ../dk.itu.bddcontracts.ui/src-gen/dk/itu/bddcontracts/ui/contentassist/antlr/internal/InternalGherkin.g:293:1: ruleBehavior EOF
            {
             before(grammarAccess.getBehaviorRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleBehavior_in_entryRuleBehavior560);
            ruleBehavior();

            state._fsp--;

             after(grammarAccess.getBehaviorRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleBehavior567); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleBehavior"


    // $ANTLR start "ruleBehavior"
    // ../dk.itu.bddcontracts.ui/src-gen/dk/itu/bddcontracts/ui/contentassist/antlr/internal/InternalGherkin.g:300:1: ruleBehavior : ( ( rule__Behavior__Group__0 ) ) ;
    public final void ruleBehavior() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.bddcontracts.ui/src-gen/dk/itu/bddcontracts/ui/contentassist/antlr/internal/InternalGherkin.g:304:2: ( ( ( rule__Behavior__Group__0 ) ) )
            // ../dk.itu.bddcontracts.ui/src-gen/dk/itu/bddcontracts/ui/contentassist/antlr/internal/InternalGherkin.g:305:1: ( ( rule__Behavior__Group__0 ) )
            {
            // ../dk.itu.bddcontracts.ui/src-gen/dk/itu/bddcontracts/ui/contentassist/antlr/internal/InternalGherkin.g:305:1: ( ( rule__Behavior__Group__0 ) )
            // ../dk.itu.bddcontracts.ui/src-gen/dk/itu/bddcontracts/ui/contentassist/antlr/internal/InternalGherkin.g:306:1: ( rule__Behavior__Group__0 )
            {
             before(grammarAccess.getBehaviorAccess().getGroup()); 
            // ../dk.itu.bddcontracts.ui/src-gen/dk/itu/bddcontracts/ui/contentassist/antlr/internal/InternalGherkin.g:307:1: ( rule__Behavior__Group__0 )
            // ../dk.itu.bddcontracts.ui/src-gen/dk/itu/bddcontracts/ui/contentassist/antlr/internal/InternalGherkin.g:307:2: rule__Behavior__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__Behavior__Group__0_in_ruleBehavior593);
            rule__Behavior__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getBehaviorAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleBehavior"


    // $ANTLR start "entryRuleSentence"
    // ../dk.itu.bddcontracts.ui/src-gen/dk/itu/bddcontracts/ui/contentassist/antlr/internal/InternalGherkin.g:319:1: entryRuleSentence : ruleSentence EOF ;
    public final void entryRuleSentence() throws RecognitionException {
        try {
            // ../dk.itu.bddcontracts.ui/src-gen/dk/itu/bddcontracts/ui/contentassist/antlr/internal/InternalGherkin.g:320:1: ( ruleSentence EOF )
            // ../dk.itu.bddcontracts.ui/src-gen/dk/itu/bddcontracts/ui/contentassist/antlr/internal/InternalGherkin.g:321:1: ruleSentence EOF
            {
             before(grammarAccess.getSentenceRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleSentence_in_entryRuleSentence620);
            ruleSentence();

            state._fsp--;

             after(grammarAccess.getSentenceRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleSentence627); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleSentence"


    // $ANTLR start "ruleSentence"
    // ../dk.itu.bddcontracts.ui/src-gen/dk/itu/bddcontracts/ui/contentassist/antlr/internal/InternalGherkin.g:328:1: ruleSentence : ( ( rule__Sentence__Group__0 ) ) ;
    public final void ruleSentence() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.bddcontracts.ui/src-gen/dk/itu/bddcontracts/ui/contentassist/antlr/internal/InternalGherkin.g:332:2: ( ( ( rule__Sentence__Group__0 ) ) )
            // ../dk.itu.bddcontracts.ui/src-gen/dk/itu/bddcontracts/ui/contentassist/antlr/internal/InternalGherkin.g:333:1: ( ( rule__Sentence__Group__0 ) )
            {
            // ../dk.itu.bddcontracts.ui/src-gen/dk/itu/bddcontracts/ui/contentassist/antlr/internal/InternalGherkin.g:333:1: ( ( rule__Sentence__Group__0 ) )
            // ../dk.itu.bddcontracts.ui/src-gen/dk/itu/bddcontracts/ui/contentassist/antlr/internal/InternalGherkin.g:334:1: ( rule__Sentence__Group__0 )
            {
             before(grammarAccess.getSentenceAccess().getGroup()); 
            // ../dk.itu.bddcontracts.ui/src-gen/dk/itu/bddcontracts/ui/contentassist/antlr/internal/InternalGherkin.g:335:1: ( rule__Sentence__Group__0 )
            // ../dk.itu.bddcontracts.ui/src-gen/dk/itu/bddcontracts/ui/contentassist/antlr/internal/InternalGherkin.g:335:2: rule__Sentence__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__Sentence__Group__0_in_ruleSentence653);
            rule__Sentence__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getSentenceAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleSentence"


    // $ANTLR start "entryRuleScenarioSpecific"
    // ../dk.itu.bddcontracts.ui/src-gen/dk/itu/bddcontracts/ui/contentassist/antlr/internal/InternalGherkin.g:347:1: entryRuleScenarioSpecific : ruleScenarioSpecific EOF ;
    public final void entryRuleScenarioSpecific() throws RecognitionException {
        try {
            // ../dk.itu.bddcontracts.ui/src-gen/dk/itu/bddcontracts/ui/contentassist/antlr/internal/InternalGherkin.g:348:1: ( ruleScenarioSpecific EOF )
            // ../dk.itu.bddcontracts.ui/src-gen/dk/itu/bddcontracts/ui/contentassist/antlr/internal/InternalGherkin.g:349:1: ruleScenarioSpecific EOF
            {
             before(grammarAccess.getScenarioSpecificRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleScenarioSpecific_in_entryRuleScenarioSpecific680);
            ruleScenarioSpecific();

            state._fsp--;

             after(grammarAccess.getScenarioSpecificRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleScenarioSpecific687); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleScenarioSpecific"


    // $ANTLR start "ruleScenarioSpecific"
    // ../dk.itu.bddcontracts.ui/src-gen/dk/itu/bddcontracts/ui/contentassist/antlr/internal/InternalGherkin.g:356:1: ruleScenarioSpecific : ( ( rule__ScenarioSpecific__Group__0 ) ) ;
    public final void ruleScenarioSpecific() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.bddcontracts.ui/src-gen/dk/itu/bddcontracts/ui/contentassist/antlr/internal/InternalGherkin.g:360:2: ( ( ( rule__ScenarioSpecific__Group__0 ) ) )
            // ../dk.itu.bddcontracts.ui/src-gen/dk/itu/bddcontracts/ui/contentassist/antlr/internal/InternalGherkin.g:361:1: ( ( rule__ScenarioSpecific__Group__0 ) )
            {
            // ../dk.itu.bddcontracts.ui/src-gen/dk/itu/bddcontracts/ui/contentassist/antlr/internal/InternalGherkin.g:361:1: ( ( rule__ScenarioSpecific__Group__0 ) )
            // ../dk.itu.bddcontracts.ui/src-gen/dk/itu/bddcontracts/ui/contentassist/antlr/internal/InternalGherkin.g:362:1: ( rule__ScenarioSpecific__Group__0 )
            {
             before(grammarAccess.getScenarioSpecificAccess().getGroup()); 
            // ../dk.itu.bddcontracts.ui/src-gen/dk/itu/bddcontracts/ui/contentassist/antlr/internal/InternalGherkin.g:363:1: ( rule__ScenarioSpecific__Group__0 )
            // ../dk.itu.bddcontracts.ui/src-gen/dk/itu/bddcontracts/ui/contentassist/antlr/internal/InternalGherkin.g:363:2: rule__ScenarioSpecific__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__ScenarioSpecific__Group__0_in_ruleScenarioSpecific713);
            rule__ScenarioSpecific__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getScenarioSpecificAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleScenarioSpecific"


    // $ANTLR start "entryRuleScenarioOutline"
    // ../dk.itu.bddcontracts.ui/src-gen/dk/itu/bddcontracts/ui/contentassist/antlr/internal/InternalGherkin.g:375:1: entryRuleScenarioOutline : ruleScenarioOutline EOF ;
    public final void entryRuleScenarioOutline() throws RecognitionException {
        try {
            // ../dk.itu.bddcontracts.ui/src-gen/dk/itu/bddcontracts/ui/contentassist/antlr/internal/InternalGherkin.g:376:1: ( ruleScenarioOutline EOF )
            // ../dk.itu.bddcontracts.ui/src-gen/dk/itu/bddcontracts/ui/contentassist/antlr/internal/InternalGherkin.g:377:1: ruleScenarioOutline EOF
            {
             before(grammarAccess.getScenarioOutlineRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleScenarioOutline_in_entryRuleScenarioOutline740);
            ruleScenarioOutline();

            state._fsp--;

             after(grammarAccess.getScenarioOutlineRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleScenarioOutline747); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleScenarioOutline"


    // $ANTLR start "ruleScenarioOutline"
    // ../dk.itu.bddcontracts.ui/src-gen/dk/itu/bddcontracts/ui/contentassist/antlr/internal/InternalGherkin.g:384:1: ruleScenarioOutline : ( ( rule__ScenarioOutline__Group__0 ) ) ;
    public final void ruleScenarioOutline() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.bddcontracts.ui/src-gen/dk/itu/bddcontracts/ui/contentassist/antlr/internal/InternalGherkin.g:388:2: ( ( ( rule__ScenarioOutline__Group__0 ) ) )
            // ../dk.itu.bddcontracts.ui/src-gen/dk/itu/bddcontracts/ui/contentassist/antlr/internal/InternalGherkin.g:389:1: ( ( rule__ScenarioOutline__Group__0 ) )
            {
            // ../dk.itu.bddcontracts.ui/src-gen/dk/itu/bddcontracts/ui/contentassist/antlr/internal/InternalGherkin.g:389:1: ( ( rule__ScenarioOutline__Group__0 ) )
            // ../dk.itu.bddcontracts.ui/src-gen/dk/itu/bddcontracts/ui/contentassist/antlr/internal/InternalGherkin.g:390:1: ( rule__ScenarioOutline__Group__0 )
            {
             before(grammarAccess.getScenarioOutlineAccess().getGroup()); 
            // ../dk.itu.bddcontracts.ui/src-gen/dk/itu/bddcontracts/ui/contentassist/antlr/internal/InternalGherkin.g:391:1: ( rule__ScenarioOutline__Group__0 )
            // ../dk.itu.bddcontracts.ui/src-gen/dk/itu/bddcontracts/ui/contentassist/antlr/internal/InternalGherkin.g:391:2: rule__ScenarioOutline__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__ScenarioOutline__Group__0_in_ruleScenarioOutline773);
            rule__ScenarioOutline__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getScenarioOutlineAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleScenarioOutline"


    // $ANTLR start "entryRuleReference"
    // ../dk.itu.bddcontracts.ui/src-gen/dk/itu/bddcontracts/ui/contentassist/antlr/internal/InternalGherkin.g:403:1: entryRuleReference : ruleReference EOF ;
    public final void entryRuleReference() throws RecognitionException {
        try {
            // ../dk.itu.bddcontracts.ui/src-gen/dk/itu/bddcontracts/ui/contentassist/antlr/internal/InternalGherkin.g:404:1: ( ruleReference EOF )
            // ../dk.itu.bddcontracts.ui/src-gen/dk/itu/bddcontracts/ui/contentassist/antlr/internal/InternalGherkin.g:405:1: ruleReference EOF
            {
             before(grammarAccess.getReferenceRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleReference_in_entryRuleReference800);
            ruleReference();

            state._fsp--;

             after(grammarAccess.getReferenceRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleReference807); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleReference"


    // $ANTLR start "ruleReference"
    // ../dk.itu.bddcontracts.ui/src-gen/dk/itu/bddcontracts/ui/contentassist/antlr/internal/InternalGherkin.g:412:1: ruleReference : ( ( rule__Reference__Group__0 ) ) ;
    public final void ruleReference() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.bddcontracts.ui/src-gen/dk/itu/bddcontracts/ui/contentassist/antlr/internal/InternalGherkin.g:416:2: ( ( ( rule__Reference__Group__0 ) ) )
            // ../dk.itu.bddcontracts.ui/src-gen/dk/itu/bddcontracts/ui/contentassist/antlr/internal/InternalGherkin.g:417:1: ( ( rule__Reference__Group__0 ) )
            {
            // ../dk.itu.bddcontracts.ui/src-gen/dk/itu/bddcontracts/ui/contentassist/antlr/internal/InternalGherkin.g:417:1: ( ( rule__Reference__Group__0 ) )
            // ../dk.itu.bddcontracts.ui/src-gen/dk/itu/bddcontracts/ui/contentassist/antlr/internal/InternalGherkin.g:418:1: ( rule__Reference__Group__0 )
            {
             before(grammarAccess.getReferenceAccess().getGroup()); 
            // ../dk.itu.bddcontracts.ui/src-gen/dk/itu/bddcontracts/ui/contentassist/antlr/internal/InternalGherkin.g:419:1: ( rule__Reference__Group__0 )
            // ../dk.itu.bddcontracts.ui/src-gen/dk/itu/bddcontracts/ui/contentassist/antlr/internal/InternalGherkin.g:419:2: rule__Reference__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__Reference__Group__0_in_ruleReference833);
            rule__Reference__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getReferenceAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleReference"


    // $ANTLR start "entryRuleWord"
    // ../dk.itu.bddcontracts.ui/src-gen/dk/itu/bddcontracts/ui/contentassist/antlr/internal/InternalGherkin.g:431:1: entryRuleWord : ruleWord EOF ;
    public final void entryRuleWord() throws RecognitionException {
        try {
            // ../dk.itu.bddcontracts.ui/src-gen/dk/itu/bddcontracts/ui/contentassist/antlr/internal/InternalGherkin.g:432:1: ( ruleWord EOF )
            // ../dk.itu.bddcontracts.ui/src-gen/dk/itu/bddcontracts/ui/contentassist/antlr/internal/InternalGherkin.g:433:1: ruleWord EOF
            {
             before(grammarAccess.getWordRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleWord_in_entryRuleWord860);
            ruleWord();

            state._fsp--;

             after(grammarAccess.getWordRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleWord867); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleWord"


    // $ANTLR start "ruleWord"
    // ../dk.itu.bddcontracts.ui/src-gen/dk/itu/bddcontracts/ui/contentassist/antlr/internal/InternalGherkin.g:440:1: ruleWord : ( ( rule__Word__ValueAssignment ) ) ;
    public final void ruleWord() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.bddcontracts.ui/src-gen/dk/itu/bddcontracts/ui/contentassist/antlr/internal/InternalGherkin.g:444:2: ( ( ( rule__Word__ValueAssignment ) ) )
            // ../dk.itu.bddcontracts.ui/src-gen/dk/itu/bddcontracts/ui/contentassist/antlr/internal/InternalGherkin.g:445:1: ( ( rule__Word__ValueAssignment ) )
            {
            // ../dk.itu.bddcontracts.ui/src-gen/dk/itu/bddcontracts/ui/contentassist/antlr/internal/InternalGherkin.g:445:1: ( ( rule__Word__ValueAssignment ) )
            // ../dk.itu.bddcontracts.ui/src-gen/dk/itu/bddcontracts/ui/contentassist/antlr/internal/InternalGherkin.g:446:1: ( rule__Word__ValueAssignment )
            {
             before(grammarAccess.getWordAccess().getValueAssignment()); 
            // ../dk.itu.bddcontracts.ui/src-gen/dk/itu/bddcontracts/ui/contentassist/antlr/internal/InternalGherkin.g:447:1: ( rule__Word__ValueAssignment )
            // ../dk.itu.bddcontracts.ui/src-gen/dk/itu/bddcontracts/ui/contentassist/antlr/internal/InternalGherkin.g:447:2: rule__Word__ValueAssignment
            {
            pushFollow(FollowSets000.FOLLOW_rule__Word__ValueAssignment_in_ruleWord893);
            rule__Word__ValueAssignment();

            state._fsp--;


            }

             after(grammarAccess.getWordAccess().getValueAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleWord"


    // $ANTLR start "entryRuleExample"
    // ../dk.itu.bddcontracts.ui/src-gen/dk/itu/bddcontracts/ui/contentassist/antlr/internal/InternalGherkin.g:459:1: entryRuleExample : ruleExample EOF ;
    public final void entryRuleExample() throws RecognitionException {
        try {
            // ../dk.itu.bddcontracts.ui/src-gen/dk/itu/bddcontracts/ui/contentassist/antlr/internal/InternalGherkin.g:460:1: ( ruleExample EOF )
            // ../dk.itu.bddcontracts.ui/src-gen/dk/itu/bddcontracts/ui/contentassist/antlr/internal/InternalGherkin.g:461:1: ruleExample EOF
            {
             before(grammarAccess.getExampleRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleExample_in_entryRuleExample920);
            ruleExample();

            state._fsp--;

             after(grammarAccess.getExampleRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleExample927); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleExample"


    // $ANTLR start "ruleExample"
    // ../dk.itu.bddcontracts.ui/src-gen/dk/itu/bddcontracts/ui/contentassist/antlr/internal/InternalGherkin.g:468:1: ruleExample : ( ( rule__Example__Group__0 ) ) ;
    public final void ruleExample() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.bddcontracts.ui/src-gen/dk/itu/bddcontracts/ui/contentassist/antlr/internal/InternalGherkin.g:472:2: ( ( ( rule__Example__Group__0 ) ) )
            // ../dk.itu.bddcontracts.ui/src-gen/dk/itu/bddcontracts/ui/contentassist/antlr/internal/InternalGherkin.g:473:1: ( ( rule__Example__Group__0 ) )
            {
            // ../dk.itu.bddcontracts.ui/src-gen/dk/itu/bddcontracts/ui/contentassist/antlr/internal/InternalGherkin.g:473:1: ( ( rule__Example__Group__0 ) )
            // ../dk.itu.bddcontracts.ui/src-gen/dk/itu/bddcontracts/ui/contentassist/antlr/internal/InternalGherkin.g:474:1: ( rule__Example__Group__0 )
            {
             before(grammarAccess.getExampleAccess().getGroup()); 
            // ../dk.itu.bddcontracts.ui/src-gen/dk/itu/bddcontracts/ui/contentassist/antlr/internal/InternalGherkin.g:475:1: ( rule__Example__Group__0 )
            // ../dk.itu.bddcontracts.ui/src-gen/dk/itu/bddcontracts/ui/contentassist/antlr/internal/InternalGherkin.g:475:2: rule__Example__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__Example__Group__0_in_ruleExample953);
            rule__Example__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getExampleAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleExample"


    // $ANTLR start "entryRuleValue"
    // ../dk.itu.bddcontracts.ui/src-gen/dk/itu/bddcontracts/ui/contentassist/antlr/internal/InternalGherkin.g:487:1: entryRuleValue : ruleValue EOF ;
    public final void entryRuleValue() throws RecognitionException {
        try {
            // ../dk.itu.bddcontracts.ui/src-gen/dk/itu/bddcontracts/ui/contentassist/antlr/internal/InternalGherkin.g:488:1: ( ruleValue EOF )
            // ../dk.itu.bddcontracts.ui/src-gen/dk/itu/bddcontracts/ui/contentassist/antlr/internal/InternalGherkin.g:489:1: ruleValue EOF
            {
             before(grammarAccess.getValueRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleValue_in_entryRuleValue980);
            ruleValue();

            state._fsp--;

             after(grammarAccess.getValueRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleValue987); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleValue"


    // $ANTLR start "ruleValue"
    // ../dk.itu.bddcontracts.ui/src-gen/dk/itu/bddcontracts/ui/contentassist/antlr/internal/InternalGherkin.g:496:1: ruleValue : ( ( rule__Value__Group__0 ) ) ;
    public final void ruleValue() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.bddcontracts.ui/src-gen/dk/itu/bddcontracts/ui/contentassist/antlr/internal/InternalGherkin.g:500:2: ( ( ( rule__Value__Group__0 ) ) )
            // ../dk.itu.bddcontracts.ui/src-gen/dk/itu/bddcontracts/ui/contentassist/antlr/internal/InternalGherkin.g:501:1: ( ( rule__Value__Group__0 ) )
            {
            // ../dk.itu.bddcontracts.ui/src-gen/dk/itu/bddcontracts/ui/contentassist/antlr/internal/InternalGherkin.g:501:1: ( ( rule__Value__Group__0 ) )
            // ../dk.itu.bddcontracts.ui/src-gen/dk/itu/bddcontracts/ui/contentassist/antlr/internal/InternalGherkin.g:502:1: ( rule__Value__Group__0 )
            {
             before(grammarAccess.getValueAccess().getGroup()); 
            // ../dk.itu.bddcontracts.ui/src-gen/dk/itu/bddcontracts/ui/contentassist/antlr/internal/InternalGherkin.g:503:1: ( rule__Value__Group__0 )
            // ../dk.itu.bddcontracts.ui/src-gen/dk/itu/bddcontracts/ui/contentassist/antlr/internal/InternalGherkin.g:503:2: rule__Value__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__Value__Group__0_in_ruleValue1013);
            rule__Value__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getValueAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleValue"


    // $ANTLR start "rule__Scenario__Alternatives"
    // ../dk.itu.bddcontracts.ui/src-gen/dk/itu/bddcontracts/ui/contentassist/antlr/internal/InternalGherkin.g:515:1: rule__Scenario__Alternatives : ( ( ruleScenarioSpecific ) | ( ruleScenarioOutline ) );
    public final void rule__Scenario__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.bddcontracts.ui/src-gen/dk/itu/bddcontracts/ui/contentassist/antlr/internal/InternalGherkin.g:519:1: ( ( ruleScenarioSpecific ) | ( ruleScenarioOutline ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==18) ) {
                alt2=1;
            }
            else if ( (LA2_0==21) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // ../dk.itu.bddcontracts.ui/src-gen/dk/itu/bddcontracts/ui/contentassist/antlr/internal/InternalGherkin.g:520:1: ( ruleScenarioSpecific )
                    {
                    // ../dk.itu.bddcontracts.ui/src-gen/dk/itu/bddcontracts/ui/contentassist/antlr/internal/InternalGherkin.g:520:1: ( ruleScenarioSpecific )
                    // ../dk.itu.bddcontracts.ui/src-gen/dk/itu/bddcontracts/ui/contentassist/antlr/internal/InternalGherkin.g:521:1: ruleScenarioSpecific
                    {
                     before(grammarAccess.getScenarioAccess().getScenarioSpecificParserRuleCall_0()); 
                    pushFollow(FollowSets000.FOLLOW_ruleScenarioSpecific_in_rule__Scenario__Alternatives1049);
                    ruleScenarioSpecific();

                    state._fsp--;

                     after(grammarAccess.getScenarioAccess().getScenarioSpecificParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../dk.itu.bddcontracts.ui/src-gen/dk/itu/bddcontracts/ui/contentassist/antlr/internal/InternalGherkin.g:526:6: ( ruleScenarioOutline )
                    {
                    // ../dk.itu.bddcontracts.ui/src-gen/dk/itu/bddcontracts/ui/contentassist/antlr/internal/InternalGherkin.g:526:6: ( ruleScenarioOutline )
                    // ../dk.itu.bddcontracts.ui/src-gen/dk/itu/bddcontracts/ui/contentassist/antlr/internal/InternalGherkin.g:527:1: ruleScenarioOutline
                    {
                     before(grammarAccess.getScenarioAccess().getScenarioOutlineParserRuleCall_1()); 
                    pushFollow(FollowSets000.FOLLOW_ruleScenarioOutline_in_rule__Scenario__Alternatives1066);
                    ruleScenarioOutline();

                    state._fsp--;

                     after(grammarAccess.getScenarioAccess().getScenarioOutlineParserRuleCall_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Scenario__Alternatives"


    // $ANTLR start "rule__Content__Alternatives"
    // ../dk.itu.bddcontracts.ui/src-gen/dk/itu/bddcontracts/ui/contentassist/antlr/internal/InternalGherkin.g:537:1: rule__Content__Alternatives : ( ( ruleReference ) | ( ruleWord ) );
    public final void rule__Content__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.bddcontracts.ui/src-gen/dk/itu/bddcontracts/ui/contentassist/antlr/internal/InternalGherkin.g:541:1: ( ( ruleReference ) | ( ruleWord ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==23) ) {
                alt3=1;
            }
            else if ( ((LA3_0>=RULE_STRING && LA3_0<=RULE_ANY_OTHER)) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // ../dk.itu.bddcontracts.ui/src-gen/dk/itu/bddcontracts/ui/contentassist/antlr/internal/InternalGherkin.g:542:1: ( ruleReference )
                    {
                    // ../dk.itu.bddcontracts.ui/src-gen/dk/itu/bddcontracts/ui/contentassist/antlr/internal/InternalGherkin.g:542:1: ( ruleReference )
                    // ../dk.itu.bddcontracts.ui/src-gen/dk/itu/bddcontracts/ui/contentassist/antlr/internal/InternalGherkin.g:543:1: ruleReference
                    {
                     before(grammarAccess.getContentAccess().getReferenceParserRuleCall_0()); 
                    pushFollow(FollowSets000.FOLLOW_ruleReference_in_rule__Content__Alternatives1098);
                    ruleReference();

                    state._fsp--;

                     after(grammarAccess.getContentAccess().getReferenceParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../dk.itu.bddcontracts.ui/src-gen/dk/itu/bddcontracts/ui/contentassist/antlr/internal/InternalGherkin.g:548:6: ( ruleWord )
                    {
                    // ../dk.itu.bddcontracts.ui/src-gen/dk/itu/bddcontracts/ui/contentassist/antlr/internal/InternalGherkin.g:548:6: ( ruleWord )
                    // ../dk.itu.bddcontracts.ui/src-gen/dk/itu/bddcontracts/ui/contentassist/antlr/internal/InternalGherkin.g:549:1: ruleWord
                    {
                     before(grammarAccess.getContentAccess().getWordParserRuleCall_1()); 
                    pushFollow(FollowSets000.FOLLOW_ruleWord_in_rule__Content__Alternatives1115);
                    ruleWord();

                    state._fsp--;

                     after(grammarAccess.getContentAccess().getWordParserRuleCall_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Content__Alternatives"


    // $ANTLR start "rule__EString__Alternatives"
    // ../dk.itu.bddcontracts.ui/src-gen/dk/itu/bddcontracts/ui/contentassist/antlr/internal/InternalGherkin.g:559:1: rule__EString__Alternatives : ( ( RULE_STRING ) | ( RULE_ID ) | ( RULE_INT ) );
    public final void rule__EString__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.bddcontracts.ui/src-gen/dk/itu/bddcontracts/ui/contentassist/antlr/internal/InternalGherkin.g:563:1: ( ( RULE_STRING ) | ( RULE_ID ) | ( RULE_INT ) )
            int alt4=3;
            switch ( input.LA(1) ) {
            case RULE_STRING:
                {
                alt4=1;
                }
                break;
            case RULE_ID:
                {
                alt4=2;
                }
                break;
            case RULE_INT:
                {
                alt4=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }

            switch (alt4) {
                case 1 :
                    // ../dk.itu.bddcontracts.ui/src-gen/dk/itu/bddcontracts/ui/contentassist/antlr/internal/InternalGherkin.g:564:1: ( RULE_STRING )
                    {
                    // ../dk.itu.bddcontracts.ui/src-gen/dk/itu/bddcontracts/ui/contentassist/antlr/internal/InternalGherkin.g:564:1: ( RULE_STRING )
                    // ../dk.itu.bddcontracts.ui/src-gen/dk/itu/bddcontracts/ui/contentassist/antlr/internal/InternalGherkin.g:565:1: RULE_STRING
                    {
                     before(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 
                    match(input,RULE_STRING,FollowSets000.FOLLOW_RULE_STRING_in_rule__EString__Alternatives1147); 
                     after(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../dk.itu.bddcontracts.ui/src-gen/dk/itu/bddcontracts/ui/contentassist/antlr/internal/InternalGherkin.g:570:6: ( RULE_ID )
                    {
                    // ../dk.itu.bddcontracts.ui/src-gen/dk/itu/bddcontracts/ui/contentassist/antlr/internal/InternalGherkin.g:570:6: ( RULE_ID )
                    // ../dk.itu.bddcontracts.ui/src-gen/dk/itu/bddcontracts/ui/contentassist/antlr/internal/InternalGherkin.g:571:1: RULE_ID
                    {
                     before(grammarAccess.getEStringAccess().getIDTerminalRuleCall_1()); 
                    match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_rule__EString__Alternatives1164); 
                     after(grammarAccess.getEStringAccess().getIDTerminalRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../dk.itu.bddcontracts.ui/src-gen/dk/itu/bddcontracts/ui/contentassist/antlr/internal/InternalGherkin.g:576:6: ( RULE_INT )
                    {
                    // ../dk.itu.bddcontracts.ui/src-gen/dk/itu/bddcontracts/ui/contentassist/antlr/internal/InternalGherkin.g:576:6: ( RULE_INT )
                    // ../dk.itu.bddcontracts.ui/src-gen/dk/itu/bddcontracts/ui/contentassist/antlr/internal/InternalGherkin.g:577:1: RULE_INT
                    {
                     before(grammarAccess.getEStringAccess().getINTTerminalRuleCall_2()); 
                    match(input,RULE_INT,FollowSets000.FOLLOW_RULE_INT_in_rule__EString__Alternatives1181); 
                     after(grammarAccess.getEStringAccess().getINTTerminalRuleCall_2()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EString__Alternatives"


    // $ANTLR start "rule__Any__Alternatives"
    // ../dk.itu.bddcontracts.ui/src-gen/dk/itu/bddcontracts/ui/contentassist/antlr/internal/InternalGherkin.g:587:1: rule__Any__Alternatives : ( ( RULE_ID ) | ( RULE_INT ) | ( RULE_STRING ) | ( RULE_ANY_OTHER ) );
    public final void rule__Any__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.bddcontracts.ui/src-gen/dk/itu/bddcontracts/ui/contentassist/antlr/internal/InternalGherkin.g:591:1: ( ( RULE_ID ) | ( RULE_INT ) | ( RULE_STRING ) | ( RULE_ANY_OTHER ) )
            int alt5=4;
            switch ( input.LA(1) ) {
            case RULE_ID:
                {
                alt5=1;
                }
                break;
            case RULE_INT:
                {
                alt5=2;
                }
                break;
            case RULE_STRING:
                {
                alt5=3;
                }
                break;
            case RULE_ANY_OTHER:
                {
                alt5=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }

            switch (alt5) {
                case 1 :
                    // ../dk.itu.bddcontracts.ui/src-gen/dk/itu/bddcontracts/ui/contentassist/antlr/internal/InternalGherkin.g:592:1: ( RULE_ID )
                    {
                    // ../dk.itu.bddcontracts.ui/src-gen/dk/itu/bddcontracts/ui/contentassist/antlr/internal/InternalGherkin.g:592:1: ( RULE_ID )
                    // ../dk.itu.bddcontracts.ui/src-gen/dk/itu/bddcontracts/ui/contentassist/antlr/internal/InternalGherkin.g:593:1: RULE_ID
                    {
                     before(grammarAccess.getAnyAccess().getIDTerminalRuleCall_0()); 
                    match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_rule__Any__Alternatives1213); 
                     after(grammarAccess.getAnyAccess().getIDTerminalRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../dk.itu.bddcontracts.ui/src-gen/dk/itu/bddcontracts/ui/contentassist/antlr/internal/InternalGherkin.g:598:6: ( RULE_INT )
                    {
                    // ../dk.itu.bddcontracts.ui/src-gen/dk/itu/bddcontracts/ui/contentassist/antlr/internal/InternalGherkin.g:598:6: ( RULE_INT )
                    // ../dk.itu.bddcontracts.ui/src-gen/dk/itu/bddcontracts/ui/contentassist/antlr/internal/InternalGherkin.g:599:1: RULE_INT
                    {
                     before(grammarAccess.getAnyAccess().getINTTerminalRuleCall_1()); 
                    match(input,RULE_INT,FollowSets000.FOLLOW_RULE_INT_in_rule__Any__Alternatives1230); 
                     after(grammarAccess.getAnyAccess().getINTTerminalRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../dk.itu.bddcontracts.ui/src-gen/dk/itu/bddcontracts/ui/contentassist/antlr/internal/InternalGherkin.g:604:6: ( RULE_STRING )
                    {
                    // ../dk.itu.bddcontracts.ui/src-gen/dk/itu/bddcontracts/ui/contentassist/antlr/internal/InternalGherkin.g:604:6: ( RULE_STRING )
                    // ../dk.itu.bddcontracts.ui/src-gen/dk/itu/bddcontracts/ui/contentassist/antlr/internal/InternalGherkin.g:605:1: RULE_STRING
                    {
                     before(grammarAccess.getAnyAccess().getSTRINGTerminalRuleCall_2()); 
                    match(input,RULE_STRING,FollowSets000.FOLLOW_RULE_STRING_in_rule__Any__Alternatives1247); 
                     after(grammarAccess.getAnyAccess().getSTRINGTerminalRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../dk.itu.bddcontracts.ui/src-gen/dk/itu/bddcontracts/ui/contentassist/antlr/internal/InternalGherkin.g:610:6: ( RULE_ANY_OTHER )
                    {
                    // ../dk.itu.bddcontracts.ui/src-gen/dk/itu/bddcontracts/ui/contentassist/antlr/internal/InternalGherkin.g:610:6: ( RULE_ANY_OTHER )
                    // ../dk.itu.bddcontracts.ui/src-gen/dk/itu/bddcontracts/ui/contentassist/antlr/internal/InternalGherkin.g:611:1: RULE_ANY_OTHER
                    {
                     before(grammarAccess.getAnyAccess().getANY_OTHERTerminalRuleCall_3()); 
                    match(input,RULE_ANY_OTHER,FollowSets000.FOLLOW_RULE_ANY_OTHER_in_rule__Any__Alternatives1264); 
                     after(grammarAccess.getAnyAccess().getANY_OTHERTerminalRuleCall_3()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Any__Alternatives"


    // $ANTLR start "rule__Model__Group__0"
    // ../dk.itu.bddcontracts.ui/src-gen/dk/itu/bddcontracts/ui/contentassist/antlr/internal/InternalGherkin.g:623:1: rule__Model__Group__0 : rule__Model__Group__0__Impl rule__Model__Group__1 ;
    public final void rule__Model__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.bddcontracts.ui/src-gen/dk/itu/bddcontracts/ui/contentassist/antlr/internal/InternalGherkin.g:627:1: ( rule__Model__Group__0__Impl rule__Model__Group__1 )
            // ../dk.itu.bddcontracts.ui/src-gen/dk/itu/bddcontracts/ui/contentassist/antlr/internal/InternalGherkin.g:628:2: rule__Model__Group__0__Impl rule__Model__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Model__Group__0__Impl_in_rule__Model__Group__01294);
            rule__Model__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Model__Group__1_in_rule__Model__Group__01297);
            rule__Model__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__0"


    // $ANTLR start "rule__Model__Group__0__Impl"
    // ../dk.itu.bddcontracts.ui/src-gen/dk/itu/bddcontracts/ui/contentassist/antlr/internal/InternalGherkin.g:635:1: rule__Model__Group__0__Impl : ( () ) ;
    public final void rule__Model__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.bddcontracts.ui/src-gen/dk/itu/bddcontracts/ui/contentassist/antlr/internal/InternalGherkin.g:639:1: ( ( () ) )
            // ../dk.itu.bddcontracts.ui/src-gen/dk/itu/bddcontracts/ui/contentassist/antlr/internal/InternalGherkin.g:640:1: ( () )
            {
            // ../dk.itu.bddcontracts.ui/src-gen/dk/itu/bddcontracts/ui/contentassist/antlr/internal/InternalGherkin.g:640:1: ( () )
            // ../dk.itu.bddcontracts.ui/src-gen/dk/itu/bddcontracts/ui/contentassist/antlr/internal/InternalGherkin.g:641:1: ()
            {
             before(grammarAccess.getModelAccess().getModelAction_0()); 
            // ../dk.itu.bddcontracts.ui/src-gen/dk/itu/bddcontracts/ui/contentassist/antlr/internal/InternalGherkin.g:642:1: ()
            // ../dk.itu.bddcontracts.ui/src-gen/dk/itu/bddcontracts/ui/contentassist/antlr/internal/InternalGherkin.g:644:1: 
            {
            }

             after(grammarAccess.getModelAccess().getModelAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__0__Impl"


    // $ANTLR start "rule__Model__Group__1"
    // ../dk.itu.bddcontracts.ui/src-gen/dk/itu/bddcontracts/ui/contentassist/antlr/internal/InternalGherkin.g:654:1: rule__Model__Group__1 : rule__Model__Group__1__Impl ;
    public final void rule__Model__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.bddcontracts.ui/src-gen/dk/itu/bddcontracts/ui/contentassist/antlr/internal/InternalGherkin.g:658:1: ( rule__Model__Group__1__Impl )
            // ../dk.itu.bddcontracts.ui/src-gen/dk/itu/bddcontracts/ui/contentassist/antlr/internal/InternalGherkin.g:659:2: rule__Model__Group__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Model__Group__1__Impl_in_rule__Model__Group__11355);
            rule__Model__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__1"


    // $ANTLR start "rule__Model__Group__1__Impl"
    // ../dk.itu.bddcontracts.ui/src-gen/dk/itu/bddcontracts/ui/contentassist/antlr/internal/InternalGherkin.g:665:1: rule__Model__Group__1__Impl : ( ( rule__Model__Group_1__0 )? ) ;
    public final void rule__Model__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.bddcontracts.ui/src-gen/dk/itu/bddcontracts/ui/contentassist/antlr/internal/InternalGherkin.g:669:1: ( ( ( rule__Model__Group_1__0 )? ) )
            // ../dk.itu.bddcontracts.ui/src-gen/dk/itu/bddcontracts/ui/contentassist/antlr/internal/InternalGherkin.g:670:1: ( ( rule__Model__Group_1__0 )? )
            {
            // ../dk.itu.bddcontracts.ui/src-gen/dk/itu/bddcontracts/ui/contentassist/antlr/internal/InternalGherkin.g:670:1: ( ( rule__Model__Group_1__0 )? )
            // ../dk.itu.bddcontracts.ui/src-gen/dk/itu/bddcontracts/ui/contentassist/antlr/internal/InternalGherkin.g:671:1: ( rule__Model__Group_1__0 )?
            {
             before(grammarAccess.getModelAccess().getGroup_1()); 
            // ../dk.itu.bddcontracts.ui/src-gen/dk/itu/bddcontracts/ui/contentassist/antlr/internal/InternalGherkin.g:672:1: ( rule__Model__Group_1__0 )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==11) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // ../dk.itu.bddcontracts.ui/src-gen/dk/itu/bddcontracts/ui/contentassist/antlr/internal/InternalGherkin.g:672:2: rule__Model__Group_1__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__Model__Group_1__0_in_rule__Model__Group__1__Impl1382);
                    rule__Model__Group_1__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getModelAccess().getGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__1__Impl"


    // $ANTLR start "rule__Model__Group_1__0"
    // ../dk.itu.bddcontracts.ui/src-gen/dk/itu/bddcontracts/ui/contentassist/antlr/internal/InternalGherkin.g:686:1: rule__Model__Group_1__0 : rule__Model__Group_1__0__Impl rule__Model__Group_1__1 ;
    public final void rule__Model__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.bddcontracts.ui/src-gen/dk/itu/bddcontracts/ui/contentassist/antlr/internal/InternalGherkin.g:690:1: ( rule__Model__Group_1__0__Impl rule__Model__Group_1__1 )
            // ../dk.itu.bddcontracts.ui/src-gen/dk/itu/bddcontracts/ui/contentassist/antlr/internal/InternalGherkin.g:691:2: rule__Model__Group_1__0__Impl rule__Model__Group_1__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Model__Group_1__0__Impl_in_rule__Model__Group_1__01417);
            rule__Model__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Model__Group_1__1_in_rule__Model__Group_1__01420);
            rule__Model__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group_1__0"


    // $ANTLR start "rule__Model__Group_1__0__Impl"
    // ../dk.itu.bddcontracts.ui/src-gen/dk/itu/bddcontracts/ui/contentassist/antlr/internal/InternalGherkin.g:698:1: rule__Model__Group_1__0__Impl : ( ( rule__Model__FeaturesAssignment_1_0 ) ) ;
    public final void rule__Model__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.bddcontracts.ui/src-gen/dk/itu/bddcontracts/ui/contentassist/antlr/internal/InternalGherkin.g:702:1: ( ( ( rule__Model__FeaturesAssignment_1_0 ) ) )
            // ../dk.itu.bddcontracts.ui/src-gen/dk/itu/bddcontracts/ui/contentassist/antlr/internal/InternalGherkin.g:703:1: ( ( rule__Model__FeaturesAssignment_1_0 ) )
            {
            // ../dk.itu.bddcontracts.ui/src-gen/dk/itu/bddcontracts/ui/contentassist/antlr/internal/InternalGherkin.g:703:1: ( ( rule__Model__FeaturesAssignment_1_0 ) )
            // ../dk.itu.bddcontracts.ui/src-gen/dk/itu/bddcontracts/ui/contentassist/antlr/internal/InternalGherkin.g:704:1: ( rule__Model__FeaturesAssignment_1_0 )
            {
             before(grammarAccess.getModelAccess().getFeaturesAssignment_1_0()); 
            // ../dk.itu.bddcontracts.ui/src-gen/dk/itu/bddcontracts/ui/contentassist/antlr/internal/InternalGherkin.g:705:1: ( rule__Model__FeaturesAssignment_1_0 )
            // ../dk.itu.bddcontracts.ui/src-gen/dk/itu/bddcontracts/ui/contentassist/antlr/internal/InternalGherkin.g:705:2: rule__Model__FeaturesAssignment_1_0
            {
            pushFollow(FollowSets000.FOLLOW_rule__Model__FeaturesAssignment_1_0_in_rule__Model__Group_1__0__Impl1447);
            rule__Model__FeaturesAssignment_1_0();

            state._fsp--;


            }

             after(grammarAccess.getModelAccess().getFeaturesAssignment_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group_1__0__Impl"


    // $ANTLR start "rule__Model__Group_1__1"
    // ../dk.itu.bddcontracts.ui/src-gen/dk/itu/bddcontracts/ui/contentassist/antlr/internal/InternalGherkin.g:715:1: rule__Model__Group_1__1 : rule__Model__Group_1__1__Impl ;
    public final void rule__Model__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.bddcontracts.ui/src-gen/dk/itu/bddcontracts/ui/contentassist/antlr/internal/InternalGherkin.g:719:1: ( rule__Model__Group_1__1__Impl )
            // ../dk.itu.bddcontracts.ui/src-gen/dk/itu/bddcontracts/ui/contentassist/antlr/internal/InternalGherkin.g:720:2: rule__Model__Group_1__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Model__Group_1__1__Impl_in_rule__Model__Group_1__11477);
            rule__Model__Group_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group_1__1"


    // $ANTLR start "rule__Model__Group_1__1__Impl"
    // ../dk.itu.bddcontracts.ui/src-gen/dk/itu/bddcontracts/ui/contentassist/antlr/internal/InternalGherkin.g:726:1: rule__Model__Group_1__1__Impl : ( ( rule__Model__FeaturesAssignment_1_1 )* ) ;
    public final void rule__Model__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.bddcontracts.ui/src-gen/dk/itu/bddcontracts/ui/contentassist/antlr/internal/InternalGherkin.g:730:1: ( ( ( rule__Model__FeaturesAssignment_1_1 )* ) )
            // ../dk.itu.bddcontracts.ui/src-gen/dk/itu/bddcontracts/ui/contentassist/antlr/internal/InternalGherkin.g:731:1: ( ( rule__Model__FeaturesAssignment_1_1 )* )
            {
            // ../dk.itu.bddcontracts.ui/src-gen/dk/itu/bddcontracts/ui/contentassist/antlr/internal/InternalGherkin.g:731:1: ( ( rule__Model__FeaturesAssignment_1_1 )* )
            // ../dk.itu.bddcontracts.ui/src-gen/dk/itu/bddcontracts/ui/contentassist/antlr/internal/InternalGherkin.g:732:1: ( rule__Model__FeaturesAssignment_1_1 )*
            {
             before(grammarAccess.getModelAccess().getFeaturesAssignment_1_1()); 
            // ../dk.itu.bddcontracts.ui/src-gen/dk/itu/bddcontracts/ui/contentassist/antlr/internal/InternalGherkin.g:733:1: ( rule__Model__FeaturesAssignment_1_1 )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==11) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // ../dk.itu.bddcontracts.ui/src-gen/dk/itu/bddcontracts/ui/contentassist/antlr/internal/InternalGherkin.g:733:2: rule__Model__FeaturesAssignment_1_1
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__Model__FeaturesAssignment_1_1_in_rule__Model__Group_1__1__Impl1504);
            	    rule__Model__FeaturesAssignment_1_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

             after(grammarAccess.getModelAccess().getFeaturesAssignment_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group_1__1__Impl"


    // $ANTLR start "rule__Feature__Group__0"
    // ../dk.itu.bddcontracts.ui/src-gen/dk/itu/bddcontracts/ui/contentassist/antlr/internal/InternalGherkin.g:747:1: rule__Feature__Group__0 : rule__Feature__Group__0__Impl rule__Feature__Group__1 ;
    public final void rule__Feature__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.bddcontracts.ui/src-gen/dk/itu/bddcontracts/ui/contentassist/antlr/internal/InternalGherkin.g:751:1: ( rule__Feature__Group__0__Impl rule__Feature__Group__1 )
            // ../dk.itu.bddcontracts.ui/src-gen/dk/itu/bddcontracts/ui/contentassist/antlr/internal/InternalGherkin.g:752:2: rule__Feature__Group__0__Impl rule__Feature__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Feature__Group__0__Impl_in_rule__Feature__Group__01539);
            rule__Feature__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Feature__Group__1_in_rule__Feature__Group__01542);
            rule__Feature__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Feature__Group__0"


    // $ANTLR start "rule__Feature__Group__0__Impl"
    // ../dk.itu.bddcontracts.ui/src-gen/dk/itu/bddcontracts/ui/contentassist/antlr/internal/InternalGherkin.g:759:1: rule__Feature__Group__0__Impl : ( 'Feature:' ) ;
    public final void rule__Feature__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.bddcontracts.ui/src-gen/dk/itu/bddcontracts/ui/contentassist/antlr/internal/InternalGherkin.g:763:1: ( ( 'Feature:' ) )
            // ../dk.itu.bddcontracts.ui/src-gen/dk/itu/bddcontracts/ui/contentassist/antlr/internal/InternalGherkin.g:764:1: ( 'Feature:' )
            {
            // ../dk.itu.bddcontracts.ui/src-gen/dk/itu/bddcontracts/ui/contentassist/antlr/internal/InternalGherkin.g:764:1: ( 'Feature:' )
            // ../dk.itu.bddcontracts.ui/src-gen/dk/itu/bddcontracts/ui/contentassist/antlr/internal/InternalGherkin.g:765:1: 'Feature:'
            {
             before(grammarAccess.getFeatureAccess().getFeatureKeyword_0()); 
            match(input,11,FollowSets000.FOLLOW_11_in_rule__Feature__Group__0__Impl1570); 
             after(grammarAccess.getFeatureAccess().getFeatureKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Feature__Group__0__Impl"


    // $ANTLR start "rule__Feature__Group__1"
    // ../dk.itu.bddcontracts.ui/src-gen/dk/itu/bddcontracts/ui/contentassist/antlr/internal/InternalGherkin.g:778:1: rule__Feature__Group__1 : rule__Feature__Group__1__Impl rule__Feature__Group__2 ;
    public final void rule__Feature__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.bddcontracts.ui/src-gen/dk/itu/bddcontracts/ui/contentassist/antlr/internal/InternalGherkin.g:782:1: ( rule__Feature__Group__1__Impl rule__Feature__Group__2 )
            // ../dk.itu.bddcontracts.ui/src-gen/dk/itu/bddcontracts/ui/contentassist/antlr/internal/InternalGherkin.g:783:2: rule__Feature__Group__1__Impl rule__Feature__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Feature__Group__1__Impl_in_rule__Feature__Group__11601);
            rule__Feature__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Feature__Group__2_in_rule__Feature__Group__11604);
            rule__Feature__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Feature__Group__1"


    // $ANTLR start "rule__Feature__Group__1__Impl"
    // ../dk.itu.bddcontracts.ui/src-gen/dk/itu/bddcontracts/ui/contentassist/antlr/internal/InternalGherkin.g:790:1: rule__Feature__Group__1__Impl : ( ( rule__Feature__DescriptionAssignment_1 ) ) ;
    public final void rule__Feature__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.bddcontracts.ui/src-gen/dk/itu/bddcontracts/ui/contentassist/antlr/internal/InternalGherkin.g:794:1: ( ( ( rule__Feature__DescriptionAssignment_1 ) ) )
            // ../dk.itu.bddcontracts.ui/src-gen/dk/itu/bddcontracts/ui/contentassist/antlr/internal/InternalGherkin.g:795:1: ( ( rule__Feature__DescriptionAssignment_1 ) )
            {
            // ../dk.itu.bddcontracts.ui/src-gen/dk/itu/bddcontracts/ui/contentassist/antlr/internal/InternalGherkin.g:795:1: ( ( rule__Feature__DescriptionAssignment_1 ) )
            // ../dk.itu.bddcontracts.ui/src-gen/dk/itu/bddcontracts/ui/contentassist/antlr/internal/InternalGherkin.g:796:1: ( rule__Feature__DescriptionAssignment_1 )
            {
             before(grammarAccess.getFeatureAccess().getDescriptionAssignment_1()); 
            // ../dk.itu.bddcontracts.ui/src-gen/dk/itu/bddcontracts/ui/contentassist/antlr/internal/InternalGherkin.g:797:1: ( rule__Feature__DescriptionAssignment_1 )
            // ../dk.itu.bddcontracts.ui/src-gen/dk/itu/bddcontracts/ui/contentassist/antlr/internal/InternalGherkin.g:797:2: rule__Feature__DescriptionAssignment_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Feature__DescriptionAssignment_1_in_rule__Feature__Group__1__Impl1631);
            rule__Feature__DescriptionAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getFeatureAccess().getDescriptionAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Feature__Group__1__Impl"


    // $ANTLR start "rule__Feature__Group__2"
    // ../dk.itu.bddcontracts.ui/src-gen/dk/itu/bddcontracts/ui/contentassist/antlr/internal/InternalGherkin.g:807:1: rule__Feature__Group__2 : rule__Feature__Group__2__Impl rule__Feature__Group__3 ;
    public final void rule__Feature__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.bddcontracts.ui/src-gen/dk/itu/bddcontracts/ui/contentassist/antlr/internal/InternalGherkin.g:811:1: ( rule__Feature__Group__2__Impl rule__Feature__Group__3 )
            // ../dk.itu.bddcontracts.ui/src-gen/dk/itu/bddcontracts/ui/contentassist/antlr/internal/InternalGherkin.g:812:2: rule__Feature__Group__2__Impl rule__Feature__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__Feature__Group__2__Impl_in_rule__Feature__Group__21661);
            rule__Feature__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Feature__Group__3_in_rule__Feature__Group__21664);
            rule__Feature__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Feature__Group__2"


    // $ANTLR start "rule__Feature__Group__2__Impl"
    // ../dk.itu.bddcontracts.ui/src-gen/dk/itu/bddcontracts/ui/contentassist/antlr/internal/InternalGherkin.g:819:1: rule__Feature__Group__2__Impl : ( ( rule__Feature__SummaryAssignment_2 )? ) ;
    public final void rule__Feature__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.bddcontracts.ui/src-gen/dk/itu/bddcontracts/ui/contentassist/antlr/internal/InternalGherkin.g:823:1: ( ( ( rule__Feature__SummaryAssignment_2 )? ) )
            // ../dk.itu.bddcontracts.ui/src-gen/dk/itu/bddcontracts/ui/contentassist/antlr/internal/InternalGherkin.g:824:1: ( ( rule__Feature__SummaryAssignment_2 )? )
            {
            // ../dk.itu.bddcontracts.ui/src-gen/dk/itu/bddcontracts/ui/contentassist/antlr/internal/InternalGherkin.g:824:1: ( ( rule__Feature__SummaryAssignment_2 )? )
            // ../dk.itu.bddcontracts.ui/src-gen/dk/itu/bddcontracts/ui/contentassist/antlr/internal/InternalGherkin.g:825:1: ( rule__Feature__SummaryAssignment_2 )?
            {
             before(grammarAccess.getFeatureAccess().getSummaryAssignment_2()); 
            // ../dk.itu.bddcontracts.ui/src-gen/dk/itu/bddcontracts/ui/contentassist/antlr/internal/InternalGherkin.g:826:1: ( rule__Feature__SummaryAssignment_2 )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( ((LA8_0>=RULE_STRING && LA8_0<=RULE_ANY_OTHER)) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // ../dk.itu.bddcontracts.ui/src-gen/dk/itu/bddcontracts/ui/contentassist/antlr/internal/InternalGherkin.g:826:2: rule__Feature__SummaryAssignment_2
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__Feature__SummaryAssignment_2_in_rule__Feature__Group__2__Impl1691);
                    rule__Feature__SummaryAssignment_2();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getFeatureAccess().getSummaryAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Feature__Group__2__Impl"


    // $ANTLR start "rule__Feature__Group__3"
    // ../dk.itu.bddcontracts.ui/src-gen/dk/itu/bddcontracts/ui/contentassist/antlr/internal/InternalGherkin.g:836:1: rule__Feature__Group__3 : rule__Feature__Group__3__Impl rule__Feature__Group__4 ;
    public final void rule__Feature__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.bddcontracts.ui/src-gen/dk/itu/bddcontracts/ui/contentassist/antlr/internal/InternalGherkin.g:840:1: ( rule__Feature__Group__3__Impl rule__Feature__Group__4 )
            // ../dk.itu.bddcontracts.ui/src-gen/dk/itu/bddcontracts/ui/contentassist/antlr/internal/InternalGherkin.g:841:2: rule__Feature__Group__3__Impl rule__Feature__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__Feature__Group__3__Impl_in_rule__Feature__Group__31722);
            rule__Feature__Group__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Feature__Group__4_in_rule__Feature__Group__31725);
            rule__Feature__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Feature__Group__3"


    // $ANTLR start "rule__Feature__Group__3__Impl"
    // ../dk.itu.bddcontracts.ui/src-gen/dk/itu/bddcontracts/ui/contentassist/antlr/internal/InternalGherkin.g:848:1: rule__Feature__Group__3__Impl : ( ( rule__Feature__BackgroundAssignment_3 )? ) ;
    public final void rule__Feature__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.bddcontracts.ui/src-gen/dk/itu/bddcontracts/ui/contentassist/antlr/internal/InternalGherkin.g:852:1: ( ( ( rule__Feature__BackgroundAssignment_3 )? ) )
            // ../dk.itu.bddcontracts.ui/src-gen/dk/itu/bddcontracts/ui/contentassist/antlr/internal/InternalGherkin.g:853:1: ( ( rule__Feature__BackgroundAssignment_3 )? )
            {
            // ../dk.itu.bddcontracts.ui/src-gen/dk/itu/bddcontracts/ui/contentassist/antlr/internal/InternalGherkin.g:853:1: ( ( rule__Feature__BackgroundAssignment_3 )? )
            // ../dk.itu.bddcontracts.ui/src-gen/dk/itu/bddcontracts/ui/contentassist/antlr/internal/InternalGherkin.g:854:1: ( rule__Feature__BackgroundAssignment_3 )?
            {
             before(grammarAccess.getFeatureAccess().getBackgroundAssignment_3()); 
            // ../dk.itu.bddcontracts.ui/src-gen/dk/itu/bddcontracts/ui/contentassist/antlr/internal/InternalGherkin.g:855:1: ( rule__Feature__BackgroundAssignment_3 )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==12) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // ../dk.itu.bddcontracts.ui/src-gen/dk/itu/bddcontracts/ui/contentassist/antlr/internal/InternalGherkin.g:855:2: rule__Feature__BackgroundAssignment_3
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__Feature__BackgroundAssignment_3_in_rule__Feature__Group__3__Impl1752);
                    rule__Feature__BackgroundAssignment_3();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getFeatureAccess().getBackgroundAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Feature__Group__3__Impl"


    // $ANTLR start "rule__Feature__Group__4"
    // ../dk.itu.bddcontracts.ui/src-gen/dk/itu/bddcontracts/ui/contentassist/antlr/internal/InternalGherkin.g:865:1: rule__Feature__Group__4 : rule__Feature__Group__4__Impl rule__Feature__Group__5 ;
    public final void rule__Feature__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.bddcontracts.ui/src-gen/dk/itu/bddcontracts/ui/contentassist/antlr/internal/InternalGherkin.g:869:1: ( rule__Feature__Group__4__Impl rule__Feature__Group__5 )
            // ../dk.itu.bddcontracts.ui/src-gen/dk/itu/bddcontracts/ui/contentassist/antlr/internal/InternalGherkin.g:870:2: rule__Feature__Group__4__Impl rule__Feature__Group__5
            {
            pushFollow(FollowSets000.FOLLOW_rule__Feature__Group__4__Impl_in_rule__Feature__Group__41783);
            rule__Feature__Group__4__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Feature__Group__5_in_rule__Feature__Group__41786);
            rule__Feature__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Feature__Group__4"


    // $ANTLR start "rule__Feature__Group__4__Impl"
    // ../dk.itu.bddcontracts.ui/src-gen/dk/itu/bddcontracts/ui/contentassist/antlr/internal/InternalGherkin.g:877:1: rule__Feature__Group__4__Impl : ( ( rule__Feature__Group_4__0 )? ) ;
    public final void rule__Feature__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.bddcontracts.ui/src-gen/dk/itu/bddcontracts/ui/contentassist/antlr/internal/InternalGherkin.g:881:1: ( ( ( rule__Feature__Group_4__0 )? ) )
            // ../dk.itu.bddcontracts.ui/src-gen/dk/itu/bddcontracts/ui/contentassist/antlr/internal/InternalGherkin.g:882:1: ( ( rule__Feature__Group_4__0 )? )
            {
            // ../dk.itu.bddcontracts.ui/src-gen/dk/itu/bddcontracts/ui/contentassist/antlr/internal/InternalGherkin.g:882:1: ( ( rule__Feature__Group_4__0 )? )
            // ../dk.itu.bddcontracts.ui/src-gen/dk/itu/bddcontracts/ui/contentassist/antlr/internal/InternalGherkin.g:883:1: ( rule__Feature__Group_4__0 )?
            {
             before(grammarAccess.getFeatureAccess().getGroup_4()); 
            // ../dk.itu.bddcontracts.ui/src-gen/dk/itu/bddcontracts/ui/contentassist/antlr/internal/InternalGherkin.g:884:1: ( rule__Feature__Group_4__0 )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==18||LA10_0==21) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // ../dk.itu.bddcontracts.ui/src-gen/dk/itu/bddcontracts/ui/contentassist/antlr/internal/InternalGherkin.g:884:2: rule__Feature__Group_4__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__Feature__Group_4__0_in_rule__Feature__Group__4__Impl1813);
                    rule__Feature__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getFeatureAccess().getGroup_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Feature__Group__4__Impl"


    // $ANTLR start "rule__Feature__Group__5"
    // ../dk.itu.bddcontracts.ui/src-gen/dk/itu/bddcontracts/ui/contentassist/antlr/internal/InternalGherkin.g:894:1: rule__Feature__Group__5 : rule__Feature__Group__5__Impl ;
    public final void rule__Feature__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.bddcontracts.ui/src-gen/dk/itu/bddcontracts/ui/contentassist/antlr/internal/InternalGherkin.g:898:1: ( rule__Feature__Group__5__Impl )
            // ../dk.itu.bddcontracts.ui/src-gen/dk/itu/bddcontracts/ui/contentassist/antlr/internal/InternalGherkin.g:899:2: rule__Feature__Group__5__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Feature__Group__5__Impl_in_rule__Feature__Group__51844);
            rule__Feature__Group__5__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Feature__Group__5"


    // $ANTLR start "rule__Feature__Group__5__Impl"
    // ../dk.itu.bddcontracts.ui/src-gen/dk/itu/bddcontracts/ui/contentassist/antlr/internal/InternalGherkin.g:905:1: rule__Feature__Group__5__Impl : ( ( rule__Feature__Group_5__0 )? ) ;
    public final void rule__Feature__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.bddcontracts.ui/src-gen/dk/itu/bddcontracts/ui/contentassist/antlr/internal/InternalGherkin.g:909:1: ( ( ( rule__Feature__Group_5__0 )? ) )
            // ../dk.itu.bddcontracts.ui/src-gen/dk/itu/bddcontracts/ui/contentassist/antlr/internal/InternalGherkin.g:910:1: ( ( rule__Feature__Group_5__0 )? )
            {
            // ../dk.itu.bddcontracts.ui/src-gen/dk/itu/bddcontracts/ui/contentassist/antlr/internal/InternalGherkin.g:910:1: ( ( rule__Feature__Group_5__0 )? )
            // ../dk.itu.bddcontracts.ui/src-gen/dk/itu/bddcontracts/ui/contentassist/antlr/internal/InternalGherkin.g:911:1: ( rule__Feature__Group_5__0 )?
            {
             before(grammarAccess.getFeatureAccess().getGroup_5()); 
            // ../dk.itu.bddcontracts.ui/src-gen/dk/itu/bddcontracts/ui/contentassist/antlr/internal/InternalGherkin.g:912:1: ( rule__Feature__Group_5__0 )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==15) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // ../dk.itu.bddcontracts.ui/src-gen/dk/itu/bddcontracts/ui/contentassist/antlr/internal/InternalGherkin.g:912:2: rule__Feature__Group_5__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__Feature__Group_5__0_in_rule__Feature__Group__5__Impl1871);
                    rule__Feature__Group_5__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getFeatureAccess().getGroup_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Feature__Group__5__Impl"


    // $ANTLR start "rule__Feature__Group_4__0"
    // ../dk.itu.bddcontracts.ui/src-gen/dk/itu/bddcontracts/ui/contentassist/antlr/internal/InternalGherkin.g:934:1: rule__Feature__Group_4__0 : rule__Feature__Group_4__0__Impl rule__Feature__Group_4__1 ;
    public final void rule__Feature__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.bddcontracts.ui/src-gen/dk/itu/bddcontracts/ui/contentassist/antlr/internal/InternalGherkin.g:938:1: ( rule__Feature__Group_4__0__Impl rule__Feature__Group_4__1 )
            // ../dk.itu.bddcontracts.ui/src-gen/dk/itu/bddcontracts/ui/contentassist/antlr/internal/InternalGherkin.g:939:2: rule__Feature__Group_4__0__Impl rule__Feature__Group_4__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Feature__Group_4__0__Impl_in_rule__Feature__Group_4__01914);
            rule__Feature__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Feature__Group_4__1_in_rule__Feature__Group_4__01917);
            rule__Feature__Group_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Feature__Group_4__0"


    // $ANTLR start "rule__Feature__Group_4__0__Impl"
    // ../dk.itu.bddcontracts.ui/src-gen/dk/itu/bddcontracts/ui/contentassist/antlr/internal/InternalGherkin.g:946:1: rule__Feature__Group_4__0__Impl : ( ( rule__Feature__ScenariosAssignment_4_0 ) ) ;
    public final void rule__Feature__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.bddcontracts.ui/src-gen/dk/itu/bddcontracts/ui/contentassist/antlr/internal/InternalGherkin.g:950:1: ( ( ( rule__Feature__ScenariosAssignment_4_0 ) ) )
            // ../dk.itu.bddcontracts.ui/src-gen/dk/itu/bddcontracts/ui/contentassist/antlr/internal/InternalGherkin.g:951:1: ( ( rule__Feature__ScenariosAssignment_4_0 ) )
            {
            // ../dk.itu.bddcontracts.ui/src-gen/dk/itu/bddcontracts/ui/contentassist/antlr/internal/InternalGherkin.g:951:1: ( ( rule__Feature__ScenariosAssignment_4_0 ) )
            // ../dk.itu.bddcontracts.ui/src-gen/dk/itu/bddcontracts/ui/contentassist/antlr/internal/InternalGherkin.g:952:1: ( rule__Feature__ScenariosAssignment_4_0 )
            {
             before(grammarAccess.getFeatureAccess().getScenariosAssignment_4_0()); 
            // ../dk.itu.bddcontracts.ui/src-gen/dk/itu/bddcontracts/ui/contentassist/antlr/internal/InternalGherkin.g:953:1: ( rule__Feature__ScenariosAssignment_4_0 )
            // ../dk.itu.bddcontracts.ui/src-gen/dk/itu/bddcontracts/ui/contentassist/antlr/internal/InternalGherkin.g:953:2: rule__Feature__ScenariosAssignment_4_0
            {
            pushFollow(FollowSets000.FOLLOW_rule__Feature__ScenariosAssignment_4_0_in_rule__Feature__Group_4__0__Impl1944);
            rule__Feature__ScenariosAssignment_4_0();

            state._fsp--;


            }

             after(grammarAccess.getFeatureAccess().getScenariosAssignment_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Feature__Group_4__0__Impl"


    // $ANTLR start "rule__Feature__Group_4__1"
    // ../dk.itu.bddcontracts.ui/src-gen/dk/itu/bddcontracts/ui/contentassist/antlr/internal/InternalGherkin.g:963:1: rule__Feature__Group_4__1 : rule__Feature__Group_4__1__Impl ;
    public final void rule__Feature__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.bddcontracts.ui/src-gen/dk/itu/bddcontracts/ui/contentassist/antlr/internal/InternalGherkin.g:967:1: ( rule__Feature__Group_4__1__Impl )
            // ../dk.itu.bddcontracts.ui/src-gen/dk/itu/bddcontracts/ui/contentassist/antlr/internal/InternalGherkin.g:968:2: rule__Feature__Group_4__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Feature__Group_4__1__Impl_in_rule__Feature__Group_4__11974);
            rule__Feature__Group_4__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Feature__Group_4__1"


    // $ANTLR start "rule__Feature__Group_4__1__Impl"
    // ../dk.itu.bddcontracts.ui/src-gen/dk/itu/bddcontracts/ui/contentassist/antlr/internal/InternalGherkin.g:974:1: rule__Feature__Group_4__1__Impl : ( ( rule__Feature__ScenariosAssignment_4_1 )* ) ;
    public final void rule__Feature__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.bddcontracts.ui/src-gen/dk/itu/bddcontracts/ui/contentassist/antlr/internal/InternalGherkin.g:978:1: ( ( ( rule__Feature__ScenariosAssignment_4_1 )* ) )
            // ../dk.itu.bddcontracts.ui/src-gen/dk/itu/bddcontracts/ui/contentassist/antlr/internal/InternalGherkin.g:979:1: ( ( rule__Feature__ScenariosAssignment_4_1 )* )
            {
            // ../dk.itu.bddcontracts.ui/src-gen/dk/itu/bddcontracts/ui/contentassist/antlr/internal/InternalGherkin.g:979:1: ( ( rule__Feature__ScenariosAssignment_4_1 )* )
            // ../dk.itu.bddcontracts.ui/src-gen/dk/itu/bddcontracts/ui/contentassist/antlr/internal/InternalGherkin.g:980:1: ( rule__Feature__ScenariosAssignment_4_1 )*
            {
             before(grammarAccess.getFeatureAccess().getScenariosAssignment_4_1()); 
            // ../dk.itu.bddcontracts.ui/src-gen/dk/itu/bddcontracts/ui/contentassist/antlr/internal/InternalGherkin.g:981:1: ( rule__Feature__ScenariosAssignment_4_1 )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==18||LA12_0==21) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // ../dk.itu.bddcontracts.ui/src-gen/dk/itu/bddcontracts/ui/contentassist/antlr/internal/InternalGherkin.g:981:2: rule__Feature__ScenariosAssignment_4_1
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__Feature__ScenariosAssignment_4_1_in_rule__Feature__Group_4__1__Impl2001);
            	    rule__Feature__ScenariosAssignment_4_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);

             after(grammarAccess.getFeatureAccess().getScenariosAssignment_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Feature__Group_4__1__Impl"


    // $ANTLR start "rule__Feature__Group_5__0"
    // ../dk.itu.bddcontracts.ui/src-gen/dk/itu/bddcontracts/ui/contentassist/antlr/internal/InternalGherkin.g:995:1: rule__Feature__Group_5__0 : rule__Feature__Group_5__0__Impl rule__Feature__Group_5__1 ;
    public final void rule__Feature__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.bddcontracts.ui/src-gen/dk/itu/bddcontracts/ui/contentassist/antlr/internal/InternalGherkin.g:999:1: ( rule__Feature__Group_5__0__Impl rule__Feature__Group_5__1 )
            // ../dk.itu.bddcontracts.ui/src-gen/dk/itu/bddcontracts/ui/contentassist/antlr/internal/InternalGherkin.g:1000:2: rule__Feature__Group_5__0__Impl rule__Feature__Group_5__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Feature__Group_5__0__Impl_in_rule__Feature__Group_5__02036);
            rule__Feature__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Feature__Group_5__1_in_rule__Feature__Group_5__02039);
            rule__Feature__Group_5__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Feature__Group_5__0"


    // $ANTLR start "rule__Feature__Group_5__0__Impl"
    // ../dk.itu.bddcontracts.ui/src-gen/dk/itu/bddcontracts/ui/contentassist/antlr/internal/InternalGherkin.g:1007:1: rule__Feature__Group_5__0__Impl : ( ( rule__Feature__BehaviorsAssignment_5_0 ) ) ;
    public final void rule__Feature__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.bddcontracts.ui/src-gen/dk/itu/bddcontracts/ui/contentassist/antlr/internal/InternalGherkin.g:1011:1: ( ( ( rule__Feature__BehaviorsAssignment_5_0 ) ) )
            // ../dk.itu.bddcontracts.ui/src-gen/dk/itu/bddcontracts/ui/contentassist/antlr/internal/InternalGherkin.g:1012:1: ( ( rule__Feature__BehaviorsAssignment_5_0 ) )
            {
            // ../dk.itu.bddcontracts.ui/src-gen/dk/itu/bddcontracts/ui/contentassist/antlr/internal/InternalGherkin.g:1012:1: ( ( rule__Feature__BehaviorsAssignment_5_0 ) )
            // ../dk.itu.bddcontracts.ui/src-gen/dk/itu/bddcontracts/ui/contentassist/antlr/internal/InternalGherkin.g:1013:1: ( rule__Feature__BehaviorsAssignment_5_0 )
            {
             before(grammarAccess.getFeatureAccess().getBehaviorsAssignment_5_0()); 
            // ../dk.itu.bddcontracts.ui/src-gen/dk/itu/bddcontracts/ui/contentassist/antlr/internal/InternalGherkin.g:1014:1: ( rule__Feature__BehaviorsAssignment_5_0 )
            // ../dk.itu.bddcontracts.ui/src-gen/dk/itu/bddcontracts/ui/contentassist/antlr/internal/InternalGherkin.g:1014:2: rule__Feature__BehaviorsAssignment_5_0
            {
            pushFollow(FollowSets000.FOLLOW_rule__Feature__BehaviorsAssignment_5_0_in_rule__Feature__Group_5__0__Impl2066);
            rule__Feature__BehaviorsAssignment_5_0();

            state._fsp--;


            }

             after(grammarAccess.getFeatureAccess().getBehaviorsAssignment_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Feature__Group_5__0__Impl"


    // $ANTLR start "rule__Feature__Group_5__1"
    // ../dk.itu.bddcontracts.ui/src-gen/dk/itu/bddcontracts/ui/contentassist/antlr/internal/InternalGherkin.g:1024:1: rule__Feature__Group_5__1 : rule__Feature__Group_5__1__Impl ;
    public final void rule__Feature__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.bddcontracts.ui/src-gen/dk/itu/bddcontracts/ui/contentassist/antlr/internal/InternalGherkin.g:1028:1: ( rule__Feature__Group_5__1__Impl )
            // ../dk.itu.bddcontracts.ui/src-gen/dk/itu/bddcontracts/ui/contentassist/antlr/internal/InternalGherkin.g:1029:2: rule__Feature__Group_5__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Feature__Group_5__1__Impl_in_rule__Feature__Group_5__12096);
            rule__Feature__Group_5__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Feature__Group_5__1"


    // $ANTLR start "rule__Feature__Group_5__1__Impl"
    // ../dk.itu.bddcontracts.ui/src-gen/dk/itu/bddcontracts/ui/contentassist/antlr/internal/InternalGherkin.g:1035:1: rule__Feature__Group_5__1__Impl : ( ( rule__Feature__BehaviorsAssignment_5_1 )* ) ;
    public final void rule__Feature__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.bddcontracts.ui/src-gen/dk/itu/bddcontracts/ui/contentassist/antlr/internal/InternalGherkin.g:1039:1: ( ( ( rule__Feature__BehaviorsAssignment_5_1 )* ) )
            // ../dk.itu.bddcontracts.ui/src-gen/dk/itu/bddcontracts/ui/contentassist/antlr/internal/InternalGherkin.g:1040:1: ( ( rule__Feature__BehaviorsAssignment_5_1 )* )
            {
            // ../dk.itu.bddcontracts.ui/src-gen/dk/itu/bddcontracts/ui/contentassist/antlr/internal/InternalGherkin.g:1040:1: ( ( rule__Feature__BehaviorsAssignment_5_1 )* )
            // ../dk.itu.bddcontracts.ui/src-gen/dk/itu/bddcontracts/ui/contentassist/antlr/internal/InternalGherkin.g:1041:1: ( rule__Feature__BehaviorsAssignment_5_1 )*
            {
             before(grammarAccess.getFeatureAccess().getBehaviorsAssignment_5_1()); 
            // ../dk.itu.bddcontracts.ui/src-gen/dk/itu/bddcontracts/ui/contentassist/antlr/internal/InternalGherkin.g:1042:1: ( rule__Feature__BehaviorsAssignment_5_1 )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==15) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // ../dk.itu.bddcontracts.ui/src-gen/dk/itu/bddcontracts/ui/contentassist/antlr/internal/InternalGherkin.g:1042:2: rule__Feature__BehaviorsAssignment_5_1
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__Feature__BehaviorsAssignment_5_1_in_rule__Feature__Group_5__1__Impl2123);
            	    rule__Feature__BehaviorsAssignment_5_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop13;
                }
            } while (true);

             after(grammarAccess.getFeatureAccess().getBehaviorsAssignment_5_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Feature__Group_5__1__Impl"


    // $ANTLR start "rule__Background__Group__0"
    // ../dk.itu.bddcontracts.ui/src-gen/dk/itu/bddcontracts/ui/contentassist/antlr/internal/InternalGherkin.g:1056:1: rule__Background__Group__0 : rule__Background__Group__0__Impl rule__Background__Group__1 ;
    public final void rule__Background__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.bddcontracts.ui/src-gen/dk/itu/bddcontracts/ui/contentassist/antlr/internal/InternalGherkin.g:1060:1: ( rule__Background__Group__0__Impl rule__Background__Group__1 )
            // ../dk.itu.bddcontracts.ui/src-gen/dk/itu/bddcontracts/ui/contentassist/antlr/internal/InternalGherkin.g:1061:2: rule__Background__Group__0__Impl rule__Background__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Background__Group__0__Impl_in_rule__Background__Group__02158);
            rule__Background__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Background__Group__1_in_rule__Background__Group__02161);
            rule__Background__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Background__Group__0"


    // $ANTLR start "rule__Background__Group__0__Impl"
    // ../dk.itu.bddcontracts.ui/src-gen/dk/itu/bddcontracts/ui/contentassist/antlr/internal/InternalGherkin.g:1068:1: rule__Background__Group__0__Impl : ( 'Background:' ) ;
    public final void rule__Background__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.bddcontracts.ui/src-gen/dk/itu/bddcontracts/ui/contentassist/antlr/internal/InternalGherkin.g:1072:1: ( ( 'Background:' ) )
            // ../dk.itu.bddcontracts.ui/src-gen/dk/itu/bddcontracts/ui/contentassist/antlr/internal/InternalGherkin.g:1073:1: ( 'Background:' )
            {
            // ../dk.itu.bddcontracts.ui/src-gen/dk/itu/bddcontracts/ui/contentassist/antlr/internal/InternalGherkin.g:1073:1: ( 'Background:' )
            // ../dk.itu.bddcontracts.ui/src-gen/dk/itu/bddcontracts/ui/contentassist/antlr/internal/InternalGherkin.g:1074:1: 'Background:'
            {
             before(grammarAccess.getBackgroundAccess().getBackgroundKeyword_0()); 
            match(input,12,FollowSets000.FOLLOW_12_in_rule__Background__Group__0__Impl2189); 
             after(grammarAccess.getBackgroundAccess().getBackgroundKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Background__Group__0__Impl"


    // $ANTLR start "rule__Background__Group__1"
    // ../dk.itu.bddcontracts.ui/src-gen/dk/itu/bddcontracts/ui/contentassist/antlr/internal/InternalGherkin.g:1087:1: rule__Background__Group__1 : rule__Background__Group__1__Impl rule__Background__Group__2 ;
    public final void rule__Background__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.bddcontracts.ui/src-gen/dk/itu/bddcontracts/ui/contentassist/antlr/internal/InternalGherkin.g:1091:1: ( rule__Background__Group__1__Impl rule__Background__Group__2 )
            // ../dk.itu.bddcontracts.ui/src-gen/dk/itu/bddcontracts/ui/contentassist/antlr/internal/InternalGherkin.g:1092:2: rule__Background__Group__1__Impl rule__Background__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Background__Group__1__Impl_in_rule__Background__Group__12220);
            rule__Background__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Background__Group__2_in_rule__Background__Group__12223);
            rule__Background__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Background__Group__1"


    // $ANTLR start "rule__Background__Group__1__Impl"
    // ../dk.itu.bddcontracts.ui/src-gen/dk/itu/bddcontracts/ui/contentassist/antlr/internal/InternalGherkin.g:1099:1: rule__Background__Group__1__Impl : ( 'Given' ) ;
    public final void rule__Background__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.bddcontracts.ui/src-gen/dk/itu/bddcontracts/ui/contentassist/antlr/internal/InternalGherkin.g:1103:1: ( ( 'Given' ) )
            // ../dk.itu.bddcontracts.ui/src-gen/dk/itu/bddcontracts/ui/contentassist/antlr/internal/InternalGherkin.g:1104:1: ( 'Given' )
            {
            // ../dk.itu.bddcontracts.ui/src-gen/dk/itu/bddcontracts/ui/contentassist/antlr/internal/InternalGherkin.g:1104:1: ( 'Given' )
            // ../dk.itu.bddcontracts.ui/src-gen/dk/itu/bddcontracts/ui/contentassist/antlr/internal/InternalGherkin.g:1105:1: 'Given'
            {
             before(grammarAccess.getBackgroundAccess().getGivenKeyword_1()); 
            match(input,13,FollowSets000.FOLLOW_13_in_rule__Background__Group__1__Impl2251); 
             after(grammarAccess.getBackgroundAccess().getGivenKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Background__Group__1__Impl"


    // $ANTLR start "rule__Background__Group__2"
    // ../dk.itu.bddcontracts.ui/src-gen/dk/itu/bddcontracts/ui/contentassist/antlr/internal/InternalGherkin.g:1118:1: rule__Background__Group__2 : rule__Background__Group__2__Impl rule__Background__Group__3 ;
    public final void rule__Background__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.bddcontracts.ui/src-gen/dk/itu/bddcontracts/ui/contentassist/antlr/internal/InternalGherkin.g:1122:1: ( rule__Background__Group__2__Impl rule__Background__Group__3 )
            // ../dk.itu.bddcontracts.ui/src-gen/dk/itu/bddcontracts/ui/contentassist/antlr/internal/InternalGherkin.g:1123:2: rule__Background__Group__2__Impl rule__Background__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__Background__Group__2__Impl_in_rule__Background__Group__22282);
            rule__Background__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Background__Group__3_in_rule__Background__Group__22285);
            rule__Background__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Background__Group__2"


    // $ANTLR start "rule__Background__Group__2__Impl"
    // ../dk.itu.bddcontracts.ui/src-gen/dk/itu/bddcontracts/ui/contentassist/antlr/internal/InternalGherkin.g:1130:1: rule__Background__Group__2__Impl : ( ( rule__Background__GivenBlocksAssignment_2 ) ) ;
    public final void rule__Background__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.bddcontracts.ui/src-gen/dk/itu/bddcontracts/ui/contentassist/antlr/internal/InternalGherkin.g:1134:1: ( ( ( rule__Background__GivenBlocksAssignment_2 ) ) )
            // ../dk.itu.bddcontracts.ui/src-gen/dk/itu/bddcontracts/ui/contentassist/antlr/internal/InternalGherkin.g:1135:1: ( ( rule__Background__GivenBlocksAssignment_2 ) )
            {
            // ../dk.itu.bddcontracts.ui/src-gen/dk/itu/bddcontracts/ui/contentassist/antlr/internal/InternalGherkin.g:1135:1: ( ( rule__Background__GivenBlocksAssignment_2 ) )
            // ../dk.itu.bddcontracts.ui/src-gen/dk/itu/bddcontracts/ui/contentassist/antlr/internal/InternalGherkin.g:1136:1: ( rule__Background__GivenBlocksAssignment_2 )
            {
             before(grammarAccess.getBackgroundAccess().getGivenBlocksAssignment_2()); 
            // ../dk.itu.bddcontracts.ui/src-gen/dk/itu/bddcontracts/ui/contentassist/antlr/internal/InternalGherkin.g:1137:1: ( rule__Background__GivenBlocksAssignment_2 )
            // ../dk.itu.bddcontracts.ui/src-gen/dk/itu/bddcontracts/ui/contentassist/antlr/internal/InternalGherkin.g:1137:2: rule__Background__GivenBlocksAssignment_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Background__GivenBlocksAssignment_2_in_rule__Background__Group__2__Impl2312);
            rule__Background__GivenBlocksAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getBackgroundAccess().getGivenBlocksAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Background__Group__2__Impl"


    // $ANTLR start "rule__Background__Group__3"
    // ../dk.itu.bddcontracts.ui/src-gen/dk/itu/bddcontracts/ui/contentassist/antlr/internal/InternalGherkin.g:1147:1: rule__Background__Group__3 : rule__Background__Group__3__Impl ;
    public final void rule__Background__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.bddcontracts.ui/src-gen/dk/itu/bddcontracts/ui/contentassist/antlr/internal/InternalGherkin.g:1151:1: ( rule__Background__Group__3__Impl )
            // ../dk.itu.bddcontracts.ui/src-gen/dk/itu/bddcontracts/ui/contentassist/antlr/internal/InternalGherkin.g:1152:2: rule__Background__Group__3__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Background__Group__3__Impl_in_rule__Background__Group__32342);
            rule__Background__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Background__Group__3"


    // $ANTLR start "rule__Background__Group__3__Impl"
    // ../dk.itu.bddcontracts.ui/src-gen/dk/itu/bddcontracts/ui/contentassist/antlr/internal/InternalGherkin.g:1158:1: rule__Background__Group__3__Impl : ( ( rule__Background__Group_3__0 )* ) ;
    public final void rule__Background__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.bddcontracts.ui/src-gen/dk/itu/bddcontracts/ui/contentassist/antlr/internal/InternalGherkin.g:1162:1: ( ( ( rule__Background__Group_3__0 )* ) )
            // ../dk.itu.bddcontracts.ui/src-gen/dk/itu/bddcontracts/ui/contentassist/antlr/internal/InternalGherkin.g:1163:1: ( ( rule__Background__Group_3__0 )* )
            {
            // ../dk.itu.bddcontracts.ui/src-gen/dk/itu/bddcontracts/ui/contentassist/antlr/internal/InternalGherkin.g:1163:1: ( ( rule__Background__Group_3__0 )* )
            // ../dk.itu.bddcontracts.ui/src-gen/dk/itu/bddcontracts/ui/contentassist/antlr/internal/InternalGherkin.g:1164:1: ( rule__Background__Group_3__0 )*
            {
             before(grammarAccess.getBackgroundAccess().getGroup_3()); 
            // ../dk.itu.bddcontracts.ui/src-gen/dk/itu/bddcontracts/ui/contentassist/antlr/internal/InternalGherkin.g:1165:1: ( rule__Background__Group_3__0 )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==14) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // ../dk.itu.bddcontracts.ui/src-gen/dk/itu/bddcontracts/ui/contentassist/antlr/internal/InternalGherkin.g:1165:2: rule__Background__Group_3__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__Background__Group_3__0_in_rule__Background__Group__3__Impl2369);
            	    rule__Background__Group_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop14;
                }
            } while (true);

             after(grammarAccess.getBackgroundAccess().getGroup_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Background__Group__3__Impl"


    // $ANTLR start "rule__Background__Group_3__0"
    // ../dk.itu.bddcontracts.ui/src-gen/dk/itu/bddcontracts/ui/contentassist/antlr/internal/InternalGherkin.g:1183:1: rule__Background__Group_3__0 : rule__Background__Group_3__0__Impl rule__Background__Group_3__1 ;
    public final void rule__Background__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.bddcontracts.ui/src-gen/dk/itu/bddcontracts/ui/contentassist/antlr/internal/InternalGherkin.g:1187:1: ( rule__Background__Group_3__0__Impl rule__Background__Group_3__1 )
            // ../dk.itu.bddcontracts.ui/src-gen/dk/itu/bddcontracts/ui/contentassist/antlr/internal/InternalGherkin.g:1188:2: rule__Background__Group_3__0__Impl rule__Background__Group_3__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Background__Group_3__0__Impl_in_rule__Background__Group_3__02408);
            rule__Background__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Background__Group_3__1_in_rule__Background__Group_3__02411);
            rule__Background__Group_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Background__Group_3__0"


    // $ANTLR start "rule__Background__Group_3__0__Impl"
    // ../dk.itu.bddcontracts.ui/src-gen/dk/itu/bddcontracts/ui/contentassist/antlr/internal/InternalGherkin.g:1195:1: rule__Background__Group_3__0__Impl : ( 'And' ) ;
    public final void rule__Background__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.bddcontracts.ui/src-gen/dk/itu/bddcontracts/ui/contentassist/antlr/internal/InternalGherkin.g:1199:1: ( ( 'And' ) )
            // ../dk.itu.bddcontracts.ui/src-gen/dk/itu/bddcontracts/ui/contentassist/antlr/internal/InternalGherkin.g:1200:1: ( 'And' )
            {
            // ../dk.itu.bddcontracts.ui/src-gen/dk/itu/bddcontracts/ui/contentassist/antlr/internal/InternalGherkin.g:1200:1: ( 'And' )
            // ../dk.itu.bddcontracts.ui/src-gen/dk/itu/bddcontracts/ui/contentassist/antlr/internal/InternalGherkin.g:1201:1: 'And'
            {
             before(grammarAccess.getBackgroundAccess().getAndKeyword_3_0()); 
            match(input,14,FollowSets000.FOLLOW_14_in_rule__Background__Group_3__0__Impl2439); 
             after(grammarAccess.getBackgroundAccess().getAndKeyword_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Background__Group_3__0__Impl"


    // $ANTLR start "rule__Background__Group_3__1"
    // ../dk.itu.bddcontracts.ui/src-gen/dk/itu/bddcontracts/ui/contentassist/antlr/internal/InternalGherkin.g:1214:1: rule__Background__Group_3__1 : rule__Background__Group_3__1__Impl ;
    public final void rule__Background__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.bddcontracts.ui/src-gen/dk/itu/bddcontracts/ui/contentassist/antlr/internal/InternalGherkin.g:1218:1: ( rule__Background__Group_3__1__Impl )
            // ../dk.itu.bddcontracts.ui/src-gen/dk/itu/bddcontracts/ui/contentassist/antlr/internal/InternalGherkin.g:1219:2: rule__Background__Group_3__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Background__Group_3__1__Impl_in_rule__Background__Group_3__12470);
            rule__Background__Group_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Background__Group_3__1"


    // $ANTLR start "rule__Background__Group_3__1__Impl"
    // ../dk.itu.bddcontracts.ui/src-gen/dk/itu/bddcontracts/ui/contentassist/antlr/internal/InternalGherkin.g:1225:1: rule__Background__Group_3__1__Impl : ( ( rule__Background__GivenBlocksAssignment_3_1 ) ) ;
    public final void rule__Background__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.bddcontracts.ui/src-gen/dk/itu/bddcontracts/ui/contentassist/antlr/internal/InternalGherkin.g:1229:1: ( ( ( rule__Background__GivenBlocksAssignment_3_1 ) ) )
            // ../dk.itu.bddcontracts.ui/src-gen/dk/itu/bddcontracts/ui/contentassist/antlr/internal/InternalGherkin.g:1230:1: ( ( rule__Background__GivenBlocksAssignment_3_1 ) )
            {
            // ../dk.itu.bddcontracts.ui/src-gen/dk/itu/bddcontracts/ui/contentassist/antlr/internal/InternalGherkin.g:1230:1: ( ( rule__Background__GivenBlocksAssignment_3_1 ) )
            // ../dk.itu.bddcontracts.ui/src-gen/dk/itu/bddcontracts/ui/contentassist/antlr/internal/InternalGherkin.g:1231:1: ( rule__Background__GivenBlocksAssignment_3_1 )
            {
             before(grammarAccess.getBackgroundAccess().getGivenBlocksAssignment_3_1()); 
            // ../dk.itu.bddcontracts.ui/src-gen/dk/itu/bddcontracts/ui/contentassist/antlr/internal/InternalGherkin.g:1232:1: ( rule__Background__GivenBlocksAssignment_3_1 )
            // ../dk.itu.bddcontracts.ui/src-gen/dk/itu/bddcontracts/ui/contentassist/antlr/internal/InternalGherkin.g:1232:2: rule__Background__GivenBlocksAssignment_3_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Background__GivenBlocksAssignment_3_1_in_rule__Background__Group_3__1__Impl2497);
            rule__Background__GivenBlocksAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getBackgroundAccess().getGivenBlocksAssignment_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Background__Group_3__1__Impl"


    // $ANTLR start "rule__Behavior__Group__0"
    // ../dk.itu.bddcontracts.ui/src-gen/dk/itu/bddcontracts/ui/contentassist/antlr/internal/InternalGherkin.g:1246:1: rule__Behavior__Group__0 : rule__Behavior__Group__0__Impl rule__Behavior__Group__1 ;
    public final void rule__Behavior__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.bddcontracts.ui/src-gen/dk/itu/bddcontracts/ui/contentassist/antlr/internal/InternalGherkin.g:1250:1: ( rule__Behavior__Group__0__Impl rule__Behavior__Group__1 )
            // ../dk.itu.bddcontracts.ui/src-gen/dk/itu/bddcontracts/ui/contentassist/antlr/internal/InternalGherkin.g:1251:2: rule__Behavior__Group__0__Impl rule__Behavior__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Behavior__Group__0__Impl_in_rule__Behavior__Group__02531);
            rule__Behavior__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Behavior__Group__1_in_rule__Behavior__Group__02534);
            rule__Behavior__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Behavior__Group__0"


    // $ANTLR start "rule__Behavior__Group__0__Impl"
    // ../dk.itu.bddcontracts.ui/src-gen/dk/itu/bddcontracts/ui/contentassist/antlr/internal/InternalGherkin.g:1258:1: rule__Behavior__Group__0__Impl : ( 'Behavior:' ) ;
    public final void rule__Behavior__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.bddcontracts.ui/src-gen/dk/itu/bddcontracts/ui/contentassist/antlr/internal/InternalGherkin.g:1262:1: ( ( 'Behavior:' ) )
            // ../dk.itu.bddcontracts.ui/src-gen/dk/itu/bddcontracts/ui/contentassist/antlr/internal/InternalGherkin.g:1263:1: ( 'Behavior:' )
            {
            // ../dk.itu.bddcontracts.ui/src-gen/dk/itu/bddcontracts/ui/contentassist/antlr/internal/InternalGherkin.g:1263:1: ( 'Behavior:' )
            // ../dk.itu.bddcontracts.ui/src-gen/dk/itu/bddcontracts/ui/contentassist/antlr/internal/InternalGherkin.g:1264:1: 'Behavior:'
            {
             before(grammarAccess.getBehaviorAccess().getBehaviorKeyword_0()); 
            match(input,15,FollowSets000.FOLLOW_15_in_rule__Behavior__Group__0__Impl2562); 
             after(grammarAccess.getBehaviorAccess().getBehaviorKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Behavior__Group__0__Impl"


    // $ANTLR start "rule__Behavior__Group__1"
    // ../dk.itu.bddcontracts.ui/src-gen/dk/itu/bddcontracts/ui/contentassist/antlr/internal/InternalGherkin.g:1277:1: rule__Behavior__Group__1 : rule__Behavior__Group__1__Impl rule__Behavior__Group__2 ;
    public final void rule__Behavior__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.bddcontracts.ui/src-gen/dk/itu/bddcontracts/ui/contentassist/antlr/internal/InternalGherkin.g:1281:1: ( rule__Behavior__Group__1__Impl rule__Behavior__Group__2 )
            // ../dk.itu.bddcontracts.ui/src-gen/dk/itu/bddcontracts/ui/contentassist/antlr/internal/InternalGherkin.g:1282:2: rule__Behavior__Group__1__Impl rule__Behavior__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Behavior__Group__1__Impl_in_rule__Behavior__Group__12593);
            rule__Behavior__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Behavior__Group__2_in_rule__Behavior__Group__12596);
            rule__Behavior__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Behavior__Group__1"


    // $ANTLR start "rule__Behavior__Group__1__Impl"
    // ../dk.itu.bddcontracts.ui/src-gen/dk/itu/bddcontracts/ui/contentassist/antlr/internal/InternalGherkin.g:1289:1: rule__Behavior__Group__1__Impl : ( ( rule__Behavior__DescriptionAssignment_1 ) ) ;
    public final void rule__Behavior__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.bddcontracts.ui/src-gen/dk/itu/bddcontracts/ui/contentassist/antlr/internal/InternalGherkin.g:1293:1: ( ( ( rule__Behavior__DescriptionAssignment_1 ) ) )
            // ../dk.itu.bddcontracts.ui/src-gen/dk/itu/bddcontracts/ui/contentassist/antlr/internal/InternalGherkin.g:1294:1: ( ( rule__Behavior__DescriptionAssignment_1 ) )
            {
            // ../dk.itu.bddcontracts.ui/src-gen/dk/itu/bddcontracts/ui/contentassist/antlr/internal/InternalGherkin.g:1294:1: ( ( rule__Behavior__DescriptionAssignment_1 ) )
            // ../dk.itu.bddcontracts.ui/src-gen/dk/itu/bddcontracts/ui/contentassist/antlr/internal/InternalGherkin.g:1295:1: ( rule__Behavior__DescriptionAssignment_1 )
            {
             before(grammarAccess.getBehaviorAccess().getDescriptionAssignment_1()); 
            // ../dk.itu.bddcontracts.ui/src-gen/dk/itu/bddcontracts/ui/contentassist/antlr/internal/InternalGherkin.g:1296:1: ( rule__Behavior__DescriptionAssignment_1 )
            // ../dk.itu.bddcontracts.ui/src-gen/dk/itu/bddcontracts/ui/contentassist/antlr/internal/InternalGherkin.g:1296:2: rule__Behavior__DescriptionAssignment_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Behavior__DescriptionAssignment_1_in_rule__Behavior__Group__1__Impl2623);
            rule__Behavior__DescriptionAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getBehaviorAccess().getDescriptionAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Behavior__Group__1__Impl"


    // $ANTLR start "rule__Behavior__Group__2"
    // ../dk.itu.bddcontracts.ui/src-gen/dk/itu/bddcontracts/ui/contentassist/antlr/internal/InternalGherkin.g:1306:1: rule__Behavior__Group__2 : rule__Behavior__Group__2__Impl rule__Behavior__Group__3 ;
    public final void rule__Behavior__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.bddcontracts.ui/src-gen/dk/itu/bddcontracts/ui/contentassist/antlr/internal/InternalGherkin.g:1310:1: ( rule__Behavior__Group__2__Impl rule__Behavior__Group__3 )
            // ../dk.itu.bddcontracts.ui/src-gen/dk/itu/bddcontracts/ui/contentassist/antlr/internal/InternalGherkin.g:1311:2: rule__Behavior__Group__2__Impl rule__Behavior__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__Behavior__Group__2__Impl_in_rule__Behavior__Group__22653);
            rule__Behavior__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Behavior__Group__3_in_rule__Behavior__Group__22656);
            rule__Behavior__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Behavior__Group__2"


    // $ANTLR start "rule__Behavior__Group__2__Impl"
    // ../dk.itu.bddcontracts.ui/src-gen/dk/itu/bddcontracts/ui/contentassist/antlr/internal/InternalGherkin.g:1318:1: rule__Behavior__Group__2__Impl : ( ( rule__Behavior__Group_2__0 )? ) ;
    public final void rule__Behavior__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.bddcontracts.ui/src-gen/dk/itu/bddcontracts/ui/contentassist/antlr/internal/InternalGherkin.g:1322:1: ( ( ( rule__Behavior__Group_2__0 )? ) )
            // ../dk.itu.bddcontracts.ui/src-gen/dk/itu/bddcontracts/ui/contentassist/antlr/internal/InternalGherkin.g:1323:1: ( ( rule__Behavior__Group_2__0 )? )
            {
            // ../dk.itu.bddcontracts.ui/src-gen/dk/itu/bddcontracts/ui/contentassist/antlr/internal/InternalGherkin.g:1323:1: ( ( rule__Behavior__Group_2__0 )? )
            // ../dk.itu.bddcontracts.ui/src-gen/dk/itu/bddcontracts/ui/contentassist/antlr/internal/InternalGherkin.g:1324:1: ( rule__Behavior__Group_2__0 )?
            {
             before(grammarAccess.getBehaviorAccess().getGroup_2()); 
            // ../dk.itu.bddcontracts.ui/src-gen/dk/itu/bddcontracts/ui/contentassist/antlr/internal/InternalGherkin.g:1325:1: ( rule__Behavior__Group_2__0 )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==16) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // ../dk.itu.bddcontracts.ui/src-gen/dk/itu/bddcontracts/ui/contentassist/antlr/internal/InternalGherkin.g:1325:2: rule__Behavior__Group_2__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__Behavior__Group_2__0_in_rule__Behavior__Group__2__Impl2683);
                    rule__Behavior__Group_2__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getBehaviorAccess().getGroup_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Behavior__Group__2__Impl"


    // $ANTLR start "rule__Behavior__Group__3"
    // ../dk.itu.bddcontracts.ui/src-gen/dk/itu/bddcontracts/ui/contentassist/antlr/internal/InternalGherkin.g:1335:1: rule__Behavior__Group__3 : rule__Behavior__Group__3__Impl ;
    public final void rule__Behavior__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.bddcontracts.ui/src-gen/dk/itu/bddcontracts/ui/contentassist/antlr/internal/InternalGherkin.g:1339:1: ( rule__Behavior__Group__3__Impl )
            // ../dk.itu.bddcontracts.ui/src-gen/dk/itu/bddcontracts/ui/contentassist/antlr/internal/InternalGherkin.g:1340:2: rule__Behavior__Group__3__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Behavior__Group__3__Impl_in_rule__Behavior__Group__32714);
            rule__Behavior__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Behavior__Group__3"


    // $ANTLR start "rule__Behavior__Group__3__Impl"
    // ../dk.itu.bddcontracts.ui/src-gen/dk/itu/bddcontracts/ui/contentassist/antlr/internal/InternalGherkin.g:1346:1: rule__Behavior__Group__3__Impl : ( ( rule__Behavior__Group_3__0 )? ) ;
    public final void rule__Behavior__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.bddcontracts.ui/src-gen/dk/itu/bddcontracts/ui/contentassist/antlr/internal/InternalGherkin.g:1350:1: ( ( ( rule__Behavior__Group_3__0 )? ) )
            // ../dk.itu.bddcontracts.ui/src-gen/dk/itu/bddcontracts/ui/contentassist/antlr/internal/InternalGherkin.g:1351:1: ( ( rule__Behavior__Group_3__0 )? )
            {
            // ../dk.itu.bddcontracts.ui/src-gen/dk/itu/bddcontracts/ui/contentassist/antlr/internal/InternalGherkin.g:1351:1: ( ( rule__Behavior__Group_3__0 )? )
            // ../dk.itu.bddcontracts.ui/src-gen/dk/itu/bddcontracts/ui/contentassist/antlr/internal/InternalGherkin.g:1352:1: ( rule__Behavior__Group_3__0 )?
            {
             before(grammarAccess.getBehaviorAccess().getGroup_3()); 
            // ../dk.itu.bddcontracts.ui/src-gen/dk/itu/bddcontracts/ui/contentassist/antlr/internal/InternalGherkin.g:1353:1: ( rule__Behavior__Group_3__0 )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==17) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // ../dk.itu.bddcontracts.ui/src-gen/dk/itu/bddcontracts/ui/contentassist/antlr/internal/InternalGherkin.g:1353:2: rule__Behavior__Group_3__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__Behavior__Group_3__0_in_rule__Behavior__Group__3__Impl2741);
                    rule__Behavior__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getBehaviorAccess().getGroup_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Behavior__Group__3__Impl"


    // $ANTLR start "rule__Behavior__Group_2__0"
    // ../dk.itu.bddcontracts.ui/src-gen/dk/itu/bddcontracts/ui/contentassist/antlr/internal/InternalGherkin.g:1371:1: rule__Behavior__Group_2__0 : rule__Behavior__Group_2__0__Impl rule__Behavior__Group_2__1 ;
    public final void rule__Behavior__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.bddcontracts.ui/src-gen/dk/itu/bddcontracts/ui/contentassist/antlr/internal/InternalGherkin.g:1375:1: ( rule__Behavior__Group_2__0__Impl rule__Behavior__Group_2__1 )
            // ../dk.itu.bddcontracts.ui/src-gen/dk/itu/bddcontracts/ui/contentassist/antlr/internal/InternalGherkin.g:1376:2: rule__Behavior__Group_2__0__Impl rule__Behavior__Group_2__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Behavior__Group_2__0__Impl_in_rule__Behavior__Group_2__02780);
            rule__Behavior__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Behavior__Group_2__1_in_rule__Behavior__Group_2__02783);
            rule__Behavior__Group_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Behavior__Group_2__0"


    // $ANTLR start "rule__Behavior__Group_2__0__Impl"
    // ../dk.itu.bddcontracts.ui/src-gen/dk/itu/bddcontracts/ui/contentassist/antlr/internal/InternalGherkin.g:1383:1: rule__Behavior__Group_2__0__Impl : ( 'Requiring' ) ;
    public final void rule__Behavior__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.bddcontracts.ui/src-gen/dk/itu/bddcontracts/ui/contentassist/antlr/internal/InternalGherkin.g:1387:1: ( ( 'Requiring' ) )
            // ../dk.itu.bddcontracts.ui/src-gen/dk/itu/bddcontracts/ui/contentassist/antlr/internal/InternalGherkin.g:1388:1: ( 'Requiring' )
            {
            // ../dk.itu.bddcontracts.ui/src-gen/dk/itu/bddcontracts/ui/contentassist/antlr/internal/InternalGherkin.g:1388:1: ( 'Requiring' )
            // ../dk.itu.bddcontracts.ui/src-gen/dk/itu/bddcontracts/ui/contentassist/antlr/internal/InternalGherkin.g:1389:1: 'Requiring'
            {
             before(grammarAccess.getBehaviorAccess().getRequiringKeyword_2_0()); 
            match(input,16,FollowSets000.FOLLOW_16_in_rule__Behavior__Group_2__0__Impl2811); 
             after(grammarAccess.getBehaviorAccess().getRequiringKeyword_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Behavior__Group_2__0__Impl"


    // $ANTLR start "rule__Behavior__Group_2__1"
    // ../dk.itu.bddcontracts.ui/src-gen/dk/itu/bddcontracts/ui/contentassist/antlr/internal/InternalGherkin.g:1402:1: rule__Behavior__Group_2__1 : rule__Behavior__Group_2__1__Impl rule__Behavior__Group_2__2 ;
    public final void rule__Behavior__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.bddcontracts.ui/src-gen/dk/itu/bddcontracts/ui/contentassist/antlr/internal/InternalGherkin.g:1406:1: ( rule__Behavior__Group_2__1__Impl rule__Behavior__Group_2__2 )
            // ../dk.itu.bddcontracts.ui/src-gen/dk/itu/bddcontracts/ui/contentassist/antlr/internal/InternalGherkin.g:1407:2: rule__Behavior__Group_2__1__Impl rule__Behavior__Group_2__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Behavior__Group_2__1__Impl_in_rule__Behavior__Group_2__12842);
            rule__Behavior__Group_2__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Behavior__Group_2__2_in_rule__Behavior__Group_2__12845);
            rule__Behavior__Group_2__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Behavior__Group_2__1"


    // $ANTLR start "rule__Behavior__Group_2__1__Impl"
    // ../dk.itu.bddcontracts.ui/src-gen/dk/itu/bddcontracts/ui/contentassist/antlr/internal/InternalGherkin.g:1414:1: rule__Behavior__Group_2__1__Impl : ( ( rule__Behavior__RequiringBlocksAssignment_2_1 ) ) ;
    public final void rule__Behavior__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.bddcontracts.ui/src-gen/dk/itu/bddcontracts/ui/contentassist/antlr/internal/InternalGherkin.g:1418:1: ( ( ( rule__Behavior__RequiringBlocksAssignment_2_1 ) ) )
            // ../dk.itu.bddcontracts.ui/src-gen/dk/itu/bddcontracts/ui/contentassist/antlr/internal/InternalGherkin.g:1419:1: ( ( rule__Behavior__RequiringBlocksAssignment_2_1 ) )
            {
            // ../dk.itu.bddcontracts.ui/src-gen/dk/itu/bddcontracts/ui/contentassist/antlr/internal/InternalGherkin.g:1419:1: ( ( rule__Behavior__RequiringBlocksAssignment_2_1 ) )
            // ../dk.itu.bddcontracts.ui/src-gen/dk/itu/bddcontracts/ui/contentassist/antlr/internal/InternalGherkin.g:1420:1: ( rule__Behavior__RequiringBlocksAssignment_2_1 )
            {
             before(grammarAccess.getBehaviorAccess().getRequiringBlocksAssignment_2_1()); 
            // ../dk.itu.bddcontracts.ui/src-gen/dk/itu/bddcontracts/ui/contentassist/antlr/internal/InternalGherkin.g:1421:1: ( rule__Behavior__RequiringBlocksAssignment_2_1 )
            // ../dk.itu.bddcontracts.ui/src-gen/dk/itu/bddcontracts/ui/contentassist/antlr/internal/InternalGherkin.g:1421:2: rule__Behavior__RequiringBlocksAssignment_2_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Behavior__RequiringBlocksAssignment_2_1_in_rule__Behavior__Group_2__1__Impl2872);
            rule__Behavior__RequiringBlocksAssignment_2_1();

            state._fsp--;


            }

             after(grammarAccess.getBehaviorAccess().getRequiringBlocksAssignment_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Behavior__Group_2__1__Impl"


    // $ANTLR start "rule__Behavior__Group_2__2"
    // ../dk.itu.bddcontracts.ui/src-gen/dk/itu/bddcontracts/ui/contentassist/antlr/internal/InternalGherkin.g:1431:1: rule__Behavior__Group_2__2 : rule__Behavior__Group_2__2__Impl ;
    public final void rule__Behavior__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.bddcontracts.ui/src-gen/dk/itu/bddcontracts/ui/contentassist/antlr/internal/InternalGherkin.g:1435:1: ( rule__Behavior__Group_2__2__Impl )
            // ../dk.itu.bddcontracts.ui/src-gen/dk/itu/bddcontracts/ui/contentassist/antlr/internal/InternalGherkin.g:1436:2: rule__Behavior__Group_2__2__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Behavior__Group_2__2__Impl_in_rule__Behavior__Group_2__22902);
            rule__Behavior__Group_2__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Behavior__Group_2__2"


    // $ANTLR start "rule__Behavior__Group_2__2__Impl"
    // ../dk.itu.bddcontracts.ui/src-gen/dk/itu/bddcontracts/ui/contentassist/antlr/internal/InternalGherkin.g:1442:1: rule__Behavior__Group_2__2__Impl : ( ( rule__Behavior__Group_2_2__0 )* ) ;
    public final void rule__Behavior__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.bddcontracts.ui/src-gen/dk/itu/bddcontracts/ui/contentassist/antlr/internal/InternalGherkin.g:1446:1: ( ( ( rule__Behavior__Group_2_2__0 )* ) )
            // ../dk.itu.bddcontracts.ui/src-gen/dk/itu/bddcontracts/ui/contentassist/antlr/internal/InternalGherkin.g:1447:1: ( ( rule__Behavior__Group_2_2__0 )* )
            {
            // ../dk.itu.bddcontracts.ui/src-gen/dk/itu/bddcontracts/ui/contentassist/antlr/internal/InternalGherkin.g:1447:1: ( ( rule__Behavior__Group_2_2__0 )* )
            // ../dk.itu.bddcontracts.ui/src-gen/dk/itu/bddcontracts/ui/contentassist/antlr/internal/InternalGherkin.g:1448:1: ( rule__Behavior__Group_2_2__0 )*
            {
             before(grammarAccess.getBehaviorAccess().getGroup_2_2()); 
            // ../dk.itu.bddcontracts.ui/src-gen/dk/itu/bddcontracts/ui/contentassist/antlr/internal/InternalGherkin.g:1449:1: ( rule__Behavior__Group_2_2__0 )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==14) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // ../dk.itu.bddcontracts.ui/src-gen/dk/itu/bddcontracts/ui/contentassist/antlr/internal/InternalGherkin.g:1449:2: rule__Behavior__Group_2_2__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__Behavior__Group_2_2__0_in_rule__Behavior__Group_2__2__Impl2929);
            	    rule__Behavior__Group_2_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop17;
                }
            } while (true);

             after(grammarAccess.getBehaviorAccess().getGroup_2_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Behavior__Group_2__2__Impl"


    // $ANTLR start "rule__Behavior__Group_2_2__0"
    // ../dk.itu.bddcontracts.ui/src-gen/dk/itu/bddcontracts/ui/contentassist/antlr/internal/InternalGherkin.g:1465:1: rule__Behavior__Group_2_2__0 : rule__Behavior__Group_2_2__0__Impl rule__Behavior__Group_2_2__1 ;
    public final void rule__Behavior__Group_2_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.bddcontracts.ui/src-gen/dk/itu/bddcontracts/ui/contentassist/antlr/internal/InternalGherkin.g:1469:1: ( rule__Behavior__Group_2_2__0__Impl rule__Behavior__Group_2_2__1 )
            // ../dk.itu.bddcontracts.ui/src-gen/dk/itu/bddcontracts/ui/contentassist/antlr/internal/InternalGherkin.g:1470:2: rule__Behavior__Group_2_2__0__Impl rule__Behavior__Group_2_2__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Behavior__Group_2_2__0__Impl_in_rule__Behavior__Group_2_2__02966);
            rule__Behavior__Group_2_2__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Behavior__Group_2_2__1_in_rule__Behavior__Group_2_2__02969);
            rule__Behavior__Group_2_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Behavior__Group_2_2__0"


    // $ANTLR start "rule__Behavior__Group_2_2__0__Impl"
    // ../dk.itu.bddcontracts.ui/src-gen/dk/itu/bddcontracts/ui/contentassist/antlr/internal/InternalGherkin.g:1477:1: rule__Behavior__Group_2_2__0__Impl : ( 'And' ) ;
    public final void rule__Behavior__Group_2_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.bddcontracts.ui/src-gen/dk/itu/bddcontracts/ui/contentassist/antlr/internal/InternalGherkin.g:1481:1: ( ( 'And' ) )
            // ../dk.itu.bddcontracts.ui/src-gen/dk/itu/bddcontracts/ui/contentassist/antlr/internal/InternalGherkin.g:1482:1: ( 'And' )
            {
            // ../dk.itu.bddcontracts.ui/src-gen/dk/itu/bddcontracts/ui/contentassist/antlr/internal/InternalGherkin.g:1482:1: ( 'And' )
            // ../dk.itu.bddcontracts.ui/src-gen/dk/itu/bddcontracts/ui/contentassist/antlr/internal/InternalGherkin.g:1483:1: 'And'
            {
             before(grammarAccess.getBehaviorAccess().getAndKeyword_2_2_0()); 
            match(input,14,FollowSets000.FOLLOW_14_in_rule__Behavior__Group_2_2__0__Impl2997); 
             after(grammarAccess.getBehaviorAccess().getAndKeyword_2_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Behavior__Group_2_2__0__Impl"


    // $ANTLR start "rule__Behavior__Group_2_2__1"
    // ../dk.itu.bddcontracts.ui/src-gen/dk/itu/bddcontracts/ui/contentassist/antlr/internal/InternalGherkin.g:1496:1: rule__Behavior__Group_2_2__1 : rule__Behavior__Group_2_2__1__Impl ;
    public final void rule__Behavior__Group_2_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.bddcontracts.ui/src-gen/dk/itu/bddcontracts/ui/contentassist/antlr/internal/InternalGherkin.g:1500:1: ( rule__Behavior__Group_2_2__1__Impl )
            // ../dk.itu.bddcontracts.ui/src-gen/dk/itu/bddcontracts/ui/contentassist/antlr/internal/InternalGherkin.g:1501:2: rule__Behavior__Group_2_2__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Behavior__Group_2_2__1__Impl_in_rule__Behavior__Group_2_2__13028);
            rule__Behavior__Group_2_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Behavior__Group_2_2__1"


    // $ANTLR start "rule__Behavior__Group_2_2__1__Impl"
    // ../dk.itu.bddcontracts.ui/src-gen/dk/itu/bddcontracts/ui/contentassist/antlr/internal/InternalGherkin.g:1507:1: rule__Behavior__Group_2_2__1__Impl : ( ( rule__Behavior__RequiringBlocksAssignment_2_2_1 ) ) ;
    public final void rule__Behavior__Group_2_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.bddcontracts.ui/src-gen/dk/itu/bddcontracts/ui/contentassist/antlr/internal/InternalGherkin.g:1511:1: ( ( ( rule__Behavior__RequiringBlocksAssignment_2_2_1 ) ) )
            // ../dk.itu.bddcontracts.ui/src-gen/dk/itu/bddcontracts/ui/contentassist/antlr/internal/InternalGherkin.g:1512:1: ( ( rule__Behavior__RequiringBlocksAssignment_2_2_1 ) )
            {
            // ../dk.itu.bddcontracts.ui/src-gen/dk/itu/bddcontracts/ui/contentassist/antlr/internal/InternalGherkin.g:1512:1: ( ( rule__Behavior__RequiringBlocksAssignment_2_2_1 ) )
            // ../dk.itu.bddcontracts.ui/src-gen/dk/itu/bddcontracts/ui/contentassist/antlr/internal/InternalGherkin.g:1513:1: ( rule__Behavior__RequiringBlocksAssignment_2_2_1 )
            {
             before(grammarAccess.getBehaviorAccess().getRequiringBlocksAssignment_2_2_1()); 
            // ../dk.itu.bddcontracts.ui/src-gen/dk/itu/bddcontracts/ui/contentassist/antlr/internal/InternalGherkin.g:1514:1: ( rule__Behavior__RequiringBlocksAssignment_2_2_1 )
            // ../dk.itu.bddcontracts.ui/src-gen/dk/itu/bddcontracts/ui/contentassist/antlr/internal/InternalGherkin.g:1514:2: rule__Behavior__RequiringBlocksAssignment_2_2_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Behavior__RequiringBlocksAssignment_2_2_1_in_rule__Behavior__Group_2_2__1__Impl3055);
            rule__Behavior__RequiringBlocksAssignment_2_2_1();

            state._fsp--;


            }

             after(grammarAccess.getBehaviorAccess().getRequiringBlocksAssignment_2_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Behavior__Group_2_2__1__Impl"


    // $ANTLR start "rule__Behavior__Group_3__0"
    // ../dk.itu.bddcontracts.ui/src-gen/dk/itu/bddcontracts/ui/contentassist/antlr/internal/InternalGherkin.g:1528:1: rule__Behavior__Group_3__0 : rule__Behavior__Group_3__0__Impl rule__Behavior__Group_3__1 ;
    public final void rule__Behavior__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.bddcontracts.ui/src-gen/dk/itu/bddcontracts/ui/contentassist/antlr/internal/InternalGherkin.g:1532:1: ( rule__Behavior__Group_3__0__Impl rule__Behavior__Group_3__1 )
            // ../dk.itu.bddcontracts.ui/src-gen/dk/itu/bddcontracts/ui/contentassist/antlr/internal/InternalGherkin.g:1533:2: rule__Behavior__Group_3__0__Impl rule__Behavior__Group_3__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Behavior__Group_3__0__Impl_in_rule__Behavior__Group_3__03089);
            rule__Behavior__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Behavior__Group_3__1_in_rule__Behavior__Group_3__03092);
            rule__Behavior__Group_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Behavior__Group_3__0"


    // $ANTLR start "rule__Behavior__Group_3__0__Impl"
    // ../dk.itu.bddcontracts.ui/src-gen/dk/itu/bddcontracts/ui/contentassist/antlr/internal/InternalGherkin.g:1540:1: rule__Behavior__Group_3__0__Impl : ( 'Ensuring' ) ;
    public final void rule__Behavior__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.bddcontracts.ui/src-gen/dk/itu/bddcontracts/ui/contentassist/antlr/internal/InternalGherkin.g:1544:1: ( ( 'Ensuring' ) )
            // ../dk.itu.bddcontracts.ui/src-gen/dk/itu/bddcontracts/ui/contentassist/antlr/internal/InternalGherkin.g:1545:1: ( 'Ensuring' )
            {
            // ../dk.itu.bddcontracts.ui/src-gen/dk/itu/bddcontracts/ui/contentassist/antlr/internal/InternalGherkin.g:1545:1: ( 'Ensuring' )
            // ../dk.itu.bddcontracts.ui/src-gen/dk/itu/bddcontracts/ui/contentassist/antlr/internal/InternalGherkin.g:1546:1: 'Ensuring'
            {
             before(grammarAccess.getBehaviorAccess().getEnsuringKeyword_3_0()); 
            match(input,17,FollowSets000.FOLLOW_17_in_rule__Behavior__Group_3__0__Impl3120); 
             after(grammarAccess.getBehaviorAccess().getEnsuringKeyword_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Behavior__Group_3__0__Impl"


    // $ANTLR start "rule__Behavior__Group_3__1"
    // ../dk.itu.bddcontracts.ui/src-gen/dk/itu/bddcontracts/ui/contentassist/antlr/internal/InternalGherkin.g:1559:1: rule__Behavior__Group_3__1 : rule__Behavior__Group_3__1__Impl rule__Behavior__Group_3__2 ;
    public final void rule__Behavior__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.bddcontracts.ui/src-gen/dk/itu/bddcontracts/ui/contentassist/antlr/internal/InternalGherkin.g:1563:1: ( rule__Behavior__Group_3__1__Impl rule__Behavior__Group_3__2 )
            // ../dk.itu.bddcontracts.ui/src-gen/dk/itu/bddcontracts/ui/contentassist/antlr/internal/InternalGherkin.g:1564:2: rule__Behavior__Group_3__1__Impl rule__Behavior__Group_3__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Behavior__Group_3__1__Impl_in_rule__Behavior__Group_3__13151);
            rule__Behavior__Group_3__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Behavior__Group_3__2_in_rule__Behavior__Group_3__13154);
            rule__Behavior__Group_3__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Behavior__Group_3__1"


    // $ANTLR start "rule__Behavior__Group_3__1__Impl"
    // ../dk.itu.bddcontracts.ui/src-gen/dk/itu/bddcontracts/ui/contentassist/antlr/internal/InternalGherkin.g:1571:1: rule__Behavior__Group_3__1__Impl : ( ( rule__Behavior__EnsuringBlocksAssignment_3_1 ) ) ;
    public final void rule__Behavior__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.bddcontracts.ui/src-gen/dk/itu/bddcontracts/ui/contentassist/antlr/internal/InternalGherkin.g:1575:1: ( ( ( rule__Behavior__EnsuringBlocksAssignment_3_1 ) ) )
            // ../dk.itu.bddcontracts.ui/src-gen/dk/itu/bddcontracts/ui/contentassist/antlr/internal/InternalGherkin.g:1576:1: ( ( rule__Behavior__EnsuringBlocksAssignment_3_1 ) )
            {
            // ../dk.itu.bddcontracts.ui/src-gen/dk/itu/bddcontracts/ui/contentassist/antlr/internal/InternalGherkin.g:1576:1: ( ( rule__Behavior__EnsuringBlocksAssignment_3_1 ) )
            // ../dk.itu.bddcontracts.ui/src-gen/dk/itu/bddcontracts/ui/contentassist/antlr/internal/InternalGherkin.g:1577:1: ( rule__Behavior__EnsuringBlocksAssignment_3_1 )
            {
             before(grammarAccess.getBehaviorAccess().getEnsuringBlocksAssignment_3_1()); 
            // ../dk.itu.bddcontracts.ui/src-gen/dk/itu/bddcontracts/ui/contentassist/antlr/internal/InternalGherkin.g:1578:1: ( rule__Behavior__EnsuringBlocksAssignment_3_1 )
            // ../dk.itu.bddcontracts.ui/src-gen/dk/itu/bddcontracts/ui/contentassist/antlr/internal/InternalGherkin.g:1578:2: rule__Behavior__EnsuringBlocksAssignment_3_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Behavior__EnsuringBlocksAssignment_3_1_in_rule__Behavior__Group_3__1__Impl3181);
            rule__Behavior__EnsuringBlocksAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getBehaviorAccess().getEnsuringBlocksAssignment_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Behavior__Group_3__1__Impl"


    // $ANTLR start "rule__Behavior__Group_3__2"
    // ../dk.itu.bddcontracts.ui/src-gen/dk/itu/bddcontracts/ui/contentassist/antlr/internal/InternalGherkin.g:1588:1: rule__Behavior__Group_3__2 : rule__Behavior__Group_3__2__Impl ;
    public final void rule__Behavior__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.bddcontracts.ui/src-gen/dk/itu/bddcontracts/ui/contentassist/antlr/internal/InternalGherkin.g:1592:1: ( rule__Behavior__Group_3__2__Impl )
            // ../dk.itu.bddcontracts.ui/src-gen/dk/itu/bddcontracts/ui/contentassist/antlr/internal/InternalGherkin.g:1593:2: rule__Behavior__Group_3__2__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Behavior__Group_3__2__Impl_in_rule__Behavior__Group_3__23211);
            rule__Behavior__Group_3__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Behavior__Group_3__2"


    // $ANTLR start "rule__Behavior__Group_3__2__Impl"
    // ../dk.itu.bddcontracts.ui/src-gen/dk/itu/bddcontracts/ui/contentassist/antlr/internal/InternalGherkin.g:1599:1: rule__Behavior__Group_3__2__Impl : ( ( rule__Behavior__Group_3_2__0 )* ) ;
    public final void rule__Behavior__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.bddcontracts.ui/src-gen/dk/itu/bddcontracts/ui/contentassist/antlr/internal/InternalGherkin.g:1603:1: ( ( ( rule__Behavior__Group_3_2__0 )* ) )
            // ../dk.itu.bddcontracts.ui/src-gen/dk/itu/bddcontracts/ui/contentassist/antlr/internal/InternalGherkin.g:1604:1: ( ( rule__Behavior__Group_3_2__0 )* )
            {
            // ../dk.itu.bddcontracts.ui/src-gen/dk/itu/bddcontracts/ui/contentassist/antlr/internal/InternalGherkin.g:1604:1: ( ( rule__Behavior__Group_3_2__0 )* )
            // ../dk.itu.bddcontracts.ui/src-gen/dk/itu/bddcontracts/ui/contentassist/antlr/internal/InternalGherkin.g:1605:1: ( rule__Behavior__Group_3_2__0 )*
            {
             before(grammarAccess.getBehaviorAccess().getGroup_3_2()); 
            // ../dk.itu.bddcontracts.ui/src-gen/dk/itu/bddcontracts/ui/contentassist/antlr/internal/InternalGherkin.g:1606:1: ( rule__Behavior__Group_3_2__0 )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( (LA18_0==14) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // ../dk.itu.bddcontracts.ui/src-gen/dk/itu/bddcontracts/ui/contentassist/antlr/internal/InternalGherkin.g:1606:2: rule__Behavior__Group_3_2__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__Behavior__Group_3_2__0_in_rule__Behavior__Group_3__2__Impl3238);
            	    rule__Behavior__Group_3_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop18;
                }
            } while (true);

             after(grammarAccess.getBehaviorAccess().getGroup_3_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Behavior__Group_3__2__Impl"


    // $ANTLR start "rule__Behavior__Group_3_2__0"
    // ../dk.itu.bddcontracts.ui/src-gen/dk/itu/bddcontracts/ui/contentassist/antlr/internal/InternalGherkin.g:1622:1: rule__Behavior__Group_3_2__0 : rule__Behavior__Group_3_2__0__Impl rule__Behavior__Group_3_2__1 ;
    public final void rule__Behavior__Group_3_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.bddcontracts.ui/src-gen/dk/itu/bddcontracts/ui/contentassist/antlr/internal/InternalGherkin.g:1626:1: ( rule__Behavior__Group_3_2__0__Impl rule__Behavior__Group_3_2__1 )
            // ../dk.itu.bddcontracts.ui/src-gen/dk/itu/bddcontracts/ui/contentassist/antlr/internal/InternalGherkin.g:1627:2: rule__Behavior__Group_3_2__0__Impl rule__Behavior__Group_3_2__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Behavior__Group_3_2__0__Impl_in_rule__Behavior__Group_3_2__03275);
            rule__Behavior__Group_3_2__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Behavior__Group_3_2__1_in_rule__Behavior__Group_3_2__03278);
            rule__Behavior__Group_3_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Behavior__Group_3_2__0"


    // $ANTLR start "rule__Behavior__Group_3_2__0__Impl"
    // ../dk.itu.bddcontracts.ui/src-gen/dk/itu/bddcontracts/ui/contentassist/antlr/internal/InternalGherkin.g:1634:1: rule__Behavior__Group_3_2__0__Impl : ( 'And' ) ;
    public final void rule__Behavior__Group_3_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.bddcontracts.ui/src-gen/dk/itu/bddcontracts/ui/contentassist/antlr/internal/InternalGherkin.g:1638:1: ( ( 'And' ) )
            // ../dk.itu.bddcontracts.ui/src-gen/dk/itu/bddcontracts/ui/contentassist/antlr/internal/InternalGherkin.g:1639:1: ( 'And' )
            {
            // ../dk.itu.bddcontracts.ui/src-gen/dk/itu/bddcontracts/ui/contentassist/antlr/internal/InternalGherkin.g:1639:1: ( 'And' )
            // ../dk.itu.bddcontracts.ui/src-gen/dk/itu/bddcontracts/ui/contentassist/antlr/internal/InternalGherkin.g:1640:1: 'And'
            {
             before(grammarAccess.getBehaviorAccess().getAndKeyword_3_2_0()); 
            match(input,14,FollowSets000.FOLLOW_14_in_rule__Behavior__Group_3_2__0__Impl3306); 
             after(grammarAccess.getBehaviorAccess().getAndKeyword_3_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Behavior__Group_3_2__0__Impl"


    // $ANTLR start "rule__Behavior__Group_3_2__1"
    // ../dk.itu.bddcontracts.ui/src-gen/dk/itu/bddcontracts/ui/contentassist/antlr/internal/InternalGherkin.g:1653:1: rule__Behavior__Group_3_2__1 : rule__Behavior__Group_3_2__1__Impl ;
    public final void rule__Behavior__Group_3_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.bddcontracts.ui/src-gen/dk/itu/bddcontracts/ui/contentassist/antlr/internal/InternalGherkin.g:1657:1: ( rule__Behavior__Group_3_2__1__Impl )
            // ../dk.itu.bddcontracts.ui/src-gen/dk/itu/bddcontracts/ui/contentassist/antlr/internal/InternalGherkin.g:1658:2: rule__Behavior__Group_3_2__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Behavior__Group_3_2__1__Impl_in_rule__Behavior__Group_3_2__13337);
            rule__Behavior__Group_3_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Behavior__Group_3_2__1"


    // $ANTLR start "rule__Behavior__Group_3_2__1__Impl"
    // ../dk.itu.bddcontracts.ui/src-gen/dk/itu/bddcontracts/ui/contentassist/antlr/internal/InternalGherkin.g:1664:1: rule__Behavior__Group_3_2__1__Impl : ( ( rule__Behavior__EnsuringBlocksAssignment_3_2_1 ) ) ;
    public final void rule__Behavior__Group_3_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.bddcontracts.ui/src-gen/dk/itu/bddcontracts/ui/contentassist/antlr/internal/InternalGherkin.g:1668:1: ( ( ( rule__Behavior__EnsuringBlocksAssignment_3_2_1 ) ) )
            // ../dk.itu.bddcontracts.ui/src-gen/dk/itu/bddcontracts/ui/contentassist/antlr/internal/InternalGherkin.g:1669:1: ( ( rule__Behavior__EnsuringBlocksAssignment_3_2_1 ) )
            {
            // ../dk.itu.bddcontracts.ui/src-gen/dk/itu/bddcontracts/ui/contentassist/antlr/internal/InternalGherkin.g:1669:1: ( ( rule__Behavior__EnsuringBlocksAssignment_3_2_1 ) )
            // ../dk.itu.bddcontracts.ui/src-gen/dk/itu/bddcontracts/ui/contentassist/antlr/internal/InternalGherkin.g:1670:1: ( rule__Behavior__EnsuringBlocksAssignment_3_2_1 )
            {
             before(grammarAccess.getBehaviorAccess().getEnsuringBlocksAssignment_3_2_1()); 
            // ../dk.itu.bddcontracts.ui/src-gen/dk/itu/bddcontracts/ui/contentassist/antlr/internal/InternalGherkin.g:1671:1: ( rule__Behavior__EnsuringBlocksAssignment_3_2_1 )
            // ../dk.itu.bddcontracts.ui/src-gen/dk/itu/bddcontracts/ui/contentassist/antlr/internal/InternalGherkin.g:1671:2: rule__Behavior__EnsuringBlocksAssignment_3_2_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Behavior__EnsuringBlocksAssignment_3_2_1_in_rule__Behavior__Group_3_2__1__Impl3364);
            rule__Behavior__EnsuringBlocksAssignment_3_2_1();

            state._fsp--;


            }

             after(grammarAccess.getBehaviorAccess().getEnsuringBlocksAssignment_3_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Behavior__Group_3_2__1__Impl"


    // $ANTLR start "rule__Sentence__Group__0"
    // ../dk.itu.bddcontracts.ui/src-gen/dk/itu/bddcontracts/ui/contentassist/antlr/internal/InternalGherkin.g:1685:1: rule__Sentence__Group__0 : rule__Sentence__Group__0__Impl rule__Sentence__Group__1 ;
    public final void rule__Sentence__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.bddcontracts.ui/src-gen/dk/itu/bddcontracts/ui/contentassist/antlr/internal/InternalGherkin.g:1689:1: ( rule__Sentence__Group__0__Impl rule__Sentence__Group__1 )
            // ../dk.itu.bddcontracts.ui/src-gen/dk/itu/bddcontracts/ui/contentassist/antlr/internal/InternalGherkin.g:1690:2: rule__Sentence__Group__0__Impl rule__Sentence__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Sentence__Group__0__Impl_in_rule__Sentence__Group__03398);
            rule__Sentence__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Sentence__Group__1_in_rule__Sentence__Group__03401);
            rule__Sentence__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sentence__Group__0"


    // $ANTLR start "rule__Sentence__Group__0__Impl"
    // ../dk.itu.bddcontracts.ui/src-gen/dk/itu/bddcontracts/ui/contentassist/antlr/internal/InternalGherkin.g:1697:1: rule__Sentence__Group__0__Impl : ( ( rule__Sentence__WordsAssignment_0 ) ) ;
    public final void rule__Sentence__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.bddcontracts.ui/src-gen/dk/itu/bddcontracts/ui/contentassist/antlr/internal/InternalGherkin.g:1701:1: ( ( ( rule__Sentence__WordsAssignment_0 ) ) )
            // ../dk.itu.bddcontracts.ui/src-gen/dk/itu/bddcontracts/ui/contentassist/antlr/internal/InternalGherkin.g:1702:1: ( ( rule__Sentence__WordsAssignment_0 ) )
            {
            // ../dk.itu.bddcontracts.ui/src-gen/dk/itu/bddcontracts/ui/contentassist/antlr/internal/InternalGherkin.g:1702:1: ( ( rule__Sentence__WordsAssignment_0 ) )
            // ../dk.itu.bddcontracts.ui/src-gen/dk/itu/bddcontracts/ui/contentassist/antlr/internal/InternalGherkin.g:1703:1: ( rule__Sentence__WordsAssignment_0 )
            {
             before(grammarAccess.getSentenceAccess().getWordsAssignment_0()); 
            // ../dk.itu.bddcontracts.ui/src-gen/dk/itu/bddcontracts/ui/contentassist/antlr/internal/InternalGherkin.g:1704:1: ( rule__Sentence__WordsAssignment_0 )
            // ../dk.itu.bddcontracts.ui/src-gen/dk/itu/bddcontracts/ui/contentassist/antlr/internal/InternalGherkin.g:1704:2: rule__Sentence__WordsAssignment_0
            {
            pushFollow(FollowSets000.FOLLOW_rule__Sentence__WordsAssignment_0_in_rule__Sentence__Group__0__Impl3428);
            rule__Sentence__WordsAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getSentenceAccess().getWordsAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sentence__Group__0__Impl"


    // $ANTLR start "rule__Sentence__Group__1"
    // ../dk.itu.bddcontracts.ui/src-gen/dk/itu/bddcontracts/ui/contentassist/antlr/internal/InternalGherkin.g:1714:1: rule__Sentence__Group__1 : rule__Sentence__Group__1__Impl ;
    public final void rule__Sentence__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.bddcontracts.ui/src-gen/dk/itu/bddcontracts/ui/contentassist/antlr/internal/InternalGherkin.g:1718:1: ( rule__Sentence__Group__1__Impl )
            // ../dk.itu.bddcontracts.ui/src-gen/dk/itu/bddcontracts/ui/contentassist/antlr/internal/InternalGherkin.g:1719:2: rule__Sentence__Group__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Sentence__Group__1__Impl_in_rule__Sentence__Group__13458);
            rule__Sentence__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sentence__Group__1"


    // $ANTLR start "rule__Sentence__Group__1__Impl"
    // ../dk.itu.bddcontracts.ui/src-gen/dk/itu/bddcontracts/ui/contentassist/antlr/internal/InternalGherkin.g:1725:1: rule__Sentence__Group__1__Impl : ( ( rule__Sentence__WordsAssignment_1 )* ) ;
    public final void rule__Sentence__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.bddcontracts.ui/src-gen/dk/itu/bddcontracts/ui/contentassist/antlr/internal/InternalGherkin.g:1729:1: ( ( ( rule__Sentence__WordsAssignment_1 )* ) )
            // ../dk.itu.bddcontracts.ui/src-gen/dk/itu/bddcontracts/ui/contentassist/antlr/internal/InternalGherkin.g:1730:1: ( ( rule__Sentence__WordsAssignment_1 )* )
            {
            // ../dk.itu.bddcontracts.ui/src-gen/dk/itu/bddcontracts/ui/contentassist/antlr/internal/InternalGherkin.g:1730:1: ( ( rule__Sentence__WordsAssignment_1 )* )
            // ../dk.itu.bddcontracts.ui/src-gen/dk/itu/bddcontracts/ui/contentassist/antlr/internal/InternalGherkin.g:1731:1: ( rule__Sentence__WordsAssignment_1 )*
            {
             before(grammarAccess.getSentenceAccess().getWordsAssignment_1()); 
            // ../dk.itu.bddcontracts.ui/src-gen/dk/itu/bddcontracts/ui/contentassist/antlr/internal/InternalGherkin.g:1732:1: ( rule__Sentence__WordsAssignment_1 )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( ((LA19_0>=RULE_STRING && LA19_0<=RULE_ANY_OTHER)||LA19_0==23) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // ../dk.itu.bddcontracts.ui/src-gen/dk/itu/bddcontracts/ui/contentassist/antlr/internal/InternalGherkin.g:1732:2: rule__Sentence__WordsAssignment_1
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__Sentence__WordsAssignment_1_in_rule__Sentence__Group__1__Impl3485);
            	    rule__Sentence__WordsAssignment_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop19;
                }
            } while (true);

             after(grammarAccess.getSentenceAccess().getWordsAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sentence__Group__1__Impl"


    // $ANTLR start "rule__ScenarioSpecific__Group__0"
    // ../dk.itu.bddcontracts.ui/src-gen/dk/itu/bddcontracts/ui/contentassist/antlr/internal/InternalGherkin.g:1746:1: rule__ScenarioSpecific__Group__0 : rule__ScenarioSpecific__Group__0__Impl rule__ScenarioSpecific__Group__1 ;
    public final void rule__ScenarioSpecific__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.bddcontracts.ui/src-gen/dk/itu/bddcontracts/ui/contentassist/antlr/internal/InternalGherkin.g:1750:1: ( rule__ScenarioSpecific__Group__0__Impl rule__ScenarioSpecific__Group__1 )
            // ../dk.itu.bddcontracts.ui/src-gen/dk/itu/bddcontracts/ui/contentassist/antlr/internal/InternalGherkin.g:1751:2: rule__ScenarioSpecific__Group__0__Impl rule__ScenarioSpecific__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__ScenarioSpecific__Group__0__Impl_in_rule__ScenarioSpecific__Group__03520);
            rule__ScenarioSpecific__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__ScenarioSpecific__Group__1_in_rule__ScenarioSpecific__Group__03523);
            rule__ScenarioSpecific__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ScenarioSpecific__Group__0"


    // $ANTLR start "rule__ScenarioSpecific__Group__0__Impl"
    // ../dk.itu.bddcontracts.ui/src-gen/dk/itu/bddcontracts/ui/contentassist/antlr/internal/InternalGherkin.g:1758:1: rule__ScenarioSpecific__Group__0__Impl : ( 'Scenario:' ) ;
    public final void rule__ScenarioSpecific__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.bddcontracts.ui/src-gen/dk/itu/bddcontracts/ui/contentassist/antlr/internal/InternalGherkin.g:1762:1: ( ( 'Scenario:' ) )
            // ../dk.itu.bddcontracts.ui/src-gen/dk/itu/bddcontracts/ui/contentassist/antlr/internal/InternalGherkin.g:1763:1: ( 'Scenario:' )
            {
            // ../dk.itu.bddcontracts.ui/src-gen/dk/itu/bddcontracts/ui/contentassist/antlr/internal/InternalGherkin.g:1763:1: ( 'Scenario:' )
            // ../dk.itu.bddcontracts.ui/src-gen/dk/itu/bddcontracts/ui/contentassist/antlr/internal/InternalGherkin.g:1764:1: 'Scenario:'
            {
             before(grammarAccess.getScenarioSpecificAccess().getScenarioKeyword_0()); 
            match(input,18,FollowSets000.FOLLOW_18_in_rule__ScenarioSpecific__Group__0__Impl3551); 
             after(grammarAccess.getScenarioSpecificAccess().getScenarioKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ScenarioSpecific__Group__0__Impl"


    // $ANTLR start "rule__ScenarioSpecific__Group__1"
    // ../dk.itu.bddcontracts.ui/src-gen/dk/itu/bddcontracts/ui/contentassist/antlr/internal/InternalGherkin.g:1777:1: rule__ScenarioSpecific__Group__1 : rule__ScenarioSpecific__Group__1__Impl rule__ScenarioSpecific__Group__2 ;
    public final void rule__ScenarioSpecific__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.bddcontracts.ui/src-gen/dk/itu/bddcontracts/ui/contentassist/antlr/internal/InternalGherkin.g:1781:1: ( rule__ScenarioSpecific__Group__1__Impl rule__ScenarioSpecific__Group__2 )
            // ../dk.itu.bddcontracts.ui/src-gen/dk/itu/bddcontracts/ui/contentassist/antlr/internal/InternalGherkin.g:1782:2: rule__ScenarioSpecific__Group__1__Impl rule__ScenarioSpecific__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__ScenarioSpecific__Group__1__Impl_in_rule__ScenarioSpecific__Group__13582);
            rule__ScenarioSpecific__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__ScenarioSpecific__Group__2_in_rule__ScenarioSpecific__Group__13585);
            rule__ScenarioSpecific__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ScenarioSpecific__Group__1"


    // $ANTLR start "rule__ScenarioSpecific__Group__1__Impl"
    // ../dk.itu.bddcontracts.ui/src-gen/dk/itu/bddcontracts/ui/contentassist/antlr/internal/InternalGherkin.g:1789:1: rule__ScenarioSpecific__Group__1__Impl : ( ( rule__ScenarioSpecific__DescriptionAssignment_1 ) ) ;
    public final void rule__ScenarioSpecific__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.bddcontracts.ui/src-gen/dk/itu/bddcontracts/ui/contentassist/antlr/internal/InternalGherkin.g:1793:1: ( ( ( rule__ScenarioSpecific__DescriptionAssignment_1 ) ) )
            // ../dk.itu.bddcontracts.ui/src-gen/dk/itu/bddcontracts/ui/contentassist/antlr/internal/InternalGherkin.g:1794:1: ( ( rule__ScenarioSpecific__DescriptionAssignment_1 ) )
            {
            // ../dk.itu.bddcontracts.ui/src-gen/dk/itu/bddcontracts/ui/contentassist/antlr/internal/InternalGherkin.g:1794:1: ( ( rule__ScenarioSpecific__DescriptionAssignment_1 ) )
            // ../dk.itu.bddcontracts.ui/src-gen/dk/itu/bddcontracts/ui/contentassist/antlr/internal/InternalGherkin.g:1795:1: ( rule__ScenarioSpecific__DescriptionAssignment_1 )
            {
             before(grammarAccess.getScenarioSpecificAccess().getDescriptionAssignment_1()); 
            // ../dk.itu.bddcontracts.ui/src-gen/dk/itu/bddcontracts/ui/contentassist/antlr/internal/InternalGherkin.g:1796:1: ( rule__ScenarioSpecific__DescriptionAssignment_1 )
            // ../dk.itu.bddcontracts.ui/src-gen/dk/itu/bddcontracts/ui/contentassist/antlr/internal/InternalGherkin.g:1796:2: rule__ScenarioSpecific__DescriptionAssignment_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__ScenarioSpecific__DescriptionAssignment_1_in_rule__ScenarioSpecific__Group__1__Impl3612);
            rule__ScenarioSpecific__DescriptionAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getScenarioSpecificAccess().getDescriptionAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ScenarioSpecific__Group__1__Impl"


    // $ANTLR start "rule__ScenarioSpecific__Group__2"
    // ../dk.itu.bddcontracts.ui/src-gen/dk/itu/bddcontracts/ui/contentassist/antlr/internal/InternalGherkin.g:1806:1: rule__ScenarioSpecific__Group__2 : rule__ScenarioSpecific__Group__2__Impl rule__ScenarioSpecific__Group__3 ;
    public final void rule__ScenarioSpecific__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.bddcontracts.ui/src-gen/dk/itu/bddcontracts/ui/contentassist/antlr/internal/InternalGherkin.g:1810:1: ( rule__ScenarioSpecific__Group__2__Impl rule__ScenarioSpecific__Group__3 )
            // ../dk.itu.bddcontracts.ui/src-gen/dk/itu/bddcontracts/ui/contentassist/antlr/internal/InternalGherkin.g:1811:2: rule__ScenarioSpecific__Group__2__Impl rule__ScenarioSpecific__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__ScenarioSpecific__Group__2__Impl_in_rule__ScenarioSpecific__Group__23642);
            rule__ScenarioSpecific__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__ScenarioSpecific__Group__3_in_rule__ScenarioSpecific__Group__23645);
            rule__ScenarioSpecific__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ScenarioSpecific__Group__2"


    // $ANTLR start "rule__ScenarioSpecific__Group__2__Impl"
    // ../dk.itu.bddcontracts.ui/src-gen/dk/itu/bddcontracts/ui/contentassist/antlr/internal/InternalGherkin.g:1818:1: rule__ScenarioSpecific__Group__2__Impl : ( 'Given' ) ;
    public final void rule__ScenarioSpecific__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.bddcontracts.ui/src-gen/dk/itu/bddcontracts/ui/contentassist/antlr/internal/InternalGherkin.g:1822:1: ( ( 'Given' ) )
            // ../dk.itu.bddcontracts.ui/src-gen/dk/itu/bddcontracts/ui/contentassist/antlr/internal/InternalGherkin.g:1823:1: ( 'Given' )
            {
            // ../dk.itu.bddcontracts.ui/src-gen/dk/itu/bddcontracts/ui/contentassist/antlr/internal/InternalGherkin.g:1823:1: ( 'Given' )
            // ../dk.itu.bddcontracts.ui/src-gen/dk/itu/bddcontracts/ui/contentassist/antlr/internal/InternalGherkin.g:1824:1: 'Given'
            {
             before(grammarAccess.getScenarioSpecificAccess().getGivenKeyword_2()); 
            match(input,13,FollowSets000.FOLLOW_13_in_rule__ScenarioSpecific__Group__2__Impl3673); 
             after(grammarAccess.getScenarioSpecificAccess().getGivenKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ScenarioSpecific__Group__2__Impl"


    // $ANTLR start "rule__ScenarioSpecific__Group__3"
    // ../dk.itu.bddcontracts.ui/src-gen/dk/itu/bddcontracts/ui/contentassist/antlr/internal/InternalGherkin.g:1837:1: rule__ScenarioSpecific__Group__3 : rule__ScenarioSpecific__Group__3__Impl rule__ScenarioSpecific__Group__4 ;
    public final void rule__ScenarioSpecific__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.bddcontracts.ui/src-gen/dk/itu/bddcontracts/ui/contentassist/antlr/internal/InternalGherkin.g:1841:1: ( rule__ScenarioSpecific__Group__3__Impl rule__ScenarioSpecific__Group__4 )
            // ../dk.itu.bddcontracts.ui/src-gen/dk/itu/bddcontracts/ui/contentassist/antlr/internal/InternalGherkin.g:1842:2: rule__ScenarioSpecific__Group__3__Impl rule__ScenarioSpecific__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__ScenarioSpecific__Group__3__Impl_in_rule__ScenarioSpecific__Group__33704);
            rule__ScenarioSpecific__Group__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__ScenarioSpecific__Group__4_in_rule__ScenarioSpecific__Group__33707);
            rule__ScenarioSpecific__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ScenarioSpecific__Group__3"


    // $ANTLR start "rule__ScenarioSpecific__Group__3__Impl"
    // ../dk.itu.bddcontracts.ui/src-gen/dk/itu/bddcontracts/ui/contentassist/antlr/internal/InternalGherkin.g:1849:1: rule__ScenarioSpecific__Group__3__Impl : ( ( rule__ScenarioSpecific__GivenBlocksAssignment_3 ) ) ;
    public final void rule__ScenarioSpecific__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.bddcontracts.ui/src-gen/dk/itu/bddcontracts/ui/contentassist/antlr/internal/InternalGherkin.g:1853:1: ( ( ( rule__ScenarioSpecific__GivenBlocksAssignment_3 ) ) )
            // ../dk.itu.bddcontracts.ui/src-gen/dk/itu/bddcontracts/ui/contentassist/antlr/internal/InternalGherkin.g:1854:1: ( ( rule__ScenarioSpecific__GivenBlocksAssignment_3 ) )
            {
            // ../dk.itu.bddcontracts.ui/src-gen/dk/itu/bddcontracts/ui/contentassist/antlr/internal/InternalGherkin.g:1854:1: ( ( rule__ScenarioSpecific__GivenBlocksAssignment_3 ) )
            // ../dk.itu.bddcontracts.ui/src-gen/dk/itu/bddcontracts/ui/contentassist/antlr/internal/InternalGherkin.g:1855:1: ( rule__ScenarioSpecific__GivenBlocksAssignment_3 )
            {
             before(grammarAccess.getScenarioSpecificAccess().getGivenBlocksAssignment_3()); 
            // ../dk.itu.bddcontracts.ui/src-gen/dk/itu/bddcontracts/ui/contentassist/antlr/internal/InternalGherkin.g:1856:1: ( rule__ScenarioSpecific__GivenBlocksAssignment_3 )
            // ../dk.itu.bddcontracts.ui/src-gen/dk/itu/bddcontracts/ui/contentassist/antlr/internal/InternalGherkin.g:1856:2: rule__ScenarioSpecific__GivenBlocksAssignment_3
            {
            pushFollow(FollowSets000.FOLLOW_rule__ScenarioSpecific__GivenBlocksAssignment_3_in_rule__ScenarioSpecific__Group__3__Impl3734);
            rule__ScenarioSpecific__GivenBlocksAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getScenarioSpecificAccess().getGivenBlocksAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ScenarioSpecific__Group__3__Impl"


    // $ANTLR start "rule__ScenarioSpecific__Group__4"
    // ../dk.itu.bddcontracts.ui/src-gen/dk/itu/bddcontracts/ui/contentassist/antlr/internal/InternalGherkin.g:1866:1: rule__ScenarioSpecific__Group__4 : rule__ScenarioSpecific__Group__4__Impl rule__ScenarioSpecific__Group__5 ;
    public final void rule__ScenarioSpecific__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.bddcontracts.ui/src-gen/dk/itu/bddcontracts/ui/contentassist/antlr/internal/InternalGherkin.g:1870:1: ( rule__ScenarioSpecific__Group__4__Impl rule__ScenarioSpecific__Group__5 )
            // ../dk.itu.bddcontracts.ui/src-gen/dk/itu/bddcontracts/ui/contentassist/antlr/internal/InternalGherkin.g:1871:2: rule__ScenarioSpecific__Group__4__Impl rule__ScenarioSpecific__Group__5
            {
            pushFollow(FollowSets000.FOLLOW_rule__ScenarioSpecific__Group__4__Impl_in_rule__ScenarioSpecific__Group__43764);
            rule__ScenarioSpecific__Group__4__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__ScenarioSpecific__Group__5_in_rule__ScenarioSpecific__Group__43767);
            rule__ScenarioSpecific__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ScenarioSpecific__Group__4"


    // $ANTLR start "rule__ScenarioSpecific__Group__4__Impl"
    // ../dk.itu.bddcontracts.ui/src-gen/dk/itu/bddcontracts/ui/contentassist/antlr/internal/InternalGherkin.g:1878:1: rule__ScenarioSpecific__Group__4__Impl : ( ( rule__ScenarioSpecific__Group_4__0 )* ) ;
    public final void rule__ScenarioSpecific__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.bddcontracts.ui/src-gen/dk/itu/bddcontracts/ui/contentassist/antlr/internal/InternalGherkin.g:1882:1: ( ( ( rule__ScenarioSpecific__Group_4__0 )* ) )
            // ../dk.itu.bddcontracts.ui/src-gen/dk/itu/bddcontracts/ui/contentassist/antlr/internal/InternalGherkin.g:1883:1: ( ( rule__ScenarioSpecific__Group_4__0 )* )
            {
            // ../dk.itu.bddcontracts.ui/src-gen/dk/itu/bddcontracts/ui/contentassist/antlr/internal/InternalGherkin.g:1883:1: ( ( rule__ScenarioSpecific__Group_4__0 )* )
            // ../dk.itu.bddcontracts.ui/src-gen/dk/itu/bddcontracts/ui/contentassist/antlr/internal/InternalGherkin.g:1884:1: ( rule__ScenarioSpecific__Group_4__0 )*
            {
             before(grammarAccess.getScenarioSpecificAccess().getGroup_4()); 
            // ../dk.itu.bddcontracts.ui/src-gen/dk/itu/bddcontracts/ui/contentassist/antlr/internal/InternalGherkin.g:1885:1: ( rule__ScenarioSpecific__Group_4__0 )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( (LA20_0==14) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // ../dk.itu.bddcontracts.ui/src-gen/dk/itu/bddcontracts/ui/contentassist/antlr/internal/InternalGherkin.g:1885:2: rule__ScenarioSpecific__Group_4__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__ScenarioSpecific__Group_4__0_in_rule__ScenarioSpecific__Group__4__Impl3794);
            	    rule__ScenarioSpecific__Group_4__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop20;
                }
            } while (true);

             after(grammarAccess.getScenarioSpecificAccess().getGroup_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ScenarioSpecific__Group__4__Impl"


    // $ANTLR start "rule__ScenarioSpecific__Group__5"
    // ../dk.itu.bddcontracts.ui/src-gen/dk/itu/bddcontracts/ui/contentassist/antlr/internal/InternalGherkin.g:1895:1: rule__ScenarioSpecific__Group__5 : rule__ScenarioSpecific__Group__5__Impl rule__ScenarioSpecific__Group__6 ;
    public final void rule__ScenarioSpecific__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.bddcontracts.ui/src-gen/dk/itu/bddcontracts/ui/contentassist/antlr/internal/InternalGherkin.g:1899:1: ( rule__ScenarioSpecific__Group__5__Impl rule__ScenarioSpecific__Group__6 )
            // ../dk.itu.bddcontracts.ui/src-gen/dk/itu/bddcontracts/ui/contentassist/antlr/internal/InternalGherkin.g:1900:2: rule__ScenarioSpecific__Group__5__Impl rule__ScenarioSpecific__Group__6
            {
            pushFollow(FollowSets000.FOLLOW_rule__ScenarioSpecific__Group__5__Impl_in_rule__ScenarioSpecific__Group__53825);
            rule__ScenarioSpecific__Group__5__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__ScenarioSpecific__Group__6_in_rule__ScenarioSpecific__Group__53828);
            rule__ScenarioSpecific__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ScenarioSpecific__Group__5"


    // $ANTLR start "rule__ScenarioSpecific__Group__5__Impl"
    // ../dk.itu.bddcontracts.ui/src-gen/dk/itu/bddcontracts/ui/contentassist/antlr/internal/InternalGherkin.g:1907:1: rule__ScenarioSpecific__Group__5__Impl : ( ( rule__ScenarioSpecific__Group_5__0 )? ) ;
    public final void rule__ScenarioSpecific__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.bddcontracts.ui/src-gen/dk/itu/bddcontracts/ui/contentassist/antlr/internal/InternalGherkin.g:1911:1: ( ( ( rule__ScenarioSpecific__Group_5__0 )? ) )
            // ../dk.itu.bddcontracts.ui/src-gen/dk/itu/bddcontracts/ui/contentassist/antlr/internal/InternalGherkin.g:1912:1: ( ( rule__ScenarioSpecific__Group_5__0 )? )
            {
            // ../dk.itu.bddcontracts.ui/src-gen/dk/itu/bddcontracts/ui/contentassist/antlr/internal/InternalGherkin.g:1912:1: ( ( rule__ScenarioSpecific__Group_5__0 )? )
            // ../dk.itu.bddcontracts.ui/src-gen/dk/itu/bddcontracts/ui/contentassist/antlr/internal/InternalGherkin.g:1913:1: ( rule__ScenarioSpecific__Group_5__0 )?
            {
             before(grammarAccess.getScenarioSpecificAccess().getGroup_5()); 
            // ../dk.itu.bddcontracts.ui/src-gen/dk/itu/bddcontracts/ui/contentassist/antlr/internal/InternalGherkin.g:1914:1: ( rule__ScenarioSpecific__Group_5__0 )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==20) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // ../dk.itu.bddcontracts.ui/src-gen/dk/itu/bddcontracts/ui/contentassist/antlr/internal/InternalGherkin.g:1914:2: rule__ScenarioSpecific__Group_5__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__ScenarioSpecific__Group_5__0_in_rule__ScenarioSpecific__Group__5__Impl3855);
                    rule__ScenarioSpecific__Group_5__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getScenarioSpecificAccess().getGroup_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ScenarioSpecific__Group__5__Impl"


    // $ANTLR start "rule__ScenarioSpecific__Group__6"
    // ../dk.itu.bddcontracts.ui/src-gen/dk/itu/bddcontracts/ui/contentassist/antlr/internal/InternalGherkin.g:1924:1: rule__ScenarioSpecific__Group__6 : rule__ScenarioSpecific__Group__6__Impl rule__ScenarioSpecific__Group__7 ;
    public final void rule__ScenarioSpecific__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.bddcontracts.ui/src-gen/dk/itu/bddcontracts/ui/contentassist/antlr/internal/InternalGherkin.g:1928:1: ( rule__ScenarioSpecific__Group__6__Impl rule__ScenarioSpecific__Group__7 )
            // ../dk.itu.bddcontracts.ui/src-gen/dk/itu/bddcontracts/ui/contentassist/antlr/internal/InternalGherkin.g:1929:2: rule__ScenarioSpecific__Group__6__Impl rule__ScenarioSpecific__Group__7
            {
            pushFollow(FollowSets000.FOLLOW_rule__ScenarioSpecific__Group__6__Impl_in_rule__ScenarioSpecific__Group__63886);
            rule__ScenarioSpecific__Group__6__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__ScenarioSpecific__Group__7_in_rule__ScenarioSpecific__Group__63889);
            rule__ScenarioSpecific__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ScenarioSpecific__Group__6"


    // $ANTLR start "rule__ScenarioSpecific__Group__6__Impl"
    // ../dk.itu.bddcontracts.ui/src-gen/dk/itu/bddcontracts/ui/contentassist/antlr/internal/InternalGherkin.g:1936:1: rule__ScenarioSpecific__Group__6__Impl : ( 'Then' ) ;
    public final void rule__ScenarioSpecific__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.bddcontracts.ui/src-gen/dk/itu/bddcontracts/ui/contentassist/antlr/internal/InternalGherkin.g:1940:1: ( ( 'Then' ) )
            // ../dk.itu.bddcontracts.ui/src-gen/dk/itu/bddcontracts/ui/contentassist/antlr/internal/InternalGherkin.g:1941:1: ( 'Then' )
            {
            // ../dk.itu.bddcontracts.ui/src-gen/dk/itu/bddcontracts/ui/contentassist/antlr/internal/InternalGherkin.g:1941:1: ( 'Then' )
            // ../dk.itu.bddcontracts.ui/src-gen/dk/itu/bddcontracts/ui/contentassist/antlr/internal/InternalGherkin.g:1942:1: 'Then'
            {
             before(grammarAccess.getScenarioSpecificAccess().getThenKeyword_6()); 
            match(input,19,FollowSets000.FOLLOW_19_in_rule__ScenarioSpecific__Group__6__Impl3917); 
             after(grammarAccess.getScenarioSpecificAccess().getThenKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ScenarioSpecific__Group__6__Impl"


    // $ANTLR start "rule__ScenarioSpecific__Group__7"
    // ../dk.itu.bddcontracts.ui/src-gen/dk/itu/bddcontracts/ui/contentassist/antlr/internal/InternalGherkin.g:1955:1: rule__ScenarioSpecific__Group__7 : rule__ScenarioSpecific__Group__7__Impl rule__ScenarioSpecific__Group__8 ;
    public final void rule__ScenarioSpecific__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.bddcontracts.ui/src-gen/dk/itu/bddcontracts/ui/contentassist/antlr/internal/InternalGherkin.g:1959:1: ( rule__ScenarioSpecific__Group__7__Impl rule__ScenarioSpecific__Group__8 )
            // ../dk.itu.bddcontracts.ui/src-gen/dk/itu/bddcontracts/ui/contentassist/antlr/internal/InternalGherkin.g:1960:2: rule__ScenarioSpecific__Group__7__Impl rule__ScenarioSpecific__Group__8
            {
            pushFollow(FollowSets000.FOLLOW_rule__ScenarioSpecific__Group__7__Impl_in_rule__ScenarioSpecific__Group__73948);
            rule__ScenarioSpecific__Group__7__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__ScenarioSpecific__Group__8_in_rule__ScenarioSpecific__Group__73951);
            rule__ScenarioSpecific__Group__8();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ScenarioSpecific__Group__7"


    // $ANTLR start "rule__ScenarioSpecific__Group__7__Impl"
    // ../dk.itu.bddcontracts.ui/src-gen/dk/itu/bddcontracts/ui/contentassist/antlr/internal/InternalGherkin.g:1967:1: rule__ScenarioSpecific__Group__7__Impl : ( ( rule__ScenarioSpecific__ThenBlocksAssignment_7 ) ) ;
    public final void rule__ScenarioSpecific__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.bddcontracts.ui/src-gen/dk/itu/bddcontracts/ui/contentassist/antlr/internal/InternalGherkin.g:1971:1: ( ( ( rule__ScenarioSpecific__ThenBlocksAssignment_7 ) ) )
            // ../dk.itu.bddcontracts.ui/src-gen/dk/itu/bddcontracts/ui/contentassist/antlr/internal/InternalGherkin.g:1972:1: ( ( rule__ScenarioSpecific__ThenBlocksAssignment_7 ) )
            {
            // ../dk.itu.bddcontracts.ui/src-gen/dk/itu/bddcontracts/ui/contentassist/antlr/internal/InternalGherkin.g:1972:1: ( ( rule__ScenarioSpecific__ThenBlocksAssignment_7 ) )
            // ../dk.itu.bddcontracts.ui/src-gen/dk/itu/bddcontracts/ui/contentassist/antlr/internal/InternalGherkin.g:1973:1: ( rule__ScenarioSpecific__ThenBlocksAssignment_7 )
            {
             before(grammarAccess.getScenarioSpecificAccess().getThenBlocksAssignment_7()); 
            // ../dk.itu.bddcontracts.ui/src-gen/dk/itu/bddcontracts/ui/contentassist/antlr/internal/InternalGherkin.g:1974:1: ( rule__ScenarioSpecific__ThenBlocksAssignment_7 )
            // ../dk.itu.bddcontracts.ui/src-gen/dk/itu/bddcontracts/ui/contentassist/antlr/internal/InternalGherkin.g:1974:2: rule__ScenarioSpecific__ThenBlocksAssignment_7
            {
            pushFollow(FollowSets000.FOLLOW_rule__ScenarioSpecific__ThenBlocksAssignment_7_in_rule__ScenarioSpecific__Group__7__Impl3978);
            rule__ScenarioSpecific__ThenBlocksAssignment_7();

            state._fsp--;


            }

             after(grammarAccess.getScenarioSpecificAccess().getThenBlocksAssignment_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ScenarioSpecific__Group__7__Impl"


    // $ANTLR start "rule__ScenarioSpecific__Group__8"
    // ../dk.itu.bddcontracts.ui/src-gen/dk/itu/bddcontracts/ui/contentassist/antlr/internal/InternalGherkin.g:1984:1: rule__ScenarioSpecific__Group__8 : rule__ScenarioSpecific__Group__8__Impl ;
    public final void rule__ScenarioSpecific__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.bddcontracts.ui/src-gen/dk/itu/bddcontracts/ui/contentassist/antlr/internal/InternalGherkin.g:1988:1: ( rule__ScenarioSpecific__Group__8__Impl )
            // ../dk.itu.bddcontracts.ui/src-gen/dk/itu/bddcontracts/ui/contentassist/antlr/internal/InternalGherkin.g:1989:2: rule__ScenarioSpecific__Group__8__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__ScenarioSpecific__Group__8__Impl_in_rule__ScenarioSpecific__Group__84008);
            rule__ScenarioSpecific__Group__8__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ScenarioSpecific__Group__8"


    // $ANTLR start "rule__ScenarioSpecific__Group__8__Impl"
    // ../dk.itu.bddcontracts.ui/src-gen/dk/itu/bddcontracts/ui/contentassist/antlr/internal/InternalGherkin.g:1995:1: rule__ScenarioSpecific__Group__8__Impl : ( ( rule__ScenarioSpecific__Group_8__0 )* ) ;
    public final void rule__ScenarioSpecific__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.bddcontracts.ui/src-gen/dk/itu/bddcontracts/ui/contentassist/antlr/internal/InternalGherkin.g:1999:1: ( ( ( rule__ScenarioSpecific__Group_8__0 )* ) )
            // ../dk.itu.bddcontracts.ui/src-gen/dk/itu/bddcontracts/ui/contentassist/antlr/internal/InternalGherkin.g:2000:1: ( ( rule__ScenarioSpecific__Group_8__0 )* )
            {
            // ../dk.itu.bddcontracts.ui/src-gen/dk/itu/bddcontracts/ui/contentassist/antlr/internal/InternalGherkin.g:2000:1: ( ( rule__ScenarioSpecific__Group_8__0 )* )
            // ../dk.itu.bddcontracts.ui/src-gen/dk/itu/bddcontracts/ui/contentassist/antlr/internal/InternalGherkin.g:2001:1: ( rule__ScenarioSpecific__Group_8__0 )*
            {
             before(grammarAccess.getScenarioSpecificAccess().getGroup_8()); 
            // ../dk.itu.bddcontracts.ui/src-gen/dk/itu/bddcontracts/ui/contentassist/antlr/internal/InternalGherkin.g:2002:1: ( rule__ScenarioSpecific__Group_8__0 )*
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( (LA22_0==14) ) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // ../dk.itu.bddcontracts.ui/src-gen/dk/itu/bddcontracts/ui/contentassist/antlr/internal/InternalGherkin.g:2002:2: rule__ScenarioSpecific__Group_8__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__ScenarioSpecific__Group_8__0_in_rule__ScenarioSpecific__Group__8__Impl4035);
            	    rule__ScenarioSpecific__Group_8__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop22;
                }
            } while (true);

             after(grammarAccess.getScenarioSpecificAccess().getGroup_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ScenarioSpecific__Group__8__Impl"


    // $ANTLR start "rule__ScenarioSpecific__Group_4__0"
    // ../dk.itu.bddcontracts.ui/src-gen/dk/itu/bddcontracts/ui/contentassist/antlr/internal/InternalGherkin.g:2030:1: rule__ScenarioSpecific__Group_4__0 : rule__ScenarioSpecific__Group_4__0__Impl rule__ScenarioSpecific__Group_4__1 ;
    public final void rule__ScenarioSpecific__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.bddcontracts.ui/src-gen/dk/itu/bddcontracts/ui/contentassist/antlr/internal/InternalGherkin.g:2034:1: ( rule__ScenarioSpecific__Group_4__0__Impl rule__ScenarioSpecific__Group_4__1 )
            // ../dk.itu.bddcontracts.ui/src-gen/dk/itu/bddcontracts/ui/contentassist/antlr/internal/InternalGherkin.g:2035:2: rule__ScenarioSpecific__Group_4__0__Impl rule__ScenarioSpecific__Group_4__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__ScenarioSpecific__Group_4__0__Impl_in_rule__ScenarioSpecific__Group_4__04084);
            rule__ScenarioSpecific__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__ScenarioSpecific__Group_4__1_in_rule__ScenarioSpecific__Group_4__04087);
            rule__ScenarioSpecific__Group_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ScenarioSpecific__Group_4__0"


    // $ANTLR start "rule__ScenarioSpecific__Group_4__0__Impl"
    // ../dk.itu.bddcontracts.ui/src-gen/dk/itu/bddcontracts/ui/contentassist/antlr/internal/InternalGherkin.g:2042:1: rule__ScenarioSpecific__Group_4__0__Impl : ( 'And' ) ;
    public final void rule__ScenarioSpecific__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.bddcontracts.ui/src-gen/dk/itu/bddcontracts/ui/contentassist/antlr/internal/InternalGherkin.g:2046:1: ( ( 'And' ) )
            // ../dk.itu.bddcontracts.ui/src-gen/dk/itu/bddcontracts/ui/contentassist/antlr/internal/InternalGherkin.g:2047:1: ( 'And' )
            {
            // ../dk.itu.bddcontracts.ui/src-gen/dk/itu/bddcontracts/ui/contentassist/antlr/internal/InternalGherkin.g:2047:1: ( 'And' )
            // ../dk.itu.bddcontracts.ui/src-gen/dk/itu/bddcontracts/ui/contentassist/antlr/internal/InternalGherkin.g:2048:1: 'And'
            {
             before(grammarAccess.getScenarioSpecificAccess().getAndKeyword_4_0()); 
            match(input,14,FollowSets000.FOLLOW_14_in_rule__ScenarioSpecific__Group_4__0__Impl4115); 
             after(grammarAccess.getScenarioSpecificAccess().getAndKeyword_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ScenarioSpecific__Group_4__0__Impl"


    // $ANTLR start "rule__ScenarioSpecific__Group_4__1"
    // ../dk.itu.bddcontracts.ui/src-gen/dk/itu/bddcontracts/ui/contentassist/antlr/internal/InternalGherkin.g:2061:1: rule__ScenarioSpecific__Group_4__1 : rule__ScenarioSpecific__Group_4__1__Impl ;
    public final void rule__ScenarioSpecific__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.bddcontracts.ui/src-gen/dk/itu/bddcontracts/ui/contentassist/antlr/internal/InternalGherkin.g:2065:1: ( rule__ScenarioSpecific__Group_4__1__Impl )
            // ../dk.itu.bddcontracts.ui/src-gen/dk/itu/bddcontracts/ui/contentassist/antlr/internal/InternalGherkin.g:2066:2: rule__ScenarioSpecific__Group_4__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__ScenarioSpecific__Group_4__1__Impl_in_rule__ScenarioSpecific__Group_4__14146);
            rule__ScenarioSpecific__Group_4__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ScenarioSpecific__Group_4__1"


    // $ANTLR start "rule__ScenarioSpecific__Group_4__1__Impl"
    // ../dk.itu.bddcontracts.ui/src-gen/dk/itu/bddcontracts/ui/contentassist/antlr/internal/InternalGherkin.g:2072:1: rule__ScenarioSpecific__Group_4__1__Impl : ( ( rule__ScenarioSpecific__GivenBlocksAssignment_4_1 ) ) ;
    public final void rule__ScenarioSpecific__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.bddcontracts.ui/src-gen/dk/itu/bddcontracts/ui/contentassist/antlr/internal/InternalGherkin.g:2076:1: ( ( ( rule__ScenarioSpecific__GivenBlocksAssignment_4_1 ) ) )
            // ../dk.itu.bddcontracts.ui/src-gen/dk/itu/bddcontracts/ui/contentassist/antlr/internal/InternalGherkin.g:2077:1: ( ( rule__ScenarioSpecific__GivenBlocksAssignment_4_1 ) )
            {
            // ../dk.itu.bddcontracts.ui/src-gen/dk/itu/bddcontracts/ui/contentassist/antlr/internal/InternalGherkin.g:2077:1: ( ( rule__ScenarioSpecific__GivenBlocksAssignment_4_1 ) )
            // ../dk.itu.bddcontracts.ui/src-gen/dk/itu/bddcontracts/ui/contentassist/antlr/internal/InternalGherkin.g:2078:1: ( rule__ScenarioSpecific__GivenBlocksAssignment_4_1 )
            {
             before(grammarAccess.getScenarioSpecificAccess().getGivenBlocksAssignment_4_1()); 
            // ../dk.itu.bddcontracts.ui/src-gen/dk/itu/bddcontracts/ui/contentassist/antlr/internal/InternalGherkin.g:2079:1: ( rule__ScenarioSpecific__GivenBlocksAssignment_4_1 )
            // ../dk.itu.bddcontracts.ui/src-gen/dk/itu/bddcontracts/ui/contentassist/antlr/internal/InternalGherkin.g:2079:2: rule__ScenarioSpecific__GivenBlocksAssignment_4_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__ScenarioSpecific__GivenBlocksAssignment_4_1_in_rule__ScenarioSpecific__Group_4__1__Impl4173);
            rule__ScenarioSpecific__GivenBlocksAssignment_4_1();

            state._fsp--;


            }

             after(grammarAccess.getScenarioSpecificAccess().getGivenBlocksAssignment_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ScenarioSpecific__Group_4__1__Impl"


    // $ANTLR start "rule__ScenarioSpecific__Group_5__0"
    // ../dk.itu.bddcontracts.ui/src-gen/dk/itu/bddcontracts/ui/contentassist/antlr/internal/InternalGherkin.g:2093:1: rule__ScenarioSpecific__Group_5__0 : rule__ScenarioSpecific__Group_5__0__Impl rule__ScenarioSpecific__Group_5__1 ;
    public final void rule__ScenarioSpecific__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.bddcontracts.ui/src-gen/dk/itu/bddcontracts/ui/contentassist/antlr/internal/InternalGherkin.g:2097:1: ( rule__ScenarioSpecific__Group_5__0__Impl rule__ScenarioSpecific__Group_5__1 )
            // ../dk.itu.bddcontracts.ui/src-gen/dk/itu/bddcontracts/ui/contentassist/antlr/internal/InternalGherkin.g:2098:2: rule__ScenarioSpecific__Group_5__0__Impl rule__ScenarioSpecific__Group_5__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__ScenarioSpecific__Group_5__0__Impl_in_rule__ScenarioSpecific__Group_5__04207);
            rule__ScenarioSpecific__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__ScenarioSpecific__Group_5__1_in_rule__ScenarioSpecific__Group_5__04210);
            rule__ScenarioSpecific__Group_5__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ScenarioSpecific__Group_5__0"


    // $ANTLR start "rule__ScenarioSpecific__Group_5__0__Impl"
    // ../dk.itu.bddcontracts.ui/src-gen/dk/itu/bddcontracts/ui/contentassist/antlr/internal/InternalGherkin.g:2105:1: rule__ScenarioSpecific__Group_5__0__Impl : ( 'When' ) ;
    public final void rule__ScenarioSpecific__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.bddcontracts.ui/src-gen/dk/itu/bddcontracts/ui/contentassist/antlr/internal/InternalGherkin.g:2109:1: ( ( 'When' ) )
            // ../dk.itu.bddcontracts.ui/src-gen/dk/itu/bddcontracts/ui/contentassist/antlr/internal/InternalGherkin.g:2110:1: ( 'When' )
            {
            // ../dk.itu.bddcontracts.ui/src-gen/dk/itu/bddcontracts/ui/contentassist/antlr/internal/InternalGherkin.g:2110:1: ( 'When' )
            // ../dk.itu.bddcontracts.ui/src-gen/dk/itu/bddcontracts/ui/contentassist/antlr/internal/InternalGherkin.g:2111:1: 'When'
            {
             before(grammarAccess.getScenarioSpecificAccess().getWhenKeyword_5_0()); 
            match(input,20,FollowSets000.FOLLOW_20_in_rule__ScenarioSpecific__Group_5__0__Impl4238); 
             after(grammarAccess.getScenarioSpecificAccess().getWhenKeyword_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ScenarioSpecific__Group_5__0__Impl"


    // $ANTLR start "rule__ScenarioSpecific__Group_5__1"
    // ../dk.itu.bddcontracts.ui/src-gen/dk/itu/bddcontracts/ui/contentassist/antlr/internal/InternalGherkin.g:2124:1: rule__ScenarioSpecific__Group_5__1 : rule__ScenarioSpecific__Group_5__1__Impl rule__ScenarioSpecific__Group_5__2 ;
    public final void rule__ScenarioSpecific__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.bddcontracts.ui/src-gen/dk/itu/bddcontracts/ui/contentassist/antlr/internal/InternalGherkin.g:2128:1: ( rule__ScenarioSpecific__Group_5__1__Impl rule__ScenarioSpecific__Group_5__2 )
            // ../dk.itu.bddcontracts.ui/src-gen/dk/itu/bddcontracts/ui/contentassist/antlr/internal/InternalGherkin.g:2129:2: rule__ScenarioSpecific__Group_5__1__Impl rule__ScenarioSpecific__Group_5__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__ScenarioSpecific__Group_5__1__Impl_in_rule__ScenarioSpecific__Group_5__14269);
            rule__ScenarioSpecific__Group_5__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__ScenarioSpecific__Group_5__2_in_rule__ScenarioSpecific__Group_5__14272);
            rule__ScenarioSpecific__Group_5__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ScenarioSpecific__Group_5__1"


    // $ANTLR start "rule__ScenarioSpecific__Group_5__1__Impl"
    // ../dk.itu.bddcontracts.ui/src-gen/dk/itu/bddcontracts/ui/contentassist/antlr/internal/InternalGherkin.g:2136:1: rule__ScenarioSpecific__Group_5__1__Impl : ( ( rule__ScenarioSpecific__WhenBlocksAssignment_5_1 ) ) ;
    public final void rule__ScenarioSpecific__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.bddcontracts.ui/src-gen/dk/itu/bddcontracts/ui/contentassist/antlr/internal/InternalGherkin.g:2140:1: ( ( ( rule__ScenarioSpecific__WhenBlocksAssignment_5_1 ) ) )
            // ../dk.itu.bddcontracts.ui/src-gen/dk/itu/bddcontracts/ui/contentassist/antlr/internal/InternalGherkin.g:2141:1: ( ( rule__ScenarioSpecific__WhenBlocksAssignment_5_1 ) )
            {
            // ../dk.itu.bddcontracts.ui/src-gen/dk/itu/bddcontracts/ui/contentassist/antlr/internal/InternalGherkin.g:2141:1: ( ( rule__ScenarioSpecific__WhenBlocksAssignment_5_1 ) )
            // ../dk.itu.bddcontracts.ui/src-gen/dk/itu/bddcontracts/ui/contentassist/antlr/internal/InternalGherkin.g:2142:1: ( rule__ScenarioSpecific__WhenBlocksAssignment_5_1 )
            {
             before(grammarAccess.getScenarioSpecificAccess().getWhenBlocksAssignment_5_1()); 
            // ../dk.itu.bddcontracts.ui/src-gen/dk/itu/bddcontracts/ui/contentassist/antlr/internal/InternalGherkin.g:2143:1: ( rule__ScenarioSpecific__WhenBlocksAssignment_5_1 )
            // ../dk.itu.bddcontracts.ui/src-gen/dk/itu/bddcontracts/ui/contentassist/antlr/internal/InternalGherkin.g:2143:2: rule__ScenarioSpecific__WhenBlocksAssignment_5_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__ScenarioSpecific__WhenBlocksAssignment_5_1_in_rule__ScenarioSpecific__Group_5__1__Impl4299);
            rule__ScenarioSpecific__WhenBlocksAssignment_5_1();

            state._fsp--;


            }

             after(grammarAccess.getScenarioSpecificAccess().getWhenBlocksAssignment_5_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ScenarioSpecific__Group_5__1__Impl"


    // $ANTLR start "rule__ScenarioSpecific__Group_5__2"
    // ../dk.itu.bddcontracts.ui/src-gen/dk/itu/bddcontracts/ui/contentassist/antlr/internal/InternalGherkin.g:2153:1: rule__ScenarioSpecific__Group_5__2 : rule__ScenarioSpecific__Group_5__2__Impl ;
    public final void rule__ScenarioSpecific__Group_5__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.bddcontracts.ui/src-gen/dk/itu/bddcontracts/ui/contentassist/antlr/internal/InternalGherkin.g:2157:1: ( rule__ScenarioSpecific__Group_5__2__Impl )
            // ../dk.itu.bddcontracts.ui/src-gen/dk/itu/bddcontracts/ui/contentassist/antlr/internal/InternalGherkin.g:2158:2: rule__ScenarioSpecific__Group_5__2__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__ScenarioSpecific__Group_5__2__Impl_in_rule__ScenarioSpecific__Group_5__24329);
            rule__ScenarioSpecific__Group_5__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ScenarioSpecific__Group_5__2"


    // $ANTLR start "rule__ScenarioSpecific__Group_5__2__Impl"
    // ../dk.itu.bddcontracts.ui/src-gen/dk/itu/bddcontracts/ui/contentassist/antlr/internal/InternalGherkin.g:2164:1: rule__ScenarioSpecific__Group_5__2__Impl : ( ( rule__ScenarioSpecific__Group_5_2__0 )* ) ;
    public final void rule__ScenarioSpecific__Group_5__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.bddcontracts.ui/src-gen/dk/itu/bddcontracts/ui/contentassist/antlr/internal/InternalGherkin.g:2168:1: ( ( ( rule__ScenarioSpecific__Group_5_2__0 )* ) )
            // ../dk.itu.bddcontracts.ui/src-gen/dk/itu/bddcontracts/ui/contentassist/antlr/internal/InternalGherkin.g:2169:1: ( ( rule__ScenarioSpecific__Group_5_2__0 )* )
            {
            // ../dk.itu.bddcontracts.ui/src-gen/dk/itu/bddcontracts/ui/contentassist/antlr/internal/InternalGherkin.g:2169:1: ( ( rule__ScenarioSpecific__Group_5_2__0 )* )
            // ../dk.itu.bddcontracts.ui/src-gen/dk/itu/bddcontracts/ui/contentassist/antlr/internal/InternalGherkin.g:2170:1: ( rule__ScenarioSpecific__Group_5_2__0 )*
            {
             before(grammarAccess.getScenarioSpecificAccess().getGroup_5_2()); 
            // ../dk.itu.bddcontracts.ui/src-gen/dk/itu/bddcontracts/ui/contentassist/antlr/internal/InternalGherkin.g:2171:1: ( rule__ScenarioSpecific__Group_5_2__0 )*
            loop23:
            do {
                int alt23=2;
                int LA23_0 = input.LA(1);

                if ( (LA23_0==14) ) {
                    alt23=1;
                }


                switch (alt23) {
            	case 1 :
            	    // ../dk.itu.bddcontracts.ui/src-gen/dk/itu/bddcontracts/ui/contentassist/antlr/internal/InternalGherkin.g:2171:2: rule__ScenarioSpecific__Group_5_2__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__ScenarioSpecific__Group_5_2__0_in_rule__ScenarioSpecific__Group_5__2__Impl4356);
            	    rule__ScenarioSpecific__Group_5_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop23;
                }
            } while (true);

             after(grammarAccess.getScenarioSpecificAccess().getGroup_5_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ScenarioSpecific__Group_5__2__Impl"


    // $ANTLR start "rule__ScenarioSpecific__Group_5_2__0"
    // ../dk.itu.bddcontracts.ui/src-gen/dk/itu/bddcontracts/ui/contentassist/antlr/internal/InternalGherkin.g:2187:1: rule__ScenarioSpecific__Group_5_2__0 : rule__ScenarioSpecific__Group_5_2__0__Impl rule__ScenarioSpecific__Group_5_2__1 ;
    public final void rule__ScenarioSpecific__Group_5_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.bddcontracts.ui/src-gen/dk/itu/bddcontracts/ui/contentassist/antlr/internal/InternalGherkin.g:2191:1: ( rule__ScenarioSpecific__Group_5_2__0__Impl rule__ScenarioSpecific__Group_5_2__1 )
            // ../dk.itu.bddcontracts.ui/src-gen/dk/itu/bddcontracts/ui/contentassist/antlr/internal/InternalGherkin.g:2192:2: rule__ScenarioSpecific__Group_5_2__0__Impl rule__ScenarioSpecific__Group_5_2__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__ScenarioSpecific__Group_5_2__0__Impl_in_rule__ScenarioSpecific__Group_5_2__04393);
            rule__ScenarioSpecific__Group_5_2__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__ScenarioSpecific__Group_5_2__1_in_rule__ScenarioSpecific__Group_5_2__04396);
            rule__ScenarioSpecific__Group_5_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ScenarioSpecific__Group_5_2__0"


    // $ANTLR start "rule__ScenarioSpecific__Group_5_2__0__Impl"
    // ../dk.itu.bddcontracts.ui/src-gen/dk/itu/bddcontracts/ui/contentassist/antlr/internal/InternalGherkin.g:2199:1: rule__ScenarioSpecific__Group_5_2__0__Impl : ( 'And' ) ;
    public final void rule__ScenarioSpecific__Group_5_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.bddcontracts.ui/src-gen/dk/itu/bddcontracts/ui/contentassist/antlr/internal/InternalGherkin.g:2203:1: ( ( 'And' ) )
            // ../dk.itu.bddcontracts.ui/src-gen/dk/itu/bddcontracts/ui/contentassist/antlr/internal/InternalGherkin.g:2204:1: ( 'And' )
            {
            // ../dk.itu.bddcontracts.ui/src-gen/dk/itu/bddcontracts/ui/contentassist/antlr/internal/InternalGherkin.g:2204:1: ( 'And' )
            // ../dk.itu.bddcontracts.ui/src-gen/dk/itu/bddcontracts/ui/contentassist/antlr/internal/InternalGherkin.g:2205:1: 'And'
            {
             before(grammarAccess.getScenarioSpecificAccess().getAndKeyword_5_2_0()); 
            match(input,14,FollowSets000.FOLLOW_14_in_rule__ScenarioSpecific__Group_5_2__0__Impl4424); 
             after(grammarAccess.getScenarioSpecificAccess().getAndKeyword_5_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ScenarioSpecific__Group_5_2__0__Impl"


    // $ANTLR start "rule__ScenarioSpecific__Group_5_2__1"
    // ../dk.itu.bddcontracts.ui/src-gen/dk/itu/bddcontracts/ui/contentassist/antlr/internal/InternalGherkin.g:2218:1: rule__ScenarioSpecific__Group_5_2__1 : rule__ScenarioSpecific__Group_5_2__1__Impl ;
    public final void rule__ScenarioSpecific__Group_5_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.bddcontracts.ui/src-gen/dk/itu/bddcontracts/ui/contentassist/antlr/internal/InternalGherkin.g:2222:1: ( rule__ScenarioSpecific__Group_5_2__1__Impl )
            // ../dk.itu.bddcontracts.ui/src-gen/dk/itu/bddcontracts/ui/contentassist/antlr/internal/InternalGherkin.g:2223:2: rule__ScenarioSpecific__Group_5_2__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__ScenarioSpecific__Group_5_2__1__Impl_in_rule__ScenarioSpecific__Group_5_2__14455);
            rule__ScenarioSpecific__Group_5_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ScenarioSpecific__Group_5_2__1"


    // $ANTLR start "rule__ScenarioSpecific__Group_5_2__1__Impl"
    // ../dk.itu.bddcontracts.ui/src-gen/dk/itu/bddcontracts/ui/contentassist/antlr/internal/InternalGherkin.g:2229:1: rule__ScenarioSpecific__Group_5_2__1__Impl : ( ( rule__ScenarioSpecific__WhenBlocksAssignment_5_2_1 ) ) ;
    public final void rule__ScenarioSpecific__Group_5_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.bddcontracts.ui/src-gen/dk/itu/bddcontracts/ui/contentassist/antlr/internal/InternalGherkin.g:2233:1: ( ( ( rule__ScenarioSpecific__WhenBlocksAssignment_5_2_1 ) ) )
            // ../dk.itu.bddcontracts.ui/src-gen/dk/itu/bddcontracts/ui/contentassist/antlr/internal/InternalGherkin.g:2234:1: ( ( rule__ScenarioSpecific__WhenBlocksAssignment_5_2_1 ) )
            {
            // ../dk.itu.bddcontracts.ui/src-gen/dk/itu/bddcontracts/ui/contentassist/antlr/internal/InternalGherkin.g:2234:1: ( ( rule__ScenarioSpecific__WhenBlocksAssignment_5_2_1 ) )
            // ../dk.itu.bddcontracts.ui/src-gen/dk/itu/bddcontracts/ui/contentassist/antlr/internal/InternalGherkin.g:2235:1: ( rule__ScenarioSpecific__WhenBlocksAssignment_5_2_1 )
            {
             before(grammarAccess.getScenarioSpecificAccess().getWhenBlocksAssignment_5_2_1()); 
            // ../dk.itu.bddcontracts.ui/src-gen/dk/itu/bddcontracts/ui/contentassist/antlr/internal/InternalGherkin.g:2236:1: ( rule__ScenarioSpecific__WhenBlocksAssignment_5_2_1 )
            // ../dk.itu.bddcontracts.ui/src-gen/dk/itu/bddcontracts/ui/contentassist/antlr/internal/InternalGherkin.g:2236:2: rule__ScenarioSpecific__WhenBlocksAssignment_5_2_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__ScenarioSpecific__WhenBlocksAssignment_5_2_1_in_rule__ScenarioSpecific__Group_5_2__1__Impl4482);
            rule__ScenarioSpecific__WhenBlocksAssignment_5_2_1();

            state._fsp--;


            }

             after(grammarAccess.getScenarioSpecificAccess().getWhenBlocksAssignment_5_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ScenarioSpecific__Group_5_2__1__Impl"


    // $ANTLR start "rule__ScenarioSpecific__Group_8__0"
    // ../dk.itu.bddcontracts.ui/src-gen/dk/itu/bddcontracts/ui/contentassist/antlr/internal/InternalGherkin.g:2250:1: rule__ScenarioSpecific__Group_8__0 : rule__ScenarioSpecific__Group_8__0__Impl rule__ScenarioSpecific__Group_8__1 ;
    public final void rule__ScenarioSpecific__Group_8__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.bddcontracts.ui/src-gen/dk/itu/bddcontracts/ui/contentassist/antlr/internal/InternalGherkin.g:2254:1: ( rule__ScenarioSpecific__Group_8__0__Impl rule__ScenarioSpecific__Group_8__1 )
            // ../dk.itu.bddcontracts.ui/src-gen/dk/itu/bddcontracts/ui/contentassist/antlr/internal/InternalGherkin.g:2255:2: rule__ScenarioSpecific__Group_8__0__Impl rule__ScenarioSpecific__Group_8__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__ScenarioSpecific__Group_8__0__Impl_in_rule__ScenarioSpecific__Group_8__04516);
            rule__ScenarioSpecific__Group_8__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__ScenarioSpecific__Group_8__1_in_rule__ScenarioSpecific__Group_8__04519);
            rule__ScenarioSpecific__Group_8__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ScenarioSpecific__Group_8__0"


    // $ANTLR start "rule__ScenarioSpecific__Group_8__0__Impl"
    // ../dk.itu.bddcontracts.ui/src-gen/dk/itu/bddcontracts/ui/contentassist/antlr/internal/InternalGherkin.g:2262:1: rule__ScenarioSpecific__Group_8__0__Impl : ( 'And' ) ;
    public final void rule__ScenarioSpecific__Group_8__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.bddcontracts.ui/src-gen/dk/itu/bddcontracts/ui/contentassist/antlr/internal/InternalGherkin.g:2266:1: ( ( 'And' ) )
            // ../dk.itu.bddcontracts.ui/src-gen/dk/itu/bddcontracts/ui/contentassist/antlr/internal/InternalGherkin.g:2267:1: ( 'And' )
            {
            // ../dk.itu.bddcontracts.ui/src-gen/dk/itu/bddcontracts/ui/contentassist/antlr/internal/InternalGherkin.g:2267:1: ( 'And' )
            // ../dk.itu.bddcontracts.ui/src-gen/dk/itu/bddcontracts/ui/contentassist/antlr/internal/InternalGherkin.g:2268:1: 'And'
            {
             before(grammarAccess.getScenarioSpecificAccess().getAndKeyword_8_0()); 
            match(input,14,FollowSets000.FOLLOW_14_in_rule__ScenarioSpecific__Group_8__0__Impl4547); 
             after(grammarAccess.getScenarioSpecificAccess().getAndKeyword_8_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ScenarioSpecific__Group_8__0__Impl"


    // $ANTLR start "rule__ScenarioSpecific__Group_8__1"
    // ../dk.itu.bddcontracts.ui/src-gen/dk/itu/bddcontracts/ui/contentassist/antlr/internal/InternalGherkin.g:2281:1: rule__ScenarioSpecific__Group_8__1 : rule__ScenarioSpecific__Group_8__1__Impl ;
    public final void rule__ScenarioSpecific__Group_8__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.bddcontracts.ui/src-gen/dk/itu/bddcontracts/ui/contentassist/antlr/internal/InternalGherkin.g:2285:1: ( rule__ScenarioSpecific__Group_8__1__Impl )
            // ../dk.itu.bddcontracts.ui/src-gen/dk/itu/bddcontracts/ui/contentassist/antlr/internal/InternalGherkin.g:2286:2: rule__ScenarioSpecific__Group_8__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__ScenarioSpecific__Group_8__1__Impl_in_rule__ScenarioSpecific__Group_8__14578);
            rule__ScenarioSpecific__Group_8__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ScenarioSpecific__Group_8__1"


    // $ANTLR start "rule__ScenarioSpecific__Group_8__1__Impl"
    // ../dk.itu.bddcontracts.ui/src-gen/dk/itu/bddcontracts/ui/contentassist/antlr/internal/InternalGherkin.g:2292:1: rule__ScenarioSpecific__Group_8__1__Impl : ( ( rule__ScenarioSpecific__ThenBlocksAssignment_8_1 ) ) ;
    public final void rule__ScenarioSpecific__Group_8__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.bddcontracts.ui/src-gen/dk/itu/bddcontracts/ui/contentassist/antlr/internal/InternalGherkin.g:2296:1: ( ( ( rule__ScenarioSpecific__ThenBlocksAssignment_8_1 ) ) )
            // ../dk.itu.bddcontracts.ui/src-gen/dk/itu/bddcontracts/ui/contentassist/antlr/internal/InternalGherkin.g:2297:1: ( ( rule__ScenarioSpecific__ThenBlocksAssignment_8_1 ) )
            {
            // ../dk.itu.bddcontracts.ui/src-gen/dk/itu/bddcontracts/ui/contentassist/antlr/internal/InternalGherkin.g:2297:1: ( ( rule__ScenarioSpecific__ThenBlocksAssignment_8_1 ) )
            // ../dk.itu.bddcontracts.ui/src-gen/dk/itu/bddcontracts/ui/contentassist/antlr/internal/InternalGherkin.g:2298:1: ( rule__ScenarioSpecific__ThenBlocksAssignment_8_1 )
            {
             before(grammarAccess.getScenarioSpecificAccess().getThenBlocksAssignment_8_1()); 
            // ../dk.itu.bddcontracts.ui/src-gen/dk/itu/bddcontracts/ui/contentassist/antlr/internal/InternalGherkin.g:2299:1: ( rule__ScenarioSpecific__ThenBlocksAssignment_8_1 )
            // ../dk.itu.bddcontracts.ui/src-gen/dk/itu/bddcontracts/ui/contentassist/antlr/internal/InternalGherkin.g:2299:2: rule__ScenarioSpecific__ThenBlocksAssignment_8_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__ScenarioSpecific__ThenBlocksAssignment_8_1_in_rule__ScenarioSpecific__Group_8__1__Impl4605);
            rule__ScenarioSpecific__ThenBlocksAssignment_8_1();

            state._fsp--;


            }

             after(grammarAccess.getScenarioSpecificAccess().getThenBlocksAssignment_8_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ScenarioSpecific__Group_8__1__Impl"


    // $ANTLR start "rule__ScenarioOutline__Group__0"
    // ../dk.itu.bddcontracts.ui/src-gen/dk/itu/bddcontracts/ui/contentassist/antlr/internal/InternalGherkin.g:2313:1: rule__ScenarioOutline__Group__0 : rule__ScenarioOutline__Group__0__Impl rule__ScenarioOutline__Group__1 ;
    public final void rule__ScenarioOutline__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.bddcontracts.ui/src-gen/dk/itu/bddcontracts/ui/contentassist/antlr/internal/InternalGherkin.g:2317:1: ( rule__ScenarioOutline__Group__0__Impl rule__ScenarioOutline__Group__1 )
            // ../dk.itu.bddcontracts.ui/src-gen/dk/itu/bddcontracts/ui/contentassist/antlr/internal/InternalGherkin.g:2318:2: rule__ScenarioOutline__Group__0__Impl rule__ScenarioOutline__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__ScenarioOutline__Group__0__Impl_in_rule__ScenarioOutline__Group__04639);
            rule__ScenarioOutline__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__ScenarioOutline__Group__1_in_rule__ScenarioOutline__Group__04642);
            rule__ScenarioOutline__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ScenarioOutline__Group__0"


    // $ANTLR start "rule__ScenarioOutline__Group__0__Impl"
    // ../dk.itu.bddcontracts.ui/src-gen/dk/itu/bddcontracts/ui/contentassist/antlr/internal/InternalGherkin.g:2325:1: rule__ScenarioOutline__Group__0__Impl : ( 'Scenario Outline:' ) ;
    public final void rule__ScenarioOutline__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.bddcontracts.ui/src-gen/dk/itu/bddcontracts/ui/contentassist/antlr/internal/InternalGherkin.g:2329:1: ( ( 'Scenario Outline:' ) )
            // ../dk.itu.bddcontracts.ui/src-gen/dk/itu/bddcontracts/ui/contentassist/antlr/internal/InternalGherkin.g:2330:1: ( 'Scenario Outline:' )
            {
            // ../dk.itu.bddcontracts.ui/src-gen/dk/itu/bddcontracts/ui/contentassist/antlr/internal/InternalGherkin.g:2330:1: ( 'Scenario Outline:' )
            // ../dk.itu.bddcontracts.ui/src-gen/dk/itu/bddcontracts/ui/contentassist/antlr/internal/InternalGherkin.g:2331:1: 'Scenario Outline:'
            {
             before(grammarAccess.getScenarioOutlineAccess().getScenarioOutlineKeyword_0()); 
            match(input,21,FollowSets000.FOLLOW_21_in_rule__ScenarioOutline__Group__0__Impl4670); 
             after(grammarAccess.getScenarioOutlineAccess().getScenarioOutlineKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ScenarioOutline__Group__0__Impl"


    // $ANTLR start "rule__ScenarioOutline__Group__1"
    // ../dk.itu.bddcontracts.ui/src-gen/dk/itu/bddcontracts/ui/contentassist/antlr/internal/InternalGherkin.g:2344:1: rule__ScenarioOutline__Group__1 : rule__ScenarioOutline__Group__1__Impl rule__ScenarioOutline__Group__2 ;
    public final void rule__ScenarioOutline__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.bddcontracts.ui/src-gen/dk/itu/bddcontracts/ui/contentassist/antlr/internal/InternalGherkin.g:2348:1: ( rule__ScenarioOutline__Group__1__Impl rule__ScenarioOutline__Group__2 )
            // ../dk.itu.bddcontracts.ui/src-gen/dk/itu/bddcontracts/ui/contentassist/antlr/internal/InternalGherkin.g:2349:2: rule__ScenarioOutline__Group__1__Impl rule__ScenarioOutline__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__ScenarioOutline__Group__1__Impl_in_rule__ScenarioOutline__Group__14701);
            rule__ScenarioOutline__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__ScenarioOutline__Group__2_in_rule__ScenarioOutline__Group__14704);
            rule__ScenarioOutline__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ScenarioOutline__Group__1"


    // $ANTLR start "rule__ScenarioOutline__Group__1__Impl"
    // ../dk.itu.bddcontracts.ui/src-gen/dk/itu/bddcontracts/ui/contentassist/antlr/internal/InternalGherkin.g:2356:1: rule__ScenarioOutline__Group__1__Impl : ( ( rule__ScenarioOutline__DescriptionAssignment_1 ) ) ;
    public final void rule__ScenarioOutline__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.bddcontracts.ui/src-gen/dk/itu/bddcontracts/ui/contentassist/antlr/internal/InternalGherkin.g:2360:1: ( ( ( rule__ScenarioOutline__DescriptionAssignment_1 ) ) )
            // ../dk.itu.bddcontracts.ui/src-gen/dk/itu/bddcontracts/ui/contentassist/antlr/internal/InternalGherkin.g:2361:1: ( ( rule__ScenarioOutline__DescriptionAssignment_1 ) )
            {
            // ../dk.itu.bddcontracts.ui/src-gen/dk/itu/bddcontracts/ui/contentassist/antlr/internal/InternalGherkin.g:2361:1: ( ( rule__ScenarioOutline__DescriptionAssignment_1 ) )
            // ../dk.itu.bddcontracts.ui/src-gen/dk/itu/bddcontracts/ui/contentassist/antlr/internal/InternalGherkin.g:2362:1: ( rule__ScenarioOutline__DescriptionAssignment_1 )
            {
             before(grammarAccess.getScenarioOutlineAccess().getDescriptionAssignment_1()); 
            // ../dk.itu.bddcontracts.ui/src-gen/dk/itu/bddcontracts/ui/contentassist/antlr/internal/InternalGherkin.g:2363:1: ( rule__ScenarioOutline__DescriptionAssignment_1 )
            // ../dk.itu.bddcontracts.ui/src-gen/dk/itu/bddcontracts/ui/contentassist/antlr/internal/InternalGherkin.g:2363:2: rule__ScenarioOutline__DescriptionAssignment_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__ScenarioOutline__DescriptionAssignment_1_in_rule__ScenarioOutline__Group__1__Impl4731);
            rule__ScenarioOutline__DescriptionAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getScenarioOutlineAccess().getDescriptionAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ScenarioOutline__Group__1__Impl"


    // $ANTLR start "rule__ScenarioOutline__Group__2"
    // ../dk.itu.bddcontracts.ui/src-gen/dk/itu/bddcontracts/ui/contentassist/antlr/internal/InternalGherkin.g:2373:1: rule__ScenarioOutline__Group__2 : rule__ScenarioOutline__Group__2__Impl rule__ScenarioOutline__Group__3 ;
    public final void rule__ScenarioOutline__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.bddcontracts.ui/src-gen/dk/itu/bddcontracts/ui/contentassist/antlr/internal/InternalGherkin.g:2377:1: ( rule__ScenarioOutline__Group__2__Impl rule__ScenarioOutline__Group__3 )
            // ../dk.itu.bddcontracts.ui/src-gen/dk/itu/bddcontracts/ui/contentassist/antlr/internal/InternalGherkin.g:2378:2: rule__ScenarioOutline__Group__2__Impl rule__ScenarioOutline__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__ScenarioOutline__Group__2__Impl_in_rule__ScenarioOutline__Group__24761);
            rule__ScenarioOutline__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__ScenarioOutline__Group__3_in_rule__ScenarioOutline__Group__24764);
            rule__ScenarioOutline__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ScenarioOutline__Group__2"


    // $ANTLR start "rule__ScenarioOutline__Group__2__Impl"
    // ../dk.itu.bddcontracts.ui/src-gen/dk/itu/bddcontracts/ui/contentassist/antlr/internal/InternalGherkin.g:2385:1: rule__ScenarioOutline__Group__2__Impl : ( 'Given' ) ;
    public final void rule__ScenarioOutline__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.bddcontracts.ui/src-gen/dk/itu/bddcontracts/ui/contentassist/antlr/internal/InternalGherkin.g:2389:1: ( ( 'Given' ) )
            // ../dk.itu.bddcontracts.ui/src-gen/dk/itu/bddcontracts/ui/contentassist/antlr/internal/InternalGherkin.g:2390:1: ( 'Given' )
            {
            // ../dk.itu.bddcontracts.ui/src-gen/dk/itu/bddcontracts/ui/contentassist/antlr/internal/InternalGherkin.g:2390:1: ( 'Given' )
            // ../dk.itu.bddcontracts.ui/src-gen/dk/itu/bddcontracts/ui/contentassist/antlr/internal/InternalGherkin.g:2391:1: 'Given'
            {
             before(grammarAccess.getScenarioOutlineAccess().getGivenKeyword_2()); 
            match(input,13,FollowSets000.FOLLOW_13_in_rule__ScenarioOutline__Group__2__Impl4792); 
             after(grammarAccess.getScenarioOutlineAccess().getGivenKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ScenarioOutline__Group__2__Impl"


    // $ANTLR start "rule__ScenarioOutline__Group__3"
    // ../dk.itu.bddcontracts.ui/src-gen/dk/itu/bddcontracts/ui/contentassist/antlr/internal/InternalGherkin.g:2404:1: rule__ScenarioOutline__Group__3 : rule__ScenarioOutline__Group__3__Impl rule__ScenarioOutline__Group__4 ;
    public final void rule__ScenarioOutline__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.bddcontracts.ui/src-gen/dk/itu/bddcontracts/ui/contentassist/antlr/internal/InternalGherkin.g:2408:1: ( rule__ScenarioOutline__Group__3__Impl rule__ScenarioOutline__Group__4 )
            // ../dk.itu.bddcontracts.ui/src-gen/dk/itu/bddcontracts/ui/contentassist/antlr/internal/InternalGherkin.g:2409:2: rule__ScenarioOutline__Group__3__Impl rule__ScenarioOutline__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__ScenarioOutline__Group__3__Impl_in_rule__ScenarioOutline__Group__34823);
            rule__ScenarioOutline__Group__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__ScenarioOutline__Group__4_in_rule__ScenarioOutline__Group__34826);
            rule__ScenarioOutline__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ScenarioOutline__Group__3"


    // $ANTLR start "rule__ScenarioOutline__Group__3__Impl"
    // ../dk.itu.bddcontracts.ui/src-gen/dk/itu/bddcontracts/ui/contentassist/antlr/internal/InternalGherkin.g:2416:1: rule__ScenarioOutline__Group__3__Impl : ( ( rule__ScenarioOutline__GivenBlocksAssignment_3 ) ) ;
    public final void rule__ScenarioOutline__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.bddcontracts.ui/src-gen/dk/itu/bddcontracts/ui/contentassist/antlr/internal/InternalGherkin.g:2420:1: ( ( ( rule__ScenarioOutline__GivenBlocksAssignment_3 ) ) )
            // ../dk.itu.bddcontracts.ui/src-gen/dk/itu/bddcontracts/ui/contentassist/antlr/internal/InternalGherkin.g:2421:1: ( ( rule__ScenarioOutline__GivenBlocksAssignment_3 ) )
            {
            // ../dk.itu.bddcontracts.ui/src-gen/dk/itu/bddcontracts/ui/contentassist/antlr/internal/InternalGherkin.g:2421:1: ( ( rule__ScenarioOutline__GivenBlocksAssignment_3 ) )
            // ../dk.itu.bddcontracts.ui/src-gen/dk/itu/bddcontracts/ui/contentassist/antlr/internal/InternalGherkin.g:2422:1: ( rule__ScenarioOutline__GivenBlocksAssignment_3 )
            {
             before(grammarAccess.getScenarioOutlineAccess().getGivenBlocksAssignment_3()); 
            // ../dk.itu.bddcontracts.ui/src-gen/dk/itu/bddcontracts/ui/contentassist/antlr/internal/InternalGherkin.g:2423:1: ( rule__ScenarioOutline__GivenBlocksAssignment_3 )
            // ../dk.itu.bddcontracts.ui/src-gen/dk/itu/bddcontracts/ui/contentassist/antlr/internal/InternalGherkin.g:2423:2: rule__ScenarioOutline__GivenBlocksAssignment_3
            {
            pushFollow(FollowSets000.FOLLOW_rule__ScenarioOutline__GivenBlocksAssignment_3_in_rule__ScenarioOutline__Group__3__Impl4853);
            rule__ScenarioOutline__GivenBlocksAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getScenarioOutlineAccess().getGivenBlocksAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ScenarioOutline__Group__3__Impl"


    // $ANTLR start "rule__ScenarioOutline__Group__4"
    // ../dk.itu.bddcontracts.ui/src-gen/dk/itu/bddcontracts/ui/contentassist/antlr/internal/InternalGherkin.g:2433:1: rule__ScenarioOutline__Group__4 : rule__ScenarioOutline__Group__4__Impl rule__ScenarioOutline__Group__5 ;
    public final void rule__ScenarioOutline__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.bddcontracts.ui/src-gen/dk/itu/bddcontracts/ui/contentassist/antlr/internal/InternalGherkin.g:2437:1: ( rule__ScenarioOutline__Group__4__Impl rule__ScenarioOutline__Group__5 )
            // ../dk.itu.bddcontracts.ui/src-gen/dk/itu/bddcontracts/ui/contentassist/antlr/internal/InternalGherkin.g:2438:2: rule__ScenarioOutline__Group__4__Impl rule__ScenarioOutline__Group__5
            {
            pushFollow(FollowSets000.FOLLOW_rule__ScenarioOutline__Group__4__Impl_in_rule__ScenarioOutline__Group__44883);
            rule__ScenarioOutline__Group__4__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__ScenarioOutline__Group__5_in_rule__ScenarioOutline__Group__44886);
            rule__ScenarioOutline__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ScenarioOutline__Group__4"


    // $ANTLR start "rule__ScenarioOutline__Group__4__Impl"
    // ../dk.itu.bddcontracts.ui/src-gen/dk/itu/bddcontracts/ui/contentassist/antlr/internal/InternalGherkin.g:2445:1: rule__ScenarioOutline__Group__4__Impl : ( ( rule__ScenarioOutline__Group_4__0 )* ) ;
    public final void rule__ScenarioOutline__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.bddcontracts.ui/src-gen/dk/itu/bddcontracts/ui/contentassist/antlr/internal/InternalGherkin.g:2449:1: ( ( ( rule__ScenarioOutline__Group_4__0 )* ) )
            // ../dk.itu.bddcontracts.ui/src-gen/dk/itu/bddcontracts/ui/contentassist/antlr/internal/InternalGherkin.g:2450:1: ( ( rule__ScenarioOutline__Group_4__0 )* )
            {
            // ../dk.itu.bddcontracts.ui/src-gen/dk/itu/bddcontracts/ui/contentassist/antlr/internal/InternalGherkin.g:2450:1: ( ( rule__ScenarioOutline__Group_4__0 )* )
            // ../dk.itu.bddcontracts.ui/src-gen/dk/itu/bddcontracts/ui/contentassist/antlr/internal/InternalGherkin.g:2451:1: ( rule__ScenarioOutline__Group_4__0 )*
            {
             before(grammarAccess.getScenarioOutlineAccess().getGroup_4()); 
            // ../dk.itu.bddcontracts.ui/src-gen/dk/itu/bddcontracts/ui/contentassist/antlr/internal/InternalGherkin.g:2452:1: ( rule__ScenarioOutline__Group_4__0 )*
            loop24:
            do {
                int alt24=2;
                int LA24_0 = input.LA(1);

                if ( (LA24_0==14) ) {
                    alt24=1;
                }


                switch (alt24) {
            	case 1 :
            	    // ../dk.itu.bddcontracts.ui/src-gen/dk/itu/bddcontracts/ui/contentassist/antlr/internal/InternalGherkin.g:2452:2: rule__ScenarioOutline__Group_4__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__ScenarioOutline__Group_4__0_in_rule__ScenarioOutline__Group__4__Impl4913);
            	    rule__ScenarioOutline__Group_4__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop24;
                }
            } while (true);

             after(grammarAccess.getScenarioOutlineAccess().getGroup_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ScenarioOutline__Group__4__Impl"


    // $ANTLR start "rule__ScenarioOutline__Group__5"
    // ../dk.itu.bddcontracts.ui/src-gen/dk/itu/bddcontracts/ui/contentassist/antlr/internal/InternalGherkin.g:2462:1: rule__ScenarioOutline__Group__5 : rule__ScenarioOutline__Group__5__Impl rule__ScenarioOutline__Group__6 ;
    public final void rule__ScenarioOutline__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.bddcontracts.ui/src-gen/dk/itu/bddcontracts/ui/contentassist/antlr/internal/InternalGherkin.g:2466:1: ( rule__ScenarioOutline__Group__5__Impl rule__ScenarioOutline__Group__6 )
            // ../dk.itu.bddcontracts.ui/src-gen/dk/itu/bddcontracts/ui/contentassist/antlr/internal/InternalGherkin.g:2467:2: rule__ScenarioOutline__Group__5__Impl rule__ScenarioOutline__Group__6
            {
            pushFollow(FollowSets000.FOLLOW_rule__ScenarioOutline__Group__5__Impl_in_rule__ScenarioOutline__Group__54944);
            rule__ScenarioOutline__Group__5__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__ScenarioOutline__Group__6_in_rule__ScenarioOutline__Group__54947);
            rule__ScenarioOutline__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ScenarioOutline__Group__5"


    // $ANTLR start "rule__ScenarioOutline__Group__5__Impl"
    // ../dk.itu.bddcontracts.ui/src-gen/dk/itu/bddcontracts/ui/contentassist/antlr/internal/InternalGherkin.g:2474:1: rule__ScenarioOutline__Group__5__Impl : ( ( rule__ScenarioOutline__Group_5__0 )? ) ;
    public final void rule__ScenarioOutline__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.bddcontracts.ui/src-gen/dk/itu/bddcontracts/ui/contentassist/antlr/internal/InternalGherkin.g:2478:1: ( ( ( rule__ScenarioOutline__Group_5__0 )? ) )
            // ../dk.itu.bddcontracts.ui/src-gen/dk/itu/bddcontracts/ui/contentassist/antlr/internal/InternalGherkin.g:2479:1: ( ( rule__ScenarioOutline__Group_5__0 )? )
            {
            // ../dk.itu.bddcontracts.ui/src-gen/dk/itu/bddcontracts/ui/contentassist/antlr/internal/InternalGherkin.g:2479:1: ( ( rule__ScenarioOutline__Group_5__0 )? )
            // ../dk.itu.bddcontracts.ui/src-gen/dk/itu/bddcontracts/ui/contentassist/antlr/internal/InternalGherkin.g:2480:1: ( rule__ScenarioOutline__Group_5__0 )?
            {
             before(grammarAccess.getScenarioOutlineAccess().getGroup_5()); 
            // ../dk.itu.bddcontracts.ui/src-gen/dk/itu/bddcontracts/ui/contentassist/antlr/internal/InternalGherkin.g:2481:1: ( rule__ScenarioOutline__Group_5__0 )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==20) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // ../dk.itu.bddcontracts.ui/src-gen/dk/itu/bddcontracts/ui/contentassist/antlr/internal/InternalGherkin.g:2481:2: rule__ScenarioOutline__Group_5__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__ScenarioOutline__Group_5__0_in_rule__ScenarioOutline__Group__5__Impl4974);
                    rule__ScenarioOutline__Group_5__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getScenarioOutlineAccess().getGroup_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ScenarioOutline__Group__5__Impl"


    // $ANTLR start "rule__ScenarioOutline__Group__6"
    // ../dk.itu.bddcontracts.ui/src-gen/dk/itu/bddcontracts/ui/contentassist/antlr/internal/InternalGherkin.g:2491:1: rule__ScenarioOutline__Group__6 : rule__ScenarioOutline__Group__6__Impl rule__ScenarioOutline__Group__7 ;
    public final void rule__ScenarioOutline__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.bddcontracts.ui/src-gen/dk/itu/bddcontracts/ui/contentassist/antlr/internal/InternalGherkin.g:2495:1: ( rule__ScenarioOutline__Group__6__Impl rule__ScenarioOutline__Group__7 )
            // ../dk.itu.bddcontracts.ui/src-gen/dk/itu/bddcontracts/ui/contentassist/antlr/internal/InternalGherkin.g:2496:2: rule__ScenarioOutline__Group__6__Impl rule__ScenarioOutline__Group__7
            {
            pushFollow(FollowSets000.FOLLOW_rule__ScenarioOutline__Group__6__Impl_in_rule__ScenarioOutline__Group__65005);
            rule__ScenarioOutline__Group__6__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__ScenarioOutline__Group__7_in_rule__ScenarioOutline__Group__65008);
            rule__ScenarioOutline__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ScenarioOutline__Group__6"


    // $ANTLR start "rule__ScenarioOutline__Group__6__Impl"
    // ../dk.itu.bddcontracts.ui/src-gen/dk/itu/bddcontracts/ui/contentassist/antlr/internal/InternalGherkin.g:2503:1: rule__ScenarioOutline__Group__6__Impl : ( 'Then' ) ;
    public final void rule__ScenarioOutline__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.bddcontracts.ui/src-gen/dk/itu/bddcontracts/ui/contentassist/antlr/internal/InternalGherkin.g:2507:1: ( ( 'Then' ) )
            // ../dk.itu.bddcontracts.ui/src-gen/dk/itu/bddcontracts/ui/contentassist/antlr/internal/InternalGherkin.g:2508:1: ( 'Then' )
            {
            // ../dk.itu.bddcontracts.ui/src-gen/dk/itu/bddcontracts/ui/contentassist/antlr/internal/InternalGherkin.g:2508:1: ( 'Then' )
            // ../dk.itu.bddcontracts.ui/src-gen/dk/itu/bddcontracts/ui/contentassist/antlr/internal/InternalGherkin.g:2509:1: 'Then'
            {
             before(grammarAccess.getScenarioOutlineAccess().getThenKeyword_6()); 
            match(input,19,FollowSets000.FOLLOW_19_in_rule__ScenarioOutline__Group__6__Impl5036); 
             after(grammarAccess.getScenarioOutlineAccess().getThenKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ScenarioOutline__Group__6__Impl"


    // $ANTLR start "rule__ScenarioOutline__Group__7"
    // ../dk.itu.bddcontracts.ui/src-gen/dk/itu/bddcontracts/ui/contentassist/antlr/internal/InternalGherkin.g:2522:1: rule__ScenarioOutline__Group__7 : rule__ScenarioOutline__Group__7__Impl rule__ScenarioOutline__Group__8 ;
    public final void rule__ScenarioOutline__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.bddcontracts.ui/src-gen/dk/itu/bddcontracts/ui/contentassist/antlr/internal/InternalGherkin.g:2526:1: ( rule__ScenarioOutline__Group__7__Impl rule__ScenarioOutline__Group__8 )
            // ../dk.itu.bddcontracts.ui/src-gen/dk/itu/bddcontracts/ui/contentassist/antlr/internal/InternalGherkin.g:2527:2: rule__ScenarioOutline__Group__7__Impl rule__ScenarioOutline__Group__8
            {
            pushFollow(FollowSets000.FOLLOW_rule__ScenarioOutline__Group__7__Impl_in_rule__ScenarioOutline__Group__75067);
            rule__ScenarioOutline__Group__7__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__ScenarioOutline__Group__8_in_rule__ScenarioOutline__Group__75070);
            rule__ScenarioOutline__Group__8();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ScenarioOutline__Group__7"


    // $ANTLR start "rule__ScenarioOutline__Group__7__Impl"
    // ../dk.itu.bddcontracts.ui/src-gen/dk/itu/bddcontracts/ui/contentassist/antlr/internal/InternalGherkin.g:2534:1: rule__ScenarioOutline__Group__7__Impl : ( ( rule__ScenarioOutline__ThenBlocksAssignment_7 ) ) ;
    public final void rule__ScenarioOutline__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.bddcontracts.ui/src-gen/dk/itu/bddcontracts/ui/contentassist/antlr/internal/InternalGherkin.g:2538:1: ( ( ( rule__ScenarioOutline__ThenBlocksAssignment_7 ) ) )
            // ../dk.itu.bddcontracts.ui/src-gen/dk/itu/bddcontracts/ui/contentassist/antlr/internal/InternalGherkin.g:2539:1: ( ( rule__ScenarioOutline__ThenBlocksAssignment_7 ) )
            {
            // ../dk.itu.bddcontracts.ui/src-gen/dk/itu/bddcontracts/ui/contentassist/antlr/internal/InternalGherkin.g:2539:1: ( ( rule__ScenarioOutline__ThenBlocksAssignment_7 ) )
            // ../dk.itu.bddcontracts.ui/src-gen/dk/itu/bddcontracts/ui/contentassist/antlr/internal/InternalGherkin.g:2540:1: ( rule__ScenarioOutline__ThenBlocksAssignment_7 )
            {
             before(grammarAccess.getScenarioOutlineAccess().getThenBlocksAssignment_7()); 
            // ../dk.itu.bddcontracts.ui/src-gen/dk/itu/bddcontracts/ui/contentassist/antlr/internal/InternalGherkin.g:2541:1: ( rule__ScenarioOutline__ThenBlocksAssignment_7 )
            // ../dk.itu.bddcontracts.ui/src-gen/dk/itu/bddcontracts/ui/contentassist/antlr/internal/InternalGherkin.g:2541:2: rule__ScenarioOutline__ThenBlocksAssignment_7
            {
            pushFollow(FollowSets000.FOLLOW_rule__ScenarioOutline__ThenBlocksAssignment_7_in_rule__ScenarioOutline__Group__7__Impl5097);
            rule__ScenarioOutline__ThenBlocksAssignment_7();

            state._fsp--;


            }

             after(grammarAccess.getScenarioOutlineAccess().getThenBlocksAssignment_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ScenarioOutline__Group__7__Impl"


    // $ANTLR start "rule__ScenarioOutline__Group__8"
    // ../dk.itu.bddcontracts.ui/src-gen/dk/itu/bddcontracts/ui/contentassist/antlr/internal/InternalGherkin.g:2551:1: rule__ScenarioOutline__Group__8 : rule__ScenarioOutline__Group__8__Impl rule__ScenarioOutline__Group__9 ;
    public final void rule__ScenarioOutline__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.bddcontracts.ui/src-gen/dk/itu/bddcontracts/ui/contentassist/antlr/internal/InternalGherkin.g:2555:1: ( rule__ScenarioOutline__Group__8__Impl rule__ScenarioOutline__Group__9 )
            // ../dk.itu.bddcontracts.ui/src-gen/dk/itu/bddcontracts/ui/contentassist/antlr/internal/InternalGherkin.g:2556:2: rule__ScenarioOutline__Group__8__Impl rule__ScenarioOutline__Group__9
            {
            pushFollow(FollowSets000.FOLLOW_rule__ScenarioOutline__Group__8__Impl_in_rule__ScenarioOutline__Group__85127);
            rule__ScenarioOutline__Group__8__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__ScenarioOutline__Group__9_in_rule__ScenarioOutline__Group__85130);
            rule__ScenarioOutline__Group__9();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ScenarioOutline__Group__8"


    // $ANTLR start "rule__ScenarioOutline__Group__8__Impl"
    // ../dk.itu.bddcontracts.ui/src-gen/dk/itu/bddcontracts/ui/contentassist/antlr/internal/InternalGherkin.g:2563:1: rule__ScenarioOutline__Group__8__Impl : ( ( rule__ScenarioOutline__Group_8__0 )* ) ;
    public final void rule__ScenarioOutline__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.bddcontracts.ui/src-gen/dk/itu/bddcontracts/ui/contentassist/antlr/internal/InternalGherkin.g:2567:1: ( ( ( rule__ScenarioOutline__Group_8__0 )* ) )
            // ../dk.itu.bddcontracts.ui/src-gen/dk/itu/bddcontracts/ui/contentassist/antlr/internal/InternalGherkin.g:2568:1: ( ( rule__ScenarioOutline__Group_8__0 )* )
            {
            // ../dk.itu.bddcontracts.ui/src-gen/dk/itu/bddcontracts/ui/contentassist/antlr/internal/InternalGherkin.g:2568:1: ( ( rule__ScenarioOutline__Group_8__0 )* )
            // ../dk.itu.bddcontracts.ui/src-gen/dk/itu/bddcontracts/ui/contentassist/antlr/internal/InternalGherkin.g:2569:1: ( rule__ScenarioOutline__Group_8__0 )*
            {
             before(grammarAccess.getScenarioOutlineAccess().getGroup_8()); 
            // ../dk.itu.bddcontracts.ui/src-gen/dk/itu/bddcontracts/ui/contentassist/antlr/internal/InternalGherkin.g:2570:1: ( rule__ScenarioOutline__Group_8__0 )*
            loop26:
            do {
                int alt26=2;
                int LA26_0 = input.LA(1);

                if ( (LA26_0==14) ) {
                    alt26=1;
                }


                switch (alt26) {
            	case 1 :
            	    // ../dk.itu.bddcontracts.ui/src-gen/dk/itu/bddcontracts/ui/contentassist/antlr/internal/InternalGherkin.g:2570:2: rule__ScenarioOutline__Group_8__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__ScenarioOutline__Group_8__0_in_rule__ScenarioOutline__Group__8__Impl5157);
            	    rule__ScenarioOutline__Group_8__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop26;
                }
            } while (true);

             after(grammarAccess.getScenarioOutlineAccess().getGroup_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ScenarioOutline__Group__8__Impl"


    // $ANTLR start "rule__ScenarioOutline__Group__9"
    // ../dk.itu.bddcontracts.ui/src-gen/dk/itu/bddcontracts/ui/contentassist/antlr/internal/InternalGherkin.g:2580:1: rule__ScenarioOutline__Group__9 : rule__ScenarioOutline__Group__9__Impl rule__ScenarioOutline__Group__10 ;
    public final void rule__ScenarioOutline__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.bddcontracts.ui/src-gen/dk/itu/bddcontracts/ui/contentassist/antlr/internal/InternalGherkin.g:2584:1: ( rule__ScenarioOutline__Group__9__Impl rule__ScenarioOutline__Group__10 )
            // ../dk.itu.bddcontracts.ui/src-gen/dk/itu/bddcontracts/ui/contentassist/antlr/internal/InternalGherkin.g:2585:2: rule__ScenarioOutline__Group__9__Impl rule__ScenarioOutline__Group__10
            {
            pushFollow(FollowSets000.FOLLOW_rule__ScenarioOutline__Group__9__Impl_in_rule__ScenarioOutline__Group__95188);
            rule__ScenarioOutline__Group__9__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__ScenarioOutline__Group__10_in_rule__ScenarioOutline__Group__95191);
            rule__ScenarioOutline__Group__10();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ScenarioOutline__Group__9"


    // $ANTLR start "rule__ScenarioOutline__Group__9__Impl"
    // ../dk.itu.bddcontracts.ui/src-gen/dk/itu/bddcontracts/ui/contentassist/antlr/internal/InternalGherkin.g:2592:1: rule__ScenarioOutline__Group__9__Impl : ( 'Examples:' ) ;
    public final void rule__ScenarioOutline__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.bddcontracts.ui/src-gen/dk/itu/bddcontracts/ui/contentassist/antlr/internal/InternalGherkin.g:2596:1: ( ( 'Examples:' ) )
            // ../dk.itu.bddcontracts.ui/src-gen/dk/itu/bddcontracts/ui/contentassist/antlr/internal/InternalGherkin.g:2597:1: ( 'Examples:' )
            {
            // ../dk.itu.bddcontracts.ui/src-gen/dk/itu/bddcontracts/ui/contentassist/antlr/internal/InternalGherkin.g:2597:1: ( 'Examples:' )
            // ../dk.itu.bddcontracts.ui/src-gen/dk/itu/bddcontracts/ui/contentassist/antlr/internal/InternalGherkin.g:2598:1: 'Examples:'
            {
             before(grammarAccess.getScenarioOutlineAccess().getExamplesKeyword_9()); 
            match(input,22,FollowSets000.FOLLOW_22_in_rule__ScenarioOutline__Group__9__Impl5219); 
             after(grammarAccess.getScenarioOutlineAccess().getExamplesKeyword_9()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ScenarioOutline__Group__9__Impl"


    // $ANTLR start "rule__ScenarioOutline__Group__10"
    // ../dk.itu.bddcontracts.ui/src-gen/dk/itu/bddcontracts/ui/contentassist/antlr/internal/InternalGherkin.g:2611:1: rule__ScenarioOutline__Group__10 : rule__ScenarioOutline__Group__10__Impl rule__ScenarioOutline__Group__11 ;
    public final void rule__ScenarioOutline__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.bddcontracts.ui/src-gen/dk/itu/bddcontracts/ui/contentassist/antlr/internal/InternalGherkin.g:2615:1: ( rule__ScenarioOutline__Group__10__Impl rule__ScenarioOutline__Group__11 )
            // ../dk.itu.bddcontracts.ui/src-gen/dk/itu/bddcontracts/ui/contentassist/antlr/internal/InternalGherkin.g:2616:2: rule__ScenarioOutline__Group__10__Impl rule__ScenarioOutline__Group__11
            {
            pushFollow(FollowSets000.FOLLOW_rule__ScenarioOutline__Group__10__Impl_in_rule__ScenarioOutline__Group__105250);
            rule__ScenarioOutline__Group__10__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__ScenarioOutline__Group__11_in_rule__ScenarioOutline__Group__105253);
            rule__ScenarioOutline__Group__11();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ScenarioOutline__Group__10"


    // $ANTLR start "rule__ScenarioOutline__Group__10__Impl"
    // ../dk.itu.bddcontracts.ui/src-gen/dk/itu/bddcontracts/ui/contentassist/antlr/internal/InternalGherkin.g:2623:1: rule__ScenarioOutline__Group__10__Impl : ( ( rule__ScenarioOutline__ExamplesAssignment_10 ) ) ;
    public final void rule__ScenarioOutline__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.bddcontracts.ui/src-gen/dk/itu/bddcontracts/ui/contentassist/antlr/internal/InternalGherkin.g:2627:1: ( ( ( rule__ScenarioOutline__ExamplesAssignment_10 ) ) )
            // ../dk.itu.bddcontracts.ui/src-gen/dk/itu/bddcontracts/ui/contentassist/antlr/internal/InternalGherkin.g:2628:1: ( ( rule__ScenarioOutline__ExamplesAssignment_10 ) )
            {
            // ../dk.itu.bddcontracts.ui/src-gen/dk/itu/bddcontracts/ui/contentassist/antlr/internal/InternalGherkin.g:2628:1: ( ( rule__ScenarioOutline__ExamplesAssignment_10 ) )
            // ../dk.itu.bddcontracts.ui/src-gen/dk/itu/bddcontracts/ui/contentassist/antlr/internal/InternalGherkin.g:2629:1: ( rule__ScenarioOutline__ExamplesAssignment_10 )
            {
             before(grammarAccess.getScenarioOutlineAccess().getExamplesAssignment_10()); 
            // ../dk.itu.bddcontracts.ui/src-gen/dk/itu/bddcontracts/ui/contentassist/antlr/internal/InternalGherkin.g:2630:1: ( rule__ScenarioOutline__ExamplesAssignment_10 )
            // ../dk.itu.bddcontracts.ui/src-gen/dk/itu/bddcontracts/ui/contentassist/antlr/internal/InternalGherkin.g:2630:2: rule__ScenarioOutline__ExamplesAssignment_10
            {
            pushFollow(FollowSets000.FOLLOW_rule__ScenarioOutline__ExamplesAssignment_10_in_rule__ScenarioOutline__Group__10__Impl5280);
            rule__ScenarioOutline__ExamplesAssignment_10();

            state._fsp--;


            }

             after(grammarAccess.getScenarioOutlineAccess().getExamplesAssignment_10()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ScenarioOutline__Group__10__Impl"


    // $ANTLR start "rule__ScenarioOutline__Group__11"
    // ../dk.itu.bddcontracts.ui/src-gen/dk/itu/bddcontracts/ui/contentassist/antlr/internal/InternalGherkin.g:2640:1: rule__ScenarioOutline__Group__11 : rule__ScenarioOutline__Group__11__Impl ;
    public final void rule__ScenarioOutline__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.bddcontracts.ui/src-gen/dk/itu/bddcontracts/ui/contentassist/antlr/internal/InternalGherkin.g:2644:1: ( rule__ScenarioOutline__Group__11__Impl )
            // ../dk.itu.bddcontracts.ui/src-gen/dk/itu/bddcontracts/ui/contentassist/antlr/internal/InternalGherkin.g:2645:2: rule__ScenarioOutline__Group__11__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__ScenarioOutline__Group__11__Impl_in_rule__ScenarioOutline__Group__115310);
            rule__ScenarioOutline__Group__11__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ScenarioOutline__Group__11"


    // $ANTLR start "rule__ScenarioOutline__Group__11__Impl"
    // ../dk.itu.bddcontracts.ui/src-gen/dk/itu/bddcontracts/ui/contentassist/antlr/internal/InternalGherkin.g:2651:1: rule__ScenarioOutline__Group__11__Impl : ( ( rule__ScenarioOutline__ExamplesAssignment_11 )* ) ;
    public final void rule__ScenarioOutline__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.bddcontracts.ui/src-gen/dk/itu/bddcontracts/ui/contentassist/antlr/internal/InternalGherkin.g:2655:1: ( ( ( rule__ScenarioOutline__ExamplesAssignment_11 )* ) )
            // ../dk.itu.bddcontracts.ui/src-gen/dk/itu/bddcontracts/ui/contentassist/antlr/internal/InternalGherkin.g:2656:1: ( ( rule__ScenarioOutline__ExamplesAssignment_11 )* )
            {
            // ../dk.itu.bddcontracts.ui/src-gen/dk/itu/bddcontracts/ui/contentassist/antlr/internal/InternalGherkin.g:2656:1: ( ( rule__ScenarioOutline__ExamplesAssignment_11 )* )
            // ../dk.itu.bddcontracts.ui/src-gen/dk/itu/bddcontracts/ui/contentassist/antlr/internal/InternalGherkin.g:2657:1: ( rule__ScenarioOutline__ExamplesAssignment_11 )*
            {
             before(grammarAccess.getScenarioOutlineAccess().getExamplesAssignment_11()); 
            // ../dk.itu.bddcontracts.ui/src-gen/dk/itu/bddcontracts/ui/contentassist/antlr/internal/InternalGherkin.g:2658:1: ( rule__ScenarioOutline__ExamplesAssignment_11 )*
            loop27:
            do {
                int alt27=2;
                int LA27_0 = input.LA(1);

                if ( (LA27_0==25) ) {
                    alt27=1;
                }


                switch (alt27) {
            	case 1 :
            	    // ../dk.itu.bddcontracts.ui/src-gen/dk/itu/bddcontracts/ui/contentassist/antlr/internal/InternalGherkin.g:2658:2: rule__ScenarioOutline__ExamplesAssignment_11
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__ScenarioOutline__ExamplesAssignment_11_in_rule__ScenarioOutline__Group__11__Impl5337);
            	    rule__ScenarioOutline__ExamplesAssignment_11();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop27;
                }
            } while (true);

             after(grammarAccess.getScenarioOutlineAccess().getExamplesAssignment_11()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ScenarioOutline__Group__11__Impl"


    // $ANTLR start "rule__ScenarioOutline__Group_4__0"
    // ../dk.itu.bddcontracts.ui/src-gen/dk/itu/bddcontracts/ui/contentassist/antlr/internal/InternalGherkin.g:2692:1: rule__ScenarioOutline__Group_4__0 : rule__ScenarioOutline__Group_4__0__Impl rule__ScenarioOutline__Group_4__1 ;
    public final void rule__ScenarioOutline__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.bddcontracts.ui/src-gen/dk/itu/bddcontracts/ui/contentassist/antlr/internal/InternalGherkin.g:2696:1: ( rule__ScenarioOutline__Group_4__0__Impl rule__ScenarioOutline__Group_4__1 )
            // ../dk.itu.bddcontracts.ui/src-gen/dk/itu/bddcontracts/ui/contentassist/antlr/internal/InternalGherkin.g:2697:2: rule__ScenarioOutline__Group_4__0__Impl rule__ScenarioOutline__Group_4__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__ScenarioOutline__Group_4__0__Impl_in_rule__ScenarioOutline__Group_4__05392);
            rule__ScenarioOutline__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__ScenarioOutline__Group_4__1_in_rule__ScenarioOutline__Group_4__05395);
            rule__ScenarioOutline__Group_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ScenarioOutline__Group_4__0"


    // $ANTLR start "rule__ScenarioOutline__Group_4__0__Impl"
    // ../dk.itu.bddcontracts.ui/src-gen/dk/itu/bddcontracts/ui/contentassist/antlr/internal/InternalGherkin.g:2704:1: rule__ScenarioOutline__Group_4__0__Impl : ( 'And' ) ;
    public final void rule__ScenarioOutline__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.bddcontracts.ui/src-gen/dk/itu/bddcontracts/ui/contentassist/antlr/internal/InternalGherkin.g:2708:1: ( ( 'And' ) )
            // ../dk.itu.bddcontracts.ui/src-gen/dk/itu/bddcontracts/ui/contentassist/antlr/internal/InternalGherkin.g:2709:1: ( 'And' )
            {
            // ../dk.itu.bddcontracts.ui/src-gen/dk/itu/bddcontracts/ui/contentassist/antlr/internal/InternalGherkin.g:2709:1: ( 'And' )
            // ../dk.itu.bddcontracts.ui/src-gen/dk/itu/bddcontracts/ui/contentassist/antlr/internal/InternalGherkin.g:2710:1: 'And'
            {
             before(grammarAccess.getScenarioOutlineAccess().getAndKeyword_4_0()); 
            match(input,14,FollowSets000.FOLLOW_14_in_rule__ScenarioOutline__Group_4__0__Impl5423); 
             after(grammarAccess.getScenarioOutlineAccess().getAndKeyword_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ScenarioOutline__Group_4__0__Impl"


    // $ANTLR start "rule__ScenarioOutline__Group_4__1"
    // ../dk.itu.bddcontracts.ui/src-gen/dk/itu/bddcontracts/ui/contentassist/antlr/internal/InternalGherkin.g:2723:1: rule__ScenarioOutline__Group_4__1 : rule__ScenarioOutline__Group_4__1__Impl ;
    public final void rule__ScenarioOutline__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.bddcontracts.ui/src-gen/dk/itu/bddcontracts/ui/contentassist/antlr/internal/InternalGherkin.g:2727:1: ( rule__ScenarioOutline__Group_4__1__Impl )
            // ../dk.itu.bddcontracts.ui/src-gen/dk/itu/bddcontracts/ui/contentassist/antlr/internal/InternalGherkin.g:2728:2: rule__ScenarioOutline__Group_4__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__ScenarioOutline__Group_4__1__Impl_in_rule__ScenarioOutline__Group_4__15454);
            rule__ScenarioOutline__Group_4__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ScenarioOutline__Group_4__1"


    // $ANTLR start "rule__ScenarioOutline__Group_4__1__Impl"
    // ../dk.itu.bddcontracts.ui/src-gen/dk/itu/bddcontracts/ui/contentassist/antlr/internal/InternalGherkin.g:2734:1: rule__ScenarioOutline__Group_4__1__Impl : ( ( rule__ScenarioOutline__GivenBlocksAssignment_4_1 ) ) ;
    public final void rule__ScenarioOutline__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.bddcontracts.ui/src-gen/dk/itu/bddcontracts/ui/contentassist/antlr/internal/InternalGherkin.g:2738:1: ( ( ( rule__ScenarioOutline__GivenBlocksAssignment_4_1 ) ) )
            // ../dk.itu.bddcontracts.ui/src-gen/dk/itu/bddcontracts/ui/contentassist/antlr/internal/InternalGherkin.g:2739:1: ( ( rule__ScenarioOutline__GivenBlocksAssignment_4_1 ) )
            {
            // ../dk.itu.bddcontracts.ui/src-gen/dk/itu/bddcontracts/ui/contentassist/antlr/internal/InternalGherkin.g:2739:1: ( ( rule__ScenarioOutline__GivenBlocksAssignment_4_1 ) )
            // ../dk.itu.bddcontracts.ui/src-gen/dk/itu/bddcontracts/ui/contentassist/antlr/internal/InternalGherkin.g:2740:1: ( rule__ScenarioOutline__GivenBlocksAssignment_4_1 )
            {
             before(grammarAccess.getScenarioOutlineAccess().getGivenBlocksAssignment_4_1()); 
            // ../dk.itu.bddcontracts.ui/src-gen/dk/itu/bddcontracts/ui/contentassist/antlr/internal/InternalGherkin.g:2741:1: ( rule__ScenarioOutline__GivenBlocksAssignment_4_1 )
            // ../dk.itu.bddcontracts.ui/src-gen/dk/itu/bddcontracts/ui/contentassist/antlr/internal/InternalGherkin.g:2741:2: rule__ScenarioOutline__GivenBlocksAssignment_4_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__ScenarioOutline__GivenBlocksAssignment_4_1_in_rule__ScenarioOutline__Group_4__1__Impl5481);
            rule__ScenarioOutline__GivenBlocksAssignment_4_1();

            state._fsp--;


            }

             after(grammarAccess.getScenarioOutlineAccess().getGivenBlocksAssignment_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ScenarioOutline__Group_4__1__Impl"


    // $ANTLR start "rule__ScenarioOutline__Group_5__0"
    // ../dk.itu.bddcontracts.ui/src-gen/dk/itu/bddcontracts/ui/contentassist/antlr/internal/InternalGherkin.g:2755:1: rule__ScenarioOutline__Group_5__0 : rule__ScenarioOutline__Group_5__0__Impl rule__ScenarioOutline__Group_5__1 ;
    public final void rule__ScenarioOutline__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.bddcontracts.ui/src-gen/dk/itu/bddcontracts/ui/contentassist/antlr/internal/InternalGherkin.g:2759:1: ( rule__ScenarioOutline__Group_5__0__Impl rule__ScenarioOutline__Group_5__1 )
            // ../dk.itu.bddcontracts.ui/src-gen/dk/itu/bddcontracts/ui/contentassist/antlr/internal/InternalGherkin.g:2760:2: rule__ScenarioOutline__Group_5__0__Impl rule__ScenarioOutline__Group_5__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__ScenarioOutline__Group_5__0__Impl_in_rule__ScenarioOutline__Group_5__05515);
            rule__ScenarioOutline__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__ScenarioOutline__Group_5__1_in_rule__ScenarioOutline__Group_5__05518);
            rule__ScenarioOutline__Group_5__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ScenarioOutline__Group_5__0"


    // $ANTLR start "rule__ScenarioOutline__Group_5__0__Impl"
    // ../dk.itu.bddcontracts.ui/src-gen/dk/itu/bddcontracts/ui/contentassist/antlr/internal/InternalGherkin.g:2767:1: rule__ScenarioOutline__Group_5__0__Impl : ( 'When' ) ;
    public final void rule__ScenarioOutline__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.bddcontracts.ui/src-gen/dk/itu/bddcontracts/ui/contentassist/antlr/internal/InternalGherkin.g:2771:1: ( ( 'When' ) )
            // ../dk.itu.bddcontracts.ui/src-gen/dk/itu/bddcontracts/ui/contentassist/antlr/internal/InternalGherkin.g:2772:1: ( 'When' )
            {
            // ../dk.itu.bddcontracts.ui/src-gen/dk/itu/bddcontracts/ui/contentassist/antlr/internal/InternalGherkin.g:2772:1: ( 'When' )
            // ../dk.itu.bddcontracts.ui/src-gen/dk/itu/bddcontracts/ui/contentassist/antlr/internal/InternalGherkin.g:2773:1: 'When'
            {
             before(grammarAccess.getScenarioOutlineAccess().getWhenKeyword_5_0()); 
            match(input,20,FollowSets000.FOLLOW_20_in_rule__ScenarioOutline__Group_5__0__Impl5546); 
             after(grammarAccess.getScenarioOutlineAccess().getWhenKeyword_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ScenarioOutline__Group_5__0__Impl"


    // $ANTLR start "rule__ScenarioOutline__Group_5__1"
    // ../dk.itu.bddcontracts.ui/src-gen/dk/itu/bddcontracts/ui/contentassist/antlr/internal/InternalGherkin.g:2786:1: rule__ScenarioOutline__Group_5__1 : rule__ScenarioOutline__Group_5__1__Impl rule__ScenarioOutline__Group_5__2 ;
    public final void rule__ScenarioOutline__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.bddcontracts.ui/src-gen/dk/itu/bddcontracts/ui/contentassist/antlr/internal/InternalGherkin.g:2790:1: ( rule__ScenarioOutline__Group_5__1__Impl rule__ScenarioOutline__Group_5__2 )
            // ../dk.itu.bddcontracts.ui/src-gen/dk/itu/bddcontracts/ui/contentassist/antlr/internal/InternalGherkin.g:2791:2: rule__ScenarioOutline__Group_5__1__Impl rule__ScenarioOutline__Group_5__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__ScenarioOutline__Group_5__1__Impl_in_rule__ScenarioOutline__Group_5__15577);
            rule__ScenarioOutline__Group_5__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__ScenarioOutline__Group_5__2_in_rule__ScenarioOutline__Group_5__15580);
            rule__ScenarioOutline__Group_5__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ScenarioOutline__Group_5__1"


    // $ANTLR start "rule__ScenarioOutline__Group_5__1__Impl"
    // ../dk.itu.bddcontracts.ui/src-gen/dk/itu/bddcontracts/ui/contentassist/antlr/internal/InternalGherkin.g:2798:1: rule__ScenarioOutline__Group_5__1__Impl : ( ( rule__ScenarioOutline__WhenBlocksAssignment_5_1 ) ) ;
    public final void rule__ScenarioOutline__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.bddcontracts.ui/src-gen/dk/itu/bddcontracts/ui/contentassist/antlr/internal/InternalGherkin.g:2802:1: ( ( ( rule__ScenarioOutline__WhenBlocksAssignment_5_1 ) ) )
            // ../dk.itu.bddcontracts.ui/src-gen/dk/itu/bddcontracts/ui/contentassist/antlr/internal/InternalGherkin.g:2803:1: ( ( rule__ScenarioOutline__WhenBlocksAssignment_5_1 ) )
            {
            // ../dk.itu.bddcontracts.ui/src-gen/dk/itu/bddcontracts/ui/contentassist/antlr/internal/InternalGherkin.g:2803:1: ( ( rule__ScenarioOutline__WhenBlocksAssignment_5_1 ) )
            // ../dk.itu.bddcontracts.ui/src-gen/dk/itu/bddcontracts/ui/contentassist/antlr/internal/InternalGherkin.g:2804:1: ( rule__ScenarioOutline__WhenBlocksAssignment_5_1 )
            {
             before(grammarAccess.getScenarioOutlineAccess().getWhenBlocksAssignment_5_1()); 
            // ../dk.itu.bddcontracts.ui/src-gen/dk/itu/bddcontracts/ui/contentassist/antlr/internal/InternalGherkin.g:2805:1: ( rule__ScenarioOutline__WhenBlocksAssignment_5_1 )
            // ../dk.itu.bddcontracts.ui/src-gen/dk/itu/bddcontracts/ui/contentassist/antlr/internal/InternalGherkin.g:2805:2: rule__ScenarioOutline__WhenBlocksAssignment_5_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__ScenarioOutline__WhenBlocksAssignment_5_1_in_rule__ScenarioOutline__Group_5__1__Impl5607);
            rule__ScenarioOutline__WhenBlocksAssignment_5_1();

            state._fsp--;


            }

             after(grammarAccess.getScenarioOutlineAccess().getWhenBlocksAssignment_5_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ScenarioOutline__Group_5__1__Impl"


    // $ANTLR start "rule__ScenarioOutline__Group_5__2"
    // ../dk.itu.bddcontracts.ui/src-gen/dk/itu/bddcontracts/ui/contentassist/antlr/internal/InternalGherkin.g:2815:1: rule__ScenarioOutline__Group_5__2 : rule__ScenarioOutline__Group_5__2__Impl ;
    public final void rule__ScenarioOutline__Group_5__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.bddcontracts.ui/src-gen/dk/itu/bddcontracts/ui/contentassist/antlr/internal/InternalGherkin.g:2819:1: ( rule__ScenarioOutline__Group_5__2__Impl )
            // ../dk.itu.bddcontracts.ui/src-gen/dk/itu/bddcontracts/ui/contentassist/antlr/internal/InternalGherkin.g:2820:2: rule__ScenarioOutline__Group_5__2__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__ScenarioOutline__Group_5__2__Impl_in_rule__ScenarioOutline__Group_5__25637);
            rule__ScenarioOutline__Group_5__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ScenarioOutline__Group_5__2"


    // $ANTLR start "rule__ScenarioOutline__Group_5__2__Impl"
    // ../dk.itu.bddcontracts.ui/src-gen/dk/itu/bddcontracts/ui/contentassist/antlr/internal/InternalGherkin.g:2826:1: rule__ScenarioOutline__Group_5__2__Impl : ( ( rule__ScenarioOutline__Group_5_2__0 )* ) ;
    public final void rule__ScenarioOutline__Group_5__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.bddcontracts.ui/src-gen/dk/itu/bddcontracts/ui/contentassist/antlr/internal/InternalGherkin.g:2830:1: ( ( ( rule__ScenarioOutline__Group_5_2__0 )* ) )
            // ../dk.itu.bddcontracts.ui/src-gen/dk/itu/bddcontracts/ui/contentassist/antlr/internal/InternalGherkin.g:2831:1: ( ( rule__ScenarioOutline__Group_5_2__0 )* )
            {
            // ../dk.itu.bddcontracts.ui/src-gen/dk/itu/bddcontracts/ui/contentassist/antlr/internal/InternalGherkin.g:2831:1: ( ( rule__ScenarioOutline__Group_5_2__0 )* )
            // ../dk.itu.bddcontracts.ui/src-gen/dk/itu/bddcontracts/ui/contentassist/antlr/internal/InternalGherkin.g:2832:1: ( rule__ScenarioOutline__Group_5_2__0 )*
            {
             before(grammarAccess.getScenarioOutlineAccess().getGroup_5_2()); 
            // ../dk.itu.bddcontracts.ui/src-gen/dk/itu/bddcontracts/ui/contentassist/antlr/internal/InternalGherkin.g:2833:1: ( rule__ScenarioOutline__Group_5_2__0 )*
            loop28:
            do {
                int alt28=2;
                int LA28_0 = input.LA(1);

                if ( (LA28_0==14) ) {
                    alt28=1;
                }


                switch (alt28) {
            	case 1 :
            	    // ../dk.itu.bddcontracts.ui/src-gen/dk/itu/bddcontracts/ui/contentassist/antlr/internal/InternalGherkin.g:2833:2: rule__ScenarioOutline__Group_5_2__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__ScenarioOutline__Group_5_2__0_in_rule__ScenarioOutline__Group_5__2__Impl5664);
            	    rule__ScenarioOutline__Group_5_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop28;
                }
            } while (true);

             after(grammarAccess.getScenarioOutlineAccess().getGroup_5_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ScenarioOutline__Group_5__2__Impl"


    // $ANTLR start "rule__ScenarioOutline__Group_5_2__0"
    // ../dk.itu.bddcontracts.ui/src-gen/dk/itu/bddcontracts/ui/contentassist/antlr/internal/InternalGherkin.g:2849:1: rule__ScenarioOutline__Group_5_2__0 : rule__ScenarioOutline__Group_5_2__0__Impl rule__ScenarioOutline__Group_5_2__1 ;
    public final void rule__ScenarioOutline__Group_5_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.bddcontracts.ui/src-gen/dk/itu/bddcontracts/ui/contentassist/antlr/internal/InternalGherkin.g:2853:1: ( rule__ScenarioOutline__Group_5_2__0__Impl rule__ScenarioOutline__Group_5_2__1 )
            // ../dk.itu.bddcontracts.ui/src-gen/dk/itu/bddcontracts/ui/contentassist/antlr/internal/InternalGherkin.g:2854:2: rule__ScenarioOutline__Group_5_2__0__Impl rule__ScenarioOutline__Group_5_2__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__ScenarioOutline__Group_5_2__0__Impl_in_rule__ScenarioOutline__Group_5_2__05701);
            rule__ScenarioOutline__Group_5_2__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__ScenarioOutline__Group_5_2__1_in_rule__ScenarioOutline__Group_5_2__05704);
            rule__ScenarioOutline__Group_5_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ScenarioOutline__Group_5_2__0"


    // $ANTLR start "rule__ScenarioOutline__Group_5_2__0__Impl"
    // ../dk.itu.bddcontracts.ui/src-gen/dk/itu/bddcontracts/ui/contentassist/antlr/internal/InternalGherkin.g:2861:1: rule__ScenarioOutline__Group_5_2__0__Impl : ( 'And' ) ;
    public final void rule__ScenarioOutline__Group_5_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.bddcontracts.ui/src-gen/dk/itu/bddcontracts/ui/contentassist/antlr/internal/InternalGherkin.g:2865:1: ( ( 'And' ) )
            // ../dk.itu.bddcontracts.ui/src-gen/dk/itu/bddcontracts/ui/contentassist/antlr/internal/InternalGherkin.g:2866:1: ( 'And' )
            {
            // ../dk.itu.bddcontracts.ui/src-gen/dk/itu/bddcontracts/ui/contentassist/antlr/internal/InternalGherkin.g:2866:1: ( 'And' )
            // ../dk.itu.bddcontracts.ui/src-gen/dk/itu/bddcontracts/ui/contentassist/antlr/internal/InternalGherkin.g:2867:1: 'And'
            {
             before(grammarAccess.getScenarioOutlineAccess().getAndKeyword_5_2_0()); 
            match(input,14,FollowSets000.FOLLOW_14_in_rule__ScenarioOutline__Group_5_2__0__Impl5732); 
             after(grammarAccess.getScenarioOutlineAccess().getAndKeyword_5_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ScenarioOutline__Group_5_2__0__Impl"


    // $ANTLR start "rule__ScenarioOutline__Group_5_2__1"
    // ../dk.itu.bddcontracts.ui/src-gen/dk/itu/bddcontracts/ui/contentassist/antlr/internal/InternalGherkin.g:2880:1: rule__ScenarioOutline__Group_5_2__1 : rule__ScenarioOutline__Group_5_2__1__Impl ;
    public final void rule__ScenarioOutline__Group_5_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.bddcontracts.ui/src-gen/dk/itu/bddcontracts/ui/contentassist/antlr/internal/InternalGherkin.g:2884:1: ( rule__ScenarioOutline__Group_5_2__1__Impl )
            // ../dk.itu.bddcontracts.ui/src-gen/dk/itu/bddcontracts/ui/contentassist/antlr/internal/InternalGherkin.g:2885:2: rule__ScenarioOutline__Group_5_2__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__ScenarioOutline__Group_5_2__1__Impl_in_rule__ScenarioOutline__Group_5_2__15763);
            rule__ScenarioOutline__Group_5_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ScenarioOutline__Group_5_2__1"


    // $ANTLR start "rule__ScenarioOutline__Group_5_2__1__Impl"
    // ../dk.itu.bddcontracts.ui/src-gen/dk/itu/bddcontracts/ui/contentassist/antlr/internal/InternalGherkin.g:2891:1: rule__ScenarioOutline__Group_5_2__1__Impl : ( ( rule__ScenarioOutline__WhenBlocksAssignment_5_2_1 ) ) ;
    public final void rule__ScenarioOutline__Group_5_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.bddcontracts.ui/src-gen/dk/itu/bddcontracts/ui/contentassist/antlr/internal/InternalGherkin.g:2895:1: ( ( ( rule__ScenarioOutline__WhenBlocksAssignment_5_2_1 ) ) )
            // ../dk.itu.bddcontracts.ui/src-gen/dk/itu/bddcontracts/ui/contentassist/antlr/internal/InternalGherkin.g:2896:1: ( ( rule__ScenarioOutline__WhenBlocksAssignment_5_2_1 ) )
            {
            // ../dk.itu.bddcontracts.ui/src-gen/dk/itu/bddcontracts/ui/contentassist/antlr/internal/InternalGherkin.g:2896:1: ( ( rule__ScenarioOutline__WhenBlocksAssignment_5_2_1 ) )
            // ../dk.itu.bddcontracts.ui/src-gen/dk/itu/bddcontracts/ui/contentassist/antlr/internal/InternalGherkin.g:2897:1: ( rule__ScenarioOutline__WhenBlocksAssignment_5_2_1 )
            {
             before(grammarAccess.getScenarioOutlineAccess().getWhenBlocksAssignment_5_2_1()); 
            // ../dk.itu.bddcontracts.ui/src-gen/dk/itu/bddcontracts/ui/contentassist/antlr/internal/InternalGherkin.g:2898:1: ( rule__ScenarioOutline__WhenBlocksAssignment_5_2_1 )
            // ../dk.itu.bddcontracts.ui/src-gen/dk/itu/bddcontracts/ui/contentassist/antlr/internal/InternalGherkin.g:2898:2: rule__ScenarioOutline__WhenBlocksAssignment_5_2_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__ScenarioOutline__WhenBlocksAssignment_5_2_1_in_rule__ScenarioOutline__Group_5_2__1__Impl5790);
            rule__ScenarioOutline__WhenBlocksAssignment_5_2_1();

            state._fsp--;


            }

             after(grammarAccess.getScenarioOutlineAccess().getWhenBlocksAssignment_5_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ScenarioOutline__Group_5_2__1__Impl"


    // $ANTLR start "rule__ScenarioOutline__Group_8__0"
    // ../dk.itu.bddcontracts.ui/src-gen/dk/itu/bddcontracts/ui/contentassist/antlr/internal/InternalGherkin.g:2912:1: rule__ScenarioOutline__Group_8__0 : rule__ScenarioOutline__Group_8__0__Impl rule__ScenarioOutline__Group_8__1 ;
    public final void rule__ScenarioOutline__Group_8__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.bddcontracts.ui/src-gen/dk/itu/bddcontracts/ui/contentassist/antlr/internal/InternalGherkin.g:2916:1: ( rule__ScenarioOutline__Group_8__0__Impl rule__ScenarioOutline__Group_8__1 )
            // ../dk.itu.bddcontracts.ui/src-gen/dk/itu/bddcontracts/ui/contentassist/antlr/internal/InternalGherkin.g:2917:2: rule__ScenarioOutline__Group_8__0__Impl rule__ScenarioOutline__Group_8__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__ScenarioOutline__Group_8__0__Impl_in_rule__ScenarioOutline__Group_8__05824);
            rule__ScenarioOutline__Group_8__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__ScenarioOutline__Group_8__1_in_rule__ScenarioOutline__Group_8__05827);
            rule__ScenarioOutline__Group_8__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ScenarioOutline__Group_8__0"


    // $ANTLR start "rule__ScenarioOutline__Group_8__0__Impl"
    // ../dk.itu.bddcontracts.ui/src-gen/dk/itu/bddcontracts/ui/contentassist/antlr/internal/InternalGherkin.g:2924:1: rule__ScenarioOutline__Group_8__0__Impl : ( 'And' ) ;
    public final void rule__ScenarioOutline__Group_8__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.bddcontracts.ui/src-gen/dk/itu/bddcontracts/ui/contentassist/antlr/internal/InternalGherkin.g:2928:1: ( ( 'And' ) )
            // ../dk.itu.bddcontracts.ui/src-gen/dk/itu/bddcontracts/ui/contentassist/antlr/internal/InternalGherkin.g:2929:1: ( 'And' )
            {
            // ../dk.itu.bddcontracts.ui/src-gen/dk/itu/bddcontracts/ui/contentassist/antlr/internal/InternalGherkin.g:2929:1: ( 'And' )
            // ../dk.itu.bddcontracts.ui/src-gen/dk/itu/bddcontracts/ui/contentassist/antlr/internal/InternalGherkin.g:2930:1: 'And'
            {
             before(grammarAccess.getScenarioOutlineAccess().getAndKeyword_8_0()); 
            match(input,14,FollowSets000.FOLLOW_14_in_rule__ScenarioOutline__Group_8__0__Impl5855); 
             after(grammarAccess.getScenarioOutlineAccess().getAndKeyword_8_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ScenarioOutline__Group_8__0__Impl"


    // $ANTLR start "rule__ScenarioOutline__Group_8__1"
    // ../dk.itu.bddcontracts.ui/src-gen/dk/itu/bddcontracts/ui/contentassist/antlr/internal/InternalGherkin.g:2943:1: rule__ScenarioOutline__Group_8__1 : rule__ScenarioOutline__Group_8__1__Impl ;
    public final void rule__ScenarioOutline__Group_8__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.bddcontracts.ui/src-gen/dk/itu/bddcontracts/ui/contentassist/antlr/internal/InternalGherkin.g:2947:1: ( rule__ScenarioOutline__Group_8__1__Impl )
            // ../dk.itu.bddcontracts.ui/src-gen/dk/itu/bddcontracts/ui/contentassist/antlr/internal/InternalGherkin.g:2948:2: rule__ScenarioOutline__Group_8__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__ScenarioOutline__Group_8__1__Impl_in_rule__ScenarioOutline__Group_8__15886);
            rule__ScenarioOutline__Group_8__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ScenarioOutline__Group_8__1"


    // $ANTLR start "rule__ScenarioOutline__Group_8__1__Impl"
    // ../dk.itu.bddcontracts.ui/src-gen/dk/itu/bddcontracts/ui/contentassist/antlr/internal/InternalGherkin.g:2954:1: rule__ScenarioOutline__Group_8__1__Impl : ( ( rule__ScenarioOutline__ThenBlocksAssignment_8_1 ) ) ;
    public final void rule__ScenarioOutline__Group_8__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.bddcontracts.ui/src-gen/dk/itu/bddcontracts/ui/contentassist/antlr/internal/InternalGherkin.g:2958:1: ( ( ( rule__ScenarioOutline__ThenBlocksAssignment_8_1 ) ) )
            // ../dk.itu.bddcontracts.ui/src-gen/dk/itu/bddcontracts/ui/contentassist/antlr/internal/InternalGherkin.g:2959:1: ( ( rule__ScenarioOutline__ThenBlocksAssignment_8_1 ) )
            {
            // ../dk.itu.bddcontracts.ui/src-gen/dk/itu/bddcontracts/ui/contentassist/antlr/internal/InternalGherkin.g:2959:1: ( ( rule__ScenarioOutline__ThenBlocksAssignment_8_1 ) )
            // ../dk.itu.bddcontracts.ui/src-gen/dk/itu/bddcontracts/ui/contentassist/antlr/internal/InternalGherkin.g:2960:1: ( rule__ScenarioOutline__ThenBlocksAssignment_8_1 )
            {
             before(grammarAccess.getScenarioOutlineAccess().getThenBlocksAssignment_8_1()); 
            // ../dk.itu.bddcontracts.ui/src-gen/dk/itu/bddcontracts/ui/contentassist/antlr/internal/InternalGherkin.g:2961:1: ( rule__ScenarioOutline__ThenBlocksAssignment_8_1 )
            // ../dk.itu.bddcontracts.ui/src-gen/dk/itu/bddcontracts/ui/contentassist/antlr/internal/InternalGherkin.g:2961:2: rule__ScenarioOutline__ThenBlocksAssignment_8_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__ScenarioOutline__ThenBlocksAssignment_8_1_in_rule__ScenarioOutline__Group_8__1__Impl5913);
            rule__ScenarioOutline__ThenBlocksAssignment_8_1();

            state._fsp--;


            }

             after(grammarAccess.getScenarioOutlineAccess().getThenBlocksAssignment_8_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ScenarioOutline__Group_8__1__Impl"


    // $ANTLR start "rule__Reference__Group__0"
    // ../dk.itu.bddcontracts.ui/src-gen/dk/itu/bddcontracts/ui/contentassist/antlr/internal/InternalGherkin.g:2975:1: rule__Reference__Group__0 : rule__Reference__Group__0__Impl rule__Reference__Group__1 ;
    public final void rule__Reference__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.bddcontracts.ui/src-gen/dk/itu/bddcontracts/ui/contentassist/antlr/internal/InternalGherkin.g:2979:1: ( rule__Reference__Group__0__Impl rule__Reference__Group__1 )
            // ../dk.itu.bddcontracts.ui/src-gen/dk/itu/bddcontracts/ui/contentassist/antlr/internal/InternalGherkin.g:2980:2: rule__Reference__Group__0__Impl rule__Reference__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Reference__Group__0__Impl_in_rule__Reference__Group__05947);
            rule__Reference__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Reference__Group__1_in_rule__Reference__Group__05950);
            rule__Reference__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Reference__Group__0"


    // $ANTLR start "rule__Reference__Group__0__Impl"
    // ../dk.itu.bddcontracts.ui/src-gen/dk/itu/bddcontracts/ui/contentassist/antlr/internal/InternalGherkin.g:2987:1: rule__Reference__Group__0__Impl : ( () ) ;
    public final void rule__Reference__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.bddcontracts.ui/src-gen/dk/itu/bddcontracts/ui/contentassist/antlr/internal/InternalGherkin.g:2991:1: ( ( () ) )
            // ../dk.itu.bddcontracts.ui/src-gen/dk/itu/bddcontracts/ui/contentassist/antlr/internal/InternalGherkin.g:2992:1: ( () )
            {
            // ../dk.itu.bddcontracts.ui/src-gen/dk/itu/bddcontracts/ui/contentassist/antlr/internal/InternalGherkin.g:2992:1: ( () )
            // ../dk.itu.bddcontracts.ui/src-gen/dk/itu/bddcontracts/ui/contentassist/antlr/internal/InternalGherkin.g:2993:1: ()
            {
             before(grammarAccess.getReferenceAccess().getReferenceAction_0()); 
            // ../dk.itu.bddcontracts.ui/src-gen/dk/itu/bddcontracts/ui/contentassist/antlr/internal/InternalGherkin.g:2994:1: ()
            // ../dk.itu.bddcontracts.ui/src-gen/dk/itu/bddcontracts/ui/contentassist/antlr/internal/InternalGherkin.g:2996:1: 
            {
            }

             after(grammarAccess.getReferenceAccess().getReferenceAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Reference__Group__0__Impl"


    // $ANTLR start "rule__Reference__Group__1"
    // ../dk.itu.bddcontracts.ui/src-gen/dk/itu/bddcontracts/ui/contentassist/antlr/internal/InternalGherkin.g:3006:1: rule__Reference__Group__1 : rule__Reference__Group__1__Impl rule__Reference__Group__2 ;
    public final void rule__Reference__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.bddcontracts.ui/src-gen/dk/itu/bddcontracts/ui/contentassist/antlr/internal/InternalGherkin.g:3010:1: ( rule__Reference__Group__1__Impl rule__Reference__Group__2 )
            // ../dk.itu.bddcontracts.ui/src-gen/dk/itu/bddcontracts/ui/contentassist/antlr/internal/InternalGherkin.g:3011:2: rule__Reference__Group__1__Impl rule__Reference__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Reference__Group__1__Impl_in_rule__Reference__Group__16008);
            rule__Reference__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Reference__Group__2_in_rule__Reference__Group__16011);
            rule__Reference__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Reference__Group__1"


    // $ANTLR start "rule__Reference__Group__1__Impl"
    // ../dk.itu.bddcontracts.ui/src-gen/dk/itu/bddcontracts/ui/contentassist/antlr/internal/InternalGherkin.g:3018:1: rule__Reference__Group__1__Impl : ( '<' ) ;
    public final void rule__Reference__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.bddcontracts.ui/src-gen/dk/itu/bddcontracts/ui/contentassist/antlr/internal/InternalGherkin.g:3022:1: ( ( '<' ) )
            // ../dk.itu.bddcontracts.ui/src-gen/dk/itu/bddcontracts/ui/contentassist/antlr/internal/InternalGherkin.g:3023:1: ( '<' )
            {
            // ../dk.itu.bddcontracts.ui/src-gen/dk/itu/bddcontracts/ui/contentassist/antlr/internal/InternalGherkin.g:3023:1: ( '<' )
            // ../dk.itu.bddcontracts.ui/src-gen/dk/itu/bddcontracts/ui/contentassist/antlr/internal/InternalGherkin.g:3024:1: '<'
            {
             before(grammarAccess.getReferenceAccess().getLessThanSignKeyword_1()); 
            match(input,23,FollowSets000.FOLLOW_23_in_rule__Reference__Group__1__Impl6039); 
             after(grammarAccess.getReferenceAccess().getLessThanSignKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Reference__Group__1__Impl"


    // $ANTLR start "rule__Reference__Group__2"
    // ../dk.itu.bddcontracts.ui/src-gen/dk/itu/bddcontracts/ui/contentassist/antlr/internal/InternalGherkin.g:3037:1: rule__Reference__Group__2 : rule__Reference__Group__2__Impl rule__Reference__Group__3 ;
    public final void rule__Reference__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.bddcontracts.ui/src-gen/dk/itu/bddcontracts/ui/contentassist/antlr/internal/InternalGherkin.g:3041:1: ( rule__Reference__Group__2__Impl rule__Reference__Group__3 )
            // ../dk.itu.bddcontracts.ui/src-gen/dk/itu/bddcontracts/ui/contentassist/antlr/internal/InternalGherkin.g:3042:2: rule__Reference__Group__2__Impl rule__Reference__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__Reference__Group__2__Impl_in_rule__Reference__Group__26070);
            rule__Reference__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Reference__Group__3_in_rule__Reference__Group__26073);
            rule__Reference__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Reference__Group__2"


    // $ANTLR start "rule__Reference__Group__2__Impl"
    // ../dk.itu.bddcontracts.ui/src-gen/dk/itu/bddcontracts/ui/contentassist/antlr/internal/InternalGherkin.g:3049:1: rule__Reference__Group__2__Impl : ( ( rule__Reference__ValueAssignment_2 ) ) ;
    public final void rule__Reference__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.bddcontracts.ui/src-gen/dk/itu/bddcontracts/ui/contentassist/antlr/internal/InternalGherkin.g:3053:1: ( ( ( rule__Reference__ValueAssignment_2 ) ) )
            // ../dk.itu.bddcontracts.ui/src-gen/dk/itu/bddcontracts/ui/contentassist/antlr/internal/InternalGherkin.g:3054:1: ( ( rule__Reference__ValueAssignment_2 ) )
            {
            // ../dk.itu.bddcontracts.ui/src-gen/dk/itu/bddcontracts/ui/contentassist/antlr/internal/InternalGherkin.g:3054:1: ( ( rule__Reference__ValueAssignment_2 ) )
            // ../dk.itu.bddcontracts.ui/src-gen/dk/itu/bddcontracts/ui/contentassist/antlr/internal/InternalGherkin.g:3055:1: ( rule__Reference__ValueAssignment_2 )
            {
             before(grammarAccess.getReferenceAccess().getValueAssignment_2()); 
            // ../dk.itu.bddcontracts.ui/src-gen/dk/itu/bddcontracts/ui/contentassist/antlr/internal/InternalGherkin.g:3056:1: ( rule__Reference__ValueAssignment_2 )
            // ../dk.itu.bddcontracts.ui/src-gen/dk/itu/bddcontracts/ui/contentassist/antlr/internal/InternalGherkin.g:3056:2: rule__Reference__ValueAssignment_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Reference__ValueAssignment_2_in_rule__Reference__Group__2__Impl6100);
            rule__Reference__ValueAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getReferenceAccess().getValueAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Reference__Group__2__Impl"


    // $ANTLR start "rule__Reference__Group__3"
    // ../dk.itu.bddcontracts.ui/src-gen/dk/itu/bddcontracts/ui/contentassist/antlr/internal/InternalGherkin.g:3066:1: rule__Reference__Group__3 : rule__Reference__Group__3__Impl ;
    public final void rule__Reference__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.bddcontracts.ui/src-gen/dk/itu/bddcontracts/ui/contentassist/antlr/internal/InternalGherkin.g:3070:1: ( rule__Reference__Group__3__Impl )
            // ../dk.itu.bddcontracts.ui/src-gen/dk/itu/bddcontracts/ui/contentassist/antlr/internal/InternalGherkin.g:3071:2: rule__Reference__Group__3__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Reference__Group__3__Impl_in_rule__Reference__Group__36130);
            rule__Reference__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Reference__Group__3"


    // $ANTLR start "rule__Reference__Group__3__Impl"
    // ../dk.itu.bddcontracts.ui/src-gen/dk/itu/bddcontracts/ui/contentassist/antlr/internal/InternalGherkin.g:3077:1: rule__Reference__Group__3__Impl : ( '>' ) ;
    public final void rule__Reference__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.bddcontracts.ui/src-gen/dk/itu/bddcontracts/ui/contentassist/antlr/internal/InternalGherkin.g:3081:1: ( ( '>' ) )
            // ../dk.itu.bddcontracts.ui/src-gen/dk/itu/bddcontracts/ui/contentassist/antlr/internal/InternalGherkin.g:3082:1: ( '>' )
            {
            // ../dk.itu.bddcontracts.ui/src-gen/dk/itu/bddcontracts/ui/contentassist/antlr/internal/InternalGherkin.g:3082:1: ( '>' )
            // ../dk.itu.bddcontracts.ui/src-gen/dk/itu/bddcontracts/ui/contentassist/antlr/internal/InternalGherkin.g:3083:1: '>'
            {
             before(grammarAccess.getReferenceAccess().getGreaterThanSignKeyword_3()); 
            match(input,24,FollowSets000.FOLLOW_24_in_rule__Reference__Group__3__Impl6158); 
             after(grammarAccess.getReferenceAccess().getGreaterThanSignKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Reference__Group__3__Impl"


    // $ANTLR start "rule__Example__Group__0"
    // ../dk.itu.bddcontracts.ui/src-gen/dk/itu/bddcontracts/ui/contentassist/antlr/internal/InternalGherkin.g:3104:1: rule__Example__Group__0 : rule__Example__Group__0__Impl rule__Example__Group__1 ;
    public final void rule__Example__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.bddcontracts.ui/src-gen/dk/itu/bddcontracts/ui/contentassist/antlr/internal/InternalGherkin.g:3108:1: ( rule__Example__Group__0__Impl rule__Example__Group__1 )
            // ../dk.itu.bddcontracts.ui/src-gen/dk/itu/bddcontracts/ui/contentassist/antlr/internal/InternalGherkin.g:3109:2: rule__Example__Group__0__Impl rule__Example__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Example__Group__0__Impl_in_rule__Example__Group__06197);
            rule__Example__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Example__Group__1_in_rule__Example__Group__06200);
            rule__Example__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Example__Group__0"


    // $ANTLR start "rule__Example__Group__0__Impl"
    // ../dk.itu.bddcontracts.ui/src-gen/dk/itu/bddcontracts/ui/contentassist/antlr/internal/InternalGherkin.g:3116:1: rule__Example__Group__0__Impl : ( '|' ) ;
    public final void rule__Example__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.bddcontracts.ui/src-gen/dk/itu/bddcontracts/ui/contentassist/antlr/internal/InternalGherkin.g:3120:1: ( ( '|' ) )
            // ../dk.itu.bddcontracts.ui/src-gen/dk/itu/bddcontracts/ui/contentassist/antlr/internal/InternalGherkin.g:3121:1: ( '|' )
            {
            // ../dk.itu.bddcontracts.ui/src-gen/dk/itu/bddcontracts/ui/contentassist/antlr/internal/InternalGherkin.g:3121:1: ( '|' )
            // ../dk.itu.bddcontracts.ui/src-gen/dk/itu/bddcontracts/ui/contentassist/antlr/internal/InternalGherkin.g:3122:1: '|'
            {
             before(grammarAccess.getExampleAccess().getVerticalLineKeyword_0()); 
            match(input,25,FollowSets000.FOLLOW_25_in_rule__Example__Group__0__Impl6228); 
             after(grammarAccess.getExampleAccess().getVerticalLineKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Example__Group__0__Impl"


    // $ANTLR start "rule__Example__Group__1"
    // ../dk.itu.bddcontracts.ui/src-gen/dk/itu/bddcontracts/ui/contentassist/antlr/internal/InternalGherkin.g:3135:1: rule__Example__Group__1 : rule__Example__Group__1__Impl rule__Example__Group__2 ;
    public final void rule__Example__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.bddcontracts.ui/src-gen/dk/itu/bddcontracts/ui/contentassist/antlr/internal/InternalGherkin.g:3139:1: ( rule__Example__Group__1__Impl rule__Example__Group__2 )
            // ../dk.itu.bddcontracts.ui/src-gen/dk/itu/bddcontracts/ui/contentassist/antlr/internal/InternalGherkin.g:3140:2: rule__Example__Group__1__Impl rule__Example__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Example__Group__1__Impl_in_rule__Example__Group__16259);
            rule__Example__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Example__Group__2_in_rule__Example__Group__16262);
            rule__Example__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Example__Group__1"


    // $ANTLR start "rule__Example__Group__1__Impl"
    // ../dk.itu.bddcontracts.ui/src-gen/dk/itu/bddcontracts/ui/contentassist/antlr/internal/InternalGherkin.g:3147:1: rule__Example__Group__1__Impl : ( ( rule__Example__KeysAssignment_1 ) ) ;
    public final void rule__Example__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.bddcontracts.ui/src-gen/dk/itu/bddcontracts/ui/contentassist/antlr/internal/InternalGherkin.g:3151:1: ( ( ( rule__Example__KeysAssignment_1 ) ) )
            // ../dk.itu.bddcontracts.ui/src-gen/dk/itu/bddcontracts/ui/contentassist/antlr/internal/InternalGherkin.g:3152:1: ( ( rule__Example__KeysAssignment_1 ) )
            {
            // ../dk.itu.bddcontracts.ui/src-gen/dk/itu/bddcontracts/ui/contentassist/antlr/internal/InternalGherkin.g:3152:1: ( ( rule__Example__KeysAssignment_1 ) )
            // ../dk.itu.bddcontracts.ui/src-gen/dk/itu/bddcontracts/ui/contentassist/antlr/internal/InternalGherkin.g:3153:1: ( rule__Example__KeysAssignment_1 )
            {
             before(grammarAccess.getExampleAccess().getKeysAssignment_1()); 
            // ../dk.itu.bddcontracts.ui/src-gen/dk/itu/bddcontracts/ui/contentassist/antlr/internal/InternalGherkin.g:3154:1: ( rule__Example__KeysAssignment_1 )
            // ../dk.itu.bddcontracts.ui/src-gen/dk/itu/bddcontracts/ui/contentassist/antlr/internal/InternalGherkin.g:3154:2: rule__Example__KeysAssignment_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Example__KeysAssignment_1_in_rule__Example__Group__1__Impl6289);
            rule__Example__KeysAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getExampleAccess().getKeysAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Example__Group__1__Impl"


    // $ANTLR start "rule__Example__Group__2"
    // ../dk.itu.bddcontracts.ui/src-gen/dk/itu/bddcontracts/ui/contentassist/antlr/internal/InternalGherkin.g:3164:1: rule__Example__Group__2 : rule__Example__Group__2__Impl rule__Example__Group__3 ;
    public final void rule__Example__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.bddcontracts.ui/src-gen/dk/itu/bddcontracts/ui/contentassist/antlr/internal/InternalGherkin.g:3168:1: ( rule__Example__Group__2__Impl rule__Example__Group__3 )
            // ../dk.itu.bddcontracts.ui/src-gen/dk/itu/bddcontracts/ui/contentassist/antlr/internal/InternalGherkin.g:3169:2: rule__Example__Group__2__Impl rule__Example__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__Example__Group__2__Impl_in_rule__Example__Group__26319);
            rule__Example__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Example__Group__3_in_rule__Example__Group__26322);
            rule__Example__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Example__Group__2"


    // $ANTLR start "rule__Example__Group__2__Impl"
    // ../dk.itu.bddcontracts.ui/src-gen/dk/itu/bddcontracts/ui/contentassist/antlr/internal/InternalGherkin.g:3176:1: rule__Example__Group__2__Impl : ( ( rule__Example__Group_2__0 )* ) ;
    public final void rule__Example__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.bddcontracts.ui/src-gen/dk/itu/bddcontracts/ui/contentassist/antlr/internal/InternalGherkin.g:3180:1: ( ( ( rule__Example__Group_2__0 )* ) )
            // ../dk.itu.bddcontracts.ui/src-gen/dk/itu/bddcontracts/ui/contentassist/antlr/internal/InternalGherkin.g:3181:1: ( ( rule__Example__Group_2__0 )* )
            {
            // ../dk.itu.bddcontracts.ui/src-gen/dk/itu/bddcontracts/ui/contentassist/antlr/internal/InternalGherkin.g:3181:1: ( ( rule__Example__Group_2__0 )* )
            // ../dk.itu.bddcontracts.ui/src-gen/dk/itu/bddcontracts/ui/contentassist/antlr/internal/InternalGherkin.g:3182:1: ( rule__Example__Group_2__0 )*
            {
             before(grammarAccess.getExampleAccess().getGroup_2()); 
            // ../dk.itu.bddcontracts.ui/src-gen/dk/itu/bddcontracts/ui/contentassist/antlr/internal/InternalGherkin.g:3183:1: ( rule__Example__Group_2__0 )*
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
            	    // ../dk.itu.bddcontracts.ui/src-gen/dk/itu/bddcontracts/ui/contentassist/antlr/internal/InternalGherkin.g:3183:2: rule__Example__Group_2__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__Example__Group_2__0_in_rule__Example__Group__2__Impl6349);
            	    rule__Example__Group_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop29;
                }
            } while (true);

             after(grammarAccess.getExampleAccess().getGroup_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Example__Group__2__Impl"


    // $ANTLR start "rule__Example__Group__3"
    // ../dk.itu.bddcontracts.ui/src-gen/dk/itu/bddcontracts/ui/contentassist/antlr/internal/InternalGherkin.g:3193:1: rule__Example__Group__3 : rule__Example__Group__3__Impl rule__Example__Group__4 ;
    public final void rule__Example__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.bddcontracts.ui/src-gen/dk/itu/bddcontracts/ui/contentassist/antlr/internal/InternalGherkin.g:3197:1: ( rule__Example__Group__3__Impl rule__Example__Group__4 )
            // ../dk.itu.bddcontracts.ui/src-gen/dk/itu/bddcontracts/ui/contentassist/antlr/internal/InternalGherkin.g:3198:2: rule__Example__Group__3__Impl rule__Example__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__Example__Group__3__Impl_in_rule__Example__Group__36380);
            rule__Example__Group__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Example__Group__4_in_rule__Example__Group__36383);
            rule__Example__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Example__Group__3"


    // $ANTLR start "rule__Example__Group__3__Impl"
    // ../dk.itu.bddcontracts.ui/src-gen/dk/itu/bddcontracts/ui/contentassist/antlr/internal/InternalGherkin.g:3205:1: rule__Example__Group__3__Impl : ( '|' ) ;
    public final void rule__Example__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.bddcontracts.ui/src-gen/dk/itu/bddcontracts/ui/contentassist/antlr/internal/InternalGherkin.g:3209:1: ( ( '|' ) )
            // ../dk.itu.bddcontracts.ui/src-gen/dk/itu/bddcontracts/ui/contentassist/antlr/internal/InternalGherkin.g:3210:1: ( '|' )
            {
            // ../dk.itu.bddcontracts.ui/src-gen/dk/itu/bddcontracts/ui/contentassist/antlr/internal/InternalGherkin.g:3210:1: ( '|' )
            // ../dk.itu.bddcontracts.ui/src-gen/dk/itu/bddcontracts/ui/contentassist/antlr/internal/InternalGherkin.g:3211:1: '|'
            {
             before(grammarAccess.getExampleAccess().getVerticalLineKeyword_3()); 
            match(input,25,FollowSets000.FOLLOW_25_in_rule__Example__Group__3__Impl6411); 
             after(grammarAccess.getExampleAccess().getVerticalLineKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Example__Group__3__Impl"


    // $ANTLR start "rule__Example__Group__4"
    // ../dk.itu.bddcontracts.ui/src-gen/dk/itu/bddcontracts/ui/contentassist/antlr/internal/InternalGherkin.g:3224:1: rule__Example__Group__4 : rule__Example__Group__4__Impl rule__Example__Group__5 ;
    public final void rule__Example__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.bddcontracts.ui/src-gen/dk/itu/bddcontracts/ui/contentassist/antlr/internal/InternalGherkin.g:3228:1: ( rule__Example__Group__4__Impl rule__Example__Group__5 )
            // ../dk.itu.bddcontracts.ui/src-gen/dk/itu/bddcontracts/ui/contentassist/antlr/internal/InternalGherkin.g:3229:2: rule__Example__Group__4__Impl rule__Example__Group__5
            {
            pushFollow(FollowSets000.FOLLOW_rule__Example__Group__4__Impl_in_rule__Example__Group__46442);
            rule__Example__Group__4__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Example__Group__5_in_rule__Example__Group__46445);
            rule__Example__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Example__Group__4"


    // $ANTLR start "rule__Example__Group__4__Impl"
    // ../dk.itu.bddcontracts.ui/src-gen/dk/itu/bddcontracts/ui/contentassist/antlr/internal/InternalGherkin.g:3236:1: rule__Example__Group__4__Impl : ( ( rule__Example__ValuesAssignment_4 ) ) ;
    public final void rule__Example__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.bddcontracts.ui/src-gen/dk/itu/bddcontracts/ui/contentassist/antlr/internal/InternalGherkin.g:3240:1: ( ( ( rule__Example__ValuesAssignment_4 ) ) )
            // ../dk.itu.bddcontracts.ui/src-gen/dk/itu/bddcontracts/ui/contentassist/antlr/internal/InternalGherkin.g:3241:1: ( ( rule__Example__ValuesAssignment_4 ) )
            {
            // ../dk.itu.bddcontracts.ui/src-gen/dk/itu/bddcontracts/ui/contentassist/antlr/internal/InternalGherkin.g:3241:1: ( ( rule__Example__ValuesAssignment_4 ) )
            // ../dk.itu.bddcontracts.ui/src-gen/dk/itu/bddcontracts/ui/contentassist/antlr/internal/InternalGherkin.g:3242:1: ( rule__Example__ValuesAssignment_4 )
            {
             before(grammarAccess.getExampleAccess().getValuesAssignment_4()); 
            // ../dk.itu.bddcontracts.ui/src-gen/dk/itu/bddcontracts/ui/contentassist/antlr/internal/InternalGherkin.g:3243:1: ( rule__Example__ValuesAssignment_4 )
            // ../dk.itu.bddcontracts.ui/src-gen/dk/itu/bddcontracts/ui/contentassist/antlr/internal/InternalGherkin.g:3243:2: rule__Example__ValuesAssignment_4
            {
            pushFollow(FollowSets000.FOLLOW_rule__Example__ValuesAssignment_4_in_rule__Example__Group__4__Impl6472);
            rule__Example__ValuesAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getExampleAccess().getValuesAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Example__Group__4__Impl"


    // $ANTLR start "rule__Example__Group__5"
    // ../dk.itu.bddcontracts.ui/src-gen/dk/itu/bddcontracts/ui/contentassist/antlr/internal/InternalGherkin.g:3253:1: rule__Example__Group__5 : rule__Example__Group__5__Impl ;
    public final void rule__Example__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.bddcontracts.ui/src-gen/dk/itu/bddcontracts/ui/contentassist/antlr/internal/InternalGherkin.g:3257:1: ( rule__Example__Group__5__Impl )
            // ../dk.itu.bddcontracts.ui/src-gen/dk/itu/bddcontracts/ui/contentassist/antlr/internal/InternalGherkin.g:3258:2: rule__Example__Group__5__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Example__Group__5__Impl_in_rule__Example__Group__56502);
            rule__Example__Group__5__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Example__Group__5"


    // $ANTLR start "rule__Example__Group__5__Impl"
    // ../dk.itu.bddcontracts.ui/src-gen/dk/itu/bddcontracts/ui/contentassist/antlr/internal/InternalGherkin.g:3264:1: rule__Example__Group__5__Impl : ( ( rule__Example__Group_5__0 )* ) ;
    public final void rule__Example__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.bddcontracts.ui/src-gen/dk/itu/bddcontracts/ui/contentassist/antlr/internal/InternalGherkin.g:3268:1: ( ( ( rule__Example__Group_5__0 )* ) )
            // ../dk.itu.bddcontracts.ui/src-gen/dk/itu/bddcontracts/ui/contentassist/antlr/internal/InternalGherkin.g:3269:1: ( ( rule__Example__Group_5__0 )* )
            {
            // ../dk.itu.bddcontracts.ui/src-gen/dk/itu/bddcontracts/ui/contentassist/antlr/internal/InternalGherkin.g:3269:1: ( ( rule__Example__Group_5__0 )* )
            // ../dk.itu.bddcontracts.ui/src-gen/dk/itu/bddcontracts/ui/contentassist/antlr/internal/InternalGherkin.g:3270:1: ( rule__Example__Group_5__0 )*
            {
             before(grammarAccess.getExampleAccess().getGroup_5()); 
            // ../dk.itu.bddcontracts.ui/src-gen/dk/itu/bddcontracts/ui/contentassist/antlr/internal/InternalGherkin.g:3271:1: ( rule__Example__Group_5__0 )*
            loop30:
            do {
                int alt30=2;
                int LA30_0 = input.LA(1);

                if ( (LA30_0==26) ) {
                    alt30=1;
                }


                switch (alt30) {
            	case 1 :
            	    // ../dk.itu.bddcontracts.ui/src-gen/dk/itu/bddcontracts/ui/contentassist/antlr/internal/InternalGherkin.g:3271:2: rule__Example__Group_5__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__Example__Group_5__0_in_rule__Example__Group__5__Impl6529);
            	    rule__Example__Group_5__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop30;
                }
            } while (true);

             after(grammarAccess.getExampleAccess().getGroup_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Example__Group__5__Impl"


    // $ANTLR start "rule__Example__Group_2__0"
    // ../dk.itu.bddcontracts.ui/src-gen/dk/itu/bddcontracts/ui/contentassist/antlr/internal/InternalGherkin.g:3293:1: rule__Example__Group_2__0 : rule__Example__Group_2__0__Impl rule__Example__Group_2__1 ;
    public final void rule__Example__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.bddcontracts.ui/src-gen/dk/itu/bddcontracts/ui/contentassist/antlr/internal/InternalGherkin.g:3297:1: ( rule__Example__Group_2__0__Impl rule__Example__Group_2__1 )
            // ../dk.itu.bddcontracts.ui/src-gen/dk/itu/bddcontracts/ui/contentassist/antlr/internal/InternalGherkin.g:3298:2: rule__Example__Group_2__0__Impl rule__Example__Group_2__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Example__Group_2__0__Impl_in_rule__Example__Group_2__06572);
            rule__Example__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Example__Group_2__1_in_rule__Example__Group_2__06575);
            rule__Example__Group_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Example__Group_2__0"


    // $ANTLR start "rule__Example__Group_2__0__Impl"
    // ../dk.itu.bddcontracts.ui/src-gen/dk/itu/bddcontracts/ui/contentassist/antlr/internal/InternalGherkin.g:3305:1: rule__Example__Group_2__0__Impl : ( '|' ) ;
    public final void rule__Example__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.bddcontracts.ui/src-gen/dk/itu/bddcontracts/ui/contentassist/antlr/internal/InternalGherkin.g:3309:1: ( ( '|' ) )
            // ../dk.itu.bddcontracts.ui/src-gen/dk/itu/bddcontracts/ui/contentassist/antlr/internal/InternalGherkin.g:3310:1: ( '|' )
            {
            // ../dk.itu.bddcontracts.ui/src-gen/dk/itu/bddcontracts/ui/contentassist/antlr/internal/InternalGherkin.g:3310:1: ( '|' )
            // ../dk.itu.bddcontracts.ui/src-gen/dk/itu/bddcontracts/ui/contentassist/antlr/internal/InternalGherkin.g:3311:1: '|'
            {
             before(grammarAccess.getExampleAccess().getVerticalLineKeyword_2_0()); 
            match(input,25,FollowSets000.FOLLOW_25_in_rule__Example__Group_2__0__Impl6603); 
             after(grammarAccess.getExampleAccess().getVerticalLineKeyword_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Example__Group_2__0__Impl"


    // $ANTLR start "rule__Example__Group_2__1"
    // ../dk.itu.bddcontracts.ui/src-gen/dk/itu/bddcontracts/ui/contentassist/antlr/internal/InternalGherkin.g:3324:1: rule__Example__Group_2__1 : rule__Example__Group_2__1__Impl ;
    public final void rule__Example__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.bddcontracts.ui/src-gen/dk/itu/bddcontracts/ui/contentassist/antlr/internal/InternalGherkin.g:3328:1: ( rule__Example__Group_2__1__Impl )
            // ../dk.itu.bddcontracts.ui/src-gen/dk/itu/bddcontracts/ui/contentassist/antlr/internal/InternalGherkin.g:3329:2: rule__Example__Group_2__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Example__Group_2__1__Impl_in_rule__Example__Group_2__16634);
            rule__Example__Group_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Example__Group_2__1"


    // $ANTLR start "rule__Example__Group_2__1__Impl"
    // ../dk.itu.bddcontracts.ui/src-gen/dk/itu/bddcontracts/ui/contentassist/antlr/internal/InternalGherkin.g:3335:1: rule__Example__Group_2__1__Impl : ( ( rule__Example__KeysAssignment_2_1 ) ) ;
    public final void rule__Example__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.bddcontracts.ui/src-gen/dk/itu/bddcontracts/ui/contentassist/antlr/internal/InternalGherkin.g:3339:1: ( ( ( rule__Example__KeysAssignment_2_1 ) ) )
            // ../dk.itu.bddcontracts.ui/src-gen/dk/itu/bddcontracts/ui/contentassist/antlr/internal/InternalGherkin.g:3340:1: ( ( rule__Example__KeysAssignment_2_1 ) )
            {
            // ../dk.itu.bddcontracts.ui/src-gen/dk/itu/bddcontracts/ui/contentassist/antlr/internal/InternalGherkin.g:3340:1: ( ( rule__Example__KeysAssignment_2_1 ) )
            // ../dk.itu.bddcontracts.ui/src-gen/dk/itu/bddcontracts/ui/contentassist/antlr/internal/InternalGherkin.g:3341:1: ( rule__Example__KeysAssignment_2_1 )
            {
             before(grammarAccess.getExampleAccess().getKeysAssignment_2_1()); 
            // ../dk.itu.bddcontracts.ui/src-gen/dk/itu/bddcontracts/ui/contentassist/antlr/internal/InternalGherkin.g:3342:1: ( rule__Example__KeysAssignment_2_1 )
            // ../dk.itu.bddcontracts.ui/src-gen/dk/itu/bddcontracts/ui/contentassist/antlr/internal/InternalGherkin.g:3342:2: rule__Example__KeysAssignment_2_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Example__KeysAssignment_2_1_in_rule__Example__Group_2__1__Impl6661);
            rule__Example__KeysAssignment_2_1();

            state._fsp--;


            }

             after(grammarAccess.getExampleAccess().getKeysAssignment_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Example__Group_2__1__Impl"


    // $ANTLR start "rule__Example__Group_5__0"
    // ../dk.itu.bddcontracts.ui/src-gen/dk/itu/bddcontracts/ui/contentassist/antlr/internal/InternalGherkin.g:3356:1: rule__Example__Group_5__0 : rule__Example__Group_5__0__Impl rule__Example__Group_5__1 ;
    public final void rule__Example__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.bddcontracts.ui/src-gen/dk/itu/bddcontracts/ui/contentassist/antlr/internal/InternalGherkin.g:3360:1: ( rule__Example__Group_5__0__Impl rule__Example__Group_5__1 )
            // ../dk.itu.bddcontracts.ui/src-gen/dk/itu/bddcontracts/ui/contentassist/antlr/internal/InternalGherkin.g:3361:2: rule__Example__Group_5__0__Impl rule__Example__Group_5__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Example__Group_5__0__Impl_in_rule__Example__Group_5__06695);
            rule__Example__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Example__Group_5__1_in_rule__Example__Group_5__06698);
            rule__Example__Group_5__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Example__Group_5__0"


    // $ANTLR start "rule__Example__Group_5__0__Impl"
    // ../dk.itu.bddcontracts.ui/src-gen/dk/itu/bddcontracts/ui/contentassist/antlr/internal/InternalGherkin.g:3368:1: rule__Example__Group_5__0__Impl : ( '\\n' ) ;
    public final void rule__Example__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.bddcontracts.ui/src-gen/dk/itu/bddcontracts/ui/contentassist/antlr/internal/InternalGherkin.g:3372:1: ( ( '\\n' ) )
            // ../dk.itu.bddcontracts.ui/src-gen/dk/itu/bddcontracts/ui/contentassist/antlr/internal/InternalGherkin.g:3373:1: ( '\\n' )
            {
            // ../dk.itu.bddcontracts.ui/src-gen/dk/itu/bddcontracts/ui/contentassist/antlr/internal/InternalGherkin.g:3373:1: ( '\\n' )
            // ../dk.itu.bddcontracts.ui/src-gen/dk/itu/bddcontracts/ui/contentassist/antlr/internal/InternalGherkin.g:3374:1: '\\n'
            {
             before(grammarAccess.getExampleAccess().getLineFeedLfKeyword_5_0()); 
            match(input,26,FollowSets000.FOLLOW_26_in_rule__Example__Group_5__0__Impl6726); 
             after(grammarAccess.getExampleAccess().getLineFeedLfKeyword_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Example__Group_5__0__Impl"


    // $ANTLR start "rule__Example__Group_5__1"
    // ../dk.itu.bddcontracts.ui/src-gen/dk/itu/bddcontracts/ui/contentassist/antlr/internal/InternalGherkin.g:3387:1: rule__Example__Group_5__1 : rule__Example__Group_5__1__Impl ;
    public final void rule__Example__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.bddcontracts.ui/src-gen/dk/itu/bddcontracts/ui/contentassist/antlr/internal/InternalGherkin.g:3391:1: ( rule__Example__Group_5__1__Impl )
            // ../dk.itu.bddcontracts.ui/src-gen/dk/itu/bddcontracts/ui/contentassist/antlr/internal/InternalGherkin.g:3392:2: rule__Example__Group_5__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Example__Group_5__1__Impl_in_rule__Example__Group_5__16757);
            rule__Example__Group_5__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Example__Group_5__1"


    // $ANTLR start "rule__Example__Group_5__1__Impl"
    // ../dk.itu.bddcontracts.ui/src-gen/dk/itu/bddcontracts/ui/contentassist/antlr/internal/InternalGherkin.g:3398:1: rule__Example__Group_5__1__Impl : ( ( rule__Example__ValuesAssignment_5_1 ) ) ;
    public final void rule__Example__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.bddcontracts.ui/src-gen/dk/itu/bddcontracts/ui/contentassist/antlr/internal/InternalGherkin.g:3402:1: ( ( ( rule__Example__ValuesAssignment_5_1 ) ) )
            // ../dk.itu.bddcontracts.ui/src-gen/dk/itu/bddcontracts/ui/contentassist/antlr/internal/InternalGherkin.g:3403:1: ( ( rule__Example__ValuesAssignment_5_1 ) )
            {
            // ../dk.itu.bddcontracts.ui/src-gen/dk/itu/bddcontracts/ui/contentassist/antlr/internal/InternalGherkin.g:3403:1: ( ( rule__Example__ValuesAssignment_5_1 ) )
            // ../dk.itu.bddcontracts.ui/src-gen/dk/itu/bddcontracts/ui/contentassist/antlr/internal/InternalGherkin.g:3404:1: ( rule__Example__ValuesAssignment_5_1 )
            {
             before(grammarAccess.getExampleAccess().getValuesAssignment_5_1()); 
            // ../dk.itu.bddcontracts.ui/src-gen/dk/itu/bddcontracts/ui/contentassist/antlr/internal/InternalGherkin.g:3405:1: ( rule__Example__ValuesAssignment_5_1 )
            // ../dk.itu.bddcontracts.ui/src-gen/dk/itu/bddcontracts/ui/contentassist/antlr/internal/InternalGherkin.g:3405:2: rule__Example__ValuesAssignment_5_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Example__ValuesAssignment_5_1_in_rule__Example__Group_5__1__Impl6784);
            rule__Example__ValuesAssignment_5_1();

            state._fsp--;


            }

             after(grammarAccess.getExampleAccess().getValuesAssignment_5_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Example__Group_5__1__Impl"


    // $ANTLR start "rule__Value__Group__0"
    // ../dk.itu.bddcontracts.ui/src-gen/dk/itu/bddcontracts/ui/contentassist/antlr/internal/InternalGherkin.g:3419:1: rule__Value__Group__0 : rule__Value__Group__0__Impl rule__Value__Group__1 ;
    public final void rule__Value__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.bddcontracts.ui/src-gen/dk/itu/bddcontracts/ui/contentassist/antlr/internal/InternalGherkin.g:3423:1: ( rule__Value__Group__0__Impl rule__Value__Group__1 )
            // ../dk.itu.bddcontracts.ui/src-gen/dk/itu/bddcontracts/ui/contentassist/antlr/internal/InternalGherkin.g:3424:2: rule__Value__Group__0__Impl rule__Value__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Value__Group__0__Impl_in_rule__Value__Group__06818);
            rule__Value__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Value__Group__1_in_rule__Value__Group__06821);
            rule__Value__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Value__Group__0"


    // $ANTLR start "rule__Value__Group__0__Impl"
    // ../dk.itu.bddcontracts.ui/src-gen/dk/itu/bddcontracts/ui/contentassist/antlr/internal/InternalGherkin.g:3431:1: rule__Value__Group__0__Impl : ( '|' ) ;
    public final void rule__Value__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.bddcontracts.ui/src-gen/dk/itu/bddcontracts/ui/contentassist/antlr/internal/InternalGherkin.g:3435:1: ( ( '|' ) )
            // ../dk.itu.bddcontracts.ui/src-gen/dk/itu/bddcontracts/ui/contentassist/antlr/internal/InternalGherkin.g:3436:1: ( '|' )
            {
            // ../dk.itu.bddcontracts.ui/src-gen/dk/itu/bddcontracts/ui/contentassist/antlr/internal/InternalGherkin.g:3436:1: ( '|' )
            // ../dk.itu.bddcontracts.ui/src-gen/dk/itu/bddcontracts/ui/contentassist/antlr/internal/InternalGherkin.g:3437:1: '|'
            {
             before(grammarAccess.getValueAccess().getVerticalLineKeyword_0()); 
            match(input,25,FollowSets000.FOLLOW_25_in_rule__Value__Group__0__Impl6849); 
             after(grammarAccess.getValueAccess().getVerticalLineKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Value__Group__0__Impl"


    // $ANTLR start "rule__Value__Group__1"
    // ../dk.itu.bddcontracts.ui/src-gen/dk/itu/bddcontracts/ui/contentassist/antlr/internal/InternalGherkin.g:3450:1: rule__Value__Group__1 : rule__Value__Group__1__Impl rule__Value__Group__2 ;
    public final void rule__Value__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.bddcontracts.ui/src-gen/dk/itu/bddcontracts/ui/contentassist/antlr/internal/InternalGherkin.g:3454:1: ( rule__Value__Group__1__Impl rule__Value__Group__2 )
            // ../dk.itu.bddcontracts.ui/src-gen/dk/itu/bddcontracts/ui/contentassist/antlr/internal/InternalGherkin.g:3455:2: rule__Value__Group__1__Impl rule__Value__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Value__Group__1__Impl_in_rule__Value__Group__16880);
            rule__Value__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Value__Group__2_in_rule__Value__Group__16883);
            rule__Value__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Value__Group__1"


    // $ANTLR start "rule__Value__Group__1__Impl"
    // ../dk.itu.bddcontracts.ui/src-gen/dk/itu/bddcontracts/ui/contentassist/antlr/internal/InternalGherkin.g:3462:1: rule__Value__Group__1__Impl : ( ( rule__Value__ElementsAssignment_1 ) ) ;
    public final void rule__Value__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.bddcontracts.ui/src-gen/dk/itu/bddcontracts/ui/contentassist/antlr/internal/InternalGherkin.g:3466:1: ( ( ( rule__Value__ElementsAssignment_1 ) ) )
            // ../dk.itu.bddcontracts.ui/src-gen/dk/itu/bddcontracts/ui/contentassist/antlr/internal/InternalGherkin.g:3467:1: ( ( rule__Value__ElementsAssignment_1 ) )
            {
            // ../dk.itu.bddcontracts.ui/src-gen/dk/itu/bddcontracts/ui/contentassist/antlr/internal/InternalGherkin.g:3467:1: ( ( rule__Value__ElementsAssignment_1 ) )
            // ../dk.itu.bddcontracts.ui/src-gen/dk/itu/bddcontracts/ui/contentassist/antlr/internal/InternalGherkin.g:3468:1: ( rule__Value__ElementsAssignment_1 )
            {
             before(grammarAccess.getValueAccess().getElementsAssignment_1()); 
            // ../dk.itu.bddcontracts.ui/src-gen/dk/itu/bddcontracts/ui/contentassist/antlr/internal/InternalGherkin.g:3469:1: ( rule__Value__ElementsAssignment_1 )
            // ../dk.itu.bddcontracts.ui/src-gen/dk/itu/bddcontracts/ui/contentassist/antlr/internal/InternalGherkin.g:3469:2: rule__Value__ElementsAssignment_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Value__ElementsAssignment_1_in_rule__Value__Group__1__Impl6910);
            rule__Value__ElementsAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getValueAccess().getElementsAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Value__Group__1__Impl"


    // $ANTLR start "rule__Value__Group__2"
    // ../dk.itu.bddcontracts.ui/src-gen/dk/itu/bddcontracts/ui/contentassist/antlr/internal/InternalGherkin.g:3479:1: rule__Value__Group__2 : rule__Value__Group__2__Impl rule__Value__Group__3 ;
    public final void rule__Value__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.bddcontracts.ui/src-gen/dk/itu/bddcontracts/ui/contentassist/antlr/internal/InternalGherkin.g:3483:1: ( rule__Value__Group__2__Impl rule__Value__Group__3 )
            // ../dk.itu.bddcontracts.ui/src-gen/dk/itu/bddcontracts/ui/contentassist/antlr/internal/InternalGherkin.g:3484:2: rule__Value__Group__2__Impl rule__Value__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__Value__Group__2__Impl_in_rule__Value__Group__26940);
            rule__Value__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Value__Group__3_in_rule__Value__Group__26943);
            rule__Value__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Value__Group__2"


    // $ANTLR start "rule__Value__Group__2__Impl"
    // ../dk.itu.bddcontracts.ui/src-gen/dk/itu/bddcontracts/ui/contentassist/antlr/internal/InternalGherkin.g:3491:1: rule__Value__Group__2__Impl : ( ( rule__Value__Group_2__0 )* ) ;
    public final void rule__Value__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.bddcontracts.ui/src-gen/dk/itu/bddcontracts/ui/contentassist/antlr/internal/InternalGherkin.g:3495:1: ( ( ( rule__Value__Group_2__0 )* ) )
            // ../dk.itu.bddcontracts.ui/src-gen/dk/itu/bddcontracts/ui/contentassist/antlr/internal/InternalGherkin.g:3496:1: ( ( rule__Value__Group_2__0 )* )
            {
            // ../dk.itu.bddcontracts.ui/src-gen/dk/itu/bddcontracts/ui/contentassist/antlr/internal/InternalGherkin.g:3496:1: ( ( rule__Value__Group_2__0 )* )
            // ../dk.itu.bddcontracts.ui/src-gen/dk/itu/bddcontracts/ui/contentassist/antlr/internal/InternalGherkin.g:3497:1: ( rule__Value__Group_2__0 )*
            {
             before(grammarAccess.getValueAccess().getGroup_2()); 
            // ../dk.itu.bddcontracts.ui/src-gen/dk/itu/bddcontracts/ui/contentassist/antlr/internal/InternalGherkin.g:3498:1: ( rule__Value__Group_2__0 )*
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
            	    // ../dk.itu.bddcontracts.ui/src-gen/dk/itu/bddcontracts/ui/contentassist/antlr/internal/InternalGherkin.g:3498:2: rule__Value__Group_2__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__Value__Group_2__0_in_rule__Value__Group__2__Impl6970);
            	    rule__Value__Group_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop31;
                }
            } while (true);

             after(grammarAccess.getValueAccess().getGroup_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Value__Group__2__Impl"


    // $ANTLR start "rule__Value__Group__3"
    // ../dk.itu.bddcontracts.ui/src-gen/dk/itu/bddcontracts/ui/contentassist/antlr/internal/InternalGherkin.g:3508:1: rule__Value__Group__3 : rule__Value__Group__3__Impl ;
    public final void rule__Value__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.bddcontracts.ui/src-gen/dk/itu/bddcontracts/ui/contentassist/antlr/internal/InternalGherkin.g:3512:1: ( rule__Value__Group__3__Impl )
            // ../dk.itu.bddcontracts.ui/src-gen/dk/itu/bddcontracts/ui/contentassist/antlr/internal/InternalGherkin.g:3513:2: rule__Value__Group__3__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Value__Group__3__Impl_in_rule__Value__Group__37001);
            rule__Value__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Value__Group__3"


    // $ANTLR start "rule__Value__Group__3__Impl"
    // ../dk.itu.bddcontracts.ui/src-gen/dk/itu/bddcontracts/ui/contentassist/antlr/internal/InternalGherkin.g:3519:1: rule__Value__Group__3__Impl : ( '|' ) ;
    public final void rule__Value__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.bddcontracts.ui/src-gen/dk/itu/bddcontracts/ui/contentassist/antlr/internal/InternalGherkin.g:3523:1: ( ( '|' ) )
            // ../dk.itu.bddcontracts.ui/src-gen/dk/itu/bddcontracts/ui/contentassist/antlr/internal/InternalGherkin.g:3524:1: ( '|' )
            {
            // ../dk.itu.bddcontracts.ui/src-gen/dk/itu/bddcontracts/ui/contentassist/antlr/internal/InternalGherkin.g:3524:1: ( '|' )
            // ../dk.itu.bddcontracts.ui/src-gen/dk/itu/bddcontracts/ui/contentassist/antlr/internal/InternalGherkin.g:3525:1: '|'
            {
             before(grammarAccess.getValueAccess().getVerticalLineKeyword_3()); 
            match(input,25,FollowSets000.FOLLOW_25_in_rule__Value__Group__3__Impl7029); 
             after(grammarAccess.getValueAccess().getVerticalLineKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Value__Group__3__Impl"


    // $ANTLR start "rule__Value__Group_2__0"
    // ../dk.itu.bddcontracts.ui/src-gen/dk/itu/bddcontracts/ui/contentassist/antlr/internal/InternalGherkin.g:3546:1: rule__Value__Group_2__0 : rule__Value__Group_2__0__Impl rule__Value__Group_2__1 ;
    public final void rule__Value__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.bddcontracts.ui/src-gen/dk/itu/bddcontracts/ui/contentassist/antlr/internal/InternalGherkin.g:3550:1: ( rule__Value__Group_2__0__Impl rule__Value__Group_2__1 )
            // ../dk.itu.bddcontracts.ui/src-gen/dk/itu/bddcontracts/ui/contentassist/antlr/internal/InternalGherkin.g:3551:2: rule__Value__Group_2__0__Impl rule__Value__Group_2__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Value__Group_2__0__Impl_in_rule__Value__Group_2__07068);
            rule__Value__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Value__Group_2__1_in_rule__Value__Group_2__07071);
            rule__Value__Group_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Value__Group_2__0"


    // $ANTLR start "rule__Value__Group_2__0__Impl"
    // ../dk.itu.bddcontracts.ui/src-gen/dk/itu/bddcontracts/ui/contentassist/antlr/internal/InternalGherkin.g:3558:1: rule__Value__Group_2__0__Impl : ( '|' ) ;
    public final void rule__Value__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.bddcontracts.ui/src-gen/dk/itu/bddcontracts/ui/contentassist/antlr/internal/InternalGherkin.g:3562:1: ( ( '|' ) )
            // ../dk.itu.bddcontracts.ui/src-gen/dk/itu/bddcontracts/ui/contentassist/antlr/internal/InternalGherkin.g:3563:1: ( '|' )
            {
            // ../dk.itu.bddcontracts.ui/src-gen/dk/itu/bddcontracts/ui/contentassist/antlr/internal/InternalGherkin.g:3563:1: ( '|' )
            // ../dk.itu.bddcontracts.ui/src-gen/dk/itu/bddcontracts/ui/contentassist/antlr/internal/InternalGherkin.g:3564:1: '|'
            {
             before(grammarAccess.getValueAccess().getVerticalLineKeyword_2_0()); 
            match(input,25,FollowSets000.FOLLOW_25_in_rule__Value__Group_2__0__Impl7099); 
             after(grammarAccess.getValueAccess().getVerticalLineKeyword_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Value__Group_2__0__Impl"


    // $ANTLR start "rule__Value__Group_2__1"
    // ../dk.itu.bddcontracts.ui/src-gen/dk/itu/bddcontracts/ui/contentassist/antlr/internal/InternalGherkin.g:3577:1: rule__Value__Group_2__1 : rule__Value__Group_2__1__Impl ;
    public final void rule__Value__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.bddcontracts.ui/src-gen/dk/itu/bddcontracts/ui/contentassist/antlr/internal/InternalGherkin.g:3581:1: ( rule__Value__Group_2__1__Impl )
            // ../dk.itu.bddcontracts.ui/src-gen/dk/itu/bddcontracts/ui/contentassist/antlr/internal/InternalGherkin.g:3582:2: rule__Value__Group_2__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Value__Group_2__1__Impl_in_rule__Value__Group_2__17130);
            rule__Value__Group_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Value__Group_2__1"


    // $ANTLR start "rule__Value__Group_2__1__Impl"
    // ../dk.itu.bddcontracts.ui/src-gen/dk/itu/bddcontracts/ui/contentassist/antlr/internal/InternalGherkin.g:3588:1: rule__Value__Group_2__1__Impl : ( ( rule__Value__ElementsAssignment_2_1 ) ) ;
    public final void rule__Value__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.bddcontracts.ui/src-gen/dk/itu/bddcontracts/ui/contentassist/antlr/internal/InternalGherkin.g:3592:1: ( ( ( rule__Value__ElementsAssignment_2_1 ) ) )
            // ../dk.itu.bddcontracts.ui/src-gen/dk/itu/bddcontracts/ui/contentassist/antlr/internal/InternalGherkin.g:3593:1: ( ( rule__Value__ElementsAssignment_2_1 ) )
            {
            // ../dk.itu.bddcontracts.ui/src-gen/dk/itu/bddcontracts/ui/contentassist/antlr/internal/InternalGherkin.g:3593:1: ( ( rule__Value__ElementsAssignment_2_1 ) )
            // ../dk.itu.bddcontracts.ui/src-gen/dk/itu/bddcontracts/ui/contentassist/antlr/internal/InternalGherkin.g:3594:1: ( rule__Value__ElementsAssignment_2_1 )
            {
             before(grammarAccess.getValueAccess().getElementsAssignment_2_1()); 
            // ../dk.itu.bddcontracts.ui/src-gen/dk/itu/bddcontracts/ui/contentassist/antlr/internal/InternalGherkin.g:3595:1: ( rule__Value__ElementsAssignment_2_1 )
            // ../dk.itu.bddcontracts.ui/src-gen/dk/itu/bddcontracts/ui/contentassist/antlr/internal/InternalGherkin.g:3595:2: rule__Value__ElementsAssignment_2_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Value__ElementsAssignment_2_1_in_rule__Value__Group_2__1__Impl7157);
            rule__Value__ElementsAssignment_2_1();

            state._fsp--;


            }

             after(grammarAccess.getValueAccess().getElementsAssignment_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Value__Group_2__1__Impl"


    // $ANTLR start "rule__Model__FeaturesAssignment_1_0"
    // ../dk.itu.bddcontracts.ui/src-gen/dk/itu/bddcontracts/ui/contentassist/antlr/internal/InternalGherkin.g:3610:1: rule__Model__FeaturesAssignment_1_0 : ( ruleFeature ) ;
    public final void rule__Model__FeaturesAssignment_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.bddcontracts.ui/src-gen/dk/itu/bddcontracts/ui/contentassist/antlr/internal/InternalGherkin.g:3614:1: ( ( ruleFeature ) )
            // ../dk.itu.bddcontracts.ui/src-gen/dk/itu/bddcontracts/ui/contentassist/antlr/internal/InternalGherkin.g:3615:1: ( ruleFeature )
            {
            // ../dk.itu.bddcontracts.ui/src-gen/dk/itu/bddcontracts/ui/contentassist/antlr/internal/InternalGherkin.g:3615:1: ( ruleFeature )
            // ../dk.itu.bddcontracts.ui/src-gen/dk/itu/bddcontracts/ui/contentassist/antlr/internal/InternalGherkin.g:3616:1: ruleFeature
            {
             before(grammarAccess.getModelAccess().getFeaturesFeatureParserRuleCall_1_0_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleFeature_in_rule__Model__FeaturesAssignment_1_07196);
            ruleFeature();

            state._fsp--;

             after(grammarAccess.getModelAccess().getFeaturesFeatureParserRuleCall_1_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__FeaturesAssignment_1_0"


    // $ANTLR start "rule__Model__FeaturesAssignment_1_1"
    // ../dk.itu.bddcontracts.ui/src-gen/dk/itu/bddcontracts/ui/contentassist/antlr/internal/InternalGherkin.g:3625:1: rule__Model__FeaturesAssignment_1_1 : ( ruleFeature ) ;
    public final void rule__Model__FeaturesAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.bddcontracts.ui/src-gen/dk/itu/bddcontracts/ui/contentassist/antlr/internal/InternalGherkin.g:3629:1: ( ( ruleFeature ) )
            // ../dk.itu.bddcontracts.ui/src-gen/dk/itu/bddcontracts/ui/contentassist/antlr/internal/InternalGherkin.g:3630:1: ( ruleFeature )
            {
            // ../dk.itu.bddcontracts.ui/src-gen/dk/itu/bddcontracts/ui/contentassist/antlr/internal/InternalGherkin.g:3630:1: ( ruleFeature )
            // ../dk.itu.bddcontracts.ui/src-gen/dk/itu/bddcontracts/ui/contentassist/antlr/internal/InternalGherkin.g:3631:1: ruleFeature
            {
             before(grammarAccess.getModelAccess().getFeaturesFeatureParserRuleCall_1_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleFeature_in_rule__Model__FeaturesAssignment_1_17227);
            ruleFeature();

            state._fsp--;

             after(grammarAccess.getModelAccess().getFeaturesFeatureParserRuleCall_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__FeaturesAssignment_1_1"


    // $ANTLR start "rule__Feature__DescriptionAssignment_1"
    // ../dk.itu.bddcontracts.ui/src-gen/dk/itu/bddcontracts/ui/contentassist/antlr/internal/InternalGherkin.g:3640:1: rule__Feature__DescriptionAssignment_1 : ( ruleEString ) ;
    public final void rule__Feature__DescriptionAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.bddcontracts.ui/src-gen/dk/itu/bddcontracts/ui/contentassist/antlr/internal/InternalGherkin.g:3644:1: ( ( ruleEString ) )
            // ../dk.itu.bddcontracts.ui/src-gen/dk/itu/bddcontracts/ui/contentassist/antlr/internal/InternalGherkin.g:3645:1: ( ruleEString )
            {
            // ../dk.itu.bddcontracts.ui/src-gen/dk/itu/bddcontracts/ui/contentassist/antlr/internal/InternalGherkin.g:3645:1: ( ruleEString )
            // ../dk.itu.bddcontracts.ui/src-gen/dk/itu/bddcontracts/ui/contentassist/antlr/internal/InternalGherkin.g:3646:1: ruleEString
            {
             before(grammarAccess.getFeatureAccess().getDescriptionEStringParserRuleCall_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__Feature__DescriptionAssignment_17258);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getFeatureAccess().getDescriptionEStringParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Feature__DescriptionAssignment_1"


    // $ANTLR start "rule__Feature__SummaryAssignment_2"
    // ../dk.itu.bddcontracts.ui/src-gen/dk/itu/bddcontracts/ui/contentassist/antlr/internal/InternalGherkin.g:3655:1: rule__Feature__SummaryAssignment_2 : ( ruleMAny ) ;
    public final void rule__Feature__SummaryAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.bddcontracts.ui/src-gen/dk/itu/bddcontracts/ui/contentassist/antlr/internal/InternalGherkin.g:3659:1: ( ( ruleMAny ) )
            // ../dk.itu.bddcontracts.ui/src-gen/dk/itu/bddcontracts/ui/contentassist/antlr/internal/InternalGherkin.g:3660:1: ( ruleMAny )
            {
            // ../dk.itu.bddcontracts.ui/src-gen/dk/itu/bddcontracts/ui/contentassist/antlr/internal/InternalGherkin.g:3660:1: ( ruleMAny )
            // ../dk.itu.bddcontracts.ui/src-gen/dk/itu/bddcontracts/ui/contentassist/antlr/internal/InternalGherkin.g:3661:1: ruleMAny
            {
             before(grammarAccess.getFeatureAccess().getSummaryMAnyParserRuleCall_2_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleMAny_in_rule__Feature__SummaryAssignment_27289);
            ruleMAny();

            state._fsp--;

             after(grammarAccess.getFeatureAccess().getSummaryMAnyParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Feature__SummaryAssignment_2"


    // $ANTLR start "rule__Feature__BackgroundAssignment_3"
    // ../dk.itu.bddcontracts.ui/src-gen/dk/itu/bddcontracts/ui/contentassist/antlr/internal/InternalGherkin.g:3670:1: rule__Feature__BackgroundAssignment_3 : ( ruleBackground ) ;
    public final void rule__Feature__BackgroundAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.bddcontracts.ui/src-gen/dk/itu/bddcontracts/ui/contentassist/antlr/internal/InternalGherkin.g:3674:1: ( ( ruleBackground ) )
            // ../dk.itu.bddcontracts.ui/src-gen/dk/itu/bddcontracts/ui/contentassist/antlr/internal/InternalGherkin.g:3675:1: ( ruleBackground )
            {
            // ../dk.itu.bddcontracts.ui/src-gen/dk/itu/bddcontracts/ui/contentassist/antlr/internal/InternalGherkin.g:3675:1: ( ruleBackground )
            // ../dk.itu.bddcontracts.ui/src-gen/dk/itu/bddcontracts/ui/contentassist/antlr/internal/InternalGherkin.g:3676:1: ruleBackground
            {
             before(grammarAccess.getFeatureAccess().getBackgroundBackgroundParserRuleCall_3_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleBackground_in_rule__Feature__BackgroundAssignment_37320);
            ruleBackground();

            state._fsp--;

             after(grammarAccess.getFeatureAccess().getBackgroundBackgroundParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Feature__BackgroundAssignment_3"


    // $ANTLR start "rule__Feature__ScenariosAssignment_4_0"
    // ../dk.itu.bddcontracts.ui/src-gen/dk/itu/bddcontracts/ui/contentassist/antlr/internal/InternalGherkin.g:3685:1: rule__Feature__ScenariosAssignment_4_0 : ( ruleScenario ) ;
    public final void rule__Feature__ScenariosAssignment_4_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.bddcontracts.ui/src-gen/dk/itu/bddcontracts/ui/contentassist/antlr/internal/InternalGherkin.g:3689:1: ( ( ruleScenario ) )
            // ../dk.itu.bddcontracts.ui/src-gen/dk/itu/bddcontracts/ui/contentassist/antlr/internal/InternalGherkin.g:3690:1: ( ruleScenario )
            {
            // ../dk.itu.bddcontracts.ui/src-gen/dk/itu/bddcontracts/ui/contentassist/antlr/internal/InternalGherkin.g:3690:1: ( ruleScenario )
            // ../dk.itu.bddcontracts.ui/src-gen/dk/itu/bddcontracts/ui/contentassist/antlr/internal/InternalGherkin.g:3691:1: ruleScenario
            {
             before(grammarAccess.getFeatureAccess().getScenariosScenarioParserRuleCall_4_0_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleScenario_in_rule__Feature__ScenariosAssignment_4_07351);
            ruleScenario();

            state._fsp--;

             after(grammarAccess.getFeatureAccess().getScenariosScenarioParserRuleCall_4_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Feature__ScenariosAssignment_4_0"


    // $ANTLR start "rule__Feature__ScenariosAssignment_4_1"
    // ../dk.itu.bddcontracts.ui/src-gen/dk/itu/bddcontracts/ui/contentassist/antlr/internal/InternalGherkin.g:3700:1: rule__Feature__ScenariosAssignment_4_1 : ( ruleScenario ) ;
    public final void rule__Feature__ScenariosAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.bddcontracts.ui/src-gen/dk/itu/bddcontracts/ui/contentassist/antlr/internal/InternalGherkin.g:3704:1: ( ( ruleScenario ) )
            // ../dk.itu.bddcontracts.ui/src-gen/dk/itu/bddcontracts/ui/contentassist/antlr/internal/InternalGherkin.g:3705:1: ( ruleScenario )
            {
            // ../dk.itu.bddcontracts.ui/src-gen/dk/itu/bddcontracts/ui/contentassist/antlr/internal/InternalGherkin.g:3705:1: ( ruleScenario )
            // ../dk.itu.bddcontracts.ui/src-gen/dk/itu/bddcontracts/ui/contentassist/antlr/internal/InternalGherkin.g:3706:1: ruleScenario
            {
             before(grammarAccess.getFeatureAccess().getScenariosScenarioParserRuleCall_4_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleScenario_in_rule__Feature__ScenariosAssignment_4_17382);
            ruleScenario();

            state._fsp--;

             after(grammarAccess.getFeatureAccess().getScenariosScenarioParserRuleCall_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Feature__ScenariosAssignment_4_1"


    // $ANTLR start "rule__Feature__BehaviorsAssignment_5_0"
    // ../dk.itu.bddcontracts.ui/src-gen/dk/itu/bddcontracts/ui/contentassist/antlr/internal/InternalGherkin.g:3715:1: rule__Feature__BehaviorsAssignment_5_0 : ( ruleBehavior ) ;
    public final void rule__Feature__BehaviorsAssignment_5_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.bddcontracts.ui/src-gen/dk/itu/bddcontracts/ui/contentassist/antlr/internal/InternalGherkin.g:3719:1: ( ( ruleBehavior ) )
            // ../dk.itu.bddcontracts.ui/src-gen/dk/itu/bddcontracts/ui/contentassist/antlr/internal/InternalGherkin.g:3720:1: ( ruleBehavior )
            {
            // ../dk.itu.bddcontracts.ui/src-gen/dk/itu/bddcontracts/ui/contentassist/antlr/internal/InternalGherkin.g:3720:1: ( ruleBehavior )
            // ../dk.itu.bddcontracts.ui/src-gen/dk/itu/bddcontracts/ui/contentassist/antlr/internal/InternalGherkin.g:3721:1: ruleBehavior
            {
             before(grammarAccess.getFeatureAccess().getBehaviorsBehaviorParserRuleCall_5_0_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleBehavior_in_rule__Feature__BehaviorsAssignment_5_07413);
            ruleBehavior();

            state._fsp--;

             after(grammarAccess.getFeatureAccess().getBehaviorsBehaviorParserRuleCall_5_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Feature__BehaviorsAssignment_5_0"


    // $ANTLR start "rule__Feature__BehaviorsAssignment_5_1"
    // ../dk.itu.bddcontracts.ui/src-gen/dk/itu/bddcontracts/ui/contentassist/antlr/internal/InternalGherkin.g:3730:1: rule__Feature__BehaviorsAssignment_5_1 : ( ruleBehavior ) ;
    public final void rule__Feature__BehaviorsAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.bddcontracts.ui/src-gen/dk/itu/bddcontracts/ui/contentassist/antlr/internal/InternalGherkin.g:3734:1: ( ( ruleBehavior ) )
            // ../dk.itu.bddcontracts.ui/src-gen/dk/itu/bddcontracts/ui/contentassist/antlr/internal/InternalGherkin.g:3735:1: ( ruleBehavior )
            {
            // ../dk.itu.bddcontracts.ui/src-gen/dk/itu/bddcontracts/ui/contentassist/antlr/internal/InternalGherkin.g:3735:1: ( ruleBehavior )
            // ../dk.itu.bddcontracts.ui/src-gen/dk/itu/bddcontracts/ui/contentassist/antlr/internal/InternalGherkin.g:3736:1: ruleBehavior
            {
             before(grammarAccess.getFeatureAccess().getBehaviorsBehaviorParserRuleCall_5_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleBehavior_in_rule__Feature__BehaviorsAssignment_5_17444);
            ruleBehavior();

            state._fsp--;

             after(grammarAccess.getFeatureAccess().getBehaviorsBehaviorParserRuleCall_5_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Feature__BehaviorsAssignment_5_1"


    // $ANTLR start "rule__Background__GivenBlocksAssignment_2"
    // ../dk.itu.bddcontracts.ui/src-gen/dk/itu/bddcontracts/ui/contentassist/antlr/internal/InternalGherkin.g:3745:1: rule__Background__GivenBlocksAssignment_2 : ( ruleSentence ) ;
    public final void rule__Background__GivenBlocksAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.bddcontracts.ui/src-gen/dk/itu/bddcontracts/ui/contentassist/antlr/internal/InternalGherkin.g:3749:1: ( ( ruleSentence ) )
            // ../dk.itu.bddcontracts.ui/src-gen/dk/itu/bddcontracts/ui/contentassist/antlr/internal/InternalGherkin.g:3750:1: ( ruleSentence )
            {
            // ../dk.itu.bddcontracts.ui/src-gen/dk/itu/bddcontracts/ui/contentassist/antlr/internal/InternalGherkin.g:3750:1: ( ruleSentence )
            // ../dk.itu.bddcontracts.ui/src-gen/dk/itu/bddcontracts/ui/contentassist/antlr/internal/InternalGherkin.g:3751:1: ruleSentence
            {
             before(grammarAccess.getBackgroundAccess().getGivenBlocksSentenceParserRuleCall_2_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleSentence_in_rule__Background__GivenBlocksAssignment_27475);
            ruleSentence();

            state._fsp--;

             after(grammarAccess.getBackgroundAccess().getGivenBlocksSentenceParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Background__GivenBlocksAssignment_2"


    // $ANTLR start "rule__Background__GivenBlocksAssignment_3_1"
    // ../dk.itu.bddcontracts.ui/src-gen/dk/itu/bddcontracts/ui/contentassist/antlr/internal/InternalGherkin.g:3760:1: rule__Background__GivenBlocksAssignment_3_1 : ( ruleSentence ) ;
    public final void rule__Background__GivenBlocksAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.bddcontracts.ui/src-gen/dk/itu/bddcontracts/ui/contentassist/antlr/internal/InternalGherkin.g:3764:1: ( ( ruleSentence ) )
            // ../dk.itu.bddcontracts.ui/src-gen/dk/itu/bddcontracts/ui/contentassist/antlr/internal/InternalGherkin.g:3765:1: ( ruleSentence )
            {
            // ../dk.itu.bddcontracts.ui/src-gen/dk/itu/bddcontracts/ui/contentassist/antlr/internal/InternalGherkin.g:3765:1: ( ruleSentence )
            // ../dk.itu.bddcontracts.ui/src-gen/dk/itu/bddcontracts/ui/contentassist/antlr/internal/InternalGherkin.g:3766:1: ruleSentence
            {
             before(grammarAccess.getBackgroundAccess().getGivenBlocksSentenceParserRuleCall_3_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleSentence_in_rule__Background__GivenBlocksAssignment_3_17506);
            ruleSentence();

            state._fsp--;

             after(grammarAccess.getBackgroundAccess().getGivenBlocksSentenceParserRuleCall_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Background__GivenBlocksAssignment_3_1"


    // $ANTLR start "rule__Behavior__DescriptionAssignment_1"
    // ../dk.itu.bddcontracts.ui/src-gen/dk/itu/bddcontracts/ui/contentassist/antlr/internal/InternalGherkin.g:3775:1: rule__Behavior__DescriptionAssignment_1 : ( ruleMAny ) ;
    public final void rule__Behavior__DescriptionAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.bddcontracts.ui/src-gen/dk/itu/bddcontracts/ui/contentassist/antlr/internal/InternalGherkin.g:3779:1: ( ( ruleMAny ) )
            // ../dk.itu.bddcontracts.ui/src-gen/dk/itu/bddcontracts/ui/contentassist/antlr/internal/InternalGherkin.g:3780:1: ( ruleMAny )
            {
            // ../dk.itu.bddcontracts.ui/src-gen/dk/itu/bddcontracts/ui/contentassist/antlr/internal/InternalGherkin.g:3780:1: ( ruleMAny )
            // ../dk.itu.bddcontracts.ui/src-gen/dk/itu/bddcontracts/ui/contentassist/antlr/internal/InternalGherkin.g:3781:1: ruleMAny
            {
             before(grammarAccess.getBehaviorAccess().getDescriptionMAnyParserRuleCall_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleMAny_in_rule__Behavior__DescriptionAssignment_17537);
            ruleMAny();

            state._fsp--;

             after(grammarAccess.getBehaviorAccess().getDescriptionMAnyParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Behavior__DescriptionAssignment_1"


    // $ANTLR start "rule__Behavior__RequiringBlocksAssignment_2_1"
    // ../dk.itu.bddcontracts.ui/src-gen/dk/itu/bddcontracts/ui/contentassist/antlr/internal/InternalGherkin.g:3790:1: rule__Behavior__RequiringBlocksAssignment_2_1 : ( ruleSentence ) ;
    public final void rule__Behavior__RequiringBlocksAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.bddcontracts.ui/src-gen/dk/itu/bddcontracts/ui/contentassist/antlr/internal/InternalGherkin.g:3794:1: ( ( ruleSentence ) )
            // ../dk.itu.bddcontracts.ui/src-gen/dk/itu/bddcontracts/ui/contentassist/antlr/internal/InternalGherkin.g:3795:1: ( ruleSentence )
            {
            // ../dk.itu.bddcontracts.ui/src-gen/dk/itu/bddcontracts/ui/contentassist/antlr/internal/InternalGherkin.g:3795:1: ( ruleSentence )
            // ../dk.itu.bddcontracts.ui/src-gen/dk/itu/bddcontracts/ui/contentassist/antlr/internal/InternalGherkin.g:3796:1: ruleSentence
            {
             before(grammarAccess.getBehaviorAccess().getRequiringBlocksSentenceParserRuleCall_2_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleSentence_in_rule__Behavior__RequiringBlocksAssignment_2_17568);
            ruleSentence();

            state._fsp--;

             after(grammarAccess.getBehaviorAccess().getRequiringBlocksSentenceParserRuleCall_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Behavior__RequiringBlocksAssignment_2_1"


    // $ANTLR start "rule__Behavior__RequiringBlocksAssignment_2_2_1"
    // ../dk.itu.bddcontracts.ui/src-gen/dk/itu/bddcontracts/ui/contentassist/antlr/internal/InternalGherkin.g:3805:1: rule__Behavior__RequiringBlocksAssignment_2_2_1 : ( ruleSentence ) ;
    public final void rule__Behavior__RequiringBlocksAssignment_2_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.bddcontracts.ui/src-gen/dk/itu/bddcontracts/ui/contentassist/antlr/internal/InternalGherkin.g:3809:1: ( ( ruleSentence ) )
            // ../dk.itu.bddcontracts.ui/src-gen/dk/itu/bddcontracts/ui/contentassist/antlr/internal/InternalGherkin.g:3810:1: ( ruleSentence )
            {
            // ../dk.itu.bddcontracts.ui/src-gen/dk/itu/bddcontracts/ui/contentassist/antlr/internal/InternalGherkin.g:3810:1: ( ruleSentence )
            // ../dk.itu.bddcontracts.ui/src-gen/dk/itu/bddcontracts/ui/contentassist/antlr/internal/InternalGherkin.g:3811:1: ruleSentence
            {
             before(grammarAccess.getBehaviorAccess().getRequiringBlocksSentenceParserRuleCall_2_2_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleSentence_in_rule__Behavior__RequiringBlocksAssignment_2_2_17599);
            ruleSentence();

            state._fsp--;

             after(grammarAccess.getBehaviorAccess().getRequiringBlocksSentenceParserRuleCall_2_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Behavior__RequiringBlocksAssignment_2_2_1"


    // $ANTLR start "rule__Behavior__EnsuringBlocksAssignment_3_1"
    // ../dk.itu.bddcontracts.ui/src-gen/dk/itu/bddcontracts/ui/contentassist/antlr/internal/InternalGherkin.g:3820:1: rule__Behavior__EnsuringBlocksAssignment_3_1 : ( ruleSentence ) ;
    public final void rule__Behavior__EnsuringBlocksAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.bddcontracts.ui/src-gen/dk/itu/bddcontracts/ui/contentassist/antlr/internal/InternalGherkin.g:3824:1: ( ( ruleSentence ) )
            // ../dk.itu.bddcontracts.ui/src-gen/dk/itu/bddcontracts/ui/contentassist/antlr/internal/InternalGherkin.g:3825:1: ( ruleSentence )
            {
            // ../dk.itu.bddcontracts.ui/src-gen/dk/itu/bddcontracts/ui/contentassist/antlr/internal/InternalGherkin.g:3825:1: ( ruleSentence )
            // ../dk.itu.bddcontracts.ui/src-gen/dk/itu/bddcontracts/ui/contentassist/antlr/internal/InternalGherkin.g:3826:1: ruleSentence
            {
             before(grammarAccess.getBehaviorAccess().getEnsuringBlocksSentenceParserRuleCall_3_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleSentence_in_rule__Behavior__EnsuringBlocksAssignment_3_17630);
            ruleSentence();

            state._fsp--;

             after(grammarAccess.getBehaviorAccess().getEnsuringBlocksSentenceParserRuleCall_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Behavior__EnsuringBlocksAssignment_3_1"


    // $ANTLR start "rule__Behavior__EnsuringBlocksAssignment_3_2_1"
    // ../dk.itu.bddcontracts.ui/src-gen/dk/itu/bddcontracts/ui/contentassist/antlr/internal/InternalGherkin.g:3835:1: rule__Behavior__EnsuringBlocksAssignment_3_2_1 : ( ruleSentence ) ;
    public final void rule__Behavior__EnsuringBlocksAssignment_3_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.bddcontracts.ui/src-gen/dk/itu/bddcontracts/ui/contentassist/antlr/internal/InternalGherkin.g:3839:1: ( ( ruleSentence ) )
            // ../dk.itu.bddcontracts.ui/src-gen/dk/itu/bddcontracts/ui/contentassist/antlr/internal/InternalGherkin.g:3840:1: ( ruleSentence )
            {
            // ../dk.itu.bddcontracts.ui/src-gen/dk/itu/bddcontracts/ui/contentassist/antlr/internal/InternalGherkin.g:3840:1: ( ruleSentence )
            // ../dk.itu.bddcontracts.ui/src-gen/dk/itu/bddcontracts/ui/contentassist/antlr/internal/InternalGherkin.g:3841:1: ruleSentence
            {
             before(grammarAccess.getBehaviorAccess().getEnsuringBlocksSentenceParserRuleCall_3_2_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleSentence_in_rule__Behavior__EnsuringBlocksAssignment_3_2_17661);
            ruleSentence();

            state._fsp--;

             after(grammarAccess.getBehaviorAccess().getEnsuringBlocksSentenceParserRuleCall_3_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Behavior__EnsuringBlocksAssignment_3_2_1"


    // $ANTLR start "rule__Sentence__WordsAssignment_0"
    // ../dk.itu.bddcontracts.ui/src-gen/dk/itu/bddcontracts/ui/contentassist/antlr/internal/InternalGherkin.g:3850:1: rule__Sentence__WordsAssignment_0 : ( ruleContent ) ;
    public final void rule__Sentence__WordsAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.bddcontracts.ui/src-gen/dk/itu/bddcontracts/ui/contentassist/antlr/internal/InternalGherkin.g:3854:1: ( ( ruleContent ) )
            // ../dk.itu.bddcontracts.ui/src-gen/dk/itu/bddcontracts/ui/contentassist/antlr/internal/InternalGherkin.g:3855:1: ( ruleContent )
            {
            // ../dk.itu.bddcontracts.ui/src-gen/dk/itu/bddcontracts/ui/contentassist/antlr/internal/InternalGherkin.g:3855:1: ( ruleContent )
            // ../dk.itu.bddcontracts.ui/src-gen/dk/itu/bddcontracts/ui/contentassist/antlr/internal/InternalGherkin.g:3856:1: ruleContent
            {
             before(grammarAccess.getSentenceAccess().getWordsContentParserRuleCall_0_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleContent_in_rule__Sentence__WordsAssignment_07692);
            ruleContent();

            state._fsp--;

             after(grammarAccess.getSentenceAccess().getWordsContentParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sentence__WordsAssignment_0"


    // $ANTLR start "rule__Sentence__WordsAssignment_1"
    // ../dk.itu.bddcontracts.ui/src-gen/dk/itu/bddcontracts/ui/contentassist/antlr/internal/InternalGherkin.g:3865:1: rule__Sentence__WordsAssignment_1 : ( ruleContent ) ;
    public final void rule__Sentence__WordsAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.bddcontracts.ui/src-gen/dk/itu/bddcontracts/ui/contentassist/antlr/internal/InternalGherkin.g:3869:1: ( ( ruleContent ) )
            // ../dk.itu.bddcontracts.ui/src-gen/dk/itu/bddcontracts/ui/contentassist/antlr/internal/InternalGherkin.g:3870:1: ( ruleContent )
            {
            // ../dk.itu.bddcontracts.ui/src-gen/dk/itu/bddcontracts/ui/contentassist/antlr/internal/InternalGherkin.g:3870:1: ( ruleContent )
            // ../dk.itu.bddcontracts.ui/src-gen/dk/itu/bddcontracts/ui/contentassist/antlr/internal/InternalGherkin.g:3871:1: ruleContent
            {
             before(grammarAccess.getSentenceAccess().getWordsContentParserRuleCall_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleContent_in_rule__Sentence__WordsAssignment_17723);
            ruleContent();

            state._fsp--;

             after(grammarAccess.getSentenceAccess().getWordsContentParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sentence__WordsAssignment_1"


    // $ANTLR start "rule__ScenarioSpecific__DescriptionAssignment_1"
    // ../dk.itu.bddcontracts.ui/src-gen/dk/itu/bddcontracts/ui/contentassist/antlr/internal/InternalGherkin.g:3880:1: rule__ScenarioSpecific__DescriptionAssignment_1 : ( ruleMAny ) ;
    public final void rule__ScenarioSpecific__DescriptionAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.bddcontracts.ui/src-gen/dk/itu/bddcontracts/ui/contentassist/antlr/internal/InternalGherkin.g:3884:1: ( ( ruleMAny ) )
            // ../dk.itu.bddcontracts.ui/src-gen/dk/itu/bddcontracts/ui/contentassist/antlr/internal/InternalGherkin.g:3885:1: ( ruleMAny )
            {
            // ../dk.itu.bddcontracts.ui/src-gen/dk/itu/bddcontracts/ui/contentassist/antlr/internal/InternalGherkin.g:3885:1: ( ruleMAny )
            // ../dk.itu.bddcontracts.ui/src-gen/dk/itu/bddcontracts/ui/contentassist/antlr/internal/InternalGherkin.g:3886:1: ruleMAny
            {
             before(grammarAccess.getScenarioSpecificAccess().getDescriptionMAnyParserRuleCall_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleMAny_in_rule__ScenarioSpecific__DescriptionAssignment_17754);
            ruleMAny();

            state._fsp--;

             after(grammarAccess.getScenarioSpecificAccess().getDescriptionMAnyParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ScenarioSpecific__DescriptionAssignment_1"


    // $ANTLR start "rule__ScenarioSpecific__GivenBlocksAssignment_3"
    // ../dk.itu.bddcontracts.ui/src-gen/dk/itu/bddcontracts/ui/contentassist/antlr/internal/InternalGherkin.g:3895:1: rule__ScenarioSpecific__GivenBlocksAssignment_3 : ( ruleSentence ) ;
    public final void rule__ScenarioSpecific__GivenBlocksAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.bddcontracts.ui/src-gen/dk/itu/bddcontracts/ui/contentassist/antlr/internal/InternalGherkin.g:3899:1: ( ( ruleSentence ) )
            // ../dk.itu.bddcontracts.ui/src-gen/dk/itu/bddcontracts/ui/contentassist/antlr/internal/InternalGherkin.g:3900:1: ( ruleSentence )
            {
            // ../dk.itu.bddcontracts.ui/src-gen/dk/itu/bddcontracts/ui/contentassist/antlr/internal/InternalGherkin.g:3900:1: ( ruleSentence )
            // ../dk.itu.bddcontracts.ui/src-gen/dk/itu/bddcontracts/ui/contentassist/antlr/internal/InternalGherkin.g:3901:1: ruleSentence
            {
             before(grammarAccess.getScenarioSpecificAccess().getGivenBlocksSentenceParserRuleCall_3_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleSentence_in_rule__ScenarioSpecific__GivenBlocksAssignment_37785);
            ruleSentence();

            state._fsp--;

             after(grammarAccess.getScenarioSpecificAccess().getGivenBlocksSentenceParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ScenarioSpecific__GivenBlocksAssignment_3"


    // $ANTLR start "rule__ScenarioSpecific__GivenBlocksAssignment_4_1"
    // ../dk.itu.bddcontracts.ui/src-gen/dk/itu/bddcontracts/ui/contentassist/antlr/internal/InternalGherkin.g:3910:1: rule__ScenarioSpecific__GivenBlocksAssignment_4_1 : ( ruleSentence ) ;
    public final void rule__ScenarioSpecific__GivenBlocksAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.bddcontracts.ui/src-gen/dk/itu/bddcontracts/ui/contentassist/antlr/internal/InternalGherkin.g:3914:1: ( ( ruleSentence ) )
            // ../dk.itu.bddcontracts.ui/src-gen/dk/itu/bddcontracts/ui/contentassist/antlr/internal/InternalGherkin.g:3915:1: ( ruleSentence )
            {
            // ../dk.itu.bddcontracts.ui/src-gen/dk/itu/bddcontracts/ui/contentassist/antlr/internal/InternalGherkin.g:3915:1: ( ruleSentence )
            // ../dk.itu.bddcontracts.ui/src-gen/dk/itu/bddcontracts/ui/contentassist/antlr/internal/InternalGherkin.g:3916:1: ruleSentence
            {
             before(grammarAccess.getScenarioSpecificAccess().getGivenBlocksSentenceParserRuleCall_4_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleSentence_in_rule__ScenarioSpecific__GivenBlocksAssignment_4_17816);
            ruleSentence();

            state._fsp--;

             after(grammarAccess.getScenarioSpecificAccess().getGivenBlocksSentenceParserRuleCall_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ScenarioSpecific__GivenBlocksAssignment_4_1"


    // $ANTLR start "rule__ScenarioSpecific__WhenBlocksAssignment_5_1"
    // ../dk.itu.bddcontracts.ui/src-gen/dk/itu/bddcontracts/ui/contentassist/antlr/internal/InternalGherkin.g:3925:1: rule__ScenarioSpecific__WhenBlocksAssignment_5_1 : ( ruleSentence ) ;
    public final void rule__ScenarioSpecific__WhenBlocksAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.bddcontracts.ui/src-gen/dk/itu/bddcontracts/ui/contentassist/antlr/internal/InternalGherkin.g:3929:1: ( ( ruleSentence ) )
            // ../dk.itu.bddcontracts.ui/src-gen/dk/itu/bddcontracts/ui/contentassist/antlr/internal/InternalGherkin.g:3930:1: ( ruleSentence )
            {
            // ../dk.itu.bddcontracts.ui/src-gen/dk/itu/bddcontracts/ui/contentassist/antlr/internal/InternalGherkin.g:3930:1: ( ruleSentence )
            // ../dk.itu.bddcontracts.ui/src-gen/dk/itu/bddcontracts/ui/contentassist/antlr/internal/InternalGherkin.g:3931:1: ruleSentence
            {
             before(grammarAccess.getScenarioSpecificAccess().getWhenBlocksSentenceParserRuleCall_5_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleSentence_in_rule__ScenarioSpecific__WhenBlocksAssignment_5_17847);
            ruleSentence();

            state._fsp--;

             after(grammarAccess.getScenarioSpecificAccess().getWhenBlocksSentenceParserRuleCall_5_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ScenarioSpecific__WhenBlocksAssignment_5_1"


    // $ANTLR start "rule__ScenarioSpecific__WhenBlocksAssignment_5_2_1"
    // ../dk.itu.bddcontracts.ui/src-gen/dk/itu/bddcontracts/ui/contentassist/antlr/internal/InternalGherkin.g:3940:1: rule__ScenarioSpecific__WhenBlocksAssignment_5_2_1 : ( ruleSentence ) ;
    public final void rule__ScenarioSpecific__WhenBlocksAssignment_5_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.bddcontracts.ui/src-gen/dk/itu/bddcontracts/ui/contentassist/antlr/internal/InternalGherkin.g:3944:1: ( ( ruleSentence ) )
            // ../dk.itu.bddcontracts.ui/src-gen/dk/itu/bddcontracts/ui/contentassist/antlr/internal/InternalGherkin.g:3945:1: ( ruleSentence )
            {
            // ../dk.itu.bddcontracts.ui/src-gen/dk/itu/bddcontracts/ui/contentassist/antlr/internal/InternalGherkin.g:3945:1: ( ruleSentence )
            // ../dk.itu.bddcontracts.ui/src-gen/dk/itu/bddcontracts/ui/contentassist/antlr/internal/InternalGherkin.g:3946:1: ruleSentence
            {
             before(grammarAccess.getScenarioSpecificAccess().getWhenBlocksSentenceParserRuleCall_5_2_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleSentence_in_rule__ScenarioSpecific__WhenBlocksAssignment_5_2_17878);
            ruleSentence();

            state._fsp--;

             after(grammarAccess.getScenarioSpecificAccess().getWhenBlocksSentenceParserRuleCall_5_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ScenarioSpecific__WhenBlocksAssignment_5_2_1"


    // $ANTLR start "rule__ScenarioSpecific__ThenBlocksAssignment_7"
    // ../dk.itu.bddcontracts.ui/src-gen/dk/itu/bddcontracts/ui/contentassist/antlr/internal/InternalGherkin.g:3955:1: rule__ScenarioSpecific__ThenBlocksAssignment_7 : ( ruleSentence ) ;
    public final void rule__ScenarioSpecific__ThenBlocksAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.bddcontracts.ui/src-gen/dk/itu/bddcontracts/ui/contentassist/antlr/internal/InternalGherkin.g:3959:1: ( ( ruleSentence ) )
            // ../dk.itu.bddcontracts.ui/src-gen/dk/itu/bddcontracts/ui/contentassist/antlr/internal/InternalGherkin.g:3960:1: ( ruleSentence )
            {
            // ../dk.itu.bddcontracts.ui/src-gen/dk/itu/bddcontracts/ui/contentassist/antlr/internal/InternalGherkin.g:3960:1: ( ruleSentence )
            // ../dk.itu.bddcontracts.ui/src-gen/dk/itu/bddcontracts/ui/contentassist/antlr/internal/InternalGherkin.g:3961:1: ruleSentence
            {
             before(grammarAccess.getScenarioSpecificAccess().getThenBlocksSentenceParserRuleCall_7_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleSentence_in_rule__ScenarioSpecific__ThenBlocksAssignment_77909);
            ruleSentence();

            state._fsp--;

             after(grammarAccess.getScenarioSpecificAccess().getThenBlocksSentenceParserRuleCall_7_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ScenarioSpecific__ThenBlocksAssignment_7"


    // $ANTLR start "rule__ScenarioSpecific__ThenBlocksAssignment_8_1"
    // ../dk.itu.bddcontracts.ui/src-gen/dk/itu/bddcontracts/ui/contentassist/antlr/internal/InternalGherkin.g:3970:1: rule__ScenarioSpecific__ThenBlocksAssignment_8_1 : ( ruleSentence ) ;
    public final void rule__ScenarioSpecific__ThenBlocksAssignment_8_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.bddcontracts.ui/src-gen/dk/itu/bddcontracts/ui/contentassist/antlr/internal/InternalGherkin.g:3974:1: ( ( ruleSentence ) )
            // ../dk.itu.bddcontracts.ui/src-gen/dk/itu/bddcontracts/ui/contentassist/antlr/internal/InternalGherkin.g:3975:1: ( ruleSentence )
            {
            // ../dk.itu.bddcontracts.ui/src-gen/dk/itu/bddcontracts/ui/contentassist/antlr/internal/InternalGherkin.g:3975:1: ( ruleSentence )
            // ../dk.itu.bddcontracts.ui/src-gen/dk/itu/bddcontracts/ui/contentassist/antlr/internal/InternalGherkin.g:3976:1: ruleSentence
            {
             before(grammarAccess.getScenarioSpecificAccess().getThenBlocksSentenceParserRuleCall_8_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleSentence_in_rule__ScenarioSpecific__ThenBlocksAssignment_8_17940);
            ruleSentence();

            state._fsp--;

             after(grammarAccess.getScenarioSpecificAccess().getThenBlocksSentenceParserRuleCall_8_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ScenarioSpecific__ThenBlocksAssignment_8_1"


    // $ANTLR start "rule__ScenarioOutline__DescriptionAssignment_1"
    // ../dk.itu.bddcontracts.ui/src-gen/dk/itu/bddcontracts/ui/contentassist/antlr/internal/InternalGherkin.g:3985:1: rule__ScenarioOutline__DescriptionAssignment_1 : ( ruleMAny ) ;
    public final void rule__ScenarioOutline__DescriptionAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.bddcontracts.ui/src-gen/dk/itu/bddcontracts/ui/contentassist/antlr/internal/InternalGherkin.g:3989:1: ( ( ruleMAny ) )
            // ../dk.itu.bddcontracts.ui/src-gen/dk/itu/bddcontracts/ui/contentassist/antlr/internal/InternalGherkin.g:3990:1: ( ruleMAny )
            {
            // ../dk.itu.bddcontracts.ui/src-gen/dk/itu/bddcontracts/ui/contentassist/antlr/internal/InternalGherkin.g:3990:1: ( ruleMAny )
            // ../dk.itu.bddcontracts.ui/src-gen/dk/itu/bddcontracts/ui/contentassist/antlr/internal/InternalGherkin.g:3991:1: ruleMAny
            {
             before(grammarAccess.getScenarioOutlineAccess().getDescriptionMAnyParserRuleCall_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleMAny_in_rule__ScenarioOutline__DescriptionAssignment_17971);
            ruleMAny();

            state._fsp--;

             after(grammarAccess.getScenarioOutlineAccess().getDescriptionMAnyParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ScenarioOutline__DescriptionAssignment_1"


    // $ANTLR start "rule__ScenarioOutline__GivenBlocksAssignment_3"
    // ../dk.itu.bddcontracts.ui/src-gen/dk/itu/bddcontracts/ui/contentassist/antlr/internal/InternalGherkin.g:4000:1: rule__ScenarioOutline__GivenBlocksAssignment_3 : ( ruleSentence ) ;
    public final void rule__ScenarioOutline__GivenBlocksAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.bddcontracts.ui/src-gen/dk/itu/bddcontracts/ui/contentassist/antlr/internal/InternalGherkin.g:4004:1: ( ( ruleSentence ) )
            // ../dk.itu.bddcontracts.ui/src-gen/dk/itu/bddcontracts/ui/contentassist/antlr/internal/InternalGherkin.g:4005:1: ( ruleSentence )
            {
            // ../dk.itu.bddcontracts.ui/src-gen/dk/itu/bddcontracts/ui/contentassist/antlr/internal/InternalGherkin.g:4005:1: ( ruleSentence )
            // ../dk.itu.bddcontracts.ui/src-gen/dk/itu/bddcontracts/ui/contentassist/antlr/internal/InternalGherkin.g:4006:1: ruleSentence
            {
             before(grammarAccess.getScenarioOutlineAccess().getGivenBlocksSentenceParserRuleCall_3_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleSentence_in_rule__ScenarioOutline__GivenBlocksAssignment_38002);
            ruleSentence();

            state._fsp--;

             after(grammarAccess.getScenarioOutlineAccess().getGivenBlocksSentenceParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ScenarioOutline__GivenBlocksAssignment_3"


    // $ANTLR start "rule__ScenarioOutline__GivenBlocksAssignment_4_1"
    // ../dk.itu.bddcontracts.ui/src-gen/dk/itu/bddcontracts/ui/contentassist/antlr/internal/InternalGherkin.g:4015:1: rule__ScenarioOutline__GivenBlocksAssignment_4_1 : ( ruleSentence ) ;
    public final void rule__ScenarioOutline__GivenBlocksAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.bddcontracts.ui/src-gen/dk/itu/bddcontracts/ui/contentassist/antlr/internal/InternalGherkin.g:4019:1: ( ( ruleSentence ) )
            // ../dk.itu.bddcontracts.ui/src-gen/dk/itu/bddcontracts/ui/contentassist/antlr/internal/InternalGherkin.g:4020:1: ( ruleSentence )
            {
            // ../dk.itu.bddcontracts.ui/src-gen/dk/itu/bddcontracts/ui/contentassist/antlr/internal/InternalGherkin.g:4020:1: ( ruleSentence )
            // ../dk.itu.bddcontracts.ui/src-gen/dk/itu/bddcontracts/ui/contentassist/antlr/internal/InternalGherkin.g:4021:1: ruleSentence
            {
             before(grammarAccess.getScenarioOutlineAccess().getGivenBlocksSentenceParserRuleCall_4_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleSentence_in_rule__ScenarioOutline__GivenBlocksAssignment_4_18033);
            ruleSentence();

            state._fsp--;

             after(grammarAccess.getScenarioOutlineAccess().getGivenBlocksSentenceParserRuleCall_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ScenarioOutline__GivenBlocksAssignment_4_1"


    // $ANTLR start "rule__ScenarioOutline__WhenBlocksAssignment_5_1"
    // ../dk.itu.bddcontracts.ui/src-gen/dk/itu/bddcontracts/ui/contentassist/antlr/internal/InternalGherkin.g:4030:1: rule__ScenarioOutline__WhenBlocksAssignment_5_1 : ( ruleSentence ) ;
    public final void rule__ScenarioOutline__WhenBlocksAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.bddcontracts.ui/src-gen/dk/itu/bddcontracts/ui/contentassist/antlr/internal/InternalGherkin.g:4034:1: ( ( ruleSentence ) )
            // ../dk.itu.bddcontracts.ui/src-gen/dk/itu/bddcontracts/ui/contentassist/antlr/internal/InternalGherkin.g:4035:1: ( ruleSentence )
            {
            // ../dk.itu.bddcontracts.ui/src-gen/dk/itu/bddcontracts/ui/contentassist/antlr/internal/InternalGherkin.g:4035:1: ( ruleSentence )
            // ../dk.itu.bddcontracts.ui/src-gen/dk/itu/bddcontracts/ui/contentassist/antlr/internal/InternalGherkin.g:4036:1: ruleSentence
            {
             before(grammarAccess.getScenarioOutlineAccess().getWhenBlocksSentenceParserRuleCall_5_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleSentence_in_rule__ScenarioOutline__WhenBlocksAssignment_5_18064);
            ruleSentence();

            state._fsp--;

             after(grammarAccess.getScenarioOutlineAccess().getWhenBlocksSentenceParserRuleCall_5_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ScenarioOutline__WhenBlocksAssignment_5_1"


    // $ANTLR start "rule__ScenarioOutline__WhenBlocksAssignment_5_2_1"
    // ../dk.itu.bddcontracts.ui/src-gen/dk/itu/bddcontracts/ui/contentassist/antlr/internal/InternalGherkin.g:4045:1: rule__ScenarioOutline__WhenBlocksAssignment_5_2_1 : ( ruleSentence ) ;
    public final void rule__ScenarioOutline__WhenBlocksAssignment_5_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.bddcontracts.ui/src-gen/dk/itu/bddcontracts/ui/contentassist/antlr/internal/InternalGherkin.g:4049:1: ( ( ruleSentence ) )
            // ../dk.itu.bddcontracts.ui/src-gen/dk/itu/bddcontracts/ui/contentassist/antlr/internal/InternalGherkin.g:4050:1: ( ruleSentence )
            {
            // ../dk.itu.bddcontracts.ui/src-gen/dk/itu/bddcontracts/ui/contentassist/antlr/internal/InternalGherkin.g:4050:1: ( ruleSentence )
            // ../dk.itu.bddcontracts.ui/src-gen/dk/itu/bddcontracts/ui/contentassist/antlr/internal/InternalGherkin.g:4051:1: ruleSentence
            {
             before(grammarAccess.getScenarioOutlineAccess().getWhenBlocksSentenceParserRuleCall_5_2_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleSentence_in_rule__ScenarioOutline__WhenBlocksAssignment_5_2_18095);
            ruleSentence();

            state._fsp--;

             after(grammarAccess.getScenarioOutlineAccess().getWhenBlocksSentenceParserRuleCall_5_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ScenarioOutline__WhenBlocksAssignment_5_2_1"


    // $ANTLR start "rule__ScenarioOutline__ThenBlocksAssignment_7"
    // ../dk.itu.bddcontracts.ui/src-gen/dk/itu/bddcontracts/ui/contentassist/antlr/internal/InternalGherkin.g:4060:1: rule__ScenarioOutline__ThenBlocksAssignment_7 : ( ruleSentence ) ;
    public final void rule__ScenarioOutline__ThenBlocksAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.bddcontracts.ui/src-gen/dk/itu/bddcontracts/ui/contentassist/antlr/internal/InternalGherkin.g:4064:1: ( ( ruleSentence ) )
            // ../dk.itu.bddcontracts.ui/src-gen/dk/itu/bddcontracts/ui/contentassist/antlr/internal/InternalGherkin.g:4065:1: ( ruleSentence )
            {
            // ../dk.itu.bddcontracts.ui/src-gen/dk/itu/bddcontracts/ui/contentassist/antlr/internal/InternalGherkin.g:4065:1: ( ruleSentence )
            // ../dk.itu.bddcontracts.ui/src-gen/dk/itu/bddcontracts/ui/contentassist/antlr/internal/InternalGherkin.g:4066:1: ruleSentence
            {
             before(grammarAccess.getScenarioOutlineAccess().getThenBlocksSentenceParserRuleCall_7_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleSentence_in_rule__ScenarioOutline__ThenBlocksAssignment_78126);
            ruleSentence();

            state._fsp--;

             after(grammarAccess.getScenarioOutlineAccess().getThenBlocksSentenceParserRuleCall_7_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ScenarioOutline__ThenBlocksAssignment_7"


    // $ANTLR start "rule__ScenarioOutline__ThenBlocksAssignment_8_1"
    // ../dk.itu.bddcontracts.ui/src-gen/dk/itu/bddcontracts/ui/contentassist/antlr/internal/InternalGherkin.g:4075:1: rule__ScenarioOutline__ThenBlocksAssignment_8_1 : ( ruleSentence ) ;
    public final void rule__ScenarioOutline__ThenBlocksAssignment_8_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.bddcontracts.ui/src-gen/dk/itu/bddcontracts/ui/contentassist/antlr/internal/InternalGherkin.g:4079:1: ( ( ruleSentence ) )
            // ../dk.itu.bddcontracts.ui/src-gen/dk/itu/bddcontracts/ui/contentassist/antlr/internal/InternalGherkin.g:4080:1: ( ruleSentence )
            {
            // ../dk.itu.bddcontracts.ui/src-gen/dk/itu/bddcontracts/ui/contentassist/antlr/internal/InternalGherkin.g:4080:1: ( ruleSentence )
            // ../dk.itu.bddcontracts.ui/src-gen/dk/itu/bddcontracts/ui/contentassist/antlr/internal/InternalGherkin.g:4081:1: ruleSentence
            {
             before(grammarAccess.getScenarioOutlineAccess().getThenBlocksSentenceParserRuleCall_8_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleSentence_in_rule__ScenarioOutline__ThenBlocksAssignment_8_18157);
            ruleSentence();

            state._fsp--;

             after(grammarAccess.getScenarioOutlineAccess().getThenBlocksSentenceParserRuleCall_8_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ScenarioOutline__ThenBlocksAssignment_8_1"


    // $ANTLR start "rule__ScenarioOutline__ExamplesAssignment_10"
    // ../dk.itu.bddcontracts.ui/src-gen/dk/itu/bddcontracts/ui/contentassist/antlr/internal/InternalGherkin.g:4090:1: rule__ScenarioOutline__ExamplesAssignment_10 : ( ruleExample ) ;
    public final void rule__ScenarioOutline__ExamplesAssignment_10() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.bddcontracts.ui/src-gen/dk/itu/bddcontracts/ui/contentassist/antlr/internal/InternalGherkin.g:4094:1: ( ( ruleExample ) )
            // ../dk.itu.bddcontracts.ui/src-gen/dk/itu/bddcontracts/ui/contentassist/antlr/internal/InternalGherkin.g:4095:1: ( ruleExample )
            {
            // ../dk.itu.bddcontracts.ui/src-gen/dk/itu/bddcontracts/ui/contentassist/antlr/internal/InternalGherkin.g:4095:1: ( ruleExample )
            // ../dk.itu.bddcontracts.ui/src-gen/dk/itu/bddcontracts/ui/contentassist/antlr/internal/InternalGherkin.g:4096:1: ruleExample
            {
             before(grammarAccess.getScenarioOutlineAccess().getExamplesExampleParserRuleCall_10_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleExample_in_rule__ScenarioOutline__ExamplesAssignment_108188);
            ruleExample();

            state._fsp--;

             after(grammarAccess.getScenarioOutlineAccess().getExamplesExampleParserRuleCall_10_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ScenarioOutline__ExamplesAssignment_10"


    // $ANTLR start "rule__ScenarioOutline__ExamplesAssignment_11"
    // ../dk.itu.bddcontracts.ui/src-gen/dk/itu/bddcontracts/ui/contentassist/antlr/internal/InternalGherkin.g:4105:1: rule__ScenarioOutline__ExamplesAssignment_11 : ( ruleExample ) ;
    public final void rule__ScenarioOutline__ExamplesAssignment_11() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.bddcontracts.ui/src-gen/dk/itu/bddcontracts/ui/contentassist/antlr/internal/InternalGherkin.g:4109:1: ( ( ruleExample ) )
            // ../dk.itu.bddcontracts.ui/src-gen/dk/itu/bddcontracts/ui/contentassist/antlr/internal/InternalGherkin.g:4110:1: ( ruleExample )
            {
            // ../dk.itu.bddcontracts.ui/src-gen/dk/itu/bddcontracts/ui/contentassist/antlr/internal/InternalGherkin.g:4110:1: ( ruleExample )
            // ../dk.itu.bddcontracts.ui/src-gen/dk/itu/bddcontracts/ui/contentassist/antlr/internal/InternalGherkin.g:4111:1: ruleExample
            {
             before(grammarAccess.getScenarioOutlineAccess().getExamplesExampleParserRuleCall_11_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleExample_in_rule__ScenarioOutline__ExamplesAssignment_118219);
            ruleExample();

            state._fsp--;

             after(grammarAccess.getScenarioOutlineAccess().getExamplesExampleParserRuleCall_11_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ScenarioOutline__ExamplesAssignment_11"


    // $ANTLR start "rule__Reference__ValueAssignment_2"
    // ../dk.itu.bddcontracts.ui/src-gen/dk/itu/bddcontracts/ui/contentassist/antlr/internal/InternalGherkin.g:4120:1: rule__Reference__ValueAssignment_2 : ( RULE_ID ) ;
    public final void rule__Reference__ValueAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.bddcontracts.ui/src-gen/dk/itu/bddcontracts/ui/contentassist/antlr/internal/InternalGherkin.g:4124:1: ( ( RULE_ID ) )
            // ../dk.itu.bddcontracts.ui/src-gen/dk/itu/bddcontracts/ui/contentassist/antlr/internal/InternalGherkin.g:4125:1: ( RULE_ID )
            {
            // ../dk.itu.bddcontracts.ui/src-gen/dk/itu/bddcontracts/ui/contentassist/antlr/internal/InternalGherkin.g:4125:1: ( RULE_ID )
            // ../dk.itu.bddcontracts.ui/src-gen/dk/itu/bddcontracts/ui/contentassist/antlr/internal/InternalGherkin.g:4126:1: RULE_ID
            {
             before(grammarAccess.getReferenceAccess().getValueIDTerminalRuleCall_2_0()); 
            match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_rule__Reference__ValueAssignment_28250); 
             after(grammarAccess.getReferenceAccess().getValueIDTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Reference__ValueAssignment_2"


    // $ANTLR start "rule__Word__ValueAssignment"
    // ../dk.itu.bddcontracts.ui/src-gen/dk/itu/bddcontracts/ui/contentassist/antlr/internal/InternalGherkin.g:4135:1: rule__Word__ValueAssignment : ( ruleAny ) ;
    public final void rule__Word__ValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.bddcontracts.ui/src-gen/dk/itu/bddcontracts/ui/contentassist/antlr/internal/InternalGherkin.g:4139:1: ( ( ruleAny ) )
            // ../dk.itu.bddcontracts.ui/src-gen/dk/itu/bddcontracts/ui/contentassist/antlr/internal/InternalGherkin.g:4140:1: ( ruleAny )
            {
            // ../dk.itu.bddcontracts.ui/src-gen/dk/itu/bddcontracts/ui/contentassist/antlr/internal/InternalGherkin.g:4140:1: ( ruleAny )
            // ../dk.itu.bddcontracts.ui/src-gen/dk/itu/bddcontracts/ui/contentassist/antlr/internal/InternalGherkin.g:4141:1: ruleAny
            {
             before(grammarAccess.getWordAccess().getValueAnyParserRuleCall_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleAny_in_rule__Word__ValueAssignment8281);
            ruleAny();

            state._fsp--;

             after(grammarAccess.getWordAccess().getValueAnyParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Word__ValueAssignment"


    // $ANTLR start "rule__Example__KeysAssignment_1"
    // ../dk.itu.bddcontracts.ui/src-gen/dk/itu/bddcontracts/ui/contentassist/antlr/internal/InternalGherkin.g:4150:1: rule__Example__KeysAssignment_1 : ( ruleEString ) ;
    public final void rule__Example__KeysAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.bddcontracts.ui/src-gen/dk/itu/bddcontracts/ui/contentassist/antlr/internal/InternalGherkin.g:4154:1: ( ( ruleEString ) )
            // ../dk.itu.bddcontracts.ui/src-gen/dk/itu/bddcontracts/ui/contentassist/antlr/internal/InternalGherkin.g:4155:1: ( ruleEString )
            {
            // ../dk.itu.bddcontracts.ui/src-gen/dk/itu/bddcontracts/ui/contentassist/antlr/internal/InternalGherkin.g:4155:1: ( ruleEString )
            // ../dk.itu.bddcontracts.ui/src-gen/dk/itu/bddcontracts/ui/contentassist/antlr/internal/InternalGherkin.g:4156:1: ruleEString
            {
             before(grammarAccess.getExampleAccess().getKeysEStringParserRuleCall_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__Example__KeysAssignment_18312);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getExampleAccess().getKeysEStringParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Example__KeysAssignment_1"


    // $ANTLR start "rule__Example__KeysAssignment_2_1"
    // ../dk.itu.bddcontracts.ui/src-gen/dk/itu/bddcontracts/ui/contentassist/antlr/internal/InternalGherkin.g:4165:1: rule__Example__KeysAssignment_2_1 : ( ruleEString ) ;
    public final void rule__Example__KeysAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.bddcontracts.ui/src-gen/dk/itu/bddcontracts/ui/contentassist/antlr/internal/InternalGherkin.g:4169:1: ( ( ruleEString ) )
            // ../dk.itu.bddcontracts.ui/src-gen/dk/itu/bddcontracts/ui/contentassist/antlr/internal/InternalGherkin.g:4170:1: ( ruleEString )
            {
            // ../dk.itu.bddcontracts.ui/src-gen/dk/itu/bddcontracts/ui/contentassist/antlr/internal/InternalGherkin.g:4170:1: ( ruleEString )
            // ../dk.itu.bddcontracts.ui/src-gen/dk/itu/bddcontracts/ui/contentassist/antlr/internal/InternalGherkin.g:4171:1: ruleEString
            {
             before(grammarAccess.getExampleAccess().getKeysEStringParserRuleCall_2_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__Example__KeysAssignment_2_18343);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getExampleAccess().getKeysEStringParserRuleCall_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Example__KeysAssignment_2_1"


    // $ANTLR start "rule__Example__ValuesAssignment_4"
    // ../dk.itu.bddcontracts.ui/src-gen/dk/itu/bddcontracts/ui/contentassist/antlr/internal/InternalGherkin.g:4180:1: rule__Example__ValuesAssignment_4 : ( ruleValue ) ;
    public final void rule__Example__ValuesAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.bddcontracts.ui/src-gen/dk/itu/bddcontracts/ui/contentassist/antlr/internal/InternalGherkin.g:4184:1: ( ( ruleValue ) )
            // ../dk.itu.bddcontracts.ui/src-gen/dk/itu/bddcontracts/ui/contentassist/antlr/internal/InternalGherkin.g:4185:1: ( ruleValue )
            {
            // ../dk.itu.bddcontracts.ui/src-gen/dk/itu/bddcontracts/ui/contentassist/antlr/internal/InternalGherkin.g:4185:1: ( ruleValue )
            // ../dk.itu.bddcontracts.ui/src-gen/dk/itu/bddcontracts/ui/contentassist/antlr/internal/InternalGherkin.g:4186:1: ruleValue
            {
             before(grammarAccess.getExampleAccess().getValuesValueParserRuleCall_4_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleValue_in_rule__Example__ValuesAssignment_48374);
            ruleValue();

            state._fsp--;

             after(grammarAccess.getExampleAccess().getValuesValueParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Example__ValuesAssignment_4"


    // $ANTLR start "rule__Example__ValuesAssignment_5_1"
    // ../dk.itu.bddcontracts.ui/src-gen/dk/itu/bddcontracts/ui/contentassist/antlr/internal/InternalGherkin.g:4195:1: rule__Example__ValuesAssignment_5_1 : ( ruleValue ) ;
    public final void rule__Example__ValuesAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.bddcontracts.ui/src-gen/dk/itu/bddcontracts/ui/contentassist/antlr/internal/InternalGherkin.g:4199:1: ( ( ruleValue ) )
            // ../dk.itu.bddcontracts.ui/src-gen/dk/itu/bddcontracts/ui/contentassist/antlr/internal/InternalGherkin.g:4200:1: ( ruleValue )
            {
            // ../dk.itu.bddcontracts.ui/src-gen/dk/itu/bddcontracts/ui/contentassist/antlr/internal/InternalGherkin.g:4200:1: ( ruleValue )
            // ../dk.itu.bddcontracts.ui/src-gen/dk/itu/bddcontracts/ui/contentassist/antlr/internal/InternalGherkin.g:4201:1: ruleValue
            {
             before(grammarAccess.getExampleAccess().getValuesValueParserRuleCall_5_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleValue_in_rule__Example__ValuesAssignment_5_18405);
            ruleValue();

            state._fsp--;

             after(grammarAccess.getExampleAccess().getValuesValueParserRuleCall_5_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Example__ValuesAssignment_5_1"


    // $ANTLR start "rule__Value__ElementsAssignment_1"
    // ../dk.itu.bddcontracts.ui/src-gen/dk/itu/bddcontracts/ui/contentassist/antlr/internal/InternalGherkin.g:4210:1: rule__Value__ElementsAssignment_1 : ( ruleEString ) ;
    public final void rule__Value__ElementsAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.bddcontracts.ui/src-gen/dk/itu/bddcontracts/ui/contentassist/antlr/internal/InternalGherkin.g:4214:1: ( ( ruleEString ) )
            // ../dk.itu.bddcontracts.ui/src-gen/dk/itu/bddcontracts/ui/contentassist/antlr/internal/InternalGherkin.g:4215:1: ( ruleEString )
            {
            // ../dk.itu.bddcontracts.ui/src-gen/dk/itu/bddcontracts/ui/contentassist/antlr/internal/InternalGherkin.g:4215:1: ( ruleEString )
            // ../dk.itu.bddcontracts.ui/src-gen/dk/itu/bddcontracts/ui/contentassist/antlr/internal/InternalGherkin.g:4216:1: ruleEString
            {
             before(grammarAccess.getValueAccess().getElementsEStringParserRuleCall_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__Value__ElementsAssignment_18436);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getValueAccess().getElementsEStringParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Value__ElementsAssignment_1"


    // $ANTLR start "rule__Value__ElementsAssignment_2_1"
    // ../dk.itu.bddcontracts.ui/src-gen/dk/itu/bddcontracts/ui/contentassist/antlr/internal/InternalGherkin.g:4225:1: rule__Value__ElementsAssignment_2_1 : ( ruleEString ) ;
    public final void rule__Value__ElementsAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.bddcontracts.ui/src-gen/dk/itu/bddcontracts/ui/contentassist/antlr/internal/InternalGherkin.g:4229:1: ( ( ruleEString ) )
            // ../dk.itu.bddcontracts.ui/src-gen/dk/itu/bddcontracts/ui/contentassist/antlr/internal/InternalGherkin.g:4230:1: ( ruleEString )
            {
            // ../dk.itu.bddcontracts.ui/src-gen/dk/itu/bddcontracts/ui/contentassist/antlr/internal/InternalGherkin.g:4230:1: ( ruleEString )
            // ../dk.itu.bddcontracts.ui/src-gen/dk/itu/bddcontracts/ui/contentassist/antlr/internal/InternalGherkin.g:4231:1: ruleEString
            {
             before(grammarAccess.getValueAccess().getElementsEStringParserRuleCall_2_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__Value__ElementsAssignment_2_18467);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getValueAccess().getElementsEStringParserRuleCall_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Value__ElementsAssignment_2_1"

    // Delegated rules


 

    
    private static class FollowSets000 {
        public static final BitSet FOLLOW_ruleModel_in_entryRuleModel61 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleModel68 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Model__Group__0_in_ruleModel94 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleScenario_in_entryRuleScenario121 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleScenario128 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Scenario__Alternatives_in_ruleScenario154 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleContent_in_entryRuleContent181 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleContent188 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Content__Alternatives_in_ruleContent214 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleFeature_in_entryRuleFeature241 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleFeature248 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Feature__Group__0_in_ruleFeature274 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_entryRuleEString301 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleEString308 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__EString__Alternatives_in_ruleEString334 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleMAny_in_entryRuleMAny361 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleMAny368 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAny_in_ruleMAny397 = new BitSet(new long[]{0x00000000000000F2L});
        public static final BitSet FOLLOW_ruleAny_in_ruleMAny410 = new BitSet(new long[]{0x00000000000000F2L});
        public static final BitSet FOLLOW_ruleAny_in_entryRuleAny440 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleAny447 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Any__Alternatives_in_ruleAny473 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleBackground_in_entryRuleBackground500 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleBackground507 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Background__Group__0_in_ruleBackground533 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleBehavior_in_entryRuleBehavior560 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleBehavior567 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Behavior__Group__0_in_ruleBehavior593 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleSentence_in_entryRuleSentence620 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleSentence627 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Sentence__Group__0_in_ruleSentence653 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleScenarioSpecific_in_entryRuleScenarioSpecific680 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleScenarioSpecific687 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ScenarioSpecific__Group__0_in_ruleScenarioSpecific713 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleScenarioOutline_in_entryRuleScenarioOutline740 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleScenarioOutline747 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ScenarioOutline__Group__0_in_ruleScenarioOutline773 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleReference_in_entryRuleReference800 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleReference807 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Reference__Group__0_in_ruleReference833 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleWord_in_entryRuleWord860 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleWord867 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Word__ValueAssignment_in_ruleWord893 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleExample_in_entryRuleExample920 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleExample927 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Example__Group__0_in_ruleExample953 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleValue_in_entryRuleValue980 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleValue987 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Value__Group__0_in_ruleValue1013 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleScenarioSpecific_in_rule__Scenario__Alternatives1049 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleScenarioOutline_in_rule__Scenario__Alternatives1066 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleReference_in_rule__Content__Alternatives1098 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleWord_in_rule__Content__Alternatives1115 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_STRING_in_rule__EString__Alternatives1147 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_rule__EString__Alternatives1164 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_INT_in_rule__EString__Alternatives1181 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_rule__Any__Alternatives1213 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_INT_in_rule__Any__Alternatives1230 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_STRING_in_rule__Any__Alternatives1247 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ANY_OTHER_in_rule__Any__Alternatives1264 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Model__Group__0__Impl_in_rule__Model__Group__01294 = new BitSet(new long[]{0x0000000000000800L});
        public static final BitSet FOLLOW_rule__Model__Group__1_in_rule__Model__Group__01297 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Model__Group__1__Impl_in_rule__Model__Group__11355 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Model__Group_1__0_in_rule__Model__Group__1__Impl1382 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Model__Group_1__0__Impl_in_rule__Model__Group_1__01417 = new BitSet(new long[]{0x0000000000000800L});
        public static final BitSet FOLLOW_rule__Model__Group_1__1_in_rule__Model__Group_1__01420 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Model__FeaturesAssignment_1_0_in_rule__Model__Group_1__0__Impl1447 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Model__Group_1__1__Impl_in_rule__Model__Group_1__11477 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Model__FeaturesAssignment_1_1_in_rule__Model__Group_1__1__Impl1504 = new BitSet(new long[]{0x0000000000000802L});
        public static final BitSet FOLLOW_rule__Feature__Group__0__Impl_in_rule__Feature__Group__01539 = new BitSet(new long[]{0x0000000000000070L});
        public static final BitSet FOLLOW_rule__Feature__Group__1_in_rule__Feature__Group__01542 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_11_in_rule__Feature__Group__0__Impl1570 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Feature__Group__1__Impl_in_rule__Feature__Group__11601 = new BitSet(new long[]{0x00000000002490F0L});
        public static final BitSet FOLLOW_rule__Feature__Group__2_in_rule__Feature__Group__11604 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Feature__DescriptionAssignment_1_in_rule__Feature__Group__1__Impl1631 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Feature__Group__2__Impl_in_rule__Feature__Group__21661 = new BitSet(new long[]{0x00000000002490F0L});
        public static final BitSet FOLLOW_rule__Feature__Group__3_in_rule__Feature__Group__21664 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Feature__SummaryAssignment_2_in_rule__Feature__Group__2__Impl1691 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Feature__Group__3__Impl_in_rule__Feature__Group__31722 = new BitSet(new long[]{0x00000000002490F0L});
        public static final BitSet FOLLOW_rule__Feature__Group__4_in_rule__Feature__Group__31725 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Feature__BackgroundAssignment_3_in_rule__Feature__Group__3__Impl1752 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Feature__Group__4__Impl_in_rule__Feature__Group__41783 = new BitSet(new long[]{0x00000000002490F0L});
        public static final BitSet FOLLOW_rule__Feature__Group__5_in_rule__Feature__Group__41786 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Feature__Group_4__0_in_rule__Feature__Group__4__Impl1813 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Feature__Group__5__Impl_in_rule__Feature__Group__51844 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Feature__Group_5__0_in_rule__Feature__Group__5__Impl1871 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Feature__Group_4__0__Impl_in_rule__Feature__Group_4__01914 = new BitSet(new long[]{0x0000000000240000L});
        public static final BitSet FOLLOW_rule__Feature__Group_4__1_in_rule__Feature__Group_4__01917 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Feature__ScenariosAssignment_4_0_in_rule__Feature__Group_4__0__Impl1944 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Feature__Group_4__1__Impl_in_rule__Feature__Group_4__11974 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Feature__ScenariosAssignment_4_1_in_rule__Feature__Group_4__1__Impl2001 = new BitSet(new long[]{0x0000000000240002L});
        public static final BitSet FOLLOW_rule__Feature__Group_5__0__Impl_in_rule__Feature__Group_5__02036 = new BitSet(new long[]{0x0000000000008000L});
        public static final BitSet FOLLOW_rule__Feature__Group_5__1_in_rule__Feature__Group_5__02039 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Feature__BehaviorsAssignment_5_0_in_rule__Feature__Group_5__0__Impl2066 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Feature__Group_5__1__Impl_in_rule__Feature__Group_5__12096 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Feature__BehaviorsAssignment_5_1_in_rule__Feature__Group_5__1__Impl2123 = new BitSet(new long[]{0x0000000000008002L});
        public static final BitSet FOLLOW_rule__Background__Group__0__Impl_in_rule__Background__Group__02158 = new BitSet(new long[]{0x0000000000002000L});
        public static final BitSet FOLLOW_rule__Background__Group__1_in_rule__Background__Group__02161 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_12_in_rule__Background__Group__0__Impl2189 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Background__Group__1__Impl_in_rule__Background__Group__12220 = new BitSet(new long[]{0x00000000008000F0L});
        public static final BitSet FOLLOW_rule__Background__Group__2_in_rule__Background__Group__12223 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_13_in_rule__Background__Group__1__Impl2251 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Background__Group__2__Impl_in_rule__Background__Group__22282 = new BitSet(new long[]{0x0000000000004000L});
        public static final BitSet FOLLOW_rule__Background__Group__3_in_rule__Background__Group__22285 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Background__GivenBlocksAssignment_2_in_rule__Background__Group__2__Impl2312 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Background__Group__3__Impl_in_rule__Background__Group__32342 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Background__Group_3__0_in_rule__Background__Group__3__Impl2369 = new BitSet(new long[]{0x0000000000004002L});
        public static final BitSet FOLLOW_rule__Background__Group_3__0__Impl_in_rule__Background__Group_3__02408 = new BitSet(new long[]{0x00000000008000F0L});
        public static final BitSet FOLLOW_rule__Background__Group_3__1_in_rule__Background__Group_3__02411 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_14_in_rule__Background__Group_3__0__Impl2439 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Background__Group_3__1__Impl_in_rule__Background__Group_3__12470 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Background__GivenBlocksAssignment_3_1_in_rule__Background__Group_3__1__Impl2497 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Behavior__Group__0__Impl_in_rule__Behavior__Group__02531 = new BitSet(new long[]{0x00000000000000F0L});
        public static final BitSet FOLLOW_rule__Behavior__Group__1_in_rule__Behavior__Group__02534 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_15_in_rule__Behavior__Group__0__Impl2562 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Behavior__Group__1__Impl_in_rule__Behavior__Group__12593 = new BitSet(new long[]{0x0000000000030000L});
        public static final BitSet FOLLOW_rule__Behavior__Group__2_in_rule__Behavior__Group__12596 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Behavior__DescriptionAssignment_1_in_rule__Behavior__Group__1__Impl2623 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Behavior__Group__2__Impl_in_rule__Behavior__Group__22653 = new BitSet(new long[]{0x0000000000030000L});
        public static final BitSet FOLLOW_rule__Behavior__Group__3_in_rule__Behavior__Group__22656 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Behavior__Group_2__0_in_rule__Behavior__Group__2__Impl2683 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Behavior__Group__3__Impl_in_rule__Behavior__Group__32714 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Behavior__Group_3__0_in_rule__Behavior__Group__3__Impl2741 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Behavior__Group_2__0__Impl_in_rule__Behavior__Group_2__02780 = new BitSet(new long[]{0x00000000008000F0L});
        public static final BitSet FOLLOW_rule__Behavior__Group_2__1_in_rule__Behavior__Group_2__02783 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_16_in_rule__Behavior__Group_2__0__Impl2811 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Behavior__Group_2__1__Impl_in_rule__Behavior__Group_2__12842 = new BitSet(new long[]{0x0000000000004000L});
        public static final BitSet FOLLOW_rule__Behavior__Group_2__2_in_rule__Behavior__Group_2__12845 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Behavior__RequiringBlocksAssignment_2_1_in_rule__Behavior__Group_2__1__Impl2872 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Behavior__Group_2__2__Impl_in_rule__Behavior__Group_2__22902 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Behavior__Group_2_2__0_in_rule__Behavior__Group_2__2__Impl2929 = new BitSet(new long[]{0x0000000000004002L});
        public static final BitSet FOLLOW_rule__Behavior__Group_2_2__0__Impl_in_rule__Behavior__Group_2_2__02966 = new BitSet(new long[]{0x00000000008000F0L});
        public static final BitSet FOLLOW_rule__Behavior__Group_2_2__1_in_rule__Behavior__Group_2_2__02969 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_14_in_rule__Behavior__Group_2_2__0__Impl2997 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Behavior__Group_2_2__1__Impl_in_rule__Behavior__Group_2_2__13028 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Behavior__RequiringBlocksAssignment_2_2_1_in_rule__Behavior__Group_2_2__1__Impl3055 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Behavior__Group_3__0__Impl_in_rule__Behavior__Group_3__03089 = new BitSet(new long[]{0x00000000008000F0L});
        public static final BitSet FOLLOW_rule__Behavior__Group_3__1_in_rule__Behavior__Group_3__03092 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_17_in_rule__Behavior__Group_3__0__Impl3120 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Behavior__Group_3__1__Impl_in_rule__Behavior__Group_3__13151 = new BitSet(new long[]{0x0000000000004000L});
        public static final BitSet FOLLOW_rule__Behavior__Group_3__2_in_rule__Behavior__Group_3__13154 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Behavior__EnsuringBlocksAssignment_3_1_in_rule__Behavior__Group_3__1__Impl3181 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Behavior__Group_3__2__Impl_in_rule__Behavior__Group_3__23211 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Behavior__Group_3_2__0_in_rule__Behavior__Group_3__2__Impl3238 = new BitSet(new long[]{0x0000000000004002L});
        public static final BitSet FOLLOW_rule__Behavior__Group_3_2__0__Impl_in_rule__Behavior__Group_3_2__03275 = new BitSet(new long[]{0x00000000008000F0L});
        public static final BitSet FOLLOW_rule__Behavior__Group_3_2__1_in_rule__Behavior__Group_3_2__03278 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_14_in_rule__Behavior__Group_3_2__0__Impl3306 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Behavior__Group_3_2__1__Impl_in_rule__Behavior__Group_3_2__13337 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Behavior__EnsuringBlocksAssignment_3_2_1_in_rule__Behavior__Group_3_2__1__Impl3364 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Sentence__Group__0__Impl_in_rule__Sentence__Group__03398 = new BitSet(new long[]{0x00000000008000F0L});
        public static final BitSet FOLLOW_rule__Sentence__Group__1_in_rule__Sentence__Group__03401 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Sentence__WordsAssignment_0_in_rule__Sentence__Group__0__Impl3428 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Sentence__Group__1__Impl_in_rule__Sentence__Group__13458 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Sentence__WordsAssignment_1_in_rule__Sentence__Group__1__Impl3485 = new BitSet(new long[]{0x00000000008000F2L});
        public static final BitSet FOLLOW_rule__ScenarioSpecific__Group__0__Impl_in_rule__ScenarioSpecific__Group__03520 = new BitSet(new long[]{0x00000000000000F0L});
        public static final BitSet FOLLOW_rule__ScenarioSpecific__Group__1_in_rule__ScenarioSpecific__Group__03523 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_18_in_rule__ScenarioSpecific__Group__0__Impl3551 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ScenarioSpecific__Group__1__Impl_in_rule__ScenarioSpecific__Group__13582 = new BitSet(new long[]{0x0000000000002000L});
        public static final BitSet FOLLOW_rule__ScenarioSpecific__Group__2_in_rule__ScenarioSpecific__Group__13585 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ScenarioSpecific__DescriptionAssignment_1_in_rule__ScenarioSpecific__Group__1__Impl3612 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ScenarioSpecific__Group__2__Impl_in_rule__ScenarioSpecific__Group__23642 = new BitSet(new long[]{0x00000000008000F0L});
        public static final BitSet FOLLOW_rule__ScenarioSpecific__Group__3_in_rule__ScenarioSpecific__Group__23645 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_13_in_rule__ScenarioSpecific__Group__2__Impl3673 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ScenarioSpecific__Group__3__Impl_in_rule__ScenarioSpecific__Group__33704 = new BitSet(new long[]{0x0000000000184000L});
        public static final BitSet FOLLOW_rule__ScenarioSpecific__Group__4_in_rule__ScenarioSpecific__Group__33707 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ScenarioSpecific__GivenBlocksAssignment_3_in_rule__ScenarioSpecific__Group__3__Impl3734 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ScenarioSpecific__Group__4__Impl_in_rule__ScenarioSpecific__Group__43764 = new BitSet(new long[]{0x0000000000184000L});
        public static final BitSet FOLLOW_rule__ScenarioSpecific__Group__5_in_rule__ScenarioSpecific__Group__43767 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ScenarioSpecific__Group_4__0_in_rule__ScenarioSpecific__Group__4__Impl3794 = new BitSet(new long[]{0x0000000000004002L});
        public static final BitSet FOLLOW_rule__ScenarioSpecific__Group__5__Impl_in_rule__ScenarioSpecific__Group__53825 = new BitSet(new long[]{0x0000000000184000L});
        public static final BitSet FOLLOW_rule__ScenarioSpecific__Group__6_in_rule__ScenarioSpecific__Group__53828 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ScenarioSpecific__Group_5__0_in_rule__ScenarioSpecific__Group__5__Impl3855 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ScenarioSpecific__Group__6__Impl_in_rule__ScenarioSpecific__Group__63886 = new BitSet(new long[]{0x00000000008000F0L});
        public static final BitSet FOLLOW_rule__ScenarioSpecific__Group__7_in_rule__ScenarioSpecific__Group__63889 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_19_in_rule__ScenarioSpecific__Group__6__Impl3917 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ScenarioSpecific__Group__7__Impl_in_rule__ScenarioSpecific__Group__73948 = new BitSet(new long[]{0x0000000000004000L});
        public static final BitSet FOLLOW_rule__ScenarioSpecific__Group__8_in_rule__ScenarioSpecific__Group__73951 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ScenarioSpecific__ThenBlocksAssignment_7_in_rule__ScenarioSpecific__Group__7__Impl3978 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ScenarioSpecific__Group__8__Impl_in_rule__ScenarioSpecific__Group__84008 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ScenarioSpecific__Group_8__0_in_rule__ScenarioSpecific__Group__8__Impl4035 = new BitSet(new long[]{0x0000000000004002L});
        public static final BitSet FOLLOW_rule__ScenarioSpecific__Group_4__0__Impl_in_rule__ScenarioSpecific__Group_4__04084 = new BitSet(new long[]{0x00000000008000F0L});
        public static final BitSet FOLLOW_rule__ScenarioSpecific__Group_4__1_in_rule__ScenarioSpecific__Group_4__04087 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_14_in_rule__ScenarioSpecific__Group_4__0__Impl4115 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ScenarioSpecific__Group_4__1__Impl_in_rule__ScenarioSpecific__Group_4__14146 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ScenarioSpecific__GivenBlocksAssignment_4_1_in_rule__ScenarioSpecific__Group_4__1__Impl4173 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ScenarioSpecific__Group_5__0__Impl_in_rule__ScenarioSpecific__Group_5__04207 = new BitSet(new long[]{0x00000000008000F0L});
        public static final BitSet FOLLOW_rule__ScenarioSpecific__Group_5__1_in_rule__ScenarioSpecific__Group_5__04210 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_20_in_rule__ScenarioSpecific__Group_5__0__Impl4238 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ScenarioSpecific__Group_5__1__Impl_in_rule__ScenarioSpecific__Group_5__14269 = new BitSet(new long[]{0x0000000000004000L});
        public static final BitSet FOLLOW_rule__ScenarioSpecific__Group_5__2_in_rule__ScenarioSpecific__Group_5__14272 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ScenarioSpecific__WhenBlocksAssignment_5_1_in_rule__ScenarioSpecific__Group_5__1__Impl4299 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ScenarioSpecific__Group_5__2__Impl_in_rule__ScenarioSpecific__Group_5__24329 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ScenarioSpecific__Group_5_2__0_in_rule__ScenarioSpecific__Group_5__2__Impl4356 = new BitSet(new long[]{0x0000000000004002L});
        public static final BitSet FOLLOW_rule__ScenarioSpecific__Group_5_2__0__Impl_in_rule__ScenarioSpecific__Group_5_2__04393 = new BitSet(new long[]{0x00000000008000F0L});
        public static final BitSet FOLLOW_rule__ScenarioSpecific__Group_5_2__1_in_rule__ScenarioSpecific__Group_5_2__04396 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_14_in_rule__ScenarioSpecific__Group_5_2__0__Impl4424 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ScenarioSpecific__Group_5_2__1__Impl_in_rule__ScenarioSpecific__Group_5_2__14455 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ScenarioSpecific__WhenBlocksAssignment_5_2_1_in_rule__ScenarioSpecific__Group_5_2__1__Impl4482 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ScenarioSpecific__Group_8__0__Impl_in_rule__ScenarioSpecific__Group_8__04516 = new BitSet(new long[]{0x00000000008000F0L});
        public static final BitSet FOLLOW_rule__ScenarioSpecific__Group_8__1_in_rule__ScenarioSpecific__Group_8__04519 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_14_in_rule__ScenarioSpecific__Group_8__0__Impl4547 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ScenarioSpecific__Group_8__1__Impl_in_rule__ScenarioSpecific__Group_8__14578 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ScenarioSpecific__ThenBlocksAssignment_8_1_in_rule__ScenarioSpecific__Group_8__1__Impl4605 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ScenarioOutline__Group__0__Impl_in_rule__ScenarioOutline__Group__04639 = new BitSet(new long[]{0x00000000000000F0L});
        public static final BitSet FOLLOW_rule__ScenarioOutline__Group__1_in_rule__ScenarioOutline__Group__04642 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_21_in_rule__ScenarioOutline__Group__0__Impl4670 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ScenarioOutline__Group__1__Impl_in_rule__ScenarioOutline__Group__14701 = new BitSet(new long[]{0x0000000000002000L});
        public static final BitSet FOLLOW_rule__ScenarioOutline__Group__2_in_rule__ScenarioOutline__Group__14704 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ScenarioOutline__DescriptionAssignment_1_in_rule__ScenarioOutline__Group__1__Impl4731 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ScenarioOutline__Group__2__Impl_in_rule__ScenarioOutline__Group__24761 = new BitSet(new long[]{0x00000000008000F0L});
        public static final BitSet FOLLOW_rule__ScenarioOutline__Group__3_in_rule__ScenarioOutline__Group__24764 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_13_in_rule__ScenarioOutline__Group__2__Impl4792 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ScenarioOutline__Group__3__Impl_in_rule__ScenarioOutline__Group__34823 = new BitSet(new long[]{0x0000000000184000L});
        public static final BitSet FOLLOW_rule__ScenarioOutline__Group__4_in_rule__ScenarioOutline__Group__34826 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ScenarioOutline__GivenBlocksAssignment_3_in_rule__ScenarioOutline__Group__3__Impl4853 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ScenarioOutline__Group__4__Impl_in_rule__ScenarioOutline__Group__44883 = new BitSet(new long[]{0x0000000000184000L});
        public static final BitSet FOLLOW_rule__ScenarioOutline__Group__5_in_rule__ScenarioOutline__Group__44886 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ScenarioOutline__Group_4__0_in_rule__ScenarioOutline__Group__4__Impl4913 = new BitSet(new long[]{0x0000000000004002L});
        public static final BitSet FOLLOW_rule__ScenarioOutline__Group__5__Impl_in_rule__ScenarioOutline__Group__54944 = new BitSet(new long[]{0x0000000000184000L});
        public static final BitSet FOLLOW_rule__ScenarioOutline__Group__6_in_rule__ScenarioOutline__Group__54947 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ScenarioOutline__Group_5__0_in_rule__ScenarioOutline__Group__5__Impl4974 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ScenarioOutline__Group__6__Impl_in_rule__ScenarioOutline__Group__65005 = new BitSet(new long[]{0x00000000008000F0L});
        public static final BitSet FOLLOW_rule__ScenarioOutline__Group__7_in_rule__ScenarioOutline__Group__65008 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_19_in_rule__ScenarioOutline__Group__6__Impl5036 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ScenarioOutline__Group__7__Impl_in_rule__ScenarioOutline__Group__75067 = new BitSet(new long[]{0x0000000000404000L});
        public static final BitSet FOLLOW_rule__ScenarioOutline__Group__8_in_rule__ScenarioOutline__Group__75070 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ScenarioOutline__ThenBlocksAssignment_7_in_rule__ScenarioOutline__Group__7__Impl5097 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ScenarioOutline__Group__8__Impl_in_rule__ScenarioOutline__Group__85127 = new BitSet(new long[]{0x0000000000404000L});
        public static final BitSet FOLLOW_rule__ScenarioOutline__Group__9_in_rule__ScenarioOutline__Group__85130 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ScenarioOutline__Group_8__0_in_rule__ScenarioOutline__Group__8__Impl5157 = new BitSet(new long[]{0x0000000000004002L});
        public static final BitSet FOLLOW_rule__ScenarioOutline__Group__9__Impl_in_rule__ScenarioOutline__Group__95188 = new BitSet(new long[]{0x0000000002000000L});
        public static final BitSet FOLLOW_rule__ScenarioOutline__Group__10_in_rule__ScenarioOutline__Group__95191 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_22_in_rule__ScenarioOutline__Group__9__Impl5219 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ScenarioOutline__Group__10__Impl_in_rule__ScenarioOutline__Group__105250 = new BitSet(new long[]{0x0000000002000000L});
        public static final BitSet FOLLOW_rule__ScenarioOutline__Group__11_in_rule__ScenarioOutline__Group__105253 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ScenarioOutline__ExamplesAssignment_10_in_rule__ScenarioOutline__Group__10__Impl5280 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ScenarioOutline__Group__11__Impl_in_rule__ScenarioOutline__Group__115310 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ScenarioOutline__ExamplesAssignment_11_in_rule__ScenarioOutline__Group__11__Impl5337 = new BitSet(new long[]{0x0000000002000002L});
        public static final BitSet FOLLOW_rule__ScenarioOutline__Group_4__0__Impl_in_rule__ScenarioOutline__Group_4__05392 = new BitSet(new long[]{0x00000000008000F0L});
        public static final BitSet FOLLOW_rule__ScenarioOutline__Group_4__1_in_rule__ScenarioOutline__Group_4__05395 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_14_in_rule__ScenarioOutline__Group_4__0__Impl5423 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ScenarioOutline__Group_4__1__Impl_in_rule__ScenarioOutline__Group_4__15454 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ScenarioOutline__GivenBlocksAssignment_4_1_in_rule__ScenarioOutline__Group_4__1__Impl5481 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ScenarioOutline__Group_5__0__Impl_in_rule__ScenarioOutline__Group_5__05515 = new BitSet(new long[]{0x00000000008000F0L});
        public static final BitSet FOLLOW_rule__ScenarioOutline__Group_5__1_in_rule__ScenarioOutline__Group_5__05518 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_20_in_rule__ScenarioOutline__Group_5__0__Impl5546 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ScenarioOutline__Group_5__1__Impl_in_rule__ScenarioOutline__Group_5__15577 = new BitSet(new long[]{0x0000000000004000L});
        public static final BitSet FOLLOW_rule__ScenarioOutline__Group_5__2_in_rule__ScenarioOutline__Group_5__15580 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ScenarioOutline__WhenBlocksAssignment_5_1_in_rule__ScenarioOutline__Group_5__1__Impl5607 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ScenarioOutline__Group_5__2__Impl_in_rule__ScenarioOutline__Group_5__25637 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ScenarioOutline__Group_5_2__0_in_rule__ScenarioOutline__Group_5__2__Impl5664 = new BitSet(new long[]{0x0000000000004002L});
        public static final BitSet FOLLOW_rule__ScenarioOutline__Group_5_2__0__Impl_in_rule__ScenarioOutline__Group_5_2__05701 = new BitSet(new long[]{0x00000000008000F0L});
        public static final BitSet FOLLOW_rule__ScenarioOutline__Group_5_2__1_in_rule__ScenarioOutline__Group_5_2__05704 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_14_in_rule__ScenarioOutline__Group_5_2__0__Impl5732 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ScenarioOutline__Group_5_2__1__Impl_in_rule__ScenarioOutline__Group_5_2__15763 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ScenarioOutline__WhenBlocksAssignment_5_2_1_in_rule__ScenarioOutline__Group_5_2__1__Impl5790 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ScenarioOutline__Group_8__0__Impl_in_rule__ScenarioOutline__Group_8__05824 = new BitSet(new long[]{0x00000000008000F0L});
        public static final BitSet FOLLOW_rule__ScenarioOutline__Group_8__1_in_rule__ScenarioOutline__Group_8__05827 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_14_in_rule__ScenarioOutline__Group_8__0__Impl5855 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ScenarioOutline__Group_8__1__Impl_in_rule__ScenarioOutline__Group_8__15886 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ScenarioOutline__ThenBlocksAssignment_8_1_in_rule__ScenarioOutline__Group_8__1__Impl5913 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Reference__Group__0__Impl_in_rule__Reference__Group__05947 = new BitSet(new long[]{0x0000000000800000L});
        public static final BitSet FOLLOW_rule__Reference__Group__1_in_rule__Reference__Group__05950 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Reference__Group__1__Impl_in_rule__Reference__Group__16008 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_rule__Reference__Group__2_in_rule__Reference__Group__16011 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_23_in_rule__Reference__Group__1__Impl6039 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Reference__Group__2__Impl_in_rule__Reference__Group__26070 = new BitSet(new long[]{0x0000000001000000L});
        public static final BitSet FOLLOW_rule__Reference__Group__3_in_rule__Reference__Group__26073 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Reference__ValueAssignment_2_in_rule__Reference__Group__2__Impl6100 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Reference__Group__3__Impl_in_rule__Reference__Group__36130 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_24_in_rule__Reference__Group__3__Impl6158 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Example__Group__0__Impl_in_rule__Example__Group__06197 = new BitSet(new long[]{0x0000000000000070L});
        public static final BitSet FOLLOW_rule__Example__Group__1_in_rule__Example__Group__06200 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_25_in_rule__Example__Group__0__Impl6228 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Example__Group__1__Impl_in_rule__Example__Group__16259 = new BitSet(new long[]{0x0000000002000000L});
        public static final BitSet FOLLOW_rule__Example__Group__2_in_rule__Example__Group__16262 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Example__KeysAssignment_1_in_rule__Example__Group__1__Impl6289 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Example__Group__2__Impl_in_rule__Example__Group__26319 = new BitSet(new long[]{0x0000000002000000L});
        public static final BitSet FOLLOW_rule__Example__Group__3_in_rule__Example__Group__26322 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Example__Group_2__0_in_rule__Example__Group__2__Impl6349 = new BitSet(new long[]{0x0000000002000002L});
        public static final BitSet FOLLOW_rule__Example__Group__3__Impl_in_rule__Example__Group__36380 = new BitSet(new long[]{0x0000000002000000L});
        public static final BitSet FOLLOW_rule__Example__Group__4_in_rule__Example__Group__36383 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_25_in_rule__Example__Group__3__Impl6411 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Example__Group__4__Impl_in_rule__Example__Group__46442 = new BitSet(new long[]{0x0000000004000000L});
        public static final BitSet FOLLOW_rule__Example__Group__5_in_rule__Example__Group__46445 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Example__ValuesAssignment_4_in_rule__Example__Group__4__Impl6472 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Example__Group__5__Impl_in_rule__Example__Group__56502 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Example__Group_5__0_in_rule__Example__Group__5__Impl6529 = new BitSet(new long[]{0x0000000004000002L});
        public static final BitSet FOLLOW_rule__Example__Group_2__0__Impl_in_rule__Example__Group_2__06572 = new BitSet(new long[]{0x0000000000000070L});
        public static final BitSet FOLLOW_rule__Example__Group_2__1_in_rule__Example__Group_2__06575 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_25_in_rule__Example__Group_2__0__Impl6603 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Example__Group_2__1__Impl_in_rule__Example__Group_2__16634 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Example__KeysAssignment_2_1_in_rule__Example__Group_2__1__Impl6661 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Example__Group_5__0__Impl_in_rule__Example__Group_5__06695 = new BitSet(new long[]{0x0000000002000000L});
        public static final BitSet FOLLOW_rule__Example__Group_5__1_in_rule__Example__Group_5__06698 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_26_in_rule__Example__Group_5__0__Impl6726 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Example__Group_5__1__Impl_in_rule__Example__Group_5__16757 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Example__ValuesAssignment_5_1_in_rule__Example__Group_5__1__Impl6784 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Value__Group__0__Impl_in_rule__Value__Group__06818 = new BitSet(new long[]{0x0000000000000070L});
        public static final BitSet FOLLOW_rule__Value__Group__1_in_rule__Value__Group__06821 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_25_in_rule__Value__Group__0__Impl6849 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Value__Group__1__Impl_in_rule__Value__Group__16880 = new BitSet(new long[]{0x0000000002000000L});
        public static final BitSet FOLLOW_rule__Value__Group__2_in_rule__Value__Group__16883 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Value__ElementsAssignment_1_in_rule__Value__Group__1__Impl6910 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Value__Group__2__Impl_in_rule__Value__Group__26940 = new BitSet(new long[]{0x0000000002000000L});
        public static final BitSet FOLLOW_rule__Value__Group__3_in_rule__Value__Group__26943 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Value__Group_2__0_in_rule__Value__Group__2__Impl6970 = new BitSet(new long[]{0x0000000002000002L});
        public static final BitSet FOLLOW_rule__Value__Group__3__Impl_in_rule__Value__Group__37001 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_25_in_rule__Value__Group__3__Impl7029 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Value__Group_2__0__Impl_in_rule__Value__Group_2__07068 = new BitSet(new long[]{0x0000000000000070L});
        public static final BitSet FOLLOW_rule__Value__Group_2__1_in_rule__Value__Group_2__07071 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_25_in_rule__Value__Group_2__0__Impl7099 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Value__Group_2__1__Impl_in_rule__Value__Group_2__17130 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Value__ElementsAssignment_2_1_in_rule__Value__Group_2__1__Impl7157 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleFeature_in_rule__Model__FeaturesAssignment_1_07196 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleFeature_in_rule__Model__FeaturesAssignment_1_17227 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__Feature__DescriptionAssignment_17258 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleMAny_in_rule__Feature__SummaryAssignment_27289 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleBackground_in_rule__Feature__BackgroundAssignment_37320 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleScenario_in_rule__Feature__ScenariosAssignment_4_07351 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleScenario_in_rule__Feature__ScenariosAssignment_4_17382 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleBehavior_in_rule__Feature__BehaviorsAssignment_5_07413 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleBehavior_in_rule__Feature__BehaviorsAssignment_5_17444 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleSentence_in_rule__Background__GivenBlocksAssignment_27475 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleSentence_in_rule__Background__GivenBlocksAssignment_3_17506 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleMAny_in_rule__Behavior__DescriptionAssignment_17537 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleSentence_in_rule__Behavior__RequiringBlocksAssignment_2_17568 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleSentence_in_rule__Behavior__RequiringBlocksAssignment_2_2_17599 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleSentence_in_rule__Behavior__EnsuringBlocksAssignment_3_17630 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleSentence_in_rule__Behavior__EnsuringBlocksAssignment_3_2_17661 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleContent_in_rule__Sentence__WordsAssignment_07692 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleContent_in_rule__Sentence__WordsAssignment_17723 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleMAny_in_rule__ScenarioSpecific__DescriptionAssignment_17754 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleSentence_in_rule__ScenarioSpecific__GivenBlocksAssignment_37785 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleSentence_in_rule__ScenarioSpecific__GivenBlocksAssignment_4_17816 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleSentence_in_rule__ScenarioSpecific__WhenBlocksAssignment_5_17847 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleSentence_in_rule__ScenarioSpecific__WhenBlocksAssignment_5_2_17878 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleSentence_in_rule__ScenarioSpecific__ThenBlocksAssignment_77909 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleSentence_in_rule__ScenarioSpecific__ThenBlocksAssignment_8_17940 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleMAny_in_rule__ScenarioOutline__DescriptionAssignment_17971 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleSentence_in_rule__ScenarioOutline__GivenBlocksAssignment_38002 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleSentence_in_rule__ScenarioOutline__GivenBlocksAssignment_4_18033 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleSentence_in_rule__ScenarioOutline__WhenBlocksAssignment_5_18064 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleSentence_in_rule__ScenarioOutline__WhenBlocksAssignment_5_2_18095 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleSentence_in_rule__ScenarioOutline__ThenBlocksAssignment_78126 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleSentence_in_rule__ScenarioOutline__ThenBlocksAssignment_8_18157 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleExample_in_rule__ScenarioOutline__ExamplesAssignment_108188 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleExample_in_rule__ScenarioOutline__ExamplesAssignment_118219 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_rule__Reference__ValueAssignment_28250 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAny_in_rule__Word__ValueAssignment8281 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__Example__KeysAssignment_18312 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__Example__KeysAssignment_2_18343 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleValue_in_rule__Example__ValuesAssignment_48374 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleValue_in_rule__Example__ValuesAssignment_5_18405 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__Value__ElementsAssignment_18436 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__Value__ElementsAssignment_2_18467 = new BitSet(new long[]{0x0000000000000002L});
    }


}