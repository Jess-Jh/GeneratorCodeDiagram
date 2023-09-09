/*
* 
*/
package concrete.diagram.part;

import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.gmf.tooling.runtime.update.DiagramUpdater;

import concrete.AgregationJJD;
import concrete.AssociationJJD;
import concrete.AttributeJJD;
import concrete.ClassDiagramJJD;
import concrete.ClassJJD;
import concrete.ConcretePackage;
import concrete.ContainmentJJD;
import concrete.ImplementJJD;
import concrete.InheritanceJJD;
import concrete.MethodJJD;
import concrete.PackageJJD;
import concrete.diagram.edit.parts.AgregationJJDEditPart;
import concrete.diagram.edit.parts.AssociationJJDEditPart;
import concrete.diagram.edit.parts.AttributeJJD2EditPart;
import concrete.diagram.edit.parts.AttributeJJDEditPart;
import concrete.diagram.edit.parts.ClassDiagramJJDEditPart;
import concrete.diagram.edit.parts.ClassJJD2EditPart;
import concrete.diagram.edit.parts.ClassJJDClassJJDListAttributesJJDCompartment2EditPart;
import concrete.diagram.edit.parts.ClassJJDClassJJDListAttributesJJDCompartmentEditPart;
import concrete.diagram.edit.parts.ClassJJDClassJJDListMethodsJJDCompartment2EditPart;
import concrete.diagram.edit.parts.ClassJJDClassJJDListMethodsJJDCompartmentEditPart;
import concrete.diagram.edit.parts.ClassJJDEditPart;
import concrete.diagram.edit.parts.ContainmentJJDEditPart;
import concrete.diagram.edit.parts.ImplementJJDEditPart;
import concrete.diagram.edit.parts.InheritanceJJDEditPart;
import concrete.diagram.edit.parts.MethodJJDEditPart;
import concrete.diagram.edit.parts.MethodJJDMethodJJDListAttributesJJDCompartmentEditPart;
import concrete.diagram.edit.parts.PackageJJD2EditPart;
import concrete.diagram.edit.parts.PackageJJDEditPart;
import concrete.diagram.edit.parts.PackageJJDPackageJJDListClassJJDCompartment2EditPart;
import concrete.diagram.edit.parts.PackageJJDPackageJJDListClassJJDCompartmentEditPart;
import concrete.diagram.edit.parts.PackageJJDPackageJJDSubPackagesJJDCompartment2EditPart;
import concrete.diagram.edit.parts.PackageJJDPackageJJDSubPackagesJJDCompartmentEditPart;
import concrete.diagram.providers.ConcreteElementTypes;

/**
 * @generated
 */
public class ConcreteDiagramUpdater {

	/**
	* @generated
	*/
	public static boolean isShortcutOrphaned(View view) {
		return !view.isSetElement() || view.getElement() == null || view.getElement().eIsProxy();
	}

