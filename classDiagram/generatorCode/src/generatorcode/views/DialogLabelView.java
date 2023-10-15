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

public class DialogLabelView extends Dialog {
    private Text textName;
	private Text textFontSize;
	private Text textColor;
	private Combo comboFontWeight;
    private uidiagram.Label model;
    private TransactionalEditingDomain domain;

    /**
     * Create the dialog.
     * @param parentShell
     * @param domain
     * @param model
     */
    public DialogLabelView(Shell parentShell, uidiagram.Label model, TransactionalEditingDomain domain) {
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
		
		Label lblName = new Label(container, SWT.NONE);
		lblName.setText("Name:");
		new Label(container, SWT.NONE);
		
		textName = new Text(container, SWT.BORDER);
		textName.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));
		new Label(container, SWT.NONE);
		
		Label lblFontSize = new Label(container, SWT.NONE);
		lblFontSize.setText("Font Size:");
		new Label(container, SWT.NONE);
		
		textFontSize = new Text(container, SWT.BORDER);
		textFontSize.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));
		new Label(container, SWT.NONE);
		
		Label lblColor = new Label(container, SWT.NONE);
		lblColor.setText("Color:");
		new Label(container, SWT.NONE);
		
		textColor = new Text(container, SWT.BORDER);
		textColor.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));
		new Label(container, SWT.NONE);
		
		Label lblFontWeight = new Label(container, SWT.NONE);
		lblFontWeight.setText("Font Weight:");
		new Label(container, SWT.NONE);
		
		comboFontWeight = new Combo(container, SWT.NONE);
		comboFontWeight.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));
		comboFontWeight.add("bold");
		comboFontWeight.add("normal");
		comboFontWeight.add("w100");
		comboFontWeight.add("w200");
		comboFontWeight.add("w300");
		comboFontWeight.add("w400");
		comboFontWeight.add("w500");
		comboFontWeight.add("w600");
		comboFontWeight.add("w700");
		comboFontWeight.add("w800");
		comboFontWeight.add("w900");
		
	
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
       
//        if(textName.getText().equalsIgnoreCase("") ) {
//            JOptionPane.showMessageDialog(null,"Please to insert the information");
//        }else {
            ChangeOPerationDialogCommand command = new ChangeOPerationDialogCommand(domain, model);                    
            domain.getCommandStack().execute((Command) command);
            close();
//        }
    }
   
    public class ChangeOPerationDialogCommand extends RecordingCommand{

        private uidiagram.Label label;
        TransactionalEditingDomain transactionalEditingDomain2;
        
        public ChangeOPerationDialogCommand(TransactionalEditingDomain transactionalEditingDomain, uidiagram.Label label) {
            super(transactionalEditingDomain);
            this.transactionalEditingDomain2 =transactionalEditingDomain;
            this.label = label;
        }
        @Override
        protected void doExecute() {
        	        	
        	if(textName != null && !(textName.getText().isEmpty())) label.setName(textName.getText()); 
        	if(textFontSize != null && !(textFontSize.getText().isEmpty())) label.setFontSize(textFontSize.getText());
        	if(textColor != null && !(textColor.getText().isEmpty())) label.setFontColor(textColor.getText());
        	if(!(comboFontWeight.getText().isEmpty())) label.setFontWeight(comboFontWeight.getText());
        }

       
    }
}
