/**
 */
package FmiModel.impl;

import java.util.List;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EValidator;
import org.eclipse.emf.ecore.impl.EPackageImpl;
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
import FmiModel.Implementation;
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
import FmiModel.util.FmiModelValidator;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class FmiModelPackageImpl extends EPackageImpl implements FmiModelPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass baseUnitTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass booleanTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass categoryTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass coSimulationTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass defaultExperimentTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass derivativesTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass derivativeTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass displayUnitTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass enumerationTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass enumerationType1EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fmiAnnotationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fmiModelDescriptionTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fmiScalarVariableEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fmiSimpleTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fmiUnitEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fmiVariableDependencyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass inputsTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass inputTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass integerTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass integerType1EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass itemTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass logCategoriesTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass modelExchangeTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass modelStructureTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass modelVariablesTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass outputTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass realTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass toolTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass documentRootEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass outputsTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass realType1EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass stringTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass typeDefinitionsTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass unitDefinitionsTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass implementationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fmiCoSimulationCapabilitiesTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass coSimulation_StandAloneEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass coSimulation_ToolEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum causalityTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum fmiDependencyFactorKindEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum initialTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum variabilityTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum variableNamingConventionTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType causalityTypeObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType fmiDependencyFactorKindObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType initialTypeObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType inputDependenciesTypeEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType inputFactorKindsTypeEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType stateDependenciesTypeEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType stateFactorKindsTypeEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType variabilityTypeObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType variableNamingConventionTypeObjectEDataType = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see FmiModel.FmiModelPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private FmiModelPackageImpl() {
		super(eNS_URI, FmiModelFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link FmiModelPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static FmiModelPackage init() {
		if (isInited) return (FmiModelPackage)EPackage.Registry.INSTANCE.getEPackage(FmiModelPackage.eNS_URI);

		// Obtain or create and register package
		FmiModelPackageImpl theFmiModelPackage = (FmiModelPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof FmiModelPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new FmiModelPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		XMLTypePackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theFmiModelPackage.createPackageContents();

		// Initialize created meta-data
		theFmiModelPackage.initializePackageContents();

		// Register package validator
		EValidator.Registry.INSTANCE.put
			(theFmiModelPackage, 
			 new EValidator.Descriptor() {
				 public EValidator getEValidator() {
					 return FmiModelValidator.INSTANCE;
				 }
			 });

		// Mark meta-data to indicate it can't be changed
		theFmiModelPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(FmiModelPackage.eNS_URI, theFmiModelPackage);
		return theFmiModelPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBaseUnitType() {
		return baseUnitTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBaseUnitType_A() {
		return (EAttribute)baseUnitTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBaseUnitType_Cd() {
		return (EAttribute)baseUnitTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBaseUnitType_Factor() {
		return (EAttribute)baseUnitTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBaseUnitType_K() {
		return (EAttribute)baseUnitTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBaseUnitType_Kg() {
		return (EAttribute)baseUnitTypeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBaseUnitType_M() {
		return (EAttribute)baseUnitTypeEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBaseUnitType_Mol() {
		return (EAttribute)baseUnitTypeEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBaseUnitType_Offset() {
		return (EAttribute)baseUnitTypeEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBaseUnitType_Rad() {
		return (EAttribute)baseUnitTypeEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBaseUnitType_S() {
		return (EAttribute)baseUnitTypeEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBooleanType() {
		return booleanTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBooleanType_DeclaredType() {
		return (EAttribute)booleanTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBooleanType_Start() {
		return (EAttribute)booleanTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCategoryType() {
		return categoryTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCategoryType_Name() {
		return (EAttribute)categoryTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCoSimulationType() {
		return coSimulationTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCoSimulationType_CanBeInstantiatedOnlyOncePerProcess() {
		return (EAttribute)coSimulationTypeEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCoSimulationType_CanGetAndSetFMUstate() {
		return (EAttribute)coSimulationTypeEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCoSimulationType_CanHandleEvents() {
		return (EAttribute)coSimulationTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCoSimulationType_CanRejectSteps() {
		return (EAttribute)coSimulationTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCoSimulationType_CanHandleVariableCommunicationStepSize() {
		return (EAttribute)coSimulationTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCoSimulationType_CanInterpolateInputs() {
		return (EAttribute)coSimulationTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCoSimulationType_CanNotUseMemoryManagementFunctions() {
		return (EAttribute)coSimulationTypeEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCoSimulationType_CanRunAsynchronuously() {
		return (EAttribute)coSimulationTypeEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCoSimulationType_CanSerializeFMUstate() {
		return (EAttribute)coSimulationTypeEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCoSimulationType_CanSignalEvents() {
		return (EAttribute)coSimulationTypeEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCoSimulationType_MaxOutputDerivativeOrder() {
		return (EAttribute)coSimulationTypeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCoSimulationType_ModelIdentifier() {
		return (EAttribute)coSimulationTypeEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCoSimulationType_NeedsExecutionTool() {
		return (EAttribute)coSimulationTypeEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCoSimulationType_ProvidesPartialDerivativesOfDerivativeFunctionWrtInputs() {
		return (EAttribute)coSimulationTypeEClass.getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCoSimulationType_ProvidesPartialDerivativesOfDerivativeFunctionWrtStates() {
		return (EAttribute)coSimulationTypeEClass.getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCoSimulationType_ProvidesPartialDerivativesOfOutputFunctionWrtInputs() {
		return (EAttribute)coSimulationTypeEClass.getEStructuralFeatures().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCoSimulationType_ProvidesPartialDerivativesOfOutputFunctionWrtStates() {
		return (EAttribute)coSimulationTypeEClass.getEStructuralFeatures().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDefaultExperimentType() {
		return defaultExperimentTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDefaultExperimentType_StartTime() {
		return (EAttribute)defaultExperimentTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDefaultExperimentType_StopTime() {
		return (EAttribute)defaultExperimentTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDefaultExperimentType_Tolerance() {
		return (EAttribute)defaultExperimentTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDefaultExperimentType_StepSize() {
		return (EAttribute)defaultExperimentTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDerivativesType() {
		return derivativesTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDerivativesType_Group() {
		return (EAttribute)derivativesTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDerivativesType_Derivative() {
		return (EReference)derivativesTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDerivativeType() {
		return derivativeTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDerivativeType_Name() {
		return (EAttribute)derivativeTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDerivativeType_State() {
		return (EAttribute)derivativeTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDisplayUnitType() {
		return displayUnitTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDisplayUnitType_Factor() {
		return (EAttribute)displayUnitTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDisplayUnitType_Name() {
		return (EAttribute)displayUnitTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDisplayUnitType_Offset() {
		return (EAttribute)displayUnitTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEnumerationType() {
		return enumerationTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEnumerationType_DeclaredType() {
		return (EAttribute)enumerationTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEnumerationType_Max() {
		return (EAttribute)enumerationTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEnumerationType_Min() {
		return (EAttribute)enumerationTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEnumerationType_Quantity() {
		return (EAttribute)enumerationTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEnumerationType_Start() {
		return (EAttribute)enumerationTypeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEnumerationType1() {
		return enumerationType1EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEnumerationType1_Group() {
		return (EAttribute)enumerationType1EClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEnumerationType1_Item() {
		return (EReference)enumerationType1EClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEnumerationType1_Quantity() {
		return (EAttribute)enumerationType1EClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFmiAnnotation() {
		return fmiAnnotationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFmiAnnotation_Group() {
		return (EAttribute)fmiAnnotationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFmiAnnotation_Tool() {
		return (EReference)fmiAnnotationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFmiModelDescriptionType() {
		return fmiModelDescriptionTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFmiModelDescriptionType_Group() {
		return (EAttribute)fmiModelDescriptionTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFmiModelDescriptionType_ModelExchange() {
		return (EReference)fmiModelDescriptionTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFmiModelDescriptionType_CoSimulation() {
		return (EReference)fmiModelDescriptionTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFmiModelDescriptionType_UnitDefinitions() {
		return (EReference)fmiModelDescriptionTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFmiModelDescriptionType_TypeDefinitions() {
		return (EReference)fmiModelDescriptionTypeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFmiModelDescriptionType_LogCategories() {
		return (EReference)fmiModelDescriptionTypeEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFmiModelDescriptionType_DefaultExperiment() {
		return (EReference)fmiModelDescriptionTypeEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFmiModelDescriptionType_VendorAnnotations() {
		return (EReference)fmiModelDescriptionTypeEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFmiModelDescriptionType_ModelVariables() {
		return (EReference)fmiModelDescriptionTypeEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFmiModelDescriptionType_ModelStructure() {
		return (EReference)fmiModelDescriptionTypeEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFmiModelDescriptionType_Implementation() {
		return (EReference)fmiModelDescriptionTypeEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFmiModelDescriptionType_Author() {
		return (EAttribute)fmiModelDescriptionTypeEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFmiModelDescriptionType_Copyright() {
		return (EAttribute)fmiModelDescriptionTypeEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFmiModelDescriptionType_Description() {
		return (EAttribute)fmiModelDescriptionTypeEClass.getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFmiModelDescriptionType_FmiVersion() {
		return (EAttribute)fmiModelDescriptionTypeEClass.getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFmiModelDescriptionType_GenerationDateAndTime() {
		return (EAttribute)fmiModelDescriptionTypeEClass.getEStructuralFeatures().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFmiModelDescriptionType_GenerationTool() {
		return (EAttribute)fmiModelDescriptionTypeEClass.getEStructuralFeatures().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFmiModelDescriptionType_Guid() {
		return (EAttribute)fmiModelDescriptionTypeEClass.getEStructuralFeatures().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFmiModelDescriptionType_License() {
		return (EAttribute)fmiModelDescriptionTypeEClass.getEStructuralFeatures().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFmiModelDescriptionType_ModelName() {
		return (EAttribute)fmiModelDescriptionTypeEClass.getEStructuralFeatures().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFmiModelDescriptionType_NumberOfEventIndicators() {
		return (EAttribute)fmiModelDescriptionTypeEClass.getEStructuralFeatures().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFmiModelDescriptionType_VariableNamingConvention() {
		return (EAttribute)fmiModelDescriptionTypeEClass.getEStructuralFeatures().get(21);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFmiModelDescriptionType_Version() {
		return (EAttribute)fmiModelDescriptionTypeEClass.getEStructuralFeatures().get(22);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFmiModelDescriptionType_ModelIdentifier() {
		return (EAttribute)fmiModelDescriptionTypeEClass.getEStructuralFeatures().get(23);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFmiModelDescriptionType_NumberOfContinuousStates() {
		return (EAttribute)fmiModelDescriptionTypeEClass.getEStructuralFeatures().get(24);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFmiScalarVariable() {
		return fmiScalarVariableEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFmiScalarVariable_Real() {
		return (EReference)fmiScalarVariableEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFmiScalarVariable_Integer() {
		return (EReference)fmiScalarVariableEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFmiScalarVariable_Boolean() {
		return (EReference)fmiScalarVariableEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFmiScalarVariable_String() {
		return (EReference)fmiScalarVariableEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFmiScalarVariable_Enumeration() {
		return (EReference)fmiScalarVariableEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFmiScalarVariable_Annotations() {
		return (EReference)fmiScalarVariableEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFmiScalarVariable_Causality() {
		return (EAttribute)fmiScalarVariableEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFmiScalarVariable_Description() {
		return (EAttribute)fmiScalarVariableEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFmiScalarVariable_Initial() {
		return (EAttribute)fmiScalarVariableEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFmiScalarVariable_Name() {
		return (EAttribute)fmiScalarVariableEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFmiScalarVariable_ValueReference() {
		return (EAttribute)fmiScalarVariableEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFmiScalarVariable_Variability() {
		return (EAttribute)fmiScalarVariableEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFmiSimpleType() {
		return fmiSimpleTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFmiSimpleType_Real() {
		return (EReference)fmiSimpleTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFmiSimpleType_Integer() {
		return (EReference)fmiSimpleTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFmiSimpleType_Boolean() {
		return (EReference)fmiSimpleTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFmiSimpleType_String() {
		return (EReference)fmiSimpleTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFmiSimpleType_Enumeration() {
		return (EReference)fmiSimpleTypeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFmiSimpleType_Description() {
		return (EAttribute)fmiSimpleTypeEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFmiSimpleType_Name() {
		return (EAttribute)fmiSimpleTypeEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFmiUnit() {
		return fmiUnitEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFmiUnit_BaseUnit() {
		return (EReference)fmiUnitEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFmiUnit_Group() {
		return (EAttribute)fmiUnitEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFmiUnit_DisplayUnit() {
		return (EReference)fmiUnitEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFmiUnit_Name() {
		return (EAttribute)fmiUnitEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFmiVariableDependency() {
		return fmiVariableDependencyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFmiVariableDependency_InputDependencies() {
		return (EAttribute)fmiVariableDependencyEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFmiVariableDependency_InputFactorKinds() {
		return (EAttribute)fmiVariableDependencyEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFmiVariableDependency_StateDependencies() {
		return (EAttribute)fmiVariableDependencyEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFmiVariableDependency_StateFactorKinds() {
		return (EAttribute)fmiVariableDependencyEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInputsType() {
		return inputsTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getInputsType_Group() {
		return (EAttribute)inputsTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInputsType_Input() {
		return (EReference)inputsTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInputType() {
		return inputTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getInputType_Derivative() {
		return (EAttribute)inputTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getInputType_Name() {
		return (EAttribute)inputTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIntegerType() {
		return integerTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getIntegerType_DeclaredType() {
		return (EAttribute)integerTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getIntegerType_Max() {
		return (EAttribute)integerTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getIntegerType_Min() {
		return (EAttribute)integerTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getIntegerType_Quantity() {
		return (EAttribute)integerTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getIntegerType_Start() {
		return (EAttribute)integerTypeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIntegerType1() {
		return integerType1EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getIntegerType1_Max() {
		return (EAttribute)integerType1EClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getIntegerType1_Min() {
		return (EAttribute)integerType1EClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getIntegerType1_Quantity() {
		return (EAttribute)integerType1EClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getItemType() {
		return itemTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getItemType_Description() {
		return (EAttribute)itemTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getItemType_Name() {
		return (EAttribute)itemTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getItemType_Value() {
		return (EAttribute)itemTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLogCategoriesType() {
		return logCategoriesTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLogCategoriesType_Group() {
		return (EAttribute)logCategoriesTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLogCategoriesType_Category() {
		return (EReference)logCategoriesTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getModelExchangeType() {
		return modelExchangeTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getModelExchangeType_CanBeInstantiatedOnlyOncePerProcess() {
		return (EAttribute)modelExchangeTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getModelExchangeType_CanGetAndSetFMUstate() {
		return (EAttribute)modelExchangeTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getModelExchangeType_CanNotUseMemoryManagementFunctions() {
		return (EAttribute)modelExchangeTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getModelExchangeType_CanSerializeFMUstate() {
		return (EAttribute)modelExchangeTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getModelExchangeType_CompletedIntegratorStepNotNeeded() {
		return (EAttribute)modelExchangeTypeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getModelExchangeType_ModelIdentifier() {
		return (EAttribute)modelExchangeTypeEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getModelExchangeType_NeedsExecutionTool() {
		return (EAttribute)modelExchangeTypeEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getModelExchangeType_ProvidesDirectionalDerivatives() {
		return (EAttribute)modelExchangeTypeEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getModelExchangeType_ProvidesPartialDerivativesOfDerivativeFunctionWrtInputs() {
		return (EAttribute)modelExchangeTypeEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getModelExchangeType_ProvidesPartialDerivativesOfDerivativeFunctionWrtStates() {
		return (EAttribute)modelExchangeTypeEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getModelExchangeType_ProvidesPartialDerivativesOfOutputFunctionWrtInputs() {
		return (EAttribute)modelExchangeTypeEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getModelExchangeType_ProvidesPartialDerivativesOfOutputFunctionWrtStates() {
		return (EAttribute)modelExchangeTypeEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getModelStructureType() {
		return modelStructureTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getModelStructureType_Inputs() {
		return (EReference)modelStructureTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getModelStructureType_Derivatives() {
		return (EReference)modelStructureTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getModelStructureType_Outputs() {
		return (EReference)modelStructureTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getModelVariablesType() {
		return modelVariablesTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getModelVariablesType_Group() {
		return (EAttribute)modelVariablesTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getModelVariablesType_ScalarVariable() {
		return (EReference)modelVariablesTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOutputType() {
		return outputTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOutputType_Derivative() {
		return (EAttribute)outputTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOutputType_Name() {
		return (EAttribute)outputTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRealType() {
		return realTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRealType_DisplayUnit() {
		return (EAttribute)realTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRealType_Max() {
		return (EAttribute)realTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRealType_Min() {
		return (EAttribute)realTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRealType_Nominal() {
		return (EAttribute)realTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRealType_Quantity() {
		return (EAttribute)realTypeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRealType_RelativeQuantity() {
		return (EAttribute)realTypeEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRealType_Unbounded() {
		return (EAttribute)realTypeEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRealType_Unit() {
		return (EAttribute)realTypeEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getToolType() {
		return toolTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getToolType_Any() {
		return (EAttribute)toolTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getToolType_Name() {
		return (EAttribute)toolTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDocumentRoot() {
		return documentRootEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_Mixed() {
		return (EAttribute)documentRootEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_XMLNSPrefixMap() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_XSISchemaLocation() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_FmiModelDescription() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOutputsType() {
		return outputsTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOutputsType_Group() {
		return (EAttribute)outputsTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOutputsType_Output() {
		return (EReference)outputsTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRealType1() {
		return realType1EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRealType1_DeclaredType() {
		return (EAttribute)realType1EClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRealType1_DisplayUnit() {
		return (EAttribute)realType1EClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRealType1_Max() {
		return (EAttribute)realType1EClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRealType1_Min() {
		return (EAttribute)realType1EClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRealType1_Nominal() {
		return (EAttribute)realType1EClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRealType1_Quantity() {
		return (EAttribute)realType1EClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRealType1_RelativeQuantity() {
		return (EAttribute)realType1EClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRealType1_Start() {
		return (EAttribute)realType1EClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRealType1_Unbounded() {
		return (EAttribute)realType1EClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRealType1_Unit() {
		return (EAttribute)realType1EClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStringType() {
		return stringTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStringType_DeclaredType() {
		return (EAttribute)stringTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStringType_Start() {
		return (EAttribute)stringTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTypeDefinitionsType() {
		return typeDefinitionsTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTypeDefinitionsType_Group() {
		return (EAttribute)typeDefinitionsTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTypeDefinitionsType_SimpleType() {
		return (EReference)typeDefinitionsTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUnitDefinitionsType() {
		return unitDefinitionsTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUnitDefinitionsType_Group() {
		return (EAttribute)unitDefinitionsTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUnitDefinitionsType_Unit() {
		return (EReference)unitDefinitionsTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getImplementation() {
		return implementationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getImplementation_FmiCoSimulationCapabilities() {
		return (EReference)implementationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFmiCoSimulationCapabilitiesType() {
		return fmiCoSimulationCapabilitiesTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFmiCoSimulationCapabilitiesType_Capabilities() {
		return (EReference)fmiCoSimulationCapabilitiesTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCoSimulation_StandAlone() {
		return coSimulation_StandAloneEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCoSimulation_Tool() {
		return coSimulation_ToolEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getCausalityType() {
		return causalityTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getFmiDependencyFactorKind() {
		return fmiDependencyFactorKindEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getInitialType() {
		return initialTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getVariabilityType() {
		return variabilityTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getVariableNamingConventionType() {
		return variableNamingConventionTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getCausalityTypeObject() {
		return causalityTypeObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getFmiDependencyFactorKindObject() {
		return fmiDependencyFactorKindObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getInitialTypeObject() {
		return initialTypeObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getInputDependenciesType() {
		return inputDependenciesTypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getInputFactorKindsType() {
		return inputFactorKindsTypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getStateDependenciesType() {
		return stateDependenciesTypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getStateFactorKindsType() {
		return stateFactorKindsTypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getVariabilityTypeObject() {
		return variabilityTypeObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getVariableNamingConventionTypeObject() {
		return variableNamingConventionTypeObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FmiModelFactory getFmiModelFactory() {
		return (FmiModelFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		baseUnitTypeEClass = createEClass(BASE_UNIT_TYPE);
		createEAttribute(baseUnitTypeEClass, BASE_UNIT_TYPE__A);
		createEAttribute(baseUnitTypeEClass, BASE_UNIT_TYPE__CD);
		createEAttribute(baseUnitTypeEClass, BASE_UNIT_TYPE__FACTOR);
		createEAttribute(baseUnitTypeEClass, BASE_UNIT_TYPE__K);
		createEAttribute(baseUnitTypeEClass, BASE_UNIT_TYPE__KG);
		createEAttribute(baseUnitTypeEClass, BASE_UNIT_TYPE__M);
		createEAttribute(baseUnitTypeEClass, BASE_UNIT_TYPE__MOL);
		createEAttribute(baseUnitTypeEClass, BASE_UNIT_TYPE__OFFSET);
		createEAttribute(baseUnitTypeEClass, BASE_UNIT_TYPE__RAD);
		createEAttribute(baseUnitTypeEClass, BASE_UNIT_TYPE__S);

		booleanTypeEClass = createEClass(BOOLEAN_TYPE);
		createEAttribute(booleanTypeEClass, BOOLEAN_TYPE__DECLARED_TYPE);
		createEAttribute(booleanTypeEClass, BOOLEAN_TYPE__START);

		categoryTypeEClass = createEClass(CATEGORY_TYPE);
		createEAttribute(categoryTypeEClass, CATEGORY_TYPE__NAME);

		coSimulationTypeEClass = createEClass(CO_SIMULATION_TYPE);
		createEAttribute(coSimulationTypeEClass, CO_SIMULATION_TYPE__CAN_HANDLE_VARIABLE_COMMUNICATION_STEP_SIZE);
		createEAttribute(coSimulationTypeEClass, CO_SIMULATION_TYPE__CAN_HANDLE_EVENTS);
		createEAttribute(coSimulationTypeEClass, CO_SIMULATION_TYPE__CAN_REJECT_STEPS);
		createEAttribute(coSimulationTypeEClass, CO_SIMULATION_TYPE__CAN_INTERPOLATE_INPUTS);
		createEAttribute(coSimulationTypeEClass, CO_SIMULATION_TYPE__MAX_OUTPUT_DERIVATIVE_ORDER);
		createEAttribute(coSimulationTypeEClass, CO_SIMULATION_TYPE__CAN_RUN_ASYNCHRONUOUSLY);
		createEAttribute(coSimulationTypeEClass, CO_SIMULATION_TYPE__CAN_SIGNAL_EVENTS);
		createEAttribute(coSimulationTypeEClass, CO_SIMULATION_TYPE__CAN_BE_INSTANTIATED_ONLY_ONCE_PER_PROCESS);
		createEAttribute(coSimulationTypeEClass, CO_SIMULATION_TYPE__CAN_NOT_USE_MEMORY_MANAGEMENT_FUNCTIONS);
		createEAttribute(coSimulationTypeEClass, CO_SIMULATION_TYPE__CAN_GET_AND_SET_FM_USTATE);
		createEAttribute(coSimulationTypeEClass, CO_SIMULATION_TYPE__CAN_SERIALIZE_FM_USTATE);
		createEAttribute(coSimulationTypeEClass, CO_SIMULATION_TYPE__MODEL_IDENTIFIER);
		createEAttribute(coSimulationTypeEClass, CO_SIMULATION_TYPE__NEEDS_EXECUTION_TOOL);
		createEAttribute(coSimulationTypeEClass, CO_SIMULATION_TYPE__PROVIDES_PARTIAL_DERIVATIVES_OF_DERIVATIVE_FUNCTION_WRT_INPUTS);
		createEAttribute(coSimulationTypeEClass, CO_SIMULATION_TYPE__PROVIDES_PARTIAL_DERIVATIVES_OF_DERIVATIVE_FUNCTION_WRT_STATES);
		createEAttribute(coSimulationTypeEClass, CO_SIMULATION_TYPE__PROVIDES_PARTIAL_DERIVATIVES_OF_OUTPUT_FUNCTION_WRT_INPUTS);
		createEAttribute(coSimulationTypeEClass, CO_SIMULATION_TYPE__PROVIDES_PARTIAL_DERIVATIVES_OF_OUTPUT_FUNCTION_WRT_STATES);

		defaultExperimentTypeEClass = createEClass(DEFAULT_EXPERIMENT_TYPE);
		createEAttribute(defaultExperimentTypeEClass, DEFAULT_EXPERIMENT_TYPE__START_TIME);
		createEAttribute(defaultExperimentTypeEClass, DEFAULT_EXPERIMENT_TYPE__STOP_TIME);
		createEAttribute(defaultExperimentTypeEClass, DEFAULT_EXPERIMENT_TYPE__TOLERANCE);
		createEAttribute(defaultExperimentTypeEClass, DEFAULT_EXPERIMENT_TYPE__STEP_SIZE);

		derivativesTypeEClass = createEClass(DERIVATIVES_TYPE);
		createEAttribute(derivativesTypeEClass, DERIVATIVES_TYPE__GROUP);
		createEReference(derivativesTypeEClass, DERIVATIVES_TYPE__DERIVATIVE);

		derivativeTypeEClass = createEClass(DERIVATIVE_TYPE);
		createEAttribute(derivativeTypeEClass, DERIVATIVE_TYPE__NAME);
		createEAttribute(derivativeTypeEClass, DERIVATIVE_TYPE__STATE);

		displayUnitTypeEClass = createEClass(DISPLAY_UNIT_TYPE);
		createEAttribute(displayUnitTypeEClass, DISPLAY_UNIT_TYPE__FACTOR);
		createEAttribute(displayUnitTypeEClass, DISPLAY_UNIT_TYPE__NAME);
		createEAttribute(displayUnitTypeEClass, DISPLAY_UNIT_TYPE__OFFSET);

		enumerationTypeEClass = createEClass(ENUMERATION_TYPE);
		createEAttribute(enumerationTypeEClass, ENUMERATION_TYPE__DECLARED_TYPE);
		createEAttribute(enumerationTypeEClass, ENUMERATION_TYPE__MAX);
		createEAttribute(enumerationTypeEClass, ENUMERATION_TYPE__MIN);
		createEAttribute(enumerationTypeEClass, ENUMERATION_TYPE__QUANTITY);
		createEAttribute(enumerationTypeEClass, ENUMERATION_TYPE__START);

		enumerationType1EClass = createEClass(ENUMERATION_TYPE1);
		createEAttribute(enumerationType1EClass, ENUMERATION_TYPE1__GROUP);
		createEReference(enumerationType1EClass, ENUMERATION_TYPE1__ITEM);
		createEAttribute(enumerationType1EClass, ENUMERATION_TYPE1__QUANTITY);

		fmiAnnotationEClass = createEClass(FMI_ANNOTATION);
		createEAttribute(fmiAnnotationEClass, FMI_ANNOTATION__GROUP);
		createEReference(fmiAnnotationEClass, FMI_ANNOTATION__TOOL);

		fmiModelDescriptionTypeEClass = createEClass(FMI_MODEL_DESCRIPTION_TYPE);
		createEAttribute(fmiModelDescriptionTypeEClass, FMI_MODEL_DESCRIPTION_TYPE__GROUP);
		createEReference(fmiModelDescriptionTypeEClass, FMI_MODEL_DESCRIPTION_TYPE__MODEL_EXCHANGE);
		createEReference(fmiModelDescriptionTypeEClass, FMI_MODEL_DESCRIPTION_TYPE__CO_SIMULATION);
		createEReference(fmiModelDescriptionTypeEClass, FMI_MODEL_DESCRIPTION_TYPE__UNIT_DEFINITIONS);
		createEReference(fmiModelDescriptionTypeEClass, FMI_MODEL_DESCRIPTION_TYPE__TYPE_DEFINITIONS);
		createEReference(fmiModelDescriptionTypeEClass, FMI_MODEL_DESCRIPTION_TYPE__LOG_CATEGORIES);
		createEReference(fmiModelDescriptionTypeEClass, FMI_MODEL_DESCRIPTION_TYPE__DEFAULT_EXPERIMENT);
		createEReference(fmiModelDescriptionTypeEClass, FMI_MODEL_DESCRIPTION_TYPE__VENDOR_ANNOTATIONS);
		createEReference(fmiModelDescriptionTypeEClass, FMI_MODEL_DESCRIPTION_TYPE__MODEL_VARIABLES);
		createEReference(fmiModelDescriptionTypeEClass, FMI_MODEL_DESCRIPTION_TYPE__MODEL_STRUCTURE);
		createEReference(fmiModelDescriptionTypeEClass, FMI_MODEL_DESCRIPTION_TYPE__IMPLEMENTATION);
		createEAttribute(fmiModelDescriptionTypeEClass, FMI_MODEL_DESCRIPTION_TYPE__AUTHOR);
		createEAttribute(fmiModelDescriptionTypeEClass, FMI_MODEL_DESCRIPTION_TYPE__COPYRIGHT);
		createEAttribute(fmiModelDescriptionTypeEClass, FMI_MODEL_DESCRIPTION_TYPE__DESCRIPTION);
		createEAttribute(fmiModelDescriptionTypeEClass, FMI_MODEL_DESCRIPTION_TYPE__FMI_VERSION);
		createEAttribute(fmiModelDescriptionTypeEClass, FMI_MODEL_DESCRIPTION_TYPE__GENERATION_DATE_AND_TIME);
		createEAttribute(fmiModelDescriptionTypeEClass, FMI_MODEL_DESCRIPTION_TYPE__GENERATION_TOOL);
		createEAttribute(fmiModelDescriptionTypeEClass, FMI_MODEL_DESCRIPTION_TYPE__GUID);
		createEAttribute(fmiModelDescriptionTypeEClass, FMI_MODEL_DESCRIPTION_TYPE__LICENSE);
		createEAttribute(fmiModelDescriptionTypeEClass, FMI_MODEL_DESCRIPTION_TYPE__MODEL_NAME);
		createEAttribute(fmiModelDescriptionTypeEClass, FMI_MODEL_DESCRIPTION_TYPE__NUMBER_OF_EVENT_INDICATORS);
		createEAttribute(fmiModelDescriptionTypeEClass, FMI_MODEL_DESCRIPTION_TYPE__VARIABLE_NAMING_CONVENTION);
		createEAttribute(fmiModelDescriptionTypeEClass, FMI_MODEL_DESCRIPTION_TYPE__VERSION);
		createEAttribute(fmiModelDescriptionTypeEClass, FMI_MODEL_DESCRIPTION_TYPE__MODEL_IDENTIFIER);
		createEAttribute(fmiModelDescriptionTypeEClass, FMI_MODEL_DESCRIPTION_TYPE__NUMBER_OF_CONTINUOUS_STATES);

		fmiScalarVariableEClass = createEClass(FMI_SCALAR_VARIABLE);
		createEReference(fmiScalarVariableEClass, FMI_SCALAR_VARIABLE__REAL);
		createEReference(fmiScalarVariableEClass, FMI_SCALAR_VARIABLE__INTEGER);
		createEReference(fmiScalarVariableEClass, FMI_SCALAR_VARIABLE__BOOLEAN);
		createEReference(fmiScalarVariableEClass, FMI_SCALAR_VARIABLE__STRING);
		createEReference(fmiScalarVariableEClass, FMI_SCALAR_VARIABLE__ENUMERATION);
		createEReference(fmiScalarVariableEClass, FMI_SCALAR_VARIABLE__ANNOTATIONS);
		createEAttribute(fmiScalarVariableEClass, FMI_SCALAR_VARIABLE__CAUSALITY);
		createEAttribute(fmiScalarVariableEClass, FMI_SCALAR_VARIABLE__DESCRIPTION);
		createEAttribute(fmiScalarVariableEClass, FMI_SCALAR_VARIABLE__INITIAL);
		createEAttribute(fmiScalarVariableEClass, FMI_SCALAR_VARIABLE__NAME);
		createEAttribute(fmiScalarVariableEClass, FMI_SCALAR_VARIABLE__VALUE_REFERENCE);
		createEAttribute(fmiScalarVariableEClass, FMI_SCALAR_VARIABLE__VARIABILITY);

		fmiSimpleTypeEClass = createEClass(FMI_SIMPLE_TYPE);
		createEReference(fmiSimpleTypeEClass, FMI_SIMPLE_TYPE__REAL);
		createEReference(fmiSimpleTypeEClass, FMI_SIMPLE_TYPE__INTEGER);
		createEReference(fmiSimpleTypeEClass, FMI_SIMPLE_TYPE__BOOLEAN);
		createEReference(fmiSimpleTypeEClass, FMI_SIMPLE_TYPE__STRING);
		createEReference(fmiSimpleTypeEClass, FMI_SIMPLE_TYPE__ENUMERATION);
		createEAttribute(fmiSimpleTypeEClass, FMI_SIMPLE_TYPE__DESCRIPTION);
		createEAttribute(fmiSimpleTypeEClass, FMI_SIMPLE_TYPE__NAME);

		fmiUnitEClass = createEClass(FMI_UNIT);
		createEReference(fmiUnitEClass, FMI_UNIT__BASE_UNIT);
		createEAttribute(fmiUnitEClass, FMI_UNIT__GROUP);
		createEReference(fmiUnitEClass, FMI_UNIT__DISPLAY_UNIT);
		createEAttribute(fmiUnitEClass, FMI_UNIT__NAME);

		fmiVariableDependencyEClass = createEClass(FMI_VARIABLE_DEPENDENCY);
		createEAttribute(fmiVariableDependencyEClass, FMI_VARIABLE_DEPENDENCY__INPUT_DEPENDENCIES);
		createEAttribute(fmiVariableDependencyEClass, FMI_VARIABLE_DEPENDENCY__INPUT_FACTOR_KINDS);
		createEAttribute(fmiVariableDependencyEClass, FMI_VARIABLE_DEPENDENCY__STATE_DEPENDENCIES);
		createEAttribute(fmiVariableDependencyEClass, FMI_VARIABLE_DEPENDENCY__STATE_FACTOR_KINDS);

		inputsTypeEClass = createEClass(INPUTS_TYPE);
		createEAttribute(inputsTypeEClass, INPUTS_TYPE__GROUP);
		createEReference(inputsTypeEClass, INPUTS_TYPE__INPUT);

		inputTypeEClass = createEClass(INPUT_TYPE);
		createEAttribute(inputTypeEClass, INPUT_TYPE__DERIVATIVE);
		createEAttribute(inputTypeEClass, INPUT_TYPE__NAME);

		integerTypeEClass = createEClass(INTEGER_TYPE);
		createEAttribute(integerTypeEClass, INTEGER_TYPE__DECLARED_TYPE);
		createEAttribute(integerTypeEClass, INTEGER_TYPE__MAX);
		createEAttribute(integerTypeEClass, INTEGER_TYPE__MIN);
		createEAttribute(integerTypeEClass, INTEGER_TYPE__QUANTITY);
		createEAttribute(integerTypeEClass, INTEGER_TYPE__START);

		integerType1EClass = createEClass(INTEGER_TYPE1);
		createEAttribute(integerType1EClass, INTEGER_TYPE1__MAX);
		createEAttribute(integerType1EClass, INTEGER_TYPE1__MIN);
		createEAttribute(integerType1EClass, INTEGER_TYPE1__QUANTITY);

		itemTypeEClass = createEClass(ITEM_TYPE);
		createEAttribute(itemTypeEClass, ITEM_TYPE__DESCRIPTION);
		createEAttribute(itemTypeEClass, ITEM_TYPE__NAME);
		createEAttribute(itemTypeEClass, ITEM_TYPE__VALUE);

		logCategoriesTypeEClass = createEClass(LOG_CATEGORIES_TYPE);
		createEAttribute(logCategoriesTypeEClass, LOG_CATEGORIES_TYPE__GROUP);
		createEReference(logCategoriesTypeEClass, LOG_CATEGORIES_TYPE__CATEGORY);

		modelExchangeTypeEClass = createEClass(MODEL_EXCHANGE_TYPE);
		createEAttribute(modelExchangeTypeEClass, MODEL_EXCHANGE_TYPE__CAN_BE_INSTANTIATED_ONLY_ONCE_PER_PROCESS);
		createEAttribute(modelExchangeTypeEClass, MODEL_EXCHANGE_TYPE__CAN_GET_AND_SET_FM_USTATE);
		createEAttribute(modelExchangeTypeEClass, MODEL_EXCHANGE_TYPE__CAN_NOT_USE_MEMORY_MANAGEMENT_FUNCTIONS);
		createEAttribute(modelExchangeTypeEClass, MODEL_EXCHANGE_TYPE__CAN_SERIALIZE_FM_USTATE);
		createEAttribute(modelExchangeTypeEClass, MODEL_EXCHANGE_TYPE__COMPLETED_INTEGRATOR_STEP_NOT_NEEDED);
		createEAttribute(modelExchangeTypeEClass, MODEL_EXCHANGE_TYPE__MODEL_IDENTIFIER);
		createEAttribute(modelExchangeTypeEClass, MODEL_EXCHANGE_TYPE__NEEDS_EXECUTION_TOOL);
		createEAttribute(modelExchangeTypeEClass, MODEL_EXCHANGE_TYPE__PROVIDES_DIRECTIONAL_DERIVATIVES);
		createEAttribute(modelExchangeTypeEClass, MODEL_EXCHANGE_TYPE__PROVIDES_PARTIAL_DERIVATIVES_OF_DERIVATIVE_FUNCTION_WRT_INPUTS);
		createEAttribute(modelExchangeTypeEClass, MODEL_EXCHANGE_TYPE__PROVIDES_PARTIAL_DERIVATIVES_OF_DERIVATIVE_FUNCTION_WRT_STATES);
		createEAttribute(modelExchangeTypeEClass, MODEL_EXCHANGE_TYPE__PROVIDES_PARTIAL_DERIVATIVES_OF_OUTPUT_FUNCTION_WRT_INPUTS);
		createEAttribute(modelExchangeTypeEClass, MODEL_EXCHANGE_TYPE__PROVIDES_PARTIAL_DERIVATIVES_OF_OUTPUT_FUNCTION_WRT_STATES);

		modelStructureTypeEClass = createEClass(MODEL_STRUCTURE_TYPE);
		createEReference(modelStructureTypeEClass, MODEL_STRUCTURE_TYPE__INPUTS);
		createEReference(modelStructureTypeEClass, MODEL_STRUCTURE_TYPE__DERIVATIVES);
		createEReference(modelStructureTypeEClass, MODEL_STRUCTURE_TYPE__OUTPUTS);

		modelVariablesTypeEClass = createEClass(MODEL_VARIABLES_TYPE);
		createEAttribute(modelVariablesTypeEClass, MODEL_VARIABLES_TYPE__GROUP);
		createEReference(modelVariablesTypeEClass, MODEL_VARIABLES_TYPE__SCALAR_VARIABLE);

		outputTypeEClass = createEClass(OUTPUT_TYPE);
		createEAttribute(outputTypeEClass, OUTPUT_TYPE__DERIVATIVE);
		createEAttribute(outputTypeEClass, OUTPUT_TYPE__NAME);

		realTypeEClass = createEClass(REAL_TYPE);
		createEAttribute(realTypeEClass, REAL_TYPE__DISPLAY_UNIT);
		createEAttribute(realTypeEClass, REAL_TYPE__MAX);
		createEAttribute(realTypeEClass, REAL_TYPE__MIN);
		createEAttribute(realTypeEClass, REAL_TYPE__NOMINAL);
		createEAttribute(realTypeEClass, REAL_TYPE__QUANTITY);
		createEAttribute(realTypeEClass, REAL_TYPE__RELATIVE_QUANTITY);
		createEAttribute(realTypeEClass, REAL_TYPE__UNBOUNDED);
		createEAttribute(realTypeEClass, REAL_TYPE__UNIT);

		toolTypeEClass = createEClass(TOOL_TYPE);
		createEAttribute(toolTypeEClass, TOOL_TYPE__ANY);
		createEAttribute(toolTypeEClass, TOOL_TYPE__NAME);

		documentRootEClass = createEClass(DOCUMENT_ROOT);
		createEAttribute(documentRootEClass, DOCUMENT_ROOT__MIXED);
		createEReference(documentRootEClass, DOCUMENT_ROOT__XMLNS_PREFIX_MAP);
		createEReference(documentRootEClass, DOCUMENT_ROOT__XSI_SCHEMA_LOCATION);
		createEReference(documentRootEClass, DOCUMENT_ROOT__FMI_MODEL_DESCRIPTION);

		outputsTypeEClass = createEClass(OUTPUTS_TYPE);
		createEAttribute(outputsTypeEClass, OUTPUTS_TYPE__GROUP);
		createEReference(outputsTypeEClass, OUTPUTS_TYPE__OUTPUT);

		realType1EClass = createEClass(REAL_TYPE1);
		createEAttribute(realType1EClass, REAL_TYPE1__DECLARED_TYPE);
		createEAttribute(realType1EClass, REAL_TYPE1__DISPLAY_UNIT);
		createEAttribute(realType1EClass, REAL_TYPE1__MAX);
		createEAttribute(realType1EClass, REAL_TYPE1__MIN);
		createEAttribute(realType1EClass, REAL_TYPE1__NOMINAL);
		createEAttribute(realType1EClass, REAL_TYPE1__QUANTITY);
		createEAttribute(realType1EClass, REAL_TYPE1__RELATIVE_QUANTITY);
		createEAttribute(realType1EClass, REAL_TYPE1__START);
		createEAttribute(realType1EClass, REAL_TYPE1__UNBOUNDED);
		createEAttribute(realType1EClass, REAL_TYPE1__UNIT);

		stringTypeEClass = createEClass(STRING_TYPE);
		createEAttribute(stringTypeEClass, STRING_TYPE__DECLARED_TYPE);
		createEAttribute(stringTypeEClass, STRING_TYPE__START);

		typeDefinitionsTypeEClass = createEClass(TYPE_DEFINITIONS_TYPE);
		createEAttribute(typeDefinitionsTypeEClass, TYPE_DEFINITIONS_TYPE__GROUP);
		createEReference(typeDefinitionsTypeEClass, TYPE_DEFINITIONS_TYPE__SIMPLE_TYPE);

		unitDefinitionsTypeEClass = createEClass(UNIT_DEFINITIONS_TYPE);
		createEAttribute(unitDefinitionsTypeEClass, UNIT_DEFINITIONS_TYPE__GROUP);
		createEReference(unitDefinitionsTypeEClass, UNIT_DEFINITIONS_TYPE__UNIT);

		implementationEClass = createEClass(IMPLEMENTATION);
		createEReference(implementationEClass, IMPLEMENTATION__FMI_CO_SIMULATION_CAPABILITIES);

		fmiCoSimulationCapabilitiesTypeEClass = createEClass(FMI_CO_SIMULATION_CAPABILITIES_TYPE);
		createEReference(fmiCoSimulationCapabilitiesTypeEClass, FMI_CO_SIMULATION_CAPABILITIES_TYPE__CAPABILITIES);

		coSimulation_StandAloneEClass = createEClass(CO_SIMULATION_STAND_ALONE);

		coSimulation_ToolEClass = createEClass(CO_SIMULATION_TOOL);

		// Create enums
		causalityTypeEEnum = createEEnum(CAUSALITY_TYPE);
		fmiDependencyFactorKindEEnum = createEEnum(FMI_DEPENDENCY_FACTOR_KIND);
		initialTypeEEnum = createEEnum(INITIAL_TYPE);
		variabilityTypeEEnum = createEEnum(VARIABILITY_TYPE);
		variableNamingConventionTypeEEnum = createEEnum(VARIABLE_NAMING_CONVENTION_TYPE);

		// Create data types
		causalityTypeObjectEDataType = createEDataType(CAUSALITY_TYPE_OBJECT);
		fmiDependencyFactorKindObjectEDataType = createEDataType(FMI_DEPENDENCY_FACTOR_KIND_OBJECT);
		initialTypeObjectEDataType = createEDataType(INITIAL_TYPE_OBJECT);
		inputDependenciesTypeEDataType = createEDataType(INPUT_DEPENDENCIES_TYPE);
		inputFactorKindsTypeEDataType = createEDataType(INPUT_FACTOR_KINDS_TYPE);
		stateDependenciesTypeEDataType = createEDataType(STATE_DEPENDENCIES_TYPE);
		stateFactorKindsTypeEDataType = createEDataType(STATE_FACTOR_KINDS_TYPE);
		variabilityTypeObjectEDataType = createEDataType(VARIABILITY_TYPE_OBJECT);
		variableNamingConventionTypeObjectEDataType = createEDataType(VARIABLE_NAMING_CONVENTION_TYPE_OBJECT);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		XMLTypePackage theXMLTypePackage = (XMLTypePackage)EPackage.Registry.INSTANCE.getEPackage(XMLTypePackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		derivativeTypeEClass.getESuperTypes().add(this.getFmiVariableDependency());
		outputTypeEClass.getESuperTypes().add(this.getFmiVariableDependency());
		coSimulation_StandAloneEClass.getESuperTypes().add(this.getImplementation());
		coSimulation_ToolEClass.getESuperTypes().add(this.getImplementation());

		// Initialize classes and features; add operations and parameters
		initEClass(baseUnitTypeEClass, BaseUnitType.class, "BaseUnitType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getBaseUnitType_A(), theXMLTypePackage.getInt(), "a", "0", 0, 1, BaseUnitType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBaseUnitType_Cd(), theXMLTypePackage.getInt(), "cd", "0", 0, 1, BaseUnitType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBaseUnitType_Factor(), theXMLTypePackage.getDouble(), "factor", "1", 0, 1, BaseUnitType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBaseUnitType_K(), theXMLTypePackage.getInt(), "k", "0", 0, 1, BaseUnitType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBaseUnitType_Kg(), theXMLTypePackage.getInt(), "kg", "0", 0, 1, BaseUnitType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBaseUnitType_M(), theXMLTypePackage.getInt(), "m", "0", 0, 1, BaseUnitType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBaseUnitType_Mol(), theXMLTypePackage.getInt(), "mol", "0", 0, 1, BaseUnitType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBaseUnitType_Offset(), theXMLTypePackage.getDouble(), "offset", "0", 0, 1, BaseUnitType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBaseUnitType_Rad(), theXMLTypePackage.getInt(), "rad", "0", 0, 1, BaseUnitType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBaseUnitType_S(), theXMLTypePackage.getInt(), "s", "0", 0, 1, BaseUnitType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(booleanTypeEClass, BooleanType.class, "BooleanType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getBooleanType_DeclaredType(), theXMLTypePackage.getNormalizedString(), "declaredType", null, 0, 1, BooleanType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBooleanType_Start(), theXMLTypePackage.getBoolean(), "start", null, 0, 1, BooleanType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(categoryTypeEClass, CategoryType.class, "CategoryType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCategoryType_Name(), theXMLTypePackage.getNormalizedString(), "name", null, 0, 1, CategoryType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(coSimulationTypeEClass, CoSimulationType.class, "CoSimulationType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCoSimulationType_CanHandleVariableCommunicationStepSize(), theXMLTypePackage.getBoolean(), "canHandleVariableCommunicationStepSize", "false", 0, 1, CoSimulationType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCoSimulationType_CanHandleEvents(), theXMLTypePackage.getBoolean(), "canHandleEvents", "false", 0, 1, CoSimulationType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCoSimulationType_CanRejectSteps(), theXMLTypePackage.getBoolean(), "canRejectSteps", "false", 0, 1, CoSimulationType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCoSimulationType_CanInterpolateInputs(), theXMLTypePackage.getBoolean(), "canInterpolateInputs", "false", 0, 1, CoSimulationType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCoSimulationType_MaxOutputDerivativeOrder(), theXMLTypePackage.getUnsignedInt(), "maxOutputDerivativeOrder", "0", 0, 1, CoSimulationType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCoSimulationType_CanRunAsynchronuously(), theXMLTypePackage.getBoolean(), "canRunAsynchronuously", "false", 0, 1, CoSimulationType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCoSimulationType_CanSignalEvents(), theXMLTypePackage.getBoolean(), "canSignalEvents", "false", 0, 1, CoSimulationType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCoSimulationType_CanBeInstantiatedOnlyOncePerProcess(), theXMLTypePackage.getBoolean(), "canBeInstantiatedOnlyOncePerProcess", "false", 0, 1, CoSimulationType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCoSimulationType_CanNotUseMemoryManagementFunctions(), theXMLTypePackage.getBoolean(), "canNotUseMemoryManagementFunctions", "false", 0, 1, CoSimulationType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCoSimulationType_CanGetAndSetFMUstate(), theXMLTypePackage.getBoolean(), "canGetAndSetFMUstate", "false", 0, 1, CoSimulationType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCoSimulationType_CanSerializeFMUstate(), theXMLTypePackage.getBoolean(), "canSerializeFMUstate", "false", 0, 1, CoSimulationType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCoSimulationType_ModelIdentifier(), theXMLTypePackage.getNormalizedString(), "modelIdentifier", null, 1, 1, CoSimulationType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCoSimulationType_NeedsExecutionTool(), theXMLTypePackage.getBoolean(), "needsExecutionTool", "false", 0, 1, CoSimulationType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCoSimulationType_ProvidesPartialDerivativesOfDerivativeFunctionWrtInputs(), theXMLTypePackage.getBoolean(), "providesPartialDerivativesOfDerivativeFunctionWrtInputs", "false", 0, 1, CoSimulationType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCoSimulationType_ProvidesPartialDerivativesOfDerivativeFunctionWrtStates(), theXMLTypePackage.getBoolean(), "providesPartialDerivativesOfDerivativeFunctionWrtStates", "false", 0, 1, CoSimulationType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCoSimulationType_ProvidesPartialDerivativesOfOutputFunctionWrtInputs(), theXMLTypePackage.getBoolean(), "providesPartialDerivativesOfOutputFunctionWrtInputs", "false", 0, 1, CoSimulationType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCoSimulationType_ProvidesPartialDerivativesOfOutputFunctionWrtStates(), theXMLTypePackage.getBoolean(), "providesPartialDerivativesOfOutputFunctionWrtStates", "false", 0, 1, CoSimulationType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(defaultExperimentTypeEClass, DefaultExperimentType.class, "DefaultExperimentType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDefaultExperimentType_StartTime(), theXMLTypePackage.getDouble(), "startTime", null, 0, 1, DefaultExperimentType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDefaultExperimentType_StopTime(), theXMLTypePackage.getDouble(), "stopTime", null, 0, 1, DefaultExperimentType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDefaultExperimentType_Tolerance(), theXMLTypePackage.getDouble(), "tolerance", null, 0, 1, DefaultExperimentType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDefaultExperimentType_StepSize(), theXMLTypePackage.getDouble(), "stepSize", null, 0, 1, DefaultExperimentType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(derivativesTypeEClass, DerivativesType.class, "DerivativesType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDerivativesType_Group(), ecorePackage.getEFeatureMapEntry(), "group", null, 0, -1, DerivativesType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDerivativesType_Derivative(), this.getDerivativeType(), null, "derivative", null, 0, -1, DerivativesType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(derivativeTypeEClass, DerivativeType.class, "DerivativeType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDerivativeType_Name(), theXMLTypePackage.getNormalizedString(), "name", null, 1, 1, DerivativeType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDerivativeType_State(), theXMLTypePackage.getNormalizedString(), "state", null, 1, 1, DerivativeType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(displayUnitTypeEClass, DisplayUnitType.class, "DisplayUnitType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDisplayUnitType_Factor(), theXMLTypePackage.getDouble(), "factor", "1", 0, 1, DisplayUnitType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDisplayUnitType_Name(), theXMLTypePackage.getNormalizedString(), "name", null, 1, 1, DisplayUnitType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDisplayUnitType_Offset(), theXMLTypePackage.getDouble(), "offset", "0", 0, 1, DisplayUnitType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(enumerationTypeEClass, EnumerationType.class, "EnumerationType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getEnumerationType_DeclaredType(), theXMLTypePackage.getNormalizedString(), "declaredType", null, 1, 1, EnumerationType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEnumerationType_Max(), theXMLTypePackage.getInt(), "max", null, 0, 1, EnumerationType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEnumerationType_Min(), theXMLTypePackage.getInt(), "min", null, 0, 1, EnumerationType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEnumerationType_Quantity(), theXMLTypePackage.getNormalizedString(), "quantity", null, 0, 1, EnumerationType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEnumerationType_Start(), theXMLTypePackage.getInt(), "start", null, 0, 1, EnumerationType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(enumerationType1EClass, EnumerationType1.class, "EnumerationType1", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getEnumerationType1_Group(), ecorePackage.getEFeatureMapEntry(), "group", null, 0, -1, EnumerationType1.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEnumerationType1_Item(), this.getItemType(), null, "item", null, 0, -1, EnumerationType1.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getEnumerationType1_Quantity(), theXMLTypePackage.getNormalizedString(), "quantity", null, 0, 1, EnumerationType1.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(fmiAnnotationEClass, FmiAnnotation.class, "FmiAnnotation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getFmiAnnotation_Group(), ecorePackage.getEFeatureMapEntry(), "group", null, 0, -1, FmiAnnotation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFmiAnnotation_Tool(), this.getToolType(), null, "tool", null, 0, -1, FmiAnnotation.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(fmiModelDescriptionTypeEClass, FmiModelDescriptionType.class, "FmiModelDescriptionType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getFmiModelDescriptionType_Group(), ecorePackage.getEFeatureMapEntry(), "group", null, 0, -1, FmiModelDescriptionType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFmiModelDescriptionType_ModelExchange(), this.getModelExchangeType(), null, "modelExchange", null, 0, 2, FmiModelDescriptionType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getFmiModelDescriptionType_CoSimulation(), this.getCoSimulationType(), null, "coSimulation", null, 0, 2, FmiModelDescriptionType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getFmiModelDescriptionType_UnitDefinitions(), this.getUnitDefinitionsType(), null, "unitDefinitions", null, 0, 1, FmiModelDescriptionType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFmiModelDescriptionType_TypeDefinitions(), this.getTypeDefinitionsType(), null, "typeDefinitions", null, 0, 1, FmiModelDescriptionType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFmiModelDescriptionType_LogCategories(), this.getLogCategoriesType(), null, "logCategories", null, 0, 1, FmiModelDescriptionType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFmiModelDescriptionType_DefaultExperiment(), this.getDefaultExperimentType(), null, "defaultExperiment", null, 0, 1, FmiModelDescriptionType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFmiModelDescriptionType_VendorAnnotations(), this.getFmiAnnotation(), null, "vendorAnnotations", null, 0, 1, FmiModelDescriptionType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFmiModelDescriptionType_ModelVariables(), this.getModelVariablesType(), null, "modelVariables", null, 1, 1, FmiModelDescriptionType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFmiModelDescriptionType_ModelStructure(), this.getModelStructureType(), null, "modelStructure", null, 0, 1, FmiModelDescriptionType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFmiModelDescriptionType_Implementation(), this.getImplementation(), null, "implementation", null, 0, 1, FmiModelDescriptionType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getFmiModelDescriptionType_Author(), theXMLTypePackage.getString(), "author", null, 0, 1, FmiModelDescriptionType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFmiModelDescriptionType_Copyright(), theXMLTypePackage.getString(), "copyright", null, 0, 1, FmiModelDescriptionType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFmiModelDescriptionType_Description(), theXMLTypePackage.getString(), "description", null, 0, 1, FmiModelDescriptionType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFmiModelDescriptionType_FmiVersion(), theXMLTypePackage.getNormalizedString(), "fmiVersion", "2.0", 1, 1, FmiModelDescriptionType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFmiModelDescriptionType_GenerationDateAndTime(), theXMLTypePackage.getDateTime(), "generationDateAndTime", null, 0, 1, FmiModelDescriptionType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFmiModelDescriptionType_GenerationTool(), theXMLTypePackage.getNormalizedString(), "generationTool", null, 0, 1, FmiModelDescriptionType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFmiModelDescriptionType_Guid(), theXMLTypePackage.getNormalizedString(), "guid", null, 1, 1, FmiModelDescriptionType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFmiModelDescriptionType_License(), theXMLTypePackage.getString(), "license", null, 0, 1, FmiModelDescriptionType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFmiModelDescriptionType_ModelName(), theXMLTypePackage.getString(), "modelName", null, 1, 1, FmiModelDescriptionType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFmiModelDescriptionType_NumberOfEventIndicators(), theXMLTypePackage.getUnsignedInt(), "numberOfEventIndicators", null, 0, 1, FmiModelDescriptionType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFmiModelDescriptionType_VariableNamingConvention(), this.getVariableNamingConventionType(), "variableNamingConvention", "flat", 0, 1, FmiModelDescriptionType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFmiModelDescriptionType_Version(), theXMLTypePackage.getNormalizedString(), "version", null, 0, 1, FmiModelDescriptionType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFmiModelDescriptionType_ModelIdentifier(), theXMLTypePackage.getNormalizedString(), "modelIdentifier", null, 0, 1, FmiModelDescriptionType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFmiModelDescriptionType_NumberOfContinuousStates(), theXMLTypePackage.getUnsignedInt(), "numberOfContinuousStates", null, 0, 1, FmiModelDescriptionType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(fmiScalarVariableEClass, FmiScalarVariable.class, "FmiScalarVariable", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getFmiScalarVariable_Real(), this.getRealType1(), null, "real", null, 0, 1, FmiScalarVariable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFmiScalarVariable_Integer(), this.getIntegerType(), null, "integer", null, 0, 1, FmiScalarVariable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFmiScalarVariable_Boolean(), this.getBooleanType(), null, "boolean", null, 0, 1, FmiScalarVariable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFmiScalarVariable_String(), this.getStringType(), null, "string", null, 0, 1, FmiScalarVariable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFmiScalarVariable_Enumeration(), this.getEnumerationType(), null, "enumeration", null, 0, 1, FmiScalarVariable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFmiScalarVariable_Annotations(), this.getFmiAnnotation(), null, "annotations", null, 0, 1, FmiScalarVariable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFmiScalarVariable_Causality(), this.getCausalityType(), "causality", "local", 0, 1, FmiScalarVariable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFmiScalarVariable_Description(), theXMLTypePackage.getString(), "description", null, 0, 1, FmiScalarVariable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFmiScalarVariable_Initial(), this.getInitialType(), "initial", null, 0, 1, FmiScalarVariable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFmiScalarVariable_Name(), theXMLTypePackage.getNormalizedString(), "name", null, 1, 1, FmiScalarVariable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFmiScalarVariable_ValueReference(), theXMLTypePackage.getUnsignedInt(), "valueReference", null, 0, 1, FmiScalarVariable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFmiScalarVariable_Variability(), this.getVariabilityType(), "variability", "", 0, 1, FmiScalarVariable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(fmiSimpleTypeEClass, FmiSimpleType.class, "FmiSimpleType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getFmiSimpleType_Real(), this.getRealType(), null, "real", null, 0, 1, FmiSimpleType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFmiSimpleType_Integer(), this.getIntegerType1(), null, "integer", null, 0, 1, FmiSimpleType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFmiSimpleType_Boolean(), ecorePackage.getEObject(), null, "boolean", null, 0, 1, FmiSimpleType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFmiSimpleType_String(), ecorePackage.getEObject(), null, "string", null, 0, 1, FmiSimpleType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFmiSimpleType_Enumeration(), this.getEnumerationType1(), null, "enumeration", null, 0, 1, FmiSimpleType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFmiSimpleType_Description(), theXMLTypePackage.getString(), "description", null, 0, 1, FmiSimpleType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFmiSimpleType_Name(), theXMLTypePackage.getNormalizedString(), "name", null, 1, 1, FmiSimpleType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(fmiUnitEClass, FmiUnit.class, "FmiUnit", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getFmiUnit_BaseUnit(), this.getBaseUnitType(), null, "baseUnit", null, 0, 1, FmiUnit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFmiUnit_Group(), ecorePackage.getEFeatureMapEntry(), "group", null, 0, -1, FmiUnit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFmiUnit_DisplayUnit(), this.getDisplayUnitType(), null, "displayUnit", null, 0, -1, FmiUnit.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getFmiUnit_Name(), theXMLTypePackage.getNormalizedString(), "name", null, 1, 1, FmiUnit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(fmiVariableDependencyEClass, FmiVariableDependency.class, "FmiVariableDependency", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getFmiVariableDependency_InputDependencies(), this.getInputDependenciesType(), "inputDependencies", null, 0, 1, FmiVariableDependency.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFmiVariableDependency_InputFactorKinds(), this.getInputFactorKindsType(), "inputFactorKinds", null, 0, 1, FmiVariableDependency.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFmiVariableDependency_StateDependencies(), this.getStateDependenciesType(), "stateDependencies", null, 0, 1, FmiVariableDependency.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFmiVariableDependency_StateFactorKinds(), this.getStateFactorKindsType(), "stateFactorKinds", null, 0, 1, FmiVariableDependency.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(inputsTypeEClass, InputsType.class, "InputsType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getInputsType_Group(), ecorePackage.getEFeatureMapEntry(), "group", null, 0, -1, InputsType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getInputsType_Input(), this.getInputType(), null, "input", null, 0, -1, InputsType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(inputTypeEClass, InputType.class, "InputType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getInputType_Derivative(), theXMLTypePackage.getInt(), "derivative", null, 0, 1, InputType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getInputType_Name(), theXMLTypePackage.getNormalizedString(), "name", null, 1, 1, InputType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(integerTypeEClass, IntegerType.class, "IntegerType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getIntegerType_DeclaredType(), theXMLTypePackage.getNormalizedString(), "declaredType", null, 0, 1, IntegerType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getIntegerType_Max(), theXMLTypePackage.getInt(), "max", null, 0, 1, IntegerType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getIntegerType_Min(), theXMLTypePackage.getInt(), "min", null, 0, 1, IntegerType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getIntegerType_Quantity(), theXMLTypePackage.getNormalizedString(), "quantity", null, 0, 1, IntegerType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getIntegerType_Start(), theXMLTypePackage.getInt(), "start", null, 0, 1, IntegerType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(integerType1EClass, IntegerType1.class, "IntegerType1", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getIntegerType1_Max(), theXMLTypePackage.getInt(), "max", null, 0, 1, IntegerType1.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getIntegerType1_Min(), theXMLTypePackage.getInt(), "min", null, 0, 1, IntegerType1.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getIntegerType1_Quantity(), theXMLTypePackage.getNormalizedString(), "quantity", null, 0, 1, IntegerType1.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(itemTypeEClass, ItemType.class, "ItemType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getItemType_Description(), theXMLTypePackage.getString(), "description", null, 0, 1, ItemType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getItemType_Name(), theXMLTypePackage.getNormalizedString(), "name", null, 1, 1, ItemType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getItemType_Value(), theXMLTypePackage.getInt(), "value", null, 1, 1, ItemType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(logCategoriesTypeEClass, LogCategoriesType.class, "LogCategoriesType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getLogCategoriesType_Group(), ecorePackage.getEFeatureMapEntry(), "group", null, 0, -1, LogCategoriesType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getLogCategoriesType_Category(), this.getCategoryType(), null, "category", null, 0, -1, LogCategoriesType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(modelExchangeTypeEClass, ModelExchangeType.class, "ModelExchangeType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getModelExchangeType_CanBeInstantiatedOnlyOncePerProcess(), theXMLTypePackage.getBoolean(), "canBeInstantiatedOnlyOncePerProcess", "false", 0, 1, ModelExchangeType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getModelExchangeType_CanGetAndSetFMUstate(), theXMLTypePackage.getBoolean(), "canGetAndSetFMUstate", "false", 0, 1, ModelExchangeType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getModelExchangeType_CanNotUseMemoryManagementFunctions(), theXMLTypePackage.getBoolean(), "canNotUseMemoryManagementFunctions", "false", 0, 1, ModelExchangeType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getModelExchangeType_CanSerializeFMUstate(), theXMLTypePackage.getBoolean(), "canSerializeFMUstate", "false", 0, 1, ModelExchangeType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getModelExchangeType_CompletedIntegratorStepNotNeeded(), theXMLTypePackage.getBoolean(), "completedIntegratorStepNotNeeded", "false", 0, 1, ModelExchangeType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getModelExchangeType_ModelIdentifier(), theXMLTypePackage.getNormalizedString(), "modelIdentifier", null, 1, 1, ModelExchangeType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getModelExchangeType_NeedsExecutionTool(), theXMLTypePackage.getBoolean(), "needsExecutionTool", "false", 0, 1, ModelExchangeType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getModelExchangeType_ProvidesDirectionalDerivatives(), theXMLTypePackage.getBoolean(), "providesDirectionalDerivatives", "false", 0, 1, ModelExchangeType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getModelExchangeType_ProvidesPartialDerivativesOfDerivativeFunctionWrtInputs(), theXMLTypePackage.getBoolean(), "providesPartialDerivativesOfDerivativeFunctionWrtInputs", "false", 0, 1, ModelExchangeType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getModelExchangeType_ProvidesPartialDerivativesOfDerivativeFunctionWrtStates(), theXMLTypePackage.getBoolean(), "providesPartialDerivativesOfDerivativeFunctionWrtStates", "false", 0, 1, ModelExchangeType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getModelExchangeType_ProvidesPartialDerivativesOfOutputFunctionWrtInputs(), theXMLTypePackage.getBoolean(), "providesPartialDerivativesOfOutputFunctionWrtInputs", "false", 0, 1, ModelExchangeType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getModelExchangeType_ProvidesPartialDerivativesOfOutputFunctionWrtStates(), theXMLTypePackage.getBoolean(), "providesPartialDerivativesOfOutputFunctionWrtStates", "false", 0, 1, ModelExchangeType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(modelStructureTypeEClass, ModelStructureType.class, "ModelStructureType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getModelStructureType_Inputs(), this.getInputsType(), null, "inputs", null, 0, 1, ModelStructureType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getModelStructureType_Derivatives(), this.getDerivativesType(), null, "derivatives", null, 0, 1, ModelStructureType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getModelStructureType_Outputs(), this.getOutputsType(), null, "outputs", null, 0, 1, ModelStructureType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(modelVariablesTypeEClass, ModelVariablesType.class, "ModelVariablesType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getModelVariablesType_Group(), ecorePackage.getEFeatureMapEntry(), "group", null, 0, -1, ModelVariablesType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getModelVariablesType_ScalarVariable(), this.getFmiScalarVariable(), null, "scalarVariable", null, 0, -1, ModelVariablesType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(outputTypeEClass, OutputType.class, "OutputType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getOutputType_Derivative(), theXMLTypePackage.getInt(), "derivative", null, 0, 1, OutputType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOutputType_Name(), theXMLTypePackage.getNormalizedString(), "name", null, 1, 1, OutputType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(realTypeEClass, RealType.class, "RealType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRealType_DisplayUnit(), theXMLTypePackage.getNormalizedString(), "displayUnit", null, 0, 1, RealType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRealType_Max(), theXMLTypePackage.getDouble(), "max", null, 0, 1, RealType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRealType_Min(), theXMLTypePackage.getDouble(), "min", null, 0, 1, RealType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRealType_Nominal(), theXMLTypePackage.getDouble(), "nominal", null, 0, 1, RealType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRealType_Quantity(), theXMLTypePackage.getNormalizedString(), "quantity", null, 0, 1, RealType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRealType_RelativeQuantity(), theXMLTypePackage.getBoolean(), "relativeQuantity", "false", 0, 1, RealType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRealType_Unbounded(), theXMLTypePackage.getBoolean(), "unbounded", "false", 0, 1, RealType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRealType_Unit(), theXMLTypePackage.getNormalizedString(), "unit", null, 0, 1, RealType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(toolTypeEClass, ToolType.class, "ToolType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getToolType_Any(), ecorePackage.getEFeatureMapEntry(), "any", null, 0, 1, ToolType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getToolType_Name(), theXMLTypePackage.getNormalizedString(), "name", null, 1, 1, ToolType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(documentRootEClass, DocumentRoot.class, "DocumentRoot", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDocumentRoot_Mixed(), ecorePackage.getEFeatureMapEntry(), "mixed", null, 0, -1, null, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_XMLNSPrefixMap(), ecorePackage.getEStringToStringMapEntry(), null, "xMLNSPrefixMap", null, 0, -1, null, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_XSISchemaLocation(), ecorePackage.getEStringToStringMapEntry(), null, "xSISchemaLocation", null, 0, -1, null, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_FmiModelDescription(), this.getFmiModelDescriptionType(), null, "fmiModelDescription", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(outputsTypeEClass, OutputsType.class, "OutputsType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getOutputsType_Group(), ecorePackage.getEFeatureMapEntry(), "group", null, 0, -1, OutputsType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getOutputsType_Output(), this.getOutputType(), null, "output", null, 0, -1, OutputsType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(realType1EClass, RealType1.class, "RealType1", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRealType1_DeclaredType(), theXMLTypePackage.getNormalizedString(), "declaredType", null, 0, 1, RealType1.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRealType1_DisplayUnit(), theXMLTypePackage.getNormalizedString(), "displayUnit", null, 0, 1, RealType1.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRealType1_Max(), theXMLTypePackage.getDouble(), "max", null, 0, 1, RealType1.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRealType1_Min(), theXMLTypePackage.getDouble(), "min", null, 0, 1, RealType1.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRealType1_Nominal(), theXMLTypePackage.getDouble(), "nominal", null, 0, 1, RealType1.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRealType1_Quantity(), theXMLTypePackage.getNormalizedString(), "quantity", null, 0, 1, RealType1.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRealType1_RelativeQuantity(), theXMLTypePackage.getBoolean(), "relativeQuantity", "false", 0, 1, RealType1.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRealType1_Start(), theXMLTypePackage.getDouble(), "start", null, 0, 1, RealType1.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRealType1_Unbounded(), theXMLTypePackage.getBoolean(), "unbounded", "false", 0, 1, RealType1.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRealType1_Unit(), theXMLTypePackage.getNormalizedString(), "unit", null, 0, 1, RealType1.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(stringTypeEClass, StringType.class, "StringType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getStringType_DeclaredType(), theXMLTypePackage.getNormalizedString(), "declaredType", null, 0, 1, StringType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getStringType_Start(), theXMLTypePackage.getString(), "start", null, 0, 1, StringType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(typeDefinitionsTypeEClass, TypeDefinitionsType.class, "TypeDefinitionsType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTypeDefinitionsType_Group(), ecorePackage.getEFeatureMapEntry(), "group", null, 0, -1, TypeDefinitionsType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTypeDefinitionsType_SimpleType(), this.getFmiSimpleType(), null, "simpleType", null, 0, -1, TypeDefinitionsType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(unitDefinitionsTypeEClass, UnitDefinitionsType.class, "UnitDefinitionsType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getUnitDefinitionsType_Group(), ecorePackage.getEFeatureMapEntry(), "group", null, 0, -1, UnitDefinitionsType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getUnitDefinitionsType_Unit(), this.getFmiUnit(), null, "unit", null, 0, -1, UnitDefinitionsType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(implementationEClass, Implementation.class, "Implementation", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getImplementation_FmiCoSimulationCapabilities(), this.getCoSimulationType(), null, "fmiCoSimulationCapabilities", null, 0, -1, Implementation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(fmiCoSimulationCapabilitiesTypeEClass, FmiCoSimulationCapabilitiesType.class, "FmiCoSimulationCapabilitiesType", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getFmiCoSimulationCapabilitiesType_Capabilities(), this.getCoSimulationType(), null, "capabilities", null, 0, -1, FmiCoSimulationCapabilitiesType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(coSimulation_StandAloneEClass, CoSimulation_StandAlone.class, "CoSimulation_StandAlone", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(coSimulation_ToolEClass, CoSimulation_Tool.class, "CoSimulation_Tool", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		// Initialize enums and add enum literals
		initEEnum(causalityTypeEEnum, CausalityType.class, "CausalityType");
		addEEnumLiteral(causalityTypeEEnum, CausalityType.PARAMETER);
		addEEnumLiteral(causalityTypeEEnum, CausalityType.INPUT);
		addEEnumLiteral(causalityTypeEEnum, CausalityType.OUTPUT);
		addEEnumLiteral(causalityTypeEEnum, CausalityType.LOCAL);

		initEEnum(fmiDependencyFactorKindEEnum, FmiDependencyFactorKind.class, "FmiDependencyFactorKind");
		addEEnumLiteral(fmiDependencyFactorKindEEnum, FmiDependencyFactorKind.NONLINEAR);
		addEEnumLiteral(fmiDependencyFactorKindEEnum, FmiDependencyFactorKind.FIXED);
		addEEnumLiteral(fmiDependencyFactorKindEEnum, FmiDependencyFactorKind.DISCRETE);

		initEEnum(initialTypeEEnum, InitialType.class, "InitialType");
		addEEnumLiteral(initialTypeEEnum, InitialType.EXACT);
		addEEnumLiteral(initialTypeEEnum, InitialType.APPROX);
		addEEnumLiteral(initialTypeEEnum, InitialType.CALCULATED);

		initEEnum(variabilityTypeEEnum, VariabilityType.class, "VariabilityType");
		addEEnumLiteral(variabilityTypeEEnum, VariabilityType.CONSTANT);
		addEEnumLiteral(variabilityTypeEEnum, VariabilityType.FIXED);
		addEEnumLiteral(variabilityTypeEEnum, VariabilityType.TUNABLE);
		addEEnumLiteral(variabilityTypeEEnum, VariabilityType.DISCRETE);
		addEEnumLiteral(variabilityTypeEEnum, VariabilityType.CONTINUOUS);

		initEEnum(variableNamingConventionTypeEEnum, VariableNamingConventionType.class, "VariableNamingConventionType");
		addEEnumLiteral(variableNamingConventionTypeEEnum, VariableNamingConventionType.FLAT);
		addEEnumLiteral(variableNamingConventionTypeEEnum, VariableNamingConventionType.STRUCTURED);

		// Initialize data types
		initEDataType(causalityTypeObjectEDataType, CausalityType.class, "CausalityTypeObject", IS_SERIALIZABLE, IS_GENERATED_INSTANCE_CLASS);
		initEDataType(fmiDependencyFactorKindObjectEDataType, FmiDependencyFactorKind.class, "FmiDependencyFactorKindObject", IS_SERIALIZABLE, IS_GENERATED_INSTANCE_CLASS);
		initEDataType(initialTypeObjectEDataType, InitialType.class, "InitialTypeObject", IS_SERIALIZABLE, IS_GENERATED_INSTANCE_CLASS);
		initEDataType(inputDependenciesTypeEDataType, List.class, "InputDependenciesType", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(inputFactorKindsTypeEDataType, List.class, "InputFactorKindsType", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(stateDependenciesTypeEDataType, List.class, "StateDependenciesType", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(stateFactorKindsTypeEDataType, List.class, "StateFactorKindsType", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(variabilityTypeObjectEDataType, VariabilityType.class, "VariabilityTypeObject", IS_SERIALIZABLE, IS_GENERATED_INSTANCE_CLASS);
		initEDataType(variableNamingConventionTypeObjectEDataType, VariableNamingConventionType.class, "VariableNamingConventionTypeObject", IS_SERIALIZABLE, IS_GENERATED_INSTANCE_CLASS);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// http:///org/eclipse/emf/ecore/util/ExtendedMetaData
		createExtendedMetaDataAnnotations();
	}

	/**
	 * Initializes the annotations for <b>http:///org/eclipse/emf/ecore/util/ExtendedMetaData</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createExtendedMetaDataAnnotations() {
		String source = "http:///org/eclipse/emf/ecore/util/ExtendedMetaData";			
		addAnnotation
		  (this, 
		   source, 
		   new String[] {
			 "qualified", "false"
		   });		
		addAnnotation
		  (baseUnitTypeEClass, 
		   source, 
		   new String[] {
			 "name", "BaseUnit_._type",
			 "kind", "empty"
		   });			
		addAnnotation
		  (getBaseUnitType_A(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "A",
			 "namespace", "##targetNamespace"
		   });			
		addAnnotation
		  (getBaseUnitType_Cd(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "cd",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getBaseUnitType_Factor(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "factor",
			 "namespace", "##targetNamespace"
		   });			
		addAnnotation
		  (getBaseUnitType_K(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "K",
			 "namespace", "##targetNamespace"
		   });			
		addAnnotation
		  (getBaseUnitType_Kg(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "kg",
			 "namespace", "##targetNamespace"
		   });			
		addAnnotation
		  (getBaseUnitType_M(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "m",
			 "namespace", "##targetNamespace"
		   });			
		addAnnotation
		  (getBaseUnitType_Mol(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "mol",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getBaseUnitType_Offset(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "offset",
			 "namespace", "##targetNamespace"
		   });			
		addAnnotation
		  (getBaseUnitType_Rad(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "rad",
			 "namespace", "##targetNamespace"
		   });			
		addAnnotation
		  (getBaseUnitType_S(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "s",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (booleanTypeEClass, 
		   source, 
		   new String[] {
			 "name", "Boolean_._type",
			 "kind", "empty"
		   });			
		addAnnotation
		  (getBooleanType_DeclaredType(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "declaredType",
			 "namespace", "##targetNamespace"
		   });			
		addAnnotation
		  (getBooleanType_Start(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "start",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (categoryTypeEClass, 
		   source, 
		   new String[] {
			 "name", "Category_._type",
			 "kind", "empty"
		   });			
		addAnnotation
		  (getCategoryType_Name(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "name",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (causalityTypeEEnum, 
		   source, 
		   new String[] {
			 "name", "causality_._type"
		   });		
		addAnnotation
		  (causalityTypeObjectEDataType, 
		   source, 
		   new String[] {
			 "name", "causality_._type:Object",
			 "baseType", "causality_._type"
		   });		
		addAnnotation
		  (coSimulationTypeEClass, 
		   source, 
		   new String[] {
			 "name", "CoSimulation_._type",
			 "kind", "empty"
		   });		
		addAnnotation
		  (getCoSimulationType_CanHandleVariableCommunicationStepSize(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "canHandleVariableCommunicationStepSize",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getCoSimulationType_CanHandleEvents(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "canHandleEvents",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getCoSimulationType_CanRejectSteps(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "canRunAsynchronuously",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getCoSimulationType_CanInterpolateInputs(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "canInterpolateInputs",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getCoSimulationType_MaxOutputDerivativeOrder(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "maxOutputDerivativeOrder",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getCoSimulationType_CanRunAsynchronuously(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "canRunAsynchronuously",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getCoSimulationType_CanSignalEvents(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "canSignalEvents",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getCoSimulationType_CanBeInstantiatedOnlyOncePerProcess(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "canBeInstantiatedOnlyOncePerProcess",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getCoSimulationType_CanNotUseMemoryManagementFunctions(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "canNotUseMemoryManagementFunctions",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getCoSimulationType_CanGetAndSetFMUstate(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "canGetAndSetFMUstate",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getCoSimulationType_CanSerializeFMUstate(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "canSerializeFMUstate",
			 "namespace", "##targetNamespace"
		   });			
		addAnnotation
		  (getCoSimulationType_ModelIdentifier(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "modelIdentifier",
			 "namespace", "##targetNamespace"
		   });			
		addAnnotation
		  (getCoSimulationType_NeedsExecutionTool(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "needsExecutionTool",
			 "namespace", "##targetNamespace"
		   });			
		addAnnotation
		  (getCoSimulationType_ProvidesPartialDerivativesOfDerivativeFunctionWrtInputs(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "providesPartialDerivativesOf_DerivativeFunction_wrt_Inputs",
			 "namespace", "##targetNamespace"
		   });			
		addAnnotation
		  (getCoSimulationType_ProvidesPartialDerivativesOfDerivativeFunctionWrtStates(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "providesPartialDerivativesOf_DerivativeFunction_wrt_States",
			 "namespace", "##targetNamespace"
		   });			
		addAnnotation
		  (getCoSimulationType_ProvidesPartialDerivativesOfOutputFunctionWrtInputs(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "providesPartialDerivativesOf_OutputFunction_wrt_Inputs",
			 "namespace", "##targetNamespace"
		   });			
		addAnnotation
		  (getCoSimulationType_ProvidesPartialDerivativesOfOutputFunctionWrtStates(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "providesPartialDerivativesOf_OutputFunction_wrt_States",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (defaultExperimentTypeEClass, 
		   source, 
		   new String[] {
			 "name", "DefaultExperiment_._type",
			 "kind", "empty"
		   });		
		addAnnotation
		  (getDefaultExperimentType_StartTime(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "startTime",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDefaultExperimentType_StopTime(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "stopTime",
			 "namespace", "##targetNamespace"
		   });			
		addAnnotation
		  (getDefaultExperimentType_Tolerance(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "tolerance",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (derivativesTypeEClass, 
		   source, 
		   new String[] {
			 "name", "Derivatives_._type",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getDerivativesType_Group(), 
		   source, 
		   new String[] {
			 "kind", "group",
			 "name", "group:0"
		   });		
		addAnnotation
		  (getDerivativesType_Derivative(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "Derivative",
			 "namespace", "##targetNamespace",
			 "group", "group:0"
		   });		
		addAnnotation
		  (derivativeTypeEClass, 
		   source, 
		   new String[] {
			 "name", "Derivative_._type",
			 "kind", "empty"
		   });			
		addAnnotation
		  (getDerivativeType_Name(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "name",
			 "namespace", "##targetNamespace"
		   });			
		addAnnotation
		  (getDerivativeType_State(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "state",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (displayUnitTypeEClass, 
		   source, 
		   new String[] {
			 "name", "DisplayUnit_._type",
			 "kind", "empty"
		   });		
		addAnnotation
		  (getDisplayUnitType_Factor(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "factor",
			 "namespace", "##targetNamespace"
		   });			
		addAnnotation
		  (getDisplayUnitType_Name(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "name",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDisplayUnitType_Offset(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "offset",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (enumerationTypeEClass, 
		   source, 
		   new String[] {
			 "name", "Enumeration_._type",
			 "kind", "empty"
		   });			
		addAnnotation
		  (getEnumerationType_DeclaredType(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "declaredType",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getEnumerationType_Max(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "max",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getEnumerationType_Min(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "min",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getEnumerationType_Quantity(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "quantity",
			 "namespace", "##targetNamespace"
		   });			
		addAnnotation
		  (getEnumerationType_Start(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "start",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (enumerationType1EClass, 
		   source, 
		   new String[] {
			 "name", "Enumeration_._1_._type",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getEnumerationType1_Group(), 
		   source, 
		   new String[] {
			 "kind", "group",
			 "name", "group:0"
		   });		
		addAnnotation
		  (getEnumerationType1_Item(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "Item",
			 "namespace", "##targetNamespace",
			 "group", "group:0"
		   });		
		addAnnotation
		  (getEnumerationType1_Quantity(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "quantity",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (fmiAnnotationEClass, 
		   source, 
		   new String[] {
			 "name", "fmiAnnotation",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getFmiAnnotation_Group(), 
		   source, 
		   new String[] {
			 "kind", "group",
			 "name", "group:0"
		   });			
		addAnnotation
		  (getFmiAnnotation_Tool(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "Tool",
			 "namespace", "##targetNamespace",
			 "group", "group:0"
		   });		
		addAnnotation
		  (fmiDependencyFactorKindEEnum, 
		   source, 
		   new String[] {
			 "name", "fmiDependencyFactorKind"
		   });		
		addAnnotation
		  (fmiDependencyFactorKindObjectEDataType, 
		   source, 
		   new String[] {
			 "name", "fmiDependencyFactorKind:Object",
			 "baseType", "fmiDependencyFactorKind"
		   });		
		addAnnotation
		  (fmiModelDescriptionTypeEClass, 
		   source, 
		   new String[] {
			 "name", "fmiModelDescription_._type",
			 "kind", "elementOnly"
		   });			
		addAnnotation
		  (getFmiModelDescriptionType_Group(), 
		   source, 
		   new String[] {
			 "kind", "group",
			 "name", "group:0"
		   });			
		addAnnotation
		  (getFmiModelDescriptionType_ModelExchange(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "ModelExchange",
			 "namespace", "##targetNamespace",
			 "group", "group:0"
		   });			
		addAnnotation
		  (getFmiModelDescriptionType_CoSimulation(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "CoSimulation",
			 "namespace", "##targetNamespace",
			 "group", "group:0"
		   });		
		addAnnotation
		  (getFmiModelDescriptionType_UnitDefinitions(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "UnitDefinitions",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getFmiModelDescriptionType_TypeDefinitions(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "TypeDefinitions",
			 "namespace", "##targetNamespace"
		   });			
		addAnnotation
		  (getFmiModelDescriptionType_LogCategories(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "LogCategories",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getFmiModelDescriptionType_DefaultExperiment(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "DefaultExperiment",
			 "namespace", "##targetNamespace"
		   });			
		addAnnotation
		  (getFmiModelDescriptionType_VendorAnnotations(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "VendorAnnotations",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getFmiModelDescriptionType_ModelVariables(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "ModelVariables",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getFmiModelDescriptionType_ModelStructure(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "ModelStructure",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getFmiModelDescriptionType_Implementation(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "Implementation",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getFmiModelDescriptionType_Author(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "author",
			 "namespace", "##targetNamespace"
		   });			
		addAnnotation
		  (getFmiModelDescriptionType_Copyright(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "copyright",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getFmiModelDescriptionType_Description(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "description",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getFmiModelDescriptionType_FmiVersion(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "fmiVersion",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getFmiModelDescriptionType_GenerationDateAndTime(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "generationDateAndTime",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getFmiModelDescriptionType_GenerationTool(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "generationTool",
			 "namespace", "##targetNamespace"
		   });			
		addAnnotation
		  (getFmiModelDescriptionType_Guid(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "guid",
			 "namespace", "##targetNamespace"
		   });			
		addAnnotation
		  (getFmiModelDescriptionType_License(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "license",
			 "namespace", "##targetNamespace"
		   });			
		addAnnotation
		  (getFmiModelDescriptionType_ModelName(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "modelName",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getFmiModelDescriptionType_NumberOfEventIndicators(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "numberOfEventIndicators",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getFmiModelDescriptionType_VariableNamingConvention(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "variableNamingConvention",
			 "namespace", "##targetNamespace"
		   });			
		addAnnotation
		  (getFmiModelDescriptionType_Version(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "version",
			 "namespace", "##targetNamespace"
		   });			
		addAnnotation
		  (getFmiModelDescriptionType_ModelIdentifier(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "modelIdentifier",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getFmiModelDescriptionType_NumberOfContinuousStates(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "numberOfContinuousStates",
			 "namespace", "##targetNamespace"
		   });			
		addAnnotation
		  (fmiScalarVariableEClass, 
		   source, 
		   new String[] {
			 "name", "fmiScalarVariable",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getFmiScalarVariable_Real(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "Real",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getFmiScalarVariable_Integer(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "Integer",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getFmiScalarVariable_Boolean(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "Boolean",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getFmiScalarVariable_String(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "String",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getFmiScalarVariable_Enumeration(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "Enumeration",
			 "namespace", "##targetNamespace"
		   });			
		addAnnotation
		  (getFmiScalarVariable_Annotations(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "Annotations",
			 "namespace", "##targetNamespace"
		   });			
		addAnnotation
		  (getFmiScalarVariable_Causality(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "causality",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getFmiScalarVariable_Description(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "description",
			 "namespace", "##targetNamespace"
		   });			
		addAnnotation
		  (getFmiScalarVariable_Initial(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "initial",
			 "namespace", "##targetNamespace"
		   });			
		addAnnotation
		  (getFmiScalarVariable_Name(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "name",
			 "namespace", "##targetNamespace"
		   });			
		addAnnotation
		  (getFmiScalarVariable_ValueReference(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "valueReference",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getFmiScalarVariable_Variability(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "variability",
			 "namespace", "##targetNamespace"
		   });			
		addAnnotation
		  (fmiSimpleTypeEClass, 
		   source, 
		   new String[] {
			 "name", "fmiSimpleType",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getFmiSimpleType_Real(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "Real",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getFmiSimpleType_Integer(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "Integer",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getFmiSimpleType_Boolean(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "Boolean",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getFmiSimpleType_String(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "String",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getFmiSimpleType_Enumeration(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "Enumeration",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getFmiSimpleType_Description(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "description",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getFmiSimpleType_Name(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "name",
			 "namespace", "##targetNamespace"
		   });			
		addAnnotation
		  (fmiUnitEClass, 
		   source, 
		   new String[] {
			 "name", "fmiUnit",
			 "kind", "elementOnly"
		   });			
		addAnnotation
		  (getFmiUnit_BaseUnit(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "BaseUnit",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getFmiUnit_Group(), 
		   source, 
		   new String[] {
			 "kind", "group",
			 "name", "group:1"
		   });			
		addAnnotation
		  (getFmiUnit_DisplayUnit(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "DisplayUnit",
			 "namespace", "##targetNamespace",
			 "group", "group:1"
		   });			
		addAnnotation
		  (getFmiUnit_Name(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "name",
			 "namespace", "##targetNamespace"
		   });			
		addAnnotation
		  (fmiVariableDependencyEClass, 
		   source, 
		   new String[] {
			 "name", "fmiVariableDependency",
			 "kind", "empty"
		   });			
		addAnnotation
		  (getFmiVariableDependency_InputDependencies(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "inputDependencies",
			 "namespace", "##targetNamespace"
		   });			
		addAnnotation
		  (getFmiVariableDependency_InputFactorKinds(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "inputFactorKinds",
			 "namespace", "##targetNamespace"
		   });			
		addAnnotation
		  (getFmiVariableDependency_StateDependencies(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "stateDependencies",
			 "namespace", "##targetNamespace"
		   });			
		addAnnotation
		  (getFmiVariableDependency_StateFactorKinds(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "stateFactorKinds",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (initialTypeEEnum, 
		   source, 
		   new String[] {
			 "name", "initial_._type"
		   });		
		addAnnotation
		  (initialTypeObjectEDataType, 
		   source, 
		   new String[] {
			 "name", "initial_._type:Object",
			 "baseType", "initial_._type"
		   });		
		addAnnotation
		  (inputDependenciesTypeEDataType, 
		   source, 
		   new String[] {
			 "name", "inputDependencies_._type",
			 "itemType", "http://www.eclipse.org/emf/2003/XMLType#int"
		   });		
		addAnnotation
		  (inputFactorKindsTypeEDataType, 
		   source, 
		   new String[] {
			 "name", "inputFactorKinds_._type",
			 "itemType", "fmiDependencyFactorKind"
		   });		
		addAnnotation
		  (inputsTypeEClass, 
		   source, 
		   new String[] {
			 "name", "Inputs_._type",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getInputsType_Group(), 
		   source, 
		   new String[] {
			 "kind", "group",
			 "name", "group:0"
		   });		
		addAnnotation
		  (getInputsType_Input(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "Input",
			 "namespace", "##targetNamespace",
			 "group", "group:0"
		   });		
		addAnnotation
		  (inputTypeEClass, 
		   source, 
		   new String[] {
			 "name", "Input_._type",
			 "kind", "empty"
		   });			
		addAnnotation
		  (getInputType_Derivative(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "derivative",
			 "namespace", "##targetNamespace"
		   });			
		addAnnotation
		  (getInputType_Name(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "name",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (integerTypeEClass, 
		   source, 
		   new String[] {
			 "name", "Integer_._type",
			 "kind", "empty"
		   });			
		addAnnotation
		  (getIntegerType_DeclaredType(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "declaredType",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getIntegerType_Max(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "max",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getIntegerType_Min(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "min",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getIntegerType_Quantity(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "quantity",
			 "namespace", "##targetNamespace"
		   });			
		addAnnotation
		  (getIntegerType_Start(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "start",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (integerType1EClass, 
		   source, 
		   new String[] {
			 "name", "Integer_._1_._type",
			 "kind", "empty"
		   });		
		addAnnotation
		  (getIntegerType1_Max(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "max",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getIntegerType1_Min(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "min",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getIntegerType1_Quantity(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "quantity",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (itemTypeEClass, 
		   source, 
		   new String[] {
			 "name", "Item_._type",
			 "kind", "empty"
		   });		
		addAnnotation
		  (getItemType_Description(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "description",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getItemType_Name(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "name",
			 "namespace", "##targetNamespace"
		   });			
		addAnnotation
		  (getItemType_Value(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "value",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (logCategoriesTypeEClass, 
		   source, 
		   new String[] {
			 "name", "LogCategories_._type",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getLogCategoriesType_Group(), 
		   source, 
		   new String[] {
			 "kind", "group",
			 "name", "group:0"
		   });		
		addAnnotation
		  (getLogCategoriesType_Category(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "Category",
			 "namespace", "##targetNamespace",
			 "group", "group:0"
		   });			
		addAnnotation
		  (modelExchangeTypeEClass, 
		   source, 
		   new String[] {
			 "name", "ModelExchange_._type",
			 "kind", "empty"
		   });		
		addAnnotation
		  (getModelExchangeType_CanBeInstantiatedOnlyOncePerProcess(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "canBeInstantiatedOnlyOncePerProcess",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getModelExchangeType_CanGetAndSetFMUstate(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "canGetAndSetFMUstate",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getModelExchangeType_CanNotUseMemoryManagementFunctions(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "canNotUseMemoryManagementFunctions",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getModelExchangeType_CanSerializeFMUstate(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "canSerializeFMUstate",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getModelExchangeType_CompletedIntegratorStepNotNeeded(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "completedIntegratorStepNotNeeded",
			 "namespace", "##targetNamespace"
		   });			
		addAnnotation
		  (getModelExchangeType_ModelIdentifier(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "modelIdentifier",
			 "namespace", "##targetNamespace"
		   });			
		addAnnotation
		  (getModelExchangeType_NeedsExecutionTool(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "needsExecutionTool",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getModelExchangeType_ProvidesDirectionalDerivatives(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "providesDirectionalDerivatives",
			 "namespace", "##targetNamespace"
		   });			
		addAnnotation
		  (getModelExchangeType_ProvidesPartialDerivativesOfDerivativeFunctionWrtInputs(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "providesPartialDerivativesOf_DerivativeFunction_wrt_Inputs",
			 "namespace", "##targetNamespace"
		   });			
		addAnnotation
		  (getModelExchangeType_ProvidesPartialDerivativesOfDerivativeFunctionWrtStates(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "providesPartialDerivativesOf_DerivativeFunction_wrt_States",
			 "namespace", "##targetNamespace"
		   });			
		addAnnotation
		  (getModelExchangeType_ProvidesPartialDerivativesOfOutputFunctionWrtInputs(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "providesPartialDerivativesOf_OutputFunction_wrt_Inputs",
			 "namespace", "##targetNamespace"
		   });			
		addAnnotation
		  (getModelExchangeType_ProvidesPartialDerivativesOfOutputFunctionWrtStates(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "providesPartialDerivativesOf_OutputFunction_wrt_States",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (modelStructureTypeEClass, 
		   source, 
		   new String[] {
			 "name", "ModelStructure_._type",
			 "kind", "elementOnly"
		   });			
		addAnnotation
		  (getModelStructureType_Inputs(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "Inputs",
			 "namespace", "##targetNamespace"
		   });			
		addAnnotation
		  (getModelStructureType_Derivatives(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "Derivatives",
			 "namespace", "##targetNamespace"
		   });			
		addAnnotation
		  (getModelStructureType_Outputs(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "Outputs",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (modelVariablesTypeEClass, 
		   source, 
		   new String[] {
			 "name", "ModelVariables_._type",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getModelVariablesType_Group(), 
		   source, 
		   new String[] {
			 "kind", "group",
			 "name", "group:0"
		   });		
		addAnnotation
		  (getModelVariablesType_ScalarVariable(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "ScalarVariable",
			 "namespace", "##targetNamespace",
			 "group", "group:0"
		   });		
		addAnnotation
		  (outputTypeEClass, 
		   source, 
		   new String[] {
			 "name", "Output_._type",
			 "kind", "empty"
		   });			
		addAnnotation
		  (getOutputType_Derivative(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "derivative",
			 "namespace", "##targetNamespace"
		   });			
		addAnnotation
		  (getOutputType_Name(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "name",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (realTypeEClass, 
		   source, 
		   new String[] {
			 "name", "Real_._type",
			 "kind", "empty"
		   });			
		addAnnotation
		  (getRealType_DisplayUnit(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "displayUnit",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getRealType_Max(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "max",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getRealType_Min(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "min",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getRealType_Nominal(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "nominal",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getRealType_Quantity(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "quantity",
			 "namespace", "##targetNamespace"
		   });			
		addAnnotation
		  (getRealType_RelativeQuantity(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "relativeQuantity",
			 "namespace", "##targetNamespace"
		   });			
		addAnnotation
		  (getRealType_Unbounded(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "unbounded",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getRealType_Unit(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "unit",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (toolTypeEClass, 
		   source, 
		   new String[] {
			 "name", "Tool_._type",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getToolType_Any(), 
		   source, 
		   new String[] {
			 "kind", "elementWildcard",
			 "wildcards", "##any",
			 "name", ":0",
			 "processing", "strict"
		   });			
		addAnnotation
		  (getToolType_Name(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "name",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (documentRootEClass, 
		   source, 
		   new String[] {
			 "name", "",
			 "kind", "mixed"
		   });		
		addAnnotation
		  (getDocumentRoot_Mixed(), 
		   source, 
		   new String[] {
			 "kind", "elementWildcard",
			 "name", ":mixed"
		   });		
		addAnnotation
		  (getDocumentRoot_XMLNSPrefixMap(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "xmlns:prefix"
		   });		
		addAnnotation
		  (getDocumentRoot_XSISchemaLocation(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "xsi:schemaLocation"
		   });		
		addAnnotation
		  (getDocumentRoot_FmiModelDescription(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "fmiModelDescription",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (outputsTypeEClass, 
		   source, 
		   new String[] {
			 "name", "Outputs_._type",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getOutputsType_Group(), 
		   source, 
		   new String[] {
			 "kind", "group",
			 "name", "group:0"
		   });		
		addAnnotation
		  (getOutputsType_Output(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "Output",
			 "namespace", "##targetNamespace",
			 "group", "group:0"
		   });		
		addAnnotation
		  (realType1EClass, 
		   source, 
		   new String[] {
			 "name", "Real_._1_._type",
			 "kind", "empty"
		   });			
		addAnnotation
		  (getRealType1_DeclaredType(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "declaredType",
			 "namespace", "##targetNamespace"
		   });			
		addAnnotation
		  (getRealType1_DisplayUnit(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "displayUnit",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getRealType1_Max(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "max",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getRealType1_Min(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "min",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getRealType1_Nominal(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "nominal",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getRealType1_Quantity(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "quantity",
			 "namespace", "##targetNamespace"
		   });			
		addAnnotation
		  (getRealType1_RelativeQuantity(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "relativeQuantity",
			 "namespace", "##targetNamespace"
		   });			
		addAnnotation
		  (getRealType1_Start(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "start",
			 "namespace", "##targetNamespace"
		   });			
		addAnnotation
		  (getRealType1_Unbounded(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "unbounded",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getRealType1_Unit(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "unit",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (stateDependenciesTypeEDataType, 
		   source, 
		   new String[] {
			 "name", "stateDependencies_._type",
			 "itemType", "http://www.eclipse.org/emf/2003/XMLType#int"
		   });		
		addAnnotation
		  (stateFactorKindsTypeEDataType, 
		   source, 
		   new String[] {
			 "name", "stateFactorKinds_._type",
			 "itemType", "fmiDependencyFactorKind"
		   });		
		addAnnotation
		  (stringTypeEClass, 
		   source, 
		   new String[] {
			 "name", "String_._type",
			 "kind", "empty"
		   });			
		addAnnotation
		  (getStringType_DeclaredType(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "declaredType",
			 "namespace", "##targetNamespace"
		   });			
		addAnnotation
		  (getStringType_Start(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "start",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (typeDefinitionsTypeEClass, 
		   source, 
		   new String[] {
			 "name", "TypeDefinitions_._type",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getTypeDefinitionsType_Group(), 
		   source, 
		   new String[] {
			 "kind", "group",
			 "name", "group:0"
		   });		
		addAnnotation
		  (getTypeDefinitionsType_SimpleType(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "SimpleType",
			 "namespace", "##targetNamespace",
			 "group", "group:0"
		   });		
		addAnnotation
		  (unitDefinitionsTypeEClass, 
		   source, 
		   new String[] {
			 "name", "UnitDefinitions_._type",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getUnitDefinitionsType_Group(), 
		   source, 
		   new String[] {
			 "kind", "group",
			 "name", "group:0"
		   });		
		addAnnotation
		  (getUnitDefinitionsType_Unit(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "Unit",
			 "namespace", "##targetNamespace",
			 "group", "group:0"
		   });		
		addAnnotation
		  (variabilityTypeEEnum, 
		   source, 
		   new String[] {
			 "name", "variability_._type"
		   });		
		addAnnotation
		  (variabilityTypeObjectEDataType, 
		   source, 
		   new String[] {
			 "name", "variability_._type:Object",
			 "baseType", "variability_._type"
		   });		
		addAnnotation
		  (variableNamingConventionTypeEEnum, 
		   source, 
		   new String[] {
			 "name", "variableNamingConvention_._type"
		   });		
		addAnnotation
		  (variableNamingConventionTypeObjectEDataType, 
		   source, 
		   new String[] {
			 "name", "variableNamingConvention_._type:Object",
			 "baseType", "variableNamingConvention_._type"
		   });
	}

} //FmiModelPackageImpl
