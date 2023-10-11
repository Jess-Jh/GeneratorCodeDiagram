package uidiagram.diagram.edit.policies;


import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.gef.EditPart;
import org.eclipse.gef.Request;
import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.OpenEditPolicy;
import org.eclipse.swt.widgets.Shell;

import generatorcode.views.DialogRadioButtonView;
import uidiagram.RadioButton;
import uidiagram.diagram.edit.parts.RadioButton2EditPart;
import uidiagram.diagram.edit.parts.RadioButton3EditPart;
import uidiagram.diagram.edit.parts.RadioButton4EditPart;
import uidiagram.diagram.edit.parts.RadioButton5EditPart;
import uidiagram.diagram.edit.parts.RadioButtonEditPart;
import uidiagram.diagram.edit.parts.RadioButtonName2EditPart;
import uidiagram.diagram.edit.parts.RadioButtonName3EditPart;
import uidiagram.diagram.edit.parts.RadioButtonName4EditPart;
import uidiagram.diagram.edit.parts.RadioButtonName5EditPart;
import uidiagram.diagram.edit.parts.RadioButtonNameEditPart;

public class OpenRadioButtonEditPolicy extends OpenEditPolicy {
	
	protected Command getOpenCommand(Request request) {
		return new Command("Test double-click") {
			public void execute() {
				
				EditPart edipart = getHost();

				if (edipart instanceof RadioButtonNameEditPart) {
					if (edipart.getParent() instanceof RadioButtonEditPart) {
						edipart = edipart.getParent();
					}
				}
				if (edipart instanceof RadioButtonEditPart) {
					RadioButton radioButton = (RadioButton) ((RadioButtonEditPart) edipart).resolveSemanticElement();
					TransactionalEditingDomain domain = ((RadioButtonEditPart) edipart).getEditingDomain();

					openDialog(radioButton, domain);

				}
				
				if (edipart instanceof RadioButtonName2EditPart) {
					if (edipart.getParent() instanceof RadioButton2EditPart) {
						edipart = edipart.getParent();
					}
				}
				if (edipart instanceof RadioButton2EditPart) {
					RadioButton radioButton = (RadioButton) ((RadioButton2EditPart) edipart).resolveSemanticElement();
					TransactionalEditingDomain domain = ((RadioButton2EditPart) edipart).getEditingDomain();
					
					openDialog(radioButton, domain);
					
				}
				
				if (edipart instanceof RadioButtonName3EditPart) {
					if (edipart.getParent() instanceof RadioButton3EditPart) {
						edipart = edipart.getParent();
					}
				}
				if (edipart instanceof RadioButton3EditPart) {
					RadioButton radioButton = (RadioButton) ((RadioButton3EditPart) edipart).resolveSemanticElement();
					TransactionalEditingDomain domain = ((RadioButton3EditPart) edipart).getEditingDomain();
					
					openDialog(radioButton, domain);
					
				}
				
				if (edipart instanceof RadioButtonName4EditPart) {
					if (edipart.getParent() instanceof RadioButton4EditPart) {
						edipart = edipart.getParent();
					}
				}
				if (edipart instanceof RadioButton4EditPart) {
					RadioButton radioButton = (RadioButton) ((RadioButton4EditPart) edipart).resolveSemanticElement();
					TransactionalEditingDomain domain = ((RadioButton4EditPart) edipart).getEditingDomain();
					
					openDialog(radioButton, domain);
					
				}
				
				if (edipart instanceof RadioButtonName5EditPart) {
					if (edipart.getParent() instanceof RadioButton5EditPart) {
						edipart = edipart.getParent();
					}
				}
				if (edipart instanceof RadioButton5EditPart) {
					RadioButton radioButton = (RadioButton) ((RadioButton5EditPart) edipart).resolveSemanticElement();
					TransactionalEditingDomain domain = ((RadioButton5EditPart) edipart).getEditingDomain();
					
					openDialog(radioButton, domain);
					
				}

			}
		};
	}
	
	private void openDialog(RadioButton radioButton, TransactionalEditingDomain domain) {
		Shell parentShell = new Shell();
		DialogRadioButtonView dialogClass = new DialogRadioButtonView(parentShell, radioButton, domain);
		dialogClass.open();
		parentShell.setSize(600, 600);
	}


}