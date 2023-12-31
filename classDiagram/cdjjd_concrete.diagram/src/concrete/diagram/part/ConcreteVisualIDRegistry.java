/*
* 
*/
package concrete.diagram.part;

import org.eclipse.core.runtime.Platform;
import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.notation.Diagram;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.gmf.tooling.runtime.structure.DiagramStructure;

import concrete.ClassDiagramJJD;
import concrete.ConcretePackage;
import concrete.diagram.edit.parts.AgregationJJDEditPart;
import concrete.diagram.edit.parts.AgregationJJDMultiplicityAEditPart;
import concrete.diagram.edit.parts.AgregationJJDMultiplicityBEditPart;
import concrete.diagram.edit.parts.AgregationJJDRolAEditPart;
import concrete.diagram.edit.parts.AgregationJJDRolBEditPart;
import concrete.diagram.edit.parts.AssociationJJDEditPart;
import concrete.diagram.edit.parts.AssociationJJDMultiplicityAEditPart;
import concrete.diagram.edit.parts.AssociationJJDMultiplicityBEditPart;
import concrete.diagram.edit.parts.AssociationJJDRolAEditPart;
import concrete.diagram.edit.parts.AssociationJJDRolBEditPart;
import concrete.diagram.edit.parts.AttributeJJD2EditPart;
import concrete.diagram.edit.parts.AttributeJJDEditPart;
import concrete.diagram.edit.parts.AttributeJJDName2EditPart;
import concrete.diagram.edit.parts.AttributeJJDNameEditPart;
import concrete.diagram.edit.parts.AttributeJJDNameType2EditPart;
import concrete.diagram.edit.parts.AttributeJJDNameTypeEditPart;
import concrete.diagram.edit.parts.AttributeJJDType2EditPart;
import concrete.diagram.edit.parts.AttributeJJDTypeEditPart;
import concrete.diagram.edit.parts.ClassDiagramJJDEditPart;
import concrete.diagram.edit.parts.ClassJJD2EditPart;
import concrete.diagram.edit.parts.ClassJJDClassJJDListAttributesJJDCompartment2EditPart;
import concrete.diagram.edit.parts.ClassJJDClassJJDListAttributesJJDCompartmentEditPart;
import concrete.diagram.edit.parts.ClassJJDClassJJDListMethodsJJDCompartment2EditPart;
import concrete.diagram.edit.parts.ClassJJDClassJJDListMethodsJJDCompartmentEditPart;
import concrete.diagram.edit.parts.ClassJJDEditPart;
import concrete.diagram.edit.parts.ClassJJDName2EditPart;
import concrete.diagram.edit.parts.ClassJJDNameEditPart;
import concrete.diagram.edit.parts.ContainmentJJDEditPart;
import concrete.diagram.edit.parts.ContainmentJJDMultiplicityAEditPart;
import concrete.diagram.edit.parts.ContainmentJJDMultiplicityBEditPart;
import concrete.diagram.edit.parts.ContainmentJJDRolA2EditPart;
import concrete.diagram.edit.parts.ContainmentJJDRolAEditPart;
import concrete.diagram.edit.parts.ContainmentJJDRolARolBEditPart;
import concrete.diagram.edit.parts.ContainmentJJDRolB2EditPart;
import concrete.diagram.edit.parts.ContainmentJJDRolBEditPart;
import concrete.diagram.edit.parts.ImplementJJDEditPart;
import concrete.diagram.edit.parts.InheritanceJJDEditPart;
import concrete.diagram.edit.parts.MethodJJDEditPart;
import concrete.diagram.edit.parts.MethodJJDMethodJJDListAttributesJJDCompartmentEditPart;
import concrete.diagram.edit.parts.MethodJJDNameEditPart;
import concrete.diagram.edit.parts.PackageJJD2EditPart;
import concrete.diagram.edit.parts.PackageJJDEditPart;
import concrete.diagram.edit.parts.PackageJJDName2EditPart;
import concrete.diagram.edit.parts.PackageJJDNameEditPart;
import concrete.diagram.edit.parts.PackageJJDPackageJJDListClassJJDCompartment2EditPart;
import concrete.diagram.edit.parts.PackageJJDPackageJJDListClassJJDCompartmentEditPart;
import concrete.diagram.edit.parts.PackageJJDPackageJJDSubPackagesJJDCompartment2EditPart;
import concrete.diagram.edit.parts.PackageJJDPackageJJDSubPackagesJJDCompartmentEditPart;

