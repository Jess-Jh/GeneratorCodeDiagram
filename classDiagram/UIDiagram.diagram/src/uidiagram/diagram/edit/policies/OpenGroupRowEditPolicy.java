package uidiagram.diagram.edit.policies;


import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.gef.EditPart;
import org.eclipse.gef.Request;
import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.OpenEditPolicy;
import org.eclipse.swt.widgets.Shell;

import generatorcode.views.DialogGroupRowView;
import uidiagram.GroupRow;
import uidiagram.diagram.edit.parts.GroupRow2EditPart;
import uidiagram.diagram.edit.parts.GroupRow3EditPart;
import uidiagram.diagram.edit.parts.GroupRow4EditPart;
import uidiagram.diagram.edit.parts.GroupRow5EditPart;
import uidiagram.diagram.edit.parts.GroupRowEditPart;
import uidiagram.diagram.edit.parts.GroupRowName2EditPart;
import uidiagram.diagram.edit.parts.GroupRowName3EditPart;
import uidiagram.diagram.edit.parts.GroupRowName4EditPart;
import uidiagram.diagram.edit.parts.GroupRowName5EditPart;
import uidiagram.diagram.edit.parts.GroupRowNameEditPart;


public class OpenGroupRowEditPolicy extends OpenEditPolicy {
	
	protected Command getOpenCommand(Request request) {
		return new Command("Test double-click") {
			public void execute() {
				
				EditPart edipart = getHost();

				if (edipart instanceof GroupRowNameEditPart) {
					if (edipart.getParent() instanceof GroupRowEditPart) {
						edipart = edipart.getParent();
					}
				}
				if (edipart instanceof GroupRowEditPart) {
					GroupRow groupRow = (GroupRow) ((GroupRowEditPart) edipart).resolveSemanticElement();
					TransactionalEditingDomain domain = ((GroupRowEditPart) edipart).getEditingDomain();

					openDialog(groupRow, domain);

				}
				
				if (edipart instanceof GroupRowName2EditPart) {
					if (edipart.getParent() instanceof GroupRow2EditPart) {
						edipart = edipart.getParent();
					}
				}
				if (edipart instanceof GroupRow2EditPart) {
					GroupRow groupRow = (GroupRow) ((GroupRow2EditPart) edipart).resolveSemanticElement();
					TransactionalEditingDomain domain = ((GroupRow2EditPart) edipart).getEditingDomain();
					
					openDialog(groupRow, domain);
					
				}
				
				if (edipart instanceof GroupRowName3EditPart) {
					if (edipart.getParent() instanceof GroupRow3EditPart) {
						edipart = edipart.getParent();
					}
				}
				if (edipart instanceof GroupRow3EditPart) {
					GroupRow groupRow = (GroupRow) ((GroupRow3EditPart) edipart).resolveSemanticElement();
					TransactionalEditingDomain domain = ((GroupRow3EditPart) edipart).getEditingDomain();
					
					openDialog(groupRow, domain);
					
				}
				
				if (edipart instanceof GroupRowName4EditPart) {
					if (edipart.getParent() instanceof GroupRow4EditPart) {
						edipart = edipart.getParent();
					}
				}
				if (edipart instanceof GroupRow4EditPart) {
					GroupRow groupRow = (GroupRow) ((GroupRow4EditPart) edipart).resolveSemanticElement();
					TransactionalEditingDomain domain = ((GroupRow4EditPart) edipart).getEditingDomain();
					
					openDialog(groupRow, domain);
					
				}
				
				if (edipart instanceof GroupRowName5EditPart) {
					if (edipart.getParent() instanceof GroupRow5EditPart) {
						edipart = edipart.getParent();
					}
				}
				if (edipart instanceof GroupRow5EditPart) {
					GroupRow groupRow = (GroupRow) ((GroupRow5EditPart) edipart).resolveSemanticElement();
					TransactionalEditingDomain domain = ((GroupRow5EditPart) edipart).getEditingDomain();
					
					openDialog(groupRow, domain);
					
				}

			}
		};
	}
	
	private void openDialog(GroupRow groupRow, TransactionalEditingDomain domain) {
		Shell parentShell = new Shell();
		DialogGroupRowView dialogClass = new DialogGroupRowView(parentShell, groupRow, domain);
		dialogClass.open();
		parentShell.setSize(600, 600);
	}


}