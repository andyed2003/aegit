/**
 */
package FmiModel.provider;


import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.ResourceLocator;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemProviderAdapter;
import org.eclipse.emf.edit.provider.ViewerNotification;

import FmiModel.CoSimulationType;
import FmiModel.FmiModelPackage;

/**
 * This is the item provider adapter for a {@link FmiModel.CoSimulationType} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class CoSimulationTypeItemProvider
	extends ItemProviderAdapter
	implements
		IEditingDomainItemProvider,
		IStructuredItemContentProvider,
		ITreeItemContentProvider,
		IItemLabelProvider,
		IItemPropertySource {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CoSimulationTypeItemProvider(AdapterFactory adapterFactory) {
		super(adapterFactory);
	}

	/**
	 * This returns the property descriptors for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<IItemPropertyDescriptor> getPropertyDescriptors(Object object) {
		if (itemPropertyDescriptors == null) {
			super.getPropertyDescriptors(object);

			addCanBeInstantiatedOnlyOncePerProcessPropertyDescriptor(object);
			addCanGetAndSetFMUstatePropertyDescriptor(object);
			addCanHandleEventsPropertyDescriptor(object);
			addCanHandleVariableCommunicationStepSizePropertyDescriptor(object);
			addCanInterpolateInputsPropertyDescriptor(object);
			addCanNotUseMemoryManagementFunctionsPropertyDescriptor(object);
			addCanRunAsynchronuouslyPropertyDescriptor(object);
			addCanSerializeFMUstatePropertyDescriptor(object);
			addCanSignalEventsPropertyDescriptor(object);
			addMaxOutputDerivativeOrderPropertyDescriptor(object);
			addModelIdentifierPropertyDescriptor(object);
			addNeedsExecutionToolPropertyDescriptor(object);
			addProvidesPartialDerivativesOfDerivativeFunctionWrtInputsPropertyDescriptor(object);
			addProvidesPartialDerivativesOfDerivativeFunctionWrtStatesPropertyDescriptor(object);
			addProvidesPartialDerivativesOfOutputFunctionWrtInputsPropertyDescriptor(object);
			addProvidesPartialDerivativesOfOutputFunctionWrtStatesPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Can Be Instantiated Only Once Per Process feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addCanBeInstantiatedOnlyOncePerProcessPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_CoSimulationType_canBeInstantiatedOnlyOncePerProcess_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_CoSimulationType_canBeInstantiatedOnlyOncePerProcess_feature", "_UI_CoSimulationType_type"),
				 FmiModelPackage.Literals.CO_SIMULATION_TYPE__CAN_BE_INSTANTIATED_ONLY_ONCE_PER_PROCESS,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Can Get And Set FM Ustate feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addCanGetAndSetFMUstatePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_CoSimulationType_canGetAndSetFMUstate_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_CoSimulationType_canGetAndSetFMUstate_feature", "_UI_CoSimulationType_type"),
				 FmiModelPackage.Literals.CO_SIMULATION_TYPE__CAN_GET_AND_SET_FM_USTATE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Can Handle Events feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addCanHandleEventsPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_CoSimulationType_canHandleEvents_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_CoSimulationType_canHandleEvents_feature", "_UI_CoSimulationType_type"),
				 FmiModelPackage.Literals.CO_SIMULATION_TYPE__CAN_HANDLE_EVENTS,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Can Handle Variable Communication Step Size feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addCanHandleVariableCommunicationStepSizePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_CoSimulationType_canHandleVariableCommunicationStepSize_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_CoSimulationType_canHandleVariableCommunicationStepSize_feature", "_UI_CoSimulationType_type"),
				 FmiModelPackage.Literals.CO_SIMULATION_TYPE__CAN_HANDLE_VARIABLE_COMMUNICATION_STEP_SIZE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Can Interpolate Inputs feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addCanInterpolateInputsPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_CoSimulationType_canInterpolateInputs_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_CoSimulationType_canInterpolateInputs_feature", "_UI_CoSimulationType_type"),
				 FmiModelPackage.Literals.CO_SIMULATION_TYPE__CAN_INTERPOLATE_INPUTS,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Can Not Use Memory Management Functions feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addCanNotUseMemoryManagementFunctionsPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_CoSimulationType_canNotUseMemoryManagementFunctions_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_CoSimulationType_canNotUseMemoryManagementFunctions_feature", "_UI_CoSimulationType_type"),
				 FmiModelPackage.Literals.CO_SIMULATION_TYPE__CAN_NOT_USE_MEMORY_MANAGEMENT_FUNCTIONS,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Can Run Asynchronuously feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addCanRunAsynchronuouslyPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_CoSimulationType_canRunAsynchronuously_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_CoSimulationType_canRunAsynchronuously_feature", "_UI_CoSimulationType_type"),
				 FmiModelPackage.Literals.CO_SIMULATION_TYPE__CAN_RUN_ASYNCHRONUOUSLY,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Can Serialize FM Ustate feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addCanSerializeFMUstatePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_CoSimulationType_canSerializeFMUstate_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_CoSimulationType_canSerializeFMUstate_feature", "_UI_CoSimulationType_type"),
				 FmiModelPackage.Literals.CO_SIMULATION_TYPE__CAN_SERIALIZE_FM_USTATE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Can Signal Events feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addCanSignalEventsPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_CoSimulationType_canSignalEvents_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_CoSimulationType_canSignalEvents_feature", "_UI_CoSimulationType_type"),
				 FmiModelPackage.Literals.CO_SIMULATION_TYPE__CAN_SIGNAL_EVENTS,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Max Output Derivative Order feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addMaxOutputDerivativeOrderPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_CoSimulationType_maxOutputDerivativeOrder_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_CoSimulationType_maxOutputDerivativeOrder_feature", "_UI_CoSimulationType_type"),
				 FmiModelPackage.Literals.CO_SIMULATION_TYPE__MAX_OUTPUT_DERIVATIVE_ORDER,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Model Identifier feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addModelIdentifierPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_CoSimulationType_modelIdentifier_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_CoSimulationType_modelIdentifier_feature", "_UI_CoSimulationType_type"),
				 FmiModelPackage.Literals.CO_SIMULATION_TYPE__MODEL_IDENTIFIER,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Needs Execution Tool feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addNeedsExecutionToolPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_CoSimulationType_needsExecutionTool_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_CoSimulationType_needsExecutionTool_feature", "_UI_CoSimulationType_type"),
				 FmiModelPackage.Literals.CO_SIMULATION_TYPE__NEEDS_EXECUTION_TOOL,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Provides Partial Derivatives Of Derivative Function Wrt Inputs feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addProvidesPartialDerivativesOfDerivativeFunctionWrtInputsPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_CoSimulationType_providesPartialDerivativesOfDerivativeFunctionWrtInputs_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_CoSimulationType_providesPartialDerivativesOfDerivativeFunctionWrtInputs_feature", "_UI_CoSimulationType_type"),
				 FmiModelPackage.Literals.CO_SIMULATION_TYPE__PROVIDES_PARTIAL_DERIVATIVES_OF_DERIVATIVE_FUNCTION_WRT_INPUTS,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Provides Partial Derivatives Of Derivative Function Wrt States feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addProvidesPartialDerivativesOfDerivativeFunctionWrtStatesPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_CoSimulationType_providesPartialDerivativesOfDerivativeFunctionWrtStates_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_CoSimulationType_providesPartialDerivativesOfDerivativeFunctionWrtStates_feature", "_UI_CoSimulationType_type"),
				 FmiModelPackage.Literals.CO_SIMULATION_TYPE__PROVIDES_PARTIAL_DERIVATIVES_OF_DERIVATIVE_FUNCTION_WRT_STATES,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Provides Partial Derivatives Of Output Function Wrt Inputs feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addProvidesPartialDerivativesOfOutputFunctionWrtInputsPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_CoSimulationType_providesPartialDerivativesOfOutputFunctionWrtInputs_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_CoSimulationType_providesPartialDerivativesOfOutputFunctionWrtInputs_feature", "_UI_CoSimulationType_type"),
				 FmiModelPackage.Literals.CO_SIMULATION_TYPE__PROVIDES_PARTIAL_DERIVATIVES_OF_OUTPUT_FUNCTION_WRT_INPUTS,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Provides Partial Derivatives Of Output Function Wrt States feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addProvidesPartialDerivativesOfOutputFunctionWrtStatesPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_CoSimulationType_providesPartialDerivativesOfOutputFunctionWrtStates_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_CoSimulationType_providesPartialDerivativesOfOutputFunctionWrtStates_feature", "_UI_CoSimulationType_type"),
				 FmiModelPackage.Literals.CO_SIMULATION_TYPE__PROVIDES_PARTIAL_DERIVATIVES_OF_OUTPUT_FUNCTION_WRT_STATES,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This returns CoSimulationType.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/CoSimulationType"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		CoSimulationType coSimulationType = (CoSimulationType)object;
		return getString("_UI_CoSimulationType_type") + " " + coSimulationType.isCanBeInstantiatedOnlyOncePerProcess();
	}

	/**
	 * This handles model notifications by calling {@link #updateChildren} to update any cached
	 * children and by creating a viewer notification, which it passes to {@link #fireNotifyChanged}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void notifyChanged(Notification notification) {
		updateChildren(notification);

		switch (notification.getFeatureID(CoSimulationType.class)) {
			case FmiModelPackage.CO_SIMULATION_TYPE__CAN_BE_INSTANTIATED_ONLY_ONCE_PER_PROCESS:
			case FmiModelPackage.CO_SIMULATION_TYPE__CAN_GET_AND_SET_FM_USTATE:
			case FmiModelPackage.CO_SIMULATION_TYPE__CAN_HANDLE_EVENTS:
			case FmiModelPackage.CO_SIMULATION_TYPE__CAN_HANDLE_VARIABLE_COMMUNICATION_STEP_SIZE:
			case FmiModelPackage.CO_SIMULATION_TYPE__CAN_INTERPOLATE_INPUTS:
			case FmiModelPackage.CO_SIMULATION_TYPE__CAN_NOT_USE_MEMORY_MANAGEMENT_FUNCTIONS:
			case FmiModelPackage.CO_SIMULATION_TYPE__CAN_RUN_ASYNCHRONUOUSLY:
			case FmiModelPackage.CO_SIMULATION_TYPE__CAN_SERIALIZE_FM_USTATE:
			case FmiModelPackage.CO_SIMULATION_TYPE__CAN_SIGNAL_EVENTS:
			case FmiModelPackage.CO_SIMULATION_TYPE__MAX_OUTPUT_DERIVATIVE_ORDER:
			case FmiModelPackage.CO_SIMULATION_TYPE__MODEL_IDENTIFIER:
			case FmiModelPackage.CO_SIMULATION_TYPE__NEEDS_EXECUTION_TOOL:
			case FmiModelPackage.CO_SIMULATION_TYPE__PROVIDES_PARTIAL_DERIVATIVES_OF_DERIVATIVE_FUNCTION_WRT_INPUTS:
			case FmiModelPackage.CO_SIMULATION_TYPE__PROVIDES_PARTIAL_DERIVATIVES_OF_DERIVATIVE_FUNCTION_WRT_STATES:
			case FmiModelPackage.CO_SIMULATION_TYPE__PROVIDES_PARTIAL_DERIVATIVES_OF_OUTPUT_FUNCTION_WRT_INPUTS:
			case FmiModelPackage.CO_SIMULATION_TYPE__PROVIDES_PARTIAL_DERIVATIVES_OF_OUTPUT_FUNCTION_WRT_STATES:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
		}
		super.notifyChanged(notification);
	}

	/**
	 * This adds {@link org.eclipse.emf.edit.command.CommandParameter}s describing the children
	 * that can be created under this object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected void collectNewChildDescriptors(Collection<Object> newChildDescriptors, Object object) {
		super.collectNewChildDescriptors(newChildDescriptors, object);
	}

	/**
	 * Return the resource locator for this item provider's resources.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		return FmiMetamodelDescriptionEditPlugin.INSTANCE;
	}

}
