/**
 */
package abstractJJD.impl;

import abstractJJD.AbstractJJDPackage;
import abstractJJD.ModelFactoryAbstractJJD;
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
 * An implementation of the model object '<em><b>Model Factory Abstract JJD</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link abstractJJD.impl.ModelFactoryAbstractJJDImpl#getName <em>Name</em>}</li>
 *   <li>{@link abstractJJD.impl.ModelFactoryAbstractJJDImpl#getListPackagesJJD <em>List Packages JJD</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ModelFactoryAbstractJJDImpl extends EObjectImpl implements ModelFactoryAbstractJJD {
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
	 * The cached value of the '{@link #getListPackagesJJD() <em>List Packages JJD</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getListPackagesJJD()
	 * @generated
	 * @ordered
	 */
	protected EList<PackageJJD> listPackagesJJD;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ModelFactoryAbstractJJDImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AbstractJJDPackage.Literals.MODEL_FACTORY_ABSTRACT_JJD;
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
			eNotify(new ENotificationImpl(this, Notification.SET, AbstractJJDPackage.MODEL_FACTORY_ABSTRACT_JJD__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<PackageJJD> getListPackagesJJD() {
		if (listPackagesJJD == null) {
			listPackagesJJD = new EObjectContainmentEList<PackageJJD>(PackageJJD.class, this, AbstractJJDPackage.MODEL_FACTORY_ABSTRACT_JJD__LIST_PACKAGES_JJD);
		}
		return listPackagesJJD;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case AbstractJJDPackage.MODEL_FACTORY_ABSTRACT_JJD__LIST_PACKAGES_JJD:
				return ((InternalEList<?>)getListPackagesJJD()).basicRemove(otherEnd, msgs);
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
			case AbstractJJDPackage.MODEL_FACTORY_ABSTRACT_JJD__NAME:
				return getName();
			case AbstractJJDPackage.MODEL_FACTORY_ABSTRACT_JJD__LIST_PACKAGES_JJD:
				return getListPackagesJJD();
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
			case AbstractJJDPackage.MODEL_FACTORY_ABSTRACT_JJD__NAME:
				setName((String)newValue);
				return;
			case AbstractJJDPackage.MODEL_FACTORY_ABSTRACT_JJD__LIST_PACKAGES_JJD:
				getListPackagesJJD().clear();
				getListPackagesJJD().addAll((Collection<? extends PackageJJD>)newValue);
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
			case AbstractJJDPackage.MODEL_FACTORY_ABSTRACT_JJD__NAME:
				setName(NAME_EDEFAULT);
				return;
			case AbstractJJDPackage.MODEL_FACTORY_ABSTRACT_JJD__LIST_PACKAGES_JJD:
				getListPackagesJJD().clear();
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
			case AbstractJJDPackage.MODEL_FACTORY_ABSTRACT_JJD__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case AbstractJJDPackage.MODEL_FACTORY_ABSTRACT_JJD__LIST_PACKAGES_JJD:
				return listPackagesJJD != null && !listPackagesJJD.isEmpty();
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

} //ModelFactoryAbstractJJDImpl
