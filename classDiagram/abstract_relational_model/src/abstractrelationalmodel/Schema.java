/**
 */
package abstractrelationalmodel;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Schema</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link abstractrelationalmodel.Schema#getName <em>Name</em>}</li>
 *   <li>{@link abstractrelationalmodel.Schema#getListTables <em>List Tables</em>}</li>
 *   <li>{@link abstractrelationalmodel.Schema#getRelationTables <em>Relation Tables</em>}</li>
 * </ul>
 *
 * @see abstractrelationalmodel.AbstractrelationalmodelPackage#getSchema()
 * @model
 * @generated
 */
public interface Schema extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see abstractrelationalmodel.AbstractrelationalmodelPackage#getSchema_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link abstractrelationalmodel.Schema#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>List Tables</b></em>' containment reference list.
	 * The list contents are of type {@link abstractrelationalmodel.Table}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>List Tables</em>' containment reference list.
	 * @see abstractrelationalmodel.AbstractrelationalmodelPackage#getSchema_ListTables()
	 * @model containment="true"
	 * @generated
	 */
	EList<Table> getListTables();

	/**
	 * Returns the value of the '<em><b>Relation Tables</b></em>' containment reference list.
	 * The list contents are of type {@link abstractrelationalmodel.RelationTables}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Relation Tables</em>' containment reference list.
	 * @see abstractrelationalmodel.AbstractrelationalmodelPackage#getSchema_RelationTables()
	 * @model containment="true"
	 * @generated
	 */
	EList<RelationTables> getRelationTables();

} // Schema
