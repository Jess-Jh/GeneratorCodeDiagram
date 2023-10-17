/**
 */
package uidiagram.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import uidiagram.ListView;
import uidiagram.TemplateWidget;
import uidiagram.UidiagramPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>List View</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link uidiagram.impl.ListViewImpl#getTemplateWidget <em>Template Widget</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ListViewImpl extends TemplateWidgetImpl implements ListView {
	/**
	 * The cached value of the '{@link #getTemplateWidget() <em>Template Widget</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTemplateWidget()
	 * @generated
	 * @ordered
	 */
	protected TemplateWidget templateWidget;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ListViewImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return UidiagramPackage.Literals.LIST_VIEW;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TemplateWidget getTemplateWidget() {
		return templateWidget;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTemplateWidget(TemplateWidget newTemplateWidget, NotificationChain msgs) {
		TemplateWidget oldTemplateWidget = templateWidget;
		templateWidget = newTemplateWidget;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, UidiagramPackage.LIST_VIEW__TEMPLATE_WIDGET, oldTemplateWidget, newTemplateWidget);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTemplateWidget(TemplateWidget newTemplateWidget) {
		if (newTemplateWidget != templateWidget) {
			NotificationChain msgs = null;
			if (templateWidget != null)
				msgs = ((InternalEObject)templateWidget).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - UidiagramPackage.LIST_VIEW__TEMPLATE_WIDGET, null, msgs);
			if (newTemplateWidget != null)
				msgs = ((InternalEObject)newTemplateWidget).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - UidiagramPackage.LIST_VIEW__TEMPLATE_WIDGET, null, msgs);
			msgs = basicSetTemplateWidget(newTemplateWidget, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UidiagramPackage.LIST_VIEW__TEMPLATE_WIDGET, newTemplateWidget, newTemplateWidget));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case UidiagramPackage.LIST_VIEW__TEMPLATE_WIDGET:
				return basicSetTemplateWidget(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case UidiagramPackage.LIST_VIEW__TEMPLATE_WIDGET:
				return getTemplateWidget();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case UidiagramPackage.LIST_VIEW__TEMPLATE_WIDGET:
				setTemplateWidget((TemplateWidget)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case UidiagramPackage.LIST_VIEW__TEMPLATE_WIDGET:
				setTemplateWidget((TemplateWidget)null);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case UidiagramPackage.LIST_VIEW__TEMPLATE_WIDGET:
				return templateWidget != null;
		}
		return super.eIsSet(featureID);
	}

} //ListViewImpl
