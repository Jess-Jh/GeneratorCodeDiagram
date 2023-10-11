package uidiagram.diagram.edit.policies;


import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.gef.EditPart;
import org.eclipse.gef.Request;
import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.OpenEditPolicy;
import org.eclipse.swt.widgets.Shell;

import generatorcode.views.DialogSwitchView;
import uidiagram.Switch;
import uidiagram.diagram.edit.parts.Switch2EditPart;
import uidiagram.diagram.edit.parts.Switch3EditPart;
import uidiagram.diagram.edit.parts.Switch4EditPart;
import uidiagram.diagram.edit.parts.Switch5EditPart;
import uidiagram.diagram.edit.parts.SwitchEditPart;
import uidiagram.diagram.edit.parts.SwitchName2EditPart;
import uidiagram.diagram.edit.parts.SwitchName3EditPart;
import uidiagram.diagram.edit.parts.SwitchName4EditPart;
import uidiagram.diagram.edit.parts.SwitchName5EditPart;
import uidiagram.diagram.edit.parts.SwitchNameEditPart;

public class OpenSwitchEditPolicy extends OpenEditPolicy {
	
	protected Command getOpenCommand(Request request) {
		return new Command("Test double-click") {
			public void execute() {
				
				EditPart edipart = getHost();

				if (edipart instanceof SwitchNameEditPart) {
					if (edipart.getParent() instanceof SwitchEditPart) {
						edipart = edipart.getParent();
					}
				}
				if (edipart instanceof SwitchEditPart) {
					Switch switches = (Switch) ((SwitchEditPart) edipart).resolveSemanticElement();
					TransactionalEditingDomain domain = ((SwitchEditPart) edipart).getEditingDomain();

					openDialog(switches, domain);

				}
				
				if (edipart instanceof SwitchName2EditPart) {
					if (edipart.getParent() instanceof Switch2EditPart) {
						edipart = edipart.getParent();
					}
				}
				if (edipart instanceof Switch2EditPart) {
					Switch switches = (Switch) ((Switch2EditPart) edipart).resolveSemanticElement();
					TransactionalEditingDomain domain = ((Switch2EditPart) edipart).getEditingDomain();
					
					openDialog(switches, domain);
					
				}
				
				if (edipart instanceof SwitchName3EditPart) {
					if (edipart.getParent() instanceof Switch3EditPart) {
						edipart = edipart.getParent();
					}
				}
				if (edipart instanceof Switch3EditPart) {
					Switch switches = (Switch) ((Switch3EditPart) edipart).resolveSemanticElement();
					TransactionalEditingDomain domain = ((Switch3EditPart) edipart).getEditingDomain();
					
					openDialog(switches, domain);
					
				}
				
				if (edipart instanceof SwitchName4EditPart) {
					if (edipart.getParent() instanceof Switch4EditPart) {
						edipart = edipart.getParent();
					}
				}
				if (edipart instanceof Switch4EditPart) {
					Switch switches = (Switch) ((Switch4EditPart) edipart).resolveSemanticElement();
					TransactionalEditingDomain domain = ((Switch4EditPart) edipart).getEditingDomain();
					
					openDialog(switches, domain);
					
				}
				
				if (edipart instanceof SwitchName5EditPart) {
					if (edipart.getParent() instanceof Switch5EditPart) {
						edipart = edipart.getParent();
					}
				}
				if (edipart instanceof Switch5EditPart) {
					Switch switches = (Switch) ((Switch5EditPart) edipart).resolveSemanticElement();
					TransactionalEditingDomain domain = ((Switch5EditPart) edipart).getEditingDomain();
					
					openDialog(switches, domain);
					
				}

			}
		};
	}
	
	private void openDialog(Switch switches, TransactionalEditingDomain domain) {
		Shell parentShell = new Shell();
		DialogSwitchView dialogClass = new DialogSwitchView(parentShell, switches, domain);
		dialogClass.open();
		parentShell.setSize(600, 600);
	}


}