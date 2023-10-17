/*
 * 
 */
package uidiagram.diagram.providers;

import java.util.HashSet;
import java.util.IdentityHashMap;
import java.util.Map;
import java.util.Set;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.emf.ecore.ENamedElement;
import org.eclipse.gmf.runtime.emf.type.core.ElementTypeRegistry;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.tooling.runtime.providers.DiagramElementTypeImages;
import org.eclipse.gmf.tooling.runtime.providers.DiagramElementTypes;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.swt.graphics.Image;

import uidiagram.UidiagramPackage;
import uidiagram.diagram.edit.parts.Appbar2EditPart;
import uidiagram.diagram.edit.parts.Appbar3EditPart;
import uidiagram.diagram.edit.parts.Appbar4EditPart;
import uidiagram.diagram.edit.parts.Appbar5EditPart;
import uidiagram.diagram.edit.parts.AppbarEditPart;
import uidiagram.diagram.edit.parts.Button2EditPart;
import uidiagram.diagram.edit.parts.Button3EditPart;
import uidiagram.diagram.edit.parts.Button4EditPart;
import uidiagram.diagram.edit.parts.Button5EditPart;
import uidiagram.diagram.edit.parts.Button6EditPart;
import uidiagram.diagram.edit.parts.Button7EditPart;
import uidiagram.diagram.edit.parts.ButtonEditPart;
import uidiagram.diagram.edit.parts.Checkbox2EditPart;
import uidiagram.diagram.edit.parts.Checkbox3EditPart;
import uidiagram.diagram.edit.parts.Checkbox4EditPart;
import uidiagram.diagram.edit.parts.Checkbox5EditPart;
import uidiagram.diagram.edit.parts.CheckboxEditPart;
import uidiagram.diagram.edit.parts.ColumnEditPart;
import uidiagram.diagram.edit.parts.ComboBox2EditPart;
import uidiagram.diagram.edit.parts.ComboBox3EditPart;
import uidiagram.diagram.edit.parts.ComboBox4EditPart;
import uidiagram.diagram.edit.parts.ComboBox5EditPart;
import uidiagram.diagram.edit.parts.ComboBoxEditPart;
import uidiagram.diagram.edit.parts.DatePicker2EditPart;
import uidiagram.diagram.edit.parts.DatePicker3EditPart;
import uidiagram.diagram.edit.parts.DatePicker4EditPart;
import uidiagram.diagram.edit.parts.DatePicker5EditPart;
import uidiagram.diagram.edit.parts.DatePickerEditPart;
import uidiagram.diagram.edit.parts.Group2EditPart;
import uidiagram.diagram.edit.parts.Group3EditPart;
import uidiagram.diagram.edit.parts.Group4EditPart;
import uidiagram.diagram.edit.parts.Group5EditPart;
import uidiagram.diagram.edit.parts.GroupColumn2EditPart;
import uidiagram.diagram.edit.parts.GroupColumn3EditPart;
import uidiagram.diagram.edit.parts.GroupColumn4EditPart;
import uidiagram.diagram.edit.parts.GroupColumn5EditPart;
import uidiagram.diagram.edit.parts.GroupColumnEditPart;
import uidiagram.diagram.edit.parts.GroupEditPart;
import uidiagram.diagram.edit.parts.GroupRow2EditPart;
import uidiagram.diagram.edit.parts.GroupRow3EditPart;
import uidiagram.diagram.edit.parts.GroupRow4EditPart;
import uidiagram.diagram.edit.parts.GroupRow5EditPart;
import uidiagram.diagram.edit.parts.GroupRowEditPart;
import uidiagram.diagram.edit.parts.Input2EditPart;
import uidiagram.diagram.edit.parts.Input3EditPart;
import uidiagram.diagram.edit.parts.Input4EditPart;
import uidiagram.diagram.edit.parts.Input5EditPart;
import uidiagram.diagram.edit.parts.InputEditPart;
import uidiagram.diagram.edit.parts.Label2EditPart;
import uidiagram.diagram.edit.parts.Label3EditPart;
import uidiagram.diagram.edit.parts.Label4EditPart;
import uidiagram.diagram.edit.parts.Label5EditPart;
import uidiagram.diagram.edit.parts.Label6EditPart;
import uidiagram.diagram.edit.parts.Label7EditPart;
import uidiagram.diagram.edit.parts.LabelEditPart;
import uidiagram.diagram.edit.parts.ListView2EditPart;
import uidiagram.diagram.edit.parts.ListView3EditPart;
import uidiagram.diagram.edit.parts.ListView4EditPart;
import uidiagram.diagram.edit.parts.ListView5EditPart;
import uidiagram.diagram.edit.parts.ListViewEditPart;
import uidiagram.diagram.edit.parts.RadioButton2EditPart;
import uidiagram.diagram.edit.parts.RadioButton3EditPart;
import uidiagram.diagram.edit.parts.RadioButton4EditPart;
import uidiagram.diagram.edit.parts.RadioButton5EditPart;
import uidiagram.diagram.edit.parts.RadioButtonEditPart;
import uidiagram.diagram.edit.parts.Switch2EditPart;
import uidiagram.diagram.edit.parts.Switch3EditPart;
import uidiagram.diagram.edit.parts.Switch4EditPart;
import uidiagram.diagram.edit.parts.Switch5EditPart;
import uidiagram.diagram.edit.parts.SwitchEditPart;
import uidiagram.diagram.edit.parts.Tabbar2EditPart;
import uidiagram.diagram.edit.parts.Tabbar3EditPart;
import uidiagram.diagram.edit.parts.Tabbar4EditPart;
import uidiagram.diagram.edit.parts.Tabbar5EditPart;
import uidiagram.diagram.edit.parts.TabbarEditPart;
import uidiagram.diagram.edit.parts.Table2EditPart;
import uidiagram.diagram.edit.parts.Table3EditPart;
import uidiagram.diagram.edit.parts.Table4EditPart;
import uidiagram.diagram.edit.parts.Table5EditPart;
import uidiagram.diagram.edit.parts.TableEditPart;
import uidiagram.diagram.edit.parts.UIDiagramEditPart;
import uidiagram.diagram.edit.parts.UserInterfaceEditPart;
import uidiagram.diagram.part.UidiagramDiagramEditorPlugin;

