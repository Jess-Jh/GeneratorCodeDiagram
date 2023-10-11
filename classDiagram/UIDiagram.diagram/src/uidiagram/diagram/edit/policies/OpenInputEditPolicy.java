package uidiagram.diagram.edit.policies;


import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.gef.EditPart;
import org.eclipse.gef.Request;
import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.OpenEditPolicy;
import org.eclipse.swt.widgets.Shell;

import generatorcode.views.DialogInputView;
import uidiagram.Input;
import uidiagram.diagram.edit.parts.Input2EditPart;
import uidiagram.diagram.edit.parts.Input3EditPart;
import uidiagram.diagram.edit.parts.Input4EditPart;
import uidiagram.diagram.edit.parts.Input5EditPart;
import uidiagram.diagram.edit.parts.InputEditPart;
import uidiagram.diagram.edit.parts.InputName2EditPart;
import uidiagram.diagram.edit.parts.InputName3EditPart;
import uidiagram.diagram.edit.parts.InputName4EditPart;
import uidiagram.diagram.edit.parts.InputName5EditPart;
import uidiagram.diagram.edit.parts.InputNameEditPart;



public class OpenInputEditPolicy extends OpenEditPolicy {
	
	protected Command getOpenCommand(Request request) {
		return new Command("Test double-click") {
			public void execute() {
				
				EditPart edipart = getHost();

				if (edipart instanceof InputNameEditPart) {
					if (edipart.getParent() instanceof InputEditPart) {
						edipart = edipart.getParent();
					}
				}
				if (edipart instanceof InputEditPart) {
					Input input = (Input) ((InputEditPart) edipart).resolveSemanticElement();
					TransactionalEditingDomain domain = ((InputEditPart) edipart).getEditingDomain();

					openDialog(input, domain);

				}
				
				if (edipart instanceof InputName2EditPart) {
					if (edipart.getParent() instanceof Input2EditPart) {
						edipart = edipart.getParent();
					}
				}
				if (edipart instanceof Input2EditPart) {
					Input input = (Input) ((Input2EditPart) edipart).resolveSemanticElement();
					TransactionalEditingDomain domain = ((Input2EditPart) edipart).getEditingDomain();
					
					openDialog(input, domain);
					
				}
				
				if (edipart instanceof InputName3EditPart) {
					if (edipart.getParent() instanceof Input3EditPart) {
						edipart = edipart.getParent();
					}
				}
				if (edipart instanceof Input3EditPart) {
					Input input = (Input) ((Input3EditPart) edipart).resolveSemanticElement();
					TransactionalEditingDomain domain = ((Input3EditPart) edipart).getEditingDomain();
					
					openDialog(input, domain);
					
				}
				
				if (edipart instanceof InputName4EditPart) {
					if (edipart.getParent() instanceof Input4EditPart) {
						edipart = edipart.getParent();
					}
				}
				if (edipart instanceof Input4EditPart) {
					Input input = (Input) ((Input4EditPart) edipart).resolveSemanticElement();
					TransactionalEditingDomain domain = ((Input4EditPart) edipart).getEditingDomain();
					
					openDialog(input, domain);
					
				}
				
				if (edipart instanceof InputName5EditPart) {
					if (edipart.getParent() instanceof Input5EditPart) {
						edipart = edipart.getParent();
					}
				}
				if (edipart instanceof Input5EditPart) {
					Input input = (Input) ((Input5EditPart) edipart).resolveSemanticElement();
					TransactionalEditingDomain domain = ((Input5EditPart) edipart).getEditingDomain();
					
					openDialog(input, domain);
					
				}

			}
		};
	}
	
	private void openDialog(Input input, TransactionalEditingDomain domain) {
		Shell parentShell = new Shell();
		DialogInputView dialogClass = new DialogInputView(parentShell, input, domain);
		dialogClass.open();
		parentShell.setSize(600, 600);
	}


}