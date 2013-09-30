/**
 */
package FmiModel;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Derivative Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link FmiModel.DerivativeType#getName <em>Name</em>}</li>
 *   <li>{@link FmiModel.DerivativeType#getState <em>State</em>}</li>
 * </ul>
 * </p>
 *
 * @see FmiModel.FmiModelPackage#getDerivativeType()
 * @model extendedMetaData="name='Derivative_._type' kind='empty'"
 * @generated
 */
public interface DerivativeType extends FmiVariableDependency {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * ScalarVariable name of state derivative
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see FmiModel.FmiModelPackage#getDerivativeType_Name()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.NormalizedString" required="true"
	 *        extendedMetaData="kind='attribute' name='name' namespace='##targetNamespace'"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link FmiModel.DerivativeType#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * ScalarVariable name of state
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>State</em>' attribute.
	 * @see #setState(String)
	 * @see FmiModel.FmiModelPackage#getDerivativeType_State()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.NormalizedString" required="true"
	 *        extendedMetaData="kind='attribute' name='state' namespace='##targetNamespace'"
	 * @generated
	 */
	String getState();

	/**
	 * Sets the value of the '{@link FmiModel.DerivativeType#getState <em>State</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>State</em>' attribute.
	 * @see #getState()
	 * @generated
	 */
	void setState(String value);

} // DerivativeType
