/*
* 
*/
package uidiagram.diagram.part;

import org.eclipse.core.runtime.Platform;
import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.notation.Diagram;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.gmf.tooling.runtime.structure.DiagramStructure;

import uidiagram.UIDiagram;
import uidiagram.UidiagramPackage;
import uidiagram.diagram.edit.parts.*;

/**
 * This registry is used to determine which type of visual object should be
 * created for the corresponding Diagram, Node, ChildNode or Link represented
 * by a domain model object.
 * 
 * @generated
 */
public class UidiagramVisualIDRegistry {

	/**
	* @generated
	*/
	private static final String DEBUG_KEY = "UIDiagram.diagram/debug/visualID"; //$NON-NLS-1$

	/**
	* @generated
	*/
	public static int getVisualID(View view) {
		if (view instanceof Diagram) {
			if (UIDiagramEditPart.MODEL_ID.equals(view.getType())) {
				return UIDiagramEditPart.VISUAL_ID;
			} else {
				return -1;
			}
		}
		return uidiagram.diagram.part.UidiagramVisualIDRegistry.getVisualID(view.getType());
	}

	/**
	* @generated
	*/
	public static String getModelID(View view) {
		View diagram = view.getDiagram();
		while (view != diagram) {
			EAnnotation annotation = view.getEAnnotation("Shortcut"); //$NON-NLS-1$
			if (annotation != null) {
				return (String) annotation.getDetails().get("modelID"); //$NON-NLS-1$
			}
			view = (View) view.eContainer();
		}
		return diagram != null ? diagram.getType() : null;
	}

	/**
	* @generated
	*/
	public static int getVisualID(String type) {
		try {
			return Integer.parseInt(type);
		} catch (NumberFormatException e) {
			if (Boolean.TRUE.toString().equalsIgnoreCase(Platform.getDebugOption(DEBUG_KEY))) {
				UidiagramDiagramEditorPlugin.getInstance()
						.logError("Unable to parse view type as a visualID number: " + type);
			}
		}
		return -1;
	}

	/**
	* @generated
	*/
	public static String getType(int visualID) {
		return Integer.toString(visualID);
	}

	/**
	* @generated
	*/
	public static int getDiagramVisualID(EObject domainElement) {
		if (domainElement == null) {
			return -1;
		}
		if (UidiagramPackage.eINSTANCE.getUIDiagram().isSuperTypeOf(domainElement.eClass())
				&& isDiagram((UIDiagram) domainElement)) {
			return UIDiagramEditPart.VISUAL_ID;
		}
		return -1;
	}

