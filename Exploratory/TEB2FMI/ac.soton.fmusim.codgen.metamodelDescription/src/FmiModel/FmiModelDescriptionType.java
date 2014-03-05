/**
 */
package FmiModel;

import javax.xml.datatype.XMLGregorianCalendar;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.FeatureMap;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Description Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link FmiModel.FmiModelDescriptionType#getGroup <em>Group</em>}</li>
 *   <li>{@link FmiModel.FmiModelDescriptionType#getModelExchange <em>Model Exchange</em>}</li>
 *   <li>{@link FmiModel.FmiModelDescriptionType#getCoSimulation <em>Co Simulation</em>}</li>
 *   <li>{@link FmiModel.FmiModelDescriptionType#getUnitDefinitions <em>Unit Definitions</em>}</li>
 *   <li>{@link FmiModel.FmiModelDescriptionType#getTypeDefinitions <em>Type Definitions</em>}</li>
 *   <li>{@link FmiModel.FmiModelDescriptionType#getLogCategories <em>Log Categories</em>}</li>
 *   <li>{@link FmiModel.FmiModelDescriptionType#getDefaultExperiment <em>Default Experiment</em>}</li>
 *   <li>{@link FmiModel.FmiModelDescriptionType#getVendorAnnotations <em>Vendor Annotations</em>}</li>
 *   <li>{@link FmiModel.FmiModelDescriptionType#getModelVariables <em>Model Variables</em>}</li>
 *   <li>{@link FmiModel.FmiModelDescriptionType#getModelStructure <em>Model Structure</em>}</li>
 *   <li>{@link FmiModel.FmiModelDescriptionType#getAuthor <em>Author</em>}</li>
 *   <li>{@link FmiModel.FmiModelDescriptionType#getCopyright <em>Copyright</em>}</li>
 *   <li>{@link FmiModel.FmiModelDescriptionType#getDescription <em>Description</em>}</li>
 *   <li>{@link FmiModel.FmiModelDescriptionType#getFmiVersion <em>Fmi Version</em>}</li>
 *   <li>{@link FmiModel.FmiModelDescriptionType#getGenerationDateAndTime <em>Generation Date And Time</em>}</li>
 *   <li>{@link FmiModel.FmiModelDescriptionType#getGenerationTool <em>Generation Tool</em>}</li>
 *   <li>{@link FmiModel.FmiModelDescriptionType#getGuid <em>Guid</em>}</li>
 *   <li>{@link FmiModel.FmiModelDescriptionType#getLicense <em>License</em>}</li>
 *   <li>{@link FmiModel.FmiModelDescriptionType#getModelName <em>Model Name</em>}</li>
 *   <li>{@link FmiModel.FmiModelDescriptionType#getNumberOfEventIndicators <em>Number Of Event Indicators</em>}</li>
 *   <li>{@link FmiModel.FmiModelDescriptionType#getVariableNamingConvention <em>Variable Naming Convention</em>}</li>
 *   <li>{@link FmiModel.FmiModelDescriptionType#getVersion <em>Version</em>}</li>
 *   <li>{@link FmiModel.FmiModelDescriptionType#getModelIdentifier <em>Model Identifier</em>}</li>
 *   <li>{@link FmiModel.FmiModelDescriptionType#getNumberOfContinuousStates <em>Number Of Continuous States</em>}</li>
 * </ul>
 * </p>
 *
 * @see FmiModel.FmiModelPackage#getFmiModelDescriptionType()
 * @model extendedMetaData="name='fmiModelDescription_._type' kind='elementOnly'"
 * @generated
 */
public interface FmiModelDescriptionType extends EObject {
	/**
	 * Returns the value of the '<em><b>Group</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * At least one of the elements must be present
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Group</em>' attribute list.
	 * @see FmiModel.FmiModelPackage#getFmiModelDescriptionType_Group()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='group' name='group:0'"
	 * @generated
	 */
	FeatureMap getGroup();

	/**
	 * Returns the value of the '<em><b>Model Exchange</b></em>' containment reference list.
	 * The list contents are of type {@link FmiModel.ModelExchangeType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The FMU includes a model or the communication to a tool that provides a model. The environment provides the simulation engine for the model.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Model Exchange</em>' containment reference list.
	 * @see FmiModel.FmiModelPackage#getFmiModelDescriptionType_ModelExchange()
	 * @model containment="true" upper="2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='ModelExchange' namespace='##targetNamespace' group='group:0'"
	 * @generated
	 */
	EList<ModelExchangeType> getModelExchange();

	/**
	 * Returns the value of the '<em><b>Co Simulation</b></em>' containment reference list.
	 * The list contents are of type {@link FmiModel.CoSimulationType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The FMU includes a model and the simulation engine, or the communication to a tool that provides this. The environment provides the master algorithm for the Co-Simulation coupling.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Co Simulation</em>' containment reference list.
	 * @see FmiModel.FmiModelPackage#getFmiModelDescriptionType_CoSimulation()
	 * @model containment="true" upper="2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='CoSimulation' namespace='##targetNamespace' group='group:0'"
	 * @generated
	 */
	EList<CoSimulationType> getCoSimulation();

	/**
	 * Returns the value of the '<em><b>Unit Definitions</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Unit Definitions</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Unit Definitions</em>' containment reference.
	 * @see #setUnitDefinitions(UnitDefinitionsType)
	 * @see FmiModel.FmiModelPackage#getFmiModelDescriptionType_UnitDefinitions()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='UnitDefinitions' namespace='##targetNamespace'"
	 * @generated
	 */
	UnitDefinitionsType getUnitDefinitions();

	/**
	 * Sets the value of the '{@link FmiModel.FmiModelDescriptionType#getUnitDefinitions <em>Unit Definitions</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Unit Definitions</em>' containment reference.
	 * @see #getUnitDefinitions()
	 * @generated
	 */
	void setUnitDefinitions(UnitDefinitionsType value);

	/**
	 * Returns the value of the '<em><b>Type Definitions</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type Definitions</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type Definitions</em>' containment reference.
	 * @see #setTypeDefinitions(TypeDefinitionsType)
	 * @see FmiModel.FmiModelPackage#getFmiModelDescriptionType_TypeDefinitions()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='TypeDefinitions' namespace='##targetNamespace'"
	 * @generated
	 */
	TypeDefinitionsType getTypeDefinitions();

	/**
	 * Sets the value of the '{@link FmiModel.FmiModelDescriptionType#getTypeDefinitions <em>Type Definitions</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type Definitions</em>' containment reference.
	 * @see #getTypeDefinitions()
	 * @generated
	 */
	void setTypeDefinitions(TypeDefinitionsType value);

	/**
	 * Returns the value of the '<em><b>Log Categories</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Log categories available in FMU
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Log Categories</em>' containment reference.
	 * @see #setLogCategories(LogCategoriesType)
	 * @see FmiModel.FmiModelPackage#getFmiModelDescriptionType_LogCategories()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='LogCategories' namespace='##targetNamespace'"
	 * @generated
	 */
	LogCategoriesType getLogCategories();

	/**
	 * Sets the value of the '{@link FmiModel.FmiModelDescriptionType#getLogCategories <em>Log Categories</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Log Categories</em>' containment reference.
	 * @see #getLogCategories()
	 * @generated
	 */
	void setLogCategories(LogCategoriesType value);

	/**
	 * Returns the value of the '<em><b>Default Experiment</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Default Experiment</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Default Experiment</em>' containment reference.
	 * @see #setDefaultExperiment(DefaultExperimentType)
	 * @see FmiModel.FmiModelPackage#getFmiModelDescriptionType_DefaultExperiment()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='DefaultExperiment' namespace='##targetNamespace'"
	 * @generated
	 */
	DefaultExperimentType getDefaultExperiment();

	/**
	 * Sets the value of the '{@link FmiModel.FmiModelDescriptionType#getDefaultExperiment <em>Default Experiment</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Default Experiment</em>' containment reference.
	 * @see #getDefaultExperiment()
	 * @generated
	 */
	void setDefaultExperiment(DefaultExperimentType value);

	/**
	 * Returns the value of the '<em><b>Vendor Annotations</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Tool specific data (ignored by other tools)
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Vendor Annotations</em>' containment reference.
	 * @see #setVendorAnnotations(FmiAnnotation)
	 * @see FmiModel.FmiModelPackage#getFmiModelDescriptionType_VendorAnnotations()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='VendorAnnotations' namespace='##targetNamespace'"
	 * @generated
	 */
	FmiAnnotation getVendorAnnotations();

	/**
	 * Sets the value of the '{@link FmiModel.FmiModelDescriptionType#getVendorAnnotations <em>Vendor Annotations</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Vendor Annotations</em>' containment reference.
	 * @see #getVendorAnnotations()
	 * @generated
	 */
	void setVendorAnnotations(FmiAnnotation value);

	/**
	 * Returns the value of the '<em><b>Model Variables</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Model Variables</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Model Variables</em>' containment reference.
	 * @see #setModelVariables(ModelVariablesType)
	 * @see FmiModel.FmiModelPackage#getFmiModelDescriptionType_ModelVariables()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='ModelVariables' namespace='##targetNamespace'"
	 * @generated
	 */
	ModelVariablesType getModelVariables();

	/**
	 * Sets the value of the '{@link FmiModel.FmiModelDescriptionType#getModelVariables <em>Model Variables</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Model Variables</em>' containment reference.
	 * @see #getModelVariables()
	 * @generated
	 */
	void setModelVariables(ModelVariablesType value);

	/**
	 * Returns the value of the '<em><b>Model Structure</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Model Structure</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Model Structure</em>' containment reference.
	 * @see #setModelStructure(ModelStructureType)
	 * @see FmiModel.FmiModelPackage#getFmiModelDescriptionType_ModelStructure()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='ModelStructure' namespace='##targetNamespace'"
	 * @generated
	 */
	ModelStructureType getModelStructure();

	/**
	 * Sets the value of the '{@link FmiModel.FmiModelDescriptionType#getModelStructure <em>Model Structure</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Model Structure</em>' containment reference.
	 * @see #getModelStructure()
	 * @generated
	 */
	void setModelStructure(ModelStructureType value);

	/**
	 * Returns the value of the '<em><b>Author</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Author</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Author</em>' attribute.
	 * @see #setAuthor(String)
	 * @see FmiModel.FmiModelPackage#getFmiModelDescriptionType_Author()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='author' namespace='##targetNamespace'"
	 * @generated
	 */
	String getAuthor();

	/**
	 * Sets the value of the '{@link FmiModel.FmiModelDescriptionType#getAuthor <em>Author</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Author</em>' attribute.
	 * @see #getAuthor()
	 * @generated
	 */
	void setAuthor(String value);

	/**
	 * Returns the value of the '<em><b>Copyright</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Information on intellectual property copyright for this FMU, such as “© MyCompany 2011“
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Copyright</em>' attribute.
	 * @see #setCopyright(String)
	 * @see FmiModel.FmiModelPackage#getFmiModelDescriptionType_Copyright()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='copyright' namespace='##targetNamespace'"
	 * @generated
	 */
	String getCopyright();

	/**
	 * Sets the value of the '{@link FmiModel.FmiModelDescriptionType#getCopyright <em>Copyright</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Copyright</em>' attribute.
	 * @see #getCopyright()
	 * @generated
	 */
	void setCopyright(String value);

	/**
	 * Returns the value of the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Description</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Description</em>' attribute.
	 * @see #setDescription(String)
	 * @see FmiModel.FmiModelPackage#getFmiModelDescriptionType_Description()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='description' namespace='##targetNamespace'"
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link FmiModel.FmiModelDescriptionType#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

	/**
	 * Returns the value of the '<em><b>Fmi Version</b></em>' attribute.
	 * The default value is <code>"2.0"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Fmi Version</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fmi Version</em>' attribute.
	 * @see #isSetFmiVersion()
	 * @see #unsetFmiVersion()
	 * @see #setFmiVersion(String)
	 * @see FmiModel.FmiModelPackage#getFmiModelDescriptionType_FmiVersion()
	 * @model default="2.0" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.NormalizedString" required="true"
	 *        extendedMetaData="kind='attribute' name='fmiVersion' namespace='##targetNamespace'"
	 * @generated
	 */
	String getFmiVersion();

	/**
	 * Sets the value of the '{@link FmiModel.FmiModelDescriptionType#getFmiVersion <em>Fmi Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Fmi Version</em>' attribute.
	 * @see #isSetFmiVersion()
	 * @see #unsetFmiVersion()
	 * @see #getFmiVersion()
	 * @generated
	 */
	void setFmiVersion(String value);

	/**
	 * Unsets the value of the '{@link FmiModel.FmiModelDescriptionType#getFmiVersion <em>Fmi Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetFmiVersion()
	 * @see #getFmiVersion()
	 * @see #setFmiVersion(String)
	 * @generated
	 */
	void unsetFmiVersion();

	/**
	 * Returns whether the value of the '{@link FmiModel.FmiModelDescriptionType#getFmiVersion <em>Fmi Version</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Fmi Version</em>' attribute is set.
	 * @see #unsetFmiVersion()
	 * @see #getFmiVersion()
	 * @see #setFmiVersion(String)
	 * @generated
	 */
	boolean isSetFmiVersion();

	/**
	 * Returns the value of the '<em><b>Generation Date And Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Generation Date And Time</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Generation Date And Time</em>' attribute.
	 * @see #setGenerationDateAndTime(XMLGregorianCalendar)
	 * @see FmiModel.FmiModelPackage#getFmiModelDescriptionType_GenerationDateAndTime()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.DateTime"
	 *        extendedMetaData="kind='attribute' name='generationDateAndTime' namespace='##targetNamespace'"
	 * @generated
	 */
	XMLGregorianCalendar getGenerationDateAndTime();

	/**
	 * Sets the value of the '{@link FmiModel.FmiModelDescriptionType#getGenerationDateAndTime <em>Generation Date And Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Generation Date And Time</em>' attribute.
	 * @see #getGenerationDateAndTime()
	 * @generated
	 */
	void setGenerationDateAndTime(XMLGregorianCalendar value);

	/**
	 * Returns the value of the '<em><b>Generation Tool</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Generation Tool</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Generation Tool</em>' attribute.
	 * @see #setGenerationTool(String)
	 * @see FmiModel.FmiModelPackage#getFmiModelDescriptionType_GenerationTool()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.NormalizedString"
	 *        extendedMetaData="kind='attribute' name='generationTool' namespace='##targetNamespace'"
	 * @generated
	 */
	String getGenerationTool();

	/**
	 * Sets the value of the '{@link FmiModel.FmiModelDescriptionType#getGenerationTool <em>Generation Tool</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Generation Tool</em>' attribute.
	 * @see #getGenerationTool()
	 * @generated
	 */
	void setGenerationTool(String value);

	/**
	 * Returns the value of the '<em><b>Guid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Fingerprint of xml-file content to verify that xml-file and C-functions are compatible to each other
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Guid</em>' attribute.
	 * @see #setGuid(String)
	 * @see FmiModel.FmiModelPackage#getFmiModelDescriptionType_Guid()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.NormalizedString" required="true"
	 *        extendedMetaData="kind='attribute' name='guid' namespace='##targetNamespace'"
	 * @generated
	 */
	String getGuid();

	/**
	 * Sets the value of the '{@link FmiModel.FmiModelDescriptionType#getGuid <em>Guid</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Guid</em>' attribute.
	 * @see #getGuid()
	 * @generated
	 */
	void setGuid(String value);

	/**
	 * Returns the value of the '<em><b>License</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Information on intellectual property licensing for this FMU, such as “BSD license”, "Proprietary", or "Public Domain"
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>License</em>' attribute.
	 * @see #setLicense(String)
	 * @see FmiModel.FmiModelPackage#getFmiModelDescriptionType_License()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='license' namespace='##targetNamespace'"
	 * @generated
	 */
	String getLicense();

	/**
	 * Sets the value of the '{@link FmiModel.FmiModelDescriptionType#getLicense <em>License</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>License</em>' attribute.
	 * @see #getLicense()
	 * @generated
	 */
	void setLicense(String value);

	/**
	 * Returns the value of the '<em><b>Model Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Class name of FMU, e.g. "A.B.C" (several FMU instances are possible)
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Model Name</em>' attribute.
	 * @see #setModelName(String)
	 * @see FmiModel.FmiModelPackage#getFmiModelDescriptionType_ModelName()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 *        extendedMetaData="kind='attribute' name='modelName' namespace='##targetNamespace'"
	 * @generated
	 */
	String getModelName();

	/**
	 * Sets the value of the '{@link FmiModel.FmiModelDescriptionType#getModelName <em>Model Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Model Name</em>' attribute.
	 * @see #getModelName()
	 * @generated
	 */
	void setModelName(String value);

	/**
	 * Returns the value of the '<em><b>Number Of Event Indicators</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Number Of Event Indicators</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Number Of Event Indicators</em>' attribute.
	 * @see #isSetNumberOfEventIndicators()
	 * @see #unsetNumberOfEventIndicators()
	 * @see #setNumberOfEventIndicators(long)
	 * @see FmiModel.FmiModelPackage#getFmiModelDescriptionType_NumberOfEventIndicators()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.UnsignedInt"
	 *        extendedMetaData="kind='attribute' name='numberOfEventIndicators' namespace='##targetNamespace'"
	 * @generated
	 */
	long getNumberOfEventIndicators();

	/**
	 * Sets the value of the '{@link FmiModel.FmiModelDescriptionType#getNumberOfEventIndicators <em>Number Of Event Indicators</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Number Of Event Indicators</em>' attribute.
	 * @see #isSetNumberOfEventIndicators()
	 * @see #unsetNumberOfEventIndicators()
	 * @see #getNumberOfEventIndicators()
	 * @generated
	 */
	void setNumberOfEventIndicators(long value);

	/**
	 * Unsets the value of the '{@link FmiModel.FmiModelDescriptionType#getNumberOfEventIndicators <em>Number Of Event Indicators</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetNumberOfEventIndicators()
	 * @see #getNumberOfEventIndicators()
	 * @see #setNumberOfEventIndicators(long)
	 * @generated
	 */
	void unsetNumberOfEventIndicators();

	/**
	 * Returns whether the value of the '{@link FmiModel.FmiModelDescriptionType#getNumberOfEventIndicators <em>Number Of Event Indicators</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Number Of Event Indicators</em>' attribute is set.
	 * @see #unsetNumberOfEventIndicators()
	 * @see #getNumberOfEventIndicators()
	 * @see #setNumberOfEventIndicators(long)
	 * @generated
	 */
	boolean isSetNumberOfEventIndicators();

	/**
	 * Returns the value of the '<em><b>Variable Naming Convention</b></em>' attribute.
	 * The default value is <code>"flat"</code>.
	 * The literals are from the enumeration {@link FmiModel.VariableNamingConventionType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Variable Naming Convention</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Variable Naming Convention</em>' attribute.
	 * @see FmiModel.VariableNamingConventionType
	 * @see #isSetVariableNamingConvention()
	 * @see #unsetVariableNamingConvention()
	 * @see #setVariableNamingConvention(VariableNamingConventionType)
	 * @see FmiModel.FmiModelPackage#getFmiModelDescriptionType_VariableNamingConvention()
	 * @model default="flat" unsettable="true"
	 *        extendedMetaData="kind='attribute' name='variableNamingConvention' namespace='##targetNamespace'"
	 * @generated
	 */
	VariableNamingConventionType getVariableNamingConvention();

	/**
	 * Sets the value of the '{@link FmiModel.FmiModelDescriptionType#getVariableNamingConvention <em>Variable Naming Convention</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Variable Naming Convention</em>' attribute.
	 * @see FmiModel.VariableNamingConventionType
	 * @see #isSetVariableNamingConvention()
	 * @see #unsetVariableNamingConvention()
	 * @see #getVariableNamingConvention()
	 * @generated
	 */
	void setVariableNamingConvention(VariableNamingConventionType value);

	/**
	 * Unsets the value of the '{@link FmiModel.FmiModelDescriptionType#getVariableNamingConvention <em>Variable Naming Convention</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetVariableNamingConvention()
	 * @see #getVariableNamingConvention()
	 * @see #setVariableNamingConvention(VariableNamingConventionType)
	 * @generated
	 */
	void unsetVariableNamingConvention();

	/**
	 * Returns whether the value of the '{@link FmiModel.FmiModelDescriptionType#getVariableNamingConvention <em>Variable Naming Convention</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Variable Naming Convention</em>' attribute is set.
	 * @see #unsetVariableNamingConvention()
	 * @see #getVariableNamingConvention()
	 * @see #setVariableNamingConvention(VariableNamingConventionType)
	 * @generated
	 */
	boolean isSetVariableNamingConvention();

	/**
	 * Returns the value of the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Version of FMU, e.g., "1.4.1"
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Version</em>' attribute.
	 * @see #setVersion(String)
	 * @see FmiModel.FmiModelPackage#getFmiModelDescriptionType_Version()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.NormalizedString"
	 *        extendedMetaData="kind='attribute' name='version' namespace='##targetNamespace'"
	 * @generated
	 */
	String getVersion();

	/**
	 * Sets the value of the '{@link FmiModel.FmiModelDescriptionType#getVersion <em>Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Version</em>' attribute.
	 * @see #getVersion()
	 * @generated
	 */
	void setVersion(String value);

	/**
	 * Returns the value of the '<em><b>Model Identifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Short class name according to C-syntax, e.g. "A_B_C". Used as prefix for FMI functions if the functions are provided in C source code or in static libraries, but not if the functions are provided by a DLL/SharedObject. modelIdentifier is also used as name of the static library or DLL/SharedObject.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Model Identifier</em>' attribute.
	 * @see #setModelIdentifier(String)
	 * @see FmiModel.FmiModelPackage#getFmiModelDescriptionType_ModelIdentifier()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.NormalizedString"
	 *        extendedMetaData="kind='attribute' name='modelIdentifier' namespace='##targetNamespace'"
	 * @generated
	 */
	String getModelIdentifier();

	/**
	 * Sets the value of the '{@link FmiModel.FmiModelDescriptionType#getModelIdentifier <em>Model Identifier</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Model Identifier</em>' attribute.
	 * @see #getModelIdentifier()
	 * @generated
	 */
	void setModelIdentifier(String value);

	/**
	 * Returns the value of the '<em><b>Number Of Continuous States</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Number Of Continuous States</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Number Of Continuous States</em>' attribute.
	 * @see #isSetNumberOfContinuousStates()
	 * @see #unsetNumberOfContinuousStates()
	 * @see #setNumberOfContinuousStates(long)
	 * @see FmiModel.FmiModelPackage#getFmiModelDescriptionType_NumberOfContinuousStates()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.UnsignedInt"
	 *        extendedMetaData="kind='attribute' name='numberOfContinuousStates' namespace='##targetNamespace'"
	 * @generated
	 */
	long getNumberOfContinuousStates();

	/**
	 * Sets the value of the '{@link FmiModel.FmiModelDescriptionType#getNumberOfContinuousStates <em>Number Of Continuous States</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Number Of Continuous States</em>' attribute.
	 * @see #isSetNumberOfContinuousStates()
	 * @see #unsetNumberOfContinuousStates()
	 * @see #getNumberOfContinuousStates()
	 * @generated
	 */
	void setNumberOfContinuousStates(long value);

	/**
	 * Unsets the value of the '{@link FmiModel.FmiModelDescriptionType#getNumberOfContinuousStates <em>Number Of Continuous States</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetNumberOfContinuousStates()
	 * @see #getNumberOfContinuousStates()
	 * @see #setNumberOfContinuousStates(long)
	 * @generated
	 */
	void unsetNumberOfContinuousStates();

	/**
	 * Returns whether the value of the '{@link FmiModel.FmiModelDescriptionType#getNumberOfContinuousStates <em>Number Of Continuous States</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Number Of Continuous States</em>' attribute is set.
	 * @see #unsetNumberOfContinuousStates()
	 * @see #getNumberOfContinuousStates()
	 * @see #setNumberOfContinuousStates(long)
	 * @generated
	 */
	boolean isSetNumberOfContinuousStates();

} // FmiModelDescriptionType
