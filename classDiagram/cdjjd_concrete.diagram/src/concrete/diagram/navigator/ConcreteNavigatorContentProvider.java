/*
* 
*/
package concrete.diagram.navigator;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.edit.domain.AdapterFactoryEditingDomain;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.emf.workspace.util.WorkspaceSynchronizer;
import org.eclipse.gmf.runtime.emf.core.GMFEditingDomainFactory;
import org.eclipse.gmf.runtime.notation.Diagram;
import org.eclipse.gmf.runtime.notation.Edge;
import org.eclipse.gmf.runtime.notation.Node;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.jface.viewers.Viewer;
import org.eclipse.ui.IMemento;
import org.eclipse.ui.navigator.ICommonContentExtensionSite;
import org.eclipse.ui.navigator.ICommonContentProvider;

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
import concrete.diagram.part.ConcreteVisualIDRegistry;
import concrete.diagram.part.Messages;

/**
 * @generated
 */
public class ConcreteNavigatorContentProvider implements ICommonContentProvider {

	/**
	* @generated
	*/
	private static final Object[] EMPTY_ARRAY = new Object[0];

	/**
	* @generated
	*/
	private Viewer myViewer;

	/**
	* @generated
	*/
	private AdapterFactoryEditingDomain myEditingDomain;

	/**
	* @generated
	*/
	private WorkspaceSynchronizer myWorkspaceSynchronizer;

	/**
	* @generated
	*/
	private Runnable myViewerRefreshRunnable;

	/**
	* @generated
	*/
	@SuppressWarnings({ "unchecked", "serial", "rawtypes" })
	public ConcreteNavigatorContentProvider() {
		TransactionalEditingDomain editingDomain = GMFEditingDomainFactory.INSTANCE.createEditingDomain();
		myEditingDomain = (AdapterFactoryEditingDomain) editingDomain;
		myEditingDomain.setResourceToReadOnlyMap(new HashMap() {
			public Object get(Object key) {
				if (!containsKey(key)) {
					put(key, Boolean.TRUE);
				}
				return super.get(key);
			}
		});
		myViewerRefreshRunnable = new Runnable() {
			public void run() {
				if (myViewer != null) {
					myViewer.refresh();
				}
			}
		};
		myWorkspaceSynchronizer = new WorkspaceSynchronizer(editingDomain, new WorkspaceSynchronizer.Delegate() {
			public void dispose() {
			}

			public boolean handleResourceChanged(final Resource resource) {
				unloadAllResources();
				asyncRefresh();
				return true;
			}

			public boolean handleResourceDeleted(Resource resource) {
				unloadAllResources();
				asyncRefresh();
				return true;
			}

			public boolean handleResourceMoved(Resource resource, final URI newURI) {
				unloadAllResources();
				asyncRefresh();
				return true;
			}
		});
	}

	/**
	* @generated
	*/
	public void dispose() {
		myWorkspaceSynchronizer.dispose();
		myWorkspaceSynchronizer = null;
		myViewerRefreshRunnable = null;
		myViewer = null;
		unloadAllResources();
		((TransactionalEditingDomain) myEditingDomain).dispose();
		myEditingDomain = null;
	}

	/**
	* @generated
	*/
	public void inputChanged(Viewer viewer, Object oldInput, Object newInput) {
		myViewer = viewer;
	}

	/**
	* @generated
	*/
	void unloadAllResources() {
		for (Resource nextResource : myEditingDomain.getResourceSet().getResources()) {
			nextResource.unload();
		}
	}

	/**
	* @generated
	*/
	void asyncRefresh() {
		if (myViewer != null && !myViewer.getControl().isDisposed()) {
			myViewer.getControl().getDisplay().asyncExec(myViewerRefreshRunnable);
		}
	}

