/**
 */
package FmiModelDescriptionV1.provider;


import FmiModelDescriptionV1.FmiModelDescriptionType;
import FmiModelDescriptionV1.FmiModelDescriptionV1Factory;
import FmiModelDescriptionV1.FmiModelDescriptionV1Package;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EStructuralFeature;

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
 * This is the item provider adapter for a {@link FmiModelDescriptionV1.FmiModelDescriptionType} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class FmiModelDescriptionTypeItemProvider
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
	public FmiModelDescriptionTypeItemProvider(AdapterFactory adapterFactory) {
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

			addAuthorPropertyDescriptor(object);
			addDescriptionPropertyDescriptor(object);
			addFmiVersionPropertyDescriptor(object);
			addGenerationDateAndTimePropertyDescriptor(object);
			addGenerationToolPropertyDescriptor(object);
			addGuidPropertyDescriptor(object);
			addModelIdentifierPropertyDescriptor(object);
			addModelNamePropertyDescriptor(object);
			addNumberOfContinuousStatesPropertyDescriptor(object);
			addNumberOfEventIndicatorsPropertyDescriptor(object);
			addVariableNamingConventionPropertyDescriptor(object);
			addVersionPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Author feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addAuthorPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_FmiModelDescriptionType_author_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_FmiModelDescriptionType_author_feature", "_UI_FmiModelDescriptionType_type"),
				 FmiModelDescriptionV1Package.Literals.FMI_MODEL_DESCRIPTION_TYPE__AUTHOR,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Description feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDescriptionPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_FmiModelDescriptionType_description_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_FmiModelDescriptionType_description_feature", "_UI_FmiModelDescriptionType_type"),
				 FmiModelDescriptionV1Package.Literals.FMI_MODEL_DESCRIPTION_TYPE__DESCRIPTION,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Fmi Version feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addFmiVersionPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_FmiModelDescriptionType_fmiVersion_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_FmiModelDescriptionType_fmiVersion_feature", "_UI_FmiModelDescriptionType_type"),
				 FmiModelDescriptionV1Package.Literals.FMI_MODEL_DESCRIPTION_TYPE__FMI_VERSION,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Generation Date And Time feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addGenerationDateAndTimePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_FmiModelDescriptionType_generationDateAndTime_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_FmiModelDescriptionType_generationDateAndTime_feature", "_UI_FmiModelDescriptionType_type"),
				 FmiModelDescriptionV1Package.Literals.FMI_MODEL_DESCRIPTION_TYPE__GENERATION_DATE_AND_TIME,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Generation Tool feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addGenerationToolPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_FmiModelDescriptionType_generationTool_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_FmiModelDescriptionType_generationTool_feature", "_UI_FmiModelDescriptionType_type"),
				 FmiModelDescriptionV1Package.Literals.FMI_MODEL_DESCRIPTION_TYPE__GENERATION_TOOL,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Guid feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addGuidPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_FmiModelDescriptionType_guid_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_FmiModelDescriptionType_guid_feature", "_UI_FmiModelDescriptionType_type"),
				 FmiModelDescriptionV1Package.Literals.FMI_MODEL_DESCRIPTION_TYPE__GUID,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
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
				 getString("_UI_FmiModelDescriptionType_modelIdentifier_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_FmiModelDescriptionType_modelIdentifier_feature", "_UI_FmiModelDescriptionType_type"),
				 FmiModelDescriptionV1Package.Literals.FMI_MODEL_DESCRIPTION_TYPE__MODEL_IDENTIFIER,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Model Name feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addModelNamePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_FmiModelDescriptionType_modelName_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_FmiModelDescriptionType_modelName_feature", "_UI_FmiModelDescriptionType_type"),
				 FmiModelDescriptionV1Package.Literals.FMI_MODEL_DESCRIPTION_TYPE__MODEL_NAME,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Number Of Continuous States feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addNumberOfContinuousStatesPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_FmiModelDescriptionType_numberOfContinuousStates_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_FmiModelDescriptionType_numberOfContinuousStates_feature", "_UI_FmiModelDescriptionType_type"),
				 FmiModelDescriptionV1Package.Literals.FMI_MODEL_DESCRIPTION_TYPE__NUMBER_OF_CONTINUOUS_STATES,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Number Of Event Indicators feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addNumberOfEventIndicatorsPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_FmiModelDescriptionType_numberOfEventIndicators_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_FmiModelDescriptionType_numberOfEventIndicators_feature", "_UI_FmiModelDescriptionType_type"),
				 FmiModelDescriptionV1Package.Literals.FMI_MODEL_DESCRIPTION_TYPE__NUMBER_OF_EVENT_INDICATORS,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Variable Naming Convention feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addVariableNamingConventionPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_FmiModelDescriptionType_variableNamingConvention_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_FmiModelDescriptionType_variableNamingConvention_feature", "_UI_FmiModelDescriptionType_type"),
				 FmiModelDescriptionV1Package.Literals.FMI_MODEL_DESCRIPTION_TYPE__VARIABLE_NAMING_CONVENTION,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Version feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addVersionPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_FmiModelDescriptionType_version_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_FmiModelDescriptionType_version_feature", "_UI_FmiModelDescriptionType_type"),
				 FmiModelDescriptionV1Package.Literals.FMI_MODEL_DESCRIPTION_TYPE__VERSION,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This specifies how to implement {@link #getChildren} and is used to deduce an appropriate feature for an
	 * {@link org.eclipse.emf.edit.command.AddCommand}, {@link org.eclipse.emf.edit.command.RemoveCommand} or
	 * {@link org.eclipse.emf.edit.command.MoveCommand} in {@link #createCommand}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Collection<? extends EStructuralFeature> getChildrenFeatures(Object object) {
		if (childrenFeatures == null) {
			super.getChildrenFeatures(object);
			childrenFeatures.add(FmiModelDescriptionV1Package.Literals.FMI_MODEL_DESCRIPTION_TYPE__UNIT_DEFINITIONS);
			childrenFeatures.add(FmiModelDescriptionV1Package.Literals.FMI_MODEL_DESCRIPTION_TYPE__TYPE_DEFINITIONS);
			childrenFeatures.add(FmiModelDescriptionV1Package.Literals.FMI_MODEL_DESCRIPTION_TYPE__DEFAULT_EXPERIMENT);
			childrenFeatures.add(FmiModelDescriptionV1Package.Literals.FMI_MODEL_DESCRIPTION_TYPE__VENDOR_ANNOTATIONS);
			childrenFeatures.add(FmiModelDescriptionV1Package.Literals.FMI_MODEL_DESCRIPTION_TYPE__MODEL_VARIABLES);
			childrenFeatures.add(FmiModelDescriptionV1Package.Literals.FMI_MODEL_DESCRIPTION_TYPE__IMPLEMENTATION);
		}
		return childrenFeatures;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EStructuralFeature getChildFeature(Object object, Object child) {
		// Check the type of the specified child object and return the proper feature to use for
		// adding (see {@link AddCommand}) it as a child.

		return super.getChildFeature(object, child);
	}

	/**
	 * This returns FmiModelDescriptionType.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/FmiModelDescriptionType"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((FmiModelDescriptionType)object).getModelName();
		return label == null || label.length() == 0 ?
			getString("_UI_FmiModelDescriptionType_type") :
			getString("_UI_FmiModelDescriptionType_type") + " " + label;
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

		switch (notification.getFeatureID(FmiModelDescriptionType.class)) {
			case FmiModelDescriptionV1Package.FMI_MODEL_DESCRIPTION_TYPE__AUTHOR:
			case FmiModelDescriptionV1Package.FMI_MODEL_DESCRIPTION_TYPE__DESCRIPTION:
			case FmiModelDescriptionV1Package.FMI_MODEL_DESCRIPTION_TYPE__FMI_VERSION:
			case FmiModelDescriptionV1Package.FMI_MODEL_DESCRIPTION_TYPE__GENERATION_DATE_AND_TIME:
			case FmiModelDescriptionV1Package.FMI_MODEL_DESCRIPTION_TYPE__GENERATION_TOOL:
			case FmiModelDescriptionV1Package.FMI_MODEL_DESCRIPTION_TYPE__GUID:
			case FmiModelDescriptionV1Package.FMI_MODEL_DESCRIPTION_TYPE__MODEL_IDENTIFIER:
			case FmiModelDescriptionV1Package.FMI_MODEL_DESCRIPTION_TYPE__MODEL_NAME:
			case FmiModelDescriptionV1Package.FMI_MODEL_DESCRIPTION_TYPE__NUMBER_OF_CONTINUOUS_STATES:
			case FmiModelDescriptionV1Package.FMI_MODEL_DESCRIPTION_TYPE__NUMBER_OF_EVENT_INDICATORS:
			case FmiModelDescriptionV1Package.FMI_MODEL_DESCRIPTION_TYPE__VARIABLE_NAMING_CONVENTION:
			case FmiModelDescriptionV1Package.FMI_MODEL_DESCRIPTION_TYPE__VERSION:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case FmiModelDescriptionV1Package.FMI_MODEL_DESCRIPTION_TYPE__UNIT_DEFINITIONS:
			case FmiModelDescriptionV1Package.FMI_MODEL_DESCRIPTION_TYPE__TYPE_DEFINITIONS:
			case FmiModelDescriptionV1Package.FMI_MODEL_DESCRIPTION_TYPE__DEFAULT_EXPERIMENT:
			case FmiModelDescriptionV1Package.FMI_MODEL_DESCRIPTION_TYPE__VENDOR_ANNOTATIONS:
			case FmiModelDescriptionV1Package.FMI_MODEL_DESCRIPTION_TYPE__MODEL_VARIABLES:
			case FmiModelDescriptionV1Package.FMI_MODEL_DESCRIPTION_TYPE__IMPLEMENTATION:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), true, false));
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

		newChildDescriptors.add
			(createChildParameter
				(FmiModelDescriptionV1Package.Literals.FMI_MODEL_DESCRIPTION_TYPE__UNIT_DEFINITIONS,
				 FmiModelDescriptionV1Factory.eINSTANCE.createUnitDefinitionsType()));

		newChildDescriptors.add
			(createChildParameter
				(FmiModelDescriptionV1Package.Literals.FMI_MODEL_DESCRIPTION_TYPE__TYPE_DEFINITIONS,
				 FmiModelDescriptionV1Factory.eINSTANCE.createTypeDefinitionsType()));

		newChildDescriptors.add
			(createChildParameter
				(FmiModelDescriptionV1Package.Literals.FMI_MODEL_DESCRIPTION_TYPE__DEFAULT_EXPERIMENT,
				 FmiModelDescriptionV1Factory.eINSTANCE.createDefaultExperimentType()));

		newChildDescriptors.add
			(createChildParameter
				(FmiModelDescriptionV1Package.Literals.FMI_MODEL_DESCRIPTION_TYPE__VENDOR_ANNOTATIONS,
				 FmiModelDescriptionV1Factory.eINSTANCE.createVendorAnnotationsType()));

		newChildDescriptors.add
			(createChildParameter
				(FmiModelDescriptionV1Package.Literals.FMI_MODEL_DESCRIPTION_TYPE__MODEL_VARIABLES,
				 FmiModelDescriptionV1Factory.eINSTANCE.createModelVariablesType()));

		newChildDescriptors.add
			(createChildParameter
				(FmiModelDescriptionV1Package.Literals.FMI_MODEL_DESCRIPTION_TYPE__IMPLEMENTATION,
				 FmiModelDescriptionV1Factory.eINSTANCE.createCoSimulation_StandAlone()));

		newChildDescriptors.add
			(createChildParameter
				(FmiModelDescriptionV1Package.Literals.FMI_MODEL_DESCRIPTION_TYPE__IMPLEMENTATION,
				 FmiModelDescriptionV1Factory.eINSTANCE.createCoSimulation_Tool()));
	}

	/**
	 * Return the resource locator for this item provider's resources.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		return FmiModelDescriptionV1EditPlugin.INSTANCE;
	}

}
