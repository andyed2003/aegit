package ac.soton.xtext.machine.dsl.parser.antlr.internal; 

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
import ac.soton.xtext.machine.dsl.services.MachineDslGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalMachineDslParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'localGenerated'", "'Machine'", "'internalId'", "'Comment'", "'Refines'", "'('", "','", "')'", "'Sees'", "'annotations'", "'{'", "'}'", "'extensions'", "'attributes'", "'Variables'", "'Invariants'", "'&'", "'Variant'", "'Events'", "'Annotation'", "'source'", "'references'", "'details'", "'contents'", "'StringToAttributeMapEntry'", "'key'", "'value'", "'Variable'", "'comment'", "'Invariant'", "'theorem'", "'notTheorem'", "'Predicate'", "'Expression'", "'Event'", "'extended'", "'Convergence'", "'Parameters'", "'Guards'", "'Witnesses'", "'Actions'", "' || '", "'StringToStringMapEntry'", "'EObject'", "'Extension'", "'extensionId'", "'Attribute'", "'type'", "'EJavaObject'", "'CarrierSet'", "'Constant'", "'Axiom'", "'Parameter'", "'Guard'", "'Witness'", "'predicate'", "'Action'", "'Boolean'", "'Handle'", "'Integer'", "'Long'", "'String'", "'ordinary'", "'convergent'", "'anticipated'"
    };
    public static final int T__68=68;
    public static final int T__69=69;
    public static final int RULE_ID=5;
    public static final int T__66=66;
    public static final int T__67=67;
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
    public static final int T__71=71;
    public static final int T__33=33;
    public static final int T__72=72;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__70=70;
    public static final int T__36=36;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int RULE_WS=9;
    public static final int T__75=75;
    public static final int T__74=74;
    public static final int T__73=73;

    // delegates
    // delegators


        public InternalMachineDslParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalMachineDslParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalMachineDslParser.tokenNames; }
    public String getGrammarFileName() { return "../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g"; }



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
    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:68:1: entryRuleMachine returns [EObject current=null] : iv_ruleMachine= ruleMachine EOF ;
    public final EObject entryRuleMachine() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMachine = null;


        try {
            // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:69:2: (iv_ruleMachine= ruleMachine EOF )
            // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:70:2: iv_ruleMachine= ruleMachine EOF
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
    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:77:1: ruleMachine returns [EObject current=null] : ( () ( (lv_localGenerated_1_0= 'localGenerated' ) )? otherlv_2= 'Machine' ( (lv_name_3_0= ruleEString ) ) (otherlv_4= 'internalId' ( (lv_internalId_5_0= ruleEString ) ) )? (otherlv_6= 'Comment' ( (lv_comment_7_0= ruleEString ) ) )? (otherlv_8= 'Refines' otherlv_9= '(' ( ( ruleEString ) ) (otherlv_11= ',' ( ( ruleEString ) ) )* otherlv_13= ')' )? (otherlv_14= 'Sees' otherlv_15= '(' ( ( ruleEString ) ) (otherlv_17= ',' ( ( ruleEString ) ) )* otherlv_19= ')' )? (otherlv_20= 'annotations' otherlv_21= '{' ( (lv_annotations_22_0= ruleAnnotation ) ) (otherlv_23= ',' ( (lv_annotations_24_0= ruleAnnotation ) ) )* otherlv_25= '}' )? (otherlv_26= 'extensions' otherlv_27= '{' ( (lv_extensions_28_0= ruleAbstractExtension ) ) (otherlv_29= ',' ( (lv_extensions_30_0= ruleAbstractExtension ) ) )* otherlv_31= '}' )? (otherlv_32= 'attributes' otherlv_33= '{' ( (lv_attributes_34_0= ruleStringToAttributeMapEntry ) ) (otherlv_35= ',' ( (lv_attributes_36_0= ruleStringToAttributeMapEntry ) ) )* otherlv_37= '}' )? (otherlv_38= 'Variables' ( (lv_variables_39_0= ruleVariable ) ) (otherlv_40= ',' ( (lv_variables_41_0= ruleVariable ) ) )* )? (otherlv_42= 'Invariants' ( (lv_invariants_43_0= ruleInvariant ) ) (otherlv_44= '&' ( (lv_invariants_45_0= ruleInvariant ) ) )* )? (otherlv_46= 'Variant' ( (lv_variant_47_0= ruleVariant ) ) )? (otherlv_48= 'Events' ( (lv_events_49_0= ruleEvent ) ) ( (lv_events_50_0= ruleEvent ) )* )? ) ;
    public final EObject ruleMachine() throws RecognitionException {
        EObject current = null;

        Token lv_localGenerated_1_0=null;
        Token otherlv_2=null;
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
        Token otherlv_21=null;
        Token otherlv_23=null;
        Token otherlv_25=null;
        Token otherlv_26=null;
        Token otherlv_27=null;
        Token otherlv_29=null;
        Token otherlv_31=null;
        Token otherlv_32=null;
        Token otherlv_33=null;
        Token otherlv_35=null;
        Token otherlv_37=null;
        Token otherlv_38=null;
        Token otherlv_40=null;
        Token otherlv_42=null;
        Token otherlv_44=null;
        Token otherlv_46=null;
        Token otherlv_48=null;
        AntlrDatatypeRuleToken lv_name_3_0 = null;

        AntlrDatatypeRuleToken lv_internalId_5_0 = null;

        AntlrDatatypeRuleToken lv_comment_7_0 = null;

        EObject lv_annotations_22_0 = null;

        EObject lv_annotations_24_0 = null;

        EObject lv_extensions_28_0 = null;

        EObject lv_extensions_30_0 = null;

        EObject lv_attributes_34_0 = null;

        EObject lv_attributes_36_0 = null;

        EObject lv_variables_39_0 = null;

        EObject lv_variables_41_0 = null;

        EObject lv_invariants_43_0 = null;

        EObject lv_invariants_45_0 = null;

        EObject lv_variant_47_0 = null;

        EObject lv_events_49_0 = null;

        EObject lv_events_50_0 = null;


         enterRule(); 
            
        try {
            // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:80:28: ( ( () ( (lv_localGenerated_1_0= 'localGenerated' ) )? otherlv_2= 'Machine' ( (lv_name_3_0= ruleEString ) ) (otherlv_4= 'internalId' ( (lv_internalId_5_0= ruleEString ) ) )? (otherlv_6= 'Comment' ( (lv_comment_7_0= ruleEString ) ) )? (otherlv_8= 'Refines' otherlv_9= '(' ( ( ruleEString ) ) (otherlv_11= ',' ( ( ruleEString ) ) )* otherlv_13= ')' )? (otherlv_14= 'Sees' otherlv_15= '(' ( ( ruleEString ) ) (otherlv_17= ',' ( ( ruleEString ) ) )* otherlv_19= ')' )? (otherlv_20= 'annotations' otherlv_21= '{' ( (lv_annotations_22_0= ruleAnnotation ) ) (otherlv_23= ',' ( (lv_annotations_24_0= ruleAnnotation ) ) )* otherlv_25= '}' )? (otherlv_26= 'extensions' otherlv_27= '{' ( (lv_extensions_28_0= ruleAbstractExtension ) ) (otherlv_29= ',' ( (lv_extensions_30_0= ruleAbstractExtension ) ) )* otherlv_31= '}' )? (otherlv_32= 'attributes' otherlv_33= '{' ( (lv_attributes_34_0= ruleStringToAttributeMapEntry ) ) (otherlv_35= ',' ( (lv_attributes_36_0= ruleStringToAttributeMapEntry ) ) )* otherlv_37= '}' )? (otherlv_38= 'Variables' ( (lv_variables_39_0= ruleVariable ) ) (otherlv_40= ',' ( (lv_variables_41_0= ruleVariable ) ) )* )? (otherlv_42= 'Invariants' ( (lv_invariants_43_0= ruleInvariant ) ) (otherlv_44= '&' ( (lv_invariants_45_0= ruleInvariant ) ) )* )? (otherlv_46= 'Variant' ( (lv_variant_47_0= ruleVariant ) ) )? (otherlv_48= 'Events' ( (lv_events_49_0= ruleEvent ) ) ( (lv_events_50_0= ruleEvent ) )* )? ) )
            // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:81:1: ( () ( (lv_localGenerated_1_0= 'localGenerated' ) )? otherlv_2= 'Machine' ( (lv_name_3_0= ruleEString ) ) (otherlv_4= 'internalId' ( (lv_internalId_5_0= ruleEString ) ) )? (otherlv_6= 'Comment' ( (lv_comment_7_0= ruleEString ) ) )? (otherlv_8= 'Refines' otherlv_9= '(' ( ( ruleEString ) ) (otherlv_11= ',' ( ( ruleEString ) ) )* otherlv_13= ')' )? (otherlv_14= 'Sees' otherlv_15= '(' ( ( ruleEString ) ) (otherlv_17= ',' ( ( ruleEString ) ) )* otherlv_19= ')' )? (otherlv_20= 'annotations' otherlv_21= '{' ( (lv_annotations_22_0= ruleAnnotation ) ) (otherlv_23= ',' ( (lv_annotations_24_0= ruleAnnotation ) ) )* otherlv_25= '}' )? (otherlv_26= 'extensions' otherlv_27= '{' ( (lv_extensions_28_0= ruleAbstractExtension ) ) (otherlv_29= ',' ( (lv_extensions_30_0= ruleAbstractExtension ) ) )* otherlv_31= '}' )? (otherlv_32= 'attributes' otherlv_33= '{' ( (lv_attributes_34_0= ruleStringToAttributeMapEntry ) ) (otherlv_35= ',' ( (lv_attributes_36_0= ruleStringToAttributeMapEntry ) ) )* otherlv_37= '}' )? (otherlv_38= 'Variables' ( (lv_variables_39_0= ruleVariable ) ) (otherlv_40= ',' ( (lv_variables_41_0= ruleVariable ) ) )* )? (otherlv_42= 'Invariants' ( (lv_invariants_43_0= ruleInvariant ) ) (otherlv_44= '&' ( (lv_invariants_45_0= ruleInvariant ) ) )* )? (otherlv_46= 'Variant' ( (lv_variant_47_0= ruleVariant ) ) )? (otherlv_48= 'Events' ( (lv_events_49_0= ruleEvent ) ) ( (lv_events_50_0= ruleEvent ) )* )? )
            {
            // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:81:1: ( () ( (lv_localGenerated_1_0= 'localGenerated' ) )? otherlv_2= 'Machine' ( (lv_name_3_0= ruleEString ) ) (otherlv_4= 'internalId' ( (lv_internalId_5_0= ruleEString ) ) )? (otherlv_6= 'Comment' ( (lv_comment_7_0= ruleEString ) ) )? (otherlv_8= 'Refines' otherlv_9= '(' ( ( ruleEString ) ) (otherlv_11= ',' ( ( ruleEString ) ) )* otherlv_13= ')' )? (otherlv_14= 'Sees' otherlv_15= '(' ( ( ruleEString ) ) (otherlv_17= ',' ( ( ruleEString ) ) )* otherlv_19= ')' )? (otherlv_20= 'annotations' otherlv_21= '{' ( (lv_annotations_22_0= ruleAnnotation ) ) (otherlv_23= ',' ( (lv_annotations_24_0= ruleAnnotation ) ) )* otherlv_25= '}' )? (otherlv_26= 'extensions' otherlv_27= '{' ( (lv_extensions_28_0= ruleAbstractExtension ) ) (otherlv_29= ',' ( (lv_extensions_30_0= ruleAbstractExtension ) ) )* otherlv_31= '}' )? (otherlv_32= 'attributes' otherlv_33= '{' ( (lv_attributes_34_0= ruleStringToAttributeMapEntry ) ) (otherlv_35= ',' ( (lv_attributes_36_0= ruleStringToAttributeMapEntry ) ) )* otherlv_37= '}' )? (otherlv_38= 'Variables' ( (lv_variables_39_0= ruleVariable ) ) (otherlv_40= ',' ( (lv_variables_41_0= ruleVariable ) ) )* )? (otherlv_42= 'Invariants' ( (lv_invariants_43_0= ruleInvariant ) ) (otherlv_44= '&' ( (lv_invariants_45_0= ruleInvariant ) ) )* )? (otherlv_46= 'Variant' ( (lv_variant_47_0= ruleVariant ) ) )? (otherlv_48= 'Events' ( (lv_events_49_0= ruleEvent ) ) ( (lv_events_50_0= ruleEvent ) )* )? )
            // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:81:2: () ( (lv_localGenerated_1_0= 'localGenerated' ) )? otherlv_2= 'Machine' ( (lv_name_3_0= ruleEString ) ) (otherlv_4= 'internalId' ( (lv_internalId_5_0= ruleEString ) ) )? (otherlv_6= 'Comment' ( (lv_comment_7_0= ruleEString ) ) )? (otherlv_8= 'Refines' otherlv_9= '(' ( ( ruleEString ) ) (otherlv_11= ',' ( ( ruleEString ) ) )* otherlv_13= ')' )? (otherlv_14= 'Sees' otherlv_15= '(' ( ( ruleEString ) ) (otherlv_17= ',' ( ( ruleEString ) ) )* otherlv_19= ')' )? (otherlv_20= 'annotations' otherlv_21= '{' ( (lv_annotations_22_0= ruleAnnotation ) ) (otherlv_23= ',' ( (lv_annotations_24_0= ruleAnnotation ) ) )* otherlv_25= '}' )? (otherlv_26= 'extensions' otherlv_27= '{' ( (lv_extensions_28_0= ruleAbstractExtension ) ) (otherlv_29= ',' ( (lv_extensions_30_0= ruleAbstractExtension ) ) )* otherlv_31= '}' )? (otherlv_32= 'attributes' otherlv_33= '{' ( (lv_attributes_34_0= ruleStringToAttributeMapEntry ) ) (otherlv_35= ',' ( (lv_attributes_36_0= ruleStringToAttributeMapEntry ) ) )* otherlv_37= '}' )? (otherlv_38= 'Variables' ( (lv_variables_39_0= ruleVariable ) ) (otherlv_40= ',' ( (lv_variables_41_0= ruleVariable ) ) )* )? (otherlv_42= 'Invariants' ( (lv_invariants_43_0= ruleInvariant ) ) (otherlv_44= '&' ( (lv_invariants_45_0= ruleInvariant ) ) )* )? (otherlv_46= 'Variant' ( (lv_variant_47_0= ruleVariant ) ) )? (otherlv_48= 'Events' ( (lv_events_49_0= ruleEvent ) ) ( (lv_events_50_0= ruleEvent ) )* )?
            {
            // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:81:2: ()
            // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:82:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getMachineAccess().getMachineAction_0(),
                        current);
                

            }

            // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:87:2: ( (lv_localGenerated_1_0= 'localGenerated' ) )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==11) ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:88:1: (lv_localGenerated_1_0= 'localGenerated' )
                    {
                    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:88:1: (lv_localGenerated_1_0= 'localGenerated' )
                    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:89:3: lv_localGenerated_1_0= 'localGenerated'
                    {
                    lv_localGenerated_1_0=(Token)match(input,11,FollowSets000.FOLLOW_11_in_ruleMachine137); 

                            newLeafNode(lv_localGenerated_1_0, grammarAccess.getMachineAccess().getLocalGeneratedLocalGeneratedKeyword_1_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getMachineRule());
                    	        }
                           		setWithLastConsumed(current, "localGenerated", true, "localGenerated");
                    	    

                    }


                    }
                    break;

            }

            otherlv_2=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleMachine163); 

                	newLeafNode(otherlv_2, grammarAccess.getMachineAccess().getMachineKeyword_2());
                
            // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:106:1: ( (lv_name_3_0= ruleEString ) )
            // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:107:1: (lv_name_3_0= ruleEString )
            {
            // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:107:1: (lv_name_3_0= ruleEString )
            // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:108:3: lv_name_3_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getMachineAccess().getNameEStringParserRuleCall_3_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleMachine184);
            lv_name_3_0=ruleEString();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getMachineRule());
            	        }
                   		set(
                   			current, 
                   			"name",
                    		lv_name_3_0, 
                    		"EString");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:124:2: (otherlv_4= 'internalId' ( (lv_internalId_5_0= ruleEString ) ) )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==13) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:124:4: otherlv_4= 'internalId' ( (lv_internalId_5_0= ruleEString ) )
                    {
                    otherlv_4=(Token)match(input,13,FollowSets000.FOLLOW_13_in_ruleMachine197); 

                        	newLeafNode(otherlv_4, grammarAccess.getMachineAccess().getInternalIdKeyword_4_0());
                        
                    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:128:1: ( (lv_internalId_5_0= ruleEString ) )
                    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:129:1: (lv_internalId_5_0= ruleEString )
                    {
                    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:129:1: (lv_internalId_5_0= ruleEString )
                    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:130:3: lv_internalId_5_0= ruleEString
                    {
                     
                    	        newCompositeNode(grammarAccess.getMachineAccess().getInternalIdEStringParserRuleCall_4_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleMachine218);
                    lv_internalId_5_0=ruleEString();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getMachineRule());
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

            // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:146:4: (otherlv_6= 'Comment' ( (lv_comment_7_0= ruleEString ) ) )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==14) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:146:6: otherlv_6= 'Comment' ( (lv_comment_7_0= ruleEString ) )
                    {
                    otherlv_6=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleMachine233); 

                        	newLeafNode(otherlv_6, grammarAccess.getMachineAccess().getCommentKeyword_5_0());
                        
                    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:150:1: ( (lv_comment_7_0= ruleEString ) )
                    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:151:1: (lv_comment_7_0= ruleEString )
                    {
                    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:151:1: (lv_comment_7_0= ruleEString )
                    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:152:3: lv_comment_7_0= ruleEString
                    {
                     
                    	        newCompositeNode(grammarAccess.getMachineAccess().getCommentEStringParserRuleCall_5_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleMachine254);
                    lv_comment_7_0=ruleEString();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getMachineRule());
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

            // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:168:4: (otherlv_8= 'Refines' otherlv_9= '(' ( ( ruleEString ) ) (otherlv_11= ',' ( ( ruleEString ) ) )* otherlv_13= ')' )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==15) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:168:6: otherlv_8= 'Refines' otherlv_9= '(' ( ( ruleEString ) ) (otherlv_11= ',' ( ( ruleEString ) ) )* otherlv_13= ')'
                    {
                    otherlv_8=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleMachine269); 

                        	newLeafNode(otherlv_8, grammarAccess.getMachineAccess().getRefinesKeyword_6_0());
                        
                    otherlv_9=(Token)match(input,16,FollowSets000.FOLLOW_16_in_ruleMachine281); 

                        	newLeafNode(otherlv_9, grammarAccess.getMachineAccess().getLeftParenthesisKeyword_6_1());
                        
                    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:176:1: ( ( ruleEString ) )
                    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:177:1: ( ruleEString )
                    {
                    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:177:1: ( ruleEString )
                    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:178:3: ruleEString
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getMachineRule());
                    	        }
                            
                     
                    	        newCompositeNode(grammarAccess.getMachineAccess().getRefinesMachineCrossReference_6_2_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleMachine304);
                    ruleEString();

                    state._fsp--;

                     
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:191:2: (otherlv_11= ',' ( ( ruleEString ) ) )*
                    loop4:
                    do {
                        int alt4=2;
                        int LA4_0 = input.LA(1);

                        if ( (LA4_0==17) ) {
                            alt4=1;
                        }


                        switch (alt4) {
                    	case 1 :
                    	    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:191:4: otherlv_11= ',' ( ( ruleEString ) )
                    	    {
                    	    otherlv_11=(Token)match(input,17,FollowSets000.FOLLOW_17_in_ruleMachine317); 

                    	        	newLeafNode(otherlv_11, grammarAccess.getMachineAccess().getCommaKeyword_6_3_0());
                    	        
                    	    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:195:1: ( ( ruleEString ) )
                    	    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:196:1: ( ruleEString )
                    	    {
                    	    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:196:1: ( ruleEString )
                    	    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:197:3: ruleEString
                    	    {

                    	    			if (current==null) {
                    	    	            current = createModelElement(grammarAccess.getMachineRule());
                    	    	        }
                    	            
                    	     
                    	    	        newCompositeNode(grammarAccess.getMachineAccess().getRefinesMachineCrossReference_6_3_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleMachine340);
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

                    otherlv_13=(Token)match(input,18,FollowSets000.FOLLOW_18_in_ruleMachine354); 

                        	newLeafNode(otherlv_13, grammarAccess.getMachineAccess().getRightParenthesisKeyword_6_4());
                        

                    }
                    break;

            }

            // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:214:3: (otherlv_14= 'Sees' otherlv_15= '(' ( ( ruleEString ) ) (otherlv_17= ',' ( ( ruleEString ) ) )* otherlv_19= ')' )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==19) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:214:5: otherlv_14= 'Sees' otherlv_15= '(' ( ( ruleEString ) ) (otherlv_17= ',' ( ( ruleEString ) ) )* otherlv_19= ')'
                    {
                    otherlv_14=(Token)match(input,19,FollowSets000.FOLLOW_19_in_ruleMachine369); 

                        	newLeafNode(otherlv_14, grammarAccess.getMachineAccess().getSeesKeyword_7_0());
                        
                    otherlv_15=(Token)match(input,16,FollowSets000.FOLLOW_16_in_ruleMachine381); 

                        	newLeafNode(otherlv_15, grammarAccess.getMachineAccess().getLeftParenthesisKeyword_7_1());
                        
                    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:222:1: ( ( ruleEString ) )
                    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:223:1: ( ruleEString )
                    {
                    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:223:1: ( ruleEString )
                    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:224:3: ruleEString
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getMachineRule());
                    	        }
                            
                     
                    	        newCompositeNode(grammarAccess.getMachineAccess().getSeesContextCrossReference_7_2_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleMachine404);
                    ruleEString();

                    state._fsp--;

                     
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:237:2: (otherlv_17= ',' ( ( ruleEString ) ) )*
                    loop6:
                    do {
                        int alt6=2;
                        int LA6_0 = input.LA(1);

                        if ( (LA6_0==17) ) {
                            alt6=1;
                        }


                        switch (alt6) {
                    	case 1 :
                    	    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:237:4: otherlv_17= ',' ( ( ruleEString ) )
                    	    {
                    	    otherlv_17=(Token)match(input,17,FollowSets000.FOLLOW_17_in_ruleMachine417); 

                    	        	newLeafNode(otherlv_17, grammarAccess.getMachineAccess().getCommaKeyword_7_3_0());
                    	        
                    	    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:241:1: ( ( ruleEString ) )
                    	    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:242:1: ( ruleEString )
                    	    {
                    	    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:242:1: ( ruleEString )
                    	    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:243:3: ruleEString
                    	    {

                    	    			if (current==null) {
                    	    	            current = createModelElement(grammarAccess.getMachineRule());
                    	    	        }
                    	            
                    	     
                    	    	        newCompositeNode(grammarAccess.getMachineAccess().getSeesContextCrossReference_7_3_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleMachine440);
                    	    ruleEString();

                    	    state._fsp--;

                    	     
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop6;
                        }
                    } while (true);

                    otherlv_19=(Token)match(input,18,FollowSets000.FOLLOW_18_in_ruleMachine454); 

                        	newLeafNode(otherlv_19, grammarAccess.getMachineAccess().getRightParenthesisKeyword_7_4());
                        

                    }
                    break;

            }

            // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:260:3: (otherlv_20= 'annotations' otherlv_21= '{' ( (lv_annotations_22_0= ruleAnnotation ) ) (otherlv_23= ',' ( (lv_annotations_24_0= ruleAnnotation ) ) )* otherlv_25= '}' )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==20) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:260:5: otherlv_20= 'annotations' otherlv_21= '{' ( (lv_annotations_22_0= ruleAnnotation ) ) (otherlv_23= ',' ( (lv_annotations_24_0= ruleAnnotation ) ) )* otherlv_25= '}'
                    {
                    otherlv_20=(Token)match(input,20,FollowSets000.FOLLOW_20_in_ruleMachine469); 

                        	newLeafNode(otherlv_20, grammarAccess.getMachineAccess().getAnnotationsKeyword_8_0());
                        
                    otherlv_21=(Token)match(input,21,FollowSets000.FOLLOW_21_in_ruleMachine481); 

                        	newLeafNode(otherlv_21, grammarAccess.getMachineAccess().getLeftCurlyBracketKeyword_8_1());
                        
                    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:268:1: ( (lv_annotations_22_0= ruleAnnotation ) )
                    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:269:1: (lv_annotations_22_0= ruleAnnotation )
                    {
                    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:269:1: (lv_annotations_22_0= ruleAnnotation )
                    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:270:3: lv_annotations_22_0= ruleAnnotation
                    {
                     
                    	        newCompositeNode(grammarAccess.getMachineAccess().getAnnotationsAnnotationParserRuleCall_8_2_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleAnnotation_in_ruleMachine502);
                    lv_annotations_22_0=ruleAnnotation();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getMachineRule());
                    	        }
                           		add(
                           			current, 
                           			"annotations",
                            		lv_annotations_22_0, 
                            		"Annotation");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:286:2: (otherlv_23= ',' ( (lv_annotations_24_0= ruleAnnotation ) ) )*
                    loop8:
                    do {
                        int alt8=2;
                        int LA8_0 = input.LA(1);

                        if ( (LA8_0==17) ) {
                            alt8=1;
                        }


                        switch (alt8) {
                    	case 1 :
                    	    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:286:4: otherlv_23= ',' ( (lv_annotations_24_0= ruleAnnotation ) )
                    	    {
                    	    otherlv_23=(Token)match(input,17,FollowSets000.FOLLOW_17_in_ruleMachine515); 

                    	        	newLeafNode(otherlv_23, grammarAccess.getMachineAccess().getCommaKeyword_8_3_0());
                    	        
                    	    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:290:1: ( (lv_annotations_24_0= ruleAnnotation ) )
                    	    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:291:1: (lv_annotations_24_0= ruleAnnotation )
                    	    {
                    	    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:291:1: (lv_annotations_24_0= ruleAnnotation )
                    	    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:292:3: lv_annotations_24_0= ruleAnnotation
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getMachineAccess().getAnnotationsAnnotationParserRuleCall_8_3_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleAnnotation_in_ruleMachine536);
                    	    lv_annotations_24_0=ruleAnnotation();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getMachineRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"annotations",
                    	            		lv_annotations_24_0, 
                    	            		"Annotation");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop8;
                        }
                    } while (true);

                    otherlv_25=(Token)match(input,22,FollowSets000.FOLLOW_22_in_ruleMachine550); 

                        	newLeafNode(otherlv_25, grammarAccess.getMachineAccess().getRightCurlyBracketKeyword_8_4());
                        

                    }
                    break;

            }

            // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:312:3: (otherlv_26= 'extensions' otherlv_27= '{' ( (lv_extensions_28_0= ruleAbstractExtension ) ) (otherlv_29= ',' ( (lv_extensions_30_0= ruleAbstractExtension ) ) )* otherlv_31= '}' )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==23) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:312:5: otherlv_26= 'extensions' otherlv_27= '{' ( (lv_extensions_28_0= ruleAbstractExtension ) ) (otherlv_29= ',' ( (lv_extensions_30_0= ruleAbstractExtension ) ) )* otherlv_31= '}'
                    {
                    otherlv_26=(Token)match(input,23,FollowSets000.FOLLOW_23_in_ruleMachine565); 

                        	newLeafNode(otherlv_26, grammarAccess.getMachineAccess().getExtensionsKeyword_9_0());
                        
                    otherlv_27=(Token)match(input,21,FollowSets000.FOLLOW_21_in_ruleMachine577); 

                        	newLeafNode(otherlv_27, grammarAccess.getMachineAccess().getLeftCurlyBracketKeyword_9_1());
                        
                    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:320:1: ( (lv_extensions_28_0= ruleAbstractExtension ) )
                    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:321:1: (lv_extensions_28_0= ruleAbstractExtension )
                    {
                    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:321:1: (lv_extensions_28_0= ruleAbstractExtension )
                    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:322:3: lv_extensions_28_0= ruleAbstractExtension
                    {
                     
                    	        newCompositeNode(grammarAccess.getMachineAccess().getExtensionsAbstractExtensionParserRuleCall_9_2_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleAbstractExtension_in_ruleMachine598);
                    lv_extensions_28_0=ruleAbstractExtension();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getMachineRule());
                    	        }
                           		add(
                           			current, 
                           			"extensions",
                            		lv_extensions_28_0, 
                            		"AbstractExtension");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:338:2: (otherlv_29= ',' ( (lv_extensions_30_0= ruleAbstractExtension ) ) )*
                    loop10:
                    do {
                        int alt10=2;
                        int LA10_0 = input.LA(1);

                        if ( (LA10_0==17) ) {
                            alt10=1;
                        }


                        switch (alt10) {
                    	case 1 :
                    	    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:338:4: otherlv_29= ',' ( (lv_extensions_30_0= ruleAbstractExtension ) )
                    	    {
                    	    otherlv_29=(Token)match(input,17,FollowSets000.FOLLOW_17_in_ruleMachine611); 

                    	        	newLeafNode(otherlv_29, grammarAccess.getMachineAccess().getCommaKeyword_9_3_0());
                    	        
                    	    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:342:1: ( (lv_extensions_30_0= ruleAbstractExtension ) )
                    	    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:343:1: (lv_extensions_30_0= ruleAbstractExtension )
                    	    {
                    	    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:343:1: (lv_extensions_30_0= ruleAbstractExtension )
                    	    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:344:3: lv_extensions_30_0= ruleAbstractExtension
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getMachineAccess().getExtensionsAbstractExtensionParserRuleCall_9_3_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleAbstractExtension_in_ruleMachine632);
                    	    lv_extensions_30_0=ruleAbstractExtension();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getMachineRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"extensions",
                    	            		lv_extensions_30_0, 
                    	            		"AbstractExtension");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop10;
                        }
                    } while (true);

                    otherlv_31=(Token)match(input,22,FollowSets000.FOLLOW_22_in_ruleMachine646); 

                        	newLeafNode(otherlv_31, grammarAccess.getMachineAccess().getRightCurlyBracketKeyword_9_4());
                        

                    }
                    break;

            }

            // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:364:3: (otherlv_32= 'attributes' otherlv_33= '{' ( (lv_attributes_34_0= ruleStringToAttributeMapEntry ) ) (otherlv_35= ',' ( (lv_attributes_36_0= ruleStringToAttributeMapEntry ) ) )* otherlv_37= '}' )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==24) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:364:5: otherlv_32= 'attributes' otherlv_33= '{' ( (lv_attributes_34_0= ruleStringToAttributeMapEntry ) ) (otherlv_35= ',' ( (lv_attributes_36_0= ruleStringToAttributeMapEntry ) ) )* otherlv_37= '}'
                    {
                    otherlv_32=(Token)match(input,24,FollowSets000.FOLLOW_24_in_ruleMachine661); 

                        	newLeafNode(otherlv_32, grammarAccess.getMachineAccess().getAttributesKeyword_10_0());
                        
                    otherlv_33=(Token)match(input,21,FollowSets000.FOLLOW_21_in_ruleMachine673); 

                        	newLeafNode(otherlv_33, grammarAccess.getMachineAccess().getLeftCurlyBracketKeyword_10_1());
                        
                    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:372:1: ( (lv_attributes_34_0= ruleStringToAttributeMapEntry ) )
                    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:373:1: (lv_attributes_34_0= ruleStringToAttributeMapEntry )
                    {
                    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:373:1: (lv_attributes_34_0= ruleStringToAttributeMapEntry )
                    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:374:3: lv_attributes_34_0= ruleStringToAttributeMapEntry
                    {
                     
                    	        newCompositeNode(grammarAccess.getMachineAccess().getAttributesStringToAttributeMapEntryParserRuleCall_10_2_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleStringToAttributeMapEntry_in_ruleMachine694);
                    lv_attributes_34_0=ruleStringToAttributeMapEntry();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getMachineRule());
                    	        }
                           		add(
                           			current, 
                           			"attributes",
                            		lv_attributes_34_0, 
                            		"StringToAttributeMapEntry");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:390:2: (otherlv_35= ',' ( (lv_attributes_36_0= ruleStringToAttributeMapEntry ) ) )*
                    loop12:
                    do {
                        int alt12=2;
                        int LA12_0 = input.LA(1);

                        if ( (LA12_0==17) ) {
                            alt12=1;
                        }


                        switch (alt12) {
                    	case 1 :
                    	    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:390:4: otherlv_35= ',' ( (lv_attributes_36_0= ruleStringToAttributeMapEntry ) )
                    	    {
                    	    otherlv_35=(Token)match(input,17,FollowSets000.FOLLOW_17_in_ruleMachine707); 

                    	        	newLeafNode(otherlv_35, grammarAccess.getMachineAccess().getCommaKeyword_10_3_0());
                    	        
                    	    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:394:1: ( (lv_attributes_36_0= ruleStringToAttributeMapEntry ) )
                    	    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:395:1: (lv_attributes_36_0= ruleStringToAttributeMapEntry )
                    	    {
                    	    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:395:1: (lv_attributes_36_0= ruleStringToAttributeMapEntry )
                    	    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:396:3: lv_attributes_36_0= ruleStringToAttributeMapEntry
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getMachineAccess().getAttributesStringToAttributeMapEntryParserRuleCall_10_3_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleStringToAttributeMapEntry_in_ruleMachine728);
                    	    lv_attributes_36_0=ruleStringToAttributeMapEntry();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getMachineRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"attributes",
                    	            		lv_attributes_36_0, 
                    	            		"StringToAttributeMapEntry");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop12;
                        }
                    } while (true);

                    otherlv_37=(Token)match(input,22,FollowSets000.FOLLOW_22_in_ruleMachine742); 

                        	newLeafNode(otherlv_37, grammarAccess.getMachineAccess().getRightCurlyBracketKeyword_10_4());
                        

                    }
                    break;

            }

            // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:416:3: (otherlv_38= 'Variables' ( (lv_variables_39_0= ruleVariable ) ) (otherlv_40= ',' ( (lv_variables_41_0= ruleVariable ) ) )* )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==25) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:416:5: otherlv_38= 'Variables' ( (lv_variables_39_0= ruleVariable ) ) (otherlv_40= ',' ( (lv_variables_41_0= ruleVariable ) ) )*
                    {
                    otherlv_38=(Token)match(input,25,FollowSets000.FOLLOW_25_in_ruleMachine757); 

                        	newLeafNode(otherlv_38, grammarAccess.getMachineAccess().getVariablesKeyword_11_0());
                        
                    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:420:1: ( (lv_variables_39_0= ruleVariable ) )
                    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:421:1: (lv_variables_39_0= ruleVariable )
                    {
                    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:421:1: (lv_variables_39_0= ruleVariable )
                    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:422:3: lv_variables_39_0= ruleVariable
                    {
                     
                    	        newCompositeNode(grammarAccess.getMachineAccess().getVariablesVariableParserRuleCall_11_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleVariable_in_ruleMachine778);
                    lv_variables_39_0=ruleVariable();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getMachineRule());
                    	        }
                           		add(
                           			current, 
                           			"variables",
                            		lv_variables_39_0, 
                            		"Variable");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:438:2: (otherlv_40= ',' ( (lv_variables_41_0= ruleVariable ) ) )*
                    loop14:
                    do {
                        int alt14=2;
                        int LA14_0 = input.LA(1);

                        if ( (LA14_0==17) ) {
                            alt14=1;
                        }


                        switch (alt14) {
                    	case 1 :
                    	    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:438:4: otherlv_40= ',' ( (lv_variables_41_0= ruleVariable ) )
                    	    {
                    	    otherlv_40=(Token)match(input,17,FollowSets000.FOLLOW_17_in_ruleMachine791); 

                    	        	newLeafNode(otherlv_40, grammarAccess.getMachineAccess().getCommaKeyword_11_2_0());
                    	        
                    	    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:442:1: ( (lv_variables_41_0= ruleVariable ) )
                    	    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:443:1: (lv_variables_41_0= ruleVariable )
                    	    {
                    	    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:443:1: (lv_variables_41_0= ruleVariable )
                    	    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:444:3: lv_variables_41_0= ruleVariable
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getMachineAccess().getVariablesVariableParserRuleCall_11_2_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleVariable_in_ruleMachine812);
                    	    lv_variables_41_0=ruleVariable();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getMachineRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"variables",
                    	            		lv_variables_41_0, 
                    	            		"Variable");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop14;
                        }
                    } while (true);


                    }
                    break;

            }

            // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:460:6: (otherlv_42= 'Invariants' ( (lv_invariants_43_0= ruleInvariant ) ) (otherlv_44= '&' ( (lv_invariants_45_0= ruleInvariant ) ) )* )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==26) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:460:8: otherlv_42= 'Invariants' ( (lv_invariants_43_0= ruleInvariant ) ) (otherlv_44= '&' ( (lv_invariants_45_0= ruleInvariant ) ) )*
                    {
                    otherlv_42=(Token)match(input,26,FollowSets000.FOLLOW_26_in_ruleMachine829); 

                        	newLeafNode(otherlv_42, grammarAccess.getMachineAccess().getInvariantsKeyword_12_0());
                        
                    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:464:1: ( (lv_invariants_43_0= ruleInvariant ) )
                    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:465:1: (lv_invariants_43_0= ruleInvariant )
                    {
                    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:465:1: (lv_invariants_43_0= ruleInvariant )
                    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:466:3: lv_invariants_43_0= ruleInvariant
                    {
                     
                    	        newCompositeNode(grammarAccess.getMachineAccess().getInvariantsInvariantParserRuleCall_12_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleInvariant_in_ruleMachine850);
                    lv_invariants_43_0=ruleInvariant();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getMachineRule());
                    	        }
                           		add(
                           			current, 
                           			"invariants",
                            		lv_invariants_43_0, 
                            		"Invariant");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:482:2: (otherlv_44= '&' ( (lv_invariants_45_0= ruleInvariant ) ) )*
                    loop16:
                    do {
                        int alt16=2;
                        int LA16_0 = input.LA(1);

                        if ( (LA16_0==27) ) {
                            alt16=1;
                        }


                        switch (alt16) {
                    	case 1 :
                    	    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:482:4: otherlv_44= '&' ( (lv_invariants_45_0= ruleInvariant ) )
                    	    {
                    	    otherlv_44=(Token)match(input,27,FollowSets000.FOLLOW_27_in_ruleMachine863); 

                    	        	newLeafNode(otherlv_44, grammarAccess.getMachineAccess().getAmpersandKeyword_12_2_0());
                    	        
                    	    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:486:1: ( (lv_invariants_45_0= ruleInvariant ) )
                    	    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:487:1: (lv_invariants_45_0= ruleInvariant )
                    	    {
                    	    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:487:1: (lv_invariants_45_0= ruleInvariant )
                    	    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:488:3: lv_invariants_45_0= ruleInvariant
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getMachineAccess().getInvariantsInvariantParserRuleCall_12_2_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleInvariant_in_ruleMachine884);
                    	    lv_invariants_45_0=ruleInvariant();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getMachineRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"invariants",
                    	            		lv_invariants_45_0, 
                    	            		"Invariant");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop16;
                        }
                    } while (true);


                    }
                    break;

            }

            // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:504:6: (otherlv_46= 'Variant' ( (lv_variant_47_0= ruleVariant ) ) )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==28) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:504:8: otherlv_46= 'Variant' ( (lv_variant_47_0= ruleVariant ) )
                    {
                    otherlv_46=(Token)match(input,28,FollowSets000.FOLLOW_28_in_ruleMachine901); 

                        	newLeafNode(otherlv_46, grammarAccess.getMachineAccess().getVariantKeyword_13_0());
                        
                    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:508:1: ( (lv_variant_47_0= ruleVariant ) )
                    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:509:1: (lv_variant_47_0= ruleVariant )
                    {
                    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:509:1: (lv_variant_47_0= ruleVariant )
                    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:510:3: lv_variant_47_0= ruleVariant
                    {
                     
                    	        newCompositeNode(grammarAccess.getMachineAccess().getVariantVariantParserRuleCall_13_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleVariant_in_ruleMachine922);
                    lv_variant_47_0=ruleVariant();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getMachineRule());
                    	        }
                           		set(
                           			current, 
                           			"variant",
                            		lv_variant_47_0, 
                            		"Variant");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:526:4: (otherlv_48= 'Events' ( (lv_events_49_0= ruleEvent ) ) ( (lv_events_50_0= ruleEvent ) )* )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==29) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:526:6: otherlv_48= 'Events' ( (lv_events_49_0= ruleEvent ) ) ( (lv_events_50_0= ruleEvent ) )*
                    {
                    otherlv_48=(Token)match(input,29,FollowSets000.FOLLOW_29_in_ruleMachine937); 

                        	newLeafNode(otherlv_48, grammarAccess.getMachineAccess().getEventsKeyword_14_0());
                        
                    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:530:1: ( (lv_events_49_0= ruleEvent ) )
                    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:531:1: (lv_events_49_0= ruleEvent )
                    {
                    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:531:1: (lv_events_49_0= ruleEvent )
                    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:532:3: lv_events_49_0= ruleEvent
                    {
                     
                    	        newCompositeNode(grammarAccess.getMachineAccess().getEventsEventParserRuleCall_14_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEvent_in_ruleMachine958);
                    lv_events_49_0=ruleEvent();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getMachineRule());
                    	        }
                           		add(
                           			current, 
                           			"events",
                            		lv_events_49_0, 
                            		"Event");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:548:2: ( (lv_events_50_0= ruleEvent ) )*
                    loop19:
                    do {
                        int alt19=2;
                        int LA19_0 = input.LA(1);

                        if ( (LA19_0==45) ) {
                            alt19=1;
                        }


                        switch (alt19) {
                    	case 1 :
                    	    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:549:1: (lv_events_50_0= ruleEvent )
                    	    {
                    	    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:549:1: (lv_events_50_0= ruleEvent )
                    	    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:550:3: lv_events_50_0= ruleEvent
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getMachineAccess().getEventsEventParserRuleCall_14_2_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleEvent_in_ruleMachine979);
                    	    lv_events_50_0=ruleEvent();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getMachineRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"events",
                    	            		lv_events_50_0, 
                    	            		"Event");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop19;
                        }
                    } while (true);


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
    // $ANTLR end "ruleMachine"


    // $ANTLR start "entryRuleAbstractExtension"
    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:574:1: entryRuleAbstractExtension returns [EObject current=null] : iv_ruleAbstractExtension= ruleAbstractExtension EOF ;
    public final EObject entryRuleAbstractExtension() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAbstractExtension = null;


        try {
            // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:575:2: (iv_ruleAbstractExtension= ruleAbstractExtension EOF )
            // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:576:2: iv_ruleAbstractExtension= ruleAbstractExtension EOF
            {
             newCompositeNode(grammarAccess.getAbstractExtensionRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleAbstractExtension_in_entryRuleAbstractExtension1018);
            iv_ruleAbstractExtension=ruleAbstractExtension();

            state._fsp--;

             current =iv_ruleAbstractExtension; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleAbstractExtension1028); 

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
    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:583:1: ruleAbstractExtension returns [EObject current=null] : this_Extension_0= ruleExtension ;
    public final EObject ruleAbstractExtension() throws RecognitionException {
        EObject current = null;

        EObject this_Extension_0 = null;


         enterRule(); 
            
        try {
            // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:586:28: (this_Extension_0= ruleExtension )
            // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:588:5: this_Extension_0= ruleExtension
            {
             
                    newCompositeNode(grammarAccess.getAbstractExtensionAccess().getExtensionParserRuleCall()); 
                
            pushFollow(FollowSets000.FOLLOW_ruleExtension_in_ruleAbstractExtension1074);
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
    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:604:1: entryRuleAnnotation returns [EObject current=null] : iv_ruleAnnotation= ruleAnnotation EOF ;
    public final EObject entryRuleAnnotation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAnnotation = null;


        try {
            // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:605:2: (iv_ruleAnnotation= ruleAnnotation EOF )
            // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:606:2: iv_ruleAnnotation= ruleAnnotation EOF
            {
             newCompositeNode(grammarAccess.getAnnotationRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleAnnotation_in_entryRuleAnnotation1108);
            iv_ruleAnnotation=ruleAnnotation();

            state._fsp--;

             current =iv_ruleAnnotation; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleAnnotation1118); 

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
    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:613:1: ruleAnnotation returns [EObject current=null] : ( () otherlv_1= 'Annotation' otherlv_2= '{' (otherlv_3= 'source' ( (lv_source_4_0= ruleEString ) ) )? (otherlv_5= 'references' otherlv_6= '(' ( ( ruleEString ) ) (otherlv_8= ',' ( ( ruleEString ) ) )* otherlv_10= ')' )? (otherlv_11= 'annotations' otherlv_12= '{' ( (lv_annotations_13_0= ruleAnnotation ) ) (otherlv_14= ',' ( (lv_annotations_15_0= ruleAnnotation ) ) )* otherlv_16= '}' )? (otherlv_17= 'details' otherlv_18= '{' ( (lv_details_19_0= ruleStringToStringMapEntry ) ) (otherlv_20= ',' ( (lv_details_21_0= ruleStringToStringMapEntry ) ) )* otherlv_22= '}' )? (otherlv_23= 'contents' otherlv_24= '{' ( (lv_contents_25_0= ruleEObject ) ) (otherlv_26= ',' ( (lv_contents_27_0= ruleEObject ) ) )* otherlv_28= '}' )? otherlv_29= '}' ) ;
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
            // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:616:28: ( ( () otherlv_1= 'Annotation' otherlv_2= '{' (otherlv_3= 'source' ( (lv_source_4_0= ruleEString ) ) )? (otherlv_5= 'references' otherlv_6= '(' ( ( ruleEString ) ) (otherlv_8= ',' ( ( ruleEString ) ) )* otherlv_10= ')' )? (otherlv_11= 'annotations' otherlv_12= '{' ( (lv_annotations_13_0= ruleAnnotation ) ) (otherlv_14= ',' ( (lv_annotations_15_0= ruleAnnotation ) ) )* otherlv_16= '}' )? (otherlv_17= 'details' otherlv_18= '{' ( (lv_details_19_0= ruleStringToStringMapEntry ) ) (otherlv_20= ',' ( (lv_details_21_0= ruleStringToStringMapEntry ) ) )* otherlv_22= '}' )? (otherlv_23= 'contents' otherlv_24= '{' ( (lv_contents_25_0= ruleEObject ) ) (otherlv_26= ',' ( (lv_contents_27_0= ruleEObject ) ) )* otherlv_28= '}' )? otherlv_29= '}' ) )
            // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:617:1: ( () otherlv_1= 'Annotation' otherlv_2= '{' (otherlv_3= 'source' ( (lv_source_4_0= ruleEString ) ) )? (otherlv_5= 'references' otherlv_6= '(' ( ( ruleEString ) ) (otherlv_8= ',' ( ( ruleEString ) ) )* otherlv_10= ')' )? (otherlv_11= 'annotations' otherlv_12= '{' ( (lv_annotations_13_0= ruleAnnotation ) ) (otherlv_14= ',' ( (lv_annotations_15_0= ruleAnnotation ) ) )* otherlv_16= '}' )? (otherlv_17= 'details' otherlv_18= '{' ( (lv_details_19_0= ruleStringToStringMapEntry ) ) (otherlv_20= ',' ( (lv_details_21_0= ruleStringToStringMapEntry ) ) )* otherlv_22= '}' )? (otherlv_23= 'contents' otherlv_24= '{' ( (lv_contents_25_0= ruleEObject ) ) (otherlv_26= ',' ( (lv_contents_27_0= ruleEObject ) ) )* otherlv_28= '}' )? otherlv_29= '}' )
            {
            // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:617:1: ( () otherlv_1= 'Annotation' otherlv_2= '{' (otherlv_3= 'source' ( (lv_source_4_0= ruleEString ) ) )? (otherlv_5= 'references' otherlv_6= '(' ( ( ruleEString ) ) (otherlv_8= ',' ( ( ruleEString ) ) )* otherlv_10= ')' )? (otherlv_11= 'annotations' otherlv_12= '{' ( (lv_annotations_13_0= ruleAnnotation ) ) (otherlv_14= ',' ( (lv_annotations_15_0= ruleAnnotation ) ) )* otherlv_16= '}' )? (otherlv_17= 'details' otherlv_18= '{' ( (lv_details_19_0= ruleStringToStringMapEntry ) ) (otherlv_20= ',' ( (lv_details_21_0= ruleStringToStringMapEntry ) ) )* otherlv_22= '}' )? (otherlv_23= 'contents' otherlv_24= '{' ( (lv_contents_25_0= ruleEObject ) ) (otherlv_26= ',' ( (lv_contents_27_0= ruleEObject ) ) )* otherlv_28= '}' )? otherlv_29= '}' )
            // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:617:2: () otherlv_1= 'Annotation' otherlv_2= '{' (otherlv_3= 'source' ( (lv_source_4_0= ruleEString ) ) )? (otherlv_5= 'references' otherlv_6= '(' ( ( ruleEString ) ) (otherlv_8= ',' ( ( ruleEString ) ) )* otherlv_10= ')' )? (otherlv_11= 'annotations' otherlv_12= '{' ( (lv_annotations_13_0= ruleAnnotation ) ) (otherlv_14= ',' ( (lv_annotations_15_0= ruleAnnotation ) ) )* otherlv_16= '}' )? (otherlv_17= 'details' otherlv_18= '{' ( (lv_details_19_0= ruleStringToStringMapEntry ) ) (otherlv_20= ',' ( (lv_details_21_0= ruleStringToStringMapEntry ) ) )* otherlv_22= '}' )? (otherlv_23= 'contents' otherlv_24= '{' ( (lv_contents_25_0= ruleEObject ) ) (otherlv_26= ',' ( (lv_contents_27_0= ruleEObject ) ) )* otherlv_28= '}' )? otherlv_29= '}'
            {
            // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:617:2: ()
            // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:618:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getAnnotationAccess().getAnnotationAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,30,FollowSets000.FOLLOW_30_in_ruleAnnotation1164); 

                	newLeafNode(otherlv_1, grammarAccess.getAnnotationAccess().getAnnotationKeyword_1());
                
            otherlv_2=(Token)match(input,21,FollowSets000.FOLLOW_21_in_ruleAnnotation1176); 

                	newLeafNode(otherlv_2, grammarAccess.getAnnotationAccess().getLeftCurlyBracketKeyword_2());
                
            // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:631:1: (otherlv_3= 'source' ( (lv_source_4_0= ruleEString ) ) )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==31) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:631:3: otherlv_3= 'source' ( (lv_source_4_0= ruleEString ) )
                    {
                    otherlv_3=(Token)match(input,31,FollowSets000.FOLLOW_31_in_ruleAnnotation1189); 

                        	newLeafNode(otherlv_3, grammarAccess.getAnnotationAccess().getSourceKeyword_3_0());
                        
                    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:635:1: ( (lv_source_4_0= ruleEString ) )
                    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:636:1: (lv_source_4_0= ruleEString )
                    {
                    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:636:1: (lv_source_4_0= ruleEString )
                    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:637:3: lv_source_4_0= ruleEString
                    {
                     
                    	        newCompositeNode(grammarAccess.getAnnotationAccess().getSourceEStringParserRuleCall_3_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleAnnotation1210);
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

            // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:653:4: (otherlv_5= 'references' otherlv_6= '(' ( ( ruleEString ) ) (otherlv_8= ',' ( ( ruleEString ) ) )* otherlv_10= ')' )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==32) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:653:6: otherlv_5= 'references' otherlv_6= '(' ( ( ruleEString ) ) (otherlv_8= ',' ( ( ruleEString ) ) )* otherlv_10= ')'
                    {
                    otherlv_5=(Token)match(input,32,FollowSets000.FOLLOW_32_in_ruleAnnotation1225); 

                        	newLeafNode(otherlv_5, grammarAccess.getAnnotationAccess().getReferencesKeyword_4_0());
                        
                    otherlv_6=(Token)match(input,16,FollowSets000.FOLLOW_16_in_ruleAnnotation1237); 

                        	newLeafNode(otherlv_6, grammarAccess.getAnnotationAccess().getLeftParenthesisKeyword_4_1());
                        
                    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:661:1: ( ( ruleEString ) )
                    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:662:1: ( ruleEString )
                    {
                    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:662:1: ( ruleEString )
                    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:663:3: ruleEString
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getAnnotationRule());
                    	        }
                            
                     
                    	        newCompositeNode(grammarAccess.getAnnotationAccess().getReferencesEObjectCrossReference_4_2_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleAnnotation1260);
                    ruleEString();

                    state._fsp--;

                     
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:676:2: (otherlv_8= ',' ( ( ruleEString ) ) )*
                    loop22:
                    do {
                        int alt22=2;
                        int LA22_0 = input.LA(1);

                        if ( (LA22_0==17) ) {
                            alt22=1;
                        }


                        switch (alt22) {
                    	case 1 :
                    	    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:676:4: otherlv_8= ',' ( ( ruleEString ) )
                    	    {
                    	    otherlv_8=(Token)match(input,17,FollowSets000.FOLLOW_17_in_ruleAnnotation1273); 

                    	        	newLeafNode(otherlv_8, grammarAccess.getAnnotationAccess().getCommaKeyword_4_3_0());
                    	        
                    	    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:680:1: ( ( ruleEString ) )
                    	    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:681:1: ( ruleEString )
                    	    {
                    	    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:681:1: ( ruleEString )
                    	    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:682:3: ruleEString
                    	    {

                    	    			if (current==null) {
                    	    	            current = createModelElement(grammarAccess.getAnnotationRule());
                    	    	        }
                    	            
                    	     
                    	    	        newCompositeNode(grammarAccess.getAnnotationAccess().getReferencesEObjectCrossReference_4_3_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleAnnotation1296);
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

                    otherlv_10=(Token)match(input,18,FollowSets000.FOLLOW_18_in_ruleAnnotation1310); 

                        	newLeafNode(otherlv_10, grammarAccess.getAnnotationAccess().getRightParenthesisKeyword_4_4());
                        

                    }
                    break;

            }

            // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:699:3: (otherlv_11= 'annotations' otherlv_12= '{' ( (lv_annotations_13_0= ruleAnnotation ) ) (otherlv_14= ',' ( (lv_annotations_15_0= ruleAnnotation ) ) )* otherlv_16= '}' )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==20) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:699:5: otherlv_11= 'annotations' otherlv_12= '{' ( (lv_annotations_13_0= ruleAnnotation ) ) (otherlv_14= ',' ( (lv_annotations_15_0= ruleAnnotation ) ) )* otherlv_16= '}'
                    {
                    otherlv_11=(Token)match(input,20,FollowSets000.FOLLOW_20_in_ruleAnnotation1325); 

                        	newLeafNode(otherlv_11, grammarAccess.getAnnotationAccess().getAnnotationsKeyword_5_0());
                        
                    otherlv_12=(Token)match(input,21,FollowSets000.FOLLOW_21_in_ruleAnnotation1337); 

                        	newLeafNode(otherlv_12, grammarAccess.getAnnotationAccess().getLeftCurlyBracketKeyword_5_1());
                        
                    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:707:1: ( (lv_annotations_13_0= ruleAnnotation ) )
                    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:708:1: (lv_annotations_13_0= ruleAnnotation )
                    {
                    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:708:1: (lv_annotations_13_0= ruleAnnotation )
                    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:709:3: lv_annotations_13_0= ruleAnnotation
                    {
                     
                    	        newCompositeNode(grammarAccess.getAnnotationAccess().getAnnotationsAnnotationParserRuleCall_5_2_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleAnnotation_in_ruleAnnotation1358);
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

                    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:725:2: (otherlv_14= ',' ( (lv_annotations_15_0= ruleAnnotation ) ) )*
                    loop24:
                    do {
                        int alt24=2;
                        int LA24_0 = input.LA(1);

                        if ( (LA24_0==17) ) {
                            alt24=1;
                        }


                        switch (alt24) {
                    	case 1 :
                    	    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:725:4: otherlv_14= ',' ( (lv_annotations_15_0= ruleAnnotation ) )
                    	    {
                    	    otherlv_14=(Token)match(input,17,FollowSets000.FOLLOW_17_in_ruleAnnotation1371); 

                    	        	newLeafNode(otherlv_14, grammarAccess.getAnnotationAccess().getCommaKeyword_5_3_0());
                    	        
                    	    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:729:1: ( (lv_annotations_15_0= ruleAnnotation ) )
                    	    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:730:1: (lv_annotations_15_0= ruleAnnotation )
                    	    {
                    	    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:730:1: (lv_annotations_15_0= ruleAnnotation )
                    	    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:731:3: lv_annotations_15_0= ruleAnnotation
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getAnnotationAccess().getAnnotationsAnnotationParserRuleCall_5_3_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleAnnotation_in_ruleAnnotation1392);
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
                    	    break loop24;
                        }
                    } while (true);

                    otherlv_16=(Token)match(input,22,FollowSets000.FOLLOW_22_in_ruleAnnotation1406); 

                        	newLeafNode(otherlv_16, grammarAccess.getAnnotationAccess().getRightCurlyBracketKeyword_5_4());
                        

                    }
                    break;

            }

            // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:751:3: (otherlv_17= 'details' otherlv_18= '{' ( (lv_details_19_0= ruleStringToStringMapEntry ) ) (otherlv_20= ',' ( (lv_details_21_0= ruleStringToStringMapEntry ) ) )* otherlv_22= '}' )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==33) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:751:5: otherlv_17= 'details' otherlv_18= '{' ( (lv_details_19_0= ruleStringToStringMapEntry ) ) (otherlv_20= ',' ( (lv_details_21_0= ruleStringToStringMapEntry ) ) )* otherlv_22= '}'
                    {
                    otherlv_17=(Token)match(input,33,FollowSets000.FOLLOW_33_in_ruleAnnotation1421); 

                        	newLeafNode(otherlv_17, grammarAccess.getAnnotationAccess().getDetailsKeyword_6_0());
                        
                    otherlv_18=(Token)match(input,21,FollowSets000.FOLLOW_21_in_ruleAnnotation1433); 

                        	newLeafNode(otherlv_18, grammarAccess.getAnnotationAccess().getLeftCurlyBracketKeyword_6_1());
                        
                    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:759:1: ( (lv_details_19_0= ruleStringToStringMapEntry ) )
                    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:760:1: (lv_details_19_0= ruleStringToStringMapEntry )
                    {
                    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:760:1: (lv_details_19_0= ruleStringToStringMapEntry )
                    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:761:3: lv_details_19_0= ruleStringToStringMapEntry
                    {
                     
                    	        newCompositeNode(grammarAccess.getAnnotationAccess().getDetailsStringToStringMapEntryParserRuleCall_6_2_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleStringToStringMapEntry_in_ruleAnnotation1454);
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

                    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:777:2: (otherlv_20= ',' ( (lv_details_21_0= ruleStringToStringMapEntry ) ) )*
                    loop26:
                    do {
                        int alt26=2;
                        int LA26_0 = input.LA(1);

                        if ( (LA26_0==17) ) {
                            alt26=1;
                        }


                        switch (alt26) {
                    	case 1 :
                    	    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:777:4: otherlv_20= ',' ( (lv_details_21_0= ruleStringToStringMapEntry ) )
                    	    {
                    	    otherlv_20=(Token)match(input,17,FollowSets000.FOLLOW_17_in_ruleAnnotation1467); 

                    	        	newLeafNode(otherlv_20, grammarAccess.getAnnotationAccess().getCommaKeyword_6_3_0());
                    	        
                    	    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:781:1: ( (lv_details_21_0= ruleStringToStringMapEntry ) )
                    	    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:782:1: (lv_details_21_0= ruleStringToStringMapEntry )
                    	    {
                    	    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:782:1: (lv_details_21_0= ruleStringToStringMapEntry )
                    	    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:783:3: lv_details_21_0= ruleStringToStringMapEntry
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getAnnotationAccess().getDetailsStringToStringMapEntryParserRuleCall_6_3_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleStringToStringMapEntry_in_ruleAnnotation1488);
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
                    	    break loop26;
                        }
                    } while (true);

                    otherlv_22=(Token)match(input,22,FollowSets000.FOLLOW_22_in_ruleAnnotation1502); 

                        	newLeafNode(otherlv_22, grammarAccess.getAnnotationAccess().getRightCurlyBracketKeyword_6_4());
                        

                    }
                    break;

            }

            // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:803:3: (otherlv_23= 'contents' otherlv_24= '{' ( (lv_contents_25_0= ruleEObject ) ) (otherlv_26= ',' ( (lv_contents_27_0= ruleEObject ) ) )* otherlv_28= '}' )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==34) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:803:5: otherlv_23= 'contents' otherlv_24= '{' ( (lv_contents_25_0= ruleEObject ) ) (otherlv_26= ',' ( (lv_contents_27_0= ruleEObject ) ) )* otherlv_28= '}'
                    {
                    otherlv_23=(Token)match(input,34,FollowSets000.FOLLOW_34_in_ruleAnnotation1517); 

                        	newLeafNode(otherlv_23, grammarAccess.getAnnotationAccess().getContentsKeyword_7_0());
                        
                    otherlv_24=(Token)match(input,21,FollowSets000.FOLLOW_21_in_ruleAnnotation1529); 

                        	newLeafNode(otherlv_24, grammarAccess.getAnnotationAccess().getLeftCurlyBracketKeyword_7_1());
                        
                    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:811:1: ( (lv_contents_25_0= ruleEObject ) )
                    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:812:1: (lv_contents_25_0= ruleEObject )
                    {
                    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:812:1: (lv_contents_25_0= ruleEObject )
                    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:813:3: lv_contents_25_0= ruleEObject
                    {
                     
                    	        newCompositeNode(grammarAccess.getAnnotationAccess().getContentsEObjectParserRuleCall_7_2_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEObject_in_ruleAnnotation1550);
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

                    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:829:2: (otherlv_26= ',' ( (lv_contents_27_0= ruleEObject ) ) )*
                    loop28:
                    do {
                        int alt28=2;
                        int LA28_0 = input.LA(1);

                        if ( (LA28_0==17) ) {
                            alt28=1;
                        }


                        switch (alt28) {
                    	case 1 :
                    	    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:829:4: otherlv_26= ',' ( (lv_contents_27_0= ruleEObject ) )
                    	    {
                    	    otherlv_26=(Token)match(input,17,FollowSets000.FOLLOW_17_in_ruleAnnotation1563); 

                    	        	newLeafNode(otherlv_26, grammarAccess.getAnnotationAccess().getCommaKeyword_7_3_0());
                    	        
                    	    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:833:1: ( (lv_contents_27_0= ruleEObject ) )
                    	    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:834:1: (lv_contents_27_0= ruleEObject )
                    	    {
                    	    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:834:1: (lv_contents_27_0= ruleEObject )
                    	    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:835:3: lv_contents_27_0= ruleEObject
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getAnnotationAccess().getContentsEObjectParserRuleCall_7_3_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleEObject_in_ruleAnnotation1584);
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
                    	    break loop28;
                        }
                    } while (true);

                    otherlv_28=(Token)match(input,22,FollowSets000.FOLLOW_22_in_ruleAnnotation1598); 

                        	newLeafNode(otherlv_28, grammarAccess.getAnnotationAccess().getRightCurlyBracketKeyword_7_4());
                        

                    }
                    break;

            }

            otherlv_29=(Token)match(input,22,FollowSets000.FOLLOW_22_in_ruleAnnotation1612); 

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
    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:867:1: entryRuleStringToAttributeMapEntry returns [EObject current=null] : iv_ruleStringToAttributeMapEntry= ruleStringToAttributeMapEntry EOF ;
    public final EObject entryRuleStringToAttributeMapEntry() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStringToAttributeMapEntry = null;


        try {
            // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:868:2: (iv_ruleStringToAttributeMapEntry= ruleStringToAttributeMapEntry EOF )
            // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:869:2: iv_ruleStringToAttributeMapEntry= ruleStringToAttributeMapEntry EOF
            {
             newCompositeNode(grammarAccess.getStringToAttributeMapEntryRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleStringToAttributeMapEntry_in_entryRuleStringToAttributeMapEntry1648);
            iv_ruleStringToAttributeMapEntry=ruleStringToAttributeMapEntry();

            state._fsp--;

             current =iv_ruleStringToAttributeMapEntry; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleStringToAttributeMapEntry1658); 

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
    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:876:1: ruleStringToAttributeMapEntry returns [EObject current=null] : (otherlv_0= 'StringToAttributeMapEntry' otherlv_1= '{' otherlv_2= 'key' ( (lv_key_3_0= ruleEString ) ) (otherlv_4= 'value' ( (lv_value_5_0= ruleAttribute ) ) )? otherlv_6= '}' ) ;
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
            // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:879:28: ( (otherlv_0= 'StringToAttributeMapEntry' otherlv_1= '{' otherlv_2= 'key' ( (lv_key_3_0= ruleEString ) ) (otherlv_4= 'value' ( (lv_value_5_0= ruleAttribute ) ) )? otherlv_6= '}' ) )
            // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:880:1: (otherlv_0= 'StringToAttributeMapEntry' otherlv_1= '{' otherlv_2= 'key' ( (lv_key_3_0= ruleEString ) ) (otherlv_4= 'value' ( (lv_value_5_0= ruleAttribute ) ) )? otherlv_6= '}' )
            {
            // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:880:1: (otherlv_0= 'StringToAttributeMapEntry' otherlv_1= '{' otherlv_2= 'key' ( (lv_key_3_0= ruleEString ) ) (otherlv_4= 'value' ( (lv_value_5_0= ruleAttribute ) ) )? otherlv_6= '}' )
            // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:880:3: otherlv_0= 'StringToAttributeMapEntry' otherlv_1= '{' otherlv_2= 'key' ( (lv_key_3_0= ruleEString ) ) (otherlv_4= 'value' ( (lv_value_5_0= ruleAttribute ) ) )? otherlv_6= '}'
            {
            otherlv_0=(Token)match(input,35,FollowSets000.FOLLOW_35_in_ruleStringToAttributeMapEntry1695); 

                	newLeafNode(otherlv_0, grammarAccess.getStringToAttributeMapEntryAccess().getStringToAttributeMapEntryKeyword_0());
                
            otherlv_1=(Token)match(input,21,FollowSets000.FOLLOW_21_in_ruleStringToAttributeMapEntry1707); 

                	newLeafNode(otherlv_1, grammarAccess.getStringToAttributeMapEntryAccess().getLeftCurlyBracketKeyword_1());
                
            otherlv_2=(Token)match(input,36,FollowSets000.FOLLOW_36_in_ruleStringToAttributeMapEntry1719); 

                	newLeafNode(otherlv_2, grammarAccess.getStringToAttributeMapEntryAccess().getKeyKeyword_2());
                
            // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:892:1: ( (lv_key_3_0= ruleEString ) )
            // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:893:1: (lv_key_3_0= ruleEString )
            {
            // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:893:1: (lv_key_3_0= ruleEString )
            // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:894:3: lv_key_3_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getStringToAttributeMapEntryAccess().getKeyEStringParserRuleCall_3_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleStringToAttributeMapEntry1740);
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

            // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:910:2: (otherlv_4= 'value' ( (lv_value_5_0= ruleAttribute ) ) )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==37) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:910:4: otherlv_4= 'value' ( (lv_value_5_0= ruleAttribute ) )
                    {
                    otherlv_4=(Token)match(input,37,FollowSets000.FOLLOW_37_in_ruleStringToAttributeMapEntry1753); 

                        	newLeafNode(otherlv_4, grammarAccess.getStringToAttributeMapEntryAccess().getValueKeyword_4_0());
                        
                    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:914:1: ( (lv_value_5_0= ruleAttribute ) )
                    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:915:1: (lv_value_5_0= ruleAttribute )
                    {
                    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:915:1: (lv_value_5_0= ruleAttribute )
                    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:916:3: lv_value_5_0= ruleAttribute
                    {
                     
                    	        newCompositeNode(grammarAccess.getStringToAttributeMapEntryAccess().getValueAttributeParserRuleCall_4_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleAttribute_in_ruleStringToAttributeMapEntry1774);
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

            otherlv_6=(Token)match(input,22,FollowSets000.FOLLOW_22_in_ruleStringToAttributeMapEntry1788); 

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
    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:946:1: entryRuleEString returns [String current=null] : iv_ruleEString= ruleEString EOF ;
    public final String entryRuleEString() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEString = null;


        try {
            // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:947:2: (iv_ruleEString= ruleEString EOF )
            // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:948:2: iv_ruleEString= ruleEString EOF
            {
             newCompositeNode(grammarAccess.getEStringRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_entryRuleEString1827);
            iv_ruleEString=ruleEString();

            state._fsp--;

             current =iv_ruleEString.getText(); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleEString1838); 

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
    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:955:1: ruleEString returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) ;
    public final AntlrDatatypeRuleToken ruleEString() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;
        Token this_ID_1=null;

         enterRule(); 
            
        try {
            // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:958:28: ( (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) )
            // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:959:1: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            {
            // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:959:1: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==RULE_STRING) ) {
                alt31=1;
            }
            else if ( (LA31_0==RULE_ID) ) {
                alt31=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 31, 0, input);

                throw nvae;
            }
            switch (alt31) {
                case 1 :
                    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:959:6: this_STRING_0= RULE_STRING
                    {
                    this_STRING_0=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_RULE_STRING_in_ruleEString1878); 

                    		current.merge(this_STRING_0);
                        
                     
                        newLeafNode(this_STRING_0, grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 
                        

                    }
                    break;
                case 2 :
                    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:967:10: this_ID_1= RULE_ID
                    {
                    this_ID_1=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleEString1904); 

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
    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:984:1: entryRuleVariable returns [EObject current=null] : iv_ruleVariable= ruleVariable EOF ;
    public final EObject entryRuleVariable() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVariable = null;


        try {
            // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:985:2: (iv_ruleVariable= ruleVariable EOF )
            // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:986:2: iv_ruleVariable= ruleVariable EOF
            {
             newCompositeNode(grammarAccess.getVariableRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleVariable_in_entryRuleVariable1951);
            iv_ruleVariable=ruleVariable();

            state._fsp--;

             current =iv_ruleVariable; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleVariable1961); 

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
    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:993:1: ruleVariable returns [EObject current=null] : ( () ( (lv_localGenerated_1_0= 'localGenerated' ) )? otherlv_2= 'Variable' ( (lv_name_3_0= ruleEString ) ) (otherlv_4= 'internalId' ( (lv_internalId_5_0= ruleEString ) ) )? (otherlv_6= 'comment' ( (lv_comment_7_0= ruleEString ) ) )? (otherlv_8= 'annotations' otherlv_9= '{' ( (lv_annotations_10_0= ruleAnnotation ) ) (otherlv_11= ',' ( (lv_annotations_12_0= ruleAnnotation ) ) )* otherlv_13= '}' )? (otherlv_14= 'extensions' otherlv_15= '{' ( (lv_extensions_16_0= ruleAbstractExtension ) ) (otherlv_17= ',' ( (lv_extensions_18_0= ruleAbstractExtension ) ) )* otherlv_19= '}' )? (otherlv_20= 'attributes' otherlv_21= '{' ( (lv_attributes_22_0= ruleStringToAttributeMapEntry ) ) (otherlv_23= ',' ( (lv_attributes_24_0= ruleStringToAttributeMapEntry ) ) )* otherlv_25= '}' )? ) ;
    public final EObject ruleVariable() throws RecognitionException {
        EObject current = null;

        Token lv_localGenerated_1_0=null;
        Token otherlv_2=null;
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
        Token otherlv_21=null;
        Token otherlv_23=null;
        Token otherlv_25=null;
        AntlrDatatypeRuleToken lv_name_3_0 = null;

        AntlrDatatypeRuleToken lv_internalId_5_0 = null;

        AntlrDatatypeRuleToken lv_comment_7_0 = null;

        EObject lv_annotations_10_0 = null;

        EObject lv_annotations_12_0 = null;

        EObject lv_extensions_16_0 = null;

        EObject lv_extensions_18_0 = null;

        EObject lv_attributes_22_0 = null;

        EObject lv_attributes_24_0 = null;


         enterRule(); 
            
        try {
            // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:996:28: ( ( () ( (lv_localGenerated_1_0= 'localGenerated' ) )? otherlv_2= 'Variable' ( (lv_name_3_0= ruleEString ) ) (otherlv_4= 'internalId' ( (lv_internalId_5_0= ruleEString ) ) )? (otherlv_6= 'comment' ( (lv_comment_7_0= ruleEString ) ) )? (otherlv_8= 'annotations' otherlv_9= '{' ( (lv_annotations_10_0= ruleAnnotation ) ) (otherlv_11= ',' ( (lv_annotations_12_0= ruleAnnotation ) ) )* otherlv_13= '}' )? (otherlv_14= 'extensions' otherlv_15= '{' ( (lv_extensions_16_0= ruleAbstractExtension ) ) (otherlv_17= ',' ( (lv_extensions_18_0= ruleAbstractExtension ) ) )* otherlv_19= '}' )? (otherlv_20= 'attributes' otherlv_21= '{' ( (lv_attributes_22_0= ruleStringToAttributeMapEntry ) ) (otherlv_23= ',' ( (lv_attributes_24_0= ruleStringToAttributeMapEntry ) ) )* otherlv_25= '}' )? ) )
            // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:997:1: ( () ( (lv_localGenerated_1_0= 'localGenerated' ) )? otherlv_2= 'Variable' ( (lv_name_3_0= ruleEString ) ) (otherlv_4= 'internalId' ( (lv_internalId_5_0= ruleEString ) ) )? (otherlv_6= 'comment' ( (lv_comment_7_0= ruleEString ) ) )? (otherlv_8= 'annotations' otherlv_9= '{' ( (lv_annotations_10_0= ruleAnnotation ) ) (otherlv_11= ',' ( (lv_annotations_12_0= ruleAnnotation ) ) )* otherlv_13= '}' )? (otherlv_14= 'extensions' otherlv_15= '{' ( (lv_extensions_16_0= ruleAbstractExtension ) ) (otherlv_17= ',' ( (lv_extensions_18_0= ruleAbstractExtension ) ) )* otherlv_19= '}' )? (otherlv_20= 'attributes' otherlv_21= '{' ( (lv_attributes_22_0= ruleStringToAttributeMapEntry ) ) (otherlv_23= ',' ( (lv_attributes_24_0= ruleStringToAttributeMapEntry ) ) )* otherlv_25= '}' )? )
            {
            // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:997:1: ( () ( (lv_localGenerated_1_0= 'localGenerated' ) )? otherlv_2= 'Variable' ( (lv_name_3_0= ruleEString ) ) (otherlv_4= 'internalId' ( (lv_internalId_5_0= ruleEString ) ) )? (otherlv_6= 'comment' ( (lv_comment_7_0= ruleEString ) ) )? (otherlv_8= 'annotations' otherlv_9= '{' ( (lv_annotations_10_0= ruleAnnotation ) ) (otherlv_11= ',' ( (lv_annotations_12_0= ruleAnnotation ) ) )* otherlv_13= '}' )? (otherlv_14= 'extensions' otherlv_15= '{' ( (lv_extensions_16_0= ruleAbstractExtension ) ) (otherlv_17= ',' ( (lv_extensions_18_0= ruleAbstractExtension ) ) )* otherlv_19= '}' )? (otherlv_20= 'attributes' otherlv_21= '{' ( (lv_attributes_22_0= ruleStringToAttributeMapEntry ) ) (otherlv_23= ',' ( (lv_attributes_24_0= ruleStringToAttributeMapEntry ) ) )* otherlv_25= '}' )? )
            // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:997:2: () ( (lv_localGenerated_1_0= 'localGenerated' ) )? otherlv_2= 'Variable' ( (lv_name_3_0= ruleEString ) ) (otherlv_4= 'internalId' ( (lv_internalId_5_0= ruleEString ) ) )? (otherlv_6= 'comment' ( (lv_comment_7_0= ruleEString ) ) )? (otherlv_8= 'annotations' otherlv_9= '{' ( (lv_annotations_10_0= ruleAnnotation ) ) (otherlv_11= ',' ( (lv_annotations_12_0= ruleAnnotation ) ) )* otherlv_13= '}' )? (otherlv_14= 'extensions' otherlv_15= '{' ( (lv_extensions_16_0= ruleAbstractExtension ) ) (otherlv_17= ',' ( (lv_extensions_18_0= ruleAbstractExtension ) ) )* otherlv_19= '}' )? (otherlv_20= 'attributes' otherlv_21= '{' ( (lv_attributes_22_0= ruleStringToAttributeMapEntry ) ) (otherlv_23= ',' ( (lv_attributes_24_0= ruleStringToAttributeMapEntry ) ) )* otherlv_25= '}' )?
            {
            // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:997:2: ()
            // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:998:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getVariableAccess().getVariableAction_0(),
                        current);
                

            }

            // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:1003:2: ( (lv_localGenerated_1_0= 'localGenerated' ) )?
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==11) ) {
                alt32=1;
            }
            switch (alt32) {
                case 1 :
                    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:1004:1: (lv_localGenerated_1_0= 'localGenerated' )
                    {
                    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:1004:1: (lv_localGenerated_1_0= 'localGenerated' )
                    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:1005:3: lv_localGenerated_1_0= 'localGenerated'
                    {
                    lv_localGenerated_1_0=(Token)match(input,11,FollowSets000.FOLLOW_11_in_ruleVariable2013); 

                            newLeafNode(lv_localGenerated_1_0, grammarAccess.getVariableAccess().getLocalGeneratedLocalGeneratedKeyword_1_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getVariableRule());
                    	        }
                           		setWithLastConsumed(current, "localGenerated", true, "localGenerated");
                    	    

                    }


                    }
                    break;

            }

            otherlv_2=(Token)match(input,38,FollowSets000.FOLLOW_38_in_ruleVariable2039); 

                	newLeafNode(otherlv_2, grammarAccess.getVariableAccess().getVariableKeyword_2());
                
            // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:1022:1: ( (lv_name_3_0= ruleEString ) )
            // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:1023:1: (lv_name_3_0= ruleEString )
            {
            // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:1023:1: (lv_name_3_0= ruleEString )
            // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:1024:3: lv_name_3_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getVariableAccess().getNameEStringParserRuleCall_3_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleVariable2060);
            lv_name_3_0=ruleEString();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getVariableRule());
            	        }
                   		set(
                   			current, 
                   			"name",
                    		lv_name_3_0, 
                    		"EString");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:1040:2: (otherlv_4= 'internalId' ( (lv_internalId_5_0= ruleEString ) ) )?
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==13) ) {
                alt33=1;
            }
            switch (alt33) {
                case 1 :
                    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:1040:4: otherlv_4= 'internalId' ( (lv_internalId_5_0= ruleEString ) )
                    {
                    otherlv_4=(Token)match(input,13,FollowSets000.FOLLOW_13_in_ruleVariable2073); 

                        	newLeafNode(otherlv_4, grammarAccess.getVariableAccess().getInternalIdKeyword_4_0());
                        
                    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:1044:1: ( (lv_internalId_5_0= ruleEString ) )
                    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:1045:1: (lv_internalId_5_0= ruleEString )
                    {
                    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:1045:1: (lv_internalId_5_0= ruleEString )
                    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:1046:3: lv_internalId_5_0= ruleEString
                    {
                     
                    	        newCompositeNode(grammarAccess.getVariableAccess().getInternalIdEStringParserRuleCall_4_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleVariable2094);
                    lv_internalId_5_0=ruleEString();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getVariableRule());
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

            // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:1062:4: (otherlv_6= 'comment' ( (lv_comment_7_0= ruleEString ) ) )?
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( (LA34_0==39) ) {
                alt34=1;
            }
            switch (alt34) {
                case 1 :
                    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:1062:6: otherlv_6= 'comment' ( (lv_comment_7_0= ruleEString ) )
                    {
                    otherlv_6=(Token)match(input,39,FollowSets000.FOLLOW_39_in_ruleVariable2109); 

                        	newLeafNode(otherlv_6, grammarAccess.getVariableAccess().getCommentKeyword_5_0());
                        
                    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:1066:1: ( (lv_comment_7_0= ruleEString ) )
                    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:1067:1: (lv_comment_7_0= ruleEString )
                    {
                    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:1067:1: (lv_comment_7_0= ruleEString )
                    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:1068:3: lv_comment_7_0= ruleEString
                    {
                     
                    	        newCompositeNode(grammarAccess.getVariableAccess().getCommentEStringParserRuleCall_5_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleVariable2130);
                    lv_comment_7_0=ruleEString();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getVariableRule());
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

            // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:1084:4: (otherlv_8= 'annotations' otherlv_9= '{' ( (lv_annotations_10_0= ruleAnnotation ) ) (otherlv_11= ',' ( (lv_annotations_12_0= ruleAnnotation ) ) )* otherlv_13= '}' )?
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( (LA36_0==20) ) {
                alt36=1;
            }
            switch (alt36) {
                case 1 :
                    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:1084:6: otherlv_8= 'annotations' otherlv_9= '{' ( (lv_annotations_10_0= ruleAnnotation ) ) (otherlv_11= ',' ( (lv_annotations_12_0= ruleAnnotation ) ) )* otherlv_13= '}'
                    {
                    otherlv_8=(Token)match(input,20,FollowSets000.FOLLOW_20_in_ruleVariable2145); 

                        	newLeafNode(otherlv_8, grammarAccess.getVariableAccess().getAnnotationsKeyword_6_0());
                        
                    otherlv_9=(Token)match(input,21,FollowSets000.FOLLOW_21_in_ruleVariable2157); 

                        	newLeafNode(otherlv_9, grammarAccess.getVariableAccess().getLeftCurlyBracketKeyword_6_1());
                        
                    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:1092:1: ( (lv_annotations_10_0= ruleAnnotation ) )
                    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:1093:1: (lv_annotations_10_0= ruleAnnotation )
                    {
                    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:1093:1: (lv_annotations_10_0= ruleAnnotation )
                    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:1094:3: lv_annotations_10_0= ruleAnnotation
                    {
                     
                    	        newCompositeNode(grammarAccess.getVariableAccess().getAnnotationsAnnotationParserRuleCall_6_2_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleAnnotation_in_ruleVariable2178);
                    lv_annotations_10_0=ruleAnnotation();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getVariableRule());
                    	        }
                           		add(
                           			current, 
                           			"annotations",
                            		lv_annotations_10_0, 
                            		"Annotation");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:1110:2: (otherlv_11= ',' ( (lv_annotations_12_0= ruleAnnotation ) ) )*
                    loop35:
                    do {
                        int alt35=2;
                        int LA35_0 = input.LA(1);

                        if ( (LA35_0==17) ) {
                            alt35=1;
                        }


                        switch (alt35) {
                    	case 1 :
                    	    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:1110:4: otherlv_11= ',' ( (lv_annotations_12_0= ruleAnnotation ) )
                    	    {
                    	    otherlv_11=(Token)match(input,17,FollowSets000.FOLLOW_17_in_ruleVariable2191); 

                    	        	newLeafNode(otherlv_11, grammarAccess.getVariableAccess().getCommaKeyword_6_3_0());
                    	        
                    	    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:1114:1: ( (lv_annotations_12_0= ruleAnnotation ) )
                    	    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:1115:1: (lv_annotations_12_0= ruleAnnotation )
                    	    {
                    	    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:1115:1: (lv_annotations_12_0= ruleAnnotation )
                    	    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:1116:3: lv_annotations_12_0= ruleAnnotation
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getVariableAccess().getAnnotationsAnnotationParserRuleCall_6_3_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleAnnotation_in_ruleVariable2212);
                    	    lv_annotations_12_0=ruleAnnotation();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getVariableRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"annotations",
                    	            		lv_annotations_12_0, 
                    	            		"Annotation");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop35;
                        }
                    } while (true);

                    otherlv_13=(Token)match(input,22,FollowSets000.FOLLOW_22_in_ruleVariable2226); 

                        	newLeafNode(otherlv_13, grammarAccess.getVariableAccess().getRightCurlyBracketKeyword_6_4());
                        

                    }
                    break;

            }

            // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:1136:3: (otherlv_14= 'extensions' otherlv_15= '{' ( (lv_extensions_16_0= ruleAbstractExtension ) ) (otherlv_17= ',' ( (lv_extensions_18_0= ruleAbstractExtension ) ) )* otherlv_19= '}' )?
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( (LA38_0==23) ) {
                alt38=1;
            }
            switch (alt38) {
                case 1 :
                    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:1136:5: otherlv_14= 'extensions' otherlv_15= '{' ( (lv_extensions_16_0= ruleAbstractExtension ) ) (otherlv_17= ',' ( (lv_extensions_18_0= ruleAbstractExtension ) ) )* otherlv_19= '}'
                    {
                    otherlv_14=(Token)match(input,23,FollowSets000.FOLLOW_23_in_ruleVariable2241); 

                        	newLeafNode(otherlv_14, grammarAccess.getVariableAccess().getExtensionsKeyword_7_0());
                        
                    otherlv_15=(Token)match(input,21,FollowSets000.FOLLOW_21_in_ruleVariable2253); 

                        	newLeafNode(otherlv_15, grammarAccess.getVariableAccess().getLeftCurlyBracketKeyword_7_1());
                        
                    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:1144:1: ( (lv_extensions_16_0= ruleAbstractExtension ) )
                    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:1145:1: (lv_extensions_16_0= ruleAbstractExtension )
                    {
                    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:1145:1: (lv_extensions_16_0= ruleAbstractExtension )
                    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:1146:3: lv_extensions_16_0= ruleAbstractExtension
                    {
                     
                    	        newCompositeNode(grammarAccess.getVariableAccess().getExtensionsAbstractExtensionParserRuleCall_7_2_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleAbstractExtension_in_ruleVariable2274);
                    lv_extensions_16_0=ruleAbstractExtension();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getVariableRule());
                    	        }
                           		add(
                           			current, 
                           			"extensions",
                            		lv_extensions_16_0, 
                            		"AbstractExtension");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:1162:2: (otherlv_17= ',' ( (lv_extensions_18_0= ruleAbstractExtension ) ) )*
                    loop37:
                    do {
                        int alt37=2;
                        int LA37_0 = input.LA(1);

                        if ( (LA37_0==17) ) {
                            alt37=1;
                        }


                        switch (alt37) {
                    	case 1 :
                    	    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:1162:4: otherlv_17= ',' ( (lv_extensions_18_0= ruleAbstractExtension ) )
                    	    {
                    	    otherlv_17=(Token)match(input,17,FollowSets000.FOLLOW_17_in_ruleVariable2287); 

                    	        	newLeafNode(otherlv_17, grammarAccess.getVariableAccess().getCommaKeyword_7_3_0());
                    	        
                    	    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:1166:1: ( (lv_extensions_18_0= ruleAbstractExtension ) )
                    	    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:1167:1: (lv_extensions_18_0= ruleAbstractExtension )
                    	    {
                    	    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:1167:1: (lv_extensions_18_0= ruleAbstractExtension )
                    	    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:1168:3: lv_extensions_18_0= ruleAbstractExtension
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getVariableAccess().getExtensionsAbstractExtensionParserRuleCall_7_3_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleAbstractExtension_in_ruleVariable2308);
                    	    lv_extensions_18_0=ruleAbstractExtension();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getVariableRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"extensions",
                    	            		lv_extensions_18_0, 
                    	            		"AbstractExtension");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop37;
                        }
                    } while (true);

                    otherlv_19=(Token)match(input,22,FollowSets000.FOLLOW_22_in_ruleVariable2322); 

                        	newLeafNode(otherlv_19, grammarAccess.getVariableAccess().getRightCurlyBracketKeyword_7_4());
                        

                    }
                    break;

            }

            // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:1188:3: (otherlv_20= 'attributes' otherlv_21= '{' ( (lv_attributes_22_0= ruleStringToAttributeMapEntry ) ) (otherlv_23= ',' ( (lv_attributes_24_0= ruleStringToAttributeMapEntry ) ) )* otherlv_25= '}' )?
            int alt40=2;
            int LA40_0 = input.LA(1);

            if ( (LA40_0==24) ) {
                alt40=1;
            }
            switch (alt40) {
                case 1 :
                    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:1188:5: otherlv_20= 'attributes' otherlv_21= '{' ( (lv_attributes_22_0= ruleStringToAttributeMapEntry ) ) (otherlv_23= ',' ( (lv_attributes_24_0= ruleStringToAttributeMapEntry ) ) )* otherlv_25= '}'
                    {
                    otherlv_20=(Token)match(input,24,FollowSets000.FOLLOW_24_in_ruleVariable2337); 

                        	newLeafNode(otherlv_20, grammarAccess.getVariableAccess().getAttributesKeyword_8_0());
                        
                    otherlv_21=(Token)match(input,21,FollowSets000.FOLLOW_21_in_ruleVariable2349); 

                        	newLeafNode(otherlv_21, grammarAccess.getVariableAccess().getLeftCurlyBracketKeyword_8_1());
                        
                    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:1196:1: ( (lv_attributes_22_0= ruleStringToAttributeMapEntry ) )
                    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:1197:1: (lv_attributes_22_0= ruleStringToAttributeMapEntry )
                    {
                    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:1197:1: (lv_attributes_22_0= ruleStringToAttributeMapEntry )
                    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:1198:3: lv_attributes_22_0= ruleStringToAttributeMapEntry
                    {
                     
                    	        newCompositeNode(grammarAccess.getVariableAccess().getAttributesStringToAttributeMapEntryParserRuleCall_8_2_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleStringToAttributeMapEntry_in_ruleVariable2370);
                    lv_attributes_22_0=ruleStringToAttributeMapEntry();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getVariableRule());
                    	        }
                           		add(
                           			current, 
                           			"attributes",
                            		lv_attributes_22_0, 
                            		"StringToAttributeMapEntry");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:1214:2: (otherlv_23= ',' ( (lv_attributes_24_0= ruleStringToAttributeMapEntry ) ) )*
                    loop39:
                    do {
                        int alt39=2;
                        int LA39_0 = input.LA(1);

                        if ( (LA39_0==17) ) {
                            alt39=1;
                        }


                        switch (alt39) {
                    	case 1 :
                    	    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:1214:4: otherlv_23= ',' ( (lv_attributes_24_0= ruleStringToAttributeMapEntry ) )
                    	    {
                    	    otherlv_23=(Token)match(input,17,FollowSets000.FOLLOW_17_in_ruleVariable2383); 

                    	        	newLeafNode(otherlv_23, grammarAccess.getVariableAccess().getCommaKeyword_8_3_0());
                    	        
                    	    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:1218:1: ( (lv_attributes_24_0= ruleStringToAttributeMapEntry ) )
                    	    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:1219:1: (lv_attributes_24_0= ruleStringToAttributeMapEntry )
                    	    {
                    	    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:1219:1: (lv_attributes_24_0= ruleStringToAttributeMapEntry )
                    	    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:1220:3: lv_attributes_24_0= ruleStringToAttributeMapEntry
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getVariableAccess().getAttributesStringToAttributeMapEntryParserRuleCall_8_3_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleStringToAttributeMapEntry_in_ruleVariable2404);
                    	    lv_attributes_24_0=ruleStringToAttributeMapEntry();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getVariableRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"attributes",
                    	            		lv_attributes_24_0, 
                    	            		"StringToAttributeMapEntry");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop39;
                        }
                    } while (true);

                    otherlv_25=(Token)match(input,22,FollowSets000.FOLLOW_22_in_ruleVariable2418); 

                        	newLeafNode(otherlv_25, grammarAccess.getVariableAccess().getRightCurlyBracketKeyword_8_4());
                        

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
    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:1248:1: entryRuleInvariant returns [EObject current=null] : iv_ruleInvariant= ruleInvariant EOF ;
    public final EObject entryRuleInvariant() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInvariant = null;


        try {
            // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:1249:2: (iv_ruleInvariant= ruleInvariant EOF )
            // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:1250:2: iv_ruleInvariant= ruleInvariant EOF
            {
             newCompositeNode(grammarAccess.getInvariantRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleInvariant_in_entryRuleInvariant2456);
            iv_ruleInvariant=ruleInvariant();

            state._fsp--;

             current =iv_ruleInvariant; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleInvariant2466); 

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
    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:1257:1: ruleInvariant returns [EObject current=null] : (otherlv_0= 'Invariant' ( (lv_name_1_0= ruleEString ) ) ( (lv_localGenerated_2_0= 'localGenerated' ) )? ( (lv_theorem_3_0= 'theorem' ) )? otherlv_4= 'notTheorem' (otherlv_5= 'internalId' ( (lv_internalId_6_0= ruleEString ) ) )? (otherlv_7= 'comment' ( (lv_comment_8_0= ruleEString ) ) )? otherlv_9= 'Predicate' ( (lv_predicate_10_0= ruleEString ) ) (otherlv_11= 'annotations' otherlv_12= '{' ( (lv_annotations_13_0= ruleAnnotation ) ) (otherlv_14= ',' ( (lv_annotations_15_0= ruleAnnotation ) ) )* otherlv_16= '}' )? (otherlv_17= 'extensions' otherlv_18= '{' ( (lv_extensions_19_0= ruleAbstractExtension ) ) (otherlv_20= ',' ( (lv_extensions_21_0= ruleAbstractExtension ) ) )* otherlv_22= '}' )? (otherlv_23= 'attributes' otherlv_24= '{' ( (lv_attributes_25_0= ruleStringToAttributeMapEntry ) ) (otherlv_26= ',' ( (lv_attributes_27_0= ruleStringToAttributeMapEntry ) ) )* otherlv_28= '}' )? ) ;
    public final EObject ruleInvariant() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_localGenerated_2_0=null;
        Token lv_theorem_3_0=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
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
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        AntlrDatatypeRuleToken lv_internalId_6_0 = null;

        AntlrDatatypeRuleToken lv_comment_8_0 = null;

        AntlrDatatypeRuleToken lv_predicate_10_0 = null;

        EObject lv_annotations_13_0 = null;

        EObject lv_annotations_15_0 = null;

        EObject lv_extensions_19_0 = null;

        EObject lv_extensions_21_0 = null;

        EObject lv_attributes_25_0 = null;

        EObject lv_attributes_27_0 = null;


         enterRule(); 
            
        try {
            // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:1260:28: ( (otherlv_0= 'Invariant' ( (lv_name_1_0= ruleEString ) ) ( (lv_localGenerated_2_0= 'localGenerated' ) )? ( (lv_theorem_3_0= 'theorem' ) )? otherlv_4= 'notTheorem' (otherlv_5= 'internalId' ( (lv_internalId_6_0= ruleEString ) ) )? (otherlv_7= 'comment' ( (lv_comment_8_0= ruleEString ) ) )? otherlv_9= 'Predicate' ( (lv_predicate_10_0= ruleEString ) ) (otherlv_11= 'annotations' otherlv_12= '{' ( (lv_annotations_13_0= ruleAnnotation ) ) (otherlv_14= ',' ( (lv_annotations_15_0= ruleAnnotation ) ) )* otherlv_16= '}' )? (otherlv_17= 'extensions' otherlv_18= '{' ( (lv_extensions_19_0= ruleAbstractExtension ) ) (otherlv_20= ',' ( (lv_extensions_21_0= ruleAbstractExtension ) ) )* otherlv_22= '}' )? (otherlv_23= 'attributes' otherlv_24= '{' ( (lv_attributes_25_0= ruleStringToAttributeMapEntry ) ) (otherlv_26= ',' ( (lv_attributes_27_0= ruleStringToAttributeMapEntry ) ) )* otherlv_28= '}' )? ) )
            // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:1261:1: (otherlv_0= 'Invariant' ( (lv_name_1_0= ruleEString ) ) ( (lv_localGenerated_2_0= 'localGenerated' ) )? ( (lv_theorem_3_0= 'theorem' ) )? otherlv_4= 'notTheorem' (otherlv_5= 'internalId' ( (lv_internalId_6_0= ruleEString ) ) )? (otherlv_7= 'comment' ( (lv_comment_8_0= ruleEString ) ) )? otherlv_9= 'Predicate' ( (lv_predicate_10_0= ruleEString ) ) (otherlv_11= 'annotations' otherlv_12= '{' ( (lv_annotations_13_0= ruleAnnotation ) ) (otherlv_14= ',' ( (lv_annotations_15_0= ruleAnnotation ) ) )* otherlv_16= '}' )? (otherlv_17= 'extensions' otherlv_18= '{' ( (lv_extensions_19_0= ruleAbstractExtension ) ) (otherlv_20= ',' ( (lv_extensions_21_0= ruleAbstractExtension ) ) )* otherlv_22= '}' )? (otherlv_23= 'attributes' otherlv_24= '{' ( (lv_attributes_25_0= ruleStringToAttributeMapEntry ) ) (otherlv_26= ',' ( (lv_attributes_27_0= ruleStringToAttributeMapEntry ) ) )* otherlv_28= '}' )? )
            {
            // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:1261:1: (otherlv_0= 'Invariant' ( (lv_name_1_0= ruleEString ) ) ( (lv_localGenerated_2_0= 'localGenerated' ) )? ( (lv_theorem_3_0= 'theorem' ) )? otherlv_4= 'notTheorem' (otherlv_5= 'internalId' ( (lv_internalId_6_0= ruleEString ) ) )? (otherlv_7= 'comment' ( (lv_comment_8_0= ruleEString ) ) )? otherlv_9= 'Predicate' ( (lv_predicate_10_0= ruleEString ) ) (otherlv_11= 'annotations' otherlv_12= '{' ( (lv_annotations_13_0= ruleAnnotation ) ) (otherlv_14= ',' ( (lv_annotations_15_0= ruleAnnotation ) ) )* otherlv_16= '}' )? (otherlv_17= 'extensions' otherlv_18= '{' ( (lv_extensions_19_0= ruleAbstractExtension ) ) (otherlv_20= ',' ( (lv_extensions_21_0= ruleAbstractExtension ) ) )* otherlv_22= '}' )? (otherlv_23= 'attributes' otherlv_24= '{' ( (lv_attributes_25_0= ruleStringToAttributeMapEntry ) ) (otherlv_26= ',' ( (lv_attributes_27_0= ruleStringToAttributeMapEntry ) ) )* otherlv_28= '}' )? )
            // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:1261:3: otherlv_0= 'Invariant' ( (lv_name_1_0= ruleEString ) ) ( (lv_localGenerated_2_0= 'localGenerated' ) )? ( (lv_theorem_3_0= 'theorem' ) )? otherlv_4= 'notTheorem' (otherlv_5= 'internalId' ( (lv_internalId_6_0= ruleEString ) ) )? (otherlv_7= 'comment' ( (lv_comment_8_0= ruleEString ) ) )? otherlv_9= 'Predicate' ( (lv_predicate_10_0= ruleEString ) ) (otherlv_11= 'annotations' otherlv_12= '{' ( (lv_annotations_13_0= ruleAnnotation ) ) (otherlv_14= ',' ( (lv_annotations_15_0= ruleAnnotation ) ) )* otherlv_16= '}' )? (otherlv_17= 'extensions' otherlv_18= '{' ( (lv_extensions_19_0= ruleAbstractExtension ) ) (otherlv_20= ',' ( (lv_extensions_21_0= ruleAbstractExtension ) ) )* otherlv_22= '}' )? (otherlv_23= 'attributes' otherlv_24= '{' ( (lv_attributes_25_0= ruleStringToAttributeMapEntry ) ) (otherlv_26= ',' ( (lv_attributes_27_0= ruleStringToAttributeMapEntry ) ) )* otherlv_28= '}' )?
            {
            otherlv_0=(Token)match(input,40,FollowSets000.FOLLOW_40_in_ruleInvariant2503); 

                	newLeafNode(otherlv_0, grammarAccess.getInvariantAccess().getInvariantKeyword_0());
                
            // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:1265:1: ( (lv_name_1_0= ruleEString ) )
            // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:1266:1: (lv_name_1_0= ruleEString )
            {
            // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:1266:1: (lv_name_1_0= ruleEString )
            // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:1267:3: lv_name_1_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getInvariantAccess().getNameEStringParserRuleCall_1_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleInvariant2524);
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

            // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:1283:2: ( (lv_localGenerated_2_0= 'localGenerated' ) )?
            int alt41=2;
            int LA41_0 = input.LA(1);

            if ( (LA41_0==11) ) {
                alt41=1;
            }
            switch (alt41) {
                case 1 :
                    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:1284:1: (lv_localGenerated_2_0= 'localGenerated' )
                    {
                    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:1284:1: (lv_localGenerated_2_0= 'localGenerated' )
                    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:1285:3: lv_localGenerated_2_0= 'localGenerated'
                    {
                    lv_localGenerated_2_0=(Token)match(input,11,FollowSets000.FOLLOW_11_in_ruleInvariant2542); 

                            newLeafNode(lv_localGenerated_2_0, grammarAccess.getInvariantAccess().getLocalGeneratedLocalGeneratedKeyword_2_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getInvariantRule());
                    	        }
                           		setWithLastConsumed(current, "localGenerated", true, "localGenerated");
                    	    

                    }


                    }
                    break;

            }

            // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:1298:3: ( (lv_theorem_3_0= 'theorem' ) )?
            int alt42=2;
            int LA42_0 = input.LA(1);

            if ( (LA42_0==41) ) {
                alt42=1;
            }
            switch (alt42) {
                case 1 :
                    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:1299:1: (lv_theorem_3_0= 'theorem' )
                    {
                    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:1299:1: (lv_theorem_3_0= 'theorem' )
                    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:1300:3: lv_theorem_3_0= 'theorem'
                    {
                    lv_theorem_3_0=(Token)match(input,41,FollowSets000.FOLLOW_41_in_ruleInvariant2574); 

                            newLeafNode(lv_theorem_3_0, grammarAccess.getInvariantAccess().getTheoremTheoremKeyword_3_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getInvariantRule());
                    	        }
                           		setWithLastConsumed(current, "theorem", true, "theorem");
                    	    

                    }


                    }
                    break;

            }

            otherlv_4=(Token)match(input,42,FollowSets000.FOLLOW_42_in_ruleInvariant2600); 

                	newLeafNode(otherlv_4, grammarAccess.getInvariantAccess().getNotTheoremKeyword_4());
                
            // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:1317:1: (otherlv_5= 'internalId' ( (lv_internalId_6_0= ruleEString ) ) )?
            int alt43=2;
            int LA43_0 = input.LA(1);

            if ( (LA43_0==13) ) {
                alt43=1;
            }
            switch (alt43) {
                case 1 :
                    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:1317:3: otherlv_5= 'internalId' ( (lv_internalId_6_0= ruleEString ) )
                    {
                    otherlv_5=(Token)match(input,13,FollowSets000.FOLLOW_13_in_ruleInvariant2613); 

                        	newLeafNode(otherlv_5, grammarAccess.getInvariantAccess().getInternalIdKeyword_5_0());
                        
                    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:1321:1: ( (lv_internalId_6_0= ruleEString ) )
                    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:1322:1: (lv_internalId_6_0= ruleEString )
                    {
                    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:1322:1: (lv_internalId_6_0= ruleEString )
                    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:1323:3: lv_internalId_6_0= ruleEString
                    {
                     
                    	        newCompositeNode(grammarAccess.getInvariantAccess().getInternalIdEStringParserRuleCall_5_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleInvariant2634);
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

            // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:1339:4: (otherlv_7= 'comment' ( (lv_comment_8_0= ruleEString ) ) )?
            int alt44=2;
            int LA44_0 = input.LA(1);

            if ( (LA44_0==39) ) {
                alt44=1;
            }
            switch (alt44) {
                case 1 :
                    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:1339:6: otherlv_7= 'comment' ( (lv_comment_8_0= ruleEString ) )
                    {
                    otherlv_7=(Token)match(input,39,FollowSets000.FOLLOW_39_in_ruleInvariant2649); 

                        	newLeafNode(otherlv_7, grammarAccess.getInvariantAccess().getCommentKeyword_6_0());
                        
                    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:1343:1: ( (lv_comment_8_0= ruleEString ) )
                    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:1344:1: (lv_comment_8_0= ruleEString )
                    {
                    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:1344:1: (lv_comment_8_0= ruleEString )
                    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:1345:3: lv_comment_8_0= ruleEString
                    {
                     
                    	        newCompositeNode(grammarAccess.getInvariantAccess().getCommentEStringParserRuleCall_6_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleInvariant2670);
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

            otherlv_9=(Token)match(input,43,FollowSets000.FOLLOW_43_in_ruleInvariant2684); 

                	newLeafNode(otherlv_9, grammarAccess.getInvariantAccess().getPredicateKeyword_7());
                
            // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:1365:1: ( (lv_predicate_10_0= ruleEString ) )
            // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:1366:1: (lv_predicate_10_0= ruleEString )
            {
            // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:1366:1: (lv_predicate_10_0= ruleEString )
            // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:1367:3: lv_predicate_10_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getInvariantAccess().getPredicateEStringParserRuleCall_8_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleInvariant2705);
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

            // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:1383:2: (otherlv_11= 'annotations' otherlv_12= '{' ( (lv_annotations_13_0= ruleAnnotation ) ) (otherlv_14= ',' ( (lv_annotations_15_0= ruleAnnotation ) ) )* otherlv_16= '}' )?
            int alt46=2;
            int LA46_0 = input.LA(1);

            if ( (LA46_0==20) ) {
                alt46=1;
            }
            switch (alt46) {
                case 1 :
                    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:1383:4: otherlv_11= 'annotations' otherlv_12= '{' ( (lv_annotations_13_0= ruleAnnotation ) ) (otherlv_14= ',' ( (lv_annotations_15_0= ruleAnnotation ) ) )* otherlv_16= '}'
                    {
                    otherlv_11=(Token)match(input,20,FollowSets000.FOLLOW_20_in_ruleInvariant2718); 

                        	newLeafNode(otherlv_11, grammarAccess.getInvariantAccess().getAnnotationsKeyword_9_0());
                        
                    otherlv_12=(Token)match(input,21,FollowSets000.FOLLOW_21_in_ruleInvariant2730); 

                        	newLeafNode(otherlv_12, grammarAccess.getInvariantAccess().getLeftCurlyBracketKeyword_9_1());
                        
                    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:1391:1: ( (lv_annotations_13_0= ruleAnnotation ) )
                    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:1392:1: (lv_annotations_13_0= ruleAnnotation )
                    {
                    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:1392:1: (lv_annotations_13_0= ruleAnnotation )
                    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:1393:3: lv_annotations_13_0= ruleAnnotation
                    {
                     
                    	        newCompositeNode(grammarAccess.getInvariantAccess().getAnnotationsAnnotationParserRuleCall_9_2_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleAnnotation_in_ruleInvariant2751);
                    lv_annotations_13_0=ruleAnnotation();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getInvariantRule());
                    	        }
                           		add(
                           			current, 
                           			"annotations",
                            		lv_annotations_13_0, 
                            		"Annotation");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:1409:2: (otherlv_14= ',' ( (lv_annotations_15_0= ruleAnnotation ) ) )*
                    loop45:
                    do {
                        int alt45=2;
                        int LA45_0 = input.LA(1);

                        if ( (LA45_0==17) ) {
                            alt45=1;
                        }


                        switch (alt45) {
                    	case 1 :
                    	    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:1409:4: otherlv_14= ',' ( (lv_annotations_15_0= ruleAnnotation ) )
                    	    {
                    	    otherlv_14=(Token)match(input,17,FollowSets000.FOLLOW_17_in_ruleInvariant2764); 

                    	        	newLeafNode(otherlv_14, grammarAccess.getInvariantAccess().getCommaKeyword_9_3_0());
                    	        
                    	    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:1413:1: ( (lv_annotations_15_0= ruleAnnotation ) )
                    	    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:1414:1: (lv_annotations_15_0= ruleAnnotation )
                    	    {
                    	    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:1414:1: (lv_annotations_15_0= ruleAnnotation )
                    	    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:1415:3: lv_annotations_15_0= ruleAnnotation
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getInvariantAccess().getAnnotationsAnnotationParserRuleCall_9_3_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleAnnotation_in_ruleInvariant2785);
                    	    lv_annotations_15_0=ruleAnnotation();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getInvariantRule());
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
                    	    break loop45;
                        }
                    } while (true);

                    otherlv_16=(Token)match(input,22,FollowSets000.FOLLOW_22_in_ruleInvariant2799); 

                        	newLeafNode(otherlv_16, grammarAccess.getInvariantAccess().getRightCurlyBracketKeyword_9_4());
                        

                    }
                    break;

            }

            // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:1435:3: (otherlv_17= 'extensions' otherlv_18= '{' ( (lv_extensions_19_0= ruleAbstractExtension ) ) (otherlv_20= ',' ( (lv_extensions_21_0= ruleAbstractExtension ) ) )* otherlv_22= '}' )?
            int alt48=2;
            int LA48_0 = input.LA(1);

            if ( (LA48_0==23) ) {
                alt48=1;
            }
            switch (alt48) {
                case 1 :
                    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:1435:5: otherlv_17= 'extensions' otherlv_18= '{' ( (lv_extensions_19_0= ruleAbstractExtension ) ) (otherlv_20= ',' ( (lv_extensions_21_0= ruleAbstractExtension ) ) )* otherlv_22= '}'
                    {
                    otherlv_17=(Token)match(input,23,FollowSets000.FOLLOW_23_in_ruleInvariant2814); 

                        	newLeafNode(otherlv_17, grammarAccess.getInvariantAccess().getExtensionsKeyword_10_0());
                        
                    otherlv_18=(Token)match(input,21,FollowSets000.FOLLOW_21_in_ruleInvariant2826); 

                        	newLeafNode(otherlv_18, grammarAccess.getInvariantAccess().getLeftCurlyBracketKeyword_10_1());
                        
                    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:1443:1: ( (lv_extensions_19_0= ruleAbstractExtension ) )
                    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:1444:1: (lv_extensions_19_0= ruleAbstractExtension )
                    {
                    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:1444:1: (lv_extensions_19_0= ruleAbstractExtension )
                    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:1445:3: lv_extensions_19_0= ruleAbstractExtension
                    {
                     
                    	        newCompositeNode(grammarAccess.getInvariantAccess().getExtensionsAbstractExtensionParserRuleCall_10_2_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleAbstractExtension_in_ruleInvariant2847);
                    lv_extensions_19_0=ruleAbstractExtension();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getInvariantRule());
                    	        }
                           		add(
                           			current, 
                           			"extensions",
                            		lv_extensions_19_0, 
                            		"AbstractExtension");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:1461:2: (otherlv_20= ',' ( (lv_extensions_21_0= ruleAbstractExtension ) ) )*
                    loop47:
                    do {
                        int alt47=2;
                        int LA47_0 = input.LA(1);

                        if ( (LA47_0==17) ) {
                            alt47=1;
                        }


                        switch (alt47) {
                    	case 1 :
                    	    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:1461:4: otherlv_20= ',' ( (lv_extensions_21_0= ruleAbstractExtension ) )
                    	    {
                    	    otherlv_20=(Token)match(input,17,FollowSets000.FOLLOW_17_in_ruleInvariant2860); 

                    	        	newLeafNode(otherlv_20, grammarAccess.getInvariantAccess().getCommaKeyword_10_3_0());
                    	        
                    	    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:1465:1: ( (lv_extensions_21_0= ruleAbstractExtension ) )
                    	    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:1466:1: (lv_extensions_21_0= ruleAbstractExtension )
                    	    {
                    	    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:1466:1: (lv_extensions_21_0= ruleAbstractExtension )
                    	    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:1467:3: lv_extensions_21_0= ruleAbstractExtension
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getInvariantAccess().getExtensionsAbstractExtensionParserRuleCall_10_3_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleAbstractExtension_in_ruleInvariant2881);
                    	    lv_extensions_21_0=ruleAbstractExtension();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getInvariantRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"extensions",
                    	            		lv_extensions_21_0, 
                    	            		"AbstractExtension");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop47;
                        }
                    } while (true);

                    otherlv_22=(Token)match(input,22,FollowSets000.FOLLOW_22_in_ruleInvariant2895); 

                        	newLeafNode(otherlv_22, grammarAccess.getInvariantAccess().getRightCurlyBracketKeyword_10_4());
                        

                    }
                    break;

            }

            // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:1487:3: (otherlv_23= 'attributes' otherlv_24= '{' ( (lv_attributes_25_0= ruleStringToAttributeMapEntry ) ) (otherlv_26= ',' ( (lv_attributes_27_0= ruleStringToAttributeMapEntry ) ) )* otherlv_28= '}' )?
            int alt50=2;
            int LA50_0 = input.LA(1);

            if ( (LA50_0==24) ) {
                alt50=1;
            }
            switch (alt50) {
                case 1 :
                    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:1487:5: otherlv_23= 'attributes' otherlv_24= '{' ( (lv_attributes_25_0= ruleStringToAttributeMapEntry ) ) (otherlv_26= ',' ( (lv_attributes_27_0= ruleStringToAttributeMapEntry ) ) )* otherlv_28= '}'
                    {
                    otherlv_23=(Token)match(input,24,FollowSets000.FOLLOW_24_in_ruleInvariant2910); 

                        	newLeafNode(otherlv_23, grammarAccess.getInvariantAccess().getAttributesKeyword_11_0());
                        
                    otherlv_24=(Token)match(input,21,FollowSets000.FOLLOW_21_in_ruleInvariant2922); 

                        	newLeafNode(otherlv_24, grammarAccess.getInvariantAccess().getLeftCurlyBracketKeyword_11_1());
                        
                    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:1495:1: ( (lv_attributes_25_0= ruleStringToAttributeMapEntry ) )
                    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:1496:1: (lv_attributes_25_0= ruleStringToAttributeMapEntry )
                    {
                    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:1496:1: (lv_attributes_25_0= ruleStringToAttributeMapEntry )
                    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:1497:3: lv_attributes_25_0= ruleStringToAttributeMapEntry
                    {
                     
                    	        newCompositeNode(grammarAccess.getInvariantAccess().getAttributesStringToAttributeMapEntryParserRuleCall_11_2_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleStringToAttributeMapEntry_in_ruleInvariant2943);
                    lv_attributes_25_0=ruleStringToAttributeMapEntry();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getInvariantRule());
                    	        }
                           		add(
                           			current, 
                           			"attributes",
                            		lv_attributes_25_0, 
                            		"StringToAttributeMapEntry");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:1513:2: (otherlv_26= ',' ( (lv_attributes_27_0= ruleStringToAttributeMapEntry ) ) )*
                    loop49:
                    do {
                        int alt49=2;
                        int LA49_0 = input.LA(1);

                        if ( (LA49_0==17) ) {
                            alt49=1;
                        }


                        switch (alt49) {
                    	case 1 :
                    	    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:1513:4: otherlv_26= ',' ( (lv_attributes_27_0= ruleStringToAttributeMapEntry ) )
                    	    {
                    	    otherlv_26=(Token)match(input,17,FollowSets000.FOLLOW_17_in_ruleInvariant2956); 

                    	        	newLeafNode(otherlv_26, grammarAccess.getInvariantAccess().getCommaKeyword_11_3_0());
                    	        
                    	    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:1517:1: ( (lv_attributes_27_0= ruleStringToAttributeMapEntry ) )
                    	    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:1518:1: (lv_attributes_27_0= ruleStringToAttributeMapEntry )
                    	    {
                    	    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:1518:1: (lv_attributes_27_0= ruleStringToAttributeMapEntry )
                    	    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:1519:3: lv_attributes_27_0= ruleStringToAttributeMapEntry
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getInvariantAccess().getAttributesStringToAttributeMapEntryParserRuleCall_11_3_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleStringToAttributeMapEntry_in_ruleInvariant2977);
                    	    lv_attributes_27_0=ruleStringToAttributeMapEntry();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getInvariantRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"attributes",
                    	            		lv_attributes_27_0, 
                    	            		"StringToAttributeMapEntry");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop49;
                        }
                    } while (true);

                    otherlv_28=(Token)match(input,22,FollowSets000.FOLLOW_22_in_ruleInvariant2991); 

                        	newLeafNode(otherlv_28, grammarAccess.getInvariantAccess().getRightCurlyBracketKeyword_11_4());
                        

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
    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:1547:1: entryRuleVariant returns [EObject current=null] : iv_ruleVariant= ruleVariant EOF ;
    public final EObject entryRuleVariant() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVariant = null;


        try {
            // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:1548:2: (iv_ruleVariant= ruleVariant EOF )
            // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:1549:2: iv_ruleVariant= ruleVariant EOF
            {
             newCompositeNode(grammarAccess.getVariantRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleVariant_in_entryRuleVariant3029);
            iv_ruleVariant=ruleVariant();

            state._fsp--;

             current =iv_ruleVariant; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleVariant3039); 

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
    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:1556:1: ruleVariant returns [EObject current=null] : ( ( (lv_localGenerated_0_0= 'localGenerated' ) )? otherlv_1= 'Variant' (otherlv_2= 'internalId' ( (lv_internalId_3_0= ruleEString ) ) )? (otherlv_4= 'comment' ( (lv_comment_5_0= ruleEString ) ) )? otherlv_6= 'Expression' ( (lv_expression_7_0= ruleEString ) ) (otherlv_8= 'annotations' otherlv_9= '{' ( (lv_annotations_10_0= ruleAnnotation ) ) (otherlv_11= ',' ( (lv_annotations_12_0= ruleAnnotation ) ) )* otherlv_13= '}' )? (otherlv_14= 'extensions' otherlv_15= '{' ( (lv_extensions_16_0= ruleAbstractExtension ) ) (otherlv_17= ',' ( (lv_extensions_18_0= ruleAbstractExtension ) ) )* otherlv_19= '}' )? (otherlv_20= 'attributes' otherlv_21= '{' ( (lv_attributes_22_0= ruleStringToAttributeMapEntry ) ) (otherlv_23= ',' ( (lv_attributes_24_0= ruleStringToAttributeMapEntry ) ) )* otherlv_25= '}' )? ) ;
    public final EObject ruleVariant() throws RecognitionException {
        EObject current = null;

        Token lv_localGenerated_0_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
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
        Token otherlv_21=null;
        Token otherlv_23=null;
        Token otherlv_25=null;
        AntlrDatatypeRuleToken lv_internalId_3_0 = null;

        AntlrDatatypeRuleToken lv_comment_5_0 = null;

        AntlrDatatypeRuleToken lv_expression_7_0 = null;

        EObject lv_annotations_10_0 = null;

        EObject lv_annotations_12_0 = null;

        EObject lv_extensions_16_0 = null;

        EObject lv_extensions_18_0 = null;

        EObject lv_attributes_22_0 = null;

        EObject lv_attributes_24_0 = null;


         enterRule(); 
            
        try {
            // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:1559:28: ( ( ( (lv_localGenerated_0_0= 'localGenerated' ) )? otherlv_1= 'Variant' (otherlv_2= 'internalId' ( (lv_internalId_3_0= ruleEString ) ) )? (otherlv_4= 'comment' ( (lv_comment_5_0= ruleEString ) ) )? otherlv_6= 'Expression' ( (lv_expression_7_0= ruleEString ) ) (otherlv_8= 'annotations' otherlv_9= '{' ( (lv_annotations_10_0= ruleAnnotation ) ) (otherlv_11= ',' ( (lv_annotations_12_0= ruleAnnotation ) ) )* otherlv_13= '}' )? (otherlv_14= 'extensions' otherlv_15= '{' ( (lv_extensions_16_0= ruleAbstractExtension ) ) (otherlv_17= ',' ( (lv_extensions_18_0= ruleAbstractExtension ) ) )* otherlv_19= '}' )? (otherlv_20= 'attributes' otherlv_21= '{' ( (lv_attributes_22_0= ruleStringToAttributeMapEntry ) ) (otherlv_23= ',' ( (lv_attributes_24_0= ruleStringToAttributeMapEntry ) ) )* otherlv_25= '}' )? ) )
            // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:1560:1: ( ( (lv_localGenerated_0_0= 'localGenerated' ) )? otherlv_1= 'Variant' (otherlv_2= 'internalId' ( (lv_internalId_3_0= ruleEString ) ) )? (otherlv_4= 'comment' ( (lv_comment_5_0= ruleEString ) ) )? otherlv_6= 'Expression' ( (lv_expression_7_0= ruleEString ) ) (otherlv_8= 'annotations' otherlv_9= '{' ( (lv_annotations_10_0= ruleAnnotation ) ) (otherlv_11= ',' ( (lv_annotations_12_0= ruleAnnotation ) ) )* otherlv_13= '}' )? (otherlv_14= 'extensions' otherlv_15= '{' ( (lv_extensions_16_0= ruleAbstractExtension ) ) (otherlv_17= ',' ( (lv_extensions_18_0= ruleAbstractExtension ) ) )* otherlv_19= '}' )? (otherlv_20= 'attributes' otherlv_21= '{' ( (lv_attributes_22_0= ruleStringToAttributeMapEntry ) ) (otherlv_23= ',' ( (lv_attributes_24_0= ruleStringToAttributeMapEntry ) ) )* otherlv_25= '}' )? )
            {
            // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:1560:1: ( ( (lv_localGenerated_0_0= 'localGenerated' ) )? otherlv_1= 'Variant' (otherlv_2= 'internalId' ( (lv_internalId_3_0= ruleEString ) ) )? (otherlv_4= 'comment' ( (lv_comment_5_0= ruleEString ) ) )? otherlv_6= 'Expression' ( (lv_expression_7_0= ruleEString ) ) (otherlv_8= 'annotations' otherlv_9= '{' ( (lv_annotations_10_0= ruleAnnotation ) ) (otherlv_11= ',' ( (lv_annotations_12_0= ruleAnnotation ) ) )* otherlv_13= '}' )? (otherlv_14= 'extensions' otherlv_15= '{' ( (lv_extensions_16_0= ruleAbstractExtension ) ) (otherlv_17= ',' ( (lv_extensions_18_0= ruleAbstractExtension ) ) )* otherlv_19= '}' )? (otherlv_20= 'attributes' otherlv_21= '{' ( (lv_attributes_22_0= ruleStringToAttributeMapEntry ) ) (otherlv_23= ',' ( (lv_attributes_24_0= ruleStringToAttributeMapEntry ) ) )* otherlv_25= '}' )? )
            // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:1560:2: ( (lv_localGenerated_0_0= 'localGenerated' ) )? otherlv_1= 'Variant' (otherlv_2= 'internalId' ( (lv_internalId_3_0= ruleEString ) ) )? (otherlv_4= 'comment' ( (lv_comment_5_0= ruleEString ) ) )? otherlv_6= 'Expression' ( (lv_expression_7_0= ruleEString ) ) (otherlv_8= 'annotations' otherlv_9= '{' ( (lv_annotations_10_0= ruleAnnotation ) ) (otherlv_11= ',' ( (lv_annotations_12_0= ruleAnnotation ) ) )* otherlv_13= '}' )? (otherlv_14= 'extensions' otherlv_15= '{' ( (lv_extensions_16_0= ruleAbstractExtension ) ) (otherlv_17= ',' ( (lv_extensions_18_0= ruleAbstractExtension ) ) )* otherlv_19= '}' )? (otherlv_20= 'attributes' otherlv_21= '{' ( (lv_attributes_22_0= ruleStringToAttributeMapEntry ) ) (otherlv_23= ',' ( (lv_attributes_24_0= ruleStringToAttributeMapEntry ) ) )* otherlv_25= '}' )?
            {
            // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:1560:2: ( (lv_localGenerated_0_0= 'localGenerated' ) )?
            int alt51=2;
            int LA51_0 = input.LA(1);

            if ( (LA51_0==11) ) {
                alt51=1;
            }
            switch (alt51) {
                case 1 :
                    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:1561:1: (lv_localGenerated_0_0= 'localGenerated' )
                    {
                    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:1561:1: (lv_localGenerated_0_0= 'localGenerated' )
                    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:1562:3: lv_localGenerated_0_0= 'localGenerated'
                    {
                    lv_localGenerated_0_0=(Token)match(input,11,FollowSets000.FOLLOW_11_in_ruleVariant3082); 

                            newLeafNode(lv_localGenerated_0_0, grammarAccess.getVariantAccess().getLocalGeneratedLocalGeneratedKeyword_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getVariantRule());
                    	        }
                           		setWithLastConsumed(current, "localGenerated", true, "localGenerated");
                    	    

                    }


                    }
                    break;

            }

            otherlv_1=(Token)match(input,28,FollowSets000.FOLLOW_28_in_ruleVariant3108); 

                	newLeafNode(otherlv_1, grammarAccess.getVariantAccess().getVariantKeyword_1());
                
            // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:1579:1: (otherlv_2= 'internalId' ( (lv_internalId_3_0= ruleEString ) ) )?
            int alt52=2;
            int LA52_0 = input.LA(1);

            if ( (LA52_0==13) ) {
                alt52=1;
            }
            switch (alt52) {
                case 1 :
                    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:1579:3: otherlv_2= 'internalId' ( (lv_internalId_3_0= ruleEString ) )
                    {
                    otherlv_2=(Token)match(input,13,FollowSets000.FOLLOW_13_in_ruleVariant3121); 

                        	newLeafNode(otherlv_2, grammarAccess.getVariantAccess().getInternalIdKeyword_2_0());
                        
                    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:1583:1: ( (lv_internalId_3_0= ruleEString ) )
                    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:1584:1: (lv_internalId_3_0= ruleEString )
                    {
                    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:1584:1: (lv_internalId_3_0= ruleEString )
                    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:1585:3: lv_internalId_3_0= ruleEString
                    {
                     
                    	        newCompositeNode(grammarAccess.getVariantAccess().getInternalIdEStringParserRuleCall_2_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleVariant3142);
                    lv_internalId_3_0=ruleEString();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getVariantRule());
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

            // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:1601:4: (otherlv_4= 'comment' ( (lv_comment_5_0= ruleEString ) ) )?
            int alt53=2;
            int LA53_0 = input.LA(1);

            if ( (LA53_0==39) ) {
                alt53=1;
            }
            switch (alt53) {
                case 1 :
                    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:1601:6: otherlv_4= 'comment' ( (lv_comment_5_0= ruleEString ) )
                    {
                    otherlv_4=(Token)match(input,39,FollowSets000.FOLLOW_39_in_ruleVariant3157); 

                        	newLeafNode(otherlv_4, grammarAccess.getVariantAccess().getCommentKeyword_3_0());
                        
                    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:1605:1: ( (lv_comment_5_0= ruleEString ) )
                    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:1606:1: (lv_comment_5_0= ruleEString )
                    {
                    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:1606:1: (lv_comment_5_0= ruleEString )
                    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:1607:3: lv_comment_5_0= ruleEString
                    {
                     
                    	        newCompositeNode(grammarAccess.getVariantAccess().getCommentEStringParserRuleCall_3_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleVariant3178);
                    lv_comment_5_0=ruleEString();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getVariantRule());
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

            otherlv_6=(Token)match(input,44,FollowSets000.FOLLOW_44_in_ruleVariant3192); 

                	newLeafNode(otherlv_6, grammarAccess.getVariantAccess().getExpressionKeyword_4());
                
            // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:1627:1: ( (lv_expression_7_0= ruleEString ) )
            // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:1628:1: (lv_expression_7_0= ruleEString )
            {
            // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:1628:1: (lv_expression_7_0= ruleEString )
            // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:1629:3: lv_expression_7_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getVariantAccess().getExpressionEStringParserRuleCall_5_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleVariant3213);
            lv_expression_7_0=ruleEString();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getVariantRule());
            	        }
                   		set(
                   			current, 
                   			"expression",
                    		lv_expression_7_0, 
                    		"EString");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:1645:2: (otherlv_8= 'annotations' otherlv_9= '{' ( (lv_annotations_10_0= ruleAnnotation ) ) (otherlv_11= ',' ( (lv_annotations_12_0= ruleAnnotation ) ) )* otherlv_13= '}' )?
            int alt55=2;
            int LA55_0 = input.LA(1);

            if ( (LA55_0==20) ) {
                alt55=1;
            }
            switch (alt55) {
                case 1 :
                    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:1645:4: otherlv_8= 'annotations' otherlv_9= '{' ( (lv_annotations_10_0= ruleAnnotation ) ) (otherlv_11= ',' ( (lv_annotations_12_0= ruleAnnotation ) ) )* otherlv_13= '}'
                    {
                    otherlv_8=(Token)match(input,20,FollowSets000.FOLLOW_20_in_ruleVariant3226); 

                        	newLeafNode(otherlv_8, grammarAccess.getVariantAccess().getAnnotationsKeyword_6_0());
                        
                    otherlv_9=(Token)match(input,21,FollowSets000.FOLLOW_21_in_ruleVariant3238); 

                        	newLeafNode(otherlv_9, grammarAccess.getVariantAccess().getLeftCurlyBracketKeyword_6_1());
                        
                    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:1653:1: ( (lv_annotations_10_0= ruleAnnotation ) )
                    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:1654:1: (lv_annotations_10_0= ruleAnnotation )
                    {
                    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:1654:1: (lv_annotations_10_0= ruleAnnotation )
                    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:1655:3: lv_annotations_10_0= ruleAnnotation
                    {
                     
                    	        newCompositeNode(grammarAccess.getVariantAccess().getAnnotationsAnnotationParserRuleCall_6_2_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleAnnotation_in_ruleVariant3259);
                    lv_annotations_10_0=ruleAnnotation();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getVariantRule());
                    	        }
                           		add(
                           			current, 
                           			"annotations",
                            		lv_annotations_10_0, 
                            		"Annotation");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:1671:2: (otherlv_11= ',' ( (lv_annotations_12_0= ruleAnnotation ) ) )*
                    loop54:
                    do {
                        int alt54=2;
                        int LA54_0 = input.LA(1);

                        if ( (LA54_0==17) ) {
                            alt54=1;
                        }


                        switch (alt54) {
                    	case 1 :
                    	    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:1671:4: otherlv_11= ',' ( (lv_annotations_12_0= ruleAnnotation ) )
                    	    {
                    	    otherlv_11=(Token)match(input,17,FollowSets000.FOLLOW_17_in_ruleVariant3272); 

                    	        	newLeafNode(otherlv_11, grammarAccess.getVariantAccess().getCommaKeyword_6_3_0());
                    	        
                    	    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:1675:1: ( (lv_annotations_12_0= ruleAnnotation ) )
                    	    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:1676:1: (lv_annotations_12_0= ruleAnnotation )
                    	    {
                    	    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:1676:1: (lv_annotations_12_0= ruleAnnotation )
                    	    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:1677:3: lv_annotations_12_0= ruleAnnotation
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getVariantAccess().getAnnotationsAnnotationParserRuleCall_6_3_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleAnnotation_in_ruleVariant3293);
                    	    lv_annotations_12_0=ruleAnnotation();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getVariantRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"annotations",
                    	            		lv_annotations_12_0, 
                    	            		"Annotation");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop54;
                        }
                    } while (true);

                    otherlv_13=(Token)match(input,22,FollowSets000.FOLLOW_22_in_ruleVariant3307); 

                        	newLeafNode(otherlv_13, grammarAccess.getVariantAccess().getRightCurlyBracketKeyword_6_4());
                        

                    }
                    break;

            }

            // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:1697:3: (otherlv_14= 'extensions' otherlv_15= '{' ( (lv_extensions_16_0= ruleAbstractExtension ) ) (otherlv_17= ',' ( (lv_extensions_18_0= ruleAbstractExtension ) ) )* otherlv_19= '}' )?
            int alt57=2;
            int LA57_0 = input.LA(1);

            if ( (LA57_0==23) ) {
                alt57=1;
            }
            switch (alt57) {
                case 1 :
                    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:1697:5: otherlv_14= 'extensions' otherlv_15= '{' ( (lv_extensions_16_0= ruleAbstractExtension ) ) (otherlv_17= ',' ( (lv_extensions_18_0= ruleAbstractExtension ) ) )* otherlv_19= '}'
                    {
                    otherlv_14=(Token)match(input,23,FollowSets000.FOLLOW_23_in_ruleVariant3322); 

                        	newLeafNode(otherlv_14, grammarAccess.getVariantAccess().getExtensionsKeyword_7_0());
                        
                    otherlv_15=(Token)match(input,21,FollowSets000.FOLLOW_21_in_ruleVariant3334); 

                        	newLeafNode(otherlv_15, grammarAccess.getVariantAccess().getLeftCurlyBracketKeyword_7_1());
                        
                    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:1705:1: ( (lv_extensions_16_0= ruleAbstractExtension ) )
                    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:1706:1: (lv_extensions_16_0= ruleAbstractExtension )
                    {
                    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:1706:1: (lv_extensions_16_0= ruleAbstractExtension )
                    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:1707:3: lv_extensions_16_0= ruleAbstractExtension
                    {
                     
                    	        newCompositeNode(grammarAccess.getVariantAccess().getExtensionsAbstractExtensionParserRuleCall_7_2_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleAbstractExtension_in_ruleVariant3355);
                    lv_extensions_16_0=ruleAbstractExtension();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getVariantRule());
                    	        }
                           		add(
                           			current, 
                           			"extensions",
                            		lv_extensions_16_0, 
                            		"AbstractExtension");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:1723:2: (otherlv_17= ',' ( (lv_extensions_18_0= ruleAbstractExtension ) ) )*
                    loop56:
                    do {
                        int alt56=2;
                        int LA56_0 = input.LA(1);

                        if ( (LA56_0==17) ) {
                            alt56=1;
                        }


                        switch (alt56) {
                    	case 1 :
                    	    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:1723:4: otherlv_17= ',' ( (lv_extensions_18_0= ruleAbstractExtension ) )
                    	    {
                    	    otherlv_17=(Token)match(input,17,FollowSets000.FOLLOW_17_in_ruleVariant3368); 

                    	        	newLeafNode(otherlv_17, grammarAccess.getVariantAccess().getCommaKeyword_7_3_0());
                    	        
                    	    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:1727:1: ( (lv_extensions_18_0= ruleAbstractExtension ) )
                    	    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:1728:1: (lv_extensions_18_0= ruleAbstractExtension )
                    	    {
                    	    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:1728:1: (lv_extensions_18_0= ruleAbstractExtension )
                    	    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:1729:3: lv_extensions_18_0= ruleAbstractExtension
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getVariantAccess().getExtensionsAbstractExtensionParserRuleCall_7_3_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleAbstractExtension_in_ruleVariant3389);
                    	    lv_extensions_18_0=ruleAbstractExtension();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getVariantRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"extensions",
                    	            		lv_extensions_18_0, 
                    	            		"AbstractExtension");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop56;
                        }
                    } while (true);

                    otherlv_19=(Token)match(input,22,FollowSets000.FOLLOW_22_in_ruleVariant3403); 

                        	newLeafNode(otherlv_19, grammarAccess.getVariantAccess().getRightCurlyBracketKeyword_7_4());
                        

                    }
                    break;

            }

            // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:1749:3: (otherlv_20= 'attributes' otherlv_21= '{' ( (lv_attributes_22_0= ruleStringToAttributeMapEntry ) ) (otherlv_23= ',' ( (lv_attributes_24_0= ruleStringToAttributeMapEntry ) ) )* otherlv_25= '}' )?
            int alt59=2;
            int LA59_0 = input.LA(1);

            if ( (LA59_0==24) ) {
                alt59=1;
            }
            switch (alt59) {
                case 1 :
                    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:1749:5: otherlv_20= 'attributes' otherlv_21= '{' ( (lv_attributes_22_0= ruleStringToAttributeMapEntry ) ) (otherlv_23= ',' ( (lv_attributes_24_0= ruleStringToAttributeMapEntry ) ) )* otherlv_25= '}'
                    {
                    otherlv_20=(Token)match(input,24,FollowSets000.FOLLOW_24_in_ruleVariant3418); 

                        	newLeafNode(otherlv_20, grammarAccess.getVariantAccess().getAttributesKeyword_8_0());
                        
                    otherlv_21=(Token)match(input,21,FollowSets000.FOLLOW_21_in_ruleVariant3430); 

                        	newLeafNode(otherlv_21, grammarAccess.getVariantAccess().getLeftCurlyBracketKeyword_8_1());
                        
                    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:1757:1: ( (lv_attributes_22_0= ruleStringToAttributeMapEntry ) )
                    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:1758:1: (lv_attributes_22_0= ruleStringToAttributeMapEntry )
                    {
                    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:1758:1: (lv_attributes_22_0= ruleStringToAttributeMapEntry )
                    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:1759:3: lv_attributes_22_0= ruleStringToAttributeMapEntry
                    {
                     
                    	        newCompositeNode(grammarAccess.getVariantAccess().getAttributesStringToAttributeMapEntryParserRuleCall_8_2_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleStringToAttributeMapEntry_in_ruleVariant3451);
                    lv_attributes_22_0=ruleStringToAttributeMapEntry();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getVariantRule());
                    	        }
                           		add(
                           			current, 
                           			"attributes",
                            		lv_attributes_22_0, 
                            		"StringToAttributeMapEntry");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:1775:2: (otherlv_23= ',' ( (lv_attributes_24_0= ruleStringToAttributeMapEntry ) ) )*
                    loop58:
                    do {
                        int alt58=2;
                        int LA58_0 = input.LA(1);

                        if ( (LA58_0==17) ) {
                            alt58=1;
                        }


                        switch (alt58) {
                    	case 1 :
                    	    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:1775:4: otherlv_23= ',' ( (lv_attributes_24_0= ruleStringToAttributeMapEntry ) )
                    	    {
                    	    otherlv_23=(Token)match(input,17,FollowSets000.FOLLOW_17_in_ruleVariant3464); 

                    	        	newLeafNode(otherlv_23, grammarAccess.getVariantAccess().getCommaKeyword_8_3_0());
                    	        
                    	    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:1779:1: ( (lv_attributes_24_0= ruleStringToAttributeMapEntry ) )
                    	    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:1780:1: (lv_attributes_24_0= ruleStringToAttributeMapEntry )
                    	    {
                    	    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:1780:1: (lv_attributes_24_0= ruleStringToAttributeMapEntry )
                    	    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:1781:3: lv_attributes_24_0= ruleStringToAttributeMapEntry
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getVariantAccess().getAttributesStringToAttributeMapEntryParserRuleCall_8_3_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleStringToAttributeMapEntry_in_ruleVariant3485);
                    	    lv_attributes_24_0=ruleStringToAttributeMapEntry();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getVariantRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"attributes",
                    	            		lv_attributes_24_0, 
                    	            		"StringToAttributeMapEntry");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop58;
                        }
                    } while (true);

                    otherlv_25=(Token)match(input,22,FollowSets000.FOLLOW_22_in_ruleVariant3499); 

                        	newLeafNode(otherlv_25, grammarAccess.getVariantAccess().getRightCurlyBracketKeyword_8_4());
                        

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
    // $ANTLR end "ruleVariant"


    // $ANTLR start "entryRuleEvent"
    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:1809:1: entryRuleEvent returns [EObject current=null] : iv_ruleEvent= ruleEvent EOF ;
    public final EObject entryRuleEvent() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEvent = null;


        try {
            // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:1810:2: (iv_ruleEvent= ruleEvent EOF )
            // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:1811:2: iv_ruleEvent= ruleEvent EOF
            {
             newCompositeNode(grammarAccess.getEventRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleEvent_in_entryRuleEvent3537);
            iv_ruleEvent=ruleEvent();

            state._fsp--;

             current =iv_ruleEvent; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleEvent3547); 

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
    // $ANTLR end "entryRuleEvent"


    // $ANTLR start "ruleEvent"
    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:1818:1: ruleEvent returns [EObject current=null] : ( () otherlv_1= 'Event' ( (lv_name_2_0= ruleEString ) ) ( (lv_localGenerated_3_0= 'localGenerated' ) )? ( (lv_extended_4_0= 'extended' ) )? (otherlv_5= 'internalId' ( (lv_internalId_6_0= ruleEString ) ) )? (otherlv_7= 'Comment' ( (lv_comment_8_0= ruleEString ) ) )? (otherlv_9= 'Convergence' ( (lv_convergence_10_0= ruleConvergence ) ) )? (otherlv_11= 'Refines' otherlv_12= '(' ( ( ruleEString ) ) (otherlv_14= ',' ( ( ruleEString ) ) )* otherlv_16= ')' )? (otherlv_17= 'annotations' otherlv_18= '{' ( (lv_annotations_19_0= ruleAnnotation ) ) (otherlv_20= ',' ( (lv_annotations_21_0= ruleAnnotation ) ) )* otherlv_22= '}' )? (otherlv_23= 'extensions' otherlv_24= '{' ( (lv_extensions_25_0= ruleAbstractExtension ) ) (otherlv_26= ',' ( (lv_extensions_27_0= ruleAbstractExtension ) ) )* otherlv_28= '}' )? (otherlv_29= 'attributes' otherlv_30= '{' ( (lv_attributes_31_0= ruleStringToAttributeMapEntry ) ) (otherlv_32= ',' ( (lv_attributes_33_0= ruleStringToAttributeMapEntry ) ) )* otherlv_34= '}' )? (otherlv_35= 'Parameters' ( (lv_parameters_36_0= ruleParameter ) ) (otherlv_37= ',' ( (lv_parameters_38_0= ruleParameter ) ) )* )? (otherlv_39= 'Guards' ( (lv_guards_40_0= ruleGuard ) ) (otherlv_41= '&' ( (lv_guards_42_0= ruleGuard ) ) )* )? (otherlv_43= 'Witnesses' ( (lv_witnesses_44_0= ruleWitness ) ) (otherlv_45= ',' ( (lv_witnesses_46_0= ruleWitness ) ) )* )? (otherlv_47= 'Actions' ( (lv_actions_48_0= ruleAction ) ) (otherlv_49= ' || ' ( (lv_actions_50_0= ruleAction ) ) )* )? ) ;
    public final EObject ruleEvent() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_localGenerated_3_0=null;
        Token lv_extended_4_0=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
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
        Token otherlv_30=null;
        Token otherlv_32=null;
        Token otherlv_34=null;
        Token otherlv_35=null;
        Token otherlv_37=null;
        Token otherlv_39=null;
        Token otherlv_41=null;
        Token otherlv_43=null;
        Token otherlv_45=null;
        Token otherlv_47=null;
        Token otherlv_49=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        AntlrDatatypeRuleToken lv_internalId_6_0 = null;

        AntlrDatatypeRuleToken lv_comment_8_0 = null;

        Enumerator lv_convergence_10_0 = null;

        EObject lv_annotations_19_0 = null;

        EObject lv_annotations_21_0 = null;

        EObject lv_extensions_25_0 = null;

        EObject lv_extensions_27_0 = null;

        EObject lv_attributes_31_0 = null;

        EObject lv_attributes_33_0 = null;

        EObject lv_parameters_36_0 = null;

        EObject lv_parameters_38_0 = null;

        EObject lv_guards_40_0 = null;

        EObject lv_guards_42_0 = null;

        EObject lv_witnesses_44_0 = null;

        EObject lv_witnesses_46_0 = null;

        EObject lv_actions_48_0 = null;

        EObject lv_actions_50_0 = null;


         enterRule(); 
            
        try {
            // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:1821:28: ( ( () otherlv_1= 'Event' ( (lv_name_2_0= ruleEString ) ) ( (lv_localGenerated_3_0= 'localGenerated' ) )? ( (lv_extended_4_0= 'extended' ) )? (otherlv_5= 'internalId' ( (lv_internalId_6_0= ruleEString ) ) )? (otherlv_7= 'Comment' ( (lv_comment_8_0= ruleEString ) ) )? (otherlv_9= 'Convergence' ( (lv_convergence_10_0= ruleConvergence ) ) )? (otherlv_11= 'Refines' otherlv_12= '(' ( ( ruleEString ) ) (otherlv_14= ',' ( ( ruleEString ) ) )* otherlv_16= ')' )? (otherlv_17= 'annotations' otherlv_18= '{' ( (lv_annotations_19_0= ruleAnnotation ) ) (otherlv_20= ',' ( (lv_annotations_21_0= ruleAnnotation ) ) )* otherlv_22= '}' )? (otherlv_23= 'extensions' otherlv_24= '{' ( (lv_extensions_25_0= ruleAbstractExtension ) ) (otherlv_26= ',' ( (lv_extensions_27_0= ruleAbstractExtension ) ) )* otherlv_28= '}' )? (otherlv_29= 'attributes' otherlv_30= '{' ( (lv_attributes_31_0= ruleStringToAttributeMapEntry ) ) (otherlv_32= ',' ( (lv_attributes_33_0= ruleStringToAttributeMapEntry ) ) )* otherlv_34= '}' )? (otherlv_35= 'Parameters' ( (lv_parameters_36_0= ruleParameter ) ) (otherlv_37= ',' ( (lv_parameters_38_0= ruleParameter ) ) )* )? (otherlv_39= 'Guards' ( (lv_guards_40_0= ruleGuard ) ) (otherlv_41= '&' ( (lv_guards_42_0= ruleGuard ) ) )* )? (otherlv_43= 'Witnesses' ( (lv_witnesses_44_0= ruleWitness ) ) (otherlv_45= ',' ( (lv_witnesses_46_0= ruleWitness ) ) )* )? (otherlv_47= 'Actions' ( (lv_actions_48_0= ruleAction ) ) (otherlv_49= ' || ' ( (lv_actions_50_0= ruleAction ) ) )* )? ) )
            // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:1822:1: ( () otherlv_1= 'Event' ( (lv_name_2_0= ruleEString ) ) ( (lv_localGenerated_3_0= 'localGenerated' ) )? ( (lv_extended_4_0= 'extended' ) )? (otherlv_5= 'internalId' ( (lv_internalId_6_0= ruleEString ) ) )? (otherlv_7= 'Comment' ( (lv_comment_8_0= ruleEString ) ) )? (otherlv_9= 'Convergence' ( (lv_convergence_10_0= ruleConvergence ) ) )? (otherlv_11= 'Refines' otherlv_12= '(' ( ( ruleEString ) ) (otherlv_14= ',' ( ( ruleEString ) ) )* otherlv_16= ')' )? (otherlv_17= 'annotations' otherlv_18= '{' ( (lv_annotations_19_0= ruleAnnotation ) ) (otherlv_20= ',' ( (lv_annotations_21_0= ruleAnnotation ) ) )* otherlv_22= '}' )? (otherlv_23= 'extensions' otherlv_24= '{' ( (lv_extensions_25_0= ruleAbstractExtension ) ) (otherlv_26= ',' ( (lv_extensions_27_0= ruleAbstractExtension ) ) )* otherlv_28= '}' )? (otherlv_29= 'attributes' otherlv_30= '{' ( (lv_attributes_31_0= ruleStringToAttributeMapEntry ) ) (otherlv_32= ',' ( (lv_attributes_33_0= ruleStringToAttributeMapEntry ) ) )* otherlv_34= '}' )? (otherlv_35= 'Parameters' ( (lv_parameters_36_0= ruleParameter ) ) (otherlv_37= ',' ( (lv_parameters_38_0= ruleParameter ) ) )* )? (otherlv_39= 'Guards' ( (lv_guards_40_0= ruleGuard ) ) (otherlv_41= '&' ( (lv_guards_42_0= ruleGuard ) ) )* )? (otherlv_43= 'Witnesses' ( (lv_witnesses_44_0= ruleWitness ) ) (otherlv_45= ',' ( (lv_witnesses_46_0= ruleWitness ) ) )* )? (otherlv_47= 'Actions' ( (lv_actions_48_0= ruleAction ) ) (otherlv_49= ' || ' ( (lv_actions_50_0= ruleAction ) ) )* )? )
            {
            // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:1822:1: ( () otherlv_1= 'Event' ( (lv_name_2_0= ruleEString ) ) ( (lv_localGenerated_3_0= 'localGenerated' ) )? ( (lv_extended_4_0= 'extended' ) )? (otherlv_5= 'internalId' ( (lv_internalId_6_0= ruleEString ) ) )? (otherlv_7= 'Comment' ( (lv_comment_8_0= ruleEString ) ) )? (otherlv_9= 'Convergence' ( (lv_convergence_10_0= ruleConvergence ) ) )? (otherlv_11= 'Refines' otherlv_12= '(' ( ( ruleEString ) ) (otherlv_14= ',' ( ( ruleEString ) ) )* otherlv_16= ')' )? (otherlv_17= 'annotations' otherlv_18= '{' ( (lv_annotations_19_0= ruleAnnotation ) ) (otherlv_20= ',' ( (lv_annotations_21_0= ruleAnnotation ) ) )* otherlv_22= '}' )? (otherlv_23= 'extensions' otherlv_24= '{' ( (lv_extensions_25_0= ruleAbstractExtension ) ) (otherlv_26= ',' ( (lv_extensions_27_0= ruleAbstractExtension ) ) )* otherlv_28= '}' )? (otherlv_29= 'attributes' otherlv_30= '{' ( (lv_attributes_31_0= ruleStringToAttributeMapEntry ) ) (otherlv_32= ',' ( (lv_attributes_33_0= ruleStringToAttributeMapEntry ) ) )* otherlv_34= '}' )? (otherlv_35= 'Parameters' ( (lv_parameters_36_0= ruleParameter ) ) (otherlv_37= ',' ( (lv_parameters_38_0= ruleParameter ) ) )* )? (otherlv_39= 'Guards' ( (lv_guards_40_0= ruleGuard ) ) (otherlv_41= '&' ( (lv_guards_42_0= ruleGuard ) ) )* )? (otherlv_43= 'Witnesses' ( (lv_witnesses_44_0= ruleWitness ) ) (otherlv_45= ',' ( (lv_witnesses_46_0= ruleWitness ) ) )* )? (otherlv_47= 'Actions' ( (lv_actions_48_0= ruleAction ) ) (otherlv_49= ' || ' ( (lv_actions_50_0= ruleAction ) ) )* )? )
            // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:1822:2: () otherlv_1= 'Event' ( (lv_name_2_0= ruleEString ) ) ( (lv_localGenerated_3_0= 'localGenerated' ) )? ( (lv_extended_4_0= 'extended' ) )? (otherlv_5= 'internalId' ( (lv_internalId_6_0= ruleEString ) ) )? (otherlv_7= 'Comment' ( (lv_comment_8_0= ruleEString ) ) )? (otherlv_9= 'Convergence' ( (lv_convergence_10_0= ruleConvergence ) ) )? (otherlv_11= 'Refines' otherlv_12= '(' ( ( ruleEString ) ) (otherlv_14= ',' ( ( ruleEString ) ) )* otherlv_16= ')' )? (otherlv_17= 'annotations' otherlv_18= '{' ( (lv_annotations_19_0= ruleAnnotation ) ) (otherlv_20= ',' ( (lv_annotations_21_0= ruleAnnotation ) ) )* otherlv_22= '}' )? (otherlv_23= 'extensions' otherlv_24= '{' ( (lv_extensions_25_0= ruleAbstractExtension ) ) (otherlv_26= ',' ( (lv_extensions_27_0= ruleAbstractExtension ) ) )* otherlv_28= '}' )? (otherlv_29= 'attributes' otherlv_30= '{' ( (lv_attributes_31_0= ruleStringToAttributeMapEntry ) ) (otherlv_32= ',' ( (lv_attributes_33_0= ruleStringToAttributeMapEntry ) ) )* otherlv_34= '}' )? (otherlv_35= 'Parameters' ( (lv_parameters_36_0= ruleParameter ) ) (otherlv_37= ',' ( (lv_parameters_38_0= ruleParameter ) ) )* )? (otherlv_39= 'Guards' ( (lv_guards_40_0= ruleGuard ) ) (otherlv_41= '&' ( (lv_guards_42_0= ruleGuard ) ) )* )? (otherlv_43= 'Witnesses' ( (lv_witnesses_44_0= ruleWitness ) ) (otherlv_45= ',' ( (lv_witnesses_46_0= ruleWitness ) ) )* )? (otherlv_47= 'Actions' ( (lv_actions_48_0= ruleAction ) ) (otherlv_49= ' || ' ( (lv_actions_50_0= ruleAction ) ) )* )?
            {
            // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:1822:2: ()
            // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:1823:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getEventAccess().getEventAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,45,FollowSets000.FOLLOW_45_in_ruleEvent3593); 

                	newLeafNode(otherlv_1, grammarAccess.getEventAccess().getEventKeyword_1());
                
            // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:1832:1: ( (lv_name_2_0= ruleEString ) )
            // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:1833:1: (lv_name_2_0= ruleEString )
            {
            // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:1833:1: (lv_name_2_0= ruleEString )
            // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:1834:3: lv_name_2_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getEventAccess().getNameEStringParserRuleCall_2_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleEvent3614);
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

            // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:1850:2: ( (lv_localGenerated_3_0= 'localGenerated' ) )?
            int alt60=2;
            int LA60_0 = input.LA(1);

            if ( (LA60_0==11) ) {
                alt60=1;
            }
            switch (alt60) {
                case 1 :
                    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:1851:1: (lv_localGenerated_3_0= 'localGenerated' )
                    {
                    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:1851:1: (lv_localGenerated_3_0= 'localGenerated' )
                    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:1852:3: lv_localGenerated_3_0= 'localGenerated'
                    {
                    lv_localGenerated_3_0=(Token)match(input,11,FollowSets000.FOLLOW_11_in_ruleEvent3632); 

                            newLeafNode(lv_localGenerated_3_0, grammarAccess.getEventAccess().getLocalGeneratedLocalGeneratedKeyword_3_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getEventRule());
                    	        }
                           		setWithLastConsumed(current, "localGenerated", true, "localGenerated");
                    	    

                    }


                    }
                    break;

            }

            // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:1865:3: ( (lv_extended_4_0= 'extended' ) )?
            int alt61=2;
            int LA61_0 = input.LA(1);

            if ( (LA61_0==46) ) {
                alt61=1;
            }
            switch (alt61) {
                case 1 :
                    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:1866:1: (lv_extended_4_0= 'extended' )
                    {
                    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:1866:1: (lv_extended_4_0= 'extended' )
                    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:1867:3: lv_extended_4_0= 'extended'
                    {
                    lv_extended_4_0=(Token)match(input,46,FollowSets000.FOLLOW_46_in_ruleEvent3664); 

                            newLeafNode(lv_extended_4_0, grammarAccess.getEventAccess().getExtendedExtendedKeyword_4_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getEventRule());
                    	        }
                           		setWithLastConsumed(current, "extended", true, "extended");
                    	    

                    }


                    }
                    break;

            }

            // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:1880:3: (otherlv_5= 'internalId' ( (lv_internalId_6_0= ruleEString ) ) )?
            int alt62=2;
            int LA62_0 = input.LA(1);

            if ( (LA62_0==13) ) {
                alt62=1;
            }
            switch (alt62) {
                case 1 :
                    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:1880:5: otherlv_5= 'internalId' ( (lv_internalId_6_0= ruleEString ) )
                    {
                    otherlv_5=(Token)match(input,13,FollowSets000.FOLLOW_13_in_ruleEvent3691); 

                        	newLeafNode(otherlv_5, grammarAccess.getEventAccess().getInternalIdKeyword_5_0());
                        
                    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:1884:1: ( (lv_internalId_6_0= ruleEString ) )
                    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:1885:1: (lv_internalId_6_0= ruleEString )
                    {
                    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:1885:1: (lv_internalId_6_0= ruleEString )
                    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:1886:3: lv_internalId_6_0= ruleEString
                    {
                     
                    	        newCompositeNode(grammarAccess.getEventAccess().getInternalIdEStringParserRuleCall_5_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleEvent3712);
                    lv_internalId_6_0=ruleEString();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getEventRule());
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

            // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:1902:4: (otherlv_7= 'Comment' ( (lv_comment_8_0= ruleEString ) ) )?
            int alt63=2;
            int LA63_0 = input.LA(1);

            if ( (LA63_0==14) ) {
                alt63=1;
            }
            switch (alt63) {
                case 1 :
                    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:1902:6: otherlv_7= 'Comment' ( (lv_comment_8_0= ruleEString ) )
                    {
                    otherlv_7=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleEvent3727); 

                        	newLeafNode(otherlv_7, grammarAccess.getEventAccess().getCommentKeyword_6_0());
                        
                    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:1906:1: ( (lv_comment_8_0= ruleEString ) )
                    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:1907:1: (lv_comment_8_0= ruleEString )
                    {
                    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:1907:1: (lv_comment_8_0= ruleEString )
                    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:1908:3: lv_comment_8_0= ruleEString
                    {
                     
                    	        newCompositeNode(grammarAccess.getEventAccess().getCommentEStringParserRuleCall_6_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleEvent3748);
                    lv_comment_8_0=ruleEString();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getEventRule());
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

            // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:1924:4: (otherlv_9= 'Convergence' ( (lv_convergence_10_0= ruleConvergence ) ) )?
            int alt64=2;
            int LA64_0 = input.LA(1);

            if ( (LA64_0==47) ) {
                alt64=1;
            }
            switch (alt64) {
                case 1 :
                    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:1924:6: otherlv_9= 'Convergence' ( (lv_convergence_10_0= ruleConvergence ) )
                    {
                    otherlv_9=(Token)match(input,47,FollowSets000.FOLLOW_47_in_ruleEvent3763); 

                        	newLeafNode(otherlv_9, grammarAccess.getEventAccess().getConvergenceKeyword_7_0());
                        
                    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:1928:1: ( (lv_convergence_10_0= ruleConvergence ) )
                    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:1929:1: (lv_convergence_10_0= ruleConvergence )
                    {
                    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:1929:1: (lv_convergence_10_0= ruleConvergence )
                    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:1930:3: lv_convergence_10_0= ruleConvergence
                    {
                     
                    	        newCompositeNode(grammarAccess.getEventAccess().getConvergenceConvergenceEnumRuleCall_7_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleConvergence_in_ruleEvent3784);
                    lv_convergence_10_0=ruleConvergence();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getEventRule());
                    	        }
                           		set(
                           			current, 
                           			"convergence",
                            		lv_convergence_10_0, 
                            		"Convergence");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:1946:4: (otherlv_11= 'Refines' otherlv_12= '(' ( ( ruleEString ) ) (otherlv_14= ',' ( ( ruleEString ) ) )* otherlv_16= ')' )?
            int alt66=2;
            int LA66_0 = input.LA(1);

            if ( (LA66_0==15) ) {
                alt66=1;
            }
            switch (alt66) {
                case 1 :
                    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:1946:6: otherlv_11= 'Refines' otherlv_12= '(' ( ( ruleEString ) ) (otherlv_14= ',' ( ( ruleEString ) ) )* otherlv_16= ')'
                    {
                    otherlv_11=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleEvent3799); 

                        	newLeafNode(otherlv_11, grammarAccess.getEventAccess().getRefinesKeyword_8_0());
                        
                    otherlv_12=(Token)match(input,16,FollowSets000.FOLLOW_16_in_ruleEvent3811); 

                        	newLeafNode(otherlv_12, grammarAccess.getEventAccess().getLeftParenthesisKeyword_8_1());
                        
                    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:1954:1: ( ( ruleEString ) )
                    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:1955:1: ( ruleEString )
                    {
                    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:1955:1: ( ruleEString )
                    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:1956:3: ruleEString
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getEventRule());
                    	        }
                            
                     
                    	        newCompositeNode(grammarAccess.getEventAccess().getRefinesEventCrossReference_8_2_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleEvent3834);
                    ruleEString();

                    state._fsp--;

                     
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:1969:2: (otherlv_14= ',' ( ( ruleEString ) ) )*
                    loop65:
                    do {
                        int alt65=2;
                        int LA65_0 = input.LA(1);

                        if ( (LA65_0==17) ) {
                            alt65=1;
                        }


                        switch (alt65) {
                    	case 1 :
                    	    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:1969:4: otherlv_14= ',' ( ( ruleEString ) )
                    	    {
                    	    otherlv_14=(Token)match(input,17,FollowSets000.FOLLOW_17_in_ruleEvent3847); 

                    	        	newLeafNode(otherlv_14, grammarAccess.getEventAccess().getCommaKeyword_8_3_0());
                    	        
                    	    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:1973:1: ( ( ruleEString ) )
                    	    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:1974:1: ( ruleEString )
                    	    {
                    	    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:1974:1: ( ruleEString )
                    	    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:1975:3: ruleEString
                    	    {

                    	    			if (current==null) {
                    	    	            current = createModelElement(grammarAccess.getEventRule());
                    	    	        }
                    	            
                    	     
                    	    	        newCompositeNode(grammarAccess.getEventAccess().getRefinesEventCrossReference_8_3_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleEvent3870);
                    	    ruleEString();

                    	    state._fsp--;

                    	     
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop65;
                        }
                    } while (true);

                    otherlv_16=(Token)match(input,18,FollowSets000.FOLLOW_18_in_ruleEvent3884); 

                        	newLeafNode(otherlv_16, grammarAccess.getEventAccess().getRightParenthesisKeyword_8_4());
                        

                    }
                    break;

            }

            // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:1992:3: (otherlv_17= 'annotations' otherlv_18= '{' ( (lv_annotations_19_0= ruleAnnotation ) ) (otherlv_20= ',' ( (lv_annotations_21_0= ruleAnnotation ) ) )* otherlv_22= '}' )?
            int alt68=2;
            int LA68_0 = input.LA(1);

            if ( (LA68_0==20) ) {
                alt68=1;
            }
            switch (alt68) {
                case 1 :
                    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:1992:5: otherlv_17= 'annotations' otherlv_18= '{' ( (lv_annotations_19_0= ruleAnnotation ) ) (otherlv_20= ',' ( (lv_annotations_21_0= ruleAnnotation ) ) )* otherlv_22= '}'
                    {
                    otherlv_17=(Token)match(input,20,FollowSets000.FOLLOW_20_in_ruleEvent3899); 

                        	newLeafNode(otherlv_17, grammarAccess.getEventAccess().getAnnotationsKeyword_9_0());
                        
                    otherlv_18=(Token)match(input,21,FollowSets000.FOLLOW_21_in_ruleEvent3911); 

                        	newLeafNode(otherlv_18, grammarAccess.getEventAccess().getLeftCurlyBracketKeyword_9_1());
                        
                    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:2000:1: ( (lv_annotations_19_0= ruleAnnotation ) )
                    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:2001:1: (lv_annotations_19_0= ruleAnnotation )
                    {
                    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:2001:1: (lv_annotations_19_0= ruleAnnotation )
                    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:2002:3: lv_annotations_19_0= ruleAnnotation
                    {
                     
                    	        newCompositeNode(grammarAccess.getEventAccess().getAnnotationsAnnotationParserRuleCall_9_2_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleAnnotation_in_ruleEvent3932);
                    lv_annotations_19_0=ruleAnnotation();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getEventRule());
                    	        }
                           		add(
                           			current, 
                           			"annotations",
                            		lv_annotations_19_0, 
                            		"Annotation");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:2018:2: (otherlv_20= ',' ( (lv_annotations_21_0= ruleAnnotation ) ) )*
                    loop67:
                    do {
                        int alt67=2;
                        int LA67_0 = input.LA(1);

                        if ( (LA67_0==17) ) {
                            alt67=1;
                        }


                        switch (alt67) {
                    	case 1 :
                    	    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:2018:4: otherlv_20= ',' ( (lv_annotations_21_0= ruleAnnotation ) )
                    	    {
                    	    otherlv_20=(Token)match(input,17,FollowSets000.FOLLOW_17_in_ruleEvent3945); 

                    	        	newLeafNode(otherlv_20, grammarAccess.getEventAccess().getCommaKeyword_9_3_0());
                    	        
                    	    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:2022:1: ( (lv_annotations_21_0= ruleAnnotation ) )
                    	    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:2023:1: (lv_annotations_21_0= ruleAnnotation )
                    	    {
                    	    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:2023:1: (lv_annotations_21_0= ruleAnnotation )
                    	    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:2024:3: lv_annotations_21_0= ruleAnnotation
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getEventAccess().getAnnotationsAnnotationParserRuleCall_9_3_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleAnnotation_in_ruleEvent3966);
                    	    lv_annotations_21_0=ruleAnnotation();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getEventRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"annotations",
                    	            		lv_annotations_21_0, 
                    	            		"Annotation");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop67;
                        }
                    } while (true);

                    otherlv_22=(Token)match(input,22,FollowSets000.FOLLOW_22_in_ruleEvent3980); 

                        	newLeafNode(otherlv_22, grammarAccess.getEventAccess().getRightCurlyBracketKeyword_9_4());
                        

                    }
                    break;

            }

            // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:2044:3: (otherlv_23= 'extensions' otherlv_24= '{' ( (lv_extensions_25_0= ruleAbstractExtension ) ) (otherlv_26= ',' ( (lv_extensions_27_0= ruleAbstractExtension ) ) )* otherlv_28= '}' )?
            int alt70=2;
            int LA70_0 = input.LA(1);

            if ( (LA70_0==23) ) {
                alt70=1;
            }
            switch (alt70) {
                case 1 :
                    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:2044:5: otherlv_23= 'extensions' otherlv_24= '{' ( (lv_extensions_25_0= ruleAbstractExtension ) ) (otherlv_26= ',' ( (lv_extensions_27_0= ruleAbstractExtension ) ) )* otherlv_28= '}'
                    {
                    otherlv_23=(Token)match(input,23,FollowSets000.FOLLOW_23_in_ruleEvent3995); 

                        	newLeafNode(otherlv_23, grammarAccess.getEventAccess().getExtensionsKeyword_10_0());
                        
                    otherlv_24=(Token)match(input,21,FollowSets000.FOLLOW_21_in_ruleEvent4007); 

                        	newLeafNode(otherlv_24, grammarAccess.getEventAccess().getLeftCurlyBracketKeyword_10_1());
                        
                    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:2052:1: ( (lv_extensions_25_0= ruleAbstractExtension ) )
                    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:2053:1: (lv_extensions_25_0= ruleAbstractExtension )
                    {
                    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:2053:1: (lv_extensions_25_0= ruleAbstractExtension )
                    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:2054:3: lv_extensions_25_0= ruleAbstractExtension
                    {
                     
                    	        newCompositeNode(grammarAccess.getEventAccess().getExtensionsAbstractExtensionParserRuleCall_10_2_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleAbstractExtension_in_ruleEvent4028);
                    lv_extensions_25_0=ruleAbstractExtension();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getEventRule());
                    	        }
                           		add(
                           			current, 
                           			"extensions",
                            		lv_extensions_25_0, 
                            		"AbstractExtension");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:2070:2: (otherlv_26= ',' ( (lv_extensions_27_0= ruleAbstractExtension ) ) )*
                    loop69:
                    do {
                        int alt69=2;
                        int LA69_0 = input.LA(1);

                        if ( (LA69_0==17) ) {
                            alt69=1;
                        }


                        switch (alt69) {
                    	case 1 :
                    	    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:2070:4: otherlv_26= ',' ( (lv_extensions_27_0= ruleAbstractExtension ) )
                    	    {
                    	    otherlv_26=(Token)match(input,17,FollowSets000.FOLLOW_17_in_ruleEvent4041); 

                    	        	newLeafNode(otherlv_26, grammarAccess.getEventAccess().getCommaKeyword_10_3_0());
                    	        
                    	    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:2074:1: ( (lv_extensions_27_0= ruleAbstractExtension ) )
                    	    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:2075:1: (lv_extensions_27_0= ruleAbstractExtension )
                    	    {
                    	    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:2075:1: (lv_extensions_27_0= ruleAbstractExtension )
                    	    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:2076:3: lv_extensions_27_0= ruleAbstractExtension
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getEventAccess().getExtensionsAbstractExtensionParserRuleCall_10_3_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleAbstractExtension_in_ruleEvent4062);
                    	    lv_extensions_27_0=ruleAbstractExtension();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getEventRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"extensions",
                    	            		lv_extensions_27_0, 
                    	            		"AbstractExtension");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop69;
                        }
                    } while (true);

                    otherlv_28=(Token)match(input,22,FollowSets000.FOLLOW_22_in_ruleEvent4076); 

                        	newLeafNode(otherlv_28, grammarAccess.getEventAccess().getRightCurlyBracketKeyword_10_4());
                        

                    }
                    break;

            }

            // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:2096:3: (otherlv_29= 'attributes' otherlv_30= '{' ( (lv_attributes_31_0= ruleStringToAttributeMapEntry ) ) (otherlv_32= ',' ( (lv_attributes_33_0= ruleStringToAttributeMapEntry ) ) )* otherlv_34= '}' )?
            int alt72=2;
            int LA72_0 = input.LA(1);

            if ( (LA72_0==24) ) {
                alt72=1;
            }
            switch (alt72) {
                case 1 :
                    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:2096:5: otherlv_29= 'attributes' otherlv_30= '{' ( (lv_attributes_31_0= ruleStringToAttributeMapEntry ) ) (otherlv_32= ',' ( (lv_attributes_33_0= ruleStringToAttributeMapEntry ) ) )* otherlv_34= '}'
                    {
                    otherlv_29=(Token)match(input,24,FollowSets000.FOLLOW_24_in_ruleEvent4091); 

                        	newLeafNode(otherlv_29, grammarAccess.getEventAccess().getAttributesKeyword_11_0());
                        
                    otherlv_30=(Token)match(input,21,FollowSets000.FOLLOW_21_in_ruleEvent4103); 

                        	newLeafNode(otherlv_30, grammarAccess.getEventAccess().getLeftCurlyBracketKeyword_11_1());
                        
                    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:2104:1: ( (lv_attributes_31_0= ruleStringToAttributeMapEntry ) )
                    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:2105:1: (lv_attributes_31_0= ruleStringToAttributeMapEntry )
                    {
                    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:2105:1: (lv_attributes_31_0= ruleStringToAttributeMapEntry )
                    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:2106:3: lv_attributes_31_0= ruleStringToAttributeMapEntry
                    {
                     
                    	        newCompositeNode(grammarAccess.getEventAccess().getAttributesStringToAttributeMapEntryParserRuleCall_11_2_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleStringToAttributeMapEntry_in_ruleEvent4124);
                    lv_attributes_31_0=ruleStringToAttributeMapEntry();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getEventRule());
                    	        }
                           		add(
                           			current, 
                           			"attributes",
                            		lv_attributes_31_0, 
                            		"StringToAttributeMapEntry");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:2122:2: (otherlv_32= ',' ( (lv_attributes_33_0= ruleStringToAttributeMapEntry ) ) )*
                    loop71:
                    do {
                        int alt71=2;
                        int LA71_0 = input.LA(1);

                        if ( (LA71_0==17) ) {
                            alt71=1;
                        }


                        switch (alt71) {
                    	case 1 :
                    	    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:2122:4: otherlv_32= ',' ( (lv_attributes_33_0= ruleStringToAttributeMapEntry ) )
                    	    {
                    	    otherlv_32=(Token)match(input,17,FollowSets000.FOLLOW_17_in_ruleEvent4137); 

                    	        	newLeafNode(otherlv_32, grammarAccess.getEventAccess().getCommaKeyword_11_3_0());
                    	        
                    	    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:2126:1: ( (lv_attributes_33_0= ruleStringToAttributeMapEntry ) )
                    	    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:2127:1: (lv_attributes_33_0= ruleStringToAttributeMapEntry )
                    	    {
                    	    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:2127:1: (lv_attributes_33_0= ruleStringToAttributeMapEntry )
                    	    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:2128:3: lv_attributes_33_0= ruleStringToAttributeMapEntry
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getEventAccess().getAttributesStringToAttributeMapEntryParserRuleCall_11_3_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleStringToAttributeMapEntry_in_ruleEvent4158);
                    	    lv_attributes_33_0=ruleStringToAttributeMapEntry();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getEventRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"attributes",
                    	            		lv_attributes_33_0, 
                    	            		"StringToAttributeMapEntry");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop71;
                        }
                    } while (true);

                    otherlv_34=(Token)match(input,22,FollowSets000.FOLLOW_22_in_ruleEvent4172); 

                        	newLeafNode(otherlv_34, grammarAccess.getEventAccess().getRightCurlyBracketKeyword_11_4());
                        

                    }
                    break;

            }

            // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:2148:3: (otherlv_35= 'Parameters' ( (lv_parameters_36_0= ruleParameter ) ) (otherlv_37= ',' ( (lv_parameters_38_0= ruleParameter ) ) )* )?
            int alt74=2;
            int LA74_0 = input.LA(1);

            if ( (LA74_0==48) ) {
                alt74=1;
            }
            switch (alt74) {
                case 1 :
                    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:2148:5: otherlv_35= 'Parameters' ( (lv_parameters_36_0= ruleParameter ) ) (otherlv_37= ',' ( (lv_parameters_38_0= ruleParameter ) ) )*
                    {
                    otherlv_35=(Token)match(input,48,FollowSets000.FOLLOW_48_in_ruleEvent4187); 

                        	newLeafNode(otherlv_35, grammarAccess.getEventAccess().getParametersKeyword_12_0());
                        
                    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:2152:1: ( (lv_parameters_36_0= ruleParameter ) )
                    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:2153:1: (lv_parameters_36_0= ruleParameter )
                    {
                    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:2153:1: (lv_parameters_36_0= ruleParameter )
                    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:2154:3: lv_parameters_36_0= ruleParameter
                    {
                     
                    	        newCompositeNode(grammarAccess.getEventAccess().getParametersParameterParserRuleCall_12_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleParameter_in_ruleEvent4208);
                    lv_parameters_36_0=ruleParameter();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getEventRule());
                    	        }
                           		add(
                           			current, 
                           			"parameters",
                            		lv_parameters_36_0, 
                            		"Parameter");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:2170:2: (otherlv_37= ',' ( (lv_parameters_38_0= ruleParameter ) ) )*
                    loop73:
                    do {
                        int alt73=2;
                        int LA73_0 = input.LA(1);

                        if ( (LA73_0==17) ) {
                            alt73=1;
                        }


                        switch (alt73) {
                    	case 1 :
                    	    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:2170:4: otherlv_37= ',' ( (lv_parameters_38_0= ruleParameter ) )
                    	    {
                    	    otherlv_37=(Token)match(input,17,FollowSets000.FOLLOW_17_in_ruleEvent4221); 

                    	        	newLeafNode(otherlv_37, grammarAccess.getEventAccess().getCommaKeyword_12_2_0());
                    	        
                    	    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:2174:1: ( (lv_parameters_38_0= ruleParameter ) )
                    	    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:2175:1: (lv_parameters_38_0= ruleParameter )
                    	    {
                    	    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:2175:1: (lv_parameters_38_0= ruleParameter )
                    	    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:2176:3: lv_parameters_38_0= ruleParameter
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getEventAccess().getParametersParameterParserRuleCall_12_2_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleParameter_in_ruleEvent4242);
                    	    lv_parameters_38_0=ruleParameter();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getEventRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"parameters",
                    	            		lv_parameters_38_0, 
                    	            		"Parameter");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop73;
                        }
                    } while (true);


                    }
                    break;

            }

            // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:2192:6: (otherlv_39= 'Guards' ( (lv_guards_40_0= ruleGuard ) ) (otherlv_41= '&' ( (lv_guards_42_0= ruleGuard ) ) )* )?
            int alt76=2;
            int LA76_0 = input.LA(1);

            if ( (LA76_0==49) ) {
                alt76=1;
            }
            switch (alt76) {
                case 1 :
                    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:2192:8: otherlv_39= 'Guards' ( (lv_guards_40_0= ruleGuard ) ) (otherlv_41= '&' ( (lv_guards_42_0= ruleGuard ) ) )*
                    {
                    otherlv_39=(Token)match(input,49,FollowSets000.FOLLOW_49_in_ruleEvent4259); 

                        	newLeafNode(otherlv_39, grammarAccess.getEventAccess().getGuardsKeyword_13_0());
                        
                    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:2196:1: ( (lv_guards_40_0= ruleGuard ) )
                    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:2197:1: (lv_guards_40_0= ruleGuard )
                    {
                    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:2197:1: (lv_guards_40_0= ruleGuard )
                    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:2198:3: lv_guards_40_0= ruleGuard
                    {
                     
                    	        newCompositeNode(grammarAccess.getEventAccess().getGuardsGuardParserRuleCall_13_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleGuard_in_ruleEvent4280);
                    lv_guards_40_0=ruleGuard();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getEventRule());
                    	        }
                           		add(
                           			current, 
                           			"guards",
                            		lv_guards_40_0, 
                            		"Guard");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:2214:2: (otherlv_41= '&' ( (lv_guards_42_0= ruleGuard ) ) )*
                    loop75:
                    do {
                        int alt75=2;
                        int LA75_0 = input.LA(1);

                        if ( (LA75_0==27) ) {
                            alt75=1;
                        }


                        switch (alt75) {
                    	case 1 :
                    	    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:2214:4: otherlv_41= '&' ( (lv_guards_42_0= ruleGuard ) )
                    	    {
                    	    otherlv_41=(Token)match(input,27,FollowSets000.FOLLOW_27_in_ruleEvent4293); 

                    	        	newLeafNode(otherlv_41, grammarAccess.getEventAccess().getAmpersandKeyword_13_2_0());
                    	        
                    	    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:2218:1: ( (lv_guards_42_0= ruleGuard ) )
                    	    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:2219:1: (lv_guards_42_0= ruleGuard )
                    	    {
                    	    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:2219:1: (lv_guards_42_0= ruleGuard )
                    	    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:2220:3: lv_guards_42_0= ruleGuard
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getEventAccess().getGuardsGuardParserRuleCall_13_2_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleGuard_in_ruleEvent4314);
                    	    lv_guards_42_0=ruleGuard();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getEventRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"guards",
                    	            		lv_guards_42_0, 
                    	            		"Guard");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop75;
                        }
                    } while (true);


                    }
                    break;

            }

            // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:2236:6: (otherlv_43= 'Witnesses' ( (lv_witnesses_44_0= ruleWitness ) ) (otherlv_45= ',' ( (lv_witnesses_46_0= ruleWitness ) ) )* )?
            int alt78=2;
            int LA78_0 = input.LA(1);

            if ( (LA78_0==50) ) {
                alt78=1;
            }
            switch (alt78) {
                case 1 :
                    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:2236:8: otherlv_43= 'Witnesses' ( (lv_witnesses_44_0= ruleWitness ) ) (otherlv_45= ',' ( (lv_witnesses_46_0= ruleWitness ) ) )*
                    {
                    otherlv_43=(Token)match(input,50,FollowSets000.FOLLOW_50_in_ruleEvent4331); 

                        	newLeafNode(otherlv_43, grammarAccess.getEventAccess().getWitnessesKeyword_14_0());
                        
                    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:2240:1: ( (lv_witnesses_44_0= ruleWitness ) )
                    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:2241:1: (lv_witnesses_44_0= ruleWitness )
                    {
                    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:2241:1: (lv_witnesses_44_0= ruleWitness )
                    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:2242:3: lv_witnesses_44_0= ruleWitness
                    {
                     
                    	        newCompositeNode(grammarAccess.getEventAccess().getWitnessesWitnessParserRuleCall_14_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleWitness_in_ruleEvent4352);
                    lv_witnesses_44_0=ruleWitness();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getEventRule());
                    	        }
                           		add(
                           			current, 
                           			"witnesses",
                            		lv_witnesses_44_0, 
                            		"Witness");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:2258:2: (otherlv_45= ',' ( (lv_witnesses_46_0= ruleWitness ) ) )*
                    loop77:
                    do {
                        int alt77=2;
                        int LA77_0 = input.LA(1);

                        if ( (LA77_0==17) ) {
                            alt77=1;
                        }


                        switch (alt77) {
                    	case 1 :
                    	    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:2258:4: otherlv_45= ',' ( (lv_witnesses_46_0= ruleWitness ) )
                    	    {
                    	    otherlv_45=(Token)match(input,17,FollowSets000.FOLLOW_17_in_ruleEvent4365); 

                    	        	newLeafNode(otherlv_45, grammarAccess.getEventAccess().getCommaKeyword_14_2_0());
                    	        
                    	    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:2262:1: ( (lv_witnesses_46_0= ruleWitness ) )
                    	    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:2263:1: (lv_witnesses_46_0= ruleWitness )
                    	    {
                    	    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:2263:1: (lv_witnesses_46_0= ruleWitness )
                    	    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:2264:3: lv_witnesses_46_0= ruleWitness
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getEventAccess().getWitnessesWitnessParserRuleCall_14_2_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleWitness_in_ruleEvent4386);
                    	    lv_witnesses_46_0=ruleWitness();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getEventRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"witnesses",
                    	            		lv_witnesses_46_0, 
                    	            		"Witness");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop77;
                        }
                    } while (true);


                    }
                    break;

            }

            // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:2280:6: (otherlv_47= 'Actions' ( (lv_actions_48_0= ruleAction ) ) (otherlv_49= ' || ' ( (lv_actions_50_0= ruleAction ) ) )* )?
            int alt80=2;
            int LA80_0 = input.LA(1);

            if ( (LA80_0==51) ) {
                alt80=1;
            }
            switch (alt80) {
                case 1 :
                    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:2280:8: otherlv_47= 'Actions' ( (lv_actions_48_0= ruleAction ) ) (otherlv_49= ' || ' ( (lv_actions_50_0= ruleAction ) ) )*
                    {
                    otherlv_47=(Token)match(input,51,FollowSets000.FOLLOW_51_in_ruleEvent4403); 

                        	newLeafNode(otherlv_47, grammarAccess.getEventAccess().getActionsKeyword_15_0());
                        
                    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:2284:1: ( (lv_actions_48_0= ruleAction ) )
                    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:2285:1: (lv_actions_48_0= ruleAction )
                    {
                    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:2285:1: (lv_actions_48_0= ruleAction )
                    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:2286:3: lv_actions_48_0= ruleAction
                    {
                     
                    	        newCompositeNode(grammarAccess.getEventAccess().getActionsActionParserRuleCall_15_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleAction_in_ruleEvent4424);
                    lv_actions_48_0=ruleAction();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getEventRule());
                    	        }
                           		add(
                           			current, 
                           			"actions",
                            		lv_actions_48_0, 
                            		"Action");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:2302:2: (otherlv_49= ' || ' ( (lv_actions_50_0= ruleAction ) ) )*
                    loop79:
                    do {
                        int alt79=2;
                        int LA79_0 = input.LA(1);

                        if ( (LA79_0==52) ) {
                            alt79=1;
                        }


                        switch (alt79) {
                    	case 1 :
                    	    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:2302:4: otherlv_49= ' || ' ( (lv_actions_50_0= ruleAction ) )
                    	    {
                    	    otherlv_49=(Token)match(input,52,FollowSets000.FOLLOW_52_in_ruleEvent4437); 

                    	        	newLeafNode(otherlv_49, grammarAccess.getEventAccess().getSpaceVerticalLineVerticalLineSpaceKeyword_15_2_0());
                    	        
                    	    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:2306:1: ( (lv_actions_50_0= ruleAction ) )
                    	    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:2307:1: (lv_actions_50_0= ruleAction )
                    	    {
                    	    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:2307:1: (lv_actions_50_0= ruleAction )
                    	    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:2308:3: lv_actions_50_0= ruleAction
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getEventAccess().getActionsActionParserRuleCall_15_2_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleAction_in_ruleEvent4458);
                    	    lv_actions_50_0=ruleAction();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getEventRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"actions",
                    	            		lv_actions_50_0, 
                    	            		"Action");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop79;
                        }
                    } while (true);


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
    // $ANTLR end "ruleEvent"


    // $ANTLR start "entryRuleStringToStringMapEntry"
    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:2332:1: entryRuleStringToStringMapEntry returns [EObject current=null] : iv_ruleStringToStringMapEntry= ruleStringToStringMapEntry EOF ;
    public final EObject entryRuleStringToStringMapEntry() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStringToStringMapEntry = null;


        try {
            // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:2333:2: (iv_ruleStringToStringMapEntry= ruleStringToStringMapEntry EOF )
            // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:2334:2: iv_ruleStringToStringMapEntry= ruleStringToStringMapEntry EOF
            {
             newCompositeNode(grammarAccess.getStringToStringMapEntryRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleStringToStringMapEntry_in_entryRuleStringToStringMapEntry4498);
            iv_ruleStringToStringMapEntry=ruleStringToStringMapEntry();

            state._fsp--;

             current =iv_ruleStringToStringMapEntry; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleStringToStringMapEntry4508); 

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
    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:2341:1: ruleStringToStringMapEntry returns [EObject current=null] : ( () otherlv_1= 'StringToStringMapEntry' otherlv_2= '{' (otherlv_3= 'key' ( (lv_key_4_0= ruleEString ) ) )? (otherlv_5= 'value' ( (lv_value_6_0= ruleEString ) ) )? otherlv_7= '}' ) ;
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
            // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:2344:28: ( ( () otherlv_1= 'StringToStringMapEntry' otherlv_2= '{' (otherlv_3= 'key' ( (lv_key_4_0= ruleEString ) ) )? (otherlv_5= 'value' ( (lv_value_6_0= ruleEString ) ) )? otherlv_7= '}' ) )
            // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:2345:1: ( () otherlv_1= 'StringToStringMapEntry' otherlv_2= '{' (otherlv_3= 'key' ( (lv_key_4_0= ruleEString ) ) )? (otherlv_5= 'value' ( (lv_value_6_0= ruleEString ) ) )? otherlv_7= '}' )
            {
            // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:2345:1: ( () otherlv_1= 'StringToStringMapEntry' otherlv_2= '{' (otherlv_3= 'key' ( (lv_key_4_0= ruleEString ) ) )? (otherlv_5= 'value' ( (lv_value_6_0= ruleEString ) ) )? otherlv_7= '}' )
            // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:2345:2: () otherlv_1= 'StringToStringMapEntry' otherlv_2= '{' (otherlv_3= 'key' ( (lv_key_4_0= ruleEString ) ) )? (otherlv_5= 'value' ( (lv_value_6_0= ruleEString ) ) )? otherlv_7= '}'
            {
            // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:2345:2: ()
            // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:2346:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getStringToStringMapEntryAccess().getStringToStringMapEntryAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,53,FollowSets000.FOLLOW_53_in_ruleStringToStringMapEntry4554); 

                	newLeafNode(otherlv_1, grammarAccess.getStringToStringMapEntryAccess().getStringToStringMapEntryKeyword_1());
                
            otherlv_2=(Token)match(input,21,FollowSets000.FOLLOW_21_in_ruleStringToStringMapEntry4566); 

                	newLeafNode(otherlv_2, grammarAccess.getStringToStringMapEntryAccess().getLeftCurlyBracketKeyword_2());
                
            // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:2359:1: (otherlv_3= 'key' ( (lv_key_4_0= ruleEString ) ) )?
            int alt81=2;
            int LA81_0 = input.LA(1);

            if ( (LA81_0==36) ) {
                alt81=1;
            }
            switch (alt81) {
                case 1 :
                    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:2359:3: otherlv_3= 'key' ( (lv_key_4_0= ruleEString ) )
                    {
                    otherlv_3=(Token)match(input,36,FollowSets000.FOLLOW_36_in_ruleStringToStringMapEntry4579); 

                        	newLeafNode(otherlv_3, grammarAccess.getStringToStringMapEntryAccess().getKeyKeyword_3_0());
                        
                    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:2363:1: ( (lv_key_4_0= ruleEString ) )
                    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:2364:1: (lv_key_4_0= ruleEString )
                    {
                    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:2364:1: (lv_key_4_0= ruleEString )
                    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:2365:3: lv_key_4_0= ruleEString
                    {
                     
                    	        newCompositeNode(grammarAccess.getStringToStringMapEntryAccess().getKeyEStringParserRuleCall_3_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleStringToStringMapEntry4600);
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

            // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:2381:4: (otherlv_5= 'value' ( (lv_value_6_0= ruleEString ) ) )?
            int alt82=2;
            int LA82_0 = input.LA(1);

            if ( (LA82_0==37) ) {
                alt82=1;
            }
            switch (alt82) {
                case 1 :
                    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:2381:6: otherlv_5= 'value' ( (lv_value_6_0= ruleEString ) )
                    {
                    otherlv_5=(Token)match(input,37,FollowSets000.FOLLOW_37_in_ruleStringToStringMapEntry4615); 

                        	newLeafNode(otherlv_5, grammarAccess.getStringToStringMapEntryAccess().getValueKeyword_4_0());
                        
                    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:2385:1: ( (lv_value_6_0= ruleEString ) )
                    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:2386:1: (lv_value_6_0= ruleEString )
                    {
                    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:2386:1: (lv_value_6_0= ruleEString )
                    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:2387:3: lv_value_6_0= ruleEString
                    {
                     
                    	        newCompositeNode(grammarAccess.getStringToStringMapEntryAccess().getValueEStringParserRuleCall_4_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleStringToStringMapEntry4636);
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

            otherlv_7=(Token)match(input,22,FollowSets000.FOLLOW_22_in_ruleStringToStringMapEntry4650); 

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
    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:2415:1: entryRuleEObject returns [EObject current=null] : iv_ruleEObject= ruleEObject EOF ;
    public final EObject entryRuleEObject() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEObject = null;


        try {
            // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:2416:2: (iv_ruleEObject= ruleEObject EOF )
            // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:2417:2: iv_ruleEObject= ruleEObject EOF
            {
             newCompositeNode(grammarAccess.getEObjectRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleEObject_in_entryRuleEObject4686);
            iv_ruleEObject=ruleEObject();

            state._fsp--;

             current =iv_ruleEObject; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleEObject4696); 

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
    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:2424:1: ruleEObject returns [EObject current=null] : ( () otherlv_1= 'EObject' ) ;
    public final EObject ruleEObject() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:2427:28: ( ( () otherlv_1= 'EObject' ) )
            // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:2428:1: ( () otherlv_1= 'EObject' )
            {
            // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:2428:1: ( () otherlv_1= 'EObject' )
            // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:2428:2: () otherlv_1= 'EObject'
            {
            // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:2428:2: ()
            // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:2429:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getEObjectAccess().getEObjectAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,54,FollowSets000.FOLLOW_54_in_ruleEObject4742); 

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
    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:2446:1: entryRuleExtension returns [EObject current=null] : iv_ruleExtension= ruleExtension EOF ;
    public final EObject entryRuleExtension() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExtension = null;


        try {
            // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:2447:2: (iv_ruleExtension= ruleExtension EOF )
            // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:2448:2: iv_ruleExtension= ruleExtension EOF
            {
             newCompositeNode(grammarAccess.getExtensionRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleExtension_in_entryRuleExtension4778);
            iv_ruleExtension=ruleExtension();

            state._fsp--;

             current =iv_ruleExtension; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleExtension4788); 

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
    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:2455:1: ruleExtension returns [EObject current=null] : ( ( (lv_localGenerated_0_0= 'localGenerated' ) )? otherlv_1= 'Extension' otherlv_2= '{' (otherlv_3= 'internalId' ( (lv_internalId_4_0= ruleEString ) ) )? otherlv_5= 'extensionId' ( (lv_extensionId_6_0= ruleEString ) ) (otherlv_7= 'annotations' otherlv_8= '{' ( (lv_annotations_9_0= ruleAnnotation ) ) (otherlv_10= ',' ( (lv_annotations_11_0= ruleAnnotation ) ) )* otherlv_12= '}' )? (otherlv_13= 'extensions' otherlv_14= '{' ( (lv_extensions_15_0= ruleAbstractExtension ) ) (otherlv_16= ',' ( (lv_extensions_17_0= ruleAbstractExtension ) ) )* otherlv_18= '}' )? (otherlv_19= 'attributes' otherlv_20= '{' ( (lv_attributes_21_0= ruleStringToAttributeMapEntry ) ) (otherlv_22= ',' ( (lv_attributes_23_0= ruleStringToAttributeMapEntry ) ) )* otherlv_24= '}' )? otherlv_25= '}' ) ;
    public final EObject ruleExtension() throws RecognitionException {
        EObject current = null;

        Token lv_localGenerated_0_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        Token otherlv_13=null;
        Token otherlv_14=null;
        Token otherlv_16=null;
        Token otherlv_18=null;
        Token otherlv_19=null;
        Token otherlv_20=null;
        Token otherlv_22=null;
        Token otherlv_24=null;
        Token otherlv_25=null;
        AntlrDatatypeRuleToken lv_internalId_4_0 = null;

        AntlrDatatypeRuleToken lv_extensionId_6_0 = null;

        EObject lv_annotations_9_0 = null;

        EObject lv_annotations_11_0 = null;

        EObject lv_extensions_15_0 = null;

        EObject lv_extensions_17_0 = null;

        EObject lv_attributes_21_0 = null;

        EObject lv_attributes_23_0 = null;


         enterRule(); 
            
        try {
            // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:2458:28: ( ( ( (lv_localGenerated_0_0= 'localGenerated' ) )? otherlv_1= 'Extension' otherlv_2= '{' (otherlv_3= 'internalId' ( (lv_internalId_4_0= ruleEString ) ) )? otherlv_5= 'extensionId' ( (lv_extensionId_6_0= ruleEString ) ) (otherlv_7= 'annotations' otherlv_8= '{' ( (lv_annotations_9_0= ruleAnnotation ) ) (otherlv_10= ',' ( (lv_annotations_11_0= ruleAnnotation ) ) )* otherlv_12= '}' )? (otherlv_13= 'extensions' otherlv_14= '{' ( (lv_extensions_15_0= ruleAbstractExtension ) ) (otherlv_16= ',' ( (lv_extensions_17_0= ruleAbstractExtension ) ) )* otherlv_18= '}' )? (otherlv_19= 'attributes' otherlv_20= '{' ( (lv_attributes_21_0= ruleStringToAttributeMapEntry ) ) (otherlv_22= ',' ( (lv_attributes_23_0= ruleStringToAttributeMapEntry ) ) )* otherlv_24= '}' )? otherlv_25= '}' ) )
            // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:2459:1: ( ( (lv_localGenerated_0_0= 'localGenerated' ) )? otherlv_1= 'Extension' otherlv_2= '{' (otherlv_3= 'internalId' ( (lv_internalId_4_0= ruleEString ) ) )? otherlv_5= 'extensionId' ( (lv_extensionId_6_0= ruleEString ) ) (otherlv_7= 'annotations' otherlv_8= '{' ( (lv_annotations_9_0= ruleAnnotation ) ) (otherlv_10= ',' ( (lv_annotations_11_0= ruleAnnotation ) ) )* otherlv_12= '}' )? (otherlv_13= 'extensions' otherlv_14= '{' ( (lv_extensions_15_0= ruleAbstractExtension ) ) (otherlv_16= ',' ( (lv_extensions_17_0= ruleAbstractExtension ) ) )* otherlv_18= '}' )? (otherlv_19= 'attributes' otherlv_20= '{' ( (lv_attributes_21_0= ruleStringToAttributeMapEntry ) ) (otherlv_22= ',' ( (lv_attributes_23_0= ruleStringToAttributeMapEntry ) ) )* otherlv_24= '}' )? otherlv_25= '}' )
            {
            // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:2459:1: ( ( (lv_localGenerated_0_0= 'localGenerated' ) )? otherlv_1= 'Extension' otherlv_2= '{' (otherlv_3= 'internalId' ( (lv_internalId_4_0= ruleEString ) ) )? otherlv_5= 'extensionId' ( (lv_extensionId_6_0= ruleEString ) ) (otherlv_7= 'annotations' otherlv_8= '{' ( (lv_annotations_9_0= ruleAnnotation ) ) (otherlv_10= ',' ( (lv_annotations_11_0= ruleAnnotation ) ) )* otherlv_12= '}' )? (otherlv_13= 'extensions' otherlv_14= '{' ( (lv_extensions_15_0= ruleAbstractExtension ) ) (otherlv_16= ',' ( (lv_extensions_17_0= ruleAbstractExtension ) ) )* otherlv_18= '}' )? (otherlv_19= 'attributes' otherlv_20= '{' ( (lv_attributes_21_0= ruleStringToAttributeMapEntry ) ) (otherlv_22= ',' ( (lv_attributes_23_0= ruleStringToAttributeMapEntry ) ) )* otherlv_24= '}' )? otherlv_25= '}' )
            // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:2459:2: ( (lv_localGenerated_0_0= 'localGenerated' ) )? otherlv_1= 'Extension' otherlv_2= '{' (otherlv_3= 'internalId' ( (lv_internalId_4_0= ruleEString ) ) )? otherlv_5= 'extensionId' ( (lv_extensionId_6_0= ruleEString ) ) (otherlv_7= 'annotations' otherlv_8= '{' ( (lv_annotations_9_0= ruleAnnotation ) ) (otherlv_10= ',' ( (lv_annotations_11_0= ruleAnnotation ) ) )* otherlv_12= '}' )? (otherlv_13= 'extensions' otherlv_14= '{' ( (lv_extensions_15_0= ruleAbstractExtension ) ) (otherlv_16= ',' ( (lv_extensions_17_0= ruleAbstractExtension ) ) )* otherlv_18= '}' )? (otherlv_19= 'attributes' otherlv_20= '{' ( (lv_attributes_21_0= ruleStringToAttributeMapEntry ) ) (otherlv_22= ',' ( (lv_attributes_23_0= ruleStringToAttributeMapEntry ) ) )* otherlv_24= '}' )? otherlv_25= '}'
            {
            // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:2459:2: ( (lv_localGenerated_0_0= 'localGenerated' ) )?
            int alt83=2;
            int LA83_0 = input.LA(1);

            if ( (LA83_0==11) ) {
                alt83=1;
            }
            switch (alt83) {
                case 1 :
                    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:2460:1: (lv_localGenerated_0_0= 'localGenerated' )
                    {
                    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:2460:1: (lv_localGenerated_0_0= 'localGenerated' )
                    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:2461:3: lv_localGenerated_0_0= 'localGenerated'
                    {
                    lv_localGenerated_0_0=(Token)match(input,11,FollowSets000.FOLLOW_11_in_ruleExtension4831); 

                            newLeafNode(lv_localGenerated_0_0, grammarAccess.getExtensionAccess().getLocalGeneratedLocalGeneratedKeyword_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getExtensionRule());
                    	        }
                           		setWithLastConsumed(current, "localGenerated", true, "localGenerated");
                    	    

                    }


                    }
                    break;

            }

            otherlv_1=(Token)match(input,55,FollowSets000.FOLLOW_55_in_ruleExtension4857); 

                	newLeafNode(otherlv_1, grammarAccess.getExtensionAccess().getExtensionKeyword_1());
                
            otherlv_2=(Token)match(input,21,FollowSets000.FOLLOW_21_in_ruleExtension4869); 

                	newLeafNode(otherlv_2, grammarAccess.getExtensionAccess().getLeftCurlyBracketKeyword_2());
                
            // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:2482:1: (otherlv_3= 'internalId' ( (lv_internalId_4_0= ruleEString ) ) )?
            int alt84=2;
            int LA84_0 = input.LA(1);

            if ( (LA84_0==13) ) {
                alt84=1;
            }
            switch (alt84) {
                case 1 :
                    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:2482:3: otherlv_3= 'internalId' ( (lv_internalId_4_0= ruleEString ) )
                    {
                    otherlv_3=(Token)match(input,13,FollowSets000.FOLLOW_13_in_ruleExtension4882); 

                        	newLeafNode(otherlv_3, grammarAccess.getExtensionAccess().getInternalIdKeyword_3_0());
                        
                    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:2486:1: ( (lv_internalId_4_0= ruleEString ) )
                    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:2487:1: (lv_internalId_4_0= ruleEString )
                    {
                    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:2487:1: (lv_internalId_4_0= ruleEString )
                    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:2488:3: lv_internalId_4_0= ruleEString
                    {
                     
                    	        newCompositeNode(grammarAccess.getExtensionAccess().getInternalIdEStringParserRuleCall_3_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleExtension4903);
                    lv_internalId_4_0=ruleEString();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getExtensionRule());
                    	        }
                           		set(
                           			current, 
                           			"internalId",
                            		lv_internalId_4_0, 
                            		"EString");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            otherlv_5=(Token)match(input,56,FollowSets000.FOLLOW_56_in_ruleExtension4917); 

                	newLeafNode(otherlv_5, grammarAccess.getExtensionAccess().getExtensionIdKeyword_4());
                
            // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:2508:1: ( (lv_extensionId_6_0= ruleEString ) )
            // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:2509:1: (lv_extensionId_6_0= ruleEString )
            {
            // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:2509:1: (lv_extensionId_6_0= ruleEString )
            // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:2510:3: lv_extensionId_6_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getExtensionAccess().getExtensionIdEStringParserRuleCall_5_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleExtension4938);
            lv_extensionId_6_0=ruleEString();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getExtensionRule());
            	        }
                   		set(
                   			current, 
                   			"extensionId",
                    		lv_extensionId_6_0, 
                    		"EString");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:2526:2: (otherlv_7= 'annotations' otherlv_8= '{' ( (lv_annotations_9_0= ruleAnnotation ) ) (otherlv_10= ',' ( (lv_annotations_11_0= ruleAnnotation ) ) )* otherlv_12= '}' )?
            int alt86=2;
            int LA86_0 = input.LA(1);

            if ( (LA86_0==20) ) {
                alt86=1;
            }
            switch (alt86) {
                case 1 :
                    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:2526:4: otherlv_7= 'annotations' otherlv_8= '{' ( (lv_annotations_9_0= ruleAnnotation ) ) (otherlv_10= ',' ( (lv_annotations_11_0= ruleAnnotation ) ) )* otherlv_12= '}'
                    {
                    otherlv_7=(Token)match(input,20,FollowSets000.FOLLOW_20_in_ruleExtension4951); 

                        	newLeafNode(otherlv_7, grammarAccess.getExtensionAccess().getAnnotationsKeyword_6_0());
                        
                    otherlv_8=(Token)match(input,21,FollowSets000.FOLLOW_21_in_ruleExtension4963); 

                        	newLeafNode(otherlv_8, grammarAccess.getExtensionAccess().getLeftCurlyBracketKeyword_6_1());
                        
                    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:2534:1: ( (lv_annotations_9_0= ruleAnnotation ) )
                    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:2535:1: (lv_annotations_9_0= ruleAnnotation )
                    {
                    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:2535:1: (lv_annotations_9_0= ruleAnnotation )
                    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:2536:3: lv_annotations_9_0= ruleAnnotation
                    {
                     
                    	        newCompositeNode(grammarAccess.getExtensionAccess().getAnnotationsAnnotationParserRuleCall_6_2_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleAnnotation_in_ruleExtension4984);
                    lv_annotations_9_0=ruleAnnotation();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getExtensionRule());
                    	        }
                           		add(
                           			current, 
                           			"annotations",
                            		lv_annotations_9_0, 
                            		"Annotation");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:2552:2: (otherlv_10= ',' ( (lv_annotations_11_0= ruleAnnotation ) ) )*
                    loop85:
                    do {
                        int alt85=2;
                        int LA85_0 = input.LA(1);

                        if ( (LA85_0==17) ) {
                            alt85=1;
                        }


                        switch (alt85) {
                    	case 1 :
                    	    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:2552:4: otherlv_10= ',' ( (lv_annotations_11_0= ruleAnnotation ) )
                    	    {
                    	    otherlv_10=(Token)match(input,17,FollowSets000.FOLLOW_17_in_ruleExtension4997); 

                    	        	newLeafNode(otherlv_10, grammarAccess.getExtensionAccess().getCommaKeyword_6_3_0());
                    	        
                    	    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:2556:1: ( (lv_annotations_11_0= ruleAnnotation ) )
                    	    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:2557:1: (lv_annotations_11_0= ruleAnnotation )
                    	    {
                    	    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:2557:1: (lv_annotations_11_0= ruleAnnotation )
                    	    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:2558:3: lv_annotations_11_0= ruleAnnotation
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getExtensionAccess().getAnnotationsAnnotationParserRuleCall_6_3_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleAnnotation_in_ruleExtension5018);
                    	    lv_annotations_11_0=ruleAnnotation();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getExtensionRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"annotations",
                    	            		lv_annotations_11_0, 
                    	            		"Annotation");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop85;
                        }
                    } while (true);

                    otherlv_12=(Token)match(input,22,FollowSets000.FOLLOW_22_in_ruleExtension5032); 

                        	newLeafNode(otherlv_12, grammarAccess.getExtensionAccess().getRightCurlyBracketKeyword_6_4());
                        

                    }
                    break;

            }

            // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:2578:3: (otherlv_13= 'extensions' otherlv_14= '{' ( (lv_extensions_15_0= ruleAbstractExtension ) ) (otherlv_16= ',' ( (lv_extensions_17_0= ruleAbstractExtension ) ) )* otherlv_18= '}' )?
            int alt88=2;
            int LA88_0 = input.LA(1);

            if ( (LA88_0==23) ) {
                alt88=1;
            }
            switch (alt88) {
                case 1 :
                    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:2578:5: otherlv_13= 'extensions' otherlv_14= '{' ( (lv_extensions_15_0= ruleAbstractExtension ) ) (otherlv_16= ',' ( (lv_extensions_17_0= ruleAbstractExtension ) ) )* otherlv_18= '}'
                    {
                    otherlv_13=(Token)match(input,23,FollowSets000.FOLLOW_23_in_ruleExtension5047); 

                        	newLeafNode(otherlv_13, grammarAccess.getExtensionAccess().getExtensionsKeyword_7_0());
                        
                    otherlv_14=(Token)match(input,21,FollowSets000.FOLLOW_21_in_ruleExtension5059); 

                        	newLeafNode(otherlv_14, grammarAccess.getExtensionAccess().getLeftCurlyBracketKeyword_7_1());
                        
                    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:2586:1: ( (lv_extensions_15_0= ruleAbstractExtension ) )
                    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:2587:1: (lv_extensions_15_0= ruleAbstractExtension )
                    {
                    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:2587:1: (lv_extensions_15_0= ruleAbstractExtension )
                    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:2588:3: lv_extensions_15_0= ruleAbstractExtension
                    {
                     
                    	        newCompositeNode(grammarAccess.getExtensionAccess().getExtensionsAbstractExtensionParserRuleCall_7_2_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleAbstractExtension_in_ruleExtension5080);
                    lv_extensions_15_0=ruleAbstractExtension();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getExtensionRule());
                    	        }
                           		add(
                           			current, 
                           			"extensions",
                            		lv_extensions_15_0, 
                            		"AbstractExtension");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:2604:2: (otherlv_16= ',' ( (lv_extensions_17_0= ruleAbstractExtension ) ) )*
                    loop87:
                    do {
                        int alt87=2;
                        int LA87_0 = input.LA(1);

                        if ( (LA87_0==17) ) {
                            alt87=1;
                        }


                        switch (alt87) {
                    	case 1 :
                    	    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:2604:4: otherlv_16= ',' ( (lv_extensions_17_0= ruleAbstractExtension ) )
                    	    {
                    	    otherlv_16=(Token)match(input,17,FollowSets000.FOLLOW_17_in_ruleExtension5093); 

                    	        	newLeafNode(otherlv_16, grammarAccess.getExtensionAccess().getCommaKeyword_7_3_0());
                    	        
                    	    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:2608:1: ( (lv_extensions_17_0= ruleAbstractExtension ) )
                    	    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:2609:1: (lv_extensions_17_0= ruleAbstractExtension )
                    	    {
                    	    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:2609:1: (lv_extensions_17_0= ruleAbstractExtension )
                    	    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:2610:3: lv_extensions_17_0= ruleAbstractExtension
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getExtensionAccess().getExtensionsAbstractExtensionParserRuleCall_7_3_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleAbstractExtension_in_ruleExtension5114);
                    	    lv_extensions_17_0=ruleAbstractExtension();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getExtensionRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"extensions",
                    	            		lv_extensions_17_0, 
                    	            		"AbstractExtension");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop87;
                        }
                    } while (true);

                    otherlv_18=(Token)match(input,22,FollowSets000.FOLLOW_22_in_ruleExtension5128); 

                        	newLeafNode(otherlv_18, grammarAccess.getExtensionAccess().getRightCurlyBracketKeyword_7_4());
                        

                    }
                    break;

            }

            // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:2630:3: (otherlv_19= 'attributes' otherlv_20= '{' ( (lv_attributes_21_0= ruleStringToAttributeMapEntry ) ) (otherlv_22= ',' ( (lv_attributes_23_0= ruleStringToAttributeMapEntry ) ) )* otherlv_24= '}' )?
            int alt90=2;
            int LA90_0 = input.LA(1);

            if ( (LA90_0==24) ) {
                alt90=1;
            }
            switch (alt90) {
                case 1 :
                    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:2630:5: otherlv_19= 'attributes' otherlv_20= '{' ( (lv_attributes_21_0= ruleStringToAttributeMapEntry ) ) (otherlv_22= ',' ( (lv_attributes_23_0= ruleStringToAttributeMapEntry ) ) )* otherlv_24= '}'
                    {
                    otherlv_19=(Token)match(input,24,FollowSets000.FOLLOW_24_in_ruleExtension5143); 

                        	newLeafNode(otherlv_19, grammarAccess.getExtensionAccess().getAttributesKeyword_8_0());
                        
                    otherlv_20=(Token)match(input,21,FollowSets000.FOLLOW_21_in_ruleExtension5155); 

                        	newLeafNode(otherlv_20, grammarAccess.getExtensionAccess().getLeftCurlyBracketKeyword_8_1());
                        
                    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:2638:1: ( (lv_attributes_21_0= ruleStringToAttributeMapEntry ) )
                    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:2639:1: (lv_attributes_21_0= ruleStringToAttributeMapEntry )
                    {
                    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:2639:1: (lv_attributes_21_0= ruleStringToAttributeMapEntry )
                    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:2640:3: lv_attributes_21_0= ruleStringToAttributeMapEntry
                    {
                     
                    	        newCompositeNode(grammarAccess.getExtensionAccess().getAttributesStringToAttributeMapEntryParserRuleCall_8_2_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleStringToAttributeMapEntry_in_ruleExtension5176);
                    lv_attributes_21_0=ruleStringToAttributeMapEntry();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getExtensionRule());
                    	        }
                           		add(
                           			current, 
                           			"attributes",
                            		lv_attributes_21_0, 
                            		"StringToAttributeMapEntry");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:2656:2: (otherlv_22= ',' ( (lv_attributes_23_0= ruleStringToAttributeMapEntry ) ) )*
                    loop89:
                    do {
                        int alt89=2;
                        int LA89_0 = input.LA(1);

                        if ( (LA89_0==17) ) {
                            alt89=1;
                        }


                        switch (alt89) {
                    	case 1 :
                    	    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:2656:4: otherlv_22= ',' ( (lv_attributes_23_0= ruleStringToAttributeMapEntry ) )
                    	    {
                    	    otherlv_22=(Token)match(input,17,FollowSets000.FOLLOW_17_in_ruleExtension5189); 

                    	        	newLeafNode(otherlv_22, grammarAccess.getExtensionAccess().getCommaKeyword_8_3_0());
                    	        
                    	    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:2660:1: ( (lv_attributes_23_0= ruleStringToAttributeMapEntry ) )
                    	    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:2661:1: (lv_attributes_23_0= ruleStringToAttributeMapEntry )
                    	    {
                    	    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:2661:1: (lv_attributes_23_0= ruleStringToAttributeMapEntry )
                    	    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:2662:3: lv_attributes_23_0= ruleStringToAttributeMapEntry
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getExtensionAccess().getAttributesStringToAttributeMapEntryParserRuleCall_8_3_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleStringToAttributeMapEntry_in_ruleExtension5210);
                    	    lv_attributes_23_0=ruleStringToAttributeMapEntry();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getExtensionRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"attributes",
                    	            		lv_attributes_23_0, 
                    	            		"StringToAttributeMapEntry");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop89;
                        }
                    } while (true);

                    otherlv_24=(Token)match(input,22,FollowSets000.FOLLOW_22_in_ruleExtension5224); 

                        	newLeafNode(otherlv_24, grammarAccess.getExtensionAccess().getRightCurlyBracketKeyword_8_4());
                        

                    }
                    break;

            }

            otherlv_25=(Token)match(input,22,FollowSets000.FOLLOW_22_in_ruleExtension5238); 

                	newLeafNode(otherlv_25, grammarAccess.getExtensionAccess().getRightCurlyBracketKeyword_9());
                

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
    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:2694:1: entryRuleAttribute returns [EObject current=null] : iv_ruleAttribute= ruleAttribute EOF ;
    public final EObject entryRuleAttribute() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAttribute = null;


        try {
            // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:2695:2: (iv_ruleAttribute= ruleAttribute EOF )
            // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:2696:2: iv_ruleAttribute= ruleAttribute EOF
            {
             newCompositeNode(grammarAccess.getAttributeRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleAttribute_in_entryRuleAttribute5274);
            iv_ruleAttribute=ruleAttribute();

            state._fsp--;

             current =iv_ruleAttribute; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleAttribute5284); 

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
    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:2703:1: ruleAttribute returns [EObject current=null] : (otherlv_0= 'Attribute' otherlv_1= '{' otherlv_2= 'type' ( (lv_type_3_0= ruleAttributeType ) ) otherlv_4= 'value' ( (lv_value_5_0= ruleEJavaObject ) ) (otherlv_6= 'annotations' otherlv_7= '{' ( (lv_annotations_8_0= ruleAnnotation ) ) (otherlv_9= ',' ( (lv_annotations_10_0= ruleAnnotation ) ) )* otherlv_11= '}' )? otherlv_12= '}' ) ;
    public final EObject ruleAttribute() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        Enumerator lv_type_3_0 = null;

        AntlrDatatypeRuleToken lv_value_5_0 = null;

        EObject lv_annotations_8_0 = null;

        EObject lv_annotations_10_0 = null;


         enterRule(); 
            
        try {
            // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:2706:28: ( (otherlv_0= 'Attribute' otherlv_1= '{' otherlv_2= 'type' ( (lv_type_3_0= ruleAttributeType ) ) otherlv_4= 'value' ( (lv_value_5_0= ruleEJavaObject ) ) (otherlv_6= 'annotations' otherlv_7= '{' ( (lv_annotations_8_0= ruleAnnotation ) ) (otherlv_9= ',' ( (lv_annotations_10_0= ruleAnnotation ) ) )* otherlv_11= '}' )? otherlv_12= '}' ) )
            // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:2707:1: (otherlv_0= 'Attribute' otherlv_1= '{' otherlv_2= 'type' ( (lv_type_3_0= ruleAttributeType ) ) otherlv_4= 'value' ( (lv_value_5_0= ruleEJavaObject ) ) (otherlv_6= 'annotations' otherlv_7= '{' ( (lv_annotations_8_0= ruleAnnotation ) ) (otherlv_9= ',' ( (lv_annotations_10_0= ruleAnnotation ) ) )* otherlv_11= '}' )? otherlv_12= '}' )
            {
            // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:2707:1: (otherlv_0= 'Attribute' otherlv_1= '{' otherlv_2= 'type' ( (lv_type_3_0= ruleAttributeType ) ) otherlv_4= 'value' ( (lv_value_5_0= ruleEJavaObject ) ) (otherlv_6= 'annotations' otherlv_7= '{' ( (lv_annotations_8_0= ruleAnnotation ) ) (otherlv_9= ',' ( (lv_annotations_10_0= ruleAnnotation ) ) )* otherlv_11= '}' )? otherlv_12= '}' )
            // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:2707:3: otherlv_0= 'Attribute' otherlv_1= '{' otherlv_2= 'type' ( (lv_type_3_0= ruleAttributeType ) ) otherlv_4= 'value' ( (lv_value_5_0= ruleEJavaObject ) ) (otherlv_6= 'annotations' otherlv_7= '{' ( (lv_annotations_8_0= ruleAnnotation ) ) (otherlv_9= ',' ( (lv_annotations_10_0= ruleAnnotation ) ) )* otherlv_11= '}' )? otherlv_12= '}'
            {
            otherlv_0=(Token)match(input,57,FollowSets000.FOLLOW_57_in_ruleAttribute5321); 

                	newLeafNode(otherlv_0, grammarAccess.getAttributeAccess().getAttributeKeyword_0());
                
            otherlv_1=(Token)match(input,21,FollowSets000.FOLLOW_21_in_ruleAttribute5333); 

                	newLeafNode(otherlv_1, grammarAccess.getAttributeAccess().getLeftCurlyBracketKeyword_1());
                
            otherlv_2=(Token)match(input,58,FollowSets000.FOLLOW_58_in_ruleAttribute5345); 

                	newLeafNode(otherlv_2, grammarAccess.getAttributeAccess().getTypeKeyword_2());
                
            // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:2719:1: ( (lv_type_3_0= ruleAttributeType ) )
            // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:2720:1: (lv_type_3_0= ruleAttributeType )
            {
            // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:2720:1: (lv_type_3_0= ruleAttributeType )
            // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:2721:3: lv_type_3_0= ruleAttributeType
            {
             
            	        newCompositeNode(grammarAccess.getAttributeAccess().getTypeAttributeTypeEnumRuleCall_3_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleAttributeType_in_ruleAttribute5366);
            lv_type_3_0=ruleAttributeType();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getAttributeRule());
            	        }
                   		set(
                   			current, 
                   			"type",
                    		lv_type_3_0, 
                    		"AttributeType");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_4=(Token)match(input,37,FollowSets000.FOLLOW_37_in_ruleAttribute5378); 

                	newLeafNode(otherlv_4, grammarAccess.getAttributeAccess().getValueKeyword_4());
                
            // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:2741:1: ( (lv_value_5_0= ruleEJavaObject ) )
            // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:2742:1: (lv_value_5_0= ruleEJavaObject )
            {
            // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:2742:1: (lv_value_5_0= ruleEJavaObject )
            // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:2743:3: lv_value_5_0= ruleEJavaObject
            {
             
            	        newCompositeNode(grammarAccess.getAttributeAccess().getValueEJavaObjectParserRuleCall_5_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEJavaObject_in_ruleAttribute5399);
            lv_value_5_0=ruleEJavaObject();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getAttributeRule());
            	        }
                   		set(
                   			current, 
                   			"value",
                    		lv_value_5_0, 
                    		"EJavaObject");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:2759:2: (otherlv_6= 'annotations' otherlv_7= '{' ( (lv_annotations_8_0= ruleAnnotation ) ) (otherlv_9= ',' ( (lv_annotations_10_0= ruleAnnotation ) ) )* otherlv_11= '}' )?
            int alt92=2;
            int LA92_0 = input.LA(1);

            if ( (LA92_0==20) ) {
                alt92=1;
            }
            switch (alt92) {
                case 1 :
                    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:2759:4: otherlv_6= 'annotations' otherlv_7= '{' ( (lv_annotations_8_0= ruleAnnotation ) ) (otherlv_9= ',' ( (lv_annotations_10_0= ruleAnnotation ) ) )* otherlv_11= '}'
                    {
                    otherlv_6=(Token)match(input,20,FollowSets000.FOLLOW_20_in_ruleAttribute5412); 

                        	newLeafNode(otherlv_6, grammarAccess.getAttributeAccess().getAnnotationsKeyword_6_0());
                        
                    otherlv_7=(Token)match(input,21,FollowSets000.FOLLOW_21_in_ruleAttribute5424); 

                        	newLeafNode(otherlv_7, grammarAccess.getAttributeAccess().getLeftCurlyBracketKeyword_6_1());
                        
                    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:2767:1: ( (lv_annotations_8_0= ruleAnnotation ) )
                    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:2768:1: (lv_annotations_8_0= ruleAnnotation )
                    {
                    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:2768:1: (lv_annotations_8_0= ruleAnnotation )
                    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:2769:3: lv_annotations_8_0= ruleAnnotation
                    {
                     
                    	        newCompositeNode(grammarAccess.getAttributeAccess().getAnnotationsAnnotationParserRuleCall_6_2_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleAnnotation_in_ruleAttribute5445);
                    lv_annotations_8_0=ruleAnnotation();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getAttributeRule());
                    	        }
                           		add(
                           			current, 
                           			"annotations",
                            		lv_annotations_8_0, 
                            		"Annotation");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:2785:2: (otherlv_9= ',' ( (lv_annotations_10_0= ruleAnnotation ) ) )*
                    loop91:
                    do {
                        int alt91=2;
                        int LA91_0 = input.LA(1);

                        if ( (LA91_0==17) ) {
                            alt91=1;
                        }


                        switch (alt91) {
                    	case 1 :
                    	    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:2785:4: otherlv_9= ',' ( (lv_annotations_10_0= ruleAnnotation ) )
                    	    {
                    	    otherlv_9=(Token)match(input,17,FollowSets000.FOLLOW_17_in_ruleAttribute5458); 

                    	        	newLeafNode(otherlv_9, grammarAccess.getAttributeAccess().getCommaKeyword_6_3_0());
                    	        
                    	    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:2789:1: ( (lv_annotations_10_0= ruleAnnotation ) )
                    	    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:2790:1: (lv_annotations_10_0= ruleAnnotation )
                    	    {
                    	    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:2790:1: (lv_annotations_10_0= ruleAnnotation )
                    	    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:2791:3: lv_annotations_10_0= ruleAnnotation
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getAttributeAccess().getAnnotationsAnnotationParserRuleCall_6_3_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleAnnotation_in_ruleAttribute5479);
                    	    lv_annotations_10_0=ruleAnnotation();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getAttributeRule());
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
                    	    break loop91;
                        }
                    } while (true);

                    otherlv_11=(Token)match(input,22,FollowSets000.FOLLOW_22_in_ruleAttribute5493); 

                        	newLeafNode(otherlv_11, grammarAccess.getAttributeAccess().getRightCurlyBracketKeyword_6_4());
                        

                    }
                    break;

            }

            otherlv_12=(Token)match(input,22,FollowSets000.FOLLOW_22_in_ruleAttribute5507); 

                	newLeafNode(otherlv_12, grammarAccess.getAttributeAccess().getRightCurlyBracketKeyword_7());
                

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
    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:2823:1: entryRuleEJavaObject returns [String current=null] : iv_ruleEJavaObject= ruleEJavaObject EOF ;
    public final String entryRuleEJavaObject() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEJavaObject = null;


        try {
            // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:2824:2: (iv_ruleEJavaObject= ruleEJavaObject EOF )
            // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:2825:2: iv_ruleEJavaObject= ruleEJavaObject EOF
            {
             newCompositeNode(grammarAccess.getEJavaObjectRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleEJavaObject_in_entryRuleEJavaObject5544);
            iv_ruleEJavaObject=ruleEJavaObject();

            state._fsp--;

             current =iv_ruleEJavaObject.getText(); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleEJavaObject5555); 

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
    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:2832:1: ruleEJavaObject returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= 'EJavaObject' ;
    public final AntlrDatatypeRuleToken ruleEJavaObject() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:2835:28: (kw= 'EJavaObject' )
            // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:2837:2: kw= 'EJavaObject'
            {
            kw=(Token)match(input,59,FollowSets000.FOLLOW_59_in_ruleEJavaObject5592); 

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


    // $ANTLR start "entryRuleCarrierSet"
    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:2850:1: entryRuleCarrierSet returns [EObject current=null] : iv_ruleCarrierSet= ruleCarrierSet EOF ;
    public final EObject entryRuleCarrierSet() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCarrierSet = null;


        try {
            // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:2851:2: (iv_ruleCarrierSet= ruleCarrierSet EOF )
            // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:2852:2: iv_ruleCarrierSet= ruleCarrierSet EOF
            {
             newCompositeNode(grammarAccess.getCarrierSetRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleCarrierSet_in_entryRuleCarrierSet5631);
            iv_ruleCarrierSet=ruleCarrierSet();

            state._fsp--;

             current =iv_ruleCarrierSet; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleCarrierSet5641); 

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
    // $ANTLR end "entryRuleCarrierSet"


    // $ANTLR start "ruleCarrierSet"
    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:2859:1: ruleCarrierSet returns [EObject current=null] : ( () ( (lv_localGenerated_1_0= 'localGenerated' ) )? otherlv_2= 'CarrierSet' ( (lv_name_3_0= ruleEString ) ) (otherlv_4= 'internalId' ( (lv_internalId_5_0= ruleEString ) ) )? (otherlv_6= 'comment' ( (lv_comment_7_0= ruleEString ) ) )? (otherlv_8= 'annotations' otherlv_9= '{' ( (lv_annotations_10_0= ruleAnnotation ) ) (otherlv_11= ',' ( (lv_annotations_12_0= ruleAnnotation ) ) )* otherlv_13= '}' )? (otherlv_14= 'extensions' otherlv_15= '{' ( (lv_extensions_16_0= ruleAbstractExtension ) ) (otherlv_17= ',' ( (lv_extensions_18_0= ruleAbstractExtension ) ) )* otherlv_19= '}' )? (otherlv_20= 'attributes' otherlv_21= '{' ( (lv_attributes_22_0= ruleStringToAttributeMapEntry ) ) (otherlv_23= ',' ( (lv_attributes_24_0= ruleStringToAttributeMapEntry ) ) )* otherlv_25= '}' )? ) ;
    public final EObject ruleCarrierSet() throws RecognitionException {
        EObject current = null;

        Token lv_localGenerated_1_0=null;
        Token otherlv_2=null;
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
        Token otherlv_21=null;
        Token otherlv_23=null;
        Token otherlv_25=null;
        AntlrDatatypeRuleToken lv_name_3_0 = null;

        AntlrDatatypeRuleToken lv_internalId_5_0 = null;

        AntlrDatatypeRuleToken lv_comment_7_0 = null;

        EObject lv_annotations_10_0 = null;

        EObject lv_annotations_12_0 = null;

        EObject lv_extensions_16_0 = null;

        EObject lv_extensions_18_0 = null;

        EObject lv_attributes_22_0 = null;

        EObject lv_attributes_24_0 = null;


         enterRule(); 
            
        try {
            // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:2862:28: ( ( () ( (lv_localGenerated_1_0= 'localGenerated' ) )? otherlv_2= 'CarrierSet' ( (lv_name_3_0= ruleEString ) ) (otherlv_4= 'internalId' ( (lv_internalId_5_0= ruleEString ) ) )? (otherlv_6= 'comment' ( (lv_comment_7_0= ruleEString ) ) )? (otherlv_8= 'annotations' otherlv_9= '{' ( (lv_annotations_10_0= ruleAnnotation ) ) (otherlv_11= ',' ( (lv_annotations_12_0= ruleAnnotation ) ) )* otherlv_13= '}' )? (otherlv_14= 'extensions' otherlv_15= '{' ( (lv_extensions_16_0= ruleAbstractExtension ) ) (otherlv_17= ',' ( (lv_extensions_18_0= ruleAbstractExtension ) ) )* otherlv_19= '}' )? (otherlv_20= 'attributes' otherlv_21= '{' ( (lv_attributes_22_0= ruleStringToAttributeMapEntry ) ) (otherlv_23= ',' ( (lv_attributes_24_0= ruleStringToAttributeMapEntry ) ) )* otherlv_25= '}' )? ) )
            // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:2863:1: ( () ( (lv_localGenerated_1_0= 'localGenerated' ) )? otherlv_2= 'CarrierSet' ( (lv_name_3_0= ruleEString ) ) (otherlv_4= 'internalId' ( (lv_internalId_5_0= ruleEString ) ) )? (otherlv_6= 'comment' ( (lv_comment_7_0= ruleEString ) ) )? (otherlv_8= 'annotations' otherlv_9= '{' ( (lv_annotations_10_0= ruleAnnotation ) ) (otherlv_11= ',' ( (lv_annotations_12_0= ruleAnnotation ) ) )* otherlv_13= '}' )? (otherlv_14= 'extensions' otherlv_15= '{' ( (lv_extensions_16_0= ruleAbstractExtension ) ) (otherlv_17= ',' ( (lv_extensions_18_0= ruleAbstractExtension ) ) )* otherlv_19= '}' )? (otherlv_20= 'attributes' otherlv_21= '{' ( (lv_attributes_22_0= ruleStringToAttributeMapEntry ) ) (otherlv_23= ',' ( (lv_attributes_24_0= ruleStringToAttributeMapEntry ) ) )* otherlv_25= '}' )? )
            {
            // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:2863:1: ( () ( (lv_localGenerated_1_0= 'localGenerated' ) )? otherlv_2= 'CarrierSet' ( (lv_name_3_0= ruleEString ) ) (otherlv_4= 'internalId' ( (lv_internalId_5_0= ruleEString ) ) )? (otherlv_6= 'comment' ( (lv_comment_7_0= ruleEString ) ) )? (otherlv_8= 'annotations' otherlv_9= '{' ( (lv_annotations_10_0= ruleAnnotation ) ) (otherlv_11= ',' ( (lv_annotations_12_0= ruleAnnotation ) ) )* otherlv_13= '}' )? (otherlv_14= 'extensions' otherlv_15= '{' ( (lv_extensions_16_0= ruleAbstractExtension ) ) (otherlv_17= ',' ( (lv_extensions_18_0= ruleAbstractExtension ) ) )* otherlv_19= '}' )? (otherlv_20= 'attributes' otherlv_21= '{' ( (lv_attributes_22_0= ruleStringToAttributeMapEntry ) ) (otherlv_23= ',' ( (lv_attributes_24_0= ruleStringToAttributeMapEntry ) ) )* otherlv_25= '}' )? )
            // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:2863:2: () ( (lv_localGenerated_1_0= 'localGenerated' ) )? otherlv_2= 'CarrierSet' ( (lv_name_3_0= ruleEString ) ) (otherlv_4= 'internalId' ( (lv_internalId_5_0= ruleEString ) ) )? (otherlv_6= 'comment' ( (lv_comment_7_0= ruleEString ) ) )? (otherlv_8= 'annotations' otherlv_9= '{' ( (lv_annotations_10_0= ruleAnnotation ) ) (otherlv_11= ',' ( (lv_annotations_12_0= ruleAnnotation ) ) )* otherlv_13= '}' )? (otherlv_14= 'extensions' otherlv_15= '{' ( (lv_extensions_16_0= ruleAbstractExtension ) ) (otherlv_17= ',' ( (lv_extensions_18_0= ruleAbstractExtension ) ) )* otherlv_19= '}' )? (otherlv_20= 'attributes' otherlv_21= '{' ( (lv_attributes_22_0= ruleStringToAttributeMapEntry ) ) (otherlv_23= ',' ( (lv_attributes_24_0= ruleStringToAttributeMapEntry ) ) )* otherlv_25= '}' )?
            {
            // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:2863:2: ()
            // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:2864:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getCarrierSetAccess().getCarrierSetAction_0(),
                        current);
                

            }

            // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:2869:2: ( (lv_localGenerated_1_0= 'localGenerated' ) )?
            int alt93=2;
            int LA93_0 = input.LA(1);

            if ( (LA93_0==11) ) {
                alt93=1;
            }
            switch (alt93) {
                case 1 :
                    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:2870:1: (lv_localGenerated_1_0= 'localGenerated' )
                    {
                    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:2870:1: (lv_localGenerated_1_0= 'localGenerated' )
                    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:2871:3: lv_localGenerated_1_0= 'localGenerated'
                    {
                    lv_localGenerated_1_0=(Token)match(input,11,FollowSets000.FOLLOW_11_in_ruleCarrierSet5693); 

                            newLeafNode(lv_localGenerated_1_0, grammarAccess.getCarrierSetAccess().getLocalGeneratedLocalGeneratedKeyword_1_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getCarrierSetRule());
                    	        }
                           		setWithLastConsumed(current, "localGenerated", true, "localGenerated");
                    	    

                    }


                    }
                    break;

            }

            otherlv_2=(Token)match(input,60,FollowSets000.FOLLOW_60_in_ruleCarrierSet5719); 

                	newLeafNode(otherlv_2, grammarAccess.getCarrierSetAccess().getCarrierSetKeyword_2());
                
            // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:2888:1: ( (lv_name_3_0= ruleEString ) )
            // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:2889:1: (lv_name_3_0= ruleEString )
            {
            // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:2889:1: (lv_name_3_0= ruleEString )
            // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:2890:3: lv_name_3_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getCarrierSetAccess().getNameEStringParserRuleCall_3_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleCarrierSet5740);
            lv_name_3_0=ruleEString();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getCarrierSetRule());
            	        }
                   		set(
                   			current, 
                   			"name",
                    		lv_name_3_0, 
                    		"EString");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:2906:2: (otherlv_4= 'internalId' ( (lv_internalId_5_0= ruleEString ) ) )?
            int alt94=2;
            int LA94_0 = input.LA(1);

            if ( (LA94_0==13) ) {
                alt94=1;
            }
            switch (alt94) {
                case 1 :
                    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:2906:4: otherlv_4= 'internalId' ( (lv_internalId_5_0= ruleEString ) )
                    {
                    otherlv_4=(Token)match(input,13,FollowSets000.FOLLOW_13_in_ruleCarrierSet5753); 

                        	newLeafNode(otherlv_4, grammarAccess.getCarrierSetAccess().getInternalIdKeyword_4_0());
                        
                    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:2910:1: ( (lv_internalId_5_0= ruleEString ) )
                    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:2911:1: (lv_internalId_5_0= ruleEString )
                    {
                    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:2911:1: (lv_internalId_5_0= ruleEString )
                    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:2912:3: lv_internalId_5_0= ruleEString
                    {
                     
                    	        newCompositeNode(grammarAccess.getCarrierSetAccess().getInternalIdEStringParserRuleCall_4_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleCarrierSet5774);
                    lv_internalId_5_0=ruleEString();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getCarrierSetRule());
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

            // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:2928:4: (otherlv_6= 'comment' ( (lv_comment_7_0= ruleEString ) ) )?
            int alt95=2;
            int LA95_0 = input.LA(1);

            if ( (LA95_0==39) ) {
                alt95=1;
            }
            switch (alt95) {
                case 1 :
                    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:2928:6: otherlv_6= 'comment' ( (lv_comment_7_0= ruleEString ) )
                    {
                    otherlv_6=(Token)match(input,39,FollowSets000.FOLLOW_39_in_ruleCarrierSet5789); 

                        	newLeafNode(otherlv_6, grammarAccess.getCarrierSetAccess().getCommentKeyword_5_0());
                        
                    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:2932:1: ( (lv_comment_7_0= ruleEString ) )
                    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:2933:1: (lv_comment_7_0= ruleEString )
                    {
                    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:2933:1: (lv_comment_7_0= ruleEString )
                    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:2934:3: lv_comment_7_0= ruleEString
                    {
                     
                    	        newCompositeNode(grammarAccess.getCarrierSetAccess().getCommentEStringParserRuleCall_5_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleCarrierSet5810);
                    lv_comment_7_0=ruleEString();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getCarrierSetRule());
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

            // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:2950:4: (otherlv_8= 'annotations' otherlv_9= '{' ( (lv_annotations_10_0= ruleAnnotation ) ) (otherlv_11= ',' ( (lv_annotations_12_0= ruleAnnotation ) ) )* otherlv_13= '}' )?
            int alt97=2;
            int LA97_0 = input.LA(1);

            if ( (LA97_0==20) ) {
                alt97=1;
            }
            switch (alt97) {
                case 1 :
                    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:2950:6: otherlv_8= 'annotations' otherlv_9= '{' ( (lv_annotations_10_0= ruleAnnotation ) ) (otherlv_11= ',' ( (lv_annotations_12_0= ruleAnnotation ) ) )* otherlv_13= '}'
                    {
                    otherlv_8=(Token)match(input,20,FollowSets000.FOLLOW_20_in_ruleCarrierSet5825); 

                        	newLeafNode(otherlv_8, grammarAccess.getCarrierSetAccess().getAnnotationsKeyword_6_0());
                        
                    otherlv_9=(Token)match(input,21,FollowSets000.FOLLOW_21_in_ruleCarrierSet5837); 

                        	newLeafNode(otherlv_9, grammarAccess.getCarrierSetAccess().getLeftCurlyBracketKeyword_6_1());
                        
                    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:2958:1: ( (lv_annotations_10_0= ruleAnnotation ) )
                    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:2959:1: (lv_annotations_10_0= ruleAnnotation )
                    {
                    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:2959:1: (lv_annotations_10_0= ruleAnnotation )
                    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:2960:3: lv_annotations_10_0= ruleAnnotation
                    {
                     
                    	        newCompositeNode(grammarAccess.getCarrierSetAccess().getAnnotationsAnnotationParserRuleCall_6_2_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleAnnotation_in_ruleCarrierSet5858);
                    lv_annotations_10_0=ruleAnnotation();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getCarrierSetRule());
                    	        }
                           		add(
                           			current, 
                           			"annotations",
                            		lv_annotations_10_0, 
                            		"Annotation");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:2976:2: (otherlv_11= ',' ( (lv_annotations_12_0= ruleAnnotation ) ) )*
                    loop96:
                    do {
                        int alt96=2;
                        int LA96_0 = input.LA(1);

                        if ( (LA96_0==17) ) {
                            alt96=1;
                        }


                        switch (alt96) {
                    	case 1 :
                    	    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:2976:4: otherlv_11= ',' ( (lv_annotations_12_0= ruleAnnotation ) )
                    	    {
                    	    otherlv_11=(Token)match(input,17,FollowSets000.FOLLOW_17_in_ruleCarrierSet5871); 

                    	        	newLeafNode(otherlv_11, grammarAccess.getCarrierSetAccess().getCommaKeyword_6_3_0());
                    	        
                    	    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:2980:1: ( (lv_annotations_12_0= ruleAnnotation ) )
                    	    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:2981:1: (lv_annotations_12_0= ruleAnnotation )
                    	    {
                    	    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:2981:1: (lv_annotations_12_0= ruleAnnotation )
                    	    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:2982:3: lv_annotations_12_0= ruleAnnotation
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getCarrierSetAccess().getAnnotationsAnnotationParserRuleCall_6_3_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleAnnotation_in_ruleCarrierSet5892);
                    	    lv_annotations_12_0=ruleAnnotation();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getCarrierSetRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"annotations",
                    	            		lv_annotations_12_0, 
                    	            		"Annotation");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop96;
                        }
                    } while (true);

                    otherlv_13=(Token)match(input,22,FollowSets000.FOLLOW_22_in_ruleCarrierSet5906); 

                        	newLeafNode(otherlv_13, grammarAccess.getCarrierSetAccess().getRightCurlyBracketKeyword_6_4());
                        

                    }
                    break;

            }

            // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:3002:3: (otherlv_14= 'extensions' otherlv_15= '{' ( (lv_extensions_16_0= ruleAbstractExtension ) ) (otherlv_17= ',' ( (lv_extensions_18_0= ruleAbstractExtension ) ) )* otherlv_19= '}' )?
            int alt99=2;
            int LA99_0 = input.LA(1);

            if ( (LA99_0==23) ) {
                alt99=1;
            }
            switch (alt99) {
                case 1 :
                    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:3002:5: otherlv_14= 'extensions' otherlv_15= '{' ( (lv_extensions_16_0= ruleAbstractExtension ) ) (otherlv_17= ',' ( (lv_extensions_18_0= ruleAbstractExtension ) ) )* otherlv_19= '}'
                    {
                    otherlv_14=(Token)match(input,23,FollowSets000.FOLLOW_23_in_ruleCarrierSet5921); 

                        	newLeafNode(otherlv_14, grammarAccess.getCarrierSetAccess().getExtensionsKeyword_7_0());
                        
                    otherlv_15=(Token)match(input,21,FollowSets000.FOLLOW_21_in_ruleCarrierSet5933); 

                        	newLeafNode(otherlv_15, grammarAccess.getCarrierSetAccess().getLeftCurlyBracketKeyword_7_1());
                        
                    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:3010:1: ( (lv_extensions_16_0= ruleAbstractExtension ) )
                    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:3011:1: (lv_extensions_16_0= ruleAbstractExtension )
                    {
                    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:3011:1: (lv_extensions_16_0= ruleAbstractExtension )
                    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:3012:3: lv_extensions_16_0= ruleAbstractExtension
                    {
                     
                    	        newCompositeNode(grammarAccess.getCarrierSetAccess().getExtensionsAbstractExtensionParserRuleCall_7_2_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleAbstractExtension_in_ruleCarrierSet5954);
                    lv_extensions_16_0=ruleAbstractExtension();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getCarrierSetRule());
                    	        }
                           		add(
                           			current, 
                           			"extensions",
                            		lv_extensions_16_0, 
                            		"AbstractExtension");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:3028:2: (otherlv_17= ',' ( (lv_extensions_18_0= ruleAbstractExtension ) ) )*
                    loop98:
                    do {
                        int alt98=2;
                        int LA98_0 = input.LA(1);

                        if ( (LA98_0==17) ) {
                            alt98=1;
                        }


                        switch (alt98) {
                    	case 1 :
                    	    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:3028:4: otherlv_17= ',' ( (lv_extensions_18_0= ruleAbstractExtension ) )
                    	    {
                    	    otherlv_17=(Token)match(input,17,FollowSets000.FOLLOW_17_in_ruleCarrierSet5967); 

                    	        	newLeafNode(otherlv_17, grammarAccess.getCarrierSetAccess().getCommaKeyword_7_3_0());
                    	        
                    	    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:3032:1: ( (lv_extensions_18_0= ruleAbstractExtension ) )
                    	    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:3033:1: (lv_extensions_18_0= ruleAbstractExtension )
                    	    {
                    	    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:3033:1: (lv_extensions_18_0= ruleAbstractExtension )
                    	    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:3034:3: lv_extensions_18_0= ruleAbstractExtension
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getCarrierSetAccess().getExtensionsAbstractExtensionParserRuleCall_7_3_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleAbstractExtension_in_ruleCarrierSet5988);
                    	    lv_extensions_18_0=ruleAbstractExtension();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getCarrierSetRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"extensions",
                    	            		lv_extensions_18_0, 
                    	            		"AbstractExtension");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop98;
                        }
                    } while (true);

                    otherlv_19=(Token)match(input,22,FollowSets000.FOLLOW_22_in_ruleCarrierSet6002); 

                        	newLeafNode(otherlv_19, grammarAccess.getCarrierSetAccess().getRightCurlyBracketKeyword_7_4());
                        

                    }
                    break;

            }

            // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:3054:3: (otherlv_20= 'attributes' otherlv_21= '{' ( (lv_attributes_22_0= ruleStringToAttributeMapEntry ) ) (otherlv_23= ',' ( (lv_attributes_24_0= ruleStringToAttributeMapEntry ) ) )* otherlv_25= '}' )?
            int alt101=2;
            int LA101_0 = input.LA(1);

            if ( (LA101_0==24) ) {
                alt101=1;
            }
            switch (alt101) {
                case 1 :
                    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:3054:5: otherlv_20= 'attributes' otherlv_21= '{' ( (lv_attributes_22_0= ruleStringToAttributeMapEntry ) ) (otherlv_23= ',' ( (lv_attributes_24_0= ruleStringToAttributeMapEntry ) ) )* otherlv_25= '}'
                    {
                    otherlv_20=(Token)match(input,24,FollowSets000.FOLLOW_24_in_ruleCarrierSet6017); 

                        	newLeafNode(otherlv_20, grammarAccess.getCarrierSetAccess().getAttributesKeyword_8_0());
                        
                    otherlv_21=(Token)match(input,21,FollowSets000.FOLLOW_21_in_ruleCarrierSet6029); 

                        	newLeafNode(otherlv_21, grammarAccess.getCarrierSetAccess().getLeftCurlyBracketKeyword_8_1());
                        
                    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:3062:1: ( (lv_attributes_22_0= ruleStringToAttributeMapEntry ) )
                    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:3063:1: (lv_attributes_22_0= ruleStringToAttributeMapEntry )
                    {
                    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:3063:1: (lv_attributes_22_0= ruleStringToAttributeMapEntry )
                    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:3064:3: lv_attributes_22_0= ruleStringToAttributeMapEntry
                    {
                     
                    	        newCompositeNode(grammarAccess.getCarrierSetAccess().getAttributesStringToAttributeMapEntryParserRuleCall_8_2_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleStringToAttributeMapEntry_in_ruleCarrierSet6050);
                    lv_attributes_22_0=ruleStringToAttributeMapEntry();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getCarrierSetRule());
                    	        }
                           		add(
                           			current, 
                           			"attributes",
                            		lv_attributes_22_0, 
                            		"StringToAttributeMapEntry");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:3080:2: (otherlv_23= ',' ( (lv_attributes_24_0= ruleStringToAttributeMapEntry ) ) )*
                    loop100:
                    do {
                        int alt100=2;
                        int LA100_0 = input.LA(1);

                        if ( (LA100_0==17) ) {
                            alt100=1;
                        }


                        switch (alt100) {
                    	case 1 :
                    	    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:3080:4: otherlv_23= ',' ( (lv_attributes_24_0= ruleStringToAttributeMapEntry ) )
                    	    {
                    	    otherlv_23=(Token)match(input,17,FollowSets000.FOLLOW_17_in_ruleCarrierSet6063); 

                    	        	newLeafNode(otherlv_23, grammarAccess.getCarrierSetAccess().getCommaKeyword_8_3_0());
                    	        
                    	    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:3084:1: ( (lv_attributes_24_0= ruleStringToAttributeMapEntry ) )
                    	    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:3085:1: (lv_attributes_24_0= ruleStringToAttributeMapEntry )
                    	    {
                    	    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:3085:1: (lv_attributes_24_0= ruleStringToAttributeMapEntry )
                    	    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:3086:3: lv_attributes_24_0= ruleStringToAttributeMapEntry
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getCarrierSetAccess().getAttributesStringToAttributeMapEntryParserRuleCall_8_3_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleStringToAttributeMapEntry_in_ruleCarrierSet6084);
                    	    lv_attributes_24_0=ruleStringToAttributeMapEntry();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getCarrierSetRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"attributes",
                    	            		lv_attributes_24_0, 
                    	            		"StringToAttributeMapEntry");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop100;
                        }
                    } while (true);

                    otherlv_25=(Token)match(input,22,FollowSets000.FOLLOW_22_in_ruleCarrierSet6098); 

                        	newLeafNode(otherlv_25, grammarAccess.getCarrierSetAccess().getRightCurlyBracketKeyword_8_4());
                        

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
    // $ANTLR end "ruleCarrierSet"


    // $ANTLR start "entryRuleConstant"
    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:3114:1: entryRuleConstant returns [EObject current=null] : iv_ruleConstant= ruleConstant EOF ;
    public final EObject entryRuleConstant() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConstant = null;


        try {
            // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:3115:2: (iv_ruleConstant= ruleConstant EOF )
            // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:3116:2: iv_ruleConstant= ruleConstant EOF
            {
             newCompositeNode(grammarAccess.getConstantRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleConstant_in_entryRuleConstant6136);
            iv_ruleConstant=ruleConstant();

            state._fsp--;

             current =iv_ruleConstant; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleConstant6146); 

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
    // $ANTLR end "entryRuleConstant"


    // $ANTLR start "ruleConstant"
    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:3123:1: ruleConstant returns [EObject current=null] : ( () ( (lv_localGenerated_1_0= 'localGenerated' ) )? otherlv_2= 'Constant' ( (lv_name_3_0= ruleEString ) ) (otherlv_4= 'internalId' ( (lv_internalId_5_0= ruleEString ) ) )? (otherlv_6= 'comment' ( (lv_comment_7_0= ruleEString ) ) )? (otherlv_8= 'annotations' otherlv_9= '{' ( (lv_annotations_10_0= ruleAnnotation ) ) (otherlv_11= ',' ( (lv_annotations_12_0= ruleAnnotation ) ) )* otherlv_13= '}' )? (otherlv_14= 'extensions' otherlv_15= '{' ( (lv_extensions_16_0= ruleAbstractExtension ) ) (otherlv_17= ',' ( (lv_extensions_18_0= ruleAbstractExtension ) ) )* otherlv_19= '}' )? (otherlv_20= 'attributes' otherlv_21= '{' ( (lv_attributes_22_0= ruleStringToAttributeMapEntry ) ) (otherlv_23= ',' ( (lv_attributes_24_0= ruleStringToAttributeMapEntry ) ) )* otherlv_25= '}' )? ) ;
    public final EObject ruleConstant() throws RecognitionException {
        EObject current = null;

        Token lv_localGenerated_1_0=null;
        Token otherlv_2=null;
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
        Token otherlv_21=null;
        Token otherlv_23=null;
        Token otherlv_25=null;
        AntlrDatatypeRuleToken lv_name_3_0 = null;

        AntlrDatatypeRuleToken lv_internalId_5_0 = null;

        AntlrDatatypeRuleToken lv_comment_7_0 = null;

        EObject lv_annotations_10_0 = null;

        EObject lv_annotations_12_0 = null;

        EObject lv_extensions_16_0 = null;

        EObject lv_extensions_18_0 = null;

        EObject lv_attributes_22_0 = null;

        EObject lv_attributes_24_0 = null;


         enterRule(); 
            
        try {
            // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:3126:28: ( ( () ( (lv_localGenerated_1_0= 'localGenerated' ) )? otherlv_2= 'Constant' ( (lv_name_3_0= ruleEString ) ) (otherlv_4= 'internalId' ( (lv_internalId_5_0= ruleEString ) ) )? (otherlv_6= 'comment' ( (lv_comment_7_0= ruleEString ) ) )? (otherlv_8= 'annotations' otherlv_9= '{' ( (lv_annotations_10_0= ruleAnnotation ) ) (otherlv_11= ',' ( (lv_annotations_12_0= ruleAnnotation ) ) )* otherlv_13= '}' )? (otherlv_14= 'extensions' otherlv_15= '{' ( (lv_extensions_16_0= ruleAbstractExtension ) ) (otherlv_17= ',' ( (lv_extensions_18_0= ruleAbstractExtension ) ) )* otherlv_19= '}' )? (otherlv_20= 'attributes' otherlv_21= '{' ( (lv_attributes_22_0= ruleStringToAttributeMapEntry ) ) (otherlv_23= ',' ( (lv_attributes_24_0= ruleStringToAttributeMapEntry ) ) )* otherlv_25= '}' )? ) )
            // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:3127:1: ( () ( (lv_localGenerated_1_0= 'localGenerated' ) )? otherlv_2= 'Constant' ( (lv_name_3_0= ruleEString ) ) (otherlv_4= 'internalId' ( (lv_internalId_5_0= ruleEString ) ) )? (otherlv_6= 'comment' ( (lv_comment_7_0= ruleEString ) ) )? (otherlv_8= 'annotations' otherlv_9= '{' ( (lv_annotations_10_0= ruleAnnotation ) ) (otherlv_11= ',' ( (lv_annotations_12_0= ruleAnnotation ) ) )* otherlv_13= '}' )? (otherlv_14= 'extensions' otherlv_15= '{' ( (lv_extensions_16_0= ruleAbstractExtension ) ) (otherlv_17= ',' ( (lv_extensions_18_0= ruleAbstractExtension ) ) )* otherlv_19= '}' )? (otherlv_20= 'attributes' otherlv_21= '{' ( (lv_attributes_22_0= ruleStringToAttributeMapEntry ) ) (otherlv_23= ',' ( (lv_attributes_24_0= ruleStringToAttributeMapEntry ) ) )* otherlv_25= '}' )? )
            {
            // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:3127:1: ( () ( (lv_localGenerated_1_0= 'localGenerated' ) )? otherlv_2= 'Constant' ( (lv_name_3_0= ruleEString ) ) (otherlv_4= 'internalId' ( (lv_internalId_5_0= ruleEString ) ) )? (otherlv_6= 'comment' ( (lv_comment_7_0= ruleEString ) ) )? (otherlv_8= 'annotations' otherlv_9= '{' ( (lv_annotations_10_0= ruleAnnotation ) ) (otherlv_11= ',' ( (lv_annotations_12_0= ruleAnnotation ) ) )* otherlv_13= '}' )? (otherlv_14= 'extensions' otherlv_15= '{' ( (lv_extensions_16_0= ruleAbstractExtension ) ) (otherlv_17= ',' ( (lv_extensions_18_0= ruleAbstractExtension ) ) )* otherlv_19= '}' )? (otherlv_20= 'attributes' otherlv_21= '{' ( (lv_attributes_22_0= ruleStringToAttributeMapEntry ) ) (otherlv_23= ',' ( (lv_attributes_24_0= ruleStringToAttributeMapEntry ) ) )* otherlv_25= '}' )? )
            // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:3127:2: () ( (lv_localGenerated_1_0= 'localGenerated' ) )? otherlv_2= 'Constant' ( (lv_name_3_0= ruleEString ) ) (otherlv_4= 'internalId' ( (lv_internalId_5_0= ruleEString ) ) )? (otherlv_6= 'comment' ( (lv_comment_7_0= ruleEString ) ) )? (otherlv_8= 'annotations' otherlv_9= '{' ( (lv_annotations_10_0= ruleAnnotation ) ) (otherlv_11= ',' ( (lv_annotations_12_0= ruleAnnotation ) ) )* otherlv_13= '}' )? (otherlv_14= 'extensions' otherlv_15= '{' ( (lv_extensions_16_0= ruleAbstractExtension ) ) (otherlv_17= ',' ( (lv_extensions_18_0= ruleAbstractExtension ) ) )* otherlv_19= '}' )? (otherlv_20= 'attributes' otherlv_21= '{' ( (lv_attributes_22_0= ruleStringToAttributeMapEntry ) ) (otherlv_23= ',' ( (lv_attributes_24_0= ruleStringToAttributeMapEntry ) ) )* otherlv_25= '}' )?
            {
            // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:3127:2: ()
            // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:3128:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getConstantAccess().getConstantAction_0(),
                        current);
                

            }

            // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:3133:2: ( (lv_localGenerated_1_0= 'localGenerated' ) )?
            int alt102=2;
            int LA102_0 = input.LA(1);

            if ( (LA102_0==11) ) {
                alt102=1;
            }
            switch (alt102) {
                case 1 :
                    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:3134:1: (lv_localGenerated_1_0= 'localGenerated' )
                    {
                    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:3134:1: (lv_localGenerated_1_0= 'localGenerated' )
                    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:3135:3: lv_localGenerated_1_0= 'localGenerated'
                    {
                    lv_localGenerated_1_0=(Token)match(input,11,FollowSets000.FOLLOW_11_in_ruleConstant6198); 

                            newLeafNode(lv_localGenerated_1_0, grammarAccess.getConstantAccess().getLocalGeneratedLocalGeneratedKeyword_1_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getConstantRule());
                    	        }
                           		setWithLastConsumed(current, "localGenerated", true, "localGenerated");
                    	    

                    }


                    }
                    break;

            }

            otherlv_2=(Token)match(input,61,FollowSets000.FOLLOW_61_in_ruleConstant6224); 

                	newLeafNode(otherlv_2, grammarAccess.getConstantAccess().getConstantKeyword_2());
                
            // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:3152:1: ( (lv_name_3_0= ruleEString ) )
            // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:3153:1: (lv_name_3_0= ruleEString )
            {
            // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:3153:1: (lv_name_3_0= ruleEString )
            // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:3154:3: lv_name_3_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getConstantAccess().getNameEStringParserRuleCall_3_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleConstant6245);
            lv_name_3_0=ruleEString();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getConstantRule());
            	        }
                   		set(
                   			current, 
                   			"name",
                    		lv_name_3_0, 
                    		"EString");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:3170:2: (otherlv_4= 'internalId' ( (lv_internalId_5_0= ruleEString ) ) )?
            int alt103=2;
            int LA103_0 = input.LA(1);

            if ( (LA103_0==13) ) {
                alt103=1;
            }
            switch (alt103) {
                case 1 :
                    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:3170:4: otherlv_4= 'internalId' ( (lv_internalId_5_0= ruleEString ) )
                    {
                    otherlv_4=(Token)match(input,13,FollowSets000.FOLLOW_13_in_ruleConstant6258); 

                        	newLeafNode(otherlv_4, grammarAccess.getConstantAccess().getInternalIdKeyword_4_0());
                        
                    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:3174:1: ( (lv_internalId_5_0= ruleEString ) )
                    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:3175:1: (lv_internalId_5_0= ruleEString )
                    {
                    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:3175:1: (lv_internalId_5_0= ruleEString )
                    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:3176:3: lv_internalId_5_0= ruleEString
                    {
                     
                    	        newCompositeNode(grammarAccess.getConstantAccess().getInternalIdEStringParserRuleCall_4_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleConstant6279);
                    lv_internalId_5_0=ruleEString();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getConstantRule());
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

            // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:3192:4: (otherlv_6= 'comment' ( (lv_comment_7_0= ruleEString ) ) )?
            int alt104=2;
            int LA104_0 = input.LA(1);

            if ( (LA104_0==39) ) {
                alt104=1;
            }
            switch (alt104) {
                case 1 :
                    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:3192:6: otherlv_6= 'comment' ( (lv_comment_7_0= ruleEString ) )
                    {
                    otherlv_6=(Token)match(input,39,FollowSets000.FOLLOW_39_in_ruleConstant6294); 

                        	newLeafNode(otherlv_6, grammarAccess.getConstantAccess().getCommentKeyword_5_0());
                        
                    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:3196:1: ( (lv_comment_7_0= ruleEString ) )
                    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:3197:1: (lv_comment_7_0= ruleEString )
                    {
                    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:3197:1: (lv_comment_7_0= ruleEString )
                    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:3198:3: lv_comment_7_0= ruleEString
                    {
                     
                    	        newCompositeNode(grammarAccess.getConstantAccess().getCommentEStringParserRuleCall_5_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleConstant6315);
                    lv_comment_7_0=ruleEString();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getConstantRule());
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

            // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:3214:4: (otherlv_8= 'annotations' otherlv_9= '{' ( (lv_annotations_10_0= ruleAnnotation ) ) (otherlv_11= ',' ( (lv_annotations_12_0= ruleAnnotation ) ) )* otherlv_13= '}' )?
            int alt106=2;
            int LA106_0 = input.LA(1);

            if ( (LA106_0==20) ) {
                alt106=1;
            }
            switch (alt106) {
                case 1 :
                    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:3214:6: otherlv_8= 'annotations' otherlv_9= '{' ( (lv_annotations_10_0= ruleAnnotation ) ) (otherlv_11= ',' ( (lv_annotations_12_0= ruleAnnotation ) ) )* otherlv_13= '}'
                    {
                    otherlv_8=(Token)match(input,20,FollowSets000.FOLLOW_20_in_ruleConstant6330); 

                        	newLeafNode(otherlv_8, grammarAccess.getConstantAccess().getAnnotationsKeyword_6_0());
                        
                    otherlv_9=(Token)match(input,21,FollowSets000.FOLLOW_21_in_ruleConstant6342); 

                        	newLeafNode(otherlv_9, grammarAccess.getConstantAccess().getLeftCurlyBracketKeyword_6_1());
                        
                    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:3222:1: ( (lv_annotations_10_0= ruleAnnotation ) )
                    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:3223:1: (lv_annotations_10_0= ruleAnnotation )
                    {
                    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:3223:1: (lv_annotations_10_0= ruleAnnotation )
                    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:3224:3: lv_annotations_10_0= ruleAnnotation
                    {
                     
                    	        newCompositeNode(grammarAccess.getConstantAccess().getAnnotationsAnnotationParserRuleCall_6_2_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleAnnotation_in_ruleConstant6363);
                    lv_annotations_10_0=ruleAnnotation();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getConstantRule());
                    	        }
                           		add(
                           			current, 
                           			"annotations",
                            		lv_annotations_10_0, 
                            		"Annotation");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:3240:2: (otherlv_11= ',' ( (lv_annotations_12_0= ruleAnnotation ) ) )*
                    loop105:
                    do {
                        int alt105=2;
                        int LA105_0 = input.LA(1);

                        if ( (LA105_0==17) ) {
                            alt105=1;
                        }


                        switch (alt105) {
                    	case 1 :
                    	    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:3240:4: otherlv_11= ',' ( (lv_annotations_12_0= ruleAnnotation ) )
                    	    {
                    	    otherlv_11=(Token)match(input,17,FollowSets000.FOLLOW_17_in_ruleConstant6376); 

                    	        	newLeafNode(otherlv_11, grammarAccess.getConstantAccess().getCommaKeyword_6_3_0());
                    	        
                    	    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:3244:1: ( (lv_annotations_12_0= ruleAnnotation ) )
                    	    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:3245:1: (lv_annotations_12_0= ruleAnnotation )
                    	    {
                    	    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:3245:1: (lv_annotations_12_0= ruleAnnotation )
                    	    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:3246:3: lv_annotations_12_0= ruleAnnotation
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getConstantAccess().getAnnotationsAnnotationParserRuleCall_6_3_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleAnnotation_in_ruleConstant6397);
                    	    lv_annotations_12_0=ruleAnnotation();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getConstantRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"annotations",
                    	            		lv_annotations_12_0, 
                    	            		"Annotation");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop105;
                        }
                    } while (true);

                    otherlv_13=(Token)match(input,22,FollowSets000.FOLLOW_22_in_ruleConstant6411); 

                        	newLeafNode(otherlv_13, grammarAccess.getConstantAccess().getRightCurlyBracketKeyword_6_4());
                        

                    }
                    break;

            }

            // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:3266:3: (otherlv_14= 'extensions' otherlv_15= '{' ( (lv_extensions_16_0= ruleAbstractExtension ) ) (otherlv_17= ',' ( (lv_extensions_18_0= ruleAbstractExtension ) ) )* otherlv_19= '}' )?
            int alt108=2;
            int LA108_0 = input.LA(1);

            if ( (LA108_0==23) ) {
                alt108=1;
            }
            switch (alt108) {
                case 1 :
                    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:3266:5: otherlv_14= 'extensions' otherlv_15= '{' ( (lv_extensions_16_0= ruleAbstractExtension ) ) (otherlv_17= ',' ( (lv_extensions_18_0= ruleAbstractExtension ) ) )* otherlv_19= '}'
                    {
                    otherlv_14=(Token)match(input,23,FollowSets000.FOLLOW_23_in_ruleConstant6426); 

                        	newLeafNode(otherlv_14, grammarAccess.getConstantAccess().getExtensionsKeyword_7_0());
                        
                    otherlv_15=(Token)match(input,21,FollowSets000.FOLLOW_21_in_ruleConstant6438); 

                        	newLeafNode(otherlv_15, grammarAccess.getConstantAccess().getLeftCurlyBracketKeyword_7_1());
                        
                    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:3274:1: ( (lv_extensions_16_0= ruleAbstractExtension ) )
                    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:3275:1: (lv_extensions_16_0= ruleAbstractExtension )
                    {
                    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:3275:1: (lv_extensions_16_0= ruleAbstractExtension )
                    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:3276:3: lv_extensions_16_0= ruleAbstractExtension
                    {
                     
                    	        newCompositeNode(grammarAccess.getConstantAccess().getExtensionsAbstractExtensionParserRuleCall_7_2_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleAbstractExtension_in_ruleConstant6459);
                    lv_extensions_16_0=ruleAbstractExtension();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getConstantRule());
                    	        }
                           		add(
                           			current, 
                           			"extensions",
                            		lv_extensions_16_0, 
                            		"AbstractExtension");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:3292:2: (otherlv_17= ',' ( (lv_extensions_18_0= ruleAbstractExtension ) ) )*
                    loop107:
                    do {
                        int alt107=2;
                        int LA107_0 = input.LA(1);

                        if ( (LA107_0==17) ) {
                            alt107=1;
                        }


                        switch (alt107) {
                    	case 1 :
                    	    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:3292:4: otherlv_17= ',' ( (lv_extensions_18_0= ruleAbstractExtension ) )
                    	    {
                    	    otherlv_17=(Token)match(input,17,FollowSets000.FOLLOW_17_in_ruleConstant6472); 

                    	        	newLeafNode(otherlv_17, grammarAccess.getConstantAccess().getCommaKeyword_7_3_0());
                    	        
                    	    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:3296:1: ( (lv_extensions_18_0= ruleAbstractExtension ) )
                    	    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:3297:1: (lv_extensions_18_0= ruleAbstractExtension )
                    	    {
                    	    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:3297:1: (lv_extensions_18_0= ruleAbstractExtension )
                    	    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:3298:3: lv_extensions_18_0= ruleAbstractExtension
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getConstantAccess().getExtensionsAbstractExtensionParserRuleCall_7_3_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleAbstractExtension_in_ruleConstant6493);
                    	    lv_extensions_18_0=ruleAbstractExtension();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getConstantRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"extensions",
                    	            		lv_extensions_18_0, 
                    	            		"AbstractExtension");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop107;
                        }
                    } while (true);

                    otherlv_19=(Token)match(input,22,FollowSets000.FOLLOW_22_in_ruleConstant6507); 

                        	newLeafNode(otherlv_19, grammarAccess.getConstantAccess().getRightCurlyBracketKeyword_7_4());
                        

                    }
                    break;

            }

            // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:3318:3: (otherlv_20= 'attributes' otherlv_21= '{' ( (lv_attributes_22_0= ruleStringToAttributeMapEntry ) ) (otherlv_23= ',' ( (lv_attributes_24_0= ruleStringToAttributeMapEntry ) ) )* otherlv_25= '}' )?
            int alt110=2;
            int LA110_0 = input.LA(1);

            if ( (LA110_0==24) ) {
                alt110=1;
            }
            switch (alt110) {
                case 1 :
                    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:3318:5: otherlv_20= 'attributes' otherlv_21= '{' ( (lv_attributes_22_0= ruleStringToAttributeMapEntry ) ) (otherlv_23= ',' ( (lv_attributes_24_0= ruleStringToAttributeMapEntry ) ) )* otherlv_25= '}'
                    {
                    otherlv_20=(Token)match(input,24,FollowSets000.FOLLOW_24_in_ruleConstant6522); 

                        	newLeafNode(otherlv_20, grammarAccess.getConstantAccess().getAttributesKeyword_8_0());
                        
                    otherlv_21=(Token)match(input,21,FollowSets000.FOLLOW_21_in_ruleConstant6534); 

                        	newLeafNode(otherlv_21, grammarAccess.getConstantAccess().getLeftCurlyBracketKeyword_8_1());
                        
                    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:3326:1: ( (lv_attributes_22_0= ruleStringToAttributeMapEntry ) )
                    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:3327:1: (lv_attributes_22_0= ruleStringToAttributeMapEntry )
                    {
                    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:3327:1: (lv_attributes_22_0= ruleStringToAttributeMapEntry )
                    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:3328:3: lv_attributes_22_0= ruleStringToAttributeMapEntry
                    {
                     
                    	        newCompositeNode(grammarAccess.getConstantAccess().getAttributesStringToAttributeMapEntryParserRuleCall_8_2_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleStringToAttributeMapEntry_in_ruleConstant6555);
                    lv_attributes_22_0=ruleStringToAttributeMapEntry();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getConstantRule());
                    	        }
                           		add(
                           			current, 
                           			"attributes",
                            		lv_attributes_22_0, 
                            		"StringToAttributeMapEntry");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:3344:2: (otherlv_23= ',' ( (lv_attributes_24_0= ruleStringToAttributeMapEntry ) ) )*
                    loop109:
                    do {
                        int alt109=2;
                        int LA109_0 = input.LA(1);

                        if ( (LA109_0==17) ) {
                            alt109=1;
                        }


                        switch (alt109) {
                    	case 1 :
                    	    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:3344:4: otherlv_23= ',' ( (lv_attributes_24_0= ruleStringToAttributeMapEntry ) )
                    	    {
                    	    otherlv_23=(Token)match(input,17,FollowSets000.FOLLOW_17_in_ruleConstant6568); 

                    	        	newLeafNode(otherlv_23, grammarAccess.getConstantAccess().getCommaKeyword_8_3_0());
                    	        
                    	    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:3348:1: ( (lv_attributes_24_0= ruleStringToAttributeMapEntry ) )
                    	    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:3349:1: (lv_attributes_24_0= ruleStringToAttributeMapEntry )
                    	    {
                    	    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:3349:1: (lv_attributes_24_0= ruleStringToAttributeMapEntry )
                    	    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:3350:3: lv_attributes_24_0= ruleStringToAttributeMapEntry
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getConstantAccess().getAttributesStringToAttributeMapEntryParserRuleCall_8_3_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleStringToAttributeMapEntry_in_ruleConstant6589);
                    	    lv_attributes_24_0=ruleStringToAttributeMapEntry();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getConstantRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"attributes",
                    	            		lv_attributes_24_0, 
                    	            		"StringToAttributeMapEntry");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop109;
                        }
                    } while (true);

                    otherlv_25=(Token)match(input,22,FollowSets000.FOLLOW_22_in_ruleConstant6603); 

                        	newLeafNode(otherlv_25, grammarAccess.getConstantAccess().getRightCurlyBracketKeyword_8_4());
                        

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
    // $ANTLR end "ruleConstant"


    // $ANTLR start "entryRuleAxiom"
    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:3378:1: entryRuleAxiom returns [EObject current=null] : iv_ruleAxiom= ruleAxiom EOF ;
    public final EObject entryRuleAxiom() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAxiom = null;


        try {
            // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:3379:2: (iv_ruleAxiom= ruleAxiom EOF )
            // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:3380:2: iv_ruleAxiom= ruleAxiom EOF
            {
             newCompositeNode(grammarAccess.getAxiomRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleAxiom_in_entryRuleAxiom6641);
            iv_ruleAxiom=ruleAxiom();

            state._fsp--;

             current =iv_ruleAxiom; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleAxiom6651); 

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
    // $ANTLR end "entryRuleAxiom"


    // $ANTLR start "ruleAxiom"
    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:3387:1: ruleAxiom returns [EObject current=null] : (otherlv_0= 'Axiom' ( (lv_name_1_0= ruleEString ) ) ( (lv_localGenerated_2_0= 'localGenerated' ) )? ( (lv_theorem_3_0= 'theorem' ) )? otherlv_4= 'notTheorem' (otherlv_5= 'internalId' ( (lv_internalId_6_0= ruleEString ) ) )? (otherlv_7= 'comment' ( (lv_comment_8_0= ruleEString ) ) )? otherlv_9= 'Predicate' ( (lv_predicate_10_0= ruleEString ) ) (otherlv_11= 'annotations' otherlv_12= '{' ( (lv_annotations_13_0= ruleAnnotation ) ) (otherlv_14= ',' ( (lv_annotations_15_0= ruleAnnotation ) ) )* otherlv_16= '}' )? (otherlv_17= 'extensions' otherlv_18= '{' ( (lv_extensions_19_0= ruleAbstractExtension ) ) (otherlv_20= ',' ( (lv_extensions_21_0= ruleAbstractExtension ) ) )* otherlv_22= '}' )? (otherlv_23= 'attributes' otherlv_24= '{' ( (lv_attributes_25_0= ruleStringToAttributeMapEntry ) ) (otherlv_26= ',' ( (lv_attributes_27_0= ruleStringToAttributeMapEntry ) ) )* otherlv_28= '}' )? ) ;
    public final EObject ruleAxiom() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_localGenerated_2_0=null;
        Token lv_theorem_3_0=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
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
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        AntlrDatatypeRuleToken lv_internalId_6_0 = null;

        AntlrDatatypeRuleToken lv_comment_8_0 = null;

        AntlrDatatypeRuleToken lv_predicate_10_0 = null;

        EObject lv_annotations_13_0 = null;

        EObject lv_annotations_15_0 = null;

        EObject lv_extensions_19_0 = null;

        EObject lv_extensions_21_0 = null;

        EObject lv_attributes_25_0 = null;

        EObject lv_attributes_27_0 = null;


         enterRule(); 
            
        try {
            // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:3390:28: ( (otherlv_0= 'Axiom' ( (lv_name_1_0= ruleEString ) ) ( (lv_localGenerated_2_0= 'localGenerated' ) )? ( (lv_theorem_3_0= 'theorem' ) )? otherlv_4= 'notTheorem' (otherlv_5= 'internalId' ( (lv_internalId_6_0= ruleEString ) ) )? (otherlv_7= 'comment' ( (lv_comment_8_0= ruleEString ) ) )? otherlv_9= 'Predicate' ( (lv_predicate_10_0= ruleEString ) ) (otherlv_11= 'annotations' otherlv_12= '{' ( (lv_annotations_13_0= ruleAnnotation ) ) (otherlv_14= ',' ( (lv_annotations_15_0= ruleAnnotation ) ) )* otherlv_16= '}' )? (otherlv_17= 'extensions' otherlv_18= '{' ( (lv_extensions_19_0= ruleAbstractExtension ) ) (otherlv_20= ',' ( (lv_extensions_21_0= ruleAbstractExtension ) ) )* otherlv_22= '}' )? (otherlv_23= 'attributes' otherlv_24= '{' ( (lv_attributes_25_0= ruleStringToAttributeMapEntry ) ) (otherlv_26= ',' ( (lv_attributes_27_0= ruleStringToAttributeMapEntry ) ) )* otherlv_28= '}' )? ) )
            // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:3391:1: (otherlv_0= 'Axiom' ( (lv_name_1_0= ruleEString ) ) ( (lv_localGenerated_2_0= 'localGenerated' ) )? ( (lv_theorem_3_0= 'theorem' ) )? otherlv_4= 'notTheorem' (otherlv_5= 'internalId' ( (lv_internalId_6_0= ruleEString ) ) )? (otherlv_7= 'comment' ( (lv_comment_8_0= ruleEString ) ) )? otherlv_9= 'Predicate' ( (lv_predicate_10_0= ruleEString ) ) (otherlv_11= 'annotations' otherlv_12= '{' ( (lv_annotations_13_0= ruleAnnotation ) ) (otherlv_14= ',' ( (lv_annotations_15_0= ruleAnnotation ) ) )* otherlv_16= '}' )? (otherlv_17= 'extensions' otherlv_18= '{' ( (lv_extensions_19_0= ruleAbstractExtension ) ) (otherlv_20= ',' ( (lv_extensions_21_0= ruleAbstractExtension ) ) )* otherlv_22= '}' )? (otherlv_23= 'attributes' otherlv_24= '{' ( (lv_attributes_25_0= ruleStringToAttributeMapEntry ) ) (otherlv_26= ',' ( (lv_attributes_27_0= ruleStringToAttributeMapEntry ) ) )* otherlv_28= '}' )? )
            {
            // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:3391:1: (otherlv_0= 'Axiom' ( (lv_name_1_0= ruleEString ) ) ( (lv_localGenerated_2_0= 'localGenerated' ) )? ( (lv_theorem_3_0= 'theorem' ) )? otherlv_4= 'notTheorem' (otherlv_5= 'internalId' ( (lv_internalId_6_0= ruleEString ) ) )? (otherlv_7= 'comment' ( (lv_comment_8_0= ruleEString ) ) )? otherlv_9= 'Predicate' ( (lv_predicate_10_0= ruleEString ) ) (otherlv_11= 'annotations' otherlv_12= '{' ( (lv_annotations_13_0= ruleAnnotation ) ) (otherlv_14= ',' ( (lv_annotations_15_0= ruleAnnotation ) ) )* otherlv_16= '}' )? (otherlv_17= 'extensions' otherlv_18= '{' ( (lv_extensions_19_0= ruleAbstractExtension ) ) (otherlv_20= ',' ( (lv_extensions_21_0= ruleAbstractExtension ) ) )* otherlv_22= '}' )? (otherlv_23= 'attributes' otherlv_24= '{' ( (lv_attributes_25_0= ruleStringToAttributeMapEntry ) ) (otherlv_26= ',' ( (lv_attributes_27_0= ruleStringToAttributeMapEntry ) ) )* otherlv_28= '}' )? )
            // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:3391:3: otherlv_0= 'Axiom' ( (lv_name_1_0= ruleEString ) ) ( (lv_localGenerated_2_0= 'localGenerated' ) )? ( (lv_theorem_3_0= 'theorem' ) )? otherlv_4= 'notTheorem' (otherlv_5= 'internalId' ( (lv_internalId_6_0= ruleEString ) ) )? (otherlv_7= 'comment' ( (lv_comment_8_0= ruleEString ) ) )? otherlv_9= 'Predicate' ( (lv_predicate_10_0= ruleEString ) ) (otherlv_11= 'annotations' otherlv_12= '{' ( (lv_annotations_13_0= ruleAnnotation ) ) (otherlv_14= ',' ( (lv_annotations_15_0= ruleAnnotation ) ) )* otherlv_16= '}' )? (otherlv_17= 'extensions' otherlv_18= '{' ( (lv_extensions_19_0= ruleAbstractExtension ) ) (otherlv_20= ',' ( (lv_extensions_21_0= ruleAbstractExtension ) ) )* otherlv_22= '}' )? (otherlv_23= 'attributes' otherlv_24= '{' ( (lv_attributes_25_0= ruleStringToAttributeMapEntry ) ) (otherlv_26= ',' ( (lv_attributes_27_0= ruleStringToAttributeMapEntry ) ) )* otherlv_28= '}' )?
            {
            otherlv_0=(Token)match(input,62,FollowSets000.FOLLOW_62_in_ruleAxiom6688); 

                	newLeafNode(otherlv_0, grammarAccess.getAxiomAccess().getAxiomKeyword_0());
                
            // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:3395:1: ( (lv_name_1_0= ruleEString ) )
            // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:3396:1: (lv_name_1_0= ruleEString )
            {
            // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:3396:1: (lv_name_1_0= ruleEString )
            // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:3397:3: lv_name_1_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getAxiomAccess().getNameEStringParserRuleCall_1_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleAxiom6709);
            lv_name_1_0=ruleEString();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getAxiomRule());
            	        }
                   		set(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"EString");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:3413:2: ( (lv_localGenerated_2_0= 'localGenerated' ) )?
            int alt111=2;
            int LA111_0 = input.LA(1);

            if ( (LA111_0==11) ) {
                alt111=1;
            }
            switch (alt111) {
                case 1 :
                    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:3414:1: (lv_localGenerated_2_0= 'localGenerated' )
                    {
                    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:3414:1: (lv_localGenerated_2_0= 'localGenerated' )
                    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:3415:3: lv_localGenerated_2_0= 'localGenerated'
                    {
                    lv_localGenerated_2_0=(Token)match(input,11,FollowSets000.FOLLOW_11_in_ruleAxiom6727); 

                            newLeafNode(lv_localGenerated_2_0, grammarAccess.getAxiomAccess().getLocalGeneratedLocalGeneratedKeyword_2_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getAxiomRule());
                    	        }
                           		setWithLastConsumed(current, "localGenerated", true, "localGenerated");
                    	    

                    }


                    }
                    break;

            }

            // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:3428:3: ( (lv_theorem_3_0= 'theorem' ) )?
            int alt112=2;
            int LA112_0 = input.LA(1);

            if ( (LA112_0==41) ) {
                alt112=1;
            }
            switch (alt112) {
                case 1 :
                    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:3429:1: (lv_theorem_3_0= 'theorem' )
                    {
                    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:3429:1: (lv_theorem_3_0= 'theorem' )
                    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:3430:3: lv_theorem_3_0= 'theorem'
                    {
                    lv_theorem_3_0=(Token)match(input,41,FollowSets000.FOLLOW_41_in_ruleAxiom6759); 

                            newLeafNode(lv_theorem_3_0, grammarAccess.getAxiomAccess().getTheoremTheoremKeyword_3_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getAxiomRule());
                    	        }
                           		setWithLastConsumed(current, "theorem", true, "theorem");
                    	    

                    }


                    }
                    break;

            }

            otherlv_4=(Token)match(input,42,FollowSets000.FOLLOW_42_in_ruleAxiom6785); 

                	newLeafNode(otherlv_4, grammarAccess.getAxiomAccess().getNotTheoremKeyword_4());
                
            // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:3447:1: (otherlv_5= 'internalId' ( (lv_internalId_6_0= ruleEString ) ) )?
            int alt113=2;
            int LA113_0 = input.LA(1);

            if ( (LA113_0==13) ) {
                alt113=1;
            }
            switch (alt113) {
                case 1 :
                    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:3447:3: otherlv_5= 'internalId' ( (lv_internalId_6_0= ruleEString ) )
                    {
                    otherlv_5=(Token)match(input,13,FollowSets000.FOLLOW_13_in_ruleAxiom6798); 

                        	newLeafNode(otherlv_5, grammarAccess.getAxiomAccess().getInternalIdKeyword_5_0());
                        
                    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:3451:1: ( (lv_internalId_6_0= ruleEString ) )
                    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:3452:1: (lv_internalId_6_0= ruleEString )
                    {
                    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:3452:1: (lv_internalId_6_0= ruleEString )
                    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:3453:3: lv_internalId_6_0= ruleEString
                    {
                     
                    	        newCompositeNode(grammarAccess.getAxiomAccess().getInternalIdEStringParserRuleCall_5_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleAxiom6819);
                    lv_internalId_6_0=ruleEString();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getAxiomRule());
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

            // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:3469:4: (otherlv_7= 'comment' ( (lv_comment_8_0= ruleEString ) ) )?
            int alt114=2;
            int LA114_0 = input.LA(1);

            if ( (LA114_0==39) ) {
                alt114=1;
            }
            switch (alt114) {
                case 1 :
                    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:3469:6: otherlv_7= 'comment' ( (lv_comment_8_0= ruleEString ) )
                    {
                    otherlv_7=(Token)match(input,39,FollowSets000.FOLLOW_39_in_ruleAxiom6834); 

                        	newLeafNode(otherlv_7, grammarAccess.getAxiomAccess().getCommentKeyword_6_0());
                        
                    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:3473:1: ( (lv_comment_8_0= ruleEString ) )
                    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:3474:1: (lv_comment_8_0= ruleEString )
                    {
                    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:3474:1: (lv_comment_8_0= ruleEString )
                    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:3475:3: lv_comment_8_0= ruleEString
                    {
                     
                    	        newCompositeNode(grammarAccess.getAxiomAccess().getCommentEStringParserRuleCall_6_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleAxiom6855);
                    lv_comment_8_0=ruleEString();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getAxiomRule());
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

            otherlv_9=(Token)match(input,43,FollowSets000.FOLLOW_43_in_ruleAxiom6869); 

                	newLeafNode(otherlv_9, grammarAccess.getAxiomAccess().getPredicateKeyword_7());
                
            // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:3495:1: ( (lv_predicate_10_0= ruleEString ) )
            // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:3496:1: (lv_predicate_10_0= ruleEString )
            {
            // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:3496:1: (lv_predicate_10_0= ruleEString )
            // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:3497:3: lv_predicate_10_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getAxiomAccess().getPredicateEStringParserRuleCall_8_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleAxiom6890);
            lv_predicate_10_0=ruleEString();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getAxiomRule());
            	        }
                   		set(
                   			current, 
                   			"predicate",
                    		lv_predicate_10_0, 
                    		"EString");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:3513:2: (otherlv_11= 'annotations' otherlv_12= '{' ( (lv_annotations_13_0= ruleAnnotation ) ) (otherlv_14= ',' ( (lv_annotations_15_0= ruleAnnotation ) ) )* otherlv_16= '}' )?
            int alt116=2;
            int LA116_0 = input.LA(1);

            if ( (LA116_0==20) ) {
                alt116=1;
            }
            switch (alt116) {
                case 1 :
                    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:3513:4: otherlv_11= 'annotations' otherlv_12= '{' ( (lv_annotations_13_0= ruleAnnotation ) ) (otherlv_14= ',' ( (lv_annotations_15_0= ruleAnnotation ) ) )* otherlv_16= '}'
                    {
                    otherlv_11=(Token)match(input,20,FollowSets000.FOLLOW_20_in_ruleAxiom6903); 

                        	newLeafNode(otherlv_11, grammarAccess.getAxiomAccess().getAnnotationsKeyword_9_0());
                        
                    otherlv_12=(Token)match(input,21,FollowSets000.FOLLOW_21_in_ruleAxiom6915); 

                        	newLeafNode(otherlv_12, grammarAccess.getAxiomAccess().getLeftCurlyBracketKeyword_9_1());
                        
                    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:3521:1: ( (lv_annotations_13_0= ruleAnnotation ) )
                    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:3522:1: (lv_annotations_13_0= ruleAnnotation )
                    {
                    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:3522:1: (lv_annotations_13_0= ruleAnnotation )
                    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:3523:3: lv_annotations_13_0= ruleAnnotation
                    {
                     
                    	        newCompositeNode(grammarAccess.getAxiomAccess().getAnnotationsAnnotationParserRuleCall_9_2_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleAnnotation_in_ruleAxiom6936);
                    lv_annotations_13_0=ruleAnnotation();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getAxiomRule());
                    	        }
                           		add(
                           			current, 
                           			"annotations",
                            		lv_annotations_13_0, 
                            		"Annotation");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:3539:2: (otherlv_14= ',' ( (lv_annotations_15_0= ruleAnnotation ) ) )*
                    loop115:
                    do {
                        int alt115=2;
                        int LA115_0 = input.LA(1);

                        if ( (LA115_0==17) ) {
                            alt115=1;
                        }


                        switch (alt115) {
                    	case 1 :
                    	    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:3539:4: otherlv_14= ',' ( (lv_annotations_15_0= ruleAnnotation ) )
                    	    {
                    	    otherlv_14=(Token)match(input,17,FollowSets000.FOLLOW_17_in_ruleAxiom6949); 

                    	        	newLeafNode(otherlv_14, grammarAccess.getAxiomAccess().getCommaKeyword_9_3_0());
                    	        
                    	    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:3543:1: ( (lv_annotations_15_0= ruleAnnotation ) )
                    	    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:3544:1: (lv_annotations_15_0= ruleAnnotation )
                    	    {
                    	    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:3544:1: (lv_annotations_15_0= ruleAnnotation )
                    	    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:3545:3: lv_annotations_15_0= ruleAnnotation
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getAxiomAccess().getAnnotationsAnnotationParserRuleCall_9_3_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleAnnotation_in_ruleAxiom6970);
                    	    lv_annotations_15_0=ruleAnnotation();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getAxiomRule());
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
                    	    break loop115;
                        }
                    } while (true);

                    otherlv_16=(Token)match(input,22,FollowSets000.FOLLOW_22_in_ruleAxiom6984); 

                        	newLeafNode(otherlv_16, grammarAccess.getAxiomAccess().getRightCurlyBracketKeyword_9_4());
                        

                    }
                    break;

            }

            // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:3565:3: (otherlv_17= 'extensions' otherlv_18= '{' ( (lv_extensions_19_0= ruleAbstractExtension ) ) (otherlv_20= ',' ( (lv_extensions_21_0= ruleAbstractExtension ) ) )* otherlv_22= '}' )?
            int alt118=2;
            int LA118_0 = input.LA(1);

            if ( (LA118_0==23) ) {
                alt118=1;
            }
            switch (alt118) {
                case 1 :
                    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:3565:5: otherlv_17= 'extensions' otherlv_18= '{' ( (lv_extensions_19_0= ruleAbstractExtension ) ) (otherlv_20= ',' ( (lv_extensions_21_0= ruleAbstractExtension ) ) )* otherlv_22= '}'
                    {
                    otherlv_17=(Token)match(input,23,FollowSets000.FOLLOW_23_in_ruleAxiom6999); 

                        	newLeafNode(otherlv_17, grammarAccess.getAxiomAccess().getExtensionsKeyword_10_0());
                        
                    otherlv_18=(Token)match(input,21,FollowSets000.FOLLOW_21_in_ruleAxiom7011); 

                        	newLeafNode(otherlv_18, grammarAccess.getAxiomAccess().getLeftCurlyBracketKeyword_10_1());
                        
                    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:3573:1: ( (lv_extensions_19_0= ruleAbstractExtension ) )
                    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:3574:1: (lv_extensions_19_0= ruleAbstractExtension )
                    {
                    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:3574:1: (lv_extensions_19_0= ruleAbstractExtension )
                    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:3575:3: lv_extensions_19_0= ruleAbstractExtension
                    {
                     
                    	        newCompositeNode(grammarAccess.getAxiomAccess().getExtensionsAbstractExtensionParserRuleCall_10_2_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleAbstractExtension_in_ruleAxiom7032);
                    lv_extensions_19_0=ruleAbstractExtension();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getAxiomRule());
                    	        }
                           		add(
                           			current, 
                           			"extensions",
                            		lv_extensions_19_0, 
                            		"AbstractExtension");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:3591:2: (otherlv_20= ',' ( (lv_extensions_21_0= ruleAbstractExtension ) ) )*
                    loop117:
                    do {
                        int alt117=2;
                        int LA117_0 = input.LA(1);

                        if ( (LA117_0==17) ) {
                            alt117=1;
                        }


                        switch (alt117) {
                    	case 1 :
                    	    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:3591:4: otherlv_20= ',' ( (lv_extensions_21_0= ruleAbstractExtension ) )
                    	    {
                    	    otherlv_20=(Token)match(input,17,FollowSets000.FOLLOW_17_in_ruleAxiom7045); 

                    	        	newLeafNode(otherlv_20, grammarAccess.getAxiomAccess().getCommaKeyword_10_3_0());
                    	        
                    	    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:3595:1: ( (lv_extensions_21_0= ruleAbstractExtension ) )
                    	    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:3596:1: (lv_extensions_21_0= ruleAbstractExtension )
                    	    {
                    	    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:3596:1: (lv_extensions_21_0= ruleAbstractExtension )
                    	    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:3597:3: lv_extensions_21_0= ruleAbstractExtension
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getAxiomAccess().getExtensionsAbstractExtensionParserRuleCall_10_3_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleAbstractExtension_in_ruleAxiom7066);
                    	    lv_extensions_21_0=ruleAbstractExtension();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getAxiomRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"extensions",
                    	            		lv_extensions_21_0, 
                    	            		"AbstractExtension");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop117;
                        }
                    } while (true);

                    otherlv_22=(Token)match(input,22,FollowSets000.FOLLOW_22_in_ruleAxiom7080); 

                        	newLeafNode(otherlv_22, grammarAccess.getAxiomAccess().getRightCurlyBracketKeyword_10_4());
                        

                    }
                    break;

            }

            // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:3617:3: (otherlv_23= 'attributes' otherlv_24= '{' ( (lv_attributes_25_0= ruleStringToAttributeMapEntry ) ) (otherlv_26= ',' ( (lv_attributes_27_0= ruleStringToAttributeMapEntry ) ) )* otherlv_28= '}' )?
            int alt120=2;
            int LA120_0 = input.LA(1);

            if ( (LA120_0==24) ) {
                alt120=1;
            }
            switch (alt120) {
                case 1 :
                    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:3617:5: otherlv_23= 'attributes' otherlv_24= '{' ( (lv_attributes_25_0= ruleStringToAttributeMapEntry ) ) (otherlv_26= ',' ( (lv_attributes_27_0= ruleStringToAttributeMapEntry ) ) )* otherlv_28= '}'
                    {
                    otherlv_23=(Token)match(input,24,FollowSets000.FOLLOW_24_in_ruleAxiom7095); 

                        	newLeafNode(otherlv_23, grammarAccess.getAxiomAccess().getAttributesKeyword_11_0());
                        
                    otherlv_24=(Token)match(input,21,FollowSets000.FOLLOW_21_in_ruleAxiom7107); 

                        	newLeafNode(otherlv_24, grammarAccess.getAxiomAccess().getLeftCurlyBracketKeyword_11_1());
                        
                    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:3625:1: ( (lv_attributes_25_0= ruleStringToAttributeMapEntry ) )
                    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:3626:1: (lv_attributes_25_0= ruleStringToAttributeMapEntry )
                    {
                    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:3626:1: (lv_attributes_25_0= ruleStringToAttributeMapEntry )
                    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:3627:3: lv_attributes_25_0= ruleStringToAttributeMapEntry
                    {
                     
                    	        newCompositeNode(grammarAccess.getAxiomAccess().getAttributesStringToAttributeMapEntryParserRuleCall_11_2_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleStringToAttributeMapEntry_in_ruleAxiom7128);
                    lv_attributes_25_0=ruleStringToAttributeMapEntry();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getAxiomRule());
                    	        }
                           		add(
                           			current, 
                           			"attributes",
                            		lv_attributes_25_0, 
                            		"StringToAttributeMapEntry");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:3643:2: (otherlv_26= ',' ( (lv_attributes_27_0= ruleStringToAttributeMapEntry ) ) )*
                    loop119:
                    do {
                        int alt119=2;
                        int LA119_0 = input.LA(1);

                        if ( (LA119_0==17) ) {
                            alt119=1;
                        }


                        switch (alt119) {
                    	case 1 :
                    	    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:3643:4: otherlv_26= ',' ( (lv_attributes_27_0= ruleStringToAttributeMapEntry ) )
                    	    {
                    	    otherlv_26=(Token)match(input,17,FollowSets000.FOLLOW_17_in_ruleAxiom7141); 

                    	        	newLeafNode(otherlv_26, grammarAccess.getAxiomAccess().getCommaKeyword_11_3_0());
                    	        
                    	    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:3647:1: ( (lv_attributes_27_0= ruleStringToAttributeMapEntry ) )
                    	    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:3648:1: (lv_attributes_27_0= ruleStringToAttributeMapEntry )
                    	    {
                    	    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:3648:1: (lv_attributes_27_0= ruleStringToAttributeMapEntry )
                    	    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:3649:3: lv_attributes_27_0= ruleStringToAttributeMapEntry
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getAxiomAccess().getAttributesStringToAttributeMapEntryParserRuleCall_11_3_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleStringToAttributeMapEntry_in_ruleAxiom7162);
                    	    lv_attributes_27_0=ruleStringToAttributeMapEntry();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getAxiomRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"attributes",
                    	            		lv_attributes_27_0, 
                    	            		"StringToAttributeMapEntry");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop119;
                        }
                    } while (true);

                    otherlv_28=(Token)match(input,22,FollowSets000.FOLLOW_22_in_ruleAxiom7176); 

                        	newLeafNode(otherlv_28, grammarAccess.getAxiomAccess().getRightCurlyBracketKeyword_11_4());
                        

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
    // $ANTLR end "ruleAxiom"


    // $ANTLR start "entryRuleParameter"
    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:3677:1: entryRuleParameter returns [EObject current=null] : iv_ruleParameter= ruleParameter EOF ;
    public final EObject entryRuleParameter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParameter = null;


        try {
            // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:3678:2: (iv_ruleParameter= ruleParameter EOF )
            // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:3679:2: iv_ruleParameter= ruleParameter EOF
            {
             newCompositeNode(grammarAccess.getParameterRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleParameter_in_entryRuleParameter7214);
            iv_ruleParameter=ruleParameter();

            state._fsp--;

             current =iv_ruleParameter; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleParameter7224); 

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
    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:3686:1: ruleParameter returns [EObject current=null] : ( () ( (lv_localGenerated_1_0= 'localGenerated' ) )? otherlv_2= 'Parameter' ( (lv_name_3_0= ruleEString ) ) (otherlv_4= 'internalId' ( (lv_internalId_5_0= ruleEString ) ) )? (otherlv_6= 'comment' ( (lv_comment_7_0= ruleEString ) ) )? (otherlv_8= 'annotations' otherlv_9= '{' ( (lv_annotations_10_0= ruleAnnotation ) ) (otherlv_11= ',' ( (lv_annotations_12_0= ruleAnnotation ) ) )* otherlv_13= '}' )? (otherlv_14= 'extensions' otherlv_15= '{' ( (lv_extensions_16_0= ruleAbstractExtension ) ) (otherlv_17= ',' ( (lv_extensions_18_0= ruleAbstractExtension ) ) )* otherlv_19= '}' )? (otherlv_20= 'attributes' otherlv_21= '{' ( (lv_attributes_22_0= ruleStringToAttributeMapEntry ) ) (otherlv_23= ',' ( (lv_attributes_24_0= ruleStringToAttributeMapEntry ) ) )* otherlv_25= '}' )? ) ;
    public final EObject ruleParameter() throws RecognitionException {
        EObject current = null;

        Token lv_localGenerated_1_0=null;
        Token otherlv_2=null;
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
        Token otherlv_21=null;
        Token otherlv_23=null;
        Token otherlv_25=null;
        AntlrDatatypeRuleToken lv_name_3_0 = null;

        AntlrDatatypeRuleToken lv_internalId_5_0 = null;

        AntlrDatatypeRuleToken lv_comment_7_0 = null;

        EObject lv_annotations_10_0 = null;

        EObject lv_annotations_12_0 = null;

        EObject lv_extensions_16_0 = null;

        EObject lv_extensions_18_0 = null;

        EObject lv_attributes_22_0 = null;

        EObject lv_attributes_24_0 = null;


         enterRule(); 
            
        try {
            // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:3689:28: ( ( () ( (lv_localGenerated_1_0= 'localGenerated' ) )? otherlv_2= 'Parameter' ( (lv_name_3_0= ruleEString ) ) (otherlv_4= 'internalId' ( (lv_internalId_5_0= ruleEString ) ) )? (otherlv_6= 'comment' ( (lv_comment_7_0= ruleEString ) ) )? (otherlv_8= 'annotations' otherlv_9= '{' ( (lv_annotations_10_0= ruleAnnotation ) ) (otherlv_11= ',' ( (lv_annotations_12_0= ruleAnnotation ) ) )* otherlv_13= '}' )? (otherlv_14= 'extensions' otherlv_15= '{' ( (lv_extensions_16_0= ruleAbstractExtension ) ) (otherlv_17= ',' ( (lv_extensions_18_0= ruleAbstractExtension ) ) )* otherlv_19= '}' )? (otherlv_20= 'attributes' otherlv_21= '{' ( (lv_attributes_22_0= ruleStringToAttributeMapEntry ) ) (otherlv_23= ',' ( (lv_attributes_24_0= ruleStringToAttributeMapEntry ) ) )* otherlv_25= '}' )? ) )
            // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:3690:1: ( () ( (lv_localGenerated_1_0= 'localGenerated' ) )? otherlv_2= 'Parameter' ( (lv_name_3_0= ruleEString ) ) (otherlv_4= 'internalId' ( (lv_internalId_5_0= ruleEString ) ) )? (otherlv_6= 'comment' ( (lv_comment_7_0= ruleEString ) ) )? (otherlv_8= 'annotations' otherlv_9= '{' ( (lv_annotations_10_0= ruleAnnotation ) ) (otherlv_11= ',' ( (lv_annotations_12_0= ruleAnnotation ) ) )* otherlv_13= '}' )? (otherlv_14= 'extensions' otherlv_15= '{' ( (lv_extensions_16_0= ruleAbstractExtension ) ) (otherlv_17= ',' ( (lv_extensions_18_0= ruleAbstractExtension ) ) )* otherlv_19= '}' )? (otherlv_20= 'attributes' otherlv_21= '{' ( (lv_attributes_22_0= ruleStringToAttributeMapEntry ) ) (otherlv_23= ',' ( (lv_attributes_24_0= ruleStringToAttributeMapEntry ) ) )* otherlv_25= '}' )? )
            {
            // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:3690:1: ( () ( (lv_localGenerated_1_0= 'localGenerated' ) )? otherlv_2= 'Parameter' ( (lv_name_3_0= ruleEString ) ) (otherlv_4= 'internalId' ( (lv_internalId_5_0= ruleEString ) ) )? (otherlv_6= 'comment' ( (lv_comment_7_0= ruleEString ) ) )? (otherlv_8= 'annotations' otherlv_9= '{' ( (lv_annotations_10_0= ruleAnnotation ) ) (otherlv_11= ',' ( (lv_annotations_12_0= ruleAnnotation ) ) )* otherlv_13= '}' )? (otherlv_14= 'extensions' otherlv_15= '{' ( (lv_extensions_16_0= ruleAbstractExtension ) ) (otherlv_17= ',' ( (lv_extensions_18_0= ruleAbstractExtension ) ) )* otherlv_19= '}' )? (otherlv_20= 'attributes' otherlv_21= '{' ( (lv_attributes_22_0= ruleStringToAttributeMapEntry ) ) (otherlv_23= ',' ( (lv_attributes_24_0= ruleStringToAttributeMapEntry ) ) )* otherlv_25= '}' )? )
            // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:3690:2: () ( (lv_localGenerated_1_0= 'localGenerated' ) )? otherlv_2= 'Parameter' ( (lv_name_3_0= ruleEString ) ) (otherlv_4= 'internalId' ( (lv_internalId_5_0= ruleEString ) ) )? (otherlv_6= 'comment' ( (lv_comment_7_0= ruleEString ) ) )? (otherlv_8= 'annotations' otherlv_9= '{' ( (lv_annotations_10_0= ruleAnnotation ) ) (otherlv_11= ',' ( (lv_annotations_12_0= ruleAnnotation ) ) )* otherlv_13= '}' )? (otherlv_14= 'extensions' otherlv_15= '{' ( (lv_extensions_16_0= ruleAbstractExtension ) ) (otherlv_17= ',' ( (lv_extensions_18_0= ruleAbstractExtension ) ) )* otherlv_19= '}' )? (otherlv_20= 'attributes' otherlv_21= '{' ( (lv_attributes_22_0= ruleStringToAttributeMapEntry ) ) (otherlv_23= ',' ( (lv_attributes_24_0= ruleStringToAttributeMapEntry ) ) )* otherlv_25= '}' )?
            {
            // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:3690:2: ()
            // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:3691:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getParameterAccess().getParameterAction_0(),
                        current);
                

            }

            // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:3696:2: ( (lv_localGenerated_1_0= 'localGenerated' ) )?
            int alt121=2;
            int LA121_0 = input.LA(1);

            if ( (LA121_0==11) ) {
                alt121=1;
            }
            switch (alt121) {
                case 1 :
                    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:3697:1: (lv_localGenerated_1_0= 'localGenerated' )
                    {
                    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:3697:1: (lv_localGenerated_1_0= 'localGenerated' )
                    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:3698:3: lv_localGenerated_1_0= 'localGenerated'
                    {
                    lv_localGenerated_1_0=(Token)match(input,11,FollowSets000.FOLLOW_11_in_ruleParameter7276); 

                            newLeafNode(lv_localGenerated_1_0, grammarAccess.getParameterAccess().getLocalGeneratedLocalGeneratedKeyword_1_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getParameterRule());
                    	        }
                           		setWithLastConsumed(current, "localGenerated", true, "localGenerated");
                    	    

                    }


                    }
                    break;

            }

            otherlv_2=(Token)match(input,63,FollowSets000.FOLLOW_63_in_ruleParameter7302); 

                	newLeafNode(otherlv_2, grammarAccess.getParameterAccess().getParameterKeyword_2());
                
            // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:3715:1: ( (lv_name_3_0= ruleEString ) )
            // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:3716:1: (lv_name_3_0= ruleEString )
            {
            // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:3716:1: (lv_name_3_0= ruleEString )
            // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:3717:3: lv_name_3_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getParameterAccess().getNameEStringParserRuleCall_3_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleParameter7323);
            lv_name_3_0=ruleEString();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getParameterRule());
            	        }
                   		set(
                   			current, 
                   			"name",
                    		lv_name_3_0, 
                    		"EString");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:3733:2: (otherlv_4= 'internalId' ( (lv_internalId_5_0= ruleEString ) ) )?
            int alt122=2;
            int LA122_0 = input.LA(1);

            if ( (LA122_0==13) ) {
                alt122=1;
            }
            switch (alt122) {
                case 1 :
                    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:3733:4: otherlv_4= 'internalId' ( (lv_internalId_5_0= ruleEString ) )
                    {
                    otherlv_4=(Token)match(input,13,FollowSets000.FOLLOW_13_in_ruleParameter7336); 

                        	newLeafNode(otherlv_4, grammarAccess.getParameterAccess().getInternalIdKeyword_4_0());
                        
                    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:3737:1: ( (lv_internalId_5_0= ruleEString ) )
                    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:3738:1: (lv_internalId_5_0= ruleEString )
                    {
                    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:3738:1: (lv_internalId_5_0= ruleEString )
                    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:3739:3: lv_internalId_5_0= ruleEString
                    {
                     
                    	        newCompositeNode(grammarAccess.getParameterAccess().getInternalIdEStringParserRuleCall_4_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleParameter7357);
                    lv_internalId_5_0=ruleEString();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getParameterRule());
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

            // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:3755:4: (otherlv_6= 'comment' ( (lv_comment_7_0= ruleEString ) ) )?
            int alt123=2;
            int LA123_0 = input.LA(1);

            if ( (LA123_0==39) ) {
                alt123=1;
            }
            switch (alt123) {
                case 1 :
                    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:3755:6: otherlv_6= 'comment' ( (lv_comment_7_0= ruleEString ) )
                    {
                    otherlv_6=(Token)match(input,39,FollowSets000.FOLLOW_39_in_ruleParameter7372); 

                        	newLeafNode(otherlv_6, grammarAccess.getParameterAccess().getCommentKeyword_5_0());
                        
                    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:3759:1: ( (lv_comment_7_0= ruleEString ) )
                    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:3760:1: (lv_comment_7_0= ruleEString )
                    {
                    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:3760:1: (lv_comment_7_0= ruleEString )
                    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:3761:3: lv_comment_7_0= ruleEString
                    {
                     
                    	        newCompositeNode(grammarAccess.getParameterAccess().getCommentEStringParserRuleCall_5_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleParameter7393);
                    lv_comment_7_0=ruleEString();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getParameterRule());
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

            // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:3777:4: (otherlv_8= 'annotations' otherlv_9= '{' ( (lv_annotations_10_0= ruleAnnotation ) ) (otherlv_11= ',' ( (lv_annotations_12_0= ruleAnnotation ) ) )* otherlv_13= '}' )?
            int alt125=2;
            int LA125_0 = input.LA(1);

            if ( (LA125_0==20) ) {
                alt125=1;
            }
            switch (alt125) {
                case 1 :
                    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:3777:6: otherlv_8= 'annotations' otherlv_9= '{' ( (lv_annotations_10_0= ruleAnnotation ) ) (otherlv_11= ',' ( (lv_annotations_12_0= ruleAnnotation ) ) )* otherlv_13= '}'
                    {
                    otherlv_8=(Token)match(input,20,FollowSets000.FOLLOW_20_in_ruleParameter7408); 

                        	newLeafNode(otherlv_8, grammarAccess.getParameterAccess().getAnnotationsKeyword_6_0());
                        
                    otherlv_9=(Token)match(input,21,FollowSets000.FOLLOW_21_in_ruleParameter7420); 

                        	newLeafNode(otherlv_9, grammarAccess.getParameterAccess().getLeftCurlyBracketKeyword_6_1());
                        
                    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:3785:1: ( (lv_annotations_10_0= ruleAnnotation ) )
                    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:3786:1: (lv_annotations_10_0= ruleAnnotation )
                    {
                    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:3786:1: (lv_annotations_10_0= ruleAnnotation )
                    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:3787:3: lv_annotations_10_0= ruleAnnotation
                    {
                     
                    	        newCompositeNode(grammarAccess.getParameterAccess().getAnnotationsAnnotationParserRuleCall_6_2_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleAnnotation_in_ruleParameter7441);
                    lv_annotations_10_0=ruleAnnotation();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getParameterRule());
                    	        }
                           		add(
                           			current, 
                           			"annotations",
                            		lv_annotations_10_0, 
                            		"Annotation");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:3803:2: (otherlv_11= ',' ( (lv_annotations_12_0= ruleAnnotation ) ) )*
                    loop124:
                    do {
                        int alt124=2;
                        int LA124_0 = input.LA(1);

                        if ( (LA124_0==17) ) {
                            alt124=1;
                        }


                        switch (alt124) {
                    	case 1 :
                    	    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:3803:4: otherlv_11= ',' ( (lv_annotations_12_0= ruleAnnotation ) )
                    	    {
                    	    otherlv_11=(Token)match(input,17,FollowSets000.FOLLOW_17_in_ruleParameter7454); 

                    	        	newLeafNode(otherlv_11, grammarAccess.getParameterAccess().getCommaKeyword_6_3_0());
                    	        
                    	    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:3807:1: ( (lv_annotations_12_0= ruleAnnotation ) )
                    	    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:3808:1: (lv_annotations_12_0= ruleAnnotation )
                    	    {
                    	    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:3808:1: (lv_annotations_12_0= ruleAnnotation )
                    	    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:3809:3: lv_annotations_12_0= ruleAnnotation
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getParameterAccess().getAnnotationsAnnotationParserRuleCall_6_3_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleAnnotation_in_ruleParameter7475);
                    	    lv_annotations_12_0=ruleAnnotation();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getParameterRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"annotations",
                    	            		lv_annotations_12_0, 
                    	            		"Annotation");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop124;
                        }
                    } while (true);

                    otherlv_13=(Token)match(input,22,FollowSets000.FOLLOW_22_in_ruleParameter7489); 

                        	newLeafNode(otherlv_13, grammarAccess.getParameterAccess().getRightCurlyBracketKeyword_6_4());
                        

                    }
                    break;

            }

            // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:3829:3: (otherlv_14= 'extensions' otherlv_15= '{' ( (lv_extensions_16_0= ruleAbstractExtension ) ) (otherlv_17= ',' ( (lv_extensions_18_0= ruleAbstractExtension ) ) )* otherlv_19= '}' )?
            int alt127=2;
            int LA127_0 = input.LA(1);

            if ( (LA127_0==23) ) {
                alt127=1;
            }
            switch (alt127) {
                case 1 :
                    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:3829:5: otherlv_14= 'extensions' otherlv_15= '{' ( (lv_extensions_16_0= ruleAbstractExtension ) ) (otherlv_17= ',' ( (lv_extensions_18_0= ruleAbstractExtension ) ) )* otherlv_19= '}'
                    {
                    otherlv_14=(Token)match(input,23,FollowSets000.FOLLOW_23_in_ruleParameter7504); 

                        	newLeafNode(otherlv_14, grammarAccess.getParameterAccess().getExtensionsKeyword_7_0());
                        
                    otherlv_15=(Token)match(input,21,FollowSets000.FOLLOW_21_in_ruleParameter7516); 

                        	newLeafNode(otherlv_15, grammarAccess.getParameterAccess().getLeftCurlyBracketKeyword_7_1());
                        
                    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:3837:1: ( (lv_extensions_16_0= ruleAbstractExtension ) )
                    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:3838:1: (lv_extensions_16_0= ruleAbstractExtension )
                    {
                    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:3838:1: (lv_extensions_16_0= ruleAbstractExtension )
                    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:3839:3: lv_extensions_16_0= ruleAbstractExtension
                    {
                     
                    	        newCompositeNode(grammarAccess.getParameterAccess().getExtensionsAbstractExtensionParserRuleCall_7_2_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleAbstractExtension_in_ruleParameter7537);
                    lv_extensions_16_0=ruleAbstractExtension();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getParameterRule());
                    	        }
                           		add(
                           			current, 
                           			"extensions",
                            		lv_extensions_16_0, 
                            		"AbstractExtension");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:3855:2: (otherlv_17= ',' ( (lv_extensions_18_0= ruleAbstractExtension ) ) )*
                    loop126:
                    do {
                        int alt126=2;
                        int LA126_0 = input.LA(1);

                        if ( (LA126_0==17) ) {
                            alt126=1;
                        }


                        switch (alt126) {
                    	case 1 :
                    	    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:3855:4: otherlv_17= ',' ( (lv_extensions_18_0= ruleAbstractExtension ) )
                    	    {
                    	    otherlv_17=(Token)match(input,17,FollowSets000.FOLLOW_17_in_ruleParameter7550); 

                    	        	newLeafNode(otherlv_17, grammarAccess.getParameterAccess().getCommaKeyword_7_3_0());
                    	        
                    	    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:3859:1: ( (lv_extensions_18_0= ruleAbstractExtension ) )
                    	    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:3860:1: (lv_extensions_18_0= ruleAbstractExtension )
                    	    {
                    	    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:3860:1: (lv_extensions_18_0= ruleAbstractExtension )
                    	    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:3861:3: lv_extensions_18_0= ruleAbstractExtension
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getParameterAccess().getExtensionsAbstractExtensionParserRuleCall_7_3_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleAbstractExtension_in_ruleParameter7571);
                    	    lv_extensions_18_0=ruleAbstractExtension();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getParameterRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"extensions",
                    	            		lv_extensions_18_0, 
                    	            		"AbstractExtension");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop126;
                        }
                    } while (true);

                    otherlv_19=(Token)match(input,22,FollowSets000.FOLLOW_22_in_ruleParameter7585); 

                        	newLeafNode(otherlv_19, grammarAccess.getParameterAccess().getRightCurlyBracketKeyword_7_4());
                        

                    }
                    break;

            }

            // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:3881:3: (otherlv_20= 'attributes' otherlv_21= '{' ( (lv_attributes_22_0= ruleStringToAttributeMapEntry ) ) (otherlv_23= ',' ( (lv_attributes_24_0= ruleStringToAttributeMapEntry ) ) )* otherlv_25= '}' )?
            int alt129=2;
            int LA129_0 = input.LA(1);

            if ( (LA129_0==24) ) {
                alt129=1;
            }
            switch (alt129) {
                case 1 :
                    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:3881:5: otherlv_20= 'attributes' otherlv_21= '{' ( (lv_attributes_22_0= ruleStringToAttributeMapEntry ) ) (otherlv_23= ',' ( (lv_attributes_24_0= ruleStringToAttributeMapEntry ) ) )* otherlv_25= '}'
                    {
                    otherlv_20=(Token)match(input,24,FollowSets000.FOLLOW_24_in_ruleParameter7600); 

                        	newLeafNode(otherlv_20, grammarAccess.getParameterAccess().getAttributesKeyword_8_0());
                        
                    otherlv_21=(Token)match(input,21,FollowSets000.FOLLOW_21_in_ruleParameter7612); 

                        	newLeafNode(otherlv_21, grammarAccess.getParameterAccess().getLeftCurlyBracketKeyword_8_1());
                        
                    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:3889:1: ( (lv_attributes_22_0= ruleStringToAttributeMapEntry ) )
                    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:3890:1: (lv_attributes_22_0= ruleStringToAttributeMapEntry )
                    {
                    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:3890:1: (lv_attributes_22_0= ruleStringToAttributeMapEntry )
                    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:3891:3: lv_attributes_22_0= ruleStringToAttributeMapEntry
                    {
                     
                    	        newCompositeNode(grammarAccess.getParameterAccess().getAttributesStringToAttributeMapEntryParserRuleCall_8_2_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleStringToAttributeMapEntry_in_ruleParameter7633);
                    lv_attributes_22_0=ruleStringToAttributeMapEntry();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getParameterRule());
                    	        }
                           		add(
                           			current, 
                           			"attributes",
                            		lv_attributes_22_0, 
                            		"StringToAttributeMapEntry");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:3907:2: (otherlv_23= ',' ( (lv_attributes_24_0= ruleStringToAttributeMapEntry ) ) )*
                    loop128:
                    do {
                        int alt128=2;
                        int LA128_0 = input.LA(1);

                        if ( (LA128_0==17) ) {
                            alt128=1;
                        }


                        switch (alt128) {
                    	case 1 :
                    	    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:3907:4: otherlv_23= ',' ( (lv_attributes_24_0= ruleStringToAttributeMapEntry ) )
                    	    {
                    	    otherlv_23=(Token)match(input,17,FollowSets000.FOLLOW_17_in_ruleParameter7646); 

                    	        	newLeafNode(otherlv_23, grammarAccess.getParameterAccess().getCommaKeyword_8_3_0());
                    	        
                    	    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:3911:1: ( (lv_attributes_24_0= ruleStringToAttributeMapEntry ) )
                    	    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:3912:1: (lv_attributes_24_0= ruleStringToAttributeMapEntry )
                    	    {
                    	    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:3912:1: (lv_attributes_24_0= ruleStringToAttributeMapEntry )
                    	    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:3913:3: lv_attributes_24_0= ruleStringToAttributeMapEntry
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getParameterAccess().getAttributesStringToAttributeMapEntryParserRuleCall_8_3_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleStringToAttributeMapEntry_in_ruleParameter7667);
                    	    lv_attributes_24_0=ruleStringToAttributeMapEntry();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getParameterRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"attributes",
                    	            		lv_attributes_24_0, 
                    	            		"StringToAttributeMapEntry");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop128;
                        }
                    } while (true);

                    otherlv_25=(Token)match(input,22,FollowSets000.FOLLOW_22_in_ruleParameter7681); 

                        	newLeafNode(otherlv_25, grammarAccess.getParameterAccess().getRightCurlyBracketKeyword_8_4());
                        

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
    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:3941:1: entryRuleGuard returns [EObject current=null] : iv_ruleGuard= ruleGuard EOF ;
    public final EObject entryRuleGuard() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGuard = null;


        try {
            // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:3942:2: (iv_ruleGuard= ruleGuard EOF )
            // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:3943:2: iv_ruleGuard= ruleGuard EOF
            {
             newCompositeNode(grammarAccess.getGuardRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleGuard_in_entryRuleGuard7719);
            iv_ruleGuard=ruleGuard();

            state._fsp--;

             current =iv_ruleGuard; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleGuard7729); 

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
    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:3950:1: ruleGuard returns [EObject current=null] : (otherlv_0= 'Guard' ( (lv_name_1_0= ruleEString ) ) ( (lv_localGenerated_2_0= 'localGenerated' ) )? ( (lv_theorem_3_0= 'theorem' ) )? otherlv_4= 'notTheorem' (otherlv_5= 'internalId' ( (lv_internalId_6_0= ruleEString ) ) )? (otherlv_7= 'comment' ( (lv_comment_8_0= ruleEString ) ) )? otherlv_9= 'Predicate' ( (lv_predicate_10_0= ruleEString ) ) (otherlv_11= 'annotations' otherlv_12= '{' ( (lv_annotations_13_0= ruleAnnotation ) ) (otherlv_14= ',' ( (lv_annotations_15_0= ruleAnnotation ) ) )* otherlv_16= '}' )? (otherlv_17= 'extensions' otherlv_18= '{' ( (lv_extensions_19_0= ruleAbstractExtension ) ) (otherlv_20= ',' ( (lv_extensions_21_0= ruleAbstractExtension ) ) )* otherlv_22= '}' )? (otherlv_23= 'attributes' otherlv_24= '{' ( (lv_attributes_25_0= ruleStringToAttributeMapEntry ) ) (otherlv_26= ',' ( (lv_attributes_27_0= ruleStringToAttributeMapEntry ) ) )* otherlv_28= '}' )? ) ;
    public final EObject ruleGuard() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_localGenerated_2_0=null;
        Token lv_theorem_3_0=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
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
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        AntlrDatatypeRuleToken lv_internalId_6_0 = null;

        AntlrDatatypeRuleToken lv_comment_8_0 = null;

        AntlrDatatypeRuleToken lv_predicate_10_0 = null;

        EObject lv_annotations_13_0 = null;

        EObject lv_annotations_15_0 = null;

        EObject lv_extensions_19_0 = null;

        EObject lv_extensions_21_0 = null;

        EObject lv_attributes_25_0 = null;

        EObject lv_attributes_27_0 = null;


         enterRule(); 
            
        try {
            // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:3953:28: ( (otherlv_0= 'Guard' ( (lv_name_1_0= ruleEString ) ) ( (lv_localGenerated_2_0= 'localGenerated' ) )? ( (lv_theorem_3_0= 'theorem' ) )? otherlv_4= 'notTheorem' (otherlv_5= 'internalId' ( (lv_internalId_6_0= ruleEString ) ) )? (otherlv_7= 'comment' ( (lv_comment_8_0= ruleEString ) ) )? otherlv_9= 'Predicate' ( (lv_predicate_10_0= ruleEString ) ) (otherlv_11= 'annotations' otherlv_12= '{' ( (lv_annotations_13_0= ruleAnnotation ) ) (otherlv_14= ',' ( (lv_annotations_15_0= ruleAnnotation ) ) )* otherlv_16= '}' )? (otherlv_17= 'extensions' otherlv_18= '{' ( (lv_extensions_19_0= ruleAbstractExtension ) ) (otherlv_20= ',' ( (lv_extensions_21_0= ruleAbstractExtension ) ) )* otherlv_22= '}' )? (otherlv_23= 'attributes' otherlv_24= '{' ( (lv_attributes_25_0= ruleStringToAttributeMapEntry ) ) (otherlv_26= ',' ( (lv_attributes_27_0= ruleStringToAttributeMapEntry ) ) )* otherlv_28= '}' )? ) )
            // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:3954:1: (otherlv_0= 'Guard' ( (lv_name_1_0= ruleEString ) ) ( (lv_localGenerated_2_0= 'localGenerated' ) )? ( (lv_theorem_3_0= 'theorem' ) )? otherlv_4= 'notTheorem' (otherlv_5= 'internalId' ( (lv_internalId_6_0= ruleEString ) ) )? (otherlv_7= 'comment' ( (lv_comment_8_0= ruleEString ) ) )? otherlv_9= 'Predicate' ( (lv_predicate_10_0= ruleEString ) ) (otherlv_11= 'annotations' otherlv_12= '{' ( (lv_annotations_13_0= ruleAnnotation ) ) (otherlv_14= ',' ( (lv_annotations_15_0= ruleAnnotation ) ) )* otherlv_16= '}' )? (otherlv_17= 'extensions' otherlv_18= '{' ( (lv_extensions_19_0= ruleAbstractExtension ) ) (otherlv_20= ',' ( (lv_extensions_21_0= ruleAbstractExtension ) ) )* otherlv_22= '}' )? (otherlv_23= 'attributes' otherlv_24= '{' ( (lv_attributes_25_0= ruleStringToAttributeMapEntry ) ) (otherlv_26= ',' ( (lv_attributes_27_0= ruleStringToAttributeMapEntry ) ) )* otherlv_28= '}' )? )
            {
            // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:3954:1: (otherlv_0= 'Guard' ( (lv_name_1_0= ruleEString ) ) ( (lv_localGenerated_2_0= 'localGenerated' ) )? ( (lv_theorem_3_0= 'theorem' ) )? otherlv_4= 'notTheorem' (otherlv_5= 'internalId' ( (lv_internalId_6_0= ruleEString ) ) )? (otherlv_7= 'comment' ( (lv_comment_8_0= ruleEString ) ) )? otherlv_9= 'Predicate' ( (lv_predicate_10_0= ruleEString ) ) (otherlv_11= 'annotations' otherlv_12= '{' ( (lv_annotations_13_0= ruleAnnotation ) ) (otherlv_14= ',' ( (lv_annotations_15_0= ruleAnnotation ) ) )* otherlv_16= '}' )? (otherlv_17= 'extensions' otherlv_18= '{' ( (lv_extensions_19_0= ruleAbstractExtension ) ) (otherlv_20= ',' ( (lv_extensions_21_0= ruleAbstractExtension ) ) )* otherlv_22= '}' )? (otherlv_23= 'attributes' otherlv_24= '{' ( (lv_attributes_25_0= ruleStringToAttributeMapEntry ) ) (otherlv_26= ',' ( (lv_attributes_27_0= ruleStringToAttributeMapEntry ) ) )* otherlv_28= '}' )? )
            // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:3954:3: otherlv_0= 'Guard' ( (lv_name_1_0= ruleEString ) ) ( (lv_localGenerated_2_0= 'localGenerated' ) )? ( (lv_theorem_3_0= 'theorem' ) )? otherlv_4= 'notTheorem' (otherlv_5= 'internalId' ( (lv_internalId_6_0= ruleEString ) ) )? (otherlv_7= 'comment' ( (lv_comment_8_0= ruleEString ) ) )? otherlv_9= 'Predicate' ( (lv_predicate_10_0= ruleEString ) ) (otherlv_11= 'annotations' otherlv_12= '{' ( (lv_annotations_13_0= ruleAnnotation ) ) (otherlv_14= ',' ( (lv_annotations_15_0= ruleAnnotation ) ) )* otherlv_16= '}' )? (otherlv_17= 'extensions' otherlv_18= '{' ( (lv_extensions_19_0= ruleAbstractExtension ) ) (otherlv_20= ',' ( (lv_extensions_21_0= ruleAbstractExtension ) ) )* otherlv_22= '}' )? (otherlv_23= 'attributes' otherlv_24= '{' ( (lv_attributes_25_0= ruleStringToAttributeMapEntry ) ) (otherlv_26= ',' ( (lv_attributes_27_0= ruleStringToAttributeMapEntry ) ) )* otherlv_28= '}' )?
            {
            otherlv_0=(Token)match(input,64,FollowSets000.FOLLOW_64_in_ruleGuard7766); 

                	newLeafNode(otherlv_0, grammarAccess.getGuardAccess().getGuardKeyword_0());
                
            // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:3958:1: ( (lv_name_1_0= ruleEString ) )
            // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:3959:1: (lv_name_1_0= ruleEString )
            {
            // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:3959:1: (lv_name_1_0= ruleEString )
            // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:3960:3: lv_name_1_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getGuardAccess().getNameEStringParserRuleCall_1_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleGuard7787);
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

            // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:3976:2: ( (lv_localGenerated_2_0= 'localGenerated' ) )?
            int alt130=2;
            int LA130_0 = input.LA(1);

            if ( (LA130_0==11) ) {
                alt130=1;
            }
            switch (alt130) {
                case 1 :
                    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:3977:1: (lv_localGenerated_2_0= 'localGenerated' )
                    {
                    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:3977:1: (lv_localGenerated_2_0= 'localGenerated' )
                    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:3978:3: lv_localGenerated_2_0= 'localGenerated'
                    {
                    lv_localGenerated_2_0=(Token)match(input,11,FollowSets000.FOLLOW_11_in_ruleGuard7805); 

                            newLeafNode(lv_localGenerated_2_0, grammarAccess.getGuardAccess().getLocalGeneratedLocalGeneratedKeyword_2_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getGuardRule());
                    	        }
                           		setWithLastConsumed(current, "localGenerated", true, "localGenerated");
                    	    

                    }


                    }
                    break;

            }

            // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:3991:3: ( (lv_theorem_3_0= 'theorem' ) )?
            int alt131=2;
            int LA131_0 = input.LA(1);

            if ( (LA131_0==41) ) {
                alt131=1;
            }
            switch (alt131) {
                case 1 :
                    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:3992:1: (lv_theorem_3_0= 'theorem' )
                    {
                    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:3992:1: (lv_theorem_3_0= 'theorem' )
                    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:3993:3: lv_theorem_3_0= 'theorem'
                    {
                    lv_theorem_3_0=(Token)match(input,41,FollowSets000.FOLLOW_41_in_ruleGuard7837); 

                            newLeafNode(lv_theorem_3_0, grammarAccess.getGuardAccess().getTheoremTheoremKeyword_3_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getGuardRule());
                    	        }
                           		setWithLastConsumed(current, "theorem", true, "theorem");
                    	    

                    }


                    }
                    break;

            }

            otherlv_4=(Token)match(input,42,FollowSets000.FOLLOW_42_in_ruleGuard7863); 

                	newLeafNode(otherlv_4, grammarAccess.getGuardAccess().getNotTheoremKeyword_4());
                
            // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:4010:1: (otherlv_5= 'internalId' ( (lv_internalId_6_0= ruleEString ) ) )?
            int alt132=2;
            int LA132_0 = input.LA(1);

            if ( (LA132_0==13) ) {
                alt132=1;
            }
            switch (alt132) {
                case 1 :
                    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:4010:3: otherlv_5= 'internalId' ( (lv_internalId_6_0= ruleEString ) )
                    {
                    otherlv_5=(Token)match(input,13,FollowSets000.FOLLOW_13_in_ruleGuard7876); 

                        	newLeafNode(otherlv_5, grammarAccess.getGuardAccess().getInternalIdKeyword_5_0());
                        
                    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:4014:1: ( (lv_internalId_6_0= ruleEString ) )
                    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:4015:1: (lv_internalId_6_0= ruleEString )
                    {
                    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:4015:1: (lv_internalId_6_0= ruleEString )
                    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:4016:3: lv_internalId_6_0= ruleEString
                    {
                     
                    	        newCompositeNode(grammarAccess.getGuardAccess().getInternalIdEStringParserRuleCall_5_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleGuard7897);
                    lv_internalId_6_0=ruleEString();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getGuardRule());
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

            // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:4032:4: (otherlv_7= 'comment' ( (lv_comment_8_0= ruleEString ) ) )?
            int alt133=2;
            int LA133_0 = input.LA(1);

            if ( (LA133_0==39) ) {
                alt133=1;
            }
            switch (alt133) {
                case 1 :
                    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:4032:6: otherlv_7= 'comment' ( (lv_comment_8_0= ruleEString ) )
                    {
                    otherlv_7=(Token)match(input,39,FollowSets000.FOLLOW_39_in_ruleGuard7912); 

                        	newLeafNode(otherlv_7, grammarAccess.getGuardAccess().getCommentKeyword_6_0());
                        
                    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:4036:1: ( (lv_comment_8_0= ruleEString ) )
                    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:4037:1: (lv_comment_8_0= ruleEString )
                    {
                    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:4037:1: (lv_comment_8_0= ruleEString )
                    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:4038:3: lv_comment_8_0= ruleEString
                    {
                     
                    	        newCompositeNode(grammarAccess.getGuardAccess().getCommentEStringParserRuleCall_6_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleGuard7933);
                    lv_comment_8_0=ruleEString();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getGuardRule());
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

            otherlv_9=(Token)match(input,43,FollowSets000.FOLLOW_43_in_ruleGuard7947); 

                	newLeafNode(otherlv_9, grammarAccess.getGuardAccess().getPredicateKeyword_7());
                
            // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:4058:1: ( (lv_predicate_10_0= ruleEString ) )
            // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:4059:1: (lv_predicate_10_0= ruleEString )
            {
            // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:4059:1: (lv_predicate_10_0= ruleEString )
            // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:4060:3: lv_predicate_10_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getGuardAccess().getPredicateEStringParserRuleCall_8_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleGuard7968);
            lv_predicate_10_0=ruleEString();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getGuardRule());
            	        }
                   		set(
                   			current, 
                   			"predicate",
                    		lv_predicate_10_0, 
                    		"EString");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:4076:2: (otherlv_11= 'annotations' otherlv_12= '{' ( (lv_annotations_13_0= ruleAnnotation ) ) (otherlv_14= ',' ( (lv_annotations_15_0= ruleAnnotation ) ) )* otherlv_16= '}' )?
            int alt135=2;
            int LA135_0 = input.LA(1);

            if ( (LA135_0==20) ) {
                alt135=1;
            }
            switch (alt135) {
                case 1 :
                    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:4076:4: otherlv_11= 'annotations' otherlv_12= '{' ( (lv_annotations_13_0= ruleAnnotation ) ) (otherlv_14= ',' ( (lv_annotations_15_0= ruleAnnotation ) ) )* otherlv_16= '}'
                    {
                    otherlv_11=(Token)match(input,20,FollowSets000.FOLLOW_20_in_ruleGuard7981); 

                        	newLeafNode(otherlv_11, grammarAccess.getGuardAccess().getAnnotationsKeyword_9_0());
                        
                    otherlv_12=(Token)match(input,21,FollowSets000.FOLLOW_21_in_ruleGuard7993); 

                        	newLeafNode(otherlv_12, grammarAccess.getGuardAccess().getLeftCurlyBracketKeyword_9_1());
                        
                    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:4084:1: ( (lv_annotations_13_0= ruleAnnotation ) )
                    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:4085:1: (lv_annotations_13_0= ruleAnnotation )
                    {
                    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:4085:1: (lv_annotations_13_0= ruleAnnotation )
                    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:4086:3: lv_annotations_13_0= ruleAnnotation
                    {
                     
                    	        newCompositeNode(grammarAccess.getGuardAccess().getAnnotationsAnnotationParserRuleCall_9_2_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleAnnotation_in_ruleGuard8014);
                    lv_annotations_13_0=ruleAnnotation();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getGuardRule());
                    	        }
                           		add(
                           			current, 
                           			"annotations",
                            		lv_annotations_13_0, 
                            		"Annotation");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:4102:2: (otherlv_14= ',' ( (lv_annotations_15_0= ruleAnnotation ) ) )*
                    loop134:
                    do {
                        int alt134=2;
                        int LA134_0 = input.LA(1);

                        if ( (LA134_0==17) ) {
                            alt134=1;
                        }


                        switch (alt134) {
                    	case 1 :
                    	    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:4102:4: otherlv_14= ',' ( (lv_annotations_15_0= ruleAnnotation ) )
                    	    {
                    	    otherlv_14=(Token)match(input,17,FollowSets000.FOLLOW_17_in_ruleGuard8027); 

                    	        	newLeafNode(otherlv_14, grammarAccess.getGuardAccess().getCommaKeyword_9_3_0());
                    	        
                    	    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:4106:1: ( (lv_annotations_15_0= ruleAnnotation ) )
                    	    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:4107:1: (lv_annotations_15_0= ruleAnnotation )
                    	    {
                    	    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:4107:1: (lv_annotations_15_0= ruleAnnotation )
                    	    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:4108:3: lv_annotations_15_0= ruleAnnotation
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getGuardAccess().getAnnotationsAnnotationParserRuleCall_9_3_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleAnnotation_in_ruleGuard8048);
                    	    lv_annotations_15_0=ruleAnnotation();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getGuardRule());
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
                    	    break loop134;
                        }
                    } while (true);

                    otherlv_16=(Token)match(input,22,FollowSets000.FOLLOW_22_in_ruleGuard8062); 

                        	newLeafNode(otherlv_16, grammarAccess.getGuardAccess().getRightCurlyBracketKeyword_9_4());
                        

                    }
                    break;

            }

            // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:4128:3: (otherlv_17= 'extensions' otherlv_18= '{' ( (lv_extensions_19_0= ruleAbstractExtension ) ) (otherlv_20= ',' ( (lv_extensions_21_0= ruleAbstractExtension ) ) )* otherlv_22= '}' )?
            int alt137=2;
            int LA137_0 = input.LA(1);

            if ( (LA137_0==23) ) {
                alt137=1;
            }
            switch (alt137) {
                case 1 :
                    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:4128:5: otherlv_17= 'extensions' otherlv_18= '{' ( (lv_extensions_19_0= ruleAbstractExtension ) ) (otherlv_20= ',' ( (lv_extensions_21_0= ruleAbstractExtension ) ) )* otherlv_22= '}'
                    {
                    otherlv_17=(Token)match(input,23,FollowSets000.FOLLOW_23_in_ruleGuard8077); 

                        	newLeafNode(otherlv_17, grammarAccess.getGuardAccess().getExtensionsKeyword_10_0());
                        
                    otherlv_18=(Token)match(input,21,FollowSets000.FOLLOW_21_in_ruleGuard8089); 

                        	newLeafNode(otherlv_18, grammarAccess.getGuardAccess().getLeftCurlyBracketKeyword_10_1());
                        
                    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:4136:1: ( (lv_extensions_19_0= ruleAbstractExtension ) )
                    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:4137:1: (lv_extensions_19_0= ruleAbstractExtension )
                    {
                    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:4137:1: (lv_extensions_19_0= ruleAbstractExtension )
                    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:4138:3: lv_extensions_19_0= ruleAbstractExtension
                    {
                     
                    	        newCompositeNode(grammarAccess.getGuardAccess().getExtensionsAbstractExtensionParserRuleCall_10_2_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleAbstractExtension_in_ruleGuard8110);
                    lv_extensions_19_0=ruleAbstractExtension();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getGuardRule());
                    	        }
                           		add(
                           			current, 
                           			"extensions",
                            		lv_extensions_19_0, 
                            		"AbstractExtension");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:4154:2: (otherlv_20= ',' ( (lv_extensions_21_0= ruleAbstractExtension ) ) )*
                    loop136:
                    do {
                        int alt136=2;
                        int LA136_0 = input.LA(1);

                        if ( (LA136_0==17) ) {
                            alt136=1;
                        }


                        switch (alt136) {
                    	case 1 :
                    	    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:4154:4: otherlv_20= ',' ( (lv_extensions_21_0= ruleAbstractExtension ) )
                    	    {
                    	    otherlv_20=(Token)match(input,17,FollowSets000.FOLLOW_17_in_ruleGuard8123); 

                    	        	newLeafNode(otherlv_20, grammarAccess.getGuardAccess().getCommaKeyword_10_3_0());
                    	        
                    	    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:4158:1: ( (lv_extensions_21_0= ruleAbstractExtension ) )
                    	    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:4159:1: (lv_extensions_21_0= ruleAbstractExtension )
                    	    {
                    	    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:4159:1: (lv_extensions_21_0= ruleAbstractExtension )
                    	    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:4160:3: lv_extensions_21_0= ruleAbstractExtension
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getGuardAccess().getExtensionsAbstractExtensionParserRuleCall_10_3_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleAbstractExtension_in_ruleGuard8144);
                    	    lv_extensions_21_0=ruleAbstractExtension();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getGuardRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"extensions",
                    	            		lv_extensions_21_0, 
                    	            		"AbstractExtension");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop136;
                        }
                    } while (true);

                    otherlv_22=(Token)match(input,22,FollowSets000.FOLLOW_22_in_ruleGuard8158); 

                        	newLeafNode(otherlv_22, grammarAccess.getGuardAccess().getRightCurlyBracketKeyword_10_4());
                        

                    }
                    break;

            }

            // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:4180:3: (otherlv_23= 'attributes' otherlv_24= '{' ( (lv_attributes_25_0= ruleStringToAttributeMapEntry ) ) (otherlv_26= ',' ( (lv_attributes_27_0= ruleStringToAttributeMapEntry ) ) )* otherlv_28= '}' )?
            int alt139=2;
            int LA139_0 = input.LA(1);

            if ( (LA139_0==24) ) {
                alt139=1;
            }
            switch (alt139) {
                case 1 :
                    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:4180:5: otherlv_23= 'attributes' otherlv_24= '{' ( (lv_attributes_25_0= ruleStringToAttributeMapEntry ) ) (otherlv_26= ',' ( (lv_attributes_27_0= ruleStringToAttributeMapEntry ) ) )* otherlv_28= '}'
                    {
                    otherlv_23=(Token)match(input,24,FollowSets000.FOLLOW_24_in_ruleGuard8173); 

                        	newLeafNode(otherlv_23, grammarAccess.getGuardAccess().getAttributesKeyword_11_0());
                        
                    otherlv_24=(Token)match(input,21,FollowSets000.FOLLOW_21_in_ruleGuard8185); 

                        	newLeafNode(otherlv_24, grammarAccess.getGuardAccess().getLeftCurlyBracketKeyword_11_1());
                        
                    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:4188:1: ( (lv_attributes_25_0= ruleStringToAttributeMapEntry ) )
                    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:4189:1: (lv_attributes_25_0= ruleStringToAttributeMapEntry )
                    {
                    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:4189:1: (lv_attributes_25_0= ruleStringToAttributeMapEntry )
                    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:4190:3: lv_attributes_25_0= ruleStringToAttributeMapEntry
                    {
                     
                    	        newCompositeNode(grammarAccess.getGuardAccess().getAttributesStringToAttributeMapEntryParserRuleCall_11_2_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleStringToAttributeMapEntry_in_ruleGuard8206);
                    lv_attributes_25_0=ruleStringToAttributeMapEntry();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getGuardRule());
                    	        }
                           		add(
                           			current, 
                           			"attributes",
                            		lv_attributes_25_0, 
                            		"StringToAttributeMapEntry");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:4206:2: (otherlv_26= ',' ( (lv_attributes_27_0= ruleStringToAttributeMapEntry ) ) )*
                    loop138:
                    do {
                        int alt138=2;
                        int LA138_0 = input.LA(1);

                        if ( (LA138_0==17) ) {
                            alt138=1;
                        }


                        switch (alt138) {
                    	case 1 :
                    	    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:4206:4: otherlv_26= ',' ( (lv_attributes_27_0= ruleStringToAttributeMapEntry ) )
                    	    {
                    	    otherlv_26=(Token)match(input,17,FollowSets000.FOLLOW_17_in_ruleGuard8219); 

                    	        	newLeafNode(otherlv_26, grammarAccess.getGuardAccess().getCommaKeyword_11_3_0());
                    	        
                    	    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:4210:1: ( (lv_attributes_27_0= ruleStringToAttributeMapEntry ) )
                    	    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:4211:1: (lv_attributes_27_0= ruleStringToAttributeMapEntry )
                    	    {
                    	    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:4211:1: (lv_attributes_27_0= ruleStringToAttributeMapEntry )
                    	    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:4212:3: lv_attributes_27_0= ruleStringToAttributeMapEntry
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getGuardAccess().getAttributesStringToAttributeMapEntryParserRuleCall_11_3_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleStringToAttributeMapEntry_in_ruleGuard8240);
                    	    lv_attributes_27_0=ruleStringToAttributeMapEntry();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getGuardRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"attributes",
                    	            		lv_attributes_27_0, 
                    	            		"StringToAttributeMapEntry");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop138;
                        }
                    } while (true);

                    otherlv_28=(Token)match(input,22,FollowSets000.FOLLOW_22_in_ruleGuard8254); 

                        	newLeafNode(otherlv_28, grammarAccess.getGuardAccess().getRightCurlyBracketKeyword_11_4());
                        

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
    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:4240:1: entryRuleWitness returns [EObject current=null] : iv_ruleWitness= ruleWitness EOF ;
    public final EObject entryRuleWitness() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleWitness = null;


        try {
            // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:4241:2: (iv_ruleWitness= ruleWitness EOF )
            // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:4242:2: iv_ruleWitness= ruleWitness EOF
            {
             newCompositeNode(grammarAccess.getWitnessRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleWitness_in_entryRuleWitness8292);
            iv_ruleWitness=ruleWitness();

            state._fsp--;

             current =iv_ruleWitness; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleWitness8302); 

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
    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:4249:1: ruleWitness returns [EObject current=null] : ( ( (lv_localGenerated_0_0= 'localGenerated' ) )? otherlv_1= 'Witness' ( (lv_name_2_0= ruleEString ) ) (otherlv_3= 'internalId' ( (lv_internalId_4_0= ruleEString ) ) )? (otherlv_5= 'comment' ( (lv_comment_6_0= ruleEString ) ) )? otherlv_7= 'predicate' ( (lv_predicate_8_0= ruleEString ) ) (otherlv_9= 'annotations' otherlv_10= '{' ( (lv_annotations_11_0= ruleAnnotation ) ) (otherlv_12= ',' ( (lv_annotations_13_0= ruleAnnotation ) ) )* otherlv_14= '}' )? (otherlv_15= 'extensions' otherlv_16= '{' ( (lv_extensions_17_0= ruleAbstractExtension ) ) (otherlv_18= ',' ( (lv_extensions_19_0= ruleAbstractExtension ) ) )* otherlv_20= '}' )? (otherlv_21= 'attributes' otherlv_22= '{' ( (lv_attributes_23_0= ruleStringToAttributeMapEntry ) ) (otherlv_24= ',' ( (lv_attributes_25_0= ruleStringToAttributeMapEntry ) ) )* otherlv_26= '}' )? ) ;
    public final EObject ruleWitness() throws RecognitionException {
        EObject current = null;

        Token lv_localGenerated_0_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        Token otherlv_14=null;
        Token otherlv_15=null;
        Token otherlv_16=null;
        Token otherlv_18=null;
        Token otherlv_20=null;
        Token otherlv_21=null;
        Token otherlv_22=null;
        Token otherlv_24=null;
        Token otherlv_26=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        AntlrDatatypeRuleToken lv_internalId_4_0 = null;

        AntlrDatatypeRuleToken lv_comment_6_0 = null;

        AntlrDatatypeRuleToken lv_predicate_8_0 = null;

        EObject lv_annotations_11_0 = null;

        EObject lv_annotations_13_0 = null;

        EObject lv_extensions_17_0 = null;

        EObject lv_extensions_19_0 = null;

        EObject lv_attributes_23_0 = null;

        EObject lv_attributes_25_0 = null;


         enterRule(); 
            
        try {
            // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:4252:28: ( ( ( (lv_localGenerated_0_0= 'localGenerated' ) )? otherlv_1= 'Witness' ( (lv_name_2_0= ruleEString ) ) (otherlv_3= 'internalId' ( (lv_internalId_4_0= ruleEString ) ) )? (otherlv_5= 'comment' ( (lv_comment_6_0= ruleEString ) ) )? otherlv_7= 'predicate' ( (lv_predicate_8_0= ruleEString ) ) (otherlv_9= 'annotations' otherlv_10= '{' ( (lv_annotations_11_0= ruleAnnotation ) ) (otherlv_12= ',' ( (lv_annotations_13_0= ruleAnnotation ) ) )* otherlv_14= '}' )? (otherlv_15= 'extensions' otherlv_16= '{' ( (lv_extensions_17_0= ruleAbstractExtension ) ) (otherlv_18= ',' ( (lv_extensions_19_0= ruleAbstractExtension ) ) )* otherlv_20= '}' )? (otherlv_21= 'attributes' otherlv_22= '{' ( (lv_attributes_23_0= ruleStringToAttributeMapEntry ) ) (otherlv_24= ',' ( (lv_attributes_25_0= ruleStringToAttributeMapEntry ) ) )* otherlv_26= '}' )? ) )
            // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:4253:1: ( ( (lv_localGenerated_0_0= 'localGenerated' ) )? otherlv_1= 'Witness' ( (lv_name_2_0= ruleEString ) ) (otherlv_3= 'internalId' ( (lv_internalId_4_0= ruleEString ) ) )? (otherlv_5= 'comment' ( (lv_comment_6_0= ruleEString ) ) )? otherlv_7= 'predicate' ( (lv_predicate_8_0= ruleEString ) ) (otherlv_9= 'annotations' otherlv_10= '{' ( (lv_annotations_11_0= ruleAnnotation ) ) (otherlv_12= ',' ( (lv_annotations_13_0= ruleAnnotation ) ) )* otherlv_14= '}' )? (otherlv_15= 'extensions' otherlv_16= '{' ( (lv_extensions_17_0= ruleAbstractExtension ) ) (otherlv_18= ',' ( (lv_extensions_19_0= ruleAbstractExtension ) ) )* otherlv_20= '}' )? (otherlv_21= 'attributes' otherlv_22= '{' ( (lv_attributes_23_0= ruleStringToAttributeMapEntry ) ) (otherlv_24= ',' ( (lv_attributes_25_0= ruleStringToAttributeMapEntry ) ) )* otherlv_26= '}' )? )
            {
            // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:4253:1: ( ( (lv_localGenerated_0_0= 'localGenerated' ) )? otherlv_1= 'Witness' ( (lv_name_2_0= ruleEString ) ) (otherlv_3= 'internalId' ( (lv_internalId_4_0= ruleEString ) ) )? (otherlv_5= 'comment' ( (lv_comment_6_0= ruleEString ) ) )? otherlv_7= 'predicate' ( (lv_predicate_8_0= ruleEString ) ) (otherlv_9= 'annotations' otherlv_10= '{' ( (lv_annotations_11_0= ruleAnnotation ) ) (otherlv_12= ',' ( (lv_annotations_13_0= ruleAnnotation ) ) )* otherlv_14= '}' )? (otherlv_15= 'extensions' otherlv_16= '{' ( (lv_extensions_17_0= ruleAbstractExtension ) ) (otherlv_18= ',' ( (lv_extensions_19_0= ruleAbstractExtension ) ) )* otherlv_20= '}' )? (otherlv_21= 'attributes' otherlv_22= '{' ( (lv_attributes_23_0= ruleStringToAttributeMapEntry ) ) (otherlv_24= ',' ( (lv_attributes_25_0= ruleStringToAttributeMapEntry ) ) )* otherlv_26= '}' )? )
            // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:4253:2: ( (lv_localGenerated_0_0= 'localGenerated' ) )? otherlv_1= 'Witness' ( (lv_name_2_0= ruleEString ) ) (otherlv_3= 'internalId' ( (lv_internalId_4_0= ruleEString ) ) )? (otherlv_5= 'comment' ( (lv_comment_6_0= ruleEString ) ) )? otherlv_7= 'predicate' ( (lv_predicate_8_0= ruleEString ) ) (otherlv_9= 'annotations' otherlv_10= '{' ( (lv_annotations_11_0= ruleAnnotation ) ) (otherlv_12= ',' ( (lv_annotations_13_0= ruleAnnotation ) ) )* otherlv_14= '}' )? (otherlv_15= 'extensions' otherlv_16= '{' ( (lv_extensions_17_0= ruleAbstractExtension ) ) (otherlv_18= ',' ( (lv_extensions_19_0= ruleAbstractExtension ) ) )* otherlv_20= '}' )? (otherlv_21= 'attributes' otherlv_22= '{' ( (lv_attributes_23_0= ruleStringToAttributeMapEntry ) ) (otherlv_24= ',' ( (lv_attributes_25_0= ruleStringToAttributeMapEntry ) ) )* otherlv_26= '}' )?
            {
            // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:4253:2: ( (lv_localGenerated_0_0= 'localGenerated' ) )?
            int alt140=2;
            int LA140_0 = input.LA(1);

            if ( (LA140_0==11) ) {
                alt140=1;
            }
            switch (alt140) {
                case 1 :
                    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:4254:1: (lv_localGenerated_0_0= 'localGenerated' )
                    {
                    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:4254:1: (lv_localGenerated_0_0= 'localGenerated' )
                    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:4255:3: lv_localGenerated_0_0= 'localGenerated'
                    {
                    lv_localGenerated_0_0=(Token)match(input,11,FollowSets000.FOLLOW_11_in_ruleWitness8345); 

                            newLeafNode(lv_localGenerated_0_0, grammarAccess.getWitnessAccess().getLocalGeneratedLocalGeneratedKeyword_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getWitnessRule());
                    	        }
                           		setWithLastConsumed(current, "localGenerated", true, "localGenerated");
                    	    

                    }


                    }
                    break;

            }

            otherlv_1=(Token)match(input,65,FollowSets000.FOLLOW_65_in_ruleWitness8371); 

                	newLeafNode(otherlv_1, grammarAccess.getWitnessAccess().getWitnessKeyword_1());
                
            // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:4272:1: ( (lv_name_2_0= ruleEString ) )
            // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:4273:1: (lv_name_2_0= ruleEString )
            {
            // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:4273:1: (lv_name_2_0= ruleEString )
            // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:4274:3: lv_name_2_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getWitnessAccess().getNameEStringParserRuleCall_2_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleWitness8392);
            lv_name_2_0=ruleEString();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getWitnessRule());
            	        }
                   		set(
                   			current, 
                   			"name",
                    		lv_name_2_0, 
                    		"EString");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:4290:2: (otherlv_3= 'internalId' ( (lv_internalId_4_0= ruleEString ) ) )?
            int alt141=2;
            int LA141_0 = input.LA(1);

            if ( (LA141_0==13) ) {
                alt141=1;
            }
            switch (alt141) {
                case 1 :
                    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:4290:4: otherlv_3= 'internalId' ( (lv_internalId_4_0= ruleEString ) )
                    {
                    otherlv_3=(Token)match(input,13,FollowSets000.FOLLOW_13_in_ruleWitness8405); 

                        	newLeafNode(otherlv_3, grammarAccess.getWitnessAccess().getInternalIdKeyword_3_0());
                        
                    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:4294:1: ( (lv_internalId_4_0= ruleEString ) )
                    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:4295:1: (lv_internalId_4_0= ruleEString )
                    {
                    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:4295:1: (lv_internalId_4_0= ruleEString )
                    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:4296:3: lv_internalId_4_0= ruleEString
                    {
                     
                    	        newCompositeNode(grammarAccess.getWitnessAccess().getInternalIdEStringParserRuleCall_3_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleWitness8426);
                    lv_internalId_4_0=ruleEString();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getWitnessRule());
                    	        }
                           		set(
                           			current, 
                           			"internalId",
                            		lv_internalId_4_0, 
                            		"EString");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:4312:4: (otherlv_5= 'comment' ( (lv_comment_6_0= ruleEString ) ) )?
            int alt142=2;
            int LA142_0 = input.LA(1);

            if ( (LA142_0==39) ) {
                alt142=1;
            }
            switch (alt142) {
                case 1 :
                    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:4312:6: otherlv_5= 'comment' ( (lv_comment_6_0= ruleEString ) )
                    {
                    otherlv_5=(Token)match(input,39,FollowSets000.FOLLOW_39_in_ruleWitness8441); 

                        	newLeafNode(otherlv_5, grammarAccess.getWitnessAccess().getCommentKeyword_4_0());
                        
                    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:4316:1: ( (lv_comment_6_0= ruleEString ) )
                    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:4317:1: (lv_comment_6_0= ruleEString )
                    {
                    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:4317:1: (lv_comment_6_0= ruleEString )
                    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:4318:3: lv_comment_6_0= ruleEString
                    {
                     
                    	        newCompositeNode(grammarAccess.getWitnessAccess().getCommentEStringParserRuleCall_4_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleWitness8462);
                    lv_comment_6_0=ruleEString();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getWitnessRule());
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

            otherlv_7=(Token)match(input,66,FollowSets000.FOLLOW_66_in_ruleWitness8476); 

                	newLeafNode(otherlv_7, grammarAccess.getWitnessAccess().getPredicateKeyword_5());
                
            // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:4338:1: ( (lv_predicate_8_0= ruleEString ) )
            // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:4339:1: (lv_predicate_8_0= ruleEString )
            {
            // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:4339:1: (lv_predicate_8_0= ruleEString )
            // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:4340:3: lv_predicate_8_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getWitnessAccess().getPredicateEStringParserRuleCall_6_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleWitness8497);
            lv_predicate_8_0=ruleEString();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getWitnessRule());
            	        }
                   		set(
                   			current, 
                   			"predicate",
                    		lv_predicate_8_0, 
                    		"EString");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:4356:2: (otherlv_9= 'annotations' otherlv_10= '{' ( (lv_annotations_11_0= ruleAnnotation ) ) (otherlv_12= ',' ( (lv_annotations_13_0= ruleAnnotation ) ) )* otherlv_14= '}' )?
            int alt144=2;
            int LA144_0 = input.LA(1);

            if ( (LA144_0==20) ) {
                alt144=1;
            }
            switch (alt144) {
                case 1 :
                    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:4356:4: otherlv_9= 'annotations' otherlv_10= '{' ( (lv_annotations_11_0= ruleAnnotation ) ) (otherlv_12= ',' ( (lv_annotations_13_0= ruleAnnotation ) ) )* otherlv_14= '}'
                    {
                    otherlv_9=(Token)match(input,20,FollowSets000.FOLLOW_20_in_ruleWitness8510); 

                        	newLeafNode(otherlv_9, grammarAccess.getWitnessAccess().getAnnotationsKeyword_7_0());
                        
                    otherlv_10=(Token)match(input,21,FollowSets000.FOLLOW_21_in_ruleWitness8522); 

                        	newLeafNode(otherlv_10, grammarAccess.getWitnessAccess().getLeftCurlyBracketKeyword_7_1());
                        
                    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:4364:1: ( (lv_annotations_11_0= ruleAnnotation ) )
                    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:4365:1: (lv_annotations_11_0= ruleAnnotation )
                    {
                    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:4365:1: (lv_annotations_11_0= ruleAnnotation )
                    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:4366:3: lv_annotations_11_0= ruleAnnotation
                    {
                     
                    	        newCompositeNode(grammarAccess.getWitnessAccess().getAnnotationsAnnotationParserRuleCall_7_2_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleAnnotation_in_ruleWitness8543);
                    lv_annotations_11_0=ruleAnnotation();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getWitnessRule());
                    	        }
                           		add(
                           			current, 
                           			"annotations",
                            		lv_annotations_11_0, 
                            		"Annotation");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:4382:2: (otherlv_12= ',' ( (lv_annotations_13_0= ruleAnnotation ) ) )*
                    loop143:
                    do {
                        int alt143=2;
                        int LA143_0 = input.LA(1);

                        if ( (LA143_0==17) ) {
                            alt143=1;
                        }


                        switch (alt143) {
                    	case 1 :
                    	    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:4382:4: otherlv_12= ',' ( (lv_annotations_13_0= ruleAnnotation ) )
                    	    {
                    	    otherlv_12=(Token)match(input,17,FollowSets000.FOLLOW_17_in_ruleWitness8556); 

                    	        	newLeafNode(otherlv_12, grammarAccess.getWitnessAccess().getCommaKeyword_7_3_0());
                    	        
                    	    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:4386:1: ( (lv_annotations_13_0= ruleAnnotation ) )
                    	    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:4387:1: (lv_annotations_13_0= ruleAnnotation )
                    	    {
                    	    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:4387:1: (lv_annotations_13_0= ruleAnnotation )
                    	    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:4388:3: lv_annotations_13_0= ruleAnnotation
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getWitnessAccess().getAnnotationsAnnotationParserRuleCall_7_3_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleAnnotation_in_ruleWitness8577);
                    	    lv_annotations_13_0=ruleAnnotation();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getWitnessRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"annotations",
                    	            		lv_annotations_13_0, 
                    	            		"Annotation");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop143;
                        }
                    } while (true);

                    otherlv_14=(Token)match(input,22,FollowSets000.FOLLOW_22_in_ruleWitness8591); 

                        	newLeafNode(otherlv_14, grammarAccess.getWitnessAccess().getRightCurlyBracketKeyword_7_4());
                        

                    }
                    break;

            }

            // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:4408:3: (otherlv_15= 'extensions' otherlv_16= '{' ( (lv_extensions_17_0= ruleAbstractExtension ) ) (otherlv_18= ',' ( (lv_extensions_19_0= ruleAbstractExtension ) ) )* otherlv_20= '}' )?
            int alt146=2;
            int LA146_0 = input.LA(1);

            if ( (LA146_0==23) ) {
                alt146=1;
            }
            switch (alt146) {
                case 1 :
                    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:4408:5: otherlv_15= 'extensions' otherlv_16= '{' ( (lv_extensions_17_0= ruleAbstractExtension ) ) (otherlv_18= ',' ( (lv_extensions_19_0= ruleAbstractExtension ) ) )* otherlv_20= '}'
                    {
                    otherlv_15=(Token)match(input,23,FollowSets000.FOLLOW_23_in_ruleWitness8606); 

                        	newLeafNode(otherlv_15, grammarAccess.getWitnessAccess().getExtensionsKeyword_8_0());
                        
                    otherlv_16=(Token)match(input,21,FollowSets000.FOLLOW_21_in_ruleWitness8618); 

                        	newLeafNode(otherlv_16, grammarAccess.getWitnessAccess().getLeftCurlyBracketKeyword_8_1());
                        
                    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:4416:1: ( (lv_extensions_17_0= ruleAbstractExtension ) )
                    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:4417:1: (lv_extensions_17_0= ruleAbstractExtension )
                    {
                    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:4417:1: (lv_extensions_17_0= ruleAbstractExtension )
                    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:4418:3: lv_extensions_17_0= ruleAbstractExtension
                    {
                     
                    	        newCompositeNode(grammarAccess.getWitnessAccess().getExtensionsAbstractExtensionParserRuleCall_8_2_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleAbstractExtension_in_ruleWitness8639);
                    lv_extensions_17_0=ruleAbstractExtension();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getWitnessRule());
                    	        }
                           		add(
                           			current, 
                           			"extensions",
                            		lv_extensions_17_0, 
                            		"AbstractExtension");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:4434:2: (otherlv_18= ',' ( (lv_extensions_19_0= ruleAbstractExtension ) ) )*
                    loop145:
                    do {
                        int alt145=2;
                        int LA145_0 = input.LA(1);

                        if ( (LA145_0==17) ) {
                            alt145=1;
                        }


                        switch (alt145) {
                    	case 1 :
                    	    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:4434:4: otherlv_18= ',' ( (lv_extensions_19_0= ruleAbstractExtension ) )
                    	    {
                    	    otherlv_18=(Token)match(input,17,FollowSets000.FOLLOW_17_in_ruleWitness8652); 

                    	        	newLeafNode(otherlv_18, grammarAccess.getWitnessAccess().getCommaKeyword_8_3_0());
                    	        
                    	    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:4438:1: ( (lv_extensions_19_0= ruleAbstractExtension ) )
                    	    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:4439:1: (lv_extensions_19_0= ruleAbstractExtension )
                    	    {
                    	    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:4439:1: (lv_extensions_19_0= ruleAbstractExtension )
                    	    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:4440:3: lv_extensions_19_0= ruleAbstractExtension
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getWitnessAccess().getExtensionsAbstractExtensionParserRuleCall_8_3_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleAbstractExtension_in_ruleWitness8673);
                    	    lv_extensions_19_0=ruleAbstractExtension();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getWitnessRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"extensions",
                    	            		lv_extensions_19_0, 
                    	            		"AbstractExtension");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop145;
                        }
                    } while (true);

                    otherlv_20=(Token)match(input,22,FollowSets000.FOLLOW_22_in_ruleWitness8687); 

                        	newLeafNode(otherlv_20, grammarAccess.getWitnessAccess().getRightCurlyBracketKeyword_8_4());
                        

                    }
                    break;

            }

            // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:4460:3: (otherlv_21= 'attributes' otherlv_22= '{' ( (lv_attributes_23_0= ruleStringToAttributeMapEntry ) ) (otherlv_24= ',' ( (lv_attributes_25_0= ruleStringToAttributeMapEntry ) ) )* otherlv_26= '}' )?
            int alt148=2;
            int LA148_0 = input.LA(1);

            if ( (LA148_0==24) ) {
                alt148=1;
            }
            switch (alt148) {
                case 1 :
                    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:4460:5: otherlv_21= 'attributes' otherlv_22= '{' ( (lv_attributes_23_0= ruleStringToAttributeMapEntry ) ) (otherlv_24= ',' ( (lv_attributes_25_0= ruleStringToAttributeMapEntry ) ) )* otherlv_26= '}'
                    {
                    otherlv_21=(Token)match(input,24,FollowSets000.FOLLOW_24_in_ruleWitness8702); 

                        	newLeafNode(otherlv_21, grammarAccess.getWitnessAccess().getAttributesKeyword_9_0());
                        
                    otherlv_22=(Token)match(input,21,FollowSets000.FOLLOW_21_in_ruleWitness8714); 

                        	newLeafNode(otherlv_22, grammarAccess.getWitnessAccess().getLeftCurlyBracketKeyword_9_1());
                        
                    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:4468:1: ( (lv_attributes_23_0= ruleStringToAttributeMapEntry ) )
                    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:4469:1: (lv_attributes_23_0= ruleStringToAttributeMapEntry )
                    {
                    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:4469:1: (lv_attributes_23_0= ruleStringToAttributeMapEntry )
                    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:4470:3: lv_attributes_23_0= ruleStringToAttributeMapEntry
                    {
                     
                    	        newCompositeNode(grammarAccess.getWitnessAccess().getAttributesStringToAttributeMapEntryParserRuleCall_9_2_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleStringToAttributeMapEntry_in_ruleWitness8735);
                    lv_attributes_23_0=ruleStringToAttributeMapEntry();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getWitnessRule());
                    	        }
                           		add(
                           			current, 
                           			"attributes",
                            		lv_attributes_23_0, 
                            		"StringToAttributeMapEntry");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:4486:2: (otherlv_24= ',' ( (lv_attributes_25_0= ruleStringToAttributeMapEntry ) ) )*
                    loop147:
                    do {
                        int alt147=2;
                        int LA147_0 = input.LA(1);

                        if ( (LA147_0==17) ) {
                            alt147=1;
                        }


                        switch (alt147) {
                    	case 1 :
                    	    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:4486:4: otherlv_24= ',' ( (lv_attributes_25_0= ruleStringToAttributeMapEntry ) )
                    	    {
                    	    otherlv_24=(Token)match(input,17,FollowSets000.FOLLOW_17_in_ruleWitness8748); 

                    	        	newLeafNode(otherlv_24, grammarAccess.getWitnessAccess().getCommaKeyword_9_3_0());
                    	        
                    	    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:4490:1: ( (lv_attributes_25_0= ruleStringToAttributeMapEntry ) )
                    	    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:4491:1: (lv_attributes_25_0= ruleStringToAttributeMapEntry )
                    	    {
                    	    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:4491:1: (lv_attributes_25_0= ruleStringToAttributeMapEntry )
                    	    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:4492:3: lv_attributes_25_0= ruleStringToAttributeMapEntry
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getWitnessAccess().getAttributesStringToAttributeMapEntryParserRuleCall_9_3_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleStringToAttributeMapEntry_in_ruleWitness8769);
                    	    lv_attributes_25_0=ruleStringToAttributeMapEntry();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getWitnessRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"attributes",
                    	            		lv_attributes_25_0, 
                    	            		"StringToAttributeMapEntry");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop147;
                        }
                    } while (true);

                    otherlv_26=(Token)match(input,22,FollowSets000.FOLLOW_22_in_ruleWitness8783); 

                        	newLeafNode(otherlv_26, grammarAccess.getWitnessAccess().getRightCurlyBracketKeyword_9_4());
                        

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
    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:4520:1: entryRuleAction returns [EObject current=null] : iv_ruleAction= ruleAction EOF ;
    public final EObject entryRuleAction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAction = null;


        try {
            // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:4521:2: (iv_ruleAction= ruleAction EOF )
            // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:4522:2: iv_ruleAction= ruleAction EOF
            {
             newCompositeNode(grammarAccess.getActionRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleAction_in_entryRuleAction8821);
            iv_ruleAction=ruleAction();

            state._fsp--;

             current =iv_ruleAction; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleAction8831); 

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
    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:4529:1: ruleAction returns [EObject current=null] : ( ( (lv_localGenerated_0_0= 'localGenerated' ) )? otherlv_1= 'Action' ( (lv_name_2_0= ruleEString ) ) (otherlv_3= 'internalId' ( (lv_internalId_4_0= ruleEString ) ) )? (otherlv_5= 'comment' ( (lv_comment_6_0= ruleEString ) ) )? otherlv_7= 'Action' ( (lv_action_8_0= ruleEString ) ) (otherlv_9= 'annotations' otherlv_10= '{' ( (lv_annotations_11_0= ruleAnnotation ) ) (otherlv_12= ',' ( (lv_annotations_13_0= ruleAnnotation ) ) )* otherlv_14= '}' )? (otherlv_15= 'extensions' otherlv_16= '{' ( (lv_extensions_17_0= ruleAbstractExtension ) ) (otherlv_18= ',' ( (lv_extensions_19_0= ruleAbstractExtension ) ) )* otherlv_20= '}' )? (otherlv_21= 'attributes' otherlv_22= '{' ( (lv_attributes_23_0= ruleStringToAttributeMapEntry ) ) (otherlv_24= ',' ( (lv_attributes_25_0= ruleStringToAttributeMapEntry ) ) )* otherlv_26= '}' )? ) ;
    public final EObject ruleAction() throws RecognitionException {
        EObject current = null;

        Token lv_localGenerated_0_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        Token otherlv_14=null;
        Token otherlv_15=null;
        Token otherlv_16=null;
        Token otherlv_18=null;
        Token otherlv_20=null;
        Token otherlv_21=null;
        Token otherlv_22=null;
        Token otherlv_24=null;
        Token otherlv_26=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        AntlrDatatypeRuleToken lv_internalId_4_0 = null;

        AntlrDatatypeRuleToken lv_comment_6_0 = null;

        AntlrDatatypeRuleToken lv_action_8_0 = null;

        EObject lv_annotations_11_0 = null;

        EObject lv_annotations_13_0 = null;

        EObject lv_extensions_17_0 = null;

        EObject lv_extensions_19_0 = null;

        EObject lv_attributes_23_0 = null;

        EObject lv_attributes_25_0 = null;


         enterRule(); 
            
        try {
            // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:4532:28: ( ( ( (lv_localGenerated_0_0= 'localGenerated' ) )? otherlv_1= 'Action' ( (lv_name_2_0= ruleEString ) ) (otherlv_3= 'internalId' ( (lv_internalId_4_0= ruleEString ) ) )? (otherlv_5= 'comment' ( (lv_comment_6_0= ruleEString ) ) )? otherlv_7= 'Action' ( (lv_action_8_0= ruleEString ) ) (otherlv_9= 'annotations' otherlv_10= '{' ( (lv_annotations_11_0= ruleAnnotation ) ) (otherlv_12= ',' ( (lv_annotations_13_0= ruleAnnotation ) ) )* otherlv_14= '}' )? (otherlv_15= 'extensions' otherlv_16= '{' ( (lv_extensions_17_0= ruleAbstractExtension ) ) (otherlv_18= ',' ( (lv_extensions_19_0= ruleAbstractExtension ) ) )* otherlv_20= '}' )? (otherlv_21= 'attributes' otherlv_22= '{' ( (lv_attributes_23_0= ruleStringToAttributeMapEntry ) ) (otherlv_24= ',' ( (lv_attributes_25_0= ruleStringToAttributeMapEntry ) ) )* otherlv_26= '}' )? ) )
            // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:4533:1: ( ( (lv_localGenerated_0_0= 'localGenerated' ) )? otherlv_1= 'Action' ( (lv_name_2_0= ruleEString ) ) (otherlv_3= 'internalId' ( (lv_internalId_4_0= ruleEString ) ) )? (otherlv_5= 'comment' ( (lv_comment_6_0= ruleEString ) ) )? otherlv_7= 'Action' ( (lv_action_8_0= ruleEString ) ) (otherlv_9= 'annotations' otherlv_10= '{' ( (lv_annotations_11_0= ruleAnnotation ) ) (otherlv_12= ',' ( (lv_annotations_13_0= ruleAnnotation ) ) )* otherlv_14= '}' )? (otherlv_15= 'extensions' otherlv_16= '{' ( (lv_extensions_17_0= ruleAbstractExtension ) ) (otherlv_18= ',' ( (lv_extensions_19_0= ruleAbstractExtension ) ) )* otherlv_20= '}' )? (otherlv_21= 'attributes' otherlv_22= '{' ( (lv_attributes_23_0= ruleStringToAttributeMapEntry ) ) (otherlv_24= ',' ( (lv_attributes_25_0= ruleStringToAttributeMapEntry ) ) )* otherlv_26= '}' )? )
            {
            // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:4533:1: ( ( (lv_localGenerated_0_0= 'localGenerated' ) )? otherlv_1= 'Action' ( (lv_name_2_0= ruleEString ) ) (otherlv_3= 'internalId' ( (lv_internalId_4_0= ruleEString ) ) )? (otherlv_5= 'comment' ( (lv_comment_6_0= ruleEString ) ) )? otherlv_7= 'Action' ( (lv_action_8_0= ruleEString ) ) (otherlv_9= 'annotations' otherlv_10= '{' ( (lv_annotations_11_0= ruleAnnotation ) ) (otherlv_12= ',' ( (lv_annotations_13_0= ruleAnnotation ) ) )* otherlv_14= '}' )? (otherlv_15= 'extensions' otherlv_16= '{' ( (lv_extensions_17_0= ruleAbstractExtension ) ) (otherlv_18= ',' ( (lv_extensions_19_0= ruleAbstractExtension ) ) )* otherlv_20= '}' )? (otherlv_21= 'attributes' otherlv_22= '{' ( (lv_attributes_23_0= ruleStringToAttributeMapEntry ) ) (otherlv_24= ',' ( (lv_attributes_25_0= ruleStringToAttributeMapEntry ) ) )* otherlv_26= '}' )? )
            // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:4533:2: ( (lv_localGenerated_0_0= 'localGenerated' ) )? otherlv_1= 'Action' ( (lv_name_2_0= ruleEString ) ) (otherlv_3= 'internalId' ( (lv_internalId_4_0= ruleEString ) ) )? (otherlv_5= 'comment' ( (lv_comment_6_0= ruleEString ) ) )? otherlv_7= 'Action' ( (lv_action_8_0= ruleEString ) ) (otherlv_9= 'annotations' otherlv_10= '{' ( (lv_annotations_11_0= ruleAnnotation ) ) (otherlv_12= ',' ( (lv_annotations_13_0= ruleAnnotation ) ) )* otherlv_14= '}' )? (otherlv_15= 'extensions' otherlv_16= '{' ( (lv_extensions_17_0= ruleAbstractExtension ) ) (otherlv_18= ',' ( (lv_extensions_19_0= ruleAbstractExtension ) ) )* otherlv_20= '}' )? (otherlv_21= 'attributes' otherlv_22= '{' ( (lv_attributes_23_0= ruleStringToAttributeMapEntry ) ) (otherlv_24= ',' ( (lv_attributes_25_0= ruleStringToAttributeMapEntry ) ) )* otherlv_26= '}' )?
            {
            // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:4533:2: ( (lv_localGenerated_0_0= 'localGenerated' ) )?
            int alt149=2;
            int LA149_0 = input.LA(1);

            if ( (LA149_0==11) ) {
                alt149=1;
            }
            switch (alt149) {
                case 1 :
                    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:4534:1: (lv_localGenerated_0_0= 'localGenerated' )
                    {
                    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:4534:1: (lv_localGenerated_0_0= 'localGenerated' )
                    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:4535:3: lv_localGenerated_0_0= 'localGenerated'
                    {
                    lv_localGenerated_0_0=(Token)match(input,11,FollowSets000.FOLLOW_11_in_ruleAction8874); 

                            newLeafNode(lv_localGenerated_0_0, grammarAccess.getActionAccess().getLocalGeneratedLocalGeneratedKeyword_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getActionRule());
                    	        }
                           		setWithLastConsumed(current, "localGenerated", true, "localGenerated");
                    	    

                    }


                    }
                    break;

            }

            otherlv_1=(Token)match(input,67,FollowSets000.FOLLOW_67_in_ruleAction8900); 

                	newLeafNode(otherlv_1, grammarAccess.getActionAccess().getActionKeyword_1());
                
            // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:4552:1: ( (lv_name_2_0= ruleEString ) )
            // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:4553:1: (lv_name_2_0= ruleEString )
            {
            // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:4553:1: (lv_name_2_0= ruleEString )
            // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:4554:3: lv_name_2_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getActionAccess().getNameEStringParserRuleCall_2_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleAction8921);
            lv_name_2_0=ruleEString();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getActionRule());
            	        }
                   		set(
                   			current, 
                   			"name",
                    		lv_name_2_0, 
                    		"EString");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:4570:2: (otherlv_3= 'internalId' ( (lv_internalId_4_0= ruleEString ) ) )?
            int alt150=2;
            int LA150_0 = input.LA(1);

            if ( (LA150_0==13) ) {
                alt150=1;
            }
            switch (alt150) {
                case 1 :
                    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:4570:4: otherlv_3= 'internalId' ( (lv_internalId_4_0= ruleEString ) )
                    {
                    otherlv_3=(Token)match(input,13,FollowSets000.FOLLOW_13_in_ruleAction8934); 

                        	newLeafNode(otherlv_3, grammarAccess.getActionAccess().getInternalIdKeyword_3_0());
                        
                    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:4574:1: ( (lv_internalId_4_0= ruleEString ) )
                    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:4575:1: (lv_internalId_4_0= ruleEString )
                    {
                    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:4575:1: (lv_internalId_4_0= ruleEString )
                    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:4576:3: lv_internalId_4_0= ruleEString
                    {
                     
                    	        newCompositeNode(grammarAccess.getActionAccess().getInternalIdEStringParserRuleCall_3_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleAction8955);
                    lv_internalId_4_0=ruleEString();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getActionRule());
                    	        }
                           		set(
                           			current, 
                           			"internalId",
                            		lv_internalId_4_0, 
                            		"EString");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:4592:4: (otherlv_5= 'comment' ( (lv_comment_6_0= ruleEString ) ) )?
            int alt151=2;
            int LA151_0 = input.LA(1);

            if ( (LA151_0==39) ) {
                alt151=1;
            }
            switch (alt151) {
                case 1 :
                    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:4592:6: otherlv_5= 'comment' ( (lv_comment_6_0= ruleEString ) )
                    {
                    otherlv_5=(Token)match(input,39,FollowSets000.FOLLOW_39_in_ruleAction8970); 

                        	newLeafNode(otherlv_5, grammarAccess.getActionAccess().getCommentKeyword_4_0());
                        
                    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:4596:1: ( (lv_comment_6_0= ruleEString ) )
                    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:4597:1: (lv_comment_6_0= ruleEString )
                    {
                    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:4597:1: (lv_comment_6_0= ruleEString )
                    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:4598:3: lv_comment_6_0= ruleEString
                    {
                     
                    	        newCompositeNode(grammarAccess.getActionAccess().getCommentEStringParserRuleCall_4_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleAction8991);
                    lv_comment_6_0=ruleEString();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getActionRule());
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

            otherlv_7=(Token)match(input,67,FollowSets000.FOLLOW_67_in_ruleAction9005); 

                	newLeafNode(otherlv_7, grammarAccess.getActionAccess().getActionKeyword_5());
                
            // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:4618:1: ( (lv_action_8_0= ruleEString ) )
            // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:4619:1: (lv_action_8_0= ruleEString )
            {
            // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:4619:1: (lv_action_8_0= ruleEString )
            // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:4620:3: lv_action_8_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getActionAccess().getActionEStringParserRuleCall_6_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleAction9026);
            lv_action_8_0=ruleEString();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getActionRule());
            	        }
                   		set(
                   			current, 
                   			"action",
                    		lv_action_8_0, 
                    		"EString");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:4636:2: (otherlv_9= 'annotations' otherlv_10= '{' ( (lv_annotations_11_0= ruleAnnotation ) ) (otherlv_12= ',' ( (lv_annotations_13_0= ruleAnnotation ) ) )* otherlv_14= '}' )?
            int alt153=2;
            int LA153_0 = input.LA(1);

            if ( (LA153_0==20) ) {
                alt153=1;
            }
            switch (alt153) {
                case 1 :
                    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:4636:4: otherlv_9= 'annotations' otherlv_10= '{' ( (lv_annotations_11_0= ruleAnnotation ) ) (otherlv_12= ',' ( (lv_annotations_13_0= ruleAnnotation ) ) )* otherlv_14= '}'
                    {
                    otherlv_9=(Token)match(input,20,FollowSets000.FOLLOW_20_in_ruleAction9039); 

                        	newLeafNode(otherlv_9, grammarAccess.getActionAccess().getAnnotationsKeyword_7_0());
                        
                    otherlv_10=(Token)match(input,21,FollowSets000.FOLLOW_21_in_ruleAction9051); 

                        	newLeafNode(otherlv_10, grammarAccess.getActionAccess().getLeftCurlyBracketKeyword_7_1());
                        
                    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:4644:1: ( (lv_annotations_11_0= ruleAnnotation ) )
                    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:4645:1: (lv_annotations_11_0= ruleAnnotation )
                    {
                    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:4645:1: (lv_annotations_11_0= ruleAnnotation )
                    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:4646:3: lv_annotations_11_0= ruleAnnotation
                    {
                     
                    	        newCompositeNode(grammarAccess.getActionAccess().getAnnotationsAnnotationParserRuleCall_7_2_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleAnnotation_in_ruleAction9072);
                    lv_annotations_11_0=ruleAnnotation();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getActionRule());
                    	        }
                           		add(
                           			current, 
                           			"annotations",
                            		lv_annotations_11_0, 
                            		"Annotation");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:4662:2: (otherlv_12= ',' ( (lv_annotations_13_0= ruleAnnotation ) ) )*
                    loop152:
                    do {
                        int alt152=2;
                        int LA152_0 = input.LA(1);

                        if ( (LA152_0==17) ) {
                            alt152=1;
                        }


                        switch (alt152) {
                    	case 1 :
                    	    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:4662:4: otherlv_12= ',' ( (lv_annotations_13_0= ruleAnnotation ) )
                    	    {
                    	    otherlv_12=(Token)match(input,17,FollowSets000.FOLLOW_17_in_ruleAction9085); 

                    	        	newLeafNode(otherlv_12, grammarAccess.getActionAccess().getCommaKeyword_7_3_0());
                    	        
                    	    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:4666:1: ( (lv_annotations_13_0= ruleAnnotation ) )
                    	    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:4667:1: (lv_annotations_13_0= ruleAnnotation )
                    	    {
                    	    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:4667:1: (lv_annotations_13_0= ruleAnnotation )
                    	    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:4668:3: lv_annotations_13_0= ruleAnnotation
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getActionAccess().getAnnotationsAnnotationParserRuleCall_7_3_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleAnnotation_in_ruleAction9106);
                    	    lv_annotations_13_0=ruleAnnotation();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getActionRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"annotations",
                    	            		lv_annotations_13_0, 
                    	            		"Annotation");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop152;
                        }
                    } while (true);

                    otherlv_14=(Token)match(input,22,FollowSets000.FOLLOW_22_in_ruleAction9120); 

                        	newLeafNode(otherlv_14, grammarAccess.getActionAccess().getRightCurlyBracketKeyword_7_4());
                        

                    }
                    break;

            }

            // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:4688:3: (otherlv_15= 'extensions' otherlv_16= '{' ( (lv_extensions_17_0= ruleAbstractExtension ) ) (otherlv_18= ',' ( (lv_extensions_19_0= ruleAbstractExtension ) ) )* otherlv_20= '}' )?
            int alt155=2;
            int LA155_0 = input.LA(1);

            if ( (LA155_0==23) ) {
                alt155=1;
            }
            switch (alt155) {
                case 1 :
                    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:4688:5: otherlv_15= 'extensions' otherlv_16= '{' ( (lv_extensions_17_0= ruleAbstractExtension ) ) (otherlv_18= ',' ( (lv_extensions_19_0= ruleAbstractExtension ) ) )* otherlv_20= '}'
                    {
                    otherlv_15=(Token)match(input,23,FollowSets000.FOLLOW_23_in_ruleAction9135); 

                        	newLeafNode(otherlv_15, grammarAccess.getActionAccess().getExtensionsKeyword_8_0());
                        
                    otherlv_16=(Token)match(input,21,FollowSets000.FOLLOW_21_in_ruleAction9147); 

                        	newLeafNode(otherlv_16, grammarAccess.getActionAccess().getLeftCurlyBracketKeyword_8_1());
                        
                    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:4696:1: ( (lv_extensions_17_0= ruleAbstractExtension ) )
                    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:4697:1: (lv_extensions_17_0= ruleAbstractExtension )
                    {
                    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:4697:1: (lv_extensions_17_0= ruleAbstractExtension )
                    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:4698:3: lv_extensions_17_0= ruleAbstractExtension
                    {
                     
                    	        newCompositeNode(grammarAccess.getActionAccess().getExtensionsAbstractExtensionParserRuleCall_8_2_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleAbstractExtension_in_ruleAction9168);
                    lv_extensions_17_0=ruleAbstractExtension();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getActionRule());
                    	        }
                           		add(
                           			current, 
                           			"extensions",
                            		lv_extensions_17_0, 
                            		"AbstractExtension");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:4714:2: (otherlv_18= ',' ( (lv_extensions_19_0= ruleAbstractExtension ) ) )*
                    loop154:
                    do {
                        int alt154=2;
                        int LA154_0 = input.LA(1);

                        if ( (LA154_0==17) ) {
                            alt154=1;
                        }


                        switch (alt154) {
                    	case 1 :
                    	    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:4714:4: otherlv_18= ',' ( (lv_extensions_19_0= ruleAbstractExtension ) )
                    	    {
                    	    otherlv_18=(Token)match(input,17,FollowSets000.FOLLOW_17_in_ruleAction9181); 

                    	        	newLeafNode(otherlv_18, grammarAccess.getActionAccess().getCommaKeyword_8_3_0());
                    	        
                    	    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:4718:1: ( (lv_extensions_19_0= ruleAbstractExtension ) )
                    	    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:4719:1: (lv_extensions_19_0= ruleAbstractExtension )
                    	    {
                    	    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:4719:1: (lv_extensions_19_0= ruleAbstractExtension )
                    	    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:4720:3: lv_extensions_19_0= ruleAbstractExtension
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getActionAccess().getExtensionsAbstractExtensionParserRuleCall_8_3_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleAbstractExtension_in_ruleAction9202);
                    	    lv_extensions_19_0=ruleAbstractExtension();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getActionRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"extensions",
                    	            		lv_extensions_19_0, 
                    	            		"AbstractExtension");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop154;
                        }
                    } while (true);

                    otherlv_20=(Token)match(input,22,FollowSets000.FOLLOW_22_in_ruleAction9216); 

                        	newLeafNode(otherlv_20, grammarAccess.getActionAccess().getRightCurlyBracketKeyword_8_4());
                        

                    }
                    break;

            }

            // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:4740:3: (otherlv_21= 'attributes' otherlv_22= '{' ( (lv_attributes_23_0= ruleStringToAttributeMapEntry ) ) (otherlv_24= ',' ( (lv_attributes_25_0= ruleStringToAttributeMapEntry ) ) )* otherlv_26= '}' )?
            int alt157=2;
            int LA157_0 = input.LA(1);

            if ( (LA157_0==24) ) {
                alt157=1;
            }
            switch (alt157) {
                case 1 :
                    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:4740:5: otherlv_21= 'attributes' otherlv_22= '{' ( (lv_attributes_23_0= ruleStringToAttributeMapEntry ) ) (otherlv_24= ',' ( (lv_attributes_25_0= ruleStringToAttributeMapEntry ) ) )* otherlv_26= '}'
                    {
                    otherlv_21=(Token)match(input,24,FollowSets000.FOLLOW_24_in_ruleAction9231); 

                        	newLeafNode(otherlv_21, grammarAccess.getActionAccess().getAttributesKeyword_9_0());
                        
                    otherlv_22=(Token)match(input,21,FollowSets000.FOLLOW_21_in_ruleAction9243); 

                        	newLeafNode(otherlv_22, grammarAccess.getActionAccess().getLeftCurlyBracketKeyword_9_1());
                        
                    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:4748:1: ( (lv_attributes_23_0= ruleStringToAttributeMapEntry ) )
                    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:4749:1: (lv_attributes_23_0= ruleStringToAttributeMapEntry )
                    {
                    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:4749:1: (lv_attributes_23_0= ruleStringToAttributeMapEntry )
                    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:4750:3: lv_attributes_23_0= ruleStringToAttributeMapEntry
                    {
                     
                    	        newCompositeNode(grammarAccess.getActionAccess().getAttributesStringToAttributeMapEntryParserRuleCall_9_2_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleStringToAttributeMapEntry_in_ruleAction9264);
                    lv_attributes_23_0=ruleStringToAttributeMapEntry();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getActionRule());
                    	        }
                           		add(
                           			current, 
                           			"attributes",
                            		lv_attributes_23_0, 
                            		"StringToAttributeMapEntry");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:4766:2: (otherlv_24= ',' ( (lv_attributes_25_0= ruleStringToAttributeMapEntry ) ) )*
                    loop156:
                    do {
                        int alt156=2;
                        int LA156_0 = input.LA(1);

                        if ( (LA156_0==17) ) {
                            alt156=1;
                        }


                        switch (alt156) {
                    	case 1 :
                    	    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:4766:4: otherlv_24= ',' ( (lv_attributes_25_0= ruleStringToAttributeMapEntry ) )
                    	    {
                    	    otherlv_24=(Token)match(input,17,FollowSets000.FOLLOW_17_in_ruleAction9277); 

                    	        	newLeafNode(otherlv_24, grammarAccess.getActionAccess().getCommaKeyword_9_3_0());
                    	        
                    	    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:4770:1: ( (lv_attributes_25_0= ruleStringToAttributeMapEntry ) )
                    	    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:4771:1: (lv_attributes_25_0= ruleStringToAttributeMapEntry )
                    	    {
                    	    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:4771:1: (lv_attributes_25_0= ruleStringToAttributeMapEntry )
                    	    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:4772:3: lv_attributes_25_0= ruleStringToAttributeMapEntry
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getActionAccess().getAttributesStringToAttributeMapEntryParserRuleCall_9_3_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleStringToAttributeMapEntry_in_ruleAction9298);
                    	    lv_attributes_25_0=ruleStringToAttributeMapEntry();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getActionRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"attributes",
                    	            		lv_attributes_25_0, 
                    	            		"StringToAttributeMapEntry");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop156;
                        }
                    } while (true);

                    otherlv_26=(Token)match(input,22,FollowSets000.FOLLOW_22_in_ruleAction9312); 

                        	newLeafNode(otherlv_26, grammarAccess.getActionAccess().getRightCurlyBracketKeyword_9_4());
                        

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
    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:4800:1: ruleAttributeType returns [Enumerator current=null] : ( (enumLiteral_0= 'Boolean' ) | (enumLiteral_1= 'Handle' ) | (enumLiteral_2= 'Integer' ) | (enumLiteral_3= 'Long' ) | (enumLiteral_4= 'String' ) ) ;
    public final Enumerator ruleAttributeType() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;
        Token enumLiteral_4=null;

         enterRule(); 
        try {
            // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:4802:28: ( ( (enumLiteral_0= 'Boolean' ) | (enumLiteral_1= 'Handle' ) | (enumLiteral_2= 'Integer' ) | (enumLiteral_3= 'Long' ) | (enumLiteral_4= 'String' ) ) )
            // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:4803:1: ( (enumLiteral_0= 'Boolean' ) | (enumLiteral_1= 'Handle' ) | (enumLiteral_2= 'Integer' ) | (enumLiteral_3= 'Long' ) | (enumLiteral_4= 'String' ) )
            {
            // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:4803:1: ( (enumLiteral_0= 'Boolean' ) | (enumLiteral_1= 'Handle' ) | (enumLiteral_2= 'Integer' ) | (enumLiteral_3= 'Long' ) | (enumLiteral_4= 'String' ) )
            int alt158=5;
            switch ( input.LA(1) ) {
            case 68:
                {
                alt158=1;
                }
                break;
            case 69:
                {
                alt158=2;
                }
                break;
            case 70:
                {
                alt158=3;
                }
                break;
            case 71:
                {
                alt158=4;
                }
                break;
            case 72:
                {
                alt158=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 158, 0, input);

                throw nvae;
            }

            switch (alt158) {
                case 1 :
                    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:4803:2: (enumLiteral_0= 'Boolean' )
                    {
                    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:4803:2: (enumLiteral_0= 'Boolean' )
                    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:4803:4: enumLiteral_0= 'Boolean'
                    {
                    enumLiteral_0=(Token)match(input,68,FollowSets000.FOLLOW_68_in_ruleAttributeType9364); 

                            current = grammarAccess.getAttributeTypeAccess().getBooleanEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_0, grammarAccess.getAttributeTypeAccess().getBooleanEnumLiteralDeclaration_0()); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:4809:6: (enumLiteral_1= 'Handle' )
                    {
                    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:4809:6: (enumLiteral_1= 'Handle' )
                    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:4809:8: enumLiteral_1= 'Handle'
                    {
                    enumLiteral_1=(Token)match(input,69,FollowSets000.FOLLOW_69_in_ruleAttributeType9381); 

                            current = grammarAccess.getAttributeTypeAccess().getHandleEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_1, grammarAccess.getAttributeTypeAccess().getHandleEnumLiteralDeclaration_1()); 
                        

                    }


                    }
                    break;
                case 3 :
                    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:4815:6: (enumLiteral_2= 'Integer' )
                    {
                    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:4815:6: (enumLiteral_2= 'Integer' )
                    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:4815:8: enumLiteral_2= 'Integer'
                    {
                    enumLiteral_2=(Token)match(input,70,FollowSets000.FOLLOW_70_in_ruleAttributeType9398); 

                            current = grammarAccess.getAttributeTypeAccess().getIntegerEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_2, grammarAccess.getAttributeTypeAccess().getIntegerEnumLiteralDeclaration_2()); 
                        

                    }


                    }
                    break;
                case 4 :
                    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:4821:6: (enumLiteral_3= 'Long' )
                    {
                    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:4821:6: (enumLiteral_3= 'Long' )
                    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:4821:8: enumLiteral_3= 'Long'
                    {
                    enumLiteral_3=(Token)match(input,71,FollowSets000.FOLLOW_71_in_ruleAttributeType9415); 

                            current = grammarAccess.getAttributeTypeAccess().getLongEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_3, grammarAccess.getAttributeTypeAccess().getLongEnumLiteralDeclaration_3()); 
                        

                    }


                    }
                    break;
                case 5 :
                    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:4827:6: (enumLiteral_4= 'String' )
                    {
                    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:4827:6: (enumLiteral_4= 'String' )
                    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:4827:8: enumLiteral_4= 'String'
                    {
                    enumLiteral_4=(Token)match(input,72,FollowSets000.FOLLOW_72_in_ruleAttributeType9432); 

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
    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:4837:1: ruleConvergence returns [Enumerator current=null] : ( (enumLiteral_0= 'ordinary' ) | (enumLiteral_1= 'convergent' ) | (enumLiteral_2= 'anticipated' ) ) ;
    public final Enumerator ruleConvergence() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;

         enterRule(); 
        try {
            // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:4839:28: ( ( (enumLiteral_0= 'ordinary' ) | (enumLiteral_1= 'convergent' ) | (enumLiteral_2= 'anticipated' ) ) )
            // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:4840:1: ( (enumLiteral_0= 'ordinary' ) | (enumLiteral_1= 'convergent' ) | (enumLiteral_2= 'anticipated' ) )
            {
            // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:4840:1: ( (enumLiteral_0= 'ordinary' ) | (enumLiteral_1= 'convergent' ) | (enumLiteral_2= 'anticipated' ) )
            int alt159=3;
            switch ( input.LA(1) ) {
            case 73:
                {
                alt159=1;
                }
                break;
            case 74:
                {
                alt159=2;
                }
                break;
            case 75:
                {
                alt159=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 159, 0, input);

                throw nvae;
            }

            switch (alt159) {
                case 1 :
                    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:4840:2: (enumLiteral_0= 'ordinary' )
                    {
                    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:4840:2: (enumLiteral_0= 'ordinary' )
                    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:4840:4: enumLiteral_0= 'ordinary'
                    {
                    enumLiteral_0=(Token)match(input,73,FollowSets000.FOLLOW_73_in_ruleConvergence9477); 

                            current = grammarAccess.getConvergenceAccess().getOrdinaryEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_0, grammarAccess.getConvergenceAccess().getOrdinaryEnumLiteralDeclaration_0()); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:4846:6: (enumLiteral_1= 'convergent' )
                    {
                    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:4846:6: (enumLiteral_1= 'convergent' )
                    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:4846:8: enumLiteral_1= 'convergent'
                    {
                    enumLiteral_1=(Token)match(input,74,FollowSets000.FOLLOW_74_in_ruleConvergence9494); 

                            current = grammarAccess.getConvergenceAccess().getConvergentEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_1, grammarAccess.getConvergenceAccess().getConvergentEnumLiteralDeclaration_1()); 
                        

                    }


                    }
                    break;
                case 3 :
                    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:4852:6: (enumLiteral_2= 'anticipated' )
                    {
                    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:4852:6: (enumLiteral_2= 'anticipated' )
                    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:4852:8: enumLiteral_2= 'anticipated'
                    {
                    enumLiteral_2=(Token)match(input,75,FollowSets000.FOLLOW_75_in_ruleConvergence9511); 

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
        public static final BitSet FOLLOW_11_in_ruleMachine137 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleMachine163 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleMachine184 = new BitSet(new long[]{0x000000003798E002L});
        public static final BitSet FOLLOW_13_in_ruleMachine197 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleMachine218 = new BitSet(new long[]{0x000000003798C002L});
        public static final BitSet FOLLOW_14_in_ruleMachine233 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleMachine254 = new BitSet(new long[]{0x0000000037988002L});
        public static final BitSet FOLLOW_15_in_ruleMachine269 = new BitSet(new long[]{0x0000000000010000L});
        public static final BitSet FOLLOW_16_in_ruleMachine281 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleMachine304 = new BitSet(new long[]{0x0000000000060000L});
        public static final BitSet FOLLOW_17_in_ruleMachine317 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleMachine340 = new BitSet(new long[]{0x0000000000060000L});
        public static final BitSet FOLLOW_18_in_ruleMachine354 = new BitSet(new long[]{0x0000000037980002L});
        public static final BitSet FOLLOW_19_in_ruleMachine369 = new BitSet(new long[]{0x0000000000010000L});
        public static final BitSet FOLLOW_16_in_ruleMachine381 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleMachine404 = new BitSet(new long[]{0x0000000000060000L});
        public static final BitSet FOLLOW_17_in_ruleMachine417 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleMachine440 = new BitSet(new long[]{0x0000000000060000L});
        public static final BitSet FOLLOW_18_in_ruleMachine454 = new BitSet(new long[]{0x0000000037900002L});
        public static final BitSet FOLLOW_20_in_ruleMachine469 = new BitSet(new long[]{0x0000000000200000L});
        public static final BitSet FOLLOW_21_in_ruleMachine481 = new BitSet(new long[]{0x0000000040000000L});
        public static final BitSet FOLLOW_ruleAnnotation_in_ruleMachine502 = new BitSet(new long[]{0x0000000000420000L});
        public static final BitSet FOLLOW_17_in_ruleMachine515 = new BitSet(new long[]{0x0000000040000000L});
        public static final BitSet FOLLOW_ruleAnnotation_in_ruleMachine536 = new BitSet(new long[]{0x0000000000420000L});
        public static final BitSet FOLLOW_22_in_ruleMachine550 = new BitSet(new long[]{0x0000000037800002L});
        public static final BitSet FOLLOW_23_in_ruleMachine565 = new BitSet(new long[]{0x0000000000200000L});
        public static final BitSet FOLLOW_21_in_ruleMachine577 = new BitSet(new long[]{0x0080000000000800L});
        public static final BitSet FOLLOW_ruleAbstractExtension_in_ruleMachine598 = new BitSet(new long[]{0x0000000000420000L});
        public static final BitSet FOLLOW_17_in_ruleMachine611 = new BitSet(new long[]{0x0080000000000800L});
        public static final BitSet FOLLOW_ruleAbstractExtension_in_ruleMachine632 = new BitSet(new long[]{0x0000000000420000L});
        public static final BitSet FOLLOW_22_in_ruleMachine646 = new BitSet(new long[]{0x0000000037000002L});
        public static final BitSet FOLLOW_24_in_ruleMachine661 = new BitSet(new long[]{0x0000000000200000L});
        public static final BitSet FOLLOW_21_in_ruleMachine673 = new BitSet(new long[]{0x0000000800000000L});
        public static final BitSet FOLLOW_ruleStringToAttributeMapEntry_in_ruleMachine694 = new BitSet(new long[]{0x0000000000420000L});
        public static final BitSet FOLLOW_17_in_ruleMachine707 = new BitSet(new long[]{0x0000000800000000L});
        public static final BitSet FOLLOW_ruleStringToAttributeMapEntry_in_ruleMachine728 = new BitSet(new long[]{0x0000000000420000L});
        public static final BitSet FOLLOW_22_in_ruleMachine742 = new BitSet(new long[]{0x0000000036000002L});
        public static final BitSet FOLLOW_25_in_ruleMachine757 = new BitSet(new long[]{0x0000004000000800L});
        public static final BitSet FOLLOW_ruleVariable_in_ruleMachine778 = new BitSet(new long[]{0x0000000034020002L});
        public static final BitSet FOLLOW_17_in_ruleMachine791 = new BitSet(new long[]{0x0000004000000800L});
        public static final BitSet FOLLOW_ruleVariable_in_ruleMachine812 = new BitSet(new long[]{0x0000000034020002L});
        public static final BitSet FOLLOW_26_in_ruleMachine829 = new BitSet(new long[]{0x0000010000000000L});
        public static final BitSet FOLLOW_ruleInvariant_in_ruleMachine850 = new BitSet(new long[]{0x0000000038000002L});
        public static final BitSet FOLLOW_27_in_ruleMachine863 = new BitSet(new long[]{0x0000010000000000L});
        public static final BitSet FOLLOW_ruleInvariant_in_ruleMachine884 = new BitSet(new long[]{0x0000000038000002L});
        public static final BitSet FOLLOW_28_in_ruleMachine901 = new BitSet(new long[]{0x0000000010000800L});
        public static final BitSet FOLLOW_ruleVariant_in_ruleMachine922 = new BitSet(new long[]{0x0000000020000002L});
        public static final BitSet FOLLOW_29_in_ruleMachine937 = new BitSet(new long[]{0x0000200000000000L});
        public static final BitSet FOLLOW_ruleEvent_in_ruleMachine958 = new BitSet(new long[]{0x0000200000000002L});
        public static final BitSet FOLLOW_ruleEvent_in_ruleMachine979 = new BitSet(new long[]{0x0000200000000002L});
        public static final BitSet FOLLOW_ruleAbstractExtension_in_entryRuleAbstractExtension1018 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleAbstractExtension1028 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleExtension_in_ruleAbstractExtension1074 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAnnotation_in_entryRuleAnnotation1108 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleAnnotation1118 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_30_in_ruleAnnotation1164 = new BitSet(new long[]{0x0000000000200000L});
        public static final BitSet FOLLOW_21_in_ruleAnnotation1176 = new BitSet(new long[]{0x0000000780500000L});
        public static final BitSet FOLLOW_31_in_ruleAnnotation1189 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleAnnotation1210 = new BitSet(new long[]{0x0000000700500000L});
        public static final BitSet FOLLOW_32_in_ruleAnnotation1225 = new BitSet(new long[]{0x0000000000010000L});
        public static final BitSet FOLLOW_16_in_ruleAnnotation1237 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleAnnotation1260 = new BitSet(new long[]{0x0000000000060000L});
        public static final BitSet FOLLOW_17_in_ruleAnnotation1273 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleAnnotation1296 = new BitSet(new long[]{0x0000000000060000L});
        public static final BitSet FOLLOW_18_in_ruleAnnotation1310 = new BitSet(new long[]{0x0000000600500000L});
        public static final BitSet FOLLOW_20_in_ruleAnnotation1325 = new BitSet(new long[]{0x0000000000200000L});
        public static final BitSet FOLLOW_21_in_ruleAnnotation1337 = new BitSet(new long[]{0x0000000040000000L});
        public static final BitSet FOLLOW_ruleAnnotation_in_ruleAnnotation1358 = new BitSet(new long[]{0x0000000000420000L});
        public static final BitSet FOLLOW_17_in_ruleAnnotation1371 = new BitSet(new long[]{0x0000000040000000L});
        public static final BitSet FOLLOW_ruleAnnotation_in_ruleAnnotation1392 = new BitSet(new long[]{0x0000000000420000L});
        public static final BitSet FOLLOW_22_in_ruleAnnotation1406 = new BitSet(new long[]{0x0000000600400000L});
        public static final BitSet FOLLOW_33_in_ruleAnnotation1421 = new BitSet(new long[]{0x0000000000200000L});
        public static final BitSet FOLLOW_21_in_ruleAnnotation1433 = new BitSet(new long[]{0x0020000000000000L});
        public static final BitSet FOLLOW_ruleStringToStringMapEntry_in_ruleAnnotation1454 = new BitSet(new long[]{0x0000000000420000L});
        public static final BitSet FOLLOW_17_in_ruleAnnotation1467 = new BitSet(new long[]{0x0020000000000000L});
        public static final BitSet FOLLOW_ruleStringToStringMapEntry_in_ruleAnnotation1488 = new BitSet(new long[]{0x0000000000420000L});
        public static final BitSet FOLLOW_22_in_ruleAnnotation1502 = new BitSet(new long[]{0x0000000400400000L});
        public static final BitSet FOLLOW_34_in_ruleAnnotation1517 = new BitSet(new long[]{0x0000000000200000L});
        public static final BitSet FOLLOW_21_in_ruleAnnotation1529 = new BitSet(new long[]{0x0040000000000000L});
        public static final BitSet FOLLOW_ruleEObject_in_ruleAnnotation1550 = new BitSet(new long[]{0x0000000000420000L});
        public static final BitSet FOLLOW_17_in_ruleAnnotation1563 = new BitSet(new long[]{0x0040000000000000L});
        public static final BitSet FOLLOW_ruleEObject_in_ruleAnnotation1584 = new BitSet(new long[]{0x0000000000420000L});
        public static final BitSet FOLLOW_22_in_ruleAnnotation1598 = new BitSet(new long[]{0x0000000000400000L});
        public static final BitSet FOLLOW_22_in_ruleAnnotation1612 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleStringToAttributeMapEntry_in_entryRuleStringToAttributeMapEntry1648 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleStringToAttributeMapEntry1658 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_35_in_ruleStringToAttributeMapEntry1695 = new BitSet(new long[]{0x0000000000200000L});
        public static final BitSet FOLLOW_21_in_ruleStringToAttributeMapEntry1707 = new BitSet(new long[]{0x0000001000000000L});
        public static final BitSet FOLLOW_36_in_ruleStringToAttributeMapEntry1719 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleStringToAttributeMapEntry1740 = new BitSet(new long[]{0x0000002000400000L});
        public static final BitSet FOLLOW_37_in_ruleStringToAttributeMapEntry1753 = new BitSet(new long[]{0x0200000000000000L});
        public static final BitSet FOLLOW_ruleAttribute_in_ruleStringToAttributeMapEntry1774 = new BitSet(new long[]{0x0000000000400000L});
        public static final BitSet FOLLOW_22_in_ruleStringToAttributeMapEntry1788 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_entryRuleEString1827 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleEString1838 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_STRING_in_ruleEString1878 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleEString1904 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleVariable_in_entryRuleVariable1951 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleVariable1961 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_11_in_ruleVariable2013 = new BitSet(new long[]{0x0000004000000000L});
        public static final BitSet FOLLOW_38_in_ruleVariable2039 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleVariable2060 = new BitSet(new long[]{0x0000008001902002L});
        public static final BitSet FOLLOW_13_in_ruleVariable2073 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleVariable2094 = new BitSet(new long[]{0x0000008001900002L});
        public static final BitSet FOLLOW_39_in_ruleVariable2109 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleVariable2130 = new BitSet(new long[]{0x0000000001900002L});
        public static final BitSet FOLLOW_20_in_ruleVariable2145 = new BitSet(new long[]{0x0000000000200000L});
        public static final BitSet FOLLOW_21_in_ruleVariable2157 = new BitSet(new long[]{0x0000000040000000L});
        public static final BitSet FOLLOW_ruleAnnotation_in_ruleVariable2178 = new BitSet(new long[]{0x0000000000420000L});
        public static final BitSet FOLLOW_17_in_ruleVariable2191 = new BitSet(new long[]{0x0000000040000000L});
        public static final BitSet FOLLOW_ruleAnnotation_in_ruleVariable2212 = new BitSet(new long[]{0x0000000000420000L});
        public static final BitSet FOLLOW_22_in_ruleVariable2226 = new BitSet(new long[]{0x0000000001800002L});
        public static final BitSet FOLLOW_23_in_ruleVariable2241 = new BitSet(new long[]{0x0000000000200000L});
        public static final BitSet FOLLOW_21_in_ruleVariable2253 = new BitSet(new long[]{0x0080000000000800L});
        public static final BitSet FOLLOW_ruleAbstractExtension_in_ruleVariable2274 = new BitSet(new long[]{0x0000000000420000L});
        public static final BitSet FOLLOW_17_in_ruleVariable2287 = new BitSet(new long[]{0x0080000000000800L});
        public static final BitSet FOLLOW_ruleAbstractExtension_in_ruleVariable2308 = new BitSet(new long[]{0x0000000000420000L});
        public static final BitSet FOLLOW_22_in_ruleVariable2322 = new BitSet(new long[]{0x0000000001000002L});
        public static final BitSet FOLLOW_24_in_ruleVariable2337 = new BitSet(new long[]{0x0000000000200000L});
        public static final BitSet FOLLOW_21_in_ruleVariable2349 = new BitSet(new long[]{0x0000000800000000L});
        public static final BitSet FOLLOW_ruleStringToAttributeMapEntry_in_ruleVariable2370 = new BitSet(new long[]{0x0000000000420000L});
        public static final BitSet FOLLOW_17_in_ruleVariable2383 = new BitSet(new long[]{0x0000000800000000L});
        public static final BitSet FOLLOW_ruleStringToAttributeMapEntry_in_ruleVariable2404 = new BitSet(new long[]{0x0000000000420000L});
        public static final BitSet FOLLOW_22_in_ruleVariable2418 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleInvariant_in_entryRuleInvariant2456 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleInvariant2466 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_40_in_ruleInvariant2503 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleInvariant2524 = new BitSet(new long[]{0x0000060000000800L});
        public static final BitSet FOLLOW_11_in_ruleInvariant2542 = new BitSet(new long[]{0x0000060000000000L});
        public static final BitSet FOLLOW_41_in_ruleInvariant2574 = new BitSet(new long[]{0x0000040000000000L});
        public static final BitSet FOLLOW_42_in_ruleInvariant2600 = new BitSet(new long[]{0x0000088000002000L});
        public static final BitSet FOLLOW_13_in_ruleInvariant2613 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleInvariant2634 = new BitSet(new long[]{0x0000088000000000L});
        public static final BitSet FOLLOW_39_in_ruleInvariant2649 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleInvariant2670 = new BitSet(new long[]{0x0000080000000000L});
        public static final BitSet FOLLOW_43_in_ruleInvariant2684 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleInvariant2705 = new BitSet(new long[]{0x0000000001900002L});
        public static final BitSet FOLLOW_20_in_ruleInvariant2718 = new BitSet(new long[]{0x0000000000200000L});
        public static final BitSet FOLLOW_21_in_ruleInvariant2730 = new BitSet(new long[]{0x0000000040000000L});
        public static final BitSet FOLLOW_ruleAnnotation_in_ruleInvariant2751 = new BitSet(new long[]{0x0000000000420000L});
        public static final BitSet FOLLOW_17_in_ruleInvariant2764 = new BitSet(new long[]{0x0000000040000000L});
        public static final BitSet FOLLOW_ruleAnnotation_in_ruleInvariant2785 = new BitSet(new long[]{0x0000000000420000L});
        public static final BitSet FOLLOW_22_in_ruleInvariant2799 = new BitSet(new long[]{0x0000000001800002L});
        public static final BitSet FOLLOW_23_in_ruleInvariant2814 = new BitSet(new long[]{0x0000000000200000L});
        public static final BitSet FOLLOW_21_in_ruleInvariant2826 = new BitSet(new long[]{0x0080000000000800L});
        public static final BitSet FOLLOW_ruleAbstractExtension_in_ruleInvariant2847 = new BitSet(new long[]{0x0000000000420000L});
        public static final BitSet FOLLOW_17_in_ruleInvariant2860 = new BitSet(new long[]{0x0080000000000800L});
        public static final BitSet FOLLOW_ruleAbstractExtension_in_ruleInvariant2881 = new BitSet(new long[]{0x0000000000420000L});
        public static final BitSet FOLLOW_22_in_ruleInvariant2895 = new BitSet(new long[]{0x0000000001000002L});
        public static final BitSet FOLLOW_24_in_ruleInvariant2910 = new BitSet(new long[]{0x0000000000200000L});
        public static final BitSet FOLLOW_21_in_ruleInvariant2922 = new BitSet(new long[]{0x0000000800000000L});
        public static final BitSet FOLLOW_ruleStringToAttributeMapEntry_in_ruleInvariant2943 = new BitSet(new long[]{0x0000000000420000L});
        public static final BitSet FOLLOW_17_in_ruleInvariant2956 = new BitSet(new long[]{0x0000000800000000L});
        public static final BitSet FOLLOW_ruleStringToAttributeMapEntry_in_ruleInvariant2977 = new BitSet(new long[]{0x0000000000420000L});
        public static final BitSet FOLLOW_22_in_ruleInvariant2991 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleVariant_in_entryRuleVariant3029 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleVariant3039 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_11_in_ruleVariant3082 = new BitSet(new long[]{0x0000000010000000L});
        public static final BitSet FOLLOW_28_in_ruleVariant3108 = new BitSet(new long[]{0x0000108000002000L});
        public static final BitSet FOLLOW_13_in_ruleVariant3121 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleVariant3142 = new BitSet(new long[]{0x0000108000000000L});
        public static final BitSet FOLLOW_39_in_ruleVariant3157 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleVariant3178 = new BitSet(new long[]{0x0000100000000000L});
        public static final BitSet FOLLOW_44_in_ruleVariant3192 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleVariant3213 = new BitSet(new long[]{0x0000000001900002L});
        public static final BitSet FOLLOW_20_in_ruleVariant3226 = new BitSet(new long[]{0x0000000000200000L});
        public static final BitSet FOLLOW_21_in_ruleVariant3238 = new BitSet(new long[]{0x0000000040000000L});
        public static final BitSet FOLLOW_ruleAnnotation_in_ruleVariant3259 = new BitSet(new long[]{0x0000000000420000L});
        public static final BitSet FOLLOW_17_in_ruleVariant3272 = new BitSet(new long[]{0x0000000040000000L});
        public static final BitSet FOLLOW_ruleAnnotation_in_ruleVariant3293 = new BitSet(new long[]{0x0000000000420000L});
        public static final BitSet FOLLOW_22_in_ruleVariant3307 = new BitSet(new long[]{0x0000000001800002L});
        public static final BitSet FOLLOW_23_in_ruleVariant3322 = new BitSet(new long[]{0x0000000000200000L});
        public static final BitSet FOLLOW_21_in_ruleVariant3334 = new BitSet(new long[]{0x0080000000000800L});
        public static final BitSet FOLLOW_ruleAbstractExtension_in_ruleVariant3355 = new BitSet(new long[]{0x0000000000420000L});
        public static final BitSet FOLLOW_17_in_ruleVariant3368 = new BitSet(new long[]{0x0080000000000800L});
        public static final BitSet FOLLOW_ruleAbstractExtension_in_ruleVariant3389 = new BitSet(new long[]{0x0000000000420000L});
        public static final BitSet FOLLOW_22_in_ruleVariant3403 = new BitSet(new long[]{0x0000000001000002L});
        public static final BitSet FOLLOW_24_in_ruleVariant3418 = new BitSet(new long[]{0x0000000000200000L});
        public static final BitSet FOLLOW_21_in_ruleVariant3430 = new BitSet(new long[]{0x0000000800000000L});
        public static final BitSet FOLLOW_ruleStringToAttributeMapEntry_in_ruleVariant3451 = new BitSet(new long[]{0x0000000000420000L});
        public static final BitSet FOLLOW_17_in_ruleVariant3464 = new BitSet(new long[]{0x0000000800000000L});
        public static final BitSet FOLLOW_ruleStringToAttributeMapEntry_in_ruleVariant3485 = new BitSet(new long[]{0x0000000000420000L});
        public static final BitSet FOLLOW_22_in_ruleVariant3499 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEvent_in_entryRuleEvent3537 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleEvent3547 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_45_in_ruleEvent3593 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleEvent3614 = new BitSet(new long[]{0x000FC0000190E802L});
        public static final BitSet FOLLOW_11_in_ruleEvent3632 = new BitSet(new long[]{0x000FC0000190E002L});
        public static final BitSet FOLLOW_46_in_ruleEvent3664 = new BitSet(new long[]{0x000F80000190E002L});
        public static final BitSet FOLLOW_13_in_ruleEvent3691 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleEvent3712 = new BitSet(new long[]{0x000F80000190C002L});
        public static final BitSet FOLLOW_14_in_ruleEvent3727 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleEvent3748 = new BitSet(new long[]{0x000F800001908002L});
        public static final BitSet FOLLOW_47_in_ruleEvent3763 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000E00L});
        public static final BitSet FOLLOW_ruleConvergence_in_ruleEvent3784 = new BitSet(new long[]{0x000F000001908002L});
        public static final BitSet FOLLOW_15_in_ruleEvent3799 = new BitSet(new long[]{0x0000000000010000L});
        public static final BitSet FOLLOW_16_in_ruleEvent3811 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleEvent3834 = new BitSet(new long[]{0x0000000000060000L});
        public static final BitSet FOLLOW_17_in_ruleEvent3847 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleEvent3870 = new BitSet(new long[]{0x0000000000060000L});
        public static final BitSet FOLLOW_18_in_ruleEvent3884 = new BitSet(new long[]{0x000F000001900002L});
        public static final BitSet FOLLOW_20_in_ruleEvent3899 = new BitSet(new long[]{0x0000000000200000L});
        public static final BitSet FOLLOW_21_in_ruleEvent3911 = new BitSet(new long[]{0x0000000040000000L});
        public static final BitSet FOLLOW_ruleAnnotation_in_ruleEvent3932 = new BitSet(new long[]{0x0000000000420000L});
        public static final BitSet FOLLOW_17_in_ruleEvent3945 = new BitSet(new long[]{0x0000000040000000L});
        public static final BitSet FOLLOW_ruleAnnotation_in_ruleEvent3966 = new BitSet(new long[]{0x0000000000420000L});
        public static final BitSet FOLLOW_22_in_ruleEvent3980 = new BitSet(new long[]{0x000F000001800002L});
        public static final BitSet FOLLOW_23_in_ruleEvent3995 = new BitSet(new long[]{0x0000000000200000L});
        public static final BitSet FOLLOW_21_in_ruleEvent4007 = new BitSet(new long[]{0x0080000000000800L});
        public static final BitSet FOLLOW_ruleAbstractExtension_in_ruleEvent4028 = new BitSet(new long[]{0x0000000000420000L});
        public static final BitSet FOLLOW_17_in_ruleEvent4041 = new BitSet(new long[]{0x0080000000000800L});
        public static final BitSet FOLLOW_ruleAbstractExtension_in_ruleEvent4062 = new BitSet(new long[]{0x0000000000420000L});
        public static final BitSet FOLLOW_22_in_ruleEvent4076 = new BitSet(new long[]{0x000F000001000002L});
        public static final BitSet FOLLOW_24_in_ruleEvent4091 = new BitSet(new long[]{0x0000000000200000L});
        public static final BitSet FOLLOW_21_in_ruleEvent4103 = new BitSet(new long[]{0x0000000800000000L});
        public static final BitSet FOLLOW_ruleStringToAttributeMapEntry_in_ruleEvent4124 = new BitSet(new long[]{0x0000000000420000L});
        public static final BitSet FOLLOW_17_in_ruleEvent4137 = new BitSet(new long[]{0x0000000800000000L});
        public static final BitSet FOLLOW_ruleStringToAttributeMapEntry_in_ruleEvent4158 = new BitSet(new long[]{0x0000000000420000L});
        public static final BitSet FOLLOW_22_in_ruleEvent4172 = new BitSet(new long[]{0x000F000000000002L});
        public static final BitSet FOLLOW_48_in_ruleEvent4187 = new BitSet(new long[]{0x8000000000000800L});
        public static final BitSet FOLLOW_ruleParameter_in_ruleEvent4208 = new BitSet(new long[]{0x000E000000020002L});
        public static final BitSet FOLLOW_17_in_ruleEvent4221 = new BitSet(new long[]{0x8000000000000800L});
        public static final BitSet FOLLOW_ruleParameter_in_ruleEvent4242 = new BitSet(new long[]{0x000E000000020002L});
        public static final BitSet FOLLOW_49_in_ruleEvent4259 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L});
        public static final BitSet FOLLOW_ruleGuard_in_ruleEvent4280 = new BitSet(new long[]{0x000C000008000002L});
        public static final BitSet FOLLOW_27_in_ruleEvent4293 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L});
        public static final BitSet FOLLOW_ruleGuard_in_ruleEvent4314 = new BitSet(new long[]{0x000C000008000002L});
        public static final BitSet FOLLOW_50_in_ruleEvent4331 = new BitSet(new long[]{0x0000000000000800L,0x0000000000000002L});
        public static final BitSet FOLLOW_ruleWitness_in_ruleEvent4352 = new BitSet(new long[]{0x0008000000020002L});
        public static final BitSet FOLLOW_17_in_ruleEvent4365 = new BitSet(new long[]{0x0000000000000800L,0x0000000000000002L});
        public static final BitSet FOLLOW_ruleWitness_in_ruleEvent4386 = new BitSet(new long[]{0x0008000000020002L});
        public static final BitSet FOLLOW_51_in_ruleEvent4403 = new BitSet(new long[]{0x0000000000000800L,0x0000000000000008L});
        public static final BitSet FOLLOW_ruleAction_in_ruleEvent4424 = new BitSet(new long[]{0x0010000000000002L});
        public static final BitSet FOLLOW_52_in_ruleEvent4437 = new BitSet(new long[]{0x0000000000000800L,0x0000000000000008L});
        public static final BitSet FOLLOW_ruleAction_in_ruleEvent4458 = new BitSet(new long[]{0x0010000000000002L});
        public static final BitSet FOLLOW_ruleStringToStringMapEntry_in_entryRuleStringToStringMapEntry4498 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleStringToStringMapEntry4508 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_53_in_ruleStringToStringMapEntry4554 = new BitSet(new long[]{0x0000000000200000L});
        public static final BitSet FOLLOW_21_in_ruleStringToStringMapEntry4566 = new BitSet(new long[]{0x0000003000400000L});
        public static final BitSet FOLLOW_36_in_ruleStringToStringMapEntry4579 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleStringToStringMapEntry4600 = new BitSet(new long[]{0x0000002000400000L});
        public static final BitSet FOLLOW_37_in_ruleStringToStringMapEntry4615 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleStringToStringMapEntry4636 = new BitSet(new long[]{0x0000000000400000L});
        public static final BitSet FOLLOW_22_in_ruleStringToStringMapEntry4650 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEObject_in_entryRuleEObject4686 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleEObject4696 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_54_in_ruleEObject4742 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleExtension_in_entryRuleExtension4778 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleExtension4788 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_11_in_ruleExtension4831 = new BitSet(new long[]{0x0080000000000000L});
        public static final BitSet FOLLOW_55_in_ruleExtension4857 = new BitSet(new long[]{0x0000000000200000L});
        public static final BitSet FOLLOW_21_in_ruleExtension4869 = new BitSet(new long[]{0x0100000000002000L});
        public static final BitSet FOLLOW_13_in_ruleExtension4882 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleExtension4903 = new BitSet(new long[]{0x0100000000000000L});
        public static final BitSet FOLLOW_56_in_ruleExtension4917 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleExtension4938 = new BitSet(new long[]{0x0000000001D00000L});
        public static final BitSet FOLLOW_20_in_ruleExtension4951 = new BitSet(new long[]{0x0000000000200000L});
        public static final BitSet FOLLOW_21_in_ruleExtension4963 = new BitSet(new long[]{0x0000000040000000L});
        public static final BitSet FOLLOW_ruleAnnotation_in_ruleExtension4984 = new BitSet(new long[]{0x0000000000420000L});
        public static final BitSet FOLLOW_17_in_ruleExtension4997 = new BitSet(new long[]{0x0000000040000000L});
        public static final BitSet FOLLOW_ruleAnnotation_in_ruleExtension5018 = new BitSet(new long[]{0x0000000000420000L});
        public static final BitSet FOLLOW_22_in_ruleExtension5032 = new BitSet(new long[]{0x0000000001C00000L});
        public static final BitSet FOLLOW_23_in_ruleExtension5047 = new BitSet(new long[]{0x0000000000200000L});
        public static final BitSet FOLLOW_21_in_ruleExtension5059 = new BitSet(new long[]{0x0080000000000800L});
        public static final BitSet FOLLOW_ruleAbstractExtension_in_ruleExtension5080 = new BitSet(new long[]{0x0000000000420000L});
        public static final BitSet FOLLOW_17_in_ruleExtension5093 = new BitSet(new long[]{0x0080000000000800L});
        public static final BitSet FOLLOW_ruleAbstractExtension_in_ruleExtension5114 = new BitSet(new long[]{0x0000000000420000L});
        public static final BitSet FOLLOW_22_in_ruleExtension5128 = new BitSet(new long[]{0x0000000001400000L});
        public static final BitSet FOLLOW_24_in_ruleExtension5143 = new BitSet(new long[]{0x0000000000200000L});
        public static final BitSet FOLLOW_21_in_ruleExtension5155 = new BitSet(new long[]{0x0000000800000000L});
        public static final BitSet FOLLOW_ruleStringToAttributeMapEntry_in_ruleExtension5176 = new BitSet(new long[]{0x0000000000420000L});
        public static final BitSet FOLLOW_17_in_ruleExtension5189 = new BitSet(new long[]{0x0000000800000000L});
        public static final BitSet FOLLOW_ruleStringToAttributeMapEntry_in_ruleExtension5210 = new BitSet(new long[]{0x0000000000420000L});
        public static final BitSet FOLLOW_22_in_ruleExtension5224 = new BitSet(new long[]{0x0000000000400000L});
        public static final BitSet FOLLOW_22_in_ruleExtension5238 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAttribute_in_entryRuleAttribute5274 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleAttribute5284 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_57_in_ruleAttribute5321 = new BitSet(new long[]{0x0000000000200000L});
        public static final BitSet FOLLOW_21_in_ruleAttribute5333 = new BitSet(new long[]{0x0400000000000000L});
        public static final BitSet FOLLOW_58_in_ruleAttribute5345 = new BitSet(new long[]{0x0000000000000000L,0x00000000000001F0L});
        public static final BitSet FOLLOW_ruleAttributeType_in_ruleAttribute5366 = new BitSet(new long[]{0x0000002000000000L});
        public static final BitSet FOLLOW_37_in_ruleAttribute5378 = new BitSet(new long[]{0x0800000000000000L});
        public static final BitSet FOLLOW_ruleEJavaObject_in_ruleAttribute5399 = new BitSet(new long[]{0x0000000000500000L});
        public static final BitSet FOLLOW_20_in_ruleAttribute5412 = new BitSet(new long[]{0x0000000000200000L});
        public static final BitSet FOLLOW_21_in_ruleAttribute5424 = new BitSet(new long[]{0x0000000040000000L});
        public static final BitSet FOLLOW_ruleAnnotation_in_ruleAttribute5445 = new BitSet(new long[]{0x0000000000420000L});
        public static final BitSet FOLLOW_17_in_ruleAttribute5458 = new BitSet(new long[]{0x0000000040000000L});
        public static final BitSet FOLLOW_ruleAnnotation_in_ruleAttribute5479 = new BitSet(new long[]{0x0000000000420000L});
        public static final BitSet FOLLOW_22_in_ruleAttribute5493 = new BitSet(new long[]{0x0000000000400000L});
        public static final BitSet FOLLOW_22_in_ruleAttribute5507 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEJavaObject_in_entryRuleEJavaObject5544 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleEJavaObject5555 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_59_in_ruleEJavaObject5592 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleCarrierSet_in_entryRuleCarrierSet5631 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleCarrierSet5641 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_11_in_ruleCarrierSet5693 = new BitSet(new long[]{0x1000000000000000L});
        public static final BitSet FOLLOW_60_in_ruleCarrierSet5719 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleCarrierSet5740 = new BitSet(new long[]{0x0000008001902002L});
        public static final BitSet FOLLOW_13_in_ruleCarrierSet5753 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleCarrierSet5774 = new BitSet(new long[]{0x0000008001900002L});
        public static final BitSet FOLLOW_39_in_ruleCarrierSet5789 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleCarrierSet5810 = new BitSet(new long[]{0x0000000001900002L});
        public static final BitSet FOLLOW_20_in_ruleCarrierSet5825 = new BitSet(new long[]{0x0000000000200000L});
        public static final BitSet FOLLOW_21_in_ruleCarrierSet5837 = new BitSet(new long[]{0x0000000040000000L});
        public static final BitSet FOLLOW_ruleAnnotation_in_ruleCarrierSet5858 = new BitSet(new long[]{0x0000000000420000L});
        public static final BitSet FOLLOW_17_in_ruleCarrierSet5871 = new BitSet(new long[]{0x0000000040000000L});
        public static final BitSet FOLLOW_ruleAnnotation_in_ruleCarrierSet5892 = new BitSet(new long[]{0x0000000000420000L});
        public static final BitSet FOLLOW_22_in_ruleCarrierSet5906 = new BitSet(new long[]{0x0000000001800002L});
        public static final BitSet FOLLOW_23_in_ruleCarrierSet5921 = new BitSet(new long[]{0x0000000000200000L});
        public static final BitSet FOLLOW_21_in_ruleCarrierSet5933 = new BitSet(new long[]{0x0080000000000800L});
        public static final BitSet FOLLOW_ruleAbstractExtension_in_ruleCarrierSet5954 = new BitSet(new long[]{0x0000000000420000L});
        public static final BitSet FOLLOW_17_in_ruleCarrierSet5967 = new BitSet(new long[]{0x0080000000000800L});
        public static final BitSet FOLLOW_ruleAbstractExtension_in_ruleCarrierSet5988 = new BitSet(new long[]{0x0000000000420000L});
        public static final BitSet FOLLOW_22_in_ruleCarrierSet6002 = new BitSet(new long[]{0x0000000001000002L});
        public static final BitSet FOLLOW_24_in_ruleCarrierSet6017 = new BitSet(new long[]{0x0000000000200000L});
        public static final BitSet FOLLOW_21_in_ruleCarrierSet6029 = new BitSet(new long[]{0x0000000800000000L});
        public static final BitSet FOLLOW_ruleStringToAttributeMapEntry_in_ruleCarrierSet6050 = new BitSet(new long[]{0x0000000000420000L});
        public static final BitSet FOLLOW_17_in_ruleCarrierSet6063 = new BitSet(new long[]{0x0000000800000000L});
        public static final BitSet FOLLOW_ruleStringToAttributeMapEntry_in_ruleCarrierSet6084 = new BitSet(new long[]{0x0000000000420000L});
        public static final BitSet FOLLOW_22_in_ruleCarrierSet6098 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleConstant_in_entryRuleConstant6136 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleConstant6146 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_11_in_ruleConstant6198 = new BitSet(new long[]{0x2000000000000000L});
        public static final BitSet FOLLOW_61_in_ruleConstant6224 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleConstant6245 = new BitSet(new long[]{0x0000008001902002L});
        public static final BitSet FOLLOW_13_in_ruleConstant6258 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleConstant6279 = new BitSet(new long[]{0x0000008001900002L});
        public static final BitSet FOLLOW_39_in_ruleConstant6294 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleConstant6315 = new BitSet(new long[]{0x0000000001900002L});
        public static final BitSet FOLLOW_20_in_ruleConstant6330 = new BitSet(new long[]{0x0000000000200000L});
        public static final BitSet FOLLOW_21_in_ruleConstant6342 = new BitSet(new long[]{0x0000000040000000L});
        public static final BitSet FOLLOW_ruleAnnotation_in_ruleConstant6363 = new BitSet(new long[]{0x0000000000420000L});
        public static final BitSet FOLLOW_17_in_ruleConstant6376 = new BitSet(new long[]{0x0000000040000000L});
        public static final BitSet FOLLOW_ruleAnnotation_in_ruleConstant6397 = new BitSet(new long[]{0x0000000000420000L});
        public static final BitSet FOLLOW_22_in_ruleConstant6411 = new BitSet(new long[]{0x0000000001800002L});
        public static final BitSet FOLLOW_23_in_ruleConstant6426 = new BitSet(new long[]{0x0000000000200000L});
        public static final BitSet FOLLOW_21_in_ruleConstant6438 = new BitSet(new long[]{0x0080000000000800L});
        public static final BitSet FOLLOW_ruleAbstractExtension_in_ruleConstant6459 = new BitSet(new long[]{0x0000000000420000L});
        public static final BitSet FOLLOW_17_in_ruleConstant6472 = new BitSet(new long[]{0x0080000000000800L});
        public static final BitSet FOLLOW_ruleAbstractExtension_in_ruleConstant6493 = new BitSet(new long[]{0x0000000000420000L});
        public static final BitSet FOLLOW_22_in_ruleConstant6507 = new BitSet(new long[]{0x0000000001000002L});
        public static final BitSet FOLLOW_24_in_ruleConstant6522 = new BitSet(new long[]{0x0000000000200000L});
        public static final BitSet FOLLOW_21_in_ruleConstant6534 = new BitSet(new long[]{0x0000000800000000L});
        public static final BitSet FOLLOW_ruleStringToAttributeMapEntry_in_ruleConstant6555 = new BitSet(new long[]{0x0000000000420000L});
        public static final BitSet FOLLOW_17_in_ruleConstant6568 = new BitSet(new long[]{0x0000000800000000L});
        public static final BitSet FOLLOW_ruleStringToAttributeMapEntry_in_ruleConstant6589 = new BitSet(new long[]{0x0000000000420000L});
        public static final BitSet FOLLOW_22_in_ruleConstant6603 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAxiom_in_entryRuleAxiom6641 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleAxiom6651 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_62_in_ruleAxiom6688 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleAxiom6709 = new BitSet(new long[]{0x0000060000000800L});
        public static final BitSet FOLLOW_11_in_ruleAxiom6727 = new BitSet(new long[]{0x0000060000000000L});
        public static final BitSet FOLLOW_41_in_ruleAxiom6759 = new BitSet(new long[]{0x0000040000000000L});
        public static final BitSet FOLLOW_42_in_ruleAxiom6785 = new BitSet(new long[]{0x0000088000002000L});
        public static final BitSet FOLLOW_13_in_ruleAxiom6798 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleAxiom6819 = new BitSet(new long[]{0x0000088000000000L});
        public static final BitSet FOLLOW_39_in_ruleAxiom6834 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleAxiom6855 = new BitSet(new long[]{0x0000080000000000L});
        public static final BitSet FOLLOW_43_in_ruleAxiom6869 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleAxiom6890 = new BitSet(new long[]{0x0000000001900002L});
        public static final BitSet FOLLOW_20_in_ruleAxiom6903 = new BitSet(new long[]{0x0000000000200000L});
        public static final BitSet FOLLOW_21_in_ruleAxiom6915 = new BitSet(new long[]{0x0000000040000000L});
        public static final BitSet FOLLOW_ruleAnnotation_in_ruleAxiom6936 = new BitSet(new long[]{0x0000000000420000L});
        public static final BitSet FOLLOW_17_in_ruleAxiom6949 = new BitSet(new long[]{0x0000000040000000L});
        public static final BitSet FOLLOW_ruleAnnotation_in_ruleAxiom6970 = new BitSet(new long[]{0x0000000000420000L});
        public static final BitSet FOLLOW_22_in_ruleAxiom6984 = new BitSet(new long[]{0x0000000001800002L});
        public static final BitSet FOLLOW_23_in_ruleAxiom6999 = new BitSet(new long[]{0x0000000000200000L});
        public static final BitSet FOLLOW_21_in_ruleAxiom7011 = new BitSet(new long[]{0x0080000000000800L});
        public static final BitSet FOLLOW_ruleAbstractExtension_in_ruleAxiom7032 = new BitSet(new long[]{0x0000000000420000L});
        public static final BitSet FOLLOW_17_in_ruleAxiom7045 = new BitSet(new long[]{0x0080000000000800L});
        public static final BitSet FOLLOW_ruleAbstractExtension_in_ruleAxiom7066 = new BitSet(new long[]{0x0000000000420000L});
        public static final BitSet FOLLOW_22_in_ruleAxiom7080 = new BitSet(new long[]{0x0000000001000002L});
        public static final BitSet FOLLOW_24_in_ruleAxiom7095 = new BitSet(new long[]{0x0000000000200000L});
        public static final BitSet FOLLOW_21_in_ruleAxiom7107 = new BitSet(new long[]{0x0000000800000000L});
        public static final BitSet FOLLOW_ruleStringToAttributeMapEntry_in_ruleAxiom7128 = new BitSet(new long[]{0x0000000000420000L});
        public static final BitSet FOLLOW_17_in_ruleAxiom7141 = new BitSet(new long[]{0x0000000800000000L});
        public static final BitSet FOLLOW_ruleStringToAttributeMapEntry_in_ruleAxiom7162 = new BitSet(new long[]{0x0000000000420000L});
        public static final BitSet FOLLOW_22_in_ruleAxiom7176 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleParameter_in_entryRuleParameter7214 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleParameter7224 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_11_in_ruleParameter7276 = new BitSet(new long[]{0x8000000000000000L});
        public static final BitSet FOLLOW_63_in_ruleParameter7302 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleParameter7323 = new BitSet(new long[]{0x0000008001902002L});
        public static final BitSet FOLLOW_13_in_ruleParameter7336 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleParameter7357 = new BitSet(new long[]{0x0000008001900002L});
        public static final BitSet FOLLOW_39_in_ruleParameter7372 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleParameter7393 = new BitSet(new long[]{0x0000000001900002L});
        public static final BitSet FOLLOW_20_in_ruleParameter7408 = new BitSet(new long[]{0x0000000000200000L});
        public static final BitSet FOLLOW_21_in_ruleParameter7420 = new BitSet(new long[]{0x0000000040000000L});
        public static final BitSet FOLLOW_ruleAnnotation_in_ruleParameter7441 = new BitSet(new long[]{0x0000000000420000L});
        public static final BitSet FOLLOW_17_in_ruleParameter7454 = new BitSet(new long[]{0x0000000040000000L});
        public static final BitSet FOLLOW_ruleAnnotation_in_ruleParameter7475 = new BitSet(new long[]{0x0000000000420000L});
        public static final BitSet FOLLOW_22_in_ruleParameter7489 = new BitSet(new long[]{0x0000000001800002L});
        public static final BitSet FOLLOW_23_in_ruleParameter7504 = new BitSet(new long[]{0x0000000000200000L});
        public static final BitSet FOLLOW_21_in_ruleParameter7516 = new BitSet(new long[]{0x0080000000000800L});
        public static final BitSet FOLLOW_ruleAbstractExtension_in_ruleParameter7537 = new BitSet(new long[]{0x0000000000420000L});
        public static final BitSet FOLLOW_17_in_ruleParameter7550 = new BitSet(new long[]{0x0080000000000800L});
        public static final BitSet FOLLOW_ruleAbstractExtension_in_ruleParameter7571 = new BitSet(new long[]{0x0000000000420000L});
        public static final BitSet FOLLOW_22_in_ruleParameter7585 = new BitSet(new long[]{0x0000000001000002L});
        public static final BitSet FOLLOW_24_in_ruleParameter7600 = new BitSet(new long[]{0x0000000000200000L});
        public static final BitSet FOLLOW_21_in_ruleParameter7612 = new BitSet(new long[]{0x0000000800000000L});
        public static final BitSet FOLLOW_ruleStringToAttributeMapEntry_in_ruleParameter7633 = new BitSet(new long[]{0x0000000000420000L});
        public static final BitSet FOLLOW_17_in_ruleParameter7646 = new BitSet(new long[]{0x0000000800000000L});
        public static final BitSet FOLLOW_ruleStringToAttributeMapEntry_in_ruleParameter7667 = new BitSet(new long[]{0x0000000000420000L});
        public static final BitSet FOLLOW_22_in_ruleParameter7681 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleGuard_in_entryRuleGuard7719 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleGuard7729 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_64_in_ruleGuard7766 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleGuard7787 = new BitSet(new long[]{0x0000060000000800L});
        public static final BitSet FOLLOW_11_in_ruleGuard7805 = new BitSet(new long[]{0x0000060000000000L});
        public static final BitSet FOLLOW_41_in_ruleGuard7837 = new BitSet(new long[]{0x0000040000000000L});
        public static final BitSet FOLLOW_42_in_ruleGuard7863 = new BitSet(new long[]{0x0000088000002000L});
        public static final BitSet FOLLOW_13_in_ruleGuard7876 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleGuard7897 = new BitSet(new long[]{0x0000088000000000L});
        public static final BitSet FOLLOW_39_in_ruleGuard7912 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleGuard7933 = new BitSet(new long[]{0x0000080000000000L});
        public static final BitSet FOLLOW_43_in_ruleGuard7947 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleGuard7968 = new BitSet(new long[]{0x0000000001900002L});
        public static final BitSet FOLLOW_20_in_ruleGuard7981 = new BitSet(new long[]{0x0000000000200000L});
        public static final BitSet FOLLOW_21_in_ruleGuard7993 = new BitSet(new long[]{0x0000000040000000L});
        public static final BitSet FOLLOW_ruleAnnotation_in_ruleGuard8014 = new BitSet(new long[]{0x0000000000420000L});
        public static final BitSet FOLLOW_17_in_ruleGuard8027 = new BitSet(new long[]{0x0000000040000000L});
        public static final BitSet FOLLOW_ruleAnnotation_in_ruleGuard8048 = new BitSet(new long[]{0x0000000000420000L});
        public static final BitSet FOLLOW_22_in_ruleGuard8062 = new BitSet(new long[]{0x0000000001800002L});
        public static final BitSet FOLLOW_23_in_ruleGuard8077 = new BitSet(new long[]{0x0000000000200000L});
        public static final BitSet FOLLOW_21_in_ruleGuard8089 = new BitSet(new long[]{0x0080000000000800L});
        public static final BitSet FOLLOW_ruleAbstractExtension_in_ruleGuard8110 = new BitSet(new long[]{0x0000000000420000L});
        public static final BitSet FOLLOW_17_in_ruleGuard8123 = new BitSet(new long[]{0x0080000000000800L});
        public static final BitSet FOLLOW_ruleAbstractExtension_in_ruleGuard8144 = new BitSet(new long[]{0x0000000000420000L});
        public static final BitSet FOLLOW_22_in_ruleGuard8158 = new BitSet(new long[]{0x0000000001000002L});
        public static final BitSet FOLLOW_24_in_ruleGuard8173 = new BitSet(new long[]{0x0000000000200000L});
        public static final BitSet FOLLOW_21_in_ruleGuard8185 = new BitSet(new long[]{0x0000000800000000L});
        public static final BitSet FOLLOW_ruleStringToAttributeMapEntry_in_ruleGuard8206 = new BitSet(new long[]{0x0000000000420000L});
        public static final BitSet FOLLOW_17_in_ruleGuard8219 = new BitSet(new long[]{0x0000000800000000L});
        public static final BitSet FOLLOW_ruleStringToAttributeMapEntry_in_ruleGuard8240 = new BitSet(new long[]{0x0000000000420000L});
        public static final BitSet FOLLOW_22_in_ruleGuard8254 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleWitness_in_entryRuleWitness8292 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleWitness8302 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_11_in_ruleWitness8345 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
        public static final BitSet FOLLOW_65_in_ruleWitness8371 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleWitness8392 = new BitSet(new long[]{0x0000008000002000L,0x0000000000000004L});
        public static final BitSet FOLLOW_13_in_ruleWitness8405 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleWitness8426 = new BitSet(new long[]{0x0000008000000000L,0x0000000000000004L});
        public static final BitSet FOLLOW_39_in_ruleWitness8441 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleWitness8462 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000004L});
        public static final BitSet FOLLOW_66_in_ruleWitness8476 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleWitness8497 = new BitSet(new long[]{0x0000000001900002L});
        public static final BitSet FOLLOW_20_in_ruleWitness8510 = new BitSet(new long[]{0x0000000000200000L});
        public static final BitSet FOLLOW_21_in_ruleWitness8522 = new BitSet(new long[]{0x0000000040000000L});
        public static final BitSet FOLLOW_ruleAnnotation_in_ruleWitness8543 = new BitSet(new long[]{0x0000000000420000L});
        public static final BitSet FOLLOW_17_in_ruleWitness8556 = new BitSet(new long[]{0x0000000040000000L});
        public static final BitSet FOLLOW_ruleAnnotation_in_ruleWitness8577 = new BitSet(new long[]{0x0000000000420000L});
        public static final BitSet FOLLOW_22_in_ruleWitness8591 = new BitSet(new long[]{0x0000000001800002L});
        public static final BitSet FOLLOW_23_in_ruleWitness8606 = new BitSet(new long[]{0x0000000000200000L});
        public static final BitSet FOLLOW_21_in_ruleWitness8618 = new BitSet(new long[]{0x0080000000000800L});
        public static final BitSet FOLLOW_ruleAbstractExtension_in_ruleWitness8639 = new BitSet(new long[]{0x0000000000420000L});
        public static final BitSet FOLLOW_17_in_ruleWitness8652 = new BitSet(new long[]{0x0080000000000800L});
        public static final BitSet FOLLOW_ruleAbstractExtension_in_ruleWitness8673 = new BitSet(new long[]{0x0000000000420000L});
        public static final BitSet FOLLOW_22_in_ruleWitness8687 = new BitSet(new long[]{0x0000000001000002L});
        public static final BitSet FOLLOW_24_in_ruleWitness8702 = new BitSet(new long[]{0x0000000000200000L});
        public static final BitSet FOLLOW_21_in_ruleWitness8714 = new BitSet(new long[]{0x0000000800000000L});
        public static final BitSet FOLLOW_ruleStringToAttributeMapEntry_in_ruleWitness8735 = new BitSet(new long[]{0x0000000000420000L});
        public static final BitSet FOLLOW_17_in_ruleWitness8748 = new BitSet(new long[]{0x0000000800000000L});
        public static final BitSet FOLLOW_ruleStringToAttributeMapEntry_in_ruleWitness8769 = new BitSet(new long[]{0x0000000000420000L});
        public static final BitSet FOLLOW_22_in_ruleWitness8783 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAction_in_entryRuleAction8821 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleAction8831 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_11_in_ruleAction8874 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000008L});
        public static final BitSet FOLLOW_67_in_ruleAction8900 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleAction8921 = new BitSet(new long[]{0x0000008000002000L,0x0000000000000008L});
        public static final BitSet FOLLOW_13_in_ruleAction8934 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleAction8955 = new BitSet(new long[]{0x0000008000000000L,0x0000000000000008L});
        public static final BitSet FOLLOW_39_in_ruleAction8970 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleAction8991 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000008L});
        public static final BitSet FOLLOW_67_in_ruleAction9005 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleAction9026 = new BitSet(new long[]{0x0000000001900002L});
        public static final BitSet FOLLOW_20_in_ruleAction9039 = new BitSet(new long[]{0x0000000000200000L});
        public static final BitSet FOLLOW_21_in_ruleAction9051 = new BitSet(new long[]{0x0000000040000000L});
        public static final BitSet FOLLOW_ruleAnnotation_in_ruleAction9072 = new BitSet(new long[]{0x0000000000420000L});
        public static final BitSet FOLLOW_17_in_ruleAction9085 = new BitSet(new long[]{0x0000000040000000L});
        public static final BitSet FOLLOW_ruleAnnotation_in_ruleAction9106 = new BitSet(new long[]{0x0000000000420000L});
        public static final BitSet FOLLOW_22_in_ruleAction9120 = new BitSet(new long[]{0x0000000001800002L});
        public static final BitSet FOLLOW_23_in_ruleAction9135 = new BitSet(new long[]{0x0000000000200000L});
        public static final BitSet FOLLOW_21_in_ruleAction9147 = new BitSet(new long[]{0x0080000000000800L});
        public static final BitSet FOLLOW_ruleAbstractExtension_in_ruleAction9168 = new BitSet(new long[]{0x0000000000420000L});
        public static final BitSet FOLLOW_17_in_ruleAction9181 = new BitSet(new long[]{0x0080000000000800L});
        public static final BitSet FOLLOW_ruleAbstractExtension_in_ruleAction9202 = new BitSet(new long[]{0x0000000000420000L});
        public static final BitSet FOLLOW_22_in_ruleAction9216 = new BitSet(new long[]{0x0000000001000002L});
        public static final BitSet FOLLOW_24_in_ruleAction9231 = new BitSet(new long[]{0x0000000000200000L});
        public static final BitSet FOLLOW_21_in_ruleAction9243 = new BitSet(new long[]{0x0000000800000000L});
        public static final BitSet FOLLOW_ruleStringToAttributeMapEntry_in_ruleAction9264 = new BitSet(new long[]{0x0000000000420000L});
        public static final BitSet FOLLOW_17_in_ruleAction9277 = new BitSet(new long[]{0x0000000800000000L});
        public static final BitSet FOLLOW_ruleStringToAttributeMapEntry_in_ruleAction9298 = new BitSet(new long[]{0x0000000000420000L});
        public static final BitSet FOLLOW_22_in_ruleAction9312 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_68_in_ruleAttributeType9364 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_69_in_ruleAttributeType9381 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_70_in_ruleAttributeType9398 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_71_in_ruleAttributeType9415 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_72_in_ruleAttributeType9432 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_73_in_ruleConvergence9477 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_74_in_ruleConvergence9494 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_75_in_ruleConvergence9511 = new BitSet(new long[]{0x0000000000000002L});
    }


}