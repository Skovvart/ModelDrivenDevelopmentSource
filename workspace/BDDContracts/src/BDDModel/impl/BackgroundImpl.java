/**
 */
package BDDModel.impl;

import BDDModel.BDDModelPackage;
import BDDModel.Background;
import BDDModel.Sentence;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Background</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link BDDModel.impl.BackgroundImpl#getGivenBlocks <em>Given Blocks</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class BackgroundImpl extends EObjectImpl implements Background {
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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BackgroundImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BDDModelPackage.Literals.BACKGROUND;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Sentence> getGivenBlocks() {
		if (givenBlocks == null) {
			givenBlocks = new EObjectContainmentEList<Sentence>(Sentence.class, this, BDDModelPackage.BACKGROUND__GIVEN_BLOCKS);
		}
		return givenBlocks;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case BDDModelPackage.BACKGROUND__GIVEN_BLOCKS:
				return ((InternalEList<?>)getGivenBlocks()).basicRemove(otherEnd, msgs);
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
			case BDDModelPackage.BACKGROUND__GIVEN_BLOCKS:
				return getGivenBlocks();
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
			case BDDModelPackage.BACKGROUND__GIVEN_BLOCKS:
				getGivenBlocks().clear();
				getGivenBlocks().addAll((Collection<? extends Sentence>)newValue);
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
			case BDDModelPackage.BACKGROUND__GIVEN_BLOCKS:
				getGivenBlocks().clear();
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
			case BDDModelPackage.BACKGROUND__GIVEN_BLOCKS:
				return givenBlocks != null && !givenBlocks.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //BackgroundImpl
