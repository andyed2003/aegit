/**
 */
package FmiModel.util;

import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.ResourceLocator;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.util.EObjectValidator;
import org.eclipse.emf.ecore.xml.type.XMLTypePackage;
import org.eclipse.emf.ecore.xml.type.util.XMLTypeValidator;

import FmiModel.BaseUnitType;
import FmiModel.BooleanType;
import FmiModel.CategoryType;
import FmiModel.CausalityType;
import FmiModel.CoSimulationType;
import FmiModel.DefaultExperimentType;
import FmiModel.DerivativeType;
import FmiModel.DerivativesType;
import FmiModel.DisplayUnitType;
import FmiModel.DocumentRoot;
import FmiModel.EnumerationType;
import FmiModel.EnumerationType1;
import FmiModel.FmiAnnotation;
import FmiModel.FmiDependencyFactorKind;
import FmiModel.FmiModelDescriptionType;
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
 * The <b>Validator</b> for the model.
 * <!-- end-user-doc -->
 * @see FmiModel.FmiModelPackage
 * @generated
 */
public class FmiModelValidator extends EObjectValidator {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final FmiModelValidator INSTANCE = new FmiModelValidator();

	/**
	 * A constant for the {@link org.eclipse.emf.common.util.Diagnostic#getSource() source} of diagnostic {@link org.eclipse.emf.common.util.Diagnostic#getCode() codes} from this package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.common.util.Diagnostic#getSource()
	 * @see org.eclipse.emf.common.util.Diagnostic#getCode()
	 * @generated
	 */
	public static final String DIAGNOSTIC_SOURCE = "FmiModel";

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final int GENERATED_DIAGNOSTIC_CODE_COUNT = 0;

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants in a derived class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final int DIAGNOSTIC_CODE_COUNT = GENERATED_DIAGNOSTIC_CODE_COUNT;

