/**
 */
package uidiagram.provider;


import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemProviderAdapter;
import org.eclipse.emf.edit.provider.ViewerNotification;

import uidiagram.UidiagramFactory;
import uidiagram.UidiagramPackage;
import uidiagram.UserInterface;

/**
 * This is the item provider adapter for a {@link uidiagram.UserInterface} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class UserInterfaceItemProvider 
	extends ItemProviderAdapter
	implements
		IEditingDomainItemProvider,
		IStructuredItemContentProvider,
		ITreeItemContentProvider,
		IItemLabelProvider,
		IItemPropertySource {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UserInterfaceItemProvider(AdapterFactory adapterFactory) {
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

			addIdInterfacePropertyDescriptor(object);
			addNamePropertyDescriptor(object);
			addPositionXPropertyDescriptor(object);
			addPositionYPropertyDescriptor(object);
			addWidthPropertyDescriptor(object);
			addHeightPropertyDescriptor(object);
			addBackgroundColorPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Id Interface feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addIdInterfacePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_UserInterface_idInterface_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_UserInterface_idInterface_feature", "_UI_UserInterface_type"),
				 UidiagramPackage.Literals.USER_INTERFACE__ID_INTERFACE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Name feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addNamePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_UserInterface_name_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_UserInterface_name_feature", "_UI_UserInterface_type"),
				 UidiagramPackage.Literals.USER_INTERFACE__NAME,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Position X feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addPositionXPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_UserInterface_positionX_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_UserInterface_positionX_feature", "_UI_UserInterface_type"),
				 UidiagramPackage.Literals.USER_INTERFACE__POSITION_X,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Position Y feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addPositionYPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_UserInterface_positionY_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_UserInterface_positionY_feature", "_UI_UserInterface_type"),
				 UidiagramPackage.Literals.USER_INTERFACE__POSITION_Y,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Width feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addWidthPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_UserInterface_width_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_UserInterface_width_feature", "_UI_UserInterface_type"),
				 UidiagramPackage.Literals.USER_INTERFACE__WIDTH,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.REAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Height feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addHeightPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_UserInterface_height_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_UserInterface_height_feature", "_UI_UserInterface_type"),
				 UidiagramPackage.Literals.USER_INTERFACE__HEIGHT,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.REAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Background Color feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addBackgroundColorPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_UserInterface_backgroundColor_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_UserInterface_backgroundColor_feature", "_UI_UserInterface_type"),
				 UidiagramPackage.Literals.USER_INTERFACE__BACKGROUND_COLOR,
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
			childrenFeatures.add(UidiagramPackage.Literals.USER_INTERFACE__LIST_TEMPLATE_WIDGET);
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
	 * This returns UserInterface.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/UserInterface"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((UserInterface)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_UserInterface_type") :
			getString("_UI_UserInterface_type") + " " + label;
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

		switch (notification.getFeatureID(UserInterface.class)) {
			case UidiagramPackage.USER_INTERFACE__ID_INTERFACE:
			case UidiagramPackage.USER_INTERFACE__NAME:
			case UidiagramPackage.USER_INTERFACE__POSITION_X:
			case UidiagramPackage.USER_INTERFACE__POSITION_Y:
			case UidiagramPackage.USER_INTERFACE__WIDTH:
			case UidiagramPackage.USER_INTERFACE__HEIGHT:
			case UidiagramPackage.USER_INTERFACE__BACKGROUND_COLOR:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case UidiagramPackage.USER_INTERFACE__LIST_TEMPLATE_WIDGET:
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
				(UidiagramPackage.Literals.USER_INTERFACE__LIST_TEMPLATE_WIDGET,
				 UidiagramFactory.eINSTANCE.createTemplateWidget()));

		newChildDescriptors.add
			(createChildParameter
				(UidiagramPackage.Literals.USER_INTERFACE__LIST_TEMPLATE_WIDGET,
				 UidiagramFactory.eINSTANCE.createGroup()));

		newChildDescriptors.add
			(createChildParameter
				(UidiagramPackage.Literals.USER_INTERFACE__LIST_TEMPLATE_WIDGET,
				 UidiagramFactory.eINSTANCE.createGroupColumn()));

		newChildDescriptors.add
			(createChildParameter
				(UidiagramPackage.Literals.USER_INTERFACE__LIST_TEMPLATE_WIDGET,
				 UidiagramFactory.eINSTANCE.createGroupRow()));

		newChildDescriptors.add
			(createChildParameter
				(UidiagramPackage.Literals.USER_INTERFACE__LIST_TEMPLATE_WIDGET,
				 UidiagramFactory.eINSTANCE.createAppbar()));

		newChildDescriptors.add
			(createChildParameter
				(UidiagramPackage.Literals.USER_INTERFACE__LIST_TEMPLATE_WIDGET,
				 UidiagramFactory.eINSTANCE.createTabbar()));

		newChildDescriptors.add
			(createChildParameter
				(UidiagramPackage.Literals.USER_INTERFACE__LIST_TEMPLATE_WIDGET,
				 UidiagramFactory.eINSTANCE.createButton()));

		newChildDescriptors.add
			(createChildParameter
				(UidiagramPackage.Literals.USER_INTERFACE__LIST_TEMPLATE_WIDGET,
				 UidiagramFactory.eINSTANCE.createLabel()));

		newChildDescriptors.add
			(createChildParameter
				(UidiagramPackage.Literals.USER_INTERFACE__LIST_TEMPLATE_WIDGET,
				 UidiagramFactory.eINSTANCE.createCheckbox()));

		newChildDescriptors.add
			(createChildParameter
				(UidiagramPackage.Literals.USER_INTERFACE__LIST_TEMPLATE_WIDGET,
				 UidiagramFactory.eINSTANCE.createInput()));

		newChildDescriptors.add
			(createChildParameter
				(UidiagramPackage.Literals.USER_INTERFACE__LIST_TEMPLATE_WIDGET,
				 UidiagramFactory.eINSTANCE.createListView()));

		newChildDescriptors.add
			(createChildParameter
				(UidiagramPackage.Literals.USER_INTERFACE__LIST_TEMPLATE_WIDGET,
				 UidiagramFactory.eINSTANCE.createRadioButton()));

		newChildDescriptors.add
			(createChildParameter
				(UidiagramPackage.Literals.USER_INTERFACE__LIST_TEMPLATE_WIDGET,
				 UidiagramFactory.eINSTANCE.createComboBox()));

		newChildDescriptors.add
			(createChildParameter
				(UidiagramPackage.Literals.USER_INTERFACE__LIST_TEMPLATE_WIDGET,
				 UidiagramFactory.eINSTANCE.createDatePicker()));

		newChildDescriptors.add
			(createChildParameter
				(UidiagramPackage.Literals.USER_INTERFACE__LIST_TEMPLATE_WIDGET,
				 UidiagramFactory.eINSTANCE.createSwitch()));

		newChildDescriptors.add
			(createChildParameter
				(UidiagramPackage.Literals.USER_INTERFACE__LIST_TEMPLATE_WIDGET,
				 UidiagramFactory.eINSTANCE.createTable()));
	}

	/**
	 * Return the resource locator for this item provider's resources.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		return UidiagramEditPlugin.INSTANCE;
	}

}
