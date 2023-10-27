/**
 */
package relationalmodel;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Model Factory Abstract Relational Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link relationalmodel.ModelFactoryAbstractRelationalModel#getName <em>Name</em>}</li>
 *   <li>{@link relationalmodel.ModelFactoryAbstractRelationalModel#getListSchemas <em>List Schemas</em>}</li>
 * </ul>
 *
 * @see relationalmodel.RelationalmodelPackage#getModelFactoryAbstractRelationalModel()
 * @model
 * @generated
 */
public interface ModelFactoryAbstractRelationalModel extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see relationalmodel.RelationalmodelPackage#getModelFactoryAbstractRelationalModel_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link relationalmodel.ModelFactoryAbstractRelationalModel#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>List Schemas</b></em>' containment reference list.
	 * The list contents are of type {@link relationalmodel.Schema}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>List Schemas</em>' containment reference list.
	 * @see relationalmodel.RelationalmodelPackage#getModelFactoryAbstractRelationalModel_ListSchemas()
	 * @model containment="true"
	 * @generated
	 */
	EList<Schema> getListSchemas();

} // ModelFactoryAbstractRelationalModel
