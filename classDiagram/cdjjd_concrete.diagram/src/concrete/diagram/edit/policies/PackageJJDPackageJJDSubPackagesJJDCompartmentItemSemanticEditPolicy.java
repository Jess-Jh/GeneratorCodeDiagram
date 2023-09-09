/*
* 
*/
package concrete.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;

import concrete.diagram.edit.commands.PackageJJD2CreateCommand;
import concrete.diagram.providers.ConcreteElementTypes;

/**
 * @generated
 */
public class PackageJJDPackageJJDSubPackagesJJDCompartmentItemSemanticEditPolicy
		extends ConcreteBaseItemSemanticEditPolicy {

	/**
	* @generated
	*/
	public PackageJJDPackageJJDSubPackagesJJDCompartmentItemSemanticEditPolicy() {
		super(ConcreteElementTypes.PackageJJD_2001);
	}

	/**
	* @generated
	*/
	protected Command getCreateCommand(CreateElementRequest req) {
		if (ConcreteElementTypes.PackageJJD_3001 == req.getElementType()) {
			return getGEFWrapper(new PackageJJD2CreateCommand(req));
		}
		return super.getCreateCommand(req);
	}

}
