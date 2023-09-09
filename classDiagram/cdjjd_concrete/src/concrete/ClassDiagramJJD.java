/**
 */
package concrete;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Class Diagram JJD</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link concrete.ClassDiagramJJD#getName <em>Name</em>}</li>
 *   <li>{@link concrete.ClassDiagramJJD#getListPackagesJJD <em>List Packages JJD</em>}</li>
 *   <li>{@link concrete.ClassDiagramJJD#getListClassJJD <em>List Class JJD</em>}</li>
 *   <li>{@link concrete.ClassDiagramJJD#getListRelationsJJD <em>List Relations JJD</em>}</li>
 * </ul>
 *
 * @see concrete.ConcretePackage#getClassDiagramJJD()
 * @model annotation="gmf.diagram"
 * @generated
 */
public interface ClassDiagramJJD extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see concrete.ConcretePackage#getClassDiagramJJD_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link concrete.ClassDiagramJJD#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>List Packages JJD</b></em>' containment reference list.
	 * The list contents are of type {@link concrete.PackageJJD}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>List Packages JJD</em>' containment reference list.
	 * @see concrete.ConcretePackage#getClassDiagramJJD_ListPackagesJJD()
	 * @model containment="true"
	 * @generated
	 */
	EList<PackageJJD> getListPackagesJJD();

	/**
	 * Returns the value of the '<em><b>List Class JJD</b></em>' containment reference list.
	 * The list contents are of type {@link concrete.ClassJJD}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>List Class JJD</em>' containment reference list.
	 * @see concrete.ConcretePackage#getClassDiagramJJD_ListClassJJD()
	 * @model containment="true"
	 * @generated
	 */
	EList<ClassJJD> getListClassJJD();

	/**
	 * Returns the value of the '<em><b>List Relations JJD</b></em>' containment reference list.
	 * The list contents are of type {@link concrete.RelationJJD}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>List Relations JJD</em>' containment reference list.
	 * @see concrete.ConcretePackage#getClassDiagramJJD_ListRelationsJJD()
	 * @model containment="true"
	 * @generated
	 */
	EList<RelationJJD> getListRelationsJJD();

} // ClassDiagramJJD
