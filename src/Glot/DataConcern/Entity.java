/**
 */
package Glot.DataConcern;

import Glot.NamedElement;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Entity</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Glot.DataConcern.Entity#getFeatures <em>Features</em>}</li>
 *   <li>{@link Glot.DataConcern.Entity#getTest <em>Test</em>}</li>
 * </ul>
 *
 * @see Glot.DataConcern.DataConcernPackage#getEntity()
 * @model
 * @generated
 */
public interface Entity extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Features</b></em>' containment reference list.
	 * The list contents are of type {@link Glot.DataConcern.Feature}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Features</em>' containment reference list.
	 * @see Glot.DataConcern.DataConcernPackage#getEntity_Features()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<Feature> getFeatures();

	/**
	 * Returns the value of the '<em><b>Test</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Test</em>' attribute.
	 * @see #setTest(int)
	 * @see Glot.DataConcern.DataConcernPackage#getEntity_Test()
	 * @model required="true" volatile="true" derived="true"
	 * @generated
	 */
	int getTest();

	/**
	 * Sets the value of the '{@link Glot.DataConcern.Entity#getTest <em>Test</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Test</em>' attribute.
	 * @see #getTest()
	 * @generated
	 */
	void setTest(int value);

} // Entity
