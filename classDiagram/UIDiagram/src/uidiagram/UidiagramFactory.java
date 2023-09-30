/**
 */
package uidiagram;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see uidiagram.UidiagramPackage
 * @generated
 */
public interface UidiagramFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	UidiagramFactory eINSTANCE = uidiagram.impl.UidiagramFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Model Factory</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Model Factory</em>'.
	 * @generated
	 */
	ModelFactory createModelFactory();

	/**
	 * Returns a new object of class '<em>UI Diagram</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>UI Diagram</em>'.
	 * @generated
	 */
	UIDiagram createUIDiagram();

	/**
	 * Returns a new object of class '<em>Template Widget</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Template Widget</em>'.
	 * @generated
	 */
	TemplateWidget createTemplateWidget();

	/**
	 * Returns a new object of class '<em>User Interface</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>User Interface</em>'.
	 * @generated
	 */
	UserInterface createUserInterface();

	/**
	 * Returns a new object of class '<em>Group</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Group</em>'.
	 * @generated
	 */
	Group createGroup();

	/**
	 * Returns a new object of class '<em>Group Column</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Group Column</em>'.
	 * @generated
	 */
	GroupColumn createGroupColumn();

	/**
	 * Returns a new object of class '<em>Group Row</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Group Row</em>'.
	 * @generated
	 */
	GroupRow createGroupRow();

	/**
	 * Returns a new object of class '<em>Appbar</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Appbar</em>'.
	 * @generated
	 */
	Appbar createAppbar();

	/**
	 * Returns a new object of class '<em>Tabbar</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Tabbar</em>'.
	 * @generated
	 */
	Tabbar createTabbar();

	/**
	 * Returns a new object of class '<em>Button</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Button</em>'.
	 * @generated
	 */
	Button createButton();

	/**
	 * Returns a new object of class '<em>Label</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Label</em>'.
	 * @generated
	 */
	Label createLabel();

	/**
	 * Returns a new object of class '<em>Checkbox</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Checkbox</em>'.
	 * @generated
	 */
	Checkbox createCheckbox();

	/**
	 * Returns a new object of class '<em>Input</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Input</em>'.
	 * @generated
	 */
	Input createInput();

	/**
	 * Returns a new object of class '<em>List View</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>List View</em>'.
	 * @generated
	 */
	ListView createListView();

	/**
	 * Returns a new object of class '<em>Radio Button</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Radio Button</em>'.
	 * @generated
	 */
	RadioButton createRadioButton();

	/**
	 * Returns a new object of class '<em>Combo Box</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Combo Box</em>'.
	 * @generated
	 */
	ComboBox createComboBox();

	/**
	 * Returns a new object of class '<em>Date Picker</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Date Picker</em>'.
	 * @generated
	 */
	DatePicker createDatePicker();

	/**
	 * Returns a new object of class '<em>Switch</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Switch</em>'.
	 * @generated
	 */
	Switch createSwitch();

	/**
	 * Returns a new object of class '<em>Table</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Table</em>'.
	 * @generated
	 */
	Table createTable();

	/**
	 * Returns a new object of class '<em>Column</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Column</em>'.
	 * @generated
	 */
	Column createColumn();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	UidiagramPackage getUidiagramPackage();

} //UidiagramFactory
