/*
 * 
 */
package concrete.diagram.providers.assistants;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;

import concrete.diagram.edit.parts.ClassJJD2EditPart;
import concrete.diagram.edit.parts.ClassJJDEditPart;
import concrete.diagram.providers.ConcreteElementTypes;
import concrete.diagram.providers.ConcreteModelingAssistantProvider;

/**
 * @generated
 */
public class ConcreteModelingAssistantProviderOfClassJJD2EditPart extends ConcreteModelingAssistantProvider {

	/**
	* @generated
	*/
	@Override

	public List<IElementType> getTypesForPopupBar(IAdaptable host) {
		List<IElementType> types = new ArrayList<IElementType>(2);
		types.add(ConcreteElementTypes.AttributeJJD_3003);
		types.add(ConcreteElementTypes.MethodJJD_3004);
		return types;
	}

	/**
	* @generated
	*/
	@Override

	public List<IElementType> getRelTypesOnSource(IAdaptable source) {
		IGraphicalEditPart sourceEditPart = (IGraphicalEditPart) source.getAdapter(IGraphicalEditPart.class);
		return doGetRelTypesOnSource((ClassJJD2EditPart) sourceEditPart);
	}

	/**
	* @generated
	*/
	public List<IElementType> doGetRelTypesOnSource(ClassJJD2EditPart source) {
		List<IElementType> types = new ArrayList<IElementType>(5);
		types.add(ConcreteElementTypes.AgregationJJD_4001);
		types.add(ConcreteElementTypes.InheritanceJJD_4002);
		types.add(ConcreteElementTypes.ContainmentJJD_4003);
		types.add(ConcreteElementTypes.AssociationJJD_4004);
		types.add(ConcreteElementTypes.ImplementJJD_4005);
		return types;
	}

	/**
	* @generated
	*/
	@Override

	public List<IElementType> getRelTypesOnSourceAndTarget(IAdaptable source, IAdaptable target) {
		IGraphicalEditPart sourceEditPart = (IGraphicalEditPart) source.getAdapter(IGraphicalEditPart.class);
		IGraphicalEditPart targetEditPart = (IGraphicalEditPart) target.getAdapter(IGraphicalEditPart.class);
		return doGetRelTypesOnSourceAndTarget((ClassJJD2EditPart) sourceEditPart, targetEditPart);
	}

	/**
	* @generated
	*/
	public List<IElementType> doGetRelTypesOnSourceAndTarget(ClassJJD2EditPart source,
			IGraphicalEditPart targetEditPart) {
		List<IElementType> types = new LinkedList<IElementType>();
		if (targetEditPart instanceof ClassJJDEditPart) {
			types.add(ConcreteElementTypes.AgregationJJD_4001);
		}
		if (targetEditPart instanceof ClassJJD2EditPart) {
			types.add(ConcreteElementTypes.AgregationJJD_4001);
		}
		if (targetEditPart instanceof ClassJJDEditPart) {
			types.add(ConcreteElementTypes.InheritanceJJD_4002);
		}
		if (targetEditPart instanceof ClassJJD2EditPart) {
			types.add(ConcreteElementTypes.InheritanceJJD_4002);
		}
		if (targetEditPart instanceof ClassJJDEditPart) {
			types.add(ConcreteElementTypes.ContainmentJJD_4003);
		}
		if (targetEditPart instanceof ClassJJD2EditPart) {
			types.add(ConcreteElementTypes.ContainmentJJD_4003);
		}
		if (targetEditPart instanceof ClassJJDEditPart) {
			types.add(ConcreteElementTypes.AssociationJJD_4004);
		}
		if (targetEditPart instanceof ClassJJD2EditPart) {
			types.add(ConcreteElementTypes.AssociationJJD_4004);
		}
		if (targetEditPart instanceof ClassJJDEditPart) {
			types.add(ConcreteElementTypes.ImplementJJD_4005);
		}
		if (targetEditPart instanceof ClassJJD2EditPart) {
			types.add(ConcreteElementTypes.ImplementJJD_4005);
		}
		return types;
	}

	/**
	* @generated
	*/
	@Override

