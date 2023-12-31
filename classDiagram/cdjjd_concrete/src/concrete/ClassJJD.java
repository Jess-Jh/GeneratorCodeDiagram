/**
 */
package concrete;

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
 *   <li>{@link concrete.ClassJJD#getName <em>Name</em>}</li>
 *   <li>{@link concrete.ClassJJD#getDescription <em>Description</em>}</li>
 *   <li>{@link concrete.ClassJJD#isIsAbstract <em>Is Abstract</em>}</li>
 *   <li>{@link concrete.ClassJJD#getListAttributesJJD <em>List Attributes JJD</em>}</li>
 *   <li>{@link concrete.ClassJJD#getListMethodsJJD <em>List Methods JJD</em>}</li>
 * </ul>
 *
 * @see concrete.ConcretePackage#getClassJJD()
 * @model annotation="gmf.node label='name' color='205,234,239' border.color='0,0,0'"
 * @generated
 */
public interface ClassJJD extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see concrete.ConcretePackage#getClassJJD_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link concrete.ClassJJD#getName <em>Name</em>}' attribute.
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
	 * @see concrete.ConcretePackage#getClassJJD_Description()
	 * @model
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link concrete.ClassJJD#getDescription <em>Description</em>}' attribute.
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
	 * @see concrete.ConcretePackage#getClassJJD_IsAbstract()
	 * @model
	 * @generated
	 */
	boolean isIsAbstract();

	/**
	 * Sets the value of the '{@link concrete.ClassJJD#isIsAbstract <em>Is Abstract</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Abstract</em>' attribute.
	 * @see #isIsAbstract()
	 * @generated
	 */
	void setIsAbstract(boolean value);

	/**
	 * Returns the value of the '<em><b>List Attributes JJD</b></em>' containment reference list.
	 * The list contents are of type {@link concrete.AttributeJJD}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>List Attributes JJD</em>' containment reference list.
	 * @see concrete.ConcretePackage#getClassJJD_ListAttributesJJD()
	 * @model containment="true"
	 *        annotation="gmf.compartment layout='list'"
	 * @generated
	 */
	EList<AttributeJJD> getListAttributesJJD();

	/**
	 * Returns the value of the '<em><b>List Methods JJD</b></em>' containment reference list.
	 * The list contents are of type {@link concrete.MethodJJD}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>List Methods JJD</em>' containment reference list.
	 * @see concrete.ConcretePackage#getClassJJD_ListMethodsJJD()
	 * @model containment="true"
	 *        annotation="gmf.compartment layout='list'"
	 * @generated
	 */
	EList<MethodJJD> getListMethodsJJD();

} // ClassJJD
