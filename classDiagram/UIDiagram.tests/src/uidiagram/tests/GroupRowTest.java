/**
 */
package uidiagram.tests;

import junit.textui.TestRunner;

import uidiagram.GroupRow;
import uidiagram.UidiagramFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Group Row</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class GroupRowTest extends TemplateWidgetTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(GroupRowTest.class);
	}

	/**
	 * Constructs a new Group Row test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GroupRowTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Group Row test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected GroupRow getFixture() {
		return (GroupRow)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(UidiagramFactory.eINSTANCE.createGroupRow());
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

} //GroupRowTest
