package uidiagram.diagram.edit.policies;

import generatorcode.views.DialogLabelView;

import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.gef.EditPart;
import org.eclipse.gef.Request;
import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.OpenEditPolicy;
import org.eclipse.swt.widgets.Shell;

import uidiagram.Label;
import uidiagram.diagram.edit.parts.Label2EditPart;
import uidiagram.diagram.edit.parts.Label3EditPart;
import uidiagram.diagram.edit.parts.Label4EditPart;
import uidiagram.diagram.edit.parts.Label5EditPart;
import uidiagram.diagram.edit.parts.Label6EditPart;
import uidiagram.diagram.edit.parts.Label7EditPart;
import uidiagram.diagram.edit.parts.LabelEditPart;
import uidiagram.diagram.edit.parts.LabelName2EditPart;
import uidiagram.diagram.edit.parts.LabelName3EditPart;
import uidiagram.diagram.edit.parts.LabelName4EditPart;
import uidiagram.diagram.edit.parts.LabelName5EditPart;
import uidiagram.diagram.edit.parts.LabelName6EditPart;
import uidiagram.diagram.edit.parts.LabelName7EditPart;
import uidiagram.diagram.edit.parts.LabelNameEditPart;

public class OpenLabelEditPolicy extends OpenEditPolicy {
	
	protected Command getOpenCommand(Request request) {
		return new Command("Test double-click") {
			public void execute() {
				
				EditPart edipart = getHost();

				if (edipart instanceof LabelNameEditPart) {
					if (edipart.getParent() instanceof LabelEditPart) {
						edipart = edipart.getParent();
					}
				}
				if (edipart instanceof LabelEditPart) {
					Label label = (Label) ((LabelEditPart) edipart).resolveSemanticElement();
					TransactionalEditingDomain domain = ((LabelEditPart) edipart).getEditingDomain();

					openDialog(label, domain);

				}
				
				if (edipart instanceof LabelName2EditPart) {
					if (edipart.getParent() instanceof Label2EditPart) {
						edipart = edipart.getParent();
					}
				}
				if (edipart instanceof Label2EditPart) {
					Label label = (Label) ((Label2EditPart) edipart).resolveSemanticElement();
					TransactionalEditingDomain domain = ((Label2EditPart) edipart).getEditingDomain();
					
					openDialog(label, domain);
					
				}
				
				if (edipart instanceof LabelName3EditPart) {
					if (edipart.getParent() instanceof Label3EditPart) {
						edipart = edipart.getParent();
					}
				}
				if (edipart instanceof Label3EditPart) {
					Label label = (Label) ((Label3EditPart) edipart).resolveSemanticElement();
					TransactionalEditingDomain domain = ((Label3EditPart) edipart).getEditingDomain();
					
					openDialog(label, domain);
					
				}
				
				if (edipart instanceof LabelName4EditPart) {
					if (edipart.getParent() instanceof Label4EditPart) {
						edipart = edipart.getParent();
					}
				}
				if (edipart instanceof Label4EditPart) {
					Label label = (Label) ((Label4EditPart) edipart).resolveSemanticElement();
					TransactionalEditingDomain domain = ((Label4EditPart) edipart).getEditingDomain();
					
					openDialog(label, domain);
					
				}
				
				if (edipart instanceof LabelName5EditPart) {
					if (edipart.getParent() instanceof Label5EditPart) {
						edipart = edipart.getParent();
					}
				}
				if (edipart instanceof Label5EditPart) {
					Label label = (Label) ((Label5EditPart) edipart).resolveSemanticElement();
					TransactionalEditingDomain domain = ((Label5EditPart) edipart).getEditingDomain();
					
					openDialog(label, domain);
					
				}
				
				if (edipart instanceof LabelName6EditPart) {
					if (edipart.getParent() instanceof Label6EditPart) {
						edipart = edipart.getParent();
					}
				}
				if (edipart instanceof Label6EditPart) {
					Label label = (Label) ((Label6EditPart) edipart).resolveSemanticElement();
					TransactionalEditingDomain domain = ((Label6EditPart) edipart).getEditingDomain();
					
					openDialog(label, domain);
					
				}
				
				if (edipart instanceof LabelName7EditPart) {
					if (edipart.getParent() instanceof Label7EditPart) {
						edipart = edipart.getParent();
					}
				}
				if (edipart instanceof Label7EditPart) {
					Label label = (Label) ((Label7EditPart) edipart).resolveSemanticElement();
					TransactionalEditingDomain domain = ((Label7EditPart) edipart).getEditingDomain();
					
					openDialog(label, domain);
					
				}
			}
		};
	}
	
	private void openDialog(Label label, TransactionalEditingDomain domain) {
		Shell parentShell = new Shell();
		DialogLabelView dialogClass = new DialogLabelView(parentShell, label, domain);
		dialogClass.open();
		parentShell.setSize(600, 600);
	}
	
	
	
	
	
	
	
	
	
//	protected Command getOpenCommand(Request request) {
//		return new Command("Test double-click") {
//
//			public void execute() {
//				
//				System.out.print("entra");
//								
//				openDialog(LabelNameEditPart.class, LabelEditPart.class);
//				openDialog(LabelName2EditPart.class, Label2EditPart.class);
//				openDialog(LabelName3EditPart.class, Label3EditPart.class);
//				openDialog(LabelName4EditPart.class, Label4EditPart.class);
//				openDialog(LabelName5EditPart.class, Label5EditPart.class);
//				openDialog(LabelName6EditPart.class, Label6EditPart.class);
//				openDialog(LabelName7EditPart.class, Label7EditPart.class);
//			}
//		};
//	}
//	
//	void openDialog(Class<?> LabelNameEdit, Class<?> labelEdit ) {
//		EditPart edipart = getHost();
//				
//		
//		if (edipart instanceof LabelNameEdit) {
//			if (edipart.getParent() instanceof labelEdit) {
//				edipart = edipart.getParent();
//			}
//		}
//			if (edipart instanceof LabelEdit) {
//				Label label = (Label) ((LabelEdit) edipart).resolveSemanticElement();
//				TransactionalEditingDomain domain = ((LabelEdit) edipart).getEditingDomain();
//				
//				Shell parentShell = new Shell();
//				DialogLabelView dialogClass = new DialogLabelView(parentShell, label, domain);
//				dialogClass.open();
//				parentShell.setSize(600, 600);
//				
//		}
//	}

}