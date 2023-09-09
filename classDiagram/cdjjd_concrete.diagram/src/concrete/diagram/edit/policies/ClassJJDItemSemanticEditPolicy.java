/*
* 
*/
package concrete.diagram.edit.policies;

import java.util.Iterator;

import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.common.core.command.ICompositeCommand;
import org.eclipse.gmf.runtime.diagram.core.commands.DeleteCommand;
import org.eclipse.gmf.runtime.emf.commands.core.command.CompositeTransactionalCommand;
import org.eclipse.gmf.runtime.emf.type.core.commands.DestroyElementCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateRelationshipRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.DestroyElementRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.ReorientRelationshipRequest;
import org.eclipse.gmf.runtime.notation.Edge;
import org.eclipse.gmf.runtime.notation.Node;
import org.eclipse.gmf.runtime.notation.View;

import concrete.diagram.edit.commands.AgregationJJDCreateCommand;
import concrete.diagram.edit.commands.AgregationJJDReorientCommand;
import concrete.diagram.edit.commands.AssociationJJDCreateCommand;
import concrete.diagram.edit.commands.AssociationJJDReorientCommand;
import concrete.diagram.edit.commands.ContainmentJJDCreateCommand;
import concrete.diagram.edit.commands.ContainmentJJDReorientCommand;
import concrete.diagram.edit.commands.ImplementJJDCreateCommand;
import concrete.diagram.edit.commands.ImplementJJDReorientCommand;
import concrete.diagram.edit.commands.InheritanceJJDCreateCommand;
import concrete.diagram.edit.commands.InheritanceJJDReorientCommand;
import concrete.diagram.edit.parts.AgregationJJDEditPart;
import concrete.diagram.edit.parts.AssociationJJDEditPart;
import concrete.diagram.edit.parts.AttributeJJDEditPart;
import concrete.diagram.edit.parts.ClassJJDClassJJDListAttributesJJDCompartment2EditPart;
import concrete.diagram.edit.parts.ClassJJDClassJJDListMethodsJJDCompartment2EditPart;
import concrete.diagram.edit.parts.ContainmentJJDEditPart;
import concrete.diagram.edit.parts.ImplementJJDEditPart;
import concrete.diagram.edit.parts.InheritanceJJDEditPart;
import concrete.diagram.edit.parts.MethodJJDEditPart;
import concrete.diagram.part.ConcreteVisualIDRegistry;
import concrete.diagram.providers.ConcreteElementTypes;

/**
 * @generated
 */
public class ClassJJDItemSemanticEditPolicy extends ConcreteBaseItemSemanticEditPolicy {

	/**
	* @generated
	*/
	public ClassJJDItemSemanticEditPolicy() {
		super(ConcreteElementTypes.ClassJJD_2002);
	}

