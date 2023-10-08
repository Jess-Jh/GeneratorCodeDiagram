/*
* 
*/
package uidiagram.diagram.part;

import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.gmf.tooling.runtime.update.DiagramUpdater;

import uidiagram.Appbar;
import uidiagram.Button;
import uidiagram.Column;
import uidiagram.Group;
import uidiagram.GroupColumn;
import uidiagram.GroupRow;
import uidiagram.Label;
import uidiagram.Tabbar;
import uidiagram.Table;
import uidiagram.TemplateWidget;
import uidiagram.UIDiagram;
import uidiagram.UserInterface;
import uidiagram.diagram.edit.parts.*;
import uidiagram.diagram.edit.parts.Appbar2EditPart;
import uidiagram.diagram.edit.parts.Appbar3EditPart;
import uidiagram.diagram.edit.parts.Appbar4EditPart;
import uidiagram.diagram.edit.parts.AppbarAppbarListButtonsCompartment2EditPart;
import uidiagram.diagram.edit.parts.AppbarAppbarListButtonsCompartment3EditPart;
import uidiagram.diagram.edit.parts.AppbarAppbarListButtonsCompartment4EditPart;
import uidiagram.diagram.edit.parts.AppbarAppbarListButtonsCompartmentEditPart;
import uidiagram.diagram.edit.parts.AppbarEditPart;
import uidiagram.diagram.edit.parts.Button2EditPart;
import uidiagram.diagram.edit.parts.Button3EditPart;
import uidiagram.diagram.edit.parts.Button4EditPart;
import uidiagram.diagram.edit.parts.Button5EditPart;
import uidiagram.diagram.edit.parts.Button6EditPart;
import uidiagram.diagram.edit.parts.ButtonEditPart;
import uidiagram.diagram.edit.parts.Checkbox2EditPart;
import uidiagram.diagram.edit.parts.Checkbox3EditPart;
import uidiagram.diagram.edit.parts.Checkbox4EditPart;
import uidiagram.diagram.edit.parts.CheckboxEditPart;
import uidiagram.diagram.edit.parts.ColumnEditPart;
import uidiagram.diagram.edit.parts.ComboBox2EditPart;
import uidiagram.diagram.edit.parts.ComboBox3EditPart;
import uidiagram.diagram.edit.parts.ComboBox4EditPart;
import uidiagram.diagram.edit.parts.ComboBoxEditPart;
import uidiagram.diagram.edit.parts.DatePicker2EditPart;
import uidiagram.diagram.edit.parts.DatePicker3EditPart;
import uidiagram.diagram.edit.parts.DatePicker4EditPart;
import uidiagram.diagram.edit.parts.DatePickerEditPart;
import uidiagram.diagram.edit.parts.Group2EditPart;
import uidiagram.diagram.edit.parts.Group3EditPart;
import uidiagram.diagram.edit.parts.Group4EditPart;
import uidiagram.diagram.edit.parts.GroupColumn2EditPart;
import uidiagram.diagram.edit.parts.GroupColumn3EditPart;
import uidiagram.diagram.edit.parts.GroupColumn4EditPart;
import uidiagram.diagram.edit.parts.GroupColumnEditPart;
import uidiagram.diagram.edit.parts.GroupColumnGroupColumnListTemplateWidgetCompartment2EditPart;
import uidiagram.diagram.edit.parts.GroupColumnGroupColumnListTemplateWidgetCompartment3EditPart;
import uidiagram.diagram.edit.parts.GroupColumnGroupColumnListTemplateWidgetCompartment4EditPart;
import uidiagram.diagram.edit.parts.GroupColumnGroupColumnListTemplateWidgetCompartmentEditPart;
import uidiagram.diagram.edit.parts.GroupEditPart;
import uidiagram.diagram.edit.parts.GroupGroupListTemplateWidgetCompartment2EditPart;
import uidiagram.diagram.edit.parts.GroupGroupListTemplateWidgetCompartment3EditPart;
import uidiagram.diagram.edit.parts.GroupGroupListTemplateWidgetCompartment4EditPart;
import uidiagram.diagram.edit.parts.GroupGroupListTemplateWidgetCompartmentEditPart;
import uidiagram.diagram.edit.parts.GroupRow2EditPart;
import uidiagram.diagram.edit.parts.GroupRow3EditPart;
import uidiagram.diagram.edit.parts.GroupRow4EditPart;
import uidiagram.diagram.edit.parts.GroupRowEditPart;
import uidiagram.diagram.edit.parts.GroupRowGroupRowListTemplateWidgetCompartment2EditPart;
import uidiagram.diagram.edit.parts.GroupRowGroupRowListTemplateWidgetCompartment3EditPart;
import uidiagram.diagram.edit.parts.GroupRowGroupRowListTemplateWidgetCompartment4EditPart;
import uidiagram.diagram.edit.parts.GroupRowGroupRowListTemplateWidgetCompartmentEditPart;
import uidiagram.diagram.edit.parts.Input2EditPart;
import uidiagram.diagram.edit.parts.Input3EditPart;
import uidiagram.diagram.edit.parts.Input4EditPart;
import uidiagram.diagram.edit.parts.InputEditPart;
import uidiagram.diagram.edit.parts.Label2EditPart;
import uidiagram.diagram.edit.parts.Label3EditPart;
import uidiagram.diagram.edit.parts.Label4EditPart;
import uidiagram.diagram.edit.parts.LabelEditPart;
import uidiagram.diagram.edit.parts.ListView2EditPart;
import uidiagram.diagram.edit.parts.ListView3EditPart;
import uidiagram.diagram.edit.parts.ListView4EditPart;
import uidiagram.diagram.edit.parts.ListViewEditPart;
import uidiagram.diagram.edit.parts.ModelFactoryEditPart;
import uidiagram.diagram.edit.parts.RadioButton2EditPart;
import uidiagram.diagram.edit.parts.RadioButton3EditPart;
import uidiagram.diagram.edit.parts.RadioButton4EditPart;
import uidiagram.diagram.edit.parts.RadioButtonEditPart;
import uidiagram.diagram.edit.parts.Switch2EditPart;
import uidiagram.diagram.edit.parts.Switch3EditPart;
import uidiagram.diagram.edit.parts.Switch4EditPart;
import uidiagram.diagram.edit.parts.SwitchEditPart;
import uidiagram.diagram.edit.parts.Tabbar2EditPart;
import uidiagram.diagram.edit.parts.Tabbar3EditPart;
import uidiagram.diagram.edit.parts.Tabbar4EditPart;
import uidiagram.diagram.edit.parts.TabbarEditPart;
import uidiagram.diagram.edit.parts.TabbarTabbarListButtonsCompartment2EditPart;
import uidiagram.diagram.edit.parts.TabbarTabbarListButtonsCompartment3EditPart;
import uidiagram.diagram.edit.parts.TabbarTabbarListButtonsCompartment4EditPart;
import uidiagram.diagram.edit.parts.TabbarTabbarListButtonsCompartmentEditPart;
import uidiagram.diagram.edit.parts.Table2EditPart;
import uidiagram.diagram.edit.parts.Table3EditPart;
import uidiagram.diagram.edit.parts.Table4EditPart;
import uidiagram.diagram.edit.parts.TableEditPart;
import uidiagram.diagram.edit.parts.TableTableListCoulmnsCompartment2EditPart;
import uidiagram.diagram.edit.parts.TableTableListCoulmnsCompartment3EditPart;
import uidiagram.diagram.edit.parts.TableTableListCoulmnsCompartment4EditPart;
import uidiagram.diagram.edit.parts.TableTableListCoulmnsCompartmentEditPart;
import uidiagram.diagram.edit.parts.UIDiagramEditPart;
import uidiagram.diagram.edit.parts.UserInterfaceEditPart;
import uidiagram.diagram.edit.parts.UserInterfaceUserInterfaceListTemplateWidgetCompartmentEditPart;

/**
 * @generated
 */
public class UidiagramDiagramUpdater {

	/**
	* @generated
	*/
	public static boolean isShortcutOrphaned(View view) {
		return !view.isSetElement() || view.getElement() == null || view.getElement().eIsProxy();
	}

