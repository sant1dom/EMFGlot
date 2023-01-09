/**
 */
package Glot2.DataConcern;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Reference</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Glot2.DataConcern.Reference#getForeignKey <em>Foreign Key</em>}</li>
 * </ul>
 *
 * @see Glot2.DataConcern.DataConcernPackage#getReference()
 * @model
 * @generated
 */
public interface Reference extends Feature {
	/**
	 * Returns the value of the '<em><b>Foreign Key</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Foreign Key</em>' reference.
	 * @see #setForeignKey(Entity)
	 * @see Glot2.DataConcern.DataConcernPackage#getReference_ForeignKey()
	 * @model required="true"
	 * @generated
	 */
	Entity getForeignKey();

	/**
	 * Sets the value of the '{@link Glot2.DataConcern.Reference#getForeignKey <em>Foreign Key</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Foreign Key</em>' reference.
	 * @see #getForeignKey()
	 * @generated
	 */
	void setForeignKey(Entity value);

} // Reference
