package uidiagram.diagram.edit.policies;

import generatorcode.views.DialogCheckboxView;
import uidiagram.Checkbox;
import uidiagram.diagram.edit.parts.Checkbox2EditPart;
import uidiagram.diagram.edit.parts.Checkbox3EditPart;
import uidiagram.diagram.edit.parts.Checkbox4EditPart;
import uidiagram.diagram.edit.parts.Checkbox5EditPart;
import uidiagram.diagram.edit.parts.CheckboxEditPart;
import uidiagram.diagram.edit.parts.CheckboxName2EditPart;
import uidiagram.diagram.edit.parts.CheckboxName3EditPart;
import uidiagram.diagram.edit.parts.CheckboxName4EditPart;
import uidiagram.diagram.edit.parts.CheckboxName5EditPart;
import uidiagram.diagram.edit.parts.CheckboxNameEditPart;

import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.gef.EditPart;
import org.eclipse.gef.Request;
import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.OpenEditPolicy;
import org.eclipse.swt.widgets.Shell;


public class OpenCheckboxEditPolicy extends OpenEditPolicy {
	
	protected Command getOpenCommand(Request request) {
		return new Command("Test double-click") {
			public void execute() {
				
				EditPart edipart = getHost();

				if (edipart instanceof CheckboxNameEditPart) {
					if (edipart.getParent() instanceof CheckboxEditPart) {
						edipart = edipart.getParent();
					}
				}
				if (edipart instanceof CheckboxEditPart) {
					Checkbox checkbox = (Checkbox) ((CheckboxEditPart) edipart).resolveSemanticElement();
					TransactionalEditingDomain domain = ((CheckboxEditPart) edipart).getEditingDomain();

					openDialog(checkbox, domain);

				}
				
				if (edipart instanceof CheckboxName2EditPart) {
					if (edipart.getParent() instanceof Checkbox2EditPart) {
						edipart = edipart.getParent();
					}
				}
				if (edipart instanceof Checkbox2EditPart) {
					Checkbox checkbox = (Checkbox) ((Checkbox2EditPart) edipart).resolveSemanticElement();
					TransactionalEditingDomain domain = ((Checkbox2EditPart) edipart).getEditingDomain();
					
					openDialog(checkbox, domain);
					
				}
				
				if (edipart instanceof CheckboxName3EditPart) {
					if (edipart.getParent() instanceof Checkbox3EditPart) {
						edipart = edipart.getParent();
					}
				}
				if (edipart instanceof Checkbox3EditPart) {
					Checkbox checkbox = (Checkbox) ((Checkbox3EditPart) edipart).resolveSemanticElement();
					TransactionalEditingDomain domain = ((Checkbox3EditPart) edipart).getEditingDomain();
					
					openDialog(checkbox, domain);
					
				}
				
				if (edipart instanceof CheckboxName4EditPart) {
					if (edipart.getParent() instanceof Checkbox4EditPart) {
						edipart = edipart.getParent();
					}
				}
				if (edipart instanceof Checkbox4EditPart) {
					Checkbox checkbox = (Checkbox) ((Checkbox4EditPart) edipart).resolveSemanticElement();
					TransactionalEditingDomain domain = ((Checkbox4EditPart) edipart).getEditingDomain();
					
					openDialog(checkbox, domain);
					
				}
				
				if (edipart instanceof CheckboxName5EditPart) {
					if (edipart.getParent() instanceof Checkbox5EditPart) {
						edipart = edipart.getParent();
					}
				}
				if (edipart instanceof Checkbox5EditPart) {
					Checkbox checkbox = (Checkbox) ((Checkbox5EditPart) edipart).resolveSemanticElement();
					TransactionalEditingDomain domain = ((Checkbox5EditPart) edipart).getEditingDomain();
					
					openDialog(checkbox, domain);
					
				}
				
			}
		};
	}
	
	private void openDialog(Checkbox checkbox, TransactionalEditingDomain domain) {
		Shell parentShell = new Shell();
		DialogCheckboxView dialogClass = new DialogCheckboxView(parentShell, checkbox, domain);
		dialogClass.open();
		parentShell.setSize(600, 600);
	}

}