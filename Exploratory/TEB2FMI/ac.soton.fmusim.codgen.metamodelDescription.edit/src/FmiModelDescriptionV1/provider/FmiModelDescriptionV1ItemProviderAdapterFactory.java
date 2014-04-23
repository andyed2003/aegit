/**
 */
package FmiModelDescriptionV1.provider;

import FmiModelDescriptionV1.util.FmiModelDescriptionV1AdapterFactory;

import java.util.ArrayList;
import java.util.Collection;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.edit.provider.ChangeNotifier;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.ComposedAdapterFactory;
import org.eclipse.emf.edit.provider.IChangeNotifier;
import org.eclipse.emf.edit.provider.IDisposable;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.INotifyChangedListener;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;

/**
 * This is the factory that is used to provide the interfaces needed to support Viewers.
 * The adapters generated by this factory convert EMF adapter notifications into calls to {@link #fireNotifyChanged fireNotifyChanged}.
 * The adapters also support Eclipse property sheets.
 * Note that most of the adapters are shared among multiple instances.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class FmiModelDescriptionV1ItemProviderAdapterFactory extends FmiModelDescriptionV1AdapterFactory implements ComposeableAdapterFactory, IChangeNotifier, IDisposable {
	/**
	 * This keeps track of the root adapter factory that delegates to this adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ComposedAdapterFactory parentAdapterFactory;

	/**
	 * This is used to implement {@link org.eclipse.emf.edit.provider.IChangeNotifier}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IChangeNotifier changeNotifier = new ChangeNotifier();

	/**
	 * This keeps track of all the supported types checked by {@link #isFactoryForType isFactoryForType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Collection<Object> supportedTypes = new ArrayList<Object>();

	/**
	 * This constructs an instance.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FmiModelDescriptionV1ItemProviderAdapterFactory() {
		supportedTypes.add(IEditingDomainItemProvider.class);
		supportedTypes.add(IStructuredItemContentProvider.class);
		supportedTypes.add(ITreeItemContentProvider.class);
		supportedTypes.add(IItemLabelProvider.class);
		supportedTypes.add(IItemPropertySource.class);
	}

	/**
	 * This keeps track of the one adapter used for all {@link FmiModelDescriptionV1.AnnotationType} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AnnotationTypeItemProvider annotationTypeItemProvider;

	/**
	 * This creates an adapter for a {@link FmiModelDescriptionV1.AnnotationType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createAnnotationTypeAdapter() {
		if (annotationTypeItemProvider == null) {
			annotationTypeItemProvider = new AnnotationTypeItemProvider(this);
		}

		return annotationTypeItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link FmiModelDescriptionV1.BooleanType} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BooleanTypeItemProvider booleanTypeItemProvider;

	/**
	 * This creates an adapter for a {@link FmiModelDescriptionV1.BooleanType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createBooleanTypeAdapter() {
		if (booleanTypeItemProvider == null) {
			booleanTypeItemProvider = new BooleanTypeItemProvider(this);
		}

		return booleanTypeItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link FmiModelDescriptionV1.DefaultExperimentType} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DefaultExperimentTypeItemProvider defaultExperimentTypeItemProvider;

	/**
	 * This creates an adapter for a {@link FmiModelDescriptionV1.DefaultExperimentType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createDefaultExperimentTypeAdapter() {
		if (defaultExperimentTypeItemProvider == null) {
			defaultExperimentTypeItemProvider = new DefaultExperimentTypeItemProvider(this);
		}

		return defaultExperimentTypeItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link FmiModelDescriptionV1.DirectDependencyType} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DirectDependencyTypeItemProvider directDependencyTypeItemProvider;

	/**
	 * This creates an adapter for a {@link FmiModelDescriptionV1.DirectDependencyType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createDirectDependencyTypeAdapter() {
		if (directDependencyTypeItemProvider == null) {
			directDependencyTypeItemProvider = new DirectDependencyTypeItemProvider(this);
		}

		return directDependencyTypeItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link FmiModelDescriptionV1.DisplayUnitDefinitionType} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DisplayUnitDefinitionTypeItemProvider displayUnitDefinitionTypeItemProvider;

	/**
	 * This creates an adapter for a {@link FmiModelDescriptionV1.DisplayUnitDefinitionType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createDisplayUnitDefinitionTypeAdapter() {
		if (displayUnitDefinitionTypeItemProvider == null) {
			displayUnitDefinitionTypeItemProvider = new DisplayUnitDefinitionTypeItemProvider(this);
		}

		return displayUnitDefinitionTypeItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link FmiModelDescriptionV1.DocumentRoot} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DocumentRootItemProvider documentRootItemProvider;

	/**
	 * This creates an adapter for a {@link FmiModelDescriptionV1.DocumentRoot}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createDocumentRootAdapter() {
		if (documentRootItemProvider == null) {
			documentRootItemProvider = new DocumentRootItemProvider(this);
		}

		return documentRootItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link FmiModelDescriptionV1.EnumerationType} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EnumerationTypeItemProvider enumerationTypeItemProvider;

	/**
	 * This creates an adapter for a {@link FmiModelDescriptionV1.EnumerationType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createEnumerationTypeAdapter() {
		if (enumerationTypeItemProvider == null) {
			enumerationTypeItemProvider = new EnumerationTypeItemProvider(this);
		}

		return enumerationTypeItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link FmiModelDescriptionV1.EnumerationTypeType} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EnumerationTypeTypeItemProvider enumerationTypeTypeItemProvider;

	/**
	 * This creates an adapter for a {@link FmiModelDescriptionV1.EnumerationTypeType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createEnumerationTypeTypeAdapter() {
		if (enumerationTypeTypeItemProvider == null) {
			enumerationTypeTypeItemProvider = new EnumerationTypeTypeItemProvider(this);
		}

		return enumerationTypeTypeItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link FmiModelDescriptionV1.FmiBaseUnit} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FmiBaseUnitItemProvider fmiBaseUnitItemProvider;

	/**
	 * This creates an adapter for a {@link FmiModelDescriptionV1.FmiBaseUnit}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createFmiBaseUnitAdapter() {
		if (fmiBaseUnitItemProvider == null) {
			fmiBaseUnitItemProvider = new FmiBaseUnitItemProvider(this);
		}

		return fmiBaseUnitItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link FmiModelDescriptionV1.FmiModelDescriptionType} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FmiModelDescriptionTypeItemProvider fmiModelDescriptionTypeItemProvider;

	/**
	 * This creates an adapter for a {@link FmiModelDescriptionV1.FmiModelDescriptionType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createFmiModelDescriptionTypeAdapter() {
		if (fmiModelDescriptionTypeItemProvider == null) {
			fmiModelDescriptionTypeItemProvider = new FmiModelDescriptionTypeItemProvider(this);
		}

		return fmiModelDescriptionTypeItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link FmiModelDescriptionV1.FmiScalarVariable} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FmiScalarVariableItemProvider fmiScalarVariableItemProvider;

	/**
	 * This creates an adapter for a {@link FmiModelDescriptionV1.FmiScalarVariable}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createFmiScalarVariableAdapter() {
		if (fmiScalarVariableItemProvider == null) {
			fmiScalarVariableItemProvider = new FmiScalarVariableItemProvider(this);
		}

		return fmiScalarVariableItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link FmiModelDescriptionV1.FmiType} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FmiTypeItemProvider fmiTypeItemProvider;

	/**
	 * This creates an adapter for a {@link FmiModelDescriptionV1.FmiType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createFmiTypeAdapter() {
		if (fmiTypeItemProvider == null) {
			fmiTypeItemProvider = new FmiTypeItemProvider(this);
		}

		return fmiTypeItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link FmiModelDescriptionV1.IntegerType} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IntegerTypeItemProvider integerTypeItemProvider;

	/**
	 * This creates an adapter for a {@link FmiModelDescriptionV1.IntegerType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createIntegerTypeAdapter() {
		if (integerTypeItemProvider == null) {
			integerTypeItemProvider = new IntegerTypeItemProvider(this);
		}

		return integerTypeItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link FmiModelDescriptionV1.IntegerTypeType} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IntegerTypeTypeItemProvider integerTypeTypeItemProvider;

	/**
	 * This creates an adapter for a {@link FmiModelDescriptionV1.IntegerTypeType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createIntegerTypeTypeAdapter() {
		if (integerTypeTypeItemProvider == null) {
			integerTypeTypeItemProvider = new IntegerTypeTypeItemProvider(this);
		}

		return integerTypeTypeItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link FmiModelDescriptionV1.ItemType} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ItemTypeItemProvider itemTypeItemProvider;

	/**
	 * This creates an adapter for a {@link FmiModelDescriptionV1.ItemType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createItemTypeAdapter() {
		if (itemTypeItemProvider == null) {
			itemTypeItemProvider = new ItemTypeItemProvider(this);
		}

		return itemTypeItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link FmiModelDescriptionV1.ModelVariablesType} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ModelVariablesTypeItemProvider modelVariablesTypeItemProvider;

	/**
	 * This creates an adapter for a {@link FmiModelDescriptionV1.ModelVariablesType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createModelVariablesTypeAdapter() {
		if (modelVariablesTypeItemProvider == null) {
			modelVariablesTypeItemProvider = new ModelVariablesTypeItemProvider(this);
		}

		return modelVariablesTypeItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link FmiModelDescriptionV1.ImplementationType} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ImplementationTypeItemProvider implementationTypeItemProvider;

	/**
	 * This creates an adapter for a {@link FmiModelDescriptionV1.ImplementationType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createImplementationTypeAdapter() {
		if (implementationTypeItemProvider == null) {
			implementationTypeItemProvider = new ImplementationTypeItemProvider(this);
		}

		return implementationTypeItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link FmiModelDescriptionV1.RealType} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RealTypeItemProvider realTypeItemProvider;

	/**
	 * This creates an adapter for a {@link FmiModelDescriptionV1.RealType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createRealTypeAdapter() {
		if (realTypeItemProvider == null) {
			realTypeItemProvider = new RealTypeItemProvider(this);
		}

		return realTypeItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link FmiModelDescriptionV1.RealTypeType} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RealTypeTypeItemProvider realTypeTypeItemProvider;

	/**
	 * This creates an adapter for a {@link FmiModelDescriptionV1.RealTypeType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createRealTypeTypeAdapter() {
		if (realTypeTypeItemProvider == null) {
			realTypeTypeItemProvider = new RealTypeTypeItemProvider(this);
		}

		return realTypeTypeItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link FmiModelDescriptionV1.StringType} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StringTypeItemProvider stringTypeItemProvider;

	/**
	 * This creates an adapter for a {@link FmiModelDescriptionV1.StringType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createStringTypeAdapter() {
		if (stringTypeItemProvider == null) {
			stringTypeItemProvider = new StringTypeItemProvider(this);
		}

		return stringTypeItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link FmiModelDescriptionV1.ToolType} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ToolTypeItemProvider toolTypeItemProvider;

	/**
	 * This creates an adapter for a {@link FmiModelDescriptionV1.ToolType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createToolTypeAdapter() {
		if (toolTypeItemProvider == null) {
			toolTypeItemProvider = new ToolTypeItemProvider(this);
		}

		return toolTypeItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link FmiModelDescriptionV1.TypeDefinitionsType} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TypeDefinitionsTypeItemProvider typeDefinitionsTypeItemProvider;

	/**
	 * This creates an adapter for a {@link FmiModelDescriptionV1.TypeDefinitionsType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createTypeDefinitionsTypeAdapter() {
		if (typeDefinitionsTypeItemProvider == null) {
			typeDefinitionsTypeItemProvider = new TypeDefinitionsTypeItemProvider(this);
		}

		return typeDefinitionsTypeItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link FmiModelDescriptionV1.UnitDefinitionsType} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected UnitDefinitionsTypeItemProvider unitDefinitionsTypeItemProvider;

	/**
	 * This creates an adapter for a {@link FmiModelDescriptionV1.UnitDefinitionsType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createUnitDefinitionsTypeAdapter() {
		if (unitDefinitionsTypeItemProvider == null) {
			unitDefinitionsTypeItemProvider = new UnitDefinitionsTypeItemProvider(this);
		}

		return unitDefinitionsTypeItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link FmiModelDescriptionV1.CoSimulation_StandAlone} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CoSimulation_StandAloneItemProvider coSimulation_StandAloneItemProvider;

	/**
	 * This creates an adapter for a {@link FmiModelDescriptionV1.CoSimulation_StandAlone}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createCoSimulation_StandAloneAdapter() {
		if (coSimulation_StandAloneItemProvider == null) {
			coSimulation_StandAloneItemProvider = new CoSimulation_StandAloneItemProvider(this);
		}

		return coSimulation_StandAloneItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link FmiModelDescriptionV1.CoSimulation_Tool} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CoSimulation_ToolItemProvider coSimulation_ToolItemProvider;

	/**
	 * This creates an adapter for a {@link FmiModelDescriptionV1.CoSimulation_Tool}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createCoSimulation_ToolAdapter() {
		if (coSimulation_ToolItemProvider == null) {
			coSimulation_ToolItemProvider = new CoSimulation_ToolItemProvider(this);
		}

		return coSimulation_ToolItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link FmiModelDescriptionV1.VendorAnnotationsType} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected VendorAnnotationsTypeItemProvider vendorAnnotationsTypeItemProvider;

	/**
	 * This creates an adapter for a {@link FmiModelDescriptionV1.VendorAnnotationsType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createVendorAnnotationsTypeAdapter() {
		if (vendorAnnotationsTypeItemProvider == null) {
			vendorAnnotationsTypeItemProvider = new VendorAnnotationsTypeItemProvider(this);
		}

		return vendorAnnotationsTypeItemProvider;
	}

	/**
	 * This returns the root adapter factory that contains this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComposeableAdapterFactory getRootAdapterFactory() {
		return parentAdapterFactory == null ? this : parentAdapterFactory.getRootAdapterFactory();
	}

	/**
	 * This sets the composed adapter factory that contains this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParentAdapterFactory(ComposedAdapterFactory parentAdapterFactory) {
		this.parentAdapterFactory = parentAdapterFactory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object type) {
		return supportedTypes.contains(type) || super.isFactoryForType(type);
	}

	/**
	 * This implementation substitutes the factory itself as the key for the adapter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter adapt(Notifier notifier, Object type) {
		return super.adapt(notifier, this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object adapt(Object object, Object type) {
		if (isFactoryForType(type)) {
			Object adapter = super.adapt(object, type);
			if (!(type instanceof Class<?>) || (((Class<?>)type).isInstance(adapter))) {
				return adapter;
			}
		}

		return null;
	}

	/**
	 * This adds a listener.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void addListener(INotifyChangedListener notifyChangedListener) {
		changeNotifier.addListener(notifyChangedListener);
	}

	/**
	 * This removes a listener.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void removeListener(INotifyChangedListener notifyChangedListener) {
		changeNotifier.removeListener(notifyChangedListener);
	}

	/**
	 * This delegates to {@link #changeNotifier} and to {@link #parentAdapterFactory}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void fireNotifyChanged(Notification notification) {
		changeNotifier.fireNotifyChanged(notification);

		if (parentAdapterFactory != null) {
			parentAdapterFactory.fireNotifyChanged(notification);
		}
	}

	/**
	 * This disposes all of the item providers created by this factory. 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void dispose() {
		if (annotationTypeItemProvider != null) annotationTypeItemProvider.dispose();
		if (booleanTypeItemProvider != null) booleanTypeItemProvider.dispose();
		if (defaultExperimentTypeItemProvider != null) defaultExperimentTypeItemProvider.dispose();
		if (directDependencyTypeItemProvider != null) directDependencyTypeItemProvider.dispose();
		if (displayUnitDefinitionTypeItemProvider != null) displayUnitDefinitionTypeItemProvider.dispose();
		if (documentRootItemProvider != null) documentRootItemProvider.dispose();
		if (enumerationTypeItemProvider != null) enumerationTypeItemProvider.dispose();
		if (enumerationTypeTypeItemProvider != null) enumerationTypeTypeItemProvider.dispose();
		if (fmiBaseUnitItemProvider != null) fmiBaseUnitItemProvider.dispose();
		if (fmiModelDescriptionTypeItemProvider != null) fmiModelDescriptionTypeItemProvider.dispose();
		if (fmiScalarVariableItemProvider != null) fmiScalarVariableItemProvider.dispose();
		if (fmiTypeItemProvider != null) fmiTypeItemProvider.dispose();
		if (integerTypeItemProvider != null) integerTypeItemProvider.dispose();
		if (integerTypeTypeItemProvider != null) integerTypeTypeItemProvider.dispose();
		if (itemTypeItemProvider != null) itemTypeItemProvider.dispose();
		if (modelVariablesTypeItemProvider != null) modelVariablesTypeItemProvider.dispose();
		if (realTypeItemProvider != null) realTypeItemProvider.dispose();
		if (realTypeTypeItemProvider != null) realTypeTypeItemProvider.dispose();
		if (stringTypeItemProvider != null) stringTypeItemProvider.dispose();
		if (toolTypeItemProvider != null) toolTypeItemProvider.dispose();
		if (typeDefinitionsTypeItemProvider != null) typeDefinitionsTypeItemProvider.dispose();
		if (unitDefinitionsTypeItemProvider != null) unitDefinitionsTypeItemProvider.dispose();
		if (implementationTypeItemProvider != null) implementationTypeItemProvider.dispose();
		if (coSimulation_StandAloneItemProvider != null) coSimulation_StandAloneItemProvider.dispose();
		if (coSimulation_ToolItemProvider != null) coSimulation_ToolItemProvider.dispose();
		if (vendorAnnotationsTypeItemProvider != null) vendorAnnotationsTypeItemProvider.dispose();
	}

}
