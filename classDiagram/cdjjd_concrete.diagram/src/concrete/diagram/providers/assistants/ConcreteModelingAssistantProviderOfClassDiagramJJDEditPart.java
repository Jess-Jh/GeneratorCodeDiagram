/*
 * 
 */
package concrete.diagram.providers.assistants;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;

import concrete.diagram.providers.ConcreteElementTypes;
import concrete.diagram.providers.ConcreteModelingAssistantProvider;

/**
 * @generated
 */
public class ConcreteModelingAssistantProviderOfClassDiagramJJDEditPart extends ConcreteModelingAssistantProvider {

	/**
	* @generated
	*/
	@Override

	public List<IElementType> getTypesForPopupBar(IAdaptable host) {
		List<IElementType> types = new ArrayList<IElementType>(2);
		types.add(ConcreteElementTypes.PackageJJD_2001);
		types.add(ConcreteElementTypes.ClassJJD_2002);
		return types;
	}

}
