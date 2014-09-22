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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'Machine'", "'//'", "'Refines'", "','", "'Sees'", "'('", "')'", "'Variables'", "'Invariants'", "'Variant'", "'Events'", "'End'", "'Annotation'", "'{'", "'source'", "'references'", "'annotations'", "'}'", "'details'", "'contents'", "'StringToAttributeMapEntry'", "'key'", "'value'", "'@'", "'theorem'", "'expression'", "'event'", "'extended'", "'refines'", "'when'", "'any'", "'where'", "'witnesses'", "'then'", "'end'", "'StringToStringMapEntry'", "'EObject'", "'localGenerated'", "'Extension'", "'internalId'", "'extensionId'", "'extensions'", "'attributes'", "'Attribute'", "'type'", "'EJavaObject'", "'Witness'", "'predicate'", "'Boolean'", "'Handle'", "'Integer'", "'Long'", "'String'", "'ordinary'", "'convergent'", "'anticipated'"
    };
    public static final int RULE_ID=5;
    public static final int T__66=66;
    public static final int T__64=64;
    public static final int T__29=29;
    public static final int T__65=65;
    public static final int T__28=28;
    public static final int T__62=62;
    public static final int T__27=27;
    public static final int T__63=63;
    public static final int T__26=26;
    public static final int T__25=25;
    public static final int T__24=24;
    public static final int T__23=23;
    public static final int T__22=22;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__21=21;
    public static final int T__20=20;
    public static final int T__61=61;
    public static final int T__60=60;
    public static final int EOF=-1;
    public static final int T__55=55;
    public static final int T__56=56;
    public static final int T__19=19;
    public static final int T__57=57;
    public static final int T__58=58;
    public static final int T__51=51;
    public static final int T__16=16;
    public static final int T__52=52;
    public static final int T__15=15;
    public static final int T__53=53;
    public static final int T__18=18;
    public static final int T__54=54;
    public static final int T__17=17;
    public static final int T__12=12;
    public static final int T__11=11;
    public static final int T__14=14;
    public static final int T__13=13;
    public static final int T__59=59;
    public static final int RULE_INT=6;
    public static final int T__50=50;
    public static final int T__42=42;
    public static final int T__43=43;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__46=46;
    public static final int T__47=47;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int T__48=48;
    public static final int T__49=49;
    public static final int RULE_SL_COMMENT=8;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int RULE_STRING=4;
    public static final int T__32=32;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
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
    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:77:1: ruleMachine returns [EObject current=null] : ( () otherlv_1= 'Machine' ( (lv_name_2_0= ruleEString ) ) (otherlv_3= '//' ( (lv_comment_4_0= ruleEString ) ) )? (otherlv_5= 'Refines' ( ( ruleEString ) ) (otherlv_7= ',' ( ( ruleEString ) ) )* )? (otherlv_9= 'Sees' otherlv_10= '(' ( ( ruleEString ) ) (otherlv_12= ',' ( ( ruleEString ) ) )* otherlv_14= ')' )? (otherlv_15= 'Variables' ( (lv_variables_16_0= ruleVariable ) ) ( (lv_variables_17_0= ruleVariable ) )* )? (otherlv_18= 'Invariants' ( (lv_invariants_19_0= ruleInvariant ) ) ( (lv_invariants_20_0= ruleInvariant ) )* )? (otherlv_21= 'Variant' ( (lv_variant_22_0= ruleVariant ) ) )? (otherlv_23= 'Events' ( (lv_events_24_0= ruleevent ) ) ( (lv_events_25_0= ruleevent ) )* )? otherlv_26= 'End' ) ;
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
            // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:80:28: ( ( () otherlv_1= 'Machine' ( (lv_name_2_0= ruleEString ) ) (otherlv_3= '//' ( (lv_comment_4_0= ruleEString ) ) )? (otherlv_5= 'Refines' ( ( ruleEString ) ) (otherlv_7= ',' ( ( ruleEString ) ) )* )? (otherlv_9= 'Sees' otherlv_10= '(' ( ( ruleEString ) ) (otherlv_12= ',' ( ( ruleEString ) ) )* otherlv_14= ')' )? (otherlv_15= 'Variables' ( (lv_variables_16_0= ruleVariable ) ) ( (lv_variables_17_0= ruleVariable ) )* )? (otherlv_18= 'Invariants' ( (lv_invariants_19_0= ruleInvariant ) ) ( (lv_invariants_20_0= ruleInvariant ) )* )? (otherlv_21= 'Variant' ( (lv_variant_22_0= ruleVariant ) ) )? (otherlv_23= 'Events' ( (lv_events_24_0= ruleevent ) ) ( (lv_events_25_0= ruleevent ) )* )? otherlv_26= 'End' ) )
            // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:81:1: ( () otherlv_1= 'Machine' ( (lv_name_2_0= ruleEString ) ) (otherlv_3= '//' ( (lv_comment_4_0= ruleEString ) ) )? (otherlv_5= 'Refines' ( ( ruleEString ) ) (otherlv_7= ',' ( ( ruleEString ) ) )* )? (otherlv_9= 'Sees' otherlv_10= '(' ( ( ruleEString ) ) (otherlv_12= ',' ( ( ruleEString ) ) )* otherlv_14= ')' )? (otherlv_15= 'Variables' ( (lv_variables_16_0= ruleVariable ) ) ( (lv_variables_17_0= ruleVariable ) )* )? (otherlv_18= 'Invariants' ( (lv_invariants_19_0= ruleInvariant ) ) ( (lv_invariants_20_0= ruleInvariant ) )* )? (otherlv_21= 'Variant' ( (lv_variant_22_0= ruleVariant ) ) )? (otherlv_23= 'Events' ( (lv_events_24_0= ruleevent ) ) ( (lv_events_25_0= ruleevent ) )* )? otherlv_26= 'End' )
            {
            // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:81:1: ( () otherlv_1= 'Machine' ( (lv_name_2_0= ruleEString ) ) (otherlv_3= '//' ( (lv_comment_4_0= ruleEString ) ) )? (otherlv_5= 'Refines' ( ( ruleEString ) ) (otherlv_7= ',' ( ( ruleEString ) ) )* )? (otherlv_9= 'Sees' otherlv_10= '(' ( ( ruleEString ) ) (otherlv_12= ',' ( ( ruleEString ) ) )* otherlv_14= ')' )? (otherlv_15= 'Variables' ( (lv_variables_16_0= ruleVariable ) ) ( (lv_variables_17_0= ruleVariable ) )* )? (otherlv_18= 'Invariants' ( (lv_invariants_19_0= ruleInvariant ) ) ( (lv_invariants_20_0= ruleInvariant ) )* )? (otherlv_21= 'Variant' ( (lv_variant_22_0= ruleVariant ) ) )? (otherlv_23= 'Events' ( (lv_events_24_0= ruleevent ) ) ( (lv_events_25_0= ruleevent ) )* )? otherlv_26= 'End' )
            // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:81:2: () otherlv_1= 'Machine' ( (lv_name_2_0= ruleEString ) ) (otherlv_3= '//' ( (lv_comment_4_0= ruleEString ) ) )? (otherlv_5= 'Refines' ( ( ruleEString ) ) (otherlv_7= ',' ( ( ruleEString ) ) )* )? (otherlv_9= 'Sees' otherlv_10= '(' ( ( ruleEString ) ) (otherlv_12= ',' ( ( ruleEString ) ) )* otherlv_14= ')' )? (otherlv_15= 'Variables' ( (lv_variables_16_0= ruleVariable ) ) ( (lv_variables_17_0= ruleVariable ) )* )? (otherlv_18= 'Invariants' ( (lv_invariants_19_0= ruleInvariant ) ) ( (lv_invariants_20_0= ruleInvariant ) )* )? (otherlv_21= 'Variant' ( (lv_variant_22_0= ruleVariant ) ) )? (otherlv_23= 'Events' ( (lv_events_24_0= ruleevent ) ) ( (lv_events_25_0= ruleevent ) )* )? otherlv_26= 'End'
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

            // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:131:4: (otherlv_5= 'Refines' ( ( ruleEString ) ) (otherlv_7= ',' ( ( ruleEString ) ) )* )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==13) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:131:6: otherlv_5= 'Refines' ( ( ruleEString ) ) (otherlv_7= ',' ( ( ruleEString ) ) )*
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

            // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:169:6: (otherlv_9= 'Sees' otherlv_10= '(' ( ( ruleEString ) ) (otherlv_12= ',' ( ( ruleEString ) ) )* otherlv_14= ')' )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==15) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:169:8: otherlv_9= 'Sees' otherlv_10= '(' ( ( ruleEString ) ) (otherlv_12= ',' ( ( ruleEString ) ) )* otherlv_14= ')'
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

            // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:215:3: (otherlv_15= 'Variables' ( (lv_variables_16_0= ruleVariable ) ) ( (lv_variables_17_0= ruleVariable ) )* )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==18) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:215:5: otherlv_15= 'Variables' ( (lv_variables_16_0= ruleVariable ) ) ( (lv_variables_17_0= ruleVariable ) )*
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

            // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:255:5: (otherlv_18= 'Invariants' ( (lv_invariants_19_0= ruleInvariant ) ) ( (lv_invariants_20_0= ruleInvariant ) )* )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==19) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:255:7: otherlv_18= 'Invariants' ( (lv_invariants_19_0= ruleInvariant ) ) ( (lv_invariants_20_0= ruleInvariant ) )*
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

                        if ( (LA8_0==34) ) {
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

            // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:295:5: (otherlv_21= 'Variant' ( (lv_variant_22_0= ruleVariant ) ) )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==20) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:295:7: otherlv_21= 'Variant' ( (lv_variant_22_0= ruleVariant ) )
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

            // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:317:4: (otherlv_23= 'Events' ( (lv_events_24_0= ruleevent ) ) ( (lv_events_25_0= ruleevent ) )* )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==21) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:317:6: otherlv_23= 'Events' ( (lv_events_24_0= ruleevent ) ) ( (lv_events_25_0= ruleevent ) )*
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

                        if ( (LA11_0==37) ) {
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


    // $ANTLR start "entryRuleAbstractExtension"
    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:369:1: entryRuleAbstractExtension returns [EObject current=null] : iv_ruleAbstractExtension= ruleAbstractExtension EOF ;
    public final EObject entryRuleAbstractExtension() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAbstractExtension = null;


        try {
            // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:370:2: (iv_ruleAbstractExtension= ruleAbstractExtension EOF )
            // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:371:2: iv_ruleAbstractExtension= ruleAbstractExtension EOF
            {
             newCompositeNode(grammarAccess.getAbstractExtensionRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleAbstractExtension_in_entryRuleAbstractExtension622);
            iv_ruleAbstractExtension=ruleAbstractExtension();

            state._fsp--;

             current =iv_ruleAbstractExtension; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleAbstractExtension632); 

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
    // $ANTLR end "entryRuleAbstractExtension"


    // $ANTLR start "ruleAbstractExtension"
    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:378:1: ruleAbstractExtension returns [EObject current=null] : this_Extension_0= ruleExtension ;
    public final EObject ruleAbstractExtension() throws RecognitionException {
        EObject current = null;

        EObject this_Extension_0 = null;


         enterRule(); 
            
        try {
            // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:381:28: (this_Extension_0= ruleExtension )
            // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:383:5: this_Extension_0= ruleExtension
            {
             
                    newCompositeNode(grammarAccess.getAbstractExtensionAccess().getExtensionParserRuleCall()); 
                
            pushFollow(FollowSets000.FOLLOW_ruleExtension_in_ruleAbstractExtension678);
            this_Extension_0=ruleExtension();

            state._fsp--;

             
                    current = this_Extension_0; 
                    afterParserOrEnumRuleCall();
                

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
    // $ANTLR end "ruleAbstractExtension"


    // $ANTLR start "entryRuleAnnotation"
    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:399:1: entryRuleAnnotation returns [EObject current=null] : iv_ruleAnnotation= ruleAnnotation EOF ;
    public final EObject entryRuleAnnotation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAnnotation = null;


        try {
            // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:400:2: (iv_ruleAnnotation= ruleAnnotation EOF )
            // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:401:2: iv_ruleAnnotation= ruleAnnotation EOF
            {
             newCompositeNode(grammarAccess.getAnnotationRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleAnnotation_in_entryRuleAnnotation712);
            iv_ruleAnnotation=ruleAnnotation();

            state._fsp--;

             current =iv_ruleAnnotation; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleAnnotation722); 

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
    // $ANTLR end "entryRuleAnnotation"


    // $ANTLR start "ruleAnnotation"
    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:408:1: ruleAnnotation returns [EObject current=null] : ( () otherlv_1= 'Annotation' otherlv_2= '{' (otherlv_3= 'source' ( (lv_source_4_0= ruleEString ) ) )? (otherlv_5= 'references' otherlv_6= '(' ( ( ruleEString ) ) (otherlv_8= ',' ( ( ruleEString ) ) )* otherlv_10= ')' )? (otherlv_11= 'annotations' otherlv_12= '{' ( (lv_annotations_13_0= ruleAnnotation ) ) (otherlv_14= ',' ( (lv_annotations_15_0= ruleAnnotation ) ) )* otherlv_16= '}' )? (otherlv_17= 'details' otherlv_18= '{' ( (lv_details_19_0= ruleStringToStringMapEntry ) ) (otherlv_20= ',' ( (lv_details_21_0= ruleStringToStringMapEntry ) ) )* otherlv_22= '}' )? (otherlv_23= 'contents' otherlv_24= '{' ( (lv_contents_25_0= ruleEObject ) ) (otherlv_26= ',' ( (lv_contents_27_0= ruleEObject ) ) )* otherlv_28= '}' )? otherlv_29= '}' ) ;
    public final EObject ruleAnnotation() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        Token otherlv_14=null;
        Token otherlv_16=null;
        Token otherlv_17=null;
        Token otherlv_18=null;
        Token otherlv_20=null;
        Token otherlv_22=null;
        Token otherlv_23=null;
        Token otherlv_24=null;
        Token otherlv_26=null;
        Token otherlv_28=null;
        Token otherlv_29=null;
        AntlrDatatypeRuleToken lv_source_4_0 = null;

        EObject lv_annotations_13_0 = null;

        EObject lv_annotations_15_0 = null;

        EObject lv_details_19_0 = null;

        EObject lv_details_21_0 = null;

        EObject lv_contents_25_0 = null;

        EObject lv_contents_27_0 = null;


         enterRule(); 
            
        try {
            // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:411:28: ( ( () otherlv_1= 'Annotation' otherlv_2= '{' (otherlv_3= 'source' ( (lv_source_4_0= ruleEString ) ) )? (otherlv_5= 'references' otherlv_6= '(' ( ( ruleEString ) ) (otherlv_8= ',' ( ( ruleEString ) ) )* otherlv_10= ')' )? (otherlv_11= 'annotations' otherlv_12= '{' ( (lv_annotations_13_0= ruleAnnotation ) ) (otherlv_14= ',' ( (lv_annotations_15_0= ruleAnnotation ) ) )* otherlv_16= '}' )? (otherlv_17= 'details' otherlv_18= '{' ( (lv_details_19_0= ruleStringToStringMapEntry ) ) (otherlv_20= ',' ( (lv_details_21_0= ruleStringToStringMapEntry ) ) )* otherlv_22= '}' )? (otherlv_23= 'contents' otherlv_24= '{' ( (lv_contents_25_0= ruleEObject ) ) (otherlv_26= ',' ( (lv_contents_27_0= ruleEObject ) ) )* otherlv_28= '}' )? otherlv_29= '}' ) )
            // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:412:1: ( () otherlv_1= 'Annotation' otherlv_2= '{' (otherlv_3= 'source' ( (lv_source_4_0= ruleEString ) ) )? (otherlv_5= 'references' otherlv_6= '(' ( ( ruleEString ) ) (otherlv_8= ',' ( ( ruleEString ) ) )* otherlv_10= ')' )? (otherlv_11= 'annotations' otherlv_12= '{' ( (lv_annotations_13_0= ruleAnnotation ) ) (otherlv_14= ',' ( (lv_annotations_15_0= ruleAnnotation ) ) )* otherlv_16= '}' )? (otherlv_17= 'details' otherlv_18= '{' ( (lv_details_19_0= ruleStringToStringMapEntry ) ) (otherlv_20= ',' ( (lv_details_21_0= ruleStringToStringMapEntry ) ) )* otherlv_22= '}' )? (otherlv_23= 'contents' otherlv_24= '{' ( (lv_contents_25_0= ruleEObject ) ) (otherlv_26= ',' ( (lv_contents_27_0= ruleEObject ) ) )* otherlv_28= '}' )? otherlv_29= '}' )
            {
            // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:412:1: ( () otherlv_1= 'Annotation' otherlv_2= '{' (otherlv_3= 'source' ( (lv_source_4_0= ruleEString ) ) )? (otherlv_5= 'references' otherlv_6= '(' ( ( ruleEString ) ) (otherlv_8= ',' ( ( ruleEString ) ) )* otherlv_10= ')' )? (otherlv_11= 'annotations' otherlv_12= '{' ( (lv_annotations_13_0= ruleAnnotation ) ) (otherlv_14= ',' ( (lv_annotations_15_0= ruleAnnotation ) ) )* otherlv_16= '}' )? (otherlv_17= 'details' otherlv_18= '{' ( (lv_details_19_0= ruleStringToStringMapEntry ) ) (otherlv_20= ',' ( (lv_details_21_0= ruleStringToStringMapEntry ) ) )* otherlv_22= '}' )? (otherlv_23= 'contents' otherlv_24= '{' ( (lv_contents_25_0= ruleEObject ) ) (otherlv_26= ',' ( (lv_contents_27_0= ruleEObject ) ) )* otherlv_28= '}' )? otherlv_29= '}' )
            // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:412:2: () otherlv_1= 'Annotation' otherlv_2= '{' (otherlv_3= 'source' ( (lv_source_4_0= ruleEString ) ) )? (otherlv_5= 'references' otherlv_6= '(' ( ( ruleEString ) ) (otherlv_8= ',' ( ( ruleEString ) ) )* otherlv_10= ')' )? (otherlv_11= 'annotations' otherlv_12= '{' ( (lv_annotations_13_0= ruleAnnotation ) ) (otherlv_14= ',' ( (lv_annotations_15_0= ruleAnnotation ) ) )* otherlv_16= '}' )? (otherlv_17= 'details' otherlv_18= '{' ( (lv_details_19_0= ruleStringToStringMapEntry ) ) (otherlv_20= ',' ( (lv_details_21_0= ruleStringToStringMapEntry ) ) )* otherlv_22= '}' )? (otherlv_23= 'contents' otherlv_24= '{' ( (lv_contents_25_0= ruleEObject ) ) (otherlv_26= ',' ( (lv_contents_27_0= ruleEObject ) ) )* otherlv_28= '}' )? otherlv_29= '}'
            {
            // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:412:2: ()
            // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:413:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getAnnotationAccess().getAnnotationAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,23,FollowSets000.FOLLOW_23_in_ruleAnnotation768); 

                	newLeafNode(otherlv_1, grammarAccess.getAnnotationAccess().getAnnotationKeyword_1());
                
            otherlv_2=(Token)match(input,24,FollowSets000.FOLLOW_24_in_ruleAnnotation780); 

                	newLeafNode(otherlv_2, grammarAccess.getAnnotationAccess().getLeftCurlyBracketKeyword_2());
                
            // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:426:1: (otherlv_3= 'source' ( (lv_source_4_0= ruleEString ) ) )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==25) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:426:3: otherlv_3= 'source' ( (lv_source_4_0= ruleEString ) )
                    {
                    otherlv_3=(Token)match(input,25,FollowSets000.FOLLOW_25_in_ruleAnnotation793); 

                        	newLeafNode(otherlv_3, grammarAccess.getAnnotationAccess().getSourceKeyword_3_0());
                        
                    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:430:1: ( (lv_source_4_0= ruleEString ) )
                    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:431:1: (lv_source_4_0= ruleEString )
                    {
                    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:431:1: (lv_source_4_0= ruleEString )
                    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:432:3: lv_source_4_0= ruleEString
                    {
                     
                    	        newCompositeNode(grammarAccess.getAnnotationAccess().getSourceEStringParserRuleCall_3_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleAnnotation814);
                    lv_source_4_0=ruleEString();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getAnnotationRule());
                    	        }
                           		set(
                           			current, 
                           			"source",
                            		lv_source_4_0, 
                            		"EString");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:448:4: (otherlv_5= 'references' otherlv_6= '(' ( ( ruleEString ) ) (otherlv_8= ',' ( ( ruleEString ) ) )* otherlv_10= ')' )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==26) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:448:6: otherlv_5= 'references' otherlv_6= '(' ( ( ruleEString ) ) (otherlv_8= ',' ( ( ruleEString ) ) )* otherlv_10= ')'
                    {
                    otherlv_5=(Token)match(input,26,FollowSets000.FOLLOW_26_in_ruleAnnotation829); 

                        	newLeafNode(otherlv_5, grammarAccess.getAnnotationAccess().getReferencesKeyword_4_0());
                        
                    otherlv_6=(Token)match(input,16,FollowSets000.FOLLOW_16_in_ruleAnnotation841); 

                        	newLeafNode(otherlv_6, grammarAccess.getAnnotationAccess().getLeftParenthesisKeyword_4_1());
                        
                    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:456:1: ( ( ruleEString ) )
                    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:457:1: ( ruleEString )
                    {
                    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:457:1: ( ruleEString )
                    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:458:3: ruleEString
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getAnnotationRule());
                    	        }
                            
                     
                    	        newCompositeNode(grammarAccess.getAnnotationAccess().getReferencesEObjectCrossReference_4_2_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleAnnotation864);
                    ruleEString();

                    state._fsp--;

                     
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:471:2: (otherlv_8= ',' ( ( ruleEString ) ) )*
                    loop14:
                    do {
                        int alt14=2;
                        int LA14_0 = input.LA(1);

                        if ( (LA14_0==14) ) {
                            alt14=1;
                        }


                        switch (alt14) {
                    	case 1 :
                    	    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:471:4: otherlv_8= ',' ( ( ruleEString ) )
                    	    {
                    	    otherlv_8=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleAnnotation877); 

                    	        	newLeafNode(otherlv_8, grammarAccess.getAnnotationAccess().getCommaKeyword_4_3_0());
                    	        
                    	    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:475:1: ( ( ruleEString ) )
                    	    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:476:1: ( ruleEString )
                    	    {
                    	    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:476:1: ( ruleEString )
                    	    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:477:3: ruleEString
                    	    {

                    	    			if (current==null) {
                    	    	            current = createModelElement(grammarAccess.getAnnotationRule());
                    	    	        }
                    	            
                    	     
                    	    	        newCompositeNode(grammarAccess.getAnnotationAccess().getReferencesEObjectCrossReference_4_3_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleAnnotation900);
                    	    ruleEString();

                    	    state._fsp--;

                    	     
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop14;
                        }
                    } while (true);

                    otherlv_10=(Token)match(input,17,FollowSets000.FOLLOW_17_in_ruleAnnotation914); 

                        	newLeafNode(otherlv_10, grammarAccess.getAnnotationAccess().getRightParenthesisKeyword_4_4());
                        

                    }
                    break;

            }

            // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:494:3: (otherlv_11= 'annotations' otherlv_12= '{' ( (lv_annotations_13_0= ruleAnnotation ) ) (otherlv_14= ',' ( (lv_annotations_15_0= ruleAnnotation ) ) )* otherlv_16= '}' )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==27) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:494:5: otherlv_11= 'annotations' otherlv_12= '{' ( (lv_annotations_13_0= ruleAnnotation ) ) (otherlv_14= ',' ( (lv_annotations_15_0= ruleAnnotation ) ) )* otherlv_16= '}'
                    {
                    otherlv_11=(Token)match(input,27,FollowSets000.FOLLOW_27_in_ruleAnnotation929); 

                        	newLeafNode(otherlv_11, grammarAccess.getAnnotationAccess().getAnnotationsKeyword_5_0());
                        
                    otherlv_12=(Token)match(input,24,FollowSets000.FOLLOW_24_in_ruleAnnotation941); 

                        	newLeafNode(otherlv_12, grammarAccess.getAnnotationAccess().getLeftCurlyBracketKeyword_5_1());
                        
                    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:502:1: ( (lv_annotations_13_0= ruleAnnotation ) )
                    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:503:1: (lv_annotations_13_0= ruleAnnotation )
                    {
                    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:503:1: (lv_annotations_13_0= ruleAnnotation )
                    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:504:3: lv_annotations_13_0= ruleAnnotation
                    {
                     
                    	        newCompositeNode(grammarAccess.getAnnotationAccess().getAnnotationsAnnotationParserRuleCall_5_2_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleAnnotation_in_ruleAnnotation962);
                    lv_annotations_13_0=ruleAnnotation();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getAnnotationRule());
                    	        }
                           		add(
                           			current, 
                           			"annotations",
                            		lv_annotations_13_0, 
                            		"Annotation");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:520:2: (otherlv_14= ',' ( (lv_annotations_15_0= ruleAnnotation ) ) )*
                    loop16:
                    do {
                        int alt16=2;
                        int LA16_0 = input.LA(1);

                        if ( (LA16_0==14) ) {
                            alt16=1;
                        }


                        switch (alt16) {
                    	case 1 :
                    	    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:520:4: otherlv_14= ',' ( (lv_annotations_15_0= ruleAnnotation ) )
                    	    {
                    	    otherlv_14=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleAnnotation975); 

                    	        	newLeafNode(otherlv_14, grammarAccess.getAnnotationAccess().getCommaKeyword_5_3_0());
                    	        
                    	    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:524:1: ( (lv_annotations_15_0= ruleAnnotation ) )
                    	    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:525:1: (lv_annotations_15_0= ruleAnnotation )
                    	    {
                    	    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:525:1: (lv_annotations_15_0= ruleAnnotation )
                    	    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:526:3: lv_annotations_15_0= ruleAnnotation
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getAnnotationAccess().getAnnotationsAnnotationParserRuleCall_5_3_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleAnnotation_in_ruleAnnotation996);
                    	    lv_annotations_15_0=ruleAnnotation();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getAnnotationRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"annotations",
                    	            		lv_annotations_15_0, 
                    	            		"Annotation");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop16;
                        }
                    } while (true);

                    otherlv_16=(Token)match(input,28,FollowSets000.FOLLOW_28_in_ruleAnnotation1010); 

                        	newLeafNode(otherlv_16, grammarAccess.getAnnotationAccess().getRightCurlyBracketKeyword_5_4());
                        

                    }
                    break;

            }

            // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:546:3: (otherlv_17= 'details' otherlv_18= '{' ( (lv_details_19_0= ruleStringToStringMapEntry ) ) (otherlv_20= ',' ( (lv_details_21_0= ruleStringToStringMapEntry ) ) )* otherlv_22= '}' )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==29) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:546:5: otherlv_17= 'details' otherlv_18= '{' ( (lv_details_19_0= ruleStringToStringMapEntry ) ) (otherlv_20= ',' ( (lv_details_21_0= ruleStringToStringMapEntry ) ) )* otherlv_22= '}'
                    {
                    otherlv_17=(Token)match(input,29,FollowSets000.FOLLOW_29_in_ruleAnnotation1025); 

                        	newLeafNode(otherlv_17, grammarAccess.getAnnotationAccess().getDetailsKeyword_6_0());
                        
                    otherlv_18=(Token)match(input,24,FollowSets000.FOLLOW_24_in_ruleAnnotation1037); 

                        	newLeafNode(otherlv_18, grammarAccess.getAnnotationAccess().getLeftCurlyBracketKeyword_6_1());
                        
                    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:554:1: ( (lv_details_19_0= ruleStringToStringMapEntry ) )
                    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:555:1: (lv_details_19_0= ruleStringToStringMapEntry )
                    {
                    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:555:1: (lv_details_19_0= ruleStringToStringMapEntry )
                    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:556:3: lv_details_19_0= ruleStringToStringMapEntry
                    {
                     
                    	        newCompositeNode(grammarAccess.getAnnotationAccess().getDetailsStringToStringMapEntryParserRuleCall_6_2_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleStringToStringMapEntry_in_ruleAnnotation1058);
                    lv_details_19_0=ruleStringToStringMapEntry();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getAnnotationRule());
                    	        }
                           		add(
                           			current, 
                           			"details",
                            		lv_details_19_0, 
                            		"StringToStringMapEntry");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:572:2: (otherlv_20= ',' ( (lv_details_21_0= ruleStringToStringMapEntry ) ) )*
                    loop18:
                    do {
                        int alt18=2;
                        int LA18_0 = input.LA(1);

                        if ( (LA18_0==14) ) {
                            alt18=1;
                        }


                        switch (alt18) {
                    	case 1 :
                    	    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:572:4: otherlv_20= ',' ( (lv_details_21_0= ruleStringToStringMapEntry ) )
                    	    {
                    	    otherlv_20=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleAnnotation1071); 

                    	        	newLeafNode(otherlv_20, grammarAccess.getAnnotationAccess().getCommaKeyword_6_3_0());
                    	        
                    	    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:576:1: ( (lv_details_21_0= ruleStringToStringMapEntry ) )
                    	    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:577:1: (lv_details_21_0= ruleStringToStringMapEntry )
                    	    {
                    	    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:577:1: (lv_details_21_0= ruleStringToStringMapEntry )
                    	    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:578:3: lv_details_21_0= ruleStringToStringMapEntry
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getAnnotationAccess().getDetailsStringToStringMapEntryParserRuleCall_6_3_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleStringToStringMapEntry_in_ruleAnnotation1092);
                    	    lv_details_21_0=ruleStringToStringMapEntry();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getAnnotationRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"details",
                    	            		lv_details_21_0, 
                    	            		"StringToStringMapEntry");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop18;
                        }
                    } while (true);

                    otherlv_22=(Token)match(input,28,FollowSets000.FOLLOW_28_in_ruleAnnotation1106); 

                        	newLeafNode(otherlv_22, grammarAccess.getAnnotationAccess().getRightCurlyBracketKeyword_6_4());
                        

                    }
                    break;

            }

            // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:598:3: (otherlv_23= 'contents' otherlv_24= '{' ( (lv_contents_25_0= ruleEObject ) ) (otherlv_26= ',' ( (lv_contents_27_0= ruleEObject ) ) )* otherlv_28= '}' )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==30) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:598:5: otherlv_23= 'contents' otherlv_24= '{' ( (lv_contents_25_0= ruleEObject ) ) (otherlv_26= ',' ( (lv_contents_27_0= ruleEObject ) ) )* otherlv_28= '}'
                    {
                    otherlv_23=(Token)match(input,30,FollowSets000.FOLLOW_30_in_ruleAnnotation1121); 

                        	newLeafNode(otherlv_23, grammarAccess.getAnnotationAccess().getContentsKeyword_7_0());
                        
                    otherlv_24=(Token)match(input,24,FollowSets000.FOLLOW_24_in_ruleAnnotation1133); 

                        	newLeafNode(otherlv_24, grammarAccess.getAnnotationAccess().getLeftCurlyBracketKeyword_7_1());
                        
                    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:606:1: ( (lv_contents_25_0= ruleEObject ) )
                    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:607:1: (lv_contents_25_0= ruleEObject )
                    {
                    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:607:1: (lv_contents_25_0= ruleEObject )
                    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:608:3: lv_contents_25_0= ruleEObject
                    {
                     
                    	        newCompositeNode(grammarAccess.getAnnotationAccess().getContentsEObjectParserRuleCall_7_2_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEObject_in_ruleAnnotation1154);
                    lv_contents_25_0=ruleEObject();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getAnnotationRule());
                    	        }
                           		add(
                           			current, 
                           			"contents",
                            		lv_contents_25_0, 
                            		"EObject");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:624:2: (otherlv_26= ',' ( (lv_contents_27_0= ruleEObject ) ) )*
                    loop20:
                    do {
                        int alt20=2;
                        int LA20_0 = input.LA(1);

                        if ( (LA20_0==14) ) {
                            alt20=1;
                        }


                        switch (alt20) {
                    	case 1 :
                    	    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:624:4: otherlv_26= ',' ( (lv_contents_27_0= ruleEObject ) )
                    	    {
                    	    otherlv_26=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleAnnotation1167); 

                    	        	newLeafNode(otherlv_26, grammarAccess.getAnnotationAccess().getCommaKeyword_7_3_0());
                    	        
                    	    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:628:1: ( (lv_contents_27_0= ruleEObject ) )
                    	    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:629:1: (lv_contents_27_0= ruleEObject )
                    	    {
                    	    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:629:1: (lv_contents_27_0= ruleEObject )
                    	    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:630:3: lv_contents_27_0= ruleEObject
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getAnnotationAccess().getContentsEObjectParserRuleCall_7_3_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleEObject_in_ruleAnnotation1188);
                    	    lv_contents_27_0=ruleEObject();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getAnnotationRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"contents",
                    	            		lv_contents_27_0, 
                    	            		"EObject");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop20;
                        }
                    } while (true);

                    otherlv_28=(Token)match(input,28,FollowSets000.FOLLOW_28_in_ruleAnnotation1202); 

                        	newLeafNode(otherlv_28, grammarAccess.getAnnotationAccess().getRightCurlyBracketKeyword_7_4());
                        

                    }
                    break;

            }

            otherlv_29=(Token)match(input,28,FollowSets000.FOLLOW_28_in_ruleAnnotation1216); 

                	newLeafNode(otherlv_29, grammarAccess.getAnnotationAccess().getRightCurlyBracketKeyword_8());
                

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
    // $ANTLR end "ruleAnnotation"


    // $ANTLR start "entryRuleStringToAttributeMapEntry"
    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:662:1: entryRuleStringToAttributeMapEntry returns [EObject current=null] : iv_ruleStringToAttributeMapEntry= ruleStringToAttributeMapEntry EOF ;
    public final EObject entryRuleStringToAttributeMapEntry() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStringToAttributeMapEntry = null;


        try {
            // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:663:2: (iv_ruleStringToAttributeMapEntry= ruleStringToAttributeMapEntry EOF )
            // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:664:2: iv_ruleStringToAttributeMapEntry= ruleStringToAttributeMapEntry EOF
            {
             newCompositeNode(grammarAccess.getStringToAttributeMapEntryRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleStringToAttributeMapEntry_in_entryRuleStringToAttributeMapEntry1252);
            iv_ruleStringToAttributeMapEntry=ruleStringToAttributeMapEntry();

            state._fsp--;

             current =iv_ruleStringToAttributeMapEntry; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleStringToAttributeMapEntry1262); 

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
    // $ANTLR end "entryRuleStringToAttributeMapEntry"


    // $ANTLR start "ruleStringToAttributeMapEntry"
    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:671:1: ruleStringToAttributeMapEntry returns [EObject current=null] : (otherlv_0= 'StringToAttributeMapEntry' otherlv_1= '{' otherlv_2= 'key' ( (lv_key_3_0= ruleEString ) ) (otherlv_4= 'value' ( (lv_value_5_0= ruleAttribute ) ) )? otherlv_6= '}' ) ;
    public final EObject ruleStringToAttributeMapEntry() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        AntlrDatatypeRuleToken lv_key_3_0 = null;

        EObject lv_value_5_0 = null;


         enterRule(); 
            
        try {
            // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:674:28: ( (otherlv_0= 'StringToAttributeMapEntry' otherlv_1= '{' otherlv_2= 'key' ( (lv_key_3_0= ruleEString ) ) (otherlv_4= 'value' ( (lv_value_5_0= ruleAttribute ) ) )? otherlv_6= '}' ) )
            // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:675:1: (otherlv_0= 'StringToAttributeMapEntry' otherlv_1= '{' otherlv_2= 'key' ( (lv_key_3_0= ruleEString ) ) (otherlv_4= 'value' ( (lv_value_5_0= ruleAttribute ) ) )? otherlv_6= '}' )
            {
            // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:675:1: (otherlv_0= 'StringToAttributeMapEntry' otherlv_1= '{' otherlv_2= 'key' ( (lv_key_3_0= ruleEString ) ) (otherlv_4= 'value' ( (lv_value_5_0= ruleAttribute ) ) )? otherlv_6= '}' )
            // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:675:3: otherlv_0= 'StringToAttributeMapEntry' otherlv_1= '{' otherlv_2= 'key' ( (lv_key_3_0= ruleEString ) ) (otherlv_4= 'value' ( (lv_value_5_0= ruleAttribute ) ) )? otherlv_6= '}'
            {
            otherlv_0=(Token)match(input,31,FollowSets000.FOLLOW_31_in_ruleStringToAttributeMapEntry1299); 

                	newLeafNode(otherlv_0, grammarAccess.getStringToAttributeMapEntryAccess().getStringToAttributeMapEntryKeyword_0());
                
            otherlv_1=(Token)match(input,24,FollowSets000.FOLLOW_24_in_ruleStringToAttributeMapEntry1311); 

                	newLeafNode(otherlv_1, grammarAccess.getStringToAttributeMapEntryAccess().getLeftCurlyBracketKeyword_1());
                
            otherlv_2=(Token)match(input,32,FollowSets000.FOLLOW_32_in_ruleStringToAttributeMapEntry1323); 

                	newLeafNode(otherlv_2, grammarAccess.getStringToAttributeMapEntryAccess().getKeyKeyword_2());
                
            // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:687:1: ( (lv_key_3_0= ruleEString ) )
            // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:688:1: (lv_key_3_0= ruleEString )
            {
            // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:688:1: (lv_key_3_0= ruleEString )
            // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:689:3: lv_key_3_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getStringToAttributeMapEntryAccess().getKeyEStringParserRuleCall_3_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleStringToAttributeMapEntry1344);
            lv_key_3_0=ruleEString();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getStringToAttributeMapEntryRule());
            	        }
                   		set(
                   			current, 
                   			"key",
                    		lv_key_3_0, 
                    		"EString");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:705:2: (otherlv_4= 'value' ( (lv_value_5_0= ruleAttribute ) ) )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==33) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:705:4: otherlv_4= 'value' ( (lv_value_5_0= ruleAttribute ) )
                    {
                    otherlv_4=(Token)match(input,33,FollowSets000.FOLLOW_33_in_ruleStringToAttributeMapEntry1357); 

                        	newLeafNode(otherlv_4, grammarAccess.getStringToAttributeMapEntryAccess().getValueKeyword_4_0());
                        
                    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:709:1: ( (lv_value_5_0= ruleAttribute ) )
                    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:710:1: (lv_value_5_0= ruleAttribute )
                    {
                    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:710:1: (lv_value_5_0= ruleAttribute )
                    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:711:3: lv_value_5_0= ruleAttribute
                    {
                     
                    	        newCompositeNode(grammarAccess.getStringToAttributeMapEntryAccess().getValueAttributeParserRuleCall_4_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleAttribute_in_ruleStringToAttributeMapEntry1378);
                    lv_value_5_0=ruleAttribute();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getStringToAttributeMapEntryRule());
                    	        }
                           		set(
                           			current, 
                           			"value",
                            		lv_value_5_0, 
                            		"Attribute");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            otherlv_6=(Token)match(input,28,FollowSets000.FOLLOW_28_in_ruleStringToAttributeMapEntry1392); 

                	newLeafNode(otherlv_6, grammarAccess.getStringToAttributeMapEntryAccess().getRightCurlyBracketKeyword_5());
                

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
    // $ANTLR end "ruleStringToAttributeMapEntry"


    // $ANTLR start "entryRuleEString"
    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:741:1: entryRuleEString returns [String current=null] : iv_ruleEString= ruleEString EOF ;
    public final String entryRuleEString() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEString = null;


        try {
            // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:742:2: (iv_ruleEString= ruleEString EOF )
            // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:743:2: iv_ruleEString= ruleEString EOF
            {
             newCompositeNode(grammarAccess.getEStringRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_entryRuleEString1431);
            iv_ruleEString=ruleEString();

            state._fsp--;

             current =iv_ruleEString.getText(); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleEString1442); 

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
    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:750:1: ruleEString returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) ;
    public final AntlrDatatypeRuleToken ruleEString() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;
        Token this_ID_1=null;

         enterRule(); 
            
        try {
            // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:753:28: ( (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) )
            // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:754:1: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            {
            // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:754:1: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==RULE_STRING) ) {
                alt23=1;
            }
            else if ( (LA23_0==RULE_ID) ) {
                alt23=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 23, 0, input);

                throw nvae;
            }
            switch (alt23) {
                case 1 :
                    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:754:6: this_STRING_0= RULE_STRING
                    {
                    this_STRING_0=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_RULE_STRING_in_ruleEString1482); 

                    		current.merge(this_STRING_0);
                        
                     
                        newLeafNode(this_STRING_0, grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 
                        

                    }
                    break;
                case 2 :
                    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:762:10: this_ID_1= RULE_ID
                    {
                    this_ID_1=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleEString1508); 

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
    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:777:1: entryRuleVariable returns [EObject current=null] : iv_ruleVariable= ruleVariable EOF ;
    public final EObject entryRuleVariable() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVariable = null;


        try {
            // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:778:2: (iv_ruleVariable= ruleVariable EOF )
            // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:779:2: iv_ruleVariable= ruleVariable EOF
            {
             newCompositeNode(grammarAccess.getVariableRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleVariable_in_entryRuleVariable1553);
            iv_ruleVariable=ruleVariable();

            state._fsp--;

             current =iv_ruleVariable; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleVariable1563); 

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
    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:786:1: ruleVariable returns [EObject current=null] : ( () ( (lv_name_1_0= ruleEString ) ) (otherlv_2= '//' ( (lv_comment_3_0= ruleEString ) ) )? ) ;
    public final EObject ruleVariable() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        AntlrDatatypeRuleToken lv_comment_3_0 = null;


         enterRule(); 
            
        try {
            // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:789:28: ( ( () ( (lv_name_1_0= ruleEString ) ) (otherlv_2= '//' ( (lv_comment_3_0= ruleEString ) ) )? ) )
            // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:790:1: ( () ( (lv_name_1_0= ruleEString ) ) (otherlv_2= '//' ( (lv_comment_3_0= ruleEString ) ) )? )
            {
            // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:790:1: ( () ( (lv_name_1_0= ruleEString ) ) (otherlv_2= '//' ( (lv_comment_3_0= ruleEString ) ) )? )
            // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:790:2: () ( (lv_name_1_0= ruleEString ) ) (otherlv_2= '//' ( (lv_comment_3_0= ruleEString ) ) )?
            {
            // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:790:2: ()
            // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:791:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getVariableAccess().getVariableAction_0(),
                        current);
                

            }

            // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:796:2: ( (lv_name_1_0= ruleEString ) )
            // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:797:1: (lv_name_1_0= ruleEString )
            {
            // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:797:1: (lv_name_1_0= ruleEString )
            // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:798:3: lv_name_1_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getVariableAccess().getNameEStringParserRuleCall_1_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleVariable1618);
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

            // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:814:2: (otherlv_2= '//' ( (lv_comment_3_0= ruleEString ) ) )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==12) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:814:4: otherlv_2= '//' ( (lv_comment_3_0= ruleEString ) )
                    {
                    otherlv_2=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleVariable1631); 

                        	newLeafNode(otherlv_2, grammarAccess.getVariableAccess().getSolidusSolidusKeyword_2_0());
                        
                    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:818:1: ( (lv_comment_3_0= ruleEString ) )
                    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:819:1: (lv_comment_3_0= ruleEString )
                    {
                    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:819:1: (lv_comment_3_0= ruleEString )
                    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:820:3: lv_comment_3_0= ruleEString
                    {
                     
                    	        newCompositeNode(grammarAccess.getVariableAccess().getCommentEStringParserRuleCall_2_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleVariable1652);
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
    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:844:1: entryRuleInvariant returns [EObject current=null] : iv_ruleInvariant= ruleInvariant EOF ;
    public final EObject entryRuleInvariant() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInvariant = null;


        try {
            // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:845:2: (iv_ruleInvariant= ruleInvariant EOF )
            // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:846:2: iv_ruleInvariant= ruleInvariant EOF
            {
             newCompositeNode(grammarAccess.getInvariantRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleInvariant_in_entryRuleInvariant1690);
            iv_ruleInvariant=ruleInvariant();

            state._fsp--;

             current =iv_ruleInvariant; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleInvariant1700); 

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
    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:853:1: ruleInvariant returns [EObject current=null] : (otherlv_0= '@' ( (lv_name_1_0= ruleEString ) ) ( (lv_theorem_2_0= 'theorem' ) )? ( (lv_predicate_3_0= ruleEString ) )? (otherlv_4= '//' ( (lv_comment_5_0= ruleEString ) ) )? ) ;
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
            // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:856:28: ( (otherlv_0= '@' ( (lv_name_1_0= ruleEString ) ) ( (lv_theorem_2_0= 'theorem' ) )? ( (lv_predicate_3_0= ruleEString ) )? (otherlv_4= '//' ( (lv_comment_5_0= ruleEString ) ) )? ) )
            // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:857:1: (otherlv_0= '@' ( (lv_name_1_0= ruleEString ) ) ( (lv_theorem_2_0= 'theorem' ) )? ( (lv_predicate_3_0= ruleEString ) )? (otherlv_4= '//' ( (lv_comment_5_0= ruleEString ) ) )? )
            {
            // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:857:1: (otherlv_0= '@' ( (lv_name_1_0= ruleEString ) ) ( (lv_theorem_2_0= 'theorem' ) )? ( (lv_predicate_3_0= ruleEString ) )? (otherlv_4= '//' ( (lv_comment_5_0= ruleEString ) ) )? )
            // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:857:3: otherlv_0= '@' ( (lv_name_1_0= ruleEString ) ) ( (lv_theorem_2_0= 'theorem' ) )? ( (lv_predicate_3_0= ruleEString ) )? (otherlv_4= '//' ( (lv_comment_5_0= ruleEString ) ) )?
            {
            otherlv_0=(Token)match(input,34,FollowSets000.FOLLOW_34_in_ruleInvariant1737); 

                	newLeafNode(otherlv_0, grammarAccess.getInvariantAccess().getCommercialAtKeyword_0());
                
            // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:861:1: ( (lv_name_1_0= ruleEString ) )
            // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:862:1: (lv_name_1_0= ruleEString )
            {
            // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:862:1: (lv_name_1_0= ruleEString )
            // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:863:3: lv_name_1_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getInvariantAccess().getNameEStringParserRuleCall_1_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleInvariant1758);
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

            // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:879:2: ( (lv_theorem_2_0= 'theorem' ) )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==35) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:880:1: (lv_theorem_2_0= 'theorem' )
                    {
                    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:880:1: (lv_theorem_2_0= 'theorem' )
                    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:881:3: lv_theorem_2_0= 'theorem'
                    {
                    lv_theorem_2_0=(Token)match(input,35,FollowSets000.FOLLOW_35_in_ruleInvariant1776); 

                            newLeafNode(lv_theorem_2_0, grammarAccess.getInvariantAccess().getTheoremTheoremKeyword_2_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getInvariantRule());
                    	        }
                           		setWithLastConsumed(current, "theorem", true, "theorem");
                    	    

                    }


                    }
                    break;

            }

            // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:894:3: ( (lv_predicate_3_0= ruleEString ) )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( ((LA26_0>=RULE_STRING && LA26_0<=RULE_ID)) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:895:1: (lv_predicate_3_0= ruleEString )
                    {
                    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:895:1: (lv_predicate_3_0= ruleEString )
                    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:896:3: lv_predicate_3_0= ruleEString
                    {
                     
                    	        newCompositeNode(grammarAccess.getInvariantAccess().getPredicateEStringParserRuleCall_3_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleInvariant1811);
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

            // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:912:3: (otherlv_4= '//' ( (lv_comment_5_0= ruleEString ) ) )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==12) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:912:5: otherlv_4= '//' ( (lv_comment_5_0= ruleEString ) )
                    {
                    otherlv_4=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleInvariant1825); 

                        	newLeafNode(otherlv_4, grammarAccess.getInvariantAccess().getSolidusSolidusKeyword_4_0());
                        
                    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:916:1: ( (lv_comment_5_0= ruleEString ) )
                    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:917:1: (lv_comment_5_0= ruleEString )
                    {
                    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:917:1: (lv_comment_5_0= ruleEString )
                    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:918:3: lv_comment_5_0= ruleEString
                    {
                     
                    	        newCompositeNode(grammarAccess.getInvariantAccess().getCommentEStringParserRuleCall_4_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleInvariant1846);
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
    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:942:1: entryRuleVariant returns [EObject current=null] : iv_ruleVariant= ruleVariant EOF ;
    public final EObject entryRuleVariant() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVariant = null;


        try {
            // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:943:2: (iv_ruleVariant= ruleVariant EOF )
            // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:944:2: iv_ruleVariant= ruleVariant EOF
            {
             newCompositeNode(grammarAccess.getVariantRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleVariant_in_entryRuleVariant1884);
            iv_ruleVariant=ruleVariant();

            state._fsp--;

             current =iv_ruleVariant; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleVariant1894); 

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
    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:951:1: ruleVariant returns [EObject current=null] : (otherlv_0= 'Variant' otherlv_1= 'expression' ( (lv_expression_2_0= ruleEString ) )? (otherlv_3= '//' ( (lv_comment_4_0= ruleEString ) ) ) ) ;
    public final EObject ruleVariant() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        AntlrDatatypeRuleToken lv_expression_2_0 = null;

        AntlrDatatypeRuleToken lv_comment_4_0 = null;


         enterRule(); 
            
        try {
            // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:954:28: ( (otherlv_0= 'Variant' otherlv_1= 'expression' ( (lv_expression_2_0= ruleEString ) )? (otherlv_3= '//' ( (lv_comment_4_0= ruleEString ) ) ) ) )
            // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:955:1: (otherlv_0= 'Variant' otherlv_1= 'expression' ( (lv_expression_2_0= ruleEString ) )? (otherlv_3= '//' ( (lv_comment_4_0= ruleEString ) ) ) )
            {
            // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:955:1: (otherlv_0= 'Variant' otherlv_1= 'expression' ( (lv_expression_2_0= ruleEString ) )? (otherlv_3= '//' ( (lv_comment_4_0= ruleEString ) ) ) )
            // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:955:3: otherlv_0= 'Variant' otherlv_1= 'expression' ( (lv_expression_2_0= ruleEString ) )? (otherlv_3= '//' ( (lv_comment_4_0= ruleEString ) ) )
            {
            otherlv_0=(Token)match(input,20,FollowSets000.FOLLOW_20_in_ruleVariant1931); 

                	newLeafNode(otherlv_0, grammarAccess.getVariantAccess().getVariantKeyword_0());
                
            otherlv_1=(Token)match(input,36,FollowSets000.FOLLOW_36_in_ruleVariant1943); 

                	newLeafNode(otherlv_1, grammarAccess.getVariantAccess().getExpressionKeyword_1());
                
            // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:963:1: ( (lv_expression_2_0= ruleEString ) )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( ((LA28_0>=RULE_STRING && LA28_0<=RULE_ID)) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:964:1: (lv_expression_2_0= ruleEString )
                    {
                    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:964:1: (lv_expression_2_0= ruleEString )
                    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:965:3: lv_expression_2_0= ruleEString
                    {
                     
                    	        newCompositeNode(grammarAccess.getVariantAccess().getExpressionEStringParserRuleCall_2_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleVariant1964);
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

            // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:981:3: (otherlv_3= '//' ( (lv_comment_4_0= ruleEString ) ) )
            // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:981:5: otherlv_3= '//' ( (lv_comment_4_0= ruleEString ) )
            {
            otherlv_3=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleVariant1978); 

                	newLeafNode(otherlv_3, grammarAccess.getVariantAccess().getSolidusSolidusKeyword_3_0());
                
            // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:985:1: ( (lv_comment_4_0= ruleEString ) )
            // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:986:1: (lv_comment_4_0= ruleEString )
            {
            // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:986:1: (lv_comment_4_0= ruleEString )
            // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:987:3: lv_comment_4_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getVariantAccess().getCommentEStringParserRuleCall_3_1_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleVariant1999);
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
    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:1011:1: entryRuleevent returns [EObject current=null] : iv_ruleevent= ruleevent EOF ;
    public final EObject entryRuleevent() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleevent = null;


        try {
            // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:1012:2: (iv_ruleevent= ruleevent EOF )
            // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:1013:2: iv_ruleevent= ruleevent EOF
            {
             newCompositeNode(grammarAccess.getEventRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleevent_in_entryRuleevent2036);
            iv_ruleevent=ruleevent();

            state._fsp--;

             current =iv_ruleevent; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleevent2046); 

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
    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:1020:1: ruleevent returns [EObject current=null] : ( () otherlv_1= 'event' ( (lv_name_2_0= ruleEString ) ) ( (lv_extended_3_0= 'extended' ) )? ( (lv_convergence_4_0= ruleConvergence ) )? (otherlv_5= '//' ( (lv_comment_6_0= ruleEString ) ) )? (otherlv_7= 'refines' ( ( ruleEString ) ) (otherlv_9= ',' ( ( ruleEString ) ) )* )? (otherlv_11= 'when' ( (lv_guards_12_0= ruleGuard ) ) ( (lv_guards_13_0= ruleGuard ) )* )? (otherlv_14= 'any' ( (lv_parameters_15_0= ruleParameter ) ) ( (lv_parameters_16_0= ruleParameter ) )* otherlv_17= 'where' ( (lv_guards_18_0= ruleGuard ) ) ( (lv_guards_19_0= ruleGuard ) )* )? (otherlv_20= 'witnesses' ( (lv_witnesses_21_0= ruleWitness ) ) ( (lv_witnesses_22_0= ruleWitness ) )* )? (otherlv_23= 'then' ( (lv_actions_24_0= ruleAction ) ) ( (lv_actions_25_0= ruleAction ) )* )? otherlv_26= 'end' ) ;
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
            // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:1023:28: ( ( () otherlv_1= 'event' ( (lv_name_2_0= ruleEString ) ) ( (lv_extended_3_0= 'extended' ) )? ( (lv_convergence_4_0= ruleConvergence ) )? (otherlv_5= '//' ( (lv_comment_6_0= ruleEString ) ) )? (otherlv_7= 'refines' ( ( ruleEString ) ) (otherlv_9= ',' ( ( ruleEString ) ) )* )? (otherlv_11= 'when' ( (lv_guards_12_0= ruleGuard ) ) ( (lv_guards_13_0= ruleGuard ) )* )? (otherlv_14= 'any' ( (lv_parameters_15_0= ruleParameter ) ) ( (lv_parameters_16_0= ruleParameter ) )* otherlv_17= 'where' ( (lv_guards_18_0= ruleGuard ) ) ( (lv_guards_19_0= ruleGuard ) )* )? (otherlv_20= 'witnesses' ( (lv_witnesses_21_0= ruleWitness ) ) ( (lv_witnesses_22_0= ruleWitness ) )* )? (otherlv_23= 'then' ( (lv_actions_24_0= ruleAction ) ) ( (lv_actions_25_0= ruleAction ) )* )? otherlv_26= 'end' ) )
            // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:1024:1: ( () otherlv_1= 'event' ( (lv_name_2_0= ruleEString ) ) ( (lv_extended_3_0= 'extended' ) )? ( (lv_convergence_4_0= ruleConvergence ) )? (otherlv_5= '//' ( (lv_comment_6_0= ruleEString ) ) )? (otherlv_7= 'refines' ( ( ruleEString ) ) (otherlv_9= ',' ( ( ruleEString ) ) )* )? (otherlv_11= 'when' ( (lv_guards_12_0= ruleGuard ) ) ( (lv_guards_13_0= ruleGuard ) )* )? (otherlv_14= 'any' ( (lv_parameters_15_0= ruleParameter ) ) ( (lv_parameters_16_0= ruleParameter ) )* otherlv_17= 'where' ( (lv_guards_18_0= ruleGuard ) ) ( (lv_guards_19_0= ruleGuard ) )* )? (otherlv_20= 'witnesses' ( (lv_witnesses_21_0= ruleWitness ) ) ( (lv_witnesses_22_0= ruleWitness ) )* )? (otherlv_23= 'then' ( (lv_actions_24_0= ruleAction ) ) ( (lv_actions_25_0= ruleAction ) )* )? otherlv_26= 'end' )
            {
            // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:1024:1: ( () otherlv_1= 'event' ( (lv_name_2_0= ruleEString ) ) ( (lv_extended_3_0= 'extended' ) )? ( (lv_convergence_4_0= ruleConvergence ) )? (otherlv_5= '//' ( (lv_comment_6_0= ruleEString ) ) )? (otherlv_7= 'refines' ( ( ruleEString ) ) (otherlv_9= ',' ( ( ruleEString ) ) )* )? (otherlv_11= 'when' ( (lv_guards_12_0= ruleGuard ) ) ( (lv_guards_13_0= ruleGuard ) )* )? (otherlv_14= 'any' ( (lv_parameters_15_0= ruleParameter ) ) ( (lv_parameters_16_0= ruleParameter ) )* otherlv_17= 'where' ( (lv_guards_18_0= ruleGuard ) ) ( (lv_guards_19_0= ruleGuard ) )* )? (otherlv_20= 'witnesses' ( (lv_witnesses_21_0= ruleWitness ) ) ( (lv_witnesses_22_0= ruleWitness ) )* )? (otherlv_23= 'then' ( (lv_actions_24_0= ruleAction ) ) ( (lv_actions_25_0= ruleAction ) )* )? otherlv_26= 'end' )
            // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:1024:2: () otherlv_1= 'event' ( (lv_name_2_0= ruleEString ) ) ( (lv_extended_3_0= 'extended' ) )? ( (lv_convergence_4_0= ruleConvergence ) )? (otherlv_5= '//' ( (lv_comment_6_0= ruleEString ) ) )? (otherlv_7= 'refines' ( ( ruleEString ) ) (otherlv_9= ',' ( ( ruleEString ) ) )* )? (otherlv_11= 'when' ( (lv_guards_12_0= ruleGuard ) ) ( (lv_guards_13_0= ruleGuard ) )* )? (otherlv_14= 'any' ( (lv_parameters_15_0= ruleParameter ) ) ( (lv_parameters_16_0= ruleParameter ) )* otherlv_17= 'where' ( (lv_guards_18_0= ruleGuard ) ) ( (lv_guards_19_0= ruleGuard ) )* )? (otherlv_20= 'witnesses' ( (lv_witnesses_21_0= ruleWitness ) ) ( (lv_witnesses_22_0= ruleWitness ) )* )? (otherlv_23= 'then' ( (lv_actions_24_0= ruleAction ) ) ( (lv_actions_25_0= ruleAction ) )* )? otherlv_26= 'end'
            {
            // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:1024:2: ()
            // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:1025:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getEventAccess().getEventAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,37,FollowSets000.FOLLOW_37_in_ruleevent2092); 

                	newLeafNode(otherlv_1, grammarAccess.getEventAccess().getEventKeyword_1());
                
            // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:1034:1: ( (lv_name_2_0= ruleEString ) )
            // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:1035:1: (lv_name_2_0= ruleEString )
            {
            // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:1035:1: (lv_name_2_0= ruleEString )
            // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:1036:3: lv_name_2_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getEventAccess().getNameEStringParserRuleCall_2_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleevent2113);
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

            // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:1052:2: ( (lv_extended_3_0= 'extended' ) )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==38) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:1053:1: (lv_extended_3_0= 'extended' )
                    {
                    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:1053:1: (lv_extended_3_0= 'extended' )
                    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:1054:3: lv_extended_3_0= 'extended'
                    {
                    lv_extended_3_0=(Token)match(input,38,FollowSets000.FOLLOW_38_in_ruleevent2131); 

                            newLeafNode(lv_extended_3_0, grammarAccess.getEventAccess().getExtendedExtendedKeyword_3_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getEventRule());
                    	        }
                           		setWithLastConsumed(current, "extended", true, "extended");
                    	    

                    }


                    }
                    break;

            }

            // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:1067:3: ( (lv_convergence_4_0= ruleConvergence ) )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( ((LA30_0>=64 && LA30_0<=66)) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:1068:1: (lv_convergence_4_0= ruleConvergence )
                    {
                    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:1068:1: (lv_convergence_4_0= ruleConvergence )
                    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:1069:3: lv_convergence_4_0= ruleConvergence
                    {
                     
                    	        newCompositeNode(grammarAccess.getEventAccess().getConvergenceConvergenceEnumRuleCall_4_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleConvergence_in_ruleevent2166);
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

            // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:1085:3: (otherlv_5= '//' ( (lv_comment_6_0= ruleEString ) ) )?
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==12) ) {
                alt31=1;
            }
            switch (alt31) {
                case 1 :
                    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:1085:5: otherlv_5= '//' ( (lv_comment_6_0= ruleEString ) )
                    {
                    otherlv_5=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleevent2180); 

                        	newLeafNode(otherlv_5, grammarAccess.getEventAccess().getSolidusSolidusKeyword_5_0());
                        
                    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:1089:1: ( (lv_comment_6_0= ruleEString ) )
                    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:1090:1: (lv_comment_6_0= ruleEString )
                    {
                    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:1090:1: (lv_comment_6_0= ruleEString )
                    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:1091:3: lv_comment_6_0= ruleEString
                    {
                     
                    	        newCompositeNode(grammarAccess.getEventAccess().getCommentEStringParserRuleCall_5_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleevent2201);
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

            // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:1107:4: (otherlv_7= 'refines' ( ( ruleEString ) ) (otherlv_9= ',' ( ( ruleEString ) ) )* )?
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==39) ) {
                alt33=1;
            }
            switch (alt33) {
                case 1 :
                    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:1107:6: otherlv_7= 'refines' ( ( ruleEString ) ) (otherlv_9= ',' ( ( ruleEString ) ) )*
                    {
                    otherlv_7=(Token)match(input,39,FollowSets000.FOLLOW_39_in_ruleevent2216); 

                        	newLeafNode(otherlv_7, grammarAccess.getEventAccess().getRefinesKeyword_6_0());
                        
                    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:1111:1: ( ( ruleEString ) )
                    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:1112:1: ( ruleEString )
                    {
                    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:1112:1: ( ruleEString )
                    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:1113:3: ruleEString
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getEventRule());
                    	        }
                            
                     
                    	        newCompositeNode(grammarAccess.getEventAccess().getRefinesEventCrossReference_6_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleevent2239);
                    ruleEString();

                    state._fsp--;

                     
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:1126:2: (otherlv_9= ',' ( ( ruleEString ) ) )*
                    loop32:
                    do {
                        int alt32=2;
                        int LA32_0 = input.LA(1);

                        if ( (LA32_0==14) ) {
                            alt32=1;
                        }


                        switch (alt32) {
                    	case 1 :
                    	    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:1126:4: otherlv_9= ',' ( ( ruleEString ) )
                    	    {
                    	    otherlv_9=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleevent2252); 

                    	        	newLeafNode(otherlv_9, grammarAccess.getEventAccess().getCommaKeyword_6_2_0());
                    	        
                    	    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:1130:1: ( ( ruleEString ) )
                    	    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:1131:1: ( ruleEString )
                    	    {
                    	    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:1131:1: ( ruleEString )
                    	    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:1132:3: ruleEString
                    	    {

                    	    			if (current==null) {
                    	    	            current = createModelElement(grammarAccess.getEventRule());
                    	    	        }
                    	            
                    	     
                    	    	        newCompositeNode(grammarAccess.getEventAccess().getRefinesEventCrossReference_6_2_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleevent2275);
                    	    ruleEString();

                    	    state._fsp--;

                    	     
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop32;
                        }
                    } while (true);


                    }
                    break;

            }

            // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:1145:6: (otherlv_11= 'when' ( (lv_guards_12_0= ruleGuard ) ) ( (lv_guards_13_0= ruleGuard ) )* )?
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( (LA35_0==40) ) {
                alt35=1;
            }
            switch (alt35) {
                case 1 :
                    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:1145:8: otherlv_11= 'when' ( (lv_guards_12_0= ruleGuard ) ) ( (lv_guards_13_0= ruleGuard ) )*
                    {
                    otherlv_11=(Token)match(input,40,FollowSets000.FOLLOW_40_in_ruleevent2292); 

                        	newLeafNode(otherlv_11, grammarAccess.getEventAccess().getWhenKeyword_7_0());
                        
                    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:1149:1: ( (lv_guards_12_0= ruleGuard ) )
                    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:1150:1: (lv_guards_12_0= ruleGuard )
                    {
                    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:1150:1: (lv_guards_12_0= ruleGuard )
                    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:1151:3: lv_guards_12_0= ruleGuard
                    {
                     
                    	        newCompositeNode(grammarAccess.getEventAccess().getGuardsGuardParserRuleCall_7_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleGuard_in_ruleevent2313);
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

                    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:1167:2: ( (lv_guards_13_0= ruleGuard ) )*
                    loop34:
                    do {
                        int alt34=2;
                        int LA34_0 = input.LA(1);

                        if ( (LA34_0==34) ) {
                            alt34=1;
                        }


                        switch (alt34) {
                    	case 1 :
                    	    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:1168:1: (lv_guards_13_0= ruleGuard )
                    	    {
                    	    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:1168:1: (lv_guards_13_0= ruleGuard )
                    	    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:1169:3: lv_guards_13_0= ruleGuard
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getEventAccess().getGuardsGuardParserRuleCall_7_2_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleGuard_in_ruleevent2334);
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
                    	    break loop34;
                        }
                    } while (true);


                    }
                    break;

            }

            // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:1185:5: (otherlv_14= 'any' ( (lv_parameters_15_0= ruleParameter ) ) ( (lv_parameters_16_0= ruleParameter ) )* otherlv_17= 'where' ( (lv_guards_18_0= ruleGuard ) ) ( (lv_guards_19_0= ruleGuard ) )* )?
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( (LA38_0==41) ) {
                alt38=1;
            }
            switch (alt38) {
                case 1 :
                    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:1185:7: otherlv_14= 'any' ( (lv_parameters_15_0= ruleParameter ) ) ( (lv_parameters_16_0= ruleParameter ) )* otherlv_17= 'where' ( (lv_guards_18_0= ruleGuard ) ) ( (lv_guards_19_0= ruleGuard ) )*
                    {
                    otherlv_14=(Token)match(input,41,FollowSets000.FOLLOW_41_in_ruleevent2350); 

                        	newLeafNode(otherlv_14, grammarAccess.getEventAccess().getAnyKeyword_8_0());
                        
                    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:1189:1: ( (lv_parameters_15_0= ruleParameter ) )
                    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:1190:1: (lv_parameters_15_0= ruleParameter )
                    {
                    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:1190:1: (lv_parameters_15_0= ruleParameter )
                    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:1191:3: lv_parameters_15_0= ruleParameter
                    {
                     
                    	        newCompositeNode(grammarAccess.getEventAccess().getParametersParameterParserRuleCall_8_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleParameter_in_ruleevent2371);
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

                    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:1207:2: ( (lv_parameters_16_0= ruleParameter ) )*
                    loop36:
                    do {
                        int alt36=2;
                        int LA36_0 = input.LA(1);

                        if ( ((LA36_0>=RULE_STRING && LA36_0<=RULE_ID)) ) {
                            alt36=1;
                        }


                        switch (alt36) {
                    	case 1 :
                    	    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:1208:1: (lv_parameters_16_0= ruleParameter )
                    	    {
                    	    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:1208:1: (lv_parameters_16_0= ruleParameter )
                    	    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:1209:3: lv_parameters_16_0= ruleParameter
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getEventAccess().getParametersParameterParserRuleCall_8_2_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleParameter_in_ruleevent2392);
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
                    	    break loop36;
                        }
                    } while (true);

                    otherlv_17=(Token)match(input,42,FollowSets000.FOLLOW_42_in_ruleevent2405); 

                        	newLeafNode(otherlv_17, grammarAccess.getEventAccess().getWhereKeyword_8_3());
                        
                    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:1229:1: ( (lv_guards_18_0= ruleGuard ) )
                    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:1230:1: (lv_guards_18_0= ruleGuard )
                    {
                    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:1230:1: (lv_guards_18_0= ruleGuard )
                    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:1231:3: lv_guards_18_0= ruleGuard
                    {
                     
                    	        newCompositeNode(grammarAccess.getEventAccess().getGuardsGuardParserRuleCall_8_4_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleGuard_in_ruleevent2426);
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

                    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:1247:2: ( (lv_guards_19_0= ruleGuard ) )*
                    loop37:
                    do {
                        int alt37=2;
                        int LA37_0 = input.LA(1);

                        if ( (LA37_0==34) ) {
                            alt37=1;
                        }


                        switch (alt37) {
                    	case 1 :
                    	    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:1248:1: (lv_guards_19_0= ruleGuard )
                    	    {
                    	    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:1248:1: (lv_guards_19_0= ruleGuard )
                    	    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:1249:3: lv_guards_19_0= ruleGuard
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getEventAccess().getGuardsGuardParserRuleCall_8_5_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleGuard_in_ruleevent2447);
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
                    	    break loop37;
                        }
                    } while (true);


                    }
                    break;

            }

            // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:1265:5: (otherlv_20= 'witnesses' ( (lv_witnesses_21_0= ruleWitness ) ) ( (lv_witnesses_22_0= ruleWitness ) )* )?
            int alt40=2;
            int LA40_0 = input.LA(1);

            if ( (LA40_0==43) ) {
                alt40=1;
            }
            switch (alt40) {
                case 1 :
                    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:1265:7: otherlv_20= 'witnesses' ( (lv_witnesses_21_0= ruleWitness ) ) ( (lv_witnesses_22_0= ruleWitness ) )*
                    {
                    otherlv_20=(Token)match(input,43,FollowSets000.FOLLOW_43_in_ruleevent2463); 

                        	newLeafNode(otherlv_20, grammarAccess.getEventAccess().getWitnessesKeyword_9_0());
                        
                    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:1269:1: ( (lv_witnesses_21_0= ruleWitness ) )
                    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:1270:1: (lv_witnesses_21_0= ruleWitness )
                    {
                    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:1270:1: (lv_witnesses_21_0= ruleWitness )
                    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:1271:3: lv_witnesses_21_0= ruleWitness
                    {
                     
                    	        newCompositeNode(grammarAccess.getEventAccess().getWitnessesWitnessParserRuleCall_9_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleWitness_in_ruleevent2484);
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

                    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:1287:2: ( (lv_witnesses_22_0= ruleWitness ) )*
                    loop39:
                    do {
                        int alt39=2;
                        int LA39_0 = input.LA(1);

                        if ( (LA39_0==48||LA39_0==57) ) {
                            alt39=1;
                        }


                        switch (alt39) {
                    	case 1 :
                    	    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:1288:1: (lv_witnesses_22_0= ruleWitness )
                    	    {
                    	    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:1288:1: (lv_witnesses_22_0= ruleWitness )
                    	    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:1289:3: lv_witnesses_22_0= ruleWitness
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getEventAccess().getWitnessesWitnessParserRuleCall_9_2_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleWitness_in_ruleevent2505);
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
                    	    break loop39;
                        }
                    } while (true);


                    }
                    break;

            }

            // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:1305:5: (otherlv_23= 'then' ( (lv_actions_24_0= ruleAction ) ) ( (lv_actions_25_0= ruleAction ) )* )?
            int alt42=2;
            int LA42_0 = input.LA(1);

            if ( (LA42_0==44) ) {
                alt42=1;
            }
            switch (alt42) {
                case 1 :
                    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:1305:7: otherlv_23= 'then' ( (lv_actions_24_0= ruleAction ) ) ( (lv_actions_25_0= ruleAction ) )*
                    {
                    otherlv_23=(Token)match(input,44,FollowSets000.FOLLOW_44_in_ruleevent2521); 

                        	newLeafNode(otherlv_23, grammarAccess.getEventAccess().getThenKeyword_10_0());
                        
                    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:1309:1: ( (lv_actions_24_0= ruleAction ) )
                    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:1310:1: (lv_actions_24_0= ruleAction )
                    {
                    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:1310:1: (lv_actions_24_0= ruleAction )
                    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:1311:3: lv_actions_24_0= ruleAction
                    {
                     
                    	        newCompositeNode(grammarAccess.getEventAccess().getActionsActionParserRuleCall_10_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleAction_in_ruleevent2542);
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

                    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:1327:2: ( (lv_actions_25_0= ruleAction ) )*
                    loop41:
                    do {
                        int alt41=2;
                        int LA41_0 = input.LA(1);

                        if ( (LA41_0==34) ) {
                            alt41=1;
                        }


                        switch (alt41) {
                    	case 1 :
                    	    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:1328:1: (lv_actions_25_0= ruleAction )
                    	    {
                    	    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:1328:1: (lv_actions_25_0= ruleAction )
                    	    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:1329:3: lv_actions_25_0= ruleAction
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getEventAccess().getActionsActionParserRuleCall_10_2_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleAction_in_ruleevent2563);
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
                    	    break loop41;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_26=(Token)match(input,45,FollowSets000.FOLLOW_45_in_ruleevent2578); 

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


    // $ANTLR start "entryRuleStringToStringMapEntry"
    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:1357:1: entryRuleStringToStringMapEntry returns [EObject current=null] : iv_ruleStringToStringMapEntry= ruleStringToStringMapEntry EOF ;
    public final EObject entryRuleStringToStringMapEntry() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStringToStringMapEntry = null;


        try {
            // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:1358:2: (iv_ruleStringToStringMapEntry= ruleStringToStringMapEntry EOF )
            // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:1359:2: iv_ruleStringToStringMapEntry= ruleStringToStringMapEntry EOF
            {
             newCompositeNode(grammarAccess.getStringToStringMapEntryRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleStringToStringMapEntry_in_entryRuleStringToStringMapEntry2614);
            iv_ruleStringToStringMapEntry=ruleStringToStringMapEntry();

            state._fsp--;

             current =iv_ruleStringToStringMapEntry; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleStringToStringMapEntry2624); 

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
    // $ANTLR end "entryRuleStringToStringMapEntry"


    // $ANTLR start "ruleStringToStringMapEntry"
    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:1366:1: ruleStringToStringMapEntry returns [EObject current=null] : ( () otherlv_1= 'StringToStringMapEntry' otherlv_2= '{' (otherlv_3= 'key' ( (lv_key_4_0= ruleEString ) ) )? (otherlv_5= 'value' ( (lv_value_6_0= ruleEString ) ) )? otherlv_7= '}' ) ;
    public final EObject ruleStringToStringMapEntry() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        AntlrDatatypeRuleToken lv_key_4_0 = null;

        AntlrDatatypeRuleToken lv_value_6_0 = null;


         enterRule(); 
            
        try {
            // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:1369:28: ( ( () otherlv_1= 'StringToStringMapEntry' otherlv_2= '{' (otherlv_3= 'key' ( (lv_key_4_0= ruleEString ) ) )? (otherlv_5= 'value' ( (lv_value_6_0= ruleEString ) ) )? otherlv_7= '}' ) )
            // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:1370:1: ( () otherlv_1= 'StringToStringMapEntry' otherlv_2= '{' (otherlv_3= 'key' ( (lv_key_4_0= ruleEString ) ) )? (otherlv_5= 'value' ( (lv_value_6_0= ruleEString ) ) )? otherlv_7= '}' )
            {
            // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:1370:1: ( () otherlv_1= 'StringToStringMapEntry' otherlv_2= '{' (otherlv_3= 'key' ( (lv_key_4_0= ruleEString ) ) )? (otherlv_5= 'value' ( (lv_value_6_0= ruleEString ) ) )? otherlv_7= '}' )
            // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:1370:2: () otherlv_1= 'StringToStringMapEntry' otherlv_2= '{' (otherlv_3= 'key' ( (lv_key_4_0= ruleEString ) ) )? (otherlv_5= 'value' ( (lv_value_6_0= ruleEString ) ) )? otherlv_7= '}'
            {
            // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:1370:2: ()
            // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:1371:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getStringToStringMapEntryAccess().getStringToStringMapEntryAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,46,FollowSets000.FOLLOW_46_in_ruleStringToStringMapEntry2670); 

                	newLeafNode(otherlv_1, grammarAccess.getStringToStringMapEntryAccess().getStringToStringMapEntryKeyword_1());
                
            otherlv_2=(Token)match(input,24,FollowSets000.FOLLOW_24_in_ruleStringToStringMapEntry2682); 

                	newLeafNode(otherlv_2, grammarAccess.getStringToStringMapEntryAccess().getLeftCurlyBracketKeyword_2());
                
            // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:1384:1: (otherlv_3= 'key' ( (lv_key_4_0= ruleEString ) ) )?
            int alt43=2;
            int LA43_0 = input.LA(1);

            if ( (LA43_0==32) ) {
                alt43=1;
            }
            switch (alt43) {
                case 1 :
                    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:1384:3: otherlv_3= 'key' ( (lv_key_4_0= ruleEString ) )
                    {
                    otherlv_3=(Token)match(input,32,FollowSets000.FOLLOW_32_in_ruleStringToStringMapEntry2695); 

                        	newLeafNode(otherlv_3, grammarAccess.getStringToStringMapEntryAccess().getKeyKeyword_3_0());
                        
                    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:1388:1: ( (lv_key_4_0= ruleEString ) )
                    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:1389:1: (lv_key_4_0= ruleEString )
                    {
                    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:1389:1: (lv_key_4_0= ruleEString )
                    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:1390:3: lv_key_4_0= ruleEString
                    {
                     
                    	        newCompositeNode(grammarAccess.getStringToStringMapEntryAccess().getKeyEStringParserRuleCall_3_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleStringToStringMapEntry2716);
                    lv_key_4_0=ruleEString();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getStringToStringMapEntryRule());
                    	        }
                           		set(
                           			current, 
                           			"key",
                            		lv_key_4_0, 
                            		"EString");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:1406:4: (otherlv_5= 'value' ( (lv_value_6_0= ruleEString ) ) )?
            int alt44=2;
            int LA44_0 = input.LA(1);

            if ( (LA44_0==33) ) {
                alt44=1;
            }
            switch (alt44) {
                case 1 :
                    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:1406:6: otherlv_5= 'value' ( (lv_value_6_0= ruleEString ) )
                    {
                    otherlv_5=(Token)match(input,33,FollowSets000.FOLLOW_33_in_ruleStringToStringMapEntry2731); 

                        	newLeafNode(otherlv_5, grammarAccess.getStringToStringMapEntryAccess().getValueKeyword_4_0());
                        
                    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:1410:1: ( (lv_value_6_0= ruleEString ) )
                    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:1411:1: (lv_value_6_0= ruleEString )
                    {
                    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:1411:1: (lv_value_6_0= ruleEString )
                    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:1412:3: lv_value_6_0= ruleEString
                    {
                     
                    	        newCompositeNode(grammarAccess.getStringToStringMapEntryAccess().getValueEStringParserRuleCall_4_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleStringToStringMapEntry2752);
                    lv_value_6_0=ruleEString();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getStringToStringMapEntryRule());
                    	        }
                           		set(
                           			current, 
                           			"value",
                            		lv_value_6_0, 
                            		"EString");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            otherlv_7=(Token)match(input,28,FollowSets000.FOLLOW_28_in_ruleStringToStringMapEntry2766); 

                	newLeafNode(otherlv_7, grammarAccess.getStringToStringMapEntryAccess().getRightCurlyBracketKeyword_5());
                

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
    // $ANTLR end "ruleStringToStringMapEntry"


    // $ANTLR start "entryRuleEObject"
    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:1440:1: entryRuleEObject returns [EObject current=null] : iv_ruleEObject= ruleEObject EOF ;
    public final EObject entryRuleEObject() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEObject = null;


        try {
            // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:1441:2: (iv_ruleEObject= ruleEObject EOF )
            // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:1442:2: iv_ruleEObject= ruleEObject EOF
            {
             newCompositeNode(grammarAccess.getEObjectRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleEObject_in_entryRuleEObject2802);
            iv_ruleEObject=ruleEObject();

            state._fsp--;

             current =iv_ruleEObject; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleEObject2812); 

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
    // $ANTLR end "entryRuleEObject"


    // $ANTLR start "ruleEObject"
    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:1449:1: ruleEObject returns [EObject current=null] : ( () otherlv_1= 'EObject' ) ;
    public final EObject ruleEObject() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:1452:28: ( ( () otherlv_1= 'EObject' ) )
            // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:1453:1: ( () otherlv_1= 'EObject' )
            {
            // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:1453:1: ( () otherlv_1= 'EObject' )
            // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:1453:2: () otherlv_1= 'EObject'
            {
            // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:1453:2: ()
            // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:1454:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getEObjectAccess().getEObjectAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,47,FollowSets000.FOLLOW_47_in_ruleEObject2858); 

                	newLeafNode(otherlv_1, grammarAccess.getEObjectAccess().getEObjectKeyword_1());
                

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
    // $ANTLR end "ruleEObject"


    // $ANTLR start "entryRuleExtension"
    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:1471:1: entryRuleExtension returns [EObject current=null] : iv_ruleExtension= ruleExtension EOF ;
    public final EObject entryRuleExtension() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExtension = null;


        try {
            // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:1472:2: (iv_ruleExtension= ruleExtension EOF )
            // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:1473:2: iv_ruleExtension= ruleExtension EOF
            {
             newCompositeNode(grammarAccess.getExtensionRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleExtension_in_entryRuleExtension2894);
            iv_ruleExtension=ruleExtension();

            state._fsp--;

             current =iv_ruleExtension; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleExtension2904); 

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
    // $ANTLR end "entryRuleExtension"


    // $ANTLR start "ruleExtension"
    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:1480:1: ruleExtension returns [EObject current=null] : ( ( (lv_localGenerated_0_0= 'localGenerated' ) )? otherlv_1= 'Extension' (otherlv_2= 'internalId' ( (lv_internalId_3_0= ruleEString ) ) )? otherlv_4= 'extensionId' ( (lv_extensionId_5_0= ruleEString ) ) (otherlv_6= 'annotations' otherlv_7= '{' ( (lv_annotations_8_0= ruleAnnotation ) ) (otherlv_9= ',' ( (lv_annotations_10_0= ruleAnnotation ) ) )* otherlv_11= '}' )? (otherlv_12= 'extensions' otherlv_13= '{' ( (lv_extensions_14_0= ruleAbstractExtension ) ) (otherlv_15= ',' ( (lv_extensions_16_0= ruleAbstractExtension ) ) )* otherlv_17= '}' )? (otherlv_18= 'attributes' otherlv_19= '{' ( (lv_attributes_20_0= ruleStringToAttributeMapEntry ) ) (otherlv_21= ',' ( (lv_attributes_22_0= ruleStringToAttributeMapEntry ) ) )* otherlv_23= '}' )? ) ;
    public final EObject ruleExtension() throws RecognitionException {
        EObject current = null;

        Token lv_localGenerated_0_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        Token otherlv_13=null;
        Token otherlv_15=null;
        Token otherlv_17=null;
        Token otherlv_18=null;
        Token otherlv_19=null;
        Token otherlv_21=null;
        Token otherlv_23=null;
        AntlrDatatypeRuleToken lv_internalId_3_0 = null;

        AntlrDatatypeRuleToken lv_extensionId_5_0 = null;

        EObject lv_annotations_8_0 = null;

        EObject lv_annotations_10_0 = null;

        EObject lv_extensions_14_0 = null;

        EObject lv_extensions_16_0 = null;

        EObject lv_attributes_20_0 = null;

        EObject lv_attributes_22_0 = null;


         enterRule(); 
            
        try {
            // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:1483:28: ( ( ( (lv_localGenerated_0_0= 'localGenerated' ) )? otherlv_1= 'Extension' (otherlv_2= 'internalId' ( (lv_internalId_3_0= ruleEString ) ) )? otherlv_4= 'extensionId' ( (lv_extensionId_5_0= ruleEString ) ) (otherlv_6= 'annotations' otherlv_7= '{' ( (lv_annotations_8_0= ruleAnnotation ) ) (otherlv_9= ',' ( (lv_annotations_10_0= ruleAnnotation ) ) )* otherlv_11= '}' )? (otherlv_12= 'extensions' otherlv_13= '{' ( (lv_extensions_14_0= ruleAbstractExtension ) ) (otherlv_15= ',' ( (lv_extensions_16_0= ruleAbstractExtension ) ) )* otherlv_17= '}' )? (otherlv_18= 'attributes' otherlv_19= '{' ( (lv_attributes_20_0= ruleStringToAttributeMapEntry ) ) (otherlv_21= ',' ( (lv_attributes_22_0= ruleStringToAttributeMapEntry ) ) )* otherlv_23= '}' )? ) )
            // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:1484:1: ( ( (lv_localGenerated_0_0= 'localGenerated' ) )? otherlv_1= 'Extension' (otherlv_2= 'internalId' ( (lv_internalId_3_0= ruleEString ) ) )? otherlv_4= 'extensionId' ( (lv_extensionId_5_0= ruleEString ) ) (otherlv_6= 'annotations' otherlv_7= '{' ( (lv_annotations_8_0= ruleAnnotation ) ) (otherlv_9= ',' ( (lv_annotations_10_0= ruleAnnotation ) ) )* otherlv_11= '}' )? (otherlv_12= 'extensions' otherlv_13= '{' ( (lv_extensions_14_0= ruleAbstractExtension ) ) (otherlv_15= ',' ( (lv_extensions_16_0= ruleAbstractExtension ) ) )* otherlv_17= '}' )? (otherlv_18= 'attributes' otherlv_19= '{' ( (lv_attributes_20_0= ruleStringToAttributeMapEntry ) ) (otherlv_21= ',' ( (lv_attributes_22_0= ruleStringToAttributeMapEntry ) ) )* otherlv_23= '}' )? )
            {
            // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:1484:1: ( ( (lv_localGenerated_0_0= 'localGenerated' ) )? otherlv_1= 'Extension' (otherlv_2= 'internalId' ( (lv_internalId_3_0= ruleEString ) ) )? otherlv_4= 'extensionId' ( (lv_extensionId_5_0= ruleEString ) ) (otherlv_6= 'annotations' otherlv_7= '{' ( (lv_annotations_8_0= ruleAnnotation ) ) (otherlv_9= ',' ( (lv_annotations_10_0= ruleAnnotation ) ) )* otherlv_11= '}' )? (otherlv_12= 'extensions' otherlv_13= '{' ( (lv_extensions_14_0= ruleAbstractExtension ) ) (otherlv_15= ',' ( (lv_extensions_16_0= ruleAbstractExtension ) ) )* otherlv_17= '}' )? (otherlv_18= 'attributes' otherlv_19= '{' ( (lv_attributes_20_0= ruleStringToAttributeMapEntry ) ) (otherlv_21= ',' ( (lv_attributes_22_0= ruleStringToAttributeMapEntry ) ) )* otherlv_23= '}' )? )
            // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:1484:2: ( (lv_localGenerated_0_0= 'localGenerated' ) )? otherlv_1= 'Extension' (otherlv_2= 'internalId' ( (lv_internalId_3_0= ruleEString ) ) )? otherlv_4= 'extensionId' ( (lv_extensionId_5_0= ruleEString ) ) (otherlv_6= 'annotations' otherlv_7= '{' ( (lv_annotations_8_0= ruleAnnotation ) ) (otherlv_9= ',' ( (lv_annotations_10_0= ruleAnnotation ) ) )* otherlv_11= '}' )? (otherlv_12= 'extensions' otherlv_13= '{' ( (lv_extensions_14_0= ruleAbstractExtension ) ) (otherlv_15= ',' ( (lv_extensions_16_0= ruleAbstractExtension ) ) )* otherlv_17= '}' )? (otherlv_18= 'attributes' otherlv_19= '{' ( (lv_attributes_20_0= ruleStringToAttributeMapEntry ) ) (otherlv_21= ',' ( (lv_attributes_22_0= ruleStringToAttributeMapEntry ) ) )* otherlv_23= '}' )?
            {
            // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:1484:2: ( (lv_localGenerated_0_0= 'localGenerated' ) )?
            int alt45=2;
            int LA45_0 = input.LA(1);

            if ( (LA45_0==48) ) {
                alt45=1;
            }
            switch (alt45) {
                case 1 :
                    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:1485:1: (lv_localGenerated_0_0= 'localGenerated' )
                    {
                    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:1485:1: (lv_localGenerated_0_0= 'localGenerated' )
                    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:1486:3: lv_localGenerated_0_0= 'localGenerated'
                    {
                    lv_localGenerated_0_0=(Token)match(input,48,FollowSets000.FOLLOW_48_in_ruleExtension2947); 

                            newLeafNode(lv_localGenerated_0_0, grammarAccess.getExtensionAccess().getLocalGeneratedLocalGeneratedKeyword_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getExtensionRule());
                    	        }
                           		setWithLastConsumed(current, "localGenerated", true, "localGenerated");
                    	    

                    }


                    }
                    break;

            }

            otherlv_1=(Token)match(input,49,FollowSets000.FOLLOW_49_in_ruleExtension2973); 

                	newLeafNode(otherlv_1, grammarAccess.getExtensionAccess().getExtensionKeyword_1());
                
            // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:1503:1: (otherlv_2= 'internalId' ( (lv_internalId_3_0= ruleEString ) ) )?
            int alt46=2;
            int LA46_0 = input.LA(1);

            if ( (LA46_0==50) ) {
                alt46=1;
            }
            switch (alt46) {
                case 1 :
                    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:1503:3: otherlv_2= 'internalId' ( (lv_internalId_3_0= ruleEString ) )
                    {
                    otherlv_2=(Token)match(input,50,FollowSets000.FOLLOW_50_in_ruleExtension2986); 

                        	newLeafNode(otherlv_2, grammarAccess.getExtensionAccess().getInternalIdKeyword_2_0());
                        
                    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:1507:1: ( (lv_internalId_3_0= ruleEString ) )
                    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:1508:1: (lv_internalId_3_0= ruleEString )
                    {
                    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:1508:1: (lv_internalId_3_0= ruleEString )
                    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:1509:3: lv_internalId_3_0= ruleEString
                    {
                     
                    	        newCompositeNode(grammarAccess.getExtensionAccess().getInternalIdEStringParserRuleCall_2_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleExtension3007);
                    lv_internalId_3_0=ruleEString();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getExtensionRule());
                    	        }
                           		set(
                           			current, 
                           			"internalId",
                            		lv_internalId_3_0, 
                            		"EString");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            otherlv_4=(Token)match(input,51,FollowSets000.FOLLOW_51_in_ruleExtension3021); 

                	newLeafNode(otherlv_4, grammarAccess.getExtensionAccess().getExtensionIdKeyword_3());
                
            // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:1529:1: ( (lv_extensionId_5_0= ruleEString ) )
            // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:1530:1: (lv_extensionId_5_0= ruleEString )
            {
            // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:1530:1: (lv_extensionId_5_0= ruleEString )
            // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:1531:3: lv_extensionId_5_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getExtensionAccess().getExtensionIdEStringParserRuleCall_4_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleExtension3042);
            lv_extensionId_5_0=ruleEString();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getExtensionRule());
            	        }
                   		set(
                   			current, 
                   			"extensionId",
                    		lv_extensionId_5_0, 
                    		"EString");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:1547:2: (otherlv_6= 'annotations' otherlv_7= '{' ( (lv_annotations_8_0= ruleAnnotation ) ) (otherlv_9= ',' ( (lv_annotations_10_0= ruleAnnotation ) ) )* otherlv_11= '}' )?
            int alt48=2;
            int LA48_0 = input.LA(1);

            if ( (LA48_0==27) ) {
                alt48=1;
            }
            switch (alt48) {
                case 1 :
                    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:1547:4: otherlv_6= 'annotations' otherlv_7= '{' ( (lv_annotations_8_0= ruleAnnotation ) ) (otherlv_9= ',' ( (lv_annotations_10_0= ruleAnnotation ) ) )* otherlv_11= '}'
                    {
                    otherlv_6=(Token)match(input,27,FollowSets000.FOLLOW_27_in_ruleExtension3055); 

                        	newLeafNode(otherlv_6, grammarAccess.getExtensionAccess().getAnnotationsKeyword_5_0());
                        
                    otherlv_7=(Token)match(input,24,FollowSets000.FOLLOW_24_in_ruleExtension3067); 

                        	newLeafNode(otherlv_7, grammarAccess.getExtensionAccess().getLeftCurlyBracketKeyword_5_1());
                        
                    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:1555:1: ( (lv_annotations_8_0= ruleAnnotation ) )
                    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:1556:1: (lv_annotations_8_0= ruleAnnotation )
                    {
                    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:1556:1: (lv_annotations_8_0= ruleAnnotation )
                    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:1557:3: lv_annotations_8_0= ruleAnnotation
                    {
                     
                    	        newCompositeNode(grammarAccess.getExtensionAccess().getAnnotationsAnnotationParserRuleCall_5_2_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleAnnotation_in_ruleExtension3088);
                    lv_annotations_8_0=ruleAnnotation();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getExtensionRule());
                    	        }
                           		add(
                           			current, 
                           			"annotations",
                            		lv_annotations_8_0, 
                            		"Annotation");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:1573:2: (otherlv_9= ',' ( (lv_annotations_10_0= ruleAnnotation ) ) )*
                    loop47:
                    do {
                        int alt47=2;
                        int LA47_0 = input.LA(1);

                        if ( (LA47_0==14) ) {
                            alt47=1;
                        }


                        switch (alt47) {
                    	case 1 :
                    	    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:1573:4: otherlv_9= ',' ( (lv_annotations_10_0= ruleAnnotation ) )
                    	    {
                    	    otherlv_9=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleExtension3101); 

                    	        	newLeafNode(otherlv_9, grammarAccess.getExtensionAccess().getCommaKeyword_5_3_0());
                    	        
                    	    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:1577:1: ( (lv_annotations_10_0= ruleAnnotation ) )
                    	    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:1578:1: (lv_annotations_10_0= ruleAnnotation )
                    	    {
                    	    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:1578:1: (lv_annotations_10_0= ruleAnnotation )
                    	    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:1579:3: lv_annotations_10_0= ruleAnnotation
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getExtensionAccess().getAnnotationsAnnotationParserRuleCall_5_3_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleAnnotation_in_ruleExtension3122);
                    	    lv_annotations_10_0=ruleAnnotation();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getExtensionRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"annotations",
                    	            		lv_annotations_10_0, 
                    	            		"Annotation");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop47;
                        }
                    } while (true);

                    otherlv_11=(Token)match(input,28,FollowSets000.FOLLOW_28_in_ruleExtension3136); 

                        	newLeafNode(otherlv_11, grammarAccess.getExtensionAccess().getRightCurlyBracketKeyword_5_4());
                        

                    }
                    break;

            }

            // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:1599:3: (otherlv_12= 'extensions' otherlv_13= '{' ( (lv_extensions_14_0= ruleAbstractExtension ) ) (otherlv_15= ',' ( (lv_extensions_16_0= ruleAbstractExtension ) ) )* otherlv_17= '}' )?
            int alt50=2;
            int LA50_0 = input.LA(1);

            if ( (LA50_0==52) ) {
                alt50=1;
            }
            switch (alt50) {
                case 1 :
                    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:1599:5: otherlv_12= 'extensions' otherlv_13= '{' ( (lv_extensions_14_0= ruleAbstractExtension ) ) (otherlv_15= ',' ( (lv_extensions_16_0= ruleAbstractExtension ) ) )* otherlv_17= '}'
                    {
                    otherlv_12=(Token)match(input,52,FollowSets000.FOLLOW_52_in_ruleExtension3151); 

                        	newLeafNode(otherlv_12, grammarAccess.getExtensionAccess().getExtensionsKeyword_6_0());
                        
                    otherlv_13=(Token)match(input,24,FollowSets000.FOLLOW_24_in_ruleExtension3163); 

                        	newLeafNode(otherlv_13, grammarAccess.getExtensionAccess().getLeftCurlyBracketKeyword_6_1());
                        
                    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:1607:1: ( (lv_extensions_14_0= ruleAbstractExtension ) )
                    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:1608:1: (lv_extensions_14_0= ruleAbstractExtension )
                    {
                    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:1608:1: (lv_extensions_14_0= ruleAbstractExtension )
                    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:1609:3: lv_extensions_14_0= ruleAbstractExtension
                    {
                     
                    	        newCompositeNode(grammarAccess.getExtensionAccess().getExtensionsAbstractExtensionParserRuleCall_6_2_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleAbstractExtension_in_ruleExtension3184);
                    lv_extensions_14_0=ruleAbstractExtension();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getExtensionRule());
                    	        }
                           		add(
                           			current, 
                           			"extensions",
                            		lv_extensions_14_0, 
                            		"AbstractExtension");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:1625:2: (otherlv_15= ',' ( (lv_extensions_16_0= ruleAbstractExtension ) ) )*
                    loop49:
                    do {
                        int alt49=2;
                        int LA49_0 = input.LA(1);

                        if ( (LA49_0==14) ) {
                            alt49=1;
                        }


                        switch (alt49) {
                    	case 1 :
                    	    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:1625:4: otherlv_15= ',' ( (lv_extensions_16_0= ruleAbstractExtension ) )
                    	    {
                    	    otherlv_15=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleExtension3197); 

                    	        	newLeafNode(otherlv_15, grammarAccess.getExtensionAccess().getCommaKeyword_6_3_0());
                    	        
                    	    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:1629:1: ( (lv_extensions_16_0= ruleAbstractExtension ) )
                    	    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:1630:1: (lv_extensions_16_0= ruleAbstractExtension )
                    	    {
                    	    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:1630:1: (lv_extensions_16_0= ruleAbstractExtension )
                    	    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:1631:3: lv_extensions_16_0= ruleAbstractExtension
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getExtensionAccess().getExtensionsAbstractExtensionParserRuleCall_6_3_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleAbstractExtension_in_ruleExtension3218);
                    	    lv_extensions_16_0=ruleAbstractExtension();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getExtensionRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"extensions",
                    	            		lv_extensions_16_0, 
                    	            		"AbstractExtension");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop49;
                        }
                    } while (true);

                    otherlv_17=(Token)match(input,28,FollowSets000.FOLLOW_28_in_ruleExtension3232); 

                        	newLeafNode(otherlv_17, grammarAccess.getExtensionAccess().getRightCurlyBracketKeyword_6_4());
                        

                    }
                    break;

            }

            // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:1651:3: (otherlv_18= 'attributes' otherlv_19= '{' ( (lv_attributes_20_0= ruleStringToAttributeMapEntry ) ) (otherlv_21= ',' ( (lv_attributes_22_0= ruleStringToAttributeMapEntry ) ) )* otherlv_23= '}' )?
            int alt52=2;
            int LA52_0 = input.LA(1);

            if ( (LA52_0==53) ) {
                alt52=1;
            }
            switch (alt52) {
                case 1 :
                    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:1651:5: otherlv_18= 'attributes' otherlv_19= '{' ( (lv_attributes_20_0= ruleStringToAttributeMapEntry ) ) (otherlv_21= ',' ( (lv_attributes_22_0= ruleStringToAttributeMapEntry ) ) )* otherlv_23= '}'
                    {
                    otherlv_18=(Token)match(input,53,FollowSets000.FOLLOW_53_in_ruleExtension3247); 

                        	newLeafNode(otherlv_18, grammarAccess.getExtensionAccess().getAttributesKeyword_7_0());
                        
                    otherlv_19=(Token)match(input,24,FollowSets000.FOLLOW_24_in_ruleExtension3259); 

                        	newLeafNode(otherlv_19, grammarAccess.getExtensionAccess().getLeftCurlyBracketKeyword_7_1());
                        
                    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:1659:1: ( (lv_attributes_20_0= ruleStringToAttributeMapEntry ) )
                    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:1660:1: (lv_attributes_20_0= ruleStringToAttributeMapEntry )
                    {
                    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:1660:1: (lv_attributes_20_0= ruleStringToAttributeMapEntry )
                    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:1661:3: lv_attributes_20_0= ruleStringToAttributeMapEntry
                    {
                     
                    	        newCompositeNode(grammarAccess.getExtensionAccess().getAttributesStringToAttributeMapEntryParserRuleCall_7_2_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleStringToAttributeMapEntry_in_ruleExtension3280);
                    lv_attributes_20_0=ruleStringToAttributeMapEntry();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getExtensionRule());
                    	        }
                           		add(
                           			current, 
                           			"attributes",
                            		lv_attributes_20_0, 
                            		"StringToAttributeMapEntry");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:1677:2: (otherlv_21= ',' ( (lv_attributes_22_0= ruleStringToAttributeMapEntry ) ) )*
                    loop51:
                    do {
                        int alt51=2;
                        int LA51_0 = input.LA(1);

                        if ( (LA51_0==14) ) {
                            alt51=1;
                        }


                        switch (alt51) {
                    	case 1 :
                    	    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:1677:4: otherlv_21= ',' ( (lv_attributes_22_0= ruleStringToAttributeMapEntry ) )
                    	    {
                    	    otherlv_21=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleExtension3293); 

                    	        	newLeafNode(otherlv_21, grammarAccess.getExtensionAccess().getCommaKeyword_7_3_0());
                    	        
                    	    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:1681:1: ( (lv_attributes_22_0= ruleStringToAttributeMapEntry ) )
                    	    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:1682:1: (lv_attributes_22_0= ruleStringToAttributeMapEntry )
                    	    {
                    	    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:1682:1: (lv_attributes_22_0= ruleStringToAttributeMapEntry )
                    	    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:1683:3: lv_attributes_22_0= ruleStringToAttributeMapEntry
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getExtensionAccess().getAttributesStringToAttributeMapEntryParserRuleCall_7_3_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleStringToAttributeMapEntry_in_ruleExtension3314);
                    	    lv_attributes_22_0=ruleStringToAttributeMapEntry();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getExtensionRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"attributes",
                    	            		lv_attributes_22_0, 
                    	            		"StringToAttributeMapEntry");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop51;
                        }
                    } while (true);

                    otherlv_23=(Token)match(input,28,FollowSets000.FOLLOW_28_in_ruleExtension3328); 

                        	newLeafNode(otherlv_23, grammarAccess.getExtensionAccess().getRightCurlyBracketKeyword_7_4());
                        

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
    // $ANTLR end "ruleExtension"


    // $ANTLR start "entryRuleAttribute"
    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:1711:1: entryRuleAttribute returns [EObject current=null] : iv_ruleAttribute= ruleAttribute EOF ;
    public final EObject entryRuleAttribute() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAttribute = null;


        try {
            // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:1712:2: (iv_ruleAttribute= ruleAttribute EOF )
            // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:1713:2: iv_ruleAttribute= ruleAttribute EOF
            {
             newCompositeNode(grammarAccess.getAttributeRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleAttribute_in_entryRuleAttribute3366);
            iv_ruleAttribute=ruleAttribute();

            state._fsp--;

             current =iv_ruleAttribute; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleAttribute3376); 

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
    // $ANTLR end "entryRuleAttribute"


    // $ANTLR start "ruleAttribute"
    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:1720:1: ruleAttribute returns [EObject current=null] : (otherlv_0= 'Attribute' otherlv_1= 'type' ( (lv_type_2_0= ruleAttributeType ) ) otherlv_3= 'value' ( (lv_value_4_0= ruleEJavaObject ) ) (otherlv_5= 'annotations' otherlv_6= '{' ( (lv_annotations_7_0= ruleAnnotation ) ) (otherlv_8= ',' ( (lv_annotations_9_0= ruleAnnotation ) ) )* otherlv_10= '}' )? ) ;
    public final EObject ruleAttribute() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Enumerator lv_type_2_0 = null;

        AntlrDatatypeRuleToken lv_value_4_0 = null;

        EObject lv_annotations_7_0 = null;

        EObject lv_annotations_9_0 = null;


         enterRule(); 
            
        try {
            // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:1723:28: ( (otherlv_0= 'Attribute' otherlv_1= 'type' ( (lv_type_2_0= ruleAttributeType ) ) otherlv_3= 'value' ( (lv_value_4_0= ruleEJavaObject ) ) (otherlv_5= 'annotations' otherlv_6= '{' ( (lv_annotations_7_0= ruleAnnotation ) ) (otherlv_8= ',' ( (lv_annotations_9_0= ruleAnnotation ) ) )* otherlv_10= '}' )? ) )
            // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:1724:1: (otherlv_0= 'Attribute' otherlv_1= 'type' ( (lv_type_2_0= ruleAttributeType ) ) otherlv_3= 'value' ( (lv_value_4_0= ruleEJavaObject ) ) (otherlv_5= 'annotations' otherlv_6= '{' ( (lv_annotations_7_0= ruleAnnotation ) ) (otherlv_8= ',' ( (lv_annotations_9_0= ruleAnnotation ) ) )* otherlv_10= '}' )? )
            {
            // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:1724:1: (otherlv_0= 'Attribute' otherlv_1= 'type' ( (lv_type_2_0= ruleAttributeType ) ) otherlv_3= 'value' ( (lv_value_4_0= ruleEJavaObject ) ) (otherlv_5= 'annotations' otherlv_6= '{' ( (lv_annotations_7_0= ruleAnnotation ) ) (otherlv_8= ',' ( (lv_annotations_9_0= ruleAnnotation ) ) )* otherlv_10= '}' )? )
            // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:1724:3: otherlv_0= 'Attribute' otherlv_1= 'type' ( (lv_type_2_0= ruleAttributeType ) ) otherlv_3= 'value' ( (lv_value_4_0= ruleEJavaObject ) ) (otherlv_5= 'annotations' otherlv_6= '{' ( (lv_annotations_7_0= ruleAnnotation ) ) (otherlv_8= ',' ( (lv_annotations_9_0= ruleAnnotation ) ) )* otherlv_10= '}' )?
            {
            otherlv_0=(Token)match(input,54,FollowSets000.FOLLOW_54_in_ruleAttribute3413); 

                	newLeafNode(otherlv_0, grammarAccess.getAttributeAccess().getAttributeKeyword_0());
                
            otherlv_1=(Token)match(input,55,FollowSets000.FOLLOW_55_in_ruleAttribute3425); 

                	newLeafNode(otherlv_1, grammarAccess.getAttributeAccess().getTypeKeyword_1());
                
            // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:1732:1: ( (lv_type_2_0= ruleAttributeType ) )
            // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:1733:1: (lv_type_2_0= ruleAttributeType )
            {
            // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:1733:1: (lv_type_2_0= ruleAttributeType )
            // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:1734:3: lv_type_2_0= ruleAttributeType
            {
             
            	        newCompositeNode(grammarAccess.getAttributeAccess().getTypeAttributeTypeEnumRuleCall_2_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleAttributeType_in_ruleAttribute3446);
            lv_type_2_0=ruleAttributeType();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getAttributeRule());
            	        }
                   		set(
                   			current, 
                   			"type",
                    		lv_type_2_0, 
                    		"AttributeType");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_3=(Token)match(input,33,FollowSets000.FOLLOW_33_in_ruleAttribute3458); 

                	newLeafNode(otherlv_3, grammarAccess.getAttributeAccess().getValueKeyword_3());
                
            // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:1754:1: ( (lv_value_4_0= ruleEJavaObject ) )
            // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:1755:1: (lv_value_4_0= ruleEJavaObject )
            {
            // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:1755:1: (lv_value_4_0= ruleEJavaObject )
            // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:1756:3: lv_value_4_0= ruleEJavaObject
            {
             
            	        newCompositeNode(grammarAccess.getAttributeAccess().getValueEJavaObjectParserRuleCall_4_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEJavaObject_in_ruleAttribute3479);
            lv_value_4_0=ruleEJavaObject();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getAttributeRule());
            	        }
                   		set(
                   			current, 
                   			"value",
                    		lv_value_4_0, 
                    		"EJavaObject");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:1772:2: (otherlv_5= 'annotations' otherlv_6= '{' ( (lv_annotations_7_0= ruleAnnotation ) ) (otherlv_8= ',' ( (lv_annotations_9_0= ruleAnnotation ) ) )* otherlv_10= '}' )?
            int alt54=2;
            int LA54_0 = input.LA(1);

            if ( (LA54_0==27) ) {
                alt54=1;
            }
            switch (alt54) {
                case 1 :
                    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:1772:4: otherlv_5= 'annotations' otherlv_6= '{' ( (lv_annotations_7_0= ruleAnnotation ) ) (otherlv_8= ',' ( (lv_annotations_9_0= ruleAnnotation ) ) )* otherlv_10= '}'
                    {
                    otherlv_5=(Token)match(input,27,FollowSets000.FOLLOW_27_in_ruleAttribute3492); 

                        	newLeafNode(otherlv_5, grammarAccess.getAttributeAccess().getAnnotationsKeyword_5_0());
                        
                    otherlv_6=(Token)match(input,24,FollowSets000.FOLLOW_24_in_ruleAttribute3504); 

                        	newLeafNode(otherlv_6, grammarAccess.getAttributeAccess().getLeftCurlyBracketKeyword_5_1());
                        
                    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:1780:1: ( (lv_annotations_7_0= ruleAnnotation ) )
                    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:1781:1: (lv_annotations_7_0= ruleAnnotation )
                    {
                    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:1781:1: (lv_annotations_7_0= ruleAnnotation )
                    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:1782:3: lv_annotations_7_0= ruleAnnotation
                    {
                     
                    	        newCompositeNode(grammarAccess.getAttributeAccess().getAnnotationsAnnotationParserRuleCall_5_2_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleAnnotation_in_ruleAttribute3525);
                    lv_annotations_7_0=ruleAnnotation();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getAttributeRule());
                    	        }
                           		add(
                           			current, 
                           			"annotations",
                            		lv_annotations_7_0, 
                            		"Annotation");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:1798:2: (otherlv_8= ',' ( (lv_annotations_9_0= ruleAnnotation ) ) )*
                    loop53:
                    do {
                        int alt53=2;
                        int LA53_0 = input.LA(1);

                        if ( (LA53_0==14) ) {
                            alt53=1;
                        }


                        switch (alt53) {
                    	case 1 :
                    	    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:1798:4: otherlv_8= ',' ( (lv_annotations_9_0= ruleAnnotation ) )
                    	    {
                    	    otherlv_8=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleAttribute3538); 

                    	        	newLeafNode(otherlv_8, grammarAccess.getAttributeAccess().getCommaKeyword_5_3_0());
                    	        
                    	    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:1802:1: ( (lv_annotations_9_0= ruleAnnotation ) )
                    	    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:1803:1: (lv_annotations_9_0= ruleAnnotation )
                    	    {
                    	    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:1803:1: (lv_annotations_9_0= ruleAnnotation )
                    	    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:1804:3: lv_annotations_9_0= ruleAnnotation
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getAttributeAccess().getAnnotationsAnnotationParserRuleCall_5_3_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleAnnotation_in_ruleAttribute3559);
                    	    lv_annotations_9_0=ruleAnnotation();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getAttributeRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"annotations",
                    	            		lv_annotations_9_0, 
                    	            		"Annotation");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop53;
                        }
                    } while (true);

                    otherlv_10=(Token)match(input,28,FollowSets000.FOLLOW_28_in_ruleAttribute3573); 

                        	newLeafNode(otherlv_10, grammarAccess.getAttributeAccess().getRightCurlyBracketKeyword_5_4());
                        

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
    // $ANTLR end "ruleAttribute"


    // $ANTLR start "entryRuleEJavaObject"
    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:1832:1: entryRuleEJavaObject returns [String current=null] : iv_ruleEJavaObject= ruleEJavaObject EOF ;
    public final String entryRuleEJavaObject() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEJavaObject = null;


        try {
            // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:1833:2: (iv_ruleEJavaObject= ruleEJavaObject EOF )
            // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:1834:2: iv_ruleEJavaObject= ruleEJavaObject EOF
            {
             newCompositeNode(grammarAccess.getEJavaObjectRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleEJavaObject_in_entryRuleEJavaObject3612);
            iv_ruleEJavaObject=ruleEJavaObject();

            state._fsp--;

             current =iv_ruleEJavaObject.getText(); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleEJavaObject3623); 

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
    // $ANTLR end "entryRuleEJavaObject"


    // $ANTLR start "ruleEJavaObject"
    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:1841:1: ruleEJavaObject returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= 'EJavaObject' ;
    public final AntlrDatatypeRuleToken ruleEJavaObject() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:1844:28: (kw= 'EJavaObject' )
            // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:1846:2: kw= 'EJavaObject'
            {
            kw=(Token)match(input,56,FollowSets000.FOLLOW_56_in_ruleEJavaObject3660); 

                    current.merge(kw);
                    newLeafNode(kw, grammarAccess.getEJavaObjectAccess().getEJavaObjectKeyword()); 
                

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
    // $ANTLR end "ruleEJavaObject"


    // $ANTLR start "entryRuleParameter"
    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:1865:1: entryRuleParameter returns [EObject current=null] : iv_ruleParameter= ruleParameter EOF ;
    public final EObject entryRuleParameter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParameter = null;


        try {
            // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:1866:2: (iv_ruleParameter= ruleParameter EOF )
            // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:1867:2: iv_ruleParameter= ruleParameter EOF
            {
             newCompositeNode(grammarAccess.getParameterRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleParameter_in_entryRuleParameter3705);
            iv_ruleParameter=ruleParameter();

            state._fsp--;

             current =iv_ruleParameter; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleParameter3715); 

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
    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:1874:1: ruleParameter returns [EObject current=null] : ( () ( (lv_name_1_0= ruleEString ) ) (otherlv_2= '//' ( (lv_comment_3_0= ruleEString ) ) )? ) ;
    public final EObject ruleParameter() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        AntlrDatatypeRuleToken lv_comment_3_0 = null;


         enterRule(); 
            
        try {
            // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:1877:28: ( ( () ( (lv_name_1_0= ruleEString ) ) (otherlv_2= '//' ( (lv_comment_3_0= ruleEString ) ) )? ) )
            // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:1878:1: ( () ( (lv_name_1_0= ruleEString ) ) (otherlv_2= '//' ( (lv_comment_3_0= ruleEString ) ) )? )
            {
            // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:1878:1: ( () ( (lv_name_1_0= ruleEString ) ) (otherlv_2= '//' ( (lv_comment_3_0= ruleEString ) ) )? )
            // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:1878:2: () ( (lv_name_1_0= ruleEString ) ) (otherlv_2= '//' ( (lv_comment_3_0= ruleEString ) ) )?
            {
            // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:1878:2: ()
            // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:1879:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getParameterAccess().getParameterAction_0(),
                        current);
                

            }

            // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:1884:2: ( (lv_name_1_0= ruleEString ) )
            // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:1885:1: (lv_name_1_0= ruleEString )
            {
            // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:1885:1: (lv_name_1_0= ruleEString )
            // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:1886:3: lv_name_1_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getParameterAccess().getNameEStringParserRuleCall_1_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleParameter3770);
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

            // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:1902:2: (otherlv_2= '//' ( (lv_comment_3_0= ruleEString ) ) )?
            int alt55=2;
            int LA55_0 = input.LA(1);

            if ( (LA55_0==12) ) {
                alt55=1;
            }
            switch (alt55) {
                case 1 :
                    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:1902:4: otherlv_2= '//' ( (lv_comment_3_0= ruleEString ) )
                    {
                    otherlv_2=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleParameter3783); 

                        	newLeafNode(otherlv_2, grammarAccess.getParameterAccess().getSolidusSolidusKeyword_2_0());
                        
                    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:1906:1: ( (lv_comment_3_0= ruleEString ) )
                    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:1907:1: (lv_comment_3_0= ruleEString )
                    {
                    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:1907:1: (lv_comment_3_0= ruleEString )
                    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:1908:3: lv_comment_3_0= ruleEString
                    {
                     
                    	        newCompositeNode(grammarAccess.getParameterAccess().getCommentEStringParserRuleCall_2_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleParameter3804);
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
    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:1932:1: entryRuleGuard returns [EObject current=null] : iv_ruleGuard= ruleGuard EOF ;
    public final EObject entryRuleGuard() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGuard = null;


        try {
            // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:1933:2: (iv_ruleGuard= ruleGuard EOF )
            // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:1934:2: iv_ruleGuard= ruleGuard EOF
            {
             newCompositeNode(grammarAccess.getGuardRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleGuard_in_entryRuleGuard3842);
            iv_ruleGuard=ruleGuard();

            state._fsp--;

             current =iv_ruleGuard; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleGuard3852); 

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
    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:1941:1: ruleGuard returns [EObject current=null] : (otherlv_0= '@' ( (lv_name_1_0= ruleEString ) ) ( (lv_theorem_2_0= 'theorem' ) )? ( (lv_predicate_3_0= ruleEString ) ) (otherlv_4= '//' ( (lv_comment_5_0= ruleEString ) ) )? ) ;
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
            // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:1944:28: ( (otherlv_0= '@' ( (lv_name_1_0= ruleEString ) ) ( (lv_theorem_2_0= 'theorem' ) )? ( (lv_predicate_3_0= ruleEString ) ) (otherlv_4= '//' ( (lv_comment_5_0= ruleEString ) ) )? ) )
            // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:1945:1: (otherlv_0= '@' ( (lv_name_1_0= ruleEString ) ) ( (lv_theorem_2_0= 'theorem' ) )? ( (lv_predicate_3_0= ruleEString ) ) (otherlv_4= '//' ( (lv_comment_5_0= ruleEString ) ) )? )
            {
            // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:1945:1: (otherlv_0= '@' ( (lv_name_1_0= ruleEString ) ) ( (lv_theorem_2_0= 'theorem' ) )? ( (lv_predicate_3_0= ruleEString ) ) (otherlv_4= '//' ( (lv_comment_5_0= ruleEString ) ) )? )
            // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:1945:3: otherlv_0= '@' ( (lv_name_1_0= ruleEString ) ) ( (lv_theorem_2_0= 'theorem' ) )? ( (lv_predicate_3_0= ruleEString ) ) (otherlv_4= '//' ( (lv_comment_5_0= ruleEString ) ) )?
            {
            otherlv_0=(Token)match(input,34,FollowSets000.FOLLOW_34_in_ruleGuard3889); 

                	newLeafNode(otherlv_0, grammarAccess.getGuardAccess().getCommercialAtKeyword_0());
                
            // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:1949:1: ( (lv_name_1_0= ruleEString ) )
            // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:1950:1: (lv_name_1_0= ruleEString )
            {
            // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:1950:1: (lv_name_1_0= ruleEString )
            // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:1951:3: lv_name_1_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getGuardAccess().getNameEStringParserRuleCall_1_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleGuard3910);
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

            // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:1967:2: ( (lv_theorem_2_0= 'theorem' ) )?
            int alt56=2;
            int LA56_0 = input.LA(1);

            if ( (LA56_0==35) ) {
                alt56=1;
            }
            switch (alt56) {
                case 1 :
                    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:1968:1: (lv_theorem_2_0= 'theorem' )
                    {
                    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:1968:1: (lv_theorem_2_0= 'theorem' )
                    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:1969:3: lv_theorem_2_0= 'theorem'
                    {
                    lv_theorem_2_0=(Token)match(input,35,FollowSets000.FOLLOW_35_in_ruleGuard3928); 

                            newLeafNode(lv_theorem_2_0, grammarAccess.getGuardAccess().getTheoremTheoremKeyword_2_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getGuardRule());
                    	        }
                           		setWithLastConsumed(current, "theorem", true, "theorem");
                    	    

                    }


                    }
                    break;

            }

            // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:1982:3: ( (lv_predicate_3_0= ruleEString ) )
            // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:1983:1: (lv_predicate_3_0= ruleEString )
            {
            // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:1983:1: (lv_predicate_3_0= ruleEString )
            // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:1984:3: lv_predicate_3_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getGuardAccess().getPredicateEStringParserRuleCall_3_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleGuard3963);
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

            // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:2000:2: (otherlv_4= '//' ( (lv_comment_5_0= ruleEString ) ) )?
            int alt57=2;
            int LA57_0 = input.LA(1);

            if ( (LA57_0==12) ) {
                alt57=1;
            }
            switch (alt57) {
                case 1 :
                    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:2000:4: otherlv_4= '//' ( (lv_comment_5_0= ruleEString ) )
                    {
                    otherlv_4=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleGuard3976); 

                        	newLeafNode(otherlv_4, grammarAccess.getGuardAccess().getSolidusSolidusKeyword_4_0());
                        
                    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:2004:1: ( (lv_comment_5_0= ruleEString ) )
                    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:2005:1: (lv_comment_5_0= ruleEString )
                    {
                    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:2005:1: (lv_comment_5_0= ruleEString )
                    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:2006:3: lv_comment_5_0= ruleEString
                    {
                     
                    	        newCompositeNode(grammarAccess.getGuardAccess().getCommentEStringParserRuleCall_4_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleGuard3997);
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
    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:2030:1: entryRuleWitness returns [EObject current=null] : iv_ruleWitness= ruleWitness EOF ;
    public final EObject entryRuleWitness() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleWitness = null;


        try {
            // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:2031:2: (iv_ruleWitness= ruleWitness EOF )
            // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:2032:2: iv_ruleWitness= ruleWitness EOF
            {
             newCompositeNode(grammarAccess.getWitnessRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleWitness_in_entryRuleWitness4035);
            iv_ruleWitness=ruleWitness();

            state._fsp--;

             current =iv_ruleWitness; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleWitness4045); 

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
    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:2039:1: ruleWitness returns [EObject current=null] : ( ( (lv_localGenerated_0_0= 'localGenerated' ) )? otherlv_1= 'Witness' otherlv_2= '@' ( (lv_name_3_0= ruleEString ) ) otherlv_4= 'predicate' ( (lv_predicate_5_0= ruleEString ) )? (otherlv_6= '//' ( (lv_comment_7_0= ruleEString ) ) )? ) ;
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
            // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:2042:28: ( ( ( (lv_localGenerated_0_0= 'localGenerated' ) )? otherlv_1= 'Witness' otherlv_2= '@' ( (lv_name_3_0= ruleEString ) ) otherlv_4= 'predicate' ( (lv_predicate_5_0= ruleEString ) )? (otherlv_6= '//' ( (lv_comment_7_0= ruleEString ) ) )? ) )
            // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:2043:1: ( ( (lv_localGenerated_0_0= 'localGenerated' ) )? otherlv_1= 'Witness' otherlv_2= '@' ( (lv_name_3_0= ruleEString ) ) otherlv_4= 'predicate' ( (lv_predicate_5_0= ruleEString ) )? (otherlv_6= '//' ( (lv_comment_7_0= ruleEString ) ) )? )
            {
            // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:2043:1: ( ( (lv_localGenerated_0_0= 'localGenerated' ) )? otherlv_1= 'Witness' otherlv_2= '@' ( (lv_name_3_0= ruleEString ) ) otherlv_4= 'predicate' ( (lv_predicate_5_0= ruleEString ) )? (otherlv_6= '//' ( (lv_comment_7_0= ruleEString ) ) )? )
            // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:2043:2: ( (lv_localGenerated_0_0= 'localGenerated' ) )? otherlv_1= 'Witness' otherlv_2= '@' ( (lv_name_3_0= ruleEString ) ) otherlv_4= 'predicate' ( (lv_predicate_5_0= ruleEString ) )? (otherlv_6= '//' ( (lv_comment_7_0= ruleEString ) ) )?
            {
            // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:2043:2: ( (lv_localGenerated_0_0= 'localGenerated' ) )?
            int alt58=2;
            int LA58_0 = input.LA(1);

            if ( (LA58_0==48) ) {
                alt58=1;
            }
            switch (alt58) {
                case 1 :
                    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:2044:1: (lv_localGenerated_0_0= 'localGenerated' )
                    {
                    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:2044:1: (lv_localGenerated_0_0= 'localGenerated' )
                    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:2045:3: lv_localGenerated_0_0= 'localGenerated'
                    {
                    lv_localGenerated_0_0=(Token)match(input,48,FollowSets000.FOLLOW_48_in_ruleWitness4088); 

                            newLeafNode(lv_localGenerated_0_0, grammarAccess.getWitnessAccess().getLocalGeneratedLocalGeneratedKeyword_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getWitnessRule());
                    	        }
                           		setWithLastConsumed(current, "localGenerated", true, "localGenerated");
                    	    

                    }


                    }
                    break;

            }

            otherlv_1=(Token)match(input,57,FollowSets000.FOLLOW_57_in_ruleWitness4114); 

                	newLeafNode(otherlv_1, grammarAccess.getWitnessAccess().getWitnessKeyword_1());
                
            otherlv_2=(Token)match(input,34,FollowSets000.FOLLOW_34_in_ruleWitness4126); 

                	newLeafNode(otherlv_2, grammarAccess.getWitnessAccess().getCommercialAtKeyword_2());
                
            // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:2066:1: ( (lv_name_3_0= ruleEString ) )
            // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:2067:1: (lv_name_3_0= ruleEString )
            {
            // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:2067:1: (lv_name_3_0= ruleEString )
            // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:2068:3: lv_name_3_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getWitnessAccess().getNameEStringParserRuleCall_3_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleWitness4147);
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

            otherlv_4=(Token)match(input,58,FollowSets000.FOLLOW_58_in_ruleWitness4159); 

                	newLeafNode(otherlv_4, grammarAccess.getWitnessAccess().getPredicateKeyword_4());
                
            // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:2088:1: ( (lv_predicate_5_0= ruleEString ) )?
            int alt59=2;
            int LA59_0 = input.LA(1);

            if ( ((LA59_0>=RULE_STRING && LA59_0<=RULE_ID)) ) {
                alt59=1;
            }
            switch (alt59) {
                case 1 :
                    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:2089:1: (lv_predicate_5_0= ruleEString )
                    {
                    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:2089:1: (lv_predicate_5_0= ruleEString )
                    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:2090:3: lv_predicate_5_0= ruleEString
                    {
                     
                    	        newCompositeNode(grammarAccess.getWitnessAccess().getPredicateEStringParserRuleCall_5_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleWitness4180);
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

            // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:2106:3: (otherlv_6= '//' ( (lv_comment_7_0= ruleEString ) ) )?
            int alt60=2;
            int LA60_0 = input.LA(1);

            if ( (LA60_0==12) ) {
                alt60=1;
            }
            switch (alt60) {
                case 1 :
                    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:2106:5: otherlv_6= '//' ( (lv_comment_7_0= ruleEString ) )
                    {
                    otherlv_6=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleWitness4194); 

                        	newLeafNode(otherlv_6, grammarAccess.getWitnessAccess().getSolidusSolidusKeyword_6_0());
                        
                    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:2110:1: ( (lv_comment_7_0= ruleEString ) )
                    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:2111:1: (lv_comment_7_0= ruleEString )
                    {
                    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:2111:1: (lv_comment_7_0= ruleEString )
                    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:2112:3: lv_comment_7_0= ruleEString
                    {
                     
                    	        newCompositeNode(grammarAccess.getWitnessAccess().getCommentEStringParserRuleCall_6_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleWitness4215);
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
    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:2136:1: entryRuleAction returns [EObject current=null] : iv_ruleAction= ruleAction EOF ;
    public final EObject entryRuleAction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAction = null;


        try {
            // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:2137:2: (iv_ruleAction= ruleAction EOF )
            // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:2138:2: iv_ruleAction= ruleAction EOF
            {
             newCompositeNode(grammarAccess.getActionRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleAction_in_entryRuleAction4253);
            iv_ruleAction=ruleAction();

            state._fsp--;

             current =iv_ruleAction; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleAction4263); 

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
    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:2145:1: ruleAction returns [EObject current=null] : (otherlv_0= '@' ( (lv_name_1_0= ruleEString ) ) ( (lv_action_2_0= ruleEString ) )? (otherlv_3= '//' ( (lv_comment_4_0= ruleEString ) ) )? ) ;
    public final EObject ruleAction() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_3=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        AntlrDatatypeRuleToken lv_action_2_0 = null;

        AntlrDatatypeRuleToken lv_comment_4_0 = null;


         enterRule(); 
            
        try {
            // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:2148:28: ( (otherlv_0= '@' ( (lv_name_1_0= ruleEString ) ) ( (lv_action_2_0= ruleEString ) )? (otherlv_3= '//' ( (lv_comment_4_0= ruleEString ) ) )? ) )
            // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:2149:1: (otherlv_0= '@' ( (lv_name_1_0= ruleEString ) ) ( (lv_action_2_0= ruleEString ) )? (otherlv_3= '//' ( (lv_comment_4_0= ruleEString ) ) )? )
            {
            // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:2149:1: (otherlv_0= '@' ( (lv_name_1_0= ruleEString ) ) ( (lv_action_2_0= ruleEString ) )? (otherlv_3= '//' ( (lv_comment_4_0= ruleEString ) ) )? )
            // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:2149:3: otherlv_0= '@' ( (lv_name_1_0= ruleEString ) ) ( (lv_action_2_0= ruleEString ) )? (otherlv_3= '//' ( (lv_comment_4_0= ruleEString ) ) )?
            {
            otherlv_0=(Token)match(input,34,FollowSets000.FOLLOW_34_in_ruleAction4300); 

                	newLeafNode(otherlv_0, grammarAccess.getActionAccess().getCommercialAtKeyword_0());
                
            // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:2153:1: ( (lv_name_1_0= ruleEString ) )
            // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:2154:1: (lv_name_1_0= ruleEString )
            {
            // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:2154:1: (lv_name_1_0= ruleEString )
            // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:2155:3: lv_name_1_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getActionAccess().getNameEStringParserRuleCall_1_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleAction4321);
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

            // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:2171:2: ( (lv_action_2_0= ruleEString ) )?
            int alt61=2;
            int LA61_0 = input.LA(1);

            if ( ((LA61_0>=RULE_STRING && LA61_0<=RULE_ID)) ) {
                alt61=1;
            }
            switch (alt61) {
                case 1 :
                    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:2172:1: (lv_action_2_0= ruleEString )
                    {
                    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:2172:1: (lv_action_2_0= ruleEString )
                    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:2173:3: lv_action_2_0= ruleEString
                    {
                     
                    	        newCompositeNode(grammarAccess.getActionAccess().getActionEStringParserRuleCall_2_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleAction4342);
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

            // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:2189:3: (otherlv_3= '//' ( (lv_comment_4_0= ruleEString ) ) )?
            int alt62=2;
            int LA62_0 = input.LA(1);

            if ( (LA62_0==12) ) {
                alt62=1;
            }
            switch (alt62) {
                case 1 :
                    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:2189:5: otherlv_3= '//' ( (lv_comment_4_0= ruleEString ) )
                    {
                    otherlv_3=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleAction4356); 

                        	newLeafNode(otherlv_3, grammarAccess.getActionAccess().getSolidusSolidusKeyword_3_0());
                        
                    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:2193:1: ( (lv_comment_4_0= ruleEString ) )
                    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:2194:1: (lv_comment_4_0= ruleEString )
                    {
                    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:2194:1: (lv_comment_4_0= ruleEString )
                    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:2195:3: lv_comment_4_0= ruleEString
                    {
                     
                    	        newCompositeNode(grammarAccess.getActionAccess().getCommentEStringParserRuleCall_3_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleAction4377);
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


    // $ANTLR start "ruleAttributeType"
    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:2219:1: ruleAttributeType returns [Enumerator current=null] : ( (enumLiteral_0= 'Boolean' ) | (enumLiteral_1= 'Handle' ) | (enumLiteral_2= 'Integer' ) | (enumLiteral_3= 'Long' ) | (enumLiteral_4= 'String' ) ) ;
    public final Enumerator ruleAttributeType() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;
        Token enumLiteral_4=null;

         enterRule(); 
        try {
            // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:2221:28: ( ( (enumLiteral_0= 'Boolean' ) | (enumLiteral_1= 'Handle' ) | (enumLiteral_2= 'Integer' ) | (enumLiteral_3= 'Long' ) | (enumLiteral_4= 'String' ) ) )
            // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:2222:1: ( (enumLiteral_0= 'Boolean' ) | (enumLiteral_1= 'Handle' ) | (enumLiteral_2= 'Integer' ) | (enumLiteral_3= 'Long' ) | (enumLiteral_4= 'String' ) )
            {
            // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:2222:1: ( (enumLiteral_0= 'Boolean' ) | (enumLiteral_1= 'Handle' ) | (enumLiteral_2= 'Integer' ) | (enumLiteral_3= 'Long' ) | (enumLiteral_4= 'String' ) )
            int alt63=5;
            switch ( input.LA(1) ) {
            case 59:
                {
                alt63=1;
                }
                break;
            case 60:
                {
                alt63=2;
                }
                break;
            case 61:
                {
                alt63=3;
                }
                break;
            case 62:
                {
                alt63=4;
                }
                break;
            case 63:
                {
                alt63=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 63, 0, input);

                throw nvae;
            }

            switch (alt63) {
                case 1 :
                    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:2222:2: (enumLiteral_0= 'Boolean' )
                    {
                    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:2222:2: (enumLiteral_0= 'Boolean' )
                    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:2222:4: enumLiteral_0= 'Boolean'
                    {
                    enumLiteral_0=(Token)match(input,59,FollowSets000.FOLLOW_59_in_ruleAttributeType4429); 

                            current = grammarAccess.getAttributeTypeAccess().getBooleanEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_0, grammarAccess.getAttributeTypeAccess().getBooleanEnumLiteralDeclaration_0()); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:2228:6: (enumLiteral_1= 'Handle' )
                    {
                    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:2228:6: (enumLiteral_1= 'Handle' )
                    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:2228:8: enumLiteral_1= 'Handle'
                    {
                    enumLiteral_1=(Token)match(input,60,FollowSets000.FOLLOW_60_in_ruleAttributeType4446); 

                            current = grammarAccess.getAttributeTypeAccess().getHandleEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_1, grammarAccess.getAttributeTypeAccess().getHandleEnumLiteralDeclaration_1()); 
                        

                    }


                    }
                    break;
                case 3 :
                    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:2234:6: (enumLiteral_2= 'Integer' )
                    {
                    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:2234:6: (enumLiteral_2= 'Integer' )
                    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:2234:8: enumLiteral_2= 'Integer'
                    {
                    enumLiteral_2=(Token)match(input,61,FollowSets000.FOLLOW_61_in_ruleAttributeType4463); 

                            current = grammarAccess.getAttributeTypeAccess().getIntegerEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_2, grammarAccess.getAttributeTypeAccess().getIntegerEnumLiteralDeclaration_2()); 
                        

                    }


                    }
                    break;
                case 4 :
                    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:2240:6: (enumLiteral_3= 'Long' )
                    {
                    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:2240:6: (enumLiteral_3= 'Long' )
                    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:2240:8: enumLiteral_3= 'Long'
                    {
                    enumLiteral_3=(Token)match(input,62,FollowSets000.FOLLOW_62_in_ruleAttributeType4480); 

                            current = grammarAccess.getAttributeTypeAccess().getLongEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_3, grammarAccess.getAttributeTypeAccess().getLongEnumLiteralDeclaration_3()); 
                        

                    }


                    }
                    break;
                case 5 :
                    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:2246:6: (enumLiteral_4= 'String' )
                    {
                    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:2246:6: (enumLiteral_4= 'String' )
                    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:2246:8: enumLiteral_4= 'String'
                    {
                    enumLiteral_4=(Token)match(input,63,FollowSets000.FOLLOW_63_in_ruleAttributeType4497); 

                            current = grammarAccess.getAttributeTypeAccess().getStringEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_4, grammarAccess.getAttributeTypeAccess().getStringEnumLiteralDeclaration_4()); 
                        

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
    // $ANTLR end "ruleAttributeType"


    // $ANTLR start "ruleConvergence"
    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:2256:1: ruleConvergence returns [Enumerator current=null] : ( (enumLiteral_0= 'ordinary' ) | (enumLiteral_1= 'convergent' ) | (enumLiteral_2= 'anticipated' ) ) ;
    public final Enumerator ruleConvergence() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;

         enterRule(); 
        try {
            // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:2258:28: ( ( (enumLiteral_0= 'ordinary' ) | (enumLiteral_1= 'convergent' ) | (enumLiteral_2= 'anticipated' ) ) )
            // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:2259:1: ( (enumLiteral_0= 'ordinary' ) | (enumLiteral_1= 'convergent' ) | (enumLiteral_2= 'anticipated' ) )
            {
            // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:2259:1: ( (enumLiteral_0= 'ordinary' ) | (enumLiteral_1= 'convergent' ) | (enumLiteral_2= 'anticipated' ) )
            int alt64=3;
            switch ( input.LA(1) ) {
            case 64:
                {
                alt64=1;
                }
                break;
            case 65:
                {
                alt64=2;
                }
                break;
            case 66:
                {
                alt64=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 64, 0, input);

                throw nvae;
            }

            switch (alt64) {
                case 1 :
                    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:2259:2: (enumLiteral_0= 'ordinary' )
                    {
                    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:2259:2: (enumLiteral_0= 'ordinary' )
                    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:2259:4: enumLiteral_0= 'ordinary'
                    {
                    enumLiteral_0=(Token)match(input,64,FollowSets000.FOLLOW_64_in_ruleConvergence4542); 

                            current = grammarAccess.getConvergenceAccess().getOrdinaryEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_0, grammarAccess.getConvergenceAccess().getOrdinaryEnumLiteralDeclaration_0()); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:2265:6: (enumLiteral_1= 'convergent' )
                    {
                    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:2265:6: (enumLiteral_1= 'convergent' )
                    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:2265:8: enumLiteral_1= 'convergent'
                    {
                    enumLiteral_1=(Token)match(input,65,FollowSets000.FOLLOW_65_in_ruleConvergence4559); 

                            current = grammarAccess.getConvergenceAccess().getConvergentEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_1, grammarAccess.getConvergenceAccess().getConvergentEnumLiteralDeclaration_1()); 
                        

                    }


                    }
                    break;
                case 3 :
                    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:2271:6: (enumLiteral_2= 'anticipated' )
                    {
                    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:2271:6: (enumLiteral_2= 'anticipated' )
                    // ../ac.soton.xtext.machineDsl/src-gen/ac/soton/xtext/parser/antlr/internal/InternalMachineDsl.g:2271:8: enumLiteral_2= 'anticipated'
                    {
                    enumLiteral_2=(Token)match(input,66,FollowSets000.FOLLOW_66_in_ruleConvergence4576); 

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
        public static final BitSet FOLLOW_19_in_ruleMachine435 = new BitSet(new long[]{0x0000000400000000L});
        public static final BitSet FOLLOW_ruleInvariant_in_ruleMachine456 = new BitSet(new long[]{0x0000000400700000L});
        public static final BitSet FOLLOW_ruleInvariant_in_ruleMachine477 = new BitSet(new long[]{0x0000000400700000L});
        public static final BitSet FOLLOW_20_in_ruleMachine493 = new BitSet(new long[]{0x0000000000100000L});
        public static final BitSet FOLLOW_ruleVariant_in_ruleMachine514 = new BitSet(new long[]{0x0000000000600000L});
        public static final BitSet FOLLOW_21_in_ruleMachine529 = new BitSet(new long[]{0x0000002000000000L});
        public static final BitSet FOLLOW_ruleevent_in_ruleMachine550 = new BitSet(new long[]{0x0000002000400000L});
        public static final BitSet FOLLOW_ruleevent_in_ruleMachine571 = new BitSet(new long[]{0x0000002000400000L});
        public static final BitSet FOLLOW_22_in_ruleMachine586 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAbstractExtension_in_entryRuleAbstractExtension622 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleAbstractExtension632 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleExtension_in_ruleAbstractExtension678 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAnnotation_in_entryRuleAnnotation712 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleAnnotation722 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_23_in_ruleAnnotation768 = new BitSet(new long[]{0x0000000001000000L});
        public static final BitSet FOLLOW_24_in_ruleAnnotation780 = new BitSet(new long[]{0x000000007E000000L});
        public static final BitSet FOLLOW_25_in_ruleAnnotation793 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleAnnotation814 = new BitSet(new long[]{0x000000007C000000L});
        public static final BitSet FOLLOW_26_in_ruleAnnotation829 = new BitSet(new long[]{0x0000000000010000L});
        public static final BitSet FOLLOW_16_in_ruleAnnotation841 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleAnnotation864 = new BitSet(new long[]{0x0000000000024000L});
        public static final BitSet FOLLOW_14_in_ruleAnnotation877 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleAnnotation900 = new BitSet(new long[]{0x0000000000024000L});
        public static final BitSet FOLLOW_17_in_ruleAnnotation914 = new BitSet(new long[]{0x0000000078000000L});
        public static final BitSet FOLLOW_27_in_ruleAnnotation929 = new BitSet(new long[]{0x0000000001000000L});
        public static final BitSet FOLLOW_24_in_ruleAnnotation941 = new BitSet(new long[]{0x0000000000800000L});
        public static final BitSet FOLLOW_ruleAnnotation_in_ruleAnnotation962 = new BitSet(new long[]{0x0000000010004000L});
        public static final BitSet FOLLOW_14_in_ruleAnnotation975 = new BitSet(new long[]{0x0000000000800000L});
        public static final BitSet FOLLOW_ruleAnnotation_in_ruleAnnotation996 = new BitSet(new long[]{0x0000000010004000L});
        public static final BitSet FOLLOW_28_in_ruleAnnotation1010 = new BitSet(new long[]{0x0000000070000000L});
        public static final BitSet FOLLOW_29_in_ruleAnnotation1025 = new BitSet(new long[]{0x0000000001000000L});
        public static final BitSet FOLLOW_24_in_ruleAnnotation1037 = new BitSet(new long[]{0x0000400000000000L});
        public static final BitSet FOLLOW_ruleStringToStringMapEntry_in_ruleAnnotation1058 = new BitSet(new long[]{0x0000000010004000L});
        public static final BitSet FOLLOW_14_in_ruleAnnotation1071 = new BitSet(new long[]{0x0000400000000000L});
        public static final BitSet FOLLOW_ruleStringToStringMapEntry_in_ruleAnnotation1092 = new BitSet(new long[]{0x0000000010004000L});
        public static final BitSet FOLLOW_28_in_ruleAnnotation1106 = new BitSet(new long[]{0x0000000050000000L});
        public static final BitSet FOLLOW_30_in_ruleAnnotation1121 = new BitSet(new long[]{0x0000000001000000L});
        public static final BitSet FOLLOW_24_in_ruleAnnotation1133 = new BitSet(new long[]{0x0000800000000000L});
        public static final BitSet FOLLOW_ruleEObject_in_ruleAnnotation1154 = new BitSet(new long[]{0x0000000010004000L});
        public static final BitSet FOLLOW_14_in_ruleAnnotation1167 = new BitSet(new long[]{0x0000800000000000L});
        public static final BitSet FOLLOW_ruleEObject_in_ruleAnnotation1188 = new BitSet(new long[]{0x0000000010004000L});
        public static final BitSet FOLLOW_28_in_ruleAnnotation1202 = new BitSet(new long[]{0x0000000010000000L});
        public static final BitSet FOLLOW_28_in_ruleAnnotation1216 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleStringToAttributeMapEntry_in_entryRuleStringToAttributeMapEntry1252 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleStringToAttributeMapEntry1262 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_31_in_ruleStringToAttributeMapEntry1299 = new BitSet(new long[]{0x0000000001000000L});
        public static final BitSet FOLLOW_24_in_ruleStringToAttributeMapEntry1311 = new BitSet(new long[]{0x0000000100000000L});
        public static final BitSet FOLLOW_32_in_ruleStringToAttributeMapEntry1323 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleStringToAttributeMapEntry1344 = new BitSet(new long[]{0x0000000210000000L});
        public static final BitSet FOLLOW_33_in_ruleStringToAttributeMapEntry1357 = new BitSet(new long[]{0x0040000000000000L});
        public static final BitSet FOLLOW_ruleAttribute_in_ruleStringToAttributeMapEntry1378 = new BitSet(new long[]{0x0000000010000000L});
        public static final BitSet FOLLOW_28_in_ruleStringToAttributeMapEntry1392 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_entryRuleEString1431 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleEString1442 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_STRING_in_ruleEString1482 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleEString1508 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleVariable_in_entryRuleVariable1553 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleVariable1563 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_ruleVariable1618 = new BitSet(new long[]{0x0000000000001002L});
        public static final BitSet FOLLOW_12_in_ruleVariable1631 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleVariable1652 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleInvariant_in_entryRuleInvariant1690 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleInvariant1700 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_34_in_ruleInvariant1737 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleInvariant1758 = new BitSet(new long[]{0x0000000800001032L});
        public static final BitSet FOLLOW_35_in_ruleInvariant1776 = new BitSet(new long[]{0x0000000000001032L});
        public static final BitSet FOLLOW_ruleEString_in_ruleInvariant1811 = new BitSet(new long[]{0x0000000000001002L});
        public static final BitSet FOLLOW_12_in_ruleInvariant1825 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleInvariant1846 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleVariant_in_entryRuleVariant1884 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleVariant1894 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_20_in_ruleVariant1931 = new BitSet(new long[]{0x0000001000000000L});
        public static final BitSet FOLLOW_36_in_ruleVariant1943 = new BitSet(new long[]{0x0000000000001030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleVariant1964 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleVariant1978 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleVariant1999 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleevent_in_entryRuleevent2036 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleevent2046 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_37_in_ruleevent2092 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleevent2113 = new BitSet(new long[]{0x00003BC000001000L,0x0000000000000007L});
        public static final BitSet FOLLOW_38_in_ruleevent2131 = new BitSet(new long[]{0x00003B8000001000L,0x0000000000000007L});
        public static final BitSet FOLLOW_ruleConvergence_in_ruleevent2166 = new BitSet(new long[]{0x00003B8000001000L});
        public static final BitSet FOLLOW_12_in_ruleevent2180 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleevent2201 = new BitSet(new long[]{0x00003B8000000000L});
        public static final BitSet FOLLOW_39_in_ruleevent2216 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleevent2239 = new BitSet(new long[]{0x00003B0000004000L});
        public static final BitSet FOLLOW_14_in_ruleevent2252 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleevent2275 = new BitSet(new long[]{0x00003B0000004000L});
        public static final BitSet FOLLOW_40_in_ruleevent2292 = new BitSet(new long[]{0x0000000400000000L});
        public static final BitSet FOLLOW_ruleGuard_in_ruleevent2313 = new BitSet(new long[]{0x00003A0400000000L});
        public static final BitSet FOLLOW_ruleGuard_in_ruleevent2334 = new BitSet(new long[]{0x00003A0400000000L});
        public static final BitSet FOLLOW_41_in_ruleevent2350 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleParameter_in_ruleevent2371 = new BitSet(new long[]{0x0000040000000030L});
        public static final BitSet FOLLOW_ruleParameter_in_ruleevent2392 = new BitSet(new long[]{0x0000040000000030L});
        public static final BitSet FOLLOW_42_in_ruleevent2405 = new BitSet(new long[]{0x0000000400000000L});
        public static final BitSet FOLLOW_ruleGuard_in_ruleevent2426 = new BitSet(new long[]{0x0000380400000000L});
        public static final BitSet FOLLOW_ruleGuard_in_ruleevent2447 = new BitSet(new long[]{0x0000380400000000L});
        public static final BitSet FOLLOW_43_in_ruleevent2463 = new BitSet(new long[]{0x0201000000000000L});
        public static final BitSet FOLLOW_ruleWitness_in_ruleevent2484 = new BitSet(new long[]{0x0201300000000000L});
        public static final BitSet FOLLOW_ruleWitness_in_ruleevent2505 = new BitSet(new long[]{0x0201300000000000L});
        public static final BitSet FOLLOW_44_in_ruleevent2521 = new BitSet(new long[]{0x0000000400000000L});
        public static final BitSet FOLLOW_ruleAction_in_ruleevent2542 = new BitSet(new long[]{0x0000200400000000L});
        public static final BitSet FOLLOW_ruleAction_in_ruleevent2563 = new BitSet(new long[]{0x0000200400000000L});
        public static final BitSet FOLLOW_45_in_ruleevent2578 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleStringToStringMapEntry_in_entryRuleStringToStringMapEntry2614 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleStringToStringMapEntry2624 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_46_in_ruleStringToStringMapEntry2670 = new BitSet(new long[]{0x0000000001000000L});
        public static final BitSet FOLLOW_24_in_ruleStringToStringMapEntry2682 = new BitSet(new long[]{0x0000000310000000L});
        public static final BitSet FOLLOW_32_in_ruleStringToStringMapEntry2695 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleStringToStringMapEntry2716 = new BitSet(new long[]{0x0000000210000000L});
        public static final BitSet FOLLOW_33_in_ruleStringToStringMapEntry2731 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleStringToStringMapEntry2752 = new BitSet(new long[]{0x0000000010000000L});
        public static final BitSet FOLLOW_28_in_ruleStringToStringMapEntry2766 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEObject_in_entryRuleEObject2802 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleEObject2812 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_47_in_ruleEObject2858 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleExtension_in_entryRuleExtension2894 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleExtension2904 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_48_in_ruleExtension2947 = new BitSet(new long[]{0x0002000000000000L});
        public static final BitSet FOLLOW_49_in_ruleExtension2973 = new BitSet(new long[]{0x000C000000000000L});
        public static final BitSet FOLLOW_50_in_ruleExtension2986 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleExtension3007 = new BitSet(new long[]{0x0008000000000000L});
        public static final BitSet FOLLOW_51_in_ruleExtension3021 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleExtension3042 = new BitSet(new long[]{0x0030000008000002L});
        public static final BitSet FOLLOW_27_in_ruleExtension3055 = new BitSet(new long[]{0x0000000001000000L});
        public static final BitSet FOLLOW_24_in_ruleExtension3067 = new BitSet(new long[]{0x0000000000800000L});
        public static final BitSet FOLLOW_ruleAnnotation_in_ruleExtension3088 = new BitSet(new long[]{0x0000000010004000L});
        public static final BitSet FOLLOW_14_in_ruleExtension3101 = new BitSet(new long[]{0x0000000000800000L});
        public static final BitSet FOLLOW_ruleAnnotation_in_ruleExtension3122 = new BitSet(new long[]{0x0000000010004000L});
        public static final BitSet FOLLOW_28_in_ruleExtension3136 = new BitSet(new long[]{0x0030000000000002L});
        public static final BitSet FOLLOW_52_in_ruleExtension3151 = new BitSet(new long[]{0x0000000001000000L});
        public static final BitSet FOLLOW_24_in_ruleExtension3163 = new BitSet(new long[]{0x0003000000000000L});
        public static final BitSet FOLLOW_ruleAbstractExtension_in_ruleExtension3184 = new BitSet(new long[]{0x0000000010004000L});
        public static final BitSet FOLLOW_14_in_ruleExtension3197 = new BitSet(new long[]{0x0003000000000000L});
        public static final BitSet FOLLOW_ruleAbstractExtension_in_ruleExtension3218 = new BitSet(new long[]{0x0000000010004000L});
        public static final BitSet FOLLOW_28_in_ruleExtension3232 = new BitSet(new long[]{0x0020000000000002L});
        public static final BitSet FOLLOW_53_in_ruleExtension3247 = new BitSet(new long[]{0x0000000001000000L});
        public static final BitSet FOLLOW_24_in_ruleExtension3259 = new BitSet(new long[]{0x0000000080000000L});
        public static final BitSet FOLLOW_ruleStringToAttributeMapEntry_in_ruleExtension3280 = new BitSet(new long[]{0x0000000010004000L});
        public static final BitSet FOLLOW_14_in_ruleExtension3293 = new BitSet(new long[]{0x0000000080000000L});
        public static final BitSet FOLLOW_ruleStringToAttributeMapEntry_in_ruleExtension3314 = new BitSet(new long[]{0x0000000010004000L});
        public static final BitSet FOLLOW_28_in_ruleExtension3328 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAttribute_in_entryRuleAttribute3366 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleAttribute3376 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_54_in_ruleAttribute3413 = new BitSet(new long[]{0x0080000000000000L});
        public static final BitSet FOLLOW_55_in_ruleAttribute3425 = new BitSet(new long[]{0xF800000000000000L});
        public static final BitSet FOLLOW_ruleAttributeType_in_ruleAttribute3446 = new BitSet(new long[]{0x0000000200000000L});
        public static final BitSet FOLLOW_33_in_ruleAttribute3458 = new BitSet(new long[]{0x0100000000000000L});
        public static final BitSet FOLLOW_ruleEJavaObject_in_ruleAttribute3479 = new BitSet(new long[]{0x0000000008000002L});
        public static final BitSet FOLLOW_27_in_ruleAttribute3492 = new BitSet(new long[]{0x0000000001000000L});
        public static final BitSet FOLLOW_24_in_ruleAttribute3504 = new BitSet(new long[]{0x0000000000800000L});
        public static final BitSet FOLLOW_ruleAnnotation_in_ruleAttribute3525 = new BitSet(new long[]{0x0000000010004000L});
        public static final BitSet FOLLOW_14_in_ruleAttribute3538 = new BitSet(new long[]{0x0000000000800000L});
        public static final BitSet FOLLOW_ruleAnnotation_in_ruleAttribute3559 = new BitSet(new long[]{0x0000000010004000L});
        public static final BitSet FOLLOW_28_in_ruleAttribute3573 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEJavaObject_in_entryRuleEJavaObject3612 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleEJavaObject3623 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_56_in_ruleEJavaObject3660 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleParameter_in_entryRuleParameter3705 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleParameter3715 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_ruleParameter3770 = new BitSet(new long[]{0x0000000000001002L});
        public static final BitSet FOLLOW_12_in_ruleParameter3783 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleParameter3804 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleGuard_in_entryRuleGuard3842 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleGuard3852 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_34_in_ruleGuard3889 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleGuard3910 = new BitSet(new long[]{0x0000000800000030L});
        public static final BitSet FOLLOW_35_in_ruleGuard3928 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleGuard3963 = new BitSet(new long[]{0x0000000000001002L});
        public static final BitSet FOLLOW_12_in_ruleGuard3976 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleGuard3997 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleWitness_in_entryRuleWitness4035 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleWitness4045 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_48_in_ruleWitness4088 = new BitSet(new long[]{0x0200000000000000L});
        public static final BitSet FOLLOW_57_in_ruleWitness4114 = new BitSet(new long[]{0x0000000400000000L});
        public static final BitSet FOLLOW_34_in_ruleWitness4126 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleWitness4147 = new BitSet(new long[]{0x0400000000000000L});
        public static final BitSet FOLLOW_58_in_ruleWitness4159 = new BitSet(new long[]{0x0000000000001032L});
        public static final BitSet FOLLOW_ruleEString_in_ruleWitness4180 = new BitSet(new long[]{0x0000000000001002L});
        public static final BitSet FOLLOW_12_in_ruleWitness4194 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleWitness4215 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAction_in_entryRuleAction4253 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleAction4263 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_34_in_ruleAction4300 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleAction4321 = new BitSet(new long[]{0x0000000000001032L});
        public static final BitSet FOLLOW_ruleEString_in_ruleAction4342 = new BitSet(new long[]{0x0000000000001002L});
        public static final BitSet FOLLOW_12_in_ruleAction4356 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleAction4377 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_59_in_ruleAttributeType4429 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_60_in_ruleAttributeType4446 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_61_in_ruleAttributeType4463 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_62_in_ruleAttributeType4480 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_63_in_ruleAttributeType4497 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_64_in_ruleConvergence4542 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_65_in_ruleConvergence4559 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_66_in_ruleConvergence4576 = new BitSet(new long[]{0x0000000000000002L});
    }


}