/*
 * 
 */
package concrete.diagram.edit.commands;

import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.common.core.command.CommandResult;
import org.eclipse.gmf.runtime.emf.type.core.commands.EditElementCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.ReorientRelationshipRequest;

import concrete.ClassDiagramJJD;
import concrete.ClassJJD;
import concrete.ContainmentJJD;
import concrete.diagram.edit.policies.ConcreteBaseItemSemanticEditPolicy;

/**
 * @generated
 */
public class ContainmentJJDReorientCommand extends EditElementCommand {

	/**
	* @generated
	*/
	private final int reorientDirection;

	/**
	* @generated
	*/
	private final EObject oldEnd;

	/**
	* @generated
	*/
	private final EObject newEnd;

	/**
	* @generated
	*/
	public ContainmentJJDReorientCommand(ReorientRelationshipRequest request) {
		super(request.getLabel(), request.getRelationship(), request);
		reorientDirection = request.getDirection();
		oldEnd = request.getOldRelationshipEnd();
		newEnd = request.getNewRelationshipEnd();
	}

	/**
	* @generated
	*/
	public boolean canExecute() {
		if (false == getElementToEdit() instanceof ContainmentJJD) {
			return false;
		}
		if (reorientDirection == ReorientRelationshipRequest.REORIENT_SOURCE) {
			return canReorientSource();
		}
		if (reorientDirection == ReorientRelationshipRequest.REORIENT_TARGET) {
			return canReorientTarget();
		}
		return false;
	}

	/**
	* @generated
	*/
	protected boolean canReorientSource() {
		if (!(oldEnd instanceof ClassJJD && newEnd instanceof ClassJJD)) {
			return false;
		}
		ClassJJD target = getLink().getTarget();
		if (!(getLink().eContainer() instanceof ClassDiagramJJD)) {
			return false;
		}
		ClassDiagramJJD container = (ClassDiagramJJD) getLink().eContainer();
		return ConcreteBaseItemSemanticEditPolicy.getLinkConstraints().canExistContainmentJJD_4003(container, getLink(),
				getNewSource(), target);
	}

	/**
	* @generated
	*/
	protected boolean canReorientTarget() {
		if (!(oldEnd instanceof ClassJJD && newEnd instanceof ClassJJD)) {
			return false;
		}
		ClassJJD source = getLink().getSource();
		if (!(getLink().eContainer() instanceof ClassDiagramJJD)) {
			return false;
		}
		ClassDiagramJJD container = (ClassDiagramJJD) getLink().eContainer();
		return ConcreteBaseItemSemanticEditPolicy.getLinkConstraints().canExistContainmentJJD_4003(container, getLink(),
				source, getNewTarget());
	}

	/**
	* @generated
	*/
	protected CommandResult doExecuteWithResult(IProgressMonitor monitor, IAdaptable info) throws ExecutionException {
		if (!canExecute()) {
			throw new ExecutionException("Invalid arguments in reorient link command"); //$NON-NLS-1$
		}
		if (reorientDirection == ReorientRelationshipRequest.REORIENT_SOURCE) {
			return reorientSource();
		}
		if (reorientDirection == ReorientRelationshipRequest.REORIENT_TARGET) {
			return reorientTarget();
		}
		throw new IllegalStateException();
	}

	/**
	* @generated
	*/
	protected CommandResult reorientSource() throws ExecutionException {
		getLink().setSource(getNewSource());
		return CommandResult.newOKCommandResult(getLink());
	}

	/**
	* @generated
	*/
	protected CommandResult reorientTarget() throws ExecutionException {
		getLink().setTarget(getNewTarget());
		return CommandResult.newOKCommandResult(getLink());
	}

	/**
	* @generated
	*/
	protected ContainmentJJD getLink() {
		return (ContainmentJJD) getElementToEdit();
	}

	/**
	* @generated
	*/
	protected ClassJJD getOldSource() {
		return (ClassJJD) oldEnd;
	}

	/**
	* @generated
	*/
	protected ClassJJD getNewSource() {
		return (ClassJJD) newEnd;
	}

	/**
	* @generated
	*/
	protected ClassJJD getOldTarget() {
		return (ClassJJD) oldEnd;
	}

	/**
	* @generated
	*/
	protected ClassJJD getNewTarget() {
		return (ClassJJD) newEnd;
	}
}
