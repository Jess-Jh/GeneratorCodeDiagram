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
public class AppbarAppbarListLabelsCompartment5ItemSemanticEditPolicy extends UidiagramBaseItemSemanticEditPolicy {

	/**
	* @generated
	*/
	public AppbarAppbarListLabelsCompartment5ItemSemanticEditPolicy() {
		super(UidiagramElementTypes.Appbar_3069);
	}

	/**
	* @generated
	*/
	protected Command getCreateCommand(CreateElementRequest req) {
		if (UidiagramElementTypes.Label_3009 == req.getElementType()) {
			return getGEFWrapper(new LabelCreateCommand(req));
		}
		return super.getCreateCommand(req);
	}

}
