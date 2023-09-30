/**
 */
package uidiagram.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import uidiagram.UIDiagram;
import uidiagram.UidiagramPackage;
import uidiagram.UserInterface;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>UI Diagram</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link uidiagram.impl.UIDiagramImpl#getName <em>Name</em>}</li>
 *   <li>{@link uidiagram.impl.UIDiagramImpl#getUserInterface <em>User Interface</em>}</li>
 * </ul>
 *
 * @generated
 */
public class UIDiagramImpl extends EObjectImpl implements UIDiagram {
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
	 * The cached value of the '{@link #getUserInterface() <em>User Interface</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUserInterface()
	 * @generated
	 * @ordered
	 */
	protected UserInterface userInterface;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected UIDiagramImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return UidiagramPackage.Literals.UI_DIAGRAM;
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
			eNotify(new ENotificationImpl(this, Notification.SET, UidiagramPackage.UI_DIAGRAM__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public UserInterface getUserInterface() {
		return userInterface;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetUserInterface(UserInterface newUserInterface, NotificationChain msgs) {
		UserInterface oldUserInterface = userInterface;
		userInterface = newUserInterface;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, UidiagramPackage.UI_DIAGRAM__USER_INTERFACE, oldUserInterface, newUserInterface);
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
	public void setUserInterface(UserInterface newUserInterface) {
		if (newUserInterface != userInterface) {
			NotificationChain msgs = null;
			if (userInterface != null)
				msgs = ((InternalEObject)userInterface).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - UidiagramPackage.UI_DIAGRAM__USER_INTERFACE, null, msgs);
			if (newUserInterface != null)
				msgs = ((InternalEObject)newUserInterface).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - UidiagramPackage.UI_DIAGRAM__USER_INTERFACE, null, msgs);
			msgs = basicSetUserInterface(newUserInterface, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UidiagramPackage.UI_DIAGRAM__USER_INTERFACE, newUserInterface, newUserInterface));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case UidiagramPackage.UI_DIAGRAM__USER_INTERFACE:
				return basicSetUserInterface(null, msgs);
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
			case UidiagramPackage.UI_DIAGRAM__NAME:
				return getName();
			case UidiagramPackage.UI_DIAGRAM__USER_INTERFACE:
				return getUserInterface();
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
			case UidiagramPackage.UI_DIAGRAM__NAME:
				setName((String)newValue);
				return;
			case UidiagramPackage.UI_DIAGRAM__USER_INTERFACE:
				setUserInterface((UserInterface)newValue);
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
			case UidiagramPackage.UI_DIAGRAM__NAME:
				setName(NAME_EDEFAULT);
				return;
			case UidiagramPackage.UI_DIAGRAM__USER_INTERFACE:
				setUserInterface((UserInterface)null);
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
			case UidiagramPackage.UI_DIAGRAM__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case UidiagramPackage.UI_DIAGRAM__USER_INTERFACE:
				return userInterface != null;
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
		result.append(" (name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //UIDiagramImpl
