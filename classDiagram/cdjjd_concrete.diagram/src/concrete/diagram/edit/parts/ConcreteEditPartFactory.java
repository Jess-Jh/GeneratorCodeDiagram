/*
 * 
 */
package concrete.diagram.edit.parts;

import org.eclipse.gef.EditPart;
import org.eclipse.gef.EditPartFactory;
import org.eclipse.gef.tools.CellEditorLocator;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ITextAwareEditPart;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.gmf.tooling.runtime.directedit.locator.CellEditorLocatorAccess;

import concrete.diagram.part.ConcreteVisualIDRegistry;

/**
 * @generated
 */
public class ConcreteEditPartFactory implements EditPartFactory {

	/**
	* @generated
	*/
	public EditPart createEditPart(EditPart context, Object model) {
		if (model instanceof View) {
			View view = (View) model;
			switch (ConcreteVisualIDRegistry.getVisualID(view)) {

			case ClassDiagramJJDEditPart.VISUAL_ID:
				return new ClassDiagramJJDEditPart(view);

			case PackageJJDEditPart.VISUAL_ID:
				return new PackageJJDEditPart(view);

			case PackageJJDNameEditPart.VISUAL_ID:
				return new PackageJJDNameEditPart(view);

			case ClassJJDEditPart.VISUAL_ID:
				return new ClassJJDEditPart(view);

			case ClassJJDNameEditPart.VISUAL_ID:
				return new ClassJJDNameEditPart(view);

			case PackageJJD2EditPart.VISUAL_ID:
				return new PackageJJD2EditPart(view);

			case PackageJJDName2EditPart.VISUAL_ID:
				return new PackageJJDName2EditPart(view);

			case ClassJJD2EditPart.VISUAL_ID:
				return new ClassJJD2EditPart(view);

			case ClassJJDName2EditPart.VISUAL_ID:
				return new ClassJJDName2EditPart(view);

			case AttributeJJDEditPart.VISUAL_ID:
				return new AttributeJJDEditPart(view);

			case AttributeJJDNameTypeEditPart.VISUAL_ID:
				return new AttributeJJDNameTypeEditPart(view);

			case MethodJJDEditPart.VISUAL_ID:
				return new MethodJJDEditPart(view);

			case MethodJJDNameEditPart.VISUAL_ID:
				return new MethodJJDNameEditPart(view);

			case AttributeJJD2EditPart.VISUAL_ID:
				return new AttributeJJD2EditPart(view);

			case AttributeJJDNameType2EditPart.VISUAL_ID:
				return new AttributeJJDNameType2EditPart(view);

			case PackageJJDPackageJJDSubPackagesJJDCompartmentEditPart.VISUAL_ID:
				return new PackageJJDPackageJJDSubPackagesJJDCompartmentEditPart(view);

			case PackageJJDPackageJJDListClassJJDCompartmentEditPart.VISUAL_ID:
				return new PackageJJDPackageJJDListClassJJDCompartmentEditPart(view);

			case PackageJJDPackageJJDSubPackagesJJDCompartment2EditPart.VISUAL_ID:
				return new PackageJJDPackageJJDSubPackagesJJDCompartment2EditPart(view);

			case PackageJJDPackageJJDListClassJJDCompartment2EditPart.VISUAL_ID:
				return new PackageJJDPackageJJDListClassJJDCompartment2EditPart(view);

			case ClassJJDClassJJDListAttributesJJDCompartmentEditPart.VISUAL_ID:
				return new ClassJJDClassJJDListAttributesJJDCompartmentEditPart(view);

			case ClassJJDClassJJDListMethodsJJDCompartmentEditPart.VISUAL_ID:
				return new ClassJJDClassJJDListMethodsJJDCompartmentEditPart(view);

			case MethodJJDMethodJJDListAttributesJJDCompartmentEditPart.VISUAL_ID:
				return new MethodJJDMethodJJDListAttributesJJDCompartmentEditPart(view);

			case ClassJJDClassJJDListAttributesJJDCompartment2EditPart.VISUAL_ID:
				return new ClassJJDClassJJDListAttributesJJDCompartment2EditPart(view);

			case ClassJJDClassJJDListMethodsJJDCompartment2EditPart.VISUAL_ID:
				return new ClassJJDClassJJDListMethodsJJDCompartment2EditPart(view);

			case AgregationJJDEditPart.VISUAL_ID:
				return new AgregationJJDEditPart(view);

			case AgregationJJDRolAEditPart.VISUAL_ID:
				return new AgregationJJDRolAEditPart(view);

			case AgregationJJDRolBEditPart.VISUAL_ID:
				return new AgregationJJDRolBEditPart(view);

			case AgregationJJDMultiplicityAEditPart.VISUAL_ID:
				return new AgregationJJDMultiplicityAEditPart(view);

			case AgregationJJDMultiplicityBEditPart.VISUAL_ID:
				return new AgregationJJDMultiplicityBEditPart(view);

			case InheritanceJJDEditPart.VISUAL_ID:
				return new InheritanceJJDEditPart(view);

			case ContainmentJJDEditPart.VISUAL_ID:
				return new ContainmentJJDEditPart(view);

			case ContainmentJJDRolBEditPart.VISUAL_ID:
				return new ContainmentJJDRolBEditPart(view);

			case ContainmentJJDRolAEditPart.VISUAL_ID:
				return new ContainmentJJDRolAEditPart(view);

			case ContainmentJJDRolB2EditPart.VISUAL_ID:
				return new ContainmentJJDRolB2EditPart(view);

			case ContainmentJJDMultiplicityAEditPart.VISUAL_ID:
				return new ContainmentJJDMultiplicityAEditPart(view);

			case ContainmentJJDMultiplicityBEditPart.VISUAL_ID:
				return new ContainmentJJDMultiplicityBEditPart(view);

			case AssociationJJDEditPart.VISUAL_ID:
				return new AssociationJJDEditPart(view);

			case AssociationJJDRolAEditPart.VISUAL_ID:
				return new AssociationJJDRolAEditPart(view);

			case AssociationJJDRolBEditPart.VISUAL_ID:
				return new AssociationJJDRolBEditPart(view);

			case AssociationJJDMultiplicityAEditPart.VISUAL_ID:
				return new AssociationJJDMultiplicityAEditPart(view);

			case AssociationJJDMultiplicityBEditPart.VISUAL_ID:
				return new AssociationJJDMultiplicityBEditPart(view);

			case ImplementJJDEditPart.VISUAL_ID:
				return new ImplementJJDEditPart(view);

			}
		}
		return createUnrecognizedEditPart(context, model);
	}

	/**
	* @generated
	*/
	private EditPart createUnrecognizedEditPart(EditPart context, Object model) {
		// Handle creation of unrecognized child node EditParts here
		return null;
	}

	/**
	* @generated
	*/
	public static CellEditorLocator getTextCellEditorLocator(ITextAwareEditPart source) {
		return CellEditorLocatorAccess.INSTANCE.getTextCellEditorLocator(source);
	}

}
