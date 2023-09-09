/**
 */
package abstractJJD.provider;


import abstractJJD.AbstractJJDFactory;
import abstractJJD.AbstractJJDPackage;
import abstractJJD.ClassJJD;

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

/**
 * This is the item provider adapter for a {@link abstractJJD.ClassJJD} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class ClassJJDItemProvider 
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
	public ClassJJDItemProvider(AdapterFactory adapterFactory) {
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

			addNamePropertyDescriptor(object);
			addDescriptionPropertyDescriptor(object);
			addIsAbstractPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
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
				 getString("_UI_ClassJJD_name_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ClassJJD_name_feature", "_UI_ClassJJD_type"),
				 AbstractJJDPackage.Literals.CLASS_JJD__NAME,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Description feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDescriptionPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ClassJJD_description_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ClassJJD_description_feature", "_UI_ClassJJD_type"),
				 AbstractJJDPackage.Literals.CLASS_JJD__DESCRIPTION,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Is Abstract feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addIsAbstractPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ClassJJD_isAbstract_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ClassJJD_isAbstract_feature", "_UI_ClassJJD_type"),
				 AbstractJJDPackage.Literals.CLASS_JJD__IS_ABSTRACT,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
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
			childrenFeatures.add(AbstractJJDPackage.Literals.CLASS_JJD__LIST_ATTRIBUTES_JJD);
			childrenFeatures.add(AbstractJJDPackage.Literals.CLASS_JJD__LIST_METHODS_JJD);
			childrenFeatures.add(AbstractJJDPackage.Literals.CLASS_JJD__LIST_RELATIONS_JJD);
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
	 * This returns ClassJJD.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/ClassJJD"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((ClassJJD)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_ClassJJD_type") :
			getString("_UI_ClassJJD_type") + " " + label;
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

		switch (notification.getFeatureID(ClassJJD.class)) {
			case AbstractJJDPackage.CLASS_JJD__NAME:
			case AbstractJJDPackage.CLASS_JJD__DESCRIPTION:
			case AbstractJJDPackage.CLASS_JJD__IS_ABSTRACT:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case AbstractJJDPackage.CLASS_JJD__LIST_ATTRIBUTES_JJD:
			case AbstractJJDPackage.CLASS_JJD__LIST_METHODS_JJD:
			case AbstractJJDPackage.CLASS_JJD__LIST_RELATIONS_JJD:
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
				(AbstractJJDPackage.Literals.CLASS_JJD__LIST_ATTRIBUTES_JJD,
				 AbstractJJDFactory.eINSTANCE.createAttributeJJD()));

		newChildDescriptors.add
			(createChildParameter
				(AbstractJJDPackage.Literals.CLASS_JJD__LIST_METHODS_JJD,
				 AbstractJJDFactory.eINSTANCE.createMethodJJD()));

		newChildDescriptors.add
			(createChildParameter
				(AbstractJJDPackage.Literals.CLASS_JJD__LIST_RELATIONS_JJD,
				 AbstractJJDFactory.eINSTANCE.createRelationJJD()));

		newChildDescriptors.add
			(createChildParameter
				(AbstractJJDPackage.Literals.CLASS_JJD__LIST_RELATIONS_JJD,
				 AbstractJJDFactory.eINSTANCE.createAgregationJJD()));

		newChildDescriptors.add
			(createChildParameter
				(AbstractJJDPackage.Literals.CLASS_JJD__LIST_RELATIONS_JJD,
				 AbstractJJDFactory.eINSTANCE.createInheritanceJJD()));

		newChildDescriptors.add
			(createChildParameter
				(AbstractJJDPackage.Literals.CLASS_JJD__LIST_RELATIONS_JJD,
				 AbstractJJDFactory.eINSTANCE.createContainmentJJD()));

		newChildDescriptors.add
			(createChildParameter
				(AbstractJJDPackage.Literals.CLASS_JJD__LIST_RELATIONS_JJD,
				 AbstractJJDFactory.eINSTANCE.createAssociationJJD()));

		newChildDescriptors.add
			(createChildParameter
				(AbstractJJDPackage.Literals.CLASS_JJD__LIST_RELATIONS_JJD,
				 AbstractJJDFactory.eINSTANCE.createImplementJJD()));
	}

	/**
	 * Return the resource locator for this item provider's resources.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		return AbstractJJDEditPlugin.INSTANCE;
	}

}
