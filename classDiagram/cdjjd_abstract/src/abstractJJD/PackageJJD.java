/**
 */
package abstractJJD;

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
 *   <li>{@link abstractJJD.PackageJJD#getName <em>Name</em>}</li>
 *   <li>{@link abstractJJD.PackageJJD#getNameSpace <em>Name Space</em>}</li>
 *   <li>{@link abstractJJD.PackageJJD#getSubPackagesJJD <em>Sub Packages JJD</em>}</li>
 *   <li>{@link abstractJJD.PackageJJD#getListClassJJD <em>List Class JJD</em>}</li>
 * </ul>
 *
 * @see abstractJJD.AbstractJJDPackage#getPackageJJD()
 * @model
 * @generated
 */
public interface PackageJJD extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see abstractJJD.AbstractJJDPackage#getPackageJJD_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link abstractJJD.PackageJJD#getName <em>Name</em>}' attribute.
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
	 * @see abstractJJD.AbstractJJDPackage#getPackageJJD_NameSpace()
	 * @model
	 * @generated
	 */
	String getNameSpace();

	/**
	 * Sets the value of the '{@link abstractJJD.PackageJJD#getNameSpace <em>Name Space</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name Space</em>' attribute.
	 * @see #getNameSpace()
	 * @generated
	 */
	void setNameSpace(String value);

	/**
	 * Returns the value of the '<em><b>Sub Packages JJD</b></em>' containment reference list.
	 * The list contents are of type {@link abstractJJD.PackageJJD}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sub Packages JJD</em>' containment reference list.
	 * @see abstractJJD.AbstractJJDPackage#getPackageJJD_SubPackagesJJD()
	 * @model containment="true"
	 * @generated
	 */
	EList<PackageJJD> getSubPackagesJJD();

	/**
	 * Returns the value of the '<em><b>List Class JJD</b></em>' containment reference list.
	 * The list contents are of type {@link abstractJJD.ClassJJD}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>List Class JJD</em>' containment reference list.
	 * @see abstractJJD.AbstractJJDPackage#getPackageJJD_ListClassJJD()
	 * @model containment="true"
	 * @generated
	 */
	EList<ClassJJD> getListClassJJD();

} // PackageJJD
