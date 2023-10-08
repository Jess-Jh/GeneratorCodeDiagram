package generatorcode.views;

import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.gef.EditPart;
import org.eclipse.jface.dialogs.Dialog;
import org.eclipse.jface.dialogs.IDialogConstants;
import org.eclipse.jface.viewers.ComboViewer;
import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.Point;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Combo;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Text;
import org.eclipse.ui.forms.widgets.FormToolkit;

import org.eclipse.swt.widgets.Label;

public class DialogLabelView extends Dialog {

	private Label label;
	private final FormToolkit formToolkit = new FormToolkit(Display.getDefault());
	private TransactionalEditingDomain domain;
	private Text textName;
	private Button model;

	/**
	 * Create the dialog.
	 * 
	 * @param parentShell
	 * @param edipart
	 * @param domain
	 * @param model
	 */
	public DialogLabelView(Shell parentShell, Label label, TransactionalEditingDomain domain, EditPart edipart) {
		super(parentShell);

		this.label = label;
		this.domain = domain;
	}

	/**
	 * Create contents of the dialog.
	 * 
	 * @param parent
	 */
	@Override
	protected Control createDialogArea(Composite parent) {
		Composite container = (Composite) super.createDialogArea(parent);
		container.setLayout(null);

		Label lblName = formToolkit.createLabel(container, "Name :", SWT.NONE);
		lblName.setBounds(26, 23, 55, 15);

		textName = formToolkit.createText(container, "New Text", SWT.NONE);
		textName.setText("");
		textName.setBounds(105, 17, 221, 21);

		Label lblNavegation = formToolkit.createLabel(container, "Navegation :", SWT.NONE);
		lblNavegation.setBounds(26, 62, 67, 15);

		ComboViewer comboViewer = new ComboViewer(container, SWT.NONE);
		Combo combo = comboViewer.getCombo();
		combo.setItems(new String[] { "UI 1" });
		combo.setBounds(105, 62, 221, 23);
		formToolkit.paintBordersFor(combo);

		return container;
	}

	/**
	 * Create contents of the button bar.
	 * 
	 * @param parent
	 */
	@Override
	protected void createButtonsForButtonBar(Composite parent) {
		createButton(parent, IDialogConstants.OK_ID, IDialogConstants.OK_LABEL, true);
		createButton(parent, IDialogConstants.CANCEL_ID, IDialogConstants.CANCEL_LABEL, false);
	}

	/**
	 * Return the initial size of the dialog.
	 */
	@Override
	protected Point getInitialSize() {
		return new Point(450, 300);
	}

	@Override
	protected void okPressed() {

//		  label.setName(textName.getText());
	}
}
