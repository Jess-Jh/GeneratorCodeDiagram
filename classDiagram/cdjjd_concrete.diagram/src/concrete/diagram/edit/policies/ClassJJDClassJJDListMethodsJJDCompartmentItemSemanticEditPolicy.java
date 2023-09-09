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
public class ClassJJDClassJJDListMethodsJJDCompartmentItemSemanticEditPolicy
		extends ConcreteBaseItemSemanticEditPolicy {

	/**
	* @generated
	*/
	public ClassJJDClassJJDListMethodsJJDCompartmentItemSemanticEditPolicy() {
		super(ConcreteElementTypes.ClassJJD_3002);
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
