/**
 */
package SimplifiedJML;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Method</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link SimplifiedJML.Method#getSignature <em>Signature</em>}</li>
 *   <li>{@link SimplifiedJML.Method#getEnsures <em>Ensures</em>}</li>
 *   <li>{@link SimplifiedJML.Method#getRequirements <em>Requirements</em>}</li>
 * </ul>
 * </p>
 *
 * @see SimplifiedJML.SimplifiedJMLPackage#getMethod()
 * @model
 * @generated
 */
public interface Method extends EObject {
	/**
	 * Returns the value of the '<em><b>Signature</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Signature</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Signature</em>' attribute.
	 * @see #setSignature(String)
	 * @see SimplifiedJML.SimplifiedJMLPackage#getMethod_Signature()
	 * @model
	 * @generated
	 */
	String getSignature();

	/**
	 * Sets the value of the '{@link SimplifiedJML.Method#getSignature <em>Signature</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Signature</em>' attribute.
	 * @see #getSignature()
	 * @generated
	 */
	void setSignature(String value);

	/**
	 * Returns the value of the '<em><b>Ensures</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ensures</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ensures</em>' attribute list.
	 * @see SimplifiedJML.SimplifiedJMLPackage#getMethod_Ensures()
	 * @model
	 * @generated
	 */
	EList<String> getEnsures();

	/**
	 * Returns the value of the '<em><b>Requirements</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Requirements</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Requirements</em>' attribute list.
	 * @see SimplifiedJML.SimplifiedJMLPackage#getMethod_Requirements()
	 * @model
	 * @generated
	 */
	EList<String> getRequirements();

} // Method
