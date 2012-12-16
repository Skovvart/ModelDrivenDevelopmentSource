/**
 */
package BDDModel;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Example</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link BDDModel.Example#getValues <em>Values</em>}</li>
 *   <li>{@link BDDModel.Example#getKeys <em>Keys</em>}</li>
 * </ul>
 * </p>
 *
 * @see BDDModel.BDDModelPackage#getExample()
 * @model
 * @generated
 */
public interface Example extends EObject {
	/**
	 * Returns the value of the '<em><b>Keys</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Keys</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Keys</em>' attribute list.
	 * @see BDDModel.BDDModelPackage#getExample_Keys()
	 * @model required="true"
	 * @generated
	 */
	EList<String> getKeys();

	/**
	 * Returns the value of the '<em><b>Values</b></em>' containment reference list.
	 * The list contents are of type {@link BDDModel.Value}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Values</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Values</em>' containment reference list.
	 * @see BDDModel.BDDModelPackage#getExample_Values()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<Value> getValues();

} // Example
