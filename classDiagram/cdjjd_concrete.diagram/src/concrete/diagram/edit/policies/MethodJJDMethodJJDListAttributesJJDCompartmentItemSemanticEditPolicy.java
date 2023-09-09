/*
* 
*/
package concrete.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;

import concrete.diagram.edit.commands.AttributeJJD2CreateCommand;
import concrete.diagram.providers.ConcreteElementTypes;

/**
 * @generated
 */
public class MethodJJDMethodJJDListAttributesJJDCompartmentItemSemanticEditPolicy
		extends ConcreteBaseItemSemanticEditPolicy {

	/**
	* @generated
	*/
	public MethodJJDMethodJJDListAttributesJJDCompartmentItemSemanticEditPolicy() {
		super(ConcreteElementTypes.MethodJJD_3004);
	}

	/**
	* @generated
	*/
	protected Command getCreateCommand(CreateElementRequest req) {
		if (ConcreteElementTypes.AttributeJJD_3005 == req.getElementType()) {
			return getGEFWrapper(new AttributeJJD2CreateCommand(req));
		}
		return super.getCreateCommand(req);
	}

}
