/**
 */
package uidiagram.tests;

import junit.textui.TestRunner;

import uidiagram.DatePicker;
import uidiagram.UidiagramFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Date Picker</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class DatePickerTest extends TemplateWidgetTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(DatePickerTest.class);
	}

	/**
	 * Constructs a new Date Picker test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DatePickerTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Date Picker test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected DatePicker getFixture() {
		return (DatePicker)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(UidiagramFactory.eINSTANCE.createDatePicker());
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

} //DatePickerTest
