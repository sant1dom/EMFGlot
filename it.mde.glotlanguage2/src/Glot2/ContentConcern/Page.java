/**
 */
package Glot2.ContentConcern;

import Glot2.FormConcern.Form;

import Glot2.NamedElement;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Page</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Glot2.ContentConcern.Page#getIndexes <em>Indexes</em>}</li>
 *   <li>{@link Glot2.ContentConcern.Page#getIndividuals <em>Individuals</em>}</li>
 *   <li>{@link Glot2.ContentConcern.Page#getForms <em>Forms</em>}</li>
 *   <li>{@link Glot2.ContentConcern.Page#getLinks <em>Links</em>}</li>
 * </ul>
 *
 * @see Glot2.ContentConcern.ContentConcernPackage#getPage()
 * @model
 * @generated
 */
public interface Page extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Indexes</b></em>' containment reference list.
	 * The list contents are of type {@link Glot2.ContentConcern.Index}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Indexes</em>' containment reference list.
	 * @see Glot2.ContentConcern.ContentConcernPackage#getPage_Indexes()
	 * @model containment="true"
	 * @generated
	 */
	EList<Index> getIndexes();

	/**
	 * Returns the value of the '<em><b>Individuals</b></em>' containment reference list.
	 * The list contents are of type {@link Glot2.ContentConcern.Individual}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Individuals</em>' containment reference list.
	 * @see Glot2.ContentConcern.ContentConcernPackage#getPage_Individuals()
	 * @model containment="true"
	 * @generated
	 */
	EList<Individual> getIndividuals();

	/**
	 * Returns the value of the '<em><b>Forms</b></em>' reference list.
	 * The list contents are of type {@link Glot2.FormConcern.Form}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Forms</em>' reference list.
	 * @see Glot2.ContentConcern.ContentConcernPackage#getPage_Forms()
	 * @model
	 * @generated
	 */
	EList<Form> getForms();

	/**
	 * Returns the value of the '<em><b>Links</b></em>' reference list.
	 * The list contents are of type {@link Glot2.ContentConcern.Page}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Links</em>' reference list.
	 * @see Glot2.ContentConcern.ContentConcernPackage#getPage_Links()
	 * @model
	 * @generated
	 */
	EList<Page> getLinks();

} // Page
