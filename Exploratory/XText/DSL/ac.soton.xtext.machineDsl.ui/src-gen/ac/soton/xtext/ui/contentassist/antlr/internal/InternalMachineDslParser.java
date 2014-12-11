package ac.soton.xtext.ui.contentassist.antlr.internal; 

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
import ac.soton.xtext.services.MachineDslGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalMachineDslParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'ordinary'", "'convergent'", "'anticipated'", "'machine'", "'end'", "'//'", "'refines'", "','", "'sees'", "'('", "')'", "'variables'", "'invariants'", "'variant'", "'events'", "'@'", "'Variant'", "'expression'", "'event'", "'when'", "'any'", "'where'", "'witnesses'", "'then'", "'witness'", "'predicate'", "'theorem'", "'extended'", "'localGenerated'"
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


        public InternalMachineDslParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalMachineDslParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalMachineDslParser.tokenNames; }
    public String getGrammarFileName() { return "../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g"; }


     
     	private MachineDslGrammarAccess grammarAccess;
     	
        public void setGrammarAccess(MachineDslGrammarAccess grammarAccess) {
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




    // $ANTLR start "entryRuleMachine"
    // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:60:1: entryRuleMachine : ruleMachine EOF ;
    public final void entryRuleMachine() throws RecognitionException {
        try {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:61:1: ( ruleMachine EOF )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:62:1: ruleMachine EOF
            {
             before(grammarAccess.getMachineRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleMachine_in_entryRuleMachine61);
            ruleMachine();

            state._fsp--;

             after(grammarAccess.getMachineRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleMachine68); 

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
    // $ANTLR end "entryRuleMachine"


    // $ANTLR start "ruleMachine"
    // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:69:1: ruleMachine : ( ( rule__Machine__Group__0 ) ) ;
    public final void ruleMachine() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:73:2: ( ( ( rule__Machine__Group__0 ) ) )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:74:1: ( ( rule__Machine__Group__0 ) )
            {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:74:1: ( ( rule__Machine__Group__0 ) )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:75:1: ( rule__Machine__Group__0 )
            {
             before(grammarAccess.getMachineAccess().getGroup()); 
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:76:1: ( rule__Machine__Group__0 )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:76:2: rule__Machine__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__Machine__Group__0_in_ruleMachine94);
            rule__Machine__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getMachineAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleMachine"


    // $ANTLR start "entryRuleEString"
    // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:88:1: entryRuleEString : ruleEString EOF ;
    public final void entryRuleEString() throws RecognitionException {
        try {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:89:1: ( ruleEString EOF )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:90:1: ruleEString EOF
            {
             before(grammarAccess.getEStringRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_entryRuleEString121);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getEStringRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleEString128); 

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
    // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:97:1: ruleEString : ( ( rule__EString__Alternatives ) ) ;
    public final void ruleEString() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:101:2: ( ( ( rule__EString__Alternatives ) ) )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:102:1: ( ( rule__EString__Alternatives ) )
            {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:102:1: ( ( rule__EString__Alternatives ) )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:103:1: ( rule__EString__Alternatives )
            {
             before(grammarAccess.getEStringAccess().getAlternatives()); 
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:104:1: ( rule__EString__Alternatives )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:104:2: rule__EString__Alternatives
            {
            pushFollow(FollowSets000.FOLLOW_rule__EString__Alternatives_in_ruleEString154);
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


    // $ANTLR start "entryRuleVariable"
    // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:116:1: entryRuleVariable : ruleVariable EOF ;
    public final void entryRuleVariable() throws RecognitionException {
        try {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:117:1: ( ruleVariable EOF )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:118:1: ruleVariable EOF
            {
             before(grammarAccess.getVariableRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleVariable_in_entryRuleVariable181);
            ruleVariable();

            state._fsp--;

             after(grammarAccess.getVariableRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleVariable188); 

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
    // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:125:1: ruleVariable : ( ( rule__Variable__Group__0 ) ) ;
    public final void ruleVariable() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:129:2: ( ( ( rule__Variable__Group__0 ) ) )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:130:1: ( ( rule__Variable__Group__0 ) )
            {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:130:1: ( ( rule__Variable__Group__0 ) )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:131:1: ( rule__Variable__Group__0 )
            {
             before(grammarAccess.getVariableAccess().getGroup()); 
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:132:1: ( rule__Variable__Group__0 )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:132:2: rule__Variable__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__Variable__Group__0_in_ruleVariable214);
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


    // $ANTLR start "entryRuleInvariant"
    // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:144:1: entryRuleInvariant : ruleInvariant EOF ;
    public final void entryRuleInvariant() throws RecognitionException {
        try {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:145:1: ( ruleInvariant EOF )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:146:1: ruleInvariant EOF
            {
             before(grammarAccess.getInvariantRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleInvariant_in_entryRuleInvariant241);
            ruleInvariant();

            state._fsp--;

             after(grammarAccess.getInvariantRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleInvariant248); 

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
    // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:153:1: ruleInvariant : ( ( rule__Invariant__Group__0 ) ) ;
    public final void ruleInvariant() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:157:2: ( ( ( rule__Invariant__Group__0 ) ) )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:158:1: ( ( rule__Invariant__Group__0 ) )
            {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:158:1: ( ( rule__Invariant__Group__0 ) )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:159:1: ( rule__Invariant__Group__0 )
            {
             before(grammarAccess.getInvariantAccess().getGroup()); 
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:160:1: ( rule__Invariant__Group__0 )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:160:2: rule__Invariant__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__Invariant__Group__0_in_ruleInvariant274);
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


    // $ANTLR start "entryRuleVariant"
    // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:172:1: entryRuleVariant : ruleVariant EOF ;
    public final void entryRuleVariant() throws RecognitionException {
        try {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:173:1: ( ruleVariant EOF )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:174:1: ruleVariant EOF
            {
             before(grammarAccess.getVariantRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleVariant_in_entryRuleVariant301);
            ruleVariant();

            state._fsp--;

             after(grammarAccess.getVariantRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleVariant308); 

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
    // $ANTLR end "entryRuleVariant"


    // $ANTLR start "ruleVariant"
    // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:181:1: ruleVariant : ( ( rule__Variant__Group__0 ) ) ;
    public final void ruleVariant() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:185:2: ( ( ( rule__Variant__Group__0 ) ) )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:186:1: ( ( rule__Variant__Group__0 ) )
            {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:186:1: ( ( rule__Variant__Group__0 ) )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:187:1: ( rule__Variant__Group__0 )
            {
             before(grammarAccess.getVariantAccess().getGroup()); 
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:188:1: ( rule__Variant__Group__0 )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:188:2: rule__Variant__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__Variant__Group__0_in_ruleVariant334);
            rule__Variant__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getVariantAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleVariant"


    // $ANTLR start "entryRuleevent"
    // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:200:1: entryRuleevent : ruleevent EOF ;
    public final void entryRuleevent() throws RecognitionException {
        try {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:201:1: ( ruleevent EOF )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:202:1: ruleevent EOF
            {
             before(grammarAccess.getEventRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleevent_in_entryRuleevent361);
            ruleevent();

            state._fsp--;

             after(grammarAccess.getEventRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleevent368); 

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
    // $ANTLR end "entryRuleevent"


    // $ANTLR start "ruleevent"
    // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:209:1: ruleevent : ( ( rule__Event__Group__0 ) ) ;
    public final void ruleevent() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:213:2: ( ( ( rule__Event__Group__0 ) ) )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:214:1: ( ( rule__Event__Group__0 ) )
            {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:214:1: ( ( rule__Event__Group__0 ) )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:215:1: ( rule__Event__Group__0 )
            {
             before(grammarAccess.getEventAccess().getGroup()); 
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:216:1: ( rule__Event__Group__0 )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:216:2: rule__Event__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__Event__Group__0_in_ruleevent394);
            rule__Event__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getEventAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleevent"


    // $ANTLR start "entryRuleParameter"
    // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:230:1: entryRuleParameter : ruleParameter EOF ;
    public final void entryRuleParameter() throws RecognitionException {
        try {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:231:1: ( ruleParameter EOF )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:232:1: ruleParameter EOF
            {
             before(grammarAccess.getParameterRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleParameter_in_entryRuleParameter423);
            ruleParameter();

            state._fsp--;

             after(grammarAccess.getParameterRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleParameter430); 

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
    // $ANTLR end "entryRuleParameter"


    // $ANTLR start "ruleParameter"
    // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:239:1: ruleParameter : ( ( rule__Parameter__Group__0 ) ) ;
    public final void ruleParameter() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:243:2: ( ( ( rule__Parameter__Group__0 ) ) )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:244:1: ( ( rule__Parameter__Group__0 ) )
            {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:244:1: ( ( rule__Parameter__Group__0 ) )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:245:1: ( rule__Parameter__Group__0 )
            {
             before(grammarAccess.getParameterAccess().getGroup()); 
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:246:1: ( rule__Parameter__Group__0 )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:246:2: rule__Parameter__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__Parameter__Group__0_in_ruleParameter456);
            rule__Parameter__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getParameterAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleParameter"


    // $ANTLR start "entryRuleGuard"
    // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:258:1: entryRuleGuard : ruleGuard EOF ;
    public final void entryRuleGuard() throws RecognitionException {
        try {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:259:1: ( ruleGuard EOF )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:260:1: ruleGuard EOF
            {
             before(grammarAccess.getGuardRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleGuard_in_entryRuleGuard483);
            ruleGuard();

            state._fsp--;

             after(grammarAccess.getGuardRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleGuard490); 

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
    // $ANTLR end "entryRuleGuard"


    // $ANTLR start "ruleGuard"
    // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:267:1: ruleGuard : ( ( rule__Guard__Group__0 ) ) ;
    public final void ruleGuard() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:271:2: ( ( ( rule__Guard__Group__0 ) ) )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:272:1: ( ( rule__Guard__Group__0 ) )
            {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:272:1: ( ( rule__Guard__Group__0 ) )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:273:1: ( rule__Guard__Group__0 )
            {
             before(grammarAccess.getGuardAccess().getGroup()); 
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:274:1: ( rule__Guard__Group__0 )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:274:2: rule__Guard__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__Guard__Group__0_in_ruleGuard516);
            rule__Guard__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getGuardAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleGuard"


    // $ANTLR start "entryRuleWitness"
    // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:286:1: entryRuleWitness : ruleWitness EOF ;
    public final void entryRuleWitness() throws RecognitionException {
        try {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:287:1: ( ruleWitness EOF )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:288:1: ruleWitness EOF
            {
             before(grammarAccess.getWitnessRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleWitness_in_entryRuleWitness543);
            ruleWitness();

            state._fsp--;

             after(grammarAccess.getWitnessRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleWitness550); 

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
    // $ANTLR end "entryRuleWitness"


    // $ANTLR start "ruleWitness"
    // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:295:1: ruleWitness : ( ( rule__Witness__Group__0 ) ) ;
    public final void ruleWitness() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:299:2: ( ( ( rule__Witness__Group__0 ) ) )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:300:1: ( ( rule__Witness__Group__0 ) )
            {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:300:1: ( ( rule__Witness__Group__0 ) )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:301:1: ( rule__Witness__Group__0 )
            {
             before(grammarAccess.getWitnessAccess().getGroup()); 
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:302:1: ( rule__Witness__Group__0 )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:302:2: rule__Witness__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__Witness__Group__0_in_ruleWitness576);
            rule__Witness__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getWitnessAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleWitness"


    // $ANTLR start "entryRuleAction"
    // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:314:1: entryRuleAction : ruleAction EOF ;
    public final void entryRuleAction() throws RecognitionException {
        try {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:315:1: ( ruleAction EOF )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:316:1: ruleAction EOF
            {
             before(grammarAccess.getActionRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleAction_in_entryRuleAction603);
            ruleAction();

            state._fsp--;

             after(grammarAccess.getActionRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleAction610); 

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
    // $ANTLR end "entryRuleAction"


    // $ANTLR start "ruleAction"
    // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:323:1: ruleAction : ( ( rule__Action__Group__0 ) ) ;
    public final void ruleAction() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:327:2: ( ( ( rule__Action__Group__0 ) ) )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:328:1: ( ( rule__Action__Group__0 ) )
            {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:328:1: ( ( rule__Action__Group__0 ) )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:329:1: ( rule__Action__Group__0 )
            {
             before(grammarAccess.getActionAccess().getGroup()); 
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:330:1: ( rule__Action__Group__0 )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:330:2: rule__Action__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__Action__Group__0_in_ruleAction636);
            rule__Action__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getActionAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAction"


    // $ANTLR start "ruleConvergence"
    // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:343:1: ruleConvergence : ( ( rule__Convergence__Alternatives ) ) ;
    public final void ruleConvergence() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:347:1: ( ( ( rule__Convergence__Alternatives ) ) )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:348:1: ( ( rule__Convergence__Alternatives ) )
            {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:348:1: ( ( rule__Convergence__Alternatives ) )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:349:1: ( rule__Convergence__Alternatives )
            {
             before(grammarAccess.getConvergenceAccess().getAlternatives()); 
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:350:1: ( rule__Convergence__Alternatives )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:350:2: rule__Convergence__Alternatives
            {
            pushFollow(FollowSets000.FOLLOW_rule__Convergence__Alternatives_in_ruleConvergence673);
            rule__Convergence__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getConvergenceAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleConvergence"


    // $ANTLR start "rule__EString__Alternatives"
    // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:361:1: rule__EString__Alternatives : ( ( RULE_STRING ) | ( RULE_ID ) );
    public final void rule__EString__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:365:1: ( ( RULE_STRING ) | ( RULE_ID ) )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==RULE_STRING) ) {
                alt1=1;
            }
            else if ( (LA1_0==RULE_ID) ) {
                alt1=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:366:1: ( RULE_STRING )
                    {
                    // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:366:1: ( RULE_STRING )
                    // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:367:1: RULE_STRING
                    {
                     before(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 
                    match(input,RULE_STRING,FollowSets000.FOLLOW_RULE_STRING_in_rule__EString__Alternatives708); 
                     after(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:372:6: ( RULE_ID )
                    {
                    // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:372:6: ( RULE_ID )
                    // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:373:1: RULE_ID
                    {
                     before(grammarAccess.getEStringAccess().getIDTerminalRuleCall_1()); 
                    match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_rule__EString__Alternatives725); 
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


    // $ANTLR start "rule__Convergence__Alternatives"
    // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:383:1: rule__Convergence__Alternatives : ( ( ( 'ordinary' ) ) | ( ( 'convergent' ) ) | ( ( 'anticipated' ) ) );
    public final void rule__Convergence__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:387:1: ( ( ( 'ordinary' ) ) | ( ( 'convergent' ) ) | ( ( 'anticipated' ) ) )
            int alt2=3;
            switch ( input.LA(1) ) {
            case 11:
                {
                alt2=1;
                }
                break;
            case 12:
                {
                alt2=2;
                }
                break;
            case 13:
                {
                alt2=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }

            switch (alt2) {
                case 1 :
                    // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:388:1: ( ( 'ordinary' ) )
                    {
                    // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:388:1: ( ( 'ordinary' ) )
                    // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:389:1: ( 'ordinary' )
                    {
                     before(grammarAccess.getConvergenceAccess().getOrdinaryEnumLiteralDeclaration_0()); 
                    // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:390:1: ( 'ordinary' )
                    // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:390:3: 'ordinary'
                    {
                    match(input,11,FollowSets000.FOLLOW_11_in_rule__Convergence__Alternatives758); 

                    }

                     after(grammarAccess.getConvergenceAccess().getOrdinaryEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:395:6: ( ( 'convergent' ) )
                    {
                    // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:395:6: ( ( 'convergent' ) )
                    // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:396:1: ( 'convergent' )
                    {
                     before(grammarAccess.getConvergenceAccess().getConvergentEnumLiteralDeclaration_1()); 
                    // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:397:1: ( 'convergent' )
                    // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:397:3: 'convergent'
                    {
                    match(input,12,FollowSets000.FOLLOW_12_in_rule__Convergence__Alternatives779); 

                    }

                     after(grammarAccess.getConvergenceAccess().getConvergentEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:402:6: ( ( 'anticipated' ) )
                    {
                    // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:402:6: ( ( 'anticipated' ) )
                    // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:403:1: ( 'anticipated' )
                    {
                     before(grammarAccess.getConvergenceAccess().getAnticipatedEnumLiteralDeclaration_2()); 
                    // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:404:1: ( 'anticipated' )
                    // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:404:3: 'anticipated'
                    {
                    match(input,13,FollowSets000.FOLLOW_13_in_rule__Convergence__Alternatives800); 

                    }

                     after(grammarAccess.getConvergenceAccess().getAnticipatedEnumLiteralDeclaration_2()); 

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
    // $ANTLR end "rule__Convergence__Alternatives"


    // $ANTLR start "rule__Machine__Group__0"
    // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:416:1: rule__Machine__Group__0 : rule__Machine__Group__0__Impl rule__Machine__Group__1 ;
    public final void rule__Machine__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:420:1: ( rule__Machine__Group__0__Impl rule__Machine__Group__1 )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:421:2: rule__Machine__Group__0__Impl rule__Machine__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Machine__Group__0__Impl_in_rule__Machine__Group__0833);
            rule__Machine__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Machine__Group__1_in_rule__Machine__Group__0836);
            rule__Machine__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Machine__Group__0"


    // $ANTLR start "rule__Machine__Group__0__Impl"
    // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:428:1: rule__Machine__Group__0__Impl : ( () ) ;
    public final void rule__Machine__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:432:1: ( ( () ) )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:433:1: ( () )
            {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:433:1: ( () )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:434:1: ()
            {
             before(grammarAccess.getMachineAccess().getMachineAction_0()); 
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:435:1: ()
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:437:1: 
            {
            }

             after(grammarAccess.getMachineAccess().getMachineAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Machine__Group__0__Impl"


    // $ANTLR start "rule__Machine__Group__1"
    // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:447:1: rule__Machine__Group__1 : rule__Machine__Group__1__Impl rule__Machine__Group__2 ;
    public final void rule__Machine__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:451:1: ( rule__Machine__Group__1__Impl rule__Machine__Group__2 )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:452:2: rule__Machine__Group__1__Impl rule__Machine__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Machine__Group__1__Impl_in_rule__Machine__Group__1894);
            rule__Machine__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Machine__Group__2_in_rule__Machine__Group__1897);
            rule__Machine__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Machine__Group__1"


    // $ANTLR start "rule__Machine__Group__1__Impl"
    // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:459:1: rule__Machine__Group__1__Impl : ( 'machine' ) ;
    public final void rule__Machine__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:463:1: ( ( 'machine' ) )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:464:1: ( 'machine' )
            {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:464:1: ( 'machine' )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:465:1: 'machine'
            {
             before(grammarAccess.getMachineAccess().getMachineKeyword_1()); 
            match(input,14,FollowSets000.FOLLOW_14_in_rule__Machine__Group__1__Impl925); 
             after(grammarAccess.getMachineAccess().getMachineKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Machine__Group__1__Impl"


    // $ANTLR start "rule__Machine__Group__2"
    // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:478:1: rule__Machine__Group__2 : rule__Machine__Group__2__Impl rule__Machine__Group__3 ;
    public final void rule__Machine__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:482:1: ( rule__Machine__Group__2__Impl rule__Machine__Group__3 )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:483:2: rule__Machine__Group__2__Impl rule__Machine__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__Machine__Group__2__Impl_in_rule__Machine__Group__2956);
            rule__Machine__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Machine__Group__3_in_rule__Machine__Group__2959);
            rule__Machine__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Machine__Group__2"


    // $ANTLR start "rule__Machine__Group__2__Impl"
    // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:490:1: rule__Machine__Group__2__Impl : ( ( rule__Machine__NameAssignment_2 ) ) ;
    public final void rule__Machine__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:494:1: ( ( ( rule__Machine__NameAssignment_2 ) ) )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:495:1: ( ( rule__Machine__NameAssignment_2 ) )
            {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:495:1: ( ( rule__Machine__NameAssignment_2 ) )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:496:1: ( rule__Machine__NameAssignment_2 )
            {
             before(grammarAccess.getMachineAccess().getNameAssignment_2()); 
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:497:1: ( rule__Machine__NameAssignment_2 )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:497:2: rule__Machine__NameAssignment_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Machine__NameAssignment_2_in_rule__Machine__Group__2__Impl986);
            rule__Machine__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getMachineAccess().getNameAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Machine__Group__2__Impl"


    // $ANTLR start "rule__Machine__Group__3"
    // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:507:1: rule__Machine__Group__3 : rule__Machine__Group__3__Impl rule__Machine__Group__4 ;
    public final void rule__Machine__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:511:1: ( rule__Machine__Group__3__Impl rule__Machine__Group__4 )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:512:2: rule__Machine__Group__3__Impl rule__Machine__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__Machine__Group__3__Impl_in_rule__Machine__Group__31016);
            rule__Machine__Group__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Machine__Group__4_in_rule__Machine__Group__31019);
            rule__Machine__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Machine__Group__3"


    // $ANTLR start "rule__Machine__Group__3__Impl"
    // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:519:1: rule__Machine__Group__3__Impl : ( ( rule__Machine__Group_3__0 )? ) ;
    public final void rule__Machine__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:523:1: ( ( ( rule__Machine__Group_3__0 )? ) )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:524:1: ( ( rule__Machine__Group_3__0 )? )
            {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:524:1: ( ( rule__Machine__Group_3__0 )? )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:525:1: ( rule__Machine__Group_3__0 )?
            {
             before(grammarAccess.getMachineAccess().getGroup_3()); 
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:526:1: ( rule__Machine__Group_3__0 )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==16) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:526:2: rule__Machine__Group_3__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__Machine__Group_3__0_in_rule__Machine__Group__3__Impl1046);
                    rule__Machine__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getMachineAccess().getGroup_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Machine__Group__3__Impl"


    // $ANTLR start "rule__Machine__Group__4"
    // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:536:1: rule__Machine__Group__4 : rule__Machine__Group__4__Impl rule__Machine__Group__5 ;
    public final void rule__Machine__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:540:1: ( rule__Machine__Group__4__Impl rule__Machine__Group__5 )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:541:2: rule__Machine__Group__4__Impl rule__Machine__Group__5
            {
            pushFollow(FollowSets000.FOLLOW_rule__Machine__Group__4__Impl_in_rule__Machine__Group__41077);
            rule__Machine__Group__4__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Machine__Group__5_in_rule__Machine__Group__41080);
            rule__Machine__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Machine__Group__4"


    // $ANTLR start "rule__Machine__Group__4__Impl"
    // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:548:1: rule__Machine__Group__4__Impl : ( ( rule__Machine__Group_4__0 )? ) ;
    public final void rule__Machine__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:552:1: ( ( ( rule__Machine__Group_4__0 )? ) )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:553:1: ( ( rule__Machine__Group_4__0 )? )
            {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:553:1: ( ( rule__Machine__Group_4__0 )? )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:554:1: ( rule__Machine__Group_4__0 )?
            {
             before(grammarAccess.getMachineAccess().getGroup_4()); 
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:555:1: ( rule__Machine__Group_4__0 )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==17) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:555:2: rule__Machine__Group_4__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__Machine__Group_4__0_in_rule__Machine__Group__4__Impl1107);
                    rule__Machine__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getMachineAccess().getGroup_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Machine__Group__4__Impl"


    // $ANTLR start "rule__Machine__Group__5"
    // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:565:1: rule__Machine__Group__5 : rule__Machine__Group__5__Impl rule__Machine__Group__6 ;
    public final void rule__Machine__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:569:1: ( rule__Machine__Group__5__Impl rule__Machine__Group__6 )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:570:2: rule__Machine__Group__5__Impl rule__Machine__Group__6
            {
            pushFollow(FollowSets000.FOLLOW_rule__Machine__Group__5__Impl_in_rule__Machine__Group__51138);
            rule__Machine__Group__5__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Machine__Group__6_in_rule__Machine__Group__51141);
            rule__Machine__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Machine__Group__5"


    // $ANTLR start "rule__Machine__Group__5__Impl"
    // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:577:1: rule__Machine__Group__5__Impl : ( ( rule__Machine__Group_5__0 )? ) ;
    public final void rule__Machine__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:581:1: ( ( ( rule__Machine__Group_5__0 )? ) )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:582:1: ( ( rule__Machine__Group_5__0 )? )
            {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:582:1: ( ( rule__Machine__Group_5__0 )? )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:583:1: ( rule__Machine__Group_5__0 )?
            {
             before(grammarAccess.getMachineAccess().getGroup_5()); 
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:584:1: ( rule__Machine__Group_5__0 )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==19) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:584:2: rule__Machine__Group_5__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__Machine__Group_5__0_in_rule__Machine__Group__5__Impl1168);
                    rule__Machine__Group_5__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getMachineAccess().getGroup_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Machine__Group__5__Impl"


    // $ANTLR start "rule__Machine__Group__6"
    // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:594:1: rule__Machine__Group__6 : rule__Machine__Group__6__Impl rule__Machine__Group__7 ;
    public final void rule__Machine__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:598:1: ( rule__Machine__Group__6__Impl rule__Machine__Group__7 )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:599:2: rule__Machine__Group__6__Impl rule__Machine__Group__7
            {
            pushFollow(FollowSets000.FOLLOW_rule__Machine__Group__6__Impl_in_rule__Machine__Group__61199);
            rule__Machine__Group__6__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Machine__Group__7_in_rule__Machine__Group__61202);
            rule__Machine__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Machine__Group__6"


    // $ANTLR start "rule__Machine__Group__6__Impl"
    // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:606:1: rule__Machine__Group__6__Impl : ( ( rule__Machine__Group_6__0 )? ) ;
    public final void rule__Machine__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:610:1: ( ( ( rule__Machine__Group_6__0 )? ) )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:611:1: ( ( rule__Machine__Group_6__0 )? )
            {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:611:1: ( ( rule__Machine__Group_6__0 )? )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:612:1: ( rule__Machine__Group_6__0 )?
            {
             before(grammarAccess.getMachineAccess().getGroup_6()); 
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:613:1: ( rule__Machine__Group_6__0 )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==22) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:613:2: rule__Machine__Group_6__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__Machine__Group_6__0_in_rule__Machine__Group__6__Impl1229);
                    rule__Machine__Group_6__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getMachineAccess().getGroup_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Machine__Group__6__Impl"


    // $ANTLR start "rule__Machine__Group__7"
    // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:623:1: rule__Machine__Group__7 : rule__Machine__Group__7__Impl rule__Machine__Group__8 ;
    public final void rule__Machine__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:627:1: ( rule__Machine__Group__7__Impl rule__Machine__Group__8 )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:628:2: rule__Machine__Group__7__Impl rule__Machine__Group__8
            {
            pushFollow(FollowSets000.FOLLOW_rule__Machine__Group__7__Impl_in_rule__Machine__Group__71260);
            rule__Machine__Group__7__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Machine__Group__8_in_rule__Machine__Group__71263);
            rule__Machine__Group__8();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Machine__Group__7"


    // $ANTLR start "rule__Machine__Group__7__Impl"
    // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:635:1: rule__Machine__Group__7__Impl : ( ( rule__Machine__Group_7__0 )? ) ;
    public final void rule__Machine__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:639:1: ( ( ( rule__Machine__Group_7__0 )? ) )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:640:1: ( ( rule__Machine__Group_7__0 )? )
            {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:640:1: ( ( rule__Machine__Group_7__0 )? )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:641:1: ( rule__Machine__Group_7__0 )?
            {
             before(grammarAccess.getMachineAccess().getGroup_7()); 
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:642:1: ( rule__Machine__Group_7__0 )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==23) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:642:2: rule__Machine__Group_7__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__Machine__Group_7__0_in_rule__Machine__Group__7__Impl1290);
                    rule__Machine__Group_7__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getMachineAccess().getGroup_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Machine__Group__7__Impl"


    // $ANTLR start "rule__Machine__Group__8"
    // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:652:1: rule__Machine__Group__8 : rule__Machine__Group__8__Impl rule__Machine__Group__9 ;
    public final void rule__Machine__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:656:1: ( rule__Machine__Group__8__Impl rule__Machine__Group__9 )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:657:2: rule__Machine__Group__8__Impl rule__Machine__Group__9
            {
            pushFollow(FollowSets000.FOLLOW_rule__Machine__Group__8__Impl_in_rule__Machine__Group__81321);
            rule__Machine__Group__8__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Machine__Group__9_in_rule__Machine__Group__81324);
            rule__Machine__Group__9();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Machine__Group__8"


    // $ANTLR start "rule__Machine__Group__8__Impl"
    // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:664:1: rule__Machine__Group__8__Impl : ( ( rule__Machine__Group_8__0 )? ) ;
    public final void rule__Machine__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:668:1: ( ( ( rule__Machine__Group_8__0 )? ) )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:669:1: ( ( rule__Machine__Group_8__0 )? )
            {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:669:1: ( ( rule__Machine__Group_8__0 )? )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:670:1: ( rule__Machine__Group_8__0 )?
            {
             before(grammarAccess.getMachineAccess().getGroup_8()); 
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:671:1: ( rule__Machine__Group_8__0 )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==24) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:671:2: rule__Machine__Group_8__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__Machine__Group_8__0_in_rule__Machine__Group__8__Impl1351);
                    rule__Machine__Group_8__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getMachineAccess().getGroup_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Machine__Group__8__Impl"


    // $ANTLR start "rule__Machine__Group__9"
    // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:681:1: rule__Machine__Group__9 : rule__Machine__Group__9__Impl rule__Machine__Group__10 ;
    public final void rule__Machine__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:685:1: ( rule__Machine__Group__9__Impl rule__Machine__Group__10 )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:686:2: rule__Machine__Group__9__Impl rule__Machine__Group__10
            {
            pushFollow(FollowSets000.FOLLOW_rule__Machine__Group__9__Impl_in_rule__Machine__Group__91382);
            rule__Machine__Group__9__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Machine__Group__10_in_rule__Machine__Group__91385);
            rule__Machine__Group__10();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Machine__Group__9"


    // $ANTLR start "rule__Machine__Group__9__Impl"
    // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:693:1: rule__Machine__Group__9__Impl : ( ( rule__Machine__Group_9__0 )? ) ;
    public final void rule__Machine__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:697:1: ( ( ( rule__Machine__Group_9__0 )? ) )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:698:1: ( ( rule__Machine__Group_9__0 )? )
            {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:698:1: ( ( rule__Machine__Group_9__0 )? )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:699:1: ( rule__Machine__Group_9__0 )?
            {
             before(grammarAccess.getMachineAccess().getGroup_9()); 
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:700:1: ( rule__Machine__Group_9__0 )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==25) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:700:2: rule__Machine__Group_9__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__Machine__Group_9__0_in_rule__Machine__Group__9__Impl1412);
                    rule__Machine__Group_9__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getMachineAccess().getGroup_9()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Machine__Group__9__Impl"


    // $ANTLR start "rule__Machine__Group__10"
    // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:710:1: rule__Machine__Group__10 : rule__Machine__Group__10__Impl ;
    public final void rule__Machine__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:714:1: ( rule__Machine__Group__10__Impl )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:715:2: rule__Machine__Group__10__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Machine__Group__10__Impl_in_rule__Machine__Group__101443);
            rule__Machine__Group__10__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Machine__Group__10"


    // $ANTLR start "rule__Machine__Group__10__Impl"
    // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:721:1: rule__Machine__Group__10__Impl : ( 'end' ) ;
    public final void rule__Machine__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:725:1: ( ( 'end' ) )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:726:1: ( 'end' )
            {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:726:1: ( 'end' )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:727:1: 'end'
            {
             before(grammarAccess.getMachineAccess().getEndKeyword_10()); 
            match(input,15,FollowSets000.FOLLOW_15_in_rule__Machine__Group__10__Impl1471); 
             after(grammarAccess.getMachineAccess().getEndKeyword_10()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Machine__Group__10__Impl"


    // $ANTLR start "rule__Machine__Group_3__0"
    // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:762:1: rule__Machine__Group_3__0 : rule__Machine__Group_3__0__Impl rule__Machine__Group_3__1 ;
    public final void rule__Machine__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:766:1: ( rule__Machine__Group_3__0__Impl rule__Machine__Group_3__1 )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:767:2: rule__Machine__Group_3__0__Impl rule__Machine__Group_3__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Machine__Group_3__0__Impl_in_rule__Machine__Group_3__01524);
            rule__Machine__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Machine__Group_3__1_in_rule__Machine__Group_3__01527);
            rule__Machine__Group_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Machine__Group_3__0"


    // $ANTLR start "rule__Machine__Group_3__0__Impl"
    // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:774:1: rule__Machine__Group_3__0__Impl : ( '//' ) ;
    public final void rule__Machine__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:778:1: ( ( '//' ) )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:779:1: ( '//' )
            {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:779:1: ( '//' )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:780:1: '//'
            {
             before(grammarAccess.getMachineAccess().getSolidusSolidusKeyword_3_0()); 
            match(input,16,FollowSets000.FOLLOW_16_in_rule__Machine__Group_3__0__Impl1555); 
             after(grammarAccess.getMachineAccess().getSolidusSolidusKeyword_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Machine__Group_3__0__Impl"


    // $ANTLR start "rule__Machine__Group_3__1"
    // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:793:1: rule__Machine__Group_3__1 : rule__Machine__Group_3__1__Impl ;
    public final void rule__Machine__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:797:1: ( rule__Machine__Group_3__1__Impl )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:798:2: rule__Machine__Group_3__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Machine__Group_3__1__Impl_in_rule__Machine__Group_3__11586);
            rule__Machine__Group_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Machine__Group_3__1"


    // $ANTLR start "rule__Machine__Group_3__1__Impl"
    // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:804:1: rule__Machine__Group_3__1__Impl : ( ( rule__Machine__CommentAssignment_3_1 ) ) ;
    public final void rule__Machine__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:808:1: ( ( ( rule__Machine__CommentAssignment_3_1 ) ) )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:809:1: ( ( rule__Machine__CommentAssignment_3_1 ) )
            {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:809:1: ( ( rule__Machine__CommentAssignment_3_1 ) )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:810:1: ( rule__Machine__CommentAssignment_3_1 )
            {
             before(grammarAccess.getMachineAccess().getCommentAssignment_3_1()); 
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:811:1: ( rule__Machine__CommentAssignment_3_1 )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:811:2: rule__Machine__CommentAssignment_3_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Machine__CommentAssignment_3_1_in_rule__Machine__Group_3__1__Impl1613);
            rule__Machine__CommentAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getMachineAccess().getCommentAssignment_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Machine__Group_3__1__Impl"


    // $ANTLR start "rule__Machine__Group_4__0"
    // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:825:1: rule__Machine__Group_4__0 : rule__Machine__Group_4__0__Impl rule__Machine__Group_4__1 ;
    public final void rule__Machine__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:829:1: ( rule__Machine__Group_4__0__Impl rule__Machine__Group_4__1 )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:830:2: rule__Machine__Group_4__0__Impl rule__Machine__Group_4__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Machine__Group_4__0__Impl_in_rule__Machine__Group_4__01647);
            rule__Machine__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Machine__Group_4__1_in_rule__Machine__Group_4__01650);
            rule__Machine__Group_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Machine__Group_4__0"


    // $ANTLR start "rule__Machine__Group_4__0__Impl"
    // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:837:1: rule__Machine__Group_4__0__Impl : ( 'refines' ) ;
    public final void rule__Machine__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:841:1: ( ( 'refines' ) )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:842:1: ( 'refines' )
            {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:842:1: ( 'refines' )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:843:1: 'refines'
            {
             before(grammarAccess.getMachineAccess().getRefinesKeyword_4_0()); 
            match(input,17,FollowSets000.FOLLOW_17_in_rule__Machine__Group_4__0__Impl1678); 
             after(grammarAccess.getMachineAccess().getRefinesKeyword_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Machine__Group_4__0__Impl"


    // $ANTLR start "rule__Machine__Group_4__1"
    // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:856:1: rule__Machine__Group_4__1 : rule__Machine__Group_4__1__Impl rule__Machine__Group_4__2 ;
    public final void rule__Machine__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:860:1: ( rule__Machine__Group_4__1__Impl rule__Machine__Group_4__2 )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:861:2: rule__Machine__Group_4__1__Impl rule__Machine__Group_4__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Machine__Group_4__1__Impl_in_rule__Machine__Group_4__11709);
            rule__Machine__Group_4__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Machine__Group_4__2_in_rule__Machine__Group_4__11712);
            rule__Machine__Group_4__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Machine__Group_4__1"


    // $ANTLR start "rule__Machine__Group_4__1__Impl"
    // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:868:1: rule__Machine__Group_4__1__Impl : ( ( rule__Machine__RefinesAssignment_4_1 ) ) ;
    public final void rule__Machine__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:872:1: ( ( ( rule__Machine__RefinesAssignment_4_1 ) ) )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:873:1: ( ( rule__Machine__RefinesAssignment_4_1 ) )
            {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:873:1: ( ( rule__Machine__RefinesAssignment_4_1 ) )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:874:1: ( rule__Machine__RefinesAssignment_4_1 )
            {
             before(grammarAccess.getMachineAccess().getRefinesAssignment_4_1()); 
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:875:1: ( rule__Machine__RefinesAssignment_4_1 )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:875:2: rule__Machine__RefinesAssignment_4_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Machine__RefinesAssignment_4_1_in_rule__Machine__Group_4__1__Impl1739);
            rule__Machine__RefinesAssignment_4_1();

            state._fsp--;


            }

             after(grammarAccess.getMachineAccess().getRefinesAssignment_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Machine__Group_4__1__Impl"


    // $ANTLR start "rule__Machine__Group_4__2"
    // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:885:1: rule__Machine__Group_4__2 : rule__Machine__Group_4__2__Impl ;
    public final void rule__Machine__Group_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:889:1: ( rule__Machine__Group_4__2__Impl )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:890:2: rule__Machine__Group_4__2__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Machine__Group_4__2__Impl_in_rule__Machine__Group_4__21769);
            rule__Machine__Group_4__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Machine__Group_4__2"


    // $ANTLR start "rule__Machine__Group_4__2__Impl"
    // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:896:1: rule__Machine__Group_4__2__Impl : ( ( rule__Machine__Group_4_2__0 )* ) ;
    public final void rule__Machine__Group_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:900:1: ( ( ( rule__Machine__Group_4_2__0 )* ) )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:901:1: ( ( rule__Machine__Group_4_2__0 )* )
            {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:901:1: ( ( rule__Machine__Group_4_2__0 )* )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:902:1: ( rule__Machine__Group_4_2__0 )*
            {
             before(grammarAccess.getMachineAccess().getGroup_4_2()); 
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:903:1: ( rule__Machine__Group_4_2__0 )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==18) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:903:2: rule__Machine__Group_4_2__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__Machine__Group_4_2__0_in_rule__Machine__Group_4__2__Impl1796);
            	    rule__Machine__Group_4_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);

             after(grammarAccess.getMachineAccess().getGroup_4_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Machine__Group_4__2__Impl"


    // $ANTLR start "rule__Machine__Group_4_2__0"
    // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:919:1: rule__Machine__Group_4_2__0 : rule__Machine__Group_4_2__0__Impl rule__Machine__Group_4_2__1 ;
    public final void rule__Machine__Group_4_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:923:1: ( rule__Machine__Group_4_2__0__Impl rule__Machine__Group_4_2__1 )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:924:2: rule__Machine__Group_4_2__0__Impl rule__Machine__Group_4_2__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Machine__Group_4_2__0__Impl_in_rule__Machine__Group_4_2__01833);
            rule__Machine__Group_4_2__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Machine__Group_4_2__1_in_rule__Machine__Group_4_2__01836);
            rule__Machine__Group_4_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Machine__Group_4_2__0"


    // $ANTLR start "rule__Machine__Group_4_2__0__Impl"
    // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:931:1: rule__Machine__Group_4_2__0__Impl : ( ',' ) ;
    public final void rule__Machine__Group_4_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:935:1: ( ( ',' ) )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:936:1: ( ',' )
            {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:936:1: ( ',' )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:937:1: ','
            {
             before(grammarAccess.getMachineAccess().getCommaKeyword_4_2_0()); 
            match(input,18,FollowSets000.FOLLOW_18_in_rule__Machine__Group_4_2__0__Impl1864); 
             after(grammarAccess.getMachineAccess().getCommaKeyword_4_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Machine__Group_4_2__0__Impl"


    // $ANTLR start "rule__Machine__Group_4_2__1"
    // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:950:1: rule__Machine__Group_4_2__1 : rule__Machine__Group_4_2__1__Impl ;
    public final void rule__Machine__Group_4_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:954:1: ( rule__Machine__Group_4_2__1__Impl )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:955:2: rule__Machine__Group_4_2__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Machine__Group_4_2__1__Impl_in_rule__Machine__Group_4_2__11895);
            rule__Machine__Group_4_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Machine__Group_4_2__1"


    // $ANTLR start "rule__Machine__Group_4_2__1__Impl"
    // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:961:1: rule__Machine__Group_4_2__1__Impl : ( ( rule__Machine__RefinesAssignment_4_2_1 ) ) ;
    public final void rule__Machine__Group_4_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:965:1: ( ( ( rule__Machine__RefinesAssignment_4_2_1 ) ) )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:966:1: ( ( rule__Machine__RefinesAssignment_4_2_1 ) )
            {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:966:1: ( ( rule__Machine__RefinesAssignment_4_2_1 ) )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:967:1: ( rule__Machine__RefinesAssignment_4_2_1 )
            {
             before(grammarAccess.getMachineAccess().getRefinesAssignment_4_2_1()); 
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:968:1: ( rule__Machine__RefinesAssignment_4_2_1 )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:968:2: rule__Machine__RefinesAssignment_4_2_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Machine__RefinesAssignment_4_2_1_in_rule__Machine__Group_4_2__1__Impl1922);
            rule__Machine__RefinesAssignment_4_2_1();

            state._fsp--;


            }

             after(grammarAccess.getMachineAccess().getRefinesAssignment_4_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Machine__Group_4_2__1__Impl"


    // $ANTLR start "rule__Machine__Group_5__0"
    // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:982:1: rule__Machine__Group_5__0 : rule__Machine__Group_5__0__Impl rule__Machine__Group_5__1 ;
    public final void rule__Machine__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:986:1: ( rule__Machine__Group_5__0__Impl rule__Machine__Group_5__1 )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:987:2: rule__Machine__Group_5__0__Impl rule__Machine__Group_5__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Machine__Group_5__0__Impl_in_rule__Machine__Group_5__01956);
            rule__Machine__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Machine__Group_5__1_in_rule__Machine__Group_5__01959);
            rule__Machine__Group_5__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Machine__Group_5__0"


    // $ANTLR start "rule__Machine__Group_5__0__Impl"
    // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:994:1: rule__Machine__Group_5__0__Impl : ( 'sees' ) ;
    public final void rule__Machine__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:998:1: ( ( 'sees' ) )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:999:1: ( 'sees' )
            {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:999:1: ( 'sees' )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:1000:1: 'sees'
            {
             before(grammarAccess.getMachineAccess().getSeesKeyword_5_0()); 
            match(input,19,FollowSets000.FOLLOW_19_in_rule__Machine__Group_5__0__Impl1987); 
             after(grammarAccess.getMachineAccess().getSeesKeyword_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Machine__Group_5__0__Impl"


    // $ANTLR start "rule__Machine__Group_5__1"
    // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:1013:1: rule__Machine__Group_5__1 : rule__Machine__Group_5__1__Impl rule__Machine__Group_5__2 ;
    public final void rule__Machine__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:1017:1: ( rule__Machine__Group_5__1__Impl rule__Machine__Group_5__2 )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:1018:2: rule__Machine__Group_5__1__Impl rule__Machine__Group_5__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Machine__Group_5__1__Impl_in_rule__Machine__Group_5__12018);
            rule__Machine__Group_5__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Machine__Group_5__2_in_rule__Machine__Group_5__12021);
            rule__Machine__Group_5__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Machine__Group_5__1"


    // $ANTLR start "rule__Machine__Group_5__1__Impl"
    // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:1025:1: rule__Machine__Group_5__1__Impl : ( '(' ) ;
    public final void rule__Machine__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:1029:1: ( ( '(' ) )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:1030:1: ( '(' )
            {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:1030:1: ( '(' )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:1031:1: '('
            {
             before(grammarAccess.getMachineAccess().getLeftParenthesisKeyword_5_1()); 
            match(input,20,FollowSets000.FOLLOW_20_in_rule__Machine__Group_5__1__Impl2049); 
             after(grammarAccess.getMachineAccess().getLeftParenthesisKeyword_5_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Machine__Group_5__1__Impl"


    // $ANTLR start "rule__Machine__Group_5__2"
    // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:1044:1: rule__Machine__Group_5__2 : rule__Machine__Group_5__2__Impl rule__Machine__Group_5__3 ;
    public final void rule__Machine__Group_5__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:1048:1: ( rule__Machine__Group_5__2__Impl rule__Machine__Group_5__3 )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:1049:2: rule__Machine__Group_5__2__Impl rule__Machine__Group_5__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__Machine__Group_5__2__Impl_in_rule__Machine__Group_5__22080);
            rule__Machine__Group_5__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Machine__Group_5__3_in_rule__Machine__Group_5__22083);
            rule__Machine__Group_5__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Machine__Group_5__2"


    // $ANTLR start "rule__Machine__Group_5__2__Impl"
    // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:1056:1: rule__Machine__Group_5__2__Impl : ( ( rule__Machine__SeesAssignment_5_2 ) ) ;
    public final void rule__Machine__Group_5__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:1060:1: ( ( ( rule__Machine__SeesAssignment_5_2 ) ) )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:1061:1: ( ( rule__Machine__SeesAssignment_5_2 ) )
            {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:1061:1: ( ( rule__Machine__SeesAssignment_5_2 ) )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:1062:1: ( rule__Machine__SeesAssignment_5_2 )
            {
             before(grammarAccess.getMachineAccess().getSeesAssignment_5_2()); 
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:1063:1: ( rule__Machine__SeesAssignment_5_2 )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:1063:2: rule__Machine__SeesAssignment_5_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Machine__SeesAssignment_5_2_in_rule__Machine__Group_5__2__Impl2110);
            rule__Machine__SeesAssignment_5_2();

            state._fsp--;


            }

             after(grammarAccess.getMachineAccess().getSeesAssignment_5_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Machine__Group_5__2__Impl"


    // $ANTLR start "rule__Machine__Group_5__3"
    // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:1073:1: rule__Machine__Group_5__3 : rule__Machine__Group_5__3__Impl rule__Machine__Group_5__4 ;
    public final void rule__Machine__Group_5__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:1077:1: ( rule__Machine__Group_5__3__Impl rule__Machine__Group_5__4 )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:1078:2: rule__Machine__Group_5__3__Impl rule__Machine__Group_5__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__Machine__Group_5__3__Impl_in_rule__Machine__Group_5__32140);
            rule__Machine__Group_5__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Machine__Group_5__4_in_rule__Machine__Group_5__32143);
            rule__Machine__Group_5__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Machine__Group_5__3"


    // $ANTLR start "rule__Machine__Group_5__3__Impl"
    // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:1085:1: rule__Machine__Group_5__3__Impl : ( ( rule__Machine__Group_5_3__0 )* ) ;
    public final void rule__Machine__Group_5__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:1089:1: ( ( ( rule__Machine__Group_5_3__0 )* ) )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:1090:1: ( ( rule__Machine__Group_5_3__0 )* )
            {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:1090:1: ( ( rule__Machine__Group_5_3__0 )* )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:1091:1: ( rule__Machine__Group_5_3__0 )*
            {
             before(grammarAccess.getMachineAccess().getGroup_5_3()); 
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:1092:1: ( rule__Machine__Group_5_3__0 )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==18) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:1092:2: rule__Machine__Group_5_3__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__Machine__Group_5_3__0_in_rule__Machine__Group_5__3__Impl2170);
            	    rule__Machine__Group_5_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);

             after(grammarAccess.getMachineAccess().getGroup_5_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Machine__Group_5__3__Impl"


    // $ANTLR start "rule__Machine__Group_5__4"
    // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:1102:1: rule__Machine__Group_5__4 : rule__Machine__Group_5__4__Impl ;
    public final void rule__Machine__Group_5__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:1106:1: ( rule__Machine__Group_5__4__Impl )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:1107:2: rule__Machine__Group_5__4__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Machine__Group_5__4__Impl_in_rule__Machine__Group_5__42201);
            rule__Machine__Group_5__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Machine__Group_5__4"


    // $ANTLR start "rule__Machine__Group_5__4__Impl"
    // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:1113:1: rule__Machine__Group_5__4__Impl : ( ')' ) ;
    public final void rule__Machine__Group_5__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:1117:1: ( ( ')' ) )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:1118:1: ( ')' )
            {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:1118:1: ( ')' )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:1119:1: ')'
            {
             before(grammarAccess.getMachineAccess().getRightParenthesisKeyword_5_4()); 
            match(input,21,FollowSets000.FOLLOW_21_in_rule__Machine__Group_5__4__Impl2229); 
             after(grammarAccess.getMachineAccess().getRightParenthesisKeyword_5_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Machine__Group_5__4__Impl"


    // $ANTLR start "rule__Machine__Group_5_3__0"
    // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:1142:1: rule__Machine__Group_5_3__0 : rule__Machine__Group_5_3__0__Impl rule__Machine__Group_5_3__1 ;
    public final void rule__Machine__Group_5_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:1146:1: ( rule__Machine__Group_5_3__0__Impl rule__Machine__Group_5_3__1 )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:1147:2: rule__Machine__Group_5_3__0__Impl rule__Machine__Group_5_3__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Machine__Group_5_3__0__Impl_in_rule__Machine__Group_5_3__02270);
            rule__Machine__Group_5_3__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Machine__Group_5_3__1_in_rule__Machine__Group_5_3__02273);
            rule__Machine__Group_5_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Machine__Group_5_3__0"


    // $ANTLR start "rule__Machine__Group_5_3__0__Impl"
    // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:1154:1: rule__Machine__Group_5_3__0__Impl : ( ',' ) ;
    public final void rule__Machine__Group_5_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:1158:1: ( ( ',' ) )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:1159:1: ( ',' )
            {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:1159:1: ( ',' )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:1160:1: ','
            {
             before(grammarAccess.getMachineAccess().getCommaKeyword_5_3_0()); 
            match(input,18,FollowSets000.FOLLOW_18_in_rule__Machine__Group_5_3__0__Impl2301); 
             after(grammarAccess.getMachineAccess().getCommaKeyword_5_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Machine__Group_5_3__0__Impl"


    // $ANTLR start "rule__Machine__Group_5_3__1"
    // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:1173:1: rule__Machine__Group_5_3__1 : rule__Machine__Group_5_3__1__Impl ;
    public final void rule__Machine__Group_5_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:1177:1: ( rule__Machine__Group_5_3__1__Impl )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:1178:2: rule__Machine__Group_5_3__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Machine__Group_5_3__1__Impl_in_rule__Machine__Group_5_3__12332);
            rule__Machine__Group_5_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Machine__Group_5_3__1"


    // $ANTLR start "rule__Machine__Group_5_3__1__Impl"
    // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:1184:1: rule__Machine__Group_5_3__1__Impl : ( ( rule__Machine__SeesAssignment_5_3_1 ) ) ;
    public final void rule__Machine__Group_5_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:1188:1: ( ( ( rule__Machine__SeesAssignment_5_3_1 ) ) )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:1189:1: ( ( rule__Machine__SeesAssignment_5_3_1 ) )
            {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:1189:1: ( ( rule__Machine__SeesAssignment_5_3_1 ) )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:1190:1: ( rule__Machine__SeesAssignment_5_3_1 )
            {
             before(grammarAccess.getMachineAccess().getSeesAssignment_5_3_1()); 
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:1191:1: ( rule__Machine__SeesAssignment_5_3_1 )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:1191:2: rule__Machine__SeesAssignment_5_3_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Machine__SeesAssignment_5_3_1_in_rule__Machine__Group_5_3__1__Impl2359);
            rule__Machine__SeesAssignment_5_3_1();

            state._fsp--;


            }

             after(grammarAccess.getMachineAccess().getSeesAssignment_5_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Machine__Group_5_3__1__Impl"


    // $ANTLR start "rule__Machine__Group_6__0"
    // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:1205:1: rule__Machine__Group_6__0 : rule__Machine__Group_6__0__Impl rule__Machine__Group_6__1 ;
    public final void rule__Machine__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:1209:1: ( rule__Machine__Group_6__0__Impl rule__Machine__Group_6__1 )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:1210:2: rule__Machine__Group_6__0__Impl rule__Machine__Group_6__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Machine__Group_6__0__Impl_in_rule__Machine__Group_6__02393);
            rule__Machine__Group_6__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Machine__Group_6__1_in_rule__Machine__Group_6__02396);
            rule__Machine__Group_6__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Machine__Group_6__0"


    // $ANTLR start "rule__Machine__Group_6__0__Impl"
    // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:1217:1: rule__Machine__Group_6__0__Impl : ( 'variables' ) ;
    public final void rule__Machine__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:1221:1: ( ( 'variables' ) )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:1222:1: ( 'variables' )
            {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:1222:1: ( 'variables' )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:1223:1: 'variables'
            {
             before(grammarAccess.getMachineAccess().getVariablesKeyword_6_0()); 
            match(input,22,FollowSets000.FOLLOW_22_in_rule__Machine__Group_6__0__Impl2424); 
             after(grammarAccess.getMachineAccess().getVariablesKeyword_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Machine__Group_6__0__Impl"


    // $ANTLR start "rule__Machine__Group_6__1"
    // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:1236:1: rule__Machine__Group_6__1 : rule__Machine__Group_6__1__Impl rule__Machine__Group_6__2 ;
    public final void rule__Machine__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:1240:1: ( rule__Machine__Group_6__1__Impl rule__Machine__Group_6__2 )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:1241:2: rule__Machine__Group_6__1__Impl rule__Machine__Group_6__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Machine__Group_6__1__Impl_in_rule__Machine__Group_6__12455);
            rule__Machine__Group_6__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Machine__Group_6__2_in_rule__Machine__Group_6__12458);
            rule__Machine__Group_6__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Machine__Group_6__1"


    // $ANTLR start "rule__Machine__Group_6__1__Impl"
    // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:1248:1: rule__Machine__Group_6__1__Impl : ( ( rule__Machine__VariablesAssignment_6_1 ) ) ;
    public final void rule__Machine__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:1252:1: ( ( ( rule__Machine__VariablesAssignment_6_1 ) ) )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:1253:1: ( ( rule__Machine__VariablesAssignment_6_1 ) )
            {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:1253:1: ( ( rule__Machine__VariablesAssignment_6_1 ) )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:1254:1: ( rule__Machine__VariablesAssignment_6_1 )
            {
             before(grammarAccess.getMachineAccess().getVariablesAssignment_6_1()); 
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:1255:1: ( rule__Machine__VariablesAssignment_6_1 )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:1255:2: rule__Machine__VariablesAssignment_6_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Machine__VariablesAssignment_6_1_in_rule__Machine__Group_6__1__Impl2485);
            rule__Machine__VariablesAssignment_6_1();

            state._fsp--;


            }

             after(grammarAccess.getMachineAccess().getVariablesAssignment_6_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Machine__Group_6__1__Impl"


    // $ANTLR start "rule__Machine__Group_6__2"
    // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:1265:1: rule__Machine__Group_6__2 : rule__Machine__Group_6__2__Impl ;
    public final void rule__Machine__Group_6__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:1269:1: ( rule__Machine__Group_6__2__Impl )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:1270:2: rule__Machine__Group_6__2__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Machine__Group_6__2__Impl_in_rule__Machine__Group_6__22515);
            rule__Machine__Group_6__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Machine__Group_6__2"


    // $ANTLR start "rule__Machine__Group_6__2__Impl"
    // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:1276:1: rule__Machine__Group_6__2__Impl : ( ( rule__Machine__VariablesAssignment_6_2 )* ) ;
    public final void rule__Machine__Group_6__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:1280:1: ( ( ( rule__Machine__VariablesAssignment_6_2 )* ) )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:1281:1: ( ( rule__Machine__VariablesAssignment_6_2 )* )
            {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:1281:1: ( ( rule__Machine__VariablesAssignment_6_2 )* )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:1282:1: ( rule__Machine__VariablesAssignment_6_2 )*
            {
             before(grammarAccess.getMachineAccess().getVariablesAssignment_6_2()); 
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:1283:1: ( rule__Machine__VariablesAssignment_6_2 )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( ((LA12_0>=RULE_STRING && LA12_0<=RULE_ID)) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:1283:2: rule__Machine__VariablesAssignment_6_2
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__Machine__VariablesAssignment_6_2_in_rule__Machine__Group_6__2__Impl2542);
            	    rule__Machine__VariablesAssignment_6_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);

             after(grammarAccess.getMachineAccess().getVariablesAssignment_6_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Machine__Group_6__2__Impl"


    // $ANTLR start "rule__Machine__Group_7__0"
    // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:1299:1: rule__Machine__Group_7__0 : rule__Machine__Group_7__0__Impl rule__Machine__Group_7__1 ;
    public final void rule__Machine__Group_7__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:1303:1: ( rule__Machine__Group_7__0__Impl rule__Machine__Group_7__1 )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:1304:2: rule__Machine__Group_7__0__Impl rule__Machine__Group_7__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Machine__Group_7__0__Impl_in_rule__Machine__Group_7__02579);
            rule__Machine__Group_7__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Machine__Group_7__1_in_rule__Machine__Group_7__02582);
            rule__Machine__Group_7__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Machine__Group_7__0"


    // $ANTLR start "rule__Machine__Group_7__0__Impl"
    // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:1311:1: rule__Machine__Group_7__0__Impl : ( 'invariants' ) ;
    public final void rule__Machine__Group_7__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:1315:1: ( ( 'invariants' ) )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:1316:1: ( 'invariants' )
            {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:1316:1: ( 'invariants' )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:1317:1: 'invariants'
            {
             before(grammarAccess.getMachineAccess().getInvariantsKeyword_7_0()); 
            match(input,23,FollowSets000.FOLLOW_23_in_rule__Machine__Group_7__0__Impl2610); 
             after(grammarAccess.getMachineAccess().getInvariantsKeyword_7_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Machine__Group_7__0__Impl"


    // $ANTLR start "rule__Machine__Group_7__1"
    // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:1330:1: rule__Machine__Group_7__1 : rule__Machine__Group_7__1__Impl rule__Machine__Group_7__2 ;
    public final void rule__Machine__Group_7__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:1334:1: ( rule__Machine__Group_7__1__Impl rule__Machine__Group_7__2 )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:1335:2: rule__Machine__Group_7__1__Impl rule__Machine__Group_7__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Machine__Group_7__1__Impl_in_rule__Machine__Group_7__12641);
            rule__Machine__Group_7__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Machine__Group_7__2_in_rule__Machine__Group_7__12644);
            rule__Machine__Group_7__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Machine__Group_7__1"


    // $ANTLR start "rule__Machine__Group_7__1__Impl"
    // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:1342:1: rule__Machine__Group_7__1__Impl : ( ( rule__Machine__InvariantsAssignment_7_1 ) ) ;
    public final void rule__Machine__Group_7__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:1346:1: ( ( ( rule__Machine__InvariantsAssignment_7_1 ) ) )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:1347:1: ( ( rule__Machine__InvariantsAssignment_7_1 ) )
            {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:1347:1: ( ( rule__Machine__InvariantsAssignment_7_1 ) )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:1348:1: ( rule__Machine__InvariantsAssignment_7_1 )
            {
             before(grammarAccess.getMachineAccess().getInvariantsAssignment_7_1()); 
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:1349:1: ( rule__Machine__InvariantsAssignment_7_1 )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:1349:2: rule__Machine__InvariantsAssignment_7_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Machine__InvariantsAssignment_7_1_in_rule__Machine__Group_7__1__Impl2671);
            rule__Machine__InvariantsAssignment_7_1();

            state._fsp--;


            }

             after(grammarAccess.getMachineAccess().getInvariantsAssignment_7_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Machine__Group_7__1__Impl"


    // $ANTLR start "rule__Machine__Group_7__2"
    // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:1359:1: rule__Machine__Group_7__2 : rule__Machine__Group_7__2__Impl ;
    public final void rule__Machine__Group_7__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:1363:1: ( rule__Machine__Group_7__2__Impl )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:1364:2: rule__Machine__Group_7__2__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Machine__Group_7__2__Impl_in_rule__Machine__Group_7__22701);
            rule__Machine__Group_7__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Machine__Group_7__2"


    // $ANTLR start "rule__Machine__Group_7__2__Impl"
    // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:1370:1: rule__Machine__Group_7__2__Impl : ( ( rule__Machine__InvariantsAssignment_7_2 )* ) ;
    public final void rule__Machine__Group_7__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:1374:1: ( ( ( rule__Machine__InvariantsAssignment_7_2 )* ) )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:1375:1: ( ( rule__Machine__InvariantsAssignment_7_2 )* )
            {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:1375:1: ( ( rule__Machine__InvariantsAssignment_7_2 )* )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:1376:1: ( rule__Machine__InvariantsAssignment_7_2 )*
            {
             before(grammarAccess.getMachineAccess().getInvariantsAssignment_7_2()); 
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:1377:1: ( rule__Machine__InvariantsAssignment_7_2 )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==26) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:1377:2: rule__Machine__InvariantsAssignment_7_2
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__Machine__InvariantsAssignment_7_2_in_rule__Machine__Group_7__2__Impl2728);
            	    rule__Machine__InvariantsAssignment_7_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop13;
                }
            } while (true);

             after(grammarAccess.getMachineAccess().getInvariantsAssignment_7_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Machine__Group_7__2__Impl"


    // $ANTLR start "rule__Machine__Group_8__0"
    // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:1393:1: rule__Machine__Group_8__0 : rule__Machine__Group_8__0__Impl rule__Machine__Group_8__1 ;
    public final void rule__Machine__Group_8__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:1397:1: ( rule__Machine__Group_8__0__Impl rule__Machine__Group_8__1 )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:1398:2: rule__Machine__Group_8__0__Impl rule__Machine__Group_8__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Machine__Group_8__0__Impl_in_rule__Machine__Group_8__02765);
            rule__Machine__Group_8__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Machine__Group_8__1_in_rule__Machine__Group_8__02768);
            rule__Machine__Group_8__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Machine__Group_8__0"


    // $ANTLR start "rule__Machine__Group_8__0__Impl"
    // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:1405:1: rule__Machine__Group_8__0__Impl : ( 'variant' ) ;
    public final void rule__Machine__Group_8__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:1409:1: ( ( 'variant' ) )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:1410:1: ( 'variant' )
            {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:1410:1: ( 'variant' )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:1411:1: 'variant'
            {
             before(grammarAccess.getMachineAccess().getVariantKeyword_8_0()); 
            match(input,24,FollowSets000.FOLLOW_24_in_rule__Machine__Group_8__0__Impl2796); 
             after(grammarAccess.getMachineAccess().getVariantKeyword_8_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Machine__Group_8__0__Impl"


    // $ANTLR start "rule__Machine__Group_8__1"
    // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:1424:1: rule__Machine__Group_8__1 : rule__Machine__Group_8__1__Impl ;
    public final void rule__Machine__Group_8__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:1428:1: ( rule__Machine__Group_8__1__Impl )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:1429:2: rule__Machine__Group_8__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Machine__Group_8__1__Impl_in_rule__Machine__Group_8__12827);
            rule__Machine__Group_8__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Machine__Group_8__1"


    // $ANTLR start "rule__Machine__Group_8__1__Impl"
    // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:1435:1: rule__Machine__Group_8__1__Impl : ( ( rule__Machine__VariantAssignment_8_1 ) ) ;
    public final void rule__Machine__Group_8__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:1439:1: ( ( ( rule__Machine__VariantAssignment_8_1 ) ) )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:1440:1: ( ( rule__Machine__VariantAssignment_8_1 ) )
            {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:1440:1: ( ( rule__Machine__VariantAssignment_8_1 ) )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:1441:1: ( rule__Machine__VariantAssignment_8_1 )
            {
             before(grammarAccess.getMachineAccess().getVariantAssignment_8_1()); 
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:1442:1: ( rule__Machine__VariantAssignment_8_1 )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:1442:2: rule__Machine__VariantAssignment_8_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Machine__VariantAssignment_8_1_in_rule__Machine__Group_8__1__Impl2854);
            rule__Machine__VariantAssignment_8_1();

            state._fsp--;


            }

             after(grammarAccess.getMachineAccess().getVariantAssignment_8_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Machine__Group_8__1__Impl"


    // $ANTLR start "rule__Machine__Group_9__0"
    // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:1456:1: rule__Machine__Group_9__0 : rule__Machine__Group_9__0__Impl rule__Machine__Group_9__1 ;
    public final void rule__Machine__Group_9__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:1460:1: ( rule__Machine__Group_9__0__Impl rule__Machine__Group_9__1 )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:1461:2: rule__Machine__Group_9__0__Impl rule__Machine__Group_9__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Machine__Group_9__0__Impl_in_rule__Machine__Group_9__02888);
            rule__Machine__Group_9__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Machine__Group_9__1_in_rule__Machine__Group_9__02891);
            rule__Machine__Group_9__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Machine__Group_9__0"


    // $ANTLR start "rule__Machine__Group_9__0__Impl"
    // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:1468:1: rule__Machine__Group_9__0__Impl : ( 'events' ) ;
    public final void rule__Machine__Group_9__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:1472:1: ( ( 'events' ) )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:1473:1: ( 'events' )
            {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:1473:1: ( 'events' )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:1474:1: 'events'
            {
             before(grammarAccess.getMachineAccess().getEventsKeyword_9_0()); 
            match(input,25,FollowSets000.FOLLOW_25_in_rule__Machine__Group_9__0__Impl2919); 
             after(grammarAccess.getMachineAccess().getEventsKeyword_9_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Machine__Group_9__0__Impl"


    // $ANTLR start "rule__Machine__Group_9__1"
    // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:1487:1: rule__Machine__Group_9__1 : rule__Machine__Group_9__1__Impl rule__Machine__Group_9__2 ;
    public final void rule__Machine__Group_9__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:1491:1: ( rule__Machine__Group_9__1__Impl rule__Machine__Group_9__2 )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:1492:2: rule__Machine__Group_9__1__Impl rule__Machine__Group_9__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Machine__Group_9__1__Impl_in_rule__Machine__Group_9__12950);
            rule__Machine__Group_9__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Machine__Group_9__2_in_rule__Machine__Group_9__12953);
            rule__Machine__Group_9__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Machine__Group_9__1"


    // $ANTLR start "rule__Machine__Group_9__1__Impl"
    // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:1499:1: rule__Machine__Group_9__1__Impl : ( ( rule__Machine__EventsAssignment_9_1 ) ) ;
    public final void rule__Machine__Group_9__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:1503:1: ( ( ( rule__Machine__EventsAssignment_9_1 ) ) )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:1504:1: ( ( rule__Machine__EventsAssignment_9_1 ) )
            {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:1504:1: ( ( rule__Machine__EventsAssignment_9_1 ) )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:1505:1: ( rule__Machine__EventsAssignment_9_1 )
            {
             before(grammarAccess.getMachineAccess().getEventsAssignment_9_1()); 
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:1506:1: ( rule__Machine__EventsAssignment_9_1 )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:1506:2: rule__Machine__EventsAssignment_9_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Machine__EventsAssignment_9_1_in_rule__Machine__Group_9__1__Impl2980);
            rule__Machine__EventsAssignment_9_1();

            state._fsp--;


            }

             after(grammarAccess.getMachineAccess().getEventsAssignment_9_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Machine__Group_9__1__Impl"


    // $ANTLR start "rule__Machine__Group_9__2"
    // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:1516:1: rule__Machine__Group_9__2 : rule__Machine__Group_9__2__Impl ;
    public final void rule__Machine__Group_9__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:1520:1: ( rule__Machine__Group_9__2__Impl )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:1521:2: rule__Machine__Group_9__2__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Machine__Group_9__2__Impl_in_rule__Machine__Group_9__23010);
            rule__Machine__Group_9__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Machine__Group_9__2"


    // $ANTLR start "rule__Machine__Group_9__2__Impl"
    // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:1527:1: rule__Machine__Group_9__2__Impl : ( ( rule__Machine__EventsAssignment_9_2 )* ) ;
    public final void rule__Machine__Group_9__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:1531:1: ( ( ( rule__Machine__EventsAssignment_9_2 )* ) )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:1532:1: ( ( rule__Machine__EventsAssignment_9_2 )* )
            {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:1532:1: ( ( rule__Machine__EventsAssignment_9_2 )* )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:1533:1: ( rule__Machine__EventsAssignment_9_2 )*
            {
             before(grammarAccess.getMachineAccess().getEventsAssignment_9_2()); 
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:1534:1: ( rule__Machine__EventsAssignment_9_2 )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==29) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:1534:2: rule__Machine__EventsAssignment_9_2
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__Machine__EventsAssignment_9_2_in_rule__Machine__Group_9__2__Impl3037);
            	    rule__Machine__EventsAssignment_9_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop14;
                }
            } while (true);

             after(grammarAccess.getMachineAccess().getEventsAssignment_9_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Machine__Group_9__2__Impl"


    // $ANTLR start "rule__Variable__Group__0"
    // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:1550:1: rule__Variable__Group__0 : rule__Variable__Group__0__Impl rule__Variable__Group__1 ;
    public final void rule__Variable__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:1554:1: ( rule__Variable__Group__0__Impl rule__Variable__Group__1 )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:1555:2: rule__Variable__Group__0__Impl rule__Variable__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Variable__Group__0__Impl_in_rule__Variable__Group__03074);
            rule__Variable__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Variable__Group__1_in_rule__Variable__Group__03077);
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
    // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:1562:1: rule__Variable__Group__0__Impl : ( () ) ;
    public final void rule__Variable__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:1566:1: ( ( () ) )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:1567:1: ( () )
            {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:1567:1: ( () )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:1568:1: ()
            {
             before(grammarAccess.getVariableAccess().getVariableAction_0()); 
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:1569:1: ()
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:1571:1: 
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
    // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:1581:1: rule__Variable__Group__1 : rule__Variable__Group__1__Impl rule__Variable__Group__2 ;
    public final void rule__Variable__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:1585:1: ( rule__Variable__Group__1__Impl rule__Variable__Group__2 )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:1586:2: rule__Variable__Group__1__Impl rule__Variable__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Variable__Group__1__Impl_in_rule__Variable__Group__13135);
            rule__Variable__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Variable__Group__2_in_rule__Variable__Group__13138);
            rule__Variable__Group__2();

            state._fsp--;


            }

        }
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
    // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:1593:1: rule__Variable__Group__1__Impl : ( ( rule__Variable__NameAssignment_1 ) ) ;
    public final void rule__Variable__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:1597:1: ( ( ( rule__Variable__NameAssignment_1 ) ) )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:1598:1: ( ( rule__Variable__NameAssignment_1 ) )
            {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:1598:1: ( ( rule__Variable__NameAssignment_1 ) )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:1599:1: ( rule__Variable__NameAssignment_1 )
            {
             before(grammarAccess.getVariableAccess().getNameAssignment_1()); 
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:1600:1: ( rule__Variable__NameAssignment_1 )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:1600:2: rule__Variable__NameAssignment_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Variable__NameAssignment_1_in_rule__Variable__Group__1__Impl3165);
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


    // $ANTLR start "rule__Variable__Group__2"
    // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:1610:1: rule__Variable__Group__2 : rule__Variable__Group__2__Impl ;
    public final void rule__Variable__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:1614:1: ( rule__Variable__Group__2__Impl )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:1615:2: rule__Variable__Group__2__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Variable__Group__2__Impl_in_rule__Variable__Group__23195);
            rule__Variable__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Variable__Group__2"


    // $ANTLR start "rule__Variable__Group__2__Impl"
    // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:1621:1: rule__Variable__Group__2__Impl : ( ( rule__Variable__Group_2__0 )? ) ;
    public final void rule__Variable__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:1625:1: ( ( ( rule__Variable__Group_2__0 )? ) )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:1626:1: ( ( rule__Variable__Group_2__0 )? )
            {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:1626:1: ( ( rule__Variable__Group_2__0 )? )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:1627:1: ( rule__Variable__Group_2__0 )?
            {
             before(grammarAccess.getVariableAccess().getGroup_2()); 
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:1628:1: ( rule__Variable__Group_2__0 )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==16) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:1628:2: rule__Variable__Group_2__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__Variable__Group_2__0_in_rule__Variable__Group__2__Impl3222);
                    rule__Variable__Group_2__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getVariableAccess().getGroup_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Variable__Group__2__Impl"


    // $ANTLR start "rule__Variable__Group_2__0"
    // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:1644:1: rule__Variable__Group_2__0 : rule__Variable__Group_2__0__Impl rule__Variable__Group_2__1 ;
    public final void rule__Variable__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:1648:1: ( rule__Variable__Group_2__0__Impl rule__Variable__Group_2__1 )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:1649:2: rule__Variable__Group_2__0__Impl rule__Variable__Group_2__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Variable__Group_2__0__Impl_in_rule__Variable__Group_2__03259);
            rule__Variable__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Variable__Group_2__1_in_rule__Variable__Group_2__03262);
            rule__Variable__Group_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Variable__Group_2__0"


    // $ANTLR start "rule__Variable__Group_2__0__Impl"
    // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:1656:1: rule__Variable__Group_2__0__Impl : ( '//' ) ;
    public final void rule__Variable__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:1660:1: ( ( '//' ) )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:1661:1: ( '//' )
            {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:1661:1: ( '//' )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:1662:1: '//'
            {
             before(grammarAccess.getVariableAccess().getSolidusSolidusKeyword_2_0()); 
            match(input,16,FollowSets000.FOLLOW_16_in_rule__Variable__Group_2__0__Impl3290); 
             after(grammarAccess.getVariableAccess().getSolidusSolidusKeyword_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Variable__Group_2__0__Impl"


    // $ANTLR start "rule__Variable__Group_2__1"
    // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:1675:1: rule__Variable__Group_2__1 : rule__Variable__Group_2__1__Impl ;
    public final void rule__Variable__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:1679:1: ( rule__Variable__Group_2__1__Impl )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:1680:2: rule__Variable__Group_2__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Variable__Group_2__1__Impl_in_rule__Variable__Group_2__13321);
            rule__Variable__Group_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Variable__Group_2__1"


    // $ANTLR start "rule__Variable__Group_2__1__Impl"
    // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:1686:1: rule__Variable__Group_2__1__Impl : ( ( rule__Variable__CommentAssignment_2_1 ) ) ;
    public final void rule__Variable__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:1690:1: ( ( ( rule__Variable__CommentAssignment_2_1 ) ) )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:1691:1: ( ( rule__Variable__CommentAssignment_2_1 ) )
            {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:1691:1: ( ( rule__Variable__CommentAssignment_2_1 ) )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:1692:1: ( rule__Variable__CommentAssignment_2_1 )
            {
             before(grammarAccess.getVariableAccess().getCommentAssignment_2_1()); 
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:1693:1: ( rule__Variable__CommentAssignment_2_1 )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:1693:2: rule__Variable__CommentAssignment_2_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Variable__CommentAssignment_2_1_in_rule__Variable__Group_2__1__Impl3348);
            rule__Variable__CommentAssignment_2_1();

            state._fsp--;


            }

             after(grammarAccess.getVariableAccess().getCommentAssignment_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Variable__Group_2__1__Impl"


    // $ANTLR start "rule__Invariant__Group__0"
    // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:1707:1: rule__Invariant__Group__0 : rule__Invariant__Group__0__Impl rule__Invariant__Group__1 ;
    public final void rule__Invariant__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:1711:1: ( rule__Invariant__Group__0__Impl rule__Invariant__Group__1 )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:1712:2: rule__Invariant__Group__0__Impl rule__Invariant__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Invariant__Group__0__Impl_in_rule__Invariant__Group__03382);
            rule__Invariant__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Invariant__Group__1_in_rule__Invariant__Group__03385);
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
    // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:1719:1: rule__Invariant__Group__0__Impl : ( '@' ) ;
    public final void rule__Invariant__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:1723:1: ( ( '@' ) )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:1724:1: ( '@' )
            {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:1724:1: ( '@' )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:1725:1: '@'
            {
             before(grammarAccess.getInvariantAccess().getCommercialAtKeyword_0()); 
            match(input,26,FollowSets000.FOLLOW_26_in_rule__Invariant__Group__0__Impl3413); 
             after(grammarAccess.getInvariantAccess().getCommercialAtKeyword_0()); 

            }


            }

        }
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
    // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:1738:1: rule__Invariant__Group__1 : rule__Invariant__Group__1__Impl rule__Invariant__Group__2 ;
    public final void rule__Invariant__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:1742:1: ( rule__Invariant__Group__1__Impl rule__Invariant__Group__2 )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:1743:2: rule__Invariant__Group__1__Impl rule__Invariant__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Invariant__Group__1__Impl_in_rule__Invariant__Group__13444);
            rule__Invariant__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Invariant__Group__2_in_rule__Invariant__Group__13447);
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
    // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:1750:1: rule__Invariant__Group__1__Impl : ( ( rule__Invariant__NameAssignment_1 ) ) ;
    public final void rule__Invariant__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:1754:1: ( ( ( rule__Invariant__NameAssignment_1 ) ) )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:1755:1: ( ( rule__Invariant__NameAssignment_1 ) )
            {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:1755:1: ( ( rule__Invariant__NameAssignment_1 ) )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:1756:1: ( rule__Invariant__NameAssignment_1 )
            {
             before(grammarAccess.getInvariantAccess().getNameAssignment_1()); 
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:1757:1: ( rule__Invariant__NameAssignment_1 )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:1757:2: rule__Invariant__NameAssignment_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Invariant__NameAssignment_1_in_rule__Invariant__Group__1__Impl3474);
            rule__Invariant__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getInvariantAccess().getNameAssignment_1()); 

            }


            }

        }
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
    // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:1767:1: rule__Invariant__Group__2 : rule__Invariant__Group__2__Impl rule__Invariant__Group__3 ;
    public final void rule__Invariant__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:1771:1: ( rule__Invariant__Group__2__Impl rule__Invariant__Group__3 )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:1772:2: rule__Invariant__Group__2__Impl rule__Invariant__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__Invariant__Group__2__Impl_in_rule__Invariant__Group__23504);
            rule__Invariant__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Invariant__Group__3_in_rule__Invariant__Group__23507);
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
    // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:1779:1: rule__Invariant__Group__2__Impl : ( ( rule__Invariant__TheoremAssignment_2 )? ) ;
    public final void rule__Invariant__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:1783:1: ( ( ( rule__Invariant__TheoremAssignment_2 )? ) )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:1784:1: ( ( rule__Invariant__TheoremAssignment_2 )? )
            {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:1784:1: ( ( rule__Invariant__TheoremAssignment_2 )? )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:1785:1: ( rule__Invariant__TheoremAssignment_2 )?
            {
             before(grammarAccess.getInvariantAccess().getTheoremAssignment_2()); 
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:1786:1: ( rule__Invariant__TheoremAssignment_2 )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==37) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:1786:2: rule__Invariant__TheoremAssignment_2
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__Invariant__TheoremAssignment_2_in_rule__Invariant__Group__2__Impl3534);
                    rule__Invariant__TheoremAssignment_2();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getInvariantAccess().getTheoremAssignment_2()); 

            }


            }

        }
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
    // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:1796:1: rule__Invariant__Group__3 : rule__Invariant__Group__3__Impl rule__Invariant__Group__4 ;
    public final void rule__Invariant__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:1800:1: ( rule__Invariant__Group__3__Impl rule__Invariant__Group__4 )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:1801:2: rule__Invariant__Group__3__Impl rule__Invariant__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__Invariant__Group__3__Impl_in_rule__Invariant__Group__33565);
            rule__Invariant__Group__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Invariant__Group__4_in_rule__Invariant__Group__33568);
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
    // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:1808:1: rule__Invariant__Group__3__Impl : ( ( rule__Invariant__PredicateAssignment_3 )? ) ;
    public final void rule__Invariant__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:1812:1: ( ( ( rule__Invariant__PredicateAssignment_3 )? ) )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:1813:1: ( ( rule__Invariant__PredicateAssignment_3 )? )
            {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:1813:1: ( ( rule__Invariant__PredicateAssignment_3 )? )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:1814:1: ( rule__Invariant__PredicateAssignment_3 )?
            {
             before(grammarAccess.getInvariantAccess().getPredicateAssignment_3()); 
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:1815:1: ( rule__Invariant__PredicateAssignment_3 )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( ((LA17_0>=RULE_STRING && LA17_0<=RULE_ID)) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:1815:2: rule__Invariant__PredicateAssignment_3
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__Invariant__PredicateAssignment_3_in_rule__Invariant__Group__3__Impl3595);
                    rule__Invariant__PredicateAssignment_3();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getInvariantAccess().getPredicateAssignment_3()); 

            }


            }

        }
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
    // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:1825:1: rule__Invariant__Group__4 : rule__Invariant__Group__4__Impl ;
    public final void rule__Invariant__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:1829:1: ( rule__Invariant__Group__4__Impl )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:1830:2: rule__Invariant__Group__4__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Invariant__Group__4__Impl_in_rule__Invariant__Group__43626);
            rule__Invariant__Group__4__Impl();

            state._fsp--;


            }

        }
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
    // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:1836:1: rule__Invariant__Group__4__Impl : ( ( rule__Invariant__Group_4__0 )? ) ;
    public final void rule__Invariant__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:1840:1: ( ( ( rule__Invariant__Group_4__0 )? ) )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:1841:1: ( ( rule__Invariant__Group_4__0 )? )
            {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:1841:1: ( ( rule__Invariant__Group_4__0 )? )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:1842:1: ( rule__Invariant__Group_4__0 )?
            {
             before(grammarAccess.getInvariantAccess().getGroup_4()); 
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:1843:1: ( rule__Invariant__Group_4__0 )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==16) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:1843:2: rule__Invariant__Group_4__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__Invariant__Group_4__0_in_rule__Invariant__Group__4__Impl3653);
                    rule__Invariant__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getInvariantAccess().getGroup_4()); 

            }


            }

        }
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


    // $ANTLR start "rule__Invariant__Group_4__0"
    // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:1863:1: rule__Invariant__Group_4__0 : rule__Invariant__Group_4__0__Impl rule__Invariant__Group_4__1 ;
    public final void rule__Invariant__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:1867:1: ( rule__Invariant__Group_4__0__Impl rule__Invariant__Group_4__1 )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:1868:2: rule__Invariant__Group_4__0__Impl rule__Invariant__Group_4__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Invariant__Group_4__0__Impl_in_rule__Invariant__Group_4__03694);
            rule__Invariant__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Invariant__Group_4__1_in_rule__Invariant__Group_4__03697);
            rule__Invariant__Group_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Invariant__Group_4__0"


    // $ANTLR start "rule__Invariant__Group_4__0__Impl"
    // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:1875:1: rule__Invariant__Group_4__0__Impl : ( '//' ) ;
    public final void rule__Invariant__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:1879:1: ( ( '//' ) )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:1880:1: ( '//' )
            {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:1880:1: ( '//' )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:1881:1: '//'
            {
             before(grammarAccess.getInvariantAccess().getSolidusSolidusKeyword_4_0()); 
            match(input,16,FollowSets000.FOLLOW_16_in_rule__Invariant__Group_4__0__Impl3725); 
             after(grammarAccess.getInvariantAccess().getSolidusSolidusKeyword_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Invariant__Group_4__0__Impl"


    // $ANTLR start "rule__Invariant__Group_4__1"
    // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:1894:1: rule__Invariant__Group_4__1 : rule__Invariant__Group_4__1__Impl ;
    public final void rule__Invariant__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:1898:1: ( rule__Invariant__Group_4__1__Impl )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:1899:2: rule__Invariant__Group_4__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Invariant__Group_4__1__Impl_in_rule__Invariant__Group_4__13756);
            rule__Invariant__Group_4__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Invariant__Group_4__1"


    // $ANTLR start "rule__Invariant__Group_4__1__Impl"
    // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:1905:1: rule__Invariant__Group_4__1__Impl : ( ( rule__Invariant__CommentAssignment_4_1 ) ) ;
    public final void rule__Invariant__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:1909:1: ( ( ( rule__Invariant__CommentAssignment_4_1 ) ) )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:1910:1: ( ( rule__Invariant__CommentAssignment_4_1 ) )
            {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:1910:1: ( ( rule__Invariant__CommentAssignment_4_1 ) )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:1911:1: ( rule__Invariant__CommentAssignment_4_1 )
            {
             before(grammarAccess.getInvariantAccess().getCommentAssignment_4_1()); 
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:1912:1: ( rule__Invariant__CommentAssignment_4_1 )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:1912:2: rule__Invariant__CommentAssignment_4_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Invariant__CommentAssignment_4_1_in_rule__Invariant__Group_4__1__Impl3783);
            rule__Invariant__CommentAssignment_4_1();

            state._fsp--;


            }

             after(grammarAccess.getInvariantAccess().getCommentAssignment_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Invariant__Group_4__1__Impl"


    // $ANTLR start "rule__Variant__Group__0"
    // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:1926:1: rule__Variant__Group__0 : rule__Variant__Group__0__Impl rule__Variant__Group__1 ;
    public final void rule__Variant__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:1930:1: ( rule__Variant__Group__0__Impl rule__Variant__Group__1 )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:1931:2: rule__Variant__Group__0__Impl rule__Variant__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Variant__Group__0__Impl_in_rule__Variant__Group__03817);
            rule__Variant__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Variant__Group__1_in_rule__Variant__Group__03820);
            rule__Variant__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Variant__Group__0"


    // $ANTLR start "rule__Variant__Group__0__Impl"
    // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:1938:1: rule__Variant__Group__0__Impl : ( 'Variant' ) ;
    public final void rule__Variant__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:1942:1: ( ( 'Variant' ) )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:1943:1: ( 'Variant' )
            {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:1943:1: ( 'Variant' )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:1944:1: 'Variant'
            {
             before(grammarAccess.getVariantAccess().getVariantKeyword_0()); 
            match(input,27,FollowSets000.FOLLOW_27_in_rule__Variant__Group__0__Impl3848); 
             after(grammarAccess.getVariantAccess().getVariantKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Variant__Group__0__Impl"


    // $ANTLR start "rule__Variant__Group__1"
    // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:1957:1: rule__Variant__Group__1 : rule__Variant__Group__1__Impl rule__Variant__Group__2 ;
    public final void rule__Variant__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:1961:1: ( rule__Variant__Group__1__Impl rule__Variant__Group__2 )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:1962:2: rule__Variant__Group__1__Impl rule__Variant__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Variant__Group__1__Impl_in_rule__Variant__Group__13879);
            rule__Variant__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Variant__Group__2_in_rule__Variant__Group__13882);
            rule__Variant__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Variant__Group__1"


    // $ANTLR start "rule__Variant__Group__1__Impl"
    // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:1969:1: rule__Variant__Group__1__Impl : ( 'expression' ) ;
    public final void rule__Variant__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:1973:1: ( ( 'expression' ) )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:1974:1: ( 'expression' )
            {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:1974:1: ( 'expression' )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:1975:1: 'expression'
            {
             before(grammarAccess.getVariantAccess().getExpressionKeyword_1()); 
            match(input,28,FollowSets000.FOLLOW_28_in_rule__Variant__Group__1__Impl3910); 
             after(grammarAccess.getVariantAccess().getExpressionKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Variant__Group__1__Impl"


    // $ANTLR start "rule__Variant__Group__2"
    // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:1988:1: rule__Variant__Group__2 : rule__Variant__Group__2__Impl rule__Variant__Group__3 ;
    public final void rule__Variant__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:1992:1: ( rule__Variant__Group__2__Impl rule__Variant__Group__3 )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:1993:2: rule__Variant__Group__2__Impl rule__Variant__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__Variant__Group__2__Impl_in_rule__Variant__Group__23941);
            rule__Variant__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Variant__Group__3_in_rule__Variant__Group__23944);
            rule__Variant__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Variant__Group__2"


    // $ANTLR start "rule__Variant__Group__2__Impl"
    // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:2000:1: rule__Variant__Group__2__Impl : ( ( rule__Variant__ExpressionAssignment_2 )? ) ;
    public final void rule__Variant__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:2004:1: ( ( ( rule__Variant__ExpressionAssignment_2 )? ) )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:2005:1: ( ( rule__Variant__ExpressionAssignment_2 )? )
            {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:2005:1: ( ( rule__Variant__ExpressionAssignment_2 )? )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:2006:1: ( rule__Variant__ExpressionAssignment_2 )?
            {
             before(grammarAccess.getVariantAccess().getExpressionAssignment_2()); 
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:2007:1: ( rule__Variant__ExpressionAssignment_2 )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( ((LA19_0>=RULE_STRING && LA19_0<=RULE_ID)) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:2007:2: rule__Variant__ExpressionAssignment_2
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__Variant__ExpressionAssignment_2_in_rule__Variant__Group__2__Impl3971);
                    rule__Variant__ExpressionAssignment_2();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getVariantAccess().getExpressionAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Variant__Group__2__Impl"


    // $ANTLR start "rule__Variant__Group__3"
    // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:2017:1: rule__Variant__Group__3 : rule__Variant__Group__3__Impl ;
    public final void rule__Variant__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:2021:1: ( rule__Variant__Group__3__Impl )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:2022:2: rule__Variant__Group__3__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Variant__Group__3__Impl_in_rule__Variant__Group__34002);
            rule__Variant__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Variant__Group__3"


    // $ANTLR start "rule__Variant__Group__3__Impl"
    // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:2028:1: rule__Variant__Group__3__Impl : ( ( rule__Variant__Group_3__0 ) ) ;
    public final void rule__Variant__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:2032:1: ( ( ( rule__Variant__Group_3__0 ) ) )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:2033:1: ( ( rule__Variant__Group_3__0 ) )
            {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:2033:1: ( ( rule__Variant__Group_3__0 ) )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:2034:1: ( rule__Variant__Group_3__0 )
            {
             before(grammarAccess.getVariantAccess().getGroup_3()); 
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:2035:1: ( rule__Variant__Group_3__0 )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:2035:2: rule__Variant__Group_3__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__Variant__Group_3__0_in_rule__Variant__Group__3__Impl4029);
            rule__Variant__Group_3__0();

            state._fsp--;


            }

             after(grammarAccess.getVariantAccess().getGroup_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Variant__Group__3__Impl"


    // $ANTLR start "rule__Variant__Group_3__0"
    // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:2053:1: rule__Variant__Group_3__0 : rule__Variant__Group_3__0__Impl rule__Variant__Group_3__1 ;
    public final void rule__Variant__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:2057:1: ( rule__Variant__Group_3__0__Impl rule__Variant__Group_3__1 )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:2058:2: rule__Variant__Group_3__0__Impl rule__Variant__Group_3__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Variant__Group_3__0__Impl_in_rule__Variant__Group_3__04067);
            rule__Variant__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Variant__Group_3__1_in_rule__Variant__Group_3__04070);
            rule__Variant__Group_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Variant__Group_3__0"


    // $ANTLR start "rule__Variant__Group_3__0__Impl"
    // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:2065:1: rule__Variant__Group_3__0__Impl : ( '//' ) ;
    public final void rule__Variant__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:2069:1: ( ( '//' ) )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:2070:1: ( '//' )
            {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:2070:1: ( '//' )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:2071:1: '//'
            {
             before(grammarAccess.getVariantAccess().getSolidusSolidusKeyword_3_0()); 
            match(input,16,FollowSets000.FOLLOW_16_in_rule__Variant__Group_3__0__Impl4098); 
             after(grammarAccess.getVariantAccess().getSolidusSolidusKeyword_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Variant__Group_3__0__Impl"


    // $ANTLR start "rule__Variant__Group_3__1"
    // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:2084:1: rule__Variant__Group_3__1 : rule__Variant__Group_3__1__Impl ;
    public final void rule__Variant__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:2088:1: ( rule__Variant__Group_3__1__Impl )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:2089:2: rule__Variant__Group_3__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Variant__Group_3__1__Impl_in_rule__Variant__Group_3__14129);
            rule__Variant__Group_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Variant__Group_3__1"


    // $ANTLR start "rule__Variant__Group_3__1__Impl"
    // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:2095:1: rule__Variant__Group_3__1__Impl : ( ( rule__Variant__CommentAssignment_3_1 ) ) ;
    public final void rule__Variant__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:2099:1: ( ( ( rule__Variant__CommentAssignment_3_1 ) ) )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:2100:1: ( ( rule__Variant__CommentAssignment_3_1 ) )
            {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:2100:1: ( ( rule__Variant__CommentAssignment_3_1 ) )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:2101:1: ( rule__Variant__CommentAssignment_3_1 )
            {
             before(grammarAccess.getVariantAccess().getCommentAssignment_3_1()); 
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:2102:1: ( rule__Variant__CommentAssignment_3_1 )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:2102:2: rule__Variant__CommentAssignment_3_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Variant__CommentAssignment_3_1_in_rule__Variant__Group_3__1__Impl4156);
            rule__Variant__CommentAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getVariantAccess().getCommentAssignment_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Variant__Group_3__1__Impl"


    // $ANTLR start "rule__Event__Group__0"
    // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:2116:1: rule__Event__Group__0 : rule__Event__Group__0__Impl rule__Event__Group__1 ;
    public final void rule__Event__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:2120:1: ( rule__Event__Group__0__Impl rule__Event__Group__1 )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:2121:2: rule__Event__Group__0__Impl rule__Event__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Event__Group__0__Impl_in_rule__Event__Group__04190);
            rule__Event__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Event__Group__1_in_rule__Event__Group__04193);
            rule__Event__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Event__Group__0"


    // $ANTLR start "rule__Event__Group__0__Impl"
    // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:2128:1: rule__Event__Group__0__Impl : ( () ) ;
    public final void rule__Event__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:2132:1: ( ( () ) )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:2133:1: ( () )
            {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:2133:1: ( () )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:2134:1: ()
            {
             before(grammarAccess.getEventAccess().getEventAction_0()); 
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:2135:1: ()
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:2137:1: 
            {
            }

             after(grammarAccess.getEventAccess().getEventAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Event__Group__0__Impl"


    // $ANTLR start "rule__Event__Group__1"
    // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:2147:1: rule__Event__Group__1 : rule__Event__Group__1__Impl rule__Event__Group__2 ;
    public final void rule__Event__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:2151:1: ( rule__Event__Group__1__Impl rule__Event__Group__2 )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:2152:2: rule__Event__Group__1__Impl rule__Event__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Event__Group__1__Impl_in_rule__Event__Group__14251);
            rule__Event__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Event__Group__2_in_rule__Event__Group__14254);
            rule__Event__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Event__Group__1"


    // $ANTLR start "rule__Event__Group__1__Impl"
    // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:2159:1: rule__Event__Group__1__Impl : ( 'event' ) ;
    public final void rule__Event__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:2163:1: ( ( 'event' ) )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:2164:1: ( 'event' )
            {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:2164:1: ( 'event' )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:2165:1: 'event'
            {
             before(grammarAccess.getEventAccess().getEventKeyword_1()); 
            match(input,29,FollowSets000.FOLLOW_29_in_rule__Event__Group__1__Impl4282); 
             after(grammarAccess.getEventAccess().getEventKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Event__Group__1__Impl"


    // $ANTLR start "rule__Event__Group__2"
    // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:2178:1: rule__Event__Group__2 : rule__Event__Group__2__Impl rule__Event__Group__3 ;
    public final void rule__Event__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:2182:1: ( rule__Event__Group__2__Impl rule__Event__Group__3 )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:2183:2: rule__Event__Group__2__Impl rule__Event__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__Event__Group__2__Impl_in_rule__Event__Group__24313);
            rule__Event__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Event__Group__3_in_rule__Event__Group__24316);
            rule__Event__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Event__Group__2"


    // $ANTLR start "rule__Event__Group__2__Impl"
    // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:2190:1: rule__Event__Group__2__Impl : ( ( rule__Event__NameAssignment_2 ) ) ;
    public final void rule__Event__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:2194:1: ( ( ( rule__Event__NameAssignment_2 ) ) )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:2195:1: ( ( rule__Event__NameAssignment_2 ) )
            {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:2195:1: ( ( rule__Event__NameAssignment_2 ) )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:2196:1: ( rule__Event__NameAssignment_2 )
            {
             before(grammarAccess.getEventAccess().getNameAssignment_2()); 
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:2197:1: ( rule__Event__NameAssignment_2 )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:2197:2: rule__Event__NameAssignment_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Event__NameAssignment_2_in_rule__Event__Group__2__Impl4343);
            rule__Event__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getEventAccess().getNameAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Event__Group__2__Impl"


    // $ANTLR start "rule__Event__Group__3"
    // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:2207:1: rule__Event__Group__3 : rule__Event__Group__3__Impl rule__Event__Group__4 ;
    public final void rule__Event__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:2211:1: ( rule__Event__Group__3__Impl rule__Event__Group__4 )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:2212:2: rule__Event__Group__3__Impl rule__Event__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__Event__Group__3__Impl_in_rule__Event__Group__34373);
            rule__Event__Group__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Event__Group__4_in_rule__Event__Group__34376);
            rule__Event__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Event__Group__3"


    // $ANTLR start "rule__Event__Group__3__Impl"
    // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:2219:1: rule__Event__Group__3__Impl : ( ( rule__Event__ExtendedAssignment_3 )? ) ;
    public final void rule__Event__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:2223:1: ( ( ( rule__Event__ExtendedAssignment_3 )? ) )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:2224:1: ( ( rule__Event__ExtendedAssignment_3 )? )
            {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:2224:1: ( ( rule__Event__ExtendedAssignment_3 )? )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:2225:1: ( rule__Event__ExtendedAssignment_3 )?
            {
             before(grammarAccess.getEventAccess().getExtendedAssignment_3()); 
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:2226:1: ( rule__Event__ExtendedAssignment_3 )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==38) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:2226:2: rule__Event__ExtendedAssignment_3
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__Event__ExtendedAssignment_3_in_rule__Event__Group__3__Impl4403);
                    rule__Event__ExtendedAssignment_3();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getEventAccess().getExtendedAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Event__Group__3__Impl"


    // $ANTLR start "rule__Event__Group__4"
    // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:2236:1: rule__Event__Group__4 : rule__Event__Group__4__Impl rule__Event__Group__5 ;
    public final void rule__Event__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:2240:1: ( rule__Event__Group__4__Impl rule__Event__Group__5 )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:2241:2: rule__Event__Group__4__Impl rule__Event__Group__5
            {
            pushFollow(FollowSets000.FOLLOW_rule__Event__Group__4__Impl_in_rule__Event__Group__44434);
            rule__Event__Group__4__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Event__Group__5_in_rule__Event__Group__44437);
            rule__Event__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Event__Group__4"


    // $ANTLR start "rule__Event__Group__4__Impl"
    // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:2248:1: rule__Event__Group__4__Impl : ( ( rule__Event__ConvergenceAssignment_4 )? ) ;
    public final void rule__Event__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:2252:1: ( ( ( rule__Event__ConvergenceAssignment_4 )? ) )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:2253:1: ( ( rule__Event__ConvergenceAssignment_4 )? )
            {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:2253:1: ( ( rule__Event__ConvergenceAssignment_4 )? )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:2254:1: ( rule__Event__ConvergenceAssignment_4 )?
            {
             before(grammarAccess.getEventAccess().getConvergenceAssignment_4()); 
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:2255:1: ( rule__Event__ConvergenceAssignment_4 )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( ((LA21_0>=11 && LA21_0<=13)) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:2255:2: rule__Event__ConvergenceAssignment_4
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__Event__ConvergenceAssignment_4_in_rule__Event__Group__4__Impl4464);
                    rule__Event__ConvergenceAssignment_4();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getEventAccess().getConvergenceAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Event__Group__4__Impl"


    // $ANTLR start "rule__Event__Group__5"
    // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:2265:1: rule__Event__Group__5 : rule__Event__Group__5__Impl rule__Event__Group__6 ;
    public final void rule__Event__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:2269:1: ( rule__Event__Group__5__Impl rule__Event__Group__6 )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:2270:2: rule__Event__Group__5__Impl rule__Event__Group__6
            {
            pushFollow(FollowSets000.FOLLOW_rule__Event__Group__5__Impl_in_rule__Event__Group__54495);
            rule__Event__Group__5__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Event__Group__6_in_rule__Event__Group__54498);
            rule__Event__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Event__Group__5"


    // $ANTLR start "rule__Event__Group__5__Impl"
    // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:2277:1: rule__Event__Group__5__Impl : ( ( rule__Event__Group_5__0 )? ) ;
    public final void rule__Event__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:2281:1: ( ( ( rule__Event__Group_5__0 )? ) )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:2282:1: ( ( rule__Event__Group_5__0 )? )
            {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:2282:1: ( ( rule__Event__Group_5__0 )? )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:2283:1: ( rule__Event__Group_5__0 )?
            {
             before(grammarAccess.getEventAccess().getGroup_5()); 
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:2284:1: ( rule__Event__Group_5__0 )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==16) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:2284:2: rule__Event__Group_5__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__Event__Group_5__0_in_rule__Event__Group__5__Impl4525);
                    rule__Event__Group_5__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getEventAccess().getGroup_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Event__Group__5__Impl"


    // $ANTLR start "rule__Event__Group__6"
    // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:2294:1: rule__Event__Group__6 : rule__Event__Group__6__Impl rule__Event__Group__7 ;
    public final void rule__Event__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:2298:1: ( rule__Event__Group__6__Impl rule__Event__Group__7 )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:2299:2: rule__Event__Group__6__Impl rule__Event__Group__7
            {
            pushFollow(FollowSets000.FOLLOW_rule__Event__Group__6__Impl_in_rule__Event__Group__64556);
            rule__Event__Group__6__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Event__Group__7_in_rule__Event__Group__64559);
            rule__Event__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Event__Group__6"


    // $ANTLR start "rule__Event__Group__6__Impl"
    // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:2306:1: rule__Event__Group__6__Impl : ( ( rule__Event__Group_6__0 )? ) ;
    public final void rule__Event__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:2310:1: ( ( ( rule__Event__Group_6__0 )? ) )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:2311:1: ( ( rule__Event__Group_6__0 )? )
            {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:2311:1: ( ( rule__Event__Group_6__0 )? )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:2312:1: ( rule__Event__Group_6__0 )?
            {
             before(grammarAccess.getEventAccess().getGroup_6()); 
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:2313:1: ( rule__Event__Group_6__0 )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==17) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:2313:2: rule__Event__Group_6__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__Event__Group_6__0_in_rule__Event__Group__6__Impl4586);
                    rule__Event__Group_6__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getEventAccess().getGroup_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Event__Group__6__Impl"


    // $ANTLR start "rule__Event__Group__7"
    // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:2323:1: rule__Event__Group__7 : rule__Event__Group__7__Impl rule__Event__Group__8 ;
    public final void rule__Event__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:2327:1: ( rule__Event__Group__7__Impl rule__Event__Group__8 )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:2328:2: rule__Event__Group__7__Impl rule__Event__Group__8
            {
            pushFollow(FollowSets000.FOLLOW_rule__Event__Group__7__Impl_in_rule__Event__Group__74617);
            rule__Event__Group__7__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Event__Group__8_in_rule__Event__Group__74620);
            rule__Event__Group__8();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Event__Group__7"


    // $ANTLR start "rule__Event__Group__7__Impl"
    // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:2335:1: rule__Event__Group__7__Impl : ( ( rule__Event__Group_7__0 )? ) ;
    public final void rule__Event__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:2339:1: ( ( ( rule__Event__Group_7__0 )? ) )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:2340:1: ( ( rule__Event__Group_7__0 )? )
            {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:2340:1: ( ( rule__Event__Group_7__0 )? )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:2341:1: ( rule__Event__Group_7__0 )?
            {
             before(grammarAccess.getEventAccess().getGroup_7()); 
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:2342:1: ( rule__Event__Group_7__0 )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==30) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:2342:2: rule__Event__Group_7__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__Event__Group_7__0_in_rule__Event__Group__7__Impl4647);
                    rule__Event__Group_7__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getEventAccess().getGroup_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Event__Group__7__Impl"


    // $ANTLR start "rule__Event__Group__8"
    // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:2352:1: rule__Event__Group__8 : rule__Event__Group__8__Impl rule__Event__Group__9 ;
    public final void rule__Event__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:2356:1: ( rule__Event__Group__8__Impl rule__Event__Group__9 )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:2357:2: rule__Event__Group__8__Impl rule__Event__Group__9
            {
            pushFollow(FollowSets000.FOLLOW_rule__Event__Group__8__Impl_in_rule__Event__Group__84678);
            rule__Event__Group__8__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Event__Group__9_in_rule__Event__Group__84681);
            rule__Event__Group__9();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Event__Group__8"


    // $ANTLR start "rule__Event__Group__8__Impl"
    // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:2364:1: rule__Event__Group__8__Impl : ( ( rule__Event__Group_8__0 )? ) ;
    public final void rule__Event__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:2368:1: ( ( ( rule__Event__Group_8__0 )? ) )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:2369:1: ( ( rule__Event__Group_8__0 )? )
            {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:2369:1: ( ( rule__Event__Group_8__0 )? )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:2370:1: ( rule__Event__Group_8__0 )?
            {
             before(grammarAccess.getEventAccess().getGroup_8()); 
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:2371:1: ( rule__Event__Group_8__0 )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==31) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:2371:2: rule__Event__Group_8__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__Event__Group_8__0_in_rule__Event__Group__8__Impl4708);
                    rule__Event__Group_8__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getEventAccess().getGroup_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Event__Group__8__Impl"


    // $ANTLR start "rule__Event__Group__9"
    // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:2381:1: rule__Event__Group__9 : rule__Event__Group__9__Impl rule__Event__Group__10 ;
    public final void rule__Event__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:2385:1: ( rule__Event__Group__9__Impl rule__Event__Group__10 )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:2386:2: rule__Event__Group__9__Impl rule__Event__Group__10
            {
            pushFollow(FollowSets000.FOLLOW_rule__Event__Group__9__Impl_in_rule__Event__Group__94739);
            rule__Event__Group__9__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Event__Group__10_in_rule__Event__Group__94742);
            rule__Event__Group__10();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Event__Group__9"


    // $ANTLR start "rule__Event__Group__9__Impl"
    // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:2393:1: rule__Event__Group__9__Impl : ( ( rule__Event__Group_9__0 )? ) ;
    public final void rule__Event__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:2397:1: ( ( ( rule__Event__Group_9__0 )? ) )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:2398:1: ( ( rule__Event__Group_9__0 )? )
            {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:2398:1: ( ( rule__Event__Group_9__0 )? )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:2399:1: ( rule__Event__Group_9__0 )?
            {
             before(grammarAccess.getEventAccess().getGroup_9()); 
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:2400:1: ( rule__Event__Group_9__0 )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==33) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:2400:2: rule__Event__Group_9__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__Event__Group_9__0_in_rule__Event__Group__9__Impl4769);
                    rule__Event__Group_9__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getEventAccess().getGroup_9()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Event__Group__9__Impl"


    // $ANTLR start "rule__Event__Group__10"
    // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:2410:1: rule__Event__Group__10 : rule__Event__Group__10__Impl rule__Event__Group__11 ;
    public final void rule__Event__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:2414:1: ( rule__Event__Group__10__Impl rule__Event__Group__11 )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:2415:2: rule__Event__Group__10__Impl rule__Event__Group__11
            {
            pushFollow(FollowSets000.FOLLOW_rule__Event__Group__10__Impl_in_rule__Event__Group__104800);
            rule__Event__Group__10__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Event__Group__11_in_rule__Event__Group__104803);
            rule__Event__Group__11();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Event__Group__10"


    // $ANTLR start "rule__Event__Group__10__Impl"
    // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:2422:1: rule__Event__Group__10__Impl : ( ( rule__Event__Group_10__0 )? ) ;
    public final void rule__Event__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:2426:1: ( ( ( rule__Event__Group_10__0 )? ) )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:2427:1: ( ( rule__Event__Group_10__0 )? )
            {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:2427:1: ( ( rule__Event__Group_10__0 )? )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:2428:1: ( rule__Event__Group_10__0 )?
            {
             before(grammarAccess.getEventAccess().getGroup_10()); 
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:2429:1: ( rule__Event__Group_10__0 )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==34) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:2429:2: rule__Event__Group_10__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__Event__Group_10__0_in_rule__Event__Group__10__Impl4830);
                    rule__Event__Group_10__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getEventAccess().getGroup_10()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Event__Group__10__Impl"


    // $ANTLR start "rule__Event__Group__11"
    // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:2439:1: rule__Event__Group__11 : rule__Event__Group__11__Impl ;
    public final void rule__Event__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:2443:1: ( rule__Event__Group__11__Impl )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:2444:2: rule__Event__Group__11__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Event__Group__11__Impl_in_rule__Event__Group__114861);
            rule__Event__Group__11__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Event__Group__11"


    // $ANTLR start "rule__Event__Group__11__Impl"
    // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:2450:1: rule__Event__Group__11__Impl : ( 'end' ) ;
    public final void rule__Event__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:2454:1: ( ( 'end' ) )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:2455:1: ( 'end' )
            {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:2455:1: ( 'end' )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:2456:1: 'end'
            {
             before(grammarAccess.getEventAccess().getEndKeyword_11()); 
            match(input,15,FollowSets000.FOLLOW_15_in_rule__Event__Group__11__Impl4889); 
             after(grammarAccess.getEventAccess().getEndKeyword_11()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Event__Group__11__Impl"


    // $ANTLR start "rule__Event__Group_5__0"
    // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:2493:1: rule__Event__Group_5__0 : rule__Event__Group_5__0__Impl rule__Event__Group_5__1 ;
    public final void rule__Event__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:2497:1: ( rule__Event__Group_5__0__Impl rule__Event__Group_5__1 )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:2498:2: rule__Event__Group_5__0__Impl rule__Event__Group_5__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Event__Group_5__0__Impl_in_rule__Event__Group_5__04944);
            rule__Event__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Event__Group_5__1_in_rule__Event__Group_5__04947);
            rule__Event__Group_5__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Event__Group_5__0"


    // $ANTLR start "rule__Event__Group_5__0__Impl"
    // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:2505:1: rule__Event__Group_5__0__Impl : ( '//' ) ;
    public final void rule__Event__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:2509:1: ( ( '//' ) )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:2510:1: ( '//' )
            {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:2510:1: ( '//' )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:2511:1: '//'
            {
             before(grammarAccess.getEventAccess().getSolidusSolidusKeyword_5_0()); 
            match(input,16,FollowSets000.FOLLOW_16_in_rule__Event__Group_5__0__Impl4975); 
             after(grammarAccess.getEventAccess().getSolidusSolidusKeyword_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Event__Group_5__0__Impl"


    // $ANTLR start "rule__Event__Group_5__1"
    // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:2524:1: rule__Event__Group_5__1 : rule__Event__Group_5__1__Impl ;
    public final void rule__Event__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:2528:1: ( rule__Event__Group_5__1__Impl )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:2529:2: rule__Event__Group_5__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Event__Group_5__1__Impl_in_rule__Event__Group_5__15006);
            rule__Event__Group_5__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Event__Group_5__1"


    // $ANTLR start "rule__Event__Group_5__1__Impl"
    // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:2535:1: rule__Event__Group_5__1__Impl : ( ( rule__Event__CommentAssignment_5_1 ) ) ;
    public final void rule__Event__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:2539:1: ( ( ( rule__Event__CommentAssignment_5_1 ) ) )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:2540:1: ( ( rule__Event__CommentAssignment_5_1 ) )
            {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:2540:1: ( ( rule__Event__CommentAssignment_5_1 ) )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:2541:1: ( rule__Event__CommentAssignment_5_1 )
            {
             before(grammarAccess.getEventAccess().getCommentAssignment_5_1()); 
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:2542:1: ( rule__Event__CommentAssignment_5_1 )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:2542:2: rule__Event__CommentAssignment_5_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Event__CommentAssignment_5_1_in_rule__Event__Group_5__1__Impl5033);
            rule__Event__CommentAssignment_5_1();

            state._fsp--;


            }

             after(grammarAccess.getEventAccess().getCommentAssignment_5_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Event__Group_5__1__Impl"


    // $ANTLR start "rule__Event__Group_6__0"
    // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:2556:1: rule__Event__Group_6__0 : rule__Event__Group_6__0__Impl rule__Event__Group_6__1 ;
    public final void rule__Event__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:2560:1: ( rule__Event__Group_6__0__Impl rule__Event__Group_6__1 )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:2561:2: rule__Event__Group_6__0__Impl rule__Event__Group_6__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Event__Group_6__0__Impl_in_rule__Event__Group_6__05067);
            rule__Event__Group_6__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Event__Group_6__1_in_rule__Event__Group_6__05070);
            rule__Event__Group_6__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Event__Group_6__0"


    // $ANTLR start "rule__Event__Group_6__0__Impl"
    // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:2568:1: rule__Event__Group_6__0__Impl : ( 'refines' ) ;
    public final void rule__Event__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:2572:1: ( ( 'refines' ) )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:2573:1: ( 'refines' )
            {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:2573:1: ( 'refines' )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:2574:1: 'refines'
            {
             before(grammarAccess.getEventAccess().getRefinesKeyword_6_0()); 
            match(input,17,FollowSets000.FOLLOW_17_in_rule__Event__Group_6__0__Impl5098); 
             after(grammarAccess.getEventAccess().getRefinesKeyword_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Event__Group_6__0__Impl"


    // $ANTLR start "rule__Event__Group_6__1"
    // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:2587:1: rule__Event__Group_6__1 : rule__Event__Group_6__1__Impl rule__Event__Group_6__2 ;
    public final void rule__Event__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:2591:1: ( rule__Event__Group_6__1__Impl rule__Event__Group_6__2 )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:2592:2: rule__Event__Group_6__1__Impl rule__Event__Group_6__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Event__Group_6__1__Impl_in_rule__Event__Group_6__15129);
            rule__Event__Group_6__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Event__Group_6__2_in_rule__Event__Group_6__15132);
            rule__Event__Group_6__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Event__Group_6__1"


    // $ANTLR start "rule__Event__Group_6__1__Impl"
    // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:2599:1: rule__Event__Group_6__1__Impl : ( ( rule__Event__RefinesAssignment_6_1 ) ) ;
    public final void rule__Event__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:2603:1: ( ( ( rule__Event__RefinesAssignment_6_1 ) ) )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:2604:1: ( ( rule__Event__RefinesAssignment_6_1 ) )
            {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:2604:1: ( ( rule__Event__RefinesAssignment_6_1 ) )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:2605:1: ( rule__Event__RefinesAssignment_6_1 )
            {
             before(grammarAccess.getEventAccess().getRefinesAssignment_6_1()); 
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:2606:1: ( rule__Event__RefinesAssignment_6_1 )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:2606:2: rule__Event__RefinesAssignment_6_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Event__RefinesAssignment_6_1_in_rule__Event__Group_6__1__Impl5159);
            rule__Event__RefinesAssignment_6_1();

            state._fsp--;


            }

             after(grammarAccess.getEventAccess().getRefinesAssignment_6_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Event__Group_6__1__Impl"


    // $ANTLR start "rule__Event__Group_6__2"
    // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:2616:1: rule__Event__Group_6__2 : rule__Event__Group_6__2__Impl ;
    public final void rule__Event__Group_6__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:2620:1: ( rule__Event__Group_6__2__Impl )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:2621:2: rule__Event__Group_6__2__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Event__Group_6__2__Impl_in_rule__Event__Group_6__25189);
            rule__Event__Group_6__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Event__Group_6__2"


    // $ANTLR start "rule__Event__Group_6__2__Impl"
    // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:2627:1: rule__Event__Group_6__2__Impl : ( ( rule__Event__Group_6_2__0 )* ) ;
    public final void rule__Event__Group_6__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:2631:1: ( ( ( rule__Event__Group_6_2__0 )* ) )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:2632:1: ( ( rule__Event__Group_6_2__0 )* )
            {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:2632:1: ( ( rule__Event__Group_6_2__0 )* )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:2633:1: ( rule__Event__Group_6_2__0 )*
            {
             before(grammarAccess.getEventAccess().getGroup_6_2()); 
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:2634:1: ( rule__Event__Group_6_2__0 )*
            loop28:
            do {
                int alt28=2;
                int LA28_0 = input.LA(1);

                if ( (LA28_0==18) ) {
                    alt28=1;
                }


                switch (alt28) {
            	case 1 :
            	    // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:2634:2: rule__Event__Group_6_2__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__Event__Group_6_2__0_in_rule__Event__Group_6__2__Impl5216);
            	    rule__Event__Group_6_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop28;
                }
            } while (true);

             after(grammarAccess.getEventAccess().getGroup_6_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Event__Group_6__2__Impl"


    // $ANTLR start "rule__Event__Group_6_2__0"
    // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:2650:1: rule__Event__Group_6_2__0 : rule__Event__Group_6_2__0__Impl rule__Event__Group_6_2__1 ;
    public final void rule__Event__Group_6_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:2654:1: ( rule__Event__Group_6_2__0__Impl rule__Event__Group_6_2__1 )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:2655:2: rule__Event__Group_6_2__0__Impl rule__Event__Group_6_2__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Event__Group_6_2__0__Impl_in_rule__Event__Group_6_2__05253);
            rule__Event__Group_6_2__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Event__Group_6_2__1_in_rule__Event__Group_6_2__05256);
            rule__Event__Group_6_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Event__Group_6_2__0"


    // $ANTLR start "rule__Event__Group_6_2__0__Impl"
    // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:2662:1: rule__Event__Group_6_2__0__Impl : ( ',' ) ;
    public final void rule__Event__Group_6_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:2666:1: ( ( ',' ) )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:2667:1: ( ',' )
            {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:2667:1: ( ',' )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:2668:1: ','
            {
             before(grammarAccess.getEventAccess().getCommaKeyword_6_2_0()); 
            match(input,18,FollowSets000.FOLLOW_18_in_rule__Event__Group_6_2__0__Impl5284); 
             after(grammarAccess.getEventAccess().getCommaKeyword_6_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Event__Group_6_2__0__Impl"


    // $ANTLR start "rule__Event__Group_6_2__1"
    // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:2681:1: rule__Event__Group_6_2__1 : rule__Event__Group_6_2__1__Impl ;
    public final void rule__Event__Group_6_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:2685:1: ( rule__Event__Group_6_2__1__Impl )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:2686:2: rule__Event__Group_6_2__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Event__Group_6_2__1__Impl_in_rule__Event__Group_6_2__15315);
            rule__Event__Group_6_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Event__Group_6_2__1"


    // $ANTLR start "rule__Event__Group_6_2__1__Impl"
    // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:2692:1: rule__Event__Group_6_2__1__Impl : ( ( rule__Event__RefinesAssignment_6_2_1 ) ) ;
    public final void rule__Event__Group_6_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:2696:1: ( ( ( rule__Event__RefinesAssignment_6_2_1 ) ) )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:2697:1: ( ( rule__Event__RefinesAssignment_6_2_1 ) )
            {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:2697:1: ( ( rule__Event__RefinesAssignment_6_2_1 ) )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:2698:1: ( rule__Event__RefinesAssignment_6_2_1 )
            {
             before(grammarAccess.getEventAccess().getRefinesAssignment_6_2_1()); 
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:2699:1: ( rule__Event__RefinesAssignment_6_2_1 )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:2699:2: rule__Event__RefinesAssignment_6_2_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Event__RefinesAssignment_6_2_1_in_rule__Event__Group_6_2__1__Impl5342);
            rule__Event__RefinesAssignment_6_2_1();

            state._fsp--;


            }

             after(grammarAccess.getEventAccess().getRefinesAssignment_6_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Event__Group_6_2__1__Impl"


    // $ANTLR start "rule__Event__Group_7__0"
    // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:2713:1: rule__Event__Group_7__0 : rule__Event__Group_7__0__Impl rule__Event__Group_7__1 ;
    public final void rule__Event__Group_7__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:2717:1: ( rule__Event__Group_7__0__Impl rule__Event__Group_7__1 )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:2718:2: rule__Event__Group_7__0__Impl rule__Event__Group_7__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Event__Group_7__0__Impl_in_rule__Event__Group_7__05376);
            rule__Event__Group_7__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Event__Group_7__1_in_rule__Event__Group_7__05379);
            rule__Event__Group_7__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Event__Group_7__0"


    // $ANTLR start "rule__Event__Group_7__0__Impl"
    // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:2725:1: rule__Event__Group_7__0__Impl : ( 'when' ) ;
    public final void rule__Event__Group_7__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:2729:1: ( ( 'when' ) )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:2730:1: ( 'when' )
            {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:2730:1: ( 'when' )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:2731:1: 'when'
            {
             before(grammarAccess.getEventAccess().getWhenKeyword_7_0()); 
            match(input,30,FollowSets000.FOLLOW_30_in_rule__Event__Group_7__0__Impl5407); 
             after(grammarAccess.getEventAccess().getWhenKeyword_7_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Event__Group_7__0__Impl"


    // $ANTLR start "rule__Event__Group_7__1"
    // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:2744:1: rule__Event__Group_7__1 : rule__Event__Group_7__1__Impl rule__Event__Group_7__2 ;
    public final void rule__Event__Group_7__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:2748:1: ( rule__Event__Group_7__1__Impl rule__Event__Group_7__2 )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:2749:2: rule__Event__Group_7__1__Impl rule__Event__Group_7__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Event__Group_7__1__Impl_in_rule__Event__Group_7__15438);
            rule__Event__Group_7__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Event__Group_7__2_in_rule__Event__Group_7__15441);
            rule__Event__Group_7__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Event__Group_7__1"


    // $ANTLR start "rule__Event__Group_7__1__Impl"
    // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:2756:1: rule__Event__Group_7__1__Impl : ( ( rule__Event__GuardsAssignment_7_1 ) ) ;
    public final void rule__Event__Group_7__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:2760:1: ( ( ( rule__Event__GuardsAssignment_7_1 ) ) )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:2761:1: ( ( rule__Event__GuardsAssignment_7_1 ) )
            {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:2761:1: ( ( rule__Event__GuardsAssignment_7_1 ) )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:2762:1: ( rule__Event__GuardsAssignment_7_1 )
            {
             before(grammarAccess.getEventAccess().getGuardsAssignment_7_1()); 
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:2763:1: ( rule__Event__GuardsAssignment_7_1 )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:2763:2: rule__Event__GuardsAssignment_7_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Event__GuardsAssignment_7_1_in_rule__Event__Group_7__1__Impl5468);
            rule__Event__GuardsAssignment_7_1();

            state._fsp--;


            }

             after(grammarAccess.getEventAccess().getGuardsAssignment_7_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Event__Group_7__1__Impl"


    // $ANTLR start "rule__Event__Group_7__2"
    // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:2773:1: rule__Event__Group_7__2 : rule__Event__Group_7__2__Impl ;
    public final void rule__Event__Group_7__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:2777:1: ( rule__Event__Group_7__2__Impl )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:2778:2: rule__Event__Group_7__2__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Event__Group_7__2__Impl_in_rule__Event__Group_7__25498);
            rule__Event__Group_7__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Event__Group_7__2"


    // $ANTLR start "rule__Event__Group_7__2__Impl"
    // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:2784:1: rule__Event__Group_7__2__Impl : ( ( rule__Event__GuardsAssignment_7_2 )* ) ;
    public final void rule__Event__Group_7__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:2788:1: ( ( ( rule__Event__GuardsAssignment_7_2 )* ) )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:2789:1: ( ( rule__Event__GuardsAssignment_7_2 )* )
            {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:2789:1: ( ( rule__Event__GuardsAssignment_7_2 )* )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:2790:1: ( rule__Event__GuardsAssignment_7_2 )*
            {
             before(grammarAccess.getEventAccess().getGuardsAssignment_7_2()); 
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:2791:1: ( rule__Event__GuardsAssignment_7_2 )*
            loop29:
            do {
                int alt29=2;
                int LA29_0 = input.LA(1);

                if ( (LA29_0==26) ) {
                    alt29=1;
                }


                switch (alt29) {
            	case 1 :
            	    // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:2791:2: rule__Event__GuardsAssignment_7_2
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__Event__GuardsAssignment_7_2_in_rule__Event__Group_7__2__Impl5525);
            	    rule__Event__GuardsAssignment_7_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop29;
                }
            } while (true);

             after(grammarAccess.getEventAccess().getGuardsAssignment_7_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Event__Group_7__2__Impl"


    // $ANTLR start "rule__Event__Group_8__0"
    // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:2807:1: rule__Event__Group_8__0 : rule__Event__Group_8__0__Impl rule__Event__Group_8__1 ;
    public final void rule__Event__Group_8__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:2811:1: ( rule__Event__Group_8__0__Impl rule__Event__Group_8__1 )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:2812:2: rule__Event__Group_8__0__Impl rule__Event__Group_8__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Event__Group_8__0__Impl_in_rule__Event__Group_8__05562);
            rule__Event__Group_8__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Event__Group_8__1_in_rule__Event__Group_8__05565);
            rule__Event__Group_8__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Event__Group_8__0"


    // $ANTLR start "rule__Event__Group_8__0__Impl"
    // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:2819:1: rule__Event__Group_8__0__Impl : ( 'any' ) ;
    public final void rule__Event__Group_8__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:2823:1: ( ( 'any' ) )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:2824:1: ( 'any' )
            {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:2824:1: ( 'any' )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:2825:1: 'any'
            {
             before(grammarAccess.getEventAccess().getAnyKeyword_8_0()); 
            match(input,31,FollowSets000.FOLLOW_31_in_rule__Event__Group_8__0__Impl5593); 
             after(grammarAccess.getEventAccess().getAnyKeyword_8_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Event__Group_8__0__Impl"


    // $ANTLR start "rule__Event__Group_8__1"
    // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:2838:1: rule__Event__Group_8__1 : rule__Event__Group_8__1__Impl rule__Event__Group_8__2 ;
    public final void rule__Event__Group_8__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:2842:1: ( rule__Event__Group_8__1__Impl rule__Event__Group_8__2 )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:2843:2: rule__Event__Group_8__1__Impl rule__Event__Group_8__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Event__Group_8__1__Impl_in_rule__Event__Group_8__15624);
            rule__Event__Group_8__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Event__Group_8__2_in_rule__Event__Group_8__15627);
            rule__Event__Group_8__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Event__Group_8__1"


    // $ANTLR start "rule__Event__Group_8__1__Impl"
    // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:2850:1: rule__Event__Group_8__1__Impl : ( ( rule__Event__ParametersAssignment_8_1 ) ) ;
    public final void rule__Event__Group_8__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:2854:1: ( ( ( rule__Event__ParametersAssignment_8_1 ) ) )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:2855:1: ( ( rule__Event__ParametersAssignment_8_1 ) )
            {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:2855:1: ( ( rule__Event__ParametersAssignment_8_1 ) )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:2856:1: ( rule__Event__ParametersAssignment_8_1 )
            {
             before(grammarAccess.getEventAccess().getParametersAssignment_8_1()); 
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:2857:1: ( rule__Event__ParametersAssignment_8_1 )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:2857:2: rule__Event__ParametersAssignment_8_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Event__ParametersAssignment_8_1_in_rule__Event__Group_8__1__Impl5654);
            rule__Event__ParametersAssignment_8_1();

            state._fsp--;


            }

             after(grammarAccess.getEventAccess().getParametersAssignment_8_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Event__Group_8__1__Impl"


    // $ANTLR start "rule__Event__Group_8__2"
    // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:2867:1: rule__Event__Group_8__2 : rule__Event__Group_8__2__Impl rule__Event__Group_8__3 ;
    public final void rule__Event__Group_8__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:2871:1: ( rule__Event__Group_8__2__Impl rule__Event__Group_8__3 )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:2872:2: rule__Event__Group_8__2__Impl rule__Event__Group_8__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__Event__Group_8__2__Impl_in_rule__Event__Group_8__25684);
            rule__Event__Group_8__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Event__Group_8__3_in_rule__Event__Group_8__25687);
            rule__Event__Group_8__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Event__Group_8__2"


    // $ANTLR start "rule__Event__Group_8__2__Impl"
    // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:2879:1: rule__Event__Group_8__2__Impl : ( ( rule__Event__ParametersAssignment_8_2 )* ) ;
    public final void rule__Event__Group_8__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:2883:1: ( ( ( rule__Event__ParametersAssignment_8_2 )* ) )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:2884:1: ( ( rule__Event__ParametersAssignment_8_2 )* )
            {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:2884:1: ( ( rule__Event__ParametersAssignment_8_2 )* )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:2885:1: ( rule__Event__ParametersAssignment_8_2 )*
            {
             before(grammarAccess.getEventAccess().getParametersAssignment_8_2()); 
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:2886:1: ( rule__Event__ParametersAssignment_8_2 )*
            loop30:
            do {
                int alt30=2;
                int LA30_0 = input.LA(1);

                if ( ((LA30_0>=RULE_STRING && LA30_0<=RULE_ID)) ) {
                    alt30=1;
                }


                switch (alt30) {
            	case 1 :
            	    // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:2886:2: rule__Event__ParametersAssignment_8_2
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__Event__ParametersAssignment_8_2_in_rule__Event__Group_8__2__Impl5714);
            	    rule__Event__ParametersAssignment_8_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop30;
                }
            } while (true);

             after(grammarAccess.getEventAccess().getParametersAssignment_8_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Event__Group_8__2__Impl"


    // $ANTLR start "rule__Event__Group_8__3"
    // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:2896:1: rule__Event__Group_8__3 : rule__Event__Group_8__3__Impl rule__Event__Group_8__4 ;
    public final void rule__Event__Group_8__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:2900:1: ( rule__Event__Group_8__3__Impl rule__Event__Group_8__4 )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:2901:2: rule__Event__Group_8__3__Impl rule__Event__Group_8__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__Event__Group_8__3__Impl_in_rule__Event__Group_8__35745);
            rule__Event__Group_8__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Event__Group_8__4_in_rule__Event__Group_8__35748);
            rule__Event__Group_8__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Event__Group_8__3"


    // $ANTLR start "rule__Event__Group_8__3__Impl"
    // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:2908:1: rule__Event__Group_8__3__Impl : ( 'where' ) ;
    public final void rule__Event__Group_8__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:2912:1: ( ( 'where' ) )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:2913:1: ( 'where' )
            {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:2913:1: ( 'where' )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:2914:1: 'where'
            {
             before(grammarAccess.getEventAccess().getWhereKeyword_8_3()); 
            match(input,32,FollowSets000.FOLLOW_32_in_rule__Event__Group_8__3__Impl5776); 
             after(grammarAccess.getEventAccess().getWhereKeyword_8_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Event__Group_8__3__Impl"


    // $ANTLR start "rule__Event__Group_8__4"
    // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:2927:1: rule__Event__Group_8__4 : rule__Event__Group_8__4__Impl rule__Event__Group_8__5 ;
    public final void rule__Event__Group_8__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:2931:1: ( rule__Event__Group_8__4__Impl rule__Event__Group_8__5 )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:2932:2: rule__Event__Group_8__4__Impl rule__Event__Group_8__5
            {
            pushFollow(FollowSets000.FOLLOW_rule__Event__Group_8__4__Impl_in_rule__Event__Group_8__45807);
            rule__Event__Group_8__4__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Event__Group_8__5_in_rule__Event__Group_8__45810);
            rule__Event__Group_8__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Event__Group_8__4"


    // $ANTLR start "rule__Event__Group_8__4__Impl"
    // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:2939:1: rule__Event__Group_8__4__Impl : ( ( rule__Event__GuardsAssignment_8_4 ) ) ;
    public final void rule__Event__Group_8__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:2943:1: ( ( ( rule__Event__GuardsAssignment_8_4 ) ) )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:2944:1: ( ( rule__Event__GuardsAssignment_8_4 ) )
            {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:2944:1: ( ( rule__Event__GuardsAssignment_8_4 ) )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:2945:1: ( rule__Event__GuardsAssignment_8_4 )
            {
             before(grammarAccess.getEventAccess().getGuardsAssignment_8_4()); 
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:2946:1: ( rule__Event__GuardsAssignment_8_4 )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:2946:2: rule__Event__GuardsAssignment_8_4
            {
            pushFollow(FollowSets000.FOLLOW_rule__Event__GuardsAssignment_8_4_in_rule__Event__Group_8__4__Impl5837);
            rule__Event__GuardsAssignment_8_4();

            state._fsp--;


            }

             after(grammarAccess.getEventAccess().getGuardsAssignment_8_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Event__Group_8__4__Impl"


    // $ANTLR start "rule__Event__Group_8__5"
    // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:2956:1: rule__Event__Group_8__5 : rule__Event__Group_8__5__Impl ;
    public final void rule__Event__Group_8__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:2960:1: ( rule__Event__Group_8__5__Impl )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:2961:2: rule__Event__Group_8__5__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Event__Group_8__5__Impl_in_rule__Event__Group_8__55867);
            rule__Event__Group_8__5__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Event__Group_8__5"


    // $ANTLR start "rule__Event__Group_8__5__Impl"
    // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:2967:1: rule__Event__Group_8__5__Impl : ( ( rule__Event__GuardsAssignment_8_5 )* ) ;
    public final void rule__Event__Group_8__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:2971:1: ( ( ( rule__Event__GuardsAssignment_8_5 )* ) )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:2972:1: ( ( rule__Event__GuardsAssignment_8_5 )* )
            {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:2972:1: ( ( rule__Event__GuardsAssignment_8_5 )* )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:2973:1: ( rule__Event__GuardsAssignment_8_5 )*
            {
             before(grammarAccess.getEventAccess().getGuardsAssignment_8_5()); 
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:2974:1: ( rule__Event__GuardsAssignment_8_5 )*
            loop31:
            do {
                int alt31=2;
                int LA31_0 = input.LA(1);

                if ( (LA31_0==26) ) {
                    alt31=1;
                }


                switch (alt31) {
            	case 1 :
            	    // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:2974:2: rule__Event__GuardsAssignment_8_5
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__Event__GuardsAssignment_8_5_in_rule__Event__Group_8__5__Impl5894);
            	    rule__Event__GuardsAssignment_8_5();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop31;
                }
            } while (true);

             after(grammarAccess.getEventAccess().getGuardsAssignment_8_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Event__Group_8__5__Impl"


    // $ANTLR start "rule__Event__Group_9__0"
    // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:2996:1: rule__Event__Group_9__0 : rule__Event__Group_9__0__Impl rule__Event__Group_9__1 ;
    public final void rule__Event__Group_9__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:3000:1: ( rule__Event__Group_9__0__Impl rule__Event__Group_9__1 )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:3001:2: rule__Event__Group_9__0__Impl rule__Event__Group_9__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Event__Group_9__0__Impl_in_rule__Event__Group_9__05937);
            rule__Event__Group_9__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Event__Group_9__1_in_rule__Event__Group_9__05940);
            rule__Event__Group_9__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Event__Group_9__0"


    // $ANTLR start "rule__Event__Group_9__0__Impl"
    // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:3008:1: rule__Event__Group_9__0__Impl : ( 'witnesses' ) ;
    public final void rule__Event__Group_9__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:3012:1: ( ( 'witnesses' ) )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:3013:1: ( 'witnesses' )
            {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:3013:1: ( 'witnesses' )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:3014:1: 'witnesses'
            {
             before(grammarAccess.getEventAccess().getWitnessesKeyword_9_0()); 
            match(input,33,FollowSets000.FOLLOW_33_in_rule__Event__Group_9__0__Impl5968); 
             after(grammarAccess.getEventAccess().getWitnessesKeyword_9_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Event__Group_9__0__Impl"


    // $ANTLR start "rule__Event__Group_9__1"
    // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:3027:1: rule__Event__Group_9__1 : rule__Event__Group_9__1__Impl rule__Event__Group_9__2 ;
    public final void rule__Event__Group_9__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:3031:1: ( rule__Event__Group_9__1__Impl rule__Event__Group_9__2 )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:3032:2: rule__Event__Group_9__1__Impl rule__Event__Group_9__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Event__Group_9__1__Impl_in_rule__Event__Group_9__15999);
            rule__Event__Group_9__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Event__Group_9__2_in_rule__Event__Group_9__16002);
            rule__Event__Group_9__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Event__Group_9__1"


    // $ANTLR start "rule__Event__Group_9__1__Impl"
    // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:3039:1: rule__Event__Group_9__1__Impl : ( ( rule__Event__WitnessesAssignment_9_1 ) ) ;
    public final void rule__Event__Group_9__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:3043:1: ( ( ( rule__Event__WitnessesAssignment_9_1 ) ) )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:3044:1: ( ( rule__Event__WitnessesAssignment_9_1 ) )
            {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:3044:1: ( ( rule__Event__WitnessesAssignment_9_1 ) )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:3045:1: ( rule__Event__WitnessesAssignment_9_1 )
            {
             before(grammarAccess.getEventAccess().getWitnessesAssignment_9_1()); 
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:3046:1: ( rule__Event__WitnessesAssignment_9_1 )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:3046:2: rule__Event__WitnessesAssignment_9_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Event__WitnessesAssignment_9_1_in_rule__Event__Group_9__1__Impl6029);
            rule__Event__WitnessesAssignment_9_1();

            state._fsp--;


            }

             after(grammarAccess.getEventAccess().getWitnessesAssignment_9_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Event__Group_9__1__Impl"


    // $ANTLR start "rule__Event__Group_9__2"
    // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:3056:1: rule__Event__Group_9__2 : rule__Event__Group_9__2__Impl ;
    public final void rule__Event__Group_9__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:3060:1: ( rule__Event__Group_9__2__Impl )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:3061:2: rule__Event__Group_9__2__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Event__Group_9__2__Impl_in_rule__Event__Group_9__26059);
            rule__Event__Group_9__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Event__Group_9__2"


    // $ANTLR start "rule__Event__Group_9__2__Impl"
    // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:3067:1: rule__Event__Group_9__2__Impl : ( ( rule__Event__WitnessesAssignment_9_2 )* ) ;
    public final void rule__Event__Group_9__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:3071:1: ( ( ( rule__Event__WitnessesAssignment_9_2 )* ) )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:3072:1: ( ( rule__Event__WitnessesAssignment_9_2 )* )
            {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:3072:1: ( ( rule__Event__WitnessesAssignment_9_2 )* )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:3073:1: ( rule__Event__WitnessesAssignment_9_2 )*
            {
             before(grammarAccess.getEventAccess().getWitnessesAssignment_9_2()); 
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:3074:1: ( rule__Event__WitnessesAssignment_9_2 )*
            loop32:
            do {
                int alt32=2;
                int LA32_0 = input.LA(1);

                if ( (LA32_0==35||LA32_0==39) ) {
                    alt32=1;
                }


                switch (alt32) {
            	case 1 :
            	    // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:3074:2: rule__Event__WitnessesAssignment_9_2
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__Event__WitnessesAssignment_9_2_in_rule__Event__Group_9__2__Impl6086);
            	    rule__Event__WitnessesAssignment_9_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop32;
                }
            } while (true);

             after(grammarAccess.getEventAccess().getWitnessesAssignment_9_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Event__Group_9__2__Impl"


    // $ANTLR start "rule__Event__Group_10__0"
    // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:3090:1: rule__Event__Group_10__0 : rule__Event__Group_10__0__Impl rule__Event__Group_10__1 ;
    public final void rule__Event__Group_10__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:3094:1: ( rule__Event__Group_10__0__Impl rule__Event__Group_10__1 )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:3095:2: rule__Event__Group_10__0__Impl rule__Event__Group_10__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Event__Group_10__0__Impl_in_rule__Event__Group_10__06123);
            rule__Event__Group_10__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Event__Group_10__1_in_rule__Event__Group_10__06126);
            rule__Event__Group_10__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Event__Group_10__0"


    // $ANTLR start "rule__Event__Group_10__0__Impl"
    // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:3102:1: rule__Event__Group_10__0__Impl : ( 'then' ) ;
    public final void rule__Event__Group_10__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:3106:1: ( ( 'then' ) )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:3107:1: ( 'then' )
            {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:3107:1: ( 'then' )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:3108:1: 'then'
            {
             before(grammarAccess.getEventAccess().getThenKeyword_10_0()); 
            match(input,34,FollowSets000.FOLLOW_34_in_rule__Event__Group_10__0__Impl6154); 
             after(grammarAccess.getEventAccess().getThenKeyword_10_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Event__Group_10__0__Impl"


    // $ANTLR start "rule__Event__Group_10__1"
    // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:3121:1: rule__Event__Group_10__1 : rule__Event__Group_10__1__Impl rule__Event__Group_10__2 ;
    public final void rule__Event__Group_10__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:3125:1: ( rule__Event__Group_10__1__Impl rule__Event__Group_10__2 )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:3126:2: rule__Event__Group_10__1__Impl rule__Event__Group_10__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Event__Group_10__1__Impl_in_rule__Event__Group_10__16185);
            rule__Event__Group_10__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Event__Group_10__2_in_rule__Event__Group_10__16188);
            rule__Event__Group_10__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Event__Group_10__1"


    // $ANTLR start "rule__Event__Group_10__1__Impl"
    // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:3133:1: rule__Event__Group_10__1__Impl : ( ( rule__Event__ActionsAssignment_10_1 ) ) ;
    public final void rule__Event__Group_10__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:3137:1: ( ( ( rule__Event__ActionsAssignment_10_1 ) ) )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:3138:1: ( ( rule__Event__ActionsAssignment_10_1 ) )
            {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:3138:1: ( ( rule__Event__ActionsAssignment_10_1 ) )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:3139:1: ( rule__Event__ActionsAssignment_10_1 )
            {
             before(grammarAccess.getEventAccess().getActionsAssignment_10_1()); 
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:3140:1: ( rule__Event__ActionsAssignment_10_1 )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:3140:2: rule__Event__ActionsAssignment_10_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Event__ActionsAssignment_10_1_in_rule__Event__Group_10__1__Impl6215);
            rule__Event__ActionsAssignment_10_1();

            state._fsp--;


            }

             after(grammarAccess.getEventAccess().getActionsAssignment_10_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Event__Group_10__1__Impl"


    // $ANTLR start "rule__Event__Group_10__2"
    // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:3150:1: rule__Event__Group_10__2 : rule__Event__Group_10__2__Impl ;
    public final void rule__Event__Group_10__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:3154:1: ( rule__Event__Group_10__2__Impl )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:3155:2: rule__Event__Group_10__2__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Event__Group_10__2__Impl_in_rule__Event__Group_10__26245);
            rule__Event__Group_10__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Event__Group_10__2"


    // $ANTLR start "rule__Event__Group_10__2__Impl"
    // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:3161:1: rule__Event__Group_10__2__Impl : ( ( rule__Event__ActionsAssignment_10_2 )* ) ;
    public final void rule__Event__Group_10__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:3165:1: ( ( ( rule__Event__ActionsAssignment_10_2 )* ) )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:3166:1: ( ( rule__Event__ActionsAssignment_10_2 )* )
            {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:3166:1: ( ( rule__Event__ActionsAssignment_10_2 )* )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:3167:1: ( rule__Event__ActionsAssignment_10_2 )*
            {
             before(grammarAccess.getEventAccess().getActionsAssignment_10_2()); 
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:3168:1: ( rule__Event__ActionsAssignment_10_2 )*
            loop33:
            do {
                int alt33=2;
                int LA33_0 = input.LA(1);

                if ( (LA33_0==26) ) {
                    alt33=1;
                }


                switch (alt33) {
            	case 1 :
            	    // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:3168:2: rule__Event__ActionsAssignment_10_2
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__Event__ActionsAssignment_10_2_in_rule__Event__Group_10__2__Impl6272);
            	    rule__Event__ActionsAssignment_10_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop33;
                }
            } while (true);

             after(grammarAccess.getEventAccess().getActionsAssignment_10_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Event__Group_10__2__Impl"


    // $ANTLR start "rule__Parameter__Group__0"
    // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:3184:1: rule__Parameter__Group__0 : rule__Parameter__Group__0__Impl rule__Parameter__Group__1 ;
    public final void rule__Parameter__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:3188:1: ( rule__Parameter__Group__0__Impl rule__Parameter__Group__1 )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:3189:2: rule__Parameter__Group__0__Impl rule__Parameter__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Parameter__Group__0__Impl_in_rule__Parameter__Group__06309);
            rule__Parameter__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Parameter__Group__1_in_rule__Parameter__Group__06312);
            rule__Parameter__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parameter__Group__0"


    // $ANTLR start "rule__Parameter__Group__0__Impl"
    // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:3196:1: rule__Parameter__Group__0__Impl : ( () ) ;
    public final void rule__Parameter__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:3200:1: ( ( () ) )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:3201:1: ( () )
            {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:3201:1: ( () )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:3202:1: ()
            {
             before(grammarAccess.getParameterAccess().getParameterAction_0()); 
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:3203:1: ()
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:3205:1: 
            {
            }

             after(grammarAccess.getParameterAccess().getParameterAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parameter__Group__0__Impl"


    // $ANTLR start "rule__Parameter__Group__1"
    // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:3215:1: rule__Parameter__Group__1 : rule__Parameter__Group__1__Impl rule__Parameter__Group__2 ;
    public final void rule__Parameter__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:3219:1: ( rule__Parameter__Group__1__Impl rule__Parameter__Group__2 )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:3220:2: rule__Parameter__Group__1__Impl rule__Parameter__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Parameter__Group__1__Impl_in_rule__Parameter__Group__16370);
            rule__Parameter__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Parameter__Group__2_in_rule__Parameter__Group__16373);
            rule__Parameter__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parameter__Group__1"


    // $ANTLR start "rule__Parameter__Group__1__Impl"
    // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:3227:1: rule__Parameter__Group__1__Impl : ( ( rule__Parameter__NameAssignment_1 ) ) ;
    public final void rule__Parameter__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:3231:1: ( ( ( rule__Parameter__NameAssignment_1 ) ) )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:3232:1: ( ( rule__Parameter__NameAssignment_1 ) )
            {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:3232:1: ( ( rule__Parameter__NameAssignment_1 ) )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:3233:1: ( rule__Parameter__NameAssignment_1 )
            {
             before(grammarAccess.getParameterAccess().getNameAssignment_1()); 
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:3234:1: ( rule__Parameter__NameAssignment_1 )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:3234:2: rule__Parameter__NameAssignment_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Parameter__NameAssignment_1_in_rule__Parameter__Group__1__Impl6400);
            rule__Parameter__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getParameterAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parameter__Group__1__Impl"


    // $ANTLR start "rule__Parameter__Group__2"
    // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:3244:1: rule__Parameter__Group__2 : rule__Parameter__Group__2__Impl ;
    public final void rule__Parameter__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:3248:1: ( rule__Parameter__Group__2__Impl )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:3249:2: rule__Parameter__Group__2__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Parameter__Group__2__Impl_in_rule__Parameter__Group__26430);
            rule__Parameter__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parameter__Group__2"


    // $ANTLR start "rule__Parameter__Group__2__Impl"
    // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:3255:1: rule__Parameter__Group__2__Impl : ( ( rule__Parameter__Group_2__0 )? ) ;
    public final void rule__Parameter__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:3259:1: ( ( ( rule__Parameter__Group_2__0 )? ) )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:3260:1: ( ( rule__Parameter__Group_2__0 )? )
            {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:3260:1: ( ( rule__Parameter__Group_2__0 )? )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:3261:1: ( rule__Parameter__Group_2__0 )?
            {
             before(grammarAccess.getParameterAccess().getGroup_2()); 
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:3262:1: ( rule__Parameter__Group_2__0 )?
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( (LA34_0==16) ) {
                alt34=1;
            }
            switch (alt34) {
                case 1 :
                    // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:3262:2: rule__Parameter__Group_2__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__Parameter__Group_2__0_in_rule__Parameter__Group__2__Impl6457);
                    rule__Parameter__Group_2__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getParameterAccess().getGroup_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parameter__Group__2__Impl"


    // $ANTLR start "rule__Parameter__Group_2__0"
    // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:3278:1: rule__Parameter__Group_2__0 : rule__Parameter__Group_2__0__Impl rule__Parameter__Group_2__1 ;
    public final void rule__Parameter__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:3282:1: ( rule__Parameter__Group_2__0__Impl rule__Parameter__Group_2__1 )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:3283:2: rule__Parameter__Group_2__0__Impl rule__Parameter__Group_2__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Parameter__Group_2__0__Impl_in_rule__Parameter__Group_2__06494);
            rule__Parameter__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Parameter__Group_2__1_in_rule__Parameter__Group_2__06497);
            rule__Parameter__Group_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parameter__Group_2__0"


    // $ANTLR start "rule__Parameter__Group_2__0__Impl"
    // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:3290:1: rule__Parameter__Group_2__0__Impl : ( '//' ) ;
    public final void rule__Parameter__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:3294:1: ( ( '//' ) )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:3295:1: ( '//' )
            {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:3295:1: ( '//' )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:3296:1: '//'
            {
             before(grammarAccess.getParameterAccess().getSolidusSolidusKeyword_2_0()); 
            match(input,16,FollowSets000.FOLLOW_16_in_rule__Parameter__Group_2__0__Impl6525); 
             after(grammarAccess.getParameterAccess().getSolidusSolidusKeyword_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parameter__Group_2__0__Impl"


    // $ANTLR start "rule__Parameter__Group_2__1"
    // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:3309:1: rule__Parameter__Group_2__1 : rule__Parameter__Group_2__1__Impl ;
    public final void rule__Parameter__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:3313:1: ( rule__Parameter__Group_2__1__Impl )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:3314:2: rule__Parameter__Group_2__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Parameter__Group_2__1__Impl_in_rule__Parameter__Group_2__16556);
            rule__Parameter__Group_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parameter__Group_2__1"


    // $ANTLR start "rule__Parameter__Group_2__1__Impl"
    // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:3320:1: rule__Parameter__Group_2__1__Impl : ( ( rule__Parameter__CommentAssignment_2_1 ) ) ;
    public final void rule__Parameter__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:3324:1: ( ( ( rule__Parameter__CommentAssignment_2_1 ) ) )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:3325:1: ( ( rule__Parameter__CommentAssignment_2_1 ) )
            {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:3325:1: ( ( rule__Parameter__CommentAssignment_2_1 ) )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:3326:1: ( rule__Parameter__CommentAssignment_2_1 )
            {
             before(grammarAccess.getParameterAccess().getCommentAssignment_2_1()); 
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:3327:1: ( rule__Parameter__CommentAssignment_2_1 )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:3327:2: rule__Parameter__CommentAssignment_2_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Parameter__CommentAssignment_2_1_in_rule__Parameter__Group_2__1__Impl6583);
            rule__Parameter__CommentAssignment_2_1();

            state._fsp--;


            }

             after(grammarAccess.getParameterAccess().getCommentAssignment_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parameter__Group_2__1__Impl"


    // $ANTLR start "rule__Guard__Group__0"
    // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:3341:1: rule__Guard__Group__0 : rule__Guard__Group__0__Impl rule__Guard__Group__1 ;
    public final void rule__Guard__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:3345:1: ( rule__Guard__Group__0__Impl rule__Guard__Group__1 )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:3346:2: rule__Guard__Group__0__Impl rule__Guard__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Guard__Group__0__Impl_in_rule__Guard__Group__06617);
            rule__Guard__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Guard__Group__1_in_rule__Guard__Group__06620);
            rule__Guard__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Guard__Group__0"


    // $ANTLR start "rule__Guard__Group__0__Impl"
    // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:3353:1: rule__Guard__Group__0__Impl : ( '@' ) ;
    public final void rule__Guard__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:3357:1: ( ( '@' ) )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:3358:1: ( '@' )
            {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:3358:1: ( '@' )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:3359:1: '@'
            {
             before(grammarAccess.getGuardAccess().getCommercialAtKeyword_0()); 
            match(input,26,FollowSets000.FOLLOW_26_in_rule__Guard__Group__0__Impl6648); 
             after(grammarAccess.getGuardAccess().getCommercialAtKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Guard__Group__0__Impl"


    // $ANTLR start "rule__Guard__Group__1"
    // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:3372:1: rule__Guard__Group__1 : rule__Guard__Group__1__Impl rule__Guard__Group__2 ;
    public final void rule__Guard__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:3376:1: ( rule__Guard__Group__1__Impl rule__Guard__Group__2 )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:3377:2: rule__Guard__Group__1__Impl rule__Guard__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Guard__Group__1__Impl_in_rule__Guard__Group__16679);
            rule__Guard__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Guard__Group__2_in_rule__Guard__Group__16682);
            rule__Guard__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Guard__Group__1"


    // $ANTLR start "rule__Guard__Group__1__Impl"
    // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:3384:1: rule__Guard__Group__1__Impl : ( ( rule__Guard__NameAssignment_1 ) ) ;
    public final void rule__Guard__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:3388:1: ( ( ( rule__Guard__NameAssignment_1 ) ) )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:3389:1: ( ( rule__Guard__NameAssignment_1 ) )
            {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:3389:1: ( ( rule__Guard__NameAssignment_1 ) )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:3390:1: ( rule__Guard__NameAssignment_1 )
            {
             before(grammarAccess.getGuardAccess().getNameAssignment_1()); 
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:3391:1: ( rule__Guard__NameAssignment_1 )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:3391:2: rule__Guard__NameAssignment_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Guard__NameAssignment_1_in_rule__Guard__Group__1__Impl6709);
            rule__Guard__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getGuardAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Guard__Group__1__Impl"


    // $ANTLR start "rule__Guard__Group__2"
    // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:3401:1: rule__Guard__Group__2 : rule__Guard__Group__2__Impl rule__Guard__Group__3 ;
    public final void rule__Guard__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:3405:1: ( rule__Guard__Group__2__Impl rule__Guard__Group__3 )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:3406:2: rule__Guard__Group__2__Impl rule__Guard__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__Guard__Group__2__Impl_in_rule__Guard__Group__26739);
            rule__Guard__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Guard__Group__3_in_rule__Guard__Group__26742);
            rule__Guard__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Guard__Group__2"


    // $ANTLR start "rule__Guard__Group__2__Impl"
    // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:3413:1: rule__Guard__Group__2__Impl : ( ( rule__Guard__TheoremAssignment_2 )? ) ;
    public final void rule__Guard__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:3417:1: ( ( ( rule__Guard__TheoremAssignment_2 )? ) )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:3418:1: ( ( rule__Guard__TheoremAssignment_2 )? )
            {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:3418:1: ( ( rule__Guard__TheoremAssignment_2 )? )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:3419:1: ( rule__Guard__TheoremAssignment_2 )?
            {
             before(grammarAccess.getGuardAccess().getTheoremAssignment_2()); 
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:3420:1: ( rule__Guard__TheoremAssignment_2 )?
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( (LA35_0==37) ) {
                alt35=1;
            }
            switch (alt35) {
                case 1 :
                    // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:3420:2: rule__Guard__TheoremAssignment_2
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__Guard__TheoremAssignment_2_in_rule__Guard__Group__2__Impl6769);
                    rule__Guard__TheoremAssignment_2();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getGuardAccess().getTheoremAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Guard__Group__2__Impl"


    // $ANTLR start "rule__Guard__Group__3"
    // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:3430:1: rule__Guard__Group__3 : rule__Guard__Group__3__Impl rule__Guard__Group__4 ;
    public final void rule__Guard__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:3434:1: ( rule__Guard__Group__3__Impl rule__Guard__Group__4 )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:3435:2: rule__Guard__Group__3__Impl rule__Guard__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__Guard__Group__3__Impl_in_rule__Guard__Group__36800);
            rule__Guard__Group__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Guard__Group__4_in_rule__Guard__Group__36803);
            rule__Guard__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Guard__Group__3"


    // $ANTLR start "rule__Guard__Group__3__Impl"
    // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:3442:1: rule__Guard__Group__3__Impl : ( ( rule__Guard__PredicateAssignment_3 ) ) ;
    public final void rule__Guard__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:3446:1: ( ( ( rule__Guard__PredicateAssignment_3 ) ) )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:3447:1: ( ( rule__Guard__PredicateAssignment_3 ) )
            {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:3447:1: ( ( rule__Guard__PredicateAssignment_3 ) )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:3448:1: ( rule__Guard__PredicateAssignment_3 )
            {
             before(grammarAccess.getGuardAccess().getPredicateAssignment_3()); 
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:3449:1: ( rule__Guard__PredicateAssignment_3 )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:3449:2: rule__Guard__PredicateAssignment_3
            {
            pushFollow(FollowSets000.FOLLOW_rule__Guard__PredicateAssignment_3_in_rule__Guard__Group__3__Impl6830);
            rule__Guard__PredicateAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getGuardAccess().getPredicateAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Guard__Group__3__Impl"


    // $ANTLR start "rule__Guard__Group__4"
    // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:3459:1: rule__Guard__Group__4 : rule__Guard__Group__4__Impl ;
    public final void rule__Guard__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:3463:1: ( rule__Guard__Group__4__Impl )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:3464:2: rule__Guard__Group__4__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Guard__Group__4__Impl_in_rule__Guard__Group__46860);
            rule__Guard__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Guard__Group__4"


    // $ANTLR start "rule__Guard__Group__4__Impl"
    // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:3470:1: rule__Guard__Group__4__Impl : ( ( rule__Guard__Group_4__0 )? ) ;
    public final void rule__Guard__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:3474:1: ( ( ( rule__Guard__Group_4__0 )? ) )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:3475:1: ( ( rule__Guard__Group_4__0 )? )
            {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:3475:1: ( ( rule__Guard__Group_4__0 )? )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:3476:1: ( rule__Guard__Group_4__0 )?
            {
             before(grammarAccess.getGuardAccess().getGroup_4()); 
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:3477:1: ( rule__Guard__Group_4__0 )?
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( (LA36_0==16) ) {
                alt36=1;
            }
            switch (alt36) {
                case 1 :
                    // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:3477:2: rule__Guard__Group_4__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__Guard__Group_4__0_in_rule__Guard__Group__4__Impl6887);
                    rule__Guard__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getGuardAccess().getGroup_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Guard__Group__4__Impl"


    // $ANTLR start "rule__Guard__Group_4__0"
    // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:3497:1: rule__Guard__Group_4__0 : rule__Guard__Group_4__0__Impl rule__Guard__Group_4__1 ;
    public final void rule__Guard__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:3501:1: ( rule__Guard__Group_4__0__Impl rule__Guard__Group_4__1 )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:3502:2: rule__Guard__Group_4__0__Impl rule__Guard__Group_4__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Guard__Group_4__0__Impl_in_rule__Guard__Group_4__06928);
            rule__Guard__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Guard__Group_4__1_in_rule__Guard__Group_4__06931);
            rule__Guard__Group_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Guard__Group_4__0"


    // $ANTLR start "rule__Guard__Group_4__0__Impl"
    // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:3509:1: rule__Guard__Group_4__0__Impl : ( '//' ) ;
    public final void rule__Guard__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:3513:1: ( ( '//' ) )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:3514:1: ( '//' )
            {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:3514:1: ( '//' )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:3515:1: '//'
            {
             before(grammarAccess.getGuardAccess().getSolidusSolidusKeyword_4_0()); 
            match(input,16,FollowSets000.FOLLOW_16_in_rule__Guard__Group_4__0__Impl6959); 
             after(grammarAccess.getGuardAccess().getSolidusSolidusKeyword_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Guard__Group_4__0__Impl"


    // $ANTLR start "rule__Guard__Group_4__1"
    // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:3528:1: rule__Guard__Group_4__1 : rule__Guard__Group_4__1__Impl ;
    public final void rule__Guard__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:3532:1: ( rule__Guard__Group_4__1__Impl )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:3533:2: rule__Guard__Group_4__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Guard__Group_4__1__Impl_in_rule__Guard__Group_4__16990);
            rule__Guard__Group_4__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Guard__Group_4__1"


    // $ANTLR start "rule__Guard__Group_4__1__Impl"
    // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:3539:1: rule__Guard__Group_4__1__Impl : ( ( rule__Guard__CommentAssignment_4_1 ) ) ;
    public final void rule__Guard__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:3543:1: ( ( ( rule__Guard__CommentAssignment_4_1 ) ) )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:3544:1: ( ( rule__Guard__CommentAssignment_4_1 ) )
            {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:3544:1: ( ( rule__Guard__CommentAssignment_4_1 ) )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:3545:1: ( rule__Guard__CommentAssignment_4_1 )
            {
             before(grammarAccess.getGuardAccess().getCommentAssignment_4_1()); 
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:3546:1: ( rule__Guard__CommentAssignment_4_1 )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:3546:2: rule__Guard__CommentAssignment_4_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Guard__CommentAssignment_4_1_in_rule__Guard__Group_4__1__Impl7017);
            rule__Guard__CommentAssignment_4_1();

            state._fsp--;


            }

             after(grammarAccess.getGuardAccess().getCommentAssignment_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Guard__Group_4__1__Impl"


    // $ANTLR start "rule__Witness__Group__0"
    // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:3560:1: rule__Witness__Group__0 : rule__Witness__Group__0__Impl rule__Witness__Group__1 ;
    public final void rule__Witness__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:3564:1: ( rule__Witness__Group__0__Impl rule__Witness__Group__1 )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:3565:2: rule__Witness__Group__0__Impl rule__Witness__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Witness__Group__0__Impl_in_rule__Witness__Group__07051);
            rule__Witness__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Witness__Group__1_in_rule__Witness__Group__07054);
            rule__Witness__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Witness__Group__0"


    // $ANTLR start "rule__Witness__Group__0__Impl"
    // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:3572:1: rule__Witness__Group__0__Impl : ( ( rule__Witness__LocalGeneratedAssignment_0 )? ) ;
    public final void rule__Witness__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:3576:1: ( ( ( rule__Witness__LocalGeneratedAssignment_0 )? ) )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:3577:1: ( ( rule__Witness__LocalGeneratedAssignment_0 )? )
            {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:3577:1: ( ( rule__Witness__LocalGeneratedAssignment_0 )? )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:3578:1: ( rule__Witness__LocalGeneratedAssignment_0 )?
            {
             before(grammarAccess.getWitnessAccess().getLocalGeneratedAssignment_0()); 
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:3579:1: ( rule__Witness__LocalGeneratedAssignment_0 )?
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( (LA37_0==39) ) {
                alt37=1;
            }
            switch (alt37) {
                case 1 :
                    // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:3579:2: rule__Witness__LocalGeneratedAssignment_0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__Witness__LocalGeneratedAssignment_0_in_rule__Witness__Group__0__Impl7081);
                    rule__Witness__LocalGeneratedAssignment_0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getWitnessAccess().getLocalGeneratedAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Witness__Group__0__Impl"


    // $ANTLR start "rule__Witness__Group__1"
    // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:3589:1: rule__Witness__Group__1 : rule__Witness__Group__1__Impl rule__Witness__Group__2 ;
    public final void rule__Witness__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:3593:1: ( rule__Witness__Group__1__Impl rule__Witness__Group__2 )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:3594:2: rule__Witness__Group__1__Impl rule__Witness__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Witness__Group__1__Impl_in_rule__Witness__Group__17112);
            rule__Witness__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Witness__Group__2_in_rule__Witness__Group__17115);
            rule__Witness__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Witness__Group__1"


    // $ANTLR start "rule__Witness__Group__1__Impl"
    // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:3601:1: rule__Witness__Group__1__Impl : ( 'witness' ) ;
    public final void rule__Witness__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:3605:1: ( ( 'witness' ) )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:3606:1: ( 'witness' )
            {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:3606:1: ( 'witness' )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:3607:1: 'witness'
            {
             before(grammarAccess.getWitnessAccess().getWitnessKeyword_1()); 
            match(input,35,FollowSets000.FOLLOW_35_in_rule__Witness__Group__1__Impl7143); 
             after(grammarAccess.getWitnessAccess().getWitnessKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Witness__Group__1__Impl"


    // $ANTLR start "rule__Witness__Group__2"
    // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:3620:1: rule__Witness__Group__2 : rule__Witness__Group__2__Impl rule__Witness__Group__3 ;
    public final void rule__Witness__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:3624:1: ( rule__Witness__Group__2__Impl rule__Witness__Group__3 )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:3625:2: rule__Witness__Group__2__Impl rule__Witness__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__Witness__Group__2__Impl_in_rule__Witness__Group__27174);
            rule__Witness__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Witness__Group__3_in_rule__Witness__Group__27177);
            rule__Witness__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Witness__Group__2"


    // $ANTLR start "rule__Witness__Group__2__Impl"
    // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:3632:1: rule__Witness__Group__2__Impl : ( '@' ) ;
    public final void rule__Witness__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:3636:1: ( ( '@' ) )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:3637:1: ( '@' )
            {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:3637:1: ( '@' )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:3638:1: '@'
            {
             before(grammarAccess.getWitnessAccess().getCommercialAtKeyword_2()); 
            match(input,26,FollowSets000.FOLLOW_26_in_rule__Witness__Group__2__Impl7205); 
             after(grammarAccess.getWitnessAccess().getCommercialAtKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Witness__Group__2__Impl"


    // $ANTLR start "rule__Witness__Group__3"
    // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:3651:1: rule__Witness__Group__3 : rule__Witness__Group__3__Impl rule__Witness__Group__4 ;
    public final void rule__Witness__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:3655:1: ( rule__Witness__Group__3__Impl rule__Witness__Group__4 )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:3656:2: rule__Witness__Group__3__Impl rule__Witness__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__Witness__Group__3__Impl_in_rule__Witness__Group__37236);
            rule__Witness__Group__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Witness__Group__4_in_rule__Witness__Group__37239);
            rule__Witness__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Witness__Group__3"


    // $ANTLR start "rule__Witness__Group__3__Impl"
    // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:3663:1: rule__Witness__Group__3__Impl : ( ( rule__Witness__NameAssignment_3 ) ) ;
    public final void rule__Witness__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:3667:1: ( ( ( rule__Witness__NameAssignment_3 ) ) )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:3668:1: ( ( rule__Witness__NameAssignment_3 ) )
            {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:3668:1: ( ( rule__Witness__NameAssignment_3 ) )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:3669:1: ( rule__Witness__NameAssignment_3 )
            {
             before(grammarAccess.getWitnessAccess().getNameAssignment_3()); 
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:3670:1: ( rule__Witness__NameAssignment_3 )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:3670:2: rule__Witness__NameAssignment_3
            {
            pushFollow(FollowSets000.FOLLOW_rule__Witness__NameAssignment_3_in_rule__Witness__Group__3__Impl7266);
            rule__Witness__NameAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getWitnessAccess().getNameAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Witness__Group__3__Impl"


    // $ANTLR start "rule__Witness__Group__4"
    // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:3680:1: rule__Witness__Group__4 : rule__Witness__Group__4__Impl rule__Witness__Group__5 ;
    public final void rule__Witness__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:3684:1: ( rule__Witness__Group__4__Impl rule__Witness__Group__5 )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:3685:2: rule__Witness__Group__4__Impl rule__Witness__Group__5
            {
            pushFollow(FollowSets000.FOLLOW_rule__Witness__Group__4__Impl_in_rule__Witness__Group__47296);
            rule__Witness__Group__4__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Witness__Group__5_in_rule__Witness__Group__47299);
            rule__Witness__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Witness__Group__4"


    // $ANTLR start "rule__Witness__Group__4__Impl"
    // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:3692:1: rule__Witness__Group__4__Impl : ( 'predicate' ) ;
    public final void rule__Witness__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:3696:1: ( ( 'predicate' ) )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:3697:1: ( 'predicate' )
            {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:3697:1: ( 'predicate' )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:3698:1: 'predicate'
            {
             before(grammarAccess.getWitnessAccess().getPredicateKeyword_4()); 
            match(input,36,FollowSets000.FOLLOW_36_in_rule__Witness__Group__4__Impl7327); 
             after(grammarAccess.getWitnessAccess().getPredicateKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Witness__Group__4__Impl"


    // $ANTLR start "rule__Witness__Group__5"
    // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:3711:1: rule__Witness__Group__5 : rule__Witness__Group__5__Impl rule__Witness__Group__6 ;
    public final void rule__Witness__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:3715:1: ( rule__Witness__Group__5__Impl rule__Witness__Group__6 )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:3716:2: rule__Witness__Group__5__Impl rule__Witness__Group__6
            {
            pushFollow(FollowSets000.FOLLOW_rule__Witness__Group__5__Impl_in_rule__Witness__Group__57358);
            rule__Witness__Group__5__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Witness__Group__6_in_rule__Witness__Group__57361);
            rule__Witness__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Witness__Group__5"


    // $ANTLR start "rule__Witness__Group__5__Impl"
    // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:3723:1: rule__Witness__Group__5__Impl : ( ( rule__Witness__PredicateAssignment_5 )? ) ;
    public final void rule__Witness__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:3727:1: ( ( ( rule__Witness__PredicateAssignment_5 )? ) )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:3728:1: ( ( rule__Witness__PredicateAssignment_5 )? )
            {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:3728:1: ( ( rule__Witness__PredicateAssignment_5 )? )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:3729:1: ( rule__Witness__PredicateAssignment_5 )?
            {
             before(grammarAccess.getWitnessAccess().getPredicateAssignment_5()); 
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:3730:1: ( rule__Witness__PredicateAssignment_5 )?
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( ((LA38_0>=RULE_STRING && LA38_0<=RULE_ID)) ) {
                alt38=1;
            }
            switch (alt38) {
                case 1 :
                    // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:3730:2: rule__Witness__PredicateAssignment_5
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__Witness__PredicateAssignment_5_in_rule__Witness__Group__5__Impl7388);
                    rule__Witness__PredicateAssignment_5();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getWitnessAccess().getPredicateAssignment_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Witness__Group__5__Impl"


    // $ANTLR start "rule__Witness__Group__6"
    // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:3740:1: rule__Witness__Group__6 : rule__Witness__Group__6__Impl ;
    public final void rule__Witness__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:3744:1: ( rule__Witness__Group__6__Impl )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:3745:2: rule__Witness__Group__6__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Witness__Group__6__Impl_in_rule__Witness__Group__67419);
            rule__Witness__Group__6__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Witness__Group__6"


    // $ANTLR start "rule__Witness__Group__6__Impl"
    // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:3751:1: rule__Witness__Group__6__Impl : ( ( rule__Witness__Group_6__0 )? ) ;
    public final void rule__Witness__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:3755:1: ( ( ( rule__Witness__Group_6__0 )? ) )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:3756:1: ( ( rule__Witness__Group_6__0 )? )
            {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:3756:1: ( ( rule__Witness__Group_6__0 )? )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:3757:1: ( rule__Witness__Group_6__0 )?
            {
             before(grammarAccess.getWitnessAccess().getGroup_6()); 
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:3758:1: ( rule__Witness__Group_6__0 )?
            int alt39=2;
            int LA39_0 = input.LA(1);

            if ( (LA39_0==16) ) {
                alt39=1;
            }
            switch (alt39) {
                case 1 :
                    // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:3758:2: rule__Witness__Group_6__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__Witness__Group_6__0_in_rule__Witness__Group__6__Impl7446);
                    rule__Witness__Group_6__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getWitnessAccess().getGroup_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Witness__Group__6__Impl"


    // $ANTLR start "rule__Witness__Group_6__0"
    // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:3782:1: rule__Witness__Group_6__0 : rule__Witness__Group_6__0__Impl rule__Witness__Group_6__1 ;
    public final void rule__Witness__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:3786:1: ( rule__Witness__Group_6__0__Impl rule__Witness__Group_6__1 )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:3787:2: rule__Witness__Group_6__0__Impl rule__Witness__Group_6__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Witness__Group_6__0__Impl_in_rule__Witness__Group_6__07491);
            rule__Witness__Group_6__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Witness__Group_6__1_in_rule__Witness__Group_6__07494);
            rule__Witness__Group_6__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Witness__Group_6__0"


    // $ANTLR start "rule__Witness__Group_6__0__Impl"
    // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:3794:1: rule__Witness__Group_6__0__Impl : ( '//' ) ;
    public final void rule__Witness__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:3798:1: ( ( '//' ) )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:3799:1: ( '//' )
            {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:3799:1: ( '//' )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:3800:1: '//'
            {
             before(grammarAccess.getWitnessAccess().getSolidusSolidusKeyword_6_0()); 
            match(input,16,FollowSets000.FOLLOW_16_in_rule__Witness__Group_6__0__Impl7522); 
             after(grammarAccess.getWitnessAccess().getSolidusSolidusKeyword_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Witness__Group_6__0__Impl"


    // $ANTLR start "rule__Witness__Group_6__1"
    // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:3813:1: rule__Witness__Group_6__1 : rule__Witness__Group_6__1__Impl ;
    public final void rule__Witness__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:3817:1: ( rule__Witness__Group_6__1__Impl )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:3818:2: rule__Witness__Group_6__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Witness__Group_6__1__Impl_in_rule__Witness__Group_6__17553);
            rule__Witness__Group_6__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Witness__Group_6__1"


    // $ANTLR start "rule__Witness__Group_6__1__Impl"
    // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:3824:1: rule__Witness__Group_6__1__Impl : ( ( rule__Witness__CommentAssignment_6_1 ) ) ;
    public final void rule__Witness__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:3828:1: ( ( ( rule__Witness__CommentAssignment_6_1 ) ) )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:3829:1: ( ( rule__Witness__CommentAssignment_6_1 ) )
            {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:3829:1: ( ( rule__Witness__CommentAssignment_6_1 ) )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:3830:1: ( rule__Witness__CommentAssignment_6_1 )
            {
             before(grammarAccess.getWitnessAccess().getCommentAssignment_6_1()); 
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:3831:1: ( rule__Witness__CommentAssignment_6_1 )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:3831:2: rule__Witness__CommentAssignment_6_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Witness__CommentAssignment_6_1_in_rule__Witness__Group_6__1__Impl7580);
            rule__Witness__CommentAssignment_6_1();

            state._fsp--;


            }

             after(grammarAccess.getWitnessAccess().getCommentAssignment_6_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Witness__Group_6__1__Impl"


    // $ANTLR start "rule__Action__Group__0"
    // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:3845:1: rule__Action__Group__0 : rule__Action__Group__0__Impl rule__Action__Group__1 ;
    public final void rule__Action__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:3849:1: ( rule__Action__Group__0__Impl rule__Action__Group__1 )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:3850:2: rule__Action__Group__0__Impl rule__Action__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Action__Group__0__Impl_in_rule__Action__Group__07614);
            rule__Action__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Action__Group__1_in_rule__Action__Group__07617);
            rule__Action__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Action__Group__0"


    // $ANTLR start "rule__Action__Group__0__Impl"
    // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:3857:1: rule__Action__Group__0__Impl : ( '@' ) ;
    public final void rule__Action__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:3861:1: ( ( '@' ) )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:3862:1: ( '@' )
            {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:3862:1: ( '@' )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:3863:1: '@'
            {
             before(grammarAccess.getActionAccess().getCommercialAtKeyword_0()); 
            match(input,26,FollowSets000.FOLLOW_26_in_rule__Action__Group__0__Impl7645); 
             after(grammarAccess.getActionAccess().getCommercialAtKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Action__Group__0__Impl"


    // $ANTLR start "rule__Action__Group__1"
    // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:3876:1: rule__Action__Group__1 : rule__Action__Group__1__Impl rule__Action__Group__2 ;
    public final void rule__Action__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:3880:1: ( rule__Action__Group__1__Impl rule__Action__Group__2 )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:3881:2: rule__Action__Group__1__Impl rule__Action__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Action__Group__1__Impl_in_rule__Action__Group__17676);
            rule__Action__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Action__Group__2_in_rule__Action__Group__17679);
            rule__Action__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Action__Group__1"


    // $ANTLR start "rule__Action__Group__1__Impl"
    // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:3888:1: rule__Action__Group__1__Impl : ( ( rule__Action__NameAssignment_1 ) ) ;
    public final void rule__Action__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:3892:1: ( ( ( rule__Action__NameAssignment_1 ) ) )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:3893:1: ( ( rule__Action__NameAssignment_1 ) )
            {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:3893:1: ( ( rule__Action__NameAssignment_1 ) )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:3894:1: ( rule__Action__NameAssignment_1 )
            {
             before(grammarAccess.getActionAccess().getNameAssignment_1()); 
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:3895:1: ( rule__Action__NameAssignment_1 )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:3895:2: rule__Action__NameAssignment_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Action__NameAssignment_1_in_rule__Action__Group__1__Impl7706);
            rule__Action__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getActionAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Action__Group__1__Impl"


    // $ANTLR start "rule__Action__Group__2"
    // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:3905:1: rule__Action__Group__2 : rule__Action__Group__2__Impl rule__Action__Group__3 ;
    public final void rule__Action__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:3909:1: ( rule__Action__Group__2__Impl rule__Action__Group__3 )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:3910:2: rule__Action__Group__2__Impl rule__Action__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__Action__Group__2__Impl_in_rule__Action__Group__27736);
            rule__Action__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Action__Group__3_in_rule__Action__Group__27739);
            rule__Action__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Action__Group__2"


    // $ANTLR start "rule__Action__Group__2__Impl"
    // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:3917:1: rule__Action__Group__2__Impl : ( ( rule__Action__ActionAssignment_2 )? ) ;
    public final void rule__Action__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:3921:1: ( ( ( rule__Action__ActionAssignment_2 )? ) )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:3922:1: ( ( rule__Action__ActionAssignment_2 )? )
            {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:3922:1: ( ( rule__Action__ActionAssignment_2 )? )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:3923:1: ( rule__Action__ActionAssignment_2 )?
            {
             before(grammarAccess.getActionAccess().getActionAssignment_2()); 
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:3924:1: ( rule__Action__ActionAssignment_2 )?
            int alt40=2;
            int LA40_0 = input.LA(1);

            if ( ((LA40_0>=RULE_STRING && LA40_0<=RULE_ID)) ) {
                alt40=1;
            }
            switch (alt40) {
                case 1 :
                    // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:3924:2: rule__Action__ActionAssignment_2
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__Action__ActionAssignment_2_in_rule__Action__Group__2__Impl7766);
                    rule__Action__ActionAssignment_2();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getActionAccess().getActionAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Action__Group__2__Impl"


    // $ANTLR start "rule__Action__Group__3"
    // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:3934:1: rule__Action__Group__3 : rule__Action__Group__3__Impl ;
    public final void rule__Action__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:3938:1: ( rule__Action__Group__3__Impl )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:3939:2: rule__Action__Group__3__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Action__Group__3__Impl_in_rule__Action__Group__37797);
            rule__Action__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Action__Group__3"


    // $ANTLR start "rule__Action__Group__3__Impl"
    // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:3945:1: rule__Action__Group__3__Impl : ( ( rule__Action__Group_3__0 )? ) ;
    public final void rule__Action__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:3949:1: ( ( ( rule__Action__Group_3__0 )? ) )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:3950:1: ( ( rule__Action__Group_3__0 )? )
            {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:3950:1: ( ( rule__Action__Group_3__0 )? )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:3951:1: ( rule__Action__Group_3__0 )?
            {
             before(grammarAccess.getActionAccess().getGroup_3()); 
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:3952:1: ( rule__Action__Group_3__0 )?
            int alt41=2;
            int LA41_0 = input.LA(1);

            if ( (LA41_0==16) ) {
                alt41=1;
            }
            switch (alt41) {
                case 1 :
                    // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:3952:2: rule__Action__Group_3__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__Action__Group_3__0_in_rule__Action__Group__3__Impl7824);
                    rule__Action__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getActionAccess().getGroup_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Action__Group__3__Impl"


    // $ANTLR start "rule__Action__Group_3__0"
    // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:3970:1: rule__Action__Group_3__0 : rule__Action__Group_3__0__Impl rule__Action__Group_3__1 ;
    public final void rule__Action__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:3974:1: ( rule__Action__Group_3__0__Impl rule__Action__Group_3__1 )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:3975:2: rule__Action__Group_3__0__Impl rule__Action__Group_3__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Action__Group_3__0__Impl_in_rule__Action__Group_3__07863);
            rule__Action__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Action__Group_3__1_in_rule__Action__Group_3__07866);
            rule__Action__Group_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Action__Group_3__0"


    // $ANTLR start "rule__Action__Group_3__0__Impl"
    // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:3982:1: rule__Action__Group_3__0__Impl : ( '//' ) ;
    public final void rule__Action__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:3986:1: ( ( '//' ) )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:3987:1: ( '//' )
            {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:3987:1: ( '//' )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:3988:1: '//'
            {
             before(grammarAccess.getActionAccess().getSolidusSolidusKeyword_3_0()); 
            match(input,16,FollowSets000.FOLLOW_16_in_rule__Action__Group_3__0__Impl7894); 
             after(grammarAccess.getActionAccess().getSolidusSolidusKeyword_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Action__Group_3__0__Impl"


    // $ANTLR start "rule__Action__Group_3__1"
    // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:4001:1: rule__Action__Group_3__1 : rule__Action__Group_3__1__Impl ;
    public final void rule__Action__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:4005:1: ( rule__Action__Group_3__1__Impl )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:4006:2: rule__Action__Group_3__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Action__Group_3__1__Impl_in_rule__Action__Group_3__17925);
            rule__Action__Group_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Action__Group_3__1"


    // $ANTLR start "rule__Action__Group_3__1__Impl"
    // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:4012:1: rule__Action__Group_3__1__Impl : ( ( rule__Action__CommentAssignment_3_1 ) ) ;
    public final void rule__Action__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:4016:1: ( ( ( rule__Action__CommentAssignment_3_1 ) ) )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:4017:1: ( ( rule__Action__CommentAssignment_3_1 ) )
            {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:4017:1: ( ( rule__Action__CommentAssignment_3_1 ) )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:4018:1: ( rule__Action__CommentAssignment_3_1 )
            {
             before(grammarAccess.getActionAccess().getCommentAssignment_3_1()); 
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:4019:1: ( rule__Action__CommentAssignment_3_1 )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:4019:2: rule__Action__CommentAssignment_3_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Action__CommentAssignment_3_1_in_rule__Action__Group_3__1__Impl7952);
            rule__Action__CommentAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getActionAccess().getCommentAssignment_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Action__Group_3__1__Impl"


    // $ANTLR start "rule__Machine__NameAssignment_2"
    // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:4034:1: rule__Machine__NameAssignment_2 : ( ruleEString ) ;
    public final void rule__Machine__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:4038:1: ( ( ruleEString ) )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:4039:1: ( ruleEString )
            {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:4039:1: ( ruleEString )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:4040:1: ruleEString
            {
             before(grammarAccess.getMachineAccess().getNameEStringParserRuleCall_2_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__Machine__NameAssignment_27991);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getMachineAccess().getNameEStringParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Machine__NameAssignment_2"


    // $ANTLR start "rule__Machine__CommentAssignment_3_1"
    // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:4049:1: rule__Machine__CommentAssignment_3_1 : ( ruleEString ) ;
    public final void rule__Machine__CommentAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:4053:1: ( ( ruleEString ) )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:4054:1: ( ruleEString )
            {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:4054:1: ( ruleEString )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:4055:1: ruleEString
            {
             before(grammarAccess.getMachineAccess().getCommentEStringParserRuleCall_3_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__Machine__CommentAssignment_3_18022);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getMachineAccess().getCommentEStringParserRuleCall_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Machine__CommentAssignment_3_1"


    // $ANTLR start "rule__Machine__RefinesAssignment_4_1"
    // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:4064:1: rule__Machine__RefinesAssignment_4_1 : ( ( ruleEString ) ) ;
    public final void rule__Machine__RefinesAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:4068:1: ( ( ( ruleEString ) ) )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:4069:1: ( ( ruleEString ) )
            {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:4069:1: ( ( ruleEString ) )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:4070:1: ( ruleEString )
            {
             before(grammarAccess.getMachineAccess().getRefinesMachineCrossReference_4_1_0()); 
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:4071:1: ( ruleEString )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:4072:1: ruleEString
            {
             before(grammarAccess.getMachineAccess().getRefinesMachineEStringParserRuleCall_4_1_0_1()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__Machine__RefinesAssignment_4_18057);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getMachineAccess().getRefinesMachineEStringParserRuleCall_4_1_0_1()); 

            }

             after(grammarAccess.getMachineAccess().getRefinesMachineCrossReference_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Machine__RefinesAssignment_4_1"


    // $ANTLR start "rule__Machine__RefinesAssignment_4_2_1"
    // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:4083:1: rule__Machine__RefinesAssignment_4_2_1 : ( ( ruleEString ) ) ;
    public final void rule__Machine__RefinesAssignment_4_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:4087:1: ( ( ( ruleEString ) ) )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:4088:1: ( ( ruleEString ) )
            {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:4088:1: ( ( ruleEString ) )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:4089:1: ( ruleEString )
            {
             before(grammarAccess.getMachineAccess().getRefinesMachineCrossReference_4_2_1_0()); 
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:4090:1: ( ruleEString )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:4091:1: ruleEString
            {
             before(grammarAccess.getMachineAccess().getRefinesMachineEStringParserRuleCall_4_2_1_0_1()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__Machine__RefinesAssignment_4_2_18096);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getMachineAccess().getRefinesMachineEStringParserRuleCall_4_2_1_0_1()); 

            }

             after(grammarAccess.getMachineAccess().getRefinesMachineCrossReference_4_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Machine__RefinesAssignment_4_2_1"


    // $ANTLR start "rule__Machine__SeesAssignment_5_2"
    // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:4102:1: rule__Machine__SeesAssignment_5_2 : ( ( ruleEString ) ) ;
    public final void rule__Machine__SeesAssignment_5_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:4106:1: ( ( ( ruleEString ) ) )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:4107:1: ( ( ruleEString ) )
            {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:4107:1: ( ( ruleEString ) )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:4108:1: ( ruleEString )
            {
             before(grammarAccess.getMachineAccess().getSeesContextCrossReference_5_2_0()); 
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:4109:1: ( ruleEString )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:4110:1: ruleEString
            {
             before(grammarAccess.getMachineAccess().getSeesContextEStringParserRuleCall_5_2_0_1()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__Machine__SeesAssignment_5_28135);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getMachineAccess().getSeesContextEStringParserRuleCall_5_2_0_1()); 

            }

             after(grammarAccess.getMachineAccess().getSeesContextCrossReference_5_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Machine__SeesAssignment_5_2"


    // $ANTLR start "rule__Machine__SeesAssignment_5_3_1"
    // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:4121:1: rule__Machine__SeesAssignment_5_3_1 : ( ( ruleEString ) ) ;
    public final void rule__Machine__SeesAssignment_5_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:4125:1: ( ( ( ruleEString ) ) )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:4126:1: ( ( ruleEString ) )
            {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:4126:1: ( ( ruleEString ) )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:4127:1: ( ruleEString )
            {
             before(grammarAccess.getMachineAccess().getSeesContextCrossReference_5_3_1_0()); 
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:4128:1: ( ruleEString )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:4129:1: ruleEString
            {
             before(grammarAccess.getMachineAccess().getSeesContextEStringParserRuleCall_5_3_1_0_1()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__Machine__SeesAssignment_5_3_18174);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getMachineAccess().getSeesContextEStringParserRuleCall_5_3_1_0_1()); 

            }

             after(grammarAccess.getMachineAccess().getSeesContextCrossReference_5_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Machine__SeesAssignment_5_3_1"


    // $ANTLR start "rule__Machine__VariablesAssignment_6_1"
    // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:4140:1: rule__Machine__VariablesAssignment_6_1 : ( ruleVariable ) ;
    public final void rule__Machine__VariablesAssignment_6_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:4144:1: ( ( ruleVariable ) )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:4145:1: ( ruleVariable )
            {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:4145:1: ( ruleVariable )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:4146:1: ruleVariable
            {
             before(grammarAccess.getMachineAccess().getVariablesVariableParserRuleCall_6_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleVariable_in_rule__Machine__VariablesAssignment_6_18209);
            ruleVariable();

            state._fsp--;

             after(grammarAccess.getMachineAccess().getVariablesVariableParserRuleCall_6_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Machine__VariablesAssignment_6_1"


    // $ANTLR start "rule__Machine__VariablesAssignment_6_2"
    // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:4155:1: rule__Machine__VariablesAssignment_6_2 : ( ruleVariable ) ;
    public final void rule__Machine__VariablesAssignment_6_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:4159:1: ( ( ruleVariable ) )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:4160:1: ( ruleVariable )
            {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:4160:1: ( ruleVariable )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:4161:1: ruleVariable
            {
             before(grammarAccess.getMachineAccess().getVariablesVariableParserRuleCall_6_2_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleVariable_in_rule__Machine__VariablesAssignment_6_28240);
            ruleVariable();

            state._fsp--;

             after(grammarAccess.getMachineAccess().getVariablesVariableParserRuleCall_6_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Machine__VariablesAssignment_6_2"


    // $ANTLR start "rule__Machine__InvariantsAssignment_7_1"
    // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:4170:1: rule__Machine__InvariantsAssignment_7_1 : ( ruleInvariant ) ;
    public final void rule__Machine__InvariantsAssignment_7_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:4174:1: ( ( ruleInvariant ) )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:4175:1: ( ruleInvariant )
            {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:4175:1: ( ruleInvariant )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:4176:1: ruleInvariant
            {
             before(grammarAccess.getMachineAccess().getInvariantsInvariantParserRuleCall_7_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleInvariant_in_rule__Machine__InvariantsAssignment_7_18271);
            ruleInvariant();

            state._fsp--;

             after(grammarAccess.getMachineAccess().getInvariantsInvariantParserRuleCall_7_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Machine__InvariantsAssignment_7_1"


    // $ANTLR start "rule__Machine__InvariantsAssignment_7_2"
    // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:4185:1: rule__Machine__InvariantsAssignment_7_2 : ( ruleInvariant ) ;
    public final void rule__Machine__InvariantsAssignment_7_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:4189:1: ( ( ruleInvariant ) )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:4190:1: ( ruleInvariant )
            {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:4190:1: ( ruleInvariant )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:4191:1: ruleInvariant
            {
             before(grammarAccess.getMachineAccess().getInvariantsInvariantParserRuleCall_7_2_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleInvariant_in_rule__Machine__InvariantsAssignment_7_28302);
            ruleInvariant();

            state._fsp--;

             after(grammarAccess.getMachineAccess().getInvariantsInvariantParserRuleCall_7_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Machine__InvariantsAssignment_7_2"


    // $ANTLR start "rule__Machine__VariantAssignment_8_1"
    // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:4200:1: rule__Machine__VariantAssignment_8_1 : ( ruleVariant ) ;
    public final void rule__Machine__VariantAssignment_8_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:4204:1: ( ( ruleVariant ) )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:4205:1: ( ruleVariant )
            {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:4205:1: ( ruleVariant )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:4206:1: ruleVariant
            {
             before(grammarAccess.getMachineAccess().getVariantVariantParserRuleCall_8_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleVariant_in_rule__Machine__VariantAssignment_8_18333);
            ruleVariant();

            state._fsp--;

             after(grammarAccess.getMachineAccess().getVariantVariantParserRuleCall_8_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Machine__VariantAssignment_8_1"


    // $ANTLR start "rule__Machine__EventsAssignment_9_1"
    // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:4215:1: rule__Machine__EventsAssignment_9_1 : ( ruleevent ) ;
    public final void rule__Machine__EventsAssignment_9_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:4219:1: ( ( ruleevent ) )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:4220:1: ( ruleevent )
            {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:4220:1: ( ruleevent )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:4221:1: ruleevent
            {
             before(grammarAccess.getMachineAccess().getEventsEventParserRuleCall_9_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleevent_in_rule__Machine__EventsAssignment_9_18364);
            ruleevent();

            state._fsp--;

             after(grammarAccess.getMachineAccess().getEventsEventParserRuleCall_9_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Machine__EventsAssignment_9_1"


    // $ANTLR start "rule__Machine__EventsAssignment_9_2"
    // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:4230:1: rule__Machine__EventsAssignment_9_2 : ( ruleevent ) ;
    public final void rule__Machine__EventsAssignment_9_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:4234:1: ( ( ruleevent ) )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:4235:1: ( ruleevent )
            {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:4235:1: ( ruleevent )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:4236:1: ruleevent
            {
             before(grammarAccess.getMachineAccess().getEventsEventParserRuleCall_9_2_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleevent_in_rule__Machine__EventsAssignment_9_28395);
            ruleevent();

            state._fsp--;

             after(grammarAccess.getMachineAccess().getEventsEventParserRuleCall_9_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Machine__EventsAssignment_9_2"


    // $ANTLR start "rule__Variable__NameAssignment_1"
    // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:4245:1: rule__Variable__NameAssignment_1 : ( ruleEString ) ;
    public final void rule__Variable__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:4249:1: ( ( ruleEString ) )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:4250:1: ( ruleEString )
            {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:4250:1: ( ruleEString )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:4251:1: ruleEString
            {
             before(grammarAccess.getVariableAccess().getNameEStringParserRuleCall_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__Variable__NameAssignment_18426);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getVariableAccess().getNameEStringParserRuleCall_1_0()); 

            }


            }

        }
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


    // $ANTLR start "rule__Variable__CommentAssignment_2_1"
    // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:4260:1: rule__Variable__CommentAssignment_2_1 : ( ruleEString ) ;
    public final void rule__Variable__CommentAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:4264:1: ( ( ruleEString ) )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:4265:1: ( ruleEString )
            {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:4265:1: ( ruleEString )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:4266:1: ruleEString
            {
             before(grammarAccess.getVariableAccess().getCommentEStringParserRuleCall_2_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__Variable__CommentAssignment_2_18457);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getVariableAccess().getCommentEStringParserRuleCall_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Variable__CommentAssignment_2_1"


    // $ANTLR start "rule__Invariant__NameAssignment_1"
    // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:4275:1: rule__Invariant__NameAssignment_1 : ( ruleEString ) ;
    public final void rule__Invariant__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:4279:1: ( ( ruleEString ) )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:4280:1: ( ruleEString )
            {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:4280:1: ( ruleEString )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:4281:1: ruleEString
            {
             before(grammarAccess.getInvariantAccess().getNameEStringParserRuleCall_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__Invariant__NameAssignment_18488);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getInvariantAccess().getNameEStringParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Invariant__NameAssignment_1"


    // $ANTLR start "rule__Invariant__TheoremAssignment_2"
    // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:4290:1: rule__Invariant__TheoremAssignment_2 : ( ( 'theorem' ) ) ;
    public final void rule__Invariant__TheoremAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:4294:1: ( ( ( 'theorem' ) ) )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:4295:1: ( ( 'theorem' ) )
            {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:4295:1: ( ( 'theorem' ) )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:4296:1: ( 'theorem' )
            {
             before(grammarAccess.getInvariantAccess().getTheoremTheoremKeyword_2_0()); 
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:4297:1: ( 'theorem' )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:4298:1: 'theorem'
            {
             before(grammarAccess.getInvariantAccess().getTheoremTheoremKeyword_2_0()); 
            match(input,37,FollowSets000.FOLLOW_37_in_rule__Invariant__TheoremAssignment_28524); 
             after(grammarAccess.getInvariantAccess().getTheoremTheoremKeyword_2_0()); 

            }

             after(grammarAccess.getInvariantAccess().getTheoremTheoremKeyword_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Invariant__TheoremAssignment_2"


    // $ANTLR start "rule__Invariant__PredicateAssignment_3"
    // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:4313:1: rule__Invariant__PredicateAssignment_3 : ( ruleEString ) ;
    public final void rule__Invariant__PredicateAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:4317:1: ( ( ruleEString ) )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:4318:1: ( ruleEString )
            {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:4318:1: ( ruleEString )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:4319:1: ruleEString
            {
             before(grammarAccess.getInvariantAccess().getPredicateEStringParserRuleCall_3_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__Invariant__PredicateAssignment_38563);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getInvariantAccess().getPredicateEStringParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Invariant__PredicateAssignment_3"


    // $ANTLR start "rule__Invariant__CommentAssignment_4_1"
    // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:4328:1: rule__Invariant__CommentAssignment_4_1 : ( ruleEString ) ;
    public final void rule__Invariant__CommentAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:4332:1: ( ( ruleEString ) )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:4333:1: ( ruleEString )
            {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:4333:1: ( ruleEString )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:4334:1: ruleEString
            {
             before(grammarAccess.getInvariantAccess().getCommentEStringParserRuleCall_4_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__Invariant__CommentAssignment_4_18594);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getInvariantAccess().getCommentEStringParserRuleCall_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Invariant__CommentAssignment_4_1"


    // $ANTLR start "rule__Variant__ExpressionAssignment_2"
    // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:4343:1: rule__Variant__ExpressionAssignment_2 : ( ruleEString ) ;
    public final void rule__Variant__ExpressionAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:4347:1: ( ( ruleEString ) )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:4348:1: ( ruleEString )
            {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:4348:1: ( ruleEString )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:4349:1: ruleEString
            {
             before(grammarAccess.getVariantAccess().getExpressionEStringParserRuleCall_2_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__Variant__ExpressionAssignment_28625);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getVariantAccess().getExpressionEStringParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Variant__ExpressionAssignment_2"


    // $ANTLR start "rule__Variant__CommentAssignment_3_1"
    // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:4358:1: rule__Variant__CommentAssignment_3_1 : ( ruleEString ) ;
    public final void rule__Variant__CommentAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:4362:1: ( ( ruleEString ) )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:4363:1: ( ruleEString )
            {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:4363:1: ( ruleEString )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:4364:1: ruleEString
            {
             before(grammarAccess.getVariantAccess().getCommentEStringParserRuleCall_3_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__Variant__CommentAssignment_3_18656);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getVariantAccess().getCommentEStringParserRuleCall_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Variant__CommentAssignment_3_1"


    // $ANTLR start "rule__Event__NameAssignment_2"
    // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:4373:1: rule__Event__NameAssignment_2 : ( ruleEString ) ;
    public final void rule__Event__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:4377:1: ( ( ruleEString ) )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:4378:1: ( ruleEString )
            {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:4378:1: ( ruleEString )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:4379:1: ruleEString
            {
             before(grammarAccess.getEventAccess().getNameEStringParserRuleCall_2_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__Event__NameAssignment_28687);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getEventAccess().getNameEStringParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Event__NameAssignment_2"


    // $ANTLR start "rule__Event__ExtendedAssignment_3"
    // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:4388:1: rule__Event__ExtendedAssignment_3 : ( ( 'extended' ) ) ;
    public final void rule__Event__ExtendedAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:4392:1: ( ( ( 'extended' ) ) )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:4393:1: ( ( 'extended' ) )
            {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:4393:1: ( ( 'extended' ) )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:4394:1: ( 'extended' )
            {
             before(grammarAccess.getEventAccess().getExtendedExtendedKeyword_3_0()); 
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:4395:1: ( 'extended' )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:4396:1: 'extended'
            {
             before(grammarAccess.getEventAccess().getExtendedExtendedKeyword_3_0()); 
            match(input,38,FollowSets000.FOLLOW_38_in_rule__Event__ExtendedAssignment_38723); 
             after(grammarAccess.getEventAccess().getExtendedExtendedKeyword_3_0()); 

            }

             after(grammarAccess.getEventAccess().getExtendedExtendedKeyword_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Event__ExtendedAssignment_3"


    // $ANTLR start "rule__Event__ConvergenceAssignment_4"
    // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:4411:1: rule__Event__ConvergenceAssignment_4 : ( ruleConvergence ) ;
    public final void rule__Event__ConvergenceAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:4415:1: ( ( ruleConvergence ) )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:4416:1: ( ruleConvergence )
            {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:4416:1: ( ruleConvergence )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:4417:1: ruleConvergence
            {
             before(grammarAccess.getEventAccess().getConvergenceConvergenceEnumRuleCall_4_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleConvergence_in_rule__Event__ConvergenceAssignment_48762);
            ruleConvergence();

            state._fsp--;

             after(grammarAccess.getEventAccess().getConvergenceConvergenceEnumRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Event__ConvergenceAssignment_4"


    // $ANTLR start "rule__Event__CommentAssignment_5_1"
    // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:4426:1: rule__Event__CommentAssignment_5_1 : ( ruleEString ) ;
    public final void rule__Event__CommentAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:4430:1: ( ( ruleEString ) )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:4431:1: ( ruleEString )
            {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:4431:1: ( ruleEString )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:4432:1: ruleEString
            {
             before(grammarAccess.getEventAccess().getCommentEStringParserRuleCall_5_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__Event__CommentAssignment_5_18793);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getEventAccess().getCommentEStringParserRuleCall_5_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Event__CommentAssignment_5_1"


    // $ANTLR start "rule__Event__RefinesAssignment_6_1"
    // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:4441:1: rule__Event__RefinesAssignment_6_1 : ( ( ruleEString ) ) ;
    public final void rule__Event__RefinesAssignment_6_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:4445:1: ( ( ( ruleEString ) ) )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:4446:1: ( ( ruleEString ) )
            {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:4446:1: ( ( ruleEString ) )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:4447:1: ( ruleEString )
            {
             before(grammarAccess.getEventAccess().getRefinesEventCrossReference_6_1_0()); 
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:4448:1: ( ruleEString )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:4449:1: ruleEString
            {
             before(grammarAccess.getEventAccess().getRefinesEventEStringParserRuleCall_6_1_0_1()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__Event__RefinesAssignment_6_18828);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getEventAccess().getRefinesEventEStringParserRuleCall_6_1_0_1()); 

            }

             after(grammarAccess.getEventAccess().getRefinesEventCrossReference_6_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Event__RefinesAssignment_6_1"


    // $ANTLR start "rule__Event__RefinesAssignment_6_2_1"
    // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:4460:1: rule__Event__RefinesAssignment_6_2_1 : ( ( ruleEString ) ) ;
    public final void rule__Event__RefinesAssignment_6_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:4464:1: ( ( ( ruleEString ) ) )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:4465:1: ( ( ruleEString ) )
            {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:4465:1: ( ( ruleEString ) )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:4466:1: ( ruleEString )
            {
             before(grammarAccess.getEventAccess().getRefinesEventCrossReference_6_2_1_0()); 
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:4467:1: ( ruleEString )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:4468:1: ruleEString
            {
             before(grammarAccess.getEventAccess().getRefinesEventEStringParserRuleCall_6_2_1_0_1()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__Event__RefinesAssignment_6_2_18867);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getEventAccess().getRefinesEventEStringParserRuleCall_6_2_1_0_1()); 

            }

             after(grammarAccess.getEventAccess().getRefinesEventCrossReference_6_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Event__RefinesAssignment_6_2_1"


    // $ANTLR start "rule__Event__GuardsAssignment_7_1"
    // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:4479:1: rule__Event__GuardsAssignment_7_1 : ( ruleGuard ) ;
    public final void rule__Event__GuardsAssignment_7_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:4483:1: ( ( ruleGuard ) )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:4484:1: ( ruleGuard )
            {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:4484:1: ( ruleGuard )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:4485:1: ruleGuard
            {
             before(grammarAccess.getEventAccess().getGuardsGuardParserRuleCall_7_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleGuard_in_rule__Event__GuardsAssignment_7_18902);
            ruleGuard();

            state._fsp--;

             after(grammarAccess.getEventAccess().getGuardsGuardParserRuleCall_7_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Event__GuardsAssignment_7_1"


    // $ANTLR start "rule__Event__GuardsAssignment_7_2"
    // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:4494:1: rule__Event__GuardsAssignment_7_2 : ( ruleGuard ) ;
    public final void rule__Event__GuardsAssignment_7_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:4498:1: ( ( ruleGuard ) )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:4499:1: ( ruleGuard )
            {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:4499:1: ( ruleGuard )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:4500:1: ruleGuard
            {
             before(grammarAccess.getEventAccess().getGuardsGuardParserRuleCall_7_2_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleGuard_in_rule__Event__GuardsAssignment_7_28933);
            ruleGuard();

            state._fsp--;

             after(grammarAccess.getEventAccess().getGuardsGuardParserRuleCall_7_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Event__GuardsAssignment_7_2"


    // $ANTLR start "rule__Event__ParametersAssignment_8_1"
    // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:4509:1: rule__Event__ParametersAssignment_8_1 : ( ruleParameter ) ;
    public final void rule__Event__ParametersAssignment_8_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:4513:1: ( ( ruleParameter ) )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:4514:1: ( ruleParameter )
            {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:4514:1: ( ruleParameter )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:4515:1: ruleParameter
            {
             before(grammarAccess.getEventAccess().getParametersParameterParserRuleCall_8_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleParameter_in_rule__Event__ParametersAssignment_8_18964);
            ruleParameter();

            state._fsp--;

             after(grammarAccess.getEventAccess().getParametersParameterParserRuleCall_8_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Event__ParametersAssignment_8_1"


    // $ANTLR start "rule__Event__ParametersAssignment_8_2"
    // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:4524:1: rule__Event__ParametersAssignment_8_2 : ( ruleParameter ) ;
    public final void rule__Event__ParametersAssignment_8_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:4528:1: ( ( ruleParameter ) )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:4529:1: ( ruleParameter )
            {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:4529:1: ( ruleParameter )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:4530:1: ruleParameter
            {
             before(grammarAccess.getEventAccess().getParametersParameterParserRuleCall_8_2_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleParameter_in_rule__Event__ParametersAssignment_8_28995);
            ruleParameter();

            state._fsp--;

             after(grammarAccess.getEventAccess().getParametersParameterParserRuleCall_8_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Event__ParametersAssignment_8_2"


    // $ANTLR start "rule__Event__GuardsAssignment_8_4"
    // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:4539:1: rule__Event__GuardsAssignment_8_4 : ( ruleGuard ) ;
    public final void rule__Event__GuardsAssignment_8_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:4543:1: ( ( ruleGuard ) )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:4544:1: ( ruleGuard )
            {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:4544:1: ( ruleGuard )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:4545:1: ruleGuard
            {
             before(grammarAccess.getEventAccess().getGuardsGuardParserRuleCall_8_4_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleGuard_in_rule__Event__GuardsAssignment_8_49026);
            ruleGuard();

            state._fsp--;

             after(grammarAccess.getEventAccess().getGuardsGuardParserRuleCall_8_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Event__GuardsAssignment_8_4"


    // $ANTLR start "rule__Event__GuardsAssignment_8_5"
    // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:4554:1: rule__Event__GuardsAssignment_8_5 : ( ruleGuard ) ;
    public final void rule__Event__GuardsAssignment_8_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:4558:1: ( ( ruleGuard ) )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:4559:1: ( ruleGuard )
            {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:4559:1: ( ruleGuard )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:4560:1: ruleGuard
            {
             before(grammarAccess.getEventAccess().getGuardsGuardParserRuleCall_8_5_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleGuard_in_rule__Event__GuardsAssignment_8_59057);
            ruleGuard();

            state._fsp--;

             after(grammarAccess.getEventAccess().getGuardsGuardParserRuleCall_8_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Event__GuardsAssignment_8_5"


    // $ANTLR start "rule__Event__WitnessesAssignment_9_1"
    // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:4569:1: rule__Event__WitnessesAssignment_9_1 : ( ruleWitness ) ;
    public final void rule__Event__WitnessesAssignment_9_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:4573:1: ( ( ruleWitness ) )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:4574:1: ( ruleWitness )
            {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:4574:1: ( ruleWitness )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:4575:1: ruleWitness
            {
             before(grammarAccess.getEventAccess().getWitnessesWitnessParserRuleCall_9_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleWitness_in_rule__Event__WitnessesAssignment_9_19088);
            ruleWitness();

            state._fsp--;

             after(grammarAccess.getEventAccess().getWitnessesWitnessParserRuleCall_9_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Event__WitnessesAssignment_9_1"


    // $ANTLR start "rule__Event__WitnessesAssignment_9_2"
    // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:4584:1: rule__Event__WitnessesAssignment_9_2 : ( ruleWitness ) ;
    public final void rule__Event__WitnessesAssignment_9_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:4588:1: ( ( ruleWitness ) )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:4589:1: ( ruleWitness )
            {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:4589:1: ( ruleWitness )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:4590:1: ruleWitness
            {
             before(grammarAccess.getEventAccess().getWitnessesWitnessParserRuleCall_9_2_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleWitness_in_rule__Event__WitnessesAssignment_9_29119);
            ruleWitness();

            state._fsp--;

             after(grammarAccess.getEventAccess().getWitnessesWitnessParserRuleCall_9_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Event__WitnessesAssignment_9_2"


    // $ANTLR start "rule__Event__ActionsAssignment_10_1"
    // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:4599:1: rule__Event__ActionsAssignment_10_1 : ( ruleAction ) ;
    public final void rule__Event__ActionsAssignment_10_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:4603:1: ( ( ruleAction ) )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:4604:1: ( ruleAction )
            {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:4604:1: ( ruleAction )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:4605:1: ruleAction
            {
             before(grammarAccess.getEventAccess().getActionsActionParserRuleCall_10_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleAction_in_rule__Event__ActionsAssignment_10_19150);
            ruleAction();

            state._fsp--;

             after(grammarAccess.getEventAccess().getActionsActionParserRuleCall_10_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Event__ActionsAssignment_10_1"


    // $ANTLR start "rule__Event__ActionsAssignment_10_2"
    // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:4614:1: rule__Event__ActionsAssignment_10_2 : ( ruleAction ) ;
    public final void rule__Event__ActionsAssignment_10_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:4618:1: ( ( ruleAction ) )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:4619:1: ( ruleAction )
            {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:4619:1: ( ruleAction )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:4620:1: ruleAction
            {
             before(grammarAccess.getEventAccess().getActionsActionParserRuleCall_10_2_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleAction_in_rule__Event__ActionsAssignment_10_29181);
            ruleAction();

            state._fsp--;

             after(grammarAccess.getEventAccess().getActionsActionParserRuleCall_10_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Event__ActionsAssignment_10_2"


    // $ANTLR start "rule__Parameter__NameAssignment_1"
    // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:4629:1: rule__Parameter__NameAssignment_1 : ( ruleEString ) ;
    public final void rule__Parameter__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:4633:1: ( ( ruleEString ) )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:4634:1: ( ruleEString )
            {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:4634:1: ( ruleEString )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:4635:1: ruleEString
            {
             before(grammarAccess.getParameterAccess().getNameEStringParserRuleCall_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__Parameter__NameAssignment_19212);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getParameterAccess().getNameEStringParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parameter__NameAssignment_1"


    // $ANTLR start "rule__Parameter__CommentAssignment_2_1"
    // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:4644:1: rule__Parameter__CommentAssignment_2_1 : ( ruleEString ) ;
    public final void rule__Parameter__CommentAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:4648:1: ( ( ruleEString ) )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:4649:1: ( ruleEString )
            {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:4649:1: ( ruleEString )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:4650:1: ruleEString
            {
             before(grammarAccess.getParameterAccess().getCommentEStringParserRuleCall_2_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__Parameter__CommentAssignment_2_19243);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getParameterAccess().getCommentEStringParserRuleCall_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parameter__CommentAssignment_2_1"


    // $ANTLR start "rule__Guard__NameAssignment_1"
    // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:4659:1: rule__Guard__NameAssignment_1 : ( ruleEString ) ;
    public final void rule__Guard__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:4663:1: ( ( ruleEString ) )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:4664:1: ( ruleEString )
            {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:4664:1: ( ruleEString )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:4665:1: ruleEString
            {
             before(grammarAccess.getGuardAccess().getNameEStringParserRuleCall_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__Guard__NameAssignment_19274);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getGuardAccess().getNameEStringParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Guard__NameAssignment_1"


    // $ANTLR start "rule__Guard__TheoremAssignment_2"
    // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:4674:1: rule__Guard__TheoremAssignment_2 : ( ( 'theorem' ) ) ;
    public final void rule__Guard__TheoremAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:4678:1: ( ( ( 'theorem' ) ) )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:4679:1: ( ( 'theorem' ) )
            {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:4679:1: ( ( 'theorem' ) )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:4680:1: ( 'theorem' )
            {
             before(grammarAccess.getGuardAccess().getTheoremTheoremKeyword_2_0()); 
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:4681:1: ( 'theorem' )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:4682:1: 'theorem'
            {
             before(grammarAccess.getGuardAccess().getTheoremTheoremKeyword_2_0()); 
            match(input,37,FollowSets000.FOLLOW_37_in_rule__Guard__TheoremAssignment_29310); 
             after(grammarAccess.getGuardAccess().getTheoremTheoremKeyword_2_0()); 

            }

             after(grammarAccess.getGuardAccess().getTheoremTheoremKeyword_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Guard__TheoremAssignment_2"


    // $ANTLR start "rule__Guard__PredicateAssignment_3"
    // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:4697:1: rule__Guard__PredicateAssignment_3 : ( ruleEString ) ;
    public final void rule__Guard__PredicateAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:4701:1: ( ( ruleEString ) )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:4702:1: ( ruleEString )
            {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:4702:1: ( ruleEString )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:4703:1: ruleEString
            {
             before(grammarAccess.getGuardAccess().getPredicateEStringParserRuleCall_3_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__Guard__PredicateAssignment_39349);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getGuardAccess().getPredicateEStringParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Guard__PredicateAssignment_3"


    // $ANTLR start "rule__Guard__CommentAssignment_4_1"
    // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:4712:1: rule__Guard__CommentAssignment_4_1 : ( ruleEString ) ;
    public final void rule__Guard__CommentAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:4716:1: ( ( ruleEString ) )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:4717:1: ( ruleEString )
            {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:4717:1: ( ruleEString )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:4718:1: ruleEString
            {
             before(grammarAccess.getGuardAccess().getCommentEStringParserRuleCall_4_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__Guard__CommentAssignment_4_19380);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getGuardAccess().getCommentEStringParserRuleCall_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Guard__CommentAssignment_4_1"


    // $ANTLR start "rule__Witness__LocalGeneratedAssignment_0"
    // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:4727:1: rule__Witness__LocalGeneratedAssignment_0 : ( ( 'localGenerated' ) ) ;
    public final void rule__Witness__LocalGeneratedAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:4731:1: ( ( ( 'localGenerated' ) ) )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:4732:1: ( ( 'localGenerated' ) )
            {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:4732:1: ( ( 'localGenerated' ) )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:4733:1: ( 'localGenerated' )
            {
             before(grammarAccess.getWitnessAccess().getLocalGeneratedLocalGeneratedKeyword_0_0()); 
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:4734:1: ( 'localGenerated' )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:4735:1: 'localGenerated'
            {
             before(grammarAccess.getWitnessAccess().getLocalGeneratedLocalGeneratedKeyword_0_0()); 
            match(input,39,FollowSets000.FOLLOW_39_in_rule__Witness__LocalGeneratedAssignment_09416); 
             after(grammarAccess.getWitnessAccess().getLocalGeneratedLocalGeneratedKeyword_0_0()); 

            }

             after(grammarAccess.getWitnessAccess().getLocalGeneratedLocalGeneratedKeyword_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Witness__LocalGeneratedAssignment_0"


    // $ANTLR start "rule__Witness__NameAssignment_3"
    // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:4750:1: rule__Witness__NameAssignment_3 : ( ruleEString ) ;
    public final void rule__Witness__NameAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:4754:1: ( ( ruleEString ) )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:4755:1: ( ruleEString )
            {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:4755:1: ( ruleEString )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:4756:1: ruleEString
            {
             before(grammarAccess.getWitnessAccess().getNameEStringParserRuleCall_3_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__Witness__NameAssignment_39455);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getWitnessAccess().getNameEStringParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Witness__NameAssignment_3"


    // $ANTLR start "rule__Witness__PredicateAssignment_5"
    // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:4765:1: rule__Witness__PredicateAssignment_5 : ( ruleEString ) ;
    public final void rule__Witness__PredicateAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:4769:1: ( ( ruleEString ) )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:4770:1: ( ruleEString )
            {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:4770:1: ( ruleEString )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:4771:1: ruleEString
            {
             before(grammarAccess.getWitnessAccess().getPredicateEStringParserRuleCall_5_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__Witness__PredicateAssignment_59486);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getWitnessAccess().getPredicateEStringParserRuleCall_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Witness__PredicateAssignment_5"


    // $ANTLR start "rule__Witness__CommentAssignment_6_1"
    // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:4780:1: rule__Witness__CommentAssignment_6_1 : ( ruleEString ) ;
    public final void rule__Witness__CommentAssignment_6_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:4784:1: ( ( ruleEString ) )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:4785:1: ( ruleEString )
            {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:4785:1: ( ruleEString )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:4786:1: ruleEString
            {
             before(grammarAccess.getWitnessAccess().getCommentEStringParserRuleCall_6_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__Witness__CommentAssignment_6_19517);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getWitnessAccess().getCommentEStringParserRuleCall_6_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Witness__CommentAssignment_6_1"


    // $ANTLR start "rule__Action__NameAssignment_1"
    // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:4795:1: rule__Action__NameAssignment_1 : ( ruleEString ) ;
    public final void rule__Action__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:4799:1: ( ( ruleEString ) )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:4800:1: ( ruleEString )
            {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:4800:1: ( ruleEString )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:4801:1: ruleEString
            {
             before(grammarAccess.getActionAccess().getNameEStringParserRuleCall_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__Action__NameAssignment_19548);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getActionAccess().getNameEStringParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Action__NameAssignment_1"


    // $ANTLR start "rule__Action__ActionAssignment_2"
    // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:4810:1: rule__Action__ActionAssignment_2 : ( ruleEString ) ;
    public final void rule__Action__ActionAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:4814:1: ( ( ruleEString ) )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:4815:1: ( ruleEString )
            {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:4815:1: ( ruleEString )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:4816:1: ruleEString
            {
             before(grammarAccess.getActionAccess().getActionEStringParserRuleCall_2_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__Action__ActionAssignment_29579);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getActionAccess().getActionEStringParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Action__ActionAssignment_2"


    // $ANTLR start "rule__Action__CommentAssignment_3_1"
    // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:4825:1: rule__Action__CommentAssignment_3_1 : ( ruleEString ) ;
    public final void rule__Action__CommentAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:4829:1: ( ( ruleEString ) )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:4830:1: ( ruleEString )
            {
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:4830:1: ( ruleEString )
            // ../ac.soton.xtext.machineDsl.ui/src-gen/ac/soton/xtext/ui/contentassist/antlr/internal/InternalMachineDsl.g:4831:1: ruleEString
            {
             before(grammarAccess.getActionAccess().getCommentEStringParserRuleCall_3_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__Action__CommentAssignment_3_19610);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getActionAccess().getCommentEStringParserRuleCall_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Action__CommentAssignment_3_1"

    // Delegated rules


 

    
    private static class FollowSets000 {
        public static final BitSet FOLLOW_ruleMachine_in_entryRuleMachine61 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleMachine68 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Machine__Group__0_in_ruleMachine94 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_entryRuleEString121 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleEString128 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__EString__Alternatives_in_ruleEString154 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleVariable_in_entryRuleVariable181 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleVariable188 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Variable__Group__0_in_ruleVariable214 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleInvariant_in_entryRuleInvariant241 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleInvariant248 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Invariant__Group__0_in_ruleInvariant274 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleVariant_in_entryRuleVariant301 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleVariant308 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Variant__Group__0_in_ruleVariant334 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleevent_in_entryRuleevent361 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleevent368 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Event__Group__0_in_ruleevent394 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleParameter_in_entryRuleParameter423 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleParameter430 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Parameter__Group__0_in_ruleParameter456 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleGuard_in_entryRuleGuard483 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleGuard490 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Guard__Group__0_in_ruleGuard516 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleWitness_in_entryRuleWitness543 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleWitness550 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Witness__Group__0_in_ruleWitness576 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAction_in_entryRuleAction603 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleAction610 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Action__Group__0_in_ruleAction636 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Convergence__Alternatives_in_ruleConvergence673 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_STRING_in_rule__EString__Alternatives708 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_rule__EString__Alternatives725 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_11_in_rule__Convergence__Alternatives758 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_12_in_rule__Convergence__Alternatives779 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_13_in_rule__Convergence__Alternatives800 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Machine__Group__0__Impl_in_rule__Machine__Group__0833 = new BitSet(new long[]{0x0000000000004000L});
        public static final BitSet FOLLOW_rule__Machine__Group__1_in_rule__Machine__Group__0836 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Machine__Group__1__Impl_in_rule__Machine__Group__1894 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__Machine__Group__2_in_rule__Machine__Group__1897 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_14_in_rule__Machine__Group__1__Impl925 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Machine__Group__2__Impl_in_rule__Machine__Group__2956 = new BitSet(new long[]{0x0000000003CB8000L});
        public static final BitSet FOLLOW_rule__Machine__Group__3_in_rule__Machine__Group__2959 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Machine__NameAssignment_2_in_rule__Machine__Group__2__Impl986 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Machine__Group__3__Impl_in_rule__Machine__Group__31016 = new BitSet(new long[]{0x0000000003CB8000L});
        public static final BitSet FOLLOW_rule__Machine__Group__4_in_rule__Machine__Group__31019 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Machine__Group_3__0_in_rule__Machine__Group__3__Impl1046 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Machine__Group__4__Impl_in_rule__Machine__Group__41077 = new BitSet(new long[]{0x0000000003CB8000L});
        public static final BitSet FOLLOW_rule__Machine__Group__5_in_rule__Machine__Group__41080 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Machine__Group_4__0_in_rule__Machine__Group__4__Impl1107 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Machine__Group__5__Impl_in_rule__Machine__Group__51138 = new BitSet(new long[]{0x0000000003CB8000L});
        public static final BitSet FOLLOW_rule__Machine__Group__6_in_rule__Machine__Group__51141 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Machine__Group_5__0_in_rule__Machine__Group__5__Impl1168 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Machine__Group__6__Impl_in_rule__Machine__Group__61199 = new BitSet(new long[]{0x0000000003CB8000L});
        public static final BitSet FOLLOW_rule__Machine__Group__7_in_rule__Machine__Group__61202 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Machine__Group_6__0_in_rule__Machine__Group__6__Impl1229 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Machine__Group__7__Impl_in_rule__Machine__Group__71260 = new BitSet(new long[]{0x0000000003CB8000L});
        public static final BitSet FOLLOW_rule__Machine__Group__8_in_rule__Machine__Group__71263 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Machine__Group_7__0_in_rule__Machine__Group__7__Impl1290 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Machine__Group__8__Impl_in_rule__Machine__Group__81321 = new BitSet(new long[]{0x0000000003CB8000L});
        public static final BitSet FOLLOW_rule__Machine__Group__9_in_rule__Machine__Group__81324 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Machine__Group_8__0_in_rule__Machine__Group__8__Impl1351 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Machine__Group__9__Impl_in_rule__Machine__Group__91382 = new BitSet(new long[]{0x0000000003CB8000L});
        public static final BitSet FOLLOW_rule__Machine__Group__10_in_rule__Machine__Group__91385 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Machine__Group_9__0_in_rule__Machine__Group__9__Impl1412 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Machine__Group__10__Impl_in_rule__Machine__Group__101443 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_15_in_rule__Machine__Group__10__Impl1471 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Machine__Group_3__0__Impl_in_rule__Machine__Group_3__01524 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__Machine__Group_3__1_in_rule__Machine__Group_3__01527 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_16_in_rule__Machine__Group_3__0__Impl1555 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Machine__Group_3__1__Impl_in_rule__Machine__Group_3__11586 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Machine__CommentAssignment_3_1_in_rule__Machine__Group_3__1__Impl1613 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Machine__Group_4__0__Impl_in_rule__Machine__Group_4__01647 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__Machine__Group_4__1_in_rule__Machine__Group_4__01650 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_17_in_rule__Machine__Group_4__0__Impl1678 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Machine__Group_4__1__Impl_in_rule__Machine__Group_4__11709 = new BitSet(new long[]{0x0000000000040000L});
        public static final BitSet FOLLOW_rule__Machine__Group_4__2_in_rule__Machine__Group_4__11712 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Machine__RefinesAssignment_4_1_in_rule__Machine__Group_4__1__Impl1739 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Machine__Group_4__2__Impl_in_rule__Machine__Group_4__21769 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Machine__Group_4_2__0_in_rule__Machine__Group_4__2__Impl1796 = new BitSet(new long[]{0x0000000000040002L});
        public static final BitSet FOLLOW_rule__Machine__Group_4_2__0__Impl_in_rule__Machine__Group_4_2__01833 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__Machine__Group_4_2__1_in_rule__Machine__Group_4_2__01836 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_18_in_rule__Machine__Group_4_2__0__Impl1864 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Machine__Group_4_2__1__Impl_in_rule__Machine__Group_4_2__11895 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Machine__RefinesAssignment_4_2_1_in_rule__Machine__Group_4_2__1__Impl1922 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Machine__Group_5__0__Impl_in_rule__Machine__Group_5__01956 = new BitSet(new long[]{0x0000000000100000L});
        public static final BitSet FOLLOW_rule__Machine__Group_5__1_in_rule__Machine__Group_5__01959 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_19_in_rule__Machine__Group_5__0__Impl1987 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Machine__Group_5__1__Impl_in_rule__Machine__Group_5__12018 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__Machine__Group_5__2_in_rule__Machine__Group_5__12021 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_20_in_rule__Machine__Group_5__1__Impl2049 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Machine__Group_5__2__Impl_in_rule__Machine__Group_5__22080 = new BitSet(new long[]{0x0000000000240000L});
        public static final BitSet FOLLOW_rule__Machine__Group_5__3_in_rule__Machine__Group_5__22083 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Machine__SeesAssignment_5_2_in_rule__Machine__Group_5__2__Impl2110 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Machine__Group_5__3__Impl_in_rule__Machine__Group_5__32140 = new BitSet(new long[]{0x0000000000240000L});
        public static final BitSet FOLLOW_rule__Machine__Group_5__4_in_rule__Machine__Group_5__32143 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Machine__Group_5_3__0_in_rule__Machine__Group_5__3__Impl2170 = new BitSet(new long[]{0x0000000000040002L});
        public static final BitSet FOLLOW_rule__Machine__Group_5__4__Impl_in_rule__Machine__Group_5__42201 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_21_in_rule__Machine__Group_5__4__Impl2229 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Machine__Group_5_3__0__Impl_in_rule__Machine__Group_5_3__02270 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__Machine__Group_5_3__1_in_rule__Machine__Group_5_3__02273 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_18_in_rule__Machine__Group_5_3__0__Impl2301 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Machine__Group_5_3__1__Impl_in_rule__Machine__Group_5_3__12332 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Machine__SeesAssignment_5_3_1_in_rule__Machine__Group_5_3__1__Impl2359 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Machine__Group_6__0__Impl_in_rule__Machine__Group_6__02393 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__Machine__Group_6__1_in_rule__Machine__Group_6__02396 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_22_in_rule__Machine__Group_6__0__Impl2424 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Machine__Group_6__1__Impl_in_rule__Machine__Group_6__12455 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__Machine__Group_6__2_in_rule__Machine__Group_6__12458 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Machine__VariablesAssignment_6_1_in_rule__Machine__Group_6__1__Impl2485 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Machine__Group_6__2__Impl_in_rule__Machine__Group_6__22515 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Machine__VariablesAssignment_6_2_in_rule__Machine__Group_6__2__Impl2542 = new BitSet(new long[]{0x0000000000000032L});
        public static final BitSet FOLLOW_rule__Machine__Group_7__0__Impl_in_rule__Machine__Group_7__02579 = new BitSet(new long[]{0x0000000004000000L});
        public static final BitSet FOLLOW_rule__Machine__Group_7__1_in_rule__Machine__Group_7__02582 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_23_in_rule__Machine__Group_7__0__Impl2610 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Machine__Group_7__1__Impl_in_rule__Machine__Group_7__12641 = new BitSet(new long[]{0x0000000004000000L});
        public static final BitSet FOLLOW_rule__Machine__Group_7__2_in_rule__Machine__Group_7__12644 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Machine__InvariantsAssignment_7_1_in_rule__Machine__Group_7__1__Impl2671 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Machine__Group_7__2__Impl_in_rule__Machine__Group_7__22701 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Machine__InvariantsAssignment_7_2_in_rule__Machine__Group_7__2__Impl2728 = new BitSet(new long[]{0x0000000004000002L});
        public static final BitSet FOLLOW_rule__Machine__Group_8__0__Impl_in_rule__Machine__Group_8__02765 = new BitSet(new long[]{0x0000000008000000L});
        public static final BitSet FOLLOW_rule__Machine__Group_8__1_in_rule__Machine__Group_8__02768 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_24_in_rule__Machine__Group_8__0__Impl2796 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Machine__Group_8__1__Impl_in_rule__Machine__Group_8__12827 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Machine__VariantAssignment_8_1_in_rule__Machine__Group_8__1__Impl2854 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Machine__Group_9__0__Impl_in_rule__Machine__Group_9__02888 = new BitSet(new long[]{0x0000000020000000L});
        public static final BitSet FOLLOW_rule__Machine__Group_9__1_in_rule__Machine__Group_9__02891 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_25_in_rule__Machine__Group_9__0__Impl2919 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Machine__Group_9__1__Impl_in_rule__Machine__Group_9__12950 = new BitSet(new long[]{0x0000000020000000L});
        public static final BitSet FOLLOW_rule__Machine__Group_9__2_in_rule__Machine__Group_9__12953 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Machine__EventsAssignment_9_1_in_rule__Machine__Group_9__1__Impl2980 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Machine__Group_9__2__Impl_in_rule__Machine__Group_9__23010 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Machine__EventsAssignment_9_2_in_rule__Machine__Group_9__2__Impl3037 = new BitSet(new long[]{0x0000000020000002L});
        public static final BitSet FOLLOW_rule__Variable__Group__0__Impl_in_rule__Variable__Group__03074 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__Variable__Group__1_in_rule__Variable__Group__03077 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Variable__Group__1__Impl_in_rule__Variable__Group__13135 = new BitSet(new long[]{0x0000000000010000L});
        public static final BitSet FOLLOW_rule__Variable__Group__2_in_rule__Variable__Group__13138 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Variable__NameAssignment_1_in_rule__Variable__Group__1__Impl3165 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Variable__Group__2__Impl_in_rule__Variable__Group__23195 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Variable__Group_2__0_in_rule__Variable__Group__2__Impl3222 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Variable__Group_2__0__Impl_in_rule__Variable__Group_2__03259 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__Variable__Group_2__1_in_rule__Variable__Group_2__03262 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_16_in_rule__Variable__Group_2__0__Impl3290 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Variable__Group_2__1__Impl_in_rule__Variable__Group_2__13321 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Variable__CommentAssignment_2_1_in_rule__Variable__Group_2__1__Impl3348 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Invariant__Group__0__Impl_in_rule__Invariant__Group__03382 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__Invariant__Group__1_in_rule__Invariant__Group__03385 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_26_in_rule__Invariant__Group__0__Impl3413 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Invariant__Group__1__Impl_in_rule__Invariant__Group__13444 = new BitSet(new long[]{0x0000002000010030L});
        public static final BitSet FOLLOW_rule__Invariant__Group__2_in_rule__Invariant__Group__13447 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Invariant__NameAssignment_1_in_rule__Invariant__Group__1__Impl3474 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Invariant__Group__2__Impl_in_rule__Invariant__Group__23504 = new BitSet(new long[]{0x0000002000010030L});
        public static final BitSet FOLLOW_rule__Invariant__Group__3_in_rule__Invariant__Group__23507 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Invariant__TheoremAssignment_2_in_rule__Invariant__Group__2__Impl3534 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Invariant__Group__3__Impl_in_rule__Invariant__Group__33565 = new BitSet(new long[]{0x0000002000010030L});
        public static final BitSet FOLLOW_rule__Invariant__Group__4_in_rule__Invariant__Group__33568 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Invariant__PredicateAssignment_3_in_rule__Invariant__Group__3__Impl3595 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Invariant__Group__4__Impl_in_rule__Invariant__Group__43626 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Invariant__Group_4__0_in_rule__Invariant__Group__4__Impl3653 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Invariant__Group_4__0__Impl_in_rule__Invariant__Group_4__03694 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__Invariant__Group_4__1_in_rule__Invariant__Group_4__03697 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_16_in_rule__Invariant__Group_4__0__Impl3725 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Invariant__Group_4__1__Impl_in_rule__Invariant__Group_4__13756 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Invariant__CommentAssignment_4_1_in_rule__Invariant__Group_4__1__Impl3783 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Variant__Group__0__Impl_in_rule__Variant__Group__03817 = new BitSet(new long[]{0x0000000010000000L});
        public static final BitSet FOLLOW_rule__Variant__Group__1_in_rule__Variant__Group__03820 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_27_in_rule__Variant__Group__0__Impl3848 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Variant__Group__1__Impl_in_rule__Variant__Group__13879 = new BitSet(new long[]{0x0000000000010030L});
        public static final BitSet FOLLOW_rule__Variant__Group__2_in_rule__Variant__Group__13882 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_28_in_rule__Variant__Group__1__Impl3910 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Variant__Group__2__Impl_in_rule__Variant__Group__23941 = new BitSet(new long[]{0x0000000000010030L});
        public static final BitSet FOLLOW_rule__Variant__Group__3_in_rule__Variant__Group__23944 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Variant__ExpressionAssignment_2_in_rule__Variant__Group__2__Impl3971 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Variant__Group__3__Impl_in_rule__Variant__Group__34002 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Variant__Group_3__0_in_rule__Variant__Group__3__Impl4029 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Variant__Group_3__0__Impl_in_rule__Variant__Group_3__04067 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__Variant__Group_3__1_in_rule__Variant__Group_3__04070 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_16_in_rule__Variant__Group_3__0__Impl4098 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Variant__Group_3__1__Impl_in_rule__Variant__Group_3__14129 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Variant__CommentAssignment_3_1_in_rule__Variant__Group_3__1__Impl4156 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Event__Group__0__Impl_in_rule__Event__Group__04190 = new BitSet(new long[]{0x0000000020000000L});
        public static final BitSet FOLLOW_rule__Event__Group__1_in_rule__Event__Group__04193 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Event__Group__1__Impl_in_rule__Event__Group__14251 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__Event__Group__2_in_rule__Event__Group__14254 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_29_in_rule__Event__Group__1__Impl4282 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Event__Group__2__Impl_in_rule__Event__Group__24313 = new BitSet(new long[]{0x00000046C003B800L});
        public static final BitSet FOLLOW_rule__Event__Group__3_in_rule__Event__Group__24316 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Event__NameAssignment_2_in_rule__Event__Group__2__Impl4343 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Event__Group__3__Impl_in_rule__Event__Group__34373 = new BitSet(new long[]{0x00000046C003B800L});
        public static final BitSet FOLLOW_rule__Event__Group__4_in_rule__Event__Group__34376 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Event__ExtendedAssignment_3_in_rule__Event__Group__3__Impl4403 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Event__Group__4__Impl_in_rule__Event__Group__44434 = new BitSet(new long[]{0x00000046C003B800L});
        public static final BitSet FOLLOW_rule__Event__Group__5_in_rule__Event__Group__44437 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Event__ConvergenceAssignment_4_in_rule__Event__Group__4__Impl4464 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Event__Group__5__Impl_in_rule__Event__Group__54495 = new BitSet(new long[]{0x00000046C003B800L});
        public static final BitSet FOLLOW_rule__Event__Group__6_in_rule__Event__Group__54498 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Event__Group_5__0_in_rule__Event__Group__5__Impl4525 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Event__Group__6__Impl_in_rule__Event__Group__64556 = new BitSet(new long[]{0x00000046C003B800L});
        public static final BitSet FOLLOW_rule__Event__Group__7_in_rule__Event__Group__64559 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Event__Group_6__0_in_rule__Event__Group__6__Impl4586 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Event__Group__7__Impl_in_rule__Event__Group__74617 = new BitSet(new long[]{0x00000046C003B800L});
        public static final BitSet FOLLOW_rule__Event__Group__8_in_rule__Event__Group__74620 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Event__Group_7__0_in_rule__Event__Group__7__Impl4647 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Event__Group__8__Impl_in_rule__Event__Group__84678 = new BitSet(new long[]{0x00000046C003B800L});
        public static final BitSet FOLLOW_rule__Event__Group__9_in_rule__Event__Group__84681 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Event__Group_8__0_in_rule__Event__Group__8__Impl4708 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Event__Group__9__Impl_in_rule__Event__Group__94739 = new BitSet(new long[]{0x00000046C003B800L});
        public static final BitSet FOLLOW_rule__Event__Group__10_in_rule__Event__Group__94742 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Event__Group_9__0_in_rule__Event__Group__9__Impl4769 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Event__Group__10__Impl_in_rule__Event__Group__104800 = new BitSet(new long[]{0x00000046C003B800L});
        public static final BitSet FOLLOW_rule__Event__Group__11_in_rule__Event__Group__104803 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Event__Group_10__0_in_rule__Event__Group__10__Impl4830 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Event__Group__11__Impl_in_rule__Event__Group__114861 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_15_in_rule__Event__Group__11__Impl4889 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Event__Group_5__0__Impl_in_rule__Event__Group_5__04944 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__Event__Group_5__1_in_rule__Event__Group_5__04947 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_16_in_rule__Event__Group_5__0__Impl4975 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Event__Group_5__1__Impl_in_rule__Event__Group_5__15006 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Event__CommentAssignment_5_1_in_rule__Event__Group_5__1__Impl5033 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Event__Group_6__0__Impl_in_rule__Event__Group_6__05067 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__Event__Group_6__1_in_rule__Event__Group_6__05070 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_17_in_rule__Event__Group_6__0__Impl5098 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Event__Group_6__1__Impl_in_rule__Event__Group_6__15129 = new BitSet(new long[]{0x0000000000040000L});
        public static final BitSet FOLLOW_rule__Event__Group_6__2_in_rule__Event__Group_6__15132 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Event__RefinesAssignment_6_1_in_rule__Event__Group_6__1__Impl5159 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Event__Group_6__2__Impl_in_rule__Event__Group_6__25189 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Event__Group_6_2__0_in_rule__Event__Group_6__2__Impl5216 = new BitSet(new long[]{0x0000000000040002L});
        public static final BitSet FOLLOW_rule__Event__Group_6_2__0__Impl_in_rule__Event__Group_6_2__05253 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__Event__Group_6_2__1_in_rule__Event__Group_6_2__05256 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_18_in_rule__Event__Group_6_2__0__Impl5284 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Event__Group_6_2__1__Impl_in_rule__Event__Group_6_2__15315 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Event__RefinesAssignment_6_2_1_in_rule__Event__Group_6_2__1__Impl5342 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Event__Group_7__0__Impl_in_rule__Event__Group_7__05376 = new BitSet(new long[]{0x0000000004000000L});
        public static final BitSet FOLLOW_rule__Event__Group_7__1_in_rule__Event__Group_7__05379 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_30_in_rule__Event__Group_7__0__Impl5407 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Event__Group_7__1__Impl_in_rule__Event__Group_7__15438 = new BitSet(new long[]{0x0000000004000000L});
        public static final BitSet FOLLOW_rule__Event__Group_7__2_in_rule__Event__Group_7__15441 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Event__GuardsAssignment_7_1_in_rule__Event__Group_7__1__Impl5468 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Event__Group_7__2__Impl_in_rule__Event__Group_7__25498 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Event__GuardsAssignment_7_2_in_rule__Event__Group_7__2__Impl5525 = new BitSet(new long[]{0x0000000004000002L});
        public static final BitSet FOLLOW_rule__Event__Group_8__0__Impl_in_rule__Event__Group_8__05562 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__Event__Group_8__1_in_rule__Event__Group_8__05565 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_31_in_rule__Event__Group_8__0__Impl5593 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Event__Group_8__1__Impl_in_rule__Event__Group_8__15624 = new BitSet(new long[]{0x0000000100000030L});
        public static final BitSet FOLLOW_rule__Event__Group_8__2_in_rule__Event__Group_8__15627 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Event__ParametersAssignment_8_1_in_rule__Event__Group_8__1__Impl5654 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Event__Group_8__2__Impl_in_rule__Event__Group_8__25684 = new BitSet(new long[]{0x0000000100000030L});
        public static final BitSet FOLLOW_rule__Event__Group_8__3_in_rule__Event__Group_8__25687 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Event__ParametersAssignment_8_2_in_rule__Event__Group_8__2__Impl5714 = new BitSet(new long[]{0x0000000000000032L});
        public static final BitSet FOLLOW_rule__Event__Group_8__3__Impl_in_rule__Event__Group_8__35745 = new BitSet(new long[]{0x0000000004000000L});
        public static final BitSet FOLLOW_rule__Event__Group_8__4_in_rule__Event__Group_8__35748 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_32_in_rule__Event__Group_8__3__Impl5776 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Event__Group_8__4__Impl_in_rule__Event__Group_8__45807 = new BitSet(new long[]{0x0000000004000000L});
        public static final BitSet FOLLOW_rule__Event__Group_8__5_in_rule__Event__Group_8__45810 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Event__GuardsAssignment_8_4_in_rule__Event__Group_8__4__Impl5837 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Event__Group_8__5__Impl_in_rule__Event__Group_8__55867 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Event__GuardsAssignment_8_5_in_rule__Event__Group_8__5__Impl5894 = new BitSet(new long[]{0x0000000004000002L});
        public static final BitSet FOLLOW_rule__Event__Group_9__0__Impl_in_rule__Event__Group_9__05937 = new BitSet(new long[]{0x0000008800000000L});
        public static final BitSet FOLLOW_rule__Event__Group_9__1_in_rule__Event__Group_9__05940 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_33_in_rule__Event__Group_9__0__Impl5968 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Event__Group_9__1__Impl_in_rule__Event__Group_9__15999 = new BitSet(new long[]{0x0000008800000000L});
        public static final BitSet FOLLOW_rule__Event__Group_9__2_in_rule__Event__Group_9__16002 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Event__WitnessesAssignment_9_1_in_rule__Event__Group_9__1__Impl6029 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Event__Group_9__2__Impl_in_rule__Event__Group_9__26059 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Event__WitnessesAssignment_9_2_in_rule__Event__Group_9__2__Impl6086 = new BitSet(new long[]{0x0000008800000002L});
        public static final BitSet FOLLOW_rule__Event__Group_10__0__Impl_in_rule__Event__Group_10__06123 = new BitSet(new long[]{0x0000000004000000L});
        public static final BitSet FOLLOW_rule__Event__Group_10__1_in_rule__Event__Group_10__06126 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_34_in_rule__Event__Group_10__0__Impl6154 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Event__Group_10__1__Impl_in_rule__Event__Group_10__16185 = new BitSet(new long[]{0x0000000004000000L});
        public static final BitSet FOLLOW_rule__Event__Group_10__2_in_rule__Event__Group_10__16188 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Event__ActionsAssignment_10_1_in_rule__Event__Group_10__1__Impl6215 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Event__Group_10__2__Impl_in_rule__Event__Group_10__26245 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Event__ActionsAssignment_10_2_in_rule__Event__Group_10__2__Impl6272 = new BitSet(new long[]{0x0000000004000002L});
        public static final BitSet FOLLOW_rule__Parameter__Group__0__Impl_in_rule__Parameter__Group__06309 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__Parameter__Group__1_in_rule__Parameter__Group__06312 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Parameter__Group__1__Impl_in_rule__Parameter__Group__16370 = new BitSet(new long[]{0x0000000000010000L});
        public static final BitSet FOLLOW_rule__Parameter__Group__2_in_rule__Parameter__Group__16373 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Parameter__NameAssignment_1_in_rule__Parameter__Group__1__Impl6400 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Parameter__Group__2__Impl_in_rule__Parameter__Group__26430 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Parameter__Group_2__0_in_rule__Parameter__Group__2__Impl6457 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Parameter__Group_2__0__Impl_in_rule__Parameter__Group_2__06494 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__Parameter__Group_2__1_in_rule__Parameter__Group_2__06497 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_16_in_rule__Parameter__Group_2__0__Impl6525 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Parameter__Group_2__1__Impl_in_rule__Parameter__Group_2__16556 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Parameter__CommentAssignment_2_1_in_rule__Parameter__Group_2__1__Impl6583 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Guard__Group__0__Impl_in_rule__Guard__Group__06617 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__Guard__Group__1_in_rule__Guard__Group__06620 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_26_in_rule__Guard__Group__0__Impl6648 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Guard__Group__1__Impl_in_rule__Guard__Group__16679 = new BitSet(new long[]{0x0000002000000030L});
        public static final BitSet FOLLOW_rule__Guard__Group__2_in_rule__Guard__Group__16682 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Guard__NameAssignment_1_in_rule__Guard__Group__1__Impl6709 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Guard__Group__2__Impl_in_rule__Guard__Group__26739 = new BitSet(new long[]{0x0000002000000030L});
        public static final BitSet FOLLOW_rule__Guard__Group__3_in_rule__Guard__Group__26742 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Guard__TheoremAssignment_2_in_rule__Guard__Group__2__Impl6769 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Guard__Group__3__Impl_in_rule__Guard__Group__36800 = new BitSet(new long[]{0x0000000000010000L});
        public static final BitSet FOLLOW_rule__Guard__Group__4_in_rule__Guard__Group__36803 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Guard__PredicateAssignment_3_in_rule__Guard__Group__3__Impl6830 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Guard__Group__4__Impl_in_rule__Guard__Group__46860 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Guard__Group_4__0_in_rule__Guard__Group__4__Impl6887 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Guard__Group_4__0__Impl_in_rule__Guard__Group_4__06928 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__Guard__Group_4__1_in_rule__Guard__Group_4__06931 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_16_in_rule__Guard__Group_4__0__Impl6959 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Guard__Group_4__1__Impl_in_rule__Guard__Group_4__16990 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Guard__CommentAssignment_4_1_in_rule__Guard__Group_4__1__Impl7017 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Witness__Group__0__Impl_in_rule__Witness__Group__07051 = new BitSet(new long[]{0x0000008800000000L});
        public static final BitSet FOLLOW_rule__Witness__Group__1_in_rule__Witness__Group__07054 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Witness__LocalGeneratedAssignment_0_in_rule__Witness__Group__0__Impl7081 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Witness__Group__1__Impl_in_rule__Witness__Group__17112 = new BitSet(new long[]{0x0000000004000000L});
        public static final BitSet FOLLOW_rule__Witness__Group__2_in_rule__Witness__Group__17115 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_35_in_rule__Witness__Group__1__Impl7143 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Witness__Group__2__Impl_in_rule__Witness__Group__27174 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__Witness__Group__3_in_rule__Witness__Group__27177 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_26_in_rule__Witness__Group__2__Impl7205 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Witness__Group__3__Impl_in_rule__Witness__Group__37236 = new BitSet(new long[]{0x0000001000000000L});
        public static final BitSet FOLLOW_rule__Witness__Group__4_in_rule__Witness__Group__37239 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Witness__NameAssignment_3_in_rule__Witness__Group__3__Impl7266 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Witness__Group__4__Impl_in_rule__Witness__Group__47296 = new BitSet(new long[]{0x0000000000010030L});
        public static final BitSet FOLLOW_rule__Witness__Group__5_in_rule__Witness__Group__47299 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_36_in_rule__Witness__Group__4__Impl7327 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Witness__Group__5__Impl_in_rule__Witness__Group__57358 = new BitSet(new long[]{0x0000000000010030L});
        public static final BitSet FOLLOW_rule__Witness__Group__6_in_rule__Witness__Group__57361 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Witness__PredicateAssignment_5_in_rule__Witness__Group__5__Impl7388 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Witness__Group__6__Impl_in_rule__Witness__Group__67419 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Witness__Group_6__0_in_rule__Witness__Group__6__Impl7446 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Witness__Group_6__0__Impl_in_rule__Witness__Group_6__07491 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__Witness__Group_6__1_in_rule__Witness__Group_6__07494 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_16_in_rule__Witness__Group_6__0__Impl7522 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Witness__Group_6__1__Impl_in_rule__Witness__Group_6__17553 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Witness__CommentAssignment_6_1_in_rule__Witness__Group_6__1__Impl7580 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Action__Group__0__Impl_in_rule__Action__Group__07614 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__Action__Group__1_in_rule__Action__Group__07617 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_26_in_rule__Action__Group__0__Impl7645 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Action__Group__1__Impl_in_rule__Action__Group__17676 = new BitSet(new long[]{0x0000000000010030L});
        public static final BitSet FOLLOW_rule__Action__Group__2_in_rule__Action__Group__17679 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Action__NameAssignment_1_in_rule__Action__Group__1__Impl7706 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Action__Group__2__Impl_in_rule__Action__Group__27736 = new BitSet(new long[]{0x0000000000010030L});
        public static final BitSet FOLLOW_rule__Action__Group__3_in_rule__Action__Group__27739 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Action__ActionAssignment_2_in_rule__Action__Group__2__Impl7766 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Action__Group__3__Impl_in_rule__Action__Group__37797 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Action__Group_3__0_in_rule__Action__Group__3__Impl7824 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Action__Group_3__0__Impl_in_rule__Action__Group_3__07863 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__Action__Group_3__1_in_rule__Action__Group_3__07866 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_16_in_rule__Action__Group_3__0__Impl7894 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Action__Group_3__1__Impl_in_rule__Action__Group_3__17925 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Action__CommentAssignment_3_1_in_rule__Action__Group_3__1__Impl7952 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__Machine__NameAssignment_27991 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__Machine__CommentAssignment_3_18022 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__Machine__RefinesAssignment_4_18057 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__Machine__RefinesAssignment_4_2_18096 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__Machine__SeesAssignment_5_28135 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__Machine__SeesAssignment_5_3_18174 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleVariable_in_rule__Machine__VariablesAssignment_6_18209 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleVariable_in_rule__Machine__VariablesAssignment_6_28240 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleInvariant_in_rule__Machine__InvariantsAssignment_7_18271 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleInvariant_in_rule__Machine__InvariantsAssignment_7_28302 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleVariant_in_rule__Machine__VariantAssignment_8_18333 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleevent_in_rule__Machine__EventsAssignment_9_18364 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleevent_in_rule__Machine__EventsAssignment_9_28395 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__Variable__NameAssignment_18426 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__Variable__CommentAssignment_2_18457 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__Invariant__NameAssignment_18488 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_37_in_rule__Invariant__TheoremAssignment_28524 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__Invariant__PredicateAssignment_38563 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__Invariant__CommentAssignment_4_18594 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__Variant__ExpressionAssignment_28625 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__Variant__CommentAssignment_3_18656 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__Event__NameAssignment_28687 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_38_in_rule__Event__ExtendedAssignment_38723 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleConvergence_in_rule__Event__ConvergenceAssignment_48762 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__Event__CommentAssignment_5_18793 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__Event__RefinesAssignment_6_18828 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__Event__RefinesAssignment_6_2_18867 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleGuard_in_rule__Event__GuardsAssignment_7_18902 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleGuard_in_rule__Event__GuardsAssignment_7_28933 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleParameter_in_rule__Event__ParametersAssignment_8_18964 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleParameter_in_rule__Event__ParametersAssignment_8_28995 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleGuard_in_rule__Event__GuardsAssignment_8_49026 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleGuard_in_rule__Event__GuardsAssignment_8_59057 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleWitness_in_rule__Event__WitnessesAssignment_9_19088 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleWitness_in_rule__Event__WitnessesAssignment_9_29119 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAction_in_rule__Event__ActionsAssignment_10_19150 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAction_in_rule__Event__ActionsAssignment_10_29181 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__Parameter__NameAssignment_19212 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__Parameter__CommentAssignment_2_19243 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__Guard__NameAssignment_19274 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_37_in_rule__Guard__TheoremAssignment_29310 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__Guard__PredicateAssignment_39349 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__Guard__CommentAssignment_4_19380 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_39_in_rule__Witness__LocalGeneratedAssignment_09416 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__Witness__NameAssignment_39455 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__Witness__PredicateAssignment_59486 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__Witness__CommentAssignment_6_19517 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__Action__NameAssignment_19548 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__Action__ActionAssignment_29579 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__Action__CommentAssignment_3_19610 = new BitSet(new long[]{0x0000000000000002L});
    }


}