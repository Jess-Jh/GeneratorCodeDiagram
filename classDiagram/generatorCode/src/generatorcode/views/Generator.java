package generatorcode.views;


import org.eclipse.swt.widgets.Composite;
import org.eclipse.ui.part.*;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Group;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent; 


/**
 * This sample class demonstrates how to plug-in a new
 * workbench view. The view shows data obtained from the
 * model. The sample creates a dummy model on the fly,
 * but a real implementation would connect to the model
 * available either in this or another plug-in (e.g. the workspace).
 * The view is connected to the model using a content provider.
 * <p>
 * The view uses a label provider to define how model
 * objects should be presented in the view. Each
 * view can present the same model objects using
 * different labels and icons, if needed. Alternatively,
 * a single label provider can be shared between views
 * in order to ensure that objects of the same type are
 * presented in the same way everywhere.
 * <p>
 */

public class Generator extends ViewPart {
	public Generator() {
	}

	/**
	 * The ID of the view as specified by the extension.
	 */
	public static final String ID = "generatorcode.views.Generator";


	@Override
	public void createPartControl(Composite parent) {
		parent.setLayout(null);
		
		Group grpGeneratorCode = new Group(parent, SWT.NONE);
		grpGeneratorCode.setBounds(10, 28, 543, 222);
		grpGeneratorCode.setText("Generator code");
		grpGeneratorCode.setLayout(null);
		
		Button btnTransformacionMm = new Button(grpGeneratorCode, SWT.NONE);
		btnTransformacionMm.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				ModelFactoryModel mfm = ModelFactoryModel.getInstance();
				mfm.transformationM2M();
			}
		});
		
		btnTransformacionMm.setBounds(29, 63, 233, 35);
		btnTransformacionMm.setFont(SWTResourceManager.getFont("Segoe UI", 10, SWT.BOLD | SWT.ITALIC));
		btnTransformacionMm.setForeground(SWTResourceManager.getColor(SWT.COLOR_RED));
		btnTransformacionMm.setText("Transformacion M2M");
		
		Button btnTransformacionMt = new Button(grpGeneratorCode, SWT.NONE);
		btnTransformacionMt.setBounds(283, 63, 233, 35);
		btnTransformacionMt.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				ModelFactoryModel mfm = ModelFactoryModel.getInstance();
				mfm.transformationM2T();
			}
		});
		btnTransformacionMt.setText("Transformacion M2T");
		btnTransformacionMt.setForeground(SWTResourceManager.getColor(SWT.COLOR_RED));
		btnTransformacionMt.setFont(SWTResourceManager.getFont("Segoe UI", 10, SWT.BOLD | SWT.ITALIC));
		
		Button btnTransformacionFlutter = new Button(grpGeneratorCode, SWT.NONE);
		btnTransformacionFlutter.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				ModelFactoryModel mfm = ModelFactoryModel.getInstance();
				mfm.transformationFramework();
			}
		});
		btnTransformacionFlutter.setBounds(29, 126, 233, 35);
		btnTransformacionFlutter.setText("Transformacion Flutter");
		
		Button btnTransformacionDSL = new Button(grpGeneratorCode, SWT.NONE);
		btnTransformacionDSL.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				ModelFactoryModel mfm = ModelFactoryModel.getInstance();
				mfm.transformationDSL();
			}
		});
		btnTransformacionDSL.setText("Transformacion DSL");
		btnTransformacionDSL.setBounds(283, 126, 233, 35);
	}

	@Override
	public void setFocus() {
		
	}
}