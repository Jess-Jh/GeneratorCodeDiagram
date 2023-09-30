/**
 */
package uidiagram.tests;

import junit.textui.TestRunner;

import uidiagram.Appbar;
import uidiagram.UidiagramFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Appbar</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class AppbarTest extends TemplateWidgetTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(AppbarTest.class);
	}

	/**
	 * Constructs a new Appbar test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AppbarTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Appbar test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected Appbar getFixture() {
		return (Appbar)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(UidiagramFactory.eINSTANCE.createAppbar());
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

} //AppbarTest
