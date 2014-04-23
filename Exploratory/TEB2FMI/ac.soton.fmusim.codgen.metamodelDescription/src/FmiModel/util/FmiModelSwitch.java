/**
 */
package FmiModel.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.util.Switch;

import FmiModel.BaseUnitType;
import FmiModel.BooleanType;
import FmiModel.CategoryType;
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
import FmiModel.FmiModelDescriptionType;
import FmiModel.FmiModelPackage;
import FmiModel.FmiScalarVariable;
import FmiModel.FmiSimpleType;
import FmiModel.FmiUnit;
import FmiModel.FmiVariableDependency;
import FmiModel.Implementation;
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

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see FmiModel.FmiModelPackage
 * @generated
 */
public class FmiModelSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static FmiModelPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FmiModelSwitch() {
		if (modelPackage == null) {
			modelPackage = FmiModelPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @parameter ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case FmiModelPackage.BASE_UNIT_TYPE: {
				BaseUnitType baseUnitType = (BaseUnitType)theEObject;
				T result = caseBaseUnitType(baseUnitType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FmiModelPackage.BOOLEAN_TYPE: {
				BooleanType booleanType = (BooleanType)theEObject;
				T result = caseBooleanType(booleanType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FmiModelPackage.CATEGORY_TYPE: {
				CategoryType categoryType = (CategoryType)theEObject;
				T result = caseCategoryType(categoryType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FmiModelPackage.CO_SIMULATION_TYPE: {
				CoSimulationType coSimulationType = (CoSimulationType)theEObject;
				T result = caseCoSimulationType(coSimulationType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FmiModelPackage.DEFAULT_EXPERIMENT_TYPE: {
				DefaultExperimentType defaultExperimentType = (DefaultExperimentType)theEObject;
				T result = caseDefaultExperimentType(defaultExperimentType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FmiModelPackage.DERIVATIVES_TYPE: {
				DerivativesType derivativesType = (DerivativesType)theEObject;
				T result = caseDerivativesType(derivativesType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FmiModelPackage.DERIVATIVE_TYPE: {
				DerivativeType derivativeType = (DerivativeType)theEObject;
				T result = caseDerivativeType(derivativeType);
				if (result == null) result = caseFmiVariableDependency(derivativeType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FmiModelPackage.DISPLAY_UNIT_TYPE: {
				DisplayUnitType displayUnitType = (DisplayUnitType)theEObject;
				T result = caseDisplayUnitType(displayUnitType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FmiModelPackage.ENUMERATION_TYPE: {
				EnumerationType enumerationType = (EnumerationType)theEObject;
				T result = caseEnumerationType(enumerationType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FmiModelPackage.ENUMERATION_TYPE1: {
				EnumerationType1 enumerationType1 = (EnumerationType1)theEObject;
				T result = caseEnumerationType1(enumerationType1);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FmiModelPackage.FMI_ANNOTATION: {
				FmiAnnotation fmiAnnotation = (FmiAnnotation)theEObject;
				T result = caseFmiAnnotation(fmiAnnotation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FmiModelPackage.FMI_MODEL_DESCRIPTION_TYPE: {
				FmiModelDescriptionType fmiModelDescriptionType = (FmiModelDescriptionType)theEObject;
				T result = caseFmiModelDescriptionType(fmiModelDescriptionType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FmiModelPackage.FMI_SCALAR_VARIABLE: {
				FmiScalarVariable fmiScalarVariable = (FmiScalarVariable)theEObject;
				T result = caseFmiScalarVariable(fmiScalarVariable);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FmiModelPackage.FMI_SIMPLE_TYPE: {
				FmiSimpleType fmiSimpleType = (FmiSimpleType)theEObject;
				T result = caseFmiSimpleType(fmiSimpleType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FmiModelPackage.FMI_UNIT: {
				FmiUnit fmiUnit = (FmiUnit)theEObject;
				T result = caseFmiUnit(fmiUnit);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FmiModelPackage.FMI_VARIABLE_DEPENDENCY: {
				FmiVariableDependency fmiVariableDependency = (FmiVariableDependency)theEObject;
				T result = caseFmiVariableDependency(fmiVariableDependency);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FmiModelPackage.INPUTS_TYPE: {
				InputsType inputsType = (InputsType)theEObject;
				T result = caseInputsType(inputsType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FmiModelPackage.INPUT_TYPE: {
				InputType inputType = (InputType)theEObject;
				T result = caseInputType(inputType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FmiModelPackage.INTEGER_TYPE: {
				IntegerType integerType = (IntegerType)theEObject;
				T result = caseIntegerType(integerType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FmiModelPackage.INTEGER_TYPE1: {
				IntegerType1 integerType1 = (IntegerType1)theEObject;
				T result = caseIntegerType1(integerType1);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FmiModelPackage.ITEM_TYPE: {
				ItemType itemType = (ItemType)theEObject;
				T result = caseItemType(itemType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FmiModelPackage.LOG_CATEGORIES_TYPE: {
				LogCategoriesType logCategoriesType = (LogCategoriesType)theEObject;
				T result = caseLogCategoriesType(logCategoriesType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FmiModelPackage.MODEL_EXCHANGE_TYPE: {
				ModelExchangeType modelExchangeType = (ModelExchangeType)theEObject;
				T result = caseModelExchangeType(modelExchangeType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FmiModelPackage.MODEL_STRUCTURE_TYPE: {
				ModelStructureType modelStructureType = (ModelStructureType)theEObject;
				T result = caseModelStructureType(modelStructureType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FmiModelPackage.MODEL_VARIABLES_TYPE: {
				ModelVariablesType modelVariablesType = (ModelVariablesType)theEObject;
				T result = caseModelVariablesType(modelVariablesType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FmiModelPackage.OUTPUT_TYPE: {
				OutputType outputType = (OutputType)theEObject;
				T result = caseOutputType(outputType);
				if (result == null) result = caseFmiVariableDependency(outputType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FmiModelPackage.REAL_TYPE: {
				RealType realType = (RealType)theEObject;
				T result = caseRealType(realType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FmiModelPackage.TOOL_TYPE: {
				ToolType toolType = (ToolType)theEObject;
				T result = caseToolType(toolType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FmiModelPackage.DOCUMENT_ROOT: {
				DocumentRoot documentRoot = (DocumentRoot)theEObject;
				T result = caseDocumentRoot(documentRoot);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FmiModelPackage.OUTPUTS_TYPE: {
				OutputsType outputsType = (OutputsType)theEObject;
				T result = caseOutputsType(outputsType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FmiModelPackage.REAL_TYPE1: {
				RealType1 realType1 = (RealType1)theEObject;
				T result = caseRealType1(realType1);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FmiModelPackage.STRING_TYPE: {
				StringType stringType = (StringType)theEObject;
				T result = caseStringType(stringType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FmiModelPackage.TYPE_DEFINITIONS_TYPE: {
				TypeDefinitionsType typeDefinitionsType = (TypeDefinitionsType)theEObject;
				T result = caseTypeDefinitionsType(typeDefinitionsType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FmiModelPackage.UNIT_DEFINITIONS_TYPE: {
				UnitDefinitionsType unitDefinitionsType = (UnitDefinitionsType)theEObject;
				T result = caseUnitDefinitionsType(unitDefinitionsType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FmiModelPackage.IMPLEMENTATION: {
				Implementation implementation = (Implementation)theEObject;
				T result = caseImplementation(implementation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FmiModelPackage.FMI_CO_SIMULATION_CAPABILITIES_TYPE: {
				FmiCoSimulationCapabilitiesType fmiCoSimulationCapabilitiesType = (FmiCoSimulationCapabilitiesType)theEObject;
				T result = caseFmiCoSimulationCapabilitiesType(fmiCoSimulationCapabilitiesType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FmiModelPackage.CO_SIMULATION_STAND_ALONE: {
				CoSimulation_StandAlone coSimulation_StandAlone = (CoSimulation_StandAlone)theEObject;
				T result = caseCoSimulation_StandAlone(coSimulation_StandAlone);
				if (result == null) result = caseImplementation(coSimulation_StandAlone);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FmiModelPackage.CO_SIMULATION_TOOL: {
				CoSimulation_Tool coSimulation_Tool = (CoSimulation_Tool)theEObject;
				T result = caseCoSimulation_Tool(coSimulation_Tool);
				if (result == null) result = caseImplementation(coSimulation_Tool);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Base Unit Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Base Unit Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBaseUnitType(BaseUnitType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Boolean Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Boolean Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBooleanType(BooleanType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Category Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Category Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCategoryType(CategoryType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Co Simulation Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Co Simulation Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCoSimulationType(CoSimulationType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Default Experiment Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Default Experiment Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDefaultExperimentType(DefaultExperimentType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Derivatives Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Derivatives Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDerivativesType(DerivativesType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Derivative Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Derivative Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDerivativeType(DerivativeType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Display Unit Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Display Unit Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDisplayUnitType(DisplayUnitType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Enumeration Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Enumeration Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEnumerationType(EnumerationType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Enumeration Type1</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Enumeration Type1</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEnumerationType1(EnumerationType1 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Fmi Annotation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Fmi Annotation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFmiAnnotation(FmiAnnotation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Description Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Description Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFmiModelDescriptionType(FmiModelDescriptionType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Fmi Scalar Variable</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Fmi Scalar Variable</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFmiScalarVariable(FmiScalarVariable object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Fmi Simple Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Fmi Simple Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFmiSimpleType(FmiSimpleType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Fmi Unit</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Fmi Unit</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFmiUnit(FmiUnit object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Fmi Variable Dependency</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Fmi Variable Dependency</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFmiVariableDependency(FmiVariableDependency object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Inputs Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Inputs Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInputsType(InputsType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Input Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Input Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInputType(InputType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Integer Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Integer Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIntegerType(IntegerType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Integer Type1</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Integer Type1</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIntegerType1(IntegerType1 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Item Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Item Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseItemType(ItemType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Log Categories Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Log Categories Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLogCategoriesType(LogCategoriesType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Model Exchange Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Model Exchange Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseModelExchangeType(ModelExchangeType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Model Structure Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Model Structure Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseModelStructureType(ModelStructureType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Model Variables Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Model Variables Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseModelVariablesType(ModelVariablesType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Output Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Output Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOutputType(OutputType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Real Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Real Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRealType(RealType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Tool Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Tool Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseToolType(ToolType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Document Root</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Document Root</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDocumentRoot(DocumentRoot object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Outputs Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Outputs Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOutputsType(OutputsType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Real Type1</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Real Type1</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRealType1(RealType1 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>String Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>String Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStringType(StringType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Type Definitions Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Type Definitions Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTypeDefinitionsType(TypeDefinitionsType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Unit Definitions Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Unit Definitions Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUnitDefinitionsType(UnitDefinitionsType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Implementation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Implementation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseImplementation(Implementation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Fmi Co Simulation Capabilities Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Fmi Co Simulation Capabilities Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFmiCoSimulationCapabilitiesType(FmiCoSimulationCapabilitiesType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Co Simulation Stand Alone</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Co Simulation Stand Alone</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCoSimulation_StandAlone(CoSimulation_StandAlone object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Co Simulation Tool</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Co Simulation Tool</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCoSimulation_Tool(CoSimulation_Tool object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //FmiModelSwitch
