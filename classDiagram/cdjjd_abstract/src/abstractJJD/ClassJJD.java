/**
 */
package abstractJJD;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Class JJD</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link abstractJJD.ClassJJD#getName <em>Name</em>}</li>
 *   <li>{@link abstractJJD.ClassJJD#getDescription <em>Description</em>}</li>
 *   <li>{@link abstractJJD.ClassJJD#isIsAbstract <em>Is Abstract</em>}</li>
 *   <li>{@link abstractJJD.ClassJJD#getListAttributesJJD <em>List Attributes JJD</em>}</li>
 *   <li>{@link abstractJJD.ClassJJD#getListMethodsJJD <em>List Methods JJD</em>}</li>
 *   <li>{@link abstractJJD.ClassJJD#getListRelationsJJD <em>List Relations JJD</em>}</li>
 * </ul>
 *
 * @see abstractJJD.AbstractJJDPackage#getClassJJD()
 * @model
 * @generated
 */
public interface ClassJJD extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see abstractJJD.AbstractJJDPackage#getClassJJD_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link abstractJJD.ClassJJD#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Description</em>' attribute.
	 * @see #setDescription(String)
	 * @see abstractJJD.AbstractJJDPackage#getClassJJD_Description()
	 * @model
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link abstractJJD.ClassJJD#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

	/**
	 * Returns the value of the '<em><b>Is Abstract</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Abstract</em>' attribute.
	 * @see #setIsAbstract(boolean)
	 * @see abstractJJD.AbstractJJDPackage#getClassJJD_IsAbstract()
	 * @model
	 * @generated
	 */
	boolean isIsAbstract();

	/**
	 * Sets the value of the '{@link abstractJJD.ClassJJD#isIsAbstract <em>Is Abstract</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Abstract</em>' attribute.
	 * @see #isIsAbstract()
	 * @generated
	 */
	void setIsAbstract(boolean value);

	/**
	 * Returns the value of the '<em><b>List Attributes JJD</b></em>' containment reference list.
	 * The list contents are of type {@link abstractJJD.AttributeJJD}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>List Attributes JJD</em>' containment reference list.
	 * @see abstractJJD.AbstractJJDPackage#getClassJJD_ListAttributesJJD()
	 * @model containment="true"
	 * @generated
	 */
	EList<AttributeJJD> getListAttributesJJD();

	/**
	 * Returns the value of the '<em><b>List Methods JJD</b></em>' containment reference list.
	 * The list contents are of type {@link abstractJJD.MethodJJD}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>List Methods JJD</em>' containment reference list.
	 * @see abstractJJD.AbstractJJDPackage#getClassJJD_ListMethodsJJD()
	 * @model containment="true"
	 * @generated
	 */
	EList<MethodJJD> getListMethodsJJD();

	/**
	 * Returns the value of the '<em><b>List Relations JJD</b></em>' containment reference list.
	 * The list contents are of type {@link abstractJJD.RelationJJD}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>List Relations JJD</em>' containment reference list.
	 * @see abstractJJD.AbstractJJDPackage#getClassJJD_ListRelationsJJD()
	 * @model containment="true"
	 * @generated
	 */
	EList<RelationJJD> getListRelationsJJD();

} // ClassJJD
