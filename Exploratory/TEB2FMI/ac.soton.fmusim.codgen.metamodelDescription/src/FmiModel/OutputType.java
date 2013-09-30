/**
 */
package FmiModel;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Output Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link FmiModel.OutputType#getDerivative <em>Derivative</em>}</li>
 *   <li>{@link FmiModel.OutputType#getName <em>Name</em>}</li>
 * </ul>
 * </p>
 *
 * @see FmiModel.FmiModelPackage#getOutputType()
 * @model extendedMetaData="name='Output_._type' kind='empty'"
 * @generated
 */
public interface OutputType extends FmiVariableDependency {
	/**
	 * Returns the value of the '<em><b>Derivative</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * If present, this output is the derivative of the output variable with index "derivative".
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Derivative</em>' attribute.
	 * @see #isSetDerivative()
	 * @see #unsetDerivative()
	 * @see #setDerivative(int)
	 * @see FmiModel.FmiModelPackage#getOutputType_Derivative()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Int"
	 *        extendedMetaData="kind='attribute' name='derivative' namespace='##targetNamespace'"
	 * @generated
	 */
	int getDerivative();

	/**
	 * Sets the value of the '{@link FmiModel.OutputType#getDerivative <em>Derivative</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Derivative</em>' attribute.
	 * @see #isSetDerivative()
	 * @see #unsetDerivative()
	 * @see #getDerivative()
	 * @generated
	 */
	void setDerivative(int value);

	/**
	 * Unsets the value of the '{@link FmiModel.OutputType#getDerivative <em>Derivative</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetDerivative()
	 * @see #getDerivative()
	 * @see #setDerivative(int)
	 * @generated
	 */
	void unsetDerivative();

	/**
	 * Returns whether the value of the '{@link FmiModel.OutputType#getDerivative <em>Derivative</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Derivative</em>' attribute is set.
	 * @see #unsetDerivative()
	 * @see #getDerivative()
	 * @see #setDerivative(int)
	 * @generated
	 */
	boolean isSetDerivative();

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * ScalarVariable name of output
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see FmiModel.FmiModelPackage#getOutputType_Name()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.NormalizedString" required="true"
	 *        extendedMetaData="kind='attribute' name='name' namespace='##targetNamespace'"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link FmiModel.OutputType#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

} // OutputType
