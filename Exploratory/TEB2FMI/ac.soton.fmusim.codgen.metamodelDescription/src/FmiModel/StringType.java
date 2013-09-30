/**
 */
package FmiModel;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>String Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link FmiModel.StringType#getDeclaredType <em>Declared Type</em>}</li>
 *   <li>{@link FmiModel.StringType#getStart <em>Start</em>}</li>
 * </ul>
 * </p>
 *
 * @see FmiModel.FmiModelPackage#getStringType()
 * @model extendedMetaData="name='String_._type' kind='empty'"
 * @generated
 */
public interface StringType extends EObject {
	/**
	 * Returns the value of the '<em><b>Declared Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * If present, name of type defined with TypeDefinitions / SimpleType providing defaults.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Declared Type</em>' attribute.
	 * @see #setDeclaredType(String)
	 * @see FmiModel.FmiModelPackage#getStringType_DeclaredType()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.NormalizedString"
	 *        extendedMetaData="kind='attribute' name='declaredType' namespace='##targetNamespace'"
	 * @generated
	 */
	String getDeclaredType();

	/**
	 * Sets the value of the '{@link FmiModel.StringType#getDeclaredType <em>Declared Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Declared Type</em>' attribute.
	 * @see #getDeclaredType()
	 * @generated
	 */
	void setDeclaredType(String value);

	/**
	 * Returns the value of the '<em><b>Start</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Value before initialization, if initial=exact or approx
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Start</em>' attribute.
	 * @see #setStart(String)
	 * @see FmiModel.FmiModelPackage#getStringType_Start()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='start' namespace='##targetNamespace'"
	 * @generated
	 */
	String getStart();

	/**
	 * Sets the value of the '{@link FmiModel.StringType#getStart <em>Start</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Start</em>' attribute.
	 * @see #getStart()
	 * @generated
	 */
	void setStart(String value);

} // StringType
