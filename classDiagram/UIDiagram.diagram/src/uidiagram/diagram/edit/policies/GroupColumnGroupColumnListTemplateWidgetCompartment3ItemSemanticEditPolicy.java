/*
* 
*/
package uidiagram.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;

import uidiagram.diagram.edit.commands.Appbar2CreateCommand;
import uidiagram.diagram.edit.commands.Button4CreateCommand;
import uidiagram.diagram.edit.commands.Checkbox2CreateCommand;
import uidiagram.diagram.edit.commands.ComboBox4CreateCommand;
import uidiagram.diagram.edit.commands.DatePicker4CreateCommand;
import uidiagram.diagram.edit.commands.Group3CreateCommand;
import uidiagram.diagram.edit.commands.GroupColumn3CreateCommand;
import uidiagram.diagram.edit.commands.GroupRow2CreateCommand;
import uidiagram.diagram.edit.commands.Input2CreateCommand;
import uidiagram.diagram.edit.commands.Label4CreateCommand;
import uidiagram.diagram.edit.commands.ListView2CreateCommand;
import uidiagram.diagram.edit.commands.RadioButton4CreateCommand;
import uidiagram.diagram.edit.commands.Switch4CreateCommand;
import uidiagram.diagram.edit.commands.Tabbar2CreateCommand;
import uidiagram.diagram.edit.commands.Table4CreateCommand;
import uidiagram.diagram.providers.UidiagramElementTypes;

/**
 * @generated
 */
public class GroupColumnGroupColumnListTemplateWidgetCompartment3ItemSemanticEditPolicy
		extends UidiagramBaseItemSemanticEditPolicy {

	/**
	* @generated
	*/
	public GroupColumnGroupColumnListTemplateWidgetCompartment3ItemSemanticEditPolicy() {
		super(UidiagramElementTypes.GroupColumn_3026);
	}

	/**
	* @generated
	*/
	protected Command getCreateCommand(CreateElementRequest req) {
		if (UidiagramElementTypes.Group_3004 == req.getElementType()) {
			return getGEFWrapper(new Group3CreateCommand(req));
		}
		if (UidiagramElementTypes.GroupColumn_3026 == req.getElementType()) {
			return getGEFWrapper(new GroupColumn3CreateCommand(req));
		}
		if (UidiagramElementTypes.GroupRow_3027 == req.getElementType()) {
			return getGEFWrapper(new GroupRow2CreateCommand(req));
		}
		if (UidiagramElementTypes.Appbar_3029 == req.getElementType()) {
			return getGEFWrapper(new Appbar2CreateCommand(req));
		}
		if (UidiagramElementTypes.Tabbar_3030 == req.getElementType()) {
			return getGEFWrapper(new Tabbar2CreateCommand(req));
		}
		if (UidiagramElementTypes.Button_3031 == req.getElementType()) {
			return getGEFWrapper(new Button4CreateCommand(req));
		}
		if (UidiagramElementTypes.Label_3032 == req.getElementType()) {
			return getGEFWrapper(new Label4CreateCommand(req));
		}
		if (UidiagramElementTypes.Checkbox_3033 == req.getElementType()) {
			return getGEFWrapper(new Checkbox2CreateCommand(req));
		}
		if (UidiagramElementTypes.Input_3034 == req.getElementType()) {
			return getGEFWrapper(new Input2CreateCommand(req));
		}
		if (UidiagramElementTypes.ListView_3035 == req.getElementType()) {
			return getGEFWrapper(new ListView2CreateCommand(req));
		}
		if (UidiagramElementTypes.RadioButton_3062 == req.getElementType()) {
			return getGEFWrapper(new RadioButton4CreateCommand(req));
		}
		if (UidiagramElementTypes.ComboBox_3063 == req.getElementType()) {
			return getGEFWrapper(new ComboBox4CreateCommand(req));
		}
		if (UidiagramElementTypes.DatePicker_3064 == req.getElementType()) {
			return getGEFWrapper(new DatePicker4CreateCommand(req));
		}
		if (UidiagramElementTypes.Switch_3065 == req.getElementType()) {
			return getGEFWrapper(new Switch4CreateCommand(req));
		}
		if (UidiagramElementTypes.Table_3066 == req.getElementType()) {
			return getGEFWrapper(new Table4CreateCommand(req));
		}
		return super.getCreateCommand(req);
	}

}
