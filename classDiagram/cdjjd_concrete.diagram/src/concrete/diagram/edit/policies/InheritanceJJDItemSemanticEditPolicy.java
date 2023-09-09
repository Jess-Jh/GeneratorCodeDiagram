/*
* 
*/
package concrete.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.commands.DestroyElementCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.DestroyElementRequest;

import concrete.diagram.providers.ConcreteElementTypes;

/**
 * @generated
 */
public class InheritanceJJDItemSemanticEditPolicy extends ConcreteBaseItemSemanticEditPolicy {

	/**
	* @generated
	*/
	public InheritanceJJDItemSemanticEditPolicy() {
		super(ConcreteElementTypes.InheritanceJJD_4002);
	}

	/**
	* @generated
	*/
	protected Command getDestroyElementCommand(DestroyElementRequest req) {
		return getGEFWrapper(new DestroyElementCommand(req));
	}

}
