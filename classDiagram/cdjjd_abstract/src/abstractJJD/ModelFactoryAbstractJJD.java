/**
 */
package abstractJJD;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Model Factory Abstract JJD</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link abstractJJD.ModelFactoryAbstractJJD#getName <em>Name</em>}</li>
 *   <li>{@link abstractJJD.ModelFactoryAbstractJJD#getListPackagesJJD <em>List Packages JJD</em>}</li>
 * </ul>
 *
 * @see abstractJJD.AbstractJJDPackage#getModelFactoryAbstractJJD()
 * @model
 * @generated
 */
public interface ModelFactoryAbstractJJD extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see abstractJJD.AbstractJJDPackage#getModelFactoryAbstractJJD_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link abstractJJD.ModelFactoryAbstractJJD#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>List Packages JJD</b></em>' containment reference list.
	 * The list contents are of type {@link abstractJJD.PackageJJD}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>List Packages JJD</em>' containment reference list.
	 * @see abstractJJD.AbstractJJDPackage#getModelFactoryAbstractJJD_ListPackagesJJD()
	 * @model containment="true"
	 * @generated
	 */
	EList<PackageJJD> getListPackagesJJD();

} // ModelFactoryAbstractJJD
