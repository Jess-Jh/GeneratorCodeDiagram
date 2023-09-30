/**
 */
package uidiagram;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Group Row</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link uidiagram.GroupRow#getListTemplateWidget <em>List Template Widget</em>}</li>
 * </ul>
 *
 * @see uidiagram.UidiagramPackage#getGroupRow()
 * @model annotation="gmf.node label='name'"
 * @generated
 */
public interface GroupRow extends TemplateWidget {
	/**
	 * Returns the value of the '<em><b>List Template Widget</b></em>' containment reference list.
	 * The list contents are of type {@link uidiagram.TemplateWidget}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>List Template Widget</em>' containment reference list.
	 * @see uidiagram.UidiagramPackage#getGroupRow_ListTemplateWidget()
	 * @model containment="true"
	 *        annotation="gmf.compartment"
	 * @generated
	 */
	EList<TemplateWidget> getListTemplateWidget();

} // GroupRow
