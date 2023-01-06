/**
 */
package Glot.FormConcern;

import Glot.DataConcern.Entity;

import Glot.NamedElement;

import java.math.BigInteger;
import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Form</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Glot.FormConcern.Form#getMethod <em>Method</em>}</li>
 *   <li>{@link Glot.FormConcern.Form#getElements <em>Elements</em>}</li>
 *   <li>{@link Glot.FormConcern.Form#getEntity <em>Entity</em>}</li>
 *   <li>{@link Glot.FormConcern.Form#getElementsNumber <em>Elements Number</em>}</li>
 * </ul>
 *
 * @see Glot.FormConcern.FormConcernPackage#getForm()
 * @model
 * @generated
 */
public interface Form extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Method</b></em>' attribute.
	 * The literals are from the enumeration {@link Glot.FormConcern._MethodType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Method</em>' attribute.
	 * @see Glot.FormConcern._MethodType
	 * @see #setMethod(_MethodType)
	 * @see Glot.FormConcern.FormConcernPackage#getForm_Method()
	 * @model
	 * @generated
	 */
	_MethodType getMethod();

	/**
	 * Sets the value of the '{@link Glot.FormConcern.Form#getMethod <em>Method</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Method</em>' attribute.
	 * @see Glot.FormConcern._MethodType
	 * @see #getMethod()
	 * @generated
	 */
	void setMethod(_MethodType value);

	/**
	 * Returns the value of the '<em><b>Elements</b></em>' containment reference list.
	 * The list contents are of type {@link Glot.FormConcern.Element}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Elements</em>' containment reference list.
	 * @see Glot.FormConcern.FormConcernPackage#getForm_Elements()
	 * @model containment="true"
	 * @generated
	 */
	EList<Element> getElements();

	/**
	 * Returns the value of the '<em><b>Entity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Entity</em>' reference.
	 * @see #setEntity(Entity)
	 * @see Glot.FormConcern.FormConcernPackage#getForm_Entity()
	 * @model
	 * @generated
	 */
	Entity getEntity();

	/**
	 * Sets the value of the '{@link Glot.FormConcern.Form#getEntity <em>Entity</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Entity</em>' reference.
	 * @see #getEntity()
	 * @generated
	 */
	void setEntity(Entity value);

	/**
	 * Returns the value of the '<em><b>Elements Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Elements Number</em>' attribute.
	 * @see #setElementsNumber(BigInteger)
	 * @see Glot.FormConcern.FormConcernPackage#getForm_ElementsNumber()
	 * @model required="true" volatile="true" derived="true"
	 * @generated
	 */
	BigInteger getElementsNumber();

	/**
	 * Sets the value of the '{@link Glot.FormConcern.Form#getElementsNumber <em>Elements Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Elements Number</em>' attribute.
	 * @see #getElementsNumber()
	 * @generated
	 */
	void setElementsNumber(BigInteger value);

} // Form
