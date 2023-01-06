/**
 */
package Glot.ContentConcern;

import Glot.NamedElement;

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
 *   <li>{@link Glot.ContentConcern.Page#getIndexes <em>Indexes</em>}</li>
 *   <li>{@link Glot.ContentConcern.Page#getForms <em>Forms</em>}</li>
 *   <li>{@link Glot.ContentConcern.Page#getLinks <em>Links</em>}</li>
 * </ul>
 *
 * @see Glot.ContentConcern.ContentConcernPackage#getPage()
 * @model
 * @generated
 */
public interface Page extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Indexes</b></em>' containment reference list.
	 * The list contents are of type {@link Glot.ContentConcern.Index}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Indexes</em>' containment reference list.
	 * @see Glot.ContentConcern.ContentConcernPackage#getPage_Indexes()
	 * @model containment="true"
	 * @generated
	 */
	EList<Index> getIndexes();

	/**
	 * Returns the value of the '<em><b>Forms</b></em>' containment reference list.
	 * The list contents are of type {@link Glot.ContentConcern.DForm}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Forms</em>' containment reference list.
	 * @see Glot.ContentConcern.ContentConcernPackage#getPage_Forms()
	 * @model containment="true"
	 * @generated
	 */
	EList<DForm> getForms();

	/**
	 * Returns the value of the '<em><b>Links</b></em>' reference list.
	 * The list contents are of type {@link Glot.ContentConcern.Page}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Links</em>' reference list.
	 * @see Glot.ContentConcern.ContentConcernPackage#getPage_Links()
	 * @model
	 * @generated
	 */
	EList<Page> getLinks();

} // Page
