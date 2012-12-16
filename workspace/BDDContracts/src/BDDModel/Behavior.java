/**
 */
package BDDModel;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Behavior</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link BDDModel.Behavior#getDescription <em>Description</em>}</li>
 *   <li>{@link BDDModel.Behavior#getRequiringBlocks <em>Requiring Blocks</em>}</li>
 *   <li>{@link BDDModel.Behavior#getEnsuringBlocks <em>Ensuring Blocks</em>}</li>
 * </ul>
 * </p>
 *
 * @see BDDModel.BDDModelPackage#getBehavior()
 * @model
 * @generated
 */
public interface Behavior extends EObject {
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
	 * @see BDDModel.BDDModelPackage#getBehavior_Description()
	 * @model required="true"
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link BDDModel.Behavior#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

	/**
	 * Returns the value of the '<em><b>Requiring Blocks</b></em>' containment reference list.
	 * The list contents are of type {@link BDDModel.Sentence}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Requiring Blocks</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Requiring Blocks</em>' containment reference list.
	 * @see BDDModel.BDDModelPackage#getBehavior_RequiringBlocks()
	 * @model containment="true"
	 * @generated
	 */
	EList<Sentence> getRequiringBlocks();

	/**
	 * Returns the value of the '<em><b>Ensuring Blocks</b></em>' containment reference list.
	 * The list contents are of type {@link BDDModel.Sentence}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ensuring Blocks</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ensuring Blocks</em>' containment reference list.
	 * @see BDDModel.BDDModelPackage#getBehavior_EnsuringBlocks()
	 * @model containment="true"
	 * @generated
	 */
	EList<Sentence> getEnsuringBlocks();

} // Behavior
