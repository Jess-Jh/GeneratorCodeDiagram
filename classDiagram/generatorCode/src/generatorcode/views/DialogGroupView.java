package generatorcode.views;

import org.eclipse.emf.common.command.Command;
import org.eclipse.emf.transaction.RecordingCommand;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.jface.dialogs.Dialog;
import org.eclipse.jface.dialogs.IDialogConstants;
import org.eclipse.swt.graphics.Point;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Text;

public class DialogGroupView extends Dialog {
	private Text textName;
	private Text textBorderRadius;
	private Text textBackgroundColor;
	private Text textBorderWidth;
	private Text textBorderColor;
    private uidiagram.Group model;
    private TransactionalEditingDomain domain;
    DialogColor color = new DialogColor();

    /**
     * Create the dialog.
     * @param parentShell
     * @param domain
     * @param model
     */
    public DialogGroupView(Shell parentShell, uidiagram.Group model, TransactionalEditingDomain domain) {
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
		gridLayout.numColumns = 5;
		new Label(container, SWT.NONE);
		
		Label lblNewLabel = new Label(container, SWT.NONE);
		lblNewLabel.setText("Name:");
		new Label(container, SWT.NONE);
		
		textName = new Text(container, SWT.BORDER);
		textName.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));
		new Label(container, SWT.NONE);
		new Label(container, SWT.NONE);
		
		Label lblNewLabel_2 = new Label(container, SWT.NONE);
		lblNewLabel_2.setText("Background Color:");
		new Label(container, SWT.NONE);
		
		textBackgroundColor = new Text(container, SWT.BORDER);
		textBackgroundColor.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));
		new Label(container, SWT.NONE);
		new Label(container, SWT.NONE);
		
		Label lblNewLabel_1 = new Label(container, SWT.NONE);
		lblNewLabel_1.setText("Border Radius:");
		new Label(container, SWT.NONE);
		
		textBorderRadius = new Text(container, SWT.BORDER);
		textBorderRadius.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));
		new Label(container, SWT.NONE);
		new Label(container, SWT.NONE);
		
		Label lblNewLabel_3 = new Label(container, SWT.NONE);
		lblNewLabel_3.setText("Border Width:");
		new Label(container, SWT.NONE);
		
		textBorderWidth = new Text(container, SWT.BORDER);
		textBorderWidth.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));
		new Label(container, SWT.NONE);
		new Label(container, SWT.NONE);
		
		Label lblNewLabel_4 = new Label(container, SWT.NONE);
		lblNewLabel_4.setText("Border Color:");
		new Label(container, SWT.NONE);
		
		textBorderColor = new Text(container, SWT.BORDER);
		textBorderColor.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));
		new Label(container, SWT.NONE);

		return container;
    }

    /**
     * Create contents of the button bar.
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
       
            ChangeOPerationDialogCommand command = new ChangeOPerationDialogCommand(domain, model);                    
            domain.getCommandStack().execute((Command) command);
            close();
    }
   
    public class ChangeOPerationDialogCommand extends RecordingCommand{

        private uidiagram.Group group;
        TransactionalEditingDomain transactionalEditingDomain2;
        
        public ChangeOPerationDialogCommand(TransactionalEditingDomain transactionalEditingDomain, uidiagram.Group group) {
            super(transactionalEditingDomain);
            this.transactionalEditingDomain2 =transactionalEditingDomain;
            this.group = group;
        }
        @Override
        protected void doExecute()
        {
        	if(textName != null && !(textName.getText().isEmpty())) group.setName(textName.getText());                
        	if(textBackgroundColor != null && !(textBackgroundColor.getText().isEmpty())) group.setBackgroundColor(textBackgroundColor.getText());  
        	if(textBorderRadius != null && !(textBorderRadius.getText().isEmpty())) group.setBorderRadius(textBorderRadius.getText());
        	if(textBorderWidth != null && !(textBorderWidth.getText().isEmpty())) group.setBorderWidth(textBorderWidth.getText());
        	if(textBorderColor != null && !(textBorderColor.getText().isEmpty())) group.setBorderColor(textBorderColor.getText());
        }

       
    }
}
