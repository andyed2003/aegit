/**
 */
package FmiModel.impl;

import FmiModel.EnumerationType1;
import FmiModel.FmiModelPackage;
import FmiModel.FmiSimpleType;
import FmiModel.IntegerType1;
import FmiModel.RealType;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Fmi Simple Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link FmiModel.impl.FmiSimpleTypeImpl#getReal <em>Real</em>}</li>
 *   <li>{@link FmiModel.impl.FmiSimpleTypeImpl#getInteger <em>Integer</em>}</li>
 *   <li>{@link FmiModel.impl.FmiSimpleTypeImpl#getBoolean <em>Boolean</em>}</li>
 *   <li>{@link FmiModel.impl.FmiSimpleTypeImpl#getString <em>String</em>}</li>
 *   <li>{@link FmiModel.impl.FmiSimpleTypeImpl#getEnumeration <em>Enumeration</em>}</li>
 *   <li>{@link FmiModel.impl.FmiSimpleTypeImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link FmiModel.impl.FmiSimpleTypeImpl#getName <em>Name</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class FmiSimpleTypeImpl extends EObjectImpl implements FmiSimpleType {
	/**
	 * The cached value of the '{@link #getReal() <em>Real</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReal()
	 * @generated
	 * @ordered
	 */
	protected RealType real;

	/**
	 * The cached value of the '{@link #getInteger() <em>Integer</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInteger()
	 * @generated
	 * @ordered
	 */
	protected IntegerType1 integer;

	/**
	 * The cached value of the '{@link #getBoolean() <em>Boolean</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBoolean()
	 * @generated
	 * @ordered
	 */
	protected EObject boolean_;

	/**
	 * The cached value of the '{@link #getString() <em>String</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getString()
	 * @generated
	 * @ordered
	 */
	protected EObject string;

	/**
	 * The cached value of the '{@link #getEnumeration() <em>Enumeration</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEnumeration()
	 * @generated
	 * @ordered
	 */
	protected EnumerationType1 enumeration;

	/**
	 * The default value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected static final String DESCRIPTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected String description = DESCRIPTION_EDEFAULT;

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
	protected FmiSimpleTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FmiModelPackage.Literals.FMI_SIMPLE_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RealType getReal() {
		return real;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetReal(RealType newReal, NotificationChain msgs) {
		RealType oldReal = real;
		real = newReal;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FmiModelPackage.FMI_SIMPLE_TYPE__REAL, oldReal, newReal);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReal(RealType newReal) {
		if (newReal != real) {
			NotificationChain msgs = null;
			if (real != null)
				msgs = ((InternalEObject)real).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FmiModelPackage.FMI_SIMPLE_TYPE__REAL, null, msgs);
			if (newReal != null)
				msgs = ((InternalEObject)newReal).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FmiModelPackage.FMI_SIMPLE_TYPE__REAL, null, msgs);
			msgs = basicSetReal(newReal, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FmiModelPackage.FMI_SIMPLE_TYPE__REAL, newReal, newReal));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IntegerType1 getInteger() {
		return integer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetInteger(IntegerType1 newInteger, NotificationChain msgs) {
		IntegerType1 oldInteger = integer;
		integer = newInteger;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FmiModelPackage.FMI_SIMPLE_TYPE__INTEGER, oldInteger, newInteger);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInteger(IntegerType1 newInteger) {
		if (newInteger != integer) {
			NotificationChain msgs = null;
			if (integer != null)
				msgs = ((InternalEObject)integer).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FmiModelPackage.FMI_SIMPLE_TYPE__INTEGER, null, msgs);
			if (newInteger != null)
				msgs = ((InternalEObject)newInteger).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FmiModelPackage.FMI_SIMPLE_TYPE__INTEGER, null, msgs);
			msgs = basicSetInteger(newInteger, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FmiModelPackage.FMI_SIMPLE_TYPE__INTEGER, newInteger, newInteger));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObject getBoolean() {
		return boolean_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBoolean(EObject newBoolean, NotificationChain msgs) {
		EObject oldBoolean = boolean_;
		boolean_ = newBoolean;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FmiModelPackage.FMI_SIMPLE_TYPE__BOOLEAN, oldBoolean, newBoolean);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBoolean(EObject newBoolean) {
		if (newBoolean != boolean_) {
			NotificationChain msgs = null;
			if (boolean_ != null)
				msgs = ((InternalEObject)boolean_).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FmiModelPackage.FMI_SIMPLE_TYPE__BOOLEAN, null, msgs);
			if (newBoolean != null)
				msgs = ((InternalEObject)newBoolean).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FmiModelPackage.FMI_SIMPLE_TYPE__BOOLEAN, null, msgs);
			msgs = basicSetBoolean(newBoolean, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FmiModelPackage.FMI_SIMPLE_TYPE__BOOLEAN, newBoolean, newBoolean));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObject getString() {
		return string;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetString(EObject newString, NotificationChain msgs) {
		EObject oldString = string;
		string = newString;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FmiModelPackage.FMI_SIMPLE_TYPE__STRING, oldString, newString);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setString(EObject newString) {
		if (newString != string) {
			NotificationChain msgs = null;
			if (string != null)
				msgs = ((InternalEObject)string).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FmiModelPackage.FMI_SIMPLE_TYPE__STRING, null, msgs);
			if (newString != null)
				msgs = ((InternalEObject)newString).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FmiModelPackage.FMI_SIMPLE_TYPE__STRING, null, msgs);
			msgs = basicSetString(newString, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FmiModelPackage.FMI_SIMPLE_TYPE__STRING, newString, newString));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EnumerationType1 getEnumeration() {
		return enumeration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEnumeration(EnumerationType1 newEnumeration, NotificationChain msgs) {
		EnumerationType1 oldEnumeration = enumeration;
		enumeration = newEnumeration;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FmiModelPackage.FMI_SIMPLE_TYPE__ENUMERATION, oldEnumeration, newEnumeration);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEnumeration(EnumerationType1 newEnumeration) {
		if (newEnumeration != enumeration) {
			NotificationChain msgs = null;
			if (enumeration != null)
				msgs = ((InternalEObject)enumeration).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FmiModelPackage.FMI_SIMPLE_TYPE__ENUMERATION, null, msgs);
			if (newEnumeration != null)
				msgs = ((InternalEObject)newEnumeration).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FmiModelPackage.FMI_SIMPLE_TYPE__ENUMERATION, null, msgs);
			msgs = basicSetEnumeration(newEnumeration, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FmiModelPackage.FMI_SIMPLE_TYPE__ENUMERATION, newEnumeration, newEnumeration));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDescription(String newDescription) {
		String oldDescription = description;
		description = newDescription;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FmiModelPackage.FMI_SIMPLE_TYPE__DESCRIPTION, oldDescription, description));
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
			eNotify(new ENotificationImpl(this, Notification.SET, FmiModelPackage.FMI_SIMPLE_TYPE__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FmiModelPackage.FMI_SIMPLE_TYPE__REAL:
				return basicSetReal(null, msgs);
			case FmiModelPackage.FMI_SIMPLE_TYPE__INTEGER:
				return basicSetInteger(null, msgs);
			case FmiModelPackage.FMI_SIMPLE_TYPE__BOOLEAN:
				return basicSetBoolean(null, msgs);
			case FmiModelPackage.FMI_SIMPLE_TYPE__STRING:
				return basicSetString(null, msgs);
			case FmiModelPackage.FMI_SIMPLE_TYPE__ENUMERATION:
				return basicSetEnumeration(null, msgs);
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
			case FmiModelPackage.FMI_SIMPLE_TYPE__REAL:
				return getReal();
			case FmiModelPackage.FMI_SIMPLE_TYPE__INTEGER:
				return getInteger();
			case FmiModelPackage.FMI_SIMPLE_TYPE__BOOLEAN:
				return getBoolean();
			case FmiModelPackage.FMI_SIMPLE_TYPE__STRING:
				return getString();
			case FmiModelPackage.FMI_SIMPLE_TYPE__ENUMERATION:
				return getEnumeration();
			case FmiModelPackage.FMI_SIMPLE_TYPE__DESCRIPTION:
				return getDescription();
			case FmiModelPackage.FMI_SIMPLE_TYPE__NAME:
				return getName();
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
			case FmiModelPackage.FMI_SIMPLE_TYPE__REAL:
				setReal((RealType)newValue);
				return;
			case FmiModelPackage.FMI_SIMPLE_TYPE__INTEGER:
				setInteger((IntegerType1)newValue);
				return;
			case FmiModelPackage.FMI_SIMPLE_TYPE__BOOLEAN:
				setBoolean((EObject)newValue);
				return;
			case FmiModelPackage.FMI_SIMPLE_TYPE__STRING:
				setString((EObject)newValue);
				return;
			case FmiModelPackage.FMI_SIMPLE_TYPE__ENUMERATION:
				setEnumeration((EnumerationType1)newValue);
				return;
			case FmiModelPackage.FMI_SIMPLE_TYPE__DESCRIPTION:
				setDescription((String)newValue);
				return;
			case FmiModelPackage.FMI_SIMPLE_TYPE__NAME:
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
			case FmiModelPackage.FMI_SIMPLE_TYPE__REAL:
				setReal((RealType)null);
				return;
			case FmiModelPackage.FMI_SIMPLE_TYPE__INTEGER:
				setInteger((IntegerType1)null);
				return;
			case FmiModelPackage.FMI_SIMPLE_TYPE__BOOLEAN:
				setBoolean((EObject)null);
				return;
			case FmiModelPackage.FMI_SIMPLE_TYPE__STRING:
				setString((EObject)null);
				return;
			case FmiModelPackage.FMI_SIMPLE_TYPE__ENUMERATION:
				setEnumeration((EnumerationType1)null);
				return;
			case FmiModelPackage.FMI_SIMPLE_TYPE__DESCRIPTION:
				setDescription(DESCRIPTION_EDEFAULT);
				return;
			case FmiModelPackage.FMI_SIMPLE_TYPE__NAME:
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
			case FmiModelPackage.FMI_SIMPLE_TYPE__REAL:
				return real != null;
			case FmiModelPackage.FMI_SIMPLE_TYPE__INTEGER:
				return integer != null;
			case FmiModelPackage.FMI_SIMPLE_TYPE__BOOLEAN:
				return boolean_ != null;
			case FmiModelPackage.FMI_SIMPLE_TYPE__STRING:
				return string != null;
			case FmiModelPackage.FMI_SIMPLE_TYPE__ENUMERATION:
				return enumeration != null;
			case FmiModelPackage.FMI_SIMPLE_TYPE__DESCRIPTION:
				return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
			case FmiModelPackage.FMI_SIMPLE_TYPE__NAME:
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
		result.append(" (description: ");
		result.append(description);
		result.append(", name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //FmiSimpleTypeImpl
