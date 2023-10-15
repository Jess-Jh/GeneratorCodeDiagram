/**
 */
package uidiagram.provider;


import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

import uidiagram.Group;
import uidiagram.UidiagramFactory;
import uidiagram.UidiagramPackage;

/**
 * This is the item provider adapter for a {@link uidiagram.Group} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class GroupItemProvider extends TemplateWidgetItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GroupItemProvider(AdapterFactory adapterFactory) {
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

			addBorderRadiusPropertyDescriptor(object);
			addBorderWidthPropertyDescriptor(object);
			addBorderColorPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Border Radius feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addBorderRadiusPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Group_borderRadius_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Group_borderRadius_feature", "_UI_Group_type"),
				 UidiagramPackage.Literals.GROUP__BORDER_RADIUS,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Border Width feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addBorderWidthPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Group_borderWidth_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Group_borderWidth_feature", "_UI_Group_type"),
				 UidiagramPackage.Literals.GROUP__BORDER_WIDTH,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Border Color feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addBorderColorPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Group_borderColor_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Group_borderColor_feature", "_UI_Group_type"),
				 UidiagramPackage.Literals.GROUP__BORDER_COLOR,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
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
			childrenFeatures.add(UidiagramPackage.Literals.GROUP__LIST_TEMPLATE_WIDGET);
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
	 * This returns Group.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/Group"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((Group)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_Group_type") :
			getString("_UI_Group_type") + " " + label;
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

		switch (notification.getFeatureID(Group.class)) {
			case UidiagramPackage.GROUP__BORDER_RADIUS:
			case UidiagramPackage.GROUP__BORDER_WIDTH:
			case UidiagramPackage.GROUP__BORDER_COLOR:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case UidiagramPackage.GROUP__LIST_TEMPLATE_WIDGET:
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
				(UidiagramPackage.Literals.GROUP__LIST_TEMPLATE_WIDGET,
				 UidiagramFactory.eINSTANCE.createTemplateWidget()));

		newChildDescriptors.add
			(createChildParameter
				(UidiagramPackage.Literals.GROUP__LIST_TEMPLATE_WIDGET,
				 UidiagramFactory.eINSTANCE.createGroup()));

		newChildDescriptors.add
			(createChildParameter
				(UidiagramPackage.Literals.GROUP__LIST_TEMPLATE_WIDGET,
				 UidiagramFactory.eINSTANCE.createGroupColumn()));

		newChildDescriptors.add
			(createChildParameter
				(UidiagramPackage.Literals.GROUP__LIST_TEMPLATE_WIDGET,
				 UidiagramFactory.eINSTANCE.createGroupRow()));

		newChildDescriptors.add
			(createChildParameter
				(UidiagramPackage.Literals.GROUP__LIST_TEMPLATE_WIDGET,
				 UidiagramFactory.eINSTANCE.createAppbar()));

		newChildDescriptors.add
			(createChildParameter
				(UidiagramPackage.Literals.GROUP__LIST_TEMPLATE_WIDGET,
				 UidiagramFactory.eINSTANCE.createTabbar()));

		newChildDescriptors.add
			(createChildParameter
				(UidiagramPackage.Literals.GROUP__LIST_TEMPLATE_WIDGET,
				 UidiagramFactory.eINSTANCE.createButton()));

		newChildDescriptors.add
			(createChildParameter
				(UidiagramPackage.Literals.GROUP__LIST_TEMPLATE_WIDGET,
				 UidiagramFactory.eINSTANCE.createLabel()));

		newChildDescriptors.add
			(createChildParameter
				(UidiagramPackage.Literals.GROUP__LIST_TEMPLATE_WIDGET,
				 UidiagramFactory.eINSTANCE.createCheckbox()));

		newChildDescriptors.add
			(createChildParameter
				(UidiagramPackage.Literals.GROUP__LIST_TEMPLATE_WIDGET,
				 UidiagramFactory.eINSTANCE.createInput()));

		newChildDescriptors.add
			(createChildParameter
				(UidiagramPackage.Literals.GROUP__LIST_TEMPLATE_WIDGET,
				 UidiagramFactory.eINSTANCE.createListView()));

		newChildDescriptors.add
			(createChildParameter
				(UidiagramPackage.Literals.GROUP__LIST_TEMPLATE_WIDGET,
				 UidiagramFactory.eINSTANCE.createRadioButton()));

		newChildDescriptors.add
			(createChildParameter
				(UidiagramPackage.Literals.GROUP__LIST_TEMPLATE_WIDGET,
				 UidiagramFactory.eINSTANCE.createComboBox()));

		newChildDescriptors.add
			(createChildParameter
				(UidiagramPackage.Literals.GROUP__LIST_TEMPLATE_WIDGET,
				 UidiagramFactory.eINSTANCE.createDatePicker()));

		newChildDescriptors.add
			(createChildParameter
				(UidiagramPackage.Literals.GROUP__LIST_TEMPLATE_WIDGET,
				 UidiagramFactory.eINSTANCE.createSwitch()));

		newChildDescriptors.add
			(createChildParameter
				(UidiagramPackage.Literals.GROUP__LIST_TEMPLATE_WIDGET,
				 UidiagramFactory.eINSTANCE.createTable()));
	}

}
