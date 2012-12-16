/**
 */
package TransformModel.impl;

import TransformModel.IfDef;
import TransformModel.TransformModelPackage;
import TransformModel.Transformation;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>If Def</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link TransformModel.impl.IfDefImpl#getVariables <em>Variables</em>}</li>
 *   <li>{@link TransformModel.impl.IfDefImpl#getTrue_body <em>True body</em>}</li>
 *   <li>{@link TransformModel.impl.IfDefImpl#getFalse_body <em>False body</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class IfDefImpl extends EObjectImpl implements IfDef {
	/**
	 * The cached value of the '{@link #getVariables() <em>Variables</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVariables()
	 * @generated
	 * @ordered
	 */
	protected EList<String> variables;

	/**
	 * The cached value of the '{@link #getTrue_body() <em>True body</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTrue_body()
	 * @generated
	 * @ordered
	 */
	protected Transformation true_body;

	/**
	 * The cached value of the '{@link #getFalse_body() <em>False body</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFalse_body()
	 * @generated
	 * @ordered
	 */
	protected Transformation false_body;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IfDefImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TransformModelPackage.Literals.IF_DEF;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getVariables() {
		if (variables == null) {
			variables = new EDataTypeUniqueEList<String>(String.class, this, TransformModelPackage.IF_DEF__VARIABLES);
		}
		return variables;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Transformation getTrue_body() {
		return true_body;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTrue_body(Transformation newTrue_body, NotificationChain msgs) {
		Transformation oldTrue_body = true_body;
		true_body = newTrue_body;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TransformModelPackage.IF_DEF__TRUE_BODY, oldTrue_body, newTrue_body);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTrue_body(Transformation newTrue_body) {
		if (newTrue_body != true_body) {
			NotificationChain msgs = null;
			if (true_body != null)
				msgs = ((InternalEObject)true_body).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TransformModelPackage.IF_DEF__TRUE_BODY, null, msgs);
			if (newTrue_body != null)
				msgs = ((InternalEObject)newTrue_body).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - TransformModelPackage.IF_DEF__TRUE_BODY, null, msgs);
			msgs = basicSetTrue_body(newTrue_body, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TransformModelPackage.IF_DEF__TRUE_BODY, newTrue_body, newTrue_body));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Transformation getFalse_body() {
		return false_body;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFalse_body(Transformation newFalse_body, NotificationChain msgs) {
		Transformation oldFalse_body = false_body;
		false_body = newFalse_body;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TransformModelPackage.IF_DEF__FALSE_BODY, oldFalse_body, newFalse_body);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFalse_body(Transformation newFalse_body) {
		if (newFalse_body != false_body) {
			NotificationChain msgs = null;
			if (false_body != null)
				msgs = ((InternalEObject)false_body).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TransformModelPackage.IF_DEF__FALSE_BODY, null, msgs);
			if (newFalse_body != null)
				msgs = ((InternalEObject)newFalse_body).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - TransformModelPackage.IF_DEF__FALSE_BODY, null, msgs);
			msgs = basicSetFalse_body(newFalse_body, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TransformModelPackage.IF_DEF__FALSE_BODY, newFalse_body, newFalse_body));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case TransformModelPackage.IF_DEF__TRUE_BODY:
				return basicSetTrue_body(null, msgs);
			case TransformModelPackage.IF_DEF__FALSE_BODY:
				return basicSetFalse_body(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case TransformModelPackage.IF_DEF__VARIABLES:
				return getVariables();
			case TransformModelPackage.IF_DEF__TRUE_BODY:
				return getTrue_body();
			case TransformModelPackage.IF_DEF__FALSE_BODY:
				return getFalse_body();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case TransformModelPackage.IF_DEF__VARIABLES:
				getVariables().clear();
				getVariables().addAll((Collection<? extends String>)newValue);
				return;
			case TransformModelPackage.IF_DEF__TRUE_BODY:
				setTrue_body((Transformation)newValue);
				return;
			case TransformModelPackage.IF_DEF__FALSE_BODY:
				setFalse_body((Transformation)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case TransformModelPackage.IF_DEF__VARIABLES:
				getVariables().clear();
				return;
			case TransformModelPackage.IF_DEF__TRUE_BODY:
				setTrue_body((Transformation)null);
				return;
			case TransformModelPackage.IF_DEF__FALSE_BODY:
				setFalse_body((Transformation)null);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case TransformModelPackage.IF_DEF__VARIABLES:
				return variables != null && !variables.isEmpty();
			case TransformModelPackage.IF_DEF__TRUE_BODY:
				return true_body != null;
			case TransformModelPackage.IF_DEF__FALSE_BODY:
				return false_body != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (variables: ");
		result.append(variables);
		result.append(')');
		return result.toString();
	}

} //IfDefImpl
