/**
 */
package FmiModel;

import java.util.List;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Fmi Variable Dependency</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Dependency of scalar variable on states and on inputs
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link FmiModel.FmiVariableDependency#getInputDependencies <em>Input Dependencies</em>}</li>
 *   <li>{@link FmiModel.FmiVariableDependency#getInputFactorKinds <em>Input Factor Kinds</em>}</li>
 *   <li>{@link FmiModel.FmiVariableDependency#getStateDependencies <em>State Dependencies</em>}</li>
 *   <li>{@link FmiModel.FmiVariableDependency#getStateFactorKinds <em>State Factor Kinds</em>}</li>
 * </ul>
 * </p>
 *
 * @see FmiModel.FmiModelPackage#getFmiVariableDependency()
 * @model extendedMetaData="name='fmiVariableDependency' kind='empty'"
 * @generated
 */
public interface FmiVariableDependency extends EObject {
	/**
	 * Returns the value of the '<em><b>Input Dependencies</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * If not present, it must be assumed that the variable depends on all inputs. If present as empty list, the variable depends on no inputs. Otherwise the variable depends on the inputs defined by the given indices.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Input Dependencies</em>' attribute.
	 * @see #setInputDependencies(List)
	 * @see FmiModel.FmiModelPackage#getFmiVariableDependency_InputDependencies()
	 * @model dataType="FmiModel.InputDependenciesType" many="false"
	 *        extendedMetaData="kind='attribute' name='inputDependencies' namespace='##targetNamespace'"
	 * @generated
	 */
	List<Integer> getInputDependencies();

	/**
	 * Sets the value of the '{@link FmiModel.FmiVariableDependency#getInputDependencies <em>Input Dependencies</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Input Dependencies</em>' attribute.
	 * @see #getInputDependencies()
	 * @generated
	 */
	void setInputDependencies(List<Integer> value);

	/**
	 * Returns the value of the '<em><b>Input Factor Kinds</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * If not present, it must be assumed that the variable depends non-linearly on the inputs. Otherwise, the corresponding input u of the list enters the equation as:
	 * = "nonlinear": nonlinear factor, f(u)
	 * = "fixed"      : fixed factor, p*u
	 * = "discrete"  : discrete factor, d*u
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Input Factor Kinds</em>' attribute.
	 * @see #setInputFactorKinds(List)
	 * @see FmiModel.FmiModelPackage#getFmiVariableDependency_InputFactorKinds()
	 * @model dataType="FmiModel.InputFactorKindsType" many="false"
	 *        extendedMetaData="kind='attribute' name='inputFactorKinds' namespace='##targetNamespace'"
	 * @generated
	 */
	List<FmiDependencyFactorKind> getInputFactorKinds();

	/**
	 * Sets the value of the '{@link FmiModel.FmiVariableDependency#getInputFactorKinds <em>Input Factor Kinds</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Input Factor Kinds</em>' attribute.
	 * @see #getInputFactorKinds()
	 * @generated
	 */
	void setInputFactorKinds(List<FmiDependencyFactorKind> value);

	/**
	 * Returns the value of the '<em><b>State Dependencies</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * If not present, it must be assumed that the variable depends on all states. If present as empty list, the variable depends on no states. Otherwise the variable depends on the states defined by the given indices.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>State Dependencies</em>' attribute.
	 * @see #setStateDependencies(List)
	 * @see FmiModel.FmiModelPackage#getFmiVariableDependency_StateDependencies()
	 * @model dataType="FmiModel.StateDependenciesType" many="false"
	 *        extendedMetaData="kind='attribute' name='stateDependencies' namespace='##targetNamespace'"
	 * @generated
	 */
	List<Integer> getStateDependencies();

	/**
	 * Sets the value of the '{@link FmiModel.FmiVariableDependency#getStateDependencies <em>State Dependencies</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>State Dependencies</em>' attribute.
	 * @see #getStateDependencies()
	 * @generated
	 */
	void setStateDependencies(List<Integer> value);

	/**
	 * Returns the value of the '<em><b>State Factor Kinds</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * If not present, it must be assumed that the variable depends non-linearly on the states. Otherwise, the corresponding state x of the list enters the equation as:
	 * = "nonlinear": nonlinear factor, f(x)
	 * = "fixed"      : fixed factor, p*x
	 * = "discrete"  : discrete factor, d*x
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>State Factor Kinds</em>' attribute.
	 * @see #setStateFactorKinds(List)
	 * @see FmiModel.FmiModelPackage#getFmiVariableDependency_StateFactorKinds()
	 * @model dataType="FmiModel.StateFactorKindsType" many="false"
	 *        extendedMetaData="kind='attribute' name='stateFactorKinds' namespace='##targetNamespace'"
	 * @generated
	 */
	List<FmiDependencyFactorKind> getStateFactorKinds();

	/**
	 * Sets the value of the '{@link FmiModel.FmiVariableDependency#getStateFactorKinds <em>State Factor Kinds</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>State Factor Kinds</em>' attribute.
	 * @see #getStateFactorKinds()
	 * @generated
	 */
	void setStateFactorKinds(List<FmiDependencyFactorKind> value);

} // FmiVariableDependency
