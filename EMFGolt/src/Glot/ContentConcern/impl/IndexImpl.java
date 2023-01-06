/**
 */
package Glot.ContentConcern.impl;

import Glot.ContentConcern.ContentConcernPackage;
import Glot.ContentConcern.Index;
import Glot.ContentConcern.Individual;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Index</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Glot.ContentConcern.impl.IndexImpl#getIndividualsList <em>Individuals List</em>}</li>
 * </ul>
 *
 * @generated
 */
public class IndexImpl extends DContentImpl implements Index {
	/**
	 * The cached value of the '{@link #getIndividualsList() <em>Individuals List</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIndividualsList()
	 * @generated
	 * @ordered
	 */
	protected EList<Individual> individualsList;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IndexImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ContentConcernPackage.Literals.INDEX;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Individual> getIndividualsList() {
		if (individualsList == null) {
			individualsList = new EObjectContainmentEList<Individual>(Individual.class, this, ContentConcernPackage.INDEX__INDIVIDUALS_LIST);
		}
		return individualsList;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ContentConcernPackage.INDEX__INDIVIDUALS_LIST:
				return ((InternalEList<?>)getIndividualsList()).basicRemove(otherEnd, msgs);
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
			case ContentConcernPackage.INDEX__INDIVIDUALS_LIST:
				return getIndividualsList();
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
			case ContentConcernPackage.INDEX__INDIVIDUALS_LIST:
				getIndividualsList().clear();
				getIndividualsList().addAll((Collection<? extends Individual>)newValue);
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
			case ContentConcernPackage.INDEX__INDIVIDUALS_LIST:
				getIndividualsList().clear();
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
			case ContentConcernPackage.INDEX__INDIVIDUALS_LIST:
				return individualsList != null && !individualsList.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //IndexImpl