/**
 * This registry is used to determine which type of visual object should be
 * created for the corresponding Diagram, Node, ChildNode or Link represented
 * by a domain model object.
 * 
 * @generated
 */
public class ConcreteVisualIDRegistry {

	/**
	* @generated
	*/
	private static final String DEBUG_KEY = "cdjjd_concrete.diagram/debug/visualID"; //$NON-NLS-1$

	/**
	* @generated
	*/
	public static int getVisualID(View view) {
		if (view instanceof Diagram) {
			if (ClassDiagramJJDEditPart.MODEL_ID.equals(view.getType())) {
				return ClassDiagramJJDEditPart.VISUAL_ID;
			} else {
				return -1;
			}
		}
		return concrete.diagram.part.ConcreteVisualIDRegistry.getVisualID(view.getType());
	}

	/**
	* @generated
	*/
	public static String getModelID(View view) {
		View diagram = view.getDiagram();
		while (view != diagram) {
			EAnnotation annotation = view.getEAnnotation("Shortcut"); //$NON-NLS-1$
			if (annotation != null) {
				return (String) annotation.getDetails().get("modelID"); //$NON-NLS-1$
			}
			view = (View) view.eContainer();
		}
		return diagram != null ? diagram.getType() : null;
	}

	/**
	* @generated
	*/
	public static int getVisualID(String type) {
		try {
			return Integer.parseInt(type);
		} catch (NumberFormatException e) {
			if (Boolean.TRUE.toString().equalsIgnoreCase(Platform.getDebugOption(DEBUG_KEY))) {
				ConcreteDiagramEditorPlugin.getInstance()
						.logError("Unable to parse view type as a visualID number: " + type);
			}
		}
		return -1;
	}

	/**
	* @generated
	*/
	public static String getType(int visualID) {
		return Integer.toString(visualID);
	}

	/**
	* @generated
	*/
	public static int getDiagramVisualID(EObject domainElement) {
		if (domainElement == null) {
			return -1;
		}
		if (ConcretePackage.eINSTANCE.getClassDiagramJJD().isSuperTypeOf(domainElement.eClass())
				&& isDiagram((ClassDiagramJJD) domainElement)) {
			return ClassDiagramJJDEditPart.VISUAL_ID;
		}
		return -1;
	}

