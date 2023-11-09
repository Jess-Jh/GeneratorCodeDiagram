/**
 */
package relationalmodel.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import relationalmodel.Column;
import relationalmodel.DataType;
import relationalmodel.RelationalmodelPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Column</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link relationalmodel.impl.ColumnImpl#getName <em>Name</em>}</li>
 *   <li>{@link relationalmodel.impl.ColumnImpl#getDataType <em>Data Type</em>}</li>
 *   <li>{@link relationalmodel.impl.ColumnImpl#getSize <em>Size</em>}</li>
 *   <li>{@link relationalmodel.impl.ColumnImpl#isIsPrimaryKey <em>Is Primary Key</em>}</li>
 *   <li>{@link relationalmodel.impl.ColumnImpl#isNotNull <em>Not Null</em>}</li>
 *   <li>{@link relationalmodel.impl.ColumnImpl#isUniqueIndex <em>Unique Index</em>}</li>
 *   <li>{@link relationalmodel.impl.ColumnImpl#isIsAutoIncremental <em>Is Auto Incremental</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ColumnImpl extends EObjectImpl implements Column {
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
	 * The default value of the '{@link #getDataType() <em>Data Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDataType()
	 * @generated
	 * @ordered
	 */
	protected static final DataType DATA_TYPE_EDEFAULT = DataType.VARCHAR;

	/**
	 * The cached value of the '{@link #getDataType() <em>Data Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDataType()
	 * @generated
	 * @ordered
	 */
	protected DataType dataType = DATA_TYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #getSize() <em>Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSize()
	 * @generated
	 * @ordered
	 */
	protected static final int SIZE_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getSize() <em>Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSize()
	 * @generated
	 * @ordered
	 */
	protected int size = SIZE_EDEFAULT;

	/**
	 * The default value of the '{@link #isIsPrimaryKey() <em>Is Primary Key</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsPrimaryKey()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_PRIMARY_KEY_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIsPrimaryKey() <em>Is Primary Key</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsPrimaryKey()
	 * @generated
	 * @ordered
	 */
	protected boolean isPrimaryKey = IS_PRIMARY_KEY_EDEFAULT;

	/**
	 * The default value of the '{@link #isNotNull() <em>Not Null</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isNotNull()
	 * @generated
	 * @ordered
	 */
	protected static final boolean NOT_NULL_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isNotNull() <em>Not Null</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isNotNull()
	 * @generated
	 * @ordered
	 */
	protected boolean notNull = NOT_NULL_EDEFAULT;

	/**
	 * The default value of the '{@link #isUniqueIndex() <em>Unique Index</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isUniqueIndex()
	 * @generated
	 * @ordered
	 */
	protected static final boolean UNIQUE_INDEX_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isUniqueIndex() <em>Unique Index</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isUniqueIndex()
	 * @generated
	 * @ordered
	 */
	protected boolean uniqueIndex = UNIQUE_INDEX_EDEFAULT;

	/**
	 * The default value of the '{@link #isIsAutoIncremental() <em>Is Auto Incremental</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsAutoIncremental()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_AUTO_INCREMENTAL_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIsAutoIncremental() <em>Is Auto Incremental</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsAutoIncremental()
	 * @generated
	 * @ordered
	 */
	protected boolean isAutoIncremental = IS_AUTO_INCREMENTAL_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ColumnImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RelationalmodelPackage.Literals.COLUMN;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RelationalmodelPackage.COLUMN__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataType getDataType() {
		return dataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDataType(DataType newDataType) {
		DataType oldDataType = dataType;
		dataType = newDataType == null ? DATA_TYPE_EDEFAULT : newDataType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RelationalmodelPackage.COLUMN__DATA_TYPE, oldDataType, dataType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getSize() {
		return size;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSize(int newSize) {
		int oldSize = size;
		size = newSize;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RelationalmodelPackage.COLUMN__SIZE, oldSize, size));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIsPrimaryKey() {
		return isPrimaryKey;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsPrimaryKey(boolean newIsPrimaryKey) {
		boolean oldIsPrimaryKey = isPrimaryKey;
		isPrimaryKey = newIsPrimaryKey;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RelationalmodelPackage.COLUMN__IS_PRIMARY_KEY, oldIsPrimaryKey, isPrimaryKey));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isNotNull() {
		return notNull;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNotNull(boolean newNotNull) {
		boolean oldNotNull = notNull;
		notNull = newNotNull;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RelationalmodelPackage.COLUMN__NOT_NULL, oldNotNull, notNull));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isUniqueIndex() {
		return uniqueIndex;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUniqueIndex(boolean newUniqueIndex) {
		boolean oldUniqueIndex = uniqueIndex;
		uniqueIndex = newUniqueIndex;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RelationalmodelPackage.COLUMN__UNIQUE_INDEX, oldUniqueIndex, uniqueIndex));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIsAutoIncremental() {
		return isAutoIncremental;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsAutoIncremental(boolean newIsAutoIncremental) {
		boolean oldIsAutoIncremental = isAutoIncremental;
		isAutoIncremental = newIsAutoIncremental;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RelationalmodelPackage.COLUMN__IS_AUTO_INCREMENTAL, oldIsAutoIncremental, isAutoIncremental));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case RelationalmodelPackage.COLUMN__NAME:
				return getName();
			case RelationalmodelPackage.COLUMN__DATA_TYPE:
				return getDataType();
			case RelationalmodelPackage.COLUMN__SIZE:
				return getSize();
			case RelationalmodelPackage.COLUMN__IS_PRIMARY_KEY:
				return isIsPrimaryKey();
			case RelationalmodelPackage.COLUMN__NOT_NULL:
				return isNotNull();
			case RelationalmodelPackage.COLUMN__UNIQUE_INDEX:
				return isUniqueIndex();
			case RelationalmodelPackage.COLUMN__IS_AUTO_INCREMENTAL:
				return isIsAutoIncremental();
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
			case RelationalmodelPackage.COLUMN__NAME:
				setName((String)newValue);
				return;
			case RelationalmodelPackage.COLUMN__DATA_TYPE:
				setDataType((DataType)newValue);
				return;
			case RelationalmodelPackage.COLUMN__SIZE:
				setSize((Integer)newValue);
				return;
			case RelationalmodelPackage.COLUMN__IS_PRIMARY_KEY:
				setIsPrimaryKey((Boolean)newValue);
				return;
			case RelationalmodelPackage.COLUMN__NOT_NULL:
				setNotNull((Boolean)newValue);
				return;
			case RelationalmodelPackage.COLUMN__UNIQUE_INDEX:
				setUniqueIndex((Boolean)newValue);
				return;
			case RelationalmodelPackage.COLUMN__IS_AUTO_INCREMENTAL:
				setIsAutoIncremental((Boolean)newValue);
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
			case RelationalmodelPackage.COLUMN__NAME:
				setName(NAME_EDEFAULT);
				return;
			case RelationalmodelPackage.COLUMN__DATA_TYPE:
				setDataType(DATA_TYPE_EDEFAULT);
				return;
			case RelationalmodelPackage.COLUMN__SIZE:
				setSize(SIZE_EDEFAULT);
				return;
			case RelationalmodelPackage.COLUMN__IS_PRIMARY_KEY:
				setIsPrimaryKey(IS_PRIMARY_KEY_EDEFAULT);
				return;
			case RelationalmodelPackage.COLUMN__NOT_NULL:
				setNotNull(NOT_NULL_EDEFAULT);
				return;
			case RelationalmodelPackage.COLUMN__UNIQUE_INDEX:
				setUniqueIndex(UNIQUE_INDEX_EDEFAULT);
				return;
			case RelationalmodelPackage.COLUMN__IS_AUTO_INCREMENTAL:
				setIsAutoIncremental(IS_AUTO_INCREMENTAL_EDEFAULT);
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
			case RelationalmodelPackage.COLUMN__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case RelationalmodelPackage.COLUMN__DATA_TYPE:
				return dataType != DATA_TYPE_EDEFAULT;
			case RelationalmodelPackage.COLUMN__SIZE:
				return size != SIZE_EDEFAULT;
			case RelationalmodelPackage.COLUMN__IS_PRIMARY_KEY:
				return isPrimaryKey != IS_PRIMARY_KEY_EDEFAULT;
			case RelationalmodelPackage.COLUMN__NOT_NULL:
				return notNull != NOT_NULL_EDEFAULT;
			case RelationalmodelPackage.COLUMN__UNIQUE_INDEX:
				return uniqueIndex != UNIQUE_INDEX_EDEFAULT;
			case RelationalmodelPackage.COLUMN__IS_AUTO_INCREMENTAL:
				return isAutoIncremental != IS_AUTO_INCREMENTAL_EDEFAULT;
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

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (name: ");
		result.append(name);
		result.append(", dataType: ");
		result.append(dataType);
		result.append(", size: ");
		result.append(size);
		result.append(", isPrimaryKey: ");
		result.append(isPrimaryKey);
		result.append(", notNull: ");
		result.append(notNull);
		result.append(", uniqueIndex: ");
		result.append(uniqueIndex);
		result.append(", isAutoIncremental: ");
		result.append(isAutoIncremental);
		result.append(')');
		return result.toString();
	}

} //ColumnImpl
