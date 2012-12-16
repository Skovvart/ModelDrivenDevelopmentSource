/**
 */
package BDDModel.tests;

import BDDModel.BDDModelFactory;
import BDDModel.ScenarioOutline;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Scenario Outline</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class ScenarioOutlineTest extends ScenarioTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(ScenarioOutlineTest.class);
	}

	/**
	 * Constructs a new Scenario Outline test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ScenarioOutlineTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Scenario Outline test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected ScenarioOutline getFixture() {
		return (ScenarioOutline)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(BDDModelFactory.eINSTANCE.createScenarioOutline());
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

} //ScenarioOutlineTest
