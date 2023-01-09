/**
 */
package Glot2.tests;

import Glot2.ContentConcern.tests.ContentConcernTests;

import Glot2.DataConcern.tests.DataConcernTests;

import Glot2.FormConcern.tests.FormConcernTests;

import junit.framework.Test;
import junit.framework.TestSuite;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test suite for the '<em><b>Glotlanguage2</b></em>' model.
 * <!-- end-user-doc -->
 * @generated
 */
public class Glotlanguage2AllTests extends TestSuite {

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
		TestSuite suite = new Glotlanguage2AllTests("Glotlanguage2 Tests");
		suite.addTest(Glot2Tests.suite());
		suite.addTest(ContentConcernTests.suite());
		suite.addTest(DataConcernTests.suite());
		suite.addTest(FormConcernTests.suite());
		return suite;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Glotlanguage2AllTests(String name) {
		super(name);
	}

} //Glotlanguage2AllTests
