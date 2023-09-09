/*
 * 
 */
package concrete.diagram.providers;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.common.core.service.AbstractProvider;
import org.eclipse.gmf.runtime.common.core.service.IOperation;
import org.eclipse.gmf.runtime.common.ui.services.parser.GetParserOperation;
import org.eclipse.gmf.runtime.common.ui.services.parser.IParser;
import org.eclipse.gmf.runtime.common.ui.services.parser.IParserProvider;
import org.eclipse.gmf.runtime.common.ui.services.parser.ParserService;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.runtime.emf.ui.services.parser.ParserHintAdapter;
import org.eclipse.gmf.runtime.notation.View;

import concrete.ConcretePackage;
import concrete.diagram.edit.parts.AttributeJJDName2EditPart;
import concrete.diagram.edit.parts.AttributeJJDNameEditPart;
import concrete.diagram.edit.parts.AttributeJJDNameType2EditPart;
import concrete.diagram.edit.parts.AttributeJJDNameTypeEditPart;
import concrete.diagram.edit.parts.AttributeJJDType2EditPart;
import concrete.diagram.edit.parts.AttributeJJDTypeEditPart;
import concrete.diagram.edit.parts.ClassJJDName2EditPart;
import concrete.diagram.edit.parts.ClassJJDNameEditPart;
import concrete.diagram.edit.parts.ContainmentJJDRolARolBEditPart;
import concrete.diagram.edit.parts.ContainmentJJDRolBEditPart;
import concrete.diagram.edit.parts.MethodJJDNameEditPart;
import concrete.diagram.edit.parts.PackageJJDName2EditPart;
import concrete.diagram.edit.parts.PackageJJDNameEditPart;
import concrete.diagram.parsers.MessageFormatParser;
import concrete.diagram.part.ConcreteVisualIDRegistry;

/**
 * @generated
 */
public class ConcreteParserProvider extends AbstractProvider implements IParserProvider {

	/**
	* @generated
	*/
	private IParser packageJJDName_5006Parser;

