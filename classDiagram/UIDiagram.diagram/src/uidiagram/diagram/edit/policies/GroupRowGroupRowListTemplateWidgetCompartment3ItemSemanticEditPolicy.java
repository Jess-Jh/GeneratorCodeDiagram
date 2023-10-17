/*
* 
*/
package uidiagram.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;

import uidiagram.diagram.edit.commands.Appbar3CreateCommand;
import uidiagram.diagram.edit.commands.Button5CreateCommand;
import uidiagram.diagram.edit.commands.Checkbox3CreateCommand;
import uidiagram.diagram.edit.commands.ComboBox3CreateCommand;
import uidiagram.diagram.edit.commands.DatePicker3CreateCommand;
import uidiagram.diagram.edit.commands.Group4CreateCommand;
import uidiagram.diagram.edit.commands.GroupColumn4CreateCommand;
import uidiagram.diagram.edit.commands.GroupRow4CreateCommand;
import uidiagram.diagram.edit.commands.Input3CreateCommand;
import uidiagram.diagram.edit.commands.Label5CreateCommand;
import uidiagram.diagram.edit.commands.ListView3CreateCommand;
import uidiagram.diagram.edit.commands.RadioButton3CreateCommand;
import uidiagram.diagram.edit.commands.Switch3CreateCommand;
import uidiagram.diagram.edit.commands.Tabbar3CreateCommand;
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
		super(UidiagramElementTypes.GroupRow_3036);
	}

	/**
	* @generated
	*/
	protected Command getCreateCommand(CreateElementRequest req) {
		if (UidiagramElementTypes.Group_3006 == req.getElementType()) {
			return getGEFWrapper(new Group4CreateCommand(req));
		}
		if (UidiagramElementTypes.GroupColumn_3028 == req.getElementType()) {
			return getGEFWrapper(new GroupColumn4CreateCommand(req));
		}
		if (UidiagramElementTypes.GroupRow_3037 == req.getElementType()) {
			return getGEFWrapper(new GroupRow4CreateCommand(req));
		}
		if (UidiagramElementTypes.Appbar_3038 == req.getElementType()) {
			return getGEFWrapper(new Appbar3CreateCommand(req));
		}
		if (UidiagramElementTypes.Tabbar_3039 == req.getElementType()) {
			return getGEFWrapper(new Tabbar3CreateCommand(req));
		}
		if (UidiagramElementTypes.Button_3040 == req.getElementType()) {
			return getGEFWrapper(new Button5CreateCommand(req));
		}
		if (UidiagramElementTypes.Label_3041 == req.getElementType()) {
			return getGEFWrapper(new Label5CreateCommand(req));
		}
		if (UidiagramElementTypes.Checkbox_3042 == req.getElementType()) {
			return getGEFWrapper(new Checkbox3CreateCommand(req));
		}
		if (UidiagramElementTypes.Input_3043 == req.getElementType()) {
			return getGEFWrapper(new Input3CreateCommand(req));
		}
		if (UidiagramElementTypes.ListView_3044 == req.getElementType()) {
			return getGEFWrapper(new ListView3CreateCommand(req));
		}
		if (UidiagramElementTypes.RadioButton_3057 == req.getElementType()) {
			return getGEFWrapper(new RadioButton3CreateCommand(req));
		}
		if (UidiagramElementTypes.ComboBox_3058 == req.getElementType()) {
			return getGEFWrapper(new ComboBox3CreateCommand(req));
		}
		if (UidiagramElementTypes.DatePicker_3059 == req.getElementType()) {
			return getGEFWrapper(new DatePicker3CreateCommand(req));
		}
		if (UidiagramElementTypes.Switch_3060 == req.getElementType()) {
			return getGEFWrapper(new Switch3CreateCommand(req));
		}
		if (UidiagramElementTypes.Table_3061 == req.getElementType()) {
			return getGEFWrapper(new Table3CreateCommand(req));
		}
		return super.getCreateCommand(req);
	}

}
