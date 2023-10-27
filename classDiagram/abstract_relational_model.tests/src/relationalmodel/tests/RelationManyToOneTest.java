/**
 */
package relationalmodel.tests;

import junit.textui.TestRunner;

import relationalmodel.RelationManyToOne;
import relationalmodel.RelationalmodelFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Relation Many To One</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class RelationManyToOneTest extends RelationTablesTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(RelationManyToOneTest.class);
	}

	/**
	 * Constructs a new Relation Many To One test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RelationManyToOneTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Relation Many To One test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected RelationManyToOne getFixture() {
		return (RelationManyToOne)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(RelationalmodelFactory.eINSTANCE.createRelationManyToOne());
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

} //RelationManyToOneTest
