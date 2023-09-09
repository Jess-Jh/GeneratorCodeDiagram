/*
 * 
 */
package concrete.diagram.providers;

import concrete.diagram.part.ConcreteDiagramEditorPlugin;

/**
 * @generated
 */
public class ElementInitializers {

	protected ElementInitializers() {
		// use #getInstance to access cached instance
	}

	/**
	* @generated
	*/
	public static ElementInitializers getInstance() {
		ElementInitializers cached = ConcreteDiagramEditorPlugin.getInstance().getElementInitializers();
		if (cached == null) {
			ConcreteDiagramEditorPlugin.getInstance().setElementInitializers(cached = new ElementInitializers());
		}
		return cached;
	}
}
