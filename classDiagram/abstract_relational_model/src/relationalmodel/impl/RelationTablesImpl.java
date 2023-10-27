/**
 */
package relationalmodel.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import relationalmodel.RelationTables;
import relationalmodel.RelationalmodelPackage;
import relationalmodel.Table;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Relation Tables</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link relationalmodel.impl.RelationTablesImpl#getRolA <em>Rol A</em>}</li>
 *   <li>{@link relationalmodel.impl.RelationTablesImpl#getRolB <em>Rol B</em>}</li>
 *   <li>{@link relationalmodel.impl.RelationTablesImpl#getNavigabilityA <em>Navigability A</em>}</li>
 *   <li>{@link relationalmodel.impl.RelationTablesImpl#getNavigabilityB <em>Navigability B</em>}</li>
 *   <li>{@link relationalmodel.impl.RelationTablesImpl#getMultiplicityA <em>Multiplicity A</em>}</li>
 *   <li>{@link relationalmodel.impl.RelationTablesImpl#getMultiplicityB <em>Multiplicity B</em>}</li>
 *   <li>{@link relationalmodel.impl.RelationTablesImpl#getSource <em>Source</em>}</li>
 *   <li>{@link relationalmodel.impl.RelationTablesImpl#getTarget <em>Target</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RelationTablesImpl extends EObjectImpl implements RelationTables {
	/**
	 * The default value of the '{@link #getRolA() <em>Rol A</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRolA()
	 * @generated
	 * @ordered
	 */
	protected static final String ROL_A_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRolA() <em>Rol A</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRolA()
	 * @generated
	 * @ordered
	 */
	protected String rolA = ROL_A_EDEFAULT;

	/**
	 * The default value of the '{@link #getRolB() <em>Rol B</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRolB()
	 * @generated
	 * @ordered
	 */
	protected static final String ROL_B_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRolB() <em>Rol B</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRolB()
	 * @generated
	 * @ordered
	 */
	protected String rolB = ROL_B_EDEFAULT;

	/**
	 * The default value of the '{@link #getNavigabilityA() <em>Navigability A</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNavigabilityA()
	 * @generated
	 * @ordered
	 */
	protected static final String NAVIGABILITY_A_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNavigabilityA() <em>Navigability A</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNavigabilityA()
	 * @generated
	 * @ordered
	 */
	protected String navigabilityA = NAVIGABILITY_A_EDEFAULT;

	/**
	 * The default value of the '{@link #getNavigabilityB() <em>Navigability B</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNavigabilityB()
	 * @generated
	 * @ordered
	 */
	protected static final String NAVIGABILITY_B_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNavigabilityB() <em>Navigability B</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNavigabilityB()
	 * @generated
	 * @ordered
	 */
	protected String navigabilityB = NAVIGABILITY_B_EDEFAULT;

	/**
	 * The default value of the '{@link #getMultiplicityA() <em>Multiplicity A</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMultiplicityA()
	 * @generated
	 * @ordered
	 */
	protected static final String MULTIPLICITY_A_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMultiplicityA() <em>Multiplicity A</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMultiplicityA()
	 * @generated
	 * @ordered
	 */
	protected String multiplicityA = MULTIPLICITY_A_EDEFAULT;

	/**
	 * The default value of the '{@link #getMultiplicityB() <em>Multiplicity B</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMultiplicityB()
	 * @generated
	 * @ordered
	 */
	protected static final String MULTIPLICITY_B_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMultiplicityB() <em>Multiplicity B</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMultiplicityB()
	 * @generated
	 * @ordered
	 */
	protected String multiplicityB = MULTIPLICITY_B_EDEFAULT;

	/**
	 * The cached value of the '{@link #getSource() <em>Source</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSource()
	 * @generated
	 * @ordered
	 */
	protected Table source;

	/**
	 * The cached value of the '{@link #getTarget() <em>Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTarget()
	 * @generated
	 * @ordered
	 */
	protected Table target;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RelationTablesImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RelationalmodelPackage.Literals.RELATION_TABLES;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getRolA() {
		return rolA;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRolA(String newRolA) {
		String oldRolA = rolA;
		rolA = newRolA;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RelationalmodelPackage.RELATION_TABLES__ROL_A, oldRolA, rolA));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getRolB() {
		return rolB;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRolB(String newRolB) {
		String oldRolB = rolB;
		rolB = newRolB;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RelationalmodelPackage.RELATION_TABLES__ROL_B, oldRolB, rolB));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getNavigabilityA() {
		return navigabilityA;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setNavigabilityA(String newNavigabilityA) {
		String oldNavigabilityA = navigabilityA;
		navigabilityA = newNavigabilityA;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RelationalmodelPackage.RELATION_TABLES__NAVIGABILITY_A, oldNavigabilityA, navigabilityA));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getNavigabilityB() {
		return navigabilityB;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setNavigabilityB(String newNavigabilityB) {
		String oldNavigabilityB = navigabilityB;
		navigabilityB = newNavigabilityB;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RelationalmodelPackage.RELATION_TABLES__NAVIGABILITY_B, oldNavigabilityB, navigabilityB));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getMultiplicityA() {
		return multiplicityA;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMultiplicityA(String newMultiplicityA) {
		String oldMultiplicityA = multiplicityA;
		multiplicityA = newMultiplicityA;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RelationalmodelPackage.RELATION_TABLES__MULTIPLICITY_A, oldMultiplicityA, multiplicityA));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getMultiplicityB() {
		return multiplicityB;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMultiplicityB(String newMultiplicityB) {
		String oldMultiplicityB = multiplicityB;
		multiplicityB = newMultiplicityB;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RelationalmodelPackage.RELATION_TABLES__MULTIPLICITY_B, oldMultiplicityB, multiplicityB));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Table getSource() {
		if (source != null && source.eIsProxy()) {
			InternalEObject oldSource = (InternalEObject)source;
			source = (Table)eResolveProxy(oldSource);
			if (source != oldSource) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, RelationalmodelPackage.RELATION_TABLES__SOURCE, oldSource, source));
			}
		}
		return source;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Table basicGetSource() {
		return source;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSource(Table newSource) {
		Table oldSource = source;
		source = newSource;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RelationalmodelPackage.RELATION_TABLES__SOURCE, oldSource, source));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Table getTarget() {
		if (target != null && target.eIsProxy()) {
			InternalEObject oldTarget = (InternalEObject)target;
			target = (Table)eResolveProxy(oldTarget);
			if (target != oldTarget) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, RelationalmodelPackage.RELATION_TABLES__TARGET, oldTarget, target));
			}
		}
		return target;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Table basicGetTarget() {
		return target;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTarget(Table newTarget) {
		Table oldTarget = target;
		target = newTarget;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RelationalmodelPackage.RELATION_TABLES__TARGET, oldTarget, target));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case RelationalmodelPackage.RELATION_TABLES__ROL_A:
				return getRolA();
			case RelationalmodelPackage.RELATION_TABLES__ROL_B:
				return getRolB();
			case RelationalmodelPackage.RELATION_TABLES__NAVIGABILITY_A:
				return getNavigabilityA();
			case RelationalmodelPackage.RELATION_TABLES__NAVIGABILITY_B:
				return getNavigabilityB();
			case RelationalmodelPackage.RELATION_TABLES__MULTIPLICITY_A:
				return getMultiplicityA();
			case RelationalmodelPackage.RELATION_TABLES__MULTIPLICITY_B:
				return getMultiplicityB();
			case RelationalmodelPackage.RELATION_TABLES__SOURCE:
				if (resolve) return getSource();
				return basicGetSource();
			case RelationalmodelPackage.RELATION_TABLES__TARGET:
				if (resolve) return getTarget();
				return basicGetTarget();
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
			case RelationalmodelPackage.RELATION_TABLES__ROL_A:
				setRolA((String)newValue);
				return;
			case RelationalmodelPackage.RELATION_TABLES__ROL_B:
				setRolB((String)newValue);
				return;
			case RelationalmodelPackage.RELATION_TABLES__NAVIGABILITY_A:
				setNavigabilityA((String)newValue);
				return;
			case RelationalmodelPackage.RELATION_TABLES__NAVIGABILITY_B:
				setNavigabilityB((String)newValue);
				return;
			case RelationalmodelPackage.RELATION_TABLES__MULTIPLICITY_A:
				setMultiplicityA((String)newValue);
				return;
			case RelationalmodelPackage.RELATION_TABLES__MULTIPLICITY_B:
				setMultiplicityB((String)newValue);
				return;
			case RelationalmodelPackage.RELATION_TABLES__SOURCE:
				setSource((Table)newValue);
				return;
			case RelationalmodelPackage.RELATION_TABLES__TARGET:
				setTarget((Table)newValue);
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
			case RelationalmodelPackage.RELATION_TABLES__ROL_A:
				setRolA(ROL_A_EDEFAULT);
				return;
			case RelationalmodelPackage.RELATION_TABLES__ROL_B:
				setRolB(ROL_B_EDEFAULT);
				return;
			case RelationalmodelPackage.RELATION_TABLES__NAVIGABILITY_A:
				setNavigabilityA(NAVIGABILITY_A_EDEFAULT);
				return;
			case RelationalmodelPackage.RELATION_TABLES__NAVIGABILITY_B:
				setNavigabilityB(NAVIGABILITY_B_EDEFAULT);
				return;
			case RelationalmodelPackage.RELATION_TABLES__MULTIPLICITY_A:
				setMultiplicityA(MULTIPLICITY_A_EDEFAULT);
				return;
			case RelationalmodelPackage.RELATION_TABLES__MULTIPLICITY_B:
				setMultiplicityB(MULTIPLICITY_B_EDEFAULT);
				return;
			case RelationalmodelPackage.RELATION_TABLES__SOURCE:
				setSource((Table)null);
				return;
			case RelationalmodelPackage.RELATION_TABLES__TARGET:
				setTarget((Table)null);
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
			case RelationalmodelPackage.RELATION_TABLES__ROL_A:
				return ROL_A_EDEFAULT == null ? rolA != null : !ROL_A_EDEFAULT.equals(rolA);
			case RelationalmodelPackage.RELATION_TABLES__ROL_B:
				return ROL_B_EDEFAULT == null ? rolB != null : !ROL_B_EDEFAULT.equals(rolB);
			case RelationalmodelPackage.RELATION_TABLES__NAVIGABILITY_A:
				return NAVIGABILITY_A_EDEFAULT == null ? navigabilityA != null : !NAVIGABILITY_A_EDEFAULT.equals(navigabilityA);
			case RelationalmodelPackage.RELATION_TABLES__NAVIGABILITY_B:
				return NAVIGABILITY_B_EDEFAULT == null ? navigabilityB != null : !NAVIGABILITY_B_EDEFAULT.equals(navigabilityB);
			case RelationalmodelPackage.RELATION_TABLES__MULTIPLICITY_A:
				return MULTIPLICITY_A_EDEFAULT == null ? multiplicityA != null : !MULTIPLICITY_A_EDEFAULT.equals(multiplicityA);
			case RelationalmodelPackage.RELATION_TABLES__MULTIPLICITY_B:
				return MULTIPLICITY_B_EDEFAULT == null ? multiplicityB != null : !MULTIPLICITY_B_EDEFAULT.equals(multiplicityB);
			case RelationalmodelPackage.RELATION_TABLES__SOURCE:
				return source != null;
			case RelationalmodelPackage.RELATION_TABLES__TARGET:
				return target != null;
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
		result.append(" (rolA: ");
		result.append(rolA);
		result.append(", rolB: ");
		result.append(rolB);
		result.append(", navigabilityA: ");
		result.append(navigabilityA);
		result.append(", navigabilityB: ");
		result.append(navigabilityB);
		result.append(", multiplicityA: ");
		result.append(multiplicityA);
		result.append(", multiplicityB: ");
		result.append(multiplicityB);
		result.append(')');
		return result.toString();
	}

} //RelationTablesImpl
