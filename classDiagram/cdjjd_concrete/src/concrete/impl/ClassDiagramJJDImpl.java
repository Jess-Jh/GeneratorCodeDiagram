/**
 */
package concrete.impl;

import concrete.ClassDiagramJJD;
import concrete.ClassJJD;
import concrete.ConcretePackage;
import concrete.PackageJJD;
import concrete.RelationJJD;

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
 * An implementation of the model object '<em><b>Class Diagram JJD</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link concrete.impl.ClassDiagramJJDImpl#getName <em>Name</em>}</li>
 *   <li>{@link concrete.impl.ClassDiagramJJDImpl#getListPackagesJJD <em>List Packages JJD</em>}</li>
 *   <li>{@link concrete.impl.ClassDiagramJJDImpl#getListClassJJD <em>List Class JJD</em>}</li>
 *   <li>{@link concrete.impl.ClassDiagramJJDImpl#getListRelationsJJD <em>List Relations JJD</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ClassDiagramJJDImpl extends EObjectImpl implements ClassDiagramJJD {
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
	 * The cached value of the '{@link #getListClassJJD() <em>List Class JJD</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getListClassJJD()
	 * @generated
	 * @ordered
	 */
	protected EList<ClassJJD> listClassJJD;

	/**
	 * The cached value of the '{@link #getListRelationsJJD() <em>List Relations JJD</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getListRelationsJJD()
	 * @generated
	 * @ordered
	 */
	protected EList<RelationJJD> listRelationsJJD;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ClassDiagramJJDImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ConcretePackage.Literals.CLASS_DIAGRAM_JJD;
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
			eNotify(new ENotificationImpl(this, Notification.SET, ConcretePackage.CLASS_DIAGRAM_JJD__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<PackageJJD> getListPackagesJJD() {
		if (listPackagesJJD == null) {
			listPackagesJJD = new EObjectContainmentEList<PackageJJD>(PackageJJD.class, this, ConcretePackage.CLASS_DIAGRAM_JJD__LIST_PACKAGES_JJD);
		}
		return listPackagesJJD;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ClassJJD> getListClassJJD() {
		if (listClassJJD == null) {
			listClassJJD = new EObjectContainmentEList<ClassJJD>(ClassJJD.class, this, ConcretePackage.CLASS_DIAGRAM_JJD__LIST_CLASS_JJD);
		}
		return listClassJJD;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<RelationJJD> getListRelationsJJD() {
		if (listRelationsJJD == null) {
			listRelationsJJD = new EObjectContainmentEList<RelationJJD>(RelationJJD.class, this, ConcretePackage.CLASS_DIAGRAM_JJD__LIST_RELATIONS_JJD);
		}
		return listRelationsJJD;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ConcretePackage.CLASS_DIAGRAM_JJD__LIST_PACKAGES_JJD:
				return ((InternalEList<?>)getListPackagesJJD()).basicRemove(otherEnd, msgs);
			case ConcretePackage.CLASS_DIAGRAM_JJD__LIST_CLASS_JJD:
				return ((InternalEList<?>)getListClassJJD()).basicRemove(otherEnd, msgs);
			case ConcretePackage.CLASS_DIAGRAM_JJD__LIST_RELATIONS_JJD:
				return ((InternalEList<?>)getListRelationsJJD()).basicRemove(otherEnd, msgs);
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
			case ConcretePackage.CLASS_DIAGRAM_JJD__NAME:
				return getName();
			case ConcretePackage.CLASS_DIAGRAM_JJD__LIST_PACKAGES_JJD:
				return getListPackagesJJD();
			case ConcretePackage.CLASS_DIAGRAM_JJD__LIST_CLASS_JJD:
				return getListClassJJD();
			case ConcretePackage.CLASS_DIAGRAM_JJD__LIST_RELATIONS_JJD:
				return getListRelationsJJD();
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
			case ConcretePackage.CLASS_DIAGRAM_JJD__NAME:
				setName((String)newValue);
				return;
			case ConcretePackage.CLASS_DIAGRAM_JJD__LIST_PACKAGES_JJD:
				getListPackagesJJD().clear();
				getListPackagesJJD().addAll((Collection<? extends PackageJJD>)newValue);
				return;
			case ConcretePackage.CLASS_DIAGRAM_JJD__LIST_CLASS_JJD:
				getListClassJJD().clear();
				getListClassJJD().addAll((Collection<? extends ClassJJD>)newValue);
				return;
			case ConcretePackage.CLASS_DIAGRAM_JJD__LIST_RELATIONS_JJD:
				getListRelationsJJD().clear();
				getListRelationsJJD().addAll((Collection<? extends RelationJJD>)newValue);
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
			case ConcretePackage.CLASS_DIAGRAM_JJD__NAME:
				setName(NAME_EDEFAULT);
				return;
			case ConcretePackage.CLASS_DIAGRAM_JJD__LIST_PACKAGES_JJD:
				getListPackagesJJD().clear();
				return;
			case ConcretePackage.CLASS_DIAGRAM_JJD__LIST_CLASS_JJD:
				getListClassJJD().clear();
				return;
			case ConcretePackage.CLASS_DIAGRAM_JJD__LIST_RELATIONS_JJD:
				getListRelationsJJD().clear();
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
			case ConcretePackage.CLASS_DIAGRAM_JJD__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case ConcretePackage.CLASS_DIAGRAM_JJD__LIST_PACKAGES_JJD:
				return listPackagesJJD != null && !listPackagesJJD.isEmpty();
			case ConcretePackage.CLASS_DIAGRAM_JJD__LIST_CLASS_JJD:
				return listClassJJD != null && !listClassJJD.isEmpty();
			case ConcretePackage.CLASS_DIAGRAM_JJD__LIST_RELATIONS_JJD:
				return listRelationsJJD != null && !listRelationsJJD.isEmpty();
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

} //ClassDiagramJJDImpl
