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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'localGenerated'", "'Machine'", "'{'", "'internalId'", "'comment'", "'refines'", "'('", "','", "')'", "'sees'", "'annotations'", "'}'", "'extensions'", "'attributes'", "'variables'", "'invariants'", "'variant'", "'events'", "'Annotation'", "'source'", "'references'", "'details'", "'contents'", "'StringToAttributeMapEntry'", "'key'", "'value'", "'Variable'", "'theorem'", "'Invariant'", "'predicate'", "'Variant'", "'expression'", "'extended'", "'Event'", "'convergence'", "'parameters'", "'guards'", "'witnesses'", "'actions'", "'StringToStringMapEntry'", "'EObject'", "'Extension'", "'extensionId'", "'Attribute'", "'type'", "'EJavaObject'", "'CarrierSet'", "'Constant'", "'Axiom'", "'Parameter'", "'Guard'", "'Witness'", "'Action'", "'action'", "'Boolean'", "'Handle'", "'Integer'", "'Long'", "'String'", "'ordinary'", "'convergent'", "'anticipated'"
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
    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:77:1: ruleMachine returns [EObject current=null] : ( () ( (lv_localGenerated_1_0= 'localGenerated' ) )? otherlv_2= 'Machine' ( (lv_name_3_0= ruleEString ) ) otherlv_4= '{' (otherlv_5= 'internalId' ( (lv_internalId_6_0= ruleEString ) ) )? (otherlv_7= 'comment' ( (lv_comment_8_0= ruleEString ) ) )? (otherlv_9= 'refines' otherlv_10= '(' ( ( ruleEString ) ) (otherlv_12= ',' ( ( ruleEString ) ) )* otherlv_14= ')' )? (otherlv_15= 'sees' otherlv_16= '(' ( ( ruleEString ) ) (otherlv_18= ',' ( ( ruleEString ) ) )* otherlv_20= ')' )? (otherlv_21= 'annotations' otherlv_22= '{' ( (lv_annotations_23_0= ruleAnnotation ) ) (otherlv_24= ',' ( (lv_annotations_25_0= ruleAnnotation ) ) )* otherlv_26= '}' )? (otherlv_27= 'extensions' otherlv_28= '{' ( (lv_extensions_29_0= ruleAbstractExtension ) ) (otherlv_30= ',' ( (lv_extensions_31_0= ruleAbstractExtension ) ) )* otherlv_32= '}' )? (otherlv_33= 'attributes' otherlv_34= '{' ( (lv_attributes_35_0= ruleStringToAttributeMapEntry ) ) (otherlv_36= ',' ( (lv_attributes_37_0= ruleStringToAttributeMapEntry ) ) )* otherlv_38= '}' )? (otherlv_39= 'variables' otherlv_40= '{' ( (lv_variables_41_0= ruleVariable ) ) (otherlv_42= ',' ( (lv_variables_43_0= ruleVariable ) ) )* otherlv_44= '}' )? (otherlv_45= 'invariants' otherlv_46= '{' ( (lv_invariants_47_0= ruleInvariant ) ) (otherlv_48= ',' ( (lv_invariants_49_0= ruleInvariant ) ) )* otherlv_50= '}' )? (otherlv_51= 'variant' ( (lv_variant_52_0= ruleVariant ) ) )? (otherlv_53= 'events' otherlv_54= '{' ( (lv_events_55_0= ruleEvent ) ) (otherlv_56= ',' ( (lv_events_57_0= ruleEvent ) ) )* otherlv_58= '}' )? otherlv_59= '}' ) ;
    public final EObject ruleMachine() throws RecognitionException {
        EObject current = null;

        Token lv_localGenerated_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
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
        Token otherlv_27=null;
        Token otherlv_28=null;
        Token otherlv_30=null;
        Token otherlv_32=null;
        Token otherlv_33=null;
        Token otherlv_34=null;
        Token otherlv_36=null;
        Token otherlv_38=null;
        Token otherlv_39=null;
        Token otherlv_40=null;
        Token otherlv_42=null;
        Token otherlv_44=null;
        Token otherlv_45=null;
        Token otherlv_46=null;
        Token otherlv_48=null;
        Token otherlv_50=null;
        Token otherlv_51=null;
        Token otherlv_53=null;
        Token otherlv_54=null;
        Token otherlv_56=null;
        Token otherlv_58=null;
        Token otherlv_59=null;
        AntlrDatatypeRuleToken lv_name_3_0 = null;

        AntlrDatatypeRuleToken lv_internalId_6_0 = null;

        AntlrDatatypeRuleToken lv_comment_8_0 = null;

        EObject lv_annotations_23_0 = null;

        EObject lv_annotations_25_0 = null;

        EObject lv_extensions_29_0 = null;

        EObject lv_extensions_31_0 = null;

        EObject lv_attributes_35_0 = null;

        EObject lv_attributes_37_0 = null;

        EObject lv_variables_41_0 = null;

        EObject lv_variables_43_0 = null;

        EObject lv_invariants_47_0 = null;

        EObject lv_invariants_49_0 = null;

        EObject lv_variant_52_0 = null;

        EObject lv_events_55_0 = null;

        EObject lv_events_57_0 = null;


         enterRule(); 
            
        try {
            // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:80:28: ( ( () ( (lv_localGenerated_1_0= 'localGenerated' ) )? otherlv_2= 'Machine' ( (lv_name_3_0= ruleEString ) ) otherlv_4= '{' (otherlv_5= 'internalId' ( (lv_internalId_6_0= ruleEString ) ) )? (otherlv_7= 'comment' ( (lv_comment_8_0= ruleEString ) ) )? (otherlv_9= 'refines' otherlv_10= '(' ( ( ruleEString ) ) (otherlv_12= ',' ( ( ruleEString ) ) )* otherlv_14= ')' )? (otherlv_15= 'sees' otherlv_16= '(' ( ( ruleEString ) ) (otherlv_18= ',' ( ( ruleEString ) ) )* otherlv_20= ')' )? (otherlv_21= 'annotations' otherlv_22= '{' ( (lv_annotations_23_0= ruleAnnotation ) ) (otherlv_24= ',' ( (lv_annotations_25_0= ruleAnnotation ) ) )* otherlv_26= '}' )? (otherlv_27= 'extensions' otherlv_28= '{' ( (lv_extensions_29_0= ruleAbstractExtension ) ) (otherlv_30= ',' ( (lv_extensions_31_0= ruleAbstractExtension ) ) )* otherlv_32= '}' )? (otherlv_33= 'attributes' otherlv_34= '{' ( (lv_attributes_35_0= ruleStringToAttributeMapEntry ) ) (otherlv_36= ',' ( (lv_attributes_37_0= ruleStringToAttributeMapEntry ) ) )* otherlv_38= '}' )? (otherlv_39= 'variables' otherlv_40= '{' ( (lv_variables_41_0= ruleVariable ) ) (otherlv_42= ',' ( (lv_variables_43_0= ruleVariable ) ) )* otherlv_44= '}' )? (otherlv_45= 'invariants' otherlv_46= '{' ( (lv_invariants_47_0= ruleInvariant ) ) (otherlv_48= ',' ( (lv_invariants_49_0= ruleInvariant ) ) )* otherlv_50= '}' )? (otherlv_51= 'variant' ( (lv_variant_52_0= ruleVariant ) ) )? (otherlv_53= 'events' otherlv_54= '{' ( (lv_events_55_0= ruleEvent ) ) (otherlv_56= ',' ( (lv_events_57_0= ruleEvent ) ) )* otherlv_58= '}' )? otherlv_59= '}' ) )
            // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:81:1: ( () ( (lv_localGenerated_1_0= 'localGenerated' ) )? otherlv_2= 'Machine' ( (lv_name_3_0= ruleEString ) ) otherlv_4= '{' (otherlv_5= 'internalId' ( (lv_internalId_6_0= ruleEString ) ) )? (otherlv_7= 'comment' ( (lv_comment_8_0= ruleEString ) ) )? (otherlv_9= 'refines' otherlv_10= '(' ( ( ruleEString ) ) (otherlv_12= ',' ( ( ruleEString ) ) )* otherlv_14= ')' )? (otherlv_15= 'sees' otherlv_16= '(' ( ( ruleEString ) ) (otherlv_18= ',' ( ( ruleEString ) ) )* otherlv_20= ')' )? (otherlv_21= 'annotations' otherlv_22= '{' ( (lv_annotations_23_0= ruleAnnotation ) ) (otherlv_24= ',' ( (lv_annotations_25_0= ruleAnnotation ) ) )* otherlv_26= '}' )? (otherlv_27= 'extensions' otherlv_28= '{' ( (lv_extensions_29_0= ruleAbstractExtension ) ) (otherlv_30= ',' ( (lv_extensions_31_0= ruleAbstractExtension ) ) )* otherlv_32= '}' )? (otherlv_33= 'attributes' otherlv_34= '{' ( (lv_attributes_35_0= ruleStringToAttributeMapEntry ) ) (otherlv_36= ',' ( (lv_attributes_37_0= ruleStringToAttributeMapEntry ) ) )* otherlv_38= '}' )? (otherlv_39= 'variables' otherlv_40= '{' ( (lv_variables_41_0= ruleVariable ) ) (otherlv_42= ',' ( (lv_variables_43_0= ruleVariable ) ) )* otherlv_44= '}' )? (otherlv_45= 'invariants' otherlv_46= '{' ( (lv_invariants_47_0= ruleInvariant ) ) (otherlv_48= ',' ( (lv_invariants_49_0= ruleInvariant ) ) )* otherlv_50= '}' )? (otherlv_51= 'variant' ( (lv_variant_52_0= ruleVariant ) ) )? (otherlv_53= 'events' otherlv_54= '{' ( (lv_events_55_0= ruleEvent ) ) (otherlv_56= ',' ( (lv_events_57_0= ruleEvent ) ) )* otherlv_58= '}' )? otherlv_59= '}' )
            {
            // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:81:1: ( () ( (lv_localGenerated_1_0= 'localGenerated' ) )? otherlv_2= 'Machine' ( (lv_name_3_0= ruleEString ) ) otherlv_4= '{' (otherlv_5= 'internalId' ( (lv_internalId_6_0= ruleEString ) ) )? (otherlv_7= 'comment' ( (lv_comment_8_0= ruleEString ) ) )? (otherlv_9= 'refines' otherlv_10= '(' ( ( ruleEString ) ) (otherlv_12= ',' ( ( ruleEString ) ) )* otherlv_14= ')' )? (otherlv_15= 'sees' otherlv_16= '(' ( ( ruleEString ) ) (otherlv_18= ',' ( ( ruleEString ) ) )* otherlv_20= ')' )? (otherlv_21= 'annotations' otherlv_22= '{' ( (lv_annotations_23_0= ruleAnnotation ) ) (otherlv_24= ',' ( (lv_annotations_25_0= ruleAnnotation ) ) )* otherlv_26= '}' )? (otherlv_27= 'extensions' otherlv_28= '{' ( (lv_extensions_29_0= ruleAbstractExtension ) ) (otherlv_30= ',' ( (lv_extensions_31_0= ruleAbstractExtension ) ) )* otherlv_32= '}' )? (otherlv_33= 'attributes' otherlv_34= '{' ( (lv_attributes_35_0= ruleStringToAttributeMapEntry ) ) (otherlv_36= ',' ( (lv_attributes_37_0= ruleStringToAttributeMapEntry ) ) )* otherlv_38= '}' )? (otherlv_39= 'variables' otherlv_40= '{' ( (lv_variables_41_0= ruleVariable ) ) (otherlv_42= ',' ( (lv_variables_43_0= ruleVariable ) ) )* otherlv_44= '}' )? (otherlv_45= 'invariants' otherlv_46= '{' ( (lv_invariants_47_0= ruleInvariant ) ) (otherlv_48= ',' ( (lv_invariants_49_0= ruleInvariant ) ) )* otherlv_50= '}' )? (otherlv_51= 'variant' ( (lv_variant_52_0= ruleVariant ) ) )? (otherlv_53= 'events' otherlv_54= '{' ( (lv_events_55_0= ruleEvent ) ) (otherlv_56= ',' ( (lv_events_57_0= ruleEvent ) ) )* otherlv_58= '}' )? otherlv_59= '}' )
            // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:81:2: () ( (lv_localGenerated_1_0= 'localGenerated' ) )? otherlv_2= 'Machine' ( (lv_name_3_0= ruleEString ) ) otherlv_4= '{' (otherlv_5= 'internalId' ( (lv_internalId_6_0= ruleEString ) ) )? (otherlv_7= 'comment' ( (lv_comment_8_0= ruleEString ) ) )? (otherlv_9= 'refines' otherlv_10= '(' ( ( ruleEString ) ) (otherlv_12= ',' ( ( ruleEString ) ) )* otherlv_14= ')' )? (otherlv_15= 'sees' otherlv_16= '(' ( ( ruleEString ) ) (otherlv_18= ',' ( ( ruleEString ) ) )* otherlv_20= ')' )? (otherlv_21= 'annotations' otherlv_22= '{' ( (lv_annotations_23_0= ruleAnnotation ) ) (otherlv_24= ',' ( (lv_annotations_25_0= ruleAnnotation ) ) )* otherlv_26= '}' )? (otherlv_27= 'extensions' otherlv_28= '{' ( (lv_extensions_29_0= ruleAbstractExtension ) ) (otherlv_30= ',' ( (lv_extensions_31_0= ruleAbstractExtension ) ) )* otherlv_32= '}' )? (otherlv_33= 'attributes' otherlv_34= '{' ( (lv_attributes_35_0= ruleStringToAttributeMapEntry ) ) (otherlv_36= ',' ( (lv_attributes_37_0= ruleStringToAttributeMapEntry ) ) )* otherlv_38= '}' )? (otherlv_39= 'variables' otherlv_40= '{' ( (lv_variables_41_0= ruleVariable ) ) (otherlv_42= ',' ( (lv_variables_43_0= ruleVariable ) ) )* otherlv_44= '}' )? (otherlv_45= 'invariants' otherlv_46= '{' ( (lv_invariants_47_0= ruleInvariant ) ) (otherlv_48= ',' ( (lv_invariants_49_0= ruleInvariant ) ) )* otherlv_50= '}' )? (otherlv_51= 'variant' ( (lv_variant_52_0= ruleVariant ) ) )? (otherlv_53= 'events' otherlv_54= '{' ( (lv_events_55_0= ruleEvent ) ) (otherlv_56= ',' ( (lv_events_57_0= ruleEvent ) ) )* otherlv_58= '}' )? otherlv_59= '}'
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

            otherlv_4=(Token)match(input,13,FollowSets000.FOLLOW_13_in_ruleMachine196); 

                	newLeafNode(otherlv_4, grammarAccess.getMachineAccess().getLeftCurlyBracketKeyword_4());
                
            // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:128:1: (otherlv_5= 'internalId' ( (lv_internalId_6_0= ruleEString ) ) )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==14) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:128:3: otherlv_5= 'internalId' ( (lv_internalId_6_0= ruleEString ) )
                    {
                    otherlv_5=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleMachine209); 

                        	newLeafNode(otherlv_5, grammarAccess.getMachineAccess().getInternalIdKeyword_5_0());
                        
                    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:132:1: ( (lv_internalId_6_0= ruleEString ) )
                    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:133:1: (lv_internalId_6_0= ruleEString )
                    {
                    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:133:1: (lv_internalId_6_0= ruleEString )
                    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:134:3: lv_internalId_6_0= ruleEString
                    {
                     
                    	        newCompositeNode(grammarAccess.getMachineAccess().getInternalIdEStringParserRuleCall_5_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleMachine230);
                    lv_internalId_6_0=ruleEString();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getMachineRule());
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

            // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:150:4: (otherlv_7= 'comment' ( (lv_comment_8_0= ruleEString ) ) )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==15) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:150:6: otherlv_7= 'comment' ( (lv_comment_8_0= ruleEString ) )
                    {
                    otherlv_7=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleMachine245); 

                        	newLeafNode(otherlv_7, grammarAccess.getMachineAccess().getCommentKeyword_6_0());
                        
                    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:154:1: ( (lv_comment_8_0= ruleEString ) )
                    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:155:1: (lv_comment_8_0= ruleEString )
                    {
                    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:155:1: (lv_comment_8_0= ruleEString )
                    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:156:3: lv_comment_8_0= ruleEString
                    {
                     
                    	        newCompositeNode(grammarAccess.getMachineAccess().getCommentEStringParserRuleCall_6_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleMachine266);
                    lv_comment_8_0=ruleEString();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getMachineRule());
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

            // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:172:4: (otherlv_9= 'refines' otherlv_10= '(' ( ( ruleEString ) ) (otherlv_12= ',' ( ( ruleEString ) ) )* otherlv_14= ')' )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==16) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:172:6: otherlv_9= 'refines' otherlv_10= '(' ( ( ruleEString ) ) (otherlv_12= ',' ( ( ruleEString ) ) )* otherlv_14= ')'
                    {
                    otherlv_9=(Token)match(input,16,FollowSets000.FOLLOW_16_in_ruleMachine281); 

                        	newLeafNode(otherlv_9, grammarAccess.getMachineAccess().getRefinesKeyword_7_0());
                        
                    otherlv_10=(Token)match(input,17,FollowSets000.FOLLOW_17_in_ruleMachine293); 

                        	newLeafNode(otherlv_10, grammarAccess.getMachineAccess().getLeftParenthesisKeyword_7_1());
                        
                    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:180:1: ( ( ruleEString ) )
                    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:181:1: ( ruleEString )
                    {
                    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:181:1: ( ruleEString )
                    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:182:3: ruleEString
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getMachineRule());
                    	        }
                            
                     
                    	        newCompositeNode(grammarAccess.getMachineAccess().getRefinesMachineCrossReference_7_2_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleMachine316);
                    ruleEString();

                    state._fsp--;

                     
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:195:2: (otherlv_12= ',' ( ( ruleEString ) ) )*
                    loop4:
                    do {
                        int alt4=2;
                        int LA4_0 = input.LA(1);

                        if ( (LA4_0==18) ) {
                            alt4=1;
                        }


                        switch (alt4) {
                    	case 1 :
                    	    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:195:4: otherlv_12= ',' ( ( ruleEString ) )
                    	    {
                    	    otherlv_12=(Token)match(input,18,FollowSets000.FOLLOW_18_in_ruleMachine329); 

                    	        	newLeafNode(otherlv_12, grammarAccess.getMachineAccess().getCommaKeyword_7_3_0());
                    	        
                    	    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:199:1: ( ( ruleEString ) )
                    	    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:200:1: ( ruleEString )
                    	    {
                    	    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:200:1: ( ruleEString )
                    	    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:201:3: ruleEString
                    	    {

                    	    			if (current==null) {
                    	    	            current = createModelElement(grammarAccess.getMachineRule());
                    	    	        }
                    	            
                    	     
                    	    	        newCompositeNode(grammarAccess.getMachineAccess().getRefinesMachineCrossReference_7_3_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleMachine352);
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

                    otherlv_14=(Token)match(input,19,FollowSets000.FOLLOW_19_in_ruleMachine366); 

                        	newLeafNode(otherlv_14, grammarAccess.getMachineAccess().getRightParenthesisKeyword_7_4());
                        

                    }
                    break;

            }

            // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:218:3: (otherlv_15= 'sees' otherlv_16= '(' ( ( ruleEString ) ) (otherlv_18= ',' ( ( ruleEString ) ) )* otherlv_20= ')' )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==20) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:218:5: otherlv_15= 'sees' otherlv_16= '(' ( ( ruleEString ) ) (otherlv_18= ',' ( ( ruleEString ) ) )* otherlv_20= ')'
                    {
                    otherlv_15=(Token)match(input,20,FollowSets000.FOLLOW_20_in_ruleMachine381); 

                        	newLeafNode(otherlv_15, grammarAccess.getMachineAccess().getSeesKeyword_8_0());
                        
                    otherlv_16=(Token)match(input,17,FollowSets000.FOLLOW_17_in_ruleMachine393); 

                        	newLeafNode(otherlv_16, grammarAccess.getMachineAccess().getLeftParenthesisKeyword_8_1());
                        
                    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:226:1: ( ( ruleEString ) )
                    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:227:1: ( ruleEString )
                    {
                    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:227:1: ( ruleEString )
                    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:228:3: ruleEString
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getMachineRule());
                    	        }
                            
                     
                    	        newCompositeNode(grammarAccess.getMachineAccess().getSeesContextCrossReference_8_2_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleMachine416);
                    ruleEString();

                    state._fsp--;

                     
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:241:2: (otherlv_18= ',' ( ( ruleEString ) ) )*
                    loop6:
                    do {
                        int alt6=2;
                        int LA6_0 = input.LA(1);

                        if ( (LA6_0==18) ) {
                            alt6=1;
                        }


                        switch (alt6) {
                    	case 1 :
                    	    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:241:4: otherlv_18= ',' ( ( ruleEString ) )
                    	    {
                    	    otherlv_18=(Token)match(input,18,FollowSets000.FOLLOW_18_in_ruleMachine429); 

                    	        	newLeafNode(otherlv_18, grammarAccess.getMachineAccess().getCommaKeyword_8_3_0());
                    	        
                    	    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:245:1: ( ( ruleEString ) )
                    	    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:246:1: ( ruleEString )
                    	    {
                    	    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:246:1: ( ruleEString )
                    	    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:247:3: ruleEString
                    	    {

                    	    			if (current==null) {
                    	    	            current = createModelElement(grammarAccess.getMachineRule());
                    	    	        }
                    	            
                    	     
                    	    	        newCompositeNode(grammarAccess.getMachineAccess().getSeesContextCrossReference_8_3_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleMachine452);
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

                    otherlv_20=(Token)match(input,19,FollowSets000.FOLLOW_19_in_ruleMachine466); 

                        	newLeafNode(otherlv_20, grammarAccess.getMachineAccess().getRightParenthesisKeyword_8_4());
                        

                    }
                    break;

            }

            // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:264:3: (otherlv_21= 'annotations' otherlv_22= '{' ( (lv_annotations_23_0= ruleAnnotation ) ) (otherlv_24= ',' ( (lv_annotations_25_0= ruleAnnotation ) ) )* otherlv_26= '}' )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==21) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:264:5: otherlv_21= 'annotations' otherlv_22= '{' ( (lv_annotations_23_0= ruleAnnotation ) ) (otherlv_24= ',' ( (lv_annotations_25_0= ruleAnnotation ) ) )* otherlv_26= '}'
                    {
                    otherlv_21=(Token)match(input,21,FollowSets000.FOLLOW_21_in_ruleMachine481); 

                        	newLeafNode(otherlv_21, grammarAccess.getMachineAccess().getAnnotationsKeyword_9_0());
                        
                    otherlv_22=(Token)match(input,13,FollowSets000.FOLLOW_13_in_ruleMachine493); 

                        	newLeafNode(otherlv_22, grammarAccess.getMachineAccess().getLeftCurlyBracketKeyword_9_1());
                        
                    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:272:1: ( (lv_annotations_23_0= ruleAnnotation ) )
                    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:273:1: (lv_annotations_23_0= ruleAnnotation )
                    {
                    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:273:1: (lv_annotations_23_0= ruleAnnotation )
                    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:274:3: lv_annotations_23_0= ruleAnnotation
                    {
                     
                    	        newCompositeNode(grammarAccess.getMachineAccess().getAnnotationsAnnotationParserRuleCall_9_2_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleAnnotation_in_ruleMachine514);
                    lv_annotations_23_0=ruleAnnotation();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getMachineRule());
                    	        }
                           		add(
                           			current, 
                           			"annotations",
                            		lv_annotations_23_0, 
                            		"Annotation");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:290:2: (otherlv_24= ',' ( (lv_annotations_25_0= ruleAnnotation ) ) )*
                    loop8:
                    do {
                        int alt8=2;
                        int LA8_0 = input.LA(1);

                        if ( (LA8_0==18) ) {
                            alt8=1;
                        }


                        switch (alt8) {
                    	case 1 :
                    	    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:290:4: otherlv_24= ',' ( (lv_annotations_25_0= ruleAnnotation ) )
                    	    {
                    	    otherlv_24=(Token)match(input,18,FollowSets000.FOLLOW_18_in_ruleMachine527); 

                    	        	newLeafNode(otherlv_24, grammarAccess.getMachineAccess().getCommaKeyword_9_3_0());
                    	        
                    	    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:294:1: ( (lv_annotations_25_0= ruleAnnotation ) )
                    	    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:295:1: (lv_annotations_25_0= ruleAnnotation )
                    	    {
                    	    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:295:1: (lv_annotations_25_0= ruleAnnotation )
                    	    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:296:3: lv_annotations_25_0= ruleAnnotation
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getMachineAccess().getAnnotationsAnnotationParserRuleCall_9_3_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleAnnotation_in_ruleMachine548);
                    	    lv_annotations_25_0=ruleAnnotation();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getMachineRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"annotations",
                    	            		lv_annotations_25_0, 
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

                    otherlv_26=(Token)match(input,22,FollowSets000.FOLLOW_22_in_ruleMachine562); 

                        	newLeafNode(otherlv_26, grammarAccess.getMachineAccess().getRightCurlyBracketKeyword_9_4());
                        

                    }
                    break;

            }

            // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:316:3: (otherlv_27= 'extensions' otherlv_28= '{' ( (lv_extensions_29_0= ruleAbstractExtension ) ) (otherlv_30= ',' ( (lv_extensions_31_0= ruleAbstractExtension ) ) )* otherlv_32= '}' )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==23) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:316:5: otherlv_27= 'extensions' otherlv_28= '{' ( (lv_extensions_29_0= ruleAbstractExtension ) ) (otherlv_30= ',' ( (lv_extensions_31_0= ruleAbstractExtension ) ) )* otherlv_32= '}'
                    {
                    otherlv_27=(Token)match(input,23,FollowSets000.FOLLOW_23_in_ruleMachine577); 

                        	newLeafNode(otherlv_27, grammarAccess.getMachineAccess().getExtensionsKeyword_10_0());
                        
                    otherlv_28=(Token)match(input,13,FollowSets000.FOLLOW_13_in_ruleMachine589); 

                        	newLeafNode(otherlv_28, grammarAccess.getMachineAccess().getLeftCurlyBracketKeyword_10_1());
                        
                    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:324:1: ( (lv_extensions_29_0= ruleAbstractExtension ) )
                    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:325:1: (lv_extensions_29_0= ruleAbstractExtension )
                    {
                    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:325:1: (lv_extensions_29_0= ruleAbstractExtension )
                    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:326:3: lv_extensions_29_0= ruleAbstractExtension
                    {
                     
                    	        newCompositeNode(grammarAccess.getMachineAccess().getExtensionsAbstractExtensionParserRuleCall_10_2_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleAbstractExtension_in_ruleMachine610);
                    lv_extensions_29_0=ruleAbstractExtension();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getMachineRule());
                    	        }
                           		add(
                           			current, 
                           			"extensions",
                            		lv_extensions_29_0, 
                            		"AbstractExtension");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:342:2: (otherlv_30= ',' ( (lv_extensions_31_0= ruleAbstractExtension ) ) )*
                    loop10:
                    do {
                        int alt10=2;
                        int LA10_0 = input.LA(1);

                        if ( (LA10_0==18) ) {
                            alt10=1;
                        }


                        switch (alt10) {
                    	case 1 :
                    	    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:342:4: otherlv_30= ',' ( (lv_extensions_31_0= ruleAbstractExtension ) )
                    	    {
                    	    otherlv_30=(Token)match(input,18,FollowSets000.FOLLOW_18_in_ruleMachine623); 

                    	        	newLeafNode(otherlv_30, grammarAccess.getMachineAccess().getCommaKeyword_10_3_0());
                    	        
                    	    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:346:1: ( (lv_extensions_31_0= ruleAbstractExtension ) )
                    	    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:347:1: (lv_extensions_31_0= ruleAbstractExtension )
                    	    {
                    	    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:347:1: (lv_extensions_31_0= ruleAbstractExtension )
                    	    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:348:3: lv_extensions_31_0= ruleAbstractExtension
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getMachineAccess().getExtensionsAbstractExtensionParserRuleCall_10_3_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleAbstractExtension_in_ruleMachine644);
                    	    lv_extensions_31_0=ruleAbstractExtension();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getMachineRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"extensions",
                    	            		lv_extensions_31_0, 
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

                    otherlv_32=(Token)match(input,22,FollowSets000.FOLLOW_22_in_ruleMachine658); 

                        	newLeafNode(otherlv_32, grammarAccess.getMachineAccess().getRightCurlyBracketKeyword_10_4());
                        

                    }
                    break;

            }

            // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:368:3: (otherlv_33= 'attributes' otherlv_34= '{' ( (lv_attributes_35_0= ruleStringToAttributeMapEntry ) ) (otherlv_36= ',' ( (lv_attributes_37_0= ruleStringToAttributeMapEntry ) ) )* otherlv_38= '}' )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==24) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:368:5: otherlv_33= 'attributes' otherlv_34= '{' ( (lv_attributes_35_0= ruleStringToAttributeMapEntry ) ) (otherlv_36= ',' ( (lv_attributes_37_0= ruleStringToAttributeMapEntry ) ) )* otherlv_38= '}'
                    {
                    otherlv_33=(Token)match(input,24,FollowSets000.FOLLOW_24_in_ruleMachine673); 

                        	newLeafNode(otherlv_33, grammarAccess.getMachineAccess().getAttributesKeyword_11_0());
                        
                    otherlv_34=(Token)match(input,13,FollowSets000.FOLLOW_13_in_ruleMachine685); 

                        	newLeafNode(otherlv_34, grammarAccess.getMachineAccess().getLeftCurlyBracketKeyword_11_1());
                        
                    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:376:1: ( (lv_attributes_35_0= ruleStringToAttributeMapEntry ) )
                    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:377:1: (lv_attributes_35_0= ruleStringToAttributeMapEntry )
                    {
                    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:377:1: (lv_attributes_35_0= ruleStringToAttributeMapEntry )
                    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:378:3: lv_attributes_35_0= ruleStringToAttributeMapEntry
                    {
                     
                    	        newCompositeNode(grammarAccess.getMachineAccess().getAttributesStringToAttributeMapEntryParserRuleCall_11_2_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleStringToAttributeMapEntry_in_ruleMachine706);
                    lv_attributes_35_0=ruleStringToAttributeMapEntry();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getMachineRule());
                    	        }
                           		add(
                           			current, 
                           			"attributes",
                            		lv_attributes_35_0, 
                            		"StringToAttributeMapEntry");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:394:2: (otherlv_36= ',' ( (lv_attributes_37_0= ruleStringToAttributeMapEntry ) ) )*
                    loop12:
                    do {
                        int alt12=2;
                        int LA12_0 = input.LA(1);

                        if ( (LA12_0==18) ) {
                            alt12=1;
                        }


                        switch (alt12) {
                    	case 1 :
                    	    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:394:4: otherlv_36= ',' ( (lv_attributes_37_0= ruleStringToAttributeMapEntry ) )
                    	    {
                    	    otherlv_36=(Token)match(input,18,FollowSets000.FOLLOW_18_in_ruleMachine719); 

                    	        	newLeafNode(otherlv_36, grammarAccess.getMachineAccess().getCommaKeyword_11_3_0());
                    	        
                    	    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:398:1: ( (lv_attributes_37_0= ruleStringToAttributeMapEntry ) )
                    	    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:399:1: (lv_attributes_37_0= ruleStringToAttributeMapEntry )
                    	    {
                    	    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:399:1: (lv_attributes_37_0= ruleStringToAttributeMapEntry )
                    	    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:400:3: lv_attributes_37_0= ruleStringToAttributeMapEntry
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getMachineAccess().getAttributesStringToAttributeMapEntryParserRuleCall_11_3_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleStringToAttributeMapEntry_in_ruleMachine740);
                    	    lv_attributes_37_0=ruleStringToAttributeMapEntry();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getMachineRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"attributes",
                    	            		lv_attributes_37_0, 
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

                    otherlv_38=(Token)match(input,22,FollowSets000.FOLLOW_22_in_ruleMachine754); 

                        	newLeafNode(otherlv_38, grammarAccess.getMachineAccess().getRightCurlyBracketKeyword_11_4());
                        

                    }
                    break;

            }

            // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:420:3: (otherlv_39= 'variables' otherlv_40= '{' ( (lv_variables_41_0= ruleVariable ) ) (otherlv_42= ',' ( (lv_variables_43_0= ruleVariable ) ) )* otherlv_44= '}' )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==25) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:420:5: otherlv_39= 'variables' otherlv_40= '{' ( (lv_variables_41_0= ruleVariable ) ) (otherlv_42= ',' ( (lv_variables_43_0= ruleVariable ) ) )* otherlv_44= '}'
                    {
                    otherlv_39=(Token)match(input,25,FollowSets000.FOLLOW_25_in_ruleMachine769); 

                        	newLeafNode(otherlv_39, grammarAccess.getMachineAccess().getVariablesKeyword_12_0());
                        
                    otherlv_40=(Token)match(input,13,FollowSets000.FOLLOW_13_in_ruleMachine781); 

                        	newLeafNode(otherlv_40, grammarAccess.getMachineAccess().getLeftCurlyBracketKeyword_12_1());
                        
                    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:428:1: ( (lv_variables_41_0= ruleVariable ) )
                    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:429:1: (lv_variables_41_0= ruleVariable )
                    {
                    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:429:1: (lv_variables_41_0= ruleVariable )
                    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:430:3: lv_variables_41_0= ruleVariable
                    {
                     
                    	        newCompositeNode(grammarAccess.getMachineAccess().getVariablesVariableParserRuleCall_12_2_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleVariable_in_ruleMachine802);
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

                    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:446:2: (otherlv_42= ',' ( (lv_variables_43_0= ruleVariable ) ) )*
                    loop14:
                    do {
                        int alt14=2;
                        int LA14_0 = input.LA(1);

                        if ( (LA14_0==18) ) {
                            alt14=1;
                        }


                        switch (alt14) {
                    	case 1 :
                    	    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:446:4: otherlv_42= ',' ( (lv_variables_43_0= ruleVariable ) )
                    	    {
                    	    otherlv_42=(Token)match(input,18,FollowSets000.FOLLOW_18_in_ruleMachine815); 

                    	        	newLeafNode(otherlv_42, grammarAccess.getMachineAccess().getCommaKeyword_12_3_0());
                    	        
                    	    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:450:1: ( (lv_variables_43_0= ruleVariable ) )
                    	    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:451:1: (lv_variables_43_0= ruleVariable )
                    	    {
                    	    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:451:1: (lv_variables_43_0= ruleVariable )
                    	    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:452:3: lv_variables_43_0= ruleVariable
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getMachineAccess().getVariablesVariableParserRuleCall_12_3_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleVariable_in_ruleMachine836);
                    	    lv_variables_43_0=ruleVariable();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getMachineRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"variables",
                    	            		lv_variables_43_0, 
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

                    otherlv_44=(Token)match(input,22,FollowSets000.FOLLOW_22_in_ruleMachine850); 

                        	newLeafNode(otherlv_44, grammarAccess.getMachineAccess().getRightCurlyBracketKeyword_12_4());
                        

                    }
                    break;

            }

            // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:472:3: (otherlv_45= 'invariants' otherlv_46= '{' ( (lv_invariants_47_0= ruleInvariant ) ) (otherlv_48= ',' ( (lv_invariants_49_0= ruleInvariant ) ) )* otherlv_50= '}' )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==26) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:472:5: otherlv_45= 'invariants' otherlv_46= '{' ( (lv_invariants_47_0= ruleInvariant ) ) (otherlv_48= ',' ( (lv_invariants_49_0= ruleInvariant ) ) )* otherlv_50= '}'
                    {
                    otherlv_45=(Token)match(input,26,FollowSets000.FOLLOW_26_in_ruleMachine865); 

                        	newLeafNode(otherlv_45, grammarAccess.getMachineAccess().getInvariantsKeyword_13_0());
                        
                    otherlv_46=(Token)match(input,13,FollowSets000.FOLLOW_13_in_ruleMachine877); 

                        	newLeafNode(otherlv_46, grammarAccess.getMachineAccess().getLeftCurlyBracketKeyword_13_1());
                        
                    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:480:1: ( (lv_invariants_47_0= ruleInvariant ) )
                    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:481:1: (lv_invariants_47_0= ruleInvariant )
                    {
                    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:481:1: (lv_invariants_47_0= ruleInvariant )
                    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:482:3: lv_invariants_47_0= ruleInvariant
                    {
                     
                    	        newCompositeNode(grammarAccess.getMachineAccess().getInvariantsInvariantParserRuleCall_13_2_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleInvariant_in_ruleMachine898);
                    lv_invariants_47_0=ruleInvariant();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getMachineRule());
                    	        }
                           		add(
                           			current, 
                           			"invariants",
                            		lv_invariants_47_0, 
                            		"Invariant");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:498:2: (otherlv_48= ',' ( (lv_invariants_49_0= ruleInvariant ) ) )*
                    loop16:
                    do {
                        int alt16=2;
                        int LA16_0 = input.LA(1);

                        if ( (LA16_0==18) ) {
                            alt16=1;
                        }


                        switch (alt16) {
                    	case 1 :
                    	    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:498:4: otherlv_48= ',' ( (lv_invariants_49_0= ruleInvariant ) )
                    	    {
                    	    otherlv_48=(Token)match(input,18,FollowSets000.FOLLOW_18_in_ruleMachine911); 

                    	        	newLeafNode(otherlv_48, grammarAccess.getMachineAccess().getCommaKeyword_13_3_0());
                    	        
                    	    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:502:1: ( (lv_invariants_49_0= ruleInvariant ) )
                    	    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:503:1: (lv_invariants_49_0= ruleInvariant )
                    	    {
                    	    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:503:1: (lv_invariants_49_0= ruleInvariant )
                    	    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:504:3: lv_invariants_49_0= ruleInvariant
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getMachineAccess().getInvariantsInvariantParserRuleCall_13_3_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleInvariant_in_ruleMachine932);
                    	    lv_invariants_49_0=ruleInvariant();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getMachineRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"invariants",
                    	            		lv_invariants_49_0, 
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

                    otherlv_50=(Token)match(input,22,FollowSets000.FOLLOW_22_in_ruleMachine946); 

                        	newLeafNode(otherlv_50, grammarAccess.getMachineAccess().getRightCurlyBracketKeyword_13_4());
                        

                    }
                    break;

            }

            // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:524:3: (otherlv_51= 'variant' ( (lv_variant_52_0= ruleVariant ) ) )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==27) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:524:5: otherlv_51= 'variant' ( (lv_variant_52_0= ruleVariant ) )
                    {
                    otherlv_51=(Token)match(input,27,FollowSets000.FOLLOW_27_in_ruleMachine961); 

                        	newLeafNode(otherlv_51, grammarAccess.getMachineAccess().getVariantKeyword_14_0());
                        
                    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:528:1: ( (lv_variant_52_0= ruleVariant ) )
                    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:529:1: (lv_variant_52_0= ruleVariant )
                    {
                    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:529:1: (lv_variant_52_0= ruleVariant )
                    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:530:3: lv_variant_52_0= ruleVariant
                    {
                     
                    	        newCompositeNode(grammarAccess.getMachineAccess().getVariantVariantParserRuleCall_14_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleVariant_in_ruleMachine982);
                    lv_variant_52_0=ruleVariant();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getMachineRule());
                    	        }
                           		set(
                           			current, 
                           			"variant",
                            		lv_variant_52_0, 
                            		"Variant");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:546:4: (otherlv_53= 'events' otherlv_54= '{' ( (lv_events_55_0= ruleEvent ) ) (otherlv_56= ',' ( (lv_events_57_0= ruleEvent ) ) )* otherlv_58= '}' )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==28) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:546:6: otherlv_53= 'events' otherlv_54= '{' ( (lv_events_55_0= ruleEvent ) ) (otherlv_56= ',' ( (lv_events_57_0= ruleEvent ) ) )* otherlv_58= '}'
                    {
                    otherlv_53=(Token)match(input,28,FollowSets000.FOLLOW_28_in_ruleMachine997); 

                        	newLeafNode(otherlv_53, grammarAccess.getMachineAccess().getEventsKeyword_15_0());
                        
                    otherlv_54=(Token)match(input,13,FollowSets000.FOLLOW_13_in_ruleMachine1009); 

                        	newLeafNode(otherlv_54, grammarAccess.getMachineAccess().getLeftCurlyBracketKeyword_15_1());
                        
                    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:554:1: ( (lv_events_55_0= ruleEvent ) )
                    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:555:1: (lv_events_55_0= ruleEvent )
                    {
                    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:555:1: (lv_events_55_0= ruleEvent )
                    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:556:3: lv_events_55_0= ruleEvent
                    {
                     
                    	        newCompositeNode(grammarAccess.getMachineAccess().getEventsEventParserRuleCall_15_2_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEvent_in_ruleMachine1030);
                    lv_events_55_0=ruleEvent();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getMachineRule());
                    	        }
                           		add(
                           			current, 
                           			"events",
                            		lv_events_55_0, 
                            		"Event");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:572:2: (otherlv_56= ',' ( (lv_events_57_0= ruleEvent ) ) )*
                    loop19:
                    do {
                        int alt19=2;
                        int LA19_0 = input.LA(1);

                        if ( (LA19_0==18) ) {
                            alt19=1;
                        }


                        switch (alt19) {
                    	case 1 :
                    	    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:572:4: otherlv_56= ',' ( (lv_events_57_0= ruleEvent ) )
                    	    {
                    	    otherlv_56=(Token)match(input,18,FollowSets000.FOLLOW_18_in_ruleMachine1043); 

                    	        	newLeafNode(otherlv_56, grammarAccess.getMachineAccess().getCommaKeyword_15_3_0());
                    	        
                    	    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:576:1: ( (lv_events_57_0= ruleEvent ) )
                    	    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:577:1: (lv_events_57_0= ruleEvent )
                    	    {
                    	    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:577:1: (lv_events_57_0= ruleEvent )
                    	    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:578:3: lv_events_57_0= ruleEvent
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getMachineAccess().getEventsEventParserRuleCall_15_3_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleEvent_in_ruleMachine1064);
                    	    lv_events_57_0=ruleEvent();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getMachineRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"events",
                    	            		lv_events_57_0, 
                    	            		"Event");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop19;
                        }
                    } while (true);

                    otherlv_58=(Token)match(input,22,FollowSets000.FOLLOW_22_in_ruleMachine1078); 

                        	newLeafNode(otherlv_58, grammarAccess.getMachineAccess().getRightCurlyBracketKeyword_15_4());
                        

                    }
                    break;

            }

            otherlv_59=(Token)match(input,22,FollowSets000.FOLLOW_22_in_ruleMachine1092); 

                	newLeafNode(otherlv_59, grammarAccess.getMachineAccess().getRightCurlyBracketKeyword_16());
                

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
    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:610:1: entryRuleAbstractExtension returns [EObject current=null] : iv_ruleAbstractExtension= ruleAbstractExtension EOF ;
    public final EObject entryRuleAbstractExtension() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAbstractExtension = null;


        try {
            // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:611:2: (iv_ruleAbstractExtension= ruleAbstractExtension EOF )
            // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:612:2: iv_ruleAbstractExtension= ruleAbstractExtension EOF
            {
             newCompositeNode(grammarAccess.getAbstractExtensionRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleAbstractExtension_in_entryRuleAbstractExtension1128);
            iv_ruleAbstractExtension=ruleAbstractExtension();

            state._fsp--;

             current =iv_ruleAbstractExtension; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleAbstractExtension1138); 

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
    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:619:1: ruleAbstractExtension returns [EObject current=null] : this_Extension_0= ruleExtension ;
    public final EObject ruleAbstractExtension() throws RecognitionException {
        EObject current = null;

        EObject this_Extension_0 = null;


         enterRule(); 
            
        try {
            // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:622:28: (this_Extension_0= ruleExtension )
            // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:624:5: this_Extension_0= ruleExtension
            {
             
                    newCompositeNode(grammarAccess.getAbstractExtensionAccess().getExtensionParserRuleCall()); 
                
            pushFollow(FollowSets000.FOLLOW_ruleExtension_in_ruleAbstractExtension1184);
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
    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:640:1: entryRuleAnnotation returns [EObject current=null] : iv_ruleAnnotation= ruleAnnotation EOF ;
    public final EObject entryRuleAnnotation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAnnotation = null;


        try {
            // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:641:2: (iv_ruleAnnotation= ruleAnnotation EOF )
            // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:642:2: iv_ruleAnnotation= ruleAnnotation EOF
            {
             newCompositeNode(grammarAccess.getAnnotationRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleAnnotation_in_entryRuleAnnotation1218);
            iv_ruleAnnotation=ruleAnnotation();

            state._fsp--;

             current =iv_ruleAnnotation; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleAnnotation1228); 

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
    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:649:1: ruleAnnotation returns [EObject current=null] : ( () otherlv_1= 'Annotation' otherlv_2= '{' (otherlv_3= 'source' ( (lv_source_4_0= ruleEString ) ) )? (otherlv_5= 'references' otherlv_6= '(' ( ( ruleEString ) ) (otherlv_8= ',' ( ( ruleEString ) ) )* otherlv_10= ')' )? (otherlv_11= 'annotations' otherlv_12= '{' ( (lv_annotations_13_0= ruleAnnotation ) ) (otherlv_14= ',' ( (lv_annotations_15_0= ruleAnnotation ) ) )* otherlv_16= '}' )? (otherlv_17= 'details' otherlv_18= '{' ( (lv_details_19_0= ruleStringToStringMapEntry ) ) (otherlv_20= ',' ( (lv_details_21_0= ruleStringToStringMapEntry ) ) )* otherlv_22= '}' )? (otherlv_23= 'contents' otherlv_24= '{' ( (lv_contents_25_0= ruleEObject ) ) (otherlv_26= ',' ( (lv_contents_27_0= ruleEObject ) ) )* otherlv_28= '}' )? otherlv_29= '}' ) ;
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
            // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:652:28: ( ( () otherlv_1= 'Annotation' otherlv_2= '{' (otherlv_3= 'source' ( (lv_source_4_0= ruleEString ) ) )? (otherlv_5= 'references' otherlv_6= '(' ( ( ruleEString ) ) (otherlv_8= ',' ( ( ruleEString ) ) )* otherlv_10= ')' )? (otherlv_11= 'annotations' otherlv_12= '{' ( (lv_annotations_13_0= ruleAnnotation ) ) (otherlv_14= ',' ( (lv_annotations_15_0= ruleAnnotation ) ) )* otherlv_16= '}' )? (otherlv_17= 'details' otherlv_18= '{' ( (lv_details_19_0= ruleStringToStringMapEntry ) ) (otherlv_20= ',' ( (lv_details_21_0= ruleStringToStringMapEntry ) ) )* otherlv_22= '}' )? (otherlv_23= 'contents' otherlv_24= '{' ( (lv_contents_25_0= ruleEObject ) ) (otherlv_26= ',' ( (lv_contents_27_0= ruleEObject ) ) )* otherlv_28= '}' )? otherlv_29= '}' ) )
            // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:653:1: ( () otherlv_1= 'Annotation' otherlv_2= '{' (otherlv_3= 'source' ( (lv_source_4_0= ruleEString ) ) )? (otherlv_5= 'references' otherlv_6= '(' ( ( ruleEString ) ) (otherlv_8= ',' ( ( ruleEString ) ) )* otherlv_10= ')' )? (otherlv_11= 'annotations' otherlv_12= '{' ( (lv_annotations_13_0= ruleAnnotation ) ) (otherlv_14= ',' ( (lv_annotations_15_0= ruleAnnotation ) ) )* otherlv_16= '}' )? (otherlv_17= 'details' otherlv_18= '{' ( (lv_details_19_0= ruleStringToStringMapEntry ) ) (otherlv_20= ',' ( (lv_details_21_0= ruleStringToStringMapEntry ) ) )* otherlv_22= '}' )? (otherlv_23= 'contents' otherlv_24= '{' ( (lv_contents_25_0= ruleEObject ) ) (otherlv_26= ',' ( (lv_contents_27_0= ruleEObject ) ) )* otherlv_28= '}' )? otherlv_29= '}' )
            {
            // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:653:1: ( () otherlv_1= 'Annotation' otherlv_2= '{' (otherlv_3= 'source' ( (lv_source_4_0= ruleEString ) ) )? (otherlv_5= 'references' otherlv_6= '(' ( ( ruleEString ) ) (otherlv_8= ',' ( ( ruleEString ) ) )* otherlv_10= ')' )? (otherlv_11= 'annotations' otherlv_12= '{' ( (lv_annotations_13_0= ruleAnnotation ) ) (otherlv_14= ',' ( (lv_annotations_15_0= ruleAnnotation ) ) )* otherlv_16= '}' )? (otherlv_17= 'details' otherlv_18= '{' ( (lv_details_19_0= ruleStringToStringMapEntry ) ) (otherlv_20= ',' ( (lv_details_21_0= ruleStringToStringMapEntry ) ) )* otherlv_22= '}' )? (otherlv_23= 'contents' otherlv_24= '{' ( (lv_contents_25_0= ruleEObject ) ) (otherlv_26= ',' ( (lv_contents_27_0= ruleEObject ) ) )* otherlv_28= '}' )? otherlv_29= '}' )
            // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:653:2: () otherlv_1= 'Annotation' otherlv_2= '{' (otherlv_3= 'source' ( (lv_source_4_0= ruleEString ) ) )? (otherlv_5= 'references' otherlv_6= '(' ( ( ruleEString ) ) (otherlv_8= ',' ( ( ruleEString ) ) )* otherlv_10= ')' )? (otherlv_11= 'annotations' otherlv_12= '{' ( (lv_annotations_13_0= ruleAnnotation ) ) (otherlv_14= ',' ( (lv_annotations_15_0= ruleAnnotation ) ) )* otherlv_16= '}' )? (otherlv_17= 'details' otherlv_18= '{' ( (lv_details_19_0= ruleStringToStringMapEntry ) ) (otherlv_20= ',' ( (lv_details_21_0= ruleStringToStringMapEntry ) ) )* otherlv_22= '}' )? (otherlv_23= 'contents' otherlv_24= '{' ( (lv_contents_25_0= ruleEObject ) ) (otherlv_26= ',' ( (lv_contents_27_0= ruleEObject ) ) )* otherlv_28= '}' )? otherlv_29= '}'
            {
            // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:653:2: ()
            // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:654:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getAnnotationAccess().getAnnotationAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,29,FollowSets000.FOLLOW_29_in_ruleAnnotation1274); 

                	newLeafNode(otherlv_1, grammarAccess.getAnnotationAccess().getAnnotationKeyword_1());
                
            otherlv_2=(Token)match(input,13,FollowSets000.FOLLOW_13_in_ruleAnnotation1286); 

                	newLeafNode(otherlv_2, grammarAccess.getAnnotationAccess().getLeftCurlyBracketKeyword_2());
                
            // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:667:1: (otherlv_3= 'source' ( (lv_source_4_0= ruleEString ) ) )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==30) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:667:3: otherlv_3= 'source' ( (lv_source_4_0= ruleEString ) )
                    {
                    otherlv_3=(Token)match(input,30,FollowSets000.FOLLOW_30_in_ruleAnnotation1299); 

                        	newLeafNode(otherlv_3, grammarAccess.getAnnotationAccess().getSourceKeyword_3_0());
                        
                    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:671:1: ( (lv_source_4_0= ruleEString ) )
                    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:672:1: (lv_source_4_0= ruleEString )
                    {
                    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:672:1: (lv_source_4_0= ruleEString )
                    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:673:3: lv_source_4_0= ruleEString
                    {
                     
                    	        newCompositeNode(grammarAccess.getAnnotationAccess().getSourceEStringParserRuleCall_3_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleAnnotation1320);
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

            // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:689:4: (otherlv_5= 'references' otherlv_6= '(' ( ( ruleEString ) ) (otherlv_8= ',' ( ( ruleEString ) ) )* otherlv_10= ')' )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==31) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:689:6: otherlv_5= 'references' otherlv_6= '(' ( ( ruleEString ) ) (otherlv_8= ',' ( ( ruleEString ) ) )* otherlv_10= ')'
                    {
                    otherlv_5=(Token)match(input,31,FollowSets000.FOLLOW_31_in_ruleAnnotation1335); 

                        	newLeafNode(otherlv_5, grammarAccess.getAnnotationAccess().getReferencesKeyword_4_0());
                        
                    otherlv_6=(Token)match(input,17,FollowSets000.FOLLOW_17_in_ruleAnnotation1347); 

                        	newLeafNode(otherlv_6, grammarAccess.getAnnotationAccess().getLeftParenthesisKeyword_4_1());
                        
                    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:697:1: ( ( ruleEString ) )
                    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:698:1: ( ruleEString )
                    {
                    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:698:1: ( ruleEString )
                    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:699:3: ruleEString
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getAnnotationRule());
                    	        }
                            
                     
                    	        newCompositeNode(grammarAccess.getAnnotationAccess().getReferencesEObjectCrossReference_4_2_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleAnnotation1370);
                    ruleEString();

                    state._fsp--;

                     
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:712:2: (otherlv_8= ',' ( ( ruleEString ) ) )*
                    loop22:
                    do {
                        int alt22=2;
                        int LA22_0 = input.LA(1);

                        if ( (LA22_0==18) ) {
                            alt22=1;
                        }


                        switch (alt22) {
                    	case 1 :
                    	    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:712:4: otherlv_8= ',' ( ( ruleEString ) )
                    	    {
                    	    otherlv_8=(Token)match(input,18,FollowSets000.FOLLOW_18_in_ruleAnnotation1383); 

                    	        	newLeafNode(otherlv_8, grammarAccess.getAnnotationAccess().getCommaKeyword_4_3_0());
                    	        
                    	    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:716:1: ( ( ruleEString ) )
                    	    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:717:1: ( ruleEString )
                    	    {
                    	    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:717:1: ( ruleEString )
                    	    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:718:3: ruleEString
                    	    {

                    	    			if (current==null) {
                    	    	            current = createModelElement(grammarAccess.getAnnotationRule());
                    	    	        }
                    	            
                    	     
                    	    	        newCompositeNode(grammarAccess.getAnnotationAccess().getReferencesEObjectCrossReference_4_3_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleAnnotation1406);
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

                    otherlv_10=(Token)match(input,19,FollowSets000.FOLLOW_19_in_ruleAnnotation1420); 

                        	newLeafNode(otherlv_10, grammarAccess.getAnnotationAccess().getRightParenthesisKeyword_4_4());
                        

                    }
                    break;

            }

            // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:735:3: (otherlv_11= 'annotations' otherlv_12= '{' ( (lv_annotations_13_0= ruleAnnotation ) ) (otherlv_14= ',' ( (lv_annotations_15_0= ruleAnnotation ) ) )* otherlv_16= '}' )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==21) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:735:5: otherlv_11= 'annotations' otherlv_12= '{' ( (lv_annotations_13_0= ruleAnnotation ) ) (otherlv_14= ',' ( (lv_annotations_15_0= ruleAnnotation ) ) )* otherlv_16= '}'
                    {
                    otherlv_11=(Token)match(input,21,FollowSets000.FOLLOW_21_in_ruleAnnotation1435); 

                        	newLeafNode(otherlv_11, grammarAccess.getAnnotationAccess().getAnnotationsKeyword_5_0());
                        
                    otherlv_12=(Token)match(input,13,FollowSets000.FOLLOW_13_in_ruleAnnotation1447); 

                        	newLeafNode(otherlv_12, grammarAccess.getAnnotationAccess().getLeftCurlyBracketKeyword_5_1());
                        
                    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:743:1: ( (lv_annotations_13_0= ruleAnnotation ) )
                    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:744:1: (lv_annotations_13_0= ruleAnnotation )
                    {
                    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:744:1: (lv_annotations_13_0= ruleAnnotation )
                    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:745:3: lv_annotations_13_0= ruleAnnotation
                    {
                     
                    	        newCompositeNode(grammarAccess.getAnnotationAccess().getAnnotationsAnnotationParserRuleCall_5_2_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleAnnotation_in_ruleAnnotation1468);
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

                    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:761:2: (otherlv_14= ',' ( (lv_annotations_15_0= ruleAnnotation ) ) )*
                    loop24:
                    do {
                        int alt24=2;
                        int LA24_0 = input.LA(1);

                        if ( (LA24_0==18) ) {
                            alt24=1;
                        }


                        switch (alt24) {
                    	case 1 :
                    	    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:761:4: otherlv_14= ',' ( (lv_annotations_15_0= ruleAnnotation ) )
                    	    {
                    	    otherlv_14=(Token)match(input,18,FollowSets000.FOLLOW_18_in_ruleAnnotation1481); 

                    	        	newLeafNode(otherlv_14, grammarAccess.getAnnotationAccess().getCommaKeyword_5_3_0());
                    	        
                    	    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:765:1: ( (lv_annotations_15_0= ruleAnnotation ) )
                    	    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:766:1: (lv_annotations_15_0= ruleAnnotation )
                    	    {
                    	    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:766:1: (lv_annotations_15_0= ruleAnnotation )
                    	    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:767:3: lv_annotations_15_0= ruleAnnotation
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getAnnotationAccess().getAnnotationsAnnotationParserRuleCall_5_3_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleAnnotation_in_ruleAnnotation1502);
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

                    otherlv_16=(Token)match(input,22,FollowSets000.FOLLOW_22_in_ruleAnnotation1516); 

                        	newLeafNode(otherlv_16, grammarAccess.getAnnotationAccess().getRightCurlyBracketKeyword_5_4());
                        

                    }
                    break;

            }

            // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:787:3: (otherlv_17= 'details' otherlv_18= '{' ( (lv_details_19_0= ruleStringToStringMapEntry ) ) (otherlv_20= ',' ( (lv_details_21_0= ruleStringToStringMapEntry ) ) )* otherlv_22= '}' )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==32) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:787:5: otherlv_17= 'details' otherlv_18= '{' ( (lv_details_19_0= ruleStringToStringMapEntry ) ) (otherlv_20= ',' ( (lv_details_21_0= ruleStringToStringMapEntry ) ) )* otherlv_22= '}'
                    {
                    otherlv_17=(Token)match(input,32,FollowSets000.FOLLOW_32_in_ruleAnnotation1531); 

                        	newLeafNode(otherlv_17, grammarAccess.getAnnotationAccess().getDetailsKeyword_6_0());
                        
                    otherlv_18=(Token)match(input,13,FollowSets000.FOLLOW_13_in_ruleAnnotation1543); 

                        	newLeafNode(otherlv_18, grammarAccess.getAnnotationAccess().getLeftCurlyBracketKeyword_6_1());
                        
                    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:795:1: ( (lv_details_19_0= ruleStringToStringMapEntry ) )
                    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:796:1: (lv_details_19_0= ruleStringToStringMapEntry )
                    {
                    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:796:1: (lv_details_19_0= ruleStringToStringMapEntry )
                    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:797:3: lv_details_19_0= ruleStringToStringMapEntry
                    {
                     
                    	        newCompositeNode(grammarAccess.getAnnotationAccess().getDetailsStringToStringMapEntryParserRuleCall_6_2_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleStringToStringMapEntry_in_ruleAnnotation1564);
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

                    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:813:2: (otherlv_20= ',' ( (lv_details_21_0= ruleStringToStringMapEntry ) ) )*
                    loop26:
                    do {
                        int alt26=2;
                        int LA26_0 = input.LA(1);

                        if ( (LA26_0==18) ) {
                            alt26=1;
                        }


                        switch (alt26) {
                    	case 1 :
                    	    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:813:4: otherlv_20= ',' ( (lv_details_21_0= ruleStringToStringMapEntry ) )
                    	    {
                    	    otherlv_20=(Token)match(input,18,FollowSets000.FOLLOW_18_in_ruleAnnotation1577); 

                    	        	newLeafNode(otherlv_20, grammarAccess.getAnnotationAccess().getCommaKeyword_6_3_0());
                    	        
                    	    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:817:1: ( (lv_details_21_0= ruleStringToStringMapEntry ) )
                    	    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:818:1: (lv_details_21_0= ruleStringToStringMapEntry )
                    	    {
                    	    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:818:1: (lv_details_21_0= ruleStringToStringMapEntry )
                    	    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:819:3: lv_details_21_0= ruleStringToStringMapEntry
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getAnnotationAccess().getDetailsStringToStringMapEntryParserRuleCall_6_3_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleStringToStringMapEntry_in_ruleAnnotation1598);
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

                    otherlv_22=(Token)match(input,22,FollowSets000.FOLLOW_22_in_ruleAnnotation1612); 

                        	newLeafNode(otherlv_22, grammarAccess.getAnnotationAccess().getRightCurlyBracketKeyword_6_4());
                        

                    }
                    break;

            }

            // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:839:3: (otherlv_23= 'contents' otherlv_24= '{' ( (lv_contents_25_0= ruleEObject ) ) (otherlv_26= ',' ( (lv_contents_27_0= ruleEObject ) ) )* otherlv_28= '}' )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==33) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:839:5: otherlv_23= 'contents' otherlv_24= '{' ( (lv_contents_25_0= ruleEObject ) ) (otherlv_26= ',' ( (lv_contents_27_0= ruleEObject ) ) )* otherlv_28= '}'
                    {
                    otherlv_23=(Token)match(input,33,FollowSets000.FOLLOW_33_in_ruleAnnotation1627); 

                        	newLeafNode(otherlv_23, grammarAccess.getAnnotationAccess().getContentsKeyword_7_0());
                        
                    otherlv_24=(Token)match(input,13,FollowSets000.FOLLOW_13_in_ruleAnnotation1639); 

                        	newLeafNode(otherlv_24, grammarAccess.getAnnotationAccess().getLeftCurlyBracketKeyword_7_1());
                        
                    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:847:1: ( (lv_contents_25_0= ruleEObject ) )
                    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:848:1: (lv_contents_25_0= ruleEObject )
                    {
                    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:848:1: (lv_contents_25_0= ruleEObject )
                    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:849:3: lv_contents_25_0= ruleEObject
                    {
                     
                    	        newCompositeNode(grammarAccess.getAnnotationAccess().getContentsEObjectParserRuleCall_7_2_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEObject_in_ruleAnnotation1660);
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

                    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:865:2: (otherlv_26= ',' ( (lv_contents_27_0= ruleEObject ) ) )*
                    loop28:
                    do {
                        int alt28=2;
                        int LA28_0 = input.LA(1);

                        if ( (LA28_0==18) ) {
                            alt28=1;
                        }


                        switch (alt28) {
                    	case 1 :
                    	    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:865:4: otherlv_26= ',' ( (lv_contents_27_0= ruleEObject ) )
                    	    {
                    	    otherlv_26=(Token)match(input,18,FollowSets000.FOLLOW_18_in_ruleAnnotation1673); 

                    	        	newLeafNode(otherlv_26, grammarAccess.getAnnotationAccess().getCommaKeyword_7_3_0());
                    	        
                    	    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:869:1: ( (lv_contents_27_0= ruleEObject ) )
                    	    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:870:1: (lv_contents_27_0= ruleEObject )
                    	    {
                    	    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:870:1: (lv_contents_27_0= ruleEObject )
                    	    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:871:3: lv_contents_27_0= ruleEObject
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getAnnotationAccess().getContentsEObjectParserRuleCall_7_3_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleEObject_in_ruleAnnotation1694);
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

                    otherlv_28=(Token)match(input,22,FollowSets000.FOLLOW_22_in_ruleAnnotation1708); 

                        	newLeafNode(otherlv_28, grammarAccess.getAnnotationAccess().getRightCurlyBracketKeyword_7_4());
                        

                    }
                    break;

            }

            otherlv_29=(Token)match(input,22,FollowSets000.FOLLOW_22_in_ruleAnnotation1722); 

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
    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:903:1: entryRuleStringToAttributeMapEntry returns [EObject current=null] : iv_ruleStringToAttributeMapEntry= ruleStringToAttributeMapEntry EOF ;
    public final EObject entryRuleStringToAttributeMapEntry() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStringToAttributeMapEntry = null;


        try {
            // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:904:2: (iv_ruleStringToAttributeMapEntry= ruleStringToAttributeMapEntry EOF )
            // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:905:2: iv_ruleStringToAttributeMapEntry= ruleStringToAttributeMapEntry EOF
            {
             newCompositeNode(grammarAccess.getStringToAttributeMapEntryRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleStringToAttributeMapEntry_in_entryRuleStringToAttributeMapEntry1758);
            iv_ruleStringToAttributeMapEntry=ruleStringToAttributeMapEntry();

            state._fsp--;

             current =iv_ruleStringToAttributeMapEntry; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleStringToAttributeMapEntry1768); 

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
    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:912:1: ruleStringToAttributeMapEntry returns [EObject current=null] : (otherlv_0= 'StringToAttributeMapEntry' otherlv_1= '{' otherlv_2= 'key' ( (lv_key_3_0= ruleEString ) ) (otherlv_4= 'value' ( (lv_value_5_0= ruleAttribute ) ) )? otherlv_6= '}' ) ;
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
            // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:915:28: ( (otherlv_0= 'StringToAttributeMapEntry' otherlv_1= '{' otherlv_2= 'key' ( (lv_key_3_0= ruleEString ) ) (otherlv_4= 'value' ( (lv_value_5_0= ruleAttribute ) ) )? otherlv_6= '}' ) )
            // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:916:1: (otherlv_0= 'StringToAttributeMapEntry' otherlv_1= '{' otherlv_2= 'key' ( (lv_key_3_0= ruleEString ) ) (otherlv_4= 'value' ( (lv_value_5_0= ruleAttribute ) ) )? otherlv_6= '}' )
            {
            // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:916:1: (otherlv_0= 'StringToAttributeMapEntry' otherlv_1= '{' otherlv_2= 'key' ( (lv_key_3_0= ruleEString ) ) (otherlv_4= 'value' ( (lv_value_5_0= ruleAttribute ) ) )? otherlv_6= '}' )
            // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:916:3: otherlv_0= 'StringToAttributeMapEntry' otherlv_1= '{' otherlv_2= 'key' ( (lv_key_3_0= ruleEString ) ) (otherlv_4= 'value' ( (lv_value_5_0= ruleAttribute ) ) )? otherlv_6= '}'
            {
            otherlv_0=(Token)match(input,34,FollowSets000.FOLLOW_34_in_ruleStringToAttributeMapEntry1805); 

                	newLeafNode(otherlv_0, grammarAccess.getStringToAttributeMapEntryAccess().getStringToAttributeMapEntryKeyword_0());
                
            otherlv_1=(Token)match(input,13,FollowSets000.FOLLOW_13_in_ruleStringToAttributeMapEntry1817); 

                	newLeafNode(otherlv_1, grammarAccess.getStringToAttributeMapEntryAccess().getLeftCurlyBracketKeyword_1());
                
            otherlv_2=(Token)match(input,35,FollowSets000.FOLLOW_35_in_ruleStringToAttributeMapEntry1829); 

                	newLeafNode(otherlv_2, grammarAccess.getStringToAttributeMapEntryAccess().getKeyKeyword_2());
                
            // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:928:1: ( (lv_key_3_0= ruleEString ) )
            // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:929:1: (lv_key_3_0= ruleEString )
            {
            // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:929:1: (lv_key_3_0= ruleEString )
            // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:930:3: lv_key_3_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getStringToAttributeMapEntryAccess().getKeyEStringParserRuleCall_3_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleStringToAttributeMapEntry1850);
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

            // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:946:2: (otherlv_4= 'value' ( (lv_value_5_0= ruleAttribute ) ) )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==36) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:946:4: otherlv_4= 'value' ( (lv_value_5_0= ruleAttribute ) )
                    {
                    otherlv_4=(Token)match(input,36,FollowSets000.FOLLOW_36_in_ruleStringToAttributeMapEntry1863); 

                        	newLeafNode(otherlv_4, grammarAccess.getStringToAttributeMapEntryAccess().getValueKeyword_4_0());
                        
                    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:950:1: ( (lv_value_5_0= ruleAttribute ) )
                    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:951:1: (lv_value_5_0= ruleAttribute )
                    {
                    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:951:1: (lv_value_5_0= ruleAttribute )
                    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:952:3: lv_value_5_0= ruleAttribute
                    {
                     
                    	        newCompositeNode(grammarAccess.getStringToAttributeMapEntryAccess().getValueAttributeParserRuleCall_4_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleAttribute_in_ruleStringToAttributeMapEntry1884);
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

            otherlv_6=(Token)match(input,22,FollowSets000.FOLLOW_22_in_ruleStringToAttributeMapEntry1898); 

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
    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:982:1: entryRuleEString returns [String current=null] : iv_ruleEString= ruleEString EOF ;
    public final String entryRuleEString() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEString = null;


        try {
            // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:983:2: (iv_ruleEString= ruleEString EOF )
            // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:984:2: iv_ruleEString= ruleEString EOF
            {
             newCompositeNode(grammarAccess.getEStringRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_entryRuleEString1937);
            iv_ruleEString=ruleEString();

            state._fsp--;

             current =iv_ruleEString.getText(); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleEString1948); 

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
    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:991:1: ruleEString returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) ;
    public final AntlrDatatypeRuleToken ruleEString() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;
        Token this_ID_1=null;

         enterRule(); 
            
        try {
            // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:994:28: ( (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) )
            // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:995:1: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            {
            // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:995:1: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
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
                    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:995:6: this_STRING_0= RULE_STRING
                    {
                    this_STRING_0=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_RULE_STRING_in_ruleEString1988); 

                    		current.merge(this_STRING_0);
                        
                     
                        newLeafNode(this_STRING_0, grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 
                        

                    }
                    break;
                case 2 :
                    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:1003:10: this_ID_1= RULE_ID
                    {
                    this_ID_1=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleEString2014); 

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
    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:1020:1: entryRuleVariable returns [EObject current=null] : iv_ruleVariable= ruleVariable EOF ;
    public final EObject entryRuleVariable() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVariable = null;


        try {
            // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:1021:2: (iv_ruleVariable= ruleVariable EOF )
            // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:1022:2: iv_ruleVariable= ruleVariable EOF
            {
             newCompositeNode(grammarAccess.getVariableRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleVariable_in_entryRuleVariable2061);
            iv_ruleVariable=ruleVariable();

            state._fsp--;

             current =iv_ruleVariable; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleVariable2071); 

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
    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:1029:1: ruleVariable returns [EObject current=null] : ( () ( (lv_localGenerated_1_0= 'localGenerated' ) )? otherlv_2= 'Variable' ( (lv_name_3_0= ruleEString ) ) otherlv_4= '{' (otherlv_5= 'internalId' ( (lv_internalId_6_0= ruleEString ) ) )? (otherlv_7= 'comment' ( (lv_comment_8_0= ruleEString ) ) )? (otherlv_9= 'annotations' otherlv_10= '{' ( (lv_annotations_11_0= ruleAnnotation ) ) (otherlv_12= ',' ( (lv_annotations_13_0= ruleAnnotation ) ) )* otherlv_14= '}' )? (otherlv_15= 'extensions' otherlv_16= '{' ( (lv_extensions_17_0= ruleAbstractExtension ) ) (otherlv_18= ',' ( (lv_extensions_19_0= ruleAbstractExtension ) ) )* otherlv_20= '}' )? (otherlv_21= 'attributes' otherlv_22= '{' ( (lv_attributes_23_0= ruleStringToAttributeMapEntry ) ) (otherlv_24= ',' ( (lv_attributes_25_0= ruleStringToAttributeMapEntry ) ) )* otherlv_26= '}' )? otherlv_27= '}' ) ;
    public final EObject ruleVariable() throws RecognitionException {
        EObject current = null;

        Token lv_localGenerated_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
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
        Token otherlv_27=null;
        AntlrDatatypeRuleToken lv_name_3_0 = null;

        AntlrDatatypeRuleToken lv_internalId_6_0 = null;

        AntlrDatatypeRuleToken lv_comment_8_0 = null;

        EObject lv_annotations_11_0 = null;

        EObject lv_annotations_13_0 = null;

        EObject lv_extensions_17_0 = null;

        EObject lv_extensions_19_0 = null;

        EObject lv_attributes_23_0 = null;

        EObject lv_attributes_25_0 = null;


         enterRule(); 
            
        try {
            // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:1032:28: ( ( () ( (lv_localGenerated_1_0= 'localGenerated' ) )? otherlv_2= 'Variable' ( (lv_name_3_0= ruleEString ) ) otherlv_4= '{' (otherlv_5= 'internalId' ( (lv_internalId_6_0= ruleEString ) ) )? (otherlv_7= 'comment' ( (lv_comment_8_0= ruleEString ) ) )? (otherlv_9= 'annotations' otherlv_10= '{' ( (lv_annotations_11_0= ruleAnnotation ) ) (otherlv_12= ',' ( (lv_annotations_13_0= ruleAnnotation ) ) )* otherlv_14= '}' )? (otherlv_15= 'extensions' otherlv_16= '{' ( (lv_extensions_17_0= ruleAbstractExtension ) ) (otherlv_18= ',' ( (lv_extensions_19_0= ruleAbstractExtension ) ) )* otherlv_20= '}' )? (otherlv_21= 'attributes' otherlv_22= '{' ( (lv_attributes_23_0= ruleStringToAttributeMapEntry ) ) (otherlv_24= ',' ( (lv_attributes_25_0= ruleStringToAttributeMapEntry ) ) )* otherlv_26= '}' )? otherlv_27= '}' ) )
            // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:1033:1: ( () ( (lv_localGenerated_1_0= 'localGenerated' ) )? otherlv_2= 'Variable' ( (lv_name_3_0= ruleEString ) ) otherlv_4= '{' (otherlv_5= 'internalId' ( (lv_internalId_6_0= ruleEString ) ) )? (otherlv_7= 'comment' ( (lv_comment_8_0= ruleEString ) ) )? (otherlv_9= 'annotations' otherlv_10= '{' ( (lv_annotations_11_0= ruleAnnotation ) ) (otherlv_12= ',' ( (lv_annotations_13_0= ruleAnnotation ) ) )* otherlv_14= '}' )? (otherlv_15= 'extensions' otherlv_16= '{' ( (lv_extensions_17_0= ruleAbstractExtension ) ) (otherlv_18= ',' ( (lv_extensions_19_0= ruleAbstractExtension ) ) )* otherlv_20= '}' )? (otherlv_21= 'attributes' otherlv_22= '{' ( (lv_attributes_23_0= ruleStringToAttributeMapEntry ) ) (otherlv_24= ',' ( (lv_attributes_25_0= ruleStringToAttributeMapEntry ) ) )* otherlv_26= '}' )? otherlv_27= '}' )
            {
            // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:1033:1: ( () ( (lv_localGenerated_1_0= 'localGenerated' ) )? otherlv_2= 'Variable' ( (lv_name_3_0= ruleEString ) ) otherlv_4= '{' (otherlv_5= 'internalId' ( (lv_internalId_6_0= ruleEString ) ) )? (otherlv_7= 'comment' ( (lv_comment_8_0= ruleEString ) ) )? (otherlv_9= 'annotations' otherlv_10= '{' ( (lv_annotations_11_0= ruleAnnotation ) ) (otherlv_12= ',' ( (lv_annotations_13_0= ruleAnnotation ) ) )* otherlv_14= '}' )? (otherlv_15= 'extensions' otherlv_16= '{' ( (lv_extensions_17_0= ruleAbstractExtension ) ) (otherlv_18= ',' ( (lv_extensions_19_0= ruleAbstractExtension ) ) )* otherlv_20= '}' )? (otherlv_21= 'attributes' otherlv_22= '{' ( (lv_attributes_23_0= ruleStringToAttributeMapEntry ) ) (otherlv_24= ',' ( (lv_attributes_25_0= ruleStringToAttributeMapEntry ) ) )* otherlv_26= '}' )? otherlv_27= '}' )
            // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:1033:2: () ( (lv_localGenerated_1_0= 'localGenerated' ) )? otherlv_2= 'Variable' ( (lv_name_3_0= ruleEString ) ) otherlv_4= '{' (otherlv_5= 'internalId' ( (lv_internalId_6_0= ruleEString ) ) )? (otherlv_7= 'comment' ( (lv_comment_8_0= ruleEString ) ) )? (otherlv_9= 'annotations' otherlv_10= '{' ( (lv_annotations_11_0= ruleAnnotation ) ) (otherlv_12= ',' ( (lv_annotations_13_0= ruleAnnotation ) ) )* otherlv_14= '}' )? (otherlv_15= 'extensions' otherlv_16= '{' ( (lv_extensions_17_0= ruleAbstractExtension ) ) (otherlv_18= ',' ( (lv_extensions_19_0= ruleAbstractExtension ) ) )* otherlv_20= '}' )? (otherlv_21= 'attributes' otherlv_22= '{' ( (lv_attributes_23_0= ruleStringToAttributeMapEntry ) ) (otherlv_24= ',' ( (lv_attributes_25_0= ruleStringToAttributeMapEntry ) ) )* otherlv_26= '}' )? otherlv_27= '}'
            {
            // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:1033:2: ()
            // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:1034:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getVariableAccess().getVariableAction_0(),
                        current);
                

            }

            // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:1039:2: ( (lv_localGenerated_1_0= 'localGenerated' ) )?
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==11) ) {
                alt32=1;
            }
            switch (alt32) {
                case 1 :
                    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:1040:1: (lv_localGenerated_1_0= 'localGenerated' )
                    {
                    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:1040:1: (lv_localGenerated_1_0= 'localGenerated' )
                    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:1041:3: lv_localGenerated_1_0= 'localGenerated'
                    {
                    lv_localGenerated_1_0=(Token)match(input,11,FollowSets000.FOLLOW_11_in_ruleVariable2123); 

                            newLeafNode(lv_localGenerated_1_0, grammarAccess.getVariableAccess().getLocalGeneratedLocalGeneratedKeyword_1_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getVariableRule());
                    	        }
                           		setWithLastConsumed(current, "localGenerated", true, "localGenerated");
                    	    

                    }


                    }
                    break;

            }

            otherlv_2=(Token)match(input,37,FollowSets000.FOLLOW_37_in_ruleVariable2149); 

                	newLeafNode(otherlv_2, grammarAccess.getVariableAccess().getVariableKeyword_2());
                
            // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:1058:1: ( (lv_name_3_0= ruleEString ) )
            // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:1059:1: (lv_name_3_0= ruleEString )
            {
            // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:1059:1: (lv_name_3_0= ruleEString )
            // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:1060:3: lv_name_3_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getVariableAccess().getNameEStringParserRuleCall_3_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleVariable2170);
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

            otherlv_4=(Token)match(input,13,FollowSets000.FOLLOW_13_in_ruleVariable2182); 

                	newLeafNode(otherlv_4, grammarAccess.getVariableAccess().getLeftCurlyBracketKeyword_4());
                
            // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:1080:1: (otherlv_5= 'internalId' ( (lv_internalId_6_0= ruleEString ) ) )?
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==14) ) {
                alt33=1;
            }
            switch (alt33) {
                case 1 :
                    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:1080:3: otherlv_5= 'internalId' ( (lv_internalId_6_0= ruleEString ) )
                    {
                    otherlv_5=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleVariable2195); 

                        	newLeafNode(otherlv_5, grammarAccess.getVariableAccess().getInternalIdKeyword_5_0());
                        
                    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:1084:1: ( (lv_internalId_6_0= ruleEString ) )
                    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:1085:1: (lv_internalId_6_0= ruleEString )
                    {
                    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:1085:1: (lv_internalId_6_0= ruleEString )
                    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:1086:3: lv_internalId_6_0= ruleEString
                    {
                     
                    	        newCompositeNode(grammarAccess.getVariableAccess().getInternalIdEStringParserRuleCall_5_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleVariable2216);
                    lv_internalId_6_0=ruleEString();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getVariableRule());
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

            // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:1102:4: (otherlv_7= 'comment' ( (lv_comment_8_0= ruleEString ) ) )?
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( (LA34_0==15) ) {
                alt34=1;
            }
            switch (alt34) {
                case 1 :
                    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:1102:6: otherlv_7= 'comment' ( (lv_comment_8_0= ruleEString ) )
                    {
                    otherlv_7=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleVariable2231); 

                        	newLeafNode(otherlv_7, grammarAccess.getVariableAccess().getCommentKeyword_6_0());
                        
                    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:1106:1: ( (lv_comment_8_0= ruleEString ) )
                    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:1107:1: (lv_comment_8_0= ruleEString )
                    {
                    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:1107:1: (lv_comment_8_0= ruleEString )
                    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:1108:3: lv_comment_8_0= ruleEString
                    {
                     
                    	        newCompositeNode(grammarAccess.getVariableAccess().getCommentEStringParserRuleCall_6_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleVariable2252);
                    lv_comment_8_0=ruleEString();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getVariableRule());
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

            // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:1124:4: (otherlv_9= 'annotations' otherlv_10= '{' ( (lv_annotations_11_0= ruleAnnotation ) ) (otherlv_12= ',' ( (lv_annotations_13_0= ruleAnnotation ) ) )* otherlv_14= '}' )?
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( (LA36_0==21) ) {
                alt36=1;
            }
            switch (alt36) {
                case 1 :
                    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:1124:6: otherlv_9= 'annotations' otherlv_10= '{' ( (lv_annotations_11_0= ruleAnnotation ) ) (otherlv_12= ',' ( (lv_annotations_13_0= ruleAnnotation ) ) )* otherlv_14= '}'
                    {
                    otherlv_9=(Token)match(input,21,FollowSets000.FOLLOW_21_in_ruleVariable2267); 

                        	newLeafNode(otherlv_9, grammarAccess.getVariableAccess().getAnnotationsKeyword_7_0());
                        
                    otherlv_10=(Token)match(input,13,FollowSets000.FOLLOW_13_in_ruleVariable2279); 

                        	newLeafNode(otherlv_10, grammarAccess.getVariableAccess().getLeftCurlyBracketKeyword_7_1());
                        
                    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:1132:1: ( (lv_annotations_11_0= ruleAnnotation ) )
                    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:1133:1: (lv_annotations_11_0= ruleAnnotation )
                    {
                    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:1133:1: (lv_annotations_11_0= ruleAnnotation )
                    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:1134:3: lv_annotations_11_0= ruleAnnotation
                    {
                     
                    	        newCompositeNode(grammarAccess.getVariableAccess().getAnnotationsAnnotationParserRuleCall_7_2_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleAnnotation_in_ruleVariable2300);
                    lv_annotations_11_0=ruleAnnotation();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getVariableRule());
                    	        }
                           		add(
                           			current, 
                           			"annotations",
                            		lv_annotations_11_0, 
                            		"Annotation");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:1150:2: (otherlv_12= ',' ( (lv_annotations_13_0= ruleAnnotation ) ) )*
                    loop35:
                    do {
                        int alt35=2;
                        int LA35_0 = input.LA(1);

                        if ( (LA35_0==18) ) {
                            alt35=1;
                        }


                        switch (alt35) {
                    	case 1 :
                    	    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:1150:4: otherlv_12= ',' ( (lv_annotations_13_0= ruleAnnotation ) )
                    	    {
                    	    otherlv_12=(Token)match(input,18,FollowSets000.FOLLOW_18_in_ruleVariable2313); 

                    	        	newLeafNode(otherlv_12, grammarAccess.getVariableAccess().getCommaKeyword_7_3_0());
                    	        
                    	    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:1154:1: ( (lv_annotations_13_0= ruleAnnotation ) )
                    	    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:1155:1: (lv_annotations_13_0= ruleAnnotation )
                    	    {
                    	    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:1155:1: (lv_annotations_13_0= ruleAnnotation )
                    	    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:1156:3: lv_annotations_13_0= ruleAnnotation
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getVariableAccess().getAnnotationsAnnotationParserRuleCall_7_3_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleAnnotation_in_ruleVariable2334);
                    	    lv_annotations_13_0=ruleAnnotation();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getVariableRule());
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
                    	    break loop35;
                        }
                    } while (true);

                    otherlv_14=(Token)match(input,22,FollowSets000.FOLLOW_22_in_ruleVariable2348); 

                        	newLeafNode(otherlv_14, grammarAccess.getVariableAccess().getRightCurlyBracketKeyword_7_4());
                        

                    }
                    break;

            }

            // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:1176:3: (otherlv_15= 'extensions' otherlv_16= '{' ( (lv_extensions_17_0= ruleAbstractExtension ) ) (otherlv_18= ',' ( (lv_extensions_19_0= ruleAbstractExtension ) ) )* otherlv_20= '}' )?
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( (LA38_0==23) ) {
                alt38=1;
            }
            switch (alt38) {
                case 1 :
                    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:1176:5: otherlv_15= 'extensions' otherlv_16= '{' ( (lv_extensions_17_0= ruleAbstractExtension ) ) (otherlv_18= ',' ( (lv_extensions_19_0= ruleAbstractExtension ) ) )* otherlv_20= '}'
                    {
                    otherlv_15=(Token)match(input,23,FollowSets000.FOLLOW_23_in_ruleVariable2363); 

                        	newLeafNode(otherlv_15, grammarAccess.getVariableAccess().getExtensionsKeyword_8_0());
                        
                    otherlv_16=(Token)match(input,13,FollowSets000.FOLLOW_13_in_ruleVariable2375); 

                        	newLeafNode(otherlv_16, grammarAccess.getVariableAccess().getLeftCurlyBracketKeyword_8_1());
                        
                    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:1184:1: ( (lv_extensions_17_0= ruleAbstractExtension ) )
                    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:1185:1: (lv_extensions_17_0= ruleAbstractExtension )
                    {
                    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:1185:1: (lv_extensions_17_0= ruleAbstractExtension )
                    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:1186:3: lv_extensions_17_0= ruleAbstractExtension
                    {
                     
                    	        newCompositeNode(grammarAccess.getVariableAccess().getExtensionsAbstractExtensionParserRuleCall_8_2_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleAbstractExtension_in_ruleVariable2396);
                    lv_extensions_17_0=ruleAbstractExtension();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getVariableRule());
                    	        }
                           		add(
                           			current, 
                           			"extensions",
                            		lv_extensions_17_0, 
                            		"AbstractExtension");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:1202:2: (otherlv_18= ',' ( (lv_extensions_19_0= ruleAbstractExtension ) ) )*
                    loop37:
                    do {
                        int alt37=2;
                        int LA37_0 = input.LA(1);

                        if ( (LA37_0==18) ) {
                            alt37=1;
                        }


                        switch (alt37) {
                    	case 1 :
                    	    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:1202:4: otherlv_18= ',' ( (lv_extensions_19_0= ruleAbstractExtension ) )
                    	    {
                    	    otherlv_18=(Token)match(input,18,FollowSets000.FOLLOW_18_in_ruleVariable2409); 

                    	        	newLeafNode(otherlv_18, grammarAccess.getVariableAccess().getCommaKeyword_8_3_0());
                    	        
                    	    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:1206:1: ( (lv_extensions_19_0= ruleAbstractExtension ) )
                    	    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:1207:1: (lv_extensions_19_0= ruleAbstractExtension )
                    	    {
                    	    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:1207:1: (lv_extensions_19_0= ruleAbstractExtension )
                    	    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:1208:3: lv_extensions_19_0= ruleAbstractExtension
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getVariableAccess().getExtensionsAbstractExtensionParserRuleCall_8_3_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleAbstractExtension_in_ruleVariable2430);
                    	    lv_extensions_19_0=ruleAbstractExtension();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getVariableRule());
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
                    	    break loop37;
                        }
                    } while (true);

                    otherlv_20=(Token)match(input,22,FollowSets000.FOLLOW_22_in_ruleVariable2444); 

                        	newLeafNode(otherlv_20, grammarAccess.getVariableAccess().getRightCurlyBracketKeyword_8_4());
                        

                    }
                    break;

            }

            // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:1228:3: (otherlv_21= 'attributes' otherlv_22= '{' ( (lv_attributes_23_0= ruleStringToAttributeMapEntry ) ) (otherlv_24= ',' ( (lv_attributes_25_0= ruleStringToAttributeMapEntry ) ) )* otherlv_26= '}' )?
            int alt40=2;
            int LA40_0 = input.LA(1);

            if ( (LA40_0==24) ) {
                alt40=1;
            }
            switch (alt40) {
                case 1 :
                    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:1228:5: otherlv_21= 'attributes' otherlv_22= '{' ( (lv_attributes_23_0= ruleStringToAttributeMapEntry ) ) (otherlv_24= ',' ( (lv_attributes_25_0= ruleStringToAttributeMapEntry ) ) )* otherlv_26= '}'
                    {
                    otherlv_21=(Token)match(input,24,FollowSets000.FOLLOW_24_in_ruleVariable2459); 

                        	newLeafNode(otherlv_21, grammarAccess.getVariableAccess().getAttributesKeyword_9_0());
                        
                    otherlv_22=(Token)match(input,13,FollowSets000.FOLLOW_13_in_ruleVariable2471); 

                        	newLeafNode(otherlv_22, grammarAccess.getVariableAccess().getLeftCurlyBracketKeyword_9_1());
                        
                    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:1236:1: ( (lv_attributes_23_0= ruleStringToAttributeMapEntry ) )
                    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:1237:1: (lv_attributes_23_0= ruleStringToAttributeMapEntry )
                    {
                    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:1237:1: (lv_attributes_23_0= ruleStringToAttributeMapEntry )
                    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:1238:3: lv_attributes_23_0= ruleStringToAttributeMapEntry
                    {
                     
                    	        newCompositeNode(grammarAccess.getVariableAccess().getAttributesStringToAttributeMapEntryParserRuleCall_9_2_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleStringToAttributeMapEntry_in_ruleVariable2492);
                    lv_attributes_23_0=ruleStringToAttributeMapEntry();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getVariableRule());
                    	        }
                           		add(
                           			current, 
                           			"attributes",
                            		lv_attributes_23_0, 
                            		"StringToAttributeMapEntry");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:1254:2: (otherlv_24= ',' ( (lv_attributes_25_0= ruleStringToAttributeMapEntry ) ) )*
                    loop39:
                    do {
                        int alt39=2;
                        int LA39_0 = input.LA(1);

                        if ( (LA39_0==18) ) {
                            alt39=1;
                        }


                        switch (alt39) {
                    	case 1 :
                    	    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:1254:4: otherlv_24= ',' ( (lv_attributes_25_0= ruleStringToAttributeMapEntry ) )
                    	    {
                    	    otherlv_24=(Token)match(input,18,FollowSets000.FOLLOW_18_in_ruleVariable2505); 

                    	        	newLeafNode(otherlv_24, grammarAccess.getVariableAccess().getCommaKeyword_9_3_0());
                    	        
                    	    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:1258:1: ( (lv_attributes_25_0= ruleStringToAttributeMapEntry ) )
                    	    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:1259:1: (lv_attributes_25_0= ruleStringToAttributeMapEntry )
                    	    {
                    	    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:1259:1: (lv_attributes_25_0= ruleStringToAttributeMapEntry )
                    	    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:1260:3: lv_attributes_25_0= ruleStringToAttributeMapEntry
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getVariableAccess().getAttributesStringToAttributeMapEntryParserRuleCall_9_3_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleStringToAttributeMapEntry_in_ruleVariable2526);
                    	    lv_attributes_25_0=ruleStringToAttributeMapEntry();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getVariableRule());
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
                    	    break loop39;
                        }
                    } while (true);

                    otherlv_26=(Token)match(input,22,FollowSets000.FOLLOW_22_in_ruleVariable2540); 

                        	newLeafNode(otherlv_26, grammarAccess.getVariableAccess().getRightCurlyBracketKeyword_9_4());
                        

                    }
                    break;

            }

            otherlv_27=(Token)match(input,22,FollowSets000.FOLLOW_22_in_ruleVariable2554); 

                	newLeafNode(otherlv_27, grammarAccess.getVariableAccess().getRightCurlyBracketKeyword_10());
                

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
    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:1292:1: entryRuleInvariant returns [EObject current=null] : iv_ruleInvariant= ruleInvariant EOF ;
    public final EObject entryRuleInvariant() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInvariant = null;


        try {
            // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:1293:2: (iv_ruleInvariant= ruleInvariant EOF )
            // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:1294:2: iv_ruleInvariant= ruleInvariant EOF
            {
             newCompositeNode(grammarAccess.getInvariantRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleInvariant_in_entryRuleInvariant2590);
            iv_ruleInvariant=ruleInvariant();

            state._fsp--;

             current =iv_ruleInvariant; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleInvariant2600); 

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
    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:1301:1: ruleInvariant returns [EObject current=null] : ( ( (lv_localGenerated_0_0= 'localGenerated' ) )? ( (lv_theorem_1_0= 'theorem' ) ) otherlv_2= 'Invariant' ( (lv_name_3_0= ruleEString ) ) otherlv_4= '{' (otherlv_5= 'internalId' ( (lv_internalId_6_0= ruleEString ) ) )? (otherlv_7= 'comment' ( (lv_comment_8_0= ruleEString ) ) )? otherlv_9= 'predicate' ( (lv_predicate_10_0= ruleEString ) ) (otherlv_11= 'annotations' otherlv_12= '{' ( (lv_annotations_13_0= ruleAnnotation ) ) (otherlv_14= ',' ( (lv_annotations_15_0= ruleAnnotation ) ) )* otherlv_16= '}' )? (otherlv_17= 'extensions' otherlv_18= '{' ( (lv_extensions_19_0= ruleAbstractExtension ) ) (otherlv_20= ',' ( (lv_extensions_21_0= ruleAbstractExtension ) ) )* otherlv_22= '}' )? (otherlv_23= 'attributes' otherlv_24= '{' ( (lv_attributes_25_0= ruleStringToAttributeMapEntry ) ) (otherlv_26= ',' ( (lv_attributes_27_0= ruleStringToAttributeMapEntry ) ) )* otherlv_28= '}' )? otherlv_29= '}' ) ;
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
        AntlrDatatypeRuleToken lv_name_3_0 = null;

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
            // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:1304:28: ( ( ( (lv_localGenerated_0_0= 'localGenerated' ) )? ( (lv_theorem_1_0= 'theorem' ) ) otherlv_2= 'Invariant' ( (lv_name_3_0= ruleEString ) ) otherlv_4= '{' (otherlv_5= 'internalId' ( (lv_internalId_6_0= ruleEString ) ) )? (otherlv_7= 'comment' ( (lv_comment_8_0= ruleEString ) ) )? otherlv_9= 'predicate' ( (lv_predicate_10_0= ruleEString ) ) (otherlv_11= 'annotations' otherlv_12= '{' ( (lv_annotations_13_0= ruleAnnotation ) ) (otherlv_14= ',' ( (lv_annotations_15_0= ruleAnnotation ) ) )* otherlv_16= '}' )? (otherlv_17= 'extensions' otherlv_18= '{' ( (lv_extensions_19_0= ruleAbstractExtension ) ) (otherlv_20= ',' ( (lv_extensions_21_0= ruleAbstractExtension ) ) )* otherlv_22= '}' )? (otherlv_23= 'attributes' otherlv_24= '{' ( (lv_attributes_25_0= ruleStringToAttributeMapEntry ) ) (otherlv_26= ',' ( (lv_attributes_27_0= ruleStringToAttributeMapEntry ) ) )* otherlv_28= '}' )? otherlv_29= '}' ) )
            // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:1305:1: ( ( (lv_localGenerated_0_0= 'localGenerated' ) )? ( (lv_theorem_1_0= 'theorem' ) ) otherlv_2= 'Invariant' ( (lv_name_3_0= ruleEString ) ) otherlv_4= '{' (otherlv_5= 'internalId' ( (lv_internalId_6_0= ruleEString ) ) )? (otherlv_7= 'comment' ( (lv_comment_8_0= ruleEString ) ) )? otherlv_9= 'predicate' ( (lv_predicate_10_0= ruleEString ) ) (otherlv_11= 'annotations' otherlv_12= '{' ( (lv_annotations_13_0= ruleAnnotation ) ) (otherlv_14= ',' ( (lv_annotations_15_0= ruleAnnotation ) ) )* otherlv_16= '}' )? (otherlv_17= 'extensions' otherlv_18= '{' ( (lv_extensions_19_0= ruleAbstractExtension ) ) (otherlv_20= ',' ( (lv_extensions_21_0= ruleAbstractExtension ) ) )* otherlv_22= '}' )? (otherlv_23= 'attributes' otherlv_24= '{' ( (lv_attributes_25_0= ruleStringToAttributeMapEntry ) ) (otherlv_26= ',' ( (lv_attributes_27_0= ruleStringToAttributeMapEntry ) ) )* otherlv_28= '}' )? otherlv_29= '}' )
            {
            // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:1305:1: ( ( (lv_localGenerated_0_0= 'localGenerated' ) )? ( (lv_theorem_1_0= 'theorem' ) ) otherlv_2= 'Invariant' ( (lv_name_3_0= ruleEString ) ) otherlv_4= '{' (otherlv_5= 'internalId' ( (lv_internalId_6_0= ruleEString ) ) )? (otherlv_7= 'comment' ( (lv_comment_8_0= ruleEString ) ) )? otherlv_9= 'predicate' ( (lv_predicate_10_0= ruleEString ) ) (otherlv_11= 'annotations' otherlv_12= '{' ( (lv_annotations_13_0= ruleAnnotation ) ) (otherlv_14= ',' ( (lv_annotations_15_0= ruleAnnotation ) ) )* otherlv_16= '}' )? (otherlv_17= 'extensions' otherlv_18= '{' ( (lv_extensions_19_0= ruleAbstractExtension ) ) (otherlv_20= ',' ( (lv_extensions_21_0= ruleAbstractExtension ) ) )* otherlv_22= '}' )? (otherlv_23= 'attributes' otherlv_24= '{' ( (lv_attributes_25_0= ruleStringToAttributeMapEntry ) ) (otherlv_26= ',' ( (lv_attributes_27_0= ruleStringToAttributeMapEntry ) ) )* otherlv_28= '}' )? otherlv_29= '}' )
            // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:1305:2: ( (lv_localGenerated_0_0= 'localGenerated' ) )? ( (lv_theorem_1_0= 'theorem' ) ) otherlv_2= 'Invariant' ( (lv_name_3_0= ruleEString ) ) otherlv_4= '{' (otherlv_5= 'internalId' ( (lv_internalId_6_0= ruleEString ) ) )? (otherlv_7= 'comment' ( (lv_comment_8_0= ruleEString ) ) )? otherlv_9= 'predicate' ( (lv_predicate_10_0= ruleEString ) ) (otherlv_11= 'annotations' otherlv_12= '{' ( (lv_annotations_13_0= ruleAnnotation ) ) (otherlv_14= ',' ( (lv_annotations_15_0= ruleAnnotation ) ) )* otherlv_16= '}' )? (otherlv_17= 'extensions' otherlv_18= '{' ( (lv_extensions_19_0= ruleAbstractExtension ) ) (otherlv_20= ',' ( (lv_extensions_21_0= ruleAbstractExtension ) ) )* otherlv_22= '}' )? (otherlv_23= 'attributes' otherlv_24= '{' ( (lv_attributes_25_0= ruleStringToAttributeMapEntry ) ) (otherlv_26= ',' ( (lv_attributes_27_0= ruleStringToAttributeMapEntry ) ) )* otherlv_28= '}' )? otherlv_29= '}'
            {
            // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:1305:2: ( (lv_localGenerated_0_0= 'localGenerated' ) )?
            int alt41=2;
            int LA41_0 = input.LA(1);

            if ( (LA41_0==11) ) {
                alt41=1;
            }
            switch (alt41) {
                case 1 :
                    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:1306:1: (lv_localGenerated_0_0= 'localGenerated' )
                    {
                    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:1306:1: (lv_localGenerated_0_0= 'localGenerated' )
                    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:1307:3: lv_localGenerated_0_0= 'localGenerated'
                    {
                    lv_localGenerated_0_0=(Token)match(input,11,FollowSets000.FOLLOW_11_in_ruleInvariant2643); 

                            newLeafNode(lv_localGenerated_0_0, grammarAccess.getInvariantAccess().getLocalGeneratedLocalGeneratedKeyword_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getInvariantRule());
                    	        }
                           		setWithLastConsumed(current, "localGenerated", true, "localGenerated");
                    	    

                    }


                    }
                    break;

            }

            // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:1320:3: ( (lv_theorem_1_0= 'theorem' ) )
            // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:1321:1: (lv_theorem_1_0= 'theorem' )
            {
            // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:1321:1: (lv_theorem_1_0= 'theorem' )
            // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:1322:3: lv_theorem_1_0= 'theorem'
            {
            lv_theorem_1_0=(Token)match(input,38,FollowSets000.FOLLOW_38_in_ruleInvariant2675); 

                    newLeafNode(lv_theorem_1_0, grammarAccess.getInvariantAccess().getTheoremTheoremKeyword_1_0());
                

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getInvariantRule());
            	        }
                   		setWithLastConsumed(current, "theorem", true, "theorem");
            	    

            }


            }

            otherlv_2=(Token)match(input,39,FollowSets000.FOLLOW_39_in_ruleInvariant2700); 

                	newLeafNode(otherlv_2, grammarAccess.getInvariantAccess().getInvariantKeyword_2());
                
            // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:1339:1: ( (lv_name_3_0= ruleEString ) )
            // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:1340:1: (lv_name_3_0= ruleEString )
            {
            // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:1340:1: (lv_name_3_0= ruleEString )
            // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:1341:3: lv_name_3_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getInvariantAccess().getNameEStringParserRuleCall_3_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleInvariant2721);
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

            otherlv_4=(Token)match(input,13,FollowSets000.FOLLOW_13_in_ruleInvariant2733); 

                	newLeafNode(otherlv_4, grammarAccess.getInvariantAccess().getLeftCurlyBracketKeyword_4());
                
            // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:1361:1: (otherlv_5= 'internalId' ( (lv_internalId_6_0= ruleEString ) ) )?
            int alt42=2;
            int LA42_0 = input.LA(1);

            if ( (LA42_0==14) ) {
                alt42=1;
            }
            switch (alt42) {
                case 1 :
                    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:1361:3: otherlv_5= 'internalId' ( (lv_internalId_6_0= ruleEString ) )
                    {
                    otherlv_5=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleInvariant2746); 

                        	newLeafNode(otherlv_5, grammarAccess.getInvariantAccess().getInternalIdKeyword_5_0());
                        
                    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:1365:1: ( (lv_internalId_6_0= ruleEString ) )
                    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:1366:1: (lv_internalId_6_0= ruleEString )
                    {
                    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:1366:1: (lv_internalId_6_0= ruleEString )
                    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:1367:3: lv_internalId_6_0= ruleEString
                    {
                     
                    	        newCompositeNode(grammarAccess.getInvariantAccess().getInternalIdEStringParserRuleCall_5_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleInvariant2767);
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

            // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:1383:4: (otherlv_7= 'comment' ( (lv_comment_8_0= ruleEString ) ) )?
            int alt43=2;
            int LA43_0 = input.LA(1);

            if ( (LA43_0==15) ) {
                alt43=1;
            }
            switch (alt43) {
                case 1 :
                    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:1383:6: otherlv_7= 'comment' ( (lv_comment_8_0= ruleEString ) )
                    {
                    otherlv_7=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleInvariant2782); 

                        	newLeafNode(otherlv_7, grammarAccess.getInvariantAccess().getCommentKeyword_6_0());
                        
                    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:1387:1: ( (lv_comment_8_0= ruleEString ) )
                    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:1388:1: (lv_comment_8_0= ruleEString )
                    {
                    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:1388:1: (lv_comment_8_0= ruleEString )
                    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:1389:3: lv_comment_8_0= ruleEString
                    {
                     
                    	        newCompositeNode(grammarAccess.getInvariantAccess().getCommentEStringParserRuleCall_6_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleInvariant2803);
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

            otherlv_9=(Token)match(input,40,FollowSets000.FOLLOW_40_in_ruleInvariant2817); 

                	newLeafNode(otherlv_9, grammarAccess.getInvariantAccess().getPredicateKeyword_7());
                
            // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:1409:1: ( (lv_predicate_10_0= ruleEString ) )
            // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:1410:1: (lv_predicate_10_0= ruleEString )
            {
            // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:1410:1: (lv_predicate_10_0= ruleEString )
            // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:1411:3: lv_predicate_10_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getInvariantAccess().getPredicateEStringParserRuleCall_8_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleInvariant2838);
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

            // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:1427:2: (otherlv_11= 'annotations' otherlv_12= '{' ( (lv_annotations_13_0= ruleAnnotation ) ) (otherlv_14= ',' ( (lv_annotations_15_0= ruleAnnotation ) ) )* otherlv_16= '}' )?
            int alt45=2;
            int LA45_0 = input.LA(1);

            if ( (LA45_0==21) ) {
                alt45=1;
            }
            switch (alt45) {
                case 1 :
                    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:1427:4: otherlv_11= 'annotations' otherlv_12= '{' ( (lv_annotations_13_0= ruleAnnotation ) ) (otherlv_14= ',' ( (lv_annotations_15_0= ruleAnnotation ) ) )* otherlv_16= '}'
                    {
                    otherlv_11=(Token)match(input,21,FollowSets000.FOLLOW_21_in_ruleInvariant2851); 

                        	newLeafNode(otherlv_11, grammarAccess.getInvariantAccess().getAnnotationsKeyword_9_0());
                        
                    otherlv_12=(Token)match(input,13,FollowSets000.FOLLOW_13_in_ruleInvariant2863); 

                        	newLeafNode(otherlv_12, grammarAccess.getInvariantAccess().getLeftCurlyBracketKeyword_9_1());
                        
                    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:1435:1: ( (lv_annotations_13_0= ruleAnnotation ) )
                    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:1436:1: (lv_annotations_13_0= ruleAnnotation )
                    {
                    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:1436:1: (lv_annotations_13_0= ruleAnnotation )
                    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:1437:3: lv_annotations_13_0= ruleAnnotation
                    {
                     
                    	        newCompositeNode(grammarAccess.getInvariantAccess().getAnnotationsAnnotationParserRuleCall_9_2_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleAnnotation_in_ruleInvariant2884);
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

                    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:1453:2: (otherlv_14= ',' ( (lv_annotations_15_0= ruleAnnotation ) ) )*
                    loop44:
                    do {
                        int alt44=2;
                        int LA44_0 = input.LA(1);

                        if ( (LA44_0==18) ) {
                            alt44=1;
                        }


                        switch (alt44) {
                    	case 1 :
                    	    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:1453:4: otherlv_14= ',' ( (lv_annotations_15_0= ruleAnnotation ) )
                    	    {
                    	    otherlv_14=(Token)match(input,18,FollowSets000.FOLLOW_18_in_ruleInvariant2897); 

                    	        	newLeafNode(otherlv_14, grammarAccess.getInvariantAccess().getCommaKeyword_9_3_0());
                    	        
                    	    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:1457:1: ( (lv_annotations_15_0= ruleAnnotation ) )
                    	    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:1458:1: (lv_annotations_15_0= ruleAnnotation )
                    	    {
                    	    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:1458:1: (lv_annotations_15_0= ruleAnnotation )
                    	    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:1459:3: lv_annotations_15_0= ruleAnnotation
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getInvariantAccess().getAnnotationsAnnotationParserRuleCall_9_3_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleAnnotation_in_ruleInvariant2918);
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
                    	    break loop44;
                        }
                    } while (true);

                    otherlv_16=(Token)match(input,22,FollowSets000.FOLLOW_22_in_ruleInvariant2932); 

                        	newLeafNode(otherlv_16, grammarAccess.getInvariantAccess().getRightCurlyBracketKeyword_9_4());
                        

                    }
                    break;

            }

            // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:1479:3: (otherlv_17= 'extensions' otherlv_18= '{' ( (lv_extensions_19_0= ruleAbstractExtension ) ) (otherlv_20= ',' ( (lv_extensions_21_0= ruleAbstractExtension ) ) )* otherlv_22= '}' )?
            int alt47=2;
            int LA47_0 = input.LA(1);

            if ( (LA47_0==23) ) {
                alt47=1;
            }
            switch (alt47) {
                case 1 :
                    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:1479:5: otherlv_17= 'extensions' otherlv_18= '{' ( (lv_extensions_19_0= ruleAbstractExtension ) ) (otherlv_20= ',' ( (lv_extensions_21_0= ruleAbstractExtension ) ) )* otherlv_22= '}'
                    {
                    otherlv_17=(Token)match(input,23,FollowSets000.FOLLOW_23_in_ruleInvariant2947); 

                        	newLeafNode(otherlv_17, grammarAccess.getInvariantAccess().getExtensionsKeyword_10_0());
                        
                    otherlv_18=(Token)match(input,13,FollowSets000.FOLLOW_13_in_ruleInvariant2959); 

                        	newLeafNode(otherlv_18, grammarAccess.getInvariantAccess().getLeftCurlyBracketKeyword_10_1());
                        
                    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:1487:1: ( (lv_extensions_19_0= ruleAbstractExtension ) )
                    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:1488:1: (lv_extensions_19_0= ruleAbstractExtension )
                    {
                    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:1488:1: (lv_extensions_19_0= ruleAbstractExtension )
                    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:1489:3: lv_extensions_19_0= ruleAbstractExtension
                    {
                     
                    	        newCompositeNode(grammarAccess.getInvariantAccess().getExtensionsAbstractExtensionParserRuleCall_10_2_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleAbstractExtension_in_ruleInvariant2980);
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

                    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:1505:2: (otherlv_20= ',' ( (lv_extensions_21_0= ruleAbstractExtension ) ) )*
                    loop46:
                    do {
                        int alt46=2;
                        int LA46_0 = input.LA(1);

                        if ( (LA46_0==18) ) {
                            alt46=1;
                        }


                        switch (alt46) {
                    	case 1 :
                    	    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:1505:4: otherlv_20= ',' ( (lv_extensions_21_0= ruleAbstractExtension ) )
                    	    {
                    	    otherlv_20=(Token)match(input,18,FollowSets000.FOLLOW_18_in_ruleInvariant2993); 

                    	        	newLeafNode(otherlv_20, grammarAccess.getInvariantAccess().getCommaKeyword_10_3_0());
                    	        
                    	    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:1509:1: ( (lv_extensions_21_0= ruleAbstractExtension ) )
                    	    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:1510:1: (lv_extensions_21_0= ruleAbstractExtension )
                    	    {
                    	    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:1510:1: (lv_extensions_21_0= ruleAbstractExtension )
                    	    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:1511:3: lv_extensions_21_0= ruleAbstractExtension
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getInvariantAccess().getExtensionsAbstractExtensionParserRuleCall_10_3_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleAbstractExtension_in_ruleInvariant3014);
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
                    	    break loop46;
                        }
                    } while (true);

                    otherlv_22=(Token)match(input,22,FollowSets000.FOLLOW_22_in_ruleInvariant3028); 

                        	newLeafNode(otherlv_22, grammarAccess.getInvariantAccess().getRightCurlyBracketKeyword_10_4());
                        

                    }
                    break;

            }

            // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:1531:3: (otherlv_23= 'attributes' otherlv_24= '{' ( (lv_attributes_25_0= ruleStringToAttributeMapEntry ) ) (otherlv_26= ',' ( (lv_attributes_27_0= ruleStringToAttributeMapEntry ) ) )* otherlv_28= '}' )?
            int alt49=2;
            int LA49_0 = input.LA(1);

            if ( (LA49_0==24) ) {
                alt49=1;
            }
            switch (alt49) {
                case 1 :
                    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:1531:5: otherlv_23= 'attributes' otherlv_24= '{' ( (lv_attributes_25_0= ruleStringToAttributeMapEntry ) ) (otherlv_26= ',' ( (lv_attributes_27_0= ruleStringToAttributeMapEntry ) ) )* otherlv_28= '}'
                    {
                    otherlv_23=(Token)match(input,24,FollowSets000.FOLLOW_24_in_ruleInvariant3043); 

                        	newLeafNode(otherlv_23, grammarAccess.getInvariantAccess().getAttributesKeyword_11_0());
                        
                    otherlv_24=(Token)match(input,13,FollowSets000.FOLLOW_13_in_ruleInvariant3055); 

                        	newLeafNode(otherlv_24, grammarAccess.getInvariantAccess().getLeftCurlyBracketKeyword_11_1());
                        
                    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:1539:1: ( (lv_attributes_25_0= ruleStringToAttributeMapEntry ) )
                    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:1540:1: (lv_attributes_25_0= ruleStringToAttributeMapEntry )
                    {
                    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:1540:1: (lv_attributes_25_0= ruleStringToAttributeMapEntry )
                    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:1541:3: lv_attributes_25_0= ruleStringToAttributeMapEntry
                    {
                     
                    	        newCompositeNode(grammarAccess.getInvariantAccess().getAttributesStringToAttributeMapEntryParserRuleCall_11_2_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleStringToAttributeMapEntry_in_ruleInvariant3076);
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

                    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:1557:2: (otherlv_26= ',' ( (lv_attributes_27_0= ruleStringToAttributeMapEntry ) ) )*
                    loop48:
                    do {
                        int alt48=2;
                        int LA48_0 = input.LA(1);

                        if ( (LA48_0==18) ) {
                            alt48=1;
                        }


                        switch (alt48) {
                    	case 1 :
                    	    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:1557:4: otherlv_26= ',' ( (lv_attributes_27_0= ruleStringToAttributeMapEntry ) )
                    	    {
                    	    otherlv_26=(Token)match(input,18,FollowSets000.FOLLOW_18_in_ruleInvariant3089); 

                    	        	newLeafNode(otherlv_26, grammarAccess.getInvariantAccess().getCommaKeyword_11_3_0());
                    	        
                    	    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:1561:1: ( (lv_attributes_27_0= ruleStringToAttributeMapEntry ) )
                    	    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:1562:1: (lv_attributes_27_0= ruleStringToAttributeMapEntry )
                    	    {
                    	    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:1562:1: (lv_attributes_27_0= ruleStringToAttributeMapEntry )
                    	    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:1563:3: lv_attributes_27_0= ruleStringToAttributeMapEntry
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getInvariantAccess().getAttributesStringToAttributeMapEntryParserRuleCall_11_3_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleStringToAttributeMapEntry_in_ruleInvariant3110);
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
                    	    break loop48;
                        }
                    } while (true);

                    otherlv_28=(Token)match(input,22,FollowSets000.FOLLOW_22_in_ruleInvariant3124); 

                        	newLeafNode(otherlv_28, grammarAccess.getInvariantAccess().getRightCurlyBracketKeyword_11_4());
                        

                    }
                    break;

            }

            otherlv_29=(Token)match(input,22,FollowSets000.FOLLOW_22_in_ruleInvariant3138); 

                	newLeafNode(otherlv_29, grammarAccess.getInvariantAccess().getRightCurlyBracketKeyword_12());
                

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
    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:1595:1: entryRuleVariant returns [EObject current=null] : iv_ruleVariant= ruleVariant EOF ;
    public final EObject entryRuleVariant() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVariant = null;


        try {
            // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:1596:2: (iv_ruleVariant= ruleVariant EOF )
            // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:1597:2: iv_ruleVariant= ruleVariant EOF
            {
             newCompositeNode(grammarAccess.getVariantRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleVariant_in_entryRuleVariant3174);
            iv_ruleVariant=ruleVariant();

            state._fsp--;

             current =iv_ruleVariant; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleVariant3184); 

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
    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:1604:1: ruleVariant returns [EObject current=null] : ( ( (lv_localGenerated_0_0= 'localGenerated' ) )? otherlv_1= 'Variant' otherlv_2= '{' (otherlv_3= 'internalId' ( (lv_internalId_4_0= ruleEString ) ) )? (otherlv_5= 'comment' ( (lv_comment_6_0= ruleEString ) ) )? otherlv_7= 'expression' ( (lv_expression_8_0= ruleEString ) ) (otherlv_9= 'annotations' otherlv_10= '{' ( (lv_annotations_11_0= ruleAnnotation ) ) (otherlv_12= ',' ( (lv_annotations_13_0= ruleAnnotation ) ) )* otherlv_14= '}' )? (otherlv_15= 'extensions' otherlv_16= '{' ( (lv_extensions_17_0= ruleAbstractExtension ) ) (otherlv_18= ',' ( (lv_extensions_19_0= ruleAbstractExtension ) ) )* otherlv_20= '}' )? (otherlv_21= 'attributes' otherlv_22= '{' ( (lv_attributes_23_0= ruleStringToAttributeMapEntry ) ) (otherlv_24= ',' ( (lv_attributes_25_0= ruleStringToAttributeMapEntry ) ) )* otherlv_26= '}' )? otherlv_27= '}' ) ;
    public final EObject ruleVariant() throws RecognitionException {
        EObject current = null;

        Token lv_localGenerated_0_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
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
        Token otherlv_27=null;
        AntlrDatatypeRuleToken lv_internalId_4_0 = null;

        AntlrDatatypeRuleToken lv_comment_6_0 = null;

        AntlrDatatypeRuleToken lv_expression_8_0 = null;

        EObject lv_annotations_11_0 = null;

        EObject lv_annotations_13_0 = null;

        EObject lv_extensions_17_0 = null;

        EObject lv_extensions_19_0 = null;

        EObject lv_attributes_23_0 = null;

        EObject lv_attributes_25_0 = null;


         enterRule(); 
            
        try {
            // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:1607:28: ( ( ( (lv_localGenerated_0_0= 'localGenerated' ) )? otherlv_1= 'Variant' otherlv_2= '{' (otherlv_3= 'internalId' ( (lv_internalId_4_0= ruleEString ) ) )? (otherlv_5= 'comment' ( (lv_comment_6_0= ruleEString ) ) )? otherlv_7= 'expression' ( (lv_expression_8_0= ruleEString ) ) (otherlv_9= 'annotations' otherlv_10= '{' ( (lv_annotations_11_0= ruleAnnotation ) ) (otherlv_12= ',' ( (lv_annotations_13_0= ruleAnnotation ) ) )* otherlv_14= '}' )? (otherlv_15= 'extensions' otherlv_16= '{' ( (lv_extensions_17_0= ruleAbstractExtension ) ) (otherlv_18= ',' ( (lv_extensions_19_0= ruleAbstractExtension ) ) )* otherlv_20= '}' )? (otherlv_21= 'attributes' otherlv_22= '{' ( (lv_attributes_23_0= ruleStringToAttributeMapEntry ) ) (otherlv_24= ',' ( (lv_attributes_25_0= ruleStringToAttributeMapEntry ) ) )* otherlv_26= '}' )? otherlv_27= '}' ) )
            // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:1608:1: ( ( (lv_localGenerated_0_0= 'localGenerated' ) )? otherlv_1= 'Variant' otherlv_2= '{' (otherlv_3= 'internalId' ( (lv_internalId_4_0= ruleEString ) ) )? (otherlv_5= 'comment' ( (lv_comment_6_0= ruleEString ) ) )? otherlv_7= 'expression' ( (lv_expression_8_0= ruleEString ) ) (otherlv_9= 'annotations' otherlv_10= '{' ( (lv_annotations_11_0= ruleAnnotation ) ) (otherlv_12= ',' ( (lv_annotations_13_0= ruleAnnotation ) ) )* otherlv_14= '}' )? (otherlv_15= 'extensions' otherlv_16= '{' ( (lv_extensions_17_0= ruleAbstractExtension ) ) (otherlv_18= ',' ( (lv_extensions_19_0= ruleAbstractExtension ) ) )* otherlv_20= '}' )? (otherlv_21= 'attributes' otherlv_22= '{' ( (lv_attributes_23_0= ruleStringToAttributeMapEntry ) ) (otherlv_24= ',' ( (lv_attributes_25_0= ruleStringToAttributeMapEntry ) ) )* otherlv_26= '}' )? otherlv_27= '}' )
            {
            // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:1608:1: ( ( (lv_localGenerated_0_0= 'localGenerated' ) )? otherlv_1= 'Variant' otherlv_2= '{' (otherlv_3= 'internalId' ( (lv_internalId_4_0= ruleEString ) ) )? (otherlv_5= 'comment' ( (lv_comment_6_0= ruleEString ) ) )? otherlv_7= 'expression' ( (lv_expression_8_0= ruleEString ) ) (otherlv_9= 'annotations' otherlv_10= '{' ( (lv_annotations_11_0= ruleAnnotation ) ) (otherlv_12= ',' ( (lv_annotations_13_0= ruleAnnotation ) ) )* otherlv_14= '}' )? (otherlv_15= 'extensions' otherlv_16= '{' ( (lv_extensions_17_0= ruleAbstractExtension ) ) (otherlv_18= ',' ( (lv_extensions_19_0= ruleAbstractExtension ) ) )* otherlv_20= '}' )? (otherlv_21= 'attributes' otherlv_22= '{' ( (lv_attributes_23_0= ruleStringToAttributeMapEntry ) ) (otherlv_24= ',' ( (lv_attributes_25_0= ruleStringToAttributeMapEntry ) ) )* otherlv_26= '}' )? otherlv_27= '}' )
            // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:1608:2: ( (lv_localGenerated_0_0= 'localGenerated' ) )? otherlv_1= 'Variant' otherlv_2= '{' (otherlv_3= 'internalId' ( (lv_internalId_4_0= ruleEString ) ) )? (otherlv_5= 'comment' ( (lv_comment_6_0= ruleEString ) ) )? otherlv_7= 'expression' ( (lv_expression_8_0= ruleEString ) ) (otherlv_9= 'annotations' otherlv_10= '{' ( (lv_annotations_11_0= ruleAnnotation ) ) (otherlv_12= ',' ( (lv_annotations_13_0= ruleAnnotation ) ) )* otherlv_14= '}' )? (otherlv_15= 'extensions' otherlv_16= '{' ( (lv_extensions_17_0= ruleAbstractExtension ) ) (otherlv_18= ',' ( (lv_extensions_19_0= ruleAbstractExtension ) ) )* otherlv_20= '}' )? (otherlv_21= 'attributes' otherlv_22= '{' ( (lv_attributes_23_0= ruleStringToAttributeMapEntry ) ) (otherlv_24= ',' ( (lv_attributes_25_0= ruleStringToAttributeMapEntry ) ) )* otherlv_26= '}' )? otherlv_27= '}'
            {
            // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:1608:2: ( (lv_localGenerated_0_0= 'localGenerated' ) )?
            int alt50=2;
            int LA50_0 = input.LA(1);

            if ( (LA50_0==11) ) {
                alt50=1;
            }
            switch (alt50) {
                case 1 :
                    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:1609:1: (lv_localGenerated_0_0= 'localGenerated' )
                    {
                    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:1609:1: (lv_localGenerated_0_0= 'localGenerated' )
                    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:1610:3: lv_localGenerated_0_0= 'localGenerated'
                    {
                    lv_localGenerated_0_0=(Token)match(input,11,FollowSets000.FOLLOW_11_in_ruleVariant3227); 

                            newLeafNode(lv_localGenerated_0_0, grammarAccess.getVariantAccess().getLocalGeneratedLocalGeneratedKeyword_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getVariantRule());
                    	        }
                           		setWithLastConsumed(current, "localGenerated", true, "localGenerated");
                    	    

                    }


                    }
                    break;

            }

            otherlv_1=(Token)match(input,41,FollowSets000.FOLLOW_41_in_ruleVariant3253); 

                	newLeafNode(otherlv_1, grammarAccess.getVariantAccess().getVariantKeyword_1());
                
            otherlv_2=(Token)match(input,13,FollowSets000.FOLLOW_13_in_ruleVariant3265); 

                	newLeafNode(otherlv_2, grammarAccess.getVariantAccess().getLeftCurlyBracketKeyword_2());
                
            // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:1631:1: (otherlv_3= 'internalId' ( (lv_internalId_4_0= ruleEString ) ) )?
            int alt51=2;
            int LA51_0 = input.LA(1);

            if ( (LA51_0==14) ) {
                alt51=1;
            }
            switch (alt51) {
                case 1 :
                    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:1631:3: otherlv_3= 'internalId' ( (lv_internalId_4_0= ruleEString ) )
                    {
                    otherlv_3=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleVariant3278); 

                        	newLeafNode(otherlv_3, grammarAccess.getVariantAccess().getInternalIdKeyword_3_0());
                        
                    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:1635:1: ( (lv_internalId_4_0= ruleEString ) )
                    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:1636:1: (lv_internalId_4_0= ruleEString )
                    {
                    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:1636:1: (lv_internalId_4_0= ruleEString )
                    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:1637:3: lv_internalId_4_0= ruleEString
                    {
                     
                    	        newCompositeNode(grammarAccess.getVariantAccess().getInternalIdEStringParserRuleCall_3_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleVariant3299);
                    lv_internalId_4_0=ruleEString();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getVariantRule());
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

            // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:1653:4: (otherlv_5= 'comment' ( (lv_comment_6_0= ruleEString ) ) )?
            int alt52=2;
            int LA52_0 = input.LA(1);

            if ( (LA52_0==15) ) {
                alt52=1;
            }
            switch (alt52) {
                case 1 :
                    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:1653:6: otherlv_5= 'comment' ( (lv_comment_6_0= ruleEString ) )
                    {
                    otherlv_5=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleVariant3314); 

                        	newLeafNode(otherlv_5, grammarAccess.getVariantAccess().getCommentKeyword_4_0());
                        
                    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:1657:1: ( (lv_comment_6_0= ruleEString ) )
                    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:1658:1: (lv_comment_6_0= ruleEString )
                    {
                    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:1658:1: (lv_comment_6_0= ruleEString )
                    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:1659:3: lv_comment_6_0= ruleEString
                    {
                     
                    	        newCompositeNode(grammarAccess.getVariantAccess().getCommentEStringParserRuleCall_4_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleVariant3335);
                    lv_comment_6_0=ruleEString();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getVariantRule());
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

            otherlv_7=(Token)match(input,42,FollowSets000.FOLLOW_42_in_ruleVariant3349); 

                	newLeafNode(otherlv_7, grammarAccess.getVariantAccess().getExpressionKeyword_5());
                
            // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:1679:1: ( (lv_expression_8_0= ruleEString ) )
            // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:1680:1: (lv_expression_8_0= ruleEString )
            {
            // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:1680:1: (lv_expression_8_0= ruleEString )
            // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:1681:3: lv_expression_8_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getVariantAccess().getExpressionEStringParserRuleCall_6_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleVariant3370);
            lv_expression_8_0=ruleEString();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getVariantRule());
            	        }
                   		set(
                   			current, 
                   			"expression",
                    		lv_expression_8_0, 
                    		"EString");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:1697:2: (otherlv_9= 'annotations' otherlv_10= '{' ( (lv_annotations_11_0= ruleAnnotation ) ) (otherlv_12= ',' ( (lv_annotations_13_0= ruleAnnotation ) ) )* otherlv_14= '}' )?
            int alt54=2;
            int LA54_0 = input.LA(1);

            if ( (LA54_0==21) ) {
                alt54=1;
            }
            switch (alt54) {
                case 1 :
                    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:1697:4: otherlv_9= 'annotations' otherlv_10= '{' ( (lv_annotations_11_0= ruleAnnotation ) ) (otherlv_12= ',' ( (lv_annotations_13_0= ruleAnnotation ) ) )* otherlv_14= '}'
                    {
                    otherlv_9=(Token)match(input,21,FollowSets000.FOLLOW_21_in_ruleVariant3383); 

                        	newLeafNode(otherlv_9, grammarAccess.getVariantAccess().getAnnotationsKeyword_7_0());
                        
                    otherlv_10=(Token)match(input,13,FollowSets000.FOLLOW_13_in_ruleVariant3395); 

                        	newLeafNode(otherlv_10, grammarAccess.getVariantAccess().getLeftCurlyBracketKeyword_7_1());
                        
                    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:1705:1: ( (lv_annotations_11_0= ruleAnnotation ) )
                    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:1706:1: (lv_annotations_11_0= ruleAnnotation )
                    {
                    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:1706:1: (lv_annotations_11_0= ruleAnnotation )
                    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:1707:3: lv_annotations_11_0= ruleAnnotation
                    {
                     
                    	        newCompositeNode(grammarAccess.getVariantAccess().getAnnotationsAnnotationParserRuleCall_7_2_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleAnnotation_in_ruleVariant3416);
                    lv_annotations_11_0=ruleAnnotation();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getVariantRule());
                    	        }
                           		add(
                           			current, 
                           			"annotations",
                            		lv_annotations_11_0, 
                            		"Annotation");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:1723:2: (otherlv_12= ',' ( (lv_annotations_13_0= ruleAnnotation ) ) )*
                    loop53:
                    do {
                        int alt53=2;
                        int LA53_0 = input.LA(1);

                        if ( (LA53_0==18) ) {
                            alt53=1;
                        }


                        switch (alt53) {
                    	case 1 :
                    	    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:1723:4: otherlv_12= ',' ( (lv_annotations_13_0= ruleAnnotation ) )
                    	    {
                    	    otherlv_12=(Token)match(input,18,FollowSets000.FOLLOW_18_in_ruleVariant3429); 

                    	        	newLeafNode(otherlv_12, grammarAccess.getVariantAccess().getCommaKeyword_7_3_0());
                    	        
                    	    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:1727:1: ( (lv_annotations_13_0= ruleAnnotation ) )
                    	    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:1728:1: (lv_annotations_13_0= ruleAnnotation )
                    	    {
                    	    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:1728:1: (lv_annotations_13_0= ruleAnnotation )
                    	    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:1729:3: lv_annotations_13_0= ruleAnnotation
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getVariantAccess().getAnnotationsAnnotationParserRuleCall_7_3_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleAnnotation_in_ruleVariant3450);
                    	    lv_annotations_13_0=ruleAnnotation();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getVariantRule());
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
                    	    break loop53;
                        }
                    } while (true);

                    otherlv_14=(Token)match(input,22,FollowSets000.FOLLOW_22_in_ruleVariant3464); 

                        	newLeafNode(otherlv_14, grammarAccess.getVariantAccess().getRightCurlyBracketKeyword_7_4());
                        

                    }
                    break;

            }

            // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:1749:3: (otherlv_15= 'extensions' otherlv_16= '{' ( (lv_extensions_17_0= ruleAbstractExtension ) ) (otherlv_18= ',' ( (lv_extensions_19_0= ruleAbstractExtension ) ) )* otherlv_20= '}' )?
            int alt56=2;
            int LA56_0 = input.LA(1);

            if ( (LA56_0==23) ) {
                alt56=1;
            }
            switch (alt56) {
                case 1 :
                    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:1749:5: otherlv_15= 'extensions' otherlv_16= '{' ( (lv_extensions_17_0= ruleAbstractExtension ) ) (otherlv_18= ',' ( (lv_extensions_19_0= ruleAbstractExtension ) ) )* otherlv_20= '}'
                    {
                    otherlv_15=(Token)match(input,23,FollowSets000.FOLLOW_23_in_ruleVariant3479); 

                        	newLeafNode(otherlv_15, grammarAccess.getVariantAccess().getExtensionsKeyword_8_0());
                        
                    otherlv_16=(Token)match(input,13,FollowSets000.FOLLOW_13_in_ruleVariant3491); 

                        	newLeafNode(otherlv_16, grammarAccess.getVariantAccess().getLeftCurlyBracketKeyword_8_1());
                        
                    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:1757:1: ( (lv_extensions_17_0= ruleAbstractExtension ) )
                    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:1758:1: (lv_extensions_17_0= ruleAbstractExtension )
                    {
                    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:1758:1: (lv_extensions_17_0= ruleAbstractExtension )
                    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:1759:3: lv_extensions_17_0= ruleAbstractExtension
                    {
                     
                    	        newCompositeNode(grammarAccess.getVariantAccess().getExtensionsAbstractExtensionParserRuleCall_8_2_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleAbstractExtension_in_ruleVariant3512);
                    lv_extensions_17_0=ruleAbstractExtension();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getVariantRule());
                    	        }
                           		add(
                           			current, 
                           			"extensions",
                            		lv_extensions_17_0, 
                            		"AbstractExtension");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:1775:2: (otherlv_18= ',' ( (lv_extensions_19_0= ruleAbstractExtension ) ) )*
                    loop55:
                    do {
                        int alt55=2;
                        int LA55_0 = input.LA(1);

                        if ( (LA55_0==18) ) {
                            alt55=1;
                        }


                        switch (alt55) {
                    	case 1 :
                    	    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:1775:4: otherlv_18= ',' ( (lv_extensions_19_0= ruleAbstractExtension ) )
                    	    {
                    	    otherlv_18=(Token)match(input,18,FollowSets000.FOLLOW_18_in_ruleVariant3525); 

                    	        	newLeafNode(otherlv_18, grammarAccess.getVariantAccess().getCommaKeyword_8_3_0());
                    	        
                    	    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:1779:1: ( (lv_extensions_19_0= ruleAbstractExtension ) )
                    	    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:1780:1: (lv_extensions_19_0= ruleAbstractExtension )
                    	    {
                    	    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:1780:1: (lv_extensions_19_0= ruleAbstractExtension )
                    	    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:1781:3: lv_extensions_19_0= ruleAbstractExtension
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getVariantAccess().getExtensionsAbstractExtensionParserRuleCall_8_3_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleAbstractExtension_in_ruleVariant3546);
                    	    lv_extensions_19_0=ruleAbstractExtension();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getVariantRule());
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
                    	    break loop55;
                        }
                    } while (true);

                    otherlv_20=(Token)match(input,22,FollowSets000.FOLLOW_22_in_ruleVariant3560); 

                        	newLeafNode(otherlv_20, grammarAccess.getVariantAccess().getRightCurlyBracketKeyword_8_4());
                        

                    }
                    break;

            }

            // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:1801:3: (otherlv_21= 'attributes' otherlv_22= '{' ( (lv_attributes_23_0= ruleStringToAttributeMapEntry ) ) (otherlv_24= ',' ( (lv_attributes_25_0= ruleStringToAttributeMapEntry ) ) )* otherlv_26= '}' )?
            int alt58=2;
            int LA58_0 = input.LA(1);

            if ( (LA58_0==24) ) {
                alt58=1;
            }
            switch (alt58) {
                case 1 :
                    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:1801:5: otherlv_21= 'attributes' otherlv_22= '{' ( (lv_attributes_23_0= ruleStringToAttributeMapEntry ) ) (otherlv_24= ',' ( (lv_attributes_25_0= ruleStringToAttributeMapEntry ) ) )* otherlv_26= '}'
                    {
                    otherlv_21=(Token)match(input,24,FollowSets000.FOLLOW_24_in_ruleVariant3575); 

                        	newLeafNode(otherlv_21, grammarAccess.getVariantAccess().getAttributesKeyword_9_0());
                        
                    otherlv_22=(Token)match(input,13,FollowSets000.FOLLOW_13_in_ruleVariant3587); 

                        	newLeafNode(otherlv_22, grammarAccess.getVariantAccess().getLeftCurlyBracketKeyword_9_1());
                        
                    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:1809:1: ( (lv_attributes_23_0= ruleStringToAttributeMapEntry ) )
                    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:1810:1: (lv_attributes_23_0= ruleStringToAttributeMapEntry )
                    {
                    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:1810:1: (lv_attributes_23_0= ruleStringToAttributeMapEntry )
                    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:1811:3: lv_attributes_23_0= ruleStringToAttributeMapEntry
                    {
                     
                    	        newCompositeNode(grammarAccess.getVariantAccess().getAttributesStringToAttributeMapEntryParserRuleCall_9_2_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleStringToAttributeMapEntry_in_ruleVariant3608);
                    lv_attributes_23_0=ruleStringToAttributeMapEntry();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getVariantRule());
                    	        }
                           		add(
                           			current, 
                           			"attributes",
                            		lv_attributes_23_0, 
                            		"StringToAttributeMapEntry");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:1827:2: (otherlv_24= ',' ( (lv_attributes_25_0= ruleStringToAttributeMapEntry ) ) )*
                    loop57:
                    do {
                        int alt57=2;
                        int LA57_0 = input.LA(1);

                        if ( (LA57_0==18) ) {
                            alt57=1;
                        }


                        switch (alt57) {
                    	case 1 :
                    	    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:1827:4: otherlv_24= ',' ( (lv_attributes_25_0= ruleStringToAttributeMapEntry ) )
                    	    {
                    	    otherlv_24=(Token)match(input,18,FollowSets000.FOLLOW_18_in_ruleVariant3621); 

                    	        	newLeafNode(otherlv_24, grammarAccess.getVariantAccess().getCommaKeyword_9_3_0());
                    	        
                    	    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:1831:1: ( (lv_attributes_25_0= ruleStringToAttributeMapEntry ) )
                    	    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:1832:1: (lv_attributes_25_0= ruleStringToAttributeMapEntry )
                    	    {
                    	    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:1832:1: (lv_attributes_25_0= ruleStringToAttributeMapEntry )
                    	    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:1833:3: lv_attributes_25_0= ruleStringToAttributeMapEntry
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getVariantAccess().getAttributesStringToAttributeMapEntryParserRuleCall_9_3_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleStringToAttributeMapEntry_in_ruleVariant3642);
                    	    lv_attributes_25_0=ruleStringToAttributeMapEntry();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getVariantRule());
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
                    	    break loop57;
                        }
                    } while (true);

                    otherlv_26=(Token)match(input,22,FollowSets000.FOLLOW_22_in_ruleVariant3656); 

                        	newLeafNode(otherlv_26, grammarAccess.getVariantAccess().getRightCurlyBracketKeyword_9_4());
                        

                    }
                    break;

            }

            otherlv_27=(Token)match(input,22,FollowSets000.FOLLOW_22_in_ruleVariant3670); 

                	newLeafNode(otherlv_27, grammarAccess.getVariantAccess().getRightCurlyBracketKeyword_10());
                

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
    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:1865:1: entryRuleEvent returns [EObject current=null] : iv_ruleEvent= ruleEvent EOF ;
    public final EObject entryRuleEvent() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEvent = null;


        try {
            // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:1866:2: (iv_ruleEvent= ruleEvent EOF )
            // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:1867:2: iv_ruleEvent= ruleEvent EOF
            {
             newCompositeNode(grammarAccess.getEventRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleEvent_in_entryRuleEvent3706);
            iv_ruleEvent=ruleEvent();

            state._fsp--;

             current =iv_ruleEvent; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleEvent3716); 

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
    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:1874:1: ruleEvent returns [EObject current=null] : ( () ( (lv_localGenerated_1_0= 'localGenerated' ) )? ( (lv_extended_2_0= 'extended' ) )? otherlv_3= 'Event' ( (lv_name_4_0= ruleEString ) ) otherlv_5= '{' (otherlv_6= 'internalId' ( (lv_internalId_7_0= ruleEString ) ) )? (otherlv_8= 'comment' ( (lv_comment_9_0= ruleEString ) ) )? (otherlv_10= 'convergence' ( (lv_convergence_11_0= ruleConvergence ) ) )? (otherlv_12= 'refines' otherlv_13= '(' ( ( ruleEString ) ) (otherlv_15= ',' ( ( ruleEString ) ) )* otherlv_17= ')' )? (otherlv_18= 'annotations' otherlv_19= '{' ( (lv_annotations_20_0= ruleAnnotation ) ) (otherlv_21= ',' ( (lv_annotations_22_0= ruleAnnotation ) ) )* otherlv_23= '}' )? (otherlv_24= 'extensions' otherlv_25= '{' ( (lv_extensions_26_0= ruleAbstractExtension ) ) (otherlv_27= ',' ( (lv_extensions_28_0= ruleAbstractExtension ) ) )* otherlv_29= '}' )? (otherlv_30= 'attributes' otherlv_31= '{' ( (lv_attributes_32_0= ruleStringToAttributeMapEntry ) ) (otherlv_33= ',' ( (lv_attributes_34_0= ruleStringToAttributeMapEntry ) ) )* otherlv_35= '}' )? (otherlv_36= 'parameters' otherlv_37= '{' ( (lv_parameters_38_0= ruleParameter ) ) (otherlv_39= ',' ( (lv_parameters_40_0= ruleParameter ) ) )* otherlv_41= '}' )? (otherlv_42= 'guards' otherlv_43= '{' ( (lv_guards_44_0= ruleGuard ) ) (otherlv_45= ',' ( (lv_guards_46_0= ruleGuard ) ) )* otherlv_47= '}' )? (otherlv_48= 'witnesses' otherlv_49= '{' ( (lv_witnesses_50_0= ruleWitness ) ) (otherlv_51= ',' ( (lv_witnesses_52_0= ruleWitness ) ) )* otherlv_53= '}' )? (otherlv_54= 'actions' otherlv_55= '{' ( (lv_actions_56_0= ruleAction ) ) (otherlv_57= ',' ( (lv_actions_58_0= ruleAction ) ) )* otherlv_59= '}' )? otherlv_60= '}' ) ;
    public final EObject ruleEvent() throws RecognitionException {
        EObject current = null;

        Token lv_localGenerated_1_0=null;
        Token lv_extended_2_0=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        Token otherlv_13=null;
        Token otherlv_15=null;
        Token otherlv_17=null;
        Token otherlv_18=null;
        Token otherlv_19=null;
        Token otherlv_21=null;
        Token otherlv_23=null;
        Token otherlv_24=null;
        Token otherlv_25=null;
        Token otherlv_27=null;
        Token otherlv_29=null;
        Token otherlv_30=null;
        Token otherlv_31=null;
        Token otherlv_33=null;
        Token otherlv_35=null;
        Token otherlv_36=null;
        Token otherlv_37=null;
        Token otherlv_39=null;
        Token otherlv_41=null;
        Token otherlv_42=null;
        Token otherlv_43=null;
        Token otherlv_45=null;
        Token otherlv_47=null;
        Token otherlv_48=null;
        Token otherlv_49=null;
        Token otherlv_51=null;
        Token otherlv_53=null;
        Token otherlv_54=null;
        Token otherlv_55=null;
        Token otherlv_57=null;
        Token otherlv_59=null;
        Token otherlv_60=null;
        AntlrDatatypeRuleToken lv_name_4_0 = null;

        AntlrDatatypeRuleToken lv_internalId_7_0 = null;

        AntlrDatatypeRuleToken lv_comment_9_0 = null;

        Enumerator lv_convergence_11_0 = null;

        EObject lv_annotations_20_0 = null;

        EObject lv_annotations_22_0 = null;

        EObject lv_extensions_26_0 = null;

        EObject lv_extensions_28_0 = null;

        EObject lv_attributes_32_0 = null;

        EObject lv_attributes_34_0 = null;

        EObject lv_parameters_38_0 = null;

        EObject lv_parameters_40_0 = null;

        EObject lv_guards_44_0 = null;

        EObject lv_guards_46_0 = null;

        EObject lv_witnesses_50_0 = null;

        EObject lv_witnesses_52_0 = null;

        EObject lv_actions_56_0 = null;

        EObject lv_actions_58_0 = null;


         enterRule(); 
            
        try {
            // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:1877:28: ( ( () ( (lv_localGenerated_1_0= 'localGenerated' ) )? ( (lv_extended_2_0= 'extended' ) )? otherlv_3= 'Event' ( (lv_name_4_0= ruleEString ) ) otherlv_5= '{' (otherlv_6= 'internalId' ( (lv_internalId_7_0= ruleEString ) ) )? (otherlv_8= 'comment' ( (lv_comment_9_0= ruleEString ) ) )? (otherlv_10= 'convergence' ( (lv_convergence_11_0= ruleConvergence ) ) )? (otherlv_12= 'refines' otherlv_13= '(' ( ( ruleEString ) ) (otherlv_15= ',' ( ( ruleEString ) ) )* otherlv_17= ')' )? (otherlv_18= 'annotations' otherlv_19= '{' ( (lv_annotations_20_0= ruleAnnotation ) ) (otherlv_21= ',' ( (lv_annotations_22_0= ruleAnnotation ) ) )* otherlv_23= '}' )? (otherlv_24= 'extensions' otherlv_25= '{' ( (lv_extensions_26_0= ruleAbstractExtension ) ) (otherlv_27= ',' ( (lv_extensions_28_0= ruleAbstractExtension ) ) )* otherlv_29= '}' )? (otherlv_30= 'attributes' otherlv_31= '{' ( (lv_attributes_32_0= ruleStringToAttributeMapEntry ) ) (otherlv_33= ',' ( (lv_attributes_34_0= ruleStringToAttributeMapEntry ) ) )* otherlv_35= '}' )? (otherlv_36= 'parameters' otherlv_37= '{' ( (lv_parameters_38_0= ruleParameter ) ) (otherlv_39= ',' ( (lv_parameters_40_0= ruleParameter ) ) )* otherlv_41= '}' )? (otherlv_42= 'guards' otherlv_43= '{' ( (lv_guards_44_0= ruleGuard ) ) (otherlv_45= ',' ( (lv_guards_46_0= ruleGuard ) ) )* otherlv_47= '}' )? (otherlv_48= 'witnesses' otherlv_49= '{' ( (lv_witnesses_50_0= ruleWitness ) ) (otherlv_51= ',' ( (lv_witnesses_52_0= ruleWitness ) ) )* otherlv_53= '}' )? (otherlv_54= 'actions' otherlv_55= '{' ( (lv_actions_56_0= ruleAction ) ) (otherlv_57= ',' ( (lv_actions_58_0= ruleAction ) ) )* otherlv_59= '}' )? otherlv_60= '}' ) )
            // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:1878:1: ( () ( (lv_localGenerated_1_0= 'localGenerated' ) )? ( (lv_extended_2_0= 'extended' ) )? otherlv_3= 'Event' ( (lv_name_4_0= ruleEString ) ) otherlv_5= '{' (otherlv_6= 'internalId' ( (lv_internalId_7_0= ruleEString ) ) )? (otherlv_8= 'comment' ( (lv_comment_9_0= ruleEString ) ) )? (otherlv_10= 'convergence' ( (lv_convergence_11_0= ruleConvergence ) ) )? (otherlv_12= 'refines' otherlv_13= '(' ( ( ruleEString ) ) (otherlv_15= ',' ( ( ruleEString ) ) )* otherlv_17= ')' )? (otherlv_18= 'annotations' otherlv_19= '{' ( (lv_annotations_20_0= ruleAnnotation ) ) (otherlv_21= ',' ( (lv_annotations_22_0= ruleAnnotation ) ) )* otherlv_23= '}' )? (otherlv_24= 'extensions' otherlv_25= '{' ( (lv_extensions_26_0= ruleAbstractExtension ) ) (otherlv_27= ',' ( (lv_extensions_28_0= ruleAbstractExtension ) ) )* otherlv_29= '}' )? (otherlv_30= 'attributes' otherlv_31= '{' ( (lv_attributes_32_0= ruleStringToAttributeMapEntry ) ) (otherlv_33= ',' ( (lv_attributes_34_0= ruleStringToAttributeMapEntry ) ) )* otherlv_35= '}' )? (otherlv_36= 'parameters' otherlv_37= '{' ( (lv_parameters_38_0= ruleParameter ) ) (otherlv_39= ',' ( (lv_parameters_40_0= ruleParameter ) ) )* otherlv_41= '}' )? (otherlv_42= 'guards' otherlv_43= '{' ( (lv_guards_44_0= ruleGuard ) ) (otherlv_45= ',' ( (lv_guards_46_0= ruleGuard ) ) )* otherlv_47= '}' )? (otherlv_48= 'witnesses' otherlv_49= '{' ( (lv_witnesses_50_0= ruleWitness ) ) (otherlv_51= ',' ( (lv_witnesses_52_0= ruleWitness ) ) )* otherlv_53= '}' )? (otherlv_54= 'actions' otherlv_55= '{' ( (lv_actions_56_0= ruleAction ) ) (otherlv_57= ',' ( (lv_actions_58_0= ruleAction ) ) )* otherlv_59= '}' )? otherlv_60= '}' )
            {
            // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:1878:1: ( () ( (lv_localGenerated_1_0= 'localGenerated' ) )? ( (lv_extended_2_0= 'extended' ) )? otherlv_3= 'Event' ( (lv_name_4_0= ruleEString ) ) otherlv_5= '{' (otherlv_6= 'internalId' ( (lv_internalId_7_0= ruleEString ) ) )? (otherlv_8= 'comment' ( (lv_comment_9_0= ruleEString ) ) )? (otherlv_10= 'convergence' ( (lv_convergence_11_0= ruleConvergence ) ) )? (otherlv_12= 'refines' otherlv_13= '(' ( ( ruleEString ) ) (otherlv_15= ',' ( ( ruleEString ) ) )* otherlv_17= ')' )? (otherlv_18= 'annotations' otherlv_19= '{' ( (lv_annotations_20_0= ruleAnnotation ) ) (otherlv_21= ',' ( (lv_annotations_22_0= ruleAnnotation ) ) )* otherlv_23= '}' )? (otherlv_24= 'extensions' otherlv_25= '{' ( (lv_extensions_26_0= ruleAbstractExtension ) ) (otherlv_27= ',' ( (lv_extensions_28_0= ruleAbstractExtension ) ) )* otherlv_29= '}' )? (otherlv_30= 'attributes' otherlv_31= '{' ( (lv_attributes_32_0= ruleStringToAttributeMapEntry ) ) (otherlv_33= ',' ( (lv_attributes_34_0= ruleStringToAttributeMapEntry ) ) )* otherlv_35= '}' )? (otherlv_36= 'parameters' otherlv_37= '{' ( (lv_parameters_38_0= ruleParameter ) ) (otherlv_39= ',' ( (lv_parameters_40_0= ruleParameter ) ) )* otherlv_41= '}' )? (otherlv_42= 'guards' otherlv_43= '{' ( (lv_guards_44_0= ruleGuard ) ) (otherlv_45= ',' ( (lv_guards_46_0= ruleGuard ) ) )* otherlv_47= '}' )? (otherlv_48= 'witnesses' otherlv_49= '{' ( (lv_witnesses_50_0= ruleWitness ) ) (otherlv_51= ',' ( (lv_witnesses_52_0= ruleWitness ) ) )* otherlv_53= '}' )? (otherlv_54= 'actions' otherlv_55= '{' ( (lv_actions_56_0= ruleAction ) ) (otherlv_57= ',' ( (lv_actions_58_0= ruleAction ) ) )* otherlv_59= '}' )? otherlv_60= '}' )
            // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:1878:2: () ( (lv_localGenerated_1_0= 'localGenerated' ) )? ( (lv_extended_2_0= 'extended' ) )? otherlv_3= 'Event' ( (lv_name_4_0= ruleEString ) ) otherlv_5= '{' (otherlv_6= 'internalId' ( (lv_internalId_7_0= ruleEString ) ) )? (otherlv_8= 'comment' ( (lv_comment_9_0= ruleEString ) ) )? (otherlv_10= 'convergence' ( (lv_convergence_11_0= ruleConvergence ) ) )? (otherlv_12= 'refines' otherlv_13= '(' ( ( ruleEString ) ) (otherlv_15= ',' ( ( ruleEString ) ) )* otherlv_17= ')' )? (otherlv_18= 'annotations' otherlv_19= '{' ( (lv_annotations_20_0= ruleAnnotation ) ) (otherlv_21= ',' ( (lv_annotations_22_0= ruleAnnotation ) ) )* otherlv_23= '}' )? (otherlv_24= 'extensions' otherlv_25= '{' ( (lv_extensions_26_0= ruleAbstractExtension ) ) (otherlv_27= ',' ( (lv_extensions_28_0= ruleAbstractExtension ) ) )* otherlv_29= '}' )? (otherlv_30= 'attributes' otherlv_31= '{' ( (lv_attributes_32_0= ruleStringToAttributeMapEntry ) ) (otherlv_33= ',' ( (lv_attributes_34_0= ruleStringToAttributeMapEntry ) ) )* otherlv_35= '}' )? (otherlv_36= 'parameters' otherlv_37= '{' ( (lv_parameters_38_0= ruleParameter ) ) (otherlv_39= ',' ( (lv_parameters_40_0= ruleParameter ) ) )* otherlv_41= '}' )? (otherlv_42= 'guards' otherlv_43= '{' ( (lv_guards_44_0= ruleGuard ) ) (otherlv_45= ',' ( (lv_guards_46_0= ruleGuard ) ) )* otherlv_47= '}' )? (otherlv_48= 'witnesses' otherlv_49= '{' ( (lv_witnesses_50_0= ruleWitness ) ) (otherlv_51= ',' ( (lv_witnesses_52_0= ruleWitness ) ) )* otherlv_53= '}' )? (otherlv_54= 'actions' otherlv_55= '{' ( (lv_actions_56_0= ruleAction ) ) (otherlv_57= ',' ( (lv_actions_58_0= ruleAction ) ) )* otherlv_59= '}' )? otherlv_60= '}'
            {
            // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:1878:2: ()
            // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:1879:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getEventAccess().getEventAction_0(),
                        current);
                

            }

            // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:1884:2: ( (lv_localGenerated_1_0= 'localGenerated' ) )?
            int alt59=2;
            int LA59_0 = input.LA(1);

            if ( (LA59_0==11) ) {
                alt59=1;
            }
            switch (alt59) {
                case 1 :
                    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:1885:1: (lv_localGenerated_1_0= 'localGenerated' )
                    {
                    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:1885:1: (lv_localGenerated_1_0= 'localGenerated' )
                    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:1886:3: lv_localGenerated_1_0= 'localGenerated'
                    {
                    lv_localGenerated_1_0=(Token)match(input,11,FollowSets000.FOLLOW_11_in_ruleEvent3768); 

                            newLeafNode(lv_localGenerated_1_0, grammarAccess.getEventAccess().getLocalGeneratedLocalGeneratedKeyword_1_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getEventRule());
                    	        }
                           		setWithLastConsumed(current, "localGenerated", true, "localGenerated");
                    	    

                    }


                    }
                    break;

            }

            // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:1899:3: ( (lv_extended_2_0= 'extended' ) )?
            int alt60=2;
            int LA60_0 = input.LA(1);

            if ( (LA60_0==43) ) {
                alt60=1;
            }
            switch (alt60) {
                case 1 :
                    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:1900:1: (lv_extended_2_0= 'extended' )
                    {
                    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:1900:1: (lv_extended_2_0= 'extended' )
                    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:1901:3: lv_extended_2_0= 'extended'
                    {
                    lv_extended_2_0=(Token)match(input,43,FollowSets000.FOLLOW_43_in_ruleEvent3800); 

                            newLeafNode(lv_extended_2_0, grammarAccess.getEventAccess().getExtendedExtendedKeyword_2_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getEventRule());
                    	        }
                           		setWithLastConsumed(current, "extended", true, "extended");
                    	    

                    }


                    }
                    break;

            }

            otherlv_3=(Token)match(input,44,FollowSets000.FOLLOW_44_in_ruleEvent3826); 

                	newLeafNode(otherlv_3, grammarAccess.getEventAccess().getEventKeyword_3());
                
            // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:1918:1: ( (lv_name_4_0= ruleEString ) )
            // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:1919:1: (lv_name_4_0= ruleEString )
            {
            // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:1919:1: (lv_name_4_0= ruleEString )
            // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:1920:3: lv_name_4_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getEventAccess().getNameEStringParserRuleCall_4_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleEvent3847);
            lv_name_4_0=ruleEString();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getEventRule());
            	        }
                   		set(
                   			current, 
                   			"name",
                    		lv_name_4_0, 
                    		"EString");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_5=(Token)match(input,13,FollowSets000.FOLLOW_13_in_ruleEvent3859); 

                	newLeafNode(otherlv_5, grammarAccess.getEventAccess().getLeftCurlyBracketKeyword_5());
                
            // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:1940:1: (otherlv_6= 'internalId' ( (lv_internalId_7_0= ruleEString ) ) )?
            int alt61=2;
            int LA61_0 = input.LA(1);

            if ( (LA61_0==14) ) {
                alt61=1;
            }
            switch (alt61) {
                case 1 :
                    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:1940:3: otherlv_6= 'internalId' ( (lv_internalId_7_0= ruleEString ) )
                    {
                    otherlv_6=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleEvent3872); 

                        	newLeafNode(otherlv_6, grammarAccess.getEventAccess().getInternalIdKeyword_6_0());
                        
                    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:1944:1: ( (lv_internalId_7_0= ruleEString ) )
                    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:1945:1: (lv_internalId_7_0= ruleEString )
                    {
                    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:1945:1: (lv_internalId_7_0= ruleEString )
                    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:1946:3: lv_internalId_7_0= ruleEString
                    {
                     
                    	        newCompositeNode(grammarAccess.getEventAccess().getInternalIdEStringParserRuleCall_6_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleEvent3893);
                    lv_internalId_7_0=ruleEString();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getEventRule());
                    	        }
                           		set(
                           			current, 
                           			"internalId",
                            		lv_internalId_7_0, 
                            		"EString");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:1962:4: (otherlv_8= 'comment' ( (lv_comment_9_0= ruleEString ) ) )?
            int alt62=2;
            int LA62_0 = input.LA(1);

            if ( (LA62_0==15) ) {
                alt62=1;
            }
            switch (alt62) {
                case 1 :
                    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:1962:6: otherlv_8= 'comment' ( (lv_comment_9_0= ruleEString ) )
                    {
                    otherlv_8=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleEvent3908); 

                        	newLeafNode(otherlv_8, grammarAccess.getEventAccess().getCommentKeyword_7_0());
                        
                    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:1966:1: ( (lv_comment_9_0= ruleEString ) )
                    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:1967:1: (lv_comment_9_0= ruleEString )
                    {
                    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:1967:1: (lv_comment_9_0= ruleEString )
                    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:1968:3: lv_comment_9_0= ruleEString
                    {
                     
                    	        newCompositeNode(grammarAccess.getEventAccess().getCommentEStringParserRuleCall_7_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleEvent3929);
                    lv_comment_9_0=ruleEString();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getEventRule());
                    	        }
                           		set(
                           			current, 
                           			"comment",
                            		lv_comment_9_0, 
                            		"EString");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:1984:4: (otherlv_10= 'convergence' ( (lv_convergence_11_0= ruleConvergence ) ) )?
            int alt63=2;
            int LA63_0 = input.LA(1);

            if ( (LA63_0==45) ) {
                alt63=1;
            }
            switch (alt63) {
                case 1 :
                    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:1984:6: otherlv_10= 'convergence' ( (lv_convergence_11_0= ruleConvergence ) )
                    {
                    otherlv_10=(Token)match(input,45,FollowSets000.FOLLOW_45_in_ruleEvent3944); 

                        	newLeafNode(otherlv_10, grammarAccess.getEventAccess().getConvergenceKeyword_8_0());
                        
                    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:1988:1: ( (lv_convergence_11_0= ruleConvergence ) )
                    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:1989:1: (lv_convergence_11_0= ruleConvergence )
                    {
                    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:1989:1: (lv_convergence_11_0= ruleConvergence )
                    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:1990:3: lv_convergence_11_0= ruleConvergence
                    {
                     
                    	        newCompositeNode(grammarAccess.getEventAccess().getConvergenceConvergenceEnumRuleCall_8_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleConvergence_in_ruleEvent3965);
                    lv_convergence_11_0=ruleConvergence();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getEventRule());
                    	        }
                           		set(
                           			current, 
                           			"convergence",
                            		lv_convergence_11_0, 
                            		"Convergence");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:2006:4: (otherlv_12= 'refines' otherlv_13= '(' ( ( ruleEString ) ) (otherlv_15= ',' ( ( ruleEString ) ) )* otherlv_17= ')' )?
            int alt65=2;
            int LA65_0 = input.LA(1);

            if ( (LA65_0==16) ) {
                alt65=1;
            }
            switch (alt65) {
                case 1 :
                    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:2006:6: otherlv_12= 'refines' otherlv_13= '(' ( ( ruleEString ) ) (otherlv_15= ',' ( ( ruleEString ) ) )* otherlv_17= ')'
                    {
                    otherlv_12=(Token)match(input,16,FollowSets000.FOLLOW_16_in_ruleEvent3980); 

                        	newLeafNode(otherlv_12, grammarAccess.getEventAccess().getRefinesKeyword_9_0());
                        
                    otherlv_13=(Token)match(input,17,FollowSets000.FOLLOW_17_in_ruleEvent3992); 

                        	newLeafNode(otherlv_13, grammarAccess.getEventAccess().getLeftParenthesisKeyword_9_1());
                        
                    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:2014:1: ( ( ruleEString ) )
                    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:2015:1: ( ruleEString )
                    {
                    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:2015:1: ( ruleEString )
                    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:2016:3: ruleEString
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getEventRule());
                    	        }
                            
                     
                    	        newCompositeNode(grammarAccess.getEventAccess().getRefinesEventCrossReference_9_2_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleEvent4015);
                    ruleEString();

                    state._fsp--;

                     
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:2029:2: (otherlv_15= ',' ( ( ruleEString ) ) )*
                    loop64:
                    do {
                        int alt64=2;
                        int LA64_0 = input.LA(1);

                        if ( (LA64_0==18) ) {
                            alt64=1;
                        }


                        switch (alt64) {
                    	case 1 :
                    	    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:2029:4: otherlv_15= ',' ( ( ruleEString ) )
                    	    {
                    	    otherlv_15=(Token)match(input,18,FollowSets000.FOLLOW_18_in_ruleEvent4028); 

                    	        	newLeafNode(otherlv_15, grammarAccess.getEventAccess().getCommaKeyword_9_3_0());
                    	        
                    	    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:2033:1: ( ( ruleEString ) )
                    	    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:2034:1: ( ruleEString )
                    	    {
                    	    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:2034:1: ( ruleEString )
                    	    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:2035:3: ruleEString
                    	    {

                    	    			if (current==null) {
                    	    	            current = createModelElement(grammarAccess.getEventRule());
                    	    	        }
                    	            
                    	     
                    	    	        newCompositeNode(grammarAccess.getEventAccess().getRefinesEventCrossReference_9_3_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleEvent4051);
                    	    ruleEString();

                    	    state._fsp--;

                    	     
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop64;
                        }
                    } while (true);

                    otherlv_17=(Token)match(input,19,FollowSets000.FOLLOW_19_in_ruleEvent4065); 

                        	newLeafNode(otherlv_17, grammarAccess.getEventAccess().getRightParenthesisKeyword_9_4());
                        

                    }
                    break;

            }

            // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:2052:3: (otherlv_18= 'annotations' otherlv_19= '{' ( (lv_annotations_20_0= ruleAnnotation ) ) (otherlv_21= ',' ( (lv_annotations_22_0= ruleAnnotation ) ) )* otherlv_23= '}' )?
            int alt67=2;
            int LA67_0 = input.LA(1);

            if ( (LA67_0==21) ) {
                alt67=1;
            }
            switch (alt67) {
                case 1 :
                    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:2052:5: otherlv_18= 'annotations' otherlv_19= '{' ( (lv_annotations_20_0= ruleAnnotation ) ) (otherlv_21= ',' ( (lv_annotations_22_0= ruleAnnotation ) ) )* otherlv_23= '}'
                    {
                    otherlv_18=(Token)match(input,21,FollowSets000.FOLLOW_21_in_ruleEvent4080); 

                        	newLeafNode(otherlv_18, grammarAccess.getEventAccess().getAnnotationsKeyword_10_0());
                        
                    otherlv_19=(Token)match(input,13,FollowSets000.FOLLOW_13_in_ruleEvent4092); 

                        	newLeafNode(otherlv_19, grammarAccess.getEventAccess().getLeftCurlyBracketKeyword_10_1());
                        
                    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:2060:1: ( (lv_annotations_20_0= ruleAnnotation ) )
                    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:2061:1: (lv_annotations_20_0= ruleAnnotation )
                    {
                    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:2061:1: (lv_annotations_20_0= ruleAnnotation )
                    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:2062:3: lv_annotations_20_0= ruleAnnotation
                    {
                     
                    	        newCompositeNode(grammarAccess.getEventAccess().getAnnotationsAnnotationParserRuleCall_10_2_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleAnnotation_in_ruleEvent4113);
                    lv_annotations_20_0=ruleAnnotation();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getEventRule());
                    	        }
                           		add(
                           			current, 
                           			"annotations",
                            		lv_annotations_20_0, 
                            		"Annotation");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:2078:2: (otherlv_21= ',' ( (lv_annotations_22_0= ruleAnnotation ) ) )*
                    loop66:
                    do {
                        int alt66=2;
                        int LA66_0 = input.LA(1);

                        if ( (LA66_0==18) ) {
                            alt66=1;
                        }


                        switch (alt66) {
                    	case 1 :
                    	    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:2078:4: otherlv_21= ',' ( (lv_annotations_22_0= ruleAnnotation ) )
                    	    {
                    	    otherlv_21=(Token)match(input,18,FollowSets000.FOLLOW_18_in_ruleEvent4126); 

                    	        	newLeafNode(otherlv_21, grammarAccess.getEventAccess().getCommaKeyword_10_3_0());
                    	        
                    	    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:2082:1: ( (lv_annotations_22_0= ruleAnnotation ) )
                    	    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:2083:1: (lv_annotations_22_0= ruleAnnotation )
                    	    {
                    	    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:2083:1: (lv_annotations_22_0= ruleAnnotation )
                    	    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:2084:3: lv_annotations_22_0= ruleAnnotation
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getEventAccess().getAnnotationsAnnotationParserRuleCall_10_3_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleAnnotation_in_ruleEvent4147);
                    	    lv_annotations_22_0=ruleAnnotation();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getEventRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"annotations",
                    	            		lv_annotations_22_0, 
                    	            		"Annotation");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop66;
                        }
                    } while (true);

                    otherlv_23=(Token)match(input,22,FollowSets000.FOLLOW_22_in_ruleEvent4161); 

                        	newLeafNode(otherlv_23, grammarAccess.getEventAccess().getRightCurlyBracketKeyword_10_4());
                        

                    }
                    break;

            }

            // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:2104:3: (otherlv_24= 'extensions' otherlv_25= '{' ( (lv_extensions_26_0= ruleAbstractExtension ) ) (otherlv_27= ',' ( (lv_extensions_28_0= ruleAbstractExtension ) ) )* otherlv_29= '}' )?
            int alt69=2;
            int LA69_0 = input.LA(1);

            if ( (LA69_0==23) ) {
                alt69=1;
            }
            switch (alt69) {
                case 1 :
                    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:2104:5: otherlv_24= 'extensions' otherlv_25= '{' ( (lv_extensions_26_0= ruleAbstractExtension ) ) (otherlv_27= ',' ( (lv_extensions_28_0= ruleAbstractExtension ) ) )* otherlv_29= '}'
                    {
                    otherlv_24=(Token)match(input,23,FollowSets000.FOLLOW_23_in_ruleEvent4176); 

                        	newLeafNode(otherlv_24, grammarAccess.getEventAccess().getExtensionsKeyword_11_0());
                        
                    otherlv_25=(Token)match(input,13,FollowSets000.FOLLOW_13_in_ruleEvent4188); 

                        	newLeafNode(otherlv_25, grammarAccess.getEventAccess().getLeftCurlyBracketKeyword_11_1());
                        
                    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:2112:1: ( (lv_extensions_26_0= ruleAbstractExtension ) )
                    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:2113:1: (lv_extensions_26_0= ruleAbstractExtension )
                    {
                    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:2113:1: (lv_extensions_26_0= ruleAbstractExtension )
                    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:2114:3: lv_extensions_26_0= ruleAbstractExtension
                    {
                     
                    	        newCompositeNode(grammarAccess.getEventAccess().getExtensionsAbstractExtensionParserRuleCall_11_2_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleAbstractExtension_in_ruleEvent4209);
                    lv_extensions_26_0=ruleAbstractExtension();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getEventRule());
                    	        }
                           		add(
                           			current, 
                           			"extensions",
                            		lv_extensions_26_0, 
                            		"AbstractExtension");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:2130:2: (otherlv_27= ',' ( (lv_extensions_28_0= ruleAbstractExtension ) ) )*
                    loop68:
                    do {
                        int alt68=2;
                        int LA68_0 = input.LA(1);

                        if ( (LA68_0==18) ) {
                            alt68=1;
                        }


                        switch (alt68) {
                    	case 1 :
                    	    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:2130:4: otherlv_27= ',' ( (lv_extensions_28_0= ruleAbstractExtension ) )
                    	    {
                    	    otherlv_27=(Token)match(input,18,FollowSets000.FOLLOW_18_in_ruleEvent4222); 

                    	        	newLeafNode(otherlv_27, grammarAccess.getEventAccess().getCommaKeyword_11_3_0());
                    	        
                    	    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:2134:1: ( (lv_extensions_28_0= ruleAbstractExtension ) )
                    	    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:2135:1: (lv_extensions_28_0= ruleAbstractExtension )
                    	    {
                    	    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:2135:1: (lv_extensions_28_0= ruleAbstractExtension )
                    	    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:2136:3: lv_extensions_28_0= ruleAbstractExtension
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getEventAccess().getExtensionsAbstractExtensionParserRuleCall_11_3_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleAbstractExtension_in_ruleEvent4243);
                    	    lv_extensions_28_0=ruleAbstractExtension();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getEventRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"extensions",
                    	            		lv_extensions_28_0, 
                    	            		"AbstractExtension");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop68;
                        }
                    } while (true);

                    otherlv_29=(Token)match(input,22,FollowSets000.FOLLOW_22_in_ruleEvent4257); 

                        	newLeafNode(otherlv_29, grammarAccess.getEventAccess().getRightCurlyBracketKeyword_11_4());
                        

                    }
                    break;

            }

            // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:2156:3: (otherlv_30= 'attributes' otherlv_31= '{' ( (lv_attributes_32_0= ruleStringToAttributeMapEntry ) ) (otherlv_33= ',' ( (lv_attributes_34_0= ruleStringToAttributeMapEntry ) ) )* otherlv_35= '}' )?
            int alt71=2;
            int LA71_0 = input.LA(1);

            if ( (LA71_0==24) ) {
                alt71=1;
            }
            switch (alt71) {
                case 1 :
                    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:2156:5: otherlv_30= 'attributes' otherlv_31= '{' ( (lv_attributes_32_0= ruleStringToAttributeMapEntry ) ) (otherlv_33= ',' ( (lv_attributes_34_0= ruleStringToAttributeMapEntry ) ) )* otherlv_35= '}'
                    {
                    otherlv_30=(Token)match(input,24,FollowSets000.FOLLOW_24_in_ruleEvent4272); 

                        	newLeafNode(otherlv_30, grammarAccess.getEventAccess().getAttributesKeyword_12_0());
                        
                    otherlv_31=(Token)match(input,13,FollowSets000.FOLLOW_13_in_ruleEvent4284); 

                        	newLeafNode(otherlv_31, grammarAccess.getEventAccess().getLeftCurlyBracketKeyword_12_1());
                        
                    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:2164:1: ( (lv_attributes_32_0= ruleStringToAttributeMapEntry ) )
                    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:2165:1: (lv_attributes_32_0= ruleStringToAttributeMapEntry )
                    {
                    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:2165:1: (lv_attributes_32_0= ruleStringToAttributeMapEntry )
                    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:2166:3: lv_attributes_32_0= ruleStringToAttributeMapEntry
                    {
                     
                    	        newCompositeNode(grammarAccess.getEventAccess().getAttributesStringToAttributeMapEntryParserRuleCall_12_2_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleStringToAttributeMapEntry_in_ruleEvent4305);
                    lv_attributes_32_0=ruleStringToAttributeMapEntry();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getEventRule());
                    	        }
                           		add(
                           			current, 
                           			"attributes",
                            		lv_attributes_32_0, 
                            		"StringToAttributeMapEntry");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:2182:2: (otherlv_33= ',' ( (lv_attributes_34_0= ruleStringToAttributeMapEntry ) ) )*
                    loop70:
                    do {
                        int alt70=2;
                        int LA70_0 = input.LA(1);

                        if ( (LA70_0==18) ) {
                            alt70=1;
                        }


                        switch (alt70) {
                    	case 1 :
                    	    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:2182:4: otherlv_33= ',' ( (lv_attributes_34_0= ruleStringToAttributeMapEntry ) )
                    	    {
                    	    otherlv_33=(Token)match(input,18,FollowSets000.FOLLOW_18_in_ruleEvent4318); 

                    	        	newLeafNode(otherlv_33, grammarAccess.getEventAccess().getCommaKeyword_12_3_0());
                    	        
                    	    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:2186:1: ( (lv_attributes_34_0= ruleStringToAttributeMapEntry ) )
                    	    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:2187:1: (lv_attributes_34_0= ruleStringToAttributeMapEntry )
                    	    {
                    	    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:2187:1: (lv_attributes_34_0= ruleStringToAttributeMapEntry )
                    	    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:2188:3: lv_attributes_34_0= ruleStringToAttributeMapEntry
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getEventAccess().getAttributesStringToAttributeMapEntryParserRuleCall_12_3_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleStringToAttributeMapEntry_in_ruleEvent4339);
                    	    lv_attributes_34_0=ruleStringToAttributeMapEntry();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getEventRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"attributes",
                    	            		lv_attributes_34_0, 
                    	            		"StringToAttributeMapEntry");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop70;
                        }
                    } while (true);

                    otherlv_35=(Token)match(input,22,FollowSets000.FOLLOW_22_in_ruleEvent4353); 

                        	newLeafNode(otherlv_35, grammarAccess.getEventAccess().getRightCurlyBracketKeyword_12_4());
                        

                    }
                    break;

            }

            // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:2208:3: (otherlv_36= 'parameters' otherlv_37= '{' ( (lv_parameters_38_0= ruleParameter ) ) (otherlv_39= ',' ( (lv_parameters_40_0= ruleParameter ) ) )* otherlv_41= '}' )?
            int alt73=2;
            int LA73_0 = input.LA(1);

            if ( (LA73_0==46) ) {
                alt73=1;
            }
            switch (alt73) {
                case 1 :
                    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:2208:5: otherlv_36= 'parameters' otherlv_37= '{' ( (lv_parameters_38_0= ruleParameter ) ) (otherlv_39= ',' ( (lv_parameters_40_0= ruleParameter ) ) )* otherlv_41= '}'
                    {
                    otherlv_36=(Token)match(input,46,FollowSets000.FOLLOW_46_in_ruleEvent4368); 

                        	newLeafNode(otherlv_36, grammarAccess.getEventAccess().getParametersKeyword_13_0());
                        
                    otherlv_37=(Token)match(input,13,FollowSets000.FOLLOW_13_in_ruleEvent4380); 

                        	newLeafNode(otherlv_37, grammarAccess.getEventAccess().getLeftCurlyBracketKeyword_13_1());
                        
                    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:2216:1: ( (lv_parameters_38_0= ruleParameter ) )
                    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:2217:1: (lv_parameters_38_0= ruleParameter )
                    {
                    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:2217:1: (lv_parameters_38_0= ruleParameter )
                    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:2218:3: lv_parameters_38_0= ruleParameter
                    {
                     
                    	        newCompositeNode(grammarAccess.getEventAccess().getParametersParameterParserRuleCall_13_2_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleParameter_in_ruleEvent4401);
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

                    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:2234:2: (otherlv_39= ',' ( (lv_parameters_40_0= ruleParameter ) ) )*
                    loop72:
                    do {
                        int alt72=2;
                        int LA72_0 = input.LA(1);

                        if ( (LA72_0==18) ) {
                            alt72=1;
                        }


                        switch (alt72) {
                    	case 1 :
                    	    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:2234:4: otherlv_39= ',' ( (lv_parameters_40_0= ruleParameter ) )
                    	    {
                    	    otherlv_39=(Token)match(input,18,FollowSets000.FOLLOW_18_in_ruleEvent4414); 

                    	        	newLeafNode(otherlv_39, grammarAccess.getEventAccess().getCommaKeyword_13_3_0());
                    	        
                    	    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:2238:1: ( (lv_parameters_40_0= ruleParameter ) )
                    	    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:2239:1: (lv_parameters_40_0= ruleParameter )
                    	    {
                    	    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:2239:1: (lv_parameters_40_0= ruleParameter )
                    	    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:2240:3: lv_parameters_40_0= ruleParameter
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getEventAccess().getParametersParameterParserRuleCall_13_3_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleParameter_in_ruleEvent4435);
                    	    lv_parameters_40_0=ruleParameter();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getEventRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"parameters",
                    	            		lv_parameters_40_0, 
                    	            		"Parameter");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop72;
                        }
                    } while (true);

                    otherlv_41=(Token)match(input,22,FollowSets000.FOLLOW_22_in_ruleEvent4449); 

                        	newLeafNode(otherlv_41, grammarAccess.getEventAccess().getRightCurlyBracketKeyword_13_4());
                        

                    }
                    break;

            }

            // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:2260:3: (otherlv_42= 'guards' otherlv_43= '{' ( (lv_guards_44_0= ruleGuard ) ) (otherlv_45= ',' ( (lv_guards_46_0= ruleGuard ) ) )* otherlv_47= '}' )?
            int alt75=2;
            int LA75_0 = input.LA(1);

            if ( (LA75_0==47) ) {
                alt75=1;
            }
            switch (alt75) {
                case 1 :
                    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:2260:5: otherlv_42= 'guards' otherlv_43= '{' ( (lv_guards_44_0= ruleGuard ) ) (otherlv_45= ',' ( (lv_guards_46_0= ruleGuard ) ) )* otherlv_47= '}'
                    {
                    otherlv_42=(Token)match(input,47,FollowSets000.FOLLOW_47_in_ruleEvent4464); 

                        	newLeafNode(otherlv_42, grammarAccess.getEventAccess().getGuardsKeyword_14_0());
                        
                    otherlv_43=(Token)match(input,13,FollowSets000.FOLLOW_13_in_ruleEvent4476); 

                        	newLeafNode(otherlv_43, grammarAccess.getEventAccess().getLeftCurlyBracketKeyword_14_1());
                        
                    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:2268:1: ( (lv_guards_44_0= ruleGuard ) )
                    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:2269:1: (lv_guards_44_0= ruleGuard )
                    {
                    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:2269:1: (lv_guards_44_0= ruleGuard )
                    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:2270:3: lv_guards_44_0= ruleGuard
                    {
                     
                    	        newCompositeNode(grammarAccess.getEventAccess().getGuardsGuardParserRuleCall_14_2_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleGuard_in_ruleEvent4497);
                    lv_guards_44_0=ruleGuard();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getEventRule());
                    	        }
                           		add(
                           			current, 
                           			"guards",
                            		lv_guards_44_0, 
                            		"Guard");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:2286:2: (otherlv_45= ',' ( (lv_guards_46_0= ruleGuard ) ) )*
                    loop74:
                    do {
                        int alt74=2;
                        int LA74_0 = input.LA(1);

                        if ( (LA74_0==18) ) {
                            alt74=1;
                        }


                        switch (alt74) {
                    	case 1 :
                    	    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:2286:4: otherlv_45= ',' ( (lv_guards_46_0= ruleGuard ) )
                    	    {
                    	    otherlv_45=(Token)match(input,18,FollowSets000.FOLLOW_18_in_ruleEvent4510); 

                    	        	newLeafNode(otherlv_45, grammarAccess.getEventAccess().getCommaKeyword_14_3_0());
                    	        
                    	    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:2290:1: ( (lv_guards_46_0= ruleGuard ) )
                    	    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:2291:1: (lv_guards_46_0= ruleGuard )
                    	    {
                    	    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:2291:1: (lv_guards_46_0= ruleGuard )
                    	    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:2292:3: lv_guards_46_0= ruleGuard
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getEventAccess().getGuardsGuardParserRuleCall_14_3_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleGuard_in_ruleEvent4531);
                    	    lv_guards_46_0=ruleGuard();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getEventRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"guards",
                    	            		lv_guards_46_0, 
                    	            		"Guard");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop74;
                        }
                    } while (true);

                    otherlv_47=(Token)match(input,22,FollowSets000.FOLLOW_22_in_ruleEvent4545); 

                        	newLeafNode(otherlv_47, grammarAccess.getEventAccess().getRightCurlyBracketKeyword_14_4());
                        

                    }
                    break;

            }

            // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:2312:3: (otherlv_48= 'witnesses' otherlv_49= '{' ( (lv_witnesses_50_0= ruleWitness ) ) (otherlv_51= ',' ( (lv_witnesses_52_0= ruleWitness ) ) )* otherlv_53= '}' )?
            int alt77=2;
            int LA77_0 = input.LA(1);

            if ( (LA77_0==48) ) {
                alt77=1;
            }
            switch (alt77) {
                case 1 :
                    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:2312:5: otherlv_48= 'witnesses' otherlv_49= '{' ( (lv_witnesses_50_0= ruleWitness ) ) (otherlv_51= ',' ( (lv_witnesses_52_0= ruleWitness ) ) )* otherlv_53= '}'
                    {
                    otherlv_48=(Token)match(input,48,FollowSets000.FOLLOW_48_in_ruleEvent4560); 

                        	newLeafNode(otherlv_48, grammarAccess.getEventAccess().getWitnessesKeyword_15_0());
                        
                    otherlv_49=(Token)match(input,13,FollowSets000.FOLLOW_13_in_ruleEvent4572); 

                        	newLeafNode(otherlv_49, grammarAccess.getEventAccess().getLeftCurlyBracketKeyword_15_1());
                        
                    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:2320:1: ( (lv_witnesses_50_0= ruleWitness ) )
                    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:2321:1: (lv_witnesses_50_0= ruleWitness )
                    {
                    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:2321:1: (lv_witnesses_50_0= ruleWitness )
                    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:2322:3: lv_witnesses_50_0= ruleWitness
                    {
                     
                    	        newCompositeNode(grammarAccess.getEventAccess().getWitnessesWitnessParserRuleCall_15_2_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleWitness_in_ruleEvent4593);
                    lv_witnesses_50_0=ruleWitness();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getEventRule());
                    	        }
                           		add(
                           			current, 
                           			"witnesses",
                            		lv_witnesses_50_0, 
                            		"Witness");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:2338:2: (otherlv_51= ',' ( (lv_witnesses_52_0= ruleWitness ) ) )*
                    loop76:
                    do {
                        int alt76=2;
                        int LA76_0 = input.LA(1);

                        if ( (LA76_0==18) ) {
                            alt76=1;
                        }


                        switch (alt76) {
                    	case 1 :
                    	    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:2338:4: otherlv_51= ',' ( (lv_witnesses_52_0= ruleWitness ) )
                    	    {
                    	    otherlv_51=(Token)match(input,18,FollowSets000.FOLLOW_18_in_ruleEvent4606); 

                    	        	newLeafNode(otherlv_51, grammarAccess.getEventAccess().getCommaKeyword_15_3_0());
                    	        
                    	    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:2342:1: ( (lv_witnesses_52_0= ruleWitness ) )
                    	    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:2343:1: (lv_witnesses_52_0= ruleWitness )
                    	    {
                    	    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:2343:1: (lv_witnesses_52_0= ruleWitness )
                    	    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:2344:3: lv_witnesses_52_0= ruleWitness
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getEventAccess().getWitnessesWitnessParserRuleCall_15_3_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleWitness_in_ruleEvent4627);
                    	    lv_witnesses_52_0=ruleWitness();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getEventRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"witnesses",
                    	            		lv_witnesses_52_0, 
                    	            		"Witness");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop76;
                        }
                    } while (true);

                    otherlv_53=(Token)match(input,22,FollowSets000.FOLLOW_22_in_ruleEvent4641); 

                        	newLeafNode(otherlv_53, grammarAccess.getEventAccess().getRightCurlyBracketKeyword_15_4());
                        

                    }
                    break;

            }

            // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:2364:3: (otherlv_54= 'actions' otherlv_55= '{' ( (lv_actions_56_0= ruleAction ) ) (otherlv_57= ',' ( (lv_actions_58_0= ruleAction ) ) )* otherlv_59= '}' )?
            int alt79=2;
            int LA79_0 = input.LA(1);

            if ( (LA79_0==49) ) {
                alt79=1;
            }
            switch (alt79) {
                case 1 :
                    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:2364:5: otherlv_54= 'actions' otherlv_55= '{' ( (lv_actions_56_0= ruleAction ) ) (otherlv_57= ',' ( (lv_actions_58_0= ruleAction ) ) )* otherlv_59= '}'
                    {
                    otherlv_54=(Token)match(input,49,FollowSets000.FOLLOW_49_in_ruleEvent4656); 

                        	newLeafNode(otherlv_54, grammarAccess.getEventAccess().getActionsKeyword_16_0());
                        
                    otherlv_55=(Token)match(input,13,FollowSets000.FOLLOW_13_in_ruleEvent4668); 

                        	newLeafNode(otherlv_55, grammarAccess.getEventAccess().getLeftCurlyBracketKeyword_16_1());
                        
                    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:2372:1: ( (lv_actions_56_0= ruleAction ) )
                    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:2373:1: (lv_actions_56_0= ruleAction )
                    {
                    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:2373:1: (lv_actions_56_0= ruleAction )
                    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:2374:3: lv_actions_56_0= ruleAction
                    {
                     
                    	        newCompositeNode(grammarAccess.getEventAccess().getActionsActionParserRuleCall_16_2_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleAction_in_ruleEvent4689);
                    lv_actions_56_0=ruleAction();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getEventRule());
                    	        }
                           		add(
                           			current, 
                           			"actions",
                            		lv_actions_56_0, 
                            		"Action");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:2390:2: (otherlv_57= ',' ( (lv_actions_58_0= ruleAction ) ) )*
                    loop78:
                    do {
                        int alt78=2;
                        int LA78_0 = input.LA(1);

                        if ( (LA78_0==18) ) {
                            alt78=1;
                        }


                        switch (alt78) {
                    	case 1 :
                    	    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:2390:4: otherlv_57= ',' ( (lv_actions_58_0= ruleAction ) )
                    	    {
                    	    otherlv_57=(Token)match(input,18,FollowSets000.FOLLOW_18_in_ruleEvent4702); 

                    	        	newLeafNode(otherlv_57, grammarAccess.getEventAccess().getCommaKeyword_16_3_0());
                    	        
                    	    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:2394:1: ( (lv_actions_58_0= ruleAction ) )
                    	    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:2395:1: (lv_actions_58_0= ruleAction )
                    	    {
                    	    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:2395:1: (lv_actions_58_0= ruleAction )
                    	    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:2396:3: lv_actions_58_0= ruleAction
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getEventAccess().getActionsActionParserRuleCall_16_3_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleAction_in_ruleEvent4723);
                    	    lv_actions_58_0=ruleAction();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getEventRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"actions",
                    	            		lv_actions_58_0, 
                    	            		"Action");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop78;
                        }
                    } while (true);

                    otherlv_59=(Token)match(input,22,FollowSets000.FOLLOW_22_in_ruleEvent4737); 

                        	newLeafNode(otherlv_59, grammarAccess.getEventAccess().getRightCurlyBracketKeyword_16_4());
                        

                    }
                    break;

            }

            otherlv_60=(Token)match(input,22,FollowSets000.FOLLOW_22_in_ruleEvent4751); 

                	newLeafNode(otherlv_60, grammarAccess.getEventAccess().getRightCurlyBracketKeyword_17());
                

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
    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:2428:1: entryRuleStringToStringMapEntry returns [EObject current=null] : iv_ruleStringToStringMapEntry= ruleStringToStringMapEntry EOF ;
    public final EObject entryRuleStringToStringMapEntry() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStringToStringMapEntry = null;


        try {
            // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:2429:2: (iv_ruleStringToStringMapEntry= ruleStringToStringMapEntry EOF )
            // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:2430:2: iv_ruleStringToStringMapEntry= ruleStringToStringMapEntry EOF
            {
             newCompositeNode(grammarAccess.getStringToStringMapEntryRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleStringToStringMapEntry_in_entryRuleStringToStringMapEntry4787);
            iv_ruleStringToStringMapEntry=ruleStringToStringMapEntry();

            state._fsp--;

             current =iv_ruleStringToStringMapEntry; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleStringToStringMapEntry4797); 

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
    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:2437:1: ruleStringToStringMapEntry returns [EObject current=null] : ( () otherlv_1= 'StringToStringMapEntry' otherlv_2= '{' (otherlv_3= 'key' ( (lv_key_4_0= ruleEString ) ) )? (otherlv_5= 'value' ( (lv_value_6_0= ruleEString ) ) )? otherlv_7= '}' ) ;
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
            // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:2440:28: ( ( () otherlv_1= 'StringToStringMapEntry' otherlv_2= '{' (otherlv_3= 'key' ( (lv_key_4_0= ruleEString ) ) )? (otherlv_5= 'value' ( (lv_value_6_0= ruleEString ) ) )? otherlv_7= '}' ) )
            // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:2441:1: ( () otherlv_1= 'StringToStringMapEntry' otherlv_2= '{' (otherlv_3= 'key' ( (lv_key_4_0= ruleEString ) ) )? (otherlv_5= 'value' ( (lv_value_6_0= ruleEString ) ) )? otherlv_7= '}' )
            {
            // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:2441:1: ( () otherlv_1= 'StringToStringMapEntry' otherlv_2= '{' (otherlv_3= 'key' ( (lv_key_4_0= ruleEString ) ) )? (otherlv_5= 'value' ( (lv_value_6_0= ruleEString ) ) )? otherlv_7= '}' )
            // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:2441:2: () otherlv_1= 'StringToStringMapEntry' otherlv_2= '{' (otherlv_3= 'key' ( (lv_key_4_0= ruleEString ) ) )? (otherlv_5= 'value' ( (lv_value_6_0= ruleEString ) ) )? otherlv_7= '}'
            {
            // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:2441:2: ()
            // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:2442:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getStringToStringMapEntryAccess().getStringToStringMapEntryAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,50,FollowSets000.FOLLOW_50_in_ruleStringToStringMapEntry4843); 

                	newLeafNode(otherlv_1, grammarAccess.getStringToStringMapEntryAccess().getStringToStringMapEntryKeyword_1());
                
            otherlv_2=(Token)match(input,13,FollowSets000.FOLLOW_13_in_ruleStringToStringMapEntry4855); 

                	newLeafNode(otherlv_2, grammarAccess.getStringToStringMapEntryAccess().getLeftCurlyBracketKeyword_2());
                
            // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:2455:1: (otherlv_3= 'key' ( (lv_key_4_0= ruleEString ) ) )?
            int alt80=2;
            int LA80_0 = input.LA(1);

            if ( (LA80_0==35) ) {
                alt80=1;
            }
            switch (alt80) {
                case 1 :
                    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:2455:3: otherlv_3= 'key' ( (lv_key_4_0= ruleEString ) )
                    {
                    otherlv_3=(Token)match(input,35,FollowSets000.FOLLOW_35_in_ruleStringToStringMapEntry4868); 

                        	newLeafNode(otherlv_3, grammarAccess.getStringToStringMapEntryAccess().getKeyKeyword_3_0());
                        
                    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:2459:1: ( (lv_key_4_0= ruleEString ) )
                    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:2460:1: (lv_key_4_0= ruleEString )
                    {
                    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:2460:1: (lv_key_4_0= ruleEString )
                    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:2461:3: lv_key_4_0= ruleEString
                    {
                     
                    	        newCompositeNode(grammarAccess.getStringToStringMapEntryAccess().getKeyEStringParserRuleCall_3_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleStringToStringMapEntry4889);
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

            // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:2477:4: (otherlv_5= 'value' ( (lv_value_6_0= ruleEString ) ) )?
            int alt81=2;
            int LA81_0 = input.LA(1);

            if ( (LA81_0==36) ) {
                alt81=1;
            }
            switch (alt81) {
                case 1 :
                    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:2477:6: otherlv_5= 'value' ( (lv_value_6_0= ruleEString ) )
                    {
                    otherlv_5=(Token)match(input,36,FollowSets000.FOLLOW_36_in_ruleStringToStringMapEntry4904); 

                        	newLeafNode(otherlv_5, grammarAccess.getStringToStringMapEntryAccess().getValueKeyword_4_0());
                        
                    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:2481:1: ( (lv_value_6_0= ruleEString ) )
                    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:2482:1: (lv_value_6_0= ruleEString )
                    {
                    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:2482:1: (lv_value_6_0= ruleEString )
                    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:2483:3: lv_value_6_0= ruleEString
                    {
                     
                    	        newCompositeNode(grammarAccess.getStringToStringMapEntryAccess().getValueEStringParserRuleCall_4_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleStringToStringMapEntry4925);
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

            otherlv_7=(Token)match(input,22,FollowSets000.FOLLOW_22_in_ruleStringToStringMapEntry4939); 

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
    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:2511:1: entryRuleEObject returns [EObject current=null] : iv_ruleEObject= ruleEObject EOF ;
    public final EObject entryRuleEObject() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEObject = null;


        try {
            // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:2512:2: (iv_ruleEObject= ruleEObject EOF )
            // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:2513:2: iv_ruleEObject= ruleEObject EOF
            {
             newCompositeNode(grammarAccess.getEObjectRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleEObject_in_entryRuleEObject4975);
            iv_ruleEObject=ruleEObject();

            state._fsp--;

             current =iv_ruleEObject; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleEObject4985); 

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
    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:2520:1: ruleEObject returns [EObject current=null] : ( () otherlv_1= 'EObject' ) ;
    public final EObject ruleEObject() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:2523:28: ( ( () otherlv_1= 'EObject' ) )
            // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:2524:1: ( () otherlv_1= 'EObject' )
            {
            // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:2524:1: ( () otherlv_1= 'EObject' )
            // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:2524:2: () otherlv_1= 'EObject'
            {
            // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:2524:2: ()
            // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:2525:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getEObjectAccess().getEObjectAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,51,FollowSets000.FOLLOW_51_in_ruleEObject5031); 

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
    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:2542:1: entryRuleExtension returns [EObject current=null] : iv_ruleExtension= ruleExtension EOF ;
    public final EObject entryRuleExtension() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExtension = null;


        try {
            // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:2543:2: (iv_ruleExtension= ruleExtension EOF )
            // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:2544:2: iv_ruleExtension= ruleExtension EOF
            {
             newCompositeNode(grammarAccess.getExtensionRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleExtension_in_entryRuleExtension5067);
            iv_ruleExtension=ruleExtension();

            state._fsp--;

             current =iv_ruleExtension; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleExtension5077); 

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
    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:2551:1: ruleExtension returns [EObject current=null] : ( ( (lv_localGenerated_0_0= 'localGenerated' ) )? otherlv_1= 'Extension' otherlv_2= '{' (otherlv_3= 'internalId' ( (lv_internalId_4_0= ruleEString ) ) )? otherlv_5= 'extensionId' ( (lv_extensionId_6_0= ruleEString ) ) (otherlv_7= 'annotations' otherlv_8= '{' ( (lv_annotations_9_0= ruleAnnotation ) ) (otherlv_10= ',' ( (lv_annotations_11_0= ruleAnnotation ) ) )* otherlv_12= '}' )? (otherlv_13= 'extensions' otherlv_14= '{' ( (lv_extensions_15_0= ruleAbstractExtension ) ) (otherlv_16= ',' ( (lv_extensions_17_0= ruleAbstractExtension ) ) )* otherlv_18= '}' )? (otherlv_19= 'attributes' otherlv_20= '{' ( (lv_attributes_21_0= ruleStringToAttributeMapEntry ) ) (otherlv_22= ',' ( (lv_attributes_23_0= ruleStringToAttributeMapEntry ) ) )* otherlv_24= '}' )? otherlv_25= '}' ) ;
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
            // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:2554:28: ( ( ( (lv_localGenerated_0_0= 'localGenerated' ) )? otherlv_1= 'Extension' otherlv_2= '{' (otherlv_3= 'internalId' ( (lv_internalId_4_0= ruleEString ) ) )? otherlv_5= 'extensionId' ( (lv_extensionId_6_0= ruleEString ) ) (otherlv_7= 'annotations' otherlv_8= '{' ( (lv_annotations_9_0= ruleAnnotation ) ) (otherlv_10= ',' ( (lv_annotations_11_0= ruleAnnotation ) ) )* otherlv_12= '}' )? (otherlv_13= 'extensions' otherlv_14= '{' ( (lv_extensions_15_0= ruleAbstractExtension ) ) (otherlv_16= ',' ( (lv_extensions_17_0= ruleAbstractExtension ) ) )* otherlv_18= '}' )? (otherlv_19= 'attributes' otherlv_20= '{' ( (lv_attributes_21_0= ruleStringToAttributeMapEntry ) ) (otherlv_22= ',' ( (lv_attributes_23_0= ruleStringToAttributeMapEntry ) ) )* otherlv_24= '}' )? otherlv_25= '}' ) )
            // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:2555:1: ( ( (lv_localGenerated_0_0= 'localGenerated' ) )? otherlv_1= 'Extension' otherlv_2= '{' (otherlv_3= 'internalId' ( (lv_internalId_4_0= ruleEString ) ) )? otherlv_5= 'extensionId' ( (lv_extensionId_6_0= ruleEString ) ) (otherlv_7= 'annotations' otherlv_8= '{' ( (lv_annotations_9_0= ruleAnnotation ) ) (otherlv_10= ',' ( (lv_annotations_11_0= ruleAnnotation ) ) )* otherlv_12= '}' )? (otherlv_13= 'extensions' otherlv_14= '{' ( (lv_extensions_15_0= ruleAbstractExtension ) ) (otherlv_16= ',' ( (lv_extensions_17_0= ruleAbstractExtension ) ) )* otherlv_18= '}' )? (otherlv_19= 'attributes' otherlv_20= '{' ( (lv_attributes_21_0= ruleStringToAttributeMapEntry ) ) (otherlv_22= ',' ( (lv_attributes_23_0= ruleStringToAttributeMapEntry ) ) )* otherlv_24= '}' )? otherlv_25= '}' )
            {
            // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:2555:1: ( ( (lv_localGenerated_0_0= 'localGenerated' ) )? otherlv_1= 'Extension' otherlv_2= '{' (otherlv_3= 'internalId' ( (lv_internalId_4_0= ruleEString ) ) )? otherlv_5= 'extensionId' ( (lv_extensionId_6_0= ruleEString ) ) (otherlv_7= 'annotations' otherlv_8= '{' ( (lv_annotations_9_0= ruleAnnotation ) ) (otherlv_10= ',' ( (lv_annotations_11_0= ruleAnnotation ) ) )* otherlv_12= '}' )? (otherlv_13= 'extensions' otherlv_14= '{' ( (lv_extensions_15_0= ruleAbstractExtension ) ) (otherlv_16= ',' ( (lv_extensions_17_0= ruleAbstractExtension ) ) )* otherlv_18= '}' )? (otherlv_19= 'attributes' otherlv_20= '{' ( (lv_attributes_21_0= ruleStringToAttributeMapEntry ) ) (otherlv_22= ',' ( (lv_attributes_23_0= ruleStringToAttributeMapEntry ) ) )* otherlv_24= '}' )? otherlv_25= '}' )
            // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:2555:2: ( (lv_localGenerated_0_0= 'localGenerated' ) )? otherlv_1= 'Extension' otherlv_2= '{' (otherlv_3= 'internalId' ( (lv_internalId_4_0= ruleEString ) ) )? otherlv_5= 'extensionId' ( (lv_extensionId_6_0= ruleEString ) ) (otherlv_7= 'annotations' otherlv_8= '{' ( (lv_annotations_9_0= ruleAnnotation ) ) (otherlv_10= ',' ( (lv_annotations_11_0= ruleAnnotation ) ) )* otherlv_12= '}' )? (otherlv_13= 'extensions' otherlv_14= '{' ( (lv_extensions_15_0= ruleAbstractExtension ) ) (otherlv_16= ',' ( (lv_extensions_17_0= ruleAbstractExtension ) ) )* otherlv_18= '}' )? (otherlv_19= 'attributes' otherlv_20= '{' ( (lv_attributes_21_0= ruleStringToAttributeMapEntry ) ) (otherlv_22= ',' ( (lv_attributes_23_0= ruleStringToAttributeMapEntry ) ) )* otherlv_24= '}' )? otherlv_25= '}'
            {
            // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:2555:2: ( (lv_localGenerated_0_0= 'localGenerated' ) )?
            int alt82=2;
            int LA82_0 = input.LA(1);

            if ( (LA82_0==11) ) {
                alt82=1;
            }
            switch (alt82) {
                case 1 :
                    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:2556:1: (lv_localGenerated_0_0= 'localGenerated' )
                    {
                    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:2556:1: (lv_localGenerated_0_0= 'localGenerated' )
                    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:2557:3: lv_localGenerated_0_0= 'localGenerated'
                    {
                    lv_localGenerated_0_0=(Token)match(input,11,FollowSets000.FOLLOW_11_in_ruleExtension5120); 

                            newLeafNode(lv_localGenerated_0_0, grammarAccess.getExtensionAccess().getLocalGeneratedLocalGeneratedKeyword_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getExtensionRule());
                    	        }
                           		setWithLastConsumed(current, "localGenerated", true, "localGenerated");
                    	    

                    }


                    }
                    break;

            }

            otherlv_1=(Token)match(input,52,FollowSets000.FOLLOW_52_in_ruleExtension5146); 

                	newLeafNode(otherlv_1, grammarAccess.getExtensionAccess().getExtensionKeyword_1());
                
            otherlv_2=(Token)match(input,13,FollowSets000.FOLLOW_13_in_ruleExtension5158); 

                	newLeafNode(otherlv_2, grammarAccess.getExtensionAccess().getLeftCurlyBracketKeyword_2());
                
            // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:2578:1: (otherlv_3= 'internalId' ( (lv_internalId_4_0= ruleEString ) ) )?
            int alt83=2;
            int LA83_0 = input.LA(1);

            if ( (LA83_0==14) ) {
                alt83=1;
            }
            switch (alt83) {
                case 1 :
                    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:2578:3: otherlv_3= 'internalId' ( (lv_internalId_4_0= ruleEString ) )
                    {
                    otherlv_3=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleExtension5171); 

                        	newLeafNode(otherlv_3, grammarAccess.getExtensionAccess().getInternalIdKeyword_3_0());
                        
                    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:2582:1: ( (lv_internalId_4_0= ruleEString ) )
                    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:2583:1: (lv_internalId_4_0= ruleEString )
                    {
                    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:2583:1: (lv_internalId_4_0= ruleEString )
                    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:2584:3: lv_internalId_4_0= ruleEString
                    {
                     
                    	        newCompositeNode(grammarAccess.getExtensionAccess().getInternalIdEStringParserRuleCall_3_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleExtension5192);
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

            otherlv_5=(Token)match(input,53,FollowSets000.FOLLOW_53_in_ruleExtension5206); 

                	newLeafNode(otherlv_5, grammarAccess.getExtensionAccess().getExtensionIdKeyword_4());
                
            // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:2604:1: ( (lv_extensionId_6_0= ruleEString ) )
            // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:2605:1: (lv_extensionId_6_0= ruleEString )
            {
            // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:2605:1: (lv_extensionId_6_0= ruleEString )
            // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:2606:3: lv_extensionId_6_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getExtensionAccess().getExtensionIdEStringParserRuleCall_5_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleExtension5227);
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

            // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:2622:2: (otherlv_7= 'annotations' otherlv_8= '{' ( (lv_annotations_9_0= ruleAnnotation ) ) (otherlv_10= ',' ( (lv_annotations_11_0= ruleAnnotation ) ) )* otherlv_12= '}' )?
            int alt85=2;
            int LA85_0 = input.LA(1);

            if ( (LA85_0==21) ) {
                alt85=1;
            }
            switch (alt85) {
                case 1 :
                    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:2622:4: otherlv_7= 'annotations' otherlv_8= '{' ( (lv_annotations_9_0= ruleAnnotation ) ) (otherlv_10= ',' ( (lv_annotations_11_0= ruleAnnotation ) ) )* otherlv_12= '}'
                    {
                    otherlv_7=(Token)match(input,21,FollowSets000.FOLLOW_21_in_ruleExtension5240); 

                        	newLeafNode(otherlv_7, grammarAccess.getExtensionAccess().getAnnotationsKeyword_6_0());
                        
                    otherlv_8=(Token)match(input,13,FollowSets000.FOLLOW_13_in_ruleExtension5252); 

                        	newLeafNode(otherlv_8, grammarAccess.getExtensionAccess().getLeftCurlyBracketKeyword_6_1());
                        
                    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:2630:1: ( (lv_annotations_9_0= ruleAnnotation ) )
                    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:2631:1: (lv_annotations_9_0= ruleAnnotation )
                    {
                    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:2631:1: (lv_annotations_9_0= ruleAnnotation )
                    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:2632:3: lv_annotations_9_0= ruleAnnotation
                    {
                     
                    	        newCompositeNode(grammarAccess.getExtensionAccess().getAnnotationsAnnotationParserRuleCall_6_2_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleAnnotation_in_ruleExtension5273);
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

                    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:2648:2: (otherlv_10= ',' ( (lv_annotations_11_0= ruleAnnotation ) ) )*
                    loop84:
                    do {
                        int alt84=2;
                        int LA84_0 = input.LA(1);

                        if ( (LA84_0==18) ) {
                            alt84=1;
                        }


                        switch (alt84) {
                    	case 1 :
                    	    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:2648:4: otherlv_10= ',' ( (lv_annotations_11_0= ruleAnnotation ) )
                    	    {
                    	    otherlv_10=(Token)match(input,18,FollowSets000.FOLLOW_18_in_ruleExtension5286); 

                    	        	newLeafNode(otherlv_10, grammarAccess.getExtensionAccess().getCommaKeyword_6_3_0());
                    	        
                    	    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:2652:1: ( (lv_annotations_11_0= ruleAnnotation ) )
                    	    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:2653:1: (lv_annotations_11_0= ruleAnnotation )
                    	    {
                    	    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:2653:1: (lv_annotations_11_0= ruleAnnotation )
                    	    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:2654:3: lv_annotations_11_0= ruleAnnotation
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getExtensionAccess().getAnnotationsAnnotationParserRuleCall_6_3_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleAnnotation_in_ruleExtension5307);
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
                    	    break loop84;
                        }
                    } while (true);

                    otherlv_12=(Token)match(input,22,FollowSets000.FOLLOW_22_in_ruleExtension5321); 

                        	newLeafNode(otherlv_12, grammarAccess.getExtensionAccess().getRightCurlyBracketKeyword_6_4());
                        

                    }
                    break;

            }

            // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:2674:3: (otherlv_13= 'extensions' otherlv_14= '{' ( (lv_extensions_15_0= ruleAbstractExtension ) ) (otherlv_16= ',' ( (lv_extensions_17_0= ruleAbstractExtension ) ) )* otherlv_18= '}' )?
            int alt87=2;
            int LA87_0 = input.LA(1);

            if ( (LA87_0==23) ) {
                alt87=1;
            }
            switch (alt87) {
                case 1 :
                    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:2674:5: otherlv_13= 'extensions' otherlv_14= '{' ( (lv_extensions_15_0= ruleAbstractExtension ) ) (otherlv_16= ',' ( (lv_extensions_17_0= ruleAbstractExtension ) ) )* otherlv_18= '}'
                    {
                    otherlv_13=(Token)match(input,23,FollowSets000.FOLLOW_23_in_ruleExtension5336); 

                        	newLeafNode(otherlv_13, grammarAccess.getExtensionAccess().getExtensionsKeyword_7_0());
                        
                    otherlv_14=(Token)match(input,13,FollowSets000.FOLLOW_13_in_ruleExtension5348); 

                        	newLeafNode(otherlv_14, grammarAccess.getExtensionAccess().getLeftCurlyBracketKeyword_7_1());
                        
                    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:2682:1: ( (lv_extensions_15_0= ruleAbstractExtension ) )
                    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:2683:1: (lv_extensions_15_0= ruleAbstractExtension )
                    {
                    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:2683:1: (lv_extensions_15_0= ruleAbstractExtension )
                    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:2684:3: lv_extensions_15_0= ruleAbstractExtension
                    {
                     
                    	        newCompositeNode(grammarAccess.getExtensionAccess().getExtensionsAbstractExtensionParserRuleCall_7_2_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleAbstractExtension_in_ruleExtension5369);
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

                    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:2700:2: (otherlv_16= ',' ( (lv_extensions_17_0= ruleAbstractExtension ) ) )*
                    loop86:
                    do {
                        int alt86=2;
                        int LA86_0 = input.LA(1);

                        if ( (LA86_0==18) ) {
                            alt86=1;
                        }


                        switch (alt86) {
                    	case 1 :
                    	    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:2700:4: otherlv_16= ',' ( (lv_extensions_17_0= ruleAbstractExtension ) )
                    	    {
                    	    otherlv_16=(Token)match(input,18,FollowSets000.FOLLOW_18_in_ruleExtension5382); 

                    	        	newLeafNode(otherlv_16, grammarAccess.getExtensionAccess().getCommaKeyword_7_3_0());
                    	        
                    	    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:2704:1: ( (lv_extensions_17_0= ruleAbstractExtension ) )
                    	    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:2705:1: (lv_extensions_17_0= ruleAbstractExtension )
                    	    {
                    	    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:2705:1: (lv_extensions_17_0= ruleAbstractExtension )
                    	    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:2706:3: lv_extensions_17_0= ruleAbstractExtension
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getExtensionAccess().getExtensionsAbstractExtensionParserRuleCall_7_3_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleAbstractExtension_in_ruleExtension5403);
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
                    	    break loop86;
                        }
                    } while (true);

                    otherlv_18=(Token)match(input,22,FollowSets000.FOLLOW_22_in_ruleExtension5417); 

                        	newLeafNode(otherlv_18, grammarAccess.getExtensionAccess().getRightCurlyBracketKeyword_7_4());
                        

                    }
                    break;

            }

            // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:2726:3: (otherlv_19= 'attributes' otherlv_20= '{' ( (lv_attributes_21_0= ruleStringToAttributeMapEntry ) ) (otherlv_22= ',' ( (lv_attributes_23_0= ruleStringToAttributeMapEntry ) ) )* otherlv_24= '}' )?
            int alt89=2;
            int LA89_0 = input.LA(1);

            if ( (LA89_0==24) ) {
                alt89=1;
            }
            switch (alt89) {
                case 1 :
                    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:2726:5: otherlv_19= 'attributes' otherlv_20= '{' ( (lv_attributes_21_0= ruleStringToAttributeMapEntry ) ) (otherlv_22= ',' ( (lv_attributes_23_0= ruleStringToAttributeMapEntry ) ) )* otherlv_24= '}'
                    {
                    otherlv_19=(Token)match(input,24,FollowSets000.FOLLOW_24_in_ruleExtension5432); 

                        	newLeafNode(otherlv_19, grammarAccess.getExtensionAccess().getAttributesKeyword_8_0());
                        
                    otherlv_20=(Token)match(input,13,FollowSets000.FOLLOW_13_in_ruleExtension5444); 

                        	newLeafNode(otherlv_20, grammarAccess.getExtensionAccess().getLeftCurlyBracketKeyword_8_1());
                        
                    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:2734:1: ( (lv_attributes_21_0= ruleStringToAttributeMapEntry ) )
                    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:2735:1: (lv_attributes_21_0= ruleStringToAttributeMapEntry )
                    {
                    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:2735:1: (lv_attributes_21_0= ruleStringToAttributeMapEntry )
                    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:2736:3: lv_attributes_21_0= ruleStringToAttributeMapEntry
                    {
                     
                    	        newCompositeNode(grammarAccess.getExtensionAccess().getAttributesStringToAttributeMapEntryParserRuleCall_8_2_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleStringToAttributeMapEntry_in_ruleExtension5465);
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

                    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:2752:2: (otherlv_22= ',' ( (lv_attributes_23_0= ruleStringToAttributeMapEntry ) ) )*
                    loop88:
                    do {
                        int alt88=2;
                        int LA88_0 = input.LA(1);

                        if ( (LA88_0==18) ) {
                            alt88=1;
                        }


                        switch (alt88) {
                    	case 1 :
                    	    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:2752:4: otherlv_22= ',' ( (lv_attributes_23_0= ruleStringToAttributeMapEntry ) )
                    	    {
                    	    otherlv_22=(Token)match(input,18,FollowSets000.FOLLOW_18_in_ruleExtension5478); 

                    	        	newLeafNode(otherlv_22, grammarAccess.getExtensionAccess().getCommaKeyword_8_3_0());
                    	        
                    	    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:2756:1: ( (lv_attributes_23_0= ruleStringToAttributeMapEntry ) )
                    	    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:2757:1: (lv_attributes_23_0= ruleStringToAttributeMapEntry )
                    	    {
                    	    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:2757:1: (lv_attributes_23_0= ruleStringToAttributeMapEntry )
                    	    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:2758:3: lv_attributes_23_0= ruleStringToAttributeMapEntry
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getExtensionAccess().getAttributesStringToAttributeMapEntryParserRuleCall_8_3_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleStringToAttributeMapEntry_in_ruleExtension5499);
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
                    	    break loop88;
                        }
                    } while (true);

                    otherlv_24=(Token)match(input,22,FollowSets000.FOLLOW_22_in_ruleExtension5513); 

                        	newLeafNode(otherlv_24, grammarAccess.getExtensionAccess().getRightCurlyBracketKeyword_8_4());
                        

                    }
                    break;

            }

            otherlv_25=(Token)match(input,22,FollowSets000.FOLLOW_22_in_ruleExtension5527); 

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
    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:2790:1: entryRuleAttribute returns [EObject current=null] : iv_ruleAttribute= ruleAttribute EOF ;
    public final EObject entryRuleAttribute() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAttribute = null;


        try {
            // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:2791:2: (iv_ruleAttribute= ruleAttribute EOF )
            // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:2792:2: iv_ruleAttribute= ruleAttribute EOF
            {
             newCompositeNode(grammarAccess.getAttributeRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleAttribute_in_entryRuleAttribute5563);
            iv_ruleAttribute=ruleAttribute();

            state._fsp--;

             current =iv_ruleAttribute; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleAttribute5573); 

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
    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:2799:1: ruleAttribute returns [EObject current=null] : (otherlv_0= 'Attribute' otherlv_1= '{' otherlv_2= 'type' ( (lv_type_3_0= ruleAttributeType ) ) otherlv_4= 'value' ( (lv_value_5_0= ruleEJavaObject ) ) (otherlv_6= 'annotations' otherlv_7= '{' ( (lv_annotations_8_0= ruleAnnotation ) ) (otherlv_9= ',' ( (lv_annotations_10_0= ruleAnnotation ) ) )* otherlv_11= '}' )? otherlv_12= '}' ) ;
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
            // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:2802:28: ( (otherlv_0= 'Attribute' otherlv_1= '{' otherlv_2= 'type' ( (lv_type_3_0= ruleAttributeType ) ) otherlv_4= 'value' ( (lv_value_5_0= ruleEJavaObject ) ) (otherlv_6= 'annotations' otherlv_7= '{' ( (lv_annotations_8_0= ruleAnnotation ) ) (otherlv_9= ',' ( (lv_annotations_10_0= ruleAnnotation ) ) )* otherlv_11= '}' )? otherlv_12= '}' ) )
            // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:2803:1: (otherlv_0= 'Attribute' otherlv_1= '{' otherlv_2= 'type' ( (lv_type_3_0= ruleAttributeType ) ) otherlv_4= 'value' ( (lv_value_5_0= ruleEJavaObject ) ) (otherlv_6= 'annotations' otherlv_7= '{' ( (lv_annotations_8_0= ruleAnnotation ) ) (otherlv_9= ',' ( (lv_annotations_10_0= ruleAnnotation ) ) )* otherlv_11= '}' )? otherlv_12= '}' )
            {
            // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:2803:1: (otherlv_0= 'Attribute' otherlv_1= '{' otherlv_2= 'type' ( (lv_type_3_0= ruleAttributeType ) ) otherlv_4= 'value' ( (lv_value_5_0= ruleEJavaObject ) ) (otherlv_6= 'annotations' otherlv_7= '{' ( (lv_annotations_8_0= ruleAnnotation ) ) (otherlv_9= ',' ( (lv_annotations_10_0= ruleAnnotation ) ) )* otherlv_11= '}' )? otherlv_12= '}' )
            // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:2803:3: otherlv_0= 'Attribute' otherlv_1= '{' otherlv_2= 'type' ( (lv_type_3_0= ruleAttributeType ) ) otherlv_4= 'value' ( (lv_value_5_0= ruleEJavaObject ) ) (otherlv_6= 'annotations' otherlv_7= '{' ( (lv_annotations_8_0= ruleAnnotation ) ) (otherlv_9= ',' ( (lv_annotations_10_0= ruleAnnotation ) ) )* otherlv_11= '}' )? otherlv_12= '}'
            {
            otherlv_0=(Token)match(input,54,FollowSets000.FOLLOW_54_in_ruleAttribute5610); 

                	newLeafNode(otherlv_0, grammarAccess.getAttributeAccess().getAttributeKeyword_0());
                
            otherlv_1=(Token)match(input,13,FollowSets000.FOLLOW_13_in_ruleAttribute5622); 

                	newLeafNode(otherlv_1, grammarAccess.getAttributeAccess().getLeftCurlyBracketKeyword_1());
                
            otherlv_2=(Token)match(input,55,FollowSets000.FOLLOW_55_in_ruleAttribute5634); 

                	newLeafNode(otherlv_2, grammarAccess.getAttributeAccess().getTypeKeyword_2());
                
            // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:2815:1: ( (lv_type_3_0= ruleAttributeType ) )
            // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:2816:1: (lv_type_3_0= ruleAttributeType )
            {
            // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:2816:1: (lv_type_3_0= ruleAttributeType )
            // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:2817:3: lv_type_3_0= ruleAttributeType
            {
             
            	        newCompositeNode(grammarAccess.getAttributeAccess().getTypeAttributeTypeEnumRuleCall_3_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleAttributeType_in_ruleAttribute5655);
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

            otherlv_4=(Token)match(input,36,FollowSets000.FOLLOW_36_in_ruleAttribute5667); 

                	newLeafNode(otherlv_4, grammarAccess.getAttributeAccess().getValueKeyword_4());
                
            // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:2837:1: ( (lv_value_5_0= ruleEJavaObject ) )
            // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:2838:1: (lv_value_5_0= ruleEJavaObject )
            {
            // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:2838:1: (lv_value_5_0= ruleEJavaObject )
            // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:2839:3: lv_value_5_0= ruleEJavaObject
            {
             
            	        newCompositeNode(grammarAccess.getAttributeAccess().getValueEJavaObjectParserRuleCall_5_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEJavaObject_in_ruleAttribute5688);
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

            // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:2855:2: (otherlv_6= 'annotations' otherlv_7= '{' ( (lv_annotations_8_0= ruleAnnotation ) ) (otherlv_9= ',' ( (lv_annotations_10_0= ruleAnnotation ) ) )* otherlv_11= '}' )?
            int alt91=2;
            int LA91_0 = input.LA(1);

            if ( (LA91_0==21) ) {
                alt91=1;
            }
            switch (alt91) {
                case 1 :
                    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:2855:4: otherlv_6= 'annotations' otherlv_7= '{' ( (lv_annotations_8_0= ruleAnnotation ) ) (otherlv_9= ',' ( (lv_annotations_10_0= ruleAnnotation ) ) )* otherlv_11= '}'
                    {
                    otherlv_6=(Token)match(input,21,FollowSets000.FOLLOW_21_in_ruleAttribute5701); 

                        	newLeafNode(otherlv_6, grammarAccess.getAttributeAccess().getAnnotationsKeyword_6_0());
                        
                    otherlv_7=(Token)match(input,13,FollowSets000.FOLLOW_13_in_ruleAttribute5713); 

                        	newLeafNode(otherlv_7, grammarAccess.getAttributeAccess().getLeftCurlyBracketKeyword_6_1());
                        
                    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:2863:1: ( (lv_annotations_8_0= ruleAnnotation ) )
                    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:2864:1: (lv_annotations_8_0= ruleAnnotation )
                    {
                    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:2864:1: (lv_annotations_8_0= ruleAnnotation )
                    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:2865:3: lv_annotations_8_0= ruleAnnotation
                    {
                     
                    	        newCompositeNode(grammarAccess.getAttributeAccess().getAnnotationsAnnotationParserRuleCall_6_2_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleAnnotation_in_ruleAttribute5734);
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

                    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:2881:2: (otherlv_9= ',' ( (lv_annotations_10_0= ruleAnnotation ) ) )*
                    loop90:
                    do {
                        int alt90=2;
                        int LA90_0 = input.LA(1);

                        if ( (LA90_0==18) ) {
                            alt90=1;
                        }


                        switch (alt90) {
                    	case 1 :
                    	    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:2881:4: otherlv_9= ',' ( (lv_annotations_10_0= ruleAnnotation ) )
                    	    {
                    	    otherlv_9=(Token)match(input,18,FollowSets000.FOLLOW_18_in_ruleAttribute5747); 

                    	        	newLeafNode(otherlv_9, grammarAccess.getAttributeAccess().getCommaKeyword_6_3_0());
                    	        
                    	    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:2885:1: ( (lv_annotations_10_0= ruleAnnotation ) )
                    	    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:2886:1: (lv_annotations_10_0= ruleAnnotation )
                    	    {
                    	    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:2886:1: (lv_annotations_10_0= ruleAnnotation )
                    	    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:2887:3: lv_annotations_10_0= ruleAnnotation
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getAttributeAccess().getAnnotationsAnnotationParserRuleCall_6_3_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleAnnotation_in_ruleAttribute5768);
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
                    	    break loop90;
                        }
                    } while (true);

                    otherlv_11=(Token)match(input,22,FollowSets000.FOLLOW_22_in_ruleAttribute5782); 

                        	newLeafNode(otherlv_11, grammarAccess.getAttributeAccess().getRightCurlyBracketKeyword_6_4());
                        

                    }
                    break;

            }

            otherlv_12=(Token)match(input,22,FollowSets000.FOLLOW_22_in_ruleAttribute5796); 

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
    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:2919:1: entryRuleEJavaObject returns [String current=null] : iv_ruleEJavaObject= ruleEJavaObject EOF ;
    public final String entryRuleEJavaObject() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEJavaObject = null;


        try {
            // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:2920:2: (iv_ruleEJavaObject= ruleEJavaObject EOF )
            // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:2921:2: iv_ruleEJavaObject= ruleEJavaObject EOF
            {
             newCompositeNode(grammarAccess.getEJavaObjectRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleEJavaObject_in_entryRuleEJavaObject5833);
            iv_ruleEJavaObject=ruleEJavaObject();

            state._fsp--;

             current =iv_ruleEJavaObject.getText(); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleEJavaObject5844); 

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
    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:2928:1: ruleEJavaObject returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= 'EJavaObject' ;
    public final AntlrDatatypeRuleToken ruleEJavaObject() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:2931:28: (kw= 'EJavaObject' )
            // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:2933:2: kw= 'EJavaObject'
            {
            kw=(Token)match(input,56,FollowSets000.FOLLOW_56_in_ruleEJavaObject5881); 

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
    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:2946:1: entryRuleCarrierSet returns [EObject current=null] : iv_ruleCarrierSet= ruleCarrierSet EOF ;
    public final EObject entryRuleCarrierSet() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCarrierSet = null;


        try {
            // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:2947:2: (iv_ruleCarrierSet= ruleCarrierSet EOF )
            // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:2948:2: iv_ruleCarrierSet= ruleCarrierSet EOF
            {
             newCompositeNode(grammarAccess.getCarrierSetRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleCarrierSet_in_entryRuleCarrierSet5920);
            iv_ruleCarrierSet=ruleCarrierSet();

            state._fsp--;

             current =iv_ruleCarrierSet; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleCarrierSet5930); 

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
    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:2955:1: ruleCarrierSet returns [EObject current=null] : ( () ( (lv_localGenerated_1_0= 'localGenerated' ) )? otherlv_2= 'CarrierSet' ( (lv_name_3_0= ruleEString ) ) otherlv_4= '{' (otherlv_5= 'internalId' ( (lv_internalId_6_0= ruleEString ) ) )? (otherlv_7= 'comment' ( (lv_comment_8_0= ruleEString ) ) )? (otherlv_9= 'annotations' otherlv_10= '{' ( (lv_annotations_11_0= ruleAnnotation ) ) (otherlv_12= ',' ( (lv_annotations_13_0= ruleAnnotation ) ) )* otherlv_14= '}' )? (otherlv_15= 'extensions' otherlv_16= '{' ( (lv_extensions_17_0= ruleAbstractExtension ) ) (otherlv_18= ',' ( (lv_extensions_19_0= ruleAbstractExtension ) ) )* otherlv_20= '}' )? (otherlv_21= 'attributes' otherlv_22= '{' ( (lv_attributes_23_0= ruleStringToAttributeMapEntry ) ) (otherlv_24= ',' ( (lv_attributes_25_0= ruleStringToAttributeMapEntry ) ) )* otherlv_26= '}' )? otherlv_27= '}' ) ;
    public final EObject ruleCarrierSet() throws RecognitionException {
        EObject current = null;

        Token lv_localGenerated_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
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
        Token otherlv_27=null;
        AntlrDatatypeRuleToken lv_name_3_0 = null;

        AntlrDatatypeRuleToken lv_internalId_6_0 = null;

        AntlrDatatypeRuleToken lv_comment_8_0 = null;

        EObject lv_annotations_11_0 = null;

        EObject lv_annotations_13_0 = null;

        EObject lv_extensions_17_0 = null;

        EObject lv_extensions_19_0 = null;

        EObject lv_attributes_23_0 = null;

        EObject lv_attributes_25_0 = null;


         enterRule(); 
            
        try {
            // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:2958:28: ( ( () ( (lv_localGenerated_1_0= 'localGenerated' ) )? otherlv_2= 'CarrierSet' ( (lv_name_3_0= ruleEString ) ) otherlv_4= '{' (otherlv_5= 'internalId' ( (lv_internalId_6_0= ruleEString ) ) )? (otherlv_7= 'comment' ( (lv_comment_8_0= ruleEString ) ) )? (otherlv_9= 'annotations' otherlv_10= '{' ( (lv_annotations_11_0= ruleAnnotation ) ) (otherlv_12= ',' ( (lv_annotations_13_0= ruleAnnotation ) ) )* otherlv_14= '}' )? (otherlv_15= 'extensions' otherlv_16= '{' ( (lv_extensions_17_0= ruleAbstractExtension ) ) (otherlv_18= ',' ( (lv_extensions_19_0= ruleAbstractExtension ) ) )* otherlv_20= '}' )? (otherlv_21= 'attributes' otherlv_22= '{' ( (lv_attributes_23_0= ruleStringToAttributeMapEntry ) ) (otherlv_24= ',' ( (lv_attributes_25_0= ruleStringToAttributeMapEntry ) ) )* otherlv_26= '}' )? otherlv_27= '}' ) )
            // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:2959:1: ( () ( (lv_localGenerated_1_0= 'localGenerated' ) )? otherlv_2= 'CarrierSet' ( (lv_name_3_0= ruleEString ) ) otherlv_4= '{' (otherlv_5= 'internalId' ( (lv_internalId_6_0= ruleEString ) ) )? (otherlv_7= 'comment' ( (lv_comment_8_0= ruleEString ) ) )? (otherlv_9= 'annotations' otherlv_10= '{' ( (lv_annotations_11_0= ruleAnnotation ) ) (otherlv_12= ',' ( (lv_annotations_13_0= ruleAnnotation ) ) )* otherlv_14= '}' )? (otherlv_15= 'extensions' otherlv_16= '{' ( (lv_extensions_17_0= ruleAbstractExtension ) ) (otherlv_18= ',' ( (lv_extensions_19_0= ruleAbstractExtension ) ) )* otherlv_20= '}' )? (otherlv_21= 'attributes' otherlv_22= '{' ( (lv_attributes_23_0= ruleStringToAttributeMapEntry ) ) (otherlv_24= ',' ( (lv_attributes_25_0= ruleStringToAttributeMapEntry ) ) )* otherlv_26= '}' )? otherlv_27= '}' )
            {
            // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:2959:1: ( () ( (lv_localGenerated_1_0= 'localGenerated' ) )? otherlv_2= 'CarrierSet' ( (lv_name_3_0= ruleEString ) ) otherlv_4= '{' (otherlv_5= 'internalId' ( (lv_internalId_6_0= ruleEString ) ) )? (otherlv_7= 'comment' ( (lv_comment_8_0= ruleEString ) ) )? (otherlv_9= 'annotations' otherlv_10= '{' ( (lv_annotations_11_0= ruleAnnotation ) ) (otherlv_12= ',' ( (lv_annotations_13_0= ruleAnnotation ) ) )* otherlv_14= '}' )? (otherlv_15= 'extensions' otherlv_16= '{' ( (lv_extensions_17_0= ruleAbstractExtension ) ) (otherlv_18= ',' ( (lv_extensions_19_0= ruleAbstractExtension ) ) )* otherlv_20= '}' )? (otherlv_21= 'attributes' otherlv_22= '{' ( (lv_attributes_23_0= ruleStringToAttributeMapEntry ) ) (otherlv_24= ',' ( (lv_attributes_25_0= ruleStringToAttributeMapEntry ) ) )* otherlv_26= '}' )? otherlv_27= '}' )
            // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:2959:2: () ( (lv_localGenerated_1_0= 'localGenerated' ) )? otherlv_2= 'CarrierSet' ( (lv_name_3_0= ruleEString ) ) otherlv_4= '{' (otherlv_5= 'internalId' ( (lv_internalId_6_0= ruleEString ) ) )? (otherlv_7= 'comment' ( (lv_comment_8_0= ruleEString ) ) )? (otherlv_9= 'annotations' otherlv_10= '{' ( (lv_annotations_11_0= ruleAnnotation ) ) (otherlv_12= ',' ( (lv_annotations_13_0= ruleAnnotation ) ) )* otherlv_14= '}' )? (otherlv_15= 'extensions' otherlv_16= '{' ( (lv_extensions_17_0= ruleAbstractExtension ) ) (otherlv_18= ',' ( (lv_extensions_19_0= ruleAbstractExtension ) ) )* otherlv_20= '}' )? (otherlv_21= 'attributes' otherlv_22= '{' ( (lv_attributes_23_0= ruleStringToAttributeMapEntry ) ) (otherlv_24= ',' ( (lv_attributes_25_0= ruleStringToAttributeMapEntry ) ) )* otherlv_26= '}' )? otherlv_27= '}'
            {
            // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:2959:2: ()
            // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:2960:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getCarrierSetAccess().getCarrierSetAction_0(),
                        current);
                

            }

            // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:2965:2: ( (lv_localGenerated_1_0= 'localGenerated' ) )?
            int alt92=2;
            int LA92_0 = input.LA(1);

            if ( (LA92_0==11) ) {
                alt92=1;
            }
            switch (alt92) {
                case 1 :
                    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:2966:1: (lv_localGenerated_1_0= 'localGenerated' )
                    {
                    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:2966:1: (lv_localGenerated_1_0= 'localGenerated' )
                    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:2967:3: lv_localGenerated_1_0= 'localGenerated'
                    {
                    lv_localGenerated_1_0=(Token)match(input,11,FollowSets000.FOLLOW_11_in_ruleCarrierSet5982); 

                            newLeafNode(lv_localGenerated_1_0, grammarAccess.getCarrierSetAccess().getLocalGeneratedLocalGeneratedKeyword_1_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getCarrierSetRule());
                    	        }
                           		setWithLastConsumed(current, "localGenerated", true, "localGenerated");
                    	    

                    }


                    }
                    break;

            }

            otherlv_2=(Token)match(input,57,FollowSets000.FOLLOW_57_in_ruleCarrierSet6008); 

                	newLeafNode(otherlv_2, grammarAccess.getCarrierSetAccess().getCarrierSetKeyword_2());
                
            // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:2984:1: ( (lv_name_3_0= ruleEString ) )
            // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:2985:1: (lv_name_3_0= ruleEString )
            {
            // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:2985:1: (lv_name_3_0= ruleEString )
            // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:2986:3: lv_name_3_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getCarrierSetAccess().getNameEStringParserRuleCall_3_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleCarrierSet6029);
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

            otherlv_4=(Token)match(input,13,FollowSets000.FOLLOW_13_in_ruleCarrierSet6041); 

                	newLeafNode(otherlv_4, grammarAccess.getCarrierSetAccess().getLeftCurlyBracketKeyword_4());
                
            // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:3006:1: (otherlv_5= 'internalId' ( (lv_internalId_6_0= ruleEString ) ) )?
            int alt93=2;
            int LA93_0 = input.LA(1);

            if ( (LA93_0==14) ) {
                alt93=1;
            }
            switch (alt93) {
                case 1 :
                    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:3006:3: otherlv_5= 'internalId' ( (lv_internalId_6_0= ruleEString ) )
                    {
                    otherlv_5=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleCarrierSet6054); 

                        	newLeafNode(otherlv_5, grammarAccess.getCarrierSetAccess().getInternalIdKeyword_5_0());
                        
                    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:3010:1: ( (lv_internalId_6_0= ruleEString ) )
                    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:3011:1: (lv_internalId_6_0= ruleEString )
                    {
                    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:3011:1: (lv_internalId_6_0= ruleEString )
                    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:3012:3: lv_internalId_6_0= ruleEString
                    {
                     
                    	        newCompositeNode(grammarAccess.getCarrierSetAccess().getInternalIdEStringParserRuleCall_5_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleCarrierSet6075);
                    lv_internalId_6_0=ruleEString();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getCarrierSetRule());
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

            // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:3028:4: (otherlv_7= 'comment' ( (lv_comment_8_0= ruleEString ) ) )?
            int alt94=2;
            int LA94_0 = input.LA(1);

            if ( (LA94_0==15) ) {
                alt94=1;
            }
            switch (alt94) {
                case 1 :
                    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:3028:6: otherlv_7= 'comment' ( (lv_comment_8_0= ruleEString ) )
                    {
                    otherlv_7=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleCarrierSet6090); 

                        	newLeafNode(otherlv_7, grammarAccess.getCarrierSetAccess().getCommentKeyword_6_0());
                        
                    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:3032:1: ( (lv_comment_8_0= ruleEString ) )
                    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:3033:1: (lv_comment_8_0= ruleEString )
                    {
                    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:3033:1: (lv_comment_8_0= ruleEString )
                    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:3034:3: lv_comment_8_0= ruleEString
                    {
                     
                    	        newCompositeNode(grammarAccess.getCarrierSetAccess().getCommentEStringParserRuleCall_6_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleCarrierSet6111);
                    lv_comment_8_0=ruleEString();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getCarrierSetRule());
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

            // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:3050:4: (otherlv_9= 'annotations' otherlv_10= '{' ( (lv_annotations_11_0= ruleAnnotation ) ) (otherlv_12= ',' ( (lv_annotations_13_0= ruleAnnotation ) ) )* otherlv_14= '}' )?
            int alt96=2;
            int LA96_0 = input.LA(1);

            if ( (LA96_0==21) ) {
                alt96=1;
            }
            switch (alt96) {
                case 1 :
                    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:3050:6: otherlv_9= 'annotations' otherlv_10= '{' ( (lv_annotations_11_0= ruleAnnotation ) ) (otherlv_12= ',' ( (lv_annotations_13_0= ruleAnnotation ) ) )* otherlv_14= '}'
                    {
                    otherlv_9=(Token)match(input,21,FollowSets000.FOLLOW_21_in_ruleCarrierSet6126); 

                        	newLeafNode(otherlv_9, grammarAccess.getCarrierSetAccess().getAnnotationsKeyword_7_0());
                        
                    otherlv_10=(Token)match(input,13,FollowSets000.FOLLOW_13_in_ruleCarrierSet6138); 

                        	newLeafNode(otherlv_10, grammarAccess.getCarrierSetAccess().getLeftCurlyBracketKeyword_7_1());
                        
                    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:3058:1: ( (lv_annotations_11_0= ruleAnnotation ) )
                    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:3059:1: (lv_annotations_11_0= ruleAnnotation )
                    {
                    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:3059:1: (lv_annotations_11_0= ruleAnnotation )
                    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:3060:3: lv_annotations_11_0= ruleAnnotation
                    {
                     
                    	        newCompositeNode(grammarAccess.getCarrierSetAccess().getAnnotationsAnnotationParserRuleCall_7_2_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleAnnotation_in_ruleCarrierSet6159);
                    lv_annotations_11_0=ruleAnnotation();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getCarrierSetRule());
                    	        }
                           		add(
                           			current, 
                           			"annotations",
                            		lv_annotations_11_0, 
                            		"Annotation");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:3076:2: (otherlv_12= ',' ( (lv_annotations_13_0= ruleAnnotation ) ) )*
                    loop95:
                    do {
                        int alt95=2;
                        int LA95_0 = input.LA(1);

                        if ( (LA95_0==18) ) {
                            alt95=1;
                        }


                        switch (alt95) {
                    	case 1 :
                    	    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:3076:4: otherlv_12= ',' ( (lv_annotations_13_0= ruleAnnotation ) )
                    	    {
                    	    otherlv_12=(Token)match(input,18,FollowSets000.FOLLOW_18_in_ruleCarrierSet6172); 

                    	        	newLeafNode(otherlv_12, grammarAccess.getCarrierSetAccess().getCommaKeyword_7_3_0());
                    	        
                    	    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:3080:1: ( (lv_annotations_13_0= ruleAnnotation ) )
                    	    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:3081:1: (lv_annotations_13_0= ruleAnnotation )
                    	    {
                    	    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:3081:1: (lv_annotations_13_0= ruleAnnotation )
                    	    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:3082:3: lv_annotations_13_0= ruleAnnotation
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getCarrierSetAccess().getAnnotationsAnnotationParserRuleCall_7_3_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleAnnotation_in_ruleCarrierSet6193);
                    	    lv_annotations_13_0=ruleAnnotation();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getCarrierSetRule());
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
                    	    break loop95;
                        }
                    } while (true);

                    otherlv_14=(Token)match(input,22,FollowSets000.FOLLOW_22_in_ruleCarrierSet6207); 

                        	newLeafNode(otherlv_14, grammarAccess.getCarrierSetAccess().getRightCurlyBracketKeyword_7_4());
                        

                    }
                    break;

            }

            // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:3102:3: (otherlv_15= 'extensions' otherlv_16= '{' ( (lv_extensions_17_0= ruleAbstractExtension ) ) (otherlv_18= ',' ( (lv_extensions_19_0= ruleAbstractExtension ) ) )* otherlv_20= '}' )?
            int alt98=2;
            int LA98_0 = input.LA(1);

            if ( (LA98_0==23) ) {
                alt98=1;
            }
            switch (alt98) {
                case 1 :
                    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:3102:5: otherlv_15= 'extensions' otherlv_16= '{' ( (lv_extensions_17_0= ruleAbstractExtension ) ) (otherlv_18= ',' ( (lv_extensions_19_0= ruleAbstractExtension ) ) )* otherlv_20= '}'
                    {
                    otherlv_15=(Token)match(input,23,FollowSets000.FOLLOW_23_in_ruleCarrierSet6222); 

                        	newLeafNode(otherlv_15, grammarAccess.getCarrierSetAccess().getExtensionsKeyword_8_0());
                        
                    otherlv_16=(Token)match(input,13,FollowSets000.FOLLOW_13_in_ruleCarrierSet6234); 

                        	newLeafNode(otherlv_16, grammarAccess.getCarrierSetAccess().getLeftCurlyBracketKeyword_8_1());
                        
                    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:3110:1: ( (lv_extensions_17_0= ruleAbstractExtension ) )
                    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:3111:1: (lv_extensions_17_0= ruleAbstractExtension )
                    {
                    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:3111:1: (lv_extensions_17_0= ruleAbstractExtension )
                    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:3112:3: lv_extensions_17_0= ruleAbstractExtension
                    {
                     
                    	        newCompositeNode(grammarAccess.getCarrierSetAccess().getExtensionsAbstractExtensionParserRuleCall_8_2_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleAbstractExtension_in_ruleCarrierSet6255);
                    lv_extensions_17_0=ruleAbstractExtension();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getCarrierSetRule());
                    	        }
                           		add(
                           			current, 
                           			"extensions",
                            		lv_extensions_17_0, 
                            		"AbstractExtension");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:3128:2: (otherlv_18= ',' ( (lv_extensions_19_0= ruleAbstractExtension ) ) )*
                    loop97:
                    do {
                        int alt97=2;
                        int LA97_0 = input.LA(1);

                        if ( (LA97_0==18) ) {
                            alt97=1;
                        }


                        switch (alt97) {
                    	case 1 :
                    	    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:3128:4: otherlv_18= ',' ( (lv_extensions_19_0= ruleAbstractExtension ) )
                    	    {
                    	    otherlv_18=(Token)match(input,18,FollowSets000.FOLLOW_18_in_ruleCarrierSet6268); 

                    	        	newLeafNode(otherlv_18, grammarAccess.getCarrierSetAccess().getCommaKeyword_8_3_0());
                    	        
                    	    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:3132:1: ( (lv_extensions_19_0= ruleAbstractExtension ) )
                    	    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:3133:1: (lv_extensions_19_0= ruleAbstractExtension )
                    	    {
                    	    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:3133:1: (lv_extensions_19_0= ruleAbstractExtension )
                    	    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:3134:3: lv_extensions_19_0= ruleAbstractExtension
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getCarrierSetAccess().getExtensionsAbstractExtensionParserRuleCall_8_3_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleAbstractExtension_in_ruleCarrierSet6289);
                    	    lv_extensions_19_0=ruleAbstractExtension();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getCarrierSetRule());
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
                    	    break loop97;
                        }
                    } while (true);

                    otherlv_20=(Token)match(input,22,FollowSets000.FOLLOW_22_in_ruleCarrierSet6303); 

                        	newLeafNode(otherlv_20, grammarAccess.getCarrierSetAccess().getRightCurlyBracketKeyword_8_4());
                        

                    }
                    break;

            }

            // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:3154:3: (otherlv_21= 'attributes' otherlv_22= '{' ( (lv_attributes_23_0= ruleStringToAttributeMapEntry ) ) (otherlv_24= ',' ( (lv_attributes_25_0= ruleStringToAttributeMapEntry ) ) )* otherlv_26= '}' )?
            int alt100=2;
            int LA100_0 = input.LA(1);

            if ( (LA100_0==24) ) {
                alt100=1;
            }
            switch (alt100) {
                case 1 :
                    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:3154:5: otherlv_21= 'attributes' otherlv_22= '{' ( (lv_attributes_23_0= ruleStringToAttributeMapEntry ) ) (otherlv_24= ',' ( (lv_attributes_25_0= ruleStringToAttributeMapEntry ) ) )* otherlv_26= '}'
                    {
                    otherlv_21=(Token)match(input,24,FollowSets000.FOLLOW_24_in_ruleCarrierSet6318); 

                        	newLeafNode(otherlv_21, grammarAccess.getCarrierSetAccess().getAttributesKeyword_9_0());
                        
                    otherlv_22=(Token)match(input,13,FollowSets000.FOLLOW_13_in_ruleCarrierSet6330); 

                        	newLeafNode(otherlv_22, grammarAccess.getCarrierSetAccess().getLeftCurlyBracketKeyword_9_1());
                        
                    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:3162:1: ( (lv_attributes_23_0= ruleStringToAttributeMapEntry ) )
                    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:3163:1: (lv_attributes_23_0= ruleStringToAttributeMapEntry )
                    {
                    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:3163:1: (lv_attributes_23_0= ruleStringToAttributeMapEntry )
                    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:3164:3: lv_attributes_23_0= ruleStringToAttributeMapEntry
                    {
                     
                    	        newCompositeNode(grammarAccess.getCarrierSetAccess().getAttributesStringToAttributeMapEntryParserRuleCall_9_2_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleStringToAttributeMapEntry_in_ruleCarrierSet6351);
                    lv_attributes_23_0=ruleStringToAttributeMapEntry();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getCarrierSetRule());
                    	        }
                           		add(
                           			current, 
                           			"attributes",
                            		lv_attributes_23_0, 
                            		"StringToAttributeMapEntry");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:3180:2: (otherlv_24= ',' ( (lv_attributes_25_0= ruleStringToAttributeMapEntry ) ) )*
                    loop99:
                    do {
                        int alt99=2;
                        int LA99_0 = input.LA(1);

                        if ( (LA99_0==18) ) {
                            alt99=1;
                        }


                        switch (alt99) {
                    	case 1 :
                    	    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:3180:4: otherlv_24= ',' ( (lv_attributes_25_0= ruleStringToAttributeMapEntry ) )
                    	    {
                    	    otherlv_24=(Token)match(input,18,FollowSets000.FOLLOW_18_in_ruleCarrierSet6364); 

                    	        	newLeafNode(otherlv_24, grammarAccess.getCarrierSetAccess().getCommaKeyword_9_3_0());
                    	        
                    	    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:3184:1: ( (lv_attributes_25_0= ruleStringToAttributeMapEntry ) )
                    	    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:3185:1: (lv_attributes_25_0= ruleStringToAttributeMapEntry )
                    	    {
                    	    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:3185:1: (lv_attributes_25_0= ruleStringToAttributeMapEntry )
                    	    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:3186:3: lv_attributes_25_0= ruleStringToAttributeMapEntry
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getCarrierSetAccess().getAttributesStringToAttributeMapEntryParserRuleCall_9_3_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleStringToAttributeMapEntry_in_ruleCarrierSet6385);
                    	    lv_attributes_25_0=ruleStringToAttributeMapEntry();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getCarrierSetRule());
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
                    	    break loop99;
                        }
                    } while (true);

                    otherlv_26=(Token)match(input,22,FollowSets000.FOLLOW_22_in_ruleCarrierSet6399); 

                        	newLeafNode(otherlv_26, grammarAccess.getCarrierSetAccess().getRightCurlyBracketKeyword_9_4());
                        

                    }
                    break;

            }

            otherlv_27=(Token)match(input,22,FollowSets000.FOLLOW_22_in_ruleCarrierSet6413); 

                	newLeafNode(otherlv_27, grammarAccess.getCarrierSetAccess().getRightCurlyBracketKeyword_10());
                

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
    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:3218:1: entryRuleConstant returns [EObject current=null] : iv_ruleConstant= ruleConstant EOF ;
    public final EObject entryRuleConstant() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConstant = null;


        try {
            // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:3219:2: (iv_ruleConstant= ruleConstant EOF )
            // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:3220:2: iv_ruleConstant= ruleConstant EOF
            {
             newCompositeNode(grammarAccess.getConstantRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleConstant_in_entryRuleConstant6449);
            iv_ruleConstant=ruleConstant();

            state._fsp--;

             current =iv_ruleConstant; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleConstant6459); 

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
    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:3227:1: ruleConstant returns [EObject current=null] : ( () ( (lv_localGenerated_1_0= 'localGenerated' ) )? otherlv_2= 'Constant' ( (lv_name_3_0= ruleEString ) ) otherlv_4= '{' (otherlv_5= 'internalId' ( (lv_internalId_6_0= ruleEString ) ) )? (otherlv_7= 'comment' ( (lv_comment_8_0= ruleEString ) ) )? (otherlv_9= 'annotations' otherlv_10= '{' ( (lv_annotations_11_0= ruleAnnotation ) ) (otherlv_12= ',' ( (lv_annotations_13_0= ruleAnnotation ) ) )* otherlv_14= '}' )? (otherlv_15= 'extensions' otherlv_16= '{' ( (lv_extensions_17_0= ruleAbstractExtension ) ) (otherlv_18= ',' ( (lv_extensions_19_0= ruleAbstractExtension ) ) )* otherlv_20= '}' )? (otherlv_21= 'attributes' otherlv_22= '{' ( (lv_attributes_23_0= ruleStringToAttributeMapEntry ) ) (otherlv_24= ',' ( (lv_attributes_25_0= ruleStringToAttributeMapEntry ) ) )* otherlv_26= '}' )? otherlv_27= '}' ) ;
    public final EObject ruleConstant() throws RecognitionException {
        EObject current = null;

        Token lv_localGenerated_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
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
        Token otherlv_27=null;
        AntlrDatatypeRuleToken lv_name_3_0 = null;

        AntlrDatatypeRuleToken lv_internalId_6_0 = null;

        AntlrDatatypeRuleToken lv_comment_8_0 = null;

        EObject lv_annotations_11_0 = null;

        EObject lv_annotations_13_0 = null;

        EObject lv_extensions_17_0 = null;

        EObject lv_extensions_19_0 = null;

        EObject lv_attributes_23_0 = null;

        EObject lv_attributes_25_0 = null;


         enterRule(); 
            
        try {
            // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:3230:28: ( ( () ( (lv_localGenerated_1_0= 'localGenerated' ) )? otherlv_2= 'Constant' ( (lv_name_3_0= ruleEString ) ) otherlv_4= '{' (otherlv_5= 'internalId' ( (lv_internalId_6_0= ruleEString ) ) )? (otherlv_7= 'comment' ( (lv_comment_8_0= ruleEString ) ) )? (otherlv_9= 'annotations' otherlv_10= '{' ( (lv_annotations_11_0= ruleAnnotation ) ) (otherlv_12= ',' ( (lv_annotations_13_0= ruleAnnotation ) ) )* otherlv_14= '}' )? (otherlv_15= 'extensions' otherlv_16= '{' ( (lv_extensions_17_0= ruleAbstractExtension ) ) (otherlv_18= ',' ( (lv_extensions_19_0= ruleAbstractExtension ) ) )* otherlv_20= '}' )? (otherlv_21= 'attributes' otherlv_22= '{' ( (lv_attributes_23_0= ruleStringToAttributeMapEntry ) ) (otherlv_24= ',' ( (lv_attributes_25_0= ruleStringToAttributeMapEntry ) ) )* otherlv_26= '}' )? otherlv_27= '}' ) )
            // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:3231:1: ( () ( (lv_localGenerated_1_0= 'localGenerated' ) )? otherlv_2= 'Constant' ( (lv_name_3_0= ruleEString ) ) otherlv_4= '{' (otherlv_5= 'internalId' ( (lv_internalId_6_0= ruleEString ) ) )? (otherlv_7= 'comment' ( (lv_comment_8_0= ruleEString ) ) )? (otherlv_9= 'annotations' otherlv_10= '{' ( (lv_annotations_11_0= ruleAnnotation ) ) (otherlv_12= ',' ( (lv_annotations_13_0= ruleAnnotation ) ) )* otherlv_14= '}' )? (otherlv_15= 'extensions' otherlv_16= '{' ( (lv_extensions_17_0= ruleAbstractExtension ) ) (otherlv_18= ',' ( (lv_extensions_19_0= ruleAbstractExtension ) ) )* otherlv_20= '}' )? (otherlv_21= 'attributes' otherlv_22= '{' ( (lv_attributes_23_0= ruleStringToAttributeMapEntry ) ) (otherlv_24= ',' ( (lv_attributes_25_0= ruleStringToAttributeMapEntry ) ) )* otherlv_26= '}' )? otherlv_27= '}' )
            {
            // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:3231:1: ( () ( (lv_localGenerated_1_0= 'localGenerated' ) )? otherlv_2= 'Constant' ( (lv_name_3_0= ruleEString ) ) otherlv_4= '{' (otherlv_5= 'internalId' ( (lv_internalId_6_0= ruleEString ) ) )? (otherlv_7= 'comment' ( (lv_comment_8_0= ruleEString ) ) )? (otherlv_9= 'annotations' otherlv_10= '{' ( (lv_annotations_11_0= ruleAnnotation ) ) (otherlv_12= ',' ( (lv_annotations_13_0= ruleAnnotation ) ) )* otherlv_14= '}' )? (otherlv_15= 'extensions' otherlv_16= '{' ( (lv_extensions_17_0= ruleAbstractExtension ) ) (otherlv_18= ',' ( (lv_extensions_19_0= ruleAbstractExtension ) ) )* otherlv_20= '}' )? (otherlv_21= 'attributes' otherlv_22= '{' ( (lv_attributes_23_0= ruleStringToAttributeMapEntry ) ) (otherlv_24= ',' ( (lv_attributes_25_0= ruleStringToAttributeMapEntry ) ) )* otherlv_26= '}' )? otherlv_27= '}' )
            // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:3231:2: () ( (lv_localGenerated_1_0= 'localGenerated' ) )? otherlv_2= 'Constant' ( (lv_name_3_0= ruleEString ) ) otherlv_4= '{' (otherlv_5= 'internalId' ( (lv_internalId_6_0= ruleEString ) ) )? (otherlv_7= 'comment' ( (lv_comment_8_0= ruleEString ) ) )? (otherlv_9= 'annotations' otherlv_10= '{' ( (lv_annotations_11_0= ruleAnnotation ) ) (otherlv_12= ',' ( (lv_annotations_13_0= ruleAnnotation ) ) )* otherlv_14= '}' )? (otherlv_15= 'extensions' otherlv_16= '{' ( (lv_extensions_17_0= ruleAbstractExtension ) ) (otherlv_18= ',' ( (lv_extensions_19_0= ruleAbstractExtension ) ) )* otherlv_20= '}' )? (otherlv_21= 'attributes' otherlv_22= '{' ( (lv_attributes_23_0= ruleStringToAttributeMapEntry ) ) (otherlv_24= ',' ( (lv_attributes_25_0= ruleStringToAttributeMapEntry ) ) )* otherlv_26= '}' )? otherlv_27= '}'
            {
            // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:3231:2: ()
            // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:3232:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getConstantAccess().getConstantAction_0(),
                        current);
                

            }

            // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:3237:2: ( (lv_localGenerated_1_0= 'localGenerated' ) )?
            int alt101=2;
            int LA101_0 = input.LA(1);

            if ( (LA101_0==11) ) {
                alt101=1;
            }
            switch (alt101) {
                case 1 :
                    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:3238:1: (lv_localGenerated_1_0= 'localGenerated' )
                    {
                    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:3238:1: (lv_localGenerated_1_0= 'localGenerated' )
                    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:3239:3: lv_localGenerated_1_0= 'localGenerated'
                    {
                    lv_localGenerated_1_0=(Token)match(input,11,FollowSets000.FOLLOW_11_in_ruleConstant6511); 

                            newLeafNode(lv_localGenerated_1_0, grammarAccess.getConstantAccess().getLocalGeneratedLocalGeneratedKeyword_1_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getConstantRule());
                    	        }
                           		setWithLastConsumed(current, "localGenerated", true, "localGenerated");
                    	    

                    }


                    }
                    break;

            }

            otherlv_2=(Token)match(input,58,FollowSets000.FOLLOW_58_in_ruleConstant6537); 

                	newLeafNode(otherlv_2, grammarAccess.getConstantAccess().getConstantKeyword_2());
                
            // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:3256:1: ( (lv_name_3_0= ruleEString ) )
            // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:3257:1: (lv_name_3_0= ruleEString )
            {
            // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:3257:1: (lv_name_3_0= ruleEString )
            // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:3258:3: lv_name_3_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getConstantAccess().getNameEStringParserRuleCall_3_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleConstant6558);
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

            otherlv_4=(Token)match(input,13,FollowSets000.FOLLOW_13_in_ruleConstant6570); 

                	newLeafNode(otherlv_4, grammarAccess.getConstantAccess().getLeftCurlyBracketKeyword_4());
                
            // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:3278:1: (otherlv_5= 'internalId' ( (lv_internalId_6_0= ruleEString ) ) )?
            int alt102=2;
            int LA102_0 = input.LA(1);

            if ( (LA102_0==14) ) {
                alt102=1;
            }
            switch (alt102) {
                case 1 :
                    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:3278:3: otherlv_5= 'internalId' ( (lv_internalId_6_0= ruleEString ) )
                    {
                    otherlv_5=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleConstant6583); 

                        	newLeafNode(otherlv_5, grammarAccess.getConstantAccess().getInternalIdKeyword_5_0());
                        
                    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:3282:1: ( (lv_internalId_6_0= ruleEString ) )
                    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:3283:1: (lv_internalId_6_0= ruleEString )
                    {
                    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:3283:1: (lv_internalId_6_0= ruleEString )
                    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:3284:3: lv_internalId_6_0= ruleEString
                    {
                     
                    	        newCompositeNode(grammarAccess.getConstantAccess().getInternalIdEStringParserRuleCall_5_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleConstant6604);
                    lv_internalId_6_0=ruleEString();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getConstantRule());
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

            // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:3300:4: (otherlv_7= 'comment' ( (lv_comment_8_0= ruleEString ) ) )?
            int alt103=2;
            int LA103_0 = input.LA(1);

            if ( (LA103_0==15) ) {
                alt103=1;
            }
            switch (alt103) {
                case 1 :
                    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:3300:6: otherlv_7= 'comment' ( (lv_comment_8_0= ruleEString ) )
                    {
                    otherlv_7=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleConstant6619); 

                        	newLeafNode(otherlv_7, grammarAccess.getConstantAccess().getCommentKeyword_6_0());
                        
                    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:3304:1: ( (lv_comment_8_0= ruleEString ) )
                    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:3305:1: (lv_comment_8_0= ruleEString )
                    {
                    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:3305:1: (lv_comment_8_0= ruleEString )
                    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:3306:3: lv_comment_8_0= ruleEString
                    {
                     
                    	        newCompositeNode(grammarAccess.getConstantAccess().getCommentEStringParserRuleCall_6_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleConstant6640);
                    lv_comment_8_0=ruleEString();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getConstantRule());
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

            // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:3322:4: (otherlv_9= 'annotations' otherlv_10= '{' ( (lv_annotations_11_0= ruleAnnotation ) ) (otherlv_12= ',' ( (lv_annotations_13_0= ruleAnnotation ) ) )* otherlv_14= '}' )?
            int alt105=2;
            int LA105_0 = input.LA(1);

            if ( (LA105_0==21) ) {
                alt105=1;
            }
            switch (alt105) {
                case 1 :
                    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:3322:6: otherlv_9= 'annotations' otherlv_10= '{' ( (lv_annotations_11_0= ruleAnnotation ) ) (otherlv_12= ',' ( (lv_annotations_13_0= ruleAnnotation ) ) )* otherlv_14= '}'
                    {
                    otherlv_9=(Token)match(input,21,FollowSets000.FOLLOW_21_in_ruleConstant6655); 

                        	newLeafNode(otherlv_9, grammarAccess.getConstantAccess().getAnnotationsKeyword_7_0());
                        
                    otherlv_10=(Token)match(input,13,FollowSets000.FOLLOW_13_in_ruleConstant6667); 

                        	newLeafNode(otherlv_10, grammarAccess.getConstantAccess().getLeftCurlyBracketKeyword_7_1());
                        
                    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:3330:1: ( (lv_annotations_11_0= ruleAnnotation ) )
                    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:3331:1: (lv_annotations_11_0= ruleAnnotation )
                    {
                    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:3331:1: (lv_annotations_11_0= ruleAnnotation )
                    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:3332:3: lv_annotations_11_0= ruleAnnotation
                    {
                     
                    	        newCompositeNode(grammarAccess.getConstantAccess().getAnnotationsAnnotationParserRuleCall_7_2_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleAnnotation_in_ruleConstant6688);
                    lv_annotations_11_0=ruleAnnotation();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getConstantRule());
                    	        }
                           		add(
                           			current, 
                           			"annotations",
                            		lv_annotations_11_0, 
                            		"Annotation");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:3348:2: (otherlv_12= ',' ( (lv_annotations_13_0= ruleAnnotation ) ) )*
                    loop104:
                    do {
                        int alt104=2;
                        int LA104_0 = input.LA(1);

                        if ( (LA104_0==18) ) {
                            alt104=1;
                        }


                        switch (alt104) {
                    	case 1 :
                    	    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:3348:4: otherlv_12= ',' ( (lv_annotations_13_0= ruleAnnotation ) )
                    	    {
                    	    otherlv_12=(Token)match(input,18,FollowSets000.FOLLOW_18_in_ruleConstant6701); 

                    	        	newLeafNode(otherlv_12, grammarAccess.getConstantAccess().getCommaKeyword_7_3_0());
                    	        
                    	    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:3352:1: ( (lv_annotations_13_0= ruleAnnotation ) )
                    	    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:3353:1: (lv_annotations_13_0= ruleAnnotation )
                    	    {
                    	    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:3353:1: (lv_annotations_13_0= ruleAnnotation )
                    	    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:3354:3: lv_annotations_13_0= ruleAnnotation
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getConstantAccess().getAnnotationsAnnotationParserRuleCall_7_3_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleAnnotation_in_ruleConstant6722);
                    	    lv_annotations_13_0=ruleAnnotation();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getConstantRule());
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
                    	    break loop104;
                        }
                    } while (true);

                    otherlv_14=(Token)match(input,22,FollowSets000.FOLLOW_22_in_ruleConstant6736); 

                        	newLeafNode(otherlv_14, grammarAccess.getConstantAccess().getRightCurlyBracketKeyword_7_4());
                        

                    }
                    break;

            }

            // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:3374:3: (otherlv_15= 'extensions' otherlv_16= '{' ( (lv_extensions_17_0= ruleAbstractExtension ) ) (otherlv_18= ',' ( (lv_extensions_19_0= ruleAbstractExtension ) ) )* otherlv_20= '}' )?
            int alt107=2;
            int LA107_0 = input.LA(1);

            if ( (LA107_0==23) ) {
                alt107=1;
            }
            switch (alt107) {
                case 1 :
                    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:3374:5: otherlv_15= 'extensions' otherlv_16= '{' ( (lv_extensions_17_0= ruleAbstractExtension ) ) (otherlv_18= ',' ( (lv_extensions_19_0= ruleAbstractExtension ) ) )* otherlv_20= '}'
                    {
                    otherlv_15=(Token)match(input,23,FollowSets000.FOLLOW_23_in_ruleConstant6751); 

                        	newLeafNode(otherlv_15, grammarAccess.getConstantAccess().getExtensionsKeyword_8_0());
                        
                    otherlv_16=(Token)match(input,13,FollowSets000.FOLLOW_13_in_ruleConstant6763); 

                        	newLeafNode(otherlv_16, grammarAccess.getConstantAccess().getLeftCurlyBracketKeyword_8_1());
                        
                    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:3382:1: ( (lv_extensions_17_0= ruleAbstractExtension ) )
                    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:3383:1: (lv_extensions_17_0= ruleAbstractExtension )
                    {
                    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:3383:1: (lv_extensions_17_0= ruleAbstractExtension )
                    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:3384:3: lv_extensions_17_0= ruleAbstractExtension
                    {
                     
                    	        newCompositeNode(grammarAccess.getConstantAccess().getExtensionsAbstractExtensionParserRuleCall_8_2_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleAbstractExtension_in_ruleConstant6784);
                    lv_extensions_17_0=ruleAbstractExtension();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getConstantRule());
                    	        }
                           		add(
                           			current, 
                           			"extensions",
                            		lv_extensions_17_0, 
                            		"AbstractExtension");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:3400:2: (otherlv_18= ',' ( (lv_extensions_19_0= ruleAbstractExtension ) ) )*
                    loop106:
                    do {
                        int alt106=2;
                        int LA106_0 = input.LA(1);

                        if ( (LA106_0==18) ) {
                            alt106=1;
                        }


                        switch (alt106) {
                    	case 1 :
                    	    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:3400:4: otherlv_18= ',' ( (lv_extensions_19_0= ruleAbstractExtension ) )
                    	    {
                    	    otherlv_18=(Token)match(input,18,FollowSets000.FOLLOW_18_in_ruleConstant6797); 

                    	        	newLeafNode(otherlv_18, grammarAccess.getConstantAccess().getCommaKeyword_8_3_0());
                    	        
                    	    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:3404:1: ( (lv_extensions_19_0= ruleAbstractExtension ) )
                    	    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:3405:1: (lv_extensions_19_0= ruleAbstractExtension )
                    	    {
                    	    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:3405:1: (lv_extensions_19_0= ruleAbstractExtension )
                    	    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:3406:3: lv_extensions_19_0= ruleAbstractExtension
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getConstantAccess().getExtensionsAbstractExtensionParserRuleCall_8_3_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleAbstractExtension_in_ruleConstant6818);
                    	    lv_extensions_19_0=ruleAbstractExtension();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getConstantRule());
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
                    	    break loop106;
                        }
                    } while (true);

                    otherlv_20=(Token)match(input,22,FollowSets000.FOLLOW_22_in_ruleConstant6832); 

                        	newLeafNode(otherlv_20, grammarAccess.getConstantAccess().getRightCurlyBracketKeyword_8_4());
                        

                    }
                    break;

            }

            // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:3426:3: (otherlv_21= 'attributes' otherlv_22= '{' ( (lv_attributes_23_0= ruleStringToAttributeMapEntry ) ) (otherlv_24= ',' ( (lv_attributes_25_0= ruleStringToAttributeMapEntry ) ) )* otherlv_26= '}' )?
            int alt109=2;
            int LA109_0 = input.LA(1);

            if ( (LA109_0==24) ) {
                alt109=1;
            }
            switch (alt109) {
                case 1 :
                    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:3426:5: otherlv_21= 'attributes' otherlv_22= '{' ( (lv_attributes_23_0= ruleStringToAttributeMapEntry ) ) (otherlv_24= ',' ( (lv_attributes_25_0= ruleStringToAttributeMapEntry ) ) )* otherlv_26= '}'
                    {
                    otherlv_21=(Token)match(input,24,FollowSets000.FOLLOW_24_in_ruleConstant6847); 

                        	newLeafNode(otherlv_21, grammarAccess.getConstantAccess().getAttributesKeyword_9_0());
                        
                    otherlv_22=(Token)match(input,13,FollowSets000.FOLLOW_13_in_ruleConstant6859); 

                        	newLeafNode(otherlv_22, grammarAccess.getConstantAccess().getLeftCurlyBracketKeyword_9_1());
                        
                    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:3434:1: ( (lv_attributes_23_0= ruleStringToAttributeMapEntry ) )
                    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:3435:1: (lv_attributes_23_0= ruleStringToAttributeMapEntry )
                    {
                    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:3435:1: (lv_attributes_23_0= ruleStringToAttributeMapEntry )
                    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:3436:3: lv_attributes_23_0= ruleStringToAttributeMapEntry
                    {
                     
                    	        newCompositeNode(grammarAccess.getConstantAccess().getAttributesStringToAttributeMapEntryParserRuleCall_9_2_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleStringToAttributeMapEntry_in_ruleConstant6880);
                    lv_attributes_23_0=ruleStringToAttributeMapEntry();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getConstantRule());
                    	        }
                           		add(
                           			current, 
                           			"attributes",
                            		lv_attributes_23_0, 
                            		"StringToAttributeMapEntry");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:3452:2: (otherlv_24= ',' ( (lv_attributes_25_0= ruleStringToAttributeMapEntry ) ) )*
                    loop108:
                    do {
                        int alt108=2;
                        int LA108_0 = input.LA(1);

                        if ( (LA108_0==18) ) {
                            alt108=1;
                        }


                        switch (alt108) {
                    	case 1 :
                    	    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:3452:4: otherlv_24= ',' ( (lv_attributes_25_0= ruleStringToAttributeMapEntry ) )
                    	    {
                    	    otherlv_24=(Token)match(input,18,FollowSets000.FOLLOW_18_in_ruleConstant6893); 

                    	        	newLeafNode(otherlv_24, grammarAccess.getConstantAccess().getCommaKeyword_9_3_0());
                    	        
                    	    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:3456:1: ( (lv_attributes_25_0= ruleStringToAttributeMapEntry ) )
                    	    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:3457:1: (lv_attributes_25_0= ruleStringToAttributeMapEntry )
                    	    {
                    	    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:3457:1: (lv_attributes_25_0= ruleStringToAttributeMapEntry )
                    	    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:3458:3: lv_attributes_25_0= ruleStringToAttributeMapEntry
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getConstantAccess().getAttributesStringToAttributeMapEntryParserRuleCall_9_3_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleStringToAttributeMapEntry_in_ruleConstant6914);
                    	    lv_attributes_25_0=ruleStringToAttributeMapEntry();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getConstantRule());
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
                    	    break loop108;
                        }
                    } while (true);

                    otherlv_26=(Token)match(input,22,FollowSets000.FOLLOW_22_in_ruleConstant6928); 

                        	newLeafNode(otherlv_26, grammarAccess.getConstantAccess().getRightCurlyBracketKeyword_9_4());
                        

                    }
                    break;

            }

            otherlv_27=(Token)match(input,22,FollowSets000.FOLLOW_22_in_ruleConstant6942); 

                	newLeafNode(otherlv_27, grammarAccess.getConstantAccess().getRightCurlyBracketKeyword_10());
                

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
    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:3490:1: entryRuleAxiom returns [EObject current=null] : iv_ruleAxiom= ruleAxiom EOF ;
    public final EObject entryRuleAxiom() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAxiom = null;


        try {
            // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:3491:2: (iv_ruleAxiom= ruleAxiom EOF )
            // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:3492:2: iv_ruleAxiom= ruleAxiom EOF
            {
             newCompositeNode(grammarAccess.getAxiomRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleAxiom_in_entryRuleAxiom6978);
            iv_ruleAxiom=ruleAxiom();

            state._fsp--;

             current =iv_ruleAxiom; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleAxiom6988); 

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
    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:3499:1: ruleAxiom returns [EObject current=null] : ( ( (lv_localGenerated_0_0= 'localGenerated' ) )? ( (lv_theorem_1_0= 'theorem' ) ) otherlv_2= 'Axiom' ( (lv_name_3_0= ruleEString ) ) otherlv_4= '{' (otherlv_5= 'internalId' ( (lv_internalId_6_0= ruleEString ) ) )? (otherlv_7= 'comment' ( (lv_comment_8_0= ruleEString ) ) )? otherlv_9= 'predicate' ( (lv_predicate_10_0= ruleEString ) ) (otherlv_11= 'annotations' otherlv_12= '{' ( (lv_annotations_13_0= ruleAnnotation ) ) (otherlv_14= ',' ( (lv_annotations_15_0= ruleAnnotation ) ) )* otherlv_16= '}' )? (otherlv_17= 'extensions' otherlv_18= '{' ( (lv_extensions_19_0= ruleAbstractExtension ) ) (otherlv_20= ',' ( (lv_extensions_21_0= ruleAbstractExtension ) ) )* otherlv_22= '}' )? (otherlv_23= 'attributes' otherlv_24= '{' ( (lv_attributes_25_0= ruleStringToAttributeMapEntry ) ) (otherlv_26= ',' ( (lv_attributes_27_0= ruleStringToAttributeMapEntry ) ) )* otherlv_28= '}' )? otherlv_29= '}' ) ;
    public final EObject ruleAxiom() throws RecognitionException {
        EObject current = null;

        Token lv_localGenerated_0_0=null;
        Token lv_theorem_1_0=null;
        Token otherlv_2=null;
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
        Token otherlv_29=null;
        AntlrDatatypeRuleToken lv_name_3_0 = null;

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
            // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:3502:28: ( ( ( (lv_localGenerated_0_0= 'localGenerated' ) )? ( (lv_theorem_1_0= 'theorem' ) ) otherlv_2= 'Axiom' ( (lv_name_3_0= ruleEString ) ) otherlv_4= '{' (otherlv_5= 'internalId' ( (lv_internalId_6_0= ruleEString ) ) )? (otherlv_7= 'comment' ( (lv_comment_8_0= ruleEString ) ) )? otherlv_9= 'predicate' ( (lv_predicate_10_0= ruleEString ) ) (otherlv_11= 'annotations' otherlv_12= '{' ( (lv_annotations_13_0= ruleAnnotation ) ) (otherlv_14= ',' ( (lv_annotations_15_0= ruleAnnotation ) ) )* otherlv_16= '}' )? (otherlv_17= 'extensions' otherlv_18= '{' ( (lv_extensions_19_0= ruleAbstractExtension ) ) (otherlv_20= ',' ( (lv_extensions_21_0= ruleAbstractExtension ) ) )* otherlv_22= '}' )? (otherlv_23= 'attributes' otherlv_24= '{' ( (lv_attributes_25_0= ruleStringToAttributeMapEntry ) ) (otherlv_26= ',' ( (lv_attributes_27_0= ruleStringToAttributeMapEntry ) ) )* otherlv_28= '}' )? otherlv_29= '}' ) )
            // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:3503:1: ( ( (lv_localGenerated_0_0= 'localGenerated' ) )? ( (lv_theorem_1_0= 'theorem' ) ) otherlv_2= 'Axiom' ( (lv_name_3_0= ruleEString ) ) otherlv_4= '{' (otherlv_5= 'internalId' ( (lv_internalId_6_0= ruleEString ) ) )? (otherlv_7= 'comment' ( (lv_comment_8_0= ruleEString ) ) )? otherlv_9= 'predicate' ( (lv_predicate_10_0= ruleEString ) ) (otherlv_11= 'annotations' otherlv_12= '{' ( (lv_annotations_13_0= ruleAnnotation ) ) (otherlv_14= ',' ( (lv_annotations_15_0= ruleAnnotation ) ) )* otherlv_16= '}' )? (otherlv_17= 'extensions' otherlv_18= '{' ( (lv_extensions_19_0= ruleAbstractExtension ) ) (otherlv_20= ',' ( (lv_extensions_21_0= ruleAbstractExtension ) ) )* otherlv_22= '}' )? (otherlv_23= 'attributes' otherlv_24= '{' ( (lv_attributes_25_0= ruleStringToAttributeMapEntry ) ) (otherlv_26= ',' ( (lv_attributes_27_0= ruleStringToAttributeMapEntry ) ) )* otherlv_28= '}' )? otherlv_29= '}' )
            {
            // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:3503:1: ( ( (lv_localGenerated_0_0= 'localGenerated' ) )? ( (lv_theorem_1_0= 'theorem' ) ) otherlv_2= 'Axiom' ( (lv_name_3_0= ruleEString ) ) otherlv_4= '{' (otherlv_5= 'internalId' ( (lv_internalId_6_0= ruleEString ) ) )? (otherlv_7= 'comment' ( (lv_comment_8_0= ruleEString ) ) )? otherlv_9= 'predicate' ( (lv_predicate_10_0= ruleEString ) ) (otherlv_11= 'annotations' otherlv_12= '{' ( (lv_annotations_13_0= ruleAnnotation ) ) (otherlv_14= ',' ( (lv_annotations_15_0= ruleAnnotation ) ) )* otherlv_16= '}' )? (otherlv_17= 'extensions' otherlv_18= '{' ( (lv_extensions_19_0= ruleAbstractExtension ) ) (otherlv_20= ',' ( (lv_extensions_21_0= ruleAbstractExtension ) ) )* otherlv_22= '}' )? (otherlv_23= 'attributes' otherlv_24= '{' ( (lv_attributes_25_0= ruleStringToAttributeMapEntry ) ) (otherlv_26= ',' ( (lv_attributes_27_0= ruleStringToAttributeMapEntry ) ) )* otherlv_28= '}' )? otherlv_29= '}' )
            // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:3503:2: ( (lv_localGenerated_0_0= 'localGenerated' ) )? ( (lv_theorem_1_0= 'theorem' ) ) otherlv_2= 'Axiom' ( (lv_name_3_0= ruleEString ) ) otherlv_4= '{' (otherlv_5= 'internalId' ( (lv_internalId_6_0= ruleEString ) ) )? (otherlv_7= 'comment' ( (lv_comment_8_0= ruleEString ) ) )? otherlv_9= 'predicate' ( (lv_predicate_10_0= ruleEString ) ) (otherlv_11= 'annotations' otherlv_12= '{' ( (lv_annotations_13_0= ruleAnnotation ) ) (otherlv_14= ',' ( (lv_annotations_15_0= ruleAnnotation ) ) )* otherlv_16= '}' )? (otherlv_17= 'extensions' otherlv_18= '{' ( (lv_extensions_19_0= ruleAbstractExtension ) ) (otherlv_20= ',' ( (lv_extensions_21_0= ruleAbstractExtension ) ) )* otherlv_22= '}' )? (otherlv_23= 'attributes' otherlv_24= '{' ( (lv_attributes_25_0= ruleStringToAttributeMapEntry ) ) (otherlv_26= ',' ( (lv_attributes_27_0= ruleStringToAttributeMapEntry ) ) )* otherlv_28= '}' )? otherlv_29= '}'
            {
            // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:3503:2: ( (lv_localGenerated_0_0= 'localGenerated' ) )?
            int alt110=2;
            int LA110_0 = input.LA(1);

            if ( (LA110_0==11) ) {
                alt110=1;
            }
            switch (alt110) {
                case 1 :
                    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:3504:1: (lv_localGenerated_0_0= 'localGenerated' )
                    {
                    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:3504:1: (lv_localGenerated_0_0= 'localGenerated' )
                    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:3505:3: lv_localGenerated_0_0= 'localGenerated'
                    {
                    lv_localGenerated_0_0=(Token)match(input,11,FollowSets000.FOLLOW_11_in_ruleAxiom7031); 

                            newLeafNode(lv_localGenerated_0_0, grammarAccess.getAxiomAccess().getLocalGeneratedLocalGeneratedKeyword_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getAxiomRule());
                    	        }
                           		setWithLastConsumed(current, "localGenerated", true, "localGenerated");
                    	    

                    }


                    }
                    break;

            }

            // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:3518:3: ( (lv_theorem_1_0= 'theorem' ) )
            // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:3519:1: (lv_theorem_1_0= 'theorem' )
            {
            // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:3519:1: (lv_theorem_1_0= 'theorem' )
            // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:3520:3: lv_theorem_1_0= 'theorem'
            {
            lv_theorem_1_0=(Token)match(input,38,FollowSets000.FOLLOW_38_in_ruleAxiom7063); 

                    newLeafNode(lv_theorem_1_0, grammarAccess.getAxiomAccess().getTheoremTheoremKeyword_1_0());
                

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getAxiomRule());
            	        }
                   		setWithLastConsumed(current, "theorem", true, "theorem");
            	    

            }


            }

            otherlv_2=(Token)match(input,59,FollowSets000.FOLLOW_59_in_ruleAxiom7088); 

                	newLeafNode(otherlv_2, grammarAccess.getAxiomAccess().getAxiomKeyword_2());
                
            // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:3537:1: ( (lv_name_3_0= ruleEString ) )
            // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:3538:1: (lv_name_3_0= ruleEString )
            {
            // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:3538:1: (lv_name_3_0= ruleEString )
            // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:3539:3: lv_name_3_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getAxiomAccess().getNameEStringParserRuleCall_3_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleAxiom7109);
            lv_name_3_0=ruleEString();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getAxiomRule());
            	        }
                   		set(
                   			current, 
                   			"name",
                    		lv_name_3_0, 
                    		"EString");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_4=(Token)match(input,13,FollowSets000.FOLLOW_13_in_ruleAxiom7121); 

                	newLeafNode(otherlv_4, grammarAccess.getAxiomAccess().getLeftCurlyBracketKeyword_4());
                
            // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:3559:1: (otherlv_5= 'internalId' ( (lv_internalId_6_0= ruleEString ) ) )?
            int alt111=2;
            int LA111_0 = input.LA(1);

            if ( (LA111_0==14) ) {
                alt111=1;
            }
            switch (alt111) {
                case 1 :
                    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:3559:3: otherlv_5= 'internalId' ( (lv_internalId_6_0= ruleEString ) )
                    {
                    otherlv_5=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleAxiom7134); 

                        	newLeafNode(otherlv_5, grammarAccess.getAxiomAccess().getInternalIdKeyword_5_0());
                        
                    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:3563:1: ( (lv_internalId_6_0= ruleEString ) )
                    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:3564:1: (lv_internalId_6_0= ruleEString )
                    {
                    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:3564:1: (lv_internalId_6_0= ruleEString )
                    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:3565:3: lv_internalId_6_0= ruleEString
                    {
                     
                    	        newCompositeNode(grammarAccess.getAxiomAccess().getInternalIdEStringParserRuleCall_5_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleAxiom7155);
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

            // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:3581:4: (otherlv_7= 'comment' ( (lv_comment_8_0= ruleEString ) ) )?
            int alt112=2;
            int LA112_0 = input.LA(1);

            if ( (LA112_0==15) ) {
                alt112=1;
            }
            switch (alt112) {
                case 1 :
                    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:3581:6: otherlv_7= 'comment' ( (lv_comment_8_0= ruleEString ) )
                    {
                    otherlv_7=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleAxiom7170); 

                        	newLeafNode(otherlv_7, grammarAccess.getAxiomAccess().getCommentKeyword_6_0());
                        
                    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:3585:1: ( (lv_comment_8_0= ruleEString ) )
                    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:3586:1: (lv_comment_8_0= ruleEString )
                    {
                    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:3586:1: (lv_comment_8_0= ruleEString )
                    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:3587:3: lv_comment_8_0= ruleEString
                    {
                     
                    	        newCompositeNode(grammarAccess.getAxiomAccess().getCommentEStringParserRuleCall_6_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleAxiom7191);
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

            otherlv_9=(Token)match(input,40,FollowSets000.FOLLOW_40_in_ruleAxiom7205); 

                	newLeafNode(otherlv_9, grammarAccess.getAxiomAccess().getPredicateKeyword_7());
                
            // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:3607:1: ( (lv_predicate_10_0= ruleEString ) )
            // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:3608:1: (lv_predicate_10_0= ruleEString )
            {
            // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:3608:1: (lv_predicate_10_0= ruleEString )
            // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:3609:3: lv_predicate_10_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getAxiomAccess().getPredicateEStringParserRuleCall_8_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleAxiom7226);
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

            // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:3625:2: (otherlv_11= 'annotations' otherlv_12= '{' ( (lv_annotations_13_0= ruleAnnotation ) ) (otherlv_14= ',' ( (lv_annotations_15_0= ruleAnnotation ) ) )* otherlv_16= '}' )?
            int alt114=2;
            int LA114_0 = input.LA(1);

            if ( (LA114_0==21) ) {
                alt114=1;
            }
            switch (alt114) {
                case 1 :
                    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:3625:4: otherlv_11= 'annotations' otherlv_12= '{' ( (lv_annotations_13_0= ruleAnnotation ) ) (otherlv_14= ',' ( (lv_annotations_15_0= ruleAnnotation ) ) )* otherlv_16= '}'
                    {
                    otherlv_11=(Token)match(input,21,FollowSets000.FOLLOW_21_in_ruleAxiom7239); 

                        	newLeafNode(otherlv_11, grammarAccess.getAxiomAccess().getAnnotationsKeyword_9_0());
                        
                    otherlv_12=(Token)match(input,13,FollowSets000.FOLLOW_13_in_ruleAxiom7251); 

                        	newLeafNode(otherlv_12, grammarAccess.getAxiomAccess().getLeftCurlyBracketKeyword_9_1());
                        
                    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:3633:1: ( (lv_annotations_13_0= ruleAnnotation ) )
                    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:3634:1: (lv_annotations_13_0= ruleAnnotation )
                    {
                    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:3634:1: (lv_annotations_13_0= ruleAnnotation )
                    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:3635:3: lv_annotations_13_0= ruleAnnotation
                    {
                     
                    	        newCompositeNode(grammarAccess.getAxiomAccess().getAnnotationsAnnotationParserRuleCall_9_2_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleAnnotation_in_ruleAxiom7272);
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

                    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:3651:2: (otherlv_14= ',' ( (lv_annotations_15_0= ruleAnnotation ) ) )*
                    loop113:
                    do {
                        int alt113=2;
                        int LA113_0 = input.LA(1);

                        if ( (LA113_0==18) ) {
                            alt113=1;
                        }


                        switch (alt113) {
                    	case 1 :
                    	    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:3651:4: otherlv_14= ',' ( (lv_annotations_15_0= ruleAnnotation ) )
                    	    {
                    	    otherlv_14=(Token)match(input,18,FollowSets000.FOLLOW_18_in_ruleAxiom7285); 

                    	        	newLeafNode(otherlv_14, grammarAccess.getAxiomAccess().getCommaKeyword_9_3_0());
                    	        
                    	    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:3655:1: ( (lv_annotations_15_0= ruleAnnotation ) )
                    	    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:3656:1: (lv_annotations_15_0= ruleAnnotation )
                    	    {
                    	    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:3656:1: (lv_annotations_15_0= ruleAnnotation )
                    	    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:3657:3: lv_annotations_15_0= ruleAnnotation
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getAxiomAccess().getAnnotationsAnnotationParserRuleCall_9_3_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleAnnotation_in_ruleAxiom7306);
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
                    	    break loop113;
                        }
                    } while (true);

                    otherlv_16=(Token)match(input,22,FollowSets000.FOLLOW_22_in_ruleAxiom7320); 

                        	newLeafNode(otherlv_16, grammarAccess.getAxiomAccess().getRightCurlyBracketKeyword_9_4());
                        

                    }
                    break;

            }

            // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:3677:3: (otherlv_17= 'extensions' otherlv_18= '{' ( (lv_extensions_19_0= ruleAbstractExtension ) ) (otherlv_20= ',' ( (lv_extensions_21_0= ruleAbstractExtension ) ) )* otherlv_22= '}' )?
            int alt116=2;
            int LA116_0 = input.LA(1);

            if ( (LA116_0==23) ) {
                alt116=1;
            }
            switch (alt116) {
                case 1 :
                    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:3677:5: otherlv_17= 'extensions' otherlv_18= '{' ( (lv_extensions_19_0= ruleAbstractExtension ) ) (otherlv_20= ',' ( (lv_extensions_21_0= ruleAbstractExtension ) ) )* otherlv_22= '}'
                    {
                    otherlv_17=(Token)match(input,23,FollowSets000.FOLLOW_23_in_ruleAxiom7335); 

                        	newLeafNode(otherlv_17, grammarAccess.getAxiomAccess().getExtensionsKeyword_10_0());
                        
                    otherlv_18=(Token)match(input,13,FollowSets000.FOLLOW_13_in_ruleAxiom7347); 

                        	newLeafNode(otherlv_18, grammarAccess.getAxiomAccess().getLeftCurlyBracketKeyword_10_1());
                        
                    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:3685:1: ( (lv_extensions_19_0= ruleAbstractExtension ) )
                    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:3686:1: (lv_extensions_19_0= ruleAbstractExtension )
                    {
                    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:3686:1: (lv_extensions_19_0= ruleAbstractExtension )
                    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:3687:3: lv_extensions_19_0= ruleAbstractExtension
                    {
                     
                    	        newCompositeNode(grammarAccess.getAxiomAccess().getExtensionsAbstractExtensionParserRuleCall_10_2_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleAbstractExtension_in_ruleAxiom7368);
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

                    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:3703:2: (otherlv_20= ',' ( (lv_extensions_21_0= ruleAbstractExtension ) ) )*
                    loop115:
                    do {
                        int alt115=2;
                        int LA115_0 = input.LA(1);

                        if ( (LA115_0==18) ) {
                            alt115=1;
                        }


                        switch (alt115) {
                    	case 1 :
                    	    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:3703:4: otherlv_20= ',' ( (lv_extensions_21_0= ruleAbstractExtension ) )
                    	    {
                    	    otherlv_20=(Token)match(input,18,FollowSets000.FOLLOW_18_in_ruleAxiom7381); 

                    	        	newLeafNode(otherlv_20, grammarAccess.getAxiomAccess().getCommaKeyword_10_3_0());
                    	        
                    	    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:3707:1: ( (lv_extensions_21_0= ruleAbstractExtension ) )
                    	    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:3708:1: (lv_extensions_21_0= ruleAbstractExtension )
                    	    {
                    	    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:3708:1: (lv_extensions_21_0= ruleAbstractExtension )
                    	    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:3709:3: lv_extensions_21_0= ruleAbstractExtension
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getAxiomAccess().getExtensionsAbstractExtensionParserRuleCall_10_3_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleAbstractExtension_in_ruleAxiom7402);
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
                    	    break loop115;
                        }
                    } while (true);

                    otherlv_22=(Token)match(input,22,FollowSets000.FOLLOW_22_in_ruleAxiom7416); 

                        	newLeafNode(otherlv_22, grammarAccess.getAxiomAccess().getRightCurlyBracketKeyword_10_4());
                        

                    }
                    break;

            }

            // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:3729:3: (otherlv_23= 'attributes' otherlv_24= '{' ( (lv_attributes_25_0= ruleStringToAttributeMapEntry ) ) (otherlv_26= ',' ( (lv_attributes_27_0= ruleStringToAttributeMapEntry ) ) )* otherlv_28= '}' )?
            int alt118=2;
            int LA118_0 = input.LA(1);

            if ( (LA118_0==24) ) {
                alt118=1;
            }
            switch (alt118) {
                case 1 :
                    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:3729:5: otherlv_23= 'attributes' otherlv_24= '{' ( (lv_attributes_25_0= ruleStringToAttributeMapEntry ) ) (otherlv_26= ',' ( (lv_attributes_27_0= ruleStringToAttributeMapEntry ) ) )* otherlv_28= '}'
                    {
                    otherlv_23=(Token)match(input,24,FollowSets000.FOLLOW_24_in_ruleAxiom7431); 

                        	newLeafNode(otherlv_23, grammarAccess.getAxiomAccess().getAttributesKeyword_11_0());
                        
                    otherlv_24=(Token)match(input,13,FollowSets000.FOLLOW_13_in_ruleAxiom7443); 

                        	newLeafNode(otherlv_24, grammarAccess.getAxiomAccess().getLeftCurlyBracketKeyword_11_1());
                        
                    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:3737:1: ( (lv_attributes_25_0= ruleStringToAttributeMapEntry ) )
                    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:3738:1: (lv_attributes_25_0= ruleStringToAttributeMapEntry )
                    {
                    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:3738:1: (lv_attributes_25_0= ruleStringToAttributeMapEntry )
                    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:3739:3: lv_attributes_25_0= ruleStringToAttributeMapEntry
                    {
                     
                    	        newCompositeNode(grammarAccess.getAxiomAccess().getAttributesStringToAttributeMapEntryParserRuleCall_11_2_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleStringToAttributeMapEntry_in_ruleAxiom7464);
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

                    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:3755:2: (otherlv_26= ',' ( (lv_attributes_27_0= ruleStringToAttributeMapEntry ) ) )*
                    loop117:
                    do {
                        int alt117=2;
                        int LA117_0 = input.LA(1);

                        if ( (LA117_0==18) ) {
                            alt117=1;
                        }


                        switch (alt117) {
                    	case 1 :
                    	    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:3755:4: otherlv_26= ',' ( (lv_attributes_27_0= ruleStringToAttributeMapEntry ) )
                    	    {
                    	    otherlv_26=(Token)match(input,18,FollowSets000.FOLLOW_18_in_ruleAxiom7477); 

                    	        	newLeafNode(otherlv_26, grammarAccess.getAxiomAccess().getCommaKeyword_11_3_0());
                    	        
                    	    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:3759:1: ( (lv_attributes_27_0= ruleStringToAttributeMapEntry ) )
                    	    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:3760:1: (lv_attributes_27_0= ruleStringToAttributeMapEntry )
                    	    {
                    	    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:3760:1: (lv_attributes_27_0= ruleStringToAttributeMapEntry )
                    	    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:3761:3: lv_attributes_27_0= ruleStringToAttributeMapEntry
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getAxiomAccess().getAttributesStringToAttributeMapEntryParserRuleCall_11_3_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleStringToAttributeMapEntry_in_ruleAxiom7498);
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
                    	    break loop117;
                        }
                    } while (true);

                    otherlv_28=(Token)match(input,22,FollowSets000.FOLLOW_22_in_ruleAxiom7512); 

                        	newLeafNode(otherlv_28, grammarAccess.getAxiomAccess().getRightCurlyBracketKeyword_11_4());
                        

                    }
                    break;

            }

            otherlv_29=(Token)match(input,22,FollowSets000.FOLLOW_22_in_ruleAxiom7526); 

                	newLeafNode(otherlv_29, grammarAccess.getAxiomAccess().getRightCurlyBracketKeyword_12());
                

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
    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:3793:1: entryRuleParameter returns [EObject current=null] : iv_ruleParameter= ruleParameter EOF ;
    public final EObject entryRuleParameter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParameter = null;


        try {
            // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:3794:2: (iv_ruleParameter= ruleParameter EOF )
            // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:3795:2: iv_ruleParameter= ruleParameter EOF
            {
             newCompositeNode(grammarAccess.getParameterRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleParameter_in_entryRuleParameter7562);
            iv_ruleParameter=ruleParameter();

            state._fsp--;

             current =iv_ruleParameter; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleParameter7572); 

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
    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:3802:1: ruleParameter returns [EObject current=null] : ( () ( (lv_localGenerated_1_0= 'localGenerated' ) )? otherlv_2= 'Parameter' ( (lv_name_3_0= ruleEString ) ) otherlv_4= '{' (otherlv_5= 'internalId' ( (lv_internalId_6_0= ruleEString ) ) )? (otherlv_7= 'comment' ( (lv_comment_8_0= ruleEString ) ) )? (otherlv_9= 'annotations' otherlv_10= '{' ( (lv_annotations_11_0= ruleAnnotation ) ) (otherlv_12= ',' ( (lv_annotations_13_0= ruleAnnotation ) ) )* otherlv_14= '}' )? (otherlv_15= 'extensions' otherlv_16= '{' ( (lv_extensions_17_0= ruleAbstractExtension ) ) (otherlv_18= ',' ( (lv_extensions_19_0= ruleAbstractExtension ) ) )* otherlv_20= '}' )? (otherlv_21= 'attributes' otherlv_22= '{' ( (lv_attributes_23_0= ruleStringToAttributeMapEntry ) ) (otherlv_24= ',' ( (lv_attributes_25_0= ruleStringToAttributeMapEntry ) ) )* otherlv_26= '}' )? otherlv_27= '}' ) ;
    public final EObject ruleParameter() throws RecognitionException {
        EObject current = null;

        Token lv_localGenerated_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
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
        Token otherlv_27=null;
        AntlrDatatypeRuleToken lv_name_3_0 = null;

        AntlrDatatypeRuleToken lv_internalId_6_0 = null;

        AntlrDatatypeRuleToken lv_comment_8_0 = null;

        EObject lv_annotations_11_0 = null;

        EObject lv_annotations_13_0 = null;

        EObject lv_extensions_17_0 = null;

        EObject lv_extensions_19_0 = null;

        EObject lv_attributes_23_0 = null;

        EObject lv_attributes_25_0 = null;


         enterRule(); 
            
        try {
            // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:3805:28: ( ( () ( (lv_localGenerated_1_0= 'localGenerated' ) )? otherlv_2= 'Parameter' ( (lv_name_3_0= ruleEString ) ) otherlv_4= '{' (otherlv_5= 'internalId' ( (lv_internalId_6_0= ruleEString ) ) )? (otherlv_7= 'comment' ( (lv_comment_8_0= ruleEString ) ) )? (otherlv_9= 'annotations' otherlv_10= '{' ( (lv_annotations_11_0= ruleAnnotation ) ) (otherlv_12= ',' ( (lv_annotations_13_0= ruleAnnotation ) ) )* otherlv_14= '}' )? (otherlv_15= 'extensions' otherlv_16= '{' ( (lv_extensions_17_0= ruleAbstractExtension ) ) (otherlv_18= ',' ( (lv_extensions_19_0= ruleAbstractExtension ) ) )* otherlv_20= '}' )? (otherlv_21= 'attributes' otherlv_22= '{' ( (lv_attributes_23_0= ruleStringToAttributeMapEntry ) ) (otherlv_24= ',' ( (lv_attributes_25_0= ruleStringToAttributeMapEntry ) ) )* otherlv_26= '}' )? otherlv_27= '}' ) )
            // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:3806:1: ( () ( (lv_localGenerated_1_0= 'localGenerated' ) )? otherlv_2= 'Parameter' ( (lv_name_3_0= ruleEString ) ) otherlv_4= '{' (otherlv_5= 'internalId' ( (lv_internalId_6_0= ruleEString ) ) )? (otherlv_7= 'comment' ( (lv_comment_8_0= ruleEString ) ) )? (otherlv_9= 'annotations' otherlv_10= '{' ( (lv_annotations_11_0= ruleAnnotation ) ) (otherlv_12= ',' ( (lv_annotations_13_0= ruleAnnotation ) ) )* otherlv_14= '}' )? (otherlv_15= 'extensions' otherlv_16= '{' ( (lv_extensions_17_0= ruleAbstractExtension ) ) (otherlv_18= ',' ( (lv_extensions_19_0= ruleAbstractExtension ) ) )* otherlv_20= '}' )? (otherlv_21= 'attributes' otherlv_22= '{' ( (lv_attributes_23_0= ruleStringToAttributeMapEntry ) ) (otherlv_24= ',' ( (lv_attributes_25_0= ruleStringToAttributeMapEntry ) ) )* otherlv_26= '}' )? otherlv_27= '}' )
            {
            // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:3806:1: ( () ( (lv_localGenerated_1_0= 'localGenerated' ) )? otherlv_2= 'Parameter' ( (lv_name_3_0= ruleEString ) ) otherlv_4= '{' (otherlv_5= 'internalId' ( (lv_internalId_6_0= ruleEString ) ) )? (otherlv_7= 'comment' ( (lv_comment_8_0= ruleEString ) ) )? (otherlv_9= 'annotations' otherlv_10= '{' ( (lv_annotations_11_0= ruleAnnotation ) ) (otherlv_12= ',' ( (lv_annotations_13_0= ruleAnnotation ) ) )* otherlv_14= '}' )? (otherlv_15= 'extensions' otherlv_16= '{' ( (lv_extensions_17_0= ruleAbstractExtension ) ) (otherlv_18= ',' ( (lv_extensions_19_0= ruleAbstractExtension ) ) )* otherlv_20= '}' )? (otherlv_21= 'attributes' otherlv_22= '{' ( (lv_attributes_23_0= ruleStringToAttributeMapEntry ) ) (otherlv_24= ',' ( (lv_attributes_25_0= ruleStringToAttributeMapEntry ) ) )* otherlv_26= '}' )? otherlv_27= '}' )
            // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:3806:2: () ( (lv_localGenerated_1_0= 'localGenerated' ) )? otherlv_2= 'Parameter' ( (lv_name_3_0= ruleEString ) ) otherlv_4= '{' (otherlv_5= 'internalId' ( (lv_internalId_6_0= ruleEString ) ) )? (otherlv_7= 'comment' ( (lv_comment_8_0= ruleEString ) ) )? (otherlv_9= 'annotations' otherlv_10= '{' ( (lv_annotations_11_0= ruleAnnotation ) ) (otherlv_12= ',' ( (lv_annotations_13_0= ruleAnnotation ) ) )* otherlv_14= '}' )? (otherlv_15= 'extensions' otherlv_16= '{' ( (lv_extensions_17_0= ruleAbstractExtension ) ) (otherlv_18= ',' ( (lv_extensions_19_0= ruleAbstractExtension ) ) )* otherlv_20= '}' )? (otherlv_21= 'attributes' otherlv_22= '{' ( (lv_attributes_23_0= ruleStringToAttributeMapEntry ) ) (otherlv_24= ',' ( (lv_attributes_25_0= ruleStringToAttributeMapEntry ) ) )* otherlv_26= '}' )? otherlv_27= '}'
            {
            // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:3806:2: ()
            // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:3807:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getParameterAccess().getParameterAction_0(),
                        current);
                

            }

            // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:3812:2: ( (lv_localGenerated_1_0= 'localGenerated' ) )?
            int alt119=2;
            int LA119_0 = input.LA(1);

            if ( (LA119_0==11) ) {
                alt119=1;
            }
            switch (alt119) {
                case 1 :
                    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:3813:1: (lv_localGenerated_1_0= 'localGenerated' )
                    {
                    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:3813:1: (lv_localGenerated_1_0= 'localGenerated' )
                    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:3814:3: lv_localGenerated_1_0= 'localGenerated'
                    {
                    lv_localGenerated_1_0=(Token)match(input,11,FollowSets000.FOLLOW_11_in_ruleParameter7624); 

                            newLeafNode(lv_localGenerated_1_0, grammarAccess.getParameterAccess().getLocalGeneratedLocalGeneratedKeyword_1_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getParameterRule());
                    	        }
                           		setWithLastConsumed(current, "localGenerated", true, "localGenerated");
                    	    

                    }


                    }
                    break;

            }

            otherlv_2=(Token)match(input,60,FollowSets000.FOLLOW_60_in_ruleParameter7650); 

                	newLeafNode(otherlv_2, grammarAccess.getParameterAccess().getParameterKeyword_2());
                
            // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:3831:1: ( (lv_name_3_0= ruleEString ) )
            // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:3832:1: (lv_name_3_0= ruleEString )
            {
            // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:3832:1: (lv_name_3_0= ruleEString )
            // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:3833:3: lv_name_3_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getParameterAccess().getNameEStringParserRuleCall_3_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleParameter7671);
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

            otherlv_4=(Token)match(input,13,FollowSets000.FOLLOW_13_in_ruleParameter7683); 

                	newLeafNode(otherlv_4, grammarAccess.getParameterAccess().getLeftCurlyBracketKeyword_4());
                
            // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:3853:1: (otherlv_5= 'internalId' ( (lv_internalId_6_0= ruleEString ) ) )?
            int alt120=2;
            int LA120_0 = input.LA(1);

            if ( (LA120_0==14) ) {
                alt120=1;
            }
            switch (alt120) {
                case 1 :
                    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:3853:3: otherlv_5= 'internalId' ( (lv_internalId_6_0= ruleEString ) )
                    {
                    otherlv_5=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleParameter7696); 

                        	newLeafNode(otherlv_5, grammarAccess.getParameterAccess().getInternalIdKeyword_5_0());
                        
                    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:3857:1: ( (lv_internalId_6_0= ruleEString ) )
                    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:3858:1: (lv_internalId_6_0= ruleEString )
                    {
                    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:3858:1: (lv_internalId_6_0= ruleEString )
                    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:3859:3: lv_internalId_6_0= ruleEString
                    {
                     
                    	        newCompositeNode(grammarAccess.getParameterAccess().getInternalIdEStringParserRuleCall_5_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleParameter7717);
                    lv_internalId_6_0=ruleEString();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getParameterRule());
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

            // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:3875:4: (otherlv_7= 'comment' ( (lv_comment_8_0= ruleEString ) ) )?
            int alt121=2;
            int LA121_0 = input.LA(1);

            if ( (LA121_0==15) ) {
                alt121=1;
            }
            switch (alt121) {
                case 1 :
                    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:3875:6: otherlv_7= 'comment' ( (lv_comment_8_0= ruleEString ) )
                    {
                    otherlv_7=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleParameter7732); 

                        	newLeafNode(otherlv_7, grammarAccess.getParameterAccess().getCommentKeyword_6_0());
                        
                    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:3879:1: ( (lv_comment_8_0= ruleEString ) )
                    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:3880:1: (lv_comment_8_0= ruleEString )
                    {
                    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:3880:1: (lv_comment_8_0= ruleEString )
                    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:3881:3: lv_comment_8_0= ruleEString
                    {
                     
                    	        newCompositeNode(grammarAccess.getParameterAccess().getCommentEStringParserRuleCall_6_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleParameter7753);
                    lv_comment_8_0=ruleEString();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getParameterRule());
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

            // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:3897:4: (otherlv_9= 'annotations' otherlv_10= '{' ( (lv_annotations_11_0= ruleAnnotation ) ) (otherlv_12= ',' ( (lv_annotations_13_0= ruleAnnotation ) ) )* otherlv_14= '}' )?
            int alt123=2;
            int LA123_0 = input.LA(1);

            if ( (LA123_0==21) ) {
                alt123=1;
            }
            switch (alt123) {
                case 1 :
                    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:3897:6: otherlv_9= 'annotations' otherlv_10= '{' ( (lv_annotations_11_0= ruleAnnotation ) ) (otherlv_12= ',' ( (lv_annotations_13_0= ruleAnnotation ) ) )* otherlv_14= '}'
                    {
                    otherlv_9=(Token)match(input,21,FollowSets000.FOLLOW_21_in_ruleParameter7768); 

                        	newLeafNode(otherlv_9, grammarAccess.getParameterAccess().getAnnotationsKeyword_7_0());
                        
                    otherlv_10=(Token)match(input,13,FollowSets000.FOLLOW_13_in_ruleParameter7780); 

                        	newLeafNode(otherlv_10, grammarAccess.getParameterAccess().getLeftCurlyBracketKeyword_7_1());
                        
                    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:3905:1: ( (lv_annotations_11_0= ruleAnnotation ) )
                    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:3906:1: (lv_annotations_11_0= ruleAnnotation )
                    {
                    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:3906:1: (lv_annotations_11_0= ruleAnnotation )
                    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:3907:3: lv_annotations_11_0= ruleAnnotation
                    {
                     
                    	        newCompositeNode(grammarAccess.getParameterAccess().getAnnotationsAnnotationParserRuleCall_7_2_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleAnnotation_in_ruleParameter7801);
                    lv_annotations_11_0=ruleAnnotation();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getParameterRule());
                    	        }
                           		add(
                           			current, 
                           			"annotations",
                            		lv_annotations_11_0, 
                            		"Annotation");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:3923:2: (otherlv_12= ',' ( (lv_annotations_13_0= ruleAnnotation ) ) )*
                    loop122:
                    do {
                        int alt122=2;
                        int LA122_0 = input.LA(1);

                        if ( (LA122_0==18) ) {
                            alt122=1;
                        }


                        switch (alt122) {
                    	case 1 :
                    	    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:3923:4: otherlv_12= ',' ( (lv_annotations_13_0= ruleAnnotation ) )
                    	    {
                    	    otherlv_12=(Token)match(input,18,FollowSets000.FOLLOW_18_in_ruleParameter7814); 

                    	        	newLeafNode(otherlv_12, grammarAccess.getParameterAccess().getCommaKeyword_7_3_0());
                    	        
                    	    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:3927:1: ( (lv_annotations_13_0= ruleAnnotation ) )
                    	    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:3928:1: (lv_annotations_13_0= ruleAnnotation )
                    	    {
                    	    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:3928:1: (lv_annotations_13_0= ruleAnnotation )
                    	    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:3929:3: lv_annotations_13_0= ruleAnnotation
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getParameterAccess().getAnnotationsAnnotationParserRuleCall_7_3_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleAnnotation_in_ruleParameter7835);
                    	    lv_annotations_13_0=ruleAnnotation();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getParameterRule());
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
                    	    break loop122;
                        }
                    } while (true);

                    otherlv_14=(Token)match(input,22,FollowSets000.FOLLOW_22_in_ruleParameter7849); 

                        	newLeafNode(otherlv_14, grammarAccess.getParameterAccess().getRightCurlyBracketKeyword_7_4());
                        

                    }
                    break;

            }

            // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:3949:3: (otherlv_15= 'extensions' otherlv_16= '{' ( (lv_extensions_17_0= ruleAbstractExtension ) ) (otherlv_18= ',' ( (lv_extensions_19_0= ruleAbstractExtension ) ) )* otherlv_20= '}' )?
            int alt125=2;
            int LA125_0 = input.LA(1);

            if ( (LA125_0==23) ) {
                alt125=1;
            }
            switch (alt125) {
                case 1 :
                    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:3949:5: otherlv_15= 'extensions' otherlv_16= '{' ( (lv_extensions_17_0= ruleAbstractExtension ) ) (otherlv_18= ',' ( (lv_extensions_19_0= ruleAbstractExtension ) ) )* otherlv_20= '}'
                    {
                    otherlv_15=(Token)match(input,23,FollowSets000.FOLLOW_23_in_ruleParameter7864); 

                        	newLeafNode(otherlv_15, grammarAccess.getParameterAccess().getExtensionsKeyword_8_0());
                        
                    otherlv_16=(Token)match(input,13,FollowSets000.FOLLOW_13_in_ruleParameter7876); 

                        	newLeafNode(otherlv_16, grammarAccess.getParameterAccess().getLeftCurlyBracketKeyword_8_1());
                        
                    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:3957:1: ( (lv_extensions_17_0= ruleAbstractExtension ) )
                    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:3958:1: (lv_extensions_17_0= ruleAbstractExtension )
                    {
                    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:3958:1: (lv_extensions_17_0= ruleAbstractExtension )
                    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:3959:3: lv_extensions_17_0= ruleAbstractExtension
                    {
                     
                    	        newCompositeNode(grammarAccess.getParameterAccess().getExtensionsAbstractExtensionParserRuleCall_8_2_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleAbstractExtension_in_ruleParameter7897);
                    lv_extensions_17_0=ruleAbstractExtension();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getParameterRule());
                    	        }
                           		add(
                           			current, 
                           			"extensions",
                            		lv_extensions_17_0, 
                            		"AbstractExtension");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:3975:2: (otherlv_18= ',' ( (lv_extensions_19_0= ruleAbstractExtension ) ) )*
                    loop124:
                    do {
                        int alt124=2;
                        int LA124_0 = input.LA(1);

                        if ( (LA124_0==18) ) {
                            alt124=1;
                        }


                        switch (alt124) {
                    	case 1 :
                    	    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:3975:4: otherlv_18= ',' ( (lv_extensions_19_0= ruleAbstractExtension ) )
                    	    {
                    	    otherlv_18=(Token)match(input,18,FollowSets000.FOLLOW_18_in_ruleParameter7910); 

                    	        	newLeafNode(otherlv_18, grammarAccess.getParameterAccess().getCommaKeyword_8_3_0());
                    	        
                    	    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:3979:1: ( (lv_extensions_19_0= ruleAbstractExtension ) )
                    	    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:3980:1: (lv_extensions_19_0= ruleAbstractExtension )
                    	    {
                    	    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:3980:1: (lv_extensions_19_0= ruleAbstractExtension )
                    	    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:3981:3: lv_extensions_19_0= ruleAbstractExtension
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getParameterAccess().getExtensionsAbstractExtensionParserRuleCall_8_3_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleAbstractExtension_in_ruleParameter7931);
                    	    lv_extensions_19_0=ruleAbstractExtension();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getParameterRule());
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
                    	    break loop124;
                        }
                    } while (true);

                    otherlv_20=(Token)match(input,22,FollowSets000.FOLLOW_22_in_ruleParameter7945); 

                        	newLeafNode(otherlv_20, grammarAccess.getParameterAccess().getRightCurlyBracketKeyword_8_4());
                        

                    }
                    break;

            }

            // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:4001:3: (otherlv_21= 'attributes' otherlv_22= '{' ( (lv_attributes_23_0= ruleStringToAttributeMapEntry ) ) (otherlv_24= ',' ( (lv_attributes_25_0= ruleStringToAttributeMapEntry ) ) )* otherlv_26= '}' )?
            int alt127=2;
            int LA127_0 = input.LA(1);

            if ( (LA127_0==24) ) {
                alt127=1;
            }
            switch (alt127) {
                case 1 :
                    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:4001:5: otherlv_21= 'attributes' otherlv_22= '{' ( (lv_attributes_23_0= ruleStringToAttributeMapEntry ) ) (otherlv_24= ',' ( (lv_attributes_25_0= ruleStringToAttributeMapEntry ) ) )* otherlv_26= '}'
                    {
                    otherlv_21=(Token)match(input,24,FollowSets000.FOLLOW_24_in_ruleParameter7960); 

                        	newLeafNode(otherlv_21, grammarAccess.getParameterAccess().getAttributesKeyword_9_0());
                        
                    otherlv_22=(Token)match(input,13,FollowSets000.FOLLOW_13_in_ruleParameter7972); 

                        	newLeafNode(otherlv_22, grammarAccess.getParameterAccess().getLeftCurlyBracketKeyword_9_1());
                        
                    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:4009:1: ( (lv_attributes_23_0= ruleStringToAttributeMapEntry ) )
                    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:4010:1: (lv_attributes_23_0= ruleStringToAttributeMapEntry )
                    {
                    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:4010:1: (lv_attributes_23_0= ruleStringToAttributeMapEntry )
                    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:4011:3: lv_attributes_23_0= ruleStringToAttributeMapEntry
                    {
                     
                    	        newCompositeNode(grammarAccess.getParameterAccess().getAttributesStringToAttributeMapEntryParserRuleCall_9_2_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleStringToAttributeMapEntry_in_ruleParameter7993);
                    lv_attributes_23_0=ruleStringToAttributeMapEntry();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getParameterRule());
                    	        }
                           		add(
                           			current, 
                           			"attributes",
                            		lv_attributes_23_0, 
                            		"StringToAttributeMapEntry");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:4027:2: (otherlv_24= ',' ( (lv_attributes_25_0= ruleStringToAttributeMapEntry ) ) )*
                    loop126:
                    do {
                        int alt126=2;
                        int LA126_0 = input.LA(1);

                        if ( (LA126_0==18) ) {
                            alt126=1;
                        }


                        switch (alt126) {
                    	case 1 :
                    	    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:4027:4: otherlv_24= ',' ( (lv_attributes_25_0= ruleStringToAttributeMapEntry ) )
                    	    {
                    	    otherlv_24=(Token)match(input,18,FollowSets000.FOLLOW_18_in_ruleParameter8006); 

                    	        	newLeafNode(otherlv_24, grammarAccess.getParameterAccess().getCommaKeyword_9_3_0());
                    	        
                    	    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:4031:1: ( (lv_attributes_25_0= ruleStringToAttributeMapEntry ) )
                    	    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:4032:1: (lv_attributes_25_0= ruleStringToAttributeMapEntry )
                    	    {
                    	    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:4032:1: (lv_attributes_25_0= ruleStringToAttributeMapEntry )
                    	    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:4033:3: lv_attributes_25_0= ruleStringToAttributeMapEntry
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getParameterAccess().getAttributesStringToAttributeMapEntryParserRuleCall_9_3_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleStringToAttributeMapEntry_in_ruleParameter8027);
                    	    lv_attributes_25_0=ruleStringToAttributeMapEntry();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getParameterRule());
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
                    	    break loop126;
                        }
                    } while (true);

                    otherlv_26=(Token)match(input,22,FollowSets000.FOLLOW_22_in_ruleParameter8041); 

                        	newLeafNode(otherlv_26, grammarAccess.getParameterAccess().getRightCurlyBracketKeyword_9_4());
                        

                    }
                    break;

            }

            otherlv_27=(Token)match(input,22,FollowSets000.FOLLOW_22_in_ruleParameter8055); 

                	newLeafNode(otherlv_27, grammarAccess.getParameterAccess().getRightCurlyBracketKeyword_10());
                

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
    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:4065:1: entryRuleGuard returns [EObject current=null] : iv_ruleGuard= ruleGuard EOF ;
    public final EObject entryRuleGuard() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGuard = null;


        try {
            // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:4066:2: (iv_ruleGuard= ruleGuard EOF )
            // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:4067:2: iv_ruleGuard= ruleGuard EOF
            {
             newCompositeNode(grammarAccess.getGuardRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleGuard_in_entryRuleGuard8091);
            iv_ruleGuard=ruleGuard();

            state._fsp--;

             current =iv_ruleGuard; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleGuard8101); 

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
    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:4074:1: ruleGuard returns [EObject current=null] : ( ( (lv_localGenerated_0_0= 'localGenerated' ) )? ( (lv_theorem_1_0= 'theorem' ) ) otherlv_2= 'Guard' ( (lv_name_3_0= ruleEString ) ) otherlv_4= '{' (otherlv_5= 'internalId' ( (lv_internalId_6_0= ruleEString ) ) )? (otherlv_7= 'comment' ( (lv_comment_8_0= ruleEString ) ) )? otherlv_9= 'predicate' ( (lv_predicate_10_0= ruleEString ) ) (otherlv_11= 'annotations' otherlv_12= '{' ( (lv_annotations_13_0= ruleAnnotation ) ) (otherlv_14= ',' ( (lv_annotations_15_0= ruleAnnotation ) ) )* otherlv_16= '}' )? (otherlv_17= 'extensions' otherlv_18= '{' ( (lv_extensions_19_0= ruleAbstractExtension ) ) (otherlv_20= ',' ( (lv_extensions_21_0= ruleAbstractExtension ) ) )* otherlv_22= '}' )? (otherlv_23= 'attributes' otherlv_24= '{' ( (lv_attributes_25_0= ruleStringToAttributeMapEntry ) ) (otherlv_26= ',' ( (lv_attributes_27_0= ruleStringToAttributeMapEntry ) ) )* otherlv_28= '}' )? otherlv_29= '}' ) ;
    public final EObject ruleGuard() throws RecognitionException {
        EObject current = null;

        Token lv_localGenerated_0_0=null;
        Token lv_theorem_1_0=null;
        Token otherlv_2=null;
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
        Token otherlv_29=null;
        AntlrDatatypeRuleToken lv_name_3_0 = null;

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
            // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:4077:28: ( ( ( (lv_localGenerated_0_0= 'localGenerated' ) )? ( (lv_theorem_1_0= 'theorem' ) ) otherlv_2= 'Guard' ( (lv_name_3_0= ruleEString ) ) otherlv_4= '{' (otherlv_5= 'internalId' ( (lv_internalId_6_0= ruleEString ) ) )? (otherlv_7= 'comment' ( (lv_comment_8_0= ruleEString ) ) )? otherlv_9= 'predicate' ( (lv_predicate_10_0= ruleEString ) ) (otherlv_11= 'annotations' otherlv_12= '{' ( (lv_annotations_13_0= ruleAnnotation ) ) (otherlv_14= ',' ( (lv_annotations_15_0= ruleAnnotation ) ) )* otherlv_16= '}' )? (otherlv_17= 'extensions' otherlv_18= '{' ( (lv_extensions_19_0= ruleAbstractExtension ) ) (otherlv_20= ',' ( (lv_extensions_21_0= ruleAbstractExtension ) ) )* otherlv_22= '}' )? (otherlv_23= 'attributes' otherlv_24= '{' ( (lv_attributes_25_0= ruleStringToAttributeMapEntry ) ) (otherlv_26= ',' ( (lv_attributes_27_0= ruleStringToAttributeMapEntry ) ) )* otherlv_28= '}' )? otherlv_29= '}' ) )
            // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:4078:1: ( ( (lv_localGenerated_0_0= 'localGenerated' ) )? ( (lv_theorem_1_0= 'theorem' ) ) otherlv_2= 'Guard' ( (lv_name_3_0= ruleEString ) ) otherlv_4= '{' (otherlv_5= 'internalId' ( (lv_internalId_6_0= ruleEString ) ) )? (otherlv_7= 'comment' ( (lv_comment_8_0= ruleEString ) ) )? otherlv_9= 'predicate' ( (lv_predicate_10_0= ruleEString ) ) (otherlv_11= 'annotations' otherlv_12= '{' ( (lv_annotations_13_0= ruleAnnotation ) ) (otherlv_14= ',' ( (lv_annotations_15_0= ruleAnnotation ) ) )* otherlv_16= '}' )? (otherlv_17= 'extensions' otherlv_18= '{' ( (lv_extensions_19_0= ruleAbstractExtension ) ) (otherlv_20= ',' ( (lv_extensions_21_0= ruleAbstractExtension ) ) )* otherlv_22= '}' )? (otherlv_23= 'attributes' otherlv_24= '{' ( (lv_attributes_25_0= ruleStringToAttributeMapEntry ) ) (otherlv_26= ',' ( (lv_attributes_27_0= ruleStringToAttributeMapEntry ) ) )* otherlv_28= '}' )? otherlv_29= '}' )
            {
            // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:4078:1: ( ( (lv_localGenerated_0_0= 'localGenerated' ) )? ( (lv_theorem_1_0= 'theorem' ) ) otherlv_2= 'Guard' ( (lv_name_3_0= ruleEString ) ) otherlv_4= '{' (otherlv_5= 'internalId' ( (lv_internalId_6_0= ruleEString ) ) )? (otherlv_7= 'comment' ( (lv_comment_8_0= ruleEString ) ) )? otherlv_9= 'predicate' ( (lv_predicate_10_0= ruleEString ) ) (otherlv_11= 'annotations' otherlv_12= '{' ( (lv_annotations_13_0= ruleAnnotation ) ) (otherlv_14= ',' ( (lv_annotations_15_0= ruleAnnotation ) ) )* otherlv_16= '}' )? (otherlv_17= 'extensions' otherlv_18= '{' ( (lv_extensions_19_0= ruleAbstractExtension ) ) (otherlv_20= ',' ( (lv_extensions_21_0= ruleAbstractExtension ) ) )* otherlv_22= '}' )? (otherlv_23= 'attributes' otherlv_24= '{' ( (lv_attributes_25_0= ruleStringToAttributeMapEntry ) ) (otherlv_26= ',' ( (lv_attributes_27_0= ruleStringToAttributeMapEntry ) ) )* otherlv_28= '}' )? otherlv_29= '}' )
            // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:4078:2: ( (lv_localGenerated_0_0= 'localGenerated' ) )? ( (lv_theorem_1_0= 'theorem' ) ) otherlv_2= 'Guard' ( (lv_name_3_0= ruleEString ) ) otherlv_4= '{' (otherlv_5= 'internalId' ( (lv_internalId_6_0= ruleEString ) ) )? (otherlv_7= 'comment' ( (lv_comment_8_0= ruleEString ) ) )? otherlv_9= 'predicate' ( (lv_predicate_10_0= ruleEString ) ) (otherlv_11= 'annotations' otherlv_12= '{' ( (lv_annotations_13_0= ruleAnnotation ) ) (otherlv_14= ',' ( (lv_annotations_15_0= ruleAnnotation ) ) )* otherlv_16= '}' )? (otherlv_17= 'extensions' otherlv_18= '{' ( (lv_extensions_19_0= ruleAbstractExtension ) ) (otherlv_20= ',' ( (lv_extensions_21_0= ruleAbstractExtension ) ) )* otherlv_22= '}' )? (otherlv_23= 'attributes' otherlv_24= '{' ( (lv_attributes_25_0= ruleStringToAttributeMapEntry ) ) (otherlv_26= ',' ( (lv_attributes_27_0= ruleStringToAttributeMapEntry ) ) )* otherlv_28= '}' )? otherlv_29= '}'
            {
            // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:4078:2: ( (lv_localGenerated_0_0= 'localGenerated' ) )?
            int alt128=2;
            int LA128_0 = input.LA(1);

            if ( (LA128_0==11) ) {
                alt128=1;
            }
            switch (alt128) {
                case 1 :
                    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:4079:1: (lv_localGenerated_0_0= 'localGenerated' )
                    {
                    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:4079:1: (lv_localGenerated_0_0= 'localGenerated' )
                    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:4080:3: lv_localGenerated_0_0= 'localGenerated'
                    {
                    lv_localGenerated_0_0=(Token)match(input,11,FollowSets000.FOLLOW_11_in_ruleGuard8144); 

                            newLeafNode(lv_localGenerated_0_0, grammarAccess.getGuardAccess().getLocalGeneratedLocalGeneratedKeyword_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getGuardRule());
                    	        }
                           		setWithLastConsumed(current, "localGenerated", true, "localGenerated");
                    	    

                    }


                    }
                    break;

            }

            // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:4093:3: ( (lv_theorem_1_0= 'theorem' ) )
            // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:4094:1: (lv_theorem_1_0= 'theorem' )
            {
            // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:4094:1: (lv_theorem_1_0= 'theorem' )
            // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:4095:3: lv_theorem_1_0= 'theorem'
            {
            lv_theorem_1_0=(Token)match(input,38,FollowSets000.FOLLOW_38_in_ruleGuard8176); 

                    newLeafNode(lv_theorem_1_0, grammarAccess.getGuardAccess().getTheoremTheoremKeyword_1_0());
                

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getGuardRule());
            	        }
                   		setWithLastConsumed(current, "theorem", true, "theorem");
            	    

            }


            }

            otherlv_2=(Token)match(input,61,FollowSets000.FOLLOW_61_in_ruleGuard8201); 

                	newLeafNode(otherlv_2, grammarAccess.getGuardAccess().getGuardKeyword_2());
                
            // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:4112:1: ( (lv_name_3_0= ruleEString ) )
            // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:4113:1: (lv_name_3_0= ruleEString )
            {
            // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:4113:1: (lv_name_3_0= ruleEString )
            // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:4114:3: lv_name_3_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getGuardAccess().getNameEStringParserRuleCall_3_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleGuard8222);
            lv_name_3_0=ruleEString();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getGuardRule());
            	        }
                   		set(
                   			current, 
                   			"name",
                    		lv_name_3_0, 
                    		"EString");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_4=(Token)match(input,13,FollowSets000.FOLLOW_13_in_ruleGuard8234); 

                	newLeafNode(otherlv_4, grammarAccess.getGuardAccess().getLeftCurlyBracketKeyword_4());
                
            // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:4134:1: (otherlv_5= 'internalId' ( (lv_internalId_6_0= ruleEString ) ) )?
            int alt129=2;
            int LA129_0 = input.LA(1);

            if ( (LA129_0==14) ) {
                alt129=1;
            }
            switch (alt129) {
                case 1 :
                    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:4134:3: otherlv_5= 'internalId' ( (lv_internalId_6_0= ruleEString ) )
                    {
                    otherlv_5=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleGuard8247); 

                        	newLeafNode(otherlv_5, grammarAccess.getGuardAccess().getInternalIdKeyword_5_0());
                        
                    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:4138:1: ( (lv_internalId_6_0= ruleEString ) )
                    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:4139:1: (lv_internalId_6_0= ruleEString )
                    {
                    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:4139:1: (lv_internalId_6_0= ruleEString )
                    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:4140:3: lv_internalId_6_0= ruleEString
                    {
                     
                    	        newCompositeNode(grammarAccess.getGuardAccess().getInternalIdEStringParserRuleCall_5_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleGuard8268);
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

            // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:4156:4: (otherlv_7= 'comment' ( (lv_comment_8_0= ruleEString ) ) )?
            int alt130=2;
            int LA130_0 = input.LA(1);

            if ( (LA130_0==15) ) {
                alt130=1;
            }
            switch (alt130) {
                case 1 :
                    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:4156:6: otherlv_7= 'comment' ( (lv_comment_8_0= ruleEString ) )
                    {
                    otherlv_7=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleGuard8283); 

                        	newLeafNode(otherlv_7, grammarAccess.getGuardAccess().getCommentKeyword_6_0());
                        
                    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:4160:1: ( (lv_comment_8_0= ruleEString ) )
                    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:4161:1: (lv_comment_8_0= ruleEString )
                    {
                    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:4161:1: (lv_comment_8_0= ruleEString )
                    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:4162:3: lv_comment_8_0= ruleEString
                    {
                     
                    	        newCompositeNode(grammarAccess.getGuardAccess().getCommentEStringParserRuleCall_6_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleGuard8304);
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

            otherlv_9=(Token)match(input,40,FollowSets000.FOLLOW_40_in_ruleGuard8318); 

                	newLeafNode(otherlv_9, grammarAccess.getGuardAccess().getPredicateKeyword_7());
                
            // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:4182:1: ( (lv_predicate_10_0= ruleEString ) )
            // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:4183:1: (lv_predicate_10_0= ruleEString )
            {
            // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:4183:1: (lv_predicate_10_0= ruleEString )
            // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:4184:3: lv_predicate_10_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getGuardAccess().getPredicateEStringParserRuleCall_8_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleGuard8339);
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

            // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:4200:2: (otherlv_11= 'annotations' otherlv_12= '{' ( (lv_annotations_13_0= ruleAnnotation ) ) (otherlv_14= ',' ( (lv_annotations_15_0= ruleAnnotation ) ) )* otherlv_16= '}' )?
            int alt132=2;
            int LA132_0 = input.LA(1);

            if ( (LA132_0==21) ) {
                alt132=1;
            }
            switch (alt132) {
                case 1 :
                    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:4200:4: otherlv_11= 'annotations' otherlv_12= '{' ( (lv_annotations_13_0= ruleAnnotation ) ) (otherlv_14= ',' ( (lv_annotations_15_0= ruleAnnotation ) ) )* otherlv_16= '}'
                    {
                    otherlv_11=(Token)match(input,21,FollowSets000.FOLLOW_21_in_ruleGuard8352); 

                        	newLeafNode(otherlv_11, grammarAccess.getGuardAccess().getAnnotationsKeyword_9_0());
                        
                    otherlv_12=(Token)match(input,13,FollowSets000.FOLLOW_13_in_ruleGuard8364); 

                        	newLeafNode(otherlv_12, grammarAccess.getGuardAccess().getLeftCurlyBracketKeyword_9_1());
                        
                    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:4208:1: ( (lv_annotations_13_0= ruleAnnotation ) )
                    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:4209:1: (lv_annotations_13_0= ruleAnnotation )
                    {
                    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:4209:1: (lv_annotations_13_0= ruleAnnotation )
                    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:4210:3: lv_annotations_13_0= ruleAnnotation
                    {
                     
                    	        newCompositeNode(grammarAccess.getGuardAccess().getAnnotationsAnnotationParserRuleCall_9_2_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleAnnotation_in_ruleGuard8385);
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

                    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:4226:2: (otherlv_14= ',' ( (lv_annotations_15_0= ruleAnnotation ) ) )*
                    loop131:
                    do {
                        int alt131=2;
                        int LA131_0 = input.LA(1);

                        if ( (LA131_0==18) ) {
                            alt131=1;
                        }


                        switch (alt131) {
                    	case 1 :
                    	    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:4226:4: otherlv_14= ',' ( (lv_annotations_15_0= ruleAnnotation ) )
                    	    {
                    	    otherlv_14=(Token)match(input,18,FollowSets000.FOLLOW_18_in_ruleGuard8398); 

                    	        	newLeafNode(otherlv_14, grammarAccess.getGuardAccess().getCommaKeyword_9_3_0());
                    	        
                    	    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:4230:1: ( (lv_annotations_15_0= ruleAnnotation ) )
                    	    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:4231:1: (lv_annotations_15_0= ruleAnnotation )
                    	    {
                    	    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:4231:1: (lv_annotations_15_0= ruleAnnotation )
                    	    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:4232:3: lv_annotations_15_0= ruleAnnotation
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getGuardAccess().getAnnotationsAnnotationParserRuleCall_9_3_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleAnnotation_in_ruleGuard8419);
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
                    	    break loop131;
                        }
                    } while (true);

                    otherlv_16=(Token)match(input,22,FollowSets000.FOLLOW_22_in_ruleGuard8433); 

                        	newLeafNode(otherlv_16, grammarAccess.getGuardAccess().getRightCurlyBracketKeyword_9_4());
                        

                    }
                    break;

            }

            // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:4252:3: (otherlv_17= 'extensions' otherlv_18= '{' ( (lv_extensions_19_0= ruleAbstractExtension ) ) (otherlv_20= ',' ( (lv_extensions_21_0= ruleAbstractExtension ) ) )* otherlv_22= '}' )?
            int alt134=2;
            int LA134_0 = input.LA(1);

            if ( (LA134_0==23) ) {
                alt134=1;
            }
            switch (alt134) {
                case 1 :
                    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:4252:5: otherlv_17= 'extensions' otherlv_18= '{' ( (lv_extensions_19_0= ruleAbstractExtension ) ) (otherlv_20= ',' ( (lv_extensions_21_0= ruleAbstractExtension ) ) )* otherlv_22= '}'
                    {
                    otherlv_17=(Token)match(input,23,FollowSets000.FOLLOW_23_in_ruleGuard8448); 

                        	newLeafNode(otherlv_17, grammarAccess.getGuardAccess().getExtensionsKeyword_10_0());
                        
                    otherlv_18=(Token)match(input,13,FollowSets000.FOLLOW_13_in_ruleGuard8460); 

                        	newLeafNode(otherlv_18, grammarAccess.getGuardAccess().getLeftCurlyBracketKeyword_10_1());
                        
                    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:4260:1: ( (lv_extensions_19_0= ruleAbstractExtension ) )
                    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:4261:1: (lv_extensions_19_0= ruleAbstractExtension )
                    {
                    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:4261:1: (lv_extensions_19_0= ruleAbstractExtension )
                    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:4262:3: lv_extensions_19_0= ruleAbstractExtension
                    {
                     
                    	        newCompositeNode(grammarAccess.getGuardAccess().getExtensionsAbstractExtensionParserRuleCall_10_2_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleAbstractExtension_in_ruleGuard8481);
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

                    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:4278:2: (otherlv_20= ',' ( (lv_extensions_21_0= ruleAbstractExtension ) ) )*
                    loop133:
                    do {
                        int alt133=2;
                        int LA133_0 = input.LA(1);

                        if ( (LA133_0==18) ) {
                            alt133=1;
                        }


                        switch (alt133) {
                    	case 1 :
                    	    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:4278:4: otherlv_20= ',' ( (lv_extensions_21_0= ruleAbstractExtension ) )
                    	    {
                    	    otherlv_20=(Token)match(input,18,FollowSets000.FOLLOW_18_in_ruleGuard8494); 

                    	        	newLeafNode(otherlv_20, grammarAccess.getGuardAccess().getCommaKeyword_10_3_0());
                    	        
                    	    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:4282:1: ( (lv_extensions_21_0= ruleAbstractExtension ) )
                    	    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:4283:1: (lv_extensions_21_0= ruleAbstractExtension )
                    	    {
                    	    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:4283:1: (lv_extensions_21_0= ruleAbstractExtension )
                    	    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:4284:3: lv_extensions_21_0= ruleAbstractExtension
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getGuardAccess().getExtensionsAbstractExtensionParserRuleCall_10_3_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleAbstractExtension_in_ruleGuard8515);
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
                    	    break loop133;
                        }
                    } while (true);

                    otherlv_22=(Token)match(input,22,FollowSets000.FOLLOW_22_in_ruleGuard8529); 

                        	newLeafNode(otherlv_22, grammarAccess.getGuardAccess().getRightCurlyBracketKeyword_10_4());
                        

                    }
                    break;

            }

            // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:4304:3: (otherlv_23= 'attributes' otherlv_24= '{' ( (lv_attributes_25_0= ruleStringToAttributeMapEntry ) ) (otherlv_26= ',' ( (lv_attributes_27_0= ruleStringToAttributeMapEntry ) ) )* otherlv_28= '}' )?
            int alt136=2;
            int LA136_0 = input.LA(1);

            if ( (LA136_0==24) ) {
                alt136=1;
            }
            switch (alt136) {
                case 1 :
                    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:4304:5: otherlv_23= 'attributes' otherlv_24= '{' ( (lv_attributes_25_0= ruleStringToAttributeMapEntry ) ) (otherlv_26= ',' ( (lv_attributes_27_0= ruleStringToAttributeMapEntry ) ) )* otherlv_28= '}'
                    {
                    otherlv_23=(Token)match(input,24,FollowSets000.FOLLOW_24_in_ruleGuard8544); 

                        	newLeafNode(otherlv_23, grammarAccess.getGuardAccess().getAttributesKeyword_11_0());
                        
                    otherlv_24=(Token)match(input,13,FollowSets000.FOLLOW_13_in_ruleGuard8556); 

                        	newLeafNode(otherlv_24, grammarAccess.getGuardAccess().getLeftCurlyBracketKeyword_11_1());
                        
                    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:4312:1: ( (lv_attributes_25_0= ruleStringToAttributeMapEntry ) )
                    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:4313:1: (lv_attributes_25_0= ruleStringToAttributeMapEntry )
                    {
                    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:4313:1: (lv_attributes_25_0= ruleStringToAttributeMapEntry )
                    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:4314:3: lv_attributes_25_0= ruleStringToAttributeMapEntry
                    {
                     
                    	        newCompositeNode(grammarAccess.getGuardAccess().getAttributesStringToAttributeMapEntryParserRuleCall_11_2_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleStringToAttributeMapEntry_in_ruleGuard8577);
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

                    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:4330:2: (otherlv_26= ',' ( (lv_attributes_27_0= ruleStringToAttributeMapEntry ) ) )*
                    loop135:
                    do {
                        int alt135=2;
                        int LA135_0 = input.LA(1);

                        if ( (LA135_0==18) ) {
                            alt135=1;
                        }


                        switch (alt135) {
                    	case 1 :
                    	    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:4330:4: otherlv_26= ',' ( (lv_attributes_27_0= ruleStringToAttributeMapEntry ) )
                    	    {
                    	    otherlv_26=(Token)match(input,18,FollowSets000.FOLLOW_18_in_ruleGuard8590); 

                    	        	newLeafNode(otherlv_26, grammarAccess.getGuardAccess().getCommaKeyword_11_3_0());
                    	        
                    	    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:4334:1: ( (lv_attributes_27_0= ruleStringToAttributeMapEntry ) )
                    	    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:4335:1: (lv_attributes_27_0= ruleStringToAttributeMapEntry )
                    	    {
                    	    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:4335:1: (lv_attributes_27_0= ruleStringToAttributeMapEntry )
                    	    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:4336:3: lv_attributes_27_0= ruleStringToAttributeMapEntry
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getGuardAccess().getAttributesStringToAttributeMapEntryParserRuleCall_11_3_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleStringToAttributeMapEntry_in_ruleGuard8611);
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
                    	    break loop135;
                        }
                    } while (true);

                    otherlv_28=(Token)match(input,22,FollowSets000.FOLLOW_22_in_ruleGuard8625); 

                        	newLeafNode(otherlv_28, grammarAccess.getGuardAccess().getRightCurlyBracketKeyword_11_4());
                        

                    }
                    break;

            }

            otherlv_29=(Token)match(input,22,FollowSets000.FOLLOW_22_in_ruleGuard8639); 

                	newLeafNode(otherlv_29, grammarAccess.getGuardAccess().getRightCurlyBracketKeyword_12());
                

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
    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:4368:1: entryRuleWitness returns [EObject current=null] : iv_ruleWitness= ruleWitness EOF ;
    public final EObject entryRuleWitness() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleWitness = null;


        try {
            // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:4369:2: (iv_ruleWitness= ruleWitness EOF )
            // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:4370:2: iv_ruleWitness= ruleWitness EOF
            {
             newCompositeNode(grammarAccess.getWitnessRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleWitness_in_entryRuleWitness8675);
            iv_ruleWitness=ruleWitness();

            state._fsp--;

             current =iv_ruleWitness; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleWitness8685); 

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
    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:4377:1: ruleWitness returns [EObject current=null] : ( ( (lv_localGenerated_0_0= 'localGenerated' ) )? otherlv_1= 'Witness' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'internalId' ( (lv_internalId_5_0= ruleEString ) ) )? (otherlv_6= 'comment' ( (lv_comment_7_0= ruleEString ) ) )? otherlv_8= 'predicate' ( (lv_predicate_9_0= ruleEString ) ) (otherlv_10= 'annotations' otherlv_11= '{' ( (lv_annotations_12_0= ruleAnnotation ) ) (otherlv_13= ',' ( (lv_annotations_14_0= ruleAnnotation ) ) )* otherlv_15= '}' )? (otherlv_16= 'extensions' otherlv_17= '{' ( (lv_extensions_18_0= ruleAbstractExtension ) ) (otherlv_19= ',' ( (lv_extensions_20_0= ruleAbstractExtension ) ) )* otherlv_21= '}' )? (otherlv_22= 'attributes' otherlv_23= '{' ( (lv_attributes_24_0= ruleStringToAttributeMapEntry ) ) (otherlv_25= ',' ( (lv_attributes_26_0= ruleStringToAttributeMapEntry ) ) )* otherlv_27= '}' )? otherlv_28= '}' ) ;
    public final EObject ruleWitness() throws RecognitionException {
        EObject current = null;

        Token lv_localGenerated_0_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        Token otherlv_15=null;
        Token otherlv_16=null;
        Token otherlv_17=null;
        Token otherlv_19=null;
        Token otherlv_21=null;
        Token otherlv_22=null;
        Token otherlv_23=null;
        Token otherlv_25=null;
        Token otherlv_27=null;
        Token otherlv_28=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        AntlrDatatypeRuleToken lv_internalId_5_0 = null;

        AntlrDatatypeRuleToken lv_comment_7_0 = null;

        AntlrDatatypeRuleToken lv_predicate_9_0 = null;

        EObject lv_annotations_12_0 = null;

        EObject lv_annotations_14_0 = null;

        EObject lv_extensions_18_0 = null;

        EObject lv_extensions_20_0 = null;

        EObject lv_attributes_24_0 = null;

        EObject lv_attributes_26_0 = null;


         enterRule(); 
            
        try {
            // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:4380:28: ( ( ( (lv_localGenerated_0_0= 'localGenerated' ) )? otherlv_1= 'Witness' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'internalId' ( (lv_internalId_5_0= ruleEString ) ) )? (otherlv_6= 'comment' ( (lv_comment_7_0= ruleEString ) ) )? otherlv_8= 'predicate' ( (lv_predicate_9_0= ruleEString ) ) (otherlv_10= 'annotations' otherlv_11= '{' ( (lv_annotations_12_0= ruleAnnotation ) ) (otherlv_13= ',' ( (lv_annotations_14_0= ruleAnnotation ) ) )* otherlv_15= '}' )? (otherlv_16= 'extensions' otherlv_17= '{' ( (lv_extensions_18_0= ruleAbstractExtension ) ) (otherlv_19= ',' ( (lv_extensions_20_0= ruleAbstractExtension ) ) )* otherlv_21= '}' )? (otherlv_22= 'attributes' otherlv_23= '{' ( (lv_attributes_24_0= ruleStringToAttributeMapEntry ) ) (otherlv_25= ',' ( (lv_attributes_26_0= ruleStringToAttributeMapEntry ) ) )* otherlv_27= '}' )? otherlv_28= '}' ) )
            // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:4381:1: ( ( (lv_localGenerated_0_0= 'localGenerated' ) )? otherlv_1= 'Witness' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'internalId' ( (lv_internalId_5_0= ruleEString ) ) )? (otherlv_6= 'comment' ( (lv_comment_7_0= ruleEString ) ) )? otherlv_8= 'predicate' ( (lv_predicate_9_0= ruleEString ) ) (otherlv_10= 'annotations' otherlv_11= '{' ( (lv_annotations_12_0= ruleAnnotation ) ) (otherlv_13= ',' ( (lv_annotations_14_0= ruleAnnotation ) ) )* otherlv_15= '}' )? (otherlv_16= 'extensions' otherlv_17= '{' ( (lv_extensions_18_0= ruleAbstractExtension ) ) (otherlv_19= ',' ( (lv_extensions_20_0= ruleAbstractExtension ) ) )* otherlv_21= '}' )? (otherlv_22= 'attributes' otherlv_23= '{' ( (lv_attributes_24_0= ruleStringToAttributeMapEntry ) ) (otherlv_25= ',' ( (lv_attributes_26_0= ruleStringToAttributeMapEntry ) ) )* otherlv_27= '}' )? otherlv_28= '}' )
            {
            // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:4381:1: ( ( (lv_localGenerated_0_0= 'localGenerated' ) )? otherlv_1= 'Witness' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'internalId' ( (lv_internalId_5_0= ruleEString ) ) )? (otherlv_6= 'comment' ( (lv_comment_7_0= ruleEString ) ) )? otherlv_8= 'predicate' ( (lv_predicate_9_0= ruleEString ) ) (otherlv_10= 'annotations' otherlv_11= '{' ( (lv_annotations_12_0= ruleAnnotation ) ) (otherlv_13= ',' ( (lv_annotations_14_0= ruleAnnotation ) ) )* otherlv_15= '}' )? (otherlv_16= 'extensions' otherlv_17= '{' ( (lv_extensions_18_0= ruleAbstractExtension ) ) (otherlv_19= ',' ( (lv_extensions_20_0= ruleAbstractExtension ) ) )* otherlv_21= '}' )? (otherlv_22= 'attributes' otherlv_23= '{' ( (lv_attributes_24_0= ruleStringToAttributeMapEntry ) ) (otherlv_25= ',' ( (lv_attributes_26_0= ruleStringToAttributeMapEntry ) ) )* otherlv_27= '}' )? otherlv_28= '}' )
            // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:4381:2: ( (lv_localGenerated_0_0= 'localGenerated' ) )? otherlv_1= 'Witness' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'internalId' ( (lv_internalId_5_0= ruleEString ) ) )? (otherlv_6= 'comment' ( (lv_comment_7_0= ruleEString ) ) )? otherlv_8= 'predicate' ( (lv_predicate_9_0= ruleEString ) ) (otherlv_10= 'annotations' otherlv_11= '{' ( (lv_annotations_12_0= ruleAnnotation ) ) (otherlv_13= ',' ( (lv_annotations_14_0= ruleAnnotation ) ) )* otherlv_15= '}' )? (otherlv_16= 'extensions' otherlv_17= '{' ( (lv_extensions_18_0= ruleAbstractExtension ) ) (otherlv_19= ',' ( (lv_extensions_20_0= ruleAbstractExtension ) ) )* otherlv_21= '}' )? (otherlv_22= 'attributes' otherlv_23= '{' ( (lv_attributes_24_0= ruleStringToAttributeMapEntry ) ) (otherlv_25= ',' ( (lv_attributes_26_0= ruleStringToAttributeMapEntry ) ) )* otherlv_27= '}' )? otherlv_28= '}'
            {
            // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:4381:2: ( (lv_localGenerated_0_0= 'localGenerated' ) )?
            int alt137=2;
            int LA137_0 = input.LA(1);

            if ( (LA137_0==11) ) {
                alt137=1;
            }
            switch (alt137) {
                case 1 :
                    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:4382:1: (lv_localGenerated_0_0= 'localGenerated' )
                    {
                    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:4382:1: (lv_localGenerated_0_0= 'localGenerated' )
                    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:4383:3: lv_localGenerated_0_0= 'localGenerated'
                    {
                    lv_localGenerated_0_0=(Token)match(input,11,FollowSets000.FOLLOW_11_in_ruleWitness8728); 

                            newLeafNode(lv_localGenerated_0_0, grammarAccess.getWitnessAccess().getLocalGeneratedLocalGeneratedKeyword_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getWitnessRule());
                    	        }
                           		setWithLastConsumed(current, "localGenerated", true, "localGenerated");
                    	    

                    }


                    }
                    break;

            }

            otherlv_1=(Token)match(input,62,FollowSets000.FOLLOW_62_in_ruleWitness8754); 

                	newLeafNode(otherlv_1, grammarAccess.getWitnessAccess().getWitnessKeyword_1());
                
            // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:4400:1: ( (lv_name_2_0= ruleEString ) )
            // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:4401:1: (lv_name_2_0= ruleEString )
            {
            // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:4401:1: (lv_name_2_0= ruleEString )
            // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:4402:3: lv_name_2_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getWitnessAccess().getNameEStringParserRuleCall_2_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleWitness8775);
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

            otherlv_3=(Token)match(input,13,FollowSets000.FOLLOW_13_in_ruleWitness8787); 

                	newLeafNode(otherlv_3, grammarAccess.getWitnessAccess().getLeftCurlyBracketKeyword_3());
                
            // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:4422:1: (otherlv_4= 'internalId' ( (lv_internalId_5_0= ruleEString ) ) )?
            int alt138=2;
            int LA138_0 = input.LA(1);

            if ( (LA138_0==14) ) {
                alt138=1;
            }
            switch (alt138) {
                case 1 :
                    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:4422:3: otherlv_4= 'internalId' ( (lv_internalId_5_0= ruleEString ) )
                    {
                    otherlv_4=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleWitness8800); 

                        	newLeafNode(otherlv_4, grammarAccess.getWitnessAccess().getInternalIdKeyword_4_0());
                        
                    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:4426:1: ( (lv_internalId_5_0= ruleEString ) )
                    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:4427:1: (lv_internalId_5_0= ruleEString )
                    {
                    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:4427:1: (lv_internalId_5_0= ruleEString )
                    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:4428:3: lv_internalId_5_0= ruleEString
                    {
                     
                    	        newCompositeNode(grammarAccess.getWitnessAccess().getInternalIdEStringParserRuleCall_4_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleWitness8821);
                    lv_internalId_5_0=ruleEString();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getWitnessRule());
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

            // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:4444:4: (otherlv_6= 'comment' ( (lv_comment_7_0= ruleEString ) ) )?
            int alt139=2;
            int LA139_0 = input.LA(1);

            if ( (LA139_0==15) ) {
                alt139=1;
            }
            switch (alt139) {
                case 1 :
                    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:4444:6: otherlv_6= 'comment' ( (lv_comment_7_0= ruleEString ) )
                    {
                    otherlv_6=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleWitness8836); 

                        	newLeafNode(otherlv_6, grammarAccess.getWitnessAccess().getCommentKeyword_5_0());
                        
                    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:4448:1: ( (lv_comment_7_0= ruleEString ) )
                    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:4449:1: (lv_comment_7_0= ruleEString )
                    {
                    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:4449:1: (lv_comment_7_0= ruleEString )
                    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:4450:3: lv_comment_7_0= ruleEString
                    {
                     
                    	        newCompositeNode(grammarAccess.getWitnessAccess().getCommentEStringParserRuleCall_5_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleWitness8857);
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

            otherlv_8=(Token)match(input,40,FollowSets000.FOLLOW_40_in_ruleWitness8871); 

                	newLeafNode(otherlv_8, grammarAccess.getWitnessAccess().getPredicateKeyword_6());
                
            // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:4470:1: ( (lv_predicate_9_0= ruleEString ) )
            // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:4471:1: (lv_predicate_9_0= ruleEString )
            {
            // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:4471:1: (lv_predicate_9_0= ruleEString )
            // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:4472:3: lv_predicate_9_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getWitnessAccess().getPredicateEStringParserRuleCall_7_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleWitness8892);
            lv_predicate_9_0=ruleEString();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getWitnessRule());
            	        }
                   		set(
                   			current, 
                   			"predicate",
                    		lv_predicate_9_0, 
                    		"EString");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:4488:2: (otherlv_10= 'annotations' otherlv_11= '{' ( (lv_annotations_12_0= ruleAnnotation ) ) (otherlv_13= ',' ( (lv_annotations_14_0= ruleAnnotation ) ) )* otherlv_15= '}' )?
            int alt141=2;
            int LA141_0 = input.LA(1);

            if ( (LA141_0==21) ) {
                alt141=1;
            }
            switch (alt141) {
                case 1 :
                    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:4488:4: otherlv_10= 'annotations' otherlv_11= '{' ( (lv_annotations_12_0= ruleAnnotation ) ) (otherlv_13= ',' ( (lv_annotations_14_0= ruleAnnotation ) ) )* otherlv_15= '}'
                    {
                    otherlv_10=(Token)match(input,21,FollowSets000.FOLLOW_21_in_ruleWitness8905); 

                        	newLeafNode(otherlv_10, grammarAccess.getWitnessAccess().getAnnotationsKeyword_8_0());
                        
                    otherlv_11=(Token)match(input,13,FollowSets000.FOLLOW_13_in_ruleWitness8917); 

                        	newLeafNode(otherlv_11, grammarAccess.getWitnessAccess().getLeftCurlyBracketKeyword_8_1());
                        
                    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:4496:1: ( (lv_annotations_12_0= ruleAnnotation ) )
                    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:4497:1: (lv_annotations_12_0= ruleAnnotation )
                    {
                    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:4497:1: (lv_annotations_12_0= ruleAnnotation )
                    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:4498:3: lv_annotations_12_0= ruleAnnotation
                    {
                     
                    	        newCompositeNode(grammarAccess.getWitnessAccess().getAnnotationsAnnotationParserRuleCall_8_2_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleAnnotation_in_ruleWitness8938);
                    lv_annotations_12_0=ruleAnnotation();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getWitnessRule());
                    	        }
                           		add(
                           			current, 
                           			"annotations",
                            		lv_annotations_12_0, 
                            		"Annotation");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:4514:2: (otherlv_13= ',' ( (lv_annotations_14_0= ruleAnnotation ) ) )*
                    loop140:
                    do {
                        int alt140=2;
                        int LA140_0 = input.LA(1);

                        if ( (LA140_0==18) ) {
                            alt140=1;
                        }


                        switch (alt140) {
                    	case 1 :
                    	    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:4514:4: otherlv_13= ',' ( (lv_annotations_14_0= ruleAnnotation ) )
                    	    {
                    	    otherlv_13=(Token)match(input,18,FollowSets000.FOLLOW_18_in_ruleWitness8951); 

                    	        	newLeafNode(otherlv_13, grammarAccess.getWitnessAccess().getCommaKeyword_8_3_0());
                    	        
                    	    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:4518:1: ( (lv_annotations_14_0= ruleAnnotation ) )
                    	    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:4519:1: (lv_annotations_14_0= ruleAnnotation )
                    	    {
                    	    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:4519:1: (lv_annotations_14_0= ruleAnnotation )
                    	    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:4520:3: lv_annotations_14_0= ruleAnnotation
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getWitnessAccess().getAnnotationsAnnotationParserRuleCall_8_3_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleAnnotation_in_ruleWitness8972);
                    	    lv_annotations_14_0=ruleAnnotation();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getWitnessRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"annotations",
                    	            		lv_annotations_14_0, 
                    	            		"Annotation");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop140;
                        }
                    } while (true);

                    otherlv_15=(Token)match(input,22,FollowSets000.FOLLOW_22_in_ruleWitness8986); 

                        	newLeafNode(otherlv_15, grammarAccess.getWitnessAccess().getRightCurlyBracketKeyword_8_4());
                        

                    }
                    break;

            }

            // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:4540:3: (otherlv_16= 'extensions' otherlv_17= '{' ( (lv_extensions_18_0= ruleAbstractExtension ) ) (otherlv_19= ',' ( (lv_extensions_20_0= ruleAbstractExtension ) ) )* otherlv_21= '}' )?
            int alt143=2;
            int LA143_0 = input.LA(1);

            if ( (LA143_0==23) ) {
                alt143=1;
            }
            switch (alt143) {
                case 1 :
                    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:4540:5: otherlv_16= 'extensions' otherlv_17= '{' ( (lv_extensions_18_0= ruleAbstractExtension ) ) (otherlv_19= ',' ( (lv_extensions_20_0= ruleAbstractExtension ) ) )* otherlv_21= '}'
                    {
                    otherlv_16=(Token)match(input,23,FollowSets000.FOLLOW_23_in_ruleWitness9001); 

                        	newLeafNode(otherlv_16, grammarAccess.getWitnessAccess().getExtensionsKeyword_9_0());
                        
                    otherlv_17=(Token)match(input,13,FollowSets000.FOLLOW_13_in_ruleWitness9013); 

                        	newLeafNode(otherlv_17, grammarAccess.getWitnessAccess().getLeftCurlyBracketKeyword_9_1());
                        
                    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:4548:1: ( (lv_extensions_18_0= ruleAbstractExtension ) )
                    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:4549:1: (lv_extensions_18_0= ruleAbstractExtension )
                    {
                    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:4549:1: (lv_extensions_18_0= ruleAbstractExtension )
                    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:4550:3: lv_extensions_18_0= ruleAbstractExtension
                    {
                     
                    	        newCompositeNode(grammarAccess.getWitnessAccess().getExtensionsAbstractExtensionParserRuleCall_9_2_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleAbstractExtension_in_ruleWitness9034);
                    lv_extensions_18_0=ruleAbstractExtension();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getWitnessRule());
                    	        }
                           		add(
                           			current, 
                           			"extensions",
                            		lv_extensions_18_0, 
                            		"AbstractExtension");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:4566:2: (otherlv_19= ',' ( (lv_extensions_20_0= ruleAbstractExtension ) ) )*
                    loop142:
                    do {
                        int alt142=2;
                        int LA142_0 = input.LA(1);

                        if ( (LA142_0==18) ) {
                            alt142=1;
                        }


                        switch (alt142) {
                    	case 1 :
                    	    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:4566:4: otherlv_19= ',' ( (lv_extensions_20_0= ruleAbstractExtension ) )
                    	    {
                    	    otherlv_19=(Token)match(input,18,FollowSets000.FOLLOW_18_in_ruleWitness9047); 

                    	        	newLeafNode(otherlv_19, grammarAccess.getWitnessAccess().getCommaKeyword_9_3_0());
                    	        
                    	    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:4570:1: ( (lv_extensions_20_0= ruleAbstractExtension ) )
                    	    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:4571:1: (lv_extensions_20_0= ruleAbstractExtension )
                    	    {
                    	    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:4571:1: (lv_extensions_20_0= ruleAbstractExtension )
                    	    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:4572:3: lv_extensions_20_0= ruleAbstractExtension
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getWitnessAccess().getExtensionsAbstractExtensionParserRuleCall_9_3_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleAbstractExtension_in_ruleWitness9068);
                    	    lv_extensions_20_0=ruleAbstractExtension();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getWitnessRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"extensions",
                    	            		lv_extensions_20_0, 
                    	            		"AbstractExtension");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop142;
                        }
                    } while (true);

                    otherlv_21=(Token)match(input,22,FollowSets000.FOLLOW_22_in_ruleWitness9082); 

                        	newLeafNode(otherlv_21, grammarAccess.getWitnessAccess().getRightCurlyBracketKeyword_9_4());
                        

                    }
                    break;

            }

            // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:4592:3: (otherlv_22= 'attributes' otherlv_23= '{' ( (lv_attributes_24_0= ruleStringToAttributeMapEntry ) ) (otherlv_25= ',' ( (lv_attributes_26_0= ruleStringToAttributeMapEntry ) ) )* otherlv_27= '}' )?
            int alt145=2;
            int LA145_0 = input.LA(1);

            if ( (LA145_0==24) ) {
                alt145=1;
            }
            switch (alt145) {
                case 1 :
                    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:4592:5: otherlv_22= 'attributes' otherlv_23= '{' ( (lv_attributes_24_0= ruleStringToAttributeMapEntry ) ) (otherlv_25= ',' ( (lv_attributes_26_0= ruleStringToAttributeMapEntry ) ) )* otherlv_27= '}'
                    {
                    otherlv_22=(Token)match(input,24,FollowSets000.FOLLOW_24_in_ruleWitness9097); 

                        	newLeafNode(otherlv_22, grammarAccess.getWitnessAccess().getAttributesKeyword_10_0());
                        
                    otherlv_23=(Token)match(input,13,FollowSets000.FOLLOW_13_in_ruleWitness9109); 

                        	newLeafNode(otherlv_23, grammarAccess.getWitnessAccess().getLeftCurlyBracketKeyword_10_1());
                        
                    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:4600:1: ( (lv_attributes_24_0= ruleStringToAttributeMapEntry ) )
                    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:4601:1: (lv_attributes_24_0= ruleStringToAttributeMapEntry )
                    {
                    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:4601:1: (lv_attributes_24_0= ruleStringToAttributeMapEntry )
                    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:4602:3: lv_attributes_24_0= ruleStringToAttributeMapEntry
                    {
                     
                    	        newCompositeNode(grammarAccess.getWitnessAccess().getAttributesStringToAttributeMapEntryParserRuleCall_10_2_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleStringToAttributeMapEntry_in_ruleWitness9130);
                    lv_attributes_24_0=ruleStringToAttributeMapEntry();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getWitnessRule());
                    	        }
                           		add(
                           			current, 
                           			"attributes",
                            		lv_attributes_24_0, 
                            		"StringToAttributeMapEntry");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:4618:2: (otherlv_25= ',' ( (lv_attributes_26_0= ruleStringToAttributeMapEntry ) ) )*
                    loop144:
                    do {
                        int alt144=2;
                        int LA144_0 = input.LA(1);

                        if ( (LA144_0==18) ) {
                            alt144=1;
                        }


                        switch (alt144) {
                    	case 1 :
                    	    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:4618:4: otherlv_25= ',' ( (lv_attributes_26_0= ruleStringToAttributeMapEntry ) )
                    	    {
                    	    otherlv_25=(Token)match(input,18,FollowSets000.FOLLOW_18_in_ruleWitness9143); 

                    	        	newLeafNode(otherlv_25, grammarAccess.getWitnessAccess().getCommaKeyword_10_3_0());
                    	        
                    	    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:4622:1: ( (lv_attributes_26_0= ruleStringToAttributeMapEntry ) )
                    	    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:4623:1: (lv_attributes_26_0= ruleStringToAttributeMapEntry )
                    	    {
                    	    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:4623:1: (lv_attributes_26_0= ruleStringToAttributeMapEntry )
                    	    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:4624:3: lv_attributes_26_0= ruleStringToAttributeMapEntry
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getWitnessAccess().getAttributesStringToAttributeMapEntryParserRuleCall_10_3_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleStringToAttributeMapEntry_in_ruleWitness9164);
                    	    lv_attributes_26_0=ruleStringToAttributeMapEntry();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getWitnessRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"attributes",
                    	            		lv_attributes_26_0, 
                    	            		"StringToAttributeMapEntry");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop144;
                        }
                    } while (true);

                    otherlv_27=(Token)match(input,22,FollowSets000.FOLLOW_22_in_ruleWitness9178); 

                        	newLeafNode(otherlv_27, grammarAccess.getWitnessAccess().getRightCurlyBracketKeyword_10_4());
                        

                    }
                    break;

            }

            otherlv_28=(Token)match(input,22,FollowSets000.FOLLOW_22_in_ruleWitness9192); 

                	newLeafNode(otherlv_28, grammarAccess.getWitnessAccess().getRightCurlyBracketKeyword_11());
                

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
    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:4656:1: entryRuleAction returns [EObject current=null] : iv_ruleAction= ruleAction EOF ;
    public final EObject entryRuleAction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAction = null;


        try {
            // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:4657:2: (iv_ruleAction= ruleAction EOF )
            // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:4658:2: iv_ruleAction= ruleAction EOF
            {
             newCompositeNode(grammarAccess.getActionRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleAction_in_entryRuleAction9228);
            iv_ruleAction=ruleAction();

            state._fsp--;

             current =iv_ruleAction; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleAction9238); 

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
    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:4665:1: ruleAction returns [EObject current=null] : ( ( (lv_localGenerated_0_0= 'localGenerated' ) )? otherlv_1= 'Action' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'internalId' ( (lv_internalId_5_0= ruleEString ) ) )? (otherlv_6= 'comment' ( (lv_comment_7_0= ruleEString ) ) )? otherlv_8= 'action' ( (lv_action_9_0= ruleEString ) ) (otherlv_10= 'annotations' otherlv_11= '{' ( (lv_annotations_12_0= ruleAnnotation ) ) (otherlv_13= ',' ( (lv_annotations_14_0= ruleAnnotation ) ) )* otherlv_15= '}' )? (otherlv_16= 'extensions' otherlv_17= '{' ( (lv_extensions_18_0= ruleAbstractExtension ) ) (otherlv_19= ',' ( (lv_extensions_20_0= ruleAbstractExtension ) ) )* otherlv_21= '}' )? (otherlv_22= 'attributes' otherlv_23= '{' ( (lv_attributes_24_0= ruleStringToAttributeMapEntry ) ) (otherlv_25= ',' ( (lv_attributes_26_0= ruleStringToAttributeMapEntry ) ) )* otherlv_27= '}' )? otherlv_28= '}' ) ;
    public final EObject ruleAction() throws RecognitionException {
        EObject current = null;

        Token lv_localGenerated_0_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        Token otherlv_15=null;
        Token otherlv_16=null;
        Token otherlv_17=null;
        Token otherlv_19=null;
        Token otherlv_21=null;
        Token otherlv_22=null;
        Token otherlv_23=null;
        Token otherlv_25=null;
        Token otherlv_27=null;
        Token otherlv_28=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        AntlrDatatypeRuleToken lv_internalId_5_0 = null;

        AntlrDatatypeRuleToken lv_comment_7_0 = null;

        AntlrDatatypeRuleToken lv_action_9_0 = null;

        EObject lv_annotations_12_0 = null;

        EObject lv_annotations_14_0 = null;

        EObject lv_extensions_18_0 = null;

        EObject lv_extensions_20_0 = null;

        EObject lv_attributes_24_0 = null;

        EObject lv_attributes_26_0 = null;


         enterRule(); 
            
        try {
            // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:4668:28: ( ( ( (lv_localGenerated_0_0= 'localGenerated' ) )? otherlv_1= 'Action' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'internalId' ( (lv_internalId_5_0= ruleEString ) ) )? (otherlv_6= 'comment' ( (lv_comment_7_0= ruleEString ) ) )? otherlv_8= 'action' ( (lv_action_9_0= ruleEString ) ) (otherlv_10= 'annotations' otherlv_11= '{' ( (lv_annotations_12_0= ruleAnnotation ) ) (otherlv_13= ',' ( (lv_annotations_14_0= ruleAnnotation ) ) )* otherlv_15= '}' )? (otherlv_16= 'extensions' otherlv_17= '{' ( (lv_extensions_18_0= ruleAbstractExtension ) ) (otherlv_19= ',' ( (lv_extensions_20_0= ruleAbstractExtension ) ) )* otherlv_21= '}' )? (otherlv_22= 'attributes' otherlv_23= '{' ( (lv_attributes_24_0= ruleStringToAttributeMapEntry ) ) (otherlv_25= ',' ( (lv_attributes_26_0= ruleStringToAttributeMapEntry ) ) )* otherlv_27= '}' )? otherlv_28= '}' ) )
            // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:4669:1: ( ( (lv_localGenerated_0_0= 'localGenerated' ) )? otherlv_1= 'Action' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'internalId' ( (lv_internalId_5_0= ruleEString ) ) )? (otherlv_6= 'comment' ( (lv_comment_7_0= ruleEString ) ) )? otherlv_8= 'action' ( (lv_action_9_0= ruleEString ) ) (otherlv_10= 'annotations' otherlv_11= '{' ( (lv_annotations_12_0= ruleAnnotation ) ) (otherlv_13= ',' ( (lv_annotations_14_0= ruleAnnotation ) ) )* otherlv_15= '}' )? (otherlv_16= 'extensions' otherlv_17= '{' ( (lv_extensions_18_0= ruleAbstractExtension ) ) (otherlv_19= ',' ( (lv_extensions_20_0= ruleAbstractExtension ) ) )* otherlv_21= '}' )? (otherlv_22= 'attributes' otherlv_23= '{' ( (lv_attributes_24_0= ruleStringToAttributeMapEntry ) ) (otherlv_25= ',' ( (lv_attributes_26_0= ruleStringToAttributeMapEntry ) ) )* otherlv_27= '}' )? otherlv_28= '}' )
            {
            // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:4669:1: ( ( (lv_localGenerated_0_0= 'localGenerated' ) )? otherlv_1= 'Action' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'internalId' ( (lv_internalId_5_0= ruleEString ) ) )? (otherlv_6= 'comment' ( (lv_comment_7_0= ruleEString ) ) )? otherlv_8= 'action' ( (lv_action_9_0= ruleEString ) ) (otherlv_10= 'annotations' otherlv_11= '{' ( (lv_annotations_12_0= ruleAnnotation ) ) (otherlv_13= ',' ( (lv_annotations_14_0= ruleAnnotation ) ) )* otherlv_15= '}' )? (otherlv_16= 'extensions' otherlv_17= '{' ( (lv_extensions_18_0= ruleAbstractExtension ) ) (otherlv_19= ',' ( (lv_extensions_20_0= ruleAbstractExtension ) ) )* otherlv_21= '}' )? (otherlv_22= 'attributes' otherlv_23= '{' ( (lv_attributes_24_0= ruleStringToAttributeMapEntry ) ) (otherlv_25= ',' ( (lv_attributes_26_0= ruleStringToAttributeMapEntry ) ) )* otherlv_27= '}' )? otherlv_28= '}' )
            // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:4669:2: ( (lv_localGenerated_0_0= 'localGenerated' ) )? otherlv_1= 'Action' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'internalId' ( (lv_internalId_5_0= ruleEString ) ) )? (otherlv_6= 'comment' ( (lv_comment_7_0= ruleEString ) ) )? otherlv_8= 'action' ( (lv_action_9_0= ruleEString ) ) (otherlv_10= 'annotations' otherlv_11= '{' ( (lv_annotations_12_0= ruleAnnotation ) ) (otherlv_13= ',' ( (lv_annotations_14_0= ruleAnnotation ) ) )* otherlv_15= '}' )? (otherlv_16= 'extensions' otherlv_17= '{' ( (lv_extensions_18_0= ruleAbstractExtension ) ) (otherlv_19= ',' ( (lv_extensions_20_0= ruleAbstractExtension ) ) )* otherlv_21= '}' )? (otherlv_22= 'attributes' otherlv_23= '{' ( (lv_attributes_24_0= ruleStringToAttributeMapEntry ) ) (otherlv_25= ',' ( (lv_attributes_26_0= ruleStringToAttributeMapEntry ) ) )* otherlv_27= '}' )? otherlv_28= '}'
            {
            // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:4669:2: ( (lv_localGenerated_0_0= 'localGenerated' ) )?
            int alt146=2;
            int LA146_0 = input.LA(1);

            if ( (LA146_0==11) ) {
                alt146=1;
            }
            switch (alt146) {
                case 1 :
                    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:4670:1: (lv_localGenerated_0_0= 'localGenerated' )
                    {
                    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:4670:1: (lv_localGenerated_0_0= 'localGenerated' )
                    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:4671:3: lv_localGenerated_0_0= 'localGenerated'
                    {
                    lv_localGenerated_0_0=(Token)match(input,11,FollowSets000.FOLLOW_11_in_ruleAction9281); 

                            newLeafNode(lv_localGenerated_0_0, grammarAccess.getActionAccess().getLocalGeneratedLocalGeneratedKeyword_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getActionRule());
                    	        }
                           		setWithLastConsumed(current, "localGenerated", true, "localGenerated");
                    	    

                    }


                    }
                    break;

            }

            otherlv_1=(Token)match(input,63,FollowSets000.FOLLOW_63_in_ruleAction9307); 

                	newLeafNode(otherlv_1, grammarAccess.getActionAccess().getActionKeyword_1());
                
            // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:4688:1: ( (lv_name_2_0= ruleEString ) )
            // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:4689:1: (lv_name_2_0= ruleEString )
            {
            // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:4689:1: (lv_name_2_0= ruleEString )
            // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:4690:3: lv_name_2_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getActionAccess().getNameEStringParserRuleCall_2_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleAction9328);
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

            otherlv_3=(Token)match(input,13,FollowSets000.FOLLOW_13_in_ruleAction9340); 

                	newLeafNode(otherlv_3, grammarAccess.getActionAccess().getLeftCurlyBracketKeyword_3());
                
            // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:4710:1: (otherlv_4= 'internalId' ( (lv_internalId_5_0= ruleEString ) ) )?
            int alt147=2;
            int LA147_0 = input.LA(1);

            if ( (LA147_0==14) ) {
                alt147=1;
            }
            switch (alt147) {
                case 1 :
                    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:4710:3: otherlv_4= 'internalId' ( (lv_internalId_5_0= ruleEString ) )
                    {
                    otherlv_4=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleAction9353); 

                        	newLeafNode(otherlv_4, grammarAccess.getActionAccess().getInternalIdKeyword_4_0());
                        
                    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:4714:1: ( (lv_internalId_5_0= ruleEString ) )
                    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:4715:1: (lv_internalId_5_0= ruleEString )
                    {
                    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:4715:1: (lv_internalId_5_0= ruleEString )
                    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:4716:3: lv_internalId_5_0= ruleEString
                    {
                     
                    	        newCompositeNode(grammarAccess.getActionAccess().getInternalIdEStringParserRuleCall_4_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleAction9374);
                    lv_internalId_5_0=ruleEString();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getActionRule());
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

            // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:4732:4: (otherlv_6= 'comment' ( (lv_comment_7_0= ruleEString ) ) )?
            int alt148=2;
            int LA148_0 = input.LA(1);

            if ( (LA148_0==15) ) {
                alt148=1;
            }
            switch (alt148) {
                case 1 :
                    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:4732:6: otherlv_6= 'comment' ( (lv_comment_7_0= ruleEString ) )
                    {
                    otherlv_6=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleAction9389); 

                        	newLeafNode(otherlv_6, grammarAccess.getActionAccess().getCommentKeyword_5_0());
                        
                    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:4736:1: ( (lv_comment_7_0= ruleEString ) )
                    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:4737:1: (lv_comment_7_0= ruleEString )
                    {
                    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:4737:1: (lv_comment_7_0= ruleEString )
                    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:4738:3: lv_comment_7_0= ruleEString
                    {
                     
                    	        newCompositeNode(grammarAccess.getActionAccess().getCommentEStringParserRuleCall_5_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleAction9410);
                    lv_comment_7_0=ruleEString();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getActionRule());
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

            otherlv_8=(Token)match(input,64,FollowSets000.FOLLOW_64_in_ruleAction9424); 

                	newLeafNode(otherlv_8, grammarAccess.getActionAccess().getActionKeyword_6());
                
            // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:4758:1: ( (lv_action_9_0= ruleEString ) )
            // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:4759:1: (lv_action_9_0= ruleEString )
            {
            // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:4759:1: (lv_action_9_0= ruleEString )
            // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:4760:3: lv_action_9_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getActionAccess().getActionEStringParserRuleCall_7_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleAction9445);
            lv_action_9_0=ruleEString();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getActionRule());
            	        }
                   		set(
                   			current, 
                   			"action",
                    		lv_action_9_0, 
                    		"EString");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:4776:2: (otherlv_10= 'annotations' otherlv_11= '{' ( (lv_annotations_12_0= ruleAnnotation ) ) (otherlv_13= ',' ( (lv_annotations_14_0= ruleAnnotation ) ) )* otherlv_15= '}' )?
            int alt150=2;
            int LA150_0 = input.LA(1);

            if ( (LA150_0==21) ) {
                alt150=1;
            }
            switch (alt150) {
                case 1 :
                    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:4776:4: otherlv_10= 'annotations' otherlv_11= '{' ( (lv_annotations_12_0= ruleAnnotation ) ) (otherlv_13= ',' ( (lv_annotations_14_0= ruleAnnotation ) ) )* otherlv_15= '}'
                    {
                    otherlv_10=(Token)match(input,21,FollowSets000.FOLLOW_21_in_ruleAction9458); 

                        	newLeafNode(otherlv_10, grammarAccess.getActionAccess().getAnnotationsKeyword_8_0());
                        
                    otherlv_11=(Token)match(input,13,FollowSets000.FOLLOW_13_in_ruleAction9470); 

                        	newLeafNode(otherlv_11, grammarAccess.getActionAccess().getLeftCurlyBracketKeyword_8_1());
                        
                    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:4784:1: ( (lv_annotations_12_0= ruleAnnotation ) )
                    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:4785:1: (lv_annotations_12_0= ruleAnnotation )
                    {
                    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:4785:1: (lv_annotations_12_0= ruleAnnotation )
                    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:4786:3: lv_annotations_12_0= ruleAnnotation
                    {
                     
                    	        newCompositeNode(grammarAccess.getActionAccess().getAnnotationsAnnotationParserRuleCall_8_2_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleAnnotation_in_ruleAction9491);
                    lv_annotations_12_0=ruleAnnotation();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getActionRule());
                    	        }
                           		add(
                           			current, 
                           			"annotations",
                            		lv_annotations_12_0, 
                            		"Annotation");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:4802:2: (otherlv_13= ',' ( (lv_annotations_14_0= ruleAnnotation ) ) )*
                    loop149:
                    do {
                        int alt149=2;
                        int LA149_0 = input.LA(1);

                        if ( (LA149_0==18) ) {
                            alt149=1;
                        }


                        switch (alt149) {
                    	case 1 :
                    	    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:4802:4: otherlv_13= ',' ( (lv_annotations_14_0= ruleAnnotation ) )
                    	    {
                    	    otherlv_13=(Token)match(input,18,FollowSets000.FOLLOW_18_in_ruleAction9504); 

                    	        	newLeafNode(otherlv_13, grammarAccess.getActionAccess().getCommaKeyword_8_3_0());
                    	        
                    	    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:4806:1: ( (lv_annotations_14_0= ruleAnnotation ) )
                    	    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:4807:1: (lv_annotations_14_0= ruleAnnotation )
                    	    {
                    	    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:4807:1: (lv_annotations_14_0= ruleAnnotation )
                    	    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:4808:3: lv_annotations_14_0= ruleAnnotation
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getActionAccess().getAnnotationsAnnotationParserRuleCall_8_3_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleAnnotation_in_ruleAction9525);
                    	    lv_annotations_14_0=ruleAnnotation();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getActionRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"annotations",
                    	            		lv_annotations_14_0, 
                    	            		"Annotation");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop149;
                        }
                    } while (true);

                    otherlv_15=(Token)match(input,22,FollowSets000.FOLLOW_22_in_ruleAction9539); 

                        	newLeafNode(otherlv_15, grammarAccess.getActionAccess().getRightCurlyBracketKeyword_8_4());
                        

                    }
                    break;

            }

            // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:4828:3: (otherlv_16= 'extensions' otherlv_17= '{' ( (lv_extensions_18_0= ruleAbstractExtension ) ) (otherlv_19= ',' ( (lv_extensions_20_0= ruleAbstractExtension ) ) )* otherlv_21= '}' )?
            int alt152=2;
            int LA152_0 = input.LA(1);

            if ( (LA152_0==23) ) {
                alt152=1;
            }
            switch (alt152) {
                case 1 :
                    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:4828:5: otherlv_16= 'extensions' otherlv_17= '{' ( (lv_extensions_18_0= ruleAbstractExtension ) ) (otherlv_19= ',' ( (lv_extensions_20_0= ruleAbstractExtension ) ) )* otherlv_21= '}'
                    {
                    otherlv_16=(Token)match(input,23,FollowSets000.FOLLOW_23_in_ruleAction9554); 

                        	newLeafNode(otherlv_16, grammarAccess.getActionAccess().getExtensionsKeyword_9_0());
                        
                    otherlv_17=(Token)match(input,13,FollowSets000.FOLLOW_13_in_ruleAction9566); 

                        	newLeafNode(otherlv_17, grammarAccess.getActionAccess().getLeftCurlyBracketKeyword_9_1());
                        
                    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:4836:1: ( (lv_extensions_18_0= ruleAbstractExtension ) )
                    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:4837:1: (lv_extensions_18_0= ruleAbstractExtension )
                    {
                    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:4837:1: (lv_extensions_18_0= ruleAbstractExtension )
                    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:4838:3: lv_extensions_18_0= ruleAbstractExtension
                    {
                     
                    	        newCompositeNode(grammarAccess.getActionAccess().getExtensionsAbstractExtensionParserRuleCall_9_2_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleAbstractExtension_in_ruleAction9587);
                    lv_extensions_18_0=ruleAbstractExtension();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getActionRule());
                    	        }
                           		add(
                           			current, 
                           			"extensions",
                            		lv_extensions_18_0, 
                            		"AbstractExtension");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:4854:2: (otherlv_19= ',' ( (lv_extensions_20_0= ruleAbstractExtension ) ) )*
                    loop151:
                    do {
                        int alt151=2;
                        int LA151_0 = input.LA(1);

                        if ( (LA151_0==18) ) {
                            alt151=1;
                        }


                        switch (alt151) {
                    	case 1 :
                    	    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:4854:4: otherlv_19= ',' ( (lv_extensions_20_0= ruleAbstractExtension ) )
                    	    {
                    	    otherlv_19=(Token)match(input,18,FollowSets000.FOLLOW_18_in_ruleAction9600); 

                    	        	newLeafNode(otherlv_19, grammarAccess.getActionAccess().getCommaKeyword_9_3_0());
                    	        
                    	    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:4858:1: ( (lv_extensions_20_0= ruleAbstractExtension ) )
                    	    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:4859:1: (lv_extensions_20_0= ruleAbstractExtension )
                    	    {
                    	    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:4859:1: (lv_extensions_20_0= ruleAbstractExtension )
                    	    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:4860:3: lv_extensions_20_0= ruleAbstractExtension
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getActionAccess().getExtensionsAbstractExtensionParserRuleCall_9_3_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleAbstractExtension_in_ruleAction9621);
                    	    lv_extensions_20_0=ruleAbstractExtension();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getActionRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"extensions",
                    	            		lv_extensions_20_0, 
                    	            		"AbstractExtension");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop151;
                        }
                    } while (true);

                    otherlv_21=(Token)match(input,22,FollowSets000.FOLLOW_22_in_ruleAction9635); 

                        	newLeafNode(otherlv_21, grammarAccess.getActionAccess().getRightCurlyBracketKeyword_9_4());
                        

                    }
                    break;

            }

            // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:4880:3: (otherlv_22= 'attributes' otherlv_23= '{' ( (lv_attributes_24_0= ruleStringToAttributeMapEntry ) ) (otherlv_25= ',' ( (lv_attributes_26_0= ruleStringToAttributeMapEntry ) ) )* otherlv_27= '}' )?
            int alt154=2;
            int LA154_0 = input.LA(1);

            if ( (LA154_0==24) ) {
                alt154=1;
            }
            switch (alt154) {
                case 1 :
                    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:4880:5: otherlv_22= 'attributes' otherlv_23= '{' ( (lv_attributes_24_0= ruleStringToAttributeMapEntry ) ) (otherlv_25= ',' ( (lv_attributes_26_0= ruleStringToAttributeMapEntry ) ) )* otherlv_27= '}'
                    {
                    otherlv_22=(Token)match(input,24,FollowSets000.FOLLOW_24_in_ruleAction9650); 

                        	newLeafNode(otherlv_22, grammarAccess.getActionAccess().getAttributesKeyword_10_0());
                        
                    otherlv_23=(Token)match(input,13,FollowSets000.FOLLOW_13_in_ruleAction9662); 

                        	newLeafNode(otherlv_23, grammarAccess.getActionAccess().getLeftCurlyBracketKeyword_10_1());
                        
                    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:4888:1: ( (lv_attributes_24_0= ruleStringToAttributeMapEntry ) )
                    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:4889:1: (lv_attributes_24_0= ruleStringToAttributeMapEntry )
                    {
                    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:4889:1: (lv_attributes_24_0= ruleStringToAttributeMapEntry )
                    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:4890:3: lv_attributes_24_0= ruleStringToAttributeMapEntry
                    {
                     
                    	        newCompositeNode(grammarAccess.getActionAccess().getAttributesStringToAttributeMapEntryParserRuleCall_10_2_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleStringToAttributeMapEntry_in_ruleAction9683);
                    lv_attributes_24_0=ruleStringToAttributeMapEntry();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getActionRule());
                    	        }
                           		add(
                           			current, 
                           			"attributes",
                            		lv_attributes_24_0, 
                            		"StringToAttributeMapEntry");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:4906:2: (otherlv_25= ',' ( (lv_attributes_26_0= ruleStringToAttributeMapEntry ) ) )*
                    loop153:
                    do {
                        int alt153=2;
                        int LA153_0 = input.LA(1);

                        if ( (LA153_0==18) ) {
                            alt153=1;
                        }


                        switch (alt153) {
                    	case 1 :
                    	    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:4906:4: otherlv_25= ',' ( (lv_attributes_26_0= ruleStringToAttributeMapEntry ) )
                    	    {
                    	    otherlv_25=(Token)match(input,18,FollowSets000.FOLLOW_18_in_ruleAction9696); 

                    	        	newLeafNode(otherlv_25, grammarAccess.getActionAccess().getCommaKeyword_10_3_0());
                    	        
                    	    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:4910:1: ( (lv_attributes_26_0= ruleStringToAttributeMapEntry ) )
                    	    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:4911:1: (lv_attributes_26_0= ruleStringToAttributeMapEntry )
                    	    {
                    	    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:4911:1: (lv_attributes_26_0= ruleStringToAttributeMapEntry )
                    	    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:4912:3: lv_attributes_26_0= ruleStringToAttributeMapEntry
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getActionAccess().getAttributesStringToAttributeMapEntryParserRuleCall_10_3_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleStringToAttributeMapEntry_in_ruleAction9717);
                    	    lv_attributes_26_0=ruleStringToAttributeMapEntry();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getActionRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"attributes",
                    	            		lv_attributes_26_0, 
                    	            		"StringToAttributeMapEntry");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop153;
                        }
                    } while (true);

                    otherlv_27=(Token)match(input,22,FollowSets000.FOLLOW_22_in_ruleAction9731); 

                        	newLeafNode(otherlv_27, grammarAccess.getActionAccess().getRightCurlyBracketKeyword_10_4());
                        

                    }
                    break;

            }

            otherlv_28=(Token)match(input,22,FollowSets000.FOLLOW_22_in_ruleAction9745); 

                	newLeafNode(otherlv_28, grammarAccess.getActionAccess().getRightCurlyBracketKeyword_11());
                

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
    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:4944:1: ruleAttributeType returns [Enumerator current=null] : ( (enumLiteral_0= 'Boolean' ) | (enumLiteral_1= 'Handle' ) | (enumLiteral_2= 'Integer' ) | (enumLiteral_3= 'Long' ) | (enumLiteral_4= 'String' ) ) ;
    public final Enumerator ruleAttributeType() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;
        Token enumLiteral_4=null;

         enterRule(); 
        try {
            // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:4946:28: ( ( (enumLiteral_0= 'Boolean' ) | (enumLiteral_1= 'Handle' ) | (enumLiteral_2= 'Integer' ) | (enumLiteral_3= 'Long' ) | (enumLiteral_4= 'String' ) ) )
            // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:4947:1: ( (enumLiteral_0= 'Boolean' ) | (enumLiteral_1= 'Handle' ) | (enumLiteral_2= 'Integer' ) | (enumLiteral_3= 'Long' ) | (enumLiteral_4= 'String' ) )
            {
            // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:4947:1: ( (enumLiteral_0= 'Boolean' ) | (enumLiteral_1= 'Handle' ) | (enumLiteral_2= 'Integer' ) | (enumLiteral_3= 'Long' ) | (enumLiteral_4= 'String' ) )
            int alt155=5;
            switch ( input.LA(1) ) {
            case 65:
                {
                alt155=1;
                }
                break;
            case 66:
                {
                alt155=2;
                }
                break;
            case 67:
                {
                alt155=3;
                }
                break;
            case 68:
                {
                alt155=4;
                }
                break;
            case 69:
                {
                alt155=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 155, 0, input);

                throw nvae;
            }

            switch (alt155) {
                case 1 :
                    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:4947:2: (enumLiteral_0= 'Boolean' )
                    {
                    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:4947:2: (enumLiteral_0= 'Boolean' )
                    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:4947:4: enumLiteral_0= 'Boolean'
                    {
                    enumLiteral_0=(Token)match(input,65,FollowSets000.FOLLOW_65_in_ruleAttributeType9795); 

                            current = grammarAccess.getAttributeTypeAccess().getBooleanEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_0, grammarAccess.getAttributeTypeAccess().getBooleanEnumLiteralDeclaration_0()); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:4953:6: (enumLiteral_1= 'Handle' )
                    {
                    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:4953:6: (enumLiteral_1= 'Handle' )
                    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:4953:8: enumLiteral_1= 'Handle'
                    {
                    enumLiteral_1=(Token)match(input,66,FollowSets000.FOLLOW_66_in_ruleAttributeType9812); 

                            current = grammarAccess.getAttributeTypeAccess().getHandleEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_1, grammarAccess.getAttributeTypeAccess().getHandleEnumLiteralDeclaration_1()); 
                        

                    }


                    }
                    break;
                case 3 :
                    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:4959:6: (enumLiteral_2= 'Integer' )
                    {
                    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:4959:6: (enumLiteral_2= 'Integer' )
                    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:4959:8: enumLiteral_2= 'Integer'
                    {
                    enumLiteral_2=(Token)match(input,67,FollowSets000.FOLLOW_67_in_ruleAttributeType9829); 

                            current = grammarAccess.getAttributeTypeAccess().getIntegerEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_2, grammarAccess.getAttributeTypeAccess().getIntegerEnumLiteralDeclaration_2()); 
                        

                    }


                    }
                    break;
                case 4 :
                    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:4965:6: (enumLiteral_3= 'Long' )
                    {
                    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:4965:6: (enumLiteral_3= 'Long' )
                    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:4965:8: enumLiteral_3= 'Long'
                    {
                    enumLiteral_3=(Token)match(input,68,FollowSets000.FOLLOW_68_in_ruleAttributeType9846); 

                            current = grammarAccess.getAttributeTypeAccess().getLongEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_3, grammarAccess.getAttributeTypeAccess().getLongEnumLiteralDeclaration_3()); 
                        

                    }


                    }
                    break;
                case 5 :
                    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:4971:6: (enumLiteral_4= 'String' )
                    {
                    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:4971:6: (enumLiteral_4= 'String' )
                    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:4971:8: enumLiteral_4= 'String'
                    {
                    enumLiteral_4=(Token)match(input,69,FollowSets000.FOLLOW_69_in_ruleAttributeType9863); 

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
    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:4981:1: ruleConvergence returns [Enumerator current=null] : ( (enumLiteral_0= 'ordinary' ) | (enumLiteral_1= 'convergent' ) | (enumLiteral_2= 'anticipated' ) ) ;
    public final Enumerator ruleConvergence() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;

         enterRule(); 
        try {
            // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:4983:28: ( ( (enumLiteral_0= 'ordinary' ) | (enumLiteral_1= 'convergent' ) | (enumLiteral_2= 'anticipated' ) ) )
            // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:4984:1: ( (enumLiteral_0= 'ordinary' ) | (enumLiteral_1= 'convergent' ) | (enumLiteral_2= 'anticipated' ) )
            {
            // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:4984:1: ( (enumLiteral_0= 'ordinary' ) | (enumLiteral_1= 'convergent' ) | (enumLiteral_2= 'anticipated' ) )
            int alt156=3;
            switch ( input.LA(1) ) {
            case 70:
                {
                alt156=1;
                }
                break;
            case 71:
                {
                alt156=2;
                }
                break;
            case 72:
                {
                alt156=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 156, 0, input);

                throw nvae;
            }

            switch (alt156) {
                case 1 :
                    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:4984:2: (enumLiteral_0= 'ordinary' )
                    {
                    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:4984:2: (enumLiteral_0= 'ordinary' )
                    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:4984:4: enumLiteral_0= 'ordinary'
                    {
                    enumLiteral_0=(Token)match(input,70,FollowSets000.FOLLOW_70_in_ruleConvergence9908); 

                            current = grammarAccess.getConvergenceAccess().getOrdinaryEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_0, grammarAccess.getConvergenceAccess().getOrdinaryEnumLiteralDeclaration_0()); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:4990:6: (enumLiteral_1= 'convergent' )
                    {
                    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:4990:6: (enumLiteral_1= 'convergent' )
                    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:4990:8: enumLiteral_1= 'convergent'
                    {
                    enumLiteral_1=(Token)match(input,71,FollowSets000.FOLLOW_71_in_ruleConvergence9925); 

                            current = grammarAccess.getConvergenceAccess().getConvergentEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_1, grammarAccess.getConvergenceAccess().getConvergentEnumLiteralDeclaration_1()); 
                        

                    }


                    }
                    break;
                case 3 :
                    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:4996:6: (enumLiteral_2= 'anticipated' )
                    {
                    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:4996:6: (enumLiteral_2= 'anticipated' )
                    // ../ac.soton.xtext.machine.dsl/src-gen/ac/soton/xtext/machine/dsl/parser/antlr/internal/InternalMachineDsl.g:4996:8: enumLiteral_2= 'anticipated'
                    {
                    enumLiteral_2=(Token)match(input,72,FollowSets000.FOLLOW_72_in_ruleConvergence9942); 

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
        public static final BitSet FOLLOW_ruleEString_in_ruleMachine184 = new BitSet(new long[]{0x0000000000002000L});
        public static final BitSet FOLLOW_13_in_ruleMachine196 = new BitSet(new long[]{0x000000001FF1C000L});
        public static final BitSet FOLLOW_14_in_ruleMachine209 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleMachine230 = new BitSet(new long[]{0x000000001FF18000L});
        public static final BitSet FOLLOW_15_in_ruleMachine245 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleMachine266 = new BitSet(new long[]{0x000000001FF10000L});
        public static final BitSet FOLLOW_16_in_ruleMachine281 = new BitSet(new long[]{0x0000000000020000L});
        public static final BitSet FOLLOW_17_in_ruleMachine293 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleMachine316 = new BitSet(new long[]{0x00000000000C0000L});
        public static final BitSet FOLLOW_18_in_ruleMachine329 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleMachine352 = new BitSet(new long[]{0x00000000000C0000L});
        public static final BitSet FOLLOW_19_in_ruleMachine366 = new BitSet(new long[]{0x000000001FF00000L});
        public static final BitSet FOLLOW_20_in_ruleMachine381 = new BitSet(new long[]{0x0000000000020000L});
        public static final BitSet FOLLOW_17_in_ruleMachine393 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleMachine416 = new BitSet(new long[]{0x00000000000C0000L});
        public static final BitSet FOLLOW_18_in_ruleMachine429 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleMachine452 = new BitSet(new long[]{0x00000000000C0000L});
        public static final BitSet FOLLOW_19_in_ruleMachine466 = new BitSet(new long[]{0x000000001FE00000L});
        public static final BitSet FOLLOW_21_in_ruleMachine481 = new BitSet(new long[]{0x0000000000002000L});
        public static final BitSet FOLLOW_13_in_ruleMachine493 = new BitSet(new long[]{0x0000000020000000L});
        public static final BitSet FOLLOW_ruleAnnotation_in_ruleMachine514 = new BitSet(new long[]{0x0000000000440000L});
        public static final BitSet FOLLOW_18_in_ruleMachine527 = new BitSet(new long[]{0x0000000020000000L});
        public static final BitSet FOLLOW_ruleAnnotation_in_ruleMachine548 = new BitSet(new long[]{0x0000000000440000L});
        public static final BitSet FOLLOW_22_in_ruleMachine562 = new BitSet(new long[]{0x000000001FC00000L});
        public static final BitSet FOLLOW_23_in_ruleMachine577 = new BitSet(new long[]{0x0000000000002000L});
        public static final BitSet FOLLOW_13_in_ruleMachine589 = new BitSet(new long[]{0x0010000000000800L});
        public static final BitSet FOLLOW_ruleAbstractExtension_in_ruleMachine610 = new BitSet(new long[]{0x0000000000440000L});
        public static final BitSet FOLLOW_18_in_ruleMachine623 = new BitSet(new long[]{0x0010000000000800L});
        public static final BitSet FOLLOW_ruleAbstractExtension_in_ruleMachine644 = new BitSet(new long[]{0x0000000000440000L});
        public static final BitSet FOLLOW_22_in_ruleMachine658 = new BitSet(new long[]{0x000000001F400000L});
        public static final BitSet FOLLOW_24_in_ruleMachine673 = new BitSet(new long[]{0x0000000000002000L});
        public static final BitSet FOLLOW_13_in_ruleMachine685 = new BitSet(new long[]{0x0000000400000000L});
        public static final BitSet FOLLOW_ruleStringToAttributeMapEntry_in_ruleMachine706 = new BitSet(new long[]{0x0000000000440000L});
        public static final BitSet FOLLOW_18_in_ruleMachine719 = new BitSet(new long[]{0x0000000400000000L});
        public static final BitSet FOLLOW_ruleStringToAttributeMapEntry_in_ruleMachine740 = new BitSet(new long[]{0x0000000000440000L});
        public static final BitSet FOLLOW_22_in_ruleMachine754 = new BitSet(new long[]{0x000000001E400000L});
        public static final BitSet FOLLOW_25_in_ruleMachine769 = new BitSet(new long[]{0x0000000000002000L});
        public static final BitSet FOLLOW_13_in_ruleMachine781 = new BitSet(new long[]{0x0000002000000800L});
        public static final BitSet FOLLOW_ruleVariable_in_ruleMachine802 = new BitSet(new long[]{0x0000000000440000L});
        public static final BitSet FOLLOW_18_in_ruleMachine815 = new BitSet(new long[]{0x0000002000000800L});
        public static final BitSet FOLLOW_ruleVariable_in_ruleMachine836 = new BitSet(new long[]{0x0000000000440000L});
        public static final BitSet FOLLOW_22_in_ruleMachine850 = new BitSet(new long[]{0x000000001C400000L});
        public static final BitSet FOLLOW_26_in_ruleMachine865 = new BitSet(new long[]{0x0000000000002000L});
        public static final BitSet FOLLOW_13_in_ruleMachine877 = new BitSet(new long[]{0x0000004000000800L});
        public static final BitSet FOLLOW_ruleInvariant_in_ruleMachine898 = new BitSet(new long[]{0x0000000000440000L});
        public static final BitSet FOLLOW_18_in_ruleMachine911 = new BitSet(new long[]{0x0000004000000800L});
        public static final BitSet FOLLOW_ruleInvariant_in_ruleMachine932 = new BitSet(new long[]{0x0000000000440000L});
        public static final BitSet FOLLOW_22_in_ruleMachine946 = new BitSet(new long[]{0x0000000018400000L});
        public static final BitSet FOLLOW_27_in_ruleMachine961 = new BitSet(new long[]{0x0000020000000800L});
        public static final BitSet FOLLOW_ruleVariant_in_ruleMachine982 = new BitSet(new long[]{0x0000000010400000L});
        public static final BitSet FOLLOW_28_in_ruleMachine997 = new BitSet(new long[]{0x0000000000002000L});
        public static final BitSet FOLLOW_13_in_ruleMachine1009 = new BitSet(new long[]{0x0000180000000800L});
        public static final BitSet FOLLOW_ruleEvent_in_ruleMachine1030 = new BitSet(new long[]{0x0000000000440000L});
        public static final BitSet FOLLOW_18_in_ruleMachine1043 = new BitSet(new long[]{0x0000180000000800L});
        public static final BitSet FOLLOW_ruleEvent_in_ruleMachine1064 = new BitSet(new long[]{0x0000000000440000L});
        public static final BitSet FOLLOW_22_in_ruleMachine1078 = new BitSet(new long[]{0x0000000000400000L});
        public static final BitSet FOLLOW_22_in_ruleMachine1092 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAbstractExtension_in_entryRuleAbstractExtension1128 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleAbstractExtension1138 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleExtension_in_ruleAbstractExtension1184 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAnnotation_in_entryRuleAnnotation1218 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleAnnotation1228 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_29_in_ruleAnnotation1274 = new BitSet(new long[]{0x0000000000002000L});
        public static final BitSet FOLLOW_13_in_ruleAnnotation1286 = new BitSet(new long[]{0x00000003C0600000L});
        public static final BitSet FOLLOW_30_in_ruleAnnotation1299 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleAnnotation1320 = new BitSet(new long[]{0x0000000380600000L});
        public static final BitSet FOLLOW_31_in_ruleAnnotation1335 = new BitSet(new long[]{0x0000000000020000L});
        public static final BitSet FOLLOW_17_in_ruleAnnotation1347 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleAnnotation1370 = new BitSet(new long[]{0x00000000000C0000L});
        public static final BitSet FOLLOW_18_in_ruleAnnotation1383 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleAnnotation1406 = new BitSet(new long[]{0x00000000000C0000L});
        public static final BitSet FOLLOW_19_in_ruleAnnotation1420 = new BitSet(new long[]{0x0000000300600000L});
        public static final BitSet FOLLOW_21_in_ruleAnnotation1435 = new BitSet(new long[]{0x0000000000002000L});
        public static final BitSet FOLLOW_13_in_ruleAnnotation1447 = new BitSet(new long[]{0x0000000020000000L});
        public static final BitSet FOLLOW_ruleAnnotation_in_ruleAnnotation1468 = new BitSet(new long[]{0x0000000000440000L});
        public static final BitSet FOLLOW_18_in_ruleAnnotation1481 = new BitSet(new long[]{0x0000000020000000L});
        public static final BitSet FOLLOW_ruleAnnotation_in_ruleAnnotation1502 = new BitSet(new long[]{0x0000000000440000L});
        public static final BitSet FOLLOW_22_in_ruleAnnotation1516 = new BitSet(new long[]{0x0000000300400000L});
        public static final BitSet FOLLOW_32_in_ruleAnnotation1531 = new BitSet(new long[]{0x0000000000002000L});
        public static final BitSet FOLLOW_13_in_ruleAnnotation1543 = new BitSet(new long[]{0x0004000000000000L});
        public static final BitSet FOLLOW_ruleStringToStringMapEntry_in_ruleAnnotation1564 = new BitSet(new long[]{0x0000000000440000L});
        public static final BitSet FOLLOW_18_in_ruleAnnotation1577 = new BitSet(new long[]{0x0004000000000000L});
        public static final BitSet FOLLOW_ruleStringToStringMapEntry_in_ruleAnnotation1598 = new BitSet(new long[]{0x0000000000440000L});
        public static final BitSet FOLLOW_22_in_ruleAnnotation1612 = new BitSet(new long[]{0x0000000200400000L});
        public static final BitSet FOLLOW_33_in_ruleAnnotation1627 = new BitSet(new long[]{0x0000000000002000L});
        public static final BitSet FOLLOW_13_in_ruleAnnotation1639 = new BitSet(new long[]{0x0008000000000000L});
        public static final BitSet FOLLOW_ruleEObject_in_ruleAnnotation1660 = new BitSet(new long[]{0x0000000000440000L});
        public static final BitSet FOLLOW_18_in_ruleAnnotation1673 = new BitSet(new long[]{0x0008000000000000L});
        public static final BitSet FOLLOW_ruleEObject_in_ruleAnnotation1694 = new BitSet(new long[]{0x0000000000440000L});
        public static final BitSet FOLLOW_22_in_ruleAnnotation1708 = new BitSet(new long[]{0x0000000000400000L});
        public static final BitSet FOLLOW_22_in_ruleAnnotation1722 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleStringToAttributeMapEntry_in_entryRuleStringToAttributeMapEntry1758 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleStringToAttributeMapEntry1768 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_34_in_ruleStringToAttributeMapEntry1805 = new BitSet(new long[]{0x0000000000002000L});
        public static final BitSet FOLLOW_13_in_ruleStringToAttributeMapEntry1817 = new BitSet(new long[]{0x0000000800000000L});
        public static final BitSet FOLLOW_35_in_ruleStringToAttributeMapEntry1829 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleStringToAttributeMapEntry1850 = new BitSet(new long[]{0x0000001000400000L});
        public static final BitSet FOLLOW_36_in_ruleStringToAttributeMapEntry1863 = new BitSet(new long[]{0x0040000000000000L});
        public static final BitSet FOLLOW_ruleAttribute_in_ruleStringToAttributeMapEntry1884 = new BitSet(new long[]{0x0000000000400000L});
        public static final BitSet FOLLOW_22_in_ruleStringToAttributeMapEntry1898 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_entryRuleEString1937 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleEString1948 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_STRING_in_ruleEString1988 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleEString2014 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleVariable_in_entryRuleVariable2061 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleVariable2071 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_11_in_ruleVariable2123 = new BitSet(new long[]{0x0000002000000000L});
        public static final BitSet FOLLOW_37_in_ruleVariable2149 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleVariable2170 = new BitSet(new long[]{0x0000000000002000L});
        public static final BitSet FOLLOW_13_in_ruleVariable2182 = new BitSet(new long[]{0x0000000001E0C000L});
        public static final BitSet FOLLOW_14_in_ruleVariable2195 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleVariable2216 = new BitSet(new long[]{0x0000000001E08000L});
        public static final BitSet FOLLOW_15_in_ruleVariable2231 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleVariable2252 = new BitSet(new long[]{0x0000000001E00000L});
        public static final BitSet FOLLOW_21_in_ruleVariable2267 = new BitSet(new long[]{0x0000000000002000L});
        public static final BitSet FOLLOW_13_in_ruleVariable2279 = new BitSet(new long[]{0x0000000020000000L});
        public static final BitSet FOLLOW_ruleAnnotation_in_ruleVariable2300 = new BitSet(new long[]{0x0000000000440000L});
        public static final BitSet FOLLOW_18_in_ruleVariable2313 = new BitSet(new long[]{0x0000000020000000L});
        public static final BitSet FOLLOW_ruleAnnotation_in_ruleVariable2334 = new BitSet(new long[]{0x0000000000440000L});
        public static final BitSet FOLLOW_22_in_ruleVariable2348 = new BitSet(new long[]{0x0000000001C00000L});
        public static final BitSet FOLLOW_23_in_ruleVariable2363 = new BitSet(new long[]{0x0000000000002000L});
        public static final BitSet FOLLOW_13_in_ruleVariable2375 = new BitSet(new long[]{0x0010000000000800L});
        public static final BitSet FOLLOW_ruleAbstractExtension_in_ruleVariable2396 = new BitSet(new long[]{0x0000000000440000L});
        public static final BitSet FOLLOW_18_in_ruleVariable2409 = new BitSet(new long[]{0x0010000000000800L});
        public static final BitSet FOLLOW_ruleAbstractExtension_in_ruleVariable2430 = new BitSet(new long[]{0x0000000000440000L});
        public static final BitSet FOLLOW_22_in_ruleVariable2444 = new BitSet(new long[]{0x0000000001400000L});
        public static final BitSet FOLLOW_24_in_ruleVariable2459 = new BitSet(new long[]{0x0000000000002000L});
        public static final BitSet FOLLOW_13_in_ruleVariable2471 = new BitSet(new long[]{0x0000000400000000L});
        public static final BitSet FOLLOW_ruleStringToAttributeMapEntry_in_ruleVariable2492 = new BitSet(new long[]{0x0000000000440000L});
        public static final BitSet FOLLOW_18_in_ruleVariable2505 = new BitSet(new long[]{0x0000000400000000L});
        public static final BitSet FOLLOW_ruleStringToAttributeMapEntry_in_ruleVariable2526 = new BitSet(new long[]{0x0000000000440000L});
        public static final BitSet FOLLOW_22_in_ruleVariable2540 = new BitSet(new long[]{0x0000000000400000L});
        public static final BitSet FOLLOW_22_in_ruleVariable2554 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleInvariant_in_entryRuleInvariant2590 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleInvariant2600 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_11_in_ruleInvariant2643 = new BitSet(new long[]{0x0000004000000000L});
        public static final BitSet FOLLOW_38_in_ruleInvariant2675 = new BitSet(new long[]{0x0000008000000000L});
        public static final BitSet FOLLOW_39_in_ruleInvariant2700 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleInvariant2721 = new BitSet(new long[]{0x0000000000002000L});
        public static final BitSet FOLLOW_13_in_ruleInvariant2733 = new BitSet(new long[]{0x000001000000C000L});
        public static final BitSet FOLLOW_14_in_ruleInvariant2746 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleInvariant2767 = new BitSet(new long[]{0x0000010000008000L});
        public static final BitSet FOLLOW_15_in_ruleInvariant2782 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleInvariant2803 = new BitSet(new long[]{0x0000010000000000L});
        public static final BitSet FOLLOW_40_in_ruleInvariant2817 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleInvariant2838 = new BitSet(new long[]{0x0000000001E00000L});
        public static final BitSet FOLLOW_21_in_ruleInvariant2851 = new BitSet(new long[]{0x0000000000002000L});
        public static final BitSet FOLLOW_13_in_ruleInvariant2863 = new BitSet(new long[]{0x0000000020000000L});
        public static final BitSet FOLLOW_ruleAnnotation_in_ruleInvariant2884 = new BitSet(new long[]{0x0000000000440000L});
        public static final BitSet FOLLOW_18_in_ruleInvariant2897 = new BitSet(new long[]{0x0000000020000000L});
        public static final BitSet FOLLOW_ruleAnnotation_in_ruleInvariant2918 = new BitSet(new long[]{0x0000000000440000L});
        public static final BitSet FOLLOW_22_in_ruleInvariant2932 = new BitSet(new long[]{0x0000000001C00000L});
        public static final BitSet FOLLOW_23_in_ruleInvariant2947 = new BitSet(new long[]{0x0000000000002000L});
        public static final BitSet FOLLOW_13_in_ruleInvariant2959 = new BitSet(new long[]{0x0010000000000800L});
        public static final BitSet FOLLOW_ruleAbstractExtension_in_ruleInvariant2980 = new BitSet(new long[]{0x0000000000440000L});
        public static final BitSet FOLLOW_18_in_ruleInvariant2993 = new BitSet(new long[]{0x0010000000000800L});
        public static final BitSet FOLLOW_ruleAbstractExtension_in_ruleInvariant3014 = new BitSet(new long[]{0x0000000000440000L});
        public static final BitSet FOLLOW_22_in_ruleInvariant3028 = new BitSet(new long[]{0x0000000001400000L});
        public static final BitSet FOLLOW_24_in_ruleInvariant3043 = new BitSet(new long[]{0x0000000000002000L});
        public static final BitSet FOLLOW_13_in_ruleInvariant3055 = new BitSet(new long[]{0x0000000400000000L});
        public static final BitSet FOLLOW_ruleStringToAttributeMapEntry_in_ruleInvariant3076 = new BitSet(new long[]{0x0000000000440000L});
        public static final BitSet FOLLOW_18_in_ruleInvariant3089 = new BitSet(new long[]{0x0000000400000000L});
        public static final BitSet FOLLOW_ruleStringToAttributeMapEntry_in_ruleInvariant3110 = new BitSet(new long[]{0x0000000000440000L});
        public static final BitSet FOLLOW_22_in_ruleInvariant3124 = new BitSet(new long[]{0x0000000000400000L});
        public static final BitSet FOLLOW_22_in_ruleInvariant3138 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleVariant_in_entryRuleVariant3174 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleVariant3184 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_11_in_ruleVariant3227 = new BitSet(new long[]{0x0000020000000000L});
        public static final BitSet FOLLOW_41_in_ruleVariant3253 = new BitSet(new long[]{0x0000000000002000L});
        public static final BitSet FOLLOW_13_in_ruleVariant3265 = new BitSet(new long[]{0x000004000000C000L});
        public static final BitSet FOLLOW_14_in_ruleVariant3278 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleVariant3299 = new BitSet(new long[]{0x0000040000008000L});
        public static final BitSet FOLLOW_15_in_ruleVariant3314 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleVariant3335 = new BitSet(new long[]{0x0000040000000000L});
        public static final BitSet FOLLOW_42_in_ruleVariant3349 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleVariant3370 = new BitSet(new long[]{0x0000000001E00000L});
        public static final BitSet FOLLOW_21_in_ruleVariant3383 = new BitSet(new long[]{0x0000000000002000L});
        public static final BitSet FOLLOW_13_in_ruleVariant3395 = new BitSet(new long[]{0x0000000020000000L});
        public static final BitSet FOLLOW_ruleAnnotation_in_ruleVariant3416 = new BitSet(new long[]{0x0000000000440000L});
        public static final BitSet FOLLOW_18_in_ruleVariant3429 = new BitSet(new long[]{0x0000000020000000L});
        public static final BitSet FOLLOW_ruleAnnotation_in_ruleVariant3450 = new BitSet(new long[]{0x0000000000440000L});
        public static final BitSet FOLLOW_22_in_ruleVariant3464 = new BitSet(new long[]{0x0000000001C00000L});
        public static final BitSet FOLLOW_23_in_ruleVariant3479 = new BitSet(new long[]{0x0000000000002000L});
        public static final BitSet FOLLOW_13_in_ruleVariant3491 = new BitSet(new long[]{0x0010000000000800L});
        public static final BitSet FOLLOW_ruleAbstractExtension_in_ruleVariant3512 = new BitSet(new long[]{0x0000000000440000L});
        public static final BitSet FOLLOW_18_in_ruleVariant3525 = new BitSet(new long[]{0x0010000000000800L});
        public static final BitSet FOLLOW_ruleAbstractExtension_in_ruleVariant3546 = new BitSet(new long[]{0x0000000000440000L});
        public static final BitSet FOLLOW_22_in_ruleVariant3560 = new BitSet(new long[]{0x0000000001400000L});
        public static final BitSet FOLLOW_24_in_ruleVariant3575 = new BitSet(new long[]{0x0000000000002000L});
        public static final BitSet FOLLOW_13_in_ruleVariant3587 = new BitSet(new long[]{0x0000000400000000L});
        public static final BitSet FOLLOW_ruleStringToAttributeMapEntry_in_ruleVariant3608 = new BitSet(new long[]{0x0000000000440000L});
        public static final BitSet FOLLOW_18_in_ruleVariant3621 = new BitSet(new long[]{0x0000000400000000L});
        public static final BitSet FOLLOW_ruleStringToAttributeMapEntry_in_ruleVariant3642 = new BitSet(new long[]{0x0000000000440000L});
        public static final BitSet FOLLOW_22_in_ruleVariant3656 = new BitSet(new long[]{0x0000000000400000L});
        public static final BitSet FOLLOW_22_in_ruleVariant3670 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEvent_in_entryRuleEvent3706 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleEvent3716 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_11_in_ruleEvent3768 = new BitSet(new long[]{0x0000180000000000L});
        public static final BitSet FOLLOW_43_in_ruleEvent3800 = new BitSet(new long[]{0x0000100000000000L});
        public static final BitSet FOLLOW_44_in_ruleEvent3826 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleEvent3847 = new BitSet(new long[]{0x0000000000002000L});
        public static final BitSet FOLLOW_13_in_ruleEvent3859 = new BitSet(new long[]{0x0003E00001E1C000L});
        public static final BitSet FOLLOW_14_in_ruleEvent3872 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleEvent3893 = new BitSet(new long[]{0x0003E00001E18000L});
        public static final BitSet FOLLOW_15_in_ruleEvent3908 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleEvent3929 = new BitSet(new long[]{0x0003E00001E10000L});
        public static final BitSet FOLLOW_45_in_ruleEvent3944 = new BitSet(new long[]{0x0000000000000000L,0x00000000000001C0L});
        public static final BitSet FOLLOW_ruleConvergence_in_ruleEvent3965 = new BitSet(new long[]{0x0003C00001E10000L});
        public static final BitSet FOLLOW_16_in_ruleEvent3980 = new BitSet(new long[]{0x0000000000020000L});
        public static final BitSet FOLLOW_17_in_ruleEvent3992 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleEvent4015 = new BitSet(new long[]{0x00000000000C0000L});
        public static final BitSet FOLLOW_18_in_ruleEvent4028 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleEvent4051 = new BitSet(new long[]{0x00000000000C0000L});
        public static final BitSet FOLLOW_19_in_ruleEvent4065 = new BitSet(new long[]{0x0003C00001E00000L});
        public static final BitSet FOLLOW_21_in_ruleEvent4080 = new BitSet(new long[]{0x0000000000002000L});
        public static final BitSet FOLLOW_13_in_ruleEvent4092 = new BitSet(new long[]{0x0000000020000000L});
        public static final BitSet FOLLOW_ruleAnnotation_in_ruleEvent4113 = new BitSet(new long[]{0x0000000000440000L});
        public static final BitSet FOLLOW_18_in_ruleEvent4126 = new BitSet(new long[]{0x0000000020000000L});
        public static final BitSet FOLLOW_ruleAnnotation_in_ruleEvent4147 = new BitSet(new long[]{0x0000000000440000L});
        public static final BitSet FOLLOW_22_in_ruleEvent4161 = new BitSet(new long[]{0x0003C00001C00000L});
        public static final BitSet FOLLOW_23_in_ruleEvent4176 = new BitSet(new long[]{0x0000000000002000L});
        public static final BitSet FOLLOW_13_in_ruleEvent4188 = new BitSet(new long[]{0x0010000000000800L});
        public static final BitSet FOLLOW_ruleAbstractExtension_in_ruleEvent4209 = new BitSet(new long[]{0x0000000000440000L});
        public static final BitSet FOLLOW_18_in_ruleEvent4222 = new BitSet(new long[]{0x0010000000000800L});
        public static final BitSet FOLLOW_ruleAbstractExtension_in_ruleEvent4243 = new BitSet(new long[]{0x0000000000440000L});
        public static final BitSet FOLLOW_22_in_ruleEvent4257 = new BitSet(new long[]{0x0003C00001400000L});
        public static final BitSet FOLLOW_24_in_ruleEvent4272 = new BitSet(new long[]{0x0000000000002000L});
        public static final BitSet FOLLOW_13_in_ruleEvent4284 = new BitSet(new long[]{0x0000000400000000L});
        public static final BitSet FOLLOW_ruleStringToAttributeMapEntry_in_ruleEvent4305 = new BitSet(new long[]{0x0000000000440000L});
        public static final BitSet FOLLOW_18_in_ruleEvent4318 = new BitSet(new long[]{0x0000000400000000L});
        public static final BitSet FOLLOW_ruleStringToAttributeMapEntry_in_ruleEvent4339 = new BitSet(new long[]{0x0000000000440000L});
        public static final BitSet FOLLOW_22_in_ruleEvent4353 = new BitSet(new long[]{0x0003C00000400000L});
        public static final BitSet FOLLOW_46_in_ruleEvent4368 = new BitSet(new long[]{0x0000000000002000L});
        public static final BitSet FOLLOW_13_in_ruleEvent4380 = new BitSet(new long[]{0x1000000000000800L});
        public static final BitSet FOLLOW_ruleParameter_in_ruleEvent4401 = new BitSet(new long[]{0x0000000000440000L});
        public static final BitSet FOLLOW_18_in_ruleEvent4414 = new BitSet(new long[]{0x1000000000000800L});
        public static final BitSet FOLLOW_ruleParameter_in_ruleEvent4435 = new BitSet(new long[]{0x0000000000440000L});
        public static final BitSet FOLLOW_22_in_ruleEvent4449 = new BitSet(new long[]{0x0003800000400000L});
        public static final BitSet FOLLOW_47_in_ruleEvent4464 = new BitSet(new long[]{0x0000000000002000L});
        public static final BitSet FOLLOW_13_in_ruleEvent4476 = new BitSet(new long[]{0x0000004000000800L});
        public static final BitSet FOLLOW_ruleGuard_in_ruleEvent4497 = new BitSet(new long[]{0x0000000000440000L});
        public static final BitSet FOLLOW_18_in_ruleEvent4510 = new BitSet(new long[]{0x0000004000000800L});
        public static final BitSet FOLLOW_ruleGuard_in_ruleEvent4531 = new BitSet(new long[]{0x0000000000440000L});
        public static final BitSet FOLLOW_22_in_ruleEvent4545 = new BitSet(new long[]{0x0003000000400000L});
        public static final BitSet FOLLOW_48_in_ruleEvent4560 = new BitSet(new long[]{0x0000000000002000L});
        public static final BitSet FOLLOW_13_in_ruleEvent4572 = new BitSet(new long[]{0x4000000000000800L});
        public static final BitSet FOLLOW_ruleWitness_in_ruleEvent4593 = new BitSet(new long[]{0x0000000000440000L});
        public static final BitSet FOLLOW_18_in_ruleEvent4606 = new BitSet(new long[]{0x4000000000000800L});
        public static final BitSet FOLLOW_ruleWitness_in_ruleEvent4627 = new BitSet(new long[]{0x0000000000440000L});
        public static final BitSet FOLLOW_22_in_ruleEvent4641 = new BitSet(new long[]{0x0002000000400000L});
        public static final BitSet FOLLOW_49_in_ruleEvent4656 = new BitSet(new long[]{0x0000000000002000L});
        public static final BitSet FOLLOW_13_in_ruleEvent4668 = new BitSet(new long[]{0x8000000000000800L});
        public static final BitSet FOLLOW_ruleAction_in_ruleEvent4689 = new BitSet(new long[]{0x0000000000440000L});
        public static final BitSet FOLLOW_18_in_ruleEvent4702 = new BitSet(new long[]{0x8000000000000800L});
        public static final BitSet FOLLOW_ruleAction_in_ruleEvent4723 = new BitSet(new long[]{0x0000000000440000L});
        public static final BitSet FOLLOW_22_in_ruleEvent4737 = new BitSet(new long[]{0x0000000000400000L});
        public static final BitSet FOLLOW_22_in_ruleEvent4751 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleStringToStringMapEntry_in_entryRuleStringToStringMapEntry4787 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleStringToStringMapEntry4797 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_50_in_ruleStringToStringMapEntry4843 = new BitSet(new long[]{0x0000000000002000L});
        public static final BitSet FOLLOW_13_in_ruleStringToStringMapEntry4855 = new BitSet(new long[]{0x0000001800400000L});
        public static final BitSet FOLLOW_35_in_ruleStringToStringMapEntry4868 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleStringToStringMapEntry4889 = new BitSet(new long[]{0x0000001000400000L});
        public static final BitSet FOLLOW_36_in_ruleStringToStringMapEntry4904 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleStringToStringMapEntry4925 = new BitSet(new long[]{0x0000000000400000L});
        public static final BitSet FOLLOW_22_in_ruleStringToStringMapEntry4939 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEObject_in_entryRuleEObject4975 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleEObject4985 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_51_in_ruleEObject5031 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleExtension_in_entryRuleExtension5067 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleExtension5077 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_11_in_ruleExtension5120 = new BitSet(new long[]{0x0010000000000000L});
        public static final BitSet FOLLOW_52_in_ruleExtension5146 = new BitSet(new long[]{0x0000000000002000L});
        public static final BitSet FOLLOW_13_in_ruleExtension5158 = new BitSet(new long[]{0x0020000000004000L});
        public static final BitSet FOLLOW_14_in_ruleExtension5171 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleExtension5192 = new BitSet(new long[]{0x0020000000000000L});
        public static final BitSet FOLLOW_53_in_ruleExtension5206 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleExtension5227 = new BitSet(new long[]{0x0000000001E00000L});
        public static final BitSet FOLLOW_21_in_ruleExtension5240 = new BitSet(new long[]{0x0000000000002000L});
        public static final BitSet FOLLOW_13_in_ruleExtension5252 = new BitSet(new long[]{0x0000000020000000L});
        public static final BitSet FOLLOW_ruleAnnotation_in_ruleExtension5273 = new BitSet(new long[]{0x0000000000440000L});
        public static final BitSet FOLLOW_18_in_ruleExtension5286 = new BitSet(new long[]{0x0000000020000000L});
        public static final BitSet FOLLOW_ruleAnnotation_in_ruleExtension5307 = new BitSet(new long[]{0x0000000000440000L});
        public static final BitSet FOLLOW_22_in_ruleExtension5321 = new BitSet(new long[]{0x0000000001C00000L});
        public static final BitSet FOLLOW_23_in_ruleExtension5336 = new BitSet(new long[]{0x0000000000002000L});
        public static final BitSet FOLLOW_13_in_ruleExtension5348 = new BitSet(new long[]{0x0010000000000800L});
        public static final BitSet FOLLOW_ruleAbstractExtension_in_ruleExtension5369 = new BitSet(new long[]{0x0000000000440000L});
        public static final BitSet FOLLOW_18_in_ruleExtension5382 = new BitSet(new long[]{0x0010000000000800L});
        public static final BitSet FOLLOW_ruleAbstractExtension_in_ruleExtension5403 = new BitSet(new long[]{0x0000000000440000L});
        public static final BitSet FOLLOW_22_in_ruleExtension5417 = new BitSet(new long[]{0x0000000001400000L});
        public static final BitSet FOLLOW_24_in_ruleExtension5432 = new BitSet(new long[]{0x0000000000002000L});
        public static final BitSet FOLLOW_13_in_ruleExtension5444 = new BitSet(new long[]{0x0000000400000000L});
        public static final BitSet FOLLOW_ruleStringToAttributeMapEntry_in_ruleExtension5465 = new BitSet(new long[]{0x0000000000440000L});
        public static final BitSet FOLLOW_18_in_ruleExtension5478 = new BitSet(new long[]{0x0000000400000000L});
        public static final BitSet FOLLOW_ruleStringToAttributeMapEntry_in_ruleExtension5499 = new BitSet(new long[]{0x0000000000440000L});
        public static final BitSet FOLLOW_22_in_ruleExtension5513 = new BitSet(new long[]{0x0000000000400000L});
        public static final BitSet FOLLOW_22_in_ruleExtension5527 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAttribute_in_entryRuleAttribute5563 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleAttribute5573 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_54_in_ruleAttribute5610 = new BitSet(new long[]{0x0000000000002000L});
        public static final BitSet FOLLOW_13_in_ruleAttribute5622 = new BitSet(new long[]{0x0080000000000000L});
        public static final BitSet FOLLOW_55_in_ruleAttribute5634 = new BitSet(new long[]{0x0000000000000000L,0x000000000000003EL});
        public static final BitSet FOLLOW_ruleAttributeType_in_ruleAttribute5655 = new BitSet(new long[]{0x0000001000000000L});
        public static final BitSet FOLLOW_36_in_ruleAttribute5667 = new BitSet(new long[]{0x0100000000000000L});
        public static final BitSet FOLLOW_ruleEJavaObject_in_ruleAttribute5688 = new BitSet(new long[]{0x0000000000600000L});
        public static final BitSet FOLLOW_21_in_ruleAttribute5701 = new BitSet(new long[]{0x0000000000002000L});
        public static final BitSet FOLLOW_13_in_ruleAttribute5713 = new BitSet(new long[]{0x0000000020000000L});
        public static final BitSet FOLLOW_ruleAnnotation_in_ruleAttribute5734 = new BitSet(new long[]{0x0000000000440000L});
        public static final BitSet FOLLOW_18_in_ruleAttribute5747 = new BitSet(new long[]{0x0000000020000000L});
        public static final BitSet FOLLOW_ruleAnnotation_in_ruleAttribute5768 = new BitSet(new long[]{0x0000000000440000L});
        public static final BitSet FOLLOW_22_in_ruleAttribute5782 = new BitSet(new long[]{0x0000000000400000L});
        public static final BitSet FOLLOW_22_in_ruleAttribute5796 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEJavaObject_in_entryRuleEJavaObject5833 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleEJavaObject5844 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_56_in_ruleEJavaObject5881 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleCarrierSet_in_entryRuleCarrierSet5920 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleCarrierSet5930 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_11_in_ruleCarrierSet5982 = new BitSet(new long[]{0x0200000000000000L});
        public static final BitSet FOLLOW_57_in_ruleCarrierSet6008 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleCarrierSet6029 = new BitSet(new long[]{0x0000000000002000L});
        public static final BitSet FOLLOW_13_in_ruleCarrierSet6041 = new BitSet(new long[]{0x0000000001E0C000L});
        public static final BitSet FOLLOW_14_in_ruleCarrierSet6054 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleCarrierSet6075 = new BitSet(new long[]{0x0000000001E08000L});
        public static final BitSet FOLLOW_15_in_ruleCarrierSet6090 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleCarrierSet6111 = new BitSet(new long[]{0x0000000001E00000L});
        public static final BitSet FOLLOW_21_in_ruleCarrierSet6126 = new BitSet(new long[]{0x0000000000002000L});
        public static final BitSet FOLLOW_13_in_ruleCarrierSet6138 = new BitSet(new long[]{0x0000000020000000L});
        public static final BitSet FOLLOW_ruleAnnotation_in_ruleCarrierSet6159 = new BitSet(new long[]{0x0000000000440000L});
        public static final BitSet FOLLOW_18_in_ruleCarrierSet6172 = new BitSet(new long[]{0x0000000020000000L});
        public static final BitSet FOLLOW_ruleAnnotation_in_ruleCarrierSet6193 = new BitSet(new long[]{0x0000000000440000L});
        public static final BitSet FOLLOW_22_in_ruleCarrierSet6207 = new BitSet(new long[]{0x0000000001C00000L});
        public static final BitSet FOLLOW_23_in_ruleCarrierSet6222 = new BitSet(new long[]{0x0000000000002000L});
        public static final BitSet FOLLOW_13_in_ruleCarrierSet6234 = new BitSet(new long[]{0x0010000000000800L});
        public static final BitSet FOLLOW_ruleAbstractExtension_in_ruleCarrierSet6255 = new BitSet(new long[]{0x0000000000440000L});
        public static final BitSet FOLLOW_18_in_ruleCarrierSet6268 = new BitSet(new long[]{0x0010000000000800L});
        public static final BitSet FOLLOW_ruleAbstractExtension_in_ruleCarrierSet6289 = new BitSet(new long[]{0x0000000000440000L});
        public static final BitSet FOLLOW_22_in_ruleCarrierSet6303 = new BitSet(new long[]{0x0000000001400000L});
        public static final BitSet FOLLOW_24_in_ruleCarrierSet6318 = new BitSet(new long[]{0x0000000000002000L});
        public static final BitSet FOLLOW_13_in_ruleCarrierSet6330 = new BitSet(new long[]{0x0000000400000000L});
        public static final BitSet FOLLOW_ruleStringToAttributeMapEntry_in_ruleCarrierSet6351 = new BitSet(new long[]{0x0000000000440000L});
        public static final BitSet FOLLOW_18_in_ruleCarrierSet6364 = new BitSet(new long[]{0x0000000400000000L});
        public static final BitSet FOLLOW_ruleStringToAttributeMapEntry_in_ruleCarrierSet6385 = new BitSet(new long[]{0x0000000000440000L});
        public static final BitSet FOLLOW_22_in_ruleCarrierSet6399 = new BitSet(new long[]{0x0000000000400000L});
        public static final BitSet FOLLOW_22_in_ruleCarrierSet6413 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleConstant_in_entryRuleConstant6449 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleConstant6459 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_11_in_ruleConstant6511 = new BitSet(new long[]{0x0400000000000000L});
        public static final BitSet FOLLOW_58_in_ruleConstant6537 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleConstant6558 = new BitSet(new long[]{0x0000000000002000L});
        public static final BitSet FOLLOW_13_in_ruleConstant6570 = new BitSet(new long[]{0x0000000001E0C000L});
        public static final BitSet FOLLOW_14_in_ruleConstant6583 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleConstant6604 = new BitSet(new long[]{0x0000000001E08000L});
        public static final BitSet FOLLOW_15_in_ruleConstant6619 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleConstant6640 = new BitSet(new long[]{0x0000000001E00000L});
        public static final BitSet FOLLOW_21_in_ruleConstant6655 = new BitSet(new long[]{0x0000000000002000L});
        public static final BitSet FOLLOW_13_in_ruleConstant6667 = new BitSet(new long[]{0x0000000020000000L});
        public static final BitSet FOLLOW_ruleAnnotation_in_ruleConstant6688 = new BitSet(new long[]{0x0000000000440000L});
        public static final BitSet FOLLOW_18_in_ruleConstant6701 = new BitSet(new long[]{0x0000000020000000L});
        public static final BitSet FOLLOW_ruleAnnotation_in_ruleConstant6722 = new BitSet(new long[]{0x0000000000440000L});
        public static final BitSet FOLLOW_22_in_ruleConstant6736 = new BitSet(new long[]{0x0000000001C00000L});
        public static final BitSet FOLLOW_23_in_ruleConstant6751 = new BitSet(new long[]{0x0000000000002000L});
        public static final BitSet FOLLOW_13_in_ruleConstant6763 = new BitSet(new long[]{0x0010000000000800L});
        public static final BitSet FOLLOW_ruleAbstractExtension_in_ruleConstant6784 = new BitSet(new long[]{0x0000000000440000L});
        public static final BitSet FOLLOW_18_in_ruleConstant6797 = new BitSet(new long[]{0x0010000000000800L});
        public static final BitSet FOLLOW_ruleAbstractExtension_in_ruleConstant6818 = new BitSet(new long[]{0x0000000000440000L});
        public static final BitSet FOLLOW_22_in_ruleConstant6832 = new BitSet(new long[]{0x0000000001400000L});
        public static final BitSet FOLLOW_24_in_ruleConstant6847 = new BitSet(new long[]{0x0000000000002000L});
        public static final BitSet FOLLOW_13_in_ruleConstant6859 = new BitSet(new long[]{0x0000000400000000L});
        public static final BitSet FOLLOW_ruleStringToAttributeMapEntry_in_ruleConstant6880 = new BitSet(new long[]{0x0000000000440000L});
        public static final BitSet FOLLOW_18_in_ruleConstant6893 = new BitSet(new long[]{0x0000000400000000L});
        public static final BitSet FOLLOW_ruleStringToAttributeMapEntry_in_ruleConstant6914 = new BitSet(new long[]{0x0000000000440000L});
        public static final BitSet FOLLOW_22_in_ruleConstant6928 = new BitSet(new long[]{0x0000000000400000L});
        public static final BitSet FOLLOW_22_in_ruleConstant6942 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAxiom_in_entryRuleAxiom6978 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleAxiom6988 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_11_in_ruleAxiom7031 = new BitSet(new long[]{0x0000004000000000L});
        public static final BitSet FOLLOW_38_in_ruleAxiom7063 = new BitSet(new long[]{0x0800000000000000L});
        public static final BitSet FOLLOW_59_in_ruleAxiom7088 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleAxiom7109 = new BitSet(new long[]{0x0000000000002000L});
        public static final BitSet FOLLOW_13_in_ruleAxiom7121 = new BitSet(new long[]{0x000001000000C000L});
        public static final BitSet FOLLOW_14_in_ruleAxiom7134 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleAxiom7155 = new BitSet(new long[]{0x0000010000008000L});
        public static final BitSet FOLLOW_15_in_ruleAxiom7170 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleAxiom7191 = new BitSet(new long[]{0x0000010000000000L});
        public static final BitSet FOLLOW_40_in_ruleAxiom7205 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleAxiom7226 = new BitSet(new long[]{0x0000000001E00000L});
        public static final BitSet FOLLOW_21_in_ruleAxiom7239 = new BitSet(new long[]{0x0000000000002000L});
        public static final BitSet FOLLOW_13_in_ruleAxiom7251 = new BitSet(new long[]{0x0000000020000000L});
        public static final BitSet FOLLOW_ruleAnnotation_in_ruleAxiom7272 = new BitSet(new long[]{0x0000000000440000L});
        public static final BitSet FOLLOW_18_in_ruleAxiom7285 = new BitSet(new long[]{0x0000000020000000L});
        public static final BitSet FOLLOW_ruleAnnotation_in_ruleAxiom7306 = new BitSet(new long[]{0x0000000000440000L});
        public static final BitSet FOLLOW_22_in_ruleAxiom7320 = new BitSet(new long[]{0x0000000001C00000L});
        public static final BitSet FOLLOW_23_in_ruleAxiom7335 = new BitSet(new long[]{0x0000000000002000L});
        public static final BitSet FOLLOW_13_in_ruleAxiom7347 = new BitSet(new long[]{0x0010000000000800L});
        public static final BitSet FOLLOW_ruleAbstractExtension_in_ruleAxiom7368 = new BitSet(new long[]{0x0000000000440000L});
        public static final BitSet FOLLOW_18_in_ruleAxiom7381 = new BitSet(new long[]{0x0010000000000800L});
        public static final BitSet FOLLOW_ruleAbstractExtension_in_ruleAxiom7402 = new BitSet(new long[]{0x0000000000440000L});
        public static final BitSet FOLLOW_22_in_ruleAxiom7416 = new BitSet(new long[]{0x0000000001400000L});
        public static final BitSet FOLLOW_24_in_ruleAxiom7431 = new BitSet(new long[]{0x0000000000002000L});
        public static final BitSet FOLLOW_13_in_ruleAxiom7443 = new BitSet(new long[]{0x0000000400000000L});
        public static final BitSet FOLLOW_ruleStringToAttributeMapEntry_in_ruleAxiom7464 = new BitSet(new long[]{0x0000000000440000L});
        public static final BitSet FOLLOW_18_in_ruleAxiom7477 = new BitSet(new long[]{0x0000000400000000L});
        public static final BitSet FOLLOW_ruleStringToAttributeMapEntry_in_ruleAxiom7498 = new BitSet(new long[]{0x0000000000440000L});
        public static final BitSet FOLLOW_22_in_ruleAxiom7512 = new BitSet(new long[]{0x0000000000400000L});
        public static final BitSet FOLLOW_22_in_ruleAxiom7526 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleParameter_in_entryRuleParameter7562 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleParameter7572 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_11_in_ruleParameter7624 = new BitSet(new long[]{0x1000000000000000L});
        public static final BitSet FOLLOW_60_in_ruleParameter7650 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleParameter7671 = new BitSet(new long[]{0x0000000000002000L});
        public static final BitSet FOLLOW_13_in_ruleParameter7683 = new BitSet(new long[]{0x0000000001E0C000L});
        public static final BitSet FOLLOW_14_in_ruleParameter7696 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleParameter7717 = new BitSet(new long[]{0x0000000001E08000L});
        public static final BitSet FOLLOW_15_in_ruleParameter7732 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleParameter7753 = new BitSet(new long[]{0x0000000001E00000L});
        public static final BitSet FOLLOW_21_in_ruleParameter7768 = new BitSet(new long[]{0x0000000000002000L});
        public static final BitSet FOLLOW_13_in_ruleParameter7780 = new BitSet(new long[]{0x0000000020000000L});
        public static final BitSet FOLLOW_ruleAnnotation_in_ruleParameter7801 = new BitSet(new long[]{0x0000000000440000L});
        public static final BitSet FOLLOW_18_in_ruleParameter7814 = new BitSet(new long[]{0x0000000020000000L});
        public static final BitSet FOLLOW_ruleAnnotation_in_ruleParameter7835 = new BitSet(new long[]{0x0000000000440000L});
        public static final BitSet FOLLOW_22_in_ruleParameter7849 = new BitSet(new long[]{0x0000000001C00000L});
        public static final BitSet FOLLOW_23_in_ruleParameter7864 = new BitSet(new long[]{0x0000000000002000L});
        public static final BitSet FOLLOW_13_in_ruleParameter7876 = new BitSet(new long[]{0x0010000000000800L});
        public static final BitSet FOLLOW_ruleAbstractExtension_in_ruleParameter7897 = new BitSet(new long[]{0x0000000000440000L});
        public static final BitSet FOLLOW_18_in_ruleParameter7910 = new BitSet(new long[]{0x0010000000000800L});
        public static final BitSet FOLLOW_ruleAbstractExtension_in_ruleParameter7931 = new BitSet(new long[]{0x0000000000440000L});
        public static final BitSet FOLLOW_22_in_ruleParameter7945 = new BitSet(new long[]{0x0000000001400000L});
        public static final BitSet FOLLOW_24_in_ruleParameter7960 = new BitSet(new long[]{0x0000000000002000L});
        public static final BitSet FOLLOW_13_in_ruleParameter7972 = new BitSet(new long[]{0x0000000400000000L});
        public static final BitSet FOLLOW_ruleStringToAttributeMapEntry_in_ruleParameter7993 = new BitSet(new long[]{0x0000000000440000L});
        public static final BitSet FOLLOW_18_in_ruleParameter8006 = new BitSet(new long[]{0x0000000400000000L});
        public static final BitSet FOLLOW_ruleStringToAttributeMapEntry_in_ruleParameter8027 = new BitSet(new long[]{0x0000000000440000L});
        public static final BitSet FOLLOW_22_in_ruleParameter8041 = new BitSet(new long[]{0x0000000000400000L});
        public static final BitSet FOLLOW_22_in_ruleParameter8055 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleGuard_in_entryRuleGuard8091 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleGuard8101 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_11_in_ruleGuard8144 = new BitSet(new long[]{0x0000004000000000L});
        public static final BitSet FOLLOW_38_in_ruleGuard8176 = new BitSet(new long[]{0x2000000000000000L});
        public static final BitSet FOLLOW_61_in_ruleGuard8201 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleGuard8222 = new BitSet(new long[]{0x0000000000002000L});
        public static final BitSet FOLLOW_13_in_ruleGuard8234 = new BitSet(new long[]{0x000001000000C000L});
        public static final BitSet FOLLOW_14_in_ruleGuard8247 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleGuard8268 = new BitSet(new long[]{0x0000010000008000L});
        public static final BitSet FOLLOW_15_in_ruleGuard8283 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleGuard8304 = new BitSet(new long[]{0x0000010000000000L});
        public static final BitSet FOLLOW_40_in_ruleGuard8318 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleGuard8339 = new BitSet(new long[]{0x0000000001E00000L});
        public static final BitSet FOLLOW_21_in_ruleGuard8352 = new BitSet(new long[]{0x0000000000002000L});
        public static final BitSet FOLLOW_13_in_ruleGuard8364 = new BitSet(new long[]{0x0000000020000000L});
        public static final BitSet FOLLOW_ruleAnnotation_in_ruleGuard8385 = new BitSet(new long[]{0x0000000000440000L});
        public static final BitSet FOLLOW_18_in_ruleGuard8398 = new BitSet(new long[]{0x0000000020000000L});
        public static final BitSet FOLLOW_ruleAnnotation_in_ruleGuard8419 = new BitSet(new long[]{0x0000000000440000L});
        public static final BitSet FOLLOW_22_in_ruleGuard8433 = new BitSet(new long[]{0x0000000001C00000L});
        public static final BitSet FOLLOW_23_in_ruleGuard8448 = new BitSet(new long[]{0x0000000000002000L});
        public static final BitSet FOLLOW_13_in_ruleGuard8460 = new BitSet(new long[]{0x0010000000000800L});
        public static final BitSet FOLLOW_ruleAbstractExtension_in_ruleGuard8481 = new BitSet(new long[]{0x0000000000440000L});
        public static final BitSet FOLLOW_18_in_ruleGuard8494 = new BitSet(new long[]{0x0010000000000800L});
        public static final BitSet FOLLOW_ruleAbstractExtension_in_ruleGuard8515 = new BitSet(new long[]{0x0000000000440000L});
        public static final BitSet FOLLOW_22_in_ruleGuard8529 = new BitSet(new long[]{0x0000000001400000L});
        public static final BitSet FOLLOW_24_in_ruleGuard8544 = new BitSet(new long[]{0x0000000000002000L});
        public static final BitSet FOLLOW_13_in_ruleGuard8556 = new BitSet(new long[]{0x0000000400000000L});
        public static final BitSet FOLLOW_ruleStringToAttributeMapEntry_in_ruleGuard8577 = new BitSet(new long[]{0x0000000000440000L});
        public static final BitSet FOLLOW_18_in_ruleGuard8590 = new BitSet(new long[]{0x0000000400000000L});
        public static final BitSet FOLLOW_ruleStringToAttributeMapEntry_in_ruleGuard8611 = new BitSet(new long[]{0x0000000000440000L});
        public static final BitSet FOLLOW_22_in_ruleGuard8625 = new BitSet(new long[]{0x0000000000400000L});
        public static final BitSet FOLLOW_22_in_ruleGuard8639 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleWitness_in_entryRuleWitness8675 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleWitness8685 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_11_in_ruleWitness8728 = new BitSet(new long[]{0x4000000000000000L});
        public static final BitSet FOLLOW_62_in_ruleWitness8754 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleWitness8775 = new BitSet(new long[]{0x0000000000002000L});
        public static final BitSet FOLLOW_13_in_ruleWitness8787 = new BitSet(new long[]{0x000001000000C000L});
        public static final BitSet FOLLOW_14_in_ruleWitness8800 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleWitness8821 = new BitSet(new long[]{0x0000010000008000L});
        public static final BitSet FOLLOW_15_in_ruleWitness8836 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleWitness8857 = new BitSet(new long[]{0x0000010000000000L});
        public static final BitSet FOLLOW_40_in_ruleWitness8871 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleWitness8892 = new BitSet(new long[]{0x0000000001E00000L});
        public static final BitSet FOLLOW_21_in_ruleWitness8905 = new BitSet(new long[]{0x0000000000002000L});
        public static final BitSet FOLLOW_13_in_ruleWitness8917 = new BitSet(new long[]{0x0000000020000000L});
        public static final BitSet FOLLOW_ruleAnnotation_in_ruleWitness8938 = new BitSet(new long[]{0x0000000000440000L});
        public static final BitSet FOLLOW_18_in_ruleWitness8951 = new BitSet(new long[]{0x0000000020000000L});
        public static final BitSet FOLLOW_ruleAnnotation_in_ruleWitness8972 = new BitSet(new long[]{0x0000000000440000L});
        public static final BitSet FOLLOW_22_in_ruleWitness8986 = new BitSet(new long[]{0x0000000001C00000L});
        public static final BitSet FOLLOW_23_in_ruleWitness9001 = new BitSet(new long[]{0x0000000000002000L});
        public static final BitSet FOLLOW_13_in_ruleWitness9013 = new BitSet(new long[]{0x0010000000000800L});
        public static final BitSet FOLLOW_ruleAbstractExtension_in_ruleWitness9034 = new BitSet(new long[]{0x0000000000440000L});
        public static final BitSet FOLLOW_18_in_ruleWitness9047 = new BitSet(new long[]{0x0010000000000800L});
        public static final BitSet FOLLOW_ruleAbstractExtension_in_ruleWitness9068 = new BitSet(new long[]{0x0000000000440000L});
        public static final BitSet FOLLOW_22_in_ruleWitness9082 = new BitSet(new long[]{0x0000000001400000L});
        public static final BitSet FOLLOW_24_in_ruleWitness9097 = new BitSet(new long[]{0x0000000000002000L});
        public static final BitSet FOLLOW_13_in_ruleWitness9109 = new BitSet(new long[]{0x0000000400000000L});
        public static final BitSet FOLLOW_ruleStringToAttributeMapEntry_in_ruleWitness9130 = new BitSet(new long[]{0x0000000000440000L});
        public static final BitSet FOLLOW_18_in_ruleWitness9143 = new BitSet(new long[]{0x0000000400000000L});
        public static final BitSet FOLLOW_ruleStringToAttributeMapEntry_in_ruleWitness9164 = new BitSet(new long[]{0x0000000000440000L});
        public static final BitSet FOLLOW_22_in_ruleWitness9178 = new BitSet(new long[]{0x0000000000400000L});
        public static final BitSet FOLLOW_22_in_ruleWitness9192 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAction_in_entryRuleAction9228 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleAction9238 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_11_in_ruleAction9281 = new BitSet(new long[]{0x8000000000000000L});
        public static final BitSet FOLLOW_63_in_ruleAction9307 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleAction9328 = new BitSet(new long[]{0x0000000000002000L});
        public static final BitSet FOLLOW_13_in_ruleAction9340 = new BitSet(new long[]{0x000000000000C000L,0x0000000000000001L});
        public static final BitSet FOLLOW_14_in_ruleAction9353 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleAction9374 = new BitSet(new long[]{0x0000000000008000L,0x0000000000000001L});
        public static final BitSet FOLLOW_15_in_ruleAction9389 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleAction9410 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L});
        public static final BitSet FOLLOW_64_in_ruleAction9424 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleAction9445 = new BitSet(new long[]{0x0000000001E00000L});
        public static final BitSet FOLLOW_21_in_ruleAction9458 = new BitSet(new long[]{0x0000000000002000L});
        public static final BitSet FOLLOW_13_in_ruleAction9470 = new BitSet(new long[]{0x0000000020000000L});
        public static final BitSet FOLLOW_ruleAnnotation_in_ruleAction9491 = new BitSet(new long[]{0x0000000000440000L});
        public static final BitSet FOLLOW_18_in_ruleAction9504 = new BitSet(new long[]{0x0000000020000000L});
        public static final BitSet FOLLOW_ruleAnnotation_in_ruleAction9525 = new BitSet(new long[]{0x0000000000440000L});
        public static final BitSet FOLLOW_22_in_ruleAction9539 = new BitSet(new long[]{0x0000000001C00000L});
        public static final BitSet FOLLOW_23_in_ruleAction9554 = new BitSet(new long[]{0x0000000000002000L});
        public static final BitSet FOLLOW_13_in_ruleAction9566 = new BitSet(new long[]{0x0010000000000800L});
        public static final BitSet FOLLOW_ruleAbstractExtension_in_ruleAction9587 = new BitSet(new long[]{0x0000000000440000L});
        public static final BitSet FOLLOW_18_in_ruleAction9600 = new BitSet(new long[]{0x0010000000000800L});
        public static final BitSet FOLLOW_ruleAbstractExtension_in_ruleAction9621 = new BitSet(new long[]{0x0000000000440000L});
        public static final BitSet FOLLOW_22_in_ruleAction9635 = new BitSet(new long[]{0x0000000001400000L});
        public static final BitSet FOLLOW_24_in_ruleAction9650 = new BitSet(new long[]{0x0000000000002000L});
        public static final BitSet FOLLOW_13_in_ruleAction9662 = new BitSet(new long[]{0x0000000400000000L});
        public static final BitSet FOLLOW_ruleStringToAttributeMapEntry_in_ruleAction9683 = new BitSet(new long[]{0x0000000000440000L});
        public static final BitSet FOLLOW_18_in_ruleAction9696 = new BitSet(new long[]{0x0000000400000000L});
        public static final BitSet FOLLOW_ruleStringToAttributeMapEntry_in_ruleAction9717 = new BitSet(new long[]{0x0000000000440000L});
        public static final BitSet FOLLOW_22_in_ruleAction9731 = new BitSet(new long[]{0x0000000000400000L});
        public static final BitSet FOLLOW_22_in_ruleAction9745 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_65_in_ruleAttributeType9795 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_66_in_ruleAttributeType9812 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_67_in_ruleAttributeType9829 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_68_in_ruleAttributeType9846 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_69_in_ruleAttributeType9863 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_70_in_ruleConvergence9908 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_71_in_ruleConvergence9925 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_72_in_ruleConvergence9942 = new BitSet(new long[]{0x0000000000000002L});
    }


}