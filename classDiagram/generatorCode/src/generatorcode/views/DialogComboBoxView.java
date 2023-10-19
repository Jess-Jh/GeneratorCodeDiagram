package generatorcode.views;

import org.eclipse.emf.common.command.Command;
import org.eclipse.emf.transaction.RecordingCommand;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.jface.dialogs.Dialog;
import org.eclipse.jface.dialogs.IDialogConstants;
import org.eclipse.swt.graphics.Point;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Combo;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Text;

public class DialogComboBoxView extends Dialog {
    private Text textName;
    private Text textColor;
    private Combo comboAlignment;
    private uidiagram.ComboBox model;
    private TransactionalEditingDomain domain;

    /**
     * Create the dialog.
     * @param parentShell
     * @param domain
     * @param model
     */
    public DialogComboBoxView(Shell parentShell, uidiagram.ComboBox model, TransactionalEditingDomain domain) {
        super(parentShell);
        this.model = model;
        this.domain = domain;
    }

    /**
     * Create contents of the dialog.
     * @param parent
     */
    @Override
    protected Control createDialogArea(Composite parent) {
    	Composite container = (Composite) super.createDialogArea(parent);
		GridLayout gridLayout = (GridLayout) container.getLayout();
		gridLayout.numColumns = 4;
		new Label(container, SWT.NONE);
		
		Label lblNewLabel = new Label(container, SWT.NONE);
		lblNewLabel.setText("Name: ");
		new Label(container, SWT.NONE);
		
		textName = new Text(container, SWT.BORDER);
		textName.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));
		new Label(container, SWT.NONE);
		
		Label lblColor = new Label(container, SWT.NONE);
		lblColor.setText("Color:");
		new Label(container, SWT.NONE);
		
		textColor = new Text(container, SWT.BORDER);
		textColor.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));
		new Label(container, SWT.NONE);
		
		Label lblAlignment = new Label(container, SWT.NONE);
		lblAlignment.setText("Aligntment:");
		new Label(container, SWT.NONE);
		
		comboAlignment = new Combo(container, SWT.NONE);
		comboAlignment.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));
		comboAlignment.add("bottomCenter");
		comboAlignment.add("bottomLeft");
		comboAlignment.add("bottomRight");
		comboAlignment.add("center");
		comboAlignment.add("centerLeft");
		comboAlignment.add("centerRight");
		comboAlignment.add("topCenter");
		comboAlignment.add("topLeft");
		comboAlignment.add("topRight");

		return container;
    }

    /**
     * Create contents of the comboBox bar.
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
        return new Point(350, 250);
    }
   
    @Override
    protected void okPressed() {
       
            ChangeOPerationDialogCommand command = new ChangeOPerationDialogCommand(domain, model);                    
            domain.getCommandStack().execute((Command) command);
            close();
    }
   
    public class ChangeOPerationDialogCommand extends RecordingCommand{

        private uidiagram.ComboBox comboBox;
        TransactionalEditingDomain transactionalEditingDomain2;
        
        public ChangeOPerationDialogCommand(TransactionalEditingDomain transactionalEditingDomain, uidiagram.ComboBox comboBox) {
            super(transactionalEditingDomain);
            this.transactionalEditingDomain2 =transactionalEditingDomain;
            this.comboBox = comboBox;
        }
        @Override
        protected void doExecute()
        {
        	if(textName != null && !(textName.getText().isEmpty()))  comboBox.setName(textName.getText()); 
        	if(textColor != null && !(textColor.getText().isEmpty())) comboBox.setBackgroundColor(textColor.getText());
        	if(!(comboAlignment.getText().isEmpty())) comboBox.setAlignment(comboAlignment.getText());

        }

       
    }
}
