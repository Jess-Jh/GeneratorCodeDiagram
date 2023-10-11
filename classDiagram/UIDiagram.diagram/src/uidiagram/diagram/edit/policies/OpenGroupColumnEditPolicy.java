package uidiagram.diagram.edit.policies;


import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.gef.EditPart;
import org.eclipse.gef.Request;
import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.OpenEditPolicy;
import org.eclipse.swt.widgets.Shell;

import generatorcode.views.DialogGroupColumnView;
import uidiagram.GroupColumn;
import uidiagram.diagram.edit.parts.GroupColumn2EditPart;
import uidiagram.diagram.edit.parts.GroupColumn3EditPart;
import uidiagram.diagram.edit.parts.GroupColumn4EditPart;
import uidiagram.diagram.edit.parts.GroupColumn5EditPart;
import uidiagram.diagram.edit.parts.GroupColumnEditPart;
import uidiagram.diagram.edit.parts.GroupColumnName2EditPart;
import uidiagram.diagram.edit.parts.GroupColumnName3EditPart;
import uidiagram.diagram.edit.parts.GroupColumnName4EditPart;
import uidiagram.diagram.edit.parts.GroupColumnName5EditPart;
import uidiagram.diagram.edit.parts.GroupColumnNameEditPart;


public class OpenGroupColumnEditPolicy extends OpenEditPolicy {
	
	protected Command getOpenCommand(Request request) {
		return new Command("Test double-click") {
			public void execute() {
				
				EditPart edipart = getHost();

				if (edipart instanceof GroupColumnNameEditPart) {
					if (edipart.getParent() instanceof GroupColumnEditPart) {
						edipart = edipart.getParent();
					}
				}
				if (edipart instanceof GroupColumnEditPart) {
					GroupColumn groupColumn = (GroupColumn) ((GroupColumnEditPart) edipart).resolveSemanticElement();
					TransactionalEditingDomain domain = ((GroupColumnEditPart) edipart).getEditingDomain();

					openDialog(groupColumn, domain);

				}
				
				if (edipart instanceof GroupColumnName2EditPart) {
					if (edipart.getParent() instanceof GroupColumn2EditPart) {
						edipart = edipart.getParent();
					}
				}
				if (edipart instanceof GroupColumn2EditPart) {
					GroupColumn groupColumn = (GroupColumn) ((GroupColumn2EditPart) edipart).resolveSemanticElement();
					TransactionalEditingDomain domain = ((GroupColumn2EditPart) edipart).getEditingDomain();
					
					openDialog(groupColumn, domain);
					
				}
				
				if (edipart instanceof GroupColumnName3EditPart) {
					if (edipart.getParent() instanceof GroupColumn3EditPart) {
						edipart = edipart.getParent();
					}
				}
				if (edipart instanceof GroupColumn3EditPart) {
					GroupColumn groupColumn = (GroupColumn) ((GroupColumn3EditPart) edipart).resolveSemanticElement();
					TransactionalEditingDomain domain = ((GroupColumn3EditPart) edipart).getEditingDomain();
					
					openDialog(groupColumn, domain);
					
				}
				
				if (edipart instanceof GroupColumnName4EditPart) {
					if (edipart.getParent() instanceof GroupColumn4EditPart) {
						edipart = edipart.getParent();
					}
				}
				if (edipart instanceof GroupColumn4EditPart) {
					GroupColumn groupColumn = (GroupColumn) ((GroupColumn4EditPart) edipart).resolveSemanticElement();
					TransactionalEditingDomain domain = ((GroupColumn4EditPart) edipart).getEditingDomain();
					
					openDialog(groupColumn, domain);
					
				}
				
				if (edipart instanceof GroupColumnName5EditPart) {
					if (edipart.getParent() instanceof GroupColumn5EditPart) {
						edipart = edipart.getParent();
					}
				}
				if (edipart instanceof GroupColumn5EditPart) {
					GroupColumn groupColumn = (GroupColumn) ((GroupColumn5EditPart) edipart).resolveSemanticElement();
					TransactionalEditingDomain domain = ((GroupColumn5EditPart) edipart).getEditingDomain();
					
					openDialog(groupColumn, domain);
					
				}

			}
		};
	}
	
	private void openDialog(GroupColumn groupColumn, TransactionalEditingDomain domain) {
		Shell parentShell = new Shell();
		DialogGroupColumnView dialogClass = new DialogGroupColumnView(parentShell, groupColumn, domain);
		dialogClass.open();
		parentShell.setSize(600, 600);
	}


}