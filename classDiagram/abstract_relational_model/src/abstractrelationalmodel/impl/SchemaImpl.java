/**
 */
package abstractrelationalmodel.impl;

import abstractrelationalmodel.AbstractrelationalmodelPackage;
import abstractrelationalmodel.RelationTables;
import abstractrelationalmodel.Schema;
import abstractrelationalmodel.Table;

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
 * An implementation of the model object '<em><b>Schema</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link abstractrelationalmodel.impl.SchemaImpl#getName <em>Name</em>}</li>
 *   <li>{@link abstractrelationalmodel.impl.SchemaImpl#getListTables <em>List Tables</em>}</li>
 *   <li>{@link abstractrelationalmodel.impl.SchemaImpl#getRelationTables <em>Relation Tables</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SchemaImpl extends EObjectImpl implements Schema {
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
	 * The cached value of the '{@link #getListTables() <em>List Tables</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getListTables()
	 * @generated
	 * @ordered
	 */
	protected EList<Table> listTables;

	/**
	 * The cached value of the '{@link #getRelationTables() <em>Relation Tables</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRelationTables()
	 * @generated
	 * @ordered
	 */
	protected EList<RelationTables> relationTables;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SchemaImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AbstractrelationalmodelPackage.Literals.SCHEMA;
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
			eNotify(new ENotificationImpl(this, Notification.SET, AbstractrelationalmodelPackage.SCHEMA__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Table> getListTables() {
		if (listTables == null) {
			listTables = new EObjectContainmentEList<Table>(Table.class, this, AbstractrelationalmodelPackage.SCHEMA__LIST_TABLES);
		}
		return listTables;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<RelationTables> getRelationTables() {
		if (relationTables == null) {
			relationTables = new EObjectContainmentEList<RelationTables>(RelationTables.class, this, AbstractrelationalmodelPackage.SCHEMA__RELATION_TABLES);
		}
		return relationTables;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case AbstractrelationalmodelPackage.SCHEMA__LIST_TABLES:
				return ((InternalEList<?>)getListTables()).basicRemove(otherEnd, msgs);
			case AbstractrelationalmodelPackage.SCHEMA__RELATION_TABLES:
				return ((InternalEList<?>)getRelationTables()).basicRemove(otherEnd, msgs);
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
			case AbstractrelationalmodelPackage.SCHEMA__NAME:
				return getName();
			case AbstractrelationalmodelPackage.SCHEMA__LIST_TABLES:
				return getListTables();
			case AbstractrelationalmodelPackage.SCHEMA__RELATION_TABLES:
				return getRelationTables();
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
			case AbstractrelationalmodelPackage.SCHEMA__NAME:
				setName((String)newValue);
				return;
			case AbstractrelationalmodelPackage.SCHEMA__LIST_TABLES:
				getListTables().clear();
				getListTables().addAll((Collection<? extends Table>)newValue);
				return;
			case AbstractrelationalmodelPackage.SCHEMA__RELATION_TABLES:
				getRelationTables().clear();
				getRelationTables().addAll((Collection<? extends RelationTables>)newValue);
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
			case AbstractrelationalmodelPackage.SCHEMA__NAME:
				setName(NAME_EDEFAULT);
				return;
			case AbstractrelationalmodelPackage.SCHEMA__LIST_TABLES:
				getListTables().clear();
				return;
			case AbstractrelationalmodelPackage.SCHEMA__RELATION_TABLES:
				getRelationTables().clear();
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
			case AbstractrelationalmodelPackage.SCHEMA__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case AbstractrelationalmodelPackage.SCHEMA__LIST_TABLES:
				return listTables != null && !listTables.isEmpty();
			case AbstractrelationalmodelPackage.SCHEMA__RELATION_TABLES:
				return relationTables != null && !relationTables.isEmpty();
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

} //SchemaImpl
