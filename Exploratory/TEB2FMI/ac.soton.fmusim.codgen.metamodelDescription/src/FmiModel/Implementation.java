/**
 */
package FmiModel;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Implementation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link FmiModel.Implementation#getFmiCoSimulationCapabilities <em>Fmi Co Simulation Capabilities</em>}</li>
 * </ul>
 * </p>
 *
 * @see FmiModel.FmiModelPackage#getImplementation()
 * @model abstract="true"
 * @generated
 */
public interface Implementation extends EObject {
	/**
	 * Returns the value of the '<em><b>Fmi Co Simulation Capabilities</b></em>' reference list.
	 * The list contents are of type {@link FmiModel.CoSimulationType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Fmi Co Simulation Capabilities</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fmi Co Simulation Capabilities</em>' reference list.
	 * @see FmiModel.FmiModelPackage#getImplementation_FmiCoSimulationCapabilities()
	 * @model
	 * @generated
	 */
	EList<CoSimulationType> getFmiCoSimulationCapabilities();

} // Implementation
