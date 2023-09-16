/*
* 
*/
package concrete.diagram.navigator;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.gmf.runtime.common.ui.services.parser.IParser;
import org.eclipse.gmf.runtime.common.ui.services.parser.ParserOptions;
import org.eclipse.gmf.runtime.emf.core.util.EObjectAdapter;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.jface.resource.ImageRegistry;
import org.eclipse.jface.viewers.ITreePathLabelProvider;
import org.eclipse.jface.viewers.LabelProvider;
import org.eclipse.jface.viewers.TreePath;
import org.eclipse.jface.viewers.ViewerLabel;
import org.eclipse.swt.graphics.Image;
import org.eclipse.ui.IMemento;
import org.eclipse.ui.navigator.ICommonContentExtensionSite;
import org.eclipse.ui.navigator.ICommonLabelProvider;

import concrete.AgregationJJD;
import concrete.AssociationJJD;
import concrete.ClassDiagramJJD;
import concrete.ImplementJJD;
import concrete.InheritanceJJD;
import concrete.diagram.edit.parts.AgregationJJDEditPart;
import concrete.diagram.edit.parts.AgregationJJDRolAEditPart;
import concrete.diagram.edit.parts.AssociationJJDEditPart;
import concrete.diagram.edit.parts.AssociationJJDRolAEditPart;
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
import concrete.diagram.edit.parts.ClassJJDEditPart;
import concrete.diagram.edit.parts.ClassJJDName2EditPart;
import concrete.diagram.edit.parts.ClassJJDNameEditPart;
import concrete.diagram.edit.parts.ContainmentJJDEditPart;
import concrete.diagram.edit.parts.ContainmentJJDRolAEditPart;
import concrete.diagram.edit.parts.ContainmentJJDRolARolBEditPart;
import concrete.diagram.edit.parts.ContainmentJJDRolBEditPart;
import concrete.diagram.edit.parts.ImplementJJDEditPart;
import concrete.diagram.edit.parts.InheritanceJJDEditPart;
import concrete.diagram.edit.parts.MethodJJDEditPart;
import concrete.diagram.edit.parts.MethodJJDNameEditPart;
import concrete.diagram.edit.parts.PackageJJD2EditPart;
import concrete.diagram.edit.parts.PackageJJDEditPart;
import concrete.diagram.edit.parts.PackageJJDName2EditPart;
import concrete.diagram.edit.parts.PackageJJDNameEditPart;
import concrete.diagram.part.ConcreteDiagramEditorPlugin;
import concrete.diagram.part.ConcreteVisualIDRegistry;
import concrete.diagram.providers.ConcreteElementTypes;
import concrete.diagram.providers.ConcreteParserProvider;

/**
 * @generated
 */
