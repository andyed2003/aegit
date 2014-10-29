package ac.soton.xtext.statemachine.parser.antlr.internal; 

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import ac.soton.xtext.statemachine.services.DslGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalDslParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'StateMachine'", "'{'", "'Nodes'", "','", "'}'", "'Transitions'", "'StateMachines'", "'Transition'", "'event'", "'source'", "'target'", "'State'", "'nested'", "'Initial'", "'Junction'", "'Fork'", "'Join'", "'Any'", "'Final'"
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
    public String getGrammarFileName() { return "../ac.soton.xtext.statemachine.dsl/src-gen/ac/soton/xtext/statemachine/parser/antlr/internal/InternalDsl.g"; }



     	private DslGrammarAccess grammarAccess;
     	
        public InternalDslParser(TokenStream input, DslGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }
        
        @Override
        protected String getFirstRuleName() {
        	return "StateMachine";	
       	}
       	
       	@Override
       	protected DslGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}



    // $ANTLR start "entryRuleStateMachine"
    // ../ac.soton.xtext.statemachine.dsl/src-gen/ac/soton/xtext/statemachine/parser/antlr/internal/InternalDsl.g:67:1: entryRuleStateMachine returns [EObject current=null] : iv_ruleStateMachine= ruleStateMachine EOF ;
    public final EObject entryRuleStateMachine() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStateMachine = null;


        try {
            // ../ac.soton.xtext.statemachine.dsl/src-gen/ac/soton/xtext/statemachine/parser/antlr/internal/InternalDsl.g:68:2: (iv_ruleStateMachine= ruleStateMachine EOF )
            // ../ac.soton.xtext.statemachine.dsl/src-gen/ac/soton/xtext/statemachine/parser/antlr/internal/InternalDsl.g:69:2: iv_ruleStateMachine= ruleStateMachine EOF
            {
             newCompositeNode(grammarAccess.getStateMachineRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleStateMachine_in_entryRuleStateMachine75);
            iv_ruleStateMachine=ruleStateMachine();

            state._fsp--;

             current =iv_ruleStateMachine; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleStateMachine85); 

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
    // $ANTLR end "entryRuleStateMachine"


    // $ANTLR start "ruleStateMachine"
    // ../ac.soton.xtext.statemachine.dsl/src-gen/ac/soton/xtext/statemachine/parser/antlr/internal/InternalDsl.g:76:1: ruleStateMachine returns [EObject current=null] : ( () otherlv_1= 'StateMachine' otherlv_2= '{' (otherlv_3= 'Nodes' otherlv_4= '{' ( (lv_Nodes_5_0= ruleAbstractNode ) ) (otherlv_6= ',' ( (lv_Nodes_7_0= ruleAbstractNode ) ) )* otherlv_8= '}' )? (otherlv_9= 'Transitions' otherlv_10= '{' ( (lv_Transitions_11_0= ruleTransition ) ) (otherlv_12= ',' ( (lv_Transitions_13_0= ruleTransition ) ) )* otherlv_14= '}' )? (otherlv_15= 'StateMachines' otherlv_16= '{' ( (lv_StateMachines_17_0= ruleStateMachine ) ) (otherlv_18= ',' ( (lv_StateMachines_19_0= ruleStateMachine ) ) )* otherlv_20= '}' )? otherlv_21= '}' ) ;
    public final EObject ruleStateMachine() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        Token otherlv_14=null;
        Token otherlv_15=null;
        Token otherlv_16=null;
        Token otherlv_18=null;
        Token otherlv_20=null;
        Token otherlv_21=null;
        EObject lv_Nodes_5_0 = null;

        EObject lv_Nodes_7_0 = null;

        EObject lv_Transitions_11_0 = null;

        EObject lv_Transitions_13_0 = null;

        EObject lv_StateMachines_17_0 = null;

        EObject lv_StateMachines_19_0 = null;


         enterRule(); 
            
        try {
            // ../ac.soton.xtext.statemachine.dsl/src-gen/ac/soton/xtext/statemachine/parser/antlr/internal/InternalDsl.g:79:28: ( ( () otherlv_1= 'StateMachine' otherlv_2= '{' (otherlv_3= 'Nodes' otherlv_4= '{' ( (lv_Nodes_5_0= ruleAbstractNode ) ) (otherlv_6= ',' ( (lv_Nodes_7_0= ruleAbstractNode ) ) )* otherlv_8= '}' )? (otherlv_9= 'Transitions' otherlv_10= '{' ( (lv_Transitions_11_0= ruleTransition ) ) (otherlv_12= ',' ( (lv_Transitions_13_0= ruleTransition ) ) )* otherlv_14= '}' )? (otherlv_15= 'StateMachines' otherlv_16= '{' ( (lv_StateMachines_17_0= ruleStateMachine ) ) (otherlv_18= ',' ( (lv_StateMachines_19_0= ruleStateMachine ) ) )* otherlv_20= '}' )? otherlv_21= '}' ) )
            // ../ac.soton.xtext.statemachine.dsl/src-gen/ac/soton/xtext/statemachine/parser/antlr/internal/InternalDsl.g:80:1: ( () otherlv_1= 'StateMachine' otherlv_2= '{' (otherlv_3= 'Nodes' otherlv_4= '{' ( (lv_Nodes_5_0= ruleAbstractNode ) ) (otherlv_6= ',' ( (lv_Nodes_7_0= ruleAbstractNode ) ) )* otherlv_8= '}' )? (otherlv_9= 'Transitions' otherlv_10= '{' ( (lv_Transitions_11_0= ruleTransition ) ) (otherlv_12= ',' ( (lv_Transitions_13_0= ruleTransition ) ) )* otherlv_14= '}' )? (otherlv_15= 'StateMachines' otherlv_16= '{' ( (lv_StateMachines_17_0= ruleStateMachine ) ) (otherlv_18= ',' ( (lv_StateMachines_19_0= ruleStateMachine ) ) )* otherlv_20= '}' )? otherlv_21= '}' )
            {
            // ../ac.soton.xtext.statemachine.dsl/src-gen/ac/soton/xtext/statemachine/parser/antlr/internal/InternalDsl.g:80:1: ( () otherlv_1= 'StateMachine' otherlv_2= '{' (otherlv_3= 'Nodes' otherlv_4= '{' ( (lv_Nodes_5_0= ruleAbstractNode ) ) (otherlv_6= ',' ( (lv_Nodes_7_0= ruleAbstractNode ) ) )* otherlv_8= '}' )? (otherlv_9= 'Transitions' otherlv_10= '{' ( (lv_Transitions_11_0= ruleTransition ) ) (otherlv_12= ',' ( (lv_Transitions_13_0= ruleTransition ) ) )* otherlv_14= '}' )? (otherlv_15= 'StateMachines' otherlv_16= '{' ( (lv_StateMachines_17_0= ruleStateMachine ) ) (otherlv_18= ',' ( (lv_StateMachines_19_0= ruleStateMachine ) ) )* otherlv_20= '}' )? otherlv_21= '}' )
            // ../ac.soton.xtext.statemachine.dsl/src-gen/ac/soton/xtext/statemachine/parser/antlr/internal/InternalDsl.g:80:2: () otherlv_1= 'StateMachine' otherlv_2= '{' (otherlv_3= 'Nodes' otherlv_4= '{' ( (lv_Nodes_5_0= ruleAbstractNode ) ) (otherlv_6= ',' ( (lv_Nodes_7_0= ruleAbstractNode ) ) )* otherlv_8= '}' )? (otherlv_9= 'Transitions' otherlv_10= '{' ( (lv_Transitions_11_0= ruleTransition ) ) (otherlv_12= ',' ( (lv_Transitions_13_0= ruleTransition ) ) )* otherlv_14= '}' )? (otherlv_15= 'StateMachines' otherlv_16= '{' ( (lv_StateMachines_17_0= ruleStateMachine ) ) (otherlv_18= ',' ( (lv_StateMachines_19_0= ruleStateMachine ) ) )* otherlv_20= '}' )? otherlv_21= '}'
            {
            // ../ac.soton.xtext.statemachine.dsl/src-gen/ac/soton/xtext/statemachine/parser/antlr/internal/InternalDsl.g:80:2: ()
            // ../ac.soton.xtext.statemachine.dsl/src-gen/ac/soton/xtext/statemachine/parser/antlr/internal/InternalDsl.g:81:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getStateMachineAccess().getStateMachineAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,11,FollowSets000.FOLLOW_11_in_ruleStateMachine131); 

                	newLeafNode(otherlv_1, grammarAccess.getStateMachineAccess().getStateMachineKeyword_1());
                
            otherlv_2=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleStateMachine143); 

                	newLeafNode(otherlv_2, grammarAccess.getStateMachineAccess().getLeftCurlyBracketKeyword_2());
                
            // ../ac.soton.xtext.statemachine.dsl/src-gen/ac/soton/xtext/statemachine/parser/antlr/internal/InternalDsl.g:94:1: (otherlv_3= 'Nodes' otherlv_4= '{' ( (lv_Nodes_5_0= ruleAbstractNode ) ) (otherlv_6= ',' ( (lv_Nodes_7_0= ruleAbstractNode ) ) )* otherlv_8= '}' )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==13) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // ../ac.soton.xtext.statemachine.dsl/src-gen/ac/soton/xtext/statemachine/parser/antlr/internal/InternalDsl.g:94:3: otherlv_3= 'Nodes' otherlv_4= '{' ( (lv_Nodes_5_0= ruleAbstractNode ) ) (otherlv_6= ',' ( (lv_Nodes_7_0= ruleAbstractNode ) ) )* otherlv_8= '}'
                    {
                    otherlv_3=(Token)match(input,13,FollowSets000.FOLLOW_13_in_ruleStateMachine156); 

                        	newLeafNode(otherlv_3, grammarAccess.getStateMachineAccess().getNodesKeyword_3_0());
                        
                    otherlv_4=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleStateMachine168); 

                        	newLeafNode(otherlv_4, grammarAccess.getStateMachineAccess().getLeftCurlyBracketKeyword_3_1());
                        
                    // ../ac.soton.xtext.statemachine.dsl/src-gen/ac/soton/xtext/statemachine/parser/antlr/internal/InternalDsl.g:102:1: ( (lv_Nodes_5_0= ruleAbstractNode ) )
                    // ../ac.soton.xtext.statemachine.dsl/src-gen/ac/soton/xtext/statemachine/parser/antlr/internal/InternalDsl.g:103:1: (lv_Nodes_5_0= ruleAbstractNode )
                    {
                    // ../ac.soton.xtext.statemachine.dsl/src-gen/ac/soton/xtext/statemachine/parser/antlr/internal/InternalDsl.g:103:1: (lv_Nodes_5_0= ruleAbstractNode )
                    // ../ac.soton.xtext.statemachine.dsl/src-gen/ac/soton/xtext/statemachine/parser/antlr/internal/InternalDsl.g:104:3: lv_Nodes_5_0= ruleAbstractNode
                    {
                     
                    	        newCompositeNode(grammarAccess.getStateMachineAccess().getNodesAbstractNodeParserRuleCall_3_2_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleAbstractNode_in_ruleStateMachine189);
                    lv_Nodes_5_0=ruleAbstractNode();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getStateMachineRule());
                    	        }
                           		add(
                           			current, 
                           			"Nodes",
                            		lv_Nodes_5_0, 
                            		"AbstractNode");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../ac.soton.xtext.statemachine.dsl/src-gen/ac/soton/xtext/statemachine/parser/antlr/internal/InternalDsl.g:120:2: (otherlv_6= ',' ( (lv_Nodes_7_0= ruleAbstractNode ) ) )*
                    loop1:
                    do {
                        int alt1=2;
                        int LA1_0 = input.LA(1);

                        if ( (LA1_0==14) ) {
                            alt1=1;
                        }


                        switch (alt1) {
                    	case 1 :
                    	    // ../ac.soton.xtext.statemachine.dsl/src-gen/ac/soton/xtext/statemachine/parser/antlr/internal/InternalDsl.g:120:4: otherlv_6= ',' ( (lv_Nodes_7_0= ruleAbstractNode ) )
                    	    {
                    	    otherlv_6=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleStateMachine202); 

                    	        	newLeafNode(otherlv_6, grammarAccess.getStateMachineAccess().getCommaKeyword_3_3_0());
                    	        
                    	    // ../ac.soton.xtext.statemachine.dsl/src-gen/ac/soton/xtext/statemachine/parser/antlr/internal/InternalDsl.g:124:1: ( (lv_Nodes_7_0= ruleAbstractNode ) )
                    	    // ../ac.soton.xtext.statemachine.dsl/src-gen/ac/soton/xtext/statemachine/parser/antlr/internal/InternalDsl.g:125:1: (lv_Nodes_7_0= ruleAbstractNode )
                    	    {
                    	    // ../ac.soton.xtext.statemachine.dsl/src-gen/ac/soton/xtext/statemachine/parser/antlr/internal/InternalDsl.g:125:1: (lv_Nodes_7_0= ruleAbstractNode )
                    	    // ../ac.soton.xtext.statemachine.dsl/src-gen/ac/soton/xtext/statemachine/parser/antlr/internal/InternalDsl.g:126:3: lv_Nodes_7_0= ruleAbstractNode
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getStateMachineAccess().getNodesAbstractNodeParserRuleCall_3_3_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleAbstractNode_in_ruleStateMachine223);
                    	    lv_Nodes_7_0=ruleAbstractNode();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getStateMachineRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"Nodes",
                    	            		lv_Nodes_7_0, 
                    	            		"AbstractNode");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop1;
                        }
                    } while (true);

                    otherlv_8=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleStateMachine237); 

                        	newLeafNode(otherlv_8, grammarAccess.getStateMachineAccess().getRightCurlyBracketKeyword_3_4());
                        

                    }
                    break;

            }

            // ../ac.soton.xtext.statemachine.dsl/src-gen/ac/soton/xtext/statemachine/parser/antlr/internal/InternalDsl.g:146:3: (otherlv_9= 'Transitions' otherlv_10= '{' ( (lv_Transitions_11_0= ruleTransition ) ) (otherlv_12= ',' ( (lv_Transitions_13_0= ruleTransition ) ) )* otherlv_14= '}' )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==16) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // ../ac.soton.xtext.statemachine.dsl/src-gen/ac/soton/xtext/statemachine/parser/antlr/internal/InternalDsl.g:146:5: otherlv_9= 'Transitions' otherlv_10= '{' ( (lv_Transitions_11_0= ruleTransition ) ) (otherlv_12= ',' ( (lv_Transitions_13_0= ruleTransition ) ) )* otherlv_14= '}'
                    {
                    otherlv_9=(Token)match(input,16,FollowSets000.FOLLOW_16_in_ruleStateMachine252); 

                        	newLeafNode(otherlv_9, grammarAccess.getStateMachineAccess().getTransitionsKeyword_4_0());
                        
                    otherlv_10=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleStateMachine264); 

                        	newLeafNode(otherlv_10, grammarAccess.getStateMachineAccess().getLeftCurlyBracketKeyword_4_1());
                        
                    // ../ac.soton.xtext.statemachine.dsl/src-gen/ac/soton/xtext/statemachine/parser/antlr/internal/InternalDsl.g:154:1: ( (lv_Transitions_11_0= ruleTransition ) )
                    // ../ac.soton.xtext.statemachine.dsl/src-gen/ac/soton/xtext/statemachine/parser/antlr/internal/InternalDsl.g:155:1: (lv_Transitions_11_0= ruleTransition )
                    {
                    // ../ac.soton.xtext.statemachine.dsl/src-gen/ac/soton/xtext/statemachine/parser/antlr/internal/InternalDsl.g:155:1: (lv_Transitions_11_0= ruleTransition )
                    // ../ac.soton.xtext.statemachine.dsl/src-gen/ac/soton/xtext/statemachine/parser/antlr/internal/InternalDsl.g:156:3: lv_Transitions_11_0= ruleTransition
                    {
                     
                    	        newCompositeNode(grammarAccess.getStateMachineAccess().getTransitionsTransitionParserRuleCall_4_2_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleTransition_in_ruleStateMachine285);
                    lv_Transitions_11_0=ruleTransition();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getStateMachineRule());
                    	        }
                           		add(
                           			current, 
                           			"Transitions",
                            		lv_Transitions_11_0, 
                            		"Transition");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../ac.soton.xtext.statemachine.dsl/src-gen/ac/soton/xtext/statemachine/parser/antlr/internal/InternalDsl.g:172:2: (otherlv_12= ',' ( (lv_Transitions_13_0= ruleTransition ) ) )*
                    loop3:
                    do {
                        int alt3=2;
                        int LA3_0 = input.LA(1);

                        if ( (LA3_0==14) ) {
                            alt3=1;
                        }


                        switch (alt3) {
                    	case 1 :
                    	    // ../ac.soton.xtext.statemachine.dsl/src-gen/ac/soton/xtext/statemachine/parser/antlr/internal/InternalDsl.g:172:4: otherlv_12= ',' ( (lv_Transitions_13_0= ruleTransition ) )
                    	    {
                    	    otherlv_12=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleStateMachine298); 

                    	        	newLeafNode(otherlv_12, grammarAccess.getStateMachineAccess().getCommaKeyword_4_3_0());
                    	        
                    	    // ../ac.soton.xtext.statemachine.dsl/src-gen/ac/soton/xtext/statemachine/parser/antlr/internal/InternalDsl.g:176:1: ( (lv_Transitions_13_0= ruleTransition ) )
                    	    // ../ac.soton.xtext.statemachine.dsl/src-gen/ac/soton/xtext/statemachine/parser/antlr/internal/InternalDsl.g:177:1: (lv_Transitions_13_0= ruleTransition )
                    	    {
                    	    // ../ac.soton.xtext.statemachine.dsl/src-gen/ac/soton/xtext/statemachine/parser/antlr/internal/InternalDsl.g:177:1: (lv_Transitions_13_0= ruleTransition )
                    	    // ../ac.soton.xtext.statemachine.dsl/src-gen/ac/soton/xtext/statemachine/parser/antlr/internal/InternalDsl.g:178:3: lv_Transitions_13_0= ruleTransition
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getStateMachineAccess().getTransitionsTransitionParserRuleCall_4_3_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleTransition_in_ruleStateMachine319);
                    	    lv_Transitions_13_0=ruleTransition();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getStateMachineRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"Transitions",
                    	            		lv_Transitions_13_0, 
                    	            		"Transition");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop3;
                        }
                    } while (true);

                    otherlv_14=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleStateMachine333); 

                        	newLeafNode(otherlv_14, grammarAccess.getStateMachineAccess().getRightCurlyBracketKeyword_4_4());
                        

                    }
                    break;

            }

            // ../ac.soton.xtext.statemachine.dsl/src-gen/ac/soton/xtext/statemachine/parser/antlr/internal/InternalDsl.g:198:3: (otherlv_15= 'StateMachines' otherlv_16= '{' ( (lv_StateMachines_17_0= ruleStateMachine ) ) (otherlv_18= ',' ( (lv_StateMachines_19_0= ruleStateMachine ) ) )* otherlv_20= '}' )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==17) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // ../ac.soton.xtext.statemachine.dsl/src-gen/ac/soton/xtext/statemachine/parser/antlr/internal/InternalDsl.g:198:5: otherlv_15= 'StateMachines' otherlv_16= '{' ( (lv_StateMachines_17_0= ruleStateMachine ) ) (otherlv_18= ',' ( (lv_StateMachines_19_0= ruleStateMachine ) ) )* otherlv_20= '}'
                    {
                    otherlv_15=(Token)match(input,17,FollowSets000.FOLLOW_17_in_ruleStateMachine348); 

                        	newLeafNode(otherlv_15, grammarAccess.getStateMachineAccess().getStateMachinesKeyword_5_0());
                        
                    otherlv_16=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleStateMachine360); 

                        	newLeafNode(otherlv_16, grammarAccess.getStateMachineAccess().getLeftCurlyBracketKeyword_5_1());
                        
                    // ../ac.soton.xtext.statemachine.dsl/src-gen/ac/soton/xtext/statemachine/parser/antlr/internal/InternalDsl.g:206:1: ( (lv_StateMachines_17_0= ruleStateMachine ) )
                    // ../ac.soton.xtext.statemachine.dsl/src-gen/ac/soton/xtext/statemachine/parser/antlr/internal/InternalDsl.g:207:1: (lv_StateMachines_17_0= ruleStateMachine )
                    {
                    // ../ac.soton.xtext.statemachine.dsl/src-gen/ac/soton/xtext/statemachine/parser/antlr/internal/InternalDsl.g:207:1: (lv_StateMachines_17_0= ruleStateMachine )
                    // ../ac.soton.xtext.statemachine.dsl/src-gen/ac/soton/xtext/statemachine/parser/antlr/internal/InternalDsl.g:208:3: lv_StateMachines_17_0= ruleStateMachine
                    {
                     
                    	        newCompositeNode(grammarAccess.getStateMachineAccess().getStateMachinesStateMachineParserRuleCall_5_2_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleStateMachine_in_ruleStateMachine381);
                    lv_StateMachines_17_0=ruleStateMachine();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getStateMachineRule());
                    	        }
                           		add(
                           			current, 
                           			"StateMachines",
                            		lv_StateMachines_17_0, 
                            		"StateMachine");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../ac.soton.xtext.statemachine.dsl/src-gen/ac/soton/xtext/statemachine/parser/antlr/internal/InternalDsl.g:224:2: (otherlv_18= ',' ( (lv_StateMachines_19_0= ruleStateMachine ) ) )*
                    loop5:
                    do {
                        int alt5=2;
                        int LA5_0 = input.LA(1);

                        if ( (LA5_0==14) ) {
                            alt5=1;
                        }


                        switch (alt5) {
                    	case 1 :
                    	    // ../ac.soton.xtext.statemachine.dsl/src-gen/ac/soton/xtext/statemachine/parser/antlr/internal/InternalDsl.g:224:4: otherlv_18= ',' ( (lv_StateMachines_19_0= ruleStateMachine ) )
                    	    {
                    	    otherlv_18=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleStateMachine394); 

                    	        	newLeafNode(otherlv_18, grammarAccess.getStateMachineAccess().getCommaKeyword_5_3_0());
                    	        
                    	    // ../ac.soton.xtext.statemachine.dsl/src-gen/ac/soton/xtext/statemachine/parser/antlr/internal/InternalDsl.g:228:1: ( (lv_StateMachines_19_0= ruleStateMachine ) )
                    	    // ../ac.soton.xtext.statemachine.dsl/src-gen/ac/soton/xtext/statemachine/parser/antlr/internal/InternalDsl.g:229:1: (lv_StateMachines_19_0= ruleStateMachine )
                    	    {
                    	    // ../ac.soton.xtext.statemachine.dsl/src-gen/ac/soton/xtext/statemachine/parser/antlr/internal/InternalDsl.g:229:1: (lv_StateMachines_19_0= ruleStateMachine )
                    	    // ../ac.soton.xtext.statemachine.dsl/src-gen/ac/soton/xtext/statemachine/parser/antlr/internal/InternalDsl.g:230:3: lv_StateMachines_19_0= ruleStateMachine
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getStateMachineAccess().getStateMachinesStateMachineParserRuleCall_5_3_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleStateMachine_in_ruleStateMachine415);
                    	    lv_StateMachines_19_0=ruleStateMachine();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getStateMachineRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"StateMachines",
                    	            		lv_StateMachines_19_0, 
                    	            		"StateMachine");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop5;
                        }
                    } while (true);

                    otherlv_20=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleStateMachine429); 

                        	newLeafNode(otherlv_20, grammarAccess.getStateMachineAccess().getRightCurlyBracketKeyword_5_4());
                        

                    }
                    break;

            }

            otherlv_21=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleStateMachine443); 

                	newLeafNode(otherlv_21, grammarAccess.getStateMachineAccess().getRightCurlyBracketKeyword_6());
                

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
    // $ANTLR end "ruleStateMachine"


    // $ANTLR start "entryRuleAbstractNode"
    // ../ac.soton.xtext.statemachine.dsl/src-gen/ac/soton/xtext/statemachine/parser/antlr/internal/InternalDsl.g:262:1: entryRuleAbstractNode returns [EObject current=null] : iv_ruleAbstractNode= ruleAbstractNode EOF ;
    public final EObject entryRuleAbstractNode() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAbstractNode = null;


        try {
            // ../ac.soton.xtext.statemachine.dsl/src-gen/ac/soton/xtext/statemachine/parser/antlr/internal/InternalDsl.g:263:2: (iv_ruleAbstractNode= ruleAbstractNode EOF )
            // ../ac.soton.xtext.statemachine.dsl/src-gen/ac/soton/xtext/statemachine/parser/antlr/internal/InternalDsl.g:264:2: iv_ruleAbstractNode= ruleAbstractNode EOF
            {
             newCompositeNode(grammarAccess.getAbstractNodeRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleAbstractNode_in_entryRuleAbstractNode479);
            iv_ruleAbstractNode=ruleAbstractNode();

            state._fsp--;

             current =iv_ruleAbstractNode; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleAbstractNode489); 

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
    // ../ac.soton.xtext.statemachine.dsl/src-gen/ac/soton/xtext/statemachine/parser/antlr/internal/InternalDsl.g:271:1: ruleAbstractNode returns [EObject current=null] : (this_State_0= ruleState | this_Initial_1= ruleInitial | this_Junction_2= ruleJunction | this_Fork_3= ruleFork | this_Join_4= ruleJoin | this_Any_5= ruleAny | this_Final_6= ruleFinal ) ;
    public final EObject ruleAbstractNode() throws RecognitionException {
        EObject current = null;

        EObject this_State_0 = null;

        EObject this_Initial_1 = null;

        EObject this_Junction_2 = null;

        EObject this_Fork_3 = null;

        EObject this_Join_4 = null;

        EObject this_Any_5 = null;

        EObject this_Final_6 = null;


         enterRule(); 
            
        try {
            // ../ac.soton.xtext.statemachine.dsl/src-gen/ac/soton/xtext/statemachine/parser/antlr/internal/InternalDsl.g:274:28: ( (this_State_0= ruleState | this_Initial_1= ruleInitial | this_Junction_2= ruleJunction | this_Fork_3= ruleFork | this_Join_4= ruleJoin | this_Any_5= ruleAny | this_Final_6= ruleFinal ) )
            // ../ac.soton.xtext.statemachine.dsl/src-gen/ac/soton/xtext/statemachine/parser/antlr/internal/InternalDsl.g:275:1: (this_State_0= ruleState | this_Initial_1= ruleInitial | this_Junction_2= ruleJunction | this_Fork_3= ruleFork | this_Join_4= ruleJoin | this_Any_5= ruleAny | this_Final_6= ruleFinal )
            {
            // ../ac.soton.xtext.statemachine.dsl/src-gen/ac/soton/xtext/statemachine/parser/antlr/internal/InternalDsl.g:275:1: (this_State_0= ruleState | this_Initial_1= ruleInitial | this_Junction_2= ruleJunction | this_Fork_3= ruleFork | this_Join_4= ruleJoin | this_Any_5= ruleAny | this_Final_6= ruleFinal )
            int alt7=7;
            switch ( input.LA(1) ) {
            case 22:
                {
                alt7=1;
                }
                break;
            case 24:
                {
                alt7=2;
                }
                break;
            case 25:
                {
                alt7=3;
                }
                break;
            case 26:
                {
                alt7=4;
                }
                break;
            case 27:
                {
                alt7=5;
                }
                break;
            case 28:
                {
                alt7=6;
                }
                break;
            case 29:
                {
                alt7=7;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }

            switch (alt7) {
                case 1 :
                    // ../ac.soton.xtext.statemachine.dsl/src-gen/ac/soton/xtext/statemachine/parser/antlr/internal/InternalDsl.g:276:5: this_State_0= ruleState
                    {
                     
                            newCompositeNode(grammarAccess.getAbstractNodeAccess().getStateParserRuleCall_0()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleState_in_ruleAbstractNode536);
                    this_State_0=ruleState();

                    state._fsp--;

                     
                            current = this_State_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../ac.soton.xtext.statemachine.dsl/src-gen/ac/soton/xtext/statemachine/parser/antlr/internal/InternalDsl.g:286:5: this_Initial_1= ruleInitial
                    {
                     
                            newCompositeNode(grammarAccess.getAbstractNodeAccess().getInitialParserRuleCall_1()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleInitial_in_ruleAbstractNode563);
                    this_Initial_1=ruleInitial();

                    state._fsp--;

                     
                            current = this_Initial_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // ../ac.soton.xtext.statemachine.dsl/src-gen/ac/soton/xtext/statemachine/parser/antlr/internal/InternalDsl.g:296:5: this_Junction_2= ruleJunction
                    {
                     
                            newCompositeNode(grammarAccess.getAbstractNodeAccess().getJunctionParserRuleCall_2()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleJunction_in_ruleAbstractNode590);
                    this_Junction_2=ruleJunction();

                    state._fsp--;

                     
                            current = this_Junction_2; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 4 :
                    // ../ac.soton.xtext.statemachine.dsl/src-gen/ac/soton/xtext/statemachine/parser/antlr/internal/InternalDsl.g:306:5: this_Fork_3= ruleFork
                    {
                     
                            newCompositeNode(grammarAccess.getAbstractNodeAccess().getForkParserRuleCall_3()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleFork_in_ruleAbstractNode617);
                    this_Fork_3=ruleFork();

                    state._fsp--;

                     
                            current = this_Fork_3; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 5 :
                    // ../ac.soton.xtext.statemachine.dsl/src-gen/ac/soton/xtext/statemachine/parser/antlr/internal/InternalDsl.g:316:5: this_Join_4= ruleJoin
                    {
                     
                            newCompositeNode(grammarAccess.getAbstractNodeAccess().getJoinParserRuleCall_4()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleJoin_in_ruleAbstractNode644);
                    this_Join_4=ruleJoin();

                    state._fsp--;

                     
                            current = this_Join_4; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 6 :
                    // ../ac.soton.xtext.statemachine.dsl/src-gen/ac/soton/xtext/statemachine/parser/antlr/internal/InternalDsl.g:326:5: this_Any_5= ruleAny
                    {
                     
                            newCompositeNode(grammarAccess.getAbstractNodeAccess().getAnyParserRuleCall_5()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleAny_in_ruleAbstractNode671);
                    this_Any_5=ruleAny();

                    state._fsp--;

                     
                            current = this_Any_5; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 7 :
                    // ../ac.soton.xtext.statemachine.dsl/src-gen/ac/soton/xtext/statemachine/parser/antlr/internal/InternalDsl.g:336:5: this_Final_6= ruleFinal
                    {
                     
                            newCompositeNode(grammarAccess.getAbstractNodeAccess().getFinalParserRuleCall_6()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleFinal_in_ruleAbstractNode698);
                    this_Final_6=ruleFinal();

                    state._fsp--;

                     
                            current = this_Final_6; 
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


    // $ANTLR start "entryRuleTransition"
    // ../ac.soton.xtext.statemachine.dsl/src-gen/ac/soton/xtext/statemachine/parser/antlr/internal/InternalDsl.g:352:1: entryRuleTransition returns [EObject current=null] : iv_ruleTransition= ruleTransition EOF ;
    public final EObject entryRuleTransition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTransition = null;


        try {
            // ../ac.soton.xtext.statemachine.dsl/src-gen/ac/soton/xtext/statemachine/parser/antlr/internal/InternalDsl.g:353:2: (iv_ruleTransition= ruleTransition EOF )
            // ../ac.soton.xtext.statemachine.dsl/src-gen/ac/soton/xtext/statemachine/parser/antlr/internal/InternalDsl.g:354:2: iv_ruleTransition= ruleTransition EOF
            {
             newCompositeNode(grammarAccess.getTransitionRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleTransition_in_entryRuleTransition733);
            iv_ruleTransition=ruleTransition();

            state._fsp--;

             current =iv_ruleTransition; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleTransition743); 

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
    // ../ac.soton.xtext.statemachine.dsl/src-gen/ac/soton/xtext/statemachine/parser/antlr/internal/InternalDsl.g:361:1: ruleTransition returns [EObject current=null] : ( () otherlv_1= 'Transition' otherlv_2= '{' (otherlv_3= 'event' ( (lv_event_4_0= ruleEString ) ) )? (otherlv_5= 'source' ( (lv_source_6_0= ruleEString ) ) )? (otherlv_7= 'target' ( (lv_target_8_0= ruleEString ) ) )? otherlv_9= '}' ) ;
    public final EObject ruleTransition() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        AntlrDatatypeRuleToken lv_event_4_0 = null;

        AntlrDatatypeRuleToken lv_source_6_0 = null;

        AntlrDatatypeRuleToken lv_target_8_0 = null;


         enterRule(); 
            
        try {
            // ../ac.soton.xtext.statemachine.dsl/src-gen/ac/soton/xtext/statemachine/parser/antlr/internal/InternalDsl.g:364:28: ( ( () otherlv_1= 'Transition' otherlv_2= '{' (otherlv_3= 'event' ( (lv_event_4_0= ruleEString ) ) )? (otherlv_5= 'source' ( (lv_source_6_0= ruleEString ) ) )? (otherlv_7= 'target' ( (lv_target_8_0= ruleEString ) ) )? otherlv_9= '}' ) )
            // ../ac.soton.xtext.statemachine.dsl/src-gen/ac/soton/xtext/statemachine/parser/antlr/internal/InternalDsl.g:365:1: ( () otherlv_1= 'Transition' otherlv_2= '{' (otherlv_3= 'event' ( (lv_event_4_0= ruleEString ) ) )? (otherlv_5= 'source' ( (lv_source_6_0= ruleEString ) ) )? (otherlv_7= 'target' ( (lv_target_8_0= ruleEString ) ) )? otherlv_9= '}' )
            {
            // ../ac.soton.xtext.statemachine.dsl/src-gen/ac/soton/xtext/statemachine/parser/antlr/internal/InternalDsl.g:365:1: ( () otherlv_1= 'Transition' otherlv_2= '{' (otherlv_3= 'event' ( (lv_event_4_0= ruleEString ) ) )? (otherlv_5= 'source' ( (lv_source_6_0= ruleEString ) ) )? (otherlv_7= 'target' ( (lv_target_8_0= ruleEString ) ) )? otherlv_9= '}' )
            // ../ac.soton.xtext.statemachine.dsl/src-gen/ac/soton/xtext/statemachine/parser/antlr/internal/InternalDsl.g:365:2: () otherlv_1= 'Transition' otherlv_2= '{' (otherlv_3= 'event' ( (lv_event_4_0= ruleEString ) ) )? (otherlv_5= 'source' ( (lv_source_6_0= ruleEString ) ) )? (otherlv_7= 'target' ( (lv_target_8_0= ruleEString ) ) )? otherlv_9= '}'
            {
            // ../ac.soton.xtext.statemachine.dsl/src-gen/ac/soton/xtext/statemachine/parser/antlr/internal/InternalDsl.g:365:2: ()
            // ../ac.soton.xtext.statemachine.dsl/src-gen/ac/soton/xtext/statemachine/parser/antlr/internal/InternalDsl.g:366:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getTransitionAccess().getTransitionAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,18,FollowSets000.FOLLOW_18_in_ruleTransition789); 

                	newLeafNode(otherlv_1, grammarAccess.getTransitionAccess().getTransitionKeyword_1());
                
            otherlv_2=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleTransition801); 

                	newLeafNode(otherlv_2, grammarAccess.getTransitionAccess().getLeftCurlyBracketKeyword_2());
                
            // ../ac.soton.xtext.statemachine.dsl/src-gen/ac/soton/xtext/statemachine/parser/antlr/internal/InternalDsl.g:379:1: (otherlv_3= 'event' ( (lv_event_4_0= ruleEString ) ) )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==19) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // ../ac.soton.xtext.statemachine.dsl/src-gen/ac/soton/xtext/statemachine/parser/antlr/internal/InternalDsl.g:379:3: otherlv_3= 'event' ( (lv_event_4_0= ruleEString ) )
                    {
                    otherlv_3=(Token)match(input,19,FollowSets000.FOLLOW_19_in_ruleTransition814); 

                        	newLeafNode(otherlv_3, grammarAccess.getTransitionAccess().getEventKeyword_3_0());
                        
                    // ../ac.soton.xtext.statemachine.dsl/src-gen/ac/soton/xtext/statemachine/parser/antlr/internal/InternalDsl.g:383:1: ( (lv_event_4_0= ruleEString ) )
                    // ../ac.soton.xtext.statemachine.dsl/src-gen/ac/soton/xtext/statemachine/parser/antlr/internal/InternalDsl.g:384:1: (lv_event_4_0= ruleEString )
                    {
                    // ../ac.soton.xtext.statemachine.dsl/src-gen/ac/soton/xtext/statemachine/parser/antlr/internal/InternalDsl.g:384:1: (lv_event_4_0= ruleEString )
                    // ../ac.soton.xtext.statemachine.dsl/src-gen/ac/soton/xtext/statemachine/parser/antlr/internal/InternalDsl.g:385:3: lv_event_4_0= ruleEString
                    {
                     
                    	        newCompositeNode(grammarAccess.getTransitionAccess().getEventEStringParserRuleCall_3_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleTransition835);
                    lv_event_4_0=ruleEString();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getTransitionRule());
                    	        }
                           		set(
                           			current, 
                           			"event",
                            		lv_event_4_0, 
                            		"EString");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../ac.soton.xtext.statemachine.dsl/src-gen/ac/soton/xtext/statemachine/parser/antlr/internal/InternalDsl.g:401:4: (otherlv_5= 'source' ( (lv_source_6_0= ruleEString ) ) )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==20) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // ../ac.soton.xtext.statemachine.dsl/src-gen/ac/soton/xtext/statemachine/parser/antlr/internal/InternalDsl.g:401:6: otherlv_5= 'source' ( (lv_source_6_0= ruleEString ) )
                    {
                    otherlv_5=(Token)match(input,20,FollowSets000.FOLLOW_20_in_ruleTransition850); 

                        	newLeafNode(otherlv_5, grammarAccess.getTransitionAccess().getSourceKeyword_4_0());
                        
                    // ../ac.soton.xtext.statemachine.dsl/src-gen/ac/soton/xtext/statemachine/parser/antlr/internal/InternalDsl.g:405:1: ( (lv_source_6_0= ruleEString ) )
                    // ../ac.soton.xtext.statemachine.dsl/src-gen/ac/soton/xtext/statemachine/parser/antlr/internal/InternalDsl.g:406:1: (lv_source_6_0= ruleEString )
                    {
                    // ../ac.soton.xtext.statemachine.dsl/src-gen/ac/soton/xtext/statemachine/parser/antlr/internal/InternalDsl.g:406:1: (lv_source_6_0= ruleEString )
                    // ../ac.soton.xtext.statemachine.dsl/src-gen/ac/soton/xtext/statemachine/parser/antlr/internal/InternalDsl.g:407:3: lv_source_6_0= ruleEString
                    {
                     
                    	        newCompositeNode(grammarAccess.getTransitionAccess().getSourceEStringParserRuleCall_4_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleTransition871);
                    lv_source_6_0=ruleEString();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getTransitionRule());
                    	        }
                           		set(
                           			current, 
                           			"source",
                            		lv_source_6_0, 
                            		"EString");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../ac.soton.xtext.statemachine.dsl/src-gen/ac/soton/xtext/statemachine/parser/antlr/internal/InternalDsl.g:423:4: (otherlv_7= 'target' ( (lv_target_8_0= ruleEString ) ) )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==21) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // ../ac.soton.xtext.statemachine.dsl/src-gen/ac/soton/xtext/statemachine/parser/antlr/internal/InternalDsl.g:423:6: otherlv_7= 'target' ( (lv_target_8_0= ruleEString ) )
                    {
                    otherlv_7=(Token)match(input,21,FollowSets000.FOLLOW_21_in_ruleTransition886); 

                        	newLeafNode(otherlv_7, grammarAccess.getTransitionAccess().getTargetKeyword_5_0());
                        
                    // ../ac.soton.xtext.statemachine.dsl/src-gen/ac/soton/xtext/statemachine/parser/antlr/internal/InternalDsl.g:427:1: ( (lv_target_8_0= ruleEString ) )
                    // ../ac.soton.xtext.statemachine.dsl/src-gen/ac/soton/xtext/statemachine/parser/antlr/internal/InternalDsl.g:428:1: (lv_target_8_0= ruleEString )
                    {
                    // ../ac.soton.xtext.statemachine.dsl/src-gen/ac/soton/xtext/statemachine/parser/antlr/internal/InternalDsl.g:428:1: (lv_target_8_0= ruleEString )
                    // ../ac.soton.xtext.statemachine.dsl/src-gen/ac/soton/xtext/statemachine/parser/antlr/internal/InternalDsl.g:429:3: lv_target_8_0= ruleEString
                    {
                     
                    	        newCompositeNode(grammarAccess.getTransitionAccess().getTargetEStringParserRuleCall_5_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleTransition907);
                    lv_target_8_0=ruleEString();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getTransitionRule());
                    	        }
                           		set(
                           			current, 
                           			"target",
                            		lv_target_8_0, 
                            		"EString");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            otherlv_9=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleTransition921); 

                	newLeafNode(otherlv_9, grammarAccess.getTransitionAccess().getRightCurlyBracketKeyword_6());
                

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


    // $ANTLR start "entryRuleEString"
    // ../ac.soton.xtext.statemachine.dsl/src-gen/ac/soton/xtext/statemachine/parser/antlr/internal/InternalDsl.g:457:1: entryRuleEString returns [String current=null] : iv_ruleEString= ruleEString EOF ;
    public final String entryRuleEString() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEString = null;


        try {
            // ../ac.soton.xtext.statemachine.dsl/src-gen/ac/soton/xtext/statemachine/parser/antlr/internal/InternalDsl.g:458:2: (iv_ruleEString= ruleEString EOF )
            // ../ac.soton.xtext.statemachine.dsl/src-gen/ac/soton/xtext/statemachine/parser/antlr/internal/InternalDsl.g:459:2: iv_ruleEString= ruleEString EOF
            {
             newCompositeNode(grammarAccess.getEStringRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_entryRuleEString958);
            iv_ruleEString=ruleEString();

            state._fsp--;

             current =iv_ruleEString.getText(); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleEString969); 

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
    // ../ac.soton.xtext.statemachine.dsl/src-gen/ac/soton/xtext/statemachine/parser/antlr/internal/InternalDsl.g:466:1: ruleEString returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) ;
    public final AntlrDatatypeRuleToken ruleEString() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;
        Token this_ID_1=null;

         enterRule(); 
            
        try {
            // ../ac.soton.xtext.statemachine.dsl/src-gen/ac/soton/xtext/statemachine/parser/antlr/internal/InternalDsl.g:469:28: ( (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) )
            // ../ac.soton.xtext.statemachine.dsl/src-gen/ac/soton/xtext/statemachine/parser/antlr/internal/InternalDsl.g:470:1: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            {
            // ../ac.soton.xtext.statemachine.dsl/src-gen/ac/soton/xtext/statemachine/parser/antlr/internal/InternalDsl.g:470:1: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==RULE_STRING) ) {
                alt11=1;
            }
            else if ( (LA11_0==RULE_ID) ) {
                alt11=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }
            switch (alt11) {
                case 1 :
                    // ../ac.soton.xtext.statemachine.dsl/src-gen/ac/soton/xtext/statemachine/parser/antlr/internal/InternalDsl.g:470:6: this_STRING_0= RULE_STRING
                    {
                    this_STRING_0=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_RULE_STRING_in_ruleEString1009); 

                    		current.merge(this_STRING_0);
                        
                     
                        newLeafNode(this_STRING_0, grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 
                        

                    }
                    break;
                case 2 :
                    // ../ac.soton.xtext.statemachine.dsl/src-gen/ac/soton/xtext/statemachine/parser/antlr/internal/InternalDsl.g:478:10: this_ID_1= RULE_ID
                    {
                    this_ID_1=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleEString1035); 

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


    // $ANTLR start "entryRuleState"
    // ../ac.soton.xtext.statemachine.dsl/src-gen/ac/soton/xtext/statemachine/parser/antlr/internal/InternalDsl.g:493:1: entryRuleState returns [EObject current=null] : iv_ruleState= ruleState EOF ;
    public final EObject entryRuleState() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleState = null;


        try {
            // ../ac.soton.xtext.statemachine.dsl/src-gen/ac/soton/xtext/statemachine/parser/antlr/internal/InternalDsl.g:494:2: (iv_ruleState= ruleState EOF )
            // ../ac.soton.xtext.statemachine.dsl/src-gen/ac/soton/xtext/statemachine/parser/antlr/internal/InternalDsl.g:495:2: iv_ruleState= ruleState EOF
            {
             newCompositeNode(grammarAccess.getStateRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleState_in_entryRuleState1080);
            iv_ruleState=ruleState();

            state._fsp--;

             current =iv_ruleState; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleState1090); 

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
    // ../ac.soton.xtext.statemachine.dsl/src-gen/ac/soton/xtext/statemachine/parser/antlr/internal/InternalDsl.g:502:1: ruleState returns [EObject current=null] : ( () otherlv_1= 'State' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'nested' ( (lv_nested_5_0= ruleStateMachine ) ) )? otherlv_6= '}' ) ;
    public final EObject ruleState() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        EObject lv_nested_5_0 = null;


         enterRule(); 
            
        try {
            // ../ac.soton.xtext.statemachine.dsl/src-gen/ac/soton/xtext/statemachine/parser/antlr/internal/InternalDsl.g:505:28: ( ( () otherlv_1= 'State' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'nested' ( (lv_nested_5_0= ruleStateMachine ) ) )? otherlv_6= '}' ) )
            // ../ac.soton.xtext.statemachine.dsl/src-gen/ac/soton/xtext/statemachine/parser/antlr/internal/InternalDsl.g:506:1: ( () otherlv_1= 'State' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'nested' ( (lv_nested_5_0= ruleStateMachine ) ) )? otherlv_6= '}' )
            {
            // ../ac.soton.xtext.statemachine.dsl/src-gen/ac/soton/xtext/statemachine/parser/antlr/internal/InternalDsl.g:506:1: ( () otherlv_1= 'State' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'nested' ( (lv_nested_5_0= ruleStateMachine ) ) )? otherlv_6= '}' )
            // ../ac.soton.xtext.statemachine.dsl/src-gen/ac/soton/xtext/statemachine/parser/antlr/internal/InternalDsl.g:506:2: () otherlv_1= 'State' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'nested' ( (lv_nested_5_0= ruleStateMachine ) ) )? otherlv_6= '}'
            {
            // ../ac.soton.xtext.statemachine.dsl/src-gen/ac/soton/xtext/statemachine/parser/antlr/internal/InternalDsl.g:506:2: ()
            // ../ac.soton.xtext.statemachine.dsl/src-gen/ac/soton/xtext/statemachine/parser/antlr/internal/InternalDsl.g:507:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getStateAccess().getStateAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,22,FollowSets000.FOLLOW_22_in_ruleState1136); 

                	newLeafNode(otherlv_1, grammarAccess.getStateAccess().getStateKeyword_1());
                
            // ../ac.soton.xtext.statemachine.dsl/src-gen/ac/soton/xtext/statemachine/parser/antlr/internal/InternalDsl.g:516:1: ( (lv_name_2_0= ruleEString ) )
            // ../ac.soton.xtext.statemachine.dsl/src-gen/ac/soton/xtext/statemachine/parser/antlr/internal/InternalDsl.g:517:1: (lv_name_2_0= ruleEString )
            {
            // ../ac.soton.xtext.statemachine.dsl/src-gen/ac/soton/xtext/statemachine/parser/antlr/internal/InternalDsl.g:517:1: (lv_name_2_0= ruleEString )
            // ../ac.soton.xtext.statemachine.dsl/src-gen/ac/soton/xtext/statemachine/parser/antlr/internal/InternalDsl.g:518:3: lv_name_2_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getStateAccess().getNameEStringParserRuleCall_2_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleState1157);
            lv_name_2_0=ruleEString();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getStateRule());
            	        }
                   		set(
                   			current, 
                   			"name",
                    		lv_name_2_0, 
                    		"EString");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_3=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleState1169); 

                	newLeafNode(otherlv_3, grammarAccess.getStateAccess().getLeftCurlyBracketKeyword_3());
                
            // ../ac.soton.xtext.statemachine.dsl/src-gen/ac/soton/xtext/statemachine/parser/antlr/internal/InternalDsl.g:538:1: (otherlv_4= 'nested' ( (lv_nested_5_0= ruleStateMachine ) ) )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==23) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // ../ac.soton.xtext.statemachine.dsl/src-gen/ac/soton/xtext/statemachine/parser/antlr/internal/InternalDsl.g:538:3: otherlv_4= 'nested' ( (lv_nested_5_0= ruleStateMachine ) )
                    {
                    otherlv_4=(Token)match(input,23,FollowSets000.FOLLOW_23_in_ruleState1182); 

                        	newLeafNode(otherlv_4, grammarAccess.getStateAccess().getNestedKeyword_4_0());
                        
                    // ../ac.soton.xtext.statemachine.dsl/src-gen/ac/soton/xtext/statemachine/parser/antlr/internal/InternalDsl.g:542:1: ( (lv_nested_5_0= ruleStateMachine ) )
                    // ../ac.soton.xtext.statemachine.dsl/src-gen/ac/soton/xtext/statemachine/parser/antlr/internal/InternalDsl.g:543:1: (lv_nested_5_0= ruleStateMachine )
                    {
                    // ../ac.soton.xtext.statemachine.dsl/src-gen/ac/soton/xtext/statemachine/parser/antlr/internal/InternalDsl.g:543:1: (lv_nested_5_0= ruleStateMachine )
                    // ../ac.soton.xtext.statemachine.dsl/src-gen/ac/soton/xtext/statemachine/parser/antlr/internal/InternalDsl.g:544:3: lv_nested_5_0= ruleStateMachine
                    {
                     
                    	        newCompositeNode(grammarAccess.getStateAccess().getNestedStateMachineParserRuleCall_4_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleStateMachine_in_ruleState1203);
                    lv_nested_5_0=ruleStateMachine();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getStateRule());
                    	        }
                           		set(
                           			current, 
                           			"nested",
                            		lv_nested_5_0, 
                            		"StateMachine");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            otherlv_6=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleState1217); 

                	newLeafNode(otherlv_6, grammarAccess.getStateAccess().getRightCurlyBracketKeyword_5());
                

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


    // $ANTLR start "entryRuleInitial"
    // ../ac.soton.xtext.statemachine.dsl/src-gen/ac/soton/xtext/statemachine/parser/antlr/internal/InternalDsl.g:572:1: entryRuleInitial returns [EObject current=null] : iv_ruleInitial= ruleInitial EOF ;
    public final EObject entryRuleInitial() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInitial = null;


        try {
            // ../ac.soton.xtext.statemachine.dsl/src-gen/ac/soton/xtext/statemachine/parser/antlr/internal/InternalDsl.g:573:2: (iv_ruleInitial= ruleInitial EOF )
            // ../ac.soton.xtext.statemachine.dsl/src-gen/ac/soton/xtext/statemachine/parser/antlr/internal/InternalDsl.g:574:2: iv_ruleInitial= ruleInitial EOF
            {
             newCompositeNode(grammarAccess.getInitialRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleInitial_in_entryRuleInitial1253);
            iv_ruleInitial=ruleInitial();

            state._fsp--;

             current =iv_ruleInitial; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleInitial1263); 

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
    // ../ac.soton.xtext.statemachine.dsl/src-gen/ac/soton/xtext/statemachine/parser/antlr/internal/InternalDsl.g:581:1: ruleInitial returns [EObject current=null] : ( () otherlv_1= 'Initial' ( (lv_name_2_0= ruleEString ) ) ) ;
    public final EObject ruleInitial() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;


         enterRule(); 
            
        try {
            // ../ac.soton.xtext.statemachine.dsl/src-gen/ac/soton/xtext/statemachine/parser/antlr/internal/InternalDsl.g:584:28: ( ( () otherlv_1= 'Initial' ( (lv_name_2_0= ruleEString ) ) ) )
            // ../ac.soton.xtext.statemachine.dsl/src-gen/ac/soton/xtext/statemachine/parser/antlr/internal/InternalDsl.g:585:1: ( () otherlv_1= 'Initial' ( (lv_name_2_0= ruleEString ) ) )
            {
            // ../ac.soton.xtext.statemachine.dsl/src-gen/ac/soton/xtext/statemachine/parser/antlr/internal/InternalDsl.g:585:1: ( () otherlv_1= 'Initial' ( (lv_name_2_0= ruleEString ) ) )
            // ../ac.soton.xtext.statemachine.dsl/src-gen/ac/soton/xtext/statemachine/parser/antlr/internal/InternalDsl.g:585:2: () otherlv_1= 'Initial' ( (lv_name_2_0= ruleEString ) )
            {
            // ../ac.soton.xtext.statemachine.dsl/src-gen/ac/soton/xtext/statemachine/parser/antlr/internal/InternalDsl.g:585:2: ()
            // ../ac.soton.xtext.statemachine.dsl/src-gen/ac/soton/xtext/statemachine/parser/antlr/internal/InternalDsl.g:586:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getInitialAccess().getInitialAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,24,FollowSets000.FOLLOW_24_in_ruleInitial1309); 

                	newLeafNode(otherlv_1, grammarAccess.getInitialAccess().getInitialKeyword_1());
                
            // ../ac.soton.xtext.statemachine.dsl/src-gen/ac/soton/xtext/statemachine/parser/antlr/internal/InternalDsl.g:595:1: ( (lv_name_2_0= ruleEString ) )
            // ../ac.soton.xtext.statemachine.dsl/src-gen/ac/soton/xtext/statemachine/parser/antlr/internal/InternalDsl.g:596:1: (lv_name_2_0= ruleEString )
            {
            // ../ac.soton.xtext.statemachine.dsl/src-gen/ac/soton/xtext/statemachine/parser/antlr/internal/InternalDsl.g:596:1: (lv_name_2_0= ruleEString )
            // ../ac.soton.xtext.statemachine.dsl/src-gen/ac/soton/xtext/statemachine/parser/antlr/internal/InternalDsl.g:597:3: lv_name_2_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getInitialAccess().getNameEStringParserRuleCall_2_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleInitial1330);
            lv_name_2_0=ruleEString();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getInitialRule());
            	        }
                   		set(
                   			current, 
                   			"name",
                    		lv_name_2_0, 
                    		"EString");
            	        afterParserOrEnumRuleCall();
            	    

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
    // $ANTLR end "ruleInitial"


    // $ANTLR start "entryRuleJunction"
    // ../ac.soton.xtext.statemachine.dsl/src-gen/ac/soton/xtext/statemachine/parser/antlr/internal/InternalDsl.g:621:1: entryRuleJunction returns [EObject current=null] : iv_ruleJunction= ruleJunction EOF ;
    public final EObject entryRuleJunction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJunction = null;


        try {
            // ../ac.soton.xtext.statemachine.dsl/src-gen/ac/soton/xtext/statemachine/parser/antlr/internal/InternalDsl.g:622:2: (iv_ruleJunction= ruleJunction EOF )
            // ../ac.soton.xtext.statemachine.dsl/src-gen/ac/soton/xtext/statemachine/parser/antlr/internal/InternalDsl.g:623:2: iv_ruleJunction= ruleJunction EOF
            {
             newCompositeNode(grammarAccess.getJunctionRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleJunction_in_entryRuleJunction1366);
            iv_ruleJunction=ruleJunction();

            state._fsp--;

             current =iv_ruleJunction; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleJunction1376); 

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
    // ../ac.soton.xtext.statemachine.dsl/src-gen/ac/soton/xtext/statemachine/parser/antlr/internal/InternalDsl.g:630:1: ruleJunction returns [EObject current=null] : ( () otherlv_1= 'Junction' ( (lv_name_2_0= ruleEString ) ) ) ;
    public final EObject ruleJunction() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;


         enterRule(); 
            
        try {
            // ../ac.soton.xtext.statemachine.dsl/src-gen/ac/soton/xtext/statemachine/parser/antlr/internal/InternalDsl.g:633:28: ( ( () otherlv_1= 'Junction' ( (lv_name_2_0= ruleEString ) ) ) )
            // ../ac.soton.xtext.statemachine.dsl/src-gen/ac/soton/xtext/statemachine/parser/antlr/internal/InternalDsl.g:634:1: ( () otherlv_1= 'Junction' ( (lv_name_2_0= ruleEString ) ) )
            {
            // ../ac.soton.xtext.statemachine.dsl/src-gen/ac/soton/xtext/statemachine/parser/antlr/internal/InternalDsl.g:634:1: ( () otherlv_1= 'Junction' ( (lv_name_2_0= ruleEString ) ) )
            // ../ac.soton.xtext.statemachine.dsl/src-gen/ac/soton/xtext/statemachine/parser/antlr/internal/InternalDsl.g:634:2: () otherlv_1= 'Junction' ( (lv_name_2_0= ruleEString ) )
            {
            // ../ac.soton.xtext.statemachine.dsl/src-gen/ac/soton/xtext/statemachine/parser/antlr/internal/InternalDsl.g:634:2: ()
            // ../ac.soton.xtext.statemachine.dsl/src-gen/ac/soton/xtext/statemachine/parser/antlr/internal/InternalDsl.g:635:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getJunctionAccess().getJunctionAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,25,FollowSets000.FOLLOW_25_in_ruleJunction1422); 

                	newLeafNode(otherlv_1, grammarAccess.getJunctionAccess().getJunctionKeyword_1());
                
            // ../ac.soton.xtext.statemachine.dsl/src-gen/ac/soton/xtext/statemachine/parser/antlr/internal/InternalDsl.g:644:1: ( (lv_name_2_0= ruleEString ) )
            // ../ac.soton.xtext.statemachine.dsl/src-gen/ac/soton/xtext/statemachine/parser/antlr/internal/InternalDsl.g:645:1: (lv_name_2_0= ruleEString )
            {
            // ../ac.soton.xtext.statemachine.dsl/src-gen/ac/soton/xtext/statemachine/parser/antlr/internal/InternalDsl.g:645:1: (lv_name_2_0= ruleEString )
            // ../ac.soton.xtext.statemachine.dsl/src-gen/ac/soton/xtext/statemachine/parser/antlr/internal/InternalDsl.g:646:3: lv_name_2_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getJunctionAccess().getNameEStringParserRuleCall_2_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleJunction1443);
            lv_name_2_0=ruleEString();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getJunctionRule());
            	        }
                   		set(
                   			current, 
                   			"name",
                    		lv_name_2_0, 
                    		"EString");
            	        afterParserOrEnumRuleCall();
            	    

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
    // $ANTLR end "ruleJunction"


    // $ANTLR start "entryRuleFork"
    // ../ac.soton.xtext.statemachine.dsl/src-gen/ac/soton/xtext/statemachine/parser/antlr/internal/InternalDsl.g:670:1: entryRuleFork returns [EObject current=null] : iv_ruleFork= ruleFork EOF ;
    public final EObject entryRuleFork() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFork = null;


        try {
            // ../ac.soton.xtext.statemachine.dsl/src-gen/ac/soton/xtext/statemachine/parser/antlr/internal/InternalDsl.g:671:2: (iv_ruleFork= ruleFork EOF )
            // ../ac.soton.xtext.statemachine.dsl/src-gen/ac/soton/xtext/statemachine/parser/antlr/internal/InternalDsl.g:672:2: iv_ruleFork= ruleFork EOF
            {
             newCompositeNode(grammarAccess.getForkRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleFork_in_entryRuleFork1479);
            iv_ruleFork=ruleFork();

            state._fsp--;

             current =iv_ruleFork; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleFork1489); 

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
    // ../ac.soton.xtext.statemachine.dsl/src-gen/ac/soton/xtext/statemachine/parser/antlr/internal/InternalDsl.g:679:1: ruleFork returns [EObject current=null] : ( () otherlv_1= 'Fork' ( (lv_name_2_0= ruleEString ) ) ) ;
    public final EObject ruleFork() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;


         enterRule(); 
            
        try {
            // ../ac.soton.xtext.statemachine.dsl/src-gen/ac/soton/xtext/statemachine/parser/antlr/internal/InternalDsl.g:682:28: ( ( () otherlv_1= 'Fork' ( (lv_name_2_0= ruleEString ) ) ) )
            // ../ac.soton.xtext.statemachine.dsl/src-gen/ac/soton/xtext/statemachine/parser/antlr/internal/InternalDsl.g:683:1: ( () otherlv_1= 'Fork' ( (lv_name_2_0= ruleEString ) ) )
            {
            // ../ac.soton.xtext.statemachine.dsl/src-gen/ac/soton/xtext/statemachine/parser/antlr/internal/InternalDsl.g:683:1: ( () otherlv_1= 'Fork' ( (lv_name_2_0= ruleEString ) ) )
            // ../ac.soton.xtext.statemachine.dsl/src-gen/ac/soton/xtext/statemachine/parser/antlr/internal/InternalDsl.g:683:2: () otherlv_1= 'Fork' ( (lv_name_2_0= ruleEString ) )
            {
            // ../ac.soton.xtext.statemachine.dsl/src-gen/ac/soton/xtext/statemachine/parser/antlr/internal/InternalDsl.g:683:2: ()
            // ../ac.soton.xtext.statemachine.dsl/src-gen/ac/soton/xtext/statemachine/parser/antlr/internal/InternalDsl.g:684:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getForkAccess().getForkAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,26,FollowSets000.FOLLOW_26_in_ruleFork1535); 

                	newLeafNode(otherlv_1, grammarAccess.getForkAccess().getForkKeyword_1());
                
            // ../ac.soton.xtext.statemachine.dsl/src-gen/ac/soton/xtext/statemachine/parser/antlr/internal/InternalDsl.g:693:1: ( (lv_name_2_0= ruleEString ) )
            // ../ac.soton.xtext.statemachine.dsl/src-gen/ac/soton/xtext/statemachine/parser/antlr/internal/InternalDsl.g:694:1: (lv_name_2_0= ruleEString )
            {
            // ../ac.soton.xtext.statemachine.dsl/src-gen/ac/soton/xtext/statemachine/parser/antlr/internal/InternalDsl.g:694:1: (lv_name_2_0= ruleEString )
            // ../ac.soton.xtext.statemachine.dsl/src-gen/ac/soton/xtext/statemachine/parser/antlr/internal/InternalDsl.g:695:3: lv_name_2_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getForkAccess().getNameEStringParserRuleCall_2_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleFork1556);
            lv_name_2_0=ruleEString();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getForkRule());
            	        }
                   		set(
                   			current, 
                   			"name",
                    		lv_name_2_0, 
                    		"EString");
            	        afterParserOrEnumRuleCall();
            	    

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
    // $ANTLR end "ruleFork"


    // $ANTLR start "entryRuleJoin"
    // ../ac.soton.xtext.statemachine.dsl/src-gen/ac/soton/xtext/statemachine/parser/antlr/internal/InternalDsl.g:719:1: entryRuleJoin returns [EObject current=null] : iv_ruleJoin= ruleJoin EOF ;
    public final EObject entryRuleJoin() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJoin = null;


        try {
            // ../ac.soton.xtext.statemachine.dsl/src-gen/ac/soton/xtext/statemachine/parser/antlr/internal/InternalDsl.g:720:2: (iv_ruleJoin= ruleJoin EOF )
            // ../ac.soton.xtext.statemachine.dsl/src-gen/ac/soton/xtext/statemachine/parser/antlr/internal/InternalDsl.g:721:2: iv_ruleJoin= ruleJoin EOF
            {
             newCompositeNode(grammarAccess.getJoinRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleJoin_in_entryRuleJoin1592);
            iv_ruleJoin=ruleJoin();

            state._fsp--;

             current =iv_ruleJoin; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleJoin1602); 

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
    // $ANTLR end "entryRuleJoin"


    // $ANTLR start "ruleJoin"
    // ../ac.soton.xtext.statemachine.dsl/src-gen/ac/soton/xtext/statemachine/parser/antlr/internal/InternalDsl.g:728:1: ruleJoin returns [EObject current=null] : ( () otherlv_1= 'Join' ( (lv_name_2_0= ruleEString ) ) ) ;
    public final EObject ruleJoin() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;


         enterRule(); 
            
        try {
            // ../ac.soton.xtext.statemachine.dsl/src-gen/ac/soton/xtext/statemachine/parser/antlr/internal/InternalDsl.g:731:28: ( ( () otherlv_1= 'Join' ( (lv_name_2_0= ruleEString ) ) ) )
            // ../ac.soton.xtext.statemachine.dsl/src-gen/ac/soton/xtext/statemachine/parser/antlr/internal/InternalDsl.g:732:1: ( () otherlv_1= 'Join' ( (lv_name_2_0= ruleEString ) ) )
            {
            // ../ac.soton.xtext.statemachine.dsl/src-gen/ac/soton/xtext/statemachine/parser/antlr/internal/InternalDsl.g:732:1: ( () otherlv_1= 'Join' ( (lv_name_2_0= ruleEString ) ) )
            // ../ac.soton.xtext.statemachine.dsl/src-gen/ac/soton/xtext/statemachine/parser/antlr/internal/InternalDsl.g:732:2: () otherlv_1= 'Join' ( (lv_name_2_0= ruleEString ) )
            {
            // ../ac.soton.xtext.statemachine.dsl/src-gen/ac/soton/xtext/statemachine/parser/antlr/internal/InternalDsl.g:732:2: ()
            // ../ac.soton.xtext.statemachine.dsl/src-gen/ac/soton/xtext/statemachine/parser/antlr/internal/InternalDsl.g:733:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getJoinAccess().getJoinAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,27,FollowSets000.FOLLOW_27_in_ruleJoin1648); 

                	newLeafNode(otherlv_1, grammarAccess.getJoinAccess().getJoinKeyword_1());
                
            // ../ac.soton.xtext.statemachine.dsl/src-gen/ac/soton/xtext/statemachine/parser/antlr/internal/InternalDsl.g:742:1: ( (lv_name_2_0= ruleEString ) )
            // ../ac.soton.xtext.statemachine.dsl/src-gen/ac/soton/xtext/statemachine/parser/antlr/internal/InternalDsl.g:743:1: (lv_name_2_0= ruleEString )
            {
            // ../ac.soton.xtext.statemachine.dsl/src-gen/ac/soton/xtext/statemachine/parser/antlr/internal/InternalDsl.g:743:1: (lv_name_2_0= ruleEString )
            // ../ac.soton.xtext.statemachine.dsl/src-gen/ac/soton/xtext/statemachine/parser/antlr/internal/InternalDsl.g:744:3: lv_name_2_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getJoinAccess().getNameEStringParserRuleCall_2_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleJoin1669);
            lv_name_2_0=ruleEString();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getJoinRule());
            	        }
                   		set(
                   			current, 
                   			"name",
                    		lv_name_2_0, 
                    		"EString");
            	        afterParserOrEnumRuleCall();
            	    

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
    // $ANTLR end "ruleJoin"


    // $ANTLR start "entryRuleAny"
    // ../ac.soton.xtext.statemachine.dsl/src-gen/ac/soton/xtext/statemachine/parser/antlr/internal/InternalDsl.g:768:1: entryRuleAny returns [EObject current=null] : iv_ruleAny= ruleAny EOF ;
    public final EObject entryRuleAny() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAny = null;


        try {
            // ../ac.soton.xtext.statemachine.dsl/src-gen/ac/soton/xtext/statemachine/parser/antlr/internal/InternalDsl.g:769:2: (iv_ruleAny= ruleAny EOF )
            // ../ac.soton.xtext.statemachine.dsl/src-gen/ac/soton/xtext/statemachine/parser/antlr/internal/InternalDsl.g:770:2: iv_ruleAny= ruleAny EOF
            {
             newCompositeNode(grammarAccess.getAnyRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleAny_in_entryRuleAny1705);
            iv_ruleAny=ruleAny();

            state._fsp--;

             current =iv_ruleAny; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleAny1715); 

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
    // ../ac.soton.xtext.statemachine.dsl/src-gen/ac/soton/xtext/statemachine/parser/antlr/internal/InternalDsl.g:777:1: ruleAny returns [EObject current=null] : ( () otherlv_1= 'Any' ( (lv_name_2_0= ruleEString ) ) ) ;
    public final EObject ruleAny() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;


         enterRule(); 
            
        try {
            // ../ac.soton.xtext.statemachine.dsl/src-gen/ac/soton/xtext/statemachine/parser/antlr/internal/InternalDsl.g:780:28: ( ( () otherlv_1= 'Any' ( (lv_name_2_0= ruleEString ) ) ) )
            // ../ac.soton.xtext.statemachine.dsl/src-gen/ac/soton/xtext/statemachine/parser/antlr/internal/InternalDsl.g:781:1: ( () otherlv_1= 'Any' ( (lv_name_2_0= ruleEString ) ) )
            {
            // ../ac.soton.xtext.statemachine.dsl/src-gen/ac/soton/xtext/statemachine/parser/antlr/internal/InternalDsl.g:781:1: ( () otherlv_1= 'Any' ( (lv_name_2_0= ruleEString ) ) )
            // ../ac.soton.xtext.statemachine.dsl/src-gen/ac/soton/xtext/statemachine/parser/antlr/internal/InternalDsl.g:781:2: () otherlv_1= 'Any' ( (lv_name_2_0= ruleEString ) )
            {
            // ../ac.soton.xtext.statemachine.dsl/src-gen/ac/soton/xtext/statemachine/parser/antlr/internal/InternalDsl.g:781:2: ()
            // ../ac.soton.xtext.statemachine.dsl/src-gen/ac/soton/xtext/statemachine/parser/antlr/internal/InternalDsl.g:782:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getAnyAccess().getAnyAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,28,FollowSets000.FOLLOW_28_in_ruleAny1761); 

                	newLeafNode(otherlv_1, grammarAccess.getAnyAccess().getAnyKeyword_1());
                
            // ../ac.soton.xtext.statemachine.dsl/src-gen/ac/soton/xtext/statemachine/parser/antlr/internal/InternalDsl.g:791:1: ( (lv_name_2_0= ruleEString ) )
            // ../ac.soton.xtext.statemachine.dsl/src-gen/ac/soton/xtext/statemachine/parser/antlr/internal/InternalDsl.g:792:1: (lv_name_2_0= ruleEString )
            {
            // ../ac.soton.xtext.statemachine.dsl/src-gen/ac/soton/xtext/statemachine/parser/antlr/internal/InternalDsl.g:792:1: (lv_name_2_0= ruleEString )
            // ../ac.soton.xtext.statemachine.dsl/src-gen/ac/soton/xtext/statemachine/parser/antlr/internal/InternalDsl.g:793:3: lv_name_2_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getAnyAccess().getNameEStringParserRuleCall_2_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleAny1782);
            lv_name_2_0=ruleEString();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getAnyRule());
            	        }
                   		set(
                   			current, 
                   			"name",
                    		lv_name_2_0, 
                    		"EString");
            	        afterParserOrEnumRuleCall();
            	    

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
    // $ANTLR end "ruleAny"


    // $ANTLR start "entryRuleFinal"
    // ../ac.soton.xtext.statemachine.dsl/src-gen/ac/soton/xtext/statemachine/parser/antlr/internal/InternalDsl.g:817:1: entryRuleFinal returns [EObject current=null] : iv_ruleFinal= ruleFinal EOF ;
    public final EObject entryRuleFinal() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFinal = null;


        try {
            // ../ac.soton.xtext.statemachine.dsl/src-gen/ac/soton/xtext/statemachine/parser/antlr/internal/InternalDsl.g:818:2: (iv_ruleFinal= ruleFinal EOF )
            // ../ac.soton.xtext.statemachine.dsl/src-gen/ac/soton/xtext/statemachine/parser/antlr/internal/InternalDsl.g:819:2: iv_ruleFinal= ruleFinal EOF
            {
             newCompositeNode(grammarAccess.getFinalRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleFinal_in_entryRuleFinal1818);
            iv_ruleFinal=ruleFinal();

            state._fsp--;

             current =iv_ruleFinal; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleFinal1828); 

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
    // ../ac.soton.xtext.statemachine.dsl/src-gen/ac/soton/xtext/statemachine/parser/antlr/internal/InternalDsl.g:826:1: ruleFinal returns [EObject current=null] : ( () otherlv_1= 'Final' ( (lv_name_2_0= ruleEString ) ) ) ;
    public final EObject ruleFinal() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;


         enterRule(); 
            
        try {
            // ../ac.soton.xtext.statemachine.dsl/src-gen/ac/soton/xtext/statemachine/parser/antlr/internal/InternalDsl.g:829:28: ( ( () otherlv_1= 'Final' ( (lv_name_2_0= ruleEString ) ) ) )
            // ../ac.soton.xtext.statemachine.dsl/src-gen/ac/soton/xtext/statemachine/parser/antlr/internal/InternalDsl.g:830:1: ( () otherlv_1= 'Final' ( (lv_name_2_0= ruleEString ) ) )
            {
            // ../ac.soton.xtext.statemachine.dsl/src-gen/ac/soton/xtext/statemachine/parser/antlr/internal/InternalDsl.g:830:1: ( () otherlv_1= 'Final' ( (lv_name_2_0= ruleEString ) ) )
            // ../ac.soton.xtext.statemachine.dsl/src-gen/ac/soton/xtext/statemachine/parser/antlr/internal/InternalDsl.g:830:2: () otherlv_1= 'Final' ( (lv_name_2_0= ruleEString ) )
            {
            // ../ac.soton.xtext.statemachine.dsl/src-gen/ac/soton/xtext/statemachine/parser/antlr/internal/InternalDsl.g:830:2: ()
            // ../ac.soton.xtext.statemachine.dsl/src-gen/ac/soton/xtext/statemachine/parser/antlr/internal/InternalDsl.g:831:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getFinalAccess().getFinalAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,29,FollowSets000.FOLLOW_29_in_ruleFinal1874); 

                	newLeafNode(otherlv_1, grammarAccess.getFinalAccess().getFinalKeyword_1());
                
            // ../ac.soton.xtext.statemachine.dsl/src-gen/ac/soton/xtext/statemachine/parser/antlr/internal/InternalDsl.g:840:1: ( (lv_name_2_0= ruleEString ) )
            // ../ac.soton.xtext.statemachine.dsl/src-gen/ac/soton/xtext/statemachine/parser/antlr/internal/InternalDsl.g:841:1: (lv_name_2_0= ruleEString )
            {
            // ../ac.soton.xtext.statemachine.dsl/src-gen/ac/soton/xtext/statemachine/parser/antlr/internal/InternalDsl.g:841:1: (lv_name_2_0= ruleEString )
            // ../ac.soton.xtext.statemachine.dsl/src-gen/ac/soton/xtext/statemachine/parser/antlr/internal/InternalDsl.g:842:3: lv_name_2_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getFinalAccess().getNameEStringParserRuleCall_2_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleFinal1895);
            lv_name_2_0=ruleEString();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getFinalRule());
            	        }
                   		set(
                   			current, 
                   			"name",
                    		lv_name_2_0, 
                    		"EString");
            	        afterParserOrEnumRuleCall();
            	    

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
    // $ANTLR end "ruleFinal"

    // Delegated rules


 

    
    private static class FollowSets000 {
        public static final BitSet FOLLOW_ruleStateMachine_in_entryRuleStateMachine75 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleStateMachine85 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_11_in_ruleStateMachine131 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleStateMachine143 = new BitSet(new long[]{0x000000000003A000L});
        public static final BitSet FOLLOW_13_in_ruleStateMachine156 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleStateMachine168 = new BitSet(new long[]{0x000000003F400000L});
        public static final BitSet FOLLOW_ruleAbstractNode_in_ruleStateMachine189 = new BitSet(new long[]{0x000000000000C000L});
        public static final BitSet FOLLOW_14_in_ruleStateMachine202 = new BitSet(new long[]{0x000000003F400000L});
        public static final BitSet FOLLOW_ruleAbstractNode_in_ruleStateMachine223 = new BitSet(new long[]{0x000000000000C000L});
        public static final BitSet FOLLOW_15_in_ruleStateMachine237 = new BitSet(new long[]{0x0000000000038000L});
        public static final BitSet FOLLOW_16_in_ruleStateMachine252 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleStateMachine264 = new BitSet(new long[]{0x0000000000040000L});
        public static final BitSet FOLLOW_ruleTransition_in_ruleStateMachine285 = new BitSet(new long[]{0x000000000000C000L});
        public static final BitSet FOLLOW_14_in_ruleStateMachine298 = new BitSet(new long[]{0x0000000000040000L});
        public static final BitSet FOLLOW_ruleTransition_in_ruleStateMachine319 = new BitSet(new long[]{0x000000000000C000L});
        public static final BitSet FOLLOW_15_in_ruleStateMachine333 = new BitSet(new long[]{0x0000000000028000L});
        public static final BitSet FOLLOW_17_in_ruleStateMachine348 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleStateMachine360 = new BitSet(new long[]{0x0000000000000800L});
        public static final BitSet FOLLOW_ruleStateMachine_in_ruleStateMachine381 = new BitSet(new long[]{0x000000000000C000L});
        public static final BitSet FOLLOW_14_in_ruleStateMachine394 = new BitSet(new long[]{0x0000000000000800L});
        public static final BitSet FOLLOW_ruleStateMachine_in_ruleStateMachine415 = new BitSet(new long[]{0x000000000000C000L});
        public static final BitSet FOLLOW_15_in_ruleStateMachine429 = new BitSet(new long[]{0x0000000000008000L});
        public static final BitSet FOLLOW_15_in_ruleStateMachine443 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAbstractNode_in_entryRuleAbstractNode479 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleAbstractNode489 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleState_in_ruleAbstractNode536 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleInitial_in_ruleAbstractNode563 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleJunction_in_ruleAbstractNode590 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleFork_in_ruleAbstractNode617 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleJoin_in_ruleAbstractNode644 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAny_in_ruleAbstractNode671 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleFinal_in_ruleAbstractNode698 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleTransition_in_entryRuleTransition733 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleTransition743 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_18_in_ruleTransition789 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleTransition801 = new BitSet(new long[]{0x0000000000388000L});
        public static final BitSet FOLLOW_19_in_ruleTransition814 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleTransition835 = new BitSet(new long[]{0x0000000000308000L});
        public static final BitSet FOLLOW_20_in_ruleTransition850 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleTransition871 = new BitSet(new long[]{0x0000000000208000L});
        public static final BitSet FOLLOW_21_in_ruleTransition886 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleTransition907 = new BitSet(new long[]{0x0000000000008000L});
        public static final BitSet FOLLOW_15_in_ruleTransition921 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_entryRuleEString958 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleEString969 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_STRING_in_ruleEString1009 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleEString1035 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleState_in_entryRuleState1080 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleState1090 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_22_in_ruleState1136 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleState1157 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleState1169 = new BitSet(new long[]{0x0000000000808000L});
        public static final BitSet FOLLOW_23_in_ruleState1182 = new BitSet(new long[]{0x0000000000000800L});
        public static final BitSet FOLLOW_ruleStateMachine_in_ruleState1203 = new BitSet(new long[]{0x0000000000008000L});
        public static final BitSet FOLLOW_15_in_ruleState1217 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleInitial_in_entryRuleInitial1253 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleInitial1263 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_24_in_ruleInitial1309 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleInitial1330 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleJunction_in_entryRuleJunction1366 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleJunction1376 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_25_in_ruleJunction1422 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleJunction1443 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleFork_in_entryRuleFork1479 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleFork1489 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_26_in_ruleFork1535 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleFork1556 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleJoin_in_entryRuleJoin1592 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleJoin1602 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_27_in_ruleJoin1648 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleJoin1669 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAny_in_entryRuleAny1705 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleAny1715 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_28_in_ruleAny1761 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleAny1782 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleFinal_in_entryRuleFinal1818 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleFinal1828 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_29_in_ruleFinal1874 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleFinal1895 = new BitSet(new long[]{0x0000000000000002L});
    }


}