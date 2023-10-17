/*
* 
*/
package uidiagram.diagram.navigator;

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

import uidiagram.diagram.edit.parts.*;
import uidiagram.diagram.part.UidiagramVisualIDRegistry;

/**
 * @generated
 */
public class UidiagramNavigatorContentProvider implements ICommonContentProvider {

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
	public UidiagramNavigatorContentProvider() {
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
			ArrayList<UidiagramNavigatorItem> result = new ArrayList<UidiagramNavigatorItem>();
			ArrayList<View> topViews = new ArrayList<View>(resource.getContents().size());
			for (EObject o : resource.getContents()) {
				if (o instanceof View) {
					topViews.add((View) o);
				}
			}
			result.addAll(createNavigatorItems(selectViewsByType(topViews, UIDiagramEditPart.MODEL_ID), file, false));
			return result.toArray();
		}

		if (parentElement instanceof UidiagramNavigatorGroup) {
			UidiagramNavigatorGroup group = (UidiagramNavigatorGroup) parentElement;
			return group.getChildren();
		}

		if (parentElement instanceof UidiagramNavigatorItem) {
			UidiagramNavigatorItem navigatorItem = (UidiagramNavigatorItem) parentElement;
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
		switch (UidiagramVisualIDRegistry.getVisualID(view)) {

		case UIDiagramEditPart.VISUAL_ID: {
			LinkedList<UidiagramAbstractNavigatorItem> result = new LinkedList<UidiagramAbstractNavigatorItem>();
			result.addAll(getForeignShortcuts((Diagram) view, parentElement));
			Diagram sv = (Diagram) view;
			Collection<View> connectedViews;
			connectedViews = getChildrenByType(Collections.singleton(sv),
					UidiagramVisualIDRegistry.getType(UserInterfaceEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			return result.toArray();
		}

		case UserInterfaceEditPart.VISUAL_ID: {
			LinkedList<UidiagramAbstractNavigatorItem> result = new LinkedList<UidiagramAbstractNavigatorItem>();
			Node sv = (Node) view;
			Collection<View> connectedViews;
			connectedViews = getChildrenByType(Collections.singleton(sv), UidiagramVisualIDRegistry
					.getType(UserInterfaceUserInterfaceListTemplateWidgetCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					UidiagramVisualIDRegistry.getType(GroupEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv), UidiagramVisualIDRegistry
					.getType(UserInterfaceUserInterfaceListTemplateWidgetCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					UidiagramVisualIDRegistry.getType(GroupColumn5EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv), UidiagramVisualIDRegistry
					.getType(UserInterfaceUserInterfaceListTemplateWidgetCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					UidiagramVisualIDRegistry.getType(GroupRow5EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv), UidiagramVisualIDRegistry
					.getType(UserInterfaceUserInterfaceListTemplateWidgetCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					UidiagramVisualIDRegistry.getType(Appbar5EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv), UidiagramVisualIDRegistry
					.getType(UserInterfaceUserInterfaceListTemplateWidgetCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					UidiagramVisualIDRegistry.getType(Tabbar5EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv), UidiagramVisualIDRegistry
					.getType(UserInterfaceUserInterfaceListTemplateWidgetCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					UidiagramVisualIDRegistry.getType(Button7EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv), UidiagramVisualIDRegistry
					.getType(UserInterfaceUserInterfaceListTemplateWidgetCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					UidiagramVisualIDRegistry.getType(Label7EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv), UidiagramVisualIDRegistry
					.getType(UserInterfaceUserInterfaceListTemplateWidgetCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					UidiagramVisualIDRegistry.getType(Checkbox5EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv), UidiagramVisualIDRegistry
					.getType(UserInterfaceUserInterfaceListTemplateWidgetCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					UidiagramVisualIDRegistry.getType(Input5EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv), UidiagramVisualIDRegistry
					.getType(UserInterfaceUserInterfaceListTemplateWidgetCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					UidiagramVisualIDRegistry.getType(ListView5EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv), UidiagramVisualIDRegistry
					.getType(UserInterfaceUserInterfaceListTemplateWidgetCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					UidiagramVisualIDRegistry.getType(RadioButton5EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv), UidiagramVisualIDRegistry
					.getType(UserInterfaceUserInterfaceListTemplateWidgetCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					UidiagramVisualIDRegistry.getType(ComboBox5EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv), UidiagramVisualIDRegistry
					.getType(UserInterfaceUserInterfaceListTemplateWidgetCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					UidiagramVisualIDRegistry.getType(DatePicker5EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv), UidiagramVisualIDRegistry
					.getType(UserInterfaceUserInterfaceListTemplateWidgetCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					UidiagramVisualIDRegistry.getType(Switch5EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv), UidiagramVisualIDRegistry
					.getType(UserInterfaceUserInterfaceListTemplateWidgetCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					UidiagramVisualIDRegistry.getType(Table5EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			return result.toArray();
		}

		case GroupEditPart.VISUAL_ID: {
			LinkedList<UidiagramAbstractNavigatorItem> result = new LinkedList<UidiagramAbstractNavigatorItem>();
			Node sv = (Node) view;
			Collection<View> connectedViews;
			connectedViews = getChildrenByType(Collections.singleton(sv),
					UidiagramVisualIDRegistry.getType(GroupGroupTemplateWidgetCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					UidiagramVisualIDRegistry.getType(Group2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					UidiagramVisualIDRegistry.getType(GroupGroupTemplateWidgetCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					UidiagramVisualIDRegistry.getType(GroupColumnEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					UidiagramVisualIDRegistry.getType(GroupGroupTemplateWidgetCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					UidiagramVisualIDRegistry.getType(GroupRowEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					UidiagramVisualIDRegistry.getType(GroupGroupTemplateWidgetCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					UidiagramVisualIDRegistry.getType(AppbarEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					UidiagramVisualIDRegistry.getType(GroupGroupTemplateWidgetCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					UidiagramVisualIDRegistry.getType(TabbarEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					UidiagramVisualIDRegistry.getType(GroupGroupTemplateWidgetCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					UidiagramVisualIDRegistry.getType(Button3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					UidiagramVisualIDRegistry.getType(GroupGroupTemplateWidgetCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					UidiagramVisualIDRegistry.getType(Label3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					UidiagramVisualIDRegistry.getType(GroupGroupTemplateWidgetCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					UidiagramVisualIDRegistry.getType(CheckboxEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					UidiagramVisualIDRegistry.getType(GroupGroupTemplateWidgetCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					UidiagramVisualIDRegistry.getType(InputEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					UidiagramVisualIDRegistry.getType(GroupGroupTemplateWidgetCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					UidiagramVisualIDRegistry.getType(ListViewEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					UidiagramVisualIDRegistry.getType(GroupGroupTemplateWidgetCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					UidiagramVisualIDRegistry.getType(RadioButtonEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					UidiagramVisualIDRegistry.getType(GroupGroupTemplateWidgetCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					UidiagramVisualIDRegistry.getType(ComboBoxEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					UidiagramVisualIDRegistry.getType(GroupGroupTemplateWidgetCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					UidiagramVisualIDRegistry.getType(DatePickerEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					UidiagramVisualIDRegistry.getType(GroupGroupTemplateWidgetCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					UidiagramVisualIDRegistry.getType(SwitchEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					UidiagramVisualIDRegistry.getType(GroupGroupTemplateWidgetCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					UidiagramVisualIDRegistry.getType(TableEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			return result.toArray();
		}

		case Group2EditPart.VISUAL_ID: {
			LinkedList<UidiagramAbstractNavigatorItem> result = new LinkedList<UidiagramAbstractNavigatorItem>();
			Node sv = (Node) view;
			Collection<View> connectedViews;
			connectedViews = getChildrenByType(Collections.singleton(sv),
					UidiagramVisualIDRegistry.getType(GroupGroupTemplateWidgetCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					UidiagramVisualIDRegistry.getType(Group2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					UidiagramVisualIDRegistry.getType(GroupGroupTemplateWidgetCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					UidiagramVisualIDRegistry.getType(GroupColumnEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					UidiagramVisualIDRegistry.getType(GroupGroupTemplateWidgetCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					UidiagramVisualIDRegistry.getType(GroupRowEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					UidiagramVisualIDRegistry.getType(GroupGroupTemplateWidgetCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					UidiagramVisualIDRegistry.getType(AppbarEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					UidiagramVisualIDRegistry.getType(GroupGroupTemplateWidgetCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					UidiagramVisualIDRegistry.getType(TabbarEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					UidiagramVisualIDRegistry.getType(GroupGroupTemplateWidgetCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					UidiagramVisualIDRegistry.getType(Button3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					UidiagramVisualIDRegistry.getType(GroupGroupTemplateWidgetCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					UidiagramVisualIDRegistry.getType(Label3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					UidiagramVisualIDRegistry.getType(GroupGroupTemplateWidgetCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					UidiagramVisualIDRegistry.getType(CheckboxEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					UidiagramVisualIDRegistry.getType(GroupGroupTemplateWidgetCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					UidiagramVisualIDRegistry.getType(InputEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					UidiagramVisualIDRegistry.getType(GroupGroupTemplateWidgetCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					UidiagramVisualIDRegistry.getType(ListViewEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					UidiagramVisualIDRegistry.getType(GroupGroupTemplateWidgetCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					UidiagramVisualIDRegistry.getType(RadioButtonEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					UidiagramVisualIDRegistry.getType(GroupGroupTemplateWidgetCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					UidiagramVisualIDRegistry.getType(ComboBoxEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					UidiagramVisualIDRegistry.getType(GroupGroupTemplateWidgetCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					UidiagramVisualIDRegistry.getType(DatePickerEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					UidiagramVisualIDRegistry.getType(GroupGroupTemplateWidgetCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					UidiagramVisualIDRegistry.getType(SwitchEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					UidiagramVisualIDRegistry.getType(GroupGroupTemplateWidgetCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					UidiagramVisualIDRegistry.getType(TableEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			return result.toArray();
		}

		case GroupColumnEditPart.VISUAL_ID: {
			LinkedList<UidiagramAbstractNavigatorItem> result = new LinkedList<UidiagramAbstractNavigatorItem>();
			Node sv = (Node) view;
			Collection<View> connectedViews;
			connectedViews = getChildrenByType(Collections.singleton(sv), UidiagramVisualIDRegistry
					.getType(GroupColumnGroupColumnListTemplateWidgetCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					UidiagramVisualIDRegistry.getType(Group3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv), UidiagramVisualIDRegistry
					.getType(GroupColumnGroupColumnListTemplateWidgetCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					UidiagramVisualIDRegistry.getType(GroupColumn3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv), UidiagramVisualIDRegistry
					.getType(GroupColumnGroupColumnListTemplateWidgetCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					UidiagramVisualIDRegistry.getType(GroupRow2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv), UidiagramVisualIDRegistry
					.getType(GroupColumnGroupColumnListTemplateWidgetCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					UidiagramVisualIDRegistry.getType(Appbar2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv), UidiagramVisualIDRegistry
					.getType(GroupColumnGroupColumnListTemplateWidgetCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					UidiagramVisualIDRegistry.getType(Tabbar2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv), UidiagramVisualIDRegistry
					.getType(GroupColumnGroupColumnListTemplateWidgetCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					UidiagramVisualIDRegistry.getType(Button4EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv), UidiagramVisualIDRegistry
					.getType(GroupColumnGroupColumnListTemplateWidgetCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					UidiagramVisualIDRegistry.getType(Label4EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv), UidiagramVisualIDRegistry
					.getType(GroupColumnGroupColumnListTemplateWidgetCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					UidiagramVisualIDRegistry.getType(Checkbox2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv), UidiagramVisualIDRegistry
					.getType(GroupColumnGroupColumnListTemplateWidgetCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					UidiagramVisualIDRegistry.getType(Input2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv), UidiagramVisualIDRegistry
					.getType(GroupColumnGroupColumnListTemplateWidgetCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					UidiagramVisualIDRegistry.getType(ListView2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv), UidiagramVisualIDRegistry
					.getType(GroupColumnGroupColumnListTemplateWidgetCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					UidiagramVisualIDRegistry.getType(RadioButton4EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv), UidiagramVisualIDRegistry
					.getType(GroupColumnGroupColumnListTemplateWidgetCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					UidiagramVisualIDRegistry.getType(ComboBox4EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv), UidiagramVisualIDRegistry
					.getType(GroupColumnGroupColumnListTemplateWidgetCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					UidiagramVisualIDRegistry.getType(DatePicker4EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv), UidiagramVisualIDRegistry
					.getType(GroupColumnGroupColumnListTemplateWidgetCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					UidiagramVisualIDRegistry.getType(Switch4EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv), UidiagramVisualIDRegistry
					.getType(GroupColumnGroupColumnListTemplateWidgetCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					UidiagramVisualIDRegistry.getType(Table4EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			return result.toArray();
		}

		case Group3EditPart.VISUAL_ID: {
			LinkedList<UidiagramAbstractNavigatorItem> result = new LinkedList<UidiagramAbstractNavigatorItem>();
			Node sv = (Node) view;
			Collection<View> connectedViews;
			connectedViews = getChildrenByType(Collections.singleton(sv),
					UidiagramVisualIDRegistry.getType(GroupGroupTemplateWidgetCompartment3EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					UidiagramVisualIDRegistry.getType(Group2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					UidiagramVisualIDRegistry.getType(GroupGroupTemplateWidgetCompartment3EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					UidiagramVisualIDRegistry.getType(GroupColumnEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					UidiagramVisualIDRegistry.getType(GroupGroupTemplateWidgetCompartment3EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					UidiagramVisualIDRegistry.getType(GroupRowEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					UidiagramVisualIDRegistry.getType(GroupGroupTemplateWidgetCompartment3EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					UidiagramVisualIDRegistry.getType(AppbarEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					UidiagramVisualIDRegistry.getType(GroupGroupTemplateWidgetCompartment3EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					UidiagramVisualIDRegistry.getType(TabbarEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					UidiagramVisualIDRegistry.getType(GroupGroupTemplateWidgetCompartment3EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					UidiagramVisualIDRegistry.getType(Button3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					UidiagramVisualIDRegistry.getType(GroupGroupTemplateWidgetCompartment3EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					UidiagramVisualIDRegistry.getType(Label3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					UidiagramVisualIDRegistry.getType(GroupGroupTemplateWidgetCompartment3EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					UidiagramVisualIDRegistry.getType(CheckboxEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					UidiagramVisualIDRegistry.getType(GroupGroupTemplateWidgetCompartment3EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					UidiagramVisualIDRegistry.getType(InputEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					UidiagramVisualIDRegistry.getType(GroupGroupTemplateWidgetCompartment3EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					UidiagramVisualIDRegistry.getType(ListViewEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					UidiagramVisualIDRegistry.getType(GroupGroupTemplateWidgetCompartment3EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					UidiagramVisualIDRegistry.getType(RadioButtonEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					UidiagramVisualIDRegistry.getType(GroupGroupTemplateWidgetCompartment3EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					UidiagramVisualIDRegistry.getType(ComboBoxEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					UidiagramVisualIDRegistry.getType(GroupGroupTemplateWidgetCompartment3EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					UidiagramVisualIDRegistry.getType(DatePickerEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					UidiagramVisualIDRegistry.getType(GroupGroupTemplateWidgetCompartment3EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					UidiagramVisualIDRegistry.getType(SwitchEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					UidiagramVisualIDRegistry.getType(GroupGroupTemplateWidgetCompartment3EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					UidiagramVisualIDRegistry.getType(TableEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			return result.toArray();
		}

		case GroupRowEditPart.VISUAL_ID: {
			LinkedList<UidiagramAbstractNavigatorItem> result = new LinkedList<UidiagramAbstractNavigatorItem>();
			Node sv = (Node) view;
			Collection<View> connectedViews;
			connectedViews = getChildrenByType(Collections.singleton(sv),
					UidiagramVisualIDRegistry.getType(GroupRowGroupRowListTemplateWidgetCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					UidiagramVisualIDRegistry.getType(Group4EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					UidiagramVisualIDRegistry.getType(GroupRowGroupRowListTemplateWidgetCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					UidiagramVisualIDRegistry.getType(GroupColumn4EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					UidiagramVisualIDRegistry.getType(GroupRowGroupRowListTemplateWidgetCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					UidiagramVisualIDRegistry.getType(GroupRow4EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					UidiagramVisualIDRegistry.getType(GroupRowGroupRowListTemplateWidgetCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					UidiagramVisualIDRegistry.getType(Appbar3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					UidiagramVisualIDRegistry.getType(GroupRowGroupRowListTemplateWidgetCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					UidiagramVisualIDRegistry.getType(Tabbar3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					UidiagramVisualIDRegistry.getType(GroupRowGroupRowListTemplateWidgetCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					UidiagramVisualIDRegistry.getType(Button5EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					UidiagramVisualIDRegistry.getType(GroupRowGroupRowListTemplateWidgetCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					UidiagramVisualIDRegistry.getType(Label5EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					UidiagramVisualIDRegistry.getType(GroupRowGroupRowListTemplateWidgetCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					UidiagramVisualIDRegistry.getType(Checkbox3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					UidiagramVisualIDRegistry.getType(GroupRowGroupRowListTemplateWidgetCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					UidiagramVisualIDRegistry.getType(Input3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					UidiagramVisualIDRegistry.getType(GroupRowGroupRowListTemplateWidgetCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					UidiagramVisualIDRegistry.getType(ListView3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					UidiagramVisualIDRegistry.getType(GroupRowGroupRowListTemplateWidgetCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					UidiagramVisualIDRegistry.getType(RadioButton3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					UidiagramVisualIDRegistry.getType(GroupRowGroupRowListTemplateWidgetCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					UidiagramVisualIDRegistry.getType(ComboBox3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					UidiagramVisualIDRegistry.getType(GroupRowGroupRowListTemplateWidgetCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					UidiagramVisualIDRegistry.getType(DatePicker3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					UidiagramVisualIDRegistry.getType(GroupRowGroupRowListTemplateWidgetCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					UidiagramVisualIDRegistry.getType(Switch3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					UidiagramVisualIDRegistry.getType(GroupRowGroupRowListTemplateWidgetCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					UidiagramVisualIDRegistry.getType(Table3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			return result.toArray();
		}

		case Group4EditPart.VISUAL_ID: {
			LinkedList<UidiagramAbstractNavigatorItem> result = new LinkedList<UidiagramAbstractNavigatorItem>();
			Node sv = (Node) view;
			Collection<View> connectedViews;
			connectedViews = getChildrenByType(Collections.singleton(sv),
					UidiagramVisualIDRegistry.getType(GroupGroupTemplateWidgetCompartment4EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					UidiagramVisualIDRegistry.getType(Group2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					UidiagramVisualIDRegistry.getType(GroupGroupTemplateWidgetCompartment4EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					UidiagramVisualIDRegistry.getType(GroupColumnEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					UidiagramVisualIDRegistry.getType(GroupGroupTemplateWidgetCompartment4EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					UidiagramVisualIDRegistry.getType(GroupRowEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					UidiagramVisualIDRegistry.getType(GroupGroupTemplateWidgetCompartment4EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					UidiagramVisualIDRegistry.getType(AppbarEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					UidiagramVisualIDRegistry.getType(GroupGroupTemplateWidgetCompartment4EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					UidiagramVisualIDRegistry.getType(TabbarEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					UidiagramVisualIDRegistry.getType(GroupGroupTemplateWidgetCompartment4EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					UidiagramVisualIDRegistry.getType(Button3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					UidiagramVisualIDRegistry.getType(GroupGroupTemplateWidgetCompartment4EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					UidiagramVisualIDRegistry.getType(Label3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					UidiagramVisualIDRegistry.getType(GroupGroupTemplateWidgetCompartment4EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					UidiagramVisualIDRegistry.getType(CheckboxEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					UidiagramVisualIDRegistry.getType(GroupGroupTemplateWidgetCompartment4EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					UidiagramVisualIDRegistry.getType(InputEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					UidiagramVisualIDRegistry.getType(GroupGroupTemplateWidgetCompartment4EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					UidiagramVisualIDRegistry.getType(ListViewEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					UidiagramVisualIDRegistry.getType(GroupGroupTemplateWidgetCompartment4EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					UidiagramVisualIDRegistry.getType(RadioButtonEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					UidiagramVisualIDRegistry.getType(GroupGroupTemplateWidgetCompartment4EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					UidiagramVisualIDRegistry.getType(ComboBoxEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					UidiagramVisualIDRegistry.getType(GroupGroupTemplateWidgetCompartment4EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					UidiagramVisualIDRegistry.getType(DatePickerEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					UidiagramVisualIDRegistry.getType(GroupGroupTemplateWidgetCompartment4EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					UidiagramVisualIDRegistry.getType(SwitchEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					UidiagramVisualIDRegistry.getType(GroupGroupTemplateWidgetCompartment4EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					UidiagramVisualIDRegistry.getType(TableEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			return result.toArray();
		}

		case AppbarEditPart.VISUAL_ID: {
			LinkedList<UidiagramAbstractNavigatorItem> result = new LinkedList<UidiagramAbstractNavigatorItem>();
			Node sv = (Node) view;
			Collection<View> connectedViews;
			connectedViews = getChildrenByType(Collections.singleton(sv),
					UidiagramVisualIDRegistry.getType(AppbarAppbarListButtonsCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					UidiagramVisualIDRegistry.getType(ButtonEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					UidiagramVisualIDRegistry.getType(AppbarAppbarListLabelsCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					UidiagramVisualIDRegistry.getType(LabelEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			return result.toArray();
		}

		case TabbarEditPart.VISUAL_ID: {
			LinkedList<UidiagramAbstractNavigatorItem> result = new LinkedList<UidiagramAbstractNavigatorItem>();
			Node sv = (Node) view;
			Collection<View> connectedViews;
			connectedViews = getChildrenByType(Collections.singleton(sv),
					UidiagramVisualIDRegistry.getType(TabbarTabbarListButtonsCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					UidiagramVisualIDRegistry.getType(Button2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					UidiagramVisualIDRegistry.getType(TabbarTabbarListLabelsCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					UidiagramVisualIDRegistry.getType(Label2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			return result.toArray();
		}

		case ListViewEditPart.VISUAL_ID: {
			LinkedList<UidiagramAbstractNavigatorItem> result = new LinkedList<UidiagramAbstractNavigatorItem>();
			Node sv = (Node) view;
			Collection<View> connectedViews;
			connectedViews = getChildrenByType(Collections.singleton(sv),
					UidiagramVisualIDRegistry.getType(ListViewListViewTemplateWidgetCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					UidiagramVisualIDRegistry.getType(Group5EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					UidiagramVisualIDRegistry.getType(ListViewListViewTemplateWidgetCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					UidiagramVisualIDRegistry.getType(GroupColumn2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					UidiagramVisualIDRegistry.getType(ListViewListViewTemplateWidgetCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					UidiagramVisualIDRegistry.getType(GroupRow3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					UidiagramVisualIDRegistry.getType(ListViewListViewTemplateWidgetCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					UidiagramVisualIDRegistry.getType(Appbar4EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					UidiagramVisualIDRegistry.getType(ListViewListViewTemplateWidgetCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					UidiagramVisualIDRegistry.getType(Tabbar4EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					UidiagramVisualIDRegistry.getType(ListViewListViewTemplateWidgetCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					UidiagramVisualIDRegistry.getType(Button6EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					UidiagramVisualIDRegistry.getType(ListViewListViewTemplateWidgetCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					UidiagramVisualIDRegistry.getType(Label6EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					UidiagramVisualIDRegistry.getType(ListViewListViewTemplateWidgetCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					UidiagramVisualIDRegistry.getType(Checkbox4EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					UidiagramVisualIDRegistry.getType(ListViewListViewTemplateWidgetCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					UidiagramVisualIDRegistry.getType(Input4EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					UidiagramVisualIDRegistry.getType(ListViewListViewTemplateWidgetCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					UidiagramVisualIDRegistry.getType(ListView4EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					UidiagramVisualIDRegistry.getType(ListViewListViewTemplateWidgetCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					UidiagramVisualIDRegistry.getType(RadioButton2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					UidiagramVisualIDRegistry.getType(ListViewListViewTemplateWidgetCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					UidiagramVisualIDRegistry.getType(ComboBox2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					UidiagramVisualIDRegistry.getType(ListViewListViewTemplateWidgetCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					UidiagramVisualIDRegistry.getType(DatePicker2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					UidiagramVisualIDRegistry.getType(ListViewListViewTemplateWidgetCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					UidiagramVisualIDRegistry.getType(Switch2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					UidiagramVisualIDRegistry.getType(ListViewListViewTemplateWidgetCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					UidiagramVisualIDRegistry.getType(Table2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			return result.toArray();
		}

		case Group5EditPart.VISUAL_ID: {
			LinkedList<UidiagramAbstractNavigatorItem> result = new LinkedList<UidiagramAbstractNavigatorItem>();
			Node sv = (Node) view;
			Collection<View> connectedViews;
			connectedViews = getChildrenByType(Collections.singleton(sv),
					UidiagramVisualIDRegistry.getType(GroupGroupTemplateWidgetCompartment5EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					UidiagramVisualIDRegistry.getType(Group2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					UidiagramVisualIDRegistry.getType(GroupGroupTemplateWidgetCompartment5EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					UidiagramVisualIDRegistry.getType(GroupColumnEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					UidiagramVisualIDRegistry.getType(GroupGroupTemplateWidgetCompartment5EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					UidiagramVisualIDRegistry.getType(GroupRowEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					UidiagramVisualIDRegistry.getType(GroupGroupTemplateWidgetCompartment5EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					UidiagramVisualIDRegistry.getType(AppbarEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					UidiagramVisualIDRegistry.getType(GroupGroupTemplateWidgetCompartment5EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					UidiagramVisualIDRegistry.getType(TabbarEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					UidiagramVisualIDRegistry.getType(GroupGroupTemplateWidgetCompartment5EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					UidiagramVisualIDRegistry.getType(Button3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					UidiagramVisualIDRegistry.getType(GroupGroupTemplateWidgetCompartment5EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					UidiagramVisualIDRegistry.getType(Label3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					UidiagramVisualIDRegistry.getType(GroupGroupTemplateWidgetCompartment5EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					UidiagramVisualIDRegistry.getType(CheckboxEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					UidiagramVisualIDRegistry.getType(GroupGroupTemplateWidgetCompartment5EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					UidiagramVisualIDRegistry.getType(InputEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					UidiagramVisualIDRegistry.getType(GroupGroupTemplateWidgetCompartment5EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					UidiagramVisualIDRegistry.getType(ListViewEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					UidiagramVisualIDRegistry.getType(GroupGroupTemplateWidgetCompartment5EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					UidiagramVisualIDRegistry.getType(RadioButtonEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					UidiagramVisualIDRegistry.getType(GroupGroupTemplateWidgetCompartment5EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					UidiagramVisualIDRegistry.getType(ComboBoxEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					UidiagramVisualIDRegistry.getType(GroupGroupTemplateWidgetCompartment5EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					UidiagramVisualIDRegistry.getType(DatePickerEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					UidiagramVisualIDRegistry.getType(GroupGroupTemplateWidgetCompartment5EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					UidiagramVisualIDRegistry.getType(SwitchEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					UidiagramVisualIDRegistry.getType(GroupGroupTemplateWidgetCompartment5EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					UidiagramVisualIDRegistry.getType(TableEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			return result.toArray();
		}

		case TableEditPart.VISUAL_ID: {
			LinkedList<UidiagramAbstractNavigatorItem> result = new LinkedList<UidiagramAbstractNavigatorItem>();
			Node sv = (Node) view;
			Collection<View> connectedViews;
			connectedViews = getChildrenByType(Collections.singleton(sv),
					UidiagramVisualIDRegistry.getType(TableTableListCoulmnsCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					UidiagramVisualIDRegistry.getType(ColumnEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			return result.toArray();
		}

		case GroupColumn2EditPart.VISUAL_ID: {
			LinkedList<UidiagramAbstractNavigatorItem> result = new LinkedList<UidiagramAbstractNavigatorItem>();
			Node sv = (Node) view;
			Collection<View> connectedViews;
			connectedViews = getChildrenByType(Collections.singleton(sv), UidiagramVisualIDRegistry
					.getType(GroupColumnGroupColumnListTemplateWidgetCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					UidiagramVisualIDRegistry.getType(Group3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv), UidiagramVisualIDRegistry
					.getType(GroupColumnGroupColumnListTemplateWidgetCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					UidiagramVisualIDRegistry.getType(GroupColumn3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv), UidiagramVisualIDRegistry
					.getType(GroupColumnGroupColumnListTemplateWidgetCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					UidiagramVisualIDRegistry.getType(GroupRow2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv), UidiagramVisualIDRegistry
					.getType(GroupColumnGroupColumnListTemplateWidgetCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					UidiagramVisualIDRegistry.getType(Appbar2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv), UidiagramVisualIDRegistry
					.getType(GroupColumnGroupColumnListTemplateWidgetCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					UidiagramVisualIDRegistry.getType(Tabbar2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv), UidiagramVisualIDRegistry
					.getType(GroupColumnGroupColumnListTemplateWidgetCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					UidiagramVisualIDRegistry.getType(Button4EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv), UidiagramVisualIDRegistry
					.getType(GroupColumnGroupColumnListTemplateWidgetCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					UidiagramVisualIDRegistry.getType(Label4EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv), UidiagramVisualIDRegistry
					.getType(GroupColumnGroupColumnListTemplateWidgetCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					UidiagramVisualIDRegistry.getType(Checkbox2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv), UidiagramVisualIDRegistry
					.getType(GroupColumnGroupColumnListTemplateWidgetCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					UidiagramVisualIDRegistry.getType(Input2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv), UidiagramVisualIDRegistry
					.getType(GroupColumnGroupColumnListTemplateWidgetCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					UidiagramVisualIDRegistry.getType(ListView2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv), UidiagramVisualIDRegistry
					.getType(GroupColumnGroupColumnListTemplateWidgetCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					UidiagramVisualIDRegistry.getType(RadioButton4EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv), UidiagramVisualIDRegistry
					.getType(GroupColumnGroupColumnListTemplateWidgetCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					UidiagramVisualIDRegistry.getType(ComboBox4EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv), UidiagramVisualIDRegistry
					.getType(GroupColumnGroupColumnListTemplateWidgetCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					UidiagramVisualIDRegistry.getType(DatePicker4EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv), UidiagramVisualIDRegistry
					.getType(GroupColumnGroupColumnListTemplateWidgetCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					UidiagramVisualIDRegistry.getType(Switch4EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv), UidiagramVisualIDRegistry
					.getType(GroupColumnGroupColumnListTemplateWidgetCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					UidiagramVisualIDRegistry.getType(Table4EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			return result.toArray();
		}

		case GroupColumn3EditPart.VISUAL_ID: {
			LinkedList<UidiagramAbstractNavigatorItem> result = new LinkedList<UidiagramAbstractNavigatorItem>();
			Node sv = (Node) view;
			Collection<View> connectedViews;
			connectedViews = getChildrenByType(Collections.singleton(sv), UidiagramVisualIDRegistry
					.getType(GroupColumnGroupColumnListTemplateWidgetCompartment3EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					UidiagramVisualIDRegistry.getType(Group3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv), UidiagramVisualIDRegistry
					.getType(GroupColumnGroupColumnListTemplateWidgetCompartment3EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					UidiagramVisualIDRegistry.getType(GroupColumn3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv), UidiagramVisualIDRegistry
					.getType(GroupColumnGroupColumnListTemplateWidgetCompartment3EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					UidiagramVisualIDRegistry.getType(GroupRow2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv), UidiagramVisualIDRegistry
					.getType(GroupColumnGroupColumnListTemplateWidgetCompartment3EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					UidiagramVisualIDRegistry.getType(Appbar2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv), UidiagramVisualIDRegistry
					.getType(GroupColumnGroupColumnListTemplateWidgetCompartment3EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					UidiagramVisualIDRegistry.getType(Tabbar2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv), UidiagramVisualIDRegistry
					.getType(GroupColumnGroupColumnListTemplateWidgetCompartment3EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					UidiagramVisualIDRegistry.getType(Button4EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv), UidiagramVisualIDRegistry
					.getType(GroupColumnGroupColumnListTemplateWidgetCompartment3EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					UidiagramVisualIDRegistry.getType(Label4EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv), UidiagramVisualIDRegistry
					.getType(GroupColumnGroupColumnListTemplateWidgetCompartment3EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					UidiagramVisualIDRegistry.getType(Checkbox2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv), UidiagramVisualIDRegistry
					.getType(GroupColumnGroupColumnListTemplateWidgetCompartment3EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					UidiagramVisualIDRegistry.getType(Input2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv), UidiagramVisualIDRegistry
					.getType(GroupColumnGroupColumnListTemplateWidgetCompartment3EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					UidiagramVisualIDRegistry.getType(ListView2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv), UidiagramVisualIDRegistry
					.getType(GroupColumnGroupColumnListTemplateWidgetCompartment3EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					UidiagramVisualIDRegistry.getType(RadioButton4EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv), UidiagramVisualIDRegistry
					.getType(GroupColumnGroupColumnListTemplateWidgetCompartment3EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					UidiagramVisualIDRegistry.getType(ComboBox4EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv), UidiagramVisualIDRegistry
					.getType(GroupColumnGroupColumnListTemplateWidgetCompartment3EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					UidiagramVisualIDRegistry.getType(DatePicker4EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv), UidiagramVisualIDRegistry
					.getType(GroupColumnGroupColumnListTemplateWidgetCompartment3EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					UidiagramVisualIDRegistry.getType(Switch4EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv), UidiagramVisualIDRegistry
					.getType(GroupColumnGroupColumnListTemplateWidgetCompartment3EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					UidiagramVisualIDRegistry.getType(Table4EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			return result.toArray();
		}

		case GroupRow2EditPart.VISUAL_ID: {
			LinkedList<UidiagramAbstractNavigatorItem> result = new LinkedList<UidiagramAbstractNavigatorItem>();
			Node sv = (Node) view;
			Collection<View> connectedViews;
			connectedViews = getChildrenByType(Collections.singleton(sv), UidiagramVisualIDRegistry
					.getType(GroupRowGroupRowListTemplateWidgetCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					UidiagramVisualIDRegistry.getType(Group4EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv), UidiagramVisualIDRegistry
					.getType(GroupRowGroupRowListTemplateWidgetCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					UidiagramVisualIDRegistry.getType(GroupColumn4EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv), UidiagramVisualIDRegistry
					.getType(GroupRowGroupRowListTemplateWidgetCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					UidiagramVisualIDRegistry.getType(GroupRow4EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv), UidiagramVisualIDRegistry
					.getType(GroupRowGroupRowListTemplateWidgetCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					UidiagramVisualIDRegistry.getType(Appbar3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv), UidiagramVisualIDRegistry
					.getType(GroupRowGroupRowListTemplateWidgetCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					UidiagramVisualIDRegistry.getType(Tabbar3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv), UidiagramVisualIDRegistry
					.getType(GroupRowGroupRowListTemplateWidgetCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					UidiagramVisualIDRegistry.getType(Button5EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv), UidiagramVisualIDRegistry
					.getType(GroupRowGroupRowListTemplateWidgetCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					UidiagramVisualIDRegistry.getType(Label5EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv), UidiagramVisualIDRegistry
					.getType(GroupRowGroupRowListTemplateWidgetCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					UidiagramVisualIDRegistry.getType(Checkbox3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv), UidiagramVisualIDRegistry
					.getType(GroupRowGroupRowListTemplateWidgetCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					UidiagramVisualIDRegistry.getType(Input3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv), UidiagramVisualIDRegistry
					.getType(GroupRowGroupRowListTemplateWidgetCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					UidiagramVisualIDRegistry.getType(ListView3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv), UidiagramVisualIDRegistry
					.getType(GroupRowGroupRowListTemplateWidgetCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					UidiagramVisualIDRegistry.getType(RadioButton3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv), UidiagramVisualIDRegistry
					.getType(GroupRowGroupRowListTemplateWidgetCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					UidiagramVisualIDRegistry.getType(ComboBox3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv), UidiagramVisualIDRegistry
					.getType(GroupRowGroupRowListTemplateWidgetCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					UidiagramVisualIDRegistry.getType(DatePicker3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv), UidiagramVisualIDRegistry
					.getType(GroupRowGroupRowListTemplateWidgetCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					UidiagramVisualIDRegistry.getType(Switch3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv), UidiagramVisualIDRegistry
					.getType(GroupRowGroupRowListTemplateWidgetCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					UidiagramVisualIDRegistry.getType(Table3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			return result.toArray();
		}

		case GroupColumn4EditPart.VISUAL_ID: {
			LinkedList<UidiagramAbstractNavigatorItem> result = new LinkedList<UidiagramAbstractNavigatorItem>();
			Node sv = (Node) view;
			Collection<View> connectedViews;
			connectedViews = getChildrenByType(Collections.singleton(sv), UidiagramVisualIDRegistry
					.getType(GroupColumnGroupColumnListTemplateWidgetCompartment4EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					UidiagramVisualIDRegistry.getType(Group3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv), UidiagramVisualIDRegistry
					.getType(GroupColumnGroupColumnListTemplateWidgetCompartment4EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					UidiagramVisualIDRegistry.getType(GroupColumn3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv), UidiagramVisualIDRegistry
					.getType(GroupColumnGroupColumnListTemplateWidgetCompartment4EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					UidiagramVisualIDRegistry.getType(GroupRow2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv), UidiagramVisualIDRegistry
					.getType(GroupColumnGroupColumnListTemplateWidgetCompartment4EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					UidiagramVisualIDRegistry.getType(Appbar2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv), UidiagramVisualIDRegistry
					.getType(GroupColumnGroupColumnListTemplateWidgetCompartment4EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					UidiagramVisualIDRegistry.getType(Tabbar2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv), UidiagramVisualIDRegistry
					.getType(GroupColumnGroupColumnListTemplateWidgetCompartment4EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					UidiagramVisualIDRegistry.getType(Button4EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv), UidiagramVisualIDRegistry
					.getType(GroupColumnGroupColumnListTemplateWidgetCompartment4EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					UidiagramVisualIDRegistry.getType(Label4EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv), UidiagramVisualIDRegistry
					.getType(GroupColumnGroupColumnListTemplateWidgetCompartment4EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					UidiagramVisualIDRegistry.getType(Checkbox2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv), UidiagramVisualIDRegistry
					.getType(GroupColumnGroupColumnListTemplateWidgetCompartment4EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					UidiagramVisualIDRegistry.getType(Input2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv), UidiagramVisualIDRegistry
					.getType(GroupColumnGroupColumnListTemplateWidgetCompartment4EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					UidiagramVisualIDRegistry.getType(ListView2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv), UidiagramVisualIDRegistry
					.getType(GroupColumnGroupColumnListTemplateWidgetCompartment4EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					UidiagramVisualIDRegistry.getType(RadioButton4EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv), UidiagramVisualIDRegistry
					.getType(GroupColumnGroupColumnListTemplateWidgetCompartment4EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					UidiagramVisualIDRegistry.getType(ComboBox4EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv), UidiagramVisualIDRegistry
					.getType(GroupColumnGroupColumnListTemplateWidgetCompartment4EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					UidiagramVisualIDRegistry.getType(DatePicker4EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv), UidiagramVisualIDRegistry
					.getType(GroupColumnGroupColumnListTemplateWidgetCompartment4EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					UidiagramVisualIDRegistry.getType(Switch4EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv), UidiagramVisualIDRegistry
					.getType(GroupColumnGroupColumnListTemplateWidgetCompartment4EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					UidiagramVisualIDRegistry.getType(Table4EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			return result.toArray();
		}

		case Appbar2EditPart.VISUAL_ID: {
			LinkedList<UidiagramAbstractNavigatorItem> result = new LinkedList<UidiagramAbstractNavigatorItem>();
			Node sv = (Node) view;
			Collection<View> connectedViews;
			connectedViews = getChildrenByType(Collections.singleton(sv),
					UidiagramVisualIDRegistry.getType(AppbarAppbarListButtonsCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					UidiagramVisualIDRegistry.getType(ButtonEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					UidiagramVisualIDRegistry.getType(AppbarAppbarListLabelsCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					UidiagramVisualIDRegistry.getType(LabelEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			return result.toArray();
		}

		case Tabbar2EditPart.VISUAL_ID: {
			LinkedList<UidiagramAbstractNavigatorItem> result = new LinkedList<UidiagramAbstractNavigatorItem>();
			Node sv = (Node) view;
			Collection<View> connectedViews;
			connectedViews = getChildrenByType(Collections.singleton(sv),
					UidiagramVisualIDRegistry.getType(TabbarTabbarListButtonsCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					UidiagramVisualIDRegistry.getType(Button2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					UidiagramVisualIDRegistry.getType(TabbarTabbarListLabelsCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					UidiagramVisualIDRegistry.getType(Label2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			return result.toArray();
		}

		case ListView2EditPart.VISUAL_ID: {
			LinkedList<UidiagramAbstractNavigatorItem> result = new LinkedList<UidiagramAbstractNavigatorItem>();
			Node sv = (Node) view;
			Collection<View> connectedViews;
			connectedViews = getChildrenByType(Collections.singleton(sv),
					UidiagramVisualIDRegistry.getType(ListViewListViewTemplateWidgetCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					UidiagramVisualIDRegistry.getType(Group5EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					UidiagramVisualIDRegistry.getType(ListViewListViewTemplateWidgetCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					UidiagramVisualIDRegistry.getType(GroupColumn2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					UidiagramVisualIDRegistry.getType(ListViewListViewTemplateWidgetCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					UidiagramVisualIDRegistry.getType(GroupRow3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					UidiagramVisualIDRegistry.getType(ListViewListViewTemplateWidgetCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					UidiagramVisualIDRegistry.getType(Appbar4EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					UidiagramVisualIDRegistry.getType(ListViewListViewTemplateWidgetCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					UidiagramVisualIDRegistry.getType(Tabbar4EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					UidiagramVisualIDRegistry.getType(ListViewListViewTemplateWidgetCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					UidiagramVisualIDRegistry.getType(Button6EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					UidiagramVisualIDRegistry.getType(ListViewListViewTemplateWidgetCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					UidiagramVisualIDRegistry.getType(Label6EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					UidiagramVisualIDRegistry.getType(ListViewListViewTemplateWidgetCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					UidiagramVisualIDRegistry.getType(Checkbox4EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					UidiagramVisualIDRegistry.getType(ListViewListViewTemplateWidgetCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					UidiagramVisualIDRegistry.getType(Input4EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					UidiagramVisualIDRegistry.getType(ListViewListViewTemplateWidgetCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					UidiagramVisualIDRegistry.getType(ListView4EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					UidiagramVisualIDRegistry.getType(ListViewListViewTemplateWidgetCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					UidiagramVisualIDRegistry.getType(RadioButton2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					UidiagramVisualIDRegistry.getType(ListViewListViewTemplateWidgetCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					UidiagramVisualIDRegistry.getType(ComboBox2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					UidiagramVisualIDRegistry.getType(ListViewListViewTemplateWidgetCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					UidiagramVisualIDRegistry.getType(DatePicker2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					UidiagramVisualIDRegistry.getType(ListViewListViewTemplateWidgetCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					UidiagramVisualIDRegistry.getType(Switch2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					UidiagramVisualIDRegistry.getType(ListViewListViewTemplateWidgetCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					UidiagramVisualIDRegistry.getType(Table2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			return result.toArray();
		}

		case GroupRow3EditPart.VISUAL_ID: {
			LinkedList<UidiagramAbstractNavigatorItem> result = new LinkedList<UidiagramAbstractNavigatorItem>();
			Node sv = (Node) view;
			Collection<View> connectedViews;
			connectedViews = getChildrenByType(Collections.singleton(sv), UidiagramVisualIDRegistry
					.getType(GroupRowGroupRowListTemplateWidgetCompartment3EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					UidiagramVisualIDRegistry.getType(Group4EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv), UidiagramVisualIDRegistry
					.getType(GroupRowGroupRowListTemplateWidgetCompartment3EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					UidiagramVisualIDRegistry.getType(GroupColumn4EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv), UidiagramVisualIDRegistry
					.getType(GroupRowGroupRowListTemplateWidgetCompartment3EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					UidiagramVisualIDRegistry.getType(GroupRow4EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv), UidiagramVisualIDRegistry
					.getType(GroupRowGroupRowListTemplateWidgetCompartment3EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					UidiagramVisualIDRegistry.getType(Appbar3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv), UidiagramVisualIDRegistry
					.getType(GroupRowGroupRowListTemplateWidgetCompartment3EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					UidiagramVisualIDRegistry.getType(Tabbar3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv), UidiagramVisualIDRegistry
					.getType(GroupRowGroupRowListTemplateWidgetCompartment3EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					UidiagramVisualIDRegistry.getType(Button5EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv), UidiagramVisualIDRegistry
					.getType(GroupRowGroupRowListTemplateWidgetCompartment3EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					UidiagramVisualIDRegistry.getType(Label5EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv), UidiagramVisualIDRegistry
					.getType(GroupRowGroupRowListTemplateWidgetCompartment3EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					UidiagramVisualIDRegistry.getType(Checkbox3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv), UidiagramVisualIDRegistry
					.getType(GroupRowGroupRowListTemplateWidgetCompartment3EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					UidiagramVisualIDRegistry.getType(Input3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv), UidiagramVisualIDRegistry
					.getType(GroupRowGroupRowListTemplateWidgetCompartment3EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					UidiagramVisualIDRegistry.getType(ListView3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv), UidiagramVisualIDRegistry
					.getType(GroupRowGroupRowListTemplateWidgetCompartment3EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					UidiagramVisualIDRegistry.getType(RadioButton3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv), UidiagramVisualIDRegistry
					.getType(GroupRowGroupRowListTemplateWidgetCompartment3EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					UidiagramVisualIDRegistry.getType(ComboBox3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv), UidiagramVisualIDRegistry
					.getType(GroupRowGroupRowListTemplateWidgetCompartment3EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					UidiagramVisualIDRegistry.getType(DatePicker3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv), UidiagramVisualIDRegistry
					.getType(GroupRowGroupRowListTemplateWidgetCompartment3EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					UidiagramVisualIDRegistry.getType(Switch3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv), UidiagramVisualIDRegistry
					.getType(GroupRowGroupRowListTemplateWidgetCompartment3EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					UidiagramVisualIDRegistry.getType(Table3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			return result.toArray();
		}

		case GroupRow4EditPart.VISUAL_ID: {
			LinkedList<UidiagramAbstractNavigatorItem> result = new LinkedList<UidiagramAbstractNavigatorItem>();
			Node sv = (Node) view;
			Collection<View> connectedViews;
			connectedViews = getChildrenByType(Collections.singleton(sv), UidiagramVisualIDRegistry
					.getType(GroupRowGroupRowListTemplateWidgetCompartment4EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					UidiagramVisualIDRegistry.getType(Group4EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv), UidiagramVisualIDRegistry
					.getType(GroupRowGroupRowListTemplateWidgetCompartment4EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					UidiagramVisualIDRegistry.getType(GroupColumn4EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv), UidiagramVisualIDRegistry
					.getType(GroupRowGroupRowListTemplateWidgetCompartment4EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					UidiagramVisualIDRegistry.getType(GroupRow4EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv), UidiagramVisualIDRegistry
					.getType(GroupRowGroupRowListTemplateWidgetCompartment4EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					UidiagramVisualIDRegistry.getType(Appbar3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv), UidiagramVisualIDRegistry
					.getType(GroupRowGroupRowListTemplateWidgetCompartment4EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					UidiagramVisualIDRegistry.getType(Tabbar3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv), UidiagramVisualIDRegistry
					.getType(GroupRowGroupRowListTemplateWidgetCompartment4EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					UidiagramVisualIDRegistry.getType(Button5EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv), UidiagramVisualIDRegistry
					.getType(GroupRowGroupRowListTemplateWidgetCompartment4EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					UidiagramVisualIDRegistry.getType(Label5EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv), UidiagramVisualIDRegistry
					.getType(GroupRowGroupRowListTemplateWidgetCompartment4EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					UidiagramVisualIDRegistry.getType(Checkbox3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv), UidiagramVisualIDRegistry
					.getType(GroupRowGroupRowListTemplateWidgetCompartment4EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					UidiagramVisualIDRegistry.getType(Input3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv), UidiagramVisualIDRegistry
					.getType(GroupRowGroupRowListTemplateWidgetCompartment4EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					UidiagramVisualIDRegistry.getType(ListView3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv), UidiagramVisualIDRegistry
					.getType(GroupRowGroupRowListTemplateWidgetCompartment4EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					UidiagramVisualIDRegistry.getType(RadioButton3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv), UidiagramVisualIDRegistry
					.getType(GroupRowGroupRowListTemplateWidgetCompartment4EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					UidiagramVisualIDRegistry.getType(ComboBox3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv), UidiagramVisualIDRegistry
					.getType(GroupRowGroupRowListTemplateWidgetCompartment4EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					UidiagramVisualIDRegistry.getType(DatePicker3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv), UidiagramVisualIDRegistry
					.getType(GroupRowGroupRowListTemplateWidgetCompartment4EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					UidiagramVisualIDRegistry.getType(Switch3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv), UidiagramVisualIDRegistry
					.getType(GroupRowGroupRowListTemplateWidgetCompartment4EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					UidiagramVisualIDRegistry.getType(Table3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			return result.toArray();
		}

		case Appbar3EditPart.VISUAL_ID: {
			LinkedList<UidiagramAbstractNavigatorItem> result = new LinkedList<UidiagramAbstractNavigatorItem>();
			Node sv = (Node) view;
			Collection<View> connectedViews;
			connectedViews = getChildrenByType(Collections.singleton(sv),
					UidiagramVisualIDRegistry.getType(AppbarAppbarListButtonsCompartment3EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					UidiagramVisualIDRegistry.getType(ButtonEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					UidiagramVisualIDRegistry.getType(AppbarAppbarListLabelsCompartment3EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					UidiagramVisualIDRegistry.getType(LabelEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			return result.toArray();
		}

		case Tabbar3EditPart.VISUAL_ID: {
			LinkedList<UidiagramAbstractNavigatorItem> result = new LinkedList<UidiagramAbstractNavigatorItem>();
			Node sv = (Node) view;
			Collection<View> connectedViews;
			connectedViews = getChildrenByType(Collections.singleton(sv),
					UidiagramVisualIDRegistry.getType(TabbarTabbarListButtonsCompartment3EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					UidiagramVisualIDRegistry.getType(Button2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					UidiagramVisualIDRegistry.getType(TabbarTabbarListLabelsCompartment3EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					UidiagramVisualIDRegistry.getType(Label2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			return result.toArray();
		}

		case ListView3EditPart.VISUAL_ID: {
			LinkedList<UidiagramAbstractNavigatorItem> result = new LinkedList<UidiagramAbstractNavigatorItem>();
			Node sv = (Node) view;
			Collection<View> connectedViews;
			connectedViews = getChildrenByType(Collections.singleton(sv),
					UidiagramVisualIDRegistry.getType(ListViewListViewTemplateWidgetCompartment3EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					UidiagramVisualIDRegistry.getType(Group5EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					UidiagramVisualIDRegistry.getType(ListViewListViewTemplateWidgetCompartment3EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					UidiagramVisualIDRegistry.getType(GroupColumn2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					UidiagramVisualIDRegistry.getType(ListViewListViewTemplateWidgetCompartment3EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					UidiagramVisualIDRegistry.getType(GroupRow3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					UidiagramVisualIDRegistry.getType(ListViewListViewTemplateWidgetCompartment3EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					UidiagramVisualIDRegistry.getType(Appbar4EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					UidiagramVisualIDRegistry.getType(ListViewListViewTemplateWidgetCompartment3EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					UidiagramVisualIDRegistry.getType(Tabbar4EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					UidiagramVisualIDRegistry.getType(ListViewListViewTemplateWidgetCompartment3EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					UidiagramVisualIDRegistry.getType(Button6EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					UidiagramVisualIDRegistry.getType(ListViewListViewTemplateWidgetCompartment3EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					UidiagramVisualIDRegistry.getType(Label6EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					UidiagramVisualIDRegistry.getType(ListViewListViewTemplateWidgetCompartment3EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					UidiagramVisualIDRegistry.getType(Checkbox4EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					UidiagramVisualIDRegistry.getType(ListViewListViewTemplateWidgetCompartment3EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					UidiagramVisualIDRegistry.getType(Input4EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					UidiagramVisualIDRegistry.getType(ListViewListViewTemplateWidgetCompartment3EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					UidiagramVisualIDRegistry.getType(ListView4EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					UidiagramVisualIDRegistry.getType(ListViewListViewTemplateWidgetCompartment3EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					UidiagramVisualIDRegistry.getType(RadioButton2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					UidiagramVisualIDRegistry.getType(ListViewListViewTemplateWidgetCompartment3EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					UidiagramVisualIDRegistry.getType(ComboBox2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					UidiagramVisualIDRegistry.getType(ListViewListViewTemplateWidgetCompartment3EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					UidiagramVisualIDRegistry.getType(DatePicker2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					UidiagramVisualIDRegistry.getType(ListViewListViewTemplateWidgetCompartment3EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					UidiagramVisualIDRegistry.getType(Switch2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					UidiagramVisualIDRegistry.getType(ListViewListViewTemplateWidgetCompartment3EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					UidiagramVisualIDRegistry.getType(Table2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			return result.toArray();
		}

		case Appbar4EditPart.VISUAL_ID: {
			LinkedList<UidiagramAbstractNavigatorItem> result = new LinkedList<UidiagramAbstractNavigatorItem>();
			Node sv = (Node) view;
			Collection<View> connectedViews;
			connectedViews = getChildrenByType(Collections.singleton(sv),
					UidiagramVisualIDRegistry.getType(AppbarAppbarListButtonsCompartment4EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					UidiagramVisualIDRegistry.getType(ButtonEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					UidiagramVisualIDRegistry.getType(AppbarAppbarListLabelsCompartment4EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					UidiagramVisualIDRegistry.getType(LabelEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			return result.toArray();
		}

		case Tabbar4EditPart.VISUAL_ID: {
			LinkedList<UidiagramAbstractNavigatorItem> result = new LinkedList<UidiagramAbstractNavigatorItem>();
			Node sv = (Node) view;
			Collection<View> connectedViews;
			connectedViews = getChildrenByType(Collections.singleton(sv),
					UidiagramVisualIDRegistry.getType(TabbarTabbarListButtonsCompartment4EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					UidiagramVisualIDRegistry.getType(Button2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					UidiagramVisualIDRegistry.getType(TabbarTabbarListLabelsCompartment4EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					UidiagramVisualIDRegistry.getType(Label2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			return result.toArray();
		}

		case ListView4EditPart.VISUAL_ID: {
			LinkedList<UidiagramAbstractNavigatorItem> result = new LinkedList<UidiagramAbstractNavigatorItem>();
			Node sv = (Node) view;
			Collection<View> connectedViews;
			connectedViews = getChildrenByType(Collections.singleton(sv),
					UidiagramVisualIDRegistry.getType(ListViewListViewTemplateWidgetCompartment4EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					UidiagramVisualIDRegistry.getType(Group5EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					UidiagramVisualIDRegistry.getType(ListViewListViewTemplateWidgetCompartment4EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					UidiagramVisualIDRegistry.getType(GroupColumn2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					UidiagramVisualIDRegistry.getType(ListViewListViewTemplateWidgetCompartment4EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					UidiagramVisualIDRegistry.getType(GroupRow3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					UidiagramVisualIDRegistry.getType(ListViewListViewTemplateWidgetCompartment4EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					UidiagramVisualIDRegistry.getType(Appbar4EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					UidiagramVisualIDRegistry.getType(ListViewListViewTemplateWidgetCompartment4EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					UidiagramVisualIDRegistry.getType(Tabbar4EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					UidiagramVisualIDRegistry.getType(ListViewListViewTemplateWidgetCompartment4EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					UidiagramVisualIDRegistry.getType(Button6EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					UidiagramVisualIDRegistry.getType(ListViewListViewTemplateWidgetCompartment4EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					UidiagramVisualIDRegistry.getType(Label6EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					UidiagramVisualIDRegistry.getType(ListViewListViewTemplateWidgetCompartment4EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					UidiagramVisualIDRegistry.getType(Checkbox4EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					UidiagramVisualIDRegistry.getType(ListViewListViewTemplateWidgetCompartment4EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					UidiagramVisualIDRegistry.getType(Input4EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					UidiagramVisualIDRegistry.getType(ListViewListViewTemplateWidgetCompartment4EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					UidiagramVisualIDRegistry.getType(ListView4EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					UidiagramVisualIDRegistry.getType(ListViewListViewTemplateWidgetCompartment4EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					UidiagramVisualIDRegistry.getType(RadioButton2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					UidiagramVisualIDRegistry.getType(ListViewListViewTemplateWidgetCompartment4EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					UidiagramVisualIDRegistry.getType(ComboBox2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					UidiagramVisualIDRegistry.getType(ListViewListViewTemplateWidgetCompartment4EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					UidiagramVisualIDRegistry.getType(DatePicker2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					UidiagramVisualIDRegistry.getType(ListViewListViewTemplateWidgetCompartment4EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					UidiagramVisualIDRegistry.getType(Switch2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					UidiagramVisualIDRegistry.getType(ListViewListViewTemplateWidgetCompartment4EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					UidiagramVisualIDRegistry.getType(Table2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			return result.toArray();
		}

		case Table2EditPart.VISUAL_ID: {
			LinkedList<UidiagramAbstractNavigatorItem> result = new LinkedList<UidiagramAbstractNavigatorItem>();
			Node sv = (Node) view;
			Collection<View> connectedViews;
			connectedViews = getChildrenByType(Collections.singleton(sv),
					UidiagramVisualIDRegistry.getType(TableTableListCoulmnsCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					UidiagramVisualIDRegistry.getType(ColumnEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			return result.toArray();
		}

		case Table3EditPart.VISUAL_ID: {
			LinkedList<UidiagramAbstractNavigatorItem> result = new LinkedList<UidiagramAbstractNavigatorItem>();
			Node sv = (Node) view;
			Collection<View> connectedViews;
			connectedViews = getChildrenByType(Collections.singleton(sv),
					UidiagramVisualIDRegistry.getType(TableTableListCoulmnsCompartment3EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					UidiagramVisualIDRegistry.getType(ColumnEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			return result.toArray();
		}

		case Table4EditPart.VISUAL_ID: {
			LinkedList<UidiagramAbstractNavigatorItem> result = new LinkedList<UidiagramAbstractNavigatorItem>();
			Node sv = (Node) view;
			Collection<View> connectedViews;
			connectedViews = getChildrenByType(Collections.singleton(sv),
					UidiagramVisualIDRegistry.getType(TableTableListCoulmnsCompartment4EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					UidiagramVisualIDRegistry.getType(ColumnEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			return result.toArray();
		}

		case GroupColumn5EditPart.VISUAL_ID: {
			LinkedList<UidiagramAbstractNavigatorItem> result = new LinkedList<UidiagramAbstractNavigatorItem>();
			Node sv = (Node) view;
			Collection<View> connectedViews;
			connectedViews = getChildrenByType(Collections.singleton(sv), UidiagramVisualIDRegistry
					.getType(GroupColumnGroupColumnListTemplateWidgetCompartment5EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					UidiagramVisualIDRegistry.getType(Group3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv), UidiagramVisualIDRegistry
					.getType(GroupColumnGroupColumnListTemplateWidgetCompartment5EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					UidiagramVisualIDRegistry.getType(GroupColumn3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv), UidiagramVisualIDRegistry
					.getType(GroupColumnGroupColumnListTemplateWidgetCompartment5EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					UidiagramVisualIDRegistry.getType(GroupRow2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv), UidiagramVisualIDRegistry
					.getType(GroupColumnGroupColumnListTemplateWidgetCompartment5EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					UidiagramVisualIDRegistry.getType(Appbar2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv), UidiagramVisualIDRegistry
					.getType(GroupColumnGroupColumnListTemplateWidgetCompartment5EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					UidiagramVisualIDRegistry.getType(Tabbar2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv), UidiagramVisualIDRegistry
					.getType(GroupColumnGroupColumnListTemplateWidgetCompartment5EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					UidiagramVisualIDRegistry.getType(Button4EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv), UidiagramVisualIDRegistry
					.getType(GroupColumnGroupColumnListTemplateWidgetCompartment5EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					UidiagramVisualIDRegistry.getType(Label4EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv), UidiagramVisualIDRegistry
					.getType(GroupColumnGroupColumnListTemplateWidgetCompartment5EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					UidiagramVisualIDRegistry.getType(Checkbox2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv), UidiagramVisualIDRegistry
					.getType(GroupColumnGroupColumnListTemplateWidgetCompartment5EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					UidiagramVisualIDRegistry.getType(Input2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv), UidiagramVisualIDRegistry
					.getType(GroupColumnGroupColumnListTemplateWidgetCompartment5EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					UidiagramVisualIDRegistry.getType(ListView2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv), UidiagramVisualIDRegistry
					.getType(GroupColumnGroupColumnListTemplateWidgetCompartment5EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					UidiagramVisualIDRegistry.getType(RadioButton4EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv), UidiagramVisualIDRegistry
					.getType(GroupColumnGroupColumnListTemplateWidgetCompartment5EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					UidiagramVisualIDRegistry.getType(ComboBox4EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv), UidiagramVisualIDRegistry
					.getType(GroupColumnGroupColumnListTemplateWidgetCompartment5EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					UidiagramVisualIDRegistry.getType(DatePicker4EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv), UidiagramVisualIDRegistry
					.getType(GroupColumnGroupColumnListTemplateWidgetCompartment5EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					UidiagramVisualIDRegistry.getType(Switch4EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv), UidiagramVisualIDRegistry
					.getType(GroupColumnGroupColumnListTemplateWidgetCompartment5EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					UidiagramVisualIDRegistry.getType(Table4EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			return result.toArray();
		}

		case GroupRow5EditPart.VISUAL_ID: {
			LinkedList<UidiagramAbstractNavigatorItem> result = new LinkedList<UidiagramAbstractNavigatorItem>();
			Node sv = (Node) view;
			Collection<View> connectedViews;
			connectedViews = getChildrenByType(Collections.singleton(sv), UidiagramVisualIDRegistry
					.getType(GroupRowGroupRowListTemplateWidgetCompartment5EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					UidiagramVisualIDRegistry.getType(Group4EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv), UidiagramVisualIDRegistry
					.getType(GroupRowGroupRowListTemplateWidgetCompartment5EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					UidiagramVisualIDRegistry.getType(GroupColumn4EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv), UidiagramVisualIDRegistry
					.getType(GroupRowGroupRowListTemplateWidgetCompartment5EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					UidiagramVisualIDRegistry.getType(GroupRow4EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv), UidiagramVisualIDRegistry
					.getType(GroupRowGroupRowListTemplateWidgetCompartment5EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					UidiagramVisualIDRegistry.getType(Appbar3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv), UidiagramVisualIDRegistry
					.getType(GroupRowGroupRowListTemplateWidgetCompartment5EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					UidiagramVisualIDRegistry.getType(Tabbar3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv), UidiagramVisualIDRegistry
					.getType(GroupRowGroupRowListTemplateWidgetCompartment5EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					UidiagramVisualIDRegistry.getType(Button5EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv), UidiagramVisualIDRegistry
					.getType(GroupRowGroupRowListTemplateWidgetCompartment5EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					UidiagramVisualIDRegistry.getType(Label5EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv), UidiagramVisualIDRegistry
					.getType(GroupRowGroupRowListTemplateWidgetCompartment5EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					UidiagramVisualIDRegistry.getType(Checkbox3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv), UidiagramVisualIDRegistry
					.getType(GroupRowGroupRowListTemplateWidgetCompartment5EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					UidiagramVisualIDRegistry.getType(Input3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv), UidiagramVisualIDRegistry
					.getType(GroupRowGroupRowListTemplateWidgetCompartment5EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					UidiagramVisualIDRegistry.getType(ListView3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv), UidiagramVisualIDRegistry
					.getType(GroupRowGroupRowListTemplateWidgetCompartment5EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					UidiagramVisualIDRegistry.getType(RadioButton3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv), UidiagramVisualIDRegistry
					.getType(GroupRowGroupRowListTemplateWidgetCompartment5EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					UidiagramVisualIDRegistry.getType(ComboBox3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv), UidiagramVisualIDRegistry
					.getType(GroupRowGroupRowListTemplateWidgetCompartment5EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					UidiagramVisualIDRegistry.getType(DatePicker3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv), UidiagramVisualIDRegistry
					.getType(GroupRowGroupRowListTemplateWidgetCompartment5EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					UidiagramVisualIDRegistry.getType(Switch3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv), UidiagramVisualIDRegistry
					.getType(GroupRowGroupRowListTemplateWidgetCompartment5EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					UidiagramVisualIDRegistry.getType(Table3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			return result.toArray();
		}

		case Appbar5EditPart.VISUAL_ID: {
			LinkedList<UidiagramAbstractNavigatorItem> result = new LinkedList<UidiagramAbstractNavigatorItem>();
			Node sv = (Node) view;
			Collection<View> connectedViews;
			connectedViews = getChildrenByType(Collections.singleton(sv),
					UidiagramVisualIDRegistry.getType(AppbarAppbarListButtonsCompartment5EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					UidiagramVisualIDRegistry.getType(ButtonEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					UidiagramVisualIDRegistry.getType(AppbarAppbarListLabelsCompartment5EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					UidiagramVisualIDRegistry.getType(LabelEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			return result.toArray();
		}

		case Tabbar5EditPart.VISUAL_ID: {
			LinkedList<UidiagramAbstractNavigatorItem> result = new LinkedList<UidiagramAbstractNavigatorItem>();
			Node sv = (Node) view;
			Collection<View> connectedViews;
			connectedViews = getChildrenByType(Collections.singleton(sv),
					UidiagramVisualIDRegistry.getType(TabbarTabbarListButtonsCompartment5EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					UidiagramVisualIDRegistry.getType(Button2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					UidiagramVisualIDRegistry.getType(TabbarTabbarListLabelsCompartment5EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					UidiagramVisualIDRegistry.getType(Label2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			return result.toArray();
		}

		case ListView5EditPart.VISUAL_ID: {
			LinkedList<UidiagramAbstractNavigatorItem> result = new LinkedList<UidiagramAbstractNavigatorItem>();
			Node sv = (Node) view;
			Collection<View> connectedViews;
			connectedViews = getChildrenByType(Collections.singleton(sv),
					UidiagramVisualIDRegistry.getType(ListViewListViewTemplateWidgetCompartment5EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					UidiagramVisualIDRegistry.getType(Group5EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					UidiagramVisualIDRegistry.getType(ListViewListViewTemplateWidgetCompartment5EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					UidiagramVisualIDRegistry.getType(GroupColumn2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					UidiagramVisualIDRegistry.getType(ListViewListViewTemplateWidgetCompartment5EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					UidiagramVisualIDRegistry.getType(GroupRow3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					UidiagramVisualIDRegistry.getType(ListViewListViewTemplateWidgetCompartment5EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					UidiagramVisualIDRegistry.getType(Appbar4EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					UidiagramVisualIDRegistry.getType(ListViewListViewTemplateWidgetCompartment5EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					UidiagramVisualIDRegistry.getType(Tabbar4EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					UidiagramVisualIDRegistry.getType(ListViewListViewTemplateWidgetCompartment5EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					UidiagramVisualIDRegistry.getType(Button6EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					UidiagramVisualIDRegistry.getType(ListViewListViewTemplateWidgetCompartment5EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					UidiagramVisualIDRegistry.getType(Label6EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					UidiagramVisualIDRegistry.getType(ListViewListViewTemplateWidgetCompartment5EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					UidiagramVisualIDRegistry.getType(Checkbox4EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					UidiagramVisualIDRegistry.getType(ListViewListViewTemplateWidgetCompartment5EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					UidiagramVisualIDRegistry.getType(Input4EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					UidiagramVisualIDRegistry.getType(ListViewListViewTemplateWidgetCompartment5EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					UidiagramVisualIDRegistry.getType(ListView4EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					UidiagramVisualIDRegistry.getType(ListViewListViewTemplateWidgetCompartment5EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					UidiagramVisualIDRegistry.getType(RadioButton2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					UidiagramVisualIDRegistry.getType(ListViewListViewTemplateWidgetCompartment5EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					UidiagramVisualIDRegistry.getType(ComboBox2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					UidiagramVisualIDRegistry.getType(ListViewListViewTemplateWidgetCompartment5EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					UidiagramVisualIDRegistry.getType(DatePicker2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					UidiagramVisualIDRegistry.getType(ListViewListViewTemplateWidgetCompartment5EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					UidiagramVisualIDRegistry.getType(Switch2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					UidiagramVisualIDRegistry.getType(ListViewListViewTemplateWidgetCompartment5EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					UidiagramVisualIDRegistry.getType(Table2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			return result.toArray();
		}

		case Table5EditPart.VISUAL_ID: {
			LinkedList<UidiagramAbstractNavigatorItem> result = new LinkedList<UidiagramAbstractNavigatorItem>();
			Node sv = (Node) view;
			Collection<View> connectedViews;
			connectedViews = getChildrenByType(Collections.singleton(sv),
					UidiagramVisualIDRegistry.getType(TableTableListCoulmnsCompartment5EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					UidiagramVisualIDRegistry.getType(ColumnEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
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
		return UIDiagramEditPart.MODEL_ID.equals(UidiagramVisualIDRegistry.getModelID(view));
	}

	/**
	 * @generated
	 */
	private Collection<UidiagramNavigatorItem> createNavigatorItems(Collection<View> views, Object parent,
			boolean isLeafs) {
		ArrayList<UidiagramNavigatorItem> result = new ArrayList<UidiagramNavigatorItem>(views.size());
		for (View nextView : views) {
			result.add(new UidiagramNavigatorItem(nextView, parent, isLeafs));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private Collection<UidiagramNavigatorItem> getForeignShortcuts(Diagram diagram, Object parent) {
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
		if (element instanceof UidiagramAbstractNavigatorItem) {
			UidiagramAbstractNavigatorItem abstractNavigatorItem = (UidiagramAbstractNavigatorItem) element;
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
