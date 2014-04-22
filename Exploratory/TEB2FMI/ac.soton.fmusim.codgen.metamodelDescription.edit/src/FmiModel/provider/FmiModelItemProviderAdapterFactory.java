/**
 */
package FmiModel.provider;

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

import FmiModel.util.FmiModelAdapterFactory;

/**
 * This is the factory that is used to provide the interfaces needed to support Viewers.
 * The adapters generated by this factory convert EMF adapter notifications into calls to {@link #fireNotifyChanged fireNotifyChanged}.
 * The adapters also support Eclipse property sheets.
 * Note that most of the adapters are shared among multiple instances.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class FmiModelItemProviderAdapterFactory extends FmiModelAdapterFactory implements ComposeableAdapterFactory, IChangeNotifier, IDisposable {
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
	public FmiModelItemProviderAdapterFactory() {
		supportedTypes.add(IEditingDomainItemProvider.class);
		supportedTypes.add(IStructuredItemContentProvider.class);
		supportedTypes.add(ITreeItemContentProvider.class);
		supportedTypes.add(IItemLabelProvider.class);
		supportedTypes.add(IItemPropertySource.class);
	}

	/**
	 * This keeps track of the one adapter used for all {@link FmiModel.BaseUnitType} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BaseUnitTypeItemProvider baseUnitTypeItemProvider;

	/**
	 * This creates an adapter for a {@link FmiModel.BaseUnitType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createBaseUnitTypeAdapter() {
		if (baseUnitTypeItemProvider == null) {
			baseUnitTypeItemProvider = new BaseUnitTypeItemProvider(this);
		}

		return baseUnitTypeItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link FmiModel.BooleanType} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BooleanTypeItemProvider booleanTypeItemProvider;

	/**
	 * This creates an adapter for a {@link FmiModel.BooleanType}.
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
	 * This keeps track of the one adapter used for all {@link FmiModel.CategoryType} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CategoryTypeItemProvider categoryTypeItemProvider;

	/**
	 * This creates an adapter for a {@link FmiModel.CategoryType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createCategoryTypeAdapter() {
		if (categoryTypeItemProvider == null) {
			categoryTypeItemProvider = new CategoryTypeItemProvider(this);
		}

		return categoryTypeItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link FmiModel.CoSimulationType} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CoSimulationTypeItemProvider coSimulationTypeItemProvider;

	/**
	 * This creates an adapter for a {@link FmiModel.CoSimulationType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createCoSimulationTypeAdapter() {
		if (coSimulationTypeItemProvider == null) {
			coSimulationTypeItemProvider = new CoSimulationTypeItemProvider(this);
		}

		return coSimulationTypeItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link FmiModel.DefaultExperimentType} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DefaultExperimentTypeItemProvider defaultExperimentTypeItemProvider;

	/**
	 * This creates an adapter for a {@link FmiModel.DefaultExperimentType}.
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
	 * This keeps track of the one adapter used for all {@link FmiModel.DerivativesType} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DerivativesTypeItemProvider derivativesTypeItemProvider;

	/**
	 * This creates an adapter for a {@link FmiModel.DerivativesType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createDerivativesTypeAdapter() {
		if (derivativesTypeItemProvider == null) {
			derivativesTypeItemProvider = new DerivativesTypeItemProvider(this);
		}

		return derivativesTypeItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link FmiModel.DerivativeType} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DerivativeTypeItemProvider derivativeTypeItemProvider;

	/**
	 * This creates an adapter for a {@link FmiModel.DerivativeType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createDerivativeTypeAdapter() {
		if (derivativeTypeItemProvider == null) {
			derivativeTypeItemProvider = new DerivativeTypeItemProvider(this);
		}

		return derivativeTypeItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link FmiModel.DisplayUnitType} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DisplayUnitTypeItemProvider displayUnitTypeItemProvider;

	/**
	 * This creates an adapter for a {@link FmiModel.DisplayUnitType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createDisplayUnitTypeAdapter() {
		if (displayUnitTypeItemProvider == null) {
			displayUnitTypeItemProvider = new DisplayUnitTypeItemProvider(this);
		}

		return displayUnitTypeItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link FmiModel.EnumerationType} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EnumerationTypeItemProvider enumerationTypeItemProvider;

	/**
	 * This creates an adapter for a {@link FmiModel.EnumerationType}.
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
	 * This keeps track of the one adapter used for all {@link FmiModel.EnumerationType1} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EnumerationType1ItemProvider enumerationType1ItemProvider;

	/**
	 * This creates an adapter for a {@link FmiModel.EnumerationType1}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createEnumerationType1Adapter() {
		if (enumerationType1ItemProvider == null) {
			enumerationType1ItemProvider = new EnumerationType1ItemProvider(this);
		}

		return enumerationType1ItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link FmiModel.FmiAnnotation} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FmiAnnotationItemProvider fmiAnnotationItemProvider;

	/**
	 * This creates an adapter for a {@link FmiModel.FmiAnnotation}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createFmiAnnotationAdapter() {
		if (fmiAnnotationItemProvider == null) {
			fmiAnnotationItemProvider = new FmiAnnotationItemProvider(this);
		}

		return fmiAnnotationItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link FmiModel.FmiModelDescriptionType} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FmiModelDescriptionTypeItemProvider fmiModelDescriptionTypeItemProvider;

	/**
	 * This creates an adapter for a {@link FmiModel.FmiModelDescriptionType}.
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
	 * This keeps track of the one adapter used for all {@link FmiModel.FmiScalarVariable} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FmiScalarVariableItemProvider fmiScalarVariableItemProvider;

	/**
	 * This creates an adapter for a {@link FmiModel.FmiScalarVariable}.
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
	 * This keeps track of the one adapter used for all {@link FmiModel.FmiSimpleType} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FmiSimpleTypeItemProvider fmiSimpleTypeItemProvider;

	/**
	 * This creates an adapter for a {@link FmiModel.FmiSimpleType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createFmiSimpleTypeAdapter() {
		if (fmiSimpleTypeItemProvider == null) {
			fmiSimpleTypeItemProvider = new FmiSimpleTypeItemProvider(this);
		}

		return fmiSimpleTypeItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link FmiModel.FmiUnit} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FmiUnitItemProvider fmiUnitItemProvider;

	/**
	 * This creates an adapter for a {@link FmiModel.FmiUnit}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createFmiUnitAdapter() {
		if (fmiUnitItemProvider == null) {
			fmiUnitItemProvider = new FmiUnitItemProvider(this);
		}

		return fmiUnitItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link FmiModel.FmiVariableDependency} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FmiVariableDependencyItemProvider fmiVariableDependencyItemProvider;

	/**
	 * This creates an adapter for a {@link FmiModel.FmiVariableDependency}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createFmiVariableDependencyAdapter() {
		if (fmiVariableDependencyItemProvider == null) {
			fmiVariableDependencyItemProvider = new FmiVariableDependencyItemProvider(this);
		}

		return fmiVariableDependencyItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link FmiModel.InputsType} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected InputsTypeItemProvider inputsTypeItemProvider;

	/**
	 * This creates an adapter for a {@link FmiModel.InputsType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createInputsTypeAdapter() {
		if (inputsTypeItemProvider == null) {
			inputsTypeItemProvider = new InputsTypeItemProvider(this);
		}

		return inputsTypeItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link FmiModel.InputType} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected InputTypeItemProvider inputTypeItemProvider;

	/**
	 * This creates an adapter for a {@link FmiModel.InputType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createInputTypeAdapter() {
		if (inputTypeItemProvider == null) {
			inputTypeItemProvider = new InputTypeItemProvider(this);
		}

		return inputTypeItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link FmiModel.IntegerType} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IntegerTypeItemProvider integerTypeItemProvider;

	/**
	 * This creates an adapter for a {@link FmiModel.IntegerType}.
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
	 * This keeps track of the one adapter used for all {@link FmiModel.IntegerType1} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IntegerType1ItemProvider integerType1ItemProvider;

	/**
	 * This creates an adapter for a {@link FmiModel.IntegerType1}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createIntegerType1Adapter() {
		if (integerType1ItemProvider == null) {
			integerType1ItemProvider = new IntegerType1ItemProvider(this);
		}

		return integerType1ItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link FmiModel.ItemType} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ItemTypeItemProvider itemTypeItemProvider;

	/**
	 * This creates an adapter for a {@link FmiModel.ItemType}.
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
	 * This keeps track of the one adapter used for all {@link FmiModel.LogCategoriesType} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LogCategoriesTypeItemProvider logCategoriesTypeItemProvider;

	/**
	 * This creates an adapter for a {@link FmiModel.LogCategoriesType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createLogCategoriesTypeAdapter() {
		if (logCategoriesTypeItemProvider == null) {
			logCategoriesTypeItemProvider = new LogCategoriesTypeItemProvider(this);
		}

		return logCategoriesTypeItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link FmiModel.ModelExchangeType} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ModelExchangeTypeItemProvider modelExchangeTypeItemProvider;

	/**
	 * This creates an adapter for a {@link FmiModel.ModelExchangeType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createModelExchangeTypeAdapter() {
		if (modelExchangeTypeItemProvider == null) {
			modelExchangeTypeItemProvider = new ModelExchangeTypeItemProvider(this);
		}

		return modelExchangeTypeItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link FmiModel.ModelStructureType} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ModelStructureTypeItemProvider modelStructureTypeItemProvider;

	/**
	 * This creates an adapter for a {@link FmiModel.ModelStructureType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createModelStructureTypeAdapter() {
		if (modelStructureTypeItemProvider == null) {
			modelStructureTypeItemProvider = new ModelStructureTypeItemProvider(this);
		}

		return modelStructureTypeItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link FmiModel.ModelVariablesType} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ModelVariablesTypeItemProvider modelVariablesTypeItemProvider;

	/**
	 * This creates an adapter for a {@link FmiModel.ModelVariablesType}.
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
	 * This keeps track of the one adapter used for all {@link FmiModel.OutputType} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OutputTypeItemProvider outputTypeItemProvider;

	/**
	 * This creates an adapter for a {@link FmiModel.OutputType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createOutputTypeAdapter() {
		if (outputTypeItemProvider == null) {
			outputTypeItemProvider = new OutputTypeItemProvider(this);
		}

		return outputTypeItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link FmiModel.RealType} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RealTypeItemProvider realTypeItemProvider;

	/**
	 * This creates an adapter for a {@link FmiModel.RealType}.
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
	 * This keeps track of the one adapter used for all {@link FmiModel.ToolType} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ToolTypeItemProvider toolTypeItemProvider;

	/**
	 * This creates an adapter for a {@link FmiModel.ToolType}.
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
	 * This keeps track of the one adapter used for all {@link FmiModel.DocumentRoot} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DocumentRootItemProvider documentRootItemProvider;

	/**
	 * This creates an adapter for a {@link FmiModel.DocumentRoot}.
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
	 * This keeps track of the one adapter used for all {@link FmiModel.OutputsType} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OutputsTypeItemProvider outputsTypeItemProvider;

	/**
	 * This creates an adapter for a {@link FmiModel.OutputsType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createOutputsTypeAdapter() {
		if (outputsTypeItemProvider == null) {
			outputsTypeItemProvider = new OutputsTypeItemProvider(this);
		}

		return outputsTypeItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link FmiModel.RealType1} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RealType1ItemProvider realType1ItemProvider;

	/**
	 * This creates an adapter for a {@link FmiModel.RealType1}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createRealType1Adapter() {
		if (realType1ItemProvider == null) {
			realType1ItemProvider = new RealType1ItemProvider(this);
		}

		return realType1ItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link FmiModel.StringType} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StringTypeItemProvider stringTypeItemProvider;

	/**
	 * This creates an adapter for a {@link FmiModel.StringType}.
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
	 * This keeps track of the one adapter used for all {@link FmiModel.TypeDefinitionsType} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TypeDefinitionsTypeItemProvider typeDefinitionsTypeItemProvider;

	/**
	 * This creates an adapter for a {@link FmiModel.TypeDefinitionsType}.
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
	 * This keeps track of the one adapter used for all {@link FmiModel.UnitDefinitionsType} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected UnitDefinitionsTypeItemProvider unitDefinitionsTypeItemProvider;

	/**
	 * This creates an adapter for a {@link FmiModel.UnitDefinitionsType}.
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
	 * This keeps track of the one adapter used for all {@link FmiModel.FmiCoSimulationCapabilitiesType} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FmiCoSimulationCapabilitiesTypeItemProvider fmiCoSimulationCapabilitiesTypeItemProvider;

	/**
	 * This creates an adapter for a {@link FmiModel.FmiCoSimulationCapabilitiesType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createFmiCoSimulationCapabilitiesTypeAdapter() {
		if (fmiCoSimulationCapabilitiesTypeItemProvider == null) {
			fmiCoSimulationCapabilitiesTypeItemProvider = new FmiCoSimulationCapabilitiesTypeItemProvider(this);
		}

		return fmiCoSimulationCapabilitiesTypeItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link FmiModel.CoSimulation_StandAlone} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CoSimulation_StandAloneItemProvider coSimulation_StandAloneItemProvider;

	/**
	 * This creates an adapter for a {@link FmiModel.CoSimulation_StandAlone}.
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
	 * This keeps track of the one adapter used for all {@link FmiModel.CoSimulation_Tool} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CoSimulation_ToolItemProvider coSimulation_ToolItemProvider;

	/**
	 * This creates an adapter for a {@link FmiModel.CoSimulation_Tool}.
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
		if (baseUnitTypeItemProvider != null) baseUnitTypeItemProvider.dispose();
		if (booleanTypeItemProvider != null) booleanTypeItemProvider.dispose();
		if (categoryTypeItemProvider != null) categoryTypeItemProvider.dispose();
		if (coSimulationTypeItemProvider != null) coSimulationTypeItemProvider.dispose();
		if (defaultExperimentTypeItemProvider != null) defaultExperimentTypeItemProvider.dispose();
		if (derivativesTypeItemProvider != null) derivativesTypeItemProvider.dispose();
		if (derivativeTypeItemProvider != null) derivativeTypeItemProvider.dispose();
		if (displayUnitTypeItemProvider != null) displayUnitTypeItemProvider.dispose();
		if (enumerationTypeItemProvider != null) enumerationTypeItemProvider.dispose();
		if (enumerationType1ItemProvider != null) enumerationType1ItemProvider.dispose();
		if (fmiAnnotationItemProvider != null) fmiAnnotationItemProvider.dispose();
		if (fmiModelDescriptionTypeItemProvider != null) fmiModelDescriptionTypeItemProvider.dispose();
		if (fmiScalarVariableItemProvider != null) fmiScalarVariableItemProvider.dispose();
		if (fmiSimpleTypeItemProvider != null) fmiSimpleTypeItemProvider.dispose();
		if (fmiUnitItemProvider != null) fmiUnitItemProvider.dispose();
		if (fmiVariableDependencyItemProvider != null) fmiVariableDependencyItemProvider.dispose();
		if (inputsTypeItemProvider != null) inputsTypeItemProvider.dispose();
		if (inputTypeItemProvider != null) inputTypeItemProvider.dispose();
		if (integerTypeItemProvider != null) integerTypeItemProvider.dispose();
		if (integerType1ItemProvider != null) integerType1ItemProvider.dispose();
		if (itemTypeItemProvider != null) itemTypeItemProvider.dispose();
		if (logCategoriesTypeItemProvider != null) logCategoriesTypeItemProvider.dispose();
		if (modelExchangeTypeItemProvider != null) modelExchangeTypeItemProvider.dispose();
		if (modelStructureTypeItemProvider != null) modelStructureTypeItemProvider.dispose();
		if (modelVariablesTypeItemProvider != null) modelVariablesTypeItemProvider.dispose();
		if (outputTypeItemProvider != null) outputTypeItemProvider.dispose();
		if (realTypeItemProvider != null) realTypeItemProvider.dispose();
		if (toolTypeItemProvider != null) toolTypeItemProvider.dispose();
		if (documentRootItemProvider != null) documentRootItemProvider.dispose();
		if (outputsTypeItemProvider != null) outputsTypeItemProvider.dispose();
		if (realType1ItemProvider != null) realType1ItemProvider.dispose();
		if (stringTypeItemProvider != null) stringTypeItemProvider.dispose();
		if (typeDefinitionsTypeItemProvider != null) typeDefinitionsTypeItemProvider.dispose();
		if (unitDefinitionsTypeItemProvider != null) unitDefinitionsTypeItemProvider.dispose();
		if (fmiCoSimulationCapabilitiesTypeItemProvider != null) fmiCoSimulationCapabilitiesTypeItemProvider.dispose();
		if (coSimulation_StandAloneItemProvider != null) coSimulation_StandAloneItemProvider.dispose();
		if (coSimulation_ToolItemProvider != null) coSimulation_ToolItemProvider.dispose();
	}

}