/**
 * @generated
 */
public class UidiagramElementTypes {

	/**
	* @generated
	*/
	private UidiagramElementTypes() {
	}

	/**
	* @generated
	*/
	private static Map<IElementType, ENamedElement> elements;

	/**
	* @generated
	*/
	private static DiagramElementTypeImages elementTypeImages = new DiagramElementTypeImages(
			UidiagramDiagramEditorPlugin.getInstance().getItemProvidersAdapterFactory());

	/**
	* @generated
	*/
	private static Set<IElementType> KNOWN_ELEMENT_TYPES;

	/**
	* @generated
	*/
	public static final IElementType UIDiagram_1000 = getElementType("UIDiagram.diagram.UIDiagram_1000"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType UserInterface_2001 = getElementType("UIDiagram.diagram.UserInterface_2001"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType Group_3001 = getElementType("UIDiagram.diagram.Group_3001"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType Group_3002 = getElementType("UIDiagram.diagram.Group_3002"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType GroupColumn_3003 = getElementType("UIDiagram.diagram.GroupColumn_3003"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType Group_3004 = getElementType("UIDiagram.diagram.Group_3004"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType GroupRow_3005 = getElementType("UIDiagram.diagram.GroupRow_3005"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType Group_3006 = getElementType("UIDiagram.diagram.Group_3006"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType Appbar_3007 = getElementType("UIDiagram.diagram.Appbar_3007"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType Button_3008 = getElementType("UIDiagram.diagram.Button_3008"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType Label_3009 = getElementType("UIDiagram.diagram.Label_3009"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType Tabbar_3010 = getElementType("UIDiagram.diagram.Tabbar_3010"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType Button_3011 = getElementType("UIDiagram.diagram.Button_3011"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType Label_3012 = getElementType("UIDiagram.diagram.Label_3012"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType Button_3013 = getElementType("UIDiagram.diagram.Button_3013"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType Label_3014 = getElementType("UIDiagram.diagram.Label_3014"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType Checkbox_3015 = getElementType("UIDiagram.diagram.Checkbox_3015"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType Input_3016 = getElementType("UIDiagram.diagram.Input_3016"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType ListView_3017 = getElementType("UIDiagram.diagram.ListView_3017"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType Group_3018 = getElementType("UIDiagram.diagram.Group_3018"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType RadioButton_3019 = getElementType("UIDiagram.diagram.RadioButton_3019"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType ComboBox_3020 = getElementType("UIDiagram.diagram.ComboBox_3020"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType DatePicker_3021 = getElementType("UIDiagram.diagram.DatePicker_3021"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType Switch_3022 = getElementType("UIDiagram.diagram.Switch_3022"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType Table_3023 = getElementType("UIDiagram.diagram.Table_3023"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType Column_3024 = getElementType("UIDiagram.diagram.Column_3024"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType GroupColumn_3025 = getElementType("UIDiagram.diagram.GroupColumn_3025"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType GroupColumn_3026 = getElementType("UIDiagram.diagram.GroupColumn_3026"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType GroupRow_3027 = getElementType("UIDiagram.diagram.GroupRow_3027"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType GroupColumn_3028 = getElementType("UIDiagram.diagram.GroupColumn_3028"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType Appbar_3029 = getElementType("UIDiagram.diagram.Appbar_3029"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType Tabbar_3030 = getElementType("UIDiagram.diagram.Tabbar_3030"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType Button_3031 = getElementType("UIDiagram.diagram.Button_3031"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType Label_3032 = getElementType("UIDiagram.diagram.Label_3032"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType Checkbox_3033 = getElementType("UIDiagram.diagram.Checkbox_3033"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType Input_3034 = getElementType("UIDiagram.diagram.Input_3034"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType ListView_3035 = getElementType("UIDiagram.diagram.ListView_3035"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType GroupRow_3036 = getElementType("UIDiagram.diagram.GroupRow_3036"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType GroupRow_3037 = getElementType("UIDiagram.diagram.GroupRow_3037"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType Appbar_3038 = getElementType("UIDiagram.diagram.Appbar_3038"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType Tabbar_3039 = getElementType("UIDiagram.diagram.Tabbar_3039"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType Button_3040 = getElementType("UIDiagram.diagram.Button_3040"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType Label_3041 = getElementType("UIDiagram.diagram.Label_3041"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType Checkbox_3042 = getElementType("UIDiagram.diagram.Checkbox_3042"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType Input_3043 = getElementType("UIDiagram.diagram.Input_3043"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType ListView_3044 = getElementType("UIDiagram.diagram.ListView_3044"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType Appbar_3045 = getElementType("UIDiagram.diagram.Appbar_3045"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType Tabbar_3046 = getElementType("UIDiagram.diagram.Tabbar_3046"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType Button_3047 = getElementType("UIDiagram.diagram.Button_3047"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType Label_3048 = getElementType("UIDiagram.diagram.Label_3048"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType Checkbox_3049 = getElementType("UIDiagram.diagram.Checkbox_3049"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType Input_3050 = getElementType("UIDiagram.diagram.Input_3050"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType ListView_3051 = getElementType("UIDiagram.diagram.ListView_3051"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType RadioButton_3052 = getElementType("UIDiagram.diagram.RadioButton_3052"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType ComboBox_3053 = getElementType("UIDiagram.diagram.ComboBox_3053"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType DatePicker_3054 = getElementType("UIDiagram.diagram.DatePicker_3054"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType Switch_3055 = getElementType("UIDiagram.diagram.Switch_3055"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType Table_3056 = getElementType("UIDiagram.diagram.Table_3056"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType RadioButton_3057 = getElementType("UIDiagram.diagram.RadioButton_3057"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType ComboBox_3058 = getElementType("UIDiagram.diagram.ComboBox_3058"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType DatePicker_3059 = getElementType("UIDiagram.diagram.DatePicker_3059"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType Switch_3060 = getElementType("UIDiagram.diagram.Switch_3060"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType Table_3061 = getElementType("UIDiagram.diagram.Table_3061"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType RadioButton_3062 = getElementType("UIDiagram.diagram.RadioButton_3062"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType ComboBox_3063 = getElementType("UIDiagram.diagram.ComboBox_3063"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType DatePicker_3064 = getElementType("UIDiagram.diagram.DatePicker_3064"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType Switch_3065 = getElementType("UIDiagram.diagram.Switch_3065"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType Table_3066 = getElementType("UIDiagram.diagram.Table_3066"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType GroupColumn_3067 = getElementType("UIDiagram.diagram.GroupColumn_3067"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType GroupRow_3068 = getElementType("UIDiagram.diagram.GroupRow_3068"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType Appbar_3069 = getElementType("UIDiagram.diagram.Appbar_3069"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType Tabbar_3070 = getElementType("UIDiagram.diagram.Tabbar_3070"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType Button_3071 = getElementType("UIDiagram.diagram.Button_3071"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType Label_3072 = getElementType("UIDiagram.diagram.Label_3072"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType Checkbox_3073 = getElementType("UIDiagram.diagram.Checkbox_3073"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType Input_3074 = getElementType("UIDiagram.diagram.Input_3074"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType ListView_3075 = getElementType("UIDiagram.diagram.ListView_3075"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType RadioButton_3076 = getElementType("UIDiagram.diagram.RadioButton_3076"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType ComboBox_3077 = getElementType("UIDiagram.diagram.ComboBox_3077"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType DatePicker_3078 = getElementType("UIDiagram.diagram.DatePicker_3078"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType Switch_3079 = getElementType("UIDiagram.diagram.Switch_3079"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType Table_3080 = getElementType("UIDiagram.diagram.Table_3080"); //$NON-NLS-1$

	/**
	* @generated
	*/
	public static ImageDescriptor getImageDescriptor(ENamedElement element) {
		return elementTypeImages.getImageDescriptor(element);
	}

	/**
	* @generated
	*/
	public static Image getImage(ENamedElement element) {
		return elementTypeImages.getImage(element);
	}

	/**
	* @generated
	*/
	public static ImageDescriptor getImageDescriptor(IAdaptable hint) {
		return getImageDescriptor(getElement(hint));
	}

	/**
	* @generated
	*/
	public static Image getImage(IAdaptable hint) {
		return getImage(getElement(hint));
	}

	/**
	* Returns 'type' of the ecore object associated with the hint.
	* 
	* @generated
	*/
	public static ENamedElement getElement(IAdaptable hint) {
		Object type = hint.getAdapter(IElementType.class);
		if (elements == null) {
			elements = new IdentityHashMap<IElementType, ENamedElement>();

			elements.put(UIDiagram_1000, UidiagramPackage.eINSTANCE.getUIDiagram());

			elements.put(UserInterface_2001, UidiagramPackage.eINSTANCE.getUserInterface());

			elements.put(Group_3001, UidiagramPackage.eINSTANCE.getGroup());

			elements.put(Group_3002, UidiagramPackage.eINSTANCE.getGroup());

			elements.put(GroupColumn_3003, UidiagramPackage.eINSTANCE.getGroupColumn());

			elements.put(Group_3004, UidiagramPackage.eINSTANCE.getGroup());

			elements.put(GroupRow_3005, UidiagramPackage.eINSTANCE.getGroupRow());

			elements.put(Group_3006, UidiagramPackage.eINSTANCE.getGroup());

			elements.put(Appbar_3007, UidiagramPackage.eINSTANCE.getAppbar());

			elements.put(Button_3008, UidiagramPackage.eINSTANCE.getButton());

			elements.put(Label_3009, UidiagramPackage.eINSTANCE.getLabel());

			elements.put(Tabbar_3010, UidiagramPackage.eINSTANCE.getTabbar());

			elements.put(Button_3011, UidiagramPackage.eINSTANCE.getButton());

			elements.put(Label_3012, UidiagramPackage.eINSTANCE.getLabel());

			elements.put(Button_3013, UidiagramPackage.eINSTANCE.getButton());

			elements.put(Label_3014, UidiagramPackage.eINSTANCE.getLabel());

			elements.put(Checkbox_3015, UidiagramPackage.eINSTANCE.getCheckbox());

			elements.put(Input_3016, UidiagramPackage.eINSTANCE.getInput());

			elements.put(ListView_3017, UidiagramPackage.eINSTANCE.getListView());

			elements.put(Group_3018, UidiagramPackage.eINSTANCE.getGroup());

			elements.put(RadioButton_3019, UidiagramPackage.eINSTANCE.getRadioButton());

			elements.put(ComboBox_3020, UidiagramPackage.eINSTANCE.getComboBox());

			elements.put(DatePicker_3021, UidiagramPackage.eINSTANCE.getDatePicker());

			elements.put(Switch_3022, UidiagramPackage.eINSTANCE.getSwitch());

			elements.put(Table_3023, UidiagramPackage.eINSTANCE.getTable());

			elements.put(Column_3024, UidiagramPackage.eINSTANCE.getColumn());

			elements.put(GroupColumn_3025, UidiagramPackage.eINSTANCE.getGroupColumn());

			elements.put(GroupColumn_3026, UidiagramPackage.eINSTANCE.getGroupColumn());

			elements.put(GroupRow_3027, UidiagramPackage.eINSTANCE.getGroupRow());

			elements.put(GroupColumn_3028, UidiagramPackage.eINSTANCE.getGroupColumn());

			elements.put(Appbar_3029, UidiagramPackage.eINSTANCE.getAppbar());

			elements.put(Tabbar_3030, UidiagramPackage.eINSTANCE.getTabbar());

			elements.put(Button_3031, UidiagramPackage.eINSTANCE.getButton());

			elements.put(Label_3032, UidiagramPackage.eINSTANCE.getLabel());

			elements.put(Checkbox_3033, UidiagramPackage.eINSTANCE.getCheckbox());

			elements.put(Input_3034, UidiagramPackage.eINSTANCE.getInput());

			elements.put(ListView_3035, UidiagramPackage.eINSTANCE.getListView());

			elements.put(GroupRow_3036, UidiagramPackage.eINSTANCE.getGroupRow());

			elements.put(GroupRow_3037, UidiagramPackage.eINSTANCE.getGroupRow());

			elements.put(Appbar_3038, UidiagramPackage.eINSTANCE.getAppbar());

			elements.put(Tabbar_3039, UidiagramPackage.eINSTANCE.getTabbar());

			elements.put(Button_3040, UidiagramPackage.eINSTANCE.getButton());

			elements.put(Label_3041, UidiagramPackage.eINSTANCE.getLabel());

			elements.put(Checkbox_3042, UidiagramPackage.eINSTANCE.getCheckbox());

			elements.put(Input_3043, UidiagramPackage.eINSTANCE.getInput());

			elements.put(ListView_3044, UidiagramPackage.eINSTANCE.getListView());

			elements.put(Appbar_3045, UidiagramPackage.eINSTANCE.getAppbar());

			elements.put(Tabbar_3046, UidiagramPackage.eINSTANCE.getTabbar());

			elements.put(Button_3047, UidiagramPackage.eINSTANCE.getButton());

			elements.put(Label_3048, UidiagramPackage.eINSTANCE.getLabel());

			elements.put(Checkbox_3049, UidiagramPackage.eINSTANCE.getCheckbox());

			elements.put(Input_3050, UidiagramPackage.eINSTANCE.getInput());

			elements.put(ListView_3051, UidiagramPackage.eINSTANCE.getListView());

			elements.put(RadioButton_3052, UidiagramPackage.eINSTANCE.getRadioButton());

			elements.put(ComboBox_3053, UidiagramPackage.eINSTANCE.getComboBox());

			elements.put(DatePicker_3054, UidiagramPackage.eINSTANCE.getDatePicker());

			elements.put(Switch_3055, UidiagramPackage.eINSTANCE.getSwitch());

			elements.put(Table_3056, UidiagramPackage.eINSTANCE.getTable());

			elements.put(RadioButton_3057, UidiagramPackage.eINSTANCE.getRadioButton());

			elements.put(ComboBox_3058, UidiagramPackage.eINSTANCE.getComboBox());

			elements.put(DatePicker_3059, UidiagramPackage.eINSTANCE.getDatePicker());

			elements.put(Switch_3060, UidiagramPackage.eINSTANCE.getSwitch());

			elements.put(Table_3061, UidiagramPackage.eINSTANCE.getTable());

			elements.put(RadioButton_3062, UidiagramPackage.eINSTANCE.getRadioButton());

			elements.put(ComboBox_3063, UidiagramPackage.eINSTANCE.getComboBox());

			elements.put(DatePicker_3064, UidiagramPackage.eINSTANCE.getDatePicker());

			elements.put(Switch_3065, UidiagramPackage.eINSTANCE.getSwitch());

			elements.put(Table_3066, UidiagramPackage.eINSTANCE.getTable());

			elements.put(GroupColumn_3067, UidiagramPackage.eINSTANCE.getGroupColumn());

			elements.put(GroupRow_3068, UidiagramPackage.eINSTANCE.getGroupRow());

			elements.put(Appbar_3069, UidiagramPackage.eINSTANCE.getAppbar());

			elements.put(Tabbar_3070, UidiagramPackage.eINSTANCE.getTabbar());

			elements.put(Button_3071, UidiagramPackage.eINSTANCE.getButton());

			elements.put(Label_3072, UidiagramPackage.eINSTANCE.getLabel());

			elements.put(Checkbox_3073, UidiagramPackage.eINSTANCE.getCheckbox());

			elements.put(Input_3074, UidiagramPackage.eINSTANCE.getInput());

			elements.put(ListView_3075, UidiagramPackage.eINSTANCE.getListView());

			elements.put(RadioButton_3076, UidiagramPackage.eINSTANCE.getRadioButton());

			elements.put(ComboBox_3077, UidiagramPackage.eINSTANCE.getComboBox());

			elements.put(DatePicker_3078, UidiagramPackage.eINSTANCE.getDatePicker());

			elements.put(Switch_3079, UidiagramPackage.eINSTANCE.getSwitch());

			elements.put(Table_3080, UidiagramPackage.eINSTANCE.getTable());
		}
		return (ENamedElement) elements.get(type);
	}

	/**
	* @generated
	*/
	private static IElementType getElementType(String id) {
		return ElementTypeRegistry.getInstance().getType(id);
	}

	/**
	* @generated
	*/
	public static boolean isKnownElementType(IElementType elementType) {
		if (KNOWN_ELEMENT_TYPES == null) {
			KNOWN_ELEMENT_TYPES = new HashSet<IElementType>();
			KNOWN_ELEMENT_TYPES.add(UIDiagram_1000);
			KNOWN_ELEMENT_TYPES.add(UserInterface_2001);
			KNOWN_ELEMENT_TYPES.add(Group_3001);
			KNOWN_ELEMENT_TYPES.add(Group_3002);
			KNOWN_ELEMENT_TYPES.add(GroupColumn_3003);
			KNOWN_ELEMENT_TYPES.add(Group_3004);
			KNOWN_ELEMENT_TYPES.add(GroupRow_3005);
			KNOWN_ELEMENT_TYPES.add(Group_3006);
			KNOWN_ELEMENT_TYPES.add(Appbar_3007);
			KNOWN_ELEMENT_TYPES.add(Button_3008);
			KNOWN_ELEMENT_TYPES.add(Label_3009);
			KNOWN_ELEMENT_TYPES.add(Tabbar_3010);
			KNOWN_ELEMENT_TYPES.add(Button_3011);
			KNOWN_ELEMENT_TYPES.add(Label_3012);
			KNOWN_ELEMENT_TYPES.add(Button_3013);
			KNOWN_ELEMENT_TYPES.add(Label_3014);
			KNOWN_ELEMENT_TYPES.add(Checkbox_3015);
			KNOWN_ELEMENT_TYPES.add(Input_3016);
			KNOWN_ELEMENT_TYPES.add(ListView_3017);
			KNOWN_ELEMENT_TYPES.add(Group_3018);
			KNOWN_ELEMENT_TYPES.add(RadioButton_3019);
			KNOWN_ELEMENT_TYPES.add(ComboBox_3020);
			KNOWN_ELEMENT_TYPES.add(DatePicker_3021);
			KNOWN_ELEMENT_TYPES.add(Switch_3022);
			KNOWN_ELEMENT_TYPES.add(Table_3023);
			KNOWN_ELEMENT_TYPES.add(Column_3024);
			KNOWN_ELEMENT_TYPES.add(GroupColumn_3025);
			KNOWN_ELEMENT_TYPES.add(GroupColumn_3026);
			KNOWN_ELEMENT_TYPES.add(GroupRow_3027);
			KNOWN_ELEMENT_TYPES.add(GroupColumn_3028);
			KNOWN_ELEMENT_TYPES.add(Appbar_3029);
			KNOWN_ELEMENT_TYPES.add(Tabbar_3030);
			KNOWN_ELEMENT_TYPES.add(Button_3031);
			KNOWN_ELEMENT_TYPES.add(Label_3032);
			KNOWN_ELEMENT_TYPES.add(Checkbox_3033);
			KNOWN_ELEMENT_TYPES.add(Input_3034);
			KNOWN_ELEMENT_TYPES.add(ListView_3035);
			KNOWN_ELEMENT_TYPES.add(GroupRow_3036);
			KNOWN_ELEMENT_TYPES.add(GroupRow_3037);
			KNOWN_ELEMENT_TYPES.add(Appbar_3038);
			KNOWN_ELEMENT_TYPES.add(Tabbar_3039);
			KNOWN_ELEMENT_TYPES.add(Button_3040);
			KNOWN_ELEMENT_TYPES.add(Label_3041);
			KNOWN_ELEMENT_TYPES.add(Checkbox_3042);
			KNOWN_ELEMENT_TYPES.add(Input_3043);
			KNOWN_ELEMENT_TYPES.add(ListView_3044);
			KNOWN_ELEMENT_TYPES.add(Appbar_3045);
			KNOWN_ELEMENT_TYPES.add(Tabbar_3046);
			KNOWN_ELEMENT_TYPES.add(Button_3047);
			KNOWN_ELEMENT_TYPES.add(Label_3048);
			KNOWN_ELEMENT_TYPES.add(Checkbox_3049);
			KNOWN_ELEMENT_TYPES.add(Input_3050);
			KNOWN_ELEMENT_TYPES.add(ListView_3051);
			KNOWN_ELEMENT_TYPES.add(RadioButton_3052);
			KNOWN_ELEMENT_TYPES.add(ComboBox_3053);
			KNOWN_ELEMENT_TYPES.add(DatePicker_3054);
			KNOWN_ELEMENT_TYPES.add(Switch_3055);
			KNOWN_ELEMENT_TYPES.add(Table_3056);
			KNOWN_ELEMENT_TYPES.add(RadioButton_3057);
			KNOWN_ELEMENT_TYPES.add(ComboBox_3058);
			KNOWN_ELEMENT_TYPES.add(DatePicker_3059);
			KNOWN_ELEMENT_TYPES.add(Switch_3060);
			KNOWN_ELEMENT_TYPES.add(Table_3061);
			KNOWN_ELEMENT_TYPES.add(RadioButton_3062);
			KNOWN_ELEMENT_TYPES.add(ComboBox_3063);
			KNOWN_ELEMENT_TYPES.add(DatePicker_3064);
			KNOWN_ELEMENT_TYPES.add(Switch_3065);
			KNOWN_ELEMENT_TYPES.add(Table_3066);
			KNOWN_ELEMENT_TYPES.add(GroupColumn_3067);
			KNOWN_ELEMENT_TYPES.add(GroupRow_3068);
			KNOWN_ELEMENT_TYPES.add(Appbar_3069);
			KNOWN_ELEMENT_TYPES.add(Tabbar_3070);
			KNOWN_ELEMENT_TYPES.add(Button_3071);
			KNOWN_ELEMENT_TYPES.add(Label_3072);
			KNOWN_ELEMENT_TYPES.add(Checkbox_3073);
			KNOWN_ELEMENT_TYPES.add(Input_3074);
			KNOWN_ELEMENT_TYPES.add(ListView_3075);
			KNOWN_ELEMENT_TYPES.add(RadioButton_3076);
			KNOWN_ELEMENT_TYPES.add(ComboBox_3077);
			KNOWN_ELEMENT_TYPES.add(DatePicker_3078);
			KNOWN_ELEMENT_TYPES.add(Switch_3079);
			KNOWN_ELEMENT_TYPES.add(Table_3080);
		}
		return KNOWN_ELEMENT_TYPES.contains(elementType);
	}

	/**
	* @generated
	*/
	public static IElementType getElementType(int visualID) {
		switch (visualID) {
		case UIDiagramEditPart.VISUAL_ID:
			return UIDiagram_1000;
		case UserInterfaceEditPart.VISUAL_ID:
			return UserInterface_2001;
		case GroupEditPart.VISUAL_ID:
			return Group_3001;
		case Group2EditPart.VISUAL_ID:
			return Group_3002;
		case GroupColumnEditPart.VISUAL_ID:
			return GroupColumn_3003;
		case Group3EditPart.VISUAL_ID:
			return Group_3004;
		case GroupRowEditPart.VISUAL_ID:
			return GroupRow_3005;
		case Group4EditPart.VISUAL_ID:
			return Group_3006;
		case AppbarEditPart.VISUAL_ID:
			return Appbar_3007;
		case ButtonEditPart.VISUAL_ID:
			return Button_3008;
		case LabelEditPart.VISUAL_ID:
			return Label_3009;
		case TabbarEditPart.VISUAL_ID:
			return Tabbar_3010;
		case Button2EditPart.VISUAL_ID:
			return Button_3011;
		case Label2EditPart.VISUAL_ID:
			return Label_3012;
		case Button3EditPart.VISUAL_ID:
			return Button_3013;
		case Label3EditPart.VISUAL_ID:
			return Label_3014;
		case CheckboxEditPart.VISUAL_ID:
			return Checkbox_3015;
		case InputEditPart.VISUAL_ID:
			return Input_3016;
		case ListViewEditPart.VISUAL_ID:
			return ListView_3017;
		case Group5EditPart.VISUAL_ID:
			return Group_3018;
		case RadioButtonEditPart.VISUAL_ID:
			return RadioButton_3019;
		case ComboBoxEditPart.VISUAL_ID:
			return ComboBox_3020;
		case DatePickerEditPart.VISUAL_ID:
			return DatePicker_3021;
		case SwitchEditPart.VISUAL_ID:
			return Switch_3022;
		case TableEditPart.VISUAL_ID:
			return Table_3023;
		case ColumnEditPart.VISUAL_ID:
			return Column_3024;
		case GroupColumn2EditPart.VISUAL_ID:
			return GroupColumn_3025;
		case GroupColumn3EditPart.VISUAL_ID:
			return GroupColumn_3026;
		case GroupRow2EditPart.VISUAL_ID:
			return GroupRow_3027;
		case GroupColumn4EditPart.VISUAL_ID:
			return GroupColumn_3028;
		case Appbar2EditPart.VISUAL_ID:
			return Appbar_3029;
		case Tabbar2EditPart.VISUAL_ID:
			return Tabbar_3030;
		case Button4EditPart.VISUAL_ID:
			return Button_3031;
		case Label4EditPart.VISUAL_ID:
			return Label_3032;
		case Checkbox2EditPart.VISUAL_ID:
			return Checkbox_3033;
		case Input2EditPart.VISUAL_ID:
			return Input_3034;
		case ListView2EditPart.VISUAL_ID:
			return ListView_3035;
		case GroupRow3EditPart.VISUAL_ID:
			return GroupRow_3036;
		case GroupRow4EditPart.VISUAL_ID:
			return GroupRow_3037;
		case Appbar3EditPart.VISUAL_ID:
			return Appbar_3038;
		case Tabbar3EditPart.VISUAL_ID:
			return Tabbar_3039;
		case Button5EditPart.VISUAL_ID:
			return Button_3040;
		case Label5EditPart.VISUAL_ID:
			return Label_3041;
		case Checkbox3EditPart.VISUAL_ID:
			return Checkbox_3042;
		case Input3EditPart.VISUAL_ID:
			return Input_3043;
		case ListView3EditPart.VISUAL_ID:
			return ListView_3044;
		case Appbar4EditPart.VISUAL_ID:
			return Appbar_3045;
		case Tabbar4EditPart.VISUAL_ID:
			return Tabbar_3046;
		case Button6EditPart.VISUAL_ID:
			return Button_3047;
		case Label6EditPart.VISUAL_ID:
			return Label_3048;
		case Checkbox4EditPart.VISUAL_ID:
			return Checkbox_3049;
		case Input4EditPart.VISUAL_ID:
			return Input_3050;
		case ListView4EditPart.VISUAL_ID:
			return ListView_3051;
		case RadioButton2EditPart.VISUAL_ID:
			return RadioButton_3052;
		case ComboBox2EditPart.VISUAL_ID:
			return ComboBox_3053;
		case DatePicker2EditPart.VISUAL_ID:
			return DatePicker_3054;
		case Switch2EditPart.VISUAL_ID:
			return Switch_3055;
		case Table2EditPart.VISUAL_ID:
			return Table_3056;
		case RadioButton3EditPart.VISUAL_ID:
			return RadioButton_3057;
		case ComboBox3EditPart.VISUAL_ID:
			return ComboBox_3058;
		case DatePicker3EditPart.VISUAL_ID:
			return DatePicker_3059;
		case Switch3EditPart.VISUAL_ID:
			return Switch_3060;
		case Table3EditPart.VISUAL_ID:
			return Table_3061;
		case RadioButton4EditPart.VISUAL_ID:
			return RadioButton_3062;
		case ComboBox4EditPart.VISUAL_ID:
			return ComboBox_3063;
		case DatePicker4EditPart.VISUAL_ID:
			return DatePicker_3064;
		case Switch4EditPart.VISUAL_ID:
			return Switch_3065;
		case Table4EditPart.VISUAL_ID:
			return Table_3066;
		case GroupColumn5EditPart.VISUAL_ID:
			return GroupColumn_3067;
		case GroupRow5EditPart.VISUAL_ID:
			return GroupRow_3068;
		case Appbar5EditPart.VISUAL_ID:
			return Appbar_3069;
		case Tabbar5EditPart.VISUAL_ID:
			return Tabbar_3070;
		case Button7EditPart.VISUAL_ID:
			return Button_3071;
		case Label7EditPart.VISUAL_ID:
			return Label_3072;
		case Checkbox5EditPart.VISUAL_ID:
			return Checkbox_3073;
		case Input5EditPart.VISUAL_ID:
			return Input_3074;
		case ListView5EditPart.VISUAL_ID:
			return ListView_3075;
		case RadioButton5EditPart.VISUAL_ID:
			return RadioButton_3076;
		case ComboBox5EditPart.VISUAL_ID:
			return ComboBox_3077;
		case DatePicker5EditPart.VISUAL_ID:
			return DatePicker_3078;
		case Switch5EditPart.VISUAL_ID:
			return Switch_3079;
		case Table5EditPart.VISUAL_ID:
			return Table_3080;
		}
		return null;
	}

	/**
	* @generated
	*/
	public static final DiagramElementTypes TYPED_INSTANCE = new DiagramElementTypes(elementTypeImages) {

		/**
		* @generated
		*/
		@Override

		public boolean isKnownElementType(IElementType elementType) {
			return uidiagram.diagram.providers.UidiagramElementTypes.isKnownElementType(elementType);
		}

		/**
		* @generated
		*/
		@Override

		public IElementType getElementTypeForVisualId(int visualID) {
			return uidiagram.diagram.providers.UidiagramElementTypes.getElementType(visualID);
		}

		/**
		* @generated
		*/
		@Override

		public ENamedElement getDefiningNamedElement(IAdaptable elementTypeAdapter) {
			return uidiagram.diagram.providers.UidiagramElementTypes.getElement(elementTypeAdapter);
		}
	};

}
