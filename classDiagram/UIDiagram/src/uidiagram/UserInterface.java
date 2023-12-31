/**
 */
package uidiagram;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>User Interface</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link uidiagram.UserInterface#getIdInterface <em>Id Interface</em>}</li>
 *   <li>{@link uidiagram.UserInterface#getName <em>Name</em>}</li>
 *   <li>{@link uidiagram.UserInterface#getPositionX <em>Position X</em>}</li>
 *   <li>{@link uidiagram.UserInterface#getPositionY <em>Position Y</em>}</li>
 *   <li>{@link uidiagram.UserInterface#getWidth <em>Width</em>}</li>
 *   <li>{@link uidiagram.UserInterface#getHeight <em>Height</em>}</li>
 *   <li>{@link uidiagram.UserInterface#getBackgroundColor <em>Background Color</em>}</li>
 *   <li>{@link uidiagram.UserInterface#getListTemplateWidget <em>List Template Widget</em>}</li>
 * </ul>
 *
 * @see uidiagram.UidiagramPackage#getUserInterface()
 * @model annotation="gmf.node label='name'"
 * @generated
 */
public interface UserInterface extends EObject {
	/**
	 * Returns the value of the '<em><b>Id Interface</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id Interface</em>' attribute.
	 * @see #setIdInterface(String)
	 * @see uidiagram.UidiagramPackage#getUserInterface_IdInterface()
	 * @model
	 * @generated
	 */
	String getIdInterface();

	/**
	 * Sets the value of the '{@link uidiagram.UserInterface#getIdInterface <em>Id Interface</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id Interface</em>' attribute.
	 * @see #getIdInterface()
	 * @generated
	 */
	void setIdInterface(String value);

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see uidiagram.UidiagramPackage#getUserInterface_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link uidiagram.UserInterface#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Position X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Position X</em>' attribute.
	 * @see #setPositionX(int)
	 * @see uidiagram.UidiagramPackage#getUserInterface_PositionX()
	 * @model
	 * @generated
	 */
	int getPositionX();

	/**
	 * Sets the value of the '{@link uidiagram.UserInterface#getPositionX <em>Position X</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Position X</em>' attribute.
	 * @see #getPositionX()
	 * @generated
	 */
	void setPositionX(int value);

	/**
	 * Returns the value of the '<em><b>Position Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Position Y</em>' attribute.
	 * @see #setPositionY(int)
	 * @see uidiagram.UidiagramPackage#getUserInterface_PositionY()
	 * @model
	 * @generated
	 */
	int getPositionY();

	/**
	 * Sets the value of the '{@link uidiagram.UserInterface#getPositionY <em>Position Y</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Position Y</em>' attribute.
	 * @see #getPositionY()
	 * @generated
	 */
	void setPositionY(int value);

	/**
	 * Returns the value of the '<em><b>Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Width</em>' attribute.
	 * @see #setWidth(double)
	 * @see uidiagram.UidiagramPackage#getUserInterface_Width()
	 * @model
	 * @generated
	 */
	double getWidth();

	/**
	 * Sets the value of the '{@link uidiagram.UserInterface#getWidth <em>Width</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Width</em>' attribute.
	 * @see #getWidth()
	 * @generated
	 */
	void setWidth(double value);

	/**
	 * Returns the value of the '<em><b>Height</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Height</em>' attribute.
	 * @see #setHeight(double)
	 * @see uidiagram.UidiagramPackage#getUserInterface_Height()
	 * @model
	 * @generated
	 */
	double getHeight();

	/**
	 * Sets the value of the '{@link uidiagram.UserInterface#getHeight <em>Height</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Height</em>' attribute.
	 * @see #getHeight()
	 * @generated
	 */
	void setHeight(double value);

	/**
	 * Returns the value of the '<em><b>Background Color</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Background Color</em>' attribute.
	 * @see #setBackgroundColor(String)
	 * @see uidiagram.UidiagramPackage#getUserInterface_BackgroundColor()
	 * @model
	 * @generated
	 */
	String getBackgroundColor();

	/**
	 * Sets the value of the '{@link uidiagram.UserInterface#getBackgroundColor <em>Background Color</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Background Color</em>' attribute.
	 * @see #getBackgroundColor()
	 * @generated
	 */
	void setBackgroundColor(String value);

	/**
	 * Returns the value of the '<em><b>List Template Widget</b></em>' containment reference list.
	 * The list contents are of type {@link uidiagram.TemplateWidget}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>List Template Widget</em>' containment reference list.
	 * @see uidiagram.UidiagramPackage#getUserInterface_ListTemplateWidget()
	 * @model containment="true"
	 *        annotation="gmf.compartment"
	 * @generated
	 */
	EList<TemplateWidget> getListTemplateWidget();

} // UserInterface
