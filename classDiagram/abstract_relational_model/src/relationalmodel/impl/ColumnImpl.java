/**
 */
package relationalmodel.impl;

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
 *   <li>{@link relationalmodel.impl.ColumnImpl#isIsPrimaryKey <em>Is Primary Key</em>}</li>
 *   <li>{@link relationalmodel.impl.ColumnImpl#isNotNull <em>Not Null</em>}</li>
 *   <li>{@link relationalmodel.impl.ColumnImpl#isUniqueIndex <em>Unique Index</em>}</li>
 *   <li>{@link relationalmodel.impl.ColumnImpl#isIsBinaryColumn <em>Is Binary Column</em>}</li>
 *   <li>{@link relationalmodel.impl.ColumnImpl#isUnsignedDataType <em>Unsigned Data Type</em>}</li>
 *   <li>{@link relationalmodel.impl.ColumnImpl#isFillUpValuesColumn <em>Fill Up Values Column</em>}</li>
 *   <li>{@link relationalmodel.impl.ColumnImpl#isIsAutoIncremental <em>Is Auto Incremental</em>}</li>
 *   <li>{@link relationalmodel.impl.ColumnImpl#isGeneratedColumn <em>Generated Column</em>}</li>
 *   <li>{@link relationalmodel.impl.ColumnImpl#getExpression <em>Expression</em>}</li>
 *   <li>{@link relationalmodel.impl.ColumnImpl#getListDataType <em>List Data Type</em>}</li>
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
	 * The cached value of the '{@link #getDataType() <em>Data Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDataType()
	 * @generated
	 * @ordered
	 */
	protected DataType dataType;

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
	 * The default value of the '{@link #isIsBinaryColumn() <em>Is Binary Column</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsBinaryColumn()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_BINARY_COLUMN_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIsBinaryColumn() <em>Is Binary Column</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsBinaryColumn()
	 * @generated
	 * @ordered
	 */
	protected boolean isBinaryColumn = IS_BINARY_COLUMN_EDEFAULT;

	/**
	 * The default value of the '{@link #isUnsignedDataType() <em>Unsigned Data Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isUnsignedDataType()
	 * @generated
	 * @ordered
	 */
	protected static final boolean UNSIGNED_DATA_TYPE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isUnsignedDataType() <em>Unsigned Data Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isUnsignedDataType()
	 * @generated
	 * @ordered
	 */
	protected boolean unsignedDataType = UNSIGNED_DATA_TYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #isFillUpValuesColumn() <em>Fill Up Values Column</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isFillUpValuesColumn()
	 * @generated
	 * @ordered
	 */
	protected static final boolean FILL_UP_VALUES_COLUMN_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isFillUpValuesColumn() <em>Fill Up Values Column</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isFillUpValuesColumn()
	 * @generated
	 * @ordered
	 */
	protected boolean fillUpValuesColumn = FILL_UP_VALUES_COLUMN_EDEFAULT;

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
	 * The default value of the '{@link #isGeneratedColumn() <em>Generated Column</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isGeneratedColumn()
	 * @generated
	 * @ordered
	 */
	protected static final boolean GENERATED_COLUMN_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isGeneratedColumn() <em>Generated Column</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isGeneratedColumn()
	 * @generated
	 * @ordered
	 */
	protected boolean generatedColumn = GENERATED_COLUMN_EDEFAULT;

	/**
	 * The default value of the '{@link #getExpression() <em>Expression</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExpression()
	 * @generated
	 * @ordered
	 */
	protected static final String EXPRESSION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getExpression() <em>Expression</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExpression()
	 * @generated
	 * @ordered
	 */
	protected String expression = EXPRESSION_EDEFAULT;

	/**
	 * The cached value of the '{@link #getListDataType() <em>List Data Type</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getListDataType()
	 * @generated
	 * @ordered
	 */
	protected EList<DataType> listDataType;

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
			eNotify(new ENotificationImpl(this, Notification.SET, RelationalmodelPackage.COLUMN__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DataType getDataType() {
		return dataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDataType(DataType newDataType, NotificationChain msgs) {
		DataType oldDataType = dataType;
		dataType = newDataType;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, RelationalmodelPackage.COLUMN__DATA_TYPE, oldDataType, newDataType);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDataType(DataType newDataType) {
		if (newDataType != dataType) {
			NotificationChain msgs = null;
			if (dataType != null)
				msgs = ((InternalEObject)dataType).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - RelationalmodelPackage.COLUMN__DATA_TYPE, null, msgs);
			if (newDataType != null)
				msgs = ((InternalEObject)newDataType).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - RelationalmodelPackage.COLUMN__DATA_TYPE, null, msgs);
			msgs = basicSetDataType(newDataType, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RelationalmodelPackage.COLUMN__DATA_TYPE, newDataType, newDataType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isIsPrimaryKey() {
		return isPrimaryKey;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
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
	@Override
	public boolean isNotNull() {
		return notNull;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
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
	@Override
	public boolean isUniqueIndex() {
		return uniqueIndex;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
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
	@Override
	public boolean isIsBinaryColumn() {
		return isBinaryColumn;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIsBinaryColumn(boolean newIsBinaryColumn) {
		boolean oldIsBinaryColumn = isBinaryColumn;
		isBinaryColumn = newIsBinaryColumn;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RelationalmodelPackage.COLUMN__IS_BINARY_COLUMN, oldIsBinaryColumn, isBinaryColumn));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isUnsignedDataType() {
		return unsignedDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setUnsignedDataType(boolean newUnsignedDataType) {
		boolean oldUnsignedDataType = unsignedDataType;
		unsignedDataType = newUnsignedDataType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RelationalmodelPackage.COLUMN__UNSIGNED_DATA_TYPE, oldUnsignedDataType, unsignedDataType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isFillUpValuesColumn() {
		return fillUpValuesColumn;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setFillUpValuesColumn(boolean newFillUpValuesColumn) {
		boolean oldFillUpValuesColumn = fillUpValuesColumn;
		fillUpValuesColumn = newFillUpValuesColumn;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RelationalmodelPackage.COLUMN__FILL_UP_VALUES_COLUMN, oldFillUpValuesColumn, fillUpValuesColumn));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isIsAutoIncremental() {
		return isAutoIncremental;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
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
	public boolean isGeneratedColumn() {
		return generatedColumn;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setGeneratedColumn(boolean newGeneratedColumn) {
		boolean oldGeneratedColumn = generatedColumn;
		generatedColumn = newGeneratedColumn;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RelationalmodelPackage.COLUMN__GENERATED_COLUMN, oldGeneratedColumn, generatedColumn));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getExpression() {
		return expression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setExpression(String newExpression) {
		String oldExpression = expression;
		expression = newExpression;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RelationalmodelPackage.COLUMN__EXPRESSION, oldExpression, expression));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<DataType> getListDataType() {
		if (listDataType == null) {
			listDataType = new EObjectContainmentEList<DataType>(DataType.class, this, RelationalmodelPackage.COLUMN__LIST_DATA_TYPE);
		}
		return listDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case RelationalmodelPackage.COLUMN__DATA_TYPE:
				return basicSetDataType(null, msgs);
			case RelationalmodelPackage.COLUMN__LIST_DATA_TYPE:
				return ((InternalEList<?>)getListDataType()).basicRemove(otherEnd, msgs);
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
			case RelationalmodelPackage.COLUMN__NAME:
				return getName();
			case RelationalmodelPackage.COLUMN__DATA_TYPE:
				return getDataType();
			case RelationalmodelPackage.COLUMN__IS_PRIMARY_KEY:
				return isIsPrimaryKey();
			case RelationalmodelPackage.COLUMN__NOT_NULL:
				return isNotNull();
			case RelationalmodelPackage.COLUMN__UNIQUE_INDEX:
				return isUniqueIndex();
			case RelationalmodelPackage.COLUMN__IS_BINARY_COLUMN:
				return isIsBinaryColumn();
			case RelationalmodelPackage.COLUMN__UNSIGNED_DATA_TYPE:
				return isUnsignedDataType();
			case RelationalmodelPackage.COLUMN__FILL_UP_VALUES_COLUMN:
				return isFillUpValuesColumn();
			case RelationalmodelPackage.COLUMN__IS_AUTO_INCREMENTAL:
				return isIsAutoIncremental();
			case RelationalmodelPackage.COLUMN__GENERATED_COLUMN:
				return isGeneratedColumn();
			case RelationalmodelPackage.COLUMN__EXPRESSION:
				return getExpression();
			case RelationalmodelPackage.COLUMN__LIST_DATA_TYPE:
				return getListDataType();
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
			case RelationalmodelPackage.COLUMN__NAME:
				setName((String)newValue);
				return;
			case RelationalmodelPackage.COLUMN__DATA_TYPE:
				setDataType((DataType)newValue);
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
			case RelationalmodelPackage.COLUMN__IS_BINARY_COLUMN:
				setIsBinaryColumn((Boolean)newValue);
				return;
			case RelationalmodelPackage.COLUMN__UNSIGNED_DATA_TYPE:
				setUnsignedDataType((Boolean)newValue);
				return;
			case RelationalmodelPackage.COLUMN__FILL_UP_VALUES_COLUMN:
				setFillUpValuesColumn((Boolean)newValue);
				return;
			case RelationalmodelPackage.COLUMN__IS_AUTO_INCREMENTAL:
				setIsAutoIncremental((Boolean)newValue);
				return;
			case RelationalmodelPackage.COLUMN__GENERATED_COLUMN:
				setGeneratedColumn((Boolean)newValue);
				return;
			case RelationalmodelPackage.COLUMN__EXPRESSION:
				setExpression((String)newValue);
				return;
			case RelationalmodelPackage.COLUMN__LIST_DATA_TYPE:
				getListDataType().clear();
				getListDataType().addAll((Collection<? extends DataType>)newValue);
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
				setDataType((DataType)null);
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
			case RelationalmodelPackage.COLUMN__IS_BINARY_COLUMN:
				setIsBinaryColumn(IS_BINARY_COLUMN_EDEFAULT);
				return;
			case RelationalmodelPackage.COLUMN__UNSIGNED_DATA_TYPE:
				setUnsignedDataType(UNSIGNED_DATA_TYPE_EDEFAULT);
				return;
			case RelationalmodelPackage.COLUMN__FILL_UP_VALUES_COLUMN:
				setFillUpValuesColumn(FILL_UP_VALUES_COLUMN_EDEFAULT);
				return;
			case RelationalmodelPackage.COLUMN__IS_AUTO_INCREMENTAL:
				setIsAutoIncremental(IS_AUTO_INCREMENTAL_EDEFAULT);
				return;
			case RelationalmodelPackage.COLUMN__GENERATED_COLUMN:
				setGeneratedColumn(GENERATED_COLUMN_EDEFAULT);
				return;
			case RelationalmodelPackage.COLUMN__EXPRESSION:
				setExpression(EXPRESSION_EDEFAULT);
				return;
			case RelationalmodelPackage.COLUMN__LIST_DATA_TYPE:
				getListDataType().clear();
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
				return dataType != null;
			case RelationalmodelPackage.COLUMN__IS_PRIMARY_KEY:
				return isPrimaryKey != IS_PRIMARY_KEY_EDEFAULT;
			case RelationalmodelPackage.COLUMN__NOT_NULL:
				return notNull != NOT_NULL_EDEFAULT;
			case RelationalmodelPackage.COLUMN__UNIQUE_INDEX:
				return uniqueIndex != UNIQUE_INDEX_EDEFAULT;
			case RelationalmodelPackage.COLUMN__IS_BINARY_COLUMN:
				return isBinaryColumn != IS_BINARY_COLUMN_EDEFAULT;
			case RelationalmodelPackage.COLUMN__UNSIGNED_DATA_TYPE:
				return unsignedDataType != UNSIGNED_DATA_TYPE_EDEFAULT;
			case RelationalmodelPackage.COLUMN__FILL_UP_VALUES_COLUMN:
				return fillUpValuesColumn != FILL_UP_VALUES_COLUMN_EDEFAULT;
			case RelationalmodelPackage.COLUMN__IS_AUTO_INCREMENTAL:
				return isAutoIncremental != IS_AUTO_INCREMENTAL_EDEFAULT;
			case RelationalmodelPackage.COLUMN__GENERATED_COLUMN:
				return generatedColumn != GENERATED_COLUMN_EDEFAULT;
			case RelationalmodelPackage.COLUMN__EXPRESSION:
				return EXPRESSION_EDEFAULT == null ? expression != null : !EXPRESSION_EDEFAULT.equals(expression);
			case RelationalmodelPackage.COLUMN__LIST_DATA_TYPE:
				return listDataType != null && !listDataType.isEmpty();
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
		result.append(", isPrimaryKey: ");
		result.append(isPrimaryKey);
		result.append(", notNull: ");
		result.append(notNull);
		result.append(", uniqueIndex: ");
		result.append(uniqueIndex);
		result.append(", isBinaryColumn: ");
		result.append(isBinaryColumn);
		result.append(", unsignedDataType: ");
		result.append(unsignedDataType);
		result.append(", fillUpValuesColumn: ");
		result.append(fillUpValuesColumn);
		result.append(", isAutoIncremental: ");
		result.append(isAutoIncremental);
		result.append(", generatedColumn: ");
		result.append(generatedColumn);
		result.append(", expression: ");
		result.append(expression);
		result.append(')');
		return result.toString();
	}

} //ColumnImpl
