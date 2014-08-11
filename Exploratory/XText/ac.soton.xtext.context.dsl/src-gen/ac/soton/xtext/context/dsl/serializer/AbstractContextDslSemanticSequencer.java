package ac.soton.xtext.context.dsl.serializer;

import ac.soton.xtext.context.dsl.services.ContextDslGrammarAccess;
import com.google.inject.Inject;
import com.google.inject.Provider;
import org.eclipse.emf.common.util.BasicEMap.Entry;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.xtext.serializer.acceptor.ISemanticSequenceAcceptor;
import org.eclipse.xtext.serializer.diagnostic.ISemanticSequencerDiagnosticProvider;
import org.eclipse.xtext.serializer.diagnostic.ISerializationDiagnostic.Acceptor;
import org.eclipse.xtext.serializer.sequencer.AbstractDelegatingSemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.GenericSequencer;
import org.eclipse.xtext.serializer.sequencer.ISemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService;
import org.eventb.emf.core.Annotation;
import org.eventb.emf.core.Attribute;
import org.eventb.emf.core.CorePackage;
import org.eventb.emf.core.Extension;
import org.eventb.emf.core.context.Axiom;
import org.eventb.emf.core.context.CarrierSet;
import org.eventb.emf.core.context.Constant;
import org.eventb.emf.core.context.Context;
import org.eventb.emf.core.context.ContextPackage;

