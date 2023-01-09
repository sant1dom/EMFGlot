/**
 */
package Glot2;

import Glot2.ContentConcern.Page;

import Glot2.DataConcern.Entity;

import Glot2.FormConcern.Form;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>System</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Glot2.System#getVersion <em>Version</em>}</li>
 *   <li>{@link Glot2.System#getSubversion <em>Subversion</em>}</li>
 *   <li>{@link Glot2.System#getEntities <em>Entities</em>}</li>
 *   <li>{@link Glot2.System#getForms <em>Forms</em>}</li>
 *   <li>{@link Glot2.System#getPages <em>Pages</em>}</li>
 *   <li>{@link Glot2.System#getFullVersion <em>Full Version</em>}</li>
 * </ul>
 *
 * @see Glot2.Glot2Package#getSystem()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='SubVersionBetweenZeroAndNine'"
 * @generated
 */
public interface System extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Version</em>' attribute.
	 * @see #setVersion(int)
	 * @see Glot2.Glot2Package#getSystem_Version()
	 * @model required="true"
	 * @generated
	 */
	int getVersion();

	/**
	 * Sets the value of the '{@link Glot2.System#getVersion <em>Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Version</em>' attribute.
	 * @see #getVersion()
	 * @generated
	 */
	void setVersion(int value);

	/**
	 * Returns the value of the '<em><b>Subversion</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Subversion</em>' attribute.
	 * @see #setSubversion(int)
	 * @see Glot2.Glot2Package#getSystem_Subversion()
	 * @model required="true"
	 * @generated
	 */
	int getSubversion();

	/**
	 * Sets the value of the '{@link Glot2.System#getSubversion <em>Subversion</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Subversion</em>' attribute.
	 * @see #getSubversion()
	 * @generated
	 */
	void setSubversion(int value);

	/**
	 * Returns the value of the '<em><b>Entities</b></em>' containment reference list.
	 * The list contents are of type {@link Glot2.DataConcern.Entity}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Entities</em>' containment reference list.
	 * @see Glot2.Glot2Package#getSystem_Entities()
	 * @model containment="true"
	 * @generated
	 */
	EList<Entity> getEntities();

	/**
	 * Returns the value of the '<em><b>Forms</b></em>' containment reference list.
	 * The list contents are of type {@link Glot2.FormConcern.Form}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Forms</em>' containment reference list.
	 * @see Glot2.Glot2Package#getSystem_Forms()
	 * @model containment="true"
	 * @generated
	 */
	EList<Form> getForms();

	/**
	 * Returns the value of the '<em><b>Pages</b></em>' containment reference list.
	 * The list contents are of type {@link Glot2.ContentConcern.Page}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pages</em>' containment reference list.
	 * @see Glot2.Glot2Package#getSystem_Pages()
	 * @model containment="true"
	 * @generated
	 */
	EList<Page> getPages();

	/**
	 * Returns the value of the '<em><b>Full Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Full Version</em>' attribute.
	 * @see #setFullVersion(String)
	 * @see Glot2.Glot2Package#getSystem_FullVersion()
	 * @model required="true" derived="true"
	 * @generated
	 */
	String getFullVersion();

	/**
	 * Sets the value of the '{@link Glot2.System#getFullVersion <em>Full Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Full Version</em>' attribute.
	 * @see #getFullVersion()
	 * @generated
	 */
	void setFullVersion(String value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" versionRequired="true" subversionRequired="true"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='(version.toString().concat(\'.\')).concat(subversion.toString())'"
	 * @generated
	 */
	String JoinVersion(int version, int subversion);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='Tuple {\n\tmessage : String = \'Subversion should be between zero and nine\',\n\tstatus : Boolean = self.subversion &lt; 10 and self.subversion &gt;= 0\n}.status'"
	 * @generated
	 */
	boolean SubVersionBetweenZeroAndNine(DiagnosticChain diagnostics, Map<Object, Object> context);

} // System
