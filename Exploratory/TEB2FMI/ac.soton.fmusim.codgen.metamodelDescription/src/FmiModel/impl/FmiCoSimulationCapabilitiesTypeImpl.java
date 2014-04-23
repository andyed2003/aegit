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

import FmiModel.CoSimulationType;
import FmiModel.FmiCoSimulationCapabilitiesType;
import FmiModel.FmiModelPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Fmi Co Simulation Capabilities Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link FmiModel.impl.FmiCoSimulationCapabilitiesTypeImpl#getCapabilities <em>Capabilities</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class FmiCoSimulationCapabilitiesTypeImpl extends EObjectImpl implements FmiCoSimulationCapabilitiesType {
	/**
	 * The cached value of the '{@link #getCapabilities() <em>Capabilities</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCapabilities()
	 * @generated
	 * @ordered
	 */
	protected EList<CoSimulationType> capabilities;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FmiCoSimulationCapabilitiesTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FmiModelPackage.Literals.FMI_CO_SIMULATION_CAPABILITIES_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CoSimulationType> getCapabilities() {
		if (capabilities == null) {
			capabilities = new EObjectContainmentEList<CoSimulationType>(CoSimulationType.class, this, FmiModelPackage.FMI_CO_SIMULATION_CAPABILITIES_TYPE__CAPABILITIES);
		}
		return capabilities;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FmiModelPackage.FMI_CO_SIMULATION_CAPABILITIES_TYPE__CAPABILITIES:
				return ((InternalEList<?>)getCapabilities()).basicRemove(otherEnd, msgs);
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
			case FmiModelPackage.FMI_CO_SIMULATION_CAPABILITIES_TYPE__CAPABILITIES:
				return getCapabilities();
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
			case FmiModelPackage.FMI_CO_SIMULATION_CAPABILITIES_TYPE__CAPABILITIES:
				getCapabilities().clear();
				getCapabilities().addAll((Collection<? extends CoSimulationType>)newValue);
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
			case FmiModelPackage.FMI_CO_SIMULATION_CAPABILITIES_TYPE__CAPABILITIES:
				getCapabilities().clear();
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
			case FmiModelPackage.FMI_CO_SIMULATION_CAPABILITIES_TYPE__CAPABILITIES:
				return capabilities != null && !capabilities.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //FmiCoSimulationCapabilitiesTypeImpl
