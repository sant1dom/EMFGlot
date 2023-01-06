/**
 */
package Glot.DataConcern;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Attribute</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Glot.DataConcern.Attribute#isIsPrimaryKey <em>Is Primary Key</em>}</li>
 *   <li>{@link Glot.DataConcern.Attribute#getType <em>Type</em>}</li>
 * </ul>
 *
 * @see Glot.DataConcern.DataConcernPackage#getAttribute()
 * @model
 * @generated
 */
public interface Attribute extends Feature {
	/**
	 * Returns the value of the '<em><b>Is Primary Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Primary Key</em>' attribute.
	 * @see #setIsPrimaryKey(boolean)
	 * @see Glot.DataConcern.DataConcernPackage#getAttribute_IsPrimaryKey()
	 * @model required="true"
	 * @generated
	 */
	boolean isIsPrimaryKey();

	/**
	 * Sets the value of the '{@link Glot.DataConcern.Attribute#isIsPrimaryKey <em>Is Primary Key</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Primary Key</em>' attribute.
	 * @see #isIsPrimaryKey()
	 * @generated
	 */
	void setIsPrimaryKey(boolean value);

	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The literals are from the enumeration {@link Glot.DataConcern._DataType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see Glot.DataConcern._DataType
	 * @see #setType(_DataType)
	 * @see Glot.DataConcern.DataConcernPackage#getAttribute_Type()
	 * @model
	 * @generated
	 */
	_DataType getType();

	/**
	 * Sets the value of the '{@link Glot.DataConcern.Attribute#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see Glot.DataConcern._DataType
	 * @see #getType()
	 * @generated
	 */
	void setType(_DataType value);

} // Attribute
