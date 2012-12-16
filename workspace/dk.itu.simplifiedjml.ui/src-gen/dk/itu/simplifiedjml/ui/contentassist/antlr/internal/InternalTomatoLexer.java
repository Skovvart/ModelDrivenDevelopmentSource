package dk.itu.simplifiedjml.ui.contentassist.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.Lexer;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalTomatoLexer extends Lexer {
    public static final int RULE_ID=6;
    public static final int RULE_ANY_OTHER=7;
    public static final int T__21=21;
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

    public InternalTomatoLexer() {;} 
    public InternalTomatoLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public InternalTomatoLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
    public String getGrammarFileName() { return "../dk.itu.simplifiedjml.ui/src-gen/dk/itu/simplifiedjml/ui/contentassist/antlr/internal/InternalTomato.g"; }

    // $ANTLR start "T__12"
    public final void mT__12() throws RecognitionException {
        try {
            int _type = T__12;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../dk.itu.simplifiedjml.ui/src-gen/dk/itu/simplifiedjml/ui/contentassist/antlr/internal/InternalTomato.g:11:7: ( 'class' )
            // ../dk.itu.simplifiedjml.ui/src-gen/dk/itu/simplifiedjml/ui/contentassist/antlr/internal/InternalTomato.g:11:9: 'class'
            {
            match("class"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__12"

    // $ANTLR start "T__13"
    public final void mT__13() throws RecognitionException {
        try {
            int _type = T__13;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../dk.itu.simplifiedjml.ui/src-gen/dk/itu/simplifiedjml/ui/contentassist/antlr/internal/InternalTomato.g:12:7: ( '{' )
            // ../dk.itu.simplifiedjml.ui/src-gen/dk/itu/simplifiedjml/ui/contentassist/antlr/internal/InternalTomato.g:12:9: '{'
            {
            match('{'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__13"

    // $ANTLR start "T__14"
    public final void mT__14() throws RecognitionException {
        try {
            int _type = T__14;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../dk.itu.simplifiedjml.ui/src-gen/dk/itu/simplifiedjml/ui/contentassist/antlr/internal/InternalTomato.g:13:7: ( '}' )
            // ../dk.itu.simplifiedjml.ui/src-gen/dk/itu/simplifiedjml/ui/contentassist/antlr/internal/InternalTomato.g:13:9: '}'
            {
            match('}'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__14"

    // $ANTLR start "T__15"
    public final void mT__15() throws RecognitionException {
        try {
            int _type = T__15;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../dk.itu.simplifiedjml.ui/src-gen/dk/itu/simplifiedjml/ui/contentassist/antlr/internal/InternalTomato.g:14:7: ( '//@ invariant' )
            // ../dk.itu.simplifiedjml.ui/src-gen/dk/itu/simplifiedjml/ui/contentassist/antlr/internal/InternalTomato.g:14:9: '//@ invariant'
            {
            match("//@ invariant"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__15"

    // $ANTLR start "T__16"
    public final void mT__16() throws RecognitionException {
        try {
            int _type = T__16;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../dk.itu.simplifiedjml.ui/src-gen/dk/itu/simplifiedjml/ui/contentassist/antlr/internal/InternalTomato.g:15:7: ( '/*< AUTO GENERATED >*/' )
            // ../dk.itu.simplifiedjml.ui/src-gen/dk/itu/simplifiedjml/ui/contentassist/antlr/internal/InternalTomato.g:15:9: '/*< AUTO GENERATED >*/'
            {
            match("/*< AUTO GENERATED >*/"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__16"

    // $ANTLR start "T__17"
    public final void mT__17() throws RecognitionException {
        try {
            int _type = T__17;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../dk.itu.simplifiedjml.ui/src-gen/dk/itu/simplifiedjml/ui/contentassist/antlr/internal/InternalTomato.g:16:7: ( '/* TODO: Implementation */' )
            // ../dk.itu.simplifiedjml.ui/src-gen/dk/itu/simplifiedjml/ui/contentassist/antlr/internal/InternalTomato.g:16:9: '/* TODO: Implementation */'
            {
            match("/* TODO: Implementation */"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__17"

    // $ANTLR start "T__18"
    public final void mT__18() throws RecognitionException {
        try {
            int _type = T__18;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../dk.itu.simplifiedjml.ui/src-gen/dk/itu/simplifiedjml/ui/contentassist/antlr/internal/InternalTomato.g:17:7: ( 'throw new UnsupportedOperationException(\"Not Implemented\");' )
            // ../dk.itu.simplifiedjml.ui/src-gen/dk/itu/simplifiedjml/ui/contentassist/antlr/internal/InternalTomato.g:17:9: 'throw new UnsupportedOperationException(\"Not Implemented\");'
            {
            match("throw new UnsupportedOperationException(\"Not Implemented\");"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__18"

    // $ANTLR start "T__19"
    public final void mT__19() throws RecognitionException {
        try {
            int _type = T__19;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../dk.itu.simplifiedjml.ui/src-gen/dk/itu/simplifiedjml/ui/contentassist/antlr/internal/InternalTomato.g:18:7: ( '//@ requires' )
            // ../dk.itu.simplifiedjml.ui/src-gen/dk/itu/simplifiedjml/ui/contentassist/antlr/internal/InternalTomato.g:18:9: '//@ requires'
            {
            match("//@ requires"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__19"

    // $ANTLR start "T__20"
    public final void mT__20() throws RecognitionException {
        try {
            int _type = T__20;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../dk.itu.simplifiedjml.ui/src-gen/dk/itu/simplifiedjml/ui/contentassist/antlr/internal/InternalTomato.g:19:7: ( '\\n' )
            // ../dk.itu.simplifiedjml.ui/src-gen/dk/itu/simplifiedjml/ui/contentassist/antlr/internal/InternalTomato.g:19:9: '\\n'
            {
            match('\n'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__20"

    // $ANTLR start "T__21"
    public final void mT__21() throws RecognitionException {
        try {
            int _type = T__21;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../dk.itu.simplifiedjml.ui/src-gen/dk/itu/simplifiedjml/ui/contentassist/antlr/internal/InternalTomato.g:20:7: ( '//@ ensures' )
            // ../dk.itu.simplifiedjml.ui/src-gen/dk/itu/simplifiedjml/ui/contentassist/antlr/internal/InternalTomato.g:20:9: '//@ ensures'
            {
            match("//@ ensures"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__21"

    // $ANTLR start "RULE_INT"
    public final void mRULE_INT() throws RecognitionException {
        try {
            int _type = RULE_INT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../dk.itu.simplifiedjml.ui/src-gen/dk/itu/simplifiedjml/ui/contentassist/antlr/internal/InternalTomato.g:1695:10: ( '#@IAMANINT' ( '0' .. '1' )+ )
            // ../dk.itu.simplifiedjml.ui/src-gen/dk/itu/simplifiedjml/ui/contentassist/antlr/internal/InternalTomato.g:1695:12: '#@IAMANINT' ( '0' .. '1' )+
            {
            match("#@IAMANINT"); 

            // ../dk.itu.simplifiedjml.ui/src-gen/dk/itu/simplifiedjml/ui/contentassist/antlr/internal/InternalTomato.g:1695:25: ( '0' .. '1' )+
            int cnt1=0;
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0>='0' && LA1_0<='1')) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ../dk.itu.simplifiedjml.ui/src-gen/dk/itu/simplifiedjml/ui/contentassist/antlr/internal/InternalTomato.g:1695:26: '0' .. '1'
            	    {
            	    matchRange('0','1'); 

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

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_INT"

    // $ANTLR start "RULE_SL_COMMENT"
    public final void mRULE_SL_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_SL_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../dk.itu.simplifiedjml.ui/src-gen/dk/itu/simplifiedjml/ui/contentassist/antlr/internal/InternalTomato.g:1697:17: ( '##' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )? )
            // ../dk.itu.simplifiedjml.ui/src-gen/dk/itu/simplifiedjml/ui/contentassist/antlr/internal/InternalTomato.g:1697:19: '##' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )?
            {
            match("##"); 

            // ../dk.itu.simplifiedjml.ui/src-gen/dk/itu/simplifiedjml/ui/contentassist/antlr/internal/InternalTomato.g:1697:24: (~ ( ( '\\n' | '\\r' ) ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( ((LA2_0>='\u0000' && LA2_0<='\t')||(LA2_0>='\u000B' && LA2_0<='\f')||(LA2_0>='\u000E' && LA2_0<='\uFFFF')) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // ../dk.itu.simplifiedjml.ui/src-gen/dk/itu/simplifiedjml/ui/contentassist/antlr/internal/InternalTomato.g:1697:24: ~ ( ( '\\n' | '\\r' ) )
            	    {
            	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='\t')||(input.LA(1)>='\u000B' && input.LA(1)<='\f')||(input.LA(1)>='\u000E' && input.LA(1)<='\uFFFF') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

            // ../dk.itu.simplifiedjml.ui/src-gen/dk/itu/simplifiedjml/ui/contentassist/antlr/internal/InternalTomato.g:1697:40: ( ( '\\r' )? '\\n' )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0=='\n'||LA4_0=='\r') ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // ../dk.itu.simplifiedjml.ui/src-gen/dk/itu/simplifiedjml/ui/contentassist/antlr/internal/InternalTomato.g:1697:41: ( '\\r' )? '\\n'
                    {
                    // ../dk.itu.simplifiedjml.ui/src-gen/dk/itu/simplifiedjml/ui/contentassist/antlr/internal/InternalTomato.g:1697:41: ( '\\r' )?
                    int alt3=2;
                    int LA3_0 = input.LA(1);

                    if ( (LA3_0=='\r') ) {
                        alt3=1;
                    }
                    switch (alt3) {
                        case 1 :
                            // ../dk.itu.simplifiedjml.ui/src-gen/dk/itu/simplifiedjml/ui/contentassist/antlr/internal/InternalTomato.g:1697:41: '\\r'
                            {
                            match('\r'); 

                            }
                            break;

                    }

                    match('\n'); 

                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_SL_COMMENT"

    // $ANTLR start "RULE_ML_COMMENT"
    public final void mRULE_ML_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_ML_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../dk.itu.simplifiedjml.ui/src-gen/dk/itu/simplifiedjml/ui/contentassist/antlr/internal/InternalTomato.g:1699:17: ( '/#' ( options {greedy=false; } : . )* '#\\\\' )
            // ../dk.itu.simplifiedjml.ui/src-gen/dk/itu/simplifiedjml/ui/contentassist/antlr/internal/InternalTomato.g:1699:19: '/#' ( options {greedy=false; } : . )* '#\\\\'
            {
            match("/#"); 

            // ../dk.itu.simplifiedjml.ui/src-gen/dk/itu/simplifiedjml/ui/contentassist/antlr/internal/InternalTomato.g:1699:24: ( options {greedy=false; } : . )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0=='#') ) {
                    int LA5_1 = input.LA(2);

                    if ( (LA5_1=='\\') ) {
                        alt5=2;
                    }
                    else if ( ((LA5_1>='\u0000' && LA5_1<='[')||(LA5_1>=']' && LA5_1<='\uFFFF')) ) {
                        alt5=1;
                    }


                }
                else if ( ((LA5_0>='\u0000' && LA5_0<='\"')||(LA5_0>='$' && LA5_0<='\uFFFF')) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // ../dk.itu.simplifiedjml.ui/src-gen/dk/itu/simplifiedjml/ui/contentassist/antlr/internal/InternalTomato.g:1699:52: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);

            match("#\\"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ML_COMMENT"

    // $ANTLR start "RULE_HACKY_SIGN"
    public final void mRULE_HACKY_SIGN() throws RecognitionException {
        try {
            int _type = RULE_HACKY_SIGN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../dk.itu.simplifiedjml.ui/src-gen/dk/itu/simplifiedjml/ui/contentassist/antlr/internal/InternalTomato.g:1701:17: ( ( 'public' | 'private' | 'protected' | '/* default */' ) (~ ( ')' ) )* ')' )
            // ../dk.itu.simplifiedjml.ui/src-gen/dk/itu/simplifiedjml/ui/contentassist/antlr/internal/InternalTomato.g:1701:19: ( 'public' | 'private' | 'protected' | '/* default */' ) (~ ( ')' ) )* ')'
            {
            // ../dk.itu.simplifiedjml.ui/src-gen/dk/itu/simplifiedjml/ui/contentassist/antlr/internal/InternalTomato.g:1701:19: ( 'public' | 'private' | 'protected' | '/* default */' )
            int alt6=4;
            int LA6_0 = input.LA(1);

            if ( (LA6_0=='p') ) {
                int LA6_1 = input.LA(2);

                if ( (LA6_1=='u') ) {
                    alt6=1;
                }
                else if ( (LA6_1=='r') ) {
                    int LA6_4 = input.LA(3);

                    if ( (LA6_4=='i') ) {
                        alt6=2;
                    }
                    else if ( (LA6_4=='o') ) {
                        alt6=3;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 6, 4, input);

                        throw nvae;
                    }
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 6, 1, input);

                    throw nvae;
                }
            }
            else if ( (LA6_0=='/') ) {
                alt6=4;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // ../dk.itu.simplifiedjml.ui/src-gen/dk/itu/simplifiedjml/ui/contentassist/antlr/internal/InternalTomato.g:1701:20: 'public'
                    {
                    match("public"); 


                    }
                    break;
                case 2 :
                    // ../dk.itu.simplifiedjml.ui/src-gen/dk/itu/simplifiedjml/ui/contentassist/antlr/internal/InternalTomato.g:1701:29: 'private'
                    {
                    match("private"); 


                    }
                    break;
                case 3 :
                    // ../dk.itu.simplifiedjml.ui/src-gen/dk/itu/simplifiedjml/ui/contentassist/antlr/internal/InternalTomato.g:1701:39: 'protected'
                    {
                    match("protected"); 


                    }
                    break;
                case 4 :
                    // ../dk.itu.simplifiedjml.ui/src-gen/dk/itu/simplifiedjml/ui/contentassist/antlr/internal/InternalTomato.g:1701:51: '/* default */'
                    {
                    match("/* default */"); 


                    }
                    break;

            }

            // ../dk.itu.simplifiedjml.ui/src-gen/dk/itu/simplifiedjml/ui/contentassist/antlr/internal/InternalTomato.g:1701:68: (~ ( ')' ) )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( ((LA7_0>='\u0000' && LA7_0<='(')||(LA7_0>='*' && LA7_0<='\uFFFF')) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // ../dk.itu.simplifiedjml.ui/src-gen/dk/itu/simplifiedjml/ui/contentassist/antlr/internal/InternalTomato.g:1701:68: ~ ( ')' )
            	    {
            	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='(')||(input.LA(1)>='*' && input.LA(1)<='\uFFFF') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

            match(')'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_HACKY_SIGN"

    // $ANTLR start "RULE_ID"
    public final void mRULE_ID() throws RecognitionException {
        try {
            int _type = RULE_ID;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../dk.itu.simplifiedjml.ui/src-gen/dk/itu/simplifiedjml/ui/contentassist/antlr/internal/InternalTomato.g:1703:9: ( ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )* )
            // ../dk.itu.simplifiedjml.ui/src-gen/dk/itu/simplifiedjml/ui/contentassist/antlr/internal/InternalTomato.g:1703:11: ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            {
            // ../dk.itu.simplifiedjml.ui/src-gen/dk/itu/simplifiedjml/ui/contentassist/antlr/internal/InternalTomato.g:1703:11: ( '^' )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0=='^') ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // ../dk.itu.simplifiedjml.ui/src-gen/dk/itu/simplifiedjml/ui/contentassist/antlr/internal/InternalTomato.g:1703:11: '^'
                    {
                    match('^'); 

                    }
                    break;

            }

            if ( (input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            // ../dk.itu.simplifiedjml.ui/src-gen/dk/itu/simplifiedjml/ui/contentassist/antlr/internal/InternalTomato.g:1703:40: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( ((LA9_0>='0' && LA9_0<='9')||(LA9_0>='A' && LA9_0<='Z')||LA9_0=='_'||(LA9_0>='a' && LA9_0<='z')) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // ../dk.itu.simplifiedjml.ui/src-gen/dk/itu/simplifiedjml/ui/contentassist/antlr/internal/InternalTomato.g:
            	    {
            	    if ( (input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ID"

    // $ANTLR start "RULE_STRING"
    public final void mRULE_STRING() throws RecognitionException {
        try {
            int _type = RULE_STRING;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../dk.itu.simplifiedjml.ui/src-gen/dk/itu/simplifiedjml/ui/contentassist/antlr/internal/InternalTomato.g:1705:13: ( ( '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' ) )
            // ../dk.itu.simplifiedjml.ui/src-gen/dk/itu/simplifiedjml/ui/contentassist/antlr/internal/InternalTomato.g:1705:15: ( '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            {
            // ../dk.itu.simplifiedjml.ui/src-gen/dk/itu/simplifiedjml/ui/contentassist/antlr/internal/InternalTomato.g:1705:15: ( '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0=='\"') ) {
                alt12=1;
            }
            else if ( (LA12_0=='\'') ) {
                alt12=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;
            }
            switch (alt12) {
                case 1 :
                    // ../dk.itu.simplifiedjml.ui/src-gen/dk/itu/simplifiedjml/ui/contentassist/antlr/internal/InternalTomato.g:1705:16: '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"'
                    {
                    match('\"'); 
                    // ../dk.itu.simplifiedjml.ui/src-gen/dk/itu/simplifiedjml/ui/contentassist/antlr/internal/InternalTomato.g:1705:20: ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )*
                    loop10:
                    do {
                        int alt10=3;
                        int LA10_0 = input.LA(1);

                        if ( (LA10_0=='\\') ) {
                            alt10=1;
                        }
                        else if ( ((LA10_0>='\u0000' && LA10_0<='!')||(LA10_0>='#' && LA10_0<='[')||(LA10_0>=']' && LA10_0<='\uFFFF')) ) {
                            alt10=2;
                        }


                        switch (alt10) {
                    	case 1 :
                    	    // ../dk.itu.simplifiedjml.ui/src-gen/dk/itu/simplifiedjml/ui/contentassist/antlr/internal/InternalTomato.g:1705:21: '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' )
                    	    {
                    	    match('\\'); 
                    	    if ( input.LA(1)=='\"'||input.LA(1)=='\''||input.LA(1)=='\\'||input.LA(1)=='b'||input.LA(1)=='f'||input.LA(1)=='n'||input.LA(1)=='r'||(input.LA(1)>='t' && input.LA(1)<='u') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;
                    	case 2 :
                    	    // ../dk.itu.simplifiedjml.ui/src-gen/dk/itu/simplifiedjml/ui/contentassist/antlr/internal/InternalTomato.g:1705:66: ~ ( ( '\\\\' | '\"' ) )
                    	    {
                    	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='!')||(input.LA(1)>='#' && input.LA(1)<='[')||(input.LA(1)>=']' && input.LA(1)<='\uFFFF') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;

                    	default :
                    	    break loop10;
                        }
                    } while (true);

                    match('\"'); 

                    }
                    break;
                case 2 :
                    // ../dk.itu.simplifiedjml.ui/src-gen/dk/itu/simplifiedjml/ui/contentassist/antlr/internal/InternalTomato.g:1705:86: '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\''
                    {
                    match('\''); 
                    // ../dk.itu.simplifiedjml.ui/src-gen/dk/itu/simplifiedjml/ui/contentassist/antlr/internal/InternalTomato.g:1705:91: ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )*
                    loop11:
                    do {
                        int alt11=3;
                        int LA11_0 = input.LA(1);

                        if ( (LA11_0=='\\') ) {
                            alt11=1;
                        }
                        else if ( ((LA11_0>='\u0000' && LA11_0<='&')||(LA11_0>='(' && LA11_0<='[')||(LA11_0>=']' && LA11_0<='\uFFFF')) ) {
                            alt11=2;
                        }


                        switch (alt11) {
                    	case 1 :
                    	    // ../dk.itu.simplifiedjml.ui/src-gen/dk/itu/simplifiedjml/ui/contentassist/antlr/internal/InternalTomato.g:1705:92: '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' )
                    	    {
                    	    match('\\'); 
                    	    if ( input.LA(1)=='\"'||input.LA(1)=='\''||input.LA(1)=='\\'||input.LA(1)=='b'||input.LA(1)=='f'||input.LA(1)=='n'||input.LA(1)=='r'||(input.LA(1)>='t' && input.LA(1)<='u') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;
                    	case 2 :
                    	    // ../dk.itu.simplifiedjml.ui/src-gen/dk/itu/simplifiedjml/ui/contentassist/antlr/internal/InternalTomato.g:1705:137: ~ ( ( '\\\\' | '\\'' ) )
                    	    {
                    	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='&')||(input.LA(1)>='(' && input.LA(1)<='[')||(input.LA(1)>=']' && input.LA(1)<='\uFFFF') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;

                    	default :
                    	    break loop11;
                        }
                    } while (true);

                    match('\''); 

                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_STRING"

    // $ANTLR start "RULE_WS"
    public final void mRULE_WS() throws RecognitionException {
        try {
            int _type = RULE_WS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../dk.itu.simplifiedjml.ui/src-gen/dk/itu/simplifiedjml/ui/contentassist/antlr/internal/InternalTomato.g:1707:9: ( ( ' ' | '\\t' | '\\r' | '\\n' )+ )
            // ../dk.itu.simplifiedjml.ui/src-gen/dk/itu/simplifiedjml/ui/contentassist/antlr/internal/InternalTomato.g:1707:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            {
            // ../dk.itu.simplifiedjml.ui/src-gen/dk/itu/simplifiedjml/ui/contentassist/antlr/internal/InternalTomato.g:1707:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            int cnt13=0;
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( ((LA13_0>='\t' && LA13_0<='\n')||LA13_0=='\r'||LA13_0==' ') ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // ../dk.itu.simplifiedjml.ui/src-gen/dk/itu/simplifiedjml/ui/contentassist/antlr/internal/InternalTomato.g:
            	    {
            	    if ( (input.LA(1)>='\t' && input.LA(1)<='\n')||input.LA(1)=='\r'||input.LA(1)==' ' ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    if ( cnt13 >= 1 ) break loop13;
                        EarlyExitException eee =
                            new EarlyExitException(13, input);
                        throw eee;
                }
                cnt13++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_WS"

    // $ANTLR start "RULE_ANY_OTHER"
    public final void mRULE_ANY_OTHER() throws RecognitionException {
        try {
            int _type = RULE_ANY_OTHER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../dk.itu.simplifiedjml.ui/src-gen/dk/itu/simplifiedjml/ui/contentassist/antlr/internal/InternalTomato.g:1709:16: ( . )
            // ../dk.itu.simplifiedjml.ui/src-gen/dk/itu/simplifiedjml/ui/contentassist/antlr/internal/InternalTomato.g:1709:18: .
            {
            matchAny(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ANY_OTHER"

    public void mTokens() throws RecognitionException {
        // ../dk.itu.simplifiedjml.ui/src-gen/dk/itu/simplifiedjml/ui/contentassist/antlr/internal/InternalTomato.g:1:8: ( T__12 | T__13 | T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | RULE_INT | RULE_SL_COMMENT | RULE_ML_COMMENT | RULE_HACKY_SIGN | RULE_ID | RULE_STRING | RULE_WS | RULE_ANY_OTHER )
        int alt14=18;
        alt14 = dfa14.predict(input);
        switch (alt14) {
            case 1 :
                // ../dk.itu.simplifiedjml.ui/src-gen/dk/itu/simplifiedjml/ui/contentassist/antlr/internal/InternalTomato.g:1:10: T__12
                {
                mT__12(); 

                }
                break;
            case 2 :
                // ../dk.itu.simplifiedjml.ui/src-gen/dk/itu/simplifiedjml/ui/contentassist/antlr/internal/InternalTomato.g:1:16: T__13
                {
                mT__13(); 

                }
                break;
            case 3 :
                // ../dk.itu.simplifiedjml.ui/src-gen/dk/itu/simplifiedjml/ui/contentassist/antlr/internal/InternalTomato.g:1:22: T__14
                {
                mT__14(); 

                }
                break;
            case 4 :
                // ../dk.itu.simplifiedjml.ui/src-gen/dk/itu/simplifiedjml/ui/contentassist/antlr/internal/InternalTomato.g:1:28: T__15
                {
                mT__15(); 

                }
                break;
            case 5 :
                // ../dk.itu.simplifiedjml.ui/src-gen/dk/itu/simplifiedjml/ui/contentassist/antlr/internal/InternalTomato.g:1:34: T__16
                {
                mT__16(); 

                }
                break;
            case 6 :
                // ../dk.itu.simplifiedjml.ui/src-gen/dk/itu/simplifiedjml/ui/contentassist/antlr/internal/InternalTomato.g:1:40: T__17
                {
                mT__17(); 

                }
                break;
            case 7 :
                // ../dk.itu.simplifiedjml.ui/src-gen/dk/itu/simplifiedjml/ui/contentassist/antlr/internal/InternalTomato.g:1:46: T__18
                {
                mT__18(); 

                }
                break;
            case 8 :
                // ../dk.itu.simplifiedjml.ui/src-gen/dk/itu/simplifiedjml/ui/contentassist/antlr/internal/InternalTomato.g:1:52: T__19
                {
                mT__19(); 

                }
                break;
            case 9 :
                // ../dk.itu.simplifiedjml.ui/src-gen/dk/itu/simplifiedjml/ui/contentassist/antlr/internal/InternalTomato.g:1:58: T__20
                {
                mT__20(); 

                }
                break;
            case 10 :
                // ../dk.itu.simplifiedjml.ui/src-gen/dk/itu/simplifiedjml/ui/contentassist/antlr/internal/InternalTomato.g:1:64: T__21
                {
                mT__21(); 

                }
                break;
            case 11 :
                // ../dk.itu.simplifiedjml.ui/src-gen/dk/itu/simplifiedjml/ui/contentassist/antlr/internal/InternalTomato.g:1:70: RULE_INT
                {
                mRULE_INT(); 

                }
                break;
            case 12 :
                // ../dk.itu.simplifiedjml.ui/src-gen/dk/itu/simplifiedjml/ui/contentassist/antlr/internal/InternalTomato.g:1:79: RULE_SL_COMMENT
                {
                mRULE_SL_COMMENT(); 

                }
                break;
            case 13 :
                // ../dk.itu.simplifiedjml.ui/src-gen/dk/itu/simplifiedjml/ui/contentassist/antlr/internal/InternalTomato.g:1:95: RULE_ML_COMMENT
                {
                mRULE_ML_COMMENT(); 

                }
                break;
            case 14 :
                // ../dk.itu.simplifiedjml.ui/src-gen/dk/itu/simplifiedjml/ui/contentassist/antlr/internal/InternalTomato.g:1:111: RULE_HACKY_SIGN
                {
                mRULE_HACKY_SIGN(); 

                }
                break;
            case 15 :
                // ../dk.itu.simplifiedjml.ui/src-gen/dk/itu/simplifiedjml/ui/contentassist/antlr/internal/InternalTomato.g:1:127: RULE_ID
                {
                mRULE_ID(); 

                }
                break;
            case 16 :
                // ../dk.itu.simplifiedjml.ui/src-gen/dk/itu/simplifiedjml/ui/contentassist/antlr/internal/InternalTomato.g:1:135: RULE_STRING
                {
                mRULE_STRING(); 

                }
                break;
            case 17 :
                // ../dk.itu.simplifiedjml.ui/src-gen/dk/itu/simplifiedjml/ui/contentassist/antlr/internal/InternalTomato.g:1:147: RULE_WS
                {
                mRULE_WS(); 

                }
                break;
            case 18 :
                // ../dk.itu.simplifiedjml.ui/src-gen/dk/itu/simplifiedjml/ui/contentassist/antlr/internal/InternalTomato.g:1:155: RULE_ANY_OTHER
                {
                mRULE_ANY_OTHER(); 

                }
                break;

        }

    }


    protected DFA14 dfa14 = new DFA14(this);
    static final String DFA14_eotS =
        "\1\uffff\1\20\2\uffff\1\16\1\20\1\27\1\16\1\20\1\16\1\uffff\2\16"+
        "\2\uffff\1\20\6\uffff\1\20\4\uffff\2\20\1\uffff\1\20\3\uffff\5\20"+
        "\3\uffff\4\20\1\66\3\uffff\4\20\2\uffff\10\20";
    static final String DFA14_eofS =
        "\100\uffff";
    static final String DFA14_minS =
        "\1\0\1\154\2\uffff\1\43\1\150\1\11\1\43\1\162\1\101\1\uffff\2\0"+
        "\2\uffff\1\141\3\uffff\1\100\1\40\1\uffff\1\162\4\uffff\1\142\1"+
        "\151\1\uffff\1\163\1\40\1\uffff\1\124\1\157\1\154\1\166\1\164\1"+
        "\163\1\145\2\uffff\1\167\1\151\1\141\1\145\1\60\3\uffff\1\40\1\143"+
        "\1\164\1\143\2\uffff\1\0\1\145\1\164\2\0\1\145\1\144\1\0";
    static final String DFA14_maxS =
        "\1\uffff\1\154\2\uffff\1\57\1\150\1\40\1\100\1\165\1\172\1\uffff"+
        "\2\uffff\2\uffff\1\141\3\uffff\1\100\1\74\1\uffff\1\162\4\uffff"+
        "\1\142\1\157\1\uffff\1\163\1\40\1\uffff\1\144\1\157\1\154\1\166"+
        "\1\164\1\163\1\162\2\uffff\1\167\1\151\1\141\1\145\1\172\3\uffff"+
        "\1\40\1\143\1\164\1\143\2\uffff\1\uffff\1\145\1\164\2\uffff\1\145"+
        "\1\144\1\uffff";
    static final String DFA14_acceptS =
        "\2\uffff\1\2\1\3\6\uffff\1\17\2\uffff\1\21\1\22\1\uffff\1\17\1\2"+
        "\1\3\2\uffff\1\15\1\uffff\1\11\1\21\1\13\1\14\2\uffff\1\20\2\uffff"+
        "\1\5\7\uffff\1\6\1\16\5\uffff\1\4\1\10\1\12\4\uffff\1\1\1\7\10\uffff";
    static final String DFA14_specialS =
        "\1\2\12\uffff\1\0\1\6\53\uffff\1\5\2\uffff\1\1\1\4\2\uffff\1\3}>";
    static final String[] DFA14_transitionS = {
            "\11\16\1\15\1\6\2\16\1\15\22\16\1\15\1\16\1\13\1\7\3\16\1\14"+
            "\7\16\1\4\21\16\32\12\3\16\1\11\1\12\1\16\2\12\1\1\14\12\1\10"+
            "\3\12\1\5\6\12\1\2\1\16\1\3\uff82\16",
            "\1\17",
            "",
            "",
            "\1\25\6\uffff\1\24\4\uffff\1\23",
            "\1\26",
            "\2\30\2\uffff\1\30\22\uffff\1\30",
            "\1\32\34\uffff\1\31",
            "\1\34\2\uffff\1\33",
            "\32\20\4\uffff\1\20\1\uffff\32\20",
            "",
            "\0\35",
            "\0\35",
            "",
            "",
            "\1\36",
            "",
            "",
            "",
            "\1\37",
            "\1\41\33\uffff\1\40",
            "",
            "\1\42",
            "",
            "",
            "",
            "",
            "\1\43",
            "\1\44\5\uffff\1\45",
            "",
            "\1\46",
            "\1\47",
            "",
            "\1\50\17\uffff\1\51",
            "\1\52",
            "\1\53",
            "\1\54",
            "\1\55",
            "\1\56",
            "\1\61\3\uffff\1\57\10\uffff\1\60",
            "",
            "",
            "\1\62",
            "\1\63",
            "\1\64",
            "\1\65",
            "\12\20\7\uffff\32\20\4\uffff\1\20\1\uffff\32\20",
            "",
            "",
            "",
            "\1\67",
            "\1\70",
            "\1\71",
            "\1\72",
            "",
            "",
            "\60\51\12\73\7\51\32\73\4\51\1\73\1\51\32\73\uff85\51",
            "\1\74",
            "\1\75",
            "\60\51\12\73\7\51\32\73\4\51\1\73\1\51\32\73\uff85\51",
            "\60\51\12\73\7\51\32\73\4\51\1\73\1\51\32\73\uff85\51",
            "\1\76",
            "\1\77",
            "\60\51\12\73\7\51\32\73\4\51\1\73\1\51\32\73\uff85\51"
    };

    static final short[] DFA14_eot = DFA.unpackEncodedString(DFA14_eotS);
    static final short[] DFA14_eof = DFA.unpackEncodedString(DFA14_eofS);
    static final char[] DFA14_min = DFA.unpackEncodedStringToUnsignedChars(DFA14_minS);
    static final char[] DFA14_max = DFA.unpackEncodedStringToUnsignedChars(DFA14_maxS);
    static final short[] DFA14_accept = DFA.unpackEncodedString(DFA14_acceptS);
    static final short[] DFA14_special = DFA.unpackEncodedString(DFA14_specialS);
    static final short[][] DFA14_transition;

    static {
        int numStates = DFA14_transitionS.length;
        DFA14_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA14_transition[i] = DFA.unpackEncodedString(DFA14_transitionS[i]);
        }
    }

    static class DFA14 extends DFA {

        public DFA14(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 14;
            this.eot = DFA14_eot;
            this.eof = DFA14_eof;
            this.min = DFA14_min;
            this.max = DFA14_max;
            this.accept = DFA14_accept;
            this.special = DFA14_special;
            this.transition = DFA14_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( T__12 | T__13 | T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | RULE_INT | RULE_SL_COMMENT | RULE_ML_COMMENT | RULE_HACKY_SIGN | RULE_ID | RULE_STRING | RULE_WS | RULE_ANY_OTHER );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA14_11 = input.LA(1);

                        s = -1;
                        if ( ((LA14_11>='\u0000' && LA14_11<='\uFFFF')) ) {s = 29;}

                        else s = 14;

                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA14_59 = input.LA(1);

                        s = -1;
                        if ( ((LA14_59>='\u0000' && LA14_59<='/')||(LA14_59>=':' && LA14_59<='@')||(LA14_59>='[' && LA14_59<='^')||LA14_59=='`'||(LA14_59>='{' && LA14_59<='\uFFFF')) ) {s = 41;}

                        else if ( ((LA14_59>='0' && LA14_59<='9')||(LA14_59>='A' && LA14_59<='Z')||LA14_59=='_'||(LA14_59>='a' && LA14_59<='z')) ) {s = 59;}

                        else s = 16;

                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA14_0 = input.LA(1);

                        s = -1;
                        if ( (LA14_0=='c') ) {s = 1;}

                        else if ( (LA14_0=='{') ) {s = 2;}

                        else if ( (LA14_0=='}') ) {s = 3;}

                        else if ( (LA14_0=='/') ) {s = 4;}

                        else if ( (LA14_0=='t') ) {s = 5;}

                        else if ( (LA14_0=='\n') ) {s = 6;}

                        else if ( (LA14_0=='#') ) {s = 7;}

                        else if ( (LA14_0=='p') ) {s = 8;}

                        else if ( (LA14_0=='^') ) {s = 9;}

                        else if ( ((LA14_0>='A' && LA14_0<='Z')||LA14_0=='_'||(LA14_0>='a' && LA14_0<='b')||(LA14_0>='d' && LA14_0<='o')||(LA14_0>='q' && LA14_0<='s')||(LA14_0>='u' && LA14_0<='z')) ) {s = 10;}

                        else if ( (LA14_0=='\"') ) {s = 11;}

                        else if ( (LA14_0=='\'') ) {s = 12;}

                        else if ( (LA14_0=='\t'||LA14_0=='\r'||LA14_0==' ') ) {s = 13;}

                        else if ( ((LA14_0>='\u0000' && LA14_0<='\b')||(LA14_0>='\u000B' && LA14_0<='\f')||(LA14_0>='\u000E' && LA14_0<='\u001F')||LA14_0=='!'||(LA14_0>='$' && LA14_0<='&')||(LA14_0>='(' && LA14_0<='.')||(LA14_0>='0' && LA14_0<='@')||(LA14_0>='[' && LA14_0<=']')||LA14_0=='`'||LA14_0=='|'||(LA14_0>='~' && LA14_0<='\uFFFF')) ) {s = 14;}

                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA14_63 = input.LA(1);

                        s = -1;
                        if ( ((LA14_63>='0' && LA14_63<='9')||(LA14_63>='A' && LA14_63<='Z')||LA14_63=='_'||(LA14_63>='a' && LA14_63<='z')) ) {s = 59;}

                        else if ( ((LA14_63>='\u0000' && LA14_63<='/')||(LA14_63>=':' && LA14_63<='@')||(LA14_63>='[' && LA14_63<='^')||LA14_63=='`'||(LA14_63>='{' && LA14_63<='\uFFFF')) ) {s = 41;}

                        else s = 16;

                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA14_60 = input.LA(1);

                        s = -1;
                        if ( ((LA14_60>='0' && LA14_60<='9')||(LA14_60>='A' && LA14_60<='Z')||LA14_60=='_'||(LA14_60>='a' && LA14_60<='z')) ) {s = 59;}

                        else if ( ((LA14_60>='\u0000' && LA14_60<='/')||(LA14_60>=':' && LA14_60<='@')||(LA14_60>='[' && LA14_60<='^')||LA14_60=='`'||(LA14_60>='{' && LA14_60<='\uFFFF')) ) {s = 41;}

                        else s = 16;

                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA14_56 = input.LA(1);

                        s = -1;
                        if ( ((LA14_56>='0' && LA14_56<='9')||(LA14_56>='A' && LA14_56<='Z')||LA14_56=='_'||(LA14_56>='a' && LA14_56<='z')) ) {s = 59;}

                        else if ( ((LA14_56>='\u0000' && LA14_56<='/')||(LA14_56>=':' && LA14_56<='@')||(LA14_56>='[' && LA14_56<='^')||LA14_56=='`'||(LA14_56>='{' && LA14_56<='\uFFFF')) ) {s = 41;}

                        else s = 16;

                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA14_12 = input.LA(1);

                        s = -1;
                        if ( ((LA14_12>='\u0000' && LA14_12<='\uFFFF')) ) {s = 29;}

                        else s = 14;

                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 14, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

}