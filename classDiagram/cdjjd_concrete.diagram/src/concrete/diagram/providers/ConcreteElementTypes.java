/*
 * 
 */
package concrete.diagram.providers;

import java.util.HashSet;
import java.util.IdentityHashMap;
import java.util.Map;
import java.util.Set;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.emf.ecore.ENamedElement;
import org.eclipse.gmf.runtime.emf.type.core.ElementTypeRegistry;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.tooling.runtime.providers.DiagramElementTypeImages;
import org.eclipse.gmf.tooling.runtime.providers.DiagramElementTypes;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.swt.graphics.Image;

import concrete.ConcretePackage;
import concrete.diagram.edit.parts.AgregationJJDEditPart;
import concrete.diagram.edit.parts.AssociationJJDEditPart;
import concrete.diagram.edit.parts.AttributeJJD2EditPart;
import concrete.diagram.edit.parts.AttributeJJDEditPart;
import concrete.diagram.edit.parts.ClassDiagramJJDEditPart;
import concrete.diagram.edit.parts.ClassJJD2EditPart;
import concrete.diagram.edit.parts.ClassJJDEditPart;
import concrete.diagram.edit.parts.ContainmentJJDEditPart;
import concrete.diagram.edit.parts.ImplementJJDEditPart;
import concrete.diagram.edit.parts.InheritanceJJDEditPart;
import concrete.diagram.edit.parts.MethodJJDEditPart;
import concrete.diagram.edit.parts.PackageJJD2EditPart;
import concrete.diagram.edit.parts.PackageJJDEditPart;
import concrete.diagram.part.ConcreteDiagramEditorPlugin;

/**
 * @generated
 */
public class ConcreteElementTypes {

	/**
	* @generated
	*/
	private ConcreteElementTypes() {
	}

	/**
	* @generated
	*/
	private static Map<IElementType, ENamedElement> elements;

	/**
	* @generated
	*/
	private static DiagramElementTypeImages elementTypeImages = new DiagramElementTypeImages(
			ConcreteDiagramEditorPlugin.getInstance().getItemProvidersAdapterFactory());

	/**
	* @generated
	*/
	private static Set<IElementType> KNOWN_ELEMENT_TYPES;

