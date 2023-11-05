/**
 */
package relationalmodel;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Column</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link relationalmodel.Column#getName <em>Name</em>}</li>
 *   <li>{@link relationalmodel.Column#getDataType <em>Data Type</em>}</li>
 *   <li>{@link relationalmodel.Column#getSize <em>Size</em>}</li>
 *   <li>{@link relationalmodel.Column#isIsPrimaryKey <em>Is Primary Key</em>}</li>
 *   <li>{@link relationalmodel.Column#isNotNull <em>Not Null</em>}</li>
 *   <li>{@link relationalmodel.Column#isUniqueIndex <em>Unique Index</em>}</li>
 *   <li>{@link relationalmodel.Column#isIsAutoIncremental <em>Is Auto Incremental</em>}</li>
 * </ul>
 *
 * @see relationalmodel.RelationalmodelPackage#getColumn()
 * @model
 * @generated
 */
public interface Column extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see relationalmodel.RelationalmodelPackage#getColumn_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link relationalmodel.Column#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Data Type</b></em>' containment reference.
	 * The literals are from the enumeration {@link relationalmodel.DataType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Data Type</em>' containment reference.
	 * @see relationalmodel.DataType
	 * @see #setDataType(DataType)
	 * @see relationalmodel.RelationalmodelPackage#getColumn_DataType()
	 * @model containment="true"
	 * @generated
	 */
	DataType getDataType();

	/**
	 * Sets the value of the '{@link relationalmodel.Column#getDataType <em>Data Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Data Type</em>' containment reference.
	 * @see relationalmodel.DataType
	 * @see #getDataType()
	 * @generated
	 */
	void setDataType(DataType value);

	/**
	 * Returns the value of the '<em><b>Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Size</em>' attribute.
	 * @see #setSize(int)
	 * @see relationalmodel.RelationalmodelPackage#getColumn_Size()
	 * @model
	 * @generated
	 */
	int getSize();

	/**
	 * Sets the value of the '{@link relationalmodel.Column#getSize <em>Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Size</em>' attribute.
	 * @see #getSize()
	 * @generated
	 */
	void setSize(int value);

	/**
	 * Returns the value of the '<em><b>Is Primary Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Primary Key</em>' attribute.
	 * @see #setIsPrimaryKey(boolean)
	 * @see relationalmodel.RelationalmodelPackage#getColumn_IsPrimaryKey()
	 * @model
	 * @generated
	 */
	boolean isIsPrimaryKey();

	/**
	 * Sets the value of the '{@link relationalmodel.Column#isIsPrimaryKey <em>Is Primary Key</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Primary Key</em>' attribute.
	 * @see #isIsPrimaryKey()
	 * @generated
	 */
	void setIsPrimaryKey(boolean value);

	/**
	 * Returns the value of the '<em><b>Not Null</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Not Null</em>' attribute.
	 * @see #setNotNull(boolean)
	 * @see relationalmodel.RelationalmodelPackage#getColumn_NotNull()
	 * @model
	 * @generated
	 */
	boolean isNotNull();

	/**
	 * Sets the value of the '{@link relationalmodel.Column#isNotNull <em>Not Null</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Not Null</em>' attribute.
	 * @see #isNotNull()
	 * @generated
	 */
	void setNotNull(boolean value);

	/**
	 * Returns the value of the '<em><b>Unique Index</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Unique Index</em>' attribute.
	 * @see #setUniqueIndex(boolean)
	 * @see relationalmodel.RelationalmodelPackage#getColumn_UniqueIndex()
	 * @model
	 * @generated
	 */
	boolean isUniqueIndex();

	/**
	 * Sets the value of the '{@link relationalmodel.Column#isUniqueIndex <em>Unique Index</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Unique Index</em>' attribute.
	 * @see #isUniqueIndex()
	 * @generated
	 */
	void setUniqueIndex(boolean value);

	/**
	 * Returns the value of the '<em><b>Is Auto Incremental</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Auto Incremental</em>' attribute.
	 * @see #setIsAutoIncremental(boolean)
	 * @see relationalmodel.RelationalmodelPackage#getColumn_IsAutoIncremental()
	 * @model
	 * @generated
	 */
	boolean isIsAutoIncremental();

	/**
	 * Sets the value of the '{@link relationalmodel.Column#isIsAutoIncremental <em>Is Auto Incremental</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Auto Incremental</em>' attribute.
	 * @see #isIsAutoIncremental()
	 * @generated
	 */
	void setIsAutoIncremental(boolean value);

} // Column
