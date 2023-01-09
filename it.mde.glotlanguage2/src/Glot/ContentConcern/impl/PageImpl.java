/**
 */
package Glot.ContentConcern.impl;

import Glot.ContentConcern.ContentConcernPackage;
import Glot.ContentConcern.DForm;
import Glot.ContentConcern.Index;
import Glot.ContentConcern.Page;

import Glot.impl.NamedElementImpl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Page</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Glot.ContentConcern.impl.PageImpl#getIndexes <em>Indexes</em>}</li>
 *   <li>{@link Glot.ContentConcern.impl.PageImpl#getForms <em>Forms</em>}</li>
 *   <li>{@link Glot.ContentConcern.impl.PageImpl#getLinks <em>Links</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PageImpl extends NamedElementImpl implements Page {
	/**
	 * The cached value of the '{@link #getIndexes() <em>Indexes</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIndexes()
	 * @generated
	 * @ordered
	 */
	protected EList<Index> indexes;

	/**
	 * The cached value of the '{@link #getForms() <em>Forms</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getForms()
	 * @generated
	 * @ordered
	 */
	protected EList<DForm> forms;

	/**
	 * The cached value of the '{@link #getLinks() <em>Links</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLinks()
	 * @generated
	 * @ordered
	 */
	protected EList<Page> links;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PageImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ContentConcernPackage.Literals.PAGE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Index> getIndexes() {
		if (indexes == null) {
			indexes = new EObjectContainmentEList<Index>(Index.class, this, ContentConcernPackage.PAGE__INDEXES);
		}
		return indexes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DForm> getForms() {
		if (forms == null) {
			forms = new EObjectContainmentEList<DForm>(DForm.class, this, ContentConcernPackage.PAGE__FORMS);
		}
		return forms;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Page> getLinks() {
		if (links == null) {
			links = new EObjectResolvingEList<Page>(Page.class, this, ContentConcernPackage.PAGE__LINKS);
		}
		return links;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ContentConcernPackage.PAGE__INDEXES:
				return ((InternalEList<?>)getIndexes()).basicRemove(otherEnd, msgs);
			case ContentConcernPackage.PAGE__FORMS:
				return ((InternalEList<?>)getForms()).basicRemove(otherEnd, msgs);
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
			case ContentConcernPackage.PAGE__INDEXES:
				return getIndexes();
			case ContentConcernPackage.PAGE__FORMS:
				return getForms();
			case ContentConcernPackage.PAGE__LINKS:
				return getLinks();
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
			case ContentConcernPackage.PAGE__INDEXES:
				getIndexes().clear();
				getIndexes().addAll((Collection<? extends Index>)newValue);
				return;
			case ContentConcernPackage.PAGE__FORMS:
				getForms().clear();
				getForms().addAll((Collection<? extends DForm>)newValue);
				return;
			case ContentConcernPackage.PAGE__LINKS:
				getLinks().clear();
				getLinks().addAll((Collection<? extends Page>)newValue);
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
			case ContentConcernPackage.PAGE__INDEXES:
				getIndexes().clear();
				return;
			case ContentConcernPackage.PAGE__FORMS:
				getForms().clear();
				return;
			case ContentConcernPackage.PAGE__LINKS:
				getLinks().clear();
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
			case ContentConcernPackage.PAGE__INDEXES:
				return indexes != null && !indexes.isEmpty();
			case ContentConcernPackage.PAGE__FORMS:
				return forms != null && !forms.isEmpty();
			case ContentConcernPackage.PAGE__LINKS:
				return links != null && !links.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //PageImpl
