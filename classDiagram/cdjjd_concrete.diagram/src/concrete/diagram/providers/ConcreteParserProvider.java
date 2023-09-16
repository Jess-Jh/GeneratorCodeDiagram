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
import concrete.diagram.edit.parts.AgregationJJDMultiplicityAEditPart;
import concrete.diagram.edit.parts.AgregationJJDMultiplicityBEditPart;
import concrete.diagram.edit.parts.AgregationJJDRolAEditPart;
import concrete.diagram.edit.parts.AgregationJJDRolBEditPart;
import concrete.diagram.edit.parts.AssociationJJDMultiplicityAEditPart;
import concrete.diagram.edit.parts.AssociationJJDMultiplicityBEditPart;
import concrete.diagram.edit.parts.AssociationJJDRolAEditPart;
import concrete.diagram.edit.parts.AssociationJJDRolBEditPart;
import concrete.diagram.edit.parts.AttributeJJDName2EditPart;
import concrete.diagram.edit.parts.AttributeJJDNameEditPart;
import concrete.diagram.edit.parts.AttributeJJDNameType2EditPart;
import concrete.diagram.edit.parts.AttributeJJDNameTypeEditPart;
import concrete.diagram.edit.parts.AttributeJJDType2EditPart;
import concrete.diagram.edit.parts.AttributeJJDTypeEditPart;
import concrete.diagram.edit.parts.ClassJJDName2EditPart;
import concrete.diagram.edit.parts.ClassJJDNameEditPart;
import concrete.diagram.edit.parts.ContainmentJJDMultiplicityAEditPart;
import concrete.diagram.edit.parts.ContainmentJJDMultiplicityBEditPart;
import concrete.diagram.edit.parts.ContainmentJJDRolA2EditPart;
import concrete.diagram.edit.parts.ContainmentJJDRolAEditPart;
import concrete.diagram.edit.parts.ContainmentJJDRolARolBEditPart;
import concrete.diagram.edit.parts.ContainmentJJDRolB2EditPart;
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
	private IParser agregationJJDRolA_6006Parser;

	/**
	* @generated
	*/
	private IParser getAgregationJJDRolA_6006Parser() {
		if (agregationJJDRolA_6006Parser == null) {
			EAttribute[] features = new EAttribute[] { ConcretePackage.eINSTANCE.getRelationJJD_RolA() };
			MessageFormatParser parser = new MessageFormatParser(features);
			agregationJJDRolA_6006Parser = parser;
		}
		return agregationJJDRolA_6006Parser;
	}

	/**
	* @generated
	*/
	private IParser agregationJJDRolB_6007Parser;

	/**
	* @generated
	*/
	private IParser getAgregationJJDRolB_6007Parser() {
		if (agregationJJDRolB_6007Parser == null) {
			EAttribute[] features = new EAttribute[] { ConcretePackage.eINSTANCE.getRelationJJD_RolB() };
			MessageFormatParser parser = new MessageFormatParser(features);
			agregationJJDRolB_6007Parser = parser;
		}
		return agregationJJDRolB_6007Parser;
	}

	/**
	* @generated
	*/
	private IParser agregationJJDMultiplicityA_6008Parser;

	/**
	* @generated
	*/
	private IParser getAgregationJJDMultiplicityA_6008Parser() {
		if (agregationJJDMultiplicityA_6008Parser == null) {
			EAttribute[] features = new EAttribute[] { ConcretePackage.eINSTANCE.getRelationJJD_MultiplicityA() };
			MessageFormatParser parser = new MessageFormatParser(features);
			agregationJJDMultiplicityA_6008Parser = parser;
		}
		return agregationJJDMultiplicityA_6008Parser;
	}

	/**
	* @generated
	*/
	private IParser agregationJJDMultiplicityB_6009Parser;

	/**
	* @generated
	*/
	private IParser getAgregationJJDMultiplicityB_6009Parser() {
		if (agregationJJDMultiplicityB_6009Parser == null) {
			EAttribute[] features = new EAttribute[] { ConcretePackage.eINSTANCE.getRelationJJD_MultiplicityB() };
			MessageFormatParser parser = new MessageFormatParser(features);
			agregationJJDMultiplicityB_6009Parser = parser;
		}
		return agregationJJDMultiplicityB_6009Parser;
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
	private IParser containmentJJDRolA_6002Parser;

	/**
	* @generated
	*/
	private IParser getContainmentJJDRolA_6002Parser() {
		if (containmentJJDRolA_6002Parser == null) {
			EAttribute[] features = new EAttribute[] { ConcretePackage.eINSTANCE.getRelationJJD_RolA() };
			MessageFormatParser parser = new MessageFormatParser(features);
			containmentJJDRolA_6002Parser = parser;
		}
		return containmentJJDRolA_6002Parser;
	}

	/**
	* @generated
	*/
	private IParser containmentJJDRolB_6003Parser;

	/**
	* @generated
	*/
	private IParser getContainmentJJDRolB_6003Parser() {
		if (containmentJJDRolB_6003Parser == null) {
			EAttribute[] features = new EAttribute[] { ConcretePackage.eINSTANCE.getRelationJJD_RolB() };
			MessageFormatParser parser = new MessageFormatParser(features);
			containmentJJDRolB_6003Parser = parser;
		}
		return containmentJJDRolB_6003Parser;
	}

	/**
	* @generated
	*/
	private IParser containmentJJDMultiplicityA_6004Parser;

	/**
	* @generated
	*/
	private IParser getContainmentJJDMultiplicityA_6004Parser() {
		if (containmentJJDMultiplicityA_6004Parser == null) {
			EAttribute[] features = new EAttribute[] { ConcretePackage.eINSTANCE.getRelationJJD_MultiplicityA() };
			MessageFormatParser parser = new MessageFormatParser(features);
			containmentJJDMultiplicityA_6004Parser = parser;
		}
		return containmentJJDMultiplicityA_6004Parser;
	}

	/**
	* @generated
	*/
	private IParser containmentJJDMultiplicityB_6014Parser;

	/**
	* @generated
	*/
	private IParser getContainmentJJDMultiplicityB_6014Parser() {
		if (containmentJJDMultiplicityB_6014Parser == null) {
			EAttribute[] features = new EAttribute[] { ConcretePackage.eINSTANCE.getRelationJJD_MultiplicityB() };
			MessageFormatParser parser = new MessageFormatParser(features);
			containmentJJDMultiplicityB_6014Parser = parser;
		}
		return containmentJJDMultiplicityB_6014Parser;
	}

	/**
	* @generated
	*/
	private IParser associationJJDRolA_6010Parser;

	/**
	* @generated
	*/
	private IParser getAssociationJJDRolA_6010Parser() {
		if (associationJJDRolA_6010Parser == null) {
			EAttribute[] features = new EAttribute[] { ConcretePackage.eINSTANCE.getRelationJJD_RolA() };
			MessageFormatParser parser = new MessageFormatParser(features);
			associationJJDRolA_6010Parser = parser;
		}
		return associationJJDRolA_6010Parser;
	}

	/**
	* @generated
	*/
	private IParser associationJJDRolB_6011Parser;

	/**
	* @generated
	*/
	private IParser getAssociationJJDRolB_6011Parser() {
		if (associationJJDRolB_6011Parser == null) {
			EAttribute[] features = new EAttribute[] { ConcretePackage.eINSTANCE.getRelationJJD_RolB() };
			MessageFormatParser parser = new MessageFormatParser(features);
			associationJJDRolB_6011Parser = parser;
		}
		return associationJJDRolB_6011Parser;
	}

	/**
	* @generated
	*/
	private IParser associationJJDMultiplicityA_6012Parser;

	/**
	* @generated
	*/
	private IParser getAssociationJJDMultiplicityA_6012Parser() {
		if (associationJJDMultiplicityA_6012Parser == null) {
			EAttribute[] features = new EAttribute[] { ConcretePackage.eINSTANCE.getRelationJJD_MultiplicityA() };
			MessageFormatParser parser = new MessageFormatParser(features);
			associationJJDMultiplicityA_6012Parser = parser;
		}
		return associationJJDMultiplicityA_6012Parser;
	}

	/**
	* @generated
	*/
	private IParser associationJJDMultiplicityB_6013Parser;

	/**
	* @generated
	*/
	private IParser getAssociationJJDMultiplicityB_6013Parser() {
		if (associationJJDMultiplicityB_6013Parser == null) {
			EAttribute[] features = new EAttribute[] { ConcretePackage.eINSTANCE.getRelationJJD_MultiplicityB() };
			MessageFormatParser parser = new MessageFormatParser(features);
			associationJJDMultiplicityB_6013Parser = parser;
		}
		return associationJJDMultiplicityB_6013Parser;
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
		case AgregationJJDRolAEditPart.VISUAL_ID:
			return getAgregationJJDRolA_6006Parser();
		case AgregationJJDRolBEditPart.VISUAL_ID:
			return getAgregationJJDRolB_6007Parser();
		case AgregationJJDMultiplicityAEditPart.VISUAL_ID:
			return getAgregationJJDMultiplicityA_6008Parser();
		case AgregationJJDMultiplicityBEditPart.VISUAL_ID:
			return getAgregationJJDMultiplicityB_6009Parser();
		case ContainmentJJDRolBEditPart.VISUAL_ID:
			return getContainmentJJDRolB_6001Parser();
		case ContainmentJJDRolAEditPart.VISUAL_ID:
			return getContainmentJJDRolA_6002Parser();
		case ContainmentJJDRolB2EditPart.VISUAL_ID:
			return getContainmentJJDRolB_6003Parser();
		case ContainmentJJDMultiplicityAEditPart.VISUAL_ID:
			return getContainmentJJDMultiplicityA_6004Parser();
		case ContainmentJJDMultiplicityBEditPart.VISUAL_ID:
			return getContainmentJJDMultiplicityB_6014Parser();
		case AssociationJJDRolAEditPart.VISUAL_ID:
			return getAssociationJJDRolA_6010Parser();
		case AssociationJJDRolBEditPart.VISUAL_ID:
			return getAssociationJJDRolB_6011Parser();
		case AssociationJJDMultiplicityAEditPart.VISUAL_ID:
			return getAssociationJJDMultiplicityA_6012Parser();
		case AssociationJJDMultiplicityBEditPart.VISUAL_ID:
			return getAssociationJJDMultiplicityB_6013Parser();
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
