/*
 * 
 */
package uidiagram.diagram.edit.parts;

import org.eclipse.gef.EditPart;
import org.eclipse.gef.EditPartFactory;
import org.eclipse.gef.tools.CellEditorLocator;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ITextAwareEditPart;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.gmf.tooling.runtime.directedit.locator.CellEditorLocatorAccess;

import uidiagram.diagram.part.UidiagramVisualIDRegistry;

/**
 * @generated
 */
public class UidiagramEditPartFactory implements EditPartFactory {

	/**
	* @generated
	*/
	public EditPart createEditPart(EditPart context, Object model) {
		if (model instanceof View) {
			View view = (View) model;
			switch (UidiagramVisualIDRegistry.getVisualID(view)) {

			case UIDiagramEditPart.VISUAL_ID:
				return new UIDiagramEditPart(view);

			case UserInterfaceEditPart.VISUAL_ID:
				return new UserInterfaceEditPart(view);

			case UserInterfaceNameEditPart.VISUAL_ID:
				return new UserInterfaceNameEditPart(view);

			case GroupEditPart.VISUAL_ID:
				return new GroupEditPart(view);

			case GroupNameEditPart.VISUAL_ID:
				return new GroupNameEditPart(view);

			case Group2EditPart.VISUAL_ID:
				return new Group2EditPart(view);

			case GroupName2EditPart.VISUAL_ID:
				return new GroupName2EditPart(view);

			case GroupColumnEditPart.VISUAL_ID:
				return new GroupColumnEditPart(view);

			case GroupColumnNameEditPart.VISUAL_ID:
				return new GroupColumnNameEditPart(view);

			case Group3EditPart.VISUAL_ID:
				return new Group3EditPart(view);

			case GroupName3EditPart.VISUAL_ID:
				return new GroupName3EditPart(view);

			case GroupRowEditPart.VISUAL_ID:
				return new GroupRowEditPart(view);

			case GroupRowNameEditPart.VISUAL_ID:
				return new GroupRowNameEditPart(view);

			case Group4EditPart.VISUAL_ID:
				return new Group4EditPart(view);

			case GroupName4EditPart.VISUAL_ID:
				return new GroupName4EditPart(view);

			case AppbarEditPart.VISUAL_ID:
				return new AppbarEditPart(view);

			case AppbarNameEditPart.VISUAL_ID:
				return new AppbarNameEditPart(view);

			case TabbarEditPart.VISUAL_ID:
				return new TabbarEditPart(view);

			case TabbarNameEditPart.VISUAL_ID:
				return new TabbarNameEditPart(view);

			case ButtonEditPart.VISUAL_ID:
				return new ButtonEditPart(view);

			case ButtonNameEditPart.VISUAL_ID:
				return new ButtonNameEditPart(view);

			case LabelEditPart.VISUAL_ID:
				return new LabelEditPart(view);

			case LabelNameEditPart.VISUAL_ID:
				return new LabelNameEditPart(view);

			case CheckboxEditPart.VISUAL_ID:
				return new CheckboxEditPart(view);

			case CheckboxNameEditPart.VISUAL_ID:
				return new CheckboxNameEditPart(view);

			case InputEditPart.VISUAL_ID:
				return new InputEditPart(view);

			case InputNameEditPart.VISUAL_ID:
				return new InputNameEditPart(view);

			case ListViewEditPart.VISUAL_ID:
				return new ListViewEditPart(view);

			case ListViewNameEditPart.VISUAL_ID:
				return new ListViewNameEditPart(view);

			case RadioButtonEditPart.VISUAL_ID:
				return new RadioButtonEditPart(view);

			case RadioButtonNameEditPart.VISUAL_ID:
				return new RadioButtonNameEditPart(view);

			case ComboBoxEditPart.VISUAL_ID:
				return new ComboBoxEditPart(view);

			case ComboBoxNameEditPart.VISUAL_ID:
				return new ComboBoxNameEditPart(view);

			case DatePickerEditPart.VISUAL_ID:
				return new DatePickerEditPart(view);

			case DatePickerNameEditPart.VISUAL_ID:
				return new DatePickerNameEditPart(view);

			case SwitchEditPart.VISUAL_ID:
				return new SwitchEditPart(view);

			case SwitchNameEditPart.VISUAL_ID:
				return new SwitchNameEditPart(view);

			case TableEditPart.VISUAL_ID:
				return new TableEditPart(view);

			case TableNameEditPart.VISUAL_ID:
				return new TableNameEditPart(view);

			case ColumnEditPart.VISUAL_ID:
				return new ColumnEditPart(view);

			case ColumnNameEditPart.VISUAL_ID:
				return new ColumnNameEditPart(view);

			case GroupColumn2EditPart.VISUAL_ID:
				return new GroupColumn2EditPart(view);

			case GroupColumnName2EditPart.VISUAL_ID:
				return new GroupColumnName2EditPart(view);

			case GroupColumn3EditPart.VISUAL_ID:
				return new GroupColumn3EditPart(view);

			case GroupColumnName3EditPart.VISUAL_ID:
				return new GroupColumnName3EditPart(view);

			case GroupRow2EditPart.VISUAL_ID:
				return new GroupRow2EditPart(view);

			case GroupRowName2EditPart.VISUAL_ID:
				return new GroupRowName2EditPart(view);

			case GroupRow3EditPart.VISUAL_ID:
				return new GroupRow3EditPart(view);

			case GroupRowName3EditPart.VISUAL_ID:
				return new GroupRowName3EditPart(view);

			case Appbar2EditPart.VISUAL_ID:
				return new Appbar2EditPart(view);

			case AppbarName2EditPart.VISUAL_ID:
				return new AppbarName2EditPart(view);

			case Tabbar2EditPart.VISUAL_ID:
				return new Tabbar2EditPart(view);

			case TabbarName2EditPart.VISUAL_ID:
				return new TabbarName2EditPart(view);

			case Button2EditPart.VISUAL_ID:
				return new Button2EditPart(view);

			case ButtonName2EditPart.VISUAL_ID:
				return new ButtonName2EditPart(view);

			case Label2EditPart.VISUAL_ID:
				return new Label2EditPart(view);

			case LabelName2EditPart.VISUAL_ID:
				return new LabelName2EditPart(view);

			case Checkbox2EditPart.VISUAL_ID:
				return new Checkbox2EditPart(view);

			case CheckboxName2EditPart.VISUAL_ID:
				return new CheckboxName2EditPart(view);

			case Input2EditPart.VISUAL_ID:
				return new Input2EditPart(view);

			case InputName2EditPart.VISUAL_ID:
				return new InputName2EditPart(view);

			case ListView2EditPart.VISUAL_ID:
				return new ListView2EditPart(view);

			case ListViewName2EditPart.VISUAL_ID:
				return new ListViewName2EditPart(view);

			case RadioButton2EditPart.VISUAL_ID:
				return new RadioButton2EditPart(view);

			case RadioButtonName2EditPart.VISUAL_ID:
				return new RadioButtonName2EditPart(view);

			case ComboBox2EditPart.VISUAL_ID:
				return new ComboBox2EditPart(view);

			case ComboBoxName2EditPart.VISUAL_ID:
				return new ComboBoxName2EditPart(view);

			case DatePicker2EditPart.VISUAL_ID:
				return new DatePicker2EditPart(view);

			case DatePickerName2EditPart.VISUAL_ID:
				return new DatePickerName2EditPart(view);

			case Switch2EditPart.VISUAL_ID:
				return new Switch2EditPart(view);

			case SwitchName2EditPart.VISUAL_ID:
				return new SwitchName2EditPart(view);

			case Table2EditPart.VISUAL_ID:
				return new Table2EditPart(view);

			case TableName2EditPart.VISUAL_ID:
				return new TableName2EditPart(view);

			case Appbar3EditPart.VISUAL_ID:
				return new Appbar3EditPart(view);

			case AppbarName3EditPart.VISUAL_ID:
				return new AppbarName3EditPart(view);

			case Tabbar3EditPart.VISUAL_ID:
				return new Tabbar3EditPart(view);

			case TabbarName3EditPart.VISUAL_ID:
				return new TabbarName3EditPart(view);

			case Button3EditPart.VISUAL_ID:
				return new Button3EditPart(view);

			case ButtonName3EditPart.VISUAL_ID:
				return new ButtonName3EditPart(view);

			case Label3EditPart.VISUAL_ID:
				return new Label3EditPart(view);

			case LabelName3EditPart.VISUAL_ID:
				return new LabelName3EditPart(view);

			case Checkbox3EditPart.VISUAL_ID:
				return new Checkbox3EditPart(view);

			case CheckboxName3EditPart.VISUAL_ID:
				return new CheckboxName3EditPart(view);

			case Input3EditPart.VISUAL_ID:
				return new Input3EditPart(view);

			case InputName3EditPart.VISUAL_ID:
				return new InputName3EditPart(view);

			case ListView3EditPart.VISUAL_ID:
				return new ListView3EditPart(view);

			case ListViewName3EditPart.VISUAL_ID:
				return new ListViewName3EditPart(view);

			case RadioButton3EditPart.VISUAL_ID:
				return new RadioButton3EditPart(view);

			case RadioButtonName3EditPart.VISUAL_ID:
				return new RadioButtonName3EditPart(view);

			case ComboBox3EditPart.VISUAL_ID:
				return new ComboBox3EditPart(view);

			case ComboBoxName3EditPart.VISUAL_ID:
				return new ComboBoxName3EditPart(view);

			case DatePicker3EditPart.VISUAL_ID:
				return new DatePicker3EditPart(view);

			case DatePickerName3EditPart.VISUAL_ID:
				return new DatePickerName3EditPart(view);

			case Switch3EditPart.VISUAL_ID:
				return new Switch3EditPart(view);

			case SwitchName3EditPart.VISUAL_ID:
				return new SwitchName3EditPart(view);

			case Table3EditPart.VISUAL_ID:
				return new Table3EditPart(view);

			case TableName3EditPart.VISUAL_ID:
				return new TableName3EditPart(view);

			case GroupColumn4EditPart.VISUAL_ID:
				return new GroupColumn4EditPart(view);

			case GroupColumnName4EditPart.VISUAL_ID:
				return new GroupColumnName4EditPart(view);

			case GroupRow4EditPart.VISUAL_ID:
				return new GroupRow4EditPart(view);

			case GroupRowName4EditPart.VISUAL_ID:
				return new GroupRowName4EditPart(view);

			case Appbar4EditPart.VISUAL_ID:
				return new Appbar4EditPart(view);

			case AppbarName4EditPart.VISUAL_ID:
				return new AppbarName4EditPart(view);

			case Tabbar4EditPart.VISUAL_ID:
				return new Tabbar4EditPart(view);

			case TabbarName4EditPart.VISUAL_ID:
				return new TabbarName4EditPart(view);

			case Button4EditPart.VISUAL_ID:
				return new Button4EditPart(view);

			case ButtonName4EditPart.VISUAL_ID:
				return new ButtonName4EditPart(view);

			case Label4EditPart.VISUAL_ID:
				return new Label4EditPart(view);

			case LabelName4EditPart.VISUAL_ID:
				return new LabelName4EditPart(view);

			case Checkbox4EditPart.VISUAL_ID:
				return new Checkbox4EditPart(view);

			case CheckboxName4EditPart.VISUAL_ID:
				return new CheckboxName4EditPart(view);

			case Input4EditPart.VISUAL_ID:
				return new Input4EditPart(view);

			case InputName4EditPart.VISUAL_ID:
				return new InputName4EditPart(view);

			case ListView4EditPart.VISUAL_ID:
				return new ListView4EditPart(view);

			case ListViewName4EditPart.VISUAL_ID:
				return new ListViewName4EditPart(view);

			case RadioButton4EditPart.VISUAL_ID:
				return new RadioButton4EditPart(view);

			case RadioButtonName4EditPart.VISUAL_ID:
				return new RadioButtonName4EditPart(view);

			case ComboBox4EditPart.VISUAL_ID:
				return new ComboBox4EditPart(view);

			case ComboBoxName4EditPart.VISUAL_ID:
				return new ComboBoxName4EditPart(view);

			case DatePicker4EditPart.VISUAL_ID:
				return new DatePicker4EditPart(view);

			case DatePickerName4EditPart.VISUAL_ID:
				return new DatePickerName4EditPart(view);

			case Switch4EditPart.VISUAL_ID:
				return new Switch4EditPart(view);

			case SwitchName4EditPart.VISUAL_ID:
				return new SwitchName4EditPart(view);

			case Table4EditPart.VISUAL_ID:
				return new Table4EditPart(view);

			case TableName4EditPart.VISUAL_ID:
				return new TableName4EditPart(view);

			case UserInterfaceUserInterfaceListTemplateWidgetCompartmentEditPart.VISUAL_ID:
				return new UserInterfaceUserInterfaceListTemplateWidgetCompartmentEditPart(view);

			case GroupGroupListTemplateWidgetCompartmentEditPart.VISUAL_ID:
				return new GroupGroupListTemplateWidgetCompartmentEditPart(view);

			case GroupGroupListTemplateWidgetCompartment2EditPart.VISUAL_ID:
				return new GroupGroupListTemplateWidgetCompartment2EditPart(view);

			case GroupColumnGroupColumnListTemplateWidgetCompartmentEditPart.VISUAL_ID:
				return new GroupColumnGroupColumnListTemplateWidgetCompartmentEditPart(view);

			case GroupGroupListTemplateWidgetCompartment3EditPart.VISUAL_ID:
				return new GroupGroupListTemplateWidgetCompartment3EditPart(view);

			case GroupRowGroupRowListTemplateWidgetCompartmentEditPart.VISUAL_ID:
				return new GroupRowGroupRowListTemplateWidgetCompartmentEditPart(view);

			case GroupGroupListTemplateWidgetCompartment4EditPart.VISUAL_ID:
				return new GroupGroupListTemplateWidgetCompartment4EditPart(view);

			case TableTableListCoulmnsCompartmentEditPart.VISUAL_ID:
				return new TableTableListCoulmnsCompartmentEditPart(view);

			case GroupColumnGroupColumnListTemplateWidgetCompartment2EditPart.VISUAL_ID:
				return new GroupColumnGroupColumnListTemplateWidgetCompartment2EditPart(view);

			case GroupColumnGroupColumnListTemplateWidgetCompartment3EditPart.VISUAL_ID:
				return new GroupColumnGroupColumnListTemplateWidgetCompartment3EditPart(view);

			case GroupRowGroupRowListTemplateWidgetCompartment2EditPart.VISUAL_ID:
				return new GroupRowGroupRowListTemplateWidgetCompartment2EditPart(view);

			case GroupRowGroupRowListTemplateWidgetCompartment3EditPart.VISUAL_ID:
				return new GroupRowGroupRowListTemplateWidgetCompartment3EditPart(view);

			case TableTableListCoulmnsCompartment2EditPart.VISUAL_ID:
				return new TableTableListCoulmnsCompartment2EditPart(view);

			case TableTableListCoulmnsCompartment3EditPart.VISUAL_ID:
				return new TableTableListCoulmnsCompartment3EditPart(view);

			case GroupColumnGroupColumnListTemplateWidgetCompartment4EditPart.VISUAL_ID:
				return new GroupColumnGroupColumnListTemplateWidgetCompartment4EditPart(view);

			case GroupRowGroupRowListTemplateWidgetCompartment4EditPart.VISUAL_ID:
				return new GroupRowGroupRowListTemplateWidgetCompartment4EditPart(view);

			case TableTableListCoulmnsCompartment4EditPart.VISUAL_ID:
				return new TableTableListCoulmnsCompartment4EditPart(view);
			}
		}
		return createUnrecognizedEditPart(context, model);
	}

	/**
	* @generated
	*/
	private EditPart createUnrecognizedEditPart(EditPart context, Object model) {
		// Handle creation of unrecognized child node EditParts here
		return null;
	}

	/**
	* @generated
	*/
	public static CellEditorLocator getTextCellEditorLocator(ITextAwareEditPart source) {
		return CellEditorLocatorAccess.INSTANCE.getTextCellEditorLocator(source);
	}

}
