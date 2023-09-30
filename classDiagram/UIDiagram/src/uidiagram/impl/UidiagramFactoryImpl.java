/**
 */
package uidiagram.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import uidiagram.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class UidiagramFactoryImpl extends EFactoryImpl implements UidiagramFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static UidiagramFactory init() {
		try {
			UidiagramFactory theUidiagramFactory = (UidiagramFactory)EPackage.Registry.INSTANCE.getEFactory(UidiagramPackage.eNS_URI);
			if (theUidiagramFactory != null) {
				return theUidiagramFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new UidiagramFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UidiagramFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case UidiagramPackage.MODEL_FACTORY: return createModelFactory();
			case UidiagramPackage.UI_DIAGRAM: return createUIDiagram();
			case UidiagramPackage.TEMPLATE_WIDGET: return createTemplateWidget();
			case UidiagramPackage.USER_INTERFACE: return createUserInterface();
			case UidiagramPackage.GROUP: return createGroup();
			case UidiagramPackage.GROUP_COLUMN: return createGroupColumn();
			case UidiagramPackage.GROUP_ROW: return createGroupRow();
			case UidiagramPackage.APPBAR: return createAppbar();
			case UidiagramPackage.TABBAR: return createTabbar();
			case UidiagramPackage.BUTTON: return createButton();
			case UidiagramPackage.LABEL: return createLabel();
			case UidiagramPackage.CHECKBOX: return createCheckbox();
			case UidiagramPackage.INPUT: return createInput();
			case UidiagramPackage.LIST_VIEW: return createListView();
			case UidiagramPackage.RADIO_BUTTON: return createRadioButton();
			case UidiagramPackage.COMBO_BOX: return createComboBox();
			case UidiagramPackage.DATE_PICKER: return createDatePicker();
			case UidiagramPackage.SWITCH: return createSwitch();
			case UidiagramPackage.TABLE: return createTable();
			case UidiagramPackage.COLUMN: return createColumn();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ModelFactory createModelFactory() {
		ModelFactoryImpl modelFactory = new ModelFactoryImpl();
		return modelFactory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public UIDiagram createUIDiagram() {
		UIDiagramImpl uiDiagram = new UIDiagramImpl();
		return uiDiagram;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TemplateWidget createTemplateWidget() {
		TemplateWidgetImpl templateWidget = new TemplateWidgetImpl();
		return templateWidget;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public UserInterface createUserInterface() {
		UserInterfaceImpl userInterface = new UserInterfaceImpl();
		return userInterface;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Group createGroup() {
		GroupImpl group = new GroupImpl();
		return group;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GroupColumn createGroupColumn() {
		GroupColumnImpl groupColumn = new GroupColumnImpl();
		return groupColumn;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GroupRow createGroupRow() {
		GroupRowImpl groupRow = new GroupRowImpl();
		return groupRow;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Appbar createAppbar() {
		AppbarImpl appbar = new AppbarImpl();
		return appbar;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Tabbar createTabbar() {
		TabbarImpl tabbar = new TabbarImpl();
		return tabbar;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Button createButton() {
		ButtonImpl button = new ButtonImpl();
		return button;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Label createLabel() {
		LabelImpl label = new LabelImpl();
		return label;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Checkbox createCheckbox() {
		CheckboxImpl checkbox = new CheckboxImpl();
		return checkbox;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Input createInput() {
		InputImpl input = new InputImpl();
		return input;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ListView createListView() {
		ListViewImpl listView = new ListViewImpl();
		return listView;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RadioButton createRadioButton() {
		RadioButtonImpl radioButton = new RadioButtonImpl();
		return radioButton;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ComboBox createComboBox() {
		ComboBoxImpl comboBox = new ComboBoxImpl();
		return comboBox;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DatePicker createDatePicker() {
		DatePickerImpl datePicker = new DatePickerImpl();
		return datePicker;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Switch createSwitch() {
		SwitchImpl switch_ = new SwitchImpl();
		return switch_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Table createTable() {
		TableImpl table = new TableImpl();
		return table;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Column createColumn() {
		ColumnImpl column = new ColumnImpl();
		return column;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public UidiagramPackage getUidiagramPackage() {
		return (UidiagramPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static UidiagramPackage getPackage() {
		return UidiagramPackage.eINSTANCE;
	}

} //UidiagramFactoryImpl
