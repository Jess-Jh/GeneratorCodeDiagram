/*
* 
*/
package uidiagram.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;

import uidiagram.diagram.edit.commands.Button2CreateCommand;
import uidiagram.diagram.providers.UidiagramElementTypes;

/**
 * @generated
 */
public class TabbarTabbarListButtonsCompartmentItemSemanticEditPolicy extends UidiagramBaseItemSemanticEditPolicy {

	/**
	* @generated
	*/
	public TabbarTabbarListButtonsCompartmentItemSemanticEditPolicy() {
		super(UidiagramElementTypes.Tabbar_3010);
	}

	/**
	* @generated
	*/
	protected Command getCreateCommand(CreateElementRequest req) {
		if (UidiagramElementTypes.Button_3011 == req.getElementType()) {
			return getGEFWrapper(new Button2CreateCommand(req));
		}
		return super.getCreateCommand(req);
	}

}
