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
public class TableTableListCoulmnsCompartment4ItemSemanticEditPolicy extends UidiagramBaseItemSemanticEditPolicy {

	/**
	* @generated
	*/
	public TableTableListCoulmnsCompartment4ItemSemanticEditPolicy() {
		super(UidiagramElementTypes.Table_3066);
	}

	/**
	* @generated
	*/
	protected Command getCreateCommand(CreateElementRequest req) {
		if (UidiagramElementTypes.Column_3024 == req.getElementType()) {
			return getGEFWrapper(new ColumnCreateCommand(req));
		}
		return super.getCreateCommand(req);
	}

}
