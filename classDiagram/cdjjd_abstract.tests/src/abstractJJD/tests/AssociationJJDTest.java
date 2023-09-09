/**
 */
package abstractJJD.tests;

import abstractJJD.AbstractJJDFactory;
import abstractJJD.AssociationJJD;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Association JJD</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class AssociationJJDTest extends RelationJJDTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(AssociationJJDTest.class);
	}

	/**
	 * Constructs a new Association JJD test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AssociationJJDTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Association JJD test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected AssociationJJD getFixture() {
		return (AssociationJJD)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(AbstractJJDFactory.eINSTANCE.createAssociationJJD());
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

} //AssociationJJDTest
