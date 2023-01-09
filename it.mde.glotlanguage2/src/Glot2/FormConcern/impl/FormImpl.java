/**
 */
package Glot2.FormConcern.impl;

import Glot2.DataConcern.Entity;

import Glot2.FormConcern.Element;
import Glot2.FormConcern.Form;
import Glot2.FormConcern.FormConcernPackage;
import Glot2.FormConcern._MethodType;

import Glot2.impl.NamedElementImpl;

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
 * An implementation of the model object '<em><b>Form</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Glot2.FormConcern.impl.FormImpl#getMethod <em>Method</em>}</li>
 *   <li>{@link Glot2.FormConcern.impl.FormImpl#getElements <em>Elements</em>}</li>
 *   <li>{@link Glot2.FormConcern.impl.FormImpl#getEntity <em>Entity</em>}</li>
 *   <li>{@link Glot2.FormConcern.impl.FormImpl#getElementsNumber <em>Elements Number</em>}</li>
 * </ul>
 *
 * @generated
 */
public class FormImpl extends NamedElementImpl implements Form {
	/**
	 * The default value of the '{@link #getMethod() <em>Method</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMethod()
	 * @generated
	 * @ordered
	 */
	protected static final _MethodType METHOD_EDEFAULT = _MethodType.POST;

	/**
	 * The cached value of the '{@link #getMethod() <em>Method</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMethod()
	 * @generated
	 * @ordered
	 */
	protected _MethodType method = METHOD_EDEFAULT;

	/**
	 * The cached value of the '{@link #getElements() <em>Elements</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getElements()
	 * @generated
	 * @ordered
	 */
	protected EList<Element> elements;

	/**
	 * The cached value of the '{@link #getEntity() <em>Entity</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEntity()
	 * @generated
	 * @ordered
	 */
	protected Entity entity;

	/**
	 * The default value of the '{@link #getElementsNumber() <em>Elements Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getElementsNumber()
	 * @generated
	 * @ordered
	 */
	protected static final int ELEMENTS_NUMBER_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getElementsNumber() <em>Elements Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getElementsNumber()
	 * @generated
	 * @ordered
	 */
	protected int elementsNumber = ELEMENTS_NUMBER_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FormImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FormConcernPackage.Literals.FORM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public _MethodType getMethod() {
		return method;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMethod(_MethodType newMethod) {
		_MethodType oldMethod = method;
		method = newMethod == null ? METHOD_EDEFAULT : newMethod;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FormConcernPackage.FORM__METHOD, oldMethod, method));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Element> getElements() {
		if (elements == null) {
			elements = new EObjectContainmentEList<Element>(Element.class, this, FormConcernPackage.FORM__ELEMENTS);
		}
		return elements;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Entity getEntity() {
		if (entity != null && entity.eIsProxy()) {
			InternalEObject oldEntity = (InternalEObject)entity;
			entity = (Entity)eResolveProxy(oldEntity);
			if (entity != oldEntity) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FormConcernPackage.FORM__ENTITY, oldEntity, entity));
			}
		}
		return entity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Entity basicGetEntity() {
		return entity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEntity(Entity newEntity) {
		Entity oldEntity = entity;
		entity = newEntity;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FormConcernPackage.FORM__ENTITY, oldEntity, entity));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getElementsNumber() {
		return elementsNumber;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setElementsNumber(int newElementsNumber) {
		int oldElementsNumber = elementsNumber;
		elementsNumber = newElementsNumber;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FormConcernPackage.FORM__ELEMENTS_NUMBER, oldElementsNumber, elementsNumber));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FormConcernPackage.FORM__ELEMENTS:
				return ((InternalEList<?>)getElements()).basicRemove(otherEnd, msgs);
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
			case FormConcernPackage.FORM__METHOD:
				return getMethod();
			case FormConcernPackage.FORM__ELEMENTS:
				return getElements();
			case FormConcernPackage.FORM__ENTITY:
				if (resolve) return getEntity();
				return basicGetEntity();
			case FormConcernPackage.FORM__ELEMENTS_NUMBER:
				return getElementsNumber();
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
			case FormConcernPackage.FORM__METHOD:
				setMethod((_MethodType)newValue);
				return;
			case FormConcernPackage.FORM__ELEMENTS:
				getElements().clear();
				getElements().addAll((Collection<? extends Element>)newValue);
				return;
			case FormConcernPackage.FORM__ENTITY:
				setEntity((Entity)newValue);
				return;
			case FormConcernPackage.FORM__ELEMENTS_NUMBER:
				setElementsNumber((Integer)newValue);
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
			case FormConcernPackage.FORM__METHOD:
				setMethod(METHOD_EDEFAULT);
				return;
			case FormConcernPackage.FORM__ELEMENTS:
				getElements().clear();
				return;
			case FormConcernPackage.FORM__ENTITY:
				setEntity((Entity)null);
				return;
			case FormConcernPackage.FORM__ELEMENTS_NUMBER:
				setElementsNumber(ELEMENTS_NUMBER_EDEFAULT);
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
			case FormConcernPackage.FORM__METHOD:
				return method != METHOD_EDEFAULT;
			case FormConcernPackage.FORM__ELEMENTS:
				return elements != null && !elements.isEmpty();
			case FormConcernPackage.FORM__ENTITY:
				return entity != null;
			case FormConcernPackage.FORM__ELEMENTS_NUMBER:
				return elementsNumber != ELEMENTS_NUMBER_EDEFAULT;
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
		result.append(" (method: ");
		result.append(method);
		result.append(", elementsNumber: ");
		result.append(elementsNumber);
		result.append(')');
		return result.toString();
	}

} //FormImpl