	/**
	* @generated
	*/
	protected Command getDestroyElementCommand(DestroyElementRequest req) {
		View view = (View) getHost().getModel();
		CompositeTransactionalCommand cmd = new CompositeTransactionalCommand(getEditingDomain(), null);
		cmd.setTransactionNestingEnabled(false);
		for (Iterator<?> it = view.getTargetEdges().iterator(); it.hasNext();) {
			Edge incomingLink = (Edge) it.next();
			if (ConcreteVisualIDRegistry.getVisualID(incomingLink) == AgregationJJDEditPart.VISUAL_ID) {
				DestroyElementRequest r = new DestroyElementRequest(incomingLink.getElement(), false);
				cmd.add(new DestroyElementCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), incomingLink));
				continue;
			}
			if (ConcreteVisualIDRegistry.getVisualID(incomingLink) == InheritanceJJDEditPart.VISUAL_ID) {
				DestroyElementRequest r = new DestroyElementRequest(incomingLink.getElement(), false);
				cmd.add(new DestroyElementCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), incomingLink));
				continue;
			}
			if (ConcreteVisualIDRegistry.getVisualID(incomingLink) == ContainmentJJDEditPart.VISUAL_ID) {
				DestroyElementRequest r = new DestroyElementRequest(incomingLink.getElement(), false);
				cmd.add(new DestroyElementCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), incomingLink));
				continue;
			}
			if (ConcreteVisualIDRegistry.getVisualID(incomingLink) == AssociationJJDEditPart.VISUAL_ID) {
				DestroyElementRequest r = new DestroyElementRequest(incomingLink.getElement(), false);
				cmd.add(new DestroyElementCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), incomingLink));
				continue;
			}
			if (ConcreteVisualIDRegistry.getVisualID(incomingLink) == ImplementJJDEditPart.VISUAL_ID) {
				DestroyElementRequest r = new DestroyElementRequest(incomingLink.getElement(), false);
				cmd.add(new DestroyElementCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), incomingLink));
				continue;
			}
		}
		for (Iterator<?> it = view.getSourceEdges().iterator(); it.hasNext();) {
			Edge outgoingLink = (Edge) it.next();
			if (ConcreteVisualIDRegistry.getVisualID(outgoingLink) == AgregationJJDEditPart.VISUAL_ID) {
				DestroyElementRequest r = new DestroyElementRequest(outgoingLink.getElement(), false);
				cmd.add(new DestroyElementCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), outgoingLink));
				continue;
			}
			if (ConcreteVisualIDRegistry.getVisualID(outgoingLink) == InheritanceJJDEditPart.VISUAL_ID) {
				DestroyElementRequest r = new DestroyElementRequest(outgoingLink.getElement(), false);
				cmd.add(new DestroyElementCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), outgoingLink));
				continue;
			}
			if (ConcreteVisualIDRegistry.getVisualID(outgoingLink) == ContainmentJJDEditPart.VISUAL_ID) {
				DestroyElementRequest r = new DestroyElementRequest(outgoingLink.getElement(), false);
				cmd.add(new DestroyElementCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), outgoingLink));
				continue;
			}
			if (ConcreteVisualIDRegistry.getVisualID(outgoingLink) == AssociationJJDEditPart.VISUAL_ID) {
				DestroyElementRequest r = new DestroyElementRequest(outgoingLink.getElement(), false);
				cmd.add(new DestroyElementCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), outgoingLink));
				continue;
			}
			if (ConcreteVisualIDRegistry.getVisualID(outgoingLink) == ImplementJJDEditPart.VISUAL_ID) {
				DestroyElementRequest r = new DestroyElementRequest(outgoingLink.getElement(), false);
				cmd.add(new DestroyElementCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), outgoingLink));
				continue;
			}
		}
		EAnnotation annotation = view.getEAnnotation("Shortcut"); //$NON-NLS-1$
		if (annotation == null) {
			// there are indirectly referenced children, need extra commands: false
			addDestroyChildNodesCommand(cmd);
			addDestroyShortcutsCommand(cmd, view);
			// delete host element
			cmd.add(new DestroyElementCommand(req));
		} else {
			cmd.add(new DeleteCommand(getEditingDomain(), view));
		}
		return getGEFWrapper(cmd.reduce());
	}

	/**
	* @generated
	*/
	private void addDestroyChildNodesCommand(ICompositeCommand cmd) {
		View view = (View) getHost().getModel();
		for (Iterator<?> nit = view.getChildren().iterator(); nit.hasNext();) {
			Node node = (Node) nit.next();
			switch (ConcreteVisualIDRegistry.getVisualID(node)) {
			case ClassJJDClassJJDListAttributesJJDCompartment2EditPart.VISUAL_ID:
				for (Iterator<?> cit = node.getChildren().iterator(); cit.hasNext();) {
					Node cnode = (Node) cit.next();
					switch (ConcreteVisualIDRegistry.getVisualID(cnode)) {
					case AttributeJJDEditPart.VISUAL_ID:
						cmd.add(new DestroyElementCommand(
								new DestroyElementRequest(getEditingDomain(), cnode.getElement(), false))); // directlyOwned: true
						// don't need explicit deletion of cnode as parent's view deletion would clean child views as well 
						// cmd.add(new org.eclipse.gmf.runtime.diagram.core.commands.DeleteCommand(getEditingDomain(), cnode));
						break;
					}
				}
				break;
			case ClassJJDClassJJDListMethodsJJDCompartment2EditPart.VISUAL_ID:
				for (Iterator<?> cit = node.getChildren().iterator(); cit.hasNext();) {
					Node cnode = (Node) cit.next();
					switch (ConcreteVisualIDRegistry.getVisualID(cnode)) {
					case MethodJJDEditPart.VISUAL_ID:
						cmd.add(new DestroyElementCommand(
								new DestroyElementRequest(getEditingDomain(), cnode.getElement(), false))); // directlyOwned: true
						// don't need explicit deletion of cnode as parent's view deletion would clean child views as well 
						// cmd.add(new org.eclipse.gmf.runtime.diagram.core.commands.DeleteCommand(getEditingDomain(), cnode));
						break;
					}
				}
				break;
			}
		}
	}

	/**
	 * @generated
	 */
	protected Command getCreateRelationshipCommand(CreateRelationshipRequest req) {
		Command command = req.getTarget() == null ? getStartCreateRelationshipCommand(req)
				: getCompleteCreateRelationshipCommand(req);
		return command != null ? command : super.getCreateRelationshipCommand(req);
	}

	/**
	 * @generated
	 */
	protected Command getStartCreateRelationshipCommand(CreateRelationshipRequest req) {
		if (ConcreteElementTypes.AgregationJJD_4001 == req.getElementType()) {
			return getGEFWrapper(new AgregationJJDCreateCommand(req, req.getSource(), req.getTarget()));
		}
		if (ConcreteElementTypes.InheritanceJJD_4002 == req.getElementType()) {
			return getGEFWrapper(new InheritanceJJDCreateCommand(req, req.getSource(), req.getTarget()));
		}
		if (ConcreteElementTypes.ContainmentJJD_4003 == req.getElementType()) {
			return getGEFWrapper(new ContainmentJJDCreateCommand(req, req.getSource(), req.getTarget()));
		}
		if (ConcreteElementTypes.AssociationJJD_4004 == req.getElementType()) {
			return getGEFWrapper(new AssociationJJDCreateCommand(req, req.getSource(), req.getTarget()));
		}
		if (ConcreteElementTypes.ImplementJJD_4005 == req.getElementType()) {
			return getGEFWrapper(new ImplementJJDCreateCommand(req, req.getSource(), req.getTarget()));
		}
		return null;
	}

	/**
	 * @generated
	 */
	protected Command getCompleteCreateRelationshipCommand(CreateRelationshipRequest req) {
		if (ConcreteElementTypes.AgregationJJD_4001 == req.getElementType()) {
			return getGEFWrapper(new AgregationJJDCreateCommand(req, req.getSource(), req.getTarget()));
		}
		if (ConcreteElementTypes.InheritanceJJD_4002 == req.getElementType()) {
			return getGEFWrapper(new InheritanceJJDCreateCommand(req, req.getSource(), req.getTarget()));
		}
		if (ConcreteElementTypes.ContainmentJJD_4003 == req.getElementType()) {
			return getGEFWrapper(new ContainmentJJDCreateCommand(req, req.getSource(), req.getTarget()));
		}
		if (ConcreteElementTypes.AssociationJJD_4004 == req.getElementType()) {
			return getGEFWrapper(new AssociationJJDCreateCommand(req, req.getSource(), req.getTarget()));
		}
		if (ConcreteElementTypes.ImplementJJD_4005 == req.getElementType()) {
			return getGEFWrapper(new ImplementJJDCreateCommand(req, req.getSource(), req.getTarget()));
		}
		return null;
	}

	/**
	 * Returns command to reorient EClass based link. New link target or source
	 * should be the domain model element associated with this node.
	 * 
	 * @generated
	 */
	protected Command getReorientRelationshipCommand(ReorientRelationshipRequest req) {
		switch (getVisualID(req)) {
		case AgregationJJDEditPart.VISUAL_ID:
			return getGEFWrapper(new AgregationJJDReorientCommand(req));
		case InheritanceJJDEditPart.VISUAL_ID:
			return getGEFWrapper(new InheritanceJJDReorientCommand(req));
		case ContainmentJJDEditPart.VISUAL_ID:
			return getGEFWrapper(new ContainmentJJDReorientCommand(req));
		case AssociationJJDEditPart.VISUAL_ID:
			return getGEFWrapper(new AssociationJJDReorientCommand(req));
		case ImplementJJDEditPart.VISUAL_ID:
			return getGEFWrapper(new ImplementJJDReorientCommand(req));
		}
		return super.getReorientRelationshipCommand(req);
	}

}