	/**
	* @generated
	*/
	public static int getNodeVisualID(View containerView, EObject domainElement) {
		if (domainElement == null) {
			return -1;
		}
		String containerModelID = concrete.diagram.part.ConcreteVisualIDRegistry.getModelID(containerView);
		if (!ClassDiagramJJDEditPart.MODEL_ID.equals(containerModelID) && !"concrete".equals(containerModelID)) { //$NON-NLS-1$
			return -1;
		}
		int containerVisualID;
		if (ClassDiagramJJDEditPart.MODEL_ID.equals(containerModelID)) {
			containerVisualID = concrete.diagram.part.ConcreteVisualIDRegistry.getVisualID(containerView);
		} else {
			if (containerView instanceof Diagram) {
				containerVisualID = ClassDiagramJJDEditPart.VISUAL_ID;
			} else {
				return -1;
			}
		}
		switch (containerVisualID) {
		case ClassDiagramJJDEditPart.VISUAL_ID:
			if (ConcretePackage.eINSTANCE.getPackageJJD().isSuperTypeOf(domainElement.eClass())) {
				return PackageJJDEditPart.VISUAL_ID;
			}
			if (ConcretePackage.eINSTANCE.getClassJJD().isSuperTypeOf(domainElement.eClass())) {
				return ClassJJDEditPart.VISUAL_ID;
			}
			break;
		case PackageJJDPackageJJDSubPackagesJJDCompartmentEditPart.VISUAL_ID:
			if (ConcretePackage.eINSTANCE.getPackageJJD().isSuperTypeOf(domainElement.eClass())) {
				return PackageJJD2EditPart.VISUAL_ID;
			}
			break;
		case PackageJJDPackageJJDListClassJJDCompartmentEditPart.VISUAL_ID:
			if (ConcretePackage.eINSTANCE.getClassJJD().isSuperTypeOf(domainElement.eClass())) {
				return ClassJJD2EditPart.VISUAL_ID;
			}
			break;
		case PackageJJDPackageJJDSubPackagesJJDCompartment2EditPart.VISUAL_ID:
			if (ConcretePackage.eINSTANCE.getPackageJJD().isSuperTypeOf(domainElement.eClass())) {
				return PackageJJD2EditPart.VISUAL_ID;
			}
			break;
		case PackageJJDPackageJJDListClassJJDCompartment2EditPart.VISUAL_ID:
			if (ConcretePackage.eINSTANCE.getClassJJD().isSuperTypeOf(domainElement.eClass())) {
				return ClassJJD2EditPart.VISUAL_ID;
			}
			break;
		case ClassJJDClassJJDListAttributesJJDCompartmentEditPart.VISUAL_ID:
			if (ConcretePackage.eINSTANCE.getAttributeJJD().isSuperTypeOf(domainElement.eClass())) {
				return AttributeJJDEditPart.VISUAL_ID;
			}
			break;
		case ClassJJDClassJJDListMethodsJJDCompartmentEditPart.VISUAL_ID:
			if (ConcretePackage.eINSTANCE.getMethodJJD().isSuperTypeOf(domainElement.eClass())) {
				return MethodJJDEditPart.VISUAL_ID;
			}
			break;
		case MethodJJDMethodJJDListAttributesJJDCompartmentEditPart.VISUAL_ID:
			if (ConcretePackage.eINSTANCE.getAttributeJJD().isSuperTypeOf(domainElement.eClass())) {
				return AttributeJJD2EditPart.VISUAL_ID;
			}
			break;
		case ClassJJDClassJJDListAttributesJJDCompartment2EditPart.VISUAL_ID:
			if (ConcretePackage.eINSTANCE.getAttributeJJD().isSuperTypeOf(domainElement.eClass())) {
				return AttributeJJDEditPart.VISUAL_ID;
			}
			break;
		case ClassJJDClassJJDListMethodsJJDCompartment2EditPart.VISUAL_ID:
			if (ConcretePackage.eINSTANCE.getMethodJJD().isSuperTypeOf(domainElement.eClass())) {
				return MethodJJDEditPart.VISUAL_ID;
			}
			break;
		}
		return -1;
	}

