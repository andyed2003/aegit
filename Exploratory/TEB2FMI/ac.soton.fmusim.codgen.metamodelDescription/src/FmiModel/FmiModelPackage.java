/**
 */
package FmiModel;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * <!-- begin-model-doc -->
 * 
 * Copyright(c) 2008-2011, MODELISAR consortium. All rights reserved.
 * This file is licensed by the copyright holders under the BSD License
 * (http://www.opensource.org/licenses/bsd-license.html):
 * ----------------------------------------------------------------------------
 * Redistribution and use in source and binary forms, with or without
 * modification, are permitted provided that the following conditions are met:
 * 
 * - Redistributions of source code must retain the above copyright notice,
 *   this list of conditions and the following disclaimer.
 * - Redistributions in binary form must reproduce the above copyright notice,
 *   this list of conditions and the following disclaimer in the documentation
 *   and/or other materials provided with the distribution.
 * - Neither the name of the copyright holders nor the names of its
 *   contributors may be used to endorse or promote products derived
 *   from this software without specific prior written permission.
 * 
 * THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS
 * "AS IS" AND ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED
 * TO, THE IMPLIED WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR
 * PURPOSE ARE DISCLAIMED. IN NO EVENT SHALL THE COPYRIGHT HOLDER OR
 * CONTRIBUTORS BE LIABLE FOR ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL,
 * EXEMPLARY, OR CONSEQUENTIAL DAMAGES (INCLUDING, BUT NOT LIMITED TO,
 * PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES; LOSS OF USE, DATA, OR PROFITS;
 * OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND ON ANY THEORY OF LIABILITY,
 * WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT (INCLUDING NEGLIGENCE OR
 * OTHERWISE) ARISING IN ANY WAY OUT OF THE USE OF THIS SOFTWARE, EVEN IF
 * ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.
 * ----------------------------------------------------------------------------
 * 
 * with the extension:
 * 
 * You may distribute or publicly perform any modification only under the
 * terms of this license.
 * (Note, this means that if you distribute a modified file,
 * the modified file must also be provided under this license).
 *     
 * <!-- end-model-doc -->
 * @see FmiModel.FmiModelFactory
 * @model kind="package"
 *        extendedMetaData="qualified='false'"
 * @generated
 */
public interface FmiModelPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "FmiModel";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://ac.soton.fmusim.codegen.fmimetamodeldescription";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "FmiAnnotation";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	FmiModelPackage eINSTANCE = FmiModel.impl.FmiModelPackageImpl.init();

	/**
	 * The meta object id for the '{@link FmiModel.impl.BaseUnitTypeImpl <em>Base Unit Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see FmiModel.impl.BaseUnitTypeImpl
	 * @see FmiModel.impl.FmiModelPackageImpl#getBaseUnitType()
	 * @generated
	 */
	int BASE_UNIT_TYPE = 0;

	/**
	 * The feature id for the '<em><b>A</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASE_UNIT_TYPE__A = 0;

	/**
	 * The feature id for the '<em><b>Cd</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASE_UNIT_TYPE__CD = 1;

	/**
	 * The feature id for the '<em><b>Factor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASE_UNIT_TYPE__FACTOR = 2;

	/**
	 * The feature id for the '<em><b>K</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASE_UNIT_TYPE__K = 3;

	/**
	 * The feature id for the '<em><b>Kg</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASE_UNIT_TYPE__KG = 4;

	/**
	 * The feature id for the '<em><b>M</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASE_UNIT_TYPE__M = 5;

	/**
	 * The feature id for the '<em><b>Mol</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASE_UNIT_TYPE__MOL = 6;

	/**
	 * The feature id for the '<em><b>Offset</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASE_UNIT_TYPE__OFFSET = 7;

	/**
	 * The feature id for the '<em><b>Rad</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASE_UNIT_TYPE__RAD = 8;

	/**
	 * The feature id for the '<em><b>S</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASE_UNIT_TYPE__S = 9;

	/**
	 * The number of structural features of the '<em>Base Unit Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASE_UNIT_TYPE_FEATURE_COUNT = 10;

	/**
	 * The meta object id for the '{@link FmiModel.impl.BooleanTypeImpl <em>Boolean Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see FmiModel.impl.BooleanTypeImpl
	 * @see FmiModel.impl.FmiModelPackageImpl#getBooleanType()
	 * @generated
	 */
	int BOOLEAN_TYPE = 1;

	/**
	 * The feature id for the '<em><b>Declared Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_TYPE__DECLARED_TYPE = 0;

	/**
	 * The feature id for the '<em><b>Start</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_TYPE__START = 1;

	/**
	 * The number of structural features of the '<em>Boolean Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_TYPE_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link FmiModel.impl.CategoryTypeImpl <em>Category Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see FmiModel.impl.CategoryTypeImpl
	 * @see FmiModel.impl.FmiModelPackageImpl#getCategoryType()
	 * @generated
	 */
	int CATEGORY_TYPE = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATEGORY_TYPE__NAME = 0;

	/**
	 * The number of structural features of the '<em>Category Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATEGORY_TYPE_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link FmiModel.impl.CoSimulationTypeImpl <em>Co Simulation Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see FmiModel.impl.CoSimulationTypeImpl
	 * @see FmiModel.impl.FmiModelPackageImpl#getCoSimulationType()
	 * @generated
	 */
	int CO_SIMULATION_TYPE = 3;

	/**
	 * The feature id for the '<em><b>Can Handle Variable Communication Step Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CO_SIMULATION_TYPE__CAN_HANDLE_VARIABLE_COMMUNICATION_STEP_SIZE = 0;

	/**
	 * The feature id for the '<em><b>Can Handle Events</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CO_SIMULATION_TYPE__CAN_HANDLE_EVENTS = 1;

	/**
	 * The feature id for the '<em><b>Can Reject Steps</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CO_SIMULATION_TYPE__CAN_REJECT_STEPS = 2;

	/**
	 * The feature id for the '<em><b>Can Interpolate Inputs</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CO_SIMULATION_TYPE__CAN_INTERPOLATE_INPUTS = 3;

	/**
	 * The feature id for the '<em><b>Max Output Derivative Order</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CO_SIMULATION_TYPE__MAX_OUTPUT_DERIVATIVE_ORDER = 4;

	/**
	 * The feature id for the '<em><b>Can Run Asynchronuously</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CO_SIMULATION_TYPE__CAN_RUN_ASYNCHRONUOUSLY = 5;

	/**
	 * The feature id for the '<em><b>Can Signal Events</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CO_SIMULATION_TYPE__CAN_SIGNAL_EVENTS = 6;

	/**
	 * The feature id for the '<em><b>Can Be Instantiated Only Once Per Process</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CO_SIMULATION_TYPE__CAN_BE_INSTANTIATED_ONLY_ONCE_PER_PROCESS = 7;

	/**
	 * The feature id for the '<em><b>Can Not Use Memory Management Functions</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CO_SIMULATION_TYPE__CAN_NOT_USE_MEMORY_MANAGEMENT_FUNCTIONS = 8;

	/**
	 * The feature id for the '<em><b>Can Get And Set FM Ustate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CO_SIMULATION_TYPE__CAN_GET_AND_SET_FM_USTATE = 9;

	/**
	 * The feature id for the '<em><b>Can Serialize FM Ustate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CO_SIMULATION_TYPE__CAN_SERIALIZE_FM_USTATE = 10;

	/**
	 * The feature id for the '<em><b>Model Identifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CO_SIMULATION_TYPE__MODEL_IDENTIFIER = 11;

	/**
	 * The feature id for the '<em><b>Needs Execution Tool</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CO_SIMULATION_TYPE__NEEDS_EXECUTION_TOOL = 12;

	/**
	 * The feature id for the '<em><b>Provides Partial Derivatives Of Derivative Function Wrt Inputs</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CO_SIMULATION_TYPE__PROVIDES_PARTIAL_DERIVATIVES_OF_DERIVATIVE_FUNCTION_WRT_INPUTS = 13;

	/**
	 * The feature id for the '<em><b>Provides Partial Derivatives Of Derivative Function Wrt States</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CO_SIMULATION_TYPE__PROVIDES_PARTIAL_DERIVATIVES_OF_DERIVATIVE_FUNCTION_WRT_STATES = 14;

	/**
	 * The feature id for the '<em><b>Provides Partial Derivatives Of Output Function Wrt Inputs</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CO_SIMULATION_TYPE__PROVIDES_PARTIAL_DERIVATIVES_OF_OUTPUT_FUNCTION_WRT_INPUTS = 15;

	/**
	 * The feature id for the '<em><b>Provides Partial Derivatives Of Output Function Wrt States</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CO_SIMULATION_TYPE__PROVIDES_PARTIAL_DERIVATIVES_OF_OUTPUT_FUNCTION_WRT_STATES = 16;

	/**
	 * The number of structural features of the '<em>Co Simulation Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CO_SIMULATION_TYPE_FEATURE_COUNT = 17;

	/**
	 * The meta object id for the '{@link FmiModel.impl.DefaultExperimentTypeImpl <em>Default Experiment Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see FmiModel.impl.DefaultExperimentTypeImpl
	 * @see FmiModel.impl.FmiModelPackageImpl#getDefaultExperimentType()
	 * @generated
	 */
	int DEFAULT_EXPERIMENT_TYPE = 4;

	/**
	 * The feature id for the '<em><b>Start Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFAULT_EXPERIMENT_TYPE__START_TIME = 0;

	/**
	 * The feature id for the '<em><b>Stop Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFAULT_EXPERIMENT_TYPE__STOP_TIME = 1;

	/**
	 * The feature id for the '<em><b>Tolerance</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFAULT_EXPERIMENT_TYPE__TOLERANCE = 2;

	/**
	 * The feature id for the '<em><b>Step Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFAULT_EXPERIMENT_TYPE__STEP_SIZE = 3;

	/**
	 * The number of structural features of the '<em>Default Experiment Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFAULT_EXPERIMENT_TYPE_FEATURE_COUNT = 4;

	/**
	 * The meta object id for the '{@link FmiModel.impl.DerivativesTypeImpl <em>Derivatives Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see FmiModel.impl.DerivativesTypeImpl
	 * @see FmiModel.impl.FmiModelPackageImpl#getDerivativesType()
	 * @generated
	 */
	int DERIVATIVES_TYPE = 5;

	/**
	 * The feature id for the '<em><b>Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DERIVATIVES_TYPE__GROUP = 0;

	/**
	 * The feature id for the '<em><b>Derivative</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DERIVATIVES_TYPE__DERIVATIVE = 1;

	/**
	 * The number of structural features of the '<em>Derivatives Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DERIVATIVES_TYPE_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link FmiModel.impl.FmiVariableDependencyImpl <em>Fmi Variable Dependency</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see FmiModel.impl.FmiVariableDependencyImpl
	 * @see FmiModel.impl.FmiModelPackageImpl#getFmiVariableDependency()
	 * @generated
	 */
	int FMI_VARIABLE_DEPENDENCY = 15;

	/**
	 * The feature id for the '<em><b>Input Dependencies</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FMI_VARIABLE_DEPENDENCY__INPUT_DEPENDENCIES = 0;

	/**
	 * The feature id for the '<em><b>Input Factor Kinds</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FMI_VARIABLE_DEPENDENCY__INPUT_FACTOR_KINDS = 1;

	/**
	 * The feature id for the '<em><b>State Dependencies</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FMI_VARIABLE_DEPENDENCY__STATE_DEPENDENCIES = 2;

	/**
	 * The feature id for the '<em><b>State Factor Kinds</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FMI_VARIABLE_DEPENDENCY__STATE_FACTOR_KINDS = 3;

	/**
	 * The number of structural features of the '<em>Fmi Variable Dependency</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FMI_VARIABLE_DEPENDENCY_FEATURE_COUNT = 4;

	/**
	 * The meta object id for the '{@link FmiModel.impl.DerivativeTypeImpl <em>Derivative Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see FmiModel.impl.DerivativeTypeImpl
	 * @see FmiModel.impl.FmiModelPackageImpl#getDerivativeType()
	 * @generated
	 */
	int DERIVATIVE_TYPE = 6;

	/**
	 * The feature id for the '<em><b>Input Dependencies</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DERIVATIVE_TYPE__INPUT_DEPENDENCIES = FMI_VARIABLE_DEPENDENCY__INPUT_DEPENDENCIES;

	/**
	 * The feature id for the '<em><b>Input Factor Kinds</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DERIVATIVE_TYPE__INPUT_FACTOR_KINDS = FMI_VARIABLE_DEPENDENCY__INPUT_FACTOR_KINDS;

	/**
	 * The feature id for the '<em><b>State Dependencies</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DERIVATIVE_TYPE__STATE_DEPENDENCIES = FMI_VARIABLE_DEPENDENCY__STATE_DEPENDENCIES;

	/**
	 * The feature id for the '<em><b>State Factor Kinds</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DERIVATIVE_TYPE__STATE_FACTOR_KINDS = FMI_VARIABLE_DEPENDENCY__STATE_FACTOR_KINDS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DERIVATIVE_TYPE__NAME = FMI_VARIABLE_DEPENDENCY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DERIVATIVE_TYPE__STATE = FMI_VARIABLE_DEPENDENCY_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Derivative Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DERIVATIVE_TYPE_FEATURE_COUNT = FMI_VARIABLE_DEPENDENCY_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link FmiModel.impl.DisplayUnitTypeImpl <em>Display Unit Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see FmiModel.impl.DisplayUnitTypeImpl
	 * @see FmiModel.impl.FmiModelPackageImpl#getDisplayUnitType()
	 * @generated
	 */
	int DISPLAY_UNIT_TYPE = 7;

	/**
	 * The feature id for the '<em><b>Factor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISPLAY_UNIT_TYPE__FACTOR = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISPLAY_UNIT_TYPE__NAME = 1;

	/**
	 * The feature id for the '<em><b>Offset</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISPLAY_UNIT_TYPE__OFFSET = 2;

	/**
	 * The number of structural features of the '<em>Display Unit Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISPLAY_UNIT_TYPE_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link FmiModel.impl.EnumerationTypeImpl <em>Enumeration Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see FmiModel.impl.EnumerationTypeImpl
	 * @see FmiModel.impl.FmiModelPackageImpl#getEnumerationType()
	 * @generated
	 */
	int ENUMERATION_TYPE = 8;

	/**
	 * The feature id for the '<em><b>Declared Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUMERATION_TYPE__DECLARED_TYPE = 0;

	/**
	 * The feature id for the '<em><b>Max</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUMERATION_TYPE__MAX = 1;

	/**
	 * The feature id for the '<em><b>Min</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUMERATION_TYPE__MIN = 2;

	/**
	 * The feature id for the '<em><b>Quantity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUMERATION_TYPE__QUANTITY = 3;

	/**
	 * The feature id for the '<em><b>Start</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUMERATION_TYPE__START = 4;

	/**
	 * The number of structural features of the '<em>Enumeration Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUMERATION_TYPE_FEATURE_COUNT = 5;

	/**
	 * The meta object id for the '{@link FmiModel.impl.EnumerationType1Impl <em>Enumeration Type1</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see FmiModel.impl.EnumerationType1Impl
	 * @see FmiModel.impl.FmiModelPackageImpl#getEnumerationType1()
	 * @generated
	 */
	int ENUMERATION_TYPE1 = 9;

	/**
	 * The feature id for the '<em><b>Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUMERATION_TYPE1__GROUP = 0;

	/**
	 * The feature id for the '<em><b>Item</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUMERATION_TYPE1__ITEM = 1;

	/**
	 * The feature id for the '<em><b>Quantity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUMERATION_TYPE1__QUANTITY = 2;

	/**
	 * The number of structural features of the '<em>Enumeration Type1</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUMERATION_TYPE1_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link FmiModel.impl.FmiAnnotationImpl <em>Fmi Annotation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see FmiModel.impl.FmiAnnotationImpl
	 * @see FmiModel.impl.FmiModelPackageImpl#getFmiAnnotation()
	 * @generated
	 */
	int FMI_ANNOTATION = 10;

	/**
	 * The feature id for the '<em><b>Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FMI_ANNOTATION__GROUP = 0;

	/**
	 * The feature id for the '<em><b>Tool</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FMI_ANNOTATION__TOOL = 1;

	/**
	 * The number of structural features of the '<em>Fmi Annotation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FMI_ANNOTATION_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link FmiModel.impl.FmiModelDescriptionTypeImpl <em>Description Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see FmiModel.impl.FmiModelDescriptionTypeImpl
	 * @see FmiModel.impl.FmiModelPackageImpl#getFmiModelDescriptionType()
	 * @generated
	 */
	int FMI_MODEL_DESCRIPTION_TYPE = 11;

	/**
	 * The feature id for the '<em><b>Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FMI_MODEL_DESCRIPTION_TYPE__GROUP = 0;

	/**
	 * The feature id for the '<em><b>Model Exchange</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FMI_MODEL_DESCRIPTION_TYPE__MODEL_EXCHANGE = 1;

	/**
	 * The feature id for the '<em><b>Co Simulation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FMI_MODEL_DESCRIPTION_TYPE__CO_SIMULATION = 2;

	/**
	 * The feature id for the '<em><b>Unit Definitions</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FMI_MODEL_DESCRIPTION_TYPE__UNIT_DEFINITIONS = 3;

	/**
	 * The feature id for the '<em><b>Type Definitions</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FMI_MODEL_DESCRIPTION_TYPE__TYPE_DEFINITIONS = 4;

	/**
	 * The feature id for the '<em><b>Log Categories</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FMI_MODEL_DESCRIPTION_TYPE__LOG_CATEGORIES = 5;

	/**
	 * The feature id for the '<em><b>Default Experiment</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FMI_MODEL_DESCRIPTION_TYPE__DEFAULT_EXPERIMENT = 6;

	/**
	 * The feature id for the '<em><b>Vendor Annotations</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FMI_MODEL_DESCRIPTION_TYPE__VENDOR_ANNOTATIONS = 7;

	/**
	 * The feature id for the '<em><b>Model Variables</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FMI_MODEL_DESCRIPTION_TYPE__MODEL_VARIABLES = 8;

	/**
	 * The feature id for the '<em><b>Model Structure</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FMI_MODEL_DESCRIPTION_TYPE__MODEL_STRUCTURE = 9;

	/**
	 * The feature id for the '<em><b>Implementation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FMI_MODEL_DESCRIPTION_TYPE__IMPLEMENTATION = 10;

	/**
	 * The feature id for the '<em><b>Author</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FMI_MODEL_DESCRIPTION_TYPE__AUTHOR = 11;

	/**
	 * The feature id for the '<em><b>Copyright</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FMI_MODEL_DESCRIPTION_TYPE__COPYRIGHT = 12;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FMI_MODEL_DESCRIPTION_TYPE__DESCRIPTION = 13;

	/**
	 * The feature id for the '<em><b>Fmi Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FMI_MODEL_DESCRIPTION_TYPE__FMI_VERSION = 14;

	/**
	 * The feature id for the '<em><b>Generation Date And Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FMI_MODEL_DESCRIPTION_TYPE__GENERATION_DATE_AND_TIME = 15;

	/**
	 * The feature id for the '<em><b>Generation Tool</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FMI_MODEL_DESCRIPTION_TYPE__GENERATION_TOOL = 16;

	/**
	 * The feature id for the '<em><b>Guid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FMI_MODEL_DESCRIPTION_TYPE__GUID = 17;

	/**
	 * The feature id for the '<em><b>License</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FMI_MODEL_DESCRIPTION_TYPE__LICENSE = 18;

	/**
	 * The feature id for the '<em><b>Model Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FMI_MODEL_DESCRIPTION_TYPE__MODEL_NAME = 19;

	/**
	 * The feature id for the '<em><b>Number Of Event Indicators</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FMI_MODEL_DESCRIPTION_TYPE__NUMBER_OF_EVENT_INDICATORS = 20;

	/**
	 * The feature id for the '<em><b>Variable Naming Convention</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FMI_MODEL_DESCRIPTION_TYPE__VARIABLE_NAMING_CONVENTION = 21;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FMI_MODEL_DESCRIPTION_TYPE__VERSION = 22;

	/**
	 * The feature id for the '<em><b>Model Identifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FMI_MODEL_DESCRIPTION_TYPE__MODEL_IDENTIFIER = 23;

	/**
	 * The feature id for the '<em><b>Number Of Continuous States</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FMI_MODEL_DESCRIPTION_TYPE__NUMBER_OF_CONTINUOUS_STATES = 24;

	/**
	 * The number of structural features of the '<em>Description Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FMI_MODEL_DESCRIPTION_TYPE_FEATURE_COUNT = 25;

	/**
	 * The meta object id for the '{@link FmiModel.impl.FmiScalarVariableImpl <em>Fmi Scalar Variable</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see FmiModel.impl.FmiScalarVariableImpl
	 * @see FmiModel.impl.FmiModelPackageImpl#getFmiScalarVariable()
	 * @generated
	 */
	int FMI_SCALAR_VARIABLE = 12;

	/**
	 * The feature id for the '<em><b>Real</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FMI_SCALAR_VARIABLE__REAL = 0;

	/**
	 * The feature id for the '<em><b>Integer</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FMI_SCALAR_VARIABLE__INTEGER = 1;

	/**
	 * The feature id for the '<em><b>Boolean</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FMI_SCALAR_VARIABLE__BOOLEAN = 2;

	/**
	 * The feature id for the '<em><b>String</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FMI_SCALAR_VARIABLE__STRING = 3;

	/**
	 * The feature id for the '<em><b>Enumeration</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FMI_SCALAR_VARIABLE__ENUMERATION = 4;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FMI_SCALAR_VARIABLE__ANNOTATIONS = 5;

	/**
	 * The feature id for the '<em><b>Causality</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FMI_SCALAR_VARIABLE__CAUSALITY = 6;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FMI_SCALAR_VARIABLE__DESCRIPTION = 7;

	/**
	 * The feature id for the '<em><b>Initial</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FMI_SCALAR_VARIABLE__INITIAL = 8;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FMI_SCALAR_VARIABLE__NAME = 9;

	/**
	 * The feature id for the '<em><b>Value Reference</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FMI_SCALAR_VARIABLE__VALUE_REFERENCE = 10;

	/**
	 * The feature id for the '<em><b>Variability</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FMI_SCALAR_VARIABLE__VARIABILITY = 11;

	/**
	 * The number of structural features of the '<em>Fmi Scalar Variable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FMI_SCALAR_VARIABLE_FEATURE_COUNT = 12;

	/**
	 * The meta object id for the '{@link FmiModel.impl.FmiSimpleTypeImpl <em>Fmi Simple Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see FmiModel.impl.FmiSimpleTypeImpl
	 * @see FmiModel.impl.FmiModelPackageImpl#getFmiSimpleType()
	 * @generated
	 */
	int FMI_SIMPLE_TYPE = 13;

	/**
	 * The feature id for the '<em><b>Real</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FMI_SIMPLE_TYPE__REAL = 0;

	/**
	 * The feature id for the '<em><b>Integer</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FMI_SIMPLE_TYPE__INTEGER = 1;

	/**
	 * The feature id for the '<em><b>Boolean</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FMI_SIMPLE_TYPE__BOOLEAN = 2;

	/**
	 * The feature id for the '<em><b>String</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FMI_SIMPLE_TYPE__STRING = 3;

	/**
	 * The feature id for the '<em><b>Enumeration</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FMI_SIMPLE_TYPE__ENUMERATION = 4;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FMI_SIMPLE_TYPE__DESCRIPTION = 5;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FMI_SIMPLE_TYPE__NAME = 6;

	/**
	 * The number of structural features of the '<em>Fmi Simple Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FMI_SIMPLE_TYPE_FEATURE_COUNT = 7;

	/**
	 * The meta object id for the '{@link FmiModel.impl.FmiUnitImpl <em>Fmi Unit</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see FmiModel.impl.FmiUnitImpl
	 * @see FmiModel.impl.FmiModelPackageImpl#getFmiUnit()
	 * @generated
	 */
	int FMI_UNIT = 14;

	/**
	 * The feature id for the '<em><b>Base Unit</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FMI_UNIT__BASE_UNIT = 0;

	/**
	 * The feature id for the '<em><b>Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FMI_UNIT__GROUP = 1;

	/**
	 * The feature id for the '<em><b>Display Unit</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FMI_UNIT__DISPLAY_UNIT = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FMI_UNIT__NAME = 3;

	/**
	 * The number of structural features of the '<em>Fmi Unit</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FMI_UNIT_FEATURE_COUNT = 4;

	/**
	 * The meta object id for the '{@link FmiModel.impl.InputsTypeImpl <em>Inputs Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see FmiModel.impl.InputsTypeImpl
	 * @see FmiModel.impl.FmiModelPackageImpl#getInputsType()
	 * @generated
	 */
	int INPUTS_TYPE = 16;

	/**
	 * The feature id for the '<em><b>Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUTS_TYPE__GROUP = 0;

	/**
	 * The feature id for the '<em><b>Input</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUTS_TYPE__INPUT = 1;

	/**
	 * The number of structural features of the '<em>Inputs Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUTS_TYPE_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link FmiModel.impl.InputTypeImpl <em>Input Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see FmiModel.impl.InputTypeImpl
	 * @see FmiModel.impl.FmiModelPackageImpl#getInputType()
	 * @generated
	 */
	int INPUT_TYPE = 17;

	/**
	 * The feature id for the '<em><b>Derivative</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_TYPE__DERIVATIVE = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_TYPE__NAME = 1;

	/**
	 * The number of structural features of the '<em>Input Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_TYPE_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link FmiModel.impl.IntegerTypeImpl <em>Integer Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see FmiModel.impl.IntegerTypeImpl
	 * @see FmiModel.impl.FmiModelPackageImpl#getIntegerType()
	 * @generated
	 */
	int INTEGER_TYPE = 18;

	/**
	 * The feature id for the '<em><b>Declared Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_TYPE__DECLARED_TYPE = 0;

	/**
	 * The feature id for the '<em><b>Max</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_TYPE__MAX = 1;

	/**
	 * The feature id for the '<em><b>Min</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_TYPE__MIN = 2;

	/**
	 * The feature id for the '<em><b>Quantity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_TYPE__QUANTITY = 3;

	/**
	 * The feature id for the '<em><b>Start</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_TYPE__START = 4;

	/**
	 * The number of structural features of the '<em>Integer Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_TYPE_FEATURE_COUNT = 5;

	/**
	 * The meta object id for the '{@link FmiModel.impl.IntegerType1Impl <em>Integer Type1</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see FmiModel.impl.IntegerType1Impl
	 * @see FmiModel.impl.FmiModelPackageImpl#getIntegerType1()
	 * @generated
	 */
	int INTEGER_TYPE1 = 19;

	/**
	 * The feature id for the '<em><b>Max</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_TYPE1__MAX = 0;

	/**
	 * The feature id for the '<em><b>Min</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_TYPE1__MIN = 1;

	/**
	 * The feature id for the '<em><b>Quantity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_TYPE1__QUANTITY = 2;

	/**
	 * The number of structural features of the '<em>Integer Type1</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_TYPE1_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link FmiModel.impl.ItemTypeImpl <em>Item Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see FmiModel.impl.ItemTypeImpl
	 * @see FmiModel.impl.FmiModelPackageImpl#getItemType()
	 * @generated
	 */
	int ITEM_TYPE = 20;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITEM_TYPE__DESCRIPTION = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITEM_TYPE__NAME = 1;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITEM_TYPE__VALUE = 2;

	/**
	 * The number of structural features of the '<em>Item Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITEM_TYPE_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link FmiModel.impl.LogCategoriesTypeImpl <em>Log Categories Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see FmiModel.impl.LogCategoriesTypeImpl
	 * @see FmiModel.impl.FmiModelPackageImpl#getLogCategoriesType()
	 * @generated
	 */
	int LOG_CATEGORIES_TYPE = 21;

	/**
	 * The feature id for the '<em><b>Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOG_CATEGORIES_TYPE__GROUP = 0;

	/**
	 * The feature id for the '<em><b>Category</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOG_CATEGORIES_TYPE__CATEGORY = 1;

	/**
	 * The number of structural features of the '<em>Log Categories Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOG_CATEGORIES_TYPE_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link FmiModel.impl.ModelExchangeTypeImpl <em>Model Exchange Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see FmiModel.impl.ModelExchangeTypeImpl
	 * @see FmiModel.impl.FmiModelPackageImpl#getModelExchangeType()
	 * @generated
	 */
	int MODEL_EXCHANGE_TYPE = 22;

	/**
	 * The feature id for the '<em><b>Can Be Instantiated Only Once Per Process</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_EXCHANGE_TYPE__CAN_BE_INSTANTIATED_ONLY_ONCE_PER_PROCESS = 0;

	/**
	 * The feature id for the '<em><b>Can Get And Set FM Ustate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_EXCHANGE_TYPE__CAN_GET_AND_SET_FM_USTATE = 1;

	/**
	 * The feature id for the '<em><b>Can Not Use Memory Management Functions</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_EXCHANGE_TYPE__CAN_NOT_USE_MEMORY_MANAGEMENT_FUNCTIONS = 2;

	/**
	 * The feature id for the '<em><b>Can Serialize FM Ustate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_EXCHANGE_TYPE__CAN_SERIALIZE_FM_USTATE = 3;

	/**
	 * The feature id for the '<em><b>Completed Integrator Step Not Needed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_EXCHANGE_TYPE__COMPLETED_INTEGRATOR_STEP_NOT_NEEDED = 4;

	/**
	 * The feature id for the '<em><b>Model Identifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_EXCHANGE_TYPE__MODEL_IDENTIFIER = 5;

	/**
	 * The feature id for the '<em><b>Needs Execution Tool</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_EXCHANGE_TYPE__NEEDS_EXECUTION_TOOL = 6;

	/**
	 * The feature id for the '<em><b>Provides Directional Derivatives</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_EXCHANGE_TYPE__PROVIDES_DIRECTIONAL_DERIVATIVES = 7;

	/**
	 * The feature id for the '<em><b>Provides Partial Derivatives Of Derivative Function Wrt Inputs</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_EXCHANGE_TYPE__PROVIDES_PARTIAL_DERIVATIVES_OF_DERIVATIVE_FUNCTION_WRT_INPUTS = 8;

	/**
	 * The feature id for the '<em><b>Provides Partial Derivatives Of Derivative Function Wrt States</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_EXCHANGE_TYPE__PROVIDES_PARTIAL_DERIVATIVES_OF_DERIVATIVE_FUNCTION_WRT_STATES = 9;

	/**
	 * The feature id for the '<em><b>Provides Partial Derivatives Of Output Function Wrt Inputs</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_EXCHANGE_TYPE__PROVIDES_PARTIAL_DERIVATIVES_OF_OUTPUT_FUNCTION_WRT_INPUTS = 10;

	/**
	 * The feature id for the '<em><b>Provides Partial Derivatives Of Output Function Wrt States</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_EXCHANGE_TYPE__PROVIDES_PARTIAL_DERIVATIVES_OF_OUTPUT_FUNCTION_WRT_STATES = 11;

	/**
	 * The number of structural features of the '<em>Model Exchange Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_EXCHANGE_TYPE_FEATURE_COUNT = 12;

	/**
	 * The meta object id for the '{@link FmiModel.impl.ModelStructureTypeImpl <em>Model Structure Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see FmiModel.impl.ModelStructureTypeImpl
	 * @see FmiModel.impl.FmiModelPackageImpl#getModelStructureType()
	 * @generated
	 */
	int MODEL_STRUCTURE_TYPE = 23;

	/**
	 * The feature id for the '<em><b>Inputs</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_STRUCTURE_TYPE__INPUTS = 0;

	/**
	 * The feature id for the '<em><b>Derivatives</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_STRUCTURE_TYPE__DERIVATIVES = 1;

	/**
	 * The feature id for the '<em><b>Outputs</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_STRUCTURE_TYPE__OUTPUTS = 2;

	/**
	 * The number of structural features of the '<em>Model Structure Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_STRUCTURE_TYPE_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link FmiModel.impl.ModelVariablesTypeImpl <em>Model Variables Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see FmiModel.impl.ModelVariablesTypeImpl
	 * @see FmiModel.impl.FmiModelPackageImpl#getModelVariablesType()
	 * @generated
	 */
	int MODEL_VARIABLES_TYPE = 24;

	/**
	 * The feature id for the '<em><b>Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_VARIABLES_TYPE__GROUP = 0;

	/**
	 * The feature id for the '<em><b>Scalar Variable</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_VARIABLES_TYPE__SCALAR_VARIABLE = 1;

	/**
	 * The number of structural features of the '<em>Model Variables Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_VARIABLES_TYPE_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link FmiModel.impl.OutputTypeImpl <em>Output Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see FmiModel.impl.OutputTypeImpl
	 * @see FmiModel.impl.FmiModelPackageImpl#getOutputType()
	 * @generated
	 */
	int OUTPUT_TYPE = 25;

	/**
	 * The feature id for the '<em><b>Input Dependencies</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_TYPE__INPUT_DEPENDENCIES = FMI_VARIABLE_DEPENDENCY__INPUT_DEPENDENCIES;

	/**
	 * The feature id for the '<em><b>Input Factor Kinds</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_TYPE__INPUT_FACTOR_KINDS = FMI_VARIABLE_DEPENDENCY__INPUT_FACTOR_KINDS;

	/**
	 * The feature id for the '<em><b>State Dependencies</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_TYPE__STATE_DEPENDENCIES = FMI_VARIABLE_DEPENDENCY__STATE_DEPENDENCIES;

	/**
	 * The feature id for the '<em><b>State Factor Kinds</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_TYPE__STATE_FACTOR_KINDS = FMI_VARIABLE_DEPENDENCY__STATE_FACTOR_KINDS;

	/**
	 * The feature id for the '<em><b>Derivative</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_TYPE__DERIVATIVE = FMI_VARIABLE_DEPENDENCY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_TYPE__NAME = FMI_VARIABLE_DEPENDENCY_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Output Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_TYPE_FEATURE_COUNT = FMI_VARIABLE_DEPENDENCY_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link FmiModel.impl.RealTypeImpl <em>Real Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see FmiModel.impl.RealTypeImpl
	 * @see FmiModel.impl.FmiModelPackageImpl#getRealType()
	 * @generated
	 */
	int REAL_TYPE = 26;

	/**
	 * The feature id for the '<em><b>Display Unit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REAL_TYPE__DISPLAY_UNIT = 0;

	/**
	 * The feature id for the '<em><b>Max</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REAL_TYPE__MAX = 1;

	/**
	 * The feature id for the '<em><b>Min</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REAL_TYPE__MIN = 2;

	/**
	 * The feature id for the '<em><b>Nominal</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REAL_TYPE__NOMINAL = 3;

	/**
	 * The feature id for the '<em><b>Quantity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REAL_TYPE__QUANTITY = 4;

	/**
	 * The feature id for the '<em><b>Relative Quantity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REAL_TYPE__RELATIVE_QUANTITY = 5;

	/**
	 * The feature id for the '<em><b>Unbounded</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REAL_TYPE__UNBOUNDED = 6;

	/**
	 * The feature id for the '<em><b>Unit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REAL_TYPE__UNIT = 7;

	/**
	 * The number of structural features of the '<em>Real Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REAL_TYPE_FEATURE_COUNT = 8;

	/**
	 * The meta object id for the '{@link FmiModel.impl.ToolTypeImpl <em>Tool Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see FmiModel.impl.ToolTypeImpl
	 * @see FmiModel.impl.FmiModelPackageImpl#getToolType()
	 * @generated
	 */
	int TOOL_TYPE = 27;

	/**
	 * The feature id for the '<em><b>Any</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOOL_TYPE__ANY = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOOL_TYPE__NAME = 1;

	/**
	 * The number of structural features of the '<em>Tool Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOOL_TYPE_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link FmiModel.impl.DocumentRootImpl <em>Document Root</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see FmiModel.impl.DocumentRootImpl
	 * @see FmiModel.impl.FmiModelPackageImpl#getDocumentRoot()
	 * @generated
	 */
	int DOCUMENT_ROOT = 28;

	/**
	 * The feature id for the '<em><b>Mixed</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__MIXED = 0;

	/**
	 * The feature id for the '<em><b>XMLNS Prefix Map</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__XMLNS_PREFIX_MAP = 1;

	/**
	 * The feature id for the '<em><b>XSI Schema Location</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__XSI_SCHEMA_LOCATION = 2;

	/**
	 * The feature id for the '<em><b>Fmi Model Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__FMI_MODEL_DESCRIPTION = 3;

	/**
	 * The number of structural features of the '<em>Document Root</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT_FEATURE_COUNT = 4;

	/**
	 * The meta object id for the '{@link FmiModel.impl.OutputsTypeImpl <em>Outputs Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see FmiModel.impl.OutputsTypeImpl
	 * @see FmiModel.impl.FmiModelPackageImpl#getOutputsType()
	 * @generated
	 */
	int OUTPUTS_TYPE = 29;

	/**
	 * The feature id for the '<em><b>Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUTS_TYPE__GROUP = 0;

	/**
	 * The feature id for the '<em><b>Output</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUTS_TYPE__OUTPUT = 1;

	/**
	 * The number of structural features of the '<em>Outputs Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUTS_TYPE_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link FmiModel.impl.RealType1Impl <em>Real Type1</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see FmiModel.impl.RealType1Impl
	 * @see FmiModel.impl.FmiModelPackageImpl#getRealType1()
	 * @generated
	 */
	int REAL_TYPE1 = 30;

	/**
	 * The feature id for the '<em><b>Declared Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REAL_TYPE1__DECLARED_TYPE = 0;

	/**
	 * The feature id for the '<em><b>Display Unit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REAL_TYPE1__DISPLAY_UNIT = 1;

	/**
	 * The feature id for the '<em><b>Max</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REAL_TYPE1__MAX = 2;

	/**
	 * The feature id for the '<em><b>Min</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REAL_TYPE1__MIN = 3;

	/**
	 * The feature id for the '<em><b>Nominal</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REAL_TYPE1__NOMINAL = 4;

	/**
	 * The feature id for the '<em><b>Quantity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REAL_TYPE1__QUANTITY = 5;

	/**
	 * The feature id for the '<em><b>Relative Quantity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REAL_TYPE1__RELATIVE_QUANTITY = 6;

	/**
	 * The feature id for the '<em><b>Start</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REAL_TYPE1__START = 7;

	/**
	 * The feature id for the '<em><b>Unbounded</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REAL_TYPE1__UNBOUNDED = 8;

	/**
	 * The feature id for the '<em><b>Unit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REAL_TYPE1__UNIT = 9;

	/**
	 * The number of structural features of the '<em>Real Type1</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REAL_TYPE1_FEATURE_COUNT = 10;

	/**
	 * The meta object id for the '{@link FmiModel.impl.StringTypeImpl <em>String Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see FmiModel.impl.StringTypeImpl
	 * @see FmiModel.impl.FmiModelPackageImpl#getStringType()
	 * @generated
	 */
	int STRING_TYPE = 31;

	/**
	 * The feature id for the '<em><b>Declared Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_TYPE__DECLARED_TYPE = 0;

	/**
	 * The feature id for the '<em><b>Start</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_TYPE__START = 1;

	/**
	 * The number of structural features of the '<em>String Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_TYPE_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link FmiModel.impl.TypeDefinitionsTypeImpl <em>Type Definitions Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see FmiModel.impl.TypeDefinitionsTypeImpl
	 * @see FmiModel.impl.FmiModelPackageImpl#getTypeDefinitionsType()
	 * @generated
	 */
	int TYPE_DEFINITIONS_TYPE = 32;

	/**
	 * The feature id for the '<em><b>Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_DEFINITIONS_TYPE__GROUP = 0;

	/**
	 * The feature id for the '<em><b>Simple Type</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_DEFINITIONS_TYPE__SIMPLE_TYPE = 1;

	/**
	 * The number of structural features of the '<em>Type Definitions Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_DEFINITIONS_TYPE_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link FmiModel.impl.UnitDefinitionsTypeImpl <em>Unit Definitions Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see FmiModel.impl.UnitDefinitionsTypeImpl
	 * @see FmiModel.impl.FmiModelPackageImpl#getUnitDefinitionsType()
	 * @generated
	 */
	int UNIT_DEFINITIONS_TYPE = 33;

	/**
	 * The feature id for the '<em><b>Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIT_DEFINITIONS_TYPE__GROUP = 0;

	/**
	 * The feature id for the '<em><b>Unit</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIT_DEFINITIONS_TYPE__UNIT = 1;

	/**
	 * The number of structural features of the '<em>Unit Definitions Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIT_DEFINITIONS_TYPE_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link FmiModel.impl.ImplementationImpl <em>Implementation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see FmiModel.impl.ImplementationImpl
	 * @see FmiModel.impl.FmiModelPackageImpl#getImplementation()
	 * @generated
	 */
	int IMPLEMENTATION = 34;

	/**
	 * The feature id for the '<em><b>Fmi Co Simulation Capabilities</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPLEMENTATION__FMI_CO_SIMULATION_CAPABILITIES = 0;

	/**
	 * The number of structural features of the '<em>Implementation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPLEMENTATION_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link FmiModel.impl.FmiCoSimulationCapabilitiesTypeImpl <em>Fmi Co Simulation Capabilities Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see FmiModel.impl.FmiCoSimulationCapabilitiesTypeImpl
	 * @see FmiModel.impl.FmiModelPackageImpl#getFmiCoSimulationCapabilitiesType()
	 * @generated
	 */
	int FMI_CO_SIMULATION_CAPABILITIES_TYPE = 35;

	/**
	 * The feature id for the '<em><b>Capabilities</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FMI_CO_SIMULATION_CAPABILITIES_TYPE__CAPABILITIES = 0;

	/**
	 * The number of structural features of the '<em>Fmi Co Simulation Capabilities Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FMI_CO_SIMULATION_CAPABILITIES_TYPE_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link FmiModel.impl.CoSimulation_StandAloneImpl <em>Co Simulation Stand Alone</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see FmiModel.impl.CoSimulation_StandAloneImpl
	 * @see FmiModel.impl.FmiModelPackageImpl#getCoSimulation_StandAlone()
	 * @generated
	 */
	int CO_SIMULATION_STAND_ALONE = 36;

	/**
	 * The feature id for the '<em><b>Fmi Co Simulation Capabilities</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CO_SIMULATION_STAND_ALONE__FMI_CO_SIMULATION_CAPABILITIES = IMPLEMENTATION__FMI_CO_SIMULATION_CAPABILITIES;

	/**
	 * The number of structural features of the '<em>Co Simulation Stand Alone</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CO_SIMULATION_STAND_ALONE_FEATURE_COUNT = IMPLEMENTATION_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link FmiModel.impl.CoSimulation_ToolImpl <em>Co Simulation Tool</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see FmiModel.impl.CoSimulation_ToolImpl
	 * @see FmiModel.impl.FmiModelPackageImpl#getCoSimulation_Tool()
	 * @generated
	 */
	int CO_SIMULATION_TOOL = 37;

	/**
	 * The feature id for the '<em><b>Fmi Co Simulation Capabilities</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CO_SIMULATION_TOOL__FMI_CO_SIMULATION_CAPABILITIES = IMPLEMENTATION__FMI_CO_SIMULATION_CAPABILITIES;

	/**
	 * The number of structural features of the '<em>Co Simulation Tool</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CO_SIMULATION_TOOL_FEATURE_COUNT = IMPLEMENTATION_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link FmiModel.CausalityType <em>Causality Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see FmiModel.CausalityType
	 * @see FmiModel.impl.FmiModelPackageImpl#getCausalityType()
	 * @generated
	 */
	int CAUSALITY_TYPE = 38;

	/**
	 * The meta object id for the '{@link FmiModel.FmiDependencyFactorKind <em>Fmi Dependency Factor Kind</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see FmiModel.FmiDependencyFactorKind
	 * @see FmiModel.impl.FmiModelPackageImpl#getFmiDependencyFactorKind()
	 * @generated
	 */
	int FMI_DEPENDENCY_FACTOR_KIND = 39;

	/**
	 * The meta object id for the '{@link FmiModel.InitialType <em>Initial Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see FmiModel.InitialType
	 * @see FmiModel.impl.FmiModelPackageImpl#getInitialType()
	 * @generated
	 */
	int INITIAL_TYPE = 40;

	/**
	 * The meta object id for the '{@link FmiModel.VariabilityType <em>Variability Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see FmiModel.VariabilityType
	 * @see FmiModel.impl.FmiModelPackageImpl#getVariabilityType()
	 * @generated
	 */
	int VARIABILITY_TYPE = 41;

	/**
	 * The meta object id for the '{@link FmiModel.VariableNamingConventionType <em>Variable Naming Convention Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see FmiModel.VariableNamingConventionType
	 * @see FmiModel.impl.FmiModelPackageImpl#getVariableNamingConventionType()
	 * @generated
	 */
	int VARIABLE_NAMING_CONVENTION_TYPE = 42;

	/**
	 * The meta object id for the '<em>Causality Type Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see FmiModel.CausalityType
	 * @see FmiModel.impl.FmiModelPackageImpl#getCausalityTypeObject()
	 * @generated
	 */
	int CAUSALITY_TYPE_OBJECT = 43;

	/**
	 * The meta object id for the '<em>Fmi Dependency Factor Kind Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see FmiModel.FmiDependencyFactorKind
	 * @see FmiModel.impl.FmiModelPackageImpl#getFmiDependencyFactorKindObject()
	 * @generated
	 */
	int FMI_DEPENDENCY_FACTOR_KIND_OBJECT = 44;

	/**
	 * The meta object id for the '<em>Initial Type Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see FmiModel.InitialType
	 * @see FmiModel.impl.FmiModelPackageImpl#getInitialTypeObject()
	 * @generated
	 */
	int INITIAL_TYPE_OBJECT = 45;

	/**
	 * The meta object id for the '<em>Input Dependencies Type</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.util.List
	 * @see FmiModel.impl.FmiModelPackageImpl#getInputDependenciesType()
	 * @generated
	 */
	int INPUT_DEPENDENCIES_TYPE = 46;

	/**
	 * The meta object id for the '<em>Input Factor Kinds Type</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.util.List
	 * @see FmiModel.impl.FmiModelPackageImpl#getInputFactorKindsType()
	 * @generated
	 */
	int INPUT_FACTOR_KINDS_TYPE = 47;

	/**
	 * The meta object id for the '<em>State Dependencies Type</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.util.List
	 * @see FmiModel.impl.FmiModelPackageImpl#getStateDependenciesType()
	 * @generated
	 */
	int STATE_DEPENDENCIES_TYPE = 48;

	/**
	 * The meta object id for the '<em>State Factor Kinds Type</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.util.List
	 * @see FmiModel.impl.FmiModelPackageImpl#getStateFactorKindsType()
	 * @generated
	 */
	int STATE_FACTOR_KINDS_TYPE = 49;

	/**
	 * The meta object id for the '<em>Variability Type Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see FmiModel.VariabilityType
	 * @see FmiModel.impl.FmiModelPackageImpl#getVariabilityTypeObject()
	 * @generated
	 */
	int VARIABILITY_TYPE_OBJECT = 50;

	/**
	 * The meta object id for the '<em>Variable Naming Convention Type Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see FmiModel.VariableNamingConventionType
	 * @see FmiModel.impl.FmiModelPackageImpl#getVariableNamingConventionTypeObject()
	 * @generated
	 */
	int VARIABLE_NAMING_CONVENTION_TYPE_OBJECT = 51;


	/**
	 * Returns the meta object for class '{@link FmiModel.BaseUnitType <em>Base Unit Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Base Unit Type</em>'.
	 * @see FmiModel.BaseUnitType
	 * @generated
	 */
	EClass getBaseUnitType();

	/**
	 * Returns the meta object for the attribute '{@link FmiModel.BaseUnitType#getA <em>A</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>A</em>'.
	 * @see FmiModel.BaseUnitType#getA()
	 * @see #getBaseUnitType()
	 * @generated
	 */
	EAttribute getBaseUnitType_A();

	/**
	 * Returns the meta object for the attribute '{@link FmiModel.BaseUnitType#getCd <em>Cd</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cd</em>'.
	 * @see FmiModel.BaseUnitType#getCd()
	 * @see #getBaseUnitType()
	 * @generated
	 */
	EAttribute getBaseUnitType_Cd();

	/**
	 * Returns the meta object for the attribute '{@link FmiModel.BaseUnitType#getFactor <em>Factor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Factor</em>'.
	 * @see FmiModel.BaseUnitType#getFactor()
	 * @see #getBaseUnitType()
	 * @generated
	 */
	EAttribute getBaseUnitType_Factor();

	/**
	 * Returns the meta object for the attribute '{@link FmiModel.BaseUnitType#getK <em>K</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>K</em>'.
	 * @see FmiModel.BaseUnitType#getK()
	 * @see #getBaseUnitType()
	 * @generated
	 */
	EAttribute getBaseUnitType_K();

	/**
	 * Returns the meta object for the attribute '{@link FmiModel.BaseUnitType#getKg <em>Kg</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Kg</em>'.
	 * @see FmiModel.BaseUnitType#getKg()
	 * @see #getBaseUnitType()
	 * @generated
	 */
	EAttribute getBaseUnitType_Kg();

	/**
	 * Returns the meta object for the attribute '{@link FmiModel.BaseUnitType#getM <em>M</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>M</em>'.
	 * @see FmiModel.BaseUnitType#getM()
	 * @see #getBaseUnitType()
	 * @generated
	 */
	EAttribute getBaseUnitType_M();

	/**
	 * Returns the meta object for the attribute '{@link FmiModel.BaseUnitType#getMol <em>Mol</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Mol</em>'.
	 * @see FmiModel.BaseUnitType#getMol()
	 * @see #getBaseUnitType()
	 * @generated
	 */
	EAttribute getBaseUnitType_Mol();

	/**
	 * Returns the meta object for the attribute '{@link FmiModel.BaseUnitType#getOffset <em>Offset</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Offset</em>'.
	 * @see FmiModel.BaseUnitType#getOffset()
	 * @see #getBaseUnitType()
	 * @generated
	 */
	EAttribute getBaseUnitType_Offset();

	/**
	 * Returns the meta object for the attribute '{@link FmiModel.BaseUnitType#getRad <em>Rad</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Rad</em>'.
	 * @see FmiModel.BaseUnitType#getRad()
	 * @see #getBaseUnitType()
	 * @generated
	 */
	EAttribute getBaseUnitType_Rad();

	/**
	 * Returns the meta object for the attribute '{@link FmiModel.BaseUnitType#getS <em>S</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>S</em>'.
	 * @see FmiModel.BaseUnitType#getS()
	 * @see #getBaseUnitType()
	 * @generated
	 */
	EAttribute getBaseUnitType_S();

	/**
	 * Returns the meta object for class '{@link FmiModel.BooleanType <em>Boolean Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Boolean Type</em>'.
	 * @see FmiModel.BooleanType
	 * @generated
	 */
	EClass getBooleanType();

	/**
	 * Returns the meta object for the attribute '{@link FmiModel.BooleanType#getDeclaredType <em>Declared Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Declared Type</em>'.
	 * @see FmiModel.BooleanType#getDeclaredType()
	 * @see #getBooleanType()
	 * @generated
	 */
	EAttribute getBooleanType_DeclaredType();

	/**
	 * Returns the meta object for the attribute '{@link FmiModel.BooleanType#isStart <em>Start</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Start</em>'.
	 * @see FmiModel.BooleanType#isStart()
	 * @see #getBooleanType()
	 * @generated
	 */
	EAttribute getBooleanType_Start();

	/**
	 * Returns the meta object for class '{@link FmiModel.CategoryType <em>Category Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Category Type</em>'.
	 * @see FmiModel.CategoryType
	 * @generated
	 */
	EClass getCategoryType();

	/**
	 * Returns the meta object for the attribute '{@link FmiModel.CategoryType#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see FmiModel.CategoryType#getName()
	 * @see #getCategoryType()
	 * @generated
	 */
	EAttribute getCategoryType_Name();

	/**
	 * Returns the meta object for class '{@link FmiModel.CoSimulationType <em>Co Simulation Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Co Simulation Type</em>'.
	 * @see FmiModel.CoSimulationType
	 * @generated
	 */
	EClass getCoSimulationType();

	/**
	 * Returns the meta object for the attribute '{@link FmiModel.CoSimulationType#isCanBeInstantiatedOnlyOncePerProcess <em>Can Be Instantiated Only Once Per Process</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Can Be Instantiated Only Once Per Process</em>'.
	 * @see FmiModel.CoSimulationType#isCanBeInstantiatedOnlyOncePerProcess()
	 * @see #getCoSimulationType()
	 * @generated
	 */
	EAttribute getCoSimulationType_CanBeInstantiatedOnlyOncePerProcess();

	/**
	 * Returns the meta object for the attribute '{@link FmiModel.CoSimulationType#isCanGetAndSetFMUstate <em>Can Get And Set FM Ustate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Can Get And Set FM Ustate</em>'.
	 * @see FmiModel.CoSimulationType#isCanGetAndSetFMUstate()
	 * @see #getCoSimulationType()
	 * @generated
	 */
	EAttribute getCoSimulationType_CanGetAndSetFMUstate();

	/**
	 * Returns the meta object for the attribute '{@link FmiModel.CoSimulationType#isCanHandleEvents <em>Can Handle Events</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Can Handle Events</em>'.
	 * @see FmiModel.CoSimulationType#isCanHandleEvents()
	 * @see #getCoSimulationType()
	 * @generated
	 */
	EAttribute getCoSimulationType_CanHandleEvents();

	/**
	 * Returns the meta object for the attribute '{@link FmiModel.CoSimulationType#isCanRejectSteps <em>Can Reject Steps</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Can Reject Steps</em>'.
	 * @see FmiModel.CoSimulationType#isCanRejectSteps()
	 * @see #getCoSimulationType()
	 * @generated
	 */
	EAttribute getCoSimulationType_CanRejectSteps();

	/**
	 * Returns the meta object for the attribute '{@link FmiModel.CoSimulationType#isCanHandleVariableCommunicationStepSize <em>Can Handle Variable Communication Step Size</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Can Handle Variable Communication Step Size</em>'.
	 * @see FmiModel.CoSimulationType#isCanHandleVariableCommunicationStepSize()
	 * @see #getCoSimulationType()
	 * @generated
	 */
	EAttribute getCoSimulationType_CanHandleVariableCommunicationStepSize();

	/**
	 * Returns the meta object for the attribute '{@link FmiModel.CoSimulationType#isCanInterpolateInputs <em>Can Interpolate Inputs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Can Interpolate Inputs</em>'.
	 * @see FmiModel.CoSimulationType#isCanInterpolateInputs()
	 * @see #getCoSimulationType()
	 * @generated
	 */
	EAttribute getCoSimulationType_CanInterpolateInputs();

	/**
	 * Returns the meta object for the attribute '{@link FmiModel.CoSimulationType#isCanNotUseMemoryManagementFunctions <em>Can Not Use Memory Management Functions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Can Not Use Memory Management Functions</em>'.
	 * @see FmiModel.CoSimulationType#isCanNotUseMemoryManagementFunctions()
	 * @see #getCoSimulationType()
	 * @generated
	 */
	EAttribute getCoSimulationType_CanNotUseMemoryManagementFunctions();

	/**
	 * Returns the meta object for the attribute '{@link FmiModel.CoSimulationType#isCanRunAsynchronuously <em>Can Run Asynchronuously</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Can Run Asynchronuously</em>'.
	 * @see FmiModel.CoSimulationType#isCanRunAsynchronuously()
	 * @see #getCoSimulationType()
	 * @generated
	 */
	EAttribute getCoSimulationType_CanRunAsynchronuously();

	/**
	 * Returns the meta object for the attribute '{@link FmiModel.CoSimulationType#isCanSerializeFMUstate <em>Can Serialize FM Ustate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Can Serialize FM Ustate</em>'.
	 * @see FmiModel.CoSimulationType#isCanSerializeFMUstate()
	 * @see #getCoSimulationType()
	 * @generated
	 */
	EAttribute getCoSimulationType_CanSerializeFMUstate();

	/**
	 * Returns the meta object for the attribute '{@link FmiModel.CoSimulationType#isCanSignalEvents <em>Can Signal Events</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Can Signal Events</em>'.
	 * @see FmiModel.CoSimulationType#isCanSignalEvents()
	 * @see #getCoSimulationType()
	 * @generated
	 */
	EAttribute getCoSimulationType_CanSignalEvents();

	/**
	 * Returns the meta object for the attribute '{@link FmiModel.CoSimulationType#getMaxOutputDerivativeOrder <em>Max Output Derivative Order</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Max Output Derivative Order</em>'.
	 * @see FmiModel.CoSimulationType#getMaxOutputDerivativeOrder()
	 * @see #getCoSimulationType()
	 * @generated
	 */
	EAttribute getCoSimulationType_MaxOutputDerivativeOrder();

	/**
	 * Returns the meta object for the attribute '{@link FmiModel.CoSimulationType#getModelIdentifier <em>Model Identifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Model Identifier</em>'.
	 * @see FmiModel.CoSimulationType#getModelIdentifier()
	 * @see #getCoSimulationType()
	 * @generated
	 */
	EAttribute getCoSimulationType_ModelIdentifier();

	/**
	 * Returns the meta object for the attribute '{@link FmiModel.CoSimulationType#isNeedsExecutionTool <em>Needs Execution Tool</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Needs Execution Tool</em>'.
	 * @see FmiModel.CoSimulationType#isNeedsExecutionTool()
	 * @see #getCoSimulationType()
	 * @generated
	 */
	EAttribute getCoSimulationType_NeedsExecutionTool();

	/**
	 * Returns the meta object for the attribute '{@link FmiModel.CoSimulationType#isProvidesPartialDerivativesOfDerivativeFunctionWrtInputs <em>Provides Partial Derivatives Of Derivative Function Wrt Inputs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Provides Partial Derivatives Of Derivative Function Wrt Inputs</em>'.
	 * @see FmiModel.CoSimulationType#isProvidesPartialDerivativesOfDerivativeFunctionWrtInputs()
	 * @see #getCoSimulationType()
	 * @generated
	 */
	EAttribute getCoSimulationType_ProvidesPartialDerivativesOfDerivativeFunctionWrtInputs();

	/**
	 * Returns the meta object for the attribute '{@link FmiModel.CoSimulationType#isProvidesPartialDerivativesOfDerivativeFunctionWrtStates <em>Provides Partial Derivatives Of Derivative Function Wrt States</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Provides Partial Derivatives Of Derivative Function Wrt States</em>'.
	 * @see FmiModel.CoSimulationType#isProvidesPartialDerivativesOfDerivativeFunctionWrtStates()
	 * @see #getCoSimulationType()
	 * @generated
	 */
	EAttribute getCoSimulationType_ProvidesPartialDerivativesOfDerivativeFunctionWrtStates();

	/**
	 * Returns the meta object for the attribute '{@link FmiModel.CoSimulationType#isProvidesPartialDerivativesOfOutputFunctionWrtInputs <em>Provides Partial Derivatives Of Output Function Wrt Inputs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Provides Partial Derivatives Of Output Function Wrt Inputs</em>'.
	 * @see FmiModel.CoSimulationType#isProvidesPartialDerivativesOfOutputFunctionWrtInputs()
	 * @see #getCoSimulationType()
	 * @generated
	 */
	EAttribute getCoSimulationType_ProvidesPartialDerivativesOfOutputFunctionWrtInputs();

	/**
	 * Returns the meta object for the attribute '{@link FmiModel.CoSimulationType#isProvidesPartialDerivativesOfOutputFunctionWrtStates <em>Provides Partial Derivatives Of Output Function Wrt States</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Provides Partial Derivatives Of Output Function Wrt States</em>'.
	 * @see FmiModel.CoSimulationType#isProvidesPartialDerivativesOfOutputFunctionWrtStates()
	 * @see #getCoSimulationType()
	 * @generated
	 */
	EAttribute getCoSimulationType_ProvidesPartialDerivativesOfOutputFunctionWrtStates();

	/**
	 * Returns the meta object for class '{@link FmiModel.DefaultExperimentType <em>Default Experiment Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Default Experiment Type</em>'.
	 * @see FmiModel.DefaultExperimentType
	 * @generated
	 */
	EClass getDefaultExperimentType();

	/**
	 * Returns the meta object for the attribute '{@link FmiModel.DefaultExperimentType#getStartTime <em>Start Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Start Time</em>'.
	 * @see FmiModel.DefaultExperimentType#getStartTime()
	 * @see #getDefaultExperimentType()
	 * @generated
	 */
	EAttribute getDefaultExperimentType_StartTime();

	/**
	 * Returns the meta object for the attribute '{@link FmiModel.DefaultExperimentType#getStopTime <em>Stop Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Stop Time</em>'.
	 * @see FmiModel.DefaultExperimentType#getStopTime()
	 * @see #getDefaultExperimentType()
	 * @generated
	 */
	EAttribute getDefaultExperimentType_StopTime();

	/**
	 * Returns the meta object for the attribute '{@link FmiModel.DefaultExperimentType#getTolerance <em>Tolerance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Tolerance</em>'.
	 * @see FmiModel.DefaultExperimentType#getTolerance()
	 * @see #getDefaultExperimentType()
	 * @generated
	 */
	EAttribute getDefaultExperimentType_Tolerance();

	/**
	 * Returns the meta object for the attribute '{@link FmiModel.DefaultExperimentType#getStepSize <em>Step Size</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Step Size</em>'.
	 * @see FmiModel.DefaultExperimentType#getStepSize()
	 * @see #getDefaultExperimentType()
	 * @generated
	 */
	EAttribute getDefaultExperimentType_StepSize();

	/**
	 * Returns the meta object for class '{@link FmiModel.DerivativesType <em>Derivatives Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Derivatives Type</em>'.
	 * @see FmiModel.DerivativesType
	 * @generated
	 */
	EClass getDerivativesType();

	/**
	 * Returns the meta object for the attribute list '{@link FmiModel.DerivativesType#getGroup <em>Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Group</em>'.
	 * @see FmiModel.DerivativesType#getGroup()
	 * @see #getDerivativesType()
	 * @generated
	 */
	EAttribute getDerivativesType_Group();

	/**
	 * Returns the meta object for the containment reference list '{@link FmiModel.DerivativesType#getDerivative <em>Derivative</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Derivative</em>'.
	 * @see FmiModel.DerivativesType#getDerivative()
	 * @see #getDerivativesType()
	 * @generated
	 */
	EReference getDerivativesType_Derivative();

	/**
	 * Returns the meta object for class '{@link FmiModel.DerivativeType <em>Derivative Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Derivative Type</em>'.
	 * @see FmiModel.DerivativeType
	 * @generated
	 */
	EClass getDerivativeType();

	/**
	 * Returns the meta object for the attribute '{@link FmiModel.DerivativeType#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see FmiModel.DerivativeType#getName()
	 * @see #getDerivativeType()
	 * @generated
	 */
	EAttribute getDerivativeType_Name();

	/**
	 * Returns the meta object for the attribute '{@link FmiModel.DerivativeType#getState <em>State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>State</em>'.
	 * @see FmiModel.DerivativeType#getState()
	 * @see #getDerivativeType()
	 * @generated
	 */
	EAttribute getDerivativeType_State();

	/**
	 * Returns the meta object for class '{@link FmiModel.DisplayUnitType <em>Display Unit Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Display Unit Type</em>'.
	 * @see FmiModel.DisplayUnitType
	 * @generated
	 */
	EClass getDisplayUnitType();

	/**
	 * Returns the meta object for the attribute '{@link FmiModel.DisplayUnitType#getFactor <em>Factor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Factor</em>'.
	 * @see FmiModel.DisplayUnitType#getFactor()
	 * @see #getDisplayUnitType()
	 * @generated
	 */
	EAttribute getDisplayUnitType_Factor();

	/**
	 * Returns the meta object for the attribute '{@link FmiModel.DisplayUnitType#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see FmiModel.DisplayUnitType#getName()
	 * @see #getDisplayUnitType()
	 * @generated
	 */
	EAttribute getDisplayUnitType_Name();

	/**
	 * Returns the meta object for the attribute '{@link FmiModel.DisplayUnitType#getOffset <em>Offset</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Offset</em>'.
	 * @see FmiModel.DisplayUnitType#getOffset()
	 * @see #getDisplayUnitType()
	 * @generated
	 */
	EAttribute getDisplayUnitType_Offset();

	/**
	 * Returns the meta object for class '{@link FmiModel.EnumerationType <em>Enumeration Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Enumeration Type</em>'.
	 * @see FmiModel.EnumerationType
	 * @generated
	 */
	EClass getEnumerationType();

	/**
	 * Returns the meta object for the attribute '{@link FmiModel.EnumerationType#getDeclaredType <em>Declared Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Declared Type</em>'.
	 * @see FmiModel.EnumerationType#getDeclaredType()
	 * @see #getEnumerationType()
	 * @generated
	 */
	EAttribute getEnumerationType_DeclaredType();

	/**
	 * Returns the meta object for the attribute '{@link FmiModel.EnumerationType#getMax <em>Max</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Max</em>'.
	 * @see FmiModel.EnumerationType#getMax()
	 * @see #getEnumerationType()
	 * @generated
	 */
	EAttribute getEnumerationType_Max();

	/**
	 * Returns the meta object for the attribute '{@link FmiModel.EnumerationType#getMin <em>Min</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Min</em>'.
	 * @see FmiModel.EnumerationType#getMin()
	 * @see #getEnumerationType()
	 * @generated
	 */
	EAttribute getEnumerationType_Min();

	/**
	 * Returns the meta object for the attribute '{@link FmiModel.EnumerationType#getQuantity <em>Quantity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Quantity</em>'.
	 * @see FmiModel.EnumerationType#getQuantity()
	 * @see #getEnumerationType()
	 * @generated
	 */
	EAttribute getEnumerationType_Quantity();

	/**
	 * Returns the meta object for the attribute '{@link FmiModel.EnumerationType#getStart <em>Start</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Start</em>'.
	 * @see FmiModel.EnumerationType#getStart()
	 * @see #getEnumerationType()
	 * @generated
	 */
	EAttribute getEnumerationType_Start();

	/**
	 * Returns the meta object for class '{@link FmiModel.EnumerationType1 <em>Enumeration Type1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Enumeration Type1</em>'.
	 * @see FmiModel.EnumerationType1
	 * @generated
	 */
	EClass getEnumerationType1();

	/**
	 * Returns the meta object for the attribute list '{@link FmiModel.EnumerationType1#getGroup <em>Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Group</em>'.
	 * @see FmiModel.EnumerationType1#getGroup()
	 * @see #getEnumerationType1()
	 * @generated
	 */
	EAttribute getEnumerationType1_Group();

	/**
	 * Returns the meta object for the containment reference list '{@link FmiModel.EnumerationType1#getItem <em>Item</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Item</em>'.
	 * @see FmiModel.EnumerationType1#getItem()
	 * @see #getEnumerationType1()
	 * @generated
	 */
	EReference getEnumerationType1_Item();

	/**
	 * Returns the meta object for the attribute '{@link FmiModel.EnumerationType1#getQuantity <em>Quantity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Quantity</em>'.
	 * @see FmiModel.EnumerationType1#getQuantity()
	 * @see #getEnumerationType1()
	 * @generated
	 */
	EAttribute getEnumerationType1_Quantity();

	/**
	 * Returns the meta object for class '{@link FmiModel.FmiAnnotation <em>Fmi Annotation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Fmi Annotation</em>'.
	 * @see FmiModel.FmiAnnotation
	 * @generated
	 */
	EClass getFmiAnnotation();

	/**
	 * Returns the meta object for the attribute list '{@link FmiModel.FmiAnnotation#getGroup <em>Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Group</em>'.
	 * @see FmiModel.FmiAnnotation#getGroup()
	 * @see #getFmiAnnotation()
	 * @generated
	 */
	EAttribute getFmiAnnotation_Group();

	/**
	 * Returns the meta object for the containment reference list '{@link FmiModel.FmiAnnotation#getTool <em>Tool</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Tool</em>'.
	 * @see FmiModel.FmiAnnotation#getTool()
	 * @see #getFmiAnnotation()
	 * @generated
	 */
	EReference getFmiAnnotation_Tool();

	/**
	 * Returns the meta object for class '{@link FmiModel.FmiModelDescriptionType <em>Description Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Description Type</em>'.
	 * @see FmiModel.FmiModelDescriptionType
	 * @generated
	 */
	EClass getFmiModelDescriptionType();

	/**
	 * Returns the meta object for the attribute list '{@link FmiModel.FmiModelDescriptionType#getGroup <em>Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Group</em>'.
	 * @see FmiModel.FmiModelDescriptionType#getGroup()
	 * @see #getFmiModelDescriptionType()
	 * @generated
	 */
	EAttribute getFmiModelDescriptionType_Group();

	/**
	 * Returns the meta object for the containment reference list '{@link FmiModel.FmiModelDescriptionType#getModelExchange <em>Model Exchange</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Model Exchange</em>'.
	 * @see FmiModel.FmiModelDescriptionType#getModelExchange()
	 * @see #getFmiModelDescriptionType()
	 * @generated
	 */
	EReference getFmiModelDescriptionType_ModelExchange();

	/**
	 * Returns the meta object for the containment reference list '{@link FmiModel.FmiModelDescriptionType#getCoSimulation <em>Co Simulation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Co Simulation</em>'.
	 * @see FmiModel.FmiModelDescriptionType#getCoSimulation()
	 * @see #getFmiModelDescriptionType()
	 * @generated
	 */
	EReference getFmiModelDescriptionType_CoSimulation();

	/**
	 * Returns the meta object for the containment reference '{@link FmiModel.FmiModelDescriptionType#getUnitDefinitions <em>Unit Definitions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Unit Definitions</em>'.
	 * @see FmiModel.FmiModelDescriptionType#getUnitDefinitions()
	 * @see #getFmiModelDescriptionType()
	 * @generated
	 */
	EReference getFmiModelDescriptionType_UnitDefinitions();

	/**
	 * Returns the meta object for the containment reference '{@link FmiModel.FmiModelDescriptionType#getTypeDefinitions <em>Type Definitions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Type Definitions</em>'.
	 * @see FmiModel.FmiModelDescriptionType#getTypeDefinitions()
	 * @see #getFmiModelDescriptionType()
	 * @generated
	 */
	EReference getFmiModelDescriptionType_TypeDefinitions();

	/**
	 * Returns the meta object for the containment reference '{@link FmiModel.FmiModelDescriptionType#getLogCategories <em>Log Categories</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Log Categories</em>'.
	 * @see FmiModel.FmiModelDescriptionType#getLogCategories()
	 * @see #getFmiModelDescriptionType()
	 * @generated
	 */
	EReference getFmiModelDescriptionType_LogCategories();

	/**
	 * Returns the meta object for the containment reference '{@link FmiModel.FmiModelDescriptionType#getDefaultExperiment <em>Default Experiment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Default Experiment</em>'.
	 * @see FmiModel.FmiModelDescriptionType#getDefaultExperiment()
	 * @see #getFmiModelDescriptionType()
	 * @generated
	 */
	EReference getFmiModelDescriptionType_DefaultExperiment();

	/**
	 * Returns the meta object for the containment reference '{@link FmiModel.FmiModelDescriptionType#getVendorAnnotations <em>Vendor Annotations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Vendor Annotations</em>'.
	 * @see FmiModel.FmiModelDescriptionType#getVendorAnnotations()
	 * @see #getFmiModelDescriptionType()
	 * @generated
	 */
	EReference getFmiModelDescriptionType_VendorAnnotations();

	/**
	 * Returns the meta object for the containment reference '{@link FmiModel.FmiModelDescriptionType#getModelVariables <em>Model Variables</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Model Variables</em>'.
	 * @see FmiModel.FmiModelDescriptionType#getModelVariables()
	 * @see #getFmiModelDescriptionType()
	 * @generated
	 */
	EReference getFmiModelDescriptionType_ModelVariables();

	/**
	 * Returns the meta object for the containment reference '{@link FmiModel.FmiModelDescriptionType#getModelStructure <em>Model Structure</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Model Structure</em>'.
	 * @see FmiModel.FmiModelDescriptionType#getModelStructure()
	 * @see #getFmiModelDescriptionType()
	 * @generated
	 */
	EReference getFmiModelDescriptionType_ModelStructure();

	/**
	 * Returns the meta object for the containment reference '{@link FmiModel.FmiModelDescriptionType#getImplementation <em>Implementation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Implementation</em>'.
	 * @see FmiModel.FmiModelDescriptionType#getImplementation()
	 * @see #getFmiModelDescriptionType()
	 * @generated
	 */
	EReference getFmiModelDescriptionType_Implementation();

	/**
	 * Returns the meta object for the attribute '{@link FmiModel.FmiModelDescriptionType#getAuthor <em>Author</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Author</em>'.
	 * @see FmiModel.FmiModelDescriptionType#getAuthor()
	 * @see #getFmiModelDescriptionType()
	 * @generated
	 */
	EAttribute getFmiModelDescriptionType_Author();

	/**
	 * Returns the meta object for the attribute '{@link FmiModel.FmiModelDescriptionType#getCopyright <em>Copyright</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Copyright</em>'.
	 * @see FmiModel.FmiModelDescriptionType#getCopyright()
	 * @see #getFmiModelDescriptionType()
	 * @generated
	 */
	EAttribute getFmiModelDescriptionType_Copyright();

	/**
	 * Returns the meta object for the attribute '{@link FmiModel.FmiModelDescriptionType#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see FmiModel.FmiModelDescriptionType#getDescription()
	 * @see #getFmiModelDescriptionType()
	 * @generated
	 */
	EAttribute getFmiModelDescriptionType_Description();

	/**
	 * Returns the meta object for the attribute '{@link FmiModel.FmiModelDescriptionType#getFmiVersion <em>Fmi Version</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Fmi Version</em>'.
	 * @see FmiModel.FmiModelDescriptionType#getFmiVersion()
	 * @see #getFmiModelDescriptionType()
	 * @generated
	 */
	EAttribute getFmiModelDescriptionType_FmiVersion();

	/**
	 * Returns the meta object for the attribute '{@link FmiModel.FmiModelDescriptionType#getGenerationDateAndTime <em>Generation Date And Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Generation Date And Time</em>'.
	 * @see FmiModel.FmiModelDescriptionType#getGenerationDateAndTime()
	 * @see #getFmiModelDescriptionType()
	 * @generated
	 */
	EAttribute getFmiModelDescriptionType_GenerationDateAndTime();

	/**
	 * Returns the meta object for the attribute '{@link FmiModel.FmiModelDescriptionType#getGenerationTool <em>Generation Tool</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Generation Tool</em>'.
	 * @see FmiModel.FmiModelDescriptionType#getGenerationTool()
	 * @see #getFmiModelDescriptionType()
	 * @generated
	 */
	EAttribute getFmiModelDescriptionType_GenerationTool();

	/**
	 * Returns the meta object for the attribute '{@link FmiModel.FmiModelDescriptionType#getGuid <em>Guid</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Guid</em>'.
	 * @see FmiModel.FmiModelDescriptionType#getGuid()
	 * @see #getFmiModelDescriptionType()
	 * @generated
	 */
	EAttribute getFmiModelDescriptionType_Guid();

	/**
	 * Returns the meta object for the attribute '{@link FmiModel.FmiModelDescriptionType#getLicense <em>License</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>License</em>'.
	 * @see FmiModel.FmiModelDescriptionType#getLicense()
	 * @see #getFmiModelDescriptionType()
	 * @generated
	 */
	EAttribute getFmiModelDescriptionType_License();

	/**
	 * Returns the meta object for the attribute '{@link FmiModel.FmiModelDescriptionType#getModelName <em>Model Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Model Name</em>'.
	 * @see FmiModel.FmiModelDescriptionType#getModelName()
	 * @see #getFmiModelDescriptionType()
	 * @generated
	 */
	EAttribute getFmiModelDescriptionType_ModelName();

	/**
	 * Returns the meta object for the attribute '{@link FmiModel.FmiModelDescriptionType#getNumberOfEventIndicators <em>Number Of Event Indicators</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Number Of Event Indicators</em>'.
	 * @see FmiModel.FmiModelDescriptionType#getNumberOfEventIndicators()
	 * @see #getFmiModelDescriptionType()
	 * @generated
	 */
	EAttribute getFmiModelDescriptionType_NumberOfEventIndicators();

	/**
	 * Returns the meta object for the attribute '{@link FmiModel.FmiModelDescriptionType#getVariableNamingConvention <em>Variable Naming Convention</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Variable Naming Convention</em>'.
	 * @see FmiModel.FmiModelDescriptionType#getVariableNamingConvention()
	 * @see #getFmiModelDescriptionType()
	 * @generated
	 */
	EAttribute getFmiModelDescriptionType_VariableNamingConvention();

	/**
	 * Returns the meta object for the attribute '{@link FmiModel.FmiModelDescriptionType#getVersion <em>Version</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Version</em>'.
	 * @see FmiModel.FmiModelDescriptionType#getVersion()
	 * @see #getFmiModelDescriptionType()
	 * @generated
	 */
	EAttribute getFmiModelDescriptionType_Version();

	/**
	 * Returns the meta object for the attribute '{@link FmiModel.FmiModelDescriptionType#getModelIdentifier <em>Model Identifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Model Identifier</em>'.
	 * @see FmiModel.FmiModelDescriptionType#getModelIdentifier()
	 * @see #getFmiModelDescriptionType()
	 * @generated
	 */
	EAttribute getFmiModelDescriptionType_ModelIdentifier();

	/**
	 * Returns the meta object for the attribute '{@link FmiModel.FmiModelDescriptionType#getNumberOfContinuousStates <em>Number Of Continuous States</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Number Of Continuous States</em>'.
	 * @see FmiModel.FmiModelDescriptionType#getNumberOfContinuousStates()
	 * @see #getFmiModelDescriptionType()
	 * @generated
	 */
	EAttribute getFmiModelDescriptionType_NumberOfContinuousStates();

	/**
	 * Returns the meta object for class '{@link FmiModel.FmiScalarVariable <em>Fmi Scalar Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Fmi Scalar Variable</em>'.
	 * @see FmiModel.FmiScalarVariable
	 * @generated
	 */
	EClass getFmiScalarVariable();

	/**
	 * Returns the meta object for the containment reference '{@link FmiModel.FmiScalarVariable#getReal <em>Real</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Real</em>'.
	 * @see FmiModel.FmiScalarVariable#getReal()
	 * @see #getFmiScalarVariable()
	 * @generated
	 */
	EReference getFmiScalarVariable_Real();

	/**
	 * Returns the meta object for the containment reference '{@link FmiModel.FmiScalarVariable#getInteger <em>Integer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Integer</em>'.
	 * @see FmiModel.FmiScalarVariable#getInteger()
	 * @see #getFmiScalarVariable()
	 * @generated
	 */
	EReference getFmiScalarVariable_Integer();

	/**
	 * Returns the meta object for the containment reference '{@link FmiModel.FmiScalarVariable#getBoolean <em>Boolean</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Boolean</em>'.
	 * @see FmiModel.FmiScalarVariable#getBoolean()
	 * @see #getFmiScalarVariable()
	 * @generated
	 */
	EReference getFmiScalarVariable_Boolean();

	/**
	 * Returns the meta object for the containment reference '{@link FmiModel.FmiScalarVariable#getString <em>String</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>String</em>'.
	 * @see FmiModel.FmiScalarVariable#getString()
	 * @see #getFmiScalarVariable()
	 * @generated
	 */
	EReference getFmiScalarVariable_String();

	/**
	 * Returns the meta object for the containment reference '{@link FmiModel.FmiScalarVariable#getEnumeration <em>Enumeration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Enumeration</em>'.
	 * @see FmiModel.FmiScalarVariable#getEnumeration()
	 * @see #getFmiScalarVariable()
	 * @generated
	 */
	EReference getFmiScalarVariable_Enumeration();

	/**
	 * Returns the meta object for the containment reference '{@link FmiModel.FmiScalarVariable#getAnnotations <em>Annotations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Annotations</em>'.
	 * @see FmiModel.FmiScalarVariable#getAnnotations()
	 * @see #getFmiScalarVariable()
	 * @generated
	 */
	EReference getFmiScalarVariable_Annotations();

	/**
	 * Returns the meta object for the attribute '{@link FmiModel.FmiScalarVariable#getCausality <em>Causality</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Causality</em>'.
	 * @see FmiModel.FmiScalarVariable#getCausality()
	 * @see #getFmiScalarVariable()
	 * @generated
	 */
	EAttribute getFmiScalarVariable_Causality();

	/**
	 * Returns the meta object for the attribute '{@link FmiModel.FmiScalarVariable#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see FmiModel.FmiScalarVariable#getDescription()
	 * @see #getFmiScalarVariable()
	 * @generated
	 */
	EAttribute getFmiScalarVariable_Description();

	/**
	 * Returns the meta object for the attribute '{@link FmiModel.FmiScalarVariable#getInitial <em>Initial</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Initial</em>'.
	 * @see FmiModel.FmiScalarVariable#getInitial()
	 * @see #getFmiScalarVariable()
	 * @generated
	 */
	EAttribute getFmiScalarVariable_Initial();

	/**
	 * Returns the meta object for the attribute '{@link FmiModel.FmiScalarVariable#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see FmiModel.FmiScalarVariable#getName()
	 * @see #getFmiScalarVariable()
	 * @generated
	 */
	EAttribute getFmiScalarVariable_Name();

	/**
	 * Returns the meta object for the attribute '{@link FmiModel.FmiScalarVariable#getValueReference <em>Value Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value Reference</em>'.
	 * @see FmiModel.FmiScalarVariable#getValueReference()
	 * @see #getFmiScalarVariable()
	 * @generated
	 */
	EAttribute getFmiScalarVariable_ValueReference();

	/**
	 * Returns the meta object for the attribute '{@link FmiModel.FmiScalarVariable#getVariability <em>Variability</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Variability</em>'.
	 * @see FmiModel.FmiScalarVariable#getVariability()
	 * @see #getFmiScalarVariable()
	 * @generated
	 */
	EAttribute getFmiScalarVariable_Variability();

	/**
	 * Returns the meta object for class '{@link FmiModel.FmiSimpleType <em>Fmi Simple Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Fmi Simple Type</em>'.
	 * @see FmiModel.FmiSimpleType
	 * @generated
	 */
	EClass getFmiSimpleType();

	/**
	 * Returns the meta object for the containment reference '{@link FmiModel.FmiSimpleType#getReal <em>Real</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Real</em>'.
	 * @see FmiModel.FmiSimpleType#getReal()
	 * @see #getFmiSimpleType()
	 * @generated
	 */
	EReference getFmiSimpleType_Real();

	/**
	 * Returns the meta object for the containment reference '{@link FmiModel.FmiSimpleType#getInteger <em>Integer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Integer</em>'.
	 * @see FmiModel.FmiSimpleType#getInteger()
	 * @see #getFmiSimpleType()
	 * @generated
	 */
	EReference getFmiSimpleType_Integer();

	/**
	 * Returns the meta object for the containment reference '{@link FmiModel.FmiSimpleType#getBoolean <em>Boolean</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Boolean</em>'.
	 * @see FmiModel.FmiSimpleType#getBoolean()
	 * @see #getFmiSimpleType()
	 * @generated
	 */
	EReference getFmiSimpleType_Boolean();

	/**
	 * Returns the meta object for the containment reference '{@link FmiModel.FmiSimpleType#getString <em>String</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>String</em>'.
	 * @see FmiModel.FmiSimpleType#getString()
	 * @see #getFmiSimpleType()
	 * @generated
	 */
	EReference getFmiSimpleType_String();

	/**
	 * Returns the meta object for the containment reference '{@link FmiModel.FmiSimpleType#getEnumeration <em>Enumeration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Enumeration</em>'.
	 * @see FmiModel.FmiSimpleType#getEnumeration()
	 * @see #getFmiSimpleType()
	 * @generated
	 */
	EReference getFmiSimpleType_Enumeration();

	/**
	 * Returns the meta object for the attribute '{@link FmiModel.FmiSimpleType#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see FmiModel.FmiSimpleType#getDescription()
	 * @see #getFmiSimpleType()
	 * @generated
	 */
	EAttribute getFmiSimpleType_Description();

	/**
	 * Returns the meta object for the attribute '{@link FmiModel.FmiSimpleType#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see FmiModel.FmiSimpleType#getName()
	 * @see #getFmiSimpleType()
	 * @generated
	 */
	EAttribute getFmiSimpleType_Name();

	/**
	 * Returns the meta object for class '{@link FmiModel.FmiUnit <em>Fmi Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Fmi Unit</em>'.
	 * @see FmiModel.FmiUnit
	 * @generated
	 */
	EClass getFmiUnit();

	/**
	 * Returns the meta object for the containment reference '{@link FmiModel.FmiUnit#getBaseUnit <em>Base Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Base Unit</em>'.
	 * @see FmiModel.FmiUnit#getBaseUnit()
	 * @see #getFmiUnit()
	 * @generated
	 */
	EReference getFmiUnit_BaseUnit();

	/**
	 * Returns the meta object for the attribute list '{@link FmiModel.FmiUnit#getGroup <em>Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Group</em>'.
	 * @see FmiModel.FmiUnit#getGroup()
	 * @see #getFmiUnit()
	 * @generated
	 */
	EAttribute getFmiUnit_Group();

	/**
	 * Returns the meta object for the containment reference list '{@link FmiModel.FmiUnit#getDisplayUnit <em>Display Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Display Unit</em>'.
	 * @see FmiModel.FmiUnit#getDisplayUnit()
	 * @see #getFmiUnit()
	 * @generated
	 */
	EReference getFmiUnit_DisplayUnit();

	/**
	 * Returns the meta object for the attribute '{@link FmiModel.FmiUnit#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see FmiModel.FmiUnit#getName()
	 * @see #getFmiUnit()
	 * @generated
	 */
	EAttribute getFmiUnit_Name();

	/**
	 * Returns the meta object for class '{@link FmiModel.FmiVariableDependency <em>Fmi Variable Dependency</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Fmi Variable Dependency</em>'.
	 * @see FmiModel.FmiVariableDependency
	 * @generated
	 */
	EClass getFmiVariableDependency();

	/**
	 * Returns the meta object for the attribute '{@link FmiModel.FmiVariableDependency#getInputDependencies <em>Input Dependencies</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Input Dependencies</em>'.
	 * @see FmiModel.FmiVariableDependency#getInputDependencies()
	 * @see #getFmiVariableDependency()
	 * @generated
	 */
	EAttribute getFmiVariableDependency_InputDependencies();

	/**
	 * Returns the meta object for the attribute '{@link FmiModel.FmiVariableDependency#getInputFactorKinds <em>Input Factor Kinds</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Input Factor Kinds</em>'.
	 * @see FmiModel.FmiVariableDependency#getInputFactorKinds()
	 * @see #getFmiVariableDependency()
	 * @generated
	 */
	EAttribute getFmiVariableDependency_InputFactorKinds();

	/**
	 * Returns the meta object for the attribute '{@link FmiModel.FmiVariableDependency#getStateDependencies <em>State Dependencies</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>State Dependencies</em>'.
	 * @see FmiModel.FmiVariableDependency#getStateDependencies()
	 * @see #getFmiVariableDependency()
	 * @generated
	 */
	EAttribute getFmiVariableDependency_StateDependencies();

	/**
	 * Returns the meta object for the attribute '{@link FmiModel.FmiVariableDependency#getStateFactorKinds <em>State Factor Kinds</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>State Factor Kinds</em>'.
	 * @see FmiModel.FmiVariableDependency#getStateFactorKinds()
	 * @see #getFmiVariableDependency()
	 * @generated
	 */
	EAttribute getFmiVariableDependency_StateFactorKinds();

	/**
	 * Returns the meta object for class '{@link FmiModel.InputsType <em>Inputs Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Inputs Type</em>'.
	 * @see FmiModel.InputsType
	 * @generated
	 */
	EClass getInputsType();

	/**
	 * Returns the meta object for the attribute list '{@link FmiModel.InputsType#getGroup <em>Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Group</em>'.
	 * @see FmiModel.InputsType#getGroup()
	 * @see #getInputsType()
	 * @generated
	 */
	EAttribute getInputsType_Group();

	/**
	 * Returns the meta object for the containment reference list '{@link FmiModel.InputsType#getInput <em>Input</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Input</em>'.
	 * @see FmiModel.InputsType#getInput()
	 * @see #getInputsType()
	 * @generated
	 */
	EReference getInputsType_Input();

	/**
	 * Returns the meta object for class '{@link FmiModel.InputType <em>Input Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Input Type</em>'.
	 * @see FmiModel.InputType
	 * @generated
	 */
	EClass getInputType();

	/**
	 * Returns the meta object for the attribute '{@link FmiModel.InputType#getDerivative <em>Derivative</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Derivative</em>'.
	 * @see FmiModel.InputType#getDerivative()
	 * @see #getInputType()
	 * @generated
	 */
	EAttribute getInputType_Derivative();

	/**
	 * Returns the meta object for the attribute '{@link FmiModel.InputType#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see FmiModel.InputType#getName()
	 * @see #getInputType()
	 * @generated
	 */
	EAttribute getInputType_Name();

	/**
	 * Returns the meta object for class '{@link FmiModel.IntegerType <em>Integer Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Integer Type</em>'.
	 * @see FmiModel.IntegerType
	 * @generated
	 */
	EClass getIntegerType();

	/**
	 * Returns the meta object for the attribute '{@link FmiModel.IntegerType#getDeclaredType <em>Declared Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Declared Type</em>'.
	 * @see FmiModel.IntegerType#getDeclaredType()
	 * @see #getIntegerType()
	 * @generated
	 */
	EAttribute getIntegerType_DeclaredType();

	/**
	 * Returns the meta object for the attribute '{@link FmiModel.IntegerType#getMax <em>Max</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Max</em>'.
	 * @see FmiModel.IntegerType#getMax()
	 * @see #getIntegerType()
	 * @generated
	 */
	EAttribute getIntegerType_Max();

	/**
	 * Returns the meta object for the attribute '{@link FmiModel.IntegerType#getMin <em>Min</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Min</em>'.
	 * @see FmiModel.IntegerType#getMin()
	 * @see #getIntegerType()
	 * @generated
	 */
	EAttribute getIntegerType_Min();

	/**
	 * Returns the meta object for the attribute '{@link FmiModel.IntegerType#getQuantity <em>Quantity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Quantity</em>'.
	 * @see FmiModel.IntegerType#getQuantity()
	 * @see #getIntegerType()
	 * @generated
	 */
	EAttribute getIntegerType_Quantity();

	/**
	 * Returns the meta object for the attribute '{@link FmiModel.IntegerType#getStart <em>Start</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Start</em>'.
	 * @see FmiModel.IntegerType#getStart()
	 * @see #getIntegerType()
	 * @generated
	 */
	EAttribute getIntegerType_Start();

	/**
	 * Returns the meta object for class '{@link FmiModel.IntegerType1 <em>Integer Type1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Integer Type1</em>'.
	 * @see FmiModel.IntegerType1
	 * @generated
	 */
	EClass getIntegerType1();

	/**
	 * Returns the meta object for the attribute '{@link FmiModel.IntegerType1#getMax <em>Max</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Max</em>'.
	 * @see FmiModel.IntegerType1#getMax()
	 * @see #getIntegerType1()
	 * @generated
	 */
	EAttribute getIntegerType1_Max();

	/**
	 * Returns the meta object for the attribute '{@link FmiModel.IntegerType1#getMin <em>Min</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Min</em>'.
	 * @see FmiModel.IntegerType1#getMin()
	 * @see #getIntegerType1()
	 * @generated
	 */
	EAttribute getIntegerType1_Min();

	/**
	 * Returns the meta object for the attribute '{@link FmiModel.IntegerType1#getQuantity <em>Quantity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Quantity</em>'.
	 * @see FmiModel.IntegerType1#getQuantity()
	 * @see #getIntegerType1()
	 * @generated
	 */
	EAttribute getIntegerType1_Quantity();

	/**
	 * Returns the meta object for class '{@link FmiModel.ItemType <em>Item Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Item Type</em>'.
	 * @see FmiModel.ItemType
	 * @generated
	 */
	EClass getItemType();

	/**
	 * Returns the meta object for the attribute '{@link FmiModel.ItemType#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see FmiModel.ItemType#getDescription()
	 * @see #getItemType()
	 * @generated
	 */
	EAttribute getItemType_Description();

	/**
	 * Returns the meta object for the attribute '{@link FmiModel.ItemType#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see FmiModel.ItemType#getName()
	 * @see #getItemType()
	 * @generated
	 */
	EAttribute getItemType_Name();

	/**
	 * Returns the meta object for the attribute '{@link FmiModel.ItemType#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see FmiModel.ItemType#getValue()
	 * @see #getItemType()
	 * @generated
	 */
	EAttribute getItemType_Value();

	/**
	 * Returns the meta object for class '{@link FmiModel.LogCategoriesType <em>Log Categories Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Log Categories Type</em>'.
	 * @see FmiModel.LogCategoriesType
	 * @generated
	 */
	EClass getLogCategoriesType();

	/**
	 * Returns the meta object for the attribute list '{@link FmiModel.LogCategoriesType#getGroup <em>Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Group</em>'.
	 * @see FmiModel.LogCategoriesType#getGroup()
	 * @see #getLogCategoriesType()
	 * @generated
	 */
	EAttribute getLogCategoriesType_Group();

	/**
	 * Returns the meta object for the containment reference list '{@link FmiModel.LogCategoriesType#getCategory <em>Category</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Category</em>'.
	 * @see FmiModel.LogCategoriesType#getCategory()
	 * @see #getLogCategoriesType()
	 * @generated
	 */
	EReference getLogCategoriesType_Category();

	/**
	 * Returns the meta object for class '{@link FmiModel.ModelExchangeType <em>Model Exchange Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Model Exchange Type</em>'.
	 * @see FmiModel.ModelExchangeType
	 * @generated
	 */
	EClass getModelExchangeType();

	/**
	 * Returns the meta object for the attribute '{@link FmiModel.ModelExchangeType#isCanBeInstantiatedOnlyOncePerProcess <em>Can Be Instantiated Only Once Per Process</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Can Be Instantiated Only Once Per Process</em>'.
	 * @see FmiModel.ModelExchangeType#isCanBeInstantiatedOnlyOncePerProcess()
	 * @see #getModelExchangeType()
	 * @generated
	 */
	EAttribute getModelExchangeType_CanBeInstantiatedOnlyOncePerProcess();

	/**
	 * Returns the meta object for the attribute '{@link FmiModel.ModelExchangeType#isCanGetAndSetFMUstate <em>Can Get And Set FM Ustate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Can Get And Set FM Ustate</em>'.
	 * @see FmiModel.ModelExchangeType#isCanGetAndSetFMUstate()
	 * @see #getModelExchangeType()
	 * @generated
	 */
	EAttribute getModelExchangeType_CanGetAndSetFMUstate();

	/**
	 * Returns the meta object for the attribute '{@link FmiModel.ModelExchangeType#isCanNotUseMemoryManagementFunctions <em>Can Not Use Memory Management Functions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Can Not Use Memory Management Functions</em>'.
	 * @see FmiModel.ModelExchangeType#isCanNotUseMemoryManagementFunctions()
	 * @see #getModelExchangeType()
	 * @generated
	 */
	EAttribute getModelExchangeType_CanNotUseMemoryManagementFunctions();

	/**
	 * Returns the meta object for the attribute '{@link FmiModel.ModelExchangeType#isCanSerializeFMUstate <em>Can Serialize FM Ustate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Can Serialize FM Ustate</em>'.
	 * @see FmiModel.ModelExchangeType#isCanSerializeFMUstate()
	 * @see #getModelExchangeType()
	 * @generated
	 */
	EAttribute getModelExchangeType_CanSerializeFMUstate();

	/**
	 * Returns the meta object for the attribute '{@link FmiModel.ModelExchangeType#isCompletedIntegratorStepNotNeeded <em>Completed Integrator Step Not Needed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Completed Integrator Step Not Needed</em>'.
	 * @see FmiModel.ModelExchangeType#isCompletedIntegratorStepNotNeeded()
	 * @see #getModelExchangeType()
	 * @generated
	 */
	EAttribute getModelExchangeType_CompletedIntegratorStepNotNeeded();

	/**
	 * Returns the meta object for the attribute '{@link FmiModel.ModelExchangeType#getModelIdentifier <em>Model Identifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Model Identifier</em>'.
	 * @see FmiModel.ModelExchangeType#getModelIdentifier()
	 * @see #getModelExchangeType()
	 * @generated
	 */
	EAttribute getModelExchangeType_ModelIdentifier();

	/**
	 * Returns the meta object for the attribute '{@link FmiModel.ModelExchangeType#isNeedsExecutionTool <em>Needs Execution Tool</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Needs Execution Tool</em>'.
	 * @see FmiModel.ModelExchangeType#isNeedsExecutionTool()
	 * @see #getModelExchangeType()
	 * @generated
	 */
	EAttribute getModelExchangeType_NeedsExecutionTool();

	/**
	 * Returns the meta object for the attribute '{@link FmiModel.ModelExchangeType#isProvidesDirectionalDerivatives <em>Provides Directional Derivatives</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Provides Directional Derivatives</em>'.
	 * @see FmiModel.ModelExchangeType#isProvidesDirectionalDerivatives()
	 * @see #getModelExchangeType()
	 * @generated
	 */
	EAttribute getModelExchangeType_ProvidesDirectionalDerivatives();

	/**
	 * Returns the meta object for the attribute '{@link FmiModel.ModelExchangeType#isProvidesPartialDerivativesOfDerivativeFunctionWrtInputs <em>Provides Partial Derivatives Of Derivative Function Wrt Inputs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Provides Partial Derivatives Of Derivative Function Wrt Inputs</em>'.
	 * @see FmiModel.ModelExchangeType#isProvidesPartialDerivativesOfDerivativeFunctionWrtInputs()
	 * @see #getModelExchangeType()
	 * @generated
	 */
	EAttribute getModelExchangeType_ProvidesPartialDerivativesOfDerivativeFunctionWrtInputs();

	/**
	 * Returns the meta object for the attribute '{@link FmiModel.ModelExchangeType#isProvidesPartialDerivativesOfDerivativeFunctionWrtStates <em>Provides Partial Derivatives Of Derivative Function Wrt States</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Provides Partial Derivatives Of Derivative Function Wrt States</em>'.
	 * @see FmiModel.ModelExchangeType#isProvidesPartialDerivativesOfDerivativeFunctionWrtStates()
	 * @see #getModelExchangeType()
	 * @generated
	 */
	EAttribute getModelExchangeType_ProvidesPartialDerivativesOfDerivativeFunctionWrtStates();

	/**
	 * Returns the meta object for the attribute '{@link FmiModel.ModelExchangeType#isProvidesPartialDerivativesOfOutputFunctionWrtInputs <em>Provides Partial Derivatives Of Output Function Wrt Inputs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Provides Partial Derivatives Of Output Function Wrt Inputs</em>'.
	 * @see FmiModel.ModelExchangeType#isProvidesPartialDerivativesOfOutputFunctionWrtInputs()
	 * @see #getModelExchangeType()
	 * @generated
	 */
	EAttribute getModelExchangeType_ProvidesPartialDerivativesOfOutputFunctionWrtInputs();

	/**
	 * Returns the meta object for the attribute '{@link FmiModel.ModelExchangeType#isProvidesPartialDerivativesOfOutputFunctionWrtStates <em>Provides Partial Derivatives Of Output Function Wrt States</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Provides Partial Derivatives Of Output Function Wrt States</em>'.
	 * @see FmiModel.ModelExchangeType#isProvidesPartialDerivativesOfOutputFunctionWrtStates()
	 * @see #getModelExchangeType()
	 * @generated
	 */
	EAttribute getModelExchangeType_ProvidesPartialDerivativesOfOutputFunctionWrtStates();

	/**
	 * Returns the meta object for class '{@link FmiModel.ModelStructureType <em>Model Structure Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Model Structure Type</em>'.
	 * @see FmiModel.ModelStructureType
	 * @generated
	 */
	EClass getModelStructureType();

	/**
	 * Returns the meta object for the containment reference '{@link FmiModel.ModelStructureType#getInputs <em>Inputs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Inputs</em>'.
	 * @see FmiModel.ModelStructureType#getInputs()
	 * @see #getModelStructureType()
	 * @generated
	 */
	EReference getModelStructureType_Inputs();

	/**
	 * Returns the meta object for the containment reference '{@link FmiModel.ModelStructureType#getDerivatives <em>Derivatives</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Derivatives</em>'.
	 * @see FmiModel.ModelStructureType#getDerivatives()
	 * @see #getModelStructureType()
	 * @generated
	 */
	EReference getModelStructureType_Derivatives();

	/**
	 * Returns the meta object for the containment reference '{@link FmiModel.ModelStructureType#getOutputs <em>Outputs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Outputs</em>'.
	 * @see FmiModel.ModelStructureType#getOutputs()
	 * @see #getModelStructureType()
	 * @generated
	 */
	EReference getModelStructureType_Outputs();

	/**
	 * Returns the meta object for class '{@link FmiModel.ModelVariablesType <em>Model Variables Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Model Variables Type</em>'.
	 * @see FmiModel.ModelVariablesType
	 * @generated
	 */
	EClass getModelVariablesType();

	/**
	 * Returns the meta object for the attribute list '{@link FmiModel.ModelVariablesType#getGroup <em>Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Group</em>'.
	 * @see FmiModel.ModelVariablesType#getGroup()
	 * @see #getModelVariablesType()
	 * @generated
	 */
	EAttribute getModelVariablesType_Group();

	/**
	 * Returns the meta object for the containment reference list '{@link FmiModel.ModelVariablesType#getScalarVariable <em>Scalar Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Scalar Variable</em>'.
	 * @see FmiModel.ModelVariablesType#getScalarVariable()
	 * @see #getModelVariablesType()
	 * @generated
	 */
	EReference getModelVariablesType_ScalarVariable();

	/**
	 * Returns the meta object for class '{@link FmiModel.OutputType <em>Output Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Output Type</em>'.
	 * @see FmiModel.OutputType
	 * @generated
	 */
	EClass getOutputType();

	/**
	 * Returns the meta object for the attribute '{@link FmiModel.OutputType#getDerivative <em>Derivative</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Derivative</em>'.
	 * @see FmiModel.OutputType#getDerivative()
	 * @see #getOutputType()
	 * @generated
	 */
	EAttribute getOutputType_Derivative();

	/**
	 * Returns the meta object for the attribute '{@link FmiModel.OutputType#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see FmiModel.OutputType#getName()
	 * @see #getOutputType()
	 * @generated
	 */
	EAttribute getOutputType_Name();

	/**
	 * Returns the meta object for class '{@link FmiModel.RealType <em>Real Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Real Type</em>'.
	 * @see FmiModel.RealType
	 * @generated
	 */
	EClass getRealType();

	/**
	 * Returns the meta object for the attribute '{@link FmiModel.RealType#getDisplayUnit <em>Display Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Display Unit</em>'.
	 * @see FmiModel.RealType#getDisplayUnit()
	 * @see #getRealType()
	 * @generated
	 */
	EAttribute getRealType_DisplayUnit();

	/**
	 * Returns the meta object for the attribute '{@link FmiModel.RealType#getMax <em>Max</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Max</em>'.
	 * @see FmiModel.RealType#getMax()
	 * @see #getRealType()
	 * @generated
	 */
	EAttribute getRealType_Max();

	/**
	 * Returns the meta object for the attribute '{@link FmiModel.RealType#getMin <em>Min</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Min</em>'.
	 * @see FmiModel.RealType#getMin()
	 * @see #getRealType()
	 * @generated
	 */
	EAttribute getRealType_Min();

	/**
	 * Returns the meta object for the attribute '{@link FmiModel.RealType#getNominal <em>Nominal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nominal</em>'.
	 * @see FmiModel.RealType#getNominal()
	 * @see #getRealType()
	 * @generated
	 */
	EAttribute getRealType_Nominal();

	/**
	 * Returns the meta object for the attribute '{@link FmiModel.RealType#getQuantity <em>Quantity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Quantity</em>'.
	 * @see FmiModel.RealType#getQuantity()
	 * @see #getRealType()
	 * @generated
	 */
	EAttribute getRealType_Quantity();

	/**
	 * Returns the meta object for the attribute '{@link FmiModel.RealType#isRelativeQuantity <em>Relative Quantity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Relative Quantity</em>'.
	 * @see FmiModel.RealType#isRelativeQuantity()
	 * @see #getRealType()
	 * @generated
	 */
	EAttribute getRealType_RelativeQuantity();

	/**
	 * Returns the meta object for the attribute '{@link FmiModel.RealType#isUnbounded <em>Unbounded</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Unbounded</em>'.
	 * @see FmiModel.RealType#isUnbounded()
	 * @see #getRealType()
	 * @generated
	 */
	EAttribute getRealType_Unbounded();

	/**
	 * Returns the meta object for the attribute '{@link FmiModel.RealType#getUnit <em>Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Unit</em>'.
	 * @see FmiModel.RealType#getUnit()
	 * @see #getRealType()
	 * @generated
	 */
	EAttribute getRealType_Unit();

	/**
	 * Returns the meta object for class '{@link FmiModel.ToolType <em>Tool Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Tool Type</em>'.
	 * @see FmiModel.ToolType
	 * @generated
	 */
	EClass getToolType();

	/**
	 * Returns the meta object for the attribute list '{@link FmiModel.ToolType#getAny <em>Any</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Any</em>'.
	 * @see FmiModel.ToolType#getAny()
	 * @see #getToolType()
	 * @generated
	 */
	EAttribute getToolType_Any();

	/**
	 * Returns the meta object for the attribute '{@link FmiModel.ToolType#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see FmiModel.ToolType#getName()
	 * @see #getToolType()
	 * @generated
	 */
	EAttribute getToolType_Name();

	/**
	 * Returns the meta object for class '{@link FmiModel.DocumentRoot <em>Document Root</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Document Root</em>'.
	 * @see FmiModel.DocumentRoot
	 * @generated
	 */
	EClass getDocumentRoot();

	/**
	 * Returns the meta object for the attribute list '{@link FmiModel.DocumentRoot#getMixed <em>Mixed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Mixed</em>'.
	 * @see FmiModel.DocumentRoot#getMixed()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_Mixed();

	/**
	 * Returns the meta object for the map '{@link FmiModel.DocumentRoot#getXMLNSPrefixMap <em>XMLNS Prefix Map</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the map '<em>XMLNS Prefix Map</em>'.
	 * @see FmiModel.DocumentRoot#getXMLNSPrefixMap()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_XMLNSPrefixMap();

	/**
	 * Returns the meta object for the map '{@link FmiModel.DocumentRoot#getXSISchemaLocation <em>XSI Schema Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the map '<em>XSI Schema Location</em>'.
	 * @see FmiModel.DocumentRoot#getXSISchemaLocation()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_XSISchemaLocation();

	/**
	 * Returns the meta object for the containment reference '{@link FmiModel.DocumentRoot#getFmiModelDescription <em>Fmi Model Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Fmi Model Description</em>'.
	 * @see FmiModel.DocumentRoot#getFmiModelDescription()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_FmiModelDescription();

	/**
	 * Returns the meta object for class '{@link FmiModel.OutputsType <em>Outputs Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Outputs Type</em>'.
	 * @see FmiModel.OutputsType
	 * @generated
	 */
	EClass getOutputsType();

	/**
	 * Returns the meta object for the attribute list '{@link FmiModel.OutputsType#getGroup <em>Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Group</em>'.
	 * @see FmiModel.OutputsType#getGroup()
	 * @see #getOutputsType()
	 * @generated
	 */
	EAttribute getOutputsType_Group();

	/**
	 * Returns the meta object for the containment reference list '{@link FmiModel.OutputsType#getOutput <em>Output</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Output</em>'.
	 * @see FmiModel.OutputsType#getOutput()
	 * @see #getOutputsType()
	 * @generated
	 */
	EReference getOutputsType_Output();

	/**
	 * Returns the meta object for class '{@link FmiModel.RealType1 <em>Real Type1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Real Type1</em>'.
	 * @see FmiModel.RealType1
	 * @generated
	 */
	EClass getRealType1();

	/**
	 * Returns the meta object for the attribute '{@link FmiModel.RealType1#getDeclaredType <em>Declared Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Declared Type</em>'.
	 * @see FmiModel.RealType1#getDeclaredType()
	 * @see #getRealType1()
	 * @generated
	 */
	EAttribute getRealType1_DeclaredType();

	/**
	 * Returns the meta object for the attribute '{@link FmiModel.RealType1#getDisplayUnit <em>Display Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Display Unit</em>'.
	 * @see FmiModel.RealType1#getDisplayUnit()
	 * @see #getRealType1()
	 * @generated
	 */
	EAttribute getRealType1_DisplayUnit();

	/**
	 * Returns the meta object for the attribute '{@link FmiModel.RealType1#getMax <em>Max</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Max</em>'.
	 * @see FmiModel.RealType1#getMax()
	 * @see #getRealType1()
	 * @generated
	 */
	EAttribute getRealType1_Max();

	/**
	 * Returns the meta object for the attribute '{@link FmiModel.RealType1#getMin <em>Min</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Min</em>'.
	 * @see FmiModel.RealType1#getMin()
	 * @see #getRealType1()
	 * @generated
	 */
	EAttribute getRealType1_Min();

	/**
	 * Returns the meta object for the attribute '{@link FmiModel.RealType1#getNominal <em>Nominal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nominal</em>'.
	 * @see FmiModel.RealType1#getNominal()
	 * @see #getRealType1()
	 * @generated
	 */
	EAttribute getRealType1_Nominal();

	/**
	 * Returns the meta object for the attribute '{@link FmiModel.RealType1#getQuantity <em>Quantity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Quantity</em>'.
	 * @see FmiModel.RealType1#getQuantity()
	 * @see #getRealType1()
	 * @generated
	 */
	EAttribute getRealType1_Quantity();

	/**
	 * Returns the meta object for the attribute '{@link FmiModel.RealType1#isRelativeQuantity <em>Relative Quantity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Relative Quantity</em>'.
	 * @see FmiModel.RealType1#isRelativeQuantity()
	 * @see #getRealType1()
	 * @generated
	 */
	EAttribute getRealType1_RelativeQuantity();

	/**
	 * Returns the meta object for the attribute '{@link FmiModel.RealType1#getStart <em>Start</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Start</em>'.
	 * @see FmiModel.RealType1#getStart()
	 * @see #getRealType1()
	 * @generated
	 */
	EAttribute getRealType1_Start();

	/**
	 * Returns the meta object for the attribute '{@link FmiModel.RealType1#isUnbounded <em>Unbounded</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Unbounded</em>'.
	 * @see FmiModel.RealType1#isUnbounded()
	 * @see #getRealType1()
	 * @generated
	 */
	EAttribute getRealType1_Unbounded();

	/**
	 * Returns the meta object for the attribute '{@link FmiModel.RealType1#getUnit <em>Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Unit</em>'.
	 * @see FmiModel.RealType1#getUnit()
	 * @see #getRealType1()
	 * @generated
	 */
	EAttribute getRealType1_Unit();

	/**
	 * Returns the meta object for class '{@link FmiModel.StringType <em>String Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>String Type</em>'.
	 * @see FmiModel.StringType
	 * @generated
	 */
	EClass getStringType();

	/**
	 * Returns the meta object for the attribute '{@link FmiModel.StringType#getDeclaredType <em>Declared Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Declared Type</em>'.
	 * @see FmiModel.StringType#getDeclaredType()
	 * @see #getStringType()
	 * @generated
	 */
	EAttribute getStringType_DeclaredType();

	/**
	 * Returns the meta object for the attribute '{@link FmiModel.StringType#getStart <em>Start</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Start</em>'.
	 * @see FmiModel.StringType#getStart()
	 * @see #getStringType()
	 * @generated
	 */
	EAttribute getStringType_Start();

	/**
	 * Returns the meta object for class '{@link FmiModel.TypeDefinitionsType <em>Type Definitions Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Type Definitions Type</em>'.
	 * @see FmiModel.TypeDefinitionsType
	 * @generated
	 */
	EClass getTypeDefinitionsType();

	/**
	 * Returns the meta object for the attribute list '{@link FmiModel.TypeDefinitionsType#getGroup <em>Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Group</em>'.
	 * @see FmiModel.TypeDefinitionsType#getGroup()
	 * @see #getTypeDefinitionsType()
	 * @generated
	 */
	EAttribute getTypeDefinitionsType_Group();

	/**
	 * Returns the meta object for the containment reference list '{@link FmiModel.TypeDefinitionsType#getSimpleType <em>Simple Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Simple Type</em>'.
	 * @see FmiModel.TypeDefinitionsType#getSimpleType()
	 * @see #getTypeDefinitionsType()
	 * @generated
	 */
	EReference getTypeDefinitionsType_SimpleType();

	/**
	 * Returns the meta object for class '{@link FmiModel.UnitDefinitionsType <em>Unit Definitions Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Unit Definitions Type</em>'.
	 * @see FmiModel.UnitDefinitionsType
	 * @generated
	 */
	EClass getUnitDefinitionsType();

	/**
	 * Returns the meta object for the attribute list '{@link FmiModel.UnitDefinitionsType#getGroup <em>Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Group</em>'.
	 * @see FmiModel.UnitDefinitionsType#getGroup()
	 * @see #getUnitDefinitionsType()
	 * @generated
	 */
	EAttribute getUnitDefinitionsType_Group();

	/**
	 * Returns the meta object for the containment reference list '{@link FmiModel.UnitDefinitionsType#getUnit <em>Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Unit</em>'.
	 * @see FmiModel.UnitDefinitionsType#getUnit()
	 * @see #getUnitDefinitionsType()
	 * @generated
	 */
	EReference getUnitDefinitionsType_Unit();

	/**
	 * Returns the meta object for class '{@link FmiModel.Implementation <em>Implementation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Implementation</em>'.
	 * @see FmiModel.Implementation
	 * @generated
	 */
	EClass getImplementation();

	/**
	 * Returns the meta object for the reference list '{@link FmiModel.Implementation#getFmiCoSimulationCapabilities <em>Fmi Co Simulation Capabilities</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Fmi Co Simulation Capabilities</em>'.
	 * @see FmiModel.Implementation#getFmiCoSimulationCapabilities()
	 * @see #getImplementation()
	 * @generated
	 */
	EReference getImplementation_FmiCoSimulationCapabilities();

	/**
	 * Returns the meta object for class '{@link FmiModel.FmiCoSimulationCapabilitiesType <em>Fmi Co Simulation Capabilities Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Fmi Co Simulation Capabilities Type</em>'.
	 * @see FmiModel.FmiCoSimulationCapabilitiesType
	 * @generated
	 */
	EClass getFmiCoSimulationCapabilitiesType();

	/**
	 * Returns the meta object for the containment reference list '{@link FmiModel.FmiCoSimulationCapabilitiesType#getCapabilities <em>Capabilities</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Capabilities</em>'.
	 * @see FmiModel.FmiCoSimulationCapabilitiesType#getCapabilities()
	 * @see #getFmiCoSimulationCapabilitiesType()
	 * @generated
	 */
	EReference getFmiCoSimulationCapabilitiesType_Capabilities();

	/**
	 * Returns the meta object for class '{@link FmiModel.CoSimulation_StandAlone <em>Co Simulation Stand Alone</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Co Simulation Stand Alone</em>'.
	 * @see FmiModel.CoSimulation_StandAlone
	 * @generated
	 */
	EClass getCoSimulation_StandAlone();

	/**
	 * Returns the meta object for class '{@link FmiModel.CoSimulation_Tool <em>Co Simulation Tool</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Co Simulation Tool</em>'.
	 * @see FmiModel.CoSimulation_Tool
	 * @generated
	 */
	EClass getCoSimulation_Tool();

	/**
	 * Returns the meta object for enum '{@link FmiModel.CausalityType <em>Causality Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Causality Type</em>'.
	 * @see FmiModel.CausalityType
	 * @generated
	 */
	EEnum getCausalityType();

	/**
	 * Returns the meta object for enum '{@link FmiModel.FmiDependencyFactorKind <em>Fmi Dependency Factor Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Fmi Dependency Factor Kind</em>'.
	 * @see FmiModel.FmiDependencyFactorKind
	 * @generated
	 */
	EEnum getFmiDependencyFactorKind();

	/**
	 * Returns the meta object for enum '{@link FmiModel.InitialType <em>Initial Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Initial Type</em>'.
	 * @see FmiModel.InitialType
	 * @generated
	 */
	EEnum getInitialType();

	/**
	 * Returns the meta object for enum '{@link FmiModel.VariabilityType <em>Variability Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Variability Type</em>'.
	 * @see FmiModel.VariabilityType
	 * @generated
	 */
	EEnum getVariabilityType();

	/**
	 * Returns the meta object for enum '{@link FmiModel.VariableNamingConventionType <em>Variable Naming Convention Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Variable Naming Convention Type</em>'.
	 * @see FmiModel.VariableNamingConventionType
	 * @generated
	 */
	EEnum getVariableNamingConventionType();

	/**
	 * Returns the meta object for data type '{@link FmiModel.CausalityType <em>Causality Type Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Causality Type Object</em>'.
	 * @see FmiModel.CausalityType
	 * @model instanceClass="FmiModel.CausalityType"
	 *        extendedMetaData="name='causality_._type:Object' baseType='causality_._type'"
	 * @generated
	 */
	EDataType getCausalityTypeObject();

	/**
	 * Returns the meta object for data type '{@link FmiModel.FmiDependencyFactorKind <em>Fmi Dependency Factor Kind Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Fmi Dependency Factor Kind Object</em>'.
	 * @see FmiModel.FmiDependencyFactorKind
	 * @model instanceClass="FmiModel.FmiDependencyFactorKind"
	 *        extendedMetaData="name='fmiDependencyFactorKind:Object' baseType='fmiDependencyFactorKind'"
	 * @generated
	 */
	EDataType getFmiDependencyFactorKindObject();

	/**
	 * Returns the meta object for data type '{@link FmiModel.InitialType <em>Initial Type Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Initial Type Object</em>'.
	 * @see FmiModel.InitialType
	 * @model instanceClass="FmiModel.InitialType"
	 *        extendedMetaData="name='initial_._type:Object' baseType='initial_._type'"
	 * @generated
	 */
	EDataType getInitialTypeObject();

	/**
	 * Returns the meta object for data type '{@link java.util.List <em>Input Dependencies Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Input Dependencies Type</em>'.
	 * @see java.util.List
	 * @model instanceClass="java.util.List"
	 *        extendedMetaData="name='inputDependencies_._type' itemType='http://www.eclipse.org/emf/2003/XMLType#int'"
	 * @generated
	 */
	EDataType getInputDependenciesType();

	/**
	 * Returns the meta object for data type '{@link java.util.List <em>Input Factor Kinds Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Input Factor Kinds Type</em>'.
	 * @see java.util.List
	 * @model instanceClass="java.util.List"
	 *        extendedMetaData="name='inputFactorKinds_._type' itemType='fmiDependencyFactorKind'"
	 * @generated
	 */
	EDataType getInputFactorKindsType();

	/**
	 * Returns the meta object for data type '{@link java.util.List <em>State Dependencies Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>State Dependencies Type</em>'.
	 * @see java.util.List
	 * @model instanceClass="java.util.List"
	 *        extendedMetaData="name='stateDependencies_._type' itemType='http://www.eclipse.org/emf/2003/XMLType#int'"
	 * @generated
	 */
	EDataType getStateDependenciesType();

	/**
	 * Returns the meta object for data type '{@link java.util.List <em>State Factor Kinds Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>State Factor Kinds Type</em>'.
	 * @see java.util.List
	 * @model instanceClass="java.util.List"
	 *        extendedMetaData="name='stateFactorKinds_._type' itemType='fmiDependencyFactorKind'"
	 * @generated
	 */
	EDataType getStateFactorKindsType();

	/**
	 * Returns the meta object for data type '{@link FmiModel.VariabilityType <em>Variability Type Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Variability Type Object</em>'.
	 * @see FmiModel.VariabilityType
	 * @model instanceClass="FmiModel.VariabilityType"
	 *        extendedMetaData="name='variability_._type:Object' baseType='variability_._type'"
	 * @generated
	 */
	EDataType getVariabilityTypeObject();

	/**
	 * Returns the meta object for data type '{@link FmiModel.VariableNamingConventionType <em>Variable Naming Convention Type Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Variable Naming Convention Type Object</em>'.
	 * @see FmiModel.VariableNamingConventionType
	 * @model instanceClass="FmiModel.VariableNamingConventionType"
	 *        extendedMetaData="name='variableNamingConvention_._type:Object' baseType='variableNamingConvention_._type'"
	 * @generated
	 */
	EDataType getVariableNamingConventionTypeObject();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	FmiModelFactory getFmiModelFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link FmiModel.impl.BaseUnitTypeImpl <em>Base Unit Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see FmiModel.impl.BaseUnitTypeImpl
		 * @see FmiModel.impl.FmiModelPackageImpl#getBaseUnitType()
		 * @generated
		 */
		EClass BASE_UNIT_TYPE = eINSTANCE.getBaseUnitType();

		/**
		 * The meta object literal for the '<em><b>A</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BASE_UNIT_TYPE__A = eINSTANCE.getBaseUnitType_A();

		/**
		 * The meta object literal for the '<em><b>Cd</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BASE_UNIT_TYPE__CD = eINSTANCE.getBaseUnitType_Cd();

		/**
		 * The meta object literal for the '<em><b>Factor</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BASE_UNIT_TYPE__FACTOR = eINSTANCE.getBaseUnitType_Factor();

		/**
		 * The meta object literal for the '<em><b>K</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BASE_UNIT_TYPE__K = eINSTANCE.getBaseUnitType_K();

		/**
		 * The meta object literal for the '<em><b>Kg</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BASE_UNIT_TYPE__KG = eINSTANCE.getBaseUnitType_Kg();

		/**
		 * The meta object literal for the '<em><b>M</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BASE_UNIT_TYPE__M = eINSTANCE.getBaseUnitType_M();

		/**
		 * The meta object literal for the '<em><b>Mol</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BASE_UNIT_TYPE__MOL = eINSTANCE.getBaseUnitType_Mol();

		/**
		 * The meta object literal for the '<em><b>Offset</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BASE_UNIT_TYPE__OFFSET = eINSTANCE.getBaseUnitType_Offset();

		/**
		 * The meta object literal for the '<em><b>Rad</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BASE_UNIT_TYPE__RAD = eINSTANCE.getBaseUnitType_Rad();

		/**
		 * The meta object literal for the '<em><b>S</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BASE_UNIT_TYPE__S = eINSTANCE.getBaseUnitType_S();

		/**
		 * The meta object literal for the '{@link FmiModel.impl.BooleanTypeImpl <em>Boolean Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see FmiModel.impl.BooleanTypeImpl
		 * @see FmiModel.impl.FmiModelPackageImpl#getBooleanType()
		 * @generated
		 */
		EClass BOOLEAN_TYPE = eINSTANCE.getBooleanType();

		/**
		 * The meta object literal for the '<em><b>Declared Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BOOLEAN_TYPE__DECLARED_TYPE = eINSTANCE.getBooleanType_DeclaredType();

		/**
		 * The meta object literal for the '<em><b>Start</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BOOLEAN_TYPE__START = eINSTANCE.getBooleanType_Start();

		/**
		 * The meta object literal for the '{@link FmiModel.impl.CategoryTypeImpl <em>Category Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see FmiModel.impl.CategoryTypeImpl
		 * @see FmiModel.impl.FmiModelPackageImpl#getCategoryType()
		 * @generated
		 */
		EClass CATEGORY_TYPE = eINSTANCE.getCategoryType();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CATEGORY_TYPE__NAME = eINSTANCE.getCategoryType_Name();

		/**
		 * The meta object literal for the '{@link FmiModel.impl.CoSimulationTypeImpl <em>Co Simulation Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see FmiModel.impl.CoSimulationTypeImpl
		 * @see FmiModel.impl.FmiModelPackageImpl#getCoSimulationType()
		 * @generated
		 */
		EClass CO_SIMULATION_TYPE = eINSTANCE.getCoSimulationType();

		/**
		 * The meta object literal for the '<em><b>Can Be Instantiated Only Once Per Process</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CO_SIMULATION_TYPE__CAN_BE_INSTANTIATED_ONLY_ONCE_PER_PROCESS = eINSTANCE.getCoSimulationType_CanBeInstantiatedOnlyOncePerProcess();

		/**
		 * The meta object literal for the '<em><b>Can Get And Set FM Ustate</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CO_SIMULATION_TYPE__CAN_GET_AND_SET_FM_USTATE = eINSTANCE.getCoSimulationType_CanGetAndSetFMUstate();

		/**
		 * The meta object literal for the '<em><b>Can Handle Events</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CO_SIMULATION_TYPE__CAN_HANDLE_EVENTS = eINSTANCE.getCoSimulationType_CanHandleEvents();

		/**
		 * The meta object literal for the '<em><b>Can Reject Steps</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CO_SIMULATION_TYPE__CAN_REJECT_STEPS = eINSTANCE.getCoSimulationType_CanRejectSteps();

		/**
		 * The meta object literal for the '<em><b>Can Handle Variable Communication Step Size</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CO_SIMULATION_TYPE__CAN_HANDLE_VARIABLE_COMMUNICATION_STEP_SIZE = eINSTANCE.getCoSimulationType_CanHandleVariableCommunicationStepSize();

		/**
		 * The meta object literal for the '<em><b>Can Interpolate Inputs</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CO_SIMULATION_TYPE__CAN_INTERPOLATE_INPUTS = eINSTANCE.getCoSimulationType_CanInterpolateInputs();

		/**
		 * The meta object literal for the '<em><b>Can Not Use Memory Management Functions</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CO_SIMULATION_TYPE__CAN_NOT_USE_MEMORY_MANAGEMENT_FUNCTIONS = eINSTANCE.getCoSimulationType_CanNotUseMemoryManagementFunctions();

		/**
		 * The meta object literal for the '<em><b>Can Run Asynchronuously</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CO_SIMULATION_TYPE__CAN_RUN_ASYNCHRONUOUSLY = eINSTANCE.getCoSimulationType_CanRunAsynchronuously();

		/**
		 * The meta object literal for the '<em><b>Can Serialize FM Ustate</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CO_SIMULATION_TYPE__CAN_SERIALIZE_FM_USTATE = eINSTANCE.getCoSimulationType_CanSerializeFMUstate();

		/**
		 * The meta object literal for the '<em><b>Can Signal Events</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CO_SIMULATION_TYPE__CAN_SIGNAL_EVENTS = eINSTANCE.getCoSimulationType_CanSignalEvents();

		/**
		 * The meta object literal for the '<em><b>Max Output Derivative Order</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CO_SIMULATION_TYPE__MAX_OUTPUT_DERIVATIVE_ORDER = eINSTANCE.getCoSimulationType_MaxOutputDerivativeOrder();

		/**
		 * The meta object literal for the '<em><b>Model Identifier</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CO_SIMULATION_TYPE__MODEL_IDENTIFIER = eINSTANCE.getCoSimulationType_ModelIdentifier();

		/**
		 * The meta object literal for the '<em><b>Needs Execution Tool</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CO_SIMULATION_TYPE__NEEDS_EXECUTION_TOOL = eINSTANCE.getCoSimulationType_NeedsExecutionTool();

		/**
		 * The meta object literal for the '<em><b>Provides Partial Derivatives Of Derivative Function Wrt Inputs</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CO_SIMULATION_TYPE__PROVIDES_PARTIAL_DERIVATIVES_OF_DERIVATIVE_FUNCTION_WRT_INPUTS = eINSTANCE.getCoSimulationType_ProvidesPartialDerivativesOfDerivativeFunctionWrtInputs();

		/**
		 * The meta object literal for the '<em><b>Provides Partial Derivatives Of Derivative Function Wrt States</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CO_SIMULATION_TYPE__PROVIDES_PARTIAL_DERIVATIVES_OF_DERIVATIVE_FUNCTION_WRT_STATES = eINSTANCE.getCoSimulationType_ProvidesPartialDerivativesOfDerivativeFunctionWrtStates();

		/**
		 * The meta object literal for the '<em><b>Provides Partial Derivatives Of Output Function Wrt Inputs</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CO_SIMULATION_TYPE__PROVIDES_PARTIAL_DERIVATIVES_OF_OUTPUT_FUNCTION_WRT_INPUTS = eINSTANCE.getCoSimulationType_ProvidesPartialDerivativesOfOutputFunctionWrtInputs();

		/**
		 * The meta object literal for the '<em><b>Provides Partial Derivatives Of Output Function Wrt States</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CO_SIMULATION_TYPE__PROVIDES_PARTIAL_DERIVATIVES_OF_OUTPUT_FUNCTION_WRT_STATES = eINSTANCE.getCoSimulationType_ProvidesPartialDerivativesOfOutputFunctionWrtStates();

		/**
		 * The meta object literal for the '{@link FmiModel.impl.DefaultExperimentTypeImpl <em>Default Experiment Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see FmiModel.impl.DefaultExperimentTypeImpl
		 * @see FmiModel.impl.FmiModelPackageImpl#getDefaultExperimentType()
		 * @generated
		 */
		EClass DEFAULT_EXPERIMENT_TYPE = eINSTANCE.getDefaultExperimentType();

		/**
		 * The meta object literal for the '<em><b>Start Time</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DEFAULT_EXPERIMENT_TYPE__START_TIME = eINSTANCE.getDefaultExperimentType_StartTime();

		/**
		 * The meta object literal for the '<em><b>Stop Time</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DEFAULT_EXPERIMENT_TYPE__STOP_TIME = eINSTANCE.getDefaultExperimentType_StopTime();

		/**
		 * The meta object literal for the '<em><b>Tolerance</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DEFAULT_EXPERIMENT_TYPE__TOLERANCE = eINSTANCE.getDefaultExperimentType_Tolerance();

		/**
		 * The meta object literal for the '<em><b>Step Size</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DEFAULT_EXPERIMENT_TYPE__STEP_SIZE = eINSTANCE.getDefaultExperimentType_StepSize();

		/**
		 * The meta object literal for the '{@link FmiModel.impl.DerivativesTypeImpl <em>Derivatives Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see FmiModel.impl.DerivativesTypeImpl
		 * @see FmiModel.impl.FmiModelPackageImpl#getDerivativesType()
		 * @generated
		 */
		EClass DERIVATIVES_TYPE = eINSTANCE.getDerivativesType();

		/**
		 * The meta object literal for the '<em><b>Group</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DERIVATIVES_TYPE__GROUP = eINSTANCE.getDerivativesType_Group();

		/**
		 * The meta object literal for the '<em><b>Derivative</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DERIVATIVES_TYPE__DERIVATIVE = eINSTANCE.getDerivativesType_Derivative();

		/**
		 * The meta object literal for the '{@link FmiModel.impl.DerivativeTypeImpl <em>Derivative Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see FmiModel.impl.DerivativeTypeImpl
		 * @see FmiModel.impl.FmiModelPackageImpl#getDerivativeType()
		 * @generated
		 */
		EClass DERIVATIVE_TYPE = eINSTANCE.getDerivativeType();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DERIVATIVE_TYPE__NAME = eINSTANCE.getDerivativeType_Name();

		/**
		 * The meta object literal for the '<em><b>State</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DERIVATIVE_TYPE__STATE = eINSTANCE.getDerivativeType_State();

		/**
		 * The meta object literal for the '{@link FmiModel.impl.DisplayUnitTypeImpl <em>Display Unit Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see FmiModel.impl.DisplayUnitTypeImpl
		 * @see FmiModel.impl.FmiModelPackageImpl#getDisplayUnitType()
		 * @generated
		 */
		EClass DISPLAY_UNIT_TYPE = eINSTANCE.getDisplayUnitType();

		/**
		 * The meta object literal for the '<em><b>Factor</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DISPLAY_UNIT_TYPE__FACTOR = eINSTANCE.getDisplayUnitType_Factor();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DISPLAY_UNIT_TYPE__NAME = eINSTANCE.getDisplayUnitType_Name();

		/**
		 * The meta object literal for the '<em><b>Offset</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DISPLAY_UNIT_TYPE__OFFSET = eINSTANCE.getDisplayUnitType_Offset();

		/**
		 * The meta object literal for the '{@link FmiModel.impl.EnumerationTypeImpl <em>Enumeration Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see FmiModel.impl.EnumerationTypeImpl
		 * @see FmiModel.impl.FmiModelPackageImpl#getEnumerationType()
		 * @generated
		 */
		EClass ENUMERATION_TYPE = eINSTANCE.getEnumerationType();

		/**
		 * The meta object literal for the '<em><b>Declared Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ENUMERATION_TYPE__DECLARED_TYPE = eINSTANCE.getEnumerationType_DeclaredType();

		/**
		 * The meta object literal for the '<em><b>Max</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ENUMERATION_TYPE__MAX = eINSTANCE.getEnumerationType_Max();

		/**
		 * The meta object literal for the '<em><b>Min</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ENUMERATION_TYPE__MIN = eINSTANCE.getEnumerationType_Min();

		/**
		 * The meta object literal for the '<em><b>Quantity</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ENUMERATION_TYPE__QUANTITY = eINSTANCE.getEnumerationType_Quantity();

		/**
		 * The meta object literal for the '<em><b>Start</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ENUMERATION_TYPE__START = eINSTANCE.getEnumerationType_Start();

		/**
		 * The meta object literal for the '{@link FmiModel.impl.EnumerationType1Impl <em>Enumeration Type1</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see FmiModel.impl.EnumerationType1Impl
		 * @see FmiModel.impl.FmiModelPackageImpl#getEnumerationType1()
		 * @generated
		 */
		EClass ENUMERATION_TYPE1 = eINSTANCE.getEnumerationType1();

		/**
		 * The meta object literal for the '<em><b>Group</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ENUMERATION_TYPE1__GROUP = eINSTANCE.getEnumerationType1_Group();

		/**
		 * The meta object literal for the '<em><b>Item</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENUMERATION_TYPE1__ITEM = eINSTANCE.getEnumerationType1_Item();

		/**
		 * The meta object literal for the '<em><b>Quantity</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ENUMERATION_TYPE1__QUANTITY = eINSTANCE.getEnumerationType1_Quantity();

		/**
		 * The meta object literal for the '{@link FmiModel.impl.FmiAnnotationImpl <em>Fmi Annotation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see FmiModel.impl.FmiAnnotationImpl
		 * @see FmiModel.impl.FmiModelPackageImpl#getFmiAnnotation()
		 * @generated
		 */
		EClass FMI_ANNOTATION = eINSTANCE.getFmiAnnotation();

		/**
		 * The meta object literal for the '<em><b>Group</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FMI_ANNOTATION__GROUP = eINSTANCE.getFmiAnnotation_Group();

		/**
		 * The meta object literal for the '<em><b>Tool</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FMI_ANNOTATION__TOOL = eINSTANCE.getFmiAnnotation_Tool();

		/**
		 * The meta object literal for the '{@link FmiModel.impl.FmiModelDescriptionTypeImpl <em>Description Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see FmiModel.impl.FmiModelDescriptionTypeImpl
		 * @see FmiModel.impl.FmiModelPackageImpl#getFmiModelDescriptionType()
		 * @generated
		 */
		EClass FMI_MODEL_DESCRIPTION_TYPE = eINSTANCE.getFmiModelDescriptionType();

		/**
		 * The meta object literal for the '<em><b>Group</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FMI_MODEL_DESCRIPTION_TYPE__GROUP = eINSTANCE.getFmiModelDescriptionType_Group();

		/**
		 * The meta object literal for the '<em><b>Model Exchange</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FMI_MODEL_DESCRIPTION_TYPE__MODEL_EXCHANGE = eINSTANCE.getFmiModelDescriptionType_ModelExchange();

		/**
		 * The meta object literal for the '<em><b>Co Simulation</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FMI_MODEL_DESCRIPTION_TYPE__CO_SIMULATION = eINSTANCE.getFmiModelDescriptionType_CoSimulation();

		/**
		 * The meta object literal for the '<em><b>Unit Definitions</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FMI_MODEL_DESCRIPTION_TYPE__UNIT_DEFINITIONS = eINSTANCE.getFmiModelDescriptionType_UnitDefinitions();

		/**
		 * The meta object literal for the '<em><b>Type Definitions</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FMI_MODEL_DESCRIPTION_TYPE__TYPE_DEFINITIONS = eINSTANCE.getFmiModelDescriptionType_TypeDefinitions();

		/**
		 * The meta object literal for the '<em><b>Log Categories</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FMI_MODEL_DESCRIPTION_TYPE__LOG_CATEGORIES = eINSTANCE.getFmiModelDescriptionType_LogCategories();

		/**
		 * The meta object literal for the '<em><b>Default Experiment</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FMI_MODEL_DESCRIPTION_TYPE__DEFAULT_EXPERIMENT = eINSTANCE.getFmiModelDescriptionType_DefaultExperiment();

		/**
		 * The meta object literal for the '<em><b>Vendor Annotations</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FMI_MODEL_DESCRIPTION_TYPE__VENDOR_ANNOTATIONS = eINSTANCE.getFmiModelDescriptionType_VendorAnnotations();

		/**
		 * The meta object literal for the '<em><b>Model Variables</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FMI_MODEL_DESCRIPTION_TYPE__MODEL_VARIABLES = eINSTANCE.getFmiModelDescriptionType_ModelVariables();

		/**
		 * The meta object literal for the '<em><b>Model Structure</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FMI_MODEL_DESCRIPTION_TYPE__MODEL_STRUCTURE = eINSTANCE.getFmiModelDescriptionType_ModelStructure();

		/**
		 * The meta object literal for the '<em><b>Implementation</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FMI_MODEL_DESCRIPTION_TYPE__IMPLEMENTATION = eINSTANCE.getFmiModelDescriptionType_Implementation();

		/**
		 * The meta object literal for the '<em><b>Author</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FMI_MODEL_DESCRIPTION_TYPE__AUTHOR = eINSTANCE.getFmiModelDescriptionType_Author();

		/**
		 * The meta object literal for the '<em><b>Copyright</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FMI_MODEL_DESCRIPTION_TYPE__COPYRIGHT = eINSTANCE.getFmiModelDescriptionType_Copyright();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FMI_MODEL_DESCRIPTION_TYPE__DESCRIPTION = eINSTANCE.getFmiModelDescriptionType_Description();

		/**
		 * The meta object literal for the '<em><b>Fmi Version</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FMI_MODEL_DESCRIPTION_TYPE__FMI_VERSION = eINSTANCE.getFmiModelDescriptionType_FmiVersion();

		/**
		 * The meta object literal for the '<em><b>Generation Date And Time</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FMI_MODEL_DESCRIPTION_TYPE__GENERATION_DATE_AND_TIME = eINSTANCE.getFmiModelDescriptionType_GenerationDateAndTime();

		/**
		 * The meta object literal for the '<em><b>Generation Tool</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FMI_MODEL_DESCRIPTION_TYPE__GENERATION_TOOL = eINSTANCE.getFmiModelDescriptionType_GenerationTool();

		/**
		 * The meta object literal for the '<em><b>Guid</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FMI_MODEL_DESCRIPTION_TYPE__GUID = eINSTANCE.getFmiModelDescriptionType_Guid();

		/**
		 * The meta object literal for the '<em><b>License</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FMI_MODEL_DESCRIPTION_TYPE__LICENSE = eINSTANCE.getFmiModelDescriptionType_License();

		/**
		 * The meta object literal for the '<em><b>Model Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FMI_MODEL_DESCRIPTION_TYPE__MODEL_NAME = eINSTANCE.getFmiModelDescriptionType_ModelName();

		/**
		 * The meta object literal for the '<em><b>Number Of Event Indicators</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FMI_MODEL_DESCRIPTION_TYPE__NUMBER_OF_EVENT_INDICATORS = eINSTANCE.getFmiModelDescriptionType_NumberOfEventIndicators();

		/**
		 * The meta object literal for the '<em><b>Variable Naming Convention</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FMI_MODEL_DESCRIPTION_TYPE__VARIABLE_NAMING_CONVENTION = eINSTANCE.getFmiModelDescriptionType_VariableNamingConvention();

		/**
		 * The meta object literal for the '<em><b>Version</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FMI_MODEL_DESCRIPTION_TYPE__VERSION = eINSTANCE.getFmiModelDescriptionType_Version();

		/**
		 * The meta object literal for the '<em><b>Model Identifier</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FMI_MODEL_DESCRIPTION_TYPE__MODEL_IDENTIFIER = eINSTANCE.getFmiModelDescriptionType_ModelIdentifier();

		/**
		 * The meta object literal for the '<em><b>Number Of Continuous States</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FMI_MODEL_DESCRIPTION_TYPE__NUMBER_OF_CONTINUOUS_STATES = eINSTANCE.getFmiModelDescriptionType_NumberOfContinuousStates();

		/**
		 * The meta object literal for the '{@link FmiModel.impl.FmiScalarVariableImpl <em>Fmi Scalar Variable</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see FmiModel.impl.FmiScalarVariableImpl
		 * @see FmiModel.impl.FmiModelPackageImpl#getFmiScalarVariable()
		 * @generated
		 */
		EClass FMI_SCALAR_VARIABLE = eINSTANCE.getFmiScalarVariable();

		/**
		 * The meta object literal for the '<em><b>Real</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FMI_SCALAR_VARIABLE__REAL = eINSTANCE.getFmiScalarVariable_Real();

		/**
		 * The meta object literal for the '<em><b>Integer</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FMI_SCALAR_VARIABLE__INTEGER = eINSTANCE.getFmiScalarVariable_Integer();

		/**
		 * The meta object literal for the '<em><b>Boolean</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FMI_SCALAR_VARIABLE__BOOLEAN = eINSTANCE.getFmiScalarVariable_Boolean();

		/**
		 * The meta object literal for the '<em><b>String</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FMI_SCALAR_VARIABLE__STRING = eINSTANCE.getFmiScalarVariable_String();

		/**
		 * The meta object literal for the '<em><b>Enumeration</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FMI_SCALAR_VARIABLE__ENUMERATION = eINSTANCE.getFmiScalarVariable_Enumeration();

		/**
		 * The meta object literal for the '<em><b>Annotations</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FMI_SCALAR_VARIABLE__ANNOTATIONS = eINSTANCE.getFmiScalarVariable_Annotations();

		/**
		 * The meta object literal for the '<em><b>Causality</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FMI_SCALAR_VARIABLE__CAUSALITY = eINSTANCE.getFmiScalarVariable_Causality();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FMI_SCALAR_VARIABLE__DESCRIPTION = eINSTANCE.getFmiScalarVariable_Description();

		/**
		 * The meta object literal for the '<em><b>Initial</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FMI_SCALAR_VARIABLE__INITIAL = eINSTANCE.getFmiScalarVariable_Initial();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FMI_SCALAR_VARIABLE__NAME = eINSTANCE.getFmiScalarVariable_Name();

		/**
		 * The meta object literal for the '<em><b>Value Reference</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FMI_SCALAR_VARIABLE__VALUE_REFERENCE = eINSTANCE.getFmiScalarVariable_ValueReference();

		/**
		 * The meta object literal for the '<em><b>Variability</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FMI_SCALAR_VARIABLE__VARIABILITY = eINSTANCE.getFmiScalarVariable_Variability();

		/**
		 * The meta object literal for the '{@link FmiModel.impl.FmiSimpleTypeImpl <em>Fmi Simple Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see FmiModel.impl.FmiSimpleTypeImpl
		 * @see FmiModel.impl.FmiModelPackageImpl#getFmiSimpleType()
		 * @generated
		 */
		EClass FMI_SIMPLE_TYPE = eINSTANCE.getFmiSimpleType();

		/**
		 * The meta object literal for the '<em><b>Real</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FMI_SIMPLE_TYPE__REAL = eINSTANCE.getFmiSimpleType_Real();

		/**
		 * The meta object literal for the '<em><b>Integer</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FMI_SIMPLE_TYPE__INTEGER = eINSTANCE.getFmiSimpleType_Integer();

		/**
		 * The meta object literal for the '<em><b>Boolean</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FMI_SIMPLE_TYPE__BOOLEAN = eINSTANCE.getFmiSimpleType_Boolean();

		/**
		 * The meta object literal for the '<em><b>String</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FMI_SIMPLE_TYPE__STRING = eINSTANCE.getFmiSimpleType_String();

		/**
		 * The meta object literal for the '<em><b>Enumeration</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FMI_SIMPLE_TYPE__ENUMERATION = eINSTANCE.getFmiSimpleType_Enumeration();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FMI_SIMPLE_TYPE__DESCRIPTION = eINSTANCE.getFmiSimpleType_Description();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FMI_SIMPLE_TYPE__NAME = eINSTANCE.getFmiSimpleType_Name();

		/**
		 * The meta object literal for the '{@link FmiModel.impl.FmiUnitImpl <em>Fmi Unit</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see FmiModel.impl.FmiUnitImpl
		 * @see FmiModel.impl.FmiModelPackageImpl#getFmiUnit()
		 * @generated
		 */
		EClass FMI_UNIT = eINSTANCE.getFmiUnit();

		/**
		 * The meta object literal for the '<em><b>Base Unit</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FMI_UNIT__BASE_UNIT = eINSTANCE.getFmiUnit_BaseUnit();

		/**
		 * The meta object literal for the '<em><b>Group</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FMI_UNIT__GROUP = eINSTANCE.getFmiUnit_Group();

		/**
		 * The meta object literal for the '<em><b>Display Unit</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FMI_UNIT__DISPLAY_UNIT = eINSTANCE.getFmiUnit_DisplayUnit();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FMI_UNIT__NAME = eINSTANCE.getFmiUnit_Name();

		/**
		 * The meta object literal for the '{@link FmiModel.impl.FmiVariableDependencyImpl <em>Fmi Variable Dependency</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see FmiModel.impl.FmiVariableDependencyImpl
		 * @see FmiModel.impl.FmiModelPackageImpl#getFmiVariableDependency()
		 * @generated
		 */
		EClass FMI_VARIABLE_DEPENDENCY = eINSTANCE.getFmiVariableDependency();

		/**
		 * The meta object literal for the '<em><b>Input Dependencies</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FMI_VARIABLE_DEPENDENCY__INPUT_DEPENDENCIES = eINSTANCE.getFmiVariableDependency_InputDependencies();

		/**
		 * The meta object literal for the '<em><b>Input Factor Kinds</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FMI_VARIABLE_DEPENDENCY__INPUT_FACTOR_KINDS = eINSTANCE.getFmiVariableDependency_InputFactorKinds();

		/**
		 * The meta object literal for the '<em><b>State Dependencies</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FMI_VARIABLE_DEPENDENCY__STATE_DEPENDENCIES = eINSTANCE.getFmiVariableDependency_StateDependencies();

		/**
		 * The meta object literal for the '<em><b>State Factor Kinds</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FMI_VARIABLE_DEPENDENCY__STATE_FACTOR_KINDS = eINSTANCE.getFmiVariableDependency_StateFactorKinds();

		/**
		 * The meta object literal for the '{@link FmiModel.impl.InputsTypeImpl <em>Inputs Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see FmiModel.impl.InputsTypeImpl
		 * @see FmiModel.impl.FmiModelPackageImpl#getInputsType()
		 * @generated
		 */
		EClass INPUTS_TYPE = eINSTANCE.getInputsType();

		/**
		 * The meta object literal for the '<em><b>Group</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INPUTS_TYPE__GROUP = eINSTANCE.getInputsType_Group();

		/**
		 * The meta object literal for the '<em><b>Input</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INPUTS_TYPE__INPUT = eINSTANCE.getInputsType_Input();

		/**
		 * The meta object literal for the '{@link FmiModel.impl.InputTypeImpl <em>Input Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see FmiModel.impl.InputTypeImpl
		 * @see FmiModel.impl.FmiModelPackageImpl#getInputType()
		 * @generated
		 */
		EClass INPUT_TYPE = eINSTANCE.getInputType();

		/**
		 * The meta object literal for the '<em><b>Derivative</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INPUT_TYPE__DERIVATIVE = eINSTANCE.getInputType_Derivative();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INPUT_TYPE__NAME = eINSTANCE.getInputType_Name();

		/**
		 * The meta object literal for the '{@link FmiModel.impl.IntegerTypeImpl <em>Integer Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see FmiModel.impl.IntegerTypeImpl
		 * @see FmiModel.impl.FmiModelPackageImpl#getIntegerType()
		 * @generated
		 */
		EClass INTEGER_TYPE = eINSTANCE.getIntegerType();

		/**
		 * The meta object literal for the '<em><b>Declared Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INTEGER_TYPE__DECLARED_TYPE = eINSTANCE.getIntegerType_DeclaredType();

		/**
		 * The meta object literal for the '<em><b>Max</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INTEGER_TYPE__MAX = eINSTANCE.getIntegerType_Max();

		/**
		 * The meta object literal for the '<em><b>Min</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INTEGER_TYPE__MIN = eINSTANCE.getIntegerType_Min();

		/**
		 * The meta object literal for the '<em><b>Quantity</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INTEGER_TYPE__QUANTITY = eINSTANCE.getIntegerType_Quantity();

		/**
		 * The meta object literal for the '<em><b>Start</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INTEGER_TYPE__START = eINSTANCE.getIntegerType_Start();

		/**
		 * The meta object literal for the '{@link FmiModel.impl.IntegerType1Impl <em>Integer Type1</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see FmiModel.impl.IntegerType1Impl
		 * @see FmiModel.impl.FmiModelPackageImpl#getIntegerType1()
		 * @generated
		 */
		EClass INTEGER_TYPE1 = eINSTANCE.getIntegerType1();

		/**
		 * The meta object literal for the '<em><b>Max</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INTEGER_TYPE1__MAX = eINSTANCE.getIntegerType1_Max();

		/**
		 * The meta object literal for the '<em><b>Min</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INTEGER_TYPE1__MIN = eINSTANCE.getIntegerType1_Min();

		/**
		 * The meta object literal for the '<em><b>Quantity</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INTEGER_TYPE1__QUANTITY = eINSTANCE.getIntegerType1_Quantity();

		/**
		 * The meta object literal for the '{@link FmiModel.impl.ItemTypeImpl <em>Item Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see FmiModel.impl.ItemTypeImpl
		 * @see FmiModel.impl.FmiModelPackageImpl#getItemType()
		 * @generated
		 */
		EClass ITEM_TYPE = eINSTANCE.getItemType();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ITEM_TYPE__DESCRIPTION = eINSTANCE.getItemType_Description();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ITEM_TYPE__NAME = eINSTANCE.getItemType_Name();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ITEM_TYPE__VALUE = eINSTANCE.getItemType_Value();

		/**
		 * The meta object literal for the '{@link FmiModel.impl.LogCategoriesTypeImpl <em>Log Categories Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see FmiModel.impl.LogCategoriesTypeImpl
		 * @see FmiModel.impl.FmiModelPackageImpl#getLogCategoriesType()
		 * @generated
		 */
		EClass LOG_CATEGORIES_TYPE = eINSTANCE.getLogCategoriesType();

		/**
		 * The meta object literal for the '<em><b>Group</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LOG_CATEGORIES_TYPE__GROUP = eINSTANCE.getLogCategoriesType_Group();

		/**
		 * The meta object literal for the '<em><b>Category</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LOG_CATEGORIES_TYPE__CATEGORY = eINSTANCE.getLogCategoriesType_Category();

		/**
		 * The meta object literal for the '{@link FmiModel.impl.ModelExchangeTypeImpl <em>Model Exchange Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see FmiModel.impl.ModelExchangeTypeImpl
		 * @see FmiModel.impl.FmiModelPackageImpl#getModelExchangeType()
		 * @generated
		 */
		EClass MODEL_EXCHANGE_TYPE = eINSTANCE.getModelExchangeType();

		/**
		 * The meta object literal for the '<em><b>Can Be Instantiated Only Once Per Process</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MODEL_EXCHANGE_TYPE__CAN_BE_INSTANTIATED_ONLY_ONCE_PER_PROCESS = eINSTANCE.getModelExchangeType_CanBeInstantiatedOnlyOncePerProcess();

		/**
		 * The meta object literal for the '<em><b>Can Get And Set FM Ustate</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MODEL_EXCHANGE_TYPE__CAN_GET_AND_SET_FM_USTATE = eINSTANCE.getModelExchangeType_CanGetAndSetFMUstate();

		/**
		 * The meta object literal for the '<em><b>Can Not Use Memory Management Functions</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MODEL_EXCHANGE_TYPE__CAN_NOT_USE_MEMORY_MANAGEMENT_FUNCTIONS = eINSTANCE.getModelExchangeType_CanNotUseMemoryManagementFunctions();

		/**
		 * The meta object literal for the '<em><b>Can Serialize FM Ustate</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MODEL_EXCHANGE_TYPE__CAN_SERIALIZE_FM_USTATE = eINSTANCE.getModelExchangeType_CanSerializeFMUstate();

		/**
		 * The meta object literal for the '<em><b>Completed Integrator Step Not Needed</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MODEL_EXCHANGE_TYPE__COMPLETED_INTEGRATOR_STEP_NOT_NEEDED = eINSTANCE.getModelExchangeType_CompletedIntegratorStepNotNeeded();

		/**
		 * The meta object literal for the '<em><b>Model Identifier</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MODEL_EXCHANGE_TYPE__MODEL_IDENTIFIER = eINSTANCE.getModelExchangeType_ModelIdentifier();

		/**
		 * The meta object literal for the '<em><b>Needs Execution Tool</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MODEL_EXCHANGE_TYPE__NEEDS_EXECUTION_TOOL = eINSTANCE.getModelExchangeType_NeedsExecutionTool();

		/**
		 * The meta object literal for the '<em><b>Provides Directional Derivatives</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MODEL_EXCHANGE_TYPE__PROVIDES_DIRECTIONAL_DERIVATIVES = eINSTANCE.getModelExchangeType_ProvidesDirectionalDerivatives();

		/**
		 * The meta object literal for the '<em><b>Provides Partial Derivatives Of Derivative Function Wrt Inputs</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MODEL_EXCHANGE_TYPE__PROVIDES_PARTIAL_DERIVATIVES_OF_DERIVATIVE_FUNCTION_WRT_INPUTS = eINSTANCE.getModelExchangeType_ProvidesPartialDerivativesOfDerivativeFunctionWrtInputs();

		/**
		 * The meta object literal for the '<em><b>Provides Partial Derivatives Of Derivative Function Wrt States</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MODEL_EXCHANGE_TYPE__PROVIDES_PARTIAL_DERIVATIVES_OF_DERIVATIVE_FUNCTION_WRT_STATES = eINSTANCE.getModelExchangeType_ProvidesPartialDerivativesOfDerivativeFunctionWrtStates();

		/**
		 * The meta object literal for the '<em><b>Provides Partial Derivatives Of Output Function Wrt Inputs</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MODEL_EXCHANGE_TYPE__PROVIDES_PARTIAL_DERIVATIVES_OF_OUTPUT_FUNCTION_WRT_INPUTS = eINSTANCE.getModelExchangeType_ProvidesPartialDerivativesOfOutputFunctionWrtInputs();

		/**
		 * The meta object literal for the '<em><b>Provides Partial Derivatives Of Output Function Wrt States</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MODEL_EXCHANGE_TYPE__PROVIDES_PARTIAL_DERIVATIVES_OF_OUTPUT_FUNCTION_WRT_STATES = eINSTANCE.getModelExchangeType_ProvidesPartialDerivativesOfOutputFunctionWrtStates();

		/**
		 * The meta object literal for the '{@link FmiModel.impl.ModelStructureTypeImpl <em>Model Structure Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see FmiModel.impl.ModelStructureTypeImpl
		 * @see FmiModel.impl.FmiModelPackageImpl#getModelStructureType()
		 * @generated
		 */
		EClass MODEL_STRUCTURE_TYPE = eINSTANCE.getModelStructureType();

		/**
		 * The meta object literal for the '<em><b>Inputs</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODEL_STRUCTURE_TYPE__INPUTS = eINSTANCE.getModelStructureType_Inputs();

		/**
		 * The meta object literal for the '<em><b>Derivatives</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODEL_STRUCTURE_TYPE__DERIVATIVES = eINSTANCE.getModelStructureType_Derivatives();

		/**
		 * The meta object literal for the '<em><b>Outputs</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODEL_STRUCTURE_TYPE__OUTPUTS = eINSTANCE.getModelStructureType_Outputs();

		/**
		 * The meta object literal for the '{@link FmiModel.impl.ModelVariablesTypeImpl <em>Model Variables Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see FmiModel.impl.ModelVariablesTypeImpl
		 * @see FmiModel.impl.FmiModelPackageImpl#getModelVariablesType()
		 * @generated
		 */
		EClass MODEL_VARIABLES_TYPE = eINSTANCE.getModelVariablesType();

		/**
		 * The meta object literal for the '<em><b>Group</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MODEL_VARIABLES_TYPE__GROUP = eINSTANCE.getModelVariablesType_Group();

		/**
		 * The meta object literal for the '<em><b>Scalar Variable</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODEL_VARIABLES_TYPE__SCALAR_VARIABLE = eINSTANCE.getModelVariablesType_ScalarVariable();

		/**
		 * The meta object literal for the '{@link FmiModel.impl.OutputTypeImpl <em>Output Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see FmiModel.impl.OutputTypeImpl
		 * @see FmiModel.impl.FmiModelPackageImpl#getOutputType()
		 * @generated
		 */
		EClass OUTPUT_TYPE = eINSTANCE.getOutputType();

		/**
		 * The meta object literal for the '<em><b>Derivative</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OUTPUT_TYPE__DERIVATIVE = eINSTANCE.getOutputType_Derivative();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OUTPUT_TYPE__NAME = eINSTANCE.getOutputType_Name();

		/**
		 * The meta object literal for the '{@link FmiModel.impl.RealTypeImpl <em>Real Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see FmiModel.impl.RealTypeImpl
		 * @see FmiModel.impl.FmiModelPackageImpl#getRealType()
		 * @generated
		 */
		EClass REAL_TYPE = eINSTANCE.getRealType();

		/**
		 * The meta object literal for the '<em><b>Display Unit</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REAL_TYPE__DISPLAY_UNIT = eINSTANCE.getRealType_DisplayUnit();

		/**
		 * The meta object literal for the '<em><b>Max</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REAL_TYPE__MAX = eINSTANCE.getRealType_Max();

		/**
		 * The meta object literal for the '<em><b>Min</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REAL_TYPE__MIN = eINSTANCE.getRealType_Min();

		/**
		 * The meta object literal for the '<em><b>Nominal</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REAL_TYPE__NOMINAL = eINSTANCE.getRealType_Nominal();

		/**
		 * The meta object literal for the '<em><b>Quantity</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REAL_TYPE__QUANTITY = eINSTANCE.getRealType_Quantity();

		/**
		 * The meta object literal for the '<em><b>Relative Quantity</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REAL_TYPE__RELATIVE_QUANTITY = eINSTANCE.getRealType_RelativeQuantity();

		/**
		 * The meta object literal for the '<em><b>Unbounded</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REAL_TYPE__UNBOUNDED = eINSTANCE.getRealType_Unbounded();

		/**
		 * The meta object literal for the '<em><b>Unit</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REAL_TYPE__UNIT = eINSTANCE.getRealType_Unit();

		/**
		 * The meta object literal for the '{@link FmiModel.impl.ToolTypeImpl <em>Tool Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see FmiModel.impl.ToolTypeImpl
		 * @see FmiModel.impl.FmiModelPackageImpl#getToolType()
		 * @generated
		 */
		EClass TOOL_TYPE = eINSTANCE.getToolType();

		/**
		 * The meta object literal for the '<em><b>Any</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TOOL_TYPE__ANY = eINSTANCE.getToolType_Any();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TOOL_TYPE__NAME = eINSTANCE.getToolType_Name();

		/**
		 * The meta object literal for the '{@link FmiModel.impl.DocumentRootImpl <em>Document Root</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see FmiModel.impl.DocumentRootImpl
		 * @see FmiModel.impl.FmiModelPackageImpl#getDocumentRoot()
		 * @generated
		 */
		EClass DOCUMENT_ROOT = eINSTANCE.getDocumentRoot();

		/**
		 * The meta object literal for the '<em><b>Mixed</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCUMENT_ROOT__MIXED = eINSTANCE.getDocumentRoot_Mixed();

		/**
		 * The meta object literal for the '<em><b>XMLNS Prefix Map</b></em>' map feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__XMLNS_PREFIX_MAP = eINSTANCE.getDocumentRoot_XMLNSPrefixMap();

		/**
		 * The meta object literal for the '<em><b>XSI Schema Location</b></em>' map feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__XSI_SCHEMA_LOCATION = eINSTANCE.getDocumentRoot_XSISchemaLocation();

		/**
		 * The meta object literal for the '<em><b>Fmi Model Description</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__FMI_MODEL_DESCRIPTION = eINSTANCE.getDocumentRoot_FmiModelDescription();

		/**
		 * The meta object literal for the '{@link FmiModel.impl.OutputsTypeImpl <em>Outputs Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see FmiModel.impl.OutputsTypeImpl
		 * @see FmiModel.impl.FmiModelPackageImpl#getOutputsType()
		 * @generated
		 */
		EClass OUTPUTS_TYPE = eINSTANCE.getOutputsType();

		/**
		 * The meta object literal for the '<em><b>Group</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OUTPUTS_TYPE__GROUP = eINSTANCE.getOutputsType_Group();

		/**
		 * The meta object literal for the '<em><b>Output</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OUTPUTS_TYPE__OUTPUT = eINSTANCE.getOutputsType_Output();

		/**
		 * The meta object literal for the '{@link FmiModel.impl.RealType1Impl <em>Real Type1</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see FmiModel.impl.RealType1Impl
		 * @see FmiModel.impl.FmiModelPackageImpl#getRealType1()
		 * @generated
		 */
		EClass REAL_TYPE1 = eINSTANCE.getRealType1();

		/**
		 * The meta object literal for the '<em><b>Declared Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REAL_TYPE1__DECLARED_TYPE = eINSTANCE.getRealType1_DeclaredType();

		/**
		 * The meta object literal for the '<em><b>Display Unit</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REAL_TYPE1__DISPLAY_UNIT = eINSTANCE.getRealType1_DisplayUnit();

		/**
		 * The meta object literal for the '<em><b>Max</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REAL_TYPE1__MAX = eINSTANCE.getRealType1_Max();

		/**
		 * The meta object literal for the '<em><b>Min</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REAL_TYPE1__MIN = eINSTANCE.getRealType1_Min();

		/**
		 * The meta object literal for the '<em><b>Nominal</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REAL_TYPE1__NOMINAL = eINSTANCE.getRealType1_Nominal();

		/**
		 * The meta object literal for the '<em><b>Quantity</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REAL_TYPE1__QUANTITY = eINSTANCE.getRealType1_Quantity();

		/**
		 * The meta object literal for the '<em><b>Relative Quantity</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REAL_TYPE1__RELATIVE_QUANTITY = eINSTANCE.getRealType1_RelativeQuantity();

		/**
		 * The meta object literal for the '<em><b>Start</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REAL_TYPE1__START = eINSTANCE.getRealType1_Start();

		/**
		 * The meta object literal for the '<em><b>Unbounded</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REAL_TYPE1__UNBOUNDED = eINSTANCE.getRealType1_Unbounded();

		/**
		 * The meta object literal for the '<em><b>Unit</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REAL_TYPE1__UNIT = eINSTANCE.getRealType1_Unit();

		/**
		 * The meta object literal for the '{@link FmiModel.impl.StringTypeImpl <em>String Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see FmiModel.impl.StringTypeImpl
		 * @see FmiModel.impl.FmiModelPackageImpl#getStringType()
		 * @generated
		 */
		EClass STRING_TYPE = eINSTANCE.getStringType();

		/**
		 * The meta object literal for the '<em><b>Declared Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STRING_TYPE__DECLARED_TYPE = eINSTANCE.getStringType_DeclaredType();

		/**
		 * The meta object literal for the '<em><b>Start</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STRING_TYPE__START = eINSTANCE.getStringType_Start();

		/**
		 * The meta object literal for the '{@link FmiModel.impl.TypeDefinitionsTypeImpl <em>Type Definitions Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see FmiModel.impl.TypeDefinitionsTypeImpl
		 * @see FmiModel.impl.FmiModelPackageImpl#getTypeDefinitionsType()
		 * @generated
		 */
		EClass TYPE_DEFINITIONS_TYPE = eINSTANCE.getTypeDefinitionsType();

		/**
		 * The meta object literal for the '<em><b>Group</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TYPE_DEFINITIONS_TYPE__GROUP = eINSTANCE.getTypeDefinitionsType_Group();

		/**
		 * The meta object literal for the '<em><b>Simple Type</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TYPE_DEFINITIONS_TYPE__SIMPLE_TYPE = eINSTANCE.getTypeDefinitionsType_SimpleType();

		/**
		 * The meta object literal for the '{@link FmiModel.impl.UnitDefinitionsTypeImpl <em>Unit Definitions Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see FmiModel.impl.UnitDefinitionsTypeImpl
		 * @see FmiModel.impl.FmiModelPackageImpl#getUnitDefinitionsType()
		 * @generated
		 */
		EClass UNIT_DEFINITIONS_TYPE = eINSTANCE.getUnitDefinitionsType();

		/**
		 * The meta object literal for the '<em><b>Group</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UNIT_DEFINITIONS_TYPE__GROUP = eINSTANCE.getUnitDefinitionsType_Group();

		/**
		 * The meta object literal for the '<em><b>Unit</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UNIT_DEFINITIONS_TYPE__UNIT = eINSTANCE.getUnitDefinitionsType_Unit();

		/**
		 * The meta object literal for the '{@link FmiModel.impl.ImplementationImpl <em>Implementation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see FmiModel.impl.ImplementationImpl
		 * @see FmiModel.impl.FmiModelPackageImpl#getImplementation()
		 * @generated
		 */
		EClass IMPLEMENTATION = eINSTANCE.getImplementation();

		/**
		 * The meta object literal for the '<em><b>Fmi Co Simulation Capabilities</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IMPLEMENTATION__FMI_CO_SIMULATION_CAPABILITIES = eINSTANCE.getImplementation_FmiCoSimulationCapabilities();

		/**
		 * The meta object literal for the '{@link FmiModel.impl.FmiCoSimulationCapabilitiesTypeImpl <em>Fmi Co Simulation Capabilities Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see FmiModel.impl.FmiCoSimulationCapabilitiesTypeImpl
		 * @see FmiModel.impl.FmiModelPackageImpl#getFmiCoSimulationCapabilitiesType()
		 * @generated
		 */
		EClass FMI_CO_SIMULATION_CAPABILITIES_TYPE = eINSTANCE.getFmiCoSimulationCapabilitiesType();

		/**
		 * The meta object literal for the '<em><b>Capabilities</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FMI_CO_SIMULATION_CAPABILITIES_TYPE__CAPABILITIES = eINSTANCE.getFmiCoSimulationCapabilitiesType_Capabilities();

		/**
		 * The meta object literal for the '{@link FmiModel.impl.CoSimulation_StandAloneImpl <em>Co Simulation Stand Alone</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see FmiModel.impl.CoSimulation_StandAloneImpl
		 * @see FmiModel.impl.FmiModelPackageImpl#getCoSimulation_StandAlone()
		 * @generated
		 */
		EClass CO_SIMULATION_STAND_ALONE = eINSTANCE.getCoSimulation_StandAlone();

		/**
		 * The meta object literal for the '{@link FmiModel.impl.CoSimulation_ToolImpl <em>Co Simulation Tool</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see FmiModel.impl.CoSimulation_ToolImpl
		 * @see FmiModel.impl.FmiModelPackageImpl#getCoSimulation_Tool()
		 * @generated
		 */
		EClass CO_SIMULATION_TOOL = eINSTANCE.getCoSimulation_Tool();

		/**
		 * The meta object literal for the '{@link FmiModel.CausalityType <em>Causality Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see FmiModel.CausalityType
		 * @see FmiModel.impl.FmiModelPackageImpl#getCausalityType()
		 * @generated
		 */
		EEnum CAUSALITY_TYPE = eINSTANCE.getCausalityType();

		/**
		 * The meta object literal for the '{@link FmiModel.FmiDependencyFactorKind <em>Fmi Dependency Factor Kind</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see FmiModel.FmiDependencyFactorKind
		 * @see FmiModel.impl.FmiModelPackageImpl#getFmiDependencyFactorKind()
		 * @generated
		 */
		EEnum FMI_DEPENDENCY_FACTOR_KIND = eINSTANCE.getFmiDependencyFactorKind();

		/**
		 * The meta object literal for the '{@link FmiModel.InitialType <em>Initial Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see FmiModel.InitialType
		 * @see FmiModel.impl.FmiModelPackageImpl#getInitialType()
		 * @generated
		 */
		EEnum INITIAL_TYPE = eINSTANCE.getInitialType();

		/**
		 * The meta object literal for the '{@link FmiModel.VariabilityType <em>Variability Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see FmiModel.VariabilityType
		 * @see FmiModel.impl.FmiModelPackageImpl#getVariabilityType()
		 * @generated
		 */
		EEnum VARIABILITY_TYPE = eINSTANCE.getVariabilityType();

		/**
		 * The meta object literal for the '{@link FmiModel.VariableNamingConventionType <em>Variable Naming Convention Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see FmiModel.VariableNamingConventionType
		 * @see FmiModel.impl.FmiModelPackageImpl#getVariableNamingConventionType()
		 * @generated
		 */
		EEnum VARIABLE_NAMING_CONVENTION_TYPE = eINSTANCE.getVariableNamingConventionType();

		/**
		 * The meta object literal for the '<em>Causality Type Object</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see FmiModel.CausalityType
		 * @see FmiModel.impl.FmiModelPackageImpl#getCausalityTypeObject()
		 * @generated
		 */
		EDataType CAUSALITY_TYPE_OBJECT = eINSTANCE.getCausalityTypeObject();

		/**
		 * The meta object literal for the '<em>Fmi Dependency Factor Kind Object</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see FmiModel.FmiDependencyFactorKind
		 * @see FmiModel.impl.FmiModelPackageImpl#getFmiDependencyFactorKindObject()
		 * @generated
		 */
		EDataType FMI_DEPENDENCY_FACTOR_KIND_OBJECT = eINSTANCE.getFmiDependencyFactorKindObject();

		/**
		 * The meta object literal for the '<em>Initial Type Object</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see FmiModel.InitialType
		 * @see FmiModel.impl.FmiModelPackageImpl#getInitialTypeObject()
		 * @generated
		 */
		EDataType INITIAL_TYPE_OBJECT = eINSTANCE.getInitialTypeObject();

		/**
		 * The meta object literal for the '<em>Input Dependencies Type</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.util.List
		 * @see FmiModel.impl.FmiModelPackageImpl#getInputDependenciesType()
		 * @generated
		 */
		EDataType INPUT_DEPENDENCIES_TYPE = eINSTANCE.getInputDependenciesType();

		/**
		 * The meta object literal for the '<em>Input Factor Kinds Type</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.util.List
		 * @see FmiModel.impl.FmiModelPackageImpl#getInputFactorKindsType()
		 * @generated
		 */
		EDataType INPUT_FACTOR_KINDS_TYPE = eINSTANCE.getInputFactorKindsType();

		/**
		 * The meta object literal for the '<em>State Dependencies Type</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.util.List
		 * @see FmiModel.impl.FmiModelPackageImpl#getStateDependenciesType()
		 * @generated
		 */
		EDataType STATE_DEPENDENCIES_TYPE = eINSTANCE.getStateDependenciesType();

		/**
		 * The meta object literal for the '<em>State Factor Kinds Type</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.util.List
		 * @see FmiModel.impl.FmiModelPackageImpl#getStateFactorKindsType()
		 * @generated
		 */
		EDataType STATE_FACTOR_KINDS_TYPE = eINSTANCE.getStateFactorKindsType();

		/**
		 * The meta object literal for the '<em>Variability Type Object</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see FmiModel.VariabilityType
		 * @see FmiModel.impl.FmiModelPackageImpl#getVariabilityTypeObject()
		 * @generated
		 */
		EDataType VARIABILITY_TYPE_OBJECT = eINSTANCE.getVariabilityTypeObject();

		/**
		 * The meta object literal for the '<em>Variable Naming Convention Type Object</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see FmiModel.VariableNamingConventionType
		 * @see FmiModel.impl.FmiModelPackageImpl#getVariableNamingConventionTypeObject()
		 * @generated
		 */
		EDataType VARIABLE_NAMING_CONVENTION_TYPE_OBJECT = eINSTANCE.getVariableNamingConventionTypeObject();

	}

} //FmiModelPackage
