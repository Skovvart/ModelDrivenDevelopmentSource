package dk.itu.simplifiedjml.ui.contentassist.antlr.internal; 

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
import dk.itu.simplifiedjml.services.TomatoGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalTomatoParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_HACKY_SIGN", "RULE_STRING", "RULE_ID", "RULE_ANY_OTHER", "RULE_INT", "RULE_SL_COMMENT", "RULE_ML_COMMENT", "RULE_WS", "'class'", "'{'", "'}'", "'//@ invariant'", "'/*< AUTO GENERATED >*/'", "'/* TODO: Implementation */'", "'throw new UnsupportedOperationException(\"Not Implemented\");'", "'//@ requires'", "'\\n'", "'//@ ensures'"
    };
    public static final int RULE_ID=6;
    public static final int T__21=21;
    public static final int RULE_ANY_OTHER=7;
    public static final int T__20=20;
    public static final int RULE_HACKY_SIGN=4;
    public static final int EOF=-1;
    public static final int RULE_SL_COMMENT=9;
    public static final int RULE_ML_COMMENT=10;
    public static final int T__19=19;
    public static final int RULE_STRING=5;
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
    public String getGrammarFileName() { return "../dk.itu.simplifiedjml.ui/src-gen/dk/itu/simplifiedjml/ui/contentassist/antlr/internal/InternalTomato.g"; }


     
     	private TomatoGrammarAccess grammarAccess;
     	
        public void setGrammarAccess(TomatoGrammarAccess grammarAccess) {
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




    // $ANTLR start "entryRuleSimplifiedJMLModel"
    // ../dk.itu.simplifiedjml.ui/src-gen/dk/itu/simplifiedjml/ui/contentassist/antlr/internal/InternalTomato.g:60:1: entryRuleSimplifiedJMLModel : ruleSimplifiedJMLModel EOF ;
    public final void entryRuleSimplifiedJMLModel() throws RecognitionException {
        try {
            // ../dk.itu.simplifiedjml.ui/src-gen/dk/itu/simplifiedjml/ui/contentassist/antlr/internal/InternalTomato.g:61:1: ( ruleSimplifiedJMLModel EOF )
            // ../dk.itu.simplifiedjml.ui/src-gen/dk/itu/simplifiedjml/ui/contentassist/antlr/internal/InternalTomato.g:62:1: ruleSimplifiedJMLModel EOF
            {
             before(grammarAccess.getSimplifiedJMLModelRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleSimplifiedJMLModel_in_entryRuleSimplifiedJMLModel61);
            ruleSimplifiedJMLModel();

            state._fsp--;

             after(grammarAccess.getSimplifiedJMLModelRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleSimplifiedJMLModel68); 

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
    // $ANTLR end "entryRuleSimplifiedJMLModel"


    // $ANTLR start "ruleSimplifiedJMLModel"
    // ../dk.itu.simplifiedjml.ui/src-gen/dk/itu/simplifiedjml/ui/contentassist/antlr/internal/InternalTomato.g:69:1: ruleSimplifiedJMLModel : ( ( rule__SimplifiedJMLModel__Group__0 ) ) ;
    public final void ruleSimplifiedJMLModel() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.simplifiedjml.ui/src-gen/dk/itu/simplifiedjml/ui/contentassist/antlr/internal/InternalTomato.g:73:2: ( ( ( rule__SimplifiedJMLModel__Group__0 ) ) )
            // ../dk.itu.simplifiedjml.ui/src-gen/dk/itu/simplifiedjml/ui/contentassist/antlr/internal/InternalTomato.g:74:1: ( ( rule__SimplifiedJMLModel__Group__0 ) )
            {
            // ../dk.itu.simplifiedjml.ui/src-gen/dk/itu/simplifiedjml/ui/contentassist/antlr/internal/InternalTomato.g:74:1: ( ( rule__SimplifiedJMLModel__Group__0 ) )
            // ../dk.itu.simplifiedjml.ui/src-gen/dk/itu/simplifiedjml/ui/contentassist/antlr/internal/InternalTomato.g:75:1: ( rule__SimplifiedJMLModel__Group__0 )
            {
             before(grammarAccess.getSimplifiedJMLModelAccess().getGroup()); 
            // ../dk.itu.simplifiedjml.ui/src-gen/dk/itu/simplifiedjml/ui/contentassist/antlr/internal/InternalTomato.g:76:1: ( rule__SimplifiedJMLModel__Group__0 )
            // ../dk.itu.simplifiedjml.ui/src-gen/dk/itu/simplifiedjml/ui/contentassist/antlr/internal/InternalTomato.g:76:2: rule__SimplifiedJMLModel__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__SimplifiedJMLModel__Group__0_in_ruleSimplifiedJMLModel94);
            rule__SimplifiedJMLModel__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getSimplifiedJMLModelAccess().getGroup()); 

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
    // $ANTLR end "ruleSimplifiedJMLModel"


    // $ANTLR start "entryRuleStructure"
    // ../dk.itu.simplifiedjml.ui/src-gen/dk/itu/simplifiedjml/ui/contentassist/antlr/internal/InternalTomato.g:88:1: entryRuleStructure : ruleStructure EOF ;
    public final void entryRuleStructure() throws RecognitionException {
        try {
            // ../dk.itu.simplifiedjml.ui/src-gen/dk/itu/simplifiedjml/ui/contentassist/antlr/internal/InternalTomato.g:89:1: ( ruleStructure EOF )
            // ../dk.itu.simplifiedjml.ui/src-gen/dk/itu/simplifiedjml/ui/contentassist/antlr/internal/InternalTomato.g:90:1: ruleStructure EOF
            {
             before(grammarAccess.getStructureRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleStructure_in_entryRuleStructure121);
            ruleStructure();

            state._fsp--;

             after(grammarAccess.getStructureRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleStructure128); 

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
    // $ANTLR end "entryRuleStructure"


    // $ANTLR start "ruleStructure"
    // ../dk.itu.simplifiedjml.ui/src-gen/dk/itu/simplifiedjml/ui/contentassist/antlr/internal/InternalTomato.g:97:1: ruleStructure : ( ( rule__Structure__Group__0 ) ) ;
    public final void ruleStructure() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.simplifiedjml.ui/src-gen/dk/itu/simplifiedjml/ui/contentassist/antlr/internal/InternalTomato.g:101:2: ( ( ( rule__Structure__Group__0 ) ) )
            // ../dk.itu.simplifiedjml.ui/src-gen/dk/itu/simplifiedjml/ui/contentassist/antlr/internal/InternalTomato.g:102:1: ( ( rule__Structure__Group__0 ) )
            {
            // ../dk.itu.simplifiedjml.ui/src-gen/dk/itu/simplifiedjml/ui/contentassist/antlr/internal/InternalTomato.g:102:1: ( ( rule__Structure__Group__0 ) )
            // ../dk.itu.simplifiedjml.ui/src-gen/dk/itu/simplifiedjml/ui/contentassist/antlr/internal/InternalTomato.g:103:1: ( rule__Structure__Group__0 )
            {
             before(grammarAccess.getStructureAccess().getGroup()); 
            // ../dk.itu.simplifiedjml.ui/src-gen/dk/itu/simplifiedjml/ui/contentassist/antlr/internal/InternalTomato.g:104:1: ( rule__Structure__Group__0 )
            // ../dk.itu.simplifiedjml.ui/src-gen/dk/itu/simplifiedjml/ui/contentassist/antlr/internal/InternalTomato.g:104:2: rule__Structure__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__Structure__Group__0_in_ruleStructure154);
            rule__Structure__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getStructureAccess().getGroup()); 

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
    // $ANTLR end "ruleStructure"


    // $ANTLR start "entryRuleMethod"
    // ../dk.itu.simplifiedjml.ui/src-gen/dk/itu/simplifiedjml/ui/contentassist/antlr/internal/InternalTomato.g:116:1: entryRuleMethod : ruleMethod EOF ;
    public final void entryRuleMethod() throws RecognitionException {
        try {
            // ../dk.itu.simplifiedjml.ui/src-gen/dk/itu/simplifiedjml/ui/contentassist/antlr/internal/InternalTomato.g:117:1: ( ruleMethod EOF )
            // ../dk.itu.simplifiedjml.ui/src-gen/dk/itu/simplifiedjml/ui/contentassist/antlr/internal/InternalTomato.g:118:1: ruleMethod EOF
            {
             before(grammarAccess.getMethodRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleMethod_in_entryRuleMethod181);
            ruleMethod();

            state._fsp--;

             after(grammarAccess.getMethodRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleMethod188); 

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
    // $ANTLR end "entryRuleMethod"


    // $ANTLR start "ruleMethod"
    // ../dk.itu.simplifiedjml.ui/src-gen/dk/itu/simplifiedjml/ui/contentassist/antlr/internal/InternalTomato.g:125:1: ruleMethod : ( ( rule__Method__Group__0 ) ) ;
    public final void ruleMethod() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.simplifiedjml.ui/src-gen/dk/itu/simplifiedjml/ui/contentassist/antlr/internal/InternalTomato.g:129:2: ( ( ( rule__Method__Group__0 ) ) )
            // ../dk.itu.simplifiedjml.ui/src-gen/dk/itu/simplifiedjml/ui/contentassist/antlr/internal/InternalTomato.g:130:1: ( ( rule__Method__Group__0 ) )
            {
            // ../dk.itu.simplifiedjml.ui/src-gen/dk/itu/simplifiedjml/ui/contentassist/antlr/internal/InternalTomato.g:130:1: ( ( rule__Method__Group__0 ) )
            // ../dk.itu.simplifiedjml.ui/src-gen/dk/itu/simplifiedjml/ui/contentassist/antlr/internal/InternalTomato.g:131:1: ( rule__Method__Group__0 )
            {
             before(grammarAccess.getMethodAccess().getGroup()); 
            // ../dk.itu.simplifiedjml.ui/src-gen/dk/itu/simplifiedjml/ui/contentassist/antlr/internal/InternalTomato.g:132:1: ( rule__Method__Group__0 )
            // ../dk.itu.simplifiedjml.ui/src-gen/dk/itu/simplifiedjml/ui/contentassist/antlr/internal/InternalTomato.g:132:2: rule__Method__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__Method__Group__0_in_ruleMethod214);
            rule__Method__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getMethodAccess().getGroup()); 

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
    // $ANTLR end "ruleMethod"


    // $ANTLR start "entryRuleEString"
    // ../dk.itu.simplifiedjml.ui/src-gen/dk/itu/simplifiedjml/ui/contentassist/antlr/internal/InternalTomato.g:144:1: entryRuleEString : ruleEString EOF ;
    public final void entryRuleEString() throws RecognitionException {
        try {
            // ../dk.itu.simplifiedjml.ui/src-gen/dk/itu/simplifiedjml/ui/contentassist/antlr/internal/InternalTomato.g:145:1: ( ruleEString EOF )
            // ../dk.itu.simplifiedjml.ui/src-gen/dk/itu/simplifiedjml/ui/contentassist/antlr/internal/InternalTomato.g:146:1: ruleEString EOF
            {
             before(grammarAccess.getEStringRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_entryRuleEString241);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getEStringRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleEString248); 

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
    // ../dk.itu.simplifiedjml.ui/src-gen/dk/itu/simplifiedjml/ui/contentassist/antlr/internal/InternalTomato.g:153:1: ruleEString : ( ( rule__EString__Alternatives ) ) ;
    public final void ruleEString() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.simplifiedjml.ui/src-gen/dk/itu/simplifiedjml/ui/contentassist/antlr/internal/InternalTomato.g:157:2: ( ( ( rule__EString__Alternatives ) ) )
            // ../dk.itu.simplifiedjml.ui/src-gen/dk/itu/simplifiedjml/ui/contentassist/antlr/internal/InternalTomato.g:158:1: ( ( rule__EString__Alternatives ) )
            {
            // ../dk.itu.simplifiedjml.ui/src-gen/dk/itu/simplifiedjml/ui/contentassist/antlr/internal/InternalTomato.g:158:1: ( ( rule__EString__Alternatives ) )
            // ../dk.itu.simplifiedjml.ui/src-gen/dk/itu/simplifiedjml/ui/contentassist/antlr/internal/InternalTomato.g:159:1: ( rule__EString__Alternatives )
            {
             before(grammarAccess.getEStringAccess().getAlternatives()); 
            // ../dk.itu.simplifiedjml.ui/src-gen/dk/itu/simplifiedjml/ui/contentassist/antlr/internal/InternalTomato.g:160:1: ( rule__EString__Alternatives )
            // ../dk.itu.simplifiedjml.ui/src-gen/dk/itu/simplifiedjml/ui/contentassist/antlr/internal/InternalTomato.g:160:2: rule__EString__Alternatives
            {
            pushFollow(FollowSets000.FOLLOW_rule__EString__Alternatives_in_ruleEString274);
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


    // $ANTLR start "entryRuleAnyOther"
    // ../dk.itu.simplifiedjml.ui/src-gen/dk/itu/simplifiedjml/ui/contentassist/antlr/internal/InternalTomato.g:172:1: entryRuleAnyOther : ruleAnyOther EOF ;
    public final void entryRuleAnyOther() throws RecognitionException {
        try {
            // ../dk.itu.simplifiedjml.ui/src-gen/dk/itu/simplifiedjml/ui/contentassist/antlr/internal/InternalTomato.g:173:1: ( ruleAnyOther EOF )
            // ../dk.itu.simplifiedjml.ui/src-gen/dk/itu/simplifiedjml/ui/contentassist/antlr/internal/InternalTomato.g:174:1: ruleAnyOther EOF
            {
             before(grammarAccess.getAnyOtherRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleAnyOther_in_entryRuleAnyOther301);
            ruleAnyOther();

            state._fsp--;

             after(grammarAccess.getAnyOtherRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleAnyOther308); 

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
    // $ANTLR end "entryRuleAnyOther"


    // $ANTLR start "ruleAnyOther"
    // ../dk.itu.simplifiedjml.ui/src-gen/dk/itu/simplifiedjml/ui/contentassist/antlr/internal/InternalTomato.g:181:1: ruleAnyOther : ( ( rule__AnyOther__Alternatives )* ) ;
    public final void ruleAnyOther() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.simplifiedjml.ui/src-gen/dk/itu/simplifiedjml/ui/contentassist/antlr/internal/InternalTomato.g:185:2: ( ( ( rule__AnyOther__Alternatives )* ) )
            // ../dk.itu.simplifiedjml.ui/src-gen/dk/itu/simplifiedjml/ui/contentassist/antlr/internal/InternalTomato.g:186:1: ( ( rule__AnyOther__Alternatives )* )
            {
            // ../dk.itu.simplifiedjml.ui/src-gen/dk/itu/simplifiedjml/ui/contentassist/antlr/internal/InternalTomato.g:186:1: ( ( rule__AnyOther__Alternatives )* )
            // ../dk.itu.simplifiedjml.ui/src-gen/dk/itu/simplifiedjml/ui/contentassist/antlr/internal/InternalTomato.g:187:1: ( rule__AnyOther__Alternatives )*
            {
             before(grammarAccess.getAnyOtherAccess().getAlternatives()); 
            // ../dk.itu.simplifiedjml.ui/src-gen/dk/itu/simplifiedjml/ui/contentassist/antlr/internal/InternalTomato.g:188:1: ( rule__AnyOther__Alternatives )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0>=RULE_ID && LA1_0<=RULE_ANY_OTHER)) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ../dk.itu.simplifiedjml.ui/src-gen/dk/itu/simplifiedjml/ui/contentassist/antlr/internal/InternalTomato.g:188:2: rule__AnyOther__Alternatives
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__AnyOther__Alternatives_in_ruleAnyOther334);
            	    rule__AnyOther__Alternatives();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

             after(grammarAccess.getAnyOtherAccess().getAlternatives()); 

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
    // $ANTLR end "ruleAnyOther"


    // $ANTLR start "entryRuleHackySignature"
    // ../dk.itu.simplifiedjml.ui/src-gen/dk/itu/simplifiedjml/ui/contentassist/antlr/internal/InternalTomato.g:200:1: entryRuleHackySignature : ruleHackySignature EOF ;
    public final void entryRuleHackySignature() throws RecognitionException {
        try {
            // ../dk.itu.simplifiedjml.ui/src-gen/dk/itu/simplifiedjml/ui/contentassist/antlr/internal/InternalTomato.g:201:1: ( ruleHackySignature EOF )
            // ../dk.itu.simplifiedjml.ui/src-gen/dk/itu/simplifiedjml/ui/contentassist/antlr/internal/InternalTomato.g:202:1: ruleHackySignature EOF
            {
             before(grammarAccess.getHackySignatureRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleHackySignature_in_entryRuleHackySignature362);
            ruleHackySignature();

            state._fsp--;

             after(grammarAccess.getHackySignatureRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleHackySignature369); 

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
    // $ANTLR end "entryRuleHackySignature"


    // $ANTLR start "ruleHackySignature"
    // ../dk.itu.simplifiedjml.ui/src-gen/dk/itu/simplifiedjml/ui/contentassist/antlr/internal/InternalTomato.g:209:1: ruleHackySignature : ( RULE_HACKY_SIGN ) ;
    public final void ruleHackySignature() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.simplifiedjml.ui/src-gen/dk/itu/simplifiedjml/ui/contentassist/antlr/internal/InternalTomato.g:213:2: ( ( RULE_HACKY_SIGN ) )
            // ../dk.itu.simplifiedjml.ui/src-gen/dk/itu/simplifiedjml/ui/contentassist/antlr/internal/InternalTomato.g:214:1: ( RULE_HACKY_SIGN )
            {
            // ../dk.itu.simplifiedjml.ui/src-gen/dk/itu/simplifiedjml/ui/contentassist/antlr/internal/InternalTomato.g:214:1: ( RULE_HACKY_SIGN )
            // ../dk.itu.simplifiedjml.ui/src-gen/dk/itu/simplifiedjml/ui/contentassist/antlr/internal/InternalTomato.g:215:1: RULE_HACKY_SIGN
            {
             before(grammarAccess.getHackySignatureAccess().getHACKY_SIGNTerminalRuleCall()); 
            match(input,RULE_HACKY_SIGN,FollowSets000.FOLLOW_RULE_HACKY_SIGN_in_ruleHackySignature395); 
             after(grammarAccess.getHackySignatureAccess().getHACKY_SIGNTerminalRuleCall()); 

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
    // $ANTLR end "ruleHackySignature"


    // $ANTLR start "rule__EString__Alternatives"
    // ../dk.itu.simplifiedjml.ui/src-gen/dk/itu/simplifiedjml/ui/contentassist/antlr/internal/InternalTomato.g:228:1: rule__EString__Alternatives : ( ( RULE_STRING ) | ( RULE_ID ) );
    public final void rule__EString__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.simplifiedjml.ui/src-gen/dk/itu/simplifiedjml/ui/contentassist/antlr/internal/InternalTomato.g:232:1: ( ( RULE_STRING ) | ( RULE_ID ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==RULE_STRING) ) {
                alt2=1;
            }
            else if ( (LA2_0==RULE_ID) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // ../dk.itu.simplifiedjml.ui/src-gen/dk/itu/simplifiedjml/ui/contentassist/antlr/internal/InternalTomato.g:233:1: ( RULE_STRING )
                    {
                    // ../dk.itu.simplifiedjml.ui/src-gen/dk/itu/simplifiedjml/ui/contentassist/antlr/internal/InternalTomato.g:233:1: ( RULE_STRING )
                    // ../dk.itu.simplifiedjml.ui/src-gen/dk/itu/simplifiedjml/ui/contentassist/antlr/internal/InternalTomato.g:234:1: RULE_STRING
                    {
                     before(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 
                    match(input,RULE_STRING,FollowSets000.FOLLOW_RULE_STRING_in_rule__EString__Alternatives430); 
                     after(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../dk.itu.simplifiedjml.ui/src-gen/dk/itu/simplifiedjml/ui/contentassist/antlr/internal/InternalTomato.g:239:6: ( RULE_ID )
                    {
                    // ../dk.itu.simplifiedjml.ui/src-gen/dk/itu/simplifiedjml/ui/contentassist/antlr/internal/InternalTomato.g:239:6: ( RULE_ID )
                    // ../dk.itu.simplifiedjml.ui/src-gen/dk/itu/simplifiedjml/ui/contentassist/antlr/internal/InternalTomato.g:240:1: RULE_ID
                    {
                     before(grammarAccess.getEStringAccess().getIDTerminalRuleCall_1()); 
                    match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_rule__EString__Alternatives447); 
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


    // $ANTLR start "rule__AnyOther__Alternatives"
    // ../dk.itu.simplifiedjml.ui/src-gen/dk/itu/simplifiedjml/ui/contentassist/antlr/internal/InternalTomato.g:250:1: rule__AnyOther__Alternatives : ( ( RULE_ANY_OTHER ) | ( RULE_ID ) );
    public final void rule__AnyOther__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.simplifiedjml.ui/src-gen/dk/itu/simplifiedjml/ui/contentassist/antlr/internal/InternalTomato.g:254:1: ( ( RULE_ANY_OTHER ) | ( RULE_ID ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==RULE_ANY_OTHER) ) {
                alt3=1;
            }
            else if ( (LA3_0==RULE_ID) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // ../dk.itu.simplifiedjml.ui/src-gen/dk/itu/simplifiedjml/ui/contentassist/antlr/internal/InternalTomato.g:255:1: ( RULE_ANY_OTHER )
                    {
                    // ../dk.itu.simplifiedjml.ui/src-gen/dk/itu/simplifiedjml/ui/contentassist/antlr/internal/InternalTomato.g:255:1: ( RULE_ANY_OTHER )
                    // ../dk.itu.simplifiedjml.ui/src-gen/dk/itu/simplifiedjml/ui/contentassist/antlr/internal/InternalTomato.g:256:1: RULE_ANY_OTHER
                    {
                     before(grammarAccess.getAnyOtherAccess().getANY_OTHERTerminalRuleCall_0()); 
                    match(input,RULE_ANY_OTHER,FollowSets000.FOLLOW_RULE_ANY_OTHER_in_rule__AnyOther__Alternatives479); 
                     after(grammarAccess.getAnyOtherAccess().getANY_OTHERTerminalRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../dk.itu.simplifiedjml.ui/src-gen/dk/itu/simplifiedjml/ui/contentassist/antlr/internal/InternalTomato.g:261:6: ( RULE_ID )
                    {
                    // ../dk.itu.simplifiedjml.ui/src-gen/dk/itu/simplifiedjml/ui/contentassist/antlr/internal/InternalTomato.g:261:6: ( RULE_ID )
                    // ../dk.itu.simplifiedjml.ui/src-gen/dk/itu/simplifiedjml/ui/contentassist/antlr/internal/InternalTomato.g:262:1: RULE_ID
                    {
                     before(grammarAccess.getAnyOtherAccess().getIDTerminalRuleCall_1()); 
                    match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_rule__AnyOther__Alternatives496); 
                     after(grammarAccess.getAnyOtherAccess().getIDTerminalRuleCall_1()); 

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
    // $ANTLR end "rule__AnyOther__Alternatives"


    // $ANTLR start "rule__SimplifiedJMLModel__Group__0"
    // ../dk.itu.simplifiedjml.ui/src-gen/dk/itu/simplifiedjml/ui/contentassist/antlr/internal/InternalTomato.g:274:1: rule__SimplifiedJMLModel__Group__0 : rule__SimplifiedJMLModel__Group__0__Impl rule__SimplifiedJMLModel__Group__1 ;
    public final void rule__SimplifiedJMLModel__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.simplifiedjml.ui/src-gen/dk/itu/simplifiedjml/ui/contentassist/antlr/internal/InternalTomato.g:278:1: ( rule__SimplifiedJMLModel__Group__0__Impl rule__SimplifiedJMLModel__Group__1 )
            // ../dk.itu.simplifiedjml.ui/src-gen/dk/itu/simplifiedjml/ui/contentassist/antlr/internal/InternalTomato.g:279:2: rule__SimplifiedJMLModel__Group__0__Impl rule__SimplifiedJMLModel__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__SimplifiedJMLModel__Group__0__Impl_in_rule__SimplifiedJMLModel__Group__0526);
            rule__SimplifiedJMLModel__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__SimplifiedJMLModel__Group__1_in_rule__SimplifiedJMLModel__Group__0529);
            rule__SimplifiedJMLModel__Group__1();

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
    // $ANTLR end "rule__SimplifiedJMLModel__Group__0"


    // $ANTLR start "rule__SimplifiedJMLModel__Group__0__Impl"
    // ../dk.itu.simplifiedjml.ui/src-gen/dk/itu/simplifiedjml/ui/contentassist/antlr/internal/InternalTomato.g:286:1: rule__SimplifiedJMLModel__Group__0__Impl : ( ( rule__SimplifiedJMLModel__StructuresAssignment_0 ) ) ;
    public final void rule__SimplifiedJMLModel__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.simplifiedjml.ui/src-gen/dk/itu/simplifiedjml/ui/contentassist/antlr/internal/InternalTomato.g:290:1: ( ( ( rule__SimplifiedJMLModel__StructuresAssignment_0 ) ) )
            // ../dk.itu.simplifiedjml.ui/src-gen/dk/itu/simplifiedjml/ui/contentassist/antlr/internal/InternalTomato.g:291:1: ( ( rule__SimplifiedJMLModel__StructuresAssignment_0 ) )
            {
            // ../dk.itu.simplifiedjml.ui/src-gen/dk/itu/simplifiedjml/ui/contentassist/antlr/internal/InternalTomato.g:291:1: ( ( rule__SimplifiedJMLModel__StructuresAssignment_0 ) )
            // ../dk.itu.simplifiedjml.ui/src-gen/dk/itu/simplifiedjml/ui/contentassist/antlr/internal/InternalTomato.g:292:1: ( rule__SimplifiedJMLModel__StructuresAssignment_0 )
            {
             before(grammarAccess.getSimplifiedJMLModelAccess().getStructuresAssignment_0()); 
            // ../dk.itu.simplifiedjml.ui/src-gen/dk/itu/simplifiedjml/ui/contentassist/antlr/internal/InternalTomato.g:293:1: ( rule__SimplifiedJMLModel__StructuresAssignment_0 )
            // ../dk.itu.simplifiedjml.ui/src-gen/dk/itu/simplifiedjml/ui/contentassist/antlr/internal/InternalTomato.g:293:2: rule__SimplifiedJMLModel__StructuresAssignment_0
            {
            pushFollow(FollowSets000.FOLLOW_rule__SimplifiedJMLModel__StructuresAssignment_0_in_rule__SimplifiedJMLModel__Group__0__Impl556);
            rule__SimplifiedJMLModel__StructuresAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getSimplifiedJMLModelAccess().getStructuresAssignment_0()); 

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
    // $ANTLR end "rule__SimplifiedJMLModel__Group__0__Impl"


    // $ANTLR start "rule__SimplifiedJMLModel__Group__1"
    // ../dk.itu.simplifiedjml.ui/src-gen/dk/itu/simplifiedjml/ui/contentassist/antlr/internal/InternalTomato.g:303:1: rule__SimplifiedJMLModel__Group__1 : rule__SimplifiedJMLModel__Group__1__Impl ;
    public final void rule__SimplifiedJMLModel__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.simplifiedjml.ui/src-gen/dk/itu/simplifiedjml/ui/contentassist/antlr/internal/InternalTomato.g:307:1: ( rule__SimplifiedJMLModel__Group__1__Impl )
            // ../dk.itu.simplifiedjml.ui/src-gen/dk/itu/simplifiedjml/ui/contentassist/antlr/internal/InternalTomato.g:308:2: rule__SimplifiedJMLModel__Group__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__SimplifiedJMLModel__Group__1__Impl_in_rule__SimplifiedJMLModel__Group__1586);
            rule__SimplifiedJMLModel__Group__1__Impl();

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
    // $ANTLR end "rule__SimplifiedJMLModel__Group__1"


    // $ANTLR start "rule__SimplifiedJMLModel__Group__1__Impl"
    // ../dk.itu.simplifiedjml.ui/src-gen/dk/itu/simplifiedjml/ui/contentassist/antlr/internal/InternalTomato.g:314:1: rule__SimplifiedJMLModel__Group__1__Impl : ( ( rule__SimplifiedJMLModel__StructuresAssignment_1 )* ) ;
    public final void rule__SimplifiedJMLModel__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.simplifiedjml.ui/src-gen/dk/itu/simplifiedjml/ui/contentassist/antlr/internal/InternalTomato.g:318:1: ( ( ( rule__SimplifiedJMLModel__StructuresAssignment_1 )* ) )
            // ../dk.itu.simplifiedjml.ui/src-gen/dk/itu/simplifiedjml/ui/contentassist/antlr/internal/InternalTomato.g:319:1: ( ( rule__SimplifiedJMLModel__StructuresAssignment_1 )* )
            {
            // ../dk.itu.simplifiedjml.ui/src-gen/dk/itu/simplifiedjml/ui/contentassist/antlr/internal/InternalTomato.g:319:1: ( ( rule__SimplifiedJMLModel__StructuresAssignment_1 )* )
            // ../dk.itu.simplifiedjml.ui/src-gen/dk/itu/simplifiedjml/ui/contentassist/antlr/internal/InternalTomato.g:320:1: ( rule__SimplifiedJMLModel__StructuresAssignment_1 )*
            {
             before(grammarAccess.getSimplifiedJMLModelAccess().getStructuresAssignment_1()); 
            // ../dk.itu.simplifiedjml.ui/src-gen/dk/itu/simplifiedjml/ui/contentassist/antlr/internal/InternalTomato.g:321:1: ( rule__SimplifiedJMLModel__StructuresAssignment_1 )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==12) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // ../dk.itu.simplifiedjml.ui/src-gen/dk/itu/simplifiedjml/ui/contentassist/antlr/internal/InternalTomato.g:321:2: rule__SimplifiedJMLModel__StructuresAssignment_1
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__SimplifiedJMLModel__StructuresAssignment_1_in_rule__SimplifiedJMLModel__Group__1__Impl613);
            	    rule__SimplifiedJMLModel__StructuresAssignment_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

             after(grammarAccess.getSimplifiedJMLModelAccess().getStructuresAssignment_1()); 

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
    // $ANTLR end "rule__SimplifiedJMLModel__Group__1__Impl"


    // $ANTLR start "rule__Structure__Group__0"
    // ../dk.itu.simplifiedjml.ui/src-gen/dk/itu/simplifiedjml/ui/contentassist/antlr/internal/InternalTomato.g:335:1: rule__Structure__Group__0 : rule__Structure__Group__0__Impl rule__Structure__Group__1 ;
    public final void rule__Structure__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.simplifiedjml.ui/src-gen/dk/itu/simplifiedjml/ui/contentassist/antlr/internal/InternalTomato.g:339:1: ( rule__Structure__Group__0__Impl rule__Structure__Group__1 )
            // ../dk.itu.simplifiedjml.ui/src-gen/dk/itu/simplifiedjml/ui/contentassist/antlr/internal/InternalTomato.g:340:2: rule__Structure__Group__0__Impl rule__Structure__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Structure__Group__0__Impl_in_rule__Structure__Group__0648);
            rule__Structure__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Structure__Group__1_in_rule__Structure__Group__0651);
            rule__Structure__Group__1();

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
    // $ANTLR end "rule__Structure__Group__0"


    // $ANTLR start "rule__Structure__Group__0__Impl"
    // ../dk.itu.simplifiedjml.ui/src-gen/dk/itu/simplifiedjml/ui/contentassist/antlr/internal/InternalTomato.g:347:1: rule__Structure__Group__0__Impl : ( () ) ;
    public final void rule__Structure__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.simplifiedjml.ui/src-gen/dk/itu/simplifiedjml/ui/contentassist/antlr/internal/InternalTomato.g:351:1: ( ( () ) )
            // ../dk.itu.simplifiedjml.ui/src-gen/dk/itu/simplifiedjml/ui/contentassist/antlr/internal/InternalTomato.g:352:1: ( () )
            {
            // ../dk.itu.simplifiedjml.ui/src-gen/dk/itu/simplifiedjml/ui/contentassist/antlr/internal/InternalTomato.g:352:1: ( () )
            // ../dk.itu.simplifiedjml.ui/src-gen/dk/itu/simplifiedjml/ui/contentassist/antlr/internal/InternalTomato.g:353:1: ()
            {
             before(grammarAccess.getStructureAccess().getStructureAction_0()); 
            // ../dk.itu.simplifiedjml.ui/src-gen/dk/itu/simplifiedjml/ui/contentassist/antlr/internal/InternalTomato.g:354:1: ()
            // ../dk.itu.simplifiedjml.ui/src-gen/dk/itu/simplifiedjml/ui/contentassist/antlr/internal/InternalTomato.g:356:1: 
            {
            }

             after(grammarAccess.getStructureAccess().getStructureAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Structure__Group__0__Impl"


    // $ANTLR start "rule__Structure__Group__1"
    // ../dk.itu.simplifiedjml.ui/src-gen/dk/itu/simplifiedjml/ui/contentassist/antlr/internal/InternalTomato.g:366:1: rule__Structure__Group__1 : rule__Structure__Group__1__Impl rule__Structure__Group__2 ;
    public final void rule__Structure__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.simplifiedjml.ui/src-gen/dk/itu/simplifiedjml/ui/contentassist/antlr/internal/InternalTomato.g:370:1: ( rule__Structure__Group__1__Impl rule__Structure__Group__2 )
            // ../dk.itu.simplifiedjml.ui/src-gen/dk/itu/simplifiedjml/ui/contentassist/antlr/internal/InternalTomato.g:371:2: rule__Structure__Group__1__Impl rule__Structure__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Structure__Group__1__Impl_in_rule__Structure__Group__1709);
            rule__Structure__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Structure__Group__2_in_rule__Structure__Group__1712);
            rule__Structure__Group__2();

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
    // $ANTLR end "rule__Structure__Group__1"


    // $ANTLR start "rule__Structure__Group__1__Impl"
    // ../dk.itu.simplifiedjml.ui/src-gen/dk/itu/simplifiedjml/ui/contentassist/antlr/internal/InternalTomato.g:378:1: rule__Structure__Group__1__Impl : ( 'class' ) ;
    public final void rule__Structure__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.simplifiedjml.ui/src-gen/dk/itu/simplifiedjml/ui/contentassist/antlr/internal/InternalTomato.g:382:1: ( ( 'class' ) )
            // ../dk.itu.simplifiedjml.ui/src-gen/dk/itu/simplifiedjml/ui/contentassist/antlr/internal/InternalTomato.g:383:1: ( 'class' )
            {
            // ../dk.itu.simplifiedjml.ui/src-gen/dk/itu/simplifiedjml/ui/contentassist/antlr/internal/InternalTomato.g:383:1: ( 'class' )
            // ../dk.itu.simplifiedjml.ui/src-gen/dk/itu/simplifiedjml/ui/contentassist/antlr/internal/InternalTomato.g:384:1: 'class'
            {
             before(grammarAccess.getStructureAccess().getClassKeyword_1()); 
            match(input,12,FollowSets000.FOLLOW_12_in_rule__Structure__Group__1__Impl740); 
             after(grammarAccess.getStructureAccess().getClassKeyword_1()); 

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
    // $ANTLR end "rule__Structure__Group__1__Impl"


    // $ANTLR start "rule__Structure__Group__2"
    // ../dk.itu.simplifiedjml.ui/src-gen/dk/itu/simplifiedjml/ui/contentassist/antlr/internal/InternalTomato.g:397:1: rule__Structure__Group__2 : rule__Structure__Group__2__Impl rule__Structure__Group__3 ;
    public final void rule__Structure__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.simplifiedjml.ui/src-gen/dk/itu/simplifiedjml/ui/contentassist/antlr/internal/InternalTomato.g:401:1: ( rule__Structure__Group__2__Impl rule__Structure__Group__3 )
            // ../dk.itu.simplifiedjml.ui/src-gen/dk/itu/simplifiedjml/ui/contentassist/antlr/internal/InternalTomato.g:402:2: rule__Structure__Group__2__Impl rule__Structure__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__Structure__Group__2__Impl_in_rule__Structure__Group__2771);
            rule__Structure__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Structure__Group__3_in_rule__Structure__Group__2774);
            rule__Structure__Group__3();

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
    // $ANTLR end "rule__Structure__Group__2"


    // $ANTLR start "rule__Structure__Group__2__Impl"
    // ../dk.itu.simplifiedjml.ui/src-gen/dk/itu/simplifiedjml/ui/contentassist/antlr/internal/InternalTomato.g:409:1: rule__Structure__Group__2__Impl : ( ( rule__Structure__NameAssignment_2 ) ) ;
    public final void rule__Structure__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.simplifiedjml.ui/src-gen/dk/itu/simplifiedjml/ui/contentassist/antlr/internal/InternalTomato.g:413:1: ( ( ( rule__Structure__NameAssignment_2 ) ) )
            // ../dk.itu.simplifiedjml.ui/src-gen/dk/itu/simplifiedjml/ui/contentassist/antlr/internal/InternalTomato.g:414:1: ( ( rule__Structure__NameAssignment_2 ) )
            {
            // ../dk.itu.simplifiedjml.ui/src-gen/dk/itu/simplifiedjml/ui/contentassist/antlr/internal/InternalTomato.g:414:1: ( ( rule__Structure__NameAssignment_2 ) )
            // ../dk.itu.simplifiedjml.ui/src-gen/dk/itu/simplifiedjml/ui/contentassist/antlr/internal/InternalTomato.g:415:1: ( rule__Structure__NameAssignment_2 )
            {
             before(grammarAccess.getStructureAccess().getNameAssignment_2()); 
            // ../dk.itu.simplifiedjml.ui/src-gen/dk/itu/simplifiedjml/ui/contentassist/antlr/internal/InternalTomato.g:416:1: ( rule__Structure__NameAssignment_2 )
            // ../dk.itu.simplifiedjml.ui/src-gen/dk/itu/simplifiedjml/ui/contentassist/antlr/internal/InternalTomato.g:416:2: rule__Structure__NameAssignment_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Structure__NameAssignment_2_in_rule__Structure__Group__2__Impl801);
            rule__Structure__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getStructureAccess().getNameAssignment_2()); 

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
    // $ANTLR end "rule__Structure__Group__2__Impl"


    // $ANTLR start "rule__Structure__Group__3"
    // ../dk.itu.simplifiedjml.ui/src-gen/dk/itu/simplifiedjml/ui/contentassist/antlr/internal/InternalTomato.g:426:1: rule__Structure__Group__3 : rule__Structure__Group__3__Impl rule__Structure__Group__4 ;
    public final void rule__Structure__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.simplifiedjml.ui/src-gen/dk/itu/simplifiedjml/ui/contentassist/antlr/internal/InternalTomato.g:430:1: ( rule__Structure__Group__3__Impl rule__Structure__Group__4 )
            // ../dk.itu.simplifiedjml.ui/src-gen/dk/itu/simplifiedjml/ui/contentassist/antlr/internal/InternalTomato.g:431:2: rule__Structure__Group__3__Impl rule__Structure__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__Structure__Group__3__Impl_in_rule__Structure__Group__3831);
            rule__Structure__Group__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Structure__Group__4_in_rule__Structure__Group__3834);
            rule__Structure__Group__4();

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
    // $ANTLR end "rule__Structure__Group__3"


    // $ANTLR start "rule__Structure__Group__3__Impl"
    // ../dk.itu.simplifiedjml.ui/src-gen/dk/itu/simplifiedjml/ui/contentassist/antlr/internal/InternalTomato.g:438:1: rule__Structure__Group__3__Impl : ( '{' ) ;
    public final void rule__Structure__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.simplifiedjml.ui/src-gen/dk/itu/simplifiedjml/ui/contentassist/antlr/internal/InternalTomato.g:442:1: ( ( '{' ) )
            // ../dk.itu.simplifiedjml.ui/src-gen/dk/itu/simplifiedjml/ui/contentassist/antlr/internal/InternalTomato.g:443:1: ( '{' )
            {
            // ../dk.itu.simplifiedjml.ui/src-gen/dk/itu/simplifiedjml/ui/contentassist/antlr/internal/InternalTomato.g:443:1: ( '{' )
            // ../dk.itu.simplifiedjml.ui/src-gen/dk/itu/simplifiedjml/ui/contentassist/antlr/internal/InternalTomato.g:444:1: '{'
            {
             before(grammarAccess.getStructureAccess().getLeftCurlyBracketKeyword_3()); 
            match(input,13,FollowSets000.FOLLOW_13_in_rule__Structure__Group__3__Impl862); 
             after(grammarAccess.getStructureAccess().getLeftCurlyBracketKeyword_3()); 

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
    // $ANTLR end "rule__Structure__Group__3__Impl"


    // $ANTLR start "rule__Structure__Group__4"
    // ../dk.itu.simplifiedjml.ui/src-gen/dk/itu/simplifiedjml/ui/contentassist/antlr/internal/InternalTomato.g:457:1: rule__Structure__Group__4 : rule__Structure__Group__4__Impl rule__Structure__Group__5 ;
    public final void rule__Structure__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.simplifiedjml.ui/src-gen/dk/itu/simplifiedjml/ui/contentassist/antlr/internal/InternalTomato.g:461:1: ( rule__Structure__Group__4__Impl rule__Structure__Group__5 )
            // ../dk.itu.simplifiedjml.ui/src-gen/dk/itu/simplifiedjml/ui/contentassist/antlr/internal/InternalTomato.g:462:2: rule__Structure__Group__4__Impl rule__Structure__Group__5
            {
            pushFollow(FollowSets000.FOLLOW_rule__Structure__Group__4__Impl_in_rule__Structure__Group__4893);
            rule__Structure__Group__4__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Structure__Group__5_in_rule__Structure__Group__4896);
            rule__Structure__Group__5();

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
    // $ANTLR end "rule__Structure__Group__4"


    // $ANTLR start "rule__Structure__Group__4__Impl"
    // ../dk.itu.simplifiedjml.ui/src-gen/dk/itu/simplifiedjml/ui/contentassist/antlr/internal/InternalTomato.g:469:1: rule__Structure__Group__4__Impl : ( ( rule__Structure__Group_4__0 )? ) ;
    public final void rule__Structure__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.simplifiedjml.ui/src-gen/dk/itu/simplifiedjml/ui/contentassist/antlr/internal/InternalTomato.g:473:1: ( ( ( rule__Structure__Group_4__0 )? ) )
            // ../dk.itu.simplifiedjml.ui/src-gen/dk/itu/simplifiedjml/ui/contentassist/antlr/internal/InternalTomato.g:474:1: ( ( rule__Structure__Group_4__0 )? )
            {
            // ../dk.itu.simplifiedjml.ui/src-gen/dk/itu/simplifiedjml/ui/contentassist/antlr/internal/InternalTomato.g:474:1: ( ( rule__Structure__Group_4__0 )? )
            // ../dk.itu.simplifiedjml.ui/src-gen/dk/itu/simplifiedjml/ui/contentassist/antlr/internal/InternalTomato.g:475:1: ( rule__Structure__Group_4__0 )?
            {
             before(grammarAccess.getStructureAccess().getGroup_4()); 
            // ../dk.itu.simplifiedjml.ui/src-gen/dk/itu/simplifiedjml/ui/contentassist/antlr/internal/InternalTomato.g:476:1: ( rule__Structure__Group_4__0 )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==15) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // ../dk.itu.simplifiedjml.ui/src-gen/dk/itu/simplifiedjml/ui/contentassist/antlr/internal/InternalTomato.g:476:2: rule__Structure__Group_4__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__Structure__Group_4__0_in_rule__Structure__Group__4__Impl923);
                    rule__Structure__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getStructureAccess().getGroup_4()); 

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
    // $ANTLR end "rule__Structure__Group__4__Impl"


    // $ANTLR start "rule__Structure__Group__5"
    // ../dk.itu.simplifiedjml.ui/src-gen/dk/itu/simplifiedjml/ui/contentassist/antlr/internal/InternalTomato.g:486:1: rule__Structure__Group__5 : rule__Structure__Group__5__Impl rule__Structure__Group__6 ;
    public final void rule__Structure__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.simplifiedjml.ui/src-gen/dk/itu/simplifiedjml/ui/contentassist/antlr/internal/InternalTomato.g:490:1: ( rule__Structure__Group__5__Impl rule__Structure__Group__6 )
            // ../dk.itu.simplifiedjml.ui/src-gen/dk/itu/simplifiedjml/ui/contentassist/antlr/internal/InternalTomato.g:491:2: rule__Structure__Group__5__Impl rule__Structure__Group__6
            {
            pushFollow(FollowSets000.FOLLOW_rule__Structure__Group__5__Impl_in_rule__Structure__Group__5954);
            rule__Structure__Group__5__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Structure__Group__6_in_rule__Structure__Group__5957);
            rule__Structure__Group__6();

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
    // $ANTLR end "rule__Structure__Group__5"


    // $ANTLR start "rule__Structure__Group__5__Impl"
    // ../dk.itu.simplifiedjml.ui/src-gen/dk/itu/simplifiedjml/ui/contentassist/antlr/internal/InternalTomato.g:498:1: rule__Structure__Group__5__Impl : ( ( rule__Structure__Group_5__0 )? ) ;
    public final void rule__Structure__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.simplifiedjml.ui/src-gen/dk/itu/simplifiedjml/ui/contentassist/antlr/internal/InternalTomato.g:502:1: ( ( ( rule__Structure__Group_5__0 )? ) )
            // ../dk.itu.simplifiedjml.ui/src-gen/dk/itu/simplifiedjml/ui/contentassist/antlr/internal/InternalTomato.g:503:1: ( ( rule__Structure__Group_5__0 )? )
            {
            // ../dk.itu.simplifiedjml.ui/src-gen/dk/itu/simplifiedjml/ui/contentassist/antlr/internal/InternalTomato.g:503:1: ( ( rule__Structure__Group_5__0 )? )
            // ../dk.itu.simplifiedjml.ui/src-gen/dk/itu/simplifiedjml/ui/contentassist/antlr/internal/InternalTomato.g:504:1: ( rule__Structure__Group_5__0 )?
            {
             before(grammarAccess.getStructureAccess().getGroup_5()); 
            // ../dk.itu.simplifiedjml.ui/src-gen/dk/itu/simplifiedjml/ui/contentassist/antlr/internal/InternalTomato.g:505:1: ( rule__Structure__Group_5__0 )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==16||LA6_0==19||LA6_0==21) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // ../dk.itu.simplifiedjml.ui/src-gen/dk/itu/simplifiedjml/ui/contentassist/antlr/internal/InternalTomato.g:505:2: rule__Structure__Group_5__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__Structure__Group_5__0_in_rule__Structure__Group__5__Impl984);
                    rule__Structure__Group_5__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getStructureAccess().getGroup_5()); 

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
    // $ANTLR end "rule__Structure__Group__5__Impl"


    // $ANTLR start "rule__Structure__Group__6"
    // ../dk.itu.simplifiedjml.ui/src-gen/dk/itu/simplifiedjml/ui/contentassist/antlr/internal/InternalTomato.g:515:1: rule__Structure__Group__6 : rule__Structure__Group__6__Impl ;
    public final void rule__Structure__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.simplifiedjml.ui/src-gen/dk/itu/simplifiedjml/ui/contentassist/antlr/internal/InternalTomato.g:519:1: ( rule__Structure__Group__6__Impl )
            // ../dk.itu.simplifiedjml.ui/src-gen/dk/itu/simplifiedjml/ui/contentassist/antlr/internal/InternalTomato.g:520:2: rule__Structure__Group__6__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Structure__Group__6__Impl_in_rule__Structure__Group__61015);
            rule__Structure__Group__6__Impl();

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
    // $ANTLR end "rule__Structure__Group__6"


    // $ANTLR start "rule__Structure__Group__6__Impl"
    // ../dk.itu.simplifiedjml.ui/src-gen/dk/itu/simplifiedjml/ui/contentassist/antlr/internal/InternalTomato.g:526:1: rule__Structure__Group__6__Impl : ( '}' ) ;
    public final void rule__Structure__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.simplifiedjml.ui/src-gen/dk/itu/simplifiedjml/ui/contentassist/antlr/internal/InternalTomato.g:530:1: ( ( '}' ) )
            // ../dk.itu.simplifiedjml.ui/src-gen/dk/itu/simplifiedjml/ui/contentassist/antlr/internal/InternalTomato.g:531:1: ( '}' )
            {
            // ../dk.itu.simplifiedjml.ui/src-gen/dk/itu/simplifiedjml/ui/contentassist/antlr/internal/InternalTomato.g:531:1: ( '}' )
            // ../dk.itu.simplifiedjml.ui/src-gen/dk/itu/simplifiedjml/ui/contentassist/antlr/internal/InternalTomato.g:532:1: '}'
            {
             before(grammarAccess.getStructureAccess().getRightCurlyBracketKeyword_6()); 
            match(input,14,FollowSets000.FOLLOW_14_in_rule__Structure__Group__6__Impl1043); 
             after(grammarAccess.getStructureAccess().getRightCurlyBracketKeyword_6()); 

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
    // $ANTLR end "rule__Structure__Group__6__Impl"


    // $ANTLR start "rule__Structure__Group_4__0"
    // ../dk.itu.simplifiedjml.ui/src-gen/dk/itu/simplifiedjml/ui/contentassist/antlr/internal/InternalTomato.g:559:1: rule__Structure__Group_4__0 : rule__Structure__Group_4__0__Impl rule__Structure__Group_4__1 ;
    public final void rule__Structure__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.simplifiedjml.ui/src-gen/dk/itu/simplifiedjml/ui/contentassist/antlr/internal/InternalTomato.g:563:1: ( rule__Structure__Group_4__0__Impl rule__Structure__Group_4__1 )
            // ../dk.itu.simplifiedjml.ui/src-gen/dk/itu/simplifiedjml/ui/contentassist/antlr/internal/InternalTomato.g:564:2: rule__Structure__Group_4__0__Impl rule__Structure__Group_4__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Structure__Group_4__0__Impl_in_rule__Structure__Group_4__01088);
            rule__Structure__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Structure__Group_4__1_in_rule__Structure__Group_4__01091);
            rule__Structure__Group_4__1();

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
    // $ANTLR end "rule__Structure__Group_4__0"


    // $ANTLR start "rule__Structure__Group_4__0__Impl"
    // ../dk.itu.simplifiedjml.ui/src-gen/dk/itu/simplifiedjml/ui/contentassist/antlr/internal/InternalTomato.g:571:1: rule__Structure__Group_4__0__Impl : ( '//@ invariant' ) ;
    public final void rule__Structure__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.simplifiedjml.ui/src-gen/dk/itu/simplifiedjml/ui/contentassist/antlr/internal/InternalTomato.g:575:1: ( ( '//@ invariant' ) )
            // ../dk.itu.simplifiedjml.ui/src-gen/dk/itu/simplifiedjml/ui/contentassist/antlr/internal/InternalTomato.g:576:1: ( '//@ invariant' )
            {
            // ../dk.itu.simplifiedjml.ui/src-gen/dk/itu/simplifiedjml/ui/contentassist/antlr/internal/InternalTomato.g:576:1: ( '//@ invariant' )
            // ../dk.itu.simplifiedjml.ui/src-gen/dk/itu/simplifiedjml/ui/contentassist/antlr/internal/InternalTomato.g:577:1: '//@ invariant'
            {
             before(grammarAccess.getStructureAccess().getInvariantKeyword_4_0()); 
            match(input,15,FollowSets000.FOLLOW_15_in_rule__Structure__Group_4__0__Impl1119); 
             after(grammarAccess.getStructureAccess().getInvariantKeyword_4_0()); 

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
    // $ANTLR end "rule__Structure__Group_4__0__Impl"


    // $ANTLR start "rule__Structure__Group_4__1"
    // ../dk.itu.simplifiedjml.ui/src-gen/dk/itu/simplifiedjml/ui/contentassist/antlr/internal/InternalTomato.g:590:1: rule__Structure__Group_4__1 : rule__Structure__Group_4__1__Impl rule__Structure__Group_4__2 ;
    public final void rule__Structure__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.simplifiedjml.ui/src-gen/dk/itu/simplifiedjml/ui/contentassist/antlr/internal/InternalTomato.g:594:1: ( rule__Structure__Group_4__1__Impl rule__Structure__Group_4__2 )
            // ../dk.itu.simplifiedjml.ui/src-gen/dk/itu/simplifiedjml/ui/contentassist/antlr/internal/InternalTomato.g:595:2: rule__Structure__Group_4__1__Impl rule__Structure__Group_4__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Structure__Group_4__1__Impl_in_rule__Structure__Group_4__11150);
            rule__Structure__Group_4__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Structure__Group_4__2_in_rule__Structure__Group_4__11153);
            rule__Structure__Group_4__2();

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
    // $ANTLR end "rule__Structure__Group_4__1"


    // $ANTLR start "rule__Structure__Group_4__1__Impl"
    // ../dk.itu.simplifiedjml.ui/src-gen/dk/itu/simplifiedjml/ui/contentassist/antlr/internal/InternalTomato.g:602:1: rule__Structure__Group_4__1__Impl : ( ( rule__Structure__InvariantsAssignment_4_1 ) ) ;
    public final void rule__Structure__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.simplifiedjml.ui/src-gen/dk/itu/simplifiedjml/ui/contentassist/antlr/internal/InternalTomato.g:606:1: ( ( ( rule__Structure__InvariantsAssignment_4_1 ) ) )
            // ../dk.itu.simplifiedjml.ui/src-gen/dk/itu/simplifiedjml/ui/contentassist/antlr/internal/InternalTomato.g:607:1: ( ( rule__Structure__InvariantsAssignment_4_1 ) )
            {
            // ../dk.itu.simplifiedjml.ui/src-gen/dk/itu/simplifiedjml/ui/contentassist/antlr/internal/InternalTomato.g:607:1: ( ( rule__Structure__InvariantsAssignment_4_1 ) )
            // ../dk.itu.simplifiedjml.ui/src-gen/dk/itu/simplifiedjml/ui/contentassist/antlr/internal/InternalTomato.g:608:1: ( rule__Structure__InvariantsAssignment_4_1 )
            {
             before(grammarAccess.getStructureAccess().getInvariantsAssignment_4_1()); 
            // ../dk.itu.simplifiedjml.ui/src-gen/dk/itu/simplifiedjml/ui/contentassist/antlr/internal/InternalTomato.g:609:1: ( rule__Structure__InvariantsAssignment_4_1 )
            // ../dk.itu.simplifiedjml.ui/src-gen/dk/itu/simplifiedjml/ui/contentassist/antlr/internal/InternalTomato.g:609:2: rule__Structure__InvariantsAssignment_4_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Structure__InvariantsAssignment_4_1_in_rule__Structure__Group_4__1__Impl1180);
            rule__Structure__InvariantsAssignment_4_1();

            state._fsp--;


            }

             after(grammarAccess.getStructureAccess().getInvariantsAssignment_4_1()); 

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
    // $ANTLR end "rule__Structure__Group_4__1__Impl"


    // $ANTLR start "rule__Structure__Group_4__2"
    // ../dk.itu.simplifiedjml.ui/src-gen/dk/itu/simplifiedjml/ui/contentassist/antlr/internal/InternalTomato.g:619:1: rule__Structure__Group_4__2 : rule__Structure__Group_4__2__Impl ;
    public final void rule__Structure__Group_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.simplifiedjml.ui/src-gen/dk/itu/simplifiedjml/ui/contentassist/antlr/internal/InternalTomato.g:623:1: ( rule__Structure__Group_4__2__Impl )
            // ../dk.itu.simplifiedjml.ui/src-gen/dk/itu/simplifiedjml/ui/contentassist/antlr/internal/InternalTomato.g:624:2: rule__Structure__Group_4__2__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Structure__Group_4__2__Impl_in_rule__Structure__Group_4__21210);
            rule__Structure__Group_4__2__Impl();

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
    // $ANTLR end "rule__Structure__Group_4__2"


    // $ANTLR start "rule__Structure__Group_4__2__Impl"
    // ../dk.itu.simplifiedjml.ui/src-gen/dk/itu/simplifiedjml/ui/contentassist/antlr/internal/InternalTomato.g:630:1: rule__Structure__Group_4__2__Impl : ( ( rule__Structure__Group_4_2__0 )* ) ;
    public final void rule__Structure__Group_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.simplifiedjml.ui/src-gen/dk/itu/simplifiedjml/ui/contentassist/antlr/internal/InternalTomato.g:634:1: ( ( ( rule__Structure__Group_4_2__0 )* ) )
            // ../dk.itu.simplifiedjml.ui/src-gen/dk/itu/simplifiedjml/ui/contentassist/antlr/internal/InternalTomato.g:635:1: ( ( rule__Structure__Group_4_2__0 )* )
            {
            // ../dk.itu.simplifiedjml.ui/src-gen/dk/itu/simplifiedjml/ui/contentassist/antlr/internal/InternalTomato.g:635:1: ( ( rule__Structure__Group_4_2__0 )* )
            // ../dk.itu.simplifiedjml.ui/src-gen/dk/itu/simplifiedjml/ui/contentassist/antlr/internal/InternalTomato.g:636:1: ( rule__Structure__Group_4_2__0 )*
            {
             before(grammarAccess.getStructureAccess().getGroup_4_2()); 
            // ../dk.itu.simplifiedjml.ui/src-gen/dk/itu/simplifiedjml/ui/contentassist/antlr/internal/InternalTomato.g:637:1: ( rule__Structure__Group_4_2__0 )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==15) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // ../dk.itu.simplifiedjml.ui/src-gen/dk/itu/simplifiedjml/ui/contentassist/antlr/internal/InternalTomato.g:637:2: rule__Structure__Group_4_2__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__Structure__Group_4_2__0_in_rule__Structure__Group_4__2__Impl1237);
            	    rule__Structure__Group_4_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

             after(grammarAccess.getStructureAccess().getGroup_4_2()); 

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
    // $ANTLR end "rule__Structure__Group_4__2__Impl"


    // $ANTLR start "rule__Structure__Group_4_2__0"
    // ../dk.itu.simplifiedjml.ui/src-gen/dk/itu/simplifiedjml/ui/contentassist/antlr/internal/InternalTomato.g:653:1: rule__Structure__Group_4_2__0 : rule__Structure__Group_4_2__0__Impl rule__Structure__Group_4_2__1 ;
    public final void rule__Structure__Group_4_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.simplifiedjml.ui/src-gen/dk/itu/simplifiedjml/ui/contentassist/antlr/internal/InternalTomato.g:657:1: ( rule__Structure__Group_4_2__0__Impl rule__Structure__Group_4_2__1 )
            // ../dk.itu.simplifiedjml.ui/src-gen/dk/itu/simplifiedjml/ui/contentassist/antlr/internal/InternalTomato.g:658:2: rule__Structure__Group_4_2__0__Impl rule__Structure__Group_4_2__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Structure__Group_4_2__0__Impl_in_rule__Structure__Group_4_2__01274);
            rule__Structure__Group_4_2__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Structure__Group_4_2__1_in_rule__Structure__Group_4_2__01277);
            rule__Structure__Group_4_2__1();

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
    // $ANTLR end "rule__Structure__Group_4_2__0"


    // $ANTLR start "rule__Structure__Group_4_2__0__Impl"
    // ../dk.itu.simplifiedjml.ui/src-gen/dk/itu/simplifiedjml/ui/contentassist/antlr/internal/InternalTomato.g:665:1: rule__Structure__Group_4_2__0__Impl : ( '//@ invariant' ) ;
    public final void rule__Structure__Group_4_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.simplifiedjml.ui/src-gen/dk/itu/simplifiedjml/ui/contentassist/antlr/internal/InternalTomato.g:669:1: ( ( '//@ invariant' ) )
            // ../dk.itu.simplifiedjml.ui/src-gen/dk/itu/simplifiedjml/ui/contentassist/antlr/internal/InternalTomato.g:670:1: ( '//@ invariant' )
            {
            // ../dk.itu.simplifiedjml.ui/src-gen/dk/itu/simplifiedjml/ui/contentassist/antlr/internal/InternalTomato.g:670:1: ( '//@ invariant' )
            // ../dk.itu.simplifiedjml.ui/src-gen/dk/itu/simplifiedjml/ui/contentassist/antlr/internal/InternalTomato.g:671:1: '//@ invariant'
            {
             before(grammarAccess.getStructureAccess().getInvariantKeyword_4_2_0()); 
            match(input,15,FollowSets000.FOLLOW_15_in_rule__Structure__Group_4_2__0__Impl1305); 
             after(grammarAccess.getStructureAccess().getInvariantKeyword_4_2_0()); 

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
    // $ANTLR end "rule__Structure__Group_4_2__0__Impl"


    // $ANTLR start "rule__Structure__Group_4_2__1"
    // ../dk.itu.simplifiedjml.ui/src-gen/dk/itu/simplifiedjml/ui/contentassist/antlr/internal/InternalTomato.g:684:1: rule__Structure__Group_4_2__1 : rule__Structure__Group_4_2__1__Impl ;
    public final void rule__Structure__Group_4_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.simplifiedjml.ui/src-gen/dk/itu/simplifiedjml/ui/contentassist/antlr/internal/InternalTomato.g:688:1: ( rule__Structure__Group_4_2__1__Impl )
            // ../dk.itu.simplifiedjml.ui/src-gen/dk/itu/simplifiedjml/ui/contentassist/antlr/internal/InternalTomato.g:689:2: rule__Structure__Group_4_2__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Structure__Group_4_2__1__Impl_in_rule__Structure__Group_4_2__11336);
            rule__Structure__Group_4_2__1__Impl();

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
    // $ANTLR end "rule__Structure__Group_4_2__1"


    // $ANTLR start "rule__Structure__Group_4_2__1__Impl"
    // ../dk.itu.simplifiedjml.ui/src-gen/dk/itu/simplifiedjml/ui/contentassist/antlr/internal/InternalTomato.g:695:1: rule__Structure__Group_4_2__1__Impl : ( ( rule__Structure__InvariantsAssignment_4_2_1 ) ) ;
    public final void rule__Structure__Group_4_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.simplifiedjml.ui/src-gen/dk/itu/simplifiedjml/ui/contentassist/antlr/internal/InternalTomato.g:699:1: ( ( ( rule__Structure__InvariantsAssignment_4_2_1 ) ) )
            // ../dk.itu.simplifiedjml.ui/src-gen/dk/itu/simplifiedjml/ui/contentassist/antlr/internal/InternalTomato.g:700:1: ( ( rule__Structure__InvariantsAssignment_4_2_1 ) )
            {
            // ../dk.itu.simplifiedjml.ui/src-gen/dk/itu/simplifiedjml/ui/contentassist/antlr/internal/InternalTomato.g:700:1: ( ( rule__Structure__InvariantsAssignment_4_2_1 ) )
            // ../dk.itu.simplifiedjml.ui/src-gen/dk/itu/simplifiedjml/ui/contentassist/antlr/internal/InternalTomato.g:701:1: ( rule__Structure__InvariantsAssignment_4_2_1 )
            {
             before(grammarAccess.getStructureAccess().getInvariantsAssignment_4_2_1()); 
            // ../dk.itu.simplifiedjml.ui/src-gen/dk/itu/simplifiedjml/ui/contentassist/antlr/internal/InternalTomato.g:702:1: ( rule__Structure__InvariantsAssignment_4_2_1 )
            // ../dk.itu.simplifiedjml.ui/src-gen/dk/itu/simplifiedjml/ui/contentassist/antlr/internal/InternalTomato.g:702:2: rule__Structure__InvariantsAssignment_4_2_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Structure__InvariantsAssignment_4_2_1_in_rule__Structure__Group_4_2__1__Impl1363);
            rule__Structure__InvariantsAssignment_4_2_1();

            state._fsp--;


            }

             after(grammarAccess.getStructureAccess().getInvariantsAssignment_4_2_1()); 

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
    // $ANTLR end "rule__Structure__Group_4_2__1__Impl"


    // $ANTLR start "rule__Structure__Group_5__0"
    // ../dk.itu.simplifiedjml.ui/src-gen/dk/itu/simplifiedjml/ui/contentassist/antlr/internal/InternalTomato.g:716:1: rule__Structure__Group_5__0 : rule__Structure__Group_5__0__Impl rule__Structure__Group_5__1 ;
    public final void rule__Structure__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.simplifiedjml.ui/src-gen/dk/itu/simplifiedjml/ui/contentassist/antlr/internal/InternalTomato.g:720:1: ( rule__Structure__Group_5__0__Impl rule__Structure__Group_5__1 )
            // ../dk.itu.simplifiedjml.ui/src-gen/dk/itu/simplifiedjml/ui/contentassist/antlr/internal/InternalTomato.g:721:2: rule__Structure__Group_5__0__Impl rule__Structure__Group_5__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Structure__Group_5__0__Impl_in_rule__Structure__Group_5__01397);
            rule__Structure__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Structure__Group_5__1_in_rule__Structure__Group_5__01400);
            rule__Structure__Group_5__1();

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
    // $ANTLR end "rule__Structure__Group_5__0"


    // $ANTLR start "rule__Structure__Group_5__0__Impl"
    // ../dk.itu.simplifiedjml.ui/src-gen/dk/itu/simplifiedjml/ui/contentassist/antlr/internal/InternalTomato.g:728:1: rule__Structure__Group_5__0__Impl : ( ( rule__Structure__MethodsAssignment_5_0 ) ) ;
    public final void rule__Structure__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.simplifiedjml.ui/src-gen/dk/itu/simplifiedjml/ui/contentassist/antlr/internal/InternalTomato.g:732:1: ( ( ( rule__Structure__MethodsAssignment_5_0 ) ) )
            // ../dk.itu.simplifiedjml.ui/src-gen/dk/itu/simplifiedjml/ui/contentassist/antlr/internal/InternalTomato.g:733:1: ( ( rule__Structure__MethodsAssignment_5_0 ) )
            {
            // ../dk.itu.simplifiedjml.ui/src-gen/dk/itu/simplifiedjml/ui/contentassist/antlr/internal/InternalTomato.g:733:1: ( ( rule__Structure__MethodsAssignment_5_0 ) )
            // ../dk.itu.simplifiedjml.ui/src-gen/dk/itu/simplifiedjml/ui/contentassist/antlr/internal/InternalTomato.g:734:1: ( rule__Structure__MethodsAssignment_5_0 )
            {
             before(grammarAccess.getStructureAccess().getMethodsAssignment_5_0()); 
            // ../dk.itu.simplifiedjml.ui/src-gen/dk/itu/simplifiedjml/ui/contentassist/antlr/internal/InternalTomato.g:735:1: ( rule__Structure__MethodsAssignment_5_0 )
            // ../dk.itu.simplifiedjml.ui/src-gen/dk/itu/simplifiedjml/ui/contentassist/antlr/internal/InternalTomato.g:735:2: rule__Structure__MethodsAssignment_5_0
            {
            pushFollow(FollowSets000.FOLLOW_rule__Structure__MethodsAssignment_5_0_in_rule__Structure__Group_5__0__Impl1427);
            rule__Structure__MethodsAssignment_5_0();

            state._fsp--;


            }

             after(grammarAccess.getStructureAccess().getMethodsAssignment_5_0()); 

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
    // $ANTLR end "rule__Structure__Group_5__0__Impl"


    // $ANTLR start "rule__Structure__Group_5__1"
    // ../dk.itu.simplifiedjml.ui/src-gen/dk/itu/simplifiedjml/ui/contentassist/antlr/internal/InternalTomato.g:745:1: rule__Structure__Group_5__1 : rule__Structure__Group_5__1__Impl ;
    public final void rule__Structure__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.simplifiedjml.ui/src-gen/dk/itu/simplifiedjml/ui/contentassist/antlr/internal/InternalTomato.g:749:1: ( rule__Structure__Group_5__1__Impl )
            // ../dk.itu.simplifiedjml.ui/src-gen/dk/itu/simplifiedjml/ui/contentassist/antlr/internal/InternalTomato.g:750:2: rule__Structure__Group_5__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Structure__Group_5__1__Impl_in_rule__Structure__Group_5__11457);
            rule__Structure__Group_5__1__Impl();

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
    // $ANTLR end "rule__Structure__Group_5__1"


    // $ANTLR start "rule__Structure__Group_5__1__Impl"
    // ../dk.itu.simplifiedjml.ui/src-gen/dk/itu/simplifiedjml/ui/contentassist/antlr/internal/InternalTomato.g:756:1: rule__Structure__Group_5__1__Impl : ( ( rule__Structure__MethodsAssignment_5_1 )* ) ;
    public final void rule__Structure__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.simplifiedjml.ui/src-gen/dk/itu/simplifiedjml/ui/contentassist/antlr/internal/InternalTomato.g:760:1: ( ( ( rule__Structure__MethodsAssignment_5_1 )* ) )
            // ../dk.itu.simplifiedjml.ui/src-gen/dk/itu/simplifiedjml/ui/contentassist/antlr/internal/InternalTomato.g:761:1: ( ( rule__Structure__MethodsAssignment_5_1 )* )
            {
            // ../dk.itu.simplifiedjml.ui/src-gen/dk/itu/simplifiedjml/ui/contentassist/antlr/internal/InternalTomato.g:761:1: ( ( rule__Structure__MethodsAssignment_5_1 )* )
            // ../dk.itu.simplifiedjml.ui/src-gen/dk/itu/simplifiedjml/ui/contentassist/antlr/internal/InternalTomato.g:762:1: ( rule__Structure__MethodsAssignment_5_1 )*
            {
             before(grammarAccess.getStructureAccess().getMethodsAssignment_5_1()); 
            // ../dk.itu.simplifiedjml.ui/src-gen/dk/itu/simplifiedjml/ui/contentassist/antlr/internal/InternalTomato.g:763:1: ( rule__Structure__MethodsAssignment_5_1 )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==16||LA8_0==19||LA8_0==21) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // ../dk.itu.simplifiedjml.ui/src-gen/dk/itu/simplifiedjml/ui/contentassist/antlr/internal/InternalTomato.g:763:2: rule__Structure__MethodsAssignment_5_1
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__Structure__MethodsAssignment_5_1_in_rule__Structure__Group_5__1__Impl1484);
            	    rule__Structure__MethodsAssignment_5_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

             after(grammarAccess.getStructureAccess().getMethodsAssignment_5_1()); 

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
    // $ANTLR end "rule__Structure__Group_5__1__Impl"


    // $ANTLR start "rule__Method__Group__0"
    // ../dk.itu.simplifiedjml.ui/src-gen/dk/itu/simplifiedjml/ui/contentassist/antlr/internal/InternalTomato.g:777:1: rule__Method__Group__0 : rule__Method__Group__0__Impl rule__Method__Group__1 ;
    public final void rule__Method__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.simplifiedjml.ui/src-gen/dk/itu/simplifiedjml/ui/contentassist/antlr/internal/InternalTomato.g:781:1: ( rule__Method__Group__0__Impl rule__Method__Group__1 )
            // ../dk.itu.simplifiedjml.ui/src-gen/dk/itu/simplifiedjml/ui/contentassist/antlr/internal/InternalTomato.g:782:2: rule__Method__Group__0__Impl rule__Method__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Method__Group__0__Impl_in_rule__Method__Group__01519);
            rule__Method__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Method__Group__1_in_rule__Method__Group__01522);
            rule__Method__Group__1();

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
    // $ANTLR end "rule__Method__Group__0"


    // $ANTLR start "rule__Method__Group__0__Impl"
    // ../dk.itu.simplifiedjml.ui/src-gen/dk/itu/simplifiedjml/ui/contentassist/antlr/internal/InternalTomato.g:789:1: rule__Method__Group__0__Impl : ( () ) ;
    public final void rule__Method__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.simplifiedjml.ui/src-gen/dk/itu/simplifiedjml/ui/contentassist/antlr/internal/InternalTomato.g:793:1: ( ( () ) )
            // ../dk.itu.simplifiedjml.ui/src-gen/dk/itu/simplifiedjml/ui/contentassist/antlr/internal/InternalTomato.g:794:1: ( () )
            {
            // ../dk.itu.simplifiedjml.ui/src-gen/dk/itu/simplifiedjml/ui/contentassist/antlr/internal/InternalTomato.g:794:1: ( () )
            // ../dk.itu.simplifiedjml.ui/src-gen/dk/itu/simplifiedjml/ui/contentassist/antlr/internal/InternalTomato.g:795:1: ()
            {
             before(grammarAccess.getMethodAccess().getMethodAction_0()); 
            // ../dk.itu.simplifiedjml.ui/src-gen/dk/itu/simplifiedjml/ui/contentassist/antlr/internal/InternalTomato.g:796:1: ()
            // ../dk.itu.simplifiedjml.ui/src-gen/dk/itu/simplifiedjml/ui/contentassist/antlr/internal/InternalTomato.g:798:1: 
            {
            }

             after(grammarAccess.getMethodAccess().getMethodAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Method__Group__0__Impl"


    // $ANTLR start "rule__Method__Group__1"
    // ../dk.itu.simplifiedjml.ui/src-gen/dk/itu/simplifiedjml/ui/contentassist/antlr/internal/InternalTomato.g:808:1: rule__Method__Group__1 : rule__Method__Group__1__Impl rule__Method__Group__2 ;
    public final void rule__Method__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.simplifiedjml.ui/src-gen/dk/itu/simplifiedjml/ui/contentassist/antlr/internal/InternalTomato.g:812:1: ( rule__Method__Group__1__Impl rule__Method__Group__2 )
            // ../dk.itu.simplifiedjml.ui/src-gen/dk/itu/simplifiedjml/ui/contentassist/antlr/internal/InternalTomato.g:813:2: rule__Method__Group__1__Impl rule__Method__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Method__Group__1__Impl_in_rule__Method__Group__11580);
            rule__Method__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Method__Group__2_in_rule__Method__Group__11583);
            rule__Method__Group__2();

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
    // $ANTLR end "rule__Method__Group__1"


    // $ANTLR start "rule__Method__Group__1__Impl"
    // ../dk.itu.simplifiedjml.ui/src-gen/dk/itu/simplifiedjml/ui/contentassist/antlr/internal/InternalTomato.g:820:1: rule__Method__Group__1__Impl : ( ( rule__Method__Group_1__0 )? ) ;
    public final void rule__Method__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.simplifiedjml.ui/src-gen/dk/itu/simplifiedjml/ui/contentassist/antlr/internal/InternalTomato.g:824:1: ( ( ( rule__Method__Group_1__0 )? ) )
            // ../dk.itu.simplifiedjml.ui/src-gen/dk/itu/simplifiedjml/ui/contentassist/antlr/internal/InternalTomato.g:825:1: ( ( rule__Method__Group_1__0 )? )
            {
            // ../dk.itu.simplifiedjml.ui/src-gen/dk/itu/simplifiedjml/ui/contentassist/antlr/internal/InternalTomato.g:825:1: ( ( rule__Method__Group_1__0 )? )
            // ../dk.itu.simplifiedjml.ui/src-gen/dk/itu/simplifiedjml/ui/contentassist/antlr/internal/InternalTomato.g:826:1: ( rule__Method__Group_1__0 )?
            {
             before(grammarAccess.getMethodAccess().getGroup_1()); 
            // ../dk.itu.simplifiedjml.ui/src-gen/dk/itu/simplifiedjml/ui/contentassist/antlr/internal/InternalTomato.g:827:1: ( rule__Method__Group_1__0 )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==19) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // ../dk.itu.simplifiedjml.ui/src-gen/dk/itu/simplifiedjml/ui/contentassist/antlr/internal/InternalTomato.g:827:2: rule__Method__Group_1__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__Method__Group_1__0_in_rule__Method__Group__1__Impl1610);
                    rule__Method__Group_1__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getMethodAccess().getGroup_1()); 

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
    // $ANTLR end "rule__Method__Group__1__Impl"


    // $ANTLR start "rule__Method__Group__2"
    // ../dk.itu.simplifiedjml.ui/src-gen/dk/itu/simplifiedjml/ui/contentassist/antlr/internal/InternalTomato.g:837:1: rule__Method__Group__2 : rule__Method__Group__2__Impl rule__Method__Group__3 ;
    public final void rule__Method__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.simplifiedjml.ui/src-gen/dk/itu/simplifiedjml/ui/contentassist/antlr/internal/InternalTomato.g:841:1: ( rule__Method__Group__2__Impl rule__Method__Group__3 )
            // ../dk.itu.simplifiedjml.ui/src-gen/dk/itu/simplifiedjml/ui/contentassist/antlr/internal/InternalTomato.g:842:2: rule__Method__Group__2__Impl rule__Method__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__Method__Group__2__Impl_in_rule__Method__Group__21641);
            rule__Method__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Method__Group__3_in_rule__Method__Group__21644);
            rule__Method__Group__3();

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
    // $ANTLR end "rule__Method__Group__2"


    // $ANTLR start "rule__Method__Group__2__Impl"
    // ../dk.itu.simplifiedjml.ui/src-gen/dk/itu/simplifiedjml/ui/contentassist/antlr/internal/InternalTomato.g:849:1: rule__Method__Group__2__Impl : ( ( rule__Method__Group_2__0 )? ) ;
    public final void rule__Method__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.simplifiedjml.ui/src-gen/dk/itu/simplifiedjml/ui/contentassist/antlr/internal/InternalTomato.g:853:1: ( ( ( rule__Method__Group_2__0 )? ) )
            // ../dk.itu.simplifiedjml.ui/src-gen/dk/itu/simplifiedjml/ui/contentassist/antlr/internal/InternalTomato.g:854:1: ( ( rule__Method__Group_2__0 )? )
            {
            // ../dk.itu.simplifiedjml.ui/src-gen/dk/itu/simplifiedjml/ui/contentassist/antlr/internal/InternalTomato.g:854:1: ( ( rule__Method__Group_2__0 )? )
            // ../dk.itu.simplifiedjml.ui/src-gen/dk/itu/simplifiedjml/ui/contentassist/antlr/internal/InternalTomato.g:855:1: ( rule__Method__Group_2__0 )?
            {
             before(grammarAccess.getMethodAccess().getGroup_2()); 
            // ../dk.itu.simplifiedjml.ui/src-gen/dk/itu/simplifiedjml/ui/contentassist/antlr/internal/InternalTomato.g:856:1: ( rule__Method__Group_2__0 )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==21) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // ../dk.itu.simplifiedjml.ui/src-gen/dk/itu/simplifiedjml/ui/contentassist/antlr/internal/InternalTomato.g:856:2: rule__Method__Group_2__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__Method__Group_2__0_in_rule__Method__Group__2__Impl1671);
                    rule__Method__Group_2__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getMethodAccess().getGroup_2()); 

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
    // $ANTLR end "rule__Method__Group__2__Impl"


    // $ANTLR start "rule__Method__Group__3"
    // ../dk.itu.simplifiedjml.ui/src-gen/dk/itu/simplifiedjml/ui/contentassist/antlr/internal/InternalTomato.g:866:1: rule__Method__Group__3 : rule__Method__Group__3__Impl rule__Method__Group__4 ;
    public final void rule__Method__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.simplifiedjml.ui/src-gen/dk/itu/simplifiedjml/ui/contentassist/antlr/internal/InternalTomato.g:870:1: ( rule__Method__Group__3__Impl rule__Method__Group__4 )
            // ../dk.itu.simplifiedjml.ui/src-gen/dk/itu/simplifiedjml/ui/contentassist/antlr/internal/InternalTomato.g:871:2: rule__Method__Group__3__Impl rule__Method__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__Method__Group__3__Impl_in_rule__Method__Group__31702);
            rule__Method__Group__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Method__Group__4_in_rule__Method__Group__31705);
            rule__Method__Group__4();

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
    // $ANTLR end "rule__Method__Group__3"


    // $ANTLR start "rule__Method__Group__3__Impl"
    // ../dk.itu.simplifiedjml.ui/src-gen/dk/itu/simplifiedjml/ui/contentassist/antlr/internal/InternalTomato.g:878:1: rule__Method__Group__3__Impl : ( '/*< AUTO GENERATED >*/' ) ;
    public final void rule__Method__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.simplifiedjml.ui/src-gen/dk/itu/simplifiedjml/ui/contentassist/antlr/internal/InternalTomato.g:882:1: ( ( '/*< AUTO GENERATED >*/' ) )
            // ../dk.itu.simplifiedjml.ui/src-gen/dk/itu/simplifiedjml/ui/contentassist/antlr/internal/InternalTomato.g:883:1: ( '/*< AUTO GENERATED >*/' )
            {
            // ../dk.itu.simplifiedjml.ui/src-gen/dk/itu/simplifiedjml/ui/contentassist/antlr/internal/InternalTomato.g:883:1: ( '/*< AUTO GENERATED >*/' )
            // ../dk.itu.simplifiedjml.ui/src-gen/dk/itu/simplifiedjml/ui/contentassist/antlr/internal/InternalTomato.g:884:1: '/*< AUTO GENERATED >*/'
            {
             before(grammarAccess.getMethodAccess().getAUTOGENERATEDKeyword_3()); 
            match(input,16,FollowSets000.FOLLOW_16_in_rule__Method__Group__3__Impl1733); 
             after(grammarAccess.getMethodAccess().getAUTOGENERATEDKeyword_3()); 

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
    // $ANTLR end "rule__Method__Group__3__Impl"


    // $ANTLR start "rule__Method__Group__4"
    // ../dk.itu.simplifiedjml.ui/src-gen/dk/itu/simplifiedjml/ui/contentassist/antlr/internal/InternalTomato.g:897:1: rule__Method__Group__4 : rule__Method__Group__4__Impl rule__Method__Group__5 ;
    public final void rule__Method__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.simplifiedjml.ui/src-gen/dk/itu/simplifiedjml/ui/contentassist/antlr/internal/InternalTomato.g:901:1: ( rule__Method__Group__4__Impl rule__Method__Group__5 )
            // ../dk.itu.simplifiedjml.ui/src-gen/dk/itu/simplifiedjml/ui/contentassist/antlr/internal/InternalTomato.g:902:2: rule__Method__Group__4__Impl rule__Method__Group__5
            {
            pushFollow(FollowSets000.FOLLOW_rule__Method__Group__4__Impl_in_rule__Method__Group__41764);
            rule__Method__Group__4__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Method__Group__5_in_rule__Method__Group__41767);
            rule__Method__Group__5();

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
    // $ANTLR end "rule__Method__Group__4"


    // $ANTLR start "rule__Method__Group__4__Impl"
    // ../dk.itu.simplifiedjml.ui/src-gen/dk/itu/simplifiedjml/ui/contentassist/antlr/internal/InternalTomato.g:909:1: rule__Method__Group__4__Impl : ( ( rule__Method__SignatureAssignment_4 ) ) ;
    public final void rule__Method__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.simplifiedjml.ui/src-gen/dk/itu/simplifiedjml/ui/contentassist/antlr/internal/InternalTomato.g:913:1: ( ( ( rule__Method__SignatureAssignment_4 ) ) )
            // ../dk.itu.simplifiedjml.ui/src-gen/dk/itu/simplifiedjml/ui/contentassist/antlr/internal/InternalTomato.g:914:1: ( ( rule__Method__SignatureAssignment_4 ) )
            {
            // ../dk.itu.simplifiedjml.ui/src-gen/dk/itu/simplifiedjml/ui/contentassist/antlr/internal/InternalTomato.g:914:1: ( ( rule__Method__SignatureAssignment_4 ) )
            // ../dk.itu.simplifiedjml.ui/src-gen/dk/itu/simplifiedjml/ui/contentassist/antlr/internal/InternalTomato.g:915:1: ( rule__Method__SignatureAssignment_4 )
            {
             before(grammarAccess.getMethodAccess().getSignatureAssignment_4()); 
            // ../dk.itu.simplifiedjml.ui/src-gen/dk/itu/simplifiedjml/ui/contentassist/antlr/internal/InternalTomato.g:916:1: ( rule__Method__SignatureAssignment_4 )
            // ../dk.itu.simplifiedjml.ui/src-gen/dk/itu/simplifiedjml/ui/contentassist/antlr/internal/InternalTomato.g:916:2: rule__Method__SignatureAssignment_4
            {
            pushFollow(FollowSets000.FOLLOW_rule__Method__SignatureAssignment_4_in_rule__Method__Group__4__Impl1794);
            rule__Method__SignatureAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getMethodAccess().getSignatureAssignment_4()); 

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
    // $ANTLR end "rule__Method__Group__4__Impl"


    // $ANTLR start "rule__Method__Group__5"
    // ../dk.itu.simplifiedjml.ui/src-gen/dk/itu/simplifiedjml/ui/contentassist/antlr/internal/InternalTomato.g:926:1: rule__Method__Group__5 : rule__Method__Group__5__Impl rule__Method__Group__6 ;
    public final void rule__Method__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.simplifiedjml.ui/src-gen/dk/itu/simplifiedjml/ui/contentassist/antlr/internal/InternalTomato.g:930:1: ( rule__Method__Group__5__Impl rule__Method__Group__6 )
            // ../dk.itu.simplifiedjml.ui/src-gen/dk/itu/simplifiedjml/ui/contentassist/antlr/internal/InternalTomato.g:931:2: rule__Method__Group__5__Impl rule__Method__Group__6
            {
            pushFollow(FollowSets000.FOLLOW_rule__Method__Group__5__Impl_in_rule__Method__Group__51824);
            rule__Method__Group__5__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Method__Group__6_in_rule__Method__Group__51827);
            rule__Method__Group__6();

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
    // $ANTLR end "rule__Method__Group__5"


    // $ANTLR start "rule__Method__Group__5__Impl"
    // ../dk.itu.simplifiedjml.ui/src-gen/dk/itu/simplifiedjml/ui/contentassist/antlr/internal/InternalTomato.g:938:1: rule__Method__Group__5__Impl : ( '{' ) ;
    public final void rule__Method__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.simplifiedjml.ui/src-gen/dk/itu/simplifiedjml/ui/contentassist/antlr/internal/InternalTomato.g:942:1: ( ( '{' ) )
            // ../dk.itu.simplifiedjml.ui/src-gen/dk/itu/simplifiedjml/ui/contentassist/antlr/internal/InternalTomato.g:943:1: ( '{' )
            {
            // ../dk.itu.simplifiedjml.ui/src-gen/dk/itu/simplifiedjml/ui/contentassist/antlr/internal/InternalTomato.g:943:1: ( '{' )
            // ../dk.itu.simplifiedjml.ui/src-gen/dk/itu/simplifiedjml/ui/contentassist/antlr/internal/InternalTomato.g:944:1: '{'
            {
             before(grammarAccess.getMethodAccess().getLeftCurlyBracketKeyword_5()); 
            match(input,13,FollowSets000.FOLLOW_13_in_rule__Method__Group__5__Impl1855); 
             after(grammarAccess.getMethodAccess().getLeftCurlyBracketKeyword_5()); 

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
    // $ANTLR end "rule__Method__Group__5__Impl"


    // $ANTLR start "rule__Method__Group__6"
    // ../dk.itu.simplifiedjml.ui/src-gen/dk/itu/simplifiedjml/ui/contentassist/antlr/internal/InternalTomato.g:957:1: rule__Method__Group__6 : rule__Method__Group__6__Impl rule__Method__Group__7 ;
    public final void rule__Method__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.simplifiedjml.ui/src-gen/dk/itu/simplifiedjml/ui/contentassist/antlr/internal/InternalTomato.g:961:1: ( rule__Method__Group__6__Impl rule__Method__Group__7 )
            // ../dk.itu.simplifiedjml.ui/src-gen/dk/itu/simplifiedjml/ui/contentassist/antlr/internal/InternalTomato.g:962:2: rule__Method__Group__6__Impl rule__Method__Group__7
            {
            pushFollow(FollowSets000.FOLLOW_rule__Method__Group__6__Impl_in_rule__Method__Group__61886);
            rule__Method__Group__6__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Method__Group__7_in_rule__Method__Group__61889);
            rule__Method__Group__7();

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
    // $ANTLR end "rule__Method__Group__6"


    // $ANTLR start "rule__Method__Group__6__Impl"
    // ../dk.itu.simplifiedjml.ui/src-gen/dk/itu/simplifiedjml/ui/contentassist/antlr/internal/InternalTomato.g:969:1: rule__Method__Group__6__Impl : ( '/* TODO: Implementation */' ) ;
    public final void rule__Method__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.simplifiedjml.ui/src-gen/dk/itu/simplifiedjml/ui/contentassist/antlr/internal/InternalTomato.g:973:1: ( ( '/* TODO: Implementation */' ) )
            // ../dk.itu.simplifiedjml.ui/src-gen/dk/itu/simplifiedjml/ui/contentassist/antlr/internal/InternalTomato.g:974:1: ( '/* TODO: Implementation */' )
            {
            // ../dk.itu.simplifiedjml.ui/src-gen/dk/itu/simplifiedjml/ui/contentassist/antlr/internal/InternalTomato.g:974:1: ( '/* TODO: Implementation */' )
            // ../dk.itu.simplifiedjml.ui/src-gen/dk/itu/simplifiedjml/ui/contentassist/antlr/internal/InternalTomato.g:975:1: '/* TODO: Implementation */'
            {
             before(grammarAccess.getMethodAccess().getTODOImplementationKeyword_6()); 
            match(input,17,FollowSets000.FOLLOW_17_in_rule__Method__Group__6__Impl1917); 
             after(grammarAccess.getMethodAccess().getTODOImplementationKeyword_6()); 

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
    // $ANTLR end "rule__Method__Group__6__Impl"


    // $ANTLR start "rule__Method__Group__7"
    // ../dk.itu.simplifiedjml.ui/src-gen/dk/itu/simplifiedjml/ui/contentassist/antlr/internal/InternalTomato.g:988:1: rule__Method__Group__7 : rule__Method__Group__7__Impl rule__Method__Group__8 ;
    public final void rule__Method__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.simplifiedjml.ui/src-gen/dk/itu/simplifiedjml/ui/contentassist/antlr/internal/InternalTomato.g:992:1: ( rule__Method__Group__7__Impl rule__Method__Group__8 )
            // ../dk.itu.simplifiedjml.ui/src-gen/dk/itu/simplifiedjml/ui/contentassist/antlr/internal/InternalTomato.g:993:2: rule__Method__Group__7__Impl rule__Method__Group__8
            {
            pushFollow(FollowSets000.FOLLOW_rule__Method__Group__7__Impl_in_rule__Method__Group__71948);
            rule__Method__Group__7__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Method__Group__8_in_rule__Method__Group__71951);
            rule__Method__Group__8();

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
    // $ANTLR end "rule__Method__Group__7"


    // $ANTLR start "rule__Method__Group__7__Impl"
    // ../dk.itu.simplifiedjml.ui/src-gen/dk/itu/simplifiedjml/ui/contentassist/antlr/internal/InternalTomato.g:1000:1: rule__Method__Group__7__Impl : ( 'throw new UnsupportedOperationException(\"Not Implemented\");' ) ;
    public final void rule__Method__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.simplifiedjml.ui/src-gen/dk/itu/simplifiedjml/ui/contentassist/antlr/internal/InternalTomato.g:1004:1: ( ( 'throw new UnsupportedOperationException(\"Not Implemented\");' ) )
            // ../dk.itu.simplifiedjml.ui/src-gen/dk/itu/simplifiedjml/ui/contentassist/antlr/internal/InternalTomato.g:1005:1: ( 'throw new UnsupportedOperationException(\"Not Implemented\");' )
            {
            // ../dk.itu.simplifiedjml.ui/src-gen/dk/itu/simplifiedjml/ui/contentassist/antlr/internal/InternalTomato.g:1005:1: ( 'throw new UnsupportedOperationException(\"Not Implemented\");' )
            // ../dk.itu.simplifiedjml.ui/src-gen/dk/itu/simplifiedjml/ui/contentassist/antlr/internal/InternalTomato.g:1006:1: 'throw new UnsupportedOperationException(\"Not Implemented\");'
            {
             before(grammarAccess.getMethodAccess().getThrowNewUnsupportedOperationExceptionNotImplementedKeyword_7()); 
            match(input,18,FollowSets000.FOLLOW_18_in_rule__Method__Group__7__Impl1979); 
             after(grammarAccess.getMethodAccess().getThrowNewUnsupportedOperationExceptionNotImplementedKeyword_7()); 

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
    // $ANTLR end "rule__Method__Group__7__Impl"


    // $ANTLR start "rule__Method__Group__8"
    // ../dk.itu.simplifiedjml.ui/src-gen/dk/itu/simplifiedjml/ui/contentassist/antlr/internal/InternalTomato.g:1019:1: rule__Method__Group__8 : rule__Method__Group__8__Impl ;
    public final void rule__Method__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.simplifiedjml.ui/src-gen/dk/itu/simplifiedjml/ui/contentassist/antlr/internal/InternalTomato.g:1023:1: ( rule__Method__Group__8__Impl )
            // ../dk.itu.simplifiedjml.ui/src-gen/dk/itu/simplifiedjml/ui/contentassist/antlr/internal/InternalTomato.g:1024:2: rule__Method__Group__8__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Method__Group__8__Impl_in_rule__Method__Group__82010);
            rule__Method__Group__8__Impl();

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
    // $ANTLR end "rule__Method__Group__8"


    // $ANTLR start "rule__Method__Group__8__Impl"
    // ../dk.itu.simplifiedjml.ui/src-gen/dk/itu/simplifiedjml/ui/contentassist/antlr/internal/InternalTomato.g:1030:1: rule__Method__Group__8__Impl : ( '}' ) ;
    public final void rule__Method__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.simplifiedjml.ui/src-gen/dk/itu/simplifiedjml/ui/contentassist/antlr/internal/InternalTomato.g:1034:1: ( ( '}' ) )
            // ../dk.itu.simplifiedjml.ui/src-gen/dk/itu/simplifiedjml/ui/contentassist/antlr/internal/InternalTomato.g:1035:1: ( '}' )
            {
            // ../dk.itu.simplifiedjml.ui/src-gen/dk/itu/simplifiedjml/ui/contentassist/antlr/internal/InternalTomato.g:1035:1: ( '}' )
            // ../dk.itu.simplifiedjml.ui/src-gen/dk/itu/simplifiedjml/ui/contentassist/antlr/internal/InternalTomato.g:1036:1: '}'
            {
             before(grammarAccess.getMethodAccess().getRightCurlyBracketKeyword_8()); 
            match(input,14,FollowSets000.FOLLOW_14_in_rule__Method__Group__8__Impl2038); 
             after(grammarAccess.getMethodAccess().getRightCurlyBracketKeyword_8()); 

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
    // $ANTLR end "rule__Method__Group__8__Impl"


    // $ANTLR start "rule__Method__Group_1__0"
    // ../dk.itu.simplifiedjml.ui/src-gen/dk/itu/simplifiedjml/ui/contentassist/antlr/internal/InternalTomato.g:1067:1: rule__Method__Group_1__0 : rule__Method__Group_1__0__Impl rule__Method__Group_1__1 ;
    public final void rule__Method__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.simplifiedjml.ui/src-gen/dk/itu/simplifiedjml/ui/contentassist/antlr/internal/InternalTomato.g:1071:1: ( rule__Method__Group_1__0__Impl rule__Method__Group_1__1 )
            // ../dk.itu.simplifiedjml.ui/src-gen/dk/itu/simplifiedjml/ui/contentassist/antlr/internal/InternalTomato.g:1072:2: rule__Method__Group_1__0__Impl rule__Method__Group_1__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Method__Group_1__0__Impl_in_rule__Method__Group_1__02087);
            rule__Method__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Method__Group_1__1_in_rule__Method__Group_1__02090);
            rule__Method__Group_1__1();

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
    // $ANTLR end "rule__Method__Group_1__0"


    // $ANTLR start "rule__Method__Group_1__0__Impl"
    // ../dk.itu.simplifiedjml.ui/src-gen/dk/itu/simplifiedjml/ui/contentassist/antlr/internal/InternalTomato.g:1079:1: rule__Method__Group_1__0__Impl : ( '//@ requires' ) ;
    public final void rule__Method__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.simplifiedjml.ui/src-gen/dk/itu/simplifiedjml/ui/contentassist/antlr/internal/InternalTomato.g:1083:1: ( ( '//@ requires' ) )
            // ../dk.itu.simplifiedjml.ui/src-gen/dk/itu/simplifiedjml/ui/contentassist/antlr/internal/InternalTomato.g:1084:1: ( '//@ requires' )
            {
            // ../dk.itu.simplifiedjml.ui/src-gen/dk/itu/simplifiedjml/ui/contentassist/antlr/internal/InternalTomato.g:1084:1: ( '//@ requires' )
            // ../dk.itu.simplifiedjml.ui/src-gen/dk/itu/simplifiedjml/ui/contentassist/antlr/internal/InternalTomato.g:1085:1: '//@ requires'
            {
             before(grammarAccess.getMethodAccess().getRequiresKeyword_1_0()); 
            match(input,19,FollowSets000.FOLLOW_19_in_rule__Method__Group_1__0__Impl2118); 
             after(grammarAccess.getMethodAccess().getRequiresKeyword_1_0()); 

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
    // $ANTLR end "rule__Method__Group_1__0__Impl"


    // $ANTLR start "rule__Method__Group_1__1"
    // ../dk.itu.simplifiedjml.ui/src-gen/dk/itu/simplifiedjml/ui/contentassist/antlr/internal/InternalTomato.g:1098:1: rule__Method__Group_1__1 : rule__Method__Group_1__1__Impl rule__Method__Group_1__2 ;
    public final void rule__Method__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.simplifiedjml.ui/src-gen/dk/itu/simplifiedjml/ui/contentassist/antlr/internal/InternalTomato.g:1102:1: ( rule__Method__Group_1__1__Impl rule__Method__Group_1__2 )
            // ../dk.itu.simplifiedjml.ui/src-gen/dk/itu/simplifiedjml/ui/contentassist/antlr/internal/InternalTomato.g:1103:2: rule__Method__Group_1__1__Impl rule__Method__Group_1__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Method__Group_1__1__Impl_in_rule__Method__Group_1__12149);
            rule__Method__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Method__Group_1__2_in_rule__Method__Group_1__12152);
            rule__Method__Group_1__2();

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
    // $ANTLR end "rule__Method__Group_1__1"


    // $ANTLR start "rule__Method__Group_1__1__Impl"
    // ../dk.itu.simplifiedjml.ui/src-gen/dk/itu/simplifiedjml/ui/contentassist/antlr/internal/InternalTomato.g:1110:1: rule__Method__Group_1__1__Impl : ( ( rule__Method__RequirementsAssignment_1_1 ) ) ;
    public final void rule__Method__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.simplifiedjml.ui/src-gen/dk/itu/simplifiedjml/ui/contentassist/antlr/internal/InternalTomato.g:1114:1: ( ( ( rule__Method__RequirementsAssignment_1_1 ) ) )
            // ../dk.itu.simplifiedjml.ui/src-gen/dk/itu/simplifiedjml/ui/contentassist/antlr/internal/InternalTomato.g:1115:1: ( ( rule__Method__RequirementsAssignment_1_1 ) )
            {
            // ../dk.itu.simplifiedjml.ui/src-gen/dk/itu/simplifiedjml/ui/contentassist/antlr/internal/InternalTomato.g:1115:1: ( ( rule__Method__RequirementsAssignment_1_1 ) )
            // ../dk.itu.simplifiedjml.ui/src-gen/dk/itu/simplifiedjml/ui/contentassist/antlr/internal/InternalTomato.g:1116:1: ( rule__Method__RequirementsAssignment_1_1 )
            {
             before(grammarAccess.getMethodAccess().getRequirementsAssignment_1_1()); 
            // ../dk.itu.simplifiedjml.ui/src-gen/dk/itu/simplifiedjml/ui/contentassist/antlr/internal/InternalTomato.g:1117:1: ( rule__Method__RequirementsAssignment_1_1 )
            // ../dk.itu.simplifiedjml.ui/src-gen/dk/itu/simplifiedjml/ui/contentassist/antlr/internal/InternalTomato.g:1117:2: rule__Method__RequirementsAssignment_1_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Method__RequirementsAssignment_1_1_in_rule__Method__Group_1__1__Impl2179);
            rule__Method__RequirementsAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getMethodAccess().getRequirementsAssignment_1_1()); 

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
    // $ANTLR end "rule__Method__Group_1__1__Impl"


    // $ANTLR start "rule__Method__Group_1__2"
    // ../dk.itu.simplifiedjml.ui/src-gen/dk/itu/simplifiedjml/ui/contentassist/antlr/internal/InternalTomato.g:1127:1: rule__Method__Group_1__2 : rule__Method__Group_1__2__Impl rule__Method__Group_1__3 ;
    public final void rule__Method__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.simplifiedjml.ui/src-gen/dk/itu/simplifiedjml/ui/contentassist/antlr/internal/InternalTomato.g:1131:1: ( rule__Method__Group_1__2__Impl rule__Method__Group_1__3 )
            // ../dk.itu.simplifiedjml.ui/src-gen/dk/itu/simplifiedjml/ui/contentassist/antlr/internal/InternalTomato.g:1132:2: rule__Method__Group_1__2__Impl rule__Method__Group_1__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__Method__Group_1__2__Impl_in_rule__Method__Group_1__22209);
            rule__Method__Group_1__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Method__Group_1__3_in_rule__Method__Group_1__22212);
            rule__Method__Group_1__3();

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
    // $ANTLR end "rule__Method__Group_1__2"


    // $ANTLR start "rule__Method__Group_1__2__Impl"
    // ../dk.itu.simplifiedjml.ui/src-gen/dk/itu/simplifiedjml/ui/contentassist/antlr/internal/InternalTomato.g:1139:1: rule__Method__Group_1__2__Impl : ( '\\n' ) ;
    public final void rule__Method__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.simplifiedjml.ui/src-gen/dk/itu/simplifiedjml/ui/contentassist/antlr/internal/InternalTomato.g:1143:1: ( ( '\\n' ) )
            // ../dk.itu.simplifiedjml.ui/src-gen/dk/itu/simplifiedjml/ui/contentassist/antlr/internal/InternalTomato.g:1144:1: ( '\\n' )
            {
            // ../dk.itu.simplifiedjml.ui/src-gen/dk/itu/simplifiedjml/ui/contentassist/antlr/internal/InternalTomato.g:1144:1: ( '\\n' )
            // ../dk.itu.simplifiedjml.ui/src-gen/dk/itu/simplifiedjml/ui/contentassist/antlr/internal/InternalTomato.g:1145:1: '\\n'
            {
             before(grammarAccess.getMethodAccess().getLineFeedLfKeyword_1_2()); 
            match(input,20,FollowSets000.FOLLOW_20_in_rule__Method__Group_1__2__Impl2240); 
             after(grammarAccess.getMethodAccess().getLineFeedLfKeyword_1_2()); 

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
    // $ANTLR end "rule__Method__Group_1__2__Impl"


    // $ANTLR start "rule__Method__Group_1__3"
    // ../dk.itu.simplifiedjml.ui/src-gen/dk/itu/simplifiedjml/ui/contentassist/antlr/internal/InternalTomato.g:1158:1: rule__Method__Group_1__3 : rule__Method__Group_1__3__Impl ;
    public final void rule__Method__Group_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.simplifiedjml.ui/src-gen/dk/itu/simplifiedjml/ui/contentassist/antlr/internal/InternalTomato.g:1162:1: ( rule__Method__Group_1__3__Impl )
            // ../dk.itu.simplifiedjml.ui/src-gen/dk/itu/simplifiedjml/ui/contentassist/antlr/internal/InternalTomato.g:1163:2: rule__Method__Group_1__3__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Method__Group_1__3__Impl_in_rule__Method__Group_1__32271);
            rule__Method__Group_1__3__Impl();

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
    // $ANTLR end "rule__Method__Group_1__3"


    // $ANTLR start "rule__Method__Group_1__3__Impl"
    // ../dk.itu.simplifiedjml.ui/src-gen/dk/itu/simplifiedjml/ui/contentassist/antlr/internal/InternalTomato.g:1169:1: rule__Method__Group_1__3__Impl : ( ( rule__Method__Group_1_3__0 )* ) ;
    public final void rule__Method__Group_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.simplifiedjml.ui/src-gen/dk/itu/simplifiedjml/ui/contentassist/antlr/internal/InternalTomato.g:1173:1: ( ( ( rule__Method__Group_1_3__0 )* ) )
            // ../dk.itu.simplifiedjml.ui/src-gen/dk/itu/simplifiedjml/ui/contentassist/antlr/internal/InternalTomato.g:1174:1: ( ( rule__Method__Group_1_3__0 )* )
            {
            // ../dk.itu.simplifiedjml.ui/src-gen/dk/itu/simplifiedjml/ui/contentassist/antlr/internal/InternalTomato.g:1174:1: ( ( rule__Method__Group_1_3__0 )* )
            // ../dk.itu.simplifiedjml.ui/src-gen/dk/itu/simplifiedjml/ui/contentassist/antlr/internal/InternalTomato.g:1175:1: ( rule__Method__Group_1_3__0 )*
            {
             before(grammarAccess.getMethodAccess().getGroup_1_3()); 
            // ../dk.itu.simplifiedjml.ui/src-gen/dk/itu/simplifiedjml/ui/contentassist/antlr/internal/InternalTomato.g:1176:1: ( rule__Method__Group_1_3__0 )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==19) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // ../dk.itu.simplifiedjml.ui/src-gen/dk/itu/simplifiedjml/ui/contentassist/antlr/internal/InternalTomato.g:1176:2: rule__Method__Group_1_3__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__Method__Group_1_3__0_in_rule__Method__Group_1__3__Impl2298);
            	    rule__Method__Group_1_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);

             after(grammarAccess.getMethodAccess().getGroup_1_3()); 

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
    // $ANTLR end "rule__Method__Group_1__3__Impl"


    // $ANTLR start "rule__Method__Group_1_3__0"
    // ../dk.itu.simplifiedjml.ui/src-gen/dk/itu/simplifiedjml/ui/contentassist/antlr/internal/InternalTomato.g:1194:1: rule__Method__Group_1_3__0 : rule__Method__Group_1_3__0__Impl rule__Method__Group_1_3__1 ;
    public final void rule__Method__Group_1_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.simplifiedjml.ui/src-gen/dk/itu/simplifiedjml/ui/contentassist/antlr/internal/InternalTomato.g:1198:1: ( rule__Method__Group_1_3__0__Impl rule__Method__Group_1_3__1 )
            // ../dk.itu.simplifiedjml.ui/src-gen/dk/itu/simplifiedjml/ui/contentassist/antlr/internal/InternalTomato.g:1199:2: rule__Method__Group_1_3__0__Impl rule__Method__Group_1_3__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Method__Group_1_3__0__Impl_in_rule__Method__Group_1_3__02337);
            rule__Method__Group_1_3__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Method__Group_1_3__1_in_rule__Method__Group_1_3__02340);
            rule__Method__Group_1_3__1();

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
    // $ANTLR end "rule__Method__Group_1_3__0"


    // $ANTLR start "rule__Method__Group_1_3__0__Impl"
    // ../dk.itu.simplifiedjml.ui/src-gen/dk/itu/simplifiedjml/ui/contentassist/antlr/internal/InternalTomato.g:1206:1: rule__Method__Group_1_3__0__Impl : ( '//@ requires' ) ;
    public final void rule__Method__Group_1_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.simplifiedjml.ui/src-gen/dk/itu/simplifiedjml/ui/contentassist/antlr/internal/InternalTomato.g:1210:1: ( ( '//@ requires' ) )
            // ../dk.itu.simplifiedjml.ui/src-gen/dk/itu/simplifiedjml/ui/contentassist/antlr/internal/InternalTomato.g:1211:1: ( '//@ requires' )
            {
            // ../dk.itu.simplifiedjml.ui/src-gen/dk/itu/simplifiedjml/ui/contentassist/antlr/internal/InternalTomato.g:1211:1: ( '//@ requires' )
            // ../dk.itu.simplifiedjml.ui/src-gen/dk/itu/simplifiedjml/ui/contentassist/antlr/internal/InternalTomato.g:1212:1: '//@ requires'
            {
             before(grammarAccess.getMethodAccess().getRequiresKeyword_1_3_0()); 
            match(input,19,FollowSets000.FOLLOW_19_in_rule__Method__Group_1_3__0__Impl2368); 
             after(grammarAccess.getMethodAccess().getRequiresKeyword_1_3_0()); 

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
    // $ANTLR end "rule__Method__Group_1_3__0__Impl"


    // $ANTLR start "rule__Method__Group_1_3__1"
    // ../dk.itu.simplifiedjml.ui/src-gen/dk/itu/simplifiedjml/ui/contentassist/antlr/internal/InternalTomato.g:1225:1: rule__Method__Group_1_3__1 : rule__Method__Group_1_3__1__Impl rule__Method__Group_1_3__2 ;
    public final void rule__Method__Group_1_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.simplifiedjml.ui/src-gen/dk/itu/simplifiedjml/ui/contentassist/antlr/internal/InternalTomato.g:1229:1: ( rule__Method__Group_1_3__1__Impl rule__Method__Group_1_3__2 )
            // ../dk.itu.simplifiedjml.ui/src-gen/dk/itu/simplifiedjml/ui/contentassist/antlr/internal/InternalTomato.g:1230:2: rule__Method__Group_1_3__1__Impl rule__Method__Group_1_3__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Method__Group_1_3__1__Impl_in_rule__Method__Group_1_3__12399);
            rule__Method__Group_1_3__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Method__Group_1_3__2_in_rule__Method__Group_1_3__12402);
            rule__Method__Group_1_3__2();

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
    // $ANTLR end "rule__Method__Group_1_3__1"


    // $ANTLR start "rule__Method__Group_1_3__1__Impl"
    // ../dk.itu.simplifiedjml.ui/src-gen/dk/itu/simplifiedjml/ui/contentassist/antlr/internal/InternalTomato.g:1237:1: rule__Method__Group_1_3__1__Impl : ( ( rule__Method__RequirementsAssignment_1_3_1 ) ) ;
    public final void rule__Method__Group_1_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.simplifiedjml.ui/src-gen/dk/itu/simplifiedjml/ui/contentassist/antlr/internal/InternalTomato.g:1241:1: ( ( ( rule__Method__RequirementsAssignment_1_3_1 ) ) )
            // ../dk.itu.simplifiedjml.ui/src-gen/dk/itu/simplifiedjml/ui/contentassist/antlr/internal/InternalTomato.g:1242:1: ( ( rule__Method__RequirementsAssignment_1_3_1 ) )
            {
            // ../dk.itu.simplifiedjml.ui/src-gen/dk/itu/simplifiedjml/ui/contentassist/antlr/internal/InternalTomato.g:1242:1: ( ( rule__Method__RequirementsAssignment_1_3_1 ) )
            // ../dk.itu.simplifiedjml.ui/src-gen/dk/itu/simplifiedjml/ui/contentassist/antlr/internal/InternalTomato.g:1243:1: ( rule__Method__RequirementsAssignment_1_3_1 )
            {
             before(grammarAccess.getMethodAccess().getRequirementsAssignment_1_3_1()); 
            // ../dk.itu.simplifiedjml.ui/src-gen/dk/itu/simplifiedjml/ui/contentassist/antlr/internal/InternalTomato.g:1244:1: ( rule__Method__RequirementsAssignment_1_3_1 )
            // ../dk.itu.simplifiedjml.ui/src-gen/dk/itu/simplifiedjml/ui/contentassist/antlr/internal/InternalTomato.g:1244:2: rule__Method__RequirementsAssignment_1_3_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Method__RequirementsAssignment_1_3_1_in_rule__Method__Group_1_3__1__Impl2429);
            rule__Method__RequirementsAssignment_1_3_1();

            state._fsp--;


            }

             after(grammarAccess.getMethodAccess().getRequirementsAssignment_1_3_1()); 

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
    // $ANTLR end "rule__Method__Group_1_3__1__Impl"


    // $ANTLR start "rule__Method__Group_1_3__2"
    // ../dk.itu.simplifiedjml.ui/src-gen/dk/itu/simplifiedjml/ui/contentassist/antlr/internal/InternalTomato.g:1254:1: rule__Method__Group_1_3__2 : rule__Method__Group_1_3__2__Impl ;
    public final void rule__Method__Group_1_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.simplifiedjml.ui/src-gen/dk/itu/simplifiedjml/ui/contentassist/antlr/internal/InternalTomato.g:1258:1: ( rule__Method__Group_1_3__2__Impl )
            // ../dk.itu.simplifiedjml.ui/src-gen/dk/itu/simplifiedjml/ui/contentassist/antlr/internal/InternalTomato.g:1259:2: rule__Method__Group_1_3__2__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Method__Group_1_3__2__Impl_in_rule__Method__Group_1_3__22459);
            rule__Method__Group_1_3__2__Impl();

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
    // $ANTLR end "rule__Method__Group_1_3__2"


    // $ANTLR start "rule__Method__Group_1_3__2__Impl"
    // ../dk.itu.simplifiedjml.ui/src-gen/dk/itu/simplifiedjml/ui/contentassist/antlr/internal/InternalTomato.g:1265:1: rule__Method__Group_1_3__2__Impl : ( '\\n' ) ;
    public final void rule__Method__Group_1_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.simplifiedjml.ui/src-gen/dk/itu/simplifiedjml/ui/contentassist/antlr/internal/InternalTomato.g:1269:1: ( ( '\\n' ) )
            // ../dk.itu.simplifiedjml.ui/src-gen/dk/itu/simplifiedjml/ui/contentassist/antlr/internal/InternalTomato.g:1270:1: ( '\\n' )
            {
            // ../dk.itu.simplifiedjml.ui/src-gen/dk/itu/simplifiedjml/ui/contentassist/antlr/internal/InternalTomato.g:1270:1: ( '\\n' )
            // ../dk.itu.simplifiedjml.ui/src-gen/dk/itu/simplifiedjml/ui/contentassist/antlr/internal/InternalTomato.g:1271:1: '\\n'
            {
             before(grammarAccess.getMethodAccess().getLineFeedLfKeyword_1_3_2()); 
            match(input,20,FollowSets000.FOLLOW_20_in_rule__Method__Group_1_3__2__Impl2487); 
             after(grammarAccess.getMethodAccess().getLineFeedLfKeyword_1_3_2()); 

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
    // $ANTLR end "rule__Method__Group_1_3__2__Impl"


    // $ANTLR start "rule__Method__Group_2__0"
    // ../dk.itu.simplifiedjml.ui/src-gen/dk/itu/simplifiedjml/ui/contentassist/antlr/internal/InternalTomato.g:1290:1: rule__Method__Group_2__0 : rule__Method__Group_2__0__Impl rule__Method__Group_2__1 ;
    public final void rule__Method__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.simplifiedjml.ui/src-gen/dk/itu/simplifiedjml/ui/contentassist/antlr/internal/InternalTomato.g:1294:1: ( rule__Method__Group_2__0__Impl rule__Method__Group_2__1 )
            // ../dk.itu.simplifiedjml.ui/src-gen/dk/itu/simplifiedjml/ui/contentassist/antlr/internal/InternalTomato.g:1295:2: rule__Method__Group_2__0__Impl rule__Method__Group_2__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Method__Group_2__0__Impl_in_rule__Method__Group_2__02524);
            rule__Method__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Method__Group_2__1_in_rule__Method__Group_2__02527);
            rule__Method__Group_2__1();

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
    // $ANTLR end "rule__Method__Group_2__0"


    // $ANTLR start "rule__Method__Group_2__0__Impl"
    // ../dk.itu.simplifiedjml.ui/src-gen/dk/itu/simplifiedjml/ui/contentassist/antlr/internal/InternalTomato.g:1302:1: rule__Method__Group_2__0__Impl : ( '//@ ensures' ) ;
    public final void rule__Method__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.simplifiedjml.ui/src-gen/dk/itu/simplifiedjml/ui/contentassist/antlr/internal/InternalTomato.g:1306:1: ( ( '//@ ensures' ) )
            // ../dk.itu.simplifiedjml.ui/src-gen/dk/itu/simplifiedjml/ui/contentassist/antlr/internal/InternalTomato.g:1307:1: ( '//@ ensures' )
            {
            // ../dk.itu.simplifiedjml.ui/src-gen/dk/itu/simplifiedjml/ui/contentassist/antlr/internal/InternalTomato.g:1307:1: ( '//@ ensures' )
            // ../dk.itu.simplifiedjml.ui/src-gen/dk/itu/simplifiedjml/ui/contentassist/antlr/internal/InternalTomato.g:1308:1: '//@ ensures'
            {
             before(grammarAccess.getMethodAccess().getEnsuresKeyword_2_0()); 
            match(input,21,FollowSets000.FOLLOW_21_in_rule__Method__Group_2__0__Impl2555); 
             after(grammarAccess.getMethodAccess().getEnsuresKeyword_2_0()); 

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
    // $ANTLR end "rule__Method__Group_2__0__Impl"


    // $ANTLR start "rule__Method__Group_2__1"
    // ../dk.itu.simplifiedjml.ui/src-gen/dk/itu/simplifiedjml/ui/contentassist/antlr/internal/InternalTomato.g:1321:1: rule__Method__Group_2__1 : rule__Method__Group_2__1__Impl rule__Method__Group_2__2 ;
    public final void rule__Method__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.simplifiedjml.ui/src-gen/dk/itu/simplifiedjml/ui/contentassist/antlr/internal/InternalTomato.g:1325:1: ( rule__Method__Group_2__1__Impl rule__Method__Group_2__2 )
            // ../dk.itu.simplifiedjml.ui/src-gen/dk/itu/simplifiedjml/ui/contentassist/antlr/internal/InternalTomato.g:1326:2: rule__Method__Group_2__1__Impl rule__Method__Group_2__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Method__Group_2__1__Impl_in_rule__Method__Group_2__12586);
            rule__Method__Group_2__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Method__Group_2__2_in_rule__Method__Group_2__12589);
            rule__Method__Group_2__2();

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
    // $ANTLR end "rule__Method__Group_2__1"


    // $ANTLR start "rule__Method__Group_2__1__Impl"
    // ../dk.itu.simplifiedjml.ui/src-gen/dk/itu/simplifiedjml/ui/contentassist/antlr/internal/InternalTomato.g:1333:1: rule__Method__Group_2__1__Impl : ( ( rule__Method__EnsuresAssignment_2_1 ) ) ;
    public final void rule__Method__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.simplifiedjml.ui/src-gen/dk/itu/simplifiedjml/ui/contentassist/antlr/internal/InternalTomato.g:1337:1: ( ( ( rule__Method__EnsuresAssignment_2_1 ) ) )
            // ../dk.itu.simplifiedjml.ui/src-gen/dk/itu/simplifiedjml/ui/contentassist/antlr/internal/InternalTomato.g:1338:1: ( ( rule__Method__EnsuresAssignment_2_1 ) )
            {
            // ../dk.itu.simplifiedjml.ui/src-gen/dk/itu/simplifiedjml/ui/contentassist/antlr/internal/InternalTomato.g:1338:1: ( ( rule__Method__EnsuresAssignment_2_1 ) )
            // ../dk.itu.simplifiedjml.ui/src-gen/dk/itu/simplifiedjml/ui/contentassist/antlr/internal/InternalTomato.g:1339:1: ( rule__Method__EnsuresAssignment_2_1 )
            {
             before(grammarAccess.getMethodAccess().getEnsuresAssignment_2_1()); 
            // ../dk.itu.simplifiedjml.ui/src-gen/dk/itu/simplifiedjml/ui/contentassist/antlr/internal/InternalTomato.g:1340:1: ( rule__Method__EnsuresAssignment_2_1 )
            // ../dk.itu.simplifiedjml.ui/src-gen/dk/itu/simplifiedjml/ui/contentassist/antlr/internal/InternalTomato.g:1340:2: rule__Method__EnsuresAssignment_2_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Method__EnsuresAssignment_2_1_in_rule__Method__Group_2__1__Impl2616);
            rule__Method__EnsuresAssignment_2_1();

            state._fsp--;


            }

             after(grammarAccess.getMethodAccess().getEnsuresAssignment_2_1()); 

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
    // $ANTLR end "rule__Method__Group_2__1__Impl"


    // $ANTLR start "rule__Method__Group_2__2"
    // ../dk.itu.simplifiedjml.ui/src-gen/dk/itu/simplifiedjml/ui/contentassist/antlr/internal/InternalTomato.g:1350:1: rule__Method__Group_2__2 : rule__Method__Group_2__2__Impl rule__Method__Group_2__3 ;
    public final void rule__Method__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.simplifiedjml.ui/src-gen/dk/itu/simplifiedjml/ui/contentassist/antlr/internal/InternalTomato.g:1354:1: ( rule__Method__Group_2__2__Impl rule__Method__Group_2__3 )
            // ../dk.itu.simplifiedjml.ui/src-gen/dk/itu/simplifiedjml/ui/contentassist/antlr/internal/InternalTomato.g:1355:2: rule__Method__Group_2__2__Impl rule__Method__Group_2__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__Method__Group_2__2__Impl_in_rule__Method__Group_2__22646);
            rule__Method__Group_2__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Method__Group_2__3_in_rule__Method__Group_2__22649);
            rule__Method__Group_2__3();

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
    // $ANTLR end "rule__Method__Group_2__2"


    // $ANTLR start "rule__Method__Group_2__2__Impl"
    // ../dk.itu.simplifiedjml.ui/src-gen/dk/itu/simplifiedjml/ui/contentassist/antlr/internal/InternalTomato.g:1362:1: rule__Method__Group_2__2__Impl : ( '\\n' ) ;
    public final void rule__Method__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.simplifiedjml.ui/src-gen/dk/itu/simplifiedjml/ui/contentassist/antlr/internal/InternalTomato.g:1366:1: ( ( '\\n' ) )
            // ../dk.itu.simplifiedjml.ui/src-gen/dk/itu/simplifiedjml/ui/contentassist/antlr/internal/InternalTomato.g:1367:1: ( '\\n' )
            {
            // ../dk.itu.simplifiedjml.ui/src-gen/dk/itu/simplifiedjml/ui/contentassist/antlr/internal/InternalTomato.g:1367:1: ( '\\n' )
            // ../dk.itu.simplifiedjml.ui/src-gen/dk/itu/simplifiedjml/ui/contentassist/antlr/internal/InternalTomato.g:1368:1: '\\n'
            {
             before(grammarAccess.getMethodAccess().getLineFeedLfKeyword_2_2()); 
            match(input,20,FollowSets000.FOLLOW_20_in_rule__Method__Group_2__2__Impl2677); 
             after(grammarAccess.getMethodAccess().getLineFeedLfKeyword_2_2()); 

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
    // $ANTLR end "rule__Method__Group_2__2__Impl"


    // $ANTLR start "rule__Method__Group_2__3"
    // ../dk.itu.simplifiedjml.ui/src-gen/dk/itu/simplifiedjml/ui/contentassist/antlr/internal/InternalTomato.g:1381:1: rule__Method__Group_2__3 : rule__Method__Group_2__3__Impl ;
    public final void rule__Method__Group_2__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.simplifiedjml.ui/src-gen/dk/itu/simplifiedjml/ui/contentassist/antlr/internal/InternalTomato.g:1385:1: ( rule__Method__Group_2__3__Impl )
            // ../dk.itu.simplifiedjml.ui/src-gen/dk/itu/simplifiedjml/ui/contentassist/antlr/internal/InternalTomato.g:1386:2: rule__Method__Group_2__3__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Method__Group_2__3__Impl_in_rule__Method__Group_2__32708);
            rule__Method__Group_2__3__Impl();

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
    // $ANTLR end "rule__Method__Group_2__3"


    // $ANTLR start "rule__Method__Group_2__3__Impl"
    // ../dk.itu.simplifiedjml.ui/src-gen/dk/itu/simplifiedjml/ui/contentassist/antlr/internal/InternalTomato.g:1392:1: rule__Method__Group_2__3__Impl : ( ( rule__Method__Group_2_3__0 )* ) ;
    public final void rule__Method__Group_2__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.simplifiedjml.ui/src-gen/dk/itu/simplifiedjml/ui/contentassist/antlr/internal/InternalTomato.g:1396:1: ( ( ( rule__Method__Group_2_3__0 )* ) )
            // ../dk.itu.simplifiedjml.ui/src-gen/dk/itu/simplifiedjml/ui/contentassist/antlr/internal/InternalTomato.g:1397:1: ( ( rule__Method__Group_2_3__0 )* )
            {
            // ../dk.itu.simplifiedjml.ui/src-gen/dk/itu/simplifiedjml/ui/contentassist/antlr/internal/InternalTomato.g:1397:1: ( ( rule__Method__Group_2_3__0 )* )
            // ../dk.itu.simplifiedjml.ui/src-gen/dk/itu/simplifiedjml/ui/contentassist/antlr/internal/InternalTomato.g:1398:1: ( rule__Method__Group_2_3__0 )*
            {
             before(grammarAccess.getMethodAccess().getGroup_2_3()); 
            // ../dk.itu.simplifiedjml.ui/src-gen/dk/itu/simplifiedjml/ui/contentassist/antlr/internal/InternalTomato.g:1399:1: ( rule__Method__Group_2_3__0 )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==21) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // ../dk.itu.simplifiedjml.ui/src-gen/dk/itu/simplifiedjml/ui/contentassist/antlr/internal/InternalTomato.g:1399:2: rule__Method__Group_2_3__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__Method__Group_2_3__0_in_rule__Method__Group_2__3__Impl2735);
            	    rule__Method__Group_2_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);

             after(grammarAccess.getMethodAccess().getGroup_2_3()); 

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
    // $ANTLR end "rule__Method__Group_2__3__Impl"


    // $ANTLR start "rule__Method__Group_2_3__0"
    // ../dk.itu.simplifiedjml.ui/src-gen/dk/itu/simplifiedjml/ui/contentassist/antlr/internal/InternalTomato.g:1417:1: rule__Method__Group_2_3__0 : rule__Method__Group_2_3__0__Impl rule__Method__Group_2_3__1 ;
    public final void rule__Method__Group_2_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.simplifiedjml.ui/src-gen/dk/itu/simplifiedjml/ui/contentassist/antlr/internal/InternalTomato.g:1421:1: ( rule__Method__Group_2_3__0__Impl rule__Method__Group_2_3__1 )
            // ../dk.itu.simplifiedjml.ui/src-gen/dk/itu/simplifiedjml/ui/contentassist/antlr/internal/InternalTomato.g:1422:2: rule__Method__Group_2_3__0__Impl rule__Method__Group_2_3__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Method__Group_2_3__0__Impl_in_rule__Method__Group_2_3__02774);
            rule__Method__Group_2_3__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Method__Group_2_3__1_in_rule__Method__Group_2_3__02777);
            rule__Method__Group_2_3__1();

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
    // $ANTLR end "rule__Method__Group_2_3__0"


    // $ANTLR start "rule__Method__Group_2_3__0__Impl"
    // ../dk.itu.simplifiedjml.ui/src-gen/dk/itu/simplifiedjml/ui/contentassist/antlr/internal/InternalTomato.g:1429:1: rule__Method__Group_2_3__0__Impl : ( '//@ ensures' ) ;
    public final void rule__Method__Group_2_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.simplifiedjml.ui/src-gen/dk/itu/simplifiedjml/ui/contentassist/antlr/internal/InternalTomato.g:1433:1: ( ( '//@ ensures' ) )
            // ../dk.itu.simplifiedjml.ui/src-gen/dk/itu/simplifiedjml/ui/contentassist/antlr/internal/InternalTomato.g:1434:1: ( '//@ ensures' )
            {
            // ../dk.itu.simplifiedjml.ui/src-gen/dk/itu/simplifiedjml/ui/contentassist/antlr/internal/InternalTomato.g:1434:1: ( '//@ ensures' )
            // ../dk.itu.simplifiedjml.ui/src-gen/dk/itu/simplifiedjml/ui/contentassist/antlr/internal/InternalTomato.g:1435:1: '//@ ensures'
            {
             before(grammarAccess.getMethodAccess().getEnsuresKeyword_2_3_0()); 
            match(input,21,FollowSets000.FOLLOW_21_in_rule__Method__Group_2_3__0__Impl2805); 
             after(grammarAccess.getMethodAccess().getEnsuresKeyword_2_3_0()); 

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
    // $ANTLR end "rule__Method__Group_2_3__0__Impl"


    // $ANTLR start "rule__Method__Group_2_3__1"
    // ../dk.itu.simplifiedjml.ui/src-gen/dk/itu/simplifiedjml/ui/contentassist/antlr/internal/InternalTomato.g:1448:1: rule__Method__Group_2_3__1 : rule__Method__Group_2_3__1__Impl rule__Method__Group_2_3__2 ;
    public final void rule__Method__Group_2_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.simplifiedjml.ui/src-gen/dk/itu/simplifiedjml/ui/contentassist/antlr/internal/InternalTomato.g:1452:1: ( rule__Method__Group_2_3__1__Impl rule__Method__Group_2_3__2 )
            // ../dk.itu.simplifiedjml.ui/src-gen/dk/itu/simplifiedjml/ui/contentassist/antlr/internal/InternalTomato.g:1453:2: rule__Method__Group_2_3__1__Impl rule__Method__Group_2_3__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Method__Group_2_3__1__Impl_in_rule__Method__Group_2_3__12836);
            rule__Method__Group_2_3__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Method__Group_2_3__2_in_rule__Method__Group_2_3__12839);
            rule__Method__Group_2_3__2();

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
    // $ANTLR end "rule__Method__Group_2_3__1"


    // $ANTLR start "rule__Method__Group_2_3__1__Impl"
    // ../dk.itu.simplifiedjml.ui/src-gen/dk/itu/simplifiedjml/ui/contentassist/antlr/internal/InternalTomato.g:1460:1: rule__Method__Group_2_3__1__Impl : ( ( rule__Method__EnsuresAssignment_2_3_1 ) ) ;
    public final void rule__Method__Group_2_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.simplifiedjml.ui/src-gen/dk/itu/simplifiedjml/ui/contentassist/antlr/internal/InternalTomato.g:1464:1: ( ( ( rule__Method__EnsuresAssignment_2_3_1 ) ) )
            // ../dk.itu.simplifiedjml.ui/src-gen/dk/itu/simplifiedjml/ui/contentassist/antlr/internal/InternalTomato.g:1465:1: ( ( rule__Method__EnsuresAssignment_2_3_1 ) )
            {
            // ../dk.itu.simplifiedjml.ui/src-gen/dk/itu/simplifiedjml/ui/contentassist/antlr/internal/InternalTomato.g:1465:1: ( ( rule__Method__EnsuresAssignment_2_3_1 ) )
            // ../dk.itu.simplifiedjml.ui/src-gen/dk/itu/simplifiedjml/ui/contentassist/antlr/internal/InternalTomato.g:1466:1: ( rule__Method__EnsuresAssignment_2_3_1 )
            {
             before(grammarAccess.getMethodAccess().getEnsuresAssignment_2_3_1()); 
            // ../dk.itu.simplifiedjml.ui/src-gen/dk/itu/simplifiedjml/ui/contentassist/antlr/internal/InternalTomato.g:1467:1: ( rule__Method__EnsuresAssignment_2_3_1 )
            // ../dk.itu.simplifiedjml.ui/src-gen/dk/itu/simplifiedjml/ui/contentassist/antlr/internal/InternalTomato.g:1467:2: rule__Method__EnsuresAssignment_2_3_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Method__EnsuresAssignment_2_3_1_in_rule__Method__Group_2_3__1__Impl2866);
            rule__Method__EnsuresAssignment_2_3_1();

            state._fsp--;


            }

             after(grammarAccess.getMethodAccess().getEnsuresAssignment_2_3_1()); 

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
    // $ANTLR end "rule__Method__Group_2_3__1__Impl"


    // $ANTLR start "rule__Method__Group_2_3__2"
    // ../dk.itu.simplifiedjml.ui/src-gen/dk/itu/simplifiedjml/ui/contentassist/antlr/internal/InternalTomato.g:1477:1: rule__Method__Group_2_3__2 : rule__Method__Group_2_3__2__Impl ;
    public final void rule__Method__Group_2_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.simplifiedjml.ui/src-gen/dk/itu/simplifiedjml/ui/contentassist/antlr/internal/InternalTomato.g:1481:1: ( rule__Method__Group_2_3__2__Impl )
            // ../dk.itu.simplifiedjml.ui/src-gen/dk/itu/simplifiedjml/ui/contentassist/antlr/internal/InternalTomato.g:1482:2: rule__Method__Group_2_3__2__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Method__Group_2_3__2__Impl_in_rule__Method__Group_2_3__22896);
            rule__Method__Group_2_3__2__Impl();

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
    // $ANTLR end "rule__Method__Group_2_3__2"


    // $ANTLR start "rule__Method__Group_2_3__2__Impl"
    // ../dk.itu.simplifiedjml.ui/src-gen/dk/itu/simplifiedjml/ui/contentassist/antlr/internal/InternalTomato.g:1488:1: rule__Method__Group_2_3__2__Impl : ( '\\n' ) ;
    public final void rule__Method__Group_2_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.simplifiedjml.ui/src-gen/dk/itu/simplifiedjml/ui/contentassist/antlr/internal/InternalTomato.g:1492:1: ( ( '\\n' ) )
            // ../dk.itu.simplifiedjml.ui/src-gen/dk/itu/simplifiedjml/ui/contentassist/antlr/internal/InternalTomato.g:1493:1: ( '\\n' )
            {
            // ../dk.itu.simplifiedjml.ui/src-gen/dk/itu/simplifiedjml/ui/contentassist/antlr/internal/InternalTomato.g:1493:1: ( '\\n' )
            // ../dk.itu.simplifiedjml.ui/src-gen/dk/itu/simplifiedjml/ui/contentassist/antlr/internal/InternalTomato.g:1494:1: '\\n'
            {
             before(grammarAccess.getMethodAccess().getLineFeedLfKeyword_2_3_2()); 
            match(input,20,FollowSets000.FOLLOW_20_in_rule__Method__Group_2_3__2__Impl2924); 
             after(grammarAccess.getMethodAccess().getLineFeedLfKeyword_2_3_2()); 

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
    // $ANTLR end "rule__Method__Group_2_3__2__Impl"


    // $ANTLR start "rule__SimplifiedJMLModel__StructuresAssignment_0"
    // ../dk.itu.simplifiedjml.ui/src-gen/dk/itu/simplifiedjml/ui/contentassist/antlr/internal/InternalTomato.g:1514:1: rule__SimplifiedJMLModel__StructuresAssignment_0 : ( ruleStructure ) ;
    public final void rule__SimplifiedJMLModel__StructuresAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.simplifiedjml.ui/src-gen/dk/itu/simplifiedjml/ui/contentassist/antlr/internal/InternalTomato.g:1518:1: ( ( ruleStructure ) )
            // ../dk.itu.simplifiedjml.ui/src-gen/dk/itu/simplifiedjml/ui/contentassist/antlr/internal/InternalTomato.g:1519:1: ( ruleStructure )
            {
            // ../dk.itu.simplifiedjml.ui/src-gen/dk/itu/simplifiedjml/ui/contentassist/antlr/internal/InternalTomato.g:1519:1: ( ruleStructure )
            // ../dk.itu.simplifiedjml.ui/src-gen/dk/itu/simplifiedjml/ui/contentassist/antlr/internal/InternalTomato.g:1520:1: ruleStructure
            {
             before(grammarAccess.getSimplifiedJMLModelAccess().getStructuresStructureParserRuleCall_0_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleStructure_in_rule__SimplifiedJMLModel__StructuresAssignment_02966);
            ruleStructure();

            state._fsp--;

             after(grammarAccess.getSimplifiedJMLModelAccess().getStructuresStructureParserRuleCall_0_0()); 

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
    // $ANTLR end "rule__SimplifiedJMLModel__StructuresAssignment_0"


    // $ANTLR start "rule__SimplifiedJMLModel__StructuresAssignment_1"
    // ../dk.itu.simplifiedjml.ui/src-gen/dk/itu/simplifiedjml/ui/contentassist/antlr/internal/InternalTomato.g:1529:1: rule__SimplifiedJMLModel__StructuresAssignment_1 : ( ruleStructure ) ;
    public final void rule__SimplifiedJMLModel__StructuresAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.simplifiedjml.ui/src-gen/dk/itu/simplifiedjml/ui/contentassist/antlr/internal/InternalTomato.g:1533:1: ( ( ruleStructure ) )
            // ../dk.itu.simplifiedjml.ui/src-gen/dk/itu/simplifiedjml/ui/contentassist/antlr/internal/InternalTomato.g:1534:1: ( ruleStructure )
            {
            // ../dk.itu.simplifiedjml.ui/src-gen/dk/itu/simplifiedjml/ui/contentassist/antlr/internal/InternalTomato.g:1534:1: ( ruleStructure )
            // ../dk.itu.simplifiedjml.ui/src-gen/dk/itu/simplifiedjml/ui/contentassist/antlr/internal/InternalTomato.g:1535:1: ruleStructure
            {
             before(grammarAccess.getSimplifiedJMLModelAccess().getStructuresStructureParserRuleCall_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleStructure_in_rule__SimplifiedJMLModel__StructuresAssignment_12997);
            ruleStructure();

            state._fsp--;

             after(grammarAccess.getSimplifiedJMLModelAccess().getStructuresStructureParserRuleCall_1_0()); 

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
    // $ANTLR end "rule__SimplifiedJMLModel__StructuresAssignment_1"


    // $ANTLR start "rule__Structure__NameAssignment_2"
    // ../dk.itu.simplifiedjml.ui/src-gen/dk/itu/simplifiedjml/ui/contentassist/antlr/internal/InternalTomato.g:1544:1: rule__Structure__NameAssignment_2 : ( ruleEString ) ;
    public final void rule__Structure__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.simplifiedjml.ui/src-gen/dk/itu/simplifiedjml/ui/contentassist/antlr/internal/InternalTomato.g:1548:1: ( ( ruleEString ) )
            // ../dk.itu.simplifiedjml.ui/src-gen/dk/itu/simplifiedjml/ui/contentassist/antlr/internal/InternalTomato.g:1549:1: ( ruleEString )
            {
            // ../dk.itu.simplifiedjml.ui/src-gen/dk/itu/simplifiedjml/ui/contentassist/antlr/internal/InternalTomato.g:1549:1: ( ruleEString )
            // ../dk.itu.simplifiedjml.ui/src-gen/dk/itu/simplifiedjml/ui/contentassist/antlr/internal/InternalTomato.g:1550:1: ruleEString
            {
             before(grammarAccess.getStructureAccess().getNameEStringParserRuleCall_2_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__Structure__NameAssignment_23028);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getStructureAccess().getNameEStringParserRuleCall_2_0()); 

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
    // $ANTLR end "rule__Structure__NameAssignment_2"


    // $ANTLR start "rule__Structure__InvariantsAssignment_4_1"
    // ../dk.itu.simplifiedjml.ui/src-gen/dk/itu/simplifiedjml/ui/contentassist/antlr/internal/InternalTomato.g:1559:1: rule__Structure__InvariantsAssignment_4_1 : ( ruleAnyOther ) ;
    public final void rule__Structure__InvariantsAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.simplifiedjml.ui/src-gen/dk/itu/simplifiedjml/ui/contentassist/antlr/internal/InternalTomato.g:1563:1: ( ( ruleAnyOther ) )
            // ../dk.itu.simplifiedjml.ui/src-gen/dk/itu/simplifiedjml/ui/contentassist/antlr/internal/InternalTomato.g:1564:1: ( ruleAnyOther )
            {
            // ../dk.itu.simplifiedjml.ui/src-gen/dk/itu/simplifiedjml/ui/contentassist/antlr/internal/InternalTomato.g:1564:1: ( ruleAnyOther )
            // ../dk.itu.simplifiedjml.ui/src-gen/dk/itu/simplifiedjml/ui/contentassist/antlr/internal/InternalTomato.g:1565:1: ruleAnyOther
            {
             before(grammarAccess.getStructureAccess().getInvariantsAnyOtherParserRuleCall_4_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleAnyOther_in_rule__Structure__InvariantsAssignment_4_13059);
            ruleAnyOther();

            state._fsp--;

             after(grammarAccess.getStructureAccess().getInvariantsAnyOtherParserRuleCall_4_1_0()); 

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
    // $ANTLR end "rule__Structure__InvariantsAssignment_4_1"


    // $ANTLR start "rule__Structure__InvariantsAssignment_4_2_1"
    // ../dk.itu.simplifiedjml.ui/src-gen/dk/itu/simplifiedjml/ui/contentassist/antlr/internal/InternalTomato.g:1574:1: rule__Structure__InvariantsAssignment_4_2_1 : ( ruleAnyOther ) ;
    public final void rule__Structure__InvariantsAssignment_4_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.simplifiedjml.ui/src-gen/dk/itu/simplifiedjml/ui/contentassist/antlr/internal/InternalTomato.g:1578:1: ( ( ruleAnyOther ) )
            // ../dk.itu.simplifiedjml.ui/src-gen/dk/itu/simplifiedjml/ui/contentassist/antlr/internal/InternalTomato.g:1579:1: ( ruleAnyOther )
            {
            // ../dk.itu.simplifiedjml.ui/src-gen/dk/itu/simplifiedjml/ui/contentassist/antlr/internal/InternalTomato.g:1579:1: ( ruleAnyOther )
            // ../dk.itu.simplifiedjml.ui/src-gen/dk/itu/simplifiedjml/ui/contentassist/antlr/internal/InternalTomato.g:1580:1: ruleAnyOther
            {
             before(grammarAccess.getStructureAccess().getInvariantsAnyOtherParserRuleCall_4_2_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleAnyOther_in_rule__Structure__InvariantsAssignment_4_2_13090);
            ruleAnyOther();

            state._fsp--;

             after(grammarAccess.getStructureAccess().getInvariantsAnyOtherParserRuleCall_4_2_1_0()); 

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
    // $ANTLR end "rule__Structure__InvariantsAssignment_4_2_1"


    // $ANTLR start "rule__Structure__MethodsAssignment_5_0"
    // ../dk.itu.simplifiedjml.ui/src-gen/dk/itu/simplifiedjml/ui/contentassist/antlr/internal/InternalTomato.g:1589:1: rule__Structure__MethodsAssignment_5_0 : ( ruleMethod ) ;
    public final void rule__Structure__MethodsAssignment_5_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.simplifiedjml.ui/src-gen/dk/itu/simplifiedjml/ui/contentassist/antlr/internal/InternalTomato.g:1593:1: ( ( ruleMethod ) )
            // ../dk.itu.simplifiedjml.ui/src-gen/dk/itu/simplifiedjml/ui/contentassist/antlr/internal/InternalTomato.g:1594:1: ( ruleMethod )
            {
            // ../dk.itu.simplifiedjml.ui/src-gen/dk/itu/simplifiedjml/ui/contentassist/antlr/internal/InternalTomato.g:1594:1: ( ruleMethod )
            // ../dk.itu.simplifiedjml.ui/src-gen/dk/itu/simplifiedjml/ui/contentassist/antlr/internal/InternalTomato.g:1595:1: ruleMethod
            {
             before(grammarAccess.getStructureAccess().getMethodsMethodParserRuleCall_5_0_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleMethod_in_rule__Structure__MethodsAssignment_5_03121);
            ruleMethod();

            state._fsp--;

             after(grammarAccess.getStructureAccess().getMethodsMethodParserRuleCall_5_0_0()); 

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
    // $ANTLR end "rule__Structure__MethodsAssignment_5_0"


    // $ANTLR start "rule__Structure__MethodsAssignment_5_1"
    // ../dk.itu.simplifiedjml.ui/src-gen/dk/itu/simplifiedjml/ui/contentassist/antlr/internal/InternalTomato.g:1604:1: rule__Structure__MethodsAssignment_5_1 : ( ruleMethod ) ;
    public final void rule__Structure__MethodsAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.simplifiedjml.ui/src-gen/dk/itu/simplifiedjml/ui/contentassist/antlr/internal/InternalTomato.g:1608:1: ( ( ruleMethod ) )
            // ../dk.itu.simplifiedjml.ui/src-gen/dk/itu/simplifiedjml/ui/contentassist/antlr/internal/InternalTomato.g:1609:1: ( ruleMethod )
            {
            // ../dk.itu.simplifiedjml.ui/src-gen/dk/itu/simplifiedjml/ui/contentassist/antlr/internal/InternalTomato.g:1609:1: ( ruleMethod )
            // ../dk.itu.simplifiedjml.ui/src-gen/dk/itu/simplifiedjml/ui/contentassist/antlr/internal/InternalTomato.g:1610:1: ruleMethod
            {
             before(grammarAccess.getStructureAccess().getMethodsMethodParserRuleCall_5_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleMethod_in_rule__Structure__MethodsAssignment_5_13152);
            ruleMethod();

            state._fsp--;

             after(grammarAccess.getStructureAccess().getMethodsMethodParserRuleCall_5_1_0()); 

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
    // $ANTLR end "rule__Structure__MethodsAssignment_5_1"


    // $ANTLR start "rule__Method__RequirementsAssignment_1_1"
    // ../dk.itu.simplifiedjml.ui/src-gen/dk/itu/simplifiedjml/ui/contentassist/antlr/internal/InternalTomato.g:1619:1: rule__Method__RequirementsAssignment_1_1 : ( ruleAnyOther ) ;
    public final void rule__Method__RequirementsAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.simplifiedjml.ui/src-gen/dk/itu/simplifiedjml/ui/contentassist/antlr/internal/InternalTomato.g:1623:1: ( ( ruleAnyOther ) )
            // ../dk.itu.simplifiedjml.ui/src-gen/dk/itu/simplifiedjml/ui/contentassist/antlr/internal/InternalTomato.g:1624:1: ( ruleAnyOther )
            {
            // ../dk.itu.simplifiedjml.ui/src-gen/dk/itu/simplifiedjml/ui/contentassist/antlr/internal/InternalTomato.g:1624:1: ( ruleAnyOther )
            // ../dk.itu.simplifiedjml.ui/src-gen/dk/itu/simplifiedjml/ui/contentassist/antlr/internal/InternalTomato.g:1625:1: ruleAnyOther
            {
             before(grammarAccess.getMethodAccess().getRequirementsAnyOtherParserRuleCall_1_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleAnyOther_in_rule__Method__RequirementsAssignment_1_13183);
            ruleAnyOther();

            state._fsp--;

             after(grammarAccess.getMethodAccess().getRequirementsAnyOtherParserRuleCall_1_1_0()); 

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
    // $ANTLR end "rule__Method__RequirementsAssignment_1_1"


    // $ANTLR start "rule__Method__RequirementsAssignment_1_3_1"
    // ../dk.itu.simplifiedjml.ui/src-gen/dk/itu/simplifiedjml/ui/contentassist/antlr/internal/InternalTomato.g:1634:1: rule__Method__RequirementsAssignment_1_3_1 : ( ruleAnyOther ) ;
    public final void rule__Method__RequirementsAssignment_1_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.simplifiedjml.ui/src-gen/dk/itu/simplifiedjml/ui/contentassist/antlr/internal/InternalTomato.g:1638:1: ( ( ruleAnyOther ) )
            // ../dk.itu.simplifiedjml.ui/src-gen/dk/itu/simplifiedjml/ui/contentassist/antlr/internal/InternalTomato.g:1639:1: ( ruleAnyOther )
            {
            // ../dk.itu.simplifiedjml.ui/src-gen/dk/itu/simplifiedjml/ui/contentassist/antlr/internal/InternalTomato.g:1639:1: ( ruleAnyOther )
            // ../dk.itu.simplifiedjml.ui/src-gen/dk/itu/simplifiedjml/ui/contentassist/antlr/internal/InternalTomato.g:1640:1: ruleAnyOther
            {
             before(grammarAccess.getMethodAccess().getRequirementsAnyOtherParserRuleCall_1_3_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleAnyOther_in_rule__Method__RequirementsAssignment_1_3_13214);
            ruleAnyOther();

            state._fsp--;

             after(grammarAccess.getMethodAccess().getRequirementsAnyOtherParserRuleCall_1_3_1_0()); 

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
    // $ANTLR end "rule__Method__RequirementsAssignment_1_3_1"


    // $ANTLR start "rule__Method__EnsuresAssignment_2_1"
    // ../dk.itu.simplifiedjml.ui/src-gen/dk/itu/simplifiedjml/ui/contentassist/antlr/internal/InternalTomato.g:1649:1: rule__Method__EnsuresAssignment_2_1 : ( ruleAnyOther ) ;
    public final void rule__Method__EnsuresAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.simplifiedjml.ui/src-gen/dk/itu/simplifiedjml/ui/contentassist/antlr/internal/InternalTomato.g:1653:1: ( ( ruleAnyOther ) )
            // ../dk.itu.simplifiedjml.ui/src-gen/dk/itu/simplifiedjml/ui/contentassist/antlr/internal/InternalTomato.g:1654:1: ( ruleAnyOther )
            {
            // ../dk.itu.simplifiedjml.ui/src-gen/dk/itu/simplifiedjml/ui/contentassist/antlr/internal/InternalTomato.g:1654:1: ( ruleAnyOther )
            // ../dk.itu.simplifiedjml.ui/src-gen/dk/itu/simplifiedjml/ui/contentassist/antlr/internal/InternalTomato.g:1655:1: ruleAnyOther
            {
             before(grammarAccess.getMethodAccess().getEnsuresAnyOtherParserRuleCall_2_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleAnyOther_in_rule__Method__EnsuresAssignment_2_13245);
            ruleAnyOther();

            state._fsp--;

             after(grammarAccess.getMethodAccess().getEnsuresAnyOtherParserRuleCall_2_1_0()); 

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
    // $ANTLR end "rule__Method__EnsuresAssignment_2_1"


    // $ANTLR start "rule__Method__EnsuresAssignment_2_3_1"
    // ../dk.itu.simplifiedjml.ui/src-gen/dk/itu/simplifiedjml/ui/contentassist/antlr/internal/InternalTomato.g:1664:1: rule__Method__EnsuresAssignment_2_3_1 : ( ruleAnyOther ) ;
    public final void rule__Method__EnsuresAssignment_2_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.simplifiedjml.ui/src-gen/dk/itu/simplifiedjml/ui/contentassist/antlr/internal/InternalTomato.g:1668:1: ( ( ruleAnyOther ) )
            // ../dk.itu.simplifiedjml.ui/src-gen/dk/itu/simplifiedjml/ui/contentassist/antlr/internal/InternalTomato.g:1669:1: ( ruleAnyOther )
            {
            // ../dk.itu.simplifiedjml.ui/src-gen/dk/itu/simplifiedjml/ui/contentassist/antlr/internal/InternalTomato.g:1669:1: ( ruleAnyOther )
            // ../dk.itu.simplifiedjml.ui/src-gen/dk/itu/simplifiedjml/ui/contentassist/antlr/internal/InternalTomato.g:1670:1: ruleAnyOther
            {
             before(grammarAccess.getMethodAccess().getEnsuresAnyOtherParserRuleCall_2_3_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleAnyOther_in_rule__Method__EnsuresAssignment_2_3_13276);
            ruleAnyOther();

            state._fsp--;

             after(grammarAccess.getMethodAccess().getEnsuresAnyOtherParserRuleCall_2_3_1_0()); 

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
    // $ANTLR end "rule__Method__EnsuresAssignment_2_3_1"


    // $ANTLR start "rule__Method__SignatureAssignment_4"
    // ../dk.itu.simplifiedjml.ui/src-gen/dk/itu/simplifiedjml/ui/contentassist/antlr/internal/InternalTomato.g:1679:1: rule__Method__SignatureAssignment_4 : ( ruleHackySignature ) ;
    public final void rule__Method__SignatureAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.simplifiedjml.ui/src-gen/dk/itu/simplifiedjml/ui/contentassist/antlr/internal/InternalTomato.g:1683:1: ( ( ruleHackySignature ) )
            // ../dk.itu.simplifiedjml.ui/src-gen/dk/itu/simplifiedjml/ui/contentassist/antlr/internal/InternalTomato.g:1684:1: ( ruleHackySignature )
            {
            // ../dk.itu.simplifiedjml.ui/src-gen/dk/itu/simplifiedjml/ui/contentassist/antlr/internal/InternalTomato.g:1684:1: ( ruleHackySignature )
            // ../dk.itu.simplifiedjml.ui/src-gen/dk/itu/simplifiedjml/ui/contentassist/antlr/internal/InternalTomato.g:1685:1: ruleHackySignature
            {
             before(grammarAccess.getMethodAccess().getSignatureHackySignatureParserRuleCall_4_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleHackySignature_in_rule__Method__SignatureAssignment_43307);
            ruleHackySignature();

            state._fsp--;

             after(grammarAccess.getMethodAccess().getSignatureHackySignatureParserRuleCall_4_0()); 

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
    // $ANTLR end "rule__Method__SignatureAssignment_4"

    // Delegated rules


 

    
    private static class FollowSets000 {
        public static final BitSet FOLLOW_ruleSimplifiedJMLModel_in_entryRuleSimplifiedJMLModel61 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleSimplifiedJMLModel68 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__SimplifiedJMLModel__Group__0_in_ruleSimplifiedJMLModel94 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleStructure_in_entryRuleStructure121 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleStructure128 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Structure__Group__0_in_ruleStructure154 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleMethod_in_entryRuleMethod181 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleMethod188 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Method__Group__0_in_ruleMethod214 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_entryRuleEString241 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleEString248 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__EString__Alternatives_in_ruleEString274 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAnyOther_in_entryRuleAnyOther301 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleAnyOther308 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__AnyOther__Alternatives_in_ruleAnyOther334 = new BitSet(new long[]{0x00000000000000C2L});
        public static final BitSet FOLLOW_ruleHackySignature_in_entryRuleHackySignature362 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleHackySignature369 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_HACKY_SIGN_in_ruleHackySignature395 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_STRING_in_rule__EString__Alternatives430 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_rule__EString__Alternatives447 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ANY_OTHER_in_rule__AnyOther__Alternatives479 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_rule__AnyOther__Alternatives496 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__SimplifiedJMLModel__Group__0__Impl_in_rule__SimplifiedJMLModel__Group__0526 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_rule__SimplifiedJMLModel__Group__1_in_rule__SimplifiedJMLModel__Group__0529 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__SimplifiedJMLModel__StructuresAssignment_0_in_rule__SimplifiedJMLModel__Group__0__Impl556 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__SimplifiedJMLModel__Group__1__Impl_in_rule__SimplifiedJMLModel__Group__1586 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__SimplifiedJMLModel__StructuresAssignment_1_in_rule__SimplifiedJMLModel__Group__1__Impl613 = new BitSet(new long[]{0x0000000000001002L});
        public static final BitSet FOLLOW_rule__Structure__Group__0__Impl_in_rule__Structure__Group__0648 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_rule__Structure__Group__1_in_rule__Structure__Group__0651 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Structure__Group__1__Impl_in_rule__Structure__Group__1709 = new BitSet(new long[]{0x0000000000000060L});
        public static final BitSet FOLLOW_rule__Structure__Group__2_in_rule__Structure__Group__1712 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_12_in_rule__Structure__Group__1__Impl740 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Structure__Group__2__Impl_in_rule__Structure__Group__2771 = new BitSet(new long[]{0x0000000000002000L});
        public static final BitSet FOLLOW_rule__Structure__Group__3_in_rule__Structure__Group__2774 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Structure__NameAssignment_2_in_rule__Structure__Group__2__Impl801 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Structure__Group__3__Impl_in_rule__Structure__Group__3831 = new BitSet(new long[]{0x000000000029C000L});
        public static final BitSet FOLLOW_rule__Structure__Group__4_in_rule__Structure__Group__3834 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_13_in_rule__Structure__Group__3__Impl862 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Structure__Group__4__Impl_in_rule__Structure__Group__4893 = new BitSet(new long[]{0x000000000029C000L});
        public static final BitSet FOLLOW_rule__Structure__Group__5_in_rule__Structure__Group__4896 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Structure__Group_4__0_in_rule__Structure__Group__4__Impl923 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Structure__Group__5__Impl_in_rule__Structure__Group__5954 = new BitSet(new long[]{0x000000000029C000L});
        public static final BitSet FOLLOW_rule__Structure__Group__6_in_rule__Structure__Group__5957 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Structure__Group_5__0_in_rule__Structure__Group__5__Impl984 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Structure__Group__6__Impl_in_rule__Structure__Group__61015 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_14_in_rule__Structure__Group__6__Impl1043 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Structure__Group_4__0__Impl_in_rule__Structure__Group_4__01088 = new BitSet(new long[]{0x00000000000000C0L});
        public static final BitSet FOLLOW_rule__Structure__Group_4__1_in_rule__Structure__Group_4__01091 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_15_in_rule__Structure__Group_4__0__Impl1119 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Structure__Group_4__1__Impl_in_rule__Structure__Group_4__11150 = new BitSet(new long[]{0x0000000000008000L});
        public static final BitSet FOLLOW_rule__Structure__Group_4__2_in_rule__Structure__Group_4__11153 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Structure__InvariantsAssignment_4_1_in_rule__Structure__Group_4__1__Impl1180 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Structure__Group_4__2__Impl_in_rule__Structure__Group_4__21210 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Structure__Group_4_2__0_in_rule__Structure__Group_4__2__Impl1237 = new BitSet(new long[]{0x0000000000008002L});
        public static final BitSet FOLLOW_rule__Structure__Group_4_2__0__Impl_in_rule__Structure__Group_4_2__01274 = new BitSet(new long[]{0x00000000000000C0L});
        public static final BitSet FOLLOW_rule__Structure__Group_4_2__1_in_rule__Structure__Group_4_2__01277 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_15_in_rule__Structure__Group_4_2__0__Impl1305 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Structure__Group_4_2__1__Impl_in_rule__Structure__Group_4_2__11336 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Structure__InvariantsAssignment_4_2_1_in_rule__Structure__Group_4_2__1__Impl1363 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Structure__Group_5__0__Impl_in_rule__Structure__Group_5__01397 = new BitSet(new long[]{0x0000000000290000L});
        public static final BitSet FOLLOW_rule__Structure__Group_5__1_in_rule__Structure__Group_5__01400 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Structure__MethodsAssignment_5_0_in_rule__Structure__Group_5__0__Impl1427 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Structure__Group_5__1__Impl_in_rule__Structure__Group_5__11457 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Structure__MethodsAssignment_5_1_in_rule__Structure__Group_5__1__Impl1484 = new BitSet(new long[]{0x0000000000290002L});
        public static final BitSet FOLLOW_rule__Method__Group__0__Impl_in_rule__Method__Group__01519 = new BitSet(new long[]{0x0000000000290000L});
        public static final BitSet FOLLOW_rule__Method__Group__1_in_rule__Method__Group__01522 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Method__Group__1__Impl_in_rule__Method__Group__11580 = new BitSet(new long[]{0x0000000000290000L});
        public static final BitSet FOLLOW_rule__Method__Group__2_in_rule__Method__Group__11583 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Method__Group_1__0_in_rule__Method__Group__1__Impl1610 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Method__Group__2__Impl_in_rule__Method__Group__21641 = new BitSet(new long[]{0x0000000000290000L});
        public static final BitSet FOLLOW_rule__Method__Group__3_in_rule__Method__Group__21644 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Method__Group_2__0_in_rule__Method__Group__2__Impl1671 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Method__Group__3__Impl_in_rule__Method__Group__31702 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_rule__Method__Group__4_in_rule__Method__Group__31705 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_16_in_rule__Method__Group__3__Impl1733 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Method__Group__4__Impl_in_rule__Method__Group__41764 = new BitSet(new long[]{0x0000000000002000L});
        public static final BitSet FOLLOW_rule__Method__Group__5_in_rule__Method__Group__41767 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Method__SignatureAssignment_4_in_rule__Method__Group__4__Impl1794 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Method__Group__5__Impl_in_rule__Method__Group__51824 = new BitSet(new long[]{0x0000000000020000L});
        public static final BitSet FOLLOW_rule__Method__Group__6_in_rule__Method__Group__51827 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_13_in_rule__Method__Group__5__Impl1855 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Method__Group__6__Impl_in_rule__Method__Group__61886 = new BitSet(new long[]{0x0000000000040000L});
        public static final BitSet FOLLOW_rule__Method__Group__7_in_rule__Method__Group__61889 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_17_in_rule__Method__Group__6__Impl1917 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Method__Group__7__Impl_in_rule__Method__Group__71948 = new BitSet(new long[]{0x0000000000004000L});
        public static final BitSet FOLLOW_rule__Method__Group__8_in_rule__Method__Group__71951 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_18_in_rule__Method__Group__7__Impl1979 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Method__Group__8__Impl_in_rule__Method__Group__82010 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_14_in_rule__Method__Group__8__Impl2038 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Method__Group_1__0__Impl_in_rule__Method__Group_1__02087 = new BitSet(new long[]{0x00000000000000C0L});
        public static final BitSet FOLLOW_rule__Method__Group_1__1_in_rule__Method__Group_1__02090 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_19_in_rule__Method__Group_1__0__Impl2118 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Method__Group_1__1__Impl_in_rule__Method__Group_1__12149 = new BitSet(new long[]{0x0000000000100000L});
        public static final BitSet FOLLOW_rule__Method__Group_1__2_in_rule__Method__Group_1__12152 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Method__RequirementsAssignment_1_1_in_rule__Method__Group_1__1__Impl2179 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Method__Group_1__2__Impl_in_rule__Method__Group_1__22209 = new BitSet(new long[]{0x0000000000080000L});
        public static final BitSet FOLLOW_rule__Method__Group_1__3_in_rule__Method__Group_1__22212 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_20_in_rule__Method__Group_1__2__Impl2240 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Method__Group_1__3__Impl_in_rule__Method__Group_1__32271 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Method__Group_1_3__0_in_rule__Method__Group_1__3__Impl2298 = new BitSet(new long[]{0x0000000000080002L});
        public static final BitSet FOLLOW_rule__Method__Group_1_3__0__Impl_in_rule__Method__Group_1_3__02337 = new BitSet(new long[]{0x00000000000000C0L});
        public static final BitSet FOLLOW_rule__Method__Group_1_3__1_in_rule__Method__Group_1_3__02340 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_19_in_rule__Method__Group_1_3__0__Impl2368 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Method__Group_1_3__1__Impl_in_rule__Method__Group_1_3__12399 = new BitSet(new long[]{0x0000000000100000L});
        public static final BitSet FOLLOW_rule__Method__Group_1_3__2_in_rule__Method__Group_1_3__12402 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Method__RequirementsAssignment_1_3_1_in_rule__Method__Group_1_3__1__Impl2429 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Method__Group_1_3__2__Impl_in_rule__Method__Group_1_3__22459 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_20_in_rule__Method__Group_1_3__2__Impl2487 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Method__Group_2__0__Impl_in_rule__Method__Group_2__02524 = new BitSet(new long[]{0x00000000000000C0L});
        public static final BitSet FOLLOW_rule__Method__Group_2__1_in_rule__Method__Group_2__02527 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_21_in_rule__Method__Group_2__0__Impl2555 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Method__Group_2__1__Impl_in_rule__Method__Group_2__12586 = new BitSet(new long[]{0x0000000000100000L});
        public static final BitSet FOLLOW_rule__Method__Group_2__2_in_rule__Method__Group_2__12589 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Method__EnsuresAssignment_2_1_in_rule__Method__Group_2__1__Impl2616 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Method__Group_2__2__Impl_in_rule__Method__Group_2__22646 = new BitSet(new long[]{0x0000000000200000L});
        public static final BitSet FOLLOW_rule__Method__Group_2__3_in_rule__Method__Group_2__22649 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_20_in_rule__Method__Group_2__2__Impl2677 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Method__Group_2__3__Impl_in_rule__Method__Group_2__32708 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Method__Group_2_3__0_in_rule__Method__Group_2__3__Impl2735 = new BitSet(new long[]{0x0000000000200002L});
        public static final BitSet FOLLOW_rule__Method__Group_2_3__0__Impl_in_rule__Method__Group_2_3__02774 = new BitSet(new long[]{0x00000000000000C0L});
        public static final BitSet FOLLOW_rule__Method__Group_2_3__1_in_rule__Method__Group_2_3__02777 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_21_in_rule__Method__Group_2_3__0__Impl2805 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Method__Group_2_3__1__Impl_in_rule__Method__Group_2_3__12836 = new BitSet(new long[]{0x0000000000100000L});
        public static final BitSet FOLLOW_rule__Method__Group_2_3__2_in_rule__Method__Group_2_3__12839 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Method__EnsuresAssignment_2_3_1_in_rule__Method__Group_2_3__1__Impl2866 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Method__Group_2_3__2__Impl_in_rule__Method__Group_2_3__22896 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_20_in_rule__Method__Group_2_3__2__Impl2924 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleStructure_in_rule__SimplifiedJMLModel__StructuresAssignment_02966 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleStructure_in_rule__SimplifiedJMLModel__StructuresAssignment_12997 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__Structure__NameAssignment_23028 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAnyOther_in_rule__Structure__InvariantsAssignment_4_13059 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAnyOther_in_rule__Structure__InvariantsAssignment_4_2_13090 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleMethod_in_rule__Structure__MethodsAssignment_5_03121 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleMethod_in_rule__Structure__MethodsAssignment_5_13152 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAnyOther_in_rule__Method__RequirementsAssignment_1_13183 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAnyOther_in_rule__Method__RequirementsAssignment_1_3_13214 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAnyOther_in_rule__Method__EnsuresAssignment_2_13245 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAnyOther_in_rule__Method__EnsuresAssignment_2_3_13276 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleHackySignature_in_rule__Method__SignatureAssignment_43307 = new BitSet(new long[]{0x0000000000000002L});
    }


}