	public List<IElementType> getTypesForTarget(IAdaptable source, IElementType relationshipType) {
		IGraphicalEditPart sourceEditPart = (IGraphicalEditPart) source.getAdapter(IGraphicalEditPart.class);
		return doGetTypesForTarget((ClassJJD2EditPart) sourceEditPart, relationshipType);
	}

	/**
	* @generated
	*/
	public List<IElementType> doGetTypesForTarget(ClassJJD2EditPart source, IElementType relationshipType) {
		List<IElementType> types = new ArrayList<IElementType>();
		if (relationshipType == ConcreteElementTypes.AgregationJJD_4001) {
			types.add(ConcreteElementTypes.ClassJJD_2002);
			types.add(ConcreteElementTypes.ClassJJD_3002);
		} else if (relationshipType == ConcreteElementTypes.InheritanceJJD_4002) {
			types.add(ConcreteElementTypes.ClassJJD_2002);
			types.add(ConcreteElementTypes.ClassJJD_3002);
		} else if (relationshipType == ConcreteElementTypes.ContainmentJJD_4003) {
			types.add(ConcreteElementTypes.ClassJJD_2002);
			types.add(ConcreteElementTypes.ClassJJD_3002);
		} else if (relationshipType == ConcreteElementTypes.AssociationJJD_4004) {
			types.add(ConcreteElementTypes.ClassJJD_2002);
			types.add(ConcreteElementTypes.ClassJJD_3002);
		} else if (relationshipType == ConcreteElementTypes.ImplementJJD_4005) {
			types.add(ConcreteElementTypes.ClassJJD_2002);
			types.add(ConcreteElementTypes.ClassJJD_3002);
		}
		return types;
	}

	/**
	* @generated
	*/
	@Override

	public List<IElementType> getRelTypesOnTarget(IAdaptable target) {
		IGraphicalEditPart targetEditPart = (IGraphicalEditPart) target.getAdapter(IGraphicalEditPart.class);
		return doGetRelTypesOnTarget((ClassJJD2EditPart) targetEditPart);
	}

	/**
	* @generated
	*/
	public List<IElementType> doGetRelTypesOnTarget(ClassJJD2EditPart target) {
		List<IElementType> types = new ArrayList<IElementType>(5);
		types.add(ConcreteElementTypes.AgregationJJD_4001);
		types.add(ConcreteElementTypes.InheritanceJJD_4002);
		types.add(ConcreteElementTypes.ContainmentJJD_4003);
		types.add(ConcreteElementTypes.AssociationJJD_4004);
		types.add(ConcreteElementTypes.ImplementJJD_4005);
		return types;
	}

	/**
	* @generated
	*/
	@Override

	public List<IElementType> getTypesForSource(IAdaptable target, IElementType relationshipType) {
		IGraphicalEditPart targetEditPart = (IGraphicalEditPart) target.getAdapter(IGraphicalEditPart.class);
		return doGetTypesForSource((ClassJJD2EditPart) targetEditPart, relationshipType);
	}

	/**
	* @generated
	*/
	public List<IElementType> doGetTypesForSource(ClassJJD2EditPart target, IElementType relationshipType) {
		List<IElementType> types = new ArrayList<IElementType>();
		if (relationshipType == ConcreteElementTypes.AgregationJJD_4001) {
			types.add(ConcreteElementTypes.ClassJJD_2002);
			types.add(ConcreteElementTypes.ClassJJD_3002);
		} else if (relationshipType == ConcreteElementTypes.InheritanceJJD_4002) {
			types.add(ConcreteElementTypes.ClassJJD_2002);
			types.add(ConcreteElementTypes.ClassJJD_3002);
		} else if (relationshipType == ConcreteElementTypes.ContainmentJJD_4003) {
			types.add(ConcreteElementTypes.ClassJJD_2002);
			types.add(ConcreteElementTypes.ClassJJD_3002);
		} else if (relationshipType == ConcreteElementTypes.AssociationJJD_4004) {
			types.add(ConcreteElementTypes.ClassJJD_2002);
			types.add(ConcreteElementTypes.ClassJJD_3002);
		} else if (relationshipType == ConcreteElementTypes.ImplementJJD_4005) {
			types.add(ConcreteElementTypes.ClassJJD_2002);
			types.add(ConcreteElementTypes.ClassJJD_3002);
		}
		return types;
	}

}
