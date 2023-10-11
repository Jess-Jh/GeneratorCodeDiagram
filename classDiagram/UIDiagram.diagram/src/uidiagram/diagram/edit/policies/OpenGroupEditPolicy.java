package uidiagram.diagram.edit.policies;


import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.gef.EditPart;
import org.eclipse.gef.Request;
import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.diagram.ui.editparts.GroupEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.OpenEditPolicy;
import org.eclipse.swt.widgets.Shell;

import generatorcode.views.DialogGroupView;
import uidiagram.Group;
import uidiagram.diagram.edit.parts.Group2EditPart;
import uidiagram.diagram.edit.parts.Group3EditPart;
import uidiagram.diagram.edit.parts.Group4EditPart;
import uidiagram.diagram.edit.parts.Group5EditPart;
import uidiagram.diagram.edit.parts.GroupName2EditPart;
import uidiagram.diagram.edit.parts.GroupName3EditPart;
import uidiagram.diagram.edit.parts.GroupName4EditPart;
import uidiagram.diagram.edit.parts.GroupName5EditPart;
import uidiagram.diagram.edit.parts.GroupNameEditPart;


public class OpenGroupEditPolicy extends OpenEditPolicy {
	
	protected Command getOpenCommand(Request request) {
		return new Command("Test double-click") {
			public void execute() {
				
				EditPart edipart = getHost();

				if (edipart instanceof GroupNameEditPart) {
					if (edipart.getParent() instanceof GroupEditPart) {
						edipart = edipart.getParent();
					}
				}
				if (edipart instanceof GroupEditPart) {
					Group group = (Group) ((GroupEditPart) edipart).resolveSemanticElement();
					TransactionalEditingDomain domain = ((GroupEditPart) edipart).getEditingDomain();

					openDialog(group, domain);

				}
				
				if (edipart instanceof GroupName2EditPart) {
					if (edipart.getParent() instanceof Group2EditPart) {
						edipart = edipart.getParent();
					}
				}
				if (edipart instanceof Group2EditPart) {
					Group group = (Group) ((Group2EditPart) edipart).resolveSemanticElement();
					TransactionalEditingDomain domain = ((Group2EditPart) edipart).getEditingDomain();
					
					openDialog(group, domain);
					
				}
				
				if (edipart instanceof GroupName3EditPart) {
					if (edipart.getParent() instanceof Group3EditPart) {
						edipart = edipart.getParent();
					}
				}
				if (edipart instanceof Group3EditPart) {
					Group group = (Group) ((Group3EditPart) edipart).resolveSemanticElement();
					TransactionalEditingDomain domain = ((Group3EditPart) edipart).getEditingDomain();
					
					openDialog(group, domain);
					
				}
				
				if (edipart instanceof GroupName4EditPart) {
					if (edipart.getParent() instanceof Group4EditPart) {
						edipart = edipart.getParent();
					}
				}
				if (edipart instanceof Group4EditPart) {
					Group group = (Group) ((Group4EditPart) edipart).resolveSemanticElement();
					TransactionalEditingDomain domain = ((Group4EditPart) edipart).getEditingDomain();
					
					openDialog(group, domain);
					
				}
				
				if (edipart instanceof GroupName5EditPart) {
					if (edipart.getParent() instanceof Group5EditPart) {
						edipart = edipart.getParent();
					}
				}
				if (edipart instanceof Group5EditPart) {
					Group group = (Group) ((Group5EditPart) edipart).resolveSemanticElement();
					TransactionalEditingDomain domain = ((Group5EditPart) edipart).getEditingDomain();
					
					openDialog(group, domain);
					
				}

			}
		};
	}
	
	private void openDialog(Group group, TransactionalEditingDomain domain) {
		Shell parentShell = new Shell();
		DialogGroupView dialogClass = new DialogGroupView(parentShell, group, domain);
		dialogClass.open();
		parentShell.setSize(600, 600);
	}


}