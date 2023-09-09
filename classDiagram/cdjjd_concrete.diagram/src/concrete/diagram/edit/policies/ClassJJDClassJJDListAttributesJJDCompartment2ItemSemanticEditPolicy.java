/*
* 
*/
package concrete.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;

import concrete.diagram.edit.commands.AttributeJJDCreateCommand;
import concrete.diagram.providers.ConcreteElementTypes;

/**
 * @generated
 */
public class ClassJJDClassJJDListAttributesJJDCompartment2ItemSemanticEditPolicy
		extends ConcreteBaseItemSemanticEditPolicy {

	/**
	* @generated
	*/
	public ClassJJDClassJJDListAttributesJJDCompartment2ItemSemanticEditPolicy() {
		super(ConcreteElementTypes.ClassJJD_2002);
	}

	/**
	* @generated
	*/
	protected Command getCreateCommand(CreateElementRequest req) {
		if (ConcreteElementTypes.AttributeJJD_3003 == req.getElementType()) {
			return getGEFWrapper(new AttributeJJDCreateCommand(req));
		}
		return super.getCreateCommand(req);
	}

}
