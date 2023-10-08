/*
* 
*/
package uidiagram.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;

import uidiagram.diagram.edit.commands.LabelCreateCommand;
import uidiagram.diagram.providers.UidiagramElementTypes;

/**
 * @generated
 */
public class AppbarAppbarListLabelsCompartment2ItemSemanticEditPolicy extends UidiagramBaseItemSemanticEditPolicy {

	/**
	* @generated
	*/
	public AppbarAppbarListLabelsCompartment2ItemSemanticEditPolicy() {
		super(UidiagramElementTypes.Appbar_3024);
	}

	/**
	* @generated
	*/
	protected Command getCreateCommand(CreateElementRequest req) {
		if (UidiagramElementTypes.Label_3064 == req.getElementType()) {
			return getGEFWrapper(new LabelCreateCommand(req));
		}
		return super.getCreateCommand(req);
	}

}
