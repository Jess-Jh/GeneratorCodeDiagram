/**
 */
package uidiagram;

import org.eclipse.emf.common.util.EList;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Appbar</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link uidiagram.Appbar#getListButtons <em>List Buttons</em>}</li>
 *   <li>{@link uidiagram.Appbar#getListLabels <em>List Labels</em>}</li>
 * </ul>
 *
 * @see uidiagram.UidiagramPackage#getAppbar()
 * @model annotation="gmf.node label='name'"
 * @generated
 */
public interface Appbar extends TemplateWidget {

	/**
	 * Returns the value of the '<em><b>List Buttons</b></em>' containment reference list.
	 * The list contents are of type {@link uidiagram.Button}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>List Buttons</em>' containment reference list.
	 * @see uidiagram.UidiagramPackage#getAppbar_ListButtons()
	 * @model containment="true"
	 *        annotation="gmf.compartment"
	 * @generated
	 */
	EList<Button> getListButtons();

	/**
	 * Returns the value of the '<em><b>List Labels</b></em>' containment reference list.
	 * The list contents are of type {@link uidiagram.Label}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>List Labels</em>' containment reference list.
	 * @see uidiagram.UidiagramPackage#getAppbar_ListLabels()
	 * @model containment="true"
	 *        annotation="gmf.compartment"
	 * @generated
	 */
	EList<Label> getListLabels();
} // Appbar
