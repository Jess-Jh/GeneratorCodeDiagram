/**
 */
package abstractrelationalmodel.impl;

import abstractrelationalmodel.AbstractrelationalmodelPackage;
import abstractrelationalmodel.ModelFactoryAbstractRelationalModel;
import abstractrelationalmodel.Schema;

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
 * An implementation of the model object '<em><b>Model Factory Abstract Relational Model</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link abstractrelationalmodel.impl.ModelFactoryAbstractRelationalModelImpl#getName <em>Name</em>}</li>
 *   <li>{@link abstractrelationalmodel.impl.ModelFactoryAbstractRelationalModelImpl#getListSchemas <em>List Schemas</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ModelFactoryAbstractRelationalModelImpl extends EObjectImpl implements ModelFactoryAbstractRelationalModel {
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
	 * The cached value of the '{@link #getListSchemas() <em>List Schemas</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getListSchemas()
	 * @generated
	 * @ordered
	 */
	protected EList<Schema> listSchemas;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ModelFactoryAbstractRelationalModelImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AbstractrelationalmodelPackage.Literals.MODEL_FACTORY_ABSTRACT_RELATIONAL_MODEL;
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
			eNotify(new ENotificationImpl(this, Notification.SET, AbstractrelationalmodelPackage.MODEL_FACTORY_ABSTRACT_RELATIONAL_MODEL__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Schema> getListSchemas() {
		if (listSchemas == null) {
			listSchemas = new EObjectContainmentEList<Schema>(Schema.class, this, AbstractrelationalmodelPackage.MODEL_FACTORY_ABSTRACT_RELATIONAL_MODEL__LIST_SCHEMAS);
		}
		return listSchemas;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case AbstractrelationalmodelPackage.MODEL_FACTORY_ABSTRACT_RELATIONAL_MODEL__LIST_SCHEMAS:
				return ((InternalEList<?>)getListSchemas()).basicRemove(otherEnd, msgs);
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
			case AbstractrelationalmodelPackage.MODEL_FACTORY_ABSTRACT_RELATIONAL_MODEL__NAME:
				return getName();
			case AbstractrelationalmodelPackage.MODEL_FACTORY_ABSTRACT_RELATIONAL_MODEL__LIST_SCHEMAS:
				return getListSchemas();
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
			case AbstractrelationalmodelPackage.MODEL_FACTORY_ABSTRACT_RELATIONAL_MODEL__NAME:
				setName((String)newValue);
				return;
			case AbstractrelationalmodelPackage.MODEL_FACTORY_ABSTRACT_RELATIONAL_MODEL__LIST_SCHEMAS:
				getListSchemas().clear();
				getListSchemas().addAll((Collection<? extends Schema>)newValue);
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
			case AbstractrelationalmodelPackage.MODEL_FACTORY_ABSTRACT_RELATIONAL_MODEL__NAME:
				setName(NAME_EDEFAULT);
				return;
			case AbstractrelationalmodelPackage.MODEL_FACTORY_ABSTRACT_RELATIONAL_MODEL__LIST_SCHEMAS:
				getListSchemas().clear();
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
			case AbstractrelationalmodelPackage.MODEL_FACTORY_ABSTRACT_RELATIONAL_MODEL__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case AbstractrelationalmodelPackage.MODEL_FACTORY_ABSTRACT_RELATIONAL_MODEL__LIST_SCHEMAS:
				return listSchemas != null && !listSchemas.isEmpty();
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

} //ModelFactoryAbstractRelationalModelImpl
