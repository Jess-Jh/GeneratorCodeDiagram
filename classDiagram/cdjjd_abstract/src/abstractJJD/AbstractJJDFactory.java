/**
 */
package abstractJJD;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see abstractJJD.AbstractJJDPackage
 * @generated
 */
public interface AbstractJJDFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	AbstractJJDFactory eINSTANCE = abstractJJD.impl.AbstractJJDFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Model Factory Abstract JJD</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Model Factory Abstract JJD</em>'.
	 * @generated
	 */
	ModelFactoryAbstractJJD createModelFactoryAbstractJJD();

	/**
	 * Returns a new object of class '<em>Package JJD</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Package JJD</em>'.
	 * @generated
	 */
	PackageJJD createPackageJJD();

	/**
	 * Returns a new object of class '<em>Class JJD</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Class JJD</em>'.
	 * @generated
	 */
	ClassJJD createClassJJD();

	/**
	 * Returns a new object of class '<em>Attribute JJD</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Attribute JJD</em>'.
	 * @generated
	 */
	AttributeJJD createAttributeJJD();

	/**
	 * Returns a new object of class '<em>Method JJD</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Method JJD</em>'.
	 * @generated
	 */
	MethodJJD createMethodJJD();

	/**
	 * Returns a new object of class '<em>Relation JJD</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Relation JJD</em>'.
	 * @generated
	 */
	RelationJJD createRelationJJD();

	/**
	 * Returns a new object of class '<em>Agregation JJD</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Agregation JJD</em>'.
	 * @generated
	 */
	AgregationJJD createAgregationJJD();

	/**
	 * Returns a new object of class '<em>Inheritance JJD</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Inheritance JJD</em>'.
	 * @generated
	 */
	InheritanceJJD createInheritanceJJD();

	/**
	 * Returns a new object of class '<em>Containment JJD</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Containment JJD</em>'.
	 * @generated
	 */
	ContainmentJJD createContainmentJJD();

	/**
	 * Returns a new object of class '<em>Association JJD</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Association JJD</em>'.
	 * @generated
	 */
	AssociationJJD createAssociationJJD();

	/**
	 * Returns a new object of class '<em>Implement JJD</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Implement JJD</em>'.
	 * @generated
	 */
	ImplementJJD createImplementJJD();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	AbstractJJDPackage getAbstractJJDPackage();

} //AbstractJJDFactory
