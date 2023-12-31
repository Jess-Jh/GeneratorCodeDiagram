/**
 */
package uidiagram.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import uidiagram.Group;
import uidiagram.TemplateWidget;
import uidiagram.UidiagramPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Group</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link uidiagram.impl.GroupImpl#getTemplateWidget <em>Template Widget</em>}</li>
 *   <li>{@link uidiagram.impl.GroupImpl#getBorderRadius <em>Border Radius</em>}</li>
 *   <li>{@link uidiagram.impl.GroupImpl#getBorderWidth <em>Border Width</em>}</li>
 *   <li>{@link uidiagram.impl.GroupImpl#getBorderColor <em>Border Color</em>}</li>
 * </ul>
 *
 * @generated
 */
public class GroupImpl extends TemplateWidgetImpl implements Group {
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
	 * The default value of the '{@link #getBorderRadius() <em>Border Radius</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBorderRadius()
	 * @generated
	 * @ordered
	 */
	protected static final String BORDER_RADIUS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getBorderRadius() <em>Border Radius</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBorderRadius()
	 * @generated
	 * @ordered
	 */
	protected String borderRadius = BORDER_RADIUS_EDEFAULT;

	/**
	 * The default value of the '{@link #getBorderWidth() <em>Border Width</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBorderWidth()
	 * @generated
	 * @ordered
	 */
	protected static final String BORDER_WIDTH_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getBorderWidth() <em>Border Width</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBorderWidth()
	 * @generated
	 * @ordered
	 */
	protected String borderWidth = BORDER_WIDTH_EDEFAULT;

	/**
	 * The default value of the '{@link #getBorderColor() <em>Border Color</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBorderColor()
	 * @generated
	 * @ordered
	 */
	protected static final String BORDER_COLOR_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getBorderColor() <em>Border Color</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBorderColor()
	 * @generated
	 * @ordered
	 */
	protected String borderColor = BORDER_COLOR_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GroupImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return UidiagramPackage.Literals.GROUP;
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, UidiagramPackage.GROUP__TEMPLATE_WIDGET, oldTemplateWidget, newTemplateWidget);
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
				msgs = ((InternalEObject)templateWidget).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - UidiagramPackage.GROUP__TEMPLATE_WIDGET, null, msgs);
			if (newTemplateWidget != null)
				msgs = ((InternalEObject)newTemplateWidget).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - UidiagramPackage.GROUP__TEMPLATE_WIDGET, null, msgs);
			msgs = basicSetTemplateWidget(newTemplateWidget, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UidiagramPackage.GROUP__TEMPLATE_WIDGET, newTemplateWidget, newTemplateWidget));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getBorderRadius() {
		return borderRadius;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setBorderRadius(String newBorderRadius) {
		String oldBorderRadius = borderRadius;
		borderRadius = newBorderRadius;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UidiagramPackage.GROUP__BORDER_RADIUS, oldBorderRadius, borderRadius));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getBorderWidth() {
		return borderWidth;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setBorderWidth(String newBorderWidth) {
		String oldBorderWidth = borderWidth;
		borderWidth = newBorderWidth;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UidiagramPackage.GROUP__BORDER_WIDTH, oldBorderWidth, borderWidth));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getBorderColor() {
		return borderColor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setBorderColor(String newBorderColor) {
		String oldBorderColor = borderColor;
		borderColor = newBorderColor;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UidiagramPackage.GROUP__BORDER_COLOR, oldBorderColor, borderColor));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case UidiagramPackage.GROUP__TEMPLATE_WIDGET:
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
			case UidiagramPackage.GROUP__TEMPLATE_WIDGET:
				return getTemplateWidget();
			case UidiagramPackage.GROUP__BORDER_RADIUS:
				return getBorderRadius();
			case UidiagramPackage.GROUP__BORDER_WIDTH:
				return getBorderWidth();
			case UidiagramPackage.GROUP__BORDER_COLOR:
				return getBorderColor();
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
			case UidiagramPackage.GROUP__TEMPLATE_WIDGET:
				setTemplateWidget((TemplateWidget)newValue);
				return;
			case UidiagramPackage.GROUP__BORDER_RADIUS:
				setBorderRadius((String)newValue);
				return;
			case UidiagramPackage.GROUP__BORDER_WIDTH:
				setBorderWidth((String)newValue);
				return;
			case UidiagramPackage.GROUP__BORDER_COLOR:
				setBorderColor((String)newValue);
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
			case UidiagramPackage.GROUP__TEMPLATE_WIDGET:
				setTemplateWidget((TemplateWidget)null);
				return;
			case UidiagramPackage.GROUP__BORDER_RADIUS:
				setBorderRadius(BORDER_RADIUS_EDEFAULT);
				return;
			case UidiagramPackage.GROUP__BORDER_WIDTH:
				setBorderWidth(BORDER_WIDTH_EDEFAULT);
				return;
			case UidiagramPackage.GROUP__BORDER_COLOR:
				setBorderColor(BORDER_COLOR_EDEFAULT);
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
			case UidiagramPackage.GROUP__TEMPLATE_WIDGET:
				return templateWidget != null;
			case UidiagramPackage.GROUP__BORDER_RADIUS:
				return BORDER_RADIUS_EDEFAULT == null ? borderRadius != null : !BORDER_RADIUS_EDEFAULT.equals(borderRadius);
			case UidiagramPackage.GROUP__BORDER_WIDTH:
				return BORDER_WIDTH_EDEFAULT == null ? borderWidth != null : !BORDER_WIDTH_EDEFAULT.equals(borderWidth);
			case UidiagramPackage.GROUP__BORDER_COLOR:
				return BORDER_COLOR_EDEFAULT == null ? borderColor != null : !BORDER_COLOR_EDEFAULT.equals(borderColor);
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
		result.append(" (borderRadius: ");
		result.append(borderRadius);
		result.append(", borderWidth: ");
		result.append(borderWidth);
		result.append(", borderColor: ");
		result.append(borderColor);
		result.append(')');
		return result.toString();
	}

} //GroupImpl
