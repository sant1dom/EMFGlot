/**
 */
package Glot2.ContentConcern.tests;

import junit.framework.Test;
import junit.framework.TestSuite;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test suite for the '<em><b>ContentConcern</b></em>' package.
 * <!-- end-user-doc -->
 * @generated
 */
public class ContentConcernTests extends TestSuite {

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
		TestSuite suite = new ContentConcernTests("ContentConcern Tests");
		suite.addTestSuite(IndividualTest.class);
		suite.addTestSuite(IndexTest.class);
		suite.addTestSuite(PageTest.class);
		return suite;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ContentConcernTests(String name) {
		super(name);
	}

} //ContentConcernTests
