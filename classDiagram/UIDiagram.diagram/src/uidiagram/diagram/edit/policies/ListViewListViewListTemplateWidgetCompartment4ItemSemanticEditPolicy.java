/*
* 
*/
package uidiagram.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;

import uidiagram.diagram.edit.commands.Appbar4CreateCommand;
import uidiagram.diagram.edit.commands.Button6CreateCommand;
import uidiagram.diagram.edit.commands.Checkbox4CreateCommand;
import uidiagram.diagram.edit.commands.ComboBox2CreateCommand;
import uidiagram.diagram.edit.commands.DatePicker2CreateCommand;
import uidiagram.diagram.edit.commands.Group5CreateCommand;
import uidiagram.diagram.edit.commands.GroupColumn2CreateCommand;
import uidiagram.diagram.edit.commands.GroupRow3CreateCommand;
import uidiagram.diagram.edit.commands.Input4CreateCommand;
import uidiagram.diagram.edit.commands.Label6CreateCommand;
import uidiagram.diagram.edit.commands.ListView4CreateCommand;
import uidiagram.diagram.edit.commands.RadioButton2CreateCommand;
import uidiagram.diagram.edit.commands.Switch2CreateCommand;
import uidiagram.diagram.edit.commands.Tabbar4CreateCommand;
import uidiagram.diagram.edit.commands.Table2CreateCommand;
import uidiagram.diagram.providers.UidiagramElementTypes;

/**
 * @generated
 */
public class ListViewListViewListTemplateWidgetCompartment4ItemSemanticEditPolicy
		extends UidiagramBaseItemSemanticEditPolicy {

	/**
	* @generated
	*/
	public ListViewListViewListTemplateWidgetCompartment4ItemSemanticEditPolicy() {
		super(UidiagramElementTypes.ListView_3075);
	}

	/**
	* @generated
	*/
	protected Command getCreateCommand(CreateElementRequest req) {
		if (UidiagramElementTypes.Group_3066 == req.getElementType()) {
			return getGEFWrapper(new Group5CreateCommand(req));
		}
		if (UidiagramElementTypes.GroupColumn_3067 == req.getElementType()) {
			return getGEFWrapper(new GroupColumn2CreateCommand(req));
		}
		if (UidiagramElementTypes.GroupRow_3068 == req.getElementType()) {
			return getGEFWrapper(new GroupRow3CreateCommand(req));
		}
		if (UidiagramElementTypes.Appbar_3069 == req.getElementType()) {
			return getGEFWrapper(new Appbar4CreateCommand(req));
		}
		if (UidiagramElementTypes.Tabbar_3070 == req.getElementType()) {
			return getGEFWrapper(new Tabbar4CreateCommand(req));
		}
		if (UidiagramElementTypes.Button_3071 == req.getElementType()) {
			return getGEFWrapper(new Button6CreateCommand(req));
		}
		if (UidiagramElementTypes.Label_3072 == req.getElementType()) {
			return getGEFWrapper(new Label6CreateCommand(req));
		}
		if (UidiagramElementTypes.Checkbox_3073 == req.getElementType()) {
			return getGEFWrapper(new Checkbox4CreateCommand(req));
		}
		if (UidiagramElementTypes.Input_3074 == req.getElementType()) {
			return getGEFWrapper(new Input4CreateCommand(req));
		}
		if (UidiagramElementTypes.ListView_3075 == req.getElementType()) {
			return getGEFWrapper(new ListView4CreateCommand(req));
		}
		if (UidiagramElementTypes.RadioButton_3076 == req.getElementType()) {
			return getGEFWrapper(new RadioButton2CreateCommand(req));
		}
		if (UidiagramElementTypes.ComboBox_3077 == req.getElementType()) {
			return getGEFWrapper(new ComboBox2CreateCommand(req));
		}
		if (UidiagramElementTypes.DatePicker_3078 == req.getElementType()) {
			return getGEFWrapper(new DatePicker2CreateCommand(req));
		}
		if (UidiagramElementTypes.Switch_3079 == req.getElementType()) {
			return getGEFWrapper(new Switch2CreateCommand(req));
		}
		if (UidiagramElementTypes.Table_3080 == req.getElementType()) {
			return getGEFWrapper(new Table2CreateCommand(req));
		}
		return super.getCreateCommand(req);
	}

}