/**
 */
package Glot.ContentConcern;

import java.util.Map;
import org.eclipse.emf.common.util.DiagnosticChain;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Individual</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see Glot.ContentConcern.ContentConcernPackage#getIndividual()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='SameEntityAsParent'"
 * @generated
 */
public interface Individual extends DContent {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='Index.allInstances()-&gt;select(a | a.individuals-&gt;includes(self))-&gt;asSequence()-&gt;first().entity = self.entity'"
	 * @generated
	 */
	boolean SameEntityAsParent(DiagnosticChain diagnostics, Map<Object, Object> context);
} // Individual
