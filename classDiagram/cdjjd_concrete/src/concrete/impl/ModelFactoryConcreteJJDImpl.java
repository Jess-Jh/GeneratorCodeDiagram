/**
 */
package concrete.impl;

import concrete.ClassDiagramJJD;
import concrete.ConcretePackage;
import concrete.ModelFactoryConcreteJJD;

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
 * An implementation of the model object '<em><b>Model Factory Concrete JJD</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link concrete.impl.ModelFactoryConcreteJJDImpl#getName <em>Name</em>}</li>
 *   <li>{@link concrete.impl.ModelFactoryConcreteJJDImpl#getListClassDiagramJJD <em>List Class Diagram JJD</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ModelFactoryConcreteJJDImpl extends EObjectImpl implements ModelFactoryConcreteJJD {
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
	 * The cached value of the '{@link #getListClassDiagramJJD() <em>List Class Diagram JJD</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getListClassDiagramJJD()
	 * @generated
	 * @ordered
	 */
	protected EList<ClassDiagramJJD> listClassDiagramJJD;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ModelFactoryConcreteJJDImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ConcretePackage.Literals.MODEL_FACTORY_CONCRETE_JJD;
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
			eNotify(new ENotificationImpl(this, Notification.SET, ConcretePackage.MODEL_FACTORY_CONCRETE_JJD__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ClassDiagramJJD> getListClassDiagramJJD() {
		if (listClassDiagramJJD == null) {
			listClassDiagramJJD = new EObjectContainmentEList<ClassDiagramJJD>(ClassDiagramJJD.class, this, ConcretePackage.MODEL_FACTORY_CONCRETE_JJD__LIST_CLASS_DIAGRAM_JJD);
		}
		return listClassDiagramJJD;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ConcretePackage.MODEL_FACTORY_CONCRETE_JJD__LIST_CLASS_DIAGRAM_JJD:
				return ((InternalEList<?>)getListClassDiagramJJD()).basicRemove(otherEnd, msgs);
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
			case ConcretePackage.MODEL_FACTORY_CONCRETE_JJD__NAME:
				return getName();
			case ConcretePackage.MODEL_FACTORY_CONCRETE_JJD__LIST_CLASS_DIAGRAM_JJD:
				return getListClassDiagramJJD();
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
			case ConcretePackage.MODEL_FACTORY_CONCRETE_JJD__NAME:
				setName((String)newValue);
				return;
			case ConcretePackage.MODEL_FACTORY_CONCRETE_JJD__LIST_CLASS_DIAGRAM_JJD:
				getListClassDiagramJJD().clear();
				getListClassDiagramJJD().addAll((Collection<? extends ClassDiagramJJD>)newValue);
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
			case ConcretePackage.MODEL_FACTORY_CONCRETE_JJD__NAME:
				setName(NAME_EDEFAULT);
				return;
			case ConcretePackage.MODEL_FACTORY_CONCRETE_JJD__LIST_CLASS_DIAGRAM_JJD:
				getListClassDiagramJJD().clear();
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
			case ConcretePackage.MODEL_FACTORY_CONCRETE_JJD__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case ConcretePackage.MODEL_FACTORY_CONCRETE_JJD__LIST_CLASS_DIAGRAM_JJD:
				return listClassDiagramJJD != null && !listClassDiagramJJD.isEmpty();
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

} //ModelFactoryConcreteJJDImpl
