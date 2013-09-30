/**
 */
package FmiModel;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Model Exchange Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * List of capability flags that an FMI Model Exchange interface can provide
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link FmiModel.ModelExchangeType#isCanBeInstantiatedOnlyOncePerProcess <em>Can Be Instantiated Only Once Per Process</em>}</li>
 *   <li>{@link FmiModel.ModelExchangeType#isCanGetAndSetFMUstate <em>Can Get And Set FM Ustate</em>}</li>
 *   <li>{@link FmiModel.ModelExchangeType#isCanNotUseMemoryManagementFunctions <em>Can Not Use Memory Management Functions</em>}</li>
 *   <li>{@link FmiModel.ModelExchangeType#isCanSerializeFMUstate <em>Can Serialize FM Ustate</em>}</li>
 *   <li>{@link FmiModel.ModelExchangeType#isCompletedIntegratorStepNotNeeded <em>Completed Integrator Step Not Needed</em>}</li>
 *   <li>{@link FmiModel.ModelExchangeType#getModelIdentifier <em>Model Identifier</em>}</li>
 *   <li>{@link FmiModel.ModelExchangeType#isNeedsExecutionTool <em>Needs Execution Tool</em>}</li>
 *   <li>{@link FmiModel.ModelExchangeType#isProvidesDirectionalDerivatives <em>Provides Directional Derivatives</em>}</li>
 *   <li>{@link FmiModel.ModelExchangeType#isProvidesPartialDerivativesOfDerivativeFunctionWrtInputs <em>Provides Partial Derivatives Of Derivative Function Wrt Inputs</em>}</li>
 *   <li>{@link FmiModel.ModelExchangeType#isProvidesPartialDerivativesOfDerivativeFunctionWrtStates <em>Provides Partial Derivatives Of Derivative Function Wrt States</em>}</li>
 *   <li>{@link FmiModel.ModelExchangeType#isProvidesPartialDerivativesOfOutputFunctionWrtInputs <em>Provides Partial Derivatives Of Output Function Wrt Inputs</em>}</li>
 *   <li>{@link FmiModel.ModelExchangeType#isProvidesPartialDerivativesOfOutputFunctionWrtStates <em>Provides Partial Derivatives Of Output Function Wrt States</em>}</li>
 * </ul>
 * </p>
 *
 * @see FmiModel.FmiModelPackage#getModelExchangeType()
 * @model extendedMetaData="name='ModelExchange_._type' kind='empty'"
 * @generated
 */
public interface ModelExchangeType extends EObject {
	/**
	 * Returns the value of the '<em><b>Can Be Instantiated Only Once Per Process</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Can Be Instantiated Only Once Per Process</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Can Be Instantiated Only Once Per Process</em>' attribute.
	 * @see #isSetCanBeInstantiatedOnlyOncePerProcess()
	 * @see #unsetCanBeInstantiatedOnlyOncePerProcess()
	 * @see #setCanBeInstantiatedOnlyOncePerProcess(boolean)
	 * @see FmiModel.FmiModelPackage#getModelExchangeType_CanBeInstantiatedOnlyOncePerProcess()
	 * @model default="false" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
	 *        extendedMetaData="kind='attribute' name='canBeInstantiatedOnlyOncePerProcess' namespace='##targetNamespace'"
	 * @generated
	 */
	boolean isCanBeInstantiatedOnlyOncePerProcess();

	/**
	 * Sets the value of the '{@link FmiModel.ModelExchangeType#isCanBeInstantiatedOnlyOncePerProcess <em>Can Be Instantiated Only Once Per Process</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Can Be Instantiated Only Once Per Process</em>' attribute.
	 * @see #isSetCanBeInstantiatedOnlyOncePerProcess()
	 * @see #unsetCanBeInstantiatedOnlyOncePerProcess()
	 * @see #isCanBeInstantiatedOnlyOncePerProcess()
	 * @generated
	 */
	void setCanBeInstantiatedOnlyOncePerProcess(boolean value);

	/**
	 * Unsets the value of the '{@link FmiModel.ModelExchangeType#isCanBeInstantiatedOnlyOncePerProcess <em>Can Be Instantiated Only Once Per Process</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetCanBeInstantiatedOnlyOncePerProcess()
	 * @see #isCanBeInstantiatedOnlyOncePerProcess()
	 * @see #setCanBeInstantiatedOnlyOncePerProcess(boolean)
	 * @generated
	 */
	void unsetCanBeInstantiatedOnlyOncePerProcess();

	/**
	 * Returns whether the value of the '{@link FmiModel.ModelExchangeType#isCanBeInstantiatedOnlyOncePerProcess <em>Can Be Instantiated Only Once Per Process</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Can Be Instantiated Only Once Per Process</em>' attribute is set.
	 * @see #unsetCanBeInstantiatedOnlyOncePerProcess()
	 * @see #isCanBeInstantiatedOnlyOncePerProcess()
	 * @see #setCanBeInstantiatedOnlyOncePerProcess(boolean)
	 * @generated
	 */
	boolean isSetCanBeInstantiatedOnlyOncePerProcess();

	/**
	 * Returns the value of the '<em><b>Can Get And Set FM Ustate</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Can Get And Set FM Ustate</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Can Get And Set FM Ustate</em>' attribute.
	 * @see #isSetCanGetAndSetFMUstate()
	 * @see #unsetCanGetAndSetFMUstate()
	 * @see #setCanGetAndSetFMUstate(boolean)
	 * @see FmiModel.FmiModelPackage#getModelExchangeType_CanGetAndSetFMUstate()
	 * @model default="false" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
	 *        extendedMetaData="kind='attribute' name='canGetAndSetFMUstate' namespace='##targetNamespace'"
	 * @generated
	 */
	boolean isCanGetAndSetFMUstate();

	/**
	 * Sets the value of the '{@link FmiModel.ModelExchangeType#isCanGetAndSetFMUstate <em>Can Get And Set FM Ustate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Can Get And Set FM Ustate</em>' attribute.
	 * @see #isSetCanGetAndSetFMUstate()
	 * @see #unsetCanGetAndSetFMUstate()
	 * @see #isCanGetAndSetFMUstate()
	 * @generated
	 */
	void setCanGetAndSetFMUstate(boolean value);

	/**
	 * Unsets the value of the '{@link FmiModel.ModelExchangeType#isCanGetAndSetFMUstate <em>Can Get And Set FM Ustate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetCanGetAndSetFMUstate()
	 * @see #isCanGetAndSetFMUstate()
	 * @see #setCanGetAndSetFMUstate(boolean)
	 * @generated
	 */
	void unsetCanGetAndSetFMUstate();

	/**
	 * Returns whether the value of the '{@link FmiModel.ModelExchangeType#isCanGetAndSetFMUstate <em>Can Get And Set FM Ustate</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Can Get And Set FM Ustate</em>' attribute is set.
	 * @see #unsetCanGetAndSetFMUstate()
	 * @see #isCanGetAndSetFMUstate()
	 * @see #setCanGetAndSetFMUstate(boolean)
	 * @generated
	 */
	boolean isSetCanGetAndSetFMUstate();

	/**
	 * Returns the value of the '<em><b>Can Not Use Memory Management Functions</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Can Not Use Memory Management Functions</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Can Not Use Memory Management Functions</em>' attribute.
	 * @see #isSetCanNotUseMemoryManagementFunctions()
	 * @see #unsetCanNotUseMemoryManagementFunctions()
	 * @see #setCanNotUseMemoryManagementFunctions(boolean)
	 * @see FmiModel.FmiModelPackage#getModelExchangeType_CanNotUseMemoryManagementFunctions()
	 * @model default="false" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
	 *        extendedMetaData="kind='attribute' name='canNotUseMemoryManagementFunctions' namespace='##targetNamespace'"
	 * @generated
	 */
	boolean isCanNotUseMemoryManagementFunctions();

	/**
	 * Sets the value of the '{@link FmiModel.ModelExchangeType#isCanNotUseMemoryManagementFunctions <em>Can Not Use Memory Management Functions</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Can Not Use Memory Management Functions</em>' attribute.
	 * @see #isSetCanNotUseMemoryManagementFunctions()
	 * @see #unsetCanNotUseMemoryManagementFunctions()
	 * @see #isCanNotUseMemoryManagementFunctions()
	 * @generated
	 */
	void setCanNotUseMemoryManagementFunctions(boolean value);

	/**
	 * Unsets the value of the '{@link FmiModel.ModelExchangeType#isCanNotUseMemoryManagementFunctions <em>Can Not Use Memory Management Functions</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetCanNotUseMemoryManagementFunctions()
	 * @see #isCanNotUseMemoryManagementFunctions()
	 * @see #setCanNotUseMemoryManagementFunctions(boolean)
	 * @generated
	 */
	void unsetCanNotUseMemoryManagementFunctions();

	/**
	 * Returns whether the value of the '{@link FmiModel.ModelExchangeType#isCanNotUseMemoryManagementFunctions <em>Can Not Use Memory Management Functions</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Can Not Use Memory Management Functions</em>' attribute is set.
	 * @see #unsetCanNotUseMemoryManagementFunctions()
	 * @see #isCanNotUseMemoryManagementFunctions()
	 * @see #setCanNotUseMemoryManagementFunctions(boolean)
	 * @generated
	 */
	boolean isSetCanNotUseMemoryManagementFunctions();

	/**
	 * Returns the value of the '<em><b>Can Serialize FM Ustate</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Can Serialize FM Ustate</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Can Serialize FM Ustate</em>' attribute.
	 * @see #isSetCanSerializeFMUstate()
	 * @see #unsetCanSerializeFMUstate()
	 * @see #setCanSerializeFMUstate(boolean)
	 * @see FmiModel.FmiModelPackage#getModelExchangeType_CanSerializeFMUstate()
	 * @model default="false" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
	 *        extendedMetaData="kind='attribute' name='canSerializeFMUstate' namespace='##targetNamespace'"
	 * @generated
	 */
	boolean isCanSerializeFMUstate();

	/**
	 * Sets the value of the '{@link FmiModel.ModelExchangeType#isCanSerializeFMUstate <em>Can Serialize FM Ustate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Can Serialize FM Ustate</em>' attribute.
	 * @see #isSetCanSerializeFMUstate()
	 * @see #unsetCanSerializeFMUstate()
	 * @see #isCanSerializeFMUstate()
	 * @generated
	 */
	void setCanSerializeFMUstate(boolean value);

	/**
	 * Unsets the value of the '{@link FmiModel.ModelExchangeType#isCanSerializeFMUstate <em>Can Serialize FM Ustate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetCanSerializeFMUstate()
	 * @see #isCanSerializeFMUstate()
	 * @see #setCanSerializeFMUstate(boolean)
	 * @generated
	 */
	void unsetCanSerializeFMUstate();

	/**
	 * Returns whether the value of the '{@link FmiModel.ModelExchangeType#isCanSerializeFMUstate <em>Can Serialize FM Ustate</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Can Serialize FM Ustate</em>' attribute is set.
	 * @see #unsetCanSerializeFMUstate()
	 * @see #isCanSerializeFMUstate()
	 * @see #setCanSerializeFMUstate(boolean)
	 * @generated
	 */
	boolean isSetCanSerializeFMUstate();

	/**
	 * Returns the value of the '<em><b>Completed Integrator Step Not Needed</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Completed Integrator Step Not Needed</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Completed Integrator Step Not Needed</em>' attribute.
	 * @see #isSetCompletedIntegratorStepNotNeeded()
	 * @see #unsetCompletedIntegratorStepNotNeeded()
	 * @see #setCompletedIntegratorStepNotNeeded(boolean)
	 * @see FmiModel.FmiModelPackage#getModelExchangeType_CompletedIntegratorStepNotNeeded()
	 * @model default="false" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
	 *        extendedMetaData="kind='attribute' name='completedIntegratorStepNotNeeded' namespace='##targetNamespace'"
	 * @generated
	 */
	boolean isCompletedIntegratorStepNotNeeded();

	/**
	 * Sets the value of the '{@link FmiModel.ModelExchangeType#isCompletedIntegratorStepNotNeeded <em>Completed Integrator Step Not Needed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Completed Integrator Step Not Needed</em>' attribute.
	 * @see #isSetCompletedIntegratorStepNotNeeded()
	 * @see #unsetCompletedIntegratorStepNotNeeded()
	 * @see #isCompletedIntegratorStepNotNeeded()
	 * @generated
	 */
	void setCompletedIntegratorStepNotNeeded(boolean value);

	/**
	 * Unsets the value of the '{@link FmiModel.ModelExchangeType#isCompletedIntegratorStepNotNeeded <em>Completed Integrator Step Not Needed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetCompletedIntegratorStepNotNeeded()
	 * @see #isCompletedIntegratorStepNotNeeded()
	 * @see #setCompletedIntegratorStepNotNeeded(boolean)
	 * @generated
	 */
	void unsetCompletedIntegratorStepNotNeeded();

	/**
	 * Returns whether the value of the '{@link FmiModel.ModelExchangeType#isCompletedIntegratorStepNotNeeded <em>Completed Integrator Step Not Needed</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Completed Integrator Step Not Needed</em>' attribute is set.
	 * @see #unsetCompletedIntegratorStepNotNeeded()
	 * @see #isCompletedIntegratorStepNotNeeded()
	 * @see #setCompletedIntegratorStepNotNeeded(boolean)
	 * @generated
	 */
	boolean isSetCompletedIntegratorStepNotNeeded();

	/**
	 * Returns the value of the '<em><b>Model Identifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Short class name according to C-syntax, e.g. "A_B_C". Used as prefix for FMI functions if the functions are provided in C source code or in static libraries, but not if the functions are provided by a DLL/SharedObject. modelIdentifier is also used as name of the static library or DLL/SharedObject.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Model Identifier</em>' attribute.
	 * @see #setModelIdentifier(String)
	 * @see FmiModel.FmiModelPackage#getModelExchangeType_ModelIdentifier()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.NormalizedString" required="true"
	 *        extendedMetaData="kind='attribute' name='modelIdentifier' namespace='##targetNamespace'"
	 * @generated
	 */
	String getModelIdentifier();

	/**
	 * Sets the value of the '{@link FmiModel.ModelExchangeType#getModelIdentifier <em>Model Identifier</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Model Identifier</em>' attribute.
	 * @see #getModelIdentifier()
	 * @generated
	 */
	void setModelIdentifier(String value);

	/**
	 * Returns the value of the '<em><b>Needs Execution Tool</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * If true, a tool is needed to execute the model and the FMU just contains the communication to this tool.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Needs Execution Tool</em>' attribute.
	 * @see #isSetNeedsExecutionTool()
	 * @see #unsetNeedsExecutionTool()
	 * @see #setNeedsExecutionTool(boolean)
	 * @see FmiModel.FmiModelPackage#getModelExchangeType_NeedsExecutionTool()
	 * @model default="false" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
	 *        extendedMetaData="kind='attribute' name='needsExecutionTool' namespace='##targetNamespace'"
	 * @generated
	 */
	boolean isNeedsExecutionTool();

	/**
	 * Sets the value of the '{@link FmiModel.ModelExchangeType#isNeedsExecutionTool <em>Needs Execution Tool</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Needs Execution Tool</em>' attribute.
	 * @see #isSetNeedsExecutionTool()
	 * @see #unsetNeedsExecutionTool()
	 * @see #isNeedsExecutionTool()
	 * @generated
	 */
	void setNeedsExecutionTool(boolean value);

	/**
	 * Unsets the value of the '{@link FmiModel.ModelExchangeType#isNeedsExecutionTool <em>Needs Execution Tool</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetNeedsExecutionTool()
	 * @see #isNeedsExecutionTool()
	 * @see #setNeedsExecutionTool(boolean)
	 * @generated
	 */
	void unsetNeedsExecutionTool();

	/**
	 * Returns whether the value of the '{@link FmiModel.ModelExchangeType#isNeedsExecutionTool <em>Needs Execution Tool</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Needs Execution Tool</em>' attribute is set.
	 * @see #unsetNeedsExecutionTool()
	 * @see #isNeedsExecutionTool()
	 * @see #setNeedsExecutionTool(boolean)
	 * @generated
	 */
	boolean isSetNeedsExecutionTool();

	/**
	 * Returns the value of the '<em><b>Provides Directional Derivatives</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Provides Directional Derivatives</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Provides Directional Derivatives</em>' attribute.
	 * @see #isSetProvidesDirectionalDerivatives()
	 * @see #unsetProvidesDirectionalDerivatives()
	 * @see #setProvidesDirectionalDerivatives(boolean)
	 * @see FmiModel.FmiModelPackage#getModelExchangeType_ProvidesDirectionalDerivatives()
	 * @model default="false" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
	 *        extendedMetaData="kind='attribute' name='providesDirectionalDerivatives' namespace='##targetNamespace'"
	 * @generated
	 */
	boolean isProvidesDirectionalDerivatives();

	/**
	 * Sets the value of the '{@link FmiModel.ModelExchangeType#isProvidesDirectionalDerivatives <em>Provides Directional Derivatives</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Provides Directional Derivatives</em>' attribute.
	 * @see #isSetProvidesDirectionalDerivatives()
	 * @see #unsetProvidesDirectionalDerivatives()
	 * @see #isProvidesDirectionalDerivatives()
	 * @generated
	 */
	void setProvidesDirectionalDerivatives(boolean value);

	/**
	 * Unsets the value of the '{@link FmiModel.ModelExchangeType#isProvidesDirectionalDerivatives <em>Provides Directional Derivatives</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetProvidesDirectionalDerivatives()
	 * @see #isProvidesDirectionalDerivatives()
	 * @see #setProvidesDirectionalDerivatives(boolean)
	 * @generated
	 */
	void unsetProvidesDirectionalDerivatives();

	/**
	 * Returns whether the value of the '{@link FmiModel.ModelExchangeType#isProvidesDirectionalDerivatives <em>Provides Directional Derivatives</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Provides Directional Derivatives</em>' attribute is set.
	 * @see #unsetProvidesDirectionalDerivatives()
	 * @see #isProvidesDirectionalDerivatives()
	 * @see #setProvidesDirectionalDerivatives(boolean)
	 * @generated
	 */
	boolean isSetProvidesDirectionalDerivatives();

	/**
	 * Returns the value of the '<em><b>Provides Partial Derivatives Of Derivative Function Wrt Inputs</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * (partial derivative of the derivatives with respect to the inputs)
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Provides Partial Derivatives Of Derivative Function Wrt Inputs</em>' attribute.
	 * @see #isSetProvidesPartialDerivativesOfDerivativeFunctionWrtInputs()
	 * @see #unsetProvidesPartialDerivativesOfDerivativeFunctionWrtInputs()
	 * @see #setProvidesPartialDerivativesOfDerivativeFunctionWrtInputs(boolean)
	 * @see FmiModel.FmiModelPackage#getModelExchangeType_ProvidesPartialDerivativesOfDerivativeFunctionWrtInputs()
	 * @model default="false" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
	 *        extendedMetaData="kind='attribute' name='providesPartialDerivativesOf_DerivativeFunction_wrt_Inputs' namespace='##targetNamespace'"
	 * @generated
	 */
	boolean isProvidesPartialDerivativesOfDerivativeFunctionWrtInputs();

	/**
	 * Sets the value of the '{@link FmiModel.ModelExchangeType#isProvidesPartialDerivativesOfDerivativeFunctionWrtInputs <em>Provides Partial Derivatives Of Derivative Function Wrt Inputs</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Provides Partial Derivatives Of Derivative Function Wrt Inputs</em>' attribute.
	 * @see #isSetProvidesPartialDerivativesOfDerivativeFunctionWrtInputs()
	 * @see #unsetProvidesPartialDerivativesOfDerivativeFunctionWrtInputs()
	 * @see #isProvidesPartialDerivativesOfDerivativeFunctionWrtInputs()
	 * @generated
	 */
	void setProvidesPartialDerivativesOfDerivativeFunctionWrtInputs(boolean value);

	/**
	 * Unsets the value of the '{@link FmiModel.ModelExchangeType#isProvidesPartialDerivativesOfDerivativeFunctionWrtInputs <em>Provides Partial Derivatives Of Derivative Function Wrt Inputs</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetProvidesPartialDerivativesOfDerivativeFunctionWrtInputs()
	 * @see #isProvidesPartialDerivativesOfDerivativeFunctionWrtInputs()
	 * @see #setProvidesPartialDerivativesOfDerivativeFunctionWrtInputs(boolean)
	 * @generated
	 */
	void unsetProvidesPartialDerivativesOfDerivativeFunctionWrtInputs();

	/**
	 * Returns whether the value of the '{@link FmiModel.ModelExchangeType#isProvidesPartialDerivativesOfDerivativeFunctionWrtInputs <em>Provides Partial Derivatives Of Derivative Function Wrt Inputs</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Provides Partial Derivatives Of Derivative Function Wrt Inputs</em>' attribute is set.
	 * @see #unsetProvidesPartialDerivativesOfDerivativeFunctionWrtInputs()
	 * @see #isProvidesPartialDerivativesOfDerivativeFunctionWrtInputs()
	 * @see #setProvidesPartialDerivativesOfDerivativeFunctionWrtInputs(boolean)
	 * @generated
	 */
	boolean isSetProvidesPartialDerivativesOfDerivativeFunctionWrtInputs();

	/**
	 * Returns the value of the '<em><b>Provides Partial Derivatives Of Derivative Function Wrt States</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * (partial derivative of the derivatives with respect to the states)
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Provides Partial Derivatives Of Derivative Function Wrt States</em>' attribute.
	 * @see #isSetProvidesPartialDerivativesOfDerivativeFunctionWrtStates()
	 * @see #unsetProvidesPartialDerivativesOfDerivativeFunctionWrtStates()
	 * @see #setProvidesPartialDerivativesOfDerivativeFunctionWrtStates(boolean)
	 * @see FmiModel.FmiModelPackage#getModelExchangeType_ProvidesPartialDerivativesOfDerivativeFunctionWrtStates()
	 * @model default="false" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
	 *        extendedMetaData="kind='attribute' name='providesPartialDerivativesOf_DerivativeFunction_wrt_States' namespace='##targetNamespace'"
	 * @generated
	 */
	boolean isProvidesPartialDerivativesOfDerivativeFunctionWrtStates();

	/**
	 * Sets the value of the '{@link FmiModel.ModelExchangeType#isProvidesPartialDerivativesOfDerivativeFunctionWrtStates <em>Provides Partial Derivatives Of Derivative Function Wrt States</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Provides Partial Derivatives Of Derivative Function Wrt States</em>' attribute.
	 * @see #isSetProvidesPartialDerivativesOfDerivativeFunctionWrtStates()
	 * @see #unsetProvidesPartialDerivativesOfDerivativeFunctionWrtStates()
	 * @see #isProvidesPartialDerivativesOfDerivativeFunctionWrtStates()
	 * @generated
	 */
	void setProvidesPartialDerivativesOfDerivativeFunctionWrtStates(boolean value);

	/**
	 * Unsets the value of the '{@link FmiModel.ModelExchangeType#isProvidesPartialDerivativesOfDerivativeFunctionWrtStates <em>Provides Partial Derivatives Of Derivative Function Wrt States</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetProvidesPartialDerivativesOfDerivativeFunctionWrtStates()
	 * @see #isProvidesPartialDerivativesOfDerivativeFunctionWrtStates()
	 * @see #setProvidesPartialDerivativesOfDerivativeFunctionWrtStates(boolean)
	 * @generated
	 */
	void unsetProvidesPartialDerivativesOfDerivativeFunctionWrtStates();

	/**
	 * Returns whether the value of the '{@link FmiModel.ModelExchangeType#isProvidesPartialDerivativesOfDerivativeFunctionWrtStates <em>Provides Partial Derivatives Of Derivative Function Wrt States</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Provides Partial Derivatives Of Derivative Function Wrt States</em>' attribute is set.
	 * @see #unsetProvidesPartialDerivativesOfDerivativeFunctionWrtStates()
	 * @see #isProvidesPartialDerivativesOfDerivativeFunctionWrtStates()
	 * @see #setProvidesPartialDerivativesOfDerivativeFunctionWrtStates(boolean)
	 * @generated
	 */
	boolean isSetProvidesPartialDerivativesOfDerivativeFunctionWrtStates();

	/**
	 * Returns the value of the '<em><b>Provides Partial Derivatives Of Output Function Wrt Inputs</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * (partial derivative of the outputs with respect to the inputs)
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Provides Partial Derivatives Of Output Function Wrt Inputs</em>' attribute.
	 * @see #isSetProvidesPartialDerivativesOfOutputFunctionWrtInputs()
	 * @see #unsetProvidesPartialDerivativesOfOutputFunctionWrtInputs()
	 * @see #setProvidesPartialDerivativesOfOutputFunctionWrtInputs(boolean)
	 * @see FmiModel.FmiModelPackage#getModelExchangeType_ProvidesPartialDerivativesOfOutputFunctionWrtInputs()
	 * @model default="false" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
	 *        extendedMetaData="kind='attribute' name='providesPartialDerivativesOf_OutputFunction_wrt_Inputs' namespace='##targetNamespace'"
	 * @generated
	 */
	boolean isProvidesPartialDerivativesOfOutputFunctionWrtInputs();

	/**
	 * Sets the value of the '{@link FmiModel.ModelExchangeType#isProvidesPartialDerivativesOfOutputFunctionWrtInputs <em>Provides Partial Derivatives Of Output Function Wrt Inputs</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Provides Partial Derivatives Of Output Function Wrt Inputs</em>' attribute.
	 * @see #isSetProvidesPartialDerivativesOfOutputFunctionWrtInputs()
	 * @see #unsetProvidesPartialDerivativesOfOutputFunctionWrtInputs()
	 * @see #isProvidesPartialDerivativesOfOutputFunctionWrtInputs()
	 * @generated
	 */
	void setProvidesPartialDerivativesOfOutputFunctionWrtInputs(boolean value);

	/**
	 * Unsets the value of the '{@link FmiModel.ModelExchangeType#isProvidesPartialDerivativesOfOutputFunctionWrtInputs <em>Provides Partial Derivatives Of Output Function Wrt Inputs</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetProvidesPartialDerivativesOfOutputFunctionWrtInputs()
	 * @see #isProvidesPartialDerivativesOfOutputFunctionWrtInputs()
	 * @see #setProvidesPartialDerivativesOfOutputFunctionWrtInputs(boolean)
	 * @generated
	 */
	void unsetProvidesPartialDerivativesOfOutputFunctionWrtInputs();

	/**
	 * Returns whether the value of the '{@link FmiModel.ModelExchangeType#isProvidesPartialDerivativesOfOutputFunctionWrtInputs <em>Provides Partial Derivatives Of Output Function Wrt Inputs</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Provides Partial Derivatives Of Output Function Wrt Inputs</em>' attribute is set.
	 * @see #unsetProvidesPartialDerivativesOfOutputFunctionWrtInputs()
	 * @see #isProvidesPartialDerivativesOfOutputFunctionWrtInputs()
	 * @see #setProvidesPartialDerivativesOfOutputFunctionWrtInputs(boolean)
	 * @generated
	 */
	boolean isSetProvidesPartialDerivativesOfOutputFunctionWrtInputs();

	/**
	 * Returns the value of the '<em><b>Provides Partial Derivatives Of Output Function Wrt States</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * (partial derivative of the outputs with respect to the states)
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Provides Partial Derivatives Of Output Function Wrt States</em>' attribute.
	 * @see #isSetProvidesPartialDerivativesOfOutputFunctionWrtStates()
	 * @see #unsetProvidesPartialDerivativesOfOutputFunctionWrtStates()
	 * @see #setProvidesPartialDerivativesOfOutputFunctionWrtStates(boolean)
	 * @see FmiModel.FmiModelPackage#getModelExchangeType_ProvidesPartialDerivativesOfOutputFunctionWrtStates()
	 * @model default="false" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
	 *        extendedMetaData="kind='attribute' name='providesPartialDerivativesOf_OutputFunction_wrt_States' namespace='##targetNamespace'"
	 * @generated
	 */
	boolean isProvidesPartialDerivativesOfOutputFunctionWrtStates();

	/**
	 * Sets the value of the '{@link FmiModel.ModelExchangeType#isProvidesPartialDerivativesOfOutputFunctionWrtStates <em>Provides Partial Derivatives Of Output Function Wrt States</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Provides Partial Derivatives Of Output Function Wrt States</em>' attribute.
	 * @see #isSetProvidesPartialDerivativesOfOutputFunctionWrtStates()
	 * @see #unsetProvidesPartialDerivativesOfOutputFunctionWrtStates()
	 * @see #isProvidesPartialDerivativesOfOutputFunctionWrtStates()
	 * @generated
	 */
	void setProvidesPartialDerivativesOfOutputFunctionWrtStates(boolean value);

	/**
	 * Unsets the value of the '{@link FmiModel.ModelExchangeType#isProvidesPartialDerivativesOfOutputFunctionWrtStates <em>Provides Partial Derivatives Of Output Function Wrt States</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetProvidesPartialDerivativesOfOutputFunctionWrtStates()
	 * @see #isProvidesPartialDerivativesOfOutputFunctionWrtStates()
	 * @see #setProvidesPartialDerivativesOfOutputFunctionWrtStates(boolean)
	 * @generated
	 */
	void unsetProvidesPartialDerivativesOfOutputFunctionWrtStates();

	/**
	 * Returns whether the value of the '{@link FmiModel.ModelExchangeType#isProvidesPartialDerivativesOfOutputFunctionWrtStates <em>Provides Partial Derivatives Of Output Function Wrt States</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Provides Partial Derivatives Of Output Function Wrt States</em>' attribute is set.
	 * @see #unsetProvidesPartialDerivativesOfOutputFunctionWrtStates()
	 * @see #isProvidesPartialDerivativesOfOutputFunctionWrtStates()
	 * @see #setProvidesPartialDerivativesOfOutputFunctionWrtStates(boolean)
	 * @generated
	 */
	boolean isSetProvidesPartialDerivativesOfOutputFunctionWrtStates();

} // ModelExchangeType
