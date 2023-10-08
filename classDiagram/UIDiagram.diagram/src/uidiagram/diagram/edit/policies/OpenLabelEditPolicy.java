package uidiagram.diagram.edit.policies;

import generatorcode.views.DialogLabelView;
import java.util.ArrayList;

import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.gef.EditPart;
import org.eclipse.gef.EditPolicy;
import org.eclipse.gef.Request;
import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.diagram.ui.editparts.GraphicalEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.OpenEditPolicy;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.swt.widgets.Shell;

import uidiagram.Label;
import uidiagram.diagram.edit.parts.LabelEditPart;
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
				
//				if (edipart instanceof LabelEditPart) {
//					Label label = (Label) ((LabelEditPart) edipart).resolveSemanticElement();
//					TransactionalEditingDomain domain = ((LabelEditPart) edipart).getEditingDomain();
//					Shell parentShell = new Shell();
//					DialogLabelView dialogClass = new DialogLabelView(parentShell, label, domain, edipart);
//					// parentShell.setBounds(150,700, 860, 150);
//					dialogClass.open();
//
//					UserInterface userInterfaceSeleccionadaParaHeredar = dialogClass.getUserInterfaceSeleccionado();
//
//					// herencia de una interfaz
//					if (userInterfaceSeleccionadaParaHeredar != null) {
//						ImportadorWidget importadorWidget = new ImportadorWidget(userInterfaceSeleccionadaParaHeredar,
//								null, domain, (EditPart) edipart, label, true, new ArrayList<>());
//						importadorWidget.importWidgetHerencia();
//					}
//				}

			}
		};
	}

}