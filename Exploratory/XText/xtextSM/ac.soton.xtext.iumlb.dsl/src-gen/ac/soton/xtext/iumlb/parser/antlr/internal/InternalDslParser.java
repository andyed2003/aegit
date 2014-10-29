package ac.soton.xtext.iumlb.parser.antlr.internal; 

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import ac.soton.xtext.iumlb.services.DslGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalDslParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'localGenerated'", "'Statemachine'", "'{'", "'comment'", "'refines'", "'nodes'", "','", "'}'", "'transitions'", "'State'", "'incoming'", "'('", "')'", "'outgoing'", "'statemachines'", "'invariants'", "'extended'", "'Transition'", "'elaborates'", "'target'", "'source'", "'Initial'", "'internalId'", "'Final'", "'Any'", "'Junction'", "'Fork'", "'theorem'", "'Invariant'", "'predicate'"
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
    public String getGrammarFileName() { return "../ac.soton.xtext.iumlb.dsl/src-gen/ac/soton/xtext/iumlb/parser/antlr/internal/InternalDsl.g"; }



     	private DslGrammarAccess grammarAccess;
     	
        public InternalDslParser(TokenStream input, DslGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }
        
        @Override
        protected String getFirstRuleName() {
        	return "AbstractNode";	
       	}
       	
       	@Override
       	protected DslGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}



    // $ANTLR start "entryRuleAbstractNode"
    // ../ac.soton.xtext.iumlb.dsl/src-gen/ac/soton/xtext/iumlb/parser/antlr/internal/InternalDsl.g:67:1: entryRuleAbstractNode returns [EObject current=null] : iv_ruleAbstractNode= ruleAbstractNode EOF ;
    public final EObject entryRuleAbstractNode() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAbstractNode = null;


        try {
            // ../ac.soton.xtext.iumlb.dsl/src-gen/ac/soton/xtext/iumlb/parser/antlr/internal/InternalDsl.g:68:2: (iv_ruleAbstractNode= ruleAbstractNode EOF )
            // ../ac.soton.xtext.iumlb.dsl/src-gen/ac/soton/xtext/iumlb/parser/antlr/internal/InternalDsl.g:69:2: iv_ruleAbstractNode= ruleAbstractNode EOF
            {
             newCompositeNode(grammarAccess.getAbstractNodeRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleAbstractNode_in_entryRuleAbstractNode75);
            iv_ruleAbstractNode=ruleAbstractNode();

            state._fsp--;

             current =iv_ruleAbstractNode; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleAbstractNode85); 

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
    // $ANTLR end "entryRuleAbstractNode"


    // $ANTLR start "ruleAbstractNode"
    // ../ac.soton.xtext.iumlb.dsl/src-gen/ac/soton/xtext/iumlb/parser/antlr/internal/InternalDsl.g:76:1: ruleAbstractNode returns [EObject current=null] : (this_State_0= ruleState | this_Initial_1= ruleInitial | this_Final_2= ruleFinal | this_Any_3= ruleAny | this_Junction_4= ruleJunction | this_Fork_5= ruleFork ) ;
    public final EObject ruleAbstractNode() throws RecognitionException {
        EObject current = null;

        EObject this_State_0 = null;

        EObject this_Initial_1 = null;

        EObject this_Final_2 = null;

        EObject this_Any_3 = null;

        EObject this_Junction_4 = null;

        EObject this_Fork_5 = null;


         enterRule(); 
            
        try {
            // ../ac.soton.xtext.iumlb.dsl/src-gen/ac/soton/xtext/iumlb/parser/antlr/internal/InternalDsl.g:79:28: ( (this_State_0= ruleState | this_Initial_1= ruleInitial | this_Final_2= ruleFinal | this_Any_3= ruleAny | this_Junction_4= ruleJunction | this_Fork_5= ruleFork ) )
            // ../ac.soton.xtext.iumlb.dsl/src-gen/ac/soton/xtext/iumlb/parser/antlr/internal/InternalDsl.g:80:1: (this_State_0= ruleState | this_Initial_1= ruleInitial | this_Final_2= ruleFinal | this_Any_3= ruleAny | this_Junction_4= ruleJunction | this_Fork_5= ruleFork )
            {
            // ../ac.soton.xtext.iumlb.dsl/src-gen/ac/soton/xtext/iumlb/parser/antlr/internal/InternalDsl.g:80:1: (this_State_0= ruleState | this_Initial_1= ruleInitial | this_Final_2= ruleFinal | this_Any_3= ruleAny | this_Junction_4= ruleJunction | this_Fork_5= ruleFork )
            int alt1=6;
            switch ( input.LA(1) ) {
            case 11:
                {
                switch ( input.LA(2) ) {
                case 20:
                    {
                    alt1=1;
                    }
                    break;
                case 37:
                    {
                    alt1=6;
                    }
                    break;
                case 36:
                    {
                    alt1=5;
                    }
                    break;
                case 35:
                    {
                    alt1=4;
                    }
                    break;
                case 34:
                    {
                    alt1=3;
                    }
                    break;
                case 32:
                    {
                    alt1=2;
                    }
                    break;
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("", 1, 1, input);

                    throw nvae;
                }

                }
                break;
            case 20:
                {
                alt1=1;
                }
                break;
            case 32:
                {
                alt1=2;
                }
                break;
            case 34:
                {
                alt1=3;
                }
                break;
            case 35:
                {
                alt1=4;
                }
                break;
            case 36:
                {
                alt1=5;
                }
                break;
            case 37:
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
                    // ../ac.soton.xtext.iumlb.dsl/src-gen/ac/soton/xtext/iumlb/parser/antlr/internal/InternalDsl.g:81:5: this_State_0= ruleState
                    {
                     
                            newCompositeNode(grammarAccess.getAbstractNodeAccess().getStateParserRuleCall_0()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleState_in_ruleAbstractNode132);
                    this_State_0=ruleState();

                    state._fsp--;

                     
                            current = this_State_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../ac.soton.xtext.iumlb.dsl/src-gen/ac/soton/xtext/iumlb/parser/antlr/internal/InternalDsl.g:91:5: this_Initial_1= ruleInitial
                    {
                     
                            newCompositeNode(grammarAccess.getAbstractNodeAccess().getInitialParserRuleCall_1()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleInitial_in_ruleAbstractNode159);
                    this_Initial_1=ruleInitial();

                    state._fsp--;

                     
                            current = this_Initial_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // ../ac.soton.xtext.iumlb.dsl/src-gen/ac/soton/xtext/iumlb/parser/antlr/internal/InternalDsl.g:101:5: this_Final_2= ruleFinal
                    {
                     
                            newCompositeNode(grammarAccess.getAbstractNodeAccess().getFinalParserRuleCall_2()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleFinal_in_ruleAbstractNode186);
                    this_Final_2=ruleFinal();

                    state._fsp--;

                     
                            current = this_Final_2; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 4 :
                    // ../ac.soton.xtext.iumlb.dsl/src-gen/ac/soton/xtext/iumlb/parser/antlr/internal/InternalDsl.g:111:5: this_Any_3= ruleAny
                    {
                     
                            newCompositeNode(grammarAccess.getAbstractNodeAccess().getAnyParserRuleCall_3()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleAny_in_ruleAbstractNode213);
                    this_Any_3=ruleAny();

                    state._fsp--;

                     
                            current = this_Any_3; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 5 :
                    // ../ac.soton.xtext.iumlb.dsl/src-gen/ac/soton/xtext/iumlb/parser/antlr/internal/InternalDsl.g:121:5: this_Junction_4= ruleJunction
                    {
                     
                            newCompositeNode(grammarAccess.getAbstractNodeAccess().getJunctionParserRuleCall_4()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleJunction_in_ruleAbstractNode240);
                    this_Junction_4=ruleJunction();

                    state._fsp--;

                     
                            current = this_Junction_4; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 6 :
                    // ../ac.soton.xtext.iumlb.dsl/src-gen/ac/soton/xtext/iumlb/parser/antlr/internal/InternalDsl.g:131:5: this_Fork_5= ruleFork
                    {
                     
                            newCompositeNode(grammarAccess.getAbstractNodeAccess().getForkParserRuleCall_5()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleFork_in_ruleAbstractNode267);
                    this_Fork_5=ruleFork();

                    state._fsp--;

                     
                            current = this_Fork_5; 
                            afterParserOrEnumRuleCall();
                        

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
    // $ANTLR end "ruleAbstractNode"


    // $ANTLR start "entryRuleStatemachine"
    // ../ac.soton.xtext.iumlb.dsl/src-gen/ac/soton/xtext/iumlb/parser/antlr/internal/InternalDsl.g:147:1: entryRuleStatemachine returns [EObject current=null] : iv_ruleStatemachine= ruleStatemachine EOF ;
    public final EObject entryRuleStatemachine() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStatemachine = null;


        try {
            // ../ac.soton.xtext.iumlb.dsl/src-gen/ac/soton/xtext/iumlb/parser/antlr/internal/InternalDsl.g:148:2: (iv_ruleStatemachine= ruleStatemachine EOF )
            // ../ac.soton.xtext.iumlb.dsl/src-gen/ac/soton/xtext/iumlb/parser/antlr/internal/InternalDsl.g:149:2: iv_ruleStatemachine= ruleStatemachine EOF
            {
             newCompositeNode(grammarAccess.getStatemachineRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleStatemachine_in_entryRuleStatemachine302);
            iv_ruleStatemachine=ruleStatemachine();

            state._fsp--;

             current =iv_ruleStatemachine; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleStatemachine312); 

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
    // $ANTLR end "entryRuleStatemachine"


    // $ANTLR start "ruleStatemachine"
    // ../ac.soton.xtext.iumlb.dsl/src-gen/ac/soton/xtext/iumlb/parser/antlr/internal/InternalDsl.g:156:1: ruleStatemachine returns [EObject current=null] : ( ( (lv_localGenerated_0_0= 'localGenerated' ) )? otherlv_1= 'Statemachine' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'comment' ( (lv_comment_5_0= ruleEString ) ) )? (otherlv_6= 'refines' ( ( ruleEString ) ) )? (otherlv_8= 'nodes' otherlv_9= '{' ( (lv_nodes_10_0= ruleAbstractNode ) ) (otherlv_11= ',' ( (lv_nodes_12_0= ruleAbstractNode ) ) )* otherlv_13= '}' )? (otherlv_14= 'transitions' otherlv_15= '{' ( (lv_transitions_16_0= ruleTransition ) ) (otherlv_17= ',' ( (lv_transitions_18_0= ruleTransition ) ) )* otherlv_19= '}' )? otherlv_20= '}' ) ;
    public final EObject ruleStatemachine() throws RecognitionException {
        EObject current = null;

        Token lv_localGenerated_0_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        Token otherlv_14=null;
        Token otherlv_15=null;
        Token otherlv_17=null;
        Token otherlv_19=null;
        Token otherlv_20=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        AntlrDatatypeRuleToken lv_comment_5_0 = null;

        EObject lv_nodes_10_0 = null;

        EObject lv_nodes_12_0 = null;

        EObject lv_transitions_16_0 = null;

        EObject lv_transitions_18_0 = null;


         enterRule(); 
            
        try {
            // ../ac.soton.xtext.iumlb.dsl/src-gen/ac/soton/xtext/iumlb/parser/antlr/internal/InternalDsl.g:159:28: ( ( ( (lv_localGenerated_0_0= 'localGenerated' ) )? otherlv_1= 'Statemachine' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'comment' ( (lv_comment_5_0= ruleEString ) ) )? (otherlv_6= 'refines' ( ( ruleEString ) ) )? (otherlv_8= 'nodes' otherlv_9= '{' ( (lv_nodes_10_0= ruleAbstractNode ) ) (otherlv_11= ',' ( (lv_nodes_12_0= ruleAbstractNode ) ) )* otherlv_13= '}' )? (otherlv_14= 'transitions' otherlv_15= '{' ( (lv_transitions_16_0= ruleTransition ) ) (otherlv_17= ',' ( (lv_transitions_18_0= ruleTransition ) ) )* otherlv_19= '}' )? otherlv_20= '}' ) )
            // ../ac.soton.xtext.iumlb.dsl/src-gen/ac/soton/xtext/iumlb/parser/antlr/internal/InternalDsl.g:160:1: ( ( (lv_localGenerated_0_0= 'localGenerated' ) )? otherlv_1= 'Statemachine' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'comment' ( (lv_comment_5_0= ruleEString ) ) )? (otherlv_6= 'refines' ( ( ruleEString ) ) )? (otherlv_8= 'nodes' otherlv_9= '{' ( (lv_nodes_10_0= ruleAbstractNode ) ) (otherlv_11= ',' ( (lv_nodes_12_0= ruleAbstractNode ) ) )* otherlv_13= '}' )? (otherlv_14= 'transitions' otherlv_15= '{' ( (lv_transitions_16_0= ruleTransition ) ) (otherlv_17= ',' ( (lv_transitions_18_0= ruleTransition ) ) )* otherlv_19= '}' )? otherlv_20= '}' )
            {
            // ../ac.soton.xtext.iumlb.dsl/src-gen/ac/soton/xtext/iumlb/parser/antlr/internal/InternalDsl.g:160:1: ( ( (lv_localGenerated_0_0= 'localGenerated' ) )? otherlv_1= 'Statemachine' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'comment' ( (lv_comment_5_0= ruleEString ) ) )? (otherlv_6= 'refines' ( ( ruleEString ) ) )? (otherlv_8= 'nodes' otherlv_9= '{' ( (lv_nodes_10_0= ruleAbstractNode ) ) (otherlv_11= ',' ( (lv_nodes_12_0= ruleAbstractNode ) ) )* otherlv_13= '}' )? (otherlv_14= 'transitions' otherlv_15= '{' ( (lv_transitions_16_0= ruleTransition ) ) (otherlv_17= ',' ( (lv_transitions_18_0= ruleTransition ) ) )* otherlv_19= '}' )? otherlv_20= '}' )
            // ../ac.soton.xtext.iumlb.dsl/src-gen/ac/soton/xtext/iumlb/parser/antlr/internal/InternalDsl.g:160:2: ( (lv_localGenerated_0_0= 'localGenerated' ) )? otherlv_1= 'Statemachine' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'comment' ( (lv_comment_5_0= ruleEString ) ) )? (otherlv_6= 'refines' ( ( ruleEString ) ) )? (otherlv_8= 'nodes' otherlv_9= '{' ( (lv_nodes_10_0= ruleAbstractNode ) ) (otherlv_11= ',' ( (lv_nodes_12_0= ruleAbstractNode ) ) )* otherlv_13= '}' )? (otherlv_14= 'transitions' otherlv_15= '{' ( (lv_transitions_16_0= ruleTransition ) ) (otherlv_17= ',' ( (lv_transitions_18_0= ruleTransition ) ) )* otherlv_19= '}' )? otherlv_20= '}'
            {
            // ../ac.soton.xtext.iumlb.dsl/src-gen/ac/soton/xtext/iumlb/parser/antlr/internal/InternalDsl.g:160:2: ( (lv_localGenerated_0_0= 'localGenerated' ) )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==11) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // ../ac.soton.xtext.iumlb.dsl/src-gen/ac/soton/xtext/iumlb/parser/antlr/internal/InternalDsl.g:161:1: (lv_localGenerated_0_0= 'localGenerated' )
                    {
                    // ../ac.soton.xtext.iumlb.dsl/src-gen/ac/soton/xtext/iumlb/parser/antlr/internal/InternalDsl.g:161:1: (lv_localGenerated_0_0= 'localGenerated' )
                    // ../ac.soton.xtext.iumlb.dsl/src-gen/ac/soton/xtext/iumlb/parser/antlr/internal/InternalDsl.g:162:3: lv_localGenerated_0_0= 'localGenerated'
                    {
                    lv_localGenerated_0_0=(Token)match(input,11,FollowSets000.FOLLOW_11_in_ruleStatemachine355); 

                            newLeafNode(lv_localGenerated_0_0, grammarAccess.getStatemachineAccess().getLocalGeneratedLocalGeneratedKeyword_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getStatemachineRule());
                    	        }
                           		setWithLastConsumed(current, "localGenerated", true, "localGenerated");
                    	    

                    }


                    }
                    break;

            }

            otherlv_1=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleStatemachine381); 

                	newLeafNode(otherlv_1, grammarAccess.getStatemachineAccess().getStatemachineKeyword_1());
                
            // ../ac.soton.xtext.iumlb.dsl/src-gen/ac/soton/xtext/iumlb/parser/antlr/internal/InternalDsl.g:179:1: ( (lv_name_2_0= ruleEString ) )
            // ../ac.soton.xtext.iumlb.dsl/src-gen/ac/soton/xtext/iumlb/parser/antlr/internal/InternalDsl.g:180:1: (lv_name_2_0= ruleEString )
            {
            // ../ac.soton.xtext.iumlb.dsl/src-gen/ac/soton/xtext/iumlb/parser/antlr/internal/InternalDsl.g:180:1: (lv_name_2_0= ruleEString )
            // ../ac.soton.xtext.iumlb.dsl/src-gen/ac/soton/xtext/iumlb/parser/antlr/internal/InternalDsl.g:181:3: lv_name_2_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getStatemachineAccess().getNameEStringParserRuleCall_2_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleStatemachine402);
            lv_name_2_0=ruleEString();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getStatemachineRule());
            	        }
                   		set(
                   			current, 
                   			"name",
                    		lv_name_2_0, 
                    		"EString");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_3=(Token)match(input,13,FollowSets000.FOLLOW_13_in_ruleStatemachine414); 

                	newLeafNode(otherlv_3, grammarAccess.getStatemachineAccess().getLeftCurlyBracketKeyword_3());
                
            // ../ac.soton.xtext.iumlb.dsl/src-gen/ac/soton/xtext/iumlb/parser/antlr/internal/InternalDsl.g:201:1: (otherlv_4= 'comment' ( (lv_comment_5_0= ruleEString ) ) )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==14) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // ../ac.soton.xtext.iumlb.dsl/src-gen/ac/soton/xtext/iumlb/parser/antlr/internal/InternalDsl.g:201:3: otherlv_4= 'comment' ( (lv_comment_5_0= ruleEString ) )
                    {
                    otherlv_4=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleStatemachine427); 

                        	newLeafNode(otherlv_4, grammarAccess.getStatemachineAccess().getCommentKeyword_4_0());
                        
                    // ../ac.soton.xtext.iumlb.dsl/src-gen/ac/soton/xtext/iumlb/parser/antlr/internal/InternalDsl.g:205:1: ( (lv_comment_5_0= ruleEString ) )
                    // ../ac.soton.xtext.iumlb.dsl/src-gen/ac/soton/xtext/iumlb/parser/antlr/internal/InternalDsl.g:206:1: (lv_comment_5_0= ruleEString )
                    {
                    // ../ac.soton.xtext.iumlb.dsl/src-gen/ac/soton/xtext/iumlb/parser/antlr/internal/InternalDsl.g:206:1: (lv_comment_5_0= ruleEString )
                    // ../ac.soton.xtext.iumlb.dsl/src-gen/ac/soton/xtext/iumlb/parser/antlr/internal/InternalDsl.g:207:3: lv_comment_5_0= ruleEString
                    {
                     
                    	        newCompositeNode(grammarAccess.getStatemachineAccess().getCommentEStringParserRuleCall_4_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleStatemachine448);
                    lv_comment_5_0=ruleEString();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getStatemachineRule());
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

            // ../ac.soton.xtext.iumlb.dsl/src-gen/ac/soton/xtext/iumlb/parser/antlr/internal/InternalDsl.g:223:4: (otherlv_6= 'refines' ( ( ruleEString ) ) )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==15) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // ../ac.soton.xtext.iumlb.dsl/src-gen/ac/soton/xtext/iumlb/parser/antlr/internal/InternalDsl.g:223:6: otherlv_6= 'refines' ( ( ruleEString ) )
                    {
                    otherlv_6=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleStatemachine463); 

                        	newLeafNode(otherlv_6, grammarAccess.getStatemachineAccess().getRefinesKeyword_5_0());
                        
                    // ../ac.soton.xtext.iumlb.dsl/src-gen/ac/soton/xtext/iumlb/parser/antlr/internal/InternalDsl.g:227:1: ( ( ruleEString ) )
                    // ../ac.soton.xtext.iumlb.dsl/src-gen/ac/soton/xtext/iumlb/parser/antlr/internal/InternalDsl.g:228:1: ( ruleEString )
                    {
                    // ../ac.soton.xtext.iumlb.dsl/src-gen/ac/soton/xtext/iumlb/parser/antlr/internal/InternalDsl.g:228:1: ( ruleEString )
                    // ../ac.soton.xtext.iumlb.dsl/src-gen/ac/soton/xtext/iumlb/parser/antlr/internal/InternalDsl.g:229:3: ruleEString
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getStatemachineRule());
                    	        }
                            
                     
                    	        newCompositeNode(grammarAccess.getStatemachineAccess().getRefinesStatemachineCrossReference_5_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleStatemachine486);
                    ruleEString();

                    state._fsp--;

                     
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../ac.soton.xtext.iumlb.dsl/src-gen/ac/soton/xtext/iumlb/parser/antlr/internal/InternalDsl.g:242:4: (otherlv_8= 'nodes' otherlv_9= '{' ( (lv_nodes_10_0= ruleAbstractNode ) ) (otherlv_11= ',' ( (lv_nodes_12_0= ruleAbstractNode ) ) )* otherlv_13= '}' )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==16) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // ../ac.soton.xtext.iumlb.dsl/src-gen/ac/soton/xtext/iumlb/parser/antlr/internal/InternalDsl.g:242:6: otherlv_8= 'nodes' otherlv_9= '{' ( (lv_nodes_10_0= ruleAbstractNode ) ) (otherlv_11= ',' ( (lv_nodes_12_0= ruleAbstractNode ) ) )* otherlv_13= '}'
                    {
                    otherlv_8=(Token)match(input,16,FollowSets000.FOLLOW_16_in_ruleStatemachine501); 

                        	newLeafNode(otherlv_8, grammarAccess.getStatemachineAccess().getNodesKeyword_6_0());
                        
                    otherlv_9=(Token)match(input,13,FollowSets000.FOLLOW_13_in_ruleStatemachine513); 

                        	newLeafNode(otherlv_9, grammarAccess.getStatemachineAccess().getLeftCurlyBracketKeyword_6_1());
                        
                    // ../ac.soton.xtext.iumlb.dsl/src-gen/ac/soton/xtext/iumlb/parser/antlr/internal/InternalDsl.g:250:1: ( (lv_nodes_10_0= ruleAbstractNode ) )
                    // ../ac.soton.xtext.iumlb.dsl/src-gen/ac/soton/xtext/iumlb/parser/antlr/internal/InternalDsl.g:251:1: (lv_nodes_10_0= ruleAbstractNode )
                    {
                    // ../ac.soton.xtext.iumlb.dsl/src-gen/ac/soton/xtext/iumlb/parser/antlr/internal/InternalDsl.g:251:1: (lv_nodes_10_0= ruleAbstractNode )
                    // ../ac.soton.xtext.iumlb.dsl/src-gen/ac/soton/xtext/iumlb/parser/antlr/internal/InternalDsl.g:252:3: lv_nodes_10_0= ruleAbstractNode
                    {
                     
                    	        newCompositeNode(grammarAccess.getStatemachineAccess().getNodesAbstractNodeParserRuleCall_6_2_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleAbstractNode_in_ruleStatemachine534);
                    lv_nodes_10_0=ruleAbstractNode();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getStatemachineRule());
                    	        }
                           		add(
                           			current, 
                           			"nodes",
                            		lv_nodes_10_0, 
                            		"AbstractNode");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../ac.soton.xtext.iumlb.dsl/src-gen/ac/soton/xtext/iumlb/parser/antlr/internal/InternalDsl.g:268:2: (otherlv_11= ',' ( (lv_nodes_12_0= ruleAbstractNode ) ) )*
                    loop5:
                    do {
                        int alt5=2;
                        int LA5_0 = input.LA(1);

                        if ( (LA5_0==17) ) {
                            alt5=1;
                        }


                        switch (alt5) {
                    	case 1 :
                    	    // ../ac.soton.xtext.iumlb.dsl/src-gen/ac/soton/xtext/iumlb/parser/antlr/internal/InternalDsl.g:268:4: otherlv_11= ',' ( (lv_nodes_12_0= ruleAbstractNode ) )
                    	    {
                    	    otherlv_11=(Token)match(input,17,FollowSets000.FOLLOW_17_in_ruleStatemachine547); 

                    	        	newLeafNode(otherlv_11, grammarAccess.getStatemachineAccess().getCommaKeyword_6_3_0());
                    	        
                    	    // ../ac.soton.xtext.iumlb.dsl/src-gen/ac/soton/xtext/iumlb/parser/antlr/internal/InternalDsl.g:272:1: ( (lv_nodes_12_0= ruleAbstractNode ) )
                    	    // ../ac.soton.xtext.iumlb.dsl/src-gen/ac/soton/xtext/iumlb/parser/antlr/internal/InternalDsl.g:273:1: (lv_nodes_12_0= ruleAbstractNode )
                    	    {
                    	    // ../ac.soton.xtext.iumlb.dsl/src-gen/ac/soton/xtext/iumlb/parser/antlr/internal/InternalDsl.g:273:1: (lv_nodes_12_0= ruleAbstractNode )
                    	    // ../ac.soton.xtext.iumlb.dsl/src-gen/ac/soton/xtext/iumlb/parser/antlr/internal/InternalDsl.g:274:3: lv_nodes_12_0= ruleAbstractNode
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getStatemachineAccess().getNodesAbstractNodeParserRuleCall_6_3_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleAbstractNode_in_ruleStatemachine568);
                    	    lv_nodes_12_0=ruleAbstractNode();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getStatemachineRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"nodes",
                    	            		lv_nodes_12_0, 
                    	            		"AbstractNode");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop5;
                        }
                    } while (true);

                    otherlv_13=(Token)match(input,18,FollowSets000.FOLLOW_18_in_ruleStatemachine582); 

                        	newLeafNode(otherlv_13, grammarAccess.getStatemachineAccess().getRightCurlyBracketKeyword_6_4());
                        

                    }
                    break;

            }

            // ../ac.soton.xtext.iumlb.dsl/src-gen/ac/soton/xtext/iumlb/parser/antlr/internal/InternalDsl.g:294:3: (otherlv_14= 'transitions' otherlv_15= '{' ( (lv_transitions_16_0= ruleTransition ) ) (otherlv_17= ',' ( (lv_transitions_18_0= ruleTransition ) ) )* otherlv_19= '}' )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==19) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // ../ac.soton.xtext.iumlb.dsl/src-gen/ac/soton/xtext/iumlb/parser/antlr/internal/InternalDsl.g:294:5: otherlv_14= 'transitions' otherlv_15= '{' ( (lv_transitions_16_0= ruleTransition ) ) (otherlv_17= ',' ( (lv_transitions_18_0= ruleTransition ) ) )* otherlv_19= '}'
                    {
                    otherlv_14=(Token)match(input,19,FollowSets000.FOLLOW_19_in_ruleStatemachine597); 

                        	newLeafNode(otherlv_14, grammarAccess.getStatemachineAccess().getTransitionsKeyword_7_0());
                        
                    otherlv_15=(Token)match(input,13,FollowSets000.FOLLOW_13_in_ruleStatemachine609); 

                        	newLeafNode(otherlv_15, grammarAccess.getStatemachineAccess().getLeftCurlyBracketKeyword_7_1());
                        
                    // ../ac.soton.xtext.iumlb.dsl/src-gen/ac/soton/xtext/iumlb/parser/antlr/internal/InternalDsl.g:302:1: ( (lv_transitions_16_0= ruleTransition ) )
                    // ../ac.soton.xtext.iumlb.dsl/src-gen/ac/soton/xtext/iumlb/parser/antlr/internal/InternalDsl.g:303:1: (lv_transitions_16_0= ruleTransition )
                    {
                    // ../ac.soton.xtext.iumlb.dsl/src-gen/ac/soton/xtext/iumlb/parser/antlr/internal/InternalDsl.g:303:1: (lv_transitions_16_0= ruleTransition )
                    // ../ac.soton.xtext.iumlb.dsl/src-gen/ac/soton/xtext/iumlb/parser/antlr/internal/InternalDsl.g:304:3: lv_transitions_16_0= ruleTransition
                    {
                     
                    	        newCompositeNode(grammarAccess.getStatemachineAccess().getTransitionsTransitionParserRuleCall_7_2_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleTransition_in_ruleStatemachine630);
                    lv_transitions_16_0=ruleTransition();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getStatemachineRule());
                    	        }
                           		add(
                           			current, 
                           			"transitions",
                            		lv_transitions_16_0, 
                            		"Transition");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../ac.soton.xtext.iumlb.dsl/src-gen/ac/soton/xtext/iumlb/parser/antlr/internal/InternalDsl.g:320:2: (otherlv_17= ',' ( (lv_transitions_18_0= ruleTransition ) ) )*
                    loop7:
                    do {
                        int alt7=2;
                        int LA7_0 = input.LA(1);

                        if ( (LA7_0==17) ) {
                            alt7=1;
                        }


                        switch (alt7) {
                    	case 1 :
                    	    // ../ac.soton.xtext.iumlb.dsl/src-gen/ac/soton/xtext/iumlb/parser/antlr/internal/InternalDsl.g:320:4: otherlv_17= ',' ( (lv_transitions_18_0= ruleTransition ) )
                    	    {
                    	    otherlv_17=(Token)match(input,17,FollowSets000.FOLLOW_17_in_ruleStatemachine643); 

                    	        	newLeafNode(otherlv_17, grammarAccess.getStatemachineAccess().getCommaKeyword_7_3_0());
                    	        
                    	    // ../ac.soton.xtext.iumlb.dsl/src-gen/ac/soton/xtext/iumlb/parser/antlr/internal/InternalDsl.g:324:1: ( (lv_transitions_18_0= ruleTransition ) )
                    	    // ../ac.soton.xtext.iumlb.dsl/src-gen/ac/soton/xtext/iumlb/parser/antlr/internal/InternalDsl.g:325:1: (lv_transitions_18_0= ruleTransition )
                    	    {
                    	    // ../ac.soton.xtext.iumlb.dsl/src-gen/ac/soton/xtext/iumlb/parser/antlr/internal/InternalDsl.g:325:1: (lv_transitions_18_0= ruleTransition )
                    	    // ../ac.soton.xtext.iumlb.dsl/src-gen/ac/soton/xtext/iumlb/parser/antlr/internal/InternalDsl.g:326:3: lv_transitions_18_0= ruleTransition
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getStatemachineAccess().getTransitionsTransitionParserRuleCall_7_3_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleTransition_in_ruleStatemachine664);
                    	    lv_transitions_18_0=ruleTransition();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getStatemachineRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"transitions",
                    	            		lv_transitions_18_0, 
                    	            		"Transition");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop7;
                        }
                    } while (true);

                    otherlv_19=(Token)match(input,18,FollowSets000.FOLLOW_18_in_ruleStatemachine678); 

                        	newLeafNode(otherlv_19, grammarAccess.getStatemachineAccess().getRightCurlyBracketKeyword_7_4());
                        

                    }
                    break;

            }

            otherlv_20=(Token)match(input,18,FollowSets000.FOLLOW_18_in_ruleStatemachine692); 

                	newLeafNode(otherlv_20, grammarAccess.getStatemachineAccess().getRightCurlyBracketKeyword_8());
                

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
    // $ANTLR end "ruleStatemachine"


    // $ANTLR start "entryRuleState"
    // ../ac.soton.xtext.iumlb.dsl/src-gen/ac/soton/xtext/iumlb/parser/antlr/internal/InternalDsl.g:358:1: entryRuleState returns [EObject current=null] : iv_ruleState= ruleState EOF ;
    public final EObject entryRuleState() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleState = null;


        try {
            // ../ac.soton.xtext.iumlb.dsl/src-gen/ac/soton/xtext/iumlb/parser/antlr/internal/InternalDsl.g:359:2: (iv_ruleState= ruleState EOF )
            // ../ac.soton.xtext.iumlb.dsl/src-gen/ac/soton/xtext/iumlb/parser/antlr/internal/InternalDsl.g:360:2: iv_ruleState= ruleState EOF
            {
             newCompositeNode(grammarAccess.getStateRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleState_in_entryRuleState728);
            iv_ruleState=ruleState();

            state._fsp--;

             current =iv_ruleState; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleState738); 

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
    // $ANTLR end "entryRuleState"


    // $ANTLR start "ruleState"
    // ../ac.soton.xtext.iumlb.dsl/src-gen/ac/soton/xtext/iumlb/parser/antlr/internal/InternalDsl.g:367:1: ruleState returns [EObject current=null] : ( () ( (lv_localGenerated_1_0= 'localGenerated' ) )? otherlv_2= 'State' ( (lv_name_3_0= ruleEString ) ) otherlv_4= '{' (otherlv_5= 'incoming' otherlv_6= '(' ( ( ruleEString ) ) (otherlv_8= ',' ( ( ruleEString ) ) )* otherlv_10= ')' )? (otherlv_11= 'outgoing' otherlv_12= '(' ( ( ruleEString ) ) (otherlv_14= ',' ( ( ruleEString ) ) )* otherlv_16= ')' )? (otherlv_17= 'refines' ( ( ruleEString ) ) )? (otherlv_19= 'statemachines' otherlv_20= '{' ( (lv_statemachines_21_0= ruleStatemachine ) ) (otherlv_22= ',' ( (lv_statemachines_23_0= ruleStatemachine ) ) )* otherlv_24= '}' )? (otherlv_25= 'invariants' otherlv_26= '{' ( (lv_invariants_27_0= ruleInvariant ) ) (otherlv_28= ',' ( (lv_invariants_29_0= ruleInvariant ) ) )* otherlv_30= '}' )? otherlv_31= '}' ) ;
    public final EObject ruleState() throws RecognitionException {
        EObject current = null;

        Token lv_localGenerated_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        Token otherlv_14=null;
        Token otherlv_16=null;
        Token otherlv_17=null;
        Token otherlv_19=null;
        Token otherlv_20=null;
        Token otherlv_22=null;
        Token otherlv_24=null;
        Token otherlv_25=null;
        Token otherlv_26=null;
        Token otherlv_28=null;
        Token otherlv_30=null;
        Token otherlv_31=null;
        AntlrDatatypeRuleToken lv_name_3_0 = null;

        EObject lv_statemachines_21_0 = null;

        EObject lv_statemachines_23_0 = null;

        EObject lv_invariants_27_0 = null;

        EObject lv_invariants_29_0 = null;


         enterRule(); 
            
        try {
            // ../ac.soton.xtext.iumlb.dsl/src-gen/ac/soton/xtext/iumlb/parser/antlr/internal/InternalDsl.g:370:28: ( ( () ( (lv_localGenerated_1_0= 'localGenerated' ) )? otherlv_2= 'State' ( (lv_name_3_0= ruleEString ) ) otherlv_4= '{' (otherlv_5= 'incoming' otherlv_6= '(' ( ( ruleEString ) ) (otherlv_8= ',' ( ( ruleEString ) ) )* otherlv_10= ')' )? (otherlv_11= 'outgoing' otherlv_12= '(' ( ( ruleEString ) ) (otherlv_14= ',' ( ( ruleEString ) ) )* otherlv_16= ')' )? (otherlv_17= 'refines' ( ( ruleEString ) ) )? (otherlv_19= 'statemachines' otherlv_20= '{' ( (lv_statemachines_21_0= ruleStatemachine ) ) (otherlv_22= ',' ( (lv_statemachines_23_0= ruleStatemachine ) ) )* otherlv_24= '}' )? (otherlv_25= 'invariants' otherlv_26= '{' ( (lv_invariants_27_0= ruleInvariant ) ) (otherlv_28= ',' ( (lv_invariants_29_0= ruleInvariant ) ) )* otherlv_30= '}' )? otherlv_31= '}' ) )
            // ../ac.soton.xtext.iumlb.dsl/src-gen/ac/soton/xtext/iumlb/parser/antlr/internal/InternalDsl.g:371:1: ( () ( (lv_localGenerated_1_0= 'localGenerated' ) )? otherlv_2= 'State' ( (lv_name_3_0= ruleEString ) ) otherlv_4= '{' (otherlv_5= 'incoming' otherlv_6= '(' ( ( ruleEString ) ) (otherlv_8= ',' ( ( ruleEString ) ) )* otherlv_10= ')' )? (otherlv_11= 'outgoing' otherlv_12= '(' ( ( ruleEString ) ) (otherlv_14= ',' ( ( ruleEString ) ) )* otherlv_16= ')' )? (otherlv_17= 'refines' ( ( ruleEString ) ) )? (otherlv_19= 'statemachines' otherlv_20= '{' ( (lv_statemachines_21_0= ruleStatemachine ) ) (otherlv_22= ',' ( (lv_statemachines_23_0= ruleStatemachine ) ) )* otherlv_24= '}' )? (otherlv_25= 'invariants' otherlv_26= '{' ( (lv_invariants_27_0= ruleInvariant ) ) (otherlv_28= ',' ( (lv_invariants_29_0= ruleInvariant ) ) )* otherlv_30= '}' )? otherlv_31= '}' )
            {
            // ../ac.soton.xtext.iumlb.dsl/src-gen/ac/soton/xtext/iumlb/parser/antlr/internal/InternalDsl.g:371:1: ( () ( (lv_localGenerated_1_0= 'localGenerated' ) )? otherlv_2= 'State' ( (lv_name_3_0= ruleEString ) ) otherlv_4= '{' (otherlv_5= 'incoming' otherlv_6= '(' ( ( ruleEString ) ) (otherlv_8= ',' ( ( ruleEString ) ) )* otherlv_10= ')' )? (otherlv_11= 'outgoing' otherlv_12= '(' ( ( ruleEString ) ) (otherlv_14= ',' ( ( ruleEString ) ) )* otherlv_16= ')' )? (otherlv_17= 'refines' ( ( ruleEString ) ) )? (otherlv_19= 'statemachines' otherlv_20= '{' ( (lv_statemachines_21_0= ruleStatemachine ) ) (otherlv_22= ',' ( (lv_statemachines_23_0= ruleStatemachine ) ) )* otherlv_24= '}' )? (otherlv_25= 'invariants' otherlv_26= '{' ( (lv_invariants_27_0= ruleInvariant ) ) (otherlv_28= ',' ( (lv_invariants_29_0= ruleInvariant ) ) )* otherlv_30= '}' )? otherlv_31= '}' )
            // ../ac.soton.xtext.iumlb.dsl/src-gen/ac/soton/xtext/iumlb/parser/antlr/internal/InternalDsl.g:371:2: () ( (lv_localGenerated_1_0= 'localGenerated' ) )? otherlv_2= 'State' ( (lv_name_3_0= ruleEString ) ) otherlv_4= '{' (otherlv_5= 'incoming' otherlv_6= '(' ( ( ruleEString ) ) (otherlv_8= ',' ( ( ruleEString ) ) )* otherlv_10= ')' )? (otherlv_11= 'outgoing' otherlv_12= '(' ( ( ruleEString ) ) (otherlv_14= ',' ( ( ruleEString ) ) )* otherlv_16= ')' )? (otherlv_17= 'refines' ( ( ruleEString ) ) )? (otherlv_19= 'statemachines' otherlv_20= '{' ( (lv_statemachines_21_0= ruleStatemachine ) ) (otherlv_22= ',' ( (lv_statemachines_23_0= ruleStatemachine ) ) )* otherlv_24= '}' )? (otherlv_25= 'invariants' otherlv_26= '{' ( (lv_invariants_27_0= ruleInvariant ) ) (otherlv_28= ',' ( (lv_invariants_29_0= ruleInvariant ) ) )* otherlv_30= '}' )? otherlv_31= '}'
            {
            // ../ac.soton.xtext.iumlb.dsl/src-gen/ac/soton/xtext/iumlb/parser/antlr/internal/InternalDsl.g:371:2: ()
            // ../ac.soton.xtext.iumlb.dsl/src-gen/ac/soton/xtext/iumlb/parser/antlr/internal/InternalDsl.g:372:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getStateAccess().getStateAction_0(),
                        current);
                

            }

            // ../ac.soton.xtext.iumlb.dsl/src-gen/ac/soton/xtext/iumlb/parser/antlr/internal/InternalDsl.g:377:2: ( (lv_localGenerated_1_0= 'localGenerated' ) )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==11) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // ../ac.soton.xtext.iumlb.dsl/src-gen/ac/soton/xtext/iumlb/parser/antlr/internal/InternalDsl.g:378:1: (lv_localGenerated_1_0= 'localGenerated' )
                    {
                    // ../ac.soton.xtext.iumlb.dsl/src-gen/ac/soton/xtext/iumlb/parser/antlr/internal/InternalDsl.g:378:1: (lv_localGenerated_1_0= 'localGenerated' )
                    // ../ac.soton.xtext.iumlb.dsl/src-gen/ac/soton/xtext/iumlb/parser/antlr/internal/InternalDsl.g:379:3: lv_localGenerated_1_0= 'localGenerated'
                    {
                    lv_localGenerated_1_0=(Token)match(input,11,FollowSets000.FOLLOW_11_in_ruleState790); 

                            newLeafNode(lv_localGenerated_1_0, grammarAccess.getStateAccess().getLocalGeneratedLocalGeneratedKeyword_1_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getStateRule());
                    	        }
                           		setWithLastConsumed(current, "localGenerated", true, "localGenerated");
                    	    

                    }


                    }
                    break;

            }

            otherlv_2=(Token)match(input,20,FollowSets000.FOLLOW_20_in_ruleState816); 

                	newLeafNode(otherlv_2, grammarAccess.getStateAccess().getStateKeyword_2());
                
            // ../ac.soton.xtext.iumlb.dsl/src-gen/ac/soton/xtext/iumlb/parser/antlr/internal/InternalDsl.g:396:1: ( (lv_name_3_0= ruleEString ) )
            // ../ac.soton.xtext.iumlb.dsl/src-gen/ac/soton/xtext/iumlb/parser/antlr/internal/InternalDsl.g:397:1: (lv_name_3_0= ruleEString )
            {
            // ../ac.soton.xtext.iumlb.dsl/src-gen/ac/soton/xtext/iumlb/parser/antlr/internal/InternalDsl.g:397:1: (lv_name_3_0= ruleEString )
            // ../ac.soton.xtext.iumlb.dsl/src-gen/ac/soton/xtext/iumlb/parser/antlr/internal/InternalDsl.g:398:3: lv_name_3_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getStateAccess().getNameEStringParserRuleCall_3_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleState837);
            lv_name_3_0=ruleEString();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getStateRule());
            	        }
                   		set(
                   			current, 
                   			"name",
                    		lv_name_3_0, 
                    		"EString");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_4=(Token)match(input,13,FollowSets000.FOLLOW_13_in_ruleState849); 

                	newLeafNode(otherlv_4, grammarAccess.getStateAccess().getLeftCurlyBracketKeyword_4());
                
            // ../ac.soton.xtext.iumlb.dsl/src-gen/ac/soton/xtext/iumlb/parser/antlr/internal/InternalDsl.g:418:1: (otherlv_5= 'incoming' otherlv_6= '(' ( ( ruleEString ) ) (otherlv_8= ',' ( ( ruleEString ) ) )* otherlv_10= ')' )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==21) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // ../ac.soton.xtext.iumlb.dsl/src-gen/ac/soton/xtext/iumlb/parser/antlr/internal/InternalDsl.g:418:3: otherlv_5= 'incoming' otherlv_6= '(' ( ( ruleEString ) ) (otherlv_8= ',' ( ( ruleEString ) ) )* otherlv_10= ')'
                    {
                    otherlv_5=(Token)match(input,21,FollowSets000.FOLLOW_21_in_ruleState862); 

                        	newLeafNode(otherlv_5, grammarAccess.getStateAccess().getIncomingKeyword_5_0());
                        
                    otherlv_6=(Token)match(input,22,FollowSets000.FOLLOW_22_in_ruleState874); 

                        	newLeafNode(otherlv_6, grammarAccess.getStateAccess().getLeftParenthesisKeyword_5_1());
                        
                    // ../ac.soton.xtext.iumlb.dsl/src-gen/ac/soton/xtext/iumlb/parser/antlr/internal/InternalDsl.g:426:1: ( ( ruleEString ) )
                    // ../ac.soton.xtext.iumlb.dsl/src-gen/ac/soton/xtext/iumlb/parser/antlr/internal/InternalDsl.g:427:1: ( ruleEString )
                    {
                    // ../ac.soton.xtext.iumlb.dsl/src-gen/ac/soton/xtext/iumlb/parser/antlr/internal/InternalDsl.g:427:1: ( ruleEString )
                    // ../ac.soton.xtext.iumlb.dsl/src-gen/ac/soton/xtext/iumlb/parser/antlr/internal/InternalDsl.g:428:3: ruleEString
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getStateRule());
                    	        }
                            
                     
                    	        newCompositeNode(grammarAccess.getStateAccess().getIncomingTransitionCrossReference_5_2_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleState897);
                    ruleEString();

                    state._fsp--;

                     
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../ac.soton.xtext.iumlb.dsl/src-gen/ac/soton/xtext/iumlb/parser/antlr/internal/InternalDsl.g:441:2: (otherlv_8= ',' ( ( ruleEString ) ) )*
                    loop10:
                    do {
                        int alt10=2;
                        int LA10_0 = input.LA(1);

                        if ( (LA10_0==17) ) {
                            alt10=1;
                        }


                        switch (alt10) {
                    	case 1 :
                    	    // ../ac.soton.xtext.iumlb.dsl/src-gen/ac/soton/xtext/iumlb/parser/antlr/internal/InternalDsl.g:441:4: otherlv_8= ',' ( ( ruleEString ) )
                    	    {
                    	    otherlv_8=(Token)match(input,17,FollowSets000.FOLLOW_17_in_ruleState910); 

                    	        	newLeafNode(otherlv_8, grammarAccess.getStateAccess().getCommaKeyword_5_3_0());
                    	        
                    	    // ../ac.soton.xtext.iumlb.dsl/src-gen/ac/soton/xtext/iumlb/parser/antlr/internal/InternalDsl.g:445:1: ( ( ruleEString ) )
                    	    // ../ac.soton.xtext.iumlb.dsl/src-gen/ac/soton/xtext/iumlb/parser/antlr/internal/InternalDsl.g:446:1: ( ruleEString )
                    	    {
                    	    // ../ac.soton.xtext.iumlb.dsl/src-gen/ac/soton/xtext/iumlb/parser/antlr/internal/InternalDsl.g:446:1: ( ruleEString )
                    	    // ../ac.soton.xtext.iumlb.dsl/src-gen/ac/soton/xtext/iumlb/parser/antlr/internal/InternalDsl.g:447:3: ruleEString
                    	    {

                    	    			if (current==null) {
                    	    	            current = createModelElement(grammarAccess.getStateRule());
                    	    	        }
                    	            
                    	     
                    	    	        newCompositeNode(grammarAccess.getStateAccess().getIncomingTransitionCrossReference_5_3_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleState933);
                    	    ruleEString();

                    	    state._fsp--;

                    	     
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop10;
                        }
                    } while (true);

                    otherlv_10=(Token)match(input,23,FollowSets000.FOLLOW_23_in_ruleState947); 

                        	newLeafNode(otherlv_10, grammarAccess.getStateAccess().getRightParenthesisKeyword_5_4());
                        

                    }
                    break;

            }

            // ../ac.soton.xtext.iumlb.dsl/src-gen/ac/soton/xtext/iumlb/parser/antlr/internal/InternalDsl.g:464:3: (otherlv_11= 'outgoing' otherlv_12= '(' ( ( ruleEString ) ) (otherlv_14= ',' ( ( ruleEString ) ) )* otherlv_16= ')' )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==24) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // ../ac.soton.xtext.iumlb.dsl/src-gen/ac/soton/xtext/iumlb/parser/antlr/internal/InternalDsl.g:464:5: otherlv_11= 'outgoing' otherlv_12= '(' ( ( ruleEString ) ) (otherlv_14= ',' ( ( ruleEString ) ) )* otherlv_16= ')'
                    {
                    otherlv_11=(Token)match(input,24,FollowSets000.FOLLOW_24_in_ruleState962); 

                        	newLeafNode(otherlv_11, grammarAccess.getStateAccess().getOutgoingKeyword_6_0());
                        
                    otherlv_12=(Token)match(input,22,FollowSets000.FOLLOW_22_in_ruleState974); 

                        	newLeafNode(otherlv_12, grammarAccess.getStateAccess().getLeftParenthesisKeyword_6_1());
                        
                    // ../ac.soton.xtext.iumlb.dsl/src-gen/ac/soton/xtext/iumlb/parser/antlr/internal/InternalDsl.g:472:1: ( ( ruleEString ) )
                    // ../ac.soton.xtext.iumlb.dsl/src-gen/ac/soton/xtext/iumlb/parser/antlr/internal/InternalDsl.g:473:1: ( ruleEString )
                    {
                    // ../ac.soton.xtext.iumlb.dsl/src-gen/ac/soton/xtext/iumlb/parser/antlr/internal/InternalDsl.g:473:1: ( ruleEString )
                    // ../ac.soton.xtext.iumlb.dsl/src-gen/ac/soton/xtext/iumlb/parser/antlr/internal/InternalDsl.g:474:3: ruleEString
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getStateRule());
                    	        }
                            
                     
                    	        newCompositeNode(grammarAccess.getStateAccess().getOutgoingTransitionCrossReference_6_2_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleState997);
                    ruleEString();

                    state._fsp--;

                     
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../ac.soton.xtext.iumlb.dsl/src-gen/ac/soton/xtext/iumlb/parser/antlr/internal/InternalDsl.g:487:2: (otherlv_14= ',' ( ( ruleEString ) ) )*
                    loop12:
                    do {
                        int alt12=2;
                        int LA12_0 = input.LA(1);

                        if ( (LA12_0==17) ) {
                            alt12=1;
                        }


                        switch (alt12) {
                    	case 1 :
                    	    // ../ac.soton.xtext.iumlb.dsl/src-gen/ac/soton/xtext/iumlb/parser/antlr/internal/InternalDsl.g:487:4: otherlv_14= ',' ( ( ruleEString ) )
                    	    {
                    	    otherlv_14=(Token)match(input,17,FollowSets000.FOLLOW_17_in_ruleState1010); 

                    	        	newLeafNode(otherlv_14, grammarAccess.getStateAccess().getCommaKeyword_6_3_0());
                    	        
                    	    // ../ac.soton.xtext.iumlb.dsl/src-gen/ac/soton/xtext/iumlb/parser/antlr/internal/InternalDsl.g:491:1: ( ( ruleEString ) )
                    	    // ../ac.soton.xtext.iumlb.dsl/src-gen/ac/soton/xtext/iumlb/parser/antlr/internal/InternalDsl.g:492:1: ( ruleEString )
                    	    {
                    	    // ../ac.soton.xtext.iumlb.dsl/src-gen/ac/soton/xtext/iumlb/parser/antlr/internal/InternalDsl.g:492:1: ( ruleEString )
                    	    // ../ac.soton.xtext.iumlb.dsl/src-gen/ac/soton/xtext/iumlb/parser/antlr/internal/InternalDsl.g:493:3: ruleEString
                    	    {

                    	    			if (current==null) {
                    	    	            current = createModelElement(grammarAccess.getStateRule());
                    	    	        }
                    	            
                    	     
                    	    	        newCompositeNode(grammarAccess.getStateAccess().getOutgoingTransitionCrossReference_6_3_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleState1033);
                    	    ruleEString();

                    	    state._fsp--;

                    	     
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop12;
                        }
                    } while (true);

                    otherlv_16=(Token)match(input,23,FollowSets000.FOLLOW_23_in_ruleState1047); 

                        	newLeafNode(otherlv_16, grammarAccess.getStateAccess().getRightParenthesisKeyword_6_4());
                        

                    }
                    break;

            }

            // ../ac.soton.xtext.iumlb.dsl/src-gen/ac/soton/xtext/iumlb/parser/antlr/internal/InternalDsl.g:510:3: (otherlv_17= 'refines' ( ( ruleEString ) ) )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==15) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // ../ac.soton.xtext.iumlb.dsl/src-gen/ac/soton/xtext/iumlb/parser/antlr/internal/InternalDsl.g:510:5: otherlv_17= 'refines' ( ( ruleEString ) )
                    {
                    otherlv_17=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleState1062); 

                        	newLeafNode(otherlv_17, grammarAccess.getStateAccess().getRefinesKeyword_7_0());
                        
                    // ../ac.soton.xtext.iumlb.dsl/src-gen/ac/soton/xtext/iumlb/parser/antlr/internal/InternalDsl.g:514:1: ( ( ruleEString ) )
                    // ../ac.soton.xtext.iumlb.dsl/src-gen/ac/soton/xtext/iumlb/parser/antlr/internal/InternalDsl.g:515:1: ( ruleEString )
                    {
                    // ../ac.soton.xtext.iumlb.dsl/src-gen/ac/soton/xtext/iumlb/parser/antlr/internal/InternalDsl.g:515:1: ( ruleEString )
                    // ../ac.soton.xtext.iumlb.dsl/src-gen/ac/soton/xtext/iumlb/parser/antlr/internal/InternalDsl.g:516:3: ruleEString
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getStateRule());
                    	        }
                            
                     
                    	        newCompositeNode(grammarAccess.getStateAccess().getRefinesStateCrossReference_7_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleState1085);
                    ruleEString();

                    state._fsp--;

                     
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../ac.soton.xtext.iumlb.dsl/src-gen/ac/soton/xtext/iumlb/parser/antlr/internal/InternalDsl.g:529:4: (otherlv_19= 'statemachines' otherlv_20= '{' ( (lv_statemachines_21_0= ruleStatemachine ) ) (otherlv_22= ',' ( (lv_statemachines_23_0= ruleStatemachine ) ) )* otherlv_24= '}' )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==25) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // ../ac.soton.xtext.iumlb.dsl/src-gen/ac/soton/xtext/iumlb/parser/antlr/internal/InternalDsl.g:529:6: otherlv_19= 'statemachines' otherlv_20= '{' ( (lv_statemachines_21_0= ruleStatemachine ) ) (otherlv_22= ',' ( (lv_statemachines_23_0= ruleStatemachine ) ) )* otherlv_24= '}'
                    {
                    otherlv_19=(Token)match(input,25,FollowSets000.FOLLOW_25_in_ruleState1100); 

                        	newLeafNode(otherlv_19, grammarAccess.getStateAccess().getStatemachinesKeyword_8_0());
                        
                    otherlv_20=(Token)match(input,13,FollowSets000.FOLLOW_13_in_ruleState1112); 

                        	newLeafNode(otherlv_20, grammarAccess.getStateAccess().getLeftCurlyBracketKeyword_8_1());
                        
                    // ../ac.soton.xtext.iumlb.dsl/src-gen/ac/soton/xtext/iumlb/parser/antlr/internal/InternalDsl.g:537:1: ( (lv_statemachines_21_0= ruleStatemachine ) )
                    // ../ac.soton.xtext.iumlb.dsl/src-gen/ac/soton/xtext/iumlb/parser/antlr/internal/InternalDsl.g:538:1: (lv_statemachines_21_0= ruleStatemachine )
                    {
                    // ../ac.soton.xtext.iumlb.dsl/src-gen/ac/soton/xtext/iumlb/parser/antlr/internal/InternalDsl.g:538:1: (lv_statemachines_21_0= ruleStatemachine )
                    // ../ac.soton.xtext.iumlb.dsl/src-gen/ac/soton/xtext/iumlb/parser/antlr/internal/InternalDsl.g:539:3: lv_statemachines_21_0= ruleStatemachine
                    {
                     
                    	        newCompositeNode(grammarAccess.getStateAccess().getStatemachinesStatemachineParserRuleCall_8_2_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleStatemachine_in_ruleState1133);
                    lv_statemachines_21_0=ruleStatemachine();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getStateRule());
                    	        }
                           		add(
                           			current, 
                           			"statemachines",
                            		lv_statemachines_21_0, 
                            		"Statemachine");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../ac.soton.xtext.iumlb.dsl/src-gen/ac/soton/xtext/iumlb/parser/antlr/internal/InternalDsl.g:555:2: (otherlv_22= ',' ( (lv_statemachines_23_0= ruleStatemachine ) ) )*
                    loop15:
                    do {
                        int alt15=2;
                        int LA15_0 = input.LA(1);

                        if ( (LA15_0==17) ) {
                            alt15=1;
                        }


                        switch (alt15) {
                    	case 1 :
                    	    // ../ac.soton.xtext.iumlb.dsl/src-gen/ac/soton/xtext/iumlb/parser/antlr/internal/InternalDsl.g:555:4: otherlv_22= ',' ( (lv_statemachines_23_0= ruleStatemachine ) )
                    	    {
                    	    otherlv_22=(Token)match(input,17,FollowSets000.FOLLOW_17_in_ruleState1146); 

                    	        	newLeafNode(otherlv_22, grammarAccess.getStateAccess().getCommaKeyword_8_3_0());
                    	        
                    	    // ../ac.soton.xtext.iumlb.dsl/src-gen/ac/soton/xtext/iumlb/parser/antlr/internal/InternalDsl.g:559:1: ( (lv_statemachines_23_0= ruleStatemachine ) )
                    	    // ../ac.soton.xtext.iumlb.dsl/src-gen/ac/soton/xtext/iumlb/parser/antlr/internal/InternalDsl.g:560:1: (lv_statemachines_23_0= ruleStatemachine )
                    	    {
                    	    // ../ac.soton.xtext.iumlb.dsl/src-gen/ac/soton/xtext/iumlb/parser/antlr/internal/InternalDsl.g:560:1: (lv_statemachines_23_0= ruleStatemachine )
                    	    // ../ac.soton.xtext.iumlb.dsl/src-gen/ac/soton/xtext/iumlb/parser/antlr/internal/InternalDsl.g:561:3: lv_statemachines_23_0= ruleStatemachine
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getStateAccess().getStatemachinesStatemachineParserRuleCall_8_3_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleStatemachine_in_ruleState1167);
                    	    lv_statemachines_23_0=ruleStatemachine();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getStateRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"statemachines",
                    	            		lv_statemachines_23_0, 
                    	            		"Statemachine");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop15;
                        }
                    } while (true);

                    otherlv_24=(Token)match(input,18,FollowSets000.FOLLOW_18_in_ruleState1181); 

                        	newLeafNode(otherlv_24, grammarAccess.getStateAccess().getRightCurlyBracketKeyword_8_4());
                        

                    }
                    break;

            }

            // ../ac.soton.xtext.iumlb.dsl/src-gen/ac/soton/xtext/iumlb/parser/antlr/internal/InternalDsl.g:581:3: (otherlv_25= 'invariants' otherlv_26= '{' ( (lv_invariants_27_0= ruleInvariant ) ) (otherlv_28= ',' ( (lv_invariants_29_0= ruleInvariant ) ) )* otherlv_30= '}' )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==26) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // ../ac.soton.xtext.iumlb.dsl/src-gen/ac/soton/xtext/iumlb/parser/antlr/internal/InternalDsl.g:581:5: otherlv_25= 'invariants' otherlv_26= '{' ( (lv_invariants_27_0= ruleInvariant ) ) (otherlv_28= ',' ( (lv_invariants_29_0= ruleInvariant ) ) )* otherlv_30= '}'
                    {
                    otherlv_25=(Token)match(input,26,FollowSets000.FOLLOW_26_in_ruleState1196); 

                        	newLeafNode(otherlv_25, grammarAccess.getStateAccess().getInvariantsKeyword_9_0());
                        
                    otherlv_26=(Token)match(input,13,FollowSets000.FOLLOW_13_in_ruleState1208); 

                        	newLeafNode(otherlv_26, grammarAccess.getStateAccess().getLeftCurlyBracketKeyword_9_1());
                        
                    // ../ac.soton.xtext.iumlb.dsl/src-gen/ac/soton/xtext/iumlb/parser/antlr/internal/InternalDsl.g:589:1: ( (lv_invariants_27_0= ruleInvariant ) )
                    // ../ac.soton.xtext.iumlb.dsl/src-gen/ac/soton/xtext/iumlb/parser/antlr/internal/InternalDsl.g:590:1: (lv_invariants_27_0= ruleInvariant )
                    {
                    // ../ac.soton.xtext.iumlb.dsl/src-gen/ac/soton/xtext/iumlb/parser/antlr/internal/InternalDsl.g:590:1: (lv_invariants_27_0= ruleInvariant )
                    // ../ac.soton.xtext.iumlb.dsl/src-gen/ac/soton/xtext/iumlb/parser/antlr/internal/InternalDsl.g:591:3: lv_invariants_27_0= ruleInvariant
                    {
                     
                    	        newCompositeNode(grammarAccess.getStateAccess().getInvariantsInvariantParserRuleCall_9_2_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleInvariant_in_ruleState1229);
                    lv_invariants_27_0=ruleInvariant();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getStateRule());
                    	        }
                           		add(
                           			current, 
                           			"invariants",
                            		lv_invariants_27_0, 
                            		"Invariant");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../ac.soton.xtext.iumlb.dsl/src-gen/ac/soton/xtext/iumlb/parser/antlr/internal/InternalDsl.g:607:2: (otherlv_28= ',' ( (lv_invariants_29_0= ruleInvariant ) ) )*
                    loop17:
                    do {
                        int alt17=2;
                        int LA17_0 = input.LA(1);

                        if ( (LA17_0==17) ) {
                            alt17=1;
                        }


                        switch (alt17) {
                    	case 1 :
                    	    // ../ac.soton.xtext.iumlb.dsl/src-gen/ac/soton/xtext/iumlb/parser/antlr/internal/InternalDsl.g:607:4: otherlv_28= ',' ( (lv_invariants_29_0= ruleInvariant ) )
                    	    {
                    	    otherlv_28=(Token)match(input,17,FollowSets000.FOLLOW_17_in_ruleState1242); 

                    	        	newLeafNode(otherlv_28, grammarAccess.getStateAccess().getCommaKeyword_9_3_0());
                    	        
                    	    // ../ac.soton.xtext.iumlb.dsl/src-gen/ac/soton/xtext/iumlb/parser/antlr/internal/InternalDsl.g:611:1: ( (lv_invariants_29_0= ruleInvariant ) )
                    	    // ../ac.soton.xtext.iumlb.dsl/src-gen/ac/soton/xtext/iumlb/parser/antlr/internal/InternalDsl.g:612:1: (lv_invariants_29_0= ruleInvariant )
                    	    {
                    	    // ../ac.soton.xtext.iumlb.dsl/src-gen/ac/soton/xtext/iumlb/parser/antlr/internal/InternalDsl.g:612:1: (lv_invariants_29_0= ruleInvariant )
                    	    // ../ac.soton.xtext.iumlb.dsl/src-gen/ac/soton/xtext/iumlb/parser/antlr/internal/InternalDsl.g:613:3: lv_invariants_29_0= ruleInvariant
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getStateAccess().getInvariantsInvariantParserRuleCall_9_3_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleInvariant_in_ruleState1263);
                    	    lv_invariants_29_0=ruleInvariant();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getStateRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"invariants",
                    	            		lv_invariants_29_0, 
                    	            		"Invariant");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop17;
                        }
                    } while (true);

                    otherlv_30=(Token)match(input,18,FollowSets000.FOLLOW_18_in_ruleState1277); 

                        	newLeafNode(otherlv_30, grammarAccess.getStateAccess().getRightCurlyBracketKeyword_9_4());
                        

                    }
                    break;

            }

            otherlv_31=(Token)match(input,18,FollowSets000.FOLLOW_18_in_ruleState1291); 

                	newLeafNode(otherlv_31, grammarAccess.getStateAccess().getRightCurlyBracketKeyword_10());
                

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
    // $ANTLR end "ruleState"


    // $ANTLR start "entryRuleEString"
    // ../ac.soton.xtext.iumlb.dsl/src-gen/ac/soton/xtext/iumlb/parser/antlr/internal/InternalDsl.g:647:1: entryRuleEString returns [String current=null] : iv_ruleEString= ruleEString EOF ;
    public final String entryRuleEString() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEString = null;


        try {
            // ../ac.soton.xtext.iumlb.dsl/src-gen/ac/soton/xtext/iumlb/parser/antlr/internal/InternalDsl.g:648:2: (iv_ruleEString= ruleEString EOF )
            // ../ac.soton.xtext.iumlb.dsl/src-gen/ac/soton/xtext/iumlb/parser/antlr/internal/InternalDsl.g:649:2: iv_ruleEString= ruleEString EOF
            {
             newCompositeNode(grammarAccess.getEStringRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_entryRuleEString1330);
            iv_ruleEString=ruleEString();

            state._fsp--;

             current =iv_ruleEString.getText(); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleEString1341); 

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
    // ../ac.soton.xtext.iumlb.dsl/src-gen/ac/soton/xtext/iumlb/parser/antlr/internal/InternalDsl.g:656:1: ruleEString returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) ;
    public final AntlrDatatypeRuleToken ruleEString() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;
        Token this_ID_1=null;

         enterRule(); 
            
        try {
            // ../ac.soton.xtext.iumlb.dsl/src-gen/ac/soton/xtext/iumlb/parser/antlr/internal/InternalDsl.g:659:28: ( (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) )
            // ../ac.soton.xtext.iumlb.dsl/src-gen/ac/soton/xtext/iumlb/parser/antlr/internal/InternalDsl.g:660:1: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            {
            // ../ac.soton.xtext.iumlb.dsl/src-gen/ac/soton/xtext/iumlb/parser/antlr/internal/InternalDsl.g:660:1: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==RULE_STRING) ) {
                alt19=1;
            }
            else if ( (LA19_0==RULE_ID) ) {
                alt19=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 19, 0, input);

                throw nvae;
            }
            switch (alt19) {
                case 1 :
                    // ../ac.soton.xtext.iumlb.dsl/src-gen/ac/soton/xtext/iumlb/parser/antlr/internal/InternalDsl.g:660:6: this_STRING_0= RULE_STRING
                    {
                    this_STRING_0=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_RULE_STRING_in_ruleEString1381); 

                    		current.merge(this_STRING_0);
                        
                     
                        newLeafNode(this_STRING_0, grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 
                        

                    }
                    break;
                case 2 :
                    // ../ac.soton.xtext.iumlb.dsl/src-gen/ac/soton/xtext/iumlb/parser/antlr/internal/InternalDsl.g:668:10: this_ID_1= RULE_ID
                    {
                    this_ID_1=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleEString1407); 

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


    // $ANTLR start "entryRuleTransition"
    // ../ac.soton.xtext.iumlb.dsl/src-gen/ac/soton/xtext/iumlb/parser/antlr/internal/InternalDsl.g:685:1: entryRuleTransition returns [EObject current=null] : iv_ruleTransition= ruleTransition EOF ;
    public final EObject entryRuleTransition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTransition = null;


        try {
            // ../ac.soton.xtext.iumlb.dsl/src-gen/ac/soton/xtext/iumlb/parser/antlr/internal/InternalDsl.g:686:2: (iv_ruleTransition= ruleTransition EOF )
            // ../ac.soton.xtext.iumlb.dsl/src-gen/ac/soton/xtext/iumlb/parser/antlr/internal/InternalDsl.g:687:2: iv_ruleTransition= ruleTransition EOF
            {
             newCompositeNode(grammarAccess.getTransitionRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleTransition_in_entryRuleTransition1454);
            iv_ruleTransition=ruleTransition();

            state._fsp--;

             current =iv_ruleTransition; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleTransition1464); 

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
    // $ANTLR end "entryRuleTransition"


    // $ANTLR start "ruleTransition"
    // ../ac.soton.xtext.iumlb.dsl/src-gen/ac/soton/xtext/iumlb/parser/antlr/internal/InternalDsl.g:694:1: ruleTransition returns [EObject current=null] : ( ( (lv_localGenerated_0_0= 'localGenerated' ) )? ( (lv_extended_1_0= 'extended' ) ) otherlv_2= 'Transition' otherlv_3= '{' (otherlv_4= 'comment' ( (lv_comment_5_0= ruleEString ) ) )? (otherlv_6= 'elaborates' otherlv_7= '(' ( ( ruleEString ) ) (otherlv_9= ',' ( ( ruleEString ) ) )* otherlv_11= ')' )? otherlv_12= 'target' ( ( ruleEString ) ) otherlv_14= 'source' ( ( ruleEString ) ) otherlv_16= '}' ) ;
    public final EObject ruleTransition() throws RecognitionException {
        EObject current = null;

        Token lv_localGenerated_0_0=null;
        Token lv_extended_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        Token otherlv_14=null;
        Token otherlv_16=null;
        AntlrDatatypeRuleToken lv_comment_5_0 = null;


         enterRule(); 
            
        try {
            // ../ac.soton.xtext.iumlb.dsl/src-gen/ac/soton/xtext/iumlb/parser/antlr/internal/InternalDsl.g:697:28: ( ( ( (lv_localGenerated_0_0= 'localGenerated' ) )? ( (lv_extended_1_0= 'extended' ) ) otherlv_2= 'Transition' otherlv_3= '{' (otherlv_4= 'comment' ( (lv_comment_5_0= ruleEString ) ) )? (otherlv_6= 'elaborates' otherlv_7= '(' ( ( ruleEString ) ) (otherlv_9= ',' ( ( ruleEString ) ) )* otherlv_11= ')' )? otherlv_12= 'target' ( ( ruleEString ) ) otherlv_14= 'source' ( ( ruleEString ) ) otherlv_16= '}' ) )
            // ../ac.soton.xtext.iumlb.dsl/src-gen/ac/soton/xtext/iumlb/parser/antlr/internal/InternalDsl.g:698:1: ( ( (lv_localGenerated_0_0= 'localGenerated' ) )? ( (lv_extended_1_0= 'extended' ) ) otherlv_2= 'Transition' otherlv_3= '{' (otherlv_4= 'comment' ( (lv_comment_5_0= ruleEString ) ) )? (otherlv_6= 'elaborates' otherlv_7= '(' ( ( ruleEString ) ) (otherlv_9= ',' ( ( ruleEString ) ) )* otherlv_11= ')' )? otherlv_12= 'target' ( ( ruleEString ) ) otherlv_14= 'source' ( ( ruleEString ) ) otherlv_16= '}' )
            {
            // ../ac.soton.xtext.iumlb.dsl/src-gen/ac/soton/xtext/iumlb/parser/antlr/internal/InternalDsl.g:698:1: ( ( (lv_localGenerated_0_0= 'localGenerated' ) )? ( (lv_extended_1_0= 'extended' ) ) otherlv_2= 'Transition' otherlv_3= '{' (otherlv_4= 'comment' ( (lv_comment_5_0= ruleEString ) ) )? (otherlv_6= 'elaborates' otherlv_7= '(' ( ( ruleEString ) ) (otherlv_9= ',' ( ( ruleEString ) ) )* otherlv_11= ')' )? otherlv_12= 'target' ( ( ruleEString ) ) otherlv_14= 'source' ( ( ruleEString ) ) otherlv_16= '}' )
            // ../ac.soton.xtext.iumlb.dsl/src-gen/ac/soton/xtext/iumlb/parser/antlr/internal/InternalDsl.g:698:2: ( (lv_localGenerated_0_0= 'localGenerated' ) )? ( (lv_extended_1_0= 'extended' ) ) otherlv_2= 'Transition' otherlv_3= '{' (otherlv_4= 'comment' ( (lv_comment_5_0= ruleEString ) ) )? (otherlv_6= 'elaborates' otherlv_7= '(' ( ( ruleEString ) ) (otherlv_9= ',' ( ( ruleEString ) ) )* otherlv_11= ')' )? otherlv_12= 'target' ( ( ruleEString ) ) otherlv_14= 'source' ( ( ruleEString ) ) otherlv_16= '}'
            {
            // ../ac.soton.xtext.iumlb.dsl/src-gen/ac/soton/xtext/iumlb/parser/antlr/internal/InternalDsl.g:698:2: ( (lv_localGenerated_0_0= 'localGenerated' ) )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==11) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // ../ac.soton.xtext.iumlb.dsl/src-gen/ac/soton/xtext/iumlb/parser/antlr/internal/InternalDsl.g:699:1: (lv_localGenerated_0_0= 'localGenerated' )
                    {
                    // ../ac.soton.xtext.iumlb.dsl/src-gen/ac/soton/xtext/iumlb/parser/antlr/internal/InternalDsl.g:699:1: (lv_localGenerated_0_0= 'localGenerated' )
                    // ../ac.soton.xtext.iumlb.dsl/src-gen/ac/soton/xtext/iumlb/parser/antlr/internal/InternalDsl.g:700:3: lv_localGenerated_0_0= 'localGenerated'
                    {
                    lv_localGenerated_0_0=(Token)match(input,11,FollowSets000.FOLLOW_11_in_ruleTransition1507); 

                            newLeafNode(lv_localGenerated_0_0, grammarAccess.getTransitionAccess().getLocalGeneratedLocalGeneratedKeyword_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getTransitionRule());
                    	        }
                           		setWithLastConsumed(current, "localGenerated", true, "localGenerated");
                    	    

                    }


                    }
                    break;

            }

            // ../ac.soton.xtext.iumlb.dsl/src-gen/ac/soton/xtext/iumlb/parser/antlr/internal/InternalDsl.g:713:3: ( (lv_extended_1_0= 'extended' ) )
            // ../ac.soton.xtext.iumlb.dsl/src-gen/ac/soton/xtext/iumlb/parser/antlr/internal/InternalDsl.g:714:1: (lv_extended_1_0= 'extended' )
            {
            // ../ac.soton.xtext.iumlb.dsl/src-gen/ac/soton/xtext/iumlb/parser/antlr/internal/InternalDsl.g:714:1: (lv_extended_1_0= 'extended' )
            // ../ac.soton.xtext.iumlb.dsl/src-gen/ac/soton/xtext/iumlb/parser/antlr/internal/InternalDsl.g:715:3: lv_extended_1_0= 'extended'
            {
            lv_extended_1_0=(Token)match(input,27,FollowSets000.FOLLOW_27_in_ruleTransition1539); 

                    newLeafNode(lv_extended_1_0, grammarAccess.getTransitionAccess().getExtendedExtendedKeyword_1_0());
                

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getTransitionRule());
            	        }
                   		setWithLastConsumed(current, "extended", true, "extended");
            	    

            }


            }

            otherlv_2=(Token)match(input,28,FollowSets000.FOLLOW_28_in_ruleTransition1564); 

                	newLeafNode(otherlv_2, grammarAccess.getTransitionAccess().getTransitionKeyword_2());
                
            otherlv_3=(Token)match(input,13,FollowSets000.FOLLOW_13_in_ruleTransition1576); 

                	newLeafNode(otherlv_3, grammarAccess.getTransitionAccess().getLeftCurlyBracketKeyword_3());
                
            // ../ac.soton.xtext.iumlb.dsl/src-gen/ac/soton/xtext/iumlb/parser/antlr/internal/InternalDsl.g:736:1: (otherlv_4= 'comment' ( (lv_comment_5_0= ruleEString ) ) )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==14) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // ../ac.soton.xtext.iumlb.dsl/src-gen/ac/soton/xtext/iumlb/parser/antlr/internal/InternalDsl.g:736:3: otherlv_4= 'comment' ( (lv_comment_5_0= ruleEString ) )
                    {
                    otherlv_4=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleTransition1589); 

                        	newLeafNode(otherlv_4, grammarAccess.getTransitionAccess().getCommentKeyword_4_0());
                        
                    // ../ac.soton.xtext.iumlb.dsl/src-gen/ac/soton/xtext/iumlb/parser/antlr/internal/InternalDsl.g:740:1: ( (lv_comment_5_0= ruleEString ) )
                    // ../ac.soton.xtext.iumlb.dsl/src-gen/ac/soton/xtext/iumlb/parser/antlr/internal/InternalDsl.g:741:1: (lv_comment_5_0= ruleEString )
                    {
                    // ../ac.soton.xtext.iumlb.dsl/src-gen/ac/soton/xtext/iumlb/parser/antlr/internal/InternalDsl.g:741:1: (lv_comment_5_0= ruleEString )
                    // ../ac.soton.xtext.iumlb.dsl/src-gen/ac/soton/xtext/iumlb/parser/antlr/internal/InternalDsl.g:742:3: lv_comment_5_0= ruleEString
                    {
                     
                    	        newCompositeNode(grammarAccess.getTransitionAccess().getCommentEStringParserRuleCall_4_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleTransition1610);
                    lv_comment_5_0=ruleEString();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getTransitionRule());
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

            // ../ac.soton.xtext.iumlb.dsl/src-gen/ac/soton/xtext/iumlb/parser/antlr/internal/InternalDsl.g:758:4: (otherlv_6= 'elaborates' otherlv_7= '(' ( ( ruleEString ) ) (otherlv_9= ',' ( ( ruleEString ) ) )* otherlv_11= ')' )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==29) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // ../ac.soton.xtext.iumlb.dsl/src-gen/ac/soton/xtext/iumlb/parser/antlr/internal/InternalDsl.g:758:6: otherlv_6= 'elaborates' otherlv_7= '(' ( ( ruleEString ) ) (otherlv_9= ',' ( ( ruleEString ) ) )* otherlv_11= ')'
                    {
                    otherlv_6=(Token)match(input,29,FollowSets000.FOLLOW_29_in_ruleTransition1625); 

                        	newLeafNode(otherlv_6, grammarAccess.getTransitionAccess().getElaboratesKeyword_5_0());
                        
                    otherlv_7=(Token)match(input,22,FollowSets000.FOLLOW_22_in_ruleTransition1637); 

                        	newLeafNode(otherlv_7, grammarAccess.getTransitionAccess().getLeftParenthesisKeyword_5_1());
                        
                    // ../ac.soton.xtext.iumlb.dsl/src-gen/ac/soton/xtext/iumlb/parser/antlr/internal/InternalDsl.g:766:1: ( ( ruleEString ) )
                    // ../ac.soton.xtext.iumlb.dsl/src-gen/ac/soton/xtext/iumlb/parser/antlr/internal/InternalDsl.g:767:1: ( ruleEString )
                    {
                    // ../ac.soton.xtext.iumlb.dsl/src-gen/ac/soton/xtext/iumlb/parser/antlr/internal/InternalDsl.g:767:1: ( ruleEString )
                    // ../ac.soton.xtext.iumlb.dsl/src-gen/ac/soton/xtext/iumlb/parser/antlr/internal/InternalDsl.g:768:3: ruleEString
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getTransitionRule());
                    	        }
                            
                     
                    	        newCompositeNode(grammarAccess.getTransitionAccess().getElaboratesEventCrossReference_5_2_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleTransition1660);
                    ruleEString();

                    state._fsp--;

                     
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../ac.soton.xtext.iumlb.dsl/src-gen/ac/soton/xtext/iumlb/parser/antlr/internal/InternalDsl.g:781:2: (otherlv_9= ',' ( ( ruleEString ) ) )*
                    loop22:
                    do {
                        int alt22=2;
                        int LA22_0 = input.LA(1);

                        if ( (LA22_0==17) ) {
                            alt22=1;
                        }


                        switch (alt22) {
                    	case 1 :
                    	    // ../ac.soton.xtext.iumlb.dsl/src-gen/ac/soton/xtext/iumlb/parser/antlr/internal/InternalDsl.g:781:4: otherlv_9= ',' ( ( ruleEString ) )
                    	    {
                    	    otherlv_9=(Token)match(input,17,FollowSets000.FOLLOW_17_in_ruleTransition1673); 

                    	        	newLeafNode(otherlv_9, grammarAccess.getTransitionAccess().getCommaKeyword_5_3_0());
                    	        
                    	    // ../ac.soton.xtext.iumlb.dsl/src-gen/ac/soton/xtext/iumlb/parser/antlr/internal/InternalDsl.g:785:1: ( ( ruleEString ) )
                    	    // ../ac.soton.xtext.iumlb.dsl/src-gen/ac/soton/xtext/iumlb/parser/antlr/internal/InternalDsl.g:786:1: ( ruleEString )
                    	    {
                    	    // ../ac.soton.xtext.iumlb.dsl/src-gen/ac/soton/xtext/iumlb/parser/antlr/internal/InternalDsl.g:786:1: ( ruleEString )
                    	    // ../ac.soton.xtext.iumlb.dsl/src-gen/ac/soton/xtext/iumlb/parser/antlr/internal/InternalDsl.g:787:3: ruleEString
                    	    {

                    	    			if (current==null) {
                    	    	            current = createModelElement(grammarAccess.getTransitionRule());
                    	    	        }
                    	            
                    	     
                    	    	        newCompositeNode(grammarAccess.getTransitionAccess().getElaboratesEventCrossReference_5_3_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleTransition1696);
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

                    otherlv_11=(Token)match(input,23,FollowSets000.FOLLOW_23_in_ruleTransition1710); 

                        	newLeafNode(otherlv_11, grammarAccess.getTransitionAccess().getRightParenthesisKeyword_5_4());
                        

                    }
                    break;

            }

            otherlv_12=(Token)match(input,30,FollowSets000.FOLLOW_30_in_ruleTransition1724); 

                	newLeafNode(otherlv_12, grammarAccess.getTransitionAccess().getTargetKeyword_6());
                
            // ../ac.soton.xtext.iumlb.dsl/src-gen/ac/soton/xtext/iumlb/parser/antlr/internal/InternalDsl.g:808:1: ( ( ruleEString ) )
            // ../ac.soton.xtext.iumlb.dsl/src-gen/ac/soton/xtext/iumlb/parser/antlr/internal/InternalDsl.g:809:1: ( ruleEString )
            {
            // ../ac.soton.xtext.iumlb.dsl/src-gen/ac/soton/xtext/iumlb/parser/antlr/internal/InternalDsl.g:809:1: ( ruleEString )
            // ../ac.soton.xtext.iumlb.dsl/src-gen/ac/soton/xtext/iumlb/parser/antlr/internal/InternalDsl.g:810:3: ruleEString
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getTransitionRule());
            	        }
                    
             
            	        newCompositeNode(grammarAccess.getTransitionAccess().getTargetAbstractNodeCrossReference_7_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleTransition1747);
            ruleEString();

            state._fsp--;

             
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_14=(Token)match(input,31,FollowSets000.FOLLOW_31_in_ruleTransition1759); 

                	newLeafNode(otherlv_14, grammarAccess.getTransitionAccess().getSourceKeyword_8());
                
            // ../ac.soton.xtext.iumlb.dsl/src-gen/ac/soton/xtext/iumlb/parser/antlr/internal/InternalDsl.g:827:1: ( ( ruleEString ) )
            // ../ac.soton.xtext.iumlb.dsl/src-gen/ac/soton/xtext/iumlb/parser/antlr/internal/InternalDsl.g:828:1: ( ruleEString )
            {
            // ../ac.soton.xtext.iumlb.dsl/src-gen/ac/soton/xtext/iumlb/parser/antlr/internal/InternalDsl.g:828:1: ( ruleEString )
            // ../ac.soton.xtext.iumlb.dsl/src-gen/ac/soton/xtext/iumlb/parser/antlr/internal/InternalDsl.g:829:3: ruleEString
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getTransitionRule());
            	        }
                    
             
            	        newCompositeNode(grammarAccess.getTransitionAccess().getSourceAbstractNodeCrossReference_9_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleTransition1782);
            ruleEString();

            state._fsp--;

             
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_16=(Token)match(input,18,FollowSets000.FOLLOW_18_in_ruleTransition1794); 

                	newLeafNode(otherlv_16, grammarAccess.getTransitionAccess().getRightCurlyBracketKeyword_10());
                

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
    // $ANTLR end "ruleTransition"


    // $ANTLR start "entryRuleInitial"
    // ../ac.soton.xtext.iumlb.dsl/src-gen/ac/soton/xtext/iumlb/parser/antlr/internal/InternalDsl.g:860:1: entryRuleInitial returns [EObject current=null] : iv_ruleInitial= ruleInitial EOF ;
    public final EObject entryRuleInitial() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInitial = null;


        try {
            // ../ac.soton.xtext.iumlb.dsl/src-gen/ac/soton/xtext/iumlb/parser/antlr/internal/InternalDsl.g:861:2: (iv_ruleInitial= ruleInitial EOF )
            // ../ac.soton.xtext.iumlb.dsl/src-gen/ac/soton/xtext/iumlb/parser/antlr/internal/InternalDsl.g:862:2: iv_ruleInitial= ruleInitial EOF
            {
             newCompositeNode(grammarAccess.getInitialRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleInitial_in_entryRuleInitial1836);
            iv_ruleInitial=ruleInitial();

            state._fsp--;

             current =iv_ruleInitial; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleInitial1846); 

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
    // $ANTLR end "entryRuleInitial"


    // $ANTLR start "ruleInitial"
    // ../ac.soton.xtext.iumlb.dsl/src-gen/ac/soton/xtext/iumlb/parser/antlr/internal/InternalDsl.g:869:1: ruleInitial returns [EObject current=null] : ( () ( (lv_localGenerated_1_0= 'localGenerated' ) )? otherlv_2= 'Initial' otherlv_3= '{' (otherlv_4= 'internalId' ( (lv_internalId_5_0= ruleEString ) ) )? otherlv_6= '}' ) ;
    public final EObject ruleInitial() throws RecognitionException {
        EObject current = null;

        Token lv_localGenerated_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        AntlrDatatypeRuleToken lv_internalId_5_0 = null;


         enterRule(); 
            
        try {
            // ../ac.soton.xtext.iumlb.dsl/src-gen/ac/soton/xtext/iumlb/parser/antlr/internal/InternalDsl.g:872:28: ( ( () ( (lv_localGenerated_1_0= 'localGenerated' ) )? otherlv_2= 'Initial' otherlv_3= '{' (otherlv_4= 'internalId' ( (lv_internalId_5_0= ruleEString ) ) )? otherlv_6= '}' ) )
            // ../ac.soton.xtext.iumlb.dsl/src-gen/ac/soton/xtext/iumlb/parser/antlr/internal/InternalDsl.g:873:1: ( () ( (lv_localGenerated_1_0= 'localGenerated' ) )? otherlv_2= 'Initial' otherlv_3= '{' (otherlv_4= 'internalId' ( (lv_internalId_5_0= ruleEString ) ) )? otherlv_6= '}' )
            {
            // ../ac.soton.xtext.iumlb.dsl/src-gen/ac/soton/xtext/iumlb/parser/antlr/internal/InternalDsl.g:873:1: ( () ( (lv_localGenerated_1_0= 'localGenerated' ) )? otherlv_2= 'Initial' otherlv_3= '{' (otherlv_4= 'internalId' ( (lv_internalId_5_0= ruleEString ) ) )? otherlv_6= '}' )
            // ../ac.soton.xtext.iumlb.dsl/src-gen/ac/soton/xtext/iumlb/parser/antlr/internal/InternalDsl.g:873:2: () ( (lv_localGenerated_1_0= 'localGenerated' ) )? otherlv_2= 'Initial' otherlv_3= '{' (otherlv_4= 'internalId' ( (lv_internalId_5_0= ruleEString ) ) )? otherlv_6= '}'
            {
            // ../ac.soton.xtext.iumlb.dsl/src-gen/ac/soton/xtext/iumlb/parser/antlr/internal/InternalDsl.g:873:2: ()
            // ../ac.soton.xtext.iumlb.dsl/src-gen/ac/soton/xtext/iumlb/parser/antlr/internal/InternalDsl.g:874:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getInitialAccess().getInitialAction_0(),
                        current);
                

            }

            // ../ac.soton.xtext.iumlb.dsl/src-gen/ac/soton/xtext/iumlb/parser/antlr/internal/InternalDsl.g:879:2: ( (lv_localGenerated_1_0= 'localGenerated' ) )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==11) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // ../ac.soton.xtext.iumlb.dsl/src-gen/ac/soton/xtext/iumlb/parser/antlr/internal/InternalDsl.g:880:1: (lv_localGenerated_1_0= 'localGenerated' )
                    {
                    // ../ac.soton.xtext.iumlb.dsl/src-gen/ac/soton/xtext/iumlb/parser/antlr/internal/InternalDsl.g:880:1: (lv_localGenerated_1_0= 'localGenerated' )
                    // ../ac.soton.xtext.iumlb.dsl/src-gen/ac/soton/xtext/iumlb/parser/antlr/internal/InternalDsl.g:881:3: lv_localGenerated_1_0= 'localGenerated'
                    {
                    lv_localGenerated_1_0=(Token)match(input,11,FollowSets000.FOLLOW_11_in_ruleInitial1898); 

                            newLeafNode(lv_localGenerated_1_0, grammarAccess.getInitialAccess().getLocalGeneratedLocalGeneratedKeyword_1_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getInitialRule());
                    	        }
                           		setWithLastConsumed(current, "localGenerated", true, "localGenerated");
                    	    

                    }


                    }
                    break;

            }

            otherlv_2=(Token)match(input,32,FollowSets000.FOLLOW_32_in_ruleInitial1924); 

                	newLeafNode(otherlv_2, grammarAccess.getInitialAccess().getInitialKeyword_2());
                
            otherlv_3=(Token)match(input,13,FollowSets000.FOLLOW_13_in_ruleInitial1936); 

                	newLeafNode(otherlv_3, grammarAccess.getInitialAccess().getLeftCurlyBracketKeyword_3());
                
            // ../ac.soton.xtext.iumlb.dsl/src-gen/ac/soton/xtext/iumlb/parser/antlr/internal/InternalDsl.g:902:1: (otherlv_4= 'internalId' ( (lv_internalId_5_0= ruleEString ) ) )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==33) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // ../ac.soton.xtext.iumlb.dsl/src-gen/ac/soton/xtext/iumlb/parser/antlr/internal/InternalDsl.g:902:3: otherlv_4= 'internalId' ( (lv_internalId_5_0= ruleEString ) )
                    {
                    otherlv_4=(Token)match(input,33,FollowSets000.FOLLOW_33_in_ruleInitial1949); 

                        	newLeafNode(otherlv_4, grammarAccess.getInitialAccess().getInternalIdKeyword_4_0());
                        
                    // ../ac.soton.xtext.iumlb.dsl/src-gen/ac/soton/xtext/iumlb/parser/antlr/internal/InternalDsl.g:906:1: ( (lv_internalId_5_0= ruleEString ) )
                    // ../ac.soton.xtext.iumlb.dsl/src-gen/ac/soton/xtext/iumlb/parser/antlr/internal/InternalDsl.g:907:1: (lv_internalId_5_0= ruleEString )
                    {
                    // ../ac.soton.xtext.iumlb.dsl/src-gen/ac/soton/xtext/iumlb/parser/antlr/internal/InternalDsl.g:907:1: (lv_internalId_5_0= ruleEString )
                    // ../ac.soton.xtext.iumlb.dsl/src-gen/ac/soton/xtext/iumlb/parser/antlr/internal/InternalDsl.g:908:3: lv_internalId_5_0= ruleEString
                    {
                     
                    	        newCompositeNode(grammarAccess.getInitialAccess().getInternalIdEStringParserRuleCall_4_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleInitial1970);
                    lv_internalId_5_0=ruleEString();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getInitialRule());
                    	        }
                           		set(
                           			current, 
                           			"internalId",
                            		lv_internalId_5_0, 
                            		"EString");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            otherlv_6=(Token)match(input,18,FollowSets000.FOLLOW_18_in_ruleInitial1984); 

                	newLeafNode(otherlv_6, grammarAccess.getInitialAccess().getRightCurlyBracketKeyword_5());
                

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
    // $ANTLR end "ruleInitial"


    // $ANTLR start "entryRuleFinal"
    // ../ac.soton.xtext.iumlb.dsl/src-gen/ac/soton/xtext/iumlb/parser/antlr/internal/InternalDsl.g:936:1: entryRuleFinal returns [EObject current=null] : iv_ruleFinal= ruleFinal EOF ;
    public final EObject entryRuleFinal() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFinal = null;


        try {
            // ../ac.soton.xtext.iumlb.dsl/src-gen/ac/soton/xtext/iumlb/parser/antlr/internal/InternalDsl.g:937:2: (iv_ruleFinal= ruleFinal EOF )
            // ../ac.soton.xtext.iumlb.dsl/src-gen/ac/soton/xtext/iumlb/parser/antlr/internal/InternalDsl.g:938:2: iv_ruleFinal= ruleFinal EOF
            {
             newCompositeNode(grammarAccess.getFinalRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleFinal_in_entryRuleFinal2020);
            iv_ruleFinal=ruleFinal();

            state._fsp--;

             current =iv_ruleFinal; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleFinal2030); 

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
    // $ANTLR end "entryRuleFinal"


    // $ANTLR start "ruleFinal"
    // ../ac.soton.xtext.iumlb.dsl/src-gen/ac/soton/xtext/iumlb/parser/antlr/internal/InternalDsl.g:945:1: ruleFinal returns [EObject current=null] : ( () ( (lv_localGenerated_1_0= 'localGenerated' ) )? otherlv_2= 'Final' otherlv_3= '{' (otherlv_4= 'internalId' ( (lv_internalId_5_0= ruleEString ) ) )? otherlv_6= '}' ) ;
    public final EObject ruleFinal() throws RecognitionException {
        EObject current = null;

        Token lv_localGenerated_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        AntlrDatatypeRuleToken lv_internalId_5_0 = null;


         enterRule(); 
            
        try {
            // ../ac.soton.xtext.iumlb.dsl/src-gen/ac/soton/xtext/iumlb/parser/antlr/internal/InternalDsl.g:948:28: ( ( () ( (lv_localGenerated_1_0= 'localGenerated' ) )? otherlv_2= 'Final' otherlv_3= '{' (otherlv_4= 'internalId' ( (lv_internalId_5_0= ruleEString ) ) )? otherlv_6= '}' ) )
            // ../ac.soton.xtext.iumlb.dsl/src-gen/ac/soton/xtext/iumlb/parser/antlr/internal/InternalDsl.g:949:1: ( () ( (lv_localGenerated_1_0= 'localGenerated' ) )? otherlv_2= 'Final' otherlv_3= '{' (otherlv_4= 'internalId' ( (lv_internalId_5_0= ruleEString ) ) )? otherlv_6= '}' )
            {
            // ../ac.soton.xtext.iumlb.dsl/src-gen/ac/soton/xtext/iumlb/parser/antlr/internal/InternalDsl.g:949:1: ( () ( (lv_localGenerated_1_0= 'localGenerated' ) )? otherlv_2= 'Final' otherlv_3= '{' (otherlv_4= 'internalId' ( (lv_internalId_5_0= ruleEString ) ) )? otherlv_6= '}' )
            // ../ac.soton.xtext.iumlb.dsl/src-gen/ac/soton/xtext/iumlb/parser/antlr/internal/InternalDsl.g:949:2: () ( (lv_localGenerated_1_0= 'localGenerated' ) )? otherlv_2= 'Final' otherlv_3= '{' (otherlv_4= 'internalId' ( (lv_internalId_5_0= ruleEString ) ) )? otherlv_6= '}'
            {
            // ../ac.soton.xtext.iumlb.dsl/src-gen/ac/soton/xtext/iumlb/parser/antlr/internal/InternalDsl.g:949:2: ()
            // ../ac.soton.xtext.iumlb.dsl/src-gen/ac/soton/xtext/iumlb/parser/antlr/internal/InternalDsl.g:950:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getFinalAccess().getFinalAction_0(),
                        current);
                

            }

            // ../ac.soton.xtext.iumlb.dsl/src-gen/ac/soton/xtext/iumlb/parser/antlr/internal/InternalDsl.g:955:2: ( (lv_localGenerated_1_0= 'localGenerated' ) )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==11) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // ../ac.soton.xtext.iumlb.dsl/src-gen/ac/soton/xtext/iumlb/parser/antlr/internal/InternalDsl.g:956:1: (lv_localGenerated_1_0= 'localGenerated' )
                    {
                    // ../ac.soton.xtext.iumlb.dsl/src-gen/ac/soton/xtext/iumlb/parser/antlr/internal/InternalDsl.g:956:1: (lv_localGenerated_1_0= 'localGenerated' )
                    // ../ac.soton.xtext.iumlb.dsl/src-gen/ac/soton/xtext/iumlb/parser/antlr/internal/InternalDsl.g:957:3: lv_localGenerated_1_0= 'localGenerated'
                    {
                    lv_localGenerated_1_0=(Token)match(input,11,FollowSets000.FOLLOW_11_in_ruleFinal2082); 

                            newLeafNode(lv_localGenerated_1_0, grammarAccess.getFinalAccess().getLocalGeneratedLocalGeneratedKeyword_1_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getFinalRule());
                    	        }
                           		setWithLastConsumed(current, "localGenerated", true, "localGenerated");
                    	    

                    }


                    }
                    break;

            }

            otherlv_2=(Token)match(input,34,FollowSets000.FOLLOW_34_in_ruleFinal2108); 

                	newLeafNode(otherlv_2, grammarAccess.getFinalAccess().getFinalKeyword_2());
                
            otherlv_3=(Token)match(input,13,FollowSets000.FOLLOW_13_in_ruleFinal2120); 

                	newLeafNode(otherlv_3, grammarAccess.getFinalAccess().getLeftCurlyBracketKeyword_3());
                
            // ../ac.soton.xtext.iumlb.dsl/src-gen/ac/soton/xtext/iumlb/parser/antlr/internal/InternalDsl.g:978:1: (otherlv_4= 'internalId' ( (lv_internalId_5_0= ruleEString ) ) )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==33) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // ../ac.soton.xtext.iumlb.dsl/src-gen/ac/soton/xtext/iumlb/parser/antlr/internal/InternalDsl.g:978:3: otherlv_4= 'internalId' ( (lv_internalId_5_0= ruleEString ) )
                    {
                    otherlv_4=(Token)match(input,33,FollowSets000.FOLLOW_33_in_ruleFinal2133); 

                        	newLeafNode(otherlv_4, grammarAccess.getFinalAccess().getInternalIdKeyword_4_0());
                        
                    // ../ac.soton.xtext.iumlb.dsl/src-gen/ac/soton/xtext/iumlb/parser/antlr/internal/InternalDsl.g:982:1: ( (lv_internalId_5_0= ruleEString ) )
                    // ../ac.soton.xtext.iumlb.dsl/src-gen/ac/soton/xtext/iumlb/parser/antlr/internal/InternalDsl.g:983:1: (lv_internalId_5_0= ruleEString )
                    {
                    // ../ac.soton.xtext.iumlb.dsl/src-gen/ac/soton/xtext/iumlb/parser/antlr/internal/InternalDsl.g:983:1: (lv_internalId_5_0= ruleEString )
                    // ../ac.soton.xtext.iumlb.dsl/src-gen/ac/soton/xtext/iumlb/parser/antlr/internal/InternalDsl.g:984:3: lv_internalId_5_0= ruleEString
                    {
                     
                    	        newCompositeNode(grammarAccess.getFinalAccess().getInternalIdEStringParserRuleCall_4_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleFinal2154);
                    lv_internalId_5_0=ruleEString();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getFinalRule());
                    	        }
                           		set(
                           			current, 
                           			"internalId",
                            		lv_internalId_5_0, 
                            		"EString");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            otherlv_6=(Token)match(input,18,FollowSets000.FOLLOW_18_in_ruleFinal2168); 

                	newLeafNode(otherlv_6, grammarAccess.getFinalAccess().getRightCurlyBracketKeyword_5());
                

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
    // $ANTLR end "ruleFinal"


    // $ANTLR start "entryRuleAny"
    // ../ac.soton.xtext.iumlb.dsl/src-gen/ac/soton/xtext/iumlb/parser/antlr/internal/InternalDsl.g:1012:1: entryRuleAny returns [EObject current=null] : iv_ruleAny= ruleAny EOF ;
    public final EObject entryRuleAny() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAny = null;


        try {
            // ../ac.soton.xtext.iumlb.dsl/src-gen/ac/soton/xtext/iumlb/parser/antlr/internal/InternalDsl.g:1013:2: (iv_ruleAny= ruleAny EOF )
            // ../ac.soton.xtext.iumlb.dsl/src-gen/ac/soton/xtext/iumlb/parser/antlr/internal/InternalDsl.g:1014:2: iv_ruleAny= ruleAny EOF
            {
             newCompositeNode(grammarAccess.getAnyRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleAny_in_entryRuleAny2204);
            iv_ruleAny=ruleAny();

            state._fsp--;

             current =iv_ruleAny; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleAny2214); 

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
    // $ANTLR end "entryRuleAny"


    // $ANTLR start "ruleAny"
    // ../ac.soton.xtext.iumlb.dsl/src-gen/ac/soton/xtext/iumlb/parser/antlr/internal/InternalDsl.g:1021:1: ruleAny returns [EObject current=null] : ( () ( (lv_localGenerated_1_0= 'localGenerated' ) )? otherlv_2= 'Any' otherlv_3= '{' (otherlv_4= 'internalId' ( (lv_internalId_5_0= ruleEString ) ) )? otherlv_6= '}' ) ;
    public final EObject ruleAny() throws RecognitionException {
        EObject current = null;

        Token lv_localGenerated_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        AntlrDatatypeRuleToken lv_internalId_5_0 = null;


         enterRule(); 
            
        try {
            // ../ac.soton.xtext.iumlb.dsl/src-gen/ac/soton/xtext/iumlb/parser/antlr/internal/InternalDsl.g:1024:28: ( ( () ( (lv_localGenerated_1_0= 'localGenerated' ) )? otherlv_2= 'Any' otherlv_3= '{' (otherlv_4= 'internalId' ( (lv_internalId_5_0= ruleEString ) ) )? otherlv_6= '}' ) )
            // ../ac.soton.xtext.iumlb.dsl/src-gen/ac/soton/xtext/iumlb/parser/antlr/internal/InternalDsl.g:1025:1: ( () ( (lv_localGenerated_1_0= 'localGenerated' ) )? otherlv_2= 'Any' otherlv_3= '{' (otherlv_4= 'internalId' ( (lv_internalId_5_0= ruleEString ) ) )? otherlv_6= '}' )
            {
            // ../ac.soton.xtext.iumlb.dsl/src-gen/ac/soton/xtext/iumlb/parser/antlr/internal/InternalDsl.g:1025:1: ( () ( (lv_localGenerated_1_0= 'localGenerated' ) )? otherlv_2= 'Any' otherlv_3= '{' (otherlv_4= 'internalId' ( (lv_internalId_5_0= ruleEString ) ) )? otherlv_6= '}' )
            // ../ac.soton.xtext.iumlb.dsl/src-gen/ac/soton/xtext/iumlb/parser/antlr/internal/InternalDsl.g:1025:2: () ( (lv_localGenerated_1_0= 'localGenerated' ) )? otherlv_2= 'Any' otherlv_3= '{' (otherlv_4= 'internalId' ( (lv_internalId_5_0= ruleEString ) ) )? otherlv_6= '}'
            {
            // ../ac.soton.xtext.iumlb.dsl/src-gen/ac/soton/xtext/iumlb/parser/antlr/internal/InternalDsl.g:1025:2: ()
            // ../ac.soton.xtext.iumlb.dsl/src-gen/ac/soton/xtext/iumlb/parser/antlr/internal/InternalDsl.g:1026:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getAnyAccess().getAnyAction_0(),
                        current);
                

            }

            // ../ac.soton.xtext.iumlb.dsl/src-gen/ac/soton/xtext/iumlb/parser/antlr/internal/InternalDsl.g:1031:2: ( (lv_localGenerated_1_0= 'localGenerated' ) )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==11) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // ../ac.soton.xtext.iumlb.dsl/src-gen/ac/soton/xtext/iumlb/parser/antlr/internal/InternalDsl.g:1032:1: (lv_localGenerated_1_0= 'localGenerated' )
                    {
                    // ../ac.soton.xtext.iumlb.dsl/src-gen/ac/soton/xtext/iumlb/parser/antlr/internal/InternalDsl.g:1032:1: (lv_localGenerated_1_0= 'localGenerated' )
                    // ../ac.soton.xtext.iumlb.dsl/src-gen/ac/soton/xtext/iumlb/parser/antlr/internal/InternalDsl.g:1033:3: lv_localGenerated_1_0= 'localGenerated'
                    {
                    lv_localGenerated_1_0=(Token)match(input,11,FollowSets000.FOLLOW_11_in_ruleAny2266); 

                            newLeafNode(lv_localGenerated_1_0, grammarAccess.getAnyAccess().getLocalGeneratedLocalGeneratedKeyword_1_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getAnyRule());
                    	        }
                           		setWithLastConsumed(current, "localGenerated", true, "localGenerated");
                    	    

                    }


                    }
                    break;

            }

            otherlv_2=(Token)match(input,35,FollowSets000.FOLLOW_35_in_ruleAny2292); 

                	newLeafNode(otherlv_2, grammarAccess.getAnyAccess().getAnyKeyword_2());
                
            otherlv_3=(Token)match(input,13,FollowSets000.FOLLOW_13_in_ruleAny2304); 

                	newLeafNode(otherlv_3, grammarAccess.getAnyAccess().getLeftCurlyBracketKeyword_3());
                
            // ../ac.soton.xtext.iumlb.dsl/src-gen/ac/soton/xtext/iumlb/parser/antlr/internal/InternalDsl.g:1054:1: (otherlv_4= 'internalId' ( (lv_internalId_5_0= ruleEString ) ) )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==33) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // ../ac.soton.xtext.iumlb.dsl/src-gen/ac/soton/xtext/iumlb/parser/antlr/internal/InternalDsl.g:1054:3: otherlv_4= 'internalId' ( (lv_internalId_5_0= ruleEString ) )
                    {
                    otherlv_4=(Token)match(input,33,FollowSets000.FOLLOW_33_in_ruleAny2317); 

                        	newLeafNode(otherlv_4, grammarAccess.getAnyAccess().getInternalIdKeyword_4_0());
                        
                    // ../ac.soton.xtext.iumlb.dsl/src-gen/ac/soton/xtext/iumlb/parser/antlr/internal/InternalDsl.g:1058:1: ( (lv_internalId_5_0= ruleEString ) )
                    // ../ac.soton.xtext.iumlb.dsl/src-gen/ac/soton/xtext/iumlb/parser/antlr/internal/InternalDsl.g:1059:1: (lv_internalId_5_0= ruleEString )
                    {
                    // ../ac.soton.xtext.iumlb.dsl/src-gen/ac/soton/xtext/iumlb/parser/antlr/internal/InternalDsl.g:1059:1: (lv_internalId_5_0= ruleEString )
                    // ../ac.soton.xtext.iumlb.dsl/src-gen/ac/soton/xtext/iumlb/parser/antlr/internal/InternalDsl.g:1060:3: lv_internalId_5_0= ruleEString
                    {
                     
                    	        newCompositeNode(grammarAccess.getAnyAccess().getInternalIdEStringParserRuleCall_4_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleAny2338);
                    lv_internalId_5_0=ruleEString();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getAnyRule());
                    	        }
                           		set(
                           			current, 
                           			"internalId",
                            		lv_internalId_5_0, 
                            		"EString");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            otherlv_6=(Token)match(input,18,FollowSets000.FOLLOW_18_in_ruleAny2352); 

                	newLeafNode(otherlv_6, grammarAccess.getAnyAccess().getRightCurlyBracketKeyword_5());
                

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
    // $ANTLR end "ruleAny"


    // $ANTLR start "entryRuleJunction"
    // ../ac.soton.xtext.iumlb.dsl/src-gen/ac/soton/xtext/iumlb/parser/antlr/internal/InternalDsl.g:1088:1: entryRuleJunction returns [EObject current=null] : iv_ruleJunction= ruleJunction EOF ;
    public final EObject entryRuleJunction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJunction = null;


        try {
            // ../ac.soton.xtext.iumlb.dsl/src-gen/ac/soton/xtext/iumlb/parser/antlr/internal/InternalDsl.g:1089:2: (iv_ruleJunction= ruleJunction EOF )
            // ../ac.soton.xtext.iumlb.dsl/src-gen/ac/soton/xtext/iumlb/parser/antlr/internal/InternalDsl.g:1090:2: iv_ruleJunction= ruleJunction EOF
            {
             newCompositeNode(grammarAccess.getJunctionRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleJunction_in_entryRuleJunction2388);
            iv_ruleJunction=ruleJunction();

            state._fsp--;

             current =iv_ruleJunction; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleJunction2398); 

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
    // $ANTLR end "entryRuleJunction"


    // $ANTLR start "ruleJunction"
    // ../ac.soton.xtext.iumlb.dsl/src-gen/ac/soton/xtext/iumlb/parser/antlr/internal/InternalDsl.g:1097:1: ruleJunction returns [EObject current=null] : ( () ( (lv_localGenerated_1_0= 'localGenerated' ) )? otherlv_2= 'Junction' otherlv_3= '{' (otherlv_4= 'internalId' ( (lv_internalId_5_0= ruleEString ) ) )? otherlv_6= '}' ) ;
    public final EObject ruleJunction() throws RecognitionException {
        EObject current = null;

        Token lv_localGenerated_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        AntlrDatatypeRuleToken lv_internalId_5_0 = null;


         enterRule(); 
            
        try {
            // ../ac.soton.xtext.iumlb.dsl/src-gen/ac/soton/xtext/iumlb/parser/antlr/internal/InternalDsl.g:1100:28: ( ( () ( (lv_localGenerated_1_0= 'localGenerated' ) )? otherlv_2= 'Junction' otherlv_3= '{' (otherlv_4= 'internalId' ( (lv_internalId_5_0= ruleEString ) ) )? otherlv_6= '}' ) )
            // ../ac.soton.xtext.iumlb.dsl/src-gen/ac/soton/xtext/iumlb/parser/antlr/internal/InternalDsl.g:1101:1: ( () ( (lv_localGenerated_1_0= 'localGenerated' ) )? otherlv_2= 'Junction' otherlv_3= '{' (otherlv_4= 'internalId' ( (lv_internalId_5_0= ruleEString ) ) )? otherlv_6= '}' )
            {
            // ../ac.soton.xtext.iumlb.dsl/src-gen/ac/soton/xtext/iumlb/parser/antlr/internal/InternalDsl.g:1101:1: ( () ( (lv_localGenerated_1_0= 'localGenerated' ) )? otherlv_2= 'Junction' otherlv_3= '{' (otherlv_4= 'internalId' ( (lv_internalId_5_0= ruleEString ) ) )? otherlv_6= '}' )
            // ../ac.soton.xtext.iumlb.dsl/src-gen/ac/soton/xtext/iumlb/parser/antlr/internal/InternalDsl.g:1101:2: () ( (lv_localGenerated_1_0= 'localGenerated' ) )? otherlv_2= 'Junction' otherlv_3= '{' (otherlv_4= 'internalId' ( (lv_internalId_5_0= ruleEString ) ) )? otherlv_6= '}'
            {
            // ../ac.soton.xtext.iumlb.dsl/src-gen/ac/soton/xtext/iumlb/parser/antlr/internal/InternalDsl.g:1101:2: ()
            // ../ac.soton.xtext.iumlb.dsl/src-gen/ac/soton/xtext/iumlb/parser/antlr/internal/InternalDsl.g:1102:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getJunctionAccess().getJunctionAction_0(),
                        current);
                

            }

            // ../ac.soton.xtext.iumlb.dsl/src-gen/ac/soton/xtext/iumlb/parser/antlr/internal/InternalDsl.g:1107:2: ( (lv_localGenerated_1_0= 'localGenerated' ) )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==11) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // ../ac.soton.xtext.iumlb.dsl/src-gen/ac/soton/xtext/iumlb/parser/antlr/internal/InternalDsl.g:1108:1: (lv_localGenerated_1_0= 'localGenerated' )
                    {
                    // ../ac.soton.xtext.iumlb.dsl/src-gen/ac/soton/xtext/iumlb/parser/antlr/internal/InternalDsl.g:1108:1: (lv_localGenerated_1_0= 'localGenerated' )
                    // ../ac.soton.xtext.iumlb.dsl/src-gen/ac/soton/xtext/iumlb/parser/antlr/internal/InternalDsl.g:1109:3: lv_localGenerated_1_0= 'localGenerated'
                    {
                    lv_localGenerated_1_0=(Token)match(input,11,FollowSets000.FOLLOW_11_in_ruleJunction2450); 

                            newLeafNode(lv_localGenerated_1_0, grammarAccess.getJunctionAccess().getLocalGeneratedLocalGeneratedKeyword_1_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getJunctionRule());
                    	        }
                           		setWithLastConsumed(current, "localGenerated", true, "localGenerated");
                    	    

                    }


                    }
                    break;

            }

            otherlv_2=(Token)match(input,36,FollowSets000.FOLLOW_36_in_ruleJunction2476); 

                	newLeafNode(otherlv_2, grammarAccess.getJunctionAccess().getJunctionKeyword_2());
                
            otherlv_3=(Token)match(input,13,FollowSets000.FOLLOW_13_in_ruleJunction2488); 

                	newLeafNode(otherlv_3, grammarAccess.getJunctionAccess().getLeftCurlyBracketKeyword_3());
                
            // ../ac.soton.xtext.iumlb.dsl/src-gen/ac/soton/xtext/iumlb/parser/antlr/internal/InternalDsl.g:1130:1: (otherlv_4= 'internalId' ( (lv_internalId_5_0= ruleEString ) ) )?
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==33) ) {
                alt31=1;
            }
            switch (alt31) {
                case 1 :
                    // ../ac.soton.xtext.iumlb.dsl/src-gen/ac/soton/xtext/iumlb/parser/antlr/internal/InternalDsl.g:1130:3: otherlv_4= 'internalId' ( (lv_internalId_5_0= ruleEString ) )
                    {
                    otherlv_4=(Token)match(input,33,FollowSets000.FOLLOW_33_in_ruleJunction2501); 

                        	newLeafNode(otherlv_4, grammarAccess.getJunctionAccess().getInternalIdKeyword_4_0());
                        
                    // ../ac.soton.xtext.iumlb.dsl/src-gen/ac/soton/xtext/iumlb/parser/antlr/internal/InternalDsl.g:1134:1: ( (lv_internalId_5_0= ruleEString ) )
                    // ../ac.soton.xtext.iumlb.dsl/src-gen/ac/soton/xtext/iumlb/parser/antlr/internal/InternalDsl.g:1135:1: (lv_internalId_5_0= ruleEString )
                    {
                    // ../ac.soton.xtext.iumlb.dsl/src-gen/ac/soton/xtext/iumlb/parser/antlr/internal/InternalDsl.g:1135:1: (lv_internalId_5_0= ruleEString )
                    // ../ac.soton.xtext.iumlb.dsl/src-gen/ac/soton/xtext/iumlb/parser/antlr/internal/InternalDsl.g:1136:3: lv_internalId_5_0= ruleEString
                    {
                     
                    	        newCompositeNode(grammarAccess.getJunctionAccess().getInternalIdEStringParserRuleCall_4_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleJunction2522);
                    lv_internalId_5_0=ruleEString();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getJunctionRule());
                    	        }
                           		set(
                           			current, 
                           			"internalId",
                            		lv_internalId_5_0, 
                            		"EString");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            otherlv_6=(Token)match(input,18,FollowSets000.FOLLOW_18_in_ruleJunction2536); 

                	newLeafNode(otherlv_6, grammarAccess.getJunctionAccess().getRightCurlyBracketKeyword_5());
                

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
    // $ANTLR end "ruleJunction"


    // $ANTLR start "entryRuleFork"
    // ../ac.soton.xtext.iumlb.dsl/src-gen/ac/soton/xtext/iumlb/parser/antlr/internal/InternalDsl.g:1164:1: entryRuleFork returns [EObject current=null] : iv_ruleFork= ruleFork EOF ;
    public final EObject entryRuleFork() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFork = null;


        try {
            // ../ac.soton.xtext.iumlb.dsl/src-gen/ac/soton/xtext/iumlb/parser/antlr/internal/InternalDsl.g:1165:2: (iv_ruleFork= ruleFork EOF )
            // ../ac.soton.xtext.iumlb.dsl/src-gen/ac/soton/xtext/iumlb/parser/antlr/internal/InternalDsl.g:1166:2: iv_ruleFork= ruleFork EOF
            {
             newCompositeNode(grammarAccess.getForkRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleFork_in_entryRuleFork2572);
            iv_ruleFork=ruleFork();

            state._fsp--;

             current =iv_ruleFork; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleFork2582); 

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
    // $ANTLR end "entryRuleFork"


    // $ANTLR start "ruleFork"
    // ../ac.soton.xtext.iumlb.dsl/src-gen/ac/soton/xtext/iumlb/parser/antlr/internal/InternalDsl.g:1173:1: ruleFork returns [EObject current=null] : ( () ( (lv_localGenerated_1_0= 'localGenerated' ) )? otherlv_2= 'Fork' otherlv_3= '{' (otherlv_4= 'internalId' ( (lv_internalId_5_0= ruleEString ) ) )? otherlv_6= '}' ) ;
    public final EObject ruleFork() throws RecognitionException {
        EObject current = null;

        Token lv_localGenerated_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        AntlrDatatypeRuleToken lv_internalId_5_0 = null;


         enterRule(); 
            
        try {
            // ../ac.soton.xtext.iumlb.dsl/src-gen/ac/soton/xtext/iumlb/parser/antlr/internal/InternalDsl.g:1176:28: ( ( () ( (lv_localGenerated_1_0= 'localGenerated' ) )? otherlv_2= 'Fork' otherlv_3= '{' (otherlv_4= 'internalId' ( (lv_internalId_5_0= ruleEString ) ) )? otherlv_6= '}' ) )
            // ../ac.soton.xtext.iumlb.dsl/src-gen/ac/soton/xtext/iumlb/parser/antlr/internal/InternalDsl.g:1177:1: ( () ( (lv_localGenerated_1_0= 'localGenerated' ) )? otherlv_2= 'Fork' otherlv_3= '{' (otherlv_4= 'internalId' ( (lv_internalId_5_0= ruleEString ) ) )? otherlv_6= '}' )
            {
            // ../ac.soton.xtext.iumlb.dsl/src-gen/ac/soton/xtext/iumlb/parser/antlr/internal/InternalDsl.g:1177:1: ( () ( (lv_localGenerated_1_0= 'localGenerated' ) )? otherlv_2= 'Fork' otherlv_3= '{' (otherlv_4= 'internalId' ( (lv_internalId_5_0= ruleEString ) ) )? otherlv_6= '}' )
            // ../ac.soton.xtext.iumlb.dsl/src-gen/ac/soton/xtext/iumlb/parser/antlr/internal/InternalDsl.g:1177:2: () ( (lv_localGenerated_1_0= 'localGenerated' ) )? otherlv_2= 'Fork' otherlv_3= '{' (otherlv_4= 'internalId' ( (lv_internalId_5_0= ruleEString ) ) )? otherlv_6= '}'
            {
            // ../ac.soton.xtext.iumlb.dsl/src-gen/ac/soton/xtext/iumlb/parser/antlr/internal/InternalDsl.g:1177:2: ()
            // ../ac.soton.xtext.iumlb.dsl/src-gen/ac/soton/xtext/iumlb/parser/antlr/internal/InternalDsl.g:1178:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getForkAccess().getForkAction_0(),
                        current);
                

            }

            // ../ac.soton.xtext.iumlb.dsl/src-gen/ac/soton/xtext/iumlb/parser/antlr/internal/InternalDsl.g:1183:2: ( (lv_localGenerated_1_0= 'localGenerated' ) )?
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==11) ) {
                alt32=1;
            }
            switch (alt32) {
                case 1 :
                    // ../ac.soton.xtext.iumlb.dsl/src-gen/ac/soton/xtext/iumlb/parser/antlr/internal/InternalDsl.g:1184:1: (lv_localGenerated_1_0= 'localGenerated' )
                    {
                    // ../ac.soton.xtext.iumlb.dsl/src-gen/ac/soton/xtext/iumlb/parser/antlr/internal/InternalDsl.g:1184:1: (lv_localGenerated_1_0= 'localGenerated' )
                    // ../ac.soton.xtext.iumlb.dsl/src-gen/ac/soton/xtext/iumlb/parser/antlr/internal/InternalDsl.g:1185:3: lv_localGenerated_1_0= 'localGenerated'
                    {
                    lv_localGenerated_1_0=(Token)match(input,11,FollowSets000.FOLLOW_11_in_ruleFork2634); 

                            newLeafNode(lv_localGenerated_1_0, grammarAccess.getForkAccess().getLocalGeneratedLocalGeneratedKeyword_1_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getForkRule());
                    	        }
                           		setWithLastConsumed(current, "localGenerated", true, "localGenerated");
                    	    

                    }


                    }
                    break;

            }

            otherlv_2=(Token)match(input,37,FollowSets000.FOLLOW_37_in_ruleFork2660); 

                	newLeafNode(otherlv_2, grammarAccess.getForkAccess().getForkKeyword_2());
                
            otherlv_3=(Token)match(input,13,FollowSets000.FOLLOW_13_in_ruleFork2672); 

                	newLeafNode(otherlv_3, grammarAccess.getForkAccess().getLeftCurlyBracketKeyword_3());
                
            // ../ac.soton.xtext.iumlb.dsl/src-gen/ac/soton/xtext/iumlb/parser/antlr/internal/InternalDsl.g:1206:1: (otherlv_4= 'internalId' ( (lv_internalId_5_0= ruleEString ) ) )?
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==33) ) {
                alt33=1;
            }
            switch (alt33) {
                case 1 :
                    // ../ac.soton.xtext.iumlb.dsl/src-gen/ac/soton/xtext/iumlb/parser/antlr/internal/InternalDsl.g:1206:3: otherlv_4= 'internalId' ( (lv_internalId_5_0= ruleEString ) )
                    {
                    otherlv_4=(Token)match(input,33,FollowSets000.FOLLOW_33_in_ruleFork2685); 

                        	newLeafNode(otherlv_4, grammarAccess.getForkAccess().getInternalIdKeyword_4_0());
                        
                    // ../ac.soton.xtext.iumlb.dsl/src-gen/ac/soton/xtext/iumlb/parser/antlr/internal/InternalDsl.g:1210:1: ( (lv_internalId_5_0= ruleEString ) )
                    // ../ac.soton.xtext.iumlb.dsl/src-gen/ac/soton/xtext/iumlb/parser/antlr/internal/InternalDsl.g:1211:1: (lv_internalId_5_0= ruleEString )
                    {
                    // ../ac.soton.xtext.iumlb.dsl/src-gen/ac/soton/xtext/iumlb/parser/antlr/internal/InternalDsl.g:1211:1: (lv_internalId_5_0= ruleEString )
                    // ../ac.soton.xtext.iumlb.dsl/src-gen/ac/soton/xtext/iumlb/parser/antlr/internal/InternalDsl.g:1212:3: lv_internalId_5_0= ruleEString
                    {
                     
                    	        newCompositeNode(grammarAccess.getForkAccess().getInternalIdEStringParserRuleCall_4_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleFork2706);
                    lv_internalId_5_0=ruleEString();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getForkRule());
                    	        }
                           		set(
                           			current, 
                           			"internalId",
                            		lv_internalId_5_0, 
                            		"EString");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            otherlv_6=(Token)match(input,18,FollowSets000.FOLLOW_18_in_ruleFork2720); 

                	newLeafNode(otherlv_6, grammarAccess.getForkAccess().getRightCurlyBracketKeyword_5());
                

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
    // $ANTLR end "ruleFork"


    // $ANTLR start "entryRuleInvariant"
    // ../ac.soton.xtext.iumlb.dsl/src-gen/ac/soton/xtext/iumlb/parser/antlr/internal/InternalDsl.g:1242:1: entryRuleInvariant returns [EObject current=null] : iv_ruleInvariant= ruleInvariant EOF ;
    public final EObject entryRuleInvariant() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInvariant = null;


        try {
            // ../ac.soton.xtext.iumlb.dsl/src-gen/ac/soton/xtext/iumlb/parser/antlr/internal/InternalDsl.g:1243:2: (iv_ruleInvariant= ruleInvariant EOF )
            // ../ac.soton.xtext.iumlb.dsl/src-gen/ac/soton/xtext/iumlb/parser/antlr/internal/InternalDsl.g:1244:2: iv_ruleInvariant= ruleInvariant EOF
            {
             newCompositeNode(grammarAccess.getInvariantRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleInvariant_in_entryRuleInvariant2758);
            iv_ruleInvariant=ruleInvariant();

            state._fsp--;

             current =iv_ruleInvariant; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleInvariant2768); 

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
    // ../ac.soton.xtext.iumlb.dsl/src-gen/ac/soton/xtext/iumlb/parser/antlr/internal/InternalDsl.g:1251:1: ruleInvariant returns [EObject current=null] : ( ( (lv_localGenerated_0_0= 'localGenerated' ) )? ( (lv_theorem_1_0= 'theorem' ) ) otherlv_2= 'Invariant' ( (lv_name_3_0= ruleEString ) ) otherlv_4= '{' (otherlv_5= 'internalId' ( (lv_internalId_6_0= ruleEString ) ) )? (otherlv_7= 'comment' ( (lv_comment_8_0= ruleEString ) ) )? otherlv_9= 'predicate' ( (lv_predicate_10_0= ruleEString ) ) otherlv_11= '}' ) ;
    public final EObject ruleInvariant() throws RecognitionException {
        EObject current = null;

        Token lv_localGenerated_0_0=null;
        Token lv_theorem_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        AntlrDatatypeRuleToken lv_name_3_0 = null;

        AntlrDatatypeRuleToken lv_internalId_6_0 = null;

        AntlrDatatypeRuleToken lv_comment_8_0 = null;

        AntlrDatatypeRuleToken lv_predicate_10_0 = null;


         enterRule(); 
            
        try {
            // ../ac.soton.xtext.iumlb.dsl/src-gen/ac/soton/xtext/iumlb/parser/antlr/internal/InternalDsl.g:1254:28: ( ( ( (lv_localGenerated_0_0= 'localGenerated' ) )? ( (lv_theorem_1_0= 'theorem' ) ) otherlv_2= 'Invariant' ( (lv_name_3_0= ruleEString ) ) otherlv_4= '{' (otherlv_5= 'internalId' ( (lv_internalId_6_0= ruleEString ) ) )? (otherlv_7= 'comment' ( (lv_comment_8_0= ruleEString ) ) )? otherlv_9= 'predicate' ( (lv_predicate_10_0= ruleEString ) ) otherlv_11= '}' ) )
            // ../ac.soton.xtext.iumlb.dsl/src-gen/ac/soton/xtext/iumlb/parser/antlr/internal/InternalDsl.g:1255:1: ( ( (lv_localGenerated_0_0= 'localGenerated' ) )? ( (lv_theorem_1_0= 'theorem' ) ) otherlv_2= 'Invariant' ( (lv_name_3_0= ruleEString ) ) otherlv_4= '{' (otherlv_5= 'internalId' ( (lv_internalId_6_0= ruleEString ) ) )? (otherlv_7= 'comment' ( (lv_comment_8_0= ruleEString ) ) )? otherlv_9= 'predicate' ( (lv_predicate_10_0= ruleEString ) ) otherlv_11= '}' )
            {
            // ../ac.soton.xtext.iumlb.dsl/src-gen/ac/soton/xtext/iumlb/parser/antlr/internal/InternalDsl.g:1255:1: ( ( (lv_localGenerated_0_0= 'localGenerated' ) )? ( (lv_theorem_1_0= 'theorem' ) ) otherlv_2= 'Invariant' ( (lv_name_3_0= ruleEString ) ) otherlv_4= '{' (otherlv_5= 'internalId' ( (lv_internalId_6_0= ruleEString ) ) )? (otherlv_7= 'comment' ( (lv_comment_8_0= ruleEString ) ) )? otherlv_9= 'predicate' ( (lv_predicate_10_0= ruleEString ) ) otherlv_11= '}' )
            // ../ac.soton.xtext.iumlb.dsl/src-gen/ac/soton/xtext/iumlb/parser/antlr/internal/InternalDsl.g:1255:2: ( (lv_localGenerated_0_0= 'localGenerated' ) )? ( (lv_theorem_1_0= 'theorem' ) ) otherlv_2= 'Invariant' ( (lv_name_3_0= ruleEString ) ) otherlv_4= '{' (otherlv_5= 'internalId' ( (lv_internalId_6_0= ruleEString ) ) )? (otherlv_7= 'comment' ( (lv_comment_8_0= ruleEString ) ) )? otherlv_9= 'predicate' ( (lv_predicate_10_0= ruleEString ) ) otherlv_11= '}'
            {
            // ../ac.soton.xtext.iumlb.dsl/src-gen/ac/soton/xtext/iumlb/parser/antlr/internal/InternalDsl.g:1255:2: ( (lv_localGenerated_0_0= 'localGenerated' ) )?
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( (LA34_0==11) ) {
                alt34=1;
            }
            switch (alt34) {
                case 1 :
                    // ../ac.soton.xtext.iumlb.dsl/src-gen/ac/soton/xtext/iumlb/parser/antlr/internal/InternalDsl.g:1256:1: (lv_localGenerated_0_0= 'localGenerated' )
                    {
                    // ../ac.soton.xtext.iumlb.dsl/src-gen/ac/soton/xtext/iumlb/parser/antlr/internal/InternalDsl.g:1256:1: (lv_localGenerated_0_0= 'localGenerated' )
                    // ../ac.soton.xtext.iumlb.dsl/src-gen/ac/soton/xtext/iumlb/parser/antlr/internal/InternalDsl.g:1257:3: lv_localGenerated_0_0= 'localGenerated'
                    {
                    lv_localGenerated_0_0=(Token)match(input,11,FollowSets000.FOLLOW_11_in_ruleInvariant2811); 

                            newLeafNode(lv_localGenerated_0_0, grammarAccess.getInvariantAccess().getLocalGeneratedLocalGeneratedKeyword_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getInvariantRule());
                    	        }
                           		setWithLastConsumed(current, "localGenerated", true, "localGenerated");
                    	    

                    }


                    }
                    break;

            }

            // ../ac.soton.xtext.iumlb.dsl/src-gen/ac/soton/xtext/iumlb/parser/antlr/internal/InternalDsl.g:1270:3: ( (lv_theorem_1_0= 'theorem' ) )
            // ../ac.soton.xtext.iumlb.dsl/src-gen/ac/soton/xtext/iumlb/parser/antlr/internal/InternalDsl.g:1271:1: (lv_theorem_1_0= 'theorem' )
            {
            // ../ac.soton.xtext.iumlb.dsl/src-gen/ac/soton/xtext/iumlb/parser/antlr/internal/InternalDsl.g:1271:1: (lv_theorem_1_0= 'theorem' )
            // ../ac.soton.xtext.iumlb.dsl/src-gen/ac/soton/xtext/iumlb/parser/antlr/internal/InternalDsl.g:1272:3: lv_theorem_1_0= 'theorem'
            {
            lv_theorem_1_0=(Token)match(input,38,FollowSets000.FOLLOW_38_in_ruleInvariant2843); 

                    newLeafNode(lv_theorem_1_0, grammarAccess.getInvariantAccess().getTheoremTheoremKeyword_1_0());
                

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getInvariantRule());
            	        }
                   		setWithLastConsumed(current, "theorem", true, "theorem");
            	    

            }


            }

            otherlv_2=(Token)match(input,39,FollowSets000.FOLLOW_39_in_ruleInvariant2868); 

                	newLeafNode(otherlv_2, grammarAccess.getInvariantAccess().getInvariantKeyword_2());
                
            // ../ac.soton.xtext.iumlb.dsl/src-gen/ac/soton/xtext/iumlb/parser/antlr/internal/InternalDsl.g:1289:1: ( (lv_name_3_0= ruleEString ) )
            // ../ac.soton.xtext.iumlb.dsl/src-gen/ac/soton/xtext/iumlb/parser/antlr/internal/InternalDsl.g:1290:1: (lv_name_3_0= ruleEString )
            {
            // ../ac.soton.xtext.iumlb.dsl/src-gen/ac/soton/xtext/iumlb/parser/antlr/internal/InternalDsl.g:1290:1: (lv_name_3_0= ruleEString )
            // ../ac.soton.xtext.iumlb.dsl/src-gen/ac/soton/xtext/iumlb/parser/antlr/internal/InternalDsl.g:1291:3: lv_name_3_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getInvariantAccess().getNameEStringParserRuleCall_3_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleInvariant2889);
            lv_name_3_0=ruleEString();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getInvariantRule());
            	        }
                   		set(
                   			current, 
                   			"name",
                    		lv_name_3_0, 
                    		"EString");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_4=(Token)match(input,13,FollowSets000.FOLLOW_13_in_ruleInvariant2901); 

                	newLeafNode(otherlv_4, grammarAccess.getInvariantAccess().getLeftCurlyBracketKeyword_4());
                
            // ../ac.soton.xtext.iumlb.dsl/src-gen/ac/soton/xtext/iumlb/parser/antlr/internal/InternalDsl.g:1311:1: (otherlv_5= 'internalId' ( (lv_internalId_6_0= ruleEString ) ) )?
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( (LA35_0==33) ) {
                alt35=1;
            }
            switch (alt35) {
                case 1 :
                    // ../ac.soton.xtext.iumlb.dsl/src-gen/ac/soton/xtext/iumlb/parser/antlr/internal/InternalDsl.g:1311:3: otherlv_5= 'internalId' ( (lv_internalId_6_0= ruleEString ) )
                    {
                    otherlv_5=(Token)match(input,33,FollowSets000.FOLLOW_33_in_ruleInvariant2914); 

                        	newLeafNode(otherlv_5, grammarAccess.getInvariantAccess().getInternalIdKeyword_5_0());
                        
                    // ../ac.soton.xtext.iumlb.dsl/src-gen/ac/soton/xtext/iumlb/parser/antlr/internal/InternalDsl.g:1315:1: ( (lv_internalId_6_0= ruleEString ) )
                    // ../ac.soton.xtext.iumlb.dsl/src-gen/ac/soton/xtext/iumlb/parser/antlr/internal/InternalDsl.g:1316:1: (lv_internalId_6_0= ruleEString )
                    {
                    // ../ac.soton.xtext.iumlb.dsl/src-gen/ac/soton/xtext/iumlb/parser/antlr/internal/InternalDsl.g:1316:1: (lv_internalId_6_0= ruleEString )
                    // ../ac.soton.xtext.iumlb.dsl/src-gen/ac/soton/xtext/iumlb/parser/antlr/internal/InternalDsl.g:1317:3: lv_internalId_6_0= ruleEString
                    {
                     
                    	        newCompositeNode(grammarAccess.getInvariantAccess().getInternalIdEStringParserRuleCall_5_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleInvariant2935);
                    lv_internalId_6_0=ruleEString();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getInvariantRule());
                    	        }
                           		set(
                           			current, 
                           			"internalId",
                            		lv_internalId_6_0, 
                            		"EString");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../ac.soton.xtext.iumlb.dsl/src-gen/ac/soton/xtext/iumlb/parser/antlr/internal/InternalDsl.g:1333:4: (otherlv_7= 'comment' ( (lv_comment_8_0= ruleEString ) ) )?
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( (LA36_0==14) ) {
                alt36=1;
            }
            switch (alt36) {
                case 1 :
                    // ../ac.soton.xtext.iumlb.dsl/src-gen/ac/soton/xtext/iumlb/parser/antlr/internal/InternalDsl.g:1333:6: otherlv_7= 'comment' ( (lv_comment_8_0= ruleEString ) )
                    {
                    otherlv_7=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleInvariant2950); 

                        	newLeafNode(otherlv_7, grammarAccess.getInvariantAccess().getCommentKeyword_6_0());
                        
                    // ../ac.soton.xtext.iumlb.dsl/src-gen/ac/soton/xtext/iumlb/parser/antlr/internal/InternalDsl.g:1337:1: ( (lv_comment_8_0= ruleEString ) )
                    // ../ac.soton.xtext.iumlb.dsl/src-gen/ac/soton/xtext/iumlb/parser/antlr/internal/InternalDsl.g:1338:1: (lv_comment_8_0= ruleEString )
                    {
                    // ../ac.soton.xtext.iumlb.dsl/src-gen/ac/soton/xtext/iumlb/parser/antlr/internal/InternalDsl.g:1338:1: (lv_comment_8_0= ruleEString )
                    // ../ac.soton.xtext.iumlb.dsl/src-gen/ac/soton/xtext/iumlb/parser/antlr/internal/InternalDsl.g:1339:3: lv_comment_8_0= ruleEString
                    {
                     
                    	        newCompositeNode(grammarAccess.getInvariantAccess().getCommentEStringParserRuleCall_6_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleInvariant2971);
                    lv_comment_8_0=ruleEString();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getInvariantRule());
                    	        }
                           		set(
                           			current, 
                           			"comment",
                            		lv_comment_8_0, 
                            		"EString");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            otherlv_9=(Token)match(input,40,FollowSets000.FOLLOW_40_in_ruleInvariant2985); 

                	newLeafNode(otherlv_9, grammarAccess.getInvariantAccess().getPredicateKeyword_7());
                
            // ../ac.soton.xtext.iumlb.dsl/src-gen/ac/soton/xtext/iumlb/parser/antlr/internal/InternalDsl.g:1359:1: ( (lv_predicate_10_0= ruleEString ) )
            // ../ac.soton.xtext.iumlb.dsl/src-gen/ac/soton/xtext/iumlb/parser/antlr/internal/InternalDsl.g:1360:1: (lv_predicate_10_0= ruleEString )
            {
            // ../ac.soton.xtext.iumlb.dsl/src-gen/ac/soton/xtext/iumlb/parser/antlr/internal/InternalDsl.g:1360:1: (lv_predicate_10_0= ruleEString )
            // ../ac.soton.xtext.iumlb.dsl/src-gen/ac/soton/xtext/iumlb/parser/antlr/internal/InternalDsl.g:1361:3: lv_predicate_10_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getInvariantAccess().getPredicateEStringParserRuleCall_8_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleInvariant3006);
            lv_predicate_10_0=ruleEString();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getInvariantRule());
            	        }
                   		set(
                   			current, 
                   			"predicate",
                    		lv_predicate_10_0, 
                    		"EString");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_11=(Token)match(input,18,FollowSets000.FOLLOW_18_in_ruleInvariant3018); 

                	newLeafNode(otherlv_11, grammarAccess.getInvariantAccess().getRightCurlyBracketKeyword_9());
                

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

    // Delegated rules


 

    
    private static class FollowSets000 {
        public static final BitSet FOLLOW_ruleAbstractNode_in_entryRuleAbstractNode75 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleAbstractNode85 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleState_in_ruleAbstractNode132 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleInitial_in_ruleAbstractNode159 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleFinal_in_ruleAbstractNode186 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAny_in_ruleAbstractNode213 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleJunction_in_ruleAbstractNode240 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleFork_in_ruleAbstractNode267 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleStatemachine_in_entryRuleStatemachine302 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleStatemachine312 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_11_in_ruleStatemachine355 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleStatemachine381 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleStatemachine402 = new BitSet(new long[]{0x0000000000002000L});
        public static final BitSet FOLLOW_13_in_ruleStatemachine414 = new BitSet(new long[]{0x00000000000DC000L});
        public static final BitSet FOLLOW_14_in_ruleStatemachine427 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleStatemachine448 = new BitSet(new long[]{0x00000000000D8000L});
        public static final BitSet FOLLOW_15_in_ruleStatemachine463 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleStatemachine486 = new BitSet(new long[]{0x00000000000D0000L});
        public static final BitSet FOLLOW_16_in_ruleStatemachine501 = new BitSet(new long[]{0x0000000000002000L});
        public static final BitSet FOLLOW_13_in_ruleStatemachine513 = new BitSet(new long[]{0x0000003D00100800L});
        public static final BitSet FOLLOW_ruleAbstractNode_in_ruleStatemachine534 = new BitSet(new long[]{0x0000000000060000L});
        public static final BitSet FOLLOW_17_in_ruleStatemachine547 = new BitSet(new long[]{0x0000003D00100800L});
        public static final BitSet FOLLOW_ruleAbstractNode_in_ruleStatemachine568 = new BitSet(new long[]{0x0000000000060000L});
        public static final BitSet FOLLOW_18_in_ruleStatemachine582 = new BitSet(new long[]{0x00000000000C0000L});
        public static final BitSet FOLLOW_19_in_ruleStatemachine597 = new BitSet(new long[]{0x0000000000002000L});
        public static final BitSet FOLLOW_13_in_ruleStatemachine609 = new BitSet(new long[]{0x0000000008000800L});
        public static final BitSet FOLLOW_ruleTransition_in_ruleStatemachine630 = new BitSet(new long[]{0x0000000000060000L});
        public static final BitSet FOLLOW_17_in_ruleStatemachine643 = new BitSet(new long[]{0x0000000008000800L});
        public static final BitSet FOLLOW_ruleTransition_in_ruleStatemachine664 = new BitSet(new long[]{0x0000000000060000L});
        public static final BitSet FOLLOW_18_in_ruleStatemachine678 = new BitSet(new long[]{0x0000000000040000L});
        public static final BitSet FOLLOW_18_in_ruleStatemachine692 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleState_in_entryRuleState728 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleState738 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_11_in_ruleState790 = new BitSet(new long[]{0x0000000000100000L});
        public static final BitSet FOLLOW_20_in_ruleState816 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleState837 = new BitSet(new long[]{0x0000000000002000L});
        public static final BitSet FOLLOW_13_in_ruleState849 = new BitSet(new long[]{0x0000000007248000L});
        public static final BitSet FOLLOW_21_in_ruleState862 = new BitSet(new long[]{0x0000000000400000L});
        public static final BitSet FOLLOW_22_in_ruleState874 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleState897 = new BitSet(new long[]{0x0000000000820000L});
        public static final BitSet FOLLOW_17_in_ruleState910 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleState933 = new BitSet(new long[]{0x0000000000820000L});
        public static final BitSet FOLLOW_23_in_ruleState947 = new BitSet(new long[]{0x0000000007048000L});
        public static final BitSet FOLLOW_24_in_ruleState962 = new BitSet(new long[]{0x0000000000400000L});
        public static final BitSet FOLLOW_22_in_ruleState974 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleState997 = new BitSet(new long[]{0x0000000000820000L});
        public static final BitSet FOLLOW_17_in_ruleState1010 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleState1033 = new BitSet(new long[]{0x0000000000820000L});
        public static final BitSet FOLLOW_23_in_ruleState1047 = new BitSet(new long[]{0x0000000006048000L});
        public static final BitSet FOLLOW_15_in_ruleState1062 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleState1085 = new BitSet(new long[]{0x0000000006040000L});
        public static final BitSet FOLLOW_25_in_ruleState1100 = new BitSet(new long[]{0x0000000000002000L});
        public static final BitSet FOLLOW_13_in_ruleState1112 = new BitSet(new long[]{0x0000000000001800L});
        public static final BitSet FOLLOW_ruleStatemachine_in_ruleState1133 = new BitSet(new long[]{0x0000000000060000L});
        public static final BitSet FOLLOW_17_in_ruleState1146 = new BitSet(new long[]{0x0000000000001800L});
        public static final BitSet FOLLOW_ruleStatemachine_in_ruleState1167 = new BitSet(new long[]{0x0000000000060000L});
        public static final BitSet FOLLOW_18_in_ruleState1181 = new BitSet(new long[]{0x0000000004040000L});
        public static final BitSet FOLLOW_26_in_ruleState1196 = new BitSet(new long[]{0x0000000000002000L});
        public static final BitSet FOLLOW_13_in_ruleState1208 = new BitSet(new long[]{0x0000004000000800L});
        public static final BitSet FOLLOW_ruleInvariant_in_ruleState1229 = new BitSet(new long[]{0x0000000000060000L});
        public static final BitSet FOLLOW_17_in_ruleState1242 = new BitSet(new long[]{0x0000004000000800L});
        public static final BitSet FOLLOW_ruleInvariant_in_ruleState1263 = new BitSet(new long[]{0x0000000000060000L});
        public static final BitSet FOLLOW_18_in_ruleState1277 = new BitSet(new long[]{0x0000000000040000L});
        public static final BitSet FOLLOW_18_in_ruleState1291 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_entryRuleEString1330 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleEString1341 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_STRING_in_ruleEString1381 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleEString1407 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleTransition_in_entryRuleTransition1454 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleTransition1464 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_11_in_ruleTransition1507 = new BitSet(new long[]{0x0000000008000000L});
        public static final BitSet FOLLOW_27_in_ruleTransition1539 = new BitSet(new long[]{0x0000000010000000L});
        public static final BitSet FOLLOW_28_in_ruleTransition1564 = new BitSet(new long[]{0x0000000000002000L});
        public static final BitSet FOLLOW_13_in_ruleTransition1576 = new BitSet(new long[]{0x0000000060004000L});
        public static final BitSet FOLLOW_14_in_ruleTransition1589 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleTransition1610 = new BitSet(new long[]{0x0000000060000000L});
        public static final BitSet FOLLOW_29_in_ruleTransition1625 = new BitSet(new long[]{0x0000000000400000L});
        public static final BitSet FOLLOW_22_in_ruleTransition1637 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleTransition1660 = new BitSet(new long[]{0x0000000000820000L});
        public static final BitSet FOLLOW_17_in_ruleTransition1673 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleTransition1696 = new BitSet(new long[]{0x0000000000820000L});
        public static final BitSet FOLLOW_23_in_ruleTransition1710 = new BitSet(new long[]{0x0000000040000000L});
        public static final BitSet FOLLOW_30_in_ruleTransition1724 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleTransition1747 = new BitSet(new long[]{0x0000000080000000L});
        public static final BitSet FOLLOW_31_in_ruleTransition1759 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleTransition1782 = new BitSet(new long[]{0x0000000000040000L});
        public static final BitSet FOLLOW_18_in_ruleTransition1794 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleInitial_in_entryRuleInitial1836 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleInitial1846 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_11_in_ruleInitial1898 = new BitSet(new long[]{0x0000000100000000L});
        public static final BitSet FOLLOW_32_in_ruleInitial1924 = new BitSet(new long[]{0x0000000000002000L});
        public static final BitSet FOLLOW_13_in_ruleInitial1936 = new BitSet(new long[]{0x0000000200040000L});
        public static final BitSet FOLLOW_33_in_ruleInitial1949 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleInitial1970 = new BitSet(new long[]{0x0000000000040000L});
        public static final BitSet FOLLOW_18_in_ruleInitial1984 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleFinal_in_entryRuleFinal2020 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleFinal2030 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_11_in_ruleFinal2082 = new BitSet(new long[]{0x0000000400000000L});
        public static final BitSet FOLLOW_34_in_ruleFinal2108 = new BitSet(new long[]{0x0000000000002000L});
        public static final BitSet FOLLOW_13_in_ruleFinal2120 = new BitSet(new long[]{0x0000000200040000L});
        public static final BitSet FOLLOW_33_in_ruleFinal2133 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleFinal2154 = new BitSet(new long[]{0x0000000000040000L});
        public static final BitSet FOLLOW_18_in_ruleFinal2168 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAny_in_entryRuleAny2204 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleAny2214 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_11_in_ruleAny2266 = new BitSet(new long[]{0x0000000800000000L});
        public static final BitSet FOLLOW_35_in_ruleAny2292 = new BitSet(new long[]{0x0000000000002000L});
        public static final BitSet FOLLOW_13_in_ruleAny2304 = new BitSet(new long[]{0x0000000200040000L});
        public static final BitSet FOLLOW_33_in_ruleAny2317 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleAny2338 = new BitSet(new long[]{0x0000000000040000L});
        public static final BitSet FOLLOW_18_in_ruleAny2352 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleJunction_in_entryRuleJunction2388 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleJunction2398 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_11_in_ruleJunction2450 = new BitSet(new long[]{0x0000001000000000L});
        public static final BitSet FOLLOW_36_in_ruleJunction2476 = new BitSet(new long[]{0x0000000000002000L});
        public static final BitSet FOLLOW_13_in_ruleJunction2488 = new BitSet(new long[]{0x0000000200040000L});
        public static final BitSet FOLLOW_33_in_ruleJunction2501 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleJunction2522 = new BitSet(new long[]{0x0000000000040000L});
        public static final BitSet FOLLOW_18_in_ruleJunction2536 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleFork_in_entryRuleFork2572 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleFork2582 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_11_in_ruleFork2634 = new BitSet(new long[]{0x0000002000000000L});
        public static final BitSet FOLLOW_37_in_ruleFork2660 = new BitSet(new long[]{0x0000000000002000L});
        public static final BitSet FOLLOW_13_in_ruleFork2672 = new BitSet(new long[]{0x0000000200040000L});
        public static final BitSet FOLLOW_33_in_ruleFork2685 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleFork2706 = new BitSet(new long[]{0x0000000000040000L});
        public static final BitSet FOLLOW_18_in_ruleFork2720 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleInvariant_in_entryRuleInvariant2758 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleInvariant2768 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_11_in_ruleInvariant2811 = new BitSet(new long[]{0x0000004000000000L});
        public static final BitSet FOLLOW_38_in_ruleInvariant2843 = new BitSet(new long[]{0x0000008000000000L});
        public static final BitSet FOLLOW_39_in_ruleInvariant2868 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleInvariant2889 = new BitSet(new long[]{0x0000000000002000L});
        public static final BitSet FOLLOW_13_in_ruleInvariant2901 = new BitSet(new long[]{0x0000010200004000L});
        public static final BitSet FOLLOW_33_in_ruleInvariant2914 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleInvariant2935 = new BitSet(new long[]{0x0000010000004000L});
        public static final BitSet FOLLOW_14_in_ruleInvariant2950 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleInvariant2971 = new BitSet(new long[]{0x0000010000000000L});
        public static final BitSet FOLLOW_40_in_ruleInvariant2985 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleInvariant3006 = new BitSet(new long[]{0x0000000000040000L});
        public static final BitSet FOLLOW_18_in_ruleInvariant3018 = new BitSet(new long[]{0x0000000000000002L});
    }


}