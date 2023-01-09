/**
 */
package Glot2.DataConcern.tests;

import junit.framework.Test;
import junit.framework.TestSuite;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test suite for the '<em><b>DataConcern</b></em>' package.
 * <!-- end-user-doc -->
 * @generated
 */
public class DataConcernTests extends TestSuite {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(suite());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static Test suite() {
		TestSuite suite = new DataConcernTests("DataConcern Tests");
		suite.addTestSuite(AttributeTest.class);
		suite.addTestSuite(EntityTest.class);
		suite.addTestSuite(ReferenceTest.class);
		return suite;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataConcernTests(String name) {
		super(name);
	}

} //DataConcernTests
