/*
 * 
 */
package concrete.diagram.edit.parts;

import org.eclipse.draw2d.ColorConstants;
import org.eclipse.draw2d.Connection;
import org.eclipse.draw2d.Graphics;
import org.eclipse.draw2d.PolygonDecoration;
import org.eclipse.draw2d.RotatableDecoration;
import org.eclipse.draw2d.geometry.PointList;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ConnectionNodeEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ITreeBranchEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.EditPolicyRoles;
import org.eclipse.gmf.runtime.draw2d.ui.figures.PolylineConnectionEx;
import org.eclipse.gmf.runtime.notation.View;

import org.eclipse.swt.graphics.Color;
import concrete.diagram.edit.policies.ImplementJJDItemSemanticEditPolicy;

/**
 * @generated
 */
public class ImplementJJDEditPart extends ConnectionNodeEditPart implements ITreeBranchEditPart {

	/**
	* @generated
	*/
	public static final int VISUAL_ID = 4005;

	/**
	* @generated
	*/
	public ImplementJJDEditPart(View view) {
		super(view);
	}

	/**
	* @generated
	*/
	protected void createDefaultEditPolicies() {
		super.createDefaultEditPolicies();
		installEditPolicy(EditPolicyRoles.SEMANTIC_ROLE, new ImplementJJDItemSemanticEditPolicy());
	}

	/**
	* Creates figure for this edit part.
	* 
	* Body of this method does not depend on settings in generation model
	* so you may safely remove <i>generated</i> tag and modify it.
	* 
	* @generated
	*/

	protected Connection createConnectionFigure() {
		return new ImplementJJDFigure();
	}

	/**
	* @generated
	*/
	public ImplementJJDFigure getPrimaryShape() {
		return (ImplementJJDFigure) getFigure();
	}

	/**
	 * @generated
	 */
	public class ImplementJJDFigure extends PolylineConnectionEx {

		/**
		 * @generated
		 */
		public ImplementJJDFigure() {
			this.setLineWidth(2);
			this.setLineStyle(Graphics.LINE_DOT);
			this.setForegroundColor(THIS_FORE);

			setSourceDecoration(createSourceDecoration());
		}

		/**
		* @generated
		*/
		private RotatableDecoration createSourceDecoration() {
			PolygonDecoration df = new PolygonDecoration();
			df.setFill(true);
			df.setBackgroundColor(ColorConstants.white);
			PointList pl = new PointList();
			pl.addPoint(getMapMode().DPtoLP(0), getMapMode().DPtoLP(0));
			pl.addPoint(getMapMode().DPtoLP(-2), getMapMode().DPtoLP(2));
			pl.addPoint(getMapMode().DPtoLP(-2), getMapMode().DPtoLP(-2));
			pl.addPoint(getMapMode().DPtoLP(0), getMapMode().DPtoLP(0));
			df.setTemplate(pl);
			df.setScale(getMapMode().DPtoLP(7), getMapMode().DPtoLP(3));
			return df;
		}

	}

	/**
	* @generated
	*/
	static final Color THIS_FORE = new Color(null, 1, 24, 146);

}
