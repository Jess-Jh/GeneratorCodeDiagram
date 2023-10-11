/*
* 
*/
package uidiagram.diagram.navigator;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.gmf.runtime.common.ui.services.parser.IParser;
import org.eclipse.gmf.runtime.common.ui.services.parser.ParserOptions;
import org.eclipse.gmf.runtime.emf.core.util.EObjectAdapter;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.jface.resource.ImageRegistry;
import org.eclipse.jface.viewers.ITreePathLabelProvider;
import org.eclipse.jface.viewers.LabelProvider;
import org.eclipse.jface.viewers.TreePath;
import org.eclipse.jface.viewers.ViewerLabel;
import org.eclipse.swt.graphics.Image;
import org.eclipse.ui.IMemento;
import org.eclipse.ui.navigator.ICommonContentExtensionSite;
import org.eclipse.ui.navigator.ICommonLabelProvider;

import uidiagram.UIDiagram;
import uidiagram.diagram.edit.parts.*;
import uidiagram.diagram.edit.parts.ModelFactoryEditPart;
import uidiagram.diagram.part.UidiagramDiagramEditorPlugin;
import uidiagram.diagram.part.UidiagramVisualIDRegistry;
import uidiagram.diagram.providers.UidiagramElementTypes;
import uidiagram.diagram.providers.UidiagramParserProvider;

/**
 * @generated
 */
