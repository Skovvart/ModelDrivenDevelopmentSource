/**
 */
package BDDModel;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Scenario</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link BDDModel.Scenario#getGivenBlocks <em>Given Blocks</em>}</li>
 *   <li>{@link BDDModel.Scenario#getThenBlocks <em>Then Blocks</em>}</li>
 *   <li>{@link BDDModel.Scenario#getWhenBlocks <em>When Blocks</em>}</li>
 *   <li>{@link BDDModel.Scenario#getDescription <em>Description</em>}</li>
 * </ul>
 * </p>
 *
 * @see BDDModel.BDDModelPackage#getScenario()
 * @model abstract="true"
 * @generated
 */
public interface Scenario extends EObject {
	/**
	 * Returns the value of the '<em><b>Given Blocks</b></em>' containment reference list.
	 * The list contents are of type {@link BDDModel.Sentence}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Given Blocks</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Given Blocks</em>' containment reference list.
	 * @see BDDModel.BDDModelPackage#getScenario_GivenBlocks()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<Sentence> getGivenBlocks();

	/**
	 * Returns the value of the '<em><b>Then Blocks</b></em>' containment reference list.
	 * The list contents are of type {@link BDDModel.Sentence}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Then Blocks</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Then Blocks</em>' containment reference list.
	 * @see BDDModel.BDDModelPackage#getScenario_ThenBlocks()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<Sentence> getThenBlocks();

	/**
	 * Returns the value of the '<em><b>When Blocks</b></em>' containment reference list.
	 * The list contents are of type {@link BDDModel.Sentence}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>When Blocks</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>When Blocks</em>' containment reference list.
	 * @see BDDModel.BDDModelPackage#getScenario_WhenBlocks()
	 * @model containment="true"
	 * @generated
	 */
	EList<Sentence> getWhenBlocks();

	/**
	 * Returns the value of the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Description</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Description</em>' attribute.
	 * @see #setDescription(String)
	 * @see BDDModel.BDDModelPackage#getScenario_Description()
	 * @model required="true"
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link BDDModel.Scenario#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

} // Scenario
