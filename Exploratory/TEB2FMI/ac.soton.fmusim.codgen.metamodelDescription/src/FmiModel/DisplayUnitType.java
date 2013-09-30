/**
 */
package FmiModel;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Display Unit Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link FmiModel.DisplayUnitType#getFactor <em>Factor</em>}</li>
 *   <li>{@link FmiModel.DisplayUnitType#getName <em>Name</em>}</li>
 *   <li>{@link FmiModel.DisplayUnitType#getOffset <em>Offset</em>}</li>
 * </ul>
 * </p>
 *
 * @see FmiModel.FmiModelPackage#getDisplayUnitType()
 * @model extendedMetaData="name='DisplayUnit_._type' kind='empty'"
 * @generated
 */
public interface DisplayUnitType extends EObject {
	/**
	 * Returns the value of the '<em><b>Factor</b></em>' attribute.
	 * The default value is <code>"1"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Factor</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Factor</em>' attribute.
	 * @see #isSetFactor()
	 * @see #unsetFactor()
	 * @see #setFactor(double)
	 * @see FmiModel.FmiModelPackage#getDisplayUnitType_Factor()
	 * @model default="1" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Double"
	 *        extendedMetaData="kind='attribute' name='factor' namespace='##targetNamespace'"
	 * @generated
	 */
	double getFactor();

	/**
	 * Sets the value of the '{@link FmiModel.DisplayUnitType#getFactor <em>Factor</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Factor</em>' attribute.
	 * @see #isSetFactor()
	 * @see #unsetFactor()
	 * @see #getFactor()
	 * @generated
	 */
	void setFactor(double value);

	/**
	 * Unsets the value of the '{@link FmiModel.DisplayUnitType#getFactor <em>Factor</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetFactor()
	 * @see #getFactor()
	 * @see #setFactor(double)
	 * @generated
	 */
	void unsetFactor();

	/**
	 * Returns whether the value of the '{@link FmiModel.DisplayUnitType#getFactor <em>Factor</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Factor</em>' attribute is set.
	 * @see #unsetFactor()
	 * @see #getFactor()
	 * @see #setFactor(double)
	 * @generated
	 */
	boolean isSetFactor();

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Example: <Unit name="rad"/>, <DisplayUnit factor="57.29..." name="deg"/>
	 * 								
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see FmiModel.FmiModelPackage#getDisplayUnitType_Name()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.NormalizedString" required="true"
	 *        extendedMetaData="kind='attribute' name='name' namespace='##targetNamespace'"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link FmiModel.DisplayUnitType#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Offset</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Offset</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Offset</em>' attribute.
	 * @see #isSetOffset()
	 * @see #unsetOffset()
	 * @see #setOffset(double)
	 * @see FmiModel.FmiModelPackage#getDisplayUnitType_Offset()
	 * @model default="0" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Double"
	 *        extendedMetaData="kind='attribute' name='offset' namespace='##targetNamespace'"
	 * @generated
	 */
	double getOffset();

	/**
	 * Sets the value of the '{@link FmiModel.DisplayUnitType#getOffset <em>Offset</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Offset</em>' attribute.
	 * @see #isSetOffset()
	 * @see #unsetOffset()
	 * @see #getOffset()
	 * @generated
	 */
	void setOffset(double value);

	/**
	 * Unsets the value of the '{@link FmiModel.DisplayUnitType#getOffset <em>Offset</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetOffset()
	 * @see #getOffset()
	 * @see #setOffset(double)
	 * @generated
	 */
	void unsetOffset();

	/**
	 * Returns whether the value of the '{@link FmiModel.DisplayUnitType#getOffset <em>Offset</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Offset</em>' attribute is set.
	 * @see #unsetOffset()
	 * @see #getOffset()
	 * @see #setOffset(double)
	 * @generated
	 */
	boolean isSetOffset();

} // DisplayUnitType
