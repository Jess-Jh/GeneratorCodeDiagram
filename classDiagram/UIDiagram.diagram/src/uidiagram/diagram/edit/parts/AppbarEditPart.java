/*
 * 
 */
package uidiagram.diagram.edit.parts;

import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.MarginBorder;
import org.eclipse.draw2d.RectangleFigure;
import org.eclipse.draw2d.RoundedRectangle;
import org.eclipse.draw2d.Shape;
import org.eclipse.draw2d.StackLayout;
import org.eclipse.draw2d.geometry.Dimension;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.gef.EditPart;
import org.eclipse.gef.EditPolicy;
import org.eclipse.gef.Request;
import org.eclipse.gef.commands.Command;
import org.eclipse.gef.editpolicies.LayoutEditPolicy;
import org.eclipse.gef.editpolicies.NonResizableEditPolicy;
import org.eclipse.gef.requests.CreateRequest;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ShapeNodeEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.EditPolicyRoles;
import org.eclipse.gmf.runtime.draw2d.ui.figures.ConstrainedToolbarLayout;
import org.eclipse.gmf.runtime.draw2d.ui.figures.WrappingLabel;
import org.eclipse.gmf.runtime.gef.ui.figures.DefaultSizeNodeFigure;
import org.eclipse.gmf.runtime.gef.ui.figures.NodeFigure;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.swt.graphics.Color;

import uidiagram.diagram.edit.notifications.NotificationEvent;
import uidiagram.diagram.edit.policies.AppbarItemSemanticEditPolicy;
import uidiagram.diagram.edit.policies.OpenAppbarEditPolicy;
import uidiagram.diagram.edit.policies.OpenDiagramEditPolicy;
import uidiagram.diagram.edit.policies.OpenLabelEditPolicy;
import uidiagram.diagram.part.UidiagramVisualIDRegistry;

/**
 * @generated
 */
public class AppbarEditPart extends ShapeNodeEditPart {

	/**
	* @generated
	*/
	public static final int VISUAL_ID = 3007;

	/**
	* @generated
	*/
	protected IFigure contentPane;

	/**
	* @generated
	*/
	protected IFigure primaryShape;

	/**
	* @generated
	*/
	public AppbarEditPart(View view) {
		super(view);
	}

	/**
	* @generated
	*/
	protected void createDefaultEditPolicies() {
		super.createDefaultEditPolicies();
		installEditPolicy(EditPolicyRoles.SEMANTIC_ROLE, new AppbarItemSemanticEditPolicy());
		installEditPolicy(EditPolicy.LAYOUT_ROLE, createLayoutEditPolicy());
		installEditPolicy(EditPolicyRoles.OPEN_ROLE, new OpenDiagramEditPolicy()); // XXX need an SCR to runtime to have another abstract superclass that would let children add reasonable editpolicies
		installEditPolicy(EditPolicyRoles.OPEN_ROLE, new OpenAppbarEditPolicy()); // XXX need an SCR to runtime to have another abstract superclass that would let children add reasonable editpolicies

		// removeEditPolicy(org.eclipse.gmf.runtime.diagram.ui.editpolicies.EditPolicyRoles.CONNECTION_HANDLES_ROLE);
	}

	/**
	* @generated
	*/
	protected LayoutEditPolicy createLayoutEditPolicy() {
		org.eclipse.gmf.runtime.diagram.ui.editpolicies.LayoutEditPolicy lep = new org.eclipse.gmf.runtime.diagram.ui.editpolicies.LayoutEditPolicy() {

			protected EditPolicy createChildEditPolicy(EditPart child) {
				EditPolicy result = child.getEditPolicy(EditPolicy.PRIMARY_DRAG_ROLE);
				if (result == null) {
					result = new NonResizableEditPolicy();
				}
				return result;
			}

			protected Command getMoveChildrenCommand(Request request) {
				return null;
			}

			protected Command getCreateCommand(CreateRequest request) {
				return null;
			}
		};
		return lep;
	}