	/**
	* @generated
	*/
	public Object[] getElements(Object inputElement) {
		return getChildren(inputElement);
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
	public void init(ICommonContentExtensionSite aConfig) {
	}

	/**
	* @generated
	*/
	public Object[] getChildren(Object parentElement) {
		if (parentElement instanceof IFile) {
			IFile file = (IFile) parentElement;
			URI fileURI = URI.createPlatformResourceURI(file.getFullPath().toString(), true);
			Resource resource = myEditingDomain.getResourceSet().getResource(fileURI, true);
			ArrayList<ConcreteNavigatorItem> result = new ArrayList<ConcreteNavigatorItem>();
			ArrayList<View> topViews = new ArrayList<View>(resource.getContents().size());
			for (EObject o : resource.getContents()) {
				if (o instanceof View) {
					topViews.add((View) o);
				}
			}
			result.addAll(
					createNavigatorItems(selectViewsByType(topViews, ClassDiagramJJDEditPart.MODEL_ID), file, false));
			return result.toArray();
		}

		if (parentElement instanceof ConcreteNavigatorGroup) {
			ConcreteNavigatorGroup group = (ConcreteNavigatorGroup) parentElement;
			return group.getChildren();
		}

		if (parentElement instanceof ConcreteNavigatorItem) {
			ConcreteNavigatorItem navigatorItem = (ConcreteNavigatorItem) parentElement;
			if (navigatorItem.isLeaf() || !isOwnView(navigatorItem.getView())) {
				return EMPTY_ARRAY;
			}
			return getViewChildren(navigatorItem.getView(), parentElement);
		}

		/*
		* Due to plugin.xml restrictions this code will be called only for views representing
		* shortcuts to this diagram elements created on other diagrams. 
		*/
		if (parentElement instanceof IAdaptable) {
			View view = (View) ((IAdaptable) parentElement).getAdapter(View.class);
			if (view != null) {
				return getViewChildren(view, parentElement);
			}
		}

		return EMPTY_ARRAY;
	}

	/**
	* @generated
	*/
	private Object[] getViewChildren(View view, Object parentElement) {
		switch (ConcreteVisualIDRegistry.getVisualID(view)) {

		case ClassDiagramJJDEditPart.VISUAL_ID: {
			LinkedList<ConcreteAbstractNavigatorItem> result = new LinkedList<ConcreteAbstractNavigatorItem>();
			result.addAll(getForeignShortcuts((Diagram) view, parentElement));
			Diagram sv = (Diagram) view;
			ConcreteNavigatorGroup links = new ConcreteNavigatorGroup(
					Messages.NavigatorGroupName_ClassDiagramJJD_1000_links, "icons/linksNavigatorGroup.gif", //$NON-NLS-1$
					parentElement);
			Collection<View> connectedViews;
			connectedViews = getChildrenByType(Collections.singleton(sv),
					ConcreteVisualIDRegistry.getType(PackageJJDEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					ConcreteVisualIDRegistry.getType(ClassJJDEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getDiagramLinksByType(Collections.singleton(sv),
					ConcreteVisualIDRegistry.getType(AgregationJJDEditPart.VISUAL_ID));
			links.addChildren(createNavigatorItems(connectedViews, links, false));
			connectedViews = getDiagramLinksByType(Collections.singleton(sv),
					ConcreteVisualIDRegistry.getType(InheritanceJJDEditPart.VISUAL_ID));
			links.addChildren(createNavigatorItems(connectedViews, links, false));
			connectedViews = getDiagramLinksByType(Collections.singleton(sv),
					ConcreteVisualIDRegistry.getType(ContainmentJJDEditPart.VISUAL_ID));
			links.addChildren(createNavigatorItems(connectedViews, links, false));
			connectedViews = getDiagramLinksByType(Collections.singleton(sv),
					ConcreteVisualIDRegistry.getType(AssociationJJDEditPart.VISUAL_ID));
			links.addChildren(createNavigatorItems(connectedViews, links, false));
			connectedViews = getDiagramLinksByType(Collections.singleton(sv),
					ConcreteVisualIDRegistry.getType(ImplementJJDEditPart.VISUAL_ID));
			links.addChildren(createNavigatorItems(connectedViews, links, false));
			if (!links.isEmpty()) {
				result.add(links);
			}
			return result.toArray();
		}

		case PackageJJDEditPart.VISUAL_ID: {
			LinkedList<ConcreteAbstractNavigatorItem> result = new LinkedList<ConcreteAbstractNavigatorItem>();
			Node sv = (Node) view;
			Collection<View> connectedViews;
			connectedViews = getChildrenByType(Collections.singleton(sv),
					ConcreteVisualIDRegistry.getType(PackageJJDPackageJJDSubPackagesJJDCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					ConcreteVisualIDRegistry.getType(PackageJJD2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					ConcreteVisualIDRegistry.getType(PackageJJDPackageJJDListClassJJDCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					ConcreteVisualIDRegistry.getType(ClassJJD2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			return result.toArray();
		}

		case ClassJJDEditPart.VISUAL_ID: {
			LinkedList<ConcreteAbstractNavigatorItem> result = new LinkedList<ConcreteAbstractNavigatorItem>();
			Node sv = (Node) view;
			ConcreteNavigatorGroup incominglinks = new ConcreteNavigatorGroup(
					Messages.NavigatorGroupName_ClassJJD_2002_incominglinks, "icons/incomingLinksNavigatorGroup.gif", //$NON-NLS-1$
					parentElement);
			ConcreteNavigatorGroup outgoinglinks = new ConcreteNavigatorGroup(
					Messages.NavigatorGroupName_ClassJJD_2002_outgoinglinks, "icons/outgoingLinksNavigatorGroup.gif", //$NON-NLS-1$
					parentElement);
			Collection<View> connectedViews;
			connectedViews = getChildrenByType(Collections.singleton(sv),
					ConcreteVisualIDRegistry.getType(ClassJJDClassJJDListAttributesJJDCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					ConcreteVisualIDRegistry.getType(AttributeJJDEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					ConcreteVisualIDRegistry.getType(ClassJJDClassJJDListMethodsJJDCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					ConcreteVisualIDRegistry.getType(MethodJJDEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					ConcreteVisualIDRegistry.getType(AgregationJJDEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					ConcreteVisualIDRegistry.getType(AgregationJJDEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					ConcreteVisualIDRegistry.getType(InheritanceJJDEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					ConcreteVisualIDRegistry.getType(InheritanceJJDEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					ConcreteVisualIDRegistry.getType(ContainmentJJDEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					ConcreteVisualIDRegistry.getType(ContainmentJJDEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					ConcreteVisualIDRegistry.getType(AssociationJJDEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					ConcreteVisualIDRegistry.getType(AssociationJJDEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					ConcreteVisualIDRegistry.getType(ImplementJJDEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					ConcreteVisualIDRegistry.getType(ImplementJJDEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case PackageJJD2EditPart.VISUAL_ID: {
			LinkedList<ConcreteAbstractNavigatorItem> result = new LinkedList<ConcreteAbstractNavigatorItem>();
			Node sv = (Node) view;
			Collection<View> connectedViews;
			connectedViews = getChildrenByType(Collections.singleton(sv),
					ConcreteVisualIDRegistry.getType(PackageJJDPackageJJDSubPackagesJJDCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					ConcreteVisualIDRegistry.getType(PackageJJD2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					ConcreteVisualIDRegistry.getType(PackageJJDPackageJJDListClassJJDCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					ConcreteVisualIDRegistry.getType(ClassJJD2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			return result.toArray();
		}

		case ClassJJD2EditPart.VISUAL_ID: {
			LinkedList<ConcreteAbstractNavigatorItem> result = new LinkedList<ConcreteAbstractNavigatorItem>();
			Node sv = (Node) view;
			ConcreteNavigatorGroup incominglinks = new ConcreteNavigatorGroup(
					Messages.NavigatorGroupName_ClassJJD_3002_incominglinks, "icons/incomingLinksNavigatorGroup.gif", //$NON-NLS-1$
					parentElement);
			ConcreteNavigatorGroup outgoinglinks = new ConcreteNavigatorGroup(
					Messages.NavigatorGroupName_ClassJJD_3002_outgoinglinks, "icons/outgoingLinksNavigatorGroup.gif", //$NON-NLS-1$
					parentElement);
			Collection<View> connectedViews;
			connectedViews = getChildrenByType(Collections.singleton(sv),
					ConcreteVisualIDRegistry.getType(ClassJJDClassJJDListAttributesJJDCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					ConcreteVisualIDRegistry.getType(AttributeJJDEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					ConcreteVisualIDRegistry.getType(ClassJJDClassJJDListMethodsJJDCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					ConcreteVisualIDRegistry.getType(MethodJJDEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					ConcreteVisualIDRegistry.getType(AgregationJJDEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					ConcreteVisualIDRegistry.getType(AgregationJJDEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					ConcreteVisualIDRegistry.getType(InheritanceJJDEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					ConcreteVisualIDRegistry.getType(InheritanceJJDEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					ConcreteVisualIDRegistry.getType(ContainmentJJDEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					ConcreteVisualIDRegistry.getType(ContainmentJJDEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					ConcreteVisualIDRegistry.getType(AssociationJJDEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					ConcreteVisualIDRegistry.getType(AssociationJJDEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					ConcreteVisualIDRegistry.getType(ImplementJJDEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					ConcreteVisualIDRegistry.getType(ImplementJJDEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case MethodJJDEditPart.VISUAL_ID: {
			LinkedList<ConcreteAbstractNavigatorItem> result = new LinkedList<ConcreteAbstractNavigatorItem>();
			Node sv = (Node) view;
			Collection<View> connectedViews;
			connectedViews = getChildrenByType(Collections.singleton(sv),
					ConcreteVisualIDRegistry.getType(MethodJJDMethodJJDListAttributesJJDCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					ConcreteVisualIDRegistry.getType(AttributeJJD2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			return result.toArray();
		}

		case AgregationJJDEditPart.VISUAL_ID: {
			LinkedList<ConcreteAbstractNavigatorItem> result = new LinkedList<ConcreteAbstractNavigatorItem>();
			Edge sv = (Edge) view;
			ConcreteNavigatorGroup target = new ConcreteNavigatorGroup(
					Messages.NavigatorGroupName_AgregationJJD_4001_target, "icons/linkTargetNavigatorGroup.gif", //$NON-NLS-1$
					parentElement);
			ConcreteNavigatorGroup source = new ConcreteNavigatorGroup(
					Messages.NavigatorGroupName_AgregationJJD_4001_source, "icons/linkSourceNavigatorGroup.gif", //$NON-NLS-1$
					parentElement);
			Collection<View> connectedViews;
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					ConcreteVisualIDRegistry.getType(ClassJJDEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					ConcreteVisualIDRegistry.getType(ClassJJD2EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					ConcreteVisualIDRegistry.getType(ClassJJDEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					ConcreteVisualIDRegistry.getType(ClassJJD2EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			if (!target.isEmpty()) {
				result.add(target);
			}
			if (!source.isEmpty()) {
				result.add(source);
			}
			return result.toArray();
		}

		case InheritanceJJDEditPart.VISUAL_ID: {
			LinkedList<ConcreteAbstractNavigatorItem> result = new LinkedList<ConcreteAbstractNavigatorItem>();
			Edge sv = (Edge) view;
			ConcreteNavigatorGroup target = new ConcreteNavigatorGroup(
					Messages.NavigatorGroupName_InheritanceJJD_4002_target, "icons/linkTargetNavigatorGroup.gif", //$NON-NLS-1$
					parentElement);
			ConcreteNavigatorGroup source = new ConcreteNavigatorGroup(
					Messages.NavigatorGroupName_InheritanceJJD_4002_source, "icons/linkSourceNavigatorGroup.gif", //$NON-NLS-1$
					parentElement);
			Collection<View> connectedViews;
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					ConcreteVisualIDRegistry.getType(ClassJJDEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					ConcreteVisualIDRegistry.getType(ClassJJD2EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					ConcreteVisualIDRegistry.getType(ClassJJDEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					ConcreteVisualIDRegistry.getType(ClassJJD2EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			if (!target.isEmpty()) {
				result.add(target);
			}
			if (!source.isEmpty()) {
				result.add(source);
			}
			return result.toArray();
		}

		case ContainmentJJDEditPart.VISUAL_ID: {
			LinkedList<ConcreteAbstractNavigatorItem> result = new LinkedList<ConcreteAbstractNavigatorItem>();
			Edge sv = (Edge) view;
			ConcreteNavigatorGroup target = new ConcreteNavigatorGroup(
					Messages.NavigatorGroupName_ContainmentJJD_4003_target, "icons/linkTargetNavigatorGroup.gif", //$NON-NLS-1$
					parentElement);
			ConcreteNavigatorGroup source = new ConcreteNavigatorGroup(
					Messages.NavigatorGroupName_ContainmentJJD_4003_source, "icons/linkSourceNavigatorGroup.gif", //$NON-NLS-1$
					parentElement);
			Collection<View> connectedViews;
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					ConcreteVisualIDRegistry.getType(ClassJJDEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					ConcreteVisualIDRegistry.getType(ClassJJD2EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					ConcreteVisualIDRegistry.getType(ClassJJDEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					ConcreteVisualIDRegistry.getType(ClassJJD2EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			if (!target.isEmpty()) {
				result.add(target);
			}
			if (!source.isEmpty()) {
				result.add(source);
			}
			return result.toArray();
		}

		case AssociationJJDEditPart.VISUAL_ID: {
			LinkedList<ConcreteAbstractNavigatorItem> result = new LinkedList<ConcreteAbstractNavigatorItem>();
			Edge sv = (Edge) view;
			ConcreteNavigatorGroup target = new ConcreteNavigatorGroup(
					Messages.NavigatorGroupName_AssociationJJD_4004_target, "icons/linkTargetNavigatorGroup.gif", //$NON-NLS-1$
					parentElement);
			ConcreteNavigatorGroup source = new ConcreteNavigatorGroup(
					Messages.NavigatorGroupName_AssociationJJD_4004_source, "icons/linkSourceNavigatorGroup.gif", //$NON-NLS-1$
					parentElement);
			Collection<View> connectedViews;
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					ConcreteVisualIDRegistry.getType(ClassJJDEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					ConcreteVisualIDRegistry.getType(ClassJJD2EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					ConcreteVisualIDRegistry.getType(ClassJJDEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					ConcreteVisualIDRegistry.getType(ClassJJD2EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			if (!target.isEmpty()) {
				result.add(target);
			}
			if (!source.isEmpty()) {
				result.add(source);
			}
			return result.toArray();
		}

		case ImplementJJDEditPart.VISUAL_ID: {
			LinkedList<ConcreteAbstractNavigatorItem> result = new LinkedList<ConcreteAbstractNavigatorItem>();
			Edge sv = (Edge) view;
			ConcreteNavigatorGroup target = new ConcreteNavigatorGroup(
					Messages.NavigatorGroupName_ImplementJJD_4005_target, "icons/linkTargetNavigatorGroup.gif", //$NON-NLS-1$
					parentElement);
			ConcreteNavigatorGroup source = new ConcreteNavigatorGroup(
					Messages.NavigatorGroupName_ImplementJJD_4005_source, "icons/linkSourceNavigatorGroup.gif", //$NON-NLS-1$
					parentElement);
			Collection<View> connectedViews;
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					ConcreteVisualIDRegistry.getType(ClassJJDEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					ConcreteVisualIDRegistry.getType(ClassJJD2EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					ConcreteVisualIDRegistry.getType(ClassJJDEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					ConcreteVisualIDRegistry.getType(ClassJJD2EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			if (!target.isEmpty()) {
				result.add(target);
			}
			if (!source.isEmpty()) {
				result.add(source);
			}
			return result.toArray();
		}
		}
		return EMPTY_ARRAY;
	}

	/**
	* @generated
	*/
	private Collection<View> getLinksSourceByType(Collection<Edge> edges, String type) {
		LinkedList<View> result = new LinkedList<View>();
		for (Edge nextEdge : edges) {
			View nextEdgeSource = nextEdge.getSource();
			if (type.equals(nextEdgeSource.getType()) && isOwnView(nextEdgeSource)) {
				result.add(nextEdgeSource);
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private Collection<View> getLinksTargetByType(Collection<Edge> edges, String type) {
		LinkedList<View> result = new LinkedList<View>();
		for (Edge nextEdge : edges) {
			View nextEdgeTarget = nextEdge.getTarget();
			if (type.equals(nextEdgeTarget.getType()) && isOwnView(nextEdgeTarget)) {
				result.add(nextEdgeTarget);
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private Collection<View> getOutgoingLinksByType(Collection<? extends View> nodes, String type) {
		LinkedList<View> result = new LinkedList<View>();
		for (View nextNode : nodes) {
			result.addAll(selectViewsByType(nextNode.getSourceEdges(), type));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private Collection<View> getIncomingLinksByType(Collection<? extends View> nodes, String type) {
		LinkedList<View> result = new LinkedList<View>();
		for (View nextNode : nodes) {
			result.addAll(selectViewsByType(nextNode.getTargetEdges(), type));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private Collection<View> getChildrenByType(Collection<? extends View> nodes, String type) {
		LinkedList<View> result = new LinkedList<View>();
		for (View nextNode : nodes) {
			result.addAll(selectViewsByType(nextNode.getChildren(), type));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private Collection<View> getDiagramLinksByType(Collection<Diagram> diagrams, String type) {
		ArrayList<View> result = new ArrayList<View>();
		for (Diagram nextDiagram : diagrams) {
			result.addAll(selectViewsByType(nextDiagram.getEdges(), type));
		}
		return result;
	}

	// TODO refactor as static method
	/**
	 * @generated
	 */
	private Collection<View> selectViewsByType(Collection<View> views, String type) {
		ArrayList<View> result = new ArrayList<View>();
		for (View nextView : views) {
			if (type.equals(nextView.getType()) && isOwnView(nextView)) {
				result.add(nextView);
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isOwnView(View view) {
		return ClassDiagramJJDEditPart.MODEL_ID.equals(ConcreteVisualIDRegistry.getModelID(view));
	}

	/**
	 * @generated
	 */
	private Collection<ConcreteNavigatorItem> createNavigatorItems(Collection<View> views, Object parent,
			boolean isLeafs) {
		ArrayList<ConcreteNavigatorItem> result = new ArrayList<ConcreteNavigatorItem>(views.size());
		for (View nextView : views) {
			result.add(new ConcreteNavigatorItem(nextView, parent, isLeafs));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private Collection<ConcreteNavigatorItem> getForeignShortcuts(Diagram diagram, Object parent) {
		LinkedList<View> result = new LinkedList<View>();
		for (Iterator<View> it = diagram.getChildren().iterator(); it.hasNext();) {
			View nextView = it.next();
			if (!isOwnView(nextView) && nextView.getEAnnotation("Shortcut") != null) { //$NON-NLS-1$
				result.add(nextView);
			}
		}
		return createNavigatorItems(result, parent, false);
	}

	/**
	* @generated
	*/
	public Object getParent(Object element) {
		if (element instanceof ConcreteAbstractNavigatorItem) {
			ConcreteAbstractNavigatorItem abstractNavigatorItem = (ConcreteAbstractNavigatorItem) element;
			return abstractNavigatorItem.getParent();
		}
		return null;
	}

	/**
	* @generated
	*/
	public boolean hasChildren(Object element) {
		return element instanceof IFile || getChildren(element).length > 0;
	}

}
