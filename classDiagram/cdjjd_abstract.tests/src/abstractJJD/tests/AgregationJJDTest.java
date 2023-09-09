/**
 */
package abstractJJD.tests;

import abstractJJD.AbstractJJDFactory;
import abstractJJD.AgregationJJD;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Agregation JJD</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class AgregationJJDTest extends RelationJJDTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(AgregationJJDTest.class);
	}

	/**
	 * Constructs a new Agregation JJD test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AgregationJJDTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Agregation JJD test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected AgregationJJD getFixture() {
		return (AgregationJJD)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(AbstractJJDFactory.eINSTANCE.createAgregationJJD());
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

} //AgregationJJDTest
