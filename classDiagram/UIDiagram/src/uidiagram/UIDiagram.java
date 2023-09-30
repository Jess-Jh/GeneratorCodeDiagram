/**
 */
package uidiagram;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>UI Diagram</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link uidiagram.UIDiagram#getName <em>Name</em>}</li>
 *   <li>{@link uidiagram.UIDiagram#getUserInterface <em>User Interface</em>}</li>
 * </ul>
 *
 * @see uidiagram.UidiagramPackage#getUIDiagram()
 * @model annotation="gmf.diagram"
 * @generated
 */
public interface UIDiagram extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see uidiagram.UidiagramPackage#getUIDiagram_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link uidiagram.UIDiagram#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>User Interface</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>User Interface</em>' containment reference.
	 * @see #setUserInterface(UserInterface)
	 * @see uidiagram.UidiagramPackage#getUIDiagram_UserInterface()
	 * @model containment="true"
	 * @generated
	 */
	UserInterface getUserInterface();

	/**
	 * Sets the value of the '{@link uidiagram.UIDiagram#getUserInterface <em>User Interface</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>User Interface</em>' containment reference.
	 * @see #getUserInterface()
	 * @generated
	 */
	void setUserInterface(UserInterface value);

} // UIDiagram
