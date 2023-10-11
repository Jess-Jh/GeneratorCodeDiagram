/*
* 
*/
package uidiagram.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;

import uidiagram.diagram.edit.commands.ButtonCreateCommand;
import uidiagram.diagram.providers.UidiagramElementTypes;

/**
 * @generated
 */
public class AppbarAppbarListButtonsCompartment5ItemSemanticEditPolicy extends UidiagramBaseItemSemanticEditPolicy {

	/**
	* @generated
	*/
	public AppbarAppbarListButtonsCompartment5ItemSemanticEditPolicy() {
		super(UidiagramElementTypes.Appbar_3050);
	}

	/**
	* @generated
	*/
	protected Command getCreateCommand(CreateElementRequest req) {
		if (UidiagramElementTypes.Button_3062 == req.getElementType()) {
			return getGEFWrapper(new ButtonCreateCommand(req));
		}
		return super.getCreateCommand(req);
	}

}