	/**
	* @generated
	*/
	public static int getNodeVisualID(View containerView, EObject domainElement) {
		if (domainElement == null) {
			return -1;
		}
		String containerModelID = uidiagram.diagram.part.UidiagramVisualIDRegistry.getModelID(containerView);
		if (!UIDiagramEditPart.MODEL_ID.equals(containerModelID) && !"uidiagram".equals(containerModelID)) { //$NON-NLS-1$
			return -1;
		}
		int containerVisualID;
		if (UIDiagramEditPart.MODEL_ID.equals(containerModelID)) {
			containerVisualID = uidiagram.diagram.part.UidiagramVisualIDRegistry.getVisualID(containerView);
		} else {
			if (containerView instanceof Diagram) {
				containerVisualID = UIDiagramEditPart.VISUAL_ID;
			} else {
				return -1;
			}
		}
		switch (containerVisualID) {
		case UIDiagramEditPart.VISUAL_ID:
			if (UidiagramPackage.eINSTANCE.getUserInterface().isSuperTypeOf(domainElement.eClass())) {
				return UserInterfaceEditPart.VISUAL_ID;
			}
			break;
		case UserInterfaceUserInterfaceListTemplateWidgetCompartmentEditPart.VISUAL_ID:
			if (UidiagramPackage.eINSTANCE.getGroup().isSuperTypeOf(domainElement.eClass())) {
				return GroupEditPart.VISUAL_ID;
			}
			if (UidiagramPackage.eINSTANCE.getGroupColumn().isSuperTypeOf(domainElement.eClass())) {
				return GroupColumn5EditPart.VISUAL_ID;
			}
			if (UidiagramPackage.eINSTANCE.getGroupRow().isSuperTypeOf(domainElement.eClass())) {
				return GroupRow5EditPart.VISUAL_ID;
			}
			if (UidiagramPackage.eINSTANCE.getAppbar().isSuperTypeOf(domainElement.eClass())) {
				return Appbar5EditPart.VISUAL_ID;
			}
			if (UidiagramPackage.eINSTANCE.getTabbar().isSuperTypeOf(domainElement.eClass())) {
				return Tabbar5EditPart.VISUAL_ID;
			}
			if (UidiagramPackage.eINSTANCE.getButton().isSuperTypeOf(domainElement.eClass())) {
				return Button7EditPart.VISUAL_ID;
			}
			if (UidiagramPackage.eINSTANCE.getLabel().isSuperTypeOf(domainElement.eClass())) {
				return Label7EditPart.VISUAL_ID;
			}
			if (UidiagramPackage.eINSTANCE.getCheckbox().isSuperTypeOf(domainElement.eClass())) {
				return Checkbox5EditPart.VISUAL_ID;
			}
			if (UidiagramPackage.eINSTANCE.getInput().isSuperTypeOf(domainElement.eClass())) {
				return Input5EditPart.VISUAL_ID;
			}
			if (UidiagramPackage.eINSTANCE.getListView().isSuperTypeOf(domainElement.eClass())) {
				return ListView5EditPart.VISUAL_ID;
			}
			if (UidiagramPackage.eINSTANCE.getRadioButton().isSuperTypeOf(domainElement.eClass())) {
				return RadioButton5EditPart.VISUAL_ID;
			}
			if (UidiagramPackage.eINSTANCE.getComboBox().isSuperTypeOf(domainElement.eClass())) {
				return ComboBox5EditPart.VISUAL_ID;
			}
			if (UidiagramPackage.eINSTANCE.getDatePicker().isSuperTypeOf(domainElement.eClass())) {
				return DatePicker5EditPart.VISUAL_ID;
			}
			if (UidiagramPackage.eINSTANCE.getSwitch().isSuperTypeOf(domainElement.eClass())) {
				return Switch5EditPart.VISUAL_ID;
			}
			if (UidiagramPackage.eINSTANCE.getTable().isSuperTypeOf(domainElement.eClass())) {
				return Table5EditPart.VISUAL_ID;
			}
			break;
		case GroupGroupTemplateWidgetCompartmentEditPart.VISUAL_ID:
			if (UidiagramPackage.eINSTANCE.getGroup().isSuperTypeOf(domainElement.eClass())) {
				return Group2EditPart.VISUAL_ID;
			}
			if (UidiagramPackage.eINSTANCE.getGroupColumn().isSuperTypeOf(domainElement.eClass())) {
				return GroupColumnEditPart.VISUAL_ID;
			}
			if (UidiagramPackage.eINSTANCE.getGroupRow().isSuperTypeOf(domainElement.eClass())) {
				return GroupRowEditPart.VISUAL_ID;
			}
			if (UidiagramPackage.eINSTANCE.getAppbar().isSuperTypeOf(domainElement.eClass())) {
				return AppbarEditPart.VISUAL_ID;
			}
			if (UidiagramPackage.eINSTANCE.getTabbar().isSuperTypeOf(domainElement.eClass())) {
				return TabbarEditPart.VISUAL_ID;
			}
			if (UidiagramPackage.eINSTANCE.getButton().isSuperTypeOf(domainElement.eClass())) {
				return Button3EditPart.VISUAL_ID;
			}
			if (UidiagramPackage.eINSTANCE.getLabel().isSuperTypeOf(domainElement.eClass())) {
				return Label3EditPart.VISUAL_ID;
			}
			if (UidiagramPackage.eINSTANCE.getCheckbox().isSuperTypeOf(domainElement.eClass())) {
				return CheckboxEditPart.VISUAL_ID;
			}
			if (UidiagramPackage.eINSTANCE.getInput().isSuperTypeOf(domainElement.eClass())) {
				return InputEditPart.VISUAL_ID;
			}
			if (UidiagramPackage.eINSTANCE.getListView().isSuperTypeOf(domainElement.eClass())) {
				return ListViewEditPart.VISUAL_ID;
			}
			if (UidiagramPackage.eINSTANCE.getRadioButton().isSuperTypeOf(domainElement.eClass())) {
				return RadioButtonEditPart.VISUAL_ID;
			}
			if (UidiagramPackage.eINSTANCE.getComboBox().isSuperTypeOf(domainElement.eClass())) {
				return ComboBoxEditPart.VISUAL_ID;
			}
			if (UidiagramPackage.eINSTANCE.getDatePicker().isSuperTypeOf(domainElement.eClass())) {
				return DatePickerEditPart.VISUAL_ID;
			}
			if (UidiagramPackage.eINSTANCE.getSwitch().isSuperTypeOf(domainElement.eClass())) {
				return SwitchEditPart.VISUAL_ID;
			}
			if (UidiagramPackage.eINSTANCE.getTable().isSuperTypeOf(domainElement.eClass())) {
				return TableEditPart.VISUAL_ID;
			}
			break;
		case GroupGroupTemplateWidgetCompartment2EditPart.VISUAL_ID:
			if (UidiagramPackage.eINSTANCE.getGroup().isSuperTypeOf(domainElement.eClass())) {
				return Group2EditPart.VISUAL_ID;
			}
			if (UidiagramPackage.eINSTANCE.getGroupColumn().isSuperTypeOf(domainElement.eClass())) {
				return GroupColumnEditPart.VISUAL_ID;
			}
			if (UidiagramPackage.eINSTANCE.getGroupRow().isSuperTypeOf(domainElement.eClass())) {
				return GroupRowEditPart.VISUAL_ID;
			}
			if (UidiagramPackage.eINSTANCE.getAppbar().isSuperTypeOf(domainElement.eClass())) {
				return AppbarEditPart.VISUAL_ID;
			}
			if (UidiagramPackage.eINSTANCE.getTabbar().isSuperTypeOf(domainElement.eClass())) {
				return TabbarEditPart.VISUAL_ID;
			}
			if (UidiagramPackage.eINSTANCE.getButton().isSuperTypeOf(domainElement.eClass())) {
				return Button3EditPart.VISUAL_ID;
			}
			if (UidiagramPackage.eINSTANCE.getLabel().isSuperTypeOf(domainElement.eClass())) {
				return Label3EditPart.VISUAL_ID;
			}
			if (UidiagramPackage.eINSTANCE.getCheckbox().isSuperTypeOf(domainElement.eClass())) {
				return CheckboxEditPart.VISUAL_ID;
			}
			if (UidiagramPackage.eINSTANCE.getInput().isSuperTypeOf(domainElement.eClass())) {
				return InputEditPart.VISUAL_ID;
			}
			if (UidiagramPackage.eINSTANCE.getListView().isSuperTypeOf(domainElement.eClass())) {
				return ListViewEditPart.VISUAL_ID;
			}
			if (UidiagramPackage.eINSTANCE.getRadioButton().isSuperTypeOf(domainElement.eClass())) {
				return RadioButtonEditPart.VISUAL_ID;
			}
			if (UidiagramPackage.eINSTANCE.getComboBox().isSuperTypeOf(domainElement.eClass())) {
				return ComboBoxEditPart.VISUAL_ID;
			}
			if (UidiagramPackage.eINSTANCE.getDatePicker().isSuperTypeOf(domainElement.eClass())) {
				return DatePickerEditPart.VISUAL_ID;
			}
			if (UidiagramPackage.eINSTANCE.getSwitch().isSuperTypeOf(domainElement.eClass())) {
				return SwitchEditPart.VISUAL_ID;
			}
			if (UidiagramPackage.eINSTANCE.getTable().isSuperTypeOf(domainElement.eClass())) {
				return TableEditPart.VISUAL_ID;
			}
			break;
		case GroupColumnGroupColumnListTemplateWidgetCompartmentEditPart.VISUAL_ID:
			if (UidiagramPackage.eINSTANCE.getGroup().isSuperTypeOf(domainElement.eClass())) {
				return Group3EditPart.VISUAL_ID;
			}
			if (UidiagramPackage.eINSTANCE.getGroupColumn().isSuperTypeOf(domainElement.eClass())) {
				return GroupColumn3EditPart.VISUAL_ID;
			}
			if (UidiagramPackage.eINSTANCE.getGroupRow().isSuperTypeOf(domainElement.eClass())) {
				return GroupRow2EditPart.VISUAL_ID;
			}
			if (UidiagramPackage.eINSTANCE.getAppbar().isSuperTypeOf(domainElement.eClass())) {
				return Appbar2EditPart.VISUAL_ID;
			}
			if (UidiagramPackage.eINSTANCE.getTabbar().isSuperTypeOf(domainElement.eClass())) {
				return Tabbar2EditPart.VISUAL_ID;
			}
			if (UidiagramPackage.eINSTANCE.getButton().isSuperTypeOf(domainElement.eClass())) {
				return Button4EditPart.VISUAL_ID;
			}
			if (UidiagramPackage.eINSTANCE.getLabel().isSuperTypeOf(domainElement.eClass())) {
				return Label4EditPart.VISUAL_ID;
			}
			if (UidiagramPackage.eINSTANCE.getCheckbox().isSuperTypeOf(domainElement.eClass())) {
				return Checkbox2EditPart.VISUAL_ID;
			}
			if (UidiagramPackage.eINSTANCE.getInput().isSuperTypeOf(domainElement.eClass())) {
				return Input2EditPart.VISUAL_ID;
			}
			if (UidiagramPackage.eINSTANCE.getListView().isSuperTypeOf(domainElement.eClass())) {
				return ListView2EditPart.VISUAL_ID;
			}
			if (UidiagramPackage.eINSTANCE.getRadioButton().isSuperTypeOf(domainElement.eClass())) {
				return RadioButton4EditPart.VISUAL_ID;
			}
			if (UidiagramPackage.eINSTANCE.getComboBox().isSuperTypeOf(domainElement.eClass())) {
				return ComboBox4EditPart.VISUAL_ID;
			}
			if (UidiagramPackage.eINSTANCE.getDatePicker().isSuperTypeOf(domainElement.eClass())) {
				return DatePicker4EditPart.VISUAL_ID;
			}
			if (UidiagramPackage.eINSTANCE.getSwitch().isSuperTypeOf(domainElement.eClass())) {
				return Switch4EditPart.VISUAL_ID;
			}
			if (UidiagramPackage.eINSTANCE.getTable().isSuperTypeOf(domainElement.eClass())) {
				return Table4EditPart.VISUAL_ID;
			}
			break;
		case GroupGroupTemplateWidgetCompartment3EditPart.VISUAL_ID:
			if (UidiagramPackage.eINSTANCE.getGroup().isSuperTypeOf(domainElement.eClass())) {
				return Group2EditPart.VISUAL_ID;
			}
			if (UidiagramPackage.eINSTANCE.getGroupColumn().isSuperTypeOf(domainElement.eClass())) {
				return GroupColumnEditPart.VISUAL_ID;
			}
			if (UidiagramPackage.eINSTANCE.getGroupRow().isSuperTypeOf(domainElement.eClass())) {
				return GroupRowEditPart.VISUAL_ID;
			}
			if (UidiagramPackage.eINSTANCE.getAppbar().isSuperTypeOf(domainElement.eClass())) {
				return AppbarEditPart.VISUAL_ID;
			}
			if (UidiagramPackage.eINSTANCE.getTabbar().isSuperTypeOf(domainElement.eClass())) {
				return TabbarEditPart.VISUAL_ID;
			}
			if (UidiagramPackage.eINSTANCE.getButton().isSuperTypeOf(domainElement.eClass())) {
				return Button3EditPart.VISUAL_ID;
			}
			if (UidiagramPackage.eINSTANCE.getLabel().isSuperTypeOf(domainElement.eClass())) {
				return Label3EditPart.VISUAL_ID;
			}
			if (UidiagramPackage.eINSTANCE.getCheckbox().isSuperTypeOf(domainElement.eClass())) {
				return CheckboxEditPart.VISUAL_ID;
			}
			if (UidiagramPackage.eINSTANCE.getInput().isSuperTypeOf(domainElement.eClass())) {
				return InputEditPart.VISUAL_ID;
			}
			if (UidiagramPackage.eINSTANCE.getListView().isSuperTypeOf(domainElement.eClass())) {
				return ListViewEditPart.VISUAL_ID;
			}
			if (UidiagramPackage.eINSTANCE.getRadioButton().isSuperTypeOf(domainElement.eClass())) {
				return RadioButtonEditPart.VISUAL_ID;
			}
			if (UidiagramPackage.eINSTANCE.getComboBox().isSuperTypeOf(domainElement.eClass())) {
				return ComboBoxEditPart.VISUAL_ID;
			}
			if (UidiagramPackage.eINSTANCE.getDatePicker().isSuperTypeOf(domainElement.eClass())) {
				return DatePickerEditPart.VISUAL_ID;
			}
			if (UidiagramPackage.eINSTANCE.getSwitch().isSuperTypeOf(domainElement.eClass())) {
				return SwitchEditPart.VISUAL_ID;
			}
			if (UidiagramPackage.eINSTANCE.getTable().isSuperTypeOf(domainElement.eClass())) {
				return TableEditPart.VISUAL_ID;
			}
			break;
		case GroupRowGroupRowListTemplateWidgetCompartmentEditPart.VISUAL_ID:
			if (UidiagramPackage.eINSTANCE.getGroup().isSuperTypeOf(domainElement.eClass())) {
				return Group4EditPart.VISUAL_ID;
			}
			if (UidiagramPackage.eINSTANCE.getGroupColumn().isSuperTypeOf(domainElement.eClass())) {
				return GroupColumn4EditPart.VISUAL_ID;
			}
			if (UidiagramPackage.eINSTANCE.getGroupRow().isSuperTypeOf(domainElement.eClass())) {
				return GroupRow4EditPart.VISUAL_ID;
			}
			if (UidiagramPackage.eINSTANCE.getAppbar().isSuperTypeOf(domainElement.eClass())) {
				return Appbar3EditPart.VISUAL_ID;
			}
			if (UidiagramPackage.eINSTANCE.getTabbar().isSuperTypeOf(domainElement.eClass())) {
				return Tabbar3EditPart.VISUAL_ID;
			}
			if (UidiagramPackage.eINSTANCE.getButton().isSuperTypeOf(domainElement.eClass())) {
				return Button5EditPart.VISUAL_ID;
			}
			if (UidiagramPackage.eINSTANCE.getLabel().isSuperTypeOf(domainElement.eClass())) {
				return Label5EditPart.VISUAL_ID;
			}
			if (UidiagramPackage.eINSTANCE.getCheckbox().isSuperTypeOf(domainElement.eClass())) {
				return Checkbox3EditPart.VISUAL_ID;
			}
			if (UidiagramPackage.eINSTANCE.getInput().isSuperTypeOf(domainElement.eClass())) {
				return Input3EditPart.VISUAL_ID;
			}
			if (UidiagramPackage.eINSTANCE.getListView().isSuperTypeOf(domainElement.eClass())) {
				return ListView3EditPart.VISUAL_ID;
			}
			if (UidiagramPackage.eINSTANCE.getRadioButton().isSuperTypeOf(domainElement.eClass())) {
				return RadioButton3EditPart.VISUAL_ID;
			}
			if (UidiagramPackage.eINSTANCE.getComboBox().isSuperTypeOf(domainElement.eClass())) {
				return ComboBox3EditPart.VISUAL_ID;
			}
			if (UidiagramPackage.eINSTANCE.getDatePicker().isSuperTypeOf(domainElement.eClass())) {
				return DatePicker3EditPart.VISUAL_ID;
			}
			if (UidiagramPackage.eINSTANCE.getSwitch().isSuperTypeOf(domainElement.eClass())) {
				return Switch3EditPart.VISUAL_ID;
			}
			if (UidiagramPackage.eINSTANCE.getTable().isSuperTypeOf(domainElement.eClass())) {
				return Table3EditPart.VISUAL_ID;
			}
			break;
		case GroupGroupTemplateWidgetCompartment4EditPart.VISUAL_ID:
			if (UidiagramPackage.eINSTANCE.getGroup().isSuperTypeOf(domainElement.eClass())) {
				return Group2EditPart.VISUAL_ID;
			}
			if (UidiagramPackage.eINSTANCE.getGroupColumn().isSuperTypeOf(domainElement.eClass())) {
				return GroupColumnEditPart.VISUAL_ID;
			}
			if (UidiagramPackage.eINSTANCE.getGroupRow().isSuperTypeOf(domainElement.eClass())) {
				return GroupRowEditPart.VISUAL_ID;
			}
			if (UidiagramPackage.eINSTANCE.getAppbar().isSuperTypeOf(domainElement.eClass())) {
				return AppbarEditPart.VISUAL_ID;
			}
			if (UidiagramPackage.eINSTANCE.getTabbar().isSuperTypeOf(domainElement.eClass())) {
				return TabbarEditPart.VISUAL_ID;
			}
			if (UidiagramPackage.eINSTANCE.getButton().isSuperTypeOf(domainElement.eClass())) {
				return Button3EditPart.VISUAL_ID;
			}
			if (UidiagramPackage.eINSTANCE.getLabel().isSuperTypeOf(domainElement.eClass())) {
				return Label3EditPart.VISUAL_ID;
			}
			if (UidiagramPackage.eINSTANCE.getCheckbox().isSuperTypeOf(domainElement.eClass())) {
				return CheckboxEditPart.VISUAL_ID;
			}
			if (UidiagramPackage.eINSTANCE.getInput().isSuperTypeOf(domainElement.eClass())) {
				return InputEditPart.VISUAL_ID;
			}
			if (UidiagramPackage.eINSTANCE.getListView().isSuperTypeOf(domainElement.eClass())) {
				return ListViewEditPart.VISUAL_ID;
			}
			if (UidiagramPackage.eINSTANCE.getRadioButton().isSuperTypeOf(domainElement.eClass())) {
				return RadioButtonEditPart.VISUAL_ID;
			}
			if (UidiagramPackage.eINSTANCE.getComboBox().isSuperTypeOf(domainElement.eClass())) {
				return ComboBoxEditPart.VISUAL_ID;
			}
			if (UidiagramPackage.eINSTANCE.getDatePicker().isSuperTypeOf(domainElement.eClass())) {
				return DatePickerEditPart.VISUAL_ID;
			}
			if (UidiagramPackage.eINSTANCE.getSwitch().isSuperTypeOf(domainElement.eClass())) {
				return SwitchEditPart.VISUAL_ID;
			}
			if (UidiagramPackage.eINSTANCE.getTable().isSuperTypeOf(domainElement.eClass())) {
				return TableEditPart.VISUAL_ID;
			}
			break;
		case AppbarAppbarListButtonsCompartmentEditPart.VISUAL_ID:
			if (UidiagramPackage.eINSTANCE.getButton().isSuperTypeOf(domainElement.eClass())) {
				return ButtonEditPart.VISUAL_ID;
			}
			break;
		case AppbarAppbarListLabelsCompartmentEditPart.VISUAL_ID:
			if (UidiagramPackage.eINSTANCE.getLabel().isSuperTypeOf(domainElement.eClass())) {
				return LabelEditPart.VISUAL_ID;
			}
			break;
		case TabbarTabbarListButtonsCompartmentEditPart.VISUAL_ID:
			if (UidiagramPackage.eINSTANCE.getButton().isSuperTypeOf(domainElement.eClass())) {
				return Button2EditPart.VISUAL_ID;
			}
			break;
		case TabbarTabbarListLabelsCompartmentEditPart.VISUAL_ID:
			if (UidiagramPackage.eINSTANCE.getLabel().isSuperTypeOf(domainElement.eClass())) {
				return Label2EditPart.VISUAL_ID;
			}
			break;
		case ListViewListViewTemplateWidgetCompartmentEditPart.VISUAL_ID:
			if (UidiagramPackage.eINSTANCE.getGroup().isSuperTypeOf(domainElement.eClass())) {
				return Group5EditPart.VISUAL_ID;
			}
			if (UidiagramPackage.eINSTANCE.getGroupColumn().isSuperTypeOf(domainElement.eClass())) {
				return GroupColumn2EditPart.VISUAL_ID;
			}
			if (UidiagramPackage.eINSTANCE.getGroupRow().isSuperTypeOf(domainElement.eClass())) {
				return GroupRow3EditPart.VISUAL_ID;
			}
			if (UidiagramPackage.eINSTANCE.getAppbar().isSuperTypeOf(domainElement.eClass())) {
				return Appbar4EditPart.VISUAL_ID;
			}
			if (UidiagramPackage.eINSTANCE.getTabbar().isSuperTypeOf(domainElement.eClass())) {
				return Tabbar4EditPart.VISUAL_ID;
			}
			if (UidiagramPackage.eINSTANCE.getButton().isSuperTypeOf(domainElement.eClass())) {
				return Button6EditPart.VISUAL_ID;
			}
			if (UidiagramPackage.eINSTANCE.getLabel().isSuperTypeOf(domainElement.eClass())) {
				return Label6EditPart.VISUAL_ID;
			}
			if (UidiagramPackage.eINSTANCE.getCheckbox().isSuperTypeOf(domainElement.eClass())) {
				return Checkbox4EditPart.VISUAL_ID;
			}
			if (UidiagramPackage.eINSTANCE.getInput().isSuperTypeOf(domainElement.eClass())) {
				return Input4EditPart.VISUAL_ID;
			}
			if (UidiagramPackage.eINSTANCE.getListView().isSuperTypeOf(domainElement.eClass())) {
				return ListView4EditPart.VISUAL_ID;
			}
			if (UidiagramPackage.eINSTANCE.getRadioButton().isSuperTypeOf(domainElement.eClass())) {
				return RadioButton2EditPart.VISUAL_ID;
			}
			if (UidiagramPackage.eINSTANCE.getComboBox().isSuperTypeOf(domainElement.eClass())) {
				return ComboBox2EditPart.VISUAL_ID;
			}
			if (UidiagramPackage.eINSTANCE.getDatePicker().isSuperTypeOf(domainElement.eClass())) {
				return DatePicker2EditPart.VISUAL_ID;
			}
			if (UidiagramPackage.eINSTANCE.getSwitch().isSuperTypeOf(domainElement.eClass())) {
				return Switch2EditPart.VISUAL_ID;
			}
			if (UidiagramPackage.eINSTANCE.getTable().isSuperTypeOf(domainElement.eClass())) {
				return Table2EditPart.VISUAL_ID;
			}
			break;
		case GroupGroupTemplateWidgetCompartment5EditPart.VISUAL_ID:
			if (UidiagramPackage.eINSTANCE.getGroup().isSuperTypeOf(domainElement.eClass())) {
				return Group2EditPart.VISUAL_ID;
			}
			if (UidiagramPackage.eINSTANCE.getGroupColumn().isSuperTypeOf(domainElement.eClass())) {
				return GroupColumnEditPart.VISUAL_ID;
			}
			if (UidiagramPackage.eINSTANCE.getGroupRow().isSuperTypeOf(domainElement.eClass())) {
				return GroupRowEditPart.VISUAL_ID;
			}
			if (UidiagramPackage.eINSTANCE.getAppbar().isSuperTypeOf(domainElement.eClass())) {
				return AppbarEditPart.VISUAL_ID;
			}
			if (UidiagramPackage.eINSTANCE.getTabbar().isSuperTypeOf(domainElement.eClass())) {
				return TabbarEditPart.VISUAL_ID;
			}
			if (UidiagramPackage.eINSTANCE.getButton().isSuperTypeOf(domainElement.eClass())) {
				return Button3EditPart.VISUAL_ID;
			}
			if (UidiagramPackage.eINSTANCE.getLabel().isSuperTypeOf(domainElement.eClass())) {
				return Label3EditPart.VISUAL_ID;
			}
			if (UidiagramPackage.eINSTANCE.getCheckbox().isSuperTypeOf(domainElement.eClass())) {
				return CheckboxEditPart.VISUAL_ID;
			}
			if (UidiagramPackage.eINSTANCE.getInput().isSuperTypeOf(domainElement.eClass())) {
				return InputEditPart.VISUAL_ID;
			}
			if (UidiagramPackage.eINSTANCE.getListView().isSuperTypeOf(domainElement.eClass())) {
				return ListViewEditPart.VISUAL_ID;
			}
			if (UidiagramPackage.eINSTANCE.getRadioButton().isSuperTypeOf(domainElement.eClass())) {
				return RadioButtonEditPart.VISUAL_ID;
			}
			if (UidiagramPackage.eINSTANCE.getComboBox().isSuperTypeOf(domainElement.eClass())) {
				return ComboBoxEditPart.VISUAL_ID;
			}
			if (UidiagramPackage.eINSTANCE.getDatePicker().isSuperTypeOf(domainElement.eClass())) {
				return DatePickerEditPart.VISUAL_ID;
			}
			if (UidiagramPackage.eINSTANCE.getSwitch().isSuperTypeOf(domainElement.eClass())) {
				return SwitchEditPart.VISUAL_ID;
			}
			if (UidiagramPackage.eINSTANCE.getTable().isSuperTypeOf(domainElement.eClass())) {
				return TableEditPart.VISUAL_ID;
			}
			break;
		case TableTableListCoulmnsCompartmentEditPart.VISUAL_ID:
			if (UidiagramPackage.eINSTANCE.getColumn().isSuperTypeOf(domainElement.eClass())) {
				return ColumnEditPart.VISUAL_ID;
			}
			break;
		case GroupColumnGroupColumnListTemplateWidgetCompartment2EditPart.VISUAL_ID:
			if (UidiagramPackage.eINSTANCE.getGroup().isSuperTypeOf(domainElement.eClass())) {
				return Group3EditPart.VISUAL_ID;
			}
			if (UidiagramPackage.eINSTANCE.getGroupColumn().isSuperTypeOf(domainElement.eClass())) {
				return GroupColumn3EditPart.VISUAL_ID;
			}
			if (UidiagramPackage.eINSTANCE.getGroupRow().isSuperTypeOf(domainElement.eClass())) {
				return GroupRow2EditPart.VISUAL_ID;
			}
			if (UidiagramPackage.eINSTANCE.getAppbar().isSuperTypeOf(domainElement.eClass())) {
				return Appbar2EditPart.VISUAL_ID;
			}
			if (UidiagramPackage.eINSTANCE.getTabbar().isSuperTypeOf(domainElement.eClass())) {
				return Tabbar2EditPart.VISUAL_ID;
			}
			if (UidiagramPackage.eINSTANCE.getButton().isSuperTypeOf(domainElement.eClass())) {
				return Button4EditPart.VISUAL_ID;
			}
			if (UidiagramPackage.eINSTANCE.getLabel().isSuperTypeOf(domainElement.eClass())) {
				return Label4EditPart.VISUAL_ID;
			}
			if (UidiagramPackage.eINSTANCE.getCheckbox().isSuperTypeOf(domainElement.eClass())) {
				return Checkbox2EditPart.VISUAL_ID;
			}
			if (UidiagramPackage.eINSTANCE.getInput().isSuperTypeOf(domainElement.eClass())) {
				return Input2EditPart.VISUAL_ID;
			}
			if (UidiagramPackage.eINSTANCE.getListView().isSuperTypeOf(domainElement.eClass())) {
				return ListView2EditPart.VISUAL_ID;
			}
			if (UidiagramPackage.eINSTANCE.getRadioButton().isSuperTypeOf(domainElement.eClass())) {
				return RadioButton4EditPart.VISUAL_ID;
			}
			if (UidiagramPackage.eINSTANCE.getComboBox().isSuperTypeOf(domainElement.eClass())) {
				return ComboBox4EditPart.VISUAL_ID;
			}
			if (UidiagramPackage.eINSTANCE.getDatePicker().isSuperTypeOf(domainElement.eClass())) {
				return DatePicker4EditPart.VISUAL_ID;
			}
			if (UidiagramPackage.eINSTANCE.getSwitch().isSuperTypeOf(domainElement.eClass())) {
				return Switch4EditPart.VISUAL_ID;
			}
			if (UidiagramPackage.eINSTANCE.getTable().isSuperTypeOf(domainElement.eClass())) {
				return Table4EditPart.VISUAL_ID;
			}
			break;
		case GroupColumnGroupColumnListTemplateWidgetCompartment3EditPart.VISUAL_ID:
			if (UidiagramPackage.eINSTANCE.getGroup().isSuperTypeOf(domainElement.eClass())) {
				return Group3EditPart.VISUAL_ID;
			}
			if (UidiagramPackage.eINSTANCE.getGroupColumn().isSuperTypeOf(domainElement.eClass())) {
				return GroupColumn3EditPart.VISUAL_ID;
			}
			if (UidiagramPackage.eINSTANCE.getGroupRow().isSuperTypeOf(domainElement.eClass())) {
				return GroupRow2EditPart.VISUAL_ID;
			}
			if (UidiagramPackage.eINSTANCE.getAppbar().isSuperTypeOf(domainElement.eClass())) {
				return Appbar2EditPart.VISUAL_ID;
			}
			if (UidiagramPackage.eINSTANCE.getTabbar().isSuperTypeOf(domainElement.eClass())) {
				return Tabbar2EditPart.VISUAL_ID;
			}
			if (UidiagramPackage.eINSTANCE.getButton().isSuperTypeOf(domainElement.eClass())) {
				return Button4EditPart.VISUAL_ID;
			}
			if (UidiagramPackage.eINSTANCE.getLabel().isSuperTypeOf(domainElement.eClass())) {
				return Label4EditPart.VISUAL_ID;
			}
			if (UidiagramPackage.eINSTANCE.getCheckbox().isSuperTypeOf(domainElement.eClass())) {
				return Checkbox2EditPart.VISUAL_ID;
			}
			if (UidiagramPackage.eINSTANCE.getInput().isSuperTypeOf(domainElement.eClass())) {
				return Input2EditPart.VISUAL_ID;
			}
			if (UidiagramPackage.eINSTANCE.getListView().isSuperTypeOf(domainElement.eClass())) {
				return ListView2EditPart.VISUAL_ID;
			}
			if (UidiagramPackage.eINSTANCE.getRadioButton().isSuperTypeOf(domainElement.eClass())) {
				return RadioButton4EditPart.VISUAL_ID;
			}
			if (UidiagramPackage.eINSTANCE.getComboBox().isSuperTypeOf(domainElement.eClass())) {
				return ComboBox4EditPart.VISUAL_ID;
			}
			if (UidiagramPackage.eINSTANCE.getDatePicker().isSuperTypeOf(domainElement.eClass())) {
				return DatePicker4EditPart.VISUAL_ID;
			}
			if (UidiagramPackage.eINSTANCE.getSwitch().isSuperTypeOf(domainElement.eClass())) {
				return Switch4EditPart.VISUAL_ID;
			}
			if (UidiagramPackage.eINSTANCE.getTable().isSuperTypeOf(domainElement.eClass())) {
				return Table4EditPart.VISUAL_ID;
			}
			break;
		case GroupRowGroupRowListTemplateWidgetCompartment2EditPart.VISUAL_ID:
			if (UidiagramPackage.eINSTANCE.getGroup().isSuperTypeOf(domainElement.eClass())) {
				return Group4EditPart.VISUAL_ID;
			}
			if (UidiagramPackage.eINSTANCE.getGroupColumn().isSuperTypeOf(domainElement.eClass())) {
				return GroupColumn4EditPart.VISUAL_ID;
			}
			if (UidiagramPackage.eINSTANCE.getGroupRow().isSuperTypeOf(domainElement.eClass())) {
				return GroupRow4EditPart.VISUAL_ID;
			}
			if (UidiagramPackage.eINSTANCE.getAppbar().isSuperTypeOf(domainElement.eClass())) {
				return Appbar3EditPart.VISUAL_ID;
			}
			if (UidiagramPackage.eINSTANCE.getTabbar().isSuperTypeOf(domainElement.eClass())) {
				return Tabbar3EditPart.VISUAL_ID;
			}
			if (UidiagramPackage.eINSTANCE.getButton().isSuperTypeOf(domainElement.eClass())) {
				return Button5EditPart.VISUAL_ID;
			}
			if (UidiagramPackage.eINSTANCE.getLabel().isSuperTypeOf(domainElement.eClass())) {
				return Label5EditPart.VISUAL_ID;
			}
			if (UidiagramPackage.eINSTANCE.getCheckbox().isSuperTypeOf(domainElement.eClass())) {
				return Checkbox3EditPart.VISUAL_ID;
			}
			if (UidiagramPackage.eINSTANCE.getInput().isSuperTypeOf(domainElement.eClass())) {
				return Input3EditPart.VISUAL_ID;
			}
			if (UidiagramPackage.eINSTANCE.getListView().isSuperTypeOf(domainElement.eClass())) {
				return ListView3EditPart.VISUAL_ID;
			}
			if (UidiagramPackage.eINSTANCE.getRadioButton().isSuperTypeOf(domainElement.eClass())) {
				return RadioButton3EditPart.VISUAL_ID;
			}
			if (UidiagramPackage.eINSTANCE.getComboBox().isSuperTypeOf(domainElement.eClass())) {
				return ComboBox3EditPart.VISUAL_ID;
			}
			if (UidiagramPackage.eINSTANCE.getDatePicker().isSuperTypeOf(domainElement.eClass())) {
				return DatePicker3EditPart.VISUAL_ID;
			}
			if (UidiagramPackage.eINSTANCE.getSwitch().isSuperTypeOf(domainElement.eClass())) {
				return Switch3EditPart.VISUAL_ID;
			}
			if (UidiagramPackage.eINSTANCE.getTable().isSuperTypeOf(domainElement.eClass())) {
				return Table3EditPart.VISUAL_ID;
			}
			break;
		case GroupColumnGroupColumnListTemplateWidgetCompartment4EditPart.VISUAL_ID:
			if (UidiagramPackage.eINSTANCE.getGroup().isSuperTypeOf(domainElement.eClass())) {
				return Group3EditPart.VISUAL_ID;
			}
			if (UidiagramPackage.eINSTANCE.getGroupColumn().isSuperTypeOf(domainElement.eClass())) {
				return GroupColumn3EditPart.VISUAL_ID;
			}
			if (UidiagramPackage.eINSTANCE.getGroupRow().isSuperTypeOf(domainElement.eClass())) {
				return GroupRow2EditPart.VISUAL_ID;
			}
			if (UidiagramPackage.eINSTANCE.getAppbar().isSuperTypeOf(domainElement.eClass())) {
				return Appbar2EditPart.VISUAL_ID;
			}
			if (UidiagramPackage.eINSTANCE.getTabbar().isSuperTypeOf(domainElement.eClass())) {
				return Tabbar2EditPart.VISUAL_ID;
			}
			if (UidiagramPackage.eINSTANCE.getButton().isSuperTypeOf(domainElement.eClass())) {
				return Button4EditPart.VISUAL_ID;
			}
			if (UidiagramPackage.eINSTANCE.getLabel().isSuperTypeOf(domainElement.eClass())) {
				return Label4EditPart.VISUAL_ID;
			}
			if (UidiagramPackage.eINSTANCE.getCheckbox().isSuperTypeOf(domainElement.eClass())) {
				return Checkbox2EditPart.VISUAL_ID;
			}
			if (UidiagramPackage.eINSTANCE.getInput().isSuperTypeOf(domainElement.eClass())) {
				return Input2EditPart.VISUAL_ID;
			}
			if (UidiagramPackage.eINSTANCE.getListView().isSuperTypeOf(domainElement.eClass())) {
				return ListView2EditPart.VISUAL_ID;
			}
			if (UidiagramPackage.eINSTANCE.getRadioButton().isSuperTypeOf(domainElement.eClass())) {
				return RadioButton4EditPart.VISUAL_ID;
			}
			if (UidiagramPackage.eINSTANCE.getComboBox().isSuperTypeOf(domainElement.eClass())) {
				return ComboBox4EditPart.VISUAL_ID;
			}
			if (UidiagramPackage.eINSTANCE.getDatePicker().isSuperTypeOf(domainElement.eClass())) {
				return DatePicker4EditPart.VISUAL_ID;
			}
			if (UidiagramPackage.eINSTANCE.getSwitch().isSuperTypeOf(domainElement.eClass())) {
				return Switch4EditPart.VISUAL_ID;
			}
			if (UidiagramPackage.eINSTANCE.getTable().isSuperTypeOf(domainElement.eClass())) {
				return Table4EditPart.VISUAL_ID;
			}
			break;
		case AppbarAppbarListButtonsCompartment2EditPart.VISUAL_ID:
			if (UidiagramPackage.eINSTANCE.getButton().isSuperTypeOf(domainElement.eClass())) {
				return ButtonEditPart.VISUAL_ID;
			}
			break;
		case AppbarAppbarListLabelsCompartment2EditPart.VISUAL_ID:
			if (UidiagramPackage.eINSTANCE.getLabel().isSuperTypeOf(domainElement.eClass())) {
				return LabelEditPart.VISUAL_ID;
			}
			break;
		case TabbarTabbarListButtonsCompartment2EditPart.VISUAL_ID:
			if (UidiagramPackage.eINSTANCE.getButton().isSuperTypeOf(domainElement.eClass())) {
				return Button2EditPart.VISUAL_ID;
			}
			break;
		case TabbarTabbarListLabelsCompartment2EditPart.VISUAL_ID:
			if (UidiagramPackage.eINSTANCE.getLabel().isSuperTypeOf(domainElement.eClass())) {
				return Label2EditPart.VISUAL_ID;
			}
			break;
		case ListViewListViewTemplateWidgetCompartment2EditPart.VISUAL_ID:
			if (UidiagramPackage.eINSTANCE.getGroup().isSuperTypeOf(domainElement.eClass())) {
				return Group5EditPart.VISUAL_ID;
			}
			if (UidiagramPackage.eINSTANCE.getGroupColumn().isSuperTypeOf(domainElement.eClass())) {
				return GroupColumn2EditPart.VISUAL_ID;
			}
			if (UidiagramPackage.eINSTANCE.getGroupRow().isSuperTypeOf(domainElement.eClass())) {
				return GroupRow3EditPart.VISUAL_ID;
			}
			if (UidiagramPackage.eINSTANCE.getAppbar().isSuperTypeOf(domainElement.eClass())) {
				return Appbar4EditPart.VISUAL_ID;
			}
			if (UidiagramPackage.eINSTANCE.getTabbar().isSuperTypeOf(domainElement.eClass())) {
				return Tabbar4EditPart.VISUAL_ID;
			}
			if (UidiagramPackage.eINSTANCE.getButton().isSuperTypeOf(domainElement.eClass())) {
				return Button6EditPart.VISUAL_ID;
			}
			if (UidiagramPackage.eINSTANCE.getLabel().isSuperTypeOf(domainElement.eClass())) {
				return Label6EditPart.VISUAL_ID;
			}
			if (UidiagramPackage.eINSTANCE.getCheckbox().isSuperTypeOf(domainElement.eClass())) {
				return Checkbox4EditPart.VISUAL_ID;
			}
			if (UidiagramPackage.eINSTANCE.getInput().isSuperTypeOf(domainElement.eClass())) {
				return Input4EditPart.VISUAL_ID;
			}
			if (UidiagramPackage.eINSTANCE.getListView().isSuperTypeOf(domainElement.eClass())) {
				return ListView4EditPart.VISUAL_ID;
			}
			if (UidiagramPackage.eINSTANCE.getRadioButton().isSuperTypeOf(domainElement.eClass())) {
				return RadioButton2EditPart.VISUAL_ID;
			}
			if (UidiagramPackage.eINSTANCE.getComboBox().isSuperTypeOf(domainElement.eClass())) {
				return ComboBox2EditPart.VISUAL_ID;
			}
			if (UidiagramPackage.eINSTANCE.getDatePicker().isSuperTypeOf(domainElement.eClass())) {
				return DatePicker2EditPart.VISUAL_ID;
			}
			if (UidiagramPackage.eINSTANCE.getSwitch().isSuperTypeOf(domainElement.eClass())) {
				return Switch2EditPart.VISUAL_ID;
			}
			if (UidiagramPackage.eINSTANCE.getTable().isSuperTypeOf(domainElement.eClass())) {
				return Table2EditPart.VISUAL_ID;
			}
			break;
		case GroupRowGroupRowListTemplateWidgetCompartment3EditPart.VISUAL_ID:
			if (UidiagramPackage.eINSTANCE.getGroup().isSuperTypeOf(domainElement.eClass())) {
				return Group4EditPart.VISUAL_ID;
			}
			if (UidiagramPackage.eINSTANCE.getGroupColumn().isSuperTypeOf(domainElement.eClass())) {
				return GroupColumn4EditPart.VISUAL_ID;
			}
			if (UidiagramPackage.eINSTANCE.getGroupRow().isSuperTypeOf(domainElement.eClass())) {
				return GroupRow4EditPart.VISUAL_ID;
			}
			if (UidiagramPackage.eINSTANCE.getAppbar().isSuperTypeOf(domainElement.eClass())) {
				return Appbar3EditPart.VISUAL_ID;
			}
			if (UidiagramPackage.eINSTANCE.getTabbar().isSuperTypeOf(domainElement.eClass())) {
				return Tabbar3EditPart.VISUAL_ID;
			}
			if (UidiagramPackage.eINSTANCE.getButton().isSuperTypeOf(domainElement.eClass())) {
				return Button5EditPart.VISUAL_ID;
			}
			if (UidiagramPackage.eINSTANCE.getLabel().isSuperTypeOf(domainElement.eClass())) {
				return Label5EditPart.VISUAL_ID;
			}
			if (UidiagramPackage.eINSTANCE.getCheckbox().isSuperTypeOf(domainElement.eClass())) {
				return Checkbox3EditPart.VISUAL_ID;
			}
			if (UidiagramPackage.eINSTANCE.getInput().isSuperTypeOf(domainElement.eClass())) {
				return Input3EditPart.VISUAL_ID;
			}
			if (UidiagramPackage.eINSTANCE.getListView().isSuperTypeOf(domainElement.eClass())) {
				return ListView3EditPart.VISUAL_ID;
			}
			if (UidiagramPackage.eINSTANCE.getRadioButton().isSuperTypeOf(domainElement.eClass())) {
				return RadioButton3EditPart.VISUAL_ID;
			}
			if (UidiagramPackage.eINSTANCE.getComboBox().isSuperTypeOf(domainElement.eClass())) {
				return ComboBox3EditPart.VISUAL_ID;
			}
			if (UidiagramPackage.eINSTANCE.getDatePicker().isSuperTypeOf(domainElement.eClass())) {
				return DatePicker3EditPart.VISUAL_ID;
			}
			if (UidiagramPackage.eINSTANCE.getSwitch().isSuperTypeOf(domainElement.eClass())) {
				return Switch3EditPart.VISUAL_ID;
			}
			if (UidiagramPackage.eINSTANCE.getTable().isSuperTypeOf(domainElement.eClass())) {
				return Table3EditPart.VISUAL_ID;
			}
			break;
		case GroupRowGroupRowListTemplateWidgetCompartment4EditPart.VISUAL_ID:
			if (UidiagramPackage.eINSTANCE.getGroup().isSuperTypeOf(domainElement.eClass())) {
				return Group4EditPart.VISUAL_ID;
			}
			if (UidiagramPackage.eINSTANCE.getGroupColumn().isSuperTypeOf(domainElement.eClass())) {
				return GroupColumn4EditPart.VISUAL_ID;
			}
			if (UidiagramPackage.eINSTANCE.getGroupRow().isSuperTypeOf(domainElement.eClass())) {
				return GroupRow4EditPart.VISUAL_ID;
			}
			if (UidiagramPackage.eINSTANCE.getAppbar().isSuperTypeOf(domainElement.eClass())) {
				return Appbar3EditPart.VISUAL_ID;
			}
			if (UidiagramPackage.eINSTANCE.getTabbar().isSuperTypeOf(domainElement.eClass())) {
				return Tabbar3EditPart.VISUAL_ID;
			}
			if (UidiagramPackage.eINSTANCE.getButton().isSuperTypeOf(domainElement.eClass())) {
				return Button5EditPart.VISUAL_ID;
			}
			if (UidiagramPackage.eINSTANCE.getLabel().isSuperTypeOf(domainElement.eClass())) {
				return Label5EditPart.VISUAL_ID;
			}
			if (UidiagramPackage.eINSTANCE.getCheckbox().isSuperTypeOf(domainElement.eClass())) {
				return Checkbox3EditPart.VISUAL_ID;
			}
			if (UidiagramPackage.eINSTANCE.getInput().isSuperTypeOf(domainElement.eClass())) {
				return Input3EditPart.VISUAL_ID;
			}
			if (UidiagramPackage.eINSTANCE.getListView().isSuperTypeOf(domainElement.eClass())) {
				return ListView3EditPart.VISUAL_ID;
			}
			if (UidiagramPackage.eINSTANCE.getRadioButton().isSuperTypeOf(domainElement.eClass())) {
				return RadioButton3EditPart.VISUAL_ID;
			}
			if (UidiagramPackage.eINSTANCE.getComboBox().isSuperTypeOf(domainElement.eClass())) {
				return ComboBox3EditPart.VISUAL_ID;
			}
			if (UidiagramPackage.eINSTANCE.getDatePicker().isSuperTypeOf(domainElement.eClass())) {
				return DatePicker3EditPart.VISUAL_ID;
			}
			if (UidiagramPackage.eINSTANCE.getSwitch().isSuperTypeOf(domainElement.eClass())) {
				return Switch3EditPart.VISUAL_ID;
			}
			if (UidiagramPackage.eINSTANCE.getTable().isSuperTypeOf(domainElement.eClass())) {
				return Table3EditPart.VISUAL_ID;
			}
			break;
		case AppbarAppbarListButtonsCompartment3EditPart.VISUAL_ID:
			if (UidiagramPackage.eINSTANCE.getButton().isSuperTypeOf(domainElement.eClass())) {
				return ButtonEditPart.VISUAL_ID;
			}
			break;
		case AppbarAppbarListLabelsCompartment3EditPart.VISUAL_ID:
			if (UidiagramPackage.eINSTANCE.getLabel().isSuperTypeOf(domainElement.eClass())) {
				return LabelEditPart.VISUAL_ID;
			}
			break;
		case TabbarTabbarListButtonsCompartment3EditPart.VISUAL_ID:
			if (UidiagramPackage.eINSTANCE.getButton().isSuperTypeOf(domainElement.eClass())) {
				return Button2EditPart.VISUAL_ID;
			}
			break;
		case TabbarTabbarListLabelsCompartment3EditPart.VISUAL_ID:
			if (UidiagramPackage.eINSTANCE.getLabel().isSuperTypeOf(domainElement.eClass())) {
				return Label2EditPart.VISUAL_ID;
			}
			break;
		case ListViewListViewTemplateWidgetCompartment3EditPart.VISUAL_ID:
			if (UidiagramPackage.eINSTANCE.getGroup().isSuperTypeOf(domainElement.eClass())) {
				return Group5EditPart.VISUAL_ID;
			}
			if (UidiagramPackage.eINSTANCE.getGroupColumn().isSuperTypeOf(domainElement.eClass())) {
				return GroupColumn2EditPart.VISUAL_ID;
			}
			if (UidiagramPackage.eINSTANCE.getGroupRow().isSuperTypeOf(domainElement.eClass())) {
				return GroupRow3EditPart.VISUAL_ID;
			}
			if (UidiagramPackage.eINSTANCE.getAppbar().isSuperTypeOf(domainElement.eClass())) {
				return Appbar4EditPart.VISUAL_ID;
			}
			if (UidiagramPackage.eINSTANCE.getTabbar().isSuperTypeOf(domainElement.eClass())) {
				return Tabbar4EditPart.VISUAL_ID;
			}
			if (UidiagramPackage.eINSTANCE.getButton().isSuperTypeOf(domainElement.eClass())) {
				return Button6EditPart.VISUAL_ID;
			}
			if (UidiagramPackage.eINSTANCE.getLabel().isSuperTypeOf(domainElement.eClass())) {
				return Label6EditPart.VISUAL_ID;
			}
			if (UidiagramPackage.eINSTANCE.getCheckbox().isSuperTypeOf(domainElement.eClass())) {
				return Checkbox4EditPart.VISUAL_ID;
			}
			if (UidiagramPackage.eINSTANCE.getInput().isSuperTypeOf(domainElement.eClass())) {
				return Input4EditPart.VISUAL_ID;
			}
			if (UidiagramPackage.eINSTANCE.getListView().isSuperTypeOf(domainElement.eClass())) {
				return ListView4EditPart.VISUAL_ID;
			}
			if (UidiagramPackage.eINSTANCE.getRadioButton().isSuperTypeOf(domainElement.eClass())) {
				return RadioButton2EditPart.VISUAL_ID;
			}
			if (UidiagramPackage.eINSTANCE.getComboBox().isSuperTypeOf(domainElement.eClass())) {
				return ComboBox2EditPart.VISUAL_ID;
			}
			if (UidiagramPackage.eINSTANCE.getDatePicker().isSuperTypeOf(domainElement.eClass())) {
				return DatePicker2EditPart.VISUAL_ID;
			}
			if (UidiagramPackage.eINSTANCE.getSwitch().isSuperTypeOf(domainElement.eClass())) {
				return Switch2EditPart.VISUAL_ID;
			}
			if (UidiagramPackage.eINSTANCE.getTable().isSuperTypeOf(domainElement.eClass())) {
				return Table2EditPart.VISUAL_ID;
			}
			break;
		case AppbarAppbarListButtonsCompartment4EditPart.VISUAL_ID:
			if (UidiagramPackage.eINSTANCE.getButton().isSuperTypeOf(domainElement.eClass())) {
				return ButtonEditPart.VISUAL_ID;
			}
			break;
		case AppbarAppbarListLabelsCompartment4EditPart.VISUAL_ID:
			if (UidiagramPackage.eINSTANCE.getLabel().isSuperTypeOf(domainElement.eClass())) {
				return LabelEditPart.VISUAL_ID;
			}
			break;
		case TabbarTabbarListButtonsCompartment4EditPart.VISUAL_ID:
			if (UidiagramPackage.eINSTANCE.getButton().isSuperTypeOf(domainElement.eClass())) {
				return Button2EditPart.VISUAL_ID;
			}
			break;
		case TabbarTabbarListLabelsCompartment4EditPart.VISUAL_ID:
			if (UidiagramPackage.eINSTANCE.getLabel().isSuperTypeOf(domainElement.eClass())) {
				return Label2EditPart.VISUAL_ID;
			}
			break;
		case ListViewListViewTemplateWidgetCompartment4EditPart.VISUAL_ID:
			if (UidiagramPackage.eINSTANCE.getGroup().isSuperTypeOf(domainElement.eClass())) {
				return Group5EditPart.VISUAL_ID;
			}
			if (UidiagramPackage.eINSTANCE.getGroupColumn().isSuperTypeOf(domainElement.eClass())) {
				return GroupColumn2EditPart.VISUAL_ID;
			}
			if (UidiagramPackage.eINSTANCE.getGroupRow().isSuperTypeOf(domainElement.eClass())) {
				return GroupRow3EditPart.VISUAL_ID;
			}
			if (UidiagramPackage.eINSTANCE.getAppbar().isSuperTypeOf(domainElement.eClass())) {
				return Appbar4EditPart.VISUAL_ID;
			}
			if (UidiagramPackage.eINSTANCE.getTabbar().isSuperTypeOf(domainElement.eClass())) {
				return Tabbar4EditPart.VISUAL_ID;
			}
			if (UidiagramPackage.eINSTANCE.getButton().isSuperTypeOf(domainElement.eClass())) {
				return Button6EditPart.VISUAL_ID;
			}
			if (UidiagramPackage.eINSTANCE.getLabel().isSuperTypeOf(domainElement.eClass())) {
				return Label6EditPart.VISUAL_ID;
			}
			if (UidiagramPackage.eINSTANCE.getCheckbox().isSuperTypeOf(domainElement.eClass())) {
				return Checkbox4EditPart.VISUAL_ID;
			}
			if (UidiagramPackage.eINSTANCE.getInput().isSuperTypeOf(domainElement.eClass())) {
				return Input4EditPart.VISUAL_ID;
			}
			if (UidiagramPackage.eINSTANCE.getListView().isSuperTypeOf(domainElement.eClass())) {
				return ListView4EditPart.VISUAL_ID;
			}
			if (UidiagramPackage.eINSTANCE.getRadioButton().isSuperTypeOf(domainElement.eClass())) {
				return RadioButton2EditPart.VISUAL_ID;
			}
			if (UidiagramPackage.eINSTANCE.getComboBox().isSuperTypeOf(domainElement.eClass())) {
				return ComboBox2EditPart.VISUAL_ID;
			}
			if (UidiagramPackage.eINSTANCE.getDatePicker().isSuperTypeOf(domainElement.eClass())) {
				return DatePicker2EditPart.VISUAL_ID;
			}
			if (UidiagramPackage.eINSTANCE.getSwitch().isSuperTypeOf(domainElement.eClass())) {
				return Switch2EditPart.VISUAL_ID;
			}
			if (UidiagramPackage.eINSTANCE.getTable().isSuperTypeOf(domainElement.eClass())) {
				return Table2EditPart.VISUAL_ID;
			}
			break;
		case TableTableListCoulmnsCompartment2EditPart.VISUAL_ID:
			if (UidiagramPackage.eINSTANCE.getColumn().isSuperTypeOf(domainElement.eClass())) {
				return ColumnEditPart.VISUAL_ID;
			}
			break;
		case TableTableListCoulmnsCompartment3EditPart.VISUAL_ID:
			if (UidiagramPackage.eINSTANCE.getColumn().isSuperTypeOf(domainElement.eClass())) {
				return ColumnEditPart.VISUAL_ID;
			}
			break;
		case TableTableListCoulmnsCompartment4EditPart.VISUAL_ID:
			if (UidiagramPackage.eINSTANCE.getColumn().isSuperTypeOf(domainElement.eClass())) {
				return ColumnEditPart.VISUAL_ID;
			}
			break;
		case GroupColumnGroupColumnListTemplateWidgetCompartment5EditPart.VISUAL_ID:
			if (UidiagramPackage.eINSTANCE.getGroup().isSuperTypeOf(domainElement.eClass())) {
				return Group3EditPart.VISUAL_ID;
			}
			if (UidiagramPackage.eINSTANCE.getGroupColumn().isSuperTypeOf(domainElement.eClass())) {
				return GroupColumn3EditPart.VISUAL_ID;
			}
			if (UidiagramPackage.eINSTANCE.getGroupRow().isSuperTypeOf(domainElement.eClass())) {
				return GroupRow2EditPart.VISUAL_ID;
			}
			if (UidiagramPackage.eINSTANCE.getAppbar().isSuperTypeOf(domainElement.eClass())) {
				return Appbar2EditPart.VISUAL_ID;
			}
			if (UidiagramPackage.eINSTANCE.getTabbar().isSuperTypeOf(domainElement.eClass())) {
				return Tabbar2EditPart.VISUAL_ID;
			}
			if (UidiagramPackage.eINSTANCE.getButton().isSuperTypeOf(domainElement.eClass())) {
				return Button4EditPart.VISUAL_ID;
			}
			if (UidiagramPackage.eINSTANCE.getLabel().isSuperTypeOf(domainElement.eClass())) {
				return Label4EditPart.VISUAL_ID;
			}
			if (UidiagramPackage.eINSTANCE.getCheckbox().isSuperTypeOf(domainElement.eClass())) {
				return Checkbox2EditPart.VISUAL_ID;
			}
			if (UidiagramPackage.eINSTANCE.getInput().isSuperTypeOf(domainElement.eClass())) {
				return Input2EditPart.VISUAL_ID;
			}
			if (UidiagramPackage.eINSTANCE.getListView().isSuperTypeOf(domainElement.eClass())) {
				return ListView2EditPart.VISUAL_ID;
			}
			if (UidiagramPackage.eINSTANCE.getRadioButton().isSuperTypeOf(domainElement.eClass())) {
				return RadioButton4EditPart.VISUAL_ID;
			}
			if (UidiagramPackage.eINSTANCE.getComboBox().isSuperTypeOf(domainElement.eClass())) {
				return ComboBox4EditPart.VISUAL_ID;
			}
			if (UidiagramPackage.eINSTANCE.getDatePicker().isSuperTypeOf(domainElement.eClass())) {
				return DatePicker4EditPart.VISUAL_ID;
			}
			if (UidiagramPackage.eINSTANCE.getSwitch().isSuperTypeOf(domainElement.eClass())) {
				return Switch4EditPart.VISUAL_ID;
			}
			if (UidiagramPackage.eINSTANCE.getTable().isSuperTypeOf(domainElement.eClass())) {
				return Table4EditPart.VISUAL_ID;
			}
			break;
		case GroupRowGroupRowListTemplateWidgetCompartment5EditPart.VISUAL_ID:
			if (UidiagramPackage.eINSTANCE.getGroup().isSuperTypeOf(domainElement.eClass())) {
				return Group4EditPart.VISUAL_ID;
			}
			if (UidiagramPackage.eINSTANCE.getGroupColumn().isSuperTypeOf(domainElement.eClass())) {
				return GroupColumn4EditPart.VISUAL_ID;
			}
			if (UidiagramPackage.eINSTANCE.getGroupRow().isSuperTypeOf(domainElement.eClass())) {
				return GroupRow4EditPart.VISUAL_ID;
			}
			if (UidiagramPackage.eINSTANCE.getAppbar().isSuperTypeOf(domainElement.eClass())) {
				return Appbar3EditPart.VISUAL_ID;
			}
			if (UidiagramPackage.eINSTANCE.getTabbar().isSuperTypeOf(domainElement.eClass())) {
				return Tabbar3EditPart.VISUAL_ID;
			}
			if (UidiagramPackage.eINSTANCE.getButton().isSuperTypeOf(domainElement.eClass())) {
				return Button5EditPart.VISUAL_ID;
			}
			if (UidiagramPackage.eINSTANCE.getLabel().isSuperTypeOf(domainElement.eClass())) {
				return Label5EditPart.VISUAL_ID;
			}
			if (UidiagramPackage.eINSTANCE.getCheckbox().isSuperTypeOf(domainElement.eClass())) {
				return Checkbox3EditPart.VISUAL_ID;
			}
			if (UidiagramPackage.eINSTANCE.getInput().isSuperTypeOf(domainElement.eClass())) {
				return Input3EditPart.VISUAL_ID;
			}
			if (UidiagramPackage.eINSTANCE.getListView().isSuperTypeOf(domainElement.eClass())) {
				return ListView3EditPart.VISUAL_ID;
			}
			if (UidiagramPackage.eINSTANCE.getRadioButton().isSuperTypeOf(domainElement.eClass())) {
				return RadioButton3EditPart.VISUAL_ID;
			}
			if (UidiagramPackage.eINSTANCE.getComboBox().isSuperTypeOf(domainElement.eClass())) {
				return ComboBox3EditPart.VISUAL_ID;
			}
			if (UidiagramPackage.eINSTANCE.getDatePicker().isSuperTypeOf(domainElement.eClass())) {
				return DatePicker3EditPart.VISUAL_ID;
			}
			if (UidiagramPackage.eINSTANCE.getSwitch().isSuperTypeOf(domainElement.eClass())) {
				return Switch3EditPart.VISUAL_ID;
			}
			if (UidiagramPackage.eINSTANCE.getTable().isSuperTypeOf(domainElement.eClass())) {
				return Table3EditPart.VISUAL_ID;
			}
			break;
		case AppbarAppbarListButtonsCompartment5EditPart.VISUAL_ID:
			if (UidiagramPackage.eINSTANCE.getButton().isSuperTypeOf(domainElement.eClass())) {
				return ButtonEditPart.VISUAL_ID;
			}
			break;
		case AppbarAppbarListLabelsCompartment5EditPart.VISUAL_ID:
			if (UidiagramPackage.eINSTANCE.getLabel().isSuperTypeOf(domainElement.eClass())) {
				return LabelEditPart.VISUAL_ID;
			}
			break;
		case TabbarTabbarListButtonsCompartment5EditPart.VISUAL_ID:
			if (UidiagramPackage.eINSTANCE.getButton().isSuperTypeOf(domainElement.eClass())) {
				return Button2EditPart.VISUAL_ID;
			}
			break;
		case TabbarTabbarListLabelsCompartment5EditPart.VISUAL_ID:
			if (UidiagramPackage.eINSTANCE.getLabel().isSuperTypeOf(domainElement.eClass())) {
				return Label2EditPart.VISUAL_ID;
			}
			break;
		case ListViewListViewTemplateWidgetCompartment5EditPart.VISUAL_ID:
			if (UidiagramPackage.eINSTANCE.getGroup().isSuperTypeOf(domainElement.eClass())) {
				return Group5EditPart.VISUAL_ID;
			}
			if (UidiagramPackage.eINSTANCE.getGroupColumn().isSuperTypeOf(domainElement.eClass())) {
				return GroupColumn2EditPart.VISUAL_ID;
			}
			if (UidiagramPackage.eINSTANCE.getGroupRow().isSuperTypeOf(domainElement.eClass())) {
				return GroupRow3EditPart.VISUAL_ID;
			}
			if (UidiagramPackage.eINSTANCE.getAppbar().isSuperTypeOf(domainElement.eClass())) {
				return Appbar4EditPart.VISUAL_ID;
			}
			if (UidiagramPackage.eINSTANCE.getTabbar().isSuperTypeOf(domainElement.eClass())) {
				return Tabbar4EditPart.VISUAL_ID;
			}
			if (UidiagramPackage.eINSTANCE.getButton().isSuperTypeOf(domainElement.eClass())) {
				return Button6EditPart.VISUAL_ID;
			}
			if (UidiagramPackage.eINSTANCE.getLabel().isSuperTypeOf(domainElement.eClass())) {
				return Label6EditPart.VISUAL_ID;
			}
			if (UidiagramPackage.eINSTANCE.getCheckbox().isSuperTypeOf(domainElement.eClass())) {
				return Checkbox4EditPart.VISUAL_ID;
			}
			if (UidiagramPackage.eINSTANCE.getInput().isSuperTypeOf(domainElement.eClass())) {
				return Input4EditPart.VISUAL_ID;
			}
			if (UidiagramPackage.eINSTANCE.getListView().isSuperTypeOf(domainElement.eClass())) {
				return ListView4EditPart.VISUAL_ID;
			}
			if (UidiagramPackage.eINSTANCE.getRadioButton().isSuperTypeOf(domainElement.eClass())) {
				return RadioButton2EditPart.VISUAL_ID;
			}
			if (UidiagramPackage.eINSTANCE.getComboBox().isSuperTypeOf(domainElement.eClass())) {
				return ComboBox2EditPart.VISUAL_ID;
			}
			if (UidiagramPackage.eINSTANCE.getDatePicker().isSuperTypeOf(domainElement.eClass())) {
				return DatePicker2EditPart.VISUAL_ID;
			}
			if (UidiagramPackage.eINSTANCE.getSwitch().isSuperTypeOf(domainElement.eClass())) {
				return Switch2EditPart.VISUAL_ID;
			}
			if (UidiagramPackage.eINSTANCE.getTable().isSuperTypeOf(domainElement.eClass())) {
				return Table2EditPart.VISUAL_ID;
			}
			break;
		case TableTableListCoulmnsCompartment5EditPart.VISUAL_ID:
			if (UidiagramPackage.eINSTANCE.getColumn().isSuperTypeOf(domainElement.eClass())) {
				return ColumnEditPart.VISUAL_ID;
			}
			break;
		}
		return -1;
	}

