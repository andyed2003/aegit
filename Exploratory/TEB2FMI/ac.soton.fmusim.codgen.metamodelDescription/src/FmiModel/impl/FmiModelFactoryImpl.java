/**
 */
package FmiModel.impl;

import FmiModel.*;
import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;
import org.eclipse.emf.ecore.plugin.EcorePlugin;
import org.eclipse.emf.ecore.xml.type.XMLTypeFactory;
import org.eclipse.emf.ecore.xml.type.XMLTypePackage;

import FmiModel.BaseUnitType;
import FmiModel.BooleanType;
import FmiModel.CategoryType;
import FmiModel.CausalityType;
import FmiModel.CoSimulationType;
import FmiModel.CoSimulation_StandAlone;
import FmiModel.CoSimulation_Tool;
import FmiModel.DefaultExperimentType;
import FmiModel.DerivativeType;
import FmiModel.DerivativesType;
import FmiModel.DisplayUnitType;
import FmiModel.DocumentRoot;
import FmiModel.EnumerationType;
import FmiModel.EnumerationType1;
import FmiModel.FmiAnnotation;
import FmiModel.FmiCoSimulationCapabilitiesType;
import FmiModel.FmiDependencyFactorKind;
import FmiModel.FmiModelDescriptionType;
import FmiModel.FmiModelFactory;
import FmiModel.FmiModelPackage;
import FmiModel.FmiScalarVariable;
import FmiModel.FmiSimpleType;
import FmiModel.FmiUnit;
import FmiModel.FmiVariableDependency;
import FmiModel.InitialType;
import FmiModel.InputType;
import FmiModel.InputsType;
import FmiModel.IntegerType;
import FmiModel.IntegerType1;
import FmiModel.ItemType;
import FmiModel.LogCategoriesType;
import FmiModel.ModelExchangeType;
import FmiModel.ModelStructureType;
import FmiModel.ModelVariablesType;
import FmiModel.OutputType;
import FmiModel.OutputsType;
import FmiModel.RealType;
import FmiModel.RealType1;
import FmiModel.StringType;
import FmiModel.ToolType;
import FmiModel.TypeDefinitionsType;
import FmiModel.UnitDefinitionsType;
import FmiModel.VariabilityType;
import FmiModel.VariableNamingConventionType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class FmiModelFactoryImpl extends EFactoryImpl implements FmiModelFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static FmiModelFactory init() {
		try {
			FmiModelFactory theFmiModelFactory = (FmiModelFactory)EPackage.Registry.INSTANCE.getEFactory("http://ac.soton.fmusim.codegen.fmimetamodeldescription"); 
			if (theFmiModelFactory != null) {
				return theFmiModelFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new FmiModelFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FmiModelFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case FmiModelPackage.BASE_UNIT_TYPE: return createBaseUnitType();
			case FmiModelPackage.BOOLEAN_TYPE: return createBooleanType();
			case FmiModelPackage.CATEGORY_TYPE: return createCategoryType();
			case FmiModelPackage.CO_SIMULATION_TYPE: return createCoSimulationType();
			case FmiModelPackage.DEFAULT_EXPERIMENT_TYPE: return createDefaultExperimentType();
			case FmiModelPackage.DERIVATIVES_TYPE: return createDerivativesType();
			case FmiModelPackage.DERIVATIVE_TYPE: return createDerivativeType();
			case FmiModelPackage.DISPLAY_UNIT_TYPE: return createDisplayUnitType();
			case FmiModelPackage.ENUMERATION_TYPE: return createEnumerationType();
			case FmiModelPackage.ENUMERATION_TYPE1: return createEnumerationType1();
			case FmiModelPackage.FMI_ANNOTATION: return createFmiAnnotation();
			case FmiModelPackage.FMI_MODEL_DESCRIPTION_TYPE: return createFmiModelDescriptionType();
			case FmiModelPackage.FMI_SCALAR_VARIABLE: return createFmiScalarVariable();
			case FmiModelPackage.FMI_SIMPLE_TYPE: return createFmiSimpleType();
			case FmiModelPackage.FMI_UNIT: return createFmiUnit();
			case FmiModelPackage.FMI_VARIABLE_DEPENDENCY: return createFmiVariableDependency();
			case FmiModelPackage.INPUTS_TYPE: return createInputsType();
			case FmiModelPackage.INPUT_TYPE: return createInputType();
			case FmiModelPackage.INTEGER_TYPE: return createIntegerType();
			case FmiModelPackage.INTEGER_TYPE1: return createIntegerType1();
			case FmiModelPackage.ITEM_TYPE: return createItemType();
			case FmiModelPackage.LOG_CATEGORIES_TYPE: return createLogCategoriesType();
			case FmiModelPackage.MODEL_EXCHANGE_TYPE: return createModelExchangeType();
			case FmiModelPackage.MODEL_STRUCTURE_TYPE: return createModelStructureType();
			case FmiModelPackage.MODEL_VARIABLES_TYPE: return createModelVariablesType();
			case FmiModelPackage.OUTPUT_TYPE: return createOutputType();
			case FmiModelPackage.REAL_TYPE: return createRealType();
			case FmiModelPackage.TOOL_TYPE: return createToolType();
			case FmiModelPackage.DOCUMENT_ROOT: return createDocumentRoot();
			case FmiModelPackage.OUTPUTS_TYPE: return createOutputsType();
			case FmiModelPackage.REAL_TYPE1: return createRealType1();
			case FmiModelPackage.STRING_TYPE: return createStringType();
			case FmiModelPackage.TYPE_DEFINITIONS_TYPE: return createTypeDefinitionsType();
			case FmiModelPackage.UNIT_DEFINITIONS_TYPE: return createUnitDefinitionsType();
			case FmiModelPackage.CO_SIMULATION_STAND_ALONE: return createCoSimulation_StandAlone();
			case FmiModelPackage.CO_SIMULATION_TOOL: return createCoSimulation_Tool();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case FmiModelPackage.CAUSALITY_TYPE:
				return createCausalityTypeFromString(eDataType, initialValue);
			case FmiModelPackage.FMI_DEPENDENCY_FACTOR_KIND:
				return createFmiDependencyFactorKindFromString(eDataType, initialValue);
			case FmiModelPackage.INITIAL_TYPE:
				return createInitialTypeFromString(eDataType, initialValue);
			case FmiModelPackage.VARIABILITY_TYPE:
				return createVariabilityTypeFromString(eDataType, initialValue);
			case FmiModelPackage.VARIABLE_NAMING_CONVENTION_TYPE:
				return createVariableNamingConventionTypeFromString(eDataType, initialValue);
			case FmiModelPackage.CAUSALITY_TYPE_OBJECT:
				return createCausalityTypeObjectFromString(eDataType, initialValue);
			case FmiModelPackage.FMI_DEPENDENCY_FACTOR_KIND_OBJECT:
				return createFmiDependencyFactorKindObjectFromString(eDataType, initialValue);
			case FmiModelPackage.INITIAL_TYPE_OBJECT:
				return createInitialTypeObjectFromString(eDataType, initialValue);
			case FmiModelPackage.INPUT_DEPENDENCIES_TYPE:
				return createInputDependenciesTypeFromString(eDataType, initialValue);
			case FmiModelPackage.INPUT_FACTOR_KINDS_TYPE:
				return createInputFactorKindsTypeFromString(eDataType, initialValue);
			case FmiModelPackage.STATE_DEPENDENCIES_TYPE:
				return createStateDependenciesTypeFromString(eDataType, initialValue);
			case FmiModelPackage.STATE_FACTOR_KINDS_TYPE:
				return createStateFactorKindsTypeFromString(eDataType, initialValue);
			case FmiModelPackage.VARIABILITY_TYPE_OBJECT:
				return createVariabilityTypeObjectFromString(eDataType, initialValue);
			case FmiModelPackage.VARIABLE_NAMING_CONVENTION_TYPE_OBJECT:
				return createVariableNamingConventionTypeObjectFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case FmiModelPackage.CAUSALITY_TYPE:
				return convertCausalityTypeToString(eDataType, instanceValue);
			case FmiModelPackage.FMI_DEPENDENCY_FACTOR_KIND:
				return convertFmiDependencyFactorKindToString(eDataType, instanceValue);
			case FmiModelPackage.INITIAL_TYPE:
				return convertInitialTypeToString(eDataType, instanceValue);
			case FmiModelPackage.VARIABILITY_TYPE:
				return convertVariabilityTypeToString(eDataType, instanceValue);
			case FmiModelPackage.VARIABLE_NAMING_CONVENTION_TYPE:
				return convertVariableNamingConventionTypeToString(eDataType, instanceValue);
			case FmiModelPackage.CAUSALITY_TYPE_OBJECT:
				return convertCausalityTypeObjectToString(eDataType, instanceValue);
			case FmiModelPackage.FMI_DEPENDENCY_FACTOR_KIND_OBJECT:
				return convertFmiDependencyFactorKindObjectToString(eDataType, instanceValue);
			case FmiModelPackage.INITIAL_TYPE_OBJECT:
				return convertInitialTypeObjectToString(eDataType, instanceValue);
			case FmiModelPackage.INPUT_DEPENDENCIES_TYPE:
				return convertInputDependenciesTypeToString(eDataType, instanceValue);
			case FmiModelPackage.INPUT_FACTOR_KINDS_TYPE:
				return convertInputFactorKindsTypeToString(eDataType, instanceValue);
			case FmiModelPackage.STATE_DEPENDENCIES_TYPE:
				return convertStateDependenciesTypeToString(eDataType, instanceValue);
			case FmiModelPackage.STATE_FACTOR_KINDS_TYPE:
				return convertStateFactorKindsTypeToString(eDataType, instanceValue);
			case FmiModelPackage.VARIABILITY_TYPE_OBJECT:
				return convertVariabilityTypeObjectToString(eDataType, instanceValue);
			case FmiModelPackage.VARIABLE_NAMING_CONVENTION_TYPE_OBJECT:
				return convertVariableNamingConventionTypeObjectToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BaseUnitType createBaseUnitType() {
		BaseUnitTypeImpl baseUnitType = new BaseUnitTypeImpl();
		return baseUnitType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BooleanType createBooleanType() {
		BooleanTypeImpl booleanType = new BooleanTypeImpl();
		return booleanType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CategoryType createCategoryType() {
		CategoryTypeImpl categoryType = new CategoryTypeImpl();
		return categoryType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CoSimulationType createCoSimulationType() {
		CoSimulationTypeImpl coSimulationType = new CoSimulationTypeImpl();
		return coSimulationType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DefaultExperimentType createDefaultExperimentType() {
		DefaultExperimentTypeImpl defaultExperimentType = new DefaultExperimentTypeImpl();
		return defaultExperimentType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DerivativesType createDerivativesType() {
		DerivativesTypeImpl derivativesType = new DerivativesTypeImpl();
		return derivativesType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DerivativeType createDerivativeType() {
		DerivativeTypeImpl derivativeType = new DerivativeTypeImpl();
		return derivativeType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DisplayUnitType createDisplayUnitType() {
		DisplayUnitTypeImpl displayUnitType = new DisplayUnitTypeImpl();
		return displayUnitType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EnumerationType createEnumerationType() {
		EnumerationTypeImpl enumerationType = new EnumerationTypeImpl();
		return enumerationType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EnumerationType1 createEnumerationType1() {
		EnumerationType1Impl enumerationType1 = new EnumerationType1Impl();
		return enumerationType1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FmiAnnotation createFmiAnnotation() {
		FmiAnnotationImpl fmiAnnotation = new FmiAnnotationImpl();
		return fmiAnnotation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FmiModelDescriptionType createFmiModelDescriptionType() {
		FmiModelDescriptionTypeImpl fmiModelDescriptionType = new FmiModelDescriptionTypeImpl();
		return fmiModelDescriptionType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FmiScalarVariable createFmiScalarVariable() {
		FmiScalarVariableImpl fmiScalarVariable = new FmiScalarVariableImpl();
		return fmiScalarVariable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FmiSimpleType createFmiSimpleType() {
		FmiSimpleTypeImpl fmiSimpleType = new FmiSimpleTypeImpl();
		return fmiSimpleType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FmiUnit createFmiUnit() {
		FmiUnitImpl fmiUnit = new FmiUnitImpl();
		return fmiUnit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FmiVariableDependency createFmiVariableDependency() {
		FmiVariableDependencyImpl fmiVariableDependency = new FmiVariableDependencyImpl();
		return fmiVariableDependency;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InputsType createInputsType() {
		InputsTypeImpl inputsType = new InputsTypeImpl();
		return inputsType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InputType createInputType() {
		InputTypeImpl inputType = new InputTypeImpl();
		return inputType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IntegerType createIntegerType() {
		IntegerTypeImpl integerType = new IntegerTypeImpl();
		return integerType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IntegerType1 createIntegerType1() {
		IntegerType1Impl integerType1 = new IntegerType1Impl();
		return integerType1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ItemType createItemType() {
		ItemTypeImpl itemType = new ItemTypeImpl();
		return itemType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LogCategoriesType createLogCategoriesType() {
		LogCategoriesTypeImpl logCategoriesType = new LogCategoriesTypeImpl();
		return logCategoriesType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModelExchangeType createModelExchangeType() {
		ModelExchangeTypeImpl modelExchangeType = new ModelExchangeTypeImpl();
		return modelExchangeType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModelStructureType createModelStructureType() {
		ModelStructureTypeImpl modelStructureType = new ModelStructureTypeImpl();
		return modelStructureType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModelVariablesType createModelVariablesType() {
		ModelVariablesTypeImpl modelVariablesType = new ModelVariablesTypeImpl();
		return modelVariablesType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OutputType createOutputType() {
		OutputTypeImpl outputType = new OutputTypeImpl();
		return outputType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RealType createRealType() {
		RealTypeImpl realType = new RealTypeImpl();
		return realType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ToolType createToolType() {
		ToolTypeImpl toolType = new ToolTypeImpl();
		return toolType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DocumentRoot createDocumentRoot() {
		DocumentRootImpl documentRoot = new DocumentRootImpl();
		return documentRoot;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OutputsType createOutputsType() {
		OutputsTypeImpl outputsType = new OutputsTypeImpl();
		return outputsType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RealType1 createRealType1() {
		RealType1Impl realType1 = new RealType1Impl();
		return realType1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StringType createStringType() {
		StringTypeImpl stringType = new StringTypeImpl();
		return stringType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeDefinitionsType createTypeDefinitionsType() {
		TypeDefinitionsTypeImpl typeDefinitionsType = new TypeDefinitionsTypeImpl();
		return typeDefinitionsType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UnitDefinitionsType createUnitDefinitionsType() {
		UnitDefinitionsTypeImpl unitDefinitionsType = new UnitDefinitionsTypeImpl();
		return unitDefinitionsType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CoSimulation_StandAlone createCoSimulation_StandAlone() {
		CoSimulation_StandAloneImpl coSimulation_StandAlone = new CoSimulation_StandAloneImpl();
		return coSimulation_StandAlone;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CoSimulation_Tool createCoSimulation_Tool() {
		CoSimulation_ToolImpl coSimulation_Tool = new CoSimulation_ToolImpl();
		return coSimulation_Tool;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CausalityType createCausalityTypeFromString(EDataType eDataType, String initialValue) {
		CausalityType result = CausalityType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertCausalityTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FmiDependencyFactorKind createFmiDependencyFactorKindFromString(EDataType eDataType, String initialValue) {
		FmiDependencyFactorKind result = FmiDependencyFactorKind.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertFmiDependencyFactorKindToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InitialType createInitialTypeFromString(EDataType eDataType, String initialValue) {
		InitialType result = InitialType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertInitialTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VariabilityType createVariabilityTypeFromString(EDataType eDataType, String initialValue) {
		VariabilityType result = VariabilityType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertVariabilityTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VariableNamingConventionType createVariableNamingConventionTypeFromString(EDataType eDataType, String initialValue) {
		VariableNamingConventionType result = VariableNamingConventionType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertVariableNamingConventionTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CausalityType createCausalityTypeObjectFromString(EDataType eDataType, String initialValue) {
		return createCausalityTypeFromString(FmiModelPackage.Literals.CAUSALITY_TYPE, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertCausalityTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertCausalityTypeToString(FmiModelPackage.Literals.CAUSALITY_TYPE, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FmiDependencyFactorKind createFmiDependencyFactorKindObjectFromString(EDataType eDataType, String initialValue) {
		return createFmiDependencyFactorKindFromString(FmiModelPackage.Literals.FMI_DEPENDENCY_FACTOR_KIND, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertFmiDependencyFactorKindObjectToString(EDataType eDataType, Object instanceValue) {
		return convertFmiDependencyFactorKindToString(FmiModelPackage.Literals.FMI_DEPENDENCY_FACTOR_KIND, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InitialType createInitialTypeObjectFromString(EDataType eDataType, String initialValue) {
		return createInitialTypeFromString(FmiModelPackage.Literals.INITIAL_TYPE, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertInitialTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertInitialTypeToString(FmiModelPackage.Literals.INITIAL_TYPE, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public List<Integer> createInputDependenciesTypeFromString(EDataType eDataType, String initialValue) {
		if (initialValue == null) return null;
		List<Integer> result = new ArrayList<Integer>();
		for (String item : split(initialValue)) {
			result.add((Integer)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.INT, item));
		}
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertInputDependenciesTypeToString(EDataType eDataType, Object instanceValue) {
		if (instanceValue == null) return null;
		List<?> list = (List<?>)instanceValue;
		if (list.isEmpty()) return "";
		StringBuffer result = new StringBuffer();
		for (Object item : list) {
			result.append(XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.INT, item));
			result.append(' ');
		}
		return result.substring(0, result.length() - 1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public List<FmiDependencyFactorKind> createInputFactorKindsTypeFromString(EDataType eDataType, String initialValue) {
		if (initialValue == null) return null;
		List<FmiDependencyFactorKind> result = new ArrayList<FmiDependencyFactorKind>();
		for (String item : split(initialValue)) {
			result.add(createFmiDependencyFactorKindFromString(FmiModelPackage.Literals.FMI_DEPENDENCY_FACTOR_KIND, item));
		}
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertInputFactorKindsTypeToString(EDataType eDataType, Object instanceValue) {
		if (instanceValue == null) return null;
		List<?> list = (List<?>)instanceValue;
		if (list.isEmpty()) return "";
		StringBuffer result = new StringBuffer();
		for (Object item : list) {
			result.append(convertFmiDependencyFactorKindToString(FmiModelPackage.Literals.FMI_DEPENDENCY_FACTOR_KIND, item));
			result.append(' ');
		}
		return result.substring(0, result.length() - 1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public List<Integer> createStateDependenciesTypeFromString(EDataType eDataType, String initialValue) {
		if (initialValue == null) return null;
		List<Integer> result = new ArrayList<Integer>();
		for (String item : split(initialValue)) {
			result.add((Integer)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.INT, item));
		}
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertStateDependenciesTypeToString(EDataType eDataType, Object instanceValue) {
		if (instanceValue == null) return null;
		List<?> list = (List<?>)instanceValue;
		if (list.isEmpty()) return "";
		StringBuffer result = new StringBuffer();
		for (Object item : list) {
			result.append(XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.INT, item));
			result.append(' ');
		}
		return result.substring(0, result.length() - 1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public List<FmiDependencyFactorKind> createStateFactorKindsTypeFromString(EDataType eDataType, String initialValue) {
		if (initialValue == null) return null;
		List<FmiDependencyFactorKind> result = new ArrayList<FmiDependencyFactorKind>();
		for (String item : split(initialValue)) {
			result.add(createFmiDependencyFactorKindFromString(FmiModelPackage.Literals.FMI_DEPENDENCY_FACTOR_KIND, item));
		}
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertStateFactorKindsTypeToString(EDataType eDataType, Object instanceValue) {
		if (instanceValue == null) return null;
		List<?> list = (List<?>)instanceValue;
		if (list.isEmpty()) return "";
		StringBuffer result = new StringBuffer();
		for (Object item : list) {
			result.append(convertFmiDependencyFactorKindToString(FmiModelPackage.Literals.FMI_DEPENDENCY_FACTOR_KIND, item));
			result.append(' ');
		}
		return result.substring(0, result.length() - 1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VariabilityType createVariabilityTypeObjectFromString(EDataType eDataType, String initialValue) {
		return createVariabilityTypeFromString(FmiModelPackage.Literals.VARIABILITY_TYPE, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertVariabilityTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertVariabilityTypeToString(FmiModelPackage.Literals.VARIABILITY_TYPE, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VariableNamingConventionType createVariableNamingConventionTypeObjectFromString(EDataType eDataType, String initialValue) {
		return createVariableNamingConventionTypeFromString(FmiModelPackage.Literals.VARIABLE_NAMING_CONVENTION_TYPE, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertVariableNamingConventionTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertVariableNamingConventionTypeToString(FmiModelPackage.Literals.VARIABLE_NAMING_CONVENTION_TYPE, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FmiModelPackage getFmiModelPackage() {
		return (FmiModelPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static FmiModelPackage getPackage() {
		return FmiModelPackage.eINSTANCE;
	}

} //FmiModelFactoryImpl