	/**
	* @generated
	*/
	protected IFigure createNodeShape() {
		return primaryShape = new AppbarFigure();
	}

	/**
	* @generated
	*/
	public AppbarFigure getPrimaryShape() {
		return (AppbarFigure) primaryShape;
	}

	/**
	* @generated
	*/
	protected boolean addFixedChild(EditPart childEditPart) {
		if (childEditPart instanceof AppbarNameEditPart) {
			((AppbarNameEditPart) childEditPart).setLabel(getPrimaryShape().getFigureAppbarLabelFigure());
			return true;
		}
		if (childEditPart instanceof AppbarAppbarListButtonsCompartmentEditPart) {
			IFigure pane = getPrimaryShape().getAppbarListButtonsCompartmentFigure();
			setupContentPane(pane); // FIXME each comparment should handle his content pane in his own way 
			pane.add(((AppbarAppbarListButtonsCompartmentEditPart) childEditPart).getFigure());
			return true;
		}
		if (childEditPart instanceof AppbarAppbarListLabelsCompartmentEditPart) {
			IFigure pane = getPrimaryShape().getAppbarListLabelsCompartmentFigure();
			setupContentPane(pane); // FIXME each comparment should handle his content pane in his own way 
			pane.add(((AppbarAppbarListLabelsCompartmentEditPart) childEditPart).getFigure());
			return true;
		}
		return false;
	}

	/**
	* @generated
	*/
	protected boolean removeFixedChild(EditPart childEditPart) {
		if (childEditPart instanceof AppbarNameEditPart) {
			return true;
		}
		if (childEditPart instanceof AppbarAppbarListButtonsCompartmentEditPart) {
			IFigure pane = getPrimaryShape().getAppbarListButtonsCompartmentFigure();
			pane.remove(((AppbarAppbarListButtonsCompartmentEditPart) childEditPart).getFigure());
			return true;
		}
		if (childEditPart instanceof AppbarAppbarListLabelsCompartmentEditPart) {
			IFigure pane = getPrimaryShape().getAppbarListLabelsCompartmentFigure();
			pane.remove(((AppbarAppbarListLabelsCompartmentEditPart) childEditPart).getFigure());
			return true;
		}
		return false;
	}

	/**
	* @generated
	*/
	protected void addChildVisual(EditPart childEditPart, int index) {
		if (addFixedChild(childEditPart)) {
			return;
		}
		super.addChildVisual(childEditPart, -1);
	}

	/**
	* @generated
	*/
	protected void removeChildVisual(EditPart childEditPart) {
		if (removeFixedChild(childEditPart)) {
			return;
		}
		super.removeChildVisual(childEditPart);
	}

	/**
	* @generated
	*/
	protected IFigure getContentPaneFor(IGraphicalEditPart editPart) {
		if (editPart instanceof AppbarAppbarListButtonsCompartmentEditPart) {
			return getPrimaryShape().getAppbarListButtonsCompartmentFigure();
		}
		if (editPart instanceof AppbarAppbarListLabelsCompartmentEditPart) {
			return getPrimaryShape().getAppbarListLabelsCompartmentFigure();
		}
		return getContentPane();
	}

	/**
	* @generated
	*/
	protected NodeFigure createNodePlate() {
		DefaultSizeNodeFigure result = new DefaultSizeNodeFigure(40, 40);
		return result;
	}

	/**
	* Creates figure for this edit part.
	* 
	* Body of this method does not depend on settings in generation model
	* so you may safely remove <i>generated</i> tag and modify it.
	* 
	* @generated
	*/
	protected NodeFigure createNodeFigure() {
		NodeFigure figure = createNodePlate();
		figure.setLayoutManager(new StackLayout());
		IFigure shape = createNodeShape();
		figure.add(shape);
		contentPane = setupContentPane(shape);
		return figure;
	}

