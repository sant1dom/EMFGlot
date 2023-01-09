/**
 */
package Glot2.ContentConcern;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
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
 *   <li>{@link Glot2.ContentConcern.Index#getIndividuals <em>Individuals</em>}</li>
 * </ul>
 *
 * @see Glot2.ContentConcern.ContentConcernPackage#getIndex()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='NoDuplicates'"
 * @generated
 */
public interface Index extends DynamicContent {
	/**
	 * Returns the value of the '<em><b>Individuals</b></em>' reference list.
	 * The list contents are of type {@link Glot2.ContentConcern.Individual}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Individuals</em>' reference list.
	 * @see Glot2.ContentConcern.ContentConcernPackage#getIndex_Individuals()
	 * @model
	 * @generated
	 */
	EList<Individual> getIndividuals();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='Index.allInstances()-&gt;select(name=self.name)-&gt;size()=1'"
	 * @generated
	 */
	boolean NoDuplicates(DiagnosticChain diagnostics, Map<Object, Object> context);

} // Index
