/**
 */
package uidiagram;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Label</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link uidiagram.Label#getFontSize <em>Font Size</em>}</li>
 *   <li>{@link uidiagram.Label#getFontColor <em>Font Color</em>}</li>
 *   <li>{@link uidiagram.Label#getFontWeight <em>Font Weight</em>}</li>
 * </ul>
 *
 * @see uidiagram.UidiagramPackage#getLabel()
 * @model annotation="gmf.node label='name' border.width='0'"
 * @generated
 */
public interface Label extends TemplateWidget {

	/**
	 * Returns the value of the '<em><b>Font Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Font Size</em>' attribute.
	 * @see #setFontSize(String)
	 * @see uidiagram.UidiagramPackage#getLabel_FontSize()
	 * @model
	 * @generated
	 */
	String getFontSize();

	/**
	 * Returns the value of the '<em><b>Font Color</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Font Color</em>' attribute.
	 * @see #setFontColor(String)
	 * @see uidiagram.UidiagramPackage#getLabel_FontColor()
	 * @model
	 * @generated
	 */
	String getFontColor();

	/**
	 * Sets the value of the '{@link uidiagram.Label#getFontColor <em>Font Color</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Font Color</em>' attribute.
	 * @see #getFontColor()
	 * @generated
	 */
	void setFontColor(String value);

	/**
	 * Returns the value of the '<em><b>Font Weight</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Font Weight</em>' attribute.
	 * @see #setFontWeight(String)
	 * @see uidiagram.UidiagramPackage#getLabel_FontWeight()
	 * @model
	 * @generated
	 */
	String getFontWeight();

	/**
	 * Sets the value of the '{@link uidiagram.Label#getFontWeight <em>Font Weight</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Font Weight</em>' attribute.
	 * @see #getFontWeight()
	 * @generated
	 */
	void setFontWeight(String value);

	void setFontSize(String text);
} // Label
