package ac.soton.xtext.statemachine.ui.contentassist.antlr.internal; 

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
import ac.soton.xtext.statemachine.services.DslGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalDslParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'StateMachine'", "'{'", "'}'", "'Nodes'", "','", "'Transitions'", "'StateMachines'", "'Transition'", "'event'", "'source'", "'target'", "'State'", "'nested'", "'Initial'", "'Junction'", "'Fork'", "'Join'", "'Any'", "'Final'"
    };
    public static final int RULE_ID=5;
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
    public static final int RULE_WS=9;

    // delegates
    // delegators


        public InternalDslParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalDslParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalDslParser.tokenNames; }
    public String getGrammarFileName() { return "../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g"; }


     
     	private DslGrammarAccess grammarAccess;
     	
        public void setGrammarAccess(DslGrammarAccess grammarAccess) {
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




    // $ANTLR start "entryRuleStateMachine"
    // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:60:1: entryRuleStateMachine : ruleStateMachine EOF ;
    public final void entryRuleStateMachine() throws RecognitionException {
        try {
            // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:61:1: ( ruleStateMachine EOF )
            // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:62:1: ruleStateMachine EOF
            {
             before(grammarAccess.getStateMachineRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleStateMachine_in_entryRuleStateMachine61);
            ruleStateMachine();

            state._fsp--;

             after(grammarAccess.getStateMachineRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleStateMachine68); 

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
    // $ANTLR end "entryRuleStateMachine"


    // $ANTLR start "ruleStateMachine"
    // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:69:1: ruleStateMachine : ( ( rule__StateMachine__Group__0 ) ) ;
    public final void ruleStateMachine() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:73:2: ( ( ( rule__StateMachine__Group__0 ) ) )
            // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:74:1: ( ( rule__StateMachine__Group__0 ) )
            {
            // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:74:1: ( ( rule__StateMachine__Group__0 ) )
            // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:75:1: ( rule__StateMachine__Group__0 )
            {
             before(grammarAccess.getStateMachineAccess().getGroup()); 
            // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:76:1: ( rule__StateMachine__Group__0 )
            // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:76:2: rule__StateMachine__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__StateMachine__Group__0_in_ruleStateMachine94);
            rule__StateMachine__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getStateMachineAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleStateMachine"


    // $ANTLR start "entryRuleAbstractNode"
    // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:88:1: entryRuleAbstractNode : ruleAbstractNode EOF ;
    public final void entryRuleAbstractNode() throws RecognitionException {
        try {
            // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:89:1: ( ruleAbstractNode EOF )
            // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:90:1: ruleAbstractNode EOF
            {
             before(grammarAccess.getAbstractNodeRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleAbstractNode_in_entryRuleAbstractNode121);
            ruleAbstractNode();

            state._fsp--;

             after(grammarAccess.getAbstractNodeRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleAbstractNode128); 

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
    // $ANTLR end "entryRuleAbstractNode"


    // $ANTLR start "ruleAbstractNode"
    // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:97:1: ruleAbstractNode : ( ( rule__AbstractNode__Alternatives ) ) ;
    public final void ruleAbstractNode() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:101:2: ( ( ( rule__AbstractNode__Alternatives ) ) )
            // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:102:1: ( ( rule__AbstractNode__Alternatives ) )
            {
            // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:102:1: ( ( rule__AbstractNode__Alternatives ) )
            // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:103:1: ( rule__AbstractNode__Alternatives )
            {
             before(grammarAccess.getAbstractNodeAccess().getAlternatives()); 
            // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:104:1: ( rule__AbstractNode__Alternatives )
            // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:104:2: rule__AbstractNode__Alternatives
            {
            pushFollow(FollowSets000.FOLLOW_rule__AbstractNode__Alternatives_in_ruleAbstractNode154);
            rule__AbstractNode__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getAbstractNodeAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAbstractNode"


    // $ANTLR start "entryRuleTransition"
    // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:116:1: entryRuleTransition : ruleTransition EOF ;
    public final void entryRuleTransition() throws RecognitionException {
        try {
            // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:117:1: ( ruleTransition EOF )
            // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:118:1: ruleTransition EOF
            {
             before(grammarAccess.getTransitionRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleTransition_in_entryRuleTransition181);
            ruleTransition();

            state._fsp--;

             after(grammarAccess.getTransitionRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleTransition188); 

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
    // $ANTLR end "entryRuleTransition"


    // $ANTLR start "ruleTransition"
    // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:125:1: ruleTransition : ( ( rule__Transition__Group__0 ) ) ;
    public final void ruleTransition() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:129:2: ( ( ( rule__Transition__Group__0 ) ) )
            // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:130:1: ( ( rule__Transition__Group__0 ) )
            {
            // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:130:1: ( ( rule__Transition__Group__0 ) )
            // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:131:1: ( rule__Transition__Group__0 )
            {
             before(grammarAccess.getTransitionAccess().getGroup()); 
            // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:132:1: ( rule__Transition__Group__0 )
            // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:132:2: rule__Transition__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__Transition__Group__0_in_ruleTransition214);
            rule__Transition__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getTransitionAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleTransition"


    // $ANTLR start "entryRuleEString"
    // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:144:1: entryRuleEString : ruleEString EOF ;
    public final void entryRuleEString() throws RecognitionException {
        try {
            // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:145:1: ( ruleEString EOF )
            // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:146:1: ruleEString EOF
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
    // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:153:1: ruleEString : ( ( rule__EString__Alternatives ) ) ;
    public final void ruleEString() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:157:2: ( ( ( rule__EString__Alternatives ) ) )
            // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:158:1: ( ( rule__EString__Alternatives ) )
            {
            // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:158:1: ( ( rule__EString__Alternatives ) )
            // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:159:1: ( rule__EString__Alternatives )
            {
             before(grammarAccess.getEStringAccess().getAlternatives()); 
            // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:160:1: ( rule__EString__Alternatives )
            // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:160:2: rule__EString__Alternatives
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


    // $ANTLR start "entryRuleState"
    // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:172:1: entryRuleState : ruleState EOF ;
    public final void entryRuleState() throws RecognitionException {
        try {
            // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:173:1: ( ruleState EOF )
            // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:174:1: ruleState EOF
            {
             before(grammarAccess.getStateRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleState_in_entryRuleState301);
            ruleState();

            state._fsp--;

             after(grammarAccess.getStateRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleState308); 

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
    // $ANTLR end "entryRuleState"


    // $ANTLR start "ruleState"
    // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:181:1: ruleState : ( ( rule__State__Group__0 ) ) ;
    public final void ruleState() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:185:2: ( ( ( rule__State__Group__0 ) ) )
            // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:186:1: ( ( rule__State__Group__0 ) )
            {
            // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:186:1: ( ( rule__State__Group__0 ) )
            // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:187:1: ( rule__State__Group__0 )
            {
             before(grammarAccess.getStateAccess().getGroup()); 
            // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:188:1: ( rule__State__Group__0 )
            // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:188:2: rule__State__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__State__Group__0_in_ruleState334);
            rule__State__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getStateAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleState"


    // $ANTLR start "entryRuleInitial"
    // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:200:1: entryRuleInitial : ruleInitial EOF ;
    public final void entryRuleInitial() throws RecognitionException {
        try {
            // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:201:1: ( ruleInitial EOF )
            // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:202:1: ruleInitial EOF
            {
             before(grammarAccess.getInitialRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleInitial_in_entryRuleInitial361);
            ruleInitial();

            state._fsp--;

             after(grammarAccess.getInitialRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleInitial368); 

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
    // $ANTLR end "entryRuleInitial"


    // $ANTLR start "ruleInitial"
    // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:209:1: ruleInitial : ( ( rule__Initial__Group__0 ) ) ;
    public final void ruleInitial() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:213:2: ( ( ( rule__Initial__Group__0 ) ) )
            // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:214:1: ( ( rule__Initial__Group__0 ) )
            {
            // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:214:1: ( ( rule__Initial__Group__0 ) )
            // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:215:1: ( rule__Initial__Group__0 )
            {
             before(grammarAccess.getInitialAccess().getGroup()); 
            // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:216:1: ( rule__Initial__Group__0 )
            // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:216:2: rule__Initial__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__Initial__Group__0_in_ruleInitial394);
            rule__Initial__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getInitialAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleInitial"


    // $ANTLR start "entryRuleJunction"
    // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:228:1: entryRuleJunction : ruleJunction EOF ;
    public final void entryRuleJunction() throws RecognitionException {
        try {
            // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:229:1: ( ruleJunction EOF )
            // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:230:1: ruleJunction EOF
            {
             before(grammarAccess.getJunctionRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleJunction_in_entryRuleJunction421);
            ruleJunction();

            state._fsp--;

             after(grammarAccess.getJunctionRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleJunction428); 

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
    // $ANTLR end "entryRuleJunction"


    // $ANTLR start "ruleJunction"
    // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:237:1: ruleJunction : ( ( rule__Junction__Group__0 ) ) ;
    public final void ruleJunction() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:241:2: ( ( ( rule__Junction__Group__0 ) ) )
            // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:242:1: ( ( rule__Junction__Group__0 ) )
            {
            // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:242:1: ( ( rule__Junction__Group__0 ) )
            // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:243:1: ( rule__Junction__Group__0 )
            {
             before(grammarAccess.getJunctionAccess().getGroup()); 
            // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:244:1: ( rule__Junction__Group__0 )
            // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:244:2: rule__Junction__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__Junction__Group__0_in_ruleJunction454);
            rule__Junction__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getJunctionAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleJunction"


    // $ANTLR start "entryRuleFork"
    // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:256:1: entryRuleFork : ruleFork EOF ;
    public final void entryRuleFork() throws RecognitionException {
        try {
            // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:257:1: ( ruleFork EOF )
            // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:258:1: ruleFork EOF
            {
             before(grammarAccess.getForkRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleFork_in_entryRuleFork481);
            ruleFork();

            state._fsp--;

             after(grammarAccess.getForkRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleFork488); 

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
    // $ANTLR end "entryRuleFork"


    // $ANTLR start "ruleFork"
    // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:265:1: ruleFork : ( ( rule__Fork__Group__0 ) ) ;
    public final void ruleFork() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:269:2: ( ( ( rule__Fork__Group__0 ) ) )
            // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:270:1: ( ( rule__Fork__Group__0 ) )
            {
            // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:270:1: ( ( rule__Fork__Group__0 ) )
            // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:271:1: ( rule__Fork__Group__0 )
            {
             before(grammarAccess.getForkAccess().getGroup()); 
            // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:272:1: ( rule__Fork__Group__0 )
            // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:272:2: rule__Fork__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__Fork__Group__0_in_ruleFork514);
            rule__Fork__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getForkAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleFork"


    // $ANTLR start "entryRuleJoin"
    // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:284:1: entryRuleJoin : ruleJoin EOF ;
    public final void entryRuleJoin() throws RecognitionException {
        try {
            // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:285:1: ( ruleJoin EOF )
            // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:286:1: ruleJoin EOF
            {
             before(grammarAccess.getJoinRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleJoin_in_entryRuleJoin541);
            ruleJoin();

            state._fsp--;

             after(grammarAccess.getJoinRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleJoin548); 

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
    // $ANTLR end "entryRuleJoin"


    // $ANTLR start "ruleJoin"
    // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:293:1: ruleJoin : ( ( rule__Join__Group__0 ) ) ;
    public final void ruleJoin() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:297:2: ( ( ( rule__Join__Group__0 ) ) )
            // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:298:1: ( ( rule__Join__Group__0 ) )
            {
            // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:298:1: ( ( rule__Join__Group__0 ) )
            // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:299:1: ( rule__Join__Group__0 )
            {
             before(grammarAccess.getJoinAccess().getGroup()); 
            // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:300:1: ( rule__Join__Group__0 )
            // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:300:2: rule__Join__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__Join__Group__0_in_ruleJoin574);
            rule__Join__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getJoinAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleJoin"


    // $ANTLR start "entryRuleAny"
    // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:312:1: entryRuleAny : ruleAny EOF ;
    public final void entryRuleAny() throws RecognitionException {
        try {
            // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:313:1: ( ruleAny EOF )
            // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:314:1: ruleAny EOF
            {
             before(grammarAccess.getAnyRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleAny_in_entryRuleAny601);
            ruleAny();

            state._fsp--;

             after(grammarAccess.getAnyRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleAny608); 

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
    // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:321:1: ruleAny : ( ( rule__Any__Group__0 ) ) ;
    public final void ruleAny() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:325:2: ( ( ( rule__Any__Group__0 ) ) )
            // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:326:1: ( ( rule__Any__Group__0 ) )
            {
            // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:326:1: ( ( rule__Any__Group__0 ) )
            // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:327:1: ( rule__Any__Group__0 )
            {
             before(grammarAccess.getAnyAccess().getGroup()); 
            // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:328:1: ( rule__Any__Group__0 )
            // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:328:2: rule__Any__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__Any__Group__0_in_ruleAny634);
            rule__Any__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getAnyAccess().getGroup()); 

            }


            }

        }
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


    // $ANTLR start "entryRuleFinal"
    // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:340:1: entryRuleFinal : ruleFinal EOF ;
    public final void entryRuleFinal() throws RecognitionException {
        try {
            // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:341:1: ( ruleFinal EOF )
            // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:342:1: ruleFinal EOF
            {
             before(grammarAccess.getFinalRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleFinal_in_entryRuleFinal661);
            ruleFinal();

            state._fsp--;

             after(grammarAccess.getFinalRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleFinal668); 

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
    // $ANTLR end "entryRuleFinal"


    // $ANTLR start "ruleFinal"
    // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:349:1: ruleFinal : ( ( rule__Final__Group__0 ) ) ;
    public final void ruleFinal() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:353:2: ( ( ( rule__Final__Group__0 ) ) )
            // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:354:1: ( ( rule__Final__Group__0 ) )
            {
            // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:354:1: ( ( rule__Final__Group__0 ) )
            // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:355:1: ( rule__Final__Group__0 )
            {
             before(grammarAccess.getFinalAccess().getGroup()); 
            // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:356:1: ( rule__Final__Group__0 )
            // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:356:2: rule__Final__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__Final__Group__0_in_ruleFinal694);
            rule__Final__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getFinalAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleFinal"


    // $ANTLR start "rule__AbstractNode__Alternatives"
    // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:368:1: rule__AbstractNode__Alternatives : ( ( ruleState ) | ( ruleInitial ) | ( ruleJunction ) | ( ruleFork ) | ( ruleJoin ) | ( ruleAny ) | ( ruleFinal ) );
    public final void rule__AbstractNode__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:372:1: ( ( ruleState ) | ( ruleInitial ) | ( ruleJunction ) | ( ruleFork ) | ( ruleJoin ) | ( ruleAny ) | ( ruleFinal ) )
            int alt1=7;
            switch ( input.LA(1) ) {
            case 22:
                {
                alt1=1;
                }
                break;
            case 24:
                {
                alt1=2;
                }
                break;
            case 25:
                {
                alt1=3;
                }
                break;
            case 26:
                {
                alt1=4;
                }
                break;
            case 27:
                {
                alt1=5;
                }
                break;
            case 28:
                {
                alt1=6;
                }
                break;
            case 29:
                {
                alt1=7;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }

            switch (alt1) {
                case 1 :
                    // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:373:1: ( ruleState )
                    {
                    // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:373:1: ( ruleState )
                    // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:374:1: ruleState
                    {
                     before(grammarAccess.getAbstractNodeAccess().getStateParserRuleCall_0()); 
                    pushFollow(FollowSets000.FOLLOW_ruleState_in_rule__AbstractNode__Alternatives730);
                    ruleState();

                    state._fsp--;

                     after(grammarAccess.getAbstractNodeAccess().getStateParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:379:6: ( ruleInitial )
                    {
                    // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:379:6: ( ruleInitial )
                    // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:380:1: ruleInitial
                    {
                     before(grammarAccess.getAbstractNodeAccess().getInitialParserRuleCall_1()); 
                    pushFollow(FollowSets000.FOLLOW_ruleInitial_in_rule__AbstractNode__Alternatives747);
                    ruleInitial();

                    state._fsp--;

                     after(grammarAccess.getAbstractNodeAccess().getInitialParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:385:6: ( ruleJunction )
                    {
                    // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:385:6: ( ruleJunction )
                    // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:386:1: ruleJunction
                    {
                     before(grammarAccess.getAbstractNodeAccess().getJunctionParserRuleCall_2()); 
                    pushFollow(FollowSets000.FOLLOW_ruleJunction_in_rule__AbstractNode__Alternatives764);
                    ruleJunction();

                    state._fsp--;

                     after(grammarAccess.getAbstractNodeAccess().getJunctionParserRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:391:6: ( ruleFork )
                    {
                    // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:391:6: ( ruleFork )
                    // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:392:1: ruleFork
                    {
                     before(grammarAccess.getAbstractNodeAccess().getForkParserRuleCall_3()); 
                    pushFollow(FollowSets000.FOLLOW_ruleFork_in_rule__AbstractNode__Alternatives781);
                    ruleFork();

                    state._fsp--;

                     after(grammarAccess.getAbstractNodeAccess().getForkParserRuleCall_3()); 

                    }


                    }
                    break;
                case 5 :
                    // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:397:6: ( ruleJoin )
                    {
                    // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:397:6: ( ruleJoin )
                    // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:398:1: ruleJoin
                    {
                     before(grammarAccess.getAbstractNodeAccess().getJoinParserRuleCall_4()); 
                    pushFollow(FollowSets000.FOLLOW_ruleJoin_in_rule__AbstractNode__Alternatives798);
                    ruleJoin();

                    state._fsp--;

                     after(grammarAccess.getAbstractNodeAccess().getJoinParserRuleCall_4()); 

                    }


                    }
                    break;
                case 6 :
                    // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:403:6: ( ruleAny )
                    {
                    // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:403:6: ( ruleAny )
                    // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:404:1: ruleAny
                    {
                     before(grammarAccess.getAbstractNodeAccess().getAnyParserRuleCall_5()); 
                    pushFollow(FollowSets000.FOLLOW_ruleAny_in_rule__AbstractNode__Alternatives815);
                    ruleAny();

                    state._fsp--;

                     after(grammarAccess.getAbstractNodeAccess().getAnyParserRuleCall_5()); 

                    }


                    }
                    break;
                case 7 :
                    // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:409:6: ( ruleFinal )
                    {
                    // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:409:6: ( ruleFinal )
                    // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:410:1: ruleFinal
                    {
                     before(grammarAccess.getAbstractNodeAccess().getFinalParserRuleCall_6()); 
                    pushFollow(FollowSets000.FOLLOW_ruleFinal_in_rule__AbstractNode__Alternatives832);
                    ruleFinal();

                    state._fsp--;

                     after(grammarAccess.getAbstractNodeAccess().getFinalParserRuleCall_6()); 

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
    // $ANTLR end "rule__AbstractNode__Alternatives"


    // $ANTLR start "rule__EString__Alternatives"
    // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:420:1: rule__EString__Alternatives : ( ( RULE_STRING ) | ( RULE_ID ) );
    public final void rule__EString__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:424:1: ( ( RULE_STRING ) | ( RULE_ID ) )
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
                    // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:425:1: ( RULE_STRING )
                    {
                    // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:425:1: ( RULE_STRING )
                    // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:426:1: RULE_STRING
                    {
                     before(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 
                    match(input,RULE_STRING,FollowSets000.FOLLOW_RULE_STRING_in_rule__EString__Alternatives864); 
                     after(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:431:6: ( RULE_ID )
                    {
                    // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:431:6: ( RULE_ID )
                    // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:432:1: RULE_ID
                    {
                     before(grammarAccess.getEStringAccess().getIDTerminalRuleCall_1()); 
                    match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_rule__EString__Alternatives881); 
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


    // $ANTLR start "rule__StateMachine__Group__0"
    // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:444:1: rule__StateMachine__Group__0 : rule__StateMachine__Group__0__Impl rule__StateMachine__Group__1 ;
    public final void rule__StateMachine__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:448:1: ( rule__StateMachine__Group__0__Impl rule__StateMachine__Group__1 )
            // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:449:2: rule__StateMachine__Group__0__Impl rule__StateMachine__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__StateMachine__Group__0__Impl_in_rule__StateMachine__Group__0911);
            rule__StateMachine__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__StateMachine__Group__1_in_rule__StateMachine__Group__0914);
            rule__StateMachine__Group__1();

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
    // $ANTLR end "rule__StateMachine__Group__0"


    // $ANTLR start "rule__StateMachine__Group__0__Impl"
    // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:456:1: rule__StateMachine__Group__0__Impl : ( () ) ;
    public final void rule__StateMachine__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:460:1: ( ( () ) )
            // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:461:1: ( () )
            {
            // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:461:1: ( () )
            // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:462:1: ()
            {
             before(grammarAccess.getStateMachineAccess().getStateMachineAction_0()); 
            // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:463:1: ()
            // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:465:1: 
            {
            }

             after(grammarAccess.getStateMachineAccess().getStateMachineAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StateMachine__Group__0__Impl"


    // $ANTLR start "rule__StateMachine__Group__1"
    // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:475:1: rule__StateMachine__Group__1 : rule__StateMachine__Group__1__Impl rule__StateMachine__Group__2 ;
    public final void rule__StateMachine__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:479:1: ( rule__StateMachine__Group__1__Impl rule__StateMachine__Group__2 )
            // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:480:2: rule__StateMachine__Group__1__Impl rule__StateMachine__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__StateMachine__Group__1__Impl_in_rule__StateMachine__Group__1972);
            rule__StateMachine__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__StateMachine__Group__2_in_rule__StateMachine__Group__1975);
            rule__StateMachine__Group__2();

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
    // $ANTLR end "rule__StateMachine__Group__1"


    // $ANTLR start "rule__StateMachine__Group__1__Impl"
    // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:487:1: rule__StateMachine__Group__1__Impl : ( 'StateMachine' ) ;
    public final void rule__StateMachine__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:491:1: ( ( 'StateMachine' ) )
            // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:492:1: ( 'StateMachine' )
            {
            // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:492:1: ( 'StateMachine' )
            // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:493:1: 'StateMachine'
            {
             before(grammarAccess.getStateMachineAccess().getStateMachineKeyword_1()); 
            match(input,11,FollowSets000.FOLLOW_11_in_rule__StateMachine__Group__1__Impl1003); 
             after(grammarAccess.getStateMachineAccess().getStateMachineKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StateMachine__Group__1__Impl"


    // $ANTLR start "rule__StateMachine__Group__2"
    // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:506:1: rule__StateMachine__Group__2 : rule__StateMachine__Group__2__Impl rule__StateMachine__Group__3 ;
    public final void rule__StateMachine__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:510:1: ( rule__StateMachine__Group__2__Impl rule__StateMachine__Group__3 )
            // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:511:2: rule__StateMachine__Group__2__Impl rule__StateMachine__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__StateMachine__Group__2__Impl_in_rule__StateMachine__Group__21034);
            rule__StateMachine__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__StateMachine__Group__3_in_rule__StateMachine__Group__21037);
            rule__StateMachine__Group__3();

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
    // $ANTLR end "rule__StateMachine__Group__2"


    // $ANTLR start "rule__StateMachine__Group__2__Impl"
    // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:518:1: rule__StateMachine__Group__2__Impl : ( '{' ) ;
    public final void rule__StateMachine__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:522:1: ( ( '{' ) )
            // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:523:1: ( '{' )
            {
            // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:523:1: ( '{' )
            // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:524:1: '{'
            {
             before(grammarAccess.getStateMachineAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,12,FollowSets000.FOLLOW_12_in_rule__StateMachine__Group__2__Impl1065); 
             after(grammarAccess.getStateMachineAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StateMachine__Group__2__Impl"


    // $ANTLR start "rule__StateMachine__Group__3"
    // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:537:1: rule__StateMachine__Group__3 : rule__StateMachine__Group__3__Impl rule__StateMachine__Group__4 ;
    public final void rule__StateMachine__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:541:1: ( rule__StateMachine__Group__3__Impl rule__StateMachine__Group__4 )
            // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:542:2: rule__StateMachine__Group__3__Impl rule__StateMachine__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__StateMachine__Group__3__Impl_in_rule__StateMachine__Group__31096);
            rule__StateMachine__Group__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__StateMachine__Group__4_in_rule__StateMachine__Group__31099);
            rule__StateMachine__Group__4();

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
    // $ANTLR end "rule__StateMachine__Group__3"


    // $ANTLR start "rule__StateMachine__Group__3__Impl"
    // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:549:1: rule__StateMachine__Group__3__Impl : ( ( rule__StateMachine__Group_3__0 )? ) ;
    public final void rule__StateMachine__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:553:1: ( ( ( rule__StateMachine__Group_3__0 )? ) )
            // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:554:1: ( ( rule__StateMachine__Group_3__0 )? )
            {
            // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:554:1: ( ( rule__StateMachine__Group_3__0 )? )
            // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:555:1: ( rule__StateMachine__Group_3__0 )?
            {
             before(grammarAccess.getStateMachineAccess().getGroup_3()); 
            // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:556:1: ( rule__StateMachine__Group_3__0 )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==14) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:556:2: rule__StateMachine__Group_3__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__StateMachine__Group_3__0_in_rule__StateMachine__Group__3__Impl1126);
                    rule__StateMachine__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getStateMachineAccess().getGroup_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StateMachine__Group__3__Impl"


    // $ANTLR start "rule__StateMachine__Group__4"
    // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:566:1: rule__StateMachine__Group__4 : rule__StateMachine__Group__4__Impl rule__StateMachine__Group__5 ;
    public final void rule__StateMachine__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:570:1: ( rule__StateMachine__Group__4__Impl rule__StateMachine__Group__5 )
            // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:571:2: rule__StateMachine__Group__4__Impl rule__StateMachine__Group__5
            {
            pushFollow(FollowSets000.FOLLOW_rule__StateMachine__Group__4__Impl_in_rule__StateMachine__Group__41157);
            rule__StateMachine__Group__4__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__StateMachine__Group__5_in_rule__StateMachine__Group__41160);
            rule__StateMachine__Group__5();

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
    // $ANTLR end "rule__StateMachine__Group__4"


    // $ANTLR start "rule__StateMachine__Group__4__Impl"
    // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:578:1: rule__StateMachine__Group__4__Impl : ( ( rule__StateMachine__Group_4__0 )? ) ;
    public final void rule__StateMachine__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:582:1: ( ( ( rule__StateMachine__Group_4__0 )? ) )
            // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:583:1: ( ( rule__StateMachine__Group_4__0 )? )
            {
            // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:583:1: ( ( rule__StateMachine__Group_4__0 )? )
            // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:584:1: ( rule__StateMachine__Group_4__0 )?
            {
             before(grammarAccess.getStateMachineAccess().getGroup_4()); 
            // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:585:1: ( rule__StateMachine__Group_4__0 )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==16) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:585:2: rule__StateMachine__Group_4__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__StateMachine__Group_4__0_in_rule__StateMachine__Group__4__Impl1187);
                    rule__StateMachine__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getStateMachineAccess().getGroup_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StateMachine__Group__4__Impl"


    // $ANTLR start "rule__StateMachine__Group__5"
    // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:595:1: rule__StateMachine__Group__5 : rule__StateMachine__Group__5__Impl rule__StateMachine__Group__6 ;
    public final void rule__StateMachine__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:599:1: ( rule__StateMachine__Group__5__Impl rule__StateMachine__Group__6 )
            // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:600:2: rule__StateMachine__Group__5__Impl rule__StateMachine__Group__6
            {
            pushFollow(FollowSets000.FOLLOW_rule__StateMachine__Group__5__Impl_in_rule__StateMachine__Group__51218);
            rule__StateMachine__Group__5__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__StateMachine__Group__6_in_rule__StateMachine__Group__51221);
            rule__StateMachine__Group__6();

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
    // $ANTLR end "rule__StateMachine__Group__5"


    // $ANTLR start "rule__StateMachine__Group__5__Impl"
    // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:607:1: rule__StateMachine__Group__5__Impl : ( ( rule__StateMachine__Group_5__0 )? ) ;
    public final void rule__StateMachine__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:611:1: ( ( ( rule__StateMachine__Group_5__0 )? ) )
            // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:612:1: ( ( rule__StateMachine__Group_5__0 )? )
            {
            // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:612:1: ( ( rule__StateMachine__Group_5__0 )? )
            // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:613:1: ( rule__StateMachine__Group_5__0 )?
            {
             before(grammarAccess.getStateMachineAccess().getGroup_5()); 
            // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:614:1: ( rule__StateMachine__Group_5__0 )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==17) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:614:2: rule__StateMachine__Group_5__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__StateMachine__Group_5__0_in_rule__StateMachine__Group__5__Impl1248);
                    rule__StateMachine__Group_5__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getStateMachineAccess().getGroup_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StateMachine__Group__5__Impl"


    // $ANTLR start "rule__StateMachine__Group__6"
    // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:624:1: rule__StateMachine__Group__6 : rule__StateMachine__Group__6__Impl ;
    public final void rule__StateMachine__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:628:1: ( rule__StateMachine__Group__6__Impl )
            // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:629:2: rule__StateMachine__Group__6__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__StateMachine__Group__6__Impl_in_rule__StateMachine__Group__61279);
            rule__StateMachine__Group__6__Impl();

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
    // $ANTLR end "rule__StateMachine__Group__6"


    // $ANTLR start "rule__StateMachine__Group__6__Impl"
    // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:635:1: rule__StateMachine__Group__6__Impl : ( '}' ) ;
    public final void rule__StateMachine__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:639:1: ( ( '}' ) )
            // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:640:1: ( '}' )
            {
            // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:640:1: ( '}' )
            // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:641:1: '}'
            {
             before(grammarAccess.getStateMachineAccess().getRightCurlyBracketKeyword_6()); 
            match(input,13,FollowSets000.FOLLOW_13_in_rule__StateMachine__Group__6__Impl1307); 
             after(grammarAccess.getStateMachineAccess().getRightCurlyBracketKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StateMachine__Group__6__Impl"


    // $ANTLR start "rule__StateMachine__Group_3__0"
    // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:668:1: rule__StateMachine__Group_3__0 : rule__StateMachine__Group_3__0__Impl rule__StateMachine__Group_3__1 ;
    public final void rule__StateMachine__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:672:1: ( rule__StateMachine__Group_3__0__Impl rule__StateMachine__Group_3__1 )
            // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:673:2: rule__StateMachine__Group_3__0__Impl rule__StateMachine__Group_3__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__StateMachine__Group_3__0__Impl_in_rule__StateMachine__Group_3__01352);
            rule__StateMachine__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__StateMachine__Group_3__1_in_rule__StateMachine__Group_3__01355);
            rule__StateMachine__Group_3__1();

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
    // $ANTLR end "rule__StateMachine__Group_3__0"


    // $ANTLR start "rule__StateMachine__Group_3__0__Impl"
    // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:680:1: rule__StateMachine__Group_3__0__Impl : ( 'Nodes' ) ;
    public final void rule__StateMachine__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:684:1: ( ( 'Nodes' ) )
            // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:685:1: ( 'Nodes' )
            {
            // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:685:1: ( 'Nodes' )
            // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:686:1: 'Nodes'
            {
             before(grammarAccess.getStateMachineAccess().getNodesKeyword_3_0()); 
            match(input,14,FollowSets000.FOLLOW_14_in_rule__StateMachine__Group_3__0__Impl1383); 
             after(grammarAccess.getStateMachineAccess().getNodesKeyword_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StateMachine__Group_3__0__Impl"


    // $ANTLR start "rule__StateMachine__Group_3__1"
    // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:699:1: rule__StateMachine__Group_3__1 : rule__StateMachine__Group_3__1__Impl rule__StateMachine__Group_3__2 ;
    public final void rule__StateMachine__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:703:1: ( rule__StateMachine__Group_3__1__Impl rule__StateMachine__Group_3__2 )
            // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:704:2: rule__StateMachine__Group_3__1__Impl rule__StateMachine__Group_3__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__StateMachine__Group_3__1__Impl_in_rule__StateMachine__Group_3__11414);
            rule__StateMachine__Group_3__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__StateMachine__Group_3__2_in_rule__StateMachine__Group_3__11417);
            rule__StateMachine__Group_3__2();

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
    // $ANTLR end "rule__StateMachine__Group_3__1"


    // $ANTLR start "rule__StateMachine__Group_3__1__Impl"
    // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:711:1: rule__StateMachine__Group_3__1__Impl : ( '{' ) ;
    public final void rule__StateMachine__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:715:1: ( ( '{' ) )
            // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:716:1: ( '{' )
            {
            // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:716:1: ( '{' )
            // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:717:1: '{'
            {
             before(grammarAccess.getStateMachineAccess().getLeftCurlyBracketKeyword_3_1()); 
            match(input,12,FollowSets000.FOLLOW_12_in_rule__StateMachine__Group_3__1__Impl1445); 
             after(grammarAccess.getStateMachineAccess().getLeftCurlyBracketKeyword_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StateMachine__Group_3__1__Impl"


    // $ANTLR start "rule__StateMachine__Group_3__2"
    // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:730:1: rule__StateMachine__Group_3__2 : rule__StateMachine__Group_3__2__Impl rule__StateMachine__Group_3__3 ;
    public final void rule__StateMachine__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:734:1: ( rule__StateMachine__Group_3__2__Impl rule__StateMachine__Group_3__3 )
            // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:735:2: rule__StateMachine__Group_3__2__Impl rule__StateMachine__Group_3__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__StateMachine__Group_3__2__Impl_in_rule__StateMachine__Group_3__21476);
            rule__StateMachine__Group_3__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__StateMachine__Group_3__3_in_rule__StateMachine__Group_3__21479);
            rule__StateMachine__Group_3__3();

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
    // $ANTLR end "rule__StateMachine__Group_3__2"


    // $ANTLR start "rule__StateMachine__Group_3__2__Impl"
    // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:742:1: rule__StateMachine__Group_3__2__Impl : ( ( rule__StateMachine__NodesAssignment_3_2 ) ) ;
    public final void rule__StateMachine__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:746:1: ( ( ( rule__StateMachine__NodesAssignment_3_2 ) ) )
            // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:747:1: ( ( rule__StateMachine__NodesAssignment_3_2 ) )
            {
            // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:747:1: ( ( rule__StateMachine__NodesAssignment_3_2 ) )
            // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:748:1: ( rule__StateMachine__NodesAssignment_3_2 )
            {
             before(grammarAccess.getStateMachineAccess().getNodesAssignment_3_2()); 
            // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:749:1: ( rule__StateMachine__NodesAssignment_3_2 )
            // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:749:2: rule__StateMachine__NodesAssignment_3_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__StateMachine__NodesAssignment_3_2_in_rule__StateMachine__Group_3__2__Impl1506);
            rule__StateMachine__NodesAssignment_3_2();

            state._fsp--;


            }

             after(grammarAccess.getStateMachineAccess().getNodesAssignment_3_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StateMachine__Group_3__2__Impl"


    // $ANTLR start "rule__StateMachine__Group_3__3"
    // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:759:1: rule__StateMachine__Group_3__3 : rule__StateMachine__Group_3__3__Impl rule__StateMachine__Group_3__4 ;
    public final void rule__StateMachine__Group_3__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:763:1: ( rule__StateMachine__Group_3__3__Impl rule__StateMachine__Group_3__4 )
            // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:764:2: rule__StateMachine__Group_3__3__Impl rule__StateMachine__Group_3__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__StateMachine__Group_3__3__Impl_in_rule__StateMachine__Group_3__31536);
            rule__StateMachine__Group_3__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__StateMachine__Group_3__4_in_rule__StateMachine__Group_3__31539);
            rule__StateMachine__Group_3__4();

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
    // $ANTLR end "rule__StateMachine__Group_3__3"


    // $ANTLR start "rule__StateMachine__Group_3__3__Impl"
    // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:771:1: rule__StateMachine__Group_3__3__Impl : ( ( rule__StateMachine__Group_3_3__0 )* ) ;
    public final void rule__StateMachine__Group_3__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:775:1: ( ( ( rule__StateMachine__Group_3_3__0 )* ) )
            // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:776:1: ( ( rule__StateMachine__Group_3_3__0 )* )
            {
            // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:776:1: ( ( rule__StateMachine__Group_3_3__0 )* )
            // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:777:1: ( rule__StateMachine__Group_3_3__0 )*
            {
             before(grammarAccess.getStateMachineAccess().getGroup_3_3()); 
            // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:778:1: ( rule__StateMachine__Group_3_3__0 )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==15) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:778:2: rule__StateMachine__Group_3_3__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__StateMachine__Group_3_3__0_in_rule__StateMachine__Group_3__3__Impl1566);
            	    rule__StateMachine__Group_3_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);

             after(grammarAccess.getStateMachineAccess().getGroup_3_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StateMachine__Group_3__3__Impl"


    // $ANTLR start "rule__StateMachine__Group_3__4"
    // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:788:1: rule__StateMachine__Group_3__4 : rule__StateMachine__Group_3__4__Impl ;
    public final void rule__StateMachine__Group_3__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:792:1: ( rule__StateMachine__Group_3__4__Impl )
            // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:793:2: rule__StateMachine__Group_3__4__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__StateMachine__Group_3__4__Impl_in_rule__StateMachine__Group_3__41597);
            rule__StateMachine__Group_3__4__Impl();

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
    // $ANTLR end "rule__StateMachine__Group_3__4"


    // $ANTLR start "rule__StateMachine__Group_3__4__Impl"
    // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:799:1: rule__StateMachine__Group_3__4__Impl : ( '}' ) ;
    public final void rule__StateMachine__Group_3__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:803:1: ( ( '}' ) )
            // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:804:1: ( '}' )
            {
            // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:804:1: ( '}' )
            // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:805:1: '}'
            {
             before(grammarAccess.getStateMachineAccess().getRightCurlyBracketKeyword_3_4()); 
            match(input,13,FollowSets000.FOLLOW_13_in_rule__StateMachine__Group_3__4__Impl1625); 
             after(grammarAccess.getStateMachineAccess().getRightCurlyBracketKeyword_3_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StateMachine__Group_3__4__Impl"


    // $ANTLR start "rule__StateMachine__Group_3_3__0"
    // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:828:1: rule__StateMachine__Group_3_3__0 : rule__StateMachine__Group_3_3__0__Impl rule__StateMachine__Group_3_3__1 ;
    public final void rule__StateMachine__Group_3_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:832:1: ( rule__StateMachine__Group_3_3__0__Impl rule__StateMachine__Group_3_3__1 )
            // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:833:2: rule__StateMachine__Group_3_3__0__Impl rule__StateMachine__Group_3_3__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__StateMachine__Group_3_3__0__Impl_in_rule__StateMachine__Group_3_3__01666);
            rule__StateMachine__Group_3_3__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__StateMachine__Group_3_3__1_in_rule__StateMachine__Group_3_3__01669);
            rule__StateMachine__Group_3_3__1();

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
    // $ANTLR end "rule__StateMachine__Group_3_3__0"


    // $ANTLR start "rule__StateMachine__Group_3_3__0__Impl"
    // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:840:1: rule__StateMachine__Group_3_3__0__Impl : ( ',' ) ;
    public final void rule__StateMachine__Group_3_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:844:1: ( ( ',' ) )
            // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:845:1: ( ',' )
            {
            // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:845:1: ( ',' )
            // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:846:1: ','
            {
             before(grammarAccess.getStateMachineAccess().getCommaKeyword_3_3_0()); 
            match(input,15,FollowSets000.FOLLOW_15_in_rule__StateMachine__Group_3_3__0__Impl1697); 
             after(grammarAccess.getStateMachineAccess().getCommaKeyword_3_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StateMachine__Group_3_3__0__Impl"


    // $ANTLR start "rule__StateMachine__Group_3_3__1"
    // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:859:1: rule__StateMachine__Group_3_3__1 : rule__StateMachine__Group_3_3__1__Impl ;
    public final void rule__StateMachine__Group_3_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:863:1: ( rule__StateMachine__Group_3_3__1__Impl )
            // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:864:2: rule__StateMachine__Group_3_3__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__StateMachine__Group_3_3__1__Impl_in_rule__StateMachine__Group_3_3__11728);
            rule__StateMachine__Group_3_3__1__Impl();

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
    // $ANTLR end "rule__StateMachine__Group_3_3__1"


    // $ANTLR start "rule__StateMachine__Group_3_3__1__Impl"
    // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:870:1: rule__StateMachine__Group_3_3__1__Impl : ( ( rule__StateMachine__NodesAssignment_3_3_1 ) ) ;
    public final void rule__StateMachine__Group_3_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:874:1: ( ( ( rule__StateMachine__NodesAssignment_3_3_1 ) ) )
            // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:875:1: ( ( rule__StateMachine__NodesAssignment_3_3_1 ) )
            {
            // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:875:1: ( ( rule__StateMachine__NodesAssignment_3_3_1 ) )
            // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:876:1: ( rule__StateMachine__NodesAssignment_3_3_1 )
            {
             before(grammarAccess.getStateMachineAccess().getNodesAssignment_3_3_1()); 
            // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:877:1: ( rule__StateMachine__NodesAssignment_3_3_1 )
            // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:877:2: rule__StateMachine__NodesAssignment_3_3_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__StateMachine__NodesAssignment_3_3_1_in_rule__StateMachine__Group_3_3__1__Impl1755);
            rule__StateMachine__NodesAssignment_3_3_1();

            state._fsp--;


            }

             after(grammarAccess.getStateMachineAccess().getNodesAssignment_3_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StateMachine__Group_3_3__1__Impl"


    // $ANTLR start "rule__StateMachine__Group_4__0"
    // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:891:1: rule__StateMachine__Group_4__0 : rule__StateMachine__Group_4__0__Impl rule__StateMachine__Group_4__1 ;
    public final void rule__StateMachine__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:895:1: ( rule__StateMachine__Group_4__0__Impl rule__StateMachine__Group_4__1 )
            // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:896:2: rule__StateMachine__Group_4__0__Impl rule__StateMachine__Group_4__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__StateMachine__Group_4__0__Impl_in_rule__StateMachine__Group_4__01789);
            rule__StateMachine__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__StateMachine__Group_4__1_in_rule__StateMachine__Group_4__01792);
            rule__StateMachine__Group_4__1();

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
    // $ANTLR end "rule__StateMachine__Group_4__0"


    // $ANTLR start "rule__StateMachine__Group_4__0__Impl"
    // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:903:1: rule__StateMachine__Group_4__0__Impl : ( 'Transitions' ) ;
    public final void rule__StateMachine__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:907:1: ( ( 'Transitions' ) )
            // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:908:1: ( 'Transitions' )
            {
            // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:908:1: ( 'Transitions' )
            // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:909:1: 'Transitions'
            {
             before(grammarAccess.getStateMachineAccess().getTransitionsKeyword_4_0()); 
            match(input,16,FollowSets000.FOLLOW_16_in_rule__StateMachine__Group_4__0__Impl1820); 
             after(grammarAccess.getStateMachineAccess().getTransitionsKeyword_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StateMachine__Group_4__0__Impl"


    // $ANTLR start "rule__StateMachine__Group_4__1"
    // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:922:1: rule__StateMachine__Group_4__1 : rule__StateMachine__Group_4__1__Impl rule__StateMachine__Group_4__2 ;
    public final void rule__StateMachine__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:926:1: ( rule__StateMachine__Group_4__1__Impl rule__StateMachine__Group_4__2 )
            // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:927:2: rule__StateMachine__Group_4__1__Impl rule__StateMachine__Group_4__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__StateMachine__Group_4__1__Impl_in_rule__StateMachine__Group_4__11851);
            rule__StateMachine__Group_4__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__StateMachine__Group_4__2_in_rule__StateMachine__Group_4__11854);
            rule__StateMachine__Group_4__2();

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
    // $ANTLR end "rule__StateMachine__Group_4__1"


    // $ANTLR start "rule__StateMachine__Group_4__1__Impl"
    // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:934:1: rule__StateMachine__Group_4__1__Impl : ( '{' ) ;
    public final void rule__StateMachine__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:938:1: ( ( '{' ) )
            // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:939:1: ( '{' )
            {
            // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:939:1: ( '{' )
            // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:940:1: '{'
            {
             before(grammarAccess.getStateMachineAccess().getLeftCurlyBracketKeyword_4_1()); 
            match(input,12,FollowSets000.FOLLOW_12_in_rule__StateMachine__Group_4__1__Impl1882); 
             after(grammarAccess.getStateMachineAccess().getLeftCurlyBracketKeyword_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StateMachine__Group_4__1__Impl"


    // $ANTLR start "rule__StateMachine__Group_4__2"
    // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:953:1: rule__StateMachine__Group_4__2 : rule__StateMachine__Group_4__2__Impl rule__StateMachine__Group_4__3 ;
    public final void rule__StateMachine__Group_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:957:1: ( rule__StateMachine__Group_4__2__Impl rule__StateMachine__Group_4__3 )
            // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:958:2: rule__StateMachine__Group_4__2__Impl rule__StateMachine__Group_4__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__StateMachine__Group_4__2__Impl_in_rule__StateMachine__Group_4__21913);
            rule__StateMachine__Group_4__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__StateMachine__Group_4__3_in_rule__StateMachine__Group_4__21916);
            rule__StateMachine__Group_4__3();

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
    // $ANTLR end "rule__StateMachine__Group_4__2"


    // $ANTLR start "rule__StateMachine__Group_4__2__Impl"
    // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:965:1: rule__StateMachine__Group_4__2__Impl : ( ( rule__StateMachine__TransitionsAssignment_4_2 ) ) ;
    public final void rule__StateMachine__Group_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:969:1: ( ( ( rule__StateMachine__TransitionsAssignment_4_2 ) ) )
            // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:970:1: ( ( rule__StateMachine__TransitionsAssignment_4_2 ) )
            {
            // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:970:1: ( ( rule__StateMachine__TransitionsAssignment_4_2 ) )
            // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:971:1: ( rule__StateMachine__TransitionsAssignment_4_2 )
            {
             before(grammarAccess.getStateMachineAccess().getTransitionsAssignment_4_2()); 
            // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:972:1: ( rule__StateMachine__TransitionsAssignment_4_2 )
            // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:972:2: rule__StateMachine__TransitionsAssignment_4_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__StateMachine__TransitionsAssignment_4_2_in_rule__StateMachine__Group_4__2__Impl1943);
            rule__StateMachine__TransitionsAssignment_4_2();

            state._fsp--;


            }

             after(grammarAccess.getStateMachineAccess().getTransitionsAssignment_4_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StateMachine__Group_4__2__Impl"


    // $ANTLR start "rule__StateMachine__Group_4__3"
    // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:982:1: rule__StateMachine__Group_4__3 : rule__StateMachine__Group_4__3__Impl rule__StateMachine__Group_4__4 ;
    public final void rule__StateMachine__Group_4__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:986:1: ( rule__StateMachine__Group_4__3__Impl rule__StateMachine__Group_4__4 )
            // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:987:2: rule__StateMachine__Group_4__3__Impl rule__StateMachine__Group_4__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__StateMachine__Group_4__3__Impl_in_rule__StateMachine__Group_4__31973);
            rule__StateMachine__Group_4__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__StateMachine__Group_4__4_in_rule__StateMachine__Group_4__31976);
            rule__StateMachine__Group_4__4();

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
    // $ANTLR end "rule__StateMachine__Group_4__3"


    // $ANTLR start "rule__StateMachine__Group_4__3__Impl"
    // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:994:1: rule__StateMachine__Group_4__3__Impl : ( ( rule__StateMachine__Group_4_3__0 )* ) ;
    public final void rule__StateMachine__Group_4__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:998:1: ( ( ( rule__StateMachine__Group_4_3__0 )* ) )
            // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:999:1: ( ( rule__StateMachine__Group_4_3__0 )* )
            {
            // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:999:1: ( ( rule__StateMachine__Group_4_3__0 )* )
            // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:1000:1: ( rule__StateMachine__Group_4_3__0 )*
            {
             before(grammarAccess.getStateMachineAccess().getGroup_4_3()); 
            // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:1001:1: ( rule__StateMachine__Group_4_3__0 )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==15) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:1001:2: rule__StateMachine__Group_4_3__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__StateMachine__Group_4_3__0_in_rule__StateMachine__Group_4__3__Impl2003);
            	    rule__StateMachine__Group_4_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

             after(grammarAccess.getStateMachineAccess().getGroup_4_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StateMachine__Group_4__3__Impl"


    // $ANTLR start "rule__StateMachine__Group_4__4"
    // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:1011:1: rule__StateMachine__Group_4__4 : rule__StateMachine__Group_4__4__Impl ;
    public final void rule__StateMachine__Group_4__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:1015:1: ( rule__StateMachine__Group_4__4__Impl )
            // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:1016:2: rule__StateMachine__Group_4__4__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__StateMachine__Group_4__4__Impl_in_rule__StateMachine__Group_4__42034);
            rule__StateMachine__Group_4__4__Impl();

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
    // $ANTLR end "rule__StateMachine__Group_4__4"


    // $ANTLR start "rule__StateMachine__Group_4__4__Impl"
    // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:1022:1: rule__StateMachine__Group_4__4__Impl : ( '}' ) ;
    public final void rule__StateMachine__Group_4__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:1026:1: ( ( '}' ) )
            // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:1027:1: ( '}' )
            {
            // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:1027:1: ( '}' )
            // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:1028:1: '}'
            {
             before(grammarAccess.getStateMachineAccess().getRightCurlyBracketKeyword_4_4()); 
            match(input,13,FollowSets000.FOLLOW_13_in_rule__StateMachine__Group_4__4__Impl2062); 
             after(grammarAccess.getStateMachineAccess().getRightCurlyBracketKeyword_4_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StateMachine__Group_4__4__Impl"


    // $ANTLR start "rule__StateMachine__Group_4_3__0"
    // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:1051:1: rule__StateMachine__Group_4_3__0 : rule__StateMachine__Group_4_3__0__Impl rule__StateMachine__Group_4_3__1 ;
    public final void rule__StateMachine__Group_4_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:1055:1: ( rule__StateMachine__Group_4_3__0__Impl rule__StateMachine__Group_4_3__1 )
            // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:1056:2: rule__StateMachine__Group_4_3__0__Impl rule__StateMachine__Group_4_3__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__StateMachine__Group_4_3__0__Impl_in_rule__StateMachine__Group_4_3__02103);
            rule__StateMachine__Group_4_3__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__StateMachine__Group_4_3__1_in_rule__StateMachine__Group_4_3__02106);
            rule__StateMachine__Group_4_3__1();

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
    // $ANTLR end "rule__StateMachine__Group_4_3__0"


    // $ANTLR start "rule__StateMachine__Group_4_3__0__Impl"
    // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:1063:1: rule__StateMachine__Group_4_3__0__Impl : ( ',' ) ;
    public final void rule__StateMachine__Group_4_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:1067:1: ( ( ',' ) )
            // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:1068:1: ( ',' )
            {
            // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:1068:1: ( ',' )
            // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:1069:1: ','
            {
             before(grammarAccess.getStateMachineAccess().getCommaKeyword_4_3_0()); 
            match(input,15,FollowSets000.FOLLOW_15_in_rule__StateMachine__Group_4_3__0__Impl2134); 
             after(grammarAccess.getStateMachineAccess().getCommaKeyword_4_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StateMachine__Group_4_3__0__Impl"


    // $ANTLR start "rule__StateMachine__Group_4_3__1"
    // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:1082:1: rule__StateMachine__Group_4_3__1 : rule__StateMachine__Group_4_3__1__Impl ;
    public final void rule__StateMachine__Group_4_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:1086:1: ( rule__StateMachine__Group_4_3__1__Impl )
            // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:1087:2: rule__StateMachine__Group_4_3__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__StateMachine__Group_4_3__1__Impl_in_rule__StateMachine__Group_4_3__12165);
            rule__StateMachine__Group_4_3__1__Impl();

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
    // $ANTLR end "rule__StateMachine__Group_4_3__1"


    // $ANTLR start "rule__StateMachine__Group_4_3__1__Impl"
    // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:1093:1: rule__StateMachine__Group_4_3__1__Impl : ( ( rule__StateMachine__TransitionsAssignment_4_3_1 ) ) ;
    public final void rule__StateMachine__Group_4_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:1097:1: ( ( ( rule__StateMachine__TransitionsAssignment_4_3_1 ) ) )
            // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:1098:1: ( ( rule__StateMachine__TransitionsAssignment_4_3_1 ) )
            {
            // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:1098:1: ( ( rule__StateMachine__TransitionsAssignment_4_3_1 ) )
            // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:1099:1: ( rule__StateMachine__TransitionsAssignment_4_3_1 )
            {
             before(grammarAccess.getStateMachineAccess().getTransitionsAssignment_4_3_1()); 
            // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:1100:1: ( rule__StateMachine__TransitionsAssignment_4_3_1 )
            // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:1100:2: rule__StateMachine__TransitionsAssignment_4_3_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__StateMachine__TransitionsAssignment_4_3_1_in_rule__StateMachine__Group_4_3__1__Impl2192);
            rule__StateMachine__TransitionsAssignment_4_3_1();

            state._fsp--;


            }

             after(grammarAccess.getStateMachineAccess().getTransitionsAssignment_4_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StateMachine__Group_4_3__1__Impl"


    // $ANTLR start "rule__StateMachine__Group_5__0"
    // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:1114:1: rule__StateMachine__Group_5__0 : rule__StateMachine__Group_5__0__Impl rule__StateMachine__Group_5__1 ;
    public final void rule__StateMachine__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:1118:1: ( rule__StateMachine__Group_5__0__Impl rule__StateMachine__Group_5__1 )
            // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:1119:2: rule__StateMachine__Group_5__0__Impl rule__StateMachine__Group_5__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__StateMachine__Group_5__0__Impl_in_rule__StateMachine__Group_5__02226);
            rule__StateMachine__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__StateMachine__Group_5__1_in_rule__StateMachine__Group_5__02229);
            rule__StateMachine__Group_5__1();

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
    // $ANTLR end "rule__StateMachine__Group_5__0"


    // $ANTLR start "rule__StateMachine__Group_5__0__Impl"
    // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:1126:1: rule__StateMachine__Group_5__0__Impl : ( 'StateMachines' ) ;
    public final void rule__StateMachine__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:1130:1: ( ( 'StateMachines' ) )
            // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:1131:1: ( 'StateMachines' )
            {
            // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:1131:1: ( 'StateMachines' )
            // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:1132:1: 'StateMachines'
            {
             before(grammarAccess.getStateMachineAccess().getStateMachinesKeyword_5_0()); 
            match(input,17,FollowSets000.FOLLOW_17_in_rule__StateMachine__Group_5__0__Impl2257); 
             after(grammarAccess.getStateMachineAccess().getStateMachinesKeyword_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StateMachine__Group_5__0__Impl"


    // $ANTLR start "rule__StateMachine__Group_5__1"
    // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:1145:1: rule__StateMachine__Group_5__1 : rule__StateMachine__Group_5__1__Impl rule__StateMachine__Group_5__2 ;
    public final void rule__StateMachine__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:1149:1: ( rule__StateMachine__Group_5__1__Impl rule__StateMachine__Group_5__2 )
            // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:1150:2: rule__StateMachine__Group_5__1__Impl rule__StateMachine__Group_5__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__StateMachine__Group_5__1__Impl_in_rule__StateMachine__Group_5__12288);
            rule__StateMachine__Group_5__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__StateMachine__Group_5__2_in_rule__StateMachine__Group_5__12291);
            rule__StateMachine__Group_5__2();

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
    // $ANTLR end "rule__StateMachine__Group_5__1"


    // $ANTLR start "rule__StateMachine__Group_5__1__Impl"
    // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:1157:1: rule__StateMachine__Group_5__1__Impl : ( '{' ) ;
    public final void rule__StateMachine__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:1161:1: ( ( '{' ) )
            // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:1162:1: ( '{' )
            {
            // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:1162:1: ( '{' )
            // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:1163:1: '{'
            {
             before(grammarAccess.getStateMachineAccess().getLeftCurlyBracketKeyword_5_1()); 
            match(input,12,FollowSets000.FOLLOW_12_in_rule__StateMachine__Group_5__1__Impl2319); 
             after(grammarAccess.getStateMachineAccess().getLeftCurlyBracketKeyword_5_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StateMachine__Group_5__1__Impl"


    // $ANTLR start "rule__StateMachine__Group_5__2"
    // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:1176:1: rule__StateMachine__Group_5__2 : rule__StateMachine__Group_5__2__Impl rule__StateMachine__Group_5__3 ;
    public final void rule__StateMachine__Group_5__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:1180:1: ( rule__StateMachine__Group_5__2__Impl rule__StateMachine__Group_5__3 )
            // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:1181:2: rule__StateMachine__Group_5__2__Impl rule__StateMachine__Group_5__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__StateMachine__Group_5__2__Impl_in_rule__StateMachine__Group_5__22350);
            rule__StateMachine__Group_5__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__StateMachine__Group_5__3_in_rule__StateMachine__Group_5__22353);
            rule__StateMachine__Group_5__3();

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
    // $ANTLR end "rule__StateMachine__Group_5__2"


    // $ANTLR start "rule__StateMachine__Group_5__2__Impl"
    // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:1188:1: rule__StateMachine__Group_5__2__Impl : ( ( rule__StateMachine__StateMachinesAssignment_5_2 ) ) ;
    public final void rule__StateMachine__Group_5__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:1192:1: ( ( ( rule__StateMachine__StateMachinesAssignment_5_2 ) ) )
            // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:1193:1: ( ( rule__StateMachine__StateMachinesAssignment_5_2 ) )
            {
            // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:1193:1: ( ( rule__StateMachine__StateMachinesAssignment_5_2 ) )
            // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:1194:1: ( rule__StateMachine__StateMachinesAssignment_5_2 )
            {
             before(grammarAccess.getStateMachineAccess().getStateMachinesAssignment_5_2()); 
            // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:1195:1: ( rule__StateMachine__StateMachinesAssignment_5_2 )
            // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:1195:2: rule__StateMachine__StateMachinesAssignment_5_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__StateMachine__StateMachinesAssignment_5_2_in_rule__StateMachine__Group_5__2__Impl2380);
            rule__StateMachine__StateMachinesAssignment_5_2();

            state._fsp--;


            }

             after(grammarAccess.getStateMachineAccess().getStateMachinesAssignment_5_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StateMachine__Group_5__2__Impl"


    // $ANTLR start "rule__StateMachine__Group_5__3"
    // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:1205:1: rule__StateMachine__Group_5__3 : rule__StateMachine__Group_5__3__Impl rule__StateMachine__Group_5__4 ;
    public final void rule__StateMachine__Group_5__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:1209:1: ( rule__StateMachine__Group_5__3__Impl rule__StateMachine__Group_5__4 )
            // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:1210:2: rule__StateMachine__Group_5__3__Impl rule__StateMachine__Group_5__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__StateMachine__Group_5__3__Impl_in_rule__StateMachine__Group_5__32410);
            rule__StateMachine__Group_5__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__StateMachine__Group_5__4_in_rule__StateMachine__Group_5__32413);
            rule__StateMachine__Group_5__4();

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
    // $ANTLR end "rule__StateMachine__Group_5__3"


    // $ANTLR start "rule__StateMachine__Group_5__3__Impl"
    // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:1217:1: rule__StateMachine__Group_5__3__Impl : ( ( rule__StateMachine__Group_5_3__0 )* ) ;
    public final void rule__StateMachine__Group_5__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:1221:1: ( ( ( rule__StateMachine__Group_5_3__0 )* ) )
            // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:1222:1: ( ( rule__StateMachine__Group_5_3__0 )* )
            {
            // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:1222:1: ( ( rule__StateMachine__Group_5_3__0 )* )
            // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:1223:1: ( rule__StateMachine__Group_5_3__0 )*
            {
             before(grammarAccess.getStateMachineAccess().getGroup_5_3()); 
            // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:1224:1: ( rule__StateMachine__Group_5_3__0 )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==15) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:1224:2: rule__StateMachine__Group_5_3__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__StateMachine__Group_5_3__0_in_rule__StateMachine__Group_5__3__Impl2440);
            	    rule__StateMachine__Group_5_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

             after(grammarAccess.getStateMachineAccess().getGroup_5_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StateMachine__Group_5__3__Impl"


    // $ANTLR start "rule__StateMachine__Group_5__4"
    // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:1234:1: rule__StateMachine__Group_5__4 : rule__StateMachine__Group_5__4__Impl ;
    public final void rule__StateMachine__Group_5__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:1238:1: ( rule__StateMachine__Group_5__4__Impl )
            // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:1239:2: rule__StateMachine__Group_5__4__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__StateMachine__Group_5__4__Impl_in_rule__StateMachine__Group_5__42471);
            rule__StateMachine__Group_5__4__Impl();

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
    // $ANTLR end "rule__StateMachine__Group_5__4"


    // $ANTLR start "rule__StateMachine__Group_5__4__Impl"
    // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:1245:1: rule__StateMachine__Group_5__4__Impl : ( '}' ) ;
    public final void rule__StateMachine__Group_5__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:1249:1: ( ( '}' ) )
            // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:1250:1: ( '}' )
            {
            // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:1250:1: ( '}' )
            // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:1251:1: '}'
            {
             before(grammarAccess.getStateMachineAccess().getRightCurlyBracketKeyword_5_4()); 
            match(input,13,FollowSets000.FOLLOW_13_in_rule__StateMachine__Group_5__4__Impl2499); 
             after(grammarAccess.getStateMachineAccess().getRightCurlyBracketKeyword_5_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StateMachine__Group_5__4__Impl"


    // $ANTLR start "rule__StateMachine__Group_5_3__0"
    // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:1274:1: rule__StateMachine__Group_5_3__0 : rule__StateMachine__Group_5_3__0__Impl rule__StateMachine__Group_5_3__1 ;
    public final void rule__StateMachine__Group_5_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:1278:1: ( rule__StateMachine__Group_5_3__0__Impl rule__StateMachine__Group_5_3__1 )
            // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:1279:2: rule__StateMachine__Group_5_3__0__Impl rule__StateMachine__Group_5_3__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__StateMachine__Group_5_3__0__Impl_in_rule__StateMachine__Group_5_3__02540);
            rule__StateMachine__Group_5_3__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__StateMachine__Group_5_3__1_in_rule__StateMachine__Group_5_3__02543);
            rule__StateMachine__Group_5_3__1();

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
    // $ANTLR end "rule__StateMachine__Group_5_3__0"


    // $ANTLR start "rule__StateMachine__Group_5_3__0__Impl"
    // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:1286:1: rule__StateMachine__Group_5_3__0__Impl : ( ',' ) ;
    public final void rule__StateMachine__Group_5_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:1290:1: ( ( ',' ) )
            // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:1291:1: ( ',' )
            {
            // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:1291:1: ( ',' )
            // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:1292:1: ','
            {
             before(grammarAccess.getStateMachineAccess().getCommaKeyword_5_3_0()); 
            match(input,15,FollowSets000.FOLLOW_15_in_rule__StateMachine__Group_5_3__0__Impl2571); 
             after(grammarAccess.getStateMachineAccess().getCommaKeyword_5_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StateMachine__Group_5_3__0__Impl"


    // $ANTLR start "rule__StateMachine__Group_5_3__1"
    // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:1305:1: rule__StateMachine__Group_5_3__1 : rule__StateMachine__Group_5_3__1__Impl ;
    public final void rule__StateMachine__Group_5_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:1309:1: ( rule__StateMachine__Group_5_3__1__Impl )
            // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:1310:2: rule__StateMachine__Group_5_3__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__StateMachine__Group_5_3__1__Impl_in_rule__StateMachine__Group_5_3__12602);
            rule__StateMachine__Group_5_3__1__Impl();

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
    // $ANTLR end "rule__StateMachine__Group_5_3__1"


    // $ANTLR start "rule__StateMachine__Group_5_3__1__Impl"
    // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:1316:1: rule__StateMachine__Group_5_3__1__Impl : ( ( rule__StateMachine__StateMachinesAssignment_5_3_1 ) ) ;
    public final void rule__StateMachine__Group_5_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:1320:1: ( ( ( rule__StateMachine__StateMachinesAssignment_5_3_1 ) ) )
            // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:1321:1: ( ( rule__StateMachine__StateMachinesAssignment_5_3_1 ) )
            {
            // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:1321:1: ( ( rule__StateMachine__StateMachinesAssignment_5_3_1 ) )
            // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:1322:1: ( rule__StateMachine__StateMachinesAssignment_5_3_1 )
            {
             before(grammarAccess.getStateMachineAccess().getStateMachinesAssignment_5_3_1()); 
            // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:1323:1: ( rule__StateMachine__StateMachinesAssignment_5_3_1 )
            // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:1323:2: rule__StateMachine__StateMachinesAssignment_5_3_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__StateMachine__StateMachinesAssignment_5_3_1_in_rule__StateMachine__Group_5_3__1__Impl2629);
            rule__StateMachine__StateMachinesAssignment_5_3_1();

            state._fsp--;


            }

             after(grammarAccess.getStateMachineAccess().getStateMachinesAssignment_5_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StateMachine__Group_5_3__1__Impl"


    // $ANTLR start "rule__Transition__Group__0"
    // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:1337:1: rule__Transition__Group__0 : rule__Transition__Group__0__Impl rule__Transition__Group__1 ;
    public final void rule__Transition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:1341:1: ( rule__Transition__Group__0__Impl rule__Transition__Group__1 )
            // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:1342:2: rule__Transition__Group__0__Impl rule__Transition__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Transition__Group__0__Impl_in_rule__Transition__Group__02663);
            rule__Transition__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Transition__Group__1_in_rule__Transition__Group__02666);
            rule__Transition__Group__1();

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
    // $ANTLR end "rule__Transition__Group__0"


    // $ANTLR start "rule__Transition__Group__0__Impl"
    // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:1349:1: rule__Transition__Group__0__Impl : ( () ) ;
    public final void rule__Transition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:1353:1: ( ( () ) )
            // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:1354:1: ( () )
            {
            // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:1354:1: ( () )
            // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:1355:1: ()
            {
             before(grammarAccess.getTransitionAccess().getTransitionAction_0()); 
            // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:1356:1: ()
            // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:1358:1: 
            {
            }

             after(grammarAccess.getTransitionAccess().getTransitionAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__Group__0__Impl"


    // $ANTLR start "rule__Transition__Group__1"
    // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:1368:1: rule__Transition__Group__1 : rule__Transition__Group__1__Impl rule__Transition__Group__2 ;
    public final void rule__Transition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:1372:1: ( rule__Transition__Group__1__Impl rule__Transition__Group__2 )
            // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:1373:2: rule__Transition__Group__1__Impl rule__Transition__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Transition__Group__1__Impl_in_rule__Transition__Group__12724);
            rule__Transition__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Transition__Group__2_in_rule__Transition__Group__12727);
            rule__Transition__Group__2();

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
    // $ANTLR end "rule__Transition__Group__1"


    // $ANTLR start "rule__Transition__Group__1__Impl"
    // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:1380:1: rule__Transition__Group__1__Impl : ( 'Transition' ) ;
    public final void rule__Transition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:1384:1: ( ( 'Transition' ) )
            // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:1385:1: ( 'Transition' )
            {
            // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:1385:1: ( 'Transition' )
            // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:1386:1: 'Transition'
            {
             before(grammarAccess.getTransitionAccess().getTransitionKeyword_1()); 
            match(input,18,FollowSets000.FOLLOW_18_in_rule__Transition__Group__1__Impl2755); 
             after(grammarAccess.getTransitionAccess().getTransitionKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__Group__1__Impl"


    // $ANTLR start "rule__Transition__Group__2"
    // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:1399:1: rule__Transition__Group__2 : rule__Transition__Group__2__Impl rule__Transition__Group__3 ;
    public final void rule__Transition__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:1403:1: ( rule__Transition__Group__2__Impl rule__Transition__Group__3 )
            // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:1404:2: rule__Transition__Group__2__Impl rule__Transition__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__Transition__Group__2__Impl_in_rule__Transition__Group__22786);
            rule__Transition__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Transition__Group__3_in_rule__Transition__Group__22789);
            rule__Transition__Group__3();

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
    // $ANTLR end "rule__Transition__Group__2"


    // $ANTLR start "rule__Transition__Group__2__Impl"
    // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:1411:1: rule__Transition__Group__2__Impl : ( '{' ) ;
    public final void rule__Transition__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:1415:1: ( ( '{' ) )
            // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:1416:1: ( '{' )
            {
            // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:1416:1: ( '{' )
            // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:1417:1: '{'
            {
             before(grammarAccess.getTransitionAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,12,FollowSets000.FOLLOW_12_in_rule__Transition__Group__2__Impl2817); 
             after(grammarAccess.getTransitionAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__Group__2__Impl"


    // $ANTLR start "rule__Transition__Group__3"
    // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:1430:1: rule__Transition__Group__3 : rule__Transition__Group__3__Impl rule__Transition__Group__4 ;
    public final void rule__Transition__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:1434:1: ( rule__Transition__Group__3__Impl rule__Transition__Group__4 )
            // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:1435:2: rule__Transition__Group__3__Impl rule__Transition__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__Transition__Group__3__Impl_in_rule__Transition__Group__32848);
            rule__Transition__Group__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Transition__Group__4_in_rule__Transition__Group__32851);
            rule__Transition__Group__4();

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
    // $ANTLR end "rule__Transition__Group__3"


    // $ANTLR start "rule__Transition__Group__3__Impl"
    // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:1442:1: rule__Transition__Group__3__Impl : ( ( rule__Transition__Group_3__0 )? ) ;
    public final void rule__Transition__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:1446:1: ( ( ( rule__Transition__Group_3__0 )? ) )
            // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:1447:1: ( ( rule__Transition__Group_3__0 )? )
            {
            // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:1447:1: ( ( rule__Transition__Group_3__0 )? )
            // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:1448:1: ( rule__Transition__Group_3__0 )?
            {
             before(grammarAccess.getTransitionAccess().getGroup_3()); 
            // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:1449:1: ( rule__Transition__Group_3__0 )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==19) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:1449:2: rule__Transition__Group_3__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__Transition__Group_3__0_in_rule__Transition__Group__3__Impl2878);
                    rule__Transition__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getTransitionAccess().getGroup_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__Group__3__Impl"


    // $ANTLR start "rule__Transition__Group__4"
    // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:1459:1: rule__Transition__Group__4 : rule__Transition__Group__4__Impl rule__Transition__Group__5 ;
    public final void rule__Transition__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:1463:1: ( rule__Transition__Group__4__Impl rule__Transition__Group__5 )
            // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:1464:2: rule__Transition__Group__4__Impl rule__Transition__Group__5
            {
            pushFollow(FollowSets000.FOLLOW_rule__Transition__Group__4__Impl_in_rule__Transition__Group__42909);
            rule__Transition__Group__4__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Transition__Group__5_in_rule__Transition__Group__42912);
            rule__Transition__Group__5();

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
    // $ANTLR end "rule__Transition__Group__4"


    // $ANTLR start "rule__Transition__Group__4__Impl"
    // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:1471:1: rule__Transition__Group__4__Impl : ( ( rule__Transition__Group_4__0 )? ) ;
    public final void rule__Transition__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:1475:1: ( ( ( rule__Transition__Group_4__0 )? ) )
            // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:1476:1: ( ( rule__Transition__Group_4__0 )? )
            {
            // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:1476:1: ( ( rule__Transition__Group_4__0 )? )
            // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:1477:1: ( rule__Transition__Group_4__0 )?
            {
             before(grammarAccess.getTransitionAccess().getGroup_4()); 
            // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:1478:1: ( rule__Transition__Group_4__0 )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==20) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:1478:2: rule__Transition__Group_4__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__Transition__Group_4__0_in_rule__Transition__Group__4__Impl2939);
                    rule__Transition__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getTransitionAccess().getGroup_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__Group__4__Impl"


    // $ANTLR start "rule__Transition__Group__5"
    // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:1488:1: rule__Transition__Group__5 : rule__Transition__Group__5__Impl rule__Transition__Group__6 ;
    public final void rule__Transition__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:1492:1: ( rule__Transition__Group__5__Impl rule__Transition__Group__6 )
            // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:1493:2: rule__Transition__Group__5__Impl rule__Transition__Group__6
            {
            pushFollow(FollowSets000.FOLLOW_rule__Transition__Group__5__Impl_in_rule__Transition__Group__52970);
            rule__Transition__Group__5__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Transition__Group__6_in_rule__Transition__Group__52973);
            rule__Transition__Group__6();

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
    // $ANTLR end "rule__Transition__Group__5"


    // $ANTLR start "rule__Transition__Group__5__Impl"
    // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:1500:1: rule__Transition__Group__5__Impl : ( ( rule__Transition__Group_5__0 )? ) ;
    public final void rule__Transition__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:1504:1: ( ( ( rule__Transition__Group_5__0 )? ) )
            // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:1505:1: ( ( rule__Transition__Group_5__0 )? )
            {
            // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:1505:1: ( ( rule__Transition__Group_5__0 )? )
            // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:1506:1: ( rule__Transition__Group_5__0 )?
            {
             before(grammarAccess.getTransitionAccess().getGroup_5()); 
            // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:1507:1: ( rule__Transition__Group_5__0 )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==21) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:1507:2: rule__Transition__Group_5__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__Transition__Group_5__0_in_rule__Transition__Group__5__Impl3000);
                    rule__Transition__Group_5__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getTransitionAccess().getGroup_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__Group__5__Impl"


    // $ANTLR start "rule__Transition__Group__6"
    // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:1517:1: rule__Transition__Group__6 : rule__Transition__Group__6__Impl ;
    public final void rule__Transition__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:1521:1: ( rule__Transition__Group__6__Impl )
            // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:1522:2: rule__Transition__Group__6__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Transition__Group__6__Impl_in_rule__Transition__Group__63031);
            rule__Transition__Group__6__Impl();

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
    // $ANTLR end "rule__Transition__Group__6"


    // $ANTLR start "rule__Transition__Group__6__Impl"
    // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:1528:1: rule__Transition__Group__6__Impl : ( '}' ) ;
    public final void rule__Transition__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:1532:1: ( ( '}' ) )
            // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:1533:1: ( '}' )
            {
            // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:1533:1: ( '}' )
            // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:1534:1: '}'
            {
             before(grammarAccess.getTransitionAccess().getRightCurlyBracketKeyword_6()); 
            match(input,13,FollowSets000.FOLLOW_13_in_rule__Transition__Group__6__Impl3059); 
             after(grammarAccess.getTransitionAccess().getRightCurlyBracketKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__Group__6__Impl"


    // $ANTLR start "rule__Transition__Group_3__0"
    // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:1561:1: rule__Transition__Group_3__0 : rule__Transition__Group_3__0__Impl rule__Transition__Group_3__1 ;
    public final void rule__Transition__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:1565:1: ( rule__Transition__Group_3__0__Impl rule__Transition__Group_3__1 )
            // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:1566:2: rule__Transition__Group_3__0__Impl rule__Transition__Group_3__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Transition__Group_3__0__Impl_in_rule__Transition__Group_3__03104);
            rule__Transition__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Transition__Group_3__1_in_rule__Transition__Group_3__03107);
            rule__Transition__Group_3__1();

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
    // $ANTLR end "rule__Transition__Group_3__0"


    // $ANTLR start "rule__Transition__Group_3__0__Impl"
    // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:1573:1: rule__Transition__Group_3__0__Impl : ( 'event' ) ;
    public final void rule__Transition__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:1577:1: ( ( 'event' ) )
            // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:1578:1: ( 'event' )
            {
            // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:1578:1: ( 'event' )
            // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:1579:1: 'event'
            {
             before(grammarAccess.getTransitionAccess().getEventKeyword_3_0()); 
            match(input,19,FollowSets000.FOLLOW_19_in_rule__Transition__Group_3__0__Impl3135); 
             after(grammarAccess.getTransitionAccess().getEventKeyword_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__Group_3__0__Impl"


    // $ANTLR start "rule__Transition__Group_3__1"
    // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:1592:1: rule__Transition__Group_3__1 : rule__Transition__Group_3__1__Impl ;
    public final void rule__Transition__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:1596:1: ( rule__Transition__Group_3__1__Impl )
            // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:1597:2: rule__Transition__Group_3__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Transition__Group_3__1__Impl_in_rule__Transition__Group_3__13166);
            rule__Transition__Group_3__1__Impl();

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
    // $ANTLR end "rule__Transition__Group_3__1"


    // $ANTLR start "rule__Transition__Group_3__1__Impl"
    // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:1603:1: rule__Transition__Group_3__1__Impl : ( ( rule__Transition__EventAssignment_3_1 ) ) ;
    public final void rule__Transition__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:1607:1: ( ( ( rule__Transition__EventAssignment_3_1 ) ) )
            // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:1608:1: ( ( rule__Transition__EventAssignment_3_1 ) )
            {
            // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:1608:1: ( ( rule__Transition__EventAssignment_3_1 ) )
            // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:1609:1: ( rule__Transition__EventAssignment_3_1 )
            {
             before(grammarAccess.getTransitionAccess().getEventAssignment_3_1()); 
            // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:1610:1: ( rule__Transition__EventAssignment_3_1 )
            // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:1610:2: rule__Transition__EventAssignment_3_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Transition__EventAssignment_3_1_in_rule__Transition__Group_3__1__Impl3193);
            rule__Transition__EventAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getTransitionAccess().getEventAssignment_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__Group_3__1__Impl"


    // $ANTLR start "rule__Transition__Group_4__0"
    // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:1624:1: rule__Transition__Group_4__0 : rule__Transition__Group_4__0__Impl rule__Transition__Group_4__1 ;
    public final void rule__Transition__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:1628:1: ( rule__Transition__Group_4__0__Impl rule__Transition__Group_4__1 )
            // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:1629:2: rule__Transition__Group_4__0__Impl rule__Transition__Group_4__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Transition__Group_4__0__Impl_in_rule__Transition__Group_4__03227);
            rule__Transition__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Transition__Group_4__1_in_rule__Transition__Group_4__03230);
            rule__Transition__Group_4__1();

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
    // $ANTLR end "rule__Transition__Group_4__0"


    // $ANTLR start "rule__Transition__Group_4__0__Impl"
    // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:1636:1: rule__Transition__Group_4__0__Impl : ( 'source' ) ;
    public final void rule__Transition__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:1640:1: ( ( 'source' ) )
            // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:1641:1: ( 'source' )
            {
            // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:1641:1: ( 'source' )
            // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:1642:1: 'source'
            {
             before(grammarAccess.getTransitionAccess().getSourceKeyword_4_0()); 
            match(input,20,FollowSets000.FOLLOW_20_in_rule__Transition__Group_4__0__Impl3258); 
             after(grammarAccess.getTransitionAccess().getSourceKeyword_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__Group_4__0__Impl"


    // $ANTLR start "rule__Transition__Group_4__1"
    // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:1655:1: rule__Transition__Group_4__1 : rule__Transition__Group_4__1__Impl ;
    public final void rule__Transition__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:1659:1: ( rule__Transition__Group_4__1__Impl )
            // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:1660:2: rule__Transition__Group_4__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Transition__Group_4__1__Impl_in_rule__Transition__Group_4__13289);
            rule__Transition__Group_4__1__Impl();

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
    // $ANTLR end "rule__Transition__Group_4__1"


    // $ANTLR start "rule__Transition__Group_4__1__Impl"
    // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:1666:1: rule__Transition__Group_4__1__Impl : ( ( rule__Transition__SourceAssignment_4_1 ) ) ;
    public final void rule__Transition__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:1670:1: ( ( ( rule__Transition__SourceAssignment_4_1 ) ) )
            // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:1671:1: ( ( rule__Transition__SourceAssignment_4_1 ) )
            {
            // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:1671:1: ( ( rule__Transition__SourceAssignment_4_1 ) )
            // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:1672:1: ( rule__Transition__SourceAssignment_4_1 )
            {
             before(grammarAccess.getTransitionAccess().getSourceAssignment_4_1()); 
            // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:1673:1: ( rule__Transition__SourceAssignment_4_1 )
            // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:1673:2: rule__Transition__SourceAssignment_4_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Transition__SourceAssignment_4_1_in_rule__Transition__Group_4__1__Impl3316);
            rule__Transition__SourceAssignment_4_1();

            state._fsp--;


            }

             after(grammarAccess.getTransitionAccess().getSourceAssignment_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__Group_4__1__Impl"


    // $ANTLR start "rule__Transition__Group_5__0"
    // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:1687:1: rule__Transition__Group_5__0 : rule__Transition__Group_5__0__Impl rule__Transition__Group_5__1 ;
    public final void rule__Transition__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:1691:1: ( rule__Transition__Group_5__0__Impl rule__Transition__Group_5__1 )
            // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:1692:2: rule__Transition__Group_5__0__Impl rule__Transition__Group_5__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Transition__Group_5__0__Impl_in_rule__Transition__Group_5__03350);
            rule__Transition__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Transition__Group_5__1_in_rule__Transition__Group_5__03353);
            rule__Transition__Group_5__1();

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
    // $ANTLR end "rule__Transition__Group_5__0"


    // $ANTLR start "rule__Transition__Group_5__0__Impl"
    // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:1699:1: rule__Transition__Group_5__0__Impl : ( 'target' ) ;
    public final void rule__Transition__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:1703:1: ( ( 'target' ) )
            // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:1704:1: ( 'target' )
            {
            // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:1704:1: ( 'target' )
            // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:1705:1: 'target'
            {
             before(grammarAccess.getTransitionAccess().getTargetKeyword_5_0()); 
            match(input,21,FollowSets000.FOLLOW_21_in_rule__Transition__Group_5__0__Impl3381); 
             after(grammarAccess.getTransitionAccess().getTargetKeyword_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__Group_5__0__Impl"


    // $ANTLR start "rule__Transition__Group_5__1"
    // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:1718:1: rule__Transition__Group_5__1 : rule__Transition__Group_5__1__Impl ;
    public final void rule__Transition__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:1722:1: ( rule__Transition__Group_5__1__Impl )
            // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:1723:2: rule__Transition__Group_5__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Transition__Group_5__1__Impl_in_rule__Transition__Group_5__13412);
            rule__Transition__Group_5__1__Impl();

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
    // $ANTLR end "rule__Transition__Group_5__1"


    // $ANTLR start "rule__Transition__Group_5__1__Impl"
    // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:1729:1: rule__Transition__Group_5__1__Impl : ( ( rule__Transition__TargetAssignment_5_1 ) ) ;
    public final void rule__Transition__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:1733:1: ( ( ( rule__Transition__TargetAssignment_5_1 ) ) )
            // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:1734:1: ( ( rule__Transition__TargetAssignment_5_1 ) )
            {
            // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:1734:1: ( ( rule__Transition__TargetAssignment_5_1 ) )
            // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:1735:1: ( rule__Transition__TargetAssignment_5_1 )
            {
             before(grammarAccess.getTransitionAccess().getTargetAssignment_5_1()); 
            // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:1736:1: ( rule__Transition__TargetAssignment_5_1 )
            // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:1736:2: rule__Transition__TargetAssignment_5_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Transition__TargetAssignment_5_1_in_rule__Transition__Group_5__1__Impl3439);
            rule__Transition__TargetAssignment_5_1();

            state._fsp--;


            }

             after(grammarAccess.getTransitionAccess().getTargetAssignment_5_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__Group_5__1__Impl"


    // $ANTLR start "rule__State__Group__0"
    // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:1750:1: rule__State__Group__0 : rule__State__Group__0__Impl rule__State__Group__1 ;
    public final void rule__State__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:1754:1: ( rule__State__Group__0__Impl rule__State__Group__1 )
            // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:1755:2: rule__State__Group__0__Impl rule__State__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__State__Group__0__Impl_in_rule__State__Group__03473);
            rule__State__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__State__Group__1_in_rule__State__Group__03476);
            rule__State__Group__1();

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
    // $ANTLR end "rule__State__Group__0"


    // $ANTLR start "rule__State__Group__0__Impl"
    // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:1762:1: rule__State__Group__0__Impl : ( () ) ;
    public final void rule__State__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:1766:1: ( ( () ) )
            // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:1767:1: ( () )
            {
            // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:1767:1: ( () )
            // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:1768:1: ()
            {
             before(grammarAccess.getStateAccess().getStateAction_0()); 
            // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:1769:1: ()
            // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:1771:1: 
            {
            }

             after(grammarAccess.getStateAccess().getStateAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__State__Group__0__Impl"


    // $ANTLR start "rule__State__Group__1"
    // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:1781:1: rule__State__Group__1 : rule__State__Group__1__Impl rule__State__Group__2 ;
    public final void rule__State__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:1785:1: ( rule__State__Group__1__Impl rule__State__Group__2 )
            // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:1786:2: rule__State__Group__1__Impl rule__State__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__State__Group__1__Impl_in_rule__State__Group__13534);
            rule__State__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__State__Group__2_in_rule__State__Group__13537);
            rule__State__Group__2();

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
    // $ANTLR end "rule__State__Group__1"


    // $ANTLR start "rule__State__Group__1__Impl"
    // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:1793:1: rule__State__Group__1__Impl : ( 'State' ) ;
    public final void rule__State__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:1797:1: ( ( 'State' ) )
            // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:1798:1: ( 'State' )
            {
            // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:1798:1: ( 'State' )
            // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:1799:1: 'State'
            {
             before(grammarAccess.getStateAccess().getStateKeyword_1()); 
            match(input,22,FollowSets000.FOLLOW_22_in_rule__State__Group__1__Impl3565); 
             after(grammarAccess.getStateAccess().getStateKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__State__Group__1__Impl"


    // $ANTLR start "rule__State__Group__2"
    // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:1812:1: rule__State__Group__2 : rule__State__Group__2__Impl rule__State__Group__3 ;
    public final void rule__State__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:1816:1: ( rule__State__Group__2__Impl rule__State__Group__3 )
            // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:1817:2: rule__State__Group__2__Impl rule__State__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__State__Group__2__Impl_in_rule__State__Group__23596);
            rule__State__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__State__Group__3_in_rule__State__Group__23599);
            rule__State__Group__3();

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
    // $ANTLR end "rule__State__Group__2"


    // $ANTLR start "rule__State__Group__2__Impl"
    // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:1824:1: rule__State__Group__2__Impl : ( ( rule__State__NameAssignment_2 ) ) ;
    public final void rule__State__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:1828:1: ( ( ( rule__State__NameAssignment_2 ) ) )
            // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:1829:1: ( ( rule__State__NameAssignment_2 ) )
            {
            // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:1829:1: ( ( rule__State__NameAssignment_2 ) )
            // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:1830:1: ( rule__State__NameAssignment_2 )
            {
             before(grammarAccess.getStateAccess().getNameAssignment_2()); 
            // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:1831:1: ( rule__State__NameAssignment_2 )
            // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:1831:2: rule__State__NameAssignment_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__State__NameAssignment_2_in_rule__State__Group__2__Impl3626);
            rule__State__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getStateAccess().getNameAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__State__Group__2__Impl"


    // $ANTLR start "rule__State__Group__3"
    // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:1841:1: rule__State__Group__3 : rule__State__Group__3__Impl rule__State__Group__4 ;
    public final void rule__State__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:1845:1: ( rule__State__Group__3__Impl rule__State__Group__4 )
            // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:1846:2: rule__State__Group__3__Impl rule__State__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__State__Group__3__Impl_in_rule__State__Group__33656);
            rule__State__Group__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__State__Group__4_in_rule__State__Group__33659);
            rule__State__Group__4();

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
    // $ANTLR end "rule__State__Group__3"


    // $ANTLR start "rule__State__Group__3__Impl"
    // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:1853:1: rule__State__Group__3__Impl : ( '{' ) ;
    public final void rule__State__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:1857:1: ( ( '{' ) )
            // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:1858:1: ( '{' )
            {
            // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:1858:1: ( '{' )
            // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:1859:1: '{'
            {
             before(grammarAccess.getStateAccess().getLeftCurlyBracketKeyword_3()); 
            match(input,12,FollowSets000.FOLLOW_12_in_rule__State__Group__3__Impl3687); 
             after(grammarAccess.getStateAccess().getLeftCurlyBracketKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__State__Group__3__Impl"


    // $ANTLR start "rule__State__Group__4"
    // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:1872:1: rule__State__Group__4 : rule__State__Group__4__Impl rule__State__Group__5 ;
    public final void rule__State__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:1876:1: ( rule__State__Group__4__Impl rule__State__Group__5 )
            // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:1877:2: rule__State__Group__4__Impl rule__State__Group__5
            {
            pushFollow(FollowSets000.FOLLOW_rule__State__Group__4__Impl_in_rule__State__Group__43718);
            rule__State__Group__4__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__State__Group__5_in_rule__State__Group__43721);
            rule__State__Group__5();

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
    // $ANTLR end "rule__State__Group__4"


    // $ANTLR start "rule__State__Group__4__Impl"
    // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:1884:1: rule__State__Group__4__Impl : ( ( rule__State__Group_4__0 )? ) ;
    public final void rule__State__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:1888:1: ( ( ( rule__State__Group_4__0 )? ) )
            // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:1889:1: ( ( rule__State__Group_4__0 )? )
            {
            // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:1889:1: ( ( rule__State__Group_4__0 )? )
            // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:1890:1: ( rule__State__Group_4__0 )?
            {
             before(grammarAccess.getStateAccess().getGroup_4()); 
            // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:1891:1: ( rule__State__Group_4__0 )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==23) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:1891:2: rule__State__Group_4__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__State__Group_4__0_in_rule__State__Group__4__Impl3748);
                    rule__State__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getStateAccess().getGroup_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__State__Group__4__Impl"


    // $ANTLR start "rule__State__Group__5"
    // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:1901:1: rule__State__Group__5 : rule__State__Group__5__Impl ;
    public final void rule__State__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:1905:1: ( rule__State__Group__5__Impl )
            // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:1906:2: rule__State__Group__5__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__State__Group__5__Impl_in_rule__State__Group__53779);
            rule__State__Group__5__Impl();

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
    // $ANTLR end "rule__State__Group__5"


    // $ANTLR start "rule__State__Group__5__Impl"
    // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:1912:1: rule__State__Group__5__Impl : ( '}' ) ;
    public final void rule__State__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:1916:1: ( ( '}' ) )
            // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:1917:1: ( '}' )
            {
            // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:1917:1: ( '}' )
            // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:1918:1: '}'
            {
             before(grammarAccess.getStateAccess().getRightCurlyBracketKeyword_5()); 
            match(input,13,FollowSets000.FOLLOW_13_in_rule__State__Group__5__Impl3807); 
             after(grammarAccess.getStateAccess().getRightCurlyBracketKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__State__Group__5__Impl"


    // $ANTLR start "rule__State__Group_4__0"
    // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:1943:1: rule__State__Group_4__0 : rule__State__Group_4__0__Impl rule__State__Group_4__1 ;
    public final void rule__State__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:1947:1: ( rule__State__Group_4__0__Impl rule__State__Group_4__1 )
            // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:1948:2: rule__State__Group_4__0__Impl rule__State__Group_4__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__State__Group_4__0__Impl_in_rule__State__Group_4__03850);
            rule__State__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__State__Group_4__1_in_rule__State__Group_4__03853);
            rule__State__Group_4__1();

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
    // $ANTLR end "rule__State__Group_4__0"


    // $ANTLR start "rule__State__Group_4__0__Impl"
    // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:1955:1: rule__State__Group_4__0__Impl : ( 'nested' ) ;
    public final void rule__State__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:1959:1: ( ( 'nested' ) )
            // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:1960:1: ( 'nested' )
            {
            // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:1960:1: ( 'nested' )
            // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:1961:1: 'nested'
            {
             before(grammarAccess.getStateAccess().getNestedKeyword_4_0()); 
            match(input,23,FollowSets000.FOLLOW_23_in_rule__State__Group_4__0__Impl3881); 
             after(grammarAccess.getStateAccess().getNestedKeyword_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__State__Group_4__0__Impl"


    // $ANTLR start "rule__State__Group_4__1"
    // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:1974:1: rule__State__Group_4__1 : rule__State__Group_4__1__Impl ;
    public final void rule__State__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:1978:1: ( rule__State__Group_4__1__Impl )
            // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:1979:2: rule__State__Group_4__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__State__Group_4__1__Impl_in_rule__State__Group_4__13912);
            rule__State__Group_4__1__Impl();

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
    // $ANTLR end "rule__State__Group_4__1"


    // $ANTLR start "rule__State__Group_4__1__Impl"
    // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:1985:1: rule__State__Group_4__1__Impl : ( ( rule__State__NestedAssignment_4_1 ) ) ;
    public final void rule__State__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:1989:1: ( ( ( rule__State__NestedAssignment_4_1 ) ) )
            // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:1990:1: ( ( rule__State__NestedAssignment_4_1 ) )
            {
            // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:1990:1: ( ( rule__State__NestedAssignment_4_1 ) )
            // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:1991:1: ( rule__State__NestedAssignment_4_1 )
            {
             before(grammarAccess.getStateAccess().getNestedAssignment_4_1()); 
            // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:1992:1: ( rule__State__NestedAssignment_4_1 )
            // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:1992:2: rule__State__NestedAssignment_4_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__State__NestedAssignment_4_1_in_rule__State__Group_4__1__Impl3939);
            rule__State__NestedAssignment_4_1();

            state._fsp--;


            }

             after(grammarAccess.getStateAccess().getNestedAssignment_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__State__Group_4__1__Impl"


    // $ANTLR start "rule__Initial__Group__0"
    // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:2006:1: rule__Initial__Group__0 : rule__Initial__Group__0__Impl rule__Initial__Group__1 ;
    public final void rule__Initial__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:2010:1: ( rule__Initial__Group__0__Impl rule__Initial__Group__1 )
            // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:2011:2: rule__Initial__Group__0__Impl rule__Initial__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Initial__Group__0__Impl_in_rule__Initial__Group__03973);
            rule__Initial__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Initial__Group__1_in_rule__Initial__Group__03976);
            rule__Initial__Group__1();

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
    // $ANTLR end "rule__Initial__Group__0"


    // $ANTLR start "rule__Initial__Group__0__Impl"
    // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:2018:1: rule__Initial__Group__0__Impl : ( () ) ;
    public final void rule__Initial__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:2022:1: ( ( () ) )
            // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:2023:1: ( () )
            {
            // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:2023:1: ( () )
            // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:2024:1: ()
            {
             before(grammarAccess.getInitialAccess().getInitialAction_0()); 
            // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:2025:1: ()
            // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:2027:1: 
            {
            }

             after(grammarAccess.getInitialAccess().getInitialAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Initial__Group__0__Impl"


    // $ANTLR start "rule__Initial__Group__1"
    // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:2037:1: rule__Initial__Group__1 : rule__Initial__Group__1__Impl rule__Initial__Group__2 ;
    public final void rule__Initial__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:2041:1: ( rule__Initial__Group__1__Impl rule__Initial__Group__2 )
            // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:2042:2: rule__Initial__Group__1__Impl rule__Initial__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Initial__Group__1__Impl_in_rule__Initial__Group__14034);
            rule__Initial__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Initial__Group__2_in_rule__Initial__Group__14037);
            rule__Initial__Group__2();

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
    // $ANTLR end "rule__Initial__Group__1"


    // $ANTLR start "rule__Initial__Group__1__Impl"
    // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:2049:1: rule__Initial__Group__1__Impl : ( 'Initial' ) ;
    public final void rule__Initial__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:2053:1: ( ( 'Initial' ) )
            // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:2054:1: ( 'Initial' )
            {
            // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:2054:1: ( 'Initial' )
            // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:2055:1: 'Initial'
            {
             before(grammarAccess.getInitialAccess().getInitialKeyword_1()); 
            match(input,24,FollowSets000.FOLLOW_24_in_rule__Initial__Group__1__Impl4065); 
             after(grammarAccess.getInitialAccess().getInitialKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Initial__Group__1__Impl"


    // $ANTLR start "rule__Initial__Group__2"
    // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:2068:1: rule__Initial__Group__2 : rule__Initial__Group__2__Impl ;
    public final void rule__Initial__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:2072:1: ( rule__Initial__Group__2__Impl )
            // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:2073:2: rule__Initial__Group__2__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Initial__Group__2__Impl_in_rule__Initial__Group__24096);
            rule__Initial__Group__2__Impl();

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
    // $ANTLR end "rule__Initial__Group__2"


    // $ANTLR start "rule__Initial__Group__2__Impl"
    // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:2079:1: rule__Initial__Group__2__Impl : ( ( rule__Initial__NameAssignment_2 ) ) ;
    public final void rule__Initial__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:2083:1: ( ( ( rule__Initial__NameAssignment_2 ) ) )
            // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:2084:1: ( ( rule__Initial__NameAssignment_2 ) )
            {
            // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:2084:1: ( ( rule__Initial__NameAssignment_2 ) )
            // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:2085:1: ( rule__Initial__NameAssignment_2 )
            {
             before(grammarAccess.getInitialAccess().getNameAssignment_2()); 
            // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:2086:1: ( rule__Initial__NameAssignment_2 )
            // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:2086:2: rule__Initial__NameAssignment_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Initial__NameAssignment_2_in_rule__Initial__Group__2__Impl4123);
            rule__Initial__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getInitialAccess().getNameAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Initial__Group__2__Impl"


    // $ANTLR start "rule__Junction__Group__0"
    // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:2102:1: rule__Junction__Group__0 : rule__Junction__Group__0__Impl rule__Junction__Group__1 ;
    public final void rule__Junction__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:2106:1: ( rule__Junction__Group__0__Impl rule__Junction__Group__1 )
            // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:2107:2: rule__Junction__Group__0__Impl rule__Junction__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Junction__Group__0__Impl_in_rule__Junction__Group__04159);
            rule__Junction__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Junction__Group__1_in_rule__Junction__Group__04162);
            rule__Junction__Group__1();

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
    // $ANTLR end "rule__Junction__Group__0"


    // $ANTLR start "rule__Junction__Group__0__Impl"
    // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:2114:1: rule__Junction__Group__0__Impl : ( () ) ;
    public final void rule__Junction__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:2118:1: ( ( () ) )
            // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:2119:1: ( () )
            {
            // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:2119:1: ( () )
            // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:2120:1: ()
            {
             before(grammarAccess.getJunctionAccess().getJunctionAction_0()); 
            // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:2121:1: ()
            // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:2123:1: 
            {
            }

             after(grammarAccess.getJunctionAccess().getJunctionAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Junction__Group__0__Impl"


    // $ANTLR start "rule__Junction__Group__1"
    // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:2133:1: rule__Junction__Group__1 : rule__Junction__Group__1__Impl rule__Junction__Group__2 ;
    public final void rule__Junction__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:2137:1: ( rule__Junction__Group__1__Impl rule__Junction__Group__2 )
            // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:2138:2: rule__Junction__Group__1__Impl rule__Junction__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Junction__Group__1__Impl_in_rule__Junction__Group__14220);
            rule__Junction__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Junction__Group__2_in_rule__Junction__Group__14223);
            rule__Junction__Group__2();

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
    // $ANTLR end "rule__Junction__Group__1"


    // $ANTLR start "rule__Junction__Group__1__Impl"
    // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:2145:1: rule__Junction__Group__1__Impl : ( 'Junction' ) ;
    public final void rule__Junction__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:2149:1: ( ( 'Junction' ) )
            // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:2150:1: ( 'Junction' )
            {
            // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:2150:1: ( 'Junction' )
            // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:2151:1: 'Junction'
            {
             before(grammarAccess.getJunctionAccess().getJunctionKeyword_1()); 
            match(input,25,FollowSets000.FOLLOW_25_in_rule__Junction__Group__1__Impl4251); 
             after(grammarAccess.getJunctionAccess().getJunctionKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Junction__Group__1__Impl"


    // $ANTLR start "rule__Junction__Group__2"
    // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:2164:1: rule__Junction__Group__2 : rule__Junction__Group__2__Impl ;
    public final void rule__Junction__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:2168:1: ( rule__Junction__Group__2__Impl )
            // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:2169:2: rule__Junction__Group__2__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Junction__Group__2__Impl_in_rule__Junction__Group__24282);
            rule__Junction__Group__2__Impl();

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
    // $ANTLR end "rule__Junction__Group__2"


    // $ANTLR start "rule__Junction__Group__2__Impl"
    // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:2175:1: rule__Junction__Group__2__Impl : ( ( rule__Junction__NameAssignment_2 ) ) ;
    public final void rule__Junction__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:2179:1: ( ( ( rule__Junction__NameAssignment_2 ) ) )
            // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:2180:1: ( ( rule__Junction__NameAssignment_2 ) )
            {
            // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:2180:1: ( ( rule__Junction__NameAssignment_2 ) )
            // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:2181:1: ( rule__Junction__NameAssignment_2 )
            {
             before(grammarAccess.getJunctionAccess().getNameAssignment_2()); 
            // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:2182:1: ( rule__Junction__NameAssignment_2 )
            // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:2182:2: rule__Junction__NameAssignment_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Junction__NameAssignment_2_in_rule__Junction__Group__2__Impl4309);
            rule__Junction__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getJunctionAccess().getNameAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Junction__Group__2__Impl"


    // $ANTLR start "rule__Fork__Group__0"
    // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:2198:1: rule__Fork__Group__0 : rule__Fork__Group__0__Impl rule__Fork__Group__1 ;
    public final void rule__Fork__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:2202:1: ( rule__Fork__Group__0__Impl rule__Fork__Group__1 )
            // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:2203:2: rule__Fork__Group__0__Impl rule__Fork__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Fork__Group__0__Impl_in_rule__Fork__Group__04345);
            rule__Fork__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Fork__Group__1_in_rule__Fork__Group__04348);
            rule__Fork__Group__1();

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
    // $ANTLR end "rule__Fork__Group__0"


    // $ANTLR start "rule__Fork__Group__0__Impl"
    // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:2210:1: rule__Fork__Group__0__Impl : ( () ) ;
    public final void rule__Fork__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:2214:1: ( ( () ) )
            // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:2215:1: ( () )
            {
            // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:2215:1: ( () )
            // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:2216:1: ()
            {
             before(grammarAccess.getForkAccess().getForkAction_0()); 
            // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:2217:1: ()
            // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:2219:1: 
            {
            }

             after(grammarAccess.getForkAccess().getForkAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Fork__Group__0__Impl"


    // $ANTLR start "rule__Fork__Group__1"
    // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:2229:1: rule__Fork__Group__1 : rule__Fork__Group__1__Impl rule__Fork__Group__2 ;
    public final void rule__Fork__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:2233:1: ( rule__Fork__Group__1__Impl rule__Fork__Group__2 )
            // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:2234:2: rule__Fork__Group__1__Impl rule__Fork__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Fork__Group__1__Impl_in_rule__Fork__Group__14406);
            rule__Fork__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Fork__Group__2_in_rule__Fork__Group__14409);
            rule__Fork__Group__2();

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
    // $ANTLR end "rule__Fork__Group__1"


    // $ANTLR start "rule__Fork__Group__1__Impl"
    // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:2241:1: rule__Fork__Group__1__Impl : ( 'Fork' ) ;
    public final void rule__Fork__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:2245:1: ( ( 'Fork' ) )
            // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:2246:1: ( 'Fork' )
            {
            // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:2246:1: ( 'Fork' )
            // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:2247:1: 'Fork'
            {
             before(grammarAccess.getForkAccess().getForkKeyword_1()); 
            match(input,26,FollowSets000.FOLLOW_26_in_rule__Fork__Group__1__Impl4437); 
             after(grammarAccess.getForkAccess().getForkKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Fork__Group__1__Impl"


    // $ANTLR start "rule__Fork__Group__2"
    // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:2260:1: rule__Fork__Group__2 : rule__Fork__Group__2__Impl ;
    public final void rule__Fork__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:2264:1: ( rule__Fork__Group__2__Impl )
            // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:2265:2: rule__Fork__Group__2__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Fork__Group__2__Impl_in_rule__Fork__Group__24468);
            rule__Fork__Group__2__Impl();

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
    // $ANTLR end "rule__Fork__Group__2"


    // $ANTLR start "rule__Fork__Group__2__Impl"
    // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:2271:1: rule__Fork__Group__2__Impl : ( ( rule__Fork__NameAssignment_2 ) ) ;
    public final void rule__Fork__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:2275:1: ( ( ( rule__Fork__NameAssignment_2 ) ) )
            // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:2276:1: ( ( rule__Fork__NameAssignment_2 ) )
            {
            // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:2276:1: ( ( rule__Fork__NameAssignment_2 ) )
            // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:2277:1: ( rule__Fork__NameAssignment_2 )
            {
             before(grammarAccess.getForkAccess().getNameAssignment_2()); 
            // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:2278:1: ( rule__Fork__NameAssignment_2 )
            // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:2278:2: rule__Fork__NameAssignment_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Fork__NameAssignment_2_in_rule__Fork__Group__2__Impl4495);
            rule__Fork__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getForkAccess().getNameAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Fork__Group__2__Impl"


    // $ANTLR start "rule__Join__Group__0"
    // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:2294:1: rule__Join__Group__0 : rule__Join__Group__0__Impl rule__Join__Group__1 ;
    public final void rule__Join__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:2298:1: ( rule__Join__Group__0__Impl rule__Join__Group__1 )
            // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:2299:2: rule__Join__Group__0__Impl rule__Join__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Join__Group__0__Impl_in_rule__Join__Group__04531);
            rule__Join__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Join__Group__1_in_rule__Join__Group__04534);
            rule__Join__Group__1();

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
    // $ANTLR end "rule__Join__Group__0"


    // $ANTLR start "rule__Join__Group__0__Impl"
    // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:2306:1: rule__Join__Group__0__Impl : ( () ) ;
    public final void rule__Join__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:2310:1: ( ( () ) )
            // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:2311:1: ( () )
            {
            // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:2311:1: ( () )
            // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:2312:1: ()
            {
             before(grammarAccess.getJoinAccess().getJoinAction_0()); 
            // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:2313:1: ()
            // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:2315:1: 
            {
            }

             after(grammarAccess.getJoinAccess().getJoinAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Join__Group__0__Impl"


    // $ANTLR start "rule__Join__Group__1"
    // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:2325:1: rule__Join__Group__1 : rule__Join__Group__1__Impl rule__Join__Group__2 ;
    public final void rule__Join__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:2329:1: ( rule__Join__Group__1__Impl rule__Join__Group__2 )
            // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:2330:2: rule__Join__Group__1__Impl rule__Join__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Join__Group__1__Impl_in_rule__Join__Group__14592);
            rule__Join__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Join__Group__2_in_rule__Join__Group__14595);
            rule__Join__Group__2();

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
    // $ANTLR end "rule__Join__Group__1"


    // $ANTLR start "rule__Join__Group__1__Impl"
    // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:2337:1: rule__Join__Group__1__Impl : ( 'Join' ) ;
    public final void rule__Join__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:2341:1: ( ( 'Join' ) )
            // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:2342:1: ( 'Join' )
            {
            // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:2342:1: ( 'Join' )
            // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:2343:1: 'Join'
            {
             before(grammarAccess.getJoinAccess().getJoinKeyword_1()); 
            match(input,27,FollowSets000.FOLLOW_27_in_rule__Join__Group__1__Impl4623); 
             after(grammarAccess.getJoinAccess().getJoinKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Join__Group__1__Impl"


    // $ANTLR start "rule__Join__Group__2"
    // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:2356:1: rule__Join__Group__2 : rule__Join__Group__2__Impl ;
    public final void rule__Join__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:2360:1: ( rule__Join__Group__2__Impl )
            // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:2361:2: rule__Join__Group__2__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Join__Group__2__Impl_in_rule__Join__Group__24654);
            rule__Join__Group__2__Impl();

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
    // $ANTLR end "rule__Join__Group__2"


    // $ANTLR start "rule__Join__Group__2__Impl"
    // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:2367:1: rule__Join__Group__2__Impl : ( ( rule__Join__NameAssignment_2 ) ) ;
    public final void rule__Join__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:2371:1: ( ( ( rule__Join__NameAssignment_2 ) ) )
            // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:2372:1: ( ( rule__Join__NameAssignment_2 ) )
            {
            // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:2372:1: ( ( rule__Join__NameAssignment_2 ) )
            // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:2373:1: ( rule__Join__NameAssignment_2 )
            {
             before(grammarAccess.getJoinAccess().getNameAssignment_2()); 
            // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:2374:1: ( rule__Join__NameAssignment_2 )
            // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:2374:2: rule__Join__NameAssignment_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Join__NameAssignment_2_in_rule__Join__Group__2__Impl4681);
            rule__Join__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getJoinAccess().getNameAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Join__Group__2__Impl"


    // $ANTLR start "rule__Any__Group__0"
    // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:2390:1: rule__Any__Group__0 : rule__Any__Group__0__Impl rule__Any__Group__1 ;
    public final void rule__Any__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:2394:1: ( rule__Any__Group__0__Impl rule__Any__Group__1 )
            // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:2395:2: rule__Any__Group__0__Impl rule__Any__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Any__Group__0__Impl_in_rule__Any__Group__04717);
            rule__Any__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Any__Group__1_in_rule__Any__Group__04720);
            rule__Any__Group__1();

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
    // $ANTLR end "rule__Any__Group__0"


    // $ANTLR start "rule__Any__Group__0__Impl"
    // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:2402:1: rule__Any__Group__0__Impl : ( () ) ;
    public final void rule__Any__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:2406:1: ( ( () ) )
            // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:2407:1: ( () )
            {
            // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:2407:1: ( () )
            // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:2408:1: ()
            {
             before(grammarAccess.getAnyAccess().getAnyAction_0()); 
            // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:2409:1: ()
            // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:2411:1: 
            {
            }

             after(grammarAccess.getAnyAccess().getAnyAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Any__Group__0__Impl"


    // $ANTLR start "rule__Any__Group__1"
    // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:2421:1: rule__Any__Group__1 : rule__Any__Group__1__Impl rule__Any__Group__2 ;
    public final void rule__Any__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:2425:1: ( rule__Any__Group__1__Impl rule__Any__Group__2 )
            // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:2426:2: rule__Any__Group__1__Impl rule__Any__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Any__Group__1__Impl_in_rule__Any__Group__14778);
            rule__Any__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Any__Group__2_in_rule__Any__Group__14781);
            rule__Any__Group__2();

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
    // $ANTLR end "rule__Any__Group__1"


    // $ANTLR start "rule__Any__Group__1__Impl"
    // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:2433:1: rule__Any__Group__1__Impl : ( 'Any' ) ;
    public final void rule__Any__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:2437:1: ( ( 'Any' ) )
            // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:2438:1: ( 'Any' )
            {
            // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:2438:1: ( 'Any' )
            // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:2439:1: 'Any'
            {
             before(grammarAccess.getAnyAccess().getAnyKeyword_1()); 
            match(input,28,FollowSets000.FOLLOW_28_in_rule__Any__Group__1__Impl4809); 
             after(grammarAccess.getAnyAccess().getAnyKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Any__Group__1__Impl"


    // $ANTLR start "rule__Any__Group__2"
    // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:2452:1: rule__Any__Group__2 : rule__Any__Group__2__Impl ;
    public final void rule__Any__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:2456:1: ( rule__Any__Group__2__Impl )
            // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:2457:2: rule__Any__Group__2__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Any__Group__2__Impl_in_rule__Any__Group__24840);
            rule__Any__Group__2__Impl();

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
    // $ANTLR end "rule__Any__Group__2"


    // $ANTLR start "rule__Any__Group__2__Impl"
    // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:2463:1: rule__Any__Group__2__Impl : ( ( rule__Any__NameAssignment_2 ) ) ;
    public final void rule__Any__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:2467:1: ( ( ( rule__Any__NameAssignment_2 ) ) )
            // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:2468:1: ( ( rule__Any__NameAssignment_2 ) )
            {
            // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:2468:1: ( ( rule__Any__NameAssignment_2 ) )
            // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:2469:1: ( rule__Any__NameAssignment_2 )
            {
             before(grammarAccess.getAnyAccess().getNameAssignment_2()); 
            // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:2470:1: ( rule__Any__NameAssignment_2 )
            // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:2470:2: rule__Any__NameAssignment_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Any__NameAssignment_2_in_rule__Any__Group__2__Impl4867);
            rule__Any__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getAnyAccess().getNameAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Any__Group__2__Impl"


    // $ANTLR start "rule__Final__Group__0"
    // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:2486:1: rule__Final__Group__0 : rule__Final__Group__0__Impl rule__Final__Group__1 ;
    public final void rule__Final__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:2490:1: ( rule__Final__Group__0__Impl rule__Final__Group__1 )
            // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:2491:2: rule__Final__Group__0__Impl rule__Final__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Final__Group__0__Impl_in_rule__Final__Group__04903);
            rule__Final__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Final__Group__1_in_rule__Final__Group__04906);
            rule__Final__Group__1();

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
    // $ANTLR end "rule__Final__Group__0"


    // $ANTLR start "rule__Final__Group__0__Impl"
    // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:2498:1: rule__Final__Group__0__Impl : ( () ) ;
    public final void rule__Final__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:2502:1: ( ( () ) )
            // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:2503:1: ( () )
            {
            // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:2503:1: ( () )
            // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:2504:1: ()
            {
             before(grammarAccess.getFinalAccess().getFinalAction_0()); 
            // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:2505:1: ()
            // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:2507:1: 
            {
            }

             after(grammarAccess.getFinalAccess().getFinalAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Final__Group__0__Impl"


    // $ANTLR start "rule__Final__Group__1"
    // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:2517:1: rule__Final__Group__1 : rule__Final__Group__1__Impl rule__Final__Group__2 ;
    public final void rule__Final__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:2521:1: ( rule__Final__Group__1__Impl rule__Final__Group__2 )
            // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:2522:2: rule__Final__Group__1__Impl rule__Final__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Final__Group__1__Impl_in_rule__Final__Group__14964);
            rule__Final__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Final__Group__2_in_rule__Final__Group__14967);
            rule__Final__Group__2();

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
    // $ANTLR end "rule__Final__Group__1"


    // $ANTLR start "rule__Final__Group__1__Impl"
    // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:2529:1: rule__Final__Group__1__Impl : ( 'Final' ) ;
    public final void rule__Final__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:2533:1: ( ( 'Final' ) )
            // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:2534:1: ( 'Final' )
            {
            // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:2534:1: ( 'Final' )
            // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:2535:1: 'Final'
            {
             before(grammarAccess.getFinalAccess().getFinalKeyword_1()); 
            match(input,29,FollowSets000.FOLLOW_29_in_rule__Final__Group__1__Impl4995); 
             after(grammarAccess.getFinalAccess().getFinalKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Final__Group__1__Impl"


    // $ANTLR start "rule__Final__Group__2"
    // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:2548:1: rule__Final__Group__2 : rule__Final__Group__2__Impl ;
    public final void rule__Final__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:2552:1: ( rule__Final__Group__2__Impl )
            // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:2553:2: rule__Final__Group__2__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Final__Group__2__Impl_in_rule__Final__Group__25026);
            rule__Final__Group__2__Impl();

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
    // $ANTLR end "rule__Final__Group__2"


    // $ANTLR start "rule__Final__Group__2__Impl"
    // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:2559:1: rule__Final__Group__2__Impl : ( ( rule__Final__NameAssignment_2 ) ) ;
    public final void rule__Final__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:2563:1: ( ( ( rule__Final__NameAssignment_2 ) ) )
            // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:2564:1: ( ( rule__Final__NameAssignment_2 ) )
            {
            // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:2564:1: ( ( rule__Final__NameAssignment_2 ) )
            // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:2565:1: ( rule__Final__NameAssignment_2 )
            {
             before(grammarAccess.getFinalAccess().getNameAssignment_2()); 
            // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:2566:1: ( rule__Final__NameAssignment_2 )
            // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:2566:2: rule__Final__NameAssignment_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Final__NameAssignment_2_in_rule__Final__Group__2__Impl5053);
            rule__Final__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getFinalAccess().getNameAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Final__Group__2__Impl"


    // $ANTLR start "rule__StateMachine__NodesAssignment_3_2"
    // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:2583:1: rule__StateMachine__NodesAssignment_3_2 : ( ruleAbstractNode ) ;
    public final void rule__StateMachine__NodesAssignment_3_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:2587:1: ( ( ruleAbstractNode ) )
            // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:2588:1: ( ruleAbstractNode )
            {
            // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:2588:1: ( ruleAbstractNode )
            // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:2589:1: ruleAbstractNode
            {
             before(grammarAccess.getStateMachineAccess().getNodesAbstractNodeParserRuleCall_3_2_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleAbstractNode_in_rule__StateMachine__NodesAssignment_3_25094);
            ruleAbstractNode();

            state._fsp--;

             after(grammarAccess.getStateMachineAccess().getNodesAbstractNodeParserRuleCall_3_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StateMachine__NodesAssignment_3_2"


    // $ANTLR start "rule__StateMachine__NodesAssignment_3_3_1"
    // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:2598:1: rule__StateMachine__NodesAssignment_3_3_1 : ( ruleAbstractNode ) ;
    public final void rule__StateMachine__NodesAssignment_3_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:2602:1: ( ( ruleAbstractNode ) )
            // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:2603:1: ( ruleAbstractNode )
            {
            // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:2603:1: ( ruleAbstractNode )
            // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:2604:1: ruleAbstractNode
            {
             before(grammarAccess.getStateMachineAccess().getNodesAbstractNodeParserRuleCall_3_3_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleAbstractNode_in_rule__StateMachine__NodesAssignment_3_3_15125);
            ruleAbstractNode();

            state._fsp--;

             after(grammarAccess.getStateMachineAccess().getNodesAbstractNodeParserRuleCall_3_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StateMachine__NodesAssignment_3_3_1"


    // $ANTLR start "rule__StateMachine__TransitionsAssignment_4_2"
    // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:2613:1: rule__StateMachine__TransitionsAssignment_4_2 : ( ruleTransition ) ;
    public final void rule__StateMachine__TransitionsAssignment_4_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:2617:1: ( ( ruleTransition ) )
            // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:2618:1: ( ruleTransition )
            {
            // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:2618:1: ( ruleTransition )
            // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:2619:1: ruleTransition
            {
             before(grammarAccess.getStateMachineAccess().getTransitionsTransitionParserRuleCall_4_2_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleTransition_in_rule__StateMachine__TransitionsAssignment_4_25156);
            ruleTransition();

            state._fsp--;

             after(grammarAccess.getStateMachineAccess().getTransitionsTransitionParserRuleCall_4_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StateMachine__TransitionsAssignment_4_2"


    // $ANTLR start "rule__StateMachine__TransitionsAssignment_4_3_1"
    // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:2628:1: rule__StateMachine__TransitionsAssignment_4_3_1 : ( ruleTransition ) ;
    public final void rule__StateMachine__TransitionsAssignment_4_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:2632:1: ( ( ruleTransition ) )
            // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:2633:1: ( ruleTransition )
            {
            // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:2633:1: ( ruleTransition )
            // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:2634:1: ruleTransition
            {
             before(grammarAccess.getStateMachineAccess().getTransitionsTransitionParserRuleCall_4_3_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleTransition_in_rule__StateMachine__TransitionsAssignment_4_3_15187);
            ruleTransition();

            state._fsp--;

             after(grammarAccess.getStateMachineAccess().getTransitionsTransitionParserRuleCall_4_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StateMachine__TransitionsAssignment_4_3_1"


    // $ANTLR start "rule__StateMachine__StateMachinesAssignment_5_2"
    // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:2643:1: rule__StateMachine__StateMachinesAssignment_5_2 : ( ruleStateMachine ) ;
    public final void rule__StateMachine__StateMachinesAssignment_5_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:2647:1: ( ( ruleStateMachine ) )
            // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:2648:1: ( ruleStateMachine )
            {
            // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:2648:1: ( ruleStateMachine )
            // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:2649:1: ruleStateMachine
            {
             before(grammarAccess.getStateMachineAccess().getStateMachinesStateMachineParserRuleCall_5_2_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleStateMachine_in_rule__StateMachine__StateMachinesAssignment_5_25218);
            ruleStateMachine();

            state._fsp--;

             after(grammarAccess.getStateMachineAccess().getStateMachinesStateMachineParserRuleCall_5_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StateMachine__StateMachinesAssignment_5_2"


    // $ANTLR start "rule__StateMachine__StateMachinesAssignment_5_3_1"
    // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:2658:1: rule__StateMachine__StateMachinesAssignment_5_3_1 : ( ruleStateMachine ) ;
    public final void rule__StateMachine__StateMachinesAssignment_5_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:2662:1: ( ( ruleStateMachine ) )
            // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:2663:1: ( ruleStateMachine )
            {
            // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:2663:1: ( ruleStateMachine )
            // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:2664:1: ruleStateMachine
            {
             before(grammarAccess.getStateMachineAccess().getStateMachinesStateMachineParserRuleCall_5_3_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleStateMachine_in_rule__StateMachine__StateMachinesAssignment_5_3_15249);
            ruleStateMachine();

            state._fsp--;

             after(grammarAccess.getStateMachineAccess().getStateMachinesStateMachineParserRuleCall_5_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StateMachine__StateMachinesAssignment_5_3_1"


    // $ANTLR start "rule__Transition__EventAssignment_3_1"
    // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:2673:1: rule__Transition__EventAssignment_3_1 : ( ruleEString ) ;
    public final void rule__Transition__EventAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:2677:1: ( ( ruleEString ) )
            // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:2678:1: ( ruleEString )
            {
            // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:2678:1: ( ruleEString )
            // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:2679:1: ruleEString
            {
             before(grammarAccess.getTransitionAccess().getEventEStringParserRuleCall_3_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__Transition__EventAssignment_3_15280);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getTransitionAccess().getEventEStringParserRuleCall_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__EventAssignment_3_1"


    // $ANTLR start "rule__Transition__SourceAssignment_4_1"
    // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:2688:1: rule__Transition__SourceAssignment_4_1 : ( ruleEString ) ;
    public final void rule__Transition__SourceAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:2692:1: ( ( ruleEString ) )
            // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:2693:1: ( ruleEString )
            {
            // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:2693:1: ( ruleEString )
            // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:2694:1: ruleEString
            {
             before(grammarAccess.getTransitionAccess().getSourceEStringParserRuleCall_4_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__Transition__SourceAssignment_4_15311);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getTransitionAccess().getSourceEStringParserRuleCall_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__SourceAssignment_4_1"


    // $ANTLR start "rule__Transition__TargetAssignment_5_1"
    // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:2703:1: rule__Transition__TargetAssignment_5_1 : ( ruleEString ) ;
    public final void rule__Transition__TargetAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:2707:1: ( ( ruleEString ) )
            // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:2708:1: ( ruleEString )
            {
            // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:2708:1: ( ruleEString )
            // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:2709:1: ruleEString
            {
             before(grammarAccess.getTransitionAccess().getTargetEStringParserRuleCall_5_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__Transition__TargetAssignment_5_15342);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getTransitionAccess().getTargetEStringParserRuleCall_5_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__TargetAssignment_5_1"


    // $ANTLR start "rule__State__NameAssignment_2"
    // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:2718:1: rule__State__NameAssignment_2 : ( ruleEString ) ;
    public final void rule__State__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:2722:1: ( ( ruleEString ) )
            // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:2723:1: ( ruleEString )
            {
            // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:2723:1: ( ruleEString )
            // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:2724:1: ruleEString
            {
             before(grammarAccess.getStateAccess().getNameEStringParserRuleCall_2_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__State__NameAssignment_25373);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getStateAccess().getNameEStringParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__State__NameAssignment_2"


    // $ANTLR start "rule__State__NestedAssignment_4_1"
    // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:2733:1: rule__State__NestedAssignment_4_1 : ( ruleStateMachine ) ;
    public final void rule__State__NestedAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:2737:1: ( ( ruleStateMachine ) )
            // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:2738:1: ( ruleStateMachine )
            {
            // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:2738:1: ( ruleStateMachine )
            // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:2739:1: ruleStateMachine
            {
             before(grammarAccess.getStateAccess().getNestedStateMachineParserRuleCall_4_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleStateMachine_in_rule__State__NestedAssignment_4_15404);
            ruleStateMachine();

            state._fsp--;

             after(grammarAccess.getStateAccess().getNestedStateMachineParserRuleCall_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__State__NestedAssignment_4_1"


    // $ANTLR start "rule__Initial__NameAssignment_2"
    // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:2748:1: rule__Initial__NameAssignment_2 : ( ruleEString ) ;
    public final void rule__Initial__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:2752:1: ( ( ruleEString ) )
            // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:2753:1: ( ruleEString )
            {
            // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:2753:1: ( ruleEString )
            // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:2754:1: ruleEString
            {
             before(grammarAccess.getInitialAccess().getNameEStringParserRuleCall_2_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__Initial__NameAssignment_25435);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getInitialAccess().getNameEStringParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Initial__NameAssignment_2"


    // $ANTLR start "rule__Junction__NameAssignment_2"
    // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:2763:1: rule__Junction__NameAssignment_2 : ( ruleEString ) ;
    public final void rule__Junction__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:2767:1: ( ( ruleEString ) )
            // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:2768:1: ( ruleEString )
            {
            // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:2768:1: ( ruleEString )
            // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:2769:1: ruleEString
            {
             before(grammarAccess.getJunctionAccess().getNameEStringParserRuleCall_2_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__Junction__NameAssignment_25466);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getJunctionAccess().getNameEStringParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Junction__NameAssignment_2"


    // $ANTLR start "rule__Fork__NameAssignment_2"
    // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:2778:1: rule__Fork__NameAssignment_2 : ( ruleEString ) ;
    public final void rule__Fork__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:2782:1: ( ( ruleEString ) )
            // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:2783:1: ( ruleEString )
            {
            // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:2783:1: ( ruleEString )
            // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:2784:1: ruleEString
            {
             before(grammarAccess.getForkAccess().getNameEStringParserRuleCall_2_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__Fork__NameAssignment_25497);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getForkAccess().getNameEStringParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Fork__NameAssignment_2"


    // $ANTLR start "rule__Join__NameAssignment_2"
    // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:2793:1: rule__Join__NameAssignment_2 : ( ruleEString ) ;
    public final void rule__Join__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:2797:1: ( ( ruleEString ) )
            // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:2798:1: ( ruleEString )
            {
            // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:2798:1: ( ruleEString )
            // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:2799:1: ruleEString
            {
             before(grammarAccess.getJoinAccess().getNameEStringParserRuleCall_2_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__Join__NameAssignment_25528);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getJoinAccess().getNameEStringParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Join__NameAssignment_2"


    // $ANTLR start "rule__Any__NameAssignment_2"
    // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:2808:1: rule__Any__NameAssignment_2 : ( ruleEString ) ;
    public final void rule__Any__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:2812:1: ( ( ruleEString ) )
            // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:2813:1: ( ruleEString )
            {
            // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:2813:1: ( ruleEString )
            // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:2814:1: ruleEString
            {
             before(grammarAccess.getAnyAccess().getNameEStringParserRuleCall_2_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__Any__NameAssignment_25559);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getAnyAccess().getNameEStringParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Any__NameAssignment_2"


    // $ANTLR start "rule__Final__NameAssignment_2"
    // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:2823:1: rule__Final__NameAssignment_2 : ( ruleEString ) ;
    public final void rule__Final__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:2827:1: ( ( ruleEString ) )
            // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:2828:1: ( ruleEString )
            {
            // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:2828:1: ( ruleEString )
            // ../ac.soton.xtext.statemachine.dsl.ui/src-gen/ac/soton/xtext/statemachine/ui/contentassist/antlr/internal/InternalDsl.g:2829:1: ruleEString
            {
             before(grammarAccess.getFinalAccess().getNameEStringParserRuleCall_2_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__Final__NameAssignment_25590);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getFinalAccess().getNameEStringParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Final__NameAssignment_2"

    // Delegated rules


 

    
    private static class FollowSets000 {
        public static final BitSet FOLLOW_ruleStateMachine_in_entryRuleStateMachine61 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleStateMachine68 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__StateMachine__Group__0_in_ruleStateMachine94 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAbstractNode_in_entryRuleAbstractNode121 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleAbstractNode128 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__AbstractNode__Alternatives_in_ruleAbstractNode154 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleTransition_in_entryRuleTransition181 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleTransition188 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Transition__Group__0_in_ruleTransition214 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_entryRuleEString241 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleEString248 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__EString__Alternatives_in_ruleEString274 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleState_in_entryRuleState301 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleState308 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__State__Group__0_in_ruleState334 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleInitial_in_entryRuleInitial361 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleInitial368 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Initial__Group__0_in_ruleInitial394 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleJunction_in_entryRuleJunction421 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleJunction428 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Junction__Group__0_in_ruleJunction454 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleFork_in_entryRuleFork481 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleFork488 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Fork__Group__0_in_ruleFork514 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleJoin_in_entryRuleJoin541 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleJoin548 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Join__Group__0_in_ruleJoin574 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAny_in_entryRuleAny601 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleAny608 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Any__Group__0_in_ruleAny634 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleFinal_in_entryRuleFinal661 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleFinal668 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Final__Group__0_in_ruleFinal694 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleState_in_rule__AbstractNode__Alternatives730 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleInitial_in_rule__AbstractNode__Alternatives747 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleJunction_in_rule__AbstractNode__Alternatives764 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleFork_in_rule__AbstractNode__Alternatives781 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleJoin_in_rule__AbstractNode__Alternatives798 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAny_in_rule__AbstractNode__Alternatives815 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleFinal_in_rule__AbstractNode__Alternatives832 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_STRING_in_rule__EString__Alternatives864 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_rule__EString__Alternatives881 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__StateMachine__Group__0__Impl_in_rule__StateMachine__Group__0911 = new BitSet(new long[]{0x0000000000000800L});
        public static final BitSet FOLLOW_rule__StateMachine__Group__1_in_rule__StateMachine__Group__0914 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__StateMachine__Group__1__Impl_in_rule__StateMachine__Group__1972 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_rule__StateMachine__Group__2_in_rule__StateMachine__Group__1975 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_11_in_rule__StateMachine__Group__1__Impl1003 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__StateMachine__Group__2__Impl_in_rule__StateMachine__Group__21034 = new BitSet(new long[]{0x0000000000036000L});
        public static final BitSet FOLLOW_rule__StateMachine__Group__3_in_rule__StateMachine__Group__21037 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_12_in_rule__StateMachine__Group__2__Impl1065 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__StateMachine__Group__3__Impl_in_rule__StateMachine__Group__31096 = new BitSet(new long[]{0x0000000000036000L});
        public static final BitSet FOLLOW_rule__StateMachine__Group__4_in_rule__StateMachine__Group__31099 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__StateMachine__Group_3__0_in_rule__StateMachine__Group__3__Impl1126 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__StateMachine__Group__4__Impl_in_rule__StateMachine__Group__41157 = new BitSet(new long[]{0x0000000000036000L});
        public static final BitSet FOLLOW_rule__StateMachine__Group__5_in_rule__StateMachine__Group__41160 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__StateMachine__Group_4__0_in_rule__StateMachine__Group__4__Impl1187 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__StateMachine__Group__5__Impl_in_rule__StateMachine__Group__51218 = new BitSet(new long[]{0x0000000000036000L});
        public static final BitSet FOLLOW_rule__StateMachine__Group__6_in_rule__StateMachine__Group__51221 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__StateMachine__Group_5__0_in_rule__StateMachine__Group__5__Impl1248 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__StateMachine__Group__6__Impl_in_rule__StateMachine__Group__61279 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_13_in_rule__StateMachine__Group__6__Impl1307 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__StateMachine__Group_3__0__Impl_in_rule__StateMachine__Group_3__01352 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_rule__StateMachine__Group_3__1_in_rule__StateMachine__Group_3__01355 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_14_in_rule__StateMachine__Group_3__0__Impl1383 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__StateMachine__Group_3__1__Impl_in_rule__StateMachine__Group_3__11414 = new BitSet(new long[]{0x000000003F400000L});
        public static final BitSet FOLLOW_rule__StateMachine__Group_3__2_in_rule__StateMachine__Group_3__11417 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_12_in_rule__StateMachine__Group_3__1__Impl1445 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__StateMachine__Group_3__2__Impl_in_rule__StateMachine__Group_3__21476 = new BitSet(new long[]{0x000000000000A000L});
        public static final BitSet FOLLOW_rule__StateMachine__Group_3__3_in_rule__StateMachine__Group_3__21479 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__StateMachine__NodesAssignment_3_2_in_rule__StateMachine__Group_3__2__Impl1506 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__StateMachine__Group_3__3__Impl_in_rule__StateMachine__Group_3__31536 = new BitSet(new long[]{0x000000000000A000L});
        public static final BitSet FOLLOW_rule__StateMachine__Group_3__4_in_rule__StateMachine__Group_3__31539 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__StateMachine__Group_3_3__0_in_rule__StateMachine__Group_3__3__Impl1566 = new BitSet(new long[]{0x0000000000008002L});
        public static final BitSet FOLLOW_rule__StateMachine__Group_3__4__Impl_in_rule__StateMachine__Group_3__41597 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_13_in_rule__StateMachine__Group_3__4__Impl1625 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__StateMachine__Group_3_3__0__Impl_in_rule__StateMachine__Group_3_3__01666 = new BitSet(new long[]{0x000000003F400000L});
        public static final BitSet FOLLOW_rule__StateMachine__Group_3_3__1_in_rule__StateMachine__Group_3_3__01669 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_15_in_rule__StateMachine__Group_3_3__0__Impl1697 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__StateMachine__Group_3_3__1__Impl_in_rule__StateMachine__Group_3_3__11728 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__StateMachine__NodesAssignment_3_3_1_in_rule__StateMachine__Group_3_3__1__Impl1755 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__StateMachine__Group_4__0__Impl_in_rule__StateMachine__Group_4__01789 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_rule__StateMachine__Group_4__1_in_rule__StateMachine__Group_4__01792 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_16_in_rule__StateMachine__Group_4__0__Impl1820 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__StateMachine__Group_4__1__Impl_in_rule__StateMachine__Group_4__11851 = new BitSet(new long[]{0x0000000000040000L});
        public static final BitSet FOLLOW_rule__StateMachine__Group_4__2_in_rule__StateMachine__Group_4__11854 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_12_in_rule__StateMachine__Group_4__1__Impl1882 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__StateMachine__Group_4__2__Impl_in_rule__StateMachine__Group_4__21913 = new BitSet(new long[]{0x000000000000A000L});
        public static final BitSet FOLLOW_rule__StateMachine__Group_4__3_in_rule__StateMachine__Group_4__21916 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__StateMachine__TransitionsAssignment_4_2_in_rule__StateMachine__Group_4__2__Impl1943 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__StateMachine__Group_4__3__Impl_in_rule__StateMachine__Group_4__31973 = new BitSet(new long[]{0x000000000000A000L});
        public static final BitSet FOLLOW_rule__StateMachine__Group_4__4_in_rule__StateMachine__Group_4__31976 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__StateMachine__Group_4_3__0_in_rule__StateMachine__Group_4__3__Impl2003 = new BitSet(new long[]{0x0000000000008002L});
        public static final BitSet FOLLOW_rule__StateMachine__Group_4__4__Impl_in_rule__StateMachine__Group_4__42034 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_13_in_rule__StateMachine__Group_4__4__Impl2062 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__StateMachine__Group_4_3__0__Impl_in_rule__StateMachine__Group_4_3__02103 = new BitSet(new long[]{0x0000000000040000L});
        public static final BitSet FOLLOW_rule__StateMachine__Group_4_3__1_in_rule__StateMachine__Group_4_3__02106 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_15_in_rule__StateMachine__Group_4_3__0__Impl2134 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__StateMachine__Group_4_3__1__Impl_in_rule__StateMachine__Group_4_3__12165 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__StateMachine__TransitionsAssignment_4_3_1_in_rule__StateMachine__Group_4_3__1__Impl2192 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__StateMachine__Group_5__0__Impl_in_rule__StateMachine__Group_5__02226 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_rule__StateMachine__Group_5__1_in_rule__StateMachine__Group_5__02229 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_17_in_rule__StateMachine__Group_5__0__Impl2257 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__StateMachine__Group_5__1__Impl_in_rule__StateMachine__Group_5__12288 = new BitSet(new long[]{0x0000000000000800L});
        public static final BitSet FOLLOW_rule__StateMachine__Group_5__2_in_rule__StateMachine__Group_5__12291 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_12_in_rule__StateMachine__Group_5__1__Impl2319 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__StateMachine__Group_5__2__Impl_in_rule__StateMachine__Group_5__22350 = new BitSet(new long[]{0x000000000000A000L});
        public static final BitSet FOLLOW_rule__StateMachine__Group_5__3_in_rule__StateMachine__Group_5__22353 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__StateMachine__StateMachinesAssignment_5_2_in_rule__StateMachine__Group_5__2__Impl2380 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__StateMachine__Group_5__3__Impl_in_rule__StateMachine__Group_5__32410 = new BitSet(new long[]{0x000000000000A000L});
        public static final BitSet FOLLOW_rule__StateMachine__Group_5__4_in_rule__StateMachine__Group_5__32413 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__StateMachine__Group_5_3__0_in_rule__StateMachine__Group_5__3__Impl2440 = new BitSet(new long[]{0x0000000000008002L});
        public static final BitSet FOLLOW_rule__StateMachine__Group_5__4__Impl_in_rule__StateMachine__Group_5__42471 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_13_in_rule__StateMachine__Group_5__4__Impl2499 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__StateMachine__Group_5_3__0__Impl_in_rule__StateMachine__Group_5_3__02540 = new BitSet(new long[]{0x0000000000000800L});
        public static final BitSet FOLLOW_rule__StateMachine__Group_5_3__1_in_rule__StateMachine__Group_5_3__02543 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_15_in_rule__StateMachine__Group_5_3__0__Impl2571 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__StateMachine__Group_5_3__1__Impl_in_rule__StateMachine__Group_5_3__12602 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__StateMachine__StateMachinesAssignment_5_3_1_in_rule__StateMachine__Group_5_3__1__Impl2629 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Transition__Group__0__Impl_in_rule__Transition__Group__02663 = new BitSet(new long[]{0x0000000000040000L});
        public static final BitSet FOLLOW_rule__Transition__Group__1_in_rule__Transition__Group__02666 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Transition__Group__1__Impl_in_rule__Transition__Group__12724 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_rule__Transition__Group__2_in_rule__Transition__Group__12727 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_18_in_rule__Transition__Group__1__Impl2755 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Transition__Group__2__Impl_in_rule__Transition__Group__22786 = new BitSet(new long[]{0x0000000000382000L});
        public static final BitSet FOLLOW_rule__Transition__Group__3_in_rule__Transition__Group__22789 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_12_in_rule__Transition__Group__2__Impl2817 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Transition__Group__3__Impl_in_rule__Transition__Group__32848 = new BitSet(new long[]{0x0000000000382000L});
        public static final BitSet FOLLOW_rule__Transition__Group__4_in_rule__Transition__Group__32851 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Transition__Group_3__0_in_rule__Transition__Group__3__Impl2878 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Transition__Group__4__Impl_in_rule__Transition__Group__42909 = new BitSet(new long[]{0x0000000000382000L});
        public static final BitSet FOLLOW_rule__Transition__Group__5_in_rule__Transition__Group__42912 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Transition__Group_4__0_in_rule__Transition__Group__4__Impl2939 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Transition__Group__5__Impl_in_rule__Transition__Group__52970 = new BitSet(new long[]{0x0000000000382000L});
        public static final BitSet FOLLOW_rule__Transition__Group__6_in_rule__Transition__Group__52973 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Transition__Group_5__0_in_rule__Transition__Group__5__Impl3000 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Transition__Group__6__Impl_in_rule__Transition__Group__63031 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_13_in_rule__Transition__Group__6__Impl3059 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Transition__Group_3__0__Impl_in_rule__Transition__Group_3__03104 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__Transition__Group_3__1_in_rule__Transition__Group_3__03107 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_19_in_rule__Transition__Group_3__0__Impl3135 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Transition__Group_3__1__Impl_in_rule__Transition__Group_3__13166 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Transition__EventAssignment_3_1_in_rule__Transition__Group_3__1__Impl3193 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Transition__Group_4__0__Impl_in_rule__Transition__Group_4__03227 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__Transition__Group_4__1_in_rule__Transition__Group_4__03230 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_20_in_rule__Transition__Group_4__0__Impl3258 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Transition__Group_4__1__Impl_in_rule__Transition__Group_4__13289 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Transition__SourceAssignment_4_1_in_rule__Transition__Group_4__1__Impl3316 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Transition__Group_5__0__Impl_in_rule__Transition__Group_5__03350 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__Transition__Group_5__1_in_rule__Transition__Group_5__03353 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_21_in_rule__Transition__Group_5__0__Impl3381 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Transition__Group_5__1__Impl_in_rule__Transition__Group_5__13412 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Transition__TargetAssignment_5_1_in_rule__Transition__Group_5__1__Impl3439 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__State__Group__0__Impl_in_rule__State__Group__03473 = new BitSet(new long[]{0x0000000000400000L});
        public static final BitSet FOLLOW_rule__State__Group__1_in_rule__State__Group__03476 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__State__Group__1__Impl_in_rule__State__Group__13534 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__State__Group__2_in_rule__State__Group__13537 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_22_in_rule__State__Group__1__Impl3565 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__State__Group__2__Impl_in_rule__State__Group__23596 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_rule__State__Group__3_in_rule__State__Group__23599 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__State__NameAssignment_2_in_rule__State__Group__2__Impl3626 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__State__Group__3__Impl_in_rule__State__Group__33656 = new BitSet(new long[]{0x0000000000802000L});
        public static final BitSet FOLLOW_rule__State__Group__4_in_rule__State__Group__33659 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_12_in_rule__State__Group__3__Impl3687 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__State__Group__4__Impl_in_rule__State__Group__43718 = new BitSet(new long[]{0x0000000000802000L});
        public static final BitSet FOLLOW_rule__State__Group__5_in_rule__State__Group__43721 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__State__Group_4__0_in_rule__State__Group__4__Impl3748 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__State__Group__5__Impl_in_rule__State__Group__53779 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_13_in_rule__State__Group__5__Impl3807 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__State__Group_4__0__Impl_in_rule__State__Group_4__03850 = new BitSet(new long[]{0x0000000000000800L});
        public static final BitSet FOLLOW_rule__State__Group_4__1_in_rule__State__Group_4__03853 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_23_in_rule__State__Group_4__0__Impl3881 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__State__Group_4__1__Impl_in_rule__State__Group_4__13912 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__State__NestedAssignment_4_1_in_rule__State__Group_4__1__Impl3939 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Initial__Group__0__Impl_in_rule__Initial__Group__03973 = new BitSet(new long[]{0x0000000001000000L});
        public static final BitSet FOLLOW_rule__Initial__Group__1_in_rule__Initial__Group__03976 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Initial__Group__1__Impl_in_rule__Initial__Group__14034 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__Initial__Group__2_in_rule__Initial__Group__14037 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_24_in_rule__Initial__Group__1__Impl4065 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Initial__Group__2__Impl_in_rule__Initial__Group__24096 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Initial__NameAssignment_2_in_rule__Initial__Group__2__Impl4123 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Junction__Group__0__Impl_in_rule__Junction__Group__04159 = new BitSet(new long[]{0x0000000002000000L});
        public static final BitSet FOLLOW_rule__Junction__Group__1_in_rule__Junction__Group__04162 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Junction__Group__1__Impl_in_rule__Junction__Group__14220 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__Junction__Group__2_in_rule__Junction__Group__14223 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_25_in_rule__Junction__Group__1__Impl4251 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Junction__Group__2__Impl_in_rule__Junction__Group__24282 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Junction__NameAssignment_2_in_rule__Junction__Group__2__Impl4309 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Fork__Group__0__Impl_in_rule__Fork__Group__04345 = new BitSet(new long[]{0x0000000004000000L});
        public static final BitSet FOLLOW_rule__Fork__Group__1_in_rule__Fork__Group__04348 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Fork__Group__1__Impl_in_rule__Fork__Group__14406 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__Fork__Group__2_in_rule__Fork__Group__14409 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_26_in_rule__Fork__Group__1__Impl4437 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Fork__Group__2__Impl_in_rule__Fork__Group__24468 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Fork__NameAssignment_2_in_rule__Fork__Group__2__Impl4495 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Join__Group__0__Impl_in_rule__Join__Group__04531 = new BitSet(new long[]{0x0000000008000000L});
        public static final BitSet FOLLOW_rule__Join__Group__1_in_rule__Join__Group__04534 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Join__Group__1__Impl_in_rule__Join__Group__14592 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__Join__Group__2_in_rule__Join__Group__14595 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_27_in_rule__Join__Group__1__Impl4623 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Join__Group__2__Impl_in_rule__Join__Group__24654 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Join__NameAssignment_2_in_rule__Join__Group__2__Impl4681 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Any__Group__0__Impl_in_rule__Any__Group__04717 = new BitSet(new long[]{0x0000000010000000L});
        public static final BitSet FOLLOW_rule__Any__Group__1_in_rule__Any__Group__04720 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Any__Group__1__Impl_in_rule__Any__Group__14778 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__Any__Group__2_in_rule__Any__Group__14781 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_28_in_rule__Any__Group__1__Impl4809 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Any__Group__2__Impl_in_rule__Any__Group__24840 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Any__NameAssignment_2_in_rule__Any__Group__2__Impl4867 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Final__Group__0__Impl_in_rule__Final__Group__04903 = new BitSet(new long[]{0x000000003F400000L});
        public static final BitSet FOLLOW_rule__Final__Group__1_in_rule__Final__Group__04906 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Final__Group__1__Impl_in_rule__Final__Group__14964 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__Final__Group__2_in_rule__Final__Group__14967 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_29_in_rule__Final__Group__1__Impl4995 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Final__Group__2__Impl_in_rule__Final__Group__25026 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Final__NameAssignment_2_in_rule__Final__Group__2__Impl5053 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAbstractNode_in_rule__StateMachine__NodesAssignment_3_25094 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAbstractNode_in_rule__StateMachine__NodesAssignment_3_3_15125 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleTransition_in_rule__StateMachine__TransitionsAssignment_4_25156 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleTransition_in_rule__StateMachine__TransitionsAssignment_4_3_15187 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleStateMachine_in_rule__StateMachine__StateMachinesAssignment_5_25218 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleStateMachine_in_rule__StateMachine__StateMachinesAssignment_5_3_15249 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__Transition__EventAssignment_3_15280 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__Transition__SourceAssignment_4_15311 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__Transition__TargetAssignment_5_15342 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__State__NameAssignment_25373 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleStateMachine_in_rule__State__NestedAssignment_4_15404 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__Initial__NameAssignment_25435 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__Junction__NameAssignment_25466 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__Fork__NameAssignment_25497 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__Join__NameAssignment_25528 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__Any__NameAssignment_25559 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__Final__NameAssignment_25590 = new BitSet(new long[]{0x0000000000000002L});
    }


}