package uidiagram.diagram.edit.policies;

import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.gef.EditPart;
import org.eclipse.gef.Request;
import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.OpenEditPolicy;
import org.eclipse.swt.widgets.Shell;

import generatorcode.views.DialogComboBoxView;
import uidiagram.ComboBox;
import uidiagram.diagram.edit.parts.ComboBox2EditPart;
import uidiagram.diagram.edit.parts.ComboBox3EditPart;
import uidiagram.diagram.edit.parts.ComboBox4EditPart;
import uidiagram.diagram.edit.parts.ComboBox5EditPart;
import uidiagram.diagram.edit.parts.ComboBoxEditPart;
import uidiagram.diagram.edit.parts.ComboBoxName2EditPart;
import uidiagram.diagram.edit.parts.ComboBoxName3EditPart;
import uidiagram.diagram.edit.parts.ComboBoxName4EditPart;
import uidiagram.diagram.edit.parts.ComboBoxName5EditPart;
import uidiagram.diagram.edit.parts.ComboBoxNameEditPart;


public class OpenComboBoxEditPolicy extends OpenEditPolicy {
	
	protected Command getOpenCommand(Request request) {
		return new Command("Test double-click") {
			public void execute() {
				
				EditPart edipart = getHost();

				if (edipart instanceof ComboBoxNameEditPart) {
					if (edipart.getParent() instanceof ComboBoxEditPart) {
						edipart = edipart.getParent();
					}
				}
				if (edipart instanceof ComboBoxEditPart) {
					ComboBox comboBox = (ComboBox) ((ComboBoxEditPart) edipart).resolveSemanticElement();
					TransactionalEditingDomain domain = ((ComboBoxEditPart) edipart).getEditingDomain();

					openDialog(comboBox, domain);

				}
				
				if (edipart instanceof ComboBoxName2EditPart) {
					if (edipart.getParent() instanceof ComboBox2EditPart) {
						edipart = edipart.getParent();
					}
				}
				if (edipart instanceof ComboBox2EditPart) {
					ComboBox comboBox = (ComboBox) ((ComboBox2EditPart) edipart).resolveSemanticElement();
					TransactionalEditingDomain domain = ((ComboBox2EditPart) edipart).getEditingDomain();
					
					openDialog(comboBox, domain);
					
				}
				
				if (edipart instanceof ComboBoxName3EditPart) {
					if (edipart.getParent() instanceof ComboBox3EditPart) {
						edipart = edipart.getParent();
					}
				}
				if (edipart instanceof ComboBox3EditPart) {
					ComboBox comboBox = (ComboBox) ((ComboBox3EditPart) edipart).resolveSemanticElement();
					TransactionalEditingDomain domain = ((ComboBox3EditPart) edipart).getEditingDomain();
					
					openDialog(comboBox, domain);
					
				}
				
				if (edipart instanceof ComboBoxName4EditPart) {
					if (edipart.getParent() instanceof ComboBox4EditPart) {
						edipart = edipart.getParent();
					}
				}
				if (edipart instanceof ComboBox4EditPart) {
					ComboBox comboBox = (ComboBox) ((ComboBox4EditPart) edipart).resolveSemanticElement();
					TransactionalEditingDomain domain = ((ComboBox4EditPart) edipart).getEditingDomain();
					
					openDialog(comboBox, domain);
					
				}
				
				if (edipart instanceof ComboBoxName5EditPart) {
					if (edipart.getParent() instanceof ComboBox5EditPart) {
						edipart = edipart.getParent();
					}
				}
				if (edipart instanceof ComboBox5EditPart) {
					ComboBox comboBox = (ComboBox) ((ComboBox5EditPart) edipart).resolveSemanticElement();
					TransactionalEditingDomain domain = ((ComboBox5EditPart) edipart).getEditingDomain();
					
					openDialog(comboBox, domain);
					
				}
				
			}
		};
	}
	
	private void openDialog(ComboBox comboBox, TransactionalEditingDomain domain) {
		Shell parentShell = new Shell();
		DialogComboBoxView dialogClass = new DialogComboBoxView(parentShell, comboBox, domain);
		dialogClass.open();
		parentShell.setSize(600, 600);
	}


}