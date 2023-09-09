/*
* 
*/
package concrete.diagram.navigator;

import org.eclipse.jface.viewers.ViewerSorter;

import concrete.diagram.part.ConcreteVisualIDRegistry;

/**
 * @generated
 */
public class ConcreteNavigatorSorter extends ViewerSorter {

	/**
	* @generated
	*/
	private static final int GROUP_CATEGORY = 7011;

	/**
	* @generated
	*/
	private static final int SHORTCUTS_CATEGORY = 7010;

	/**
	* @generated
	*/
	public int category(Object element) {
		if (element instanceof ConcreteNavigatorItem) {
			ConcreteNavigatorItem item = (ConcreteNavigatorItem) element;
			if (item.getView().getEAnnotation("Shortcut") != null) { //$NON-NLS-1$
				return SHORTCUTS_CATEGORY;
			}
			return ConcreteVisualIDRegistry.getVisualID(item.getView());
		}
		return GROUP_CATEGORY;
	}

}
