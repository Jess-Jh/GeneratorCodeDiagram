/**
 */
package uidiagram.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import uidiagram.TemplateWidget;
import uidiagram.UidiagramPackage;
import uidiagram.UserInterface;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>User Interface</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link uidiagram.impl.UserInterfaceImpl#getIdInterface <em>Id Interface</em>}</li>
 *   <li>{@link uidiagram.impl.UserInterfaceImpl#getName <em>Name</em>}</li>
 *   <li>{@link uidiagram.impl.UserInterfaceImpl#getPositionX <em>Position X</em>}</li>
 *   <li>{@link uidiagram.impl.UserInterfaceImpl#getPositionY <em>Position Y</em>}</li>
 *   <li>{@link uidiagram.impl.UserInterfaceImpl#getWidth <em>Width</em>}</li>
 *   <li>{@link uidiagram.impl.UserInterfaceImpl#getHight <em>Hight</em>}</li>
 *   <li>{@link uidiagram.impl.UserInterfaceImpl#getBackgroundColor <em>Background Color</em>}</li>
 *   <li>{@link uidiagram.impl.UserInterfaceImpl#getListTemplateWidget <em>List Template Widget</em>}</li>
 * </ul>
 *
 * @generated
 */
public class UserInterfaceImpl extends EObjectImpl implements UserInterface {
	/**
	 * The default value of the '{@link #getIdInterface() <em>Id Interface</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIdInterface()
	 * @generated
	 * @ordered
	 */
	protected static final String ID_INTERFACE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getIdInterface() <em>Id Interface</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIdInterface()
	 * @generated
	 * @ordered
	 */
	protected String idInterface = ID_INTERFACE_EDEFAULT;

	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getPositionX() <em>Position X</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPositionX()
	 * @generated
	 * @ordered
	 */
	protected static final String POSITION_X_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPositionX() <em>Position X</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPositionX()
	 * @generated
	 * @ordered
	 */
	protected String positionX = POSITION_X_EDEFAULT;

	/**
	 * The default value of the '{@link #getPositionY() <em>Position Y</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPositionY()
	 * @generated
	 * @ordered
	 */
	protected static final String POSITION_Y_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPositionY() <em>Position Y</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPositionY()
	 * @generated
	 * @ordered
	 */
	protected String positionY = POSITION_Y_EDEFAULT;

	/**
	 * The default value of the '{@link #getWidth() <em>Width</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWidth()
	 * @generated
	 * @ordered
	 */
	protected static final String WIDTH_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getWidth() <em>Width</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWidth()
	 * @generated
	 * @ordered
	 */
	protected String width = WIDTH_EDEFAULT;

	/**
	 * The default value of the '{@link #getHight() <em>Hight</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHight()
	 * @generated
	 * @ordered
	 */
	protected static final String HIGHT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getHight() <em>Hight</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHight()
	 * @generated
	 * @ordered
	 */
	protected String hight = HIGHT_EDEFAULT;

	/**
	 * The default value of the '{@link #getBackgroundColor() <em>Background Color</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBackgroundColor()
	 * @generated
	 * @ordered
	 */
	protected static final String BACKGROUND_COLOR_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getBackgroundColor() <em>Background Color</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBackgroundColor()
	 * @generated
	 * @ordered
	 */
	protected String backgroundColor = BACKGROUND_COLOR_EDEFAULT;

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
	protected UserInterfaceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return UidiagramPackage.Literals.USER_INTERFACE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getIdInterface() {
		return idInterface;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIdInterface(String newIdInterface) {
		String oldIdInterface = idInterface;
		idInterface = newIdInterface;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UidiagramPackage.USER_INTERFACE__ID_INTERFACE, oldIdInterface, idInterface));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UidiagramPackage.USER_INTERFACE__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getPositionX() {
		return positionX;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPositionX(String newPositionX) {
		String oldPositionX = positionX;
		positionX = newPositionX;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UidiagramPackage.USER_INTERFACE__POSITION_X, oldPositionX, positionX));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getPositionY() {
		return positionY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPositionY(String newPositionY) {
		String oldPositionY = positionY;
		positionY = newPositionY;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UidiagramPackage.USER_INTERFACE__POSITION_Y, oldPositionY, positionY));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getWidth() {
		return width;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setWidth(String newWidth) {
		String oldWidth = width;
		width = newWidth;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UidiagramPackage.USER_INTERFACE__WIDTH, oldWidth, width));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getHight() {
		return hight;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setHight(String newHight) {
		String oldHight = hight;
		hight = newHight;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UidiagramPackage.USER_INTERFACE__HIGHT, oldHight, hight));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getBackgroundColor() {
		return backgroundColor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setBackgroundColor(String newBackgroundColor) {
		String oldBackgroundColor = backgroundColor;
		backgroundColor = newBackgroundColor;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UidiagramPackage.USER_INTERFACE__BACKGROUND_COLOR, oldBackgroundColor, backgroundColor));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<TemplateWidget> getListTemplateWidget() {
		if (listTemplateWidget == null) {
			listTemplateWidget = new EObjectContainmentEList<TemplateWidget>(TemplateWidget.class, this, UidiagramPackage.USER_INTERFACE__LIST_TEMPLATE_WIDGET);
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
			case UidiagramPackage.USER_INTERFACE__LIST_TEMPLATE_WIDGET:
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
			case UidiagramPackage.USER_INTERFACE__ID_INTERFACE:
				return getIdInterface();
			case UidiagramPackage.USER_INTERFACE__NAME:
				return getName();
			case UidiagramPackage.USER_INTERFACE__POSITION_X:
				return getPositionX();
			case UidiagramPackage.USER_INTERFACE__POSITION_Y:
				return getPositionY();
			case UidiagramPackage.USER_INTERFACE__WIDTH:
				return getWidth();
			case UidiagramPackage.USER_INTERFACE__HIGHT:
				return getHight();
			case UidiagramPackage.USER_INTERFACE__BACKGROUND_COLOR:
				return getBackgroundColor();
			case UidiagramPackage.USER_INTERFACE__LIST_TEMPLATE_WIDGET:
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
			case UidiagramPackage.USER_INTERFACE__ID_INTERFACE:
				setIdInterface((String)newValue);
				return;
			case UidiagramPackage.USER_INTERFACE__NAME:
				setName((String)newValue);
				return;
			case UidiagramPackage.USER_INTERFACE__POSITION_X:
				setPositionX((String)newValue);
				return;
			case UidiagramPackage.USER_INTERFACE__POSITION_Y:
				setPositionY((String)newValue);
				return;
			case UidiagramPackage.USER_INTERFACE__WIDTH:
				setWidth((String)newValue);
				return;
			case UidiagramPackage.USER_INTERFACE__HIGHT:
				setHight((String)newValue);
				return;
			case UidiagramPackage.USER_INTERFACE__BACKGROUND_COLOR:
				setBackgroundColor((String)newValue);
				return;
			case UidiagramPackage.USER_INTERFACE__LIST_TEMPLATE_WIDGET:
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
			case UidiagramPackage.USER_INTERFACE__ID_INTERFACE:
				setIdInterface(ID_INTERFACE_EDEFAULT);
				return;
			case UidiagramPackage.USER_INTERFACE__NAME:
				setName(NAME_EDEFAULT);
				return;
			case UidiagramPackage.USER_INTERFACE__POSITION_X:
				setPositionX(POSITION_X_EDEFAULT);
				return;
			case UidiagramPackage.USER_INTERFACE__POSITION_Y:
				setPositionY(POSITION_Y_EDEFAULT);
				return;
			case UidiagramPackage.USER_INTERFACE__WIDTH:
				setWidth(WIDTH_EDEFAULT);
				return;
			case UidiagramPackage.USER_INTERFACE__HIGHT:
				setHight(HIGHT_EDEFAULT);
				return;
			case UidiagramPackage.USER_INTERFACE__BACKGROUND_COLOR:
				setBackgroundColor(BACKGROUND_COLOR_EDEFAULT);
				return;
			case UidiagramPackage.USER_INTERFACE__LIST_TEMPLATE_WIDGET:
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
			case UidiagramPackage.USER_INTERFACE__ID_INTERFACE:
				return ID_INTERFACE_EDEFAULT == null ? idInterface != null : !ID_INTERFACE_EDEFAULT.equals(idInterface);
			case UidiagramPackage.USER_INTERFACE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case UidiagramPackage.USER_INTERFACE__POSITION_X:
				return POSITION_X_EDEFAULT == null ? positionX != null : !POSITION_X_EDEFAULT.equals(positionX);
			case UidiagramPackage.USER_INTERFACE__POSITION_Y:
				return POSITION_Y_EDEFAULT == null ? positionY != null : !POSITION_Y_EDEFAULT.equals(positionY);
			case UidiagramPackage.USER_INTERFACE__WIDTH:
				return WIDTH_EDEFAULT == null ? width != null : !WIDTH_EDEFAULT.equals(width);
			case UidiagramPackage.USER_INTERFACE__HIGHT:
				return HIGHT_EDEFAULT == null ? hight != null : !HIGHT_EDEFAULT.equals(hight);
			case UidiagramPackage.USER_INTERFACE__BACKGROUND_COLOR:
				return BACKGROUND_COLOR_EDEFAULT == null ? backgroundColor != null : !BACKGROUND_COLOR_EDEFAULT.equals(backgroundColor);
			case UidiagramPackage.USER_INTERFACE__LIST_TEMPLATE_WIDGET:
				return listTemplateWidget != null && !listTemplateWidget.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (idInterface: ");
		result.append(idInterface);
		result.append(", name: ");
		result.append(name);
		result.append(", positionX: ");
		result.append(positionX);
		result.append(", positionY: ");
		result.append(positionY);
		result.append(", width: ");
		result.append(width);
		result.append(", hight: ");
		result.append(hight);
		result.append(", backgroundColor: ");
		result.append(backgroundColor);
		result.append(')');
		return result.toString();
	}

} //UserInterfaceImpl
