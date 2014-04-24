/**
 */
package FmiModelV1;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Implementation Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link FmiModelV1.ImplementationType#getCapabilities <em>Capabilities</em>}</li>
 * </ul>
 * </p>
 *
 * @see FmiModelV1.FmiModelV1Package#getImplementationType()
 * @model abstract="true"
 * @generated
 */
public interface ImplementationType extends EObject {
	/**
	 * Returns the value of the '<em><b>Capabilities</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Capabilities</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Capabilities</em>' containment reference.
	 * @see #setCapabilities(Capabilities)
	 * @see FmiModelV1.FmiModelV1Package#getImplementationType_Capabilities()
	 * @model containment="true"
	 * @generated
	 */
	Capabilities getCapabilities();

	/**
	 * Sets the value of the '{@link FmiModelV1.ImplementationType#getCapabilities <em>Capabilities</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Capabilities</em>' containment reference.
	 * @see #getCapabilities()
	 * @generated
	 */
	void setCapabilities(Capabilities value);

} // ImplementationType
