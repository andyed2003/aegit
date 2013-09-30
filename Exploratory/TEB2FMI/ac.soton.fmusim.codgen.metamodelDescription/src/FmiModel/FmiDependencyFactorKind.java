/**
 */
package FmiModel;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Fmi Dependency Factor Kind</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see FmiModel.FmiModelPackage#getFmiDependencyFactorKind()
 * @model extendedMetaData="name='fmiDependencyFactorKind'"
 * @generated
 */
public enum FmiDependencyFactorKind implements Enumerator {
	/**
	 * The '<em><b>Nonlinear</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NONLINEAR_VALUE
	 * @generated
	 * @ordered
	 */
	NONLINEAR(0, "nonlinear", "nonlinear"),

	/**
	 * The '<em><b>Fixed</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #FIXED_VALUE
	 * @generated
	 * @ordered
	 */
	FIXED(1, "fixed", "fixed"),

	/**
	 * The '<em><b>Discrete</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DISCRETE_VALUE
	 * @generated
	 * @ordered
	 */
	DISCRETE(2, "discrete", "discrete");

	/**
	 * The '<em><b>Nonlinear</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Nonlinear</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #NONLINEAR
	 * @model name="nonlinear"
	 * @generated
	 * @ordered
	 */
	public static final int NONLINEAR_VALUE = 0;

	/**
	 * The '<em><b>Fixed</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Fixed</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #FIXED
	 * @model name="fixed"
	 * @generated
	 * @ordered
	 */
	public static final int FIXED_VALUE = 1;

	/**
	 * The '<em><b>Discrete</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Discrete</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #DISCRETE
	 * @model name="discrete"
	 * @generated
	 * @ordered
	 */
	public static final int DISCRETE_VALUE = 2;

	/**
	 * An array of all the '<em><b>Fmi Dependency Factor Kind</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final FmiDependencyFactorKind[] VALUES_ARRAY =
		new FmiDependencyFactorKind[] {
			NONLINEAR,
			FIXED,
			DISCRETE,
		};

	/**
	 * A public read-only list of all the '<em><b>Fmi Dependency Factor Kind</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<FmiDependencyFactorKind> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Fmi Dependency Factor Kind</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static FmiDependencyFactorKind get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			FmiDependencyFactorKind result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Fmi Dependency Factor Kind</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static FmiDependencyFactorKind getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			FmiDependencyFactorKind result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Fmi Dependency Factor Kind</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static FmiDependencyFactorKind get(int value) {
		switch (value) {
			case NONLINEAR_VALUE: return NONLINEAR;
			case FIXED_VALUE: return FIXED;
			case DISCRETE_VALUE: return DISCRETE;
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final int value;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String name;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String literal;

	/**
	 * Only this class can construct instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private FmiDependencyFactorKind(int value, String name, String literal) {
		this.value = value;
		this.name = name;
		this.literal = literal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getValue() {
	  return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
	  return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLiteral() {
	  return literal;
	}

	/**
	 * Returns the literal value of the enumerator, which is its string representation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		return literal;
	}
	
} //FmiDependencyFactorKind
