/**
 */
package BDDModel.impl;

import BDDModel.BDDModelPackage;
import BDDModel.Scenario;
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
 * An implementation of the model object '<em><b>Scenario</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link BDDModel.impl.ScenarioImpl#getGivenBlocks <em>Given Blocks</em>}</li>
 *   <li>{@link BDDModel.impl.ScenarioImpl#getThenBlocks <em>Then Blocks</em>}</li>
 *   <li>{@link BDDModel.impl.ScenarioImpl#getWhenBlocks <em>When Blocks</em>}</li>
 *   <li>{@link BDDModel.impl.ScenarioImpl#getDescription <em>Description</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class ScenarioImpl extends EObjectImpl implements Scenario {
	/**
	 * The cached value of the '{@link #getGivenBlocks() <em>Given Blocks</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGivenBlocks()
	 * @generated
	 * @ordered
	 */
	protected EList<Sentence> givenBlocks;

	/**
	 * The cached value of the '{@link #getThenBlocks() <em>Then Blocks</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getThenBlocks()
	 * @generated
	 * @ordered
	 */
	protected EList<Sentence> thenBlocks;

	/**
	 * The cached value of the '{@link #getWhenBlocks() <em>When Blocks</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWhenBlocks()
	 * @generated
	 * @ordered
	 */
	protected EList<Sentence> whenBlocks;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ScenarioImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BDDModelPackage.Literals.SCENARIO;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Sentence> getGivenBlocks() {
		if (givenBlocks == null) {
			givenBlocks = new EObjectContainmentEList<Sentence>(Sentence.class, this, BDDModelPackage.SCENARIO__GIVEN_BLOCKS);
		}
		return givenBlocks;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Sentence> getThenBlocks() {
		if (thenBlocks == null) {
			thenBlocks = new EObjectContainmentEList<Sentence>(Sentence.class, this, BDDModelPackage.SCENARIO__THEN_BLOCKS);
		}
		return thenBlocks;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Sentence> getWhenBlocks() {
		if (whenBlocks == null) {
			whenBlocks = new EObjectContainmentEList<Sentence>(Sentence.class, this, BDDModelPackage.SCENARIO__WHEN_BLOCKS);
		}
		return whenBlocks;
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
			eNotify(new ENotificationImpl(this, Notification.SET, BDDModelPackage.SCENARIO__DESCRIPTION, oldDescription, description));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case BDDModelPackage.SCENARIO__GIVEN_BLOCKS:
				return ((InternalEList<?>)getGivenBlocks()).basicRemove(otherEnd, msgs);
			case BDDModelPackage.SCENARIO__THEN_BLOCKS:
				return ((InternalEList<?>)getThenBlocks()).basicRemove(otherEnd, msgs);
			case BDDModelPackage.SCENARIO__WHEN_BLOCKS:
				return ((InternalEList<?>)getWhenBlocks()).basicRemove(otherEnd, msgs);
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
			case BDDModelPackage.SCENARIO__GIVEN_BLOCKS:
				return getGivenBlocks();
			case BDDModelPackage.SCENARIO__THEN_BLOCKS:
				return getThenBlocks();
			case BDDModelPackage.SCENARIO__WHEN_BLOCKS:
				return getWhenBlocks();
			case BDDModelPackage.SCENARIO__DESCRIPTION:
				return getDescription();
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
			case BDDModelPackage.SCENARIO__GIVEN_BLOCKS:
				getGivenBlocks().clear();
				getGivenBlocks().addAll((Collection<? extends Sentence>)newValue);
				return;
			case BDDModelPackage.SCENARIO__THEN_BLOCKS:
				getThenBlocks().clear();
				getThenBlocks().addAll((Collection<? extends Sentence>)newValue);
				return;
			case BDDModelPackage.SCENARIO__WHEN_BLOCKS:
				getWhenBlocks().clear();
				getWhenBlocks().addAll((Collection<? extends Sentence>)newValue);
				return;
			case BDDModelPackage.SCENARIO__DESCRIPTION:
				setDescription((String)newValue);
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
			case BDDModelPackage.SCENARIO__GIVEN_BLOCKS:
				getGivenBlocks().clear();
				return;
			case BDDModelPackage.SCENARIO__THEN_BLOCKS:
				getThenBlocks().clear();
				return;
			case BDDModelPackage.SCENARIO__WHEN_BLOCKS:
				getWhenBlocks().clear();
				return;
			case BDDModelPackage.SCENARIO__DESCRIPTION:
				setDescription(DESCRIPTION_EDEFAULT);
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
			case BDDModelPackage.SCENARIO__GIVEN_BLOCKS:
				return givenBlocks != null && !givenBlocks.isEmpty();
			case BDDModelPackage.SCENARIO__THEN_BLOCKS:
				return thenBlocks != null && !thenBlocks.isEmpty();
			case BDDModelPackage.SCENARIO__WHEN_BLOCKS:
				return whenBlocks != null && !whenBlocks.isEmpty();
			case BDDModelPackage.SCENARIO__DESCRIPTION:
				return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
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

} //ScenarioImpl
