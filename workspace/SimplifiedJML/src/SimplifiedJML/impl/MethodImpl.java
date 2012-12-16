/**
 */
package SimplifiedJML.impl;

import SimplifiedJML.Method;
import SimplifiedJML.SimplifiedJMLPackage;

import java.util.Collection;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Method</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link SimplifiedJML.impl.MethodImpl#getSignature <em>Signature</em>}</li>
 *   <li>{@link SimplifiedJML.impl.MethodImpl#getEnsures <em>Ensures</em>}</li>
 *   <li>{@link SimplifiedJML.impl.MethodImpl#getRequirements <em>Requirements</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class MethodImpl extends EObjectImpl implements Method {
	/**
	 * The default value of the '{@link #getSignature() <em>Signature</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSignature()
	 * @generated
	 * @ordered
	 */
	protected static final String SIGNATURE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSignature() <em>Signature</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSignature()
	 * @generated
	 * @ordered
	 */
	protected String signature = SIGNATURE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getEnsures() <em>Ensures</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEnsures()
	 * @generated
	 * @ordered
	 */
	protected EList<String> ensures;

	/**
	 * The cached value of the '{@link #getRequirements() <em>Requirements</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRequirements()
	 * @generated
	 * @ordered
	 */
	protected EList<String> requirements;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MethodImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SimplifiedJMLPackage.Literals.METHOD;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSignature() {
		return signature;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSignature(String newSignature) {
		String oldSignature = signature;
		signature = newSignature;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SimplifiedJMLPackage.METHOD__SIGNATURE, oldSignature, signature));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getEnsures() {
		if (ensures == null) {
			ensures = new EDataTypeUniqueEList<String>(String.class, this, SimplifiedJMLPackage.METHOD__ENSURES);
		}
		return ensures;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getRequirements() {
		if (requirements == null) {
			requirements = new EDataTypeUniqueEList<String>(String.class, this, SimplifiedJMLPackage.METHOD__REQUIREMENTS);
		}
		return requirements;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SimplifiedJMLPackage.METHOD__SIGNATURE:
				return getSignature();
			case SimplifiedJMLPackage.METHOD__ENSURES:
				return getEnsures();
			case SimplifiedJMLPackage.METHOD__REQUIREMENTS:
				return getRequirements();
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
			case SimplifiedJMLPackage.METHOD__SIGNATURE:
				setSignature((String)newValue);
				return;
			case SimplifiedJMLPackage.METHOD__ENSURES:
				getEnsures().clear();
				getEnsures().addAll((Collection<? extends String>)newValue);
				return;
			case SimplifiedJMLPackage.METHOD__REQUIREMENTS:
				getRequirements().clear();
				getRequirements().addAll((Collection<? extends String>)newValue);
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
			case SimplifiedJMLPackage.METHOD__SIGNATURE:
				setSignature(SIGNATURE_EDEFAULT);
				return;
			case SimplifiedJMLPackage.METHOD__ENSURES:
				getEnsures().clear();
				return;
			case SimplifiedJMLPackage.METHOD__REQUIREMENTS:
				getRequirements().clear();
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
			case SimplifiedJMLPackage.METHOD__SIGNATURE:
				return SIGNATURE_EDEFAULT == null ? signature != null : !SIGNATURE_EDEFAULT.equals(signature);
			case SimplifiedJMLPackage.METHOD__ENSURES:
				return ensures != null && !ensures.isEmpty();
			case SimplifiedJMLPackage.METHOD__REQUIREMENTS:
				return requirements != null && !requirements.isEmpty();
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
		result.append(" (signature: ");
		result.append(signature);
		result.append(", ensures: ");
		result.append(ensures);
		result.append(", requirements: ");
		result.append(requirements);
		result.append(')');
		return result.toString();
	}

} //MethodImpl
