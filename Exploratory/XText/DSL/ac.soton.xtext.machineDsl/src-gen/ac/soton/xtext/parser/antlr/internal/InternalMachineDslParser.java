package ac.soton.xtext.parser.antlr.internal; 

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.common.util.Enumerator;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import ac.soton.xtext.services.MachineDslGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalMachineDslParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'machine'", "'//'", "'refines'", "','", "'sees'", "'('", "')'", "'variables'", "'invariants'", "'variant'", "'events'", "'end'", "'@'", "'theorem'", "'Variant'", "'expression'", "'event'", "'extended'", "'when'", "'any'", "'where'", "'witnesses'", "'then'", "'localGenerated'", "'witness'", "'predicate'", "'ordinary'", "'convergent'", "'anticipated'"
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
    public String getGrammarFileName() { return "../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g"; }



     	private MachineDslGrammarAccess grammarAccess;
     	
        public InternalMachineDslParser(TokenStream input, MachineDslGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }
        
        @Override
        protected String getFirstRuleName() {
        	return "Machine";	
       	}
       	
       	@Override
       	protected MachineDslGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}



    // $ANTLR start "entryRuleMachine"
    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:68:1: entryRuleMachine returns [EObject current=null] : iv_ruleMachine= ruleMachine EOF ;
    public final EObject entryRuleMachine() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMachine = null;


        try {
            // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:69:2: (iv_ruleMachine= ruleMachine EOF )
            // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:70:2: iv_ruleMachine= ruleMachine EOF
            {
             newCompositeNode(grammarAccess.getMachineRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleMachine_in_entryRuleMachine75);
            iv_ruleMachine=ruleMachine();

            state._fsp--;

             current =iv_ruleMachine; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleMachine85); 

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
    // $ANTLR end "entryRuleMachine"


    // $ANTLR start "ruleMachine"
    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:77:1: ruleMachine returns [EObject current=null] : ( () otherlv_1= 'machine' ( (lv_name_2_0= ruleEString ) ) (otherlv_3= '//' ( (lv_comment_4_0= ruleEString ) ) )? (otherlv_5= 'refines' ( ( ruleEString ) ) (otherlv_7= ',' ( ( ruleEString ) ) )* )? (otherlv_9= 'sees' otherlv_10= '(' ( ( ruleEString ) ) (otherlv_12= ',' ( ( ruleEString ) ) )* otherlv_14= ')' )? (otherlv_15= 'variables' ( (lv_variables_16_0= ruleVariable ) ) ( (lv_variables_17_0= ruleVariable ) )* )? (otherlv_18= 'invariants' ( (lv_invariants_19_0= ruleInvariant ) ) ( (lv_invariants_20_0= ruleInvariant ) )* )? (otherlv_21= 'variant' ( (lv_variant_22_0= ruleVariant ) ) )? (otherlv_23= 'events' ( (lv_events_24_0= ruleevent ) ) ( (lv_events_25_0= ruleevent ) )* )? otherlv_26= 'end' ) ;
    public final EObject ruleMachine() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        Token otherlv_14=null;
        Token otherlv_15=null;
        Token otherlv_18=null;
        Token otherlv_21=null;
        Token otherlv_23=null;
        Token otherlv_26=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        AntlrDatatypeRuleToken lv_comment_4_0 = null;

        EObject lv_variables_16_0 = null;

        EObject lv_variables_17_0 = null;

        EObject lv_invariants_19_0 = null;

        EObject lv_invariants_20_0 = null;

        EObject lv_variant_22_0 = null;

        EObject lv_events_24_0 = null;

        EObject lv_events_25_0 = null;


         enterRule(); 
            
        try {
            // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:80:28: ( ( () otherlv_1= 'machine' ( (lv_name_2_0= ruleEString ) ) (otherlv_3= '//' ( (lv_comment_4_0= ruleEString ) ) )? (otherlv_5= 'refines' ( ( ruleEString ) ) (otherlv_7= ',' ( ( ruleEString ) ) )* )? (otherlv_9= 'sees' otherlv_10= '(' ( ( ruleEString ) ) (otherlv_12= ',' ( ( ruleEString ) ) )* otherlv_14= ')' )? (otherlv_15= 'variables' ( (lv_variables_16_0= ruleVariable ) ) ( (lv_variables_17_0= ruleVariable ) )* )? (otherlv_18= 'invariants' ( (lv_invariants_19_0= ruleInvariant ) ) ( (lv_invariants_20_0= ruleInvariant ) )* )? (otherlv_21= 'variant' ( (lv_variant_22_0= ruleVariant ) ) )? (otherlv_23= 'events' ( (lv_events_24_0= ruleevent ) ) ( (lv_events_25_0= ruleevent ) )* )? otherlv_26= 'end' ) )
            // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:81:1: ( () otherlv_1= 'machine' ( (lv_name_2_0= ruleEString ) ) (otherlv_3= '//' ( (lv_comment_4_0= ruleEString ) ) )? (otherlv_5= 'refines' ( ( ruleEString ) ) (otherlv_7= ',' ( ( ruleEString ) ) )* )? (otherlv_9= 'sees' otherlv_10= '(' ( ( ruleEString ) ) (otherlv_12= ',' ( ( ruleEString ) ) )* otherlv_14= ')' )? (otherlv_15= 'variables' ( (lv_variables_16_0= ruleVariable ) ) ( (lv_variables_17_0= ruleVariable ) )* )? (otherlv_18= 'invariants' ( (lv_invariants_19_0= ruleInvariant ) ) ( (lv_invariants_20_0= ruleInvariant ) )* )? (otherlv_21= 'variant' ( (lv_variant_22_0= ruleVariant ) ) )? (otherlv_23= 'events' ( (lv_events_24_0= ruleevent ) ) ( (lv_events_25_0= ruleevent ) )* )? otherlv_26= 'end' )
            {
            // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:81:1: ( () otherlv_1= 'machine' ( (lv_name_2_0= ruleEString ) ) (otherlv_3= '//' ( (lv_comment_4_0= ruleEString ) ) )? (otherlv_5= 'refines' ( ( ruleEString ) ) (otherlv_7= ',' ( ( ruleEString ) ) )* )? (otherlv_9= 'sees' otherlv_10= '(' ( ( ruleEString ) ) (otherlv_12= ',' ( ( ruleEString ) ) )* otherlv_14= ')' )? (otherlv_15= 'variables' ( (lv_variables_16_0= ruleVariable ) ) ( (lv_variables_17_0= ruleVariable ) )* )? (otherlv_18= 'invariants' ( (lv_invariants_19_0= ruleInvariant ) ) ( (lv_invariants_20_0= ruleInvariant ) )* )? (otherlv_21= 'variant' ( (lv_variant_22_0= ruleVariant ) ) )? (otherlv_23= 'events' ( (lv_events_24_0= ruleevent ) ) ( (lv_events_25_0= ruleevent ) )* )? otherlv_26= 'end' )
            // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:81:2: () otherlv_1= 'machine' ( (lv_name_2_0= ruleEString ) ) (otherlv_3= '//' ( (lv_comment_4_0= ruleEString ) ) )? (otherlv_5= 'refines' ( ( ruleEString ) ) (otherlv_7= ',' ( ( ruleEString ) ) )* )? (otherlv_9= 'sees' otherlv_10= '(' ( ( ruleEString ) ) (otherlv_12= ',' ( ( ruleEString ) ) )* otherlv_14= ')' )? (otherlv_15= 'variables' ( (lv_variables_16_0= ruleVariable ) ) ( (lv_variables_17_0= ruleVariable ) )* )? (otherlv_18= 'invariants' ( (lv_invariants_19_0= ruleInvariant ) ) ( (lv_invariants_20_0= ruleInvariant ) )* )? (otherlv_21= 'variant' ( (lv_variant_22_0= ruleVariant ) ) )? (otherlv_23= 'events' ( (lv_events_24_0= ruleevent ) ) ( (lv_events_25_0= ruleevent ) )* )? otherlv_26= 'end'
            {
            // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:81:2: ()
            // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:82:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getMachineAccess().getMachineAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,11,FollowSets000.FOLLOW_11_in_ruleMachine131); 

                	newLeafNode(otherlv_1, grammarAccess.getMachineAccess().getMachineKeyword_1());
                
            // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:91:1: ( (lv_name_2_0= ruleEString ) )
            // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:92:1: (lv_name_2_0= ruleEString )
            {
            // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:92:1: (lv_name_2_0= ruleEString )
            // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:93:3: lv_name_2_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getMachineAccess().getNameEStringParserRuleCall_2_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleMachine152);
            lv_name_2_0=ruleEString();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getMachineRule());
            	        }
                   		set(
                   			current, 
                   			"name",
                    		lv_name_2_0, 
                    		"EString");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:109:2: (otherlv_3= '//' ( (lv_comment_4_0= ruleEString ) ) )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==12) ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:109:4: otherlv_3= '//' ( (lv_comment_4_0= ruleEString ) )
                    {
                    otherlv_3=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleMachine165); 

                        	newLeafNode(otherlv_3, grammarAccess.getMachineAccess().getSolidusSolidusKeyword_3_0());
                        
                    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:113:1: ( (lv_comment_4_0= ruleEString ) )
                    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:114:1: (lv_comment_4_0= ruleEString )
                    {
                    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:114:1: (lv_comment_4_0= ruleEString )
                    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:115:3: lv_comment_4_0= ruleEString
                    {
                     
                    	        newCompositeNode(grammarAccess.getMachineAccess().getCommentEStringParserRuleCall_3_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleMachine186);
                    lv_comment_4_0=ruleEString();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getMachineRule());
                    	        }
                           		set(
                           			current, 
                           			"comment",
                            		lv_comment_4_0, 
                            		"EString");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:131:4: (otherlv_5= 'refines' ( ( ruleEString ) ) (otherlv_7= ',' ( ( ruleEString ) ) )* )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==13) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:131:6: otherlv_5= 'refines' ( ( ruleEString ) ) (otherlv_7= ',' ( ( ruleEString ) ) )*
                    {
                    otherlv_5=(Token)match(input,13,FollowSets000.FOLLOW_13_in_ruleMachine201); 

                        	newLeafNode(otherlv_5, grammarAccess.getMachineAccess().getRefinesKeyword_4_0());
                        
                    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:135:1: ( ( ruleEString ) )
                    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:136:1: ( ruleEString )
                    {
                    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:136:1: ( ruleEString )
                    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:137:3: ruleEString
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getMachineRule());
                    	        }
                            
                     
                    	        newCompositeNode(grammarAccess.getMachineAccess().getRefinesMachineCrossReference_4_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleMachine224);
                    ruleEString();

                    state._fsp--;

                     
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:150:2: (otherlv_7= ',' ( ( ruleEString ) ) )*
                    loop2:
                    do {
                        int alt2=2;
                        int LA2_0 = input.LA(1);

                        if ( (LA2_0==14) ) {
                            alt2=1;
                        }


                        switch (alt2) {
                    	case 1 :
                    	    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:150:4: otherlv_7= ',' ( ( ruleEString ) )
                    	    {
                    	    otherlv_7=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleMachine237); 

                    	        	newLeafNode(otherlv_7, grammarAccess.getMachineAccess().getCommaKeyword_4_2_0());
                    	        
                    	    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:154:1: ( ( ruleEString ) )
                    	    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:155:1: ( ruleEString )
                    	    {
                    	    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:155:1: ( ruleEString )
                    	    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:156:3: ruleEString
                    	    {

                    	    			if (current==null) {
                    	    	            current = createModelElement(grammarAccess.getMachineRule());
                    	    	        }
                    	            
                    	     
                    	    	        newCompositeNode(grammarAccess.getMachineAccess().getRefinesMachineCrossReference_4_2_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleMachine260);
                    	    ruleEString();

                    	    state._fsp--;

                    	     
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

            // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:169:6: (otherlv_9= 'sees' otherlv_10= '(' ( ( ruleEString ) ) (otherlv_12= ',' ( ( ruleEString ) ) )* otherlv_14= ')' )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==15) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:169:8: otherlv_9= 'sees' otherlv_10= '(' ( ( ruleEString ) ) (otherlv_12= ',' ( ( ruleEString ) ) )* otherlv_14= ')'
                    {
                    otherlv_9=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleMachine277); 

                        	newLeafNode(otherlv_9, grammarAccess.getMachineAccess().getSeesKeyword_5_0());
                        
                    otherlv_10=(Token)match(input,16,FollowSets000.FOLLOW_16_in_ruleMachine289); 

                        	newLeafNode(otherlv_10, grammarAccess.getMachineAccess().getLeftParenthesisKeyword_5_1());
                        
                    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:177:1: ( ( ruleEString ) )
                    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:178:1: ( ruleEString )
                    {
                    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:178:1: ( ruleEString )
                    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:179:3: ruleEString
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getMachineRule());
                    	        }
                            
                     
                    	        newCompositeNode(grammarAccess.getMachineAccess().getSeesContextCrossReference_5_2_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleMachine312);
                    ruleEString();

                    state._fsp--;

                     
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:192:2: (otherlv_12= ',' ( ( ruleEString ) ) )*
                    loop4:
                    do {
                        int alt4=2;
                        int LA4_0 = input.LA(1);

                        if ( (LA4_0==14) ) {
                            alt4=1;
                        }


                        switch (alt4) {
                    	case 1 :
                    	    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:192:4: otherlv_12= ',' ( ( ruleEString ) )
                    	    {
                    	    otherlv_12=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleMachine325); 

                    	        	newLeafNode(otherlv_12, grammarAccess.getMachineAccess().getCommaKeyword_5_3_0());
                    	        
                    	    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:196:1: ( ( ruleEString ) )
                    	    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:197:1: ( ruleEString )
                    	    {
                    	    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:197:1: ( ruleEString )
                    	    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:198:3: ruleEString
                    	    {

                    	    			if (current==null) {
                    	    	            current = createModelElement(grammarAccess.getMachineRule());
                    	    	        }
                    	            
                    	     
                    	    	        newCompositeNode(grammarAccess.getMachineAccess().getSeesContextCrossReference_5_3_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleMachine348);
                    	    ruleEString();

                    	    state._fsp--;

                    	     
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop4;
                        }
                    } while (true);

                    otherlv_14=(Token)match(input,17,FollowSets000.FOLLOW_17_in_ruleMachine362); 

                        	newLeafNode(otherlv_14, grammarAccess.getMachineAccess().getRightParenthesisKeyword_5_4());
                        

                    }
                    break;

            }

            // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:215:3: (otherlv_15= 'variables' ( (lv_variables_16_0= ruleVariable ) ) ( (lv_variables_17_0= ruleVariable ) )* )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==18) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:215:5: otherlv_15= 'variables' ( (lv_variables_16_0= ruleVariable ) ) ( (lv_variables_17_0= ruleVariable ) )*
                    {
                    otherlv_15=(Token)match(input,18,FollowSets000.FOLLOW_18_in_ruleMachine377); 

                        	newLeafNode(otherlv_15, grammarAccess.getMachineAccess().getVariablesKeyword_6_0());
                        
                    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:219:1: ( (lv_variables_16_0= ruleVariable ) )
                    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:220:1: (lv_variables_16_0= ruleVariable )
                    {
                    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:220:1: (lv_variables_16_0= ruleVariable )
                    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:221:3: lv_variables_16_0= ruleVariable
                    {
                     
                    	        newCompositeNode(grammarAccess.getMachineAccess().getVariablesVariableParserRuleCall_6_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleVariable_in_ruleMachine398);
                    lv_variables_16_0=ruleVariable();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getMachineRule());
                    	        }
                           		add(
                           			current, 
                           			"variables",
                            		lv_variables_16_0, 
                            		"Variable");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:237:2: ( (lv_variables_17_0= ruleVariable ) )*
                    loop6:
                    do {
                        int alt6=2;
                        int LA6_0 = input.LA(1);

                        if ( ((LA6_0>=RULE_STRING && LA6_0<=RULE_ID)) ) {
                            alt6=1;
                        }


                        switch (alt6) {
                    	case 1 :
                    	    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:238:1: (lv_variables_17_0= ruleVariable )
                    	    {
                    	    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:238:1: (lv_variables_17_0= ruleVariable )
                    	    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:239:3: lv_variables_17_0= ruleVariable
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getMachineAccess().getVariablesVariableParserRuleCall_6_2_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleVariable_in_ruleMachine419);
                    	    lv_variables_17_0=ruleVariable();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getMachineRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"variables",
                    	            		lv_variables_17_0, 
                    	            		"Variable");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop6;
                        }
                    } while (true);


                    }
                    break;

            }

            // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:255:5: (otherlv_18= 'invariants' ( (lv_invariants_19_0= ruleInvariant ) ) ( (lv_invariants_20_0= ruleInvariant ) )* )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==19) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:255:7: otherlv_18= 'invariants' ( (lv_invariants_19_0= ruleInvariant ) ) ( (lv_invariants_20_0= ruleInvariant ) )*
                    {
                    otherlv_18=(Token)match(input,19,FollowSets000.FOLLOW_19_in_ruleMachine435); 

                        	newLeafNode(otherlv_18, grammarAccess.getMachineAccess().getInvariantsKeyword_7_0());
                        
                    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:259:1: ( (lv_invariants_19_0= ruleInvariant ) )
                    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:260:1: (lv_invariants_19_0= ruleInvariant )
                    {
                    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:260:1: (lv_invariants_19_0= ruleInvariant )
                    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:261:3: lv_invariants_19_0= ruleInvariant
                    {
                     
                    	        newCompositeNode(grammarAccess.getMachineAccess().getInvariantsInvariantParserRuleCall_7_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleInvariant_in_ruleMachine456);
                    lv_invariants_19_0=ruleInvariant();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getMachineRule());
                    	        }
                           		add(
                           			current, 
                           			"invariants",
                            		lv_invariants_19_0, 
                            		"Invariant");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:277:2: ( (lv_invariants_20_0= ruleInvariant ) )*
                    loop8:
                    do {
                        int alt8=2;
                        int LA8_0 = input.LA(1);

                        if ( (LA8_0==23) ) {
                            alt8=1;
                        }


                        switch (alt8) {
                    	case 1 :
                    	    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:278:1: (lv_invariants_20_0= ruleInvariant )
                    	    {
                    	    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:278:1: (lv_invariants_20_0= ruleInvariant )
                    	    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:279:3: lv_invariants_20_0= ruleInvariant
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getMachineAccess().getInvariantsInvariantParserRuleCall_7_2_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleInvariant_in_ruleMachine477);
                    	    lv_invariants_20_0=ruleInvariant();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getMachineRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"invariants",
                    	            		lv_invariants_20_0, 
                    	            		"Invariant");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop8;
                        }
                    } while (true);


                    }
                    break;

            }

            // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:295:5: (otherlv_21= 'variant' ( (lv_variant_22_0= ruleVariant ) ) )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==20) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:295:7: otherlv_21= 'variant' ( (lv_variant_22_0= ruleVariant ) )
                    {
                    otherlv_21=(Token)match(input,20,FollowSets000.FOLLOW_20_in_ruleMachine493); 

                        	newLeafNode(otherlv_21, grammarAccess.getMachineAccess().getVariantKeyword_8_0());
                        
                    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:299:1: ( (lv_variant_22_0= ruleVariant ) )
                    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:300:1: (lv_variant_22_0= ruleVariant )
                    {
                    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:300:1: (lv_variant_22_0= ruleVariant )
                    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:301:3: lv_variant_22_0= ruleVariant
                    {
                     
                    	        newCompositeNode(grammarAccess.getMachineAccess().getVariantVariantParserRuleCall_8_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleVariant_in_ruleMachine514);
                    lv_variant_22_0=ruleVariant();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getMachineRule());
                    	        }
                           		set(
                           			current, 
                           			"variant",
                            		lv_variant_22_0, 
                            		"Variant");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:317:4: (otherlv_23= 'events' ( (lv_events_24_0= ruleevent ) ) ( (lv_events_25_0= ruleevent ) )* )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==21) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:317:6: otherlv_23= 'events' ( (lv_events_24_0= ruleevent ) ) ( (lv_events_25_0= ruleevent ) )*
                    {
                    otherlv_23=(Token)match(input,21,FollowSets000.FOLLOW_21_in_ruleMachine529); 

                        	newLeafNode(otherlv_23, grammarAccess.getMachineAccess().getEventsKeyword_9_0());
                        
                    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:321:1: ( (lv_events_24_0= ruleevent ) )
                    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:322:1: (lv_events_24_0= ruleevent )
                    {
                    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:322:1: (lv_events_24_0= ruleevent )
                    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:323:3: lv_events_24_0= ruleevent
                    {
                     
                    	        newCompositeNode(grammarAccess.getMachineAccess().getEventsEventParserRuleCall_9_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleevent_in_ruleMachine550);
                    lv_events_24_0=ruleevent();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getMachineRule());
                    	        }
                           		add(
                           			current, 
                           			"events",
                            		lv_events_24_0, 
                            		"event");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:339:2: ( (lv_events_25_0= ruleevent ) )*
                    loop11:
                    do {
                        int alt11=2;
                        int LA11_0 = input.LA(1);

                        if ( (LA11_0==27) ) {
                            alt11=1;
                        }


                        switch (alt11) {
                    	case 1 :
                    	    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:340:1: (lv_events_25_0= ruleevent )
                    	    {
                    	    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:340:1: (lv_events_25_0= ruleevent )
                    	    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:341:3: lv_events_25_0= ruleevent
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getMachineAccess().getEventsEventParserRuleCall_9_2_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleevent_in_ruleMachine571);
                    	    lv_events_25_0=ruleevent();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getMachineRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"events",
                    	            		lv_events_25_0, 
                    	            		"event");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop11;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_26=(Token)match(input,22,FollowSets000.FOLLOW_22_in_ruleMachine586); 

                	newLeafNode(otherlv_26, grammarAccess.getMachineAccess().getEndKeyword_10());
                

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
    // $ANTLR end "ruleMachine"


    // $ANTLR start "entryRuleEString"
    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:369:1: entryRuleEString returns [String current=null] : iv_ruleEString= ruleEString EOF ;
    public final String entryRuleEString() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEString = null;


        try {
            // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:370:2: (iv_ruleEString= ruleEString EOF )
            // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:371:2: iv_ruleEString= ruleEString EOF
            {
             newCompositeNode(grammarAccess.getEStringRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_entryRuleEString623);
            iv_ruleEString=ruleEString();

            state._fsp--;

             current =iv_ruleEString.getText(); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleEString634); 

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
    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:378:1: ruleEString returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) ;
    public final AntlrDatatypeRuleToken ruleEString() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;
        Token this_ID_1=null;

         enterRule(); 
            
        try {
            // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:381:28: ( (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) )
            // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:382:1: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            {
            // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:382:1: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==RULE_STRING) ) {
                alt13=1;
            }
            else if ( (LA13_0==RULE_ID) ) {
                alt13=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 13, 0, input);

                throw nvae;
            }
            switch (alt13) {
                case 1 :
                    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:382:6: this_STRING_0= RULE_STRING
                    {
                    this_STRING_0=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_RULE_STRING_in_ruleEString674); 

                    		current.merge(this_STRING_0);
                        
                     
                        newLeafNode(this_STRING_0, grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 
                        

                    }
                    break;
                case 2 :
                    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:390:10: this_ID_1= RULE_ID
                    {
                    this_ID_1=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleEString700); 

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


    // $ANTLR start "entryRuleVariable"
    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:405:1: entryRuleVariable returns [EObject current=null] : iv_ruleVariable= ruleVariable EOF ;
    public final EObject entryRuleVariable() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVariable = null;


        try {
            // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:406:2: (iv_ruleVariable= ruleVariable EOF )
            // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:407:2: iv_ruleVariable= ruleVariable EOF
            {
             newCompositeNode(grammarAccess.getVariableRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleVariable_in_entryRuleVariable745);
            iv_ruleVariable=ruleVariable();

            state._fsp--;

             current =iv_ruleVariable; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleVariable755); 

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
    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:414:1: ruleVariable returns [EObject current=null] : ( () ( (lv_name_1_0= ruleEString ) ) (otherlv_2= '//' ( (lv_comment_3_0= ruleEString ) ) )? ) ;
    public final EObject ruleVariable() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        AntlrDatatypeRuleToken lv_comment_3_0 = null;


         enterRule(); 
            
        try {
            // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:417:28: ( ( () ( (lv_name_1_0= ruleEString ) ) (otherlv_2= '//' ( (lv_comment_3_0= ruleEString ) ) )? ) )
            // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:418:1: ( () ( (lv_name_1_0= ruleEString ) ) (otherlv_2= '//' ( (lv_comment_3_0= ruleEString ) ) )? )
            {
            // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:418:1: ( () ( (lv_name_1_0= ruleEString ) ) (otherlv_2= '//' ( (lv_comment_3_0= ruleEString ) ) )? )
            // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:418:2: () ( (lv_name_1_0= ruleEString ) ) (otherlv_2= '//' ( (lv_comment_3_0= ruleEString ) ) )?
            {
            // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:418:2: ()
            // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:419:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getVariableAccess().getVariableAction_0(),
                        current);
                

            }

            // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:424:2: ( (lv_name_1_0= ruleEString ) )
            // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:425:1: (lv_name_1_0= ruleEString )
            {
            // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:425:1: (lv_name_1_0= ruleEString )
            // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:426:3: lv_name_1_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getVariableAccess().getNameEStringParserRuleCall_1_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleVariable810);
            lv_name_1_0=ruleEString();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getVariableRule());
            	        }
                   		set(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"EString");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:442:2: (otherlv_2= '//' ( (lv_comment_3_0= ruleEString ) ) )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==12) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:442:4: otherlv_2= '//' ( (lv_comment_3_0= ruleEString ) )
                    {
                    otherlv_2=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleVariable823); 

                        	newLeafNode(otherlv_2, grammarAccess.getVariableAccess().getSolidusSolidusKeyword_2_0());
                        
                    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:446:1: ( (lv_comment_3_0= ruleEString ) )
                    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:447:1: (lv_comment_3_0= ruleEString )
                    {
                    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:447:1: (lv_comment_3_0= ruleEString )
                    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:448:3: lv_comment_3_0= ruleEString
                    {
                     
                    	        newCompositeNode(grammarAccess.getVariableAccess().getCommentEStringParserRuleCall_2_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleVariable844);
                    lv_comment_3_0=ruleEString();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getVariableRule());
                    	        }
                           		set(
                           			current, 
                           			"comment",
                            		lv_comment_3_0, 
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
    // $ANTLR end "ruleVariable"


    // $ANTLR start "entryRuleInvariant"
    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:472:1: entryRuleInvariant returns [EObject current=null] : iv_ruleInvariant= ruleInvariant EOF ;
    public final EObject entryRuleInvariant() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInvariant = null;


        try {
            // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:473:2: (iv_ruleInvariant= ruleInvariant EOF )
            // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:474:2: iv_ruleInvariant= ruleInvariant EOF
            {
             newCompositeNode(grammarAccess.getInvariantRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleInvariant_in_entryRuleInvariant882);
            iv_ruleInvariant=ruleInvariant();

            state._fsp--;

             current =iv_ruleInvariant; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleInvariant892); 

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
    // $ANTLR end "entryRuleInvariant"


    // $ANTLR start "ruleInvariant"
    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:481:1: ruleInvariant returns [EObject current=null] : (otherlv_0= '@' ( (lv_name_1_0= ruleEString ) ) ( (lv_theorem_2_0= 'theorem' ) )? ( (lv_predicate_3_0= ruleEString ) )? (otherlv_4= '//' ( (lv_comment_5_0= ruleEString ) ) )? ) ;
    public final EObject ruleInvariant() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_theorem_2_0=null;
        Token otherlv_4=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        AntlrDatatypeRuleToken lv_predicate_3_0 = null;

        AntlrDatatypeRuleToken lv_comment_5_0 = null;


         enterRule(); 
            
        try {
            // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:484:28: ( (otherlv_0= '@' ( (lv_name_1_0= ruleEString ) ) ( (lv_theorem_2_0= 'theorem' ) )? ( (lv_predicate_3_0= ruleEString ) )? (otherlv_4= '//' ( (lv_comment_5_0= ruleEString ) ) )? ) )
            // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:485:1: (otherlv_0= '@' ( (lv_name_1_0= ruleEString ) ) ( (lv_theorem_2_0= 'theorem' ) )? ( (lv_predicate_3_0= ruleEString ) )? (otherlv_4= '//' ( (lv_comment_5_0= ruleEString ) ) )? )
            {
            // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:485:1: (otherlv_0= '@' ( (lv_name_1_0= ruleEString ) ) ( (lv_theorem_2_0= 'theorem' ) )? ( (lv_predicate_3_0= ruleEString ) )? (otherlv_4= '//' ( (lv_comment_5_0= ruleEString ) ) )? )
            // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:485:3: otherlv_0= '@' ( (lv_name_1_0= ruleEString ) ) ( (lv_theorem_2_0= 'theorem' ) )? ( (lv_predicate_3_0= ruleEString ) )? (otherlv_4= '//' ( (lv_comment_5_0= ruleEString ) ) )?
            {
            otherlv_0=(Token)match(input,23,FollowSets000.FOLLOW_23_in_ruleInvariant929); 

                	newLeafNode(otherlv_0, grammarAccess.getInvariantAccess().getCommercialAtKeyword_0());
                
            // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:489:1: ( (lv_name_1_0= ruleEString ) )
            // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:490:1: (lv_name_1_0= ruleEString )
            {
            // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:490:1: (lv_name_1_0= ruleEString )
            // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:491:3: lv_name_1_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getInvariantAccess().getNameEStringParserRuleCall_1_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleInvariant950);
            lv_name_1_0=ruleEString();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getInvariantRule());
            	        }
                   		set(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"EString");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:507:2: ( (lv_theorem_2_0= 'theorem' ) )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==24) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:508:1: (lv_theorem_2_0= 'theorem' )
                    {
                    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:508:1: (lv_theorem_2_0= 'theorem' )
                    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:509:3: lv_theorem_2_0= 'theorem'
                    {
                    lv_theorem_2_0=(Token)match(input,24,FollowSets000.FOLLOW_24_in_ruleInvariant968); 

                            newLeafNode(lv_theorem_2_0, grammarAccess.getInvariantAccess().getTheoremTheoremKeyword_2_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getInvariantRule());
                    	        }
                           		setWithLastConsumed(current, "theorem", true, "theorem");
                    	    

                    }


                    }
                    break;

            }

            // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:522:3: ( (lv_predicate_3_0= ruleEString ) )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( ((LA16_0>=RULE_STRING && LA16_0<=RULE_ID)) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:523:1: (lv_predicate_3_0= ruleEString )
                    {
                    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:523:1: (lv_predicate_3_0= ruleEString )
                    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:524:3: lv_predicate_3_0= ruleEString
                    {
                     
                    	        newCompositeNode(grammarAccess.getInvariantAccess().getPredicateEStringParserRuleCall_3_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleInvariant1003);
                    lv_predicate_3_0=ruleEString();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getInvariantRule());
                    	        }
                           		set(
                           			current, 
                           			"predicate",
                            		lv_predicate_3_0, 
                            		"EString");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }
                    break;

            }

            // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:540:3: (otherlv_4= '//' ( (lv_comment_5_0= ruleEString ) ) )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==12) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:540:5: otherlv_4= '//' ( (lv_comment_5_0= ruleEString ) )
                    {
                    otherlv_4=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleInvariant1017); 

                        	newLeafNode(otherlv_4, grammarAccess.getInvariantAccess().getSolidusSolidusKeyword_4_0());
                        
                    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:544:1: ( (lv_comment_5_0= ruleEString ) )
                    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:545:1: (lv_comment_5_0= ruleEString )
                    {
                    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:545:1: (lv_comment_5_0= ruleEString )
                    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:546:3: lv_comment_5_0= ruleEString
                    {
                     
                    	        newCompositeNode(grammarAccess.getInvariantAccess().getCommentEStringParserRuleCall_4_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleInvariant1038);
                    lv_comment_5_0=ruleEString();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getInvariantRule());
                    	        }
                           		set(
                           			current, 
                           			"comment",
                            		lv_comment_5_0, 
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
    // $ANTLR end "ruleInvariant"


    // $ANTLR start "entryRuleVariant"
    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:570:1: entryRuleVariant returns [EObject current=null] : iv_ruleVariant= ruleVariant EOF ;
    public final EObject entryRuleVariant() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVariant = null;


        try {
            // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:571:2: (iv_ruleVariant= ruleVariant EOF )
            // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:572:2: iv_ruleVariant= ruleVariant EOF
            {
             newCompositeNode(grammarAccess.getVariantRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleVariant_in_entryRuleVariant1076);
            iv_ruleVariant=ruleVariant();

            state._fsp--;

             current =iv_ruleVariant; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleVariant1086); 

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
    // $ANTLR end "entryRuleVariant"


    // $ANTLR start "ruleVariant"
    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:579:1: ruleVariant returns [EObject current=null] : (otherlv_0= 'Variant' otherlv_1= 'expression' ( (lv_expression_2_0= ruleEString ) )? (otherlv_3= '//' ( (lv_comment_4_0= ruleEString ) ) ) ) ;
    public final EObject ruleVariant() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        AntlrDatatypeRuleToken lv_expression_2_0 = null;

        AntlrDatatypeRuleToken lv_comment_4_0 = null;


         enterRule(); 
            
        try {
            // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:582:28: ( (otherlv_0= 'Variant' otherlv_1= 'expression' ( (lv_expression_2_0= ruleEString ) )? (otherlv_3= '//' ( (lv_comment_4_0= ruleEString ) ) ) ) )
            // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:583:1: (otherlv_0= 'Variant' otherlv_1= 'expression' ( (lv_expression_2_0= ruleEString ) )? (otherlv_3= '//' ( (lv_comment_4_0= ruleEString ) ) ) )
            {
            // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:583:1: (otherlv_0= 'Variant' otherlv_1= 'expression' ( (lv_expression_2_0= ruleEString ) )? (otherlv_3= '//' ( (lv_comment_4_0= ruleEString ) ) ) )
            // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:583:3: otherlv_0= 'Variant' otherlv_1= 'expression' ( (lv_expression_2_0= ruleEString ) )? (otherlv_3= '//' ( (lv_comment_4_0= ruleEString ) ) )
            {
            otherlv_0=(Token)match(input,25,FollowSets000.FOLLOW_25_in_ruleVariant1123); 

                	newLeafNode(otherlv_0, grammarAccess.getVariantAccess().getVariantKeyword_0());
                
            otherlv_1=(Token)match(input,26,FollowSets000.FOLLOW_26_in_ruleVariant1135); 

                	newLeafNode(otherlv_1, grammarAccess.getVariantAccess().getExpressionKeyword_1());
                
            // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:591:1: ( (lv_expression_2_0= ruleEString ) )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( ((LA18_0>=RULE_STRING && LA18_0<=RULE_ID)) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:592:1: (lv_expression_2_0= ruleEString )
                    {
                    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:592:1: (lv_expression_2_0= ruleEString )
                    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:593:3: lv_expression_2_0= ruleEString
                    {
                     
                    	        newCompositeNode(grammarAccess.getVariantAccess().getExpressionEStringParserRuleCall_2_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleVariant1156);
                    lv_expression_2_0=ruleEString();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getVariantRule());
                    	        }
                           		set(
                           			current, 
                           			"expression",
                            		lv_expression_2_0, 
                            		"EString");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }
                    break;

            }

            // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:609:3: (otherlv_3= '//' ( (lv_comment_4_0= ruleEString ) ) )
            // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:609:5: otherlv_3= '//' ( (lv_comment_4_0= ruleEString ) )
            {
            otherlv_3=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleVariant1170); 

                	newLeafNode(otherlv_3, grammarAccess.getVariantAccess().getSolidusSolidusKeyword_3_0());
                
            // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:613:1: ( (lv_comment_4_0= ruleEString ) )
            // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:614:1: (lv_comment_4_0= ruleEString )
            {
            // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:614:1: (lv_comment_4_0= ruleEString )
            // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:615:3: lv_comment_4_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getVariantAccess().getCommentEStringParserRuleCall_3_1_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleVariant1191);
            lv_comment_4_0=ruleEString();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getVariantRule());
            	        }
                   		set(
                   			current, 
                   			"comment",
                    		lv_comment_4_0, 
                    		"EString");
            	        afterParserOrEnumRuleCall();
            	    

            }


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
    // $ANTLR end "ruleVariant"


    // $ANTLR start "entryRuleevent"
    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:639:1: entryRuleevent returns [EObject current=null] : iv_ruleevent= ruleevent EOF ;
    public final EObject entryRuleevent() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleevent = null;


        try {
            // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:640:2: (iv_ruleevent= ruleevent EOF )
            // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:641:2: iv_ruleevent= ruleevent EOF
            {
             newCompositeNode(grammarAccess.getEventRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleevent_in_entryRuleevent1228);
            iv_ruleevent=ruleevent();

            state._fsp--;

             current =iv_ruleevent; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleevent1238); 

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
    // $ANTLR end "entryRuleevent"


    // $ANTLR start "ruleevent"
    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:648:1: ruleevent returns [EObject current=null] : ( () otherlv_1= 'event' ( (lv_name_2_0= ruleEString ) ) ( (lv_extended_3_0= 'extended' ) )? ( (lv_convergence_4_0= ruleConvergence ) )? (otherlv_5= '//' ( (lv_comment_6_0= ruleEString ) ) )? (otherlv_7= 'refines' ( ( ruleEString ) ) (otherlv_9= ',' ( ( ruleEString ) ) )* )? (otherlv_11= 'when' ( (lv_guards_12_0= ruleGuard ) ) ( (lv_guards_13_0= ruleGuard ) )* )? (otherlv_14= 'any' ( (lv_parameters_15_0= ruleParameter ) ) ( (lv_parameters_16_0= ruleParameter ) )* otherlv_17= 'where' ( (lv_guards_18_0= ruleGuard ) ) ( (lv_guards_19_0= ruleGuard ) )* )? (otherlv_20= 'witnesses' ( (lv_witnesses_21_0= ruleWitness ) ) ( (lv_witnesses_22_0= ruleWitness ) )* )? (otherlv_23= 'then' ( (lv_actions_24_0= ruleAction ) ) ( (lv_actions_25_0= ruleAction ) )* )? otherlv_26= 'end' ) ;
    public final EObject ruleevent() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_extended_3_0=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        Token otherlv_14=null;
        Token otherlv_17=null;
        Token otherlv_20=null;
        Token otherlv_23=null;
        Token otherlv_26=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        Enumerator lv_convergence_4_0 = null;

        AntlrDatatypeRuleToken lv_comment_6_0 = null;

        EObject lv_guards_12_0 = null;

        EObject lv_guards_13_0 = null;

        EObject lv_parameters_15_0 = null;

        EObject lv_parameters_16_0 = null;

        EObject lv_guards_18_0 = null;

        EObject lv_guards_19_0 = null;

        EObject lv_witnesses_21_0 = null;

        EObject lv_witnesses_22_0 = null;

        EObject lv_actions_24_0 = null;

        EObject lv_actions_25_0 = null;


         enterRule(); 
            
        try {
            // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:651:28: ( ( () otherlv_1= 'event' ( (lv_name_2_0= ruleEString ) ) ( (lv_extended_3_0= 'extended' ) )? ( (lv_convergence_4_0= ruleConvergence ) )? (otherlv_5= '//' ( (lv_comment_6_0= ruleEString ) ) )? (otherlv_7= 'refines' ( ( ruleEString ) ) (otherlv_9= ',' ( ( ruleEString ) ) )* )? (otherlv_11= 'when' ( (lv_guards_12_0= ruleGuard ) ) ( (lv_guards_13_0= ruleGuard ) )* )? (otherlv_14= 'any' ( (lv_parameters_15_0= ruleParameter ) ) ( (lv_parameters_16_0= ruleParameter ) )* otherlv_17= 'where' ( (lv_guards_18_0= ruleGuard ) ) ( (lv_guards_19_0= ruleGuard ) )* )? (otherlv_20= 'witnesses' ( (lv_witnesses_21_0= ruleWitness ) ) ( (lv_witnesses_22_0= ruleWitness ) )* )? (otherlv_23= 'then' ( (lv_actions_24_0= ruleAction ) ) ( (lv_actions_25_0= ruleAction ) )* )? otherlv_26= 'end' ) )
            // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:652:1: ( () otherlv_1= 'event' ( (lv_name_2_0= ruleEString ) ) ( (lv_extended_3_0= 'extended' ) )? ( (lv_convergence_4_0= ruleConvergence ) )? (otherlv_5= '//' ( (lv_comment_6_0= ruleEString ) ) )? (otherlv_7= 'refines' ( ( ruleEString ) ) (otherlv_9= ',' ( ( ruleEString ) ) )* )? (otherlv_11= 'when' ( (lv_guards_12_0= ruleGuard ) ) ( (lv_guards_13_0= ruleGuard ) )* )? (otherlv_14= 'any' ( (lv_parameters_15_0= ruleParameter ) ) ( (lv_parameters_16_0= ruleParameter ) )* otherlv_17= 'where' ( (lv_guards_18_0= ruleGuard ) ) ( (lv_guards_19_0= ruleGuard ) )* )? (otherlv_20= 'witnesses' ( (lv_witnesses_21_0= ruleWitness ) ) ( (lv_witnesses_22_0= ruleWitness ) )* )? (otherlv_23= 'then' ( (lv_actions_24_0= ruleAction ) ) ( (lv_actions_25_0= ruleAction ) )* )? otherlv_26= 'end' )
            {
            // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:652:1: ( () otherlv_1= 'event' ( (lv_name_2_0= ruleEString ) ) ( (lv_extended_3_0= 'extended' ) )? ( (lv_convergence_4_0= ruleConvergence ) )? (otherlv_5= '//' ( (lv_comment_6_0= ruleEString ) ) )? (otherlv_7= 'refines' ( ( ruleEString ) ) (otherlv_9= ',' ( ( ruleEString ) ) )* )? (otherlv_11= 'when' ( (lv_guards_12_0= ruleGuard ) ) ( (lv_guards_13_0= ruleGuard ) )* )? (otherlv_14= 'any' ( (lv_parameters_15_0= ruleParameter ) ) ( (lv_parameters_16_0= ruleParameter ) )* otherlv_17= 'where' ( (lv_guards_18_0= ruleGuard ) ) ( (lv_guards_19_0= ruleGuard ) )* )? (otherlv_20= 'witnesses' ( (lv_witnesses_21_0= ruleWitness ) ) ( (lv_witnesses_22_0= ruleWitness ) )* )? (otherlv_23= 'then' ( (lv_actions_24_0= ruleAction ) ) ( (lv_actions_25_0= ruleAction ) )* )? otherlv_26= 'end' )
            // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:652:2: () otherlv_1= 'event' ( (lv_name_2_0= ruleEString ) ) ( (lv_extended_3_0= 'extended' ) )? ( (lv_convergence_4_0= ruleConvergence ) )? (otherlv_5= '//' ( (lv_comment_6_0= ruleEString ) ) )? (otherlv_7= 'refines' ( ( ruleEString ) ) (otherlv_9= ',' ( ( ruleEString ) ) )* )? (otherlv_11= 'when' ( (lv_guards_12_0= ruleGuard ) ) ( (lv_guards_13_0= ruleGuard ) )* )? (otherlv_14= 'any' ( (lv_parameters_15_0= ruleParameter ) ) ( (lv_parameters_16_0= ruleParameter ) )* otherlv_17= 'where' ( (lv_guards_18_0= ruleGuard ) ) ( (lv_guards_19_0= ruleGuard ) )* )? (otherlv_20= 'witnesses' ( (lv_witnesses_21_0= ruleWitness ) ) ( (lv_witnesses_22_0= ruleWitness ) )* )? (otherlv_23= 'then' ( (lv_actions_24_0= ruleAction ) ) ( (lv_actions_25_0= ruleAction ) )* )? otherlv_26= 'end'
            {
            // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:652:2: ()
            // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:653:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getEventAccess().getEventAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,27,FollowSets000.FOLLOW_27_in_ruleevent1284); 

                	newLeafNode(otherlv_1, grammarAccess.getEventAccess().getEventKeyword_1());
                
            // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:662:1: ( (lv_name_2_0= ruleEString ) )
            // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:663:1: (lv_name_2_0= ruleEString )
            {
            // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:663:1: (lv_name_2_0= ruleEString )
            // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:664:3: lv_name_2_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getEventAccess().getNameEStringParserRuleCall_2_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleevent1305);
            lv_name_2_0=ruleEString();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getEventRule());
            	        }
                   		set(
                   			current, 
                   			"name",
                    		lv_name_2_0, 
                    		"EString");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:680:2: ( (lv_extended_3_0= 'extended' ) )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==28) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:681:1: (lv_extended_3_0= 'extended' )
                    {
                    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:681:1: (lv_extended_3_0= 'extended' )
                    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:682:3: lv_extended_3_0= 'extended'
                    {
                    lv_extended_3_0=(Token)match(input,28,FollowSets000.FOLLOW_28_in_ruleevent1323); 

                            newLeafNode(lv_extended_3_0, grammarAccess.getEventAccess().getExtendedExtendedKeyword_3_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getEventRule());
                    	        }
                           		setWithLastConsumed(current, "extended", true, "extended");
                    	    

                    }


                    }
                    break;

            }

            // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:695:3: ( (lv_convergence_4_0= ruleConvergence ) )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( ((LA20_0>=37 && LA20_0<=39)) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:696:1: (lv_convergence_4_0= ruleConvergence )
                    {
                    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:696:1: (lv_convergence_4_0= ruleConvergence )
                    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:697:3: lv_convergence_4_0= ruleConvergence
                    {
                     
                    	        newCompositeNode(grammarAccess.getEventAccess().getConvergenceConvergenceEnumRuleCall_4_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleConvergence_in_ruleevent1358);
                    lv_convergence_4_0=ruleConvergence();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getEventRule());
                    	        }
                           		set(
                           			current, 
                           			"convergence",
                            		lv_convergence_4_0, 
                            		"Convergence");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }
                    break;

            }

            // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:713:3: (otherlv_5= '//' ( (lv_comment_6_0= ruleEString ) ) )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==12) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:713:5: otherlv_5= '//' ( (lv_comment_6_0= ruleEString ) )
                    {
                    otherlv_5=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleevent1372); 

                        	newLeafNode(otherlv_5, grammarAccess.getEventAccess().getSolidusSolidusKeyword_5_0());
                        
                    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:717:1: ( (lv_comment_6_0= ruleEString ) )
                    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:718:1: (lv_comment_6_0= ruleEString )
                    {
                    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:718:1: (lv_comment_6_0= ruleEString )
                    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:719:3: lv_comment_6_0= ruleEString
                    {
                     
                    	        newCompositeNode(grammarAccess.getEventAccess().getCommentEStringParserRuleCall_5_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleevent1393);
                    lv_comment_6_0=ruleEString();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getEventRule());
                    	        }
                           		set(
                           			current, 
                           			"comment",
                            		lv_comment_6_0, 
                            		"EString");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:735:4: (otherlv_7= 'refines' ( ( ruleEString ) ) (otherlv_9= ',' ( ( ruleEString ) ) )* )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==13) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:735:6: otherlv_7= 'refines' ( ( ruleEString ) ) (otherlv_9= ',' ( ( ruleEString ) ) )*
                    {
                    otherlv_7=(Token)match(input,13,FollowSets000.FOLLOW_13_in_ruleevent1408); 

                        	newLeafNode(otherlv_7, grammarAccess.getEventAccess().getRefinesKeyword_6_0());
                        
                    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:739:1: ( ( ruleEString ) )
                    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:740:1: ( ruleEString )
                    {
                    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:740:1: ( ruleEString )
                    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:741:3: ruleEString
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getEventRule());
                    	        }
                            
                     
                    	        newCompositeNode(grammarAccess.getEventAccess().getRefinesEventCrossReference_6_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleevent1431);
                    ruleEString();

                    state._fsp--;

                     
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:754:2: (otherlv_9= ',' ( ( ruleEString ) ) )*
                    loop22:
                    do {
                        int alt22=2;
                        int LA22_0 = input.LA(1);

                        if ( (LA22_0==14) ) {
                            alt22=1;
                        }


                        switch (alt22) {
                    	case 1 :
                    	    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:754:4: otherlv_9= ',' ( ( ruleEString ) )
                    	    {
                    	    otherlv_9=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleevent1444); 

                    	        	newLeafNode(otherlv_9, grammarAccess.getEventAccess().getCommaKeyword_6_2_0());
                    	        
                    	    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:758:1: ( ( ruleEString ) )
                    	    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:759:1: ( ruleEString )
                    	    {
                    	    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:759:1: ( ruleEString )
                    	    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:760:3: ruleEString
                    	    {

                    	    			if (current==null) {
                    	    	            current = createModelElement(grammarAccess.getEventRule());
                    	    	        }
                    	            
                    	     
                    	    	        newCompositeNode(grammarAccess.getEventAccess().getRefinesEventCrossReference_6_2_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleevent1467);
                    	    ruleEString();

                    	    state._fsp--;

                    	     
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop22;
                        }
                    } while (true);


                    }
                    break;

            }

            // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:773:6: (otherlv_11= 'when' ( (lv_guards_12_0= ruleGuard ) ) ( (lv_guards_13_0= ruleGuard ) )* )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==29) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:773:8: otherlv_11= 'when' ( (lv_guards_12_0= ruleGuard ) ) ( (lv_guards_13_0= ruleGuard ) )*
                    {
                    otherlv_11=(Token)match(input,29,FollowSets000.FOLLOW_29_in_ruleevent1484); 

                        	newLeafNode(otherlv_11, grammarAccess.getEventAccess().getWhenKeyword_7_0());
                        
                    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:777:1: ( (lv_guards_12_0= ruleGuard ) )
                    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:778:1: (lv_guards_12_0= ruleGuard )
                    {
                    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:778:1: (lv_guards_12_0= ruleGuard )
                    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:779:3: lv_guards_12_0= ruleGuard
                    {
                     
                    	        newCompositeNode(grammarAccess.getEventAccess().getGuardsGuardParserRuleCall_7_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleGuard_in_ruleevent1505);
                    lv_guards_12_0=ruleGuard();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getEventRule());
                    	        }
                           		add(
                           			current, 
                           			"guards",
                            		lv_guards_12_0, 
                            		"Guard");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:795:2: ( (lv_guards_13_0= ruleGuard ) )*
                    loop24:
                    do {
                        int alt24=2;
                        int LA24_0 = input.LA(1);

                        if ( (LA24_0==23) ) {
                            alt24=1;
                        }


                        switch (alt24) {
                    	case 1 :
                    	    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:796:1: (lv_guards_13_0= ruleGuard )
                    	    {
                    	    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:796:1: (lv_guards_13_0= ruleGuard )
                    	    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:797:3: lv_guards_13_0= ruleGuard
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getEventAccess().getGuardsGuardParserRuleCall_7_2_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleGuard_in_ruleevent1526);
                    	    lv_guards_13_0=ruleGuard();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getEventRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"guards",
                    	            		lv_guards_13_0, 
                    	            		"Guard");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop24;
                        }
                    } while (true);


                    }
                    break;

            }

            // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:813:5: (otherlv_14= 'any' ( (lv_parameters_15_0= ruleParameter ) ) ( (lv_parameters_16_0= ruleParameter ) )* otherlv_17= 'where' ( (lv_guards_18_0= ruleGuard ) ) ( (lv_guards_19_0= ruleGuard ) )* )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==30) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:813:7: otherlv_14= 'any' ( (lv_parameters_15_0= ruleParameter ) ) ( (lv_parameters_16_0= ruleParameter ) )* otherlv_17= 'where' ( (lv_guards_18_0= ruleGuard ) ) ( (lv_guards_19_0= ruleGuard ) )*
                    {
                    otherlv_14=(Token)match(input,30,FollowSets000.FOLLOW_30_in_ruleevent1542); 

                        	newLeafNode(otherlv_14, grammarAccess.getEventAccess().getAnyKeyword_8_0());
                        
                    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:817:1: ( (lv_parameters_15_0= ruleParameter ) )
                    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:818:1: (lv_parameters_15_0= ruleParameter )
                    {
                    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:818:1: (lv_parameters_15_0= ruleParameter )
                    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:819:3: lv_parameters_15_0= ruleParameter
                    {
                     
                    	        newCompositeNode(grammarAccess.getEventAccess().getParametersParameterParserRuleCall_8_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleParameter_in_ruleevent1563);
                    lv_parameters_15_0=ruleParameter();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getEventRule());
                    	        }
                           		add(
                           			current, 
                           			"parameters",
                            		lv_parameters_15_0, 
                            		"Parameter");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:835:2: ( (lv_parameters_16_0= ruleParameter ) )*
                    loop26:
                    do {
                        int alt26=2;
                        int LA26_0 = input.LA(1);

                        if ( ((LA26_0>=RULE_STRING && LA26_0<=RULE_ID)) ) {
                            alt26=1;
                        }


                        switch (alt26) {
                    	case 1 :
                    	    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:836:1: (lv_parameters_16_0= ruleParameter )
                    	    {
                    	    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:836:1: (lv_parameters_16_0= ruleParameter )
                    	    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:837:3: lv_parameters_16_0= ruleParameter
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getEventAccess().getParametersParameterParserRuleCall_8_2_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleParameter_in_ruleevent1584);
                    	    lv_parameters_16_0=ruleParameter();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getEventRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"parameters",
                    	            		lv_parameters_16_0, 
                    	            		"Parameter");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop26;
                        }
                    } while (true);

                    otherlv_17=(Token)match(input,31,FollowSets000.FOLLOW_31_in_ruleevent1597); 

                        	newLeafNode(otherlv_17, grammarAccess.getEventAccess().getWhereKeyword_8_3());
                        
                    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:857:1: ( (lv_guards_18_0= ruleGuard ) )
                    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:858:1: (lv_guards_18_0= ruleGuard )
                    {
                    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:858:1: (lv_guards_18_0= ruleGuard )
                    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:859:3: lv_guards_18_0= ruleGuard
                    {
                     
                    	        newCompositeNode(grammarAccess.getEventAccess().getGuardsGuardParserRuleCall_8_4_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleGuard_in_ruleevent1618);
                    lv_guards_18_0=ruleGuard();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getEventRule());
                    	        }
                           		add(
                           			current, 
                           			"guards",
                            		lv_guards_18_0, 
                            		"Guard");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:875:2: ( (lv_guards_19_0= ruleGuard ) )*
                    loop27:
                    do {
                        int alt27=2;
                        int LA27_0 = input.LA(1);

                        if ( (LA27_0==23) ) {
                            alt27=1;
                        }


                        switch (alt27) {
                    	case 1 :
                    	    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:876:1: (lv_guards_19_0= ruleGuard )
                    	    {
                    	    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:876:1: (lv_guards_19_0= ruleGuard )
                    	    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:877:3: lv_guards_19_0= ruleGuard
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getEventAccess().getGuardsGuardParserRuleCall_8_5_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleGuard_in_ruleevent1639);
                    	    lv_guards_19_0=ruleGuard();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getEventRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"guards",
                    	            		lv_guards_19_0, 
                    	            		"Guard");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop27;
                        }
                    } while (true);


                    }
                    break;

            }

            // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:893:5: (otherlv_20= 'witnesses' ( (lv_witnesses_21_0= ruleWitness ) ) ( (lv_witnesses_22_0= ruleWitness ) )* )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==32) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:893:7: otherlv_20= 'witnesses' ( (lv_witnesses_21_0= ruleWitness ) ) ( (lv_witnesses_22_0= ruleWitness ) )*
                    {
                    otherlv_20=(Token)match(input,32,FollowSets000.FOLLOW_32_in_ruleevent1655); 

                        	newLeafNode(otherlv_20, grammarAccess.getEventAccess().getWitnessesKeyword_9_0());
                        
                    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:897:1: ( (lv_witnesses_21_0= ruleWitness ) )
                    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:898:1: (lv_witnesses_21_0= ruleWitness )
                    {
                    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:898:1: (lv_witnesses_21_0= ruleWitness )
                    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:899:3: lv_witnesses_21_0= ruleWitness
                    {
                     
                    	        newCompositeNode(grammarAccess.getEventAccess().getWitnessesWitnessParserRuleCall_9_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleWitness_in_ruleevent1676);
                    lv_witnesses_21_0=ruleWitness();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getEventRule());
                    	        }
                           		add(
                           			current, 
                           			"witnesses",
                            		lv_witnesses_21_0, 
                            		"Witness");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:915:2: ( (lv_witnesses_22_0= ruleWitness ) )*
                    loop29:
                    do {
                        int alt29=2;
                        int LA29_0 = input.LA(1);

                        if ( ((LA29_0>=34 && LA29_0<=35)) ) {
                            alt29=1;
                        }


                        switch (alt29) {
                    	case 1 :
                    	    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:916:1: (lv_witnesses_22_0= ruleWitness )
                    	    {
                    	    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:916:1: (lv_witnesses_22_0= ruleWitness )
                    	    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:917:3: lv_witnesses_22_0= ruleWitness
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getEventAccess().getWitnessesWitnessParserRuleCall_9_2_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleWitness_in_ruleevent1697);
                    	    lv_witnesses_22_0=ruleWitness();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getEventRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"witnesses",
                    	            		lv_witnesses_22_0, 
                    	            		"Witness");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop29;
                        }
                    } while (true);


                    }
                    break;

            }

            // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:933:5: (otherlv_23= 'then' ( (lv_actions_24_0= ruleAction ) ) ( (lv_actions_25_0= ruleAction ) )* )?
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==33) ) {
                alt32=1;
            }
            switch (alt32) {
                case 1 :
                    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:933:7: otherlv_23= 'then' ( (lv_actions_24_0= ruleAction ) ) ( (lv_actions_25_0= ruleAction ) )*
                    {
                    otherlv_23=(Token)match(input,33,FollowSets000.FOLLOW_33_in_ruleevent1713); 

                        	newLeafNode(otherlv_23, grammarAccess.getEventAccess().getThenKeyword_10_0());
                        
                    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:937:1: ( (lv_actions_24_0= ruleAction ) )
                    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:938:1: (lv_actions_24_0= ruleAction )
                    {
                    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:938:1: (lv_actions_24_0= ruleAction )
                    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:939:3: lv_actions_24_0= ruleAction
                    {
                     
                    	        newCompositeNode(grammarAccess.getEventAccess().getActionsActionParserRuleCall_10_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleAction_in_ruleevent1734);
                    lv_actions_24_0=ruleAction();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getEventRule());
                    	        }
                           		add(
                           			current, 
                           			"actions",
                            		lv_actions_24_0, 
                            		"Action");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:955:2: ( (lv_actions_25_0= ruleAction ) )*
                    loop31:
                    do {
                        int alt31=2;
                        int LA31_0 = input.LA(1);

                        if ( (LA31_0==23) ) {
                            alt31=1;
                        }


                        switch (alt31) {
                    	case 1 :
                    	    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:956:1: (lv_actions_25_0= ruleAction )
                    	    {
                    	    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:956:1: (lv_actions_25_0= ruleAction )
                    	    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:957:3: lv_actions_25_0= ruleAction
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getEventAccess().getActionsActionParserRuleCall_10_2_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleAction_in_ruleevent1755);
                    	    lv_actions_25_0=ruleAction();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getEventRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"actions",
                    	            		lv_actions_25_0, 
                    	            		"Action");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop31;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_26=(Token)match(input,22,FollowSets000.FOLLOW_22_in_ruleevent1770); 

                	newLeafNode(otherlv_26, grammarAccess.getEventAccess().getEndKeyword_11());
                

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
    // $ANTLR end "ruleevent"


    // $ANTLR start "entryRuleParameter"
    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:987:1: entryRuleParameter returns [EObject current=null] : iv_ruleParameter= ruleParameter EOF ;
    public final EObject entryRuleParameter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParameter = null;


        try {
            // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:988:2: (iv_ruleParameter= ruleParameter EOF )
            // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:989:2: iv_ruleParameter= ruleParameter EOF
            {
             newCompositeNode(grammarAccess.getParameterRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleParameter_in_entryRuleParameter1808);
            iv_ruleParameter=ruleParameter();

            state._fsp--;

             current =iv_ruleParameter; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleParameter1818); 

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
    // $ANTLR end "entryRuleParameter"


    // $ANTLR start "ruleParameter"
    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:996:1: ruleParameter returns [EObject current=null] : ( () ( (lv_name_1_0= ruleEString ) ) (otherlv_2= '//' ( (lv_comment_3_0= ruleEString ) ) )? ) ;
    public final EObject ruleParameter() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        AntlrDatatypeRuleToken lv_comment_3_0 = null;


         enterRule(); 
            
        try {
            // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:999:28: ( ( () ( (lv_name_1_0= ruleEString ) ) (otherlv_2= '//' ( (lv_comment_3_0= ruleEString ) ) )? ) )
            // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:1000:1: ( () ( (lv_name_1_0= ruleEString ) ) (otherlv_2= '//' ( (lv_comment_3_0= ruleEString ) ) )? )
            {
            // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:1000:1: ( () ( (lv_name_1_0= ruleEString ) ) (otherlv_2= '//' ( (lv_comment_3_0= ruleEString ) ) )? )
            // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:1000:2: () ( (lv_name_1_0= ruleEString ) ) (otherlv_2= '//' ( (lv_comment_3_0= ruleEString ) ) )?
            {
            // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:1000:2: ()
            // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:1001:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getParameterAccess().getParameterAction_0(),
                        current);
                

            }

            // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:1006:2: ( (lv_name_1_0= ruleEString ) )
            // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:1007:1: (lv_name_1_0= ruleEString )
            {
            // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:1007:1: (lv_name_1_0= ruleEString )
            // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:1008:3: lv_name_1_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getParameterAccess().getNameEStringParserRuleCall_1_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleParameter1873);
            lv_name_1_0=ruleEString();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getParameterRule());
            	        }
                   		set(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"EString");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:1024:2: (otherlv_2= '//' ( (lv_comment_3_0= ruleEString ) ) )?
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==12) ) {
                alt33=1;
            }
            switch (alt33) {
                case 1 :
                    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:1024:4: otherlv_2= '//' ( (lv_comment_3_0= ruleEString ) )
                    {
                    otherlv_2=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleParameter1886); 

                        	newLeafNode(otherlv_2, grammarAccess.getParameterAccess().getSolidusSolidusKeyword_2_0());
                        
                    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:1028:1: ( (lv_comment_3_0= ruleEString ) )
                    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:1029:1: (lv_comment_3_0= ruleEString )
                    {
                    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:1029:1: (lv_comment_3_0= ruleEString )
                    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:1030:3: lv_comment_3_0= ruleEString
                    {
                     
                    	        newCompositeNode(grammarAccess.getParameterAccess().getCommentEStringParserRuleCall_2_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleParameter1907);
                    lv_comment_3_0=ruleEString();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getParameterRule());
                    	        }
                           		set(
                           			current, 
                           			"comment",
                            		lv_comment_3_0, 
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
    // $ANTLR end "ruleParameter"


    // $ANTLR start "entryRuleGuard"
    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:1054:1: entryRuleGuard returns [EObject current=null] : iv_ruleGuard= ruleGuard EOF ;
    public final EObject entryRuleGuard() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGuard = null;


        try {
            // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:1055:2: (iv_ruleGuard= ruleGuard EOF )
            // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:1056:2: iv_ruleGuard= ruleGuard EOF
            {
             newCompositeNode(grammarAccess.getGuardRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleGuard_in_entryRuleGuard1945);
            iv_ruleGuard=ruleGuard();

            state._fsp--;

             current =iv_ruleGuard; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleGuard1955); 

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
    // $ANTLR end "entryRuleGuard"


    // $ANTLR start "ruleGuard"
    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:1063:1: ruleGuard returns [EObject current=null] : (otherlv_0= '@' ( (lv_name_1_0= ruleEString ) ) ( (lv_theorem_2_0= 'theorem' ) )? ( (lv_predicate_3_0= ruleEString ) ) (otherlv_4= '//' ( (lv_comment_5_0= ruleEString ) ) )? ) ;
    public final EObject ruleGuard() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_theorem_2_0=null;
        Token otherlv_4=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        AntlrDatatypeRuleToken lv_predicate_3_0 = null;

        AntlrDatatypeRuleToken lv_comment_5_0 = null;


         enterRule(); 
            
        try {
            // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:1066:28: ( (otherlv_0= '@' ( (lv_name_1_0= ruleEString ) ) ( (lv_theorem_2_0= 'theorem' ) )? ( (lv_predicate_3_0= ruleEString ) ) (otherlv_4= '//' ( (lv_comment_5_0= ruleEString ) ) )? ) )
            // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:1067:1: (otherlv_0= '@' ( (lv_name_1_0= ruleEString ) ) ( (lv_theorem_2_0= 'theorem' ) )? ( (lv_predicate_3_0= ruleEString ) ) (otherlv_4= '//' ( (lv_comment_5_0= ruleEString ) ) )? )
            {
            // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:1067:1: (otherlv_0= '@' ( (lv_name_1_0= ruleEString ) ) ( (lv_theorem_2_0= 'theorem' ) )? ( (lv_predicate_3_0= ruleEString ) ) (otherlv_4= '//' ( (lv_comment_5_0= ruleEString ) ) )? )
            // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:1067:3: otherlv_0= '@' ( (lv_name_1_0= ruleEString ) ) ( (lv_theorem_2_0= 'theorem' ) )? ( (lv_predicate_3_0= ruleEString ) ) (otherlv_4= '//' ( (lv_comment_5_0= ruleEString ) ) )?
            {
            otherlv_0=(Token)match(input,23,FollowSets000.FOLLOW_23_in_ruleGuard1992); 

                	newLeafNode(otherlv_0, grammarAccess.getGuardAccess().getCommercialAtKeyword_0());
                
            // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:1071:1: ( (lv_name_1_0= ruleEString ) )
            // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:1072:1: (lv_name_1_0= ruleEString )
            {
            // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:1072:1: (lv_name_1_0= ruleEString )
            // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:1073:3: lv_name_1_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getGuardAccess().getNameEStringParserRuleCall_1_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleGuard2013);
            lv_name_1_0=ruleEString();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getGuardRule());
            	        }
                   		set(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"EString");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:1089:2: ( (lv_theorem_2_0= 'theorem' ) )?
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( (LA34_0==24) ) {
                alt34=1;
            }
            switch (alt34) {
                case 1 :
                    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:1090:1: (lv_theorem_2_0= 'theorem' )
                    {
                    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:1090:1: (lv_theorem_2_0= 'theorem' )
                    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:1091:3: lv_theorem_2_0= 'theorem'
                    {
                    lv_theorem_2_0=(Token)match(input,24,FollowSets000.FOLLOW_24_in_ruleGuard2031); 

                            newLeafNode(lv_theorem_2_0, grammarAccess.getGuardAccess().getTheoremTheoremKeyword_2_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getGuardRule());
                    	        }
                           		setWithLastConsumed(current, "theorem", true, "theorem");
                    	    

                    }


                    }
                    break;

            }

            // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:1104:3: ( (lv_predicate_3_0= ruleEString ) )
            // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:1105:1: (lv_predicate_3_0= ruleEString )
            {
            // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:1105:1: (lv_predicate_3_0= ruleEString )
            // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:1106:3: lv_predicate_3_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getGuardAccess().getPredicateEStringParserRuleCall_3_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleGuard2066);
            lv_predicate_3_0=ruleEString();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getGuardRule());
            	        }
                   		set(
                   			current, 
                   			"predicate",
                    		lv_predicate_3_0, 
                    		"EString");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:1122:2: (otherlv_4= '//' ( (lv_comment_5_0= ruleEString ) ) )?
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( (LA35_0==12) ) {
                alt35=1;
            }
            switch (alt35) {
                case 1 :
                    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:1122:4: otherlv_4= '//' ( (lv_comment_5_0= ruleEString ) )
                    {
                    otherlv_4=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleGuard2079); 

                        	newLeafNode(otherlv_4, grammarAccess.getGuardAccess().getSolidusSolidusKeyword_4_0());
                        
                    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:1126:1: ( (lv_comment_5_0= ruleEString ) )
                    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:1127:1: (lv_comment_5_0= ruleEString )
                    {
                    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:1127:1: (lv_comment_5_0= ruleEString )
                    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:1128:3: lv_comment_5_0= ruleEString
                    {
                     
                    	        newCompositeNode(grammarAccess.getGuardAccess().getCommentEStringParserRuleCall_4_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleGuard2100);
                    lv_comment_5_0=ruleEString();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getGuardRule());
                    	        }
                           		set(
                           			current, 
                           			"comment",
                            		lv_comment_5_0, 
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
    // $ANTLR end "ruleGuard"


    // $ANTLR start "entryRuleWitness"
    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:1152:1: entryRuleWitness returns [EObject current=null] : iv_ruleWitness= ruleWitness EOF ;
    public final EObject entryRuleWitness() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleWitness = null;


        try {
            // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:1153:2: (iv_ruleWitness= ruleWitness EOF )
            // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:1154:2: iv_ruleWitness= ruleWitness EOF
            {
             newCompositeNode(grammarAccess.getWitnessRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleWitness_in_entryRuleWitness2138);
            iv_ruleWitness=ruleWitness();

            state._fsp--;

             current =iv_ruleWitness; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleWitness2148); 

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
    // $ANTLR end "entryRuleWitness"


    // $ANTLR start "ruleWitness"
    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:1161:1: ruleWitness returns [EObject current=null] : ( ( (lv_localGenerated_0_0= 'localGenerated' ) )? otherlv_1= 'witness' otherlv_2= '@' ( (lv_name_3_0= ruleEString ) ) otherlv_4= 'predicate' ( (lv_predicate_5_0= ruleEString ) )? (otherlv_6= '//' ( (lv_comment_7_0= ruleEString ) ) )? ) ;
    public final EObject ruleWitness() throws RecognitionException {
        EObject current = null;

        Token lv_localGenerated_0_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        AntlrDatatypeRuleToken lv_name_3_0 = null;

        AntlrDatatypeRuleToken lv_predicate_5_0 = null;

        AntlrDatatypeRuleToken lv_comment_7_0 = null;


         enterRule(); 
            
        try {
            // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:1164:28: ( ( ( (lv_localGenerated_0_0= 'localGenerated' ) )? otherlv_1= 'witness' otherlv_2= '@' ( (lv_name_3_0= ruleEString ) ) otherlv_4= 'predicate' ( (lv_predicate_5_0= ruleEString ) )? (otherlv_6= '//' ( (lv_comment_7_0= ruleEString ) ) )? ) )
            // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:1165:1: ( ( (lv_localGenerated_0_0= 'localGenerated' ) )? otherlv_1= 'witness' otherlv_2= '@' ( (lv_name_3_0= ruleEString ) ) otherlv_4= 'predicate' ( (lv_predicate_5_0= ruleEString ) )? (otherlv_6= '//' ( (lv_comment_7_0= ruleEString ) ) )? )
            {
            // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:1165:1: ( ( (lv_localGenerated_0_0= 'localGenerated' ) )? otherlv_1= 'witness' otherlv_2= '@' ( (lv_name_3_0= ruleEString ) ) otherlv_4= 'predicate' ( (lv_predicate_5_0= ruleEString ) )? (otherlv_6= '//' ( (lv_comment_7_0= ruleEString ) ) )? )
            // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:1165:2: ( (lv_localGenerated_0_0= 'localGenerated' ) )? otherlv_1= 'witness' otherlv_2= '@' ( (lv_name_3_0= ruleEString ) ) otherlv_4= 'predicate' ( (lv_predicate_5_0= ruleEString ) )? (otherlv_6= '//' ( (lv_comment_7_0= ruleEString ) ) )?
            {
            // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:1165:2: ( (lv_localGenerated_0_0= 'localGenerated' ) )?
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( (LA36_0==34) ) {
                alt36=1;
            }
            switch (alt36) {
                case 1 :
                    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:1166:1: (lv_localGenerated_0_0= 'localGenerated' )
                    {
                    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:1166:1: (lv_localGenerated_0_0= 'localGenerated' )
                    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:1167:3: lv_localGenerated_0_0= 'localGenerated'
                    {
                    lv_localGenerated_0_0=(Token)match(input,34,FollowSets000.FOLLOW_34_in_ruleWitness2191); 

                            newLeafNode(lv_localGenerated_0_0, grammarAccess.getWitnessAccess().getLocalGeneratedLocalGeneratedKeyword_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getWitnessRule());
                    	        }
                           		setWithLastConsumed(current, "localGenerated", true, "localGenerated");
                    	    

                    }


                    }
                    break;

            }

            otherlv_1=(Token)match(input,35,FollowSets000.FOLLOW_35_in_ruleWitness2217); 

                	newLeafNode(otherlv_1, grammarAccess.getWitnessAccess().getWitnessKeyword_1());
                
            otherlv_2=(Token)match(input,23,FollowSets000.FOLLOW_23_in_ruleWitness2229); 

                	newLeafNode(otherlv_2, grammarAccess.getWitnessAccess().getCommercialAtKeyword_2());
                
            // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:1188:1: ( (lv_name_3_0= ruleEString ) )
            // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:1189:1: (lv_name_3_0= ruleEString )
            {
            // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:1189:1: (lv_name_3_0= ruleEString )
            // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:1190:3: lv_name_3_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getWitnessAccess().getNameEStringParserRuleCall_3_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleWitness2250);
            lv_name_3_0=ruleEString();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getWitnessRule());
            	        }
                   		set(
                   			current, 
                   			"name",
                    		lv_name_3_0, 
                    		"EString");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_4=(Token)match(input,36,FollowSets000.FOLLOW_36_in_ruleWitness2262); 

                	newLeafNode(otherlv_4, grammarAccess.getWitnessAccess().getPredicateKeyword_4());
                
            // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:1210:1: ( (lv_predicate_5_0= ruleEString ) )?
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( ((LA37_0>=RULE_STRING && LA37_0<=RULE_ID)) ) {
                alt37=1;
            }
            switch (alt37) {
                case 1 :
                    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:1211:1: (lv_predicate_5_0= ruleEString )
                    {
                    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:1211:1: (lv_predicate_5_0= ruleEString )
                    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:1212:3: lv_predicate_5_0= ruleEString
                    {
                     
                    	        newCompositeNode(grammarAccess.getWitnessAccess().getPredicateEStringParserRuleCall_5_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleWitness2283);
                    lv_predicate_5_0=ruleEString();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getWitnessRule());
                    	        }
                           		set(
                           			current, 
                           			"predicate",
                            		lv_predicate_5_0, 
                            		"EString");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }
                    break;

            }

            // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:1228:3: (otherlv_6= '//' ( (lv_comment_7_0= ruleEString ) ) )?
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( (LA38_0==12) ) {
                alt38=1;
            }
            switch (alt38) {
                case 1 :
                    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:1228:5: otherlv_6= '//' ( (lv_comment_7_0= ruleEString ) )
                    {
                    otherlv_6=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleWitness2297); 

                        	newLeafNode(otherlv_6, grammarAccess.getWitnessAccess().getSolidusSolidusKeyword_6_0());
                        
                    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:1232:1: ( (lv_comment_7_0= ruleEString ) )
                    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:1233:1: (lv_comment_7_0= ruleEString )
                    {
                    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:1233:1: (lv_comment_7_0= ruleEString )
                    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:1234:3: lv_comment_7_0= ruleEString
                    {
                     
                    	        newCompositeNode(grammarAccess.getWitnessAccess().getCommentEStringParserRuleCall_6_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleWitness2318);
                    lv_comment_7_0=ruleEString();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getWitnessRule());
                    	        }
                           		set(
                           			current, 
                           			"comment",
                            		lv_comment_7_0, 
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
    // $ANTLR end "ruleWitness"


    // $ANTLR start "entryRuleAction"
    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:1258:1: entryRuleAction returns [EObject current=null] : iv_ruleAction= ruleAction EOF ;
    public final EObject entryRuleAction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAction = null;


        try {
            // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:1259:2: (iv_ruleAction= ruleAction EOF )
            // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:1260:2: iv_ruleAction= ruleAction EOF
            {
             newCompositeNode(grammarAccess.getActionRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleAction_in_entryRuleAction2356);
            iv_ruleAction=ruleAction();

            state._fsp--;

             current =iv_ruleAction; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleAction2366); 

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
    // $ANTLR end "entryRuleAction"


    // $ANTLR start "ruleAction"
    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:1267:1: ruleAction returns [EObject current=null] : (otherlv_0= '@' ( (lv_name_1_0= ruleEString ) ) ( (lv_action_2_0= ruleEString ) )? (otherlv_3= '//' ( (lv_comment_4_0= ruleEString ) ) )? ) ;
    public final EObject ruleAction() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_3=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        AntlrDatatypeRuleToken lv_action_2_0 = null;

        AntlrDatatypeRuleToken lv_comment_4_0 = null;


         enterRule(); 
            
        try {
            // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:1270:28: ( (otherlv_0= '@' ( (lv_name_1_0= ruleEString ) ) ( (lv_action_2_0= ruleEString ) )? (otherlv_3= '//' ( (lv_comment_4_0= ruleEString ) ) )? ) )
            // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:1271:1: (otherlv_0= '@' ( (lv_name_1_0= ruleEString ) ) ( (lv_action_2_0= ruleEString ) )? (otherlv_3= '//' ( (lv_comment_4_0= ruleEString ) ) )? )
            {
            // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:1271:1: (otherlv_0= '@' ( (lv_name_1_0= ruleEString ) ) ( (lv_action_2_0= ruleEString ) )? (otherlv_3= '//' ( (lv_comment_4_0= ruleEString ) ) )? )
            // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:1271:3: otherlv_0= '@' ( (lv_name_1_0= ruleEString ) ) ( (lv_action_2_0= ruleEString ) )? (otherlv_3= '//' ( (lv_comment_4_0= ruleEString ) ) )?
            {
            otherlv_0=(Token)match(input,23,FollowSets000.FOLLOW_23_in_ruleAction2403); 

                	newLeafNode(otherlv_0, grammarAccess.getActionAccess().getCommercialAtKeyword_0());
                
            // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:1275:1: ( (lv_name_1_0= ruleEString ) )
            // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:1276:1: (lv_name_1_0= ruleEString )
            {
            // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:1276:1: (lv_name_1_0= ruleEString )
            // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:1277:3: lv_name_1_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getActionAccess().getNameEStringParserRuleCall_1_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleAction2424);
            lv_name_1_0=ruleEString();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getActionRule());
            	        }
                   		set(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"EString");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:1293:2: ( (lv_action_2_0= ruleEString ) )?
            int alt39=2;
            int LA39_0 = input.LA(1);

            if ( ((LA39_0>=RULE_STRING && LA39_0<=RULE_ID)) ) {
                alt39=1;
            }
            switch (alt39) {
                case 1 :
                    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:1294:1: (lv_action_2_0= ruleEString )
                    {
                    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:1294:1: (lv_action_2_0= ruleEString )
                    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:1295:3: lv_action_2_0= ruleEString
                    {
                     
                    	        newCompositeNode(grammarAccess.getActionAccess().getActionEStringParserRuleCall_2_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleAction2445);
                    lv_action_2_0=ruleEString();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getActionRule());
                    	        }
                           		set(
                           			current, 
                           			"action",
                            		lv_action_2_0, 
                            		"EString");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }
                    break;

            }

            // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:1311:3: (otherlv_3= '//' ( (lv_comment_4_0= ruleEString ) ) )?
            int alt40=2;
            int LA40_0 = input.LA(1);

            if ( (LA40_0==12) ) {
                alt40=1;
            }
            switch (alt40) {
                case 1 :
                    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:1311:5: otherlv_3= '//' ( (lv_comment_4_0= ruleEString ) )
                    {
                    otherlv_3=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleAction2459); 

                        	newLeafNode(otherlv_3, grammarAccess.getActionAccess().getSolidusSolidusKeyword_3_0());
                        
                    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:1315:1: ( (lv_comment_4_0= ruleEString ) )
                    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:1316:1: (lv_comment_4_0= ruleEString )
                    {
                    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:1316:1: (lv_comment_4_0= ruleEString )
                    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:1317:3: lv_comment_4_0= ruleEString
                    {
                     
                    	        newCompositeNode(grammarAccess.getActionAccess().getCommentEStringParserRuleCall_3_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleAction2480);
                    lv_comment_4_0=ruleEString();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getActionRule());
                    	        }
                           		set(
                           			current, 
                           			"comment",
                            		lv_comment_4_0, 
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
    // $ANTLR end "ruleAction"


    // $ANTLR start "ruleConvergence"
    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:1341:1: ruleConvergence returns [Enumerator current=null] : ( (enumLiteral_0= 'ordinary' ) | (enumLiteral_1= 'convergent' ) | (enumLiteral_2= 'anticipated' ) ) ;
    public final Enumerator ruleConvergence() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;

         enterRule(); 
        try {
            // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:1343:28: ( ( (enumLiteral_0= 'ordinary' ) | (enumLiteral_1= 'convergent' ) | (enumLiteral_2= 'anticipated' ) ) )
            // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:1344:1: ( (enumLiteral_0= 'ordinary' ) | (enumLiteral_1= 'convergent' ) | (enumLiteral_2= 'anticipated' ) )
            {
            // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:1344:1: ( (enumLiteral_0= 'ordinary' ) | (enumLiteral_1= 'convergent' ) | (enumLiteral_2= 'anticipated' ) )
            int alt41=3;
            switch ( input.LA(1) ) {
            case 37:
                {
                alt41=1;
                }
                break;
            case 38:
                {
                alt41=2;
                }
                break;
            case 39:
                {
                alt41=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 41, 0, input);

                throw nvae;
            }

            switch (alt41) {
                case 1 :
                    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:1344:2: (enumLiteral_0= 'ordinary' )
                    {
                    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:1344:2: (enumLiteral_0= 'ordinary' )
                    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:1344:4: enumLiteral_0= 'ordinary'
                    {
                    enumLiteral_0=(Token)match(input,37,FollowSets000.FOLLOW_37_in_ruleConvergence2532); 

                            current = grammarAccess.getConvergenceAccess().getOrdinaryEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_0, grammarAccess.getConvergenceAccess().getOrdinaryEnumLiteralDeclaration_0()); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:1350:6: (enumLiteral_1= 'convergent' )
                    {
                    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:1350:6: (enumLiteral_1= 'convergent' )
                    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:1350:8: enumLiteral_1= 'convergent'
                    {
                    enumLiteral_1=(Token)match(input,38,FollowSets000.FOLLOW_38_in_ruleConvergence2549); 

                            current = grammarAccess.getConvergenceAccess().getConvergentEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_1, grammarAccess.getConvergenceAccess().getConvergentEnumLiteralDeclaration_1()); 
                        

                    }


                    }
                    break;
                case 3 :
                    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:1356:6: (enumLiteral_2= 'anticipated' )
                    {
                    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:1356:6: (enumLiteral_2= 'anticipated' )
                    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:1356:8: enumLiteral_2= 'anticipated'
                    {
                    enumLiteral_2=(Token)match(input,39,FollowSets000.FOLLOW_39_in_ruleConvergence2566); 

                            current = grammarAccess.getConvergenceAccess().getAnticipatedEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_2, grammarAccess.getConvergenceAccess().getAnticipatedEnumLiteralDeclaration_2()); 
                        

                    }


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
    // $ANTLR end "ruleConvergence"

    // Delegated rules


 

    
    private static class FollowSets000 {
        public static final BitSet FOLLOW_ruleMachine_in_entryRuleMachine75 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleMachine85 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_11_in_ruleMachine131 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleMachine152 = new BitSet(new long[]{0x00000000007CB000L});
        public static final BitSet FOLLOW_12_in_ruleMachine165 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleMachine186 = new BitSet(new long[]{0x00000000007CA000L});
        public static final BitSet FOLLOW_13_in_ruleMachine201 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleMachine224 = new BitSet(new long[]{0x00000000007CC000L});
        public static final BitSet FOLLOW_14_in_ruleMachine237 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleMachine260 = new BitSet(new long[]{0x00000000007CC000L});
        public static final BitSet FOLLOW_15_in_ruleMachine277 = new BitSet(new long[]{0x0000000000010000L});
        public static final BitSet FOLLOW_16_in_ruleMachine289 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleMachine312 = new BitSet(new long[]{0x0000000000024000L});
        public static final BitSet FOLLOW_14_in_ruleMachine325 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleMachine348 = new BitSet(new long[]{0x0000000000024000L});
        public static final BitSet FOLLOW_17_in_ruleMachine362 = new BitSet(new long[]{0x00000000007C0000L});
        public static final BitSet FOLLOW_18_in_ruleMachine377 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleVariable_in_ruleMachine398 = new BitSet(new long[]{0x0000000000780030L});
        public static final BitSet FOLLOW_ruleVariable_in_ruleMachine419 = new BitSet(new long[]{0x0000000000780030L});
        public static final BitSet FOLLOW_19_in_ruleMachine435 = new BitSet(new long[]{0x0000000000800000L});
        public static final BitSet FOLLOW_ruleInvariant_in_ruleMachine456 = new BitSet(new long[]{0x0000000000F00000L});
        public static final BitSet FOLLOW_ruleInvariant_in_ruleMachine477 = new BitSet(new long[]{0x0000000000F00000L});
        public static final BitSet FOLLOW_20_in_ruleMachine493 = new BitSet(new long[]{0x0000000002000000L});
        public static final BitSet FOLLOW_ruleVariant_in_ruleMachine514 = new BitSet(new long[]{0x0000000000600000L});
        public static final BitSet FOLLOW_21_in_ruleMachine529 = new BitSet(new long[]{0x0000000008000000L});
        public static final BitSet FOLLOW_ruleevent_in_ruleMachine550 = new BitSet(new long[]{0x0000000008400000L});
        public static final BitSet FOLLOW_ruleevent_in_ruleMachine571 = new BitSet(new long[]{0x0000000008400000L});
        public static final BitSet FOLLOW_22_in_ruleMachine586 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_entryRuleEString623 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleEString634 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_STRING_in_ruleEString674 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleEString700 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleVariable_in_entryRuleVariable745 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleVariable755 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_ruleVariable810 = new BitSet(new long[]{0x0000000000001002L});
        public static final BitSet FOLLOW_12_in_ruleVariable823 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleVariable844 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleInvariant_in_entryRuleInvariant882 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleInvariant892 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_23_in_ruleInvariant929 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleInvariant950 = new BitSet(new long[]{0x0000000001001032L});
        public static final BitSet FOLLOW_24_in_ruleInvariant968 = new BitSet(new long[]{0x0000000000001032L});
        public static final BitSet FOLLOW_ruleEString_in_ruleInvariant1003 = new BitSet(new long[]{0x0000000000001002L});
        public static final BitSet FOLLOW_12_in_ruleInvariant1017 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleInvariant1038 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleVariant_in_entryRuleVariant1076 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleVariant1086 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_25_in_ruleVariant1123 = new BitSet(new long[]{0x0000000004000000L});
        public static final BitSet FOLLOW_26_in_ruleVariant1135 = new BitSet(new long[]{0x0000000000001030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleVariant1156 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleVariant1170 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleVariant1191 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleevent_in_entryRuleevent1228 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleevent1238 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_27_in_ruleevent1284 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleevent1305 = new BitSet(new long[]{0x000000E370403000L});
        public static final BitSet FOLLOW_28_in_ruleevent1323 = new BitSet(new long[]{0x000000E360403000L});
        public static final BitSet FOLLOW_ruleConvergence_in_ruleevent1358 = new BitSet(new long[]{0x0000000360403000L});
        public static final BitSet FOLLOW_12_in_ruleevent1372 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleevent1393 = new BitSet(new long[]{0x0000000360402000L});
        public static final BitSet FOLLOW_13_in_ruleevent1408 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleevent1431 = new BitSet(new long[]{0x0000000360404000L});
        public static final BitSet FOLLOW_14_in_ruleevent1444 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleevent1467 = new BitSet(new long[]{0x0000000360404000L});
        public static final BitSet FOLLOW_29_in_ruleevent1484 = new BitSet(new long[]{0x0000000000800000L});
        public static final BitSet FOLLOW_ruleGuard_in_ruleevent1505 = new BitSet(new long[]{0x0000000340C00000L});
        public static final BitSet FOLLOW_ruleGuard_in_ruleevent1526 = new BitSet(new long[]{0x0000000340C00000L});
        public static final BitSet FOLLOW_30_in_ruleevent1542 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleParameter_in_ruleevent1563 = new BitSet(new long[]{0x0000000080000030L});
        public static final BitSet FOLLOW_ruleParameter_in_ruleevent1584 = new BitSet(new long[]{0x0000000080000030L});
        public static final BitSet FOLLOW_31_in_ruleevent1597 = new BitSet(new long[]{0x0000000000800000L});
        public static final BitSet FOLLOW_ruleGuard_in_ruleevent1618 = new BitSet(new long[]{0x0000000300C00000L});
        public static final BitSet FOLLOW_ruleGuard_in_ruleevent1639 = new BitSet(new long[]{0x0000000300C00000L});
        public static final BitSet FOLLOW_32_in_ruleevent1655 = new BitSet(new long[]{0x0000000C00000000L});
        public static final BitSet FOLLOW_ruleWitness_in_ruleevent1676 = new BitSet(new long[]{0x0000000E00400000L});
        public static final BitSet FOLLOW_ruleWitness_in_ruleevent1697 = new BitSet(new long[]{0x0000000E00400000L});
        public static final BitSet FOLLOW_33_in_ruleevent1713 = new BitSet(new long[]{0x0000000000800000L});
        public static final BitSet FOLLOW_ruleAction_in_ruleevent1734 = new BitSet(new long[]{0x0000000000C00000L});
        public static final BitSet FOLLOW_ruleAction_in_ruleevent1755 = new BitSet(new long[]{0x0000000000C00000L});
        public static final BitSet FOLLOW_22_in_ruleevent1770 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleParameter_in_entryRuleParameter1808 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleParameter1818 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_ruleParameter1873 = new BitSet(new long[]{0x0000000000001002L});
        public static final BitSet FOLLOW_12_in_ruleParameter1886 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleParameter1907 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleGuard_in_entryRuleGuard1945 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleGuard1955 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_23_in_ruleGuard1992 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleGuard2013 = new BitSet(new long[]{0x0000000001000030L});
        public static final BitSet FOLLOW_24_in_ruleGuard2031 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleGuard2066 = new BitSet(new long[]{0x0000000000001002L});
        public static final BitSet FOLLOW_12_in_ruleGuard2079 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleGuard2100 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleWitness_in_entryRuleWitness2138 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleWitness2148 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_34_in_ruleWitness2191 = new BitSet(new long[]{0x0000000800000000L});
        public static final BitSet FOLLOW_35_in_ruleWitness2217 = new BitSet(new long[]{0x0000000000800000L});
        public static final BitSet FOLLOW_23_in_ruleWitness2229 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleWitness2250 = new BitSet(new long[]{0x0000001000000000L});
        public static final BitSet FOLLOW_36_in_ruleWitness2262 = new BitSet(new long[]{0x0000000000001032L});
        public static final BitSet FOLLOW_ruleEString_in_ruleWitness2283 = new BitSet(new long[]{0x0000000000001002L});
        public static final BitSet FOLLOW_12_in_ruleWitness2297 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleWitness2318 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAction_in_entryRuleAction2356 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleAction2366 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_23_in_ruleAction2403 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleAction2424 = new BitSet(new long[]{0x0000000000001032L});
        public static final BitSet FOLLOW_ruleEString_in_ruleAction2445 = new BitSet(new long[]{0x0000000000001002L});
        public static final BitSet FOLLOW_12_in_ruleAction2459 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleAction2480 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_37_in_ruleConvergence2532 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_38_in_ruleConvergence2549 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_39_in_ruleConvergence2566 = new BitSet(new long[]{0x0000000000000002L});
    }


}