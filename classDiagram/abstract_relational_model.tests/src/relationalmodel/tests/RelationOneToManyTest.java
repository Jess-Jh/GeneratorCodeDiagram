/**
 */
package relationalmodel.tests;

import junit.textui.TestRunner;

import relationalmodel.RelationOneToMany;
import relationalmodel.RelationalmodelFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Relation One To Many</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class RelationOneToManyTest extends RelationTablesTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(RelationOneToManyTest.class);
	}

	/**
	 * Constructs a new Relation One To Many test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RelationOneToManyTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Relation One To Many test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected RelationOneToMany getFixture() {
		return (RelationOneToMany)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(RelationalmodelFactory.eINSTANCE.createRelationOneToMany());
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

} //RelationOneToManyTest