	/**
	* @generated
	*/
	public static List<ConcreteNodeDescriptor> getSemanticChildren(View view) {
		switch (ConcreteVisualIDRegistry.getVisualID(view)) {
		case ClassDiagramJJDEditPart.VISUAL_ID:
			return getClassDiagramJJD_1000SemanticChildren(view);
		case PackageJJDPackageJJDSubPackagesJJDCompartmentEditPart.VISUAL_ID:
			return getPackageJJDPackageJJDSubPackagesJJDCompartment_7001SemanticChildren(view);
		case PackageJJDPackageJJDListClassJJDCompartmentEditPart.VISUAL_ID:
			return getPackageJJDPackageJJDListClassJJDCompartment_7002SemanticChildren(view);
		case PackageJJDPackageJJDSubPackagesJJDCompartment2EditPart.VISUAL_ID:
			return getPackageJJDPackageJJDSubPackagesJJDCompartment_7003SemanticChildren(view);
		case PackageJJDPackageJJDListClassJJDCompartment2EditPart.VISUAL_ID:
			return getPackageJJDPackageJJDListClassJJDCompartment_7004SemanticChildren(view);
		case ClassJJDClassJJDListAttributesJJDCompartmentEditPart.VISUAL_ID:
			return getClassJJDClassJJDListAttributesJJDCompartment_7005SemanticChildren(view);
		case ClassJJDClassJJDListMethodsJJDCompartmentEditPart.VISUAL_ID:
			return getClassJJDClassJJDListMethodsJJDCompartment_7006SemanticChildren(view);
		case MethodJJDMethodJJDListAttributesJJDCompartmentEditPart.VISUAL_ID:
			return getMethodJJDMethodJJDListAttributesJJDCompartment_7007SemanticChildren(view);
		case ClassJJDClassJJDListAttributesJJDCompartment2EditPart.VISUAL_ID:
			return getClassJJDClassJJDListAttributesJJDCompartment_7008SemanticChildren(view);
		case ClassJJDClassJJDListMethodsJJDCompartment2EditPart.VISUAL_ID:
			return getClassJJDClassJJDListMethodsJJDCompartment_7009SemanticChildren(view);
		}
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<ConcreteNodeDescriptor> getClassDiagramJJD_1000SemanticChildren(View view) {
		if (!view.isSetElement()) {
			return Collections.emptyList();
		}
		ClassDiagramJJD modelElement = (ClassDiagramJJD) view.getElement();
		LinkedList<ConcreteNodeDescriptor> result = new LinkedList<ConcreteNodeDescriptor>();
		for (Iterator<?> it = modelElement.getListPackagesJJD().iterator(); it.hasNext();) {
			PackageJJD childElement = (PackageJJD) it.next();
			int visualID = ConcreteVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == PackageJJDEditPart.VISUAL_ID) {
				result.add(new ConcreteNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		for (Iterator<?> it = modelElement.getListClassJJD().iterator(); it.hasNext();) {
			ClassJJD childElement = (ClassJJD) it.next();
			int visualID = ConcreteVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == ClassJJDEditPart.VISUAL_ID) {
				result.add(new ConcreteNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	* @generated
	*/
	public static List<ConcreteNodeDescriptor> getPackageJJDPackageJJDSubPackagesJJDCompartment_7001SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		PackageJJD modelElement = (PackageJJD) containerView.getElement();
		LinkedList<ConcreteNodeDescriptor> result = new LinkedList<ConcreteNodeDescriptor>();
		for (Iterator<?> it = modelElement.getSubPackagesJJD().iterator(); it.hasNext();) {
			PackageJJD childElement = (PackageJJD) it.next();
			int visualID = ConcreteVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == PackageJJD2EditPart.VISUAL_ID) {
				result.add(new ConcreteNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	* @generated
	*/
	public static List<ConcreteNodeDescriptor> getPackageJJDPackageJJDListClassJJDCompartment_7002SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		PackageJJD modelElement = (PackageJJD) containerView.getElement();
		LinkedList<ConcreteNodeDescriptor> result = new LinkedList<ConcreteNodeDescriptor>();
		for (Iterator<?> it = modelElement.getListClassJJD().iterator(); it.hasNext();) {
			ClassJJD childElement = (ClassJJD) it.next();
			int visualID = ConcreteVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == ClassJJD2EditPart.VISUAL_ID) {
				result.add(new ConcreteNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	* @generated
	*/
	public static List<ConcreteNodeDescriptor> getPackageJJDPackageJJDSubPackagesJJDCompartment_7003SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		PackageJJD modelElement = (PackageJJD) containerView.getElement();
		LinkedList<ConcreteNodeDescriptor> result = new LinkedList<ConcreteNodeDescriptor>();
		for (Iterator<?> it = modelElement.getSubPackagesJJD().iterator(); it.hasNext();) {
			PackageJJD childElement = (PackageJJD) it.next();
			int visualID = ConcreteVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == PackageJJD2EditPart.VISUAL_ID) {
				result.add(new ConcreteNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	* @generated
	*/
	public static List<ConcreteNodeDescriptor> getPackageJJDPackageJJDListClassJJDCompartment_7004SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		PackageJJD modelElement = (PackageJJD) containerView.getElement();
		LinkedList<ConcreteNodeDescriptor> result = new LinkedList<ConcreteNodeDescriptor>();
		for (Iterator<?> it = modelElement.getListClassJJD().iterator(); it.hasNext();) {
			ClassJJD childElement = (ClassJJD) it.next();
			int visualID = ConcreteVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == ClassJJD2EditPart.VISUAL_ID) {
				result.add(new ConcreteNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	* @generated
	*/
	public static List<ConcreteNodeDescriptor> getClassJJDClassJJDListAttributesJJDCompartment_7005SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		ClassJJD modelElement = (ClassJJD) containerView.getElement();
		LinkedList<ConcreteNodeDescriptor> result = new LinkedList<ConcreteNodeDescriptor>();
		for (Iterator<?> it = modelElement.getListAttributesJJD().iterator(); it.hasNext();) {
			AttributeJJD childElement = (AttributeJJD) it.next();
			int visualID = ConcreteVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == AttributeJJDEditPart.VISUAL_ID) {
				result.add(new ConcreteNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	* @generated
	*/
	public static List<ConcreteNodeDescriptor> getClassJJDClassJJDListMethodsJJDCompartment_7006SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		ClassJJD modelElement = (ClassJJD) containerView.getElement();
		LinkedList<ConcreteNodeDescriptor> result = new LinkedList<ConcreteNodeDescriptor>();
		for (Iterator<?> it = modelElement.getListMethodsJJD().iterator(); it.hasNext();) {
			MethodJJD childElement = (MethodJJD) it.next();
			int visualID = ConcreteVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == MethodJJDEditPart.VISUAL_ID) {
				result.add(new ConcreteNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	* @generated
	*/
	public static List<ConcreteNodeDescriptor> getMethodJJDMethodJJDListAttributesJJDCompartment_7007SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		MethodJJD modelElement = (MethodJJD) containerView.getElement();
		LinkedList<ConcreteNodeDescriptor> result = new LinkedList<ConcreteNodeDescriptor>();
		for (Iterator<?> it = modelElement.getListAttributesJJD().iterator(); it.hasNext();) {
			AttributeJJD childElement = (AttributeJJD) it.next();
			int visualID = ConcreteVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == AttributeJJD2EditPart.VISUAL_ID) {
				result.add(new ConcreteNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	* @generated
	*/
	public static List<ConcreteNodeDescriptor> getClassJJDClassJJDListAttributesJJDCompartment_7008SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		ClassJJD modelElement = (ClassJJD) containerView.getElement();
		LinkedList<ConcreteNodeDescriptor> result = new LinkedList<ConcreteNodeDescriptor>();
		for (Iterator<?> it = modelElement.getListAttributesJJD().iterator(); it.hasNext();) {
			AttributeJJD childElement = (AttributeJJD) it.next();
			int visualID = ConcreteVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == AttributeJJDEditPart.VISUAL_ID) {
				result.add(new ConcreteNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	* @generated
	*/
	public static List<ConcreteNodeDescriptor> getClassJJDClassJJDListMethodsJJDCompartment_7009SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		ClassJJD modelElement = (ClassJJD) containerView.getElement();
		LinkedList<ConcreteNodeDescriptor> result = new LinkedList<ConcreteNodeDescriptor>();
		for (Iterator<?> it = modelElement.getListMethodsJJD().iterator(); it.hasNext();) {
			MethodJJD childElement = (MethodJJD) it.next();
			int visualID = ConcreteVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == MethodJJDEditPart.VISUAL_ID) {
				result.add(new ConcreteNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	* @generated
	*/
	public static List<ConcreteLinkDescriptor> getContainedLinks(View view) {
		switch (ConcreteVisualIDRegistry.getVisualID(view)) {
		case ClassDiagramJJDEditPart.VISUAL_ID:
			return getClassDiagramJJD_1000ContainedLinks(view);
		case PackageJJDEditPart.VISUAL_ID:
			return getPackageJJD_2001ContainedLinks(view);
		case ClassJJDEditPart.VISUAL_ID:
			return getClassJJD_2002ContainedLinks(view);
		case PackageJJD2EditPart.VISUAL_ID:
			return getPackageJJD_3001ContainedLinks(view);
		case ClassJJD2EditPart.VISUAL_ID:
			return getClassJJD_3002ContainedLinks(view);
		case AttributeJJDEditPart.VISUAL_ID:
			return getAttributeJJD_3003ContainedLinks(view);
		case MethodJJDEditPart.VISUAL_ID:
			return getMethodJJD_3004ContainedLinks(view);
		case AttributeJJD2EditPart.VISUAL_ID:
			return getAttributeJJD_3005ContainedLinks(view);
		case AgregationJJDEditPart.VISUAL_ID:
			return getAgregationJJD_4001ContainedLinks(view);
		case InheritanceJJDEditPart.VISUAL_ID:
			return getInheritanceJJD_4002ContainedLinks(view);
		case ContainmentJJDEditPart.VISUAL_ID:
			return getContainmentJJD_4003ContainedLinks(view);
		case AssociationJJDEditPart.VISUAL_ID:
			return getAssociationJJD_4004ContainedLinks(view);
		case ImplementJJDEditPart.VISUAL_ID:
			return getImplementJJD_4005ContainedLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<ConcreteLinkDescriptor> getIncomingLinks(View view) {
		switch (ConcreteVisualIDRegistry.getVisualID(view)) {
		case PackageJJDEditPart.VISUAL_ID:
			return getPackageJJD_2001IncomingLinks(view);
		case ClassJJDEditPart.VISUAL_ID:
			return getClassJJD_2002IncomingLinks(view);
		case PackageJJD2EditPart.VISUAL_ID:
			return getPackageJJD_3001IncomingLinks(view);
		case ClassJJD2EditPart.VISUAL_ID:
			return getClassJJD_3002IncomingLinks(view);
		case AttributeJJDEditPart.VISUAL_ID:
			return getAttributeJJD_3003IncomingLinks(view);
		case MethodJJDEditPart.VISUAL_ID:
			return getMethodJJD_3004IncomingLinks(view);
		case AttributeJJD2EditPart.VISUAL_ID:
			return getAttributeJJD_3005IncomingLinks(view);
		case AgregationJJDEditPart.VISUAL_ID:
			return getAgregationJJD_4001IncomingLinks(view);
		case InheritanceJJDEditPart.VISUAL_ID:
			return getInheritanceJJD_4002IncomingLinks(view);
		case ContainmentJJDEditPart.VISUAL_ID:
			return getContainmentJJD_4003IncomingLinks(view);
		case AssociationJJDEditPart.VISUAL_ID:
			return getAssociationJJD_4004IncomingLinks(view);
		case ImplementJJDEditPart.VISUAL_ID:
			return getImplementJJD_4005IncomingLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<ConcreteLinkDescriptor> getOutgoingLinks(View view) {
		switch (ConcreteVisualIDRegistry.getVisualID(view)) {
		case PackageJJDEditPart.VISUAL_ID:
			return getPackageJJD_2001OutgoingLinks(view);
		case ClassJJDEditPart.VISUAL_ID:
			return getClassJJD_2002OutgoingLinks(view);
		case PackageJJD2EditPart.VISUAL_ID:
			return getPackageJJD_3001OutgoingLinks(view);
		case ClassJJD2EditPart.VISUAL_ID:
			return getClassJJD_3002OutgoingLinks(view);
		case AttributeJJDEditPart.VISUAL_ID:
			return getAttributeJJD_3003OutgoingLinks(view);
		case MethodJJDEditPart.VISUAL_ID:
			return getMethodJJD_3004OutgoingLinks(view);
		case AttributeJJD2EditPart.VISUAL_ID:
			return getAttributeJJD_3005OutgoingLinks(view);
		case AgregationJJDEditPart.VISUAL_ID:
			return getAgregationJJD_4001OutgoingLinks(view);
		case InheritanceJJDEditPart.VISUAL_ID:
			return getInheritanceJJD_4002OutgoingLinks(view);
		case ContainmentJJDEditPart.VISUAL_ID:
			return getContainmentJJD_4003OutgoingLinks(view);
		case AssociationJJDEditPart.VISUAL_ID:
			return getAssociationJJD_4004OutgoingLinks(view);
		case ImplementJJDEditPart.VISUAL_ID:
			return getImplementJJD_4005OutgoingLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ConcreteLinkDescriptor> getClassDiagramJJD_1000ContainedLinks(View view) {
		ClassDiagramJJD modelElement = (ClassDiagramJJD) view.getElement();
		LinkedList<ConcreteLinkDescriptor> result = new LinkedList<ConcreteLinkDescriptor>();
		result.addAll(getContainedTypeModelFacetLinks_AgregationJJD_4001(modelElement));
		result.addAll(getContainedTypeModelFacetLinks_InheritanceJJD_4002(modelElement));
		result.addAll(getContainedTypeModelFacetLinks_ContainmentJJD_4003(modelElement));
		result.addAll(getContainedTypeModelFacetLinks_AssociationJJD_4004(modelElement));
		result.addAll(getContainedTypeModelFacetLinks_ImplementJJD_4005(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<ConcreteLinkDescriptor> getPackageJJD_2001ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ConcreteLinkDescriptor> getClassJJD_2002ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ConcreteLinkDescriptor> getPackageJJD_3001ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ConcreteLinkDescriptor> getClassJJD_3002ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ConcreteLinkDescriptor> getAttributeJJD_3003ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ConcreteLinkDescriptor> getMethodJJD_3004ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ConcreteLinkDescriptor> getAttributeJJD_3005ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ConcreteLinkDescriptor> getAgregationJJD_4001ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ConcreteLinkDescriptor> getInheritanceJJD_4002ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ConcreteLinkDescriptor> getContainmentJJD_4003ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ConcreteLinkDescriptor> getAssociationJJD_4004ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ConcreteLinkDescriptor> getImplementJJD_4005ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ConcreteLinkDescriptor> getPackageJJD_2001IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ConcreteLinkDescriptor> getClassJJD_2002IncomingLinks(View view) {
		ClassJJD modelElement = (ClassJJD) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<ConcreteLinkDescriptor> result = new LinkedList<ConcreteLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_AgregationJJD_4001(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_InheritanceJJD_4002(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_ContainmentJJD_4003(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_AssociationJJD_4004(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_ImplementJJD_4005(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<ConcreteLinkDescriptor> getPackageJJD_3001IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ConcreteLinkDescriptor> getClassJJD_3002IncomingLinks(View view) {
		ClassJJD modelElement = (ClassJJD) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<ConcreteLinkDescriptor> result = new LinkedList<ConcreteLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_AgregationJJD_4001(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_InheritanceJJD_4002(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_ContainmentJJD_4003(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_AssociationJJD_4004(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_ImplementJJD_4005(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<ConcreteLinkDescriptor> getAttributeJJD_3003IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ConcreteLinkDescriptor> getMethodJJD_3004IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ConcreteLinkDescriptor> getAttributeJJD_3005IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ConcreteLinkDescriptor> getAgregationJJD_4001IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ConcreteLinkDescriptor> getInheritanceJJD_4002IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ConcreteLinkDescriptor> getContainmentJJD_4003IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ConcreteLinkDescriptor> getAssociationJJD_4004IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ConcreteLinkDescriptor> getImplementJJD_4005IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ConcreteLinkDescriptor> getPackageJJD_2001OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ConcreteLinkDescriptor> getClassJJD_2002OutgoingLinks(View view) {
		ClassJJD modelElement = (ClassJJD) view.getElement();
		LinkedList<ConcreteLinkDescriptor> result = new LinkedList<ConcreteLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_AgregationJJD_4001(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_InheritanceJJD_4002(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_ContainmentJJD_4003(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_AssociationJJD_4004(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_ImplementJJD_4005(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<ConcreteLinkDescriptor> getPackageJJD_3001OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ConcreteLinkDescriptor> getClassJJD_3002OutgoingLinks(View view) {
		ClassJJD modelElement = (ClassJJD) view.getElement();
		LinkedList<ConcreteLinkDescriptor> result = new LinkedList<ConcreteLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_AgregationJJD_4001(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_InheritanceJJD_4002(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_ContainmentJJD_4003(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_AssociationJJD_4004(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_ImplementJJD_4005(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<ConcreteLinkDescriptor> getAttributeJJD_3003OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ConcreteLinkDescriptor> getMethodJJD_3004OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ConcreteLinkDescriptor> getAttributeJJD_3005OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ConcreteLinkDescriptor> getAgregationJJD_4001OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ConcreteLinkDescriptor> getInheritanceJJD_4002OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ConcreteLinkDescriptor> getContainmentJJD_4003OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ConcreteLinkDescriptor> getAssociationJJD_4004OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ConcreteLinkDescriptor> getImplementJJD_4005OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	private static Collection<ConcreteLinkDescriptor> getContainedTypeModelFacetLinks_AgregationJJD_4001(
			ClassDiagramJJD container) {
		LinkedList<ConcreteLinkDescriptor> result = new LinkedList<ConcreteLinkDescriptor>();
		for (Iterator<?> links = container.getListRelationsJJD().iterator(); links.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof AgregationJJD) {
				continue;
			}
			AgregationJJD link = (AgregationJJD) linkObject;
			if (AgregationJJDEditPart.VISUAL_ID != ConcreteVisualIDRegistry.getLinkWithClassVisualID(link)) {
				continue;
			}
			ClassJJD dst = link.getTarget();
			ClassJJD src = link.getSource();
			result.add(new ConcreteLinkDescriptor(src, dst, link, ConcreteElementTypes.AgregationJJD_4001,
					AgregationJJDEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	* @generated
	*/
	private static Collection<ConcreteLinkDescriptor> getContainedTypeModelFacetLinks_InheritanceJJD_4002(
			ClassDiagramJJD container) {
		LinkedList<ConcreteLinkDescriptor> result = new LinkedList<ConcreteLinkDescriptor>();
		for (Iterator<?> links = container.getListRelationsJJD().iterator(); links.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof InheritanceJJD) {
				continue;
			}
			InheritanceJJD link = (InheritanceJJD) linkObject;
			if (InheritanceJJDEditPart.VISUAL_ID != ConcreteVisualIDRegistry.getLinkWithClassVisualID(link)) {
				continue;
			}
			ClassJJD dst = link.getTarget();
			ClassJJD src = link.getSource();
			result.add(new ConcreteLinkDescriptor(src, dst, link, ConcreteElementTypes.InheritanceJJD_4002,
					InheritanceJJDEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	* @generated
	*/
	private static Collection<ConcreteLinkDescriptor> getContainedTypeModelFacetLinks_ContainmentJJD_4003(
			ClassDiagramJJD container) {
		LinkedList<ConcreteLinkDescriptor> result = new LinkedList<ConcreteLinkDescriptor>();
		for (Iterator<?> links = container.getListRelationsJJD().iterator(); links.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof ContainmentJJD) {
				continue;
			}
			ContainmentJJD link = (ContainmentJJD) linkObject;
			if (ContainmentJJDEditPart.VISUAL_ID != ConcreteVisualIDRegistry.getLinkWithClassVisualID(link)) {
				continue;
			}
			ClassJJD dst = link.getTarget();
			ClassJJD src = link.getSource();
			result.add(new ConcreteLinkDescriptor(src, dst, link, ConcreteElementTypes.ContainmentJJD_4003,
					ContainmentJJDEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	* @generated
	*/
	private static Collection<ConcreteLinkDescriptor> getContainedTypeModelFacetLinks_AssociationJJD_4004(
			ClassDiagramJJD container) {
		LinkedList<ConcreteLinkDescriptor> result = new LinkedList<ConcreteLinkDescriptor>();
		for (Iterator<?> links = container.getListRelationsJJD().iterator(); links.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof AssociationJJD) {
				continue;
			}
			AssociationJJD link = (AssociationJJD) linkObject;
			if (AssociationJJDEditPart.VISUAL_ID != ConcreteVisualIDRegistry.getLinkWithClassVisualID(link)) {
				continue;
			}
			ClassJJD dst = link.getTarget();
			ClassJJD src = link.getSource();
			result.add(new ConcreteLinkDescriptor(src, dst, link, ConcreteElementTypes.AssociationJJD_4004,
					AssociationJJDEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	* @generated
	*/
	private static Collection<ConcreteLinkDescriptor> getContainedTypeModelFacetLinks_ImplementJJD_4005(
			ClassDiagramJJD container) {
		LinkedList<ConcreteLinkDescriptor> result = new LinkedList<ConcreteLinkDescriptor>();
		for (Iterator<?> links = container.getListRelationsJJD().iterator(); links.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof ImplementJJD) {
				continue;
			}
			ImplementJJD link = (ImplementJJD) linkObject;
			if (ImplementJJDEditPart.VISUAL_ID != ConcreteVisualIDRegistry.getLinkWithClassVisualID(link)) {
				continue;
			}
			ClassJJD dst = link.getTarget();
			ClassJJD src = link.getSource();
			result.add(new ConcreteLinkDescriptor(src, dst, link, ConcreteElementTypes.ImplementJJD_4005,
					ImplementJJDEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<ConcreteLinkDescriptor> getIncomingTypeModelFacetLinks_AgregationJJD_4001(ClassJJD target,
			Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<ConcreteLinkDescriptor> result = new LinkedList<ConcreteLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() != ConcretePackage.eINSTANCE.getRelationJJD_Target()
					|| false == setting.getEObject() instanceof AgregationJJD) {
				continue;
			}
			AgregationJJD link = (AgregationJJD) setting.getEObject();
			if (AgregationJJDEditPart.VISUAL_ID != ConcreteVisualIDRegistry.getLinkWithClassVisualID(link)) {
				continue;
			}
			ClassJJD src = link.getSource();
			result.add(new ConcreteLinkDescriptor(src, target, link, ConcreteElementTypes.AgregationJJD_4001,
					AgregationJJDEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<ConcreteLinkDescriptor> getIncomingTypeModelFacetLinks_InheritanceJJD_4002(
			ClassJJD target, Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<ConcreteLinkDescriptor> result = new LinkedList<ConcreteLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() != ConcretePackage.eINSTANCE.getRelationJJD_Target()
					|| false == setting.getEObject() instanceof InheritanceJJD) {
				continue;
			}
			InheritanceJJD link = (InheritanceJJD) setting.getEObject();
			if (InheritanceJJDEditPart.VISUAL_ID != ConcreteVisualIDRegistry.getLinkWithClassVisualID(link)) {
				continue;
			}
			ClassJJD src = link.getSource();
			result.add(new ConcreteLinkDescriptor(src, target, link, ConcreteElementTypes.InheritanceJJD_4002,
					InheritanceJJDEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<ConcreteLinkDescriptor> getIncomingTypeModelFacetLinks_ContainmentJJD_4003(
			ClassJJD target, Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<ConcreteLinkDescriptor> result = new LinkedList<ConcreteLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() != ConcretePackage.eINSTANCE.getRelationJJD_Target()
					|| false == setting.getEObject() instanceof ContainmentJJD) {
				continue;
			}
			ContainmentJJD link = (ContainmentJJD) setting.getEObject();
			if (ContainmentJJDEditPart.VISUAL_ID != ConcreteVisualIDRegistry.getLinkWithClassVisualID(link)) {
				continue;
			}
			ClassJJD src = link.getSource();
			result.add(new ConcreteLinkDescriptor(src, target, link, ConcreteElementTypes.ContainmentJJD_4003,
					ContainmentJJDEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<ConcreteLinkDescriptor> getIncomingTypeModelFacetLinks_AssociationJJD_4004(
			ClassJJD target, Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<ConcreteLinkDescriptor> result = new LinkedList<ConcreteLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() != ConcretePackage.eINSTANCE.getRelationJJD_Target()
					|| false == setting.getEObject() instanceof AssociationJJD) {
				continue;
			}
			AssociationJJD link = (AssociationJJD) setting.getEObject();
			if (AssociationJJDEditPart.VISUAL_ID != ConcreteVisualIDRegistry.getLinkWithClassVisualID(link)) {
				continue;
			}
			ClassJJD src = link.getSource();
			result.add(new ConcreteLinkDescriptor(src, target, link, ConcreteElementTypes.AssociationJJD_4004,
					AssociationJJDEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<ConcreteLinkDescriptor> getIncomingTypeModelFacetLinks_ImplementJJD_4005(ClassJJD target,
			Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<ConcreteLinkDescriptor> result = new LinkedList<ConcreteLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() != ConcretePackage.eINSTANCE.getRelationJJD_Target()
					|| false == setting.getEObject() instanceof ImplementJJD) {
				continue;
			}
			ImplementJJD link = (ImplementJJD) setting.getEObject();
			if (ImplementJJDEditPart.VISUAL_ID != ConcreteVisualIDRegistry.getLinkWithClassVisualID(link)) {
				continue;
			}
			ClassJJD src = link.getSource();
			result.add(new ConcreteLinkDescriptor(src, target, link, ConcreteElementTypes.ImplementJJD_4005,
					ImplementJJDEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	* @generated
	*/
	private static Collection<ConcreteLinkDescriptor> getOutgoingTypeModelFacetLinks_AgregationJJD_4001(
			ClassJJD source) {
		ClassDiagramJJD container = null;
		// Find container element for the link.
		// Climb up by containment hierarchy starting from the source
		// and return the first element that is instance of the container class.
		for (EObject element = source; element != null && container == null; element = element.eContainer()) {
			if (element instanceof ClassDiagramJJD) {
				container = (ClassDiagramJJD) element;
			}
		}
		if (container == null) {
			return Collections.emptyList();
		}
		LinkedList<ConcreteLinkDescriptor> result = new LinkedList<ConcreteLinkDescriptor>();
		for (Iterator<?> links = container.getListRelationsJJD().iterator(); links.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof AgregationJJD) {
				continue;
			}
			AgregationJJD link = (AgregationJJD) linkObject;
			if (AgregationJJDEditPart.VISUAL_ID != ConcreteVisualIDRegistry.getLinkWithClassVisualID(link)) {
				continue;
			}
			ClassJJD dst = link.getTarget();
			ClassJJD src = link.getSource();
			if (src != source) {
				continue;
			}
			result.add(new ConcreteLinkDescriptor(src, dst, link, ConcreteElementTypes.AgregationJJD_4001,
					AgregationJJDEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	* @generated
	*/
	private static Collection<ConcreteLinkDescriptor> getOutgoingTypeModelFacetLinks_InheritanceJJD_4002(
			ClassJJD source) {
		ClassDiagramJJD container = null;
		// Find container element for the link.
		// Climb up by containment hierarchy starting from the source
		// and return the first element that is instance of the container class.
		for (EObject element = source; element != null && container == null; element = element.eContainer()) {
			if (element instanceof ClassDiagramJJD) {
				container = (ClassDiagramJJD) element;
			}
		}
		if (container == null) {
			return Collections.emptyList();
		}
		LinkedList<ConcreteLinkDescriptor> result = new LinkedList<ConcreteLinkDescriptor>();
		for (Iterator<?> links = container.getListRelationsJJD().iterator(); links.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof InheritanceJJD) {
				continue;
			}
			InheritanceJJD link = (InheritanceJJD) linkObject;
			if (InheritanceJJDEditPart.VISUAL_ID != ConcreteVisualIDRegistry.getLinkWithClassVisualID(link)) {
				continue;
			}
			ClassJJD dst = link.getTarget();
			ClassJJD src = link.getSource();
			if (src != source) {
				continue;
			}
			result.add(new ConcreteLinkDescriptor(src, dst, link, ConcreteElementTypes.InheritanceJJD_4002,
					InheritanceJJDEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	* @generated
	*/
	private static Collection<ConcreteLinkDescriptor> getOutgoingTypeModelFacetLinks_ContainmentJJD_4003(
			ClassJJD source) {
		ClassDiagramJJD container = null;
		// Find container element for the link.
		// Climb up by containment hierarchy starting from the source
		// and return the first element that is instance of the container class.
		for (EObject element = source; element != null && container == null; element = element.eContainer()) {
			if (element instanceof ClassDiagramJJD) {
				container = (ClassDiagramJJD) element;
			}
		}
		if (container == null) {
			return Collections.emptyList();
		}
		LinkedList<ConcreteLinkDescriptor> result = new LinkedList<ConcreteLinkDescriptor>();
		for (Iterator<?> links = container.getListRelationsJJD().iterator(); links.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof ContainmentJJD) {
				continue;
			}
			ContainmentJJD link = (ContainmentJJD) linkObject;
			if (ContainmentJJDEditPart.VISUAL_ID != ConcreteVisualIDRegistry.getLinkWithClassVisualID(link)) {
				continue;
			}
			ClassJJD dst = link.getTarget();
			ClassJJD src = link.getSource();
			if (src != source) {
				continue;
			}
			result.add(new ConcreteLinkDescriptor(src, dst, link, ConcreteElementTypes.ContainmentJJD_4003,
					ContainmentJJDEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	* @generated
	*/
	private static Collection<ConcreteLinkDescriptor> getOutgoingTypeModelFacetLinks_AssociationJJD_4004(
			ClassJJD source) {
		ClassDiagramJJD container = null;
		// Find container element for the link.
		// Climb up by containment hierarchy starting from the source
		// and return the first element that is instance of the container class.
		for (EObject element = source; element != null && container == null; element = element.eContainer()) {
			if (element instanceof ClassDiagramJJD) {
				container = (ClassDiagramJJD) element;
			}
		}
		if (container == null) {
			return Collections.emptyList();
		}
		LinkedList<ConcreteLinkDescriptor> result = new LinkedList<ConcreteLinkDescriptor>();
		for (Iterator<?> links = container.getListRelationsJJD().iterator(); links.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof AssociationJJD) {
				continue;
			}
			AssociationJJD link = (AssociationJJD) linkObject;
			if (AssociationJJDEditPart.VISUAL_ID != ConcreteVisualIDRegistry.getLinkWithClassVisualID(link)) {
				continue;
			}
			ClassJJD dst = link.getTarget();
			ClassJJD src = link.getSource();
			if (src != source) {
				continue;
			}
			result.add(new ConcreteLinkDescriptor(src, dst, link, ConcreteElementTypes.AssociationJJD_4004,
					AssociationJJDEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	* @generated
	*/
	private static Collection<ConcreteLinkDescriptor> getOutgoingTypeModelFacetLinks_ImplementJJD_4005(
			ClassJJD source) {
		ClassDiagramJJD container = null;
		// Find container element for the link.
		// Climb up by containment hierarchy starting from the source
		// and return the first element that is instance of the container class.
		for (EObject element = source; element != null && container == null; element = element.eContainer()) {
			if (element instanceof ClassDiagramJJD) {
				container = (ClassDiagramJJD) element;
			}
		}
		if (container == null) {
			return Collections.emptyList();
		}
		LinkedList<ConcreteLinkDescriptor> result = new LinkedList<ConcreteLinkDescriptor>();
		for (Iterator<?> links = container.getListRelationsJJD().iterator(); links.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof ImplementJJD) {
				continue;
			}
			ImplementJJD link = (ImplementJJD) linkObject;
			if (ImplementJJDEditPart.VISUAL_ID != ConcreteVisualIDRegistry.getLinkWithClassVisualID(link)) {
				continue;
			}
			ClassJJD dst = link.getTarget();
			ClassJJD src = link.getSource();
			if (src != source) {
				continue;
			}
			result.add(new ConcreteLinkDescriptor(src, dst, link, ConcreteElementTypes.ImplementJJD_4005,
					ImplementJJDEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	* @generated
	*/
	public static final DiagramUpdater TYPED_INSTANCE = new DiagramUpdater() {
		/**
		* @generated
		*/
		@Override

		public List<ConcreteNodeDescriptor> getSemanticChildren(View view) {
			return ConcreteDiagramUpdater.getSemanticChildren(view);
		}

		/**
		* @generated
		*/
		@Override

		public List<ConcreteLinkDescriptor> getContainedLinks(View view) {
			return ConcreteDiagramUpdater.getContainedLinks(view);
		}

		/**
		* @generated
		*/
		@Override

		public List<ConcreteLinkDescriptor> getIncomingLinks(View view) {
			return ConcreteDiagramUpdater.getIncomingLinks(view);
		}

		/**
		* @generated
		*/
		@Override

		public List<ConcreteLinkDescriptor> getOutgoingLinks(View view) {
			return ConcreteDiagramUpdater.getOutgoingLinks(view);
		}
	};

}
