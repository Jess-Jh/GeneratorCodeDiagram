/**
 */
package uidiagram.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

import uidiagram.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see uidiagram.UidiagramPackage
 * @generated
 */
public class UidiagramAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static UidiagramPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UidiagramAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = UidiagramPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected UidiagramSwitch<Adapter> modelSwitch =
		new UidiagramSwitch<Adapter>() {
			@Override
			public Adapter caseModelFactory(ModelFactory object) {
				return createModelFactoryAdapter();
			}
			@Override
			public Adapter caseUIDiagram(UIDiagram object) {
				return createUIDiagramAdapter();
			}
			@Override
			public Adapter caseTemplateWidget(TemplateWidget object) {
				return createTemplateWidgetAdapter();
			}
			@Override
			public Adapter caseUserInterface(UserInterface object) {
				return createUserInterfaceAdapter();
			}
			@Override
			public Adapter caseGroup(Group object) {
				return createGroupAdapter();
			}
			@Override
			public Adapter caseGroupColumn(GroupColumn object) {
				return createGroupColumnAdapter();
			}
			@Override
			public Adapter caseGroupRow(GroupRow object) {
				return createGroupRowAdapter();
			}
			@Override
			public Adapter caseAppbar(Appbar object) {
				return createAppbarAdapter();
			}
			@Override
			public Adapter caseTabbar(Tabbar object) {
				return createTabbarAdapter();
			}
			@Override
			public Adapter caseButton(Button object) {
				return createButtonAdapter();
			}
			@Override
			public Adapter caseLabel(Label object) {
				return createLabelAdapter();
			}
			@Override
			public Adapter caseCheckbox(Checkbox object) {
				return createCheckboxAdapter();
			}
			@Override
			public Adapter caseInput(Input object) {
				return createInputAdapter();
			}
			@Override
			public Adapter caseListView(ListView object) {
				return createListViewAdapter();
			}
			@Override
			public Adapter caseRadioButton(RadioButton object) {
				return createRadioButtonAdapter();
			}
			@Override
			public Adapter caseComboBox(ComboBox object) {
				return createComboBoxAdapter();
			}
			@Override
			public Adapter caseDatePicker(DatePicker object) {
				return createDatePickerAdapter();
			}
			@Override
			public Adapter caseSwitch(Switch object) {
				return createSwitchAdapter();
			}
			@Override
			public Adapter caseTable(Table object) {
				return createTableAdapter();
			}
			@Override
			public Adapter caseColumn(Column object) {
				return createColumnAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link uidiagram.ModelFactory <em>Model Factory</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see uidiagram.ModelFactory
	 * @generated
	 */
	public Adapter createModelFactoryAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link uidiagram.UIDiagram <em>UI Diagram</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see uidiagram.UIDiagram
	 * @generated
	 */
	public Adapter createUIDiagramAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link uidiagram.TemplateWidget <em>Template Widget</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see uidiagram.TemplateWidget
	 * @generated
	 */
	public Adapter createTemplateWidgetAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link uidiagram.UserInterface <em>User Interface</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see uidiagram.UserInterface
	 * @generated
	 */
	public Adapter createUserInterfaceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link uidiagram.Group <em>Group</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see uidiagram.Group
	 * @generated
	 */
	public Adapter createGroupAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link uidiagram.GroupColumn <em>Group Column</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see uidiagram.GroupColumn
	 * @generated
	 */
	public Adapter createGroupColumnAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link uidiagram.GroupRow <em>Group Row</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see uidiagram.GroupRow
	 * @generated
	 */
	public Adapter createGroupRowAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link uidiagram.Appbar <em>Appbar</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see uidiagram.Appbar
	 * @generated
	 */
	public Adapter createAppbarAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link uidiagram.Tabbar <em>Tabbar</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see uidiagram.Tabbar
	 * @generated
	 */
	public Adapter createTabbarAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link uidiagram.Button <em>Button</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see uidiagram.Button
	 * @generated
	 */
	public Adapter createButtonAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link uidiagram.Label <em>Label</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see uidiagram.Label
	 * @generated
	 */
	public Adapter createLabelAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link uidiagram.Checkbox <em>Checkbox</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see uidiagram.Checkbox
	 * @generated
	 */
	public Adapter createCheckboxAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link uidiagram.Input <em>Input</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see uidiagram.Input
	 * @generated
	 */
	public Adapter createInputAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link uidiagram.ListView <em>List View</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see uidiagram.ListView
	 * @generated
	 */
	public Adapter createListViewAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link uidiagram.RadioButton <em>Radio Button</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see uidiagram.RadioButton
	 * @generated
	 */
	public Adapter createRadioButtonAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link uidiagram.ComboBox <em>Combo Box</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see uidiagram.ComboBox
	 * @generated
	 */
	public Adapter createComboBoxAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link uidiagram.DatePicker <em>Date Picker</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see uidiagram.DatePicker
	 * @generated
	 */
	public Adapter createDatePickerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link uidiagram.Switch <em>Switch</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see uidiagram.Switch
	 * @generated
	 */
	public Adapter createSwitchAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link uidiagram.Table <em>Table</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see uidiagram.Table
	 * @generated
	 */
	public Adapter createTableAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link uidiagram.Column <em>Column</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see uidiagram.Column
	 * @generated
	 */
	public Adapter createColumnAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //UidiagramAdapterFactory
