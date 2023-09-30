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
import uidiagram.diagram.edit.parts.AppbarNameEditPart;
import uidiagram.diagram.edit.parts.ButtonName2EditPart;
import uidiagram.diagram.edit.parts.ButtonName3EditPart;
import uidiagram.diagram.edit.parts.ButtonName4EditPart;
import uidiagram.diagram.edit.parts.ButtonNameEditPart;
import uidiagram.diagram.edit.parts.CheckboxName2EditPart;
import uidiagram.diagram.edit.parts.CheckboxName3EditPart;
import uidiagram.diagram.edit.parts.CheckboxName4EditPart;
import uidiagram.diagram.edit.parts.CheckboxNameEditPart;
import uidiagram.diagram.edit.parts.ColumnNameEditPart;
import uidiagram.diagram.edit.parts.ComboBoxName2EditPart;
import uidiagram.diagram.edit.parts.ComboBoxName3EditPart;
import uidiagram.diagram.edit.parts.ComboBoxName4EditPart;
import uidiagram.diagram.edit.parts.ComboBoxNameEditPart;
import uidiagram.diagram.edit.parts.DatePickerName2EditPart;
import uidiagram.diagram.edit.parts.DatePickerName3EditPart;
import uidiagram.diagram.edit.parts.DatePickerName4EditPart;
import uidiagram.diagram.edit.parts.DatePickerNameEditPart;
import uidiagram.diagram.edit.parts.GroupColumnName2EditPart;
import uidiagram.diagram.edit.parts.GroupColumnName3EditPart;
import uidiagram.diagram.edit.parts.GroupColumnName4EditPart;
import uidiagram.diagram.edit.parts.GroupColumnNameEditPart;
import uidiagram.diagram.edit.parts.GroupName2EditPart;
import uidiagram.diagram.edit.parts.GroupName3EditPart;
import uidiagram.diagram.edit.parts.GroupName4EditPart;
import uidiagram.diagram.edit.parts.GroupNameEditPart;
import uidiagram.diagram.edit.parts.GroupRowName2EditPart;
import uidiagram.diagram.edit.parts.GroupRowName3EditPart;
import uidiagram.diagram.edit.parts.GroupRowName4EditPart;
import uidiagram.diagram.edit.parts.GroupRowNameEditPart;
import uidiagram.diagram.edit.parts.InputName2EditPart;
import uidiagram.diagram.edit.parts.InputName3EditPart;
import uidiagram.diagram.edit.parts.InputName4EditPart;
import uidiagram.diagram.edit.parts.InputNameEditPart;
import uidiagram.diagram.edit.parts.LabelName2EditPart;
import uidiagram.diagram.edit.parts.LabelName3EditPart;
import uidiagram.diagram.edit.parts.LabelName4EditPart;
import uidiagram.diagram.edit.parts.LabelNameEditPart;
import uidiagram.diagram.edit.parts.ListViewName2EditPart;
import uidiagram.diagram.edit.parts.ListViewName3EditPart;
import uidiagram.diagram.edit.parts.ListViewName4EditPart;
import uidiagram.diagram.edit.parts.ListViewNameEditPart;
import uidiagram.diagram.edit.parts.RadioButtonName2EditPart;
import uidiagram.diagram.edit.parts.RadioButtonName3EditPart;
import uidiagram.diagram.edit.parts.RadioButtonName4EditPart;
import uidiagram.diagram.edit.parts.RadioButtonNameEditPart;
import uidiagram.diagram.edit.parts.SwitchName2EditPart;
import uidiagram.diagram.edit.parts.SwitchName3EditPart;
import uidiagram.diagram.edit.parts.SwitchName4EditPart;
import uidiagram.diagram.edit.parts.SwitchNameEditPart;
import uidiagram.diagram.edit.parts.TabbarName2EditPart;
import uidiagram.diagram.edit.parts.TabbarName3EditPart;
import uidiagram.diagram.edit.parts.TabbarName4EditPart;
import uidiagram.diagram.edit.parts.TabbarNameEditPart;
import uidiagram.diagram.edit.parts.TableName2EditPart;
import uidiagram.diagram.edit.parts.TableName3EditPart;
import uidiagram.diagram.edit.parts.TableName4EditPart;
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
	private IParser userInterfaceName_5062Parser;

	/**
	* @generated
	*/
	private IParser getUserInterfaceName_5062Parser() {
		if (userInterfaceName_5062Parser == null) {
			EAttribute[] features = new EAttribute[] { UidiagramPackage.eINSTANCE.getUserInterface_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			userInterfaceName_5062Parser = parser;
		}
		return userInterfaceName_5062Parser;
	}

	/**
	* @generated
	*/
	private IParser groupName_5047Parser;

	/**
	* @generated
	*/
	private IParser getGroupName_5047Parser() {
		if (groupName_5047Parser == null) {
			EAttribute[] features = new EAttribute[] { UidiagramPackage.eINSTANCE.getTemplateWidget_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			groupName_5047Parser = parser;
		}
		return groupName_5047Parser;
	}

	/**
	* @generated
	*/
	private IParser groupName_5046Parser;

	/**
	* @generated
	*/
	private IParser getGroupName_5046Parser() {
		if (groupName_5046Parser == null) {
			EAttribute[] features = new EAttribute[] { UidiagramPackage.eINSTANCE.getTemplateWidget_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			groupName_5046Parser = parser;
		}
		return groupName_5046Parser;
	}

	/**
	* @generated
	*/
	private IParser groupColumnName_5045Parser;

	/**
	* @generated
	*/
	private IParser getGroupColumnName_5045Parser() {
		if (groupColumnName_5045Parser == null) {
			EAttribute[] features = new EAttribute[] { UidiagramPackage.eINSTANCE.getTemplateWidget_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			groupColumnName_5045Parser = parser;
		}
		return groupColumnName_5045Parser;
	}

	/**
	* @generated
	*/
	private IParser groupName_5044Parser;

	/**
	* @generated
	*/
	private IParser getGroupName_5044Parser() {
		if (groupName_5044Parser == null) {
			EAttribute[] features = new EAttribute[] { UidiagramPackage.eINSTANCE.getTemplateWidget_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			groupName_5044Parser = parser;
		}
		return groupName_5044Parser;
	}

	/**
	* @generated
	*/
	private IParser groupRowName_5043Parser;

	/**
	* @generated
	*/
	private IParser getGroupRowName_5043Parser() {
		if (groupRowName_5043Parser == null) {
			EAttribute[] features = new EAttribute[] { UidiagramPackage.eINSTANCE.getTemplateWidget_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			groupRowName_5043Parser = parser;
		}
		return groupRowName_5043Parser;
	}

	/**
	* @generated
	*/
	private IParser groupName_5014Parser;

	/**
	* @generated
	*/
	private IParser getGroupName_5014Parser() {
		if (groupName_5014Parser == null) {
			EAttribute[] features = new EAttribute[] { UidiagramPackage.eINSTANCE.getTemplateWidget_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			groupName_5014Parser = parser;
		}
		return groupName_5014Parser;
	}

	/**
	* @generated
	*/
	private IParser appbarName_5001Parser;

	/**
	* @generated
	*/
	private IParser getAppbarName_5001Parser() {
		if (appbarName_5001Parser == null) {
			EAttribute[] features = new EAttribute[] { UidiagramPackage.eINSTANCE.getTemplateWidget_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			appbarName_5001Parser = parser;
		}
		return appbarName_5001Parser;
	}

	/**
	* @generated
	*/
	private IParser tabbarName_5002Parser;

	/**
	* @generated
	*/
	private IParser getTabbarName_5002Parser() {
		if (tabbarName_5002Parser == null) {
			EAttribute[] features = new EAttribute[] { UidiagramPackage.eINSTANCE.getTemplateWidget_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			tabbarName_5002Parser = parser;
		}
		return tabbarName_5002Parser;
	}

	/**
	* @generated
	*/
	private IParser buttonName_5003Parser;

	/**
	* @generated
	*/
	private IParser getButtonName_5003Parser() {
		if (buttonName_5003Parser == null) {
			EAttribute[] features = new EAttribute[] { UidiagramPackage.eINSTANCE.getTemplateWidget_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			buttonName_5003Parser = parser;
		}
		return buttonName_5003Parser;
	}

	/**
	* @generated
	*/
	private IParser labelName_5004Parser;

	/**
	* @generated
	*/
	private IParser getLabelName_5004Parser() {
		if (labelName_5004Parser == null) {
			EAttribute[] features = new EAttribute[] { UidiagramPackage.eINSTANCE.getTemplateWidget_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			labelName_5004Parser = parser;
		}
		return labelName_5004Parser;
	}

	/**
	* @generated
	*/
	private IParser checkboxName_5005Parser;

	/**
	* @generated
	*/
	private IParser getCheckboxName_5005Parser() {
		if (checkboxName_5005Parser == null) {
			EAttribute[] features = new EAttribute[] { UidiagramPackage.eINSTANCE.getTemplateWidget_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			checkboxName_5005Parser = parser;
		}
		return checkboxName_5005Parser;
	}

	/**
	* @generated
	*/
	private IParser inputName_5006Parser;

	/**
	* @generated
	*/
	private IParser getInputName_5006Parser() {
		if (inputName_5006Parser == null) {
			EAttribute[] features = new EAttribute[] { UidiagramPackage.eINSTANCE.getTemplateWidget_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			inputName_5006Parser = parser;
		}
		return inputName_5006Parser;
	}

	/**
	* @generated
	*/
	private IParser listViewName_5007Parser;

	/**
	* @generated
	*/
	private IParser getListViewName_5007Parser() {
		if (listViewName_5007Parser == null) {
			EAttribute[] features = new EAttribute[] { UidiagramPackage.eINSTANCE.getTemplateWidget_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			listViewName_5007Parser = parser;
		}
		return listViewName_5007Parser;
	}

	/**
	* @generated
	*/
	private IParser radioButtonName_5008Parser;

	/**
	* @generated
	*/
	private IParser getRadioButtonName_5008Parser() {
		if (radioButtonName_5008Parser == null) {
			EAttribute[] features = new EAttribute[] { UidiagramPackage.eINSTANCE.getTemplateWidget_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			radioButtonName_5008Parser = parser;
		}
		return radioButtonName_5008Parser;
	}

	/**
	* @generated
	*/
	private IParser comboBoxName_5009Parser;

	/**
	* @generated
	*/
	private IParser getComboBoxName_5009Parser() {
		if (comboBoxName_5009Parser == null) {
			EAttribute[] features = new EAttribute[] { UidiagramPackage.eINSTANCE.getTemplateWidget_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			comboBoxName_5009Parser = parser;
		}
		return comboBoxName_5009Parser;
	}

	/**
	* @generated
	*/
	private IParser datePickerName_5010Parser;

	/**
	* @generated
	*/
	private IParser getDatePickerName_5010Parser() {
		if (datePickerName_5010Parser == null) {
			EAttribute[] features = new EAttribute[] { UidiagramPackage.eINSTANCE.getTemplateWidget_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			datePickerName_5010Parser = parser;
		}
		return datePickerName_5010Parser;
	}

	/**
	* @generated
	*/
	private IParser switchName_5011Parser;

	/**
	* @generated
	*/
	private IParser getSwitchName_5011Parser() {
		if (switchName_5011Parser == null) {
			EAttribute[] features = new EAttribute[] { UidiagramPackage.eINSTANCE.getTemplateWidget_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			switchName_5011Parser = parser;
		}
		return switchName_5011Parser;
	}

	/**
	* @generated
	*/
	private IParser tableName_5013Parser;

	/**
	* @generated
	*/
	private IParser getTableName_5013Parser() {
		if (tableName_5013Parser == null) {
			EAttribute[] features = new EAttribute[] { UidiagramPackage.eINSTANCE.getTemplateWidget_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			tableName_5013Parser = parser;
		}
		return tableName_5013Parser;
	}

	/**
	* @generated
	*/
	private IParser columnName_5012Parser;

	/**
	* @generated
	*/
	private IParser getColumnName_5012Parser() {
		if (columnName_5012Parser == null) {
			EAttribute[] features = new EAttribute[] { UidiagramPackage.eINSTANCE.getColumn_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			columnName_5012Parser = parser;
		}
		return columnName_5012Parser;
	}

	/**
	* @generated
	*/
	private IParser groupColumnName_5042Parser;

	/**
	* @generated
	*/
	private IParser getGroupColumnName_5042Parser() {
		if (groupColumnName_5042Parser == null) {
			EAttribute[] features = new EAttribute[] { UidiagramPackage.eINSTANCE.getTemplateWidget_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			groupColumnName_5042Parser = parser;
		}
		return groupColumnName_5042Parser;
	}

	/**
	* @generated
	*/
	private IParser groupColumnName_5041Parser;

	/**
	* @generated
	*/
	private IParser getGroupColumnName_5041Parser() {
		if (groupColumnName_5041Parser == null) {
			EAttribute[] features = new EAttribute[] { UidiagramPackage.eINSTANCE.getTemplateWidget_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			groupColumnName_5041Parser = parser;
		}
		return groupColumnName_5041Parser;
	}

	/**
	* @generated
	*/
	private IParser groupRowName_5028Parser;

	/**
	* @generated
	*/
	private IParser getGroupRowName_5028Parser() {
		if (groupRowName_5028Parser == null) {
			EAttribute[] features = new EAttribute[] { UidiagramPackage.eINSTANCE.getTemplateWidget_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			groupRowName_5028Parser = parser;
		}
		return groupRowName_5028Parser;
	}

	/**
	* @generated
	*/
	private IParser groupRowName_5027Parser;

	/**
	* @generated
	*/
	private IParser getGroupRowName_5027Parser() {
		if (groupRowName_5027Parser == null) {
			EAttribute[] features = new EAttribute[] { UidiagramPackage.eINSTANCE.getTemplateWidget_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			groupRowName_5027Parser = parser;
		}
		return groupRowName_5027Parser;
	}

	/**
	* @generated
	*/
	private IParser appbarName_5015Parser;

	/**
	* @generated
	*/
	private IParser getAppbarName_5015Parser() {
		if (appbarName_5015Parser == null) {
			EAttribute[] features = new EAttribute[] { UidiagramPackage.eINSTANCE.getTemplateWidget_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			appbarName_5015Parser = parser;
		}
		return appbarName_5015Parser;
	}

	/**
	* @generated
	*/
	private IParser tabbarName_5016Parser;

	/**
	* @generated
	*/
	private IParser getTabbarName_5016Parser() {
		if (tabbarName_5016Parser == null) {
			EAttribute[] features = new EAttribute[] { UidiagramPackage.eINSTANCE.getTemplateWidget_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			tabbarName_5016Parser = parser;
		}
		return tabbarName_5016Parser;
	}

	/**
	* @generated
	*/
	private IParser buttonName_5017Parser;

	/**
	* @generated
	*/
	private IParser getButtonName_5017Parser() {
		if (buttonName_5017Parser == null) {
			EAttribute[] features = new EAttribute[] { UidiagramPackage.eINSTANCE.getTemplateWidget_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			buttonName_5017Parser = parser;
		}
		return buttonName_5017Parser;
	}

	/**
	* @generated
	*/
	private IParser labelName_5018Parser;

	/**
	* @generated
	*/
	private IParser getLabelName_5018Parser() {
		if (labelName_5018Parser == null) {
			EAttribute[] features = new EAttribute[] { UidiagramPackage.eINSTANCE.getTemplateWidget_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			labelName_5018Parser = parser;
		}
		return labelName_5018Parser;
	}

	/**
	* @generated
	*/
	private IParser checkboxName_5019Parser;

	/**
	* @generated
	*/
	private IParser getCheckboxName_5019Parser() {
		if (checkboxName_5019Parser == null) {
			EAttribute[] features = new EAttribute[] { UidiagramPackage.eINSTANCE.getTemplateWidget_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			checkboxName_5019Parser = parser;
		}
		return checkboxName_5019Parser;
	}

	/**
	* @generated
	*/
	private IParser inputName_5020Parser;

	/**
	* @generated
	*/
	private IParser getInputName_5020Parser() {
		if (inputName_5020Parser == null) {
			EAttribute[] features = new EAttribute[] { UidiagramPackage.eINSTANCE.getTemplateWidget_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			inputName_5020Parser = parser;
		}
		return inputName_5020Parser;
	}

	/**
	* @generated
	*/
	private IParser listViewName_5021Parser;

	/**
	* @generated
	*/
	private IParser getListViewName_5021Parser() {
		if (listViewName_5021Parser == null) {
			EAttribute[] features = new EAttribute[] { UidiagramPackage.eINSTANCE.getTemplateWidget_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			listViewName_5021Parser = parser;
		}
		return listViewName_5021Parser;
	}

	/**
	* @generated
	*/
	private IParser radioButtonName_5022Parser;

	/**
	* @generated
	*/
	private IParser getRadioButtonName_5022Parser() {
		if (radioButtonName_5022Parser == null) {
			EAttribute[] features = new EAttribute[] { UidiagramPackage.eINSTANCE.getTemplateWidget_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			radioButtonName_5022Parser = parser;
		}
		return radioButtonName_5022Parser;
	}

	/**
	* @generated
	*/
	private IParser comboBoxName_5023Parser;

	/**
	* @generated
	*/
	private IParser getComboBoxName_5023Parser() {
		if (comboBoxName_5023Parser == null) {
			EAttribute[] features = new EAttribute[] { UidiagramPackage.eINSTANCE.getTemplateWidget_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			comboBoxName_5023Parser = parser;
		}
		return comboBoxName_5023Parser;
	}

	/**
	* @generated
	*/
	private IParser datePickerName_5024Parser;

	/**
	* @generated
	*/
	private IParser getDatePickerName_5024Parser() {
		if (datePickerName_5024Parser == null) {
			EAttribute[] features = new EAttribute[] { UidiagramPackage.eINSTANCE.getTemplateWidget_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			datePickerName_5024Parser = parser;
		}
		return datePickerName_5024Parser;
	}

	/**
	* @generated
	*/
	private IParser switchName_5025Parser;

	/**
	* @generated
	*/
	private IParser getSwitchName_5025Parser() {
		if (switchName_5025Parser == null) {
			EAttribute[] features = new EAttribute[] { UidiagramPackage.eINSTANCE.getTemplateWidget_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			switchName_5025Parser = parser;
		}
		return switchName_5025Parser;
	}

	/**
	* @generated
	*/
	private IParser tableName_5026Parser;

	/**
	* @generated
	*/
	private IParser getTableName_5026Parser() {
		if (tableName_5026Parser == null) {
			EAttribute[] features = new EAttribute[] { UidiagramPackage.eINSTANCE.getTemplateWidget_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			tableName_5026Parser = parser;
		}
		return tableName_5026Parser;
	}

	/**
	* @generated
	*/
	private IParser appbarName_5029Parser;

	/**
	* @generated
	*/
	private IParser getAppbarName_5029Parser() {
		if (appbarName_5029Parser == null) {
			EAttribute[] features = new EAttribute[] { UidiagramPackage.eINSTANCE.getTemplateWidget_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			appbarName_5029Parser = parser;
		}
		return appbarName_5029Parser;
	}

	/**
	* @generated
	*/
	private IParser tabbarName_5030Parser;

	/**
	* @generated
	*/
	private IParser getTabbarName_5030Parser() {
		if (tabbarName_5030Parser == null) {
			EAttribute[] features = new EAttribute[] { UidiagramPackage.eINSTANCE.getTemplateWidget_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			tabbarName_5030Parser = parser;
		}
		return tabbarName_5030Parser;
	}

	/**
	* @generated
	*/
	private IParser buttonName_5031Parser;

	/**
	* @generated
	*/
	private IParser getButtonName_5031Parser() {
		if (buttonName_5031Parser == null) {
			EAttribute[] features = new EAttribute[] { UidiagramPackage.eINSTANCE.getTemplateWidget_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			buttonName_5031Parser = parser;
		}
		return buttonName_5031Parser;
	}

	/**
	* @generated
	*/
	private IParser labelName_5032Parser;

	/**
	* @generated
	*/
	private IParser getLabelName_5032Parser() {
		if (labelName_5032Parser == null) {
			EAttribute[] features = new EAttribute[] { UidiagramPackage.eINSTANCE.getTemplateWidget_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			labelName_5032Parser = parser;
		}
		return labelName_5032Parser;
	}

	/**
	* @generated
	*/
	private IParser checkboxName_5033Parser;

	/**
	* @generated
	*/
	private IParser getCheckboxName_5033Parser() {
		if (checkboxName_5033Parser == null) {
			EAttribute[] features = new EAttribute[] { UidiagramPackage.eINSTANCE.getTemplateWidget_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			checkboxName_5033Parser = parser;
		}
		return checkboxName_5033Parser;
	}

	/**
	* @generated
	*/
	private IParser inputName_5034Parser;

	/**
	* @generated
	*/
	private IParser getInputName_5034Parser() {
		if (inputName_5034Parser == null) {
			EAttribute[] features = new EAttribute[] { UidiagramPackage.eINSTANCE.getTemplateWidget_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			inputName_5034Parser = parser;
		}
		return inputName_5034Parser;
	}

	/**
	* @generated
	*/
	private IParser listViewName_5035Parser;

	/**
	* @generated
	*/
	private IParser getListViewName_5035Parser() {
		if (listViewName_5035Parser == null) {
			EAttribute[] features = new EAttribute[] { UidiagramPackage.eINSTANCE.getTemplateWidget_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			listViewName_5035Parser = parser;
		}
		return listViewName_5035Parser;
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
	private IParser groupColumnName_5048Parser;

	/**
	* @generated
	*/
	private IParser getGroupColumnName_5048Parser() {
		if (groupColumnName_5048Parser == null) {
			EAttribute[] features = new EAttribute[] { UidiagramPackage.eINSTANCE.getTemplateWidget_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			groupColumnName_5048Parser = parser;
		}
		return groupColumnName_5048Parser;
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
	private IParser appbarName_5050Parser;

	/**
	* @generated
	*/
	private IParser getAppbarName_5050Parser() {
		if (appbarName_5050Parser == null) {
			EAttribute[] features = new EAttribute[] { UidiagramPackage.eINSTANCE.getTemplateWidget_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			appbarName_5050Parser = parser;
		}
		return appbarName_5050Parser;
	}

	/**
	* @generated
	*/
	private IParser tabbarName_5051Parser;

	/**
	* @generated
	*/
	private IParser getTabbarName_5051Parser() {
		if (tabbarName_5051Parser == null) {
			EAttribute[] features = new EAttribute[] { UidiagramPackage.eINSTANCE.getTemplateWidget_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			tabbarName_5051Parser = parser;
		}
		return tabbarName_5051Parser;
	}

	/**
	* @generated
	*/
	private IParser buttonName_5052Parser;

	/**
	* @generated
	*/
	private IParser getButtonName_5052Parser() {
		if (buttonName_5052Parser == null) {
			EAttribute[] features = new EAttribute[] { UidiagramPackage.eINSTANCE.getTemplateWidget_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			buttonName_5052Parser = parser;
		}
		return buttonName_5052Parser;
	}

	/**
	* @generated
	*/
	private IParser labelName_5053Parser;

	/**
	* @generated
	*/
	private IParser getLabelName_5053Parser() {
		if (labelName_5053Parser == null) {
			EAttribute[] features = new EAttribute[] { UidiagramPackage.eINSTANCE.getTemplateWidget_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			labelName_5053Parser = parser;
		}
		return labelName_5053Parser;
	}

	/**
	* @generated
	*/
	private IParser checkboxName_5054Parser;

	/**
	* @generated
	*/
	private IParser getCheckboxName_5054Parser() {
		if (checkboxName_5054Parser == null) {
			EAttribute[] features = new EAttribute[] { UidiagramPackage.eINSTANCE.getTemplateWidget_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			checkboxName_5054Parser = parser;
		}
		return checkboxName_5054Parser;
	}

	/**
	* @generated
	*/
	private IParser inputName_5055Parser;

	/**
	* @generated
	*/
	private IParser getInputName_5055Parser() {
		if (inputName_5055Parser == null) {
			EAttribute[] features = new EAttribute[] { UidiagramPackage.eINSTANCE.getTemplateWidget_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			inputName_5055Parser = parser;
		}
		return inputName_5055Parser;
	}

	/**
	* @generated
	*/
	private IParser listViewName_5056Parser;

	/**
	* @generated
	*/
	private IParser getListViewName_5056Parser() {
		if (listViewName_5056Parser == null) {
			EAttribute[] features = new EAttribute[] { UidiagramPackage.eINSTANCE.getTemplateWidget_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			listViewName_5056Parser = parser;
		}
		return listViewName_5056Parser;
	}

	/**
	* @generated
	*/
	private IParser radioButtonName_5057Parser;

	/**
	* @generated
	*/
	private IParser getRadioButtonName_5057Parser() {
		if (radioButtonName_5057Parser == null) {
			EAttribute[] features = new EAttribute[] { UidiagramPackage.eINSTANCE.getTemplateWidget_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			radioButtonName_5057Parser = parser;
		}
		return radioButtonName_5057Parser;
	}

	/**
	* @generated
	*/
	private IParser comboBoxName_5058Parser;

	/**
	* @generated
	*/
	private IParser getComboBoxName_5058Parser() {
		if (comboBoxName_5058Parser == null) {
			EAttribute[] features = new EAttribute[] { UidiagramPackage.eINSTANCE.getTemplateWidget_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			comboBoxName_5058Parser = parser;
		}
		return comboBoxName_5058Parser;
	}

	/**
	* @generated
	*/
	private IParser datePickerName_5059Parser;

	/**
	* @generated
	*/
	private IParser getDatePickerName_5059Parser() {
		if (datePickerName_5059Parser == null) {
			EAttribute[] features = new EAttribute[] { UidiagramPackage.eINSTANCE.getTemplateWidget_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			datePickerName_5059Parser = parser;
		}
		return datePickerName_5059Parser;
	}

	/**
	* @generated
	*/
	private IParser switchName_5060Parser;

	/**
	* @generated
	*/
	private IParser getSwitchName_5060Parser() {
		if (switchName_5060Parser == null) {
			EAttribute[] features = new EAttribute[] { UidiagramPackage.eINSTANCE.getTemplateWidget_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			switchName_5060Parser = parser;
		}
		return switchName_5060Parser;
	}

	/**
	* @generated
	*/
	private IParser tableName_5061Parser;

	/**
	* @generated
	*/
	private IParser getTableName_5061Parser() {
		if (tableName_5061Parser == null) {
			EAttribute[] features = new EAttribute[] { UidiagramPackage.eINSTANCE.getTemplateWidget_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			tableName_5061Parser = parser;
		}
		return tableName_5061Parser;
	}

	/**
	* @generated
	*/
	protected IParser getParser(int visualID) {
		switch (visualID) {
		case UserInterfaceNameEditPart.VISUAL_ID:
			return getUserInterfaceName_5062Parser();
		case GroupNameEditPart.VISUAL_ID:
			return getGroupName_5047Parser();
		case GroupName2EditPart.VISUAL_ID:
			return getGroupName_5046Parser();
		case GroupColumnNameEditPart.VISUAL_ID:
			return getGroupColumnName_5045Parser();
		case GroupName3EditPart.VISUAL_ID:
			return getGroupName_5044Parser();
		case GroupRowNameEditPart.VISUAL_ID:
			return getGroupRowName_5043Parser();
		case GroupName4EditPart.VISUAL_ID:
			return getGroupName_5014Parser();
		case AppbarNameEditPart.VISUAL_ID:
			return getAppbarName_5001Parser();
		case TabbarNameEditPart.VISUAL_ID:
			return getTabbarName_5002Parser();
		case ButtonNameEditPart.VISUAL_ID:
			return getButtonName_5003Parser();
		case LabelNameEditPart.VISUAL_ID:
			return getLabelName_5004Parser();
		case CheckboxNameEditPart.VISUAL_ID:
			return getCheckboxName_5005Parser();
		case InputNameEditPart.VISUAL_ID:
			return getInputName_5006Parser();
		case ListViewNameEditPart.VISUAL_ID:
			return getListViewName_5007Parser();
		case RadioButtonNameEditPart.VISUAL_ID:
			return getRadioButtonName_5008Parser();
		case ComboBoxNameEditPart.VISUAL_ID:
			return getComboBoxName_5009Parser();
		case DatePickerNameEditPart.VISUAL_ID:
			return getDatePickerName_5010Parser();
		case SwitchNameEditPart.VISUAL_ID:
			return getSwitchName_5011Parser();
		case TableNameEditPart.VISUAL_ID:
			return getTableName_5013Parser();
		case ColumnNameEditPart.VISUAL_ID:
			return getColumnName_5012Parser();
		case GroupColumnName2EditPart.VISUAL_ID:
			return getGroupColumnName_5042Parser();
		case GroupColumnName3EditPart.VISUAL_ID:
			return getGroupColumnName_5041Parser();
		case GroupRowName2EditPart.VISUAL_ID:
			return getGroupRowName_5028Parser();
		case GroupRowName3EditPart.VISUAL_ID:
			return getGroupRowName_5027Parser();
		case AppbarName2EditPart.VISUAL_ID:
			return getAppbarName_5015Parser();
		case TabbarName2EditPart.VISUAL_ID:
			return getTabbarName_5016Parser();
		case ButtonName2EditPart.VISUAL_ID:
			return getButtonName_5017Parser();
		case LabelName2EditPart.VISUAL_ID:
			return getLabelName_5018Parser();
		case CheckboxName2EditPart.VISUAL_ID:
			return getCheckboxName_5019Parser();
		case InputName2EditPart.VISUAL_ID:
			return getInputName_5020Parser();
		case ListViewName2EditPart.VISUAL_ID:
			return getListViewName_5021Parser();
		case RadioButtonName2EditPart.VISUAL_ID:
			return getRadioButtonName_5022Parser();
		case ComboBoxName2EditPart.VISUAL_ID:
			return getComboBoxName_5023Parser();
		case DatePickerName2EditPart.VISUAL_ID:
			return getDatePickerName_5024Parser();
		case SwitchName2EditPart.VISUAL_ID:
			return getSwitchName_5025Parser();
		case TableName2EditPart.VISUAL_ID:
			return getTableName_5026Parser();
		case AppbarName3EditPart.VISUAL_ID:
			return getAppbarName_5029Parser();
		case TabbarName3EditPart.VISUAL_ID:
			return getTabbarName_5030Parser();
		case ButtonName3EditPart.VISUAL_ID:
			return getButtonName_5031Parser();
		case LabelName3EditPart.VISUAL_ID:
			return getLabelName_5032Parser();
		case CheckboxName3EditPart.VISUAL_ID:
			return getCheckboxName_5033Parser();
		case InputName3EditPart.VISUAL_ID:
			return getInputName_5034Parser();
		case ListViewName3EditPart.VISUAL_ID:
			return getListViewName_5035Parser();
		case RadioButtonName3EditPart.VISUAL_ID:
			return getRadioButtonName_5036Parser();
		case ComboBoxName3EditPart.VISUAL_ID:
			return getComboBoxName_5037Parser();
		case DatePickerName3EditPart.VISUAL_ID:
			return getDatePickerName_5038Parser();
		case SwitchName3EditPart.VISUAL_ID:
			return getSwitchName_5039Parser();
		case TableName3EditPart.VISUAL_ID:
			return getTableName_5040Parser();
		case GroupColumnName4EditPart.VISUAL_ID:
			return getGroupColumnName_5048Parser();
		case GroupRowName4EditPart.VISUAL_ID:
			return getGroupRowName_5049Parser();
		case AppbarName4EditPart.VISUAL_ID:
			return getAppbarName_5050Parser();
		case TabbarName4EditPart.VISUAL_ID:
			return getTabbarName_5051Parser();
		case ButtonName4EditPart.VISUAL_ID:
			return getButtonName_5052Parser();
		case LabelName4EditPart.VISUAL_ID:
			return getLabelName_5053Parser();
		case CheckboxName4EditPart.VISUAL_ID:
			return getCheckboxName_5054Parser();
		case InputName4EditPart.VISUAL_ID:
			return getInputName_5055Parser();
		case ListViewName4EditPart.VISUAL_ID:
			return getListViewName_5056Parser();
		case RadioButtonName4EditPart.VISUAL_ID:
			return getRadioButtonName_5057Parser();
		case ComboBoxName4EditPart.VISUAL_ID:
			return getComboBoxName_5058Parser();
		case DatePickerName4EditPart.VISUAL_ID:
			return getDatePickerName_5059Parser();
		case SwitchName4EditPart.VISUAL_ID:
			return getSwitchName_5060Parser();
		case TableName4EditPart.VISUAL_ID:
			return getTableName_5061Parser();
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
