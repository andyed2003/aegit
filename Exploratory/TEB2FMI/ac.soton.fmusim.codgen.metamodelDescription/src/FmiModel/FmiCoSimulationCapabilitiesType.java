/**
 */
package FmiModel;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Fmi Co Simulation Capabilities Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link FmiModel.FmiCoSimulationCapabilitiesType#getCapabilities <em>Capabilities</em>}</li>
 * </ul>
 * </p>
 *
 * @see FmiModel.FmiModelPackage#getFmiCoSimulationCapabilitiesType()
 * @model abstract="true"
 * @generated
 */
public interface FmiCoSimulationCapabilitiesType extends EObject {
	/**
	 * Returns the value of the '<em><b>Capabilities</b></em>' containment reference list.
	 * The list contents are of type {@link FmiModel.CoSimulationType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Capabilities</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Capabilities</em>' containment reference list.
	 * @see FmiModel.FmiModelPackage#getFmiCoSimulationCapabilitiesType_Capabilities()
	 * @model containment="true"
	 * @generated
	 */
	EList<CoSimulationType> getCapabilities();

} // FmiCoSimulationCapabilitiesType
