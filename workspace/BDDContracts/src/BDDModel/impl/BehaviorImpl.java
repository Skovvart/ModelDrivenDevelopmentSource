/**
 */
package BDDModel.impl;

import BDDModel.BDDModelPackage;
import BDDModel.Behavior;
import BDDModel.Sentence;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Behavior</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link BDDModel.impl.BehaviorImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link BDDModel.impl.BehaviorImpl#getRequiringBlocks <em>Requiring Blocks</em>}</li>
 *   <li>{@link BDDModel.impl.BehaviorImpl#getEnsuringBlocks <em>Ensuring Blocks</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class BehaviorImpl extends EObjectImpl implements Behavior {
	/**
	 * The default value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected static final String DESCRIPTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected String description = DESCRIPTION_EDEFAULT;

	/**
	 * The cached value of the '{@link #getRequiringBlocks() <em>Requiring Blocks</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRequiringBlocks()
	 * @generated
	 * @ordered
	 */
	protected EList<Sentence> requiringBlocks;

	/**
	 * The cached value of the '{@link #getEnsuringBlocks() <em>Ensuring Blocks</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEnsuringBlocks()
	 * @generated
	 * @ordered
	 */
	protected EList<Sentence> ensuringBlocks;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BehaviorImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BDDModelPackage.Literals.BEHAVIOR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDescription(String newDescription) {
		String oldDescription = description;
		description = newDescription;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BDDModelPackage.BEHAVIOR__DESCRIPTION, oldDescription, description));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Sentence> getRequiringBlocks() {
		if (requiringBlocks == null) {
			requiringBlocks = new EObjectContainmentEList<Sentence>(Sentence.class, this, BDDModelPackage.BEHAVIOR__REQUIRING_BLOCKS);
		}
		return requiringBlocks;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Sentence> getEnsuringBlocks() {
		if (ensuringBlocks == null) {
			ensuringBlocks = new EObjectContainmentEList<Sentence>(Sentence.class, this, BDDModelPackage.BEHAVIOR__ENSURING_BLOCKS);
		}
		return ensuringBlocks;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case BDDModelPackage.BEHAVIOR__REQUIRING_BLOCKS:
				return ((InternalEList<?>)getRequiringBlocks()).basicRemove(otherEnd, msgs);
			case BDDModelPackage.BEHAVIOR__ENSURING_BLOCKS:
				return ((InternalEList<?>)getEnsuringBlocks()).basicRemove(otherEnd, msgs);
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
			case BDDModelPackage.BEHAVIOR__DESCRIPTION:
				return getDescription();
			case BDDModelPackage.BEHAVIOR__REQUIRING_BLOCKS:
				return getRequiringBlocks();
			case BDDModelPackage.BEHAVIOR__ENSURING_BLOCKS:
				return getEnsuringBlocks();
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
			case BDDModelPackage.BEHAVIOR__DESCRIPTION:
				setDescription((String)newValue);
				return;
			case BDDModelPackage.BEHAVIOR__REQUIRING_BLOCKS:
				getRequiringBlocks().clear();
				getRequiringBlocks().addAll((Collection<? extends Sentence>)newValue);
				return;
			case BDDModelPackage.BEHAVIOR__ENSURING_BLOCKS:
				getEnsuringBlocks().clear();
				getEnsuringBlocks().addAll((Collection<? extends Sentence>)newValue);
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
			case BDDModelPackage.BEHAVIOR__DESCRIPTION:
				setDescription(DESCRIPTION_EDEFAULT);
				return;
			case BDDModelPackage.BEHAVIOR__REQUIRING_BLOCKS:
				getRequiringBlocks().clear();
				return;
			case BDDModelPackage.BEHAVIOR__ENSURING_BLOCKS:
				getEnsuringBlocks().clear();
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
			case BDDModelPackage.BEHAVIOR__DESCRIPTION:
				return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
			case BDDModelPackage.BEHAVIOR__REQUIRING_BLOCKS:
				return requiringBlocks != null && !requiringBlocks.isEmpty();
			case BDDModelPackage.BEHAVIOR__ENSURING_BLOCKS:
				return ensuringBlocks != null && !ensuringBlocks.isEmpty();
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
		result.append(" (description: ");
		result.append(description);
		result.append(')');
		return result.toString();
	}

} //BehaviorImpl
