/**
 */
package abstractrelationalmodel;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see abstractrelationalmodel.AbstractrelationalmodelPackage
 * @generated
 */
public interface AbstractrelationalmodelFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	AbstractrelationalmodelFactory eINSTANCE = abstractrelationalmodel.impl.AbstractrelationalmodelFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Model Factory Abstract Relational Model</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Model Factory Abstract Relational Model</em>'.
	 * @generated
	 */
	ModelFactoryAbstractRelationalModel createModelFactoryAbstractRelationalModel();

	/**
	 * Returns a new object of class '<em>Schema</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Schema</em>'.
	 * @generated
	 */
	Schema createSchema();

	/**
	 * Returns a new object of class '<em>Table</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Table</em>'.
	 * @generated
	 */
	Table createTable();

	/**
	 * Returns a new object of class '<em>Column</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Column</em>'.
	 * @generated
	 */
	Column createColumn();

	/**
	 * Returns a new object of class '<em>Data Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Data Type</em>'.
	 * @generated
	 */
	DataType createDataType();

	/**
	 * Returns a new object of class '<em>Relation Tables</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Relation Tables</em>'.
	 * @generated
	 */
	RelationTables createRelationTables();

	/**
	 * Returns a new object of class '<em>Relation One To One</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Relation One To One</em>'.
	 * @generated
	 */
	RelationOneToOne createRelationOneToOne();

	/**
	 * Returns a new object of class '<em>Relation One To Many</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Relation One To Many</em>'.
	 * @generated
	 */
	RelationOneToMany createRelationOneToMany();

	/**
	 * Returns a new object of class '<em>Relation Many To One</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Relation Many To One</em>'.
	 * @generated
	 */
	RelationManyToOne createRelationManyToOne();

	/**
	 * Returns a new object of class '<em>Relation Many To Many</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Relation Many To Many</em>'.
	 * @generated
	 */
	RelationManyToMany createRelationManyToMany();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	AbstractrelationalmodelPackage getAbstractrelationalmodelPackage();

} //AbstractrelationalmodelFactory
