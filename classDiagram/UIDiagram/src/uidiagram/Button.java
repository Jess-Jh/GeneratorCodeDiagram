/**
 */
package uidiagram;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Button</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link uidiagram.Button#getNavigateTo <em>Navigate To</em>}</li>
 * </ul>
 *
 * @see uidiagram.UidiagramPackage#getButton()
 * @model annotation="gmf.node label='name'"
 * @generated
 */
public interface Button extends TemplateWidget {

	/**
	 * Returns the value of the '<em><b>Navigate To</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Navigate To</em>' attribute.
	 * @see #setNavigateTo(String)
	 * @see uidiagram.UidiagramPackage#getButton_NavigateTo()
	 * @model
	 * @generated
	 */
	String getNavigateTo();

	/**
	 * Sets the value of the '{@link uidiagram.Button#getNavigateTo <em>Navigate To</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Navigate To</em>' attribute.
	 * @see #getNavigateTo()
	 * @generated
	 */
	void setNavigateTo(String value);
} // Button
