package uidiagram.diagram.edit.policies;

import generatorcode.views.DialogButtonView;
import generatorcode.views.DialogLabelView;
import uidiagram.Button;
import uidiagram.diagram.edit.parts.Button2EditPart;
import uidiagram.diagram.edit.parts.Button3EditPart;
import uidiagram.diagram.edit.parts.Button4EditPart;
import uidiagram.diagram.edit.parts.Button5EditPart;
import uidiagram.diagram.edit.parts.Button6EditPart;
import uidiagram.diagram.edit.parts.Button7EditPart;
import uidiagram.diagram.edit.parts.ButtonEditPart;
import uidiagram.diagram.edit.parts.ButtonName2EditPart;
import uidiagram.diagram.edit.parts.ButtonName3EditPart;
import uidiagram.diagram.edit.parts.ButtonName4EditPart;
import uidiagram.diagram.edit.parts.ButtonName5EditPart;
import uidiagram.diagram.edit.parts.ButtonName6EditPart;
import uidiagram.diagram.edit.parts.ButtonName7EditPart;
import uidiagram.diagram.edit.parts.ButtonNameEditPart;

import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.gef.EditPart;
import org.eclipse.gef.Request;
import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.OpenEditPolicy;
import org.eclipse.swt.widgets.Shell;


public class OpenButtonEditPolicy extends OpenEditPolicy {
	
	protected Command getOpenCommand(Request request) {
		return new Command("Test double-click") {
			public void execute() {
				
				EditPart edipart = getHost();

				if (edipart instanceof ButtonNameEditPart) {
					if (edipart.getParent() instanceof ButtonEditPart) {
						edipart = edipart.getParent();
					}
				}
				if (edipart instanceof ButtonEditPart) {
					Button button = (Button) ((ButtonEditPart) edipart).resolveSemanticElement();
					TransactionalEditingDomain domain = ((ButtonEditPart) edipart).getEditingDomain();

					openDialog(button, domain);

				}
				
				if (edipart instanceof ButtonName2EditPart) {
					if (edipart.getParent() instanceof Button2EditPart) {
						edipart = edipart.getParent();
					}
				}
				if (edipart instanceof Button2EditPart) {
					Button button = (Button) ((Button2EditPart) edipart).resolveSemanticElement();
					TransactionalEditingDomain domain = ((Button2EditPart) edipart).getEditingDomain();
					
					openDialog(button, domain);
					
				}
				
				if (edipart instanceof ButtonName3EditPart) {
					if (edipart.getParent() instanceof Button3EditPart) {
						edipart = edipart.getParent();
					}
				}
				if (edipart instanceof Button3EditPart) {
					Button button = (Button) ((Button3EditPart) edipart).resolveSemanticElement();
					TransactionalEditingDomain domain = ((Button3EditPart) edipart).getEditingDomain();
					
					openDialog(button, domain);
					
				}
				
				if (edipart instanceof ButtonName4EditPart) {
					if (edipart.getParent() instanceof Button4EditPart) {
						edipart = edipart.getParent();
					}
				}
				if (edipart instanceof Button4EditPart) {
					Button button = (Button) ((Button4EditPart) edipart).resolveSemanticElement();
					TransactionalEditingDomain domain = ((Button4EditPart) edipart).getEditingDomain();
					
					openDialog(button, domain);
					
				}
				
				if (edipart instanceof ButtonName5EditPart) {
					if (edipart.getParent() instanceof Button5EditPart) {
						edipart = edipart.getParent();
					}
				}
				if (edipart instanceof Button5EditPart) {
					Button button = (Button) ((Button5EditPart) edipart).resolveSemanticElement();
					TransactionalEditingDomain domain = ((Button5EditPart) edipart).getEditingDomain();
					
					openDialog(button, domain);
					
				}
				
				if (edipart instanceof ButtonName6EditPart) {
					if (edipart.getParent() instanceof Button6EditPart) {
						edipart = edipart.getParent();
					}
				}
				if (edipart instanceof Button6EditPart) {
					Button button = (Button) ((Button6EditPart) edipart).resolveSemanticElement();
					TransactionalEditingDomain domain = ((Button6EditPart) edipart).getEditingDomain();
					
					openDialog(button, domain);
					
				}
				
				if (edipart instanceof ButtonName7EditPart) {
					if (edipart.getParent() instanceof Button7EditPart) {
						edipart = edipart.getParent();
					}
				}
				if (edipart instanceof Button7EditPart) {
					Button button = (Button) ((Button7EditPart) edipart).resolveSemanticElement();
					TransactionalEditingDomain domain = ((Button7EditPart) edipart).getEditingDomain();
					
					openDialog(button, domain);
					
				}
			}
		};
	}
	
	private void openDialog(Button button, TransactionalEditingDomain domain) {
		Shell parentShell = new Shell();
		DialogButtonView dialogClass = new DialogButtonView(parentShell, button, domain);
		dialogClass.open();
		parentShell.setSize(600, 600);
	}

}