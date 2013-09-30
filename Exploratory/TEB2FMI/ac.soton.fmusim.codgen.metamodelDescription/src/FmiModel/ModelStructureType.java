/**
 */
package FmiModel;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Model Structure Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link FmiModel.ModelStructureType#getInputs <em>Inputs</em>}</li>
 *   <li>{@link FmiModel.ModelStructureType#getDerivatives <em>Derivatives</em>}</li>
 *   <li>{@link FmiModel.ModelStructureType#getOutputs <em>Outputs</em>}</li>
 * </ul>
 * </p>
 *
 * @see FmiModel.FmiModelPackage#getModelStructureType()
 * @model extendedMetaData="name='ModelStructure_._type' kind='elementOnly'"
 * @generated
 */
public interface ModelStructureType extends EObject {
	/**
	 * Returns the value of the '<em><b>Inputs</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Ordered list of all inputs, i.e. variables with causality="input" (first definition has index = 1)
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Inputs</em>' containment reference.
	 * @see #setInputs(InputsType)
	 * @see FmiModel.FmiModelPackage#getModelStructureType_Inputs()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Inputs' namespace='##targetNamespace'"
	 * @generated
	 */
	InputsType getInputs();

	/**
	 * Sets the value of the '{@link FmiModel.ModelStructureType#getInputs <em>Inputs</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Inputs</em>' containment reference.
	 * @see #getInputs()
	 * @generated
	 */
	void setInputs(InputsType value);

	/**
	 * Returns the value of the '<em><b>Derivatives</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Ordered list of all derivatives and associated states (first definition has index = 1)
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Derivatives</em>' containment reference.
	 * @see #setDerivatives(DerivativesType)
	 * @see FmiModel.FmiModelPackage#getModelStructureType_Derivatives()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Derivatives' namespace='##targetNamespace'"
	 * @generated
	 */
	DerivativesType getDerivatives();

	/**
	 * Sets the value of the '{@link FmiModel.ModelStructureType#getDerivatives <em>Derivatives</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Derivatives</em>' containment reference.
	 * @see #getDerivatives()
	 * @generated
	 */
	void setDerivatives(DerivativesType value);

	/**
	 * Returns the value of the '<em><b>Outputs</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Ordered list of all outputs, i.e. variables with causality="output" (first definition has index = 1)
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Outputs</em>' containment reference.
	 * @see #setOutputs(OutputsType)
	 * @see FmiModel.FmiModelPackage#getModelStructureType_Outputs()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Outputs' namespace='##targetNamespace'"
	 * @generated
	 */
	OutputsType getOutputs();

	/**
	 * Sets the value of the '{@link FmiModel.ModelStructureType#getOutputs <em>Outputs</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Outputs</em>' containment reference.
	 * @see #getOutputs()
	 * @generated
	 */
	void setOutputs(OutputsType value);

} // ModelStructureType
