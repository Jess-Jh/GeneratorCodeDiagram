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
import uidiagram.Appbar;
import uidiagram.Button;
import uidiagram.Label;
import uidiagram.UidiagramPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Appbar</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link uidiagram.impl.AppbarImpl#getListButtons <em>List Buttons</em>}</li>
 *   <li>{@link uidiagram.impl.AppbarImpl#getListLabels <em>List Labels</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AppbarImpl extends TemplateWidgetImpl implements Appbar {
	/**
	 * The cached value of the '{@link #getListButtons() <em>List Buttons</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getListButtons()
	 * @generated
	 * @ordered
	 */
	protected EList<Button> listButtons;

	/**
	 * The cached value of the '{@link #getListLabels() <em>List Labels</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getListLabels()
	 * @generated
	 * @ordered
	 */
	protected EList<Label> listLabels;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AppbarImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return UidiagramPackage.Literals.APPBAR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Button> getListButtons() {
		if (listButtons == null) {
			listButtons = new EObjectContainmentEList<Button>(Button.class, this, UidiagramPackage.APPBAR__LIST_BUTTONS);
		}
		return listButtons;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Label> getListLabels() {
		if (listLabels == null) {
			listLabels = new EObjectContainmentEList<Label>(Label.class, this, UidiagramPackage.APPBAR__LIST_LABELS);
		}
		return listLabels;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case UidiagramPackage.APPBAR__LIST_BUTTONS:
				return ((InternalEList<?>)getListButtons()).basicRemove(otherEnd, msgs);
			case UidiagramPackage.APPBAR__LIST_LABELS:
				return ((InternalEList<?>)getListLabels()).basicRemove(otherEnd, msgs);
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
			case UidiagramPackage.APPBAR__LIST_BUTTONS:
				return getListButtons();
			case UidiagramPackage.APPBAR__LIST_LABELS:
				return getListLabels();
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
			case UidiagramPackage.APPBAR__LIST_BUTTONS:
				getListButtons().clear();
				getListButtons().addAll((Collection<? extends Button>)newValue);
				return;
			case UidiagramPackage.APPBAR__LIST_LABELS:
				getListLabels().clear();
				getListLabels().addAll((Collection<? extends Label>)newValue);
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
			case UidiagramPackage.APPBAR__LIST_BUTTONS:
				getListButtons().clear();
				return;
			case UidiagramPackage.APPBAR__LIST_LABELS:
				getListLabels().clear();
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
			case UidiagramPackage.APPBAR__LIST_BUTTONS:
				return listButtons != null && !listButtons.isEmpty();
			case UidiagramPackage.APPBAR__LIST_LABELS:
				return listLabels != null && !listLabels.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //AppbarImpl
