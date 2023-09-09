/**
 */
package concrete;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Package JJD</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link concrete.PackageJJD#getName <em>Name</em>}</li>
 *   <li>{@link concrete.PackageJJD#getNameSpace <em>Name Space</em>}</li>
 *   <li>{@link concrete.PackageJJD#getSubPackagesJJD <em>Sub Packages JJD</em>}</li>
 *   <li>{@link concrete.PackageJJD#getListClassJJD <em>List Class JJD</em>}</li>
 * </ul>
 *
 * @see concrete.ConcretePackage#getPackageJJD()
 * @model annotation="gmf.node label='name'"
 * @generated
 */
public interface PackageJJD extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see concrete.ConcretePackage#getPackageJJD_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link concrete.PackageJJD#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Name Space</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name Space</em>' attribute.
	 * @see #setNameSpace(String)
	 * @see concrete.ConcretePackage#getPackageJJD_NameSpace()
	 * @model
	 * @generated
	 */
	String getNameSpace();

	/**
	 * Sets the value of the '{@link concrete.PackageJJD#getNameSpace <em>Name Space</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name Space</em>' attribute.
	 * @see #getNameSpace()
	 * @generated
	 */
	void setNameSpace(String value);

	/**
	 * Returns the value of the '<em><b>Sub Packages JJD</b></em>' containment reference list.
	 * The list contents are of type {@link concrete.PackageJJD}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sub Packages JJD</em>' containment reference list.
	 * @see concrete.ConcretePackage#getPackageJJD_SubPackagesJJD()
	 * @model containment="true"
	 *        annotation="gmf.compartment"
	 * @generated
	 */
	EList<PackageJJD> getSubPackagesJJD();

	/**
	 * Returns the value of the '<em><b>List Class JJD</b></em>' containment reference list.
	 * The list contents are of type {@link concrete.ClassJJD}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>List Class JJD</em>' containment reference list.
	 * @see concrete.ConcretePackage#getPackageJJD_ListClassJJD()
	 * @model containment="true"
	 *        annotation="gmf.compartment"
	 * @generated
	 */
	EList<ClassJJD> getListClassJJD();

} // PackageJJD
