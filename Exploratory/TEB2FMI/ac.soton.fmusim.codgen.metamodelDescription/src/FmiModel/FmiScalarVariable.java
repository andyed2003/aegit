/**
 */
package FmiModel;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Fmi Scalar Variable</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Properties of a scalar variable
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link FmiModel.FmiScalarVariable#getReal <em>Real</em>}</li>
 *   <li>{@link FmiModel.FmiScalarVariable#getInteger <em>Integer</em>}</li>
 *   <li>{@link FmiModel.FmiScalarVariable#getBoolean <em>Boolean</em>}</li>
 *   <li>{@link FmiModel.FmiScalarVariable#getString <em>String</em>}</li>
 *   <li>{@link FmiModel.FmiScalarVariable#getEnumeration <em>Enumeration</em>}</li>
 *   <li>{@link FmiModel.FmiScalarVariable#getAnnotations <em>Annotations</em>}</li>
 *   <li>{@link FmiModel.FmiScalarVariable#getCausality <em>Causality</em>}</li>
 *   <li>{@link FmiModel.FmiScalarVariable#getDescription <em>Description</em>}</li>
 *   <li>{@link FmiModel.FmiScalarVariable#getInitial <em>Initial</em>}</li>
 *   <li>{@link FmiModel.FmiScalarVariable#getName <em>Name</em>}</li>
 *   <li>{@link FmiModel.FmiScalarVariable#getValueReference <em>Value Reference</em>}</li>
 *   <li>{@link FmiModel.FmiScalarVariable#getVariability <em>Variability</em>}</li>
 * </ul>
 * </p>
 *
 * @see FmiModel.FmiModelPackage#getFmiScalarVariable()
 * @model extendedMetaData="name='fmiScalarVariable' kind='elementOnly'"
 * @generated
 */
public interface FmiScalarVariable extends EObject {
	/**
	 * Returns the value of the '<em><b>Real</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Real</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Real</em>' containment reference.
	 * @see #setReal(RealType1)
	 * @see FmiModel.FmiModelPackage#getFmiScalarVariable_Real()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Real' namespace='##targetNamespace'"
	 * @generated
	 */
	RealType1 getReal();

	/**
	 * Sets the value of the '{@link FmiModel.FmiScalarVariable#getReal <em>Real</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Real</em>' containment reference.
	 * @see #getReal()
	 * @generated
	 */
	void setReal(RealType1 value);

	/**
	 * Returns the value of the '<em><b>Integer</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Integer</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Integer</em>' containment reference.
	 * @see #setInteger(IntegerType)
	 * @see FmiModel.FmiModelPackage#getFmiScalarVariable_Integer()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Integer' namespace='##targetNamespace'"
	 * @generated
	 */
	IntegerType getInteger();

	/**
	 * Sets the value of the '{@link FmiModel.FmiScalarVariable#getInteger <em>Integer</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Integer</em>' containment reference.
	 * @see #getInteger()
	 * @generated
	 */
	void setInteger(IntegerType value);

	/**
	 * Returns the value of the '<em><b>Boolean</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Boolean</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Boolean</em>' containment reference.
	 * @see #setBoolean(BooleanType)
	 * @see FmiModel.FmiModelPackage#getFmiScalarVariable_Boolean()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Boolean' namespace='##targetNamespace'"
	 * @generated
	 */
	BooleanType getBoolean();

	/**
	 * Sets the value of the '{@link FmiModel.FmiScalarVariable#getBoolean <em>Boolean</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Boolean</em>' containment reference.
	 * @see #getBoolean()
	 * @generated
	 */
	void setBoolean(BooleanType value);

	/**
	 * Returns the value of the '<em><b>String</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>String</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>String</em>' containment reference.
	 * @see #setString(StringType)
	 * @see FmiModel.FmiModelPackage#getFmiScalarVariable_String()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='String' namespace='##targetNamespace'"
	 * @generated
	 */
	StringType getString();

	/**
	 * Sets the value of the '{@link FmiModel.FmiScalarVariable#getString <em>String</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>String</em>' containment reference.
	 * @see #getString()
	 * @generated
	 */
	void setString(StringType value);

	/**
	 * Returns the value of the '<em><b>Enumeration</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Enumeration</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Enumeration</em>' containment reference.
	 * @see #setEnumeration(EnumerationType)
	 * @see FmiModel.FmiModelPackage#getFmiScalarVariable_Enumeration()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Enumeration' namespace='##targetNamespace'"
	 * @generated
	 */
	EnumerationType getEnumeration();

	/**
	 * Sets the value of the '{@link FmiModel.FmiScalarVariable#getEnumeration <em>Enumeration</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Enumeration</em>' containment reference.
	 * @see #getEnumeration()
	 * @generated
	 */
	void setEnumeration(EnumerationType value);

	/**
	 * Returns the value of the '<em><b>Annotations</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Additional data of the scalar variable, e.g., for the dialog menu or the graphical layout
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Annotations</em>' containment reference.
	 * @see #setAnnotations(FmiAnnotation)
	 * @see FmiModel.FmiModelPackage#getFmiScalarVariable_Annotations()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Annotations' namespace='##targetNamespace'"
	 * @generated
	 */
	FmiAnnotation getAnnotations();

	/**
	 * Sets the value of the '{@link FmiModel.FmiScalarVariable#getAnnotations <em>Annotations</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Annotations</em>' containment reference.
	 * @see #getAnnotations()
	 * @generated
	 */
	void setAnnotations(FmiAnnotation value);

	/**
	 * Returns the value of the '<em><b>Causality</b></em>' attribute.
	 * The default value is <code>"local"</code>.
	 * The literals are from the enumeration {@link FmiModel.CausalityType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * parameter: independent parameter
	 * input/output: can be used in connections 
	 * local: dependent variable calculated from other variables
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Causality</em>' attribute.
	 * @see FmiModel.CausalityType
	 * @see #isSetCausality()
	 * @see #unsetCausality()
	 * @see #setCausality(CausalityType)
	 * @see FmiModel.FmiModelPackage#getFmiScalarVariable_Causality()
	 * @model default="local" unsettable="true"
	 *        extendedMetaData="kind='attribute' name='causality' namespace='##targetNamespace'"
	 * @generated
	 */
	CausalityType getCausality();

	/**
	 * Sets the value of the '{@link FmiModel.FmiScalarVariable#getCausality <em>Causality</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Causality</em>' attribute.
	 * @see FmiModel.CausalityType
	 * @see #isSetCausality()
	 * @see #unsetCausality()
	 * @see #getCausality()
	 * @generated
	 */
	void setCausality(CausalityType value);

	/**
	 * Unsets the value of the '{@link FmiModel.FmiScalarVariable#getCausality <em>Causality</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetCausality()
	 * @see #getCausality()
	 * @see #setCausality(CausalityType)
	 * @generated
	 */
	void unsetCausality();

	/**
	 * Returns whether the value of the '{@link FmiModel.FmiScalarVariable#getCausality <em>Causality</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Causality</em>' attribute is set.
	 * @see #unsetCausality()
	 * @see #getCausality()
	 * @see #setCausality(CausalityType)
	 * @generated
	 */
	boolean isSetCausality();

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
	 * @see FmiModel.FmiModelPackage#getFmiScalarVariable_Description()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='description' namespace='##targetNamespace'"
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link FmiModel.FmiScalarVariable#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

	/**
	 * Returns the value of the '<em><b>Initial</b></em>' attribute.
	 * The literals are from the enumeration {@link FmiModel.InitialType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Defines variable initialization. If not provided, initial is deduced from causality and variability (details see specification)
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Initial</em>' attribute.
	 * @see FmiModel.InitialType
	 * @see #isSetInitial()
	 * @see #unsetInitial()
	 * @see #setInitial(InitialType)
	 * @see FmiModel.FmiModelPackage#getFmiScalarVariable_Initial()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='attribute' name='initial' namespace='##targetNamespace'"
	 * @generated
	 */
	InitialType getInitial();

	/**
	 * Sets the value of the '{@link FmiModel.FmiScalarVariable#getInitial <em>Initial</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Initial</em>' attribute.
	 * @see FmiModel.InitialType
	 * @see #isSetInitial()
	 * @see #unsetInitial()
	 * @see #getInitial()
	 * @generated
	 */
	void setInitial(InitialType value);

	/**
	 * Unsets the value of the '{@link FmiModel.FmiScalarVariable#getInitial <em>Initial</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetInitial()
	 * @see #getInitial()
	 * @see #setInitial(InitialType)
	 * @generated
	 */
	void unsetInitial();

	/**
	 * Returns whether the value of the '{@link FmiModel.FmiScalarVariable#getInitial <em>Initial</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Initial</em>' attribute is set.
	 * @see #unsetInitial()
	 * @see #getInitial()
	 * @see #setInitial(InitialType)
	 * @generated
	 */
	boolean isSetInitial();

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Unique identifier of variable, e.g. "a.b.mod[3,4].'#123'.c"
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see FmiModel.FmiModelPackage#getFmiScalarVariable_Name()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.NormalizedString" required="true"
	 *        extendedMetaData="kind='attribute' name='name' namespace='##targetNamespace'"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link FmiModel.FmiScalarVariable#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Value Reference</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Required for FMI: Identifier for variable value in FMI function calls (not necessarily unique with respect to all variables)
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Value Reference</em>' attribute.
	 * @see #isSetValueReference()
	 * @see #unsetValueReference()
	 * @see #setValueReference(long)
	 * @see FmiModel.FmiModelPackage#getFmiScalarVariable_ValueReference()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.UnsignedInt"
	 *        extendedMetaData="kind='attribute' name='valueReference' namespace='##targetNamespace'"
	 * @generated
	 */
	long getValueReference();

	/**
	 * Sets the value of the '{@link FmiModel.FmiScalarVariable#getValueReference <em>Value Reference</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value Reference</em>' attribute.
	 * @see #isSetValueReference()
	 * @see #unsetValueReference()
	 * @see #getValueReference()
	 * @generated
	 */
	void setValueReference(long value);

	/**
	 * Unsets the value of the '{@link FmiModel.FmiScalarVariable#getValueReference <em>Value Reference</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetValueReference()
	 * @see #getValueReference()
	 * @see #setValueReference(long)
	 * @generated
	 */
	void unsetValueReference();

	/**
	 * Returns whether the value of the '{@link FmiModel.FmiScalarVariable#getValueReference <em>Value Reference</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Value Reference</em>' attribute is set.
	 * @see #unsetValueReference()
	 * @see #getValueReference()
	 * @see #setValueReference(long)
	 * @generated
	 */
	boolean isSetValueReference();

	/**
	 * Returns the value of the '<em><b>Variability</b></em>' attribute.
	 * The default value is <code>""</code>.
	 * The literals are from the enumeration {@link FmiModel.VariabilityType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Variability</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Variability</em>' attribute.
	 * @see FmiModel.VariabilityType
	 * @see #isSetVariability()
	 * @see #unsetVariability()
	 * @see #setVariability(VariabilityType)
	 * @see FmiModel.FmiModelPackage#getFmiScalarVariable_Variability()
	 * @model default="" unsettable="true"
	 *        extendedMetaData="kind='attribute' name='variability' namespace='##targetNamespace'"
	 * @generated
	 */
	VariabilityType getVariability();

	/**
	 * Sets the value of the '{@link FmiModel.FmiScalarVariable#getVariability <em>Variability</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Variability</em>' attribute.
	 * @see FmiModel.VariabilityType
	 * @see #isSetVariability()
	 * @see #unsetVariability()
	 * @see #getVariability()
	 * @generated
	 */
	void setVariability(VariabilityType value);

	/**
	 * Unsets the value of the '{@link FmiModel.FmiScalarVariable#getVariability <em>Variability</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetVariability()
	 * @see #getVariability()
	 * @see #setVariability(VariabilityType)
	 * @generated
	 */
	void unsetVariability();

	/**
	 * Returns whether the value of the '{@link FmiModel.FmiScalarVariable#getVariability <em>Variability</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Variability</em>' attribute is set.
	 * @see #unsetVariability()
	 * @see #getVariability()
	 * @see #setVariability(VariabilityType)
	 * @generated
	 */
	boolean isSetVariability();

} // FmiScalarVariable
