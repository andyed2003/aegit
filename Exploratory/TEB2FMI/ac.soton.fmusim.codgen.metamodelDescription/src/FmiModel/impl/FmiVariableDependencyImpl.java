/**
 */
package FmiModel.impl;

import FmiModel.FmiDependencyFactorKind;
import FmiModel.FmiModelPackage;
import FmiModel.FmiVariableDependency;

import java.util.List;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Fmi Variable Dependency</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link FmiModel.impl.FmiVariableDependencyImpl#getInputDependencies <em>Input Dependencies</em>}</li>
 *   <li>{@link FmiModel.impl.FmiVariableDependencyImpl#getInputFactorKinds <em>Input Factor Kinds</em>}</li>
 *   <li>{@link FmiModel.impl.FmiVariableDependencyImpl#getStateDependencies <em>State Dependencies</em>}</li>
 *   <li>{@link FmiModel.impl.FmiVariableDependencyImpl#getStateFactorKinds <em>State Factor Kinds</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class FmiVariableDependencyImpl extends EObjectImpl implements FmiVariableDependency {
	/**
	 * The default value of the '{@link #getInputDependencies() <em>Input Dependencies</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInputDependencies()
	 * @generated
	 * @ordered
	 */
	protected static final List<Integer> INPUT_DEPENDENCIES_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getInputDependencies() <em>Input Dependencies</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInputDependencies()
	 * @generated
	 * @ordered
	 */
	protected List<Integer> inputDependencies = INPUT_DEPENDENCIES_EDEFAULT;

	/**
	 * The default value of the '{@link #getInputFactorKinds() <em>Input Factor Kinds</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInputFactorKinds()
	 * @generated
	 * @ordered
	 */
	protected static final List<FmiDependencyFactorKind> INPUT_FACTOR_KINDS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getInputFactorKinds() <em>Input Factor Kinds</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInputFactorKinds()
	 * @generated
	 * @ordered
	 */
	protected List<FmiDependencyFactorKind> inputFactorKinds = INPUT_FACTOR_KINDS_EDEFAULT;

	/**
	 * The default value of the '{@link #getStateDependencies() <em>State Dependencies</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStateDependencies()
	 * @generated
	 * @ordered
	 */
	protected static final List<Integer> STATE_DEPENDENCIES_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getStateDependencies() <em>State Dependencies</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStateDependencies()
	 * @generated
	 * @ordered
	 */
	protected List<Integer> stateDependencies = STATE_DEPENDENCIES_EDEFAULT;

	/**
	 * The default value of the '{@link #getStateFactorKinds() <em>State Factor Kinds</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStateFactorKinds()
	 * @generated
	 * @ordered
	 */
	protected static final List<FmiDependencyFactorKind> STATE_FACTOR_KINDS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getStateFactorKinds() <em>State Factor Kinds</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStateFactorKinds()
	 * @generated
	 * @ordered
	 */
	protected List<FmiDependencyFactorKind> stateFactorKinds = STATE_FACTOR_KINDS_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FmiVariableDependencyImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FmiModelPackage.Literals.FMI_VARIABLE_DEPENDENCY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public List<Integer> getInputDependencies() {
		return inputDependencies;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInputDependencies(List<Integer> newInputDependencies) {
		List<Integer> oldInputDependencies = inputDependencies;
		inputDependencies = newInputDependencies;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FmiModelPackage.FMI_VARIABLE_DEPENDENCY__INPUT_DEPENDENCIES, oldInputDependencies, inputDependencies));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public List<FmiDependencyFactorKind> getInputFactorKinds() {
		return inputFactorKinds;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInputFactorKinds(List<FmiDependencyFactorKind> newInputFactorKinds) {
		List<FmiDependencyFactorKind> oldInputFactorKinds = inputFactorKinds;
		inputFactorKinds = newInputFactorKinds;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FmiModelPackage.FMI_VARIABLE_DEPENDENCY__INPUT_FACTOR_KINDS, oldInputFactorKinds, inputFactorKinds));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public List<Integer> getStateDependencies() {
		return stateDependencies;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStateDependencies(List<Integer> newStateDependencies) {
		List<Integer> oldStateDependencies = stateDependencies;
		stateDependencies = newStateDependencies;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FmiModelPackage.FMI_VARIABLE_DEPENDENCY__STATE_DEPENDENCIES, oldStateDependencies, stateDependencies));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public List<FmiDependencyFactorKind> getStateFactorKinds() {
		return stateFactorKinds;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStateFactorKinds(List<FmiDependencyFactorKind> newStateFactorKinds) {
		List<FmiDependencyFactorKind> oldStateFactorKinds = stateFactorKinds;
		stateFactorKinds = newStateFactorKinds;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FmiModelPackage.FMI_VARIABLE_DEPENDENCY__STATE_FACTOR_KINDS, oldStateFactorKinds, stateFactorKinds));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case FmiModelPackage.FMI_VARIABLE_DEPENDENCY__INPUT_DEPENDENCIES:
				return getInputDependencies();
			case FmiModelPackage.FMI_VARIABLE_DEPENDENCY__INPUT_FACTOR_KINDS:
				return getInputFactorKinds();
			case FmiModelPackage.FMI_VARIABLE_DEPENDENCY__STATE_DEPENDENCIES:
				return getStateDependencies();
			case FmiModelPackage.FMI_VARIABLE_DEPENDENCY__STATE_FACTOR_KINDS:
				return getStateFactorKinds();
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
			case FmiModelPackage.FMI_VARIABLE_DEPENDENCY__INPUT_DEPENDENCIES:
				setInputDependencies((List<Integer>)newValue);
				return;
			case FmiModelPackage.FMI_VARIABLE_DEPENDENCY__INPUT_FACTOR_KINDS:
				setInputFactorKinds((List<FmiDependencyFactorKind>)newValue);
				return;
			case FmiModelPackage.FMI_VARIABLE_DEPENDENCY__STATE_DEPENDENCIES:
				setStateDependencies((List<Integer>)newValue);
				return;
			case FmiModelPackage.FMI_VARIABLE_DEPENDENCY__STATE_FACTOR_KINDS:
				setStateFactorKinds((List<FmiDependencyFactorKind>)newValue);
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
			case FmiModelPackage.FMI_VARIABLE_DEPENDENCY__INPUT_DEPENDENCIES:
				setInputDependencies(INPUT_DEPENDENCIES_EDEFAULT);
				return;
			case FmiModelPackage.FMI_VARIABLE_DEPENDENCY__INPUT_FACTOR_KINDS:
				setInputFactorKinds(INPUT_FACTOR_KINDS_EDEFAULT);
				return;
			case FmiModelPackage.FMI_VARIABLE_DEPENDENCY__STATE_DEPENDENCIES:
				setStateDependencies(STATE_DEPENDENCIES_EDEFAULT);
				return;
			case FmiModelPackage.FMI_VARIABLE_DEPENDENCY__STATE_FACTOR_KINDS:
				setStateFactorKinds(STATE_FACTOR_KINDS_EDEFAULT);
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
			case FmiModelPackage.FMI_VARIABLE_DEPENDENCY__INPUT_DEPENDENCIES:
				return INPUT_DEPENDENCIES_EDEFAULT == null ? inputDependencies != null : !INPUT_DEPENDENCIES_EDEFAULT.equals(inputDependencies);
			case FmiModelPackage.FMI_VARIABLE_DEPENDENCY__INPUT_FACTOR_KINDS:
				return INPUT_FACTOR_KINDS_EDEFAULT == null ? inputFactorKinds != null : !INPUT_FACTOR_KINDS_EDEFAULT.equals(inputFactorKinds);
			case FmiModelPackage.FMI_VARIABLE_DEPENDENCY__STATE_DEPENDENCIES:
				return STATE_DEPENDENCIES_EDEFAULT == null ? stateDependencies != null : !STATE_DEPENDENCIES_EDEFAULT.equals(stateDependencies);
			case FmiModelPackage.FMI_VARIABLE_DEPENDENCY__STATE_FACTOR_KINDS:
				return STATE_FACTOR_KINDS_EDEFAULT == null ? stateFactorKinds != null : !STATE_FACTOR_KINDS_EDEFAULT.equals(stateFactorKinds);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (inputDependencies: ");
		result.append(inputDependencies);
		result.append(", inputFactorKinds: ");
		result.append(inputFactorKinds);
		result.append(", stateDependencies: ");
		result.append(stateDependencies);
		result.append(", stateFactorKinds: ");
		result.append(stateFactorKinds);
		result.append(')');
		return result.toString();
	}

} //FmiVariableDependencyImpl
