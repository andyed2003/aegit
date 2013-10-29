/**
 */
package FmiModel.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;
import org.eclipse.emf.ecore.EObject;

import FmiModel.BaseUnitType;
import FmiModel.BooleanType;
import FmiModel.CategoryType;
import FmiModel.CoSimulationType;
import FmiModel.DefaultExperimentType;
import FmiModel.DerivativeType;
import FmiModel.DerivativesType;
import FmiModel.DisplayUnitType;
import FmiModel.DocumentRoot;
import FmiModel.EnumerationType;
import FmiModel.EnumerationType1;
import FmiModel.FmiAnnotation;
import FmiModel.FmiModelDescriptionType;
import FmiModel.FmiModelPackage;
import FmiModel.FmiScalarVariable;
import FmiModel.FmiSimpleType;
import FmiModel.FmiUnit;
import FmiModel.FmiVariableDependency;
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
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see FmiModel.FmiModelPackage
 * @generated
 */
public class FmiModelAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static FmiModelPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FmiModelAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = FmiModelPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FmiModelSwitch<Adapter> modelSwitch =
		new FmiModelSwitch<Adapter>() {
			@Override
			public Adapter caseBaseUnitType(BaseUnitType object) {
				return createBaseUnitTypeAdapter();
			}
			@Override
			public Adapter caseBooleanType(BooleanType object) {
				return createBooleanTypeAdapter();
			}
			@Override
			public Adapter caseCategoryType(CategoryType object) {
				return createCategoryTypeAdapter();
			}
			@Override
			public Adapter caseCoSimulationType(CoSimulationType object) {
				return createCoSimulationTypeAdapter();
			}
			@Override
			public Adapter caseDefaultExperimentType(DefaultExperimentType object) {
				return createDefaultExperimentTypeAdapter();
			}
			@Override
			public Adapter caseDerivativesType(DerivativesType object) {
				return createDerivativesTypeAdapter();
			}
			@Override
			public Adapter caseDerivativeType(DerivativeType object) {
				return createDerivativeTypeAdapter();
			}
			@Override
			public Adapter caseDisplayUnitType(DisplayUnitType object) {
				return createDisplayUnitTypeAdapter();
			}
			@Override
			public Adapter caseEnumerationType(EnumerationType object) {
				return createEnumerationTypeAdapter();
			}
			@Override
			public Adapter caseEnumerationType1(EnumerationType1 object) {
				return createEnumerationType1Adapter();
			}
			@Override
			public Adapter caseFmiAnnotation(FmiAnnotation object) {
				return createFmiAnnotationAdapter();
			}
			@Override
			public Adapter caseFmiModelDescriptionType(FmiModelDescriptionType object) {
				return createFmiModelDescriptionTypeAdapter();
			}
			@Override
			public Adapter caseFmiScalarVariable(FmiScalarVariable object) {
				return createFmiScalarVariableAdapter();
			}
			@Override
			public Adapter caseFmiSimpleType(FmiSimpleType object) {
				return createFmiSimpleTypeAdapter();
			}
			@Override
			public Adapter caseFmiUnit(FmiUnit object) {
				return createFmiUnitAdapter();
			}
			@Override
			public Adapter caseFmiVariableDependency(FmiVariableDependency object) {
				return createFmiVariableDependencyAdapter();
			}
			@Override
			public Adapter caseInputsType(InputsType object) {
				return createInputsTypeAdapter();
			}
			@Override
			public Adapter caseInputType(InputType object) {
				return createInputTypeAdapter();
			}
			@Override
			public Adapter caseIntegerType(IntegerType object) {
				return createIntegerTypeAdapter();
			}
			@Override
			public Adapter caseIntegerType1(IntegerType1 object) {
				return createIntegerType1Adapter();
			}
			@Override
			public Adapter caseItemType(ItemType object) {
				return createItemTypeAdapter();
			}
			@Override
			public Adapter caseLogCategoriesType(LogCategoriesType object) {
				return createLogCategoriesTypeAdapter();
			}
			@Override
			public Adapter caseModelExchangeType(ModelExchangeType object) {
				return createModelExchangeTypeAdapter();
			}
			@Override
			public Adapter caseModelStructureType(ModelStructureType object) {
				return createModelStructureTypeAdapter();
			}
			@Override
			public Adapter caseModelVariablesType(ModelVariablesType object) {
				return createModelVariablesTypeAdapter();
			}
			@Override
			public Adapter caseOutputType(OutputType object) {
				return createOutputTypeAdapter();
			}
			@Override
			public Adapter caseRealType(RealType object) {
				return createRealTypeAdapter();
			}
			@Override
			public Adapter caseToolType(ToolType object) {
				return createToolTypeAdapter();
			}
			@Override
			public Adapter caseDocumentRoot(DocumentRoot object) {
				return createDocumentRootAdapter();
			}
			@Override
			public Adapter caseOutputsType(OutputsType object) {
				return createOutputsTypeAdapter();
			}
			@Override
			public Adapter caseRealType1(RealType1 object) {
				return createRealType1Adapter();
			}
			@Override
			public Adapter caseStringType(StringType object) {
				return createStringTypeAdapter();
			}
			@Override
			public Adapter caseTypeDefinitionsType(TypeDefinitionsType object) {
				return createTypeDefinitionsTypeAdapter();
			}
			@Override
			public Adapter caseUnitDefinitionsType(UnitDefinitionsType object) {
				return createUnitDefinitionsTypeAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link FmiModel.BaseUnitType <em>Base Unit Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see FmiModel.BaseUnitType
	 * @generated
	 */
	public Adapter createBaseUnitTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link FmiModel.BooleanType <em>Boolean Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see FmiModel.BooleanType
	 * @generated
	 */
	public Adapter createBooleanTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link FmiModel.CategoryType <em>Category Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see FmiModel.CategoryType
	 * @generated
	 */
	public Adapter createCategoryTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link FmiModel.CoSimulationType <em>Co Simulation Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see FmiModel.CoSimulationType
	 * @generated
	 */
	public Adapter createCoSimulationTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link FmiModel.DefaultExperimentType <em>Default Experiment Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see FmiModel.DefaultExperimentType
	 * @generated
	 */
	public Adapter createDefaultExperimentTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link FmiModel.DerivativesType <em>Derivatives Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see FmiModel.DerivativesType
	 * @generated
	 */
	public Adapter createDerivativesTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link FmiModel.DerivativeType <em>Derivative Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see FmiModel.DerivativeType
	 * @generated
	 */
	public Adapter createDerivativeTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link FmiModel.DisplayUnitType <em>Display Unit Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see FmiModel.DisplayUnitType
	 * @generated
	 */
	public Adapter createDisplayUnitTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link FmiModel.EnumerationType <em>Enumeration Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see FmiModel.EnumerationType
	 * @generated
	 */
	public Adapter createEnumerationTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link FmiModel.EnumerationType1 <em>Enumeration Type1</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see FmiModel.EnumerationType1
	 * @generated
	 */
	public Adapter createEnumerationType1Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link FmiModel.FmiAnnotation <em>Fmi Annotation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see FmiModel.FmiAnnotation
	 * @generated
	 */
	public Adapter createFmiAnnotationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link FmiModel.FmiModelDescriptionType <em>Description Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see FmiModel.FmiModelDescriptionType
	 * @generated
	 */
	public Adapter createFmiModelDescriptionTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link FmiModel.FmiScalarVariable <em>Fmi Scalar Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see FmiModel.FmiScalarVariable
	 * @generated
	 */
	public Adapter createFmiScalarVariableAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link FmiModel.FmiSimpleType <em>Fmi Simple Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see FmiModel.FmiSimpleType
	 * @generated
	 */
	public Adapter createFmiSimpleTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link FmiModel.FmiUnit <em>Fmi Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see FmiModel.FmiUnit
	 * @generated
	 */
	public Adapter createFmiUnitAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link FmiModel.FmiVariableDependency <em>Fmi Variable Dependency</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see FmiModel.FmiVariableDependency
	 * @generated
	 */
	public Adapter createFmiVariableDependencyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link FmiModel.InputsType <em>Inputs Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see FmiModel.InputsType
	 * @generated
	 */
	public Adapter createInputsTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link FmiModel.InputType <em>Input Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see FmiModel.InputType
	 * @generated
	 */
	public Adapter createInputTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link FmiModel.IntegerType <em>Integer Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see FmiModel.IntegerType
	 * @generated
	 */
	public Adapter createIntegerTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link FmiModel.IntegerType1 <em>Integer Type1</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see FmiModel.IntegerType1
	 * @generated
	 */
	public Adapter createIntegerType1Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link FmiModel.ItemType <em>Item Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see FmiModel.ItemType
	 * @generated
	 */
	public Adapter createItemTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link FmiModel.LogCategoriesType <em>Log Categories Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see FmiModel.LogCategoriesType
	 * @generated
	 */
	public Adapter createLogCategoriesTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link FmiModel.ModelExchangeType <em>Model Exchange Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see FmiModel.ModelExchangeType
	 * @generated
	 */
	public Adapter createModelExchangeTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link FmiModel.ModelStructureType <em>Model Structure Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see FmiModel.ModelStructureType
	 * @generated
	 */
	public Adapter createModelStructureTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link FmiModel.ModelVariablesType <em>Model Variables Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see FmiModel.ModelVariablesType
	 * @generated
	 */
	public Adapter createModelVariablesTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link FmiModel.OutputType <em>Output Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see FmiModel.OutputType
	 * @generated
	 */
	public Adapter createOutputTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link FmiModel.RealType <em>Real Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see FmiModel.RealType
	 * @generated
	 */
	public Adapter createRealTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link FmiModel.ToolType <em>Tool Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see FmiModel.ToolType
	 * @generated
	 */
	public Adapter createToolTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link FmiModel.DocumentRoot <em>Document Root</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see FmiModel.DocumentRoot
	 * @generated
	 */
	public Adapter createDocumentRootAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link FmiModel.OutputsType <em>Outputs Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see FmiModel.OutputsType
	 * @generated
	 */
	public Adapter createOutputsTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link FmiModel.RealType1 <em>Real Type1</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see FmiModel.RealType1
	 * @generated
	 */
	public Adapter createRealType1Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link FmiModel.StringType <em>String Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see FmiModel.StringType
	 * @generated
	 */
	public Adapter createStringTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link FmiModel.TypeDefinitionsType <em>Type Definitions Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see FmiModel.TypeDefinitionsType
	 * @generated
	 */
	public Adapter createTypeDefinitionsTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link FmiModel.UnitDefinitionsType <em>Unit Definitions Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see FmiModel.UnitDefinitionsType
	 * @generated
	 */
	public Adapter createUnitDefinitionsTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //FmiModelAdapterFactory
