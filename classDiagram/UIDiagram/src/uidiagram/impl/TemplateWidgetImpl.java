/**
 */
package uidiagram.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import uidiagram.TemplateWidget;
import uidiagram.UidiagramPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Template Widget</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link uidiagram.impl.TemplateWidgetImpl#getIdTemplate <em>Id Template</em>}</li>
 *   <li>{@link uidiagram.impl.TemplateWidgetImpl#getName <em>Name</em>}</li>
 *   <li>{@link uidiagram.impl.TemplateWidgetImpl#getPositionX <em>Position X</em>}</li>
 *   <li>{@link uidiagram.impl.TemplateWidgetImpl#getPositionY <em>Position Y</em>}</li>
 *   <li>{@link uidiagram.impl.TemplateWidgetImpl#getWidth <em>Width</em>}</li>
 *   <li>{@link uidiagram.impl.TemplateWidgetImpl#getHight <em>Hight</em>}</li>
 *   <li>{@link uidiagram.impl.TemplateWidgetImpl#getBackgroundColor <em>Background Color</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TemplateWidgetImpl extends EObjectImpl implements TemplateWidget {
	/**
	 * The default value of the '{@link #getIdTemplate() <em>Id Template</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIdTemplate()
	 * @generated
	 * @ordered
	 */
	protected static final String ID_TEMPLATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getIdTemplate() <em>Id Template</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIdTemplate()
	 * @generated
	 * @ordered
	 */
	protected String idTemplate = ID_TEMPLATE_EDEFAULT;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TemplateWidgetImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return UidiagramPackage.Literals.TEMPLATE_WIDGET;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getIdTemplate() {
		return idTemplate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIdTemplate(String newIdTemplate) {
		String oldIdTemplate = idTemplate;
		idTemplate = newIdTemplate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UidiagramPackage.TEMPLATE_WIDGET__ID_TEMPLATE, oldIdTemplate, idTemplate));
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
			eNotify(new ENotificationImpl(this, Notification.SET, UidiagramPackage.TEMPLATE_WIDGET__NAME, oldName, name));
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
			eNotify(new ENotificationImpl(this, Notification.SET, UidiagramPackage.TEMPLATE_WIDGET__POSITION_X, oldPositionX, positionX));
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
			eNotify(new ENotificationImpl(this, Notification.SET, UidiagramPackage.TEMPLATE_WIDGET__POSITION_Y, oldPositionY, positionY));
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
			eNotify(new ENotificationImpl(this, Notification.SET, UidiagramPackage.TEMPLATE_WIDGET__WIDTH, oldWidth, width));
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
			eNotify(new ENotificationImpl(this, Notification.SET, UidiagramPackage.TEMPLATE_WIDGET__HIGHT, oldHight, hight));
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
			eNotify(new ENotificationImpl(this, Notification.SET, UidiagramPackage.TEMPLATE_WIDGET__BACKGROUND_COLOR, oldBackgroundColor, backgroundColor));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case UidiagramPackage.TEMPLATE_WIDGET__ID_TEMPLATE:
				return getIdTemplate();
			case UidiagramPackage.TEMPLATE_WIDGET__NAME:
				return getName();
			case UidiagramPackage.TEMPLATE_WIDGET__POSITION_X:
				return getPositionX();
			case UidiagramPackage.TEMPLATE_WIDGET__POSITION_Y:
				return getPositionY();
			case UidiagramPackage.TEMPLATE_WIDGET__WIDTH:
				return getWidth();
			case UidiagramPackage.TEMPLATE_WIDGET__HIGHT:
				return getHight();
			case UidiagramPackage.TEMPLATE_WIDGET__BACKGROUND_COLOR:
				return getBackgroundColor();
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
			case UidiagramPackage.TEMPLATE_WIDGET__ID_TEMPLATE:
				setIdTemplate((String)newValue);
				return;
			case UidiagramPackage.TEMPLATE_WIDGET__NAME:
				setName((String)newValue);
				return;
			case UidiagramPackage.TEMPLATE_WIDGET__POSITION_X:
				setPositionX((String)newValue);
				return;
			case UidiagramPackage.TEMPLATE_WIDGET__POSITION_Y:
				setPositionY((String)newValue);
				return;
			case UidiagramPackage.TEMPLATE_WIDGET__WIDTH:
				setWidth((String)newValue);
				return;
			case UidiagramPackage.TEMPLATE_WIDGET__HIGHT:
				setHight((String)newValue);
				return;
			case UidiagramPackage.TEMPLATE_WIDGET__BACKGROUND_COLOR:
				setBackgroundColor((String)newValue);
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
			case UidiagramPackage.TEMPLATE_WIDGET__ID_TEMPLATE:
				setIdTemplate(ID_TEMPLATE_EDEFAULT);
				return;
			case UidiagramPackage.TEMPLATE_WIDGET__NAME:
				setName(NAME_EDEFAULT);
				return;
			case UidiagramPackage.TEMPLATE_WIDGET__POSITION_X:
				setPositionX(POSITION_X_EDEFAULT);
				return;
			case UidiagramPackage.TEMPLATE_WIDGET__POSITION_Y:
				setPositionY(POSITION_Y_EDEFAULT);
				return;
			case UidiagramPackage.TEMPLATE_WIDGET__WIDTH:
				setWidth(WIDTH_EDEFAULT);
				return;
			case UidiagramPackage.TEMPLATE_WIDGET__HIGHT:
				setHight(HIGHT_EDEFAULT);
				return;
			case UidiagramPackage.TEMPLATE_WIDGET__BACKGROUND_COLOR:
				setBackgroundColor(BACKGROUND_COLOR_EDEFAULT);
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
			case UidiagramPackage.TEMPLATE_WIDGET__ID_TEMPLATE:
				return ID_TEMPLATE_EDEFAULT == null ? idTemplate != null : !ID_TEMPLATE_EDEFAULT.equals(idTemplate);
			case UidiagramPackage.TEMPLATE_WIDGET__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case UidiagramPackage.TEMPLATE_WIDGET__POSITION_X:
				return POSITION_X_EDEFAULT == null ? positionX != null : !POSITION_X_EDEFAULT.equals(positionX);
			case UidiagramPackage.TEMPLATE_WIDGET__POSITION_Y:
				return POSITION_Y_EDEFAULT == null ? positionY != null : !POSITION_Y_EDEFAULT.equals(positionY);
			case UidiagramPackage.TEMPLATE_WIDGET__WIDTH:
				return WIDTH_EDEFAULT == null ? width != null : !WIDTH_EDEFAULT.equals(width);
			case UidiagramPackage.TEMPLATE_WIDGET__HIGHT:
				return HIGHT_EDEFAULT == null ? hight != null : !HIGHT_EDEFAULT.equals(hight);
			case UidiagramPackage.TEMPLATE_WIDGET__BACKGROUND_COLOR:
				return BACKGROUND_COLOR_EDEFAULT == null ? backgroundColor != null : !BACKGROUND_COLOR_EDEFAULT.equals(backgroundColor);
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
		result.append(" (idTemplate: ");
		result.append(idTemplate);
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

} //TemplateWidgetImpl
