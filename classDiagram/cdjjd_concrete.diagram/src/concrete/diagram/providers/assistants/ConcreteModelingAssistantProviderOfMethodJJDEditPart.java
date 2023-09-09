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
public class ConcreteModelingAssistantProviderOfMethodJJDEditPart extends ConcreteModelingAssistantProvider {

	/**
	* @generated
	*/
	@Override

	public List<IElementType> getTypesForPopupBar(IAdaptable host) {
		List<IElementType> types = new ArrayList<IElementType>(1);
		types.add(ConcreteElementTypes.AttributeJJD_3005);
		return types;
	}

}
