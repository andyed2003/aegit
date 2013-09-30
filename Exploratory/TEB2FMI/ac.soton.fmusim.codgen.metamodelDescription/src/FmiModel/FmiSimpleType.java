/**
 */
package FmiModel;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Fmi Simple Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Type attributes of a scalar variable
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link FmiModel.FmiSimpleType#getReal <em>Real</em>}</li>
 *   <li>{@link FmiModel.FmiSimpleType#getInteger <em>Integer</em>}</li>
 *   <li>{@link FmiModel.FmiSimpleType#getBoolean <em>Boolean</em>}</li>
 *   <li>{@link FmiModel.FmiSimpleType#getString <em>String</em>}</li>
 *   <li>{@link FmiModel.FmiSimpleType#getEnumeration <em>Enumeration</em>}</li>
 *   <li>{@link FmiModel.FmiSimpleType#getDescription <em>Description</em>}</li>
 *   <li>{@link FmiModel.FmiSimpleType#getName <em>Name</em>}</li>
 * </ul>
 * </p>
 *
 * @see FmiModel.FmiModelPackage#getFmiSimpleType()
 * @model extendedMetaData="name='fmiSimpleType' kind='elementOnly'"
 * @generated
 */
public interface FmiSimpleType extends EObject {
	/**
	 * Returns the value of the '<em><b>Real</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Real</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Real</em>' containment reference.
	 * @see #setReal(RealType)
	 * @see FmiModel.FmiModelPackage#getFmiSimpleType_Real()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Real' namespace='##targetNamespace'"
	 * @generated
	 */
	RealType getReal();

	/**
	 * Sets the value of the '{@link FmiModel.FmiSimpleType#getReal <em>Real</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Real</em>' containment reference.
	 * @see #getReal()
	 * @generated
	 */
	void setReal(RealType value);

	/**
	 * Returns the value of the '<em><b>Integer</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Integer</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Integer</em>' containment reference.
	 * @see #setInteger(IntegerType1)
	 * @see FmiModel.FmiModelPackage#getFmiSimpleType_Integer()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Integer' namespace='##targetNamespace'"
	 * @generated
	 */
	IntegerType1 getInteger();

	/**
	 * Sets the value of the '{@link FmiModel.FmiSimpleType#getInteger <em>Integer</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Integer</em>' containment reference.
	 * @see #getInteger()
	 * @generated
	 */
	void setInteger(IntegerType1 value);

	/**
	 * Returns the value of the '<em><b>Boolean</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Boolean</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Boolean</em>' containment reference.
	 * @see #setBoolean(EObject)
	 * @see FmiModel.FmiModelPackage#getFmiSimpleType_Boolean()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Boolean' namespace='##targetNamespace'"
	 * @generated
	 */
	EObject getBoolean();

	/**
	 * Sets the value of the '{@link FmiModel.FmiSimpleType#getBoolean <em>Boolean</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Boolean</em>' containment reference.
	 * @see #getBoolean()
	 * @generated
	 */
	void setBoolean(EObject value);

	/**
	 * Returns the value of the '<em><b>String</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>String</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>String</em>' containment reference.
	 * @see #setString(EObject)
	 * @see FmiModel.FmiModelPackage#getFmiSimpleType_String()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='String' namespace='##targetNamespace'"
	 * @generated
	 */
	EObject getString();

	/**
	 * Sets the value of the '{@link FmiModel.FmiSimpleType#getString <em>String</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>String</em>' containment reference.
	 * @see #getString()
	 * @generated
	 */
	void setString(EObject value);

	/**
	 * Returns the value of the '<em><b>Enumeration</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Enumeration</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Enumeration</em>' containment reference.
	 * @see #setEnumeration(EnumerationType1)
	 * @see FmiModel.FmiModelPackage#getFmiSimpleType_Enumeration()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Enumeration' namespace='##targetNamespace'"
	 * @generated
	 */
	EnumerationType1 getEnumeration();

	/**
	 * Sets the value of the '{@link FmiModel.FmiSimpleType#getEnumeration <em>Enumeration</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Enumeration</em>' containment reference.
	 * @see #getEnumeration()
	 * @generated
	 */
	void setEnumeration(EnumerationType1 value);

	/**
	 * Returns the value of the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Description</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Description</em>' attribute.
	 * @see #setDescription(String)
	 * @see FmiModel.FmiModelPackage#getFmiSimpleType_Description()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='description' namespace='##targetNamespace'"
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link FmiModel.FmiSimpleType#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see FmiModel.FmiModelPackage#getFmiSimpleType_Name()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.NormalizedString" required="true"
	 *        extendedMetaData="kind='attribute' name='name' namespace='##targetNamespace'"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link FmiModel.FmiSimpleType#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

} // FmiSimpleType
