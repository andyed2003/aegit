/**
 */
package FmiModelDescriptionV1.impl;

import FmiModelDescriptionV1.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class FmiModelDescriptionV1FactoryImpl extends EFactoryImpl implements FmiModelDescriptionV1Factory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static FmiModelDescriptionV1Factory init() {
		try {
			FmiModelDescriptionV1Factory theFmiModelDescriptionV1Factory = (FmiModelDescriptionV1Factory)EPackage.Registry.INSTANCE.getEFactory("ac.soton.fmusim.codegen.metamodelDescription/model/fmiModelDescriptionV1.xsd"); 
			if (theFmiModelDescriptionV1Factory != null) {
				return theFmiModelDescriptionV1Factory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new FmiModelDescriptionV1FactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FmiModelDescriptionV1FactoryImpl() {
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
			case FmiModelDescriptionV1Package.ANNOTATION_TYPE: return createAnnotationType();
			case FmiModelDescriptionV1Package.BOOLEAN_TYPE: return createBooleanType();
			case FmiModelDescriptionV1Package.DEFAULT_EXPERIMENT_TYPE: return createDefaultExperimentType();
			case FmiModelDescriptionV1Package.DIRECT_DEPENDENCY_TYPE: return createDirectDependencyType();
			case FmiModelDescriptionV1Package.DISPLAY_UNIT_DEFINITION_TYPE: return createDisplayUnitDefinitionType();
			case FmiModelDescriptionV1Package.DOCUMENT_ROOT: return createDocumentRoot();
			case FmiModelDescriptionV1Package.ENUMERATION_TYPE: return createEnumerationType();
			case FmiModelDescriptionV1Package.ENUMERATION_TYPE_TYPE: return createEnumerationTypeType();
			case FmiModelDescriptionV1Package.FMI_BASE_UNIT: return createFmiBaseUnit();
			case FmiModelDescriptionV1Package.FMI_MODEL_DESCRIPTION_TYPE: return createFmiModelDescriptionType();
			case FmiModelDescriptionV1Package.FMI_SCALAR_VARIABLE: return createFmiScalarVariable();
			case FmiModelDescriptionV1Package.FMI_TYPE: return createFmiType();
			case FmiModelDescriptionV1Package.INTEGER_TYPE: return createIntegerType();
			case FmiModelDescriptionV1Package.INTEGER_TYPE_TYPE: return createIntegerTypeType();
			case FmiModelDescriptionV1Package.ITEM_TYPE: return createItemType();
			case FmiModelDescriptionV1Package.MODEL_VARIABLES_TYPE: return createModelVariablesType();
			case FmiModelDescriptionV1Package.REAL_TYPE: return createRealType();
			case FmiModelDescriptionV1Package.REAL_TYPE_TYPE: return createRealTypeType();
			case FmiModelDescriptionV1Package.STRING_TYPE: return createStringType();
			case FmiModelDescriptionV1Package.TOOL_TYPE: return createToolType();
			case FmiModelDescriptionV1Package.TYPE_DEFINITIONS_TYPE: return createTypeDefinitionsType();
			case FmiModelDescriptionV1Package.UNIT_DEFINITIONS_TYPE: return createUnitDefinitionsType();
			case FmiModelDescriptionV1Package.IMPLEMENTATION_TYPE: return createImplementationType();
			case FmiModelDescriptionV1Package.CO_SIMULATION_STAND_ALONE: return createCoSimulation_StandAlone();
			case FmiModelDescriptionV1Package.CO_SIMULATION_TOOL: return createCoSimulation_Tool();
			case FmiModelDescriptionV1Package.VENDOR_ANNOTATIONS_TYPE: return createVendorAnnotationsType();
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
			case FmiModelDescriptionV1Package.ALIAS_TYPE:
				return createAliasTypeFromString(eDataType, initialValue);
			case FmiModelDescriptionV1Package.CAUSALITY_TYPE:
				return createCausalityTypeFromString(eDataType, initialValue);
			case FmiModelDescriptionV1Package.VARIABILITY_TYPE:
				return createVariabilityTypeFromString(eDataType, initialValue);
			case FmiModelDescriptionV1Package.VARIABLE_NAMING_CONVENTION_TYPE:
				return createVariableNamingConventionTypeFromString(eDataType, initialValue);
			case FmiModelDescriptionV1Package.ALIAS_TYPE_OBJECT:
				return createAliasTypeObjectFromString(eDataType, initialValue);
			case FmiModelDescriptionV1Package.CAUSALITY_TYPE_OBJECT:
				return createCausalityTypeObjectFromString(eDataType, initialValue);
			case FmiModelDescriptionV1Package.VARIABILITY_TYPE_OBJECT:
				return createVariabilityTypeObjectFromString(eDataType, initialValue);
			case FmiModelDescriptionV1Package.VARIABLE_NAMING_CONVENTION_TYPE_OBJECT:
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
			case FmiModelDescriptionV1Package.ALIAS_TYPE:
				return convertAliasTypeToString(eDataType, instanceValue);
			case FmiModelDescriptionV1Package.CAUSALITY_TYPE:
				return convertCausalityTypeToString(eDataType, instanceValue);
			case FmiModelDescriptionV1Package.VARIABILITY_TYPE:
				return convertVariabilityTypeToString(eDataType, instanceValue);
			case FmiModelDescriptionV1Package.VARIABLE_NAMING_CONVENTION_TYPE:
				return convertVariableNamingConventionTypeToString(eDataType, instanceValue);
			case FmiModelDescriptionV1Package.ALIAS_TYPE_OBJECT:
				return convertAliasTypeObjectToString(eDataType, instanceValue);
			case FmiModelDescriptionV1Package.CAUSALITY_TYPE_OBJECT:
				return convertCausalityTypeObjectToString(eDataType, instanceValue);
			case FmiModelDescriptionV1Package.VARIABILITY_TYPE_OBJECT:
				return convertVariabilityTypeObjectToString(eDataType, instanceValue);
			case FmiModelDescriptionV1Package.VARIABLE_NAMING_CONVENTION_TYPE_OBJECT:
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
	public AnnotationType createAnnotationType() {
		AnnotationTypeImpl annotationType = new AnnotationTypeImpl();
		return annotationType;
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
	public DefaultExperimentType createDefaultExperimentType() {
		DefaultExperimentTypeImpl defaultExperimentType = new DefaultExperimentTypeImpl();
		return defaultExperimentType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DirectDependencyType createDirectDependencyType() {
		DirectDependencyTypeImpl directDependencyType = new DirectDependencyTypeImpl();
		return directDependencyType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DisplayUnitDefinitionType createDisplayUnitDefinitionType() {
		DisplayUnitDefinitionTypeImpl displayUnitDefinitionType = new DisplayUnitDefinitionTypeImpl();
		return displayUnitDefinitionType;
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
	public EnumerationType createEnumerationType() {
		EnumerationTypeImpl enumerationType = new EnumerationTypeImpl();
		return enumerationType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EnumerationTypeType createEnumerationTypeType() {
		EnumerationTypeTypeImpl enumerationTypeType = new EnumerationTypeTypeImpl();
		return enumerationTypeType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FmiBaseUnit createFmiBaseUnit() {
		FmiBaseUnitImpl fmiBaseUnit = new FmiBaseUnitImpl();
		return fmiBaseUnit;
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
	public FmiType createFmiType() {
		FmiTypeImpl fmiType = new FmiTypeImpl();
		return fmiType;
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
	public IntegerTypeType createIntegerTypeType() {
		IntegerTypeTypeImpl integerTypeType = new IntegerTypeTypeImpl();
		return integerTypeType;
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
	public ModelVariablesType createModelVariablesType() {
		ModelVariablesTypeImpl modelVariablesType = new ModelVariablesTypeImpl();
		return modelVariablesType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ImplementationType createImplementationType() {
		ImplementationTypeImpl implementationType = new ImplementationTypeImpl();
		return implementationType;
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
	public RealTypeType createRealTypeType() {
		RealTypeTypeImpl realTypeType = new RealTypeTypeImpl();
		return realTypeType;
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
	public ToolType createToolType() {
		ToolTypeImpl toolType = new ToolTypeImpl();
		return toolType;
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
	public VendorAnnotationsType createVendorAnnotationsType() {
		VendorAnnotationsTypeImpl vendorAnnotationsType = new VendorAnnotationsTypeImpl();
		return vendorAnnotationsType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AliasType createAliasTypeFromString(EDataType eDataType, String initialValue) {
		AliasType result = AliasType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertAliasTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
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
	public AliasType createAliasTypeObjectFromString(EDataType eDataType, String initialValue) {
		return createAliasTypeFromString(FmiModelDescriptionV1Package.Literals.ALIAS_TYPE, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertAliasTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertAliasTypeToString(FmiModelDescriptionV1Package.Literals.ALIAS_TYPE, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CausalityType createCausalityTypeObjectFromString(EDataType eDataType, String initialValue) {
		return createCausalityTypeFromString(FmiModelDescriptionV1Package.Literals.CAUSALITY_TYPE, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertCausalityTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertCausalityTypeToString(FmiModelDescriptionV1Package.Literals.CAUSALITY_TYPE, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VariabilityType createVariabilityTypeObjectFromString(EDataType eDataType, String initialValue) {
		return createVariabilityTypeFromString(FmiModelDescriptionV1Package.Literals.VARIABILITY_TYPE, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertVariabilityTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertVariabilityTypeToString(FmiModelDescriptionV1Package.Literals.VARIABILITY_TYPE, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VariableNamingConventionType createVariableNamingConventionTypeObjectFromString(EDataType eDataType, String initialValue) {
		return createVariableNamingConventionTypeFromString(FmiModelDescriptionV1Package.Literals.VARIABLE_NAMING_CONVENTION_TYPE, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertVariableNamingConventionTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertVariableNamingConventionTypeToString(FmiModelDescriptionV1Package.Literals.VARIABLE_NAMING_CONVENTION_TYPE, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FmiModelDescriptionV1Package getFmiModelDescriptionV1Package() {
		return (FmiModelDescriptionV1Package)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static FmiModelDescriptionV1Package getPackage() {
		return FmiModelDescriptionV1Package.eINSTANCE;
	}

} //FmiModelDescriptionV1FactoryImpl
