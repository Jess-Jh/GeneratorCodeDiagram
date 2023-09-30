/*
* 
*/
package uidiagram.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;

import uidiagram.diagram.edit.commands.ColumnCreateCommand;
import uidiagram.diagram.providers.UidiagramElementTypes;

/**
 * @generated
 */
public class TableTableListCoulmnsCompartmentItemSemanticEditPolicy extends UidiagramBaseItemSemanticEditPolicy {

	/**
	* @generated
	*/
	public TableTableListCoulmnsCompartmentItemSemanticEditPolicy() {
		super(UidiagramElementTypes.Table_3018);
	}

	/**
	* @generated
	*/
	protected Command getCreateCommand(CreateElementRequest req) {
		if (UidiagramElementTypes.Column_3019 == req.getElementType()) {
			return getGEFWrapper(new ColumnCreateCommand(req));
		}
		return super.getCreateCommand(req);
	}

}