	/**
	 * The cached base package validator.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected XMLTypeValidator xmlTypeValidator;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FmiModelValidator() {
		super();
		xmlTypeValidator = XMLTypeValidator.INSTANCE;
	}

	/**
	 * Returns the package of this validator switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EPackage getEPackage() {
	  return FmiModelPackage.eINSTANCE;
	}

	/**
	 * Calls <code>validateXXX</code> for the corresponding classifier of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected boolean validate(int classifierID, Object value, DiagnosticChain diagnostics, Map<Object, Object> context) {
		switch (classifierID) {
			case FmiModelPackage.BASE_UNIT_TYPE:
				return validateBaseUnitType((BaseUnitType)value, diagnostics, context);
			case FmiModelPackage.BOOLEAN_TYPE:
				return validateBooleanType((BooleanType)value, diagnostics, context);
			case FmiModelPackage.CATEGORY_TYPE:
				return validateCategoryType((CategoryType)value, diagnostics, context);
			case FmiModelPackage.CO_SIMULATION_TYPE:
				return validateCoSimulationType((CoSimulationType)value, diagnostics, context);
			case FmiModelPackage.DEFAULT_EXPERIMENT_TYPE:
				return validateDefaultExperimentType((DefaultExperimentType)value, diagnostics, context);
			case FmiModelPackage.DERIVATIVES_TYPE:
				return validateDerivativesType((DerivativesType)value, diagnostics, context);
			case FmiModelPackage.DERIVATIVE_TYPE:
				return validateDerivativeType((DerivativeType)value, diagnostics, context);
			case FmiModelPackage.DISPLAY_UNIT_TYPE:
				return validateDisplayUnitType((DisplayUnitType)value, diagnostics, context);
			case FmiModelPackage.ENUMERATION_TYPE:
				return validateEnumerationType((EnumerationType)value, diagnostics, context);
			case FmiModelPackage.ENUMERATION_TYPE1:
				return validateEnumerationType1((EnumerationType1)value, diagnostics, context);
			case FmiModelPackage.FMI_ANNOTATION:
				return validateFmiAnnotation((FmiAnnotation)value, diagnostics, context);
			case FmiModelPackage.FMI_MODEL_DESCRIPTION_TYPE:
				return validateFmiModelDescriptionType((FmiModelDescriptionType)value, diagnostics, context);
			case FmiModelPackage.FMI_SCALAR_VARIABLE:
				return validateFmiScalarVariable((FmiScalarVariable)value, diagnostics, context);
			case FmiModelPackage.FMI_SIMPLE_TYPE:
				return validateFmiSimpleType((FmiSimpleType)value, diagnostics, context);
			case FmiModelPackage.FMI_UNIT:
				return validateFmiUnit((FmiUnit)value, diagnostics, context);
			case FmiModelPackage.FMI_VARIABLE_DEPENDENCY:
				return validateFmiVariableDependency((FmiVariableDependency)value, diagnostics, context);
			case FmiModelPackage.INPUTS_TYPE:
				return validateInputsType((InputsType)value, diagnostics, context);
			case FmiModelPackage.INPUT_TYPE:
				return validateInputType((InputType)value, diagnostics, context);
			case FmiModelPackage.INTEGER_TYPE:
				return validateIntegerType((IntegerType)value, diagnostics, context);
			case FmiModelPackage.INTEGER_TYPE1:
				return validateIntegerType1((IntegerType1)value, diagnostics, context);
			case FmiModelPackage.ITEM_TYPE:
				return validateItemType((ItemType)value, diagnostics, context);
			case FmiModelPackage.LOG_CATEGORIES_TYPE:
				return validateLogCategoriesType((LogCategoriesType)value, diagnostics, context);
			case FmiModelPackage.MODEL_EXCHANGE_TYPE:
				return validateModelExchangeType((ModelExchangeType)value, diagnostics, context);
			case FmiModelPackage.MODEL_STRUCTURE_TYPE:
				return validateModelStructureType((ModelStructureType)value, diagnostics, context);
			case FmiModelPackage.MODEL_VARIABLES_TYPE:
				return validateModelVariablesType((ModelVariablesType)value, diagnostics, context);
			case FmiModelPackage.OUTPUT_TYPE:
				return validateOutputType((OutputType)value, diagnostics, context);
			case FmiModelPackage.REAL_TYPE:
				return validateRealType((RealType)value, diagnostics, context);
			case FmiModelPackage.TOOL_TYPE:
				return validateToolType((ToolType)value, diagnostics, context);
			case FmiModelPackage.DOCUMENT_ROOT:
				return validateDocumentRoot((DocumentRoot)value, diagnostics, context);
			case FmiModelPackage.OUTPUTS_TYPE:
				return validateOutputsType((OutputsType)value, diagnostics, context);
			case FmiModelPackage.REAL_TYPE1:
				return validateRealType1((RealType1)value, diagnostics, context);
			case FmiModelPackage.STRING_TYPE:
				return validateStringType((StringType)value, diagnostics, context);
			case FmiModelPackage.TYPE_DEFINITIONS_TYPE:
				return validateTypeDefinitionsType((TypeDefinitionsType)value, diagnostics, context);
			case FmiModelPackage.UNIT_DEFINITIONS_TYPE:
				return validateUnitDefinitionsType((UnitDefinitionsType)value, diagnostics, context);
			case FmiModelPackage.CAUSALITY_TYPE:
				return validateCausalityType((CausalityType)value, diagnostics, context);
			case FmiModelPackage.FMI_DEPENDENCY_FACTOR_KIND:
				return validateFmiDependencyFactorKind((FmiDependencyFactorKind)value, diagnostics, context);
			case FmiModelPackage.INITIAL_TYPE:
				return validateInitialType((InitialType)value, diagnostics, context);
			case FmiModelPackage.VARIABILITY_TYPE:
				return validateVariabilityType((VariabilityType)value, diagnostics, context);
			case FmiModelPackage.VARIABLE_NAMING_CONVENTION_TYPE:
				return validateVariableNamingConventionType((VariableNamingConventionType)value, diagnostics, context);
			case FmiModelPackage.CAUSALITY_TYPE_OBJECT:
				return validateCausalityTypeObject((CausalityType)value, diagnostics, context);
			case FmiModelPackage.FMI_DEPENDENCY_FACTOR_KIND_OBJECT:
				return validateFmiDependencyFactorKindObject((FmiDependencyFactorKind)value, diagnostics, context);
			case FmiModelPackage.INITIAL_TYPE_OBJECT:
				return validateInitialTypeObject((InitialType)value, diagnostics, context);
			case FmiModelPackage.INPUT_DEPENDENCIES_TYPE:
				return validateInputDependenciesType((List<?>)value, diagnostics, context);
			case FmiModelPackage.INPUT_FACTOR_KINDS_TYPE:
				return validateInputFactorKindsType((List<?>)value, diagnostics, context);
			case FmiModelPackage.STATE_DEPENDENCIES_TYPE:
				return validateStateDependenciesType((List<?>)value, diagnostics, context);
			case FmiModelPackage.STATE_FACTOR_KINDS_TYPE:
				return validateStateFactorKindsType((List<?>)value, diagnostics, context);
			case FmiModelPackage.VARIABILITY_TYPE_OBJECT:
				return validateVariabilityTypeObject((VariabilityType)value, diagnostics, context);
			case FmiModelPackage.VARIABLE_NAMING_CONVENTION_TYPE_OBJECT:
				return validateVariableNamingConventionTypeObject((VariableNamingConventionType)value, diagnostics, context);
			default:
				return true;
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBaseUnitType(BaseUnitType baseUnitType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(baseUnitType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBooleanType(BooleanType booleanType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(booleanType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCategoryType(CategoryType categoryType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(categoryType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCoSimulationType(CoSimulationType coSimulationType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(coSimulationType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDefaultExperimentType(DefaultExperimentType defaultExperimentType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(defaultExperimentType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDerivativesType(DerivativesType derivativesType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(derivativesType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDerivativeType(DerivativeType derivativeType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(derivativeType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDisplayUnitType(DisplayUnitType displayUnitType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(displayUnitType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEnumerationType(EnumerationType enumerationType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(enumerationType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEnumerationType1(EnumerationType1 enumerationType1, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(enumerationType1, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFmiAnnotation(FmiAnnotation fmiAnnotation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(fmiAnnotation, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFmiModelDescriptionType(FmiModelDescriptionType fmiModelDescriptionType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(fmiModelDescriptionType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFmiScalarVariable(FmiScalarVariable fmiScalarVariable, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(fmiScalarVariable, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFmiSimpleType(FmiSimpleType fmiSimpleType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(fmiSimpleType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFmiUnit(FmiUnit fmiUnit, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(fmiUnit, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFmiVariableDependency(FmiVariableDependency fmiVariableDependency, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(fmiVariableDependency, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInputsType(InputsType inputsType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(inputsType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInputType(InputType inputType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(inputType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIntegerType(IntegerType integerType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(integerType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIntegerType1(IntegerType1 integerType1, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(integerType1, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateItemType(ItemType itemType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(itemType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLogCategoriesType(LogCategoriesType logCategoriesType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(logCategoriesType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateModelExchangeType(ModelExchangeType modelExchangeType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(modelExchangeType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateModelStructureType(ModelStructureType modelStructureType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(modelStructureType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateModelVariablesType(ModelVariablesType modelVariablesType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(modelVariablesType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOutputType(OutputType outputType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(outputType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRealType(RealType realType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(realType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateToolType(ToolType toolType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(toolType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDocumentRoot(DocumentRoot documentRoot, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(documentRoot, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOutputsType(OutputsType outputsType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(outputsType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRealType1(RealType1 realType1, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(realType1, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStringType(StringType stringType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(stringType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTypeDefinitionsType(TypeDefinitionsType typeDefinitionsType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(typeDefinitionsType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateUnitDefinitionsType(UnitDefinitionsType unitDefinitionsType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(unitDefinitionsType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCausalityType(CausalityType causalityType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFmiDependencyFactorKind(FmiDependencyFactorKind fmiDependencyFactorKind, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInitialType(InitialType initialType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateVariabilityType(VariabilityType variabilityType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateVariableNamingConventionType(VariableNamingConventionType variableNamingConventionType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCausalityTypeObject(CausalityType causalityTypeObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFmiDependencyFactorKindObject(FmiDependencyFactorKind fmiDependencyFactorKindObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInitialTypeObject(InitialType initialTypeObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInputDependenciesType(List<?> inputDependenciesType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateInputDependenciesType_ItemType(inputDependenciesType, diagnostics, context);
		return result;
	}

	/**
	 * Validates the ItemType constraint of '<em>Input Dependencies Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInputDependenciesType_ItemType(List<?> inputDependenciesType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = true;
		for (Iterator<?> i = inputDependenciesType.iterator(); i.hasNext() && (result || diagnostics != null); ) {
			Object item = i.next();
			if (XMLTypePackage.Literals.INT.isInstance(item)) {
				result &= xmlTypeValidator.validateInt((Integer)item, diagnostics, context);
			}
			else {
				result = false;
				reportDataValueTypeViolation(XMLTypePackage.Literals.INT, item, diagnostics, context);
			}
		}
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInputFactorKindsType(List<?> inputFactorKindsType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateInputFactorKindsType_ItemType(inputFactorKindsType, diagnostics, context);
		return result;
	}

	/**
	 * Validates the ItemType constraint of '<em>Input Factor Kinds Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInputFactorKindsType_ItemType(List<?> inputFactorKindsType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = true;
		for (Iterator<?> i = inputFactorKindsType.iterator(); i.hasNext() && (result || diagnostics != null); ) {
			Object item = i.next();
			if (FmiModelPackage.Literals.FMI_DEPENDENCY_FACTOR_KIND.isInstance(item)) {
				result &= validateFmiDependencyFactorKind((FmiDependencyFactorKind)item, diagnostics, context);
			}
			else {
				result = false;
				reportDataValueTypeViolation(FmiModelPackage.Literals.FMI_DEPENDENCY_FACTOR_KIND, item, diagnostics, context);
			}
		}
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStateDependenciesType(List<?> stateDependenciesType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateStateDependenciesType_ItemType(stateDependenciesType, diagnostics, context);
		return result;
	}

	/**
	 * Validates the ItemType constraint of '<em>State Dependencies Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStateDependenciesType_ItemType(List<?> stateDependenciesType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = true;
		for (Iterator<?> i = stateDependenciesType.iterator(); i.hasNext() && (result || diagnostics != null); ) {
			Object item = i.next();
			if (XMLTypePackage.Literals.INT.isInstance(item)) {
				result &= xmlTypeValidator.validateInt((Integer)item, diagnostics, context);
			}
			else {
				result = false;
				reportDataValueTypeViolation(XMLTypePackage.Literals.INT, item, diagnostics, context);
			}
		}
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStateFactorKindsType(List<?> stateFactorKindsType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateStateFactorKindsType_ItemType(stateFactorKindsType, diagnostics, context);
		return result;
	}

	/**
	 * Validates the ItemType constraint of '<em>State Factor Kinds Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStateFactorKindsType_ItemType(List<?> stateFactorKindsType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = true;
		for (Iterator<?> i = stateFactorKindsType.iterator(); i.hasNext() && (result || diagnostics != null); ) {
			Object item = i.next();
			if (FmiModelPackage.Literals.FMI_DEPENDENCY_FACTOR_KIND.isInstance(item)) {
				result &= validateFmiDependencyFactorKind((FmiDependencyFactorKind)item, diagnostics, context);
			}
			else {
				result = false;
				reportDataValueTypeViolation(FmiModelPackage.Literals.FMI_DEPENDENCY_FACTOR_KIND, item, diagnostics, context);
			}
		}
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateVariabilityTypeObject(VariabilityType variabilityTypeObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateVariableNamingConventionTypeObject(VariableNamingConventionType variableNamingConventionTypeObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * Returns the resource locator that will be used to fetch messages for this validator's diagnostics.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		// TODO
		// Specialize this to return a resource locator for messages specific to this validator.
		// Ensure that you remove @generated or mark it @generated NOT
		return super.getResourceLocator();
	}

} //FmiModelValidator
