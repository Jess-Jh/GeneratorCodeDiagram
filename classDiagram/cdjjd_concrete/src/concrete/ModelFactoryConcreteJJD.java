/**
 */
package concrete;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Model Factory Concrete JJD</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link concrete.ModelFactoryConcreteJJD#getName <em>Name</em>}</li>
 *   <li>{@link concrete.ModelFactoryConcreteJJD#getListClassDiagramJJD <em>List Class Diagram JJD</em>}</li>
 * </ul>
 *
 * @see concrete.ConcretePackage#getModelFactoryConcreteJJD()
 * @model
 * @generated
 */
public interface ModelFactoryConcreteJJD extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see concrete.ConcretePackage#getModelFactoryConcreteJJD_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link concrete.ModelFactoryConcreteJJD#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>List Class Diagram JJD</b></em>' containment reference list.
	 * The list contents are of type {@link concrete.ClassDiagramJJD}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>List Class Diagram JJD</em>' containment reference list.
	 * @see concrete.ConcretePackage#getModelFactoryConcreteJJD_ListClassDiagramJJD()
	 * @model containment="true"
	 * @generated
	 */
	EList<ClassDiagramJJD> getListClassDiagramJJD();

} // ModelFactoryConcreteJJD
