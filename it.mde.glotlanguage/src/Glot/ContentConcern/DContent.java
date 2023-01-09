/**
 */
package Glot.ContentConcern;

import Glot.DataConcern.Entity;
import Glot.DataConcern.Feature;

import java.util.Map;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>DContent</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Glot.ContentConcern.DContent#getEntity <em>Entity</em>}</li>
 *   <li>{@link Glot.ContentConcern.DContent#getFeatures <em>Features</em>}</li>
 * </ul>
 *
 * @see Glot.ContentConcern.ContentConcernPackage#getDContent()
 * @model abstract="true"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore constraints='OnlyFeaturesFromRef'"
 * @generated
 */
public interface DContent extends Content {
	/**
	 * Returns the value of the '<em><b>Entity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Entity</em>' reference.
	 * @see #setEntity(Entity)
	 * @see Glot.ContentConcern.ContentConcernPackage#getDContent_Entity()
	 * @model required="true"
	 * @generated
	 */
	Entity getEntity();

	/**
	 * Sets the value of the '{@link Glot.ContentConcern.DContent#getEntity <em>Entity</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Entity</em>' reference.
	 * @see #getEntity()
	 * @generated
	 */
	void setEntity(Entity value);

	/**
	 * Returns the value of the '<em><b>Features</b></em>' reference list.
	 * The list contents are of type {@link Glot.DataConcern.Feature}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Features</em>' reference list.
	 * @see Glot.ContentConcern.ContentConcernPackage#getDContent_Features()
	 * @model required="true"
	 * @generated
	 */
	EList<Feature> getFeatures();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='entity.features-&gt;includesAll(features)'"
	 * @generated
	 */
	boolean OnlyFeaturesFromRef(DiagnosticChain diagnostics, Map<Object, Object> context);

} // DContent
