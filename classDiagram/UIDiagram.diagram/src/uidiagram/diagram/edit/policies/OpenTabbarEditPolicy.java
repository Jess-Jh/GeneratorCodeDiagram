package uidiagram.diagram.edit.policies;


import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.gef.EditPart;
import org.eclipse.gef.Request;
import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.OpenEditPolicy;
import org.eclipse.swt.widgets.Shell;

import generatorcode.views.DialogTabbarView;
import uidiagram.Tabbar;
import uidiagram.diagram.edit.parts.Tabbar2EditPart;
import uidiagram.diagram.edit.parts.Tabbar3EditPart;
import uidiagram.diagram.edit.parts.Tabbar4EditPart;
import uidiagram.diagram.edit.parts.Tabbar5EditPart;
import uidiagram.diagram.edit.parts.TabbarEditPart;
import uidiagram.diagram.edit.parts.TabbarName2EditPart;
import uidiagram.diagram.edit.parts.TabbarName3EditPart;
import uidiagram.diagram.edit.parts.TabbarName4EditPart;
import uidiagram.diagram.edit.parts.TabbarName5EditPart;
import uidiagram.diagram.edit.parts.TabbarNameEditPart;

public class OpenTabbarEditPolicy extends OpenEditPolicy {
	
	protected Command getOpenCommand(Request request) {
		return new Command("Test double-click") {
			public void execute() {
				
				EditPart edipart = getHost();

				if (edipart instanceof TabbarNameEditPart) {
					if (edipart.getParent() instanceof TabbarEditPart) {
						edipart = edipart.getParent();
					}
				}
				if (edipart instanceof TabbarEditPart) {
					Tabbar tabbar = (Tabbar) ((TabbarEditPart) edipart).resolveSemanticElement();
					TransactionalEditingDomain domain = ((TabbarEditPart) edipart).getEditingDomain();

					openDialog(tabbar, domain);

				}
				
				if (edipart instanceof TabbarName2EditPart) {
					if (edipart.getParent() instanceof Tabbar2EditPart) {
						edipart = edipart.getParent();
					}
				}
				if (edipart instanceof Tabbar2EditPart) {
					Tabbar tabbar = (Tabbar) ((Tabbar2EditPart) edipart).resolveSemanticElement();
					TransactionalEditingDomain domain = ((Tabbar2EditPart) edipart).getEditingDomain();
					
					openDialog(tabbar, domain);
					
				}
				
				if (edipart instanceof TabbarName3EditPart) {
					if (edipart.getParent() instanceof Tabbar3EditPart) {
						edipart = edipart.getParent();
					}
				}
				if (edipart instanceof Tabbar3EditPart) {
					Tabbar tabbar = (Tabbar) ((Tabbar3EditPart) edipart).resolveSemanticElement();
					TransactionalEditingDomain domain = ((Tabbar3EditPart) edipart).getEditingDomain();
					
					openDialog(tabbar, domain);
					
				}
				
				if (edipart instanceof TabbarName4EditPart) {
					if (edipart.getParent() instanceof Tabbar4EditPart) {
						edipart = edipart.getParent();
					}
				}
				if (edipart instanceof Tabbar4EditPart) {
					Tabbar tabbar = (Tabbar) ((Tabbar4EditPart) edipart).resolveSemanticElement();
					TransactionalEditingDomain domain = ((Tabbar4EditPart) edipart).getEditingDomain();
					
					openDialog(tabbar, domain);
					
				}
				
				if (edipart instanceof TabbarName5EditPart) {
					if (edipart.getParent() instanceof Tabbar5EditPart) {
						edipart = edipart.getParent();
					}
				}
				if (edipart instanceof Tabbar5EditPart) {
					Tabbar tabbar = (Tabbar) ((Tabbar5EditPart) edipart).resolveSemanticElement();
					TransactionalEditingDomain domain = ((Tabbar5EditPart) edipart).getEditingDomain();
					
					openDialog(tabbar, domain);
					
				}

			}
		};
	}
	
	private void openDialog(Tabbar tabbar, TransactionalEditingDomain domain) {
		Shell parentShell = new Shell();
		DialogTabbarView dialogClass = new DialogTabbarView(parentShell, tabbar, domain);
		dialogClass.open();
		parentShell.setSize(600, 600);
	}


}