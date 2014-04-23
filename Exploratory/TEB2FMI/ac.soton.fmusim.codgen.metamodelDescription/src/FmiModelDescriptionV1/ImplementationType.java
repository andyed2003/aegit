/**
 */
package FmiModelDescriptionV1;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Implementation Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link FmiModelDescriptionV1.ImplementationType#getFmiImplementation <em>Fmi Implementation</em>}</li>
 * </ul>
 * </p>
 *
 * @see FmiModelDescriptionV1.FmiModelDescriptionV1Package#getImplementationType()
 * @model extendedMetaData="name='Implementation_._type' kind='elementOnly'"
 * @generated
 */
public interface ImplementationType extends EObject {
	/**
	 * Returns the value of the '<em><b>Fmi Implementation</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Fmi Implementation</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fmi Implementation</em>' reference.
	 * @see #setFmiImplementation(Implementation)
	 * @see FmiModelDescriptionV1.FmiModelDescriptionV1Package#getImplementationType_FmiImplementation()
	 * @model
	 * @generated
	 */
	Implementation getFmiImplementation();

	/**
	 * Sets the value of the '{@link FmiModelDescriptionV1.ImplementationType#getFmiImplementation <em>Fmi Implementation</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Fmi Implementation</em>' reference.
	 * @see #getFmiImplementation()
	 * @generated
	 */
	void setFmiImplementation(Implementation value);

} // ImplementationType
