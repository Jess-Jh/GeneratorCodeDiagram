/**
 */
package relationalmodel;

import org.eclipse.emf.common.util.EList;

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
 *   <li>{@link relationalmodel.Column#isIsPrimaryKey <em>Is Primary Key</em>}</li>
 *   <li>{@link relationalmodel.Column#isNotNull <em>Not Null</em>}</li>
 *   <li>{@link relationalmodel.Column#isUniqueIndex <em>Unique Index</em>}</li>
 *   <li>{@link relationalmodel.Column#isIsBinaryColumn <em>Is Binary Column</em>}</li>
 *   <li>{@link relationalmodel.Column#isUnsignedDataType <em>Unsigned Data Type</em>}</li>
 *   <li>{@link relationalmodel.Column#isFillUpValuesColumn <em>Fill Up Values Column</em>}</li>
 *   <li>{@link relationalmodel.Column#isIsAutoIncremental <em>Is Auto Incremental</em>}</li>
 *   <li>{@link relationalmodel.Column#isGeneratedColumn <em>Generated Column</em>}</li>
 *   <li>{@link relationalmodel.Column#getExpression <em>Expression</em>}</li>
 *   <li>{@link relationalmodel.Column#getListDataType <em>List Data Type</em>}</li>
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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Data Type</em>' containment reference.
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
	 * @see #getDataType()
	 * @generated
	 */
	void setDataType(DataType value);

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
	 * Returns the value of the '<em><b>Is Binary Column</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Binary Column</em>' attribute.
	 * @see #setIsBinaryColumn(boolean)
	 * @see relationalmodel.RelationalmodelPackage#getColumn_IsBinaryColumn()
	 * @model
	 * @generated
	 */
	boolean isIsBinaryColumn();

	/**
	 * Sets the value of the '{@link relationalmodel.Column#isIsBinaryColumn <em>Is Binary Column</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Binary Column</em>' attribute.
	 * @see #isIsBinaryColumn()
	 * @generated
	 */
	void setIsBinaryColumn(boolean value);

	/**
	 * Returns the value of the '<em><b>Unsigned Data Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Unsigned Data Type</em>' attribute.
	 * @see #setUnsignedDataType(boolean)
	 * @see relationalmodel.RelationalmodelPackage#getColumn_UnsignedDataType()
	 * @model
	 * @generated
	 */
	boolean isUnsignedDataType();

	/**
	 * Sets the value of the '{@link relationalmodel.Column#isUnsignedDataType <em>Unsigned Data Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Unsigned Data Type</em>' attribute.
	 * @see #isUnsignedDataType()
	 * @generated
	 */
	void setUnsignedDataType(boolean value);

	/**
	 * Returns the value of the '<em><b>Fill Up Values Column</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fill Up Values Column</em>' attribute.
	 * @see #setFillUpValuesColumn(boolean)
	 * @see relationalmodel.RelationalmodelPackage#getColumn_FillUpValuesColumn()
	 * @model
	 * @generated
	 */
	boolean isFillUpValuesColumn();

	/**
	 * Sets the value of the '{@link relationalmodel.Column#isFillUpValuesColumn <em>Fill Up Values Column</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Fill Up Values Column</em>' attribute.
	 * @see #isFillUpValuesColumn()
	 * @generated
	 */
	void setFillUpValuesColumn(boolean value);

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

	/**
	 * Returns the value of the '<em><b>Generated Column</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Generated Column</em>' attribute.
	 * @see #setGeneratedColumn(boolean)
	 * @see relationalmodel.RelationalmodelPackage#getColumn_GeneratedColumn()
	 * @model
	 * @generated
	 */
	boolean isGeneratedColumn();

	/**
	 * Sets the value of the '{@link relationalmodel.Column#isGeneratedColumn <em>Generated Column</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Generated Column</em>' attribute.
	 * @see #isGeneratedColumn()
	 * @generated
	 */
	void setGeneratedColumn(boolean value);

	/**
	 * Returns the value of the '<em><b>Expression</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Expression</em>' attribute.
	 * @see #setExpression(String)
	 * @see relationalmodel.RelationalmodelPackage#getColumn_Expression()
	 * @model
	 * @generated
	 */
	String getExpression();

	/**
	 * Sets the value of the '{@link relationalmodel.Column#getExpression <em>Expression</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Expression</em>' attribute.
	 * @see #getExpression()
	 * @generated
	 */
	void setExpression(String value);

	/**
	 * Returns the value of the '<em><b>List Data Type</b></em>' containment reference list.
	 * The list contents are of type {@link relationalmodel.DataType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>List Data Type</em>' containment reference list.
	 * @see relationalmodel.RelationalmodelPackage#getColumn_ListDataType()
	 * @model containment="true"
	 * @generated
	 */
	EList<DataType> getListDataType();

} // Column
