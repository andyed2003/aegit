/**
 */
package FmiModel.provider;


import FmiModel.FmiModelPackage;
import FmiModel.ModelExchangeType;

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

/**
 * This is the item provider adapter for a {@link FmiModel.ModelExchangeType} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class ModelExchangeTypeItemProvider
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
	public ModelExchangeTypeItemProvider(AdapterFactory adapterFactory) {
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
			addCanNotUseMemoryManagementFunctionsPropertyDescriptor(object);
			addCanSerializeFMUstatePropertyDescriptor(object);
			addCompletedIntegratorStepNotNeededPropertyDescriptor(object);
			addModelIdentifierPropertyDescriptor(object);
			addNeedsExecutionToolPropertyDescriptor(object);
			addProvidesDirectionalDerivativesPropertyDescriptor(object);
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
				 getString("_UI_ModelExchangeType_canBeInstantiatedOnlyOncePerProcess_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ModelExchangeType_canBeInstantiatedOnlyOncePerProcess_feature", "_UI_ModelExchangeType_type"),
				 FmiModelPackage.Literals.MODEL_EXCHANGE_TYPE__CAN_BE_INSTANTIATED_ONLY_ONCE_PER_PROCESS,
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
				 getString("_UI_ModelExchangeType_canGetAndSetFMUstate_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ModelExchangeType_canGetAndSetFMUstate_feature", "_UI_ModelExchangeType_type"),
				 FmiModelPackage.Literals.MODEL_EXCHANGE_TYPE__CAN_GET_AND_SET_FM_USTATE,
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
				 getString("_UI_ModelExchangeType_canNotUseMemoryManagementFunctions_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ModelExchangeType_canNotUseMemoryManagementFunctions_feature", "_UI_ModelExchangeType_type"),
				 FmiModelPackage.Literals.MODEL_EXCHANGE_TYPE__CAN_NOT_USE_MEMORY_MANAGEMENT_FUNCTIONS,
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
				 getString("_UI_ModelExchangeType_canSerializeFMUstate_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ModelExchangeType_canSerializeFMUstate_feature", "_UI_ModelExchangeType_type"),
				 FmiModelPackage.Literals.MODEL_EXCHANGE_TYPE__CAN_SERIALIZE_FM_USTATE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Completed Integrator Step Not Needed feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addCompletedIntegratorStepNotNeededPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ModelExchangeType_completedIntegratorStepNotNeeded_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ModelExchangeType_completedIntegratorStepNotNeeded_feature", "_UI_ModelExchangeType_type"),
				 FmiModelPackage.Literals.MODEL_EXCHANGE_TYPE__COMPLETED_INTEGRATOR_STEP_NOT_NEEDED,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
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
				 getString("_UI_ModelExchangeType_modelIdentifier_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ModelExchangeType_modelIdentifier_feature", "_UI_ModelExchangeType_type"),
				 FmiModelPackage.Literals.MODEL_EXCHANGE_TYPE__MODEL_IDENTIFIER,
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
				 getString("_UI_ModelExchangeType_needsExecutionTool_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ModelExchangeType_needsExecutionTool_feature", "_UI_ModelExchangeType_type"),
				 FmiModelPackage.Literals.MODEL_EXCHANGE_TYPE__NEEDS_EXECUTION_TOOL,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Provides Directional Derivatives feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addProvidesDirectionalDerivativesPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ModelExchangeType_providesDirectionalDerivatives_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ModelExchangeType_providesDirectionalDerivatives_feature", "_UI_ModelExchangeType_type"),
				 FmiModelPackage.Literals.MODEL_EXCHANGE_TYPE__PROVIDES_DIRECTIONAL_DERIVATIVES,
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
				 getString("_UI_ModelExchangeType_providesPartialDerivativesOfDerivativeFunctionWrtInputs_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ModelExchangeType_providesPartialDerivativesOfDerivativeFunctionWrtInputs_feature", "_UI_ModelExchangeType_type"),
				 FmiModelPackage.Literals.MODEL_EXCHANGE_TYPE__PROVIDES_PARTIAL_DERIVATIVES_OF_DERIVATIVE_FUNCTION_WRT_INPUTS,
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
				 getString("_UI_ModelExchangeType_providesPartialDerivativesOfDerivativeFunctionWrtStates_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ModelExchangeType_providesPartialDerivativesOfDerivativeFunctionWrtStates_feature", "_UI_ModelExchangeType_type"),
				 FmiModelPackage.Literals.MODEL_EXCHANGE_TYPE__PROVIDES_PARTIAL_DERIVATIVES_OF_DERIVATIVE_FUNCTION_WRT_STATES,
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
				 getString("_UI_ModelExchangeType_providesPartialDerivativesOfOutputFunctionWrtInputs_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ModelExchangeType_providesPartialDerivativesOfOutputFunctionWrtInputs_feature", "_UI_ModelExchangeType_type"),
				 FmiModelPackage.Literals.MODEL_EXCHANGE_TYPE__PROVIDES_PARTIAL_DERIVATIVES_OF_OUTPUT_FUNCTION_WRT_INPUTS,
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
				 getString("_UI_ModelExchangeType_providesPartialDerivativesOfOutputFunctionWrtStates_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ModelExchangeType_providesPartialDerivativesOfOutputFunctionWrtStates_feature", "_UI_ModelExchangeType_type"),
				 FmiModelPackage.Literals.MODEL_EXCHANGE_TYPE__PROVIDES_PARTIAL_DERIVATIVES_OF_OUTPUT_FUNCTION_WRT_STATES,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This returns ModelExchangeType.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/ModelExchangeType"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		ModelExchangeType modelExchangeType = (ModelExchangeType)object;
		return getString("_UI_ModelExchangeType_type") + " " + modelExchangeType.isCanBeInstantiatedOnlyOncePerProcess();
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

		switch (notification.getFeatureID(ModelExchangeType.class)) {
			case FmiModelPackage.MODEL_EXCHANGE_TYPE__CAN_BE_INSTANTIATED_ONLY_ONCE_PER_PROCESS:
			case FmiModelPackage.MODEL_EXCHANGE_TYPE__CAN_GET_AND_SET_FM_USTATE:
			case FmiModelPackage.MODEL_EXCHANGE_TYPE__CAN_NOT_USE_MEMORY_MANAGEMENT_FUNCTIONS:
			case FmiModelPackage.MODEL_EXCHANGE_TYPE__CAN_SERIALIZE_FM_USTATE:
			case FmiModelPackage.MODEL_EXCHANGE_TYPE__COMPLETED_INTEGRATOR_STEP_NOT_NEEDED:
			case FmiModelPackage.MODEL_EXCHANGE_TYPE__MODEL_IDENTIFIER:
			case FmiModelPackage.MODEL_EXCHANGE_TYPE__NEEDS_EXECUTION_TOOL:
			case FmiModelPackage.MODEL_EXCHANGE_TYPE__PROVIDES_DIRECTIONAL_DERIVATIVES:
			case FmiModelPackage.MODEL_EXCHANGE_TYPE__PROVIDES_PARTIAL_DERIVATIVES_OF_DERIVATIVE_FUNCTION_WRT_INPUTS:
			case FmiModelPackage.MODEL_EXCHANGE_TYPE__PROVIDES_PARTIAL_DERIVATIVES_OF_DERIVATIVE_FUNCTION_WRT_STATES:
			case FmiModelPackage.MODEL_EXCHANGE_TYPE__PROVIDES_PARTIAL_DERIVATIVES_OF_OUTPUT_FUNCTION_WRT_INPUTS:
			case FmiModelPackage.MODEL_EXCHANGE_TYPE__PROVIDES_PARTIAL_DERIVATIVES_OF_OUTPUT_FUNCTION_WRT_STATES:
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
