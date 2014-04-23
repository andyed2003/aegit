/**
 */
package FmiModelDescriptionV1.impl;

import FmiModelDescriptionV1.FmiModelDescriptionV1Package;
import FmiModelDescriptionV1.Implementation;
import FmiModelDescriptionV1.ImplementationType;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Implementation Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link FmiModelDescriptionV1.impl.ImplementationTypeImpl#getFmiImplementation <em>Fmi Implementation</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ImplementationTypeImpl extends EObjectImpl implements ImplementationType {
	/**
	 * The cached value of the '{@link #getFmiImplementation() <em>Fmi Implementation</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFmiImplementation()
	 * @generated
	 * @ordered
	 */
	protected Implementation fmiImplementation;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ImplementationTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FmiModelDescriptionV1Package.Literals.IMPLEMENTATION_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Implementation getFmiImplementation() {
		if (fmiImplementation != null && fmiImplementation.eIsProxy()) {
			InternalEObject oldFmiImplementation = (InternalEObject)fmiImplementation;
			fmiImplementation = (Implementation)eResolveProxy(oldFmiImplementation);
			if (fmiImplementation != oldFmiImplementation) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FmiModelDescriptionV1Package.IMPLEMENTATION_TYPE__FMI_IMPLEMENTATION, oldFmiImplementation, fmiImplementation));
			}
		}
		return fmiImplementation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Implementation basicGetFmiImplementation() {
		return fmiImplementation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFmiImplementation(Implementation newFmiImplementation) {
		Implementation oldFmiImplementation = fmiImplementation;
		fmiImplementation = newFmiImplementation;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FmiModelDescriptionV1Package.IMPLEMENTATION_TYPE__FMI_IMPLEMENTATION, oldFmiImplementation, fmiImplementation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case FmiModelDescriptionV1Package.IMPLEMENTATION_TYPE__FMI_IMPLEMENTATION:
				if (resolve) return getFmiImplementation();
				return basicGetFmiImplementation();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case FmiModelDescriptionV1Package.IMPLEMENTATION_TYPE__FMI_IMPLEMENTATION:
				setFmiImplementation((Implementation)newValue);
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
			case FmiModelDescriptionV1Package.IMPLEMENTATION_TYPE__FMI_IMPLEMENTATION:
				setFmiImplementation((Implementation)null);
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
			case FmiModelDescriptionV1Package.IMPLEMENTATION_TYPE__FMI_IMPLEMENTATION:
				return fmiImplementation != null;
		}
		return super.eIsSet(featureID);
	}

} //ImplementationTypeImpl
