/**
 */
package TransformModel;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>If Def</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link TransformModel.IfDef#getVariables <em>Variables</em>}</li>
 *   <li>{@link TransformModel.IfDef#getTrue_body <em>True body</em>}</li>
 *   <li>{@link TransformModel.IfDef#getFalse_body <em>False body</em>}</li>
 * </ul>
 * </p>
 *
 * @see TransformModel.TransformModelPackage#getIfDef()
 * @model
 * @generated
 */
public interface IfDef extends Transformation {
	/**
	 * Returns the value of the '<em><b>Variables</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Variables</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Variables</em>' attribute list.
	 * @see TransformModel.TransformModelPackage#getIfDef_Variables()
	 * @model required="true"
	 * @generated
	 */
	EList<String> getVariables();

	/**
	 * Returns the value of the '<em><b>True body</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>True body</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>True body</em>' containment reference.
	 * @see #setTrue_body(Transformation)
	 * @see TransformModel.TransformModelPackage#getIfDef_True_body()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Transformation getTrue_body();

	/**
	 * Sets the value of the '{@link TransformModel.IfDef#getTrue_body <em>True body</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>True body</em>' containment reference.
	 * @see #getTrue_body()
	 * @generated
	 */
	void setTrue_body(Transformation value);

	/**
	 * Returns the value of the '<em><b>False body</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>False body</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>False body</em>' containment reference.
	 * @see #setFalse_body(Transformation)
	 * @see TransformModel.TransformModelPackage#getIfDef_False_body()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Transformation getFalse_body();

	/**
	 * Sets the value of the '{@link TransformModel.IfDef#getFalse_body <em>False body</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>False body</em>' containment reference.
	 * @see #getFalse_body()
	 * @generated
	 */
	void setFalse_body(Transformation value);

} // IfDef