	/**
	* @generated
	*/
	public static boolean canCreateNode(View containerView, int nodeVisualID) {
		String containerModelID = concrete.diagram.part.ConcreteVisualIDRegistry.getModelID(containerView);
		if (!ClassDiagramJJDEditPart.MODEL_ID.equals(containerModelID) && !"concrete".equals(containerModelID)) { //$NON-NLS-1$
			return false;
		}
		int containerVisualID;
		if (ClassDiagramJJDEditPart.MODEL_ID.equals(containerModelID)) {
			containerVisualID = concrete.diagram.part.ConcreteVisualIDRegistry.getVisualID(containerView);
		} else {
			if (containerView instanceof Diagram) {
				containerVisualID = ClassDiagramJJDEditPart.VISUAL_ID;
			} else {
				return false;
			}
		}
		switch (containerVisualID) {
		case ClassDiagramJJDEditPart.VISUAL_ID:
			if (PackageJJDEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ClassJJDEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case PackageJJDEditPart.VISUAL_ID:
			if (PackageJJDNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (PackageJJDPackageJJDSubPackagesJJDCompartmentEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (PackageJJDPackageJJDListClassJJDCompartmentEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ClassJJDEditPart.VISUAL_ID:
			if (ClassJJDNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ClassJJDClassJJDListAttributesJJDCompartment2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ClassJJDClassJJDListMethodsJJDCompartment2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case PackageJJD2EditPart.VISUAL_ID:
			if (PackageJJDName2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (PackageJJDPackageJJDSubPackagesJJDCompartment2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (PackageJJDPackageJJDListClassJJDCompartment2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ClassJJD2EditPart.VISUAL_ID:
			if (ClassJJDName2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ClassJJDClassJJDListAttributesJJDCompartmentEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ClassJJDClassJJDListMethodsJJDCompartmentEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case AttributeJJDEditPart.VISUAL_ID:
			if (AttributeJJDNameTypeEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case MethodJJDEditPart.VISUAL_ID:
			if (MethodJJDNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (MethodJJDMethodJJDListAttributesJJDCompartmentEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case AttributeJJD2EditPart.VISUAL_ID:
			if (AttributeJJDNameType2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case PackageJJDPackageJJDSubPackagesJJDCompartmentEditPart.VISUAL_ID:
			if (PackageJJD2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case PackageJJDPackageJJDListClassJJDCompartmentEditPart.VISUAL_ID:
			if (ClassJJD2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case PackageJJDPackageJJDSubPackagesJJDCompartment2EditPart.VISUAL_ID:
			if (PackageJJD2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case PackageJJDPackageJJDListClassJJDCompartment2EditPart.VISUAL_ID:
			if (ClassJJD2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ClassJJDClassJJDListAttributesJJDCompartmentEditPart.VISUAL_ID:
			if (AttributeJJDEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ClassJJDClassJJDListMethodsJJDCompartmentEditPart.VISUAL_ID:
			if (MethodJJDEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case MethodJJDMethodJJDListAttributesJJDCompartmentEditPart.VISUAL_ID:
			if (AttributeJJD2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ClassJJDClassJJDListAttributesJJDCompartment2EditPart.VISUAL_ID:
			if (AttributeJJDEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ClassJJDClassJJDListMethodsJJDCompartment2EditPart.VISUAL_ID:
			if (MethodJJDEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case AgregationJJDEditPart.VISUAL_ID:
			if (AgregationJJDRolAEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (AgregationJJDRolBEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (AgregationJJDMultiplicityAEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (AgregationJJDMultiplicityBEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ContainmentJJDEditPart.VISUAL_ID:
			if (ContainmentJJDRolBEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ContainmentJJDRolAEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ContainmentJJDRolB2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ContainmentJJDMultiplicityAEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ContainmentJJDMultiplicityBEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case AssociationJJDEditPart.VISUAL_ID:
			if (AssociationJJDRolAEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (AssociationJJDRolBEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (AssociationJJDMultiplicityAEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (AssociationJJDMultiplicityBEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		}
		return false;
	}

	/**
	* @generated
	*/
	public static int getLinkWithClassVisualID(EObject domainElement) {
		if (domainElement == null) {
			return -1;
		}
		if (ConcretePackage.eINSTANCE.getAgregationJJD().isSuperTypeOf(domainElement.eClass())) {
			return AgregationJJDEditPart.VISUAL_ID;
		}
		if (ConcretePackage.eINSTANCE.getInheritanceJJD().isSuperTypeOf(domainElement.eClass())) {
			return InheritanceJJDEditPart.VISUAL_ID;
		}
		if (ConcretePackage.eINSTANCE.getContainmentJJD().isSuperTypeOf(domainElement.eClass())) {
			return ContainmentJJDEditPart.VISUAL_ID;
		}
		if (ConcretePackage.eINSTANCE.getAssociationJJD().isSuperTypeOf(domainElement.eClass())) {
			return AssociationJJDEditPart.VISUAL_ID;
		}
		if (ConcretePackage.eINSTANCE.getImplementJJD().isSuperTypeOf(domainElement.eClass())) {
			return ImplementJJDEditPart.VISUAL_ID;
		}
		return -1;
	}

	/**
	* User can change implementation of this method to handle some specific
	* situations not covered by default logic.
	* 
	* @generated
	*/
	private static boolean isDiagram(ClassDiagramJJD element) {
		return true;
	}

	/**
	* @generated
	*/
	public static boolean checkNodeVisualID(View containerView, EObject domainElement, int candidate) {
		if (candidate == -1) {
			//unrecognized id is always bad
			return false;
		}
		int basic = getNodeVisualID(containerView, domainElement);
		return basic == candidate;
	}

	/**
	* @generated
	*/
	public static boolean isCompartmentVisualID(int visualID) {
		switch (visualID) {
		case PackageJJDPackageJJDSubPackagesJJDCompartmentEditPart.VISUAL_ID:
		case PackageJJDPackageJJDListClassJJDCompartmentEditPart.VISUAL_ID:
		case PackageJJDPackageJJDSubPackagesJJDCompartment2EditPart.VISUAL_ID:
		case PackageJJDPackageJJDListClassJJDCompartment2EditPart.VISUAL_ID:
		case ClassJJDClassJJDListAttributesJJDCompartmentEditPart.VISUAL_ID:
		case ClassJJDClassJJDListMethodsJJDCompartmentEditPart.VISUAL_ID:
		case MethodJJDMethodJJDListAttributesJJDCompartmentEditPart.VISUAL_ID:
		case ClassJJDClassJJDListAttributesJJDCompartment2EditPart.VISUAL_ID:
		case ClassJJDClassJJDListMethodsJJDCompartment2EditPart.VISUAL_ID:
			return true;
		default:
			break;
		}
		return false;
	}

	/**
	* @generated
	*/
	public static boolean isSemanticLeafVisualID(int visualID) {
		switch (visualID) {
		case ClassDiagramJJDEditPart.VISUAL_ID:
			return false;
		case AttributeJJDEditPart.VISUAL_ID:
		case AttributeJJD2EditPart.VISUAL_ID:
			return true;
		default:
			break;
		}
		return false;
	}

	/**
	* @generated
	*/
	public static final DiagramStructure TYPED_INSTANCE = new DiagramStructure() {
		/**
		* @generated
		*/
		@Override

		public int getVisualID(View view) {
			return concrete.diagram.part.ConcreteVisualIDRegistry.getVisualID(view);
		}

		/**
		* @generated
		*/
		@Override

		public String getModelID(View view) {
			return concrete.diagram.part.ConcreteVisualIDRegistry.getModelID(view);
		}

		/**
		* @generated
		*/
		@Override

		public int getNodeVisualID(View containerView, EObject domainElement) {
			return concrete.diagram.part.ConcreteVisualIDRegistry.getNodeVisualID(containerView, domainElement);
		}

		/**
		* @generated
		*/
		@Override

		public boolean checkNodeVisualID(View containerView, EObject domainElement, int candidate) {
			return concrete.diagram.part.ConcreteVisualIDRegistry.checkNodeVisualID(containerView, domainElement,
					candidate);
		}

		/**
		* @generated
		*/
		@Override

		public boolean isCompartmentVisualID(int visualID) {
			return concrete.diagram.part.ConcreteVisualIDRegistry.isCompartmentVisualID(visualID);
		}

		/**
		* @generated
		*/
		@Override

		public boolean isSemanticLeafVisualID(int visualID) {
			return concrete.diagram.part.ConcreteVisualIDRegistry.isSemanticLeafVisualID(visualID);
		}
	};

}
