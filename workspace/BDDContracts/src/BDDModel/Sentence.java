/**
 */
package BDDModel;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Sentence</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link BDDModel.Sentence#getWords <em>Words</em>}</li>
 * </ul>
 * </p>
 *
 * @see BDDModel.BDDModelPackage#getSentence()
 * @model
 * @generated
 */
public interface Sentence extends EObject {
	/**
	 * Returns the value of the '<em><b>Words</b></em>' containment reference list.
	 * The list contents are of type {@link BDDModel.Content}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Words</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Words</em>' containment reference list.
	 * @see BDDModel.BDDModelPackage#getSentence_Words()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<Content> getWords();

} // Sentence