public class UidiagramNavigatorLabelProvider extends LabelProvider
		implements ICommonLabelProvider, ITreePathLabelProvider {

	/**
	* @generated
	*/
	static {
		UidiagramDiagramEditorPlugin.getInstance().getImageRegistry().put("Navigator?UnknownElement", //$NON-NLS-1$
				ImageDescriptor.getMissingImageDescriptor());
		UidiagramDiagramEditorPlugin.getInstance().getImageRegistry().put("Navigator?ImageNotFound", //$NON-NLS-1$
				ImageDescriptor.getMissingImageDescriptor());
	}

	/**
	* @generated
	*/
	public void updateLabel(ViewerLabel label, TreePath elementPath) {
		Object element = elementPath.getLastSegment();
		if (element instanceof UidiagramNavigatorItem && !isOwnView(((UidiagramNavigatorItem) element).getView())) {
			return;
		}
		label.setText(getText(element));
		label.setImage(getImage(element));
	}

	/**
	* @generated
	*/
	public Image getImage(Object element) {
		if (element instanceof UidiagramNavigatorGroup) {
			UidiagramNavigatorGroup group = (UidiagramNavigatorGroup) element;
			return UidiagramDiagramEditorPlugin.getInstance().getBundledImage(group.getIcon());
		}

		if (element instanceof UidiagramNavigatorItem) {
			UidiagramNavigatorItem navigatorItem = (UidiagramNavigatorItem) element;
			if (!isOwnView(navigatorItem.getView())) {
				return super.getImage(element);
			}
			return getImage(navigatorItem.getView());
		}

		// Due to plugin.xml content will be called only for "own" views
		if (element instanceof IAdaptable) {
			View view = (View) ((IAdaptable) element).getAdapter(View.class);
			if (view != null && isOwnView(view)) {
				return getImage(view);
			}
		}

		return super.getImage(element);
	}

	/**
	* @generated
	*/
	public Image getImage(View view) {
		switch (UidiagramVisualIDRegistry.getVisualID(view)) {
		case UIDiagramEditPart.VISUAL_ID:
			return getImage("Navigator?Diagram?uidiagram?UIDiagram", UidiagramElementTypes.UIDiagram_1000); //$NON-NLS-1$
		case UserInterfaceEditPart.VISUAL_ID:
			return getImage("Navigator?TopLevelNode?uidiagram?UserInterface", UidiagramElementTypes.UserInterface_2001); //$NON-NLS-1$
		case GroupEditPart.VISUAL_ID:
			return getImage("Navigator?Node?uidiagram?Group", UidiagramElementTypes.Group_3001); //$NON-NLS-1$
		case Group2EditPart.VISUAL_ID:
			return getImage("Navigator?Node?uidiagram?Group", UidiagramElementTypes.Group_3002); //$NON-NLS-1$
		case GroupColumnEditPart.VISUAL_ID:
			return getImage("Navigator?Node?uidiagram?GroupColumn", UidiagramElementTypes.GroupColumn_3003); //$NON-NLS-1$
		case Group3EditPart.VISUAL_ID:
			return getImage("Navigator?Node?uidiagram?Group", UidiagramElementTypes.Group_3004); //$NON-NLS-1$
		case GroupRowEditPart.VISUAL_ID:
			return getImage("Navigator?Node?uidiagram?GroupRow", UidiagramElementTypes.GroupRow_3005); //$NON-NLS-1$
		case Group4EditPart.VISUAL_ID:
			return getImage("Navigator?Node?uidiagram?Group", UidiagramElementTypes.Group_3006); //$NON-NLS-1$
		case AppbarEditPart.VISUAL_ID:
			return getImage("Navigator?Node?uidiagram?Appbar", UidiagramElementTypes.Appbar_3007); //$NON-NLS-1$
		case TabbarEditPart.VISUAL_ID:
			return getImage("Navigator?Node?uidiagram?Tabbar", UidiagramElementTypes.Tabbar_3008); //$NON-NLS-1$
		case Button3EditPart.VISUAL_ID:
			return getImage("Navigator?Node?uidiagram?Button", UidiagramElementTypes.Button_3009); //$NON-NLS-1$
		case Label3EditPart.VISUAL_ID:
			return getImage("Navigator?Node?uidiagram?Label", UidiagramElementTypes.Label_3010); //$NON-NLS-1$
		case CheckboxEditPart.VISUAL_ID:
			return getImage("Navigator?Node?uidiagram?Checkbox", UidiagramElementTypes.Checkbox_3011); //$NON-NLS-1$
		case InputEditPart.VISUAL_ID:
			return getImage("Navigator?Node?uidiagram?Input", UidiagramElementTypes.Input_3012); //$NON-NLS-1$
		case ListViewEditPart.VISUAL_ID:
			return getImage("Navigator?Node?uidiagram?ListView", UidiagramElementTypes.ListView_3013); //$NON-NLS-1$
		case RadioButtonEditPart.VISUAL_ID:
			return getImage("Navigator?Node?uidiagram?RadioButton", UidiagramElementTypes.RadioButton_3014); //$NON-NLS-1$
		case ComboBoxEditPart.VISUAL_ID:
			return getImage("Navigator?Node?uidiagram?ComboBox", UidiagramElementTypes.ComboBox_3015); //$NON-NLS-1$
		case DatePickerEditPart.VISUAL_ID:
			return getImage("Navigator?Node?uidiagram?DatePicker", UidiagramElementTypes.DatePicker_3016); //$NON-NLS-1$
		case SwitchEditPart.VISUAL_ID:
			return getImage("Navigator?Node?uidiagram?Switch", UidiagramElementTypes.Switch_3017); //$NON-NLS-1$
		case TableEditPart.VISUAL_ID:
			return getImage("Navigator?Node?uidiagram?Table", UidiagramElementTypes.Table_3018); //$NON-NLS-1$
		case ColumnEditPart.VISUAL_ID:
			return getImage("Navigator?Node?uidiagram?Column", UidiagramElementTypes.Column_3019); //$NON-NLS-1$
		case GroupColumn4EditPart.VISUAL_ID:
			return getImage("Navigator?Node?uidiagram?GroupColumn", UidiagramElementTypes.GroupColumn_3020); //$NON-NLS-1$
		case GroupColumn3EditPart.VISUAL_ID:
			return getImage("Navigator?Node?uidiagram?GroupColumn", UidiagramElementTypes.GroupColumn_3021); //$NON-NLS-1$
		case GroupRow2EditPart.VISUAL_ID:
			return getImage("Navigator?Node?uidiagram?GroupRow", UidiagramElementTypes.GroupRow_3022); //$NON-NLS-1$
		case GroupRow4EditPart.VISUAL_ID:
			return getImage("Navigator?Node?uidiagram?GroupRow", UidiagramElementTypes.GroupRow_3023); //$NON-NLS-1$
		case Appbar3EditPart.VISUAL_ID:
			return getImage("Navigator?Node?uidiagram?Appbar", UidiagramElementTypes.Appbar_3024); //$NON-NLS-1$
		case Tabbar3EditPart.VISUAL_ID:
			return getImage("Navigator?Node?uidiagram?Tabbar", UidiagramElementTypes.Tabbar_3025); //$NON-NLS-1$
		case Button5EditPart.VISUAL_ID:
			return getImage("Navigator?Node?uidiagram?Button", UidiagramElementTypes.Button_3026); //$NON-NLS-1$
		case Label5EditPart.VISUAL_ID:
			return getImage("Navigator?Node?uidiagram?Label", UidiagramElementTypes.Label_3027); //$NON-NLS-1$
		case Checkbox3EditPart.VISUAL_ID:
			return getImage("Navigator?Node?uidiagram?Checkbox", UidiagramElementTypes.Checkbox_3028); //$NON-NLS-1$
		case Input3EditPart.VISUAL_ID:
			return getImage("Navigator?Node?uidiagram?Input", UidiagramElementTypes.Input_3029); //$NON-NLS-1$
		case ListView3EditPart.VISUAL_ID:
			return getImage("Navigator?Node?uidiagram?ListView", UidiagramElementTypes.ListView_3030); //$NON-NLS-1$
		case RadioButton3EditPart.VISUAL_ID:
			return getImage("Navigator?Node?uidiagram?RadioButton", UidiagramElementTypes.RadioButton_3031); //$NON-NLS-1$
		case ComboBox3EditPart.VISUAL_ID:
			return getImage("Navigator?Node?uidiagram?ComboBox", UidiagramElementTypes.ComboBox_3032); //$NON-NLS-1$
		case DatePicker3EditPart.VISUAL_ID:
			return getImage("Navigator?Node?uidiagram?DatePicker", UidiagramElementTypes.DatePicker_3033); //$NON-NLS-1$
		case Switch3EditPart.VISUAL_ID:
			return getImage("Navigator?Node?uidiagram?Switch", UidiagramElementTypes.Switch_3034); //$NON-NLS-1$
		case Table3EditPart.VISUAL_ID:
			return getImage("Navigator?Node?uidiagram?Table", UidiagramElementTypes.Table_3035); //$NON-NLS-1$
		case Appbar2EditPart.VISUAL_ID:
			return getImage("Navigator?Node?uidiagram?Appbar", UidiagramElementTypes.Appbar_3036); //$NON-NLS-1$
		case Tabbar2EditPart.VISUAL_ID:
			return getImage("Navigator?Node?uidiagram?Tabbar", UidiagramElementTypes.Tabbar_3037); //$NON-NLS-1$
		case Button4EditPart.VISUAL_ID:
			return getImage("Navigator?Node?uidiagram?Button", UidiagramElementTypes.Button_3038); //$NON-NLS-1$
		case Label4EditPart.VISUAL_ID:
			return getImage("Navigator?Node?uidiagram?Label", UidiagramElementTypes.Label_3039); //$NON-NLS-1$
		case Checkbox2EditPart.VISUAL_ID:
			return getImage("Navigator?Node?uidiagram?Checkbox", UidiagramElementTypes.Checkbox_3040); //$NON-NLS-1$
		case Input2EditPart.VISUAL_ID:
			return getImage("Navigator?Node?uidiagram?Input", UidiagramElementTypes.Input_3041); //$NON-NLS-1$
		case ListView2EditPart.VISUAL_ID:
			return getImage("Navigator?Node?uidiagram?ListView", UidiagramElementTypes.ListView_3042); //$NON-NLS-1$
		case RadioButton4EditPart.VISUAL_ID:
			return getImage("Navigator?Node?uidiagram?RadioButton", UidiagramElementTypes.RadioButton_3043); //$NON-NLS-1$
		case ComboBox4EditPart.VISUAL_ID:
			return getImage("Navigator?Node?uidiagram?ComboBox", UidiagramElementTypes.ComboBox_3044); //$NON-NLS-1$
		case DatePicker4EditPart.VISUAL_ID:
			return getImage("Navigator?Node?uidiagram?DatePicker", UidiagramElementTypes.DatePicker_3045); //$NON-NLS-1$
		case Switch4EditPart.VISUAL_ID:
			return getImage("Navigator?Node?uidiagram?Switch", UidiagramElementTypes.Switch_3046); //$NON-NLS-1$
		case Table4EditPart.VISUAL_ID:
			return getImage("Navigator?Node?uidiagram?Table", UidiagramElementTypes.Table_3047); //$NON-NLS-1$
		case GroupColumn5EditPart.VISUAL_ID:
			return getImage("Navigator?Node?uidiagram?GroupColumn", UidiagramElementTypes.GroupColumn_3048); //$NON-NLS-1$
		case GroupRow5EditPart.VISUAL_ID:
			return getImage("Navigator?Node?uidiagram?GroupRow", UidiagramElementTypes.GroupRow_3049); //$NON-NLS-1$
		case Appbar5EditPart.VISUAL_ID:
			return getImage("Navigator?Node?uidiagram?Appbar", UidiagramElementTypes.Appbar_3050); //$NON-NLS-1$
		case Tabbar5EditPart.VISUAL_ID:
			return getImage("Navigator?Node?uidiagram?Tabbar", UidiagramElementTypes.Tabbar_3051); //$NON-NLS-1$
		case Button7EditPart.VISUAL_ID:
			return getImage("Navigator?Node?uidiagram?Button", UidiagramElementTypes.Button_3052); //$NON-NLS-1$
		case Label7EditPart.VISUAL_ID:
			return getImage("Navigator?Node?uidiagram?Label", UidiagramElementTypes.Label_3053); //$NON-NLS-1$
		case Checkbox5EditPart.VISUAL_ID:
			return getImage("Navigator?Node?uidiagram?Checkbox", UidiagramElementTypes.Checkbox_3054); //$NON-NLS-1$
		case Input5EditPart.VISUAL_ID:
			return getImage("Navigator?Node?uidiagram?Input", UidiagramElementTypes.Input_3055); //$NON-NLS-1$
		case ListView5EditPart.VISUAL_ID:
			return getImage("Navigator?Node?uidiagram?ListView", UidiagramElementTypes.ListView_3056); //$NON-NLS-1$
		case RadioButton5EditPart.VISUAL_ID:
			return getImage("Navigator?Node?uidiagram?RadioButton", UidiagramElementTypes.RadioButton_3057); //$NON-NLS-1$
		case ComboBox5EditPart.VISUAL_ID:
			return getImage("Navigator?Node?uidiagram?ComboBox", UidiagramElementTypes.ComboBox_3058); //$NON-NLS-1$
		case DatePicker5EditPart.VISUAL_ID:
			return getImage("Navigator?Node?uidiagram?DatePicker", UidiagramElementTypes.DatePicker_3059); //$NON-NLS-1$
		case Switch5EditPart.VISUAL_ID:
			return getImage("Navigator?Node?uidiagram?Switch", UidiagramElementTypes.Switch_3060); //$NON-NLS-1$
		case Table5EditPart.VISUAL_ID:
			return getImage("Navigator?Node?uidiagram?Table", UidiagramElementTypes.Table_3061); //$NON-NLS-1$
		case ButtonEditPart.VISUAL_ID:
			return getImage("Navigator?Node?uidiagram?Button", UidiagramElementTypes.Button_3062); //$NON-NLS-1$
		case Button2EditPart.VISUAL_ID:
			return getImage("Navigator?Node?uidiagram?Button", UidiagramElementTypes.Button_3063); //$NON-NLS-1$
		case LabelEditPart.VISUAL_ID:
			return getImage("Navigator?Node?uidiagram?Label", UidiagramElementTypes.Label_3064); //$NON-NLS-1$
		case Label2EditPart.VISUAL_ID:
			return getImage("Navigator?Node?uidiagram?Label", UidiagramElementTypes.Label_3065); //$NON-NLS-1$
		case Group5EditPart.VISUAL_ID:
			return getImage("Navigator?Node?uidiagram?Group", UidiagramElementTypes.Group_3066); //$NON-NLS-1$
		case GroupColumn2EditPart.VISUAL_ID:
			return getImage("Navigator?Node?uidiagram?GroupColumn", UidiagramElementTypes.GroupColumn_3067); //$NON-NLS-1$
		case GroupRow3EditPart.VISUAL_ID:
			return getImage("Navigator?Node?uidiagram?GroupRow", UidiagramElementTypes.GroupRow_3068); //$NON-NLS-1$
		case Appbar4EditPart.VISUAL_ID:
			return getImage("Navigator?Node?uidiagram?Appbar", UidiagramElementTypes.Appbar_3069); //$NON-NLS-1$
		case Tabbar4EditPart.VISUAL_ID:
			return getImage("Navigator?Node?uidiagram?Tabbar", UidiagramElementTypes.Tabbar_3070); //$NON-NLS-1$
		case Button6EditPart.VISUAL_ID:
			return getImage("Navigator?Node?uidiagram?Button", UidiagramElementTypes.Button_3071); //$NON-NLS-1$
		case Label6EditPart.VISUAL_ID:
			return getImage("Navigator?Node?uidiagram?Label", UidiagramElementTypes.Label_3072); //$NON-NLS-1$
		case Checkbox4EditPart.VISUAL_ID:
			return getImage("Navigator?Node?uidiagram?Checkbox", UidiagramElementTypes.Checkbox_3073); //$NON-NLS-1$
		case Input4EditPart.VISUAL_ID:
			return getImage("Navigator?Node?uidiagram?Input", UidiagramElementTypes.Input_3074); //$NON-NLS-1$
		case ListView4EditPart.VISUAL_ID:
			return getImage("Navigator?Node?uidiagram?ListView", UidiagramElementTypes.ListView_3075); //$NON-NLS-1$
		case RadioButton2EditPart.VISUAL_ID:
			return getImage("Navigator?Node?uidiagram?RadioButton", UidiagramElementTypes.RadioButton_3076); //$NON-NLS-1$
		case ComboBox2EditPart.VISUAL_ID:
			return getImage("Navigator?Node?uidiagram?ComboBox", UidiagramElementTypes.ComboBox_3077); //$NON-NLS-1$
		case DatePicker2EditPart.VISUAL_ID:
			return getImage("Navigator?Node?uidiagram?DatePicker", UidiagramElementTypes.DatePicker_3078); //$NON-NLS-1$
		case Switch2EditPart.VISUAL_ID:
			return getImage("Navigator?Node?uidiagram?Switch", UidiagramElementTypes.Switch_3079); //$NON-NLS-1$
		case Table2EditPart.VISUAL_ID:
			return getImage("Navigator?Node?uidiagram?Table", UidiagramElementTypes.Table_3080); //$NON-NLS-1$
		}
		return getImage("Navigator?UnknownElement", null); //$NON-NLS-1$
	}

	/**
	* @generated
	*/
	private Image getImage(String key, IElementType elementType) {
		ImageRegistry imageRegistry = UidiagramDiagramEditorPlugin.getInstance().getImageRegistry();
		Image image = imageRegistry.get(key);
		if (image == null && elementType != null && UidiagramElementTypes.isKnownElementType(elementType)) {
			image = UidiagramElementTypes.getImage(elementType);
			imageRegistry.put(key, image);
		}

		if (image == null) {
			image = imageRegistry.get("Navigator?ImageNotFound"); //$NON-NLS-1$
			imageRegistry.put(key, image);
		}
		return image;
	}

	/**
	* @generated
	*/
	public String getText(Object element) {
		if (element instanceof UidiagramNavigatorGroup) {
			UidiagramNavigatorGroup group = (UidiagramNavigatorGroup) element;
			return group.getGroupName();
		}

		if (element instanceof UidiagramNavigatorItem) {
			UidiagramNavigatorItem navigatorItem = (UidiagramNavigatorItem) element;
			if (!isOwnView(navigatorItem.getView())) {
				return null;
			}
			return getText(navigatorItem.getView());
		}

		// Due to plugin.xml content will be called only for "own" views
		if (element instanceof IAdaptable) {
			View view = (View) ((IAdaptable) element).getAdapter(View.class);
			if (view != null && isOwnView(view)) {
				return getText(view);
			}
		}

		return super.getText(element);
	}

	/**
	* @generated
	*/
	public String getText(View view) {
		if (view.getElement() != null && view.getElement().eIsProxy()) {
			return getUnresolvedDomainElementProxyText(view);
		}
		switch (UidiagramVisualIDRegistry.getVisualID(view)) {
		case UIDiagramEditPart.VISUAL_ID:
			return getUIDiagram_1000Text(view);
		case UserInterfaceEditPart.VISUAL_ID:
			return getUserInterface_2001Text(view);
		case GroupEditPart.VISUAL_ID:
			return getGroup_3001Text(view);
		case Group2EditPart.VISUAL_ID:
			return getGroup_3002Text(view);
		case GroupColumnEditPart.VISUAL_ID:
			return getGroupColumn_3003Text(view);
		case Group3EditPart.VISUAL_ID:
			return getGroup_3004Text(view);
		case GroupRowEditPart.VISUAL_ID:
			return getGroupRow_3005Text(view);
		case Group4EditPart.VISUAL_ID:
			return getGroup_3006Text(view);
		case AppbarEditPart.VISUAL_ID:
			return getAppbar_3007Text(view);
		case TabbarEditPart.VISUAL_ID:
			return getTabbar_3008Text(view);
		case Button3EditPart.VISUAL_ID:
			return getButton_3009Text(view);
		case Label3EditPart.VISUAL_ID:
			return getLabel_3010Text(view);
		case CheckboxEditPart.VISUAL_ID:
			return getCheckbox_3011Text(view);
		case InputEditPart.VISUAL_ID:
			return getInput_3012Text(view);
		case ListViewEditPart.VISUAL_ID:
			return getListView_3013Text(view);
		case RadioButtonEditPart.VISUAL_ID:
			return getRadioButton_3014Text(view);
		case ComboBoxEditPart.VISUAL_ID:
			return getComboBox_3015Text(view);
		case DatePickerEditPart.VISUAL_ID:
			return getDatePicker_3016Text(view);
		case SwitchEditPart.VISUAL_ID:
			return getSwitch_3017Text(view);
		case TableEditPart.VISUAL_ID:
			return getTable_3018Text(view);
		case ColumnEditPart.VISUAL_ID:
			return getColumn_3019Text(view);
		case GroupColumn4EditPart.VISUAL_ID:
			return getGroupColumn_3020Text(view);
		case GroupColumn3EditPart.VISUAL_ID:
			return getGroupColumn_3021Text(view);
		case GroupRow2EditPart.VISUAL_ID:
			return getGroupRow_3022Text(view);
		case GroupRow4EditPart.VISUAL_ID:
			return getGroupRow_3023Text(view);
		case Appbar3EditPart.VISUAL_ID:
			return getAppbar_3024Text(view);
		case Tabbar3EditPart.VISUAL_ID:
			return getTabbar_3025Text(view);
		case Button5EditPart.VISUAL_ID:
			return getButton_3026Text(view);
		case Label5EditPart.VISUAL_ID:
			return getLabel_3027Text(view);
		case Checkbox3EditPart.VISUAL_ID:
			return getCheckbox_3028Text(view);
		case Input3EditPart.VISUAL_ID:
			return getInput_3029Text(view);
		case ListView3EditPart.VISUAL_ID:
			return getListView_3030Text(view);
		case RadioButton3EditPart.VISUAL_ID:
			return getRadioButton_3031Text(view);
		case ComboBox3EditPart.VISUAL_ID:
			return getComboBox_3032Text(view);
		case DatePicker3EditPart.VISUAL_ID:
			return getDatePicker_3033Text(view);
		case Switch3EditPart.VISUAL_ID:
			return getSwitch_3034Text(view);
		case Table3EditPart.VISUAL_ID:
			return getTable_3035Text(view);
		case Appbar2EditPart.VISUAL_ID:
			return getAppbar_3036Text(view);
		case Tabbar2EditPart.VISUAL_ID:
			return getTabbar_3037Text(view);
		case Button4EditPart.VISUAL_ID:
			return getButton_3038Text(view);
		case Label4EditPart.VISUAL_ID:
			return getLabel_3039Text(view);
		case Checkbox2EditPart.VISUAL_ID:
			return getCheckbox_3040Text(view);
		case Input2EditPart.VISUAL_ID:
			return getInput_3041Text(view);
		case ListView2EditPart.VISUAL_ID:
			return getListView_3042Text(view);
		case RadioButton4EditPart.VISUAL_ID:
			return getRadioButton_3043Text(view);
		case ComboBox4EditPart.VISUAL_ID:
			return getComboBox_3044Text(view);
		case DatePicker4EditPart.VISUAL_ID:
			return getDatePicker_3045Text(view);
		case Switch4EditPart.VISUAL_ID:
			return getSwitch_3046Text(view);
		case Table4EditPart.VISUAL_ID:
			return getTable_3047Text(view);
		case GroupColumn5EditPart.VISUAL_ID:
			return getGroupColumn_3048Text(view);
		case GroupRow5EditPart.VISUAL_ID:
			return getGroupRow_3049Text(view);
		case Appbar5EditPart.VISUAL_ID:
			return getAppbar_3050Text(view);
		case Tabbar5EditPart.VISUAL_ID:
			return getTabbar_3051Text(view);
		case Button7EditPart.VISUAL_ID:
			return getButton_3052Text(view);
		case Label7EditPart.VISUAL_ID:
			return getLabel_3053Text(view);
		case Checkbox5EditPart.VISUAL_ID:
			return getCheckbox_3054Text(view);
		case Input5EditPart.VISUAL_ID:
			return getInput_3055Text(view);
		case ListView5EditPart.VISUAL_ID:
			return getListView_3056Text(view);
		case RadioButton5EditPart.VISUAL_ID:
			return getRadioButton_3057Text(view);
		case ComboBox5EditPart.VISUAL_ID:
			return getComboBox_3058Text(view);
		case DatePicker5EditPart.VISUAL_ID:
			return getDatePicker_3059Text(view);
		case Switch5EditPart.VISUAL_ID:
			return getSwitch_3060Text(view);
		case Table5EditPart.VISUAL_ID:
			return getTable_3061Text(view);
		case ButtonEditPart.VISUAL_ID:
			return getButton_3062Text(view);
		case Button2EditPart.VISUAL_ID:
			return getButton_3063Text(view);
		case LabelEditPart.VISUAL_ID:
			return getLabel_3064Text(view);
		case Label2EditPart.VISUAL_ID:
			return getLabel_3065Text(view);
		case Group5EditPart.VISUAL_ID:
			return getGroup_3066Text(view);
		case GroupColumn2EditPart.VISUAL_ID:
			return getGroupColumn_3067Text(view);
		case GroupRow3EditPart.VISUAL_ID:
			return getGroupRow_3068Text(view);
		case Appbar4EditPart.VISUAL_ID:
			return getAppbar_3069Text(view);
		case Tabbar4EditPart.VISUAL_ID:
			return getTabbar_3070Text(view);
		case Button6EditPart.VISUAL_ID:
			return getButton_3071Text(view);
		case Label6EditPart.VISUAL_ID:
			return getLabel_3072Text(view);
		case Checkbox4EditPart.VISUAL_ID:
			return getCheckbox_3073Text(view);
		case Input4EditPart.VISUAL_ID:
			return getInput_3074Text(view);
		case ListView4EditPart.VISUAL_ID:
			return getListView_3075Text(view);
		case RadioButton2EditPart.VISUAL_ID:
			return getRadioButton_3076Text(view);
		case ComboBox2EditPart.VISUAL_ID:
			return getComboBox_3077Text(view);
		case DatePicker2EditPart.VISUAL_ID:
			return getDatePicker_3078Text(view);
		case Switch2EditPart.VISUAL_ID:
			return getSwitch_3079Text(view);
		case Table2EditPart.VISUAL_ID:
			return getTable_3080Text(view);
		}
		return getUnknownElementText(view);
	}

	/**
	* @generated
	*/
	private String getUIDiagram_1000Text(View view) {
		UIDiagram domainModelElement = (UIDiagram) view.getElement();
		if (domainModelElement != null) {
			return domainModelElement.getName();
		} else {
			UidiagramDiagramEditorPlugin.getInstance().logError("No domain element for view with visualID = " + 1000); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getUserInterface_2001Text(View view) {
		IParser parser = UidiagramParserProvider.getParser(UidiagramElementTypes.UserInterface_2001,
				view.getElement() != null ? view.getElement() : view,
				UidiagramVisualIDRegistry.getType(UserInterfaceNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			UidiagramDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5062); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getGroup_3001Text(View view) {
		IParser parser = UidiagramParserProvider.getParser(UidiagramElementTypes.Group_3001,
				view.getElement() != null ? view.getElement() : view,
				UidiagramVisualIDRegistry.getType(GroupNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			UidiagramDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5047); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getGroup_3002Text(View view) {
		IParser parser = UidiagramParserProvider.getParser(UidiagramElementTypes.Group_3002,
				view.getElement() != null ? view.getElement() : view,
				UidiagramVisualIDRegistry.getType(GroupName2EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			UidiagramDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5046); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getGroupColumn_3003Text(View view) {
		IParser parser = UidiagramParserProvider.getParser(UidiagramElementTypes.GroupColumn_3003,
				view.getElement() != null ? view.getElement() : view,
				UidiagramVisualIDRegistry.getType(GroupColumnNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			UidiagramDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5045); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getGroup_3004Text(View view) {
		IParser parser = UidiagramParserProvider.getParser(UidiagramElementTypes.Group_3004,
				view.getElement() != null ? view.getElement() : view,
				UidiagramVisualIDRegistry.getType(GroupName3EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			UidiagramDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5044); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getGroupRow_3005Text(View view) {
		IParser parser = UidiagramParserProvider.getParser(UidiagramElementTypes.GroupRow_3005,
				view.getElement() != null ? view.getElement() : view,
				UidiagramVisualIDRegistry.getType(GroupRowNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			UidiagramDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5043); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getGroup_3006Text(View view) {
		IParser parser = UidiagramParserProvider.getParser(UidiagramElementTypes.Group_3006,
				view.getElement() != null ? view.getElement() : view,
				UidiagramVisualIDRegistry.getType(GroupName4EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			UidiagramDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5014); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getAppbar_3007Text(View view) {
		IParser parser = UidiagramParserProvider.getParser(UidiagramElementTypes.Appbar_3007,
				view.getElement() != null ? view.getElement() : view,
				UidiagramVisualIDRegistry.getType(AppbarNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			UidiagramDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5001); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getTabbar_3008Text(View view) {
		IParser parser = UidiagramParserProvider.getParser(UidiagramElementTypes.Tabbar_3008,
				view.getElement() != null ? view.getElement() : view,
				UidiagramVisualIDRegistry.getType(TabbarNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			UidiagramDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5002); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getButton_3009Text(View view) {
		IParser parser = UidiagramParserProvider.getParser(UidiagramElementTypes.Button_3009,
				view.getElement() != null ? view.getElement() : view,
				UidiagramVisualIDRegistry.getType(ButtonName3EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			UidiagramDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5003); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getLabel_3010Text(View view) {
		IParser parser = UidiagramParserProvider.getParser(UidiagramElementTypes.Label_3010,
				view.getElement() != null ? view.getElement() : view,
				UidiagramVisualIDRegistry.getType(LabelName3EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			UidiagramDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5004); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getCheckbox_3011Text(View view) {
		IParser parser = UidiagramParserProvider.getParser(UidiagramElementTypes.Checkbox_3011,
				view.getElement() != null ? view.getElement() : view,
				UidiagramVisualIDRegistry.getType(CheckboxNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			UidiagramDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5005); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getInput_3012Text(View view) {
		IParser parser = UidiagramParserProvider.getParser(UidiagramElementTypes.Input_3012,
				view.getElement() != null ? view.getElement() : view,
				UidiagramVisualIDRegistry.getType(InputNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			UidiagramDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5006); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getListView_3013Text(View view) {
		IParser parser = UidiagramParserProvider.getParser(UidiagramElementTypes.ListView_3013,
				view.getElement() != null ? view.getElement() : view,
				UidiagramVisualIDRegistry.getType(ListViewNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			UidiagramDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5007); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getRadioButton_3014Text(View view) {
		IParser parser = UidiagramParserProvider.getParser(UidiagramElementTypes.RadioButton_3014,
				view.getElement() != null ? view.getElement() : view,
				UidiagramVisualIDRegistry.getType(RadioButtonNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			UidiagramDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5008); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getComboBox_3015Text(View view) {
		IParser parser = UidiagramParserProvider.getParser(UidiagramElementTypes.ComboBox_3015,
				view.getElement() != null ? view.getElement() : view,
				UidiagramVisualIDRegistry.getType(ComboBoxNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			UidiagramDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5009); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getDatePicker_3016Text(View view) {
		IParser parser = UidiagramParserProvider.getParser(UidiagramElementTypes.DatePicker_3016,
				view.getElement() != null ? view.getElement() : view,
				UidiagramVisualIDRegistry.getType(DatePickerNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			UidiagramDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5010); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getSwitch_3017Text(View view) {
		IParser parser = UidiagramParserProvider.getParser(UidiagramElementTypes.Switch_3017,
				view.getElement() != null ? view.getElement() : view,
				UidiagramVisualIDRegistry.getType(SwitchNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			UidiagramDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5011); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getTable_3018Text(View view) {
		IParser parser = UidiagramParserProvider.getParser(UidiagramElementTypes.Table_3018,
				view.getElement() != null ? view.getElement() : view,
				UidiagramVisualIDRegistry.getType(TableNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			UidiagramDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5013); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getColumn_3019Text(View view) {
		IParser parser = UidiagramParserProvider.getParser(UidiagramElementTypes.Column_3019,
				view.getElement() != null ? view.getElement() : view,
				UidiagramVisualIDRegistry.getType(ColumnNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			UidiagramDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5012); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getGroupColumn_3020Text(View view) {
		IParser parser = UidiagramParserProvider.getParser(UidiagramElementTypes.GroupColumn_3020,
				view.getElement() != null ? view.getElement() : view,
				UidiagramVisualIDRegistry.getType(GroupColumnName4EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			UidiagramDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5042); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getGroupColumn_3021Text(View view) {
		IParser parser = UidiagramParserProvider.getParser(UidiagramElementTypes.GroupColumn_3021,
				view.getElement() != null ? view.getElement() : view,
				UidiagramVisualIDRegistry.getType(GroupColumnName3EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			UidiagramDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5041); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getGroupRow_3022Text(View view) {
		IParser parser = UidiagramParserProvider.getParser(UidiagramElementTypes.GroupRow_3022,
				view.getElement() != null ? view.getElement() : view,
				UidiagramVisualIDRegistry.getType(GroupRowName2EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			UidiagramDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5028); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getGroupRow_3023Text(View view) {
		IParser parser = UidiagramParserProvider.getParser(UidiagramElementTypes.GroupRow_3023,
				view.getElement() != null ? view.getElement() : view,
				UidiagramVisualIDRegistry.getType(GroupRowName4EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			UidiagramDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5027); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getAppbar_3024Text(View view) {
		IParser parser = UidiagramParserProvider.getParser(UidiagramElementTypes.Appbar_3024,
				view.getElement() != null ? view.getElement() : view,
				UidiagramVisualIDRegistry.getType(AppbarName3EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			UidiagramDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5015); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getTabbar_3025Text(View view) {
		IParser parser = UidiagramParserProvider.getParser(UidiagramElementTypes.Tabbar_3025,
				view.getElement() != null ? view.getElement() : view,
				UidiagramVisualIDRegistry.getType(TabbarName3EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			UidiagramDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5016); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getButton_3026Text(View view) {
		IParser parser = UidiagramParserProvider.getParser(UidiagramElementTypes.Button_3026,
				view.getElement() != null ? view.getElement() : view,
				UidiagramVisualIDRegistry.getType(ButtonName5EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			UidiagramDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5017); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getLabel_3027Text(View view) {
		IParser parser = UidiagramParserProvider.getParser(UidiagramElementTypes.Label_3027,
				view.getElement() != null ? view.getElement() : view,
				UidiagramVisualIDRegistry.getType(LabelName5EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			UidiagramDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5018); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getCheckbox_3028Text(View view) {
		IParser parser = UidiagramParserProvider.getParser(UidiagramElementTypes.Checkbox_3028,
				view.getElement() != null ? view.getElement() : view,
				UidiagramVisualIDRegistry.getType(CheckboxName3EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			UidiagramDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5019); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getInput_3029Text(View view) {
		IParser parser = UidiagramParserProvider.getParser(UidiagramElementTypes.Input_3029,
				view.getElement() != null ? view.getElement() : view,
				UidiagramVisualIDRegistry.getType(InputName3EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			UidiagramDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5020); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getListView_3030Text(View view) {
		IParser parser = UidiagramParserProvider.getParser(UidiagramElementTypes.ListView_3030,
				view.getElement() != null ? view.getElement() : view,
				UidiagramVisualIDRegistry.getType(ListViewName3EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			UidiagramDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5021); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getRadioButton_3031Text(View view) {
		IParser parser = UidiagramParserProvider.getParser(UidiagramElementTypes.RadioButton_3031,
				view.getElement() != null ? view.getElement() : view,
				UidiagramVisualIDRegistry.getType(RadioButtonName3EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			UidiagramDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5022); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getComboBox_3032Text(View view) {
		IParser parser = UidiagramParserProvider.getParser(UidiagramElementTypes.ComboBox_3032,
				view.getElement() != null ? view.getElement() : view,
				UidiagramVisualIDRegistry.getType(ComboBoxName3EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			UidiagramDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5023); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getDatePicker_3033Text(View view) {
		IParser parser = UidiagramParserProvider.getParser(UidiagramElementTypes.DatePicker_3033,
				view.getElement() != null ? view.getElement() : view,
				UidiagramVisualIDRegistry.getType(DatePickerName3EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			UidiagramDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5024); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getSwitch_3034Text(View view) {
		IParser parser = UidiagramParserProvider.getParser(UidiagramElementTypes.Switch_3034,
				view.getElement() != null ? view.getElement() : view,
				UidiagramVisualIDRegistry.getType(SwitchName3EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			UidiagramDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5025); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getTable_3035Text(View view) {
		IParser parser = UidiagramParserProvider.getParser(UidiagramElementTypes.Table_3035,
				view.getElement() != null ? view.getElement() : view,
				UidiagramVisualIDRegistry.getType(TableName3EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			UidiagramDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5026); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getAppbar_3036Text(View view) {
		IParser parser = UidiagramParserProvider.getParser(UidiagramElementTypes.Appbar_3036,
				view.getElement() != null ? view.getElement() : view,
				UidiagramVisualIDRegistry.getType(AppbarName2EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			UidiagramDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5029); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getTabbar_3037Text(View view) {
		IParser parser = UidiagramParserProvider.getParser(UidiagramElementTypes.Tabbar_3037,
				view.getElement() != null ? view.getElement() : view,
				UidiagramVisualIDRegistry.getType(TabbarName2EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			UidiagramDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5030); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getButton_3038Text(View view) {
		IParser parser = UidiagramParserProvider.getParser(UidiagramElementTypes.Button_3038,
				view.getElement() != null ? view.getElement() : view,
				UidiagramVisualIDRegistry.getType(ButtonName4EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			UidiagramDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5031); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getLabel_3039Text(View view) {
		IParser parser = UidiagramParserProvider.getParser(UidiagramElementTypes.Label_3039,
				view.getElement() != null ? view.getElement() : view,
				UidiagramVisualIDRegistry.getType(LabelName4EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			UidiagramDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5032); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getCheckbox_3040Text(View view) {
		IParser parser = UidiagramParserProvider.getParser(UidiagramElementTypes.Checkbox_3040,
				view.getElement() != null ? view.getElement() : view,
				UidiagramVisualIDRegistry.getType(CheckboxName2EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			UidiagramDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5033); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getInput_3041Text(View view) {
		IParser parser = UidiagramParserProvider.getParser(UidiagramElementTypes.Input_3041,
				view.getElement() != null ? view.getElement() : view,
				UidiagramVisualIDRegistry.getType(InputName2EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			UidiagramDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5034); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getListView_3042Text(View view) {
		IParser parser = UidiagramParserProvider.getParser(UidiagramElementTypes.ListView_3042,
				view.getElement() != null ? view.getElement() : view,
				UidiagramVisualIDRegistry.getType(ListViewName2EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			UidiagramDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5035); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getRadioButton_3043Text(View view) {
		IParser parser = UidiagramParserProvider.getParser(UidiagramElementTypes.RadioButton_3043,
				view.getElement() != null ? view.getElement() : view,
				UidiagramVisualIDRegistry.getType(RadioButtonName4EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			UidiagramDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5036); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getComboBox_3044Text(View view) {
		IParser parser = UidiagramParserProvider.getParser(UidiagramElementTypes.ComboBox_3044,
				view.getElement() != null ? view.getElement() : view,
				UidiagramVisualIDRegistry.getType(ComboBoxName4EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			UidiagramDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5037); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getDatePicker_3045Text(View view) {
		IParser parser = UidiagramParserProvider.getParser(UidiagramElementTypes.DatePicker_3045,
				view.getElement() != null ? view.getElement() : view,
				UidiagramVisualIDRegistry.getType(DatePickerName4EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			UidiagramDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5038); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getSwitch_3046Text(View view) {
		IParser parser = UidiagramParserProvider.getParser(UidiagramElementTypes.Switch_3046,
				view.getElement() != null ? view.getElement() : view,
				UidiagramVisualIDRegistry.getType(SwitchName4EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			UidiagramDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5039); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getTable_3047Text(View view) {
		IParser parser = UidiagramParserProvider.getParser(UidiagramElementTypes.Table_3047,
				view.getElement() != null ? view.getElement() : view,
				UidiagramVisualIDRegistry.getType(TableName4EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			UidiagramDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5040); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getGroupColumn_3048Text(View view) {
		IParser parser = UidiagramParserProvider.getParser(UidiagramElementTypes.GroupColumn_3048,
				view.getElement() != null ? view.getElement() : view,
				UidiagramVisualIDRegistry.getType(GroupColumnName5EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			UidiagramDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5048); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getGroupRow_3049Text(View view) {
		IParser parser = UidiagramParserProvider.getParser(UidiagramElementTypes.GroupRow_3049,
				view.getElement() != null ? view.getElement() : view,
				UidiagramVisualIDRegistry.getType(GroupRowName5EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			UidiagramDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5049); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getAppbar_3050Text(View view) {
		IParser parser = UidiagramParserProvider.getParser(UidiagramElementTypes.Appbar_3050,
				view.getElement() != null ? view.getElement() : view,
				UidiagramVisualIDRegistry.getType(AppbarName5EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			UidiagramDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5050); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getTabbar_3051Text(View view) {
		IParser parser = UidiagramParserProvider.getParser(UidiagramElementTypes.Tabbar_3051,
				view.getElement() != null ? view.getElement() : view,
				UidiagramVisualIDRegistry.getType(TabbarName5EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			UidiagramDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5051); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getButton_3052Text(View view) {
		IParser parser = UidiagramParserProvider.getParser(UidiagramElementTypes.Button_3052,
				view.getElement() != null ? view.getElement() : view,
				UidiagramVisualIDRegistry.getType(ButtonName7EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			UidiagramDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5052); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getLabel_3053Text(View view) {
		IParser parser = UidiagramParserProvider.getParser(UidiagramElementTypes.Label_3053,
				view.getElement() != null ? view.getElement() : view,
				UidiagramVisualIDRegistry.getType(LabelName7EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			UidiagramDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5053); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getCheckbox_3054Text(View view) {
		IParser parser = UidiagramParserProvider.getParser(UidiagramElementTypes.Checkbox_3054,
				view.getElement() != null ? view.getElement() : view,
				UidiagramVisualIDRegistry.getType(CheckboxName5EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			UidiagramDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5054); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getInput_3055Text(View view) {
		IParser parser = UidiagramParserProvider.getParser(UidiagramElementTypes.Input_3055,
				view.getElement() != null ? view.getElement() : view,
				UidiagramVisualIDRegistry.getType(InputName5EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			UidiagramDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5055); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getListView_3056Text(View view) {
		IParser parser = UidiagramParserProvider.getParser(UidiagramElementTypes.ListView_3056,
				view.getElement() != null ? view.getElement() : view,
				UidiagramVisualIDRegistry.getType(ListViewName5EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			UidiagramDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5056); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getRadioButton_3057Text(View view) {
		IParser parser = UidiagramParserProvider.getParser(UidiagramElementTypes.RadioButton_3057,
				view.getElement() != null ? view.getElement() : view,
				UidiagramVisualIDRegistry.getType(RadioButtonName5EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			UidiagramDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5057); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getComboBox_3058Text(View view) {
		IParser parser = UidiagramParserProvider.getParser(UidiagramElementTypes.ComboBox_3058,
				view.getElement() != null ? view.getElement() : view,
				UidiagramVisualIDRegistry.getType(ComboBoxName5EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			UidiagramDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5058); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getDatePicker_3059Text(View view) {
		IParser parser = UidiagramParserProvider.getParser(UidiagramElementTypes.DatePicker_3059,
				view.getElement() != null ? view.getElement() : view,
				UidiagramVisualIDRegistry.getType(DatePickerName5EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			UidiagramDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5059); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getSwitch_3060Text(View view) {
		IParser parser = UidiagramParserProvider.getParser(UidiagramElementTypes.Switch_3060,
				view.getElement() != null ? view.getElement() : view,
				UidiagramVisualIDRegistry.getType(SwitchName5EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			UidiagramDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5060); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getTable_3061Text(View view) {
		IParser parser = UidiagramParserProvider.getParser(UidiagramElementTypes.Table_3061,
				view.getElement() != null ? view.getElement() : view,
				UidiagramVisualIDRegistry.getType(TableName5EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			UidiagramDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5061); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getButton_3062Text(View view) {
		IParser parser = UidiagramParserProvider.getParser(UidiagramElementTypes.Button_3062,
				view.getElement() != null ? view.getElement() : view,
				UidiagramVisualIDRegistry.getType(ButtonNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			UidiagramDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5063); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getButton_3063Text(View view) {
		IParser parser = UidiagramParserProvider.getParser(UidiagramElementTypes.Button_3063,
				view.getElement() != null ? view.getElement() : view,
				UidiagramVisualIDRegistry.getType(ButtonName2EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			UidiagramDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5064); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getLabel_3064Text(View view) {
		IParser parser = UidiagramParserProvider.getParser(UidiagramElementTypes.Label_3064,
				view.getElement() != null ? view.getElement() : view,
				UidiagramVisualIDRegistry.getType(LabelNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			UidiagramDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5065); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getLabel_3065Text(View view) {
		IParser parser = UidiagramParserProvider.getParser(UidiagramElementTypes.Label_3065,
				view.getElement() != null ? view.getElement() : view,
				UidiagramVisualIDRegistry.getType(LabelName2EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			UidiagramDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5066); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getGroup_3066Text(View view) {
		IParser parser = UidiagramParserProvider.getParser(UidiagramElementTypes.Group_3066,
				view.getElement() != null ? view.getElement() : view,
				UidiagramVisualIDRegistry.getType(GroupName5EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			UidiagramDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5067); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getGroupColumn_3067Text(View view) {
		IParser parser = UidiagramParserProvider.getParser(UidiagramElementTypes.GroupColumn_3067,
				view.getElement() != null ? view.getElement() : view,
				UidiagramVisualIDRegistry.getType(GroupColumnName2EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			UidiagramDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5081); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getGroupRow_3068Text(View view) {
		IParser parser = UidiagramParserProvider.getParser(UidiagramElementTypes.GroupRow_3068,
				view.getElement() != null ? view.getElement() : view,
				UidiagramVisualIDRegistry.getType(GroupRowName3EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			UidiagramDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5080); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getAppbar_3069Text(View view) {
		IParser parser = UidiagramParserProvider.getParser(UidiagramElementTypes.Appbar_3069,
				view.getElement() != null ? view.getElement() : view,
				UidiagramVisualIDRegistry.getType(AppbarName4EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			UidiagramDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5068); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getTabbar_3070Text(View view) {
		IParser parser = UidiagramParserProvider.getParser(UidiagramElementTypes.Tabbar_3070,
				view.getElement() != null ? view.getElement() : view,
				UidiagramVisualIDRegistry.getType(TabbarName4EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			UidiagramDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5069); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getButton_3071Text(View view) {
		IParser parser = UidiagramParserProvider.getParser(UidiagramElementTypes.Button_3071,
				view.getElement() != null ? view.getElement() : view,
				UidiagramVisualIDRegistry.getType(ButtonName6EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			UidiagramDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5070); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getLabel_3072Text(View view) {
		IParser parser = UidiagramParserProvider.getParser(UidiagramElementTypes.Label_3072,
				view.getElement() != null ? view.getElement() : view,
				UidiagramVisualIDRegistry.getType(LabelName6EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			UidiagramDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5071); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getCheckbox_3073Text(View view) {
		IParser parser = UidiagramParserProvider.getParser(UidiagramElementTypes.Checkbox_3073,
				view.getElement() != null ? view.getElement() : view,
				UidiagramVisualIDRegistry.getType(CheckboxName4EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			UidiagramDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5072); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getInput_3074Text(View view) {
		IParser parser = UidiagramParserProvider.getParser(UidiagramElementTypes.Input_3074,
				view.getElement() != null ? view.getElement() : view,
				UidiagramVisualIDRegistry.getType(InputName4EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			UidiagramDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5073); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getListView_3075Text(View view) {
		IParser parser = UidiagramParserProvider.getParser(UidiagramElementTypes.ListView_3075,
				view.getElement() != null ? view.getElement() : view,
				UidiagramVisualIDRegistry.getType(ListViewName4EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			UidiagramDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5079); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getRadioButton_3076Text(View view) {
		IParser parser = UidiagramParserProvider.getParser(UidiagramElementTypes.RadioButton_3076,
				view.getElement() != null ? view.getElement() : view,
				UidiagramVisualIDRegistry.getType(RadioButtonName2EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			UidiagramDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5074); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getComboBox_3077Text(View view) {
		IParser parser = UidiagramParserProvider.getParser(UidiagramElementTypes.ComboBox_3077,
				view.getElement() != null ? view.getElement() : view,
				UidiagramVisualIDRegistry.getType(ComboBoxName2EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			UidiagramDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5075); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getDatePicker_3078Text(View view) {
		IParser parser = UidiagramParserProvider.getParser(UidiagramElementTypes.DatePicker_3078,
				view.getElement() != null ? view.getElement() : view,
				UidiagramVisualIDRegistry.getType(DatePickerName2EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			UidiagramDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5076); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getSwitch_3079Text(View view) {
		IParser parser = UidiagramParserProvider.getParser(UidiagramElementTypes.Switch_3079,
				view.getElement() != null ? view.getElement() : view,
				UidiagramVisualIDRegistry.getType(SwitchName2EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			UidiagramDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5077); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getTable_3080Text(View view) {
		IParser parser = UidiagramParserProvider.getParser(UidiagramElementTypes.Table_3080,
				view.getElement() != null ? view.getElement() : view,
				UidiagramVisualIDRegistry.getType(TableName2EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			UidiagramDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5078); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getUnknownElementText(View view) {
		return "<UnknownElement Visual_ID = " + view.getType() + ">"; //$NON-NLS-1$  //$NON-NLS-2$
	}

	/**
	* @generated
	*/
	private String getUnresolvedDomainElementProxyText(View view) {
		return "<Unresolved domain element Visual_ID = " + view.getType() + ">"; //$NON-NLS-1$  //$NON-NLS-2$
	}

	/**
	* @generated
	*/
	public void init(ICommonContentExtensionSite aConfig) {
	}

	/**
	* @generated
	*/
	public void restoreState(IMemento aMemento) {
	}

	/**
	* @generated
	*/
	public void saveState(IMemento aMemento) {
	}

	/**
	* @generated
	*/
	public String getDescription(Object anElement) {
		return null;
	}

	/**
	* @generated
	*/
	private boolean isOwnView(View view) {
		return UIDiagramEditPart.MODEL_ID.equals(UidiagramVisualIDRegistry.getModelID(view));
	}

}
