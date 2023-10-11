package uidiagram.diagram.edit.policies;


import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.gef.EditPart;
import org.eclipse.gef.Request;
import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.OpenEditPolicy;
import org.eclipse.swt.widgets.Shell;

import generatorcode.views.DialogTableView;
import uidiagram.Table;
import uidiagram.diagram.edit.parts.Table2EditPart;
import uidiagram.diagram.edit.parts.Table3EditPart;
import uidiagram.diagram.edit.parts.Table4EditPart;
import uidiagram.diagram.edit.parts.Table5EditPart;
import uidiagram.diagram.edit.parts.TableEditPart;
import uidiagram.diagram.edit.parts.TableName2EditPart;
import uidiagram.diagram.edit.parts.TableName3EditPart;
import uidiagram.diagram.edit.parts.TableName4EditPart;
import uidiagram.diagram.edit.parts.TableName5EditPart;
import uidiagram.diagram.edit.parts.TableNameEditPart;

public class OpenTableEditPolicy extends OpenEditPolicy {
	
	protected Command getOpenCommand(Request request) {
		return new Command("Test double-click") {
			public void execute() {
				
				EditPart edipart = getHost();

				if (edipart instanceof TableNameEditPart) {
					if (edipart.getParent() instanceof TableEditPart) {
						edipart = edipart.getParent();
					}
				}
				if (edipart instanceof TableEditPart) {
					Table table = (Table) ((TableEditPart) edipart).resolveSemanticElement();
					TransactionalEditingDomain domain = ((TableEditPart) edipart).getEditingDomain();

					openDialog(table, domain);

				}
				
				if (edipart instanceof TableName2EditPart) {
					if (edipart.getParent() instanceof Table2EditPart) {
						edipart = edipart.getParent();
					}
				}
				if (edipart instanceof Table2EditPart) {
					Table table = (Table) ((Table2EditPart) edipart).resolveSemanticElement();
					TransactionalEditingDomain domain = ((Table2EditPart) edipart).getEditingDomain();
					
					openDialog(table, domain);
					
				}
				
				if (edipart instanceof TableName3EditPart) {
					if (edipart.getParent() instanceof Table3EditPart) {
						edipart = edipart.getParent();
					}
				}
				if (edipart instanceof Table3EditPart) {
					Table table = (Table) ((Table3EditPart) edipart).resolveSemanticElement();
					TransactionalEditingDomain domain = ((Table3EditPart) edipart).getEditingDomain();
					
					openDialog(table, domain);
					
				}
				
				if (edipart instanceof TableName4EditPart) {
					if (edipart.getParent() instanceof Table4EditPart) {
						edipart = edipart.getParent();
					}
				}
				if (edipart instanceof Table4EditPart) {
					Table table = (Table) ((Table4EditPart) edipart).resolveSemanticElement();
					TransactionalEditingDomain domain = ((Table4EditPart) edipart).getEditingDomain();
					
					openDialog(table, domain);
					
				}
				
				if (edipart instanceof TableName5EditPart) {
					if (edipart.getParent() instanceof Table5EditPart) {
						edipart = edipart.getParent();
					}
				}
				if (edipart instanceof Table5EditPart) {
					Table table = (Table) ((Table5EditPart) edipart).resolveSemanticElement();
					TransactionalEditingDomain domain = ((Table5EditPart) edipart).getEditingDomain();
					
					openDialog(table, domain);
					
				}

			}
		};
	}
	
	private void openDialog(Table table, TransactionalEditingDomain domain) {
		Shell parentShell = new Shell();
		DialogTableView dialogClass = new DialogTableView(parentShell, table, domain);
		dialogClass.open();
		parentShell.setSize(600, 600);
	}


}