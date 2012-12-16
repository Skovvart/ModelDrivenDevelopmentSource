/**
 */
package SimplifiedJML;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link SimplifiedJML.SimplifiedJMLModel#getStructures <em>Structures</em>}</li>
 * </ul>
 * </p>
 *
 * @see SimplifiedJML.SimplifiedJMLPackage#getSimplifiedJMLModel()
 * @model
 * @generated
 */
public interface SimplifiedJMLModel extends EObject {
	/**
	 * Returns the value of the '<em><b>Structures</b></em>' containment reference list.
	 * The list contents are of type {@link SimplifiedJML.Structure}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Structures</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Structures</em>' containment reference list.
	 * @see SimplifiedJML.SimplifiedJMLPackage#getSimplifiedJMLModel_Structures()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<Structure> getStructures();

} // SimplifiedJMLModel