public class ConcreteNavigatorLabelProvider extends LabelProvider
		implements ICommonLabelProvider, ITreePathLabelProvider {

	/**
	* @generated
	*/
	static {
		ConcreteDiagramEditorPlugin.getInstance().getImageRegistry().put("Navigator?UnknownElement", //$NON-NLS-1$
				ImageDescriptor.getMissingImageDescriptor());
		ConcreteDiagramEditorPlugin.getInstance().getImageRegistry().put("Navigator?ImageNotFound", //$NON-NLS-1$
				ImageDescriptor.getMissingImageDescriptor());
	}

	/**
	* @generated
	*/
	public void updateLabel(ViewerLabel label, TreePath elementPath) {
		Object element = elementPath.getLastSegment();
		if (element instanceof ConcreteNavigatorItem && !isOwnView(((ConcreteNavigatorItem) element).getView())) {
			return;
		}
		label.setText(getText(element));
		label.setImage(getImage(element));
	}

	/**
	* @generated
	*/
	public Image getImage(Object element) {
		if (element instanceof ConcreteNavigatorGroup) {
			ConcreteNavigatorGroup group = (ConcreteNavigatorGroup) element;
			return ConcreteDiagramEditorPlugin.getInstance().getBundledImage(group.getIcon());
		}

		if (element instanceof ConcreteNavigatorItem) {
			ConcreteNavigatorItem navigatorItem = (ConcreteNavigatorItem) element;
			if (!isOwnView(navigatorItem.getView())) {
				return super.getImage(element);
			}
			return getImage(navigatorItem.getView());
		}

		// Due to plugin.xml content will be called only for "own" views
		if (element instanceof IAdaptable) {
			View view = (View) ((IAdaptable) element).getAdapter(View.class);
			if (view != null && isOwnView(view)) {
				return getImage(view);
			}
		}

		return super.getImage(element);
	}

	/**
	* @generated
	*/
	public Image getImage(View view) {
		switch (ConcreteVisualIDRegistry.getVisualID(view)) {
		case ClassDiagramJJDEditPart.VISUAL_ID:
			return getImage("Navigator?Diagram?concrete?ClassDiagramJJD", ConcreteElementTypes.ClassDiagramJJD_1000); //$NON-NLS-1$
		case PackageJJDEditPart.VISUAL_ID:
			return getImage("Navigator?TopLevelNode?concrete?PackageJJD", ConcreteElementTypes.PackageJJD_2001); //$NON-NLS-1$
		case ClassJJDEditPart.VISUAL_ID:
			return getImage("Navigator?TopLevelNode?concrete?ClassJJD", ConcreteElementTypes.ClassJJD_2002); //$NON-NLS-1$
		case PackageJJD2EditPart.VISUAL_ID:
			return getImage("Navigator?Node?concrete?PackageJJD", ConcreteElementTypes.PackageJJD_3001); //$NON-NLS-1$
		case ClassJJD2EditPart.VISUAL_ID:
			return getImage("Navigator?Node?concrete?ClassJJD", ConcreteElementTypes.ClassJJD_3002); //$NON-NLS-1$
		case AttributeJJDEditPart.VISUAL_ID:
			return getImage("Navigator?Node?concrete?AttributeJJD", ConcreteElementTypes.AttributeJJD_3003); //$NON-NLS-1$
		case MethodJJDEditPart.VISUAL_ID:
			return getImage("Navigator?Node?concrete?MethodJJD", ConcreteElementTypes.MethodJJD_3004); //$NON-NLS-1$
		case AttributeJJD2EditPart.VISUAL_ID:
			return getImage("Navigator?Node?concrete?AttributeJJD", ConcreteElementTypes.AttributeJJD_3005); //$NON-NLS-1$
		case AgregationJJDEditPart.VISUAL_ID:
			return getImage("Navigator?Link?concrete?AgregationJJD", ConcreteElementTypes.AgregationJJD_4001); //$NON-NLS-1$
		case InheritanceJJDEditPart.VISUAL_ID:
			return getImage("Navigator?Link?concrete?InheritanceJJD", ConcreteElementTypes.InheritanceJJD_4002); //$NON-NLS-1$
		case ContainmentJJDEditPart.VISUAL_ID:
			return getImage("Navigator?Link?concrete?ContainmentJJD", ConcreteElementTypes.ContainmentJJD_4003); //$NON-NLS-1$
		case AssociationJJDEditPart.VISUAL_ID:
			return getImage("Navigator?Link?concrete?AssociationJJD", ConcreteElementTypes.AssociationJJD_4004); //$NON-NLS-1$
		case ImplementJJDEditPart.VISUAL_ID:
			return getImage("Navigator?Link?concrete?ImplementJJD", ConcreteElementTypes.ImplementJJD_4005); //$NON-NLS-1$
		}
		return getImage("Navigator?UnknownElement", null); //$NON-NLS-1$
	}

	/**
	* @generated
	*/
	private Image getImage(String key, IElementType elementType) {
		ImageRegistry imageRegistry = ConcreteDiagramEditorPlugin.getInstance().getImageRegistry();
		Image image = imageRegistry.get(key);
		if (image == null && elementType != null && ConcreteElementTypes.isKnownElementType(elementType)) {
			image = ConcreteElementTypes.getImage(elementType);
			imageRegistry.put(key, image);
		}

		if (image == null) {
			image = imageRegistry.get("Navigator?ImageNotFound"); //$NON-NLS-1$
			imageRegistry.put(key, image);
		}
		return image;
	}

	/**
	* @generated
	*/
	public String getText(Object element) {
		if (element instanceof ConcreteNavigatorGroup) {
			ConcreteNavigatorGroup group = (ConcreteNavigatorGroup) element;
			return group.getGroupName();
		}

		if (element instanceof ConcreteNavigatorItem) {
			ConcreteNavigatorItem navigatorItem = (ConcreteNavigatorItem) element;
			if (!isOwnView(navigatorItem.getView())) {
				return null;
			}
			return getText(navigatorItem.getView());
		}

		// Due to plugin.xml content will be called only for "own" views
		if (element instanceof IAdaptable) {
			View view = (View) ((IAdaptable) element).getAdapter(View.class);
			if (view != null && isOwnView(view)) {
				return getText(view);
			}
		}

		return super.getText(element);
	}

	/**
	* @generated
	*/
	public String getText(View view) {
		if (view.getElement() != null && view.getElement().eIsProxy()) {
			return getUnresolvedDomainElementProxyText(view);
		}
		switch (ConcreteVisualIDRegistry.getVisualID(view)) {
		case ClassDiagramJJDEditPart.VISUAL_ID:
			return getClassDiagramJJD_1000Text(view);
		case PackageJJDEditPart.VISUAL_ID:
			return getPackageJJD_2001Text(view);
		case ClassJJDEditPart.VISUAL_ID:
			return getClassJJD_2002Text(view);
		case PackageJJD2EditPart.VISUAL_ID:
			return getPackageJJD_3001Text(view);
		case ClassJJD2EditPart.VISUAL_ID:
			return getClassJJD_3002Text(view);
		case AttributeJJDEditPart.VISUAL_ID:
			return getAttributeJJD_3003Text(view);
		case MethodJJDEditPart.VISUAL_ID:
			return getMethodJJD_3004Text(view);
		case AttributeJJD2EditPart.VISUAL_ID:
			return getAttributeJJD_3005Text(view);
		case AgregationJJDEditPart.VISUAL_ID:
			return getAgregationJJD_4001Text(view);
		case InheritanceJJDEditPart.VISUAL_ID:
			return getInheritanceJJD_4002Text(view);
		case ContainmentJJDEditPart.VISUAL_ID:
			return getContainmentJJD_4003Text(view);
		case AssociationJJDEditPart.VISUAL_ID:
			return getAssociationJJD_4004Text(view);
		case ImplementJJDEditPart.VISUAL_ID:
			return getImplementJJD_4005Text(view);
		}
		return getUnknownElementText(view);
	}

	/**
	* @generated
	*/
	private String getClassDiagramJJD_1000Text(View view) {
		ClassDiagramJJD domainModelElement = (ClassDiagramJJD) view.getElement();
		if (domainModelElement != null) {
			return domainModelElement.getName();
		} else {
			ConcreteDiagramEditorPlugin.getInstance().logError("No domain element for view with visualID = " + 1000); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getPackageJJD_2001Text(View view) {
		IParser parser = ConcreteParserProvider.getParser(ConcreteElementTypes.PackageJJD_2001,
				view.getElement() != null ? view.getElement() : view,
				ConcreteVisualIDRegistry.getType(PackageJJDNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			ConcreteDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5006); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getClassJJD_2002Text(View view) {
		IParser parser = ConcreteParserProvider.getParser(ConcreteElementTypes.ClassJJD_2002,
				view.getElement() != null ? view.getElement() : view,
				ConcreteVisualIDRegistry.getType(ClassJJDNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			ConcreteDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5007); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getPackageJJD_3001Text(View view) {
		IParser parser = ConcreteParserProvider.getParser(ConcreteElementTypes.PackageJJD_3001,
				view.getElement() != null ? view.getElement() : view,
				ConcreteVisualIDRegistry.getType(PackageJJDName2EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			ConcreteDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5005); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getClassJJD_3002Text(View view) {
		IParser parser = ConcreteParserProvider.getParser(ConcreteElementTypes.ClassJJD_3002,
				view.getElement() != null ? view.getElement() : view,
				ConcreteVisualIDRegistry.getType(ClassJJDName2EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			ConcreteDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5004); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getAttributeJJD_3003Text(View view) {
		IParser parser = ConcreteParserProvider.getParser(ConcreteElementTypes.AttributeJJD_3003,
				view.getElement() != null ? view.getElement() : view,
				ConcreteVisualIDRegistry.getType(AttributeJJDNameTypeEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			ConcreteDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5001); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getMethodJJD_3004Text(View view) {
		IParser parser = ConcreteParserProvider.getParser(ConcreteElementTypes.MethodJJD_3004,
				view.getElement() != null ? view.getElement() : view,
				ConcreteVisualIDRegistry.getType(MethodJJDNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			ConcreteDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5003); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getAttributeJJD_3005Text(View view) {
		IParser parser = ConcreteParserProvider.getParser(ConcreteElementTypes.AttributeJJD_3005,
				view.getElement() != null ? view.getElement() : view,
				ConcreteVisualIDRegistry.getType(AttributeJJDNameType2EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			ConcreteDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5002); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getAgregationJJD_4001Text(View view) {
		IParser parser = ConcreteParserProvider.getParser(ConcreteElementTypes.AgregationJJD_4001,
				view.getElement() != null ? view.getElement() : view,
				ConcreteVisualIDRegistry.getType(AgregationJJDRolAEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			ConcreteDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 6006); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getInheritanceJJD_4002Text(View view) {
		InheritanceJJD domainModelElement = (InheritanceJJD) view.getElement();
		if (domainModelElement != null) {
			return domainModelElement.getRolA();
		} else {
			ConcreteDiagramEditorPlugin.getInstance().logError("No domain element for view with visualID = " + 4002); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getContainmentJJD_4003Text(View view) {
		IParser parser = ConcreteParserProvider.getParser(ConcreteElementTypes.ContainmentJJD_4003,
				view.getElement() != null ? view.getElement() : view,
				ConcreteVisualIDRegistry.getType(ContainmentJJDRolBEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			ConcreteDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 6001); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getAssociationJJD_4004Text(View view) {
		IParser parser = ConcreteParserProvider.getParser(ConcreteElementTypes.AssociationJJD_4004,
				view.getElement() != null ? view.getElement() : view,
				ConcreteVisualIDRegistry.getType(AssociationJJDRolAEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			ConcreteDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 6010); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getImplementJJD_4005Text(View view) {
		ImplementJJD domainModelElement = (ImplementJJD) view.getElement();
		if (domainModelElement != null) {
			return domainModelElement.getRolA();
		} else {
			ConcreteDiagramEditorPlugin.getInstance().logError("No domain element for view with visualID = " + 4005); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getUnknownElementText(View view) {
		return "<UnknownElement Visual_ID = " + view.getType() + ">"; //$NON-NLS-1$  //$NON-NLS-2$
	}

	/**
	* @generated
	*/
	private String getUnresolvedDomainElementProxyText(View view) {
		return "<Unresolved domain element Visual_ID = " + view.getType() + ">"; //$NON-NLS-1$  //$NON-NLS-2$
	}

	/**
	* @generated
	*/
	public void init(ICommonContentExtensionSite aConfig) {
	}

	/**
	* @generated
	*/
	public void restoreState(IMemento aMemento) {
	}

	/**
	* @generated
	*/
	public void saveState(IMemento aMemento) {
	}

	/**
	* @generated
	*/
	public String getDescription(Object anElement) {
		return null;
	}

	/**
	* @generated
	*/
	private boolean isOwnView(View view) {
		return ClassDiagramJJDEditPart.MODEL_ID.equals(ConcreteVisualIDRegistry.getModelID(view));
	}

}
