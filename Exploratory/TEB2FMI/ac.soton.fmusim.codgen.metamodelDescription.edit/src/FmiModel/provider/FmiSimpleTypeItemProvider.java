/**
 */
package FmiModel.provider;


import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.ResourceLocator;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.xml.type.XMLTypeFactory;
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

import FmiModel.FmiModelFactory;
import FmiModel.FmiModelPackage;
import FmiModel.FmiSimpleType;

/**
 * This is the item provider adapter for a {@link FmiModel.FmiSimpleType} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class FmiSimpleTypeItemProvider
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
	public FmiSimpleTypeItemProvider(AdapterFactory adapterFactory) {
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

			addDescriptionPropertyDescriptor(object);
			addNamePropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
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
				 getString("_UI_FmiSimpleType_description_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_FmiSimpleType_description_feature", "_UI_FmiSimpleType_type"),
				 FmiModelPackage.Literals.FMI_SIMPLE_TYPE__DESCRIPTION,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Name feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addNamePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_FmiSimpleType_name_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_FmiSimpleType_name_feature", "_UI_FmiSimpleType_type"),
				 FmiModelPackage.Literals.FMI_SIMPLE_TYPE__NAME,
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
			childrenFeatures.add(FmiModelPackage.Literals.FMI_SIMPLE_TYPE__REAL);
			childrenFeatures.add(FmiModelPackage.Literals.FMI_SIMPLE_TYPE__INTEGER);
			childrenFeatures.add(FmiModelPackage.Literals.FMI_SIMPLE_TYPE__BOOLEAN);
			childrenFeatures.add(FmiModelPackage.Literals.FMI_SIMPLE_TYPE__STRING);
			childrenFeatures.add(FmiModelPackage.Literals.FMI_SIMPLE_TYPE__ENUMERATION);
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
	 * This returns FmiSimpleType.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/FmiSimpleType"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((FmiSimpleType)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_FmiSimpleType_type") :
			getString("_UI_FmiSimpleType_type") + " " + label;
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

		switch (notification.getFeatureID(FmiSimpleType.class)) {
			case FmiModelPackage.FMI_SIMPLE_TYPE__DESCRIPTION:
			case FmiModelPackage.FMI_SIMPLE_TYPE__NAME:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case FmiModelPackage.FMI_SIMPLE_TYPE__REAL:
			case FmiModelPackage.FMI_SIMPLE_TYPE__INTEGER:
			case FmiModelPackage.FMI_SIMPLE_TYPE__BOOLEAN:
			case FmiModelPackage.FMI_SIMPLE_TYPE__STRING:
			case FmiModelPackage.FMI_SIMPLE_TYPE__ENUMERATION:
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
				(FmiModelPackage.Literals.FMI_SIMPLE_TYPE__REAL,
				 FmiModelFactory.eINSTANCE.createRealType()));

		newChildDescriptors.add
			(createChildParameter
				(FmiModelPackage.Literals.FMI_SIMPLE_TYPE__INTEGER,
				 FmiModelFactory.eINSTANCE.createIntegerType1()));

		newChildDescriptors.add
			(createChildParameter
				(FmiModelPackage.Literals.FMI_SIMPLE_TYPE__BOOLEAN,
				 FmiModelFactory.eINSTANCE.createFmiVariableDependency()));

		newChildDescriptors.add
			(createChildParameter
				(FmiModelPackage.Literals.FMI_SIMPLE_TYPE__BOOLEAN,
				 FmiModelFactory.eINSTANCE.createFmiAnnotation()));

		newChildDescriptors.add
			(createChildParameter
				(FmiModelPackage.Literals.FMI_SIMPLE_TYPE__BOOLEAN,
				 FmiModelFactory.eINSTANCE.createFmiScalarVariable()));

		newChildDescriptors.add
			(createChildParameter
				(FmiModelPackage.Literals.FMI_SIMPLE_TYPE__BOOLEAN,
				 FmiModelFactory.eINSTANCE.createFmiSimpleType()));

		newChildDescriptors.add
			(createChildParameter
				(FmiModelPackage.Literals.FMI_SIMPLE_TYPE__BOOLEAN,
				 FmiModelFactory.eINSTANCE.createFmiUnit()));

		newChildDescriptors.add
			(createChildParameter
				(FmiModelPackage.Literals.FMI_SIMPLE_TYPE__BOOLEAN,
				 FmiModelFactory.eINSTANCE.createFmiCoSimulationCapabilitiesType()));

		newChildDescriptors.add
			(createChildParameter
				(FmiModelPackage.Literals.FMI_SIMPLE_TYPE__BOOLEAN,
				 FmiModelFactory.eINSTANCE.createCoSimulation_StandAlone()));

		newChildDescriptors.add
			(createChildParameter
				(FmiModelPackage.Literals.FMI_SIMPLE_TYPE__BOOLEAN,
				 FmiModelFactory.eINSTANCE.createCoSimulation_Tool()));

		newChildDescriptors.add
			(createChildParameter
				(FmiModelPackage.Literals.FMI_SIMPLE_TYPE__BOOLEAN,
				 XMLTypeFactory.eINSTANCE.createAnyType()));

		newChildDescriptors.add
			(createChildParameter
				(FmiModelPackage.Literals.FMI_SIMPLE_TYPE__STRING,
				 FmiModelFactory.eINSTANCE.createFmiVariableDependency()));

		newChildDescriptors.add
			(createChildParameter
				(FmiModelPackage.Literals.FMI_SIMPLE_TYPE__STRING,
				 FmiModelFactory.eINSTANCE.createFmiAnnotation()));

		newChildDescriptors.add
			(createChildParameter
				(FmiModelPackage.Literals.FMI_SIMPLE_TYPE__STRING,
				 FmiModelFactory.eINSTANCE.createFmiScalarVariable()));

		newChildDescriptors.add
			(createChildParameter
				(FmiModelPackage.Literals.FMI_SIMPLE_TYPE__STRING,
				 FmiModelFactory.eINSTANCE.createFmiSimpleType()));

		newChildDescriptors.add
			(createChildParameter
				(FmiModelPackage.Literals.FMI_SIMPLE_TYPE__STRING,
				 FmiModelFactory.eINSTANCE.createFmiUnit()));

		newChildDescriptors.add
			(createChildParameter
				(FmiModelPackage.Literals.FMI_SIMPLE_TYPE__STRING,
				 FmiModelFactory.eINSTANCE.createFmiCoSimulationCapabilitiesType()));

		newChildDescriptors.add
			(createChildParameter
				(FmiModelPackage.Literals.FMI_SIMPLE_TYPE__STRING,
				 FmiModelFactory.eINSTANCE.createCoSimulation_StandAlone()));

		newChildDescriptors.add
			(createChildParameter
				(FmiModelPackage.Literals.FMI_SIMPLE_TYPE__STRING,
				 FmiModelFactory.eINSTANCE.createCoSimulation_Tool()));

		newChildDescriptors.add
			(createChildParameter
				(FmiModelPackage.Literals.FMI_SIMPLE_TYPE__STRING,
				 XMLTypeFactory.eINSTANCE.createAnyType()));

		newChildDescriptors.add
			(createChildParameter
				(FmiModelPackage.Literals.FMI_SIMPLE_TYPE__ENUMERATION,
				 FmiModelFactory.eINSTANCE.createEnumerationType1()));
	}

	/**
	 * This returns the label text for {@link org.eclipse.emf.edit.command.CreateChildCommand}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getCreateChildText(Object owner, Object feature, Object child, Collection<?> selection) {
		Object childFeature = feature;
		Object childObject = child;

		boolean qualify =
			childFeature == FmiModelPackage.Literals.FMI_SIMPLE_TYPE__BOOLEAN ||
			childFeature == FmiModelPackage.Literals.FMI_SIMPLE_TYPE__STRING;

		if (qualify) {
			return getString
				("_UI_CreateChild_text2",
				 new Object[] { getTypeText(childObject), getFeatureText(childFeature), getTypeText(owner) });
		}
		return super.getCreateChildText(owner, feature, child, selection);
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
