/**
 */
package uidiagram.provider;


import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

import uidiagram.GroupColumn;
import uidiagram.UidiagramFactory;
import uidiagram.UidiagramPackage;

/**
 * This is the item provider adapter for a {@link uidiagram.GroupColumn} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class GroupColumnItemProvider extends TemplateWidgetItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GroupColumnItemProvider(AdapterFactory adapterFactory) {
		super(adapterFactory);
	}

	/**
	 * This returns the property descriptors for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<IItemPropertyDescriptor> getPropertyDescriptors(Object object) {
		if (itemPropertyDescriptors == null) {
			super.getPropertyDescriptors(object);

		}
		return itemPropertyDescriptors;
	}

	/**
	 * This specifies how to implement {@link #getChildren} and is used to deduce an appropriate feature for an
	 * {@link org.eclipse.emf.edit.command.AddCommand}, {@link org.eclipse.emf.edit.command.RemoveCommand} or
	 * {@link org.eclipse.emf.edit.command.MoveCommand} in {@link #createCommand}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Collection<? extends EStructuralFeature> getChildrenFeatures(Object object) {
		if (childrenFeatures == null) {
			super.getChildrenFeatures(object);
			childrenFeatures.add(UidiagramPackage.Literals.GROUP_COLUMN__LIST_TEMPLATE_WIDGET);
		}
		return childrenFeatures;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EStructuralFeature getChildFeature(Object object, Object child) {
		// Check the type of the specified child object and return the proper feature to use for
		// adding (see {@link AddCommand}) it as a child.

		return super.getChildFeature(object, child);
	}

	/**
	 * This returns GroupColumn.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/GroupColumn"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((GroupColumn)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_GroupColumn_type") :
			getString("_UI_GroupColumn_type") + " " + label;
	}


	/**
	 * This handles model notifications by calling {@link #updateChildren} to update any cached
	 * children and by creating a viewer notification, which it passes to {@link #fireNotifyChanged}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void notifyChanged(Notification notification) {
		updateChildren(notification);

		switch (notification.getFeatureID(GroupColumn.class)) {
			case UidiagramPackage.GROUP_COLUMN__LIST_TEMPLATE_WIDGET:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), true, false));
				return;
		}
		super.notifyChanged(notification);
	}

	/**
	 * This adds {@link org.eclipse.emf.edit.command.CommandParameter}s describing the children
	 * that can be created under this object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected void collectNewChildDescriptors(Collection<Object> newChildDescriptors, Object object) {
		super.collectNewChildDescriptors(newChildDescriptors, object);

		newChildDescriptors.add
			(createChildParameter
				(UidiagramPackage.Literals.GROUP_COLUMN__LIST_TEMPLATE_WIDGET,
				 UidiagramFactory.eINSTANCE.createTemplateWidget()));

		newChildDescriptors.add
			(createChildParameter
				(UidiagramPackage.Literals.GROUP_COLUMN__LIST_TEMPLATE_WIDGET,
				 UidiagramFactory.eINSTANCE.createGroup()));

		newChildDescriptors.add
			(createChildParameter
				(UidiagramPackage.Literals.GROUP_COLUMN__LIST_TEMPLATE_WIDGET,
				 UidiagramFactory.eINSTANCE.createGroupColumn()));

		newChildDescriptors.add
			(createChildParameter
				(UidiagramPackage.Literals.GROUP_COLUMN__LIST_TEMPLATE_WIDGET,
				 UidiagramFactory.eINSTANCE.createGroupRow()));

		newChildDescriptors.add
			(createChildParameter
				(UidiagramPackage.Literals.GROUP_COLUMN__LIST_TEMPLATE_WIDGET,
				 UidiagramFactory.eINSTANCE.createAppbar()));

		newChildDescriptors.add
			(createChildParameter
				(UidiagramPackage.Literals.GROUP_COLUMN__LIST_TEMPLATE_WIDGET,
				 UidiagramFactory.eINSTANCE.createTabbar()));

		newChildDescriptors.add
			(createChildParameter
				(UidiagramPackage.Literals.GROUP_COLUMN__LIST_TEMPLATE_WIDGET,
				 UidiagramFactory.eINSTANCE.createButton()));

		newChildDescriptors.add
			(createChildParameter
				(UidiagramPackage.Literals.GROUP_COLUMN__LIST_TEMPLATE_WIDGET,
				 UidiagramFactory.eINSTANCE.createLabel()));

		newChildDescriptors.add
			(createChildParameter
				(UidiagramPackage.Literals.GROUP_COLUMN__LIST_TEMPLATE_WIDGET,
				 UidiagramFactory.eINSTANCE.createCheckbox()));

		newChildDescriptors.add
			(createChildParameter
				(UidiagramPackage.Literals.GROUP_COLUMN__LIST_TEMPLATE_WIDGET,
				 UidiagramFactory.eINSTANCE.createInput()));

		newChildDescriptors.add
			(createChildParameter
				(UidiagramPackage.Literals.GROUP_COLUMN__LIST_TEMPLATE_WIDGET,
				 UidiagramFactory.eINSTANCE.createListView()));

		newChildDescriptors.add
			(createChildParameter
				(UidiagramPackage.Literals.GROUP_COLUMN__LIST_TEMPLATE_WIDGET,
				 UidiagramFactory.eINSTANCE.createRadioButton()));

		newChildDescriptors.add
			(createChildParameter
				(UidiagramPackage.Literals.GROUP_COLUMN__LIST_TEMPLATE_WIDGET,
				 UidiagramFactory.eINSTANCE.createComboBox()));

		newChildDescriptors.add
			(createChildParameter
				(UidiagramPackage.Literals.GROUP_COLUMN__LIST_TEMPLATE_WIDGET,
				 UidiagramFactory.eINSTANCE.createDatePicker()));

		newChildDescriptors.add
			(createChildParameter
				(UidiagramPackage.Literals.GROUP_COLUMN__LIST_TEMPLATE_WIDGET,
				 UidiagramFactory.eINSTANCE.createSwitch()));

		newChildDescriptors.add
			(createChildParameter
				(UidiagramPackage.Literals.GROUP_COLUMN__LIST_TEMPLATE_WIDGET,
				 UidiagramFactory.eINSTANCE.createTable()));
	}

}
