package uidiagram.diagram.edit.policies;

import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.gef.EditPart;
import org.eclipse.gef.Request;
import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.OpenEditPolicy;
import org.eclipse.swt.widgets.Shell;

import generatorcode.views.DialogListView;
import uidiagram.ListView;
import uidiagram.diagram.edit.parts.ListView2EditPart;
import uidiagram.diagram.edit.parts.ListView3EditPart;
import uidiagram.diagram.edit.parts.ListView4EditPart;
import uidiagram.diagram.edit.parts.ListView5EditPart;
import uidiagram.diagram.edit.parts.ListViewEditPart;
import uidiagram.diagram.edit.parts.ListViewName2EditPart;
import uidiagram.diagram.edit.parts.ListViewName3EditPart;
import uidiagram.diagram.edit.parts.ListViewName4EditPart;
import uidiagram.diagram.edit.parts.ListViewName5EditPart;
import uidiagram.diagram.edit.parts.ListViewNameEditPart;

public class OpenListViewEditPolicy extends OpenEditPolicy {
	
	protected Command getOpenCommand(Request request) {
		return new Command("Test double-click") {
			public void execute() {
				
				EditPart edipart = getHost();

				if (edipart instanceof ListViewNameEditPart) {
					if (edipart.getParent() instanceof ListViewEditPart) {
						edipart = edipart.getParent();
					}
				}
				if (edipart instanceof ListViewEditPart) {
					ListView listView = (ListView) ((ListViewEditPart) edipart).resolveSemanticElement();
					TransactionalEditingDomain domain = ((ListViewEditPart) edipart).getEditingDomain();

					openDialog(listView, domain);

				}
				
				if (edipart instanceof ListViewName2EditPart) {
					if (edipart.getParent() instanceof ListView2EditPart) {
						edipart = edipart.getParent();
					}
				}
				if (edipart instanceof ListView2EditPart) {
					ListView listView = (ListView) ((ListView2EditPart) edipart).resolveSemanticElement();
					TransactionalEditingDomain domain = ((ListView2EditPart) edipart).getEditingDomain();
					
					openDialog(listView, domain);
					
				}
				
				if (edipart instanceof ListViewName3EditPart) {
					if (edipart.getParent() instanceof ListView3EditPart) {
						edipart = edipart.getParent();
					}
				}
				if (edipart instanceof ListView3EditPart) {
					ListView listView = (ListView) ((ListView3EditPart) edipart).resolveSemanticElement();
					TransactionalEditingDomain domain = ((ListView3EditPart) edipart).getEditingDomain();
					
					openDialog(listView, domain);
					
				}
				
				if (edipart instanceof ListViewName4EditPart) {
					if (edipart.getParent() instanceof ListView4EditPart) {
						edipart = edipart.getParent();
					}
				}
				if (edipart instanceof ListView4EditPart) {
					ListView listView = (ListView) ((ListView4EditPart) edipart).resolveSemanticElement();
					TransactionalEditingDomain domain = ((ListView4EditPart) edipart).getEditingDomain();
					
					openDialog(listView, domain);
					
				}
				
				if (edipart instanceof ListViewName5EditPart) {
					if (edipart.getParent() instanceof ListView5EditPart) {
						edipart = edipart.getParent();
					}
				}
				if (edipart instanceof ListView5EditPart) {
					ListView listView = (ListView) ((ListView5EditPart) edipart).resolveSemanticElement();
					TransactionalEditingDomain domain = ((ListView5EditPart) edipart).getEditingDomain();
					
					openDialog(listView, domain);
					
				}

			}
		};
	}
	
	private void openDialog(ListView listView, TransactionalEditingDomain domain) {
		Shell parentShell = new Shell();
		DialogListView dialogClass = new DialogListView(parentShell, listView, domain);
		dialogClass.open();
		parentShell.setSize(600, 600);
	}


}