	/**
	* @generated
	*/
	public static List<UidiagramNodeDescriptor> getSemanticChildren(View view) {
		switch (UidiagramVisualIDRegistry.getVisualID(view)) {
		case UIDiagramEditPart.VISUAL_ID:
			return getUIDiagram_1000SemanticChildren(view);
		case UserInterfaceUserInterfaceListTemplateWidgetCompartmentEditPart.VISUAL_ID:
			return getUserInterfaceUserInterfaceListTemplateWidgetCompartment_7001SemanticChildren(view);
		case GroupGroupListTemplateWidgetCompartmentEditPart.VISUAL_ID:
			return getGroupGroupListTemplateWidgetCompartment_7002SemanticChildren(view);
		case GroupGroupListTemplateWidgetCompartment2EditPart.VISUAL_ID:
			return getGroupGroupListTemplateWidgetCompartment_7003SemanticChildren(view);
		case GroupColumnGroupColumnListTemplateWidgetCompartmentEditPart.VISUAL_ID:
			return getGroupColumnGroupColumnListTemplateWidgetCompartment_7004SemanticChildren(view);
		case GroupGroupListTemplateWidgetCompartment3EditPart.VISUAL_ID:
			return getGroupGroupListTemplateWidgetCompartment_7005SemanticChildren(view);
		case GroupRowGroupRowListTemplateWidgetCompartmentEditPart.VISUAL_ID:
			return getGroupRowGroupRowListTemplateWidgetCompartment_7006SemanticChildren(view);
		case GroupGroupListTemplateWidgetCompartment4EditPart.VISUAL_ID:
			return getGroupGroupListTemplateWidgetCompartment_7007SemanticChildren(view);
		case AppbarAppbarListButtonsCompartmentEditPart.VISUAL_ID:
			return getAppbarAppbarListButtonsCompartment_7018SemanticChildren(view);
		case AppbarAppbarListLabelsCompartmentEditPart.VISUAL_ID:
			return getAppbarAppbarListLabelsCompartment_7026SemanticChildren(view);
		case TabbarTabbarListButtonsCompartmentEditPart.VISUAL_ID:
			return getTabbarTabbarListButtonsCompartment_7019SemanticChildren(view);
		case TabbarTabbarListLabelsCompartmentEditPart.VISUAL_ID:
			return getTabbarTabbarListLabelsCompartment_7027SemanticChildren(view);
		case TableTableListCoulmnsCompartmentEditPart.VISUAL_ID:
			return getTableTableListCoulmnsCompartment_7008SemanticChildren(view);
		case GroupColumnGroupColumnListTemplateWidgetCompartment2EditPart.VISUAL_ID:
			return getGroupColumnGroupColumnListTemplateWidgetCompartment_7009SemanticChildren(view);
		case GroupColumnGroupColumnListTemplateWidgetCompartment3EditPart.VISUAL_ID:
			return getGroupColumnGroupColumnListTemplateWidgetCompartment_7010SemanticChildren(view);
		case GroupRowGroupRowListTemplateWidgetCompartment2EditPart.VISUAL_ID:
			return getGroupRowGroupRowListTemplateWidgetCompartment_7011SemanticChildren(view);
		case GroupRowGroupRowListTemplateWidgetCompartment3EditPart.VISUAL_ID:
			return getGroupRowGroupRowListTemplateWidgetCompartment_7012SemanticChildren(view);
		case AppbarAppbarListButtonsCompartment2EditPart.VISUAL_ID:
			return getAppbarAppbarListButtonsCompartment_7020SemanticChildren(view);
		case AppbarAppbarListLabelsCompartment2EditPart.VISUAL_ID:
			return getAppbarAppbarListLabelsCompartment_7028SemanticChildren(view);
		case TabbarTabbarListButtonsCompartment2EditPart.VISUAL_ID:
			return getTabbarTabbarListButtonsCompartment_7021SemanticChildren(view);
		case TabbarTabbarListLabelsCompartment2EditPart.VISUAL_ID:
			return getTabbarTabbarListLabelsCompartment_7029SemanticChildren(view);
		case TableTableListCoulmnsCompartment2EditPart.VISUAL_ID:
			return getTableTableListCoulmnsCompartment_7013SemanticChildren(view);
		case AppbarAppbarListButtonsCompartment3EditPart.VISUAL_ID:
			return getAppbarAppbarListButtonsCompartment_7022SemanticChildren(view);
		case AppbarAppbarListLabelsCompartment3EditPart.VISUAL_ID:
			return getAppbarAppbarListLabelsCompartment_7030SemanticChildren(view);
		case TabbarTabbarListButtonsCompartment3EditPart.VISUAL_ID:
			return getTabbarTabbarListButtonsCompartment_7023SemanticChildren(view);
		case TabbarTabbarListLabelsCompartment3EditPart.VISUAL_ID:
			return getTabbarTabbarListLabelsCompartment_7031SemanticChildren(view);
		case TableTableListCoulmnsCompartment3EditPart.VISUAL_ID:
			return getTableTableListCoulmnsCompartment_7014SemanticChildren(view);
		case GroupColumnGroupColumnListTemplateWidgetCompartment4EditPart.VISUAL_ID:
			return getGroupColumnGroupColumnListTemplateWidgetCompartment_7015SemanticChildren(view);
		case GroupRowGroupRowListTemplateWidgetCompartment4EditPart.VISUAL_ID:
			return getGroupRowGroupRowListTemplateWidgetCompartment_7016SemanticChildren(view);
		case AppbarAppbarListButtonsCompartment4EditPart.VISUAL_ID:
			return getAppbarAppbarListButtonsCompartment_7024SemanticChildren(view);
		case AppbarAppbarListLabelsCompartment4EditPart.VISUAL_ID:
			return getAppbarAppbarListLabelsCompartment_7032SemanticChildren(view);
		case TabbarTabbarListButtonsCompartment4EditPart.VISUAL_ID:
			return getTabbarTabbarListButtonsCompartment_7025SemanticChildren(view);
		case TabbarTabbarListLabelsCompartment4EditPart.VISUAL_ID:
			return getTabbarTabbarListLabelsCompartment_7033SemanticChildren(view);
		case TableTableListCoulmnsCompartment4EditPart.VISUAL_ID:
			return getTableTableListCoulmnsCompartment_7017SemanticChildren(view);
		}
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<UidiagramNodeDescriptor> getUIDiagram_1000SemanticChildren(View view) {
		if (!view.isSetElement()) {
			return Collections.emptyList();
		}
		UIDiagram modelElement = (UIDiagram) view.getElement();
		LinkedList<UidiagramNodeDescriptor> result = new LinkedList<UidiagramNodeDescriptor>();
		{
			UserInterface childElement = modelElement.getUserInterface();
			int visualID = UidiagramVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == UserInterfaceEditPart.VISUAL_ID) {
				result.add(new UidiagramNodeDescriptor(childElement, visualID));
			}
		}
		return result;
	}

