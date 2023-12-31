/*
* 
*/
package uidiagram.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;

import uidiagram.diagram.edit.commands.AppbarCreateCommand;
import uidiagram.diagram.edit.commands.Button3CreateCommand;
import uidiagram.diagram.edit.commands.CheckboxCreateCommand;
import uidiagram.diagram.edit.commands.ComboBoxCreateCommand;
import uidiagram.diagram.edit.commands.DatePickerCreateCommand;
import uidiagram.diagram.edit.commands.Group2CreateCommand;
import uidiagram.diagram.edit.commands.GroupColumnCreateCommand;
import uidiagram.diagram.edit.commands.GroupRowCreateCommand;
import uidiagram.diagram.edit.commands.InputCreateCommand;
import uidiagram.diagram.edit.commands.Label3CreateCommand;
import uidiagram.diagram.edit.commands.ListViewCreateCommand;
import uidiagram.diagram.edit.commands.RadioButtonCreateCommand;
import uidiagram.diagram.edit.commands.SwitchCreateCommand;
import uidiagram.diagram.edit.commands.TabbarCreateCommand;
import uidiagram.diagram.edit.commands.TableCreateCommand;
import uidiagram.diagram.providers.UidiagramElementTypes;

/**
 * @generated
 */
public class GroupGroupTemplateWidgetCompartment5ItemSemanticEditPolicy extends UidiagramBaseItemSemanticEditPolicy {

	/**
	* @generated
	*/
	public GroupGroupTemplateWidgetCompartment5ItemSemanticEditPolicy() {
		super(UidiagramElementTypes.Group_3018);
	}

	/**
	* @generated
	*/
	protected Command getCreateCommand(CreateElementRequest req) {
		if (UidiagramElementTypes.Group_3002 == req.getElementType()) {
			return getGEFWrapper(new Group2CreateCommand(req));
		}
		if (UidiagramElementTypes.GroupColumn_3003 == req.getElementType()) {
			return getGEFWrapper(new GroupColumnCreateCommand(req));
		}
		if (UidiagramElementTypes.GroupRow_3005 == req.getElementType()) {
			return getGEFWrapper(new GroupRowCreateCommand(req));
		}
		if (UidiagramElementTypes.Appbar_3007 == req.getElementType()) {
			return getGEFWrapper(new AppbarCreateCommand(req));
		}
		if (UidiagramElementTypes.Tabbar_3010 == req.getElementType()) {
			return getGEFWrapper(new TabbarCreateCommand(req));
		}
		if (UidiagramElementTypes.Button_3013 == req.getElementType()) {
			return getGEFWrapper(new Button3CreateCommand(req));
		}
		if (UidiagramElementTypes.Label_3014 == req.getElementType()) {
			return getGEFWrapper(new Label3CreateCommand(req));
		}
		if (UidiagramElementTypes.Checkbox_3015 == req.getElementType()) {
			return getGEFWrapper(new CheckboxCreateCommand(req));
		}
		if (UidiagramElementTypes.Input_3016 == req.getElementType()) {
			return getGEFWrapper(new InputCreateCommand(req));
		}
		if (UidiagramElementTypes.ListView_3017 == req.getElementType()) {
			return getGEFWrapper(new ListViewCreateCommand(req));
		}
		if (UidiagramElementTypes.RadioButton_3019 == req.getElementType()) {
			return getGEFWrapper(new RadioButtonCreateCommand(req));
		}
		if (UidiagramElementTypes.ComboBox_3020 == req.getElementType()) {
			return getGEFWrapper(new ComboBoxCreateCommand(req));
		}
		if (UidiagramElementTypes.DatePicker_3021 == req.getElementType()) {
			return getGEFWrapper(new DatePickerCreateCommand(req));
		}
		if (UidiagramElementTypes.Switch_3022 == req.getElementType()) {
			return getGEFWrapper(new SwitchCreateCommand(req));
		}
		if (UidiagramElementTypes.Table_3023 == req.getElementType()) {
			return getGEFWrapper(new TableCreateCommand(req));
		}
		return super.getCreateCommand(req);
	}

}
