/*
* 
*/
package uidiagram.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;

import uidiagram.diagram.edit.commands.Appbar4CreateCommand;
import uidiagram.diagram.edit.commands.Appbar5CreateCommand;
import uidiagram.diagram.edit.commands.Button4CreateCommand;
import uidiagram.diagram.edit.commands.Button6CreateCommand;
import uidiagram.diagram.edit.commands.Button7CreateCommand;
import uidiagram.diagram.edit.commands.Checkbox4CreateCommand;
import uidiagram.diagram.edit.commands.Checkbox5CreateCommand;
import uidiagram.diagram.edit.commands.ComboBox4CreateCommand;
import uidiagram.diagram.edit.commands.ComboBox5CreateCommand;
import uidiagram.diagram.edit.commands.DatePicker4CreateCommand;
import uidiagram.diagram.edit.commands.DatePicker5CreateCommand;
import uidiagram.diagram.edit.commands.GroupColumn4CreateCommand;
import uidiagram.diagram.edit.commands.GroupColumn5CreateCommand;
import uidiagram.diagram.edit.commands.GroupCreateCommand;
import uidiagram.diagram.edit.commands.GroupRow4CreateCommand;
import uidiagram.diagram.edit.commands.GroupRow5CreateCommand;
import uidiagram.diagram.edit.commands.Input4CreateCommand;
import uidiagram.diagram.edit.commands.Input5CreateCommand;
import uidiagram.diagram.edit.commands.Label4CreateCommand;
import uidiagram.diagram.edit.commands.Label6CreateCommand;
import uidiagram.diagram.edit.commands.Label7CreateCommand;
import uidiagram.diagram.edit.commands.ListView4CreateCommand;
import uidiagram.diagram.edit.commands.ListView5CreateCommand;
import uidiagram.diagram.edit.commands.RadioButton4CreateCommand;
import uidiagram.diagram.edit.commands.RadioButton5CreateCommand;
import uidiagram.diagram.edit.commands.Switch4CreateCommand;
import uidiagram.diagram.edit.commands.Switch5CreateCommand;
import uidiagram.diagram.edit.commands.Tabbar4CreateCommand;
import uidiagram.diagram.edit.commands.Tabbar5CreateCommand;
import uidiagram.diagram.edit.commands.Table4CreateCommand;
import uidiagram.diagram.edit.commands.Table5CreateCommand;
import uidiagram.diagram.providers.UidiagramElementTypes;

/**
 * @generated
 */
public class UserInterfaceUserInterfaceListTemplateWidgetCompartmentItemSemanticEditPolicy
		extends UidiagramBaseItemSemanticEditPolicy {

	/**
	* @generated
	*/
	public UserInterfaceUserInterfaceListTemplateWidgetCompartmentItemSemanticEditPolicy() {
		super(UidiagramElementTypes.UserInterface_2001);
	}

	/**
	* @generated
	*/
	protected Command getCreateCommand(CreateElementRequest req) {
		if (UidiagramElementTypes.Group_3001 == req.getElementType()) {
			return getGEFWrapper(new GroupCreateCommand(req));
		}
		if (UidiagramElementTypes.GroupColumn_3048 == req.getElementType()) {
			return getGEFWrapper(new GroupColumn5CreateCommand(req));
		}
		if (UidiagramElementTypes.GroupRow_3049 == req.getElementType()) {
			return getGEFWrapper(new GroupRow5CreateCommand(req));
		}
		if (UidiagramElementTypes.Appbar_3050 == req.getElementType()) {
			return getGEFWrapper(new Appbar5CreateCommand(req));
		}
		if (UidiagramElementTypes.Tabbar_3051 == req.getElementType()) {
			return getGEFWrapper(new Tabbar5CreateCommand(req));
		}
		if (UidiagramElementTypes.Button_3052 == req.getElementType()) {
			return getGEFWrapper(new Button7CreateCommand(req));
		}
		if (UidiagramElementTypes.Label_3053 == req.getElementType()) {
			return getGEFWrapper(new Label7CreateCommand(req));
		}
		if (UidiagramElementTypes.Checkbox_3054 == req.getElementType()) {
			return getGEFWrapper(new Checkbox5CreateCommand(req));
		}
		if (UidiagramElementTypes.Input_3055 == req.getElementType()) {
			return getGEFWrapper(new Input5CreateCommand(req));
		}
		if (UidiagramElementTypes.ListView_3056 == req.getElementType()) {
			return getGEFWrapper(new ListView5CreateCommand(req));
		}
		if (UidiagramElementTypes.RadioButton_3057 == req.getElementType()) {
			return getGEFWrapper(new RadioButton5CreateCommand(req));
		}
		if (UidiagramElementTypes.ComboBox_3058 == req.getElementType()) {
			return getGEFWrapper(new ComboBox5CreateCommand(req));
		}
		if (UidiagramElementTypes.DatePicker_3059 == req.getElementType()) {
			return getGEFWrapper(new DatePicker5CreateCommand(req));
		}
		if (UidiagramElementTypes.Switch_3060 == req.getElementType()) {
			return getGEFWrapper(new Switch5CreateCommand(req));
		}
		if (UidiagramElementTypes.Table_3061 == req.getElementType()) {
			return getGEFWrapper(new Table5CreateCommand(req));
		}
		return super.getCreateCommand(req);
	}

}