	/**
	* @generated
	*/
	public static List<UidiagramNodeDescriptor> getUserInterfaceUserInterfaceListTemplateWidgetCompartment_7001SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		UserInterface modelElement = (UserInterface) containerView.getElement();
		LinkedList<UidiagramNodeDescriptor> result = new LinkedList<UidiagramNodeDescriptor>();
		for (Iterator<?> it = modelElement.getListTemplateWidget().iterator(); it.hasNext();) {
			TemplateWidget childElement = (TemplateWidget) it.next();
			int visualID = UidiagramVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == GroupEditPart.VISUAL_ID) {
				result.add(new UidiagramNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == GroupColumn4EditPart.VISUAL_ID) {
				result.add(new UidiagramNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == GroupRow4EditPart.VISUAL_ID) {
				result.add(new UidiagramNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Appbar4EditPart.VISUAL_ID) {
				result.add(new UidiagramNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Tabbar4EditPart.VISUAL_ID) {
				result.add(new UidiagramNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Button6EditPart.VISUAL_ID) {
				result.add(new UidiagramNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Label6EditPart.VISUAL_ID) {
				result.add(new UidiagramNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Checkbox4EditPart.VISUAL_ID) {
				result.add(new UidiagramNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Input4EditPart.VISUAL_ID) {
				result.add(new UidiagramNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == ListView4EditPart.VISUAL_ID) {
				result.add(new UidiagramNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == RadioButton4EditPart.VISUAL_ID) {
				result.add(new UidiagramNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == ComboBox4EditPart.VISUAL_ID) {
				result.add(new UidiagramNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == DatePicker4EditPart.VISUAL_ID) {
				result.add(new UidiagramNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Switch4EditPart.VISUAL_ID) {
				result.add(new UidiagramNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Table4EditPart.VISUAL_ID) {
				result.add(new UidiagramNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	* @generated
	*/
	public static List<UidiagramNodeDescriptor> getGroupGroupListTemplateWidgetCompartment_7002SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		Group modelElement = (Group) containerView.getElement();
		LinkedList<UidiagramNodeDescriptor> result = new LinkedList<UidiagramNodeDescriptor>();
		for (Iterator<?> it = modelElement.getListTemplateWidget().iterator(); it.hasNext();) {
			TemplateWidget childElement = (TemplateWidget) it.next();
			int visualID = UidiagramVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == Group2EditPart.VISUAL_ID) {
				result.add(new UidiagramNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == GroupColumnEditPart.VISUAL_ID) {
				result.add(new UidiagramNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == GroupRowEditPart.VISUAL_ID) {
				result.add(new UidiagramNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == AppbarEditPart.VISUAL_ID) {
				result.add(new UidiagramNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == TabbarEditPart.VISUAL_ID) {
				result.add(new UidiagramNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Button3EditPart.VISUAL_ID) {
				result.add(new UidiagramNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Label3EditPart.VISUAL_ID) {
				result.add(new UidiagramNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == CheckboxEditPart.VISUAL_ID) {
				result.add(new UidiagramNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == InputEditPart.VISUAL_ID) {
				result.add(new UidiagramNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == ListViewEditPart.VISUAL_ID) {
				result.add(new UidiagramNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == RadioButtonEditPart.VISUAL_ID) {
				result.add(new UidiagramNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == ComboBoxEditPart.VISUAL_ID) {
				result.add(new UidiagramNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == DatePickerEditPart.VISUAL_ID) {
				result.add(new UidiagramNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == SwitchEditPart.VISUAL_ID) {
				result.add(new UidiagramNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == TableEditPart.VISUAL_ID) {
				result.add(new UidiagramNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	* @generated
	*/
	public static List<UidiagramNodeDescriptor> getGroupGroupListTemplateWidgetCompartment_7003SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		Group modelElement = (Group) containerView.getElement();
		LinkedList<UidiagramNodeDescriptor> result = new LinkedList<UidiagramNodeDescriptor>();
		for (Iterator<?> it = modelElement.getListTemplateWidget().iterator(); it.hasNext();) {
			TemplateWidget childElement = (TemplateWidget) it.next();
			int visualID = UidiagramVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == Group2EditPart.VISUAL_ID) {
				result.add(new UidiagramNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == GroupColumnEditPart.VISUAL_ID) {
				result.add(new UidiagramNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == GroupRowEditPart.VISUAL_ID) {
				result.add(new UidiagramNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == AppbarEditPart.VISUAL_ID) {
				result.add(new UidiagramNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == TabbarEditPart.VISUAL_ID) {
				result.add(new UidiagramNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Button3EditPart.VISUAL_ID) {
				result.add(new UidiagramNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Label3EditPart.VISUAL_ID) {
				result.add(new UidiagramNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == CheckboxEditPart.VISUAL_ID) {
				result.add(new UidiagramNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == InputEditPart.VISUAL_ID) {
				result.add(new UidiagramNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == ListViewEditPart.VISUAL_ID) {
				result.add(new UidiagramNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == RadioButtonEditPart.VISUAL_ID) {
				result.add(new UidiagramNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == ComboBoxEditPart.VISUAL_ID) {
				result.add(new UidiagramNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == DatePickerEditPart.VISUAL_ID) {
				result.add(new UidiagramNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == SwitchEditPart.VISUAL_ID) {
				result.add(new UidiagramNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == TableEditPart.VISUAL_ID) {
				result.add(new UidiagramNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	* @generated
	*/
	public static List<UidiagramNodeDescriptor> getGroupColumnGroupColumnListTemplateWidgetCompartment_7004SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		GroupColumn modelElement = (GroupColumn) containerView.getElement();
		LinkedList<UidiagramNodeDescriptor> result = new LinkedList<UidiagramNodeDescriptor>();
		for (Iterator<?> it = modelElement.getListTemplateWidget().iterator(); it.hasNext();) {
			TemplateWidget childElement = (TemplateWidget) it.next();
			int visualID = UidiagramVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == Group3EditPart.VISUAL_ID) {
				result.add(new UidiagramNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == GroupColumn3EditPart.VISUAL_ID) {
				result.add(new UidiagramNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == GroupRow2EditPart.VISUAL_ID) {
				result.add(new UidiagramNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Appbar3EditPart.VISUAL_ID) {
				result.add(new UidiagramNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Tabbar3EditPart.VISUAL_ID) {
				result.add(new UidiagramNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Button5EditPart.VISUAL_ID) {
				result.add(new UidiagramNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Label5EditPart.VISUAL_ID) {
				result.add(new UidiagramNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Checkbox3EditPart.VISUAL_ID) {
				result.add(new UidiagramNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Input3EditPart.VISUAL_ID) {
				result.add(new UidiagramNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == ListView3EditPart.VISUAL_ID) {
				result.add(new UidiagramNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == RadioButton3EditPart.VISUAL_ID) {
				result.add(new UidiagramNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == ComboBox3EditPart.VISUAL_ID) {
				result.add(new UidiagramNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == DatePicker3EditPart.VISUAL_ID) {
				result.add(new UidiagramNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Switch3EditPart.VISUAL_ID) {
				result.add(new UidiagramNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Table3EditPart.VISUAL_ID) {
				result.add(new UidiagramNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	* @generated
	*/
	public static List<UidiagramNodeDescriptor> getGroupGroupListTemplateWidgetCompartment_7005SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		Group modelElement = (Group) containerView.getElement();
		LinkedList<UidiagramNodeDescriptor> result = new LinkedList<UidiagramNodeDescriptor>();
		for (Iterator<?> it = modelElement.getListTemplateWidget().iterator(); it.hasNext();) {
			TemplateWidget childElement = (TemplateWidget) it.next();
			int visualID = UidiagramVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == Group2EditPart.VISUAL_ID) {
				result.add(new UidiagramNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == GroupColumnEditPart.VISUAL_ID) {
				result.add(new UidiagramNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == GroupRowEditPart.VISUAL_ID) {
				result.add(new UidiagramNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == AppbarEditPart.VISUAL_ID) {
				result.add(new UidiagramNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == TabbarEditPart.VISUAL_ID) {
				result.add(new UidiagramNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Button3EditPart.VISUAL_ID) {
				result.add(new UidiagramNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Label3EditPart.VISUAL_ID) {
				result.add(new UidiagramNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == CheckboxEditPart.VISUAL_ID) {
				result.add(new UidiagramNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == InputEditPart.VISUAL_ID) {
				result.add(new UidiagramNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == ListViewEditPart.VISUAL_ID) {
				result.add(new UidiagramNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == RadioButtonEditPart.VISUAL_ID) {
				result.add(new UidiagramNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == ComboBoxEditPart.VISUAL_ID) {
				result.add(new UidiagramNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == DatePickerEditPart.VISUAL_ID) {
				result.add(new UidiagramNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == SwitchEditPart.VISUAL_ID) {
				result.add(new UidiagramNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == TableEditPart.VISUAL_ID) {
				result.add(new UidiagramNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	* @generated
	*/
	public static List<UidiagramNodeDescriptor> getGroupRowGroupRowListTemplateWidgetCompartment_7006SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		GroupRow modelElement = (GroupRow) containerView.getElement();
		LinkedList<UidiagramNodeDescriptor> result = new LinkedList<UidiagramNodeDescriptor>();
		for (Iterator<?> it = modelElement.getListTemplateWidget().iterator(); it.hasNext();) {
			TemplateWidget childElement = (TemplateWidget) it.next();
			int visualID = UidiagramVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == Group4EditPart.VISUAL_ID) {
				result.add(new UidiagramNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == GroupColumn2EditPart.VISUAL_ID) {
				result.add(new UidiagramNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == GroupRow3EditPart.VISUAL_ID) {
				result.add(new UidiagramNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Appbar2EditPart.VISUAL_ID) {
				result.add(new UidiagramNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Tabbar2EditPart.VISUAL_ID) {
				result.add(new UidiagramNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Button4EditPart.VISUAL_ID) {
				result.add(new UidiagramNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Label4EditPart.VISUAL_ID) {
				result.add(new UidiagramNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Checkbox2EditPart.VISUAL_ID) {
				result.add(new UidiagramNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Input2EditPart.VISUAL_ID) {
				result.add(new UidiagramNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == ListView2EditPart.VISUAL_ID) {
				result.add(new UidiagramNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == RadioButton2EditPart.VISUAL_ID) {
				result.add(new UidiagramNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == ComboBox2EditPart.VISUAL_ID) {
				result.add(new UidiagramNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == DatePicker2EditPart.VISUAL_ID) {
				result.add(new UidiagramNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Switch2EditPart.VISUAL_ID) {
				result.add(new UidiagramNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Table2EditPart.VISUAL_ID) {
				result.add(new UidiagramNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	* @generated
	*/
	public static List<UidiagramNodeDescriptor> getGroupGroupListTemplateWidgetCompartment_7007SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		Group modelElement = (Group) containerView.getElement();
		LinkedList<UidiagramNodeDescriptor> result = new LinkedList<UidiagramNodeDescriptor>();
		for (Iterator<?> it = modelElement.getListTemplateWidget().iterator(); it.hasNext();) {
			TemplateWidget childElement = (TemplateWidget) it.next();
			int visualID = UidiagramVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == Group2EditPart.VISUAL_ID) {
				result.add(new UidiagramNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == GroupColumnEditPart.VISUAL_ID) {
				result.add(new UidiagramNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == GroupRowEditPart.VISUAL_ID) {
				result.add(new UidiagramNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == AppbarEditPart.VISUAL_ID) {
				result.add(new UidiagramNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == TabbarEditPart.VISUAL_ID) {
				result.add(new UidiagramNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Button3EditPart.VISUAL_ID) {
				result.add(new UidiagramNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Label3EditPart.VISUAL_ID) {
				result.add(new UidiagramNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == CheckboxEditPart.VISUAL_ID) {
				result.add(new UidiagramNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == InputEditPart.VISUAL_ID) {
				result.add(new UidiagramNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == ListViewEditPart.VISUAL_ID) {
				result.add(new UidiagramNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == RadioButtonEditPart.VISUAL_ID) {
				result.add(new UidiagramNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == ComboBoxEditPart.VISUAL_ID) {
				result.add(new UidiagramNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == DatePickerEditPart.VISUAL_ID) {
				result.add(new UidiagramNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == SwitchEditPart.VISUAL_ID) {
				result.add(new UidiagramNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == TableEditPart.VISUAL_ID) {
				result.add(new UidiagramNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	* @generated
	*/
	public static List<UidiagramNodeDescriptor> getAppbarAppbarListButtonsCompartment_7018SemanticChildren(View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		Appbar modelElement = (Appbar) containerView.getElement();
		LinkedList<UidiagramNodeDescriptor> result = new LinkedList<UidiagramNodeDescriptor>();
		for (Iterator<?> it = modelElement.getListButtons().iterator(); it.hasNext();) {
			Button childElement = (Button) it.next();
			int visualID = UidiagramVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == ButtonEditPart.VISUAL_ID) {
				result.add(new UidiagramNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	* @generated
	*/
	public static List<UidiagramNodeDescriptor> getAppbarAppbarListLabelsCompartment_7026SemanticChildren(View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		Appbar modelElement = (Appbar) containerView.getElement();
		LinkedList<UidiagramNodeDescriptor> result = new LinkedList<UidiagramNodeDescriptor>();
		for (Iterator<?> it = modelElement.getListLabels().iterator(); it.hasNext();) {
			Label childElement = (Label) it.next();
			int visualID = UidiagramVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == LabelEditPart.VISUAL_ID) {
				result.add(new UidiagramNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	* @generated
	*/
	public static List<UidiagramNodeDescriptor> getTabbarTabbarListButtonsCompartment_7019SemanticChildren(View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		Tabbar modelElement = (Tabbar) containerView.getElement();
		LinkedList<UidiagramNodeDescriptor> result = new LinkedList<UidiagramNodeDescriptor>();
		for (Iterator<?> it = modelElement.getListButtons().iterator(); it.hasNext();) {
			Button childElement = (Button) it.next();
			int visualID = UidiagramVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == Button2EditPart.VISUAL_ID) {
				result.add(new UidiagramNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	* @generated
	*/
	public static List<UidiagramNodeDescriptor> getTabbarTabbarListLabelsCompartment_7027SemanticChildren(View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		Tabbar modelElement = (Tabbar) containerView.getElement();
		LinkedList<UidiagramNodeDescriptor> result = new LinkedList<UidiagramNodeDescriptor>();
		for (Iterator<?> it = modelElement.getListLabels().iterator(); it.hasNext();) {
			Label childElement = (Label) it.next();
			int visualID = UidiagramVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == Label2EditPart.VISUAL_ID) {
				result.add(new UidiagramNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	* @generated
	*/
	public static List<UidiagramNodeDescriptor> getTableTableListCoulmnsCompartment_7008SemanticChildren(View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		Table modelElement = (Table) containerView.getElement();
		LinkedList<UidiagramNodeDescriptor> result = new LinkedList<UidiagramNodeDescriptor>();
		for (Iterator<?> it = modelElement.getListCoulmns().iterator(); it.hasNext();) {
			Column childElement = (Column) it.next();
			int visualID = UidiagramVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == ColumnEditPart.VISUAL_ID) {
				result.add(new UidiagramNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	* @generated
	*/
	public static List<UidiagramNodeDescriptor> getGroupColumnGroupColumnListTemplateWidgetCompartment_7009SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		GroupColumn modelElement = (GroupColumn) containerView.getElement();
		LinkedList<UidiagramNodeDescriptor> result = new LinkedList<UidiagramNodeDescriptor>();
		for (Iterator<?> it = modelElement.getListTemplateWidget().iterator(); it.hasNext();) {
			TemplateWidget childElement = (TemplateWidget) it.next();
			int visualID = UidiagramVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == Group3EditPart.VISUAL_ID) {
				result.add(new UidiagramNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == GroupColumn3EditPart.VISUAL_ID) {
				result.add(new UidiagramNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == GroupRow2EditPart.VISUAL_ID) {
				result.add(new UidiagramNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Appbar3EditPart.VISUAL_ID) {
				result.add(new UidiagramNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Tabbar3EditPart.VISUAL_ID) {
				result.add(new UidiagramNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Button5EditPart.VISUAL_ID) {
				result.add(new UidiagramNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Label5EditPart.VISUAL_ID) {
				result.add(new UidiagramNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Checkbox3EditPart.VISUAL_ID) {
				result.add(new UidiagramNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Input3EditPart.VISUAL_ID) {
				result.add(new UidiagramNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == ListView3EditPart.VISUAL_ID) {
				result.add(new UidiagramNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == RadioButton3EditPart.VISUAL_ID) {
				result.add(new UidiagramNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == ComboBox3EditPart.VISUAL_ID) {
				result.add(new UidiagramNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == DatePicker3EditPart.VISUAL_ID) {
				result.add(new UidiagramNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Switch3EditPart.VISUAL_ID) {
				result.add(new UidiagramNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Table3EditPart.VISUAL_ID) {
				result.add(new UidiagramNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	* @generated
	*/
	public static List<UidiagramNodeDescriptor> getGroupColumnGroupColumnListTemplateWidgetCompartment_7010SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		GroupColumn modelElement = (GroupColumn) containerView.getElement();
		LinkedList<UidiagramNodeDescriptor> result = new LinkedList<UidiagramNodeDescriptor>();
		for (Iterator<?> it = modelElement.getListTemplateWidget().iterator(); it.hasNext();) {
			TemplateWidget childElement = (TemplateWidget) it.next();
			int visualID = UidiagramVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == Group3EditPart.VISUAL_ID) {
				result.add(new UidiagramNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == GroupColumn3EditPart.VISUAL_ID) {
				result.add(new UidiagramNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == GroupRow2EditPart.VISUAL_ID) {
				result.add(new UidiagramNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Appbar3EditPart.VISUAL_ID) {
				result.add(new UidiagramNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Tabbar3EditPart.VISUAL_ID) {
				result.add(new UidiagramNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Button5EditPart.VISUAL_ID) {
				result.add(new UidiagramNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Label5EditPart.VISUAL_ID) {
				result.add(new UidiagramNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Checkbox3EditPart.VISUAL_ID) {
				result.add(new UidiagramNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Input3EditPart.VISUAL_ID) {
				result.add(new UidiagramNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == ListView3EditPart.VISUAL_ID) {
				result.add(new UidiagramNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == RadioButton3EditPart.VISUAL_ID) {
				result.add(new UidiagramNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == ComboBox3EditPart.VISUAL_ID) {
				result.add(new UidiagramNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == DatePicker3EditPart.VISUAL_ID) {
				result.add(new UidiagramNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Switch3EditPart.VISUAL_ID) {
				result.add(new UidiagramNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Table3EditPart.VISUAL_ID) {
				result.add(new UidiagramNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	* @generated
	*/
	public static List<UidiagramNodeDescriptor> getGroupRowGroupRowListTemplateWidgetCompartment_7011SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		GroupRow modelElement = (GroupRow) containerView.getElement();
		LinkedList<UidiagramNodeDescriptor> result = new LinkedList<UidiagramNodeDescriptor>();
		for (Iterator<?> it = modelElement.getListTemplateWidget().iterator(); it.hasNext();) {
			TemplateWidget childElement = (TemplateWidget) it.next();
			int visualID = UidiagramVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == Group4EditPart.VISUAL_ID) {
				result.add(new UidiagramNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == GroupColumn2EditPart.VISUAL_ID) {
				result.add(new UidiagramNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == GroupRow3EditPart.VISUAL_ID) {
				result.add(new UidiagramNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Appbar2EditPart.VISUAL_ID) {
				result.add(new UidiagramNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Tabbar2EditPart.VISUAL_ID) {
				result.add(new UidiagramNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Button4EditPart.VISUAL_ID) {
				result.add(new UidiagramNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Label4EditPart.VISUAL_ID) {
				result.add(new UidiagramNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Checkbox2EditPart.VISUAL_ID) {
				result.add(new UidiagramNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Input2EditPart.VISUAL_ID) {
				result.add(new UidiagramNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == ListView2EditPart.VISUAL_ID) {
				result.add(new UidiagramNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == RadioButton2EditPart.VISUAL_ID) {
				result.add(new UidiagramNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == ComboBox2EditPart.VISUAL_ID) {
				result.add(new UidiagramNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == DatePicker2EditPart.VISUAL_ID) {
				result.add(new UidiagramNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Switch2EditPart.VISUAL_ID) {
				result.add(new UidiagramNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Table2EditPart.VISUAL_ID) {
				result.add(new UidiagramNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	* @generated
	*/
	public static List<UidiagramNodeDescriptor> getGroupRowGroupRowListTemplateWidgetCompartment_7012SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		GroupRow modelElement = (GroupRow) containerView.getElement();
		LinkedList<UidiagramNodeDescriptor> result = new LinkedList<UidiagramNodeDescriptor>();
		for (Iterator<?> it = modelElement.getListTemplateWidget().iterator(); it.hasNext();) {
			TemplateWidget childElement = (TemplateWidget) it.next();
			int visualID = UidiagramVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == Group4EditPart.VISUAL_ID) {
				result.add(new UidiagramNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == GroupColumn2EditPart.VISUAL_ID) {
				result.add(new UidiagramNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == GroupRow3EditPart.VISUAL_ID) {
				result.add(new UidiagramNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Appbar2EditPart.VISUAL_ID) {
				result.add(new UidiagramNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Tabbar2EditPart.VISUAL_ID) {
				result.add(new UidiagramNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Button4EditPart.VISUAL_ID) {
				result.add(new UidiagramNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Label4EditPart.VISUAL_ID) {
				result.add(new UidiagramNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Checkbox2EditPart.VISUAL_ID) {
				result.add(new UidiagramNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Input2EditPart.VISUAL_ID) {
				result.add(new UidiagramNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == ListView2EditPart.VISUAL_ID) {
				result.add(new UidiagramNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == RadioButton2EditPart.VISUAL_ID) {
				result.add(new UidiagramNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == ComboBox2EditPart.VISUAL_ID) {
				result.add(new UidiagramNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == DatePicker2EditPart.VISUAL_ID) {
				result.add(new UidiagramNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Switch2EditPart.VISUAL_ID) {
				result.add(new UidiagramNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Table2EditPart.VISUAL_ID) {
				result.add(new UidiagramNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	* @generated
	*/
	public static List<UidiagramNodeDescriptor> getAppbarAppbarListButtonsCompartment_7020SemanticChildren(View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		Appbar modelElement = (Appbar) containerView.getElement();
		LinkedList<UidiagramNodeDescriptor> result = new LinkedList<UidiagramNodeDescriptor>();
		for (Iterator<?> it = modelElement.getListButtons().iterator(); it.hasNext();) {
			Button childElement = (Button) it.next();
			int visualID = UidiagramVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == ButtonEditPart.VISUAL_ID) {
				result.add(new UidiagramNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	* @generated
	*/
	public static List<UidiagramNodeDescriptor> getAppbarAppbarListLabelsCompartment_7028SemanticChildren(View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		Appbar modelElement = (Appbar) containerView.getElement();
		LinkedList<UidiagramNodeDescriptor> result = new LinkedList<UidiagramNodeDescriptor>();
		for (Iterator<?> it = modelElement.getListLabels().iterator(); it.hasNext();) {
			Label childElement = (Label) it.next();
			int visualID = UidiagramVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == LabelEditPart.VISUAL_ID) {
				result.add(new UidiagramNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	* @generated
	*/
	public static List<UidiagramNodeDescriptor> getTabbarTabbarListButtonsCompartment_7021SemanticChildren(View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		Tabbar modelElement = (Tabbar) containerView.getElement();
		LinkedList<UidiagramNodeDescriptor> result = new LinkedList<UidiagramNodeDescriptor>();
		for (Iterator<?> it = modelElement.getListButtons().iterator(); it.hasNext();) {
			Button childElement = (Button) it.next();
			int visualID = UidiagramVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == Button2EditPart.VISUAL_ID) {
				result.add(new UidiagramNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	* @generated
	*/
	public static List<UidiagramNodeDescriptor> getTabbarTabbarListLabelsCompartment_7029SemanticChildren(View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		Tabbar modelElement = (Tabbar) containerView.getElement();
		LinkedList<UidiagramNodeDescriptor> result = new LinkedList<UidiagramNodeDescriptor>();
		for (Iterator<?> it = modelElement.getListLabels().iterator(); it.hasNext();) {
			Label childElement = (Label) it.next();
			int visualID = UidiagramVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == Label2EditPart.VISUAL_ID) {
				result.add(new UidiagramNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	* @generated
	*/
	public static List<UidiagramNodeDescriptor> getTableTableListCoulmnsCompartment_7013SemanticChildren(View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		Table modelElement = (Table) containerView.getElement();
		LinkedList<UidiagramNodeDescriptor> result = new LinkedList<UidiagramNodeDescriptor>();
		for (Iterator<?> it = modelElement.getListCoulmns().iterator(); it.hasNext();) {
			Column childElement = (Column) it.next();
			int visualID = UidiagramVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == ColumnEditPart.VISUAL_ID) {
				result.add(new UidiagramNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	* @generated
	*/
	public static List<UidiagramNodeDescriptor> getAppbarAppbarListButtonsCompartment_7022SemanticChildren(View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		Appbar modelElement = (Appbar) containerView.getElement();
		LinkedList<UidiagramNodeDescriptor> result = new LinkedList<UidiagramNodeDescriptor>();
		for (Iterator<?> it = modelElement.getListButtons().iterator(); it.hasNext();) {
			Button childElement = (Button) it.next();
			int visualID = UidiagramVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == ButtonEditPart.VISUAL_ID) {
				result.add(new UidiagramNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	* @generated
	*/
	public static List<UidiagramNodeDescriptor> getAppbarAppbarListLabelsCompartment_7030SemanticChildren(View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		Appbar modelElement = (Appbar) containerView.getElement();
		LinkedList<UidiagramNodeDescriptor> result = new LinkedList<UidiagramNodeDescriptor>();
		for (Iterator<?> it = modelElement.getListLabels().iterator(); it.hasNext();) {
			Label childElement = (Label) it.next();
			int visualID = UidiagramVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == LabelEditPart.VISUAL_ID) {
				result.add(new UidiagramNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	* @generated
	*/
	public static List<UidiagramNodeDescriptor> getTabbarTabbarListButtonsCompartment_7023SemanticChildren(View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		Tabbar modelElement = (Tabbar) containerView.getElement();
		LinkedList<UidiagramNodeDescriptor> result = new LinkedList<UidiagramNodeDescriptor>();
		for (Iterator<?> it = modelElement.getListButtons().iterator(); it.hasNext();) {
			Button childElement = (Button) it.next();
			int visualID = UidiagramVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == Button2EditPart.VISUAL_ID) {
				result.add(new UidiagramNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	* @generated
	*/
	public static List<UidiagramNodeDescriptor> getTabbarTabbarListLabelsCompartment_7031SemanticChildren(View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		Tabbar modelElement = (Tabbar) containerView.getElement();
		LinkedList<UidiagramNodeDescriptor> result = new LinkedList<UidiagramNodeDescriptor>();
		for (Iterator<?> it = modelElement.getListLabels().iterator(); it.hasNext();) {
			Label childElement = (Label) it.next();
			int visualID = UidiagramVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == Label2EditPart.VISUAL_ID) {
				result.add(new UidiagramNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	* @generated
	*/
	public static List<UidiagramNodeDescriptor> getTableTableListCoulmnsCompartment_7014SemanticChildren(View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		Table modelElement = (Table) containerView.getElement();
		LinkedList<UidiagramNodeDescriptor> result = new LinkedList<UidiagramNodeDescriptor>();
		for (Iterator<?> it = modelElement.getListCoulmns().iterator(); it.hasNext();) {
			Column childElement = (Column) it.next();
			int visualID = UidiagramVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == ColumnEditPart.VISUAL_ID) {
				result.add(new UidiagramNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	* @generated
	*/
	public static List<UidiagramNodeDescriptor> getGroupColumnGroupColumnListTemplateWidgetCompartment_7015SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		GroupColumn modelElement = (GroupColumn) containerView.getElement();
		LinkedList<UidiagramNodeDescriptor> result = new LinkedList<UidiagramNodeDescriptor>();
		for (Iterator<?> it = modelElement.getListTemplateWidget().iterator(); it.hasNext();) {
			TemplateWidget childElement = (TemplateWidget) it.next();
			int visualID = UidiagramVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == Group3EditPart.VISUAL_ID) {
				result.add(new UidiagramNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == GroupColumn3EditPart.VISUAL_ID) {
				result.add(new UidiagramNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == GroupRow2EditPart.VISUAL_ID) {
				result.add(new UidiagramNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Appbar3EditPart.VISUAL_ID) {
				result.add(new UidiagramNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Tabbar3EditPart.VISUAL_ID) {
				result.add(new UidiagramNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Button5EditPart.VISUAL_ID) {
				result.add(new UidiagramNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Label5EditPart.VISUAL_ID) {
				result.add(new UidiagramNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Checkbox3EditPart.VISUAL_ID) {
				result.add(new UidiagramNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Input3EditPart.VISUAL_ID) {
				result.add(new UidiagramNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == ListView3EditPart.VISUAL_ID) {
				result.add(new UidiagramNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == RadioButton3EditPart.VISUAL_ID) {
				result.add(new UidiagramNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == ComboBox3EditPart.VISUAL_ID) {
				result.add(new UidiagramNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == DatePicker3EditPart.VISUAL_ID) {
				result.add(new UidiagramNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Switch3EditPart.VISUAL_ID) {
				result.add(new UidiagramNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Table3EditPart.VISUAL_ID) {
				result.add(new UidiagramNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	* @generated
	*/
	public static List<UidiagramNodeDescriptor> getGroupRowGroupRowListTemplateWidgetCompartment_7016SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		GroupRow modelElement = (GroupRow) containerView.getElement();
		LinkedList<UidiagramNodeDescriptor> result = new LinkedList<UidiagramNodeDescriptor>();
		for (Iterator<?> it = modelElement.getListTemplateWidget().iterator(); it.hasNext();) {
			TemplateWidget childElement = (TemplateWidget) it.next();
			int visualID = UidiagramVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == Group4EditPart.VISUAL_ID) {
				result.add(new UidiagramNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == GroupColumn2EditPart.VISUAL_ID) {
				result.add(new UidiagramNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == GroupRow3EditPart.VISUAL_ID) {
				result.add(new UidiagramNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Appbar2EditPart.VISUAL_ID) {
				result.add(new UidiagramNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Tabbar2EditPart.VISUAL_ID) {
				result.add(new UidiagramNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Button4EditPart.VISUAL_ID) {
				result.add(new UidiagramNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Label4EditPart.VISUAL_ID) {
				result.add(new UidiagramNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Checkbox2EditPart.VISUAL_ID) {
				result.add(new UidiagramNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Input2EditPart.VISUAL_ID) {
				result.add(new UidiagramNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == ListView2EditPart.VISUAL_ID) {
				result.add(new UidiagramNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == RadioButton2EditPart.VISUAL_ID) {
				result.add(new UidiagramNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == ComboBox2EditPart.VISUAL_ID) {
				result.add(new UidiagramNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == DatePicker2EditPart.VISUAL_ID) {
				result.add(new UidiagramNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Switch2EditPart.VISUAL_ID) {
				result.add(new UidiagramNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Table2EditPart.VISUAL_ID) {
				result.add(new UidiagramNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	* @generated
	*/
	public static List<UidiagramNodeDescriptor> getAppbarAppbarListButtonsCompartment_7024SemanticChildren(View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		Appbar modelElement = (Appbar) containerView.getElement();
		LinkedList<UidiagramNodeDescriptor> result = new LinkedList<UidiagramNodeDescriptor>();
		for (Iterator<?> it = modelElement.getListButtons().iterator(); it.hasNext();) {
			Button childElement = (Button) it.next();
			int visualID = UidiagramVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == ButtonEditPart.VISUAL_ID) {
				result.add(new UidiagramNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	* @generated
	*/
	public static List<UidiagramNodeDescriptor> getAppbarAppbarListLabelsCompartment_7032SemanticChildren(View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		Appbar modelElement = (Appbar) containerView.getElement();
		LinkedList<UidiagramNodeDescriptor> result = new LinkedList<UidiagramNodeDescriptor>();
		for (Iterator<?> it = modelElement.getListLabels().iterator(); it.hasNext();) {
			Label childElement = (Label) it.next();
			int visualID = UidiagramVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == LabelEditPart.VISUAL_ID) {
				result.add(new UidiagramNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	* @generated
	*/
	public static List<UidiagramNodeDescriptor> getTabbarTabbarListButtonsCompartment_7025SemanticChildren(View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		Tabbar modelElement = (Tabbar) containerView.getElement();
		LinkedList<UidiagramNodeDescriptor> result = new LinkedList<UidiagramNodeDescriptor>();
		for (Iterator<?> it = modelElement.getListButtons().iterator(); it.hasNext();) {
			Button childElement = (Button) it.next();
			int visualID = UidiagramVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == Button2EditPart.VISUAL_ID) {
				result.add(new UidiagramNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	* @generated
	*/
	public static List<UidiagramNodeDescriptor> getTabbarTabbarListLabelsCompartment_7033SemanticChildren(View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		Tabbar modelElement = (Tabbar) containerView.getElement();
		LinkedList<UidiagramNodeDescriptor> result = new LinkedList<UidiagramNodeDescriptor>();
		for (Iterator<?> it = modelElement.getListLabels().iterator(); it.hasNext();) {
			Label childElement = (Label) it.next();
			int visualID = UidiagramVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == Label2EditPart.VISUAL_ID) {
				result.add(new UidiagramNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	* @generated
	*/
	public static List<UidiagramNodeDescriptor> getTableTableListCoulmnsCompartment_7017SemanticChildren(View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		Table modelElement = (Table) containerView.getElement();
		LinkedList<UidiagramNodeDescriptor> result = new LinkedList<UidiagramNodeDescriptor>();
		for (Iterator<?> it = modelElement.getListCoulmns().iterator(); it.hasNext();) {
			Column childElement = (Column) it.next();
			int visualID = UidiagramVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == ColumnEditPart.VISUAL_ID) {
				result.add(new UidiagramNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	* @generated
	*/
	public static List<UidiagramLinkDescriptor> getContainedLinks(View view) {
		switch (UidiagramVisualIDRegistry.getVisualID(view)) {
		case UIDiagramEditPart.VISUAL_ID:
			return getUIDiagram_1000ContainedLinks(view);
		case UserInterfaceEditPart.VISUAL_ID:
			return getUserInterface_2001ContainedLinks(view);
		case GroupEditPart.VISUAL_ID:
			return getGroup_3001ContainedLinks(view);
		case Group2EditPart.VISUAL_ID:
			return getGroup_3002ContainedLinks(view);
		case GroupColumnEditPart.VISUAL_ID:
			return getGroupColumn_3003ContainedLinks(view);
		case Group3EditPart.VISUAL_ID:
			return getGroup_3004ContainedLinks(view);
		case GroupRowEditPart.VISUAL_ID:
			return getGroupRow_3005ContainedLinks(view);
		case Group4EditPart.VISUAL_ID:
			return getGroup_3006ContainedLinks(view);
		case AppbarEditPart.VISUAL_ID:
			return getAppbar_3007ContainedLinks(view);
		case ButtonEditPart.VISUAL_ID:
			return getButton_3062ContainedLinks(view);
		case LabelEditPart.VISUAL_ID:
			return getLabel_3064ContainedLinks(view);
		case TabbarEditPart.VISUAL_ID:
			return getTabbar_3008ContainedLinks(view);
		case Button2EditPart.VISUAL_ID:
			return getButton_3063ContainedLinks(view);
		case Label2EditPart.VISUAL_ID:
			return getLabel_3065ContainedLinks(view);
		case Button3EditPart.VISUAL_ID:
			return getButton_3009ContainedLinks(view);
		case Label3EditPart.VISUAL_ID:
			return getLabel_3010ContainedLinks(view);
		case CheckboxEditPart.VISUAL_ID:
			return getCheckbox_3011ContainedLinks(view);
		case InputEditPart.VISUAL_ID:
			return getInput_3012ContainedLinks(view);
		case ListViewEditPart.VISUAL_ID:
			return getListView_3013ContainedLinks(view);
		case RadioButtonEditPart.VISUAL_ID:
			return getRadioButton_3014ContainedLinks(view);
		case ComboBoxEditPart.VISUAL_ID:
			return getComboBox_3015ContainedLinks(view);
		case DatePickerEditPart.VISUAL_ID:
			return getDatePicker_3016ContainedLinks(view);
		case SwitchEditPart.VISUAL_ID:
			return getSwitch_3017ContainedLinks(view);
		case TableEditPart.VISUAL_ID:
			return getTable_3018ContainedLinks(view);
		case ColumnEditPart.VISUAL_ID:
			return getColumn_3019ContainedLinks(view);
		case GroupColumn2EditPart.VISUAL_ID:
			return getGroupColumn_3020ContainedLinks(view);
		case GroupColumn3EditPart.VISUAL_ID:
			return getGroupColumn_3021ContainedLinks(view);
		case GroupRow2EditPart.VISUAL_ID:
			return getGroupRow_3022ContainedLinks(view);
		case GroupRow3EditPart.VISUAL_ID:
			return getGroupRow_3023ContainedLinks(view);
		case Appbar2EditPart.VISUAL_ID:
			return getAppbar_3024ContainedLinks(view);
		case Tabbar2EditPart.VISUAL_ID:
			return getTabbar_3025ContainedLinks(view);
		case Button4EditPart.VISUAL_ID:
			return getButton_3026ContainedLinks(view);
		case Label4EditPart.VISUAL_ID:
			return getLabel_3027ContainedLinks(view);
		case Checkbox2EditPart.VISUAL_ID:
			return getCheckbox_3028ContainedLinks(view);
		case Input2EditPart.VISUAL_ID:
			return getInput_3029ContainedLinks(view);
		case ListView2EditPart.VISUAL_ID:
			return getListView_3030ContainedLinks(view);
		case RadioButton2EditPart.VISUAL_ID:
			return getRadioButton_3031ContainedLinks(view);
		case ComboBox2EditPart.VISUAL_ID:
			return getComboBox_3032ContainedLinks(view);
		case DatePicker2EditPart.VISUAL_ID:
			return getDatePicker_3033ContainedLinks(view);
		case Switch2EditPart.VISUAL_ID:
			return getSwitch_3034ContainedLinks(view);
		case Table2EditPart.VISUAL_ID:
			return getTable_3035ContainedLinks(view);
		case Appbar3EditPart.VISUAL_ID:
			return getAppbar_3036ContainedLinks(view);
		case Tabbar3EditPart.VISUAL_ID:
			return getTabbar_3037ContainedLinks(view);
		case Button5EditPart.VISUAL_ID:
			return getButton_3038ContainedLinks(view);
		case Label5EditPart.VISUAL_ID:
			return getLabel_3039ContainedLinks(view);
		case Checkbox3EditPart.VISUAL_ID:
			return getCheckbox_3040ContainedLinks(view);
		case Input3EditPart.VISUAL_ID:
			return getInput_3041ContainedLinks(view);
		case ListView3EditPart.VISUAL_ID:
			return getListView_3042ContainedLinks(view);
		case RadioButton3EditPart.VISUAL_ID:
			return getRadioButton_3043ContainedLinks(view);
		case ComboBox3EditPart.VISUAL_ID:
			return getComboBox_3044ContainedLinks(view);
		case DatePicker3EditPart.VISUAL_ID:
			return getDatePicker_3045ContainedLinks(view);
		case Switch3EditPart.VISUAL_ID:
			return getSwitch_3046ContainedLinks(view);
		case Table3EditPart.VISUAL_ID:
			return getTable_3047ContainedLinks(view);
		case GroupColumn4EditPart.VISUAL_ID:
			return getGroupColumn_3048ContainedLinks(view);
		case GroupRow4EditPart.VISUAL_ID:
			return getGroupRow_3049ContainedLinks(view);
		case Appbar4EditPart.VISUAL_ID:
			return getAppbar_3050ContainedLinks(view);
		case Tabbar4EditPart.VISUAL_ID:
			return getTabbar_3051ContainedLinks(view);
		case Button6EditPart.VISUAL_ID:
			return getButton_3052ContainedLinks(view);
		case Label6EditPart.VISUAL_ID:
			return getLabel_3053ContainedLinks(view);
		case Checkbox4EditPart.VISUAL_ID:
			return getCheckbox_3054ContainedLinks(view);
		case Input4EditPart.VISUAL_ID:
			return getInput_3055ContainedLinks(view);
		case ListView4EditPart.VISUAL_ID:
			return getListView_3056ContainedLinks(view);
		case RadioButton4EditPart.VISUAL_ID:
			return getRadioButton_3057ContainedLinks(view);
		case ComboBox4EditPart.VISUAL_ID:
			return getComboBox_3058ContainedLinks(view);
		case DatePicker4EditPart.VISUAL_ID:
			return getDatePicker_3059ContainedLinks(view);
		case Switch4EditPart.VISUAL_ID:
			return getSwitch_3060ContainedLinks(view);
		case Table4EditPart.VISUAL_ID:
			return getTable_3061ContainedLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<UidiagramLinkDescriptor> getIncomingLinks(View view) {
		switch (UidiagramVisualIDRegistry.getVisualID(view)) {
		case UserInterfaceEditPart.VISUAL_ID:
			return getUserInterface_2001IncomingLinks(view);
		case GroupEditPart.VISUAL_ID:
			return getGroup_3001IncomingLinks(view);
		case Group2EditPart.VISUAL_ID:
			return getGroup_3002IncomingLinks(view);
		case GroupColumnEditPart.VISUAL_ID:
			return getGroupColumn_3003IncomingLinks(view);
		case Group3EditPart.VISUAL_ID:
			return getGroup_3004IncomingLinks(view);
		case GroupRowEditPart.VISUAL_ID:
			return getGroupRow_3005IncomingLinks(view);
		case Group4EditPart.VISUAL_ID:
			return getGroup_3006IncomingLinks(view);
		case AppbarEditPart.VISUAL_ID:
			return getAppbar_3007IncomingLinks(view);
		case ButtonEditPart.VISUAL_ID:
			return getButton_3062IncomingLinks(view);
		case LabelEditPart.VISUAL_ID:
			return getLabel_3064IncomingLinks(view);
		case TabbarEditPart.VISUAL_ID:
			return getTabbar_3008IncomingLinks(view);
		case Button2EditPart.VISUAL_ID:
			return getButton_3063IncomingLinks(view);
		case Label2EditPart.VISUAL_ID:
			return getLabel_3065IncomingLinks(view);
		case Button3EditPart.VISUAL_ID:
			return getButton_3009IncomingLinks(view);
		case Label3EditPart.VISUAL_ID:
			return getLabel_3010IncomingLinks(view);
		case CheckboxEditPart.VISUAL_ID:
			return getCheckbox_3011IncomingLinks(view);
		case InputEditPart.VISUAL_ID:
			return getInput_3012IncomingLinks(view);
		case ListViewEditPart.VISUAL_ID:
			return getListView_3013IncomingLinks(view);
		case RadioButtonEditPart.VISUAL_ID:
			return getRadioButton_3014IncomingLinks(view);
		case ComboBoxEditPart.VISUAL_ID:
			return getComboBox_3015IncomingLinks(view);
		case DatePickerEditPart.VISUAL_ID:
			return getDatePicker_3016IncomingLinks(view);
		case SwitchEditPart.VISUAL_ID:
			return getSwitch_3017IncomingLinks(view);
		case TableEditPart.VISUAL_ID:
			return getTable_3018IncomingLinks(view);
		case ColumnEditPart.VISUAL_ID:
			return getColumn_3019IncomingLinks(view);
		case GroupColumn2EditPart.VISUAL_ID:
			return getGroupColumn_3020IncomingLinks(view);
		case GroupColumn3EditPart.VISUAL_ID:
			return getGroupColumn_3021IncomingLinks(view);
		case GroupRow2EditPart.VISUAL_ID:
			return getGroupRow_3022IncomingLinks(view);
		case GroupRow3EditPart.VISUAL_ID:
			return getGroupRow_3023IncomingLinks(view);
		case Appbar2EditPart.VISUAL_ID:
			return getAppbar_3024IncomingLinks(view);
		case Tabbar2EditPart.VISUAL_ID:
			return getTabbar_3025IncomingLinks(view);
		case Button4EditPart.VISUAL_ID:
			return getButton_3026IncomingLinks(view);
		case Label4EditPart.VISUAL_ID:
			return getLabel_3027IncomingLinks(view);
		case Checkbox2EditPart.VISUAL_ID:
			return getCheckbox_3028IncomingLinks(view);
		case Input2EditPart.VISUAL_ID:
			return getInput_3029IncomingLinks(view);
		case ListView2EditPart.VISUAL_ID:
			return getListView_3030IncomingLinks(view);
		case RadioButton2EditPart.VISUAL_ID:
			return getRadioButton_3031IncomingLinks(view);
		case ComboBox2EditPart.VISUAL_ID:
			return getComboBox_3032IncomingLinks(view);
		case DatePicker2EditPart.VISUAL_ID:
			return getDatePicker_3033IncomingLinks(view);
		case Switch2EditPart.VISUAL_ID:
			return getSwitch_3034IncomingLinks(view);
		case Table2EditPart.VISUAL_ID:
			return getTable_3035IncomingLinks(view);
		case Appbar3EditPart.VISUAL_ID:
			return getAppbar_3036IncomingLinks(view);
		case Tabbar3EditPart.VISUAL_ID:
			return getTabbar_3037IncomingLinks(view);
		case Button5EditPart.VISUAL_ID:
			return getButton_3038IncomingLinks(view);
		case Label5EditPart.VISUAL_ID:
			return getLabel_3039IncomingLinks(view);
		case Checkbox3EditPart.VISUAL_ID:
			return getCheckbox_3040IncomingLinks(view);
		case Input3EditPart.VISUAL_ID:
			return getInput_3041IncomingLinks(view);
		case ListView3EditPart.VISUAL_ID:
			return getListView_3042IncomingLinks(view);
		case RadioButton3EditPart.VISUAL_ID:
			return getRadioButton_3043IncomingLinks(view);
		case ComboBox3EditPart.VISUAL_ID:
			return getComboBox_3044IncomingLinks(view);
		case DatePicker3EditPart.VISUAL_ID:
			return getDatePicker_3045IncomingLinks(view);
		case Switch3EditPart.VISUAL_ID:
			return getSwitch_3046IncomingLinks(view);
		case Table3EditPart.VISUAL_ID:
			return getTable_3047IncomingLinks(view);
		case GroupColumn4EditPart.VISUAL_ID:
			return getGroupColumn_3048IncomingLinks(view);
		case GroupRow4EditPart.VISUAL_ID:
			return getGroupRow_3049IncomingLinks(view);
		case Appbar4EditPart.VISUAL_ID:
			return getAppbar_3050IncomingLinks(view);
		case Tabbar4EditPart.VISUAL_ID:
			return getTabbar_3051IncomingLinks(view);
		case Button6EditPart.VISUAL_ID:
			return getButton_3052IncomingLinks(view);
		case Label6EditPart.VISUAL_ID:
			return getLabel_3053IncomingLinks(view);
		case Checkbox4EditPart.VISUAL_ID:
			return getCheckbox_3054IncomingLinks(view);
		case Input4EditPart.VISUAL_ID:
			return getInput_3055IncomingLinks(view);
		case ListView4EditPart.VISUAL_ID:
			return getListView_3056IncomingLinks(view);
		case RadioButton4EditPart.VISUAL_ID:
			return getRadioButton_3057IncomingLinks(view);
		case ComboBox4EditPart.VISUAL_ID:
			return getComboBox_3058IncomingLinks(view);
		case DatePicker4EditPart.VISUAL_ID:
			return getDatePicker_3059IncomingLinks(view);
		case Switch4EditPart.VISUAL_ID:
			return getSwitch_3060IncomingLinks(view);
		case Table4EditPart.VISUAL_ID:
			return getTable_3061IncomingLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<UidiagramLinkDescriptor> getOutgoingLinks(View view) {
		switch (UidiagramVisualIDRegistry.getVisualID(view)) {
		case UserInterfaceEditPart.VISUAL_ID:
			return getUserInterface_2001OutgoingLinks(view);
		case GroupEditPart.VISUAL_ID:
			return getGroup_3001OutgoingLinks(view);
		case Group2EditPart.VISUAL_ID:
			return getGroup_3002OutgoingLinks(view);
		case GroupColumnEditPart.VISUAL_ID:
			return getGroupColumn_3003OutgoingLinks(view);
		case Group3EditPart.VISUAL_ID:
			return getGroup_3004OutgoingLinks(view);
		case GroupRowEditPart.VISUAL_ID:
			return getGroupRow_3005OutgoingLinks(view);
		case Group4EditPart.VISUAL_ID:
			return getGroup_3006OutgoingLinks(view);
		case AppbarEditPart.VISUAL_ID:
			return getAppbar_3007OutgoingLinks(view);
		case ButtonEditPart.VISUAL_ID:
			return getButton_3062OutgoingLinks(view);
		case LabelEditPart.VISUAL_ID:
			return getLabel_3064OutgoingLinks(view);
		case TabbarEditPart.VISUAL_ID:
			return getTabbar_3008OutgoingLinks(view);
		case Button2EditPart.VISUAL_ID:
			return getButton_3063OutgoingLinks(view);
		case Label2EditPart.VISUAL_ID:
			return getLabel_3065OutgoingLinks(view);
		case Button3EditPart.VISUAL_ID:
			return getButton_3009OutgoingLinks(view);
		case Label3EditPart.VISUAL_ID:
			return getLabel_3010OutgoingLinks(view);
		case CheckboxEditPart.VISUAL_ID:
			return getCheckbox_3011OutgoingLinks(view);
		case InputEditPart.VISUAL_ID:
			return getInput_3012OutgoingLinks(view);
		case ListViewEditPart.VISUAL_ID:
			return getListView_3013OutgoingLinks(view);
		case RadioButtonEditPart.VISUAL_ID:
			return getRadioButton_3014OutgoingLinks(view);
		case ComboBoxEditPart.VISUAL_ID:
			return getComboBox_3015OutgoingLinks(view);
		case DatePickerEditPart.VISUAL_ID:
			return getDatePicker_3016OutgoingLinks(view);
		case SwitchEditPart.VISUAL_ID:
			return getSwitch_3017OutgoingLinks(view);
		case TableEditPart.VISUAL_ID:
			return getTable_3018OutgoingLinks(view);
		case ColumnEditPart.VISUAL_ID:
			return getColumn_3019OutgoingLinks(view);
		case GroupColumn2EditPart.VISUAL_ID:
			return getGroupColumn_3020OutgoingLinks(view);
		case GroupColumn3EditPart.VISUAL_ID:
			return getGroupColumn_3021OutgoingLinks(view);
		case GroupRow2EditPart.VISUAL_ID:
			return getGroupRow_3022OutgoingLinks(view);
		case GroupRow3EditPart.VISUAL_ID:
			return getGroupRow_3023OutgoingLinks(view);
		case Appbar2EditPart.VISUAL_ID:
			return getAppbar_3024OutgoingLinks(view);
		case Tabbar2EditPart.VISUAL_ID:
			return getTabbar_3025OutgoingLinks(view);
		case Button4EditPart.VISUAL_ID:
			return getButton_3026OutgoingLinks(view);
		case Label4EditPart.VISUAL_ID:
			return getLabel_3027OutgoingLinks(view);
		case Checkbox2EditPart.VISUAL_ID:
			return getCheckbox_3028OutgoingLinks(view);
		case Input2EditPart.VISUAL_ID:
			return getInput_3029OutgoingLinks(view);
		case ListView2EditPart.VISUAL_ID:
			return getListView_3030OutgoingLinks(view);
		case RadioButton2EditPart.VISUAL_ID:
			return getRadioButton_3031OutgoingLinks(view);
		case ComboBox2EditPart.VISUAL_ID:
			return getComboBox_3032OutgoingLinks(view);
		case DatePicker2EditPart.VISUAL_ID:
			return getDatePicker_3033OutgoingLinks(view);
		case Switch2EditPart.VISUAL_ID:
			return getSwitch_3034OutgoingLinks(view);
		case Table2EditPart.VISUAL_ID:
			return getTable_3035OutgoingLinks(view);
		case Appbar3EditPart.VISUAL_ID:
			return getAppbar_3036OutgoingLinks(view);
		case Tabbar3EditPart.VISUAL_ID:
			return getTabbar_3037OutgoingLinks(view);
		case Button5EditPart.VISUAL_ID:
			return getButton_3038OutgoingLinks(view);
		case Label5EditPart.VISUAL_ID:
			return getLabel_3039OutgoingLinks(view);
		case Checkbox3EditPart.VISUAL_ID:
			return getCheckbox_3040OutgoingLinks(view);
		case Input3EditPart.VISUAL_ID:
			return getInput_3041OutgoingLinks(view);
		case ListView3EditPart.VISUAL_ID:
			return getListView_3042OutgoingLinks(view);
		case RadioButton3EditPart.VISUAL_ID:
			return getRadioButton_3043OutgoingLinks(view);
		case ComboBox3EditPart.VISUAL_ID:
			return getComboBox_3044OutgoingLinks(view);
		case DatePicker3EditPart.VISUAL_ID:
			return getDatePicker_3045OutgoingLinks(view);
		case Switch3EditPart.VISUAL_ID:
			return getSwitch_3046OutgoingLinks(view);
		case Table3EditPart.VISUAL_ID:
			return getTable_3047OutgoingLinks(view);
		case GroupColumn4EditPart.VISUAL_ID:
			return getGroupColumn_3048OutgoingLinks(view);
		case GroupRow4EditPart.VISUAL_ID:
			return getGroupRow_3049OutgoingLinks(view);
		case Appbar4EditPart.VISUAL_ID:
			return getAppbar_3050OutgoingLinks(view);
		case Tabbar4EditPart.VISUAL_ID:
			return getTabbar_3051OutgoingLinks(view);
		case Button6EditPart.VISUAL_ID:
			return getButton_3052OutgoingLinks(view);
		case Label6EditPart.VISUAL_ID:
			return getLabel_3053OutgoingLinks(view);
		case Checkbox4EditPart.VISUAL_ID:
			return getCheckbox_3054OutgoingLinks(view);
		case Input4EditPart.VISUAL_ID:
			return getInput_3055OutgoingLinks(view);
		case ListView4EditPart.VISUAL_ID:
			return getListView_3056OutgoingLinks(view);
		case RadioButton4EditPart.VISUAL_ID:
			return getRadioButton_3057OutgoingLinks(view);
		case ComboBox4EditPart.VISUAL_ID:
			return getComboBox_3058OutgoingLinks(view);
		case DatePicker4EditPart.VISUAL_ID:
			return getDatePicker_3059OutgoingLinks(view);
		case Switch4EditPart.VISUAL_ID:
			return getSwitch_3060OutgoingLinks(view);
		case Table4EditPart.VISUAL_ID:
			return getTable_3061OutgoingLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<UidiagramLinkDescriptor> getUIDiagram_1000ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<UidiagramLinkDescriptor> getUserInterface_2001ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<UidiagramLinkDescriptor> getGroup_3001ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<UidiagramLinkDescriptor> getGroup_3002ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<UidiagramLinkDescriptor> getGroupColumn_3003ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<UidiagramLinkDescriptor> getGroup_3004ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<UidiagramLinkDescriptor> getGroupRow_3005ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<UidiagramLinkDescriptor> getGroup_3006ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<UidiagramLinkDescriptor> getAppbar_3007ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<UidiagramLinkDescriptor> getButton_3062ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<UidiagramLinkDescriptor> getLabel_3064ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<UidiagramLinkDescriptor> getTabbar_3008ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<UidiagramLinkDescriptor> getButton_3063ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<UidiagramLinkDescriptor> getLabel_3065ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<UidiagramLinkDescriptor> getButton_3009ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<UidiagramLinkDescriptor> getLabel_3010ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<UidiagramLinkDescriptor> getCheckbox_3011ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<UidiagramLinkDescriptor> getInput_3012ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<UidiagramLinkDescriptor> getListView_3013ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<UidiagramLinkDescriptor> getRadioButton_3014ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<UidiagramLinkDescriptor> getComboBox_3015ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<UidiagramLinkDescriptor> getDatePicker_3016ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<UidiagramLinkDescriptor> getSwitch_3017ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<UidiagramLinkDescriptor> getTable_3018ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<UidiagramLinkDescriptor> getColumn_3019ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<UidiagramLinkDescriptor> getGroupColumn_3020ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<UidiagramLinkDescriptor> getGroupColumn_3021ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<UidiagramLinkDescriptor> getGroupRow_3022ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<UidiagramLinkDescriptor> getGroupRow_3023ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<UidiagramLinkDescriptor> getAppbar_3024ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<UidiagramLinkDescriptor> getTabbar_3025ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<UidiagramLinkDescriptor> getButton_3026ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<UidiagramLinkDescriptor> getLabel_3027ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<UidiagramLinkDescriptor> getCheckbox_3028ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<UidiagramLinkDescriptor> getInput_3029ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<UidiagramLinkDescriptor> getListView_3030ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<UidiagramLinkDescriptor> getRadioButton_3031ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<UidiagramLinkDescriptor> getComboBox_3032ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<UidiagramLinkDescriptor> getDatePicker_3033ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<UidiagramLinkDescriptor> getSwitch_3034ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<UidiagramLinkDescriptor> getTable_3035ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<UidiagramLinkDescriptor> getAppbar_3036ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<UidiagramLinkDescriptor> getTabbar_3037ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<UidiagramLinkDescriptor> getButton_3038ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<UidiagramLinkDescriptor> getLabel_3039ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<UidiagramLinkDescriptor> getCheckbox_3040ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<UidiagramLinkDescriptor> getInput_3041ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<UidiagramLinkDescriptor> getListView_3042ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<UidiagramLinkDescriptor> getRadioButton_3043ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<UidiagramLinkDescriptor> getComboBox_3044ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<UidiagramLinkDescriptor> getDatePicker_3045ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<UidiagramLinkDescriptor> getSwitch_3046ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<UidiagramLinkDescriptor> getTable_3047ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<UidiagramLinkDescriptor> getGroupColumn_3048ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<UidiagramLinkDescriptor> getGroupRow_3049ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<UidiagramLinkDescriptor> getAppbar_3050ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<UidiagramLinkDescriptor> getTabbar_3051ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<UidiagramLinkDescriptor> getButton_3052ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<UidiagramLinkDescriptor> getLabel_3053ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<UidiagramLinkDescriptor> getCheckbox_3054ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<UidiagramLinkDescriptor> getInput_3055ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<UidiagramLinkDescriptor> getListView_3056ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<UidiagramLinkDescriptor> getRadioButton_3057ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<UidiagramLinkDescriptor> getComboBox_3058ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<UidiagramLinkDescriptor> getDatePicker_3059ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<UidiagramLinkDescriptor> getSwitch_3060ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<UidiagramLinkDescriptor> getTable_3061ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<UidiagramLinkDescriptor> getUserInterface_2001IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<UidiagramLinkDescriptor> getGroup_3001IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<UidiagramLinkDescriptor> getGroup_3002IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<UidiagramLinkDescriptor> getGroupColumn_3003IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<UidiagramLinkDescriptor> getGroup_3004IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<UidiagramLinkDescriptor> getGroupRow_3005IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<UidiagramLinkDescriptor> getGroup_3006IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<UidiagramLinkDescriptor> getAppbar_3007IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<UidiagramLinkDescriptor> getButton_3062IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<UidiagramLinkDescriptor> getLabel_3064IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<UidiagramLinkDescriptor> getTabbar_3008IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<UidiagramLinkDescriptor> getButton_3063IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<UidiagramLinkDescriptor> getLabel_3065IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<UidiagramLinkDescriptor> getButton_3009IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<UidiagramLinkDescriptor> getLabel_3010IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<UidiagramLinkDescriptor> getCheckbox_3011IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<UidiagramLinkDescriptor> getInput_3012IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<UidiagramLinkDescriptor> getListView_3013IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<UidiagramLinkDescriptor> getRadioButton_3014IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<UidiagramLinkDescriptor> getComboBox_3015IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<UidiagramLinkDescriptor> getDatePicker_3016IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<UidiagramLinkDescriptor> getSwitch_3017IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<UidiagramLinkDescriptor> getTable_3018IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<UidiagramLinkDescriptor> getColumn_3019IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<UidiagramLinkDescriptor> getGroupColumn_3020IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<UidiagramLinkDescriptor> getGroupColumn_3021IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<UidiagramLinkDescriptor> getGroupRow_3022IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<UidiagramLinkDescriptor> getGroupRow_3023IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<UidiagramLinkDescriptor> getAppbar_3024IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<UidiagramLinkDescriptor> getTabbar_3025IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<UidiagramLinkDescriptor> getButton_3026IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<UidiagramLinkDescriptor> getLabel_3027IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<UidiagramLinkDescriptor> getCheckbox_3028IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<UidiagramLinkDescriptor> getInput_3029IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<UidiagramLinkDescriptor> getListView_3030IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<UidiagramLinkDescriptor> getRadioButton_3031IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<UidiagramLinkDescriptor> getComboBox_3032IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<UidiagramLinkDescriptor> getDatePicker_3033IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<UidiagramLinkDescriptor> getSwitch_3034IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<UidiagramLinkDescriptor> getTable_3035IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<UidiagramLinkDescriptor> getAppbar_3036IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<UidiagramLinkDescriptor> getTabbar_3037IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<UidiagramLinkDescriptor> getButton_3038IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<UidiagramLinkDescriptor> getLabel_3039IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<UidiagramLinkDescriptor> getCheckbox_3040IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<UidiagramLinkDescriptor> getInput_3041IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<UidiagramLinkDescriptor> getListView_3042IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<UidiagramLinkDescriptor> getRadioButton_3043IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<UidiagramLinkDescriptor> getComboBox_3044IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<UidiagramLinkDescriptor> getDatePicker_3045IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<UidiagramLinkDescriptor> getSwitch_3046IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<UidiagramLinkDescriptor> getTable_3047IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<UidiagramLinkDescriptor> getGroupColumn_3048IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<UidiagramLinkDescriptor> getGroupRow_3049IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<UidiagramLinkDescriptor> getAppbar_3050IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<UidiagramLinkDescriptor> getTabbar_3051IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<UidiagramLinkDescriptor> getButton_3052IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<UidiagramLinkDescriptor> getLabel_3053IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<UidiagramLinkDescriptor> getCheckbox_3054IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<UidiagramLinkDescriptor> getInput_3055IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<UidiagramLinkDescriptor> getListView_3056IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<UidiagramLinkDescriptor> getRadioButton_3057IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<UidiagramLinkDescriptor> getComboBox_3058IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<UidiagramLinkDescriptor> getDatePicker_3059IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<UidiagramLinkDescriptor> getSwitch_3060IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<UidiagramLinkDescriptor> getTable_3061IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<UidiagramLinkDescriptor> getUserInterface_2001OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<UidiagramLinkDescriptor> getGroup_3001OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<UidiagramLinkDescriptor> getGroup_3002OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<UidiagramLinkDescriptor> getGroupColumn_3003OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<UidiagramLinkDescriptor> getGroup_3004OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<UidiagramLinkDescriptor> getGroupRow_3005OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<UidiagramLinkDescriptor> getGroup_3006OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<UidiagramLinkDescriptor> getAppbar_3007OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<UidiagramLinkDescriptor> getButton_3062OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<UidiagramLinkDescriptor> getLabel_3064OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<UidiagramLinkDescriptor> getTabbar_3008OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<UidiagramLinkDescriptor> getButton_3063OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<UidiagramLinkDescriptor> getLabel_3065OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<UidiagramLinkDescriptor> getButton_3009OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<UidiagramLinkDescriptor> getLabel_3010OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<UidiagramLinkDescriptor> getCheckbox_3011OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<UidiagramLinkDescriptor> getInput_3012OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<UidiagramLinkDescriptor> getListView_3013OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<UidiagramLinkDescriptor> getRadioButton_3014OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<UidiagramLinkDescriptor> getComboBox_3015OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<UidiagramLinkDescriptor> getDatePicker_3016OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<UidiagramLinkDescriptor> getSwitch_3017OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<UidiagramLinkDescriptor> getTable_3018OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<UidiagramLinkDescriptor> getColumn_3019OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<UidiagramLinkDescriptor> getGroupColumn_3020OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<UidiagramLinkDescriptor> getGroupColumn_3021OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<UidiagramLinkDescriptor> getGroupRow_3022OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<UidiagramLinkDescriptor> getGroupRow_3023OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<UidiagramLinkDescriptor> getAppbar_3024OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<UidiagramLinkDescriptor> getTabbar_3025OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<UidiagramLinkDescriptor> getButton_3026OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<UidiagramLinkDescriptor> getLabel_3027OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<UidiagramLinkDescriptor> getCheckbox_3028OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<UidiagramLinkDescriptor> getInput_3029OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<UidiagramLinkDescriptor> getListView_3030OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<UidiagramLinkDescriptor> getRadioButton_3031OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<UidiagramLinkDescriptor> getComboBox_3032OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<UidiagramLinkDescriptor> getDatePicker_3033OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<UidiagramLinkDescriptor> getSwitch_3034OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<UidiagramLinkDescriptor> getTable_3035OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<UidiagramLinkDescriptor> getAppbar_3036OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<UidiagramLinkDescriptor> getTabbar_3037OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<UidiagramLinkDescriptor> getButton_3038OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<UidiagramLinkDescriptor> getLabel_3039OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<UidiagramLinkDescriptor> getCheckbox_3040OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<UidiagramLinkDescriptor> getInput_3041OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<UidiagramLinkDescriptor> getListView_3042OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<UidiagramLinkDescriptor> getRadioButton_3043OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<UidiagramLinkDescriptor> getComboBox_3044OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<UidiagramLinkDescriptor> getDatePicker_3045OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<UidiagramLinkDescriptor> getSwitch_3046OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<UidiagramLinkDescriptor> getTable_3047OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<UidiagramLinkDescriptor> getGroupColumn_3048OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<UidiagramLinkDescriptor> getGroupRow_3049OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<UidiagramLinkDescriptor> getAppbar_3050OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<UidiagramLinkDescriptor> getTabbar_3051OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<UidiagramLinkDescriptor> getButton_3052OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<UidiagramLinkDescriptor> getLabel_3053OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<UidiagramLinkDescriptor> getCheckbox_3054OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<UidiagramLinkDescriptor> getInput_3055OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<UidiagramLinkDescriptor> getListView_3056OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<UidiagramLinkDescriptor> getRadioButton_3057OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<UidiagramLinkDescriptor> getComboBox_3058OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<UidiagramLinkDescriptor> getDatePicker_3059OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<UidiagramLinkDescriptor> getSwitch_3060OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<UidiagramLinkDescriptor> getTable_3061OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static final DiagramUpdater TYPED_INSTANCE = new DiagramUpdater() {
		/**
		* @generated
		*/
		@Override

		public List<UidiagramNodeDescriptor> getSemanticChildren(View view) {
			return UidiagramDiagramUpdater.getSemanticChildren(view);
		}

		/**
		* @generated
		*/
		@Override

		public List<UidiagramLinkDescriptor> getContainedLinks(View view) {
			return UidiagramDiagramUpdater.getContainedLinks(view);
		}

		/**
		* @generated
		*/
		@Override

		public List<UidiagramLinkDescriptor> getIncomingLinks(View view) {
			return UidiagramDiagramUpdater.getIncomingLinks(view);
		}

		/**
		* @generated
		*/
		@Override

		public List<UidiagramLinkDescriptor> getOutgoingLinks(View view) {
			return UidiagramDiagramUpdater.getOutgoingLinks(view);
		}
	};

}
