/**
 */
package FmiModel;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.FeatureMap;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Inputs Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link FmiModel.InputsType#getGroup <em>Group</em>}</li>
 *   <li>{@link FmiModel.InputsType#getInput <em>Input</em>}</li>
 * </ul>
 * </p>
 *
 * @see FmiModel.FmiModelPackage#getInputsType()
 * @model extendedMetaData="name='Inputs_._type' kind='elementOnly'"
 * @generated
 */
public interface InputsType extends EObject {
	/**
	 * Returns the value of the '<em><b>Group</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Group</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Group</em>' attribute list.
	 * @see FmiModel.FmiModelPackage#getInputsType_Group()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='group' name='group:0'"
	 * @generated
	 */
	FeatureMap getGroup();

	/**
	 * Returns the value of the '<em><b>Input</b></em>' containment reference list.
	 * The list contents are of type {@link FmiModel.InputType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Input</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Input</em>' containment reference list.
	 * @see FmiModel.FmiModelPackage#getInputsType_Input()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='Input' namespace='##targetNamespace' group='group:0'"
	 * @generated
	 */
	EList<InputType> getInput();

} // InputsType
