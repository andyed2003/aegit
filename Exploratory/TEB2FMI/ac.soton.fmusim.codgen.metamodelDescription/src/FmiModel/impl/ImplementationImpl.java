/**
 */
package FmiModel.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;

import FmiModel.CoSimulationType;
import FmiModel.FmiModelPackage;
import FmiModel.Implementation;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Implementation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link FmiModel.impl.ImplementationImpl#getFmiCoSimulationCapabilities <em>Fmi Co Simulation Capabilities</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class ImplementationImpl extends EObjectImpl implements Implementation {
	/**
	 * The cached value of the '{@link #getFmiCoSimulationCapabilities() <em>Fmi Co Simulation Capabilities</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFmiCoSimulationCapabilities()
	 * @generated
	 * @ordered
	 */
	protected EList<CoSimulationType> fmiCoSimulationCapabilities;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ImplementationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FmiModelPackage.Literals.IMPLEMENTATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CoSimulationType> getFmiCoSimulationCapabilities() {
		if (fmiCoSimulationCapabilities == null) {
			fmiCoSimulationCapabilities = new EObjectContainmentEList<CoSimulationType>(CoSimulationType.class, this, FmiModelPackage.IMPLEMENTATION__FMI_CO_SIMULATION_CAPABILITIES);
		}
		return fmiCoSimulationCapabilities;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FmiModelPackage.IMPLEMENTATION__FMI_CO_SIMULATION_CAPABILITIES:
				return ((InternalEList<?>)getFmiCoSimulationCapabilities()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case FmiModelPackage.IMPLEMENTATION__FMI_CO_SIMULATION_CAPABILITIES:
				return getFmiCoSimulationCapabilities();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case FmiModelPackage.IMPLEMENTATION__FMI_CO_SIMULATION_CAPABILITIES:
				getFmiCoSimulationCapabilities().clear();
				getFmiCoSimulationCapabilities().addAll((Collection<? extends CoSimulationType>)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case FmiModelPackage.IMPLEMENTATION__FMI_CO_SIMULATION_CAPABILITIES:
				getFmiCoSimulationCapabilities().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case FmiModelPackage.IMPLEMENTATION__FMI_CO_SIMULATION_CAPABILITIES:
				return fmiCoSimulationCapabilities != null && !fmiCoSimulationCapabilities.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ImplementationImpl
