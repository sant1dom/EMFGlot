/**
 */
package Glot2.tests;

import junit.framework.Test;
import junit.framework.TestSuite;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test suite for the '<em><b>Glot2</b></em>' package.
 * <!-- end-user-doc -->
 * @generated
 */
public class Glot2Tests extends TestSuite {

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
		TestSuite suite = new Glot2Tests("Glot2 Tests");
		suite.addTestSuite(NamedElementTest.class);
		suite.addTestSuite(SystemTest.class);
		return suite;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Glot2Tests(String name) {
		super(name);
	}

} //Glot2Tests
