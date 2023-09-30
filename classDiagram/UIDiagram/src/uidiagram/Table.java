/**
 */
package uidiagram;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Table</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link uidiagram.Table#getListCoulmns <em>List Coulmns</em>}</li>
 * </ul>
 *
 * @see uidiagram.UidiagramPackage#getTable()
 * @model annotation="gmf.node label='name'"
 * @generated
 */
public interface Table extends TemplateWidget {
	/**
	 * Returns the value of the '<em><b>List Coulmns</b></em>' containment reference list.
	 * The list contents are of type {@link uidiagram.Column}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>List Coulmns</em>' containment reference list.
	 * @see uidiagram.UidiagramPackage#getTable_ListCoulmns()
	 * @model containment="true"
	 *        annotation="gmf.compartment"
	 * @generated
	 */
	EList<Column> getListCoulmns();

} // Table
