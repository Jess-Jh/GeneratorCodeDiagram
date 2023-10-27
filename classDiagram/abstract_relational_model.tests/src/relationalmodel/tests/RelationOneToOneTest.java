/**
 */
package relationalmodel.tests;

import junit.textui.TestRunner;

import relationalmodel.RelationOneToOne;
import relationalmodel.RelationalmodelFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Relation One To One</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class RelationOneToOneTest extends RelationTablesTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(RelationOneToOneTest.class);
	}

	/**
	 * Constructs a new Relation One To One test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RelationOneToOneTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Relation One To One test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected RelationOneToOne getFixture() {
		return (RelationOneToOne)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(RelationalmodelFactory.eINSTANCE.createRelationOneToOne());
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

} //RelationOneToOneTest
