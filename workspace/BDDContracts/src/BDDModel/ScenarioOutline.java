/**
 */
package BDDModel;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Scenario Outline</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link BDDModel.ScenarioOutline#getExamples <em>Examples</em>}</li>
 * </ul>
 * </p>
 *
 * @see BDDModel.BDDModelPackage#getScenarioOutline()
 * @model
 * @generated
 */
public interface ScenarioOutline extends Scenario {
	/**
	 * Returns the value of the '<em><b>Examples</b></em>' containment reference list.
	 * The list contents are of type {@link BDDModel.Example}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Examples</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Examples</em>' containment reference list.
	 * @see BDDModel.BDDModelPackage#getScenarioOutline_Examples()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<Example> getExamples();

} // ScenarioOutline