	/**
	* @generated
	*/
	public static boolean canCreateNode(View containerView, int nodeVisualID) {
		String containerModelID = uidiagram.diagram.part.UidiagramVisualIDRegistry.getModelID(containerView);
		if (!UIDiagramEditPart.MODEL_ID.equals(containerModelID) && !"uidiagram".equals(containerModelID)) { //$NON-NLS-1$
			return false;
		}
		int containerVisualID;
		if (UIDiagramEditPart.MODEL_ID.equals(containerModelID)) {
			containerVisualID = uidiagram.diagram.part.UidiagramVisualIDRegistry.getVisualID(containerView);
		} else {
			if (containerView instanceof Diagram) {
				containerVisualID = UIDiagramEditPart.VISUAL_ID;
			} else {
				return false;
			}
		}
		switch (containerVisualID) {
		case UIDiagramEditPart.VISUAL_ID:
			if (UserInterfaceEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case UserInterfaceEditPart.VISUAL_ID:
			if (UserInterfaceNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (UserInterfaceUserInterfaceListTemplateWidgetCompartmentEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case GroupEditPart.VISUAL_ID:
			if (GroupNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (GroupGroupTemplateWidgetCompartmentEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case Group2EditPart.VISUAL_ID:
			if (GroupName2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (GroupGroupTemplateWidgetCompartment2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case GroupColumnEditPart.VISUAL_ID:
			if (GroupColumnNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (GroupColumnGroupColumnListTemplateWidgetCompartmentEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case Group3EditPart.VISUAL_ID:
			if (GroupName3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (GroupGroupTemplateWidgetCompartment3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case GroupRowEditPart.VISUAL_ID:
			if (GroupRowNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (GroupRowGroupRowListTemplateWidgetCompartmentEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case Group4EditPart.VISUAL_ID:
			if (GroupName4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (GroupGroupTemplateWidgetCompartment4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case AppbarEditPart.VISUAL_ID:
			if (AppbarNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (AppbarAppbarListButtonsCompartmentEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (AppbarAppbarListLabelsCompartmentEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ButtonEditPart.VISUAL_ID:
			if (ButtonNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case LabelEditPart.VISUAL_ID:
			if (LabelNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case TabbarEditPart.VISUAL_ID:
			if (TabbarNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (TabbarTabbarListButtonsCompartmentEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (TabbarTabbarListLabelsCompartmentEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case Button2EditPart.VISUAL_ID:
			if (ButtonName2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case Label2EditPart.VISUAL_ID:
			if (LabelName2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case Button3EditPart.VISUAL_ID:
			if (ButtonName3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case Label3EditPart.VISUAL_ID:
			if (LabelName3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case CheckboxEditPart.VISUAL_ID:
			if (CheckboxNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case InputEditPart.VISUAL_ID:
			if (InputNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ListViewEditPart.VISUAL_ID:
			if (ListViewNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ListViewListViewTemplateWidgetCompartmentEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case Group5EditPart.VISUAL_ID:
			if (GroupName5EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (GroupGroupTemplateWidgetCompartment5EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case RadioButtonEditPart.VISUAL_ID:
			if (RadioButtonNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ComboBoxEditPart.VISUAL_ID:
			if (ComboBoxNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case DatePickerEditPart.VISUAL_ID:
			if (DatePickerNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case SwitchEditPart.VISUAL_ID:
			if (SwitchNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case TableEditPart.VISUAL_ID:
			if (TableNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (TableTableListCoulmnsCompartmentEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ColumnEditPart.VISUAL_ID:
			if (ColumnNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case GroupColumn2EditPart.VISUAL_ID:
			if (GroupColumnName2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (GroupColumnGroupColumnListTemplateWidgetCompartment2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case GroupColumn3EditPart.VISUAL_ID:
			if (GroupColumnName3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (GroupColumnGroupColumnListTemplateWidgetCompartment3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case GroupRow2EditPart.VISUAL_ID:
			if (GroupRowName2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (GroupRowGroupRowListTemplateWidgetCompartment2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case GroupColumn4EditPart.VISUAL_ID:
			if (GroupColumnName4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (GroupColumnGroupColumnListTemplateWidgetCompartment4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case Appbar2EditPart.VISUAL_ID:
			if (AppbarName2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (AppbarAppbarListButtonsCompartment2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (AppbarAppbarListLabelsCompartment2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case Tabbar2EditPart.VISUAL_ID:
			if (TabbarName2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (TabbarTabbarListButtonsCompartment2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (TabbarTabbarListLabelsCompartment2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case Button4EditPart.VISUAL_ID:
			if (ButtonName4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case Label4EditPart.VISUAL_ID:
			if (LabelName4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case Checkbox2EditPart.VISUAL_ID:
			if (CheckboxName2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case Input2EditPart.VISUAL_ID:
			if (InputName2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ListView2EditPart.VISUAL_ID:
			if (ListViewName2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ListViewListViewTemplateWidgetCompartment2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case GroupRow3EditPart.VISUAL_ID:
			if (GroupRowName3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (GroupRowGroupRowListTemplateWidgetCompartment3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case GroupRow4EditPart.VISUAL_ID:
			if (GroupRowName4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (GroupRowGroupRowListTemplateWidgetCompartment4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case Appbar3EditPart.VISUAL_ID:
			if (AppbarName3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (AppbarAppbarListButtonsCompartment3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (AppbarAppbarListLabelsCompartment3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case Tabbar3EditPart.VISUAL_ID:
			if (TabbarName3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (TabbarTabbarListButtonsCompartment3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (TabbarTabbarListLabelsCompartment3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case Button5EditPart.VISUAL_ID:
			if (ButtonName5EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case Label5EditPart.VISUAL_ID:
			if (LabelName5EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case Checkbox3EditPart.VISUAL_ID:
			if (CheckboxName3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case Input3EditPart.VISUAL_ID:
			if (InputName3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ListView3EditPart.VISUAL_ID:
			if (ListViewName3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ListViewListViewTemplateWidgetCompartment3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case Appbar4EditPart.VISUAL_ID:
			if (AppbarName4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (AppbarAppbarListButtonsCompartment4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (AppbarAppbarListLabelsCompartment4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case Tabbar4EditPart.VISUAL_ID:
			if (TabbarName4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (TabbarTabbarListButtonsCompartment4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (TabbarTabbarListLabelsCompartment4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case Button6EditPart.VISUAL_ID:
			if (ButtonName6EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case Label6EditPart.VISUAL_ID:
			if (LabelName6EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case Checkbox4EditPart.VISUAL_ID:
			if (CheckboxName4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case Input4EditPart.VISUAL_ID:
			if (InputName4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ListView4EditPart.VISUAL_ID:
			if (ListViewName4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ListViewListViewTemplateWidgetCompartment4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case RadioButton2EditPart.VISUAL_ID:
			if (RadioButtonName2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ComboBox2EditPart.VISUAL_ID:
			if (ComboBoxName2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case DatePicker2EditPart.VISUAL_ID:
			if (DatePickerName2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case Switch2EditPart.VISUAL_ID:
			if (SwitchName2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case Table2EditPart.VISUAL_ID:
			if (TableName2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (TableTableListCoulmnsCompartment2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case RadioButton3EditPart.VISUAL_ID:
			if (RadioButtonName3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ComboBox3EditPart.VISUAL_ID:
			if (ComboBoxName3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case DatePicker3EditPart.VISUAL_ID:
			if (DatePickerName3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case Switch3EditPart.VISUAL_ID:
			if (SwitchName3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case Table3EditPart.VISUAL_ID:
			if (TableName3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (TableTableListCoulmnsCompartment3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case RadioButton4EditPart.VISUAL_ID:
			if (RadioButtonName4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ComboBox4EditPart.VISUAL_ID:
			if (ComboBoxName4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case DatePicker4EditPart.VISUAL_ID:
			if (DatePickerName4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case Switch4EditPart.VISUAL_ID:
			if (SwitchName4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case Table4EditPart.VISUAL_ID:
			if (TableName4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (TableTableListCoulmnsCompartment4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case GroupColumn5EditPart.VISUAL_ID:
			if (GroupColumnName5EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (GroupColumnGroupColumnListTemplateWidgetCompartment5EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case GroupRow5EditPart.VISUAL_ID:
			if (GroupRowName5EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (GroupRowGroupRowListTemplateWidgetCompartment5EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case Appbar5EditPart.VISUAL_ID:
			if (AppbarName5EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (AppbarAppbarListButtonsCompartment5EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (AppbarAppbarListLabelsCompartment5EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case Tabbar5EditPart.VISUAL_ID:
			if (TabbarName5EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (TabbarTabbarListButtonsCompartment5EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (TabbarTabbarListLabelsCompartment5EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case Button7EditPart.VISUAL_ID:
			if (ButtonName7EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case Label7EditPart.VISUAL_ID:
			if (LabelName7EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case Checkbox5EditPart.VISUAL_ID:
			if (CheckboxName5EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case Input5EditPart.VISUAL_ID:
			if (InputName5EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ListView5EditPart.VISUAL_ID:
			if (ListViewName5EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ListViewListViewTemplateWidgetCompartment5EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case RadioButton5EditPart.VISUAL_ID:
			if (RadioButtonName5EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ComboBox5EditPart.VISUAL_ID:
			if (ComboBoxName5EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case DatePicker5EditPart.VISUAL_ID:
			if (DatePickerName5EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case Switch5EditPart.VISUAL_ID:
			if (SwitchName5EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case Table5EditPart.VISUAL_ID:
			if (TableName5EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (TableTableListCoulmnsCompartment5EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case UserInterfaceUserInterfaceListTemplateWidgetCompartmentEditPart.VISUAL_ID:
			if (GroupEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (GroupColumn5EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (GroupRow5EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Appbar5EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Tabbar5EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Button7EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Label7EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Checkbox5EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Input5EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ListView5EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (RadioButton5EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ComboBox5EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (DatePicker5EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Switch5EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Table5EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case GroupGroupTemplateWidgetCompartmentEditPart.VISUAL_ID:
			if (Group2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (GroupColumnEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (GroupRowEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (AppbarEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (TabbarEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Button3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Label3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (CheckboxEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (InputEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ListViewEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (RadioButtonEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ComboBoxEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (DatePickerEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (SwitchEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (TableEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case GroupGroupTemplateWidgetCompartment2EditPart.VISUAL_ID:
			if (Group2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (GroupColumnEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (GroupRowEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (AppbarEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (TabbarEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Button3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Label3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (CheckboxEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (InputEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ListViewEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (RadioButtonEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ComboBoxEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (DatePickerEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (SwitchEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (TableEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case GroupColumnGroupColumnListTemplateWidgetCompartmentEditPart.VISUAL_ID:
			if (Group3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (GroupColumn3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (GroupRow2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Appbar2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Tabbar2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Button4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Label4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Checkbox2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Input2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ListView2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (RadioButton4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ComboBox4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (DatePicker4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Switch4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Table4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case GroupGroupTemplateWidgetCompartment3EditPart.VISUAL_ID:
			if (Group2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (GroupColumnEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (GroupRowEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (AppbarEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (TabbarEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Button3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Label3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (CheckboxEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (InputEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ListViewEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (RadioButtonEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ComboBoxEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (DatePickerEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (SwitchEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (TableEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case GroupRowGroupRowListTemplateWidgetCompartmentEditPart.VISUAL_ID:
			if (Group4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (GroupColumn4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (GroupRow4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Appbar3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Tabbar3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Button5EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Label5EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Checkbox3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Input3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ListView3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (RadioButton3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ComboBox3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (DatePicker3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Switch3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Table3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case GroupGroupTemplateWidgetCompartment4EditPart.VISUAL_ID:
			if (Group2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (GroupColumnEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (GroupRowEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (AppbarEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (TabbarEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Button3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Label3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (CheckboxEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (InputEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ListViewEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (RadioButtonEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ComboBoxEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (DatePickerEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (SwitchEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (TableEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case AppbarAppbarListButtonsCompartmentEditPart.VISUAL_ID:
			if (ButtonEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case AppbarAppbarListLabelsCompartmentEditPart.VISUAL_ID:
			if (LabelEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case TabbarTabbarListButtonsCompartmentEditPart.VISUAL_ID:
			if (Button2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case TabbarTabbarListLabelsCompartmentEditPart.VISUAL_ID:
			if (Label2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ListViewListViewTemplateWidgetCompartmentEditPart.VISUAL_ID:
			if (Group5EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (GroupColumn2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (GroupRow3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Appbar4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Tabbar4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Button6EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Label6EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Checkbox4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Input4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ListView4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (RadioButton2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ComboBox2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (DatePicker2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Switch2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Table2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case GroupGroupTemplateWidgetCompartment5EditPart.VISUAL_ID:
			if (Group2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (GroupColumnEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (GroupRowEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (AppbarEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (TabbarEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Button3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Label3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (CheckboxEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (InputEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ListViewEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (RadioButtonEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ComboBoxEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (DatePickerEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (SwitchEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (TableEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case TableTableListCoulmnsCompartmentEditPart.VISUAL_ID:
			if (ColumnEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case GroupColumnGroupColumnListTemplateWidgetCompartment2EditPart.VISUAL_ID:
			if (Group3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (GroupColumn3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (GroupRow2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Appbar2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Tabbar2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Button4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Label4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Checkbox2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Input2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ListView2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (RadioButton4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ComboBox4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (DatePicker4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Switch4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Table4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case GroupColumnGroupColumnListTemplateWidgetCompartment3EditPart.VISUAL_ID:
			if (Group3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (GroupColumn3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (GroupRow2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Appbar2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Tabbar2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Button4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Label4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Checkbox2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Input2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ListView2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (RadioButton4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ComboBox4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (DatePicker4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Switch4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Table4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case GroupRowGroupRowListTemplateWidgetCompartment2EditPart.VISUAL_ID:
			if (Group4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (GroupColumn4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (GroupRow4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Appbar3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Tabbar3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Button5EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Label5EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Checkbox3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Input3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ListView3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (RadioButton3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ComboBox3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (DatePicker3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Switch3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Table3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case GroupColumnGroupColumnListTemplateWidgetCompartment4EditPart.VISUAL_ID:
			if (Group3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (GroupColumn3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (GroupRow2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Appbar2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Tabbar2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Button4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Label4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Checkbox2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Input2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ListView2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (RadioButton4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ComboBox4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (DatePicker4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Switch4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Table4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case AppbarAppbarListButtonsCompartment2EditPart.VISUAL_ID:
			if (ButtonEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case AppbarAppbarListLabelsCompartment2EditPart.VISUAL_ID:
			if (LabelEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case TabbarTabbarListButtonsCompartment2EditPart.VISUAL_ID:
			if (Button2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case TabbarTabbarListLabelsCompartment2EditPart.VISUAL_ID:
			if (Label2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ListViewListViewTemplateWidgetCompartment2EditPart.VISUAL_ID:
			if (Group5EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (GroupColumn2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (GroupRow3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Appbar4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Tabbar4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Button6EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Label6EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Checkbox4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Input4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ListView4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (RadioButton2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ComboBox2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (DatePicker2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Switch2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Table2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case GroupRowGroupRowListTemplateWidgetCompartment3EditPart.VISUAL_ID:
			if (Group4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (GroupColumn4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (GroupRow4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Appbar3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Tabbar3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Button5EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Label5EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Checkbox3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Input3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ListView3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (RadioButton3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ComboBox3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (DatePicker3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Switch3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Table3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case GroupRowGroupRowListTemplateWidgetCompartment4EditPart.VISUAL_ID:
			if (Group4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (GroupColumn4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (GroupRow4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Appbar3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Tabbar3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Button5EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Label5EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Checkbox3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Input3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ListView3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (RadioButton3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ComboBox3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (DatePicker3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Switch3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Table3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case AppbarAppbarListButtonsCompartment3EditPart.VISUAL_ID:
			if (ButtonEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case AppbarAppbarListLabelsCompartment3EditPart.VISUAL_ID:
			if (LabelEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case TabbarTabbarListButtonsCompartment3EditPart.VISUAL_ID:
			if (Button2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case TabbarTabbarListLabelsCompartment3EditPart.VISUAL_ID:
			if (Label2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ListViewListViewTemplateWidgetCompartment3EditPart.VISUAL_ID:
			if (Group5EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (GroupColumn2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (GroupRow3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Appbar4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Tabbar4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Button6EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Label6EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Checkbox4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Input4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ListView4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (RadioButton2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ComboBox2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (DatePicker2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Switch2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Table2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case AppbarAppbarListButtonsCompartment4EditPart.VISUAL_ID:
			if (ButtonEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case AppbarAppbarListLabelsCompartment4EditPart.VISUAL_ID:
			if (LabelEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case TabbarTabbarListButtonsCompartment4EditPart.VISUAL_ID:
			if (Button2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case TabbarTabbarListLabelsCompartment4EditPart.VISUAL_ID:
			if (Label2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ListViewListViewTemplateWidgetCompartment4EditPart.VISUAL_ID:
			if (Group5EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (GroupColumn2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (GroupRow3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Appbar4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Tabbar4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Button6EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Label6EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Checkbox4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Input4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ListView4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (RadioButton2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ComboBox2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (DatePicker2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Switch2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Table2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case TableTableListCoulmnsCompartment2EditPart.VISUAL_ID:
			if (ColumnEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case TableTableListCoulmnsCompartment3EditPart.VISUAL_ID:
			if (ColumnEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case TableTableListCoulmnsCompartment4EditPart.VISUAL_ID:
			if (ColumnEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case GroupColumnGroupColumnListTemplateWidgetCompartment5EditPart.VISUAL_ID:
			if (Group3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (GroupColumn3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (GroupRow2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Appbar2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Tabbar2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Button4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Label4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Checkbox2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Input2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ListView2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (RadioButton4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ComboBox4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (DatePicker4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Switch4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Table4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case GroupRowGroupRowListTemplateWidgetCompartment5EditPart.VISUAL_ID:
			if (Group4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (GroupColumn4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (GroupRow4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Appbar3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Tabbar3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Button5EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Label5EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Checkbox3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Input3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ListView3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (RadioButton3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ComboBox3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (DatePicker3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Switch3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Table3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case AppbarAppbarListButtonsCompartment5EditPart.VISUAL_ID:
			if (ButtonEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case AppbarAppbarListLabelsCompartment5EditPart.VISUAL_ID:
			if (LabelEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case TabbarTabbarListButtonsCompartment5EditPart.VISUAL_ID:
			if (Button2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case TabbarTabbarListLabelsCompartment5EditPart.VISUAL_ID:
			if (Label2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ListViewListViewTemplateWidgetCompartment5EditPart.VISUAL_ID:
			if (Group5EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (GroupColumn2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (GroupRow3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Appbar4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Tabbar4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Button6EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Label6EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Checkbox4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Input4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ListView4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (RadioButton2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ComboBox2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (DatePicker2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Switch2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Table2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case TableTableListCoulmnsCompartment5EditPart.VISUAL_ID:
			if (ColumnEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		}
		return false;
	}

	/**
	* @generated
	*/
	public static int getLinkWithClassVisualID(EObject domainElement) {
		if (domainElement == null) {
			return -1;
		}
		return -1;
	}

	/**
	* User can change implementation of this method to handle some specific
	* situations not covered by default logic.
	* 
	* @generated
	*/
	private static boolean isDiagram(UIDiagram element) {
		return true;
	}

	/**
	* @generated
	*/
	public static boolean checkNodeVisualID(View containerView, EObject domainElement, int candidate) {
		if (candidate == -1) {
			//unrecognized id is always bad
			return false;
		}
		int basic = getNodeVisualID(containerView, domainElement);
		return basic == candidate;
	}

	/**
	* @generated
	*/
	public static boolean isCompartmentVisualID(int visualID) {
		switch (visualID) {
		case UserInterfaceUserInterfaceListTemplateWidgetCompartmentEditPart.VISUAL_ID:
		case GroupGroupTemplateWidgetCompartmentEditPart.VISUAL_ID:
		case GroupGroupTemplateWidgetCompartment2EditPart.VISUAL_ID:
		case GroupColumnGroupColumnListTemplateWidgetCompartmentEditPart.VISUAL_ID:
		case GroupGroupTemplateWidgetCompartment3EditPart.VISUAL_ID:
		case GroupRowGroupRowListTemplateWidgetCompartmentEditPart.VISUAL_ID:
		case GroupGroupTemplateWidgetCompartment4EditPart.VISUAL_ID:
		case AppbarAppbarListButtonsCompartmentEditPart.VISUAL_ID:
		case AppbarAppbarListLabelsCompartmentEditPart.VISUAL_ID:
		case TabbarTabbarListButtonsCompartmentEditPart.VISUAL_ID:
		case TabbarTabbarListLabelsCompartmentEditPart.VISUAL_ID:
		case ListViewListViewTemplateWidgetCompartmentEditPart.VISUAL_ID:
		case GroupGroupTemplateWidgetCompartment5EditPart.VISUAL_ID:
		case TableTableListCoulmnsCompartmentEditPart.VISUAL_ID:
		case GroupColumnGroupColumnListTemplateWidgetCompartment2EditPart.VISUAL_ID:
		case GroupColumnGroupColumnListTemplateWidgetCompartment3EditPart.VISUAL_ID:
		case GroupRowGroupRowListTemplateWidgetCompartment2EditPart.VISUAL_ID:
		case GroupColumnGroupColumnListTemplateWidgetCompartment4EditPart.VISUAL_ID:
		case AppbarAppbarListButtonsCompartment2EditPart.VISUAL_ID:
		case AppbarAppbarListLabelsCompartment2EditPart.VISUAL_ID:
		case TabbarTabbarListButtonsCompartment2EditPart.VISUAL_ID:
		case TabbarTabbarListLabelsCompartment2EditPart.VISUAL_ID:
		case ListViewListViewTemplateWidgetCompartment2EditPart.VISUAL_ID:
		case GroupRowGroupRowListTemplateWidgetCompartment3EditPart.VISUAL_ID:
		case GroupRowGroupRowListTemplateWidgetCompartment4EditPart.VISUAL_ID:
		case AppbarAppbarListButtonsCompartment3EditPart.VISUAL_ID:
		case AppbarAppbarListLabelsCompartment3EditPart.VISUAL_ID:
		case TabbarTabbarListButtonsCompartment3EditPart.VISUAL_ID:
		case TabbarTabbarListLabelsCompartment3EditPart.VISUAL_ID:
		case ListViewListViewTemplateWidgetCompartment3EditPart.VISUAL_ID:
		case AppbarAppbarListButtonsCompartment4EditPart.VISUAL_ID:
		case AppbarAppbarListLabelsCompartment4EditPart.VISUAL_ID:
		case TabbarTabbarListButtonsCompartment4EditPart.VISUAL_ID:
		case TabbarTabbarListLabelsCompartment4EditPart.VISUAL_ID:
		case ListViewListViewTemplateWidgetCompartment4EditPart.VISUAL_ID:
		case TableTableListCoulmnsCompartment2EditPart.VISUAL_ID:
		case TableTableListCoulmnsCompartment3EditPart.VISUAL_ID:
		case TableTableListCoulmnsCompartment4EditPart.VISUAL_ID:
		case GroupColumnGroupColumnListTemplateWidgetCompartment5EditPart.VISUAL_ID:
		case GroupRowGroupRowListTemplateWidgetCompartment5EditPart.VISUAL_ID:
		case AppbarAppbarListButtonsCompartment5EditPart.VISUAL_ID:
		case AppbarAppbarListLabelsCompartment5EditPart.VISUAL_ID:
		case TabbarTabbarListButtonsCompartment5EditPart.VISUAL_ID:
		case TabbarTabbarListLabelsCompartment5EditPart.VISUAL_ID:
		case ListViewListViewTemplateWidgetCompartment5EditPart.VISUAL_ID:
		case TableTableListCoulmnsCompartment5EditPart.VISUAL_ID:
			return true;
		default:
			break;
		}
		return false;
	}

	/**
	* @generated
	*/
	public static boolean isSemanticLeafVisualID(int visualID) {
		switch (visualID) {
		case UIDiagramEditPart.VISUAL_ID:
			return false;
		case ButtonEditPart.VISUAL_ID:
		case LabelEditPart.VISUAL_ID:
		case Button2EditPart.VISUAL_ID:
		case Label2EditPart.VISUAL_ID:
		case Button3EditPart.VISUAL_ID:
		case Label3EditPart.VISUAL_ID:
		case CheckboxEditPart.VISUAL_ID:
		case InputEditPart.VISUAL_ID:
		case RadioButtonEditPart.VISUAL_ID:
		case ComboBoxEditPart.VISUAL_ID:
		case DatePickerEditPart.VISUAL_ID:
		case SwitchEditPart.VISUAL_ID:
		case ColumnEditPart.VISUAL_ID:
		case Button4EditPart.VISUAL_ID:
		case Label4EditPart.VISUAL_ID:
		case Checkbox2EditPart.VISUAL_ID:
		case Input2EditPart.VISUAL_ID:
		case Button5EditPart.VISUAL_ID:
		case Label5EditPart.VISUAL_ID:
		case Checkbox3EditPart.VISUAL_ID:
		case Input3EditPart.VISUAL_ID:
		case Button6EditPart.VISUAL_ID:
		case Label6EditPart.VISUAL_ID:
		case Checkbox4EditPart.VISUAL_ID:
		case Input4EditPart.VISUAL_ID:
		case RadioButton2EditPart.VISUAL_ID:
		case ComboBox2EditPart.VISUAL_ID:
		case DatePicker2EditPart.VISUAL_ID:
		case Switch2EditPart.VISUAL_ID:
		case RadioButton3EditPart.VISUAL_ID:
		case ComboBox3EditPart.VISUAL_ID:
		case DatePicker3EditPart.VISUAL_ID:
		case Switch3EditPart.VISUAL_ID:
		case RadioButton4EditPart.VISUAL_ID:
		case ComboBox4EditPart.VISUAL_ID:
		case DatePicker4EditPart.VISUAL_ID:
		case Switch4EditPart.VISUAL_ID:
		case Button7EditPart.VISUAL_ID:
		case Label7EditPart.VISUAL_ID:
		case Checkbox5EditPart.VISUAL_ID:
		case Input5EditPart.VISUAL_ID:
		case RadioButton5EditPart.VISUAL_ID:
		case ComboBox5EditPart.VISUAL_ID:
		case DatePicker5EditPart.VISUAL_ID:
		case Switch5EditPart.VISUAL_ID:
			return true;
		default:
			break;
		}
		return false;
	}

	/**
	* @generated
	*/
	public static final DiagramStructure TYPED_INSTANCE = new DiagramStructure() {
		/**
		* @generated
		*/
		@Override

		public int getVisualID(View view) {
			return uidiagram.diagram.part.UidiagramVisualIDRegistry.getVisualID(view);
		}

		/**
		* @generated
		*/
		@Override

		public String getModelID(View view) {
			return uidiagram.diagram.part.UidiagramVisualIDRegistry.getModelID(view);
		}

		/**
		* @generated
		*/
		@Override

		public int getNodeVisualID(View containerView, EObject domainElement) {
			return uidiagram.diagram.part.UidiagramVisualIDRegistry.getNodeVisualID(containerView, domainElement);
		}

		/**
		* @generated
		*/
		@Override

		public boolean checkNodeVisualID(View containerView, EObject domainElement, int candidate) {
			return uidiagram.diagram.part.UidiagramVisualIDRegistry.checkNodeVisualID(containerView, domainElement,
					candidate);
		}

		/**
		* @generated
		*/
		@Override

		public boolean isCompartmentVisualID(int visualID) {
			return uidiagram.diagram.part.UidiagramVisualIDRegistry.isCompartmentVisualID(visualID);
		}

		/**
		* @generated
		*/
		@Override

		public boolean isSemanticLeafVisualID(int visualID) {
			return uidiagram.diagram.part.UidiagramVisualIDRegistry.isSemanticLeafVisualID(visualID);
		}
	};

}
