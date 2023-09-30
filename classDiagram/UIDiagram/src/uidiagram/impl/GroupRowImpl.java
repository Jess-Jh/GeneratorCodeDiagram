/**
 */
package uidiagram.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import uidiagram.GroupRow;
import uidiagram.TemplateWidget;
import uidiagram.UidiagramPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Group Row</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link uidiagram.impl.GroupRowImpl#getListTemplateWidget <em>List Template Widget</em>}</li>
 * </ul>
 *
 * @generated
 */
public class GroupRowImpl extends TemplateWidgetImpl implements GroupRow {
	/**
	 * The cached value of the '{@link #getListTemplateWidget() <em>List Template Widget</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getListTemplateWidget()
	 * @generated
	 * @ordered
	 */
	protected EList<TemplateWidget> listTemplateWidget;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GroupRowImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return UidiagramPackage.Literals.GROUP_ROW;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<TemplateWidget> getListTemplateWidget() {
		if (listTemplateWidget == null) {
			listTemplateWidget = new EObjectContainmentEList<TemplateWidget>(TemplateWidget.class, this, UidiagramPackage.GROUP_ROW__LIST_TEMPLATE_WIDGET);
		}
		return listTemplateWidget;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case UidiagramPackage.GROUP_ROW__LIST_TEMPLATE_WIDGET:
				return ((InternalEList<?>)getListTemplateWidget()).basicRemove(otherEnd, msgs);
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
			case UidiagramPackage.GROUP_ROW__LIST_TEMPLATE_WIDGET:
				return getListTemplateWidget();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case UidiagramPackage.GROUP_ROW__LIST_TEMPLATE_WIDGET:
				getListTemplateWidget().clear();
				getListTemplateWidget().addAll((Collection<? extends TemplateWidget>)newValue);
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
			case UidiagramPackage.GROUP_ROW__LIST_TEMPLATE_WIDGET:
				getListTemplateWidget().clear();
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
			case UidiagramPackage.GROUP_ROW__LIST_TEMPLATE_WIDGET:
				return listTemplateWidget != null && !listTemplateWidget.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //GroupRowImpl
