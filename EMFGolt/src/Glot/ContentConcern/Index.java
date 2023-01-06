/**
 */
package Glot.ContentConcern;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Index</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Glot.ContentConcern.Index#getIndividualsList <em>Individuals List</em>}</li>
 * </ul>
 *
 * @see Glot.ContentConcern.ContentConcernPackage#getIndex()
 * @model
 * @generated
 */
public interface Index extends DContent {
	/**
	 * Returns the value of the '<em><b>Individuals List</b></em>' containment reference list.
	 * The list contents are of type {@link Glot.ContentConcern.Individual}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Individuals List</em>' containment reference list.
	 * @see Glot.ContentConcern.ContentConcernPackage#getIndex_IndividualsList()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<Individual> getIndividualsList();

} // Index
