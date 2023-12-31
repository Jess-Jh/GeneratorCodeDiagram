/**
 */
package abstractJJD;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Method JJD</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link abstractJJD.MethodJJD#getName <em>Name</em>}</li>
 *   <li>{@link abstractJJD.MethodJJD#getModifier <em>Modifier</em>}</li>
 *   <li>{@link abstractJJD.MethodJJD#getSemantic <em>Semantic</em>}</li>
 *   <li>{@link abstractJJD.MethodJJD#getReturnType <em>Return Type</em>}</li>
 *   <li>{@link abstractJJD.MethodJJD#getListAttributesJJD <em>List Attributes JJD</em>}</li>
 * </ul>
 *
 * @see abstractJJD.AbstractJJDPackage#getMethodJJD()
 * @model
 * @generated
 */
public interface MethodJJD extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see abstractJJD.AbstractJJDPackage#getMethodJJD_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link abstractJJD.MethodJJD#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Modifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Modifier</em>' attribute.
	 * @see #setModifier(String)
	 * @see abstractJJD.AbstractJJDPackage#getMethodJJD_Modifier()
	 * @model
	 * @generated
	 */
	String getModifier();

	/**
	 * Sets the value of the '{@link abstractJJD.MethodJJD#getModifier <em>Modifier</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Modifier</em>' attribute.
	 * @see #getModifier()
	 * @generated
	 */
	void setModifier(String value);

	/**
	 * Returns the value of the '<em><b>Semantic</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Semantic</em>' attribute.
	 * @see #setSemantic(String)
	 * @see abstractJJD.AbstractJJDPackage#getMethodJJD_Semantic()
	 * @model
	 * @generated
	 */
	String getSemantic();

	/**
	 * Sets the value of the '{@link abstractJJD.MethodJJD#getSemantic <em>Semantic</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Semantic</em>' attribute.
	 * @see #getSemantic()
	 * @generated
	 */
	void setSemantic(String value);

	/**
	 * Returns the value of the '<em><b>Return Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Return Type</em>' attribute.
	 * @see #setReturnType(String)
	 * @see abstractJJD.AbstractJJDPackage#getMethodJJD_ReturnType()
	 * @model
	 * @generated
	 */
	String getReturnType();

	/**
	 * Sets the value of the '{@link abstractJJD.MethodJJD#getReturnType <em>Return Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Return Type</em>' attribute.
	 * @see #getReturnType()
	 * @generated
	 */
	void setReturnType(String value);

	/**
	 * Returns the value of the '<em><b>List Attributes JJD</b></em>' containment reference list.
	 * The list contents are of type {@link abstractJJD.AttributeJJD}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>List Attributes JJD</em>' containment reference list.
	 * @see abstractJJD.AbstractJJDPackage#getMethodJJD_ListAttributesJJD()
	 * @model containment="true"
	 * @generated
	 */
	EList<AttributeJJD> getListAttributesJJD();

} // MethodJJD