	/**
	* Default implementation treats passed figure as content pane.
	* Respects layout one may have set for generated figure.
	* @param nodeShape instance of generated figure class
	* @generated
	*/
	protected IFigure setupContentPane(IFigure nodeShape) {
		if (nodeShape.getLayoutManager() == null) {
			ConstrainedToolbarLayout layout = new ConstrainedToolbarLayout();
			layout.setSpacing(5);
			nodeShape.setLayoutManager(layout);
		}
		return nodeShape; // use nodeShape itself as contentPane
	}

	/**
	* @generated
	*/
	public IFigure getContentPane() {
		if (contentPane != null) {
			return contentPane;
		}
		return super.getContentPane();
	}

	/**
	* @generated
	*/
	protected void setForegroundColor(Color color) {
		if (primaryShape != null) {
			primaryShape.setForegroundColor(color);
		}
	}

	/**
	* @generated
	*/
	protected void setBackgroundColor(Color color) {
		if (primaryShape != null) {
			primaryShape.setBackgroundColor(color);
		}
	}

	/**
	* @generated
	*/
	protected void setLineWidth(int width) {
		if (primaryShape instanceof Shape) {
			((Shape) primaryShape).setLineWidth(width);
		}
	}

	/**
	* @generated
	*/
	protected void setLineType(int style) {
		if (primaryShape instanceof Shape) {
			((Shape) primaryShape).setLineStyle(style);
		}
	}

	/**
	* @generated
	*/
	public EditPart getPrimaryChildEditPart() {
		return getChildBySemanticHint(UidiagramVisualIDRegistry.getType(AppbarNameEditPart.VISUAL_ID));
	}

	/**
	 * @generated
	 */
	public class AppbarFigure extends RoundedRectangle {

		/**
		 * @generated
		 */
		private WrappingLabel fFigureAppbarLabelFigure;

		/**
		* @generated
		*/
		private RectangleFigure fAppbarListButtonsCompartmentFigure;

		/**
		* @generated
		*/
		private RectangleFigure fAppbarListLabelsCompartmentFigure;

		/**
				 * @generated
				 */
		public AppbarFigure() {
			this.setCornerDimensions(new Dimension(getMapMode().DPtoLP(8), getMapMode().DPtoLP(8)));
			this.setBorder(new MarginBorder(getMapMode().DPtoLP(5), getMapMode().DPtoLP(5), getMapMode().DPtoLP(5),
					getMapMode().DPtoLP(5)));
			createContents();
		}

		/**
		 * @generated
		 */
		private void createContents() {

			fFigureAppbarLabelFigure = new WrappingLabel();

			fFigureAppbarLabelFigure.setText("Appbar");
			fFigureAppbarLabelFigure.setMaximumSize(new Dimension(getMapMode().DPtoLP(10000), getMapMode().DPtoLP(50)));

			this.add(fFigureAppbarLabelFigure);

			fAppbarListButtonsCompartmentFigure = new RectangleFigure();

			fAppbarListButtonsCompartmentFigure.setOutline(false);

			this.add(fAppbarListButtonsCompartmentFigure);

			fAppbarListLabelsCompartmentFigure = new RectangleFigure();

			fAppbarListLabelsCompartmentFigure.setOutline(false);

			this.add(fAppbarListLabelsCompartmentFigure);

		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureAppbarLabelFigure() {
			return fFigureAppbarLabelFigure;
		}

		/**
		* @generated
		*/
		public RectangleFigure getAppbarListButtonsCompartmentFigure() {
			return fAppbarListButtonsCompartmentFigure;
		}

		/**
		* @generated
		*/
		public RectangleFigure getAppbarListLabelsCompartmentFigure() {
			return fAppbarListLabelsCompartmentFigure;
		}

	}

	protected void handleNotificationEvent(Notification notification) {
		NotificationEvent.handleNotificationEventTemplate(notification, this.getModel());

		super.handleNotificationEvent(notification);
	}

}
