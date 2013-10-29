/**
 */
package FmiModel;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.FeatureMap;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Fmi Annotation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link FmiModel.FmiAnnotation#getGroup <em>Group</em>}</li>
 *   <li>{@link FmiModel.FmiAnnotation#getTool <em>Tool</em>}</li>
 * </ul>
 * </p>
 *
 * @see FmiModel.FmiModelPackage#getFmiAnnotation()
 * @model extendedMetaData="name='fmiAnnotation' kind='elementOnly'"
 * @generated
 */
public interface FmiAnnotation extends EObject {
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
	 * @see FmiModel.FmiModelPackage#getFmiAnnotation_Group()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='group' name='group:0'"
	 * @generated
	 */
	FeatureMap getGroup();

	/**
	 * Returns the value of the '<em><b>Tool</b></em>' containment reference list.
	 * The list contents are of type {@link FmiModel.ToolType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Tool specific annotation (ignored by other tools).
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Tool</em>' containment reference list.
	 * @see FmiModel.FmiModelPackage#getFmiAnnotation_Tool()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='Tool' namespace='##targetNamespace' group='group:0'"
	 * @generated
	 */
	EList<ToolType> getTool();

} // FmiAnnotation
