/*
* 
*/
package uidiagram.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;

import uidiagram.diagram.edit.commands.Appbar2CreateCommand;
import uidiagram.diagram.edit.commands.Appbar3CreateCommand;
import uidiagram.diagram.edit.commands.Button2CreateCommand;
import uidiagram.diagram.edit.commands.Button4CreateCommand;
import uidiagram.diagram.edit.commands.Button5CreateCommand;
import uidiagram.diagram.edit.commands.Checkbox2CreateCommand;
import uidiagram.diagram.edit.commands.Checkbox3CreateCommand;
import uidiagram.diagram.edit.commands.ComboBox2CreateCommand;
import uidiagram.diagram.edit.commands.ComboBox3CreateCommand;
import uidiagram.diagram.edit.commands.DatePicker2CreateCommand;
import uidiagram.diagram.edit.commands.DatePicker3CreateCommand;
import uidiagram.diagram.edit.commands.Group4CreateCommand;
import uidiagram.diagram.edit.commands.GroupColumn2CreateCommand;
import uidiagram.diagram.edit.commands.GroupColumn4CreateCommand;
import uidiagram.diagram.edit.commands.GroupRow3CreateCommand;
import uidiagram.diagram.edit.commands.GroupRow4CreateCommand;
import uidiagram.diagram.edit.commands.Input2CreateCommand;
import uidiagram.diagram.edit.commands.Input3CreateCommand;
import uidiagram.diagram.edit.commands.Label2CreateCommand;
import uidiagram.diagram.edit.commands.Label4CreateCommand;
import uidiagram.diagram.edit.commands.Label5CreateCommand;
import uidiagram.diagram.edit.commands.ListView2CreateCommand;
import uidiagram.diagram.edit.commands.ListView3CreateCommand;
import uidiagram.diagram.edit.commands.RadioButton2CreateCommand;
import uidiagram.diagram.edit.commands.RadioButton3CreateCommand;
import uidiagram.diagram.edit.commands.Switch2CreateCommand;
import uidiagram.diagram.edit.commands.Switch3CreateCommand;
import uidiagram.diagram.edit.commands.Tabbar2CreateCommand;
import uidiagram.diagram.edit.commands.Tabbar3CreateCommand;
import uidiagram.diagram.edit.commands.Table2CreateCommand;
import uidiagram.diagram.edit.commands.Table3CreateCommand;
import uidiagram.diagram.providers.UidiagramElementTypes;

/**
 * @generated
 */
public class GroupRowGroupRowListTemplateWidgetCompartment3ItemSemanticEditPolicy
		extends UidiagramBaseItemSemanticEditPolicy {

	/**
	* @generated
	*/
	public GroupRowGroupRowListTemplateWidgetCompartment3ItemSemanticEditPolicy() {
		super(UidiagramElementTypes.GroupRow_3083);
	}

	/**
	* @generated
	*/
	protected Command getCreateCommand(CreateElementRequest req) {
		if (UidiagramElementTypes.Group_3006 == req.getElementType()) {
			return getGEFWrapper(new Group4CreateCommand(req));
		}
		if (UidiagramElementTypes.GroupColumn_3020 == req.getElementType()) {
			return getGEFWrapper(new GroupColumn4CreateCommand(req));
		}
		if (UidiagramElementTypes.GroupRow_3023 == req.getElementType()) {
			return getGEFWrapper(new GroupRow4CreateCommand(req));
		}
		if (UidiagramElementTypes.Appbar_3024 == req.getElementType()) {
			return getGEFWrapper(new Appbar3CreateCommand(req));
		}
		if (UidiagramElementTypes.Tabbar_3025 == req.getElementType()) {
			return getGEFWrapper(new Tabbar3CreateCommand(req));
		}
		if (UidiagramElementTypes.Button_3026 == req.getElementType()) {
			return getGEFWrapper(new Button5CreateCommand(req));
		}
		if (UidiagramElementTypes.Label_3027 == req.getElementType()) {
			return getGEFWrapper(new Label5CreateCommand(req));
		}
		if (UidiagramElementTypes.Checkbox_3028 == req.getElementType()) {
			return getGEFWrapper(new Checkbox3CreateCommand(req));
		}
		if (UidiagramElementTypes.Input_3029 == req.getElementType()) {
			return getGEFWrapper(new Input3CreateCommand(req));
		}
		if (UidiagramElementTypes.ListView_3030 == req.getElementType()) {
			return getGEFWrapper(new ListView3CreateCommand(req));
		}
		if (UidiagramElementTypes.RadioButton_3031 == req.getElementType()) {
			return getGEFWrapper(new RadioButton3CreateCommand(req));
		}
		if (UidiagramElementTypes.ComboBox_3032 == req.getElementType()) {
			return getGEFWrapper(new ComboBox3CreateCommand(req));
		}
		if (UidiagramElementTypes.DatePicker_3033 == req.getElementType()) {
			return getGEFWrapper(new DatePicker3CreateCommand(req));
		}
		if (UidiagramElementTypes.Switch_3034 == req.getElementType()) {
			return getGEFWrapper(new Switch3CreateCommand(req));
		}
		if (UidiagramElementTypes.Table_3035 == req.getElementType()) {
			return getGEFWrapper(new Table3CreateCommand(req));
		}
		return super.getCreateCommand(req);
	}

}
