/**
 */
package FmiModel;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.ecore.util.FeatureMap;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Fmi Unit</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Unit definition (with respect to SI base units) and default display units
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link FmiModel.FmiUnit#getBaseUnit <em>Base Unit</em>}</li>
 *   <li>{@link FmiModel.FmiUnit#getGroup <em>Group</em>}</li>
 *   <li>{@link FmiModel.FmiUnit#getDisplayUnit <em>Display Unit</em>}</li>
 *   <li>{@link FmiModel.FmiUnit#getName <em>Name</em>}</li>
 * </ul>
 * </p>
 *
 * @see FmiModel.FmiModelPackage#getFmiUnit()
 * @model extendedMetaData="name='fmiUnit' kind='elementOnly'"
 * @generated
 */
public interface FmiUnit extends EObject {
	/**
	 * Returns the value of the '<em><b>Base Unit</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * BaseUnit_value = factor*Unit_value + offset
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Base Unit</em>' containment reference.
	 * @see #setBaseUnit(BaseUnitType)
	 * @see FmiModel.FmiModelPackage#getFmiUnit_BaseUnit()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='BaseUnit' namespace='##targetNamespace'"
	 * @generated
	 */
	BaseUnitType getBaseUnit();

	/**
	 * Sets the value of the '{@link FmiModel.FmiUnit#getBaseUnit <em>Base Unit</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Base Unit</em>' containment reference.
	 * @see #getBaseUnit()
	 * @generated
	 */
	void setBaseUnit(BaseUnitType value);

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
	 * @see FmiModel.FmiModelPackage#getFmiUnit_Group()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='group' name='group:1'"
	 * @generated
	 */
	FeatureMap getGroup();

	/**
	 * Returns the value of the '<em><b>Display Unit</b></em>' containment reference list.
	 * The list contents are of type {@link FmiModel.DisplayUnitType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * DisplayUnit_value = factor*Unit_value + offset
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Display Unit</em>' containment reference list.
	 * @see FmiModel.FmiModelPackage#getFmiUnit_DisplayUnit()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='DisplayUnit' namespace='##targetNamespace' group='group:1'"
	 * @generated
	 */
	EList<DisplayUnitType> getDisplayUnit();

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Name of unit that is unique to this FMU, e.g. "N.m", "Nm",  "%/s". The variable values of fmiSetXXX and fmiGetXXX are with respect to this unit.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see FmiModel.FmiModelPackage#getFmiUnit_Name()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.NormalizedString" required="true"
	 *        extendedMetaData="kind='attribute' name='name' namespace='##targetNamespace'"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link FmiModel.FmiUnit#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

} // FmiUnit
