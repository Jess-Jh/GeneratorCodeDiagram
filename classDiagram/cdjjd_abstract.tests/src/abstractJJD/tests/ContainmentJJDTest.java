/**
 */
package abstractJJD.tests;

import abstractJJD.AbstractJJDFactory;
import abstractJJD.ContainmentJJD;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Containment JJD</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class ContainmentJJDTest extends RelationJJDTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(ContainmentJJDTest.class);
	}

	/**
	 * Constructs a new Containment JJD test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ContainmentJJDTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Containment JJD test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected ContainmentJJD getFixture() {
		return (ContainmentJJD)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(AbstractJJDFactory.eINSTANCE.createContainmentJJD());
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

} //ContainmentJJDTest
