/*
* 
*/
package uidiagram.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;

import uidiagram.diagram.edit.commands.Label2CreateCommand;
import uidiagram.diagram.providers.UidiagramElementTypes;

/**
 * @generated
 */
public class TabbarTabbarListLabelsCompartment4ItemSemanticEditPolicy extends UidiagramBaseItemSemanticEditPolicy {

	/**
	* @generated
	*/
	public TabbarTabbarListLabelsCompartment4ItemSemanticEditPolicy() {
		super(UidiagramElementTypes.Tabbar_3046);
	}

	/**
	* @generated
	*/
	protected Command getCreateCommand(CreateElementRequest req) {
		if (UidiagramElementTypes.Label_3012 == req.getElementType()) {
			return getGEFWrapper(new Label2CreateCommand(req));
		}
		return super.getCreateCommand(req);
	}

}
