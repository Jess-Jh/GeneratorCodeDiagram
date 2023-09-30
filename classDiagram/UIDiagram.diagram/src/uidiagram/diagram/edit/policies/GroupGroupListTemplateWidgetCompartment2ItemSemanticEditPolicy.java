/*
* 
*/
package uidiagram.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;

import uidiagram.diagram.edit.commands.AppbarCreateCommand;
import uidiagram.diagram.edit.commands.ButtonCreateCommand;
import uidiagram.diagram.edit.commands.CheckboxCreateCommand;
import uidiagram.diagram.edit.commands.ComboBoxCreateCommand;
import uidiagram.diagram.edit.commands.DatePickerCreateCommand;
import uidiagram.diagram.edit.commands.Group2CreateCommand;
import uidiagram.diagram.edit.commands.GroupColumnCreateCommand;
import uidiagram.diagram.edit.commands.GroupRowCreateCommand;
import uidiagram.diagram.edit.commands.InputCreateCommand;
import uidiagram.diagram.edit.commands.LabelCreateCommand;
import uidiagram.diagram.edit.commands.ListViewCreateCommand;
import uidiagram.diagram.edit.commands.RadioButtonCreateCommand;
import uidiagram.diagram.edit.commands.SwitchCreateCommand;
import uidiagram.diagram.edit.commands.TabbarCreateCommand;
import uidiagram.diagram.edit.commands.TableCreateCommand;
import uidiagram.diagram.providers.UidiagramElementTypes;

/**
 * @generated
 */
public class GroupGroupListTemplateWidgetCompartment2ItemSemanticEditPolicy
		extends UidiagramBaseItemSemanticEditPolicy {

	/**
	* @generated
	*/
	public GroupGroupListTemplateWidgetCompartment2ItemSemanticEditPolicy() {
		super(UidiagramElementTypes.Group_3002);
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
		if (UidiagramElementTypes.Tabbar_3008 == req.getElementType()) {
			return getGEFWrapper(new TabbarCreateCommand(req));
		}
		if (UidiagramElementTypes.Button_3009 == req.getElementType()) {
			return getGEFWrapper(new ButtonCreateCommand(req));
		}
		if (UidiagramElementTypes.Label_3010 == req.getElementType()) {
			return getGEFWrapper(new LabelCreateCommand(req));
		}
		if (UidiagramElementTypes.Checkbox_3011 == req.getElementType()) {
			return getGEFWrapper(new CheckboxCreateCommand(req));
		}
		if (UidiagramElementTypes.Input_3012 == req.getElementType()) {
			return getGEFWrapper(new InputCreateCommand(req));
		}
		if (UidiagramElementTypes.ListView_3013 == req.getElementType()) {
			return getGEFWrapper(new ListViewCreateCommand(req));
		}
		if (UidiagramElementTypes.RadioButton_3014 == req.getElementType()) {
			return getGEFWrapper(new RadioButtonCreateCommand(req));
		}
		if (UidiagramElementTypes.ComboBox_3015 == req.getElementType()) {
			return getGEFWrapper(new ComboBoxCreateCommand(req));
		}
		if (UidiagramElementTypes.DatePicker_3016 == req.getElementType()) {
			return getGEFWrapper(new DatePickerCreateCommand(req));
		}
		if (UidiagramElementTypes.Switch_3017 == req.getElementType()) {
			return getGEFWrapper(new SwitchCreateCommand(req));
		}
		if (UidiagramElementTypes.Table_3018 == req.getElementType()) {
			return getGEFWrapper(new TableCreateCommand(req));
		}
		return super.getCreateCommand(req);
	}

}
