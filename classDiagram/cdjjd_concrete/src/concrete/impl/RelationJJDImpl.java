/**
 */
package concrete.impl;

import concrete.ClassJJD;
import concrete.ConcretePackage;
import concrete.RelationJJD;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Relation JJD</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link concrete.impl.RelationJJDImpl#getRolA <em>Rol A</em>}</li>
 *   <li>{@link concrete.impl.RelationJJDImpl#getRolB <em>Rol B</em>}</li>
 *   <li>{@link concrete.impl.RelationJJDImpl#getNavigabilityA <em>Navigability A</em>}</li>
 *   <li>{@link concrete.impl.RelationJJDImpl#getNavigabilityB <em>Navigability B</em>}</li>
 *   <li>{@link concrete.impl.RelationJJDImpl#getMultiplicityA <em>Multiplicity A</em>}</li>
 *   <li>{@link concrete.impl.RelationJJDImpl#getMultiplicityB <em>Multiplicity B</em>}</li>
 *   <li>{@link concrete.impl.RelationJJDImpl#getSource <em>Source</em>}</li>
 *   <li>{@link concrete.impl.RelationJJDImpl#getTarget <em>Target</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RelationJJDImpl extends EObjectImpl implements RelationJJD {
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
	protected ClassJJD source;

	/**
	 * The cached value of the '{@link #getTarget() <em>Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTarget()
	 * @generated
	 * @ordered
	 */
	protected ClassJJD target;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RelationJJDImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ConcretePackage.Literals.RELATION_JJD;
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
			eNotify(new ENotificationImpl(this, Notification.SET, ConcretePackage.RELATION_JJD__ROL_A, oldRolA, rolA));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ConcretePackage.RELATION_JJD__ROL_B, oldRolB, rolB));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ConcretePackage.RELATION_JJD__NAVIGABILITY_A, oldNavigabilityA, navigabilityA));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ConcretePackage.RELATION_JJD__NAVIGABILITY_B, oldNavigabilityB, navigabilityB));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ConcretePackage.RELATION_JJD__MULTIPLICITY_A, oldMultiplicityA, multiplicityA));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ConcretePackage.RELATION_JJD__MULTIPLICITY_B, oldMultiplicityB, multiplicityB));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ClassJJD getSource() {
		if (source != null && source.eIsProxy()) {
			InternalEObject oldSource = (InternalEObject)source;
			source = (ClassJJD)eResolveProxy(oldSource);
			if (source != oldSource) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ConcretePackage.RELATION_JJD__SOURCE, oldSource, source));
			}
		}
		return source;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ClassJJD basicGetSource() {
		return source;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSource(ClassJJD newSource) {
		ClassJJD oldSource = source;
		source = newSource;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ConcretePackage.RELATION_JJD__SOURCE, oldSource, source));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ClassJJD getTarget() {
		if (target != null && target.eIsProxy()) {
			InternalEObject oldTarget = (InternalEObject)target;
			target = (ClassJJD)eResolveProxy(oldTarget);
			if (target != oldTarget) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ConcretePackage.RELATION_JJD__TARGET, oldTarget, target));
			}
		}
		return target;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ClassJJD basicGetTarget() {
		return target;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTarget(ClassJJD newTarget) {
		ClassJJD oldTarget = target;
		target = newTarget;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ConcretePackage.RELATION_JJD__TARGET, oldTarget, target));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ConcretePackage.RELATION_JJD__ROL_A:
				return getRolA();
			case ConcretePackage.RELATION_JJD__ROL_B:
				return getRolB();
			case ConcretePackage.RELATION_JJD__NAVIGABILITY_A:
				return getNavigabilityA();
			case ConcretePackage.RELATION_JJD__NAVIGABILITY_B:
				return getNavigabilityB();
			case ConcretePackage.RELATION_JJD__MULTIPLICITY_A:
				return getMultiplicityA();
			case ConcretePackage.RELATION_JJD__MULTIPLICITY_B:
				return getMultiplicityB();
			case ConcretePackage.RELATION_JJD__SOURCE:
				if (resolve) return getSource();
				return basicGetSource();
			case ConcretePackage.RELATION_JJD__TARGET:
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
			case ConcretePackage.RELATION_JJD__ROL_A:
				setRolA((String)newValue);
				return;
			case ConcretePackage.RELATION_JJD__ROL_B:
				setRolB((String)newValue);
				return;
			case ConcretePackage.RELATION_JJD__NAVIGABILITY_A:
				setNavigabilityA((String)newValue);
				return;
			case ConcretePackage.RELATION_JJD__NAVIGABILITY_B:
				setNavigabilityB((String)newValue);
				return;
			case ConcretePackage.RELATION_JJD__MULTIPLICITY_A:
				setMultiplicityA((String)newValue);
				return;
			case ConcretePackage.RELATION_JJD__MULTIPLICITY_B:
				setMultiplicityB((String)newValue);
				return;
			case ConcretePackage.RELATION_JJD__SOURCE:
				setSource((ClassJJD)newValue);
				return;
			case ConcretePackage.RELATION_JJD__TARGET:
				setTarget((ClassJJD)newValue);
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
			case ConcretePackage.RELATION_JJD__ROL_A:
				setRolA(ROL_A_EDEFAULT);
				return;
			case ConcretePackage.RELATION_JJD__ROL_B:
				setRolB(ROL_B_EDEFAULT);
				return;
			case ConcretePackage.RELATION_JJD__NAVIGABILITY_A:
				setNavigabilityA(NAVIGABILITY_A_EDEFAULT);
				return;
			case ConcretePackage.RELATION_JJD__NAVIGABILITY_B:
				setNavigabilityB(NAVIGABILITY_B_EDEFAULT);
				return;
			case ConcretePackage.RELATION_JJD__MULTIPLICITY_A:
				setMultiplicityA(MULTIPLICITY_A_EDEFAULT);
				return;
			case ConcretePackage.RELATION_JJD__MULTIPLICITY_B:
				setMultiplicityB(MULTIPLICITY_B_EDEFAULT);
				return;
			case ConcretePackage.RELATION_JJD__SOURCE:
				setSource((ClassJJD)null);
				return;
			case ConcretePackage.RELATION_JJD__TARGET:
				setTarget((ClassJJD)null);
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
			case ConcretePackage.RELATION_JJD__ROL_A:
				return ROL_A_EDEFAULT == null ? rolA != null : !ROL_A_EDEFAULT.equals(rolA);
			case ConcretePackage.RELATION_JJD__ROL_B:
				return ROL_B_EDEFAULT == null ? rolB != null : !ROL_B_EDEFAULT.equals(rolB);
			case ConcretePackage.RELATION_JJD__NAVIGABILITY_A:
				return NAVIGABILITY_A_EDEFAULT == null ? navigabilityA != null : !NAVIGABILITY_A_EDEFAULT.equals(navigabilityA);
			case ConcretePackage.RELATION_JJD__NAVIGABILITY_B:
				return NAVIGABILITY_B_EDEFAULT == null ? navigabilityB != null : !NAVIGABILITY_B_EDEFAULT.equals(navigabilityB);
			case ConcretePackage.RELATION_JJD__MULTIPLICITY_A:
				return MULTIPLICITY_A_EDEFAULT == null ? multiplicityA != null : !MULTIPLICITY_A_EDEFAULT.equals(multiplicityA);
			case ConcretePackage.RELATION_JJD__MULTIPLICITY_B:
				return MULTIPLICITY_B_EDEFAULT == null ? multiplicityB != null : !MULTIPLICITY_B_EDEFAULT.equals(multiplicityB);
			case ConcretePackage.RELATION_JJD__SOURCE:
				return source != null;
			case ConcretePackage.RELATION_JJD__TARGET:
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

} //RelationJJDImpl
