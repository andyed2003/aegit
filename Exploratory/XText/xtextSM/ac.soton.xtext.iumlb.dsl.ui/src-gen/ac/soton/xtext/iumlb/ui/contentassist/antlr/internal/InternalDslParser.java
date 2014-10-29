package ac.soton.xtext.iumlb.ui.contentassist.antlr.internal; 

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
import ac.soton.xtext.iumlb.services.DslGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalDslParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'Statemachine'", "'{'", "'}'", "'comment'", "'refines'", "'nodes'", "','", "'transitions'", "'State'", "'incoming'", "'('", "')'", "'outgoing'", "'statemachines'", "'invariants'", "'Transition'", "'target'", "'source'", "'elaborates'", "'Initial'", "'internalId'", "'Final'", "'Any'", "'Junction'", "'Fork'", "'Invariant'", "'predicate'", "'localGenerated'", "'extended'", "'theorem'"
    };
    public static final int RULE_ID=5;
    public static final int T__40=40;
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
    public static final int RULE_STRING=4;
    public static final int T__32=32;
    public static final int T__33=33;
    public static final int T__16=16;
    public static final int T__34=34;
    public static final int T__15=15;
    public static final int T__35=35;
    public static final int T__18=18;
    public static final int T__36=36;
    public static final int T__17=17;
    public static final int T__37=37;
    public static final int T__12=12;
    public static final int T__38=38;
    public static final int T__11=11;
    public static final int T__39=39;
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
    public String getGrammarFileName() { return "../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g"; }


     
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




    // $ANTLR start "entryRuleAbstractNode"
    // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:60:1: entryRuleAbstractNode : ruleAbstractNode EOF ;
    public final void entryRuleAbstractNode() throws RecognitionException {
        try {
            // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:61:1: ( ruleAbstractNode EOF )
            // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:62:1: ruleAbstractNode EOF
            {
             before(grammarAccess.getAbstractNodeRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleAbstractNode_in_entryRuleAbstractNode61);
            ruleAbstractNode();

            state._fsp--;

             after(grammarAccess.getAbstractNodeRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleAbstractNode68); 

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
    // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:69:1: ruleAbstractNode : ( ( rule__AbstractNode__Alternatives ) ) ;
    public final void ruleAbstractNode() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:73:2: ( ( ( rule__AbstractNode__Alternatives ) ) )
            // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:74:1: ( ( rule__AbstractNode__Alternatives ) )
            {
            // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:74:1: ( ( rule__AbstractNode__Alternatives ) )
            // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:75:1: ( rule__AbstractNode__Alternatives )
            {
             before(grammarAccess.getAbstractNodeAccess().getAlternatives()); 
            // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:76:1: ( rule__AbstractNode__Alternatives )
            // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:76:2: rule__AbstractNode__Alternatives
            {
            pushFollow(FollowSets000.FOLLOW_rule__AbstractNode__Alternatives_in_ruleAbstractNode94);
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


    // $ANTLR start "entryRuleStatemachine"
    // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:88:1: entryRuleStatemachine : ruleStatemachine EOF ;
    public final void entryRuleStatemachine() throws RecognitionException {
        try {
            // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:89:1: ( ruleStatemachine EOF )
            // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:90:1: ruleStatemachine EOF
            {
             before(grammarAccess.getStatemachineRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleStatemachine_in_entryRuleStatemachine121);
            ruleStatemachine();

            state._fsp--;

             after(grammarAccess.getStatemachineRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleStatemachine128); 

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
    // $ANTLR end "entryRuleStatemachine"


    // $ANTLR start "ruleStatemachine"
    // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:97:1: ruleStatemachine : ( ( rule__Statemachine__Group__0 ) ) ;
    public final void ruleStatemachine() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:101:2: ( ( ( rule__Statemachine__Group__0 ) ) )
            // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:102:1: ( ( rule__Statemachine__Group__0 ) )
            {
            // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:102:1: ( ( rule__Statemachine__Group__0 ) )
            // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:103:1: ( rule__Statemachine__Group__0 )
            {
             before(grammarAccess.getStatemachineAccess().getGroup()); 
            // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:104:1: ( rule__Statemachine__Group__0 )
            // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:104:2: rule__Statemachine__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__Statemachine__Group__0_in_ruleStatemachine154);
            rule__Statemachine__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getStatemachineAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleStatemachine"


    // $ANTLR start "entryRuleState"
    // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:116:1: entryRuleState : ruleState EOF ;
    public final void entryRuleState() throws RecognitionException {
        try {
            // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:117:1: ( ruleState EOF )
            // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:118:1: ruleState EOF
            {
             before(grammarAccess.getStateRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleState_in_entryRuleState181);
            ruleState();

            state._fsp--;

             after(grammarAccess.getStateRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleState188); 

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
    // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:125:1: ruleState : ( ( rule__State__Group__0 ) ) ;
    public final void ruleState() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:129:2: ( ( ( rule__State__Group__0 ) ) )
            // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:130:1: ( ( rule__State__Group__0 ) )
            {
            // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:130:1: ( ( rule__State__Group__0 ) )
            // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:131:1: ( rule__State__Group__0 )
            {
             before(grammarAccess.getStateAccess().getGroup()); 
            // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:132:1: ( rule__State__Group__0 )
            // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:132:2: rule__State__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__State__Group__0_in_ruleState214);
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


    // $ANTLR start "entryRuleEString"
    // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:146:1: entryRuleEString : ruleEString EOF ;
    public final void entryRuleEString() throws RecognitionException {
        try {
            // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:147:1: ( ruleEString EOF )
            // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:148:1: ruleEString EOF
            {
             before(grammarAccess.getEStringRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_entryRuleEString243);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getEStringRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleEString250); 

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
    // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:155:1: ruleEString : ( ( rule__EString__Alternatives ) ) ;
    public final void ruleEString() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:159:2: ( ( ( rule__EString__Alternatives ) ) )
            // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:160:1: ( ( rule__EString__Alternatives ) )
            {
            // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:160:1: ( ( rule__EString__Alternatives ) )
            // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:161:1: ( rule__EString__Alternatives )
            {
             before(grammarAccess.getEStringAccess().getAlternatives()); 
            // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:162:1: ( rule__EString__Alternatives )
            // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:162:2: rule__EString__Alternatives
            {
            pushFollow(FollowSets000.FOLLOW_rule__EString__Alternatives_in_ruleEString276);
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


    // $ANTLR start "entryRuleTransition"
    // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:176:1: entryRuleTransition : ruleTransition EOF ;
    public final void entryRuleTransition() throws RecognitionException {
        try {
            // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:177:1: ( ruleTransition EOF )
            // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:178:1: ruleTransition EOF
            {
             before(grammarAccess.getTransitionRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleTransition_in_entryRuleTransition305);
            ruleTransition();

            state._fsp--;

             after(grammarAccess.getTransitionRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleTransition312); 

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
    // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:185:1: ruleTransition : ( ( rule__Transition__Group__0 ) ) ;
    public final void ruleTransition() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:189:2: ( ( ( rule__Transition__Group__0 ) ) )
            // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:190:1: ( ( rule__Transition__Group__0 ) )
            {
            // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:190:1: ( ( rule__Transition__Group__0 ) )
            // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:191:1: ( rule__Transition__Group__0 )
            {
             before(grammarAccess.getTransitionAccess().getGroup()); 
            // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:192:1: ( rule__Transition__Group__0 )
            // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:192:2: rule__Transition__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__Transition__Group__0_in_ruleTransition338);
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


    // $ANTLR start "entryRuleInitial"
    // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:210:1: entryRuleInitial : ruleInitial EOF ;
    public final void entryRuleInitial() throws RecognitionException {
        try {
            // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:211:1: ( ruleInitial EOF )
            // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:212:1: ruleInitial EOF
            {
             before(grammarAccess.getInitialRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleInitial_in_entryRuleInitial371);
            ruleInitial();

            state._fsp--;

             after(grammarAccess.getInitialRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleInitial378); 

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
    // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:219:1: ruleInitial : ( ( rule__Initial__Group__0 ) ) ;
    public final void ruleInitial() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:223:2: ( ( ( rule__Initial__Group__0 ) ) )
            // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:224:1: ( ( rule__Initial__Group__0 ) )
            {
            // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:224:1: ( ( rule__Initial__Group__0 ) )
            // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:225:1: ( rule__Initial__Group__0 )
            {
             before(grammarAccess.getInitialAccess().getGroup()); 
            // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:226:1: ( rule__Initial__Group__0 )
            // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:226:2: rule__Initial__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__Initial__Group__0_in_ruleInitial404);
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


    // $ANTLR start "entryRuleFinal"
    // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:238:1: entryRuleFinal : ruleFinal EOF ;
    public final void entryRuleFinal() throws RecognitionException {
        try {
            // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:239:1: ( ruleFinal EOF )
            // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:240:1: ruleFinal EOF
            {
             before(grammarAccess.getFinalRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleFinal_in_entryRuleFinal431);
            ruleFinal();

            state._fsp--;

             after(grammarAccess.getFinalRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleFinal438); 

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
    // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:247:1: ruleFinal : ( ( rule__Final__Group__0 ) ) ;
    public final void ruleFinal() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:251:2: ( ( ( rule__Final__Group__0 ) ) )
            // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:252:1: ( ( rule__Final__Group__0 ) )
            {
            // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:252:1: ( ( rule__Final__Group__0 ) )
            // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:253:1: ( rule__Final__Group__0 )
            {
             before(grammarAccess.getFinalAccess().getGroup()); 
            // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:254:1: ( rule__Final__Group__0 )
            // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:254:2: rule__Final__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__Final__Group__0_in_ruleFinal464);
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


    // $ANTLR start "entryRuleAny"
    // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:266:1: entryRuleAny : ruleAny EOF ;
    public final void entryRuleAny() throws RecognitionException {
        try {
            // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:267:1: ( ruleAny EOF )
            // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:268:1: ruleAny EOF
            {
             before(grammarAccess.getAnyRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleAny_in_entryRuleAny491);
            ruleAny();

            state._fsp--;

             after(grammarAccess.getAnyRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleAny498); 

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
    // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:275:1: ruleAny : ( ( rule__Any__Group__0 ) ) ;
    public final void ruleAny() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:279:2: ( ( ( rule__Any__Group__0 ) ) )
            // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:280:1: ( ( rule__Any__Group__0 ) )
            {
            // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:280:1: ( ( rule__Any__Group__0 ) )
            // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:281:1: ( rule__Any__Group__0 )
            {
             before(grammarAccess.getAnyAccess().getGroup()); 
            // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:282:1: ( rule__Any__Group__0 )
            // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:282:2: rule__Any__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__Any__Group__0_in_ruleAny524);
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


    // $ANTLR start "entryRuleJunction"
    // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:294:1: entryRuleJunction : ruleJunction EOF ;
    public final void entryRuleJunction() throws RecognitionException {
        try {
            // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:295:1: ( ruleJunction EOF )
            // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:296:1: ruleJunction EOF
            {
             before(grammarAccess.getJunctionRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleJunction_in_entryRuleJunction551);
            ruleJunction();

            state._fsp--;

             after(grammarAccess.getJunctionRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleJunction558); 

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
    // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:303:1: ruleJunction : ( ( rule__Junction__Group__0 ) ) ;
    public final void ruleJunction() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:307:2: ( ( ( rule__Junction__Group__0 ) ) )
            // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:308:1: ( ( rule__Junction__Group__0 ) )
            {
            // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:308:1: ( ( rule__Junction__Group__0 ) )
            // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:309:1: ( rule__Junction__Group__0 )
            {
             before(grammarAccess.getJunctionAccess().getGroup()); 
            // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:310:1: ( rule__Junction__Group__0 )
            // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:310:2: rule__Junction__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__Junction__Group__0_in_ruleJunction584);
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
    // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:322:1: entryRuleFork : ruleFork EOF ;
    public final void entryRuleFork() throws RecognitionException {
        try {
            // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:323:1: ( ruleFork EOF )
            // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:324:1: ruleFork EOF
            {
             before(grammarAccess.getForkRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleFork_in_entryRuleFork611);
            ruleFork();

            state._fsp--;

             after(grammarAccess.getForkRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleFork618); 

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
    // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:331:1: ruleFork : ( ( rule__Fork__Group__0 ) ) ;
    public final void ruleFork() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:335:2: ( ( ( rule__Fork__Group__0 ) ) )
            // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:336:1: ( ( rule__Fork__Group__0 ) )
            {
            // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:336:1: ( ( rule__Fork__Group__0 ) )
            // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:337:1: ( rule__Fork__Group__0 )
            {
             before(grammarAccess.getForkAccess().getGroup()); 
            // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:338:1: ( rule__Fork__Group__0 )
            // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:338:2: rule__Fork__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__Fork__Group__0_in_ruleFork644);
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


    // $ANTLR start "entryRuleInvariant"
    // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:352:1: entryRuleInvariant : ruleInvariant EOF ;
    public final void entryRuleInvariant() throws RecognitionException {
        try {
            // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:353:1: ( ruleInvariant EOF )
            // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:354:1: ruleInvariant EOF
            {
             before(grammarAccess.getInvariantRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleInvariant_in_entryRuleInvariant673);
            ruleInvariant();

            state._fsp--;

             after(grammarAccess.getInvariantRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleInvariant680); 

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
    // $ANTLR end "entryRuleInvariant"


    // $ANTLR start "ruleInvariant"
    // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:361:1: ruleInvariant : ( ( rule__Invariant__Group__0 ) ) ;
    public final void ruleInvariant() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:365:2: ( ( ( rule__Invariant__Group__0 ) ) )
            // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:366:1: ( ( rule__Invariant__Group__0 ) )
            {
            // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:366:1: ( ( rule__Invariant__Group__0 ) )
            // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:367:1: ( rule__Invariant__Group__0 )
            {
             before(grammarAccess.getInvariantAccess().getGroup()); 
            // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:368:1: ( rule__Invariant__Group__0 )
            // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:368:2: rule__Invariant__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__Invariant__Group__0_in_ruleInvariant706);
            rule__Invariant__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getInvariantAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleInvariant"


    // $ANTLR start "rule__AbstractNode__Alternatives"
    // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:380:1: rule__AbstractNode__Alternatives : ( ( ruleState ) | ( ruleInitial ) | ( ruleFinal ) | ( ruleAny ) | ( ruleJunction ) | ( ruleFork ) );
    public final void rule__AbstractNode__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:384:1: ( ( ruleState ) | ( ruleInitial ) | ( ruleFinal ) | ( ruleAny ) | ( ruleJunction ) | ( ruleFork ) )
            int alt1=6;
            switch ( input.LA(1) ) {
            case 38:
                {
                switch ( input.LA(2) ) {
                case 34:
                    {
                    alt1=5;
                    }
                    break;
                case 30:
                    {
                    alt1=2;
                    }
                    break;
                case 32:
                    {
                    alt1=3;
                    }
                    break;
                case 35:
                    {
                    alt1=6;
                    }
                    break;
                case 33:
                    {
                    alt1=4;
                    }
                    break;
                case 19:
                    {
                    alt1=1;
                    }
                    break;
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("", 1, 1, input);

                    throw nvae;
                }

                }
                break;
            case 19:
                {
                alt1=1;
                }
                break;
            case 30:
                {
                alt1=2;
                }
                break;
            case 32:
                {
                alt1=3;
                }
                break;
            case 33:
                {
                alt1=4;
                }
                break;
            case 34:
                {
                alt1=5;
                }
                break;
            case 35:
                {
                alt1=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }

            switch (alt1) {
                case 1 :
                    // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:385:1: ( ruleState )
                    {
                    // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:385:1: ( ruleState )
                    // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:386:1: ruleState
                    {
                     before(grammarAccess.getAbstractNodeAccess().getStateParserRuleCall_0()); 
                    pushFollow(FollowSets000.FOLLOW_ruleState_in_rule__AbstractNode__Alternatives742);
                    ruleState();

                    state._fsp--;

                     after(grammarAccess.getAbstractNodeAccess().getStateParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:391:6: ( ruleInitial )
                    {
                    // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:391:6: ( ruleInitial )
                    // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:392:1: ruleInitial
                    {
                     before(grammarAccess.getAbstractNodeAccess().getInitialParserRuleCall_1()); 
                    pushFollow(FollowSets000.FOLLOW_ruleInitial_in_rule__AbstractNode__Alternatives759);
                    ruleInitial();

                    state._fsp--;

                     after(grammarAccess.getAbstractNodeAccess().getInitialParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:397:6: ( ruleFinal )
                    {
                    // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:397:6: ( ruleFinal )
                    // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:398:1: ruleFinal
                    {
                     before(grammarAccess.getAbstractNodeAccess().getFinalParserRuleCall_2()); 
                    pushFollow(FollowSets000.FOLLOW_ruleFinal_in_rule__AbstractNode__Alternatives776);
                    ruleFinal();

                    state._fsp--;

                     after(grammarAccess.getAbstractNodeAccess().getFinalParserRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:403:6: ( ruleAny )
                    {
                    // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:403:6: ( ruleAny )
                    // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:404:1: ruleAny
                    {
                     before(grammarAccess.getAbstractNodeAccess().getAnyParserRuleCall_3()); 
                    pushFollow(FollowSets000.FOLLOW_ruleAny_in_rule__AbstractNode__Alternatives793);
                    ruleAny();

                    state._fsp--;

                     after(grammarAccess.getAbstractNodeAccess().getAnyParserRuleCall_3()); 

                    }


                    }
                    break;
                case 5 :
                    // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:409:6: ( ruleJunction )
                    {
                    // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:409:6: ( ruleJunction )
                    // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:410:1: ruleJunction
                    {
                     before(grammarAccess.getAbstractNodeAccess().getJunctionParserRuleCall_4()); 
                    pushFollow(FollowSets000.FOLLOW_ruleJunction_in_rule__AbstractNode__Alternatives810);
                    ruleJunction();

                    state._fsp--;

                     after(grammarAccess.getAbstractNodeAccess().getJunctionParserRuleCall_4()); 

                    }


                    }
                    break;
                case 6 :
                    // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:415:6: ( ruleFork )
                    {
                    // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:415:6: ( ruleFork )
                    // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:416:1: ruleFork
                    {
                     before(grammarAccess.getAbstractNodeAccess().getForkParserRuleCall_5()); 
                    pushFollow(FollowSets000.FOLLOW_ruleFork_in_rule__AbstractNode__Alternatives827);
                    ruleFork();

                    state._fsp--;

                     after(grammarAccess.getAbstractNodeAccess().getForkParserRuleCall_5()); 

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
    // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:427:1: rule__EString__Alternatives : ( ( RULE_STRING ) | ( RULE_ID ) );
    public final void rule__EString__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:431:1: ( ( RULE_STRING ) | ( RULE_ID ) )
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
                    // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:432:1: ( RULE_STRING )
                    {
                    // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:432:1: ( RULE_STRING )
                    // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:433:1: RULE_STRING
                    {
                     before(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 
                    match(input,RULE_STRING,FollowSets000.FOLLOW_RULE_STRING_in_rule__EString__Alternatives860); 
                     after(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:438:6: ( RULE_ID )
                    {
                    // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:438:6: ( RULE_ID )
                    // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:439:1: RULE_ID
                    {
                     before(grammarAccess.getEStringAccess().getIDTerminalRuleCall_1()); 
                    match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_rule__EString__Alternatives877); 
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


    // $ANTLR start "rule__Statemachine__Group__0"
    // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:451:1: rule__Statemachine__Group__0 : rule__Statemachine__Group__0__Impl rule__Statemachine__Group__1 ;
    public final void rule__Statemachine__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:455:1: ( rule__Statemachine__Group__0__Impl rule__Statemachine__Group__1 )
            // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:456:2: rule__Statemachine__Group__0__Impl rule__Statemachine__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Statemachine__Group__0__Impl_in_rule__Statemachine__Group__0907);
            rule__Statemachine__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Statemachine__Group__1_in_rule__Statemachine__Group__0910);
            rule__Statemachine__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Statemachine__Group__0"


    // $ANTLR start "rule__Statemachine__Group__0__Impl"
    // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:463:1: rule__Statemachine__Group__0__Impl : ( ( rule__Statemachine__LocalGeneratedAssignment_0 )? ) ;
    public final void rule__Statemachine__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:467:1: ( ( ( rule__Statemachine__LocalGeneratedAssignment_0 )? ) )
            // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:468:1: ( ( rule__Statemachine__LocalGeneratedAssignment_0 )? )
            {
            // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:468:1: ( ( rule__Statemachine__LocalGeneratedAssignment_0 )? )
            // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:469:1: ( rule__Statemachine__LocalGeneratedAssignment_0 )?
            {
             before(grammarAccess.getStatemachineAccess().getLocalGeneratedAssignment_0()); 
            // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:470:1: ( rule__Statemachine__LocalGeneratedAssignment_0 )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==38) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:470:2: rule__Statemachine__LocalGeneratedAssignment_0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__Statemachine__LocalGeneratedAssignment_0_in_rule__Statemachine__Group__0__Impl937);
                    rule__Statemachine__LocalGeneratedAssignment_0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getStatemachineAccess().getLocalGeneratedAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Statemachine__Group__0__Impl"


    // $ANTLR start "rule__Statemachine__Group__1"
    // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:480:1: rule__Statemachine__Group__1 : rule__Statemachine__Group__1__Impl rule__Statemachine__Group__2 ;
    public final void rule__Statemachine__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:484:1: ( rule__Statemachine__Group__1__Impl rule__Statemachine__Group__2 )
            // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:485:2: rule__Statemachine__Group__1__Impl rule__Statemachine__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Statemachine__Group__1__Impl_in_rule__Statemachine__Group__1968);
            rule__Statemachine__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Statemachine__Group__2_in_rule__Statemachine__Group__1971);
            rule__Statemachine__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Statemachine__Group__1"


    // $ANTLR start "rule__Statemachine__Group__1__Impl"
    // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:492:1: rule__Statemachine__Group__1__Impl : ( 'Statemachine' ) ;
    public final void rule__Statemachine__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:496:1: ( ( 'Statemachine' ) )
            // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:497:1: ( 'Statemachine' )
            {
            // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:497:1: ( 'Statemachine' )
            // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:498:1: 'Statemachine'
            {
             before(grammarAccess.getStatemachineAccess().getStatemachineKeyword_1()); 
            match(input,11,FollowSets000.FOLLOW_11_in_rule__Statemachine__Group__1__Impl999); 
             after(grammarAccess.getStatemachineAccess().getStatemachineKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Statemachine__Group__1__Impl"


    // $ANTLR start "rule__Statemachine__Group__2"
    // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:511:1: rule__Statemachine__Group__2 : rule__Statemachine__Group__2__Impl rule__Statemachine__Group__3 ;
    public final void rule__Statemachine__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:515:1: ( rule__Statemachine__Group__2__Impl rule__Statemachine__Group__3 )
            // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:516:2: rule__Statemachine__Group__2__Impl rule__Statemachine__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__Statemachine__Group__2__Impl_in_rule__Statemachine__Group__21030);
            rule__Statemachine__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Statemachine__Group__3_in_rule__Statemachine__Group__21033);
            rule__Statemachine__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Statemachine__Group__2"


    // $ANTLR start "rule__Statemachine__Group__2__Impl"
    // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:523:1: rule__Statemachine__Group__2__Impl : ( ( rule__Statemachine__NameAssignment_2 ) ) ;
    public final void rule__Statemachine__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:527:1: ( ( ( rule__Statemachine__NameAssignment_2 ) ) )
            // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:528:1: ( ( rule__Statemachine__NameAssignment_2 ) )
            {
            // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:528:1: ( ( rule__Statemachine__NameAssignment_2 ) )
            // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:529:1: ( rule__Statemachine__NameAssignment_2 )
            {
             before(grammarAccess.getStatemachineAccess().getNameAssignment_2()); 
            // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:530:1: ( rule__Statemachine__NameAssignment_2 )
            // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:530:2: rule__Statemachine__NameAssignment_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Statemachine__NameAssignment_2_in_rule__Statemachine__Group__2__Impl1060);
            rule__Statemachine__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getStatemachineAccess().getNameAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Statemachine__Group__2__Impl"


    // $ANTLR start "rule__Statemachine__Group__3"
    // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:540:1: rule__Statemachine__Group__3 : rule__Statemachine__Group__3__Impl rule__Statemachine__Group__4 ;
    public final void rule__Statemachine__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:544:1: ( rule__Statemachine__Group__3__Impl rule__Statemachine__Group__4 )
            // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:545:2: rule__Statemachine__Group__3__Impl rule__Statemachine__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__Statemachine__Group__3__Impl_in_rule__Statemachine__Group__31090);
            rule__Statemachine__Group__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Statemachine__Group__4_in_rule__Statemachine__Group__31093);
            rule__Statemachine__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Statemachine__Group__3"


    // $ANTLR start "rule__Statemachine__Group__3__Impl"
    // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:552:1: rule__Statemachine__Group__3__Impl : ( '{' ) ;
    public final void rule__Statemachine__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:556:1: ( ( '{' ) )
            // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:557:1: ( '{' )
            {
            // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:557:1: ( '{' )
            // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:558:1: '{'
            {
             before(grammarAccess.getStatemachineAccess().getLeftCurlyBracketKeyword_3()); 
            match(input,12,FollowSets000.FOLLOW_12_in_rule__Statemachine__Group__3__Impl1121); 
             after(grammarAccess.getStatemachineAccess().getLeftCurlyBracketKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Statemachine__Group__3__Impl"


    // $ANTLR start "rule__Statemachine__Group__4"
    // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:571:1: rule__Statemachine__Group__4 : rule__Statemachine__Group__4__Impl rule__Statemachine__Group__5 ;
    public final void rule__Statemachine__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:575:1: ( rule__Statemachine__Group__4__Impl rule__Statemachine__Group__5 )
            // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:576:2: rule__Statemachine__Group__4__Impl rule__Statemachine__Group__5
            {
            pushFollow(FollowSets000.FOLLOW_rule__Statemachine__Group__4__Impl_in_rule__Statemachine__Group__41152);
            rule__Statemachine__Group__4__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Statemachine__Group__5_in_rule__Statemachine__Group__41155);
            rule__Statemachine__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Statemachine__Group__4"


    // $ANTLR start "rule__Statemachine__Group__4__Impl"
    // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:583:1: rule__Statemachine__Group__4__Impl : ( ( rule__Statemachine__Group_4__0 )? ) ;
    public final void rule__Statemachine__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:587:1: ( ( ( rule__Statemachine__Group_4__0 )? ) )
            // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:588:1: ( ( rule__Statemachine__Group_4__0 )? )
            {
            // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:588:1: ( ( rule__Statemachine__Group_4__0 )? )
            // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:589:1: ( rule__Statemachine__Group_4__0 )?
            {
             before(grammarAccess.getStatemachineAccess().getGroup_4()); 
            // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:590:1: ( rule__Statemachine__Group_4__0 )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==14) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:590:2: rule__Statemachine__Group_4__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__Statemachine__Group_4__0_in_rule__Statemachine__Group__4__Impl1182);
                    rule__Statemachine__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getStatemachineAccess().getGroup_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Statemachine__Group__4__Impl"


    // $ANTLR start "rule__Statemachine__Group__5"
    // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:600:1: rule__Statemachine__Group__5 : rule__Statemachine__Group__5__Impl rule__Statemachine__Group__6 ;
    public final void rule__Statemachine__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:604:1: ( rule__Statemachine__Group__5__Impl rule__Statemachine__Group__6 )
            // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:605:2: rule__Statemachine__Group__5__Impl rule__Statemachine__Group__6
            {
            pushFollow(FollowSets000.FOLLOW_rule__Statemachine__Group__5__Impl_in_rule__Statemachine__Group__51213);
            rule__Statemachine__Group__5__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Statemachine__Group__6_in_rule__Statemachine__Group__51216);
            rule__Statemachine__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Statemachine__Group__5"


    // $ANTLR start "rule__Statemachine__Group__5__Impl"
    // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:612:1: rule__Statemachine__Group__5__Impl : ( ( rule__Statemachine__Group_5__0 )? ) ;
    public final void rule__Statemachine__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:616:1: ( ( ( rule__Statemachine__Group_5__0 )? ) )
            // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:617:1: ( ( rule__Statemachine__Group_5__0 )? )
            {
            // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:617:1: ( ( rule__Statemachine__Group_5__0 )? )
            // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:618:1: ( rule__Statemachine__Group_5__0 )?
            {
             before(grammarAccess.getStatemachineAccess().getGroup_5()); 
            // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:619:1: ( rule__Statemachine__Group_5__0 )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==15) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:619:2: rule__Statemachine__Group_5__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__Statemachine__Group_5__0_in_rule__Statemachine__Group__5__Impl1243);
                    rule__Statemachine__Group_5__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getStatemachineAccess().getGroup_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Statemachine__Group__5__Impl"


    // $ANTLR start "rule__Statemachine__Group__6"
    // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:629:1: rule__Statemachine__Group__6 : rule__Statemachine__Group__6__Impl rule__Statemachine__Group__7 ;
    public final void rule__Statemachine__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:633:1: ( rule__Statemachine__Group__6__Impl rule__Statemachine__Group__7 )
            // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:634:2: rule__Statemachine__Group__6__Impl rule__Statemachine__Group__7
            {
            pushFollow(FollowSets000.FOLLOW_rule__Statemachine__Group__6__Impl_in_rule__Statemachine__Group__61274);
            rule__Statemachine__Group__6__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Statemachine__Group__7_in_rule__Statemachine__Group__61277);
            rule__Statemachine__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Statemachine__Group__6"


    // $ANTLR start "rule__Statemachine__Group__6__Impl"
    // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:641:1: rule__Statemachine__Group__6__Impl : ( ( rule__Statemachine__Group_6__0 )? ) ;
    public final void rule__Statemachine__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:645:1: ( ( ( rule__Statemachine__Group_6__0 )? ) )
            // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:646:1: ( ( rule__Statemachine__Group_6__0 )? )
            {
            // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:646:1: ( ( rule__Statemachine__Group_6__0 )? )
            // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:647:1: ( rule__Statemachine__Group_6__0 )?
            {
             before(grammarAccess.getStatemachineAccess().getGroup_6()); 
            // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:648:1: ( rule__Statemachine__Group_6__0 )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==16) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:648:2: rule__Statemachine__Group_6__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__Statemachine__Group_6__0_in_rule__Statemachine__Group__6__Impl1304);
                    rule__Statemachine__Group_6__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getStatemachineAccess().getGroup_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Statemachine__Group__6__Impl"


    // $ANTLR start "rule__Statemachine__Group__7"
    // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:658:1: rule__Statemachine__Group__7 : rule__Statemachine__Group__7__Impl rule__Statemachine__Group__8 ;
    public final void rule__Statemachine__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:662:1: ( rule__Statemachine__Group__7__Impl rule__Statemachine__Group__8 )
            // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:663:2: rule__Statemachine__Group__7__Impl rule__Statemachine__Group__8
            {
            pushFollow(FollowSets000.FOLLOW_rule__Statemachine__Group__7__Impl_in_rule__Statemachine__Group__71335);
            rule__Statemachine__Group__7__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Statemachine__Group__8_in_rule__Statemachine__Group__71338);
            rule__Statemachine__Group__8();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Statemachine__Group__7"


    // $ANTLR start "rule__Statemachine__Group__7__Impl"
    // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:670:1: rule__Statemachine__Group__7__Impl : ( ( rule__Statemachine__Group_7__0 )? ) ;
    public final void rule__Statemachine__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:674:1: ( ( ( rule__Statemachine__Group_7__0 )? ) )
            // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:675:1: ( ( rule__Statemachine__Group_7__0 )? )
            {
            // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:675:1: ( ( rule__Statemachine__Group_7__0 )? )
            // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:676:1: ( rule__Statemachine__Group_7__0 )?
            {
             before(grammarAccess.getStatemachineAccess().getGroup_7()); 
            // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:677:1: ( rule__Statemachine__Group_7__0 )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==18) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:677:2: rule__Statemachine__Group_7__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__Statemachine__Group_7__0_in_rule__Statemachine__Group__7__Impl1365);
                    rule__Statemachine__Group_7__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getStatemachineAccess().getGroup_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Statemachine__Group__7__Impl"


    // $ANTLR start "rule__Statemachine__Group__8"
    // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:687:1: rule__Statemachine__Group__8 : rule__Statemachine__Group__8__Impl ;
    public final void rule__Statemachine__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:691:1: ( rule__Statemachine__Group__8__Impl )
            // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:692:2: rule__Statemachine__Group__8__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Statemachine__Group__8__Impl_in_rule__Statemachine__Group__81396);
            rule__Statemachine__Group__8__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Statemachine__Group__8"


    // $ANTLR start "rule__Statemachine__Group__8__Impl"
    // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:698:1: rule__Statemachine__Group__8__Impl : ( '}' ) ;
    public final void rule__Statemachine__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:702:1: ( ( '}' ) )
            // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:703:1: ( '}' )
            {
            // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:703:1: ( '}' )
            // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:704:1: '}'
            {
             before(grammarAccess.getStatemachineAccess().getRightCurlyBracketKeyword_8()); 
            match(input,13,FollowSets000.FOLLOW_13_in_rule__Statemachine__Group__8__Impl1424); 
             after(grammarAccess.getStatemachineAccess().getRightCurlyBracketKeyword_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Statemachine__Group__8__Impl"


    // $ANTLR start "rule__Statemachine__Group_4__0"
    // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:735:1: rule__Statemachine__Group_4__0 : rule__Statemachine__Group_4__0__Impl rule__Statemachine__Group_4__1 ;
    public final void rule__Statemachine__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:739:1: ( rule__Statemachine__Group_4__0__Impl rule__Statemachine__Group_4__1 )
            // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:740:2: rule__Statemachine__Group_4__0__Impl rule__Statemachine__Group_4__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Statemachine__Group_4__0__Impl_in_rule__Statemachine__Group_4__01473);
            rule__Statemachine__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Statemachine__Group_4__1_in_rule__Statemachine__Group_4__01476);
            rule__Statemachine__Group_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Statemachine__Group_4__0"


    // $ANTLR start "rule__Statemachine__Group_4__0__Impl"
    // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:747:1: rule__Statemachine__Group_4__0__Impl : ( 'comment' ) ;
    public final void rule__Statemachine__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:751:1: ( ( 'comment' ) )
            // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:752:1: ( 'comment' )
            {
            // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:752:1: ( 'comment' )
            // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:753:1: 'comment'
            {
             before(grammarAccess.getStatemachineAccess().getCommentKeyword_4_0()); 
            match(input,14,FollowSets000.FOLLOW_14_in_rule__Statemachine__Group_4__0__Impl1504); 
             after(grammarAccess.getStatemachineAccess().getCommentKeyword_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Statemachine__Group_4__0__Impl"


    // $ANTLR start "rule__Statemachine__Group_4__1"
    // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:766:1: rule__Statemachine__Group_4__1 : rule__Statemachine__Group_4__1__Impl ;
    public final void rule__Statemachine__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:770:1: ( rule__Statemachine__Group_4__1__Impl )
            // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:771:2: rule__Statemachine__Group_4__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Statemachine__Group_4__1__Impl_in_rule__Statemachine__Group_4__11535);
            rule__Statemachine__Group_4__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Statemachine__Group_4__1"


    // $ANTLR start "rule__Statemachine__Group_4__1__Impl"
    // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:777:1: rule__Statemachine__Group_4__1__Impl : ( ( rule__Statemachine__CommentAssignment_4_1 ) ) ;
    public final void rule__Statemachine__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:781:1: ( ( ( rule__Statemachine__CommentAssignment_4_1 ) ) )
            // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:782:1: ( ( rule__Statemachine__CommentAssignment_4_1 ) )
            {
            // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:782:1: ( ( rule__Statemachine__CommentAssignment_4_1 ) )
            // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:783:1: ( rule__Statemachine__CommentAssignment_4_1 )
            {
             before(grammarAccess.getStatemachineAccess().getCommentAssignment_4_1()); 
            // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:784:1: ( rule__Statemachine__CommentAssignment_4_1 )
            // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:784:2: rule__Statemachine__CommentAssignment_4_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Statemachine__CommentAssignment_4_1_in_rule__Statemachine__Group_4__1__Impl1562);
            rule__Statemachine__CommentAssignment_4_1();

            state._fsp--;


            }

             after(grammarAccess.getStatemachineAccess().getCommentAssignment_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Statemachine__Group_4__1__Impl"


    // $ANTLR start "rule__Statemachine__Group_5__0"
    // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:798:1: rule__Statemachine__Group_5__0 : rule__Statemachine__Group_5__0__Impl rule__Statemachine__Group_5__1 ;
    public final void rule__Statemachine__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:802:1: ( rule__Statemachine__Group_5__0__Impl rule__Statemachine__Group_5__1 )
            // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:803:2: rule__Statemachine__Group_5__0__Impl rule__Statemachine__Group_5__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Statemachine__Group_5__0__Impl_in_rule__Statemachine__Group_5__01596);
            rule__Statemachine__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Statemachine__Group_5__1_in_rule__Statemachine__Group_5__01599);
            rule__Statemachine__Group_5__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Statemachine__Group_5__0"


    // $ANTLR start "rule__Statemachine__Group_5__0__Impl"
    // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:810:1: rule__Statemachine__Group_5__0__Impl : ( 'refines' ) ;
    public final void rule__Statemachine__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:814:1: ( ( 'refines' ) )
            // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:815:1: ( 'refines' )
            {
            // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:815:1: ( 'refines' )
            // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:816:1: 'refines'
            {
             before(grammarAccess.getStatemachineAccess().getRefinesKeyword_5_0()); 
            match(input,15,FollowSets000.FOLLOW_15_in_rule__Statemachine__Group_5__0__Impl1627); 
             after(grammarAccess.getStatemachineAccess().getRefinesKeyword_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Statemachine__Group_5__0__Impl"


    // $ANTLR start "rule__Statemachine__Group_5__1"
    // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:829:1: rule__Statemachine__Group_5__1 : rule__Statemachine__Group_5__1__Impl ;
    public final void rule__Statemachine__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:833:1: ( rule__Statemachine__Group_5__1__Impl )
            // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:834:2: rule__Statemachine__Group_5__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Statemachine__Group_5__1__Impl_in_rule__Statemachine__Group_5__11658);
            rule__Statemachine__Group_5__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Statemachine__Group_5__1"


    // $ANTLR start "rule__Statemachine__Group_5__1__Impl"
    // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:840:1: rule__Statemachine__Group_5__1__Impl : ( ( rule__Statemachine__RefinesAssignment_5_1 ) ) ;
    public final void rule__Statemachine__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:844:1: ( ( ( rule__Statemachine__RefinesAssignment_5_1 ) ) )
            // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:845:1: ( ( rule__Statemachine__RefinesAssignment_5_1 ) )
            {
            // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:845:1: ( ( rule__Statemachine__RefinesAssignment_5_1 ) )
            // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:846:1: ( rule__Statemachine__RefinesAssignment_5_1 )
            {
             before(grammarAccess.getStatemachineAccess().getRefinesAssignment_5_1()); 
            // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:847:1: ( rule__Statemachine__RefinesAssignment_5_1 )
            // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:847:2: rule__Statemachine__RefinesAssignment_5_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Statemachine__RefinesAssignment_5_1_in_rule__Statemachine__Group_5__1__Impl1685);
            rule__Statemachine__RefinesAssignment_5_1();

            state._fsp--;


            }

             after(grammarAccess.getStatemachineAccess().getRefinesAssignment_5_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Statemachine__Group_5__1__Impl"


    // $ANTLR start "rule__Statemachine__Group_6__0"
    // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:861:1: rule__Statemachine__Group_6__0 : rule__Statemachine__Group_6__0__Impl rule__Statemachine__Group_6__1 ;
    public final void rule__Statemachine__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:865:1: ( rule__Statemachine__Group_6__0__Impl rule__Statemachine__Group_6__1 )
            // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:866:2: rule__Statemachine__Group_6__0__Impl rule__Statemachine__Group_6__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Statemachine__Group_6__0__Impl_in_rule__Statemachine__Group_6__01719);
            rule__Statemachine__Group_6__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Statemachine__Group_6__1_in_rule__Statemachine__Group_6__01722);
            rule__Statemachine__Group_6__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Statemachine__Group_6__0"


    // $ANTLR start "rule__Statemachine__Group_6__0__Impl"
    // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:873:1: rule__Statemachine__Group_6__0__Impl : ( 'nodes' ) ;
    public final void rule__Statemachine__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:877:1: ( ( 'nodes' ) )
            // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:878:1: ( 'nodes' )
            {
            // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:878:1: ( 'nodes' )
            // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:879:1: 'nodes'
            {
             before(grammarAccess.getStatemachineAccess().getNodesKeyword_6_0()); 
            match(input,16,FollowSets000.FOLLOW_16_in_rule__Statemachine__Group_6__0__Impl1750); 
             after(grammarAccess.getStatemachineAccess().getNodesKeyword_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Statemachine__Group_6__0__Impl"


    // $ANTLR start "rule__Statemachine__Group_6__1"
    // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:892:1: rule__Statemachine__Group_6__1 : rule__Statemachine__Group_6__1__Impl rule__Statemachine__Group_6__2 ;
    public final void rule__Statemachine__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:896:1: ( rule__Statemachine__Group_6__1__Impl rule__Statemachine__Group_6__2 )
            // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:897:2: rule__Statemachine__Group_6__1__Impl rule__Statemachine__Group_6__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Statemachine__Group_6__1__Impl_in_rule__Statemachine__Group_6__11781);
            rule__Statemachine__Group_6__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Statemachine__Group_6__2_in_rule__Statemachine__Group_6__11784);
            rule__Statemachine__Group_6__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Statemachine__Group_6__1"


    // $ANTLR start "rule__Statemachine__Group_6__1__Impl"
    // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:904:1: rule__Statemachine__Group_6__1__Impl : ( '{' ) ;
    public final void rule__Statemachine__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:908:1: ( ( '{' ) )
            // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:909:1: ( '{' )
            {
            // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:909:1: ( '{' )
            // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:910:1: '{'
            {
             before(grammarAccess.getStatemachineAccess().getLeftCurlyBracketKeyword_6_1()); 
            match(input,12,FollowSets000.FOLLOW_12_in_rule__Statemachine__Group_6__1__Impl1812); 
             after(grammarAccess.getStatemachineAccess().getLeftCurlyBracketKeyword_6_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Statemachine__Group_6__1__Impl"


    // $ANTLR start "rule__Statemachine__Group_6__2"
    // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:923:1: rule__Statemachine__Group_6__2 : rule__Statemachine__Group_6__2__Impl rule__Statemachine__Group_6__3 ;
    public final void rule__Statemachine__Group_6__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:927:1: ( rule__Statemachine__Group_6__2__Impl rule__Statemachine__Group_6__3 )
            // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:928:2: rule__Statemachine__Group_6__2__Impl rule__Statemachine__Group_6__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__Statemachine__Group_6__2__Impl_in_rule__Statemachine__Group_6__21843);
            rule__Statemachine__Group_6__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Statemachine__Group_6__3_in_rule__Statemachine__Group_6__21846);
            rule__Statemachine__Group_6__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Statemachine__Group_6__2"


    // $ANTLR start "rule__Statemachine__Group_6__2__Impl"
    // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:935:1: rule__Statemachine__Group_6__2__Impl : ( ( rule__Statemachine__NodesAssignment_6_2 ) ) ;
    public final void rule__Statemachine__Group_6__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:939:1: ( ( ( rule__Statemachine__NodesAssignment_6_2 ) ) )
            // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:940:1: ( ( rule__Statemachine__NodesAssignment_6_2 ) )
            {
            // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:940:1: ( ( rule__Statemachine__NodesAssignment_6_2 ) )
            // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:941:1: ( rule__Statemachine__NodesAssignment_6_2 )
            {
             before(grammarAccess.getStatemachineAccess().getNodesAssignment_6_2()); 
            // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:942:1: ( rule__Statemachine__NodesAssignment_6_2 )
            // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:942:2: rule__Statemachine__NodesAssignment_6_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Statemachine__NodesAssignment_6_2_in_rule__Statemachine__Group_6__2__Impl1873);
            rule__Statemachine__NodesAssignment_6_2();

            state._fsp--;


            }

             after(grammarAccess.getStatemachineAccess().getNodesAssignment_6_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Statemachine__Group_6__2__Impl"


    // $ANTLR start "rule__Statemachine__Group_6__3"
    // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:952:1: rule__Statemachine__Group_6__3 : rule__Statemachine__Group_6__3__Impl rule__Statemachine__Group_6__4 ;
    public final void rule__Statemachine__Group_6__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:956:1: ( rule__Statemachine__Group_6__3__Impl rule__Statemachine__Group_6__4 )
            // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:957:2: rule__Statemachine__Group_6__3__Impl rule__Statemachine__Group_6__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__Statemachine__Group_6__3__Impl_in_rule__Statemachine__Group_6__31903);
            rule__Statemachine__Group_6__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Statemachine__Group_6__4_in_rule__Statemachine__Group_6__31906);
            rule__Statemachine__Group_6__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Statemachine__Group_6__3"


    // $ANTLR start "rule__Statemachine__Group_6__3__Impl"
    // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:964:1: rule__Statemachine__Group_6__3__Impl : ( ( rule__Statemachine__Group_6_3__0 )* ) ;
    public final void rule__Statemachine__Group_6__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:968:1: ( ( ( rule__Statemachine__Group_6_3__0 )* ) )
            // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:969:1: ( ( rule__Statemachine__Group_6_3__0 )* )
            {
            // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:969:1: ( ( rule__Statemachine__Group_6_3__0 )* )
            // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:970:1: ( rule__Statemachine__Group_6_3__0 )*
            {
             before(grammarAccess.getStatemachineAccess().getGroup_6_3()); 
            // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:971:1: ( rule__Statemachine__Group_6_3__0 )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==17) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:971:2: rule__Statemachine__Group_6_3__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__Statemachine__Group_6_3__0_in_rule__Statemachine__Group_6__3__Impl1933);
            	    rule__Statemachine__Group_6_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

             after(grammarAccess.getStatemachineAccess().getGroup_6_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Statemachine__Group_6__3__Impl"


    // $ANTLR start "rule__Statemachine__Group_6__4"
    // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:981:1: rule__Statemachine__Group_6__4 : rule__Statemachine__Group_6__4__Impl ;
    public final void rule__Statemachine__Group_6__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:985:1: ( rule__Statemachine__Group_6__4__Impl )
            // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:986:2: rule__Statemachine__Group_6__4__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Statemachine__Group_6__4__Impl_in_rule__Statemachine__Group_6__41964);
            rule__Statemachine__Group_6__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Statemachine__Group_6__4"


    // $ANTLR start "rule__Statemachine__Group_6__4__Impl"
    // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:992:1: rule__Statemachine__Group_6__4__Impl : ( '}' ) ;
    public final void rule__Statemachine__Group_6__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:996:1: ( ( '}' ) )
            // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:997:1: ( '}' )
            {
            // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:997:1: ( '}' )
            // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:998:1: '}'
            {
             before(grammarAccess.getStatemachineAccess().getRightCurlyBracketKeyword_6_4()); 
            match(input,13,FollowSets000.FOLLOW_13_in_rule__Statemachine__Group_6__4__Impl1992); 
             after(grammarAccess.getStatemachineAccess().getRightCurlyBracketKeyword_6_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Statemachine__Group_6__4__Impl"


    // $ANTLR start "rule__Statemachine__Group_6_3__0"
    // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:1021:1: rule__Statemachine__Group_6_3__0 : rule__Statemachine__Group_6_3__0__Impl rule__Statemachine__Group_6_3__1 ;
    public final void rule__Statemachine__Group_6_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:1025:1: ( rule__Statemachine__Group_6_3__0__Impl rule__Statemachine__Group_6_3__1 )
            // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:1026:2: rule__Statemachine__Group_6_3__0__Impl rule__Statemachine__Group_6_3__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Statemachine__Group_6_3__0__Impl_in_rule__Statemachine__Group_6_3__02033);
            rule__Statemachine__Group_6_3__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Statemachine__Group_6_3__1_in_rule__Statemachine__Group_6_3__02036);
            rule__Statemachine__Group_6_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Statemachine__Group_6_3__0"


    // $ANTLR start "rule__Statemachine__Group_6_3__0__Impl"
    // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:1033:1: rule__Statemachine__Group_6_3__0__Impl : ( ',' ) ;
    public final void rule__Statemachine__Group_6_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:1037:1: ( ( ',' ) )
            // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:1038:1: ( ',' )
            {
            // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:1038:1: ( ',' )
            // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:1039:1: ','
            {
             before(grammarAccess.getStatemachineAccess().getCommaKeyword_6_3_0()); 
            match(input,17,FollowSets000.FOLLOW_17_in_rule__Statemachine__Group_6_3__0__Impl2064); 
             after(grammarAccess.getStatemachineAccess().getCommaKeyword_6_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Statemachine__Group_6_3__0__Impl"


    // $ANTLR start "rule__Statemachine__Group_6_3__1"
    // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:1052:1: rule__Statemachine__Group_6_3__1 : rule__Statemachine__Group_6_3__1__Impl ;
    public final void rule__Statemachine__Group_6_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:1056:1: ( rule__Statemachine__Group_6_3__1__Impl )
            // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:1057:2: rule__Statemachine__Group_6_3__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Statemachine__Group_6_3__1__Impl_in_rule__Statemachine__Group_6_3__12095);
            rule__Statemachine__Group_6_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Statemachine__Group_6_3__1"


    // $ANTLR start "rule__Statemachine__Group_6_3__1__Impl"
    // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:1063:1: rule__Statemachine__Group_6_3__1__Impl : ( ( rule__Statemachine__NodesAssignment_6_3_1 ) ) ;
    public final void rule__Statemachine__Group_6_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:1067:1: ( ( ( rule__Statemachine__NodesAssignment_6_3_1 ) ) )
            // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:1068:1: ( ( rule__Statemachine__NodesAssignment_6_3_1 ) )
            {
            // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:1068:1: ( ( rule__Statemachine__NodesAssignment_6_3_1 ) )
            // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:1069:1: ( rule__Statemachine__NodesAssignment_6_3_1 )
            {
             before(grammarAccess.getStatemachineAccess().getNodesAssignment_6_3_1()); 
            // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:1070:1: ( rule__Statemachine__NodesAssignment_6_3_1 )
            // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:1070:2: rule__Statemachine__NodesAssignment_6_3_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Statemachine__NodesAssignment_6_3_1_in_rule__Statemachine__Group_6_3__1__Impl2122);
            rule__Statemachine__NodesAssignment_6_3_1();

            state._fsp--;


            }

             after(grammarAccess.getStatemachineAccess().getNodesAssignment_6_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Statemachine__Group_6_3__1__Impl"


    // $ANTLR start "rule__Statemachine__Group_7__0"
    // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:1084:1: rule__Statemachine__Group_7__0 : rule__Statemachine__Group_7__0__Impl rule__Statemachine__Group_7__1 ;
    public final void rule__Statemachine__Group_7__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:1088:1: ( rule__Statemachine__Group_7__0__Impl rule__Statemachine__Group_7__1 )
            // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:1089:2: rule__Statemachine__Group_7__0__Impl rule__Statemachine__Group_7__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Statemachine__Group_7__0__Impl_in_rule__Statemachine__Group_7__02156);
            rule__Statemachine__Group_7__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Statemachine__Group_7__1_in_rule__Statemachine__Group_7__02159);
            rule__Statemachine__Group_7__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Statemachine__Group_7__0"


    // $ANTLR start "rule__Statemachine__Group_7__0__Impl"
    // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:1096:1: rule__Statemachine__Group_7__0__Impl : ( 'transitions' ) ;
    public final void rule__Statemachine__Group_7__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:1100:1: ( ( 'transitions' ) )
            // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:1101:1: ( 'transitions' )
            {
            // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:1101:1: ( 'transitions' )
            // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:1102:1: 'transitions'
            {
             before(grammarAccess.getStatemachineAccess().getTransitionsKeyword_7_0()); 
            match(input,18,FollowSets000.FOLLOW_18_in_rule__Statemachine__Group_7__0__Impl2187); 
             after(grammarAccess.getStatemachineAccess().getTransitionsKeyword_7_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Statemachine__Group_7__0__Impl"


    // $ANTLR start "rule__Statemachine__Group_7__1"
    // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:1115:1: rule__Statemachine__Group_7__1 : rule__Statemachine__Group_7__1__Impl rule__Statemachine__Group_7__2 ;
    public final void rule__Statemachine__Group_7__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:1119:1: ( rule__Statemachine__Group_7__1__Impl rule__Statemachine__Group_7__2 )
            // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:1120:2: rule__Statemachine__Group_7__1__Impl rule__Statemachine__Group_7__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Statemachine__Group_7__1__Impl_in_rule__Statemachine__Group_7__12218);
            rule__Statemachine__Group_7__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Statemachine__Group_7__2_in_rule__Statemachine__Group_7__12221);
            rule__Statemachine__Group_7__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Statemachine__Group_7__1"


    // $ANTLR start "rule__Statemachine__Group_7__1__Impl"
    // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:1127:1: rule__Statemachine__Group_7__1__Impl : ( '{' ) ;
    public final void rule__Statemachine__Group_7__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:1131:1: ( ( '{' ) )
            // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:1132:1: ( '{' )
            {
            // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:1132:1: ( '{' )
            // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:1133:1: '{'
            {
             before(grammarAccess.getStatemachineAccess().getLeftCurlyBracketKeyword_7_1()); 
            match(input,12,FollowSets000.FOLLOW_12_in_rule__Statemachine__Group_7__1__Impl2249); 
             after(grammarAccess.getStatemachineAccess().getLeftCurlyBracketKeyword_7_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Statemachine__Group_7__1__Impl"


    // $ANTLR start "rule__Statemachine__Group_7__2"
    // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:1146:1: rule__Statemachine__Group_7__2 : rule__Statemachine__Group_7__2__Impl rule__Statemachine__Group_7__3 ;
    public final void rule__Statemachine__Group_7__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:1150:1: ( rule__Statemachine__Group_7__2__Impl rule__Statemachine__Group_7__3 )
            // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:1151:2: rule__Statemachine__Group_7__2__Impl rule__Statemachine__Group_7__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__Statemachine__Group_7__2__Impl_in_rule__Statemachine__Group_7__22280);
            rule__Statemachine__Group_7__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Statemachine__Group_7__3_in_rule__Statemachine__Group_7__22283);
            rule__Statemachine__Group_7__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Statemachine__Group_7__2"


    // $ANTLR start "rule__Statemachine__Group_7__2__Impl"
    // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:1158:1: rule__Statemachine__Group_7__2__Impl : ( ( rule__Statemachine__TransitionsAssignment_7_2 ) ) ;
    public final void rule__Statemachine__Group_7__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:1162:1: ( ( ( rule__Statemachine__TransitionsAssignment_7_2 ) ) )
            // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:1163:1: ( ( rule__Statemachine__TransitionsAssignment_7_2 ) )
            {
            // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:1163:1: ( ( rule__Statemachine__TransitionsAssignment_7_2 ) )
            // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:1164:1: ( rule__Statemachine__TransitionsAssignment_7_2 )
            {
             before(grammarAccess.getStatemachineAccess().getTransitionsAssignment_7_2()); 
            // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:1165:1: ( rule__Statemachine__TransitionsAssignment_7_2 )
            // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:1165:2: rule__Statemachine__TransitionsAssignment_7_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Statemachine__TransitionsAssignment_7_2_in_rule__Statemachine__Group_7__2__Impl2310);
            rule__Statemachine__TransitionsAssignment_7_2();

            state._fsp--;


            }

             after(grammarAccess.getStatemachineAccess().getTransitionsAssignment_7_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Statemachine__Group_7__2__Impl"


    // $ANTLR start "rule__Statemachine__Group_7__3"
    // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:1175:1: rule__Statemachine__Group_7__3 : rule__Statemachine__Group_7__3__Impl rule__Statemachine__Group_7__4 ;
    public final void rule__Statemachine__Group_7__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:1179:1: ( rule__Statemachine__Group_7__3__Impl rule__Statemachine__Group_7__4 )
            // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:1180:2: rule__Statemachine__Group_7__3__Impl rule__Statemachine__Group_7__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__Statemachine__Group_7__3__Impl_in_rule__Statemachine__Group_7__32340);
            rule__Statemachine__Group_7__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Statemachine__Group_7__4_in_rule__Statemachine__Group_7__32343);
            rule__Statemachine__Group_7__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Statemachine__Group_7__3"


    // $ANTLR start "rule__Statemachine__Group_7__3__Impl"
    // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:1187:1: rule__Statemachine__Group_7__3__Impl : ( ( rule__Statemachine__Group_7_3__0 )* ) ;
    public final void rule__Statemachine__Group_7__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:1191:1: ( ( ( rule__Statemachine__Group_7_3__0 )* ) )
            // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:1192:1: ( ( rule__Statemachine__Group_7_3__0 )* )
            {
            // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:1192:1: ( ( rule__Statemachine__Group_7_3__0 )* )
            // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:1193:1: ( rule__Statemachine__Group_7_3__0 )*
            {
             before(grammarAccess.getStatemachineAccess().getGroup_7_3()); 
            // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:1194:1: ( rule__Statemachine__Group_7_3__0 )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==17) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:1194:2: rule__Statemachine__Group_7_3__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__Statemachine__Group_7_3__0_in_rule__Statemachine__Group_7__3__Impl2370);
            	    rule__Statemachine__Group_7_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);

             after(grammarAccess.getStatemachineAccess().getGroup_7_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Statemachine__Group_7__3__Impl"


    // $ANTLR start "rule__Statemachine__Group_7__4"
    // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:1204:1: rule__Statemachine__Group_7__4 : rule__Statemachine__Group_7__4__Impl ;
    public final void rule__Statemachine__Group_7__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:1208:1: ( rule__Statemachine__Group_7__4__Impl )
            // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:1209:2: rule__Statemachine__Group_7__4__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Statemachine__Group_7__4__Impl_in_rule__Statemachine__Group_7__42401);
            rule__Statemachine__Group_7__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Statemachine__Group_7__4"


    // $ANTLR start "rule__Statemachine__Group_7__4__Impl"
    // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:1215:1: rule__Statemachine__Group_7__4__Impl : ( '}' ) ;
    public final void rule__Statemachine__Group_7__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:1219:1: ( ( '}' ) )
            // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:1220:1: ( '}' )
            {
            // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:1220:1: ( '}' )
            // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:1221:1: '}'
            {
             before(grammarAccess.getStatemachineAccess().getRightCurlyBracketKeyword_7_4()); 
            match(input,13,FollowSets000.FOLLOW_13_in_rule__Statemachine__Group_7__4__Impl2429); 
             after(grammarAccess.getStatemachineAccess().getRightCurlyBracketKeyword_7_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Statemachine__Group_7__4__Impl"


    // $ANTLR start "rule__Statemachine__Group_7_3__0"
    // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:1244:1: rule__Statemachine__Group_7_3__0 : rule__Statemachine__Group_7_3__0__Impl rule__Statemachine__Group_7_3__1 ;
    public final void rule__Statemachine__Group_7_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:1248:1: ( rule__Statemachine__Group_7_3__0__Impl rule__Statemachine__Group_7_3__1 )
            // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:1249:2: rule__Statemachine__Group_7_3__0__Impl rule__Statemachine__Group_7_3__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Statemachine__Group_7_3__0__Impl_in_rule__Statemachine__Group_7_3__02470);
            rule__Statemachine__Group_7_3__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Statemachine__Group_7_3__1_in_rule__Statemachine__Group_7_3__02473);
            rule__Statemachine__Group_7_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Statemachine__Group_7_3__0"


    // $ANTLR start "rule__Statemachine__Group_7_3__0__Impl"
    // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:1256:1: rule__Statemachine__Group_7_3__0__Impl : ( ',' ) ;
    public final void rule__Statemachine__Group_7_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:1260:1: ( ( ',' ) )
            // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:1261:1: ( ',' )
            {
            // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:1261:1: ( ',' )
            // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:1262:1: ','
            {
             before(grammarAccess.getStatemachineAccess().getCommaKeyword_7_3_0()); 
            match(input,17,FollowSets000.FOLLOW_17_in_rule__Statemachine__Group_7_3__0__Impl2501); 
             after(grammarAccess.getStatemachineAccess().getCommaKeyword_7_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Statemachine__Group_7_3__0__Impl"


    // $ANTLR start "rule__Statemachine__Group_7_3__1"
    // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:1275:1: rule__Statemachine__Group_7_3__1 : rule__Statemachine__Group_7_3__1__Impl ;
    public final void rule__Statemachine__Group_7_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:1279:1: ( rule__Statemachine__Group_7_3__1__Impl )
            // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:1280:2: rule__Statemachine__Group_7_3__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Statemachine__Group_7_3__1__Impl_in_rule__Statemachine__Group_7_3__12532);
            rule__Statemachine__Group_7_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Statemachine__Group_7_3__1"


    // $ANTLR start "rule__Statemachine__Group_7_3__1__Impl"
    // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:1286:1: rule__Statemachine__Group_7_3__1__Impl : ( ( rule__Statemachine__TransitionsAssignment_7_3_1 ) ) ;
    public final void rule__Statemachine__Group_7_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:1290:1: ( ( ( rule__Statemachine__TransitionsAssignment_7_3_1 ) ) )
            // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:1291:1: ( ( rule__Statemachine__TransitionsAssignment_7_3_1 ) )
            {
            // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:1291:1: ( ( rule__Statemachine__TransitionsAssignment_7_3_1 ) )
            // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:1292:1: ( rule__Statemachine__TransitionsAssignment_7_3_1 )
            {
             before(grammarAccess.getStatemachineAccess().getTransitionsAssignment_7_3_1()); 
            // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:1293:1: ( rule__Statemachine__TransitionsAssignment_7_3_1 )
            // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:1293:2: rule__Statemachine__TransitionsAssignment_7_3_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Statemachine__TransitionsAssignment_7_3_1_in_rule__Statemachine__Group_7_3__1__Impl2559);
            rule__Statemachine__TransitionsAssignment_7_3_1();

            state._fsp--;


            }

             after(grammarAccess.getStatemachineAccess().getTransitionsAssignment_7_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Statemachine__Group_7_3__1__Impl"


    // $ANTLR start "rule__State__Group__0"
    // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:1307:1: rule__State__Group__0 : rule__State__Group__0__Impl rule__State__Group__1 ;
    public final void rule__State__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:1311:1: ( rule__State__Group__0__Impl rule__State__Group__1 )
            // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:1312:2: rule__State__Group__0__Impl rule__State__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__State__Group__0__Impl_in_rule__State__Group__02593);
            rule__State__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__State__Group__1_in_rule__State__Group__02596);
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
    // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:1319:1: rule__State__Group__0__Impl : ( () ) ;
    public final void rule__State__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:1323:1: ( ( () ) )
            // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:1324:1: ( () )
            {
            // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:1324:1: ( () )
            // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:1325:1: ()
            {
             before(grammarAccess.getStateAccess().getStateAction_0()); 
            // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:1326:1: ()
            // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:1328:1: 
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
    // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:1338:1: rule__State__Group__1 : rule__State__Group__1__Impl rule__State__Group__2 ;
    public final void rule__State__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:1342:1: ( rule__State__Group__1__Impl rule__State__Group__2 )
            // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:1343:2: rule__State__Group__1__Impl rule__State__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__State__Group__1__Impl_in_rule__State__Group__12654);
            rule__State__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__State__Group__2_in_rule__State__Group__12657);
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
    // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:1350:1: rule__State__Group__1__Impl : ( ( rule__State__LocalGeneratedAssignment_1 )? ) ;
    public final void rule__State__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:1354:1: ( ( ( rule__State__LocalGeneratedAssignment_1 )? ) )
            // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:1355:1: ( ( rule__State__LocalGeneratedAssignment_1 )? )
            {
            // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:1355:1: ( ( rule__State__LocalGeneratedAssignment_1 )? )
            // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:1356:1: ( rule__State__LocalGeneratedAssignment_1 )?
            {
             before(grammarAccess.getStateAccess().getLocalGeneratedAssignment_1()); 
            // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:1357:1: ( rule__State__LocalGeneratedAssignment_1 )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==38) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:1357:2: rule__State__LocalGeneratedAssignment_1
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__State__LocalGeneratedAssignment_1_in_rule__State__Group__1__Impl2684);
                    rule__State__LocalGeneratedAssignment_1();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getStateAccess().getLocalGeneratedAssignment_1()); 

            }


            }

        }
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
    // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:1367:1: rule__State__Group__2 : rule__State__Group__2__Impl rule__State__Group__3 ;
    public final void rule__State__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:1371:1: ( rule__State__Group__2__Impl rule__State__Group__3 )
            // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:1372:2: rule__State__Group__2__Impl rule__State__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__State__Group__2__Impl_in_rule__State__Group__22715);
            rule__State__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__State__Group__3_in_rule__State__Group__22718);
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
    // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:1379:1: rule__State__Group__2__Impl : ( 'State' ) ;
    public final void rule__State__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:1383:1: ( ( 'State' ) )
            // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:1384:1: ( 'State' )
            {
            // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:1384:1: ( 'State' )
            // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:1385:1: 'State'
            {
             before(grammarAccess.getStateAccess().getStateKeyword_2()); 
            match(input,19,FollowSets000.FOLLOW_19_in_rule__State__Group__2__Impl2746); 
             after(grammarAccess.getStateAccess().getStateKeyword_2()); 

            }


            }

        }
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
    // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:1398:1: rule__State__Group__3 : rule__State__Group__3__Impl rule__State__Group__4 ;
    public final void rule__State__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:1402:1: ( rule__State__Group__3__Impl rule__State__Group__4 )
            // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:1403:2: rule__State__Group__3__Impl rule__State__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__State__Group__3__Impl_in_rule__State__Group__32777);
            rule__State__Group__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__State__Group__4_in_rule__State__Group__32780);
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
    // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:1410:1: rule__State__Group__3__Impl : ( ( rule__State__NameAssignment_3 ) ) ;
    public final void rule__State__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:1414:1: ( ( ( rule__State__NameAssignment_3 ) ) )
            // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:1415:1: ( ( rule__State__NameAssignment_3 ) )
            {
            // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:1415:1: ( ( rule__State__NameAssignment_3 ) )
            // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:1416:1: ( rule__State__NameAssignment_3 )
            {
             before(grammarAccess.getStateAccess().getNameAssignment_3()); 
            // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:1417:1: ( rule__State__NameAssignment_3 )
            // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:1417:2: rule__State__NameAssignment_3
            {
            pushFollow(FollowSets000.FOLLOW_rule__State__NameAssignment_3_in_rule__State__Group__3__Impl2807);
            rule__State__NameAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getStateAccess().getNameAssignment_3()); 

            }


            }

        }
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
    // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:1427:1: rule__State__Group__4 : rule__State__Group__4__Impl rule__State__Group__5 ;
    public final void rule__State__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:1431:1: ( rule__State__Group__4__Impl rule__State__Group__5 )
            // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:1432:2: rule__State__Group__4__Impl rule__State__Group__5
            {
            pushFollow(FollowSets000.FOLLOW_rule__State__Group__4__Impl_in_rule__State__Group__42837);
            rule__State__Group__4__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__State__Group__5_in_rule__State__Group__42840);
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
    // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:1439:1: rule__State__Group__4__Impl : ( '{' ) ;
    public final void rule__State__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:1443:1: ( ( '{' ) )
            // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:1444:1: ( '{' )
            {
            // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:1444:1: ( '{' )
            // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:1445:1: '{'
            {
             before(grammarAccess.getStateAccess().getLeftCurlyBracketKeyword_4()); 
            match(input,12,FollowSets000.FOLLOW_12_in_rule__State__Group__4__Impl2868); 
             after(grammarAccess.getStateAccess().getLeftCurlyBracketKeyword_4()); 

            }


            }

        }
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
    // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:1458:1: rule__State__Group__5 : rule__State__Group__5__Impl rule__State__Group__6 ;
    public final void rule__State__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:1462:1: ( rule__State__Group__5__Impl rule__State__Group__6 )
            // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:1463:2: rule__State__Group__5__Impl rule__State__Group__6
            {
            pushFollow(FollowSets000.FOLLOW_rule__State__Group__5__Impl_in_rule__State__Group__52899);
            rule__State__Group__5__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__State__Group__6_in_rule__State__Group__52902);
            rule__State__Group__6();

            state._fsp--;


            }

        }
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
    // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:1470:1: rule__State__Group__5__Impl : ( ( rule__State__Group_5__0 )? ) ;
    public final void rule__State__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:1474:1: ( ( ( rule__State__Group_5__0 )? ) )
            // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:1475:1: ( ( rule__State__Group_5__0 )? )
            {
            // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:1475:1: ( ( rule__State__Group_5__0 )? )
            // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:1476:1: ( rule__State__Group_5__0 )?
            {
             before(grammarAccess.getStateAccess().getGroup_5()); 
            // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:1477:1: ( rule__State__Group_5__0 )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==20) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:1477:2: rule__State__Group_5__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__State__Group_5__0_in_rule__State__Group__5__Impl2929);
                    rule__State__Group_5__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getStateAccess().getGroup_5()); 

            }


            }

        }
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


    // $ANTLR start "rule__State__Group__6"
    // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:1487:1: rule__State__Group__6 : rule__State__Group__6__Impl rule__State__Group__7 ;
    public final void rule__State__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:1491:1: ( rule__State__Group__6__Impl rule__State__Group__7 )
            // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:1492:2: rule__State__Group__6__Impl rule__State__Group__7
            {
            pushFollow(FollowSets000.FOLLOW_rule__State__Group__6__Impl_in_rule__State__Group__62960);
            rule__State__Group__6__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__State__Group__7_in_rule__State__Group__62963);
            rule__State__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__State__Group__6"


    // $ANTLR start "rule__State__Group__6__Impl"
    // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:1499:1: rule__State__Group__6__Impl : ( ( rule__State__Group_6__0 )? ) ;
    public final void rule__State__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:1503:1: ( ( ( rule__State__Group_6__0 )? ) )
            // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:1504:1: ( ( rule__State__Group_6__0 )? )
            {
            // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:1504:1: ( ( rule__State__Group_6__0 )? )
            // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:1505:1: ( rule__State__Group_6__0 )?
            {
             before(grammarAccess.getStateAccess().getGroup_6()); 
            // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:1506:1: ( rule__State__Group_6__0 )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==23) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:1506:2: rule__State__Group_6__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__State__Group_6__0_in_rule__State__Group__6__Impl2990);
                    rule__State__Group_6__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getStateAccess().getGroup_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__State__Group__6__Impl"


    // $ANTLR start "rule__State__Group__7"
    // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:1516:1: rule__State__Group__7 : rule__State__Group__7__Impl rule__State__Group__8 ;
    public final void rule__State__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:1520:1: ( rule__State__Group__7__Impl rule__State__Group__8 )
            // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:1521:2: rule__State__Group__7__Impl rule__State__Group__8
            {
            pushFollow(FollowSets000.FOLLOW_rule__State__Group__7__Impl_in_rule__State__Group__73021);
            rule__State__Group__7__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__State__Group__8_in_rule__State__Group__73024);
            rule__State__Group__8();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__State__Group__7"


    // $ANTLR start "rule__State__Group__7__Impl"
    // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:1528:1: rule__State__Group__7__Impl : ( ( rule__State__Group_7__0 )? ) ;
    public final void rule__State__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:1532:1: ( ( ( rule__State__Group_7__0 )? ) )
            // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:1533:1: ( ( rule__State__Group_7__0 )? )
            {
            // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:1533:1: ( ( rule__State__Group_7__0 )? )
            // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:1534:1: ( rule__State__Group_7__0 )?
            {
             before(grammarAccess.getStateAccess().getGroup_7()); 
            // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:1535:1: ( rule__State__Group_7__0 )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==15) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:1535:2: rule__State__Group_7__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__State__Group_7__0_in_rule__State__Group__7__Impl3051);
                    rule__State__Group_7__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getStateAccess().getGroup_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__State__Group__7__Impl"


    // $ANTLR start "rule__State__Group__8"
    // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:1545:1: rule__State__Group__8 : rule__State__Group__8__Impl rule__State__Group__9 ;
    public final void rule__State__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:1549:1: ( rule__State__Group__8__Impl rule__State__Group__9 )
            // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:1550:2: rule__State__Group__8__Impl rule__State__Group__9
            {
            pushFollow(FollowSets000.FOLLOW_rule__State__Group__8__Impl_in_rule__State__Group__83082);
            rule__State__Group__8__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__State__Group__9_in_rule__State__Group__83085);
            rule__State__Group__9();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__State__Group__8"


    // $ANTLR start "rule__State__Group__8__Impl"
    // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:1557:1: rule__State__Group__8__Impl : ( ( rule__State__Group_8__0 )? ) ;
    public final void rule__State__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:1561:1: ( ( ( rule__State__Group_8__0 )? ) )
            // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:1562:1: ( ( rule__State__Group_8__0 )? )
            {
            // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:1562:1: ( ( rule__State__Group_8__0 )? )
            // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:1563:1: ( rule__State__Group_8__0 )?
            {
             before(grammarAccess.getStateAccess().getGroup_8()); 
            // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:1564:1: ( rule__State__Group_8__0 )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==24) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:1564:2: rule__State__Group_8__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__State__Group_8__0_in_rule__State__Group__8__Impl3112);
                    rule__State__Group_8__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getStateAccess().getGroup_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__State__Group__8__Impl"


    // $ANTLR start "rule__State__Group__9"
    // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:1574:1: rule__State__Group__9 : rule__State__Group__9__Impl rule__State__Group__10 ;
    public final void rule__State__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:1578:1: ( rule__State__Group__9__Impl rule__State__Group__10 )
            // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:1579:2: rule__State__Group__9__Impl rule__State__Group__10
            {
            pushFollow(FollowSets000.FOLLOW_rule__State__Group__9__Impl_in_rule__State__Group__93143);
            rule__State__Group__9__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__State__Group__10_in_rule__State__Group__93146);
            rule__State__Group__10();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__State__Group__9"


    // $ANTLR start "rule__State__Group__9__Impl"
    // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:1586:1: rule__State__Group__9__Impl : ( ( rule__State__Group_9__0 )? ) ;
    public final void rule__State__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:1590:1: ( ( ( rule__State__Group_9__0 )? ) )
            // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:1591:1: ( ( rule__State__Group_9__0 )? )
            {
            // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:1591:1: ( ( rule__State__Group_9__0 )? )
            // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:1592:1: ( rule__State__Group_9__0 )?
            {
             before(grammarAccess.getStateAccess().getGroup_9()); 
            // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:1593:1: ( rule__State__Group_9__0 )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==25) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:1593:2: rule__State__Group_9__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__State__Group_9__0_in_rule__State__Group__9__Impl3173);
                    rule__State__Group_9__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getStateAccess().getGroup_9()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__State__Group__9__Impl"


    // $ANTLR start "rule__State__Group__10"
    // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:1603:1: rule__State__Group__10 : rule__State__Group__10__Impl ;
    public final void rule__State__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:1607:1: ( rule__State__Group__10__Impl )
            // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:1608:2: rule__State__Group__10__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__State__Group__10__Impl_in_rule__State__Group__103204);
            rule__State__Group__10__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__State__Group__10"


    // $ANTLR start "rule__State__Group__10__Impl"
    // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:1614:1: rule__State__Group__10__Impl : ( '}' ) ;
    public final void rule__State__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:1618:1: ( ( '}' ) )
            // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:1619:1: ( '}' )
            {
            // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:1619:1: ( '}' )
            // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:1620:1: '}'
            {
             before(grammarAccess.getStateAccess().getRightCurlyBracketKeyword_10()); 
            match(input,13,FollowSets000.FOLLOW_13_in_rule__State__Group__10__Impl3232); 
             after(grammarAccess.getStateAccess().getRightCurlyBracketKeyword_10()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__State__Group__10__Impl"


    // $ANTLR start "rule__State__Group_5__0"
    // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:1655:1: rule__State__Group_5__0 : rule__State__Group_5__0__Impl rule__State__Group_5__1 ;
    public final void rule__State__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:1659:1: ( rule__State__Group_5__0__Impl rule__State__Group_5__1 )
            // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:1660:2: rule__State__Group_5__0__Impl rule__State__Group_5__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__State__Group_5__0__Impl_in_rule__State__Group_5__03285);
            rule__State__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__State__Group_5__1_in_rule__State__Group_5__03288);
            rule__State__Group_5__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__State__Group_5__0"


    // $ANTLR start "rule__State__Group_5__0__Impl"
    // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:1667:1: rule__State__Group_5__0__Impl : ( 'incoming' ) ;
    public final void rule__State__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:1671:1: ( ( 'incoming' ) )
            // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:1672:1: ( 'incoming' )
            {
            // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:1672:1: ( 'incoming' )
            // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:1673:1: 'incoming'
            {
             before(grammarAccess.getStateAccess().getIncomingKeyword_5_0()); 
            match(input,20,FollowSets000.FOLLOW_20_in_rule__State__Group_5__0__Impl3316); 
             after(grammarAccess.getStateAccess().getIncomingKeyword_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__State__Group_5__0__Impl"


    // $ANTLR start "rule__State__Group_5__1"
    // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:1686:1: rule__State__Group_5__1 : rule__State__Group_5__1__Impl rule__State__Group_5__2 ;
    public final void rule__State__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:1690:1: ( rule__State__Group_5__1__Impl rule__State__Group_5__2 )
            // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:1691:2: rule__State__Group_5__1__Impl rule__State__Group_5__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__State__Group_5__1__Impl_in_rule__State__Group_5__13347);
            rule__State__Group_5__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__State__Group_5__2_in_rule__State__Group_5__13350);
            rule__State__Group_5__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__State__Group_5__1"


    // $ANTLR start "rule__State__Group_5__1__Impl"
    // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:1698:1: rule__State__Group_5__1__Impl : ( '(' ) ;
    public final void rule__State__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:1702:1: ( ( '(' ) )
            // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:1703:1: ( '(' )
            {
            // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:1703:1: ( '(' )
            // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:1704:1: '('
            {
             before(grammarAccess.getStateAccess().getLeftParenthesisKeyword_5_1()); 
            match(input,21,FollowSets000.FOLLOW_21_in_rule__State__Group_5__1__Impl3378); 
             after(grammarAccess.getStateAccess().getLeftParenthesisKeyword_5_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__State__Group_5__1__Impl"


    // $ANTLR start "rule__State__Group_5__2"
    // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:1717:1: rule__State__Group_5__2 : rule__State__Group_5__2__Impl rule__State__Group_5__3 ;
    public final void rule__State__Group_5__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:1721:1: ( rule__State__Group_5__2__Impl rule__State__Group_5__3 )
            // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:1722:2: rule__State__Group_5__2__Impl rule__State__Group_5__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__State__Group_5__2__Impl_in_rule__State__Group_5__23409);
            rule__State__Group_5__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__State__Group_5__3_in_rule__State__Group_5__23412);
            rule__State__Group_5__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__State__Group_5__2"


    // $ANTLR start "rule__State__Group_5__2__Impl"
    // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:1729:1: rule__State__Group_5__2__Impl : ( ( rule__State__IncomingAssignment_5_2 ) ) ;
    public final void rule__State__Group_5__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:1733:1: ( ( ( rule__State__IncomingAssignment_5_2 ) ) )
            // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:1734:1: ( ( rule__State__IncomingAssignment_5_2 ) )
            {
            // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:1734:1: ( ( rule__State__IncomingAssignment_5_2 ) )
            // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:1735:1: ( rule__State__IncomingAssignment_5_2 )
            {
             before(grammarAccess.getStateAccess().getIncomingAssignment_5_2()); 
            // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:1736:1: ( rule__State__IncomingAssignment_5_2 )
            // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:1736:2: rule__State__IncomingAssignment_5_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__State__IncomingAssignment_5_2_in_rule__State__Group_5__2__Impl3439);
            rule__State__IncomingAssignment_5_2();

            state._fsp--;


            }

             after(grammarAccess.getStateAccess().getIncomingAssignment_5_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__State__Group_5__2__Impl"


    // $ANTLR start "rule__State__Group_5__3"
    // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:1746:1: rule__State__Group_5__3 : rule__State__Group_5__3__Impl rule__State__Group_5__4 ;
    public final void rule__State__Group_5__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:1750:1: ( rule__State__Group_5__3__Impl rule__State__Group_5__4 )
            // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:1751:2: rule__State__Group_5__3__Impl rule__State__Group_5__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__State__Group_5__3__Impl_in_rule__State__Group_5__33469);
            rule__State__Group_5__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__State__Group_5__4_in_rule__State__Group_5__33472);
            rule__State__Group_5__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__State__Group_5__3"


    // $ANTLR start "rule__State__Group_5__3__Impl"
    // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:1758:1: rule__State__Group_5__3__Impl : ( ( rule__State__Group_5_3__0 )* ) ;
    public final void rule__State__Group_5__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:1762:1: ( ( ( rule__State__Group_5_3__0 )* ) )
            // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:1763:1: ( ( rule__State__Group_5_3__0 )* )
            {
            // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:1763:1: ( ( rule__State__Group_5_3__0 )* )
            // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:1764:1: ( rule__State__Group_5_3__0 )*
            {
             before(grammarAccess.getStateAccess().getGroup_5_3()); 
            // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:1765:1: ( rule__State__Group_5_3__0 )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==17) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:1765:2: rule__State__Group_5_3__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__State__Group_5_3__0_in_rule__State__Group_5__3__Impl3499);
            	    rule__State__Group_5_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop16;
                }
            } while (true);

             after(grammarAccess.getStateAccess().getGroup_5_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__State__Group_5__3__Impl"


    // $ANTLR start "rule__State__Group_5__4"
    // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:1775:1: rule__State__Group_5__4 : rule__State__Group_5__4__Impl ;
    public final void rule__State__Group_5__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:1779:1: ( rule__State__Group_5__4__Impl )
            // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:1780:2: rule__State__Group_5__4__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__State__Group_5__4__Impl_in_rule__State__Group_5__43530);
            rule__State__Group_5__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__State__Group_5__4"


    // $ANTLR start "rule__State__Group_5__4__Impl"
    // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:1786:1: rule__State__Group_5__4__Impl : ( ')' ) ;
    public final void rule__State__Group_5__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:1790:1: ( ( ')' ) )
            // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:1791:1: ( ')' )
            {
            // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:1791:1: ( ')' )
            // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:1792:1: ')'
            {
             before(grammarAccess.getStateAccess().getRightParenthesisKeyword_5_4()); 
            match(input,22,FollowSets000.FOLLOW_22_in_rule__State__Group_5__4__Impl3558); 
             after(grammarAccess.getStateAccess().getRightParenthesisKeyword_5_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__State__Group_5__4__Impl"


    // $ANTLR start "rule__State__Group_5_3__0"
    // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:1815:1: rule__State__Group_5_3__0 : rule__State__Group_5_3__0__Impl rule__State__Group_5_3__1 ;
    public final void rule__State__Group_5_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:1819:1: ( rule__State__Group_5_3__0__Impl rule__State__Group_5_3__1 )
            // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:1820:2: rule__State__Group_5_3__0__Impl rule__State__Group_5_3__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__State__Group_5_3__0__Impl_in_rule__State__Group_5_3__03599);
            rule__State__Group_5_3__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__State__Group_5_3__1_in_rule__State__Group_5_3__03602);
            rule__State__Group_5_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__State__Group_5_3__0"


    // $ANTLR start "rule__State__Group_5_3__0__Impl"
    // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:1827:1: rule__State__Group_5_3__0__Impl : ( ',' ) ;
    public final void rule__State__Group_5_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:1831:1: ( ( ',' ) )
            // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:1832:1: ( ',' )
            {
            // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:1832:1: ( ',' )
            // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:1833:1: ','
            {
             before(grammarAccess.getStateAccess().getCommaKeyword_5_3_0()); 
            match(input,17,FollowSets000.FOLLOW_17_in_rule__State__Group_5_3__0__Impl3630); 
             after(grammarAccess.getStateAccess().getCommaKeyword_5_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__State__Group_5_3__0__Impl"


    // $ANTLR start "rule__State__Group_5_3__1"
    // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:1846:1: rule__State__Group_5_3__1 : rule__State__Group_5_3__1__Impl ;
    public final void rule__State__Group_5_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:1850:1: ( rule__State__Group_5_3__1__Impl )
            // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:1851:2: rule__State__Group_5_3__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__State__Group_5_3__1__Impl_in_rule__State__Group_5_3__13661);
            rule__State__Group_5_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__State__Group_5_3__1"


    // $ANTLR start "rule__State__Group_5_3__1__Impl"
    // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:1857:1: rule__State__Group_5_3__1__Impl : ( ( rule__State__IncomingAssignment_5_3_1 ) ) ;
    public final void rule__State__Group_5_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:1861:1: ( ( ( rule__State__IncomingAssignment_5_3_1 ) ) )
            // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:1862:1: ( ( rule__State__IncomingAssignment_5_3_1 ) )
            {
            // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:1862:1: ( ( rule__State__IncomingAssignment_5_3_1 ) )
            // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:1863:1: ( rule__State__IncomingAssignment_5_3_1 )
            {
             before(grammarAccess.getStateAccess().getIncomingAssignment_5_3_1()); 
            // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:1864:1: ( rule__State__IncomingAssignment_5_3_1 )
            // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:1864:2: rule__State__IncomingAssignment_5_3_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__State__IncomingAssignment_5_3_1_in_rule__State__Group_5_3__1__Impl3688);
            rule__State__IncomingAssignment_5_3_1();

            state._fsp--;


            }

             after(grammarAccess.getStateAccess().getIncomingAssignment_5_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__State__Group_5_3__1__Impl"


    // $ANTLR start "rule__State__Group_6__0"
    // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:1878:1: rule__State__Group_6__0 : rule__State__Group_6__0__Impl rule__State__Group_6__1 ;
    public final void rule__State__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:1882:1: ( rule__State__Group_6__0__Impl rule__State__Group_6__1 )
            // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:1883:2: rule__State__Group_6__0__Impl rule__State__Group_6__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__State__Group_6__0__Impl_in_rule__State__Group_6__03722);
            rule__State__Group_6__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__State__Group_6__1_in_rule__State__Group_6__03725);
            rule__State__Group_6__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__State__Group_6__0"


    // $ANTLR start "rule__State__Group_6__0__Impl"
    // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:1890:1: rule__State__Group_6__0__Impl : ( 'outgoing' ) ;
    public final void rule__State__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:1894:1: ( ( 'outgoing' ) )
            // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:1895:1: ( 'outgoing' )
            {
            // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:1895:1: ( 'outgoing' )
            // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:1896:1: 'outgoing'
            {
             before(grammarAccess.getStateAccess().getOutgoingKeyword_6_0()); 
            match(input,23,FollowSets000.FOLLOW_23_in_rule__State__Group_6__0__Impl3753); 
             after(grammarAccess.getStateAccess().getOutgoingKeyword_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__State__Group_6__0__Impl"


    // $ANTLR start "rule__State__Group_6__1"
    // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:1909:1: rule__State__Group_6__1 : rule__State__Group_6__1__Impl rule__State__Group_6__2 ;
    public final void rule__State__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:1913:1: ( rule__State__Group_6__1__Impl rule__State__Group_6__2 )
            // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:1914:2: rule__State__Group_6__1__Impl rule__State__Group_6__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__State__Group_6__1__Impl_in_rule__State__Group_6__13784);
            rule__State__Group_6__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__State__Group_6__2_in_rule__State__Group_6__13787);
            rule__State__Group_6__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__State__Group_6__1"


    // $ANTLR start "rule__State__Group_6__1__Impl"
    // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:1921:1: rule__State__Group_6__1__Impl : ( '(' ) ;
    public final void rule__State__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:1925:1: ( ( '(' ) )
            // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:1926:1: ( '(' )
            {
            // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:1926:1: ( '(' )
            // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:1927:1: '('
            {
             before(grammarAccess.getStateAccess().getLeftParenthesisKeyword_6_1()); 
            match(input,21,FollowSets000.FOLLOW_21_in_rule__State__Group_6__1__Impl3815); 
             after(grammarAccess.getStateAccess().getLeftParenthesisKeyword_6_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__State__Group_6__1__Impl"


    // $ANTLR start "rule__State__Group_6__2"
    // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:1940:1: rule__State__Group_6__2 : rule__State__Group_6__2__Impl rule__State__Group_6__3 ;
    public final void rule__State__Group_6__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:1944:1: ( rule__State__Group_6__2__Impl rule__State__Group_6__3 )
            // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:1945:2: rule__State__Group_6__2__Impl rule__State__Group_6__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__State__Group_6__2__Impl_in_rule__State__Group_6__23846);
            rule__State__Group_6__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__State__Group_6__3_in_rule__State__Group_6__23849);
            rule__State__Group_6__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__State__Group_6__2"


    // $ANTLR start "rule__State__Group_6__2__Impl"
    // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:1952:1: rule__State__Group_6__2__Impl : ( ( rule__State__OutgoingAssignment_6_2 ) ) ;
    public final void rule__State__Group_6__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:1956:1: ( ( ( rule__State__OutgoingAssignment_6_2 ) ) )
            // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:1957:1: ( ( rule__State__OutgoingAssignment_6_2 ) )
            {
            // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:1957:1: ( ( rule__State__OutgoingAssignment_6_2 ) )
            // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:1958:1: ( rule__State__OutgoingAssignment_6_2 )
            {
             before(grammarAccess.getStateAccess().getOutgoingAssignment_6_2()); 
            // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:1959:1: ( rule__State__OutgoingAssignment_6_2 )
            // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:1959:2: rule__State__OutgoingAssignment_6_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__State__OutgoingAssignment_6_2_in_rule__State__Group_6__2__Impl3876);
            rule__State__OutgoingAssignment_6_2();

            state._fsp--;


            }

             after(grammarAccess.getStateAccess().getOutgoingAssignment_6_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__State__Group_6__2__Impl"


    // $ANTLR start "rule__State__Group_6__3"
    // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:1969:1: rule__State__Group_6__3 : rule__State__Group_6__3__Impl rule__State__Group_6__4 ;
    public final void rule__State__Group_6__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:1973:1: ( rule__State__Group_6__3__Impl rule__State__Group_6__4 )
            // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:1974:2: rule__State__Group_6__3__Impl rule__State__Group_6__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__State__Group_6__3__Impl_in_rule__State__Group_6__33906);
            rule__State__Group_6__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__State__Group_6__4_in_rule__State__Group_6__33909);
            rule__State__Group_6__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__State__Group_6__3"


    // $ANTLR start "rule__State__Group_6__3__Impl"
    // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:1981:1: rule__State__Group_6__3__Impl : ( ( rule__State__Group_6_3__0 )* ) ;
    public final void rule__State__Group_6__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:1985:1: ( ( ( rule__State__Group_6_3__0 )* ) )
            // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:1986:1: ( ( rule__State__Group_6_3__0 )* )
            {
            // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:1986:1: ( ( rule__State__Group_6_3__0 )* )
            // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:1987:1: ( rule__State__Group_6_3__0 )*
            {
             before(grammarAccess.getStateAccess().getGroup_6_3()); 
            // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:1988:1: ( rule__State__Group_6_3__0 )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==17) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:1988:2: rule__State__Group_6_3__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__State__Group_6_3__0_in_rule__State__Group_6__3__Impl3936);
            	    rule__State__Group_6_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop17;
                }
            } while (true);

             after(grammarAccess.getStateAccess().getGroup_6_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__State__Group_6__3__Impl"


    // $ANTLR start "rule__State__Group_6__4"
    // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:1998:1: rule__State__Group_6__4 : rule__State__Group_6__4__Impl ;
    public final void rule__State__Group_6__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:2002:1: ( rule__State__Group_6__4__Impl )
            // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:2003:2: rule__State__Group_6__4__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__State__Group_6__4__Impl_in_rule__State__Group_6__43967);
            rule__State__Group_6__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__State__Group_6__4"


    // $ANTLR start "rule__State__Group_6__4__Impl"
    // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:2009:1: rule__State__Group_6__4__Impl : ( ')' ) ;
    public final void rule__State__Group_6__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:2013:1: ( ( ')' ) )
            // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:2014:1: ( ')' )
            {
            // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:2014:1: ( ')' )
            // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:2015:1: ')'
            {
             before(grammarAccess.getStateAccess().getRightParenthesisKeyword_6_4()); 
            match(input,22,FollowSets000.FOLLOW_22_in_rule__State__Group_6__4__Impl3995); 
             after(grammarAccess.getStateAccess().getRightParenthesisKeyword_6_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__State__Group_6__4__Impl"


    // $ANTLR start "rule__State__Group_6_3__0"
    // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:2038:1: rule__State__Group_6_3__0 : rule__State__Group_6_3__0__Impl rule__State__Group_6_3__1 ;
    public final void rule__State__Group_6_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:2042:1: ( rule__State__Group_6_3__0__Impl rule__State__Group_6_3__1 )
            // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:2043:2: rule__State__Group_6_3__0__Impl rule__State__Group_6_3__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__State__Group_6_3__0__Impl_in_rule__State__Group_6_3__04036);
            rule__State__Group_6_3__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__State__Group_6_3__1_in_rule__State__Group_6_3__04039);
            rule__State__Group_6_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__State__Group_6_3__0"


    // $ANTLR start "rule__State__Group_6_3__0__Impl"
    // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:2050:1: rule__State__Group_6_3__0__Impl : ( ',' ) ;
    public final void rule__State__Group_6_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:2054:1: ( ( ',' ) )
            // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:2055:1: ( ',' )
            {
            // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:2055:1: ( ',' )
            // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:2056:1: ','
            {
             before(grammarAccess.getStateAccess().getCommaKeyword_6_3_0()); 
            match(input,17,FollowSets000.FOLLOW_17_in_rule__State__Group_6_3__0__Impl4067); 
             after(grammarAccess.getStateAccess().getCommaKeyword_6_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__State__Group_6_3__0__Impl"


    // $ANTLR start "rule__State__Group_6_3__1"
    // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:2069:1: rule__State__Group_6_3__1 : rule__State__Group_6_3__1__Impl ;
    public final void rule__State__Group_6_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:2073:1: ( rule__State__Group_6_3__1__Impl )
            // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:2074:2: rule__State__Group_6_3__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__State__Group_6_3__1__Impl_in_rule__State__Group_6_3__14098);
            rule__State__Group_6_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__State__Group_6_3__1"


    // $ANTLR start "rule__State__Group_6_3__1__Impl"
    // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:2080:1: rule__State__Group_6_3__1__Impl : ( ( rule__State__OutgoingAssignment_6_3_1 ) ) ;
    public final void rule__State__Group_6_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:2084:1: ( ( ( rule__State__OutgoingAssignment_6_3_1 ) ) )
            // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:2085:1: ( ( rule__State__OutgoingAssignment_6_3_1 ) )
            {
            // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:2085:1: ( ( rule__State__OutgoingAssignment_6_3_1 ) )
            // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:2086:1: ( rule__State__OutgoingAssignment_6_3_1 )
            {
             before(grammarAccess.getStateAccess().getOutgoingAssignment_6_3_1()); 
            // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:2087:1: ( rule__State__OutgoingAssignment_6_3_1 )
            // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:2087:2: rule__State__OutgoingAssignment_6_3_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__State__OutgoingAssignment_6_3_1_in_rule__State__Group_6_3__1__Impl4125);
            rule__State__OutgoingAssignment_6_3_1();

            state._fsp--;


            }

             after(grammarAccess.getStateAccess().getOutgoingAssignment_6_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__State__Group_6_3__1__Impl"


    // $ANTLR start "rule__State__Group_7__0"
    // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:2101:1: rule__State__Group_7__0 : rule__State__Group_7__0__Impl rule__State__Group_7__1 ;
    public final void rule__State__Group_7__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:2105:1: ( rule__State__Group_7__0__Impl rule__State__Group_7__1 )
            // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:2106:2: rule__State__Group_7__0__Impl rule__State__Group_7__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__State__Group_7__0__Impl_in_rule__State__Group_7__04159);
            rule__State__Group_7__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__State__Group_7__1_in_rule__State__Group_7__04162);
            rule__State__Group_7__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__State__Group_7__0"


    // $ANTLR start "rule__State__Group_7__0__Impl"
    // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:2113:1: rule__State__Group_7__0__Impl : ( 'refines' ) ;
    public final void rule__State__Group_7__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:2117:1: ( ( 'refines' ) )
            // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:2118:1: ( 'refines' )
            {
            // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:2118:1: ( 'refines' )
            // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:2119:1: 'refines'
            {
             before(grammarAccess.getStateAccess().getRefinesKeyword_7_0()); 
            match(input,15,FollowSets000.FOLLOW_15_in_rule__State__Group_7__0__Impl4190); 
             after(grammarAccess.getStateAccess().getRefinesKeyword_7_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__State__Group_7__0__Impl"


    // $ANTLR start "rule__State__Group_7__1"
    // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:2132:1: rule__State__Group_7__1 : rule__State__Group_7__1__Impl ;
    public final void rule__State__Group_7__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:2136:1: ( rule__State__Group_7__1__Impl )
            // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:2137:2: rule__State__Group_7__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__State__Group_7__1__Impl_in_rule__State__Group_7__14221);
            rule__State__Group_7__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__State__Group_7__1"


    // $ANTLR start "rule__State__Group_7__1__Impl"
    // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:2143:1: rule__State__Group_7__1__Impl : ( ( rule__State__RefinesAssignment_7_1 ) ) ;
    public final void rule__State__Group_7__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:2147:1: ( ( ( rule__State__RefinesAssignment_7_1 ) ) )
            // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:2148:1: ( ( rule__State__RefinesAssignment_7_1 ) )
            {
            // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:2148:1: ( ( rule__State__RefinesAssignment_7_1 ) )
            // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:2149:1: ( rule__State__RefinesAssignment_7_1 )
            {
             before(grammarAccess.getStateAccess().getRefinesAssignment_7_1()); 
            // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:2150:1: ( rule__State__RefinesAssignment_7_1 )
            // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:2150:2: rule__State__RefinesAssignment_7_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__State__RefinesAssignment_7_1_in_rule__State__Group_7__1__Impl4248);
            rule__State__RefinesAssignment_7_1();

            state._fsp--;


            }

             after(grammarAccess.getStateAccess().getRefinesAssignment_7_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__State__Group_7__1__Impl"


    // $ANTLR start "rule__State__Group_8__0"
    // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:2164:1: rule__State__Group_8__0 : rule__State__Group_8__0__Impl rule__State__Group_8__1 ;
    public final void rule__State__Group_8__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:2168:1: ( rule__State__Group_8__0__Impl rule__State__Group_8__1 )
            // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:2169:2: rule__State__Group_8__0__Impl rule__State__Group_8__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__State__Group_8__0__Impl_in_rule__State__Group_8__04282);
            rule__State__Group_8__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__State__Group_8__1_in_rule__State__Group_8__04285);
            rule__State__Group_8__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__State__Group_8__0"


    // $ANTLR start "rule__State__Group_8__0__Impl"
    // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:2176:1: rule__State__Group_8__0__Impl : ( 'statemachines' ) ;
    public final void rule__State__Group_8__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:2180:1: ( ( 'statemachines' ) )
            // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:2181:1: ( 'statemachines' )
            {
            // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:2181:1: ( 'statemachines' )
            // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:2182:1: 'statemachines'
            {
             before(grammarAccess.getStateAccess().getStatemachinesKeyword_8_0()); 
            match(input,24,FollowSets000.FOLLOW_24_in_rule__State__Group_8__0__Impl4313); 
             after(grammarAccess.getStateAccess().getStatemachinesKeyword_8_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__State__Group_8__0__Impl"


    // $ANTLR start "rule__State__Group_8__1"
    // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:2195:1: rule__State__Group_8__1 : rule__State__Group_8__1__Impl rule__State__Group_8__2 ;
    public final void rule__State__Group_8__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:2199:1: ( rule__State__Group_8__1__Impl rule__State__Group_8__2 )
            // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:2200:2: rule__State__Group_8__1__Impl rule__State__Group_8__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__State__Group_8__1__Impl_in_rule__State__Group_8__14344);
            rule__State__Group_8__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__State__Group_8__2_in_rule__State__Group_8__14347);
            rule__State__Group_8__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__State__Group_8__1"


    // $ANTLR start "rule__State__Group_8__1__Impl"
    // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:2207:1: rule__State__Group_8__1__Impl : ( '{' ) ;
    public final void rule__State__Group_8__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:2211:1: ( ( '{' ) )
            // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:2212:1: ( '{' )
            {
            // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:2212:1: ( '{' )
            // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:2213:1: '{'
            {
             before(grammarAccess.getStateAccess().getLeftCurlyBracketKeyword_8_1()); 
            match(input,12,FollowSets000.FOLLOW_12_in_rule__State__Group_8__1__Impl4375); 
             after(grammarAccess.getStateAccess().getLeftCurlyBracketKeyword_8_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__State__Group_8__1__Impl"


    // $ANTLR start "rule__State__Group_8__2"
    // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:2226:1: rule__State__Group_8__2 : rule__State__Group_8__2__Impl rule__State__Group_8__3 ;
    public final void rule__State__Group_8__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:2230:1: ( rule__State__Group_8__2__Impl rule__State__Group_8__3 )
            // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:2231:2: rule__State__Group_8__2__Impl rule__State__Group_8__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__State__Group_8__2__Impl_in_rule__State__Group_8__24406);
            rule__State__Group_8__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__State__Group_8__3_in_rule__State__Group_8__24409);
            rule__State__Group_8__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__State__Group_8__2"


    // $ANTLR start "rule__State__Group_8__2__Impl"
    // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:2238:1: rule__State__Group_8__2__Impl : ( ( rule__State__StatemachinesAssignment_8_2 ) ) ;
    public final void rule__State__Group_8__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:2242:1: ( ( ( rule__State__StatemachinesAssignment_8_2 ) ) )
            // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:2243:1: ( ( rule__State__StatemachinesAssignment_8_2 ) )
            {
            // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:2243:1: ( ( rule__State__StatemachinesAssignment_8_2 ) )
            // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:2244:1: ( rule__State__StatemachinesAssignment_8_2 )
            {
             before(grammarAccess.getStateAccess().getStatemachinesAssignment_8_2()); 
            // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:2245:1: ( rule__State__StatemachinesAssignment_8_2 )
            // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:2245:2: rule__State__StatemachinesAssignment_8_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__State__StatemachinesAssignment_8_2_in_rule__State__Group_8__2__Impl4436);
            rule__State__StatemachinesAssignment_8_2();

            state._fsp--;


            }

             after(grammarAccess.getStateAccess().getStatemachinesAssignment_8_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__State__Group_8__2__Impl"


    // $ANTLR start "rule__State__Group_8__3"
    // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:2255:1: rule__State__Group_8__3 : rule__State__Group_8__3__Impl rule__State__Group_8__4 ;
    public final void rule__State__Group_8__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:2259:1: ( rule__State__Group_8__3__Impl rule__State__Group_8__4 )
            // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:2260:2: rule__State__Group_8__3__Impl rule__State__Group_8__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__State__Group_8__3__Impl_in_rule__State__Group_8__34466);
            rule__State__Group_8__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__State__Group_8__4_in_rule__State__Group_8__34469);
            rule__State__Group_8__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__State__Group_8__3"


    // $ANTLR start "rule__State__Group_8__3__Impl"
    // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:2267:1: rule__State__Group_8__3__Impl : ( ( rule__State__Group_8_3__0 )* ) ;
    public final void rule__State__Group_8__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:2271:1: ( ( ( rule__State__Group_8_3__0 )* ) )
            // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:2272:1: ( ( rule__State__Group_8_3__0 )* )
            {
            // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:2272:1: ( ( rule__State__Group_8_3__0 )* )
            // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:2273:1: ( rule__State__Group_8_3__0 )*
            {
             before(grammarAccess.getStateAccess().getGroup_8_3()); 
            // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:2274:1: ( rule__State__Group_8_3__0 )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( (LA18_0==17) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:2274:2: rule__State__Group_8_3__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__State__Group_8_3__0_in_rule__State__Group_8__3__Impl4496);
            	    rule__State__Group_8_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop18;
                }
            } while (true);

             after(grammarAccess.getStateAccess().getGroup_8_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__State__Group_8__3__Impl"


    // $ANTLR start "rule__State__Group_8__4"
    // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:2284:1: rule__State__Group_8__4 : rule__State__Group_8__4__Impl ;
    public final void rule__State__Group_8__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:2288:1: ( rule__State__Group_8__4__Impl )
            // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:2289:2: rule__State__Group_8__4__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__State__Group_8__4__Impl_in_rule__State__Group_8__44527);
            rule__State__Group_8__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__State__Group_8__4"


    // $ANTLR start "rule__State__Group_8__4__Impl"
    // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:2295:1: rule__State__Group_8__4__Impl : ( '}' ) ;
    public final void rule__State__Group_8__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:2299:1: ( ( '}' ) )
            // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:2300:1: ( '}' )
            {
            // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:2300:1: ( '}' )
            // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:2301:1: '}'
            {
             before(grammarAccess.getStateAccess().getRightCurlyBracketKeyword_8_4()); 
            match(input,13,FollowSets000.FOLLOW_13_in_rule__State__Group_8__4__Impl4555); 
             after(grammarAccess.getStateAccess().getRightCurlyBracketKeyword_8_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__State__Group_8__4__Impl"


    // $ANTLR start "rule__State__Group_8_3__0"
    // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:2324:1: rule__State__Group_8_3__0 : rule__State__Group_8_3__0__Impl rule__State__Group_8_3__1 ;
    public final void rule__State__Group_8_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:2328:1: ( rule__State__Group_8_3__0__Impl rule__State__Group_8_3__1 )
            // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:2329:2: rule__State__Group_8_3__0__Impl rule__State__Group_8_3__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__State__Group_8_3__0__Impl_in_rule__State__Group_8_3__04596);
            rule__State__Group_8_3__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__State__Group_8_3__1_in_rule__State__Group_8_3__04599);
            rule__State__Group_8_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__State__Group_8_3__0"


    // $ANTLR start "rule__State__Group_8_3__0__Impl"
    // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:2336:1: rule__State__Group_8_3__0__Impl : ( ',' ) ;
    public final void rule__State__Group_8_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:2340:1: ( ( ',' ) )
            // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:2341:1: ( ',' )
            {
            // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:2341:1: ( ',' )
            // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:2342:1: ','
            {
             before(grammarAccess.getStateAccess().getCommaKeyword_8_3_0()); 
            match(input,17,FollowSets000.FOLLOW_17_in_rule__State__Group_8_3__0__Impl4627); 
             after(grammarAccess.getStateAccess().getCommaKeyword_8_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__State__Group_8_3__0__Impl"


    // $ANTLR start "rule__State__Group_8_3__1"
    // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:2355:1: rule__State__Group_8_3__1 : rule__State__Group_8_3__1__Impl ;
    public final void rule__State__Group_8_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:2359:1: ( rule__State__Group_8_3__1__Impl )
            // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:2360:2: rule__State__Group_8_3__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__State__Group_8_3__1__Impl_in_rule__State__Group_8_3__14658);
            rule__State__Group_8_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__State__Group_8_3__1"


    // $ANTLR start "rule__State__Group_8_3__1__Impl"
    // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:2366:1: rule__State__Group_8_3__1__Impl : ( ( rule__State__StatemachinesAssignment_8_3_1 ) ) ;
    public final void rule__State__Group_8_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:2370:1: ( ( ( rule__State__StatemachinesAssignment_8_3_1 ) ) )
            // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:2371:1: ( ( rule__State__StatemachinesAssignment_8_3_1 ) )
            {
            // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:2371:1: ( ( rule__State__StatemachinesAssignment_8_3_1 ) )
            // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:2372:1: ( rule__State__StatemachinesAssignment_8_3_1 )
            {
             before(grammarAccess.getStateAccess().getStatemachinesAssignment_8_3_1()); 
            // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:2373:1: ( rule__State__StatemachinesAssignment_8_3_1 )
            // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:2373:2: rule__State__StatemachinesAssignment_8_3_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__State__StatemachinesAssignment_8_3_1_in_rule__State__Group_8_3__1__Impl4685);
            rule__State__StatemachinesAssignment_8_3_1();

            state._fsp--;


            }

             after(grammarAccess.getStateAccess().getStatemachinesAssignment_8_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__State__Group_8_3__1__Impl"


    // $ANTLR start "rule__State__Group_9__0"
    // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:2387:1: rule__State__Group_9__0 : rule__State__Group_9__0__Impl rule__State__Group_9__1 ;
    public final void rule__State__Group_9__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:2391:1: ( rule__State__Group_9__0__Impl rule__State__Group_9__1 )
            // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:2392:2: rule__State__Group_9__0__Impl rule__State__Group_9__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__State__Group_9__0__Impl_in_rule__State__Group_9__04719);
            rule__State__Group_9__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__State__Group_9__1_in_rule__State__Group_9__04722);
            rule__State__Group_9__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__State__Group_9__0"


    // $ANTLR start "rule__State__Group_9__0__Impl"
    // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:2399:1: rule__State__Group_9__0__Impl : ( 'invariants' ) ;
    public final void rule__State__Group_9__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:2403:1: ( ( 'invariants' ) )
            // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:2404:1: ( 'invariants' )
            {
            // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:2404:1: ( 'invariants' )
            // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:2405:1: 'invariants'
            {
             before(grammarAccess.getStateAccess().getInvariantsKeyword_9_0()); 
            match(input,25,FollowSets000.FOLLOW_25_in_rule__State__Group_9__0__Impl4750); 
             after(grammarAccess.getStateAccess().getInvariantsKeyword_9_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__State__Group_9__0__Impl"


    // $ANTLR start "rule__State__Group_9__1"
    // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:2418:1: rule__State__Group_9__1 : rule__State__Group_9__1__Impl rule__State__Group_9__2 ;
    public final void rule__State__Group_9__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:2422:1: ( rule__State__Group_9__1__Impl rule__State__Group_9__2 )
            // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:2423:2: rule__State__Group_9__1__Impl rule__State__Group_9__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__State__Group_9__1__Impl_in_rule__State__Group_9__14781);
            rule__State__Group_9__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__State__Group_9__2_in_rule__State__Group_9__14784);
            rule__State__Group_9__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__State__Group_9__1"


    // $ANTLR start "rule__State__Group_9__1__Impl"
    // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:2430:1: rule__State__Group_9__1__Impl : ( '{' ) ;
    public final void rule__State__Group_9__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:2434:1: ( ( '{' ) )
            // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:2435:1: ( '{' )
            {
            // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:2435:1: ( '{' )
            // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:2436:1: '{'
            {
             before(grammarAccess.getStateAccess().getLeftCurlyBracketKeyword_9_1()); 
            match(input,12,FollowSets000.FOLLOW_12_in_rule__State__Group_9__1__Impl4812); 
             after(grammarAccess.getStateAccess().getLeftCurlyBracketKeyword_9_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__State__Group_9__1__Impl"


    // $ANTLR start "rule__State__Group_9__2"
    // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:2449:1: rule__State__Group_9__2 : rule__State__Group_9__2__Impl rule__State__Group_9__3 ;
    public final void rule__State__Group_9__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:2453:1: ( rule__State__Group_9__2__Impl rule__State__Group_9__3 )
            // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:2454:2: rule__State__Group_9__2__Impl rule__State__Group_9__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__State__Group_9__2__Impl_in_rule__State__Group_9__24843);
            rule__State__Group_9__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__State__Group_9__3_in_rule__State__Group_9__24846);
            rule__State__Group_9__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__State__Group_9__2"


    // $ANTLR start "rule__State__Group_9__2__Impl"
    // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:2461:1: rule__State__Group_9__2__Impl : ( ( rule__State__InvariantsAssignment_9_2 ) ) ;
    public final void rule__State__Group_9__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:2465:1: ( ( ( rule__State__InvariantsAssignment_9_2 ) ) )
            // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:2466:1: ( ( rule__State__InvariantsAssignment_9_2 ) )
            {
            // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:2466:1: ( ( rule__State__InvariantsAssignment_9_2 ) )
            // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:2467:1: ( rule__State__InvariantsAssignment_9_2 )
            {
             before(grammarAccess.getStateAccess().getInvariantsAssignment_9_2()); 
            // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:2468:1: ( rule__State__InvariantsAssignment_9_2 )
            // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:2468:2: rule__State__InvariantsAssignment_9_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__State__InvariantsAssignment_9_2_in_rule__State__Group_9__2__Impl4873);
            rule__State__InvariantsAssignment_9_2();

            state._fsp--;


            }

             after(grammarAccess.getStateAccess().getInvariantsAssignment_9_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__State__Group_9__2__Impl"


    // $ANTLR start "rule__State__Group_9__3"
    // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:2478:1: rule__State__Group_9__3 : rule__State__Group_9__3__Impl rule__State__Group_9__4 ;
    public final void rule__State__Group_9__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:2482:1: ( rule__State__Group_9__3__Impl rule__State__Group_9__4 )
            // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:2483:2: rule__State__Group_9__3__Impl rule__State__Group_9__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__State__Group_9__3__Impl_in_rule__State__Group_9__34903);
            rule__State__Group_9__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__State__Group_9__4_in_rule__State__Group_9__34906);
            rule__State__Group_9__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__State__Group_9__3"


    // $ANTLR start "rule__State__Group_9__3__Impl"
    // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:2490:1: rule__State__Group_9__3__Impl : ( ( rule__State__Group_9_3__0 )* ) ;
    public final void rule__State__Group_9__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:2494:1: ( ( ( rule__State__Group_9_3__0 )* ) )
            // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:2495:1: ( ( rule__State__Group_9_3__0 )* )
            {
            // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:2495:1: ( ( rule__State__Group_9_3__0 )* )
            // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:2496:1: ( rule__State__Group_9_3__0 )*
            {
             before(grammarAccess.getStateAccess().getGroup_9_3()); 
            // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:2497:1: ( rule__State__Group_9_3__0 )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( (LA19_0==17) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:2497:2: rule__State__Group_9_3__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__State__Group_9_3__0_in_rule__State__Group_9__3__Impl4933);
            	    rule__State__Group_9_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop19;
                }
            } while (true);

             after(grammarAccess.getStateAccess().getGroup_9_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__State__Group_9__3__Impl"


    // $ANTLR start "rule__State__Group_9__4"
    // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:2507:1: rule__State__Group_9__4 : rule__State__Group_9__4__Impl ;
    public final void rule__State__Group_9__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:2511:1: ( rule__State__Group_9__4__Impl )
            // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:2512:2: rule__State__Group_9__4__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__State__Group_9__4__Impl_in_rule__State__Group_9__44964);
            rule__State__Group_9__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__State__Group_9__4"


    // $ANTLR start "rule__State__Group_9__4__Impl"
    // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:2518:1: rule__State__Group_9__4__Impl : ( '}' ) ;
    public final void rule__State__Group_9__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:2522:1: ( ( '}' ) )
            // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:2523:1: ( '}' )
            {
            // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:2523:1: ( '}' )
            // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:2524:1: '}'
            {
             before(grammarAccess.getStateAccess().getRightCurlyBracketKeyword_9_4()); 
            match(input,13,FollowSets000.FOLLOW_13_in_rule__State__Group_9__4__Impl4992); 
             after(grammarAccess.getStateAccess().getRightCurlyBracketKeyword_9_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__State__Group_9__4__Impl"


    // $ANTLR start "rule__State__Group_9_3__0"
    // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:2547:1: rule__State__Group_9_3__0 : rule__State__Group_9_3__0__Impl rule__State__Group_9_3__1 ;
    public final void rule__State__Group_9_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:2551:1: ( rule__State__Group_9_3__0__Impl rule__State__Group_9_3__1 )
            // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:2552:2: rule__State__Group_9_3__0__Impl rule__State__Group_9_3__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__State__Group_9_3__0__Impl_in_rule__State__Group_9_3__05033);
            rule__State__Group_9_3__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__State__Group_9_3__1_in_rule__State__Group_9_3__05036);
            rule__State__Group_9_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__State__Group_9_3__0"


    // $ANTLR start "rule__State__Group_9_3__0__Impl"
    // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:2559:1: rule__State__Group_9_3__0__Impl : ( ',' ) ;
    public final void rule__State__Group_9_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:2563:1: ( ( ',' ) )
            // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:2564:1: ( ',' )
            {
            // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:2564:1: ( ',' )
            // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:2565:1: ','
            {
             before(grammarAccess.getStateAccess().getCommaKeyword_9_3_0()); 
            match(input,17,FollowSets000.FOLLOW_17_in_rule__State__Group_9_3__0__Impl5064); 
             after(grammarAccess.getStateAccess().getCommaKeyword_9_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__State__Group_9_3__0__Impl"


    // $ANTLR start "rule__State__Group_9_3__1"
    // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:2578:1: rule__State__Group_9_3__1 : rule__State__Group_9_3__1__Impl ;
    public final void rule__State__Group_9_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:2582:1: ( rule__State__Group_9_3__1__Impl )
            // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:2583:2: rule__State__Group_9_3__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__State__Group_9_3__1__Impl_in_rule__State__Group_9_3__15095);
            rule__State__Group_9_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__State__Group_9_3__1"


    // $ANTLR start "rule__State__Group_9_3__1__Impl"
    // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:2589:1: rule__State__Group_9_3__1__Impl : ( ( rule__State__InvariantsAssignment_9_3_1 ) ) ;
    public final void rule__State__Group_9_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:2593:1: ( ( ( rule__State__InvariantsAssignment_9_3_1 ) ) )
            // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:2594:1: ( ( rule__State__InvariantsAssignment_9_3_1 ) )
            {
            // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:2594:1: ( ( rule__State__InvariantsAssignment_9_3_1 ) )
            // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:2595:1: ( rule__State__InvariantsAssignment_9_3_1 )
            {
             before(grammarAccess.getStateAccess().getInvariantsAssignment_9_3_1()); 
            // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:2596:1: ( rule__State__InvariantsAssignment_9_3_1 )
            // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:2596:2: rule__State__InvariantsAssignment_9_3_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__State__InvariantsAssignment_9_3_1_in_rule__State__Group_9_3__1__Impl5122);
            rule__State__InvariantsAssignment_9_3_1();

            state._fsp--;


            }

             after(grammarAccess.getStateAccess().getInvariantsAssignment_9_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__State__Group_9_3__1__Impl"


    // $ANTLR start "rule__Transition__Group__0"
    // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:2610:1: rule__Transition__Group__0 : rule__Transition__Group__0__Impl rule__Transition__Group__1 ;
    public final void rule__Transition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:2614:1: ( rule__Transition__Group__0__Impl rule__Transition__Group__1 )
            // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:2615:2: rule__Transition__Group__0__Impl rule__Transition__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Transition__Group__0__Impl_in_rule__Transition__Group__05156);
            rule__Transition__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Transition__Group__1_in_rule__Transition__Group__05159);
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
    // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:2622:1: rule__Transition__Group__0__Impl : ( ( rule__Transition__LocalGeneratedAssignment_0 )? ) ;
    public final void rule__Transition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:2626:1: ( ( ( rule__Transition__LocalGeneratedAssignment_0 )? ) )
            // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:2627:1: ( ( rule__Transition__LocalGeneratedAssignment_0 )? )
            {
            // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:2627:1: ( ( rule__Transition__LocalGeneratedAssignment_0 )? )
            // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:2628:1: ( rule__Transition__LocalGeneratedAssignment_0 )?
            {
             before(grammarAccess.getTransitionAccess().getLocalGeneratedAssignment_0()); 
            // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:2629:1: ( rule__Transition__LocalGeneratedAssignment_0 )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==38) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:2629:2: rule__Transition__LocalGeneratedAssignment_0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__Transition__LocalGeneratedAssignment_0_in_rule__Transition__Group__0__Impl5186);
                    rule__Transition__LocalGeneratedAssignment_0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getTransitionAccess().getLocalGeneratedAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__Group__0__Impl"


    // $ANTLR start "rule__Transition__Group__1"
    // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:2639:1: rule__Transition__Group__1 : rule__Transition__Group__1__Impl rule__Transition__Group__2 ;
    public final void rule__Transition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:2643:1: ( rule__Transition__Group__1__Impl rule__Transition__Group__2 )
            // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:2644:2: rule__Transition__Group__1__Impl rule__Transition__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Transition__Group__1__Impl_in_rule__Transition__Group__15217);
            rule__Transition__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Transition__Group__2_in_rule__Transition__Group__15220);
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
    // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:2651:1: rule__Transition__Group__1__Impl : ( ( rule__Transition__ExtendedAssignment_1 ) ) ;
    public final void rule__Transition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:2655:1: ( ( ( rule__Transition__ExtendedAssignment_1 ) ) )
            // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:2656:1: ( ( rule__Transition__ExtendedAssignment_1 ) )
            {
            // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:2656:1: ( ( rule__Transition__ExtendedAssignment_1 ) )
            // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:2657:1: ( rule__Transition__ExtendedAssignment_1 )
            {
             before(grammarAccess.getTransitionAccess().getExtendedAssignment_1()); 
            // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:2658:1: ( rule__Transition__ExtendedAssignment_1 )
            // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:2658:2: rule__Transition__ExtendedAssignment_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Transition__ExtendedAssignment_1_in_rule__Transition__Group__1__Impl5247);
            rule__Transition__ExtendedAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getTransitionAccess().getExtendedAssignment_1()); 

            }


            }

        }
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
    // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:2668:1: rule__Transition__Group__2 : rule__Transition__Group__2__Impl rule__Transition__Group__3 ;
    public final void rule__Transition__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:2672:1: ( rule__Transition__Group__2__Impl rule__Transition__Group__3 )
            // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:2673:2: rule__Transition__Group__2__Impl rule__Transition__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__Transition__Group__2__Impl_in_rule__Transition__Group__25277);
            rule__Transition__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Transition__Group__3_in_rule__Transition__Group__25280);
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
    // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:2680:1: rule__Transition__Group__2__Impl : ( 'Transition' ) ;
    public final void rule__Transition__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:2684:1: ( ( 'Transition' ) )
            // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:2685:1: ( 'Transition' )
            {
            // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:2685:1: ( 'Transition' )
            // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:2686:1: 'Transition'
            {
             before(grammarAccess.getTransitionAccess().getTransitionKeyword_2()); 
            match(input,26,FollowSets000.FOLLOW_26_in_rule__Transition__Group__2__Impl5308); 
             after(grammarAccess.getTransitionAccess().getTransitionKeyword_2()); 

            }


            }

        }
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
    // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:2699:1: rule__Transition__Group__3 : rule__Transition__Group__3__Impl rule__Transition__Group__4 ;
    public final void rule__Transition__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:2703:1: ( rule__Transition__Group__3__Impl rule__Transition__Group__4 )
            // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:2704:2: rule__Transition__Group__3__Impl rule__Transition__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__Transition__Group__3__Impl_in_rule__Transition__Group__35339);
            rule__Transition__Group__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Transition__Group__4_in_rule__Transition__Group__35342);
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
    // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:2711:1: rule__Transition__Group__3__Impl : ( '{' ) ;
    public final void rule__Transition__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:2715:1: ( ( '{' ) )
            // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:2716:1: ( '{' )
            {
            // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:2716:1: ( '{' )
            // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:2717:1: '{'
            {
             before(grammarAccess.getTransitionAccess().getLeftCurlyBracketKeyword_3()); 
            match(input,12,FollowSets000.FOLLOW_12_in_rule__Transition__Group__3__Impl5370); 
             after(grammarAccess.getTransitionAccess().getLeftCurlyBracketKeyword_3()); 

            }


            }

        }
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
    // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:2730:1: rule__Transition__Group__4 : rule__Transition__Group__4__Impl rule__Transition__Group__5 ;
    public final void rule__Transition__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:2734:1: ( rule__Transition__Group__4__Impl rule__Transition__Group__5 )
            // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:2735:2: rule__Transition__Group__4__Impl rule__Transition__Group__5
            {
            pushFollow(FollowSets000.FOLLOW_rule__Transition__Group__4__Impl_in_rule__Transition__Group__45401);
            rule__Transition__Group__4__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Transition__Group__5_in_rule__Transition__Group__45404);
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
    // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:2742:1: rule__Transition__Group__4__Impl : ( ( rule__Transition__Group_4__0 )? ) ;
    public final void rule__Transition__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:2746:1: ( ( ( rule__Transition__Group_4__0 )? ) )
            // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:2747:1: ( ( rule__Transition__Group_4__0 )? )
            {
            // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:2747:1: ( ( rule__Transition__Group_4__0 )? )
            // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:2748:1: ( rule__Transition__Group_4__0 )?
            {
             before(grammarAccess.getTransitionAccess().getGroup_4()); 
            // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:2749:1: ( rule__Transition__Group_4__0 )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==14) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:2749:2: rule__Transition__Group_4__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__Transition__Group_4__0_in_rule__Transition__Group__4__Impl5431);
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
    // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:2759:1: rule__Transition__Group__5 : rule__Transition__Group__5__Impl rule__Transition__Group__6 ;
    public final void rule__Transition__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:2763:1: ( rule__Transition__Group__5__Impl rule__Transition__Group__6 )
            // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:2764:2: rule__Transition__Group__5__Impl rule__Transition__Group__6
            {
            pushFollow(FollowSets000.FOLLOW_rule__Transition__Group__5__Impl_in_rule__Transition__Group__55462);
            rule__Transition__Group__5__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Transition__Group__6_in_rule__Transition__Group__55465);
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
    // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:2771:1: rule__Transition__Group__5__Impl : ( ( rule__Transition__Group_5__0 )? ) ;
    public final void rule__Transition__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:2775:1: ( ( ( rule__Transition__Group_5__0 )? ) )
            // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:2776:1: ( ( rule__Transition__Group_5__0 )? )
            {
            // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:2776:1: ( ( rule__Transition__Group_5__0 )? )
            // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:2777:1: ( rule__Transition__Group_5__0 )?
            {
             before(grammarAccess.getTransitionAccess().getGroup_5()); 
            // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:2778:1: ( rule__Transition__Group_5__0 )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==29) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:2778:2: rule__Transition__Group_5__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__Transition__Group_5__0_in_rule__Transition__Group__5__Impl5492);
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
    // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:2788:1: rule__Transition__Group__6 : rule__Transition__Group__6__Impl rule__Transition__Group__7 ;
    public final void rule__Transition__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:2792:1: ( rule__Transition__Group__6__Impl rule__Transition__Group__7 )
            // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:2793:2: rule__Transition__Group__6__Impl rule__Transition__Group__7
            {
            pushFollow(FollowSets000.FOLLOW_rule__Transition__Group__6__Impl_in_rule__Transition__Group__65523);
            rule__Transition__Group__6__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Transition__Group__7_in_rule__Transition__Group__65526);
            rule__Transition__Group__7();

            state._fsp--;


            }

        }
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
    // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:2800:1: rule__Transition__Group__6__Impl : ( 'target' ) ;
    public final void rule__Transition__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:2804:1: ( ( 'target' ) )
            // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:2805:1: ( 'target' )
            {
            // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:2805:1: ( 'target' )
            // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:2806:1: 'target'
            {
             before(grammarAccess.getTransitionAccess().getTargetKeyword_6()); 
            match(input,27,FollowSets000.FOLLOW_27_in_rule__Transition__Group__6__Impl5554); 
             after(grammarAccess.getTransitionAccess().getTargetKeyword_6()); 

            }


            }

        }
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


    // $ANTLR start "rule__Transition__Group__7"
    // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:2819:1: rule__Transition__Group__7 : rule__Transition__Group__7__Impl rule__Transition__Group__8 ;
    public final void rule__Transition__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:2823:1: ( rule__Transition__Group__7__Impl rule__Transition__Group__8 )
            // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:2824:2: rule__Transition__Group__7__Impl rule__Transition__Group__8
            {
            pushFollow(FollowSets000.FOLLOW_rule__Transition__Group__7__Impl_in_rule__Transition__Group__75585);
            rule__Transition__Group__7__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Transition__Group__8_in_rule__Transition__Group__75588);
            rule__Transition__Group__8();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__Group__7"


    // $ANTLR start "rule__Transition__Group__7__Impl"
    // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:2831:1: rule__Transition__Group__7__Impl : ( ( rule__Transition__TargetAssignment_7 ) ) ;
    public final void rule__Transition__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:2835:1: ( ( ( rule__Transition__TargetAssignment_7 ) ) )
            // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:2836:1: ( ( rule__Transition__TargetAssignment_7 ) )
            {
            // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:2836:1: ( ( rule__Transition__TargetAssignment_7 ) )
            // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:2837:1: ( rule__Transition__TargetAssignment_7 )
            {
             before(grammarAccess.getTransitionAccess().getTargetAssignment_7()); 
            // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:2838:1: ( rule__Transition__TargetAssignment_7 )
            // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:2838:2: rule__Transition__TargetAssignment_7
            {
            pushFollow(FollowSets000.FOLLOW_rule__Transition__TargetAssignment_7_in_rule__Transition__Group__7__Impl5615);
            rule__Transition__TargetAssignment_7();

            state._fsp--;


            }

             after(grammarAccess.getTransitionAccess().getTargetAssignment_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__Group__7__Impl"


    // $ANTLR start "rule__Transition__Group__8"
    // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:2848:1: rule__Transition__Group__8 : rule__Transition__Group__8__Impl rule__Transition__Group__9 ;
    public final void rule__Transition__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:2852:1: ( rule__Transition__Group__8__Impl rule__Transition__Group__9 )
            // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:2853:2: rule__Transition__Group__8__Impl rule__Transition__Group__9
            {
            pushFollow(FollowSets000.FOLLOW_rule__Transition__Group__8__Impl_in_rule__Transition__Group__85645);
            rule__Transition__Group__8__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Transition__Group__9_in_rule__Transition__Group__85648);
            rule__Transition__Group__9();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__Group__8"


    // $ANTLR start "rule__Transition__Group__8__Impl"
    // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:2860:1: rule__Transition__Group__8__Impl : ( 'source' ) ;
    public final void rule__Transition__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:2864:1: ( ( 'source' ) )
            // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:2865:1: ( 'source' )
            {
            // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:2865:1: ( 'source' )
            // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:2866:1: 'source'
            {
             before(grammarAccess.getTransitionAccess().getSourceKeyword_8()); 
            match(input,28,FollowSets000.FOLLOW_28_in_rule__Transition__Group__8__Impl5676); 
             after(grammarAccess.getTransitionAccess().getSourceKeyword_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__Group__8__Impl"


    // $ANTLR start "rule__Transition__Group__9"
    // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:2879:1: rule__Transition__Group__9 : rule__Transition__Group__9__Impl rule__Transition__Group__10 ;
    public final void rule__Transition__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:2883:1: ( rule__Transition__Group__9__Impl rule__Transition__Group__10 )
            // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:2884:2: rule__Transition__Group__9__Impl rule__Transition__Group__10
            {
            pushFollow(FollowSets000.FOLLOW_rule__Transition__Group__9__Impl_in_rule__Transition__Group__95707);
            rule__Transition__Group__9__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Transition__Group__10_in_rule__Transition__Group__95710);
            rule__Transition__Group__10();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__Group__9"


    // $ANTLR start "rule__Transition__Group__9__Impl"
    // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:2891:1: rule__Transition__Group__9__Impl : ( ( rule__Transition__SourceAssignment_9 ) ) ;
    public final void rule__Transition__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:2895:1: ( ( ( rule__Transition__SourceAssignment_9 ) ) )
            // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:2896:1: ( ( rule__Transition__SourceAssignment_9 ) )
            {
            // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:2896:1: ( ( rule__Transition__SourceAssignment_9 ) )
            // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:2897:1: ( rule__Transition__SourceAssignment_9 )
            {
             before(grammarAccess.getTransitionAccess().getSourceAssignment_9()); 
            // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:2898:1: ( rule__Transition__SourceAssignment_9 )
            // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:2898:2: rule__Transition__SourceAssignment_9
            {
            pushFollow(FollowSets000.FOLLOW_rule__Transition__SourceAssignment_9_in_rule__Transition__Group__9__Impl5737);
            rule__Transition__SourceAssignment_9();

            state._fsp--;


            }

             after(grammarAccess.getTransitionAccess().getSourceAssignment_9()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__Group__9__Impl"


    // $ANTLR start "rule__Transition__Group__10"
    // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:2908:1: rule__Transition__Group__10 : rule__Transition__Group__10__Impl ;
    public final void rule__Transition__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:2912:1: ( rule__Transition__Group__10__Impl )
            // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:2913:2: rule__Transition__Group__10__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Transition__Group__10__Impl_in_rule__Transition__Group__105767);
            rule__Transition__Group__10__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__Group__10"


    // $ANTLR start "rule__Transition__Group__10__Impl"
    // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:2919:1: rule__Transition__Group__10__Impl : ( '}' ) ;
    public final void rule__Transition__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:2923:1: ( ( '}' ) )
            // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:2924:1: ( '}' )
            {
            // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:2924:1: ( '}' )
            // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:2925:1: '}'
            {
             before(grammarAccess.getTransitionAccess().getRightCurlyBracketKeyword_10()); 
            match(input,13,FollowSets000.FOLLOW_13_in_rule__Transition__Group__10__Impl5795); 
             after(grammarAccess.getTransitionAccess().getRightCurlyBracketKeyword_10()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__Group__10__Impl"


    // $ANTLR start "rule__Transition__Group_4__0"
    // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:2960:1: rule__Transition__Group_4__0 : rule__Transition__Group_4__0__Impl rule__Transition__Group_4__1 ;
    public final void rule__Transition__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:2964:1: ( rule__Transition__Group_4__0__Impl rule__Transition__Group_4__1 )
            // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:2965:2: rule__Transition__Group_4__0__Impl rule__Transition__Group_4__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Transition__Group_4__0__Impl_in_rule__Transition__Group_4__05848);
            rule__Transition__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Transition__Group_4__1_in_rule__Transition__Group_4__05851);
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
    // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:2972:1: rule__Transition__Group_4__0__Impl : ( 'comment' ) ;
    public final void rule__Transition__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:2976:1: ( ( 'comment' ) )
            // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:2977:1: ( 'comment' )
            {
            // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:2977:1: ( 'comment' )
            // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:2978:1: 'comment'
            {
             before(grammarAccess.getTransitionAccess().getCommentKeyword_4_0()); 
            match(input,14,FollowSets000.FOLLOW_14_in_rule__Transition__Group_4__0__Impl5879); 
             after(grammarAccess.getTransitionAccess().getCommentKeyword_4_0()); 

            }


            }

        }
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
    // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:2991:1: rule__Transition__Group_4__1 : rule__Transition__Group_4__1__Impl ;
    public final void rule__Transition__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:2995:1: ( rule__Transition__Group_4__1__Impl )
            // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:2996:2: rule__Transition__Group_4__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Transition__Group_4__1__Impl_in_rule__Transition__Group_4__15910);
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
    // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:3002:1: rule__Transition__Group_4__1__Impl : ( ( rule__Transition__CommentAssignment_4_1 ) ) ;
    public final void rule__Transition__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:3006:1: ( ( ( rule__Transition__CommentAssignment_4_1 ) ) )
            // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:3007:1: ( ( rule__Transition__CommentAssignment_4_1 ) )
            {
            // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:3007:1: ( ( rule__Transition__CommentAssignment_4_1 ) )
            // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:3008:1: ( rule__Transition__CommentAssignment_4_1 )
            {
             before(grammarAccess.getTransitionAccess().getCommentAssignment_4_1()); 
            // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:3009:1: ( rule__Transition__CommentAssignment_4_1 )
            // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:3009:2: rule__Transition__CommentAssignment_4_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Transition__CommentAssignment_4_1_in_rule__Transition__Group_4__1__Impl5937);
            rule__Transition__CommentAssignment_4_1();

            state._fsp--;


            }

             after(grammarAccess.getTransitionAccess().getCommentAssignment_4_1()); 

            }


            }

        }
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
    // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:3023:1: rule__Transition__Group_5__0 : rule__Transition__Group_5__0__Impl rule__Transition__Group_5__1 ;
    public final void rule__Transition__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:3027:1: ( rule__Transition__Group_5__0__Impl rule__Transition__Group_5__1 )
            // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:3028:2: rule__Transition__Group_5__0__Impl rule__Transition__Group_5__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Transition__Group_5__0__Impl_in_rule__Transition__Group_5__05971);
            rule__Transition__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Transition__Group_5__1_in_rule__Transition__Group_5__05974);
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
    // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:3035:1: rule__Transition__Group_5__0__Impl : ( 'elaborates' ) ;
    public final void rule__Transition__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:3039:1: ( ( 'elaborates' ) )
            // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:3040:1: ( 'elaborates' )
            {
            // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:3040:1: ( 'elaborates' )
            // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:3041:1: 'elaborates'
            {
             before(grammarAccess.getTransitionAccess().getElaboratesKeyword_5_0()); 
            match(input,29,FollowSets000.FOLLOW_29_in_rule__Transition__Group_5__0__Impl6002); 
             after(grammarAccess.getTransitionAccess().getElaboratesKeyword_5_0()); 

            }


            }

        }
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
    // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:3054:1: rule__Transition__Group_5__1 : rule__Transition__Group_5__1__Impl rule__Transition__Group_5__2 ;
    public final void rule__Transition__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:3058:1: ( rule__Transition__Group_5__1__Impl rule__Transition__Group_5__2 )
            // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:3059:2: rule__Transition__Group_5__1__Impl rule__Transition__Group_5__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Transition__Group_5__1__Impl_in_rule__Transition__Group_5__16033);
            rule__Transition__Group_5__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Transition__Group_5__2_in_rule__Transition__Group_5__16036);
            rule__Transition__Group_5__2();

            state._fsp--;


            }

        }
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
    // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:3066:1: rule__Transition__Group_5__1__Impl : ( '(' ) ;
    public final void rule__Transition__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:3070:1: ( ( '(' ) )
            // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:3071:1: ( '(' )
            {
            // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:3071:1: ( '(' )
            // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:3072:1: '('
            {
             before(grammarAccess.getTransitionAccess().getLeftParenthesisKeyword_5_1()); 
            match(input,21,FollowSets000.FOLLOW_21_in_rule__Transition__Group_5__1__Impl6064); 
             after(grammarAccess.getTransitionAccess().getLeftParenthesisKeyword_5_1()); 

            }


            }

        }
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


    // $ANTLR start "rule__Transition__Group_5__2"
    // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:3085:1: rule__Transition__Group_5__2 : rule__Transition__Group_5__2__Impl rule__Transition__Group_5__3 ;
    public final void rule__Transition__Group_5__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:3089:1: ( rule__Transition__Group_5__2__Impl rule__Transition__Group_5__3 )
            // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:3090:2: rule__Transition__Group_5__2__Impl rule__Transition__Group_5__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__Transition__Group_5__2__Impl_in_rule__Transition__Group_5__26095);
            rule__Transition__Group_5__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Transition__Group_5__3_in_rule__Transition__Group_5__26098);
            rule__Transition__Group_5__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__Group_5__2"


    // $ANTLR start "rule__Transition__Group_5__2__Impl"
    // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:3097:1: rule__Transition__Group_5__2__Impl : ( ( rule__Transition__ElaboratesAssignment_5_2 ) ) ;
    public final void rule__Transition__Group_5__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:3101:1: ( ( ( rule__Transition__ElaboratesAssignment_5_2 ) ) )
            // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:3102:1: ( ( rule__Transition__ElaboratesAssignment_5_2 ) )
            {
            // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:3102:1: ( ( rule__Transition__ElaboratesAssignment_5_2 ) )
            // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:3103:1: ( rule__Transition__ElaboratesAssignment_5_2 )
            {
             before(grammarAccess.getTransitionAccess().getElaboratesAssignment_5_2()); 
            // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:3104:1: ( rule__Transition__ElaboratesAssignment_5_2 )
            // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:3104:2: rule__Transition__ElaboratesAssignment_5_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Transition__ElaboratesAssignment_5_2_in_rule__Transition__Group_5__2__Impl6125);
            rule__Transition__ElaboratesAssignment_5_2();

            state._fsp--;


            }

             after(grammarAccess.getTransitionAccess().getElaboratesAssignment_5_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__Group_5__2__Impl"


    // $ANTLR start "rule__Transition__Group_5__3"
    // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:3114:1: rule__Transition__Group_5__3 : rule__Transition__Group_5__3__Impl rule__Transition__Group_5__4 ;
    public final void rule__Transition__Group_5__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:3118:1: ( rule__Transition__Group_5__3__Impl rule__Transition__Group_5__4 )
            // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:3119:2: rule__Transition__Group_5__3__Impl rule__Transition__Group_5__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__Transition__Group_5__3__Impl_in_rule__Transition__Group_5__36155);
            rule__Transition__Group_5__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Transition__Group_5__4_in_rule__Transition__Group_5__36158);
            rule__Transition__Group_5__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__Group_5__3"


    // $ANTLR start "rule__Transition__Group_5__3__Impl"
    // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:3126:1: rule__Transition__Group_5__3__Impl : ( ( rule__Transition__Group_5_3__0 )* ) ;
    public final void rule__Transition__Group_5__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:3130:1: ( ( ( rule__Transition__Group_5_3__0 )* ) )
            // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:3131:1: ( ( rule__Transition__Group_5_3__0 )* )
            {
            // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:3131:1: ( ( rule__Transition__Group_5_3__0 )* )
            // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:3132:1: ( rule__Transition__Group_5_3__0 )*
            {
             before(grammarAccess.getTransitionAccess().getGroup_5_3()); 
            // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:3133:1: ( rule__Transition__Group_5_3__0 )*
            loop23:
            do {
                int alt23=2;
                int LA23_0 = input.LA(1);

                if ( (LA23_0==17) ) {
                    alt23=1;
                }


                switch (alt23) {
            	case 1 :
            	    // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:3133:2: rule__Transition__Group_5_3__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__Transition__Group_5_3__0_in_rule__Transition__Group_5__3__Impl6185);
            	    rule__Transition__Group_5_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop23;
                }
            } while (true);

             after(grammarAccess.getTransitionAccess().getGroup_5_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__Group_5__3__Impl"


    // $ANTLR start "rule__Transition__Group_5__4"
    // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:3143:1: rule__Transition__Group_5__4 : rule__Transition__Group_5__4__Impl ;
    public final void rule__Transition__Group_5__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:3147:1: ( rule__Transition__Group_5__4__Impl )
            // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:3148:2: rule__Transition__Group_5__4__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Transition__Group_5__4__Impl_in_rule__Transition__Group_5__46216);
            rule__Transition__Group_5__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__Group_5__4"


    // $ANTLR start "rule__Transition__Group_5__4__Impl"
    // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:3154:1: rule__Transition__Group_5__4__Impl : ( ')' ) ;
    public final void rule__Transition__Group_5__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:3158:1: ( ( ')' ) )
            // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:3159:1: ( ')' )
            {
            // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:3159:1: ( ')' )
            // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:3160:1: ')'
            {
             before(grammarAccess.getTransitionAccess().getRightParenthesisKeyword_5_4()); 
            match(input,22,FollowSets000.FOLLOW_22_in_rule__Transition__Group_5__4__Impl6244); 
             after(grammarAccess.getTransitionAccess().getRightParenthesisKeyword_5_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__Group_5__4__Impl"


    // $ANTLR start "rule__Transition__Group_5_3__0"
    // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:3183:1: rule__Transition__Group_5_3__0 : rule__Transition__Group_5_3__0__Impl rule__Transition__Group_5_3__1 ;
    public final void rule__Transition__Group_5_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:3187:1: ( rule__Transition__Group_5_3__0__Impl rule__Transition__Group_5_3__1 )
            // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:3188:2: rule__Transition__Group_5_3__0__Impl rule__Transition__Group_5_3__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Transition__Group_5_3__0__Impl_in_rule__Transition__Group_5_3__06285);
            rule__Transition__Group_5_3__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Transition__Group_5_3__1_in_rule__Transition__Group_5_3__06288);
            rule__Transition__Group_5_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__Group_5_3__0"


    // $ANTLR start "rule__Transition__Group_5_3__0__Impl"
    // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:3195:1: rule__Transition__Group_5_3__0__Impl : ( ',' ) ;
    public final void rule__Transition__Group_5_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:3199:1: ( ( ',' ) )
            // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:3200:1: ( ',' )
            {
            // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:3200:1: ( ',' )
            // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:3201:1: ','
            {
             before(grammarAccess.getTransitionAccess().getCommaKeyword_5_3_0()); 
            match(input,17,FollowSets000.FOLLOW_17_in_rule__Transition__Group_5_3__0__Impl6316); 
             after(grammarAccess.getTransitionAccess().getCommaKeyword_5_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__Group_5_3__0__Impl"


    // $ANTLR start "rule__Transition__Group_5_3__1"
    // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:3214:1: rule__Transition__Group_5_3__1 : rule__Transition__Group_5_3__1__Impl ;
    public final void rule__Transition__Group_5_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:3218:1: ( rule__Transition__Group_5_3__1__Impl )
            // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:3219:2: rule__Transition__Group_5_3__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Transition__Group_5_3__1__Impl_in_rule__Transition__Group_5_3__16347);
            rule__Transition__Group_5_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__Group_5_3__1"


    // $ANTLR start "rule__Transition__Group_5_3__1__Impl"
    // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:3225:1: rule__Transition__Group_5_3__1__Impl : ( ( rule__Transition__ElaboratesAssignment_5_3_1 ) ) ;
    public final void rule__Transition__Group_5_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:3229:1: ( ( ( rule__Transition__ElaboratesAssignment_5_3_1 ) ) )
            // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:3230:1: ( ( rule__Transition__ElaboratesAssignment_5_3_1 ) )
            {
            // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:3230:1: ( ( rule__Transition__ElaboratesAssignment_5_3_1 ) )
            // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:3231:1: ( rule__Transition__ElaboratesAssignment_5_3_1 )
            {
             before(grammarAccess.getTransitionAccess().getElaboratesAssignment_5_3_1()); 
            // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:3232:1: ( rule__Transition__ElaboratesAssignment_5_3_1 )
            // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:3232:2: rule__Transition__ElaboratesAssignment_5_3_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Transition__ElaboratesAssignment_5_3_1_in_rule__Transition__Group_5_3__1__Impl6374);
            rule__Transition__ElaboratesAssignment_5_3_1();

            state._fsp--;


            }

             after(grammarAccess.getTransitionAccess().getElaboratesAssignment_5_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__Group_5_3__1__Impl"


    // $ANTLR start "rule__Initial__Group__0"
    // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:3250:1: rule__Initial__Group__0 : rule__Initial__Group__0__Impl rule__Initial__Group__1 ;
    public final void rule__Initial__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:3254:1: ( rule__Initial__Group__0__Impl rule__Initial__Group__1 )
            // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:3255:2: rule__Initial__Group__0__Impl rule__Initial__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Initial__Group__0__Impl_in_rule__Initial__Group__06412);
            rule__Initial__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Initial__Group__1_in_rule__Initial__Group__06415);
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
    // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:3262:1: rule__Initial__Group__0__Impl : ( () ) ;
    public final void rule__Initial__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:3266:1: ( ( () ) )
            // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:3267:1: ( () )
            {
            // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:3267:1: ( () )
            // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:3268:1: ()
            {
             before(grammarAccess.getInitialAccess().getInitialAction_0()); 
            // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:3269:1: ()
            // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:3271:1: 
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
    // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:3281:1: rule__Initial__Group__1 : rule__Initial__Group__1__Impl rule__Initial__Group__2 ;
    public final void rule__Initial__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:3285:1: ( rule__Initial__Group__1__Impl rule__Initial__Group__2 )
            // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:3286:2: rule__Initial__Group__1__Impl rule__Initial__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Initial__Group__1__Impl_in_rule__Initial__Group__16473);
            rule__Initial__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Initial__Group__2_in_rule__Initial__Group__16476);
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
    // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:3293:1: rule__Initial__Group__1__Impl : ( ( rule__Initial__LocalGeneratedAssignment_1 )? ) ;
    public final void rule__Initial__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:3297:1: ( ( ( rule__Initial__LocalGeneratedAssignment_1 )? ) )
            // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:3298:1: ( ( rule__Initial__LocalGeneratedAssignment_1 )? )
            {
            // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:3298:1: ( ( rule__Initial__LocalGeneratedAssignment_1 )? )
            // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:3299:1: ( rule__Initial__LocalGeneratedAssignment_1 )?
            {
             before(grammarAccess.getInitialAccess().getLocalGeneratedAssignment_1()); 
            // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:3300:1: ( rule__Initial__LocalGeneratedAssignment_1 )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==38) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:3300:2: rule__Initial__LocalGeneratedAssignment_1
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__Initial__LocalGeneratedAssignment_1_in_rule__Initial__Group__1__Impl6503);
                    rule__Initial__LocalGeneratedAssignment_1();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getInitialAccess().getLocalGeneratedAssignment_1()); 

            }


            }

        }
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
    // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:3310:1: rule__Initial__Group__2 : rule__Initial__Group__2__Impl rule__Initial__Group__3 ;
    public final void rule__Initial__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:3314:1: ( rule__Initial__Group__2__Impl rule__Initial__Group__3 )
            // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:3315:2: rule__Initial__Group__2__Impl rule__Initial__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__Initial__Group__2__Impl_in_rule__Initial__Group__26534);
            rule__Initial__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Initial__Group__3_in_rule__Initial__Group__26537);
            rule__Initial__Group__3();

            state._fsp--;


            }

        }
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
    // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:3322:1: rule__Initial__Group__2__Impl : ( 'Initial' ) ;
    public final void rule__Initial__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:3326:1: ( ( 'Initial' ) )
            // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:3327:1: ( 'Initial' )
            {
            // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:3327:1: ( 'Initial' )
            // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:3328:1: 'Initial'
            {
             before(grammarAccess.getInitialAccess().getInitialKeyword_2()); 
            match(input,30,FollowSets000.FOLLOW_30_in_rule__Initial__Group__2__Impl6565); 
             after(grammarAccess.getInitialAccess().getInitialKeyword_2()); 

            }


            }

        }
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


    // $ANTLR start "rule__Initial__Group__3"
    // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:3341:1: rule__Initial__Group__3 : rule__Initial__Group__3__Impl rule__Initial__Group__4 ;
    public final void rule__Initial__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:3345:1: ( rule__Initial__Group__3__Impl rule__Initial__Group__4 )
            // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:3346:2: rule__Initial__Group__3__Impl rule__Initial__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__Initial__Group__3__Impl_in_rule__Initial__Group__36596);
            rule__Initial__Group__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Initial__Group__4_in_rule__Initial__Group__36599);
            rule__Initial__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Initial__Group__3"


    // $ANTLR start "rule__Initial__Group__3__Impl"
    // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:3353:1: rule__Initial__Group__3__Impl : ( '{' ) ;
    public final void rule__Initial__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:3357:1: ( ( '{' ) )
            // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:3358:1: ( '{' )
            {
            // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:3358:1: ( '{' )
            // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:3359:1: '{'
            {
             before(grammarAccess.getInitialAccess().getLeftCurlyBracketKeyword_3()); 
            match(input,12,FollowSets000.FOLLOW_12_in_rule__Initial__Group__3__Impl6627); 
             after(grammarAccess.getInitialAccess().getLeftCurlyBracketKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Initial__Group__3__Impl"


    // $ANTLR start "rule__Initial__Group__4"
    // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:3372:1: rule__Initial__Group__4 : rule__Initial__Group__4__Impl rule__Initial__Group__5 ;
    public final void rule__Initial__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:3376:1: ( rule__Initial__Group__4__Impl rule__Initial__Group__5 )
            // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:3377:2: rule__Initial__Group__4__Impl rule__Initial__Group__5
            {
            pushFollow(FollowSets000.FOLLOW_rule__Initial__Group__4__Impl_in_rule__Initial__Group__46658);
            rule__Initial__Group__4__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Initial__Group__5_in_rule__Initial__Group__46661);
            rule__Initial__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Initial__Group__4"


    // $ANTLR start "rule__Initial__Group__4__Impl"
    // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:3384:1: rule__Initial__Group__4__Impl : ( ( rule__Initial__Group_4__0 )? ) ;
    public final void rule__Initial__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:3388:1: ( ( ( rule__Initial__Group_4__0 )? ) )
            // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:3389:1: ( ( rule__Initial__Group_4__0 )? )
            {
            // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:3389:1: ( ( rule__Initial__Group_4__0 )? )
            // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:3390:1: ( rule__Initial__Group_4__0 )?
            {
             before(grammarAccess.getInitialAccess().getGroup_4()); 
            // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:3391:1: ( rule__Initial__Group_4__0 )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==31) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:3391:2: rule__Initial__Group_4__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__Initial__Group_4__0_in_rule__Initial__Group__4__Impl6688);
                    rule__Initial__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getInitialAccess().getGroup_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Initial__Group__4__Impl"


    // $ANTLR start "rule__Initial__Group__5"
    // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:3401:1: rule__Initial__Group__5 : rule__Initial__Group__5__Impl ;
    public final void rule__Initial__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:3405:1: ( rule__Initial__Group__5__Impl )
            // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:3406:2: rule__Initial__Group__5__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Initial__Group__5__Impl_in_rule__Initial__Group__56719);
            rule__Initial__Group__5__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Initial__Group__5"


    // $ANTLR start "rule__Initial__Group__5__Impl"
    // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:3412:1: rule__Initial__Group__5__Impl : ( '}' ) ;
    public final void rule__Initial__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:3416:1: ( ( '}' ) )
            // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:3417:1: ( '}' )
            {
            // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:3417:1: ( '}' )
            // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:3418:1: '}'
            {
             before(grammarAccess.getInitialAccess().getRightCurlyBracketKeyword_5()); 
            match(input,13,FollowSets000.FOLLOW_13_in_rule__Initial__Group__5__Impl6747); 
             after(grammarAccess.getInitialAccess().getRightCurlyBracketKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Initial__Group__5__Impl"


    // $ANTLR start "rule__Initial__Group_4__0"
    // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:3443:1: rule__Initial__Group_4__0 : rule__Initial__Group_4__0__Impl rule__Initial__Group_4__1 ;
    public final void rule__Initial__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:3447:1: ( rule__Initial__Group_4__0__Impl rule__Initial__Group_4__1 )
            // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:3448:2: rule__Initial__Group_4__0__Impl rule__Initial__Group_4__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Initial__Group_4__0__Impl_in_rule__Initial__Group_4__06790);
            rule__Initial__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Initial__Group_4__1_in_rule__Initial__Group_4__06793);
            rule__Initial__Group_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Initial__Group_4__0"


    // $ANTLR start "rule__Initial__Group_4__0__Impl"
    // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:3455:1: rule__Initial__Group_4__0__Impl : ( 'internalId' ) ;
    public final void rule__Initial__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:3459:1: ( ( 'internalId' ) )
            // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:3460:1: ( 'internalId' )
            {
            // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:3460:1: ( 'internalId' )
            // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:3461:1: 'internalId'
            {
             before(grammarAccess.getInitialAccess().getInternalIdKeyword_4_0()); 
            match(input,31,FollowSets000.FOLLOW_31_in_rule__Initial__Group_4__0__Impl6821); 
             after(grammarAccess.getInitialAccess().getInternalIdKeyword_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Initial__Group_4__0__Impl"


    // $ANTLR start "rule__Initial__Group_4__1"
    // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:3474:1: rule__Initial__Group_4__1 : rule__Initial__Group_4__1__Impl ;
    public final void rule__Initial__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:3478:1: ( rule__Initial__Group_4__1__Impl )
            // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:3479:2: rule__Initial__Group_4__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Initial__Group_4__1__Impl_in_rule__Initial__Group_4__16852);
            rule__Initial__Group_4__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Initial__Group_4__1"


    // $ANTLR start "rule__Initial__Group_4__1__Impl"
    // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:3485:1: rule__Initial__Group_4__1__Impl : ( ( rule__Initial__InternalIdAssignment_4_1 ) ) ;
    public final void rule__Initial__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:3489:1: ( ( ( rule__Initial__InternalIdAssignment_4_1 ) ) )
            // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:3490:1: ( ( rule__Initial__InternalIdAssignment_4_1 ) )
            {
            // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:3490:1: ( ( rule__Initial__InternalIdAssignment_4_1 ) )
            // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:3491:1: ( rule__Initial__InternalIdAssignment_4_1 )
            {
             before(grammarAccess.getInitialAccess().getInternalIdAssignment_4_1()); 
            // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:3492:1: ( rule__Initial__InternalIdAssignment_4_1 )
            // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:3492:2: rule__Initial__InternalIdAssignment_4_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Initial__InternalIdAssignment_4_1_in_rule__Initial__Group_4__1__Impl6879);
            rule__Initial__InternalIdAssignment_4_1();

            state._fsp--;


            }

             after(grammarAccess.getInitialAccess().getInternalIdAssignment_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Initial__Group_4__1__Impl"


    // $ANTLR start "rule__Final__Group__0"
    // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:3506:1: rule__Final__Group__0 : rule__Final__Group__0__Impl rule__Final__Group__1 ;
    public final void rule__Final__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:3510:1: ( rule__Final__Group__0__Impl rule__Final__Group__1 )
            // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:3511:2: rule__Final__Group__0__Impl rule__Final__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Final__Group__0__Impl_in_rule__Final__Group__06913);
            rule__Final__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Final__Group__1_in_rule__Final__Group__06916);
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
    // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:3518:1: rule__Final__Group__0__Impl : ( () ) ;
    public final void rule__Final__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:3522:1: ( ( () ) )
            // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:3523:1: ( () )
            {
            // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:3523:1: ( () )
            // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:3524:1: ()
            {
             before(grammarAccess.getFinalAccess().getFinalAction_0()); 
            // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:3525:1: ()
            // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:3527:1: 
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
    // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:3537:1: rule__Final__Group__1 : rule__Final__Group__1__Impl rule__Final__Group__2 ;
    public final void rule__Final__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:3541:1: ( rule__Final__Group__1__Impl rule__Final__Group__2 )
            // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:3542:2: rule__Final__Group__1__Impl rule__Final__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Final__Group__1__Impl_in_rule__Final__Group__16974);
            rule__Final__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Final__Group__2_in_rule__Final__Group__16977);
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
    // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:3549:1: rule__Final__Group__1__Impl : ( ( rule__Final__LocalGeneratedAssignment_1 )? ) ;
    public final void rule__Final__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:3553:1: ( ( ( rule__Final__LocalGeneratedAssignment_1 )? ) )
            // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:3554:1: ( ( rule__Final__LocalGeneratedAssignment_1 )? )
            {
            // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:3554:1: ( ( rule__Final__LocalGeneratedAssignment_1 )? )
            // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:3555:1: ( rule__Final__LocalGeneratedAssignment_1 )?
            {
             before(grammarAccess.getFinalAccess().getLocalGeneratedAssignment_1()); 
            // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:3556:1: ( rule__Final__LocalGeneratedAssignment_1 )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==38) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:3556:2: rule__Final__LocalGeneratedAssignment_1
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__Final__LocalGeneratedAssignment_1_in_rule__Final__Group__1__Impl7004);
                    rule__Final__LocalGeneratedAssignment_1();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getFinalAccess().getLocalGeneratedAssignment_1()); 

            }


            }

        }
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
    // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:3566:1: rule__Final__Group__2 : rule__Final__Group__2__Impl rule__Final__Group__3 ;
    public final void rule__Final__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:3570:1: ( rule__Final__Group__2__Impl rule__Final__Group__3 )
            // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:3571:2: rule__Final__Group__2__Impl rule__Final__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__Final__Group__2__Impl_in_rule__Final__Group__27035);
            rule__Final__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Final__Group__3_in_rule__Final__Group__27038);
            rule__Final__Group__3();

            state._fsp--;


            }

        }
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
    // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:3578:1: rule__Final__Group__2__Impl : ( 'Final' ) ;
    public final void rule__Final__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:3582:1: ( ( 'Final' ) )
            // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:3583:1: ( 'Final' )
            {
            // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:3583:1: ( 'Final' )
            // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:3584:1: 'Final'
            {
             before(grammarAccess.getFinalAccess().getFinalKeyword_2()); 
            match(input,32,FollowSets000.FOLLOW_32_in_rule__Final__Group__2__Impl7066); 
             after(grammarAccess.getFinalAccess().getFinalKeyword_2()); 

            }


            }

        }
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


    // $ANTLR start "rule__Final__Group__3"
    // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:3597:1: rule__Final__Group__3 : rule__Final__Group__3__Impl rule__Final__Group__4 ;
    public final void rule__Final__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:3601:1: ( rule__Final__Group__3__Impl rule__Final__Group__4 )
            // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:3602:2: rule__Final__Group__3__Impl rule__Final__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__Final__Group__3__Impl_in_rule__Final__Group__37097);
            rule__Final__Group__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Final__Group__4_in_rule__Final__Group__37100);
            rule__Final__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Final__Group__3"


    // $ANTLR start "rule__Final__Group__3__Impl"
    // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:3609:1: rule__Final__Group__3__Impl : ( '{' ) ;
    public final void rule__Final__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:3613:1: ( ( '{' ) )
            // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:3614:1: ( '{' )
            {
            // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:3614:1: ( '{' )
            // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:3615:1: '{'
            {
             before(grammarAccess.getFinalAccess().getLeftCurlyBracketKeyword_3()); 
            match(input,12,FollowSets000.FOLLOW_12_in_rule__Final__Group__3__Impl7128); 
             after(grammarAccess.getFinalAccess().getLeftCurlyBracketKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Final__Group__3__Impl"


    // $ANTLR start "rule__Final__Group__4"
    // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:3628:1: rule__Final__Group__4 : rule__Final__Group__4__Impl rule__Final__Group__5 ;
    public final void rule__Final__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:3632:1: ( rule__Final__Group__4__Impl rule__Final__Group__5 )
            // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:3633:2: rule__Final__Group__4__Impl rule__Final__Group__5
            {
            pushFollow(FollowSets000.FOLLOW_rule__Final__Group__4__Impl_in_rule__Final__Group__47159);
            rule__Final__Group__4__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Final__Group__5_in_rule__Final__Group__47162);
            rule__Final__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Final__Group__4"


    // $ANTLR start "rule__Final__Group__4__Impl"
    // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:3640:1: rule__Final__Group__4__Impl : ( ( rule__Final__Group_4__0 )? ) ;
    public final void rule__Final__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:3644:1: ( ( ( rule__Final__Group_4__0 )? ) )
            // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:3645:1: ( ( rule__Final__Group_4__0 )? )
            {
            // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:3645:1: ( ( rule__Final__Group_4__0 )? )
            // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:3646:1: ( rule__Final__Group_4__0 )?
            {
             before(grammarAccess.getFinalAccess().getGroup_4()); 
            // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:3647:1: ( rule__Final__Group_4__0 )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==31) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:3647:2: rule__Final__Group_4__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__Final__Group_4__0_in_rule__Final__Group__4__Impl7189);
                    rule__Final__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getFinalAccess().getGroup_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Final__Group__4__Impl"


    // $ANTLR start "rule__Final__Group__5"
    // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:3657:1: rule__Final__Group__5 : rule__Final__Group__5__Impl ;
    public final void rule__Final__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:3661:1: ( rule__Final__Group__5__Impl )
            // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:3662:2: rule__Final__Group__5__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Final__Group__5__Impl_in_rule__Final__Group__57220);
            rule__Final__Group__5__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Final__Group__5"


    // $ANTLR start "rule__Final__Group__5__Impl"
    // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:3668:1: rule__Final__Group__5__Impl : ( '}' ) ;
    public final void rule__Final__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:3672:1: ( ( '}' ) )
            // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:3673:1: ( '}' )
            {
            // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:3673:1: ( '}' )
            // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:3674:1: '}'
            {
             before(grammarAccess.getFinalAccess().getRightCurlyBracketKeyword_5()); 
            match(input,13,FollowSets000.FOLLOW_13_in_rule__Final__Group__5__Impl7248); 
             after(grammarAccess.getFinalAccess().getRightCurlyBracketKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Final__Group__5__Impl"


    // $ANTLR start "rule__Final__Group_4__0"
    // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:3699:1: rule__Final__Group_4__0 : rule__Final__Group_4__0__Impl rule__Final__Group_4__1 ;
    public final void rule__Final__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:3703:1: ( rule__Final__Group_4__0__Impl rule__Final__Group_4__1 )
            // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:3704:2: rule__Final__Group_4__0__Impl rule__Final__Group_4__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Final__Group_4__0__Impl_in_rule__Final__Group_4__07291);
            rule__Final__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Final__Group_4__1_in_rule__Final__Group_4__07294);
            rule__Final__Group_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Final__Group_4__0"


    // $ANTLR start "rule__Final__Group_4__0__Impl"
    // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:3711:1: rule__Final__Group_4__0__Impl : ( 'internalId' ) ;
    public final void rule__Final__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:3715:1: ( ( 'internalId' ) )
            // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:3716:1: ( 'internalId' )
            {
            // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:3716:1: ( 'internalId' )
            // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:3717:1: 'internalId'
            {
             before(grammarAccess.getFinalAccess().getInternalIdKeyword_4_0()); 
            match(input,31,FollowSets000.FOLLOW_31_in_rule__Final__Group_4__0__Impl7322); 
             after(grammarAccess.getFinalAccess().getInternalIdKeyword_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Final__Group_4__0__Impl"


    // $ANTLR start "rule__Final__Group_4__1"
    // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:3730:1: rule__Final__Group_4__1 : rule__Final__Group_4__1__Impl ;
    public final void rule__Final__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:3734:1: ( rule__Final__Group_4__1__Impl )
            // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:3735:2: rule__Final__Group_4__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Final__Group_4__1__Impl_in_rule__Final__Group_4__17353);
            rule__Final__Group_4__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Final__Group_4__1"


    // $ANTLR start "rule__Final__Group_4__1__Impl"
    // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:3741:1: rule__Final__Group_4__1__Impl : ( ( rule__Final__InternalIdAssignment_4_1 ) ) ;
    public final void rule__Final__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:3745:1: ( ( ( rule__Final__InternalIdAssignment_4_1 ) ) )
            // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:3746:1: ( ( rule__Final__InternalIdAssignment_4_1 ) )
            {
            // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:3746:1: ( ( rule__Final__InternalIdAssignment_4_1 ) )
            // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:3747:1: ( rule__Final__InternalIdAssignment_4_1 )
            {
             before(grammarAccess.getFinalAccess().getInternalIdAssignment_4_1()); 
            // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:3748:1: ( rule__Final__InternalIdAssignment_4_1 )
            // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:3748:2: rule__Final__InternalIdAssignment_4_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Final__InternalIdAssignment_4_1_in_rule__Final__Group_4__1__Impl7380);
            rule__Final__InternalIdAssignment_4_1();

            state._fsp--;


            }

             after(grammarAccess.getFinalAccess().getInternalIdAssignment_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Final__Group_4__1__Impl"


    // $ANTLR start "rule__Any__Group__0"
    // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:3762:1: rule__Any__Group__0 : rule__Any__Group__0__Impl rule__Any__Group__1 ;
    public final void rule__Any__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:3766:1: ( rule__Any__Group__0__Impl rule__Any__Group__1 )
            // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:3767:2: rule__Any__Group__0__Impl rule__Any__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Any__Group__0__Impl_in_rule__Any__Group__07414);
            rule__Any__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Any__Group__1_in_rule__Any__Group__07417);
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
    // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:3774:1: rule__Any__Group__0__Impl : ( () ) ;
    public final void rule__Any__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:3778:1: ( ( () ) )
            // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:3779:1: ( () )
            {
            // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:3779:1: ( () )
            // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:3780:1: ()
            {
             before(grammarAccess.getAnyAccess().getAnyAction_0()); 
            // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:3781:1: ()
            // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:3783:1: 
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
    // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:3793:1: rule__Any__Group__1 : rule__Any__Group__1__Impl rule__Any__Group__2 ;
    public final void rule__Any__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:3797:1: ( rule__Any__Group__1__Impl rule__Any__Group__2 )
            // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:3798:2: rule__Any__Group__1__Impl rule__Any__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Any__Group__1__Impl_in_rule__Any__Group__17475);
            rule__Any__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Any__Group__2_in_rule__Any__Group__17478);
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
    // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:3805:1: rule__Any__Group__1__Impl : ( ( rule__Any__LocalGeneratedAssignment_1 )? ) ;
    public final void rule__Any__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:3809:1: ( ( ( rule__Any__LocalGeneratedAssignment_1 )? ) )
            // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:3810:1: ( ( rule__Any__LocalGeneratedAssignment_1 )? )
            {
            // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:3810:1: ( ( rule__Any__LocalGeneratedAssignment_1 )? )
            // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:3811:1: ( rule__Any__LocalGeneratedAssignment_1 )?
            {
             before(grammarAccess.getAnyAccess().getLocalGeneratedAssignment_1()); 
            // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:3812:1: ( rule__Any__LocalGeneratedAssignment_1 )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==38) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:3812:2: rule__Any__LocalGeneratedAssignment_1
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__Any__LocalGeneratedAssignment_1_in_rule__Any__Group__1__Impl7505);
                    rule__Any__LocalGeneratedAssignment_1();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getAnyAccess().getLocalGeneratedAssignment_1()); 

            }


            }

        }
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
    // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:3822:1: rule__Any__Group__2 : rule__Any__Group__2__Impl rule__Any__Group__3 ;
    public final void rule__Any__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:3826:1: ( rule__Any__Group__2__Impl rule__Any__Group__3 )
            // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:3827:2: rule__Any__Group__2__Impl rule__Any__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__Any__Group__2__Impl_in_rule__Any__Group__27536);
            rule__Any__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Any__Group__3_in_rule__Any__Group__27539);
            rule__Any__Group__3();

            state._fsp--;


            }

        }
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
    // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:3834:1: rule__Any__Group__2__Impl : ( 'Any' ) ;
    public final void rule__Any__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:3838:1: ( ( 'Any' ) )
            // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:3839:1: ( 'Any' )
            {
            // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:3839:1: ( 'Any' )
            // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:3840:1: 'Any'
            {
             before(grammarAccess.getAnyAccess().getAnyKeyword_2()); 
            match(input,33,FollowSets000.FOLLOW_33_in_rule__Any__Group__2__Impl7567); 
             after(grammarAccess.getAnyAccess().getAnyKeyword_2()); 

            }


            }

        }
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


    // $ANTLR start "rule__Any__Group__3"
    // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:3853:1: rule__Any__Group__3 : rule__Any__Group__3__Impl rule__Any__Group__4 ;
    public final void rule__Any__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:3857:1: ( rule__Any__Group__3__Impl rule__Any__Group__4 )
            // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:3858:2: rule__Any__Group__3__Impl rule__Any__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__Any__Group__3__Impl_in_rule__Any__Group__37598);
            rule__Any__Group__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Any__Group__4_in_rule__Any__Group__37601);
            rule__Any__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Any__Group__3"


    // $ANTLR start "rule__Any__Group__3__Impl"
    // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:3865:1: rule__Any__Group__3__Impl : ( '{' ) ;
    public final void rule__Any__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:3869:1: ( ( '{' ) )
            // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:3870:1: ( '{' )
            {
            // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:3870:1: ( '{' )
            // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:3871:1: '{'
            {
             before(grammarAccess.getAnyAccess().getLeftCurlyBracketKeyword_3()); 
            match(input,12,FollowSets000.FOLLOW_12_in_rule__Any__Group__3__Impl7629); 
             after(grammarAccess.getAnyAccess().getLeftCurlyBracketKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Any__Group__3__Impl"


    // $ANTLR start "rule__Any__Group__4"
    // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:3884:1: rule__Any__Group__4 : rule__Any__Group__4__Impl rule__Any__Group__5 ;
    public final void rule__Any__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:3888:1: ( rule__Any__Group__4__Impl rule__Any__Group__5 )
            // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:3889:2: rule__Any__Group__4__Impl rule__Any__Group__5
            {
            pushFollow(FollowSets000.FOLLOW_rule__Any__Group__4__Impl_in_rule__Any__Group__47660);
            rule__Any__Group__4__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Any__Group__5_in_rule__Any__Group__47663);
            rule__Any__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Any__Group__4"


    // $ANTLR start "rule__Any__Group__4__Impl"
    // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:3896:1: rule__Any__Group__4__Impl : ( ( rule__Any__Group_4__0 )? ) ;
    public final void rule__Any__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:3900:1: ( ( ( rule__Any__Group_4__0 )? ) )
            // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:3901:1: ( ( rule__Any__Group_4__0 )? )
            {
            // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:3901:1: ( ( rule__Any__Group_4__0 )? )
            // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:3902:1: ( rule__Any__Group_4__0 )?
            {
             before(grammarAccess.getAnyAccess().getGroup_4()); 
            // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:3903:1: ( rule__Any__Group_4__0 )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==31) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:3903:2: rule__Any__Group_4__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__Any__Group_4__0_in_rule__Any__Group__4__Impl7690);
                    rule__Any__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getAnyAccess().getGroup_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Any__Group__4__Impl"


    // $ANTLR start "rule__Any__Group__5"
    // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:3913:1: rule__Any__Group__5 : rule__Any__Group__5__Impl ;
    public final void rule__Any__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:3917:1: ( rule__Any__Group__5__Impl )
            // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:3918:2: rule__Any__Group__5__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Any__Group__5__Impl_in_rule__Any__Group__57721);
            rule__Any__Group__5__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Any__Group__5"


    // $ANTLR start "rule__Any__Group__5__Impl"
    // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:3924:1: rule__Any__Group__5__Impl : ( '}' ) ;
    public final void rule__Any__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:3928:1: ( ( '}' ) )
            // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:3929:1: ( '}' )
            {
            // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:3929:1: ( '}' )
            // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:3930:1: '}'
            {
             before(grammarAccess.getAnyAccess().getRightCurlyBracketKeyword_5()); 
            match(input,13,FollowSets000.FOLLOW_13_in_rule__Any__Group__5__Impl7749); 
             after(grammarAccess.getAnyAccess().getRightCurlyBracketKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Any__Group__5__Impl"


    // $ANTLR start "rule__Any__Group_4__0"
    // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:3955:1: rule__Any__Group_4__0 : rule__Any__Group_4__0__Impl rule__Any__Group_4__1 ;
    public final void rule__Any__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:3959:1: ( rule__Any__Group_4__0__Impl rule__Any__Group_4__1 )
            // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:3960:2: rule__Any__Group_4__0__Impl rule__Any__Group_4__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Any__Group_4__0__Impl_in_rule__Any__Group_4__07792);
            rule__Any__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Any__Group_4__1_in_rule__Any__Group_4__07795);
            rule__Any__Group_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Any__Group_4__0"


    // $ANTLR start "rule__Any__Group_4__0__Impl"
    // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:3967:1: rule__Any__Group_4__0__Impl : ( 'internalId' ) ;
    public final void rule__Any__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:3971:1: ( ( 'internalId' ) )
            // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:3972:1: ( 'internalId' )
            {
            // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:3972:1: ( 'internalId' )
            // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:3973:1: 'internalId'
            {
             before(grammarAccess.getAnyAccess().getInternalIdKeyword_4_0()); 
            match(input,31,FollowSets000.FOLLOW_31_in_rule__Any__Group_4__0__Impl7823); 
             after(grammarAccess.getAnyAccess().getInternalIdKeyword_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Any__Group_4__0__Impl"


    // $ANTLR start "rule__Any__Group_4__1"
    // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:3986:1: rule__Any__Group_4__1 : rule__Any__Group_4__1__Impl ;
    public final void rule__Any__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:3990:1: ( rule__Any__Group_4__1__Impl )
            // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:3991:2: rule__Any__Group_4__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Any__Group_4__1__Impl_in_rule__Any__Group_4__17854);
            rule__Any__Group_4__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Any__Group_4__1"


    // $ANTLR start "rule__Any__Group_4__1__Impl"
    // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:3997:1: rule__Any__Group_4__1__Impl : ( ( rule__Any__InternalIdAssignment_4_1 ) ) ;
    public final void rule__Any__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:4001:1: ( ( ( rule__Any__InternalIdAssignment_4_1 ) ) )
            // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:4002:1: ( ( rule__Any__InternalIdAssignment_4_1 ) )
            {
            // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:4002:1: ( ( rule__Any__InternalIdAssignment_4_1 ) )
            // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:4003:1: ( rule__Any__InternalIdAssignment_4_1 )
            {
             before(grammarAccess.getAnyAccess().getInternalIdAssignment_4_1()); 
            // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:4004:1: ( rule__Any__InternalIdAssignment_4_1 )
            // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:4004:2: rule__Any__InternalIdAssignment_4_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Any__InternalIdAssignment_4_1_in_rule__Any__Group_4__1__Impl7881);
            rule__Any__InternalIdAssignment_4_1();

            state._fsp--;


            }

             after(grammarAccess.getAnyAccess().getInternalIdAssignment_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Any__Group_4__1__Impl"


    // $ANTLR start "rule__Junction__Group__0"
    // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:4018:1: rule__Junction__Group__0 : rule__Junction__Group__0__Impl rule__Junction__Group__1 ;
    public final void rule__Junction__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:4022:1: ( rule__Junction__Group__0__Impl rule__Junction__Group__1 )
            // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:4023:2: rule__Junction__Group__0__Impl rule__Junction__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Junction__Group__0__Impl_in_rule__Junction__Group__07915);
            rule__Junction__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Junction__Group__1_in_rule__Junction__Group__07918);
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
    // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:4030:1: rule__Junction__Group__0__Impl : ( () ) ;
    public final void rule__Junction__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:4034:1: ( ( () ) )
            // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:4035:1: ( () )
            {
            // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:4035:1: ( () )
            // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:4036:1: ()
            {
             before(grammarAccess.getJunctionAccess().getJunctionAction_0()); 
            // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:4037:1: ()
            // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:4039:1: 
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
    // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:4049:1: rule__Junction__Group__1 : rule__Junction__Group__1__Impl rule__Junction__Group__2 ;
    public final void rule__Junction__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:4053:1: ( rule__Junction__Group__1__Impl rule__Junction__Group__2 )
            // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:4054:2: rule__Junction__Group__1__Impl rule__Junction__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Junction__Group__1__Impl_in_rule__Junction__Group__17976);
            rule__Junction__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Junction__Group__2_in_rule__Junction__Group__17979);
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
    // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:4061:1: rule__Junction__Group__1__Impl : ( ( rule__Junction__LocalGeneratedAssignment_1 )? ) ;
    public final void rule__Junction__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:4065:1: ( ( ( rule__Junction__LocalGeneratedAssignment_1 )? ) )
            // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:4066:1: ( ( rule__Junction__LocalGeneratedAssignment_1 )? )
            {
            // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:4066:1: ( ( rule__Junction__LocalGeneratedAssignment_1 )? )
            // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:4067:1: ( rule__Junction__LocalGeneratedAssignment_1 )?
            {
             before(grammarAccess.getJunctionAccess().getLocalGeneratedAssignment_1()); 
            // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:4068:1: ( rule__Junction__LocalGeneratedAssignment_1 )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==38) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:4068:2: rule__Junction__LocalGeneratedAssignment_1
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__Junction__LocalGeneratedAssignment_1_in_rule__Junction__Group__1__Impl8006);
                    rule__Junction__LocalGeneratedAssignment_1();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getJunctionAccess().getLocalGeneratedAssignment_1()); 

            }


            }

        }
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
    // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:4078:1: rule__Junction__Group__2 : rule__Junction__Group__2__Impl rule__Junction__Group__3 ;
    public final void rule__Junction__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:4082:1: ( rule__Junction__Group__2__Impl rule__Junction__Group__3 )
            // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:4083:2: rule__Junction__Group__2__Impl rule__Junction__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__Junction__Group__2__Impl_in_rule__Junction__Group__28037);
            rule__Junction__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Junction__Group__3_in_rule__Junction__Group__28040);
            rule__Junction__Group__3();

            state._fsp--;


            }

        }
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
    // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:4090:1: rule__Junction__Group__2__Impl : ( 'Junction' ) ;
    public final void rule__Junction__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:4094:1: ( ( 'Junction' ) )
            // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:4095:1: ( 'Junction' )
            {
            // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:4095:1: ( 'Junction' )
            // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:4096:1: 'Junction'
            {
             before(grammarAccess.getJunctionAccess().getJunctionKeyword_2()); 
            match(input,34,FollowSets000.FOLLOW_34_in_rule__Junction__Group__2__Impl8068); 
             after(grammarAccess.getJunctionAccess().getJunctionKeyword_2()); 

            }


            }

        }
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


    // $ANTLR start "rule__Junction__Group__3"
    // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:4109:1: rule__Junction__Group__3 : rule__Junction__Group__3__Impl rule__Junction__Group__4 ;
    public final void rule__Junction__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:4113:1: ( rule__Junction__Group__3__Impl rule__Junction__Group__4 )
            // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:4114:2: rule__Junction__Group__3__Impl rule__Junction__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__Junction__Group__3__Impl_in_rule__Junction__Group__38099);
            rule__Junction__Group__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Junction__Group__4_in_rule__Junction__Group__38102);
            rule__Junction__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Junction__Group__3"


    // $ANTLR start "rule__Junction__Group__3__Impl"
    // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:4121:1: rule__Junction__Group__3__Impl : ( '{' ) ;
    public final void rule__Junction__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:4125:1: ( ( '{' ) )
            // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:4126:1: ( '{' )
            {
            // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:4126:1: ( '{' )
            // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:4127:1: '{'
            {
             before(grammarAccess.getJunctionAccess().getLeftCurlyBracketKeyword_3()); 
            match(input,12,FollowSets000.FOLLOW_12_in_rule__Junction__Group__3__Impl8130); 
             after(grammarAccess.getJunctionAccess().getLeftCurlyBracketKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Junction__Group__3__Impl"


    // $ANTLR start "rule__Junction__Group__4"
    // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:4140:1: rule__Junction__Group__4 : rule__Junction__Group__4__Impl rule__Junction__Group__5 ;
    public final void rule__Junction__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:4144:1: ( rule__Junction__Group__4__Impl rule__Junction__Group__5 )
            // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:4145:2: rule__Junction__Group__4__Impl rule__Junction__Group__5
            {
            pushFollow(FollowSets000.FOLLOW_rule__Junction__Group__4__Impl_in_rule__Junction__Group__48161);
            rule__Junction__Group__4__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Junction__Group__5_in_rule__Junction__Group__48164);
            rule__Junction__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Junction__Group__4"


    // $ANTLR start "rule__Junction__Group__4__Impl"
    // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:4152:1: rule__Junction__Group__4__Impl : ( ( rule__Junction__Group_4__0 )? ) ;
    public final void rule__Junction__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:4156:1: ( ( ( rule__Junction__Group_4__0 )? ) )
            // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:4157:1: ( ( rule__Junction__Group_4__0 )? )
            {
            // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:4157:1: ( ( rule__Junction__Group_4__0 )? )
            // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:4158:1: ( rule__Junction__Group_4__0 )?
            {
             before(grammarAccess.getJunctionAccess().getGroup_4()); 
            // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:4159:1: ( rule__Junction__Group_4__0 )?
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==31) ) {
                alt31=1;
            }
            switch (alt31) {
                case 1 :
                    // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:4159:2: rule__Junction__Group_4__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__Junction__Group_4__0_in_rule__Junction__Group__4__Impl8191);
                    rule__Junction__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getJunctionAccess().getGroup_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Junction__Group__4__Impl"


    // $ANTLR start "rule__Junction__Group__5"
    // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:4169:1: rule__Junction__Group__5 : rule__Junction__Group__5__Impl ;
    public final void rule__Junction__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:4173:1: ( rule__Junction__Group__5__Impl )
            // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:4174:2: rule__Junction__Group__5__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Junction__Group__5__Impl_in_rule__Junction__Group__58222);
            rule__Junction__Group__5__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Junction__Group__5"


    // $ANTLR start "rule__Junction__Group__5__Impl"
    // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:4180:1: rule__Junction__Group__5__Impl : ( '}' ) ;
    public final void rule__Junction__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:4184:1: ( ( '}' ) )
            // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:4185:1: ( '}' )
            {
            // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:4185:1: ( '}' )
            // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:4186:1: '}'
            {
             before(grammarAccess.getJunctionAccess().getRightCurlyBracketKeyword_5()); 
            match(input,13,FollowSets000.FOLLOW_13_in_rule__Junction__Group__5__Impl8250); 
             after(grammarAccess.getJunctionAccess().getRightCurlyBracketKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Junction__Group__5__Impl"


    // $ANTLR start "rule__Junction__Group_4__0"
    // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:4211:1: rule__Junction__Group_4__0 : rule__Junction__Group_4__0__Impl rule__Junction__Group_4__1 ;
    public final void rule__Junction__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:4215:1: ( rule__Junction__Group_4__0__Impl rule__Junction__Group_4__1 )
            // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:4216:2: rule__Junction__Group_4__0__Impl rule__Junction__Group_4__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Junction__Group_4__0__Impl_in_rule__Junction__Group_4__08293);
            rule__Junction__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Junction__Group_4__1_in_rule__Junction__Group_4__08296);
            rule__Junction__Group_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Junction__Group_4__0"


    // $ANTLR start "rule__Junction__Group_4__0__Impl"
    // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:4223:1: rule__Junction__Group_4__0__Impl : ( 'internalId' ) ;
    public final void rule__Junction__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:4227:1: ( ( 'internalId' ) )
            // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:4228:1: ( 'internalId' )
            {
            // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:4228:1: ( 'internalId' )
            // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:4229:1: 'internalId'
            {
             before(grammarAccess.getJunctionAccess().getInternalIdKeyword_4_0()); 
            match(input,31,FollowSets000.FOLLOW_31_in_rule__Junction__Group_4__0__Impl8324); 
             after(grammarAccess.getJunctionAccess().getInternalIdKeyword_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Junction__Group_4__0__Impl"


    // $ANTLR start "rule__Junction__Group_4__1"
    // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:4242:1: rule__Junction__Group_4__1 : rule__Junction__Group_4__1__Impl ;
    public final void rule__Junction__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:4246:1: ( rule__Junction__Group_4__1__Impl )
            // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:4247:2: rule__Junction__Group_4__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Junction__Group_4__1__Impl_in_rule__Junction__Group_4__18355);
            rule__Junction__Group_4__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Junction__Group_4__1"


    // $ANTLR start "rule__Junction__Group_4__1__Impl"
    // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:4253:1: rule__Junction__Group_4__1__Impl : ( ( rule__Junction__InternalIdAssignment_4_1 ) ) ;
    public final void rule__Junction__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:4257:1: ( ( ( rule__Junction__InternalIdAssignment_4_1 ) ) )
            // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:4258:1: ( ( rule__Junction__InternalIdAssignment_4_1 ) )
            {
            // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:4258:1: ( ( rule__Junction__InternalIdAssignment_4_1 ) )
            // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:4259:1: ( rule__Junction__InternalIdAssignment_4_1 )
            {
             before(grammarAccess.getJunctionAccess().getInternalIdAssignment_4_1()); 
            // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:4260:1: ( rule__Junction__InternalIdAssignment_4_1 )
            // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:4260:2: rule__Junction__InternalIdAssignment_4_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Junction__InternalIdAssignment_4_1_in_rule__Junction__Group_4__1__Impl8382);
            rule__Junction__InternalIdAssignment_4_1();

            state._fsp--;


            }

             after(grammarAccess.getJunctionAccess().getInternalIdAssignment_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Junction__Group_4__1__Impl"


    // $ANTLR start "rule__Fork__Group__0"
    // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:4274:1: rule__Fork__Group__0 : rule__Fork__Group__0__Impl rule__Fork__Group__1 ;
    public final void rule__Fork__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:4278:1: ( rule__Fork__Group__0__Impl rule__Fork__Group__1 )
            // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:4279:2: rule__Fork__Group__0__Impl rule__Fork__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Fork__Group__0__Impl_in_rule__Fork__Group__08416);
            rule__Fork__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Fork__Group__1_in_rule__Fork__Group__08419);
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
    // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:4286:1: rule__Fork__Group__0__Impl : ( () ) ;
    public final void rule__Fork__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:4290:1: ( ( () ) )
            // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:4291:1: ( () )
            {
            // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:4291:1: ( () )
            // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:4292:1: ()
            {
             before(grammarAccess.getForkAccess().getForkAction_0()); 
            // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:4293:1: ()
            // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:4295:1: 
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
    // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:4305:1: rule__Fork__Group__1 : rule__Fork__Group__1__Impl rule__Fork__Group__2 ;
    public final void rule__Fork__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:4309:1: ( rule__Fork__Group__1__Impl rule__Fork__Group__2 )
            // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:4310:2: rule__Fork__Group__1__Impl rule__Fork__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Fork__Group__1__Impl_in_rule__Fork__Group__18477);
            rule__Fork__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Fork__Group__2_in_rule__Fork__Group__18480);
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
    // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:4317:1: rule__Fork__Group__1__Impl : ( ( rule__Fork__LocalGeneratedAssignment_1 )? ) ;
    public final void rule__Fork__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:4321:1: ( ( ( rule__Fork__LocalGeneratedAssignment_1 )? ) )
            // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:4322:1: ( ( rule__Fork__LocalGeneratedAssignment_1 )? )
            {
            // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:4322:1: ( ( rule__Fork__LocalGeneratedAssignment_1 )? )
            // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:4323:1: ( rule__Fork__LocalGeneratedAssignment_1 )?
            {
             before(grammarAccess.getForkAccess().getLocalGeneratedAssignment_1()); 
            // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:4324:1: ( rule__Fork__LocalGeneratedAssignment_1 )?
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==38) ) {
                alt32=1;
            }
            switch (alt32) {
                case 1 :
                    // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:4324:2: rule__Fork__LocalGeneratedAssignment_1
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__Fork__LocalGeneratedAssignment_1_in_rule__Fork__Group__1__Impl8507);
                    rule__Fork__LocalGeneratedAssignment_1();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getForkAccess().getLocalGeneratedAssignment_1()); 

            }


            }

        }
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
    // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:4334:1: rule__Fork__Group__2 : rule__Fork__Group__2__Impl rule__Fork__Group__3 ;
    public final void rule__Fork__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:4338:1: ( rule__Fork__Group__2__Impl rule__Fork__Group__3 )
            // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:4339:2: rule__Fork__Group__2__Impl rule__Fork__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__Fork__Group__2__Impl_in_rule__Fork__Group__28538);
            rule__Fork__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Fork__Group__3_in_rule__Fork__Group__28541);
            rule__Fork__Group__3();

            state._fsp--;


            }

        }
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
    // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:4346:1: rule__Fork__Group__2__Impl : ( 'Fork' ) ;
    public final void rule__Fork__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:4350:1: ( ( 'Fork' ) )
            // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:4351:1: ( 'Fork' )
            {
            // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:4351:1: ( 'Fork' )
            // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:4352:1: 'Fork'
            {
             before(grammarAccess.getForkAccess().getForkKeyword_2()); 
            match(input,35,FollowSets000.FOLLOW_35_in_rule__Fork__Group__2__Impl8569); 
             after(grammarAccess.getForkAccess().getForkKeyword_2()); 

            }


            }

        }
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


    // $ANTLR start "rule__Fork__Group__3"
    // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:4365:1: rule__Fork__Group__3 : rule__Fork__Group__3__Impl rule__Fork__Group__4 ;
    public final void rule__Fork__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:4369:1: ( rule__Fork__Group__3__Impl rule__Fork__Group__4 )
            // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:4370:2: rule__Fork__Group__3__Impl rule__Fork__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__Fork__Group__3__Impl_in_rule__Fork__Group__38600);
            rule__Fork__Group__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Fork__Group__4_in_rule__Fork__Group__38603);
            rule__Fork__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Fork__Group__3"


    // $ANTLR start "rule__Fork__Group__3__Impl"
    // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:4377:1: rule__Fork__Group__3__Impl : ( '{' ) ;
    public final void rule__Fork__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:4381:1: ( ( '{' ) )
            // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:4382:1: ( '{' )
            {
            // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:4382:1: ( '{' )
            // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:4383:1: '{'
            {
             before(grammarAccess.getForkAccess().getLeftCurlyBracketKeyword_3()); 
            match(input,12,FollowSets000.FOLLOW_12_in_rule__Fork__Group__3__Impl8631); 
             after(grammarAccess.getForkAccess().getLeftCurlyBracketKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Fork__Group__3__Impl"


    // $ANTLR start "rule__Fork__Group__4"
    // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:4396:1: rule__Fork__Group__4 : rule__Fork__Group__4__Impl rule__Fork__Group__5 ;
    public final void rule__Fork__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:4400:1: ( rule__Fork__Group__4__Impl rule__Fork__Group__5 )
            // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:4401:2: rule__Fork__Group__4__Impl rule__Fork__Group__5
            {
            pushFollow(FollowSets000.FOLLOW_rule__Fork__Group__4__Impl_in_rule__Fork__Group__48662);
            rule__Fork__Group__4__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Fork__Group__5_in_rule__Fork__Group__48665);
            rule__Fork__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Fork__Group__4"


    // $ANTLR start "rule__Fork__Group__4__Impl"
    // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:4408:1: rule__Fork__Group__4__Impl : ( ( rule__Fork__Group_4__0 )? ) ;
    public final void rule__Fork__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:4412:1: ( ( ( rule__Fork__Group_4__0 )? ) )
            // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:4413:1: ( ( rule__Fork__Group_4__0 )? )
            {
            // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:4413:1: ( ( rule__Fork__Group_4__0 )? )
            // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:4414:1: ( rule__Fork__Group_4__0 )?
            {
             before(grammarAccess.getForkAccess().getGroup_4()); 
            // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:4415:1: ( rule__Fork__Group_4__0 )?
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==31) ) {
                alt33=1;
            }
            switch (alt33) {
                case 1 :
                    // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:4415:2: rule__Fork__Group_4__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__Fork__Group_4__0_in_rule__Fork__Group__4__Impl8692);
                    rule__Fork__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getForkAccess().getGroup_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Fork__Group__4__Impl"


    // $ANTLR start "rule__Fork__Group__5"
    // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:4425:1: rule__Fork__Group__5 : rule__Fork__Group__5__Impl ;
    public final void rule__Fork__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:4429:1: ( rule__Fork__Group__5__Impl )
            // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:4430:2: rule__Fork__Group__5__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Fork__Group__5__Impl_in_rule__Fork__Group__58723);
            rule__Fork__Group__5__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Fork__Group__5"


    // $ANTLR start "rule__Fork__Group__5__Impl"
    // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:4436:1: rule__Fork__Group__5__Impl : ( '}' ) ;
    public final void rule__Fork__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:4440:1: ( ( '}' ) )
            // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:4441:1: ( '}' )
            {
            // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:4441:1: ( '}' )
            // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:4442:1: '}'
            {
             before(grammarAccess.getForkAccess().getRightCurlyBracketKeyword_5()); 
            match(input,13,FollowSets000.FOLLOW_13_in_rule__Fork__Group__5__Impl8751); 
             after(grammarAccess.getForkAccess().getRightCurlyBracketKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Fork__Group__5__Impl"


    // $ANTLR start "rule__Fork__Group_4__0"
    // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:4467:1: rule__Fork__Group_4__0 : rule__Fork__Group_4__0__Impl rule__Fork__Group_4__1 ;
    public final void rule__Fork__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:4471:1: ( rule__Fork__Group_4__0__Impl rule__Fork__Group_4__1 )
            // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:4472:2: rule__Fork__Group_4__0__Impl rule__Fork__Group_4__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Fork__Group_4__0__Impl_in_rule__Fork__Group_4__08794);
            rule__Fork__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Fork__Group_4__1_in_rule__Fork__Group_4__08797);
            rule__Fork__Group_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Fork__Group_4__0"


    // $ANTLR start "rule__Fork__Group_4__0__Impl"
    // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:4479:1: rule__Fork__Group_4__0__Impl : ( 'internalId' ) ;
    public final void rule__Fork__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:4483:1: ( ( 'internalId' ) )
            // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:4484:1: ( 'internalId' )
            {
            // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:4484:1: ( 'internalId' )
            // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:4485:1: 'internalId'
            {
             before(grammarAccess.getForkAccess().getInternalIdKeyword_4_0()); 
            match(input,31,FollowSets000.FOLLOW_31_in_rule__Fork__Group_4__0__Impl8825); 
             after(grammarAccess.getForkAccess().getInternalIdKeyword_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Fork__Group_4__0__Impl"


    // $ANTLR start "rule__Fork__Group_4__1"
    // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:4498:1: rule__Fork__Group_4__1 : rule__Fork__Group_4__1__Impl ;
    public final void rule__Fork__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:4502:1: ( rule__Fork__Group_4__1__Impl )
            // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:4503:2: rule__Fork__Group_4__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Fork__Group_4__1__Impl_in_rule__Fork__Group_4__18856);
            rule__Fork__Group_4__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Fork__Group_4__1"


    // $ANTLR start "rule__Fork__Group_4__1__Impl"
    // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:4509:1: rule__Fork__Group_4__1__Impl : ( ( rule__Fork__InternalIdAssignment_4_1 ) ) ;
    public final void rule__Fork__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:4513:1: ( ( ( rule__Fork__InternalIdAssignment_4_1 ) ) )
            // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:4514:1: ( ( rule__Fork__InternalIdAssignment_4_1 ) )
            {
            // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:4514:1: ( ( rule__Fork__InternalIdAssignment_4_1 ) )
            // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:4515:1: ( rule__Fork__InternalIdAssignment_4_1 )
            {
             before(grammarAccess.getForkAccess().getInternalIdAssignment_4_1()); 
            // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:4516:1: ( rule__Fork__InternalIdAssignment_4_1 )
            // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:4516:2: rule__Fork__InternalIdAssignment_4_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Fork__InternalIdAssignment_4_1_in_rule__Fork__Group_4__1__Impl8883);
            rule__Fork__InternalIdAssignment_4_1();

            state._fsp--;


            }

             after(grammarAccess.getForkAccess().getInternalIdAssignment_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Fork__Group_4__1__Impl"


    // $ANTLR start "rule__Invariant__Group__0"
    // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:4531:1: rule__Invariant__Group__0 : rule__Invariant__Group__0__Impl rule__Invariant__Group__1 ;
    public final void rule__Invariant__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:4535:1: ( rule__Invariant__Group__0__Impl rule__Invariant__Group__1 )
            // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:4536:2: rule__Invariant__Group__0__Impl rule__Invariant__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Invariant__Group__0__Impl_in_rule__Invariant__Group__08918);
            rule__Invariant__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Invariant__Group__1_in_rule__Invariant__Group__08921);
            rule__Invariant__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Invariant__Group__0"


    // $ANTLR start "rule__Invariant__Group__0__Impl"
    // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:4543:1: rule__Invariant__Group__0__Impl : ( ( rule__Invariant__LocalGeneratedAssignment_0 )? ) ;
    public final void rule__Invariant__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:4547:1: ( ( ( rule__Invariant__LocalGeneratedAssignment_0 )? ) )
            // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:4548:1: ( ( rule__Invariant__LocalGeneratedAssignment_0 )? )
            {
            // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:4548:1: ( ( rule__Invariant__LocalGeneratedAssignment_0 )? )
            // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:4549:1: ( rule__Invariant__LocalGeneratedAssignment_0 )?
            {
             before(grammarAccess.getInvariantAccess().getLocalGeneratedAssignment_0()); 
            // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:4550:1: ( rule__Invariant__LocalGeneratedAssignment_0 )?
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( (LA34_0==38) ) {
                alt34=1;
            }
            switch (alt34) {
                case 1 :
                    // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:4550:2: rule__Invariant__LocalGeneratedAssignment_0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__Invariant__LocalGeneratedAssignment_0_in_rule__Invariant__Group__0__Impl8948);
                    rule__Invariant__LocalGeneratedAssignment_0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getInvariantAccess().getLocalGeneratedAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Invariant__Group__0__Impl"


    // $ANTLR start "rule__Invariant__Group__1"
    // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:4560:1: rule__Invariant__Group__1 : rule__Invariant__Group__1__Impl rule__Invariant__Group__2 ;
    public final void rule__Invariant__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:4564:1: ( rule__Invariant__Group__1__Impl rule__Invariant__Group__2 )
            // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:4565:2: rule__Invariant__Group__1__Impl rule__Invariant__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Invariant__Group__1__Impl_in_rule__Invariant__Group__18979);
            rule__Invariant__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Invariant__Group__2_in_rule__Invariant__Group__18982);
            rule__Invariant__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Invariant__Group__1"


    // $ANTLR start "rule__Invariant__Group__1__Impl"
    // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:4572:1: rule__Invariant__Group__1__Impl : ( ( rule__Invariant__TheoremAssignment_1 ) ) ;
    public final void rule__Invariant__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:4576:1: ( ( ( rule__Invariant__TheoremAssignment_1 ) ) )
            // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:4577:1: ( ( rule__Invariant__TheoremAssignment_1 ) )
            {
            // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:4577:1: ( ( rule__Invariant__TheoremAssignment_1 ) )
            // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:4578:1: ( rule__Invariant__TheoremAssignment_1 )
            {
             before(grammarAccess.getInvariantAccess().getTheoremAssignment_1()); 
            // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:4579:1: ( rule__Invariant__TheoremAssignment_1 )
            // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:4579:2: rule__Invariant__TheoremAssignment_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Invariant__TheoremAssignment_1_in_rule__Invariant__Group__1__Impl9009);
            rule__Invariant__TheoremAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getInvariantAccess().getTheoremAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Invariant__Group__1__Impl"


    // $ANTLR start "rule__Invariant__Group__2"
    // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:4589:1: rule__Invariant__Group__2 : rule__Invariant__Group__2__Impl rule__Invariant__Group__3 ;
    public final void rule__Invariant__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:4593:1: ( rule__Invariant__Group__2__Impl rule__Invariant__Group__3 )
            // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:4594:2: rule__Invariant__Group__2__Impl rule__Invariant__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__Invariant__Group__2__Impl_in_rule__Invariant__Group__29039);
            rule__Invariant__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Invariant__Group__3_in_rule__Invariant__Group__29042);
            rule__Invariant__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Invariant__Group__2"


    // $ANTLR start "rule__Invariant__Group__2__Impl"
    // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:4601:1: rule__Invariant__Group__2__Impl : ( 'Invariant' ) ;
    public final void rule__Invariant__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:4605:1: ( ( 'Invariant' ) )
            // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:4606:1: ( 'Invariant' )
            {
            // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:4606:1: ( 'Invariant' )
            // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:4607:1: 'Invariant'
            {
             before(grammarAccess.getInvariantAccess().getInvariantKeyword_2()); 
            match(input,36,FollowSets000.FOLLOW_36_in_rule__Invariant__Group__2__Impl9070); 
             after(grammarAccess.getInvariantAccess().getInvariantKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Invariant__Group__2__Impl"


    // $ANTLR start "rule__Invariant__Group__3"
    // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:4620:1: rule__Invariant__Group__3 : rule__Invariant__Group__3__Impl rule__Invariant__Group__4 ;
    public final void rule__Invariant__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:4624:1: ( rule__Invariant__Group__3__Impl rule__Invariant__Group__4 )
            // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:4625:2: rule__Invariant__Group__3__Impl rule__Invariant__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__Invariant__Group__3__Impl_in_rule__Invariant__Group__39101);
            rule__Invariant__Group__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Invariant__Group__4_in_rule__Invariant__Group__39104);
            rule__Invariant__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Invariant__Group__3"


    // $ANTLR start "rule__Invariant__Group__3__Impl"
    // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:4632:1: rule__Invariant__Group__3__Impl : ( ( rule__Invariant__NameAssignment_3 ) ) ;
    public final void rule__Invariant__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:4636:1: ( ( ( rule__Invariant__NameAssignment_3 ) ) )
            // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:4637:1: ( ( rule__Invariant__NameAssignment_3 ) )
            {
            // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:4637:1: ( ( rule__Invariant__NameAssignment_3 ) )
            // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:4638:1: ( rule__Invariant__NameAssignment_3 )
            {
             before(grammarAccess.getInvariantAccess().getNameAssignment_3()); 
            // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:4639:1: ( rule__Invariant__NameAssignment_3 )
            // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:4639:2: rule__Invariant__NameAssignment_3
            {
            pushFollow(FollowSets000.FOLLOW_rule__Invariant__NameAssignment_3_in_rule__Invariant__Group__3__Impl9131);
            rule__Invariant__NameAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getInvariantAccess().getNameAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Invariant__Group__3__Impl"


    // $ANTLR start "rule__Invariant__Group__4"
    // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:4649:1: rule__Invariant__Group__4 : rule__Invariant__Group__4__Impl rule__Invariant__Group__5 ;
    public final void rule__Invariant__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:4653:1: ( rule__Invariant__Group__4__Impl rule__Invariant__Group__5 )
            // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:4654:2: rule__Invariant__Group__4__Impl rule__Invariant__Group__5
            {
            pushFollow(FollowSets000.FOLLOW_rule__Invariant__Group__4__Impl_in_rule__Invariant__Group__49161);
            rule__Invariant__Group__4__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Invariant__Group__5_in_rule__Invariant__Group__49164);
            rule__Invariant__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Invariant__Group__4"


    // $ANTLR start "rule__Invariant__Group__4__Impl"
    // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:4661:1: rule__Invariant__Group__4__Impl : ( '{' ) ;
    public final void rule__Invariant__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:4665:1: ( ( '{' ) )
            // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:4666:1: ( '{' )
            {
            // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:4666:1: ( '{' )
            // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:4667:1: '{'
            {
             before(grammarAccess.getInvariantAccess().getLeftCurlyBracketKeyword_4()); 
            match(input,12,FollowSets000.FOLLOW_12_in_rule__Invariant__Group__4__Impl9192); 
             after(grammarAccess.getInvariantAccess().getLeftCurlyBracketKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Invariant__Group__4__Impl"


    // $ANTLR start "rule__Invariant__Group__5"
    // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:4680:1: rule__Invariant__Group__5 : rule__Invariant__Group__5__Impl rule__Invariant__Group__6 ;
    public final void rule__Invariant__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:4684:1: ( rule__Invariant__Group__5__Impl rule__Invariant__Group__6 )
            // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:4685:2: rule__Invariant__Group__5__Impl rule__Invariant__Group__6
            {
            pushFollow(FollowSets000.FOLLOW_rule__Invariant__Group__5__Impl_in_rule__Invariant__Group__59223);
            rule__Invariant__Group__5__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Invariant__Group__6_in_rule__Invariant__Group__59226);
            rule__Invariant__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Invariant__Group__5"


    // $ANTLR start "rule__Invariant__Group__5__Impl"
    // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:4692:1: rule__Invariant__Group__5__Impl : ( ( rule__Invariant__Group_5__0 )? ) ;
    public final void rule__Invariant__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:4696:1: ( ( ( rule__Invariant__Group_5__0 )? ) )
            // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:4697:1: ( ( rule__Invariant__Group_5__0 )? )
            {
            // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:4697:1: ( ( rule__Invariant__Group_5__0 )? )
            // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:4698:1: ( rule__Invariant__Group_5__0 )?
            {
             before(grammarAccess.getInvariantAccess().getGroup_5()); 
            // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:4699:1: ( rule__Invariant__Group_5__0 )?
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( (LA35_0==31) ) {
                alt35=1;
            }
            switch (alt35) {
                case 1 :
                    // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:4699:2: rule__Invariant__Group_5__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__Invariant__Group_5__0_in_rule__Invariant__Group__5__Impl9253);
                    rule__Invariant__Group_5__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getInvariantAccess().getGroup_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Invariant__Group__5__Impl"


    // $ANTLR start "rule__Invariant__Group__6"
    // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:4709:1: rule__Invariant__Group__6 : rule__Invariant__Group__6__Impl rule__Invariant__Group__7 ;
    public final void rule__Invariant__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:4713:1: ( rule__Invariant__Group__6__Impl rule__Invariant__Group__7 )
            // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:4714:2: rule__Invariant__Group__6__Impl rule__Invariant__Group__7
            {
            pushFollow(FollowSets000.FOLLOW_rule__Invariant__Group__6__Impl_in_rule__Invariant__Group__69284);
            rule__Invariant__Group__6__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Invariant__Group__7_in_rule__Invariant__Group__69287);
            rule__Invariant__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Invariant__Group__6"


    // $ANTLR start "rule__Invariant__Group__6__Impl"
    // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:4721:1: rule__Invariant__Group__6__Impl : ( ( rule__Invariant__Group_6__0 )? ) ;
    public final void rule__Invariant__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:4725:1: ( ( ( rule__Invariant__Group_6__0 )? ) )
            // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:4726:1: ( ( rule__Invariant__Group_6__0 )? )
            {
            // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:4726:1: ( ( rule__Invariant__Group_6__0 )? )
            // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:4727:1: ( rule__Invariant__Group_6__0 )?
            {
             before(grammarAccess.getInvariantAccess().getGroup_6()); 
            // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:4728:1: ( rule__Invariant__Group_6__0 )?
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( (LA36_0==14) ) {
                alt36=1;
            }
            switch (alt36) {
                case 1 :
                    // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:4728:2: rule__Invariant__Group_6__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__Invariant__Group_6__0_in_rule__Invariant__Group__6__Impl9314);
                    rule__Invariant__Group_6__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getInvariantAccess().getGroup_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Invariant__Group__6__Impl"


    // $ANTLR start "rule__Invariant__Group__7"
    // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:4738:1: rule__Invariant__Group__7 : rule__Invariant__Group__7__Impl rule__Invariant__Group__8 ;
    public final void rule__Invariant__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:4742:1: ( rule__Invariant__Group__7__Impl rule__Invariant__Group__8 )
            // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:4743:2: rule__Invariant__Group__7__Impl rule__Invariant__Group__8
            {
            pushFollow(FollowSets000.FOLLOW_rule__Invariant__Group__7__Impl_in_rule__Invariant__Group__79345);
            rule__Invariant__Group__7__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Invariant__Group__8_in_rule__Invariant__Group__79348);
            rule__Invariant__Group__8();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Invariant__Group__7"


    // $ANTLR start "rule__Invariant__Group__7__Impl"
    // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:4750:1: rule__Invariant__Group__7__Impl : ( 'predicate' ) ;
    public final void rule__Invariant__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:4754:1: ( ( 'predicate' ) )
            // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:4755:1: ( 'predicate' )
            {
            // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:4755:1: ( 'predicate' )
            // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:4756:1: 'predicate'
            {
             before(grammarAccess.getInvariantAccess().getPredicateKeyword_7()); 
            match(input,37,FollowSets000.FOLLOW_37_in_rule__Invariant__Group__7__Impl9376); 
             after(grammarAccess.getInvariantAccess().getPredicateKeyword_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Invariant__Group__7__Impl"


    // $ANTLR start "rule__Invariant__Group__8"
    // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:4769:1: rule__Invariant__Group__8 : rule__Invariant__Group__8__Impl rule__Invariant__Group__9 ;
    public final void rule__Invariant__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:4773:1: ( rule__Invariant__Group__8__Impl rule__Invariant__Group__9 )
            // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:4774:2: rule__Invariant__Group__8__Impl rule__Invariant__Group__9
            {
            pushFollow(FollowSets000.FOLLOW_rule__Invariant__Group__8__Impl_in_rule__Invariant__Group__89407);
            rule__Invariant__Group__8__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Invariant__Group__9_in_rule__Invariant__Group__89410);
            rule__Invariant__Group__9();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Invariant__Group__8"


    // $ANTLR start "rule__Invariant__Group__8__Impl"
    // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:4781:1: rule__Invariant__Group__8__Impl : ( ( rule__Invariant__PredicateAssignment_8 ) ) ;
    public final void rule__Invariant__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:4785:1: ( ( ( rule__Invariant__PredicateAssignment_8 ) ) )
            // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:4786:1: ( ( rule__Invariant__PredicateAssignment_8 ) )
            {
            // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:4786:1: ( ( rule__Invariant__PredicateAssignment_8 ) )
            // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:4787:1: ( rule__Invariant__PredicateAssignment_8 )
            {
             before(grammarAccess.getInvariantAccess().getPredicateAssignment_8()); 
            // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:4788:1: ( rule__Invariant__PredicateAssignment_8 )
            // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:4788:2: rule__Invariant__PredicateAssignment_8
            {
            pushFollow(FollowSets000.FOLLOW_rule__Invariant__PredicateAssignment_8_in_rule__Invariant__Group__8__Impl9437);
            rule__Invariant__PredicateAssignment_8();

            state._fsp--;


            }

             after(grammarAccess.getInvariantAccess().getPredicateAssignment_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Invariant__Group__8__Impl"


    // $ANTLR start "rule__Invariant__Group__9"
    // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:4798:1: rule__Invariant__Group__9 : rule__Invariant__Group__9__Impl ;
    public final void rule__Invariant__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:4802:1: ( rule__Invariant__Group__9__Impl )
            // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:4803:2: rule__Invariant__Group__9__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Invariant__Group__9__Impl_in_rule__Invariant__Group__99467);
            rule__Invariant__Group__9__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Invariant__Group__9"


    // $ANTLR start "rule__Invariant__Group__9__Impl"
    // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:4809:1: rule__Invariant__Group__9__Impl : ( '}' ) ;
    public final void rule__Invariant__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:4813:1: ( ( '}' ) )
            // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:4814:1: ( '}' )
            {
            // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:4814:1: ( '}' )
            // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:4815:1: '}'
            {
             before(grammarAccess.getInvariantAccess().getRightCurlyBracketKeyword_9()); 
            match(input,13,FollowSets000.FOLLOW_13_in_rule__Invariant__Group__9__Impl9495); 
             after(grammarAccess.getInvariantAccess().getRightCurlyBracketKeyword_9()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Invariant__Group__9__Impl"


    // $ANTLR start "rule__Invariant__Group_5__0"
    // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:4848:1: rule__Invariant__Group_5__0 : rule__Invariant__Group_5__0__Impl rule__Invariant__Group_5__1 ;
    public final void rule__Invariant__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:4852:1: ( rule__Invariant__Group_5__0__Impl rule__Invariant__Group_5__1 )
            // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:4853:2: rule__Invariant__Group_5__0__Impl rule__Invariant__Group_5__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Invariant__Group_5__0__Impl_in_rule__Invariant__Group_5__09546);
            rule__Invariant__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Invariant__Group_5__1_in_rule__Invariant__Group_5__09549);
            rule__Invariant__Group_5__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Invariant__Group_5__0"


    // $ANTLR start "rule__Invariant__Group_5__0__Impl"
    // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:4860:1: rule__Invariant__Group_5__0__Impl : ( 'internalId' ) ;
    public final void rule__Invariant__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:4864:1: ( ( 'internalId' ) )
            // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:4865:1: ( 'internalId' )
            {
            // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:4865:1: ( 'internalId' )
            // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:4866:1: 'internalId'
            {
             before(grammarAccess.getInvariantAccess().getInternalIdKeyword_5_0()); 
            match(input,31,FollowSets000.FOLLOW_31_in_rule__Invariant__Group_5__0__Impl9577); 
             after(grammarAccess.getInvariantAccess().getInternalIdKeyword_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Invariant__Group_5__0__Impl"


    // $ANTLR start "rule__Invariant__Group_5__1"
    // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:4879:1: rule__Invariant__Group_5__1 : rule__Invariant__Group_5__1__Impl ;
    public final void rule__Invariant__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:4883:1: ( rule__Invariant__Group_5__1__Impl )
            // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:4884:2: rule__Invariant__Group_5__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Invariant__Group_5__1__Impl_in_rule__Invariant__Group_5__19608);
            rule__Invariant__Group_5__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Invariant__Group_5__1"


    // $ANTLR start "rule__Invariant__Group_5__1__Impl"
    // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:4890:1: rule__Invariant__Group_5__1__Impl : ( ( rule__Invariant__InternalIdAssignment_5_1 ) ) ;
    public final void rule__Invariant__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:4894:1: ( ( ( rule__Invariant__InternalIdAssignment_5_1 ) ) )
            // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:4895:1: ( ( rule__Invariant__InternalIdAssignment_5_1 ) )
            {
            // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:4895:1: ( ( rule__Invariant__InternalIdAssignment_5_1 ) )
            // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:4896:1: ( rule__Invariant__InternalIdAssignment_5_1 )
            {
             before(grammarAccess.getInvariantAccess().getInternalIdAssignment_5_1()); 
            // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:4897:1: ( rule__Invariant__InternalIdAssignment_5_1 )
            // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:4897:2: rule__Invariant__InternalIdAssignment_5_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Invariant__InternalIdAssignment_5_1_in_rule__Invariant__Group_5__1__Impl9635);
            rule__Invariant__InternalIdAssignment_5_1();

            state._fsp--;


            }

             after(grammarAccess.getInvariantAccess().getInternalIdAssignment_5_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Invariant__Group_5__1__Impl"


    // $ANTLR start "rule__Invariant__Group_6__0"
    // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:4911:1: rule__Invariant__Group_6__0 : rule__Invariant__Group_6__0__Impl rule__Invariant__Group_6__1 ;
    public final void rule__Invariant__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:4915:1: ( rule__Invariant__Group_6__0__Impl rule__Invariant__Group_6__1 )
            // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:4916:2: rule__Invariant__Group_6__0__Impl rule__Invariant__Group_6__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Invariant__Group_6__0__Impl_in_rule__Invariant__Group_6__09669);
            rule__Invariant__Group_6__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Invariant__Group_6__1_in_rule__Invariant__Group_6__09672);
            rule__Invariant__Group_6__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Invariant__Group_6__0"


    // $ANTLR start "rule__Invariant__Group_6__0__Impl"
    // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:4923:1: rule__Invariant__Group_6__0__Impl : ( 'comment' ) ;
    public final void rule__Invariant__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:4927:1: ( ( 'comment' ) )
            // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:4928:1: ( 'comment' )
            {
            // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:4928:1: ( 'comment' )
            // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:4929:1: 'comment'
            {
             before(grammarAccess.getInvariantAccess().getCommentKeyword_6_0()); 
            match(input,14,FollowSets000.FOLLOW_14_in_rule__Invariant__Group_6__0__Impl9700); 
             after(grammarAccess.getInvariantAccess().getCommentKeyword_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Invariant__Group_6__0__Impl"


    // $ANTLR start "rule__Invariant__Group_6__1"
    // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:4942:1: rule__Invariant__Group_6__1 : rule__Invariant__Group_6__1__Impl ;
    public final void rule__Invariant__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:4946:1: ( rule__Invariant__Group_6__1__Impl )
            // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:4947:2: rule__Invariant__Group_6__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Invariant__Group_6__1__Impl_in_rule__Invariant__Group_6__19731);
            rule__Invariant__Group_6__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Invariant__Group_6__1"


    // $ANTLR start "rule__Invariant__Group_6__1__Impl"
    // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:4953:1: rule__Invariant__Group_6__1__Impl : ( ( rule__Invariant__CommentAssignment_6_1 ) ) ;
    public final void rule__Invariant__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:4957:1: ( ( ( rule__Invariant__CommentAssignment_6_1 ) ) )
            // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:4958:1: ( ( rule__Invariant__CommentAssignment_6_1 ) )
            {
            // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:4958:1: ( ( rule__Invariant__CommentAssignment_6_1 ) )
            // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:4959:1: ( rule__Invariant__CommentAssignment_6_1 )
            {
             before(grammarAccess.getInvariantAccess().getCommentAssignment_6_1()); 
            // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:4960:1: ( rule__Invariant__CommentAssignment_6_1 )
            // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:4960:2: rule__Invariant__CommentAssignment_6_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Invariant__CommentAssignment_6_1_in_rule__Invariant__Group_6__1__Impl9758);
            rule__Invariant__CommentAssignment_6_1();

            state._fsp--;


            }

             after(grammarAccess.getInvariantAccess().getCommentAssignment_6_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Invariant__Group_6__1__Impl"


    // $ANTLR start "rule__Statemachine__LocalGeneratedAssignment_0"
    // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:4975:1: rule__Statemachine__LocalGeneratedAssignment_0 : ( ( 'localGenerated' ) ) ;
    public final void rule__Statemachine__LocalGeneratedAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:4979:1: ( ( ( 'localGenerated' ) ) )
            // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:4980:1: ( ( 'localGenerated' ) )
            {
            // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:4980:1: ( ( 'localGenerated' ) )
            // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:4981:1: ( 'localGenerated' )
            {
             before(grammarAccess.getStatemachineAccess().getLocalGeneratedLocalGeneratedKeyword_0_0()); 
            // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:4982:1: ( 'localGenerated' )
            // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:4983:1: 'localGenerated'
            {
             before(grammarAccess.getStatemachineAccess().getLocalGeneratedLocalGeneratedKeyword_0_0()); 
            match(input,38,FollowSets000.FOLLOW_38_in_rule__Statemachine__LocalGeneratedAssignment_09802); 
             after(grammarAccess.getStatemachineAccess().getLocalGeneratedLocalGeneratedKeyword_0_0()); 

            }

             after(grammarAccess.getStatemachineAccess().getLocalGeneratedLocalGeneratedKeyword_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Statemachine__LocalGeneratedAssignment_0"


    // $ANTLR start "rule__Statemachine__NameAssignment_2"
    // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:4998:1: rule__Statemachine__NameAssignment_2 : ( ruleEString ) ;
    public final void rule__Statemachine__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:5002:1: ( ( ruleEString ) )
            // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:5003:1: ( ruleEString )
            {
            // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:5003:1: ( ruleEString )
            // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:5004:1: ruleEString
            {
             before(grammarAccess.getStatemachineAccess().getNameEStringParserRuleCall_2_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__Statemachine__NameAssignment_29841);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getStatemachineAccess().getNameEStringParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Statemachine__NameAssignment_2"


    // $ANTLR start "rule__Statemachine__CommentAssignment_4_1"
    // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:5013:1: rule__Statemachine__CommentAssignment_4_1 : ( ruleEString ) ;
    public final void rule__Statemachine__CommentAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:5017:1: ( ( ruleEString ) )
            // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:5018:1: ( ruleEString )
            {
            // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:5018:1: ( ruleEString )
            // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:5019:1: ruleEString
            {
             before(grammarAccess.getStatemachineAccess().getCommentEStringParserRuleCall_4_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__Statemachine__CommentAssignment_4_19872);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getStatemachineAccess().getCommentEStringParserRuleCall_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Statemachine__CommentAssignment_4_1"


    // $ANTLR start "rule__Statemachine__RefinesAssignment_5_1"
    // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:5028:1: rule__Statemachine__RefinesAssignment_5_1 : ( ( ruleEString ) ) ;
    public final void rule__Statemachine__RefinesAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:5032:1: ( ( ( ruleEString ) ) )
            // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:5033:1: ( ( ruleEString ) )
            {
            // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:5033:1: ( ( ruleEString ) )
            // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:5034:1: ( ruleEString )
            {
             before(grammarAccess.getStatemachineAccess().getRefinesStatemachineCrossReference_5_1_0()); 
            // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:5035:1: ( ruleEString )
            // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:5036:1: ruleEString
            {
             before(grammarAccess.getStatemachineAccess().getRefinesStatemachineEStringParserRuleCall_5_1_0_1()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__Statemachine__RefinesAssignment_5_19907);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getStatemachineAccess().getRefinesStatemachineEStringParserRuleCall_5_1_0_1()); 

            }

             after(grammarAccess.getStatemachineAccess().getRefinesStatemachineCrossReference_5_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Statemachine__RefinesAssignment_5_1"


    // $ANTLR start "rule__Statemachine__NodesAssignment_6_2"
    // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:5047:1: rule__Statemachine__NodesAssignment_6_2 : ( ruleAbstractNode ) ;
    public final void rule__Statemachine__NodesAssignment_6_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:5051:1: ( ( ruleAbstractNode ) )
            // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:5052:1: ( ruleAbstractNode )
            {
            // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:5052:1: ( ruleAbstractNode )
            // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:5053:1: ruleAbstractNode
            {
             before(grammarAccess.getStatemachineAccess().getNodesAbstractNodeParserRuleCall_6_2_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleAbstractNode_in_rule__Statemachine__NodesAssignment_6_29942);
            ruleAbstractNode();

            state._fsp--;

             after(grammarAccess.getStatemachineAccess().getNodesAbstractNodeParserRuleCall_6_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Statemachine__NodesAssignment_6_2"


    // $ANTLR start "rule__Statemachine__NodesAssignment_6_3_1"
    // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:5062:1: rule__Statemachine__NodesAssignment_6_3_1 : ( ruleAbstractNode ) ;
    public final void rule__Statemachine__NodesAssignment_6_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:5066:1: ( ( ruleAbstractNode ) )
            // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:5067:1: ( ruleAbstractNode )
            {
            // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:5067:1: ( ruleAbstractNode )
            // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:5068:1: ruleAbstractNode
            {
             before(grammarAccess.getStatemachineAccess().getNodesAbstractNodeParserRuleCall_6_3_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleAbstractNode_in_rule__Statemachine__NodesAssignment_6_3_19973);
            ruleAbstractNode();

            state._fsp--;

             after(grammarAccess.getStatemachineAccess().getNodesAbstractNodeParserRuleCall_6_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Statemachine__NodesAssignment_6_3_1"


    // $ANTLR start "rule__Statemachine__TransitionsAssignment_7_2"
    // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:5077:1: rule__Statemachine__TransitionsAssignment_7_2 : ( ruleTransition ) ;
    public final void rule__Statemachine__TransitionsAssignment_7_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:5081:1: ( ( ruleTransition ) )
            // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:5082:1: ( ruleTransition )
            {
            // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:5082:1: ( ruleTransition )
            // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:5083:1: ruleTransition
            {
             before(grammarAccess.getStatemachineAccess().getTransitionsTransitionParserRuleCall_7_2_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleTransition_in_rule__Statemachine__TransitionsAssignment_7_210004);
            ruleTransition();

            state._fsp--;

             after(grammarAccess.getStatemachineAccess().getTransitionsTransitionParserRuleCall_7_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Statemachine__TransitionsAssignment_7_2"


    // $ANTLR start "rule__Statemachine__TransitionsAssignment_7_3_1"
    // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:5092:1: rule__Statemachine__TransitionsAssignment_7_3_1 : ( ruleTransition ) ;
    public final void rule__Statemachine__TransitionsAssignment_7_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:5096:1: ( ( ruleTransition ) )
            // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:5097:1: ( ruleTransition )
            {
            // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:5097:1: ( ruleTransition )
            // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:5098:1: ruleTransition
            {
             before(grammarAccess.getStatemachineAccess().getTransitionsTransitionParserRuleCall_7_3_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleTransition_in_rule__Statemachine__TransitionsAssignment_7_3_110035);
            ruleTransition();

            state._fsp--;

             after(grammarAccess.getStatemachineAccess().getTransitionsTransitionParserRuleCall_7_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Statemachine__TransitionsAssignment_7_3_1"


    // $ANTLR start "rule__State__LocalGeneratedAssignment_1"
    // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:5107:1: rule__State__LocalGeneratedAssignment_1 : ( ( 'localGenerated' ) ) ;
    public final void rule__State__LocalGeneratedAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:5111:1: ( ( ( 'localGenerated' ) ) )
            // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:5112:1: ( ( 'localGenerated' ) )
            {
            // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:5112:1: ( ( 'localGenerated' ) )
            // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:5113:1: ( 'localGenerated' )
            {
             before(grammarAccess.getStateAccess().getLocalGeneratedLocalGeneratedKeyword_1_0()); 
            // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:5114:1: ( 'localGenerated' )
            // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:5115:1: 'localGenerated'
            {
             before(grammarAccess.getStateAccess().getLocalGeneratedLocalGeneratedKeyword_1_0()); 
            match(input,38,FollowSets000.FOLLOW_38_in_rule__State__LocalGeneratedAssignment_110071); 
             after(grammarAccess.getStateAccess().getLocalGeneratedLocalGeneratedKeyword_1_0()); 

            }

             after(grammarAccess.getStateAccess().getLocalGeneratedLocalGeneratedKeyword_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__State__LocalGeneratedAssignment_1"


    // $ANTLR start "rule__State__NameAssignment_3"
    // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:5130:1: rule__State__NameAssignment_3 : ( ruleEString ) ;
    public final void rule__State__NameAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:5134:1: ( ( ruleEString ) )
            // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:5135:1: ( ruleEString )
            {
            // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:5135:1: ( ruleEString )
            // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:5136:1: ruleEString
            {
             before(grammarAccess.getStateAccess().getNameEStringParserRuleCall_3_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__State__NameAssignment_310110);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getStateAccess().getNameEStringParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__State__NameAssignment_3"


    // $ANTLR start "rule__State__IncomingAssignment_5_2"
    // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:5145:1: rule__State__IncomingAssignment_5_2 : ( ( ruleEString ) ) ;
    public final void rule__State__IncomingAssignment_5_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:5149:1: ( ( ( ruleEString ) ) )
            // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:5150:1: ( ( ruleEString ) )
            {
            // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:5150:1: ( ( ruleEString ) )
            // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:5151:1: ( ruleEString )
            {
             before(grammarAccess.getStateAccess().getIncomingTransitionCrossReference_5_2_0()); 
            // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:5152:1: ( ruleEString )
            // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:5153:1: ruleEString
            {
             before(grammarAccess.getStateAccess().getIncomingTransitionEStringParserRuleCall_5_2_0_1()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__State__IncomingAssignment_5_210145);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getStateAccess().getIncomingTransitionEStringParserRuleCall_5_2_0_1()); 

            }

             after(grammarAccess.getStateAccess().getIncomingTransitionCrossReference_5_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__State__IncomingAssignment_5_2"


    // $ANTLR start "rule__State__IncomingAssignment_5_3_1"
    // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:5164:1: rule__State__IncomingAssignment_5_3_1 : ( ( ruleEString ) ) ;
    public final void rule__State__IncomingAssignment_5_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:5168:1: ( ( ( ruleEString ) ) )
            // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:5169:1: ( ( ruleEString ) )
            {
            // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:5169:1: ( ( ruleEString ) )
            // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:5170:1: ( ruleEString )
            {
             before(grammarAccess.getStateAccess().getIncomingTransitionCrossReference_5_3_1_0()); 
            // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:5171:1: ( ruleEString )
            // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:5172:1: ruleEString
            {
             before(grammarAccess.getStateAccess().getIncomingTransitionEStringParserRuleCall_5_3_1_0_1()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__State__IncomingAssignment_5_3_110184);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getStateAccess().getIncomingTransitionEStringParserRuleCall_5_3_1_0_1()); 

            }

             after(grammarAccess.getStateAccess().getIncomingTransitionCrossReference_5_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__State__IncomingAssignment_5_3_1"


    // $ANTLR start "rule__State__OutgoingAssignment_6_2"
    // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:5183:1: rule__State__OutgoingAssignment_6_2 : ( ( ruleEString ) ) ;
    public final void rule__State__OutgoingAssignment_6_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:5187:1: ( ( ( ruleEString ) ) )
            // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:5188:1: ( ( ruleEString ) )
            {
            // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:5188:1: ( ( ruleEString ) )
            // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:5189:1: ( ruleEString )
            {
             before(grammarAccess.getStateAccess().getOutgoingTransitionCrossReference_6_2_0()); 
            // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:5190:1: ( ruleEString )
            // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:5191:1: ruleEString
            {
             before(grammarAccess.getStateAccess().getOutgoingTransitionEStringParserRuleCall_6_2_0_1()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__State__OutgoingAssignment_6_210223);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getStateAccess().getOutgoingTransitionEStringParserRuleCall_6_2_0_1()); 

            }

             after(grammarAccess.getStateAccess().getOutgoingTransitionCrossReference_6_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__State__OutgoingAssignment_6_2"


    // $ANTLR start "rule__State__OutgoingAssignment_6_3_1"
    // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:5202:1: rule__State__OutgoingAssignment_6_3_1 : ( ( ruleEString ) ) ;
    public final void rule__State__OutgoingAssignment_6_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:5206:1: ( ( ( ruleEString ) ) )
            // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:5207:1: ( ( ruleEString ) )
            {
            // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:5207:1: ( ( ruleEString ) )
            // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:5208:1: ( ruleEString )
            {
             before(grammarAccess.getStateAccess().getOutgoingTransitionCrossReference_6_3_1_0()); 
            // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:5209:1: ( ruleEString )
            // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:5210:1: ruleEString
            {
             before(grammarAccess.getStateAccess().getOutgoingTransitionEStringParserRuleCall_6_3_1_0_1()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__State__OutgoingAssignment_6_3_110262);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getStateAccess().getOutgoingTransitionEStringParserRuleCall_6_3_1_0_1()); 

            }

             after(grammarAccess.getStateAccess().getOutgoingTransitionCrossReference_6_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__State__OutgoingAssignment_6_3_1"


    // $ANTLR start "rule__State__RefinesAssignment_7_1"
    // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:5221:1: rule__State__RefinesAssignment_7_1 : ( ( ruleEString ) ) ;
    public final void rule__State__RefinesAssignment_7_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:5225:1: ( ( ( ruleEString ) ) )
            // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:5226:1: ( ( ruleEString ) )
            {
            // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:5226:1: ( ( ruleEString ) )
            // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:5227:1: ( ruleEString )
            {
             before(grammarAccess.getStateAccess().getRefinesStateCrossReference_7_1_0()); 
            // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:5228:1: ( ruleEString )
            // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:5229:1: ruleEString
            {
             before(grammarAccess.getStateAccess().getRefinesStateEStringParserRuleCall_7_1_0_1()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__State__RefinesAssignment_7_110301);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getStateAccess().getRefinesStateEStringParserRuleCall_7_1_0_1()); 

            }

             after(grammarAccess.getStateAccess().getRefinesStateCrossReference_7_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__State__RefinesAssignment_7_1"


    // $ANTLR start "rule__State__StatemachinesAssignment_8_2"
    // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:5240:1: rule__State__StatemachinesAssignment_8_2 : ( ruleStatemachine ) ;
    public final void rule__State__StatemachinesAssignment_8_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:5244:1: ( ( ruleStatemachine ) )
            // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:5245:1: ( ruleStatemachine )
            {
            // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:5245:1: ( ruleStatemachine )
            // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:5246:1: ruleStatemachine
            {
             before(grammarAccess.getStateAccess().getStatemachinesStatemachineParserRuleCall_8_2_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleStatemachine_in_rule__State__StatemachinesAssignment_8_210336);
            ruleStatemachine();

            state._fsp--;

             after(grammarAccess.getStateAccess().getStatemachinesStatemachineParserRuleCall_8_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__State__StatemachinesAssignment_8_2"


    // $ANTLR start "rule__State__StatemachinesAssignment_8_3_1"
    // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:5255:1: rule__State__StatemachinesAssignment_8_3_1 : ( ruleStatemachine ) ;
    public final void rule__State__StatemachinesAssignment_8_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:5259:1: ( ( ruleStatemachine ) )
            // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:5260:1: ( ruleStatemachine )
            {
            // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:5260:1: ( ruleStatemachine )
            // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:5261:1: ruleStatemachine
            {
             before(grammarAccess.getStateAccess().getStatemachinesStatemachineParserRuleCall_8_3_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleStatemachine_in_rule__State__StatemachinesAssignment_8_3_110367);
            ruleStatemachine();

            state._fsp--;

             after(grammarAccess.getStateAccess().getStatemachinesStatemachineParserRuleCall_8_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__State__StatemachinesAssignment_8_3_1"


    // $ANTLR start "rule__State__InvariantsAssignment_9_2"
    // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:5270:1: rule__State__InvariantsAssignment_9_2 : ( ruleInvariant ) ;
    public final void rule__State__InvariantsAssignment_9_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:5274:1: ( ( ruleInvariant ) )
            // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:5275:1: ( ruleInvariant )
            {
            // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:5275:1: ( ruleInvariant )
            // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:5276:1: ruleInvariant
            {
             before(grammarAccess.getStateAccess().getInvariantsInvariantParserRuleCall_9_2_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleInvariant_in_rule__State__InvariantsAssignment_9_210398);
            ruleInvariant();

            state._fsp--;

             after(grammarAccess.getStateAccess().getInvariantsInvariantParserRuleCall_9_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__State__InvariantsAssignment_9_2"


    // $ANTLR start "rule__State__InvariantsAssignment_9_3_1"
    // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:5285:1: rule__State__InvariantsAssignment_9_3_1 : ( ruleInvariant ) ;
    public final void rule__State__InvariantsAssignment_9_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:5289:1: ( ( ruleInvariant ) )
            // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:5290:1: ( ruleInvariant )
            {
            // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:5290:1: ( ruleInvariant )
            // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:5291:1: ruleInvariant
            {
             before(grammarAccess.getStateAccess().getInvariantsInvariantParserRuleCall_9_3_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleInvariant_in_rule__State__InvariantsAssignment_9_3_110429);
            ruleInvariant();

            state._fsp--;

             after(grammarAccess.getStateAccess().getInvariantsInvariantParserRuleCall_9_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__State__InvariantsAssignment_9_3_1"


    // $ANTLR start "rule__Transition__LocalGeneratedAssignment_0"
    // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:5300:1: rule__Transition__LocalGeneratedAssignment_0 : ( ( 'localGenerated' ) ) ;
    public final void rule__Transition__LocalGeneratedAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:5304:1: ( ( ( 'localGenerated' ) ) )
            // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:5305:1: ( ( 'localGenerated' ) )
            {
            // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:5305:1: ( ( 'localGenerated' ) )
            // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:5306:1: ( 'localGenerated' )
            {
             before(grammarAccess.getTransitionAccess().getLocalGeneratedLocalGeneratedKeyword_0_0()); 
            // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:5307:1: ( 'localGenerated' )
            // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:5308:1: 'localGenerated'
            {
             before(grammarAccess.getTransitionAccess().getLocalGeneratedLocalGeneratedKeyword_0_0()); 
            match(input,38,FollowSets000.FOLLOW_38_in_rule__Transition__LocalGeneratedAssignment_010465); 
             after(grammarAccess.getTransitionAccess().getLocalGeneratedLocalGeneratedKeyword_0_0()); 

            }

             after(grammarAccess.getTransitionAccess().getLocalGeneratedLocalGeneratedKeyword_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__LocalGeneratedAssignment_0"


    // $ANTLR start "rule__Transition__ExtendedAssignment_1"
    // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:5323:1: rule__Transition__ExtendedAssignment_1 : ( ( 'extended' ) ) ;
    public final void rule__Transition__ExtendedAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:5327:1: ( ( ( 'extended' ) ) )
            // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:5328:1: ( ( 'extended' ) )
            {
            // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:5328:1: ( ( 'extended' ) )
            // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:5329:1: ( 'extended' )
            {
             before(grammarAccess.getTransitionAccess().getExtendedExtendedKeyword_1_0()); 
            // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:5330:1: ( 'extended' )
            // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:5331:1: 'extended'
            {
             before(grammarAccess.getTransitionAccess().getExtendedExtendedKeyword_1_0()); 
            match(input,39,FollowSets000.FOLLOW_39_in_rule__Transition__ExtendedAssignment_110509); 
             after(grammarAccess.getTransitionAccess().getExtendedExtendedKeyword_1_0()); 

            }

             after(grammarAccess.getTransitionAccess().getExtendedExtendedKeyword_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__ExtendedAssignment_1"


    // $ANTLR start "rule__Transition__CommentAssignment_4_1"
    // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:5346:1: rule__Transition__CommentAssignment_4_1 : ( ruleEString ) ;
    public final void rule__Transition__CommentAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:5350:1: ( ( ruleEString ) )
            // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:5351:1: ( ruleEString )
            {
            // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:5351:1: ( ruleEString )
            // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:5352:1: ruleEString
            {
             before(grammarAccess.getTransitionAccess().getCommentEStringParserRuleCall_4_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__Transition__CommentAssignment_4_110548);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getTransitionAccess().getCommentEStringParserRuleCall_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__CommentAssignment_4_1"


    // $ANTLR start "rule__Transition__ElaboratesAssignment_5_2"
    // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:5361:1: rule__Transition__ElaboratesAssignment_5_2 : ( ( ruleEString ) ) ;
    public final void rule__Transition__ElaboratesAssignment_5_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:5365:1: ( ( ( ruleEString ) ) )
            // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:5366:1: ( ( ruleEString ) )
            {
            // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:5366:1: ( ( ruleEString ) )
            // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:5367:1: ( ruleEString )
            {
             before(grammarAccess.getTransitionAccess().getElaboratesEventCrossReference_5_2_0()); 
            // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:5368:1: ( ruleEString )
            // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:5369:1: ruleEString
            {
             before(grammarAccess.getTransitionAccess().getElaboratesEventEStringParserRuleCall_5_2_0_1()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__Transition__ElaboratesAssignment_5_210583);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getTransitionAccess().getElaboratesEventEStringParserRuleCall_5_2_0_1()); 

            }

             after(grammarAccess.getTransitionAccess().getElaboratesEventCrossReference_5_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__ElaboratesAssignment_5_2"


    // $ANTLR start "rule__Transition__ElaboratesAssignment_5_3_1"
    // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:5380:1: rule__Transition__ElaboratesAssignment_5_3_1 : ( ( ruleEString ) ) ;
    public final void rule__Transition__ElaboratesAssignment_5_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:5384:1: ( ( ( ruleEString ) ) )
            // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:5385:1: ( ( ruleEString ) )
            {
            // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:5385:1: ( ( ruleEString ) )
            // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:5386:1: ( ruleEString )
            {
             before(grammarAccess.getTransitionAccess().getElaboratesEventCrossReference_5_3_1_0()); 
            // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:5387:1: ( ruleEString )
            // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:5388:1: ruleEString
            {
             before(grammarAccess.getTransitionAccess().getElaboratesEventEStringParserRuleCall_5_3_1_0_1()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__Transition__ElaboratesAssignment_5_3_110622);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getTransitionAccess().getElaboratesEventEStringParserRuleCall_5_3_1_0_1()); 

            }

             after(grammarAccess.getTransitionAccess().getElaboratesEventCrossReference_5_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__ElaboratesAssignment_5_3_1"


    // $ANTLR start "rule__Transition__TargetAssignment_7"
    // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:5399:1: rule__Transition__TargetAssignment_7 : ( ( ruleEString ) ) ;
    public final void rule__Transition__TargetAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:5403:1: ( ( ( ruleEString ) ) )
            // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:5404:1: ( ( ruleEString ) )
            {
            // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:5404:1: ( ( ruleEString ) )
            // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:5405:1: ( ruleEString )
            {
             before(grammarAccess.getTransitionAccess().getTargetAbstractNodeCrossReference_7_0()); 
            // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:5406:1: ( ruleEString )
            // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:5407:1: ruleEString
            {
             before(grammarAccess.getTransitionAccess().getTargetAbstractNodeEStringParserRuleCall_7_0_1()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__Transition__TargetAssignment_710661);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getTransitionAccess().getTargetAbstractNodeEStringParserRuleCall_7_0_1()); 

            }

             after(grammarAccess.getTransitionAccess().getTargetAbstractNodeCrossReference_7_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__TargetAssignment_7"


    // $ANTLR start "rule__Transition__SourceAssignment_9"
    // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:5418:1: rule__Transition__SourceAssignment_9 : ( ( ruleEString ) ) ;
    public final void rule__Transition__SourceAssignment_9() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:5422:1: ( ( ( ruleEString ) ) )
            // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:5423:1: ( ( ruleEString ) )
            {
            // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:5423:1: ( ( ruleEString ) )
            // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:5424:1: ( ruleEString )
            {
             before(grammarAccess.getTransitionAccess().getSourceAbstractNodeCrossReference_9_0()); 
            // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:5425:1: ( ruleEString )
            // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:5426:1: ruleEString
            {
             before(grammarAccess.getTransitionAccess().getSourceAbstractNodeEStringParserRuleCall_9_0_1()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__Transition__SourceAssignment_910700);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getTransitionAccess().getSourceAbstractNodeEStringParserRuleCall_9_0_1()); 

            }

             after(grammarAccess.getTransitionAccess().getSourceAbstractNodeCrossReference_9_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__SourceAssignment_9"


    // $ANTLR start "rule__Initial__LocalGeneratedAssignment_1"
    // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:5439:1: rule__Initial__LocalGeneratedAssignment_1 : ( ( 'localGenerated' ) ) ;
    public final void rule__Initial__LocalGeneratedAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:5443:1: ( ( ( 'localGenerated' ) ) )
            // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:5444:1: ( ( 'localGenerated' ) )
            {
            // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:5444:1: ( ( 'localGenerated' ) )
            // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:5445:1: ( 'localGenerated' )
            {
             before(grammarAccess.getInitialAccess().getLocalGeneratedLocalGeneratedKeyword_1_0()); 
            // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:5446:1: ( 'localGenerated' )
            // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:5447:1: 'localGenerated'
            {
             before(grammarAccess.getInitialAccess().getLocalGeneratedLocalGeneratedKeyword_1_0()); 
            match(input,38,FollowSets000.FOLLOW_38_in_rule__Initial__LocalGeneratedAssignment_110742); 
             after(grammarAccess.getInitialAccess().getLocalGeneratedLocalGeneratedKeyword_1_0()); 

            }

             after(grammarAccess.getInitialAccess().getLocalGeneratedLocalGeneratedKeyword_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Initial__LocalGeneratedAssignment_1"


    // $ANTLR start "rule__Initial__InternalIdAssignment_4_1"
    // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:5462:1: rule__Initial__InternalIdAssignment_4_1 : ( ruleEString ) ;
    public final void rule__Initial__InternalIdAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:5466:1: ( ( ruleEString ) )
            // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:5467:1: ( ruleEString )
            {
            // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:5467:1: ( ruleEString )
            // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:5468:1: ruleEString
            {
             before(grammarAccess.getInitialAccess().getInternalIdEStringParserRuleCall_4_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__Initial__InternalIdAssignment_4_110781);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getInitialAccess().getInternalIdEStringParserRuleCall_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Initial__InternalIdAssignment_4_1"


    // $ANTLR start "rule__Final__LocalGeneratedAssignment_1"
    // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:5477:1: rule__Final__LocalGeneratedAssignment_1 : ( ( 'localGenerated' ) ) ;
    public final void rule__Final__LocalGeneratedAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:5481:1: ( ( ( 'localGenerated' ) ) )
            // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:5482:1: ( ( 'localGenerated' ) )
            {
            // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:5482:1: ( ( 'localGenerated' ) )
            // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:5483:1: ( 'localGenerated' )
            {
             before(grammarAccess.getFinalAccess().getLocalGeneratedLocalGeneratedKeyword_1_0()); 
            // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:5484:1: ( 'localGenerated' )
            // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:5485:1: 'localGenerated'
            {
             before(grammarAccess.getFinalAccess().getLocalGeneratedLocalGeneratedKeyword_1_0()); 
            match(input,38,FollowSets000.FOLLOW_38_in_rule__Final__LocalGeneratedAssignment_110817); 
             after(grammarAccess.getFinalAccess().getLocalGeneratedLocalGeneratedKeyword_1_0()); 

            }

             after(grammarAccess.getFinalAccess().getLocalGeneratedLocalGeneratedKeyword_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Final__LocalGeneratedAssignment_1"


    // $ANTLR start "rule__Final__InternalIdAssignment_4_1"
    // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:5500:1: rule__Final__InternalIdAssignment_4_1 : ( ruleEString ) ;
    public final void rule__Final__InternalIdAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:5504:1: ( ( ruleEString ) )
            // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:5505:1: ( ruleEString )
            {
            // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:5505:1: ( ruleEString )
            // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:5506:1: ruleEString
            {
             before(grammarAccess.getFinalAccess().getInternalIdEStringParserRuleCall_4_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__Final__InternalIdAssignment_4_110856);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getFinalAccess().getInternalIdEStringParserRuleCall_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Final__InternalIdAssignment_4_1"


    // $ANTLR start "rule__Any__LocalGeneratedAssignment_1"
    // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:5515:1: rule__Any__LocalGeneratedAssignment_1 : ( ( 'localGenerated' ) ) ;
    public final void rule__Any__LocalGeneratedAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:5519:1: ( ( ( 'localGenerated' ) ) )
            // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:5520:1: ( ( 'localGenerated' ) )
            {
            // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:5520:1: ( ( 'localGenerated' ) )
            // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:5521:1: ( 'localGenerated' )
            {
             before(grammarAccess.getAnyAccess().getLocalGeneratedLocalGeneratedKeyword_1_0()); 
            // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:5522:1: ( 'localGenerated' )
            // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:5523:1: 'localGenerated'
            {
             before(grammarAccess.getAnyAccess().getLocalGeneratedLocalGeneratedKeyword_1_0()); 
            match(input,38,FollowSets000.FOLLOW_38_in_rule__Any__LocalGeneratedAssignment_110892); 
             after(grammarAccess.getAnyAccess().getLocalGeneratedLocalGeneratedKeyword_1_0()); 

            }

             after(grammarAccess.getAnyAccess().getLocalGeneratedLocalGeneratedKeyword_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Any__LocalGeneratedAssignment_1"


    // $ANTLR start "rule__Any__InternalIdAssignment_4_1"
    // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:5538:1: rule__Any__InternalIdAssignment_4_1 : ( ruleEString ) ;
    public final void rule__Any__InternalIdAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:5542:1: ( ( ruleEString ) )
            // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:5543:1: ( ruleEString )
            {
            // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:5543:1: ( ruleEString )
            // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:5544:1: ruleEString
            {
             before(grammarAccess.getAnyAccess().getInternalIdEStringParserRuleCall_4_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__Any__InternalIdAssignment_4_110931);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getAnyAccess().getInternalIdEStringParserRuleCall_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Any__InternalIdAssignment_4_1"


    // $ANTLR start "rule__Junction__LocalGeneratedAssignment_1"
    // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:5553:1: rule__Junction__LocalGeneratedAssignment_1 : ( ( 'localGenerated' ) ) ;
    public final void rule__Junction__LocalGeneratedAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:5557:1: ( ( ( 'localGenerated' ) ) )
            // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:5558:1: ( ( 'localGenerated' ) )
            {
            // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:5558:1: ( ( 'localGenerated' ) )
            // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:5559:1: ( 'localGenerated' )
            {
             before(grammarAccess.getJunctionAccess().getLocalGeneratedLocalGeneratedKeyword_1_0()); 
            // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:5560:1: ( 'localGenerated' )
            // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:5561:1: 'localGenerated'
            {
             before(grammarAccess.getJunctionAccess().getLocalGeneratedLocalGeneratedKeyword_1_0()); 
            match(input,38,FollowSets000.FOLLOW_38_in_rule__Junction__LocalGeneratedAssignment_110967); 
             after(grammarAccess.getJunctionAccess().getLocalGeneratedLocalGeneratedKeyword_1_0()); 

            }

             after(grammarAccess.getJunctionAccess().getLocalGeneratedLocalGeneratedKeyword_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Junction__LocalGeneratedAssignment_1"


    // $ANTLR start "rule__Junction__InternalIdAssignment_4_1"
    // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:5576:1: rule__Junction__InternalIdAssignment_4_1 : ( ruleEString ) ;
    public final void rule__Junction__InternalIdAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:5580:1: ( ( ruleEString ) )
            // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:5581:1: ( ruleEString )
            {
            // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:5581:1: ( ruleEString )
            // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:5582:1: ruleEString
            {
             before(grammarAccess.getJunctionAccess().getInternalIdEStringParserRuleCall_4_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__Junction__InternalIdAssignment_4_111006);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getJunctionAccess().getInternalIdEStringParserRuleCall_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Junction__InternalIdAssignment_4_1"


    // $ANTLR start "rule__Fork__LocalGeneratedAssignment_1"
    // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:5591:1: rule__Fork__LocalGeneratedAssignment_1 : ( ( 'localGenerated' ) ) ;
    public final void rule__Fork__LocalGeneratedAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:5595:1: ( ( ( 'localGenerated' ) ) )
            // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:5596:1: ( ( 'localGenerated' ) )
            {
            // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:5596:1: ( ( 'localGenerated' ) )
            // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:5597:1: ( 'localGenerated' )
            {
             before(grammarAccess.getForkAccess().getLocalGeneratedLocalGeneratedKeyword_1_0()); 
            // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:5598:1: ( 'localGenerated' )
            // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:5599:1: 'localGenerated'
            {
             before(grammarAccess.getForkAccess().getLocalGeneratedLocalGeneratedKeyword_1_0()); 
            match(input,38,FollowSets000.FOLLOW_38_in_rule__Fork__LocalGeneratedAssignment_111042); 
             after(grammarAccess.getForkAccess().getLocalGeneratedLocalGeneratedKeyword_1_0()); 

            }

             after(grammarAccess.getForkAccess().getLocalGeneratedLocalGeneratedKeyword_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Fork__LocalGeneratedAssignment_1"


    // $ANTLR start "rule__Fork__InternalIdAssignment_4_1"
    // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:5614:1: rule__Fork__InternalIdAssignment_4_1 : ( ruleEString ) ;
    public final void rule__Fork__InternalIdAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:5618:1: ( ( ruleEString ) )
            // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:5619:1: ( ruleEString )
            {
            // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:5619:1: ( ruleEString )
            // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:5620:1: ruleEString
            {
             before(grammarAccess.getForkAccess().getInternalIdEStringParserRuleCall_4_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__Fork__InternalIdAssignment_4_111081);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getForkAccess().getInternalIdEStringParserRuleCall_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Fork__InternalIdAssignment_4_1"


    // $ANTLR start "rule__Invariant__LocalGeneratedAssignment_0"
    // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:5632:1: rule__Invariant__LocalGeneratedAssignment_0 : ( ( 'localGenerated' ) ) ;
    public final void rule__Invariant__LocalGeneratedAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:5636:1: ( ( ( 'localGenerated' ) ) )
            // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:5637:1: ( ( 'localGenerated' ) )
            {
            // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:5637:1: ( ( 'localGenerated' ) )
            // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:5638:1: ( 'localGenerated' )
            {
             before(grammarAccess.getInvariantAccess().getLocalGeneratedLocalGeneratedKeyword_0_0()); 
            // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:5639:1: ( 'localGenerated' )
            // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:5640:1: 'localGenerated'
            {
             before(grammarAccess.getInvariantAccess().getLocalGeneratedLocalGeneratedKeyword_0_0()); 
            match(input,38,FollowSets000.FOLLOW_38_in_rule__Invariant__LocalGeneratedAssignment_011120); 
             after(grammarAccess.getInvariantAccess().getLocalGeneratedLocalGeneratedKeyword_0_0()); 

            }

             after(grammarAccess.getInvariantAccess().getLocalGeneratedLocalGeneratedKeyword_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Invariant__LocalGeneratedAssignment_0"


    // $ANTLR start "rule__Invariant__TheoremAssignment_1"
    // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:5655:1: rule__Invariant__TheoremAssignment_1 : ( ( 'theorem' ) ) ;
    public final void rule__Invariant__TheoremAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:5659:1: ( ( ( 'theorem' ) ) )
            // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:5660:1: ( ( 'theorem' ) )
            {
            // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:5660:1: ( ( 'theorem' ) )
            // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:5661:1: ( 'theorem' )
            {
             before(grammarAccess.getInvariantAccess().getTheoremTheoremKeyword_1_0()); 
            // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:5662:1: ( 'theorem' )
            // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:5663:1: 'theorem'
            {
             before(grammarAccess.getInvariantAccess().getTheoremTheoremKeyword_1_0()); 
            match(input,40,FollowSets000.FOLLOW_40_in_rule__Invariant__TheoremAssignment_111164); 
             after(grammarAccess.getInvariantAccess().getTheoremTheoremKeyword_1_0()); 

            }

             after(grammarAccess.getInvariantAccess().getTheoremTheoremKeyword_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Invariant__TheoremAssignment_1"


    // $ANTLR start "rule__Invariant__NameAssignment_3"
    // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:5678:1: rule__Invariant__NameAssignment_3 : ( ruleEString ) ;
    public final void rule__Invariant__NameAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:5682:1: ( ( ruleEString ) )
            // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:5683:1: ( ruleEString )
            {
            // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:5683:1: ( ruleEString )
            // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:5684:1: ruleEString
            {
             before(grammarAccess.getInvariantAccess().getNameEStringParserRuleCall_3_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__Invariant__NameAssignment_311203);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getInvariantAccess().getNameEStringParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Invariant__NameAssignment_3"


    // $ANTLR start "rule__Invariant__InternalIdAssignment_5_1"
    // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:5693:1: rule__Invariant__InternalIdAssignment_5_1 : ( ruleEString ) ;
    public final void rule__Invariant__InternalIdAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:5697:1: ( ( ruleEString ) )
            // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:5698:1: ( ruleEString )
            {
            // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:5698:1: ( ruleEString )
            // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:5699:1: ruleEString
            {
             before(grammarAccess.getInvariantAccess().getInternalIdEStringParserRuleCall_5_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__Invariant__InternalIdAssignment_5_111234);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getInvariantAccess().getInternalIdEStringParserRuleCall_5_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Invariant__InternalIdAssignment_5_1"


    // $ANTLR start "rule__Invariant__CommentAssignment_6_1"
    // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:5708:1: rule__Invariant__CommentAssignment_6_1 : ( ruleEString ) ;
    public final void rule__Invariant__CommentAssignment_6_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:5712:1: ( ( ruleEString ) )
            // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:5713:1: ( ruleEString )
            {
            // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:5713:1: ( ruleEString )
            // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:5714:1: ruleEString
            {
             before(grammarAccess.getInvariantAccess().getCommentEStringParserRuleCall_6_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__Invariant__CommentAssignment_6_111265);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getInvariantAccess().getCommentEStringParserRuleCall_6_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Invariant__CommentAssignment_6_1"


    // $ANTLR start "rule__Invariant__PredicateAssignment_8"
    // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:5723:1: rule__Invariant__PredicateAssignment_8 : ( ruleEString ) ;
    public final void rule__Invariant__PredicateAssignment_8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:5727:1: ( ( ruleEString ) )
            // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:5728:1: ( ruleEString )
            {
            // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:5728:1: ( ruleEString )
            // ../ac.soton.xtext.iumlb.dsl.ui/src-gen/ac/soton/xtext/iumlb/ui/contentassist/antlr/internal/InternalDsl.g:5729:1: ruleEString
            {
             before(grammarAccess.getInvariantAccess().getPredicateEStringParserRuleCall_8_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__Invariant__PredicateAssignment_811296);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getInvariantAccess().getPredicateEStringParserRuleCall_8_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Invariant__PredicateAssignment_8"

    // Delegated rules


 

    
    private static class FollowSets000 {
        public static final BitSet FOLLOW_ruleAbstractNode_in_entryRuleAbstractNode61 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleAbstractNode68 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__AbstractNode__Alternatives_in_ruleAbstractNode94 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleStatemachine_in_entryRuleStatemachine121 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleStatemachine128 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Statemachine__Group__0_in_ruleStatemachine154 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleState_in_entryRuleState181 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleState188 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__State__Group__0_in_ruleState214 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_entryRuleEString243 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleEString250 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__EString__Alternatives_in_ruleEString276 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleTransition_in_entryRuleTransition305 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleTransition312 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Transition__Group__0_in_ruleTransition338 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleInitial_in_entryRuleInitial371 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleInitial378 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Initial__Group__0_in_ruleInitial404 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleFinal_in_entryRuleFinal431 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleFinal438 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Final__Group__0_in_ruleFinal464 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAny_in_entryRuleAny491 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleAny498 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Any__Group__0_in_ruleAny524 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleJunction_in_entryRuleJunction551 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleJunction558 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Junction__Group__0_in_ruleJunction584 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleFork_in_entryRuleFork611 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleFork618 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Fork__Group__0_in_ruleFork644 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleInvariant_in_entryRuleInvariant673 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleInvariant680 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Invariant__Group__0_in_ruleInvariant706 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleState_in_rule__AbstractNode__Alternatives742 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleInitial_in_rule__AbstractNode__Alternatives759 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleFinal_in_rule__AbstractNode__Alternatives776 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAny_in_rule__AbstractNode__Alternatives793 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleJunction_in_rule__AbstractNode__Alternatives810 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleFork_in_rule__AbstractNode__Alternatives827 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_STRING_in_rule__EString__Alternatives860 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_rule__EString__Alternatives877 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Statemachine__Group__0__Impl_in_rule__Statemachine__Group__0907 = new BitSet(new long[]{0x0000000000000800L});
        public static final BitSet FOLLOW_rule__Statemachine__Group__1_in_rule__Statemachine__Group__0910 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Statemachine__LocalGeneratedAssignment_0_in_rule__Statemachine__Group__0__Impl937 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Statemachine__Group__1__Impl_in_rule__Statemachine__Group__1968 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__Statemachine__Group__2_in_rule__Statemachine__Group__1971 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_11_in_rule__Statemachine__Group__1__Impl999 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Statemachine__Group__2__Impl_in_rule__Statemachine__Group__21030 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_rule__Statemachine__Group__3_in_rule__Statemachine__Group__21033 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Statemachine__NameAssignment_2_in_rule__Statemachine__Group__2__Impl1060 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Statemachine__Group__3__Impl_in_rule__Statemachine__Group__31090 = new BitSet(new long[]{0x000000000005E000L});
        public static final BitSet FOLLOW_rule__Statemachine__Group__4_in_rule__Statemachine__Group__31093 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_12_in_rule__Statemachine__Group__3__Impl1121 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Statemachine__Group__4__Impl_in_rule__Statemachine__Group__41152 = new BitSet(new long[]{0x000000000005E000L});
        public static final BitSet FOLLOW_rule__Statemachine__Group__5_in_rule__Statemachine__Group__41155 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Statemachine__Group_4__0_in_rule__Statemachine__Group__4__Impl1182 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Statemachine__Group__5__Impl_in_rule__Statemachine__Group__51213 = new BitSet(new long[]{0x000000000005E000L});
        public static final BitSet FOLLOW_rule__Statemachine__Group__6_in_rule__Statemachine__Group__51216 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Statemachine__Group_5__0_in_rule__Statemachine__Group__5__Impl1243 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Statemachine__Group__6__Impl_in_rule__Statemachine__Group__61274 = new BitSet(new long[]{0x000000000005E000L});
        public static final BitSet FOLLOW_rule__Statemachine__Group__7_in_rule__Statemachine__Group__61277 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Statemachine__Group_6__0_in_rule__Statemachine__Group__6__Impl1304 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Statemachine__Group__7__Impl_in_rule__Statemachine__Group__71335 = new BitSet(new long[]{0x000000000005E000L});
        public static final BitSet FOLLOW_rule__Statemachine__Group__8_in_rule__Statemachine__Group__71338 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Statemachine__Group_7__0_in_rule__Statemachine__Group__7__Impl1365 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Statemachine__Group__8__Impl_in_rule__Statemachine__Group__81396 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_13_in_rule__Statemachine__Group__8__Impl1424 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Statemachine__Group_4__0__Impl_in_rule__Statemachine__Group_4__01473 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__Statemachine__Group_4__1_in_rule__Statemachine__Group_4__01476 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_14_in_rule__Statemachine__Group_4__0__Impl1504 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Statemachine__Group_4__1__Impl_in_rule__Statemachine__Group_4__11535 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Statemachine__CommentAssignment_4_1_in_rule__Statemachine__Group_4__1__Impl1562 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Statemachine__Group_5__0__Impl_in_rule__Statemachine__Group_5__01596 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__Statemachine__Group_5__1_in_rule__Statemachine__Group_5__01599 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_15_in_rule__Statemachine__Group_5__0__Impl1627 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Statemachine__Group_5__1__Impl_in_rule__Statemachine__Group_5__11658 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Statemachine__RefinesAssignment_5_1_in_rule__Statemachine__Group_5__1__Impl1685 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Statemachine__Group_6__0__Impl_in_rule__Statemachine__Group_6__01719 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_rule__Statemachine__Group_6__1_in_rule__Statemachine__Group_6__01722 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_16_in_rule__Statemachine__Group_6__0__Impl1750 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Statemachine__Group_6__1__Impl_in_rule__Statemachine__Group_6__11781 = new BitSet(new long[]{0x0000004F40080000L});
        public static final BitSet FOLLOW_rule__Statemachine__Group_6__2_in_rule__Statemachine__Group_6__11784 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_12_in_rule__Statemachine__Group_6__1__Impl1812 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Statemachine__Group_6__2__Impl_in_rule__Statemachine__Group_6__21843 = new BitSet(new long[]{0x0000000000022000L});
        public static final BitSet FOLLOW_rule__Statemachine__Group_6__3_in_rule__Statemachine__Group_6__21846 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Statemachine__NodesAssignment_6_2_in_rule__Statemachine__Group_6__2__Impl1873 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Statemachine__Group_6__3__Impl_in_rule__Statemachine__Group_6__31903 = new BitSet(new long[]{0x0000000000022000L});
        public static final BitSet FOLLOW_rule__Statemachine__Group_6__4_in_rule__Statemachine__Group_6__31906 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Statemachine__Group_6_3__0_in_rule__Statemachine__Group_6__3__Impl1933 = new BitSet(new long[]{0x0000000000020002L});
        public static final BitSet FOLLOW_rule__Statemachine__Group_6__4__Impl_in_rule__Statemachine__Group_6__41964 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_13_in_rule__Statemachine__Group_6__4__Impl1992 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Statemachine__Group_6_3__0__Impl_in_rule__Statemachine__Group_6_3__02033 = new BitSet(new long[]{0x0000004F40080000L});
        public static final BitSet FOLLOW_rule__Statemachine__Group_6_3__1_in_rule__Statemachine__Group_6_3__02036 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_17_in_rule__Statemachine__Group_6_3__0__Impl2064 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Statemachine__Group_6_3__1__Impl_in_rule__Statemachine__Group_6_3__12095 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Statemachine__NodesAssignment_6_3_1_in_rule__Statemachine__Group_6_3__1__Impl2122 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Statemachine__Group_7__0__Impl_in_rule__Statemachine__Group_7__02156 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_rule__Statemachine__Group_7__1_in_rule__Statemachine__Group_7__02159 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_18_in_rule__Statemachine__Group_7__0__Impl2187 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Statemachine__Group_7__1__Impl_in_rule__Statemachine__Group_7__12218 = new BitSet(new long[]{0x000000C000000000L});
        public static final BitSet FOLLOW_rule__Statemachine__Group_7__2_in_rule__Statemachine__Group_7__12221 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_12_in_rule__Statemachine__Group_7__1__Impl2249 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Statemachine__Group_7__2__Impl_in_rule__Statemachine__Group_7__22280 = new BitSet(new long[]{0x0000000000022000L});
        public static final BitSet FOLLOW_rule__Statemachine__Group_7__3_in_rule__Statemachine__Group_7__22283 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Statemachine__TransitionsAssignment_7_2_in_rule__Statemachine__Group_7__2__Impl2310 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Statemachine__Group_7__3__Impl_in_rule__Statemachine__Group_7__32340 = new BitSet(new long[]{0x0000000000022000L});
        public static final BitSet FOLLOW_rule__Statemachine__Group_7__4_in_rule__Statemachine__Group_7__32343 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Statemachine__Group_7_3__0_in_rule__Statemachine__Group_7__3__Impl2370 = new BitSet(new long[]{0x0000000000020002L});
        public static final BitSet FOLLOW_rule__Statemachine__Group_7__4__Impl_in_rule__Statemachine__Group_7__42401 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_13_in_rule__Statemachine__Group_7__4__Impl2429 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Statemachine__Group_7_3__0__Impl_in_rule__Statemachine__Group_7_3__02470 = new BitSet(new long[]{0x000000C000000000L});
        public static final BitSet FOLLOW_rule__Statemachine__Group_7_3__1_in_rule__Statemachine__Group_7_3__02473 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_17_in_rule__Statemachine__Group_7_3__0__Impl2501 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Statemachine__Group_7_3__1__Impl_in_rule__Statemachine__Group_7_3__12532 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Statemachine__TransitionsAssignment_7_3_1_in_rule__Statemachine__Group_7_3__1__Impl2559 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__State__Group__0__Impl_in_rule__State__Group__02593 = new BitSet(new long[]{0x0000004000080000L});
        public static final BitSet FOLLOW_rule__State__Group__1_in_rule__State__Group__02596 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__State__Group__1__Impl_in_rule__State__Group__12654 = new BitSet(new long[]{0x0000004000080000L});
        public static final BitSet FOLLOW_rule__State__Group__2_in_rule__State__Group__12657 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__State__LocalGeneratedAssignment_1_in_rule__State__Group__1__Impl2684 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__State__Group__2__Impl_in_rule__State__Group__22715 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__State__Group__3_in_rule__State__Group__22718 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_19_in_rule__State__Group__2__Impl2746 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__State__Group__3__Impl_in_rule__State__Group__32777 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_rule__State__Group__4_in_rule__State__Group__32780 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__State__NameAssignment_3_in_rule__State__Group__3__Impl2807 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__State__Group__4__Impl_in_rule__State__Group__42837 = new BitSet(new long[]{0x000000000390A000L});
        public static final BitSet FOLLOW_rule__State__Group__5_in_rule__State__Group__42840 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_12_in_rule__State__Group__4__Impl2868 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__State__Group__5__Impl_in_rule__State__Group__52899 = new BitSet(new long[]{0x000000000390A000L});
        public static final BitSet FOLLOW_rule__State__Group__6_in_rule__State__Group__52902 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__State__Group_5__0_in_rule__State__Group__5__Impl2929 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__State__Group__6__Impl_in_rule__State__Group__62960 = new BitSet(new long[]{0x000000000390A000L});
        public static final BitSet FOLLOW_rule__State__Group__7_in_rule__State__Group__62963 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__State__Group_6__0_in_rule__State__Group__6__Impl2990 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__State__Group__7__Impl_in_rule__State__Group__73021 = new BitSet(new long[]{0x000000000390A000L});
        public static final BitSet FOLLOW_rule__State__Group__8_in_rule__State__Group__73024 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__State__Group_7__0_in_rule__State__Group__7__Impl3051 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__State__Group__8__Impl_in_rule__State__Group__83082 = new BitSet(new long[]{0x000000000390A000L});
        public static final BitSet FOLLOW_rule__State__Group__9_in_rule__State__Group__83085 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__State__Group_8__0_in_rule__State__Group__8__Impl3112 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__State__Group__9__Impl_in_rule__State__Group__93143 = new BitSet(new long[]{0x000000000390A000L});
        public static final BitSet FOLLOW_rule__State__Group__10_in_rule__State__Group__93146 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__State__Group_9__0_in_rule__State__Group__9__Impl3173 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__State__Group__10__Impl_in_rule__State__Group__103204 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_13_in_rule__State__Group__10__Impl3232 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__State__Group_5__0__Impl_in_rule__State__Group_5__03285 = new BitSet(new long[]{0x0000000000200000L});
        public static final BitSet FOLLOW_rule__State__Group_5__1_in_rule__State__Group_5__03288 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_20_in_rule__State__Group_5__0__Impl3316 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__State__Group_5__1__Impl_in_rule__State__Group_5__13347 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__State__Group_5__2_in_rule__State__Group_5__13350 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_21_in_rule__State__Group_5__1__Impl3378 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__State__Group_5__2__Impl_in_rule__State__Group_5__23409 = new BitSet(new long[]{0x0000000000420000L});
        public static final BitSet FOLLOW_rule__State__Group_5__3_in_rule__State__Group_5__23412 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__State__IncomingAssignment_5_2_in_rule__State__Group_5__2__Impl3439 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__State__Group_5__3__Impl_in_rule__State__Group_5__33469 = new BitSet(new long[]{0x0000000000420000L});
        public static final BitSet FOLLOW_rule__State__Group_5__4_in_rule__State__Group_5__33472 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__State__Group_5_3__0_in_rule__State__Group_5__3__Impl3499 = new BitSet(new long[]{0x0000000000020002L});
        public static final BitSet FOLLOW_rule__State__Group_5__4__Impl_in_rule__State__Group_5__43530 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_22_in_rule__State__Group_5__4__Impl3558 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__State__Group_5_3__0__Impl_in_rule__State__Group_5_3__03599 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__State__Group_5_3__1_in_rule__State__Group_5_3__03602 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_17_in_rule__State__Group_5_3__0__Impl3630 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__State__Group_5_3__1__Impl_in_rule__State__Group_5_3__13661 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__State__IncomingAssignment_5_3_1_in_rule__State__Group_5_3__1__Impl3688 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__State__Group_6__0__Impl_in_rule__State__Group_6__03722 = new BitSet(new long[]{0x0000000000200000L});
        public static final BitSet FOLLOW_rule__State__Group_6__1_in_rule__State__Group_6__03725 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_23_in_rule__State__Group_6__0__Impl3753 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__State__Group_6__1__Impl_in_rule__State__Group_6__13784 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__State__Group_6__2_in_rule__State__Group_6__13787 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_21_in_rule__State__Group_6__1__Impl3815 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__State__Group_6__2__Impl_in_rule__State__Group_6__23846 = new BitSet(new long[]{0x0000000000420000L});
        public static final BitSet FOLLOW_rule__State__Group_6__3_in_rule__State__Group_6__23849 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__State__OutgoingAssignment_6_2_in_rule__State__Group_6__2__Impl3876 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__State__Group_6__3__Impl_in_rule__State__Group_6__33906 = new BitSet(new long[]{0x0000000000420000L});
        public static final BitSet FOLLOW_rule__State__Group_6__4_in_rule__State__Group_6__33909 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__State__Group_6_3__0_in_rule__State__Group_6__3__Impl3936 = new BitSet(new long[]{0x0000000000020002L});
        public static final BitSet FOLLOW_rule__State__Group_6__4__Impl_in_rule__State__Group_6__43967 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_22_in_rule__State__Group_6__4__Impl3995 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__State__Group_6_3__0__Impl_in_rule__State__Group_6_3__04036 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__State__Group_6_3__1_in_rule__State__Group_6_3__04039 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_17_in_rule__State__Group_6_3__0__Impl4067 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__State__Group_6_3__1__Impl_in_rule__State__Group_6_3__14098 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__State__OutgoingAssignment_6_3_1_in_rule__State__Group_6_3__1__Impl4125 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__State__Group_7__0__Impl_in_rule__State__Group_7__04159 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__State__Group_7__1_in_rule__State__Group_7__04162 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_15_in_rule__State__Group_7__0__Impl4190 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__State__Group_7__1__Impl_in_rule__State__Group_7__14221 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__State__RefinesAssignment_7_1_in_rule__State__Group_7__1__Impl4248 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__State__Group_8__0__Impl_in_rule__State__Group_8__04282 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_rule__State__Group_8__1_in_rule__State__Group_8__04285 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_24_in_rule__State__Group_8__0__Impl4313 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__State__Group_8__1__Impl_in_rule__State__Group_8__14344 = new BitSet(new long[]{0x0000004000000800L});
        public static final BitSet FOLLOW_rule__State__Group_8__2_in_rule__State__Group_8__14347 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_12_in_rule__State__Group_8__1__Impl4375 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__State__Group_8__2__Impl_in_rule__State__Group_8__24406 = new BitSet(new long[]{0x0000000000022000L});
        public static final BitSet FOLLOW_rule__State__Group_8__3_in_rule__State__Group_8__24409 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__State__StatemachinesAssignment_8_2_in_rule__State__Group_8__2__Impl4436 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__State__Group_8__3__Impl_in_rule__State__Group_8__34466 = new BitSet(new long[]{0x0000000000022000L});
        public static final BitSet FOLLOW_rule__State__Group_8__4_in_rule__State__Group_8__34469 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__State__Group_8_3__0_in_rule__State__Group_8__3__Impl4496 = new BitSet(new long[]{0x0000000000020002L});
        public static final BitSet FOLLOW_rule__State__Group_8__4__Impl_in_rule__State__Group_8__44527 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_13_in_rule__State__Group_8__4__Impl4555 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__State__Group_8_3__0__Impl_in_rule__State__Group_8_3__04596 = new BitSet(new long[]{0x0000004000000800L});
        public static final BitSet FOLLOW_rule__State__Group_8_3__1_in_rule__State__Group_8_3__04599 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_17_in_rule__State__Group_8_3__0__Impl4627 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__State__Group_8_3__1__Impl_in_rule__State__Group_8_3__14658 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__State__StatemachinesAssignment_8_3_1_in_rule__State__Group_8_3__1__Impl4685 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__State__Group_9__0__Impl_in_rule__State__Group_9__04719 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_rule__State__Group_9__1_in_rule__State__Group_9__04722 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_25_in_rule__State__Group_9__0__Impl4750 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__State__Group_9__1__Impl_in_rule__State__Group_9__14781 = new BitSet(new long[]{0x0000014000000000L});
        public static final BitSet FOLLOW_rule__State__Group_9__2_in_rule__State__Group_9__14784 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_12_in_rule__State__Group_9__1__Impl4812 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__State__Group_9__2__Impl_in_rule__State__Group_9__24843 = new BitSet(new long[]{0x0000000000022000L});
        public static final BitSet FOLLOW_rule__State__Group_9__3_in_rule__State__Group_9__24846 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__State__InvariantsAssignment_9_2_in_rule__State__Group_9__2__Impl4873 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__State__Group_9__3__Impl_in_rule__State__Group_9__34903 = new BitSet(new long[]{0x0000000000022000L});
        public static final BitSet FOLLOW_rule__State__Group_9__4_in_rule__State__Group_9__34906 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__State__Group_9_3__0_in_rule__State__Group_9__3__Impl4933 = new BitSet(new long[]{0x0000000000020002L});
        public static final BitSet FOLLOW_rule__State__Group_9__4__Impl_in_rule__State__Group_9__44964 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_13_in_rule__State__Group_9__4__Impl4992 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__State__Group_9_3__0__Impl_in_rule__State__Group_9_3__05033 = new BitSet(new long[]{0x0000014000000000L});
        public static final BitSet FOLLOW_rule__State__Group_9_3__1_in_rule__State__Group_9_3__05036 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_17_in_rule__State__Group_9_3__0__Impl5064 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__State__Group_9_3__1__Impl_in_rule__State__Group_9_3__15095 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__State__InvariantsAssignment_9_3_1_in_rule__State__Group_9_3__1__Impl5122 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Transition__Group__0__Impl_in_rule__Transition__Group__05156 = new BitSet(new long[]{0x000000C000000000L});
        public static final BitSet FOLLOW_rule__Transition__Group__1_in_rule__Transition__Group__05159 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Transition__LocalGeneratedAssignment_0_in_rule__Transition__Group__0__Impl5186 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Transition__Group__1__Impl_in_rule__Transition__Group__15217 = new BitSet(new long[]{0x0000000004000000L});
        public static final BitSet FOLLOW_rule__Transition__Group__2_in_rule__Transition__Group__15220 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Transition__ExtendedAssignment_1_in_rule__Transition__Group__1__Impl5247 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Transition__Group__2__Impl_in_rule__Transition__Group__25277 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_rule__Transition__Group__3_in_rule__Transition__Group__25280 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_26_in_rule__Transition__Group__2__Impl5308 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Transition__Group__3__Impl_in_rule__Transition__Group__35339 = new BitSet(new long[]{0x0000000028004000L});
        public static final BitSet FOLLOW_rule__Transition__Group__4_in_rule__Transition__Group__35342 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_12_in_rule__Transition__Group__3__Impl5370 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Transition__Group__4__Impl_in_rule__Transition__Group__45401 = new BitSet(new long[]{0x0000000028004000L});
        public static final BitSet FOLLOW_rule__Transition__Group__5_in_rule__Transition__Group__45404 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Transition__Group_4__0_in_rule__Transition__Group__4__Impl5431 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Transition__Group__5__Impl_in_rule__Transition__Group__55462 = new BitSet(new long[]{0x0000000028004000L});
        public static final BitSet FOLLOW_rule__Transition__Group__6_in_rule__Transition__Group__55465 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Transition__Group_5__0_in_rule__Transition__Group__5__Impl5492 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Transition__Group__6__Impl_in_rule__Transition__Group__65523 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__Transition__Group__7_in_rule__Transition__Group__65526 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_27_in_rule__Transition__Group__6__Impl5554 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Transition__Group__7__Impl_in_rule__Transition__Group__75585 = new BitSet(new long[]{0x0000000010000000L});
        public static final BitSet FOLLOW_rule__Transition__Group__8_in_rule__Transition__Group__75588 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Transition__TargetAssignment_7_in_rule__Transition__Group__7__Impl5615 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Transition__Group__8__Impl_in_rule__Transition__Group__85645 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__Transition__Group__9_in_rule__Transition__Group__85648 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_28_in_rule__Transition__Group__8__Impl5676 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Transition__Group__9__Impl_in_rule__Transition__Group__95707 = new BitSet(new long[]{0x0000000000002000L});
        public static final BitSet FOLLOW_rule__Transition__Group__10_in_rule__Transition__Group__95710 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Transition__SourceAssignment_9_in_rule__Transition__Group__9__Impl5737 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Transition__Group__10__Impl_in_rule__Transition__Group__105767 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_13_in_rule__Transition__Group__10__Impl5795 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Transition__Group_4__0__Impl_in_rule__Transition__Group_4__05848 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__Transition__Group_4__1_in_rule__Transition__Group_4__05851 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_14_in_rule__Transition__Group_4__0__Impl5879 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Transition__Group_4__1__Impl_in_rule__Transition__Group_4__15910 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Transition__CommentAssignment_4_1_in_rule__Transition__Group_4__1__Impl5937 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Transition__Group_5__0__Impl_in_rule__Transition__Group_5__05971 = new BitSet(new long[]{0x0000000000200000L});
        public static final BitSet FOLLOW_rule__Transition__Group_5__1_in_rule__Transition__Group_5__05974 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_29_in_rule__Transition__Group_5__0__Impl6002 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Transition__Group_5__1__Impl_in_rule__Transition__Group_5__16033 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__Transition__Group_5__2_in_rule__Transition__Group_5__16036 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_21_in_rule__Transition__Group_5__1__Impl6064 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Transition__Group_5__2__Impl_in_rule__Transition__Group_5__26095 = new BitSet(new long[]{0x0000000000420000L});
        public static final BitSet FOLLOW_rule__Transition__Group_5__3_in_rule__Transition__Group_5__26098 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Transition__ElaboratesAssignment_5_2_in_rule__Transition__Group_5__2__Impl6125 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Transition__Group_5__3__Impl_in_rule__Transition__Group_5__36155 = new BitSet(new long[]{0x0000000000420000L});
        public static final BitSet FOLLOW_rule__Transition__Group_5__4_in_rule__Transition__Group_5__36158 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Transition__Group_5_3__0_in_rule__Transition__Group_5__3__Impl6185 = new BitSet(new long[]{0x0000000000020002L});
        public static final BitSet FOLLOW_rule__Transition__Group_5__4__Impl_in_rule__Transition__Group_5__46216 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_22_in_rule__Transition__Group_5__4__Impl6244 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Transition__Group_5_3__0__Impl_in_rule__Transition__Group_5_3__06285 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__Transition__Group_5_3__1_in_rule__Transition__Group_5_3__06288 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_17_in_rule__Transition__Group_5_3__0__Impl6316 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Transition__Group_5_3__1__Impl_in_rule__Transition__Group_5_3__16347 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Transition__ElaboratesAssignment_5_3_1_in_rule__Transition__Group_5_3__1__Impl6374 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Initial__Group__0__Impl_in_rule__Initial__Group__06412 = new BitSet(new long[]{0x0000004040000000L});
        public static final BitSet FOLLOW_rule__Initial__Group__1_in_rule__Initial__Group__06415 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Initial__Group__1__Impl_in_rule__Initial__Group__16473 = new BitSet(new long[]{0x0000004040000000L});
        public static final BitSet FOLLOW_rule__Initial__Group__2_in_rule__Initial__Group__16476 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Initial__LocalGeneratedAssignment_1_in_rule__Initial__Group__1__Impl6503 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Initial__Group__2__Impl_in_rule__Initial__Group__26534 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_rule__Initial__Group__3_in_rule__Initial__Group__26537 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_30_in_rule__Initial__Group__2__Impl6565 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Initial__Group__3__Impl_in_rule__Initial__Group__36596 = new BitSet(new long[]{0x0000000080002000L});
        public static final BitSet FOLLOW_rule__Initial__Group__4_in_rule__Initial__Group__36599 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_12_in_rule__Initial__Group__3__Impl6627 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Initial__Group__4__Impl_in_rule__Initial__Group__46658 = new BitSet(new long[]{0x0000000080002000L});
        public static final BitSet FOLLOW_rule__Initial__Group__5_in_rule__Initial__Group__46661 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Initial__Group_4__0_in_rule__Initial__Group__4__Impl6688 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Initial__Group__5__Impl_in_rule__Initial__Group__56719 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_13_in_rule__Initial__Group__5__Impl6747 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Initial__Group_4__0__Impl_in_rule__Initial__Group_4__06790 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__Initial__Group_4__1_in_rule__Initial__Group_4__06793 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_31_in_rule__Initial__Group_4__0__Impl6821 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Initial__Group_4__1__Impl_in_rule__Initial__Group_4__16852 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Initial__InternalIdAssignment_4_1_in_rule__Initial__Group_4__1__Impl6879 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Final__Group__0__Impl_in_rule__Final__Group__06913 = new BitSet(new long[]{0x0000004100000000L});
        public static final BitSet FOLLOW_rule__Final__Group__1_in_rule__Final__Group__06916 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Final__Group__1__Impl_in_rule__Final__Group__16974 = new BitSet(new long[]{0x0000004100000000L});
        public static final BitSet FOLLOW_rule__Final__Group__2_in_rule__Final__Group__16977 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Final__LocalGeneratedAssignment_1_in_rule__Final__Group__1__Impl7004 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Final__Group__2__Impl_in_rule__Final__Group__27035 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_rule__Final__Group__3_in_rule__Final__Group__27038 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_32_in_rule__Final__Group__2__Impl7066 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Final__Group__3__Impl_in_rule__Final__Group__37097 = new BitSet(new long[]{0x0000000080002000L});
        public static final BitSet FOLLOW_rule__Final__Group__4_in_rule__Final__Group__37100 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_12_in_rule__Final__Group__3__Impl7128 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Final__Group__4__Impl_in_rule__Final__Group__47159 = new BitSet(new long[]{0x0000000080002000L});
        public static final BitSet FOLLOW_rule__Final__Group__5_in_rule__Final__Group__47162 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Final__Group_4__0_in_rule__Final__Group__4__Impl7189 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Final__Group__5__Impl_in_rule__Final__Group__57220 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_13_in_rule__Final__Group__5__Impl7248 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Final__Group_4__0__Impl_in_rule__Final__Group_4__07291 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__Final__Group_4__1_in_rule__Final__Group_4__07294 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_31_in_rule__Final__Group_4__0__Impl7322 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Final__Group_4__1__Impl_in_rule__Final__Group_4__17353 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Final__InternalIdAssignment_4_1_in_rule__Final__Group_4__1__Impl7380 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Any__Group__0__Impl_in_rule__Any__Group__07414 = new BitSet(new long[]{0x0000004200000000L});
        public static final BitSet FOLLOW_rule__Any__Group__1_in_rule__Any__Group__07417 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Any__Group__1__Impl_in_rule__Any__Group__17475 = new BitSet(new long[]{0x0000004200000000L});
        public static final BitSet FOLLOW_rule__Any__Group__2_in_rule__Any__Group__17478 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Any__LocalGeneratedAssignment_1_in_rule__Any__Group__1__Impl7505 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Any__Group__2__Impl_in_rule__Any__Group__27536 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_rule__Any__Group__3_in_rule__Any__Group__27539 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_33_in_rule__Any__Group__2__Impl7567 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Any__Group__3__Impl_in_rule__Any__Group__37598 = new BitSet(new long[]{0x0000000080002000L});
        public static final BitSet FOLLOW_rule__Any__Group__4_in_rule__Any__Group__37601 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_12_in_rule__Any__Group__3__Impl7629 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Any__Group__4__Impl_in_rule__Any__Group__47660 = new BitSet(new long[]{0x0000000080002000L});
        public static final BitSet FOLLOW_rule__Any__Group__5_in_rule__Any__Group__47663 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Any__Group_4__0_in_rule__Any__Group__4__Impl7690 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Any__Group__5__Impl_in_rule__Any__Group__57721 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_13_in_rule__Any__Group__5__Impl7749 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Any__Group_4__0__Impl_in_rule__Any__Group_4__07792 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__Any__Group_4__1_in_rule__Any__Group_4__07795 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_31_in_rule__Any__Group_4__0__Impl7823 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Any__Group_4__1__Impl_in_rule__Any__Group_4__17854 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Any__InternalIdAssignment_4_1_in_rule__Any__Group_4__1__Impl7881 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Junction__Group__0__Impl_in_rule__Junction__Group__07915 = new BitSet(new long[]{0x0000004400000000L});
        public static final BitSet FOLLOW_rule__Junction__Group__1_in_rule__Junction__Group__07918 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Junction__Group__1__Impl_in_rule__Junction__Group__17976 = new BitSet(new long[]{0x0000004400000000L});
        public static final BitSet FOLLOW_rule__Junction__Group__2_in_rule__Junction__Group__17979 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Junction__LocalGeneratedAssignment_1_in_rule__Junction__Group__1__Impl8006 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Junction__Group__2__Impl_in_rule__Junction__Group__28037 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_rule__Junction__Group__3_in_rule__Junction__Group__28040 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_34_in_rule__Junction__Group__2__Impl8068 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Junction__Group__3__Impl_in_rule__Junction__Group__38099 = new BitSet(new long[]{0x0000000080002000L});
        public static final BitSet FOLLOW_rule__Junction__Group__4_in_rule__Junction__Group__38102 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_12_in_rule__Junction__Group__3__Impl8130 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Junction__Group__4__Impl_in_rule__Junction__Group__48161 = new BitSet(new long[]{0x0000000080002000L});
        public static final BitSet FOLLOW_rule__Junction__Group__5_in_rule__Junction__Group__48164 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Junction__Group_4__0_in_rule__Junction__Group__4__Impl8191 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Junction__Group__5__Impl_in_rule__Junction__Group__58222 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_13_in_rule__Junction__Group__5__Impl8250 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Junction__Group_4__0__Impl_in_rule__Junction__Group_4__08293 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__Junction__Group_4__1_in_rule__Junction__Group_4__08296 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_31_in_rule__Junction__Group_4__0__Impl8324 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Junction__Group_4__1__Impl_in_rule__Junction__Group_4__18355 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Junction__InternalIdAssignment_4_1_in_rule__Junction__Group_4__1__Impl8382 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Fork__Group__0__Impl_in_rule__Fork__Group__08416 = new BitSet(new long[]{0x0000004F40080000L});
        public static final BitSet FOLLOW_rule__Fork__Group__1_in_rule__Fork__Group__08419 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Fork__Group__1__Impl_in_rule__Fork__Group__18477 = new BitSet(new long[]{0x0000004F40080000L});
        public static final BitSet FOLLOW_rule__Fork__Group__2_in_rule__Fork__Group__18480 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Fork__LocalGeneratedAssignment_1_in_rule__Fork__Group__1__Impl8507 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Fork__Group__2__Impl_in_rule__Fork__Group__28538 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_rule__Fork__Group__3_in_rule__Fork__Group__28541 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_35_in_rule__Fork__Group__2__Impl8569 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Fork__Group__3__Impl_in_rule__Fork__Group__38600 = new BitSet(new long[]{0x0000000080002000L});
        public static final BitSet FOLLOW_rule__Fork__Group__4_in_rule__Fork__Group__38603 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_12_in_rule__Fork__Group__3__Impl8631 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Fork__Group__4__Impl_in_rule__Fork__Group__48662 = new BitSet(new long[]{0x0000000080002000L});
        public static final BitSet FOLLOW_rule__Fork__Group__5_in_rule__Fork__Group__48665 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Fork__Group_4__0_in_rule__Fork__Group__4__Impl8692 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Fork__Group__5__Impl_in_rule__Fork__Group__58723 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_13_in_rule__Fork__Group__5__Impl8751 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Fork__Group_4__0__Impl_in_rule__Fork__Group_4__08794 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__Fork__Group_4__1_in_rule__Fork__Group_4__08797 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_31_in_rule__Fork__Group_4__0__Impl8825 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Fork__Group_4__1__Impl_in_rule__Fork__Group_4__18856 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Fork__InternalIdAssignment_4_1_in_rule__Fork__Group_4__1__Impl8883 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Invariant__Group__0__Impl_in_rule__Invariant__Group__08918 = new BitSet(new long[]{0x0000014000000000L});
        public static final BitSet FOLLOW_rule__Invariant__Group__1_in_rule__Invariant__Group__08921 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Invariant__LocalGeneratedAssignment_0_in_rule__Invariant__Group__0__Impl8948 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Invariant__Group__1__Impl_in_rule__Invariant__Group__18979 = new BitSet(new long[]{0x0000001000000000L});
        public static final BitSet FOLLOW_rule__Invariant__Group__2_in_rule__Invariant__Group__18982 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Invariant__TheoremAssignment_1_in_rule__Invariant__Group__1__Impl9009 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Invariant__Group__2__Impl_in_rule__Invariant__Group__29039 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__Invariant__Group__3_in_rule__Invariant__Group__29042 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_36_in_rule__Invariant__Group__2__Impl9070 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Invariant__Group__3__Impl_in_rule__Invariant__Group__39101 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_rule__Invariant__Group__4_in_rule__Invariant__Group__39104 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Invariant__NameAssignment_3_in_rule__Invariant__Group__3__Impl9131 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Invariant__Group__4__Impl_in_rule__Invariant__Group__49161 = new BitSet(new long[]{0x0000002080004000L});
        public static final BitSet FOLLOW_rule__Invariant__Group__5_in_rule__Invariant__Group__49164 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_12_in_rule__Invariant__Group__4__Impl9192 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Invariant__Group__5__Impl_in_rule__Invariant__Group__59223 = new BitSet(new long[]{0x0000002080004000L});
        public static final BitSet FOLLOW_rule__Invariant__Group__6_in_rule__Invariant__Group__59226 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Invariant__Group_5__0_in_rule__Invariant__Group__5__Impl9253 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Invariant__Group__6__Impl_in_rule__Invariant__Group__69284 = new BitSet(new long[]{0x0000002080004000L});
        public static final BitSet FOLLOW_rule__Invariant__Group__7_in_rule__Invariant__Group__69287 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Invariant__Group_6__0_in_rule__Invariant__Group__6__Impl9314 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Invariant__Group__7__Impl_in_rule__Invariant__Group__79345 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__Invariant__Group__8_in_rule__Invariant__Group__79348 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_37_in_rule__Invariant__Group__7__Impl9376 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Invariant__Group__8__Impl_in_rule__Invariant__Group__89407 = new BitSet(new long[]{0x0000000000002000L});
        public static final BitSet FOLLOW_rule__Invariant__Group__9_in_rule__Invariant__Group__89410 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Invariant__PredicateAssignment_8_in_rule__Invariant__Group__8__Impl9437 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Invariant__Group__9__Impl_in_rule__Invariant__Group__99467 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_13_in_rule__Invariant__Group__9__Impl9495 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Invariant__Group_5__0__Impl_in_rule__Invariant__Group_5__09546 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__Invariant__Group_5__1_in_rule__Invariant__Group_5__09549 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_31_in_rule__Invariant__Group_5__0__Impl9577 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Invariant__Group_5__1__Impl_in_rule__Invariant__Group_5__19608 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Invariant__InternalIdAssignment_5_1_in_rule__Invariant__Group_5__1__Impl9635 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Invariant__Group_6__0__Impl_in_rule__Invariant__Group_6__09669 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__Invariant__Group_6__1_in_rule__Invariant__Group_6__09672 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_14_in_rule__Invariant__Group_6__0__Impl9700 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Invariant__Group_6__1__Impl_in_rule__Invariant__Group_6__19731 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Invariant__CommentAssignment_6_1_in_rule__Invariant__Group_6__1__Impl9758 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_38_in_rule__Statemachine__LocalGeneratedAssignment_09802 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__Statemachine__NameAssignment_29841 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__Statemachine__CommentAssignment_4_19872 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__Statemachine__RefinesAssignment_5_19907 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAbstractNode_in_rule__Statemachine__NodesAssignment_6_29942 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAbstractNode_in_rule__Statemachine__NodesAssignment_6_3_19973 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleTransition_in_rule__Statemachine__TransitionsAssignment_7_210004 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleTransition_in_rule__Statemachine__TransitionsAssignment_7_3_110035 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_38_in_rule__State__LocalGeneratedAssignment_110071 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__State__NameAssignment_310110 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__State__IncomingAssignment_5_210145 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__State__IncomingAssignment_5_3_110184 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__State__OutgoingAssignment_6_210223 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__State__OutgoingAssignment_6_3_110262 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__State__RefinesAssignment_7_110301 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleStatemachine_in_rule__State__StatemachinesAssignment_8_210336 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleStatemachine_in_rule__State__StatemachinesAssignment_8_3_110367 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleInvariant_in_rule__State__InvariantsAssignment_9_210398 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleInvariant_in_rule__State__InvariantsAssignment_9_3_110429 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_38_in_rule__Transition__LocalGeneratedAssignment_010465 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_39_in_rule__Transition__ExtendedAssignment_110509 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__Transition__CommentAssignment_4_110548 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__Transition__ElaboratesAssignment_5_210583 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__Transition__ElaboratesAssignment_5_3_110622 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__Transition__TargetAssignment_710661 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__Transition__SourceAssignment_910700 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_38_in_rule__Initial__LocalGeneratedAssignment_110742 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__Initial__InternalIdAssignment_4_110781 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_38_in_rule__Final__LocalGeneratedAssignment_110817 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__Final__InternalIdAssignment_4_110856 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_38_in_rule__Any__LocalGeneratedAssignment_110892 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__Any__InternalIdAssignment_4_110931 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_38_in_rule__Junction__LocalGeneratedAssignment_110967 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__Junction__InternalIdAssignment_4_111006 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_38_in_rule__Fork__LocalGeneratedAssignment_111042 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__Fork__InternalIdAssignment_4_111081 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_38_in_rule__Invariant__LocalGeneratedAssignment_011120 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_40_in_rule__Invariant__TheoremAssignment_111164 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__Invariant__NameAssignment_311203 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__Invariant__InternalIdAssignment_5_111234 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__Invariant__CommentAssignment_6_111265 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__Invariant__PredicateAssignment_811296 = new BitSet(new long[]{0x0000000000000002L});
    }


}