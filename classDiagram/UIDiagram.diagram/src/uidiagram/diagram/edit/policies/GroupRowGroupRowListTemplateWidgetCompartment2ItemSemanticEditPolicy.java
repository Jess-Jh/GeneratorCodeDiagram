/*
* 
*/
package uidiagram.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;

import uidiagram.diagram.edit.commands.Appbar2CreateCommand;
import uidiagram.diagram.edit.commands.Button2CreateCommand;
import uidiagram.diagram.edit.commands.Button4CreateCommand;
import uidiagram.diagram.edit.commands.Checkbox2CreateCommand;
import uidiagram.diagram.edit.commands.ComboBox2CreateCommand;
import uidiagram.diagram.edit.commands.DatePicker2CreateCommand;
import uidiagram.diagram.edit.commands.Group4CreateCommand;
import uidiagram.diagram.edit.commands.GroupColumn2CreateCommand;
import uidiagram.diagram.edit.commands.GroupRow3CreateCommand;
import uidiagram.diagram.edit.commands.Input2CreateCommand;
import uidiagram.diagram.edit.commands.Label2CreateCommand;
import uidiagram.diagram.edit.commands.Label4CreateCommand;
import uidiagram.diagram.edit.commands.ListView2CreateCommand;
import uidiagram.diagram.edit.commands.RadioButton2CreateCommand;
import uidiagram.diagram.edit.commands.Switch2CreateCommand;
import uidiagram.diagram.edit.commands.Tabbar2CreateCommand;
import uidiagram.diagram.edit.commands.Table2CreateCommand;
import uidiagram.diagram.providers.UidiagramElementTypes;

/**
 * @generated
 */
public class GroupRowGroupRowListTemplateWidgetCompartment2ItemSemanticEditPolicy
		extends UidiagramBaseItemSemanticEditPolicy {

	/**
	* @generated
	*/
	public GroupRowGroupRowListTemplateWidgetCompartment2ItemSemanticEditPolicy() {
		super(UidiagramElementTypes.GroupRow_3022);
	}

	/**
	* @generated
	*/
	protected Command getCreateCommand(CreateElementRequest req) {
		if (UidiagramElementTypes.Group_3006 == req.getElementType()) {
			return getGEFWrapper(new Group4CreateCommand(req));
		}
		if (UidiagramElementTypes.GroupColumn_3020 == req.getElementType()) {
			return getGEFWrapper(new GroupColumn2CreateCommand(req));
		}
		if (UidiagramElementTypes.GroupRow_3023 == req.getElementType()) {
			return getGEFWrapper(new GroupRow3CreateCommand(req));
		}
		if (UidiagramElementTypes.Appbar_3024 == req.getElementType()) {
			return getGEFWrapper(new Appbar2CreateCommand(req));
		}
		if (UidiagramElementTypes.Tabbar_3025 == req.getElementType()) {
			return getGEFWrapper(new Tabbar2CreateCommand(req));
		}
		if (UidiagramElementTypes.Button_3026 == req.getElementType()) {
			return getGEFWrapper(new Button4CreateCommand(req));
		}
		if (UidiagramElementTypes.Label_3027 == req.getElementType()) {
			return getGEFWrapper(new Label4CreateCommand(req));
		}
		if (UidiagramElementTypes.Checkbox_3028 == req.getElementType()) {
			return getGEFWrapper(new Checkbox2CreateCommand(req));
		}
		if (UidiagramElementTypes.Input_3029 == req.getElementType()) {
			return getGEFWrapper(new Input2CreateCommand(req));
		}
		if (UidiagramElementTypes.ListView_3030 == req.getElementType()) {
			return getGEFWrapper(new ListView2CreateCommand(req));
		}
		if (UidiagramElementTypes.RadioButton_3031 == req.getElementType()) {
			return getGEFWrapper(new RadioButton2CreateCommand(req));
		}
		if (UidiagramElementTypes.ComboBox_3032 == req.getElementType()) {
			return getGEFWrapper(new ComboBox2CreateCommand(req));
		}
		if (UidiagramElementTypes.DatePicker_3033 == req.getElementType()) {
			return getGEFWrapper(new DatePicker2CreateCommand(req));
		}
		if (UidiagramElementTypes.Switch_3034 == req.getElementType()) {
			return getGEFWrapper(new Switch2CreateCommand(req));
		}
		if (UidiagramElementTypes.Table_3035 == req.getElementType()) {
			return getGEFWrapper(new Table2CreateCommand(req));
		}
		return super.getCreateCommand(req);
	}

}
