/**
 */
package FmiModel.impl;

import FmiModel.CoSimulationType;
import FmiModel.FmiModelPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Co Simulation Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link FmiModel.impl.CoSimulationTypeImpl#isCanBeInstantiatedOnlyOncePerProcess <em>Can Be Instantiated Only Once Per Process</em>}</li>
 *   <li>{@link FmiModel.impl.CoSimulationTypeImpl#isCanGetAndSetFMUstate <em>Can Get And Set FM Ustate</em>}</li>
 *   <li>{@link FmiModel.impl.CoSimulationTypeImpl#isCanHandleEvents <em>Can Handle Events</em>}</li>
 *   <li>{@link FmiModel.impl.CoSimulationTypeImpl#isCanHandleVariableCommunicationStepSize <em>Can Handle Variable Communication Step Size</em>}</li>
 *   <li>{@link FmiModel.impl.CoSimulationTypeImpl#isCanInterpolateInputs <em>Can Interpolate Inputs</em>}</li>
 *   <li>{@link FmiModel.impl.CoSimulationTypeImpl#isCanNotUseMemoryManagementFunctions <em>Can Not Use Memory Management Functions</em>}</li>
 *   <li>{@link FmiModel.impl.CoSimulationTypeImpl#isCanRunAsynchronuously <em>Can Run Asynchronuously</em>}</li>
 *   <li>{@link FmiModel.impl.CoSimulationTypeImpl#isCanSerializeFMUstate <em>Can Serialize FM Ustate</em>}</li>
 *   <li>{@link FmiModel.impl.CoSimulationTypeImpl#isCanSignalEvents <em>Can Signal Events</em>}</li>
 *   <li>{@link FmiModel.impl.CoSimulationTypeImpl#getMaxOutputDerivativeOrder <em>Max Output Derivative Order</em>}</li>
 *   <li>{@link FmiModel.impl.CoSimulationTypeImpl#getModelIdentifier <em>Model Identifier</em>}</li>
 *   <li>{@link FmiModel.impl.CoSimulationTypeImpl#isNeedsExecutionTool <em>Needs Execution Tool</em>}</li>
 *   <li>{@link FmiModel.impl.CoSimulationTypeImpl#isProvidesPartialDerivativesOfDerivativeFunctionWrtInputs <em>Provides Partial Derivatives Of Derivative Function Wrt Inputs</em>}</li>
 *   <li>{@link FmiModel.impl.CoSimulationTypeImpl#isProvidesPartialDerivativesOfDerivativeFunctionWrtStates <em>Provides Partial Derivatives Of Derivative Function Wrt States</em>}</li>
 *   <li>{@link FmiModel.impl.CoSimulationTypeImpl#isProvidesPartialDerivativesOfOutputFunctionWrtInputs <em>Provides Partial Derivatives Of Output Function Wrt Inputs</em>}</li>
 *   <li>{@link FmiModel.impl.CoSimulationTypeImpl#isProvidesPartialDerivativesOfOutputFunctionWrtStates <em>Provides Partial Derivatives Of Output Function Wrt States</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CoSimulationTypeImpl extends EObjectImpl implements CoSimulationType {
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
	 * The default value of the '{@link #isCanHandleEvents() <em>Can Handle Events</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isCanHandleEvents()
	 * @generated
	 * @ordered
	 */
	protected static final boolean CAN_HANDLE_EVENTS_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isCanHandleEvents() <em>Can Handle Events</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isCanHandleEvents()
	 * @generated
	 * @ordered
	 */
	protected boolean canHandleEvents = CAN_HANDLE_EVENTS_EDEFAULT;

	/**
	 * This is true if the Can Handle Events attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean canHandleEventsESet;

	/**
	 * The default value of the '{@link #isCanHandleVariableCommunicationStepSize() <em>Can Handle Variable Communication Step Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isCanHandleVariableCommunicationStepSize()
	 * @generated
	 * @ordered
	 */
	protected static final boolean CAN_HANDLE_VARIABLE_COMMUNICATION_STEP_SIZE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isCanHandleVariableCommunicationStepSize() <em>Can Handle Variable Communication Step Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isCanHandleVariableCommunicationStepSize()
	 * @generated
	 * @ordered
	 */
	protected boolean canHandleVariableCommunicationStepSize = CAN_HANDLE_VARIABLE_COMMUNICATION_STEP_SIZE_EDEFAULT;

	/**
	 * This is true if the Can Handle Variable Communication Step Size attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean canHandleVariableCommunicationStepSizeESet;

	/**
	 * The default value of the '{@link #isCanInterpolateInputs() <em>Can Interpolate Inputs</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isCanInterpolateInputs()
	 * @generated
	 * @ordered
	 */
	protected static final boolean CAN_INTERPOLATE_INPUTS_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isCanInterpolateInputs() <em>Can Interpolate Inputs</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isCanInterpolateInputs()
	 * @generated
	 * @ordered
	 */
	protected boolean canInterpolateInputs = CAN_INTERPOLATE_INPUTS_EDEFAULT;

	/**
	 * This is true if the Can Interpolate Inputs attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean canInterpolateInputsESet;

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
	 * The default value of the '{@link #isCanRunAsynchronuously() <em>Can Run Asynchronuously</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isCanRunAsynchronuously()
	 * @generated
	 * @ordered
	 */
	protected static final boolean CAN_RUN_ASYNCHRONUOUSLY_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isCanRunAsynchronuously() <em>Can Run Asynchronuously</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isCanRunAsynchronuously()
	 * @generated
	 * @ordered
	 */
	protected boolean canRunAsynchronuously = CAN_RUN_ASYNCHRONUOUSLY_EDEFAULT;

	/**
	 * This is true if the Can Run Asynchronuously attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean canRunAsynchronuouslyESet;

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
	 * The default value of the '{@link #isCanSignalEvents() <em>Can Signal Events</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isCanSignalEvents()
	 * @generated
	 * @ordered
	 */
	protected static final boolean CAN_SIGNAL_EVENTS_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isCanSignalEvents() <em>Can Signal Events</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isCanSignalEvents()
	 * @generated
	 * @ordered
	 */
	protected boolean canSignalEvents = CAN_SIGNAL_EVENTS_EDEFAULT;

	/**
	 * This is true if the Can Signal Events attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean canSignalEventsESet;

	/**
	 * The default value of the '{@link #getMaxOutputDerivativeOrder() <em>Max Output Derivative Order</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxOutputDerivativeOrder()
	 * @generated
	 * @ordered
	 */
	protected static final long MAX_OUTPUT_DERIVATIVE_ORDER_EDEFAULT = 0L;

	/**
	 * The cached value of the '{@link #getMaxOutputDerivativeOrder() <em>Max Output Derivative Order</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxOutputDerivativeOrder()
	 * @generated
	 * @ordered
	 */
	protected long maxOutputDerivativeOrder = MAX_OUTPUT_DERIVATIVE_ORDER_EDEFAULT;

	/**
	 * This is true if the Max Output Derivative Order attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean maxOutputDerivativeOrderESet;

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
	protected CoSimulationTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FmiModelPackage.Literals.CO_SIMULATION_TYPE;
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
			eNotify(new ENotificationImpl(this, Notification.SET, FmiModelPackage.CO_SIMULATION_TYPE__CAN_BE_INSTANTIATED_ONLY_ONCE_PER_PROCESS, oldCanBeInstantiatedOnlyOncePerProcess, canBeInstantiatedOnlyOncePerProcess, !oldCanBeInstantiatedOnlyOncePerProcessESet));
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
			eNotify(new ENotificationImpl(this, Notification.UNSET, FmiModelPackage.CO_SIMULATION_TYPE__CAN_BE_INSTANTIATED_ONLY_ONCE_PER_PROCESS, oldCanBeInstantiatedOnlyOncePerProcess, CAN_BE_INSTANTIATED_ONLY_ONCE_PER_PROCESS_EDEFAULT, oldCanBeInstantiatedOnlyOncePerProcessESet));
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
			eNotify(new ENotificationImpl(this, Notification.SET, FmiModelPackage.CO_SIMULATION_TYPE__CAN_GET_AND_SET_FM_USTATE, oldCanGetAndSetFMUstate, canGetAndSetFMUstate, !oldCanGetAndSetFMUstateESet));
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
			eNotify(new ENotificationImpl(this, Notification.UNSET, FmiModelPackage.CO_SIMULATION_TYPE__CAN_GET_AND_SET_FM_USTATE, oldCanGetAndSetFMUstate, CAN_GET_AND_SET_FM_USTATE_EDEFAULT, oldCanGetAndSetFMUstateESet));
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
	public boolean isCanHandleEvents() {
		return canHandleEvents;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCanHandleEvents(boolean newCanHandleEvents) {
		boolean oldCanHandleEvents = canHandleEvents;
		canHandleEvents = newCanHandleEvents;
		boolean oldCanHandleEventsESet = canHandleEventsESet;
		canHandleEventsESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FmiModelPackage.CO_SIMULATION_TYPE__CAN_HANDLE_EVENTS, oldCanHandleEvents, canHandleEvents, !oldCanHandleEventsESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetCanHandleEvents() {
		boolean oldCanHandleEvents = canHandleEvents;
		boolean oldCanHandleEventsESet = canHandleEventsESet;
		canHandleEvents = CAN_HANDLE_EVENTS_EDEFAULT;
		canHandleEventsESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, FmiModelPackage.CO_SIMULATION_TYPE__CAN_HANDLE_EVENTS, oldCanHandleEvents, CAN_HANDLE_EVENTS_EDEFAULT, oldCanHandleEventsESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetCanHandleEvents() {
		return canHandleEventsESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isCanHandleVariableCommunicationStepSize() {
		return canHandleVariableCommunicationStepSize;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCanHandleVariableCommunicationStepSize(boolean newCanHandleVariableCommunicationStepSize) {
		boolean oldCanHandleVariableCommunicationStepSize = canHandleVariableCommunicationStepSize;
		canHandleVariableCommunicationStepSize = newCanHandleVariableCommunicationStepSize;
		boolean oldCanHandleVariableCommunicationStepSizeESet = canHandleVariableCommunicationStepSizeESet;
		canHandleVariableCommunicationStepSizeESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FmiModelPackage.CO_SIMULATION_TYPE__CAN_HANDLE_VARIABLE_COMMUNICATION_STEP_SIZE, oldCanHandleVariableCommunicationStepSize, canHandleVariableCommunicationStepSize, !oldCanHandleVariableCommunicationStepSizeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetCanHandleVariableCommunicationStepSize() {
		boolean oldCanHandleVariableCommunicationStepSize = canHandleVariableCommunicationStepSize;
		boolean oldCanHandleVariableCommunicationStepSizeESet = canHandleVariableCommunicationStepSizeESet;
		canHandleVariableCommunicationStepSize = CAN_HANDLE_VARIABLE_COMMUNICATION_STEP_SIZE_EDEFAULT;
		canHandleVariableCommunicationStepSizeESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, FmiModelPackage.CO_SIMULATION_TYPE__CAN_HANDLE_VARIABLE_COMMUNICATION_STEP_SIZE, oldCanHandleVariableCommunicationStepSize, CAN_HANDLE_VARIABLE_COMMUNICATION_STEP_SIZE_EDEFAULT, oldCanHandleVariableCommunicationStepSizeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetCanHandleVariableCommunicationStepSize() {
		return canHandleVariableCommunicationStepSizeESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isCanInterpolateInputs() {
		return canInterpolateInputs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCanInterpolateInputs(boolean newCanInterpolateInputs) {
		boolean oldCanInterpolateInputs = canInterpolateInputs;
		canInterpolateInputs = newCanInterpolateInputs;
		boolean oldCanInterpolateInputsESet = canInterpolateInputsESet;
		canInterpolateInputsESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FmiModelPackage.CO_SIMULATION_TYPE__CAN_INTERPOLATE_INPUTS, oldCanInterpolateInputs, canInterpolateInputs, !oldCanInterpolateInputsESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetCanInterpolateInputs() {
		boolean oldCanInterpolateInputs = canInterpolateInputs;
		boolean oldCanInterpolateInputsESet = canInterpolateInputsESet;
		canInterpolateInputs = CAN_INTERPOLATE_INPUTS_EDEFAULT;
		canInterpolateInputsESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, FmiModelPackage.CO_SIMULATION_TYPE__CAN_INTERPOLATE_INPUTS, oldCanInterpolateInputs, CAN_INTERPOLATE_INPUTS_EDEFAULT, oldCanInterpolateInputsESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetCanInterpolateInputs() {
		return canInterpolateInputsESet;
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
			eNotify(new ENotificationImpl(this, Notification.SET, FmiModelPackage.CO_SIMULATION_TYPE__CAN_NOT_USE_MEMORY_MANAGEMENT_FUNCTIONS, oldCanNotUseMemoryManagementFunctions, canNotUseMemoryManagementFunctions, !oldCanNotUseMemoryManagementFunctionsESet));
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
			eNotify(new ENotificationImpl(this, Notification.UNSET, FmiModelPackage.CO_SIMULATION_TYPE__CAN_NOT_USE_MEMORY_MANAGEMENT_FUNCTIONS, oldCanNotUseMemoryManagementFunctions, CAN_NOT_USE_MEMORY_MANAGEMENT_FUNCTIONS_EDEFAULT, oldCanNotUseMemoryManagementFunctionsESet));
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
	public boolean isCanRunAsynchronuously() {
		return canRunAsynchronuously;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCanRunAsynchronuously(boolean newCanRunAsynchronuously) {
		boolean oldCanRunAsynchronuously = canRunAsynchronuously;
		canRunAsynchronuously = newCanRunAsynchronuously;
		boolean oldCanRunAsynchronuouslyESet = canRunAsynchronuouslyESet;
		canRunAsynchronuouslyESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FmiModelPackage.CO_SIMULATION_TYPE__CAN_RUN_ASYNCHRONUOUSLY, oldCanRunAsynchronuously, canRunAsynchronuously, !oldCanRunAsynchronuouslyESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetCanRunAsynchronuously() {
		boolean oldCanRunAsynchronuously = canRunAsynchronuously;
		boolean oldCanRunAsynchronuouslyESet = canRunAsynchronuouslyESet;
		canRunAsynchronuously = CAN_RUN_ASYNCHRONUOUSLY_EDEFAULT;
		canRunAsynchronuouslyESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, FmiModelPackage.CO_SIMULATION_TYPE__CAN_RUN_ASYNCHRONUOUSLY, oldCanRunAsynchronuously, CAN_RUN_ASYNCHRONUOUSLY_EDEFAULT, oldCanRunAsynchronuouslyESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetCanRunAsynchronuously() {
		return canRunAsynchronuouslyESet;
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
			eNotify(new ENotificationImpl(this, Notification.SET, FmiModelPackage.CO_SIMULATION_TYPE__CAN_SERIALIZE_FM_USTATE, oldCanSerializeFMUstate, canSerializeFMUstate, !oldCanSerializeFMUstateESet));
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
			eNotify(new ENotificationImpl(this, Notification.UNSET, FmiModelPackage.CO_SIMULATION_TYPE__CAN_SERIALIZE_FM_USTATE, oldCanSerializeFMUstate, CAN_SERIALIZE_FM_USTATE_EDEFAULT, oldCanSerializeFMUstateESet));
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
	public boolean isCanSignalEvents() {
		return canSignalEvents;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCanSignalEvents(boolean newCanSignalEvents) {
		boolean oldCanSignalEvents = canSignalEvents;
		canSignalEvents = newCanSignalEvents;
		boolean oldCanSignalEventsESet = canSignalEventsESet;
		canSignalEventsESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FmiModelPackage.CO_SIMULATION_TYPE__CAN_SIGNAL_EVENTS, oldCanSignalEvents, canSignalEvents, !oldCanSignalEventsESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetCanSignalEvents() {
		boolean oldCanSignalEvents = canSignalEvents;
		boolean oldCanSignalEventsESet = canSignalEventsESet;
		canSignalEvents = CAN_SIGNAL_EVENTS_EDEFAULT;
		canSignalEventsESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, FmiModelPackage.CO_SIMULATION_TYPE__CAN_SIGNAL_EVENTS, oldCanSignalEvents, CAN_SIGNAL_EVENTS_EDEFAULT, oldCanSignalEventsESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetCanSignalEvents() {
		return canSignalEventsESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public long getMaxOutputDerivativeOrder() {
		return maxOutputDerivativeOrder;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMaxOutputDerivativeOrder(long newMaxOutputDerivativeOrder) {
		long oldMaxOutputDerivativeOrder = maxOutputDerivativeOrder;
		maxOutputDerivativeOrder = newMaxOutputDerivativeOrder;
		boolean oldMaxOutputDerivativeOrderESet = maxOutputDerivativeOrderESet;
		maxOutputDerivativeOrderESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FmiModelPackage.CO_SIMULATION_TYPE__MAX_OUTPUT_DERIVATIVE_ORDER, oldMaxOutputDerivativeOrder, maxOutputDerivativeOrder, !oldMaxOutputDerivativeOrderESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetMaxOutputDerivativeOrder() {
		long oldMaxOutputDerivativeOrder = maxOutputDerivativeOrder;
		boolean oldMaxOutputDerivativeOrderESet = maxOutputDerivativeOrderESet;
		maxOutputDerivativeOrder = MAX_OUTPUT_DERIVATIVE_ORDER_EDEFAULT;
		maxOutputDerivativeOrderESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, FmiModelPackage.CO_SIMULATION_TYPE__MAX_OUTPUT_DERIVATIVE_ORDER, oldMaxOutputDerivativeOrder, MAX_OUTPUT_DERIVATIVE_ORDER_EDEFAULT, oldMaxOutputDerivativeOrderESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetMaxOutputDerivativeOrder() {
		return maxOutputDerivativeOrderESet;
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
			eNotify(new ENotificationImpl(this, Notification.SET, FmiModelPackage.CO_SIMULATION_TYPE__MODEL_IDENTIFIER, oldModelIdentifier, modelIdentifier));
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
			eNotify(new ENotificationImpl(this, Notification.SET, FmiModelPackage.CO_SIMULATION_TYPE__NEEDS_EXECUTION_TOOL, oldNeedsExecutionTool, needsExecutionTool, !oldNeedsExecutionToolESet));
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
			eNotify(new ENotificationImpl(this, Notification.UNSET, FmiModelPackage.CO_SIMULATION_TYPE__NEEDS_EXECUTION_TOOL, oldNeedsExecutionTool, NEEDS_EXECUTION_TOOL_EDEFAULT, oldNeedsExecutionToolESet));
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
			eNotify(new ENotificationImpl(this, Notification.SET, FmiModelPackage.CO_SIMULATION_TYPE__PROVIDES_PARTIAL_DERIVATIVES_OF_DERIVATIVE_FUNCTION_WRT_INPUTS, oldProvidesPartialDerivativesOfDerivativeFunctionWrtInputs, providesPartialDerivativesOfDerivativeFunctionWrtInputs, !oldProvidesPartialDerivativesOfDerivativeFunctionWrtInputsESet));
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
			eNotify(new ENotificationImpl(this, Notification.UNSET, FmiModelPackage.CO_SIMULATION_TYPE__PROVIDES_PARTIAL_DERIVATIVES_OF_DERIVATIVE_FUNCTION_WRT_INPUTS, oldProvidesPartialDerivativesOfDerivativeFunctionWrtInputs, PROVIDES_PARTIAL_DERIVATIVES_OF_DERIVATIVE_FUNCTION_WRT_INPUTS_EDEFAULT, oldProvidesPartialDerivativesOfDerivativeFunctionWrtInputsESet));
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
			eNotify(new ENotificationImpl(this, Notification.SET, FmiModelPackage.CO_SIMULATION_TYPE__PROVIDES_PARTIAL_DERIVATIVES_OF_DERIVATIVE_FUNCTION_WRT_STATES, oldProvidesPartialDerivativesOfDerivativeFunctionWrtStates, providesPartialDerivativesOfDerivativeFunctionWrtStates, !oldProvidesPartialDerivativesOfDerivativeFunctionWrtStatesESet));
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
			eNotify(new ENotificationImpl(this, Notification.UNSET, FmiModelPackage.CO_SIMULATION_TYPE__PROVIDES_PARTIAL_DERIVATIVES_OF_DERIVATIVE_FUNCTION_WRT_STATES, oldProvidesPartialDerivativesOfDerivativeFunctionWrtStates, PROVIDES_PARTIAL_DERIVATIVES_OF_DERIVATIVE_FUNCTION_WRT_STATES_EDEFAULT, oldProvidesPartialDerivativesOfDerivativeFunctionWrtStatesESet));
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
			eNotify(new ENotificationImpl(this, Notification.SET, FmiModelPackage.CO_SIMULATION_TYPE__PROVIDES_PARTIAL_DERIVATIVES_OF_OUTPUT_FUNCTION_WRT_INPUTS, oldProvidesPartialDerivativesOfOutputFunctionWrtInputs, providesPartialDerivativesOfOutputFunctionWrtInputs, !oldProvidesPartialDerivativesOfOutputFunctionWrtInputsESet));
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
			eNotify(new ENotificationImpl(this, Notification.UNSET, FmiModelPackage.CO_SIMULATION_TYPE__PROVIDES_PARTIAL_DERIVATIVES_OF_OUTPUT_FUNCTION_WRT_INPUTS, oldProvidesPartialDerivativesOfOutputFunctionWrtInputs, PROVIDES_PARTIAL_DERIVATIVES_OF_OUTPUT_FUNCTION_WRT_INPUTS_EDEFAULT, oldProvidesPartialDerivativesOfOutputFunctionWrtInputsESet));
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
			eNotify(new ENotificationImpl(this, Notification.SET, FmiModelPackage.CO_SIMULATION_TYPE__PROVIDES_PARTIAL_DERIVATIVES_OF_OUTPUT_FUNCTION_WRT_STATES, oldProvidesPartialDerivativesOfOutputFunctionWrtStates, providesPartialDerivativesOfOutputFunctionWrtStates, !oldProvidesPartialDerivativesOfOutputFunctionWrtStatesESet));
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
			eNotify(new ENotificationImpl(this, Notification.UNSET, FmiModelPackage.CO_SIMULATION_TYPE__PROVIDES_PARTIAL_DERIVATIVES_OF_OUTPUT_FUNCTION_WRT_STATES, oldProvidesPartialDerivativesOfOutputFunctionWrtStates, PROVIDES_PARTIAL_DERIVATIVES_OF_OUTPUT_FUNCTION_WRT_STATES_EDEFAULT, oldProvidesPartialDerivativesOfOutputFunctionWrtStatesESet));
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
			case FmiModelPackage.CO_SIMULATION_TYPE__CAN_BE_INSTANTIATED_ONLY_ONCE_PER_PROCESS:
				return isCanBeInstantiatedOnlyOncePerProcess();
			case FmiModelPackage.CO_SIMULATION_TYPE__CAN_GET_AND_SET_FM_USTATE:
				return isCanGetAndSetFMUstate();
			case FmiModelPackage.CO_SIMULATION_TYPE__CAN_HANDLE_EVENTS:
				return isCanHandleEvents();
			case FmiModelPackage.CO_SIMULATION_TYPE__CAN_HANDLE_VARIABLE_COMMUNICATION_STEP_SIZE:
				return isCanHandleVariableCommunicationStepSize();
			case FmiModelPackage.CO_SIMULATION_TYPE__CAN_INTERPOLATE_INPUTS:
				return isCanInterpolateInputs();
			case FmiModelPackage.CO_SIMULATION_TYPE__CAN_NOT_USE_MEMORY_MANAGEMENT_FUNCTIONS:
				return isCanNotUseMemoryManagementFunctions();
			case FmiModelPackage.CO_SIMULATION_TYPE__CAN_RUN_ASYNCHRONUOUSLY:
				return isCanRunAsynchronuously();
			case FmiModelPackage.CO_SIMULATION_TYPE__CAN_SERIALIZE_FM_USTATE:
				return isCanSerializeFMUstate();
			case FmiModelPackage.CO_SIMULATION_TYPE__CAN_SIGNAL_EVENTS:
				return isCanSignalEvents();
			case FmiModelPackage.CO_SIMULATION_TYPE__MAX_OUTPUT_DERIVATIVE_ORDER:
				return getMaxOutputDerivativeOrder();
			case FmiModelPackage.CO_SIMULATION_TYPE__MODEL_IDENTIFIER:
				return getModelIdentifier();
			case FmiModelPackage.CO_SIMULATION_TYPE__NEEDS_EXECUTION_TOOL:
				return isNeedsExecutionTool();
			case FmiModelPackage.CO_SIMULATION_TYPE__PROVIDES_PARTIAL_DERIVATIVES_OF_DERIVATIVE_FUNCTION_WRT_INPUTS:
				return isProvidesPartialDerivativesOfDerivativeFunctionWrtInputs();
			case FmiModelPackage.CO_SIMULATION_TYPE__PROVIDES_PARTIAL_DERIVATIVES_OF_DERIVATIVE_FUNCTION_WRT_STATES:
				return isProvidesPartialDerivativesOfDerivativeFunctionWrtStates();
			case FmiModelPackage.CO_SIMULATION_TYPE__PROVIDES_PARTIAL_DERIVATIVES_OF_OUTPUT_FUNCTION_WRT_INPUTS:
				return isProvidesPartialDerivativesOfOutputFunctionWrtInputs();
			case FmiModelPackage.CO_SIMULATION_TYPE__PROVIDES_PARTIAL_DERIVATIVES_OF_OUTPUT_FUNCTION_WRT_STATES:
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
			case FmiModelPackage.CO_SIMULATION_TYPE__CAN_BE_INSTANTIATED_ONLY_ONCE_PER_PROCESS:
				setCanBeInstantiatedOnlyOncePerProcess((Boolean)newValue);
				return;
			case FmiModelPackage.CO_SIMULATION_TYPE__CAN_GET_AND_SET_FM_USTATE:
				setCanGetAndSetFMUstate((Boolean)newValue);
				return;
			case FmiModelPackage.CO_SIMULATION_TYPE__CAN_HANDLE_EVENTS:
				setCanHandleEvents((Boolean)newValue);
				return;
			case FmiModelPackage.CO_SIMULATION_TYPE__CAN_HANDLE_VARIABLE_COMMUNICATION_STEP_SIZE:
				setCanHandleVariableCommunicationStepSize((Boolean)newValue);
				return;
			case FmiModelPackage.CO_SIMULATION_TYPE__CAN_INTERPOLATE_INPUTS:
				setCanInterpolateInputs((Boolean)newValue);
				return;
			case FmiModelPackage.CO_SIMULATION_TYPE__CAN_NOT_USE_MEMORY_MANAGEMENT_FUNCTIONS:
				setCanNotUseMemoryManagementFunctions((Boolean)newValue);
				return;
			case FmiModelPackage.CO_SIMULATION_TYPE__CAN_RUN_ASYNCHRONUOUSLY:
				setCanRunAsynchronuously((Boolean)newValue);
				return;
			case FmiModelPackage.CO_SIMULATION_TYPE__CAN_SERIALIZE_FM_USTATE:
				setCanSerializeFMUstate((Boolean)newValue);
				return;
			case FmiModelPackage.CO_SIMULATION_TYPE__CAN_SIGNAL_EVENTS:
				setCanSignalEvents((Boolean)newValue);
				return;
			case FmiModelPackage.CO_SIMULATION_TYPE__MAX_OUTPUT_DERIVATIVE_ORDER:
				setMaxOutputDerivativeOrder((Long)newValue);
				return;
			case FmiModelPackage.CO_SIMULATION_TYPE__MODEL_IDENTIFIER:
				setModelIdentifier((String)newValue);
				return;
			case FmiModelPackage.CO_SIMULATION_TYPE__NEEDS_EXECUTION_TOOL:
				setNeedsExecutionTool((Boolean)newValue);
				return;
			case FmiModelPackage.CO_SIMULATION_TYPE__PROVIDES_PARTIAL_DERIVATIVES_OF_DERIVATIVE_FUNCTION_WRT_INPUTS:
				setProvidesPartialDerivativesOfDerivativeFunctionWrtInputs((Boolean)newValue);
				return;
			case FmiModelPackage.CO_SIMULATION_TYPE__PROVIDES_PARTIAL_DERIVATIVES_OF_DERIVATIVE_FUNCTION_WRT_STATES:
				setProvidesPartialDerivativesOfDerivativeFunctionWrtStates((Boolean)newValue);
				return;
			case FmiModelPackage.CO_SIMULATION_TYPE__PROVIDES_PARTIAL_DERIVATIVES_OF_OUTPUT_FUNCTION_WRT_INPUTS:
				setProvidesPartialDerivativesOfOutputFunctionWrtInputs((Boolean)newValue);
				return;
			case FmiModelPackage.CO_SIMULATION_TYPE__PROVIDES_PARTIAL_DERIVATIVES_OF_OUTPUT_FUNCTION_WRT_STATES:
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
			case FmiModelPackage.CO_SIMULATION_TYPE__CAN_BE_INSTANTIATED_ONLY_ONCE_PER_PROCESS:
				unsetCanBeInstantiatedOnlyOncePerProcess();
				return;
			case FmiModelPackage.CO_SIMULATION_TYPE__CAN_GET_AND_SET_FM_USTATE:
				unsetCanGetAndSetFMUstate();
				return;
			case FmiModelPackage.CO_SIMULATION_TYPE__CAN_HANDLE_EVENTS:
				unsetCanHandleEvents();
				return;
			case FmiModelPackage.CO_SIMULATION_TYPE__CAN_HANDLE_VARIABLE_COMMUNICATION_STEP_SIZE:
				unsetCanHandleVariableCommunicationStepSize();
				return;
			case FmiModelPackage.CO_SIMULATION_TYPE__CAN_INTERPOLATE_INPUTS:
				unsetCanInterpolateInputs();
				return;
			case FmiModelPackage.CO_SIMULATION_TYPE__CAN_NOT_USE_MEMORY_MANAGEMENT_FUNCTIONS:
				unsetCanNotUseMemoryManagementFunctions();
				return;
			case FmiModelPackage.CO_SIMULATION_TYPE__CAN_RUN_ASYNCHRONUOUSLY:
				unsetCanRunAsynchronuously();
				return;
			case FmiModelPackage.CO_SIMULATION_TYPE__CAN_SERIALIZE_FM_USTATE:
				unsetCanSerializeFMUstate();
				return;
			case FmiModelPackage.CO_SIMULATION_TYPE__CAN_SIGNAL_EVENTS:
				unsetCanSignalEvents();
				return;
			case FmiModelPackage.CO_SIMULATION_TYPE__MAX_OUTPUT_DERIVATIVE_ORDER:
				unsetMaxOutputDerivativeOrder();
				return;
			case FmiModelPackage.CO_SIMULATION_TYPE__MODEL_IDENTIFIER:
				setModelIdentifier(MODEL_IDENTIFIER_EDEFAULT);
				return;
			case FmiModelPackage.CO_SIMULATION_TYPE__NEEDS_EXECUTION_TOOL:
				unsetNeedsExecutionTool();
				return;
			case FmiModelPackage.CO_SIMULATION_TYPE__PROVIDES_PARTIAL_DERIVATIVES_OF_DERIVATIVE_FUNCTION_WRT_INPUTS:
				unsetProvidesPartialDerivativesOfDerivativeFunctionWrtInputs();
				return;
			case FmiModelPackage.CO_SIMULATION_TYPE__PROVIDES_PARTIAL_DERIVATIVES_OF_DERIVATIVE_FUNCTION_WRT_STATES:
				unsetProvidesPartialDerivativesOfDerivativeFunctionWrtStates();
				return;
			case FmiModelPackage.CO_SIMULATION_TYPE__PROVIDES_PARTIAL_DERIVATIVES_OF_OUTPUT_FUNCTION_WRT_INPUTS:
				unsetProvidesPartialDerivativesOfOutputFunctionWrtInputs();
				return;
			case FmiModelPackage.CO_SIMULATION_TYPE__PROVIDES_PARTIAL_DERIVATIVES_OF_OUTPUT_FUNCTION_WRT_STATES:
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
			case FmiModelPackage.CO_SIMULATION_TYPE__CAN_BE_INSTANTIATED_ONLY_ONCE_PER_PROCESS:
				return isSetCanBeInstantiatedOnlyOncePerProcess();
			case FmiModelPackage.CO_SIMULATION_TYPE__CAN_GET_AND_SET_FM_USTATE:
				return isSetCanGetAndSetFMUstate();
			case FmiModelPackage.CO_SIMULATION_TYPE__CAN_HANDLE_EVENTS:
				return isSetCanHandleEvents();
			case FmiModelPackage.CO_SIMULATION_TYPE__CAN_HANDLE_VARIABLE_COMMUNICATION_STEP_SIZE:
				return isSetCanHandleVariableCommunicationStepSize();
			case FmiModelPackage.CO_SIMULATION_TYPE__CAN_INTERPOLATE_INPUTS:
				return isSetCanInterpolateInputs();
			case FmiModelPackage.CO_SIMULATION_TYPE__CAN_NOT_USE_MEMORY_MANAGEMENT_FUNCTIONS:
				return isSetCanNotUseMemoryManagementFunctions();
			case FmiModelPackage.CO_SIMULATION_TYPE__CAN_RUN_ASYNCHRONUOUSLY:
				return isSetCanRunAsynchronuously();
			case FmiModelPackage.CO_SIMULATION_TYPE__CAN_SERIALIZE_FM_USTATE:
				return isSetCanSerializeFMUstate();
			case FmiModelPackage.CO_SIMULATION_TYPE__CAN_SIGNAL_EVENTS:
				return isSetCanSignalEvents();
			case FmiModelPackage.CO_SIMULATION_TYPE__MAX_OUTPUT_DERIVATIVE_ORDER:
				return isSetMaxOutputDerivativeOrder();
			case FmiModelPackage.CO_SIMULATION_TYPE__MODEL_IDENTIFIER:
				return MODEL_IDENTIFIER_EDEFAULT == null ? modelIdentifier != null : !MODEL_IDENTIFIER_EDEFAULT.equals(modelIdentifier);
			case FmiModelPackage.CO_SIMULATION_TYPE__NEEDS_EXECUTION_TOOL:
				return isSetNeedsExecutionTool();
			case FmiModelPackage.CO_SIMULATION_TYPE__PROVIDES_PARTIAL_DERIVATIVES_OF_DERIVATIVE_FUNCTION_WRT_INPUTS:
				return isSetProvidesPartialDerivativesOfDerivativeFunctionWrtInputs();
			case FmiModelPackage.CO_SIMULATION_TYPE__PROVIDES_PARTIAL_DERIVATIVES_OF_DERIVATIVE_FUNCTION_WRT_STATES:
				return isSetProvidesPartialDerivativesOfDerivativeFunctionWrtStates();
			case FmiModelPackage.CO_SIMULATION_TYPE__PROVIDES_PARTIAL_DERIVATIVES_OF_OUTPUT_FUNCTION_WRT_INPUTS:
				return isSetProvidesPartialDerivativesOfOutputFunctionWrtInputs();
			case FmiModelPackage.CO_SIMULATION_TYPE__PROVIDES_PARTIAL_DERIVATIVES_OF_OUTPUT_FUNCTION_WRT_STATES:
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
		result.append(", canHandleEvents: ");
		if (canHandleEventsESet) result.append(canHandleEvents); else result.append("<unset>");
		result.append(", canHandleVariableCommunicationStepSize: ");
		if (canHandleVariableCommunicationStepSizeESet) result.append(canHandleVariableCommunicationStepSize); else result.append("<unset>");
		result.append(", canInterpolateInputs: ");
		if (canInterpolateInputsESet) result.append(canInterpolateInputs); else result.append("<unset>");
		result.append(", canNotUseMemoryManagementFunctions: ");
		if (canNotUseMemoryManagementFunctionsESet) result.append(canNotUseMemoryManagementFunctions); else result.append("<unset>");
		result.append(", canRunAsynchronuously: ");
		if (canRunAsynchronuouslyESet) result.append(canRunAsynchronuously); else result.append("<unset>");
		result.append(", canSerializeFMUstate: ");
		if (canSerializeFMUstateESet) result.append(canSerializeFMUstate); else result.append("<unset>");
		result.append(", canSignalEvents: ");
		if (canSignalEventsESet) result.append(canSignalEvents); else result.append("<unset>");
		result.append(", maxOutputDerivativeOrder: ");
		if (maxOutputDerivativeOrderESet) result.append(maxOutputDerivativeOrder); else result.append("<unset>");
		result.append(", modelIdentifier: ");
		result.append(modelIdentifier);
		result.append(", needsExecutionTool: ");
		if (needsExecutionToolESet) result.append(needsExecutionTool); else result.append("<unset>");
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

} //CoSimulationTypeImpl
