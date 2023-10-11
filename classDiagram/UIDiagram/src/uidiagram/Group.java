/**
 */
package uidiagram;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Group</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link uidiagram.Group#getListTemplateWidget <em>List Template Widget</em>}</li>
 * </ul>
 *
 * @see uidiagram.UidiagramPackage#getGroup()
 * @model annotation="gmf.node label='name' border.width='0'"
 * @generated
 */
public interface Group extends TemplateWidget {
	/**
	 * Returns the value of the '<em><b>List Template Widget</b></em>' containment reference list.
	 * The list contents are of type {@link uidiagram.TemplateWidget}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>List Template Widget</em>' containment reference list.
	 * @see uidiagram.UidiagramPackage#getGroup_ListTemplateWidget()
	 * @model containment="true"
	 *        annotation="gmf.compartment"
	 * @generated
	 */
	EList<TemplateWidget> getListTemplateWidget();

} // Group
