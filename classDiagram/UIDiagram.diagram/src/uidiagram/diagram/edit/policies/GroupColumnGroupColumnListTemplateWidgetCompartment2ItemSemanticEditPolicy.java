/*
* 
*/
package uidiagram.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;

import uidiagram.diagram.edit.commands.Appbar2CreateCommand;
import uidiagram.diagram.edit.commands.Appbar3CreateCommand;
import uidiagram.diagram.edit.commands.Button3CreateCommand;
import uidiagram.diagram.edit.commands.Button4CreateCommand;
import uidiagram.diagram.edit.commands.Button5CreateCommand;
import uidiagram.diagram.edit.commands.Checkbox2CreateCommand;
import uidiagram.diagram.edit.commands.Checkbox3CreateCommand;
import uidiagram.diagram.edit.commands.ComboBox3CreateCommand;
import uidiagram.diagram.edit.commands.ComboBox4CreateCommand;
import uidiagram.diagram.edit.commands.DatePicker3CreateCommand;
import uidiagram.diagram.edit.commands.DatePicker4CreateCommand;
import uidiagram.diagram.edit.commands.Group3CreateCommand;
import uidiagram.diagram.edit.commands.GroupColumn3CreateCommand;
import uidiagram.diagram.edit.commands.GroupRow2CreateCommand;
import uidiagram.diagram.edit.commands.Input2CreateCommand;
import uidiagram.diagram.edit.commands.Input3CreateCommand;
import uidiagram.diagram.edit.commands.Label3CreateCommand;
import uidiagram.diagram.edit.commands.Label4CreateCommand;
import uidiagram.diagram.edit.commands.Label5CreateCommand;
import uidiagram.diagram.edit.commands.ListView2CreateCommand;
import uidiagram.diagram.edit.commands.ListView3CreateCommand;
import uidiagram.diagram.edit.commands.RadioButton3CreateCommand;
import uidiagram.diagram.edit.commands.RadioButton4CreateCommand;
import uidiagram.diagram.edit.commands.Switch3CreateCommand;
import uidiagram.diagram.edit.commands.Switch4CreateCommand;
import uidiagram.diagram.edit.commands.Tabbar2CreateCommand;
import uidiagram.diagram.edit.commands.Tabbar3CreateCommand;
import uidiagram.diagram.edit.commands.Table3CreateCommand;
import uidiagram.diagram.edit.commands.Table4CreateCommand;
import uidiagram.diagram.providers.UidiagramElementTypes;

/**
 * @generated
 */
public class GroupColumnGroupColumnListTemplateWidgetCompartment2ItemSemanticEditPolicy
		extends UidiagramBaseItemSemanticEditPolicy {

	/**
	* @generated
	*/
	public GroupColumnGroupColumnListTemplateWidgetCompartment2ItemSemanticEditPolicy() {
		super(UidiagramElementTypes.GroupColumn_3082);
	}

	/**
	* @generated
	*/
	protected Command getCreateCommand(CreateElementRequest req) {
		if (UidiagramElementTypes.Group_3004 == req.getElementType()) {
			return getGEFWrapper(new Group3CreateCommand(req));
		}
		if (UidiagramElementTypes.GroupColumn_3021 == req.getElementType()) {
			return getGEFWrapper(new GroupColumn3CreateCommand(req));
		}
		if (UidiagramElementTypes.GroupRow_3022 == req.getElementType()) {
			return getGEFWrapper(new GroupRow2CreateCommand(req));
		}
		if (UidiagramElementTypes.Appbar_3036 == req.getElementType()) {
			return getGEFWrapper(new Appbar2CreateCommand(req));
		}
		if (UidiagramElementTypes.Tabbar_3037 == req.getElementType()) {
			return getGEFWrapper(new Tabbar2CreateCommand(req));
		}
		if (UidiagramElementTypes.Button_3038 == req.getElementType()) {
			return getGEFWrapper(new Button4CreateCommand(req));
		}
		if (UidiagramElementTypes.Label_3039 == req.getElementType()) {
			return getGEFWrapper(new Label4CreateCommand(req));
		}
		if (UidiagramElementTypes.Checkbox_3040 == req.getElementType()) {
			return getGEFWrapper(new Checkbox2CreateCommand(req));
		}
		if (UidiagramElementTypes.Input_3041 == req.getElementType()) {
			return getGEFWrapper(new Input2CreateCommand(req));
		}
		if (UidiagramElementTypes.ListView_3042 == req.getElementType()) {
			return getGEFWrapper(new ListView2CreateCommand(req));
		}
		if (UidiagramElementTypes.RadioButton_3043 == req.getElementType()) {
			return getGEFWrapper(new RadioButton4CreateCommand(req));
		}
		if (UidiagramElementTypes.ComboBox_3044 == req.getElementType()) {
			return getGEFWrapper(new ComboBox4CreateCommand(req));
		}
		if (UidiagramElementTypes.DatePicker_3045 == req.getElementType()) {
			return getGEFWrapper(new DatePicker4CreateCommand(req));
		}
		if (UidiagramElementTypes.Switch_3046 == req.getElementType()) {
			return getGEFWrapper(new Switch4CreateCommand(req));
		}
		if (UidiagramElementTypes.Table_3047 == req.getElementType()) {
			return getGEFWrapper(new Table4CreateCommand(req));
		}
		return super.getCreateCommand(req);
	}

}
