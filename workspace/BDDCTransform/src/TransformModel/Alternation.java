/**
 */
package TransformModel;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Alternation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link TransformModel.Alternation#getChoices <em>Choices</em>}</li>
 * </ul>
 * </p>
 *
 * @see TransformModel.TransformModelPackage#getAlternation()
 * @model
 * @generated
 */
public interface Alternation extends Pattern {
	/**
	 * Returns the value of the '<em><b>Choices</b></em>' containment reference list.
	 * The list contents are of type {@link TransformModel.Pattern}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Choices</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Choices</em>' containment reference list.
	 * @see TransformModel.TransformModelPackage#getAlternation_Choices()
	 * @model containment="true" lower="2"
	 * @generated
	 */
	EList<Pattern> getChoices();

} // Alternation
