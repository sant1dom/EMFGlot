/**
 */
package Glot2.DataConcern;

import Glot2.NamedElement;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
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
 *   <li>{@link Glot2.DataConcern.Entity#getFeatures <em>Features</em>}</li>
 * </ul>
 *
 * @see Glot2.DataConcern.DataConcernPackage#getEntity()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='AtLeastOnePK'"
 * @generated
 */
public interface Entity extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Features</b></em>' containment reference list.
	 * The list contents are of type {@link Glot2.DataConcern.Feature}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Features</em>' containment reference list.
	 * @see Glot2.DataConcern.DataConcernPackage#getEntity_Features()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<Feature> getFeatures();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='Entity.allInstances()-&gt;select(name=self.name)-&gt;size()=1'"
	 * @generated
	 */
	boolean NoDuplicates(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='features-&gt;select(a | a.oclIsKindOf(Attribute) and a.oclAsType(Attribute).isPrimaryKey=true)-&gt;size() &gt; 0'"
	 * @generated
	 */
	boolean AtLeastOnePK(DiagnosticChain diagnostics, Map<Object, Object> context);

} // Entity
