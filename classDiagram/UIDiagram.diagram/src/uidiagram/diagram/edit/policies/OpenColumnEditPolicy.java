package uidiagram.diagram.edit.policies;

import generatorcode.views.DialogColumnView;
import uidiagram.Column;
import uidiagram.diagram.edit.parts.ColumnEditPart;
import uidiagram.diagram.edit.parts.ColumnNameEditPart;

import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.gef.EditPart;
import org.eclipse.gef.Request;
import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.OpenEditPolicy;
import org.eclipse.swt.widgets.Shell;

public class OpenColumnEditPolicy extends OpenEditPolicy {
	
	protected Command getOpenCommand(Request request) {
		return new Command("Test double-click") {
			public void execute() {
				
				EditPart edipart = getHost();

				if (edipart instanceof ColumnNameEditPart) {
					if (edipart.getParent() instanceof ColumnEditPart) {
						edipart = edipart.getParent();
					}
				}
				if (edipart instanceof ColumnEditPart) {
					Column column = (Column) ((ColumnEditPart) edipart).resolveSemanticElement();
					TransactionalEditingDomain domain = ((ColumnEditPart) edipart).getEditingDomain();

					openDialog(column, domain);

				}
				
				
			}
		};
	}
	
	private void openDialog(Column column, TransactionalEditingDomain domain) {
		Shell parentShell = new Shell();
		DialogColumnView dialogClass = new DialogColumnView(parentShell, column, domain);
		dialogClass.open();
		parentShell.setSize(600, 600);
	}


}