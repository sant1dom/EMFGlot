/**
 */
package Glot.impl;

import Glot.ContentConcern.Page;

import Glot.DataConcern.Entity;

import Glot.FormConcern.Form;

import Glot.GlotPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>System</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Glot.impl.SystemImpl#getVersion <em>Version</em>}</li>
 *   <li>{@link Glot.impl.SystemImpl#getSubversion <em>Subversion</em>}</li>
 *   <li>{@link Glot.impl.SystemImpl#getEntities <em>Entities</em>}</li>
 *   <li>{@link Glot.impl.SystemImpl#getForms <em>Forms</em>}</li>
 *   <li>{@link Glot.impl.SystemImpl#getPages <em>Pages</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SystemImpl extends NamedElementImpl implements Glot.System {
	/**
	 * The default value of the '{@link #getVersion() <em>Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVersion()
	 * @generated
	 * @ordered
	 */
	protected static final int VERSION_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getVersion() <em>Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVersion()
	 * @generated
	 * @ordered
	 */
	protected int version = VERSION_EDEFAULT;

	/**
	 * The default value of the '{@link #getSubversion() <em>Subversion</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubversion()
	 * @generated
	 * @ordered
	 */
	protected static final int SUBVERSION_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getSubversion() <em>Subversion</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubversion()
	 * @generated
	 * @ordered
	 */
	protected int subversion = SUBVERSION_EDEFAULT;

	/**
	 * The cached value of the '{@link #getEntities() <em>Entities</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEntities()
	 * @generated
	 * @ordered
	 */
	protected EList<Entity> entities;

	/**
	 * The cached value of the '{@link #getForms() <em>Forms</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getForms()
	 * @generated
	 * @ordered
	 */
	protected EList<Form> forms;

	/**
	 * The cached value of the '{@link #getPages() <em>Pages</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPages()
	 * @generated
	 * @ordered
	 */
	protected EList<Page> pages;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SystemImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GlotPackage.Literals.SYSTEM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getVersion() {
		return version;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVersion(int newVersion) {
		int oldVersion = version;
		version = newVersion;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GlotPackage.SYSTEM__VERSION, oldVersion, version));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getSubversion() {
		return subversion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSubversion(int newSubversion) {
		int oldSubversion = subversion;
		subversion = newSubversion;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GlotPackage.SYSTEM__SUBVERSION, oldSubversion, subversion));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Entity> getEntities() {
		if (entities == null) {
			entities = new EObjectContainmentEList<Entity>(Entity.class, this, GlotPackage.SYSTEM__ENTITIES);
		}
		return entities;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Form> getForms() {
		if (forms == null) {
			forms = new EObjectContainmentEList<Form>(Form.class, this, GlotPackage.SYSTEM__FORMS);
		}
		return forms;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Page> getPages() {
		if (pages == null) {
			pages = new EObjectContainmentEList<Page>(Page.class, this, GlotPackage.SYSTEM__PAGES);
		}
		return pages;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case GlotPackage.SYSTEM__ENTITIES:
				return ((InternalEList<?>)getEntities()).basicRemove(otherEnd, msgs);
			case GlotPackage.SYSTEM__FORMS:
				return ((InternalEList<?>)getForms()).basicRemove(otherEnd, msgs);
			case GlotPackage.SYSTEM__PAGES:
				return ((InternalEList<?>)getPages()).basicRemove(otherEnd, msgs);
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
			case GlotPackage.SYSTEM__VERSION:
				return getVersion();
			case GlotPackage.SYSTEM__SUBVERSION:
				return getSubversion();
			case GlotPackage.SYSTEM__ENTITIES:
				return getEntities();
			case GlotPackage.SYSTEM__FORMS:
				return getForms();
			case GlotPackage.SYSTEM__PAGES:
				return getPages();
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
			case GlotPackage.SYSTEM__VERSION:
				setVersion((Integer)newValue);
				return;
			case GlotPackage.SYSTEM__SUBVERSION:
				setSubversion((Integer)newValue);
				return;
			case GlotPackage.SYSTEM__ENTITIES:
				getEntities().clear();
				getEntities().addAll((Collection<? extends Entity>)newValue);
				return;
			case GlotPackage.SYSTEM__FORMS:
				getForms().clear();
				getForms().addAll((Collection<? extends Form>)newValue);
				return;
			case GlotPackage.SYSTEM__PAGES:
				getPages().clear();
				getPages().addAll((Collection<? extends Page>)newValue);
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
			case GlotPackage.SYSTEM__VERSION:
				setVersion(VERSION_EDEFAULT);
				return;
			case GlotPackage.SYSTEM__SUBVERSION:
				setSubversion(SUBVERSION_EDEFAULT);
				return;
			case GlotPackage.SYSTEM__ENTITIES:
				getEntities().clear();
				return;
			case GlotPackage.SYSTEM__FORMS:
				getForms().clear();
				return;
			case GlotPackage.SYSTEM__PAGES:
				getPages().clear();
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
			case GlotPackage.SYSTEM__VERSION:
				return version != VERSION_EDEFAULT;
			case GlotPackage.SYSTEM__SUBVERSION:
				return subversion != SUBVERSION_EDEFAULT;
			case GlotPackage.SYSTEM__ENTITIES:
				return entities != null && !entities.isEmpty();
			case GlotPackage.SYSTEM__FORMS:
				return forms != null && !forms.isEmpty();
			case GlotPackage.SYSTEM__PAGES:
				return pages != null && !pages.isEmpty();
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

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (version: ");
		result.append(version);
		result.append(", subversion: ");
		result.append(subversion);
		result.append(')');
		return result.toString();
	}

} //SystemImpl
