/**
 */
package Glot2.ContentConcern;

import Glot2.Glot2Package;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EOperation;
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
 * @see Glot2.ContentConcern.ContentConcernFactory
 * @model kind="package"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore"
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
	String eNS_URI = "https://it.mde.glotlanguage2/contenConcern";

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
	ContentConcernPackage eINSTANCE = Glot2.ContentConcern.impl.ContentConcernPackageImpl.init();

	/**
	 * The meta object id for the '{@link Glot2.ContentConcern.impl.ContentImpl <em>Content</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Glot2.ContentConcern.impl.ContentImpl
	 * @see Glot2.ContentConcern.impl.ContentConcernPackageImpl#getContent()
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
	int CONTENT__NAME = Glot2Package.NAMED_ELEMENT__NAME;

	/**
	 * The number of structural features of the '<em>Content</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENT_FEATURE_COUNT = Glot2Package.NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Name Is Defined</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENT___NAME_IS_DEFINED__STRING = Glot2Package.NAMED_ELEMENT___NAME_IS_DEFINED__STRING;

	/**
	 * The operation id for the '<em>Name Not Empty</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENT___NAME_NOT_EMPTY__DIAGNOSTICCHAIN_MAP = Glot2Package.NAMED_ELEMENT___NAME_NOT_EMPTY__DIAGNOSTICCHAIN_MAP;

	/**
	 * The number of operations of the '<em>Content</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENT_OPERATION_COUNT = Glot2Package.NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link Glot2.ContentConcern.impl.DynamicContentImpl <em>Dynamic Content</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Glot2.ContentConcern.impl.DynamicContentImpl
	 * @see Glot2.ContentConcern.impl.ContentConcernPackageImpl#getDynamicContent()
	 * @generated
	 */
	int DYNAMIC_CONTENT = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DYNAMIC_CONTENT__NAME = CONTENT__NAME;

	/**
	 * The feature id for the '<em><b>Entity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DYNAMIC_CONTENT__ENTITY = CONTENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Features</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DYNAMIC_CONTENT__FEATURES = CONTENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Dynamic Content</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DYNAMIC_CONTENT_FEATURE_COUNT = CONTENT_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>Name Is Defined</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DYNAMIC_CONTENT___NAME_IS_DEFINED__STRING = CONTENT___NAME_IS_DEFINED__STRING;

	/**
	 * The operation id for the '<em>Name Not Empty</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DYNAMIC_CONTENT___NAME_NOT_EMPTY__DIAGNOSTICCHAIN_MAP = CONTENT___NAME_NOT_EMPTY__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Only Features From Ref</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DYNAMIC_CONTENT___ONLY_FEATURES_FROM_REF__DIAGNOSTICCHAIN_MAP = CONTENT_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Dynamic Content</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DYNAMIC_CONTENT_OPERATION_COUNT = CONTENT_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link Glot2.ContentConcern.impl.IndividualImpl <em>Individual</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Glot2.ContentConcern.impl.IndividualImpl
	 * @see Glot2.ContentConcern.impl.ContentConcernPackageImpl#getIndividual()
	 * @generated
	 */
	int INDIVIDUAL = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDIVIDUAL__NAME = DYNAMIC_CONTENT__NAME;

	/**
	 * The feature id for the '<em><b>Entity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDIVIDUAL__ENTITY = DYNAMIC_CONTENT__ENTITY;

	/**
	 * The feature id for the '<em><b>Features</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDIVIDUAL__FEATURES = DYNAMIC_CONTENT__FEATURES;

	/**
	 * The feature id for the '<em><b>Index</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDIVIDUAL__INDEX = DYNAMIC_CONTENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Individual</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDIVIDUAL_FEATURE_COUNT = DYNAMIC_CONTENT_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Name Is Defined</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDIVIDUAL___NAME_IS_DEFINED__STRING = DYNAMIC_CONTENT___NAME_IS_DEFINED__STRING;

	/**
	 * The operation id for the '<em>Name Not Empty</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDIVIDUAL___NAME_NOT_EMPTY__DIAGNOSTICCHAIN_MAP = DYNAMIC_CONTENT___NAME_NOT_EMPTY__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Only Features From Ref</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDIVIDUAL___ONLY_FEATURES_FROM_REF__DIAGNOSTICCHAIN_MAP = DYNAMIC_CONTENT___ONLY_FEATURES_FROM_REF__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Same Entity As Parent</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDIVIDUAL___SAME_ENTITY_AS_PARENT__DIAGNOSTICCHAIN_MAP = DYNAMIC_CONTENT_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Individual</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDIVIDUAL_OPERATION_COUNT = DYNAMIC_CONTENT_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link Glot2.ContentConcern.impl.IndexImpl <em>Index</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Glot2.ContentConcern.impl.IndexImpl
	 * @see Glot2.ContentConcern.impl.ContentConcernPackageImpl#getIndex()
	 * @generated
	 */
	int INDEX = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDEX__NAME = DYNAMIC_CONTENT__NAME;

	/**
	 * The feature id for the '<em><b>Entity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDEX__ENTITY = DYNAMIC_CONTENT__ENTITY;

	/**
	 * The feature id for the '<em><b>Features</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDEX__FEATURES = DYNAMIC_CONTENT__FEATURES;

	/**
	 * The feature id for the '<em><b>Individuals</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDEX__INDIVIDUALS = DYNAMIC_CONTENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Index</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDEX_FEATURE_COUNT = DYNAMIC_CONTENT_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Name Is Defined</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDEX___NAME_IS_DEFINED__STRING = DYNAMIC_CONTENT___NAME_IS_DEFINED__STRING;

	/**
	 * The operation id for the '<em>Name Not Empty</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDEX___NAME_NOT_EMPTY__DIAGNOSTICCHAIN_MAP = DYNAMIC_CONTENT___NAME_NOT_EMPTY__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Only Features From Ref</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDEX___ONLY_FEATURES_FROM_REF__DIAGNOSTICCHAIN_MAP = DYNAMIC_CONTENT___ONLY_FEATURES_FROM_REF__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>No Duplicates</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDEX___NO_DUPLICATES__DIAGNOSTICCHAIN_MAP = DYNAMIC_CONTENT_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Index</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDEX_OPERATION_COUNT = DYNAMIC_CONTENT_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link Glot2.ContentConcern.impl.PageImpl <em>Page</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Glot2.ContentConcern.impl.PageImpl
	 * @see Glot2.ContentConcern.impl.ContentConcernPackageImpl#getPage()
	 * @generated
	 */
	int PAGE = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAGE__NAME = Glot2Package.NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Indexes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAGE__INDEXES = Glot2Package.NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Individuals</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAGE__INDIVIDUALS = Glot2Package.NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Forms</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAGE__FORMS = Glot2Package.NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Links</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAGE__LINKS = Glot2Package.NAMED_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Page</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAGE_FEATURE_COUNT = Glot2Package.NAMED_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The operation id for the '<em>Name Is Defined</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAGE___NAME_IS_DEFINED__STRING = Glot2Package.NAMED_ELEMENT___NAME_IS_DEFINED__STRING;

	/**
	 * The operation id for the '<em>Name Not Empty</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAGE___NAME_NOT_EMPTY__DIAGNOSTICCHAIN_MAP = Glot2Package.NAMED_ELEMENT___NAME_NOT_EMPTY__DIAGNOSTICCHAIN_MAP;

	/**
	 * The number of operations of the '<em>Page</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAGE_OPERATION_COUNT = Glot2Package.NAMED_ELEMENT_OPERATION_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link Glot2.ContentConcern.Content <em>Content</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Content</em>'.
	 * @see Glot2.ContentConcern.Content
	 * @generated
	 */
	EClass getContent();

	/**
	 * Returns the meta object for class '{@link Glot2.ContentConcern.DynamicContent <em>Dynamic Content</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Dynamic Content</em>'.
	 * @see Glot2.ContentConcern.DynamicContent
	 * @generated
	 */
	EClass getDynamicContent();

	/**
	 * Returns the meta object for the reference '{@link Glot2.ContentConcern.DynamicContent#getEntity <em>Entity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Entity</em>'.
	 * @see Glot2.ContentConcern.DynamicContent#getEntity()
	 * @see #getDynamicContent()
	 * @generated
	 */
	EReference getDynamicContent_Entity();

	/**
	 * Returns the meta object for the reference list '{@link Glot2.ContentConcern.DynamicContent#getFeatures <em>Features</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Features</em>'.
	 * @see Glot2.ContentConcern.DynamicContent#getFeatures()
	 * @see #getDynamicContent()
	 * @generated
	 */
	EReference getDynamicContent_Features();

	/**
	 * Returns the meta object for the '{@link Glot2.ContentConcern.DynamicContent#OnlyFeaturesFromRef(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Only Features From Ref</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Only Features From Ref</em>' operation.
	 * @see Glot2.ContentConcern.DynamicContent#OnlyFeaturesFromRef(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getDynamicContent__OnlyFeaturesFromRef__DiagnosticChain_Map();

	/**
	 * Returns the meta object for class '{@link Glot2.ContentConcern.Individual <em>Individual</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Individual</em>'.
	 * @see Glot2.ContentConcern.Individual
	 * @generated
	 */
	EClass getIndividual();

	/**
	 * Returns the meta object for the reference '{@link Glot2.ContentConcern.Individual#getIndex <em>Index</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Index</em>'.
	 * @see Glot2.ContentConcern.Individual#getIndex()
	 * @see #getIndividual()
	 * @generated
	 */
	EReference getIndividual_Index();

	/**
	 * Returns the meta object for the '{@link Glot2.ContentConcern.Individual#SameEntityAsParent(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Same Entity As Parent</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Same Entity As Parent</em>' operation.
	 * @see Glot2.ContentConcern.Individual#SameEntityAsParent(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getIndividual__SameEntityAsParent__DiagnosticChain_Map();

	/**
	 * Returns the meta object for class '{@link Glot2.ContentConcern.Index <em>Index</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Index</em>'.
	 * @see Glot2.ContentConcern.Index
	 * @generated
	 */
	EClass getIndex();

	/**
	 * Returns the meta object for the reference list '{@link Glot2.ContentConcern.Index#getIndividuals <em>Individuals</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Individuals</em>'.
	 * @see Glot2.ContentConcern.Index#getIndividuals()
	 * @see #getIndex()
	 * @generated
	 */
	EReference getIndex_Individuals();

	/**
	 * Returns the meta object for the '{@link Glot2.ContentConcern.Index#NoDuplicates(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>No Duplicates</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>No Duplicates</em>' operation.
	 * @see Glot2.ContentConcern.Index#NoDuplicates(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getIndex__NoDuplicates__DiagnosticChain_Map();

	/**
	 * Returns the meta object for class '{@link Glot2.ContentConcern.Page <em>Page</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Page</em>'.
	 * @see Glot2.ContentConcern.Page
	 * @generated
	 */
	EClass getPage();

	/**
	 * Returns the meta object for the containment reference list '{@link Glot2.ContentConcern.Page#getIndexes <em>Indexes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Indexes</em>'.
	 * @see Glot2.ContentConcern.Page#getIndexes()
	 * @see #getPage()
	 * @generated
	 */
	EReference getPage_Indexes();

	/**
	 * Returns the meta object for the containment reference list '{@link Glot2.ContentConcern.Page#getIndividuals <em>Individuals</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Individuals</em>'.
	 * @see Glot2.ContentConcern.Page#getIndividuals()
	 * @see #getPage()
	 * @generated
	 */
	EReference getPage_Individuals();

	/**
	 * Returns the meta object for the reference list '{@link Glot2.ContentConcern.Page#getForms <em>Forms</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Forms</em>'.
	 * @see Glot2.ContentConcern.Page#getForms()
	 * @see #getPage()
	 * @generated
	 */
	EReference getPage_Forms();

	/**
	 * Returns the meta object for the reference list '{@link Glot2.ContentConcern.Page#getLinks <em>Links</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Links</em>'.
	 * @see Glot2.ContentConcern.Page#getLinks()
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
		 * The meta object literal for the '{@link Glot2.ContentConcern.impl.ContentImpl <em>Content</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Glot2.ContentConcern.impl.ContentImpl
		 * @see Glot2.ContentConcern.impl.ContentConcernPackageImpl#getContent()
		 * @generated
		 */
		EClass CONTENT = eINSTANCE.getContent();

		/**
		 * The meta object literal for the '{@link Glot2.ContentConcern.impl.DynamicContentImpl <em>Dynamic Content</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Glot2.ContentConcern.impl.DynamicContentImpl
		 * @see Glot2.ContentConcern.impl.ContentConcernPackageImpl#getDynamicContent()
		 * @generated
		 */
		EClass DYNAMIC_CONTENT = eINSTANCE.getDynamicContent();

		/**
		 * The meta object literal for the '<em><b>Entity</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DYNAMIC_CONTENT__ENTITY = eINSTANCE.getDynamicContent_Entity();

		/**
		 * The meta object literal for the '<em><b>Features</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DYNAMIC_CONTENT__FEATURES = eINSTANCE.getDynamicContent_Features();

		/**
		 * The meta object literal for the '<em><b>Only Features From Ref</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation DYNAMIC_CONTENT___ONLY_FEATURES_FROM_REF__DIAGNOSTICCHAIN_MAP = eINSTANCE.getDynamicContent__OnlyFeaturesFromRef__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '{@link Glot2.ContentConcern.impl.IndividualImpl <em>Individual</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Glot2.ContentConcern.impl.IndividualImpl
		 * @see Glot2.ContentConcern.impl.ContentConcernPackageImpl#getIndividual()
		 * @generated
		 */
		EClass INDIVIDUAL = eINSTANCE.getIndividual();

		/**
		 * The meta object literal for the '<em><b>Index</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INDIVIDUAL__INDEX = eINSTANCE.getIndividual_Index();

		/**
		 * The meta object literal for the '<em><b>Same Entity As Parent</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation INDIVIDUAL___SAME_ENTITY_AS_PARENT__DIAGNOSTICCHAIN_MAP = eINSTANCE.getIndividual__SameEntityAsParent__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '{@link Glot2.ContentConcern.impl.IndexImpl <em>Index</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Glot2.ContentConcern.impl.IndexImpl
		 * @see Glot2.ContentConcern.impl.ContentConcernPackageImpl#getIndex()
		 * @generated
		 */
		EClass INDEX = eINSTANCE.getIndex();

		/**
		 * The meta object literal for the '<em><b>Individuals</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INDEX__INDIVIDUALS = eINSTANCE.getIndex_Individuals();

		/**
		 * The meta object literal for the '<em><b>No Duplicates</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation INDEX___NO_DUPLICATES__DIAGNOSTICCHAIN_MAP = eINSTANCE.getIndex__NoDuplicates__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '{@link Glot2.ContentConcern.impl.PageImpl <em>Page</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Glot2.ContentConcern.impl.PageImpl
		 * @see Glot2.ContentConcern.impl.ContentConcernPackageImpl#getPage()
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
		 * The meta object literal for the '<em><b>Individuals</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PAGE__INDIVIDUALS = eINSTANCE.getPage_Individuals();

		/**
		 * The meta object literal for the '<em><b>Forms</b></em>' reference list feature.
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