@SuppressWarnings("all")
public abstract class AbstractContextDslSemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private ContextDslGrammarAccess grammarAccess;
	
	public void createSequence(EObject context, EObject semanticObject) {
		if(semanticObject.eClass().getEPackage() == ContextPackage.eINSTANCE) switch(semanticObject.eClass().getClassifierID()) {
			case ContextPackage.AXIOM:
				if(context == grammarAccess.getAxiomRule()) {
					sequence_Axiom(context, (Axiom) semanticObject); 
					return; 
				}
				else break;
			case ContextPackage.CARRIER_SET:
				if(context == grammarAccess.getCarrierSetRule()) {
					sequence_CarrierSet(context, (CarrierSet) semanticObject); 
					return; 
				}
				else break;
			case ContextPackage.CONSTANT:
				if(context == grammarAccess.getConstantRule()) {
					sequence_Constant(context, (Constant) semanticObject); 
					return; 
				}
				else break;
			case ContextPackage.CONTEXT:
				if(context == grammarAccess.getContextRule()) {
					sequence_Context(context, (Context) semanticObject); 
					return; 
				}
				else break;
			}
		else if(semanticObject.eClass().getEPackage() == CorePackage.eINSTANCE) switch(semanticObject.eClass().getClassifierID()) {
			case CorePackage.ANNOTATION:
				if(context == grammarAccess.getAnnotationRule()) {
					sequence_Annotation(context, (Annotation) semanticObject); 
					return; 
				}
				else break;
			case CorePackage.ATTRIBUTE:
				if(context == grammarAccess.getAttributeRule()) {
					sequence_Attribute(context, (Attribute) semanticObject); 
					return; 
				}
				else break;
			case CorePackage.EXTENSION:
				if(context == grammarAccess.getAbstractExtensionRule() ||
				   context == grammarAccess.getExtensionRule()) {
					sequence_Extension(context, (Extension) semanticObject); 
					return; 
				}
				else break;
			case CorePackage.STRING_TO_ATTRIBUTE_MAP_ENTRY:
				if(context == grammarAccess.getStringToAttributeMapEntryRule()) {
					sequence_StringToAttributeMapEntry(context, (Entry<?, ?>) semanticObject); 
					return; 
				}
				else break;
			case CorePackage.STRING_TO_STRING_MAP_ENTRY:
				if(context == grammarAccess.getStringToStringMapEntryRule()) {
					sequence_StringToStringMapEntry(context, (Entry<?, ?>) semanticObject); 
					return; 
				}
				else break;
			}
		else if(semanticObject.eClass().getEPackage() == EcorePackage.eINSTANCE) switch(semanticObject.eClass().getClassifierID()) {
			case EcorePackage.EOBJECT:
				if(context == grammarAccess.getEObjectRule()) {
					sequence_EObject(context, (EObject) semanticObject); 
					return; 
				}
				else break;
			}
		if (errorAcceptor != null) errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Constraint:
	 *     (
	 *         source=EString? 
	 *         (references+=[EObject|EString] references+=[EObject|EString]*)? 
	 *         (annotations+=Annotation annotations+=Annotation*)? 
	 *         (details+=StringToStringMapEntry details+=StringToStringMapEntry*)? 
	 *         (contents+=EObject contents+=EObject*)?
	 *     )
	 */
	protected void sequence_Annotation(EObject context, Annotation semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (type=AttributeType value=EJavaObject (annotations+=Annotation annotations+=Annotation*)?)
	 */
	protected void sequence_Attribute(EObject context, Attribute semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         localGenerated?='localGenerated'? 
	 *         theorem?='theorem' 
	 *         name=EString 
	 *         internalId=EString? 
	 *         comment=EString? 
	 *         predicate=EString 
	 *         (annotations+=Annotation annotations+=Annotation*)? 
	 *         (extensions+=AbstractExtension extensions+=AbstractExtension*)? 
	 *         (attributes+=StringToAttributeMapEntry attributes+=StringToAttributeMapEntry*)?
	 *     )
	 */
	protected void sequence_Axiom(EObject context, Axiom semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         localGenerated?='localGenerated'? 
	 *         name=EString 
	 *         internalId=EString? 
	 *         comment=EString? 
	 *         (annotations+=Annotation annotations+=Annotation*)? 
	 *         (extensions+=AbstractExtension extensions+=AbstractExtension*)? 
	 *         (attributes+=StringToAttributeMapEntry attributes+=StringToAttributeMapEntry*)?
	 *     )
	 */
	protected void sequence_CarrierSet(EObject context, CarrierSet semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         localGenerated?='localGenerated'? 
	 *         name=EString 
	 *         internalId=EString? 
	 *         comment=EString? 
	 *         (annotations+=Annotation annotations+=Annotation*)? 
	 *         (extensions+=AbstractExtension extensions+=AbstractExtension*)? 
	 *         (attributes+=StringToAttributeMapEntry attributes+=StringToAttributeMapEntry*)?
	 *     )
	 */
	protected void sequence_Constant(EObject context, Constant semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         localGenerated?='localGenerated'? 
	 *         name=EString 
	 *         internalId=EString? 
	 *         comment=EString? 
	 *         (extends+=[Context|EString] extends+=[Context|EString]*)? 
	 *         (annotations+=Annotation annotations+=Annotation*)? 
	 *         (extensions+=AbstractExtension extensions+=AbstractExtension*)? 
	 *         (attributes+=StringToAttributeMapEntry attributes+=StringToAttributeMapEntry*)? 
	 *         (sets+=CarrierSet sets+=CarrierSet*)? 
	 *         (constants+=Constant constants+=Constant*)? 
	 *         (axioms+=Axiom axioms+=Axiom*)?
	 *     )
	 */
	protected void sequence_Context(EObject context, Context semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     {EObject}
	 */
	protected void sequence_EObject(EObject context, EObject semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         localGenerated?='localGenerated'? 
	 *         internalId=EString? 
	 *         extensionId=EString 
	 *         (annotations+=Annotation annotations+=Annotation*)? 
	 *         (extensions+=AbstractExtension extensions+=AbstractExtension*)? 
	 *         (attributes+=StringToAttributeMapEntry attributes+=StringToAttributeMapEntry*)?
	 *     )
	 */
	protected void sequence_Extension(EObject context, Extension semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (key=EString value=Attribute?)
	 */
	protected void sequence_StringToAttributeMapEntry(EObject context, Entry<?, ?> semanticObject) {
		genericSequencer.createSequence(context, (EObject)semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (key=EString? value=EString?)
	 */
	protected void sequence_StringToStringMapEntry(EObject context, Entry<?, ?> semanticObject) {
		genericSequencer.createSequence(context, (EObject)semanticObject);
	}
}
