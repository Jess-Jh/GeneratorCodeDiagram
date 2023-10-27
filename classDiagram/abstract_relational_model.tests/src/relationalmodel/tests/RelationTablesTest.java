/**
 */
package relationalmodel.tests;

import junit.framework.TestCase;

import junit.textui.TestRunner;

import relationalmodel.RelationTables;
import relationalmodel.RelationalmodelFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Relation Tables</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class RelationTablesTest extends TestCase {

	/**
	 * The fixture for this Relation Tables test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RelationTables fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(RelationTablesTest.class);
	}

	/**
	 * Constructs a new Relation Tables test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RelationTablesTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Relation Tables test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(RelationTables fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Relation Tables test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RelationTables getFixture() {
		return fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(RelationalmodelFactory.eINSTANCE.createRelationTables());
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

} //RelationTablesTest
