package dk.itu.bddctransform.ui.contentassist.antlr.internal; 

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
import dk.itu.bddctransform.services.LettuceGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalLettuceParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'transform'", "'package'", "'behavior'", "'class'", "'signature'", "'end'", "'rule'", "'$'", "'('", "'|'", "')'", "'['", "']'", "'expr'", "'if'", "'def?'", "'then'", "'else'", "','", "'match'", "'fail'", "'message'", "'='"
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
    public String getGrammarFileName() { return "../dk.itu.bddtransform.ui/src-gen/dk/itu/bddctransform/ui/contentassist/antlr/internal/InternalLettuce.g"; }


     
     	private LettuceGrammarAccess grammarAccess;
     	
        public void setGrammarAccess(LettuceGrammarAccess grammarAccess) {
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




    // $ANTLR start "entryRuleTransformModel_"
    // ../dk.itu.bddtransform.ui/src-gen/dk/itu/bddctransform/ui/contentassist/antlr/internal/InternalLettuce.g:60:1: entryRuleTransformModel_ : ruleTransformModel_ EOF ;
    public final void entryRuleTransformModel_() throws RecognitionException {
        try {
            // ../dk.itu.bddtransform.ui/src-gen/dk/itu/bddctransform/ui/contentassist/antlr/internal/InternalLettuce.g:61:1: ( ruleTransformModel_ EOF )
            // ../dk.itu.bddtransform.ui/src-gen/dk/itu/bddctransform/ui/contentassist/antlr/internal/InternalLettuce.g:62:1: ruleTransformModel_ EOF
            {
             before(grammarAccess.getTransformModel_Rule()); 
            pushFollow(FollowSets000.FOLLOW_ruleTransformModel__in_entryRuleTransformModel_61);
            ruleTransformModel_();

            state._fsp--;

             after(grammarAccess.getTransformModel_Rule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleTransformModel_68); 

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
    // $ANTLR end "entryRuleTransformModel_"


    // $ANTLR start "ruleTransformModel_"
    // ../dk.itu.bddtransform.ui/src-gen/dk/itu/bddctransform/ui/contentassist/antlr/internal/InternalLettuce.g:69:1: ruleTransformModel_ : ( ( rule__TransformModel___Group__0 ) ) ;
    public final void ruleTransformModel_() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.bddtransform.ui/src-gen/dk/itu/bddctransform/ui/contentassist/antlr/internal/InternalLettuce.g:73:2: ( ( ( rule__TransformModel___Group__0 ) ) )
            // ../dk.itu.bddtransform.ui/src-gen/dk/itu/bddctransform/ui/contentassist/antlr/internal/InternalLettuce.g:74:1: ( ( rule__TransformModel___Group__0 ) )
            {
            // ../dk.itu.bddtransform.ui/src-gen/dk/itu/bddctransform/ui/contentassist/antlr/internal/InternalLettuce.g:74:1: ( ( rule__TransformModel___Group__0 ) )
            // ../dk.itu.bddtransform.ui/src-gen/dk/itu/bddctransform/ui/contentassist/antlr/internal/InternalLettuce.g:75:1: ( rule__TransformModel___Group__0 )
            {
             before(grammarAccess.getTransformModel_Access().getGroup()); 
            // ../dk.itu.bddtransform.ui/src-gen/dk/itu/bddctransform/ui/contentassist/antlr/internal/InternalLettuce.g:76:1: ( rule__TransformModel___Group__0 )
            // ../dk.itu.bddtransform.ui/src-gen/dk/itu/bddctransform/ui/contentassist/antlr/internal/InternalLettuce.g:76:2: rule__TransformModel___Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__TransformModel___Group__0_in_ruleTransformModel_94);
            rule__TransformModel___Group__0();

            state._fsp--;


            }

             after(grammarAccess.getTransformModel_Access().getGroup()); 

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
    // $ANTLR end "ruleTransformModel_"


    // $ANTLR start "entryRulePattern"
    // ../dk.itu.bddtransform.ui/src-gen/dk/itu/bddctransform/ui/contentassist/antlr/internal/InternalLettuce.g:88:1: entryRulePattern : rulePattern EOF ;
    public final void entryRulePattern() throws RecognitionException {
        try {
            // ../dk.itu.bddtransform.ui/src-gen/dk/itu/bddctransform/ui/contentassist/antlr/internal/InternalLettuce.g:89:1: ( rulePattern EOF )
            // ../dk.itu.bddtransform.ui/src-gen/dk/itu/bddctransform/ui/contentassist/antlr/internal/InternalLettuce.g:90:1: rulePattern EOF
            {
             before(grammarAccess.getPatternRule()); 
            pushFollow(FollowSets000.FOLLOW_rulePattern_in_entryRulePattern121);
            rulePattern();

            state._fsp--;

             after(grammarAccess.getPatternRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRulePattern128); 

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
    // $ANTLR end "entryRulePattern"


    // $ANTLR start "rulePattern"
    // ../dk.itu.bddtransform.ui/src-gen/dk/itu/bddctransform/ui/contentassist/antlr/internal/InternalLettuce.g:97:1: rulePattern : ( ( rule__Pattern__Alternatives ) ) ;
    public final void rulePattern() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.bddtransform.ui/src-gen/dk/itu/bddctransform/ui/contentassist/antlr/internal/InternalLettuce.g:101:2: ( ( ( rule__Pattern__Alternatives ) ) )
            // ../dk.itu.bddtransform.ui/src-gen/dk/itu/bddctransform/ui/contentassist/antlr/internal/InternalLettuce.g:102:1: ( ( rule__Pattern__Alternatives ) )
            {
            // ../dk.itu.bddtransform.ui/src-gen/dk/itu/bddctransform/ui/contentassist/antlr/internal/InternalLettuce.g:102:1: ( ( rule__Pattern__Alternatives ) )
            // ../dk.itu.bddtransform.ui/src-gen/dk/itu/bddctransform/ui/contentassist/antlr/internal/InternalLettuce.g:103:1: ( rule__Pattern__Alternatives )
            {
             before(grammarAccess.getPatternAccess().getAlternatives()); 
            // ../dk.itu.bddtransform.ui/src-gen/dk/itu/bddctransform/ui/contentassist/antlr/internal/InternalLettuce.g:104:1: ( rule__Pattern__Alternatives )
            // ../dk.itu.bddtransform.ui/src-gen/dk/itu/bddctransform/ui/contentassist/antlr/internal/InternalLettuce.g:104:2: rule__Pattern__Alternatives
            {
            pushFollow(FollowSets000.FOLLOW_rule__Pattern__Alternatives_in_rulePattern154);
            rule__Pattern__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getPatternAccess().getAlternatives()); 

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
    // $ANTLR end "rulePattern"


    // $ANTLR start "entryRuleTransformation"
    // ../dk.itu.bddtransform.ui/src-gen/dk/itu/bddctransform/ui/contentassist/antlr/internal/InternalLettuce.g:116:1: entryRuleTransformation : ruleTransformation EOF ;
    public final void entryRuleTransformation() throws RecognitionException {
        try {
            // ../dk.itu.bddtransform.ui/src-gen/dk/itu/bddctransform/ui/contentassist/antlr/internal/InternalLettuce.g:117:1: ( ruleTransformation EOF )
            // ../dk.itu.bddtransform.ui/src-gen/dk/itu/bddctransform/ui/contentassist/antlr/internal/InternalLettuce.g:118:1: ruleTransformation EOF
            {
             before(grammarAccess.getTransformationRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleTransformation_in_entryRuleTransformation181);
            ruleTransformation();

            state._fsp--;

             after(grammarAccess.getTransformationRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleTransformation188); 

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
    // $ANTLR end "entryRuleTransformation"


    // $ANTLR start "ruleTransformation"
    // ../dk.itu.bddtransform.ui/src-gen/dk/itu/bddctransform/ui/contentassist/antlr/internal/InternalLettuce.g:125:1: ruleTransformation : ( ( rule__Transformation__Alternatives ) ) ;
    public final void ruleTransformation() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.bddtransform.ui/src-gen/dk/itu/bddctransform/ui/contentassist/antlr/internal/InternalLettuce.g:129:2: ( ( ( rule__Transformation__Alternatives ) ) )
            // ../dk.itu.bddtransform.ui/src-gen/dk/itu/bddctransform/ui/contentassist/antlr/internal/InternalLettuce.g:130:1: ( ( rule__Transformation__Alternatives ) )
            {
            // ../dk.itu.bddtransform.ui/src-gen/dk/itu/bddctransform/ui/contentassist/antlr/internal/InternalLettuce.g:130:1: ( ( rule__Transformation__Alternatives ) )
            // ../dk.itu.bddtransform.ui/src-gen/dk/itu/bddctransform/ui/contentassist/antlr/internal/InternalLettuce.g:131:1: ( rule__Transformation__Alternatives )
            {
             before(grammarAccess.getTransformationAccess().getAlternatives()); 
            // ../dk.itu.bddtransform.ui/src-gen/dk/itu/bddctransform/ui/contentassist/antlr/internal/InternalLettuce.g:132:1: ( rule__Transformation__Alternatives )
            // ../dk.itu.bddtransform.ui/src-gen/dk/itu/bddctransform/ui/contentassist/antlr/internal/InternalLettuce.g:132:2: rule__Transformation__Alternatives
            {
            pushFollow(FollowSets000.FOLLOW_rule__Transformation__Alternatives_in_ruleTransformation214);
            rule__Transformation__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getTransformationAccess().getAlternatives()); 

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
    // $ANTLR end "ruleTransformation"


    // $ANTLR start "entryRuleBehavior"
    // ../dk.itu.bddtransform.ui/src-gen/dk/itu/bddctransform/ui/contentassist/antlr/internal/InternalLettuce.g:144:1: entryRuleBehavior : ruleBehavior EOF ;
    public final void entryRuleBehavior() throws RecognitionException {
        try {
            // ../dk.itu.bddtransform.ui/src-gen/dk/itu/bddctransform/ui/contentassist/antlr/internal/InternalLettuce.g:145:1: ( ruleBehavior EOF )
            // ../dk.itu.bddtransform.ui/src-gen/dk/itu/bddctransform/ui/contentassist/antlr/internal/InternalLettuce.g:146:1: ruleBehavior EOF
            {
             before(grammarAccess.getBehaviorRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleBehavior_in_entryRuleBehavior241);
            ruleBehavior();

            state._fsp--;

             after(grammarAccess.getBehaviorRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleBehavior248); 

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
    // ../dk.itu.bddtransform.ui/src-gen/dk/itu/bddctransform/ui/contentassist/antlr/internal/InternalLettuce.g:153:1: ruleBehavior : ( ( rule__Behavior__Group__0 ) ) ;
    public final void ruleBehavior() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.bddtransform.ui/src-gen/dk/itu/bddctransform/ui/contentassist/antlr/internal/InternalLettuce.g:157:2: ( ( ( rule__Behavior__Group__0 ) ) )
            // ../dk.itu.bddtransform.ui/src-gen/dk/itu/bddctransform/ui/contentassist/antlr/internal/InternalLettuce.g:158:1: ( ( rule__Behavior__Group__0 ) )
            {
            // ../dk.itu.bddtransform.ui/src-gen/dk/itu/bddctransform/ui/contentassist/antlr/internal/InternalLettuce.g:158:1: ( ( rule__Behavior__Group__0 ) )
            // ../dk.itu.bddtransform.ui/src-gen/dk/itu/bddctransform/ui/contentassist/antlr/internal/InternalLettuce.g:159:1: ( rule__Behavior__Group__0 )
            {
             before(grammarAccess.getBehaviorAccess().getGroup()); 
            // ../dk.itu.bddtransform.ui/src-gen/dk/itu/bddctransform/ui/contentassist/antlr/internal/InternalLettuce.g:160:1: ( rule__Behavior__Group__0 )
            // ../dk.itu.bddtransform.ui/src-gen/dk/itu/bddctransform/ui/contentassist/antlr/internal/InternalLettuce.g:160:2: rule__Behavior__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__Behavior__Group__0_in_ruleBehavior274);
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


    // $ANTLR start "entryRuleRule"
    // ../dk.itu.bddtransform.ui/src-gen/dk/itu/bddctransform/ui/contentassist/antlr/internal/InternalLettuce.g:172:1: entryRuleRule : ruleRule EOF ;
    public final void entryRuleRule() throws RecognitionException {
        try {
            // ../dk.itu.bddtransform.ui/src-gen/dk/itu/bddctransform/ui/contentassist/antlr/internal/InternalLettuce.g:173:1: ( ruleRule EOF )
            // ../dk.itu.bddtransform.ui/src-gen/dk/itu/bddctransform/ui/contentassist/antlr/internal/InternalLettuce.g:174:1: ruleRule EOF
            {
             before(grammarAccess.getRuleRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleRule_in_entryRuleRule301);
            ruleRule();

            state._fsp--;

             after(grammarAccess.getRuleRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleRule308); 

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
    // $ANTLR end "entryRuleRule"


    // $ANTLR start "ruleRule"
    // ../dk.itu.bddtransform.ui/src-gen/dk/itu/bddctransform/ui/contentassist/antlr/internal/InternalLettuce.g:181:1: ruleRule : ( ( rule__Rule__Group__0 ) ) ;
    public final void ruleRule() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.bddtransform.ui/src-gen/dk/itu/bddctransform/ui/contentassist/antlr/internal/InternalLettuce.g:185:2: ( ( ( rule__Rule__Group__0 ) ) )
            // ../dk.itu.bddtransform.ui/src-gen/dk/itu/bddctransform/ui/contentassist/antlr/internal/InternalLettuce.g:186:1: ( ( rule__Rule__Group__0 ) )
            {
            // ../dk.itu.bddtransform.ui/src-gen/dk/itu/bddctransform/ui/contentassist/antlr/internal/InternalLettuce.g:186:1: ( ( rule__Rule__Group__0 ) )
            // ../dk.itu.bddtransform.ui/src-gen/dk/itu/bddctransform/ui/contentassist/antlr/internal/InternalLettuce.g:187:1: ( rule__Rule__Group__0 )
            {
             before(grammarAccess.getRuleAccess().getGroup()); 
            // ../dk.itu.bddtransform.ui/src-gen/dk/itu/bddctransform/ui/contentassist/antlr/internal/InternalLettuce.g:188:1: ( rule__Rule__Group__0 )
            // ../dk.itu.bddtransform.ui/src-gen/dk/itu/bddctransform/ui/contentassist/antlr/internal/InternalLettuce.g:188:2: rule__Rule__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__Rule__Group__0_in_ruleRule334);
            rule__Rule__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getRuleAccess().getGroup()); 

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
    // $ANTLR end "ruleRule"


    // $ANTLR start "entryRuleRuleId"
    // ../dk.itu.bddtransform.ui/src-gen/dk/itu/bddctransform/ui/contentassist/antlr/internal/InternalLettuce.g:200:1: entryRuleRuleId : ruleRuleId EOF ;
    public final void entryRuleRuleId() throws RecognitionException {
        try {
            // ../dk.itu.bddtransform.ui/src-gen/dk/itu/bddctransform/ui/contentassist/antlr/internal/InternalLettuce.g:201:1: ( ruleRuleId EOF )
            // ../dk.itu.bddtransform.ui/src-gen/dk/itu/bddctransform/ui/contentassist/antlr/internal/InternalLettuce.g:202:1: ruleRuleId EOF
            {
             before(grammarAccess.getRuleIdRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleRuleId_in_entryRuleRuleId361);
            ruleRuleId();

            state._fsp--;

             after(grammarAccess.getRuleIdRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleRuleId368); 

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
    // $ANTLR end "entryRuleRuleId"


    // $ANTLR start "ruleRuleId"
    // ../dk.itu.bddtransform.ui/src-gen/dk/itu/bddctransform/ui/contentassist/antlr/internal/InternalLettuce.g:209:1: ruleRuleId : ( RULE_ID ) ;
    public final void ruleRuleId() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.bddtransform.ui/src-gen/dk/itu/bddctransform/ui/contentassist/antlr/internal/InternalLettuce.g:213:2: ( ( RULE_ID ) )
            // ../dk.itu.bddtransform.ui/src-gen/dk/itu/bddctransform/ui/contentassist/antlr/internal/InternalLettuce.g:214:1: ( RULE_ID )
            {
            // ../dk.itu.bddtransform.ui/src-gen/dk/itu/bddctransform/ui/contentassist/antlr/internal/InternalLettuce.g:214:1: ( RULE_ID )
            // ../dk.itu.bddtransform.ui/src-gen/dk/itu/bddctransform/ui/contentassist/antlr/internal/InternalLettuce.g:215:1: RULE_ID
            {
             before(grammarAccess.getRuleIdAccess().getIDTerminalRuleCall()); 
            match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleRuleId394); 
             after(grammarAccess.getRuleIdAccess().getIDTerminalRuleCall()); 

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
    // $ANTLR end "ruleRuleId"


    // $ANTLR start "entryRuleVariableId"
    // ../dk.itu.bddtransform.ui/src-gen/dk/itu/bddctransform/ui/contentassist/antlr/internal/InternalLettuce.g:228:1: entryRuleVariableId : ruleVariableId EOF ;
    public final void entryRuleVariableId() throws RecognitionException {
        try {
            // ../dk.itu.bddtransform.ui/src-gen/dk/itu/bddctransform/ui/contentassist/antlr/internal/InternalLettuce.g:229:1: ( ruleVariableId EOF )
            // ../dk.itu.bddtransform.ui/src-gen/dk/itu/bddctransform/ui/contentassist/antlr/internal/InternalLettuce.g:230:1: ruleVariableId EOF
            {
             before(grammarAccess.getVariableIdRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleVariableId_in_entryRuleVariableId420);
            ruleVariableId();

            state._fsp--;

             after(grammarAccess.getVariableIdRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleVariableId427); 

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
    // $ANTLR end "entryRuleVariableId"


    // $ANTLR start "ruleVariableId"
    // ../dk.itu.bddtransform.ui/src-gen/dk/itu/bddctransform/ui/contentassist/antlr/internal/InternalLettuce.g:237:1: ruleVariableId : ( ( rule__VariableId__Group__0 ) ) ;
    public final void ruleVariableId() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.bddtransform.ui/src-gen/dk/itu/bddctransform/ui/contentassist/antlr/internal/InternalLettuce.g:241:2: ( ( ( rule__VariableId__Group__0 ) ) )
            // ../dk.itu.bddtransform.ui/src-gen/dk/itu/bddctransform/ui/contentassist/antlr/internal/InternalLettuce.g:242:1: ( ( rule__VariableId__Group__0 ) )
            {
            // ../dk.itu.bddtransform.ui/src-gen/dk/itu/bddctransform/ui/contentassist/antlr/internal/InternalLettuce.g:242:1: ( ( rule__VariableId__Group__0 ) )
            // ../dk.itu.bddtransform.ui/src-gen/dk/itu/bddctransform/ui/contentassist/antlr/internal/InternalLettuce.g:243:1: ( rule__VariableId__Group__0 )
            {
             before(grammarAccess.getVariableIdAccess().getGroup()); 
            // ../dk.itu.bddtransform.ui/src-gen/dk/itu/bddctransform/ui/contentassist/antlr/internal/InternalLettuce.g:244:1: ( rule__VariableId__Group__0 )
            // ../dk.itu.bddtransform.ui/src-gen/dk/itu/bddctransform/ui/contentassist/antlr/internal/InternalLettuce.g:244:2: rule__VariableId__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__VariableId__Group__0_in_ruleVariableId453);
            rule__VariableId__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getVariableIdAccess().getGroup()); 

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
    // $ANTLR end "ruleVariableId"


    // $ANTLR start "entryRuleEString"
    // ../dk.itu.bddtransform.ui/src-gen/dk/itu/bddctransform/ui/contentassist/antlr/internal/InternalLettuce.g:256:1: entryRuleEString : ruleEString EOF ;
    public final void entryRuleEString() throws RecognitionException {
        try {
            // ../dk.itu.bddtransform.ui/src-gen/dk/itu/bddctransform/ui/contentassist/antlr/internal/InternalLettuce.g:257:1: ( ruleEString EOF )
            // ../dk.itu.bddtransform.ui/src-gen/dk/itu/bddctransform/ui/contentassist/antlr/internal/InternalLettuce.g:258:1: ruleEString EOF
            {
             before(grammarAccess.getEStringRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_entryRuleEString480);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getEStringRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleEString487); 

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
    // ../dk.itu.bddtransform.ui/src-gen/dk/itu/bddctransform/ui/contentassist/antlr/internal/InternalLettuce.g:265:1: ruleEString : ( ( rule__EString__Alternatives ) ) ;
    public final void ruleEString() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.bddtransform.ui/src-gen/dk/itu/bddctransform/ui/contentassist/antlr/internal/InternalLettuce.g:269:2: ( ( ( rule__EString__Alternatives ) ) )
            // ../dk.itu.bddtransform.ui/src-gen/dk/itu/bddctransform/ui/contentassist/antlr/internal/InternalLettuce.g:270:1: ( ( rule__EString__Alternatives ) )
            {
            // ../dk.itu.bddtransform.ui/src-gen/dk/itu/bddctransform/ui/contentassist/antlr/internal/InternalLettuce.g:270:1: ( ( rule__EString__Alternatives ) )
            // ../dk.itu.bddtransform.ui/src-gen/dk/itu/bddctransform/ui/contentassist/antlr/internal/InternalLettuce.g:271:1: ( rule__EString__Alternatives )
            {
             before(grammarAccess.getEStringAccess().getAlternatives()); 
            // ../dk.itu.bddtransform.ui/src-gen/dk/itu/bddctransform/ui/contentassist/antlr/internal/InternalLettuce.g:272:1: ( rule__EString__Alternatives )
            // ../dk.itu.bddtransform.ui/src-gen/dk/itu/bddctransform/ui/contentassist/antlr/internal/InternalLettuce.g:272:2: rule__EString__Alternatives
            {
            pushFollow(FollowSets000.FOLLOW_rule__EString__Alternatives_in_ruleEString513);
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


    // $ANTLR start "entryRuleExactSting"
    // ../dk.itu.bddtransform.ui/src-gen/dk/itu/bddctransform/ui/contentassist/antlr/internal/InternalLettuce.g:284:1: entryRuleExactSting : ruleExactSting EOF ;
    public final void entryRuleExactSting() throws RecognitionException {
        try {
            // ../dk.itu.bddtransform.ui/src-gen/dk/itu/bddctransform/ui/contentassist/antlr/internal/InternalLettuce.g:285:1: ( ruleExactSting EOF )
            // ../dk.itu.bddtransform.ui/src-gen/dk/itu/bddctransform/ui/contentassist/antlr/internal/InternalLettuce.g:286:1: ruleExactSting EOF
            {
             before(grammarAccess.getExactStingRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleExactSting_in_entryRuleExactSting540);
            ruleExactSting();

            state._fsp--;

             after(grammarAccess.getExactStingRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleExactSting547); 

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
    // $ANTLR end "entryRuleExactSting"


    // $ANTLR start "ruleExactSting"
    // ../dk.itu.bddtransform.ui/src-gen/dk/itu/bddctransform/ui/contentassist/antlr/internal/InternalLettuce.g:293:1: ruleExactSting : ( ( rule__ExactSting__ContentAssignment ) ) ;
    public final void ruleExactSting() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.bddtransform.ui/src-gen/dk/itu/bddctransform/ui/contentassist/antlr/internal/InternalLettuce.g:297:2: ( ( ( rule__ExactSting__ContentAssignment ) ) )
            // ../dk.itu.bddtransform.ui/src-gen/dk/itu/bddctransform/ui/contentassist/antlr/internal/InternalLettuce.g:298:1: ( ( rule__ExactSting__ContentAssignment ) )
            {
            // ../dk.itu.bddtransform.ui/src-gen/dk/itu/bddctransform/ui/contentassist/antlr/internal/InternalLettuce.g:298:1: ( ( rule__ExactSting__ContentAssignment ) )
            // ../dk.itu.bddtransform.ui/src-gen/dk/itu/bddctransform/ui/contentassist/antlr/internal/InternalLettuce.g:299:1: ( rule__ExactSting__ContentAssignment )
            {
             before(grammarAccess.getExactStingAccess().getContentAssignment()); 
            // ../dk.itu.bddtransform.ui/src-gen/dk/itu/bddctransform/ui/contentassist/antlr/internal/InternalLettuce.g:300:1: ( rule__ExactSting__ContentAssignment )
            // ../dk.itu.bddtransform.ui/src-gen/dk/itu/bddctransform/ui/contentassist/antlr/internal/InternalLettuce.g:300:2: rule__ExactSting__ContentAssignment
            {
            pushFollow(FollowSets000.FOLLOW_rule__ExactSting__ContentAssignment_in_ruleExactSting573);
            rule__ExactSting__ContentAssignment();

            state._fsp--;


            }

             after(grammarAccess.getExactStingAccess().getContentAssignment()); 

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
    // $ANTLR end "ruleExactSting"


    // $ANTLR start "entryRuleVariable"
    // ../dk.itu.bddtransform.ui/src-gen/dk/itu/bddctransform/ui/contentassist/antlr/internal/InternalLettuce.g:312:1: entryRuleVariable : ruleVariable EOF ;
    public final void entryRuleVariable() throws RecognitionException {
        try {
            // ../dk.itu.bddtransform.ui/src-gen/dk/itu/bddctransform/ui/contentassist/antlr/internal/InternalLettuce.g:313:1: ( ruleVariable EOF )
            // ../dk.itu.bddtransform.ui/src-gen/dk/itu/bddctransform/ui/contentassist/antlr/internal/InternalLettuce.g:314:1: ruleVariable EOF
            {
             before(grammarAccess.getVariableRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleVariable_in_entryRuleVariable600);
            ruleVariable();

            state._fsp--;

             after(grammarAccess.getVariableRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleVariable607); 

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
    // $ANTLR end "entryRuleVariable"


    // $ANTLR start "ruleVariable"
    // ../dk.itu.bddtransform.ui/src-gen/dk/itu/bddctransform/ui/contentassist/antlr/internal/InternalLettuce.g:321:1: ruleVariable : ( ( rule__Variable__Group__0 ) ) ;
    public final void ruleVariable() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.bddtransform.ui/src-gen/dk/itu/bddctransform/ui/contentassist/antlr/internal/InternalLettuce.g:325:2: ( ( ( rule__Variable__Group__0 ) ) )
            // ../dk.itu.bddtransform.ui/src-gen/dk/itu/bddctransform/ui/contentassist/antlr/internal/InternalLettuce.g:326:1: ( ( rule__Variable__Group__0 ) )
            {
            // ../dk.itu.bddtransform.ui/src-gen/dk/itu/bddctransform/ui/contentassist/antlr/internal/InternalLettuce.g:326:1: ( ( rule__Variable__Group__0 ) )
            // ../dk.itu.bddtransform.ui/src-gen/dk/itu/bddctransform/ui/contentassist/antlr/internal/InternalLettuce.g:327:1: ( rule__Variable__Group__0 )
            {
             before(grammarAccess.getVariableAccess().getGroup()); 
            // ../dk.itu.bddtransform.ui/src-gen/dk/itu/bddctransform/ui/contentassist/antlr/internal/InternalLettuce.g:328:1: ( rule__Variable__Group__0 )
            // ../dk.itu.bddtransform.ui/src-gen/dk/itu/bddctransform/ui/contentassist/antlr/internal/InternalLettuce.g:328:2: rule__Variable__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__Variable__Group__0_in_ruleVariable633);
            rule__Variable__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getVariableAccess().getGroup()); 

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
    // $ANTLR end "ruleVariable"


    // $ANTLR start "entryRuleAlternation"
    // ../dk.itu.bddtransform.ui/src-gen/dk/itu/bddctransform/ui/contentassist/antlr/internal/InternalLettuce.g:340:1: entryRuleAlternation : ruleAlternation EOF ;
    public final void entryRuleAlternation() throws RecognitionException {
        try {
            // ../dk.itu.bddtransform.ui/src-gen/dk/itu/bddctransform/ui/contentassist/antlr/internal/InternalLettuce.g:341:1: ( ruleAlternation EOF )
            // ../dk.itu.bddtransform.ui/src-gen/dk/itu/bddctransform/ui/contentassist/antlr/internal/InternalLettuce.g:342:1: ruleAlternation EOF
            {
             before(grammarAccess.getAlternationRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleAlternation_in_entryRuleAlternation660);
            ruleAlternation();

            state._fsp--;

             after(grammarAccess.getAlternationRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleAlternation667); 

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
    // $ANTLR end "entryRuleAlternation"


    // $ANTLR start "ruleAlternation"
    // ../dk.itu.bddtransform.ui/src-gen/dk/itu/bddctransform/ui/contentassist/antlr/internal/InternalLettuce.g:349:1: ruleAlternation : ( ( rule__Alternation__Group__0 ) ) ;
    public final void ruleAlternation() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.bddtransform.ui/src-gen/dk/itu/bddctransform/ui/contentassist/antlr/internal/InternalLettuce.g:353:2: ( ( ( rule__Alternation__Group__0 ) ) )
            // ../dk.itu.bddtransform.ui/src-gen/dk/itu/bddctransform/ui/contentassist/antlr/internal/InternalLettuce.g:354:1: ( ( rule__Alternation__Group__0 ) )
            {
            // ../dk.itu.bddtransform.ui/src-gen/dk/itu/bddctransform/ui/contentassist/antlr/internal/InternalLettuce.g:354:1: ( ( rule__Alternation__Group__0 ) )
            // ../dk.itu.bddtransform.ui/src-gen/dk/itu/bddctransform/ui/contentassist/antlr/internal/InternalLettuce.g:355:1: ( rule__Alternation__Group__0 )
            {
             before(grammarAccess.getAlternationAccess().getGroup()); 
            // ../dk.itu.bddtransform.ui/src-gen/dk/itu/bddctransform/ui/contentassist/antlr/internal/InternalLettuce.g:356:1: ( rule__Alternation__Group__0 )
            // ../dk.itu.bddtransform.ui/src-gen/dk/itu/bddctransform/ui/contentassist/antlr/internal/InternalLettuce.g:356:2: rule__Alternation__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__Alternation__Group__0_in_ruleAlternation693);
            rule__Alternation__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getAlternationAccess().getGroup()); 

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
    // $ANTLR end "ruleAlternation"


    // $ANTLR start "entryRuleOptional"
    // ../dk.itu.bddtransform.ui/src-gen/dk/itu/bddctransform/ui/contentassist/antlr/internal/InternalLettuce.g:368:1: entryRuleOptional : ruleOptional EOF ;
    public final void entryRuleOptional() throws RecognitionException {
        try {
            // ../dk.itu.bddtransform.ui/src-gen/dk/itu/bddctransform/ui/contentassist/antlr/internal/InternalLettuce.g:369:1: ( ruleOptional EOF )
            // ../dk.itu.bddtransform.ui/src-gen/dk/itu/bddctransform/ui/contentassist/antlr/internal/InternalLettuce.g:370:1: ruleOptional EOF
            {
             before(grammarAccess.getOptionalRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleOptional_in_entryRuleOptional720);
            ruleOptional();

            state._fsp--;

             after(grammarAccess.getOptionalRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleOptional727); 

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
    // $ANTLR end "entryRuleOptional"


    // $ANTLR start "ruleOptional"
    // ../dk.itu.bddtransform.ui/src-gen/dk/itu/bddctransform/ui/contentassist/antlr/internal/InternalLettuce.g:377:1: ruleOptional : ( ( rule__Optional__Group__0 ) ) ;
    public final void ruleOptional() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.bddtransform.ui/src-gen/dk/itu/bddctransform/ui/contentassist/antlr/internal/InternalLettuce.g:381:2: ( ( ( rule__Optional__Group__0 ) ) )
            // ../dk.itu.bddtransform.ui/src-gen/dk/itu/bddctransform/ui/contentassist/antlr/internal/InternalLettuce.g:382:1: ( ( rule__Optional__Group__0 ) )
            {
            // ../dk.itu.bddtransform.ui/src-gen/dk/itu/bddctransform/ui/contentassist/antlr/internal/InternalLettuce.g:382:1: ( ( rule__Optional__Group__0 ) )
            // ../dk.itu.bddtransform.ui/src-gen/dk/itu/bddctransform/ui/contentassist/antlr/internal/InternalLettuce.g:383:1: ( rule__Optional__Group__0 )
            {
             before(grammarAccess.getOptionalAccess().getGroup()); 
            // ../dk.itu.bddtransform.ui/src-gen/dk/itu/bddctransform/ui/contentassist/antlr/internal/InternalLettuce.g:384:1: ( rule__Optional__Group__0 )
            // ../dk.itu.bddtransform.ui/src-gen/dk/itu/bddctransform/ui/contentassist/antlr/internal/InternalLettuce.g:384:2: rule__Optional__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__Optional__Group__0_in_ruleOptional753);
            rule__Optional__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getOptionalAccess().getGroup()); 

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
    // $ANTLR end "ruleOptional"


    // $ANTLR start "entryRuleExpression"
    // ../dk.itu.bddtransform.ui/src-gen/dk/itu/bddctransform/ui/contentassist/antlr/internal/InternalLettuce.g:396:1: entryRuleExpression : ruleExpression EOF ;
    public final void entryRuleExpression() throws RecognitionException {
        try {
            // ../dk.itu.bddtransform.ui/src-gen/dk/itu/bddctransform/ui/contentassist/antlr/internal/InternalLettuce.g:397:1: ( ruleExpression EOF )
            // ../dk.itu.bddtransform.ui/src-gen/dk/itu/bddctransform/ui/contentassist/antlr/internal/InternalLettuce.g:398:1: ruleExpression EOF
            {
             before(grammarAccess.getExpressionRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleExpression_in_entryRuleExpression780);
            ruleExpression();

            state._fsp--;

             after(grammarAccess.getExpressionRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleExpression787); 

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
    // $ANTLR end "entryRuleExpression"


    // $ANTLR start "ruleExpression"
    // ../dk.itu.bddtransform.ui/src-gen/dk/itu/bddctransform/ui/contentassist/antlr/internal/InternalLettuce.g:405:1: ruleExpression : ( ( rule__Expression__Group__0 ) ) ;
    public final void ruleExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.bddtransform.ui/src-gen/dk/itu/bddctransform/ui/contentassist/antlr/internal/InternalLettuce.g:409:2: ( ( ( rule__Expression__Group__0 ) ) )
            // ../dk.itu.bddtransform.ui/src-gen/dk/itu/bddctransform/ui/contentassist/antlr/internal/InternalLettuce.g:410:1: ( ( rule__Expression__Group__0 ) )
            {
            // ../dk.itu.bddtransform.ui/src-gen/dk/itu/bddctransform/ui/contentassist/antlr/internal/InternalLettuce.g:410:1: ( ( rule__Expression__Group__0 ) )
            // ../dk.itu.bddtransform.ui/src-gen/dk/itu/bddctransform/ui/contentassist/antlr/internal/InternalLettuce.g:411:1: ( rule__Expression__Group__0 )
            {
             before(grammarAccess.getExpressionAccess().getGroup()); 
            // ../dk.itu.bddtransform.ui/src-gen/dk/itu/bddctransform/ui/contentassist/antlr/internal/InternalLettuce.g:412:1: ( rule__Expression__Group__0 )
            // ../dk.itu.bddtransform.ui/src-gen/dk/itu/bddctransform/ui/contentassist/antlr/internal/InternalLettuce.g:412:2: rule__Expression__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__Expression__Group__0_in_ruleExpression813);
            rule__Expression__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getExpressionAccess().getGroup()); 

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
    // $ANTLR end "ruleExpression"


    // $ANTLR start "entryRuleIfDef"
    // ../dk.itu.bddtransform.ui/src-gen/dk/itu/bddctransform/ui/contentassist/antlr/internal/InternalLettuce.g:424:1: entryRuleIfDef : ruleIfDef EOF ;
    public final void entryRuleIfDef() throws RecognitionException {
        try {
            // ../dk.itu.bddtransform.ui/src-gen/dk/itu/bddctransform/ui/contentassist/antlr/internal/InternalLettuce.g:425:1: ( ruleIfDef EOF )
            // ../dk.itu.bddtransform.ui/src-gen/dk/itu/bddctransform/ui/contentassist/antlr/internal/InternalLettuce.g:426:1: ruleIfDef EOF
            {
             before(grammarAccess.getIfDefRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleIfDef_in_entryRuleIfDef840);
            ruleIfDef();

            state._fsp--;

             after(grammarAccess.getIfDefRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleIfDef847); 

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
    // $ANTLR end "entryRuleIfDef"


    // $ANTLR start "ruleIfDef"
    // ../dk.itu.bddtransform.ui/src-gen/dk/itu/bddctransform/ui/contentassist/antlr/internal/InternalLettuce.g:433:1: ruleIfDef : ( ( rule__IfDef__Group__0 ) ) ;
    public final void ruleIfDef() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.bddtransform.ui/src-gen/dk/itu/bddctransform/ui/contentassist/antlr/internal/InternalLettuce.g:437:2: ( ( ( rule__IfDef__Group__0 ) ) )
            // ../dk.itu.bddtransform.ui/src-gen/dk/itu/bddctransform/ui/contentassist/antlr/internal/InternalLettuce.g:438:1: ( ( rule__IfDef__Group__0 ) )
            {
            // ../dk.itu.bddtransform.ui/src-gen/dk/itu/bddctransform/ui/contentassist/antlr/internal/InternalLettuce.g:438:1: ( ( rule__IfDef__Group__0 ) )
            // ../dk.itu.bddtransform.ui/src-gen/dk/itu/bddctransform/ui/contentassist/antlr/internal/InternalLettuce.g:439:1: ( rule__IfDef__Group__0 )
            {
             before(grammarAccess.getIfDefAccess().getGroup()); 
            // ../dk.itu.bddtransform.ui/src-gen/dk/itu/bddctransform/ui/contentassist/antlr/internal/InternalLettuce.g:440:1: ( rule__IfDef__Group__0 )
            // ../dk.itu.bddtransform.ui/src-gen/dk/itu/bddctransform/ui/contentassist/antlr/internal/InternalLettuce.g:440:2: rule__IfDef__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__IfDef__Group__0_in_ruleIfDef873);
            rule__IfDef__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getIfDefAccess().getGroup()); 

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
    // $ANTLR end "ruleIfDef"


    // $ANTLR start "entryRuleMatch"
    // ../dk.itu.bddtransform.ui/src-gen/dk/itu/bddctransform/ui/contentassist/antlr/internal/InternalLettuce.g:452:1: entryRuleMatch : ruleMatch EOF ;
    public final void entryRuleMatch() throws RecognitionException {
        try {
            // ../dk.itu.bddtransform.ui/src-gen/dk/itu/bddctransform/ui/contentassist/antlr/internal/InternalLettuce.g:453:1: ( ruleMatch EOF )
            // ../dk.itu.bddtransform.ui/src-gen/dk/itu/bddctransform/ui/contentassist/antlr/internal/InternalLettuce.g:454:1: ruleMatch EOF
            {
             before(grammarAccess.getMatchRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleMatch_in_entryRuleMatch900);
            ruleMatch();

            state._fsp--;

             after(grammarAccess.getMatchRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleMatch907); 

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
    // $ANTLR end "entryRuleMatch"


    // $ANTLR start "ruleMatch"
    // ../dk.itu.bddtransform.ui/src-gen/dk/itu/bddctransform/ui/contentassist/antlr/internal/InternalLettuce.g:461:1: ruleMatch : ( ( rule__Match__Group__0 ) ) ;
    public final void ruleMatch() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.bddtransform.ui/src-gen/dk/itu/bddctransform/ui/contentassist/antlr/internal/InternalLettuce.g:465:2: ( ( ( rule__Match__Group__0 ) ) )
            // ../dk.itu.bddtransform.ui/src-gen/dk/itu/bddctransform/ui/contentassist/antlr/internal/InternalLettuce.g:466:1: ( ( rule__Match__Group__0 ) )
            {
            // ../dk.itu.bddtransform.ui/src-gen/dk/itu/bddctransform/ui/contentassist/antlr/internal/InternalLettuce.g:466:1: ( ( rule__Match__Group__0 ) )
            // ../dk.itu.bddtransform.ui/src-gen/dk/itu/bddctransform/ui/contentassist/antlr/internal/InternalLettuce.g:467:1: ( rule__Match__Group__0 )
            {
             before(grammarAccess.getMatchAccess().getGroup()); 
            // ../dk.itu.bddtransform.ui/src-gen/dk/itu/bddctransform/ui/contentassist/antlr/internal/InternalLettuce.g:468:1: ( rule__Match__Group__0 )
            // ../dk.itu.bddtransform.ui/src-gen/dk/itu/bddctransform/ui/contentassist/antlr/internal/InternalLettuce.g:468:2: rule__Match__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__Match__Group__0_in_ruleMatch933);
            rule__Match__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getMatchAccess().getGroup()); 

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
    // $ANTLR end "ruleMatch"


    // $ANTLR start "entryRuleFail"
    // ../dk.itu.bddtransform.ui/src-gen/dk/itu/bddctransform/ui/contentassist/antlr/internal/InternalLettuce.g:480:1: entryRuleFail : ruleFail EOF ;
    public final void entryRuleFail() throws RecognitionException {
        try {
            // ../dk.itu.bddtransform.ui/src-gen/dk/itu/bddctransform/ui/contentassist/antlr/internal/InternalLettuce.g:481:1: ( ruleFail EOF )
            // ../dk.itu.bddtransform.ui/src-gen/dk/itu/bddctransform/ui/contentassist/antlr/internal/InternalLettuce.g:482:1: ruleFail EOF
            {
             before(grammarAccess.getFailRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleFail_in_entryRuleFail960);
            ruleFail();

            state._fsp--;

             after(grammarAccess.getFailRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleFail967); 

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
    // $ANTLR end "entryRuleFail"


    // $ANTLR start "ruleFail"
    // ../dk.itu.bddtransform.ui/src-gen/dk/itu/bddctransform/ui/contentassist/antlr/internal/InternalLettuce.g:489:1: ruleFail : ( ( rule__Fail__Group__0 ) ) ;
    public final void ruleFail() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.bddtransform.ui/src-gen/dk/itu/bddctransform/ui/contentassist/antlr/internal/InternalLettuce.g:493:2: ( ( ( rule__Fail__Group__0 ) ) )
            // ../dk.itu.bddtransform.ui/src-gen/dk/itu/bddctransform/ui/contentassist/antlr/internal/InternalLettuce.g:494:1: ( ( rule__Fail__Group__0 ) )
            {
            // ../dk.itu.bddtransform.ui/src-gen/dk/itu/bddctransform/ui/contentassist/antlr/internal/InternalLettuce.g:494:1: ( ( rule__Fail__Group__0 ) )
            // ../dk.itu.bddtransform.ui/src-gen/dk/itu/bddctransform/ui/contentassist/antlr/internal/InternalLettuce.g:495:1: ( rule__Fail__Group__0 )
            {
             before(grammarAccess.getFailAccess().getGroup()); 
            // ../dk.itu.bddtransform.ui/src-gen/dk/itu/bddctransform/ui/contentassist/antlr/internal/InternalLettuce.g:496:1: ( rule__Fail__Group__0 )
            // ../dk.itu.bddtransform.ui/src-gen/dk/itu/bddctransform/ui/contentassist/antlr/internal/InternalLettuce.g:496:2: rule__Fail__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__Fail__Group__0_in_ruleFail993);
            rule__Fail__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getFailAccess().getGroup()); 

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
    // $ANTLR end "ruleFail"


    // $ANTLR start "entryRuleKeyValue"
    // ../dk.itu.bddtransform.ui/src-gen/dk/itu/bddctransform/ui/contentassist/antlr/internal/InternalLettuce.g:508:1: entryRuleKeyValue : ruleKeyValue EOF ;
    public final void entryRuleKeyValue() throws RecognitionException {
        try {
            // ../dk.itu.bddtransform.ui/src-gen/dk/itu/bddctransform/ui/contentassist/antlr/internal/InternalLettuce.g:509:1: ( ruleKeyValue EOF )
            // ../dk.itu.bddtransform.ui/src-gen/dk/itu/bddctransform/ui/contentassist/antlr/internal/InternalLettuce.g:510:1: ruleKeyValue EOF
            {
             before(grammarAccess.getKeyValueRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleKeyValue_in_entryRuleKeyValue1020);
            ruleKeyValue();

            state._fsp--;

             after(grammarAccess.getKeyValueRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleKeyValue1027); 

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
    // $ANTLR end "entryRuleKeyValue"


    // $ANTLR start "ruleKeyValue"
    // ../dk.itu.bddtransform.ui/src-gen/dk/itu/bddctransform/ui/contentassist/antlr/internal/InternalLettuce.g:517:1: ruleKeyValue : ( ( rule__KeyValue__Group__0 ) ) ;
    public final void ruleKeyValue() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.bddtransform.ui/src-gen/dk/itu/bddctransform/ui/contentassist/antlr/internal/InternalLettuce.g:521:2: ( ( ( rule__KeyValue__Group__0 ) ) )
            // ../dk.itu.bddtransform.ui/src-gen/dk/itu/bddctransform/ui/contentassist/antlr/internal/InternalLettuce.g:522:1: ( ( rule__KeyValue__Group__0 ) )
            {
            // ../dk.itu.bddtransform.ui/src-gen/dk/itu/bddctransform/ui/contentassist/antlr/internal/InternalLettuce.g:522:1: ( ( rule__KeyValue__Group__0 ) )
            // ../dk.itu.bddtransform.ui/src-gen/dk/itu/bddctransform/ui/contentassist/antlr/internal/InternalLettuce.g:523:1: ( rule__KeyValue__Group__0 )
            {
             before(grammarAccess.getKeyValueAccess().getGroup()); 
            // ../dk.itu.bddtransform.ui/src-gen/dk/itu/bddctransform/ui/contentassist/antlr/internal/InternalLettuce.g:524:1: ( rule__KeyValue__Group__0 )
            // ../dk.itu.bddtransform.ui/src-gen/dk/itu/bddctransform/ui/contentassist/antlr/internal/InternalLettuce.g:524:2: rule__KeyValue__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__KeyValue__Group__0_in_ruleKeyValue1053);
            rule__KeyValue__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getKeyValueAccess().getGroup()); 

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
    // $ANTLR end "ruleKeyValue"


    // $ANTLR start "rule__TransformModel___Alternatives_3"
    // ../dk.itu.bddtransform.ui/src-gen/dk/itu/bddctransform/ui/contentassist/antlr/internal/InternalLettuce.g:536:1: rule__TransformModel___Alternatives_3 : ( ( ( rule__TransformModel___RulesAssignment_3_0 ) ) | ( ( rule__TransformModel___BehaviorsAssignment_3_1 ) ) );
    public final void rule__TransformModel___Alternatives_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.bddtransform.ui/src-gen/dk/itu/bddctransform/ui/contentassist/antlr/internal/InternalLettuce.g:540:1: ( ( ( rule__TransformModel___RulesAssignment_3_0 ) ) | ( ( rule__TransformModel___BehaviorsAssignment_3_1 ) ) )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==17) ) {
                alt1=1;
            }
            else if ( (LA1_0==13) ) {
                alt1=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // ../dk.itu.bddtransform.ui/src-gen/dk/itu/bddctransform/ui/contentassist/antlr/internal/InternalLettuce.g:541:1: ( ( rule__TransformModel___RulesAssignment_3_0 ) )
                    {
                    // ../dk.itu.bddtransform.ui/src-gen/dk/itu/bddctransform/ui/contentassist/antlr/internal/InternalLettuce.g:541:1: ( ( rule__TransformModel___RulesAssignment_3_0 ) )
                    // ../dk.itu.bddtransform.ui/src-gen/dk/itu/bddctransform/ui/contentassist/antlr/internal/InternalLettuce.g:542:1: ( rule__TransformModel___RulesAssignment_3_0 )
                    {
                     before(grammarAccess.getTransformModel_Access().getRulesAssignment_3_0()); 
                    // ../dk.itu.bddtransform.ui/src-gen/dk/itu/bddctransform/ui/contentassist/antlr/internal/InternalLettuce.g:543:1: ( rule__TransformModel___RulesAssignment_3_0 )
                    // ../dk.itu.bddtransform.ui/src-gen/dk/itu/bddctransform/ui/contentassist/antlr/internal/InternalLettuce.g:543:2: rule__TransformModel___RulesAssignment_3_0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__TransformModel___RulesAssignment_3_0_in_rule__TransformModel___Alternatives_31089);
                    rule__TransformModel___RulesAssignment_3_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getTransformModel_Access().getRulesAssignment_3_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../dk.itu.bddtransform.ui/src-gen/dk/itu/bddctransform/ui/contentassist/antlr/internal/InternalLettuce.g:547:6: ( ( rule__TransformModel___BehaviorsAssignment_3_1 ) )
                    {
                    // ../dk.itu.bddtransform.ui/src-gen/dk/itu/bddctransform/ui/contentassist/antlr/internal/InternalLettuce.g:547:6: ( ( rule__TransformModel___BehaviorsAssignment_3_1 ) )
                    // ../dk.itu.bddtransform.ui/src-gen/dk/itu/bddctransform/ui/contentassist/antlr/internal/InternalLettuce.g:548:1: ( rule__TransformModel___BehaviorsAssignment_3_1 )
                    {
                     before(grammarAccess.getTransformModel_Access().getBehaviorsAssignment_3_1()); 
                    // ../dk.itu.bddtransform.ui/src-gen/dk/itu/bddctransform/ui/contentassist/antlr/internal/InternalLettuce.g:549:1: ( rule__TransformModel___BehaviorsAssignment_3_1 )
                    // ../dk.itu.bddtransform.ui/src-gen/dk/itu/bddctransform/ui/contentassist/antlr/internal/InternalLettuce.g:549:2: rule__TransformModel___BehaviorsAssignment_3_1
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__TransformModel___BehaviorsAssignment_3_1_in_rule__TransformModel___Alternatives_31107);
                    rule__TransformModel___BehaviorsAssignment_3_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getTransformModel_Access().getBehaviorsAssignment_3_1()); 

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
    // $ANTLR end "rule__TransformModel___Alternatives_3"


    // $ANTLR start "rule__Pattern__Alternatives"
    // ../dk.itu.bddtransform.ui/src-gen/dk/itu/bddctransform/ui/contentassist/antlr/internal/InternalLettuce.g:558:1: rule__Pattern__Alternatives : ( ( ruleExactSting ) | ( ruleVariable ) | ( ruleAlternation ) | ( ruleOptional ) );
    public final void rule__Pattern__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.bddtransform.ui/src-gen/dk/itu/bddctransform/ui/contentassist/antlr/internal/InternalLettuce.g:562:1: ( ( ruleExactSting ) | ( ruleVariable ) | ( ruleAlternation ) | ( ruleOptional ) )
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
                    // ../dk.itu.bddtransform.ui/src-gen/dk/itu/bddctransform/ui/contentassist/antlr/internal/InternalLettuce.g:563:1: ( ruleExactSting )
                    {
                    // ../dk.itu.bddtransform.ui/src-gen/dk/itu/bddctransform/ui/contentassist/antlr/internal/InternalLettuce.g:563:1: ( ruleExactSting )
                    // ../dk.itu.bddtransform.ui/src-gen/dk/itu/bddctransform/ui/contentassist/antlr/internal/InternalLettuce.g:564:1: ruleExactSting
                    {
                     before(grammarAccess.getPatternAccess().getExactStingParserRuleCall_0()); 
                    pushFollow(FollowSets000.FOLLOW_ruleExactSting_in_rule__Pattern__Alternatives1140);
                    ruleExactSting();

                    state._fsp--;

                     after(grammarAccess.getPatternAccess().getExactStingParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../dk.itu.bddtransform.ui/src-gen/dk/itu/bddctransform/ui/contentassist/antlr/internal/InternalLettuce.g:569:6: ( ruleVariable )
                    {
                    // ../dk.itu.bddtransform.ui/src-gen/dk/itu/bddctransform/ui/contentassist/antlr/internal/InternalLettuce.g:569:6: ( ruleVariable )
                    // ../dk.itu.bddtransform.ui/src-gen/dk/itu/bddctransform/ui/contentassist/antlr/internal/InternalLettuce.g:570:1: ruleVariable
                    {
                     before(grammarAccess.getPatternAccess().getVariableParserRuleCall_1()); 
                    pushFollow(FollowSets000.FOLLOW_ruleVariable_in_rule__Pattern__Alternatives1157);
                    ruleVariable();

                    state._fsp--;

                     after(grammarAccess.getPatternAccess().getVariableParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../dk.itu.bddtransform.ui/src-gen/dk/itu/bddctransform/ui/contentassist/antlr/internal/InternalLettuce.g:575:6: ( ruleAlternation )
                    {
                    // ../dk.itu.bddtransform.ui/src-gen/dk/itu/bddctransform/ui/contentassist/antlr/internal/InternalLettuce.g:575:6: ( ruleAlternation )
                    // ../dk.itu.bddtransform.ui/src-gen/dk/itu/bddctransform/ui/contentassist/antlr/internal/InternalLettuce.g:576:1: ruleAlternation
                    {
                     before(grammarAccess.getPatternAccess().getAlternationParserRuleCall_2()); 
                    pushFollow(FollowSets000.FOLLOW_ruleAlternation_in_rule__Pattern__Alternatives1174);
                    ruleAlternation();

                    state._fsp--;

                     after(grammarAccess.getPatternAccess().getAlternationParserRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../dk.itu.bddtransform.ui/src-gen/dk/itu/bddctransform/ui/contentassist/antlr/internal/InternalLettuce.g:581:6: ( ruleOptional )
                    {
                    // ../dk.itu.bddtransform.ui/src-gen/dk/itu/bddctransform/ui/contentassist/antlr/internal/InternalLettuce.g:581:6: ( ruleOptional )
                    // ../dk.itu.bddtransform.ui/src-gen/dk/itu/bddctransform/ui/contentassist/antlr/internal/InternalLettuce.g:582:1: ruleOptional
                    {
                     before(grammarAccess.getPatternAccess().getOptionalParserRuleCall_3()); 
                    pushFollow(FollowSets000.FOLLOW_ruleOptional_in_rule__Pattern__Alternatives1191);
                    ruleOptional();

                    state._fsp--;

                     after(grammarAccess.getPatternAccess().getOptionalParserRuleCall_3()); 

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
    // $ANTLR end "rule__Pattern__Alternatives"


    // $ANTLR start "rule__Transformation__Alternatives"
    // ../dk.itu.bddtransform.ui/src-gen/dk/itu/bddctransform/ui/contentassist/antlr/internal/InternalLettuce.g:592:1: rule__Transformation__Alternatives : ( ( ruleExpression ) | ( ruleIfDef ) | ( ruleMatch ) | ( ruleFail ) );
    public final void rule__Transformation__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.bddtransform.ui/src-gen/dk/itu/bddctransform/ui/contentassist/antlr/internal/InternalLettuce.g:596:1: ( ( ruleExpression ) | ( ruleIfDef ) | ( ruleMatch ) | ( ruleFail ) )
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
                    // ../dk.itu.bddtransform.ui/src-gen/dk/itu/bddctransform/ui/contentassist/antlr/internal/InternalLettuce.g:597:1: ( ruleExpression )
                    {
                    // ../dk.itu.bddtransform.ui/src-gen/dk/itu/bddctransform/ui/contentassist/antlr/internal/InternalLettuce.g:597:1: ( ruleExpression )
                    // ../dk.itu.bddtransform.ui/src-gen/dk/itu/bddctransform/ui/contentassist/antlr/internal/InternalLettuce.g:598:1: ruleExpression
                    {
                     before(grammarAccess.getTransformationAccess().getExpressionParserRuleCall_0()); 
                    pushFollow(FollowSets000.FOLLOW_ruleExpression_in_rule__Transformation__Alternatives1223);
                    ruleExpression();

                    state._fsp--;

                     after(grammarAccess.getTransformationAccess().getExpressionParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../dk.itu.bddtransform.ui/src-gen/dk/itu/bddctransform/ui/contentassist/antlr/internal/InternalLettuce.g:603:6: ( ruleIfDef )
                    {
                    // ../dk.itu.bddtransform.ui/src-gen/dk/itu/bddctransform/ui/contentassist/antlr/internal/InternalLettuce.g:603:6: ( ruleIfDef )
                    // ../dk.itu.bddtransform.ui/src-gen/dk/itu/bddctransform/ui/contentassist/antlr/internal/InternalLettuce.g:604:1: ruleIfDef
                    {
                     before(grammarAccess.getTransformationAccess().getIfDefParserRuleCall_1()); 
                    pushFollow(FollowSets000.FOLLOW_ruleIfDef_in_rule__Transformation__Alternatives1240);
                    ruleIfDef();

                    state._fsp--;

                     after(grammarAccess.getTransformationAccess().getIfDefParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../dk.itu.bddtransform.ui/src-gen/dk/itu/bddctransform/ui/contentassist/antlr/internal/InternalLettuce.g:609:6: ( ruleMatch )
                    {
                    // ../dk.itu.bddtransform.ui/src-gen/dk/itu/bddctransform/ui/contentassist/antlr/internal/InternalLettuce.g:609:6: ( ruleMatch )
                    // ../dk.itu.bddtransform.ui/src-gen/dk/itu/bddctransform/ui/contentassist/antlr/internal/InternalLettuce.g:610:1: ruleMatch
                    {
                     before(grammarAccess.getTransformationAccess().getMatchParserRuleCall_2()); 
                    pushFollow(FollowSets000.FOLLOW_ruleMatch_in_rule__Transformation__Alternatives1257);
                    ruleMatch();

                    state._fsp--;

                     after(grammarAccess.getTransformationAccess().getMatchParserRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../dk.itu.bddtransform.ui/src-gen/dk/itu/bddctransform/ui/contentassist/antlr/internal/InternalLettuce.g:615:6: ( ruleFail )
                    {
                    // ../dk.itu.bddtransform.ui/src-gen/dk/itu/bddctransform/ui/contentassist/antlr/internal/InternalLettuce.g:615:6: ( ruleFail )
                    // ../dk.itu.bddtransform.ui/src-gen/dk/itu/bddctransform/ui/contentassist/antlr/internal/InternalLettuce.g:616:1: ruleFail
                    {
                     before(grammarAccess.getTransformationAccess().getFailParserRuleCall_3()); 
                    pushFollow(FollowSets000.FOLLOW_ruleFail_in_rule__Transformation__Alternatives1274);
                    ruleFail();

                    state._fsp--;

                     after(grammarAccess.getTransformationAccess().getFailParserRuleCall_3()); 

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
    // $ANTLR end "rule__Transformation__Alternatives"


    // $ANTLR start "rule__EString__Alternatives"
    // ../dk.itu.bddtransform.ui/src-gen/dk/itu/bddctransform/ui/contentassist/antlr/internal/InternalLettuce.g:626:1: rule__EString__Alternatives : ( ( RULE_STRING ) | ( RULE_ID ) );
    public final void rule__EString__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.bddtransform.ui/src-gen/dk/itu/bddctransform/ui/contentassist/antlr/internal/InternalLettuce.g:630:1: ( ( RULE_STRING ) | ( RULE_ID ) )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==RULE_STRING) ) {
                alt4=1;
            }
            else if ( (LA4_0==RULE_ID) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // ../dk.itu.bddtransform.ui/src-gen/dk/itu/bddctransform/ui/contentassist/antlr/internal/InternalLettuce.g:631:1: ( RULE_STRING )
                    {
                    // ../dk.itu.bddtransform.ui/src-gen/dk/itu/bddctransform/ui/contentassist/antlr/internal/InternalLettuce.g:631:1: ( RULE_STRING )
                    // ../dk.itu.bddtransform.ui/src-gen/dk/itu/bddctransform/ui/contentassist/antlr/internal/InternalLettuce.g:632:1: RULE_STRING
                    {
                     before(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 
                    match(input,RULE_STRING,FollowSets000.FOLLOW_RULE_STRING_in_rule__EString__Alternatives1306); 
                     after(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../dk.itu.bddtransform.ui/src-gen/dk/itu/bddctransform/ui/contentassist/antlr/internal/InternalLettuce.g:637:6: ( RULE_ID )
                    {
                    // ../dk.itu.bddtransform.ui/src-gen/dk/itu/bddctransform/ui/contentassist/antlr/internal/InternalLettuce.g:637:6: ( RULE_ID )
                    // ../dk.itu.bddtransform.ui/src-gen/dk/itu/bddctransform/ui/contentassist/antlr/internal/InternalLettuce.g:638:1: RULE_ID
                    {
                     before(grammarAccess.getEStringAccess().getIDTerminalRuleCall_1()); 
                    match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_rule__EString__Alternatives1323); 
                     after(grammarAccess.getEStringAccess().getIDTerminalRuleCall_1()); 

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


    // $ANTLR start "rule__KeyValue__Alternatives_3"
    // ../dk.itu.bddtransform.ui/src-gen/dk/itu/bddctransform/ui/contentassist/antlr/internal/InternalLettuce.g:648:1: rule__KeyValue__Alternatives_3 : ( ( ( rule__KeyValue__ValueAssignment_3_0 ) ) | ( ( rule__KeyValue__ValueAssignment_3_1 ) ) );
    public final void rule__KeyValue__Alternatives_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.bddtransform.ui/src-gen/dk/itu/bddctransform/ui/contentassist/antlr/internal/InternalLettuce.g:652:1: ( ( ( rule__KeyValue__ValueAssignment_3_0 ) ) | ( ( rule__KeyValue__ValueAssignment_3_1 ) ) )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( ((LA5_0>=RULE_ID && LA5_0<=RULE_STRING)) ) {
                alt5=1;
            }
            else if ( (LA5_0==18) ) {
                alt5=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // ../dk.itu.bddtransform.ui/src-gen/dk/itu/bddctransform/ui/contentassist/antlr/internal/InternalLettuce.g:653:1: ( ( rule__KeyValue__ValueAssignment_3_0 ) )
                    {
                    // ../dk.itu.bddtransform.ui/src-gen/dk/itu/bddctransform/ui/contentassist/antlr/internal/InternalLettuce.g:653:1: ( ( rule__KeyValue__ValueAssignment_3_0 ) )
                    // ../dk.itu.bddtransform.ui/src-gen/dk/itu/bddctransform/ui/contentassist/antlr/internal/InternalLettuce.g:654:1: ( rule__KeyValue__ValueAssignment_3_0 )
                    {
                     before(grammarAccess.getKeyValueAccess().getValueAssignment_3_0()); 
                    // ../dk.itu.bddtransform.ui/src-gen/dk/itu/bddctransform/ui/contentassist/antlr/internal/InternalLettuce.g:655:1: ( rule__KeyValue__ValueAssignment_3_0 )
                    // ../dk.itu.bddtransform.ui/src-gen/dk/itu/bddctransform/ui/contentassist/antlr/internal/InternalLettuce.g:655:2: rule__KeyValue__ValueAssignment_3_0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__KeyValue__ValueAssignment_3_0_in_rule__KeyValue__Alternatives_31355);
                    rule__KeyValue__ValueAssignment_3_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getKeyValueAccess().getValueAssignment_3_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../dk.itu.bddtransform.ui/src-gen/dk/itu/bddctransform/ui/contentassist/antlr/internal/InternalLettuce.g:659:6: ( ( rule__KeyValue__ValueAssignment_3_1 ) )
                    {
                    // ../dk.itu.bddtransform.ui/src-gen/dk/itu/bddctransform/ui/contentassist/antlr/internal/InternalLettuce.g:659:6: ( ( rule__KeyValue__ValueAssignment_3_1 ) )
                    // ../dk.itu.bddtransform.ui/src-gen/dk/itu/bddctransform/ui/contentassist/antlr/internal/InternalLettuce.g:660:1: ( rule__KeyValue__ValueAssignment_3_1 )
                    {
                     before(grammarAccess.getKeyValueAccess().getValueAssignment_3_1()); 
                    // ../dk.itu.bddtransform.ui/src-gen/dk/itu/bddctransform/ui/contentassist/antlr/internal/InternalLettuce.g:661:1: ( rule__KeyValue__ValueAssignment_3_1 )
                    // ../dk.itu.bddtransform.ui/src-gen/dk/itu/bddctransform/ui/contentassist/antlr/internal/InternalLettuce.g:661:2: rule__KeyValue__ValueAssignment_3_1
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__KeyValue__ValueAssignment_3_1_in_rule__KeyValue__Alternatives_31373);
                    rule__KeyValue__ValueAssignment_3_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getKeyValueAccess().getValueAssignment_3_1()); 

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
    // $ANTLR end "rule__KeyValue__Alternatives_3"


    // $ANTLR start "rule__TransformModel___Group__0"
    // ../dk.itu.bddtransform.ui/src-gen/dk/itu/bddctransform/ui/contentassist/antlr/internal/InternalLettuce.g:672:1: rule__TransformModel___Group__0 : rule__TransformModel___Group__0__Impl rule__TransformModel___Group__1 ;
    public final void rule__TransformModel___Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.bddtransform.ui/src-gen/dk/itu/bddctransform/ui/contentassist/antlr/internal/InternalLettuce.g:676:1: ( rule__TransformModel___Group__0__Impl rule__TransformModel___Group__1 )
            // ../dk.itu.bddtransform.ui/src-gen/dk/itu/bddctransform/ui/contentassist/antlr/internal/InternalLettuce.g:677:2: rule__TransformModel___Group__0__Impl rule__TransformModel___Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__TransformModel___Group__0__Impl_in_rule__TransformModel___Group__01404);
            rule__TransformModel___Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__TransformModel___Group__1_in_rule__TransformModel___Group__01407);
            rule__TransformModel___Group__1();

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
    // $ANTLR end "rule__TransformModel___Group__0"


    // $ANTLR start "rule__TransformModel___Group__0__Impl"
    // ../dk.itu.bddtransform.ui/src-gen/dk/itu/bddctransform/ui/contentassist/antlr/internal/InternalLettuce.g:684:1: rule__TransformModel___Group__0__Impl : ( 'transform' ) ;
    public final void rule__TransformModel___Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.bddtransform.ui/src-gen/dk/itu/bddctransform/ui/contentassist/antlr/internal/InternalLettuce.g:688:1: ( ( 'transform' ) )
            // ../dk.itu.bddtransform.ui/src-gen/dk/itu/bddctransform/ui/contentassist/antlr/internal/InternalLettuce.g:689:1: ( 'transform' )
            {
            // ../dk.itu.bddtransform.ui/src-gen/dk/itu/bddctransform/ui/contentassist/antlr/internal/InternalLettuce.g:689:1: ( 'transform' )
            // ../dk.itu.bddtransform.ui/src-gen/dk/itu/bddctransform/ui/contentassist/antlr/internal/InternalLettuce.g:690:1: 'transform'
            {
             before(grammarAccess.getTransformModel_Access().getTransformKeyword_0()); 
            match(input,11,FollowSets000.FOLLOW_11_in_rule__TransformModel___Group__0__Impl1435); 
             after(grammarAccess.getTransformModel_Access().getTransformKeyword_0()); 

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
    // $ANTLR end "rule__TransformModel___Group__0__Impl"


    // $ANTLR start "rule__TransformModel___Group__1"
    // ../dk.itu.bddtransform.ui/src-gen/dk/itu/bddctransform/ui/contentassist/antlr/internal/InternalLettuce.g:703:1: rule__TransformModel___Group__1 : rule__TransformModel___Group__1__Impl rule__TransformModel___Group__2 ;
    public final void rule__TransformModel___Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.bddtransform.ui/src-gen/dk/itu/bddctransform/ui/contentassist/antlr/internal/InternalLettuce.g:707:1: ( rule__TransformModel___Group__1__Impl rule__TransformModel___Group__2 )
            // ../dk.itu.bddtransform.ui/src-gen/dk/itu/bddctransform/ui/contentassist/antlr/internal/InternalLettuce.g:708:2: rule__TransformModel___Group__1__Impl rule__TransformModel___Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__TransformModel___Group__1__Impl_in_rule__TransformModel___Group__11466);
            rule__TransformModel___Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__TransformModel___Group__2_in_rule__TransformModel___Group__11469);
            rule__TransformModel___Group__2();

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
    // $ANTLR end "rule__TransformModel___Group__1"


    // $ANTLR start "rule__TransformModel___Group__1__Impl"
    // ../dk.itu.bddtransform.ui/src-gen/dk/itu/bddctransform/ui/contentassist/antlr/internal/InternalLettuce.g:715:1: rule__TransformModel___Group__1__Impl : ( 'package' ) ;
    public final void rule__TransformModel___Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.bddtransform.ui/src-gen/dk/itu/bddctransform/ui/contentassist/antlr/internal/InternalLettuce.g:719:1: ( ( 'package' ) )
            // ../dk.itu.bddtransform.ui/src-gen/dk/itu/bddctransform/ui/contentassist/antlr/internal/InternalLettuce.g:720:1: ( 'package' )
            {
            // ../dk.itu.bddtransform.ui/src-gen/dk/itu/bddctransform/ui/contentassist/antlr/internal/InternalLettuce.g:720:1: ( 'package' )
            // ../dk.itu.bddtransform.ui/src-gen/dk/itu/bddctransform/ui/contentassist/antlr/internal/InternalLettuce.g:721:1: 'package'
            {
             before(grammarAccess.getTransformModel_Access().getPackageKeyword_1()); 
            match(input,12,FollowSets000.FOLLOW_12_in_rule__TransformModel___Group__1__Impl1497); 
             after(grammarAccess.getTransformModel_Access().getPackageKeyword_1()); 

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
    // $ANTLR end "rule__TransformModel___Group__1__Impl"


    // $ANTLR start "rule__TransformModel___Group__2"
    // ../dk.itu.bddtransform.ui/src-gen/dk/itu/bddctransform/ui/contentassist/antlr/internal/InternalLettuce.g:734:1: rule__TransformModel___Group__2 : rule__TransformModel___Group__2__Impl rule__TransformModel___Group__3 ;
    public final void rule__TransformModel___Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.bddtransform.ui/src-gen/dk/itu/bddctransform/ui/contentassist/antlr/internal/InternalLettuce.g:738:1: ( rule__TransformModel___Group__2__Impl rule__TransformModel___Group__3 )
            // ../dk.itu.bddtransform.ui/src-gen/dk/itu/bddctransform/ui/contentassist/antlr/internal/InternalLettuce.g:739:2: rule__TransformModel___Group__2__Impl rule__TransformModel___Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__TransformModel___Group__2__Impl_in_rule__TransformModel___Group__21528);
            rule__TransformModel___Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__TransformModel___Group__3_in_rule__TransformModel___Group__21531);
            rule__TransformModel___Group__3();

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
    // $ANTLR end "rule__TransformModel___Group__2"


    // $ANTLR start "rule__TransformModel___Group__2__Impl"
    // ../dk.itu.bddtransform.ui/src-gen/dk/itu/bddctransform/ui/contentassist/antlr/internal/InternalLettuce.g:746:1: rule__TransformModel___Group__2__Impl : ( ( rule__TransformModel___NameAssignment_2 ) ) ;
    public final void rule__TransformModel___Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.bddtransform.ui/src-gen/dk/itu/bddctransform/ui/contentassist/antlr/internal/InternalLettuce.g:750:1: ( ( ( rule__TransformModel___NameAssignment_2 ) ) )
            // ../dk.itu.bddtransform.ui/src-gen/dk/itu/bddctransform/ui/contentassist/antlr/internal/InternalLettuce.g:751:1: ( ( rule__TransformModel___NameAssignment_2 ) )
            {
            // ../dk.itu.bddtransform.ui/src-gen/dk/itu/bddctransform/ui/contentassist/antlr/internal/InternalLettuce.g:751:1: ( ( rule__TransformModel___NameAssignment_2 ) )
            // ../dk.itu.bddtransform.ui/src-gen/dk/itu/bddctransform/ui/contentassist/antlr/internal/InternalLettuce.g:752:1: ( rule__TransformModel___NameAssignment_2 )
            {
             before(grammarAccess.getTransformModel_Access().getNameAssignment_2()); 
            // ../dk.itu.bddtransform.ui/src-gen/dk/itu/bddctransform/ui/contentassist/antlr/internal/InternalLettuce.g:753:1: ( rule__TransformModel___NameAssignment_2 )
            // ../dk.itu.bddtransform.ui/src-gen/dk/itu/bddctransform/ui/contentassist/antlr/internal/InternalLettuce.g:753:2: rule__TransformModel___NameAssignment_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__TransformModel___NameAssignment_2_in_rule__TransformModel___Group__2__Impl1558);
            rule__TransformModel___NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getTransformModel_Access().getNameAssignment_2()); 

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
    // $ANTLR end "rule__TransformModel___Group__2__Impl"


    // $ANTLR start "rule__TransformModel___Group__3"
    // ../dk.itu.bddtransform.ui/src-gen/dk/itu/bddctransform/ui/contentassist/antlr/internal/InternalLettuce.g:763:1: rule__TransformModel___Group__3 : rule__TransformModel___Group__3__Impl ;
    public final void rule__TransformModel___Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.bddtransform.ui/src-gen/dk/itu/bddctransform/ui/contentassist/antlr/internal/InternalLettuce.g:767:1: ( rule__TransformModel___Group__3__Impl )
            // ../dk.itu.bddtransform.ui/src-gen/dk/itu/bddctransform/ui/contentassist/antlr/internal/InternalLettuce.g:768:2: rule__TransformModel___Group__3__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__TransformModel___Group__3__Impl_in_rule__TransformModel___Group__31588);
            rule__TransformModel___Group__3__Impl();

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
    // $ANTLR end "rule__TransformModel___Group__3"


    // $ANTLR start "rule__TransformModel___Group__3__Impl"
    // ../dk.itu.bddtransform.ui/src-gen/dk/itu/bddctransform/ui/contentassist/antlr/internal/InternalLettuce.g:774:1: rule__TransformModel___Group__3__Impl : ( ( ( rule__TransformModel___Alternatives_3 ) ) ( ( rule__TransformModel___Alternatives_3 )* ) ) ;
    public final void rule__TransformModel___Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.bddtransform.ui/src-gen/dk/itu/bddctransform/ui/contentassist/antlr/internal/InternalLettuce.g:778:1: ( ( ( ( rule__TransformModel___Alternatives_3 ) ) ( ( rule__TransformModel___Alternatives_3 )* ) ) )
            // ../dk.itu.bddtransform.ui/src-gen/dk/itu/bddctransform/ui/contentassist/antlr/internal/InternalLettuce.g:779:1: ( ( ( rule__TransformModel___Alternatives_3 ) ) ( ( rule__TransformModel___Alternatives_3 )* ) )
            {
            // ../dk.itu.bddtransform.ui/src-gen/dk/itu/bddctransform/ui/contentassist/antlr/internal/InternalLettuce.g:779:1: ( ( ( rule__TransformModel___Alternatives_3 ) ) ( ( rule__TransformModel___Alternatives_3 )* ) )
            // ../dk.itu.bddtransform.ui/src-gen/dk/itu/bddctransform/ui/contentassist/antlr/internal/InternalLettuce.g:780:1: ( ( rule__TransformModel___Alternatives_3 ) ) ( ( rule__TransformModel___Alternatives_3 )* )
            {
            // ../dk.itu.bddtransform.ui/src-gen/dk/itu/bddctransform/ui/contentassist/antlr/internal/InternalLettuce.g:780:1: ( ( rule__TransformModel___Alternatives_3 ) )
            // ../dk.itu.bddtransform.ui/src-gen/dk/itu/bddctransform/ui/contentassist/antlr/internal/InternalLettuce.g:781:1: ( rule__TransformModel___Alternatives_3 )
            {
             before(grammarAccess.getTransformModel_Access().getAlternatives_3()); 
            // ../dk.itu.bddtransform.ui/src-gen/dk/itu/bddctransform/ui/contentassist/antlr/internal/InternalLettuce.g:782:1: ( rule__TransformModel___Alternatives_3 )
            // ../dk.itu.bddtransform.ui/src-gen/dk/itu/bddctransform/ui/contentassist/antlr/internal/InternalLettuce.g:782:2: rule__TransformModel___Alternatives_3
            {
            pushFollow(FollowSets000.FOLLOW_rule__TransformModel___Alternatives_3_in_rule__TransformModel___Group__3__Impl1617);
            rule__TransformModel___Alternatives_3();

            state._fsp--;


            }

             after(grammarAccess.getTransformModel_Access().getAlternatives_3()); 

            }

            // ../dk.itu.bddtransform.ui/src-gen/dk/itu/bddctransform/ui/contentassist/antlr/internal/InternalLettuce.g:785:1: ( ( rule__TransformModel___Alternatives_3 )* )
            // ../dk.itu.bddtransform.ui/src-gen/dk/itu/bddctransform/ui/contentassist/antlr/internal/InternalLettuce.g:786:1: ( rule__TransformModel___Alternatives_3 )*
            {
             before(grammarAccess.getTransformModel_Access().getAlternatives_3()); 
            // ../dk.itu.bddtransform.ui/src-gen/dk/itu/bddctransform/ui/contentassist/antlr/internal/InternalLettuce.g:787:1: ( rule__TransformModel___Alternatives_3 )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==13||LA6_0==17) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // ../dk.itu.bddtransform.ui/src-gen/dk/itu/bddctransform/ui/contentassist/antlr/internal/InternalLettuce.g:787:2: rule__TransformModel___Alternatives_3
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__TransformModel___Alternatives_3_in_rule__TransformModel___Group__3__Impl1629);
            	    rule__TransformModel___Alternatives_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);

             after(grammarAccess.getTransformModel_Access().getAlternatives_3()); 

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
    // $ANTLR end "rule__TransformModel___Group__3__Impl"


    // $ANTLR start "rule__Behavior__Group__0"
    // ../dk.itu.bddtransform.ui/src-gen/dk/itu/bddctransform/ui/contentassist/antlr/internal/InternalLettuce.g:806:1: rule__Behavior__Group__0 : rule__Behavior__Group__0__Impl rule__Behavior__Group__1 ;
    public final void rule__Behavior__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.bddtransform.ui/src-gen/dk/itu/bddctransform/ui/contentassist/antlr/internal/InternalLettuce.g:810:1: ( rule__Behavior__Group__0__Impl rule__Behavior__Group__1 )
            // ../dk.itu.bddtransform.ui/src-gen/dk/itu/bddctransform/ui/contentassist/antlr/internal/InternalLettuce.g:811:2: rule__Behavior__Group__0__Impl rule__Behavior__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Behavior__Group__0__Impl_in_rule__Behavior__Group__01670);
            rule__Behavior__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Behavior__Group__1_in_rule__Behavior__Group__01673);
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
    // ../dk.itu.bddtransform.ui/src-gen/dk/itu/bddctransform/ui/contentassist/antlr/internal/InternalLettuce.g:818:1: rule__Behavior__Group__0__Impl : ( 'behavior' ) ;
    public final void rule__Behavior__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.bddtransform.ui/src-gen/dk/itu/bddctransform/ui/contentassist/antlr/internal/InternalLettuce.g:822:1: ( ( 'behavior' ) )
            // ../dk.itu.bddtransform.ui/src-gen/dk/itu/bddctransform/ui/contentassist/antlr/internal/InternalLettuce.g:823:1: ( 'behavior' )
            {
            // ../dk.itu.bddtransform.ui/src-gen/dk/itu/bddctransform/ui/contentassist/antlr/internal/InternalLettuce.g:823:1: ( 'behavior' )
            // ../dk.itu.bddtransform.ui/src-gen/dk/itu/bddctransform/ui/contentassist/antlr/internal/InternalLettuce.g:824:1: 'behavior'
            {
             before(grammarAccess.getBehaviorAccess().getBehaviorKeyword_0()); 
            match(input,13,FollowSets000.FOLLOW_13_in_rule__Behavior__Group__0__Impl1701); 
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
    // ../dk.itu.bddtransform.ui/src-gen/dk/itu/bddctransform/ui/contentassist/antlr/internal/InternalLettuce.g:837:1: rule__Behavior__Group__1 : rule__Behavior__Group__1__Impl rule__Behavior__Group__2 ;
    public final void rule__Behavior__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.bddtransform.ui/src-gen/dk/itu/bddctransform/ui/contentassist/antlr/internal/InternalLettuce.g:841:1: ( rule__Behavior__Group__1__Impl rule__Behavior__Group__2 )
            // ../dk.itu.bddtransform.ui/src-gen/dk/itu/bddctransform/ui/contentassist/antlr/internal/InternalLettuce.g:842:2: rule__Behavior__Group__1__Impl rule__Behavior__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Behavior__Group__1__Impl_in_rule__Behavior__Group__11732);
            rule__Behavior__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Behavior__Group__2_in_rule__Behavior__Group__11735);
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
    // ../dk.itu.bddtransform.ui/src-gen/dk/itu/bddctransform/ui/contentassist/antlr/internal/InternalLettuce.g:849:1: rule__Behavior__Group__1__Impl : ( ( rule__Behavior__DescriptionAssignment_1 ) ) ;
    public final void rule__Behavior__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.bddtransform.ui/src-gen/dk/itu/bddctransform/ui/contentassist/antlr/internal/InternalLettuce.g:853:1: ( ( ( rule__Behavior__DescriptionAssignment_1 ) ) )
            // ../dk.itu.bddtransform.ui/src-gen/dk/itu/bddctransform/ui/contentassist/antlr/internal/InternalLettuce.g:854:1: ( ( rule__Behavior__DescriptionAssignment_1 ) )
            {
            // ../dk.itu.bddtransform.ui/src-gen/dk/itu/bddctransform/ui/contentassist/antlr/internal/InternalLettuce.g:854:1: ( ( rule__Behavior__DescriptionAssignment_1 ) )
            // ../dk.itu.bddtransform.ui/src-gen/dk/itu/bddctransform/ui/contentassist/antlr/internal/InternalLettuce.g:855:1: ( rule__Behavior__DescriptionAssignment_1 )
            {
             before(grammarAccess.getBehaviorAccess().getDescriptionAssignment_1()); 
            // ../dk.itu.bddtransform.ui/src-gen/dk/itu/bddctransform/ui/contentassist/antlr/internal/InternalLettuce.g:856:1: ( rule__Behavior__DescriptionAssignment_1 )
            // ../dk.itu.bddtransform.ui/src-gen/dk/itu/bddctransform/ui/contentassist/antlr/internal/InternalLettuce.g:856:2: rule__Behavior__DescriptionAssignment_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Behavior__DescriptionAssignment_1_in_rule__Behavior__Group__1__Impl1762);
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
    // ../dk.itu.bddtransform.ui/src-gen/dk/itu/bddctransform/ui/contentassist/antlr/internal/InternalLettuce.g:866:1: rule__Behavior__Group__2 : rule__Behavior__Group__2__Impl rule__Behavior__Group__3 ;
    public final void rule__Behavior__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.bddtransform.ui/src-gen/dk/itu/bddctransform/ui/contentassist/antlr/internal/InternalLettuce.g:870:1: ( rule__Behavior__Group__2__Impl rule__Behavior__Group__3 )
            // ../dk.itu.bddtransform.ui/src-gen/dk/itu/bddctransform/ui/contentassist/antlr/internal/InternalLettuce.g:871:2: rule__Behavior__Group__2__Impl rule__Behavior__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__Behavior__Group__2__Impl_in_rule__Behavior__Group__21792);
            rule__Behavior__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Behavior__Group__3_in_rule__Behavior__Group__21795);
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
    // ../dk.itu.bddtransform.ui/src-gen/dk/itu/bddctransform/ui/contentassist/antlr/internal/InternalLettuce.g:878:1: rule__Behavior__Group__2__Impl : ( 'class' ) ;
    public final void rule__Behavior__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.bddtransform.ui/src-gen/dk/itu/bddctransform/ui/contentassist/antlr/internal/InternalLettuce.g:882:1: ( ( 'class' ) )
            // ../dk.itu.bddtransform.ui/src-gen/dk/itu/bddctransform/ui/contentassist/antlr/internal/InternalLettuce.g:883:1: ( 'class' )
            {
            // ../dk.itu.bddtransform.ui/src-gen/dk/itu/bddctransform/ui/contentassist/antlr/internal/InternalLettuce.g:883:1: ( 'class' )
            // ../dk.itu.bddtransform.ui/src-gen/dk/itu/bddctransform/ui/contentassist/antlr/internal/InternalLettuce.g:884:1: 'class'
            {
             before(grammarAccess.getBehaviorAccess().getClassKeyword_2()); 
            match(input,14,FollowSets000.FOLLOW_14_in_rule__Behavior__Group__2__Impl1823); 
             after(grammarAccess.getBehaviorAccess().getClassKeyword_2()); 

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
    // ../dk.itu.bddtransform.ui/src-gen/dk/itu/bddctransform/ui/contentassist/antlr/internal/InternalLettuce.g:897:1: rule__Behavior__Group__3 : rule__Behavior__Group__3__Impl rule__Behavior__Group__4 ;
    public final void rule__Behavior__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.bddtransform.ui/src-gen/dk/itu/bddctransform/ui/contentassist/antlr/internal/InternalLettuce.g:901:1: ( rule__Behavior__Group__3__Impl rule__Behavior__Group__4 )
            // ../dk.itu.bddtransform.ui/src-gen/dk/itu/bddctransform/ui/contentassist/antlr/internal/InternalLettuce.g:902:2: rule__Behavior__Group__3__Impl rule__Behavior__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__Behavior__Group__3__Impl_in_rule__Behavior__Group__31854);
            rule__Behavior__Group__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Behavior__Group__4_in_rule__Behavior__Group__31857);
            rule__Behavior__Group__4();

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
    // ../dk.itu.bddtransform.ui/src-gen/dk/itu/bddctransform/ui/contentassist/antlr/internal/InternalLettuce.g:909:1: rule__Behavior__Group__3__Impl : ( ( rule__Behavior__ClassAssignment_3 ) ) ;
    public final void rule__Behavior__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.bddtransform.ui/src-gen/dk/itu/bddctransform/ui/contentassist/antlr/internal/InternalLettuce.g:913:1: ( ( ( rule__Behavior__ClassAssignment_3 ) ) )
            // ../dk.itu.bddtransform.ui/src-gen/dk/itu/bddctransform/ui/contentassist/antlr/internal/InternalLettuce.g:914:1: ( ( rule__Behavior__ClassAssignment_3 ) )
            {
            // ../dk.itu.bddtransform.ui/src-gen/dk/itu/bddctransform/ui/contentassist/antlr/internal/InternalLettuce.g:914:1: ( ( rule__Behavior__ClassAssignment_3 ) )
            // ../dk.itu.bddtransform.ui/src-gen/dk/itu/bddctransform/ui/contentassist/antlr/internal/InternalLettuce.g:915:1: ( rule__Behavior__ClassAssignment_3 )
            {
             before(grammarAccess.getBehaviorAccess().getClassAssignment_3()); 
            // ../dk.itu.bddtransform.ui/src-gen/dk/itu/bddctransform/ui/contentassist/antlr/internal/InternalLettuce.g:916:1: ( rule__Behavior__ClassAssignment_3 )
            // ../dk.itu.bddtransform.ui/src-gen/dk/itu/bddctransform/ui/contentassist/antlr/internal/InternalLettuce.g:916:2: rule__Behavior__ClassAssignment_3
            {
            pushFollow(FollowSets000.FOLLOW_rule__Behavior__ClassAssignment_3_in_rule__Behavior__Group__3__Impl1884);
            rule__Behavior__ClassAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getBehaviorAccess().getClassAssignment_3()); 

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


    // $ANTLR start "rule__Behavior__Group__4"
    // ../dk.itu.bddtransform.ui/src-gen/dk/itu/bddctransform/ui/contentassist/antlr/internal/InternalLettuce.g:926:1: rule__Behavior__Group__4 : rule__Behavior__Group__4__Impl rule__Behavior__Group__5 ;
    public final void rule__Behavior__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.bddtransform.ui/src-gen/dk/itu/bddctransform/ui/contentassist/antlr/internal/InternalLettuce.g:930:1: ( rule__Behavior__Group__4__Impl rule__Behavior__Group__5 )
            // ../dk.itu.bddtransform.ui/src-gen/dk/itu/bddctransform/ui/contentassist/antlr/internal/InternalLettuce.g:931:2: rule__Behavior__Group__4__Impl rule__Behavior__Group__5
            {
            pushFollow(FollowSets000.FOLLOW_rule__Behavior__Group__4__Impl_in_rule__Behavior__Group__41914);
            rule__Behavior__Group__4__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Behavior__Group__5_in_rule__Behavior__Group__41917);
            rule__Behavior__Group__5();

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
    // $ANTLR end "rule__Behavior__Group__4"


    // $ANTLR start "rule__Behavior__Group__4__Impl"
    // ../dk.itu.bddtransform.ui/src-gen/dk/itu/bddctransform/ui/contentassist/antlr/internal/InternalLettuce.g:938:1: rule__Behavior__Group__4__Impl : ( 'signature' ) ;
    public final void rule__Behavior__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.bddtransform.ui/src-gen/dk/itu/bddctransform/ui/contentassist/antlr/internal/InternalLettuce.g:942:1: ( ( 'signature' ) )
            // ../dk.itu.bddtransform.ui/src-gen/dk/itu/bddctransform/ui/contentassist/antlr/internal/InternalLettuce.g:943:1: ( 'signature' )
            {
            // ../dk.itu.bddtransform.ui/src-gen/dk/itu/bddctransform/ui/contentassist/antlr/internal/InternalLettuce.g:943:1: ( 'signature' )
            // ../dk.itu.bddtransform.ui/src-gen/dk/itu/bddctransform/ui/contentassist/antlr/internal/InternalLettuce.g:944:1: 'signature'
            {
             before(grammarAccess.getBehaviorAccess().getSignatureKeyword_4()); 
            match(input,15,FollowSets000.FOLLOW_15_in_rule__Behavior__Group__4__Impl1945); 
             after(grammarAccess.getBehaviorAccess().getSignatureKeyword_4()); 

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
    // $ANTLR end "rule__Behavior__Group__4__Impl"


    // $ANTLR start "rule__Behavior__Group__5"
    // ../dk.itu.bddtransform.ui/src-gen/dk/itu/bddctransform/ui/contentassist/antlr/internal/InternalLettuce.g:957:1: rule__Behavior__Group__5 : rule__Behavior__Group__5__Impl rule__Behavior__Group__6 ;
    public final void rule__Behavior__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.bddtransform.ui/src-gen/dk/itu/bddctransform/ui/contentassist/antlr/internal/InternalLettuce.g:961:1: ( rule__Behavior__Group__5__Impl rule__Behavior__Group__6 )
            // ../dk.itu.bddtransform.ui/src-gen/dk/itu/bddctransform/ui/contentassist/antlr/internal/InternalLettuce.g:962:2: rule__Behavior__Group__5__Impl rule__Behavior__Group__6
            {
            pushFollow(FollowSets000.FOLLOW_rule__Behavior__Group__5__Impl_in_rule__Behavior__Group__51976);
            rule__Behavior__Group__5__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Behavior__Group__6_in_rule__Behavior__Group__51979);
            rule__Behavior__Group__6();

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
    // $ANTLR end "rule__Behavior__Group__5"


    // $ANTLR start "rule__Behavior__Group__5__Impl"
    // ../dk.itu.bddtransform.ui/src-gen/dk/itu/bddctransform/ui/contentassist/antlr/internal/InternalLettuce.g:969:1: rule__Behavior__Group__5__Impl : ( ( rule__Behavior__SignatureAssignment_5 ) ) ;
    public final void rule__Behavior__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.bddtransform.ui/src-gen/dk/itu/bddctransform/ui/contentassist/antlr/internal/InternalLettuce.g:973:1: ( ( ( rule__Behavior__SignatureAssignment_5 ) ) )
            // ../dk.itu.bddtransform.ui/src-gen/dk/itu/bddctransform/ui/contentassist/antlr/internal/InternalLettuce.g:974:1: ( ( rule__Behavior__SignatureAssignment_5 ) )
            {
            // ../dk.itu.bddtransform.ui/src-gen/dk/itu/bddctransform/ui/contentassist/antlr/internal/InternalLettuce.g:974:1: ( ( rule__Behavior__SignatureAssignment_5 ) )
            // ../dk.itu.bddtransform.ui/src-gen/dk/itu/bddctransform/ui/contentassist/antlr/internal/InternalLettuce.g:975:1: ( rule__Behavior__SignatureAssignment_5 )
            {
             before(grammarAccess.getBehaviorAccess().getSignatureAssignment_5()); 
            // ../dk.itu.bddtransform.ui/src-gen/dk/itu/bddctransform/ui/contentassist/antlr/internal/InternalLettuce.g:976:1: ( rule__Behavior__SignatureAssignment_5 )
            // ../dk.itu.bddtransform.ui/src-gen/dk/itu/bddctransform/ui/contentassist/antlr/internal/InternalLettuce.g:976:2: rule__Behavior__SignatureAssignment_5
            {
            pushFollow(FollowSets000.FOLLOW_rule__Behavior__SignatureAssignment_5_in_rule__Behavior__Group__5__Impl2006);
            rule__Behavior__SignatureAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getBehaviorAccess().getSignatureAssignment_5()); 

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
    // $ANTLR end "rule__Behavior__Group__5__Impl"


    // $ANTLR start "rule__Behavior__Group__6"
    // ../dk.itu.bddtransform.ui/src-gen/dk/itu/bddctransform/ui/contentassist/antlr/internal/InternalLettuce.g:986:1: rule__Behavior__Group__6 : rule__Behavior__Group__6__Impl ;
    public final void rule__Behavior__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.bddtransform.ui/src-gen/dk/itu/bddctransform/ui/contentassist/antlr/internal/InternalLettuce.g:990:1: ( rule__Behavior__Group__6__Impl )
            // ../dk.itu.bddtransform.ui/src-gen/dk/itu/bddctransform/ui/contentassist/antlr/internal/InternalLettuce.g:991:2: rule__Behavior__Group__6__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Behavior__Group__6__Impl_in_rule__Behavior__Group__62036);
            rule__Behavior__Group__6__Impl();

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
    // $ANTLR end "rule__Behavior__Group__6"


    // $ANTLR start "rule__Behavior__Group__6__Impl"
    // ../dk.itu.bddtransform.ui/src-gen/dk/itu/bddctransform/ui/contentassist/antlr/internal/InternalLettuce.g:997:1: rule__Behavior__Group__6__Impl : ( 'end' ) ;
    public final void rule__Behavior__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.bddtransform.ui/src-gen/dk/itu/bddctransform/ui/contentassist/antlr/internal/InternalLettuce.g:1001:1: ( ( 'end' ) )
            // ../dk.itu.bddtransform.ui/src-gen/dk/itu/bddctransform/ui/contentassist/antlr/internal/InternalLettuce.g:1002:1: ( 'end' )
            {
            // ../dk.itu.bddtransform.ui/src-gen/dk/itu/bddctransform/ui/contentassist/antlr/internal/InternalLettuce.g:1002:1: ( 'end' )
            // ../dk.itu.bddtransform.ui/src-gen/dk/itu/bddctransform/ui/contentassist/antlr/internal/InternalLettuce.g:1003:1: 'end'
            {
             before(grammarAccess.getBehaviorAccess().getEndKeyword_6()); 
            match(input,16,FollowSets000.FOLLOW_16_in_rule__Behavior__Group__6__Impl2064); 
             after(grammarAccess.getBehaviorAccess().getEndKeyword_6()); 

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
    // $ANTLR end "rule__Behavior__Group__6__Impl"


    // $ANTLR start "rule__Rule__Group__0"
    // ../dk.itu.bddtransform.ui/src-gen/dk/itu/bddctransform/ui/contentassist/antlr/internal/InternalLettuce.g:1030:1: rule__Rule__Group__0 : rule__Rule__Group__0__Impl rule__Rule__Group__1 ;
    public final void rule__Rule__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.bddtransform.ui/src-gen/dk/itu/bddctransform/ui/contentassist/antlr/internal/InternalLettuce.g:1034:1: ( rule__Rule__Group__0__Impl rule__Rule__Group__1 )
            // ../dk.itu.bddtransform.ui/src-gen/dk/itu/bddctransform/ui/contentassist/antlr/internal/InternalLettuce.g:1035:2: rule__Rule__Group__0__Impl rule__Rule__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Rule__Group__0__Impl_in_rule__Rule__Group__02109);
            rule__Rule__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Rule__Group__1_in_rule__Rule__Group__02112);
            rule__Rule__Group__1();

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
    // $ANTLR end "rule__Rule__Group__0"


    // $ANTLR start "rule__Rule__Group__0__Impl"
    // ../dk.itu.bddtransform.ui/src-gen/dk/itu/bddctransform/ui/contentassist/antlr/internal/InternalLettuce.g:1042:1: rule__Rule__Group__0__Impl : ( 'rule' ) ;
    public final void rule__Rule__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.bddtransform.ui/src-gen/dk/itu/bddctransform/ui/contentassist/antlr/internal/InternalLettuce.g:1046:1: ( ( 'rule' ) )
            // ../dk.itu.bddtransform.ui/src-gen/dk/itu/bddctransform/ui/contentassist/antlr/internal/InternalLettuce.g:1047:1: ( 'rule' )
            {
            // ../dk.itu.bddtransform.ui/src-gen/dk/itu/bddctransform/ui/contentassist/antlr/internal/InternalLettuce.g:1047:1: ( 'rule' )
            // ../dk.itu.bddtransform.ui/src-gen/dk/itu/bddctransform/ui/contentassist/antlr/internal/InternalLettuce.g:1048:1: 'rule'
            {
             before(grammarAccess.getRuleAccess().getRuleKeyword_0()); 
            match(input,17,FollowSets000.FOLLOW_17_in_rule__Rule__Group__0__Impl2140); 
             after(grammarAccess.getRuleAccess().getRuleKeyword_0()); 

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
    // $ANTLR end "rule__Rule__Group__0__Impl"


    // $ANTLR start "rule__Rule__Group__1"
    // ../dk.itu.bddtransform.ui/src-gen/dk/itu/bddctransform/ui/contentassist/antlr/internal/InternalLettuce.g:1061:1: rule__Rule__Group__1 : rule__Rule__Group__1__Impl rule__Rule__Group__2 ;
    public final void rule__Rule__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.bddtransform.ui/src-gen/dk/itu/bddctransform/ui/contentassist/antlr/internal/InternalLettuce.g:1065:1: ( rule__Rule__Group__1__Impl rule__Rule__Group__2 )
            // ../dk.itu.bddtransform.ui/src-gen/dk/itu/bddctransform/ui/contentassist/antlr/internal/InternalLettuce.g:1066:2: rule__Rule__Group__1__Impl rule__Rule__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Rule__Group__1__Impl_in_rule__Rule__Group__12171);
            rule__Rule__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Rule__Group__2_in_rule__Rule__Group__12174);
            rule__Rule__Group__2();

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
    // $ANTLR end "rule__Rule__Group__1"


    // $ANTLR start "rule__Rule__Group__1__Impl"
    // ../dk.itu.bddtransform.ui/src-gen/dk/itu/bddctransform/ui/contentassist/antlr/internal/InternalLettuce.g:1073:1: rule__Rule__Group__1__Impl : ( ( rule__Rule__NameAssignment_1 ) ) ;
    public final void rule__Rule__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.bddtransform.ui/src-gen/dk/itu/bddctransform/ui/contentassist/antlr/internal/InternalLettuce.g:1077:1: ( ( ( rule__Rule__NameAssignment_1 ) ) )
            // ../dk.itu.bddtransform.ui/src-gen/dk/itu/bddctransform/ui/contentassist/antlr/internal/InternalLettuce.g:1078:1: ( ( rule__Rule__NameAssignment_1 ) )
            {
            // ../dk.itu.bddtransform.ui/src-gen/dk/itu/bddctransform/ui/contentassist/antlr/internal/InternalLettuce.g:1078:1: ( ( rule__Rule__NameAssignment_1 ) )
            // ../dk.itu.bddtransform.ui/src-gen/dk/itu/bddctransform/ui/contentassist/antlr/internal/InternalLettuce.g:1079:1: ( rule__Rule__NameAssignment_1 )
            {
             before(grammarAccess.getRuleAccess().getNameAssignment_1()); 
            // ../dk.itu.bddtransform.ui/src-gen/dk/itu/bddctransform/ui/contentassist/antlr/internal/InternalLettuce.g:1080:1: ( rule__Rule__NameAssignment_1 )
            // ../dk.itu.bddtransform.ui/src-gen/dk/itu/bddctransform/ui/contentassist/antlr/internal/InternalLettuce.g:1080:2: rule__Rule__NameAssignment_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Rule__NameAssignment_1_in_rule__Rule__Group__1__Impl2201);
            rule__Rule__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getRuleAccess().getNameAssignment_1()); 

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
    // $ANTLR end "rule__Rule__Group__1__Impl"


    // $ANTLR start "rule__Rule__Group__2"
    // ../dk.itu.bddtransform.ui/src-gen/dk/itu/bddctransform/ui/contentassist/antlr/internal/InternalLettuce.g:1090:1: rule__Rule__Group__2 : rule__Rule__Group__2__Impl rule__Rule__Group__3 ;
    public final void rule__Rule__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.bddtransform.ui/src-gen/dk/itu/bddctransform/ui/contentassist/antlr/internal/InternalLettuce.g:1094:1: ( rule__Rule__Group__2__Impl rule__Rule__Group__3 )
            // ../dk.itu.bddtransform.ui/src-gen/dk/itu/bddctransform/ui/contentassist/antlr/internal/InternalLettuce.g:1095:2: rule__Rule__Group__2__Impl rule__Rule__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__Rule__Group__2__Impl_in_rule__Rule__Group__22231);
            rule__Rule__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Rule__Group__3_in_rule__Rule__Group__22234);
            rule__Rule__Group__3();

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
    // $ANTLR end "rule__Rule__Group__2"


    // $ANTLR start "rule__Rule__Group__2__Impl"
    // ../dk.itu.bddtransform.ui/src-gen/dk/itu/bddctransform/ui/contentassist/antlr/internal/InternalLettuce.g:1102:1: rule__Rule__Group__2__Impl : ( ( rule__Rule__PatternsAssignment_2 ) ) ;
    public final void rule__Rule__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.bddtransform.ui/src-gen/dk/itu/bddctransform/ui/contentassist/antlr/internal/InternalLettuce.g:1106:1: ( ( ( rule__Rule__PatternsAssignment_2 ) ) )
            // ../dk.itu.bddtransform.ui/src-gen/dk/itu/bddctransform/ui/contentassist/antlr/internal/InternalLettuce.g:1107:1: ( ( rule__Rule__PatternsAssignment_2 ) )
            {
            // ../dk.itu.bddtransform.ui/src-gen/dk/itu/bddctransform/ui/contentassist/antlr/internal/InternalLettuce.g:1107:1: ( ( rule__Rule__PatternsAssignment_2 ) )
            // ../dk.itu.bddtransform.ui/src-gen/dk/itu/bddctransform/ui/contentassist/antlr/internal/InternalLettuce.g:1108:1: ( rule__Rule__PatternsAssignment_2 )
            {
             before(grammarAccess.getRuleAccess().getPatternsAssignment_2()); 
            // ../dk.itu.bddtransform.ui/src-gen/dk/itu/bddctransform/ui/contentassist/antlr/internal/InternalLettuce.g:1109:1: ( rule__Rule__PatternsAssignment_2 )
            // ../dk.itu.bddtransform.ui/src-gen/dk/itu/bddctransform/ui/contentassist/antlr/internal/InternalLettuce.g:1109:2: rule__Rule__PatternsAssignment_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Rule__PatternsAssignment_2_in_rule__Rule__Group__2__Impl2261);
            rule__Rule__PatternsAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getRuleAccess().getPatternsAssignment_2()); 

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
    // $ANTLR end "rule__Rule__Group__2__Impl"


    // $ANTLR start "rule__Rule__Group__3"
    // ../dk.itu.bddtransform.ui/src-gen/dk/itu/bddctransform/ui/contentassist/antlr/internal/InternalLettuce.g:1119:1: rule__Rule__Group__3 : rule__Rule__Group__3__Impl rule__Rule__Group__4 ;
    public final void rule__Rule__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.bddtransform.ui/src-gen/dk/itu/bddctransform/ui/contentassist/antlr/internal/InternalLettuce.g:1123:1: ( rule__Rule__Group__3__Impl rule__Rule__Group__4 )
            // ../dk.itu.bddtransform.ui/src-gen/dk/itu/bddctransform/ui/contentassist/antlr/internal/InternalLettuce.g:1124:2: rule__Rule__Group__3__Impl rule__Rule__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__Rule__Group__3__Impl_in_rule__Rule__Group__32291);
            rule__Rule__Group__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Rule__Group__4_in_rule__Rule__Group__32294);
            rule__Rule__Group__4();

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
    // $ANTLR end "rule__Rule__Group__3"


    // $ANTLR start "rule__Rule__Group__3__Impl"
    // ../dk.itu.bddtransform.ui/src-gen/dk/itu/bddctransform/ui/contentassist/antlr/internal/InternalLettuce.g:1131:1: rule__Rule__Group__3__Impl : ( ( rule__Rule__PatternsAssignment_3 )* ) ;
    public final void rule__Rule__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.bddtransform.ui/src-gen/dk/itu/bddctransform/ui/contentassist/antlr/internal/InternalLettuce.g:1135:1: ( ( ( rule__Rule__PatternsAssignment_3 )* ) )
            // ../dk.itu.bddtransform.ui/src-gen/dk/itu/bddctransform/ui/contentassist/antlr/internal/InternalLettuce.g:1136:1: ( ( rule__Rule__PatternsAssignment_3 )* )
            {
            // ../dk.itu.bddtransform.ui/src-gen/dk/itu/bddctransform/ui/contentassist/antlr/internal/InternalLettuce.g:1136:1: ( ( rule__Rule__PatternsAssignment_3 )* )
            // ../dk.itu.bddtransform.ui/src-gen/dk/itu/bddctransform/ui/contentassist/antlr/internal/InternalLettuce.g:1137:1: ( rule__Rule__PatternsAssignment_3 )*
            {
             before(grammarAccess.getRuleAccess().getPatternsAssignment_3()); 
            // ../dk.itu.bddtransform.ui/src-gen/dk/itu/bddctransform/ui/contentassist/antlr/internal/InternalLettuce.g:1138:1: ( rule__Rule__PatternsAssignment_3 )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( ((LA7_0>=RULE_ID && LA7_0<=RULE_STRING)||(LA7_0>=18 && LA7_0<=19)||LA7_0==22) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // ../dk.itu.bddtransform.ui/src-gen/dk/itu/bddctransform/ui/contentassist/antlr/internal/InternalLettuce.g:1138:2: rule__Rule__PatternsAssignment_3
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__Rule__PatternsAssignment_3_in_rule__Rule__Group__3__Impl2321);
            	    rule__Rule__PatternsAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

             after(grammarAccess.getRuleAccess().getPatternsAssignment_3()); 

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
    // $ANTLR end "rule__Rule__Group__3__Impl"


    // $ANTLR start "rule__Rule__Group__4"
    // ../dk.itu.bddtransform.ui/src-gen/dk/itu/bddctransform/ui/contentassist/antlr/internal/InternalLettuce.g:1148:1: rule__Rule__Group__4 : rule__Rule__Group__4__Impl rule__Rule__Group__5 ;
    public final void rule__Rule__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.bddtransform.ui/src-gen/dk/itu/bddctransform/ui/contentassist/antlr/internal/InternalLettuce.g:1152:1: ( rule__Rule__Group__4__Impl rule__Rule__Group__5 )
            // ../dk.itu.bddtransform.ui/src-gen/dk/itu/bddctransform/ui/contentassist/antlr/internal/InternalLettuce.g:1153:2: rule__Rule__Group__4__Impl rule__Rule__Group__5
            {
            pushFollow(FollowSets000.FOLLOW_rule__Rule__Group__4__Impl_in_rule__Rule__Group__42352);
            rule__Rule__Group__4__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Rule__Group__5_in_rule__Rule__Group__42355);
            rule__Rule__Group__5();

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
    // $ANTLR end "rule__Rule__Group__4"


    // $ANTLR start "rule__Rule__Group__4__Impl"
    // ../dk.itu.bddtransform.ui/src-gen/dk/itu/bddctransform/ui/contentassist/antlr/internal/InternalLettuce.g:1160:1: rule__Rule__Group__4__Impl : ( ( rule__Rule__TransformationAssignment_4 ) ) ;
    public final void rule__Rule__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.bddtransform.ui/src-gen/dk/itu/bddctransform/ui/contentassist/antlr/internal/InternalLettuce.g:1164:1: ( ( ( rule__Rule__TransformationAssignment_4 ) ) )
            // ../dk.itu.bddtransform.ui/src-gen/dk/itu/bddctransform/ui/contentassist/antlr/internal/InternalLettuce.g:1165:1: ( ( rule__Rule__TransformationAssignment_4 ) )
            {
            // ../dk.itu.bddtransform.ui/src-gen/dk/itu/bddctransform/ui/contentassist/antlr/internal/InternalLettuce.g:1165:1: ( ( rule__Rule__TransformationAssignment_4 ) )
            // ../dk.itu.bddtransform.ui/src-gen/dk/itu/bddctransform/ui/contentassist/antlr/internal/InternalLettuce.g:1166:1: ( rule__Rule__TransformationAssignment_4 )
            {
             before(grammarAccess.getRuleAccess().getTransformationAssignment_4()); 
            // ../dk.itu.bddtransform.ui/src-gen/dk/itu/bddctransform/ui/contentassist/antlr/internal/InternalLettuce.g:1167:1: ( rule__Rule__TransformationAssignment_4 )
            // ../dk.itu.bddtransform.ui/src-gen/dk/itu/bddctransform/ui/contentassist/antlr/internal/InternalLettuce.g:1167:2: rule__Rule__TransformationAssignment_4
            {
            pushFollow(FollowSets000.FOLLOW_rule__Rule__TransformationAssignment_4_in_rule__Rule__Group__4__Impl2382);
            rule__Rule__TransformationAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getRuleAccess().getTransformationAssignment_4()); 

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
    // $ANTLR end "rule__Rule__Group__4__Impl"


    // $ANTLR start "rule__Rule__Group__5"
    // ../dk.itu.bddtransform.ui/src-gen/dk/itu/bddctransform/ui/contentassist/antlr/internal/InternalLettuce.g:1177:1: rule__Rule__Group__5 : rule__Rule__Group__5__Impl ;
    public final void rule__Rule__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.bddtransform.ui/src-gen/dk/itu/bddctransform/ui/contentassist/antlr/internal/InternalLettuce.g:1181:1: ( rule__Rule__Group__5__Impl )
            // ../dk.itu.bddtransform.ui/src-gen/dk/itu/bddctransform/ui/contentassist/antlr/internal/InternalLettuce.g:1182:2: rule__Rule__Group__5__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Rule__Group__5__Impl_in_rule__Rule__Group__52412);
            rule__Rule__Group__5__Impl();

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
    // $ANTLR end "rule__Rule__Group__5"


    // $ANTLR start "rule__Rule__Group__5__Impl"
    // ../dk.itu.bddtransform.ui/src-gen/dk/itu/bddctransform/ui/contentassist/antlr/internal/InternalLettuce.g:1188:1: rule__Rule__Group__5__Impl : ( 'end' ) ;
    public final void rule__Rule__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.bddtransform.ui/src-gen/dk/itu/bddctransform/ui/contentassist/antlr/internal/InternalLettuce.g:1192:1: ( ( 'end' ) )
            // ../dk.itu.bddtransform.ui/src-gen/dk/itu/bddctransform/ui/contentassist/antlr/internal/InternalLettuce.g:1193:1: ( 'end' )
            {
            // ../dk.itu.bddtransform.ui/src-gen/dk/itu/bddctransform/ui/contentassist/antlr/internal/InternalLettuce.g:1193:1: ( 'end' )
            // ../dk.itu.bddtransform.ui/src-gen/dk/itu/bddctransform/ui/contentassist/antlr/internal/InternalLettuce.g:1194:1: 'end'
            {
             before(grammarAccess.getRuleAccess().getEndKeyword_5()); 
            match(input,16,FollowSets000.FOLLOW_16_in_rule__Rule__Group__5__Impl2440); 
             after(grammarAccess.getRuleAccess().getEndKeyword_5()); 

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
    // $ANTLR end "rule__Rule__Group__5__Impl"


    // $ANTLR start "rule__VariableId__Group__0"
    // ../dk.itu.bddtransform.ui/src-gen/dk/itu/bddctransform/ui/contentassist/antlr/internal/InternalLettuce.g:1219:1: rule__VariableId__Group__0 : rule__VariableId__Group__0__Impl rule__VariableId__Group__1 ;
    public final void rule__VariableId__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.bddtransform.ui/src-gen/dk/itu/bddctransform/ui/contentassist/antlr/internal/InternalLettuce.g:1223:1: ( rule__VariableId__Group__0__Impl rule__VariableId__Group__1 )
            // ../dk.itu.bddtransform.ui/src-gen/dk/itu/bddctransform/ui/contentassist/antlr/internal/InternalLettuce.g:1224:2: rule__VariableId__Group__0__Impl rule__VariableId__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__VariableId__Group__0__Impl_in_rule__VariableId__Group__02483);
            rule__VariableId__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__VariableId__Group__1_in_rule__VariableId__Group__02486);
            rule__VariableId__Group__1();

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
    // $ANTLR end "rule__VariableId__Group__0"


    // $ANTLR start "rule__VariableId__Group__0__Impl"
    // ../dk.itu.bddtransform.ui/src-gen/dk/itu/bddctransform/ui/contentassist/antlr/internal/InternalLettuce.g:1231:1: rule__VariableId__Group__0__Impl : ( '$' ) ;
    public final void rule__VariableId__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.bddtransform.ui/src-gen/dk/itu/bddctransform/ui/contentassist/antlr/internal/InternalLettuce.g:1235:1: ( ( '$' ) )
            // ../dk.itu.bddtransform.ui/src-gen/dk/itu/bddctransform/ui/contentassist/antlr/internal/InternalLettuce.g:1236:1: ( '$' )
            {
            // ../dk.itu.bddtransform.ui/src-gen/dk/itu/bddctransform/ui/contentassist/antlr/internal/InternalLettuce.g:1236:1: ( '$' )
            // ../dk.itu.bddtransform.ui/src-gen/dk/itu/bddctransform/ui/contentassist/antlr/internal/InternalLettuce.g:1237:1: '$'
            {
             before(grammarAccess.getVariableIdAccess().getDollarSignKeyword_0()); 
            match(input,18,FollowSets000.FOLLOW_18_in_rule__VariableId__Group__0__Impl2514); 
             after(grammarAccess.getVariableIdAccess().getDollarSignKeyword_0()); 

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
    // $ANTLR end "rule__VariableId__Group__0__Impl"


    // $ANTLR start "rule__VariableId__Group__1"
    // ../dk.itu.bddtransform.ui/src-gen/dk/itu/bddctransform/ui/contentassist/antlr/internal/InternalLettuce.g:1250:1: rule__VariableId__Group__1 : rule__VariableId__Group__1__Impl ;
    public final void rule__VariableId__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.bddtransform.ui/src-gen/dk/itu/bddctransform/ui/contentassist/antlr/internal/InternalLettuce.g:1254:1: ( rule__VariableId__Group__1__Impl )
            // ../dk.itu.bddtransform.ui/src-gen/dk/itu/bddctransform/ui/contentassist/antlr/internal/InternalLettuce.g:1255:2: rule__VariableId__Group__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__VariableId__Group__1__Impl_in_rule__VariableId__Group__12545);
            rule__VariableId__Group__1__Impl();

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
    // $ANTLR end "rule__VariableId__Group__1"


    // $ANTLR start "rule__VariableId__Group__1__Impl"
    // ../dk.itu.bddtransform.ui/src-gen/dk/itu/bddctransform/ui/contentassist/antlr/internal/InternalLettuce.g:1261:1: rule__VariableId__Group__1__Impl : ( RULE_ID ) ;
    public final void rule__VariableId__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.bddtransform.ui/src-gen/dk/itu/bddctransform/ui/contentassist/antlr/internal/InternalLettuce.g:1265:1: ( ( RULE_ID ) )
            // ../dk.itu.bddtransform.ui/src-gen/dk/itu/bddctransform/ui/contentassist/antlr/internal/InternalLettuce.g:1266:1: ( RULE_ID )
            {
            // ../dk.itu.bddtransform.ui/src-gen/dk/itu/bddctransform/ui/contentassist/antlr/internal/InternalLettuce.g:1266:1: ( RULE_ID )
            // ../dk.itu.bddtransform.ui/src-gen/dk/itu/bddctransform/ui/contentassist/antlr/internal/InternalLettuce.g:1267:1: RULE_ID
            {
             before(grammarAccess.getVariableIdAccess().getIDTerminalRuleCall_1()); 
            match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_rule__VariableId__Group__1__Impl2572); 
             after(grammarAccess.getVariableIdAccess().getIDTerminalRuleCall_1()); 

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
    // $ANTLR end "rule__VariableId__Group__1__Impl"


    // $ANTLR start "rule__Variable__Group__0"
    // ../dk.itu.bddtransform.ui/src-gen/dk/itu/bddctransform/ui/contentassist/antlr/internal/InternalLettuce.g:1282:1: rule__Variable__Group__0 : rule__Variable__Group__0__Impl rule__Variable__Group__1 ;
    public final void rule__Variable__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.bddtransform.ui/src-gen/dk/itu/bddctransform/ui/contentassist/antlr/internal/InternalLettuce.g:1286:1: ( rule__Variable__Group__0__Impl rule__Variable__Group__1 )
            // ../dk.itu.bddtransform.ui/src-gen/dk/itu/bddctransform/ui/contentassist/antlr/internal/InternalLettuce.g:1287:2: rule__Variable__Group__0__Impl rule__Variable__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Variable__Group__0__Impl_in_rule__Variable__Group__02605);
            rule__Variable__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Variable__Group__1_in_rule__Variable__Group__02608);
            rule__Variable__Group__1();

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
    // $ANTLR end "rule__Variable__Group__0"


    // $ANTLR start "rule__Variable__Group__0__Impl"
    // ../dk.itu.bddtransform.ui/src-gen/dk/itu/bddctransform/ui/contentassist/antlr/internal/InternalLettuce.g:1294:1: rule__Variable__Group__0__Impl : ( () ) ;
    public final void rule__Variable__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.bddtransform.ui/src-gen/dk/itu/bddctransform/ui/contentassist/antlr/internal/InternalLettuce.g:1298:1: ( ( () ) )
            // ../dk.itu.bddtransform.ui/src-gen/dk/itu/bddctransform/ui/contentassist/antlr/internal/InternalLettuce.g:1299:1: ( () )
            {
            // ../dk.itu.bddtransform.ui/src-gen/dk/itu/bddctransform/ui/contentassist/antlr/internal/InternalLettuce.g:1299:1: ( () )
            // ../dk.itu.bddtransform.ui/src-gen/dk/itu/bddctransform/ui/contentassist/antlr/internal/InternalLettuce.g:1300:1: ()
            {
             before(grammarAccess.getVariableAccess().getVariableAction_0()); 
            // ../dk.itu.bddtransform.ui/src-gen/dk/itu/bddctransform/ui/contentassist/antlr/internal/InternalLettuce.g:1301:1: ()
            // ../dk.itu.bddtransform.ui/src-gen/dk/itu/bddctransform/ui/contentassist/antlr/internal/InternalLettuce.g:1303:1: 
            {
            }

             after(grammarAccess.getVariableAccess().getVariableAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Variable__Group__0__Impl"


    // $ANTLR start "rule__Variable__Group__1"
    // ../dk.itu.bddtransform.ui/src-gen/dk/itu/bddctransform/ui/contentassist/antlr/internal/InternalLettuce.g:1313:1: rule__Variable__Group__1 : rule__Variable__Group__1__Impl ;
    public final void rule__Variable__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.bddtransform.ui/src-gen/dk/itu/bddctransform/ui/contentassist/antlr/internal/InternalLettuce.g:1317:1: ( rule__Variable__Group__1__Impl )
            // ../dk.itu.bddtransform.ui/src-gen/dk/itu/bddctransform/ui/contentassist/antlr/internal/InternalLettuce.g:1318:2: rule__Variable__Group__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Variable__Group__1__Impl_in_rule__Variable__Group__12666);
            rule__Variable__Group__1__Impl();

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
    // $ANTLR end "rule__Variable__Group__1"


    // $ANTLR start "rule__Variable__Group__1__Impl"
    // ../dk.itu.bddtransform.ui/src-gen/dk/itu/bddctransform/ui/contentassist/antlr/internal/InternalLettuce.g:1324:1: rule__Variable__Group__1__Impl : ( ( rule__Variable__NameAssignment_1 ) ) ;
    public final void rule__Variable__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.bddtransform.ui/src-gen/dk/itu/bddctransform/ui/contentassist/antlr/internal/InternalLettuce.g:1328:1: ( ( ( rule__Variable__NameAssignment_1 ) ) )
            // ../dk.itu.bddtransform.ui/src-gen/dk/itu/bddctransform/ui/contentassist/antlr/internal/InternalLettuce.g:1329:1: ( ( rule__Variable__NameAssignment_1 ) )
            {
            // ../dk.itu.bddtransform.ui/src-gen/dk/itu/bddctransform/ui/contentassist/antlr/internal/InternalLettuce.g:1329:1: ( ( rule__Variable__NameAssignment_1 ) )
            // ../dk.itu.bddtransform.ui/src-gen/dk/itu/bddctransform/ui/contentassist/antlr/internal/InternalLettuce.g:1330:1: ( rule__Variable__NameAssignment_1 )
            {
             before(grammarAccess.getVariableAccess().getNameAssignment_1()); 
            // ../dk.itu.bddtransform.ui/src-gen/dk/itu/bddctransform/ui/contentassist/antlr/internal/InternalLettuce.g:1331:1: ( rule__Variable__NameAssignment_1 )
            // ../dk.itu.bddtransform.ui/src-gen/dk/itu/bddctransform/ui/contentassist/antlr/internal/InternalLettuce.g:1331:2: rule__Variable__NameAssignment_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Variable__NameAssignment_1_in_rule__Variable__Group__1__Impl2693);
            rule__Variable__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getVariableAccess().getNameAssignment_1()); 

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
    // $ANTLR end "rule__Variable__Group__1__Impl"


    // $ANTLR start "rule__Alternation__Group__0"
    // ../dk.itu.bddtransform.ui/src-gen/dk/itu/bddctransform/ui/contentassist/antlr/internal/InternalLettuce.g:1345:1: rule__Alternation__Group__0 : rule__Alternation__Group__0__Impl rule__Alternation__Group__1 ;
    public final void rule__Alternation__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.bddtransform.ui/src-gen/dk/itu/bddctransform/ui/contentassist/antlr/internal/InternalLettuce.g:1349:1: ( rule__Alternation__Group__0__Impl rule__Alternation__Group__1 )
            // ../dk.itu.bddtransform.ui/src-gen/dk/itu/bddctransform/ui/contentassist/antlr/internal/InternalLettuce.g:1350:2: rule__Alternation__Group__0__Impl rule__Alternation__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Alternation__Group__0__Impl_in_rule__Alternation__Group__02727);
            rule__Alternation__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Alternation__Group__1_in_rule__Alternation__Group__02730);
            rule__Alternation__Group__1();

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
    // $ANTLR end "rule__Alternation__Group__0"


    // $ANTLR start "rule__Alternation__Group__0__Impl"
    // ../dk.itu.bddtransform.ui/src-gen/dk/itu/bddctransform/ui/contentassist/antlr/internal/InternalLettuce.g:1357:1: rule__Alternation__Group__0__Impl : ( '(' ) ;
    public final void rule__Alternation__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.bddtransform.ui/src-gen/dk/itu/bddctransform/ui/contentassist/antlr/internal/InternalLettuce.g:1361:1: ( ( '(' ) )
            // ../dk.itu.bddtransform.ui/src-gen/dk/itu/bddctransform/ui/contentassist/antlr/internal/InternalLettuce.g:1362:1: ( '(' )
            {
            // ../dk.itu.bddtransform.ui/src-gen/dk/itu/bddctransform/ui/contentassist/antlr/internal/InternalLettuce.g:1362:1: ( '(' )
            // ../dk.itu.bddtransform.ui/src-gen/dk/itu/bddctransform/ui/contentassist/antlr/internal/InternalLettuce.g:1363:1: '('
            {
             before(grammarAccess.getAlternationAccess().getLeftParenthesisKeyword_0()); 
            match(input,19,FollowSets000.FOLLOW_19_in_rule__Alternation__Group__0__Impl2758); 
             after(grammarAccess.getAlternationAccess().getLeftParenthesisKeyword_0()); 

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
    // $ANTLR end "rule__Alternation__Group__0__Impl"


    // $ANTLR start "rule__Alternation__Group__1"
    // ../dk.itu.bddtransform.ui/src-gen/dk/itu/bddctransform/ui/contentassist/antlr/internal/InternalLettuce.g:1376:1: rule__Alternation__Group__1 : rule__Alternation__Group__1__Impl rule__Alternation__Group__2 ;
    public final void rule__Alternation__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.bddtransform.ui/src-gen/dk/itu/bddctransform/ui/contentassist/antlr/internal/InternalLettuce.g:1380:1: ( rule__Alternation__Group__1__Impl rule__Alternation__Group__2 )
            // ../dk.itu.bddtransform.ui/src-gen/dk/itu/bddctransform/ui/contentassist/antlr/internal/InternalLettuce.g:1381:2: rule__Alternation__Group__1__Impl rule__Alternation__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Alternation__Group__1__Impl_in_rule__Alternation__Group__12789);
            rule__Alternation__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Alternation__Group__2_in_rule__Alternation__Group__12792);
            rule__Alternation__Group__2();

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
    // $ANTLR end "rule__Alternation__Group__1"


    // $ANTLR start "rule__Alternation__Group__1__Impl"
    // ../dk.itu.bddtransform.ui/src-gen/dk/itu/bddctransform/ui/contentassist/antlr/internal/InternalLettuce.g:1388:1: rule__Alternation__Group__1__Impl : ( ( rule__Alternation__ChoicesAssignment_1 ) ) ;
    public final void rule__Alternation__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.bddtransform.ui/src-gen/dk/itu/bddctransform/ui/contentassist/antlr/internal/InternalLettuce.g:1392:1: ( ( ( rule__Alternation__ChoicesAssignment_1 ) ) )
            // ../dk.itu.bddtransform.ui/src-gen/dk/itu/bddctransform/ui/contentassist/antlr/internal/InternalLettuce.g:1393:1: ( ( rule__Alternation__ChoicesAssignment_1 ) )
            {
            // ../dk.itu.bddtransform.ui/src-gen/dk/itu/bddctransform/ui/contentassist/antlr/internal/InternalLettuce.g:1393:1: ( ( rule__Alternation__ChoicesAssignment_1 ) )
            // ../dk.itu.bddtransform.ui/src-gen/dk/itu/bddctransform/ui/contentassist/antlr/internal/InternalLettuce.g:1394:1: ( rule__Alternation__ChoicesAssignment_1 )
            {
             before(grammarAccess.getAlternationAccess().getChoicesAssignment_1()); 
            // ../dk.itu.bddtransform.ui/src-gen/dk/itu/bddctransform/ui/contentassist/antlr/internal/InternalLettuce.g:1395:1: ( rule__Alternation__ChoicesAssignment_1 )
            // ../dk.itu.bddtransform.ui/src-gen/dk/itu/bddctransform/ui/contentassist/antlr/internal/InternalLettuce.g:1395:2: rule__Alternation__ChoicesAssignment_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Alternation__ChoicesAssignment_1_in_rule__Alternation__Group__1__Impl2819);
            rule__Alternation__ChoicesAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getAlternationAccess().getChoicesAssignment_1()); 

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
    // $ANTLR end "rule__Alternation__Group__1__Impl"


    // $ANTLR start "rule__Alternation__Group__2"
    // ../dk.itu.bddtransform.ui/src-gen/dk/itu/bddctransform/ui/contentassist/antlr/internal/InternalLettuce.g:1405:1: rule__Alternation__Group__2 : rule__Alternation__Group__2__Impl rule__Alternation__Group__3 ;
    public final void rule__Alternation__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.bddtransform.ui/src-gen/dk/itu/bddctransform/ui/contentassist/antlr/internal/InternalLettuce.g:1409:1: ( rule__Alternation__Group__2__Impl rule__Alternation__Group__3 )
            // ../dk.itu.bddtransform.ui/src-gen/dk/itu/bddctransform/ui/contentassist/antlr/internal/InternalLettuce.g:1410:2: rule__Alternation__Group__2__Impl rule__Alternation__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__Alternation__Group__2__Impl_in_rule__Alternation__Group__22849);
            rule__Alternation__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Alternation__Group__3_in_rule__Alternation__Group__22852);
            rule__Alternation__Group__3();

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
    // $ANTLR end "rule__Alternation__Group__2"


    // $ANTLR start "rule__Alternation__Group__2__Impl"
    // ../dk.itu.bddtransform.ui/src-gen/dk/itu/bddctransform/ui/contentassist/antlr/internal/InternalLettuce.g:1417:1: rule__Alternation__Group__2__Impl : ( '|' ) ;
    public final void rule__Alternation__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.bddtransform.ui/src-gen/dk/itu/bddctransform/ui/contentassist/antlr/internal/InternalLettuce.g:1421:1: ( ( '|' ) )
            // ../dk.itu.bddtransform.ui/src-gen/dk/itu/bddctransform/ui/contentassist/antlr/internal/InternalLettuce.g:1422:1: ( '|' )
            {
            // ../dk.itu.bddtransform.ui/src-gen/dk/itu/bddctransform/ui/contentassist/antlr/internal/InternalLettuce.g:1422:1: ( '|' )
            // ../dk.itu.bddtransform.ui/src-gen/dk/itu/bddctransform/ui/contentassist/antlr/internal/InternalLettuce.g:1423:1: '|'
            {
             before(grammarAccess.getAlternationAccess().getVerticalLineKeyword_2()); 
            match(input,20,FollowSets000.FOLLOW_20_in_rule__Alternation__Group__2__Impl2880); 
             after(grammarAccess.getAlternationAccess().getVerticalLineKeyword_2()); 

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
    // $ANTLR end "rule__Alternation__Group__2__Impl"


    // $ANTLR start "rule__Alternation__Group__3"
    // ../dk.itu.bddtransform.ui/src-gen/dk/itu/bddctransform/ui/contentassist/antlr/internal/InternalLettuce.g:1436:1: rule__Alternation__Group__3 : rule__Alternation__Group__3__Impl rule__Alternation__Group__4 ;
    public final void rule__Alternation__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.bddtransform.ui/src-gen/dk/itu/bddctransform/ui/contentassist/antlr/internal/InternalLettuce.g:1440:1: ( rule__Alternation__Group__3__Impl rule__Alternation__Group__4 )
            // ../dk.itu.bddtransform.ui/src-gen/dk/itu/bddctransform/ui/contentassist/antlr/internal/InternalLettuce.g:1441:2: rule__Alternation__Group__3__Impl rule__Alternation__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__Alternation__Group__3__Impl_in_rule__Alternation__Group__32911);
            rule__Alternation__Group__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Alternation__Group__4_in_rule__Alternation__Group__32914);
            rule__Alternation__Group__4();

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
    // $ANTLR end "rule__Alternation__Group__3"


    // $ANTLR start "rule__Alternation__Group__3__Impl"
    // ../dk.itu.bddtransform.ui/src-gen/dk/itu/bddctransform/ui/contentassist/antlr/internal/InternalLettuce.g:1448:1: rule__Alternation__Group__3__Impl : ( ( rule__Alternation__ChoicesAssignment_3 ) ) ;
    public final void rule__Alternation__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.bddtransform.ui/src-gen/dk/itu/bddctransform/ui/contentassist/antlr/internal/InternalLettuce.g:1452:1: ( ( ( rule__Alternation__ChoicesAssignment_3 ) ) )
            // ../dk.itu.bddtransform.ui/src-gen/dk/itu/bddctransform/ui/contentassist/antlr/internal/InternalLettuce.g:1453:1: ( ( rule__Alternation__ChoicesAssignment_3 ) )
            {
            // ../dk.itu.bddtransform.ui/src-gen/dk/itu/bddctransform/ui/contentassist/antlr/internal/InternalLettuce.g:1453:1: ( ( rule__Alternation__ChoicesAssignment_3 ) )
            // ../dk.itu.bddtransform.ui/src-gen/dk/itu/bddctransform/ui/contentassist/antlr/internal/InternalLettuce.g:1454:1: ( rule__Alternation__ChoicesAssignment_3 )
            {
             before(grammarAccess.getAlternationAccess().getChoicesAssignment_3()); 
            // ../dk.itu.bddtransform.ui/src-gen/dk/itu/bddctransform/ui/contentassist/antlr/internal/InternalLettuce.g:1455:1: ( rule__Alternation__ChoicesAssignment_3 )
            // ../dk.itu.bddtransform.ui/src-gen/dk/itu/bddctransform/ui/contentassist/antlr/internal/InternalLettuce.g:1455:2: rule__Alternation__ChoicesAssignment_3
            {
            pushFollow(FollowSets000.FOLLOW_rule__Alternation__ChoicesAssignment_3_in_rule__Alternation__Group__3__Impl2941);
            rule__Alternation__ChoicesAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getAlternationAccess().getChoicesAssignment_3()); 

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
    // $ANTLR end "rule__Alternation__Group__3__Impl"


    // $ANTLR start "rule__Alternation__Group__4"
    // ../dk.itu.bddtransform.ui/src-gen/dk/itu/bddctransform/ui/contentassist/antlr/internal/InternalLettuce.g:1465:1: rule__Alternation__Group__4 : rule__Alternation__Group__4__Impl rule__Alternation__Group__5 ;
    public final void rule__Alternation__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.bddtransform.ui/src-gen/dk/itu/bddctransform/ui/contentassist/antlr/internal/InternalLettuce.g:1469:1: ( rule__Alternation__Group__4__Impl rule__Alternation__Group__5 )
            // ../dk.itu.bddtransform.ui/src-gen/dk/itu/bddctransform/ui/contentassist/antlr/internal/InternalLettuce.g:1470:2: rule__Alternation__Group__4__Impl rule__Alternation__Group__5
            {
            pushFollow(FollowSets000.FOLLOW_rule__Alternation__Group__4__Impl_in_rule__Alternation__Group__42971);
            rule__Alternation__Group__4__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Alternation__Group__5_in_rule__Alternation__Group__42974);
            rule__Alternation__Group__5();

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
    // $ANTLR end "rule__Alternation__Group__4"


    // $ANTLR start "rule__Alternation__Group__4__Impl"
    // ../dk.itu.bddtransform.ui/src-gen/dk/itu/bddctransform/ui/contentassist/antlr/internal/InternalLettuce.g:1477:1: rule__Alternation__Group__4__Impl : ( ( rule__Alternation__Group_4__0 )* ) ;
    public final void rule__Alternation__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.bddtransform.ui/src-gen/dk/itu/bddctransform/ui/contentassist/antlr/internal/InternalLettuce.g:1481:1: ( ( ( rule__Alternation__Group_4__0 )* ) )
            // ../dk.itu.bddtransform.ui/src-gen/dk/itu/bddctransform/ui/contentassist/antlr/internal/InternalLettuce.g:1482:1: ( ( rule__Alternation__Group_4__0 )* )
            {
            // ../dk.itu.bddtransform.ui/src-gen/dk/itu/bddctransform/ui/contentassist/antlr/internal/InternalLettuce.g:1482:1: ( ( rule__Alternation__Group_4__0 )* )
            // ../dk.itu.bddtransform.ui/src-gen/dk/itu/bddctransform/ui/contentassist/antlr/internal/InternalLettuce.g:1483:1: ( rule__Alternation__Group_4__0 )*
            {
             before(grammarAccess.getAlternationAccess().getGroup_4()); 
            // ../dk.itu.bddtransform.ui/src-gen/dk/itu/bddctransform/ui/contentassist/antlr/internal/InternalLettuce.g:1484:1: ( rule__Alternation__Group_4__0 )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==20) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // ../dk.itu.bddtransform.ui/src-gen/dk/itu/bddctransform/ui/contentassist/antlr/internal/InternalLettuce.g:1484:2: rule__Alternation__Group_4__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__Alternation__Group_4__0_in_rule__Alternation__Group__4__Impl3001);
            	    rule__Alternation__Group_4__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

             after(grammarAccess.getAlternationAccess().getGroup_4()); 

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
    // $ANTLR end "rule__Alternation__Group__4__Impl"


    // $ANTLR start "rule__Alternation__Group__5"
    // ../dk.itu.bddtransform.ui/src-gen/dk/itu/bddctransform/ui/contentassist/antlr/internal/InternalLettuce.g:1494:1: rule__Alternation__Group__5 : rule__Alternation__Group__5__Impl ;
    public final void rule__Alternation__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.bddtransform.ui/src-gen/dk/itu/bddctransform/ui/contentassist/antlr/internal/InternalLettuce.g:1498:1: ( rule__Alternation__Group__5__Impl )
            // ../dk.itu.bddtransform.ui/src-gen/dk/itu/bddctransform/ui/contentassist/antlr/internal/InternalLettuce.g:1499:2: rule__Alternation__Group__5__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Alternation__Group__5__Impl_in_rule__Alternation__Group__53032);
            rule__Alternation__Group__5__Impl();

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
    // $ANTLR end "rule__Alternation__Group__5"


    // $ANTLR start "rule__Alternation__Group__5__Impl"
    // ../dk.itu.bddtransform.ui/src-gen/dk/itu/bddctransform/ui/contentassist/antlr/internal/InternalLettuce.g:1505:1: rule__Alternation__Group__5__Impl : ( ')' ) ;
    public final void rule__Alternation__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.bddtransform.ui/src-gen/dk/itu/bddctransform/ui/contentassist/antlr/internal/InternalLettuce.g:1509:1: ( ( ')' ) )
            // ../dk.itu.bddtransform.ui/src-gen/dk/itu/bddctransform/ui/contentassist/antlr/internal/InternalLettuce.g:1510:1: ( ')' )
            {
            // ../dk.itu.bddtransform.ui/src-gen/dk/itu/bddctransform/ui/contentassist/antlr/internal/InternalLettuce.g:1510:1: ( ')' )
            // ../dk.itu.bddtransform.ui/src-gen/dk/itu/bddctransform/ui/contentassist/antlr/internal/InternalLettuce.g:1511:1: ')'
            {
             before(grammarAccess.getAlternationAccess().getRightParenthesisKeyword_5()); 
            match(input,21,FollowSets000.FOLLOW_21_in_rule__Alternation__Group__5__Impl3060); 
             after(grammarAccess.getAlternationAccess().getRightParenthesisKeyword_5()); 

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
    // $ANTLR end "rule__Alternation__Group__5__Impl"


    // $ANTLR start "rule__Alternation__Group_4__0"
    // ../dk.itu.bddtransform.ui/src-gen/dk/itu/bddctransform/ui/contentassist/antlr/internal/InternalLettuce.g:1536:1: rule__Alternation__Group_4__0 : rule__Alternation__Group_4__0__Impl rule__Alternation__Group_4__1 ;
    public final void rule__Alternation__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.bddtransform.ui/src-gen/dk/itu/bddctransform/ui/contentassist/antlr/internal/InternalLettuce.g:1540:1: ( rule__Alternation__Group_4__0__Impl rule__Alternation__Group_4__1 )
            // ../dk.itu.bddtransform.ui/src-gen/dk/itu/bddctransform/ui/contentassist/antlr/internal/InternalLettuce.g:1541:2: rule__Alternation__Group_4__0__Impl rule__Alternation__Group_4__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Alternation__Group_4__0__Impl_in_rule__Alternation__Group_4__03103);
            rule__Alternation__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Alternation__Group_4__1_in_rule__Alternation__Group_4__03106);
            rule__Alternation__Group_4__1();

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
    // $ANTLR end "rule__Alternation__Group_4__0"


    // $ANTLR start "rule__Alternation__Group_4__0__Impl"
    // ../dk.itu.bddtransform.ui/src-gen/dk/itu/bddctransform/ui/contentassist/antlr/internal/InternalLettuce.g:1548:1: rule__Alternation__Group_4__0__Impl : ( '|' ) ;
    public final void rule__Alternation__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.bddtransform.ui/src-gen/dk/itu/bddctransform/ui/contentassist/antlr/internal/InternalLettuce.g:1552:1: ( ( '|' ) )
            // ../dk.itu.bddtransform.ui/src-gen/dk/itu/bddctransform/ui/contentassist/antlr/internal/InternalLettuce.g:1553:1: ( '|' )
            {
            // ../dk.itu.bddtransform.ui/src-gen/dk/itu/bddctransform/ui/contentassist/antlr/internal/InternalLettuce.g:1553:1: ( '|' )
            // ../dk.itu.bddtransform.ui/src-gen/dk/itu/bddctransform/ui/contentassist/antlr/internal/InternalLettuce.g:1554:1: '|'
            {
             before(grammarAccess.getAlternationAccess().getVerticalLineKeyword_4_0()); 
            match(input,20,FollowSets000.FOLLOW_20_in_rule__Alternation__Group_4__0__Impl3134); 
             after(grammarAccess.getAlternationAccess().getVerticalLineKeyword_4_0()); 

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
    // $ANTLR end "rule__Alternation__Group_4__0__Impl"


    // $ANTLR start "rule__Alternation__Group_4__1"
    // ../dk.itu.bddtransform.ui/src-gen/dk/itu/bddctransform/ui/contentassist/antlr/internal/InternalLettuce.g:1567:1: rule__Alternation__Group_4__1 : rule__Alternation__Group_4__1__Impl ;
    public final void rule__Alternation__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.bddtransform.ui/src-gen/dk/itu/bddctransform/ui/contentassist/antlr/internal/InternalLettuce.g:1571:1: ( rule__Alternation__Group_4__1__Impl )
            // ../dk.itu.bddtransform.ui/src-gen/dk/itu/bddctransform/ui/contentassist/antlr/internal/InternalLettuce.g:1572:2: rule__Alternation__Group_4__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Alternation__Group_4__1__Impl_in_rule__Alternation__Group_4__13165);
            rule__Alternation__Group_4__1__Impl();

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
    // $ANTLR end "rule__Alternation__Group_4__1"


    // $ANTLR start "rule__Alternation__Group_4__1__Impl"
    // ../dk.itu.bddtransform.ui/src-gen/dk/itu/bddctransform/ui/contentassist/antlr/internal/InternalLettuce.g:1578:1: rule__Alternation__Group_4__1__Impl : ( ( rule__Alternation__ChoicesAssignment_4_1 ) ) ;
    public final void rule__Alternation__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.bddtransform.ui/src-gen/dk/itu/bddctransform/ui/contentassist/antlr/internal/InternalLettuce.g:1582:1: ( ( ( rule__Alternation__ChoicesAssignment_4_1 ) ) )
            // ../dk.itu.bddtransform.ui/src-gen/dk/itu/bddctransform/ui/contentassist/antlr/internal/InternalLettuce.g:1583:1: ( ( rule__Alternation__ChoicesAssignment_4_1 ) )
            {
            // ../dk.itu.bddtransform.ui/src-gen/dk/itu/bddctransform/ui/contentassist/antlr/internal/InternalLettuce.g:1583:1: ( ( rule__Alternation__ChoicesAssignment_4_1 ) )
            // ../dk.itu.bddtransform.ui/src-gen/dk/itu/bddctransform/ui/contentassist/antlr/internal/InternalLettuce.g:1584:1: ( rule__Alternation__ChoicesAssignment_4_1 )
            {
             before(grammarAccess.getAlternationAccess().getChoicesAssignment_4_1()); 
            // ../dk.itu.bddtransform.ui/src-gen/dk/itu/bddctransform/ui/contentassist/antlr/internal/InternalLettuce.g:1585:1: ( rule__Alternation__ChoicesAssignment_4_1 )
            // ../dk.itu.bddtransform.ui/src-gen/dk/itu/bddctransform/ui/contentassist/antlr/internal/InternalLettuce.g:1585:2: rule__Alternation__ChoicesAssignment_4_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Alternation__ChoicesAssignment_4_1_in_rule__Alternation__Group_4__1__Impl3192);
            rule__Alternation__ChoicesAssignment_4_1();

            state._fsp--;


            }

             after(grammarAccess.getAlternationAccess().getChoicesAssignment_4_1()); 

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
    // $ANTLR end "rule__Alternation__Group_4__1__Impl"


    // $ANTLR start "rule__Optional__Group__0"
    // ../dk.itu.bddtransform.ui/src-gen/dk/itu/bddctransform/ui/contentassist/antlr/internal/InternalLettuce.g:1599:1: rule__Optional__Group__0 : rule__Optional__Group__0__Impl rule__Optional__Group__1 ;
    public final void rule__Optional__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.bddtransform.ui/src-gen/dk/itu/bddctransform/ui/contentassist/antlr/internal/InternalLettuce.g:1603:1: ( rule__Optional__Group__0__Impl rule__Optional__Group__1 )
            // ../dk.itu.bddtransform.ui/src-gen/dk/itu/bddctransform/ui/contentassist/antlr/internal/InternalLettuce.g:1604:2: rule__Optional__Group__0__Impl rule__Optional__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Optional__Group__0__Impl_in_rule__Optional__Group__03226);
            rule__Optional__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Optional__Group__1_in_rule__Optional__Group__03229);
            rule__Optional__Group__1();

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
    // $ANTLR end "rule__Optional__Group__0"


    // $ANTLR start "rule__Optional__Group__0__Impl"
    // ../dk.itu.bddtransform.ui/src-gen/dk/itu/bddctransform/ui/contentassist/antlr/internal/InternalLettuce.g:1611:1: rule__Optional__Group__0__Impl : ( '[' ) ;
    public final void rule__Optional__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.bddtransform.ui/src-gen/dk/itu/bddctransform/ui/contentassist/antlr/internal/InternalLettuce.g:1615:1: ( ( '[' ) )
            // ../dk.itu.bddtransform.ui/src-gen/dk/itu/bddctransform/ui/contentassist/antlr/internal/InternalLettuce.g:1616:1: ( '[' )
            {
            // ../dk.itu.bddtransform.ui/src-gen/dk/itu/bddctransform/ui/contentassist/antlr/internal/InternalLettuce.g:1616:1: ( '[' )
            // ../dk.itu.bddtransform.ui/src-gen/dk/itu/bddctransform/ui/contentassist/antlr/internal/InternalLettuce.g:1617:1: '['
            {
             before(grammarAccess.getOptionalAccess().getLeftSquareBracketKeyword_0()); 
            match(input,22,FollowSets000.FOLLOW_22_in_rule__Optional__Group__0__Impl3257); 
             after(grammarAccess.getOptionalAccess().getLeftSquareBracketKeyword_0()); 

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
    // $ANTLR end "rule__Optional__Group__0__Impl"


    // $ANTLR start "rule__Optional__Group__1"
    // ../dk.itu.bddtransform.ui/src-gen/dk/itu/bddctransform/ui/contentassist/antlr/internal/InternalLettuce.g:1630:1: rule__Optional__Group__1 : rule__Optional__Group__1__Impl rule__Optional__Group__2 ;
    public final void rule__Optional__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.bddtransform.ui/src-gen/dk/itu/bddctransform/ui/contentassist/antlr/internal/InternalLettuce.g:1634:1: ( rule__Optional__Group__1__Impl rule__Optional__Group__2 )
            // ../dk.itu.bddtransform.ui/src-gen/dk/itu/bddctransform/ui/contentassist/antlr/internal/InternalLettuce.g:1635:2: rule__Optional__Group__1__Impl rule__Optional__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Optional__Group__1__Impl_in_rule__Optional__Group__13288);
            rule__Optional__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Optional__Group__2_in_rule__Optional__Group__13291);
            rule__Optional__Group__2();

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
    // $ANTLR end "rule__Optional__Group__1"


    // $ANTLR start "rule__Optional__Group__1__Impl"
    // ../dk.itu.bddtransform.ui/src-gen/dk/itu/bddctransform/ui/contentassist/antlr/internal/InternalLettuce.g:1642:1: rule__Optional__Group__1__Impl : ( ( rule__Optional__ValueAssignment_1 ) ) ;
    public final void rule__Optional__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.bddtransform.ui/src-gen/dk/itu/bddctransform/ui/contentassist/antlr/internal/InternalLettuce.g:1646:1: ( ( ( rule__Optional__ValueAssignment_1 ) ) )
            // ../dk.itu.bddtransform.ui/src-gen/dk/itu/bddctransform/ui/contentassist/antlr/internal/InternalLettuce.g:1647:1: ( ( rule__Optional__ValueAssignment_1 ) )
            {
            // ../dk.itu.bddtransform.ui/src-gen/dk/itu/bddctransform/ui/contentassist/antlr/internal/InternalLettuce.g:1647:1: ( ( rule__Optional__ValueAssignment_1 ) )
            // ../dk.itu.bddtransform.ui/src-gen/dk/itu/bddctransform/ui/contentassist/antlr/internal/InternalLettuce.g:1648:1: ( rule__Optional__ValueAssignment_1 )
            {
             before(grammarAccess.getOptionalAccess().getValueAssignment_1()); 
            // ../dk.itu.bddtransform.ui/src-gen/dk/itu/bddctransform/ui/contentassist/antlr/internal/InternalLettuce.g:1649:1: ( rule__Optional__ValueAssignment_1 )
            // ../dk.itu.bddtransform.ui/src-gen/dk/itu/bddctransform/ui/contentassist/antlr/internal/InternalLettuce.g:1649:2: rule__Optional__ValueAssignment_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Optional__ValueAssignment_1_in_rule__Optional__Group__1__Impl3318);
            rule__Optional__ValueAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getOptionalAccess().getValueAssignment_1()); 

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
    // $ANTLR end "rule__Optional__Group__1__Impl"


    // $ANTLR start "rule__Optional__Group__2"
    // ../dk.itu.bddtransform.ui/src-gen/dk/itu/bddctransform/ui/contentassist/antlr/internal/InternalLettuce.g:1659:1: rule__Optional__Group__2 : rule__Optional__Group__2__Impl rule__Optional__Group__3 ;
    public final void rule__Optional__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.bddtransform.ui/src-gen/dk/itu/bddctransform/ui/contentassist/antlr/internal/InternalLettuce.g:1663:1: ( rule__Optional__Group__2__Impl rule__Optional__Group__3 )
            // ../dk.itu.bddtransform.ui/src-gen/dk/itu/bddctransform/ui/contentassist/antlr/internal/InternalLettuce.g:1664:2: rule__Optional__Group__2__Impl rule__Optional__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__Optional__Group__2__Impl_in_rule__Optional__Group__23348);
            rule__Optional__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Optional__Group__3_in_rule__Optional__Group__23351);
            rule__Optional__Group__3();

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
    // $ANTLR end "rule__Optional__Group__2"


    // $ANTLR start "rule__Optional__Group__2__Impl"
    // ../dk.itu.bddtransform.ui/src-gen/dk/itu/bddctransform/ui/contentassist/antlr/internal/InternalLettuce.g:1671:1: rule__Optional__Group__2__Impl : ( ( rule__Optional__ValueAssignment_2 )* ) ;
    public final void rule__Optional__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.bddtransform.ui/src-gen/dk/itu/bddctransform/ui/contentassist/antlr/internal/InternalLettuce.g:1675:1: ( ( ( rule__Optional__ValueAssignment_2 )* ) )
            // ../dk.itu.bddtransform.ui/src-gen/dk/itu/bddctransform/ui/contentassist/antlr/internal/InternalLettuce.g:1676:1: ( ( rule__Optional__ValueAssignment_2 )* )
            {
            // ../dk.itu.bddtransform.ui/src-gen/dk/itu/bddctransform/ui/contentassist/antlr/internal/InternalLettuce.g:1676:1: ( ( rule__Optional__ValueAssignment_2 )* )
            // ../dk.itu.bddtransform.ui/src-gen/dk/itu/bddctransform/ui/contentassist/antlr/internal/InternalLettuce.g:1677:1: ( rule__Optional__ValueAssignment_2 )*
            {
             before(grammarAccess.getOptionalAccess().getValueAssignment_2()); 
            // ../dk.itu.bddtransform.ui/src-gen/dk/itu/bddctransform/ui/contentassist/antlr/internal/InternalLettuce.g:1678:1: ( rule__Optional__ValueAssignment_2 )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( ((LA9_0>=RULE_ID && LA9_0<=RULE_STRING)||(LA9_0>=18 && LA9_0<=19)||LA9_0==22) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // ../dk.itu.bddtransform.ui/src-gen/dk/itu/bddctransform/ui/contentassist/antlr/internal/InternalLettuce.g:1678:2: rule__Optional__ValueAssignment_2
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__Optional__ValueAssignment_2_in_rule__Optional__Group__2__Impl3378);
            	    rule__Optional__ValueAssignment_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);

             after(grammarAccess.getOptionalAccess().getValueAssignment_2()); 

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
    // $ANTLR end "rule__Optional__Group__2__Impl"


    // $ANTLR start "rule__Optional__Group__3"
    // ../dk.itu.bddtransform.ui/src-gen/dk/itu/bddctransform/ui/contentassist/antlr/internal/InternalLettuce.g:1688:1: rule__Optional__Group__3 : rule__Optional__Group__3__Impl ;
    public final void rule__Optional__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.bddtransform.ui/src-gen/dk/itu/bddctransform/ui/contentassist/antlr/internal/InternalLettuce.g:1692:1: ( rule__Optional__Group__3__Impl )
            // ../dk.itu.bddtransform.ui/src-gen/dk/itu/bddctransform/ui/contentassist/antlr/internal/InternalLettuce.g:1693:2: rule__Optional__Group__3__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Optional__Group__3__Impl_in_rule__Optional__Group__33409);
            rule__Optional__Group__3__Impl();

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
    // $ANTLR end "rule__Optional__Group__3"


    // $ANTLR start "rule__Optional__Group__3__Impl"
    // ../dk.itu.bddtransform.ui/src-gen/dk/itu/bddctransform/ui/contentassist/antlr/internal/InternalLettuce.g:1699:1: rule__Optional__Group__3__Impl : ( ']' ) ;
    public final void rule__Optional__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.bddtransform.ui/src-gen/dk/itu/bddctransform/ui/contentassist/antlr/internal/InternalLettuce.g:1703:1: ( ( ']' ) )
            // ../dk.itu.bddtransform.ui/src-gen/dk/itu/bddctransform/ui/contentassist/antlr/internal/InternalLettuce.g:1704:1: ( ']' )
            {
            // ../dk.itu.bddtransform.ui/src-gen/dk/itu/bddctransform/ui/contentassist/antlr/internal/InternalLettuce.g:1704:1: ( ']' )
            // ../dk.itu.bddtransform.ui/src-gen/dk/itu/bddctransform/ui/contentassist/antlr/internal/InternalLettuce.g:1705:1: ']'
            {
             before(grammarAccess.getOptionalAccess().getRightSquareBracketKeyword_3()); 
            match(input,23,FollowSets000.FOLLOW_23_in_rule__Optional__Group__3__Impl3437); 
             after(grammarAccess.getOptionalAccess().getRightSquareBracketKeyword_3()); 

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
    // $ANTLR end "rule__Optional__Group__3__Impl"


    // $ANTLR start "rule__Expression__Group__0"
    // ../dk.itu.bddtransform.ui/src-gen/dk/itu/bddctransform/ui/contentassist/antlr/internal/InternalLettuce.g:1726:1: rule__Expression__Group__0 : rule__Expression__Group__0__Impl rule__Expression__Group__1 ;
    public final void rule__Expression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.bddtransform.ui/src-gen/dk/itu/bddctransform/ui/contentassist/antlr/internal/InternalLettuce.g:1730:1: ( rule__Expression__Group__0__Impl rule__Expression__Group__1 )
            // ../dk.itu.bddtransform.ui/src-gen/dk/itu/bddctransform/ui/contentassist/antlr/internal/InternalLettuce.g:1731:2: rule__Expression__Group__0__Impl rule__Expression__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Expression__Group__0__Impl_in_rule__Expression__Group__03476);
            rule__Expression__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Expression__Group__1_in_rule__Expression__Group__03479);
            rule__Expression__Group__1();

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
    // $ANTLR end "rule__Expression__Group__0"


    // $ANTLR start "rule__Expression__Group__0__Impl"
    // ../dk.itu.bddtransform.ui/src-gen/dk/itu/bddctransform/ui/contentassist/antlr/internal/InternalLettuce.g:1738:1: rule__Expression__Group__0__Impl : ( 'expr' ) ;
    public final void rule__Expression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.bddtransform.ui/src-gen/dk/itu/bddctransform/ui/contentassist/antlr/internal/InternalLettuce.g:1742:1: ( ( 'expr' ) )
            // ../dk.itu.bddtransform.ui/src-gen/dk/itu/bddctransform/ui/contentassist/antlr/internal/InternalLettuce.g:1743:1: ( 'expr' )
            {
            // ../dk.itu.bddtransform.ui/src-gen/dk/itu/bddctransform/ui/contentassist/antlr/internal/InternalLettuce.g:1743:1: ( 'expr' )
            // ../dk.itu.bddtransform.ui/src-gen/dk/itu/bddctransform/ui/contentassist/antlr/internal/InternalLettuce.g:1744:1: 'expr'
            {
             before(grammarAccess.getExpressionAccess().getExprKeyword_0()); 
            match(input,24,FollowSets000.FOLLOW_24_in_rule__Expression__Group__0__Impl3507); 
             after(grammarAccess.getExpressionAccess().getExprKeyword_0()); 

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
    // $ANTLR end "rule__Expression__Group__0__Impl"


    // $ANTLR start "rule__Expression__Group__1"
    // ../dk.itu.bddtransform.ui/src-gen/dk/itu/bddctransform/ui/contentassist/antlr/internal/InternalLettuce.g:1757:1: rule__Expression__Group__1 : rule__Expression__Group__1__Impl ;
    public final void rule__Expression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.bddtransform.ui/src-gen/dk/itu/bddctransform/ui/contentassist/antlr/internal/InternalLettuce.g:1761:1: ( rule__Expression__Group__1__Impl )
            // ../dk.itu.bddtransform.ui/src-gen/dk/itu/bddctransform/ui/contentassist/antlr/internal/InternalLettuce.g:1762:2: rule__Expression__Group__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Expression__Group__1__Impl_in_rule__Expression__Group__13538);
            rule__Expression__Group__1__Impl();

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
    // $ANTLR end "rule__Expression__Group__1"


    // $ANTLR start "rule__Expression__Group__1__Impl"
    // ../dk.itu.bddtransform.ui/src-gen/dk/itu/bddctransform/ui/contentassist/antlr/internal/InternalLettuce.g:1768:1: rule__Expression__Group__1__Impl : ( ( rule__Expression__ValueAssignment_1 ) ) ;
    public final void rule__Expression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.bddtransform.ui/src-gen/dk/itu/bddctransform/ui/contentassist/antlr/internal/InternalLettuce.g:1772:1: ( ( ( rule__Expression__ValueAssignment_1 ) ) )
            // ../dk.itu.bddtransform.ui/src-gen/dk/itu/bddctransform/ui/contentassist/antlr/internal/InternalLettuce.g:1773:1: ( ( rule__Expression__ValueAssignment_1 ) )
            {
            // ../dk.itu.bddtransform.ui/src-gen/dk/itu/bddctransform/ui/contentassist/antlr/internal/InternalLettuce.g:1773:1: ( ( rule__Expression__ValueAssignment_1 ) )
            // ../dk.itu.bddtransform.ui/src-gen/dk/itu/bddctransform/ui/contentassist/antlr/internal/InternalLettuce.g:1774:1: ( rule__Expression__ValueAssignment_1 )
            {
             before(grammarAccess.getExpressionAccess().getValueAssignment_1()); 
            // ../dk.itu.bddtransform.ui/src-gen/dk/itu/bddctransform/ui/contentassist/antlr/internal/InternalLettuce.g:1775:1: ( rule__Expression__ValueAssignment_1 )
            // ../dk.itu.bddtransform.ui/src-gen/dk/itu/bddctransform/ui/contentassist/antlr/internal/InternalLettuce.g:1775:2: rule__Expression__ValueAssignment_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Expression__ValueAssignment_1_in_rule__Expression__Group__1__Impl3565);
            rule__Expression__ValueAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getExpressionAccess().getValueAssignment_1()); 

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
    // $ANTLR end "rule__Expression__Group__1__Impl"


    // $ANTLR start "rule__IfDef__Group__0"
    // ../dk.itu.bddtransform.ui/src-gen/dk/itu/bddctransform/ui/contentassist/antlr/internal/InternalLettuce.g:1789:1: rule__IfDef__Group__0 : rule__IfDef__Group__0__Impl rule__IfDef__Group__1 ;
    public final void rule__IfDef__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.bddtransform.ui/src-gen/dk/itu/bddctransform/ui/contentassist/antlr/internal/InternalLettuce.g:1793:1: ( rule__IfDef__Group__0__Impl rule__IfDef__Group__1 )
            // ../dk.itu.bddtransform.ui/src-gen/dk/itu/bddctransform/ui/contentassist/antlr/internal/InternalLettuce.g:1794:2: rule__IfDef__Group__0__Impl rule__IfDef__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__IfDef__Group__0__Impl_in_rule__IfDef__Group__03599);
            rule__IfDef__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__IfDef__Group__1_in_rule__IfDef__Group__03602);
            rule__IfDef__Group__1();

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
    // $ANTLR end "rule__IfDef__Group__0"


    // $ANTLR start "rule__IfDef__Group__0__Impl"
    // ../dk.itu.bddtransform.ui/src-gen/dk/itu/bddctransform/ui/contentassist/antlr/internal/InternalLettuce.g:1801:1: rule__IfDef__Group__0__Impl : ( 'if' ) ;
    public final void rule__IfDef__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.bddtransform.ui/src-gen/dk/itu/bddctransform/ui/contentassist/antlr/internal/InternalLettuce.g:1805:1: ( ( 'if' ) )
            // ../dk.itu.bddtransform.ui/src-gen/dk/itu/bddctransform/ui/contentassist/antlr/internal/InternalLettuce.g:1806:1: ( 'if' )
            {
            // ../dk.itu.bddtransform.ui/src-gen/dk/itu/bddctransform/ui/contentassist/antlr/internal/InternalLettuce.g:1806:1: ( 'if' )
            // ../dk.itu.bddtransform.ui/src-gen/dk/itu/bddctransform/ui/contentassist/antlr/internal/InternalLettuce.g:1807:1: 'if'
            {
             before(grammarAccess.getIfDefAccess().getIfKeyword_0()); 
            match(input,25,FollowSets000.FOLLOW_25_in_rule__IfDef__Group__0__Impl3630); 
             after(grammarAccess.getIfDefAccess().getIfKeyword_0()); 

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
    // $ANTLR end "rule__IfDef__Group__0__Impl"


    // $ANTLR start "rule__IfDef__Group__1"
    // ../dk.itu.bddtransform.ui/src-gen/dk/itu/bddctransform/ui/contentassist/antlr/internal/InternalLettuce.g:1820:1: rule__IfDef__Group__1 : rule__IfDef__Group__1__Impl rule__IfDef__Group__2 ;
    public final void rule__IfDef__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.bddtransform.ui/src-gen/dk/itu/bddctransform/ui/contentassist/antlr/internal/InternalLettuce.g:1824:1: ( rule__IfDef__Group__1__Impl rule__IfDef__Group__2 )
            // ../dk.itu.bddtransform.ui/src-gen/dk/itu/bddctransform/ui/contentassist/antlr/internal/InternalLettuce.g:1825:2: rule__IfDef__Group__1__Impl rule__IfDef__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__IfDef__Group__1__Impl_in_rule__IfDef__Group__13661);
            rule__IfDef__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__IfDef__Group__2_in_rule__IfDef__Group__13664);
            rule__IfDef__Group__2();

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
    // $ANTLR end "rule__IfDef__Group__1"


    // $ANTLR start "rule__IfDef__Group__1__Impl"
    // ../dk.itu.bddtransform.ui/src-gen/dk/itu/bddctransform/ui/contentassist/antlr/internal/InternalLettuce.g:1832:1: rule__IfDef__Group__1__Impl : ( 'def?' ) ;
    public final void rule__IfDef__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.bddtransform.ui/src-gen/dk/itu/bddctransform/ui/contentassist/antlr/internal/InternalLettuce.g:1836:1: ( ( 'def?' ) )
            // ../dk.itu.bddtransform.ui/src-gen/dk/itu/bddctransform/ui/contentassist/antlr/internal/InternalLettuce.g:1837:1: ( 'def?' )
            {
            // ../dk.itu.bddtransform.ui/src-gen/dk/itu/bddctransform/ui/contentassist/antlr/internal/InternalLettuce.g:1837:1: ( 'def?' )
            // ../dk.itu.bddtransform.ui/src-gen/dk/itu/bddctransform/ui/contentassist/antlr/internal/InternalLettuce.g:1838:1: 'def?'
            {
             before(grammarAccess.getIfDefAccess().getDefKeyword_1()); 
            match(input,26,FollowSets000.FOLLOW_26_in_rule__IfDef__Group__1__Impl3692); 
             after(grammarAccess.getIfDefAccess().getDefKeyword_1()); 

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
    // $ANTLR end "rule__IfDef__Group__1__Impl"


    // $ANTLR start "rule__IfDef__Group__2"
    // ../dk.itu.bddtransform.ui/src-gen/dk/itu/bddctransform/ui/contentassist/antlr/internal/InternalLettuce.g:1851:1: rule__IfDef__Group__2 : rule__IfDef__Group__2__Impl rule__IfDef__Group__3 ;
    public final void rule__IfDef__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.bddtransform.ui/src-gen/dk/itu/bddctransform/ui/contentassist/antlr/internal/InternalLettuce.g:1855:1: ( rule__IfDef__Group__2__Impl rule__IfDef__Group__3 )
            // ../dk.itu.bddtransform.ui/src-gen/dk/itu/bddctransform/ui/contentassist/antlr/internal/InternalLettuce.g:1856:2: rule__IfDef__Group__2__Impl rule__IfDef__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__IfDef__Group__2__Impl_in_rule__IfDef__Group__23723);
            rule__IfDef__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__IfDef__Group__3_in_rule__IfDef__Group__23726);
            rule__IfDef__Group__3();

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
    // $ANTLR end "rule__IfDef__Group__2"


    // $ANTLR start "rule__IfDef__Group__2__Impl"
    // ../dk.itu.bddtransform.ui/src-gen/dk/itu/bddctransform/ui/contentassist/antlr/internal/InternalLettuce.g:1863:1: rule__IfDef__Group__2__Impl : ( ( rule__IfDef__VariablesAssignment_2 ) ) ;
    public final void rule__IfDef__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.bddtransform.ui/src-gen/dk/itu/bddctransform/ui/contentassist/antlr/internal/InternalLettuce.g:1867:1: ( ( ( rule__IfDef__VariablesAssignment_2 ) ) )
            // ../dk.itu.bddtransform.ui/src-gen/dk/itu/bddctransform/ui/contentassist/antlr/internal/InternalLettuce.g:1868:1: ( ( rule__IfDef__VariablesAssignment_2 ) )
            {
            // ../dk.itu.bddtransform.ui/src-gen/dk/itu/bddctransform/ui/contentassist/antlr/internal/InternalLettuce.g:1868:1: ( ( rule__IfDef__VariablesAssignment_2 ) )
            // ../dk.itu.bddtransform.ui/src-gen/dk/itu/bddctransform/ui/contentassist/antlr/internal/InternalLettuce.g:1869:1: ( rule__IfDef__VariablesAssignment_2 )
            {
             before(grammarAccess.getIfDefAccess().getVariablesAssignment_2()); 
            // ../dk.itu.bddtransform.ui/src-gen/dk/itu/bddctransform/ui/contentassist/antlr/internal/InternalLettuce.g:1870:1: ( rule__IfDef__VariablesAssignment_2 )
            // ../dk.itu.bddtransform.ui/src-gen/dk/itu/bddctransform/ui/contentassist/antlr/internal/InternalLettuce.g:1870:2: rule__IfDef__VariablesAssignment_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__IfDef__VariablesAssignment_2_in_rule__IfDef__Group__2__Impl3753);
            rule__IfDef__VariablesAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getIfDefAccess().getVariablesAssignment_2()); 

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
    // $ANTLR end "rule__IfDef__Group__2__Impl"


    // $ANTLR start "rule__IfDef__Group__3"
    // ../dk.itu.bddtransform.ui/src-gen/dk/itu/bddctransform/ui/contentassist/antlr/internal/InternalLettuce.g:1880:1: rule__IfDef__Group__3 : rule__IfDef__Group__3__Impl rule__IfDef__Group__4 ;
    public final void rule__IfDef__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.bddtransform.ui/src-gen/dk/itu/bddctransform/ui/contentassist/antlr/internal/InternalLettuce.g:1884:1: ( rule__IfDef__Group__3__Impl rule__IfDef__Group__4 )
            // ../dk.itu.bddtransform.ui/src-gen/dk/itu/bddctransform/ui/contentassist/antlr/internal/InternalLettuce.g:1885:2: rule__IfDef__Group__3__Impl rule__IfDef__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__IfDef__Group__3__Impl_in_rule__IfDef__Group__33783);
            rule__IfDef__Group__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__IfDef__Group__4_in_rule__IfDef__Group__33786);
            rule__IfDef__Group__4();

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
    // $ANTLR end "rule__IfDef__Group__3"


    // $ANTLR start "rule__IfDef__Group__3__Impl"
    // ../dk.itu.bddtransform.ui/src-gen/dk/itu/bddctransform/ui/contentassist/antlr/internal/InternalLettuce.g:1892:1: rule__IfDef__Group__3__Impl : ( ( rule__IfDef__Group_3__0 )* ) ;
    public final void rule__IfDef__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.bddtransform.ui/src-gen/dk/itu/bddctransform/ui/contentassist/antlr/internal/InternalLettuce.g:1896:1: ( ( ( rule__IfDef__Group_3__0 )* ) )
            // ../dk.itu.bddtransform.ui/src-gen/dk/itu/bddctransform/ui/contentassist/antlr/internal/InternalLettuce.g:1897:1: ( ( rule__IfDef__Group_3__0 )* )
            {
            // ../dk.itu.bddtransform.ui/src-gen/dk/itu/bddctransform/ui/contentassist/antlr/internal/InternalLettuce.g:1897:1: ( ( rule__IfDef__Group_3__0 )* )
            // ../dk.itu.bddtransform.ui/src-gen/dk/itu/bddctransform/ui/contentassist/antlr/internal/InternalLettuce.g:1898:1: ( rule__IfDef__Group_3__0 )*
            {
             before(grammarAccess.getIfDefAccess().getGroup_3()); 
            // ../dk.itu.bddtransform.ui/src-gen/dk/itu/bddctransform/ui/contentassist/antlr/internal/InternalLettuce.g:1899:1: ( rule__IfDef__Group_3__0 )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==29) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // ../dk.itu.bddtransform.ui/src-gen/dk/itu/bddctransform/ui/contentassist/antlr/internal/InternalLettuce.g:1899:2: rule__IfDef__Group_3__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__IfDef__Group_3__0_in_rule__IfDef__Group__3__Impl3813);
            	    rule__IfDef__Group_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);

             after(grammarAccess.getIfDefAccess().getGroup_3()); 

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
    // $ANTLR end "rule__IfDef__Group__3__Impl"


    // $ANTLR start "rule__IfDef__Group__4"
    // ../dk.itu.bddtransform.ui/src-gen/dk/itu/bddctransform/ui/contentassist/antlr/internal/InternalLettuce.g:1909:1: rule__IfDef__Group__4 : rule__IfDef__Group__4__Impl rule__IfDef__Group__5 ;
    public final void rule__IfDef__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.bddtransform.ui/src-gen/dk/itu/bddctransform/ui/contentassist/antlr/internal/InternalLettuce.g:1913:1: ( rule__IfDef__Group__4__Impl rule__IfDef__Group__5 )
            // ../dk.itu.bddtransform.ui/src-gen/dk/itu/bddctransform/ui/contentassist/antlr/internal/InternalLettuce.g:1914:2: rule__IfDef__Group__4__Impl rule__IfDef__Group__5
            {
            pushFollow(FollowSets000.FOLLOW_rule__IfDef__Group__4__Impl_in_rule__IfDef__Group__43844);
            rule__IfDef__Group__4__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__IfDef__Group__5_in_rule__IfDef__Group__43847);
            rule__IfDef__Group__5();

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
    // $ANTLR end "rule__IfDef__Group__4"


    // $ANTLR start "rule__IfDef__Group__4__Impl"
    // ../dk.itu.bddtransform.ui/src-gen/dk/itu/bddctransform/ui/contentassist/antlr/internal/InternalLettuce.g:1921:1: rule__IfDef__Group__4__Impl : ( 'then' ) ;
    public final void rule__IfDef__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.bddtransform.ui/src-gen/dk/itu/bddctransform/ui/contentassist/antlr/internal/InternalLettuce.g:1925:1: ( ( 'then' ) )
            // ../dk.itu.bddtransform.ui/src-gen/dk/itu/bddctransform/ui/contentassist/antlr/internal/InternalLettuce.g:1926:1: ( 'then' )
            {
            // ../dk.itu.bddtransform.ui/src-gen/dk/itu/bddctransform/ui/contentassist/antlr/internal/InternalLettuce.g:1926:1: ( 'then' )
            // ../dk.itu.bddtransform.ui/src-gen/dk/itu/bddctransform/ui/contentassist/antlr/internal/InternalLettuce.g:1927:1: 'then'
            {
             before(grammarAccess.getIfDefAccess().getThenKeyword_4()); 
            match(input,27,FollowSets000.FOLLOW_27_in_rule__IfDef__Group__4__Impl3875); 
             after(grammarAccess.getIfDefAccess().getThenKeyword_4()); 

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
    // $ANTLR end "rule__IfDef__Group__4__Impl"


    // $ANTLR start "rule__IfDef__Group__5"
    // ../dk.itu.bddtransform.ui/src-gen/dk/itu/bddctransform/ui/contentassist/antlr/internal/InternalLettuce.g:1940:1: rule__IfDef__Group__5 : rule__IfDef__Group__5__Impl rule__IfDef__Group__6 ;
    public final void rule__IfDef__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.bddtransform.ui/src-gen/dk/itu/bddctransform/ui/contentassist/antlr/internal/InternalLettuce.g:1944:1: ( rule__IfDef__Group__5__Impl rule__IfDef__Group__6 )
            // ../dk.itu.bddtransform.ui/src-gen/dk/itu/bddctransform/ui/contentassist/antlr/internal/InternalLettuce.g:1945:2: rule__IfDef__Group__5__Impl rule__IfDef__Group__6
            {
            pushFollow(FollowSets000.FOLLOW_rule__IfDef__Group__5__Impl_in_rule__IfDef__Group__53906);
            rule__IfDef__Group__5__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__IfDef__Group__6_in_rule__IfDef__Group__53909);
            rule__IfDef__Group__6();

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
    // $ANTLR end "rule__IfDef__Group__5"


    // $ANTLR start "rule__IfDef__Group__5__Impl"
    // ../dk.itu.bddtransform.ui/src-gen/dk/itu/bddctransform/ui/contentassist/antlr/internal/InternalLettuce.g:1952:1: rule__IfDef__Group__5__Impl : ( ( rule__IfDef__True_bodyAssignment_5 ) ) ;
    public final void rule__IfDef__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.bddtransform.ui/src-gen/dk/itu/bddctransform/ui/contentassist/antlr/internal/InternalLettuce.g:1956:1: ( ( ( rule__IfDef__True_bodyAssignment_5 ) ) )
            // ../dk.itu.bddtransform.ui/src-gen/dk/itu/bddctransform/ui/contentassist/antlr/internal/InternalLettuce.g:1957:1: ( ( rule__IfDef__True_bodyAssignment_5 ) )
            {
            // ../dk.itu.bddtransform.ui/src-gen/dk/itu/bddctransform/ui/contentassist/antlr/internal/InternalLettuce.g:1957:1: ( ( rule__IfDef__True_bodyAssignment_5 ) )
            // ../dk.itu.bddtransform.ui/src-gen/dk/itu/bddctransform/ui/contentassist/antlr/internal/InternalLettuce.g:1958:1: ( rule__IfDef__True_bodyAssignment_5 )
            {
             before(grammarAccess.getIfDefAccess().getTrue_bodyAssignment_5()); 
            // ../dk.itu.bddtransform.ui/src-gen/dk/itu/bddctransform/ui/contentassist/antlr/internal/InternalLettuce.g:1959:1: ( rule__IfDef__True_bodyAssignment_5 )
            // ../dk.itu.bddtransform.ui/src-gen/dk/itu/bddctransform/ui/contentassist/antlr/internal/InternalLettuce.g:1959:2: rule__IfDef__True_bodyAssignment_5
            {
            pushFollow(FollowSets000.FOLLOW_rule__IfDef__True_bodyAssignment_5_in_rule__IfDef__Group__5__Impl3936);
            rule__IfDef__True_bodyAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getIfDefAccess().getTrue_bodyAssignment_5()); 

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
    // $ANTLR end "rule__IfDef__Group__5__Impl"


    // $ANTLR start "rule__IfDef__Group__6"
    // ../dk.itu.bddtransform.ui/src-gen/dk/itu/bddctransform/ui/contentassist/antlr/internal/InternalLettuce.g:1969:1: rule__IfDef__Group__6 : rule__IfDef__Group__6__Impl rule__IfDef__Group__7 ;
    public final void rule__IfDef__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.bddtransform.ui/src-gen/dk/itu/bddctransform/ui/contentassist/antlr/internal/InternalLettuce.g:1973:1: ( rule__IfDef__Group__6__Impl rule__IfDef__Group__7 )
            // ../dk.itu.bddtransform.ui/src-gen/dk/itu/bddctransform/ui/contentassist/antlr/internal/InternalLettuce.g:1974:2: rule__IfDef__Group__6__Impl rule__IfDef__Group__7
            {
            pushFollow(FollowSets000.FOLLOW_rule__IfDef__Group__6__Impl_in_rule__IfDef__Group__63966);
            rule__IfDef__Group__6__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__IfDef__Group__7_in_rule__IfDef__Group__63969);
            rule__IfDef__Group__7();

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
    // $ANTLR end "rule__IfDef__Group__6"


    // $ANTLR start "rule__IfDef__Group__6__Impl"
    // ../dk.itu.bddtransform.ui/src-gen/dk/itu/bddctransform/ui/contentassist/antlr/internal/InternalLettuce.g:1981:1: rule__IfDef__Group__6__Impl : ( 'else' ) ;
    public final void rule__IfDef__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.bddtransform.ui/src-gen/dk/itu/bddctransform/ui/contentassist/antlr/internal/InternalLettuce.g:1985:1: ( ( 'else' ) )
            // ../dk.itu.bddtransform.ui/src-gen/dk/itu/bddctransform/ui/contentassist/antlr/internal/InternalLettuce.g:1986:1: ( 'else' )
            {
            // ../dk.itu.bddtransform.ui/src-gen/dk/itu/bddctransform/ui/contentassist/antlr/internal/InternalLettuce.g:1986:1: ( 'else' )
            // ../dk.itu.bddtransform.ui/src-gen/dk/itu/bddctransform/ui/contentassist/antlr/internal/InternalLettuce.g:1987:1: 'else'
            {
             before(grammarAccess.getIfDefAccess().getElseKeyword_6()); 
            match(input,28,FollowSets000.FOLLOW_28_in_rule__IfDef__Group__6__Impl3997); 
             after(grammarAccess.getIfDefAccess().getElseKeyword_6()); 

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
    // $ANTLR end "rule__IfDef__Group__6__Impl"


    // $ANTLR start "rule__IfDef__Group__7"
    // ../dk.itu.bddtransform.ui/src-gen/dk/itu/bddctransform/ui/contentassist/antlr/internal/InternalLettuce.g:2000:1: rule__IfDef__Group__7 : rule__IfDef__Group__7__Impl rule__IfDef__Group__8 ;
    public final void rule__IfDef__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.bddtransform.ui/src-gen/dk/itu/bddctransform/ui/contentassist/antlr/internal/InternalLettuce.g:2004:1: ( rule__IfDef__Group__7__Impl rule__IfDef__Group__8 )
            // ../dk.itu.bddtransform.ui/src-gen/dk/itu/bddctransform/ui/contentassist/antlr/internal/InternalLettuce.g:2005:2: rule__IfDef__Group__7__Impl rule__IfDef__Group__8
            {
            pushFollow(FollowSets000.FOLLOW_rule__IfDef__Group__7__Impl_in_rule__IfDef__Group__74028);
            rule__IfDef__Group__7__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__IfDef__Group__8_in_rule__IfDef__Group__74031);
            rule__IfDef__Group__8();

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
    // $ANTLR end "rule__IfDef__Group__7"


    // $ANTLR start "rule__IfDef__Group__7__Impl"
    // ../dk.itu.bddtransform.ui/src-gen/dk/itu/bddctransform/ui/contentassist/antlr/internal/InternalLettuce.g:2012:1: rule__IfDef__Group__7__Impl : ( ( rule__IfDef__False_bodyAssignment_7 ) ) ;
    public final void rule__IfDef__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.bddtransform.ui/src-gen/dk/itu/bddctransform/ui/contentassist/antlr/internal/InternalLettuce.g:2016:1: ( ( ( rule__IfDef__False_bodyAssignment_7 ) ) )
            // ../dk.itu.bddtransform.ui/src-gen/dk/itu/bddctransform/ui/contentassist/antlr/internal/InternalLettuce.g:2017:1: ( ( rule__IfDef__False_bodyAssignment_7 ) )
            {
            // ../dk.itu.bddtransform.ui/src-gen/dk/itu/bddctransform/ui/contentassist/antlr/internal/InternalLettuce.g:2017:1: ( ( rule__IfDef__False_bodyAssignment_7 ) )
            // ../dk.itu.bddtransform.ui/src-gen/dk/itu/bddctransform/ui/contentassist/antlr/internal/InternalLettuce.g:2018:1: ( rule__IfDef__False_bodyAssignment_7 )
            {
             before(grammarAccess.getIfDefAccess().getFalse_bodyAssignment_7()); 
            // ../dk.itu.bddtransform.ui/src-gen/dk/itu/bddctransform/ui/contentassist/antlr/internal/InternalLettuce.g:2019:1: ( rule__IfDef__False_bodyAssignment_7 )
            // ../dk.itu.bddtransform.ui/src-gen/dk/itu/bddctransform/ui/contentassist/antlr/internal/InternalLettuce.g:2019:2: rule__IfDef__False_bodyAssignment_7
            {
            pushFollow(FollowSets000.FOLLOW_rule__IfDef__False_bodyAssignment_7_in_rule__IfDef__Group__7__Impl4058);
            rule__IfDef__False_bodyAssignment_7();

            state._fsp--;


            }

             after(grammarAccess.getIfDefAccess().getFalse_bodyAssignment_7()); 

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
    // $ANTLR end "rule__IfDef__Group__7__Impl"


    // $ANTLR start "rule__IfDef__Group__8"
    // ../dk.itu.bddtransform.ui/src-gen/dk/itu/bddctransform/ui/contentassist/antlr/internal/InternalLettuce.g:2029:1: rule__IfDef__Group__8 : rule__IfDef__Group__8__Impl ;
    public final void rule__IfDef__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.bddtransform.ui/src-gen/dk/itu/bddctransform/ui/contentassist/antlr/internal/InternalLettuce.g:2033:1: ( rule__IfDef__Group__8__Impl )
            // ../dk.itu.bddtransform.ui/src-gen/dk/itu/bddctransform/ui/contentassist/antlr/internal/InternalLettuce.g:2034:2: rule__IfDef__Group__8__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__IfDef__Group__8__Impl_in_rule__IfDef__Group__84088);
            rule__IfDef__Group__8__Impl();

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
    // $ANTLR end "rule__IfDef__Group__8"


    // $ANTLR start "rule__IfDef__Group__8__Impl"
    // ../dk.itu.bddtransform.ui/src-gen/dk/itu/bddctransform/ui/contentassist/antlr/internal/InternalLettuce.g:2040:1: rule__IfDef__Group__8__Impl : ( 'end' ) ;
    public final void rule__IfDef__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.bddtransform.ui/src-gen/dk/itu/bddctransform/ui/contentassist/antlr/internal/InternalLettuce.g:2044:1: ( ( 'end' ) )
            // ../dk.itu.bddtransform.ui/src-gen/dk/itu/bddctransform/ui/contentassist/antlr/internal/InternalLettuce.g:2045:1: ( 'end' )
            {
            // ../dk.itu.bddtransform.ui/src-gen/dk/itu/bddctransform/ui/contentassist/antlr/internal/InternalLettuce.g:2045:1: ( 'end' )
            // ../dk.itu.bddtransform.ui/src-gen/dk/itu/bddctransform/ui/contentassist/antlr/internal/InternalLettuce.g:2046:1: 'end'
            {
             before(grammarAccess.getIfDefAccess().getEndKeyword_8()); 
            match(input,16,FollowSets000.FOLLOW_16_in_rule__IfDef__Group__8__Impl4116); 
             after(grammarAccess.getIfDefAccess().getEndKeyword_8()); 

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
    // $ANTLR end "rule__IfDef__Group__8__Impl"


    // $ANTLR start "rule__IfDef__Group_3__0"
    // ../dk.itu.bddtransform.ui/src-gen/dk/itu/bddctransform/ui/contentassist/antlr/internal/InternalLettuce.g:2077:1: rule__IfDef__Group_3__0 : rule__IfDef__Group_3__0__Impl rule__IfDef__Group_3__1 ;
    public final void rule__IfDef__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.bddtransform.ui/src-gen/dk/itu/bddctransform/ui/contentassist/antlr/internal/InternalLettuce.g:2081:1: ( rule__IfDef__Group_3__0__Impl rule__IfDef__Group_3__1 )
            // ../dk.itu.bddtransform.ui/src-gen/dk/itu/bddctransform/ui/contentassist/antlr/internal/InternalLettuce.g:2082:2: rule__IfDef__Group_3__0__Impl rule__IfDef__Group_3__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__IfDef__Group_3__0__Impl_in_rule__IfDef__Group_3__04165);
            rule__IfDef__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__IfDef__Group_3__1_in_rule__IfDef__Group_3__04168);
            rule__IfDef__Group_3__1();

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
    // $ANTLR end "rule__IfDef__Group_3__0"


    // $ANTLR start "rule__IfDef__Group_3__0__Impl"
    // ../dk.itu.bddtransform.ui/src-gen/dk/itu/bddctransform/ui/contentassist/antlr/internal/InternalLettuce.g:2089:1: rule__IfDef__Group_3__0__Impl : ( ',' ) ;
    public final void rule__IfDef__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.bddtransform.ui/src-gen/dk/itu/bddctransform/ui/contentassist/antlr/internal/InternalLettuce.g:2093:1: ( ( ',' ) )
            // ../dk.itu.bddtransform.ui/src-gen/dk/itu/bddctransform/ui/contentassist/antlr/internal/InternalLettuce.g:2094:1: ( ',' )
            {
            // ../dk.itu.bddtransform.ui/src-gen/dk/itu/bddctransform/ui/contentassist/antlr/internal/InternalLettuce.g:2094:1: ( ',' )
            // ../dk.itu.bddtransform.ui/src-gen/dk/itu/bddctransform/ui/contentassist/antlr/internal/InternalLettuce.g:2095:1: ','
            {
             before(grammarAccess.getIfDefAccess().getCommaKeyword_3_0()); 
            match(input,29,FollowSets000.FOLLOW_29_in_rule__IfDef__Group_3__0__Impl4196); 
             after(grammarAccess.getIfDefAccess().getCommaKeyword_3_0()); 

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
    // $ANTLR end "rule__IfDef__Group_3__0__Impl"


    // $ANTLR start "rule__IfDef__Group_3__1"
    // ../dk.itu.bddtransform.ui/src-gen/dk/itu/bddctransform/ui/contentassist/antlr/internal/InternalLettuce.g:2108:1: rule__IfDef__Group_3__1 : rule__IfDef__Group_3__1__Impl ;
    public final void rule__IfDef__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.bddtransform.ui/src-gen/dk/itu/bddctransform/ui/contentassist/antlr/internal/InternalLettuce.g:2112:1: ( rule__IfDef__Group_3__1__Impl )
            // ../dk.itu.bddtransform.ui/src-gen/dk/itu/bddctransform/ui/contentassist/antlr/internal/InternalLettuce.g:2113:2: rule__IfDef__Group_3__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__IfDef__Group_3__1__Impl_in_rule__IfDef__Group_3__14227);
            rule__IfDef__Group_3__1__Impl();

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
    // $ANTLR end "rule__IfDef__Group_3__1"


    // $ANTLR start "rule__IfDef__Group_3__1__Impl"
    // ../dk.itu.bddtransform.ui/src-gen/dk/itu/bddctransform/ui/contentassist/antlr/internal/InternalLettuce.g:2119:1: rule__IfDef__Group_3__1__Impl : ( ( rule__IfDef__VariablesAssignment_3_1 ) ) ;
    public final void rule__IfDef__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.bddtransform.ui/src-gen/dk/itu/bddctransform/ui/contentassist/antlr/internal/InternalLettuce.g:2123:1: ( ( ( rule__IfDef__VariablesAssignment_3_1 ) ) )
            // ../dk.itu.bddtransform.ui/src-gen/dk/itu/bddctransform/ui/contentassist/antlr/internal/InternalLettuce.g:2124:1: ( ( rule__IfDef__VariablesAssignment_3_1 ) )
            {
            // ../dk.itu.bddtransform.ui/src-gen/dk/itu/bddctransform/ui/contentassist/antlr/internal/InternalLettuce.g:2124:1: ( ( rule__IfDef__VariablesAssignment_3_1 ) )
            // ../dk.itu.bddtransform.ui/src-gen/dk/itu/bddctransform/ui/contentassist/antlr/internal/InternalLettuce.g:2125:1: ( rule__IfDef__VariablesAssignment_3_1 )
            {
             before(grammarAccess.getIfDefAccess().getVariablesAssignment_3_1()); 
            // ../dk.itu.bddtransform.ui/src-gen/dk/itu/bddctransform/ui/contentassist/antlr/internal/InternalLettuce.g:2126:1: ( rule__IfDef__VariablesAssignment_3_1 )
            // ../dk.itu.bddtransform.ui/src-gen/dk/itu/bddctransform/ui/contentassist/antlr/internal/InternalLettuce.g:2126:2: rule__IfDef__VariablesAssignment_3_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__IfDef__VariablesAssignment_3_1_in_rule__IfDef__Group_3__1__Impl4254);
            rule__IfDef__VariablesAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getIfDefAccess().getVariablesAssignment_3_1()); 

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
    // $ANTLR end "rule__IfDef__Group_3__1__Impl"


    // $ANTLR start "rule__Match__Group__0"
    // ../dk.itu.bddtransform.ui/src-gen/dk/itu/bddctransform/ui/contentassist/antlr/internal/InternalLettuce.g:2140:1: rule__Match__Group__0 : rule__Match__Group__0__Impl rule__Match__Group__1 ;
    public final void rule__Match__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.bddtransform.ui/src-gen/dk/itu/bddctransform/ui/contentassist/antlr/internal/InternalLettuce.g:2144:1: ( rule__Match__Group__0__Impl rule__Match__Group__1 )
            // ../dk.itu.bddtransform.ui/src-gen/dk/itu/bddctransform/ui/contentassist/antlr/internal/InternalLettuce.g:2145:2: rule__Match__Group__0__Impl rule__Match__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Match__Group__0__Impl_in_rule__Match__Group__04288);
            rule__Match__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Match__Group__1_in_rule__Match__Group__04291);
            rule__Match__Group__1();

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
    // $ANTLR end "rule__Match__Group__0"


    // $ANTLR start "rule__Match__Group__0__Impl"
    // ../dk.itu.bddtransform.ui/src-gen/dk/itu/bddctransform/ui/contentassist/antlr/internal/InternalLettuce.g:2152:1: rule__Match__Group__0__Impl : ( 'match' ) ;
    public final void rule__Match__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.bddtransform.ui/src-gen/dk/itu/bddctransform/ui/contentassist/antlr/internal/InternalLettuce.g:2156:1: ( ( 'match' ) )
            // ../dk.itu.bddtransform.ui/src-gen/dk/itu/bddctransform/ui/contentassist/antlr/internal/InternalLettuce.g:2157:1: ( 'match' )
            {
            // ../dk.itu.bddtransform.ui/src-gen/dk/itu/bddctransform/ui/contentassist/antlr/internal/InternalLettuce.g:2157:1: ( 'match' )
            // ../dk.itu.bddtransform.ui/src-gen/dk/itu/bddctransform/ui/contentassist/antlr/internal/InternalLettuce.g:2158:1: 'match'
            {
             before(grammarAccess.getMatchAccess().getMatchKeyword_0()); 
            match(input,30,FollowSets000.FOLLOW_30_in_rule__Match__Group__0__Impl4319); 
             after(grammarAccess.getMatchAccess().getMatchKeyword_0()); 

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
    // $ANTLR end "rule__Match__Group__0__Impl"


    // $ANTLR start "rule__Match__Group__1"
    // ../dk.itu.bddtransform.ui/src-gen/dk/itu/bddctransform/ui/contentassist/antlr/internal/InternalLettuce.g:2171:1: rule__Match__Group__1 : rule__Match__Group__1__Impl rule__Match__Group__2 ;
    public final void rule__Match__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.bddtransform.ui/src-gen/dk/itu/bddctransform/ui/contentassist/antlr/internal/InternalLettuce.g:2175:1: ( rule__Match__Group__1__Impl rule__Match__Group__2 )
            // ../dk.itu.bddtransform.ui/src-gen/dk/itu/bddctransform/ui/contentassist/antlr/internal/InternalLettuce.g:2176:2: rule__Match__Group__1__Impl rule__Match__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Match__Group__1__Impl_in_rule__Match__Group__14350);
            rule__Match__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Match__Group__2_in_rule__Match__Group__14353);
            rule__Match__Group__2();

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
    // $ANTLR end "rule__Match__Group__1"


    // $ANTLR start "rule__Match__Group__1__Impl"
    // ../dk.itu.bddtransform.ui/src-gen/dk/itu/bddctransform/ui/contentassist/antlr/internal/InternalLettuce.g:2183:1: rule__Match__Group__1__Impl : ( ( rule__Match__RuleAssignment_1 ) ) ;
    public final void rule__Match__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.bddtransform.ui/src-gen/dk/itu/bddctransform/ui/contentassist/antlr/internal/InternalLettuce.g:2187:1: ( ( ( rule__Match__RuleAssignment_1 ) ) )
            // ../dk.itu.bddtransform.ui/src-gen/dk/itu/bddctransform/ui/contentassist/antlr/internal/InternalLettuce.g:2188:1: ( ( rule__Match__RuleAssignment_1 ) )
            {
            // ../dk.itu.bddtransform.ui/src-gen/dk/itu/bddctransform/ui/contentassist/antlr/internal/InternalLettuce.g:2188:1: ( ( rule__Match__RuleAssignment_1 ) )
            // ../dk.itu.bddtransform.ui/src-gen/dk/itu/bddctransform/ui/contentassist/antlr/internal/InternalLettuce.g:2189:1: ( rule__Match__RuleAssignment_1 )
            {
             before(grammarAccess.getMatchAccess().getRuleAssignment_1()); 
            // ../dk.itu.bddtransform.ui/src-gen/dk/itu/bddctransform/ui/contentassist/antlr/internal/InternalLettuce.g:2190:1: ( rule__Match__RuleAssignment_1 )
            // ../dk.itu.bddtransform.ui/src-gen/dk/itu/bddctransform/ui/contentassist/antlr/internal/InternalLettuce.g:2190:2: rule__Match__RuleAssignment_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Match__RuleAssignment_1_in_rule__Match__Group__1__Impl4380);
            rule__Match__RuleAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getMatchAccess().getRuleAssignment_1()); 

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
    // $ANTLR end "rule__Match__Group__1__Impl"


    // $ANTLR start "rule__Match__Group__2"
    // ../dk.itu.bddtransform.ui/src-gen/dk/itu/bddctransform/ui/contentassist/antlr/internal/InternalLettuce.g:2200:1: rule__Match__Group__2 : rule__Match__Group__2__Impl ;
    public final void rule__Match__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.bddtransform.ui/src-gen/dk/itu/bddctransform/ui/contentassist/antlr/internal/InternalLettuce.g:2204:1: ( rule__Match__Group__2__Impl )
            // ../dk.itu.bddtransform.ui/src-gen/dk/itu/bddctransform/ui/contentassist/antlr/internal/InternalLettuce.g:2205:2: rule__Match__Group__2__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Match__Group__2__Impl_in_rule__Match__Group__24410);
            rule__Match__Group__2__Impl();

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
    // $ANTLR end "rule__Match__Group__2"


    // $ANTLR start "rule__Match__Group__2__Impl"
    // ../dk.itu.bddtransform.ui/src-gen/dk/itu/bddctransform/ui/contentassist/antlr/internal/InternalLettuce.g:2211:1: rule__Match__Group__2__Impl : ( ( rule__Match__Group_2__0 )? ) ;
    public final void rule__Match__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.bddtransform.ui/src-gen/dk/itu/bddctransform/ui/contentassist/antlr/internal/InternalLettuce.g:2215:1: ( ( ( rule__Match__Group_2__0 )? ) )
            // ../dk.itu.bddtransform.ui/src-gen/dk/itu/bddctransform/ui/contentassist/antlr/internal/InternalLettuce.g:2216:1: ( ( rule__Match__Group_2__0 )? )
            {
            // ../dk.itu.bddtransform.ui/src-gen/dk/itu/bddctransform/ui/contentassist/antlr/internal/InternalLettuce.g:2216:1: ( ( rule__Match__Group_2__0 )? )
            // ../dk.itu.bddtransform.ui/src-gen/dk/itu/bddctransform/ui/contentassist/antlr/internal/InternalLettuce.g:2217:1: ( rule__Match__Group_2__0 )?
            {
             before(grammarAccess.getMatchAccess().getGroup_2()); 
            // ../dk.itu.bddtransform.ui/src-gen/dk/itu/bddctransform/ui/contentassist/antlr/internal/InternalLettuce.g:2218:1: ( rule__Match__Group_2__0 )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==18) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // ../dk.itu.bddtransform.ui/src-gen/dk/itu/bddctransform/ui/contentassist/antlr/internal/InternalLettuce.g:2218:2: rule__Match__Group_2__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__Match__Group_2__0_in_rule__Match__Group__2__Impl4437);
                    rule__Match__Group_2__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getMatchAccess().getGroup_2()); 

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
    // $ANTLR end "rule__Match__Group__2__Impl"


    // $ANTLR start "rule__Match__Group_2__0"
    // ../dk.itu.bddtransform.ui/src-gen/dk/itu/bddctransform/ui/contentassist/antlr/internal/InternalLettuce.g:2234:1: rule__Match__Group_2__0 : rule__Match__Group_2__0__Impl rule__Match__Group_2__1 ;
    public final void rule__Match__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.bddtransform.ui/src-gen/dk/itu/bddctransform/ui/contentassist/antlr/internal/InternalLettuce.g:2238:1: ( rule__Match__Group_2__0__Impl rule__Match__Group_2__1 )
            // ../dk.itu.bddtransform.ui/src-gen/dk/itu/bddctransform/ui/contentassist/antlr/internal/InternalLettuce.g:2239:2: rule__Match__Group_2__0__Impl rule__Match__Group_2__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Match__Group_2__0__Impl_in_rule__Match__Group_2__04474);
            rule__Match__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Match__Group_2__1_in_rule__Match__Group_2__04477);
            rule__Match__Group_2__1();

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
    // $ANTLR end "rule__Match__Group_2__0"


    // $ANTLR start "rule__Match__Group_2__0__Impl"
    // ../dk.itu.bddtransform.ui/src-gen/dk/itu/bddctransform/ui/contentassist/antlr/internal/InternalLettuce.g:2246:1: rule__Match__Group_2__0__Impl : ( ( rule__Match__AssignmentsAssignment_2_0 ) ) ;
    public final void rule__Match__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.bddtransform.ui/src-gen/dk/itu/bddctransform/ui/contentassist/antlr/internal/InternalLettuce.g:2250:1: ( ( ( rule__Match__AssignmentsAssignment_2_0 ) ) )
            // ../dk.itu.bddtransform.ui/src-gen/dk/itu/bddctransform/ui/contentassist/antlr/internal/InternalLettuce.g:2251:1: ( ( rule__Match__AssignmentsAssignment_2_0 ) )
            {
            // ../dk.itu.bddtransform.ui/src-gen/dk/itu/bddctransform/ui/contentassist/antlr/internal/InternalLettuce.g:2251:1: ( ( rule__Match__AssignmentsAssignment_2_0 ) )
            // ../dk.itu.bddtransform.ui/src-gen/dk/itu/bddctransform/ui/contentassist/antlr/internal/InternalLettuce.g:2252:1: ( rule__Match__AssignmentsAssignment_2_0 )
            {
             before(grammarAccess.getMatchAccess().getAssignmentsAssignment_2_0()); 
            // ../dk.itu.bddtransform.ui/src-gen/dk/itu/bddctransform/ui/contentassist/antlr/internal/InternalLettuce.g:2253:1: ( rule__Match__AssignmentsAssignment_2_0 )
            // ../dk.itu.bddtransform.ui/src-gen/dk/itu/bddctransform/ui/contentassist/antlr/internal/InternalLettuce.g:2253:2: rule__Match__AssignmentsAssignment_2_0
            {
            pushFollow(FollowSets000.FOLLOW_rule__Match__AssignmentsAssignment_2_0_in_rule__Match__Group_2__0__Impl4504);
            rule__Match__AssignmentsAssignment_2_0();

            state._fsp--;


            }

             after(grammarAccess.getMatchAccess().getAssignmentsAssignment_2_0()); 

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
    // $ANTLR end "rule__Match__Group_2__0__Impl"


    // $ANTLR start "rule__Match__Group_2__1"
    // ../dk.itu.bddtransform.ui/src-gen/dk/itu/bddctransform/ui/contentassist/antlr/internal/InternalLettuce.g:2263:1: rule__Match__Group_2__1 : rule__Match__Group_2__1__Impl ;
    public final void rule__Match__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.bddtransform.ui/src-gen/dk/itu/bddctransform/ui/contentassist/antlr/internal/InternalLettuce.g:2267:1: ( rule__Match__Group_2__1__Impl )
            // ../dk.itu.bddtransform.ui/src-gen/dk/itu/bddctransform/ui/contentassist/antlr/internal/InternalLettuce.g:2268:2: rule__Match__Group_2__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Match__Group_2__1__Impl_in_rule__Match__Group_2__14534);
            rule__Match__Group_2__1__Impl();

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
    // $ANTLR end "rule__Match__Group_2__1"


    // $ANTLR start "rule__Match__Group_2__1__Impl"
    // ../dk.itu.bddtransform.ui/src-gen/dk/itu/bddctransform/ui/contentassist/antlr/internal/InternalLettuce.g:2274:1: rule__Match__Group_2__1__Impl : ( ( rule__Match__AssignmentsAssignment_2_1 )* ) ;
    public final void rule__Match__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.bddtransform.ui/src-gen/dk/itu/bddctransform/ui/contentassist/antlr/internal/InternalLettuce.g:2278:1: ( ( ( rule__Match__AssignmentsAssignment_2_1 )* ) )
            // ../dk.itu.bddtransform.ui/src-gen/dk/itu/bddctransform/ui/contentassist/antlr/internal/InternalLettuce.g:2279:1: ( ( rule__Match__AssignmentsAssignment_2_1 )* )
            {
            // ../dk.itu.bddtransform.ui/src-gen/dk/itu/bddctransform/ui/contentassist/antlr/internal/InternalLettuce.g:2279:1: ( ( rule__Match__AssignmentsAssignment_2_1 )* )
            // ../dk.itu.bddtransform.ui/src-gen/dk/itu/bddctransform/ui/contentassist/antlr/internal/InternalLettuce.g:2280:1: ( rule__Match__AssignmentsAssignment_2_1 )*
            {
             before(grammarAccess.getMatchAccess().getAssignmentsAssignment_2_1()); 
            // ../dk.itu.bddtransform.ui/src-gen/dk/itu/bddctransform/ui/contentassist/antlr/internal/InternalLettuce.g:2281:1: ( rule__Match__AssignmentsAssignment_2_1 )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==18) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // ../dk.itu.bddtransform.ui/src-gen/dk/itu/bddctransform/ui/contentassist/antlr/internal/InternalLettuce.g:2281:2: rule__Match__AssignmentsAssignment_2_1
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__Match__AssignmentsAssignment_2_1_in_rule__Match__Group_2__1__Impl4561);
            	    rule__Match__AssignmentsAssignment_2_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);

             after(grammarAccess.getMatchAccess().getAssignmentsAssignment_2_1()); 

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
    // $ANTLR end "rule__Match__Group_2__1__Impl"


    // $ANTLR start "rule__Fail__Group__0"
    // ../dk.itu.bddtransform.ui/src-gen/dk/itu/bddctransform/ui/contentassist/antlr/internal/InternalLettuce.g:2295:1: rule__Fail__Group__0 : rule__Fail__Group__0__Impl rule__Fail__Group__1 ;
    public final void rule__Fail__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.bddtransform.ui/src-gen/dk/itu/bddctransform/ui/contentassist/antlr/internal/InternalLettuce.g:2299:1: ( rule__Fail__Group__0__Impl rule__Fail__Group__1 )
            // ../dk.itu.bddtransform.ui/src-gen/dk/itu/bddctransform/ui/contentassist/antlr/internal/InternalLettuce.g:2300:2: rule__Fail__Group__0__Impl rule__Fail__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Fail__Group__0__Impl_in_rule__Fail__Group__04596);
            rule__Fail__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Fail__Group__1_in_rule__Fail__Group__04599);
            rule__Fail__Group__1();

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
    // $ANTLR end "rule__Fail__Group__0"


    // $ANTLR start "rule__Fail__Group__0__Impl"
    // ../dk.itu.bddtransform.ui/src-gen/dk/itu/bddctransform/ui/contentassist/antlr/internal/InternalLettuce.g:2307:1: rule__Fail__Group__0__Impl : ( () ) ;
    public final void rule__Fail__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.bddtransform.ui/src-gen/dk/itu/bddctransform/ui/contentassist/antlr/internal/InternalLettuce.g:2311:1: ( ( () ) )
            // ../dk.itu.bddtransform.ui/src-gen/dk/itu/bddctransform/ui/contentassist/antlr/internal/InternalLettuce.g:2312:1: ( () )
            {
            // ../dk.itu.bddtransform.ui/src-gen/dk/itu/bddctransform/ui/contentassist/antlr/internal/InternalLettuce.g:2312:1: ( () )
            // ../dk.itu.bddtransform.ui/src-gen/dk/itu/bddctransform/ui/contentassist/antlr/internal/InternalLettuce.g:2313:1: ()
            {
             before(grammarAccess.getFailAccess().getFailAction_0()); 
            // ../dk.itu.bddtransform.ui/src-gen/dk/itu/bddctransform/ui/contentassist/antlr/internal/InternalLettuce.g:2314:1: ()
            // ../dk.itu.bddtransform.ui/src-gen/dk/itu/bddctransform/ui/contentassist/antlr/internal/InternalLettuce.g:2316:1: 
            {
            }

             after(grammarAccess.getFailAccess().getFailAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Fail__Group__0__Impl"


    // $ANTLR start "rule__Fail__Group__1"
    // ../dk.itu.bddtransform.ui/src-gen/dk/itu/bddctransform/ui/contentassist/antlr/internal/InternalLettuce.g:2326:1: rule__Fail__Group__1 : rule__Fail__Group__1__Impl rule__Fail__Group__2 ;
    public final void rule__Fail__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.bddtransform.ui/src-gen/dk/itu/bddctransform/ui/contentassist/antlr/internal/InternalLettuce.g:2330:1: ( rule__Fail__Group__1__Impl rule__Fail__Group__2 )
            // ../dk.itu.bddtransform.ui/src-gen/dk/itu/bddctransform/ui/contentassist/antlr/internal/InternalLettuce.g:2331:2: rule__Fail__Group__1__Impl rule__Fail__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Fail__Group__1__Impl_in_rule__Fail__Group__14657);
            rule__Fail__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Fail__Group__2_in_rule__Fail__Group__14660);
            rule__Fail__Group__2();

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
    // $ANTLR end "rule__Fail__Group__1"


    // $ANTLR start "rule__Fail__Group__1__Impl"
    // ../dk.itu.bddtransform.ui/src-gen/dk/itu/bddctransform/ui/contentassist/antlr/internal/InternalLettuce.g:2338:1: rule__Fail__Group__1__Impl : ( 'fail' ) ;
    public final void rule__Fail__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.bddtransform.ui/src-gen/dk/itu/bddctransform/ui/contentassist/antlr/internal/InternalLettuce.g:2342:1: ( ( 'fail' ) )
            // ../dk.itu.bddtransform.ui/src-gen/dk/itu/bddctransform/ui/contentassist/antlr/internal/InternalLettuce.g:2343:1: ( 'fail' )
            {
            // ../dk.itu.bddtransform.ui/src-gen/dk/itu/bddctransform/ui/contentassist/antlr/internal/InternalLettuce.g:2343:1: ( 'fail' )
            // ../dk.itu.bddtransform.ui/src-gen/dk/itu/bddctransform/ui/contentassist/antlr/internal/InternalLettuce.g:2344:1: 'fail'
            {
             before(grammarAccess.getFailAccess().getFailKeyword_1()); 
            match(input,31,FollowSets000.FOLLOW_31_in_rule__Fail__Group__1__Impl4688); 
             after(grammarAccess.getFailAccess().getFailKeyword_1()); 

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
    // $ANTLR end "rule__Fail__Group__1__Impl"


    // $ANTLR start "rule__Fail__Group__2"
    // ../dk.itu.bddtransform.ui/src-gen/dk/itu/bddctransform/ui/contentassist/antlr/internal/InternalLettuce.g:2357:1: rule__Fail__Group__2 : rule__Fail__Group__2__Impl ;
    public final void rule__Fail__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.bddtransform.ui/src-gen/dk/itu/bddctransform/ui/contentassist/antlr/internal/InternalLettuce.g:2361:1: ( rule__Fail__Group__2__Impl )
            // ../dk.itu.bddtransform.ui/src-gen/dk/itu/bddctransform/ui/contentassist/antlr/internal/InternalLettuce.g:2362:2: rule__Fail__Group__2__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Fail__Group__2__Impl_in_rule__Fail__Group__24719);
            rule__Fail__Group__2__Impl();

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
    // $ANTLR end "rule__Fail__Group__2"


    // $ANTLR start "rule__Fail__Group__2__Impl"
    // ../dk.itu.bddtransform.ui/src-gen/dk/itu/bddctransform/ui/contentassist/antlr/internal/InternalLettuce.g:2368:1: rule__Fail__Group__2__Impl : ( ( rule__Fail__Group_2__0 )? ) ;
    public final void rule__Fail__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.bddtransform.ui/src-gen/dk/itu/bddctransform/ui/contentassist/antlr/internal/InternalLettuce.g:2372:1: ( ( ( rule__Fail__Group_2__0 )? ) )
            // ../dk.itu.bddtransform.ui/src-gen/dk/itu/bddctransform/ui/contentassist/antlr/internal/InternalLettuce.g:2373:1: ( ( rule__Fail__Group_2__0 )? )
            {
            // ../dk.itu.bddtransform.ui/src-gen/dk/itu/bddctransform/ui/contentassist/antlr/internal/InternalLettuce.g:2373:1: ( ( rule__Fail__Group_2__0 )? )
            // ../dk.itu.bddtransform.ui/src-gen/dk/itu/bddctransform/ui/contentassist/antlr/internal/InternalLettuce.g:2374:1: ( rule__Fail__Group_2__0 )?
            {
             before(grammarAccess.getFailAccess().getGroup_2()); 
            // ../dk.itu.bddtransform.ui/src-gen/dk/itu/bddctransform/ui/contentassist/antlr/internal/InternalLettuce.g:2375:1: ( rule__Fail__Group_2__0 )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==32) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // ../dk.itu.bddtransform.ui/src-gen/dk/itu/bddctransform/ui/contentassist/antlr/internal/InternalLettuce.g:2375:2: rule__Fail__Group_2__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__Fail__Group_2__0_in_rule__Fail__Group__2__Impl4746);
                    rule__Fail__Group_2__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getFailAccess().getGroup_2()); 

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
    // $ANTLR end "rule__Fail__Group__2__Impl"


    // $ANTLR start "rule__Fail__Group_2__0"
    // ../dk.itu.bddtransform.ui/src-gen/dk/itu/bddctransform/ui/contentassist/antlr/internal/InternalLettuce.g:2391:1: rule__Fail__Group_2__0 : rule__Fail__Group_2__0__Impl rule__Fail__Group_2__1 ;
    public final void rule__Fail__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.bddtransform.ui/src-gen/dk/itu/bddctransform/ui/contentassist/antlr/internal/InternalLettuce.g:2395:1: ( rule__Fail__Group_2__0__Impl rule__Fail__Group_2__1 )
            // ../dk.itu.bddtransform.ui/src-gen/dk/itu/bddctransform/ui/contentassist/antlr/internal/InternalLettuce.g:2396:2: rule__Fail__Group_2__0__Impl rule__Fail__Group_2__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Fail__Group_2__0__Impl_in_rule__Fail__Group_2__04783);
            rule__Fail__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Fail__Group_2__1_in_rule__Fail__Group_2__04786);
            rule__Fail__Group_2__1();

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
    // $ANTLR end "rule__Fail__Group_2__0"


    // $ANTLR start "rule__Fail__Group_2__0__Impl"
    // ../dk.itu.bddtransform.ui/src-gen/dk/itu/bddctransform/ui/contentassist/antlr/internal/InternalLettuce.g:2403:1: rule__Fail__Group_2__0__Impl : ( 'message' ) ;
    public final void rule__Fail__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.bddtransform.ui/src-gen/dk/itu/bddctransform/ui/contentassist/antlr/internal/InternalLettuce.g:2407:1: ( ( 'message' ) )
            // ../dk.itu.bddtransform.ui/src-gen/dk/itu/bddctransform/ui/contentassist/antlr/internal/InternalLettuce.g:2408:1: ( 'message' )
            {
            // ../dk.itu.bddtransform.ui/src-gen/dk/itu/bddctransform/ui/contentassist/antlr/internal/InternalLettuce.g:2408:1: ( 'message' )
            // ../dk.itu.bddtransform.ui/src-gen/dk/itu/bddctransform/ui/contentassist/antlr/internal/InternalLettuce.g:2409:1: 'message'
            {
             before(grammarAccess.getFailAccess().getMessageKeyword_2_0()); 
            match(input,32,FollowSets000.FOLLOW_32_in_rule__Fail__Group_2__0__Impl4814); 
             after(grammarAccess.getFailAccess().getMessageKeyword_2_0()); 

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
    // $ANTLR end "rule__Fail__Group_2__0__Impl"


    // $ANTLR start "rule__Fail__Group_2__1"
    // ../dk.itu.bddtransform.ui/src-gen/dk/itu/bddctransform/ui/contentassist/antlr/internal/InternalLettuce.g:2422:1: rule__Fail__Group_2__1 : rule__Fail__Group_2__1__Impl ;
    public final void rule__Fail__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.bddtransform.ui/src-gen/dk/itu/bddctransform/ui/contentassist/antlr/internal/InternalLettuce.g:2426:1: ( rule__Fail__Group_2__1__Impl )
            // ../dk.itu.bddtransform.ui/src-gen/dk/itu/bddctransform/ui/contentassist/antlr/internal/InternalLettuce.g:2427:2: rule__Fail__Group_2__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Fail__Group_2__1__Impl_in_rule__Fail__Group_2__14845);
            rule__Fail__Group_2__1__Impl();

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
    // $ANTLR end "rule__Fail__Group_2__1"


    // $ANTLR start "rule__Fail__Group_2__1__Impl"
    // ../dk.itu.bddtransform.ui/src-gen/dk/itu/bddctransform/ui/contentassist/antlr/internal/InternalLettuce.g:2433:1: rule__Fail__Group_2__1__Impl : ( ( rule__Fail__MessageAssignment_2_1 ) ) ;
    public final void rule__Fail__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.bddtransform.ui/src-gen/dk/itu/bddctransform/ui/contentassist/antlr/internal/InternalLettuce.g:2437:1: ( ( ( rule__Fail__MessageAssignment_2_1 ) ) )
            // ../dk.itu.bddtransform.ui/src-gen/dk/itu/bddctransform/ui/contentassist/antlr/internal/InternalLettuce.g:2438:1: ( ( rule__Fail__MessageAssignment_2_1 ) )
            {
            // ../dk.itu.bddtransform.ui/src-gen/dk/itu/bddctransform/ui/contentassist/antlr/internal/InternalLettuce.g:2438:1: ( ( rule__Fail__MessageAssignment_2_1 ) )
            // ../dk.itu.bddtransform.ui/src-gen/dk/itu/bddctransform/ui/contentassist/antlr/internal/InternalLettuce.g:2439:1: ( rule__Fail__MessageAssignment_2_1 )
            {
             before(grammarAccess.getFailAccess().getMessageAssignment_2_1()); 
            // ../dk.itu.bddtransform.ui/src-gen/dk/itu/bddctransform/ui/contentassist/antlr/internal/InternalLettuce.g:2440:1: ( rule__Fail__MessageAssignment_2_1 )
            // ../dk.itu.bddtransform.ui/src-gen/dk/itu/bddctransform/ui/contentassist/antlr/internal/InternalLettuce.g:2440:2: rule__Fail__MessageAssignment_2_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Fail__MessageAssignment_2_1_in_rule__Fail__Group_2__1__Impl4872);
            rule__Fail__MessageAssignment_2_1();

            state._fsp--;


            }

             after(grammarAccess.getFailAccess().getMessageAssignment_2_1()); 

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
    // $ANTLR end "rule__Fail__Group_2__1__Impl"


    // $ANTLR start "rule__KeyValue__Group__0"
    // ../dk.itu.bddtransform.ui/src-gen/dk/itu/bddctransform/ui/contentassist/antlr/internal/InternalLettuce.g:2454:1: rule__KeyValue__Group__0 : rule__KeyValue__Group__0__Impl rule__KeyValue__Group__1 ;
    public final void rule__KeyValue__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.bddtransform.ui/src-gen/dk/itu/bddctransform/ui/contentassist/antlr/internal/InternalLettuce.g:2458:1: ( rule__KeyValue__Group__0__Impl rule__KeyValue__Group__1 )
            // ../dk.itu.bddtransform.ui/src-gen/dk/itu/bddctransform/ui/contentassist/antlr/internal/InternalLettuce.g:2459:2: rule__KeyValue__Group__0__Impl rule__KeyValue__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__KeyValue__Group__0__Impl_in_rule__KeyValue__Group__04906);
            rule__KeyValue__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__KeyValue__Group__1_in_rule__KeyValue__Group__04909);
            rule__KeyValue__Group__1();

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
    // $ANTLR end "rule__KeyValue__Group__0"


    // $ANTLR start "rule__KeyValue__Group__0__Impl"
    // ../dk.itu.bddtransform.ui/src-gen/dk/itu/bddctransform/ui/contentassist/antlr/internal/InternalLettuce.g:2466:1: rule__KeyValue__Group__0__Impl : ( () ) ;
    public final void rule__KeyValue__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.bddtransform.ui/src-gen/dk/itu/bddctransform/ui/contentassist/antlr/internal/InternalLettuce.g:2470:1: ( ( () ) )
            // ../dk.itu.bddtransform.ui/src-gen/dk/itu/bddctransform/ui/contentassist/antlr/internal/InternalLettuce.g:2471:1: ( () )
            {
            // ../dk.itu.bddtransform.ui/src-gen/dk/itu/bddctransform/ui/contentassist/antlr/internal/InternalLettuce.g:2471:1: ( () )
            // ../dk.itu.bddtransform.ui/src-gen/dk/itu/bddctransform/ui/contentassist/antlr/internal/InternalLettuce.g:2472:1: ()
            {
             before(grammarAccess.getKeyValueAccess().getKeyValueAction_0()); 
            // ../dk.itu.bddtransform.ui/src-gen/dk/itu/bddctransform/ui/contentassist/antlr/internal/InternalLettuce.g:2473:1: ()
            // ../dk.itu.bddtransform.ui/src-gen/dk/itu/bddctransform/ui/contentassist/antlr/internal/InternalLettuce.g:2475:1: 
            {
            }

             after(grammarAccess.getKeyValueAccess().getKeyValueAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__KeyValue__Group__0__Impl"


    // $ANTLR start "rule__KeyValue__Group__1"
    // ../dk.itu.bddtransform.ui/src-gen/dk/itu/bddctransform/ui/contentassist/antlr/internal/InternalLettuce.g:2485:1: rule__KeyValue__Group__1 : rule__KeyValue__Group__1__Impl rule__KeyValue__Group__2 ;
    public final void rule__KeyValue__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.bddtransform.ui/src-gen/dk/itu/bddctransform/ui/contentassist/antlr/internal/InternalLettuce.g:2489:1: ( rule__KeyValue__Group__1__Impl rule__KeyValue__Group__2 )
            // ../dk.itu.bddtransform.ui/src-gen/dk/itu/bddctransform/ui/contentassist/antlr/internal/InternalLettuce.g:2490:2: rule__KeyValue__Group__1__Impl rule__KeyValue__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__KeyValue__Group__1__Impl_in_rule__KeyValue__Group__14967);
            rule__KeyValue__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__KeyValue__Group__2_in_rule__KeyValue__Group__14970);
            rule__KeyValue__Group__2();

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
    // $ANTLR end "rule__KeyValue__Group__1"


    // $ANTLR start "rule__KeyValue__Group__1__Impl"
    // ../dk.itu.bddtransform.ui/src-gen/dk/itu/bddctransform/ui/contentassist/antlr/internal/InternalLettuce.g:2497:1: rule__KeyValue__Group__1__Impl : ( ( rule__KeyValue__KeyAssignment_1 ) ) ;
    public final void rule__KeyValue__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.bddtransform.ui/src-gen/dk/itu/bddctransform/ui/contentassist/antlr/internal/InternalLettuce.g:2501:1: ( ( ( rule__KeyValue__KeyAssignment_1 ) ) )
            // ../dk.itu.bddtransform.ui/src-gen/dk/itu/bddctransform/ui/contentassist/antlr/internal/InternalLettuce.g:2502:1: ( ( rule__KeyValue__KeyAssignment_1 ) )
            {
            // ../dk.itu.bddtransform.ui/src-gen/dk/itu/bddctransform/ui/contentassist/antlr/internal/InternalLettuce.g:2502:1: ( ( rule__KeyValue__KeyAssignment_1 ) )
            // ../dk.itu.bddtransform.ui/src-gen/dk/itu/bddctransform/ui/contentassist/antlr/internal/InternalLettuce.g:2503:1: ( rule__KeyValue__KeyAssignment_1 )
            {
             before(grammarAccess.getKeyValueAccess().getKeyAssignment_1()); 
            // ../dk.itu.bddtransform.ui/src-gen/dk/itu/bddctransform/ui/contentassist/antlr/internal/InternalLettuce.g:2504:1: ( rule__KeyValue__KeyAssignment_1 )
            // ../dk.itu.bddtransform.ui/src-gen/dk/itu/bddctransform/ui/contentassist/antlr/internal/InternalLettuce.g:2504:2: rule__KeyValue__KeyAssignment_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__KeyValue__KeyAssignment_1_in_rule__KeyValue__Group__1__Impl4997);
            rule__KeyValue__KeyAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getKeyValueAccess().getKeyAssignment_1()); 

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
    // $ANTLR end "rule__KeyValue__Group__1__Impl"


    // $ANTLR start "rule__KeyValue__Group__2"
    // ../dk.itu.bddtransform.ui/src-gen/dk/itu/bddctransform/ui/contentassist/antlr/internal/InternalLettuce.g:2514:1: rule__KeyValue__Group__2 : rule__KeyValue__Group__2__Impl rule__KeyValue__Group__3 ;
    public final void rule__KeyValue__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.bddtransform.ui/src-gen/dk/itu/bddctransform/ui/contentassist/antlr/internal/InternalLettuce.g:2518:1: ( rule__KeyValue__Group__2__Impl rule__KeyValue__Group__3 )
            // ../dk.itu.bddtransform.ui/src-gen/dk/itu/bddctransform/ui/contentassist/antlr/internal/InternalLettuce.g:2519:2: rule__KeyValue__Group__2__Impl rule__KeyValue__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__KeyValue__Group__2__Impl_in_rule__KeyValue__Group__25027);
            rule__KeyValue__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__KeyValue__Group__3_in_rule__KeyValue__Group__25030);
            rule__KeyValue__Group__3();

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
    // $ANTLR end "rule__KeyValue__Group__2"


    // $ANTLR start "rule__KeyValue__Group__2__Impl"
    // ../dk.itu.bddtransform.ui/src-gen/dk/itu/bddctransform/ui/contentassist/antlr/internal/InternalLettuce.g:2526:1: rule__KeyValue__Group__2__Impl : ( '=' ) ;
    public final void rule__KeyValue__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.bddtransform.ui/src-gen/dk/itu/bddctransform/ui/contentassist/antlr/internal/InternalLettuce.g:2530:1: ( ( '=' ) )
            // ../dk.itu.bddtransform.ui/src-gen/dk/itu/bddctransform/ui/contentassist/antlr/internal/InternalLettuce.g:2531:1: ( '=' )
            {
            // ../dk.itu.bddtransform.ui/src-gen/dk/itu/bddctransform/ui/contentassist/antlr/internal/InternalLettuce.g:2531:1: ( '=' )
            // ../dk.itu.bddtransform.ui/src-gen/dk/itu/bddctransform/ui/contentassist/antlr/internal/InternalLettuce.g:2532:1: '='
            {
             before(grammarAccess.getKeyValueAccess().getEqualsSignKeyword_2()); 
            match(input,33,FollowSets000.FOLLOW_33_in_rule__KeyValue__Group__2__Impl5058); 
             after(grammarAccess.getKeyValueAccess().getEqualsSignKeyword_2()); 

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
    // $ANTLR end "rule__KeyValue__Group__2__Impl"


    // $ANTLR start "rule__KeyValue__Group__3"
    // ../dk.itu.bddtransform.ui/src-gen/dk/itu/bddctransform/ui/contentassist/antlr/internal/InternalLettuce.g:2545:1: rule__KeyValue__Group__3 : rule__KeyValue__Group__3__Impl ;
    public final void rule__KeyValue__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.bddtransform.ui/src-gen/dk/itu/bddctransform/ui/contentassist/antlr/internal/InternalLettuce.g:2549:1: ( rule__KeyValue__Group__3__Impl )
            // ../dk.itu.bddtransform.ui/src-gen/dk/itu/bddctransform/ui/contentassist/antlr/internal/InternalLettuce.g:2550:2: rule__KeyValue__Group__3__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__KeyValue__Group__3__Impl_in_rule__KeyValue__Group__35089);
            rule__KeyValue__Group__3__Impl();

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
    // $ANTLR end "rule__KeyValue__Group__3"


    // $ANTLR start "rule__KeyValue__Group__3__Impl"
    // ../dk.itu.bddtransform.ui/src-gen/dk/itu/bddctransform/ui/contentassist/antlr/internal/InternalLettuce.g:2556:1: rule__KeyValue__Group__3__Impl : ( ( rule__KeyValue__Alternatives_3 ) ) ;
    public final void rule__KeyValue__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.bddtransform.ui/src-gen/dk/itu/bddctransform/ui/contentassist/antlr/internal/InternalLettuce.g:2560:1: ( ( ( rule__KeyValue__Alternatives_3 ) ) )
            // ../dk.itu.bddtransform.ui/src-gen/dk/itu/bddctransform/ui/contentassist/antlr/internal/InternalLettuce.g:2561:1: ( ( rule__KeyValue__Alternatives_3 ) )
            {
            // ../dk.itu.bddtransform.ui/src-gen/dk/itu/bddctransform/ui/contentassist/antlr/internal/InternalLettuce.g:2561:1: ( ( rule__KeyValue__Alternatives_3 ) )
            // ../dk.itu.bddtransform.ui/src-gen/dk/itu/bddctransform/ui/contentassist/antlr/internal/InternalLettuce.g:2562:1: ( rule__KeyValue__Alternatives_3 )
            {
             before(grammarAccess.getKeyValueAccess().getAlternatives_3()); 
            // ../dk.itu.bddtransform.ui/src-gen/dk/itu/bddctransform/ui/contentassist/antlr/internal/InternalLettuce.g:2563:1: ( rule__KeyValue__Alternatives_3 )
            // ../dk.itu.bddtransform.ui/src-gen/dk/itu/bddctransform/ui/contentassist/antlr/internal/InternalLettuce.g:2563:2: rule__KeyValue__Alternatives_3
            {
            pushFollow(FollowSets000.FOLLOW_rule__KeyValue__Alternatives_3_in_rule__KeyValue__Group__3__Impl5116);
            rule__KeyValue__Alternatives_3();

            state._fsp--;


            }

             after(grammarAccess.getKeyValueAccess().getAlternatives_3()); 

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
    // $ANTLR end "rule__KeyValue__Group__3__Impl"


    // $ANTLR start "rule__TransformModel___NameAssignment_2"
    // ../dk.itu.bddtransform.ui/src-gen/dk/itu/bddctransform/ui/contentassist/antlr/internal/InternalLettuce.g:2582:1: rule__TransformModel___NameAssignment_2 : ( ruleEString ) ;
    public final void rule__TransformModel___NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.bddtransform.ui/src-gen/dk/itu/bddctransform/ui/contentassist/antlr/internal/InternalLettuce.g:2586:1: ( ( ruleEString ) )
            // ../dk.itu.bddtransform.ui/src-gen/dk/itu/bddctransform/ui/contentassist/antlr/internal/InternalLettuce.g:2587:1: ( ruleEString )
            {
            // ../dk.itu.bddtransform.ui/src-gen/dk/itu/bddctransform/ui/contentassist/antlr/internal/InternalLettuce.g:2587:1: ( ruleEString )
            // ../dk.itu.bddtransform.ui/src-gen/dk/itu/bddctransform/ui/contentassist/antlr/internal/InternalLettuce.g:2588:1: ruleEString
            {
             before(grammarAccess.getTransformModel_Access().getNameEStringParserRuleCall_2_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__TransformModel___NameAssignment_25159);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getTransformModel_Access().getNameEStringParserRuleCall_2_0()); 

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
    // $ANTLR end "rule__TransformModel___NameAssignment_2"


    // $ANTLR start "rule__TransformModel___RulesAssignment_3_0"
    // ../dk.itu.bddtransform.ui/src-gen/dk/itu/bddctransform/ui/contentassist/antlr/internal/InternalLettuce.g:2597:1: rule__TransformModel___RulesAssignment_3_0 : ( ruleRule ) ;
    public final void rule__TransformModel___RulesAssignment_3_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.bddtransform.ui/src-gen/dk/itu/bddctransform/ui/contentassist/antlr/internal/InternalLettuce.g:2601:1: ( ( ruleRule ) )
            // ../dk.itu.bddtransform.ui/src-gen/dk/itu/bddctransform/ui/contentassist/antlr/internal/InternalLettuce.g:2602:1: ( ruleRule )
            {
            // ../dk.itu.bddtransform.ui/src-gen/dk/itu/bddctransform/ui/contentassist/antlr/internal/InternalLettuce.g:2602:1: ( ruleRule )
            // ../dk.itu.bddtransform.ui/src-gen/dk/itu/bddctransform/ui/contentassist/antlr/internal/InternalLettuce.g:2603:1: ruleRule
            {
             before(grammarAccess.getTransformModel_Access().getRulesRuleParserRuleCall_3_0_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleRule_in_rule__TransformModel___RulesAssignment_3_05190);
            ruleRule();

            state._fsp--;

             after(grammarAccess.getTransformModel_Access().getRulesRuleParserRuleCall_3_0_0()); 

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
    // $ANTLR end "rule__TransformModel___RulesAssignment_3_0"


    // $ANTLR start "rule__TransformModel___BehaviorsAssignment_3_1"
    // ../dk.itu.bddtransform.ui/src-gen/dk/itu/bddctransform/ui/contentassist/antlr/internal/InternalLettuce.g:2612:1: rule__TransformModel___BehaviorsAssignment_3_1 : ( ruleBehavior ) ;
    public final void rule__TransformModel___BehaviorsAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.bddtransform.ui/src-gen/dk/itu/bddctransform/ui/contentassist/antlr/internal/InternalLettuce.g:2616:1: ( ( ruleBehavior ) )
            // ../dk.itu.bddtransform.ui/src-gen/dk/itu/bddctransform/ui/contentassist/antlr/internal/InternalLettuce.g:2617:1: ( ruleBehavior )
            {
            // ../dk.itu.bddtransform.ui/src-gen/dk/itu/bddctransform/ui/contentassist/antlr/internal/InternalLettuce.g:2617:1: ( ruleBehavior )
            // ../dk.itu.bddtransform.ui/src-gen/dk/itu/bddctransform/ui/contentassist/antlr/internal/InternalLettuce.g:2618:1: ruleBehavior
            {
             before(grammarAccess.getTransformModel_Access().getBehaviorsBehaviorParserRuleCall_3_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleBehavior_in_rule__TransformModel___BehaviorsAssignment_3_15221);
            ruleBehavior();

            state._fsp--;

             after(grammarAccess.getTransformModel_Access().getBehaviorsBehaviorParserRuleCall_3_1_0()); 

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
    // $ANTLR end "rule__TransformModel___BehaviorsAssignment_3_1"


    // $ANTLR start "rule__Behavior__DescriptionAssignment_1"
    // ../dk.itu.bddtransform.ui/src-gen/dk/itu/bddctransform/ui/contentassist/antlr/internal/InternalLettuce.g:2627:1: rule__Behavior__DescriptionAssignment_1 : ( ruleEString ) ;
    public final void rule__Behavior__DescriptionAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.bddtransform.ui/src-gen/dk/itu/bddctransform/ui/contentassist/antlr/internal/InternalLettuce.g:2631:1: ( ( ruleEString ) )
            // ../dk.itu.bddtransform.ui/src-gen/dk/itu/bddctransform/ui/contentassist/antlr/internal/InternalLettuce.g:2632:1: ( ruleEString )
            {
            // ../dk.itu.bddtransform.ui/src-gen/dk/itu/bddctransform/ui/contentassist/antlr/internal/InternalLettuce.g:2632:1: ( ruleEString )
            // ../dk.itu.bddtransform.ui/src-gen/dk/itu/bddctransform/ui/contentassist/antlr/internal/InternalLettuce.g:2633:1: ruleEString
            {
             before(grammarAccess.getBehaviorAccess().getDescriptionEStringParserRuleCall_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__Behavior__DescriptionAssignment_15252);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getBehaviorAccess().getDescriptionEStringParserRuleCall_1_0()); 

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


    // $ANTLR start "rule__Behavior__ClassAssignment_3"
    // ../dk.itu.bddtransform.ui/src-gen/dk/itu/bddctransform/ui/contentassist/antlr/internal/InternalLettuce.g:2642:1: rule__Behavior__ClassAssignment_3 : ( ruleEString ) ;
    public final void rule__Behavior__ClassAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.bddtransform.ui/src-gen/dk/itu/bddctransform/ui/contentassist/antlr/internal/InternalLettuce.g:2646:1: ( ( ruleEString ) )
            // ../dk.itu.bddtransform.ui/src-gen/dk/itu/bddctransform/ui/contentassist/antlr/internal/InternalLettuce.g:2647:1: ( ruleEString )
            {
            // ../dk.itu.bddtransform.ui/src-gen/dk/itu/bddctransform/ui/contentassist/antlr/internal/InternalLettuce.g:2647:1: ( ruleEString )
            // ../dk.itu.bddtransform.ui/src-gen/dk/itu/bddctransform/ui/contentassist/antlr/internal/InternalLettuce.g:2648:1: ruleEString
            {
             before(grammarAccess.getBehaviorAccess().getClassEStringParserRuleCall_3_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__Behavior__ClassAssignment_35283);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getBehaviorAccess().getClassEStringParserRuleCall_3_0()); 

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
    // $ANTLR end "rule__Behavior__ClassAssignment_3"


    // $ANTLR start "rule__Behavior__SignatureAssignment_5"
    // ../dk.itu.bddtransform.ui/src-gen/dk/itu/bddctransform/ui/contentassist/antlr/internal/InternalLettuce.g:2657:1: rule__Behavior__SignatureAssignment_5 : ( ruleEString ) ;
    public final void rule__Behavior__SignatureAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.bddtransform.ui/src-gen/dk/itu/bddctransform/ui/contentassist/antlr/internal/InternalLettuce.g:2661:1: ( ( ruleEString ) )
            // ../dk.itu.bddtransform.ui/src-gen/dk/itu/bddctransform/ui/contentassist/antlr/internal/InternalLettuce.g:2662:1: ( ruleEString )
            {
            // ../dk.itu.bddtransform.ui/src-gen/dk/itu/bddctransform/ui/contentassist/antlr/internal/InternalLettuce.g:2662:1: ( ruleEString )
            // ../dk.itu.bddtransform.ui/src-gen/dk/itu/bddctransform/ui/contentassist/antlr/internal/InternalLettuce.g:2663:1: ruleEString
            {
             before(grammarAccess.getBehaviorAccess().getSignatureEStringParserRuleCall_5_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__Behavior__SignatureAssignment_55314);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getBehaviorAccess().getSignatureEStringParserRuleCall_5_0()); 

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
    // $ANTLR end "rule__Behavior__SignatureAssignment_5"


    // $ANTLR start "rule__Rule__NameAssignment_1"
    // ../dk.itu.bddtransform.ui/src-gen/dk/itu/bddctransform/ui/contentassist/antlr/internal/InternalLettuce.g:2672:1: rule__Rule__NameAssignment_1 : ( ruleRuleId ) ;
    public final void rule__Rule__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.bddtransform.ui/src-gen/dk/itu/bddctransform/ui/contentassist/antlr/internal/InternalLettuce.g:2676:1: ( ( ruleRuleId ) )
            // ../dk.itu.bddtransform.ui/src-gen/dk/itu/bddctransform/ui/contentassist/antlr/internal/InternalLettuce.g:2677:1: ( ruleRuleId )
            {
            // ../dk.itu.bddtransform.ui/src-gen/dk/itu/bddctransform/ui/contentassist/antlr/internal/InternalLettuce.g:2677:1: ( ruleRuleId )
            // ../dk.itu.bddtransform.ui/src-gen/dk/itu/bddctransform/ui/contentassist/antlr/internal/InternalLettuce.g:2678:1: ruleRuleId
            {
             before(grammarAccess.getRuleAccess().getNameRuleIdParserRuleCall_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleRuleId_in_rule__Rule__NameAssignment_15345);
            ruleRuleId();

            state._fsp--;

             after(grammarAccess.getRuleAccess().getNameRuleIdParserRuleCall_1_0()); 

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
    // $ANTLR end "rule__Rule__NameAssignment_1"


    // $ANTLR start "rule__Rule__PatternsAssignment_2"
    // ../dk.itu.bddtransform.ui/src-gen/dk/itu/bddctransform/ui/contentassist/antlr/internal/InternalLettuce.g:2687:1: rule__Rule__PatternsAssignment_2 : ( rulePattern ) ;
    public final void rule__Rule__PatternsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.bddtransform.ui/src-gen/dk/itu/bddctransform/ui/contentassist/antlr/internal/InternalLettuce.g:2691:1: ( ( rulePattern ) )
            // ../dk.itu.bddtransform.ui/src-gen/dk/itu/bddctransform/ui/contentassist/antlr/internal/InternalLettuce.g:2692:1: ( rulePattern )
            {
            // ../dk.itu.bddtransform.ui/src-gen/dk/itu/bddctransform/ui/contentassist/antlr/internal/InternalLettuce.g:2692:1: ( rulePattern )
            // ../dk.itu.bddtransform.ui/src-gen/dk/itu/bddctransform/ui/contentassist/antlr/internal/InternalLettuce.g:2693:1: rulePattern
            {
             before(grammarAccess.getRuleAccess().getPatternsPatternParserRuleCall_2_0()); 
            pushFollow(FollowSets000.FOLLOW_rulePattern_in_rule__Rule__PatternsAssignment_25376);
            rulePattern();

            state._fsp--;

             after(grammarAccess.getRuleAccess().getPatternsPatternParserRuleCall_2_0()); 

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
    // $ANTLR end "rule__Rule__PatternsAssignment_2"


    // $ANTLR start "rule__Rule__PatternsAssignment_3"
    // ../dk.itu.bddtransform.ui/src-gen/dk/itu/bddctransform/ui/contentassist/antlr/internal/InternalLettuce.g:2702:1: rule__Rule__PatternsAssignment_3 : ( rulePattern ) ;
    public final void rule__Rule__PatternsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.bddtransform.ui/src-gen/dk/itu/bddctransform/ui/contentassist/antlr/internal/InternalLettuce.g:2706:1: ( ( rulePattern ) )
            // ../dk.itu.bddtransform.ui/src-gen/dk/itu/bddctransform/ui/contentassist/antlr/internal/InternalLettuce.g:2707:1: ( rulePattern )
            {
            // ../dk.itu.bddtransform.ui/src-gen/dk/itu/bddctransform/ui/contentassist/antlr/internal/InternalLettuce.g:2707:1: ( rulePattern )
            // ../dk.itu.bddtransform.ui/src-gen/dk/itu/bddctransform/ui/contentassist/antlr/internal/InternalLettuce.g:2708:1: rulePattern
            {
             before(grammarAccess.getRuleAccess().getPatternsPatternParserRuleCall_3_0()); 
            pushFollow(FollowSets000.FOLLOW_rulePattern_in_rule__Rule__PatternsAssignment_35407);
            rulePattern();

            state._fsp--;

             after(grammarAccess.getRuleAccess().getPatternsPatternParserRuleCall_3_0()); 

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
    // $ANTLR end "rule__Rule__PatternsAssignment_3"


    // $ANTLR start "rule__Rule__TransformationAssignment_4"
    // ../dk.itu.bddtransform.ui/src-gen/dk/itu/bddctransform/ui/contentassist/antlr/internal/InternalLettuce.g:2717:1: rule__Rule__TransformationAssignment_4 : ( ruleTransformation ) ;
    public final void rule__Rule__TransformationAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.bddtransform.ui/src-gen/dk/itu/bddctransform/ui/contentassist/antlr/internal/InternalLettuce.g:2721:1: ( ( ruleTransformation ) )
            // ../dk.itu.bddtransform.ui/src-gen/dk/itu/bddctransform/ui/contentassist/antlr/internal/InternalLettuce.g:2722:1: ( ruleTransformation )
            {
            // ../dk.itu.bddtransform.ui/src-gen/dk/itu/bddctransform/ui/contentassist/antlr/internal/InternalLettuce.g:2722:1: ( ruleTransformation )
            // ../dk.itu.bddtransform.ui/src-gen/dk/itu/bddctransform/ui/contentassist/antlr/internal/InternalLettuce.g:2723:1: ruleTransformation
            {
             before(grammarAccess.getRuleAccess().getTransformationTransformationParserRuleCall_4_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleTransformation_in_rule__Rule__TransformationAssignment_45438);
            ruleTransformation();

            state._fsp--;

             after(grammarAccess.getRuleAccess().getTransformationTransformationParserRuleCall_4_0()); 

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
    // $ANTLR end "rule__Rule__TransformationAssignment_4"


    // $ANTLR start "rule__ExactSting__ContentAssignment"
    // ../dk.itu.bddtransform.ui/src-gen/dk/itu/bddctransform/ui/contentassist/antlr/internal/InternalLettuce.g:2732:1: rule__ExactSting__ContentAssignment : ( ruleEString ) ;
    public final void rule__ExactSting__ContentAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.bddtransform.ui/src-gen/dk/itu/bddctransform/ui/contentassist/antlr/internal/InternalLettuce.g:2736:1: ( ( ruleEString ) )
            // ../dk.itu.bddtransform.ui/src-gen/dk/itu/bddctransform/ui/contentassist/antlr/internal/InternalLettuce.g:2737:1: ( ruleEString )
            {
            // ../dk.itu.bddtransform.ui/src-gen/dk/itu/bddctransform/ui/contentassist/antlr/internal/InternalLettuce.g:2737:1: ( ruleEString )
            // ../dk.itu.bddtransform.ui/src-gen/dk/itu/bddctransform/ui/contentassist/antlr/internal/InternalLettuce.g:2738:1: ruleEString
            {
             before(grammarAccess.getExactStingAccess().getContentEStringParserRuleCall_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__ExactSting__ContentAssignment5469);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getExactStingAccess().getContentEStringParserRuleCall_0()); 

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
    // $ANTLR end "rule__ExactSting__ContentAssignment"


    // $ANTLR start "rule__Variable__NameAssignment_1"
    // ../dk.itu.bddtransform.ui/src-gen/dk/itu/bddctransform/ui/contentassist/antlr/internal/InternalLettuce.g:2747:1: rule__Variable__NameAssignment_1 : ( ruleVariableId ) ;
    public final void rule__Variable__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.bddtransform.ui/src-gen/dk/itu/bddctransform/ui/contentassist/antlr/internal/InternalLettuce.g:2751:1: ( ( ruleVariableId ) )
            // ../dk.itu.bddtransform.ui/src-gen/dk/itu/bddctransform/ui/contentassist/antlr/internal/InternalLettuce.g:2752:1: ( ruleVariableId )
            {
            // ../dk.itu.bddtransform.ui/src-gen/dk/itu/bddctransform/ui/contentassist/antlr/internal/InternalLettuce.g:2752:1: ( ruleVariableId )
            // ../dk.itu.bddtransform.ui/src-gen/dk/itu/bddctransform/ui/contentassist/antlr/internal/InternalLettuce.g:2753:1: ruleVariableId
            {
             before(grammarAccess.getVariableAccess().getNameVariableIdParserRuleCall_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleVariableId_in_rule__Variable__NameAssignment_15500);
            ruleVariableId();

            state._fsp--;

             after(grammarAccess.getVariableAccess().getNameVariableIdParserRuleCall_1_0()); 

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
    // $ANTLR end "rule__Variable__NameAssignment_1"


    // $ANTLR start "rule__Alternation__ChoicesAssignment_1"
    // ../dk.itu.bddtransform.ui/src-gen/dk/itu/bddctransform/ui/contentassist/antlr/internal/InternalLettuce.g:2762:1: rule__Alternation__ChoicesAssignment_1 : ( rulePattern ) ;
    public final void rule__Alternation__ChoicesAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.bddtransform.ui/src-gen/dk/itu/bddctransform/ui/contentassist/antlr/internal/InternalLettuce.g:2766:1: ( ( rulePattern ) )
            // ../dk.itu.bddtransform.ui/src-gen/dk/itu/bddctransform/ui/contentassist/antlr/internal/InternalLettuce.g:2767:1: ( rulePattern )
            {
            // ../dk.itu.bddtransform.ui/src-gen/dk/itu/bddctransform/ui/contentassist/antlr/internal/InternalLettuce.g:2767:1: ( rulePattern )
            // ../dk.itu.bddtransform.ui/src-gen/dk/itu/bddctransform/ui/contentassist/antlr/internal/InternalLettuce.g:2768:1: rulePattern
            {
             before(grammarAccess.getAlternationAccess().getChoicesPatternParserRuleCall_1_0()); 
            pushFollow(FollowSets000.FOLLOW_rulePattern_in_rule__Alternation__ChoicesAssignment_15531);
            rulePattern();

            state._fsp--;

             after(grammarAccess.getAlternationAccess().getChoicesPatternParserRuleCall_1_0()); 

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
    // $ANTLR end "rule__Alternation__ChoicesAssignment_1"


    // $ANTLR start "rule__Alternation__ChoicesAssignment_3"
    // ../dk.itu.bddtransform.ui/src-gen/dk/itu/bddctransform/ui/contentassist/antlr/internal/InternalLettuce.g:2777:1: rule__Alternation__ChoicesAssignment_3 : ( rulePattern ) ;
    public final void rule__Alternation__ChoicesAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.bddtransform.ui/src-gen/dk/itu/bddctransform/ui/contentassist/antlr/internal/InternalLettuce.g:2781:1: ( ( rulePattern ) )
            // ../dk.itu.bddtransform.ui/src-gen/dk/itu/bddctransform/ui/contentassist/antlr/internal/InternalLettuce.g:2782:1: ( rulePattern )
            {
            // ../dk.itu.bddtransform.ui/src-gen/dk/itu/bddctransform/ui/contentassist/antlr/internal/InternalLettuce.g:2782:1: ( rulePattern )
            // ../dk.itu.bddtransform.ui/src-gen/dk/itu/bddctransform/ui/contentassist/antlr/internal/InternalLettuce.g:2783:1: rulePattern
            {
             before(grammarAccess.getAlternationAccess().getChoicesPatternParserRuleCall_3_0()); 
            pushFollow(FollowSets000.FOLLOW_rulePattern_in_rule__Alternation__ChoicesAssignment_35562);
            rulePattern();

            state._fsp--;

             after(grammarAccess.getAlternationAccess().getChoicesPatternParserRuleCall_3_0()); 

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
    // $ANTLR end "rule__Alternation__ChoicesAssignment_3"


    // $ANTLR start "rule__Alternation__ChoicesAssignment_4_1"
    // ../dk.itu.bddtransform.ui/src-gen/dk/itu/bddctransform/ui/contentassist/antlr/internal/InternalLettuce.g:2792:1: rule__Alternation__ChoicesAssignment_4_1 : ( rulePattern ) ;
    public final void rule__Alternation__ChoicesAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.bddtransform.ui/src-gen/dk/itu/bddctransform/ui/contentassist/antlr/internal/InternalLettuce.g:2796:1: ( ( rulePattern ) )
            // ../dk.itu.bddtransform.ui/src-gen/dk/itu/bddctransform/ui/contentassist/antlr/internal/InternalLettuce.g:2797:1: ( rulePattern )
            {
            // ../dk.itu.bddtransform.ui/src-gen/dk/itu/bddctransform/ui/contentassist/antlr/internal/InternalLettuce.g:2797:1: ( rulePattern )
            // ../dk.itu.bddtransform.ui/src-gen/dk/itu/bddctransform/ui/contentassist/antlr/internal/InternalLettuce.g:2798:1: rulePattern
            {
             before(grammarAccess.getAlternationAccess().getChoicesPatternParserRuleCall_4_1_0()); 
            pushFollow(FollowSets000.FOLLOW_rulePattern_in_rule__Alternation__ChoicesAssignment_4_15593);
            rulePattern();

            state._fsp--;

             after(grammarAccess.getAlternationAccess().getChoicesPatternParserRuleCall_4_1_0()); 

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
    // $ANTLR end "rule__Alternation__ChoicesAssignment_4_1"


    // $ANTLR start "rule__Optional__ValueAssignment_1"
    // ../dk.itu.bddtransform.ui/src-gen/dk/itu/bddctransform/ui/contentassist/antlr/internal/InternalLettuce.g:2807:1: rule__Optional__ValueAssignment_1 : ( rulePattern ) ;
    public final void rule__Optional__ValueAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.bddtransform.ui/src-gen/dk/itu/bddctransform/ui/contentassist/antlr/internal/InternalLettuce.g:2811:1: ( ( rulePattern ) )
            // ../dk.itu.bddtransform.ui/src-gen/dk/itu/bddctransform/ui/contentassist/antlr/internal/InternalLettuce.g:2812:1: ( rulePattern )
            {
            // ../dk.itu.bddtransform.ui/src-gen/dk/itu/bddctransform/ui/contentassist/antlr/internal/InternalLettuce.g:2812:1: ( rulePattern )
            // ../dk.itu.bddtransform.ui/src-gen/dk/itu/bddctransform/ui/contentassist/antlr/internal/InternalLettuce.g:2813:1: rulePattern
            {
             before(grammarAccess.getOptionalAccess().getValuePatternParserRuleCall_1_0()); 
            pushFollow(FollowSets000.FOLLOW_rulePattern_in_rule__Optional__ValueAssignment_15624);
            rulePattern();

            state._fsp--;

             after(grammarAccess.getOptionalAccess().getValuePatternParserRuleCall_1_0()); 

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
    // $ANTLR end "rule__Optional__ValueAssignment_1"


    // $ANTLR start "rule__Optional__ValueAssignment_2"
    // ../dk.itu.bddtransform.ui/src-gen/dk/itu/bddctransform/ui/contentassist/antlr/internal/InternalLettuce.g:2822:1: rule__Optional__ValueAssignment_2 : ( rulePattern ) ;
    public final void rule__Optional__ValueAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.bddtransform.ui/src-gen/dk/itu/bddctransform/ui/contentassist/antlr/internal/InternalLettuce.g:2826:1: ( ( rulePattern ) )
            // ../dk.itu.bddtransform.ui/src-gen/dk/itu/bddctransform/ui/contentassist/antlr/internal/InternalLettuce.g:2827:1: ( rulePattern )
            {
            // ../dk.itu.bddtransform.ui/src-gen/dk/itu/bddctransform/ui/contentassist/antlr/internal/InternalLettuce.g:2827:1: ( rulePattern )
            // ../dk.itu.bddtransform.ui/src-gen/dk/itu/bddctransform/ui/contentassist/antlr/internal/InternalLettuce.g:2828:1: rulePattern
            {
             before(grammarAccess.getOptionalAccess().getValuePatternParserRuleCall_2_0()); 
            pushFollow(FollowSets000.FOLLOW_rulePattern_in_rule__Optional__ValueAssignment_25655);
            rulePattern();

            state._fsp--;

             after(grammarAccess.getOptionalAccess().getValuePatternParserRuleCall_2_0()); 

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
    // $ANTLR end "rule__Optional__ValueAssignment_2"


    // $ANTLR start "rule__Expression__ValueAssignment_1"
    // ../dk.itu.bddtransform.ui/src-gen/dk/itu/bddctransform/ui/contentassist/antlr/internal/InternalLettuce.g:2837:1: rule__Expression__ValueAssignment_1 : ( ruleEString ) ;
    public final void rule__Expression__ValueAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.bddtransform.ui/src-gen/dk/itu/bddctransform/ui/contentassist/antlr/internal/InternalLettuce.g:2841:1: ( ( ruleEString ) )
            // ../dk.itu.bddtransform.ui/src-gen/dk/itu/bddctransform/ui/contentassist/antlr/internal/InternalLettuce.g:2842:1: ( ruleEString )
            {
            // ../dk.itu.bddtransform.ui/src-gen/dk/itu/bddctransform/ui/contentassist/antlr/internal/InternalLettuce.g:2842:1: ( ruleEString )
            // ../dk.itu.bddtransform.ui/src-gen/dk/itu/bddctransform/ui/contentassist/antlr/internal/InternalLettuce.g:2843:1: ruleEString
            {
             before(grammarAccess.getExpressionAccess().getValueEStringParserRuleCall_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__Expression__ValueAssignment_15686);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getExpressionAccess().getValueEStringParserRuleCall_1_0()); 

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
    // $ANTLR end "rule__Expression__ValueAssignment_1"


    // $ANTLR start "rule__IfDef__VariablesAssignment_2"
    // ../dk.itu.bddtransform.ui/src-gen/dk/itu/bddctransform/ui/contentassist/antlr/internal/InternalLettuce.g:2852:1: rule__IfDef__VariablesAssignment_2 : ( ruleVariableId ) ;
    public final void rule__IfDef__VariablesAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.bddtransform.ui/src-gen/dk/itu/bddctransform/ui/contentassist/antlr/internal/InternalLettuce.g:2856:1: ( ( ruleVariableId ) )
            // ../dk.itu.bddtransform.ui/src-gen/dk/itu/bddctransform/ui/contentassist/antlr/internal/InternalLettuce.g:2857:1: ( ruleVariableId )
            {
            // ../dk.itu.bddtransform.ui/src-gen/dk/itu/bddctransform/ui/contentassist/antlr/internal/InternalLettuce.g:2857:1: ( ruleVariableId )
            // ../dk.itu.bddtransform.ui/src-gen/dk/itu/bddctransform/ui/contentassist/antlr/internal/InternalLettuce.g:2858:1: ruleVariableId
            {
             before(grammarAccess.getIfDefAccess().getVariablesVariableIdParserRuleCall_2_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleVariableId_in_rule__IfDef__VariablesAssignment_25717);
            ruleVariableId();

            state._fsp--;

             after(grammarAccess.getIfDefAccess().getVariablesVariableIdParserRuleCall_2_0()); 

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
    // $ANTLR end "rule__IfDef__VariablesAssignment_2"


    // $ANTLR start "rule__IfDef__VariablesAssignment_3_1"
    // ../dk.itu.bddtransform.ui/src-gen/dk/itu/bddctransform/ui/contentassist/antlr/internal/InternalLettuce.g:2867:1: rule__IfDef__VariablesAssignment_3_1 : ( ruleVariableId ) ;
    public final void rule__IfDef__VariablesAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.bddtransform.ui/src-gen/dk/itu/bddctransform/ui/contentassist/antlr/internal/InternalLettuce.g:2871:1: ( ( ruleVariableId ) )
            // ../dk.itu.bddtransform.ui/src-gen/dk/itu/bddctransform/ui/contentassist/antlr/internal/InternalLettuce.g:2872:1: ( ruleVariableId )
            {
            // ../dk.itu.bddtransform.ui/src-gen/dk/itu/bddctransform/ui/contentassist/antlr/internal/InternalLettuce.g:2872:1: ( ruleVariableId )
            // ../dk.itu.bddtransform.ui/src-gen/dk/itu/bddctransform/ui/contentassist/antlr/internal/InternalLettuce.g:2873:1: ruleVariableId
            {
             before(grammarAccess.getIfDefAccess().getVariablesVariableIdParserRuleCall_3_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleVariableId_in_rule__IfDef__VariablesAssignment_3_15748);
            ruleVariableId();

            state._fsp--;

             after(grammarAccess.getIfDefAccess().getVariablesVariableIdParserRuleCall_3_1_0()); 

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
    // $ANTLR end "rule__IfDef__VariablesAssignment_3_1"


    // $ANTLR start "rule__IfDef__True_bodyAssignment_5"
    // ../dk.itu.bddtransform.ui/src-gen/dk/itu/bddctransform/ui/contentassist/antlr/internal/InternalLettuce.g:2882:1: rule__IfDef__True_bodyAssignment_5 : ( ruleTransformation ) ;
    public final void rule__IfDef__True_bodyAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.bddtransform.ui/src-gen/dk/itu/bddctransform/ui/contentassist/antlr/internal/InternalLettuce.g:2886:1: ( ( ruleTransformation ) )
            // ../dk.itu.bddtransform.ui/src-gen/dk/itu/bddctransform/ui/contentassist/antlr/internal/InternalLettuce.g:2887:1: ( ruleTransformation )
            {
            // ../dk.itu.bddtransform.ui/src-gen/dk/itu/bddctransform/ui/contentassist/antlr/internal/InternalLettuce.g:2887:1: ( ruleTransformation )
            // ../dk.itu.bddtransform.ui/src-gen/dk/itu/bddctransform/ui/contentassist/antlr/internal/InternalLettuce.g:2888:1: ruleTransformation
            {
             before(grammarAccess.getIfDefAccess().getTrue_bodyTransformationParserRuleCall_5_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleTransformation_in_rule__IfDef__True_bodyAssignment_55779);
            ruleTransformation();

            state._fsp--;

             after(grammarAccess.getIfDefAccess().getTrue_bodyTransformationParserRuleCall_5_0()); 

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
    // $ANTLR end "rule__IfDef__True_bodyAssignment_5"


    // $ANTLR start "rule__IfDef__False_bodyAssignment_7"
    // ../dk.itu.bddtransform.ui/src-gen/dk/itu/bddctransform/ui/contentassist/antlr/internal/InternalLettuce.g:2897:1: rule__IfDef__False_bodyAssignment_7 : ( ruleTransformation ) ;
    public final void rule__IfDef__False_bodyAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.bddtransform.ui/src-gen/dk/itu/bddctransform/ui/contentassist/antlr/internal/InternalLettuce.g:2901:1: ( ( ruleTransformation ) )
            // ../dk.itu.bddtransform.ui/src-gen/dk/itu/bddctransform/ui/contentassist/antlr/internal/InternalLettuce.g:2902:1: ( ruleTransformation )
            {
            // ../dk.itu.bddtransform.ui/src-gen/dk/itu/bddctransform/ui/contentassist/antlr/internal/InternalLettuce.g:2902:1: ( ruleTransformation )
            // ../dk.itu.bddtransform.ui/src-gen/dk/itu/bddctransform/ui/contentassist/antlr/internal/InternalLettuce.g:2903:1: ruleTransformation
            {
             before(grammarAccess.getIfDefAccess().getFalse_bodyTransformationParserRuleCall_7_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleTransformation_in_rule__IfDef__False_bodyAssignment_75810);
            ruleTransformation();

            state._fsp--;

             after(grammarAccess.getIfDefAccess().getFalse_bodyTransformationParserRuleCall_7_0()); 

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
    // $ANTLR end "rule__IfDef__False_bodyAssignment_7"


    // $ANTLR start "rule__Match__RuleAssignment_1"
    // ../dk.itu.bddtransform.ui/src-gen/dk/itu/bddctransform/ui/contentassist/antlr/internal/InternalLettuce.g:2912:1: rule__Match__RuleAssignment_1 : ( ( ruleRuleId ) ) ;
    public final void rule__Match__RuleAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.bddtransform.ui/src-gen/dk/itu/bddctransform/ui/contentassist/antlr/internal/InternalLettuce.g:2916:1: ( ( ( ruleRuleId ) ) )
            // ../dk.itu.bddtransform.ui/src-gen/dk/itu/bddctransform/ui/contentassist/antlr/internal/InternalLettuce.g:2917:1: ( ( ruleRuleId ) )
            {
            // ../dk.itu.bddtransform.ui/src-gen/dk/itu/bddctransform/ui/contentassist/antlr/internal/InternalLettuce.g:2917:1: ( ( ruleRuleId ) )
            // ../dk.itu.bddtransform.ui/src-gen/dk/itu/bddctransform/ui/contentassist/antlr/internal/InternalLettuce.g:2918:1: ( ruleRuleId )
            {
             before(grammarAccess.getMatchAccess().getRuleRuleCrossReference_1_0()); 
            // ../dk.itu.bddtransform.ui/src-gen/dk/itu/bddctransform/ui/contentassist/antlr/internal/InternalLettuce.g:2919:1: ( ruleRuleId )
            // ../dk.itu.bddtransform.ui/src-gen/dk/itu/bddctransform/ui/contentassist/antlr/internal/InternalLettuce.g:2920:1: ruleRuleId
            {
             before(grammarAccess.getMatchAccess().getRuleRuleRuleIdParserRuleCall_1_0_1()); 
            pushFollow(FollowSets000.FOLLOW_ruleRuleId_in_rule__Match__RuleAssignment_15845);
            ruleRuleId();

            state._fsp--;

             after(grammarAccess.getMatchAccess().getRuleRuleRuleIdParserRuleCall_1_0_1()); 

            }

             after(grammarAccess.getMatchAccess().getRuleRuleCrossReference_1_0()); 

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
    // $ANTLR end "rule__Match__RuleAssignment_1"


    // $ANTLR start "rule__Match__AssignmentsAssignment_2_0"
    // ../dk.itu.bddtransform.ui/src-gen/dk/itu/bddctransform/ui/contentassist/antlr/internal/InternalLettuce.g:2931:1: rule__Match__AssignmentsAssignment_2_0 : ( ruleKeyValue ) ;
    public final void rule__Match__AssignmentsAssignment_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.bddtransform.ui/src-gen/dk/itu/bddctransform/ui/contentassist/antlr/internal/InternalLettuce.g:2935:1: ( ( ruleKeyValue ) )
            // ../dk.itu.bddtransform.ui/src-gen/dk/itu/bddctransform/ui/contentassist/antlr/internal/InternalLettuce.g:2936:1: ( ruleKeyValue )
            {
            // ../dk.itu.bddtransform.ui/src-gen/dk/itu/bddctransform/ui/contentassist/antlr/internal/InternalLettuce.g:2936:1: ( ruleKeyValue )
            // ../dk.itu.bddtransform.ui/src-gen/dk/itu/bddctransform/ui/contentassist/antlr/internal/InternalLettuce.g:2937:1: ruleKeyValue
            {
             before(grammarAccess.getMatchAccess().getAssignmentsKeyValueParserRuleCall_2_0_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleKeyValue_in_rule__Match__AssignmentsAssignment_2_05880);
            ruleKeyValue();

            state._fsp--;

             after(grammarAccess.getMatchAccess().getAssignmentsKeyValueParserRuleCall_2_0_0()); 

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
    // $ANTLR end "rule__Match__AssignmentsAssignment_2_0"


    // $ANTLR start "rule__Match__AssignmentsAssignment_2_1"
    // ../dk.itu.bddtransform.ui/src-gen/dk/itu/bddctransform/ui/contentassist/antlr/internal/InternalLettuce.g:2946:1: rule__Match__AssignmentsAssignment_2_1 : ( ruleKeyValue ) ;
    public final void rule__Match__AssignmentsAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.bddtransform.ui/src-gen/dk/itu/bddctransform/ui/contentassist/antlr/internal/InternalLettuce.g:2950:1: ( ( ruleKeyValue ) )
            // ../dk.itu.bddtransform.ui/src-gen/dk/itu/bddctransform/ui/contentassist/antlr/internal/InternalLettuce.g:2951:1: ( ruleKeyValue )
            {
            // ../dk.itu.bddtransform.ui/src-gen/dk/itu/bddctransform/ui/contentassist/antlr/internal/InternalLettuce.g:2951:1: ( ruleKeyValue )
            // ../dk.itu.bddtransform.ui/src-gen/dk/itu/bddctransform/ui/contentassist/antlr/internal/InternalLettuce.g:2952:1: ruleKeyValue
            {
             before(grammarAccess.getMatchAccess().getAssignmentsKeyValueParserRuleCall_2_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleKeyValue_in_rule__Match__AssignmentsAssignment_2_15911);
            ruleKeyValue();

            state._fsp--;

             after(grammarAccess.getMatchAccess().getAssignmentsKeyValueParserRuleCall_2_1_0()); 

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
    // $ANTLR end "rule__Match__AssignmentsAssignment_2_1"


    // $ANTLR start "rule__Fail__MessageAssignment_2_1"
    // ../dk.itu.bddtransform.ui/src-gen/dk/itu/bddctransform/ui/contentassist/antlr/internal/InternalLettuce.g:2961:1: rule__Fail__MessageAssignment_2_1 : ( ruleEString ) ;
    public final void rule__Fail__MessageAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.bddtransform.ui/src-gen/dk/itu/bddctransform/ui/contentassist/antlr/internal/InternalLettuce.g:2965:1: ( ( ruleEString ) )
            // ../dk.itu.bddtransform.ui/src-gen/dk/itu/bddctransform/ui/contentassist/antlr/internal/InternalLettuce.g:2966:1: ( ruleEString )
            {
            // ../dk.itu.bddtransform.ui/src-gen/dk/itu/bddctransform/ui/contentassist/antlr/internal/InternalLettuce.g:2966:1: ( ruleEString )
            // ../dk.itu.bddtransform.ui/src-gen/dk/itu/bddctransform/ui/contentassist/antlr/internal/InternalLettuce.g:2967:1: ruleEString
            {
             before(grammarAccess.getFailAccess().getMessageEStringParserRuleCall_2_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__Fail__MessageAssignment_2_15942);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getFailAccess().getMessageEStringParserRuleCall_2_1_0()); 

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
    // $ANTLR end "rule__Fail__MessageAssignment_2_1"


    // $ANTLR start "rule__KeyValue__KeyAssignment_1"
    // ../dk.itu.bddtransform.ui/src-gen/dk/itu/bddctransform/ui/contentassist/antlr/internal/InternalLettuce.g:2976:1: rule__KeyValue__KeyAssignment_1 : ( ruleVariableId ) ;
    public final void rule__KeyValue__KeyAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.bddtransform.ui/src-gen/dk/itu/bddctransform/ui/contentassist/antlr/internal/InternalLettuce.g:2980:1: ( ( ruleVariableId ) )
            // ../dk.itu.bddtransform.ui/src-gen/dk/itu/bddctransform/ui/contentassist/antlr/internal/InternalLettuce.g:2981:1: ( ruleVariableId )
            {
            // ../dk.itu.bddtransform.ui/src-gen/dk/itu/bddctransform/ui/contentassist/antlr/internal/InternalLettuce.g:2981:1: ( ruleVariableId )
            // ../dk.itu.bddtransform.ui/src-gen/dk/itu/bddctransform/ui/contentassist/antlr/internal/InternalLettuce.g:2982:1: ruleVariableId
            {
             before(grammarAccess.getKeyValueAccess().getKeyVariableIdParserRuleCall_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleVariableId_in_rule__KeyValue__KeyAssignment_15973);
            ruleVariableId();

            state._fsp--;

             after(grammarAccess.getKeyValueAccess().getKeyVariableIdParserRuleCall_1_0()); 

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
    // $ANTLR end "rule__KeyValue__KeyAssignment_1"


    // $ANTLR start "rule__KeyValue__ValueAssignment_3_0"
    // ../dk.itu.bddtransform.ui/src-gen/dk/itu/bddctransform/ui/contentassist/antlr/internal/InternalLettuce.g:2991:1: rule__KeyValue__ValueAssignment_3_0 : ( ruleEString ) ;
    public final void rule__KeyValue__ValueAssignment_3_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.bddtransform.ui/src-gen/dk/itu/bddctransform/ui/contentassist/antlr/internal/InternalLettuce.g:2995:1: ( ( ruleEString ) )
            // ../dk.itu.bddtransform.ui/src-gen/dk/itu/bddctransform/ui/contentassist/antlr/internal/InternalLettuce.g:2996:1: ( ruleEString )
            {
            // ../dk.itu.bddtransform.ui/src-gen/dk/itu/bddctransform/ui/contentassist/antlr/internal/InternalLettuce.g:2996:1: ( ruleEString )
            // ../dk.itu.bddtransform.ui/src-gen/dk/itu/bddctransform/ui/contentassist/antlr/internal/InternalLettuce.g:2997:1: ruleEString
            {
             before(grammarAccess.getKeyValueAccess().getValueEStringParserRuleCall_3_0_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__KeyValue__ValueAssignment_3_06004);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getKeyValueAccess().getValueEStringParserRuleCall_3_0_0()); 

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
    // $ANTLR end "rule__KeyValue__ValueAssignment_3_0"


    // $ANTLR start "rule__KeyValue__ValueAssignment_3_1"
    // ../dk.itu.bddtransform.ui/src-gen/dk/itu/bddctransform/ui/contentassist/antlr/internal/InternalLettuce.g:3006:1: rule__KeyValue__ValueAssignment_3_1 : ( ruleVariableId ) ;
    public final void rule__KeyValue__ValueAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.bddtransform.ui/src-gen/dk/itu/bddctransform/ui/contentassist/antlr/internal/InternalLettuce.g:3010:1: ( ( ruleVariableId ) )
            // ../dk.itu.bddtransform.ui/src-gen/dk/itu/bddctransform/ui/contentassist/antlr/internal/InternalLettuce.g:3011:1: ( ruleVariableId )
            {
            // ../dk.itu.bddtransform.ui/src-gen/dk/itu/bddctransform/ui/contentassist/antlr/internal/InternalLettuce.g:3011:1: ( ruleVariableId )
            // ../dk.itu.bddtransform.ui/src-gen/dk/itu/bddctransform/ui/contentassist/antlr/internal/InternalLettuce.g:3012:1: ruleVariableId
            {
             before(grammarAccess.getKeyValueAccess().getValueVariableIdParserRuleCall_3_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleVariableId_in_rule__KeyValue__ValueAssignment_3_16035);
            ruleVariableId();

            state._fsp--;

             after(grammarAccess.getKeyValueAccess().getValueVariableIdParserRuleCall_3_1_0()); 

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
    // $ANTLR end "rule__KeyValue__ValueAssignment_3_1"

    // Delegated rules


 

    
    private static class FollowSets000 {
        public static final BitSet FOLLOW_ruleTransformModel__in_entryRuleTransformModel_61 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleTransformModel_68 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__TransformModel___Group__0_in_ruleTransformModel_94 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulePattern_in_entryRulePattern121 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRulePattern128 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Pattern__Alternatives_in_rulePattern154 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleTransformation_in_entryRuleTransformation181 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleTransformation188 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Transformation__Alternatives_in_ruleTransformation214 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleBehavior_in_entryRuleBehavior241 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleBehavior248 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Behavior__Group__0_in_ruleBehavior274 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleRule_in_entryRuleRule301 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleRule308 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Rule__Group__0_in_ruleRule334 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleRuleId_in_entryRuleRuleId361 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleRuleId368 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleRuleId394 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleVariableId_in_entryRuleVariableId420 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleVariableId427 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__VariableId__Group__0_in_ruleVariableId453 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_entryRuleEString480 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleEString487 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__EString__Alternatives_in_ruleEString513 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleExactSting_in_entryRuleExactSting540 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleExactSting547 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ExactSting__ContentAssignment_in_ruleExactSting573 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleVariable_in_entryRuleVariable600 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleVariable607 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Variable__Group__0_in_ruleVariable633 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAlternation_in_entryRuleAlternation660 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleAlternation667 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Alternation__Group__0_in_ruleAlternation693 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleOptional_in_entryRuleOptional720 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleOptional727 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Optional__Group__0_in_ruleOptional753 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleExpression_in_entryRuleExpression780 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleExpression787 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Expression__Group__0_in_ruleExpression813 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleIfDef_in_entryRuleIfDef840 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleIfDef847 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__IfDef__Group__0_in_ruleIfDef873 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleMatch_in_entryRuleMatch900 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleMatch907 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Match__Group__0_in_ruleMatch933 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleFail_in_entryRuleFail960 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleFail967 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Fail__Group__0_in_ruleFail993 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleKeyValue_in_entryRuleKeyValue1020 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleKeyValue1027 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__KeyValue__Group__0_in_ruleKeyValue1053 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__TransformModel___RulesAssignment_3_0_in_rule__TransformModel___Alternatives_31089 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__TransformModel___BehaviorsAssignment_3_1_in_rule__TransformModel___Alternatives_31107 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleExactSting_in_rule__Pattern__Alternatives1140 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleVariable_in_rule__Pattern__Alternatives1157 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAlternation_in_rule__Pattern__Alternatives1174 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleOptional_in_rule__Pattern__Alternatives1191 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleExpression_in_rule__Transformation__Alternatives1223 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleIfDef_in_rule__Transformation__Alternatives1240 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleMatch_in_rule__Transformation__Alternatives1257 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleFail_in_rule__Transformation__Alternatives1274 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_STRING_in_rule__EString__Alternatives1306 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_rule__EString__Alternatives1323 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__KeyValue__ValueAssignment_3_0_in_rule__KeyValue__Alternatives_31355 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__KeyValue__ValueAssignment_3_1_in_rule__KeyValue__Alternatives_31373 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__TransformModel___Group__0__Impl_in_rule__TransformModel___Group__01404 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_rule__TransformModel___Group__1_in_rule__TransformModel___Group__01407 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_11_in_rule__TransformModel___Group__0__Impl1435 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__TransformModel___Group__1__Impl_in_rule__TransformModel___Group__11466 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__TransformModel___Group__2_in_rule__TransformModel___Group__11469 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_12_in_rule__TransformModel___Group__1__Impl1497 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__TransformModel___Group__2__Impl_in_rule__TransformModel___Group__21528 = new BitSet(new long[]{0x0000000000022000L});
        public static final BitSet FOLLOW_rule__TransformModel___Group__3_in_rule__TransformModel___Group__21531 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__TransformModel___NameAssignment_2_in_rule__TransformModel___Group__2__Impl1558 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__TransformModel___Group__3__Impl_in_rule__TransformModel___Group__31588 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__TransformModel___Alternatives_3_in_rule__TransformModel___Group__3__Impl1617 = new BitSet(new long[]{0x0000000000022002L});
        public static final BitSet FOLLOW_rule__TransformModel___Alternatives_3_in_rule__TransformModel___Group__3__Impl1629 = new BitSet(new long[]{0x0000000000022002L});
        public static final BitSet FOLLOW_rule__Behavior__Group__0__Impl_in_rule__Behavior__Group__01670 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__Behavior__Group__1_in_rule__Behavior__Group__01673 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_13_in_rule__Behavior__Group__0__Impl1701 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Behavior__Group__1__Impl_in_rule__Behavior__Group__11732 = new BitSet(new long[]{0x0000000000004000L});
        public static final BitSet FOLLOW_rule__Behavior__Group__2_in_rule__Behavior__Group__11735 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Behavior__DescriptionAssignment_1_in_rule__Behavior__Group__1__Impl1762 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Behavior__Group__2__Impl_in_rule__Behavior__Group__21792 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__Behavior__Group__3_in_rule__Behavior__Group__21795 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_14_in_rule__Behavior__Group__2__Impl1823 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Behavior__Group__3__Impl_in_rule__Behavior__Group__31854 = new BitSet(new long[]{0x0000000000008000L});
        public static final BitSet FOLLOW_rule__Behavior__Group__4_in_rule__Behavior__Group__31857 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Behavior__ClassAssignment_3_in_rule__Behavior__Group__3__Impl1884 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Behavior__Group__4__Impl_in_rule__Behavior__Group__41914 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__Behavior__Group__5_in_rule__Behavior__Group__41917 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_15_in_rule__Behavior__Group__4__Impl1945 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Behavior__Group__5__Impl_in_rule__Behavior__Group__51976 = new BitSet(new long[]{0x0000000000010000L});
        public static final BitSet FOLLOW_rule__Behavior__Group__6_in_rule__Behavior__Group__51979 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Behavior__SignatureAssignment_5_in_rule__Behavior__Group__5__Impl2006 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Behavior__Group__6__Impl_in_rule__Behavior__Group__62036 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_16_in_rule__Behavior__Group__6__Impl2064 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Rule__Group__0__Impl_in_rule__Rule__Group__02109 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_rule__Rule__Group__1_in_rule__Rule__Group__02112 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_17_in_rule__Rule__Group__0__Impl2140 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Rule__Group__1__Impl_in_rule__Rule__Group__12171 = new BitSet(new long[]{0x00000000004C0030L});
        public static final BitSet FOLLOW_rule__Rule__Group__2_in_rule__Rule__Group__12174 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Rule__NameAssignment_1_in_rule__Rule__Group__1__Impl2201 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Rule__Group__2__Impl_in_rule__Rule__Group__22231 = new BitSet(new long[]{0x00000000C34C0030L});
        public static final BitSet FOLLOW_rule__Rule__Group__3_in_rule__Rule__Group__22234 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Rule__PatternsAssignment_2_in_rule__Rule__Group__2__Impl2261 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Rule__Group__3__Impl_in_rule__Rule__Group__32291 = new BitSet(new long[]{0x00000000C34C0030L});
        public static final BitSet FOLLOW_rule__Rule__Group__4_in_rule__Rule__Group__32294 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Rule__PatternsAssignment_3_in_rule__Rule__Group__3__Impl2321 = new BitSet(new long[]{0x00000000004C0032L});
        public static final BitSet FOLLOW_rule__Rule__Group__4__Impl_in_rule__Rule__Group__42352 = new BitSet(new long[]{0x0000000000010000L});
        public static final BitSet FOLLOW_rule__Rule__Group__5_in_rule__Rule__Group__42355 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Rule__TransformationAssignment_4_in_rule__Rule__Group__4__Impl2382 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Rule__Group__5__Impl_in_rule__Rule__Group__52412 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_16_in_rule__Rule__Group__5__Impl2440 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__VariableId__Group__0__Impl_in_rule__VariableId__Group__02483 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_rule__VariableId__Group__1_in_rule__VariableId__Group__02486 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_18_in_rule__VariableId__Group__0__Impl2514 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__VariableId__Group__1__Impl_in_rule__VariableId__Group__12545 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_rule__VariableId__Group__1__Impl2572 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Variable__Group__0__Impl_in_rule__Variable__Group__02605 = new BitSet(new long[]{0x0000000000040000L});
        public static final BitSet FOLLOW_rule__Variable__Group__1_in_rule__Variable__Group__02608 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Variable__Group__1__Impl_in_rule__Variable__Group__12666 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Variable__NameAssignment_1_in_rule__Variable__Group__1__Impl2693 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Alternation__Group__0__Impl_in_rule__Alternation__Group__02727 = new BitSet(new long[]{0x00000000004C0030L});
        public static final BitSet FOLLOW_rule__Alternation__Group__1_in_rule__Alternation__Group__02730 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_19_in_rule__Alternation__Group__0__Impl2758 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Alternation__Group__1__Impl_in_rule__Alternation__Group__12789 = new BitSet(new long[]{0x0000000000100000L});
        public static final BitSet FOLLOW_rule__Alternation__Group__2_in_rule__Alternation__Group__12792 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Alternation__ChoicesAssignment_1_in_rule__Alternation__Group__1__Impl2819 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Alternation__Group__2__Impl_in_rule__Alternation__Group__22849 = new BitSet(new long[]{0x00000000004C0030L});
        public static final BitSet FOLLOW_rule__Alternation__Group__3_in_rule__Alternation__Group__22852 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_20_in_rule__Alternation__Group__2__Impl2880 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Alternation__Group__3__Impl_in_rule__Alternation__Group__32911 = new BitSet(new long[]{0x0000000000300000L});
        public static final BitSet FOLLOW_rule__Alternation__Group__4_in_rule__Alternation__Group__32914 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Alternation__ChoicesAssignment_3_in_rule__Alternation__Group__3__Impl2941 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Alternation__Group__4__Impl_in_rule__Alternation__Group__42971 = new BitSet(new long[]{0x0000000000300000L});
        public static final BitSet FOLLOW_rule__Alternation__Group__5_in_rule__Alternation__Group__42974 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Alternation__Group_4__0_in_rule__Alternation__Group__4__Impl3001 = new BitSet(new long[]{0x0000000000100002L});
        public static final BitSet FOLLOW_rule__Alternation__Group__5__Impl_in_rule__Alternation__Group__53032 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_21_in_rule__Alternation__Group__5__Impl3060 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Alternation__Group_4__0__Impl_in_rule__Alternation__Group_4__03103 = new BitSet(new long[]{0x00000000004C0030L});
        public static final BitSet FOLLOW_rule__Alternation__Group_4__1_in_rule__Alternation__Group_4__03106 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_20_in_rule__Alternation__Group_4__0__Impl3134 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Alternation__Group_4__1__Impl_in_rule__Alternation__Group_4__13165 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Alternation__ChoicesAssignment_4_1_in_rule__Alternation__Group_4__1__Impl3192 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Optional__Group__0__Impl_in_rule__Optional__Group__03226 = new BitSet(new long[]{0x00000000004C0030L});
        public static final BitSet FOLLOW_rule__Optional__Group__1_in_rule__Optional__Group__03229 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_22_in_rule__Optional__Group__0__Impl3257 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Optional__Group__1__Impl_in_rule__Optional__Group__13288 = new BitSet(new long[]{0x0000000000CC0030L});
        public static final BitSet FOLLOW_rule__Optional__Group__2_in_rule__Optional__Group__13291 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Optional__ValueAssignment_1_in_rule__Optional__Group__1__Impl3318 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Optional__Group__2__Impl_in_rule__Optional__Group__23348 = new BitSet(new long[]{0x0000000000CC0030L});
        public static final BitSet FOLLOW_rule__Optional__Group__3_in_rule__Optional__Group__23351 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Optional__ValueAssignment_2_in_rule__Optional__Group__2__Impl3378 = new BitSet(new long[]{0x00000000004C0032L});
        public static final BitSet FOLLOW_rule__Optional__Group__3__Impl_in_rule__Optional__Group__33409 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_23_in_rule__Optional__Group__3__Impl3437 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Expression__Group__0__Impl_in_rule__Expression__Group__03476 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__Expression__Group__1_in_rule__Expression__Group__03479 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_24_in_rule__Expression__Group__0__Impl3507 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Expression__Group__1__Impl_in_rule__Expression__Group__13538 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Expression__ValueAssignment_1_in_rule__Expression__Group__1__Impl3565 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__IfDef__Group__0__Impl_in_rule__IfDef__Group__03599 = new BitSet(new long[]{0x0000000004000000L});
        public static final BitSet FOLLOW_rule__IfDef__Group__1_in_rule__IfDef__Group__03602 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_25_in_rule__IfDef__Group__0__Impl3630 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__IfDef__Group__1__Impl_in_rule__IfDef__Group__13661 = new BitSet(new long[]{0x0000000000040000L});
        public static final BitSet FOLLOW_rule__IfDef__Group__2_in_rule__IfDef__Group__13664 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_26_in_rule__IfDef__Group__1__Impl3692 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__IfDef__Group__2__Impl_in_rule__IfDef__Group__23723 = new BitSet(new long[]{0x0000000028000000L});
        public static final BitSet FOLLOW_rule__IfDef__Group__3_in_rule__IfDef__Group__23726 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__IfDef__VariablesAssignment_2_in_rule__IfDef__Group__2__Impl3753 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__IfDef__Group__3__Impl_in_rule__IfDef__Group__33783 = new BitSet(new long[]{0x0000000028000000L});
        public static final BitSet FOLLOW_rule__IfDef__Group__4_in_rule__IfDef__Group__33786 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__IfDef__Group_3__0_in_rule__IfDef__Group__3__Impl3813 = new BitSet(new long[]{0x0000000020000002L});
        public static final BitSet FOLLOW_rule__IfDef__Group__4__Impl_in_rule__IfDef__Group__43844 = new BitSet(new long[]{0x00000000C34C0030L});
        public static final BitSet FOLLOW_rule__IfDef__Group__5_in_rule__IfDef__Group__43847 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_27_in_rule__IfDef__Group__4__Impl3875 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__IfDef__Group__5__Impl_in_rule__IfDef__Group__53906 = new BitSet(new long[]{0x0000000010000000L});
        public static final BitSet FOLLOW_rule__IfDef__Group__6_in_rule__IfDef__Group__53909 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__IfDef__True_bodyAssignment_5_in_rule__IfDef__Group__5__Impl3936 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__IfDef__Group__6__Impl_in_rule__IfDef__Group__63966 = new BitSet(new long[]{0x00000000C34C0030L});
        public static final BitSet FOLLOW_rule__IfDef__Group__7_in_rule__IfDef__Group__63969 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_28_in_rule__IfDef__Group__6__Impl3997 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__IfDef__Group__7__Impl_in_rule__IfDef__Group__74028 = new BitSet(new long[]{0x0000000000010000L});
        public static final BitSet FOLLOW_rule__IfDef__Group__8_in_rule__IfDef__Group__74031 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__IfDef__False_bodyAssignment_7_in_rule__IfDef__Group__7__Impl4058 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__IfDef__Group__8__Impl_in_rule__IfDef__Group__84088 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_16_in_rule__IfDef__Group__8__Impl4116 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__IfDef__Group_3__0__Impl_in_rule__IfDef__Group_3__04165 = new BitSet(new long[]{0x0000000000040000L});
        public static final BitSet FOLLOW_rule__IfDef__Group_3__1_in_rule__IfDef__Group_3__04168 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_29_in_rule__IfDef__Group_3__0__Impl4196 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__IfDef__Group_3__1__Impl_in_rule__IfDef__Group_3__14227 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__IfDef__VariablesAssignment_3_1_in_rule__IfDef__Group_3__1__Impl4254 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Match__Group__0__Impl_in_rule__Match__Group__04288 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_rule__Match__Group__1_in_rule__Match__Group__04291 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_30_in_rule__Match__Group__0__Impl4319 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Match__Group__1__Impl_in_rule__Match__Group__14350 = new BitSet(new long[]{0x0000000000040000L});
        public static final BitSet FOLLOW_rule__Match__Group__2_in_rule__Match__Group__14353 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Match__RuleAssignment_1_in_rule__Match__Group__1__Impl4380 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Match__Group__2__Impl_in_rule__Match__Group__24410 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Match__Group_2__0_in_rule__Match__Group__2__Impl4437 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Match__Group_2__0__Impl_in_rule__Match__Group_2__04474 = new BitSet(new long[]{0x0000000000040000L});
        public static final BitSet FOLLOW_rule__Match__Group_2__1_in_rule__Match__Group_2__04477 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Match__AssignmentsAssignment_2_0_in_rule__Match__Group_2__0__Impl4504 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Match__Group_2__1__Impl_in_rule__Match__Group_2__14534 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Match__AssignmentsAssignment_2_1_in_rule__Match__Group_2__1__Impl4561 = new BitSet(new long[]{0x0000000000040002L});
        public static final BitSet FOLLOW_rule__Fail__Group__0__Impl_in_rule__Fail__Group__04596 = new BitSet(new long[]{0x00000000C34C0030L});
        public static final BitSet FOLLOW_rule__Fail__Group__1_in_rule__Fail__Group__04599 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Fail__Group__1__Impl_in_rule__Fail__Group__14657 = new BitSet(new long[]{0x0000000100000000L});
        public static final BitSet FOLLOW_rule__Fail__Group__2_in_rule__Fail__Group__14660 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_31_in_rule__Fail__Group__1__Impl4688 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Fail__Group__2__Impl_in_rule__Fail__Group__24719 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Fail__Group_2__0_in_rule__Fail__Group__2__Impl4746 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Fail__Group_2__0__Impl_in_rule__Fail__Group_2__04783 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__Fail__Group_2__1_in_rule__Fail__Group_2__04786 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_32_in_rule__Fail__Group_2__0__Impl4814 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Fail__Group_2__1__Impl_in_rule__Fail__Group_2__14845 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Fail__MessageAssignment_2_1_in_rule__Fail__Group_2__1__Impl4872 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__KeyValue__Group__0__Impl_in_rule__KeyValue__Group__04906 = new BitSet(new long[]{0x0000000000040000L});
        public static final BitSet FOLLOW_rule__KeyValue__Group__1_in_rule__KeyValue__Group__04909 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__KeyValue__Group__1__Impl_in_rule__KeyValue__Group__14967 = new BitSet(new long[]{0x0000000200000000L});
        public static final BitSet FOLLOW_rule__KeyValue__Group__2_in_rule__KeyValue__Group__14970 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__KeyValue__KeyAssignment_1_in_rule__KeyValue__Group__1__Impl4997 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__KeyValue__Group__2__Impl_in_rule__KeyValue__Group__25027 = new BitSet(new long[]{0x0000000000040030L});
        public static final BitSet FOLLOW_rule__KeyValue__Group__3_in_rule__KeyValue__Group__25030 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_33_in_rule__KeyValue__Group__2__Impl5058 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__KeyValue__Group__3__Impl_in_rule__KeyValue__Group__35089 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__KeyValue__Alternatives_3_in_rule__KeyValue__Group__3__Impl5116 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__TransformModel___NameAssignment_25159 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleRule_in_rule__TransformModel___RulesAssignment_3_05190 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleBehavior_in_rule__TransformModel___BehaviorsAssignment_3_15221 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__Behavior__DescriptionAssignment_15252 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__Behavior__ClassAssignment_35283 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__Behavior__SignatureAssignment_55314 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleRuleId_in_rule__Rule__NameAssignment_15345 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulePattern_in_rule__Rule__PatternsAssignment_25376 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulePattern_in_rule__Rule__PatternsAssignment_35407 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleTransformation_in_rule__Rule__TransformationAssignment_45438 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__ExactSting__ContentAssignment5469 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleVariableId_in_rule__Variable__NameAssignment_15500 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulePattern_in_rule__Alternation__ChoicesAssignment_15531 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulePattern_in_rule__Alternation__ChoicesAssignment_35562 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulePattern_in_rule__Alternation__ChoicesAssignment_4_15593 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulePattern_in_rule__Optional__ValueAssignment_15624 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulePattern_in_rule__Optional__ValueAssignment_25655 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__Expression__ValueAssignment_15686 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleVariableId_in_rule__IfDef__VariablesAssignment_25717 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleVariableId_in_rule__IfDef__VariablesAssignment_3_15748 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleTransformation_in_rule__IfDef__True_bodyAssignment_55779 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleTransformation_in_rule__IfDef__False_bodyAssignment_75810 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleRuleId_in_rule__Match__RuleAssignment_15845 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleKeyValue_in_rule__Match__AssignmentsAssignment_2_05880 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleKeyValue_in_rule__Match__AssignmentsAssignment_2_15911 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__Fail__MessageAssignment_2_15942 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleVariableId_in_rule__KeyValue__KeyAssignment_15973 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__KeyValue__ValueAssignment_3_06004 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleVariableId_in_rule__KeyValue__ValueAssignment_3_16035 = new BitSet(new long[]{0x0000000000000002L});
    }


}