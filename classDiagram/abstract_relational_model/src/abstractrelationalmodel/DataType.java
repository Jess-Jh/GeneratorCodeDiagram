/**
 */
package abstractrelationalmodel;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Data Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link abstractrelationalmodel.DataType#getName <em>Name</em>}</li>
 *   <li>{@link abstractrelationalmodel.DataType#getDescription <em>Description</em>}</li>
 *   <li>{@link abstractrelationalmodel.DataType#getSize <em>Size</em>}</li>
 * </ul>
 *
 * @see abstractrelationalmodel.AbstractrelationalmodelPackage#getDataType()
 * @model
 * @generated
 */
public interface DataType extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see abstractrelationalmodel.AbstractrelationalmodelPackage#getDataType_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link abstractrelationalmodel.DataType#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Description</em>' attribute.
	 * @see #setDescription(String)
	 * @see abstractrelationalmodel.AbstractrelationalmodelPackage#getDataType_Description()
	 * @model
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link abstractrelationalmodel.DataType#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

	/**
	 * Returns the value of the '<em><b>Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Size</em>' attribute.
	 * @see #setSize(String)
	 * @see abstractrelationalmodel.AbstractrelationalmodelPackage#getDataType_Size()
	 * @model
	 * @generated
	 */
	String getSize();

	/**
	 * Sets the value of the '{@link abstractrelationalmodel.DataType#getSize <em>Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Size</em>' attribute.
	 * @see #getSize()
	 * @generated
	 */
	void setSize(String value);

} // DataType