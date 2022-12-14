/**
 */
package Glot.ContentConcern;

import Glot.GlotPackage;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see Glot.ContentConcern.ContentConcernFactory
 * @model kind="package"
 * @generated
 */
public interface ContentConcernPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "ContentConcern";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "https://it.mde.glotlanguage/contenConcern";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "cc";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ContentConcernPackage eINSTANCE = Glot.ContentConcern.impl.ContentConcernPackageImpl.init();

	/**
	 * The meta object id for the '{@link Glot.ContentConcern.impl.ContentImpl <em>Content</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Glot.ContentConcern.impl.ContentImpl
	 * @see Glot.ContentConcern.impl.ContentConcernPackageImpl#getContent()
	 * @generated
	 */
	int CONTENT = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENT__NAME = GlotPackage.NAMED_ELEMENT__NAME;

	/**
	 * The number of structural features of the '<em>Content</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENT_FEATURE_COUNT = GlotPackage.NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Content</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENT_OPERATION_COUNT = GlotPackage.NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link Glot.ContentConcern.impl.DContentImpl <em>DContent</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Glot.ContentConcern.impl.DContentImpl
	 * @see Glot.ContentConcern.impl.ContentConcernPackageImpl#getDContent()
	 * @generated
	 */
	int DCONTENT = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DCONTENT__NAME = CONTENT__NAME;

	/**
	 * The feature id for the '<em><b>Entity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DCONTENT__ENTITY = CONTENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Features</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DCONTENT__FEATURES = CONTENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>DContent</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DCONTENT_FEATURE_COUNT = CONTENT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>DContent</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DCONTENT_OPERATION_COUNT = CONTENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link Glot.ContentConcern.impl.DFormImpl <em>DForm</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Glot.ContentConcern.impl.DFormImpl
	 * @see Glot.ContentConcern.impl.ContentConcernPackageImpl#getDForm()
	 * @generated
	 */
	int DFORM = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DFORM__NAME = CONTENT__NAME;

	/**
	 * The feature id for the '<em><b>Form</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DFORM__FORM = CONTENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>DForm</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DFORM_FEATURE_COUNT = CONTENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>DForm</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DFORM_OPERATION_COUNT = CONTENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link Glot.ContentConcern.impl.IndividualImpl <em>Individual</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Glot.ContentConcern.impl.IndividualImpl
	 * @see Glot.ContentConcern.impl.ContentConcernPackageImpl#getIndividual()
	 * @generated
	 */
	int INDIVIDUAL = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDIVIDUAL__NAME = DCONTENT__NAME;

	/**
	 * The feature id for the '<em><b>Entity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDIVIDUAL__ENTITY = DCONTENT__ENTITY;

	/**
	 * The feature id for the '<em><b>Features</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDIVIDUAL__FEATURES = DCONTENT__FEATURES;

	/**
	 * The number of structural features of the '<em>Individual</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDIVIDUAL_FEATURE_COUNT = DCONTENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Individual</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDIVIDUAL_OPERATION_COUNT = DCONTENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link Glot.ContentConcern.impl.IndexImpl <em>Index</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Glot.ContentConcern.impl.IndexImpl
	 * @see Glot.ContentConcern.impl.ContentConcernPackageImpl#getIndex()
	 * @generated
	 */
	int INDEX = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDEX__NAME = DCONTENT__NAME;

	/**
	 * The feature id for the '<em><b>Entity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDEX__ENTITY = DCONTENT__ENTITY;

	/**
	 * The feature id for the '<em><b>Features</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDEX__FEATURES = DCONTENT__FEATURES;

	/**
	 * The feature id for the '<em><b>Individuals List</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDEX__INDIVIDUALS_LIST = DCONTENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Index</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDEX_FEATURE_COUNT = DCONTENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Index</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDEX_OPERATION_COUNT = DCONTENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link Glot.ContentConcern.impl.PageImpl <em>Page</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Glot.ContentConcern.impl.PageImpl
	 * @see Glot.ContentConcern.impl.ContentConcernPackageImpl#getPage()
	 * @generated
	 */
	int PAGE = 5;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAGE__NAME = GlotPackage.NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Indexes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAGE__INDEXES = GlotPackage.NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Forms</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAGE__FORMS = GlotPackage.NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Links</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAGE__LINKS = GlotPackage.NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Page</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAGE_FEATURE_COUNT = GlotPackage.NAMED_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Page</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAGE_OPERATION_COUNT = GlotPackage.NAMED_ELEMENT_OPERATION_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link Glot.ContentConcern.Content <em>Content</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Content</em>'.
	 * @see Glot.ContentConcern.Content
	 * @generated
	 */
	EClass getContent();

	/**
	 * Returns the meta object for class '{@link Glot.ContentConcern.DContent <em>DContent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>DContent</em>'.
	 * @see Glot.ContentConcern.DContent
	 * @generated
	 */
	EClass getDContent();

	/**
	 * Returns the meta object for the reference '{@link Glot.ContentConcern.DContent#getEntity <em>Entity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Entity</em>'.
	 * @see Glot.ContentConcern.DContent#getEntity()
	 * @see #getDContent()
	 * @generated
	 */
	EReference getDContent_Entity();

	/**
	 * Returns the meta object for the reference list '{@link Glot.ContentConcern.DContent#getFeatures <em>Features</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Features</em>'.
	 * @see Glot.ContentConcern.DContent#getFeatures()
	 * @see #getDContent()
	 * @generated
	 */
	EReference getDContent_Features();

	/**
	 * Returns the meta object for class '{@link Glot.ContentConcern.DForm <em>DForm</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>DForm</em>'.
	 * @see Glot.ContentConcern.DForm
	 * @generated
	 */
	EClass getDForm();

	/**
	 * Returns the meta object for the reference '{@link Glot.ContentConcern.DForm#getForm <em>Form</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Form</em>'.
	 * @see Glot.ContentConcern.DForm#getForm()
	 * @see #getDForm()
	 * @generated
	 */
	EReference getDForm_Form();

	/**
	 * Returns the meta object for class '{@link Glot.ContentConcern.Individual <em>Individual</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Individual</em>'.
	 * @see Glot.ContentConcern.Individual
	 * @generated
	 */
	EClass getIndividual();

	/**
	 * Returns the meta object for class '{@link Glot.ContentConcern.Index <em>Index</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Index</em>'.
	 * @see Glot.ContentConcern.Index
	 * @generated
	 */
	EClass getIndex();

	/**
	 * Returns the meta object for the containment reference list '{@link Glot.ContentConcern.Index#getIndividualsList <em>Individuals List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Individuals List</em>'.
	 * @see Glot.ContentConcern.Index#getIndividualsList()
	 * @see #getIndex()
	 * @generated
	 */
	EReference getIndex_IndividualsList();

	/**
	 * Returns the meta object for class '{@link Glot.ContentConcern.Page <em>Page</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Page</em>'.
	 * @see Glot.ContentConcern.Page
	 * @generated
	 */
	EClass getPage();

	/**
	 * Returns the meta object for the containment reference list '{@link Glot.ContentConcern.Page#getIndexes <em>Indexes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Indexes</em>'.
	 * @see Glot.ContentConcern.Page#getIndexes()
	 * @see #getPage()
	 * @generated
	 */
	EReference getPage_Indexes();

	/**
	 * Returns the meta object for the containment reference list '{@link Glot.ContentConcern.Page#getForms <em>Forms</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Forms</em>'.
	 * @see Glot.ContentConcern.Page#getForms()
	 * @see #getPage()
	 * @generated
	 */
	EReference getPage_Forms();

	/**
	 * Returns the meta object for the reference list '{@link Glot.ContentConcern.Page#getLinks <em>Links</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Links</em>'.
	 * @see Glot.ContentConcern.Page#getLinks()
	 * @see #getPage()
	 * @generated
	 */
	EReference getPage_Links();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	ContentConcernFactory getContentConcernFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link Glot.ContentConcern.impl.ContentImpl <em>Content</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Glot.ContentConcern.impl.ContentImpl
		 * @see Glot.ContentConcern.impl.ContentConcernPackageImpl#getContent()
		 * @generated
		 */
		EClass CONTENT = eINSTANCE.getContent();

		/**
		 * The meta object literal for the '{@link Glot.ContentConcern.impl.DContentImpl <em>DContent</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Glot.ContentConcern.impl.DContentImpl
		 * @see Glot.ContentConcern.impl.ContentConcernPackageImpl#getDContent()
		 * @generated
		 */
		EClass DCONTENT = eINSTANCE.getDContent();

		/**
		 * The meta object literal for the '<em><b>Entity</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DCONTENT__ENTITY = eINSTANCE.getDContent_Entity();

		/**
		 * The meta object literal for the '<em><b>Features</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DCONTENT__FEATURES = eINSTANCE.getDContent_Features();

		/**
		 * The meta object literal for the '{@link Glot.ContentConcern.impl.DFormImpl <em>DForm</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Glot.ContentConcern.impl.DFormImpl
		 * @see Glot.ContentConcern.impl.ContentConcernPackageImpl#getDForm()
		 * @generated
		 */
		EClass DFORM = eINSTANCE.getDForm();

		/**
		 * The meta object literal for the '<em><b>Form</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DFORM__FORM = eINSTANCE.getDForm_Form();

		/**
		 * The meta object literal for the '{@link Glot.ContentConcern.impl.IndividualImpl <em>Individual</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Glot.ContentConcern.impl.IndividualImpl
		 * @see Glot.ContentConcern.impl.ContentConcernPackageImpl#getIndividual()
		 * @generated
		 */
		EClass INDIVIDUAL = eINSTANCE.getIndividual();

		/**
		 * The meta object literal for the '{@link Glot.ContentConcern.impl.IndexImpl <em>Index</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Glot.ContentConcern.impl.IndexImpl
		 * @see Glot.ContentConcern.impl.ContentConcernPackageImpl#getIndex()
		 * @generated
		 */
		EClass INDEX = eINSTANCE.getIndex();

		/**
		 * The meta object literal for the '<em><b>Individuals List</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INDEX__INDIVIDUALS_LIST = eINSTANCE.getIndex_IndividualsList();

		/**
		 * The meta object literal for the '{@link Glot.ContentConcern.impl.PageImpl <em>Page</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Glot.ContentConcern.impl.PageImpl
		 * @see Glot.ContentConcern.impl.ContentConcernPackageImpl#getPage()
		 * @generated
		 */
		EClass PAGE = eINSTANCE.getPage();

		/**
		 * The meta object literal for the '<em><b>Indexes</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PAGE__INDEXES = eINSTANCE.getPage_Indexes();

		/**
		 * The meta object literal for the '<em><b>Forms</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PAGE__FORMS = eINSTANCE.getPage_Forms();

		/**
		 * The meta object literal for the '<em><b>Links</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PAGE__LINKS = eINSTANCE.getPage_Links();

	}

} //ContentConcernPackage
