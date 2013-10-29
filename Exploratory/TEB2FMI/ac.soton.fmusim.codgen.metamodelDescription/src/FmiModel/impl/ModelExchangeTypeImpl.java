/**
 */
package FmiModel.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import FmiModel.FmiModelPackage;
import FmiModel.ModelExchangeType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Model Exchange Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link FmiModel.impl.ModelExchangeTypeImpl#isCanBeInstantiatedOnlyOncePerProcess <em>Can Be Instantiated Only Once Per Process</em>}</li>
 *   <li>{@link FmiModel.impl.ModelExchangeTypeImpl#isCanGetAndSetFMUstate <em>Can Get And Set FM Ustate</em>}</li>
 *   <li>{@link FmiModel.impl.ModelExchangeTypeImpl#isCanNotUseMemoryManagementFunctions <em>Can Not Use Memory Management Functions</em>}</li>
 *   <li>{@link FmiModel.impl.ModelExchangeTypeImpl#isCanSerializeFMUstate <em>Can Serialize FM Ustate</em>}</li>
 *   <li>{@link FmiModel.impl.ModelExchangeTypeImpl#isCompletedIntegratorStepNotNeeded <em>Completed Integrator Step Not Needed</em>}</li>
 *   <li>{@link FmiModel.impl.ModelExchangeTypeImpl#getModelIdentifier <em>Model Identifier</em>}</li>
 *   <li>{@link FmiModel.impl.ModelExchangeTypeImpl#isNeedsExecutionTool <em>Needs Execution Tool</em>}</li>
 *   <li>{@link FmiModel.impl.ModelExchangeTypeImpl#isProvidesDirectionalDerivatives <em>Provides Directional Derivatives</em>}</li>
 *   <li>{@link FmiModel.impl.ModelExchangeTypeImpl#isProvidesPartialDerivativesOfDerivativeFunctionWrtInputs <em>Provides Partial Derivatives Of Derivative Function Wrt Inputs</em>}</li>
 *   <li>{@link FmiModel.impl.ModelExchangeTypeImpl#isProvidesPartialDerivativesOfDerivativeFunctionWrtStates <em>Provides Partial Derivatives Of Derivative Function Wrt States</em>}</li>
 *   <li>{@link FmiModel.impl.ModelExchangeTypeImpl#isProvidesPartialDerivativesOfOutputFunctionWrtInputs <em>Provides Partial Derivatives Of Output Function Wrt Inputs</em>}</li>
 *   <li>{@link FmiModel.impl.ModelExchangeTypeImpl#isProvidesPartialDerivativesOfOutputFunctionWrtStates <em>Provides Partial Derivatives Of Output Function Wrt States</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ModelExchangeTypeImpl extends EObjectImpl implements ModelExchangeType {
	/**
	 * The default value of the '{@link #isCanBeInstantiatedOnlyOncePerProcess() <em>Can Be Instantiated Only Once Per Process</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isCanBeInstantiatedOnlyOncePerProcess()
	 * @generated
	 * @ordered
	 */
	protected static final boolean CAN_BE_INSTANTIATED_ONLY_ONCE_PER_PROCESS_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isCanBeInstantiatedOnlyOncePerProcess() <em>Can Be Instantiated Only Once Per Process</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isCanBeInstantiatedOnlyOncePerProcess()
	 * @generated
	 * @ordered
	 */
	protected boolean canBeInstantiatedOnlyOncePerProcess = CAN_BE_INSTANTIATED_ONLY_ONCE_PER_PROCESS_EDEFAULT;

	/**
	 * This is true if the Can Be Instantiated Only Once Per Process attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean canBeInstantiatedOnlyOncePerProcessESet;

	/**
	 * The default value of the '{@link #isCanGetAndSetFMUstate() <em>Can Get And Set FM Ustate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isCanGetAndSetFMUstate()
	 * @generated
	 * @ordered
	 */
	protected static final boolean CAN_GET_AND_SET_FM_USTATE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isCanGetAndSetFMUstate() <em>Can Get And Set FM Ustate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isCanGetAndSetFMUstate()
	 * @generated
	 * @ordered
	 */
	protected boolean canGetAndSetFMUstate = CAN_GET_AND_SET_FM_USTATE_EDEFAULT;

	/**
	 * This is true if the Can Get And Set FM Ustate attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean canGetAndSetFMUstateESet;

	/**
	 * The default value of the '{@link #isCanNotUseMemoryManagementFunctions() <em>Can Not Use Memory Management Functions</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isCanNotUseMemoryManagementFunctions()
	 * @generated
	 * @ordered
	 */
	protected static final boolean CAN_NOT_USE_MEMORY_MANAGEMENT_FUNCTIONS_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isCanNotUseMemoryManagementFunctions() <em>Can Not Use Memory Management Functions</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isCanNotUseMemoryManagementFunctions()
	 * @generated
	 * @ordered
	 */
	protected boolean canNotUseMemoryManagementFunctions = CAN_NOT_USE_MEMORY_MANAGEMENT_FUNCTIONS_EDEFAULT;

	/**
	 * This is true if the Can Not Use Memory Management Functions attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean canNotUseMemoryManagementFunctionsESet;

	/**
	 * The default value of the '{@link #isCanSerializeFMUstate() <em>Can Serialize FM Ustate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isCanSerializeFMUstate()
	 * @generated
	 * @ordered
	 */
	protected static final boolean CAN_SERIALIZE_FM_USTATE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isCanSerializeFMUstate() <em>Can Serialize FM Ustate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isCanSerializeFMUstate()
	 * @generated
	 * @ordered
	 */
	protected boolean canSerializeFMUstate = CAN_SERIALIZE_FM_USTATE_EDEFAULT;

	/**
	 * This is true if the Can Serialize FM Ustate attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean canSerializeFMUstateESet;

	/**
	 * The default value of the '{@link #isCompletedIntegratorStepNotNeeded() <em>Completed Integrator Step Not Needed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isCompletedIntegratorStepNotNeeded()
	 * @generated
	 * @ordered
	 */
	protected static final boolean COMPLETED_INTEGRATOR_STEP_NOT_NEEDED_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isCompletedIntegratorStepNotNeeded() <em>Completed Integrator Step Not Needed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isCompletedIntegratorStepNotNeeded()
	 * @generated
	 * @ordered
	 */
	protected boolean completedIntegratorStepNotNeeded = COMPLETED_INTEGRATOR_STEP_NOT_NEEDED_EDEFAULT;

	/**
	 * This is true if the Completed Integrator Step Not Needed attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean completedIntegratorStepNotNeededESet;

	/**
	 * The default value of the '{@link #getModelIdentifier() <em>Model Identifier</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getModelIdentifier()
	 * @generated
	 * @ordered
	 */
	protected static final String MODEL_IDENTIFIER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getModelIdentifier() <em>Model Identifier</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getModelIdentifier()
	 * @generated
	 * @ordered
	 */
	protected String modelIdentifier = MODEL_IDENTIFIER_EDEFAULT;

	/**
	 * The default value of the '{@link #isNeedsExecutionTool() <em>Needs Execution Tool</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isNeedsExecutionTool()
	 * @generated
	 * @ordered
	 */
	protected static final boolean NEEDS_EXECUTION_TOOL_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isNeedsExecutionTool() <em>Needs Execution Tool</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isNeedsExecutionTool()
	 * @generated
	 * @ordered
	 */
	protected boolean needsExecutionTool = NEEDS_EXECUTION_TOOL_EDEFAULT;

	/**
	 * This is true if the Needs Execution Tool attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean needsExecutionToolESet;

	/**
	 * The default value of the '{@link #isProvidesDirectionalDerivatives() <em>Provides Directional Derivatives</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isProvidesDirectionalDerivatives()
	 * @generated
	 * @ordered
	 */
	protected static final boolean PROVIDES_DIRECTIONAL_DERIVATIVES_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isProvidesDirectionalDerivatives() <em>Provides Directional Derivatives</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isProvidesDirectionalDerivatives()
	 * @generated
	 * @ordered
	 */
	protected boolean providesDirectionalDerivatives = PROVIDES_DIRECTIONAL_DERIVATIVES_EDEFAULT;

	/**
	 * This is true if the Provides Directional Derivatives attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean providesDirectionalDerivativesESet;

	/**
	 * The default value of the '{@link #isProvidesPartialDerivativesOfDerivativeFunctionWrtInputs() <em>Provides Partial Derivatives Of Derivative Function Wrt Inputs</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isProvidesPartialDerivativesOfDerivativeFunctionWrtInputs()
	 * @generated
	 * @ordered
	 */
	protected static final boolean PROVIDES_PARTIAL_DERIVATIVES_OF_DERIVATIVE_FUNCTION_WRT_INPUTS_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isProvidesPartialDerivativesOfDerivativeFunctionWrtInputs() <em>Provides Partial Derivatives Of Derivative Function Wrt Inputs</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isProvidesPartialDerivativesOfDerivativeFunctionWrtInputs()
	 * @generated
	 * @ordered
	 */
	protected boolean providesPartialDerivativesOfDerivativeFunctionWrtInputs = PROVIDES_PARTIAL_DERIVATIVES_OF_DERIVATIVE_FUNCTION_WRT_INPUTS_EDEFAULT;

	/**
	 * This is true if the Provides Partial Derivatives Of Derivative Function Wrt Inputs attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean providesPartialDerivativesOfDerivativeFunctionWrtInputsESet;

	/**
	 * The default value of the '{@link #isProvidesPartialDerivativesOfDerivativeFunctionWrtStates() <em>Provides Partial Derivatives Of Derivative Function Wrt States</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isProvidesPartialDerivativesOfDerivativeFunctionWrtStates()
	 * @generated
	 * @ordered
	 */
	protected static final boolean PROVIDES_PARTIAL_DERIVATIVES_OF_DERIVATIVE_FUNCTION_WRT_STATES_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isProvidesPartialDerivativesOfDerivativeFunctionWrtStates() <em>Provides Partial Derivatives Of Derivative Function Wrt States</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isProvidesPartialDerivativesOfDerivativeFunctionWrtStates()
	 * @generated
	 * @ordered
	 */
	protected boolean providesPartialDerivativesOfDerivativeFunctionWrtStates = PROVIDES_PARTIAL_DERIVATIVES_OF_DERIVATIVE_FUNCTION_WRT_STATES_EDEFAULT;

	/**
	 * This is true if the Provides Partial Derivatives Of Derivative Function Wrt States attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean providesPartialDerivativesOfDerivativeFunctionWrtStatesESet;

	/**
	 * The default value of the '{@link #isProvidesPartialDerivativesOfOutputFunctionWrtInputs() <em>Provides Partial Derivatives Of Output Function Wrt Inputs</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isProvidesPartialDerivativesOfOutputFunctionWrtInputs()
	 * @generated
	 * @ordered
	 */
	protected static final boolean PROVIDES_PARTIAL_DERIVATIVES_OF_OUTPUT_FUNCTION_WRT_INPUTS_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isProvidesPartialDerivativesOfOutputFunctionWrtInputs() <em>Provides Partial Derivatives Of Output Function Wrt Inputs</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isProvidesPartialDerivativesOfOutputFunctionWrtInputs()
	 * @generated
	 * @ordered
	 */
	protected boolean providesPartialDerivativesOfOutputFunctionWrtInputs = PROVIDES_PARTIAL_DERIVATIVES_OF_OUTPUT_FUNCTION_WRT_INPUTS_EDEFAULT;

	/**
	 * This is true if the Provides Partial Derivatives Of Output Function Wrt Inputs attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean providesPartialDerivativesOfOutputFunctionWrtInputsESet;

	/**
	 * The default value of the '{@link #isProvidesPartialDerivativesOfOutputFunctionWrtStates() <em>Provides Partial Derivatives Of Output Function Wrt States</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isProvidesPartialDerivativesOfOutputFunctionWrtStates()
	 * @generated
	 * @ordered
	 */
	protected static final boolean PROVIDES_PARTIAL_DERIVATIVES_OF_OUTPUT_FUNCTION_WRT_STATES_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isProvidesPartialDerivativesOfOutputFunctionWrtStates() <em>Provides Partial Derivatives Of Output Function Wrt States</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isProvidesPartialDerivativesOfOutputFunctionWrtStates()
	 * @generated
	 * @ordered
	 */
	protected boolean providesPartialDerivativesOfOutputFunctionWrtStates = PROVIDES_PARTIAL_DERIVATIVES_OF_OUTPUT_FUNCTION_WRT_STATES_EDEFAULT;

	/**
	 * This is true if the Provides Partial Derivatives Of Output Function Wrt States attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean providesPartialDerivativesOfOutputFunctionWrtStatesESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ModelExchangeTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FmiModelPackage.Literals.MODEL_EXCHANGE_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isCanBeInstantiatedOnlyOncePerProcess() {
		return canBeInstantiatedOnlyOncePerProcess;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCanBeInstantiatedOnlyOncePerProcess(boolean newCanBeInstantiatedOnlyOncePerProcess) {
		boolean oldCanBeInstantiatedOnlyOncePerProcess = canBeInstantiatedOnlyOncePerProcess;
		canBeInstantiatedOnlyOncePerProcess = newCanBeInstantiatedOnlyOncePerProcess;
		boolean oldCanBeInstantiatedOnlyOncePerProcessESet = canBeInstantiatedOnlyOncePerProcessESet;
		canBeInstantiatedOnlyOncePerProcessESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FmiModelPackage.MODEL_EXCHANGE_TYPE__CAN_BE_INSTANTIATED_ONLY_ONCE_PER_PROCESS, oldCanBeInstantiatedOnlyOncePerProcess, canBeInstantiatedOnlyOncePerProcess, !oldCanBeInstantiatedOnlyOncePerProcessESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetCanBeInstantiatedOnlyOncePerProcess() {
		boolean oldCanBeInstantiatedOnlyOncePerProcess = canBeInstantiatedOnlyOncePerProcess;
		boolean oldCanBeInstantiatedOnlyOncePerProcessESet = canBeInstantiatedOnlyOncePerProcessESet;
		canBeInstantiatedOnlyOncePerProcess = CAN_BE_INSTANTIATED_ONLY_ONCE_PER_PROCESS_EDEFAULT;
		canBeInstantiatedOnlyOncePerProcessESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, FmiModelPackage.MODEL_EXCHANGE_TYPE__CAN_BE_INSTANTIATED_ONLY_ONCE_PER_PROCESS, oldCanBeInstantiatedOnlyOncePerProcess, CAN_BE_INSTANTIATED_ONLY_ONCE_PER_PROCESS_EDEFAULT, oldCanBeInstantiatedOnlyOncePerProcessESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetCanBeInstantiatedOnlyOncePerProcess() {
		return canBeInstantiatedOnlyOncePerProcessESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isCanGetAndSetFMUstate() {
		return canGetAndSetFMUstate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCanGetAndSetFMUstate(boolean newCanGetAndSetFMUstate) {
		boolean oldCanGetAndSetFMUstate = canGetAndSetFMUstate;
		canGetAndSetFMUstate = newCanGetAndSetFMUstate;
		boolean oldCanGetAndSetFMUstateESet = canGetAndSetFMUstateESet;
		canGetAndSetFMUstateESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FmiModelPackage.MODEL_EXCHANGE_TYPE__CAN_GET_AND_SET_FM_USTATE, oldCanGetAndSetFMUstate, canGetAndSetFMUstate, !oldCanGetAndSetFMUstateESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetCanGetAndSetFMUstate() {
		boolean oldCanGetAndSetFMUstate = canGetAndSetFMUstate;
		boolean oldCanGetAndSetFMUstateESet = canGetAndSetFMUstateESet;
		canGetAndSetFMUstate = CAN_GET_AND_SET_FM_USTATE_EDEFAULT;
		canGetAndSetFMUstateESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, FmiModelPackage.MODEL_EXCHANGE_TYPE__CAN_GET_AND_SET_FM_USTATE, oldCanGetAndSetFMUstate, CAN_GET_AND_SET_FM_USTATE_EDEFAULT, oldCanGetAndSetFMUstateESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetCanGetAndSetFMUstate() {
		return canGetAndSetFMUstateESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isCanNotUseMemoryManagementFunctions() {
		return canNotUseMemoryManagementFunctions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCanNotUseMemoryManagementFunctions(boolean newCanNotUseMemoryManagementFunctions) {
		boolean oldCanNotUseMemoryManagementFunctions = canNotUseMemoryManagementFunctions;
		canNotUseMemoryManagementFunctions = newCanNotUseMemoryManagementFunctions;
		boolean oldCanNotUseMemoryManagementFunctionsESet = canNotUseMemoryManagementFunctionsESet;
		canNotUseMemoryManagementFunctionsESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FmiModelPackage.MODEL_EXCHANGE_TYPE__CAN_NOT_USE_MEMORY_MANAGEMENT_FUNCTIONS, oldCanNotUseMemoryManagementFunctions, canNotUseMemoryManagementFunctions, !oldCanNotUseMemoryManagementFunctionsESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetCanNotUseMemoryManagementFunctions() {
		boolean oldCanNotUseMemoryManagementFunctions = canNotUseMemoryManagementFunctions;
		boolean oldCanNotUseMemoryManagementFunctionsESet = canNotUseMemoryManagementFunctionsESet;
		canNotUseMemoryManagementFunctions = CAN_NOT_USE_MEMORY_MANAGEMENT_FUNCTIONS_EDEFAULT;
		canNotUseMemoryManagementFunctionsESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, FmiModelPackage.MODEL_EXCHANGE_TYPE__CAN_NOT_USE_MEMORY_MANAGEMENT_FUNCTIONS, oldCanNotUseMemoryManagementFunctions, CAN_NOT_USE_MEMORY_MANAGEMENT_FUNCTIONS_EDEFAULT, oldCanNotUseMemoryManagementFunctionsESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetCanNotUseMemoryManagementFunctions() {
		return canNotUseMemoryManagementFunctionsESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isCanSerializeFMUstate() {
		return canSerializeFMUstate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCanSerializeFMUstate(boolean newCanSerializeFMUstate) {
		boolean oldCanSerializeFMUstate = canSerializeFMUstate;
		canSerializeFMUstate = newCanSerializeFMUstate;
		boolean oldCanSerializeFMUstateESet = canSerializeFMUstateESet;
		canSerializeFMUstateESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FmiModelPackage.MODEL_EXCHANGE_TYPE__CAN_SERIALIZE_FM_USTATE, oldCanSerializeFMUstate, canSerializeFMUstate, !oldCanSerializeFMUstateESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetCanSerializeFMUstate() {
		boolean oldCanSerializeFMUstate = canSerializeFMUstate;
		boolean oldCanSerializeFMUstateESet = canSerializeFMUstateESet;
		canSerializeFMUstate = CAN_SERIALIZE_FM_USTATE_EDEFAULT;
		canSerializeFMUstateESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, FmiModelPackage.MODEL_EXCHANGE_TYPE__CAN_SERIALIZE_FM_USTATE, oldCanSerializeFMUstate, CAN_SERIALIZE_FM_USTATE_EDEFAULT, oldCanSerializeFMUstateESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetCanSerializeFMUstate() {
		return canSerializeFMUstateESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isCompletedIntegratorStepNotNeeded() {
		return completedIntegratorStepNotNeeded;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCompletedIntegratorStepNotNeeded(boolean newCompletedIntegratorStepNotNeeded) {
		boolean oldCompletedIntegratorStepNotNeeded = completedIntegratorStepNotNeeded;
		completedIntegratorStepNotNeeded = newCompletedIntegratorStepNotNeeded;
		boolean oldCompletedIntegratorStepNotNeededESet = completedIntegratorStepNotNeededESet;
		completedIntegratorStepNotNeededESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FmiModelPackage.MODEL_EXCHANGE_TYPE__COMPLETED_INTEGRATOR_STEP_NOT_NEEDED, oldCompletedIntegratorStepNotNeeded, completedIntegratorStepNotNeeded, !oldCompletedIntegratorStepNotNeededESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetCompletedIntegratorStepNotNeeded() {
		boolean oldCompletedIntegratorStepNotNeeded = completedIntegratorStepNotNeeded;
		boolean oldCompletedIntegratorStepNotNeededESet = completedIntegratorStepNotNeededESet;
		completedIntegratorStepNotNeeded = COMPLETED_INTEGRATOR_STEP_NOT_NEEDED_EDEFAULT;
		completedIntegratorStepNotNeededESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, FmiModelPackage.MODEL_EXCHANGE_TYPE__COMPLETED_INTEGRATOR_STEP_NOT_NEEDED, oldCompletedIntegratorStepNotNeeded, COMPLETED_INTEGRATOR_STEP_NOT_NEEDED_EDEFAULT, oldCompletedIntegratorStepNotNeededESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetCompletedIntegratorStepNotNeeded() {
		return completedIntegratorStepNotNeededESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getModelIdentifier() {
		return modelIdentifier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setModelIdentifier(String newModelIdentifier) {
		String oldModelIdentifier = modelIdentifier;
		modelIdentifier = newModelIdentifier;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FmiModelPackage.MODEL_EXCHANGE_TYPE__MODEL_IDENTIFIER, oldModelIdentifier, modelIdentifier));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isNeedsExecutionTool() {
		return needsExecutionTool;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNeedsExecutionTool(boolean newNeedsExecutionTool) {
		boolean oldNeedsExecutionTool = needsExecutionTool;
		needsExecutionTool = newNeedsExecutionTool;
		boolean oldNeedsExecutionToolESet = needsExecutionToolESet;
		needsExecutionToolESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FmiModelPackage.MODEL_EXCHANGE_TYPE__NEEDS_EXECUTION_TOOL, oldNeedsExecutionTool, needsExecutionTool, !oldNeedsExecutionToolESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetNeedsExecutionTool() {
		boolean oldNeedsExecutionTool = needsExecutionTool;
		boolean oldNeedsExecutionToolESet = needsExecutionToolESet;
		needsExecutionTool = NEEDS_EXECUTION_TOOL_EDEFAULT;
		needsExecutionToolESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, FmiModelPackage.MODEL_EXCHANGE_TYPE__NEEDS_EXECUTION_TOOL, oldNeedsExecutionTool, NEEDS_EXECUTION_TOOL_EDEFAULT, oldNeedsExecutionToolESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetNeedsExecutionTool() {
		return needsExecutionToolESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isProvidesDirectionalDerivatives() {
		return providesDirectionalDerivatives;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setProvidesDirectionalDerivatives(boolean newProvidesDirectionalDerivatives) {
		boolean oldProvidesDirectionalDerivatives = providesDirectionalDerivatives;
		providesDirectionalDerivatives = newProvidesDirectionalDerivatives;
		boolean oldProvidesDirectionalDerivativesESet = providesDirectionalDerivativesESet;
		providesDirectionalDerivativesESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FmiModelPackage.MODEL_EXCHANGE_TYPE__PROVIDES_DIRECTIONAL_DERIVATIVES, oldProvidesDirectionalDerivatives, providesDirectionalDerivatives, !oldProvidesDirectionalDerivativesESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetProvidesDirectionalDerivatives() {
		boolean oldProvidesDirectionalDerivatives = providesDirectionalDerivatives;
		boolean oldProvidesDirectionalDerivativesESet = providesDirectionalDerivativesESet;
		providesDirectionalDerivatives = PROVIDES_DIRECTIONAL_DERIVATIVES_EDEFAULT;
		providesDirectionalDerivativesESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, FmiModelPackage.MODEL_EXCHANGE_TYPE__PROVIDES_DIRECTIONAL_DERIVATIVES, oldProvidesDirectionalDerivatives, PROVIDES_DIRECTIONAL_DERIVATIVES_EDEFAULT, oldProvidesDirectionalDerivativesESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetProvidesDirectionalDerivatives() {
		return providesDirectionalDerivativesESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isProvidesPartialDerivativesOfDerivativeFunctionWrtInputs() {
		return providesPartialDerivativesOfDerivativeFunctionWrtInputs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setProvidesPartialDerivativesOfDerivativeFunctionWrtInputs(boolean newProvidesPartialDerivativesOfDerivativeFunctionWrtInputs) {
		boolean oldProvidesPartialDerivativesOfDerivativeFunctionWrtInputs = providesPartialDerivativesOfDerivativeFunctionWrtInputs;
		providesPartialDerivativesOfDerivativeFunctionWrtInputs = newProvidesPartialDerivativesOfDerivativeFunctionWrtInputs;
		boolean oldProvidesPartialDerivativesOfDerivativeFunctionWrtInputsESet = providesPartialDerivativesOfDerivativeFunctionWrtInputsESet;
		providesPartialDerivativesOfDerivativeFunctionWrtInputsESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FmiModelPackage.MODEL_EXCHANGE_TYPE__PROVIDES_PARTIAL_DERIVATIVES_OF_DERIVATIVE_FUNCTION_WRT_INPUTS, oldProvidesPartialDerivativesOfDerivativeFunctionWrtInputs, providesPartialDerivativesOfDerivativeFunctionWrtInputs, !oldProvidesPartialDerivativesOfDerivativeFunctionWrtInputsESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetProvidesPartialDerivativesOfDerivativeFunctionWrtInputs() {
		boolean oldProvidesPartialDerivativesOfDerivativeFunctionWrtInputs = providesPartialDerivativesOfDerivativeFunctionWrtInputs;
		boolean oldProvidesPartialDerivativesOfDerivativeFunctionWrtInputsESet = providesPartialDerivativesOfDerivativeFunctionWrtInputsESet;
		providesPartialDerivativesOfDerivativeFunctionWrtInputs = PROVIDES_PARTIAL_DERIVATIVES_OF_DERIVATIVE_FUNCTION_WRT_INPUTS_EDEFAULT;
		providesPartialDerivativesOfDerivativeFunctionWrtInputsESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, FmiModelPackage.MODEL_EXCHANGE_TYPE__PROVIDES_PARTIAL_DERIVATIVES_OF_DERIVATIVE_FUNCTION_WRT_INPUTS, oldProvidesPartialDerivativesOfDerivativeFunctionWrtInputs, PROVIDES_PARTIAL_DERIVATIVES_OF_DERIVATIVE_FUNCTION_WRT_INPUTS_EDEFAULT, oldProvidesPartialDerivativesOfDerivativeFunctionWrtInputsESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetProvidesPartialDerivativesOfDerivativeFunctionWrtInputs() {
		return providesPartialDerivativesOfDerivativeFunctionWrtInputsESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isProvidesPartialDerivativesOfDerivativeFunctionWrtStates() {
		return providesPartialDerivativesOfDerivativeFunctionWrtStates;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setProvidesPartialDerivativesOfDerivativeFunctionWrtStates(boolean newProvidesPartialDerivativesOfDerivativeFunctionWrtStates) {
		boolean oldProvidesPartialDerivativesOfDerivativeFunctionWrtStates = providesPartialDerivativesOfDerivativeFunctionWrtStates;
		providesPartialDerivativesOfDerivativeFunctionWrtStates = newProvidesPartialDerivativesOfDerivativeFunctionWrtStates;
		boolean oldProvidesPartialDerivativesOfDerivativeFunctionWrtStatesESet = providesPartialDerivativesOfDerivativeFunctionWrtStatesESet;
		providesPartialDerivativesOfDerivativeFunctionWrtStatesESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FmiModelPackage.MODEL_EXCHANGE_TYPE__PROVIDES_PARTIAL_DERIVATIVES_OF_DERIVATIVE_FUNCTION_WRT_STATES, oldProvidesPartialDerivativesOfDerivativeFunctionWrtStates, providesPartialDerivativesOfDerivativeFunctionWrtStates, !oldProvidesPartialDerivativesOfDerivativeFunctionWrtStatesESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetProvidesPartialDerivativesOfDerivativeFunctionWrtStates() {
		boolean oldProvidesPartialDerivativesOfDerivativeFunctionWrtStates = providesPartialDerivativesOfDerivativeFunctionWrtStates;
		boolean oldProvidesPartialDerivativesOfDerivativeFunctionWrtStatesESet = providesPartialDerivativesOfDerivativeFunctionWrtStatesESet;
		providesPartialDerivativesOfDerivativeFunctionWrtStates = PROVIDES_PARTIAL_DERIVATIVES_OF_DERIVATIVE_FUNCTION_WRT_STATES_EDEFAULT;
		providesPartialDerivativesOfDerivativeFunctionWrtStatesESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, FmiModelPackage.MODEL_EXCHANGE_TYPE__PROVIDES_PARTIAL_DERIVATIVES_OF_DERIVATIVE_FUNCTION_WRT_STATES, oldProvidesPartialDerivativesOfDerivativeFunctionWrtStates, PROVIDES_PARTIAL_DERIVATIVES_OF_DERIVATIVE_FUNCTION_WRT_STATES_EDEFAULT, oldProvidesPartialDerivativesOfDerivativeFunctionWrtStatesESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetProvidesPartialDerivativesOfDerivativeFunctionWrtStates() {
		return providesPartialDerivativesOfDerivativeFunctionWrtStatesESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isProvidesPartialDerivativesOfOutputFunctionWrtInputs() {
		return providesPartialDerivativesOfOutputFunctionWrtInputs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setProvidesPartialDerivativesOfOutputFunctionWrtInputs(boolean newProvidesPartialDerivativesOfOutputFunctionWrtInputs) {
		boolean oldProvidesPartialDerivativesOfOutputFunctionWrtInputs = providesPartialDerivativesOfOutputFunctionWrtInputs;
		providesPartialDerivativesOfOutputFunctionWrtInputs = newProvidesPartialDerivativesOfOutputFunctionWrtInputs;
		boolean oldProvidesPartialDerivativesOfOutputFunctionWrtInputsESet = providesPartialDerivativesOfOutputFunctionWrtInputsESet;
		providesPartialDerivativesOfOutputFunctionWrtInputsESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FmiModelPackage.MODEL_EXCHANGE_TYPE__PROVIDES_PARTIAL_DERIVATIVES_OF_OUTPUT_FUNCTION_WRT_INPUTS, oldProvidesPartialDerivativesOfOutputFunctionWrtInputs, providesPartialDerivativesOfOutputFunctionWrtInputs, !oldProvidesPartialDerivativesOfOutputFunctionWrtInputsESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetProvidesPartialDerivativesOfOutputFunctionWrtInputs() {
		boolean oldProvidesPartialDerivativesOfOutputFunctionWrtInputs = providesPartialDerivativesOfOutputFunctionWrtInputs;
		boolean oldProvidesPartialDerivativesOfOutputFunctionWrtInputsESet = providesPartialDerivativesOfOutputFunctionWrtInputsESet;
		providesPartialDerivativesOfOutputFunctionWrtInputs = PROVIDES_PARTIAL_DERIVATIVES_OF_OUTPUT_FUNCTION_WRT_INPUTS_EDEFAULT;
		providesPartialDerivativesOfOutputFunctionWrtInputsESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, FmiModelPackage.MODEL_EXCHANGE_TYPE__PROVIDES_PARTIAL_DERIVATIVES_OF_OUTPUT_FUNCTION_WRT_INPUTS, oldProvidesPartialDerivativesOfOutputFunctionWrtInputs, PROVIDES_PARTIAL_DERIVATIVES_OF_OUTPUT_FUNCTION_WRT_INPUTS_EDEFAULT, oldProvidesPartialDerivativesOfOutputFunctionWrtInputsESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetProvidesPartialDerivativesOfOutputFunctionWrtInputs() {
		return providesPartialDerivativesOfOutputFunctionWrtInputsESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isProvidesPartialDerivativesOfOutputFunctionWrtStates() {
		return providesPartialDerivativesOfOutputFunctionWrtStates;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setProvidesPartialDerivativesOfOutputFunctionWrtStates(boolean newProvidesPartialDerivativesOfOutputFunctionWrtStates) {
		boolean oldProvidesPartialDerivativesOfOutputFunctionWrtStates = providesPartialDerivativesOfOutputFunctionWrtStates;
		providesPartialDerivativesOfOutputFunctionWrtStates = newProvidesPartialDerivativesOfOutputFunctionWrtStates;
		boolean oldProvidesPartialDerivativesOfOutputFunctionWrtStatesESet = providesPartialDerivativesOfOutputFunctionWrtStatesESet;
		providesPartialDerivativesOfOutputFunctionWrtStatesESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FmiModelPackage.MODEL_EXCHANGE_TYPE__PROVIDES_PARTIAL_DERIVATIVES_OF_OUTPUT_FUNCTION_WRT_STATES, oldProvidesPartialDerivativesOfOutputFunctionWrtStates, providesPartialDerivativesOfOutputFunctionWrtStates, !oldProvidesPartialDerivativesOfOutputFunctionWrtStatesESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetProvidesPartialDerivativesOfOutputFunctionWrtStates() {
		boolean oldProvidesPartialDerivativesOfOutputFunctionWrtStates = providesPartialDerivativesOfOutputFunctionWrtStates;
		boolean oldProvidesPartialDerivativesOfOutputFunctionWrtStatesESet = providesPartialDerivativesOfOutputFunctionWrtStatesESet;
		providesPartialDerivativesOfOutputFunctionWrtStates = PROVIDES_PARTIAL_DERIVATIVES_OF_OUTPUT_FUNCTION_WRT_STATES_EDEFAULT;
		providesPartialDerivativesOfOutputFunctionWrtStatesESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, FmiModelPackage.MODEL_EXCHANGE_TYPE__PROVIDES_PARTIAL_DERIVATIVES_OF_OUTPUT_FUNCTION_WRT_STATES, oldProvidesPartialDerivativesOfOutputFunctionWrtStates, PROVIDES_PARTIAL_DERIVATIVES_OF_OUTPUT_FUNCTION_WRT_STATES_EDEFAULT, oldProvidesPartialDerivativesOfOutputFunctionWrtStatesESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetProvidesPartialDerivativesOfOutputFunctionWrtStates() {
		return providesPartialDerivativesOfOutputFunctionWrtStatesESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case FmiModelPackage.MODEL_EXCHANGE_TYPE__CAN_BE_INSTANTIATED_ONLY_ONCE_PER_PROCESS:
				return isCanBeInstantiatedOnlyOncePerProcess();
			case FmiModelPackage.MODEL_EXCHANGE_TYPE__CAN_GET_AND_SET_FM_USTATE:
				return isCanGetAndSetFMUstate();
			case FmiModelPackage.MODEL_EXCHANGE_TYPE__CAN_NOT_USE_MEMORY_MANAGEMENT_FUNCTIONS:
				return isCanNotUseMemoryManagementFunctions();
			case FmiModelPackage.MODEL_EXCHANGE_TYPE__CAN_SERIALIZE_FM_USTATE:
				return isCanSerializeFMUstate();
			case FmiModelPackage.MODEL_EXCHANGE_TYPE__COMPLETED_INTEGRATOR_STEP_NOT_NEEDED:
				return isCompletedIntegratorStepNotNeeded();
			case FmiModelPackage.MODEL_EXCHANGE_TYPE__MODEL_IDENTIFIER:
				return getModelIdentifier();
			case FmiModelPackage.MODEL_EXCHANGE_TYPE__NEEDS_EXECUTION_TOOL:
				return isNeedsExecutionTool();
			case FmiModelPackage.MODEL_EXCHANGE_TYPE__PROVIDES_DIRECTIONAL_DERIVATIVES:
				return isProvidesDirectionalDerivatives();
			case FmiModelPackage.MODEL_EXCHANGE_TYPE__PROVIDES_PARTIAL_DERIVATIVES_OF_DERIVATIVE_FUNCTION_WRT_INPUTS:
				return isProvidesPartialDerivativesOfDerivativeFunctionWrtInputs();
			case FmiModelPackage.MODEL_EXCHANGE_TYPE__PROVIDES_PARTIAL_DERIVATIVES_OF_DERIVATIVE_FUNCTION_WRT_STATES:
				return isProvidesPartialDerivativesOfDerivativeFunctionWrtStates();
			case FmiModelPackage.MODEL_EXCHANGE_TYPE__PROVIDES_PARTIAL_DERIVATIVES_OF_OUTPUT_FUNCTION_WRT_INPUTS:
				return isProvidesPartialDerivativesOfOutputFunctionWrtInputs();
			case FmiModelPackage.MODEL_EXCHANGE_TYPE__PROVIDES_PARTIAL_DERIVATIVES_OF_OUTPUT_FUNCTION_WRT_STATES:
				return isProvidesPartialDerivativesOfOutputFunctionWrtStates();
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
			case FmiModelPackage.MODEL_EXCHANGE_TYPE__CAN_BE_INSTANTIATED_ONLY_ONCE_PER_PROCESS:
				setCanBeInstantiatedOnlyOncePerProcess((Boolean)newValue);
				return;
			case FmiModelPackage.MODEL_EXCHANGE_TYPE__CAN_GET_AND_SET_FM_USTATE:
				setCanGetAndSetFMUstate((Boolean)newValue);
				return;
			case FmiModelPackage.MODEL_EXCHANGE_TYPE__CAN_NOT_USE_MEMORY_MANAGEMENT_FUNCTIONS:
				setCanNotUseMemoryManagementFunctions((Boolean)newValue);
				return;
			case FmiModelPackage.MODEL_EXCHANGE_TYPE__CAN_SERIALIZE_FM_USTATE:
				setCanSerializeFMUstate((Boolean)newValue);
				return;
			case FmiModelPackage.MODEL_EXCHANGE_TYPE__COMPLETED_INTEGRATOR_STEP_NOT_NEEDED:
				setCompletedIntegratorStepNotNeeded((Boolean)newValue);
				return;
			case FmiModelPackage.MODEL_EXCHANGE_TYPE__MODEL_IDENTIFIER:
				setModelIdentifier((String)newValue);
				return;
			case FmiModelPackage.MODEL_EXCHANGE_TYPE__NEEDS_EXECUTION_TOOL:
				setNeedsExecutionTool((Boolean)newValue);
				return;
			case FmiModelPackage.MODEL_EXCHANGE_TYPE__PROVIDES_DIRECTIONAL_DERIVATIVES:
				setProvidesDirectionalDerivatives((Boolean)newValue);
				return;
			case FmiModelPackage.MODEL_EXCHANGE_TYPE__PROVIDES_PARTIAL_DERIVATIVES_OF_DERIVATIVE_FUNCTION_WRT_INPUTS:
				setProvidesPartialDerivativesOfDerivativeFunctionWrtInputs((Boolean)newValue);
				return;
			case FmiModelPackage.MODEL_EXCHANGE_TYPE__PROVIDES_PARTIAL_DERIVATIVES_OF_DERIVATIVE_FUNCTION_WRT_STATES:
				setProvidesPartialDerivativesOfDerivativeFunctionWrtStates((Boolean)newValue);
				return;
			case FmiModelPackage.MODEL_EXCHANGE_TYPE__PROVIDES_PARTIAL_DERIVATIVES_OF_OUTPUT_FUNCTION_WRT_INPUTS:
				setProvidesPartialDerivativesOfOutputFunctionWrtInputs((Boolean)newValue);
				return;
			case FmiModelPackage.MODEL_EXCHANGE_TYPE__PROVIDES_PARTIAL_DERIVATIVES_OF_OUTPUT_FUNCTION_WRT_STATES:
				setProvidesPartialDerivativesOfOutputFunctionWrtStates((Boolean)newValue);
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
			case FmiModelPackage.MODEL_EXCHANGE_TYPE__CAN_BE_INSTANTIATED_ONLY_ONCE_PER_PROCESS:
				unsetCanBeInstantiatedOnlyOncePerProcess();
				return;
			case FmiModelPackage.MODEL_EXCHANGE_TYPE__CAN_GET_AND_SET_FM_USTATE:
				unsetCanGetAndSetFMUstate();
				return;
			case FmiModelPackage.MODEL_EXCHANGE_TYPE__CAN_NOT_USE_MEMORY_MANAGEMENT_FUNCTIONS:
				unsetCanNotUseMemoryManagementFunctions();
				return;
			case FmiModelPackage.MODEL_EXCHANGE_TYPE__CAN_SERIALIZE_FM_USTATE:
				unsetCanSerializeFMUstate();
				return;
			case FmiModelPackage.MODEL_EXCHANGE_TYPE__COMPLETED_INTEGRATOR_STEP_NOT_NEEDED:
				unsetCompletedIntegratorStepNotNeeded();
				return;
			case FmiModelPackage.MODEL_EXCHANGE_TYPE__MODEL_IDENTIFIER:
				setModelIdentifier(MODEL_IDENTIFIER_EDEFAULT);
				return;
			case FmiModelPackage.MODEL_EXCHANGE_TYPE__NEEDS_EXECUTION_TOOL:
				unsetNeedsExecutionTool();
				return;
			case FmiModelPackage.MODEL_EXCHANGE_TYPE__PROVIDES_DIRECTIONAL_DERIVATIVES:
				unsetProvidesDirectionalDerivatives();
				return;
			case FmiModelPackage.MODEL_EXCHANGE_TYPE__PROVIDES_PARTIAL_DERIVATIVES_OF_DERIVATIVE_FUNCTION_WRT_INPUTS:
				unsetProvidesPartialDerivativesOfDerivativeFunctionWrtInputs();
				return;
			case FmiModelPackage.MODEL_EXCHANGE_TYPE__PROVIDES_PARTIAL_DERIVATIVES_OF_DERIVATIVE_FUNCTION_WRT_STATES:
				unsetProvidesPartialDerivativesOfDerivativeFunctionWrtStates();
				return;
			case FmiModelPackage.MODEL_EXCHANGE_TYPE__PROVIDES_PARTIAL_DERIVATIVES_OF_OUTPUT_FUNCTION_WRT_INPUTS:
				unsetProvidesPartialDerivativesOfOutputFunctionWrtInputs();
				return;
			case FmiModelPackage.MODEL_EXCHANGE_TYPE__PROVIDES_PARTIAL_DERIVATIVES_OF_OUTPUT_FUNCTION_WRT_STATES:
				unsetProvidesPartialDerivativesOfOutputFunctionWrtStates();
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
			case FmiModelPackage.MODEL_EXCHANGE_TYPE__CAN_BE_INSTANTIATED_ONLY_ONCE_PER_PROCESS:
				return isSetCanBeInstantiatedOnlyOncePerProcess();
			case FmiModelPackage.MODEL_EXCHANGE_TYPE__CAN_GET_AND_SET_FM_USTATE:
				return isSetCanGetAndSetFMUstate();
			case FmiModelPackage.MODEL_EXCHANGE_TYPE__CAN_NOT_USE_MEMORY_MANAGEMENT_FUNCTIONS:
				return isSetCanNotUseMemoryManagementFunctions();
			case FmiModelPackage.MODEL_EXCHANGE_TYPE__CAN_SERIALIZE_FM_USTATE:
				return isSetCanSerializeFMUstate();
			case FmiModelPackage.MODEL_EXCHANGE_TYPE__COMPLETED_INTEGRATOR_STEP_NOT_NEEDED:
				return isSetCompletedIntegratorStepNotNeeded();
			case FmiModelPackage.MODEL_EXCHANGE_TYPE__MODEL_IDENTIFIER:
				return MODEL_IDENTIFIER_EDEFAULT == null ? modelIdentifier != null : !MODEL_IDENTIFIER_EDEFAULT.equals(modelIdentifier);
			case FmiModelPackage.MODEL_EXCHANGE_TYPE__NEEDS_EXECUTION_TOOL:
				return isSetNeedsExecutionTool();
			case FmiModelPackage.MODEL_EXCHANGE_TYPE__PROVIDES_DIRECTIONAL_DERIVATIVES:
				return isSetProvidesDirectionalDerivatives();
			case FmiModelPackage.MODEL_EXCHANGE_TYPE__PROVIDES_PARTIAL_DERIVATIVES_OF_DERIVATIVE_FUNCTION_WRT_INPUTS:
				return isSetProvidesPartialDerivativesOfDerivativeFunctionWrtInputs();
			case FmiModelPackage.MODEL_EXCHANGE_TYPE__PROVIDES_PARTIAL_DERIVATIVES_OF_DERIVATIVE_FUNCTION_WRT_STATES:
				return isSetProvidesPartialDerivativesOfDerivativeFunctionWrtStates();
			case FmiModelPackage.MODEL_EXCHANGE_TYPE__PROVIDES_PARTIAL_DERIVATIVES_OF_OUTPUT_FUNCTION_WRT_INPUTS:
				return isSetProvidesPartialDerivativesOfOutputFunctionWrtInputs();
			case FmiModelPackage.MODEL_EXCHANGE_TYPE__PROVIDES_PARTIAL_DERIVATIVES_OF_OUTPUT_FUNCTION_WRT_STATES:
				return isSetProvidesPartialDerivativesOfOutputFunctionWrtStates();
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
		result.append(" (canBeInstantiatedOnlyOncePerProcess: ");
		if (canBeInstantiatedOnlyOncePerProcessESet) result.append(canBeInstantiatedOnlyOncePerProcess); else result.append("<unset>");
		result.append(", canGetAndSetFMUstate: ");
		if (canGetAndSetFMUstateESet) result.append(canGetAndSetFMUstate); else result.append("<unset>");
		result.append(", canNotUseMemoryManagementFunctions: ");
		if (canNotUseMemoryManagementFunctionsESet) result.append(canNotUseMemoryManagementFunctions); else result.append("<unset>");
		result.append(", canSerializeFMUstate: ");
		if (canSerializeFMUstateESet) result.append(canSerializeFMUstate); else result.append("<unset>");
		result.append(", completedIntegratorStepNotNeeded: ");
		if (completedIntegratorStepNotNeededESet) result.append(completedIntegratorStepNotNeeded); else result.append("<unset>");
		result.append(", modelIdentifier: ");
		result.append(modelIdentifier);
		result.append(", needsExecutionTool: ");
		if (needsExecutionToolESet) result.append(needsExecutionTool); else result.append("<unset>");
		result.append(", providesDirectionalDerivatives: ");
		if (providesDirectionalDerivativesESet) result.append(providesDirectionalDerivatives); else result.append("<unset>");
		result.append(", providesPartialDerivativesOfDerivativeFunctionWrtInputs: ");
		if (providesPartialDerivativesOfDerivativeFunctionWrtInputsESet) result.append(providesPartialDerivativesOfDerivativeFunctionWrtInputs); else result.append("<unset>");
		result.append(", providesPartialDerivativesOfDerivativeFunctionWrtStates: ");
		if (providesPartialDerivativesOfDerivativeFunctionWrtStatesESet) result.append(providesPartialDerivativesOfDerivativeFunctionWrtStates); else result.append("<unset>");
		result.append(", providesPartialDerivativesOfOutputFunctionWrtInputs: ");
		if (providesPartialDerivativesOfOutputFunctionWrtInputsESet) result.append(providesPartialDerivativesOfOutputFunctionWrtInputs); else result.append("<unset>");
		result.append(", providesPartialDerivativesOfOutputFunctionWrtStates: ");
		if (providesPartialDerivativesOfOutputFunctionWrtStatesESet) result.append(providesPartialDerivativesOfOutputFunctionWrtStates); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //ModelExchangeTypeImpl
