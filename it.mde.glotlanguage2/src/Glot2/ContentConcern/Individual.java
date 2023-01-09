/**
 */
package Glot2.ContentConcern;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Individual</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Glot2.ContentConcern.Individual#getIndex <em>Index</em>}</li>
 * </ul>
 *
 * @see Glot2.ContentConcern.ContentConcernPackage#getIndividual()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='SameEntityAsParent'"
 * @generated
 */
public interface Individual extends DynamicContent {
	/**
	 * Returns the value of the '<em><b>Index</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Index</em>' reference.
	 * @see #setIndex(Index)
	 * @see Glot2.ContentConcern.ContentConcernPackage#getIndividual_Index()
	 * @model required="true" derived="true"
	 * @generated
	 */
	Index getIndex();

	/**
	 * Sets the value of the '{@link Glot2.ContentConcern.Individual#getIndex <em>Index</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Index</em>' reference.
	 * @see #getIndex()
	 * @generated
	 */
	void setIndex(Index value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='Index.allInstances()-&gt;select(a | a.individuals-&gt;includes(self))-&gt;asSequence()-&gt;first().entity = self.entity'"
	 * @generated
	 */
	boolean SameEntityAsParent(DiagnosticChain diagnostics, Map<Object, Object> context);

} // Individual
