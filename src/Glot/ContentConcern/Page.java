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
 *   <li>{@link Glot.ContentConcern.Page#getContents <em>Contents</em>}</li>
 *   <li>{@link Glot.ContentConcern.Page#getLinks <em>Links</em>}</li>
 * </ul>
 *
 * @see Glot.ContentConcern.ContentConcernPackage#getPage()
 * @model
 * @generated
 */
public interface Page extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Contents</b></em>' containment reference list.
	 * The list contents are of type {@link Glot.ContentConcern.Content}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Contents</em>' containment reference list.
	 * @see Glot.ContentConcern.ContentConcernPackage#getPage_Contents()
	 * @model containment="true"
	 * @generated
	 */
	EList<Content> getContents();

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
