/*
 * 
 */
package uidiagram.diagram.providers;

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

import uidiagram.UidiagramPackage;
import uidiagram.diagram.edit.parts.AppbarName2EditPart;
import uidiagram.diagram.edit.parts.AppbarName3EditPart;
import uidiagram.diagram.edit.parts.AppbarName4EditPart;
import uidiagram.diagram.edit.parts.AppbarName5EditPart;
import uidiagram.diagram.edit.parts.AppbarNameEditPart;
import uidiagram.diagram.edit.parts.ButtonName2EditPart;
import uidiagram.diagram.edit.parts.ButtonName3EditPart;
import uidiagram.diagram.edit.parts.ButtonName4EditPart;
import uidiagram.diagram.edit.parts.ButtonName5EditPart;
import uidiagram.diagram.edit.parts.ButtonName6EditPart;
import uidiagram.diagram.edit.parts.ButtonName7EditPart;
import uidiagram.diagram.edit.parts.ButtonNameEditPart;
import uidiagram.diagram.edit.parts.CheckboxName2EditPart;
import uidiagram.diagram.edit.parts.CheckboxName3EditPart;
import uidiagram.diagram.edit.parts.CheckboxName4EditPart;
import uidiagram.diagram.edit.parts.CheckboxName5EditPart;
import uidiagram.diagram.edit.parts.CheckboxNameEditPart;
import uidiagram.diagram.edit.parts.ColumnNameEditPart;
import uidiagram.diagram.edit.parts.ComboBoxName2EditPart;
import uidiagram.diagram.edit.parts.ComboBoxName3EditPart;
import uidiagram.diagram.edit.parts.ComboBoxName4EditPart;
import uidiagram.diagram.edit.parts.ComboBoxName5EditPart;
import uidiagram.diagram.edit.parts.ComboBoxNameEditPart;
import uidiagram.diagram.edit.parts.DatePickerName2EditPart;
import uidiagram.diagram.edit.parts.DatePickerName3EditPart;
import uidiagram.diagram.edit.parts.DatePickerName4EditPart;
import uidiagram.diagram.edit.parts.DatePickerName5EditPart;
import uidiagram.diagram.edit.parts.DatePickerNameEditPart;
import uidiagram.diagram.edit.parts.GroupColumnName2EditPart;
import uidiagram.diagram.edit.parts.GroupColumnName3EditPart;
import uidiagram.diagram.edit.parts.GroupColumnName4EditPart;
import uidiagram.diagram.edit.parts.GroupColumnName5EditPart;
import uidiagram.diagram.edit.parts.GroupColumnNameEditPart;
import uidiagram.diagram.edit.parts.GroupName2EditPart;
import uidiagram.diagram.edit.parts.GroupName3EditPart;
import uidiagram.diagram.edit.parts.GroupName4EditPart;
import uidiagram.diagram.edit.parts.GroupName5EditPart;
import uidiagram.diagram.edit.parts.GroupNameEditPart;
import uidiagram.diagram.edit.parts.GroupRowName2EditPart;
import uidiagram.diagram.edit.parts.GroupRowName3EditPart;
import uidiagram.diagram.edit.parts.GroupRowName4EditPart;
import uidiagram.diagram.edit.parts.GroupRowName5EditPart;
import uidiagram.diagram.edit.parts.GroupRowNameEditPart;
import uidiagram.diagram.edit.parts.InputName2EditPart;
import uidiagram.diagram.edit.parts.InputName3EditPart;
import uidiagram.diagram.edit.parts.InputName4EditPart;
import uidiagram.diagram.edit.parts.InputName5EditPart;
import uidiagram.diagram.edit.parts.InputNameEditPart;
import uidiagram.diagram.edit.parts.LabelName2EditPart;
import uidiagram.diagram.edit.parts.LabelName3EditPart;
import uidiagram.diagram.edit.parts.LabelName4EditPart;
import uidiagram.diagram.edit.parts.LabelName5EditPart;
import uidiagram.diagram.edit.parts.LabelName6EditPart;
import uidiagram.diagram.edit.parts.LabelName7EditPart;
import uidiagram.diagram.edit.parts.LabelNameEditPart;
import uidiagram.diagram.edit.parts.ListViewName2EditPart;
import uidiagram.diagram.edit.parts.ListViewName3EditPart;
import uidiagram.diagram.edit.parts.ListViewName4EditPart;
import uidiagram.diagram.edit.parts.ListViewName5EditPart;
import uidiagram.diagram.edit.parts.ListViewNameEditPart;
import uidiagram.diagram.edit.parts.RadioButtonName2EditPart;
import uidiagram.diagram.edit.parts.RadioButtonName3EditPart;
import uidiagram.diagram.edit.parts.RadioButtonName4EditPart;
import uidiagram.diagram.edit.parts.RadioButtonName5EditPart;
import uidiagram.diagram.edit.parts.RadioButtonNameEditPart;
import uidiagram.diagram.edit.parts.SwitchName2EditPart;
import uidiagram.diagram.edit.parts.SwitchName3EditPart;
import uidiagram.diagram.edit.parts.SwitchName4EditPart;
import uidiagram.diagram.edit.parts.SwitchName5EditPart;
import uidiagram.diagram.edit.parts.SwitchNameEditPart;
import uidiagram.diagram.edit.parts.TabbarName2EditPart;
import uidiagram.diagram.edit.parts.TabbarName3EditPart;
import uidiagram.diagram.edit.parts.TabbarName4EditPart;
import uidiagram.diagram.edit.parts.TabbarName5EditPart;
import uidiagram.diagram.edit.parts.TabbarNameEditPart;
import uidiagram.diagram.edit.parts.TableName2EditPart;
import uidiagram.diagram.edit.parts.TableName3EditPart;
import uidiagram.diagram.edit.parts.TableName4EditPart;
import uidiagram.diagram.edit.parts.TableName5EditPart;
import uidiagram.diagram.edit.parts.TableNameEditPart;
import uidiagram.diagram.edit.parts.UserInterfaceNameEditPart;
import uidiagram.diagram.parsers.MessageFormatParser;
import uidiagram.diagram.part.UidiagramVisualIDRegistry;

