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
public class PackageJJDPackageJJDSubPackagesJJDCompartment2ItemSemanticEditPolicy
		extends ConcreteBaseItemSemanticEditPolicy {

	/**
	* @generated
	*/
	public PackageJJDPackageJJDSubPackagesJJDCompartment2ItemSemanticEditPolicy() {
		super(ConcreteElementTypes.PackageJJD_3001);
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
