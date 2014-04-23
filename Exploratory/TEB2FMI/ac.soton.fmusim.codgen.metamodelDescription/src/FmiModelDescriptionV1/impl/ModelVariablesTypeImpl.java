/**
 */
package FmiModelDescriptionV1.impl;

import FmiModelDescriptionV1.FmiModelDescriptionV1Package;
import FmiModelDescriptionV1.FmiScalarVariable;
import FmiModelDescriptionV1.ModelVariablesType;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.BasicFeatureMap;
import org.eclipse.emf.ecore.util.FeatureMap;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Model Variables Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link FmiModelDescriptionV1.impl.ModelVariablesTypeImpl#getGroup <em>Group</em>}</li>
 *   <li>{@link FmiModelDescriptionV1.impl.ModelVariablesTypeImpl#getScalarVariable <em>Scalar Variable</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ModelVariablesTypeImpl extends EObjectImpl implements ModelVariablesType {
	/**
	 * The cached value of the '{@link #getGroup() <em>Group</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGroup()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap group;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ModelVariablesTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FmiModelDescriptionV1Package.Literals.MODEL_VARIABLES_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getGroup() {
		if (group == null) {
			group = new BasicFeatureMap(this, FmiModelDescriptionV1Package.MODEL_VARIABLES_TYPE__GROUP);
		}
		return group;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<FmiScalarVariable> getScalarVariable() {
		return getGroup().list(FmiModelDescriptionV1Package.Literals.MODEL_VARIABLES_TYPE__SCALAR_VARIABLE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FmiModelDescriptionV1Package.MODEL_VARIABLES_TYPE__GROUP:
				return ((InternalEList<?>)getGroup()).basicRemove(otherEnd, msgs);
			case FmiModelDescriptionV1Package.MODEL_VARIABLES_TYPE__SCALAR_VARIABLE:
				return ((InternalEList<?>)getScalarVariable()).basicRemove(otherEnd, msgs);
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
			case FmiModelDescriptionV1Package.MODEL_VARIABLES_TYPE__GROUP:
				if (coreType) return getGroup();
				return ((FeatureMap.Internal)getGroup()).getWrapper();
			case FmiModelDescriptionV1Package.MODEL_VARIABLES_TYPE__SCALAR_VARIABLE:
				return getScalarVariable();
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
			case FmiModelDescriptionV1Package.MODEL_VARIABLES_TYPE__GROUP:
				((FeatureMap.Internal)getGroup()).set(newValue);
				return;
			case FmiModelDescriptionV1Package.MODEL_VARIABLES_TYPE__SCALAR_VARIABLE:
				getScalarVariable().clear();
				getScalarVariable().addAll((Collection<? extends FmiScalarVariable>)newValue);
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
			case FmiModelDescriptionV1Package.MODEL_VARIABLES_TYPE__GROUP:
				getGroup().clear();
				return;
			case FmiModelDescriptionV1Package.MODEL_VARIABLES_TYPE__SCALAR_VARIABLE:
				getScalarVariable().clear();
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
			case FmiModelDescriptionV1Package.MODEL_VARIABLES_TYPE__GROUP:
				return group != null && !group.isEmpty();
			case FmiModelDescriptionV1Package.MODEL_VARIABLES_TYPE__SCALAR_VARIABLE:
				return !getScalarVariable().isEmpty();
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
		result.append(" (group: ");
		result.append(group);
		result.append(')');
		return result.toString();
	}

} //ModelVariablesTypeImpl
