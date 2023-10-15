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
public class ListViewListViewTemplateWidgetCompartment4ItemSemanticEditPolicy
		extends UidiagramBaseItemSemanticEditPolicy {

	/**
	* @generated
	*/
	public ListViewListViewTemplateWidgetCompartment4ItemSemanticEditPolicy() {
		super(UidiagramElementTypes.ListView_3090);
	}

	/**
	* @generated
	*/
	protected Command getCreateCommand(CreateElementRequest req) {
		if (UidiagramElementTypes.Group_3081 == req.getElementType()) {
			return getGEFWrapper(new Group5CreateCommand(req));
		}
		if (UidiagramElementTypes.GroupColumn_3082 == req.getElementType()) {
			return getGEFWrapper(new GroupColumn2CreateCommand(req));
		}
		if (UidiagramElementTypes.GroupRow_3083 == req.getElementType()) {
			return getGEFWrapper(new GroupRow3CreateCommand(req));
		}
		if (UidiagramElementTypes.Appbar_3084 == req.getElementType()) {
			return getGEFWrapper(new Appbar4CreateCommand(req));
		}
		if (UidiagramElementTypes.Tabbar_3085 == req.getElementType()) {
			return getGEFWrapper(new Tabbar4CreateCommand(req));
		}
		if (UidiagramElementTypes.Button_3086 == req.getElementType()) {
			return getGEFWrapper(new Button6CreateCommand(req));
		}
		if (UidiagramElementTypes.Label_3087 == req.getElementType()) {
			return getGEFWrapper(new Label6CreateCommand(req));
		}
		if (UidiagramElementTypes.Checkbox_3088 == req.getElementType()) {
			return getGEFWrapper(new Checkbox4CreateCommand(req));
		}
		if (UidiagramElementTypes.Input_3089 == req.getElementType()) {
			return getGEFWrapper(new Input4CreateCommand(req));
		}
		if (UidiagramElementTypes.ListView_3090 == req.getElementType()) {
			return getGEFWrapper(new ListView4CreateCommand(req));
		}
		if (UidiagramElementTypes.RadioButton_3091 == req.getElementType()) {
			return getGEFWrapper(new RadioButton2CreateCommand(req));
		}
		if (UidiagramElementTypes.ComboBox_3092 == req.getElementType()) {
			return getGEFWrapper(new ComboBox2CreateCommand(req));
		}
		if (UidiagramElementTypes.DatePicker_3093 == req.getElementType()) {
			return getGEFWrapper(new DatePicker2CreateCommand(req));
		}
		if (UidiagramElementTypes.Switch_3094 == req.getElementType()) {
			return getGEFWrapper(new Switch2CreateCommand(req));
		}
		if (UidiagramElementTypes.Table_3095 == req.getElementType()) {
			return getGEFWrapper(new Table2CreateCommand(req));
		}
		return super.getCreateCommand(req);
	}

}
