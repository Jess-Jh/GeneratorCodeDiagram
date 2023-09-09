/**
 */
package concrete.tests;

import concrete.ConcreteFactory;
import concrete.InheritanceJJD;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Inheritance JJD</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class InheritanceJJDTest extends RelationJJDTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(InheritanceJJDTest.class);
	}

	/**
	 * Constructs a new Inheritance JJD test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InheritanceJJDTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Inheritance JJD test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected InheritanceJJD getFixture() {
		return (InheritanceJJD)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(ConcreteFactory.eINSTANCE.createInheritanceJJD());
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

} //InheritanceJJDTest
