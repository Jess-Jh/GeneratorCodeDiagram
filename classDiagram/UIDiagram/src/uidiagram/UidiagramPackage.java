/**
 */
package uidiagram;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see uidiagram.UidiagramFactory
 * @model kind="package"
 *        annotation="gmf"
 * @generated
 */
public interface UidiagramPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "uidiagram";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "uidiagram";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "uidiagram";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	UidiagramPackage eINSTANCE = uidiagram.impl.UidiagramPackageImpl.init();

	/**
	 * The meta object id for the '{@link uidiagram.impl.ModelFactoryImpl <em>Model Factory</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uidiagram.impl.ModelFactoryImpl
	 * @see uidiagram.impl.UidiagramPackageImpl#getModelFactory()
	 * @generated
	 */
	int MODEL_FACTORY = 0;

	/**
	 * The feature id for the '<em><b>List Diagrams</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_FACTORY__LIST_DIAGRAMS = 0;

	/**
	 * The number of structural features of the '<em>Model Factory</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_FACTORY_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link uidiagram.impl.UIDiagramImpl <em>UI Diagram</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uidiagram.impl.UIDiagramImpl
	 * @see uidiagram.impl.UidiagramPackageImpl#getUIDiagram()
	 * @generated
	 */
	int UI_DIAGRAM = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_DIAGRAM__NAME = 0;

	/**
	 * The feature id for the '<em><b>User Interface</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_DIAGRAM__USER_INTERFACE = 1;

	/**
	 * The number of structural features of the '<em>UI Diagram</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_DIAGRAM_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link uidiagram.impl.TemplateWidgetImpl <em>Template Widget</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uidiagram.impl.TemplateWidgetImpl
	 * @see uidiagram.impl.UidiagramPackageImpl#getTemplateWidget()
	 * @generated
	 */
	int TEMPLATE_WIDGET = 2;

	/**
	 * The feature id for the '<em><b>Id Template</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPLATE_WIDGET__ID_TEMPLATE = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPLATE_WIDGET__NAME = 1;

	/**
	 * The feature id for the '<em><b>Position X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPLATE_WIDGET__POSITION_X = 2;

	/**
	 * The feature id for the '<em><b>Position Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPLATE_WIDGET__POSITION_Y = 3;

	/**
	 * The feature id for the '<em><b>Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPLATE_WIDGET__WIDTH = 4;

	/**
	 * The feature id for the '<em><b>Height</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPLATE_WIDGET__HEIGHT = 5;

	/**
	 * The feature id for the '<em><b>Background Color</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPLATE_WIDGET__BACKGROUND_COLOR = 6;

	/**
	 * The number of structural features of the '<em>Template Widget</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPLATE_WIDGET_FEATURE_COUNT = 7;

	/**
	 * The meta object id for the '{@link uidiagram.impl.UserInterfaceImpl <em>User Interface</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uidiagram.impl.UserInterfaceImpl
	 * @see uidiagram.impl.UidiagramPackageImpl#getUserInterface()
	 * @generated
	 */
	int USER_INTERFACE = 3;

	/**
	 * The feature id for the '<em><b>Id Interface</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_INTERFACE__ID_INTERFACE = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_INTERFACE__NAME = 1;

	/**
	 * The feature id for the '<em><b>Position X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_INTERFACE__POSITION_X = 2;

	/**
	 * The feature id for the '<em><b>Position Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_INTERFACE__POSITION_Y = 3;

	/**
	 * The feature id for the '<em><b>Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_INTERFACE__WIDTH = 4;

	/**
	 * The feature id for the '<em><b>Height</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_INTERFACE__HEIGHT = 5;

	/**
	 * The feature id for the '<em><b>Background Color</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_INTERFACE__BACKGROUND_COLOR = 6;

	/**
	 * The feature id for the '<em><b>List Template Widget</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_INTERFACE__LIST_TEMPLATE_WIDGET = 7;

	/**
	 * The number of structural features of the '<em>User Interface</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_INTERFACE_FEATURE_COUNT = 8;

	/**
	 * The meta object id for the '{@link uidiagram.impl.GroupImpl <em>Group</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uidiagram.impl.GroupImpl
	 * @see uidiagram.impl.UidiagramPackageImpl#getGroup()
	 * @generated
	 */
	int GROUP = 4;

	/**
	 * The feature id for the '<em><b>Id Template</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP__ID_TEMPLATE = TEMPLATE_WIDGET__ID_TEMPLATE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP__NAME = TEMPLATE_WIDGET__NAME;

	/**
	 * The feature id for the '<em><b>Position X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP__POSITION_X = TEMPLATE_WIDGET__POSITION_X;

	/**
	 * The feature id for the '<em><b>Position Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP__POSITION_Y = TEMPLATE_WIDGET__POSITION_Y;

	/**
	 * The feature id for the '<em><b>Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP__WIDTH = TEMPLATE_WIDGET__WIDTH;

	/**
	 * The feature id for the '<em><b>Height</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP__HEIGHT = TEMPLATE_WIDGET__HEIGHT;

	/**
	 * The feature id for the '<em><b>Background Color</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP__BACKGROUND_COLOR = TEMPLATE_WIDGET__BACKGROUND_COLOR;

	/**
	 * The feature id for the '<em><b>List Template Widget</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP__LIST_TEMPLATE_WIDGET = TEMPLATE_WIDGET_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Group</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP_FEATURE_COUNT = TEMPLATE_WIDGET_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link uidiagram.impl.GroupColumnImpl <em>Group Column</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uidiagram.impl.GroupColumnImpl
	 * @see uidiagram.impl.UidiagramPackageImpl#getGroupColumn()
	 * @generated
	 */
	int GROUP_COLUMN = 5;

	/**
	 * The feature id for the '<em><b>Id Template</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP_COLUMN__ID_TEMPLATE = TEMPLATE_WIDGET__ID_TEMPLATE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP_COLUMN__NAME = TEMPLATE_WIDGET__NAME;

	/**
	 * The feature id for the '<em><b>Position X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP_COLUMN__POSITION_X = TEMPLATE_WIDGET__POSITION_X;

	/**
	 * The feature id for the '<em><b>Position Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP_COLUMN__POSITION_Y = TEMPLATE_WIDGET__POSITION_Y;

	/**
	 * The feature id for the '<em><b>Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP_COLUMN__WIDTH = TEMPLATE_WIDGET__WIDTH;

	/**
	 * The feature id for the '<em><b>Height</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP_COLUMN__HEIGHT = TEMPLATE_WIDGET__HEIGHT;

	/**
	 * The feature id for the '<em><b>Background Color</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP_COLUMN__BACKGROUND_COLOR = TEMPLATE_WIDGET__BACKGROUND_COLOR;

	/**
	 * The feature id for the '<em><b>List Template Widget</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP_COLUMN__LIST_TEMPLATE_WIDGET = TEMPLATE_WIDGET_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Group Column</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP_COLUMN_FEATURE_COUNT = TEMPLATE_WIDGET_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link uidiagram.impl.GroupRowImpl <em>Group Row</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uidiagram.impl.GroupRowImpl
	 * @see uidiagram.impl.UidiagramPackageImpl#getGroupRow()
	 * @generated
	 */
	int GROUP_ROW = 6;

	/**
	 * The feature id for the '<em><b>Id Template</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP_ROW__ID_TEMPLATE = TEMPLATE_WIDGET__ID_TEMPLATE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP_ROW__NAME = TEMPLATE_WIDGET__NAME;

	/**
	 * The feature id for the '<em><b>Position X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP_ROW__POSITION_X = TEMPLATE_WIDGET__POSITION_X;

	/**
	 * The feature id for the '<em><b>Position Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP_ROW__POSITION_Y = TEMPLATE_WIDGET__POSITION_Y;

	/**
	 * The feature id for the '<em><b>Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP_ROW__WIDTH = TEMPLATE_WIDGET__WIDTH;

	/**
	 * The feature id for the '<em><b>Height</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP_ROW__HEIGHT = TEMPLATE_WIDGET__HEIGHT;

	/**
	 * The feature id for the '<em><b>Background Color</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP_ROW__BACKGROUND_COLOR = TEMPLATE_WIDGET__BACKGROUND_COLOR;

	/**
	 * The feature id for the '<em><b>List Template Widget</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP_ROW__LIST_TEMPLATE_WIDGET = TEMPLATE_WIDGET_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Group Row</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP_ROW_FEATURE_COUNT = TEMPLATE_WIDGET_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link uidiagram.impl.AppbarImpl <em>Appbar</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uidiagram.impl.AppbarImpl
	 * @see uidiagram.impl.UidiagramPackageImpl#getAppbar()
	 * @generated
	 */
	int APPBAR = 7;

	/**
	 * The feature id for the '<em><b>Id Template</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPBAR__ID_TEMPLATE = TEMPLATE_WIDGET__ID_TEMPLATE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPBAR__NAME = TEMPLATE_WIDGET__NAME;

	/**
	 * The feature id for the '<em><b>Position X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPBAR__POSITION_X = TEMPLATE_WIDGET__POSITION_X;

	/**
	 * The feature id for the '<em><b>Position Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPBAR__POSITION_Y = TEMPLATE_WIDGET__POSITION_Y;

	/**
	 * The feature id for the '<em><b>Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPBAR__WIDTH = TEMPLATE_WIDGET__WIDTH;

	/**
	 * The feature id for the '<em><b>Height</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPBAR__HEIGHT = TEMPLATE_WIDGET__HEIGHT;

	/**
	 * The feature id for the '<em><b>Background Color</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPBAR__BACKGROUND_COLOR = TEMPLATE_WIDGET__BACKGROUND_COLOR;

	/**
	 * The feature id for the '<em><b>List Buttons</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPBAR__LIST_BUTTONS = TEMPLATE_WIDGET_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>List Labels</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPBAR__LIST_LABELS = TEMPLATE_WIDGET_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Appbar</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPBAR_FEATURE_COUNT = TEMPLATE_WIDGET_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link uidiagram.impl.TabbarImpl <em>Tabbar</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uidiagram.impl.TabbarImpl
	 * @see uidiagram.impl.UidiagramPackageImpl#getTabbar()
	 * @generated
	 */
	int TABBAR = 8;

	/**
	 * The feature id for the '<em><b>Id Template</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABBAR__ID_TEMPLATE = TEMPLATE_WIDGET__ID_TEMPLATE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABBAR__NAME = TEMPLATE_WIDGET__NAME;

	/**
	 * The feature id for the '<em><b>Position X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABBAR__POSITION_X = TEMPLATE_WIDGET__POSITION_X;

	/**
	 * The feature id for the '<em><b>Position Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABBAR__POSITION_Y = TEMPLATE_WIDGET__POSITION_Y;

	/**
	 * The feature id for the '<em><b>Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABBAR__WIDTH = TEMPLATE_WIDGET__WIDTH;

	/**
	 * The feature id for the '<em><b>Height</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABBAR__HEIGHT = TEMPLATE_WIDGET__HEIGHT;

	/**
	 * The feature id for the '<em><b>Background Color</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABBAR__BACKGROUND_COLOR = TEMPLATE_WIDGET__BACKGROUND_COLOR;

	/**
	 * The feature id for the '<em><b>List Buttons</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABBAR__LIST_BUTTONS = TEMPLATE_WIDGET_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>List Labels</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABBAR__LIST_LABELS = TEMPLATE_WIDGET_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Tabbar</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABBAR_FEATURE_COUNT = TEMPLATE_WIDGET_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link uidiagram.impl.ButtonImpl <em>Button</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uidiagram.impl.ButtonImpl
	 * @see uidiagram.impl.UidiagramPackageImpl#getButton()
	 * @generated
	 */
	int BUTTON = 9;

	/**
	 * The feature id for the '<em><b>Id Template</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUTTON__ID_TEMPLATE = TEMPLATE_WIDGET__ID_TEMPLATE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUTTON__NAME = TEMPLATE_WIDGET__NAME;

	/**
	 * The feature id for the '<em><b>Position X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUTTON__POSITION_X = TEMPLATE_WIDGET__POSITION_X;

	/**
	 * The feature id for the '<em><b>Position Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUTTON__POSITION_Y = TEMPLATE_WIDGET__POSITION_Y;

	/**
	 * The feature id for the '<em><b>Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUTTON__WIDTH = TEMPLATE_WIDGET__WIDTH;

	/**
	 * The feature id for the '<em><b>Height</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUTTON__HEIGHT = TEMPLATE_WIDGET__HEIGHT;

	/**
	 * The feature id for the '<em><b>Background Color</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUTTON__BACKGROUND_COLOR = TEMPLATE_WIDGET__BACKGROUND_COLOR;

	/**
	 * The number of structural features of the '<em>Button</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUTTON_FEATURE_COUNT = TEMPLATE_WIDGET_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link uidiagram.impl.LabelImpl <em>Label</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uidiagram.impl.LabelImpl
	 * @see uidiagram.impl.UidiagramPackageImpl#getLabel()
	 * @generated
	 */
	int LABEL = 10;

	/**
	 * The feature id for the '<em><b>Id Template</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LABEL__ID_TEMPLATE = TEMPLATE_WIDGET__ID_TEMPLATE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LABEL__NAME = TEMPLATE_WIDGET__NAME;

	/**
	 * The feature id for the '<em><b>Position X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LABEL__POSITION_X = TEMPLATE_WIDGET__POSITION_X;

	/**
	 * The feature id for the '<em><b>Position Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LABEL__POSITION_Y = TEMPLATE_WIDGET__POSITION_Y;

	/**
	 * The feature id for the '<em><b>Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LABEL__WIDTH = TEMPLATE_WIDGET__WIDTH;

	/**
	 * The feature id for the '<em><b>Height</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LABEL__HEIGHT = TEMPLATE_WIDGET__HEIGHT;

	/**
	 * The feature id for the '<em><b>Background Color</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LABEL__BACKGROUND_COLOR = TEMPLATE_WIDGET__BACKGROUND_COLOR;

	/**
	 * The number of structural features of the '<em>Label</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LABEL_FEATURE_COUNT = TEMPLATE_WIDGET_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link uidiagram.impl.CheckboxImpl <em>Checkbox</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uidiagram.impl.CheckboxImpl
	 * @see uidiagram.impl.UidiagramPackageImpl#getCheckbox()
	 * @generated
	 */
	int CHECKBOX = 11;

	/**
	 * The feature id for the '<em><b>Id Template</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHECKBOX__ID_TEMPLATE = TEMPLATE_WIDGET__ID_TEMPLATE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHECKBOX__NAME = TEMPLATE_WIDGET__NAME;

	/**
	 * The feature id for the '<em><b>Position X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHECKBOX__POSITION_X = TEMPLATE_WIDGET__POSITION_X;

	/**
	 * The feature id for the '<em><b>Position Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHECKBOX__POSITION_Y = TEMPLATE_WIDGET__POSITION_Y;

	/**
	 * The feature id for the '<em><b>Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHECKBOX__WIDTH = TEMPLATE_WIDGET__WIDTH;

	/**
	 * The feature id for the '<em><b>Height</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHECKBOX__HEIGHT = TEMPLATE_WIDGET__HEIGHT;

	/**
	 * The feature id for the '<em><b>Background Color</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHECKBOX__BACKGROUND_COLOR = TEMPLATE_WIDGET__BACKGROUND_COLOR;

	/**
	 * The number of structural features of the '<em>Checkbox</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHECKBOX_FEATURE_COUNT = TEMPLATE_WIDGET_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link uidiagram.impl.InputImpl <em>Input</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uidiagram.impl.InputImpl
	 * @see uidiagram.impl.UidiagramPackageImpl#getInput()
	 * @generated
	 */
	int INPUT = 12;

	/**
	 * The feature id for the '<em><b>Id Template</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT__ID_TEMPLATE = TEMPLATE_WIDGET__ID_TEMPLATE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT__NAME = TEMPLATE_WIDGET__NAME;

	/**
	 * The feature id for the '<em><b>Position X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT__POSITION_X = TEMPLATE_WIDGET__POSITION_X;

	/**
	 * The feature id for the '<em><b>Position Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT__POSITION_Y = TEMPLATE_WIDGET__POSITION_Y;

	/**
	 * The feature id for the '<em><b>Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT__WIDTH = TEMPLATE_WIDGET__WIDTH;

	/**
	 * The feature id for the '<em><b>Height</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT__HEIGHT = TEMPLATE_WIDGET__HEIGHT;

	/**
	 * The feature id for the '<em><b>Background Color</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT__BACKGROUND_COLOR = TEMPLATE_WIDGET__BACKGROUND_COLOR;

	/**
	 * The number of structural features of the '<em>Input</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_FEATURE_COUNT = TEMPLATE_WIDGET_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link uidiagram.impl.ListViewImpl <em>List View</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uidiagram.impl.ListViewImpl
	 * @see uidiagram.impl.UidiagramPackageImpl#getListView()
	 * @generated
	 */
	int LIST_VIEW = 13;

	/**
	 * The feature id for the '<em><b>Id Template</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_VIEW__ID_TEMPLATE = TEMPLATE_WIDGET__ID_TEMPLATE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_VIEW__NAME = TEMPLATE_WIDGET__NAME;

	/**
	 * The feature id for the '<em><b>Position X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_VIEW__POSITION_X = TEMPLATE_WIDGET__POSITION_X;

	/**
	 * The feature id for the '<em><b>Position Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_VIEW__POSITION_Y = TEMPLATE_WIDGET__POSITION_Y;

	/**
	 * The feature id for the '<em><b>Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_VIEW__WIDTH = TEMPLATE_WIDGET__WIDTH;

	/**
	 * The feature id for the '<em><b>Height</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_VIEW__HEIGHT = TEMPLATE_WIDGET__HEIGHT;

	/**
	 * The feature id for the '<em><b>Background Color</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_VIEW__BACKGROUND_COLOR = TEMPLATE_WIDGET__BACKGROUND_COLOR;

	/**
	 * The feature id for the '<em><b>Template Widget</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_VIEW__TEMPLATE_WIDGET = TEMPLATE_WIDGET_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>List View</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_VIEW_FEATURE_COUNT = TEMPLATE_WIDGET_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link uidiagram.impl.RadioButtonImpl <em>Radio Button</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uidiagram.impl.RadioButtonImpl
	 * @see uidiagram.impl.UidiagramPackageImpl#getRadioButton()
	 * @generated
	 */
	int RADIO_BUTTON = 14;

	/**
	 * The feature id for the '<em><b>Id Template</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RADIO_BUTTON__ID_TEMPLATE = TEMPLATE_WIDGET__ID_TEMPLATE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RADIO_BUTTON__NAME = TEMPLATE_WIDGET__NAME;

	/**
	 * The feature id for the '<em><b>Position X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RADIO_BUTTON__POSITION_X = TEMPLATE_WIDGET__POSITION_X;

	/**
	 * The feature id for the '<em><b>Position Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RADIO_BUTTON__POSITION_Y = TEMPLATE_WIDGET__POSITION_Y;

	/**
	 * The feature id for the '<em><b>Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RADIO_BUTTON__WIDTH = TEMPLATE_WIDGET__WIDTH;

	/**
	 * The feature id for the '<em><b>Height</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RADIO_BUTTON__HEIGHT = TEMPLATE_WIDGET__HEIGHT;

	/**
	 * The feature id for the '<em><b>Background Color</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RADIO_BUTTON__BACKGROUND_COLOR = TEMPLATE_WIDGET__BACKGROUND_COLOR;

	/**
	 * The number of structural features of the '<em>Radio Button</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RADIO_BUTTON_FEATURE_COUNT = TEMPLATE_WIDGET_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link uidiagram.impl.ComboBoxImpl <em>Combo Box</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uidiagram.impl.ComboBoxImpl
	 * @see uidiagram.impl.UidiagramPackageImpl#getComboBox()
	 * @generated
	 */
	int COMBO_BOX = 15;

	/**
	 * The feature id for the '<em><b>Id Template</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMBO_BOX__ID_TEMPLATE = TEMPLATE_WIDGET__ID_TEMPLATE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMBO_BOX__NAME = TEMPLATE_WIDGET__NAME;

	/**
	 * The feature id for the '<em><b>Position X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMBO_BOX__POSITION_X = TEMPLATE_WIDGET__POSITION_X;

	/**
	 * The feature id for the '<em><b>Position Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMBO_BOX__POSITION_Y = TEMPLATE_WIDGET__POSITION_Y;

	/**
	 * The feature id for the '<em><b>Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMBO_BOX__WIDTH = TEMPLATE_WIDGET__WIDTH;

	/**
	 * The feature id for the '<em><b>Height</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMBO_BOX__HEIGHT = TEMPLATE_WIDGET__HEIGHT;

	/**
	 * The feature id for the '<em><b>Background Color</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMBO_BOX__BACKGROUND_COLOR = TEMPLATE_WIDGET__BACKGROUND_COLOR;

	/**
	 * The number of structural features of the '<em>Combo Box</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMBO_BOX_FEATURE_COUNT = TEMPLATE_WIDGET_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link uidiagram.impl.DatePickerImpl <em>Date Picker</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uidiagram.impl.DatePickerImpl
	 * @see uidiagram.impl.UidiagramPackageImpl#getDatePicker()
	 * @generated
	 */
	int DATE_PICKER = 16;

	/**
	 * The feature id for the '<em><b>Id Template</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_PICKER__ID_TEMPLATE = TEMPLATE_WIDGET__ID_TEMPLATE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_PICKER__NAME = TEMPLATE_WIDGET__NAME;

	/**
	 * The feature id for the '<em><b>Position X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_PICKER__POSITION_X = TEMPLATE_WIDGET__POSITION_X;

	/**
	 * The feature id for the '<em><b>Position Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_PICKER__POSITION_Y = TEMPLATE_WIDGET__POSITION_Y;

	/**
	 * The feature id for the '<em><b>Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_PICKER__WIDTH = TEMPLATE_WIDGET__WIDTH;

	/**
	 * The feature id for the '<em><b>Height</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_PICKER__HEIGHT = TEMPLATE_WIDGET__HEIGHT;

	/**
	 * The feature id for the '<em><b>Background Color</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_PICKER__BACKGROUND_COLOR = TEMPLATE_WIDGET__BACKGROUND_COLOR;

	/**
	 * The number of structural features of the '<em>Date Picker</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_PICKER_FEATURE_COUNT = TEMPLATE_WIDGET_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link uidiagram.impl.SwitchImpl <em>Switch</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uidiagram.impl.SwitchImpl
	 * @see uidiagram.impl.UidiagramPackageImpl#getSwitch()
	 * @generated
	 */
	int SWITCH = 17;

	/**
	 * The feature id for the '<em><b>Id Template</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWITCH__ID_TEMPLATE = TEMPLATE_WIDGET__ID_TEMPLATE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWITCH__NAME = TEMPLATE_WIDGET__NAME;

	/**
	 * The feature id for the '<em><b>Position X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWITCH__POSITION_X = TEMPLATE_WIDGET__POSITION_X;

	/**
	 * The feature id for the '<em><b>Position Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWITCH__POSITION_Y = TEMPLATE_WIDGET__POSITION_Y;

	/**
	 * The feature id for the '<em><b>Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWITCH__WIDTH = TEMPLATE_WIDGET__WIDTH;

	/**
	 * The feature id for the '<em><b>Height</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWITCH__HEIGHT = TEMPLATE_WIDGET__HEIGHT;

	/**
	 * The feature id for the '<em><b>Background Color</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWITCH__BACKGROUND_COLOR = TEMPLATE_WIDGET__BACKGROUND_COLOR;

	/**
	 * The number of structural features of the '<em>Switch</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWITCH_FEATURE_COUNT = TEMPLATE_WIDGET_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link uidiagram.impl.TableImpl <em>Table</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uidiagram.impl.TableImpl
	 * @see uidiagram.impl.UidiagramPackageImpl#getTable()
	 * @generated
	 */
	int TABLE = 18;

	/**
	 * The feature id for the '<em><b>Id Template</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE__ID_TEMPLATE = TEMPLATE_WIDGET__ID_TEMPLATE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE__NAME = TEMPLATE_WIDGET__NAME;

	/**
	 * The feature id for the '<em><b>Position X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE__POSITION_X = TEMPLATE_WIDGET__POSITION_X;

	/**
	 * The feature id for the '<em><b>Position Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE__POSITION_Y = TEMPLATE_WIDGET__POSITION_Y;

	/**
	 * The feature id for the '<em><b>Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE__WIDTH = TEMPLATE_WIDGET__WIDTH;

	/**
	 * The feature id for the '<em><b>Height</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE__HEIGHT = TEMPLATE_WIDGET__HEIGHT;

	/**
	 * The feature id for the '<em><b>Background Color</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE__BACKGROUND_COLOR = TEMPLATE_WIDGET__BACKGROUND_COLOR;

	/**
	 * The feature id for the '<em><b>List Coulmns</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE__LIST_COULMNS = TEMPLATE_WIDGET_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Table</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_FEATURE_COUNT = TEMPLATE_WIDGET_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link uidiagram.impl.ColumnImpl <em>Column</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uidiagram.impl.ColumnImpl
	 * @see uidiagram.impl.UidiagramPackageImpl#getColumn()
	 * @generated
	 */
	int COLUMN = 19;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLUMN__NAME = 0;

	/**
	 * The number of structural features of the '<em>Column</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLUMN_FEATURE_COUNT = 1;


	/**
	 * Returns the meta object for class '{@link uidiagram.ModelFactory <em>Model Factory</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Model Factory</em>'.
	 * @see uidiagram.ModelFactory
	 * @generated
	 */
	EClass getModelFactory();

	/**
	 * Returns the meta object for the containment reference list '{@link uidiagram.ModelFactory#getListDiagrams <em>List Diagrams</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>List Diagrams</em>'.
	 * @see uidiagram.ModelFactory#getListDiagrams()
	 * @see #getModelFactory()
	 * @generated
	 */
	EReference getModelFactory_ListDiagrams();

	/**
	 * Returns the meta object for class '{@link uidiagram.UIDiagram <em>UI Diagram</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>UI Diagram</em>'.
	 * @see uidiagram.UIDiagram
	 * @generated
	 */
	EClass getUIDiagram();

	/**
	 * Returns the meta object for the attribute '{@link uidiagram.UIDiagram#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see uidiagram.UIDiagram#getName()
	 * @see #getUIDiagram()
	 * @generated
	 */
	EAttribute getUIDiagram_Name();

	/**
	 * Returns the meta object for the containment reference '{@link uidiagram.UIDiagram#getUserInterface <em>User Interface</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>User Interface</em>'.
	 * @see uidiagram.UIDiagram#getUserInterface()
	 * @see #getUIDiagram()
	 * @generated
	 */
	EReference getUIDiagram_UserInterface();

	/**
	 * Returns the meta object for class '{@link uidiagram.TemplateWidget <em>Template Widget</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Template Widget</em>'.
	 * @see uidiagram.TemplateWidget
	 * @generated
	 */
	EClass getTemplateWidget();

	/**
	 * Returns the meta object for the attribute '{@link uidiagram.TemplateWidget#getIdTemplate <em>Id Template</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id Template</em>'.
	 * @see uidiagram.TemplateWidget#getIdTemplate()
	 * @see #getTemplateWidget()
	 * @generated
	 */
	EAttribute getTemplateWidget_IdTemplate();

	/**
	 * Returns the meta object for the attribute '{@link uidiagram.TemplateWidget#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see uidiagram.TemplateWidget#getName()
	 * @see #getTemplateWidget()
	 * @generated
	 */
	EAttribute getTemplateWidget_Name();

	/**
	 * Returns the meta object for the attribute '{@link uidiagram.TemplateWidget#getPositionX <em>Position X</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Position X</em>'.
	 * @see uidiagram.TemplateWidget#getPositionX()
	 * @see #getTemplateWidget()
	 * @generated
	 */
	EAttribute getTemplateWidget_PositionX();

	/**
	 * Returns the meta object for the attribute '{@link uidiagram.TemplateWidget#getPositionY <em>Position Y</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Position Y</em>'.
	 * @see uidiagram.TemplateWidget#getPositionY()
	 * @see #getTemplateWidget()
	 * @generated
	 */
	EAttribute getTemplateWidget_PositionY();

	/**
	 * Returns the meta object for the attribute '{@link uidiagram.TemplateWidget#getWidth <em>Width</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Width</em>'.
	 * @see uidiagram.TemplateWidget#getWidth()
	 * @see #getTemplateWidget()
	 * @generated
	 */
	EAttribute getTemplateWidget_Width();

	/**
	 * Returns the meta object for the attribute '{@link uidiagram.TemplateWidget#getHeight <em>Height</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Height</em>'.
	 * @see uidiagram.TemplateWidget#getHeight()
	 * @see #getTemplateWidget()
	 * @generated
	 */
	EAttribute getTemplateWidget_Height();

	/**
	 * Returns the meta object for the attribute '{@link uidiagram.TemplateWidget#getBackgroundColor <em>Background Color</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Background Color</em>'.
	 * @see uidiagram.TemplateWidget#getBackgroundColor()
	 * @see #getTemplateWidget()
	 * @generated
	 */
	EAttribute getTemplateWidget_BackgroundColor();

	/**
	 * Returns the meta object for class '{@link uidiagram.UserInterface <em>User Interface</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>User Interface</em>'.
	 * @see uidiagram.UserInterface
	 * @generated
	 */
	EClass getUserInterface();

	/**
	 * Returns the meta object for the attribute '{@link uidiagram.UserInterface#getIdInterface <em>Id Interface</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id Interface</em>'.
	 * @see uidiagram.UserInterface#getIdInterface()
	 * @see #getUserInterface()
	 * @generated
	 */
	EAttribute getUserInterface_IdInterface();

	/**
	 * Returns the meta object for the attribute '{@link uidiagram.UserInterface#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see uidiagram.UserInterface#getName()
	 * @see #getUserInterface()
	 * @generated
	 */
	EAttribute getUserInterface_Name();

	/**
	 * Returns the meta object for the attribute '{@link uidiagram.UserInterface#getPositionX <em>Position X</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Position X</em>'.
	 * @see uidiagram.UserInterface#getPositionX()
	 * @see #getUserInterface()
	 * @generated
	 */
	EAttribute getUserInterface_PositionX();

	/**
	 * Returns the meta object for the attribute '{@link uidiagram.UserInterface#getPositionY <em>Position Y</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Position Y</em>'.
	 * @see uidiagram.UserInterface#getPositionY()
	 * @see #getUserInterface()
	 * @generated
	 */
	EAttribute getUserInterface_PositionY();

	/**
	 * Returns the meta object for the attribute '{@link uidiagram.UserInterface#getWidth <em>Width</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Width</em>'.
	 * @see uidiagram.UserInterface#getWidth()
	 * @see #getUserInterface()
	 * @generated
	 */
	EAttribute getUserInterface_Width();

	/**
	 * Returns the meta object for the attribute '{@link uidiagram.UserInterface#getHeight <em>Height</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Height</em>'.
	 * @see uidiagram.UserInterface#getHeight()
	 * @see #getUserInterface()
	 * @generated
	 */
	EAttribute getUserInterface_Height();

	/**
	 * Returns the meta object for the attribute '{@link uidiagram.UserInterface#getBackgroundColor <em>Background Color</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Background Color</em>'.
	 * @see uidiagram.UserInterface#getBackgroundColor()
	 * @see #getUserInterface()
	 * @generated
	 */
	EAttribute getUserInterface_BackgroundColor();

	/**
	 * Returns the meta object for the containment reference list '{@link uidiagram.UserInterface#getListTemplateWidget <em>List Template Widget</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>List Template Widget</em>'.
	 * @see uidiagram.UserInterface#getListTemplateWidget()
	 * @see #getUserInterface()
	 * @generated
	 */
	EReference getUserInterface_ListTemplateWidget();

	/**
	 * Returns the meta object for class '{@link uidiagram.Group <em>Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Group</em>'.
	 * @see uidiagram.Group
	 * @generated
	 */
	EClass getGroup();

	/**
	 * Returns the meta object for the containment reference list '{@link uidiagram.Group#getListTemplateWidget <em>List Template Widget</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>List Template Widget</em>'.
	 * @see uidiagram.Group#getListTemplateWidget()
	 * @see #getGroup()
	 * @generated
	 */
	EReference getGroup_ListTemplateWidget();

	/**
	 * Returns the meta object for class '{@link uidiagram.GroupColumn <em>Group Column</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Group Column</em>'.
	 * @see uidiagram.GroupColumn
	 * @generated
	 */
	EClass getGroupColumn();

	/**
	 * Returns the meta object for the containment reference list '{@link uidiagram.GroupColumn#getListTemplateWidget <em>List Template Widget</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>List Template Widget</em>'.
	 * @see uidiagram.GroupColumn#getListTemplateWidget()
	 * @see #getGroupColumn()
	 * @generated
	 */
	EReference getGroupColumn_ListTemplateWidget();

	/**
	 * Returns the meta object for class '{@link uidiagram.GroupRow <em>Group Row</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Group Row</em>'.
	 * @see uidiagram.GroupRow
	 * @generated
	 */
	EClass getGroupRow();

	/**
	 * Returns the meta object for the containment reference list '{@link uidiagram.GroupRow#getListTemplateWidget <em>List Template Widget</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>List Template Widget</em>'.
	 * @see uidiagram.GroupRow#getListTemplateWidget()
	 * @see #getGroupRow()
	 * @generated
	 */
	EReference getGroupRow_ListTemplateWidget();

	/**
	 * Returns the meta object for class '{@link uidiagram.Appbar <em>Appbar</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Appbar</em>'.
	 * @see uidiagram.Appbar
	 * @generated
	 */
	EClass getAppbar();

	/**
	 * Returns the meta object for the containment reference list '{@link uidiagram.Appbar#getListButtons <em>List Buttons</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>List Buttons</em>'.
	 * @see uidiagram.Appbar#getListButtons()
	 * @see #getAppbar()
	 * @generated
	 */
	EReference getAppbar_ListButtons();

	/**
	 * Returns the meta object for the containment reference list '{@link uidiagram.Appbar#getListLabels <em>List Labels</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>List Labels</em>'.
	 * @see uidiagram.Appbar#getListLabels()
	 * @see #getAppbar()
	 * @generated
	 */
	EReference getAppbar_ListLabels();

	/**
	 * Returns the meta object for class '{@link uidiagram.Tabbar <em>Tabbar</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Tabbar</em>'.
	 * @see uidiagram.Tabbar
	 * @generated
	 */
	EClass getTabbar();

	/**
	 * Returns the meta object for the containment reference list '{@link uidiagram.Tabbar#getListButtons <em>List Buttons</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>List Buttons</em>'.
	 * @see uidiagram.Tabbar#getListButtons()
	 * @see #getTabbar()
	 * @generated
	 */
	EReference getTabbar_ListButtons();

	/**
	 * Returns the meta object for the containment reference list '{@link uidiagram.Tabbar#getListLabels <em>List Labels</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>List Labels</em>'.
	 * @see uidiagram.Tabbar#getListLabels()
	 * @see #getTabbar()
	 * @generated
	 */
	EReference getTabbar_ListLabels();

	/**
	 * Returns the meta object for class '{@link uidiagram.Button <em>Button</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Button</em>'.
	 * @see uidiagram.Button
	 * @generated
	 */
	EClass getButton();

	/**
	 * Returns the meta object for class '{@link uidiagram.Label <em>Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Label</em>'.
	 * @see uidiagram.Label
	 * @generated
	 */
	EClass getLabel();

	/**
	 * Returns the meta object for class '{@link uidiagram.Checkbox <em>Checkbox</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Checkbox</em>'.
	 * @see uidiagram.Checkbox
	 * @generated
	 */
	EClass getCheckbox();

	/**
	 * Returns the meta object for class '{@link uidiagram.Input <em>Input</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Input</em>'.
	 * @see uidiagram.Input
	 * @generated
	 */
	EClass getInput();

	/**
	 * Returns the meta object for class '{@link uidiagram.ListView <em>List View</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>List View</em>'.
	 * @see uidiagram.ListView
	 * @generated
	 */
	EClass getListView();

	/**
	 * Returns the meta object for the containment reference '{@link uidiagram.ListView#getTemplateWidget <em>Template Widget</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Template Widget</em>'.
	 * @see uidiagram.ListView#getTemplateWidget()
	 * @see #getListView()
	 * @generated
	 */
	EReference getListView_TemplateWidget();

	/**
	 * Returns the meta object for class '{@link uidiagram.RadioButton <em>Radio Button</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Radio Button</em>'.
	 * @see uidiagram.RadioButton
	 * @generated
	 */
	EClass getRadioButton();

	/**
	 * Returns the meta object for class '{@link uidiagram.ComboBox <em>Combo Box</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Combo Box</em>'.
	 * @see uidiagram.ComboBox
	 * @generated
	 */
	EClass getComboBox();

	/**
	 * Returns the meta object for class '{@link uidiagram.DatePicker <em>Date Picker</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Date Picker</em>'.
	 * @see uidiagram.DatePicker
	 * @generated
	 */
	EClass getDatePicker();

	/**
	 * Returns the meta object for class '{@link uidiagram.Switch <em>Switch</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Switch</em>'.
	 * @see uidiagram.Switch
	 * @generated
	 */
	EClass getSwitch();

	/**
	 * Returns the meta object for class '{@link uidiagram.Table <em>Table</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Table</em>'.
	 * @see uidiagram.Table
	 * @generated
	 */
	EClass getTable();

	/**
	 * Returns the meta object for the containment reference list '{@link uidiagram.Table#getListCoulmns <em>List Coulmns</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>List Coulmns</em>'.
	 * @see uidiagram.Table#getListCoulmns()
	 * @see #getTable()
	 * @generated
	 */
	EReference getTable_ListCoulmns();

	/**
	 * Returns the meta object for class '{@link uidiagram.Column <em>Column</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Column</em>'.
	 * @see uidiagram.Column
	 * @generated
	 */
	EClass getColumn();

	/**
	 * Returns the meta object for the attribute '{@link uidiagram.Column#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see uidiagram.Column#getName()
	 * @see #getColumn()
	 * @generated
	 */
	EAttribute getColumn_Name();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	UidiagramFactory getUidiagramFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link uidiagram.impl.ModelFactoryImpl <em>Model Factory</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uidiagram.impl.ModelFactoryImpl
		 * @see uidiagram.impl.UidiagramPackageImpl#getModelFactory()
		 * @generated
		 */
		EClass MODEL_FACTORY = eINSTANCE.getModelFactory();

		/**
		 * The meta object literal for the '<em><b>List Diagrams</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODEL_FACTORY__LIST_DIAGRAMS = eINSTANCE.getModelFactory_ListDiagrams();

		/**
		 * The meta object literal for the '{@link uidiagram.impl.UIDiagramImpl <em>UI Diagram</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uidiagram.impl.UIDiagramImpl
		 * @see uidiagram.impl.UidiagramPackageImpl#getUIDiagram()
		 * @generated
		 */
		EClass UI_DIAGRAM = eINSTANCE.getUIDiagram();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UI_DIAGRAM__NAME = eINSTANCE.getUIDiagram_Name();

		/**
		 * The meta object literal for the '<em><b>User Interface</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UI_DIAGRAM__USER_INTERFACE = eINSTANCE.getUIDiagram_UserInterface();

		/**
		 * The meta object literal for the '{@link uidiagram.impl.TemplateWidgetImpl <em>Template Widget</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uidiagram.impl.TemplateWidgetImpl
		 * @see uidiagram.impl.UidiagramPackageImpl#getTemplateWidget()
		 * @generated
		 */
		EClass TEMPLATE_WIDGET = eINSTANCE.getTemplateWidget();

		/**
		 * The meta object literal for the '<em><b>Id Template</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TEMPLATE_WIDGET__ID_TEMPLATE = eINSTANCE.getTemplateWidget_IdTemplate();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TEMPLATE_WIDGET__NAME = eINSTANCE.getTemplateWidget_Name();

		/**
		 * The meta object literal for the '<em><b>Position X</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TEMPLATE_WIDGET__POSITION_X = eINSTANCE.getTemplateWidget_PositionX();

		/**
		 * The meta object literal for the '<em><b>Position Y</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TEMPLATE_WIDGET__POSITION_Y = eINSTANCE.getTemplateWidget_PositionY();

		/**
		 * The meta object literal for the '<em><b>Width</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TEMPLATE_WIDGET__WIDTH = eINSTANCE.getTemplateWidget_Width();

		/**
		 * The meta object literal for the '<em><b>Height</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TEMPLATE_WIDGET__HEIGHT = eINSTANCE.getTemplateWidget_Height();

		/**
		 * The meta object literal for the '<em><b>Background Color</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TEMPLATE_WIDGET__BACKGROUND_COLOR = eINSTANCE.getTemplateWidget_BackgroundColor();

		/**
		 * The meta object literal for the '{@link uidiagram.impl.UserInterfaceImpl <em>User Interface</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uidiagram.impl.UserInterfaceImpl
		 * @see uidiagram.impl.UidiagramPackageImpl#getUserInterface()
		 * @generated
		 */
		EClass USER_INTERFACE = eINSTANCE.getUserInterface();

		/**
		 * The meta object literal for the '<em><b>Id Interface</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute USER_INTERFACE__ID_INTERFACE = eINSTANCE.getUserInterface_IdInterface();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute USER_INTERFACE__NAME = eINSTANCE.getUserInterface_Name();

		/**
		 * The meta object literal for the '<em><b>Position X</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute USER_INTERFACE__POSITION_X = eINSTANCE.getUserInterface_PositionX();

		/**
		 * The meta object literal for the '<em><b>Position Y</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute USER_INTERFACE__POSITION_Y = eINSTANCE.getUserInterface_PositionY();

		/**
		 * The meta object literal for the '<em><b>Width</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute USER_INTERFACE__WIDTH = eINSTANCE.getUserInterface_Width();

		/**
		 * The meta object literal for the '<em><b>Height</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute USER_INTERFACE__HEIGHT = eINSTANCE.getUserInterface_Height();

		/**
		 * The meta object literal for the '<em><b>Background Color</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute USER_INTERFACE__BACKGROUND_COLOR = eINSTANCE.getUserInterface_BackgroundColor();

		/**
		 * The meta object literal for the '<em><b>List Template Widget</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference USER_INTERFACE__LIST_TEMPLATE_WIDGET = eINSTANCE.getUserInterface_ListTemplateWidget();

		/**
		 * The meta object literal for the '{@link uidiagram.impl.GroupImpl <em>Group</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uidiagram.impl.GroupImpl
		 * @see uidiagram.impl.UidiagramPackageImpl#getGroup()
		 * @generated
		 */
		EClass GROUP = eINSTANCE.getGroup();

		/**
		 * The meta object literal for the '<em><b>List Template Widget</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GROUP__LIST_TEMPLATE_WIDGET = eINSTANCE.getGroup_ListTemplateWidget();

		/**
		 * The meta object literal for the '{@link uidiagram.impl.GroupColumnImpl <em>Group Column</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uidiagram.impl.GroupColumnImpl
		 * @see uidiagram.impl.UidiagramPackageImpl#getGroupColumn()
		 * @generated
		 */
		EClass GROUP_COLUMN = eINSTANCE.getGroupColumn();

		/**
		 * The meta object literal for the '<em><b>List Template Widget</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GROUP_COLUMN__LIST_TEMPLATE_WIDGET = eINSTANCE.getGroupColumn_ListTemplateWidget();

		/**
		 * The meta object literal for the '{@link uidiagram.impl.GroupRowImpl <em>Group Row</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uidiagram.impl.GroupRowImpl
		 * @see uidiagram.impl.UidiagramPackageImpl#getGroupRow()
		 * @generated
		 */
		EClass GROUP_ROW = eINSTANCE.getGroupRow();

		/**
		 * The meta object literal for the '<em><b>List Template Widget</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GROUP_ROW__LIST_TEMPLATE_WIDGET = eINSTANCE.getGroupRow_ListTemplateWidget();

		/**
		 * The meta object literal for the '{@link uidiagram.impl.AppbarImpl <em>Appbar</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uidiagram.impl.AppbarImpl
		 * @see uidiagram.impl.UidiagramPackageImpl#getAppbar()
		 * @generated
		 */
		EClass APPBAR = eINSTANCE.getAppbar();

		/**
		 * The meta object literal for the '<em><b>List Buttons</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference APPBAR__LIST_BUTTONS = eINSTANCE.getAppbar_ListButtons();

		/**
		 * The meta object literal for the '<em><b>List Labels</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference APPBAR__LIST_LABELS = eINSTANCE.getAppbar_ListLabels();

		/**
		 * The meta object literal for the '{@link uidiagram.impl.TabbarImpl <em>Tabbar</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uidiagram.impl.TabbarImpl
		 * @see uidiagram.impl.UidiagramPackageImpl#getTabbar()
		 * @generated
		 */
		EClass TABBAR = eINSTANCE.getTabbar();

		/**
		 * The meta object literal for the '<em><b>List Buttons</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TABBAR__LIST_BUTTONS = eINSTANCE.getTabbar_ListButtons();

		/**
		 * The meta object literal for the '<em><b>List Labels</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TABBAR__LIST_LABELS = eINSTANCE.getTabbar_ListLabels();

		/**
		 * The meta object literal for the '{@link uidiagram.impl.ButtonImpl <em>Button</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uidiagram.impl.ButtonImpl
		 * @see uidiagram.impl.UidiagramPackageImpl#getButton()
		 * @generated
		 */
		EClass BUTTON = eINSTANCE.getButton();

		/**
		 * The meta object literal for the '{@link uidiagram.impl.LabelImpl <em>Label</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uidiagram.impl.LabelImpl
		 * @see uidiagram.impl.UidiagramPackageImpl#getLabel()
		 * @generated
		 */
		EClass LABEL = eINSTANCE.getLabel();

		/**
		 * The meta object literal for the '{@link uidiagram.impl.CheckboxImpl <em>Checkbox</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uidiagram.impl.CheckboxImpl
		 * @see uidiagram.impl.UidiagramPackageImpl#getCheckbox()
		 * @generated
		 */
		EClass CHECKBOX = eINSTANCE.getCheckbox();

		/**
		 * The meta object literal for the '{@link uidiagram.impl.InputImpl <em>Input</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uidiagram.impl.InputImpl
		 * @see uidiagram.impl.UidiagramPackageImpl#getInput()
		 * @generated
		 */
		EClass INPUT = eINSTANCE.getInput();

		/**
		 * The meta object literal for the '{@link uidiagram.impl.ListViewImpl <em>List View</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uidiagram.impl.ListViewImpl
		 * @see uidiagram.impl.UidiagramPackageImpl#getListView()
		 * @generated
		 */
		EClass LIST_VIEW = eINSTANCE.getListView();

		/**
		 * The meta object literal for the '<em><b>Template Widget</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LIST_VIEW__TEMPLATE_WIDGET = eINSTANCE.getListView_TemplateWidget();

		/**
		 * The meta object literal for the '{@link uidiagram.impl.RadioButtonImpl <em>Radio Button</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uidiagram.impl.RadioButtonImpl
		 * @see uidiagram.impl.UidiagramPackageImpl#getRadioButton()
		 * @generated
		 */
		EClass RADIO_BUTTON = eINSTANCE.getRadioButton();

		/**
		 * The meta object literal for the '{@link uidiagram.impl.ComboBoxImpl <em>Combo Box</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uidiagram.impl.ComboBoxImpl
		 * @see uidiagram.impl.UidiagramPackageImpl#getComboBox()
		 * @generated
		 */
		EClass COMBO_BOX = eINSTANCE.getComboBox();

		/**
		 * The meta object literal for the '{@link uidiagram.impl.DatePickerImpl <em>Date Picker</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uidiagram.impl.DatePickerImpl
		 * @see uidiagram.impl.UidiagramPackageImpl#getDatePicker()
		 * @generated
		 */
		EClass DATE_PICKER = eINSTANCE.getDatePicker();

		/**
		 * The meta object literal for the '{@link uidiagram.impl.SwitchImpl <em>Switch</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uidiagram.impl.SwitchImpl
		 * @see uidiagram.impl.UidiagramPackageImpl#getSwitch()
		 * @generated
		 */
		EClass SWITCH = eINSTANCE.getSwitch();

		/**
		 * The meta object literal for the '{@link uidiagram.impl.TableImpl <em>Table</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uidiagram.impl.TableImpl
		 * @see uidiagram.impl.UidiagramPackageImpl#getTable()
		 * @generated
		 */
		EClass TABLE = eINSTANCE.getTable();

		/**
		 * The meta object literal for the '<em><b>List Coulmns</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TABLE__LIST_COULMNS = eINSTANCE.getTable_ListCoulmns();

		/**
		 * The meta object literal for the '{@link uidiagram.impl.ColumnImpl <em>Column</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uidiagram.impl.ColumnImpl
		 * @see uidiagram.impl.UidiagramPackageImpl#getColumn()
		 * @generated
		 */
		EClass COLUMN = eINSTANCE.getColumn();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COLUMN__NAME = eINSTANCE.getColumn_Name();

	}

} //UidiagramPackage
