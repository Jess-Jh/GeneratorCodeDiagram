package uidiagram.diagram.edit.policies;

import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.gef.EditPart;
import org.eclipse.gef.Request;
import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.OpenEditPolicy;
import org.eclipse.swt.widgets.Shell;

import generatorcode.views.DialogDatePickerView;
import uidiagram.DatePicker;
import uidiagram.diagram.edit.parts.DatePicker2EditPart;
import uidiagram.diagram.edit.parts.DatePicker3EditPart;
import uidiagram.diagram.edit.parts.DatePicker4EditPart;
import uidiagram.diagram.edit.parts.DatePicker5EditPart;
import uidiagram.diagram.edit.parts.DatePickerEditPart;
import uidiagram.diagram.edit.parts.DatePickerName2EditPart;
import uidiagram.diagram.edit.parts.DatePickerName3EditPart;
import uidiagram.diagram.edit.parts.DatePickerName4EditPart;
import uidiagram.diagram.edit.parts.DatePickerName5EditPart;
import uidiagram.diagram.edit.parts.DatePickerNameEditPart;


public class OpenDatePickerEditPolicy extends OpenEditPolicy {
	
	protected Command getOpenCommand(Request request) {
		return new Command("Test double-click") {
			public void execute() {
				
				EditPart edipart = getHost();

				if (edipart instanceof DatePickerNameEditPart) {
					if (edipart.getParent() instanceof DatePickerEditPart) {
						edipart = edipart.getParent();
					}
				}
				if (edipart instanceof DatePickerEditPart) {
					DatePicker datePicker = (DatePicker) ((DatePickerEditPart) edipart).resolveSemanticElement();
					TransactionalEditingDomain domain = ((DatePickerEditPart) edipart).getEditingDomain();

					openDialog(datePicker, domain);

				}
				
				if (edipart instanceof DatePickerName2EditPart) {
					if (edipart.getParent() instanceof DatePicker2EditPart) {
						edipart = edipart.getParent();
					}
				}
				if (edipart instanceof DatePicker2EditPart) {
					DatePicker datePicker = (DatePicker) ((DatePicker2EditPart) edipart).resolveSemanticElement();
					TransactionalEditingDomain domain = ((DatePicker2EditPart) edipart).getEditingDomain();
					
					openDialog(datePicker, domain);
					
				}
				
				if (edipart instanceof DatePickerName3EditPart) {
					if (edipart.getParent() instanceof DatePicker3EditPart) {
						edipart = edipart.getParent();
					}
				}
				if (edipart instanceof DatePicker3EditPart) {
					DatePicker datePicker = (DatePicker) ((DatePicker3EditPart) edipart).resolveSemanticElement();
					TransactionalEditingDomain domain = ((DatePicker3EditPart) edipart).getEditingDomain();
					
					openDialog(datePicker, domain);
					
				}
				
				if (edipart instanceof DatePickerName4EditPart) {
					if (edipart.getParent() instanceof DatePicker4EditPart) {
						edipart = edipart.getParent();
					}
				}
				if (edipart instanceof DatePicker4EditPart) {
					DatePicker datePicker = (DatePicker) ((DatePicker4EditPart) edipart).resolveSemanticElement();
					TransactionalEditingDomain domain = ((DatePicker4EditPart) edipart).getEditingDomain();
					
					openDialog(datePicker, domain);
					
				}
				
				if (edipart instanceof DatePickerName5EditPart) {
					if (edipart.getParent() instanceof DatePicker5EditPart) {
						edipart = edipart.getParent();
					}
				}
				if (edipart instanceof DatePicker5EditPart) {
					DatePicker datePicker = (DatePicker) ((DatePicker5EditPart) edipart).resolveSemanticElement();
					TransactionalEditingDomain domain = ((DatePicker5EditPart) edipart).getEditingDomain();
					
					openDialog(datePicker, domain);
					
				}

			}
		};
	}
	
	private void openDialog(DatePicker datePicker, TransactionalEditingDomain domain) {
		Shell parentShell = new Shell();
		DialogDatePickerView dialogClass = new DialogDatePickerView(parentShell, datePicker, domain);
		dialogClass.open();
		parentShell.setSize(600, 600);
	}

}