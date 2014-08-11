package ac.soton.xtext.context.dsl.parser.antlr.internal; 

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
import ac.soton.xtext.context.dsl.services.ContextDslGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalContextDslParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'localGenerated'", "'Context'", "'{'", "'internalId'", "'comment'", "'extends'", "'('", "','", "')'", "'annotations'", "'}'", "'extensions'", "'attributes'", "'sets'", "'constants'", "'axioms'", "'Annotation'", "'source'", "'references'", "'details'", "'contents'", "'StringToAttributeMapEntry'", "'key'", "'value'", "'CarrierSet'", "'Constant'", "'theorem'", "'Axiom'", "'predicate'", "'StringToStringMapEntry'", "'EObject'", "'Extension'", "'extensionId'", "'Attribute'", "'type'", "'EJavaObject'", "'Boolean'", "'Handle'", "'Integer'", "'Long'", "'String'"
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
    public static final int EOF=-1;
    public static final int T__19=19;
    public static final int T__51=51;
    public static final int T__16=16;
    public static final int T__15=15;
    public static final int T__18=18;
    public static final int T__17=17;
    public static final int T__12=12;
    public static final int T__11=11;
    public static final int T__14=14;
    public static final int T__13=13;
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


        public InternalContextDslParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalContextDslParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalContextDslParser.tokenNames; }
    public String getGrammarFileName() { return "../ac.soton.xtext.context.dsl/src-gen/ac/soton/xtext/context/dsl/parser/antlr/internal/InternalContextDsl.g"; }



     	private ContextDslGrammarAccess grammarAccess;
     	
        public InternalContextDslParser(TokenStream input, ContextDslGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }
        
        @Override
        protected String getFirstRuleName() {
        	return "Context";	
       	}
       	
       	@Override
       	protected ContextDslGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}



    // $ANTLR start "entryRuleContext"
    // ../ac.soton.xtext.context.dsl/src-gen/ac/soton/xtext/context/dsl/parser/antlr/internal/InternalContextDsl.g:68:1: entryRuleContext returns [EObject current=null] : iv_ruleContext= ruleContext EOF ;
    public final EObject entryRuleContext() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleContext = null;


        try {
            // ../ac.soton.xtext.context.dsl/src-gen/ac/soton/xtext/context/dsl/parser/antlr/internal/InternalContextDsl.g:69:2: (iv_ruleContext= ruleContext EOF )
            // ../ac.soton.xtext.context.dsl/src-gen/ac/soton/xtext/context/dsl/parser/antlr/internal/InternalContextDsl.g:70:2: iv_ruleContext= ruleContext EOF
            {
             newCompositeNode(grammarAccess.getContextRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleContext_in_entryRuleContext75);
            iv_ruleContext=ruleContext();

            state._fsp--;

             current =iv_ruleContext; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleContext85); 

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
    // $ANTLR end "entryRuleContext"


    // $ANTLR start "ruleContext"
    // ../ac.soton.xtext.context.dsl/src-gen/ac/soton/xtext/context/dsl/parser/antlr/internal/InternalContextDsl.g:77:1: ruleContext returns [EObject current=null] : ( () ( (lv_localGenerated_1_0= 'localGenerated' ) )? otherlv_2= 'Context' ( (lv_name_3_0= ruleEString ) ) otherlv_4= '{' (otherlv_5= 'internalId' ( (lv_internalId_6_0= ruleEString ) ) )? (otherlv_7= 'comment' ( (lv_comment_8_0= ruleEString ) ) )? (otherlv_9= 'extends' otherlv_10= '(' ( ( ruleEString ) ) (otherlv_12= ',' ( ( ruleEString ) ) )* otherlv_14= ')' )? (otherlv_15= 'annotations' otherlv_16= '{' ( (lv_annotations_17_0= ruleAnnotation ) ) (otherlv_18= ',' ( (lv_annotations_19_0= ruleAnnotation ) ) )* otherlv_20= '}' )? (otherlv_21= 'extensions' otherlv_22= '{' ( (lv_extensions_23_0= ruleAbstractExtension ) ) (otherlv_24= ',' ( (lv_extensions_25_0= ruleAbstractExtension ) ) )* otherlv_26= '}' )? (otherlv_27= 'attributes' otherlv_28= '{' ( (lv_attributes_29_0= ruleStringToAttributeMapEntry ) ) (otherlv_30= ',' ( (lv_attributes_31_0= ruleStringToAttributeMapEntry ) ) )* otherlv_32= '}' )? (otherlv_33= 'sets' otherlv_34= '{' ( (lv_sets_35_0= ruleCarrierSet ) ) (otherlv_36= ',' ( (lv_sets_37_0= ruleCarrierSet ) ) )* otherlv_38= '}' )? (otherlv_39= 'constants' otherlv_40= '{' ( (lv_constants_41_0= ruleConstant ) ) (otherlv_42= ',' ( (lv_constants_43_0= ruleConstant ) ) )* otherlv_44= '}' )? (otherlv_45= 'axioms' otherlv_46= '{' ( (lv_axioms_47_0= ruleAxiom ) ) (otherlv_48= ',' ( (lv_axioms_49_0= ruleAxiom ) ) )* otherlv_50= '}' )? otherlv_51= '}' ) ;
    public final EObject ruleContext() throws RecognitionException {
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
        AntlrDatatypeRuleToken lv_name_3_0 = null;

        AntlrDatatypeRuleToken lv_internalId_6_0 = null;

        AntlrDatatypeRuleToken lv_comment_8_0 = null;

        EObject lv_annotations_17_0 = null;

        EObject lv_annotations_19_0 = null;

        EObject lv_extensions_23_0 = null;

        EObject lv_extensions_25_0 = null;

        EObject lv_attributes_29_0 = null;

        EObject lv_attributes_31_0 = null;

        EObject lv_sets_35_0 = null;

        EObject lv_sets_37_0 = null;

        EObject lv_constants_41_0 = null;

        EObject lv_constants_43_0 = null;

        EObject lv_axioms_47_0 = null;

        EObject lv_axioms_49_0 = null;


         enterRule(); 
            
        try {
            // ../ac.soton.xtext.context.dsl/src-gen/ac/soton/xtext/context/dsl/parser/antlr/internal/InternalContextDsl.g:80:28: ( ( () ( (lv_localGenerated_1_0= 'localGenerated' ) )? otherlv_2= 'Context' ( (lv_name_3_0= ruleEString ) ) otherlv_4= '{' (otherlv_5= 'internalId' ( (lv_internalId_6_0= ruleEString ) ) )? (otherlv_7= 'comment' ( (lv_comment_8_0= ruleEString ) ) )? (otherlv_9= 'extends' otherlv_10= '(' ( ( ruleEString ) ) (otherlv_12= ',' ( ( ruleEString ) ) )* otherlv_14= ')' )? (otherlv_15= 'annotations' otherlv_16= '{' ( (lv_annotations_17_0= ruleAnnotation ) ) (otherlv_18= ',' ( (lv_annotations_19_0= ruleAnnotation ) ) )* otherlv_20= '}' )? (otherlv_21= 'extensions' otherlv_22= '{' ( (lv_extensions_23_0= ruleAbstractExtension ) ) (otherlv_24= ',' ( (lv_extensions_25_0= ruleAbstractExtension ) ) )* otherlv_26= '}' )? (otherlv_27= 'attributes' otherlv_28= '{' ( (lv_attributes_29_0= ruleStringToAttributeMapEntry ) ) (otherlv_30= ',' ( (lv_attributes_31_0= ruleStringToAttributeMapEntry ) ) )* otherlv_32= '}' )? (otherlv_33= 'sets' otherlv_34= '{' ( (lv_sets_35_0= ruleCarrierSet ) ) (otherlv_36= ',' ( (lv_sets_37_0= ruleCarrierSet ) ) )* otherlv_38= '}' )? (otherlv_39= 'constants' otherlv_40= '{' ( (lv_constants_41_0= ruleConstant ) ) (otherlv_42= ',' ( (lv_constants_43_0= ruleConstant ) ) )* otherlv_44= '}' )? (otherlv_45= 'axioms' otherlv_46= '{' ( (lv_axioms_47_0= ruleAxiom ) ) (otherlv_48= ',' ( (lv_axioms_49_0= ruleAxiom ) ) )* otherlv_50= '}' )? otherlv_51= '}' ) )
            // ../ac.soton.xtext.context.dsl/src-gen/ac/soton/xtext/context/dsl/parser/antlr/internal/InternalContextDsl.g:81:1: ( () ( (lv_localGenerated_1_0= 'localGenerated' ) )? otherlv_2= 'Context' ( (lv_name_3_0= ruleEString ) ) otherlv_4= '{' (otherlv_5= 'internalId' ( (lv_internalId_6_0= ruleEString ) ) )? (otherlv_7= 'comment' ( (lv_comment_8_0= ruleEString ) ) )? (otherlv_9= 'extends' otherlv_10= '(' ( ( ruleEString ) ) (otherlv_12= ',' ( ( ruleEString ) ) )* otherlv_14= ')' )? (otherlv_15= 'annotations' otherlv_16= '{' ( (lv_annotations_17_0= ruleAnnotation ) ) (otherlv_18= ',' ( (lv_annotations_19_0= ruleAnnotation ) ) )* otherlv_20= '}' )? (otherlv_21= 'extensions' otherlv_22= '{' ( (lv_extensions_23_0= ruleAbstractExtension ) ) (otherlv_24= ',' ( (lv_extensions_25_0= ruleAbstractExtension ) ) )* otherlv_26= '}' )? (otherlv_27= 'attributes' otherlv_28= '{' ( (lv_attributes_29_0= ruleStringToAttributeMapEntry ) ) (otherlv_30= ',' ( (lv_attributes_31_0= ruleStringToAttributeMapEntry ) ) )* otherlv_32= '}' )? (otherlv_33= 'sets' otherlv_34= '{' ( (lv_sets_35_0= ruleCarrierSet ) ) (otherlv_36= ',' ( (lv_sets_37_0= ruleCarrierSet ) ) )* otherlv_38= '}' )? (otherlv_39= 'constants' otherlv_40= '{' ( (lv_constants_41_0= ruleConstant ) ) (otherlv_42= ',' ( (lv_constants_43_0= ruleConstant ) ) )* otherlv_44= '}' )? (otherlv_45= 'axioms' otherlv_46= '{' ( (lv_axioms_47_0= ruleAxiom ) ) (otherlv_48= ',' ( (lv_axioms_49_0= ruleAxiom ) ) )* otherlv_50= '}' )? otherlv_51= '}' )
            {
            // ../ac.soton.xtext.context.dsl/src-gen/ac/soton/xtext/context/dsl/parser/antlr/internal/InternalContextDsl.g:81:1: ( () ( (lv_localGenerated_1_0= 'localGenerated' ) )? otherlv_2= 'Context' ( (lv_name_3_0= ruleEString ) ) otherlv_4= '{' (otherlv_5= 'internalId' ( (lv_internalId_6_0= ruleEString ) ) )? (otherlv_7= 'comment' ( (lv_comment_8_0= ruleEString ) ) )? (otherlv_9= 'extends' otherlv_10= '(' ( ( ruleEString ) ) (otherlv_12= ',' ( ( ruleEString ) ) )* otherlv_14= ')' )? (otherlv_15= 'annotations' otherlv_16= '{' ( (lv_annotations_17_0= ruleAnnotation ) ) (otherlv_18= ',' ( (lv_annotations_19_0= ruleAnnotation ) ) )* otherlv_20= '}' )? (otherlv_21= 'extensions' otherlv_22= '{' ( (lv_extensions_23_0= ruleAbstractExtension ) ) (otherlv_24= ',' ( (lv_extensions_25_0= ruleAbstractExtension ) ) )* otherlv_26= '}' )? (otherlv_27= 'attributes' otherlv_28= '{' ( (lv_attributes_29_0= ruleStringToAttributeMapEntry ) ) (otherlv_30= ',' ( (lv_attributes_31_0= ruleStringToAttributeMapEntry ) ) )* otherlv_32= '}' )? (otherlv_33= 'sets' otherlv_34= '{' ( (lv_sets_35_0= ruleCarrierSet ) ) (otherlv_36= ',' ( (lv_sets_37_0= ruleCarrierSet ) ) )* otherlv_38= '}' )? (otherlv_39= 'constants' otherlv_40= '{' ( (lv_constants_41_0= ruleConstant ) ) (otherlv_42= ',' ( (lv_constants_43_0= ruleConstant ) ) )* otherlv_44= '}' )? (otherlv_45= 'axioms' otherlv_46= '{' ( (lv_axioms_47_0= ruleAxiom ) ) (otherlv_48= ',' ( (lv_axioms_49_0= ruleAxiom ) ) )* otherlv_50= '}' )? otherlv_51= '}' )
            // ../ac.soton.xtext.context.dsl/src-gen/ac/soton/xtext/context/dsl/parser/antlr/internal/InternalContextDsl.g:81:2: () ( (lv_localGenerated_1_0= 'localGenerated' ) )? otherlv_2= 'Context' ( (lv_name_3_0= ruleEString ) ) otherlv_4= '{' (otherlv_5= 'internalId' ( (lv_internalId_6_0= ruleEString ) ) )? (otherlv_7= 'comment' ( (lv_comment_8_0= ruleEString ) ) )? (otherlv_9= 'extends' otherlv_10= '(' ( ( ruleEString ) ) (otherlv_12= ',' ( ( ruleEString ) ) )* otherlv_14= ')' )? (otherlv_15= 'annotations' otherlv_16= '{' ( (lv_annotations_17_0= ruleAnnotation ) ) (otherlv_18= ',' ( (lv_annotations_19_0= ruleAnnotation ) ) )* otherlv_20= '}' )? (otherlv_21= 'extensions' otherlv_22= '{' ( (lv_extensions_23_0= ruleAbstractExtension ) ) (otherlv_24= ',' ( (lv_extensions_25_0= ruleAbstractExtension ) ) )* otherlv_26= '}' )? (otherlv_27= 'attributes' otherlv_28= '{' ( (lv_attributes_29_0= ruleStringToAttributeMapEntry ) ) (otherlv_30= ',' ( (lv_attributes_31_0= ruleStringToAttributeMapEntry ) ) )* otherlv_32= '}' )? (otherlv_33= 'sets' otherlv_34= '{' ( (lv_sets_35_0= ruleCarrierSet ) ) (otherlv_36= ',' ( (lv_sets_37_0= ruleCarrierSet ) ) )* otherlv_38= '}' )? (otherlv_39= 'constants' otherlv_40= '{' ( (lv_constants_41_0= ruleConstant ) ) (otherlv_42= ',' ( (lv_constants_43_0= ruleConstant ) ) )* otherlv_44= '}' )? (otherlv_45= 'axioms' otherlv_46= '{' ( (lv_axioms_47_0= ruleAxiom ) ) (otherlv_48= ',' ( (lv_axioms_49_0= ruleAxiom ) ) )* otherlv_50= '}' )? otherlv_51= '}'
            {
            // ../ac.soton.xtext.context.dsl/src-gen/ac/soton/xtext/context/dsl/parser/antlr/internal/InternalContextDsl.g:81:2: ()
            // ../ac.soton.xtext.context.dsl/src-gen/ac/soton/xtext/context/dsl/parser/antlr/internal/InternalContextDsl.g:82:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getContextAccess().getContextAction_0(),
                        current);
                

            }

            // ../ac.soton.xtext.context.dsl/src-gen/ac/soton/xtext/context/dsl/parser/antlr/internal/InternalContextDsl.g:87:2: ( (lv_localGenerated_1_0= 'localGenerated' ) )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==11) ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // ../ac.soton.xtext.context.dsl/src-gen/ac/soton/xtext/context/dsl/parser/antlr/internal/InternalContextDsl.g:88:1: (lv_localGenerated_1_0= 'localGenerated' )
                    {
                    // ../ac.soton.xtext.context.dsl/src-gen/ac/soton/xtext/context/dsl/parser/antlr/internal/InternalContextDsl.g:88:1: (lv_localGenerated_1_0= 'localGenerated' )
                    // ../ac.soton.xtext.context.dsl/src-gen/ac/soton/xtext/context/dsl/parser/antlr/internal/InternalContextDsl.g:89:3: lv_localGenerated_1_0= 'localGenerated'
                    {
                    lv_localGenerated_1_0=(Token)match(input,11,FollowSets000.FOLLOW_11_in_ruleContext137); 

                            newLeafNode(lv_localGenerated_1_0, grammarAccess.getContextAccess().getLocalGeneratedLocalGeneratedKeyword_1_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getContextRule());
                    	        }
                           		setWithLastConsumed(current, "localGenerated", true, "localGenerated");
                    	    

                    }


                    }
                    break;

            }

            otherlv_2=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleContext163); 

                	newLeafNode(otherlv_2, grammarAccess.getContextAccess().getContextKeyword_2());
                
            // ../ac.soton.xtext.context.dsl/src-gen/ac/soton/xtext/context/dsl/parser/antlr/internal/InternalContextDsl.g:106:1: ( (lv_name_3_0= ruleEString ) )
            // ../ac.soton.xtext.context.dsl/src-gen/ac/soton/xtext/context/dsl/parser/antlr/internal/InternalContextDsl.g:107:1: (lv_name_3_0= ruleEString )
            {
            // ../ac.soton.xtext.context.dsl/src-gen/ac/soton/xtext/context/dsl/parser/antlr/internal/InternalContextDsl.g:107:1: (lv_name_3_0= ruleEString )
            // ../ac.soton.xtext.context.dsl/src-gen/ac/soton/xtext/context/dsl/parser/antlr/internal/InternalContextDsl.g:108:3: lv_name_3_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getContextAccess().getNameEStringParserRuleCall_3_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleContext184);
            lv_name_3_0=ruleEString();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getContextRule());
            	        }
                   		set(
                   			current, 
                   			"name",
                    		lv_name_3_0, 
                    		"EString");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_4=(Token)match(input,13,FollowSets000.FOLLOW_13_in_ruleContext196); 

                	newLeafNode(otherlv_4, grammarAccess.getContextAccess().getLeftCurlyBracketKeyword_4());
                
            // ../ac.soton.xtext.context.dsl/src-gen/ac/soton/xtext/context/dsl/parser/antlr/internal/InternalContextDsl.g:128:1: (otherlv_5= 'internalId' ( (lv_internalId_6_0= ruleEString ) ) )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==14) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // ../ac.soton.xtext.context.dsl/src-gen/ac/soton/xtext/context/dsl/parser/antlr/internal/InternalContextDsl.g:128:3: otherlv_5= 'internalId' ( (lv_internalId_6_0= ruleEString ) )
                    {
                    otherlv_5=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleContext209); 

                        	newLeafNode(otherlv_5, grammarAccess.getContextAccess().getInternalIdKeyword_5_0());
                        
                    // ../ac.soton.xtext.context.dsl/src-gen/ac/soton/xtext/context/dsl/parser/antlr/internal/InternalContextDsl.g:132:1: ( (lv_internalId_6_0= ruleEString ) )
                    // ../ac.soton.xtext.context.dsl/src-gen/ac/soton/xtext/context/dsl/parser/antlr/internal/InternalContextDsl.g:133:1: (lv_internalId_6_0= ruleEString )
                    {
                    // ../ac.soton.xtext.context.dsl/src-gen/ac/soton/xtext/context/dsl/parser/antlr/internal/InternalContextDsl.g:133:1: (lv_internalId_6_0= ruleEString )
                    // ../ac.soton.xtext.context.dsl/src-gen/ac/soton/xtext/context/dsl/parser/antlr/internal/InternalContextDsl.g:134:3: lv_internalId_6_0= ruleEString
                    {
                     
                    	        newCompositeNode(grammarAccess.getContextAccess().getInternalIdEStringParserRuleCall_5_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleContext230);
                    lv_internalId_6_0=ruleEString();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getContextRule());
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

            // ../ac.soton.xtext.context.dsl/src-gen/ac/soton/xtext/context/dsl/parser/antlr/internal/InternalContextDsl.g:150:4: (otherlv_7= 'comment' ( (lv_comment_8_0= ruleEString ) ) )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==15) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // ../ac.soton.xtext.context.dsl/src-gen/ac/soton/xtext/context/dsl/parser/antlr/internal/InternalContextDsl.g:150:6: otherlv_7= 'comment' ( (lv_comment_8_0= ruleEString ) )
                    {
                    otherlv_7=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleContext245); 

                        	newLeafNode(otherlv_7, grammarAccess.getContextAccess().getCommentKeyword_6_0());
                        
                    // ../ac.soton.xtext.context.dsl/src-gen/ac/soton/xtext/context/dsl/parser/antlr/internal/InternalContextDsl.g:154:1: ( (lv_comment_8_0= ruleEString ) )
                    // ../ac.soton.xtext.context.dsl/src-gen/ac/soton/xtext/context/dsl/parser/antlr/internal/InternalContextDsl.g:155:1: (lv_comment_8_0= ruleEString )
                    {
                    // ../ac.soton.xtext.context.dsl/src-gen/ac/soton/xtext/context/dsl/parser/antlr/internal/InternalContextDsl.g:155:1: (lv_comment_8_0= ruleEString )
                    // ../ac.soton.xtext.context.dsl/src-gen/ac/soton/xtext/context/dsl/parser/antlr/internal/InternalContextDsl.g:156:3: lv_comment_8_0= ruleEString
                    {
                     
                    	        newCompositeNode(grammarAccess.getContextAccess().getCommentEStringParserRuleCall_6_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleContext266);
                    lv_comment_8_0=ruleEString();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getContextRule());
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

            // ../ac.soton.xtext.context.dsl/src-gen/ac/soton/xtext/context/dsl/parser/antlr/internal/InternalContextDsl.g:172:4: (otherlv_9= 'extends' otherlv_10= '(' ( ( ruleEString ) ) (otherlv_12= ',' ( ( ruleEString ) ) )* otherlv_14= ')' )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==16) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // ../ac.soton.xtext.context.dsl/src-gen/ac/soton/xtext/context/dsl/parser/antlr/internal/InternalContextDsl.g:172:6: otherlv_9= 'extends' otherlv_10= '(' ( ( ruleEString ) ) (otherlv_12= ',' ( ( ruleEString ) ) )* otherlv_14= ')'
                    {
                    otherlv_9=(Token)match(input,16,FollowSets000.FOLLOW_16_in_ruleContext281); 

                        	newLeafNode(otherlv_9, grammarAccess.getContextAccess().getExtendsKeyword_7_0());
                        
                    otherlv_10=(Token)match(input,17,FollowSets000.FOLLOW_17_in_ruleContext293); 

                        	newLeafNode(otherlv_10, grammarAccess.getContextAccess().getLeftParenthesisKeyword_7_1());
                        
                    // ../ac.soton.xtext.context.dsl/src-gen/ac/soton/xtext/context/dsl/parser/antlr/internal/InternalContextDsl.g:180:1: ( ( ruleEString ) )
                    // ../ac.soton.xtext.context.dsl/src-gen/ac/soton/xtext/context/dsl/parser/antlr/internal/InternalContextDsl.g:181:1: ( ruleEString )
                    {
                    // ../ac.soton.xtext.context.dsl/src-gen/ac/soton/xtext/context/dsl/parser/antlr/internal/InternalContextDsl.g:181:1: ( ruleEString )
                    // ../ac.soton.xtext.context.dsl/src-gen/ac/soton/xtext/context/dsl/parser/antlr/internal/InternalContextDsl.g:182:3: ruleEString
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getContextRule());
                    	        }
                            
                     
                    	        newCompositeNode(grammarAccess.getContextAccess().getExtendsContextCrossReference_7_2_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleContext316);
                    ruleEString();

                    state._fsp--;

                     
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../ac.soton.xtext.context.dsl/src-gen/ac/soton/xtext/context/dsl/parser/antlr/internal/InternalContextDsl.g:195:2: (otherlv_12= ',' ( ( ruleEString ) ) )*
                    loop4:
                    do {
                        int alt4=2;
                        int LA4_0 = input.LA(1);

                        if ( (LA4_0==18) ) {
                            alt4=1;
                        }


                        switch (alt4) {
                    	case 1 :
                    	    // ../ac.soton.xtext.context.dsl/src-gen/ac/soton/xtext/context/dsl/parser/antlr/internal/InternalContextDsl.g:195:4: otherlv_12= ',' ( ( ruleEString ) )
                    	    {
                    	    otherlv_12=(Token)match(input,18,FollowSets000.FOLLOW_18_in_ruleContext329); 

                    	        	newLeafNode(otherlv_12, grammarAccess.getContextAccess().getCommaKeyword_7_3_0());
                    	        
                    	    // ../ac.soton.xtext.context.dsl/src-gen/ac/soton/xtext/context/dsl/parser/antlr/internal/InternalContextDsl.g:199:1: ( ( ruleEString ) )
                    	    // ../ac.soton.xtext.context.dsl/src-gen/ac/soton/xtext/context/dsl/parser/antlr/internal/InternalContextDsl.g:200:1: ( ruleEString )
                    	    {
                    	    // ../ac.soton.xtext.context.dsl/src-gen/ac/soton/xtext/context/dsl/parser/antlr/internal/InternalContextDsl.g:200:1: ( ruleEString )
                    	    // ../ac.soton.xtext.context.dsl/src-gen/ac/soton/xtext/context/dsl/parser/antlr/internal/InternalContextDsl.g:201:3: ruleEString
                    	    {

                    	    			if (current==null) {
                    	    	            current = createModelElement(grammarAccess.getContextRule());
                    	    	        }
                    	            
                    	     
                    	    	        newCompositeNode(grammarAccess.getContextAccess().getExtendsContextCrossReference_7_3_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleContext352);
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

                    otherlv_14=(Token)match(input,19,FollowSets000.FOLLOW_19_in_ruleContext366); 

                        	newLeafNode(otherlv_14, grammarAccess.getContextAccess().getRightParenthesisKeyword_7_4());
                        

                    }
                    break;

            }

            // ../ac.soton.xtext.context.dsl/src-gen/ac/soton/xtext/context/dsl/parser/antlr/internal/InternalContextDsl.g:218:3: (otherlv_15= 'annotations' otherlv_16= '{' ( (lv_annotations_17_0= ruleAnnotation ) ) (otherlv_18= ',' ( (lv_annotations_19_0= ruleAnnotation ) ) )* otherlv_20= '}' )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==20) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // ../ac.soton.xtext.context.dsl/src-gen/ac/soton/xtext/context/dsl/parser/antlr/internal/InternalContextDsl.g:218:5: otherlv_15= 'annotations' otherlv_16= '{' ( (lv_annotations_17_0= ruleAnnotation ) ) (otherlv_18= ',' ( (lv_annotations_19_0= ruleAnnotation ) ) )* otherlv_20= '}'
                    {
                    otherlv_15=(Token)match(input,20,FollowSets000.FOLLOW_20_in_ruleContext381); 

                        	newLeafNode(otherlv_15, grammarAccess.getContextAccess().getAnnotationsKeyword_8_0());
                        
                    otherlv_16=(Token)match(input,13,FollowSets000.FOLLOW_13_in_ruleContext393); 

                        	newLeafNode(otherlv_16, grammarAccess.getContextAccess().getLeftCurlyBracketKeyword_8_1());
                        
                    // ../ac.soton.xtext.context.dsl/src-gen/ac/soton/xtext/context/dsl/parser/antlr/internal/InternalContextDsl.g:226:1: ( (lv_annotations_17_0= ruleAnnotation ) )
                    // ../ac.soton.xtext.context.dsl/src-gen/ac/soton/xtext/context/dsl/parser/antlr/internal/InternalContextDsl.g:227:1: (lv_annotations_17_0= ruleAnnotation )
                    {
                    // ../ac.soton.xtext.context.dsl/src-gen/ac/soton/xtext/context/dsl/parser/antlr/internal/InternalContextDsl.g:227:1: (lv_annotations_17_0= ruleAnnotation )
                    // ../ac.soton.xtext.context.dsl/src-gen/ac/soton/xtext/context/dsl/parser/antlr/internal/InternalContextDsl.g:228:3: lv_annotations_17_0= ruleAnnotation
                    {
                     
                    	        newCompositeNode(grammarAccess.getContextAccess().getAnnotationsAnnotationParserRuleCall_8_2_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleAnnotation_in_ruleContext414);
                    lv_annotations_17_0=ruleAnnotation();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getContextRule());
                    	        }
                           		add(
                           			current, 
                           			"annotations",
                            		lv_annotations_17_0, 
                            		"Annotation");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../ac.soton.xtext.context.dsl/src-gen/ac/soton/xtext/context/dsl/parser/antlr/internal/InternalContextDsl.g:244:2: (otherlv_18= ',' ( (lv_annotations_19_0= ruleAnnotation ) ) )*
                    loop6:
                    do {
                        int alt6=2;
                        int LA6_0 = input.LA(1);

                        if ( (LA6_0==18) ) {
                            alt6=1;
                        }


                        switch (alt6) {
                    	case 1 :
                    	    // ../ac.soton.xtext.context.dsl/src-gen/ac/soton/xtext/context/dsl/parser/antlr/internal/InternalContextDsl.g:244:4: otherlv_18= ',' ( (lv_annotations_19_0= ruleAnnotation ) )
                    	    {
                    	    otherlv_18=(Token)match(input,18,FollowSets000.FOLLOW_18_in_ruleContext427); 

                    	        	newLeafNode(otherlv_18, grammarAccess.getContextAccess().getCommaKeyword_8_3_0());
                    	        
                    	    // ../ac.soton.xtext.context.dsl/src-gen/ac/soton/xtext/context/dsl/parser/antlr/internal/InternalContextDsl.g:248:1: ( (lv_annotations_19_0= ruleAnnotation ) )
                    	    // ../ac.soton.xtext.context.dsl/src-gen/ac/soton/xtext/context/dsl/parser/antlr/internal/InternalContextDsl.g:249:1: (lv_annotations_19_0= ruleAnnotation )
                    	    {
                    	    // ../ac.soton.xtext.context.dsl/src-gen/ac/soton/xtext/context/dsl/parser/antlr/internal/InternalContextDsl.g:249:1: (lv_annotations_19_0= ruleAnnotation )
                    	    // ../ac.soton.xtext.context.dsl/src-gen/ac/soton/xtext/context/dsl/parser/antlr/internal/InternalContextDsl.g:250:3: lv_annotations_19_0= ruleAnnotation
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getContextAccess().getAnnotationsAnnotationParserRuleCall_8_3_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleAnnotation_in_ruleContext448);
                    	    lv_annotations_19_0=ruleAnnotation();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getContextRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"annotations",
                    	            		lv_annotations_19_0, 
                    	            		"Annotation");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop6;
                        }
                    } while (true);

                    otherlv_20=(Token)match(input,21,FollowSets000.FOLLOW_21_in_ruleContext462); 

                        	newLeafNode(otherlv_20, grammarAccess.getContextAccess().getRightCurlyBracketKeyword_8_4());
                        

                    }
                    break;

            }

            // ../ac.soton.xtext.context.dsl/src-gen/ac/soton/xtext/context/dsl/parser/antlr/internal/InternalContextDsl.g:270:3: (otherlv_21= 'extensions' otherlv_22= '{' ( (lv_extensions_23_0= ruleAbstractExtension ) ) (otherlv_24= ',' ( (lv_extensions_25_0= ruleAbstractExtension ) ) )* otherlv_26= '}' )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==22) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // ../ac.soton.xtext.context.dsl/src-gen/ac/soton/xtext/context/dsl/parser/antlr/internal/InternalContextDsl.g:270:5: otherlv_21= 'extensions' otherlv_22= '{' ( (lv_extensions_23_0= ruleAbstractExtension ) ) (otherlv_24= ',' ( (lv_extensions_25_0= ruleAbstractExtension ) ) )* otherlv_26= '}'
                    {
                    otherlv_21=(Token)match(input,22,FollowSets000.FOLLOW_22_in_ruleContext477); 

                        	newLeafNode(otherlv_21, grammarAccess.getContextAccess().getExtensionsKeyword_9_0());
                        
                    otherlv_22=(Token)match(input,13,FollowSets000.FOLLOW_13_in_ruleContext489); 

                        	newLeafNode(otherlv_22, grammarAccess.getContextAccess().getLeftCurlyBracketKeyword_9_1());
                        
                    // ../ac.soton.xtext.context.dsl/src-gen/ac/soton/xtext/context/dsl/parser/antlr/internal/InternalContextDsl.g:278:1: ( (lv_extensions_23_0= ruleAbstractExtension ) )
                    // ../ac.soton.xtext.context.dsl/src-gen/ac/soton/xtext/context/dsl/parser/antlr/internal/InternalContextDsl.g:279:1: (lv_extensions_23_0= ruleAbstractExtension )
                    {
                    // ../ac.soton.xtext.context.dsl/src-gen/ac/soton/xtext/context/dsl/parser/antlr/internal/InternalContextDsl.g:279:1: (lv_extensions_23_0= ruleAbstractExtension )
                    // ../ac.soton.xtext.context.dsl/src-gen/ac/soton/xtext/context/dsl/parser/antlr/internal/InternalContextDsl.g:280:3: lv_extensions_23_0= ruleAbstractExtension
                    {
                     
                    	        newCompositeNode(grammarAccess.getContextAccess().getExtensionsAbstractExtensionParserRuleCall_9_2_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleAbstractExtension_in_ruleContext510);
                    lv_extensions_23_0=ruleAbstractExtension();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getContextRule());
                    	        }
                           		add(
                           			current, 
                           			"extensions",
                            		lv_extensions_23_0, 
                            		"AbstractExtension");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../ac.soton.xtext.context.dsl/src-gen/ac/soton/xtext/context/dsl/parser/antlr/internal/InternalContextDsl.g:296:2: (otherlv_24= ',' ( (lv_extensions_25_0= ruleAbstractExtension ) ) )*
                    loop8:
                    do {
                        int alt8=2;
                        int LA8_0 = input.LA(1);

                        if ( (LA8_0==18) ) {
                            alt8=1;
                        }


                        switch (alt8) {
                    	case 1 :
                    	    // ../ac.soton.xtext.context.dsl/src-gen/ac/soton/xtext/context/dsl/parser/antlr/internal/InternalContextDsl.g:296:4: otherlv_24= ',' ( (lv_extensions_25_0= ruleAbstractExtension ) )
                    	    {
                    	    otherlv_24=(Token)match(input,18,FollowSets000.FOLLOW_18_in_ruleContext523); 

                    	        	newLeafNode(otherlv_24, grammarAccess.getContextAccess().getCommaKeyword_9_3_0());
                    	        
                    	    // ../ac.soton.xtext.context.dsl/src-gen/ac/soton/xtext/context/dsl/parser/antlr/internal/InternalContextDsl.g:300:1: ( (lv_extensions_25_0= ruleAbstractExtension ) )
                    	    // ../ac.soton.xtext.context.dsl/src-gen/ac/soton/xtext/context/dsl/parser/antlr/internal/InternalContextDsl.g:301:1: (lv_extensions_25_0= ruleAbstractExtension )
                    	    {
                    	    // ../ac.soton.xtext.context.dsl/src-gen/ac/soton/xtext/context/dsl/parser/antlr/internal/InternalContextDsl.g:301:1: (lv_extensions_25_0= ruleAbstractExtension )
                    	    // ../ac.soton.xtext.context.dsl/src-gen/ac/soton/xtext/context/dsl/parser/antlr/internal/InternalContextDsl.g:302:3: lv_extensions_25_0= ruleAbstractExtension
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getContextAccess().getExtensionsAbstractExtensionParserRuleCall_9_3_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleAbstractExtension_in_ruleContext544);
                    	    lv_extensions_25_0=ruleAbstractExtension();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getContextRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"extensions",
                    	            		lv_extensions_25_0, 
                    	            		"AbstractExtension");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop8;
                        }
                    } while (true);

                    otherlv_26=(Token)match(input,21,FollowSets000.FOLLOW_21_in_ruleContext558); 

                        	newLeafNode(otherlv_26, grammarAccess.getContextAccess().getRightCurlyBracketKeyword_9_4());
                        

                    }
                    break;

            }

            // ../ac.soton.xtext.context.dsl/src-gen/ac/soton/xtext/context/dsl/parser/antlr/internal/InternalContextDsl.g:322:3: (otherlv_27= 'attributes' otherlv_28= '{' ( (lv_attributes_29_0= ruleStringToAttributeMapEntry ) ) (otherlv_30= ',' ( (lv_attributes_31_0= ruleStringToAttributeMapEntry ) ) )* otherlv_32= '}' )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==23) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // ../ac.soton.xtext.context.dsl/src-gen/ac/soton/xtext/context/dsl/parser/antlr/internal/InternalContextDsl.g:322:5: otherlv_27= 'attributes' otherlv_28= '{' ( (lv_attributes_29_0= ruleStringToAttributeMapEntry ) ) (otherlv_30= ',' ( (lv_attributes_31_0= ruleStringToAttributeMapEntry ) ) )* otherlv_32= '}'
                    {
                    otherlv_27=(Token)match(input,23,FollowSets000.FOLLOW_23_in_ruleContext573); 

                        	newLeafNode(otherlv_27, grammarAccess.getContextAccess().getAttributesKeyword_10_0());
                        
                    otherlv_28=(Token)match(input,13,FollowSets000.FOLLOW_13_in_ruleContext585); 

                        	newLeafNode(otherlv_28, grammarAccess.getContextAccess().getLeftCurlyBracketKeyword_10_1());
                        
                    // ../ac.soton.xtext.context.dsl/src-gen/ac/soton/xtext/context/dsl/parser/antlr/internal/InternalContextDsl.g:330:1: ( (lv_attributes_29_0= ruleStringToAttributeMapEntry ) )
                    // ../ac.soton.xtext.context.dsl/src-gen/ac/soton/xtext/context/dsl/parser/antlr/internal/InternalContextDsl.g:331:1: (lv_attributes_29_0= ruleStringToAttributeMapEntry )
                    {
                    // ../ac.soton.xtext.context.dsl/src-gen/ac/soton/xtext/context/dsl/parser/antlr/internal/InternalContextDsl.g:331:1: (lv_attributes_29_0= ruleStringToAttributeMapEntry )
                    // ../ac.soton.xtext.context.dsl/src-gen/ac/soton/xtext/context/dsl/parser/antlr/internal/InternalContextDsl.g:332:3: lv_attributes_29_0= ruleStringToAttributeMapEntry
                    {
                     
                    	        newCompositeNode(grammarAccess.getContextAccess().getAttributesStringToAttributeMapEntryParserRuleCall_10_2_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleStringToAttributeMapEntry_in_ruleContext606);
                    lv_attributes_29_0=ruleStringToAttributeMapEntry();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getContextRule());
                    	        }
                           		add(
                           			current, 
                           			"attributes",
                            		lv_attributes_29_0, 
                            		"StringToAttributeMapEntry");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../ac.soton.xtext.context.dsl/src-gen/ac/soton/xtext/context/dsl/parser/antlr/internal/InternalContextDsl.g:348:2: (otherlv_30= ',' ( (lv_attributes_31_0= ruleStringToAttributeMapEntry ) ) )*
                    loop10:
                    do {
                        int alt10=2;
                        int LA10_0 = input.LA(1);

                        if ( (LA10_0==18) ) {
                            alt10=1;
                        }


                        switch (alt10) {
                    	case 1 :
                    	    // ../ac.soton.xtext.context.dsl/src-gen/ac/soton/xtext/context/dsl/parser/antlr/internal/InternalContextDsl.g:348:4: otherlv_30= ',' ( (lv_attributes_31_0= ruleStringToAttributeMapEntry ) )
                    	    {
                    	    otherlv_30=(Token)match(input,18,FollowSets000.FOLLOW_18_in_ruleContext619); 

                    	        	newLeafNode(otherlv_30, grammarAccess.getContextAccess().getCommaKeyword_10_3_0());
                    	        
                    	    // ../ac.soton.xtext.context.dsl/src-gen/ac/soton/xtext/context/dsl/parser/antlr/internal/InternalContextDsl.g:352:1: ( (lv_attributes_31_0= ruleStringToAttributeMapEntry ) )
                    	    // ../ac.soton.xtext.context.dsl/src-gen/ac/soton/xtext/context/dsl/parser/antlr/internal/InternalContextDsl.g:353:1: (lv_attributes_31_0= ruleStringToAttributeMapEntry )
                    	    {
                    	    // ../ac.soton.xtext.context.dsl/src-gen/ac/soton/xtext/context/dsl/parser/antlr/internal/InternalContextDsl.g:353:1: (lv_attributes_31_0= ruleStringToAttributeMapEntry )
                    	    // ../ac.soton.xtext.context.dsl/src-gen/ac/soton/xtext/context/dsl/parser/antlr/internal/InternalContextDsl.g:354:3: lv_attributes_31_0= ruleStringToAttributeMapEntry
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getContextAccess().getAttributesStringToAttributeMapEntryParserRuleCall_10_3_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleStringToAttributeMapEntry_in_ruleContext640);
                    	    lv_attributes_31_0=ruleStringToAttributeMapEntry();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getContextRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"attributes",
                    	            		lv_attributes_31_0, 
                    	            		"StringToAttributeMapEntry");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop10;
                        }
                    } while (true);

                    otherlv_32=(Token)match(input,21,FollowSets000.FOLLOW_21_in_ruleContext654); 

                        	newLeafNode(otherlv_32, grammarAccess.getContextAccess().getRightCurlyBracketKeyword_10_4());
                        

                    }
                    break;

            }

            // ../ac.soton.xtext.context.dsl/src-gen/ac/soton/xtext/context/dsl/parser/antlr/internal/InternalContextDsl.g:374:3: (otherlv_33= 'sets' otherlv_34= '{' ( (lv_sets_35_0= ruleCarrierSet ) ) (otherlv_36= ',' ( (lv_sets_37_0= ruleCarrierSet ) ) )* otherlv_38= '}' )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==24) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // ../ac.soton.xtext.context.dsl/src-gen/ac/soton/xtext/context/dsl/parser/antlr/internal/InternalContextDsl.g:374:5: otherlv_33= 'sets' otherlv_34= '{' ( (lv_sets_35_0= ruleCarrierSet ) ) (otherlv_36= ',' ( (lv_sets_37_0= ruleCarrierSet ) ) )* otherlv_38= '}'
                    {
                    otherlv_33=(Token)match(input,24,FollowSets000.FOLLOW_24_in_ruleContext669); 

                        	newLeafNode(otherlv_33, grammarAccess.getContextAccess().getSetsKeyword_11_0());
                        
                    otherlv_34=(Token)match(input,13,FollowSets000.FOLLOW_13_in_ruleContext681); 

                        	newLeafNode(otherlv_34, grammarAccess.getContextAccess().getLeftCurlyBracketKeyword_11_1());
                        
                    // ../ac.soton.xtext.context.dsl/src-gen/ac/soton/xtext/context/dsl/parser/antlr/internal/InternalContextDsl.g:382:1: ( (lv_sets_35_0= ruleCarrierSet ) )
                    // ../ac.soton.xtext.context.dsl/src-gen/ac/soton/xtext/context/dsl/parser/antlr/internal/InternalContextDsl.g:383:1: (lv_sets_35_0= ruleCarrierSet )
                    {
                    // ../ac.soton.xtext.context.dsl/src-gen/ac/soton/xtext/context/dsl/parser/antlr/internal/InternalContextDsl.g:383:1: (lv_sets_35_0= ruleCarrierSet )
                    // ../ac.soton.xtext.context.dsl/src-gen/ac/soton/xtext/context/dsl/parser/antlr/internal/InternalContextDsl.g:384:3: lv_sets_35_0= ruleCarrierSet
                    {
                     
                    	        newCompositeNode(grammarAccess.getContextAccess().getSetsCarrierSetParserRuleCall_11_2_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleCarrierSet_in_ruleContext702);
                    lv_sets_35_0=ruleCarrierSet();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getContextRule());
                    	        }
                           		add(
                           			current, 
                           			"sets",
                            		lv_sets_35_0, 
                            		"CarrierSet");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../ac.soton.xtext.context.dsl/src-gen/ac/soton/xtext/context/dsl/parser/antlr/internal/InternalContextDsl.g:400:2: (otherlv_36= ',' ( (lv_sets_37_0= ruleCarrierSet ) ) )*
                    loop12:
                    do {
                        int alt12=2;
                        int LA12_0 = input.LA(1);

                        if ( (LA12_0==18) ) {
                            alt12=1;
                        }


                        switch (alt12) {
                    	case 1 :
                    	    // ../ac.soton.xtext.context.dsl/src-gen/ac/soton/xtext/context/dsl/parser/antlr/internal/InternalContextDsl.g:400:4: otherlv_36= ',' ( (lv_sets_37_0= ruleCarrierSet ) )
                    	    {
                    	    otherlv_36=(Token)match(input,18,FollowSets000.FOLLOW_18_in_ruleContext715); 

                    	        	newLeafNode(otherlv_36, grammarAccess.getContextAccess().getCommaKeyword_11_3_0());
                    	        
                    	    // ../ac.soton.xtext.context.dsl/src-gen/ac/soton/xtext/context/dsl/parser/antlr/internal/InternalContextDsl.g:404:1: ( (lv_sets_37_0= ruleCarrierSet ) )
                    	    // ../ac.soton.xtext.context.dsl/src-gen/ac/soton/xtext/context/dsl/parser/antlr/internal/InternalContextDsl.g:405:1: (lv_sets_37_0= ruleCarrierSet )
                    	    {
                    	    // ../ac.soton.xtext.context.dsl/src-gen/ac/soton/xtext/context/dsl/parser/antlr/internal/InternalContextDsl.g:405:1: (lv_sets_37_0= ruleCarrierSet )
                    	    // ../ac.soton.xtext.context.dsl/src-gen/ac/soton/xtext/context/dsl/parser/antlr/internal/InternalContextDsl.g:406:3: lv_sets_37_0= ruleCarrierSet
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getContextAccess().getSetsCarrierSetParserRuleCall_11_3_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleCarrierSet_in_ruleContext736);
                    	    lv_sets_37_0=ruleCarrierSet();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getContextRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"sets",
                    	            		lv_sets_37_0, 
                    	            		"CarrierSet");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop12;
                        }
                    } while (true);

                    otherlv_38=(Token)match(input,21,FollowSets000.FOLLOW_21_in_ruleContext750); 

                        	newLeafNode(otherlv_38, grammarAccess.getContextAccess().getRightCurlyBracketKeyword_11_4());
                        

                    }
                    break;

            }

            // ../ac.soton.xtext.context.dsl/src-gen/ac/soton/xtext/context/dsl/parser/antlr/internal/InternalContextDsl.g:426:3: (otherlv_39= 'constants' otherlv_40= '{' ( (lv_constants_41_0= ruleConstant ) ) (otherlv_42= ',' ( (lv_constants_43_0= ruleConstant ) ) )* otherlv_44= '}' )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==25) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // ../ac.soton.xtext.context.dsl/src-gen/ac/soton/xtext/context/dsl/parser/antlr/internal/InternalContextDsl.g:426:5: otherlv_39= 'constants' otherlv_40= '{' ( (lv_constants_41_0= ruleConstant ) ) (otherlv_42= ',' ( (lv_constants_43_0= ruleConstant ) ) )* otherlv_44= '}'
                    {
                    otherlv_39=(Token)match(input,25,FollowSets000.FOLLOW_25_in_ruleContext765); 

                        	newLeafNode(otherlv_39, grammarAccess.getContextAccess().getConstantsKeyword_12_0());
                        
                    otherlv_40=(Token)match(input,13,FollowSets000.FOLLOW_13_in_ruleContext777); 

                        	newLeafNode(otherlv_40, grammarAccess.getContextAccess().getLeftCurlyBracketKeyword_12_1());
                        
                    // ../ac.soton.xtext.context.dsl/src-gen/ac/soton/xtext/context/dsl/parser/antlr/internal/InternalContextDsl.g:434:1: ( (lv_constants_41_0= ruleConstant ) )
                    // ../ac.soton.xtext.context.dsl/src-gen/ac/soton/xtext/context/dsl/parser/antlr/internal/InternalContextDsl.g:435:1: (lv_constants_41_0= ruleConstant )
                    {
                    // ../ac.soton.xtext.context.dsl/src-gen/ac/soton/xtext/context/dsl/parser/antlr/internal/InternalContextDsl.g:435:1: (lv_constants_41_0= ruleConstant )
                    // ../ac.soton.xtext.context.dsl/src-gen/ac/soton/xtext/context/dsl/parser/antlr/internal/InternalContextDsl.g:436:3: lv_constants_41_0= ruleConstant
                    {
                     
                    	        newCompositeNode(grammarAccess.getContextAccess().getConstantsConstantParserRuleCall_12_2_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleConstant_in_ruleContext798);
                    lv_constants_41_0=ruleConstant();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getContextRule());
                    	        }
                           		add(
                           			current, 
                           			"constants",
                            		lv_constants_41_0, 
                            		"Constant");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../ac.soton.xtext.context.dsl/src-gen/ac/soton/xtext/context/dsl/parser/antlr/internal/InternalContextDsl.g:452:2: (otherlv_42= ',' ( (lv_constants_43_0= ruleConstant ) ) )*
                    loop14:
                    do {
                        int alt14=2;
                        int LA14_0 = input.LA(1);

                        if ( (LA14_0==18) ) {
                            alt14=1;
                        }


                        switch (alt14) {
                    	case 1 :
                    	    // ../ac.soton.xtext.context.dsl/src-gen/ac/soton/xtext/context/dsl/parser/antlr/internal/InternalContextDsl.g:452:4: otherlv_42= ',' ( (lv_constants_43_0= ruleConstant ) )
                    	    {
                    	    otherlv_42=(Token)match(input,18,FollowSets000.FOLLOW_18_in_ruleContext811); 

                    	        	newLeafNode(otherlv_42, grammarAccess.getContextAccess().getCommaKeyword_12_3_0());
                    	        
                    	    // ../ac.soton.xtext.context.dsl/src-gen/ac/soton/xtext/context/dsl/parser/antlr/internal/InternalContextDsl.g:456:1: ( (lv_constants_43_0= ruleConstant ) )
                    	    // ../ac.soton.xtext.context.dsl/src-gen/ac/soton/xtext/context/dsl/parser/antlr/internal/InternalContextDsl.g:457:1: (lv_constants_43_0= ruleConstant )
                    	    {
                    	    // ../ac.soton.xtext.context.dsl/src-gen/ac/soton/xtext/context/dsl/parser/antlr/internal/InternalContextDsl.g:457:1: (lv_constants_43_0= ruleConstant )
                    	    // ../ac.soton.xtext.context.dsl/src-gen/ac/soton/xtext/context/dsl/parser/antlr/internal/InternalContextDsl.g:458:3: lv_constants_43_0= ruleConstant
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getContextAccess().getConstantsConstantParserRuleCall_12_3_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleConstant_in_ruleContext832);
                    	    lv_constants_43_0=ruleConstant();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getContextRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"constants",
                    	            		lv_constants_43_0, 
                    	            		"Constant");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop14;
                        }
                    } while (true);

                    otherlv_44=(Token)match(input,21,FollowSets000.FOLLOW_21_in_ruleContext846); 

                        	newLeafNode(otherlv_44, grammarAccess.getContextAccess().getRightCurlyBracketKeyword_12_4());
                        

                    }
                    break;

            }

            // ../ac.soton.xtext.context.dsl/src-gen/ac/soton/xtext/context/dsl/parser/antlr/internal/InternalContextDsl.g:478:3: (otherlv_45= 'axioms' otherlv_46= '{' ( (lv_axioms_47_0= ruleAxiom ) ) (otherlv_48= ',' ( (lv_axioms_49_0= ruleAxiom ) ) )* otherlv_50= '}' )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==26) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // ../ac.soton.xtext.context.dsl/src-gen/ac/soton/xtext/context/dsl/parser/antlr/internal/InternalContextDsl.g:478:5: otherlv_45= 'axioms' otherlv_46= '{' ( (lv_axioms_47_0= ruleAxiom ) ) (otherlv_48= ',' ( (lv_axioms_49_0= ruleAxiom ) ) )* otherlv_50= '}'
                    {
                    otherlv_45=(Token)match(input,26,FollowSets000.FOLLOW_26_in_ruleContext861); 

                        	newLeafNode(otherlv_45, grammarAccess.getContextAccess().getAxiomsKeyword_13_0());
                        
                    otherlv_46=(Token)match(input,13,FollowSets000.FOLLOW_13_in_ruleContext873); 

                        	newLeafNode(otherlv_46, grammarAccess.getContextAccess().getLeftCurlyBracketKeyword_13_1());
                        
                    // ../ac.soton.xtext.context.dsl/src-gen/ac/soton/xtext/context/dsl/parser/antlr/internal/InternalContextDsl.g:486:1: ( (lv_axioms_47_0= ruleAxiom ) )
                    // ../ac.soton.xtext.context.dsl/src-gen/ac/soton/xtext/context/dsl/parser/antlr/internal/InternalContextDsl.g:487:1: (lv_axioms_47_0= ruleAxiom )
                    {
                    // ../ac.soton.xtext.context.dsl/src-gen/ac/soton/xtext/context/dsl/parser/antlr/internal/InternalContextDsl.g:487:1: (lv_axioms_47_0= ruleAxiom )
                    // ../ac.soton.xtext.context.dsl/src-gen/ac/soton/xtext/context/dsl/parser/antlr/internal/InternalContextDsl.g:488:3: lv_axioms_47_0= ruleAxiom
                    {
                     
                    	        newCompositeNode(grammarAccess.getContextAccess().getAxiomsAxiomParserRuleCall_13_2_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleAxiom_in_ruleContext894);
                    lv_axioms_47_0=ruleAxiom();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getContextRule());
                    	        }
                           		add(
                           			current, 
                           			"axioms",
                            		lv_axioms_47_0, 
                            		"Axiom");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../ac.soton.xtext.context.dsl/src-gen/ac/soton/xtext/context/dsl/parser/antlr/internal/InternalContextDsl.g:504:2: (otherlv_48= ',' ( (lv_axioms_49_0= ruleAxiom ) ) )*
                    loop16:
                    do {
                        int alt16=2;
                        int LA16_0 = input.LA(1);

                        if ( (LA16_0==18) ) {
                            alt16=1;
                        }


                        switch (alt16) {
                    	case 1 :
                    	    // ../ac.soton.xtext.context.dsl/src-gen/ac/soton/xtext/context/dsl/parser/antlr/internal/InternalContextDsl.g:504:4: otherlv_48= ',' ( (lv_axioms_49_0= ruleAxiom ) )
                    	    {
                    	    otherlv_48=(Token)match(input,18,FollowSets000.FOLLOW_18_in_ruleContext907); 

                    	        	newLeafNode(otherlv_48, grammarAccess.getContextAccess().getCommaKeyword_13_3_0());
                    	        
                    	    // ../ac.soton.xtext.context.dsl/src-gen/ac/soton/xtext/context/dsl/parser/antlr/internal/InternalContextDsl.g:508:1: ( (lv_axioms_49_0= ruleAxiom ) )
                    	    // ../ac.soton.xtext.context.dsl/src-gen/ac/soton/xtext/context/dsl/parser/antlr/internal/InternalContextDsl.g:509:1: (lv_axioms_49_0= ruleAxiom )
                    	    {
                    	    // ../ac.soton.xtext.context.dsl/src-gen/ac/soton/xtext/context/dsl/parser/antlr/internal/InternalContextDsl.g:509:1: (lv_axioms_49_0= ruleAxiom )
                    	    // ../ac.soton.xtext.context.dsl/src-gen/ac/soton/xtext/context/dsl/parser/antlr/internal/InternalContextDsl.g:510:3: lv_axioms_49_0= ruleAxiom
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getContextAccess().getAxiomsAxiomParserRuleCall_13_3_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleAxiom_in_ruleContext928);
                    	    lv_axioms_49_0=ruleAxiom();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getContextRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"axioms",
                    	            		lv_axioms_49_0, 
                    	            		"Axiom");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop16;
                        }
                    } while (true);

                    otherlv_50=(Token)match(input,21,FollowSets000.FOLLOW_21_in_ruleContext942); 

                        	newLeafNode(otherlv_50, grammarAccess.getContextAccess().getRightCurlyBracketKeyword_13_4());
                        

                    }
                    break;

            }

            otherlv_51=(Token)match(input,21,FollowSets000.FOLLOW_21_in_ruleContext956); 

                	newLeafNode(otherlv_51, grammarAccess.getContextAccess().getRightCurlyBracketKeyword_14());
                

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
    // $ANTLR end "ruleContext"


    // $ANTLR start "entryRuleAbstractExtension"
    // ../ac.soton.xtext.context.dsl/src-gen/ac/soton/xtext/context/dsl/parser/antlr/internal/InternalContextDsl.g:542:1: entryRuleAbstractExtension returns [EObject current=null] : iv_ruleAbstractExtension= ruleAbstractExtension EOF ;
    public final EObject entryRuleAbstractExtension() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAbstractExtension = null;


        try {
            // ../ac.soton.xtext.context.dsl/src-gen/ac/soton/xtext/context/dsl/parser/antlr/internal/InternalContextDsl.g:543:2: (iv_ruleAbstractExtension= ruleAbstractExtension EOF )
            // ../ac.soton.xtext.context.dsl/src-gen/ac/soton/xtext/context/dsl/parser/antlr/internal/InternalContextDsl.g:544:2: iv_ruleAbstractExtension= ruleAbstractExtension EOF
            {
             newCompositeNode(grammarAccess.getAbstractExtensionRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleAbstractExtension_in_entryRuleAbstractExtension992);
            iv_ruleAbstractExtension=ruleAbstractExtension();

            state._fsp--;

             current =iv_ruleAbstractExtension; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleAbstractExtension1002); 

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
    // ../ac.soton.xtext.context.dsl/src-gen/ac/soton/xtext/context/dsl/parser/antlr/internal/InternalContextDsl.g:551:1: ruleAbstractExtension returns [EObject current=null] : this_Extension_0= ruleExtension ;
    public final EObject ruleAbstractExtension() throws RecognitionException {
        EObject current = null;

        EObject this_Extension_0 = null;


         enterRule(); 
            
        try {
            // ../ac.soton.xtext.context.dsl/src-gen/ac/soton/xtext/context/dsl/parser/antlr/internal/InternalContextDsl.g:554:28: (this_Extension_0= ruleExtension )
            // ../ac.soton.xtext.context.dsl/src-gen/ac/soton/xtext/context/dsl/parser/antlr/internal/InternalContextDsl.g:556:5: this_Extension_0= ruleExtension
            {
             
                    newCompositeNode(grammarAccess.getAbstractExtensionAccess().getExtensionParserRuleCall()); 
                
            pushFollow(FollowSets000.FOLLOW_ruleExtension_in_ruleAbstractExtension1048);
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
    // ../ac.soton.xtext.context.dsl/src-gen/ac/soton/xtext/context/dsl/parser/antlr/internal/InternalContextDsl.g:572:1: entryRuleAnnotation returns [EObject current=null] : iv_ruleAnnotation= ruleAnnotation EOF ;
    public final EObject entryRuleAnnotation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAnnotation = null;


        try {
            // ../ac.soton.xtext.context.dsl/src-gen/ac/soton/xtext/context/dsl/parser/antlr/internal/InternalContextDsl.g:573:2: (iv_ruleAnnotation= ruleAnnotation EOF )
            // ../ac.soton.xtext.context.dsl/src-gen/ac/soton/xtext/context/dsl/parser/antlr/internal/InternalContextDsl.g:574:2: iv_ruleAnnotation= ruleAnnotation EOF
            {
             newCompositeNode(grammarAccess.getAnnotationRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleAnnotation_in_entryRuleAnnotation1082);
            iv_ruleAnnotation=ruleAnnotation();

            state._fsp--;

             current =iv_ruleAnnotation; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleAnnotation1092); 

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
    // ../ac.soton.xtext.context.dsl/src-gen/ac/soton/xtext/context/dsl/parser/antlr/internal/InternalContextDsl.g:581:1: ruleAnnotation returns [EObject current=null] : ( () otherlv_1= 'Annotation' otherlv_2= '{' (otherlv_3= 'source' ( (lv_source_4_0= ruleEString ) ) )? (otherlv_5= 'references' otherlv_6= '(' ( ( ruleEString ) ) (otherlv_8= ',' ( ( ruleEString ) ) )* otherlv_10= ')' )? (otherlv_11= 'annotations' otherlv_12= '{' ( (lv_annotations_13_0= ruleAnnotation ) ) (otherlv_14= ',' ( (lv_annotations_15_0= ruleAnnotation ) ) )* otherlv_16= '}' )? (otherlv_17= 'details' otherlv_18= '{' ( (lv_details_19_0= ruleStringToStringMapEntry ) ) (otherlv_20= ',' ( (lv_details_21_0= ruleStringToStringMapEntry ) ) )* otherlv_22= '}' )? (otherlv_23= 'contents' otherlv_24= '{' ( (lv_contents_25_0= ruleEObject ) ) (otherlv_26= ',' ( (lv_contents_27_0= ruleEObject ) ) )* otherlv_28= '}' )? otherlv_29= '}' ) ;
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
            // ../ac.soton.xtext.context.dsl/src-gen/ac/soton/xtext/context/dsl/parser/antlr/internal/InternalContextDsl.g:584:28: ( ( () otherlv_1= 'Annotation' otherlv_2= '{' (otherlv_3= 'source' ( (lv_source_4_0= ruleEString ) ) )? (otherlv_5= 'references' otherlv_6= '(' ( ( ruleEString ) ) (otherlv_8= ',' ( ( ruleEString ) ) )* otherlv_10= ')' )? (otherlv_11= 'annotations' otherlv_12= '{' ( (lv_annotations_13_0= ruleAnnotation ) ) (otherlv_14= ',' ( (lv_annotations_15_0= ruleAnnotation ) ) )* otherlv_16= '}' )? (otherlv_17= 'details' otherlv_18= '{' ( (lv_details_19_0= ruleStringToStringMapEntry ) ) (otherlv_20= ',' ( (lv_details_21_0= ruleStringToStringMapEntry ) ) )* otherlv_22= '}' )? (otherlv_23= 'contents' otherlv_24= '{' ( (lv_contents_25_0= ruleEObject ) ) (otherlv_26= ',' ( (lv_contents_27_0= ruleEObject ) ) )* otherlv_28= '}' )? otherlv_29= '}' ) )
            // ../ac.soton.xtext.context.dsl/src-gen/ac/soton/xtext/context/dsl/parser/antlr/internal/InternalContextDsl.g:585:1: ( () otherlv_1= 'Annotation' otherlv_2= '{' (otherlv_3= 'source' ( (lv_source_4_0= ruleEString ) ) )? (otherlv_5= 'references' otherlv_6= '(' ( ( ruleEString ) ) (otherlv_8= ',' ( ( ruleEString ) ) )* otherlv_10= ')' )? (otherlv_11= 'annotations' otherlv_12= '{' ( (lv_annotations_13_0= ruleAnnotation ) ) (otherlv_14= ',' ( (lv_annotations_15_0= ruleAnnotation ) ) )* otherlv_16= '}' )? (otherlv_17= 'details' otherlv_18= '{' ( (lv_details_19_0= ruleStringToStringMapEntry ) ) (otherlv_20= ',' ( (lv_details_21_0= ruleStringToStringMapEntry ) ) )* otherlv_22= '}' )? (otherlv_23= 'contents' otherlv_24= '{' ( (lv_contents_25_0= ruleEObject ) ) (otherlv_26= ',' ( (lv_contents_27_0= ruleEObject ) ) )* otherlv_28= '}' )? otherlv_29= '}' )
            {
            // ../ac.soton.xtext.context.dsl/src-gen/ac/soton/xtext/context/dsl/parser/antlr/internal/InternalContextDsl.g:585:1: ( () otherlv_1= 'Annotation' otherlv_2= '{' (otherlv_3= 'source' ( (lv_source_4_0= ruleEString ) ) )? (otherlv_5= 'references' otherlv_6= '(' ( ( ruleEString ) ) (otherlv_8= ',' ( ( ruleEString ) ) )* otherlv_10= ')' )? (otherlv_11= 'annotations' otherlv_12= '{' ( (lv_annotations_13_0= ruleAnnotation ) ) (otherlv_14= ',' ( (lv_annotations_15_0= ruleAnnotation ) ) )* otherlv_16= '}' )? (otherlv_17= 'details' otherlv_18= '{' ( (lv_details_19_0= ruleStringToStringMapEntry ) ) (otherlv_20= ',' ( (lv_details_21_0= ruleStringToStringMapEntry ) ) )* otherlv_22= '}' )? (otherlv_23= 'contents' otherlv_24= '{' ( (lv_contents_25_0= ruleEObject ) ) (otherlv_26= ',' ( (lv_contents_27_0= ruleEObject ) ) )* otherlv_28= '}' )? otherlv_29= '}' )
            // ../ac.soton.xtext.context.dsl/src-gen/ac/soton/xtext/context/dsl/parser/antlr/internal/InternalContextDsl.g:585:2: () otherlv_1= 'Annotation' otherlv_2= '{' (otherlv_3= 'source' ( (lv_source_4_0= ruleEString ) ) )? (otherlv_5= 'references' otherlv_6= '(' ( ( ruleEString ) ) (otherlv_8= ',' ( ( ruleEString ) ) )* otherlv_10= ')' )? (otherlv_11= 'annotations' otherlv_12= '{' ( (lv_annotations_13_0= ruleAnnotation ) ) (otherlv_14= ',' ( (lv_annotations_15_0= ruleAnnotation ) ) )* otherlv_16= '}' )? (otherlv_17= 'details' otherlv_18= '{' ( (lv_details_19_0= ruleStringToStringMapEntry ) ) (otherlv_20= ',' ( (lv_details_21_0= ruleStringToStringMapEntry ) ) )* otherlv_22= '}' )? (otherlv_23= 'contents' otherlv_24= '{' ( (lv_contents_25_0= ruleEObject ) ) (otherlv_26= ',' ( (lv_contents_27_0= ruleEObject ) ) )* otherlv_28= '}' )? otherlv_29= '}'
            {
            // ../ac.soton.xtext.context.dsl/src-gen/ac/soton/xtext/context/dsl/parser/antlr/internal/InternalContextDsl.g:585:2: ()
            // ../ac.soton.xtext.context.dsl/src-gen/ac/soton/xtext/context/dsl/parser/antlr/internal/InternalContextDsl.g:586:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getAnnotationAccess().getAnnotationAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,27,FollowSets000.FOLLOW_27_in_ruleAnnotation1138); 

                	newLeafNode(otherlv_1, grammarAccess.getAnnotationAccess().getAnnotationKeyword_1());
                
            otherlv_2=(Token)match(input,13,FollowSets000.FOLLOW_13_in_ruleAnnotation1150); 

                	newLeafNode(otherlv_2, grammarAccess.getAnnotationAccess().getLeftCurlyBracketKeyword_2());
                
            // ../ac.soton.xtext.context.dsl/src-gen/ac/soton/xtext/context/dsl/parser/antlr/internal/InternalContextDsl.g:599:1: (otherlv_3= 'source' ( (lv_source_4_0= ruleEString ) ) )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==28) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // ../ac.soton.xtext.context.dsl/src-gen/ac/soton/xtext/context/dsl/parser/antlr/internal/InternalContextDsl.g:599:3: otherlv_3= 'source' ( (lv_source_4_0= ruleEString ) )
                    {
                    otherlv_3=(Token)match(input,28,FollowSets000.FOLLOW_28_in_ruleAnnotation1163); 

                        	newLeafNode(otherlv_3, grammarAccess.getAnnotationAccess().getSourceKeyword_3_0());
                        
                    // ../ac.soton.xtext.context.dsl/src-gen/ac/soton/xtext/context/dsl/parser/antlr/internal/InternalContextDsl.g:603:1: ( (lv_source_4_0= ruleEString ) )
                    // ../ac.soton.xtext.context.dsl/src-gen/ac/soton/xtext/context/dsl/parser/antlr/internal/InternalContextDsl.g:604:1: (lv_source_4_0= ruleEString )
                    {
                    // ../ac.soton.xtext.context.dsl/src-gen/ac/soton/xtext/context/dsl/parser/antlr/internal/InternalContextDsl.g:604:1: (lv_source_4_0= ruleEString )
                    // ../ac.soton.xtext.context.dsl/src-gen/ac/soton/xtext/context/dsl/parser/antlr/internal/InternalContextDsl.g:605:3: lv_source_4_0= ruleEString
                    {
                     
                    	        newCompositeNode(grammarAccess.getAnnotationAccess().getSourceEStringParserRuleCall_3_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleAnnotation1184);
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

            // ../ac.soton.xtext.context.dsl/src-gen/ac/soton/xtext/context/dsl/parser/antlr/internal/InternalContextDsl.g:621:4: (otherlv_5= 'references' otherlv_6= '(' ( ( ruleEString ) ) (otherlv_8= ',' ( ( ruleEString ) ) )* otherlv_10= ')' )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==29) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // ../ac.soton.xtext.context.dsl/src-gen/ac/soton/xtext/context/dsl/parser/antlr/internal/InternalContextDsl.g:621:6: otherlv_5= 'references' otherlv_6= '(' ( ( ruleEString ) ) (otherlv_8= ',' ( ( ruleEString ) ) )* otherlv_10= ')'
                    {
                    otherlv_5=(Token)match(input,29,FollowSets000.FOLLOW_29_in_ruleAnnotation1199); 

                        	newLeafNode(otherlv_5, grammarAccess.getAnnotationAccess().getReferencesKeyword_4_0());
                        
                    otherlv_6=(Token)match(input,17,FollowSets000.FOLLOW_17_in_ruleAnnotation1211); 

                        	newLeafNode(otherlv_6, grammarAccess.getAnnotationAccess().getLeftParenthesisKeyword_4_1());
                        
                    // ../ac.soton.xtext.context.dsl/src-gen/ac/soton/xtext/context/dsl/parser/antlr/internal/InternalContextDsl.g:629:1: ( ( ruleEString ) )
                    // ../ac.soton.xtext.context.dsl/src-gen/ac/soton/xtext/context/dsl/parser/antlr/internal/InternalContextDsl.g:630:1: ( ruleEString )
                    {
                    // ../ac.soton.xtext.context.dsl/src-gen/ac/soton/xtext/context/dsl/parser/antlr/internal/InternalContextDsl.g:630:1: ( ruleEString )
                    // ../ac.soton.xtext.context.dsl/src-gen/ac/soton/xtext/context/dsl/parser/antlr/internal/InternalContextDsl.g:631:3: ruleEString
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getAnnotationRule());
                    	        }
                            
                     
                    	        newCompositeNode(grammarAccess.getAnnotationAccess().getReferencesEObjectCrossReference_4_2_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleAnnotation1234);
                    ruleEString();

                    state._fsp--;

                     
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../ac.soton.xtext.context.dsl/src-gen/ac/soton/xtext/context/dsl/parser/antlr/internal/InternalContextDsl.g:644:2: (otherlv_8= ',' ( ( ruleEString ) ) )*
                    loop19:
                    do {
                        int alt19=2;
                        int LA19_0 = input.LA(1);

                        if ( (LA19_0==18) ) {
                            alt19=1;
                        }


                        switch (alt19) {
                    	case 1 :
                    	    // ../ac.soton.xtext.context.dsl/src-gen/ac/soton/xtext/context/dsl/parser/antlr/internal/InternalContextDsl.g:644:4: otherlv_8= ',' ( ( ruleEString ) )
                    	    {
                    	    otherlv_8=(Token)match(input,18,FollowSets000.FOLLOW_18_in_ruleAnnotation1247); 

                    	        	newLeafNode(otherlv_8, grammarAccess.getAnnotationAccess().getCommaKeyword_4_3_0());
                    	        
                    	    // ../ac.soton.xtext.context.dsl/src-gen/ac/soton/xtext/context/dsl/parser/antlr/internal/InternalContextDsl.g:648:1: ( ( ruleEString ) )
                    	    // ../ac.soton.xtext.context.dsl/src-gen/ac/soton/xtext/context/dsl/parser/antlr/internal/InternalContextDsl.g:649:1: ( ruleEString )
                    	    {
                    	    // ../ac.soton.xtext.context.dsl/src-gen/ac/soton/xtext/context/dsl/parser/antlr/internal/InternalContextDsl.g:649:1: ( ruleEString )
                    	    // ../ac.soton.xtext.context.dsl/src-gen/ac/soton/xtext/context/dsl/parser/antlr/internal/InternalContextDsl.g:650:3: ruleEString
                    	    {

                    	    			if (current==null) {
                    	    	            current = createModelElement(grammarAccess.getAnnotationRule());
                    	    	        }
                    	            
                    	     
                    	    	        newCompositeNode(grammarAccess.getAnnotationAccess().getReferencesEObjectCrossReference_4_3_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleAnnotation1270);
                    	    ruleEString();

                    	    state._fsp--;

                    	     
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop19;
                        }
                    } while (true);

                    otherlv_10=(Token)match(input,19,FollowSets000.FOLLOW_19_in_ruleAnnotation1284); 

                        	newLeafNode(otherlv_10, grammarAccess.getAnnotationAccess().getRightParenthesisKeyword_4_4());
                        

                    }
                    break;

            }

            // ../ac.soton.xtext.context.dsl/src-gen/ac/soton/xtext/context/dsl/parser/antlr/internal/InternalContextDsl.g:667:3: (otherlv_11= 'annotations' otherlv_12= '{' ( (lv_annotations_13_0= ruleAnnotation ) ) (otherlv_14= ',' ( (lv_annotations_15_0= ruleAnnotation ) ) )* otherlv_16= '}' )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==20) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // ../ac.soton.xtext.context.dsl/src-gen/ac/soton/xtext/context/dsl/parser/antlr/internal/InternalContextDsl.g:667:5: otherlv_11= 'annotations' otherlv_12= '{' ( (lv_annotations_13_0= ruleAnnotation ) ) (otherlv_14= ',' ( (lv_annotations_15_0= ruleAnnotation ) ) )* otherlv_16= '}'
                    {
                    otherlv_11=(Token)match(input,20,FollowSets000.FOLLOW_20_in_ruleAnnotation1299); 

                        	newLeafNode(otherlv_11, grammarAccess.getAnnotationAccess().getAnnotationsKeyword_5_0());
                        
                    otherlv_12=(Token)match(input,13,FollowSets000.FOLLOW_13_in_ruleAnnotation1311); 

                        	newLeafNode(otherlv_12, grammarAccess.getAnnotationAccess().getLeftCurlyBracketKeyword_5_1());
                        
                    // ../ac.soton.xtext.context.dsl/src-gen/ac/soton/xtext/context/dsl/parser/antlr/internal/InternalContextDsl.g:675:1: ( (lv_annotations_13_0= ruleAnnotation ) )
                    // ../ac.soton.xtext.context.dsl/src-gen/ac/soton/xtext/context/dsl/parser/antlr/internal/InternalContextDsl.g:676:1: (lv_annotations_13_0= ruleAnnotation )
                    {
                    // ../ac.soton.xtext.context.dsl/src-gen/ac/soton/xtext/context/dsl/parser/antlr/internal/InternalContextDsl.g:676:1: (lv_annotations_13_0= ruleAnnotation )
                    // ../ac.soton.xtext.context.dsl/src-gen/ac/soton/xtext/context/dsl/parser/antlr/internal/InternalContextDsl.g:677:3: lv_annotations_13_0= ruleAnnotation
                    {
                     
                    	        newCompositeNode(grammarAccess.getAnnotationAccess().getAnnotationsAnnotationParserRuleCall_5_2_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleAnnotation_in_ruleAnnotation1332);
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

                    // ../ac.soton.xtext.context.dsl/src-gen/ac/soton/xtext/context/dsl/parser/antlr/internal/InternalContextDsl.g:693:2: (otherlv_14= ',' ( (lv_annotations_15_0= ruleAnnotation ) ) )*
                    loop21:
                    do {
                        int alt21=2;
                        int LA21_0 = input.LA(1);

                        if ( (LA21_0==18) ) {
                            alt21=1;
                        }


                        switch (alt21) {
                    	case 1 :
                    	    // ../ac.soton.xtext.context.dsl/src-gen/ac/soton/xtext/context/dsl/parser/antlr/internal/InternalContextDsl.g:693:4: otherlv_14= ',' ( (lv_annotations_15_0= ruleAnnotation ) )
                    	    {
                    	    otherlv_14=(Token)match(input,18,FollowSets000.FOLLOW_18_in_ruleAnnotation1345); 

                    	        	newLeafNode(otherlv_14, grammarAccess.getAnnotationAccess().getCommaKeyword_5_3_0());
                    	        
                    	    // ../ac.soton.xtext.context.dsl/src-gen/ac/soton/xtext/context/dsl/parser/antlr/internal/InternalContextDsl.g:697:1: ( (lv_annotations_15_0= ruleAnnotation ) )
                    	    // ../ac.soton.xtext.context.dsl/src-gen/ac/soton/xtext/context/dsl/parser/antlr/internal/InternalContextDsl.g:698:1: (lv_annotations_15_0= ruleAnnotation )
                    	    {
                    	    // ../ac.soton.xtext.context.dsl/src-gen/ac/soton/xtext/context/dsl/parser/antlr/internal/InternalContextDsl.g:698:1: (lv_annotations_15_0= ruleAnnotation )
                    	    // ../ac.soton.xtext.context.dsl/src-gen/ac/soton/xtext/context/dsl/parser/antlr/internal/InternalContextDsl.g:699:3: lv_annotations_15_0= ruleAnnotation
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getAnnotationAccess().getAnnotationsAnnotationParserRuleCall_5_3_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleAnnotation_in_ruleAnnotation1366);
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
                    	    break loop21;
                        }
                    } while (true);

                    otherlv_16=(Token)match(input,21,FollowSets000.FOLLOW_21_in_ruleAnnotation1380); 

                        	newLeafNode(otherlv_16, grammarAccess.getAnnotationAccess().getRightCurlyBracketKeyword_5_4());
                        

                    }
                    break;

            }

            // ../ac.soton.xtext.context.dsl/src-gen/ac/soton/xtext/context/dsl/parser/antlr/internal/InternalContextDsl.g:719:3: (otherlv_17= 'details' otherlv_18= '{' ( (lv_details_19_0= ruleStringToStringMapEntry ) ) (otherlv_20= ',' ( (lv_details_21_0= ruleStringToStringMapEntry ) ) )* otherlv_22= '}' )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==30) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // ../ac.soton.xtext.context.dsl/src-gen/ac/soton/xtext/context/dsl/parser/antlr/internal/InternalContextDsl.g:719:5: otherlv_17= 'details' otherlv_18= '{' ( (lv_details_19_0= ruleStringToStringMapEntry ) ) (otherlv_20= ',' ( (lv_details_21_0= ruleStringToStringMapEntry ) ) )* otherlv_22= '}'
                    {
                    otherlv_17=(Token)match(input,30,FollowSets000.FOLLOW_30_in_ruleAnnotation1395); 

                        	newLeafNode(otherlv_17, grammarAccess.getAnnotationAccess().getDetailsKeyword_6_0());
                        
                    otherlv_18=(Token)match(input,13,FollowSets000.FOLLOW_13_in_ruleAnnotation1407); 

                        	newLeafNode(otherlv_18, grammarAccess.getAnnotationAccess().getLeftCurlyBracketKeyword_6_1());
                        
                    // ../ac.soton.xtext.context.dsl/src-gen/ac/soton/xtext/context/dsl/parser/antlr/internal/InternalContextDsl.g:727:1: ( (lv_details_19_0= ruleStringToStringMapEntry ) )
                    // ../ac.soton.xtext.context.dsl/src-gen/ac/soton/xtext/context/dsl/parser/antlr/internal/InternalContextDsl.g:728:1: (lv_details_19_0= ruleStringToStringMapEntry )
                    {
                    // ../ac.soton.xtext.context.dsl/src-gen/ac/soton/xtext/context/dsl/parser/antlr/internal/InternalContextDsl.g:728:1: (lv_details_19_0= ruleStringToStringMapEntry )
                    // ../ac.soton.xtext.context.dsl/src-gen/ac/soton/xtext/context/dsl/parser/antlr/internal/InternalContextDsl.g:729:3: lv_details_19_0= ruleStringToStringMapEntry
                    {
                     
                    	        newCompositeNode(grammarAccess.getAnnotationAccess().getDetailsStringToStringMapEntryParserRuleCall_6_2_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleStringToStringMapEntry_in_ruleAnnotation1428);
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

                    // ../ac.soton.xtext.context.dsl/src-gen/ac/soton/xtext/context/dsl/parser/antlr/internal/InternalContextDsl.g:745:2: (otherlv_20= ',' ( (lv_details_21_0= ruleStringToStringMapEntry ) ) )*
                    loop23:
                    do {
                        int alt23=2;
                        int LA23_0 = input.LA(1);

                        if ( (LA23_0==18) ) {
                            alt23=1;
                        }


                        switch (alt23) {
                    	case 1 :
                    	    // ../ac.soton.xtext.context.dsl/src-gen/ac/soton/xtext/context/dsl/parser/antlr/internal/InternalContextDsl.g:745:4: otherlv_20= ',' ( (lv_details_21_0= ruleStringToStringMapEntry ) )
                    	    {
                    	    otherlv_20=(Token)match(input,18,FollowSets000.FOLLOW_18_in_ruleAnnotation1441); 

                    	        	newLeafNode(otherlv_20, grammarAccess.getAnnotationAccess().getCommaKeyword_6_3_0());
                    	        
                    	    // ../ac.soton.xtext.context.dsl/src-gen/ac/soton/xtext/context/dsl/parser/antlr/internal/InternalContextDsl.g:749:1: ( (lv_details_21_0= ruleStringToStringMapEntry ) )
                    	    // ../ac.soton.xtext.context.dsl/src-gen/ac/soton/xtext/context/dsl/parser/antlr/internal/InternalContextDsl.g:750:1: (lv_details_21_0= ruleStringToStringMapEntry )
                    	    {
                    	    // ../ac.soton.xtext.context.dsl/src-gen/ac/soton/xtext/context/dsl/parser/antlr/internal/InternalContextDsl.g:750:1: (lv_details_21_0= ruleStringToStringMapEntry )
                    	    // ../ac.soton.xtext.context.dsl/src-gen/ac/soton/xtext/context/dsl/parser/antlr/internal/InternalContextDsl.g:751:3: lv_details_21_0= ruleStringToStringMapEntry
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getAnnotationAccess().getDetailsStringToStringMapEntryParserRuleCall_6_3_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleStringToStringMapEntry_in_ruleAnnotation1462);
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
                    	    break loop23;
                        }
                    } while (true);

                    otherlv_22=(Token)match(input,21,FollowSets000.FOLLOW_21_in_ruleAnnotation1476); 

                        	newLeafNode(otherlv_22, grammarAccess.getAnnotationAccess().getRightCurlyBracketKeyword_6_4());
                        

                    }
                    break;

            }

            // ../ac.soton.xtext.context.dsl/src-gen/ac/soton/xtext/context/dsl/parser/antlr/internal/InternalContextDsl.g:771:3: (otherlv_23= 'contents' otherlv_24= '{' ( (lv_contents_25_0= ruleEObject ) ) (otherlv_26= ',' ( (lv_contents_27_0= ruleEObject ) ) )* otherlv_28= '}' )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==31) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // ../ac.soton.xtext.context.dsl/src-gen/ac/soton/xtext/context/dsl/parser/antlr/internal/InternalContextDsl.g:771:5: otherlv_23= 'contents' otherlv_24= '{' ( (lv_contents_25_0= ruleEObject ) ) (otherlv_26= ',' ( (lv_contents_27_0= ruleEObject ) ) )* otherlv_28= '}'
                    {
                    otherlv_23=(Token)match(input,31,FollowSets000.FOLLOW_31_in_ruleAnnotation1491); 

                        	newLeafNode(otherlv_23, grammarAccess.getAnnotationAccess().getContentsKeyword_7_0());
                        
                    otherlv_24=(Token)match(input,13,FollowSets000.FOLLOW_13_in_ruleAnnotation1503); 

                        	newLeafNode(otherlv_24, grammarAccess.getAnnotationAccess().getLeftCurlyBracketKeyword_7_1());
                        
                    // ../ac.soton.xtext.context.dsl/src-gen/ac/soton/xtext/context/dsl/parser/antlr/internal/InternalContextDsl.g:779:1: ( (lv_contents_25_0= ruleEObject ) )
                    // ../ac.soton.xtext.context.dsl/src-gen/ac/soton/xtext/context/dsl/parser/antlr/internal/InternalContextDsl.g:780:1: (lv_contents_25_0= ruleEObject )
                    {
                    // ../ac.soton.xtext.context.dsl/src-gen/ac/soton/xtext/context/dsl/parser/antlr/internal/InternalContextDsl.g:780:1: (lv_contents_25_0= ruleEObject )
                    // ../ac.soton.xtext.context.dsl/src-gen/ac/soton/xtext/context/dsl/parser/antlr/internal/InternalContextDsl.g:781:3: lv_contents_25_0= ruleEObject
                    {
                     
                    	        newCompositeNode(grammarAccess.getAnnotationAccess().getContentsEObjectParserRuleCall_7_2_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEObject_in_ruleAnnotation1524);
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

                    // ../ac.soton.xtext.context.dsl/src-gen/ac/soton/xtext/context/dsl/parser/antlr/internal/InternalContextDsl.g:797:2: (otherlv_26= ',' ( (lv_contents_27_0= ruleEObject ) ) )*
                    loop25:
                    do {
                        int alt25=2;
                        int LA25_0 = input.LA(1);

                        if ( (LA25_0==18) ) {
                            alt25=1;
                        }


                        switch (alt25) {
                    	case 1 :
                    	    // ../ac.soton.xtext.context.dsl/src-gen/ac/soton/xtext/context/dsl/parser/antlr/internal/InternalContextDsl.g:797:4: otherlv_26= ',' ( (lv_contents_27_0= ruleEObject ) )
                    	    {
                    	    otherlv_26=(Token)match(input,18,FollowSets000.FOLLOW_18_in_ruleAnnotation1537); 

                    	        	newLeafNode(otherlv_26, grammarAccess.getAnnotationAccess().getCommaKeyword_7_3_0());
                    	        
                    	    // ../ac.soton.xtext.context.dsl/src-gen/ac/soton/xtext/context/dsl/parser/antlr/internal/InternalContextDsl.g:801:1: ( (lv_contents_27_0= ruleEObject ) )
                    	    // ../ac.soton.xtext.context.dsl/src-gen/ac/soton/xtext/context/dsl/parser/antlr/internal/InternalContextDsl.g:802:1: (lv_contents_27_0= ruleEObject )
                    	    {
                    	    // ../ac.soton.xtext.context.dsl/src-gen/ac/soton/xtext/context/dsl/parser/antlr/internal/InternalContextDsl.g:802:1: (lv_contents_27_0= ruleEObject )
                    	    // ../ac.soton.xtext.context.dsl/src-gen/ac/soton/xtext/context/dsl/parser/antlr/internal/InternalContextDsl.g:803:3: lv_contents_27_0= ruleEObject
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getAnnotationAccess().getContentsEObjectParserRuleCall_7_3_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleEObject_in_ruleAnnotation1558);
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
                    	    break loop25;
                        }
                    } while (true);

                    otherlv_28=(Token)match(input,21,FollowSets000.FOLLOW_21_in_ruleAnnotation1572); 

                        	newLeafNode(otherlv_28, grammarAccess.getAnnotationAccess().getRightCurlyBracketKeyword_7_4());
                        

                    }
                    break;

            }

            otherlv_29=(Token)match(input,21,FollowSets000.FOLLOW_21_in_ruleAnnotation1586); 

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
    // ../ac.soton.xtext.context.dsl/src-gen/ac/soton/xtext/context/dsl/parser/antlr/internal/InternalContextDsl.g:835:1: entryRuleStringToAttributeMapEntry returns [EObject current=null] : iv_ruleStringToAttributeMapEntry= ruleStringToAttributeMapEntry EOF ;
    public final EObject entryRuleStringToAttributeMapEntry() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStringToAttributeMapEntry = null;


        try {
            // ../ac.soton.xtext.context.dsl/src-gen/ac/soton/xtext/context/dsl/parser/antlr/internal/InternalContextDsl.g:836:2: (iv_ruleStringToAttributeMapEntry= ruleStringToAttributeMapEntry EOF )
            // ../ac.soton.xtext.context.dsl/src-gen/ac/soton/xtext/context/dsl/parser/antlr/internal/InternalContextDsl.g:837:2: iv_ruleStringToAttributeMapEntry= ruleStringToAttributeMapEntry EOF
            {
             newCompositeNode(grammarAccess.getStringToAttributeMapEntryRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleStringToAttributeMapEntry_in_entryRuleStringToAttributeMapEntry1622);
            iv_ruleStringToAttributeMapEntry=ruleStringToAttributeMapEntry();

            state._fsp--;

             current =iv_ruleStringToAttributeMapEntry; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleStringToAttributeMapEntry1632); 

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
    // ../ac.soton.xtext.context.dsl/src-gen/ac/soton/xtext/context/dsl/parser/antlr/internal/InternalContextDsl.g:844:1: ruleStringToAttributeMapEntry returns [EObject current=null] : (otherlv_0= 'StringToAttributeMapEntry' otherlv_1= '{' otherlv_2= 'key' ( (lv_key_3_0= ruleEString ) ) (otherlv_4= 'value' ( (lv_value_5_0= ruleAttribute ) ) )? otherlv_6= '}' ) ;
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
            // ../ac.soton.xtext.context.dsl/src-gen/ac/soton/xtext/context/dsl/parser/antlr/internal/InternalContextDsl.g:847:28: ( (otherlv_0= 'StringToAttributeMapEntry' otherlv_1= '{' otherlv_2= 'key' ( (lv_key_3_0= ruleEString ) ) (otherlv_4= 'value' ( (lv_value_5_0= ruleAttribute ) ) )? otherlv_6= '}' ) )
            // ../ac.soton.xtext.context.dsl/src-gen/ac/soton/xtext/context/dsl/parser/antlr/internal/InternalContextDsl.g:848:1: (otherlv_0= 'StringToAttributeMapEntry' otherlv_1= '{' otherlv_2= 'key' ( (lv_key_3_0= ruleEString ) ) (otherlv_4= 'value' ( (lv_value_5_0= ruleAttribute ) ) )? otherlv_6= '}' )
            {
            // ../ac.soton.xtext.context.dsl/src-gen/ac/soton/xtext/context/dsl/parser/antlr/internal/InternalContextDsl.g:848:1: (otherlv_0= 'StringToAttributeMapEntry' otherlv_1= '{' otherlv_2= 'key' ( (lv_key_3_0= ruleEString ) ) (otherlv_4= 'value' ( (lv_value_5_0= ruleAttribute ) ) )? otherlv_6= '}' )
            // ../ac.soton.xtext.context.dsl/src-gen/ac/soton/xtext/context/dsl/parser/antlr/internal/InternalContextDsl.g:848:3: otherlv_0= 'StringToAttributeMapEntry' otherlv_1= '{' otherlv_2= 'key' ( (lv_key_3_0= ruleEString ) ) (otherlv_4= 'value' ( (lv_value_5_0= ruleAttribute ) ) )? otherlv_6= '}'
            {
            otherlv_0=(Token)match(input,32,FollowSets000.FOLLOW_32_in_ruleStringToAttributeMapEntry1669); 

                	newLeafNode(otherlv_0, grammarAccess.getStringToAttributeMapEntryAccess().getStringToAttributeMapEntryKeyword_0());
                
            otherlv_1=(Token)match(input,13,FollowSets000.FOLLOW_13_in_ruleStringToAttributeMapEntry1681); 

                	newLeafNode(otherlv_1, grammarAccess.getStringToAttributeMapEntryAccess().getLeftCurlyBracketKeyword_1());
                
            otherlv_2=(Token)match(input,33,FollowSets000.FOLLOW_33_in_ruleStringToAttributeMapEntry1693); 

                	newLeafNode(otherlv_2, grammarAccess.getStringToAttributeMapEntryAccess().getKeyKeyword_2());
                
            // ../ac.soton.xtext.context.dsl/src-gen/ac/soton/xtext/context/dsl/parser/antlr/internal/InternalContextDsl.g:860:1: ( (lv_key_3_0= ruleEString ) )
            // ../ac.soton.xtext.context.dsl/src-gen/ac/soton/xtext/context/dsl/parser/antlr/internal/InternalContextDsl.g:861:1: (lv_key_3_0= ruleEString )
            {
            // ../ac.soton.xtext.context.dsl/src-gen/ac/soton/xtext/context/dsl/parser/antlr/internal/InternalContextDsl.g:861:1: (lv_key_3_0= ruleEString )
            // ../ac.soton.xtext.context.dsl/src-gen/ac/soton/xtext/context/dsl/parser/antlr/internal/InternalContextDsl.g:862:3: lv_key_3_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getStringToAttributeMapEntryAccess().getKeyEStringParserRuleCall_3_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleStringToAttributeMapEntry1714);
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

            // ../ac.soton.xtext.context.dsl/src-gen/ac/soton/xtext/context/dsl/parser/antlr/internal/InternalContextDsl.g:878:2: (otherlv_4= 'value' ( (lv_value_5_0= ruleAttribute ) ) )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==34) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // ../ac.soton.xtext.context.dsl/src-gen/ac/soton/xtext/context/dsl/parser/antlr/internal/InternalContextDsl.g:878:4: otherlv_4= 'value' ( (lv_value_5_0= ruleAttribute ) )
                    {
                    otherlv_4=(Token)match(input,34,FollowSets000.FOLLOW_34_in_ruleStringToAttributeMapEntry1727); 

                        	newLeafNode(otherlv_4, grammarAccess.getStringToAttributeMapEntryAccess().getValueKeyword_4_0());
                        
                    // ../ac.soton.xtext.context.dsl/src-gen/ac/soton/xtext/context/dsl/parser/antlr/internal/InternalContextDsl.g:882:1: ( (lv_value_5_0= ruleAttribute ) )
                    // ../ac.soton.xtext.context.dsl/src-gen/ac/soton/xtext/context/dsl/parser/antlr/internal/InternalContextDsl.g:883:1: (lv_value_5_0= ruleAttribute )
                    {
                    // ../ac.soton.xtext.context.dsl/src-gen/ac/soton/xtext/context/dsl/parser/antlr/internal/InternalContextDsl.g:883:1: (lv_value_5_0= ruleAttribute )
                    // ../ac.soton.xtext.context.dsl/src-gen/ac/soton/xtext/context/dsl/parser/antlr/internal/InternalContextDsl.g:884:3: lv_value_5_0= ruleAttribute
                    {
                     
                    	        newCompositeNode(grammarAccess.getStringToAttributeMapEntryAccess().getValueAttributeParserRuleCall_4_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleAttribute_in_ruleStringToAttributeMapEntry1748);
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

            otherlv_6=(Token)match(input,21,FollowSets000.FOLLOW_21_in_ruleStringToAttributeMapEntry1762); 

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
    // ../ac.soton.xtext.context.dsl/src-gen/ac/soton/xtext/context/dsl/parser/antlr/internal/InternalContextDsl.g:914:1: entryRuleEString returns [String current=null] : iv_ruleEString= ruleEString EOF ;
    public final String entryRuleEString() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEString = null;


        try {
            // ../ac.soton.xtext.context.dsl/src-gen/ac/soton/xtext/context/dsl/parser/antlr/internal/InternalContextDsl.g:915:2: (iv_ruleEString= ruleEString EOF )
            // ../ac.soton.xtext.context.dsl/src-gen/ac/soton/xtext/context/dsl/parser/antlr/internal/InternalContextDsl.g:916:2: iv_ruleEString= ruleEString EOF
            {
             newCompositeNode(grammarAccess.getEStringRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_entryRuleEString1801);
            iv_ruleEString=ruleEString();

            state._fsp--;

             current =iv_ruleEString.getText(); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleEString1812); 

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
    // ../ac.soton.xtext.context.dsl/src-gen/ac/soton/xtext/context/dsl/parser/antlr/internal/InternalContextDsl.g:923:1: ruleEString returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) ;
    public final AntlrDatatypeRuleToken ruleEString() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;
        Token this_ID_1=null;

         enterRule(); 
            
        try {
            // ../ac.soton.xtext.context.dsl/src-gen/ac/soton/xtext/context/dsl/parser/antlr/internal/InternalContextDsl.g:926:28: ( (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) )
            // ../ac.soton.xtext.context.dsl/src-gen/ac/soton/xtext/context/dsl/parser/antlr/internal/InternalContextDsl.g:927:1: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            {
            // ../ac.soton.xtext.context.dsl/src-gen/ac/soton/xtext/context/dsl/parser/antlr/internal/InternalContextDsl.g:927:1: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==RULE_STRING) ) {
                alt28=1;
            }
            else if ( (LA28_0==RULE_ID) ) {
                alt28=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 28, 0, input);

                throw nvae;
            }
            switch (alt28) {
                case 1 :
                    // ../ac.soton.xtext.context.dsl/src-gen/ac/soton/xtext/context/dsl/parser/antlr/internal/InternalContextDsl.g:927:6: this_STRING_0= RULE_STRING
                    {
                    this_STRING_0=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_RULE_STRING_in_ruleEString1852); 

                    		current.merge(this_STRING_0);
                        
                     
                        newLeafNode(this_STRING_0, grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 
                        

                    }
                    break;
                case 2 :
                    // ../ac.soton.xtext.context.dsl/src-gen/ac/soton/xtext/context/dsl/parser/antlr/internal/InternalContextDsl.g:935:10: this_ID_1= RULE_ID
                    {
                    this_ID_1=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleEString1878); 

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


    // $ANTLR start "entryRuleCarrierSet"
    // ../ac.soton.xtext.context.dsl/src-gen/ac/soton/xtext/context/dsl/parser/antlr/internal/InternalContextDsl.g:950:1: entryRuleCarrierSet returns [EObject current=null] : iv_ruleCarrierSet= ruleCarrierSet EOF ;
    public final EObject entryRuleCarrierSet() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCarrierSet = null;


        try {
            // ../ac.soton.xtext.context.dsl/src-gen/ac/soton/xtext/context/dsl/parser/antlr/internal/InternalContextDsl.g:951:2: (iv_ruleCarrierSet= ruleCarrierSet EOF )
            // ../ac.soton.xtext.context.dsl/src-gen/ac/soton/xtext/context/dsl/parser/antlr/internal/InternalContextDsl.g:952:2: iv_ruleCarrierSet= ruleCarrierSet EOF
            {
             newCompositeNode(grammarAccess.getCarrierSetRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleCarrierSet_in_entryRuleCarrierSet1923);
            iv_ruleCarrierSet=ruleCarrierSet();

            state._fsp--;

             current =iv_ruleCarrierSet; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleCarrierSet1933); 

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
    // ../ac.soton.xtext.context.dsl/src-gen/ac/soton/xtext/context/dsl/parser/antlr/internal/InternalContextDsl.g:959:1: ruleCarrierSet returns [EObject current=null] : ( () ( (lv_localGenerated_1_0= 'localGenerated' ) )? otherlv_2= 'CarrierSet' ( (lv_name_3_0= ruleEString ) ) otherlv_4= '{' (otherlv_5= 'internalId' ( (lv_internalId_6_0= ruleEString ) ) )? (otherlv_7= 'comment' ( (lv_comment_8_0= ruleEString ) ) )? (otherlv_9= 'annotations' otherlv_10= '{' ( (lv_annotations_11_0= ruleAnnotation ) ) (otherlv_12= ',' ( (lv_annotations_13_0= ruleAnnotation ) ) )* otherlv_14= '}' )? (otherlv_15= 'extensions' otherlv_16= '{' ( (lv_extensions_17_0= ruleAbstractExtension ) ) (otherlv_18= ',' ( (lv_extensions_19_0= ruleAbstractExtension ) ) )* otherlv_20= '}' )? (otherlv_21= 'attributes' otherlv_22= '{' ( (lv_attributes_23_0= ruleStringToAttributeMapEntry ) ) (otherlv_24= ',' ( (lv_attributes_25_0= ruleStringToAttributeMapEntry ) ) )* otherlv_26= '}' )? otherlv_27= '}' ) ;
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
            // ../ac.soton.xtext.context.dsl/src-gen/ac/soton/xtext/context/dsl/parser/antlr/internal/InternalContextDsl.g:962:28: ( ( () ( (lv_localGenerated_1_0= 'localGenerated' ) )? otherlv_2= 'CarrierSet' ( (lv_name_3_0= ruleEString ) ) otherlv_4= '{' (otherlv_5= 'internalId' ( (lv_internalId_6_0= ruleEString ) ) )? (otherlv_7= 'comment' ( (lv_comment_8_0= ruleEString ) ) )? (otherlv_9= 'annotations' otherlv_10= '{' ( (lv_annotations_11_0= ruleAnnotation ) ) (otherlv_12= ',' ( (lv_annotations_13_0= ruleAnnotation ) ) )* otherlv_14= '}' )? (otherlv_15= 'extensions' otherlv_16= '{' ( (lv_extensions_17_0= ruleAbstractExtension ) ) (otherlv_18= ',' ( (lv_extensions_19_0= ruleAbstractExtension ) ) )* otherlv_20= '}' )? (otherlv_21= 'attributes' otherlv_22= '{' ( (lv_attributes_23_0= ruleStringToAttributeMapEntry ) ) (otherlv_24= ',' ( (lv_attributes_25_0= ruleStringToAttributeMapEntry ) ) )* otherlv_26= '}' )? otherlv_27= '}' ) )
            // ../ac.soton.xtext.context.dsl/src-gen/ac/soton/xtext/context/dsl/parser/antlr/internal/InternalContextDsl.g:963:1: ( () ( (lv_localGenerated_1_0= 'localGenerated' ) )? otherlv_2= 'CarrierSet' ( (lv_name_3_0= ruleEString ) ) otherlv_4= '{' (otherlv_5= 'internalId' ( (lv_internalId_6_0= ruleEString ) ) )? (otherlv_7= 'comment' ( (lv_comment_8_0= ruleEString ) ) )? (otherlv_9= 'annotations' otherlv_10= '{' ( (lv_annotations_11_0= ruleAnnotation ) ) (otherlv_12= ',' ( (lv_annotations_13_0= ruleAnnotation ) ) )* otherlv_14= '}' )? (otherlv_15= 'extensions' otherlv_16= '{' ( (lv_extensions_17_0= ruleAbstractExtension ) ) (otherlv_18= ',' ( (lv_extensions_19_0= ruleAbstractExtension ) ) )* otherlv_20= '}' )? (otherlv_21= 'attributes' otherlv_22= '{' ( (lv_attributes_23_0= ruleStringToAttributeMapEntry ) ) (otherlv_24= ',' ( (lv_attributes_25_0= ruleStringToAttributeMapEntry ) ) )* otherlv_26= '}' )? otherlv_27= '}' )
            {
            // ../ac.soton.xtext.context.dsl/src-gen/ac/soton/xtext/context/dsl/parser/antlr/internal/InternalContextDsl.g:963:1: ( () ( (lv_localGenerated_1_0= 'localGenerated' ) )? otherlv_2= 'CarrierSet' ( (lv_name_3_0= ruleEString ) ) otherlv_4= '{' (otherlv_5= 'internalId' ( (lv_internalId_6_0= ruleEString ) ) )? (otherlv_7= 'comment' ( (lv_comment_8_0= ruleEString ) ) )? (otherlv_9= 'annotations' otherlv_10= '{' ( (lv_annotations_11_0= ruleAnnotation ) ) (otherlv_12= ',' ( (lv_annotations_13_0= ruleAnnotation ) ) )* otherlv_14= '}' )? (otherlv_15= 'extensions' otherlv_16= '{' ( (lv_extensions_17_0= ruleAbstractExtension ) ) (otherlv_18= ',' ( (lv_extensions_19_0= ruleAbstractExtension ) ) )* otherlv_20= '}' )? (otherlv_21= 'attributes' otherlv_22= '{' ( (lv_attributes_23_0= ruleStringToAttributeMapEntry ) ) (otherlv_24= ',' ( (lv_attributes_25_0= ruleStringToAttributeMapEntry ) ) )* otherlv_26= '}' )? otherlv_27= '}' )
            // ../ac.soton.xtext.context.dsl/src-gen/ac/soton/xtext/context/dsl/parser/antlr/internal/InternalContextDsl.g:963:2: () ( (lv_localGenerated_1_0= 'localGenerated' ) )? otherlv_2= 'CarrierSet' ( (lv_name_3_0= ruleEString ) ) otherlv_4= '{' (otherlv_5= 'internalId' ( (lv_internalId_6_0= ruleEString ) ) )? (otherlv_7= 'comment' ( (lv_comment_8_0= ruleEString ) ) )? (otherlv_9= 'annotations' otherlv_10= '{' ( (lv_annotations_11_0= ruleAnnotation ) ) (otherlv_12= ',' ( (lv_annotations_13_0= ruleAnnotation ) ) )* otherlv_14= '}' )? (otherlv_15= 'extensions' otherlv_16= '{' ( (lv_extensions_17_0= ruleAbstractExtension ) ) (otherlv_18= ',' ( (lv_extensions_19_0= ruleAbstractExtension ) ) )* otherlv_20= '}' )? (otherlv_21= 'attributes' otherlv_22= '{' ( (lv_attributes_23_0= ruleStringToAttributeMapEntry ) ) (otherlv_24= ',' ( (lv_attributes_25_0= ruleStringToAttributeMapEntry ) ) )* otherlv_26= '}' )? otherlv_27= '}'
            {
            // ../ac.soton.xtext.context.dsl/src-gen/ac/soton/xtext/context/dsl/parser/antlr/internal/InternalContextDsl.g:963:2: ()
            // ../ac.soton.xtext.context.dsl/src-gen/ac/soton/xtext/context/dsl/parser/antlr/internal/InternalContextDsl.g:964:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getCarrierSetAccess().getCarrierSetAction_0(),
                        current);
                

            }

            // ../ac.soton.xtext.context.dsl/src-gen/ac/soton/xtext/context/dsl/parser/antlr/internal/InternalContextDsl.g:969:2: ( (lv_localGenerated_1_0= 'localGenerated' ) )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==11) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // ../ac.soton.xtext.context.dsl/src-gen/ac/soton/xtext/context/dsl/parser/antlr/internal/InternalContextDsl.g:970:1: (lv_localGenerated_1_0= 'localGenerated' )
                    {
                    // ../ac.soton.xtext.context.dsl/src-gen/ac/soton/xtext/context/dsl/parser/antlr/internal/InternalContextDsl.g:970:1: (lv_localGenerated_1_0= 'localGenerated' )
                    // ../ac.soton.xtext.context.dsl/src-gen/ac/soton/xtext/context/dsl/parser/antlr/internal/InternalContextDsl.g:971:3: lv_localGenerated_1_0= 'localGenerated'
                    {
                    lv_localGenerated_1_0=(Token)match(input,11,FollowSets000.FOLLOW_11_in_ruleCarrierSet1985); 

                            newLeafNode(lv_localGenerated_1_0, grammarAccess.getCarrierSetAccess().getLocalGeneratedLocalGeneratedKeyword_1_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getCarrierSetRule());
                    	        }
                           		setWithLastConsumed(current, "localGenerated", true, "localGenerated");
                    	    

                    }


                    }
                    break;

            }

            otherlv_2=(Token)match(input,35,FollowSets000.FOLLOW_35_in_ruleCarrierSet2011); 

                	newLeafNode(otherlv_2, grammarAccess.getCarrierSetAccess().getCarrierSetKeyword_2());
                
            // ../ac.soton.xtext.context.dsl/src-gen/ac/soton/xtext/context/dsl/parser/antlr/internal/InternalContextDsl.g:988:1: ( (lv_name_3_0= ruleEString ) )
            // ../ac.soton.xtext.context.dsl/src-gen/ac/soton/xtext/context/dsl/parser/antlr/internal/InternalContextDsl.g:989:1: (lv_name_3_0= ruleEString )
            {
            // ../ac.soton.xtext.context.dsl/src-gen/ac/soton/xtext/context/dsl/parser/antlr/internal/InternalContextDsl.g:989:1: (lv_name_3_0= ruleEString )
            // ../ac.soton.xtext.context.dsl/src-gen/ac/soton/xtext/context/dsl/parser/antlr/internal/InternalContextDsl.g:990:3: lv_name_3_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getCarrierSetAccess().getNameEStringParserRuleCall_3_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleCarrierSet2032);
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

            otherlv_4=(Token)match(input,13,FollowSets000.FOLLOW_13_in_ruleCarrierSet2044); 

                	newLeafNode(otherlv_4, grammarAccess.getCarrierSetAccess().getLeftCurlyBracketKeyword_4());
                
            // ../ac.soton.xtext.context.dsl/src-gen/ac/soton/xtext/context/dsl/parser/antlr/internal/InternalContextDsl.g:1010:1: (otherlv_5= 'internalId' ( (lv_internalId_6_0= ruleEString ) ) )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==14) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // ../ac.soton.xtext.context.dsl/src-gen/ac/soton/xtext/context/dsl/parser/antlr/internal/InternalContextDsl.g:1010:3: otherlv_5= 'internalId' ( (lv_internalId_6_0= ruleEString ) )
                    {
                    otherlv_5=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleCarrierSet2057); 

                        	newLeafNode(otherlv_5, grammarAccess.getCarrierSetAccess().getInternalIdKeyword_5_0());
                        
                    // ../ac.soton.xtext.context.dsl/src-gen/ac/soton/xtext/context/dsl/parser/antlr/internal/InternalContextDsl.g:1014:1: ( (lv_internalId_6_0= ruleEString ) )
                    // ../ac.soton.xtext.context.dsl/src-gen/ac/soton/xtext/context/dsl/parser/antlr/internal/InternalContextDsl.g:1015:1: (lv_internalId_6_0= ruleEString )
                    {
                    // ../ac.soton.xtext.context.dsl/src-gen/ac/soton/xtext/context/dsl/parser/antlr/internal/InternalContextDsl.g:1015:1: (lv_internalId_6_0= ruleEString )
                    // ../ac.soton.xtext.context.dsl/src-gen/ac/soton/xtext/context/dsl/parser/antlr/internal/InternalContextDsl.g:1016:3: lv_internalId_6_0= ruleEString
                    {
                     
                    	        newCompositeNode(grammarAccess.getCarrierSetAccess().getInternalIdEStringParserRuleCall_5_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleCarrierSet2078);
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

            // ../ac.soton.xtext.context.dsl/src-gen/ac/soton/xtext/context/dsl/parser/antlr/internal/InternalContextDsl.g:1032:4: (otherlv_7= 'comment' ( (lv_comment_8_0= ruleEString ) ) )?
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==15) ) {
                alt31=1;
            }
            switch (alt31) {
                case 1 :
                    // ../ac.soton.xtext.context.dsl/src-gen/ac/soton/xtext/context/dsl/parser/antlr/internal/InternalContextDsl.g:1032:6: otherlv_7= 'comment' ( (lv_comment_8_0= ruleEString ) )
                    {
                    otherlv_7=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleCarrierSet2093); 

                        	newLeafNode(otherlv_7, grammarAccess.getCarrierSetAccess().getCommentKeyword_6_0());
                        
                    // ../ac.soton.xtext.context.dsl/src-gen/ac/soton/xtext/context/dsl/parser/antlr/internal/InternalContextDsl.g:1036:1: ( (lv_comment_8_0= ruleEString ) )
                    // ../ac.soton.xtext.context.dsl/src-gen/ac/soton/xtext/context/dsl/parser/antlr/internal/InternalContextDsl.g:1037:1: (lv_comment_8_0= ruleEString )
                    {
                    // ../ac.soton.xtext.context.dsl/src-gen/ac/soton/xtext/context/dsl/parser/antlr/internal/InternalContextDsl.g:1037:1: (lv_comment_8_0= ruleEString )
                    // ../ac.soton.xtext.context.dsl/src-gen/ac/soton/xtext/context/dsl/parser/antlr/internal/InternalContextDsl.g:1038:3: lv_comment_8_0= ruleEString
                    {
                     
                    	        newCompositeNode(grammarAccess.getCarrierSetAccess().getCommentEStringParserRuleCall_6_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleCarrierSet2114);
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

            // ../ac.soton.xtext.context.dsl/src-gen/ac/soton/xtext/context/dsl/parser/antlr/internal/InternalContextDsl.g:1054:4: (otherlv_9= 'annotations' otherlv_10= '{' ( (lv_annotations_11_0= ruleAnnotation ) ) (otherlv_12= ',' ( (lv_annotations_13_0= ruleAnnotation ) ) )* otherlv_14= '}' )?
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==20) ) {
                alt33=1;
            }
            switch (alt33) {
                case 1 :
                    // ../ac.soton.xtext.context.dsl/src-gen/ac/soton/xtext/context/dsl/parser/antlr/internal/InternalContextDsl.g:1054:6: otherlv_9= 'annotations' otherlv_10= '{' ( (lv_annotations_11_0= ruleAnnotation ) ) (otherlv_12= ',' ( (lv_annotations_13_0= ruleAnnotation ) ) )* otherlv_14= '}'
                    {
                    otherlv_9=(Token)match(input,20,FollowSets000.FOLLOW_20_in_ruleCarrierSet2129); 

                        	newLeafNode(otherlv_9, grammarAccess.getCarrierSetAccess().getAnnotationsKeyword_7_0());
                        
                    otherlv_10=(Token)match(input,13,FollowSets000.FOLLOW_13_in_ruleCarrierSet2141); 

                        	newLeafNode(otherlv_10, grammarAccess.getCarrierSetAccess().getLeftCurlyBracketKeyword_7_1());
                        
                    // ../ac.soton.xtext.context.dsl/src-gen/ac/soton/xtext/context/dsl/parser/antlr/internal/InternalContextDsl.g:1062:1: ( (lv_annotations_11_0= ruleAnnotation ) )
                    // ../ac.soton.xtext.context.dsl/src-gen/ac/soton/xtext/context/dsl/parser/antlr/internal/InternalContextDsl.g:1063:1: (lv_annotations_11_0= ruleAnnotation )
                    {
                    // ../ac.soton.xtext.context.dsl/src-gen/ac/soton/xtext/context/dsl/parser/antlr/internal/InternalContextDsl.g:1063:1: (lv_annotations_11_0= ruleAnnotation )
                    // ../ac.soton.xtext.context.dsl/src-gen/ac/soton/xtext/context/dsl/parser/antlr/internal/InternalContextDsl.g:1064:3: lv_annotations_11_0= ruleAnnotation
                    {
                     
                    	        newCompositeNode(grammarAccess.getCarrierSetAccess().getAnnotationsAnnotationParserRuleCall_7_2_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleAnnotation_in_ruleCarrierSet2162);
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

                    // ../ac.soton.xtext.context.dsl/src-gen/ac/soton/xtext/context/dsl/parser/antlr/internal/InternalContextDsl.g:1080:2: (otherlv_12= ',' ( (lv_annotations_13_0= ruleAnnotation ) ) )*
                    loop32:
                    do {
                        int alt32=2;
                        int LA32_0 = input.LA(1);

                        if ( (LA32_0==18) ) {
                            alt32=1;
                        }


                        switch (alt32) {
                    	case 1 :
                    	    // ../ac.soton.xtext.context.dsl/src-gen/ac/soton/xtext/context/dsl/parser/antlr/internal/InternalContextDsl.g:1080:4: otherlv_12= ',' ( (lv_annotations_13_0= ruleAnnotation ) )
                    	    {
                    	    otherlv_12=(Token)match(input,18,FollowSets000.FOLLOW_18_in_ruleCarrierSet2175); 

                    	        	newLeafNode(otherlv_12, grammarAccess.getCarrierSetAccess().getCommaKeyword_7_3_0());
                    	        
                    	    // ../ac.soton.xtext.context.dsl/src-gen/ac/soton/xtext/context/dsl/parser/antlr/internal/InternalContextDsl.g:1084:1: ( (lv_annotations_13_0= ruleAnnotation ) )
                    	    // ../ac.soton.xtext.context.dsl/src-gen/ac/soton/xtext/context/dsl/parser/antlr/internal/InternalContextDsl.g:1085:1: (lv_annotations_13_0= ruleAnnotation )
                    	    {
                    	    // ../ac.soton.xtext.context.dsl/src-gen/ac/soton/xtext/context/dsl/parser/antlr/internal/InternalContextDsl.g:1085:1: (lv_annotations_13_0= ruleAnnotation )
                    	    // ../ac.soton.xtext.context.dsl/src-gen/ac/soton/xtext/context/dsl/parser/antlr/internal/InternalContextDsl.g:1086:3: lv_annotations_13_0= ruleAnnotation
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getCarrierSetAccess().getAnnotationsAnnotationParserRuleCall_7_3_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleAnnotation_in_ruleCarrierSet2196);
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
                    	    break loop32;
                        }
                    } while (true);

                    otherlv_14=(Token)match(input,21,FollowSets000.FOLLOW_21_in_ruleCarrierSet2210); 

                        	newLeafNode(otherlv_14, grammarAccess.getCarrierSetAccess().getRightCurlyBracketKeyword_7_4());
                        

                    }
                    break;

            }

            // ../ac.soton.xtext.context.dsl/src-gen/ac/soton/xtext/context/dsl/parser/antlr/internal/InternalContextDsl.g:1106:3: (otherlv_15= 'extensions' otherlv_16= '{' ( (lv_extensions_17_0= ruleAbstractExtension ) ) (otherlv_18= ',' ( (lv_extensions_19_0= ruleAbstractExtension ) ) )* otherlv_20= '}' )?
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( (LA35_0==22) ) {
                alt35=1;
            }
            switch (alt35) {
                case 1 :
                    // ../ac.soton.xtext.context.dsl/src-gen/ac/soton/xtext/context/dsl/parser/antlr/internal/InternalContextDsl.g:1106:5: otherlv_15= 'extensions' otherlv_16= '{' ( (lv_extensions_17_0= ruleAbstractExtension ) ) (otherlv_18= ',' ( (lv_extensions_19_0= ruleAbstractExtension ) ) )* otherlv_20= '}'
                    {
                    otherlv_15=(Token)match(input,22,FollowSets000.FOLLOW_22_in_ruleCarrierSet2225); 

                        	newLeafNode(otherlv_15, grammarAccess.getCarrierSetAccess().getExtensionsKeyword_8_0());
                        
                    otherlv_16=(Token)match(input,13,FollowSets000.FOLLOW_13_in_ruleCarrierSet2237); 

                        	newLeafNode(otherlv_16, grammarAccess.getCarrierSetAccess().getLeftCurlyBracketKeyword_8_1());
                        
                    // ../ac.soton.xtext.context.dsl/src-gen/ac/soton/xtext/context/dsl/parser/antlr/internal/InternalContextDsl.g:1114:1: ( (lv_extensions_17_0= ruleAbstractExtension ) )
                    // ../ac.soton.xtext.context.dsl/src-gen/ac/soton/xtext/context/dsl/parser/antlr/internal/InternalContextDsl.g:1115:1: (lv_extensions_17_0= ruleAbstractExtension )
                    {
                    // ../ac.soton.xtext.context.dsl/src-gen/ac/soton/xtext/context/dsl/parser/antlr/internal/InternalContextDsl.g:1115:1: (lv_extensions_17_0= ruleAbstractExtension )
                    // ../ac.soton.xtext.context.dsl/src-gen/ac/soton/xtext/context/dsl/parser/antlr/internal/InternalContextDsl.g:1116:3: lv_extensions_17_0= ruleAbstractExtension
                    {
                     
                    	        newCompositeNode(grammarAccess.getCarrierSetAccess().getExtensionsAbstractExtensionParserRuleCall_8_2_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleAbstractExtension_in_ruleCarrierSet2258);
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

                    // ../ac.soton.xtext.context.dsl/src-gen/ac/soton/xtext/context/dsl/parser/antlr/internal/InternalContextDsl.g:1132:2: (otherlv_18= ',' ( (lv_extensions_19_0= ruleAbstractExtension ) ) )*
                    loop34:
                    do {
                        int alt34=2;
                        int LA34_0 = input.LA(1);

                        if ( (LA34_0==18) ) {
                            alt34=1;
                        }


                        switch (alt34) {
                    	case 1 :
                    	    // ../ac.soton.xtext.context.dsl/src-gen/ac/soton/xtext/context/dsl/parser/antlr/internal/InternalContextDsl.g:1132:4: otherlv_18= ',' ( (lv_extensions_19_0= ruleAbstractExtension ) )
                    	    {
                    	    otherlv_18=(Token)match(input,18,FollowSets000.FOLLOW_18_in_ruleCarrierSet2271); 

                    	        	newLeafNode(otherlv_18, grammarAccess.getCarrierSetAccess().getCommaKeyword_8_3_0());
                    	        
                    	    // ../ac.soton.xtext.context.dsl/src-gen/ac/soton/xtext/context/dsl/parser/antlr/internal/InternalContextDsl.g:1136:1: ( (lv_extensions_19_0= ruleAbstractExtension ) )
                    	    // ../ac.soton.xtext.context.dsl/src-gen/ac/soton/xtext/context/dsl/parser/antlr/internal/InternalContextDsl.g:1137:1: (lv_extensions_19_0= ruleAbstractExtension )
                    	    {
                    	    // ../ac.soton.xtext.context.dsl/src-gen/ac/soton/xtext/context/dsl/parser/antlr/internal/InternalContextDsl.g:1137:1: (lv_extensions_19_0= ruleAbstractExtension )
                    	    // ../ac.soton.xtext.context.dsl/src-gen/ac/soton/xtext/context/dsl/parser/antlr/internal/InternalContextDsl.g:1138:3: lv_extensions_19_0= ruleAbstractExtension
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getCarrierSetAccess().getExtensionsAbstractExtensionParserRuleCall_8_3_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleAbstractExtension_in_ruleCarrierSet2292);
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
                    	    break loop34;
                        }
                    } while (true);

                    otherlv_20=(Token)match(input,21,FollowSets000.FOLLOW_21_in_ruleCarrierSet2306); 

                        	newLeafNode(otherlv_20, grammarAccess.getCarrierSetAccess().getRightCurlyBracketKeyword_8_4());
                        

                    }
                    break;

            }

            // ../ac.soton.xtext.context.dsl/src-gen/ac/soton/xtext/context/dsl/parser/antlr/internal/InternalContextDsl.g:1158:3: (otherlv_21= 'attributes' otherlv_22= '{' ( (lv_attributes_23_0= ruleStringToAttributeMapEntry ) ) (otherlv_24= ',' ( (lv_attributes_25_0= ruleStringToAttributeMapEntry ) ) )* otherlv_26= '}' )?
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( (LA37_0==23) ) {
                alt37=1;
            }
            switch (alt37) {
                case 1 :
                    // ../ac.soton.xtext.context.dsl/src-gen/ac/soton/xtext/context/dsl/parser/antlr/internal/InternalContextDsl.g:1158:5: otherlv_21= 'attributes' otherlv_22= '{' ( (lv_attributes_23_0= ruleStringToAttributeMapEntry ) ) (otherlv_24= ',' ( (lv_attributes_25_0= ruleStringToAttributeMapEntry ) ) )* otherlv_26= '}'
                    {
                    otherlv_21=(Token)match(input,23,FollowSets000.FOLLOW_23_in_ruleCarrierSet2321); 

                        	newLeafNode(otherlv_21, grammarAccess.getCarrierSetAccess().getAttributesKeyword_9_0());
                        
                    otherlv_22=(Token)match(input,13,FollowSets000.FOLLOW_13_in_ruleCarrierSet2333); 

                        	newLeafNode(otherlv_22, grammarAccess.getCarrierSetAccess().getLeftCurlyBracketKeyword_9_1());
                        
                    // ../ac.soton.xtext.context.dsl/src-gen/ac/soton/xtext/context/dsl/parser/antlr/internal/InternalContextDsl.g:1166:1: ( (lv_attributes_23_0= ruleStringToAttributeMapEntry ) )
                    // ../ac.soton.xtext.context.dsl/src-gen/ac/soton/xtext/context/dsl/parser/antlr/internal/InternalContextDsl.g:1167:1: (lv_attributes_23_0= ruleStringToAttributeMapEntry )
                    {
                    // ../ac.soton.xtext.context.dsl/src-gen/ac/soton/xtext/context/dsl/parser/antlr/internal/InternalContextDsl.g:1167:1: (lv_attributes_23_0= ruleStringToAttributeMapEntry )
                    // ../ac.soton.xtext.context.dsl/src-gen/ac/soton/xtext/context/dsl/parser/antlr/internal/InternalContextDsl.g:1168:3: lv_attributes_23_0= ruleStringToAttributeMapEntry
                    {
                     
                    	        newCompositeNode(grammarAccess.getCarrierSetAccess().getAttributesStringToAttributeMapEntryParserRuleCall_9_2_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleStringToAttributeMapEntry_in_ruleCarrierSet2354);
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

                    // ../ac.soton.xtext.context.dsl/src-gen/ac/soton/xtext/context/dsl/parser/antlr/internal/InternalContextDsl.g:1184:2: (otherlv_24= ',' ( (lv_attributes_25_0= ruleStringToAttributeMapEntry ) ) )*
                    loop36:
                    do {
                        int alt36=2;
                        int LA36_0 = input.LA(1);

                        if ( (LA36_0==18) ) {
                            alt36=1;
                        }


                        switch (alt36) {
                    	case 1 :
                    	    // ../ac.soton.xtext.context.dsl/src-gen/ac/soton/xtext/context/dsl/parser/antlr/internal/InternalContextDsl.g:1184:4: otherlv_24= ',' ( (lv_attributes_25_0= ruleStringToAttributeMapEntry ) )
                    	    {
                    	    otherlv_24=(Token)match(input,18,FollowSets000.FOLLOW_18_in_ruleCarrierSet2367); 

                    	        	newLeafNode(otherlv_24, grammarAccess.getCarrierSetAccess().getCommaKeyword_9_3_0());
                    	        
                    	    // ../ac.soton.xtext.context.dsl/src-gen/ac/soton/xtext/context/dsl/parser/antlr/internal/InternalContextDsl.g:1188:1: ( (lv_attributes_25_0= ruleStringToAttributeMapEntry ) )
                    	    // ../ac.soton.xtext.context.dsl/src-gen/ac/soton/xtext/context/dsl/parser/antlr/internal/InternalContextDsl.g:1189:1: (lv_attributes_25_0= ruleStringToAttributeMapEntry )
                    	    {
                    	    // ../ac.soton.xtext.context.dsl/src-gen/ac/soton/xtext/context/dsl/parser/antlr/internal/InternalContextDsl.g:1189:1: (lv_attributes_25_0= ruleStringToAttributeMapEntry )
                    	    // ../ac.soton.xtext.context.dsl/src-gen/ac/soton/xtext/context/dsl/parser/antlr/internal/InternalContextDsl.g:1190:3: lv_attributes_25_0= ruleStringToAttributeMapEntry
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getCarrierSetAccess().getAttributesStringToAttributeMapEntryParserRuleCall_9_3_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleStringToAttributeMapEntry_in_ruleCarrierSet2388);
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
                    	    break loop36;
                        }
                    } while (true);

                    otherlv_26=(Token)match(input,21,FollowSets000.FOLLOW_21_in_ruleCarrierSet2402); 

                        	newLeafNode(otherlv_26, grammarAccess.getCarrierSetAccess().getRightCurlyBracketKeyword_9_4());
                        

                    }
                    break;

            }

            otherlv_27=(Token)match(input,21,FollowSets000.FOLLOW_21_in_ruleCarrierSet2416); 

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
    // ../ac.soton.xtext.context.dsl/src-gen/ac/soton/xtext/context/dsl/parser/antlr/internal/InternalContextDsl.g:1222:1: entryRuleConstant returns [EObject current=null] : iv_ruleConstant= ruleConstant EOF ;
    public final EObject entryRuleConstant() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConstant = null;


        try {
            // ../ac.soton.xtext.context.dsl/src-gen/ac/soton/xtext/context/dsl/parser/antlr/internal/InternalContextDsl.g:1223:2: (iv_ruleConstant= ruleConstant EOF )
            // ../ac.soton.xtext.context.dsl/src-gen/ac/soton/xtext/context/dsl/parser/antlr/internal/InternalContextDsl.g:1224:2: iv_ruleConstant= ruleConstant EOF
            {
             newCompositeNode(grammarAccess.getConstantRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleConstant_in_entryRuleConstant2452);
            iv_ruleConstant=ruleConstant();

            state._fsp--;

             current =iv_ruleConstant; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleConstant2462); 

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
    // ../ac.soton.xtext.context.dsl/src-gen/ac/soton/xtext/context/dsl/parser/antlr/internal/InternalContextDsl.g:1231:1: ruleConstant returns [EObject current=null] : ( () ( (lv_localGenerated_1_0= 'localGenerated' ) )? otherlv_2= 'Constant' ( (lv_name_3_0= ruleEString ) ) otherlv_4= '{' (otherlv_5= 'internalId' ( (lv_internalId_6_0= ruleEString ) ) )? (otherlv_7= 'comment' ( (lv_comment_8_0= ruleEString ) ) )? (otherlv_9= 'annotations' otherlv_10= '{' ( (lv_annotations_11_0= ruleAnnotation ) ) (otherlv_12= ',' ( (lv_annotations_13_0= ruleAnnotation ) ) )* otherlv_14= '}' )? (otherlv_15= 'extensions' otherlv_16= '{' ( (lv_extensions_17_0= ruleAbstractExtension ) ) (otherlv_18= ',' ( (lv_extensions_19_0= ruleAbstractExtension ) ) )* otherlv_20= '}' )? (otherlv_21= 'attributes' otherlv_22= '{' ( (lv_attributes_23_0= ruleStringToAttributeMapEntry ) ) (otherlv_24= ',' ( (lv_attributes_25_0= ruleStringToAttributeMapEntry ) ) )* otherlv_26= '}' )? otherlv_27= '}' ) ;
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
            // ../ac.soton.xtext.context.dsl/src-gen/ac/soton/xtext/context/dsl/parser/antlr/internal/InternalContextDsl.g:1234:28: ( ( () ( (lv_localGenerated_1_0= 'localGenerated' ) )? otherlv_2= 'Constant' ( (lv_name_3_0= ruleEString ) ) otherlv_4= '{' (otherlv_5= 'internalId' ( (lv_internalId_6_0= ruleEString ) ) )? (otherlv_7= 'comment' ( (lv_comment_8_0= ruleEString ) ) )? (otherlv_9= 'annotations' otherlv_10= '{' ( (lv_annotations_11_0= ruleAnnotation ) ) (otherlv_12= ',' ( (lv_annotations_13_0= ruleAnnotation ) ) )* otherlv_14= '}' )? (otherlv_15= 'extensions' otherlv_16= '{' ( (lv_extensions_17_0= ruleAbstractExtension ) ) (otherlv_18= ',' ( (lv_extensions_19_0= ruleAbstractExtension ) ) )* otherlv_20= '}' )? (otherlv_21= 'attributes' otherlv_22= '{' ( (lv_attributes_23_0= ruleStringToAttributeMapEntry ) ) (otherlv_24= ',' ( (lv_attributes_25_0= ruleStringToAttributeMapEntry ) ) )* otherlv_26= '}' )? otherlv_27= '}' ) )
            // ../ac.soton.xtext.context.dsl/src-gen/ac/soton/xtext/context/dsl/parser/antlr/internal/InternalContextDsl.g:1235:1: ( () ( (lv_localGenerated_1_0= 'localGenerated' ) )? otherlv_2= 'Constant' ( (lv_name_3_0= ruleEString ) ) otherlv_4= '{' (otherlv_5= 'internalId' ( (lv_internalId_6_0= ruleEString ) ) )? (otherlv_7= 'comment' ( (lv_comment_8_0= ruleEString ) ) )? (otherlv_9= 'annotations' otherlv_10= '{' ( (lv_annotations_11_0= ruleAnnotation ) ) (otherlv_12= ',' ( (lv_annotations_13_0= ruleAnnotation ) ) )* otherlv_14= '}' )? (otherlv_15= 'extensions' otherlv_16= '{' ( (lv_extensions_17_0= ruleAbstractExtension ) ) (otherlv_18= ',' ( (lv_extensions_19_0= ruleAbstractExtension ) ) )* otherlv_20= '}' )? (otherlv_21= 'attributes' otherlv_22= '{' ( (lv_attributes_23_0= ruleStringToAttributeMapEntry ) ) (otherlv_24= ',' ( (lv_attributes_25_0= ruleStringToAttributeMapEntry ) ) )* otherlv_26= '}' )? otherlv_27= '}' )
            {
            // ../ac.soton.xtext.context.dsl/src-gen/ac/soton/xtext/context/dsl/parser/antlr/internal/InternalContextDsl.g:1235:1: ( () ( (lv_localGenerated_1_0= 'localGenerated' ) )? otherlv_2= 'Constant' ( (lv_name_3_0= ruleEString ) ) otherlv_4= '{' (otherlv_5= 'internalId' ( (lv_internalId_6_0= ruleEString ) ) )? (otherlv_7= 'comment' ( (lv_comment_8_0= ruleEString ) ) )? (otherlv_9= 'annotations' otherlv_10= '{' ( (lv_annotations_11_0= ruleAnnotation ) ) (otherlv_12= ',' ( (lv_annotations_13_0= ruleAnnotation ) ) )* otherlv_14= '}' )? (otherlv_15= 'extensions' otherlv_16= '{' ( (lv_extensions_17_0= ruleAbstractExtension ) ) (otherlv_18= ',' ( (lv_extensions_19_0= ruleAbstractExtension ) ) )* otherlv_20= '}' )? (otherlv_21= 'attributes' otherlv_22= '{' ( (lv_attributes_23_0= ruleStringToAttributeMapEntry ) ) (otherlv_24= ',' ( (lv_attributes_25_0= ruleStringToAttributeMapEntry ) ) )* otherlv_26= '}' )? otherlv_27= '}' )
            // ../ac.soton.xtext.context.dsl/src-gen/ac/soton/xtext/context/dsl/parser/antlr/internal/InternalContextDsl.g:1235:2: () ( (lv_localGenerated_1_0= 'localGenerated' ) )? otherlv_2= 'Constant' ( (lv_name_3_0= ruleEString ) ) otherlv_4= '{' (otherlv_5= 'internalId' ( (lv_internalId_6_0= ruleEString ) ) )? (otherlv_7= 'comment' ( (lv_comment_8_0= ruleEString ) ) )? (otherlv_9= 'annotations' otherlv_10= '{' ( (lv_annotations_11_0= ruleAnnotation ) ) (otherlv_12= ',' ( (lv_annotations_13_0= ruleAnnotation ) ) )* otherlv_14= '}' )? (otherlv_15= 'extensions' otherlv_16= '{' ( (lv_extensions_17_0= ruleAbstractExtension ) ) (otherlv_18= ',' ( (lv_extensions_19_0= ruleAbstractExtension ) ) )* otherlv_20= '}' )? (otherlv_21= 'attributes' otherlv_22= '{' ( (lv_attributes_23_0= ruleStringToAttributeMapEntry ) ) (otherlv_24= ',' ( (lv_attributes_25_0= ruleStringToAttributeMapEntry ) ) )* otherlv_26= '}' )? otherlv_27= '}'
            {
            // ../ac.soton.xtext.context.dsl/src-gen/ac/soton/xtext/context/dsl/parser/antlr/internal/InternalContextDsl.g:1235:2: ()
            // ../ac.soton.xtext.context.dsl/src-gen/ac/soton/xtext/context/dsl/parser/antlr/internal/InternalContextDsl.g:1236:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getConstantAccess().getConstantAction_0(),
                        current);
                

            }

            // ../ac.soton.xtext.context.dsl/src-gen/ac/soton/xtext/context/dsl/parser/antlr/internal/InternalContextDsl.g:1241:2: ( (lv_localGenerated_1_0= 'localGenerated' ) )?
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( (LA38_0==11) ) {
                alt38=1;
            }
            switch (alt38) {
                case 1 :
                    // ../ac.soton.xtext.context.dsl/src-gen/ac/soton/xtext/context/dsl/parser/antlr/internal/InternalContextDsl.g:1242:1: (lv_localGenerated_1_0= 'localGenerated' )
                    {
                    // ../ac.soton.xtext.context.dsl/src-gen/ac/soton/xtext/context/dsl/parser/antlr/internal/InternalContextDsl.g:1242:1: (lv_localGenerated_1_0= 'localGenerated' )
                    // ../ac.soton.xtext.context.dsl/src-gen/ac/soton/xtext/context/dsl/parser/antlr/internal/InternalContextDsl.g:1243:3: lv_localGenerated_1_0= 'localGenerated'
                    {
                    lv_localGenerated_1_0=(Token)match(input,11,FollowSets000.FOLLOW_11_in_ruleConstant2514); 

                            newLeafNode(lv_localGenerated_1_0, grammarAccess.getConstantAccess().getLocalGeneratedLocalGeneratedKeyword_1_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getConstantRule());
                    	        }
                           		setWithLastConsumed(current, "localGenerated", true, "localGenerated");
                    	    

                    }


                    }
                    break;

            }

            otherlv_2=(Token)match(input,36,FollowSets000.FOLLOW_36_in_ruleConstant2540); 

                	newLeafNode(otherlv_2, grammarAccess.getConstantAccess().getConstantKeyword_2());
                
            // ../ac.soton.xtext.context.dsl/src-gen/ac/soton/xtext/context/dsl/parser/antlr/internal/InternalContextDsl.g:1260:1: ( (lv_name_3_0= ruleEString ) )
            // ../ac.soton.xtext.context.dsl/src-gen/ac/soton/xtext/context/dsl/parser/antlr/internal/InternalContextDsl.g:1261:1: (lv_name_3_0= ruleEString )
            {
            // ../ac.soton.xtext.context.dsl/src-gen/ac/soton/xtext/context/dsl/parser/antlr/internal/InternalContextDsl.g:1261:1: (lv_name_3_0= ruleEString )
            // ../ac.soton.xtext.context.dsl/src-gen/ac/soton/xtext/context/dsl/parser/antlr/internal/InternalContextDsl.g:1262:3: lv_name_3_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getConstantAccess().getNameEStringParserRuleCall_3_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleConstant2561);
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

            otherlv_4=(Token)match(input,13,FollowSets000.FOLLOW_13_in_ruleConstant2573); 

                	newLeafNode(otherlv_4, grammarAccess.getConstantAccess().getLeftCurlyBracketKeyword_4());
                
            // ../ac.soton.xtext.context.dsl/src-gen/ac/soton/xtext/context/dsl/parser/antlr/internal/InternalContextDsl.g:1282:1: (otherlv_5= 'internalId' ( (lv_internalId_6_0= ruleEString ) ) )?
            int alt39=2;
            int LA39_0 = input.LA(1);

            if ( (LA39_0==14) ) {
                alt39=1;
            }
            switch (alt39) {
                case 1 :
                    // ../ac.soton.xtext.context.dsl/src-gen/ac/soton/xtext/context/dsl/parser/antlr/internal/InternalContextDsl.g:1282:3: otherlv_5= 'internalId' ( (lv_internalId_6_0= ruleEString ) )
                    {
                    otherlv_5=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleConstant2586); 

                        	newLeafNode(otherlv_5, grammarAccess.getConstantAccess().getInternalIdKeyword_5_0());
                        
                    // ../ac.soton.xtext.context.dsl/src-gen/ac/soton/xtext/context/dsl/parser/antlr/internal/InternalContextDsl.g:1286:1: ( (lv_internalId_6_0= ruleEString ) )
                    // ../ac.soton.xtext.context.dsl/src-gen/ac/soton/xtext/context/dsl/parser/antlr/internal/InternalContextDsl.g:1287:1: (lv_internalId_6_0= ruleEString )
                    {
                    // ../ac.soton.xtext.context.dsl/src-gen/ac/soton/xtext/context/dsl/parser/antlr/internal/InternalContextDsl.g:1287:1: (lv_internalId_6_0= ruleEString )
                    // ../ac.soton.xtext.context.dsl/src-gen/ac/soton/xtext/context/dsl/parser/antlr/internal/InternalContextDsl.g:1288:3: lv_internalId_6_0= ruleEString
                    {
                     
                    	        newCompositeNode(grammarAccess.getConstantAccess().getInternalIdEStringParserRuleCall_5_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleConstant2607);
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

            // ../ac.soton.xtext.context.dsl/src-gen/ac/soton/xtext/context/dsl/parser/antlr/internal/InternalContextDsl.g:1304:4: (otherlv_7= 'comment' ( (lv_comment_8_0= ruleEString ) ) )?
            int alt40=2;
            int LA40_0 = input.LA(1);

            if ( (LA40_0==15) ) {
                alt40=1;
            }
            switch (alt40) {
                case 1 :
                    // ../ac.soton.xtext.context.dsl/src-gen/ac/soton/xtext/context/dsl/parser/antlr/internal/InternalContextDsl.g:1304:6: otherlv_7= 'comment' ( (lv_comment_8_0= ruleEString ) )
                    {
                    otherlv_7=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleConstant2622); 

                        	newLeafNode(otherlv_7, grammarAccess.getConstantAccess().getCommentKeyword_6_0());
                        
                    // ../ac.soton.xtext.context.dsl/src-gen/ac/soton/xtext/context/dsl/parser/antlr/internal/InternalContextDsl.g:1308:1: ( (lv_comment_8_0= ruleEString ) )
                    // ../ac.soton.xtext.context.dsl/src-gen/ac/soton/xtext/context/dsl/parser/antlr/internal/InternalContextDsl.g:1309:1: (lv_comment_8_0= ruleEString )
                    {
                    // ../ac.soton.xtext.context.dsl/src-gen/ac/soton/xtext/context/dsl/parser/antlr/internal/InternalContextDsl.g:1309:1: (lv_comment_8_0= ruleEString )
                    // ../ac.soton.xtext.context.dsl/src-gen/ac/soton/xtext/context/dsl/parser/antlr/internal/InternalContextDsl.g:1310:3: lv_comment_8_0= ruleEString
                    {
                     
                    	        newCompositeNode(grammarAccess.getConstantAccess().getCommentEStringParserRuleCall_6_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleConstant2643);
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

            // ../ac.soton.xtext.context.dsl/src-gen/ac/soton/xtext/context/dsl/parser/antlr/internal/InternalContextDsl.g:1326:4: (otherlv_9= 'annotations' otherlv_10= '{' ( (lv_annotations_11_0= ruleAnnotation ) ) (otherlv_12= ',' ( (lv_annotations_13_0= ruleAnnotation ) ) )* otherlv_14= '}' )?
            int alt42=2;
            int LA42_0 = input.LA(1);

            if ( (LA42_0==20) ) {
                alt42=1;
            }
            switch (alt42) {
                case 1 :
                    // ../ac.soton.xtext.context.dsl/src-gen/ac/soton/xtext/context/dsl/parser/antlr/internal/InternalContextDsl.g:1326:6: otherlv_9= 'annotations' otherlv_10= '{' ( (lv_annotations_11_0= ruleAnnotation ) ) (otherlv_12= ',' ( (lv_annotations_13_0= ruleAnnotation ) ) )* otherlv_14= '}'
                    {
                    otherlv_9=(Token)match(input,20,FollowSets000.FOLLOW_20_in_ruleConstant2658); 

                        	newLeafNode(otherlv_9, grammarAccess.getConstantAccess().getAnnotationsKeyword_7_0());
                        
                    otherlv_10=(Token)match(input,13,FollowSets000.FOLLOW_13_in_ruleConstant2670); 

                        	newLeafNode(otherlv_10, grammarAccess.getConstantAccess().getLeftCurlyBracketKeyword_7_1());
                        
                    // ../ac.soton.xtext.context.dsl/src-gen/ac/soton/xtext/context/dsl/parser/antlr/internal/InternalContextDsl.g:1334:1: ( (lv_annotations_11_0= ruleAnnotation ) )
                    // ../ac.soton.xtext.context.dsl/src-gen/ac/soton/xtext/context/dsl/parser/antlr/internal/InternalContextDsl.g:1335:1: (lv_annotations_11_0= ruleAnnotation )
                    {
                    // ../ac.soton.xtext.context.dsl/src-gen/ac/soton/xtext/context/dsl/parser/antlr/internal/InternalContextDsl.g:1335:1: (lv_annotations_11_0= ruleAnnotation )
                    // ../ac.soton.xtext.context.dsl/src-gen/ac/soton/xtext/context/dsl/parser/antlr/internal/InternalContextDsl.g:1336:3: lv_annotations_11_0= ruleAnnotation
                    {
                     
                    	        newCompositeNode(grammarAccess.getConstantAccess().getAnnotationsAnnotationParserRuleCall_7_2_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleAnnotation_in_ruleConstant2691);
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

                    // ../ac.soton.xtext.context.dsl/src-gen/ac/soton/xtext/context/dsl/parser/antlr/internal/InternalContextDsl.g:1352:2: (otherlv_12= ',' ( (lv_annotations_13_0= ruleAnnotation ) ) )*
                    loop41:
                    do {
                        int alt41=2;
                        int LA41_0 = input.LA(1);

                        if ( (LA41_0==18) ) {
                            alt41=1;
                        }


                        switch (alt41) {
                    	case 1 :
                    	    // ../ac.soton.xtext.context.dsl/src-gen/ac/soton/xtext/context/dsl/parser/antlr/internal/InternalContextDsl.g:1352:4: otherlv_12= ',' ( (lv_annotations_13_0= ruleAnnotation ) )
                    	    {
                    	    otherlv_12=(Token)match(input,18,FollowSets000.FOLLOW_18_in_ruleConstant2704); 

                    	        	newLeafNode(otherlv_12, grammarAccess.getConstantAccess().getCommaKeyword_7_3_0());
                    	        
                    	    // ../ac.soton.xtext.context.dsl/src-gen/ac/soton/xtext/context/dsl/parser/antlr/internal/InternalContextDsl.g:1356:1: ( (lv_annotations_13_0= ruleAnnotation ) )
                    	    // ../ac.soton.xtext.context.dsl/src-gen/ac/soton/xtext/context/dsl/parser/antlr/internal/InternalContextDsl.g:1357:1: (lv_annotations_13_0= ruleAnnotation )
                    	    {
                    	    // ../ac.soton.xtext.context.dsl/src-gen/ac/soton/xtext/context/dsl/parser/antlr/internal/InternalContextDsl.g:1357:1: (lv_annotations_13_0= ruleAnnotation )
                    	    // ../ac.soton.xtext.context.dsl/src-gen/ac/soton/xtext/context/dsl/parser/antlr/internal/InternalContextDsl.g:1358:3: lv_annotations_13_0= ruleAnnotation
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getConstantAccess().getAnnotationsAnnotationParserRuleCall_7_3_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleAnnotation_in_ruleConstant2725);
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
                    	    break loop41;
                        }
                    } while (true);

                    otherlv_14=(Token)match(input,21,FollowSets000.FOLLOW_21_in_ruleConstant2739); 

                        	newLeafNode(otherlv_14, grammarAccess.getConstantAccess().getRightCurlyBracketKeyword_7_4());
                        

                    }
                    break;

            }

            // ../ac.soton.xtext.context.dsl/src-gen/ac/soton/xtext/context/dsl/parser/antlr/internal/InternalContextDsl.g:1378:3: (otherlv_15= 'extensions' otherlv_16= '{' ( (lv_extensions_17_0= ruleAbstractExtension ) ) (otherlv_18= ',' ( (lv_extensions_19_0= ruleAbstractExtension ) ) )* otherlv_20= '}' )?
            int alt44=2;
            int LA44_0 = input.LA(1);

            if ( (LA44_0==22) ) {
                alt44=1;
            }
            switch (alt44) {
                case 1 :
                    // ../ac.soton.xtext.context.dsl/src-gen/ac/soton/xtext/context/dsl/parser/antlr/internal/InternalContextDsl.g:1378:5: otherlv_15= 'extensions' otherlv_16= '{' ( (lv_extensions_17_0= ruleAbstractExtension ) ) (otherlv_18= ',' ( (lv_extensions_19_0= ruleAbstractExtension ) ) )* otherlv_20= '}'
                    {
                    otherlv_15=(Token)match(input,22,FollowSets000.FOLLOW_22_in_ruleConstant2754); 

                        	newLeafNode(otherlv_15, grammarAccess.getConstantAccess().getExtensionsKeyword_8_0());
                        
                    otherlv_16=(Token)match(input,13,FollowSets000.FOLLOW_13_in_ruleConstant2766); 

                        	newLeafNode(otherlv_16, grammarAccess.getConstantAccess().getLeftCurlyBracketKeyword_8_1());
                        
                    // ../ac.soton.xtext.context.dsl/src-gen/ac/soton/xtext/context/dsl/parser/antlr/internal/InternalContextDsl.g:1386:1: ( (lv_extensions_17_0= ruleAbstractExtension ) )
                    // ../ac.soton.xtext.context.dsl/src-gen/ac/soton/xtext/context/dsl/parser/antlr/internal/InternalContextDsl.g:1387:1: (lv_extensions_17_0= ruleAbstractExtension )
                    {
                    // ../ac.soton.xtext.context.dsl/src-gen/ac/soton/xtext/context/dsl/parser/antlr/internal/InternalContextDsl.g:1387:1: (lv_extensions_17_0= ruleAbstractExtension )
                    // ../ac.soton.xtext.context.dsl/src-gen/ac/soton/xtext/context/dsl/parser/antlr/internal/InternalContextDsl.g:1388:3: lv_extensions_17_0= ruleAbstractExtension
                    {
                     
                    	        newCompositeNode(grammarAccess.getConstantAccess().getExtensionsAbstractExtensionParserRuleCall_8_2_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleAbstractExtension_in_ruleConstant2787);
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

                    // ../ac.soton.xtext.context.dsl/src-gen/ac/soton/xtext/context/dsl/parser/antlr/internal/InternalContextDsl.g:1404:2: (otherlv_18= ',' ( (lv_extensions_19_0= ruleAbstractExtension ) ) )*
                    loop43:
                    do {
                        int alt43=2;
                        int LA43_0 = input.LA(1);

                        if ( (LA43_0==18) ) {
                            alt43=1;
                        }


                        switch (alt43) {
                    	case 1 :
                    	    // ../ac.soton.xtext.context.dsl/src-gen/ac/soton/xtext/context/dsl/parser/antlr/internal/InternalContextDsl.g:1404:4: otherlv_18= ',' ( (lv_extensions_19_0= ruleAbstractExtension ) )
                    	    {
                    	    otherlv_18=(Token)match(input,18,FollowSets000.FOLLOW_18_in_ruleConstant2800); 

                    	        	newLeafNode(otherlv_18, grammarAccess.getConstantAccess().getCommaKeyword_8_3_0());
                    	        
                    	    // ../ac.soton.xtext.context.dsl/src-gen/ac/soton/xtext/context/dsl/parser/antlr/internal/InternalContextDsl.g:1408:1: ( (lv_extensions_19_0= ruleAbstractExtension ) )
                    	    // ../ac.soton.xtext.context.dsl/src-gen/ac/soton/xtext/context/dsl/parser/antlr/internal/InternalContextDsl.g:1409:1: (lv_extensions_19_0= ruleAbstractExtension )
                    	    {
                    	    // ../ac.soton.xtext.context.dsl/src-gen/ac/soton/xtext/context/dsl/parser/antlr/internal/InternalContextDsl.g:1409:1: (lv_extensions_19_0= ruleAbstractExtension )
                    	    // ../ac.soton.xtext.context.dsl/src-gen/ac/soton/xtext/context/dsl/parser/antlr/internal/InternalContextDsl.g:1410:3: lv_extensions_19_0= ruleAbstractExtension
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getConstantAccess().getExtensionsAbstractExtensionParserRuleCall_8_3_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleAbstractExtension_in_ruleConstant2821);
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
                    	    break loop43;
                        }
                    } while (true);

                    otherlv_20=(Token)match(input,21,FollowSets000.FOLLOW_21_in_ruleConstant2835); 

                        	newLeafNode(otherlv_20, grammarAccess.getConstantAccess().getRightCurlyBracketKeyword_8_4());
                        

                    }
                    break;

            }

            // ../ac.soton.xtext.context.dsl/src-gen/ac/soton/xtext/context/dsl/parser/antlr/internal/InternalContextDsl.g:1430:3: (otherlv_21= 'attributes' otherlv_22= '{' ( (lv_attributes_23_0= ruleStringToAttributeMapEntry ) ) (otherlv_24= ',' ( (lv_attributes_25_0= ruleStringToAttributeMapEntry ) ) )* otherlv_26= '}' )?
            int alt46=2;
            int LA46_0 = input.LA(1);

            if ( (LA46_0==23) ) {
                alt46=1;
            }
            switch (alt46) {
                case 1 :
                    // ../ac.soton.xtext.context.dsl/src-gen/ac/soton/xtext/context/dsl/parser/antlr/internal/InternalContextDsl.g:1430:5: otherlv_21= 'attributes' otherlv_22= '{' ( (lv_attributes_23_0= ruleStringToAttributeMapEntry ) ) (otherlv_24= ',' ( (lv_attributes_25_0= ruleStringToAttributeMapEntry ) ) )* otherlv_26= '}'
                    {
                    otherlv_21=(Token)match(input,23,FollowSets000.FOLLOW_23_in_ruleConstant2850); 

                        	newLeafNode(otherlv_21, grammarAccess.getConstantAccess().getAttributesKeyword_9_0());
                        
                    otherlv_22=(Token)match(input,13,FollowSets000.FOLLOW_13_in_ruleConstant2862); 

                        	newLeafNode(otherlv_22, grammarAccess.getConstantAccess().getLeftCurlyBracketKeyword_9_1());
                        
                    // ../ac.soton.xtext.context.dsl/src-gen/ac/soton/xtext/context/dsl/parser/antlr/internal/InternalContextDsl.g:1438:1: ( (lv_attributes_23_0= ruleStringToAttributeMapEntry ) )
                    // ../ac.soton.xtext.context.dsl/src-gen/ac/soton/xtext/context/dsl/parser/antlr/internal/InternalContextDsl.g:1439:1: (lv_attributes_23_0= ruleStringToAttributeMapEntry )
                    {
                    // ../ac.soton.xtext.context.dsl/src-gen/ac/soton/xtext/context/dsl/parser/antlr/internal/InternalContextDsl.g:1439:1: (lv_attributes_23_0= ruleStringToAttributeMapEntry )
                    // ../ac.soton.xtext.context.dsl/src-gen/ac/soton/xtext/context/dsl/parser/antlr/internal/InternalContextDsl.g:1440:3: lv_attributes_23_0= ruleStringToAttributeMapEntry
                    {
                     
                    	        newCompositeNode(grammarAccess.getConstantAccess().getAttributesStringToAttributeMapEntryParserRuleCall_9_2_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleStringToAttributeMapEntry_in_ruleConstant2883);
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

                    // ../ac.soton.xtext.context.dsl/src-gen/ac/soton/xtext/context/dsl/parser/antlr/internal/InternalContextDsl.g:1456:2: (otherlv_24= ',' ( (lv_attributes_25_0= ruleStringToAttributeMapEntry ) ) )*
                    loop45:
                    do {
                        int alt45=2;
                        int LA45_0 = input.LA(1);

                        if ( (LA45_0==18) ) {
                            alt45=1;
                        }


                        switch (alt45) {
                    	case 1 :
                    	    // ../ac.soton.xtext.context.dsl/src-gen/ac/soton/xtext/context/dsl/parser/antlr/internal/InternalContextDsl.g:1456:4: otherlv_24= ',' ( (lv_attributes_25_0= ruleStringToAttributeMapEntry ) )
                    	    {
                    	    otherlv_24=(Token)match(input,18,FollowSets000.FOLLOW_18_in_ruleConstant2896); 

                    	        	newLeafNode(otherlv_24, grammarAccess.getConstantAccess().getCommaKeyword_9_3_0());
                    	        
                    	    // ../ac.soton.xtext.context.dsl/src-gen/ac/soton/xtext/context/dsl/parser/antlr/internal/InternalContextDsl.g:1460:1: ( (lv_attributes_25_0= ruleStringToAttributeMapEntry ) )
                    	    // ../ac.soton.xtext.context.dsl/src-gen/ac/soton/xtext/context/dsl/parser/antlr/internal/InternalContextDsl.g:1461:1: (lv_attributes_25_0= ruleStringToAttributeMapEntry )
                    	    {
                    	    // ../ac.soton.xtext.context.dsl/src-gen/ac/soton/xtext/context/dsl/parser/antlr/internal/InternalContextDsl.g:1461:1: (lv_attributes_25_0= ruleStringToAttributeMapEntry )
                    	    // ../ac.soton.xtext.context.dsl/src-gen/ac/soton/xtext/context/dsl/parser/antlr/internal/InternalContextDsl.g:1462:3: lv_attributes_25_0= ruleStringToAttributeMapEntry
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getConstantAccess().getAttributesStringToAttributeMapEntryParserRuleCall_9_3_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleStringToAttributeMapEntry_in_ruleConstant2917);
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
                    	    break loop45;
                        }
                    } while (true);

                    otherlv_26=(Token)match(input,21,FollowSets000.FOLLOW_21_in_ruleConstant2931); 

                        	newLeafNode(otherlv_26, grammarAccess.getConstantAccess().getRightCurlyBracketKeyword_9_4());
                        

                    }
                    break;

            }

            otherlv_27=(Token)match(input,21,FollowSets000.FOLLOW_21_in_ruleConstant2945); 

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
    // ../ac.soton.xtext.context.dsl/src-gen/ac/soton/xtext/context/dsl/parser/antlr/internal/InternalContextDsl.g:1494:1: entryRuleAxiom returns [EObject current=null] : iv_ruleAxiom= ruleAxiom EOF ;
    public final EObject entryRuleAxiom() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAxiom = null;


        try {
            // ../ac.soton.xtext.context.dsl/src-gen/ac/soton/xtext/context/dsl/parser/antlr/internal/InternalContextDsl.g:1495:2: (iv_ruleAxiom= ruleAxiom EOF )
            // ../ac.soton.xtext.context.dsl/src-gen/ac/soton/xtext/context/dsl/parser/antlr/internal/InternalContextDsl.g:1496:2: iv_ruleAxiom= ruleAxiom EOF
            {
             newCompositeNode(grammarAccess.getAxiomRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleAxiom_in_entryRuleAxiom2981);
            iv_ruleAxiom=ruleAxiom();

            state._fsp--;

             current =iv_ruleAxiom; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleAxiom2991); 

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
    // ../ac.soton.xtext.context.dsl/src-gen/ac/soton/xtext/context/dsl/parser/antlr/internal/InternalContextDsl.g:1503:1: ruleAxiom returns [EObject current=null] : ( ( (lv_localGenerated_0_0= 'localGenerated' ) )? ( (lv_theorem_1_0= 'theorem' ) ) otherlv_2= 'Axiom' ( (lv_name_3_0= ruleEString ) ) otherlv_4= '{' (otherlv_5= 'internalId' ( (lv_internalId_6_0= ruleEString ) ) )? (otherlv_7= 'comment' ( (lv_comment_8_0= ruleEString ) ) )? otherlv_9= 'predicate' ( (lv_predicate_10_0= ruleEString ) ) (otherlv_11= 'annotations' otherlv_12= '{' ( (lv_annotations_13_0= ruleAnnotation ) ) (otherlv_14= ',' ( (lv_annotations_15_0= ruleAnnotation ) ) )* otherlv_16= '}' )? (otherlv_17= 'extensions' otherlv_18= '{' ( (lv_extensions_19_0= ruleAbstractExtension ) ) (otherlv_20= ',' ( (lv_extensions_21_0= ruleAbstractExtension ) ) )* otherlv_22= '}' )? (otherlv_23= 'attributes' otherlv_24= '{' ( (lv_attributes_25_0= ruleStringToAttributeMapEntry ) ) (otherlv_26= ',' ( (lv_attributes_27_0= ruleStringToAttributeMapEntry ) ) )* otherlv_28= '}' )? otherlv_29= '}' ) ;
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
            // ../ac.soton.xtext.context.dsl/src-gen/ac/soton/xtext/context/dsl/parser/antlr/internal/InternalContextDsl.g:1506:28: ( ( ( (lv_localGenerated_0_0= 'localGenerated' ) )? ( (lv_theorem_1_0= 'theorem' ) ) otherlv_2= 'Axiom' ( (lv_name_3_0= ruleEString ) ) otherlv_4= '{' (otherlv_5= 'internalId' ( (lv_internalId_6_0= ruleEString ) ) )? (otherlv_7= 'comment' ( (lv_comment_8_0= ruleEString ) ) )? otherlv_9= 'predicate' ( (lv_predicate_10_0= ruleEString ) ) (otherlv_11= 'annotations' otherlv_12= '{' ( (lv_annotations_13_0= ruleAnnotation ) ) (otherlv_14= ',' ( (lv_annotations_15_0= ruleAnnotation ) ) )* otherlv_16= '}' )? (otherlv_17= 'extensions' otherlv_18= '{' ( (lv_extensions_19_0= ruleAbstractExtension ) ) (otherlv_20= ',' ( (lv_extensions_21_0= ruleAbstractExtension ) ) )* otherlv_22= '}' )? (otherlv_23= 'attributes' otherlv_24= '{' ( (lv_attributes_25_0= ruleStringToAttributeMapEntry ) ) (otherlv_26= ',' ( (lv_attributes_27_0= ruleStringToAttributeMapEntry ) ) )* otherlv_28= '}' )? otherlv_29= '}' ) )
            // ../ac.soton.xtext.context.dsl/src-gen/ac/soton/xtext/context/dsl/parser/antlr/internal/InternalContextDsl.g:1507:1: ( ( (lv_localGenerated_0_0= 'localGenerated' ) )? ( (lv_theorem_1_0= 'theorem' ) ) otherlv_2= 'Axiom' ( (lv_name_3_0= ruleEString ) ) otherlv_4= '{' (otherlv_5= 'internalId' ( (lv_internalId_6_0= ruleEString ) ) )? (otherlv_7= 'comment' ( (lv_comment_8_0= ruleEString ) ) )? otherlv_9= 'predicate' ( (lv_predicate_10_0= ruleEString ) ) (otherlv_11= 'annotations' otherlv_12= '{' ( (lv_annotations_13_0= ruleAnnotation ) ) (otherlv_14= ',' ( (lv_annotations_15_0= ruleAnnotation ) ) )* otherlv_16= '}' )? (otherlv_17= 'extensions' otherlv_18= '{' ( (lv_extensions_19_0= ruleAbstractExtension ) ) (otherlv_20= ',' ( (lv_extensions_21_0= ruleAbstractExtension ) ) )* otherlv_22= '}' )? (otherlv_23= 'attributes' otherlv_24= '{' ( (lv_attributes_25_0= ruleStringToAttributeMapEntry ) ) (otherlv_26= ',' ( (lv_attributes_27_0= ruleStringToAttributeMapEntry ) ) )* otherlv_28= '}' )? otherlv_29= '}' )
            {
            // ../ac.soton.xtext.context.dsl/src-gen/ac/soton/xtext/context/dsl/parser/antlr/internal/InternalContextDsl.g:1507:1: ( ( (lv_localGenerated_0_0= 'localGenerated' ) )? ( (lv_theorem_1_0= 'theorem' ) ) otherlv_2= 'Axiom' ( (lv_name_3_0= ruleEString ) ) otherlv_4= '{' (otherlv_5= 'internalId' ( (lv_internalId_6_0= ruleEString ) ) )? (otherlv_7= 'comment' ( (lv_comment_8_0= ruleEString ) ) )? otherlv_9= 'predicate' ( (lv_predicate_10_0= ruleEString ) ) (otherlv_11= 'annotations' otherlv_12= '{' ( (lv_annotations_13_0= ruleAnnotation ) ) (otherlv_14= ',' ( (lv_annotations_15_0= ruleAnnotation ) ) )* otherlv_16= '}' )? (otherlv_17= 'extensions' otherlv_18= '{' ( (lv_extensions_19_0= ruleAbstractExtension ) ) (otherlv_20= ',' ( (lv_extensions_21_0= ruleAbstractExtension ) ) )* otherlv_22= '}' )? (otherlv_23= 'attributes' otherlv_24= '{' ( (lv_attributes_25_0= ruleStringToAttributeMapEntry ) ) (otherlv_26= ',' ( (lv_attributes_27_0= ruleStringToAttributeMapEntry ) ) )* otherlv_28= '}' )? otherlv_29= '}' )
            // ../ac.soton.xtext.context.dsl/src-gen/ac/soton/xtext/context/dsl/parser/antlr/internal/InternalContextDsl.g:1507:2: ( (lv_localGenerated_0_0= 'localGenerated' ) )? ( (lv_theorem_1_0= 'theorem' ) ) otherlv_2= 'Axiom' ( (lv_name_3_0= ruleEString ) ) otherlv_4= '{' (otherlv_5= 'internalId' ( (lv_internalId_6_0= ruleEString ) ) )? (otherlv_7= 'comment' ( (lv_comment_8_0= ruleEString ) ) )? otherlv_9= 'predicate' ( (lv_predicate_10_0= ruleEString ) ) (otherlv_11= 'annotations' otherlv_12= '{' ( (lv_annotations_13_0= ruleAnnotation ) ) (otherlv_14= ',' ( (lv_annotations_15_0= ruleAnnotation ) ) )* otherlv_16= '}' )? (otherlv_17= 'extensions' otherlv_18= '{' ( (lv_extensions_19_0= ruleAbstractExtension ) ) (otherlv_20= ',' ( (lv_extensions_21_0= ruleAbstractExtension ) ) )* otherlv_22= '}' )? (otherlv_23= 'attributes' otherlv_24= '{' ( (lv_attributes_25_0= ruleStringToAttributeMapEntry ) ) (otherlv_26= ',' ( (lv_attributes_27_0= ruleStringToAttributeMapEntry ) ) )* otherlv_28= '}' )? otherlv_29= '}'
            {
            // ../ac.soton.xtext.context.dsl/src-gen/ac/soton/xtext/context/dsl/parser/antlr/internal/InternalContextDsl.g:1507:2: ( (lv_localGenerated_0_0= 'localGenerated' ) )?
            int alt47=2;
            int LA47_0 = input.LA(1);

            if ( (LA47_0==11) ) {
                alt47=1;
            }
            switch (alt47) {
                case 1 :
                    // ../ac.soton.xtext.context.dsl/src-gen/ac/soton/xtext/context/dsl/parser/antlr/internal/InternalContextDsl.g:1508:1: (lv_localGenerated_0_0= 'localGenerated' )
                    {
                    // ../ac.soton.xtext.context.dsl/src-gen/ac/soton/xtext/context/dsl/parser/antlr/internal/InternalContextDsl.g:1508:1: (lv_localGenerated_0_0= 'localGenerated' )
                    // ../ac.soton.xtext.context.dsl/src-gen/ac/soton/xtext/context/dsl/parser/antlr/internal/InternalContextDsl.g:1509:3: lv_localGenerated_0_0= 'localGenerated'
                    {
                    lv_localGenerated_0_0=(Token)match(input,11,FollowSets000.FOLLOW_11_in_ruleAxiom3034); 

                            newLeafNode(lv_localGenerated_0_0, grammarAccess.getAxiomAccess().getLocalGeneratedLocalGeneratedKeyword_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getAxiomRule());
                    	        }
                           		setWithLastConsumed(current, "localGenerated", true, "localGenerated");
                    	    

                    }


                    }
                    break;

            }

            // ../ac.soton.xtext.context.dsl/src-gen/ac/soton/xtext/context/dsl/parser/antlr/internal/InternalContextDsl.g:1522:3: ( (lv_theorem_1_0= 'theorem' ) )
            // ../ac.soton.xtext.context.dsl/src-gen/ac/soton/xtext/context/dsl/parser/antlr/internal/InternalContextDsl.g:1523:1: (lv_theorem_1_0= 'theorem' )
            {
            // ../ac.soton.xtext.context.dsl/src-gen/ac/soton/xtext/context/dsl/parser/antlr/internal/InternalContextDsl.g:1523:1: (lv_theorem_1_0= 'theorem' )
            // ../ac.soton.xtext.context.dsl/src-gen/ac/soton/xtext/context/dsl/parser/antlr/internal/InternalContextDsl.g:1524:3: lv_theorem_1_0= 'theorem'
            {
            lv_theorem_1_0=(Token)match(input,37,FollowSets000.FOLLOW_37_in_ruleAxiom3066); 

                    newLeafNode(lv_theorem_1_0, grammarAccess.getAxiomAccess().getTheoremTheoremKeyword_1_0());
                

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getAxiomRule());
            	        }
                   		setWithLastConsumed(current, "theorem", true, "theorem");
            	    

            }


            }

            otherlv_2=(Token)match(input,38,FollowSets000.FOLLOW_38_in_ruleAxiom3091); 

                	newLeafNode(otherlv_2, grammarAccess.getAxiomAccess().getAxiomKeyword_2());
                
            // ../ac.soton.xtext.context.dsl/src-gen/ac/soton/xtext/context/dsl/parser/antlr/internal/InternalContextDsl.g:1541:1: ( (lv_name_3_0= ruleEString ) )
            // ../ac.soton.xtext.context.dsl/src-gen/ac/soton/xtext/context/dsl/parser/antlr/internal/InternalContextDsl.g:1542:1: (lv_name_3_0= ruleEString )
            {
            // ../ac.soton.xtext.context.dsl/src-gen/ac/soton/xtext/context/dsl/parser/antlr/internal/InternalContextDsl.g:1542:1: (lv_name_3_0= ruleEString )
            // ../ac.soton.xtext.context.dsl/src-gen/ac/soton/xtext/context/dsl/parser/antlr/internal/InternalContextDsl.g:1543:3: lv_name_3_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getAxiomAccess().getNameEStringParserRuleCall_3_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleAxiom3112);
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

            otherlv_4=(Token)match(input,13,FollowSets000.FOLLOW_13_in_ruleAxiom3124); 

                	newLeafNode(otherlv_4, grammarAccess.getAxiomAccess().getLeftCurlyBracketKeyword_4());
                
            // ../ac.soton.xtext.context.dsl/src-gen/ac/soton/xtext/context/dsl/parser/antlr/internal/InternalContextDsl.g:1563:1: (otherlv_5= 'internalId' ( (lv_internalId_6_0= ruleEString ) ) )?
            int alt48=2;
            int LA48_0 = input.LA(1);

            if ( (LA48_0==14) ) {
                alt48=1;
            }
            switch (alt48) {
                case 1 :
                    // ../ac.soton.xtext.context.dsl/src-gen/ac/soton/xtext/context/dsl/parser/antlr/internal/InternalContextDsl.g:1563:3: otherlv_5= 'internalId' ( (lv_internalId_6_0= ruleEString ) )
                    {
                    otherlv_5=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleAxiom3137); 

                        	newLeafNode(otherlv_5, grammarAccess.getAxiomAccess().getInternalIdKeyword_5_0());
                        
                    // ../ac.soton.xtext.context.dsl/src-gen/ac/soton/xtext/context/dsl/parser/antlr/internal/InternalContextDsl.g:1567:1: ( (lv_internalId_6_0= ruleEString ) )
                    // ../ac.soton.xtext.context.dsl/src-gen/ac/soton/xtext/context/dsl/parser/antlr/internal/InternalContextDsl.g:1568:1: (lv_internalId_6_0= ruleEString )
                    {
                    // ../ac.soton.xtext.context.dsl/src-gen/ac/soton/xtext/context/dsl/parser/antlr/internal/InternalContextDsl.g:1568:1: (lv_internalId_6_0= ruleEString )
                    // ../ac.soton.xtext.context.dsl/src-gen/ac/soton/xtext/context/dsl/parser/antlr/internal/InternalContextDsl.g:1569:3: lv_internalId_6_0= ruleEString
                    {
                     
                    	        newCompositeNode(grammarAccess.getAxiomAccess().getInternalIdEStringParserRuleCall_5_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleAxiom3158);
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

            // ../ac.soton.xtext.context.dsl/src-gen/ac/soton/xtext/context/dsl/parser/antlr/internal/InternalContextDsl.g:1585:4: (otherlv_7= 'comment' ( (lv_comment_8_0= ruleEString ) ) )?
            int alt49=2;
            int LA49_0 = input.LA(1);

            if ( (LA49_0==15) ) {
                alt49=1;
            }
            switch (alt49) {
                case 1 :
                    // ../ac.soton.xtext.context.dsl/src-gen/ac/soton/xtext/context/dsl/parser/antlr/internal/InternalContextDsl.g:1585:6: otherlv_7= 'comment' ( (lv_comment_8_0= ruleEString ) )
                    {
                    otherlv_7=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleAxiom3173); 

                        	newLeafNode(otherlv_7, grammarAccess.getAxiomAccess().getCommentKeyword_6_0());
                        
                    // ../ac.soton.xtext.context.dsl/src-gen/ac/soton/xtext/context/dsl/parser/antlr/internal/InternalContextDsl.g:1589:1: ( (lv_comment_8_0= ruleEString ) )
                    // ../ac.soton.xtext.context.dsl/src-gen/ac/soton/xtext/context/dsl/parser/antlr/internal/InternalContextDsl.g:1590:1: (lv_comment_8_0= ruleEString )
                    {
                    // ../ac.soton.xtext.context.dsl/src-gen/ac/soton/xtext/context/dsl/parser/antlr/internal/InternalContextDsl.g:1590:1: (lv_comment_8_0= ruleEString )
                    // ../ac.soton.xtext.context.dsl/src-gen/ac/soton/xtext/context/dsl/parser/antlr/internal/InternalContextDsl.g:1591:3: lv_comment_8_0= ruleEString
                    {
                     
                    	        newCompositeNode(grammarAccess.getAxiomAccess().getCommentEStringParserRuleCall_6_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleAxiom3194);
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

            otherlv_9=(Token)match(input,39,FollowSets000.FOLLOW_39_in_ruleAxiom3208); 

                	newLeafNode(otherlv_9, grammarAccess.getAxiomAccess().getPredicateKeyword_7());
                
            // ../ac.soton.xtext.context.dsl/src-gen/ac/soton/xtext/context/dsl/parser/antlr/internal/InternalContextDsl.g:1611:1: ( (lv_predicate_10_0= ruleEString ) )
            // ../ac.soton.xtext.context.dsl/src-gen/ac/soton/xtext/context/dsl/parser/antlr/internal/InternalContextDsl.g:1612:1: (lv_predicate_10_0= ruleEString )
            {
            // ../ac.soton.xtext.context.dsl/src-gen/ac/soton/xtext/context/dsl/parser/antlr/internal/InternalContextDsl.g:1612:1: (lv_predicate_10_0= ruleEString )
            // ../ac.soton.xtext.context.dsl/src-gen/ac/soton/xtext/context/dsl/parser/antlr/internal/InternalContextDsl.g:1613:3: lv_predicate_10_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getAxiomAccess().getPredicateEStringParserRuleCall_8_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleAxiom3229);
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

            // ../ac.soton.xtext.context.dsl/src-gen/ac/soton/xtext/context/dsl/parser/antlr/internal/InternalContextDsl.g:1629:2: (otherlv_11= 'annotations' otherlv_12= '{' ( (lv_annotations_13_0= ruleAnnotation ) ) (otherlv_14= ',' ( (lv_annotations_15_0= ruleAnnotation ) ) )* otherlv_16= '}' )?
            int alt51=2;
            int LA51_0 = input.LA(1);

            if ( (LA51_0==20) ) {
                alt51=1;
            }
            switch (alt51) {
                case 1 :
                    // ../ac.soton.xtext.context.dsl/src-gen/ac/soton/xtext/context/dsl/parser/antlr/internal/InternalContextDsl.g:1629:4: otherlv_11= 'annotations' otherlv_12= '{' ( (lv_annotations_13_0= ruleAnnotation ) ) (otherlv_14= ',' ( (lv_annotations_15_0= ruleAnnotation ) ) )* otherlv_16= '}'
                    {
                    otherlv_11=(Token)match(input,20,FollowSets000.FOLLOW_20_in_ruleAxiom3242); 

                        	newLeafNode(otherlv_11, grammarAccess.getAxiomAccess().getAnnotationsKeyword_9_0());
                        
                    otherlv_12=(Token)match(input,13,FollowSets000.FOLLOW_13_in_ruleAxiom3254); 

                        	newLeafNode(otherlv_12, grammarAccess.getAxiomAccess().getLeftCurlyBracketKeyword_9_1());
                        
                    // ../ac.soton.xtext.context.dsl/src-gen/ac/soton/xtext/context/dsl/parser/antlr/internal/InternalContextDsl.g:1637:1: ( (lv_annotations_13_0= ruleAnnotation ) )
                    // ../ac.soton.xtext.context.dsl/src-gen/ac/soton/xtext/context/dsl/parser/antlr/internal/InternalContextDsl.g:1638:1: (lv_annotations_13_0= ruleAnnotation )
                    {
                    // ../ac.soton.xtext.context.dsl/src-gen/ac/soton/xtext/context/dsl/parser/antlr/internal/InternalContextDsl.g:1638:1: (lv_annotations_13_0= ruleAnnotation )
                    // ../ac.soton.xtext.context.dsl/src-gen/ac/soton/xtext/context/dsl/parser/antlr/internal/InternalContextDsl.g:1639:3: lv_annotations_13_0= ruleAnnotation
                    {
                     
                    	        newCompositeNode(grammarAccess.getAxiomAccess().getAnnotationsAnnotationParserRuleCall_9_2_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleAnnotation_in_ruleAxiom3275);
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

                    // ../ac.soton.xtext.context.dsl/src-gen/ac/soton/xtext/context/dsl/parser/antlr/internal/InternalContextDsl.g:1655:2: (otherlv_14= ',' ( (lv_annotations_15_0= ruleAnnotation ) ) )*
                    loop50:
                    do {
                        int alt50=2;
                        int LA50_0 = input.LA(1);

                        if ( (LA50_0==18) ) {
                            alt50=1;
                        }


                        switch (alt50) {
                    	case 1 :
                    	    // ../ac.soton.xtext.context.dsl/src-gen/ac/soton/xtext/context/dsl/parser/antlr/internal/InternalContextDsl.g:1655:4: otherlv_14= ',' ( (lv_annotations_15_0= ruleAnnotation ) )
                    	    {
                    	    otherlv_14=(Token)match(input,18,FollowSets000.FOLLOW_18_in_ruleAxiom3288); 

                    	        	newLeafNode(otherlv_14, grammarAccess.getAxiomAccess().getCommaKeyword_9_3_0());
                    	        
                    	    // ../ac.soton.xtext.context.dsl/src-gen/ac/soton/xtext/context/dsl/parser/antlr/internal/InternalContextDsl.g:1659:1: ( (lv_annotations_15_0= ruleAnnotation ) )
                    	    // ../ac.soton.xtext.context.dsl/src-gen/ac/soton/xtext/context/dsl/parser/antlr/internal/InternalContextDsl.g:1660:1: (lv_annotations_15_0= ruleAnnotation )
                    	    {
                    	    // ../ac.soton.xtext.context.dsl/src-gen/ac/soton/xtext/context/dsl/parser/antlr/internal/InternalContextDsl.g:1660:1: (lv_annotations_15_0= ruleAnnotation )
                    	    // ../ac.soton.xtext.context.dsl/src-gen/ac/soton/xtext/context/dsl/parser/antlr/internal/InternalContextDsl.g:1661:3: lv_annotations_15_0= ruleAnnotation
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getAxiomAccess().getAnnotationsAnnotationParserRuleCall_9_3_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleAnnotation_in_ruleAxiom3309);
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
                    	    break loop50;
                        }
                    } while (true);

                    otherlv_16=(Token)match(input,21,FollowSets000.FOLLOW_21_in_ruleAxiom3323); 

                        	newLeafNode(otherlv_16, grammarAccess.getAxiomAccess().getRightCurlyBracketKeyword_9_4());
                        

                    }
                    break;

            }

            // ../ac.soton.xtext.context.dsl/src-gen/ac/soton/xtext/context/dsl/parser/antlr/internal/InternalContextDsl.g:1681:3: (otherlv_17= 'extensions' otherlv_18= '{' ( (lv_extensions_19_0= ruleAbstractExtension ) ) (otherlv_20= ',' ( (lv_extensions_21_0= ruleAbstractExtension ) ) )* otherlv_22= '}' )?
            int alt53=2;
            int LA53_0 = input.LA(1);

            if ( (LA53_0==22) ) {
                alt53=1;
            }
            switch (alt53) {
                case 1 :
                    // ../ac.soton.xtext.context.dsl/src-gen/ac/soton/xtext/context/dsl/parser/antlr/internal/InternalContextDsl.g:1681:5: otherlv_17= 'extensions' otherlv_18= '{' ( (lv_extensions_19_0= ruleAbstractExtension ) ) (otherlv_20= ',' ( (lv_extensions_21_0= ruleAbstractExtension ) ) )* otherlv_22= '}'
                    {
                    otherlv_17=(Token)match(input,22,FollowSets000.FOLLOW_22_in_ruleAxiom3338); 

                        	newLeafNode(otherlv_17, grammarAccess.getAxiomAccess().getExtensionsKeyword_10_0());
                        
                    otherlv_18=(Token)match(input,13,FollowSets000.FOLLOW_13_in_ruleAxiom3350); 

                        	newLeafNode(otherlv_18, grammarAccess.getAxiomAccess().getLeftCurlyBracketKeyword_10_1());
                        
                    // ../ac.soton.xtext.context.dsl/src-gen/ac/soton/xtext/context/dsl/parser/antlr/internal/InternalContextDsl.g:1689:1: ( (lv_extensions_19_0= ruleAbstractExtension ) )
                    // ../ac.soton.xtext.context.dsl/src-gen/ac/soton/xtext/context/dsl/parser/antlr/internal/InternalContextDsl.g:1690:1: (lv_extensions_19_0= ruleAbstractExtension )
                    {
                    // ../ac.soton.xtext.context.dsl/src-gen/ac/soton/xtext/context/dsl/parser/antlr/internal/InternalContextDsl.g:1690:1: (lv_extensions_19_0= ruleAbstractExtension )
                    // ../ac.soton.xtext.context.dsl/src-gen/ac/soton/xtext/context/dsl/parser/antlr/internal/InternalContextDsl.g:1691:3: lv_extensions_19_0= ruleAbstractExtension
                    {
                     
                    	        newCompositeNode(grammarAccess.getAxiomAccess().getExtensionsAbstractExtensionParserRuleCall_10_2_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleAbstractExtension_in_ruleAxiom3371);
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

                    // ../ac.soton.xtext.context.dsl/src-gen/ac/soton/xtext/context/dsl/parser/antlr/internal/InternalContextDsl.g:1707:2: (otherlv_20= ',' ( (lv_extensions_21_0= ruleAbstractExtension ) ) )*
                    loop52:
                    do {
                        int alt52=2;
                        int LA52_0 = input.LA(1);

                        if ( (LA52_0==18) ) {
                            alt52=1;
                        }


                        switch (alt52) {
                    	case 1 :
                    	    // ../ac.soton.xtext.context.dsl/src-gen/ac/soton/xtext/context/dsl/parser/antlr/internal/InternalContextDsl.g:1707:4: otherlv_20= ',' ( (lv_extensions_21_0= ruleAbstractExtension ) )
                    	    {
                    	    otherlv_20=(Token)match(input,18,FollowSets000.FOLLOW_18_in_ruleAxiom3384); 

                    	        	newLeafNode(otherlv_20, grammarAccess.getAxiomAccess().getCommaKeyword_10_3_0());
                    	        
                    	    // ../ac.soton.xtext.context.dsl/src-gen/ac/soton/xtext/context/dsl/parser/antlr/internal/InternalContextDsl.g:1711:1: ( (lv_extensions_21_0= ruleAbstractExtension ) )
                    	    // ../ac.soton.xtext.context.dsl/src-gen/ac/soton/xtext/context/dsl/parser/antlr/internal/InternalContextDsl.g:1712:1: (lv_extensions_21_0= ruleAbstractExtension )
                    	    {
                    	    // ../ac.soton.xtext.context.dsl/src-gen/ac/soton/xtext/context/dsl/parser/antlr/internal/InternalContextDsl.g:1712:1: (lv_extensions_21_0= ruleAbstractExtension )
                    	    // ../ac.soton.xtext.context.dsl/src-gen/ac/soton/xtext/context/dsl/parser/antlr/internal/InternalContextDsl.g:1713:3: lv_extensions_21_0= ruleAbstractExtension
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getAxiomAccess().getExtensionsAbstractExtensionParserRuleCall_10_3_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleAbstractExtension_in_ruleAxiom3405);
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
                    	    break loop52;
                        }
                    } while (true);

                    otherlv_22=(Token)match(input,21,FollowSets000.FOLLOW_21_in_ruleAxiom3419); 

                        	newLeafNode(otherlv_22, grammarAccess.getAxiomAccess().getRightCurlyBracketKeyword_10_4());
                        

                    }
                    break;

            }

            // ../ac.soton.xtext.context.dsl/src-gen/ac/soton/xtext/context/dsl/parser/antlr/internal/InternalContextDsl.g:1733:3: (otherlv_23= 'attributes' otherlv_24= '{' ( (lv_attributes_25_0= ruleStringToAttributeMapEntry ) ) (otherlv_26= ',' ( (lv_attributes_27_0= ruleStringToAttributeMapEntry ) ) )* otherlv_28= '}' )?
            int alt55=2;
            int LA55_0 = input.LA(1);

            if ( (LA55_0==23) ) {
                alt55=1;
            }
            switch (alt55) {
                case 1 :
                    // ../ac.soton.xtext.context.dsl/src-gen/ac/soton/xtext/context/dsl/parser/antlr/internal/InternalContextDsl.g:1733:5: otherlv_23= 'attributes' otherlv_24= '{' ( (lv_attributes_25_0= ruleStringToAttributeMapEntry ) ) (otherlv_26= ',' ( (lv_attributes_27_0= ruleStringToAttributeMapEntry ) ) )* otherlv_28= '}'
                    {
                    otherlv_23=(Token)match(input,23,FollowSets000.FOLLOW_23_in_ruleAxiom3434); 

                        	newLeafNode(otherlv_23, grammarAccess.getAxiomAccess().getAttributesKeyword_11_0());
                        
                    otherlv_24=(Token)match(input,13,FollowSets000.FOLLOW_13_in_ruleAxiom3446); 

                        	newLeafNode(otherlv_24, grammarAccess.getAxiomAccess().getLeftCurlyBracketKeyword_11_1());
                        
                    // ../ac.soton.xtext.context.dsl/src-gen/ac/soton/xtext/context/dsl/parser/antlr/internal/InternalContextDsl.g:1741:1: ( (lv_attributes_25_0= ruleStringToAttributeMapEntry ) )
                    // ../ac.soton.xtext.context.dsl/src-gen/ac/soton/xtext/context/dsl/parser/antlr/internal/InternalContextDsl.g:1742:1: (lv_attributes_25_0= ruleStringToAttributeMapEntry )
                    {
                    // ../ac.soton.xtext.context.dsl/src-gen/ac/soton/xtext/context/dsl/parser/antlr/internal/InternalContextDsl.g:1742:1: (lv_attributes_25_0= ruleStringToAttributeMapEntry )
                    // ../ac.soton.xtext.context.dsl/src-gen/ac/soton/xtext/context/dsl/parser/antlr/internal/InternalContextDsl.g:1743:3: lv_attributes_25_0= ruleStringToAttributeMapEntry
                    {
                     
                    	        newCompositeNode(grammarAccess.getAxiomAccess().getAttributesStringToAttributeMapEntryParserRuleCall_11_2_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleStringToAttributeMapEntry_in_ruleAxiom3467);
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

                    // ../ac.soton.xtext.context.dsl/src-gen/ac/soton/xtext/context/dsl/parser/antlr/internal/InternalContextDsl.g:1759:2: (otherlv_26= ',' ( (lv_attributes_27_0= ruleStringToAttributeMapEntry ) ) )*
                    loop54:
                    do {
                        int alt54=2;
                        int LA54_0 = input.LA(1);

                        if ( (LA54_0==18) ) {
                            alt54=1;
                        }


                        switch (alt54) {
                    	case 1 :
                    	    // ../ac.soton.xtext.context.dsl/src-gen/ac/soton/xtext/context/dsl/parser/antlr/internal/InternalContextDsl.g:1759:4: otherlv_26= ',' ( (lv_attributes_27_0= ruleStringToAttributeMapEntry ) )
                    	    {
                    	    otherlv_26=(Token)match(input,18,FollowSets000.FOLLOW_18_in_ruleAxiom3480); 

                    	        	newLeafNode(otherlv_26, grammarAccess.getAxiomAccess().getCommaKeyword_11_3_0());
                    	        
                    	    // ../ac.soton.xtext.context.dsl/src-gen/ac/soton/xtext/context/dsl/parser/antlr/internal/InternalContextDsl.g:1763:1: ( (lv_attributes_27_0= ruleStringToAttributeMapEntry ) )
                    	    // ../ac.soton.xtext.context.dsl/src-gen/ac/soton/xtext/context/dsl/parser/antlr/internal/InternalContextDsl.g:1764:1: (lv_attributes_27_0= ruleStringToAttributeMapEntry )
                    	    {
                    	    // ../ac.soton.xtext.context.dsl/src-gen/ac/soton/xtext/context/dsl/parser/antlr/internal/InternalContextDsl.g:1764:1: (lv_attributes_27_0= ruleStringToAttributeMapEntry )
                    	    // ../ac.soton.xtext.context.dsl/src-gen/ac/soton/xtext/context/dsl/parser/antlr/internal/InternalContextDsl.g:1765:3: lv_attributes_27_0= ruleStringToAttributeMapEntry
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getAxiomAccess().getAttributesStringToAttributeMapEntryParserRuleCall_11_3_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleStringToAttributeMapEntry_in_ruleAxiom3501);
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
                    	    break loop54;
                        }
                    } while (true);

                    otherlv_28=(Token)match(input,21,FollowSets000.FOLLOW_21_in_ruleAxiom3515); 

                        	newLeafNode(otherlv_28, grammarAccess.getAxiomAccess().getRightCurlyBracketKeyword_11_4());
                        

                    }
                    break;

            }

            otherlv_29=(Token)match(input,21,FollowSets000.FOLLOW_21_in_ruleAxiom3529); 

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


    // $ANTLR start "entryRuleStringToStringMapEntry"
    // ../ac.soton.xtext.context.dsl/src-gen/ac/soton/xtext/context/dsl/parser/antlr/internal/InternalContextDsl.g:1797:1: entryRuleStringToStringMapEntry returns [EObject current=null] : iv_ruleStringToStringMapEntry= ruleStringToStringMapEntry EOF ;
    public final EObject entryRuleStringToStringMapEntry() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStringToStringMapEntry = null;


        try {
            // ../ac.soton.xtext.context.dsl/src-gen/ac/soton/xtext/context/dsl/parser/antlr/internal/InternalContextDsl.g:1798:2: (iv_ruleStringToStringMapEntry= ruleStringToStringMapEntry EOF )
            // ../ac.soton.xtext.context.dsl/src-gen/ac/soton/xtext/context/dsl/parser/antlr/internal/InternalContextDsl.g:1799:2: iv_ruleStringToStringMapEntry= ruleStringToStringMapEntry EOF
            {
             newCompositeNode(grammarAccess.getStringToStringMapEntryRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleStringToStringMapEntry_in_entryRuleStringToStringMapEntry3565);
            iv_ruleStringToStringMapEntry=ruleStringToStringMapEntry();

            state._fsp--;

             current =iv_ruleStringToStringMapEntry; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleStringToStringMapEntry3575); 

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
    // ../ac.soton.xtext.context.dsl/src-gen/ac/soton/xtext/context/dsl/parser/antlr/internal/InternalContextDsl.g:1806:1: ruleStringToStringMapEntry returns [EObject current=null] : ( () otherlv_1= 'StringToStringMapEntry' otherlv_2= '{' (otherlv_3= 'key' ( (lv_key_4_0= ruleEString ) ) )? (otherlv_5= 'value' ( (lv_value_6_0= ruleEString ) ) )? otherlv_7= '}' ) ;
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
            // ../ac.soton.xtext.context.dsl/src-gen/ac/soton/xtext/context/dsl/parser/antlr/internal/InternalContextDsl.g:1809:28: ( ( () otherlv_1= 'StringToStringMapEntry' otherlv_2= '{' (otherlv_3= 'key' ( (lv_key_4_0= ruleEString ) ) )? (otherlv_5= 'value' ( (lv_value_6_0= ruleEString ) ) )? otherlv_7= '}' ) )
            // ../ac.soton.xtext.context.dsl/src-gen/ac/soton/xtext/context/dsl/parser/antlr/internal/InternalContextDsl.g:1810:1: ( () otherlv_1= 'StringToStringMapEntry' otherlv_2= '{' (otherlv_3= 'key' ( (lv_key_4_0= ruleEString ) ) )? (otherlv_5= 'value' ( (lv_value_6_0= ruleEString ) ) )? otherlv_7= '}' )
            {
            // ../ac.soton.xtext.context.dsl/src-gen/ac/soton/xtext/context/dsl/parser/antlr/internal/InternalContextDsl.g:1810:1: ( () otherlv_1= 'StringToStringMapEntry' otherlv_2= '{' (otherlv_3= 'key' ( (lv_key_4_0= ruleEString ) ) )? (otherlv_5= 'value' ( (lv_value_6_0= ruleEString ) ) )? otherlv_7= '}' )
            // ../ac.soton.xtext.context.dsl/src-gen/ac/soton/xtext/context/dsl/parser/antlr/internal/InternalContextDsl.g:1810:2: () otherlv_1= 'StringToStringMapEntry' otherlv_2= '{' (otherlv_3= 'key' ( (lv_key_4_0= ruleEString ) ) )? (otherlv_5= 'value' ( (lv_value_6_0= ruleEString ) ) )? otherlv_7= '}'
            {
            // ../ac.soton.xtext.context.dsl/src-gen/ac/soton/xtext/context/dsl/parser/antlr/internal/InternalContextDsl.g:1810:2: ()
            // ../ac.soton.xtext.context.dsl/src-gen/ac/soton/xtext/context/dsl/parser/antlr/internal/InternalContextDsl.g:1811:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getStringToStringMapEntryAccess().getStringToStringMapEntryAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,40,FollowSets000.FOLLOW_40_in_ruleStringToStringMapEntry3621); 

                	newLeafNode(otherlv_1, grammarAccess.getStringToStringMapEntryAccess().getStringToStringMapEntryKeyword_1());
                
            otherlv_2=(Token)match(input,13,FollowSets000.FOLLOW_13_in_ruleStringToStringMapEntry3633); 

                	newLeafNode(otherlv_2, grammarAccess.getStringToStringMapEntryAccess().getLeftCurlyBracketKeyword_2());
                
            // ../ac.soton.xtext.context.dsl/src-gen/ac/soton/xtext/context/dsl/parser/antlr/internal/InternalContextDsl.g:1824:1: (otherlv_3= 'key' ( (lv_key_4_0= ruleEString ) ) )?
            int alt56=2;
            int LA56_0 = input.LA(1);

            if ( (LA56_0==33) ) {
                alt56=1;
            }
            switch (alt56) {
                case 1 :
                    // ../ac.soton.xtext.context.dsl/src-gen/ac/soton/xtext/context/dsl/parser/antlr/internal/InternalContextDsl.g:1824:3: otherlv_3= 'key' ( (lv_key_4_0= ruleEString ) )
                    {
                    otherlv_3=(Token)match(input,33,FollowSets000.FOLLOW_33_in_ruleStringToStringMapEntry3646); 

                        	newLeafNode(otherlv_3, grammarAccess.getStringToStringMapEntryAccess().getKeyKeyword_3_0());
                        
                    // ../ac.soton.xtext.context.dsl/src-gen/ac/soton/xtext/context/dsl/parser/antlr/internal/InternalContextDsl.g:1828:1: ( (lv_key_4_0= ruleEString ) )
                    // ../ac.soton.xtext.context.dsl/src-gen/ac/soton/xtext/context/dsl/parser/antlr/internal/InternalContextDsl.g:1829:1: (lv_key_4_0= ruleEString )
                    {
                    // ../ac.soton.xtext.context.dsl/src-gen/ac/soton/xtext/context/dsl/parser/antlr/internal/InternalContextDsl.g:1829:1: (lv_key_4_0= ruleEString )
                    // ../ac.soton.xtext.context.dsl/src-gen/ac/soton/xtext/context/dsl/parser/antlr/internal/InternalContextDsl.g:1830:3: lv_key_4_0= ruleEString
                    {
                     
                    	        newCompositeNode(grammarAccess.getStringToStringMapEntryAccess().getKeyEStringParserRuleCall_3_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleStringToStringMapEntry3667);
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

            // ../ac.soton.xtext.context.dsl/src-gen/ac/soton/xtext/context/dsl/parser/antlr/internal/InternalContextDsl.g:1846:4: (otherlv_5= 'value' ( (lv_value_6_0= ruleEString ) ) )?
            int alt57=2;
            int LA57_0 = input.LA(1);

            if ( (LA57_0==34) ) {
                alt57=1;
            }
            switch (alt57) {
                case 1 :
                    // ../ac.soton.xtext.context.dsl/src-gen/ac/soton/xtext/context/dsl/parser/antlr/internal/InternalContextDsl.g:1846:6: otherlv_5= 'value' ( (lv_value_6_0= ruleEString ) )
                    {
                    otherlv_5=(Token)match(input,34,FollowSets000.FOLLOW_34_in_ruleStringToStringMapEntry3682); 

                        	newLeafNode(otherlv_5, grammarAccess.getStringToStringMapEntryAccess().getValueKeyword_4_0());
                        
                    // ../ac.soton.xtext.context.dsl/src-gen/ac/soton/xtext/context/dsl/parser/antlr/internal/InternalContextDsl.g:1850:1: ( (lv_value_6_0= ruleEString ) )
                    // ../ac.soton.xtext.context.dsl/src-gen/ac/soton/xtext/context/dsl/parser/antlr/internal/InternalContextDsl.g:1851:1: (lv_value_6_0= ruleEString )
                    {
                    // ../ac.soton.xtext.context.dsl/src-gen/ac/soton/xtext/context/dsl/parser/antlr/internal/InternalContextDsl.g:1851:1: (lv_value_6_0= ruleEString )
                    // ../ac.soton.xtext.context.dsl/src-gen/ac/soton/xtext/context/dsl/parser/antlr/internal/InternalContextDsl.g:1852:3: lv_value_6_0= ruleEString
                    {
                     
                    	        newCompositeNode(grammarAccess.getStringToStringMapEntryAccess().getValueEStringParserRuleCall_4_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleStringToStringMapEntry3703);
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

            otherlv_7=(Token)match(input,21,FollowSets000.FOLLOW_21_in_ruleStringToStringMapEntry3717); 

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
    // ../ac.soton.xtext.context.dsl/src-gen/ac/soton/xtext/context/dsl/parser/antlr/internal/InternalContextDsl.g:1880:1: entryRuleEObject returns [EObject current=null] : iv_ruleEObject= ruleEObject EOF ;
    public final EObject entryRuleEObject() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEObject = null;


        try {
            // ../ac.soton.xtext.context.dsl/src-gen/ac/soton/xtext/context/dsl/parser/antlr/internal/InternalContextDsl.g:1881:2: (iv_ruleEObject= ruleEObject EOF )
            // ../ac.soton.xtext.context.dsl/src-gen/ac/soton/xtext/context/dsl/parser/antlr/internal/InternalContextDsl.g:1882:2: iv_ruleEObject= ruleEObject EOF
            {
             newCompositeNode(grammarAccess.getEObjectRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleEObject_in_entryRuleEObject3753);
            iv_ruleEObject=ruleEObject();

            state._fsp--;

             current =iv_ruleEObject; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleEObject3763); 

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
    // ../ac.soton.xtext.context.dsl/src-gen/ac/soton/xtext/context/dsl/parser/antlr/internal/InternalContextDsl.g:1889:1: ruleEObject returns [EObject current=null] : ( () otherlv_1= 'EObject' ) ;
    public final EObject ruleEObject() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // ../ac.soton.xtext.context.dsl/src-gen/ac/soton/xtext/context/dsl/parser/antlr/internal/InternalContextDsl.g:1892:28: ( ( () otherlv_1= 'EObject' ) )
            // ../ac.soton.xtext.context.dsl/src-gen/ac/soton/xtext/context/dsl/parser/antlr/internal/InternalContextDsl.g:1893:1: ( () otherlv_1= 'EObject' )
            {
            // ../ac.soton.xtext.context.dsl/src-gen/ac/soton/xtext/context/dsl/parser/antlr/internal/InternalContextDsl.g:1893:1: ( () otherlv_1= 'EObject' )
            // ../ac.soton.xtext.context.dsl/src-gen/ac/soton/xtext/context/dsl/parser/antlr/internal/InternalContextDsl.g:1893:2: () otherlv_1= 'EObject'
            {
            // ../ac.soton.xtext.context.dsl/src-gen/ac/soton/xtext/context/dsl/parser/antlr/internal/InternalContextDsl.g:1893:2: ()
            // ../ac.soton.xtext.context.dsl/src-gen/ac/soton/xtext/context/dsl/parser/antlr/internal/InternalContextDsl.g:1894:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getEObjectAccess().getEObjectAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,41,FollowSets000.FOLLOW_41_in_ruleEObject3809); 

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
    // ../ac.soton.xtext.context.dsl/src-gen/ac/soton/xtext/context/dsl/parser/antlr/internal/InternalContextDsl.g:1911:1: entryRuleExtension returns [EObject current=null] : iv_ruleExtension= ruleExtension EOF ;
    public final EObject entryRuleExtension() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExtension = null;


        try {
            // ../ac.soton.xtext.context.dsl/src-gen/ac/soton/xtext/context/dsl/parser/antlr/internal/InternalContextDsl.g:1912:2: (iv_ruleExtension= ruleExtension EOF )
            // ../ac.soton.xtext.context.dsl/src-gen/ac/soton/xtext/context/dsl/parser/antlr/internal/InternalContextDsl.g:1913:2: iv_ruleExtension= ruleExtension EOF
            {
             newCompositeNode(grammarAccess.getExtensionRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleExtension_in_entryRuleExtension3845);
            iv_ruleExtension=ruleExtension();

            state._fsp--;

             current =iv_ruleExtension; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleExtension3855); 

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
    // ../ac.soton.xtext.context.dsl/src-gen/ac/soton/xtext/context/dsl/parser/antlr/internal/InternalContextDsl.g:1920:1: ruleExtension returns [EObject current=null] : ( ( (lv_localGenerated_0_0= 'localGenerated' ) )? otherlv_1= 'Extension' otherlv_2= '{' (otherlv_3= 'internalId' ( (lv_internalId_4_0= ruleEString ) ) )? otherlv_5= 'extensionId' ( (lv_extensionId_6_0= ruleEString ) ) (otherlv_7= 'annotations' otherlv_8= '{' ( (lv_annotations_9_0= ruleAnnotation ) ) (otherlv_10= ',' ( (lv_annotations_11_0= ruleAnnotation ) ) )* otherlv_12= '}' )? (otherlv_13= 'extensions' otherlv_14= '{' ( (lv_extensions_15_0= ruleAbstractExtension ) ) (otherlv_16= ',' ( (lv_extensions_17_0= ruleAbstractExtension ) ) )* otherlv_18= '}' )? (otherlv_19= 'attributes' otherlv_20= '{' ( (lv_attributes_21_0= ruleStringToAttributeMapEntry ) ) (otherlv_22= ',' ( (lv_attributes_23_0= ruleStringToAttributeMapEntry ) ) )* otherlv_24= '}' )? otherlv_25= '}' ) ;
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
            // ../ac.soton.xtext.context.dsl/src-gen/ac/soton/xtext/context/dsl/parser/antlr/internal/InternalContextDsl.g:1923:28: ( ( ( (lv_localGenerated_0_0= 'localGenerated' ) )? otherlv_1= 'Extension' otherlv_2= '{' (otherlv_3= 'internalId' ( (lv_internalId_4_0= ruleEString ) ) )? otherlv_5= 'extensionId' ( (lv_extensionId_6_0= ruleEString ) ) (otherlv_7= 'annotations' otherlv_8= '{' ( (lv_annotations_9_0= ruleAnnotation ) ) (otherlv_10= ',' ( (lv_annotations_11_0= ruleAnnotation ) ) )* otherlv_12= '}' )? (otherlv_13= 'extensions' otherlv_14= '{' ( (lv_extensions_15_0= ruleAbstractExtension ) ) (otherlv_16= ',' ( (lv_extensions_17_0= ruleAbstractExtension ) ) )* otherlv_18= '}' )? (otherlv_19= 'attributes' otherlv_20= '{' ( (lv_attributes_21_0= ruleStringToAttributeMapEntry ) ) (otherlv_22= ',' ( (lv_attributes_23_0= ruleStringToAttributeMapEntry ) ) )* otherlv_24= '}' )? otherlv_25= '}' ) )
            // ../ac.soton.xtext.context.dsl/src-gen/ac/soton/xtext/context/dsl/parser/antlr/internal/InternalContextDsl.g:1924:1: ( ( (lv_localGenerated_0_0= 'localGenerated' ) )? otherlv_1= 'Extension' otherlv_2= '{' (otherlv_3= 'internalId' ( (lv_internalId_4_0= ruleEString ) ) )? otherlv_5= 'extensionId' ( (lv_extensionId_6_0= ruleEString ) ) (otherlv_7= 'annotations' otherlv_8= '{' ( (lv_annotations_9_0= ruleAnnotation ) ) (otherlv_10= ',' ( (lv_annotations_11_0= ruleAnnotation ) ) )* otherlv_12= '}' )? (otherlv_13= 'extensions' otherlv_14= '{' ( (lv_extensions_15_0= ruleAbstractExtension ) ) (otherlv_16= ',' ( (lv_extensions_17_0= ruleAbstractExtension ) ) )* otherlv_18= '}' )? (otherlv_19= 'attributes' otherlv_20= '{' ( (lv_attributes_21_0= ruleStringToAttributeMapEntry ) ) (otherlv_22= ',' ( (lv_attributes_23_0= ruleStringToAttributeMapEntry ) ) )* otherlv_24= '}' )? otherlv_25= '}' )
            {
            // ../ac.soton.xtext.context.dsl/src-gen/ac/soton/xtext/context/dsl/parser/antlr/internal/InternalContextDsl.g:1924:1: ( ( (lv_localGenerated_0_0= 'localGenerated' ) )? otherlv_1= 'Extension' otherlv_2= '{' (otherlv_3= 'internalId' ( (lv_internalId_4_0= ruleEString ) ) )? otherlv_5= 'extensionId' ( (lv_extensionId_6_0= ruleEString ) ) (otherlv_7= 'annotations' otherlv_8= '{' ( (lv_annotations_9_0= ruleAnnotation ) ) (otherlv_10= ',' ( (lv_annotations_11_0= ruleAnnotation ) ) )* otherlv_12= '}' )? (otherlv_13= 'extensions' otherlv_14= '{' ( (lv_extensions_15_0= ruleAbstractExtension ) ) (otherlv_16= ',' ( (lv_extensions_17_0= ruleAbstractExtension ) ) )* otherlv_18= '}' )? (otherlv_19= 'attributes' otherlv_20= '{' ( (lv_attributes_21_0= ruleStringToAttributeMapEntry ) ) (otherlv_22= ',' ( (lv_attributes_23_0= ruleStringToAttributeMapEntry ) ) )* otherlv_24= '}' )? otherlv_25= '}' )
            // ../ac.soton.xtext.context.dsl/src-gen/ac/soton/xtext/context/dsl/parser/antlr/internal/InternalContextDsl.g:1924:2: ( (lv_localGenerated_0_0= 'localGenerated' ) )? otherlv_1= 'Extension' otherlv_2= '{' (otherlv_3= 'internalId' ( (lv_internalId_4_0= ruleEString ) ) )? otherlv_5= 'extensionId' ( (lv_extensionId_6_0= ruleEString ) ) (otherlv_7= 'annotations' otherlv_8= '{' ( (lv_annotations_9_0= ruleAnnotation ) ) (otherlv_10= ',' ( (lv_annotations_11_0= ruleAnnotation ) ) )* otherlv_12= '}' )? (otherlv_13= 'extensions' otherlv_14= '{' ( (lv_extensions_15_0= ruleAbstractExtension ) ) (otherlv_16= ',' ( (lv_extensions_17_0= ruleAbstractExtension ) ) )* otherlv_18= '}' )? (otherlv_19= 'attributes' otherlv_20= '{' ( (lv_attributes_21_0= ruleStringToAttributeMapEntry ) ) (otherlv_22= ',' ( (lv_attributes_23_0= ruleStringToAttributeMapEntry ) ) )* otherlv_24= '}' )? otherlv_25= '}'
            {
            // ../ac.soton.xtext.context.dsl/src-gen/ac/soton/xtext/context/dsl/parser/antlr/internal/InternalContextDsl.g:1924:2: ( (lv_localGenerated_0_0= 'localGenerated' ) )?
            int alt58=2;
            int LA58_0 = input.LA(1);

            if ( (LA58_0==11) ) {
                alt58=1;
            }
            switch (alt58) {
                case 1 :
                    // ../ac.soton.xtext.context.dsl/src-gen/ac/soton/xtext/context/dsl/parser/antlr/internal/InternalContextDsl.g:1925:1: (lv_localGenerated_0_0= 'localGenerated' )
                    {
                    // ../ac.soton.xtext.context.dsl/src-gen/ac/soton/xtext/context/dsl/parser/antlr/internal/InternalContextDsl.g:1925:1: (lv_localGenerated_0_0= 'localGenerated' )
                    // ../ac.soton.xtext.context.dsl/src-gen/ac/soton/xtext/context/dsl/parser/antlr/internal/InternalContextDsl.g:1926:3: lv_localGenerated_0_0= 'localGenerated'
                    {
                    lv_localGenerated_0_0=(Token)match(input,11,FollowSets000.FOLLOW_11_in_ruleExtension3898); 

                            newLeafNode(lv_localGenerated_0_0, grammarAccess.getExtensionAccess().getLocalGeneratedLocalGeneratedKeyword_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getExtensionRule());
                    	        }
                           		setWithLastConsumed(current, "localGenerated", true, "localGenerated");
                    	    

                    }


                    }
                    break;

            }

            otherlv_1=(Token)match(input,42,FollowSets000.FOLLOW_42_in_ruleExtension3924); 

                	newLeafNode(otherlv_1, grammarAccess.getExtensionAccess().getExtensionKeyword_1());
                
            otherlv_2=(Token)match(input,13,FollowSets000.FOLLOW_13_in_ruleExtension3936); 

                	newLeafNode(otherlv_2, grammarAccess.getExtensionAccess().getLeftCurlyBracketKeyword_2());
                
            // ../ac.soton.xtext.context.dsl/src-gen/ac/soton/xtext/context/dsl/parser/antlr/internal/InternalContextDsl.g:1947:1: (otherlv_3= 'internalId' ( (lv_internalId_4_0= ruleEString ) ) )?
            int alt59=2;
            int LA59_0 = input.LA(1);

            if ( (LA59_0==14) ) {
                alt59=1;
            }
            switch (alt59) {
                case 1 :
                    // ../ac.soton.xtext.context.dsl/src-gen/ac/soton/xtext/context/dsl/parser/antlr/internal/InternalContextDsl.g:1947:3: otherlv_3= 'internalId' ( (lv_internalId_4_0= ruleEString ) )
                    {
                    otherlv_3=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleExtension3949); 

                        	newLeafNode(otherlv_3, grammarAccess.getExtensionAccess().getInternalIdKeyword_3_0());
                        
                    // ../ac.soton.xtext.context.dsl/src-gen/ac/soton/xtext/context/dsl/parser/antlr/internal/InternalContextDsl.g:1951:1: ( (lv_internalId_4_0= ruleEString ) )
                    // ../ac.soton.xtext.context.dsl/src-gen/ac/soton/xtext/context/dsl/parser/antlr/internal/InternalContextDsl.g:1952:1: (lv_internalId_4_0= ruleEString )
                    {
                    // ../ac.soton.xtext.context.dsl/src-gen/ac/soton/xtext/context/dsl/parser/antlr/internal/InternalContextDsl.g:1952:1: (lv_internalId_4_0= ruleEString )
                    // ../ac.soton.xtext.context.dsl/src-gen/ac/soton/xtext/context/dsl/parser/antlr/internal/InternalContextDsl.g:1953:3: lv_internalId_4_0= ruleEString
                    {
                     
                    	        newCompositeNode(grammarAccess.getExtensionAccess().getInternalIdEStringParserRuleCall_3_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleExtension3970);
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

            otherlv_5=(Token)match(input,43,FollowSets000.FOLLOW_43_in_ruleExtension3984); 

                	newLeafNode(otherlv_5, grammarAccess.getExtensionAccess().getExtensionIdKeyword_4());
                
            // ../ac.soton.xtext.context.dsl/src-gen/ac/soton/xtext/context/dsl/parser/antlr/internal/InternalContextDsl.g:1973:1: ( (lv_extensionId_6_0= ruleEString ) )
            // ../ac.soton.xtext.context.dsl/src-gen/ac/soton/xtext/context/dsl/parser/antlr/internal/InternalContextDsl.g:1974:1: (lv_extensionId_6_0= ruleEString )
            {
            // ../ac.soton.xtext.context.dsl/src-gen/ac/soton/xtext/context/dsl/parser/antlr/internal/InternalContextDsl.g:1974:1: (lv_extensionId_6_0= ruleEString )
            // ../ac.soton.xtext.context.dsl/src-gen/ac/soton/xtext/context/dsl/parser/antlr/internal/InternalContextDsl.g:1975:3: lv_extensionId_6_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getExtensionAccess().getExtensionIdEStringParserRuleCall_5_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleExtension4005);
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

            // ../ac.soton.xtext.context.dsl/src-gen/ac/soton/xtext/context/dsl/parser/antlr/internal/InternalContextDsl.g:1991:2: (otherlv_7= 'annotations' otherlv_8= '{' ( (lv_annotations_9_0= ruleAnnotation ) ) (otherlv_10= ',' ( (lv_annotations_11_0= ruleAnnotation ) ) )* otherlv_12= '}' )?
            int alt61=2;
            int LA61_0 = input.LA(1);

            if ( (LA61_0==20) ) {
                alt61=1;
            }
            switch (alt61) {
                case 1 :
                    // ../ac.soton.xtext.context.dsl/src-gen/ac/soton/xtext/context/dsl/parser/antlr/internal/InternalContextDsl.g:1991:4: otherlv_7= 'annotations' otherlv_8= '{' ( (lv_annotations_9_0= ruleAnnotation ) ) (otherlv_10= ',' ( (lv_annotations_11_0= ruleAnnotation ) ) )* otherlv_12= '}'
                    {
                    otherlv_7=(Token)match(input,20,FollowSets000.FOLLOW_20_in_ruleExtension4018); 

                        	newLeafNode(otherlv_7, grammarAccess.getExtensionAccess().getAnnotationsKeyword_6_0());
                        
                    otherlv_8=(Token)match(input,13,FollowSets000.FOLLOW_13_in_ruleExtension4030); 

                        	newLeafNode(otherlv_8, grammarAccess.getExtensionAccess().getLeftCurlyBracketKeyword_6_1());
                        
                    // ../ac.soton.xtext.context.dsl/src-gen/ac/soton/xtext/context/dsl/parser/antlr/internal/InternalContextDsl.g:1999:1: ( (lv_annotations_9_0= ruleAnnotation ) )
                    // ../ac.soton.xtext.context.dsl/src-gen/ac/soton/xtext/context/dsl/parser/antlr/internal/InternalContextDsl.g:2000:1: (lv_annotations_9_0= ruleAnnotation )
                    {
                    // ../ac.soton.xtext.context.dsl/src-gen/ac/soton/xtext/context/dsl/parser/antlr/internal/InternalContextDsl.g:2000:1: (lv_annotations_9_0= ruleAnnotation )
                    // ../ac.soton.xtext.context.dsl/src-gen/ac/soton/xtext/context/dsl/parser/antlr/internal/InternalContextDsl.g:2001:3: lv_annotations_9_0= ruleAnnotation
                    {
                     
                    	        newCompositeNode(grammarAccess.getExtensionAccess().getAnnotationsAnnotationParserRuleCall_6_2_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleAnnotation_in_ruleExtension4051);
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

                    // ../ac.soton.xtext.context.dsl/src-gen/ac/soton/xtext/context/dsl/parser/antlr/internal/InternalContextDsl.g:2017:2: (otherlv_10= ',' ( (lv_annotations_11_0= ruleAnnotation ) ) )*
                    loop60:
                    do {
                        int alt60=2;
                        int LA60_0 = input.LA(1);

                        if ( (LA60_0==18) ) {
                            alt60=1;
                        }


                        switch (alt60) {
                    	case 1 :
                    	    // ../ac.soton.xtext.context.dsl/src-gen/ac/soton/xtext/context/dsl/parser/antlr/internal/InternalContextDsl.g:2017:4: otherlv_10= ',' ( (lv_annotations_11_0= ruleAnnotation ) )
                    	    {
                    	    otherlv_10=(Token)match(input,18,FollowSets000.FOLLOW_18_in_ruleExtension4064); 

                    	        	newLeafNode(otherlv_10, grammarAccess.getExtensionAccess().getCommaKeyword_6_3_0());
                    	        
                    	    // ../ac.soton.xtext.context.dsl/src-gen/ac/soton/xtext/context/dsl/parser/antlr/internal/InternalContextDsl.g:2021:1: ( (lv_annotations_11_0= ruleAnnotation ) )
                    	    // ../ac.soton.xtext.context.dsl/src-gen/ac/soton/xtext/context/dsl/parser/antlr/internal/InternalContextDsl.g:2022:1: (lv_annotations_11_0= ruleAnnotation )
                    	    {
                    	    // ../ac.soton.xtext.context.dsl/src-gen/ac/soton/xtext/context/dsl/parser/antlr/internal/InternalContextDsl.g:2022:1: (lv_annotations_11_0= ruleAnnotation )
                    	    // ../ac.soton.xtext.context.dsl/src-gen/ac/soton/xtext/context/dsl/parser/antlr/internal/InternalContextDsl.g:2023:3: lv_annotations_11_0= ruleAnnotation
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getExtensionAccess().getAnnotationsAnnotationParserRuleCall_6_3_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleAnnotation_in_ruleExtension4085);
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
                    	    break loop60;
                        }
                    } while (true);

                    otherlv_12=(Token)match(input,21,FollowSets000.FOLLOW_21_in_ruleExtension4099); 

                        	newLeafNode(otherlv_12, grammarAccess.getExtensionAccess().getRightCurlyBracketKeyword_6_4());
                        

                    }
                    break;

            }

            // ../ac.soton.xtext.context.dsl/src-gen/ac/soton/xtext/context/dsl/parser/antlr/internal/InternalContextDsl.g:2043:3: (otherlv_13= 'extensions' otherlv_14= '{' ( (lv_extensions_15_0= ruleAbstractExtension ) ) (otherlv_16= ',' ( (lv_extensions_17_0= ruleAbstractExtension ) ) )* otherlv_18= '}' )?
            int alt63=2;
            int LA63_0 = input.LA(1);

            if ( (LA63_0==22) ) {
                alt63=1;
            }
            switch (alt63) {
                case 1 :
                    // ../ac.soton.xtext.context.dsl/src-gen/ac/soton/xtext/context/dsl/parser/antlr/internal/InternalContextDsl.g:2043:5: otherlv_13= 'extensions' otherlv_14= '{' ( (lv_extensions_15_0= ruleAbstractExtension ) ) (otherlv_16= ',' ( (lv_extensions_17_0= ruleAbstractExtension ) ) )* otherlv_18= '}'
                    {
                    otherlv_13=(Token)match(input,22,FollowSets000.FOLLOW_22_in_ruleExtension4114); 

                        	newLeafNode(otherlv_13, grammarAccess.getExtensionAccess().getExtensionsKeyword_7_0());
                        
                    otherlv_14=(Token)match(input,13,FollowSets000.FOLLOW_13_in_ruleExtension4126); 

                        	newLeafNode(otherlv_14, grammarAccess.getExtensionAccess().getLeftCurlyBracketKeyword_7_1());
                        
                    // ../ac.soton.xtext.context.dsl/src-gen/ac/soton/xtext/context/dsl/parser/antlr/internal/InternalContextDsl.g:2051:1: ( (lv_extensions_15_0= ruleAbstractExtension ) )
                    // ../ac.soton.xtext.context.dsl/src-gen/ac/soton/xtext/context/dsl/parser/antlr/internal/InternalContextDsl.g:2052:1: (lv_extensions_15_0= ruleAbstractExtension )
                    {
                    // ../ac.soton.xtext.context.dsl/src-gen/ac/soton/xtext/context/dsl/parser/antlr/internal/InternalContextDsl.g:2052:1: (lv_extensions_15_0= ruleAbstractExtension )
                    // ../ac.soton.xtext.context.dsl/src-gen/ac/soton/xtext/context/dsl/parser/antlr/internal/InternalContextDsl.g:2053:3: lv_extensions_15_0= ruleAbstractExtension
                    {
                     
                    	        newCompositeNode(grammarAccess.getExtensionAccess().getExtensionsAbstractExtensionParserRuleCall_7_2_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleAbstractExtension_in_ruleExtension4147);
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

                    // ../ac.soton.xtext.context.dsl/src-gen/ac/soton/xtext/context/dsl/parser/antlr/internal/InternalContextDsl.g:2069:2: (otherlv_16= ',' ( (lv_extensions_17_0= ruleAbstractExtension ) ) )*
                    loop62:
                    do {
                        int alt62=2;
                        int LA62_0 = input.LA(1);

                        if ( (LA62_0==18) ) {
                            alt62=1;
                        }


                        switch (alt62) {
                    	case 1 :
                    	    // ../ac.soton.xtext.context.dsl/src-gen/ac/soton/xtext/context/dsl/parser/antlr/internal/InternalContextDsl.g:2069:4: otherlv_16= ',' ( (lv_extensions_17_0= ruleAbstractExtension ) )
                    	    {
                    	    otherlv_16=(Token)match(input,18,FollowSets000.FOLLOW_18_in_ruleExtension4160); 

                    	        	newLeafNode(otherlv_16, grammarAccess.getExtensionAccess().getCommaKeyword_7_3_0());
                    	        
                    	    // ../ac.soton.xtext.context.dsl/src-gen/ac/soton/xtext/context/dsl/parser/antlr/internal/InternalContextDsl.g:2073:1: ( (lv_extensions_17_0= ruleAbstractExtension ) )
                    	    // ../ac.soton.xtext.context.dsl/src-gen/ac/soton/xtext/context/dsl/parser/antlr/internal/InternalContextDsl.g:2074:1: (lv_extensions_17_0= ruleAbstractExtension )
                    	    {
                    	    // ../ac.soton.xtext.context.dsl/src-gen/ac/soton/xtext/context/dsl/parser/antlr/internal/InternalContextDsl.g:2074:1: (lv_extensions_17_0= ruleAbstractExtension )
                    	    // ../ac.soton.xtext.context.dsl/src-gen/ac/soton/xtext/context/dsl/parser/antlr/internal/InternalContextDsl.g:2075:3: lv_extensions_17_0= ruleAbstractExtension
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getExtensionAccess().getExtensionsAbstractExtensionParserRuleCall_7_3_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleAbstractExtension_in_ruleExtension4181);
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
                    	    break loop62;
                        }
                    } while (true);

                    otherlv_18=(Token)match(input,21,FollowSets000.FOLLOW_21_in_ruleExtension4195); 

                        	newLeafNode(otherlv_18, grammarAccess.getExtensionAccess().getRightCurlyBracketKeyword_7_4());
                        

                    }
                    break;

            }

            // ../ac.soton.xtext.context.dsl/src-gen/ac/soton/xtext/context/dsl/parser/antlr/internal/InternalContextDsl.g:2095:3: (otherlv_19= 'attributes' otherlv_20= '{' ( (lv_attributes_21_0= ruleStringToAttributeMapEntry ) ) (otherlv_22= ',' ( (lv_attributes_23_0= ruleStringToAttributeMapEntry ) ) )* otherlv_24= '}' )?
            int alt65=2;
            int LA65_0 = input.LA(1);

            if ( (LA65_0==23) ) {
                alt65=1;
            }
            switch (alt65) {
                case 1 :
                    // ../ac.soton.xtext.context.dsl/src-gen/ac/soton/xtext/context/dsl/parser/antlr/internal/InternalContextDsl.g:2095:5: otherlv_19= 'attributes' otherlv_20= '{' ( (lv_attributes_21_0= ruleStringToAttributeMapEntry ) ) (otherlv_22= ',' ( (lv_attributes_23_0= ruleStringToAttributeMapEntry ) ) )* otherlv_24= '}'
                    {
                    otherlv_19=(Token)match(input,23,FollowSets000.FOLLOW_23_in_ruleExtension4210); 

                        	newLeafNode(otherlv_19, grammarAccess.getExtensionAccess().getAttributesKeyword_8_0());
                        
                    otherlv_20=(Token)match(input,13,FollowSets000.FOLLOW_13_in_ruleExtension4222); 

                        	newLeafNode(otherlv_20, grammarAccess.getExtensionAccess().getLeftCurlyBracketKeyword_8_1());
                        
                    // ../ac.soton.xtext.context.dsl/src-gen/ac/soton/xtext/context/dsl/parser/antlr/internal/InternalContextDsl.g:2103:1: ( (lv_attributes_21_0= ruleStringToAttributeMapEntry ) )
                    // ../ac.soton.xtext.context.dsl/src-gen/ac/soton/xtext/context/dsl/parser/antlr/internal/InternalContextDsl.g:2104:1: (lv_attributes_21_0= ruleStringToAttributeMapEntry )
                    {
                    // ../ac.soton.xtext.context.dsl/src-gen/ac/soton/xtext/context/dsl/parser/antlr/internal/InternalContextDsl.g:2104:1: (lv_attributes_21_0= ruleStringToAttributeMapEntry )
                    // ../ac.soton.xtext.context.dsl/src-gen/ac/soton/xtext/context/dsl/parser/antlr/internal/InternalContextDsl.g:2105:3: lv_attributes_21_0= ruleStringToAttributeMapEntry
                    {
                     
                    	        newCompositeNode(grammarAccess.getExtensionAccess().getAttributesStringToAttributeMapEntryParserRuleCall_8_2_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleStringToAttributeMapEntry_in_ruleExtension4243);
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

                    // ../ac.soton.xtext.context.dsl/src-gen/ac/soton/xtext/context/dsl/parser/antlr/internal/InternalContextDsl.g:2121:2: (otherlv_22= ',' ( (lv_attributes_23_0= ruleStringToAttributeMapEntry ) ) )*
                    loop64:
                    do {
                        int alt64=2;
                        int LA64_0 = input.LA(1);

                        if ( (LA64_0==18) ) {
                            alt64=1;
                        }


                        switch (alt64) {
                    	case 1 :
                    	    // ../ac.soton.xtext.context.dsl/src-gen/ac/soton/xtext/context/dsl/parser/antlr/internal/InternalContextDsl.g:2121:4: otherlv_22= ',' ( (lv_attributes_23_0= ruleStringToAttributeMapEntry ) )
                    	    {
                    	    otherlv_22=(Token)match(input,18,FollowSets000.FOLLOW_18_in_ruleExtension4256); 

                    	        	newLeafNode(otherlv_22, grammarAccess.getExtensionAccess().getCommaKeyword_8_3_0());
                    	        
                    	    // ../ac.soton.xtext.context.dsl/src-gen/ac/soton/xtext/context/dsl/parser/antlr/internal/InternalContextDsl.g:2125:1: ( (lv_attributes_23_0= ruleStringToAttributeMapEntry ) )
                    	    // ../ac.soton.xtext.context.dsl/src-gen/ac/soton/xtext/context/dsl/parser/antlr/internal/InternalContextDsl.g:2126:1: (lv_attributes_23_0= ruleStringToAttributeMapEntry )
                    	    {
                    	    // ../ac.soton.xtext.context.dsl/src-gen/ac/soton/xtext/context/dsl/parser/antlr/internal/InternalContextDsl.g:2126:1: (lv_attributes_23_0= ruleStringToAttributeMapEntry )
                    	    // ../ac.soton.xtext.context.dsl/src-gen/ac/soton/xtext/context/dsl/parser/antlr/internal/InternalContextDsl.g:2127:3: lv_attributes_23_0= ruleStringToAttributeMapEntry
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getExtensionAccess().getAttributesStringToAttributeMapEntryParserRuleCall_8_3_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleStringToAttributeMapEntry_in_ruleExtension4277);
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
                    	    break loop64;
                        }
                    } while (true);

                    otherlv_24=(Token)match(input,21,FollowSets000.FOLLOW_21_in_ruleExtension4291); 

                        	newLeafNode(otherlv_24, grammarAccess.getExtensionAccess().getRightCurlyBracketKeyword_8_4());
                        

                    }
                    break;

            }

            otherlv_25=(Token)match(input,21,FollowSets000.FOLLOW_21_in_ruleExtension4305); 

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
    // ../ac.soton.xtext.context.dsl/src-gen/ac/soton/xtext/context/dsl/parser/antlr/internal/InternalContextDsl.g:2159:1: entryRuleAttribute returns [EObject current=null] : iv_ruleAttribute= ruleAttribute EOF ;
    public final EObject entryRuleAttribute() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAttribute = null;


        try {
            // ../ac.soton.xtext.context.dsl/src-gen/ac/soton/xtext/context/dsl/parser/antlr/internal/InternalContextDsl.g:2160:2: (iv_ruleAttribute= ruleAttribute EOF )
            // ../ac.soton.xtext.context.dsl/src-gen/ac/soton/xtext/context/dsl/parser/antlr/internal/InternalContextDsl.g:2161:2: iv_ruleAttribute= ruleAttribute EOF
            {
             newCompositeNode(grammarAccess.getAttributeRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleAttribute_in_entryRuleAttribute4341);
            iv_ruleAttribute=ruleAttribute();

            state._fsp--;

             current =iv_ruleAttribute; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleAttribute4351); 

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
    // ../ac.soton.xtext.context.dsl/src-gen/ac/soton/xtext/context/dsl/parser/antlr/internal/InternalContextDsl.g:2168:1: ruleAttribute returns [EObject current=null] : (otherlv_0= 'Attribute' otherlv_1= '{' otherlv_2= 'type' ( (lv_type_3_0= ruleAttributeType ) ) otherlv_4= 'value' ( (lv_value_5_0= ruleEJavaObject ) ) (otherlv_6= 'annotations' otherlv_7= '{' ( (lv_annotations_8_0= ruleAnnotation ) ) (otherlv_9= ',' ( (lv_annotations_10_0= ruleAnnotation ) ) )* otherlv_11= '}' )? otherlv_12= '}' ) ;
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
            // ../ac.soton.xtext.context.dsl/src-gen/ac/soton/xtext/context/dsl/parser/antlr/internal/InternalContextDsl.g:2171:28: ( (otherlv_0= 'Attribute' otherlv_1= '{' otherlv_2= 'type' ( (lv_type_3_0= ruleAttributeType ) ) otherlv_4= 'value' ( (lv_value_5_0= ruleEJavaObject ) ) (otherlv_6= 'annotations' otherlv_7= '{' ( (lv_annotations_8_0= ruleAnnotation ) ) (otherlv_9= ',' ( (lv_annotations_10_0= ruleAnnotation ) ) )* otherlv_11= '}' )? otherlv_12= '}' ) )
            // ../ac.soton.xtext.context.dsl/src-gen/ac/soton/xtext/context/dsl/parser/antlr/internal/InternalContextDsl.g:2172:1: (otherlv_0= 'Attribute' otherlv_1= '{' otherlv_2= 'type' ( (lv_type_3_0= ruleAttributeType ) ) otherlv_4= 'value' ( (lv_value_5_0= ruleEJavaObject ) ) (otherlv_6= 'annotations' otherlv_7= '{' ( (lv_annotations_8_0= ruleAnnotation ) ) (otherlv_9= ',' ( (lv_annotations_10_0= ruleAnnotation ) ) )* otherlv_11= '}' )? otherlv_12= '}' )
            {
            // ../ac.soton.xtext.context.dsl/src-gen/ac/soton/xtext/context/dsl/parser/antlr/internal/InternalContextDsl.g:2172:1: (otherlv_0= 'Attribute' otherlv_1= '{' otherlv_2= 'type' ( (lv_type_3_0= ruleAttributeType ) ) otherlv_4= 'value' ( (lv_value_5_0= ruleEJavaObject ) ) (otherlv_6= 'annotations' otherlv_7= '{' ( (lv_annotations_8_0= ruleAnnotation ) ) (otherlv_9= ',' ( (lv_annotations_10_0= ruleAnnotation ) ) )* otherlv_11= '}' )? otherlv_12= '}' )
            // ../ac.soton.xtext.context.dsl/src-gen/ac/soton/xtext/context/dsl/parser/antlr/internal/InternalContextDsl.g:2172:3: otherlv_0= 'Attribute' otherlv_1= '{' otherlv_2= 'type' ( (lv_type_3_0= ruleAttributeType ) ) otherlv_4= 'value' ( (lv_value_5_0= ruleEJavaObject ) ) (otherlv_6= 'annotations' otherlv_7= '{' ( (lv_annotations_8_0= ruleAnnotation ) ) (otherlv_9= ',' ( (lv_annotations_10_0= ruleAnnotation ) ) )* otherlv_11= '}' )? otherlv_12= '}'
            {
            otherlv_0=(Token)match(input,44,FollowSets000.FOLLOW_44_in_ruleAttribute4388); 

                	newLeafNode(otherlv_0, grammarAccess.getAttributeAccess().getAttributeKeyword_0());
                
            otherlv_1=(Token)match(input,13,FollowSets000.FOLLOW_13_in_ruleAttribute4400); 

                	newLeafNode(otherlv_1, grammarAccess.getAttributeAccess().getLeftCurlyBracketKeyword_1());
                
            otherlv_2=(Token)match(input,45,FollowSets000.FOLLOW_45_in_ruleAttribute4412); 

                	newLeafNode(otherlv_2, grammarAccess.getAttributeAccess().getTypeKeyword_2());
                
            // ../ac.soton.xtext.context.dsl/src-gen/ac/soton/xtext/context/dsl/parser/antlr/internal/InternalContextDsl.g:2184:1: ( (lv_type_3_0= ruleAttributeType ) )
            // ../ac.soton.xtext.context.dsl/src-gen/ac/soton/xtext/context/dsl/parser/antlr/internal/InternalContextDsl.g:2185:1: (lv_type_3_0= ruleAttributeType )
            {
            // ../ac.soton.xtext.context.dsl/src-gen/ac/soton/xtext/context/dsl/parser/antlr/internal/InternalContextDsl.g:2185:1: (lv_type_3_0= ruleAttributeType )
            // ../ac.soton.xtext.context.dsl/src-gen/ac/soton/xtext/context/dsl/parser/antlr/internal/InternalContextDsl.g:2186:3: lv_type_3_0= ruleAttributeType
            {
             
            	        newCompositeNode(grammarAccess.getAttributeAccess().getTypeAttributeTypeEnumRuleCall_3_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleAttributeType_in_ruleAttribute4433);
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

            otherlv_4=(Token)match(input,34,FollowSets000.FOLLOW_34_in_ruleAttribute4445); 

                	newLeafNode(otherlv_4, grammarAccess.getAttributeAccess().getValueKeyword_4());
                
            // ../ac.soton.xtext.context.dsl/src-gen/ac/soton/xtext/context/dsl/parser/antlr/internal/InternalContextDsl.g:2206:1: ( (lv_value_5_0= ruleEJavaObject ) )
            // ../ac.soton.xtext.context.dsl/src-gen/ac/soton/xtext/context/dsl/parser/antlr/internal/InternalContextDsl.g:2207:1: (lv_value_5_0= ruleEJavaObject )
            {
            // ../ac.soton.xtext.context.dsl/src-gen/ac/soton/xtext/context/dsl/parser/antlr/internal/InternalContextDsl.g:2207:1: (lv_value_5_0= ruleEJavaObject )
            // ../ac.soton.xtext.context.dsl/src-gen/ac/soton/xtext/context/dsl/parser/antlr/internal/InternalContextDsl.g:2208:3: lv_value_5_0= ruleEJavaObject
            {
             
            	        newCompositeNode(grammarAccess.getAttributeAccess().getValueEJavaObjectParserRuleCall_5_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEJavaObject_in_ruleAttribute4466);
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

            // ../ac.soton.xtext.context.dsl/src-gen/ac/soton/xtext/context/dsl/parser/antlr/internal/InternalContextDsl.g:2224:2: (otherlv_6= 'annotations' otherlv_7= '{' ( (lv_annotations_8_0= ruleAnnotation ) ) (otherlv_9= ',' ( (lv_annotations_10_0= ruleAnnotation ) ) )* otherlv_11= '}' )?
            int alt67=2;
            int LA67_0 = input.LA(1);

            if ( (LA67_0==20) ) {
                alt67=1;
            }
            switch (alt67) {
                case 1 :
                    // ../ac.soton.xtext.context.dsl/src-gen/ac/soton/xtext/context/dsl/parser/antlr/internal/InternalContextDsl.g:2224:4: otherlv_6= 'annotations' otherlv_7= '{' ( (lv_annotations_8_0= ruleAnnotation ) ) (otherlv_9= ',' ( (lv_annotations_10_0= ruleAnnotation ) ) )* otherlv_11= '}'
                    {
                    otherlv_6=(Token)match(input,20,FollowSets000.FOLLOW_20_in_ruleAttribute4479); 

                        	newLeafNode(otherlv_6, grammarAccess.getAttributeAccess().getAnnotationsKeyword_6_0());
                        
                    otherlv_7=(Token)match(input,13,FollowSets000.FOLLOW_13_in_ruleAttribute4491); 

                        	newLeafNode(otherlv_7, grammarAccess.getAttributeAccess().getLeftCurlyBracketKeyword_6_1());
                        
                    // ../ac.soton.xtext.context.dsl/src-gen/ac/soton/xtext/context/dsl/parser/antlr/internal/InternalContextDsl.g:2232:1: ( (lv_annotations_8_0= ruleAnnotation ) )
                    // ../ac.soton.xtext.context.dsl/src-gen/ac/soton/xtext/context/dsl/parser/antlr/internal/InternalContextDsl.g:2233:1: (lv_annotations_8_0= ruleAnnotation )
                    {
                    // ../ac.soton.xtext.context.dsl/src-gen/ac/soton/xtext/context/dsl/parser/antlr/internal/InternalContextDsl.g:2233:1: (lv_annotations_8_0= ruleAnnotation )
                    // ../ac.soton.xtext.context.dsl/src-gen/ac/soton/xtext/context/dsl/parser/antlr/internal/InternalContextDsl.g:2234:3: lv_annotations_8_0= ruleAnnotation
                    {
                     
                    	        newCompositeNode(grammarAccess.getAttributeAccess().getAnnotationsAnnotationParserRuleCall_6_2_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleAnnotation_in_ruleAttribute4512);
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

                    // ../ac.soton.xtext.context.dsl/src-gen/ac/soton/xtext/context/dsl/parser/antlr/internal/InternalContextDsl.g:2250:2: (otherlv_9= ',' ( (lv_annotations_10_0= ruleAnnotation ) ) )*
                    loop66:
                    do {
                        int alt66=2;
                        int LA66_0 = input.LA(1);

                        if ( (LA66_0==18) ) {
                            alt66=1;
                        }


                        switch (alt66) {
                    	case 1 :
                    	    // ../ac.soton.xtext.context.dsl/src-gen/ac/soton/xtext/context/dsl/parser/antlr/internal/InternalContextDsl.g:2250:4: otherlv_9= ',' ( (lv_annotations_10_0= ruleAnnotation ) )
                    	    {
                    	    otherlv_9=(Token)match(input,18,FollowSets000.FOLLOW_18_in_ruleAttribute4525); 

                    	        	newLeafNode(otherlv_9, grammarAccess.getAttributeAccess().getCommaKeyword_6_3_0());
                    	        
                    	    // ../ac.soton.xtext.context.dsl/src-gen/ac/soton/xtext/context/dsl/parser/antlr/internal/InternalContextDsl.g:2254:1: ( (lv_annotations_10_0= ruleAnnotation ) )
                    	    // ../ac.soton.xtext.context.dsl/src-gen/ac/soton/xtext/context/dsl/parser/antlr/internal/InternalContextDsl.g:2255:1: (lv_annotations_10_0= ruleAnnotation )
                    	    {
                    	    // ../ac.soton.xtext.context.dsl/src-gen/ac/soton/xtext/context/dsl/parser/antlr/internal/InternalContextDsl.g:2255:1: (lv_annotations_10_0= ruleAnnotation )
                    	    // ../ac.soton.xtext.context.dsl/src-gen/ac/soton/xtext/context/dsl/parser/antlr/internal/InternalContextDsl.g:2256:3: lv_annotations_10_0= ruleAnnotation
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getAttributeAccess().getAnnotationsAnnotationParserRuleCall_6_3_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleAnnotation_in_ruleAttribute4546);
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
                    	    break loop66;
                        }
                    } while (true);

                    otherlv_11=(Token)match(input,21,FollowSets000.FOLLOW_21_in_ruleAttribute4560); 

                        	newLeafNode(otherlv_11, grammarAccess.getAttributeAccess().getRightCurlyBracketKeyword_6_4());
                        

                    }
                    break;

            }

            otherlv_12=(Token)match(input,21,FollowSets000.FOLLOW_21_in_ruleAttribute4574); 

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
    // ../ac.soton.xtext.context.dsl/src-gen/ac/soton/xtext/context/dsl/parser/antlr/internal/InternalContextDsl.g:2288:1: entryRuleEJavaObject returns [String current=null] : iv_ruleEJavaObject= ruleEJavaObject EOF ;
    public final String entryRuleEJavaObject() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEJavaObject = null;


        try {
            // ../ac.soton.xtext.context.dsl/src-gen/ac/soton/xtext/context/dsl/parser/antlr/internal/InternalContextDsl.g:2289:2: (iv_ruleEJavaObject= ruleEJavaObject EOF )
            // ../ac.soton.xtext.context.dsl/src-gen/ac/soton/xtext/context/dsl/parser/antlr/internal/InternalContextDsl.g:2290:2: iv_ruleEJavaObject= ruleEJavaObject EOF
            {
             newCompositeNode(grammarAccess.getEJavaObjectRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleEJavaObject_in_entryRuleEJavaObject4611);
            iv_ruleEJavaObject=ruleEJavaObject();

            state._fsp--;

             current =iv_ruleEJavaObject.getText(); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleEJavaObject4622); 

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
    // ../ac.soton.xtext.context.dsl/src-gen/ac/soton/xtext/context/dsl/parser/antlr/internal/InternalContextDsl.g:2297:1: ruleEJavaObject returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= 'EJavaObject' ;
    public final AntlrDatatypeRuleToken ruleEJavaObject() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../ac.soton.xtext.context.dsl/src-gen/ac/soton/xtext/context/dsl/parser/antlr/internal/InternalContextDsl.g:2300:28: (kw= 'EJavaObject' )
            // ../ac.soton.xtext.context.dsl/src-gen/ac/soton/xtext/context/dsl/parser/antlr/internal/InternalContextDsl.g:2302:2: kw= 'EJavaObject'
            {
            kw=(Token)match(input,46,FollowSets000.FOLLOW_46_in_ruleEJavaObject4659); 

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


    // $ANTLR start "ruleAttributeType"
    // ../ac.soton.xtext.context.dsl/src-gen/ac/soton/xtext/context/dsl/parser/antlr/internal/InternalContextDsl.g:2315:1: ruleAttributeType returns [Enumerator current=null] : ( (enumLiteral_0= 'Boolean' ) | (enumLiteral_1= 'Handle' ) | (enumLiteral_2= 'Integer' ) | (enumLiteral_3= 'Long' ) | (enumLiteral_4= 'String' ) ) ;
    public final Enumerator ruleAttributeType() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;
        Token enumLiteral_4=null;

         enterRule(); 
        try {
            // ../ac.soton.xtext.context.dsl/src-gen/ac/soton/xtext/context/dsl/parser/antlr/internal/InternalContextDsl.g:2317:28: ( ( (enumLiteral_0= 'Boolean' ) | (enumLiteral_1= 'Handle' ) | (enumLiteral_2= 'Integer' ) | (enumLiteral_3= 'Long' ) | (enumLiteral_4= 'String' ) ) )
            // ../ac.soton.xtext.context.dsl/src-gen/ac/soton/xtext/context/dsl/parser/antlr/internal/InternalContextDsl.g:2318:1: ( (enumLiteral_0= 'Boolean' ) | (enumLiteral_1= 'Handle' ) | (enumLiteral_2= 'Integer' ) | (enumLiteral_3= 'Long' ) | (enumLiteral_4= 'String' ) )
            {
            // ../ac.soton.xtext.context.dsl/src-gen/ac/soton/xtext/context/dsl/parser/antlr/internal/InternalContextDsl.g:2318:1: ( (enumLiteral_0= 'Boolean' ) | (enumLiteral_1= 'Handle' ) | (enumLiteral_2= 'Integer' ) | (enumLiteral_3= 'Long' ) | (enumLiteral_4= 'String' ) )
            int alt68=5;
            switch ( input.LA(1) ) {
            case 47:
                {
                alt68=1;
                }
                break;
            case 48:
                {
                alt68=2;
                }
                break;
            case 49:
                {
                alt68=3;
                }
                break;
            case 50:
                {
                alt68=4;
                }
                break;
            case 51:
                {
                alt68=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 68, 0, input);

                throw nvae;
            }

            switch (alt68) {
                case 1 :
                    // ../ac.soton.xtext.context.dsl/src-gen/ac/soton/xtext/context/dsl/parser/antlr/internal/InternalContextDsl.g:2318:2: (enumLiteral_0= 'Boolean' )
                    {
                    // ../ac.soton.xtext.context.dsl/src-gen/ac/soton/xtext/context/dsl/parser/antlr/internal/InternalContextDsl.g:2318:2: (enumLiteral_0= 'Boolean' )
                    // ../ac.soton.xtext.context.dsl/src-gen/ac/soton/xtext/context/dsl/parser/antlr/internal/InternalContextDsl.g:2318:4: enumLiteral_0= 'Boolean'
                    {
                    enumLiteral_0=(Token)match(input,47,FollowSets000.FOLLOW_47_in_ruleAttributeType4712); 

                            current = grammarAccess.getAttributeTypeAccess().getBooleanEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_0, grammarAccess.getAttributeTypeAccess().getBooleanEnumLiteralDeclaration_0()); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../ac.soton.xtext.context.dsl/src-gen/ac/soton/xtext/context/dsl/parser/antlr/internal/InternalContextDsl.g:2324:6: (enumLiteral_1= 'Handle' )
                    {
                    // ../ac.soton.xtext.context.dsl/src-gen/ac/soton/xtext/context/dsl/parser/antlr/internal/InternalContextDsl.g:2324:6: (enumLiteral_1= 'Handle' )
                    // ../ac.soton.xtext.context.dsl/src-gen/ac/soton/xtext/context/dsl/parser/antlr/internal/InternalContextDsl.g:2324:8: enumLiteral_1= 'Handle'
                    {
                    enumLiteral_1=(Token)match(input,48,FollowSets000.FOLLOW_48_in_ruleAttributeType4729); 

                            current = grammarAccess.getAttributeTypeAccess().getHandleEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_1, grammarAccess.getAttributeTypeAccess().getHandleEnumLiteralDeclaration_1()); 
                        

                    }


                    }
                    break;
                case 3 :
                    // ../ac.soton.xtext.context.dsl/src-gen/ac/soton/xtext/context/dsl/parser/antlr/internal/InternalContextDsl.g:2330:6: (enumLiteral_2= 'Integer' )
                    {
                    // ../ac.soton.xtext.context.dsl/src-gen/ac/soton/xtext/context/dsl/parser/antlr/internal/InternalContextDsl.g:2330:6: (enumLiteral_2= 'Integer' )
                    // ../ac.soton.xtext.context.dsl/src-gen/ac/soton/xtext/context/dsl/parser/antlr/internal/InternalContextDsl.g:2330:8: enumLiteral_2= 'Integer'
                    {
                    enumLiteral_2=(Token)match(input,49,FollowSets000.FOLLOW_49_in_ruleAttributeType4746); 

                            current = grammarAccess.getAttributeTypeAccess().getIntegerEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_2, grammarAccess.getAttributeTypeAccess().getIntegerEnumLiteralDeclaration_2()); 
                        

                    }


                    }
                    break;
                case 4 :
                    // ../ac.soton.xtext.context.dsl/src-gen/ac/soton/xtext/context/dsl/parser/antlr/internal/InternalContextDsl.g:2336:6: (enumLiteral_3= 'Long' )
                    {
                    // ../ac.soton.xtext.context.dsl/src-gen/ac/soton/xtext/context/dsl/parser/antlr/internal/InternalContextDsl.g:2336:6: (enumLiteral_3= 'Long' )
                    // ../ac.soton.xtext.context.dsl/src-gen/ac/soton/xtext/context/dsl/parser/antlr/internal/InternalContextDsl.g:2336:8: enumLiteral_3= 'Long'
                    {
                    enumLiteral_3=(Token)match(input,50,FollowSets000.FOLLOW_50_in_ruleAttributeType4763); 

                            current = grammarAccess.getAttributeTypeAccess().getLongEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_3, grammarAccess.getAttributeTypeAccess().getLongEnumLiteralDeclaration_3()); 
                        

                    }


                    }
                    break;
                case 5 :
                    // ../ac.soton.xtext.context.dsl/src-gen/ac/soton/xtext/context/dsl/parser/antlr/internal/InternalContextDsl.g:2342:6: (enumLiteral_4= 'String' )
                    {
                    // ../ac.soton.xtext.context.dsl/src-gen/ac/soton/xtext/context/dsl/parser/antlr/internal/InternalContextDsl.g:2342:6: (enumLiteral_4= 'String' )
                    // ../ac.soton.xtext.context.dsl/src-gen/ac/soton/xtext/context/dsl/parser/antlr/internal/InternalContextDsl.g:2342:8: enumLiteral_4= 'String'
                    {
                    enumLiteral_4=(Token)match(input,51,FollowSets000.FOLLOW_51_in_ruleAttributeType4780); 

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

    // Delegated rules


 

    
    private static class FollowSets000 {
        public static final BitSet FOLLOW_ruleContext_in_entryRuleContext75 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleContext85 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_11_in_ruleContext137 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleContext163 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleContext184 = new BitSet(new long[]{0x0000000000002000L});
        public static final BitSet FOLLOW_13_in_ruleContext196 = new BitSet(new long[]{0x0000000007F1C000L});
        public static final BitSet FOLLOW_14_in_ruleContext209 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleContext230 = new BitSet(new long[]{0x0000000007F18000L});
        public static final BitSet FOLLOW_15_in_ruleContext245 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleContext266 = new BitSet(new long[]{0x0000000007F10000L});
        public static final BitSet FOLLOW_16_in_ruleContext281 = new BitSet(new long[]{0x0000000000020000L});
        public static final BitSet FOLLOW_17_in_ruleContext293 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleContext316 = new BitSet(new long[]{0x00000000000C0000L});
        public static final BitSet FOLLOW_18_in_ruleContext329 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleContext352 = new BitSet(new long[]{0x00000000000C0000L});
        public static final BitSet FOLLOW_19_in_ruleContext366 = new BitSet(new long[]{0x0000000007F00000L});
        public static final BitSet FOLLOW_20_in_ruleContext381 = new BitSet(new long[]{0x0000000000002000L});
        public static final BitSet FOLLOW_13_in_ruleContext393 = new BitSet(new long[]{0x0000000008000000L});
        public static final BitSet FOLLOW_ruleAnnotation_in_ruleContext414 = new BitSet(new long[]{0x0000000000240000L});
        public static final BitSet FOLLOW_18_in_ruleContext427 = new BitSet(new long[]{0x0000000008000000L});
        public static final BitSet FOLLOW_ruleAnnotation_in_ruleContext448 = new BitSet(new long[]{0x0000000000240000L});
        public static final BitSet FOLLOW_21_in_ruleContext462 = new BitSet(new long[]{0x0000000007E00000L});
        public static final BitSet FOLLOW_22_in_ruleContext477 = new BitSet(new long[]{0x0000000000002000L});
        public static final BitSet FOLLOW_13_in_ruleContext489 = new BitSet(new long[]{0x0000040000000800L});
        public static final BitSet FOLLOW_ruleAbstractExtension_in_ruleContext510 = new BitSet(new long[]{0x0000000000240000L});
        public static final BitSet FOLLOW_18_in_ruleContext523 = new BitSet(new long[]{0x0000040000000800L});
        public static final BitSet FOLLOW_ruleAbstractExtension_in_ruleContext544 = new BitSet(new long[]{0x0000000000240000L});
        public static final BitSet FOLLOW_21_in_ruleContext558 = new BitSet(new long[]{0x0000000007A00000L});
        public static final BitSet FOLLOW_23_in_ruleContext573 = new BitSet(new long[]{0x0000000000002000L});
        public static final BitSet FOLLOW_13_in_ruleContext585 = new BitSet(new long[]{0x0000000100000000L});
        public static final BitSet FOLLOW_ruleStringToAttributeMapEntry_in_ruleContext606 = new BitSet(new long[]{0x0000000000240000L});
        public static final BitSet FOLLOW_18_in_ruleContext619 = new BitSet(new long[]{0x0000000100000000L});
        public static final BitSet FOLLOW_ruleStringToAttributeMapEntry_in_ruleContext640 = new BitSet(new long[]{0x0000000000240000L});
        public static final BitSet FOLLOW_21_in_ruleContext654 = new BitSet(new long[]{0x0000000007200000L});
        public static final BitSet FOLLOW_24_in_ruleContext669 = new BitSet(new long[]{0x0000000000002000L});
        public static final BitSet FOLLOW_13_in_ruleContext681 = new BitSet(new long[]{0x0000000800000800L});
        public static final BitSet FOLLOW_ruleCarrierSet_in_ruleContext702 = new BitSet(new long[]{0x0000000000240000L});
        public static final BitSet FOLLOW_18_in_ruleContext715 = new BitSet(new long[]{0x0000000800000800L});
        public static final BitSet FOLLOW_ruleCarrierSet_in_ruleContext736 = new BitSet(new long[]{0x0000000000240000L});
        public static final BitSet FOLLOW_21_in_ruleContext750 = new BitSet(new long[]{0x0000000006200000L});
        public static final BitSet FOLLOW_25_in_ruleContext765 = new BitSet(new long[]{0x0000000000002000L});
        public static final BitSet FOLLOW_13_in_ruleContext777 = new BitSet(new long[]{0x0000001000000800L});
        public static final BitSet FOLLOW_ruleConstant_in_ruleContext798 = new BitSet(new long[]{0x0000000000240000L});
        public static final BitSet FOLLOW_18_in_ruleContext811 = new BitSet(new long[]{0x0000001000000800L});
        public static final BitSet FOLLOW_ruleConstant_in_ruleContext832 = new BitSet(new long[]{0x0000000000240000L});
        public static final BitSet FOLLOW_21_in_ruleContext846 = new BitSet(new long[]{0x0000000004200000L});
        public static final BitSet FOLLOW_26_in_ruleContext861 = new BitSet(new long[]{0x0000000000002000L});
        public static final BitSet FOLLOW_13_in_ruleContext873 = new BitSet(new long[]{0x0000002000000800L});
        public static final BitSet FOLLOW_ruleAxiom_in_ruleContext894 = new BitSet(new long[]{0x0000000000240000L});
        public static final BitSet FOLLOW_18_in_ruleContext907 = new BitSet(new long[]{0x0000002000000800L});
        public static final BitSet FOLLOW_ruleAxiom_in_ruleContext928 = new BitSet(new long[]{0x0000000000240000L});
        public static final BitSet FOLLOW_21_in_ruleContext942 = new BitSet(new long[]{0x0000000000200000L});
        public static final BitSet FOLLOW_21_in_ruleContext956 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAbstractExtension_in_entryRuleAbstractExtension992 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleAbstractExtension1002 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleExtension_in_ruleAbstractExtension1048 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAnnotation_in_entryRuleAnnotation1082 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleAnnotation1092 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_27_in_ruleAnnotation1138 = new BitSet(new long[]{0x0000000000002000L});
        public static final BitSet FOLLOW_13_in_ruleAnnotation1150 = new BitSet(new long[]{0x00000000F0300000L});
        public static final BitSet FOLLOW_28_in_ruleAnnotation1163 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleAnnotation1184 = new BitSet(new long[]{0x00000000E0300000L});
        public static final BitSet FOLLOW_29_in_ruleAnnotation1199 = new BitSet(new long[]{0x0000000000020000L});
        public static final BitSet FOLLOW_17_in_ruleAnnotation1211 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleAnnotation1234 = new BitSet(new long[]{0x00000000000C0000L});
        public static final BitSet FOLLOW_18_in_ruleAnnotation1247 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleAnnotation1270 = new BitSet(new long[]{0x00000000000C0000L});
        public static final BitSet FOLLOW_19_in_ruleAnnotation1284 = new BitSet(new long[]{0x00000000C0300000L});
        public static final BitSet FOLLOW_20_in_ruleAnnotation1299 = new BitSet(new long[]{0x0000000000002000L});
        public static final BitSet FOLLOW_13_in_ruleAnnotation1311 = new BitSet(new long[]{0x0000000008000000L});
        public static final BitSet FOLLOW_ruleAnnotation_in_ruleAnnotation1332 = new BitSet(new long[]{0x0000000000240000L});
        public static final BitSet FOLLOW_18_in_ruleAnnotation1345 = new BitSet(new long[]{0x0000000008000000L});
        public static final BitSet FOLLOW_ruleAnnotation_in_ruleAnnotation1366 = new BitSet(new long[]{0x0000000000240000L});
        public static final BitSet FOLLOW_21_in_ruleAnnotation1380 = new BitSet(new long[]{0x00000000C0200000L});
        public static final BitSet FOLLOW_30_in_ruleAnnotation1395 = new BitSet(new long[]{0x0000000000002000L});
        public static final BitSet FOLLOW_13_in_ruleAnnotation1407 = new BitSet(new long[]{0x0000010000000000L});
        public static final BitSet FOLLOW_ruleStringToStringMapEntry_in_ruleAnnotation1428 = new BitSet(new long[]{0x0000000000240000L});
        public static final BitSet FOLLOW_18_in_ruleAnnotation1441 = new BitSet(new long[]{0x0000010000000000L});
        public static final BitSet FOLLOW_ruleStringToStringMapEntry_in_ruleAnnotation1462 = new BitSet(new long[]{0x0000000000240000L});
        public static final BitSet FOLLOW_21_in_ruleAnnotation1476 = new BitSet(new long[]{0x0000000080200000L});
        public static final BitSet FOLLOW_31_in_ruleAnnotation1491 = new BitSet(new long[]{0x0000000000002000L});
        public static final BitSet FOLLOW_13_in_ruleAnnotation1503 = new BitSet(new long[]{0x0000020000000000L});
        public static final BitSet FOLLOW_ruleEObject_in_ruleAnnotation1524 = new BitSet(new long[]{0x0000000000240000L});
        public static final BitSet FOLLOW_18_in_ruleAnnotation1537 = new BitSet(new long[]{0x0000020000000000L});
        public static final BitSet FOLLOW_ruleEObject_in_ruleAnnotation1558 = new BitSet(new long[]{0x0000000000240000L});
        public static final BitSet FOLLOW_21_in_ruleAnnotation1572 = new BitSet(new long[]{0x0000000000200000L});
        public static final BitSet FOLLOW_21_in_ruleAnnotation1586 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleStringToAttributeMapEntry_in_entryRuleStringToAttributeMapEntry1622 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleStringToAttributeMapEntry1632 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_32_in_ruleStringToAttributeMapEntry1669 = new BitSet(new long[]{0x0000000000002000L});
        public static final BitSet FOLLOW_13_in_ruleStringToAttributeMapEntry1681 = new BitSet(new long[]{0x0000000200000000L});
        public static final BitSet FOLLOW_33_in_ruleStringToAttributeMapEntry1693 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleStringToAttributeMapEntry1714 = new BitSet(new long[]{0x0000000400200000L});
        public static final BitSet FOLLOW_34_in_ruleStringToAttributeMapEntry1727 = new BitSet(new long[]{0x0000100000000000L});
        public static final BitSet FOLLOW_ruleAttribute_in_ruleStringToAttributeMapEntry1748 = new BitSet(new long[]{0x0000000000200000L});
        public static final BitSet FOLLOW_21_in_ruleStringToAttributeMapEntry1762 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_entryRuleEString1801 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleEString1812 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_STRING_in_ruleEString1852 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleEString1878 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleCarrierSet_in_entryRuleCarrierSet1923 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleCarrierSet1933 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_11_in_ruleCarrierSet1985 = new BitSet(new long[]{0x0000000800000000L});
        public static final BitSet FOLLOW_35_in_ruleCarrierSet2011 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleCarrierSet2032 = new BitSet(new long[]{0x0000000000002000L});
        public static final BitSet FOLLOW_13_in_ruleCarrierSet2044 = new BitSet(new long[]{0x0000000000F0C000L});
        public static final BitSet FOLLOW_14_in_ruleCarrierSet2057 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleCarrierSet2078 = new BitSet(new long[]{0x0000000000F08000L});
        public static final BitSet FOLLOW_15_in_ruleCarrierSet2093 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleCarrierSet2114 = new BitSet(new long[]{0x0000000000F00000L});
        public static final BitSet FOLLOW_20_in_ruleCarrierSet2129 = new BitSet(new long[]{0x0000000000002000L});
        public static final BitSet FOLLOW_13_in_ruleCarrierSet2141 = new BitSet(new long[]{0x0000000008000000L});
        public static final BitSet FOLLOW_ruleAnnotation_in_ruleCarrierSet2162 = new BitSet(new long[]{0x0000000000240000L});
        public static final BitSet FOLLOW_18_in_ruleCarrierSet2175 = new BitSet(new long[]{0x0000000008000000L});
        public static final BitSet FOLLOW_ruleAnnotation_in_ruleCarrierSet2196 = new BitSet(new long[]{0x0000000000240000L});
        public static final BitSet FOLLOW_21_in_ruleCarrierSet2210 = new BitSet(new long[]{0x0000000000E00000L});
        public static final BitSet FOLLOW_22_in_ruleCarrierSet2225 = new BitSet(new long[]{0x0000000000002000L});
        public static final BitSet FOLLOW_13_in_ruleCarrierSet2237 = new BitSet(new long[]{0x0000040000000800L});
        public static final BitSet FOLLOW_ruleAbstractExtension_in_ruleCarrierSet2258 = new BitSet(new long[]{0x0000000000240000L});
        public static final BitSet FOLLOW_18_in_ruleCarrierSet2271 = new BitSet(new long[]{0x0000040000000800L});
        public static final BitSet FOLLOW_ruleAbstractExtension_in_ruleCarrierSet2292 = new BitSet(new long[]{0x0000000000240000L});
        public static final BitSet FOLLOW_21_in_ruleCarrierSet2306 = new BitSet(new long[]{0x0000000000A00000L});
        public static final BitSet FOLLOW_23_in_ruleCarrierSet2321 = new BitSet(new long[]{0x0000000000002000L});
        public static final BitSet FOLLOW_13_in_ruleCarrierSet2333 = new BitSet(new long[]{0x0000000100000000L});
        public static final BitSet FOLLOW_ruleStringToAttributeMapEntry_in_ruleCarrierSet2354 = new BitSet(new long[]{0x0000000000240000L});
        public static final BitSet FOLLOW_18_in_ruleCarrierSet2367 = new BitSet(new long[]{0x0000000100000000L});
        public static final BitSet FOLLOW_ruleStringToAttributeMapEntry_in_ruleCarrierSet2388 = new BitSet(new long[]{0x0000000000240000L});
        public static final BitSet FOLLOW_21_in_ruleCarrierSet2402 = new BitSet(new long[]{0x0000000000200000L});
        public static final BitSet FOLLOW_21_in_ruleCarrierSet2416 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleConstant_in_entryRuleConstant2452 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleConstant2462 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_11_in_ruleConstant2514 = new BitSet(new long[]{0x0000001000000000L});
        public static final BitSet FOLLOW_36_in_ruleConstant2540 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleConstant2561 = new BitSet(new long[]{0x0000000000002000L});
        public static final BitSet FOLLOW_13_in_ruleConstant2573 = new BitSet(new long[]{0x0000000000F0C000L});
        public static final BitSet FOLLOW_14_in_ruleConstant2586 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleConstant2607 = new BitSet(new long[]{0x0000000000F08000L});
        public static final BitSet FOLLOW_15_in_ruleConstant2622 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleConstant2643 = new BitSet(new long[]{0x0000000000F00000L});
        public static final BitSet FOLLOW_20_in_ruleConstant2658 = new BitSet(new long[]{0x0000000000002000L});
        public static final BitSet FOLLOW_13_in_ruleConstant2670 = new BitSet(new long[]{0x0000000008000000L});
        public static final BitSet FOLLOW_ruleAnnotation_in_ruleConstant2691 = new BitSet(new long[]{0x0000000000240000L});
        public static final BitSet FOLLOW_18_in_ruleConstant2704 = new BitSet(new long[]{0x0000000008000000L});
        public static final BitSet FOLLOW_ruleAnnotation_in_ruleConstant2725 = new BitSet(new long[]{0x0000000000240000L});
        public static final BitSet FOLLOW_21_in_ruleConstant2739 = new BitSet(new long[]{0x0000000000E00000L});
        public static final BitSet FOLLOW_22_in_ruleConstant2754 = new BitSet(new long[]{0x0000000000002000L});
        public static final BitSet FOLLOW_13_in_ruleConstant2766 = new BitSet(new long[]{0x0000040000000800L});
        public static final BitSet FOLLOW_ruleAbstractExtension_in_ruleConstant2787 = new BitSet(new long[]{0x0000000000240000L});
        public static final BitSet FOLLOW_18_in_ruleConstant2800 = new BitSet(new long[]{0x0000040000000800L});
        public static final BitSet FOLLOW_ruleAbstractExtension_in_ruleConstant2821 = new BitSet(new long[]{0x0000000000240000L});
        public static final BitSet FOLLOW_21_in_ruleConstant2835 = new BitSet(new long[]{0x0000000000A00000L});
        public static final BitSet FOLLOW_23_in_ruleConstant2850 = new BitSet(new long[]{0x0000000000002000L});
        public static final BitSet FOLLOW_13_in_ruleConstant2862 = new BitSet(new long[]{0x0000000100000000L});
        public static final BitSet FOLLOW_ruleStringToAttributeMapEntry_in_ruleConstant2883 = new BitSet(new long[]{0x0000000000240000L});
        public static final BitSet FOLLOW_18_in_ruleConstant2896 = new BitSet(new long[]{0x0000000100000000L});
        public static final BitSet FOLLOW_ruleStringToAttributeMapEntry_in_ruleConstant2917 = new BitSet(new long[]{0x0000000000240000L});
        public static final BitSet FOLLOW_21_in_ruleConstant2931 = new BitSet(new long[]{0x0000000000200000L});
        public static final BitSet FOLLOW_21_in_ruleConstant2945 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAxiom_in_entryRuleAxiom2981 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleAxiom2991 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_11_in_ruleAxiom3034 = new BitSet(new long[]{0x0000002000000000L});
        public static final BitSet FOLLOW_37_in_ruleAxiom3066 = new BitSet(new long[]{0x0000004000000000L});
        public static final BitSet FOLLOW_38_in_ruleAxiom3091 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleAxiom3112 = new BitSet(new long[]{0x0000000000002000L});
        public static final BitSet FOLLOW_13_in_ruleAxiom3124 = new BitSet(new long[]{0x000000800000C000L});
        public static final BitSet FOLLOW_14_in_ruleAxiom3137 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleAxiom3158 = new BitSet(new long[]{0x0000008000008000L});
        public static final BitSet FOLLOW_15_in_ruleAxiom3173 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleAxiom3194 = new BitSet(new long[]{0x0000008000000000L});
        public static final BitSet FOLLOW_39_in_ruleAxiom3208 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleAxiom3229 = new BitSet(new long[]{0x0000000000F00000L});
        public static final BitSet FOLLOW_20_in_ruleAxiom3242 = new BitSet(new long[]{0x0000000000002000L});
        public static final BitSet FOLLOW_13_in_ruleAxiom3254 = new BitSet(new long[]{0x0000000008000000L});
        public static final BitSet FOLLOW_ruleAnnotation_in_ruleAxiom3275 = new BitSet(new long[]{0x0000000000240000L});
        public static final BitSet FOLLOW_18_in_ruleAxiom3288 = new BitSet(new long[]{0x0000000008000000L});
        public static final BitSet FOLLOW_ruleAnnotation_in_ruleAxiom3309 = new BitSet(new long[]{0x0000000000240000L});
        public static final BitSet FOLLOW_21_in_ruleAxiom3323 = new BitSet(new long[]{0x0000000000E00000L});
        public static final BitSet FOLLOW_22_in_ruleAxiom3338 = new BitSet(new long[]{0x0000000000002000L});
        public static final BitSet FOLLOW_13_in_ruleAxiom3350 = new BitSet(new long[]{0x0000040000000800L});
        public static final BitSet FOLLOW_ruleAbstractExtension_in_ruleAxiom3371 = new BitSet(new long[]{0x0000000000240000L});
        public static final BitSet FOLLOW_18_in_ruleAxiom3384 = new BitSet(new long[]{0x0000040000000800L});
        public static final BitSet FOLLOW_ruleAbstractExtension_in_ruleAxiom3405 = new BitSet(new long[]{0x0000000000240000L});
        public static final BitSet FOLLOW_21_in_ruleAxiom3419 = new BitSet(new long[]{0x0000000000A00000L});
        public static final BitSet FOLLOW_23_in_ruleAxiom3434 = new BitSet(new long[]{0x0000000000002000L});
        public static final BitSet FOLLOW_13_in_ruleAxiom3446 = new BitSet(new long[]{0x0000000100000000L});
        public static final BitSet FOLLOW_ruleStringToAttributeMapEntry_in_ruleAxiom3467 = new BitSet(new long[]{0x0000000000240000L});
        public static final BitSet FOLLOW_18_in_ruleAxiom3480 = new BitSet(new long[]{0x0000000100000000L});
        public static final BitSet FOLLOW_ruleStringToAttributeMapEntry_in_ruleAxiom3501 = new BitSet(new long[]{0x0000000000240000L});
        public static final BitSet FOLLOW_21_in_ruleAxiom3515 = new BitSet(new long[]{0x0000000000200000L});
        public static final BitSet FOLLOW_21_in_ruleAxiom3529 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleStringToStringMapEntry_in_entryRuleStringToStringMapEntry3565 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleStringToStringMapEntry3575 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_40_in_ruleStringToStringMapEntry3621 = new BitSet(new long[]{0x0000000000002000L});
        public static final BitSet FOLLOW_13_in_ruleStringToStringMapEntry3633 = new BitSet(new long[]{0x0000000600200000L});
        public static final BitSet FOLLOW_33_in_ruleStringToStringMapEntry3646 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleStringToStringMapEntry3667 = new BitSet(new long[]{0x0000000400200000L});
        public static final BitSet FOLLOW_34_in_ruleStringToStringMapEntry3682 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleStringToStringMapEntry3703 = new BitSet(new long[]{0x0000000000200000L});
        public static final BitSet FOLLOW_21_in_ruleStringToStringMapEntry3717 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEObject_in_entryRuleEObject3753 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleEObject3763 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_41_in_ruleEObject3809 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleExtension_in_entryRuleExtension3845 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleExtension3855 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_11_in_ruleExtension3898 = new BitSet(new long[]{0x0000040000000000L});
        public static final BitSet FOLLOW_42_in_ruleExtension3924 = new BitSet(new long[]{0x0000000000002000L});
        public static final BitSet FOLLOW_13_in_ruleExtension3936 = new BitSet(new long[]{0x0000080000004000L});
        public static final BitSet FOLLOW_14_in_ruleExtension3949 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleExtension3970 = new BitSet(new long[]{0x0000080000000000L});
        public static final BitSet FOLLOW_43_in_ruleExtension3984 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleExtension4005 = new BitSet(new long[]{0x0000000000F00000L});
        public static final BitSet FOLLOW_20_in_ruleExtension4018 = new BitSet(new long[]{0x0000000000002000L});
        public static final BitSet FOLLOW_13_in_ruleExtension4030 = new BitSet(new long[]{0x0000000008000000L});
        public static final BitSet FOLLOW_ruleAnnotation_in_ruleExtension4051 = new BitSet(new long[]{0x0000000000240000L});
        public static final BitSet FOLLOW_18_in_ruleExtension4064 = new BitSet(new long[]{0x0000000008000000L});
        public static final BitSet FOLLOW_ruleAnnotation_in_ruleExtension4085 = new BitSet(new long[]{0x0000000000240000L});
        public static final BitSet FOLLOW_21_in_ruleExtension4099 = new BitSet(new long[]{0x0000000000E00000L});
        public static final BitSet FOLLOW_22_in_ruleExtension4114 = new BitSet(new long[]{0x0000000000002000L});
        public static final BitSet FOLLOW_13_in_ruleExtension4126 = new BitSet(new long[]{0x0000040000000800L});
        public static final BitSet FOLLOW_ruleAbstractExtension_in_ruleExtension4147 = new BitSet(new long[]{0x0000000000240000L});
        public static final BitSet FOLLOW_18_in_ruleExtension4160 = new BitSet(new long[]{0x0000040000000800L});
        public static final BitSet FOLLOW_ruleAbstractExtension_in_ruleExtension4181 = new BitSet(new long[]{0x0000000000240000L});
        public static final BitSet FOLLOW_21_in_ruleExtension4195 = new BitSet(new long[]{0x0000000000A00000L});
        public static final BitSet FOLLOW_23_in_ruleExtension4210 = new BitSet(new long[]{0x0000000000002000L});
        public static final BitSet FOLLOW_13_in_ruleExtension4222 = new BitSet(new long[]{0x0000000100000000L});
        public static final BitSet FOLLOW_ruleStringToAttributeMapEntry_in_ruleExtension4243 = new BitSet(new long[]{0x0000000000240000L});
        public static final BitSet FOLLOW_18_in_ruleExtension4256 = new BitSet(new long[]{0x0000000100000000L});
        public static final BitSet FOLLOW_ruleStringToAttributeMapEntry_in_ruleExtension4277 = new BitSet(new long[]{0x0000000000240000L});
        public static final BitSet FOLLOW_21_in_ruleExtension4291 = new BitSet(new long[]{0x0000000000200000L});
        public static final BitSet FOLLOW_21_in_ruleExtension4305 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAttribute_in_entryRuleAttribute4341 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleAttribute4351 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_44_in_ruleAttribute4388 = new BitSet(new long[]{0x0000000000002000L});
        public static final BitSet FOLLOW_13_in_ruleAttribute4400 = new BitSet(new long[]{0x0000200000000000L});
        public static final BitSet FOLLOW_45_in_ruleAttribute4412 = new BitSet(new long[]{0x000F800000000000L});
        public static final BitSet FOLLOW_ruleAttributeType_in_ruleAttribute4433 = new BitSet(new long[]{0x0000000400000000L});
        public static final BitSet FOLLOW_34_in_ruleAttribute4445 = new BitSet(new long[]{0x0000400000000000L});
        public static final BitSet FOLLOW_ruleEJavaObject_in_ruleAttribute4466 = new BitSet(new long[]{0x0000000000300000L});
        public static final BitSet FOLLOW_20_in_ruleAttribute4479 = new BitSet(new long[]{0x0000000000002000L});
        public static final BitSet FOLLOW_13_in_ruleAttribute4491 = new BitSet(new long[]{0x0000000008000000L});
        public static final BitSet FOLLOW_ruleAnnotation_in_ruleAttribute4512 = new BitSet(new long[]{0x0000000000240000L});
        public static final BitSet FOLLOW_18_in_ruleAttribute4525 = new BitSet(new long[]{0x0000000008000000L});
        public static final BitSet FOLLOW_ruleAnnotation_in_ruleAttribute4546 = new BitSet(new long[]{0x0000000000240000L});
        public static final BitSet FOLLOW_21_in_ruleAttribute4560 = new BitSet(new long[]{0x0000000000200000L});
        public static final BitSet FOLLOW_21_in_ruleAttribute4574 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEJavaObject_in_entryRuleEJavaObject4611 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleEJavaObject4622 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_46_in_ruleEJavaObject4659 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_47_in_ruleAttributeType4712 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_48_in_ruleAttributeType4729 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_49_in_ruleAttributeType4746 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_50_in_ruleAttributeType4763 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_51_in_ruleAttributeType4780 = new BitSet(new long[]{0x0000000000000002L});
    }


}