/*
* 
*/
package concrete.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;

import concrete.diagram.edit.commands.MethodJJDCreateCommand;
import concrete.diagram.providers.ConcreteElementTypes;

/**
 * @generated
 */
public class ClassJJDClassJJDListMethodsJJDCompartment2ItemSemanticEditPolicy
		extends ConcreteBaseItemSemanticEditPolicy {

	/**
	* @generated
	*/
	public ClassJJDClassJJDListMethodsJJDCompartment2ItemSemanticEditPolicy() {
		super(ConcreteElementTypes.ClassJJD_2002);
	}

	/**
	* @generated
	*/
	protected Command getCreateCommand(CreateElementRequest req) {
		if (ConcreteElementTypes.MethodJJD_3004 == req.getElementType()) {
			return getGEFWrapper(new MethodJJDCreateCommand(req));
		}
		return super.getCreateCommand(req);
	}

}
