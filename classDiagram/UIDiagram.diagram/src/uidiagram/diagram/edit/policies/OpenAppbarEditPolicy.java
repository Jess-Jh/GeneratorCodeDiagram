package uidiagram.diagram.edit.policies;

import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.gef.EditPart;
import org.eclipse.gef.Request;
import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.OpenEditPolicy;
import org.eclipse.swt.widgets.Shell;

import generatorcode.views.DialogAppbarView;
import uidiagram.Appbar;
import uidiagram.diagram.edit.parts.Appbar2EditPart;
import uidiagram.diagram.edit.parts.Appbar3EditPart;
import uidiagram.diagram.edit.parts.Appbar4EditPart;
import uidiagram.diagram.edit.parts.Appbar5EditPart;
import uidiagram.diagram.edit.parts.AppbarEditPart;
import uidiagram.diagram.edit.parts.AppbarName2EditPart;
import uidiagram.diagram.edit.parts.AppbarName3EditPart;
import uidiagram.diagram.edit.parts.AppbarName4EditPart;
import uidiagram.diagram.edit.parts.AppbarName5EditPart;
import uidiagram.diagram.edit.parts.AppbarNameEditPart;




public class OpenAppbarEditPolicy extends OpenEditPolicy {
	
	protected Command getOpenCommand(Request request) {
		return new Command("Test double-click") {
			public void execute() {
				
				EditPart edipart = getHost();

				if (edipart instanceof AppbarNameEditPart) {
					if (edipart.getParent() instanceof AppbarEditPart) {
						edipart = edipart.getParent();
					}
				}
				if (edipart instanceof AppbarEditPart) {
					Appbar appbar = (Appbar) ((AppbarEditPart) edipart).resolveSemanticElement();
					TransactionalEditingDomain domain = ((AppbarEditPart) edipart).getEditingDomain();

					openDialog(appbar, domain);

				}
				
				if (edipart instanceof AppbarName2EditPart) {
					if (edipart.getParent() instanceof Appbar2EditPart) {
						edipart = edipart.getParent();
					}
				}
				if (edipart instanceof Appbar2EditPart) {
					Appbar appbar = (Appbar) ((Appbar2EditPart) edipart).resolveSemanticElement();
					TransactionalEditingDomain domain = ((Appbar2EditPart) edipart).getEditingDomain();
					
					openDialog(appbar, domain);
					
				}
				
				if (edipart instanceof AppbarName3EditPart) {
					if (edipart.getParent() instanceof Appbar3EditPart) {
						edipart = edipart.getParent();
					}
				}
				if (edipart instanceof Appbar3EditPart) {
					Appbar appbar = (Appbar) ((Appbar3EditPart) edipart).resolveSemanticElement();
					TransactionalEditingDomain domain = ((Appbar3EditPart) edipart).getEditingDomain();
					
					openDialog(appbar, domain);
					
				}
				
				if (edipart instanceof AppbarName4EditPart) {
					if (edipart.getParent() instanceof Appbar4EditPart) {
						edipart = edipart.getParent();
					}
				}
				if (edipart instanceof Appbar4EditPart) {
					Appbar appbar = (Appbar) ((Appbar4EditPart) edipart).resolveSemanticElement();
					TransactionalEditingDomain domain = ((Appbar4EditPart) edipart).getEditingDomain();
					
					openDialog(appbar, domain);
					
				}
				
				if (edipart instanceof AppbarName5EditPart) {
					if (edipart.getParent() instanceof Appbar5EditPart) {
						edipart = edipart.getParent();
					}
				}
				if (edipart instanceof Appbar5EditPart) {
					Appbar appbar = (Appbar) ((Appbar5EditPart) edipart).resolveSemanticElement();
					TransactionalEditingDomain domain = ((Appbar5EditPart) edipart).getEditingDomain();
					
					openDialog(appbar, domain);
					
				}
		
			}
		};
	}
	
	private void openDialog(Appbar appbar, TransactionalEditingDomain domain) {
		Shell parentShell = new Shell();
		DialogAppbarView dialogClass = new DialogAppbarView(parentShell, appbar, domain);
		dialogClass.open();
		parentShell.setSize(600, 600);
	}
	

}
