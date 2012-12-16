/**
 */
package BDDModel.tests;

import BDDModel.BDDModelFactory;
import BDDModel.ScenarioSpecific;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Scenario Specific</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class ScenarioSpecificTest extends ScenarioTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(ScenarioSpecificTest.class);
	}

	/**
	 * Constructs a new Scenario Specific test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ScenarioSpecificTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Scenario Specific test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected ScenarioSpecific getFixture() {
		return (ScenarioSpecific)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(BDDModelFactory.eINSTANCE.createScenarioSpecific());
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

} //ScenarioSpecificTest
