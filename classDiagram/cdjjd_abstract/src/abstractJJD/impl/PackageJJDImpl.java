/**
 */
package abstractJJD.impl;

import abstractJJD.AbstractJJDPackage;
import abstractJJD.ClassJJD;
import abstractJJD.PackageJJD;

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

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Package JJD</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link abstractJJD.impl.PackageJJDImpl#getName <em>Name</em>}</li>
 *   <li>{@link abstractJJD.impl.PackageJJDImpl#getNameSpace <em>Name Space</em>}</li>
 *   <li>{@link abstractJJD.impl.PackageJJDImpl#getSubPackagesJJD <em>Sub Packages JJD</em>}</li>
 *   <li>{@link abstractJJD.impl.PackageJJDImpl#getListClassJJD <em>List Class JJD</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PackageJJDImpl extends EObjectImpl implements PackageJJD {
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
	 * The default value of the '{@link #getNameSpace() <em>Name Space</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNameSpace()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_SPACE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNameSpace() <em>Name Space</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNameSpace()
	 * @generated
	 * @ordered
	 */
	protected String nameSpace = NAME_SPACE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getSubPackagesJJD() <em>Sub Packages JJD</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubPackagesJJD()
	 * @generated
	 * @ordered
	 */
	protected EList<PackageJJD> subPackagesJJD;

	/**
	 * The cached value of the '{@link #getListClassJJD() <em>List Class JJD</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getListClassJJD()
	 * @generated
	 * @ordered
	 */
	protected EList<ClassJJD> listClassJJD;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PackageJJDImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AbstractJJDPackage.Literals.PACKAGE_JJD;
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
			eNotify(new ENotificationImpl(this, Notification.SET, AbstractJJDPackage.PACKAGE_JJD__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getNameSpace() {
		return nameSpace;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setNameSpace(String newNameSpace) {
		String oldNameSpace = nameSpace;
		nameSpace = newNameSpace;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AbstractJJDPackage.PACKAGE_JJD__NAME_SPACE, oldNameSpace, nameSpace));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<PackageJJD> getSubPackagesJJD() {
		if (subPackagesJJD == null) {
			subPackagesJJD = new EObjectContainmentEList<PackageJJD>(PackageJJD.class, this, AbstractJJDPackage.PACKAGE_JJD__SUB_PACKAGES_JJD);
		}
		return subPackagesJJD;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ClassJJD> getListClassJJD() {
		if (listClassJJD == null) {
			listClassJJD = new EObjectContainmentEList<ClassJJD>(ClassJJD.class, this, AbstractJJDPackage.PACKAGE_JJD__LIST_CLASS_JJD);
		}
		return listClassJJD;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case AbstractJJDPackage.PACKAGE_JJD__SUB_PACKAGES_JJD:
				return ((InternalEList<?>)getSubPackagesJJD()).basicRemove(otherEnd, msgs);
			case AbstractJJDPackage.PACKAGE_JJD__LIST_CLASS_JJD:
				return ((InternalEList<?>)getListClassJJD()).basicRemove(otherEnd, msgs);
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
			case AbstractJJDPackage.PACKAGE_JJD__NAME:
				return getName();
			case AbstractJJDPackage.PACKAGE_JJD__NAME_SPACE:
				return getNameSpace();
			case AbstractJJDPackage.PACKAGE_JJD__SUB_PACKAGES_JJD:
				return getSubPackagesJJD();
			case AbstractJJDPackage.PACKAGE_JJD__LIST_CLASS_JJD:
				return getListClassJJD();
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
			case AbstractJJDPackage.PACKAGE_JJD__NAME:
				setName((String)newValue);
				return;
			case AbstractJJDPackage.PACKAGE_JJD__NAME_SPACE:
				setNameSpace((String)newValue);
				return;
			case AbstractJJDPackage.PACKAGE_JJD__SUB_PACKAGES_JJD:
				getSubPackagesJJD().clear();
				getSubPackagesJJD().addAll((Collection<? extends PackageJJD>)newValue);
				return;
			case AbstractJJDPackage.PACKAGE_JJD__LIST_CLASS_JJD:
				getListClassJJD().clear();
				getListClassJJD().addAll((Collection<? extends ClassJJD>)newValue);
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
			case AbstractJJDPackage.PACKAGE_JJD__NAME:
				setName(NAME_EDEFAULT);
				return;
			case AbstractJJDPackage.PACKAGE_JJD__NAME_SPACE:
				setNameSpace(NAME_SPACE_EDEFAULT);
				return;
			case AbstractJJDPackage.PACKAGE_JJD__SUB_PACKAGES_JJD:
				getSubPackagesJJD().clear();
				return;
			case AbstractJJDPackage.PACKAGE_JJD__LIST_CLASS_JJD:
				getListClassJJD().clear();
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
			case AbstractJJDPackage.PACKAGE_JJD__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case AbstractJJDPackage.PACKAGE_JJD__NAME_SPACE:
				return NAME_SPACE_EDEFAULT == null ? nameSpace != null : !NAME_SPACE_EDEFAULT.equals(nameSpace);
			case AbstractJJDPackage.PACKAGE_JJD__SUB_PACKAGES_JJD:
				return subPackagesJJD != null && !subPackagesJJD.isEmpty();
			case AbstractJJDPackage.PACKAGE_JJD__LIST_CLASS_JJD:
				return listClassJJD != null && !listClassJJD.isEmpty();
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
		result.append(", nameSpace: ");
		result.append(nameSpace);
		result.append(')');
		return result.toString();
	}

} //PackageJJDImpl
