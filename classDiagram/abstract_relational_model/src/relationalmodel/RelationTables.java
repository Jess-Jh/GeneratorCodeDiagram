/**
 */
package relationalmodel;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Relation Tables</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link relationalmodel.RelationTables#getRolA <em>Rol A</em>}</li>
 *   <li>{@link relationalmodel.RelationTables#getRolB <em>Rol B</em>}</li>
 *   <li>{@link relationalmodel.RelationTables#getNavigabilityA <em>Navigability A</em>}</li>
 *   <li>{@link relationalmodel.RelationTables#getNavigabilityB <em>Navigability B</em>}</li>
 *   <li>{@link relationalmodel.RelationTables#getMultiplicityA <em>Multiplicity A</em>}</li>
 *   <li>{@link relationalmodel.RelationTables#getMultiplicityB <em>Multiplicity B</em>}</li>
 *   <li>{@link relationalmodel.RelationTables#getSource <em>Source</em>}</li>
 *   <li>{@link relationalmodel.RelationTables#getTarget <em>Target</em>}</li>
 * </ul>
 *
 * @see relationalmodel.RelationalmodelPackage#getRelationTables()
 * @model
 * @generated
 */
public interface RelationTables extends EObject {
	/**
	 * Returns the value of the '<em><b>Rol A</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rol A</em>' attribute.
	 * @see #setRolA(String)
	 * @see relationalmodel.RelationalmodelPackage#getRelationTables_RolA()
	 * @model
	 * @generated
	 */
	String getRolA();

	/**
	 * Sets the value of the '{@link relationalmodel.RelationTables#getRolA <em>Rol A</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rol A</em>' attribute.
	 * @see #getRolA()
	 * @generated
	 */
	void setRolA(String value);

	/**
	 * Returns the value of the '<em><b>Rol B</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rol B</em>' attribute.
	 * @see #setRolB(String)
	 * @see relationalmodel.RelationalmodelPackage#getRelationTables_RolB()
	 * @model
	 * @generated
	 */
	String getRolB();

	/**
	 * Sets the value of the '{@link relationalmodel.RelationTables#getRolB <em>Rol B</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rol B</em>' attribute.
	 * @see #getRolB()
	 * @generated
	 */
	void setRolB(String value);

	/**
	 * Returns the value of the '<em><b>Navigability A</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Navigability A</em>' attribute.
	 * @see #setNavigabilityA(String)
	 * @see relationalmodel.RelationalmodelPackage#getRelationTables_NavigabilityA()
	 * @model
	 * @generated
	 */
	String getNavigabilityA();

	/**
	 * Sets the value of the '{@link relationalmodel.RelationTables#getNavigabilityA <em>Navigability A</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Navigability A</em>' attribute.
	 * @see #getNavigabilityA()
	 * @generated
	 */
	void setNavigabilityA(String value);

	/**
	 * Returns the value of the '<em><b>Navigability B</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Navigability B</em>' attribute.
	 * @see #setNavigabilityB(String)
	 * @see relationalmodel.RelationalmodelPackage#getRelationTables_NavigabilityB()
	 * @model
	 * @generated
	 */
	String getNavigabilityB();

	/**
	 * Sets the value of the '{@link relationalmodel.RelationTables#getNavigabilityB <em>Navigability B</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Navigability B</em>' attribute.
	 * @see #getNavigabilityB()
	 * @generated
	 */
	void setNavigabilityB(String value);

	/**
	 * Returns the value of the '<em><b>Multiplicity A</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Multiplicity A</em>' attribute.
	 * @see #setMultiplicityA(String)
	 * @see relationalmodel.RelationalmodelPackage#getRelationTables_MultiplicityA()
	 * @model
	 * @generated
	 */
	String getMultiplicityA();

	/**
	 * Sets the value of the '{@link relationalmodel.RelationTables#getMultiplicityA <em>Multiplicity A</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Multiplicity A</em>' attribute.
	 * @see #getMultiplicityA()
	 * @generated
	 */
	void setMultiplicityA(String value);

	/**
	 * Returns the value of the '<em><b>Multiplicity B</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Multiplicity B</em>' attribute.
	 * @see #setMultiplicityB(String)
	 * @see relationalmodel.RelationalmodelPackage#getRelationTables_MultiplicityB()
	 * @model
	 * @generated
	 */
	String getMultiplicityB();

	/**
	 * Sets the value of the '{@link relationalmodel.RelationTables#getMultiplicityB <em>Multiplicity B</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Multiplicity B</em>' attribute.
	 * @see #getMultiplicityB()
	 * @generated
	 */
	void setMultiplicityB(String value);

	/**
	 * Returns the value of the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source</em>' reference.
	 * @see #setSource(Table)
	 * @see relationalmodel.RelationalmodelPackage#getRelationTables_Source()
	 * @model
	 * @generated
	 */
	Table getSource();

	/**
	 * Sets the value of the '{@link relationalmodel.RelationTables#getSource <em>Source</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source</em>' reference.
	 * @see #getSource()
	 * @generated
	 */
	void setSource(Table value);

	/**
	 * Returns the value of the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target</em>' reference.
	 * @see #setTarget(Table)
	 * @see relationalmodel.RelationalmodelPackage#getRelationTables_Target()
	 * @model
	 * @generated
	 */
	Table getTarget();

	/**
	 * Sets the value of the '{@link relationalmodel.RelationTables#getTarget <em>Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target</em>' reference.
	 * @see #getTarget()
	 * @generated
	 */
	void setTarget(Table value);

} // RelationTables
