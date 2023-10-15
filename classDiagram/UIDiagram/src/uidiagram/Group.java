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
 *   <li>{@link uidiagram.Group#getBorderRadius <em>Border Radius</em>}</li>
 *   <li>{@link uidiagram.Group#getBorderWidth <em>Border Width</em>}</li>
 *   <li>{@link uidiagram.Group#getBorderColor <em>Border Color</em>}</li>
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

	/**
	 * Returns the value of the '<em><b>Border Radius</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Border Radius</em>' attribute.
	 * @see #setBorderRadius(String)
	 * @see uidiagram.UidiagramPackage#getGroup_BorderRadius()
	 * @model
	 * @generated
	 */
	String getBorderRadius();

	/**
	 * Sets the value of the '{@link uidiagram.Group#getBorderRadius <em>Border Radius</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Border Radius</em>' attribute.
	 * @see #getBorderRadius()
	 * @generated
	 */
	void setBorderRadius(String value);

	/**
	 * Returns the value of the '<em><b>Border Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Border Width</em>' attribute.
	 * @see #setBorderWidth(String)
	 * @see uidiagram.UidiagramPackage#getGroup_BorderWidth()
	 * @model
	 * @generated
	 */
	String getBorderWidth();

	/**
	 * Sets the value of the '{@link uidiagram.Group#getBorderWidth <em>Border Width</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Border Width</em>' attribute.
	 * @see #getBorderWidth()
	 * @generated
	 */
	void setBorderWidth(String value);

	/**
	 * Returns the value of the '<em><b>Border Color</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Border Color</em>' attribute.
	 * @see #setBorderColor(String)
	 * @see uidiagram.UidiagramPackage#getGroup_BorderColor()
	 * @model
	 * @generated
	 */
	String getBorderColor();

	/**
	 * Sets the value of the '{@link uidiagram.Group#getBorderColor <em>Border Color</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Border Color</em>' attribute.
	 * @see #getBorderColor()
	 * @generated
	 */
	void setBorderColor(String value);

} // Group
