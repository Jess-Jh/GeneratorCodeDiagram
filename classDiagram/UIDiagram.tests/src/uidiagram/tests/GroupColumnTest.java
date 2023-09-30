/**
 */
package uidiagram.tests;

import junit.textui.TestRunner;

import uidiagram.GroupColumn;
import uidiagram.UidiagramFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Group Column</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class GroupColumnTest extends TemplateWidgetTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(GroupColumnTest.class);
	}

	/**
	 * Constructs a new Group Column test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GroupColumnTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Group Column test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected GroupColumn getFixture() {
		return (GroupColumn)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(UidiagramFactory.eINSTANCE.createGroupColumn());
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

} //GroupColumnTest
