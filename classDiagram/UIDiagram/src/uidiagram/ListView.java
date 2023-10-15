/**
 */
package uidiagram;

import org.eclipse.emf.common.util.EList;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>List View</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link uidiagram.ListView#getTemplateWidget <em>Template Widget</em>}</li>
 * </ul>
 *
 * @see uidiagram.UidiagramPackage#getListView()
 * @model annotation="gmf.node label='name' border.width='0'"
 * @generated
 */
public interface ListView extends TemplateWidget {

	/**
	 * Returns the value of the '<em><b>Template Widget</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Template Widget</em>' containment reference.
	 * @see #setTemplateWidget(TemplateWidget)
	 * @see uidiagram.UidiagramPackage#getListView_TemplateWidget()
	 * @model containment="true"
	 *        annotation="gmf.compartment"
	 * @generated
	 */
	TemplateWidget getTemplateWidget();

	/**
	 * Sets the value of the '{@link uidiagram.ListView#getTemplateWidget <em>Template Widget</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Template Widget</em>' containment reference.
	 * @see #getTemplateWidget()
	 * @generated
	 */
	void setTemplateWidget(TemplateWidget value);
} // ListView
