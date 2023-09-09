/*
* 
*/
package concrete.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;

import concrete.diagram.edit.commands.ClassJJD2CreateCommand;
import concrete.diagram.providers.ConcreteElementTypes;

/**
 * @generated
 */
public class PackageJJDPackageJJDListClassJJDCompartmentItemSemanticEditPolicy
		extends ConcreteBaseItemSemanticEditPolicy {

	/**
	* @generated
	*/
	public PackageJJDPackageJJDListClassJJDCompartmentItemSemanticEditPolicy() {
		super(ConcreteElementTypes.PackageJJD_2001);
	}

	/**
	* @generated
	*/
	protected Command getCreateCommand(CreateElementRequest req) {
		if (ConcreteElementTypes.ClassJJD_3002 == req.getElementType()) {
			return getGEFWrapper(new ClassJJD2CreateCommand(req));
		}
		return super.getCreateCommand(req);
	}

}
