/**
 */
package FmiModel.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.eclipse.emf.ecore.util.BasicFeatureMap;
import org.eclipse.emf.ecore.util.FeatureMap;
import org.eclipse.emf.ecore.util.InternalEList;

import FmiModel.BaseUnitType;
import FmiModel.DisplayUnitType;
import FmiModel.FmiModelPackage;
import FmiModel.FmiUnit;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Fmi Unit</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link FmiModel.impl.FmiUnitImpl#getBaseUnit <em>Base Unit</em>}</li>
 *   <li>{@link FmiModel.impl.FmiUnitImpl#getGroup <em>Group</em>}</li>
 *   <li>{@link FmiModel.impl.FmiUnitImpl#getDisplayUnit <em>Display Unit</em>}</li>
 *   <li>{@link FmiModel.impl.FmiUnitImpl#getName <em>Name</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class FmiUnitImpl extends EObjectImpl implements FmiUnit {
	/**
	 * The cached value of the '{@link #getBaseUnit() <em>Base Unit</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBaseUnit()
	 * @generated
	 * @ordered
	 */
	protected BaseUnitType baseUnit;

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
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FmiUnitImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FmiModelPackage.Literals.FMI_UNIT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BaseUnitType getBaseUnit() {
		return baseUnit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBaseUnit(BaseUnitType newBaseUnit, NotificationChain msgs) {
		BaseUnitType oldBaseUnit = baseUnit;
		baseUnit = newBaseUnit;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FmiModelPackage.FMI_UNIT__BASE_UNIT, oldBaseUnit, newBaseUnit);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBaseUnit(BaseUnitType newBaseUnit) {
		if (newBaseUnit != baseUnit) {
			NotificationChain msgs = null;
			if (baseUnit != null)
				msgs = ((InternalEObject)baseUnit).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FmiModelPackage.FMI_UNIT__BASE_UNIT, null, msgs);
			if (newBaseUnit != null)
				msgs = ((InternalEObject)newBaseUnit).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FmiModelPackage.FMI_UNIT__BASE_UNIT, null, msgs);
			msgs = basicSetBaseUnit(newBaseUnit, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FmiModelPackage.FMI_UNIT__BASE_UNIT, newBaseUnit, newBaseUnit));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getGroup() {
		if (group == null) {
			group = new BasicFeatureMap(this, FmiModelPackage.FMI_UNIT__GROUP);
		}
		return group;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DisplayUnitType> getDisplayUnit() {
		return getGroup().list(FmiModelPackage.Literals.FMI_UNIT__DISPLAY_UNIT);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FmiModelPackage.FMI_UNIT__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FmiModelPackage.FMI_UNIT__BASE_UNIT:
				return basicSetBaseUnit(null, msgs);
			case FmiModelPackage.FMI_UNIT__GROUP:
				return ((InternalEList<?>)getGroup()).basicRemove(otherEnd, msgs);
			case FmiModelPackage.FMI_UNIT__DISPLAY_UNIT:
				return ((InternalEList<?>)getDisplayUnit()).basicRemove(otherEnd, msgs);
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
			case FmiModelPackage.FMI_UNIT__BASE_UNIT:
				return getBaseUnit();
			case FmiModelPackage.FMI_UNIT__GROUP:
				if (coreType) return getGroup();
				return ((FeatureMap.Internal)getGroup()).getWrapper();
			case FmiModelPackage.FMI_UNIT__DISPLAY_UNIT:
				return getDisplayUnit();
			case FmiModelPackage.FMI_UNIT__NAME:
				return getName();
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
			case FmiModelPackage.FMI_UNIT__BASE_UNIT:
				setBaseUnit((BaseUnitType)newValue);
				return;
			case FmiModelPackage.FMI_UNIT__GROUP:
				((FeatureMap.Internal)getGroup()).set(newValue);
				return;
			case FmiModelPackage.FMI_UNIT__DISPLAY_UNIT:
				getDisplayUnit().clear();
				getDisplayUnit().addAll((Collection<? extends DisplayUnitType>)newValue);
				return;
			case FmiModelPackage.FMI_UNIT__NAME:
				setName((String)newValue);
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
			case FmiModelPackage.FMI_UNIT__BASE_UNIT:
				setBaseUnit((BaseUnitType)null);
				return;
			case FmiModelPackage.FMI_UNIT__GROUP:
				getGroup().clear();
				return;
			case FmiModelPackage.FMI_UNIT__DISPLAY_UNIT:
				getDisplayUnit().clear();
				return;
			case FmiModelPackage.FMI_UNIT__NAME:
				setName(NAME_EDEFAULT);
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
			case FmiModelPackage.FMI_UNIT__BASE_UNIT:
				return baseUnit != null;
			case FmiModelPackage.FMI_UNIT__GROUP:
				return group != null && !group.isEmpty();
			case FmiModelPackage.FMI_UNIT__DISPLAY_UNIT:
				return !getDisplayUnit().isEmpty();
			case FmiModelPackage.FMI_UNIT__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
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
		result.append(", name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //FmiUnitImpl
