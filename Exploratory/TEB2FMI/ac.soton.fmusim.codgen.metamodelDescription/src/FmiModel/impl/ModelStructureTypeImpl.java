/**
 */
package FmiModel.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import FmiModel.DerivativesType;
import FmiModel.FmiModelPackage;
import FmiModel.InputsType;
import FmiModel.ModelStructureType;
import FmiModel.OutputsType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Model Structure Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link FmiModel.impl.ModelStructureTypeImpl#getInputs <em>Inputs</em>}</li>
 *   <li>{@link FmiModel.impl.ModelStructureTypeImpl#getDerivatives <em>Derivatives</em>}</li>
 *   <li>{@link FmiModel.impl.ModelStructureTypeImpl#getOutputs <em>Outputs</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ModelStructureTypeImpl extends EObjectImpl implements ModelStructureType {
	/**
	 * The cached value of the '{@link #getInputs() <em>Inputs</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInputs()
	 * @generated
	 * @ordered
	 */
	protected InputsType inputs;

	/**
	 * The cached value of the '{@link #getDerivatives() <em>Derivatives</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDerivatives()
	 * @generated
	 * @ordered
	 */
	protected DerivativesType derivatives;

	/**
	 * The cached value of the '{@link #getOutputs() <em>Outputs</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutputs()
	 * @generated
	 * @ordered
	 */
	protected OutputsType outputs;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ModelStructureTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FmiModelPackage.Literals.MODEL_STRUCTURE_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InputsType getInputs() {
		return inputs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetInputs(InputsType newInputs, NotificationChain msgs) {
		InputsType oldInputs = inputs;
		inputs = newInputs;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FmiModelPackage.MODEL_STRUCTURE_TYPE__INPUTS, oldInputs, newInputs);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInputs(InputsType newInputs) {
		if (newInputs != inputs) {
			NotificationChain msgs = null;
			if (inputs != null)
				msgs = ((InternalEObject)inputs).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FmiModelPackage.MODEL_STRUCTURE_TYPE__INPUTS, null, msgs);
			if (newInputs != null)
				msgs = ((InternalEObject)newInputs).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FmiModelPackage.MODEL_STRUCTURE_TYPE__INPUTS, null, msgs);
			msgs = basicSetInputs(newInputs, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FmiModelPackage.MODEL_STRUCTURE_TYPE__INPUTS, newInputs, newInputs));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DerivativesType getDerivatives() {
		return derivatives;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDerivatives(DerivativesType newDerivatives, NotificationChain msgs) {
		DerivativesType oldDerivatives = derivatives;
		derivatives = newDerivatives;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FmiModelPackage.MODEL_STRUCTURE_TYPE__DERIVATIVES, oldDerivatives, newDerivatives);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDerivatives(DerivativesType newDerivatives) {
		if (newDerivatives != derivatives) {
			NotificationChain msgs = null;
			if (derivatives != null)
				msgs = ((InternalEObject)derivatives).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FmiModelPackage.MODEL_STRUCTURE_TYPE__DERIVATIVES, null, msgs);
			if (newDerivatives != null)
				msgs = ((InternalEObject)newDerivatives).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FmiModelPackage.MODEL_STRUCTURE_TYPE__DERIVATIVES, null, msgs);
			msgs = basicSetDerivatives(newDerivatives, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FmiModelPackage.MODEL_STRUCTURE_TYPE__DERIVATIVES, newDerivatives, newDerivatives));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OutputsType getOutputs() {
		return outputs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOutputs(OutputsType newOutputs, NotificationChain msgs) {
		OutputsType oldOutputs = outputs;
		outputs = newOutputs;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FmiModelPackage.MODEL_STRUCTURE_TYPE__OUTPUTS, oldOutputs, newOutputs);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOutputs(OutputsType newOutputs) {
		if (newOutputs != outputs) {
			NotificationChain msgs = null;
			if (outputs != null)
				msgs = ((InternalEObject)outputs).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FmiModelPackage.MODEL_STRUCTURE_TYPE__OUTPUTS, null, msgs);
			if (newOutputs != null)
				msgs = ((InternalEObject)newOutputs).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FmiModelPackage.MODEL_STRUCTURE_TYPE__OUTPUTS, null, msgs);
			msgs = basicSetOutputs(newOutputs, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FmiModelPackage.MODEL_STRUCTURE_TYPE__OUTPUTS, newOutputs, newOutputs));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FmiModelPackage.MODEL_STRUCTURE_TYPE__INPUTS:
				return basicSetInputs(null, msgs);
			case FmiModelPackage.MODEL_STRUCTURE_TYPE__DERIVATIVES:
				return basicSetDerivatives(null, msgs);
			case FmiModelPackage.MODEL_STRUCTURE_TYPE__OUTPUTS:
				return basicSetOutputs(null, msgs);
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
			case FmiModelPackage.MODEL_STRUCTURE_TYPE__INPUTS:
				return getInputs();
			case FmiModelPackage.MODEL_STRUCTURE_TYPE__DERIVATIVES:
				return getDerivatives();
			case FmiModelPackage.MODEL_STRUCTURE_TYPE__OUTPUTS:
				return getOutputs();
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
			case FmiModelPackage.MODEL_STRUCTURE_TYPE__INPUTS:
				setInputs((InputsType)newValue);
				return;
			case FmiModelPackage.MODEL_STRUCTURE_TYPE__DERIVATIVES:
				setDerivatives((DerivativesType)newValue);
				return;
			case FmiModelPackage.MODEL_STRUCTURE_TYPE__OUTPUTS:
				setOutputs((OutputsType)newValue);
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
			case FmiModelPackage.MODEL_STRUCTURE_TYPE__INPUTS:
				setInputs((InputsType)null);
				return;
			case FmiModelPackage.MODEL_STRUCTURE_TYPE__DERIVATIVES:
				setDerivatives((DerivativesType)null);
				return;
			case FmiModelPackage.MODEL_STRUCTURE_TYPE__OUTPUTS:
				setOutputs((OutputsType)null);
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
			case FmiModelPackage.MODEL_STRUCTURE_TYPE__INPUTS:
				return inputs != null;
			case FmiModelPackage.MODEL_STRUCTURE_TYPE__DERIVATIVES:
				return derivatives != null;
			case FmiModelPackage.MODEL_STRUCTURE_TYPE__OUTPUTS:
				return outputs != null;
		}
		return super.eIsSet(featureID);
	}

} //ModelStructureTypeImpl
