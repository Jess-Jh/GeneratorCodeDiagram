/*
 * 
 */
package concrete.diagram.providers;

import org.eclipse.gmf.tooling.runtime.providers.DefaultEditPartProvider;

import concrete.diagram.edit.parts.ClassDiagramJJDEditPart;
import concrete.diagram.edit.parts.ConcreteEditPartFactory;
import concrete.diagram.part.ConcreteVisualIDRegistry;

/**
 * @generated
 */
public class ConcreteEditPartProvider extends DefaultEditPartProvider {

	/**
	* @generated
	*/
	public ConcreteEditPartProvider() {
		super(new ConcreteEditPartFactory(), ConcreteVisualIDRegistry.TYPED_INSTANCE, ClassDiagramJJDEditPart.MODEL_ID);
	}

}