	/**
	* @generated
	*/
	private IParser getPackageJJDName_5006Parser() {
		if (packageJJDName_5006Parser == null) {
			EAttribute[] features = new EAttribute[] { ConcretePackage.eINSTANCE.getPackageJJD_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			packageJJDName_5006Parser = parser;
		}
		return packageJJDName_5006Parser;
	}

	/**
	* @generated
	*/
	private IParser classJJDName_5007Parser;

	/**
	* @generated
	*/
	private IParser getClassJJDName_5007Parser() {
		if (classJJDName_5007Parser == null) {
			EAttribute[] features = new EAttribute[] { ConcretePackage.eINSTANCE.getClassJJD_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			classJJDName_5007Parser = parser;
		}
		return classJJDName_5007Parser;
	}

	/**
	* @generated
	*/
	private IParser packageJJDName_5005Parser;

	/**
	* @generated
	*/
	private IParser getPackageJJDName_5005Parser() {
		if (packageJJDName_5005Parser == null) {
			EAttribute[] features = new EAttribute[] { ConcretePackage.eINSTANCE.getPackageJJD_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			packageJJDName_5005Parser = parser;
		}
		return packageJJDName_5005Parser;
	}

	/**
	* @generated
	*/
	private IParser classJJDName_5004Parser;

	/**
	* @generated
	*/
	private IParser getClassJJDName_5004Parser() {
		if (classJJDName_5004Parser == null) {
			EAttribute[] features = new EAttribute[] { ConcretePackage.eINSTANCE.getClassJJD_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			classJJDName_5004Parser = parser;
		}
		return classJJDName_5004Parser;
	}

	/**
	* @generated
	*/
	private IParser attributeJJDNameType_5001Parser;

	/**
	* @generated
	*/
	private IParser getAttributeJJDNameType_5001Parser() {
		if (attributeJJDNameType_5001Parser == null) {
			EAttribute[] features = new EAttribute[] { ConcretePackage.eINSTANCE.getAttributeJJD_Name(),
					ConcretePackage.eINSTANCE.getAttributeJJD_Type() };
			MessageFormatParser parser = new MessageFormatParser(features);
			parser.setViewPattern("{0} : {1}"); //$NON-NLS-1$
			parser.setEditorPattern("{0} : {1}"); //$NON-NLS-1$
			parser.setEditPattern("{0} : {1}"); //$NON-NLS-1$
			attributeJJDNameType_5001Parser = parser;
		}
		return attributeJJDNameType_5001Parser;
	}

	/**
	* @generated
	*/
	private IParser methodJJDName_5003Parser;

	/**
	* @generated
	*/
	private IParser getMethodJJDName_5003Parser() {
		if (methodJJDName_5003Parser == null) {
			EAttribute[] features = new EAttribute[] { ConcretePackage.eINSTANCE.getMethodJJD_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			methodJJDName_5003Parser = parser;
		}
		return methodJJDName_5003Parser;
	}

	/**
	* @generated
	*/
	private IParser attributeJJDNameType_5002Parser;

	/**
	* @generated
	*/
	private IParser getAttributeJJDNameType_5002Parser() {
		if (attributeJJDNameType_5002Parser == null) {
			EAttribute[] features = new EAttribute[] { ConcretePackage.eINSTANCE.getAttributeJJD_Name(),
					ConcretePackage.eINSTANCE.getAttributeJJD_Type() };
			MessageFormatParser parser = new MessageFormatParser(features);
			parser.setViewPattern("{0} : {1}"); //$NON-NLS-1$
			parser.setEditorPattern("{0} : {1}"); //$NON-NLS-1$
			parser.setEditPattern("{0} : {1}"); //$NON-NLS-1$
			attributeJJDNameType_5002Parser = parser;
		}
		return attributeJJDNameType_5002Parser;
	}

	/**
	* @generated
	*/
	private IParser containmentJJDRolB_6001Parser;

	/**
	* @generated
	*/
	private IParser getContainmentJJDRolB_6001Parser() {
		if (containmentJJDRolB_6001Parser == null) {
			EAttribute[] features = new EAttribute[] { ConcretePackage.eINSTANCE.getRelationJJD_RolB() };
			MessageFormatParser parser = new MessageFormatParser(features);
			containmentJJDRolB_6001Parser = parser;
		}
		return containmentJJDRolB_6001Parser;
	}

	/**
	* @generated
	*/
	protected IParser getParser(int visualID) {
		switch (visualID) {
		case PackageJJDNameEditPart.VISUAL_ID:
			return getPackageJJDName_5006Parser();
		case ClassJJDNameEditPart.VISUAL_ID:
			return getClassJJDName_5007Parser();
		case PackageJJDName2EditPart.VISUAL_ID:
			return getPackageJJDName_5005Parser();
		case ClassJJDName2EditPart.VISUAL_ID:
			return getClassJJDName_5004Parser();
		case AttributeJJDNameTypeEditPart.VISUAL_ID:
			return getAttributeJJDNameType_5001Parser();
		case MethodJJDNameEditPart.VISUAL_ID:
			return getMethodJJDName_5003Parser();
		case AttributeJJDNameType2EditPart.VISUAL_ID:
			return getAttributeJJDNameType_5002Parser();
		case ContainmentJJDRolBEditPart.VISUAL_ID:
			return getContainmentJJDRolB_6001Parser();
		}
		return null;
	}

	/**
	* Utility method that consults ParserService
	* @generated
	*/
	public static IParser getParser(IElementType type, EObject object, String parserHint) {
		return ParserService.getInstance().getParser(new HintAdapter(type, object, parserHint));
	}

	/**
	* @generated
	*/
	public IParser getParser(IAdaptable hint) {
		String vid = (String) hint.getAdapter(String.class);
		if (vid != null) {
			return getParser(ConcreteVisualIDRegistry.getVisualID(vid));
		}
		View view = (View) hint.getAdapter(View.class);
		if (view != null) {
			return getParser(ConcreteVisualIDRegistry.getVisualID(view));
		}
		return null;
	}

	/**
	* @generated
	*/
	public boolean provides(IOperation operation) {
		if (operation instanceof GetParserOperation) {
			IAdaptable hint = ((GetParserOperation) operation).getHint();
			if (ConcreteElementTypes.getElement(hint) == null) {
				return false;
			}
			return getParser(hint) != null;
		}
		return false;
	}

	/**
	* @generated
	*/
	private static class HintAdapter extends ParserHintAdapter {

		/**
		* @generated
		*/
		private final IElementType elementType;

		/**
		* @generated
		*/
		public HintAdapter(IElementType type, EObject object, String parserHint) {
			super(object, parserHint);
			assert type != null;
			elementType = type;
		}

		/**
		* @generated
		*/
		public Object getAdapter(Class adapter) {
			if (IElementType.class.equals(adapter)) {
				return elementType;
			}
			return super.getAdapter(adapter);
		}
	}

}