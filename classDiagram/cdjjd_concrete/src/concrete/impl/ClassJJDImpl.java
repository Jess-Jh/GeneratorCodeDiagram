/**
 */
package concrete.impl;

import concrete.AttributeJJD;
import concrete.ClassJJD;
import concrete.ConcretePackage;
import concrete.MethodJJD;

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
 * An implementation of the model object '<em><b>Class JJD</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link concrete.impl.ClassJJDImpl#getName <em>Name</em>}</li>
 *   <li>{@link concrete.impl.ClassJJDImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link concrete.impl.ClassJJDImpl#isIsAbstract <em>Is Abstract</em>}</li>
 *   <li>{@link concrete.impl.ClassJJDImpl#getListAttributesJJD <em>List Attributes JJD</em>}</li>
 *   <li>{@link concrete.impl.ClassJJDImpl#getListMethodsJJD <em>List Methods JJD</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ClassJJDImpl extends EObjectImpl implements ClassJJD {
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
	 * The default value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected static final String DESCRIPTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected String description = DESCRIPTION_EDEFAULT;

	/**
	 * The default value of the '{@link #isIsAbstract() <em>Is Abstract</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsAbstract()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_ABSTRACT_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIsAbstract() <em>Is Abstract</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsAbstract()
	 * @generated
	 * @ordered
	 */
	protected boolean isAbstract = IS_ABSTRACT_EDEFAULT;

	/**
	 * The cached value of the '{@link #getListAttributesJJD() <em>List Attributes JJD</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getListAttributesJJD()
	 * @generated
	 * @ordered
	 */
	protected EList<AttributeJJD> listAttributesJJD;

	/**
	 * The cached value of the '{@link #getListMethodsJJD() <em>List Methods JJD</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getListMethodsJJD()
	 * @generated
	 * @ordered
	 */
	protected EList<MethodJJD> listMethodsJJD;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ClassJJDImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ConcretePackage.Literals.CLASS_JJD;
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
			eNotify(new ENotificationImpl(this, Notification.SET, ConcretePackage.CLASS_JJD__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getDescription() {
		return description;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDescription(String newDescription) {
		String oldDescription = description;
		description = newDescription;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ConcretePackage.CLASS_JJD__DESCRIPTION, oldDescription, description));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isIsAbstract() {
		return isAbstract;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIsAbstract(boolean newIsAbstract) {
		boolean oldIsAbstract = isAbstract;
		isAbstract = newIsAbstract;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ConcretePackage.CLASS_JJD__IS_ABSTRACT, oldIsAbstract, isAbstract));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<AttributeJJD> getListAttributesJJD() {
		if (listAttributesJJD == null) {
			listAttributesJJD = new EObjectContainmentEList<AttributeJJD>(AttributeJJD.class, this, ConcretePackage.CLASS_JJD__LIST_ATTRIBUTES_JJD);
		}
		return listAttributesJJD;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<MethodJJD> getListMethodsJJD() {
		if (listMethodsJJD == null) {
			listMethodsJJD = new EObjectContainmentEList<MethodJJD>(MethodJJD.class, this, ConcretePackage.CLASS_JJD__LIST_METHODS_JJD);
		}
		return listMethodsJJD;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ConcretePackage.CLASS_JJD__LIST_ATTRIBUTES_JJD:
				return ((InternalEList<?>)getListAttributesJJD()).basicRemove(otherEnd, msgs);
			case ConcretePackage.CLASS_JJD__LIST_METHODS_JJD:
				return ((InternalEList<?>)getListMethodsJJD()).basicRemove(otherEnd, msgs);
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
			case ConcretePackage.CLASS_JJD__NAME:
				return getName();
			case ConcretePackage.CLASS_JJD__DESCRIPTION:
				return getDescription();
			case ConcretePackage.CLASS_JJD__IS_ABSTRACT:
				return isIsAbstract();
			case ConcretePackage.CLASS_JJD__LIST_ATTRIBUTES_JJD:
				return getListAttributesJJD();
			case ConcretePackage.CLASS_JJD__LIST_METHODS_JJD:
				return getListMethodsJJD();
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
			case ConcretePackage.CLASS_JJD__NAME:
				setName((String)newValue);
				return;
			case ConcretePackage.CLASS_JJD__DESCRIPTION:
				setDescription((String)newValue);
				return;
			case ConcretePackage.CLASS_JJD__IS_ABSTRACT:
				setIsAbstract((Boolean)newValue);
				return;
			case ConcretePackage.CLASS_JJD__LIST_ATTRIBUTES_JJD:
				getListAttributesJJD().clear();
				getListAttributesJJD().addAll((Collection<? extends AttributeJJD>)newValue);
				return;
			case ConcretePackage.CLASS_JJD__LIST_METHODS_JJD:
				getListMethodsJJD().clear();
				getListMethodsJJD().addAll((Collection<? extends MethodJJD>)newValue);
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
			case ConcretePackage.CLASS_JJD__NAME:
				setName(NAME_EDEFAULT);
				return;
			case ConcretePackage.CLASS_JJD__DESCRIPTION:
				setDescription(DESCRIPTION_EDEFAULT);
				return;
			case ConcretePackage.CLASS_JJD__IS_ABSTRACT:
				setIsAbstract(IS_ABSTRACT_EDEFAULT);
				return;
			case ConcretePackage.CLASS_JJD__LIST_ATTRIBUTES_JJD:
				getListAttributesJJD().clear();
				return;
			case ConcretePackage.CLASS_JJD__LIST_METHODS_JJD:
				getListMethodsJJD().clear();
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
			case ConcretePackage.CLASS_JJD__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case ConcretePackage.CLASS_JJD__DESCRIPTION:
				return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
			case ConcretePackage.CLASS_JJD__IS_ABSTRACT:
				return isAbstract != IS_ABSTRACT_EDEFAULT;
			case ConcretePackage.CLASS_JJD__LIST_ATTRIBUTES_JJD:
				return listAttributesJJD != null && !listAttributesJJD.isEmpty();
			case ConcretePackage.CLASS_JJD__LIST_METHODS_JJD:
				return listMethodsJJD != null && !listMethodsJJD.isEmpty();
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
		result.append(", description: ");
		result.append(description);
		result.append(", isAbstract: ");
		result.append(isAbstract);
		result.append(')');
		return result.toString();
	}

} //ClassJJDImpl
