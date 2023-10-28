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

import concrete.ConcretePackage;
import concrete.MethodJJD;
import uidiagram.ModelFactory;
import uidiagram.UIDiagram;

public class DialogButtonView extends Dialog {
    private Text textName;
    private Text textColor;
	private Combo comboAlignment;
	private Combo comboNavigate;
    private uidiagram.Button model;
    private ModelFactory modelFactory;
    private TransactionalEditingDomain domain;

    /**
     * Create the dialog.
     * @param parentShell
     * @param domain
     * @param model
     */
    public DialogButtonView(Shell parentShell, uidiagram.Button model, TransactionalEditingDomain domain) {
        super(parentShell);
        this.model = model;
        this.domain = domain;
        this.modelFactory = uploadUIDiagram();
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
		lblNewLabel.setText("Name: ");
		new Label(container, SWT.NONE);
		
		textName = new Text(container, SWT.BORDER);
		textName.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));
		new Label(container, SWT.NONE);
		new Label(container, SWT.NONE);
		
		Label lblColor = new Label(container, SWT.NONE);
		lblColor.setText("Color:");
		new Label(container, SWT.NONE);
		
		textColor = new Text(container, SWT.BORDER);
		textColor.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));
		new Label(container, SWT.NONE);
		new Label(container, SWT.NONE);
		
		Label lblAlignment = new Label(container, SWT.NONE);
		lblAlignment.setText("Aligntment:");
		new Label(container, SWT.NONE);
		
		comboAlignment = new Combo(container, SWT.NONE);
		comboAlignment.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));
		new Label(container, SWT.NONE);
		new Label(container, SWT.NONE);
		comboAlignment.add("bottomCenter");
		comboAlignment.add("bottomLeft");
		comboAlignment.add("bottomRight");
		comboAlignment.add("center");
		comboAlignment.add("centerLeft");
		comboAlignment.add("centerRight");
		comboAlignment.add("topCenter");
		comboAlignment.add("topLeft");
		comboAlignment.add("topRight");
		
		Label lblNavigate = new Label(container, SWT.NONE);
		lblNavigate.setText("Navegar:");
		new Label(container, SWT.NONE);
		
		comboNavigate = new Combo(container, SWT.NONE);
		comboNavigate.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));
		new Label(container, SWT.NONE);
		new Label(container, SWT.NONE);
		
		for(UIDiagram diagram : modelFactory.getListDiagrams()) {
			comboNavigate.add(diagram.getName());
		}

		return container;
    }
    
	public ModelFactory uploadUIDiagram() {
		ModelFactory modelFactory = null;
		
		ConcretePackage whoownmePackage =  ConcretePackage.eINSTANCE;
		org.eclipse.emf.ecore.resource.ResourceSet resourceSet = new org.eclipse.emf.ecore.resource.impl.ResourceSetImpl();		
		org.eclipse.emf.common.util.URI uri = org.eclipse.emf.common.util.URI.createURI("platform:/resource/test/src/model/model.uidiagram");
		org.eclipse.emf.ecore.resource.Resource resource = resourceSet.createResource(uri);
		
		try {
			resource.load(null);
			modelFactory = (ModelFactory)resource.getContents().get(0);
			System.out.println("loaded: " + modelFactory);
			
			
		}
		catch (java.io.IOException e) {
			System.out.println("failed to read " + uri); 		
			System.out.println(e);
		}
		return modelFactory;
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
        return new Point(350, 250);
    }
   
    @Override
    protected void okPressed() {
       
            ChangeOPerationDialogCommand command = new ChangeOPerationDialogCommand(domain, model);                    
            domain.getCommandStack().execute((Command) command);
            close();
    }
   
    public class ChangeOPerationDialogCommand extends RecordingCommand{

        private uidiagram.Button button;
        TransactionalEditingDomain transactionalEditingDomain2;
        
        public ChangeOPerationDialogCommand(TransactionalEditingDomain transactionalEditingDomain, uidiagram.Button button) {
            super(transactionalEditingDomain);
            this.transactionalEditingDomain2 =transactionalEditingDomain;
            this.button = button;
        }
        @Override
        protected void doExecute()
        {
        	if(textName != null && !(textName.getText().isEmpty()))  button.setName(textName.getText()); 
        	if(textColor != null && !(textColor.getText().isEmpty())) button.setBackgroundColor(textColor.getText());
        	if(!(comboAlignment.getText().isEmpty())) button.setAlignment(comboAlignment.getText());
        	if(!(comboNavigate.getText().isEmpty())) button.setNavigateTo(comboNavigate.getText());

        }

       
    }
}