	/**
	* @generated
	*/
	public static final IElementType ClassDiagramJJD_1000 = getElementType(
			"cdjjd_concrete.diagram.ClassDiagramJJD_1000"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType PackageJJD_2001 = getElementType("cdjjd_concrete.diagram.PackageJJD_2001"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType ClassJJD_2002 = getElementType("cdjjd_concrete.diagram.ClassJJD_2002"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType PackageJJD_3001 = getElementType("cdjjd_concrete.diagram.PackageJJD_3001"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType ClassJJD_3002 = getElementType("cdjjd_concrete.diagram.ClassJJD_3002"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType AttributeJJD_3003 = getElementType("cdjjd_concrete.diagram.AttributeJJD_3003"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType MethodJJD_3004 = getElementType("cdjjd_concrete.diagram.MethodJJD_3004"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType AttributeJJD_3005 = getElementType("cdjjd_concrete.diagram.AttributeJJD_3005"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType AgregationJJD_4001 = getElementType("cdjjd_concrete.diagram.AgregationJJD_4001"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType InheritanceJJD_4002 = getElementType("cdjjd_concrete.diagram.InheritanceJJD_4002"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType ContainmentJJD_4003 = getElementType("cdjjd_concrete.diagram.ContainmentJJD_4003"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType AssociationJJD_4004 = getElementType("cdjjd_concrete.diagram.AssociationJJD_4004"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType ImplementJJD_4005 = getElementType("cdjjd_concrete.diagram.ImplementJJD_4005"); //$NON-NLS-1$

	/**
	* @generated
	*/
	public static ImageDescriptor getImageDescriptor(ENamedElement element) {
		return elementTypeImages.getImageDescriptor(element);
	}

	/**
	* @generated
	*/
	public static Image getImage(ENamedElement element) {
		return elementTypeImages.getImage(element);
	}

	/**
	* @generated
	*/
	public static ImageDescriptor getImageDescriptor(IAdaptable hint) {
		return getImageDescriptor(getElement(hint));
	}

	/**
	* @generated
	*/
	public static Image getImage(IAdaptable hint) {
		return getImage(getElement(hint));
	}

	/**
	* Returns 'type' of the ecore object associated with the hint.
	* 
	* @generated
	*/
	public static ENamedElement getElement(IAdaptable hint) {
		Object type = hint.getAdapter(IElementType.class);
		if (elements == null) {
			elements = new IdentityHashMap<IElementType, ENamedElement>();

			elements.put(ClassDiagramJJD_1000, ConcretePackage.eINSTANCE.getClassDiagramJJD());

			elements.put(PackageJJD_2001, ConcretePackage.eINSTANCE.getPackageJJD());

			elements.put(ClassJJD_2002, ConcretePackage.eINSTANCE.getClassJJD());

			elements.put(PackageJJD_3001, ConcretePackage.eINSTANCE.getPackageJJD());

			elements.put(ClassJJD_3002, ConcretePackage.eINSTANCE.getClassJJD());

			elements.put(AttributeJJD_3003, ConcretePackage.eINSTANCE.getAttributeJJD());

			elements.put(MethodJJD_3004, ConcretePackage.eINSTANCE.getMethodJJD());

			elements.put(AttributeJJD_3005, ConcretePackage.eINSTANCE.getAttributeJJD());

			elements.put(AgregationJJD_4001, ConcretePackage.eINSTANCE.getAgregationJJD());

			elements.put(InheritanceJJD_4002, ConcretePackage.eINSTANCE.getInheritanceJJD());

			elements.put(ContainmentJJD_4003, ConcretePackage.eINSTANCE.getContainmentJJD());

			elements.put(AssociationJJD_4004, ConcretePackage.eINSTANCE.getAssociationJJD());

			elements.put(ImplementJJD_4005, ConcretePackage.eINSTANCE.getImplementJJD());
		}
		return (ENamedElement) elements.get(type);
	}

	/**
	* @generated
	*/
	private static IElementType getElementType(String id) {
		return ElementTypeRegistry.getInstance().getType(id);
	}

	/**
	* @generated
	*/
	public static boolean isKnownElementType(IElementType elementType) {
		if (KNOWN_ELEMENT_TYPES == null) {
			KNOWN_ELEMENT_TYPES = new HashSet<IElementType>();
			KNOWN_ELEMENT_TYPES.add(ClassDiagramJJD_1000);
			KNOWN_ELEMENT_TYPES.add(PackageJJD_2001);
			KNOWN_ELEMENT_TYPES.add(ClassJJD_2002);
			KNOWN_ELEMENT_TYPES.add(PackageJJD_3001);
			KNOWN_ELEMENT_TYPES.add(ClassJJD_3002);
			KNOWN_ELEMENT_TYPES.add(AttributeJJD_3003);
			KNOWN_ELEMENT_TYPES.add(MethodJJD_3004);
			KNOWN_ELEMENT_TYPES.add(AttributeJJD_3005);
			KNOWN_ELEMENT_TYPES.add(AgregationJJD_4001);
			KNOWN_ELEMENT_TYPES.add(InheritanceJJD_4002);
			KNOWN_ELEMENT_TYPES.add(ContainmentJJD_4003);
			KNOWN_ELEMENT_TYPES.add(AssociationJJD_4004);
			KNOWN_ELEMENT_TYPES.add(ImplementJJD_4005);
		}
		return KNOWN_ELEMENT_TYPES.contains(elementType);
	}

	/**
	* @generated
	*/
	public static IElementType getElementType(int visualID) {
		switch (visualID) {
		case ClassDiagramJJDEditPart.VISUAL_ID:
			return ClassDiagramJJD_1000;
		case PackageJJDEditPart.VISUAL_ID:
			return PackageJJD_2001;
		case ClassJJDEditPart.VISUAL_ID:
			return ClassJJD_2002;
		case PackageJJD2EditPart.VISUAL_ID:
			return PackageJJD_3001;
		case ClassJJD2EditPart.VISUAL_ID:
			return ClassJJD_3002;
		case AttributeJJDEditPart.VISUAL_ID:
			return AttributeJJD_3003;
		case MethodJJDEditPart.VISUAL_ID:
			return MethodJJD_3004;
		case AttributeJJD2EditPart.VISUAL_ID:
			return AttributeJJD_3005;
		case AgregationJJDEditPart.VISUAL_ID:
			return AgregationJJD_4001;
		case InheritanceJJDEditPart.VISUAL_ID:
			return InheritanceJJD_4002;
		case ContainmentJJDEditPart.VISUAL_ID:
			return ContainmentJJD_4003;
		case AssociationJJDEditPart.VISUAL_ID:
			return AssociationJJD_4004;
		case ImplementJJDEditPart.VISUAL_ID:
			return ImplementJJD_4005;
		}
		return null;
	}

	/**
	* @generated
	*/
	public static final DiagramElementTypes TYPED_INSTANCE = new DiagramElementTypes(elementTypeImages) {

		/**
		* @generated
		*/
		@Override

		public boolean isKnownElementType(IElementType elementType) {
			return concrete.diagram.providers.ConcreteElementTypes.isKnownElementType(elementType);
		}

		/**
		* @generated
		*/
		@Override

		public IElementType getElementTypeForVisualId(int visualID) {
			return concrete.diagram.providers.ConcreteElementTypes.getElementType(visualID);
		}

		/**
		* @generated
		*/
		@Override

		public ENamedElement getDefiningNamedElement(IAdaptable elementTypeAdapter) {
			return concrete.diagram.providers.ConcreteElementTypes.getElement(elementTypeAdapter);
		}
	};

}