/**
 * @generated
 */
public class UidiagramParserProvider extends AbstractProvider implements IParserProvider {

	/**
	* @generated
	*/
	private IParser userInterfaceName_5081Parser;

	/**
	* @generated
	*/
	private IParser getUserInterfaceName_5081Parser() {
		if (userInterfaceName_5081Parser == null) {
			EAttribute[] features = new EAttribute[] { UidiagramPackage.eINSTANCE.getUserInterface_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			userInterfaceName_5081Parser = parser;
		}
		return userInterfaceName_5081Parser;
	}

	/**
	* @generated
	*/
	private IParser groupName_5066Parser;

	/**
	* @generated
	*/
	private IParser getGroupName_5066Parser() {
		if (groupName_5066Parser == null) {
			EAttribute[] features = new EAttribute[] { UidiagramPackage.eINSTANCE.getTemplateWidget_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			groupName_5066Parser = parser;
		}
		return groupName_5066Parser;
	}

	/**
	* @generated
	*/
	private IParser groupName_5065Parser;

	/**
	* @generated
	*/
	private IParser getGroupName_5065Parser() {
		if (groupName_5065Parser == null) {
			EAttribute[] features = new EAttribute[] { UidiagramPackage.eINSTANCE.getTemplateWidget_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			groupName_5065Parser = parser;
		}
		return groupName_5065Parser;
	}

	/**
	* @generated
	*/
	private IParser groupColumnName_5064Parser;

	/**
	* @generated
	*/
	private IParser getGroupColumnName_5064Parser() {
		if (groupColumnName_5064Parser == null) {
			EAttribute[] features = new EAttribute[] { UidiagramPackage.eINSTANCE.getTemplateWidget_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			groupColumnName_5064Parser = parser;
		}
		return groupColumnName_5064Parser;
	}

	/**
	* @generated
	*/
	private IParser groupName_5063Parser;

	/**
	* @generated
	*/
	private IParser getGroupName_5063Parser() {
		if (groupName_5063Parser == null) {
			EAttribute[] features = new EAttribute[] { UidiagramPackage.eINSTANCE.getTemplateWidget_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			groupName_5063Parser = parser;
		}
		return groupName_5063Parser;
	}

	/**
	* @generated
	*/
	private IParser groupRowName_5062Parser;

	/**
	* @generated
	*/
	private IParser getGroupRowName_5062Parser() {
		if (groupRowName_5062Parser == null) {
			EAttribute[] features = new EAttribute[] { UidiagramPackage.eINSTANCE.getTemplateWidget_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			groupRowName_5062Parser = parser;
		}
		return groupRowName_5062Parser;
	}

	/**
	* @generated
	*/
	private IParser groupName_5061Parser;

	/**
	* @generated
	*/
	private IParser getGroupName_5061Parser() {
		if (groupName_5061Parser == null) {
			EAttribute[] features = new EAttribute[] { UidiagramPackage.eINSTANCE.getTemplateWidget_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			groupName_5061Parser = parser;
		}
		return groupName_5061Parser;
	}

	/**
	* @generated
	*/
	private IParser appbarName_5003Parser;

	/**
	* @generated
	*/
	private IParser getAppbarName_5003Parser() {
		if (appbarName_5003Parser == null) {
			EAttribute[] features = new EAttribute[] { UidiagramPackage.eINSTANCE.getTemplateWidget_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			appbarName_5003Parser = parser;
		}
		return appbarName_5003Parser;
	}

	/**
	* @generated
	*/
	private IParser buttonName_5001Parser;

	/**
	* @generated
	*/
	private IParser getButtonName_5001Parser() {
		if (buttonName_5001Parser == null) {
			EAttribute[] features = new EAttribute[] { UidiagramPackage.eINSTANCE.getTemplateWidget_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			buttonName_5001Parser = parser;
		}
		return buttonName_5001Parser;
	}

	/**
	* @generated
	*/
	private IParser labelName_5002Parser;

	/**
	* @generated
	*/
	private IParser getLabelName_5002Parser() {
		if (labelName_5002Parser == null) {
			EAttribute[] features = new EAttribute[] { UidiagramPackage.eINSTANCE.getTemplateWidget_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			labelName_5002Parser = parser;
		}
		return labelName_5002Parser;
	}

	/**
	* @generated
	*/
	private IParser tabbarName_5006Parser;

	/**
	* @generated
	*/
	private IParser getTabbarName_5006Parser() {
		if (tabbarName_5006Parser == null) {
			EAttribute[] features = new EAttribute[] { UidiagramPackage.eINSTANCE.getTemplateWidget_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			tabbarName_5006Parser = parser;
		}
		return tabbarName_5006Parser;
	}

	/**
	* @generated
	*/
	private IParser buttonName_5004Parser;

	/**
	* @generated
	*/
	private IParser getButtonName_5004Parser() {
		if (buttonName_5004Parser == null) {
			EAttribute[] features = new EAttribute[] { UidiagramPackage.eINSTANCE.getTemplateWidget_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			buttonName_5004Parser = parser;
		}
		return buttonName_5004Parser;
	}

	/**
	* @generated
	*/
	private IParser labelName_5005Parser;

	/**
	* @generated
	*/
	private IParser getLabelName_5005Parser() {
		if (labelName_5005Parser == null) {
			EAttribute[] features = new EAttribute[] { UidiagramPackage.eINSTANCE.getTemplateWidget_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			labelName_5005Parser = parser;
		}
		return labelName_5005Parser;
	}

	/**
	* @generated
	*/
	private IParser buttonName_5007Parser;

	/**
	* @generated
	*/
	private IParser getButtonName_5007Parser() {
		if (buttonName_5007Parser == null) {
			EAttribute[] features = new EAttribute[] { UidiagramPackage.eINSTANCE.getTemplateWidget_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			buttonName_5007Parser = parser;
		}
		return buttonName_5007Parser;
	}

	/**
	* @generated
	*/
	private IParser labelName_5008Parser;

	/**
	* @generated
	*/
	private IParser getLabelName_5008Parser() {
		if (labelName_5008Parser == null) {
			EAttribute[] features = new EAttribute[] { UidiagramPackage.eINSTANCE.getTemplateWidget_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			labelName_5008Parser = parser;
		}
		return labelName_5008Parser;
	}

	/**
	* @generated
	*/
	private IParser checkboxName_5009Parser;

	/**
	* @generated
	*/
	private IParser getCheckboxName_5009Parser() {
		if (checkboxName_5009Parser == null) {
			EAttribute[] features = new EAttribute[] { UidiagramPackage.eINSTANCE.getTemplateWidget_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			checkboxName_5009Parser = parser;
		}
		return checkboxName_5009Parser;
	}

	/**
	* @generated
	*/
	private IParser inputName_5010Parser;

	/**
	* @generated
	*/
	private IParser getInputName_5010Parser() {
		if (inputName_5010Parser == null) {
			EAttribute[] features = new EAttribute[] { UidiagramPackage.eINSTANCE.getTemplateWidget_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			inputName_5010Parser = parser;
		}
		return inputName_5010Parser;
	}

	/**
	* @generated
	*/
	private IParser listViewName_5060Parser;

	/**
	* @generated
	*/
	private IParser getListViewName_5060Parser() {
		if (listViewName_5060Parser == null) {
			EAttribute[] features = new EAttribute[] { UidiagramPackage.eINSTANCE.getTemplateWidget_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			listViewName_5060Parser = parser;
		}
		return listViewName_5060Parser;
	}

	/**
	* @generated
	*/
	private IParser groupName_5017Parser;

	/**
	* @generated
	*/
	private IParser getGroupName_5017Parser() {
		if (groupName_5017Parser == null) {
			EAttribute[] features = new EAttribute[] { UidiagramPackage.eINSTANCE.getTemplateWidget_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			groupName_5017Parser = parser;
		}
		return groupName_5017Parser;
	}

	/**
	* @generated
	*/
	private IParser radioButtonName_5011Parser;

	/**
	* @generated
	*/
	private IParser getRadioButtonName_5011Parser() {
		if (radioButtonName_5011Parser == null) {
			EAttribute[] features = new EAttribute[] { UidiagramPackage.eINSTANCE.getTemplateWidget_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			radioButtonName_5011Parser = parser;
		}
		return radioButtonName_5011Parser;
	}

	/**
	* @generated
	*/
	private IParser comboBoxName_5012Parser;

	/**
	* @generated
	*/
	private IParser getComboBoxName_5012Parser() {
		if (comboBoxName_5012Parser == null) {
			EAttribute[] features = new EAttribute[] { UidiagramPackage.eINSTANCE.getTemplateWidget_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			comboBoxName_5012Parser = parser;
		}
		return comboBoxName_5012Parser;
	}

	/**
	* @generated
	*/
	private IParser datePickerName_5013Parser;

	/**
	* @generated
	*/
	private IParser getDatePickerName_5013Parser() {
		if (datePickerName_5013Parser == null) {
			EAttribute[] features = new EAttribute[] { UidiagramPackage.eINSTANCE.getTemplateWidget_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			datePickerName_5013Parser = parser;
		}
		return datePickerName_5013Parser;
	}

	/**
	* @generated
	*/
	private IParser switchName_5014Parser;

	/**
	* @generated
	*/
	private IParser getSwitchName_5014Parser() {
		if (switchName_5014Parser == null) {
			EAttribute[] features = new EAttribute[] { UidiagramPackage.eINSTANCE.getTemplateWidget_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			switchName_5014Parser = parser;
		}
		return switchName_5014Parser;
	}

	/**
	* @generated
	*/
	private IParser tableName_5016Parser;

	/**
	* @generated
	*/
	private IParser getTableName_5016Parser() {
		if (tableName_5016Parser == null) {
			EAttribute[] features = new EAttribute[] { UidiagramPackage.eINSTANCE.getTemplateWidget_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			tableName_5016Parser = parser;
		}
		return tableName_5016Parser;
	}

	/**
	* @generated
	*/
	private IParser columnName_5015Parser;

	/**
	* @generated
	*/
	private IParser getColumnName_5015Parser() {
		if (columnName_5015Parser == null) {
			EAttribute[] features = new EAttribute[] { UidiagramPackage.eINSTANCE.getColumn_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			columnName_5015Parser = parser;
		}
		return columnName_5015Parser;
	}

	/**
	* @generated
	*/
	private IParser groupColumnName_5059Parser;

	/**
	* @generated
	*/
	private IParser getGroupColumnName_5059Parser() {
		if (groupColumnName_5059Parser == null) {
			EAttribute[] features = new EAttribute[] { UidiagramPackage.eINSTANCE.getTemplateWidget_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			groupColumnName_5059Parser = parser;
		}
		return groupColumnName_5059Parser;
	}

	/**
	* @generated
	*/
	private IParser groupColumnName_5058Parser;

	/**
	* @generated
	*/
	private IParser getGroupColumnName_5058Parser() {
		if (groupColumnName_5058Parser == null) {
			EAttribute[] features = new EAttribute[] { UidiagramPackage.eINSTANCE.getTemplateWidget_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			groupColumnName_5058Parser = parser;
		}
		return groupColumnName_5058Parser;
	}

	/**
	* @generated
	*/
	private IParser groupRowName_5057Parser;

	/**
	* @generated
	*/
	private IParser getGroupRowName_5057Parser() {
		if (groupRowName_5057Parser == null) {
			EAttribute[] features = new EAttribute[] { UidiagramPackage.eINSTANCE.getTemplateWidget_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			groupRowName_5057Parser = parser;
		}
		return groupRowName_5057Parser;
	}

	/**
	* @generated
	*/
	private IParser groupColumnName_5056Parser;

	/**
	* @generated
	*/
	private IParser getGroupColumnName_5056Parser() {
		if (groupColumnName_5056Parser == null) {
			EAttribute[] features = new EAttribute[] { UidiagramPackage.eINSTANCE.getTemplateWidget_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			groupColumnName_5056Parser = parser;
		}
		return groupColumnName_5056Parser;
	}

	/**
	* @generated
	*/
	private IParser appbarName_5018Parser;

	/**
	* @generated
	*/
	private IParser getAppbarName_5018Parser() {
		if (appbarName_5018Parser == null) {
			EAttribute[] features = new EAttribute[] { UidiagramPackage.eINSTANCE.getTemplateWidget_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			appbarName_5018Parser = parser;
		}
		return appbarName_5018Parser;
	}

	/**
	* @generated
	*/
	private IParser tabbarName_5019Parser;

	/**
	* @generated
	*/
	private IParser getTabbarName_5019Parser() {
		if (tabbarName_5019Parser == null) {
			EAttribute[] features = new EAttribute[] { UidiagramPackage.eINSTANCE.getTemplateWidget_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			tabbarName_5019Parser = parser;
		}
		return tabbarName_5019Parser;
	}

	/**
	* @generated
	*/
	private IParser buttonName_5020Parser;

	/**
	* @generated
	*/
	private IParser getButtonName_5020Parser() {
		if (buttonName_5020Parser == null) {
			EAttribute[] features = new EAttribute[] { UidiagramPackage.eINSTANCE.getTemplateWidget_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			buttonName_5020Parser = parser;
		}
		return buttonName_5020Parser;
	}

	/**
	* @generated
	*/
	private IParser labelName_5021Parser;

	/**
	* @generated
	*/
	private IParser getLabelName_5021Parser() {
		if (labelName_5021Parser == null) {
			EAttribute[] features = new EAttribute[] { UidiagramPackage.eINSTANCE.getTemplateWidget_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			labelName_5021Parser = parser;
		}
		return labelName_5021Parser;
	}

	/**
	* @generated
	*/
	private IParser checkboxName_5022Parser;

	/**
	* @generated
	*/
	private IParser getCheckboxName_5022Parser() {
		if (checkboxName_5022Parser == null) {
			EAttribute[] features = new EAttribute[] { UidiagramPackage.eINSTANCE.getTemplateWidget_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			checkboxName_5022Parser = parser;
		}
		return checkboxName_5022Parser;
	}

	/**
	* @generated
	*/
	private IParser inputName_5023Parser;

	/**
	* @generated
	*/
	private IParser getInputName_5023Parser() {
		if (inputName_5023Parser == null) {
			EAttribute[] features = new EAttribute[] { UidiagramPackage.eINSTANCE.getTemplateWidget_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			inputName_5023Parser = parser;
		}
		return inputName_5023Parser;
	}

	/**
	* @generated
	*/
	private IParser listViewName_5050Parser;

	/**
	* @generated
	*/
	private IParser getListViewName_5050Parser() {
		if (listViewName_5050Parser == null) {
			EAttribute[] features = new EAttribute[] { UidiagramPackage.eINSTANCE.getTemplateWidget_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			listViewName_5050Parser = parser;
		}
		return listViewName_5050Parser;
	}

	/**
	* @generated
	*/
	private IParser groupRowName_5049Parser;

	/**
	* @generated
	*/
	private IParser getGroupRowName_5049Parser() {
		if (groupRowName_5049Parser == null) {
			EAttribute[] features = new EAttribute[] { UidiagramPackage.eINSTANCE.getTemplateWidget_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			groupRowName_5049Parser = parser;
		}
		return groupRowName_5049Parser;
	}

	/**
	* @generated
	*/
	private IParser groupRowName_5048Parser;

	/**
	* @generated
	*/
	private IParser getGroupRowName_5048Parser() {
		if (groupRowName_5048Parser == null) {
			EAttribute[] features = new EAttribute[] { UidiagramPackage.eINSTANCE.getTemplateWidget_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			groupRowName_5048Parser = parser;
		}
		return groupRowName_5048Parser;
	}

	/**
	* @generated
	*/
	private IParser appbarName_5024Parser;

	/**
	* @generated
	*/
	private IParser getAppbarName_5024Parser() {
		if (appbarName_5024Parser == null) {
			EAttribute[] features = new EAttribute[] { UidiagramPackage.eINSTANCE.getTemplateWidget_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			appbarName_5024Parser = parser;
		}
		return appbarName_5024Parser;
	}

	/**
	* @generated
	*/
	private IParser tabbarName_5025Parser;

	/**
	* @generated
	*/
	private IParser getTabbarName_5025Parser() {
		if (tabbarName_5025Parser == null) {
			EAttribute[] features = new EAttribute[] { UidiagramPackage.eINSTANCE.getTemplateWidget_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			tabbarName_5025Parser = parser;
		}
		return tabbarName_5025Parser;
	}

	/**
	* @generated
	*/
	private IParser buttonName_5026Parser;

	/**
	* @generated
	*/
	private IParser getButtonName_5026Parser() {
		if (buttonName_5026Parser == null) {
			EAttribute[] features = new EAttribute[] { UidiagramPackage.eINSTANCE.getTemplateWidget_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			buttonName_5026Parser = parser;
		}
		return buttonName_5026Parser;
	}

	/**
	* @generated
	*/
	private IParser labelName_5027Parser;

	/**
	* @generated
	*/
	private IParser getLabelName_5027Parser() {
		if (labelName_5027Parser == null) {
			EAttribute[] features = new EAttribute[] { UidiagramPackage.eINSTANCE.getTemplateWidget_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			labelName_5027Parser = parser;
		}
		return labelName_5027Parser;
	}

	/**
	* @generated
	*/
	private IParser checkboxName_5028Parser;

	/**
	* @generated
	*/
	private IParser getCheckboxName_5028Parser() {
		if (checkboxName_5028Parser == null) {
			EAttribute[] features = new EAttribute[] { UidiagramPackage.eINSTANCE.getTemplateWidget_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			checkboxName_5028Parser = parser;
		}
		return checkboxName_5028Parser;
	}

	/**
	* @generated
	*/
	private IParser inputName_5029Parser;

	/**
	* @generated
	*/
	private IParser getInputName_5029Parser() {
		if (inputName_5029Parser == null) {
			EAttribute[] features = new EAttribute[] { UidiagramPackage.eINSTANCE.getTemplateWidget_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			inputName_5029Parser = parser;
		}
		return inputName_5029Parser;
	}

	/**
	* @generated
	*/
	private IParser listViewName_5042Parser;

	/**
	* @generated
	*/
	private IParser getListViewName_5042Parser() {
		if (listViewName_5042Parser == null) {
			EAttribute[] features = new EAttribute[] { UidiagramPackage.eINSTANCE.getTemplateWidget_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			listViewName_5042Parser = parser;
		}
		return listViewName_5042Parser;
	}

	/**
	* @generated
	*/
	private IParser appbarName_5030Parser;

	/**
	* @generated
	*/
	private IParser getAppbarName_5030Parser() {
		if (appbarName_5030Parser == null) {
			EAttribute[] features = new EAttribute[] { UidiagramPackage.eINSTANCE.getTemplateWidget_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			appbarName_5030Parser = parser;
		}
		return appbarName_5030Parser;
	}

	/**
	* @generated
	*/
	private IParser tabbarName_5031Parser;

	/**
	* @generated
	*/
	private IParser getTabbarName_5031Parser() {
		if (tabbarName_5031Parser == null) {
			EAttribute[] features = new EAttribute[] { UidiagramPackage.eINSTANCE.getTemplateWidget_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			tabbarName_5031Parser = parser;
		}
		return tabbarName_5031Parser;
	}

	/**
	* @generated
	*/
	private IParser buttonName_5032Parser;

	/**
	* @generated
	*/
	private IParser getButtonName_5032Parser() {
		if (buttonName_5032Parser == null) {
			EAttribute[] features = new EAttribute[] { UidiagramPackage.eINSTANCE.getTemplateWidget_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			buttonName_5032Parser = parser;
		}
		return buttonName_5032Parser;
	}

	/**
	* @generated
	*/
	private IParser labelName_5033Parser;

	/**
	* @generated
	*/
	private IParser getLabelName_5033Parser() {
		if (labelName_5033Parser == null) {
			EAttribute[] features = new EAttribute[] { UidiagramPackage.eINSTANCE.getTemplateWidget_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			labelName_5033Parser = parser;
		}
		return labelName_5033Parser;
	}

	/**
	* @generated
	*/
	private IParser checkboxName_5034Parser;

	/**
	* @generated
	*/
	private IParser getCheckboxName_5034Parser() {
		if (checkboxName_5034Parser == null) {
			EAttribute[] features = new EAttribute[] { UidiagramPackage.eINSTANCE.getTemplateWidget_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			checkboxName_5034Parser = parser;
		}
		return checkboxName_5034Parser;
	}

	/**
	* @generated
	*/
	private IParser inputName_5035Parser;

	/**
	* @generated
	*/
	private IParser getInputName_5035Parser() {
		if (inputName_5035Parser == null) {
			EAttribute[] features = new EAttribute[] { UidiagramPackage.eINSTANCE.getTemplateWidget_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			inputName_5035Parser = parser;
		}
		return inputName_5035Parser;
	}

	/**
	* @generated
	*/
	private IParser listViewName_5041Parser;

	/**
	* @generated
	*/
	private IParser getListViewName_5041Parser() {
		if (listViewName_5041Parser == null) {
			EAttribute[] features = new EAttribute[] { UidiagramPackage.eINSTANCE.getTemplateWidget_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			listViewName_5041Parser = parser;
		}
		return listViewName_5041Parser;
	}

	/**
	* @generated
	*/
	private IParser radioButtonName_5036Parser;

	/**
	* @generated
	*/
	private IParser getRadioButtonName_5036Parser() {
		if (radioButtonName_5036Parser == null) {
			EAttribute[] features = new EAttribute[] { UidiagramPackage.eINSTANCE.getTemplateWidget_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			radioButtonName_5036Parser = parser;
		}
		return radioButtonName_5036Parser;
	}

	/**
	* @generated
	*/
	private IParser comboBoxName_5037Parser;

	/**
	* @generated
	*/
	private IParser getComboBoxName_5037Parser() {
		if (comboBoxName_5037Parser == null) {
			EAttribute[] features = new EAttribute[] { UidiagramPackage.eINSTANCE.getTemplateWidget_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			comboBoxName_5037Parser = parser;
		}
		return comboBoxName_5037Parser;
	}

	/**
	* @generated
	*/
	private IParser datePickerName_5038Parser;

	/**
	* @generated
	*/
	private IParser getDatePickerName_5038Parser() {
		if (datePickerName_5038Parser == null) {
			EAttribute[] features = new EAttribute[] { UidiagramPackage.eINSTANCE.getTemplateWidget_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			datePickerName_5038Parser = parser;
		}
		return datePickerName_5038Parser;
	}

	/**
	* @generated
	*/
	private IParser switchName_5039Parser;

	/**
	* @generated
	*/
	private IParser getSwitchName_5039Parser() {
		if (switchName_5039Parser == null) {
			EAttribute[] features = new EAttribute[] { UidiagramPackage.eINSTANCE.getTemplateWidget_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			switchName_5039Parser = parser;
		}
		return switchName_5039Parser;
	}

	/**
	* @generated
	*/
	private IParser tableName_5040Parser;

	/**
	* @generated
	*/
	private IParser getTableName_5040Parser() {
		if (tableName_5040Parser == null) {
			EAttribute[] features = new EAttribute[] { UidiagramPackage.eINSTANCE.getTemplateWidget_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			tableName_5040Parser = parser;
		}
		return tableName_5040Parser;
	}

	/**
	* @generated
	*/
	private IParser radioButtonName_5043Parser;

	/**
	* @generated
	*/
	private IParser getRadioButtonName_5043Parser() {
		if (radioButtonName_5043Parser == null) {
			EAttribute[] features = new EAttribute[] { UidiagramPackage.eINSTANCE.getTemplateWidget_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			radioButtonName_5043Parser = parser;
		}
		return radioButtonName_5043Parser;
	}

	/**
	* @generated
	*/
	private IParser comboBoxName_5044Parser;

	/**
	* @generated
	*/
	private IParser getComboBoxName_5044Parser() {
		if (comboBoxName_5044Parser == null) {
			EAttribute[] features = new EAttribute[] { UidiagramPackage.eINSTANCE.getTemplateWidget_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			comboBoxName_5044Parser = parser;
		}
		return comboBoxName_5044Parser;
	}

	/**
	* @generated
	*/
	private IParser datePickerName_5045Parser;

	/**
	* @generated
	*/
	private IParser getDatePickerName_5045Parser() {
		if (datePickerName_5045Parser == null) {
			EAttribute[] features = new EAttribute[] { UidiagramPackage.eINSTANCE.getTemplateWidget_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			datePickerName_5045Parser = parser;
		}
		return datePickerName_5045Parser;
	}

	/**
	* @generated
	*/
	private IParser switchName_5046Parser;

	/**
	* @generated
	*/
	private IParser getSwitchName_5046Parser() {
		if (switchName_5046Parser == null) {
			EAttribute[] features = new EAttribute[] { UidiagramPackage.eINSTANCE.getTemplateWidget_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			switchName_5046Parser = parser;
		}
		return switchName_5046Parser;
	}

	/**
	* @generated
	*/
	private IParser tableName_5047Parser;

	/**
	* @generated
	*/
	private IParser getTableName_5047Parser() {
		if (tableName_5047Parser == null) {
			EAttribute[] features = new EAttribute[] { UidiagramPackage.eINSTANCE.getTemplateWidget_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			tableName_5047Parser = parser;
		}
		return tableName_5047Parser;
	}

	/**
	* @generated
	*/
	private IParser radioButtonName_5051Parser;

	/**
	* @generated
	*/
	private IParser getRadioButtonName_5051Parser() {
		if (radioButtonName_5051Parser == null) {
			EAttribute[] features = new EAttribute[] { UidiagramPackage.eINSTANCE.getTemplateWidget_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			radioButtonName_5051Parser = parser;
		}
		return radioButtonName_5051Parser;
	}

	/**
	* @generated
	*/
	private IParser comboBoxName_5052Parser;

	/**
	* @generated
	*/
	private IParser getComboBoxName_5052Parser() {
		if (comboBoxName_5052Parser == null) {
			EAttribute[] features = new EAttribute[] { UidiagramPackage.eINSTANCE.getTemplateWidget_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			comboBoxName_5052Parser = parser;
		}
		return comboBoxName_5052Parser;
	}

	/**
	* @generated
	*/
	private IParser datePickerName_5053Parser;

	/**
	* @generated
	*/
	private IParser getDatePickerName_5053Parser() {
		if (datePickerName_5053Parser == null) {
			EAttribute[] features = new EAttribute[] { UidiagramPackage.eINSTANCE.getTemplateWidget_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			datePickerName_5053Parser = parser;
		}
		return datePickerName_5053Parser;
	}

	/**
	* @generated
	*/
	private IParser switchName_5054Parser;

	/**
	* @generated
	*/
	private IParser getSwitchName_5054Parser() {
		if (switchName_5054Parser == null) {
			EAttribute[] features = new EAttribute[] { UidiagramPackage.eINSTANCE.getTemplateWidget_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			switchName_5054Parser = parser;
		}
		return switchName_5054Parser;
	}

	/**
	* @generated
	*/
	private IParser tableName_5055Parser;

	/**
	* @generated
	*/
	private IParser getTableName_5055Parser() {
		if (tableName_5055Parser == null) {
			EAttribute[] features = new EAttribute[] { UidiagramPackage.eINSTANCE.getTemplateWidget_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			tableName_5055Parser = parser;
		}
		return tableName_5055Parser;
	}

	/**
	* @generated
	*/
	private IParser groupColumnName_5067Parser;

	/**
	* @generated
	*/
	private IParser getGroupColumnName_5067Parser() {
		if (groupColumnName_5067Parser == null) {
			EAttribute[] features = new EAttribute[] { UidiagramPackage.eINSTANCE.getTemplateWidget_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			groupColumnName_5067Parser = parser;
		}
		return groupColumnName_5067Parser;
	}

	/**
	* @generated
	*/
	private IParser groupRowName_5068Parser;

	/**
	* @generated
	*/
	private IParser getGroupRowName_5068Parser() {
		if (groupRowName_5068Parser == null) {
			EAttribute[] features = new EAttribute[] { UidiagramPackage.eINSTANCE.getTemplateWidget_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			groupRowName_5068Parser = parser;
		}
		return groupRowName_5068Parser;
	}

	/**
	* @generated
	*/
	private IParser appbarName_5069Parser;

	/**
	* @generated
	*/
	private IParser getAppbarName_5069Parser() {
		if (appbarName_5069Parser == null) {
			EAttribute[] features = new EAttribute[] { UidiagramPackage.eINSTANCE.getTemplateWidget_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			appbarName_5069Parser = parser;
		}
		return appbarName_5069Parser;
	}

	/**
	* @generated
	*/
	private IParser tabbarName_5070Parser;

	/**
	* @generated
	*/
	private IParser getTabbarName_5070Parser() {
		if (tabbarName_5070Parser == null) {
			EAttribute[] features = new EAttribute[] { UidiagramPackage.eINSTANCE.getTemplateWidget_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			tabbarName_5070Parser = parser;
		}
		return tabbarName_5070Parser;
	}

	/**
	* @generated
	*/
	private IParser buttonName_5071Parser;

	/**
	* @generated
	*/
	private IParser getButtonName_5071Parser() {
		if (buttonName_5071Parser == null) {
			EAttribute[] features = new EAttribute[] { UidiagramPackage.eINSTANCE.getTemplateWidget_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			buttonName_5071Parser = parser;
		}
		return buttonName_5071Parser;
	}

	/**
	* @generated
	*/
	private IParser labelName_5072Parser;

	/**
	* @generated
	*/
	private IParser getLabelName_5072Parser() {
		if (labelName_5072Parser == null) {
			EAttribute[] features = new EAttribute[] { UidiagramPackage.eINSTANCE.getTemplateWidget_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			labelName_5072Parser = parser;
		}
		return labelName_5072Parser;
	}

	/**
	* @generated
	*/
	private IParser checkboxName_5073Parser;

	/**
	* @generated
	*/
	private IParser getCheckboxName_5073Parser() {
		if (checkboxName_5073Parser == null) {
			EAttribute[] features = new EAttribute[] { UidiagramPackage.eINSTANCE.getTemplateWidget_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			checkboxName_5073Parser = parser;
		}
		return checkboxName_5073Parser;
	}

	/**
	* @generated
	*/
	private IParser inputName_5074Parser;

	/**
	* @generated
	*/
	private IParser getInputName_5074Parser() {
		if (inputName_5074Parser == null) {
			EAttribute[] features = new EAttribute[] { UidiagramPackage.eINSTANCE.getTemplateWidget_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			inputName_5074Parser = parser;
		}
		return inputName_5074Parser;
	}

	/**
	* @generated
	*/
	private IParser listViewName_5075Parser;

	/**
	* @generated
	*/
	private IParser getListViewName_5075Parser() {
		if (listViewName_5075Parser == null) {
			EAttribute[] features = new EAttribute[] { UidiagramPackage.eINSTANCE.getTemplateWidget_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			listViewName_5075Parser = parser;
		}
		return listViewName_5075Parser;
	}

	/**
	* @generated
	*/
	private IParser radioButtonName_5076Parser;

	/**
	* @generated
	*/
	private IParser getRadioButtonName_5076Parser() {
		if (radioButtonName_5076Parser == null) {
			EAttribute[] features = new EAttribute[] { UidiagramPackage.eINSTANCE.getTemplateWidget_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			radioButtonName_5076Parser = parser;
		}
		return radioButtonName_5076Parser;
	}

	/**
	* @generated
	*/
	private IParser comboBoxName_5077Parser;

	/**
	* @generated
	*/
	private IParser getComboBoxName_5077Parser() {
		if (comboBoxName_5077Parser == null) {
			EAttribute[] features = new EAttribute[] { UidiagramPackage.eINSTANCE.getTemplateWidget_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			comboBoxName_5077Parser = parser;
		}
		return comboBoxName_5077Parser;
	}

	/**
	* @generated
	*/
	private IParser datePickerName_5078Parser;

	/**
	* @generated
	*/
	private IParser getDatePickerName_5078Parser() {
		if (datePickerName_5078Parser == null) {
			EAttribute[] features = new EAttribute[] { UidiagramPackage.eINSTANCE.getTemplateWidget_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			datePickerName_5078Parser = parser;
		}
		return datePickerName_5078Parser;
	}

	/**
	* @generated
	*/
	private IParser switchName_5079Parser;

	/**
	* @generated
	*/
	private IParser getSwitchName_5079Parser() {
		if (switchName_5079Parser == null) {
			EAttribute[] features = new EAttribute[] { UidiagramPackage.eINSTANCE.getTemplateWidget_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			switchName_5079Parser = parser;
		}
		return switchName_5079Parser;
	}

	/**
	* @generated
	*/
	private IParser tableName_5080Parser;

	/**
	* @generated
	*/
	private IParser getTableName_5080Parser() {
		if (tableName_5080Parser == null) {
			EAttribute[] features = new EAttribute[] { UidiagramPackage.eINSTANCE.getTemplateWidget_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			tableName_5080Parser = parser;
		}
		return tableName_5080Parser;
	}

	/**
	* @generated
	*/
	protected IParser getParser(int visualID) {
		switch (visualID) {
		case UserInterfaceNameEditPart.VISUAL_ID:
			return getUserInterfaceName_5081Parser();
		case GroupNameEditPart.VISUAL_ID:
			return getGroupName_5066Parser();
		case GroupName2EditPart.VISUAL_ID:
			return getGroupName_5065Parser();
		case GroupColumnNameEditPart.VISUAL_ID:
			return getGroupColumnName_5064Parser();
		case GroupName3EditPart.VISUAL_ID:
			return getGroupName_5063Parser();
		case GroupRowNameEditPart.VISUAL_ID:
			return getGroupRowName_5062Parser();
		case GroupName4EditPart.VISUAL_ID:
			return getGroupName_5061Parser();
		case AppbarNameEditPart.VISUAL_ID:
			return getAppbarName_5003Parser();
		case ButtonNameEditPart.VISUAL_ID:
			return getButtonName_5001Parser();
		case LabelNameEditPart.VISUAL_ID:
			return getLabelName_5002Parser();
		case TabbarNameEditPart.VISUAL_ID:
			return getTabbarName_5006Parser();
		case ButtonName2EditPart.VISUAL_ID:
			return getButtonName_5004Parser();
		case LabelName2EditPart.VISUAL_ID:
			return getLabelName_5005Parser();
		case ButtonName3EditPart.VISUAL_ID:
			return getButtonName_5007Parser();
		case LabelName3EditPart.VISUAL_ID:
			return getLabelName_5008Parser();
		case CheckboxNameEditPart.VISUAL_ID:
			return getCheckboxName_5009Parser();
		case InputNameEditPart.VISUAL_ID:
			return getInputName_5010Parser();
		case ListViewNameEditPart.VISUAL_ID:
			return getListViewName_5060Parser();
		case GroupName5EditPart.VISUAL_ID:
			return getGroupName_5017Parser();
		case RadioButtonNameEditPart.VISUAL_ID:
			return getRadioButtonName_5011Parser();
		case ComboBoxNameEditPart.VISUAL_ID:
			return getComboBoxName_5012Parser();
		case DatePickerNameEditPart.VISUAL_ID:
			return getDatePickerName_5013Parser();
		case SwitchNameEditPart.VISUAL_ID:
			return getSwitchName_5014Parser();
		case TableNameEditPart.VISUAL_ID:
			return getTableName_5016Parser();
		case ColumnNameEditPart.VISUAL_ID:
			return getColumnName_5015Parser();
		case GroupColumnName2EditPart.VISUAL_ID:
			return getGroupColumnName_5059Parser();
		case GroupColumnName3EditPart.VISUAL_ID:
			return getGroupColumnName_5058Parser();
		case GroupRowName2EditPart.VISUAL_ID:
			return getGroupRowName_5057Parser();
		case GroupColumnName4EditPart.VISUAL_ID:
			return getGroupColumnName_5056Parser();
		case AppbarName2EditPart.VISUAL_ID:
			return getAppbarName_5018Parser();
		case TabbarName2EditPart.VISUAL_ID:
			return getTabbarName_5019Parser();
		case ButtonName4EditPart.VISUAL_ID:
			return getButtonName_5020Parser();
		case LabelName4EditPart.VISUAL_ID:
			return getLabelName_5021Parser();
		case CheckboxName2EditPart.VISUAL_ID:
			return getCheckboxName_5022Parser();
		case InputName2EditPart.VISUAL_ID:
			return getInputName_5023Parser();
		case ListViewName2EditPart.VISUAL_ID:
			return getListViewName_5050Parser();
		case GroupRowName3EditPart.VISUAL_ID:
			return getGroupRowName_5049Parser();
		case GroupRowName4EditPart.VISUAL_ID:
			return getGroupRowName_5048Parser();
		case AppbarName3EditPart.VISUAL_ID:
			return getAppbarName_5024Parser();
		case TabbarName3EditPart.VISUAL_ID:
			return getTabbarName_5025Parser();
		case ButtonName5EditPart.VISUAL_ID:
			return getButtonName_5026Parser();
		case LabelName5EditPart.VISUAL_ID:
			return getLabelName_5027Parser();
		case CheckboxName3EditPart.VISUAL_ID:
			return getCheckboxName_5028Parser();
		case InputName3EditPart.VISUAL_ID:
			return getInputName_5029Parser();
		case ListViewName3EditPart.VISUAL_ID:
			return getListViewName_5042Parser();
		case AppbarName4EditPart.VISUAL_ID:
			return getAppbarName_5030Parser();
		case TabbarName4EditPart.VISUAL_ID:
			return getTabbarName_5031Parser();
		case ButtonName6EditPart.VISUAL_ID:
			return getButtonName_5032Parser();
		case LabelName6EditPart.VISUAL_ID:
			return getLabelName_5033Parser();
		case CheckboxName4EditPart.VISUAL_ID:
			return getCheckboxName_5034Parser();
		case InputName4EditPart.VISUAL_ID:
			return getInputName_5035Parser();
		case ListViewName4EditPart.VISUAL_ID:
			return getListViewName_5041Parser();
		case RadioButtonName2EditPart.VISUAL_ID:
			return getRadioButtonName_5036Parser();
		case ComboBoxName2EditPart.VISUAL_ID:
			return getComboBoxName_5037Parser();
		case DatePickerName2EditPart.VISUAL_ID:
			return getDatePickerName_5038Parser();
		case SwitchName2EditPart.VISUAL_ID:
			return getSwitchName_5039Parser();
		case TableName2EditPart.VISUAL_ID:
			return getTableName_5040Parser();
		case RadioButtonName3EditPart.VISUAL_ID:
			return getRadioButtonName_5043Parser();
		case ComboBoxName3EditPart.VISUAL_ID:
			return getComboBoxName_5044Parser();
		case DatePickerName3EditPart.VISUAL_ID:
			return getDatePickerName_5045Parser();
		case SwitchName3EditPart.VISUAL_ID:
			return getSwitchName_5046Parser();
		case TableName3EditPart.VISUAL_ID:
			return getTableName_5047Parser();
		case RadioButtonName4EditPart.VISUAL_ID:
			return getRadioButtonName_5051Parser();
		case ComboBoxName4EditPart.VISUAL_ID:
			return getComboBoxName_5052Parser();
		case DatePickerName4EditPart.VISUAL_ID:
			return getDatePickerName_5053Parser();
		case SwitchName4EditPart.VISUAL_ID:
			return getSwitchName_5054Parser();
		case TableName4EditPart.VISUAL_ID:
			return getTableName_5055Parser();
		case GroupColumnName5EditPart.VISUAL_ID:
			return getGroupColumnName_5067Parser();
		case GroupRowName5EditPart.VISUAL_ID:
			return getGroupRowName_5068Parser();
		case AppbarName5EditPart.VISUAL_ID:
			return getAppbarName_5069Parser();
		case TabbarName5EditPart.VISUAL_ID:
			return getTabbarName_5070Parser();
		case ButtonName7EditPart.VISUAL_ID:
			return getButtonName_5071Parser();
		case LabelName7EditPart.VISUAL_ID:
			return getLabelName_5072Parser();
		case CheckboxName5EditPart.VISUAL_ID:
			return getCheckboxName_5073Parser();
		case InputName5EditPart.VISUAL_ID:
			return getInputName_5074Parser();
		case ListViewName5EditPart.VISUAL_ID:
			return getListViewName_5075Parser();
		case RadioButtonName5EditPart.VISUAL_ID:
			return getRadioButtonName_5076Parser();
		case ComboBoxName5EditPart.VISUAL_ID:
			return getComboBoxName_5077Parser();
		case DatePickerName5EditPart.VISUAL_ID:
			return getDatePickerName_5078Parser();
		case SwitchName5EditPart.VISUAL_ID:
			return getSwitchName_5079Parser();
		case TableName5EditPart.VISUAL_ID:
			return getTableName_5080Parser();
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
			return getParser(UidiagramVisualIDRegistry.getVisualID(vid));
		}
		View view = (View) hint.getAdapter(View.class);
		if (view != null) {
			return getParser(UidiagramVisualIDRegistry.getVisualID(view));
		}
		return null;
	}

	/**
	* @generated
	*/
	public boolean provides(IOperation operation) {
		if (operation instanceof GetParserOperation) {
			IAdaptable hint = ((GetParserOperation) operation).getHint();
			if (UidiagramElementTypes.getElement(hint) == null) {
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
