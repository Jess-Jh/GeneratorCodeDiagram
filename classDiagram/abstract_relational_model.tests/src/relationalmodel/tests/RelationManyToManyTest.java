/**
 */
package relationalmodel.tests;

import junit.textui.TestRunner;

import relationalmodel.RelationManyToMany;
import relationalmodel.RelationalmodelFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Relation Many To Many</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class RelationManyToManyTest extends RelationTablesTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(RelationManyToManyTest.class);
	}

	/**
	 * Constructs a new Relation Many To Many test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RelationManyToManyTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Relation Many To Many test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected RelationManyToMany getFixture() {
		return (RelationManyToMany)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(RelationalmodelFactory.eINSTANCE.createRelationManyToMany());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#tearDown()
	 * @generated
	 */
	@Override
	protected void tearDown() throws Exception {
		setFixture(null);
	}

} //RelationManyToManyTest
