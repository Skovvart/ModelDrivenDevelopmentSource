/**
 */
package BDDModel;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Background</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link BDDModel.Background#getGivenBlocks <em>Given Blocks</em>}</li>
 * </ul>
 * </p>
 *
 * @see BDDModel.BDDModelPackage#getBackground()
 * @model
 * @generated
 */
public interface Background extends EObject {
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
	 * @see BDDModel.BDDModelPackage#getBackground_GivenBlocks()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<Sentence> getGivenBlocks();

} // Background
