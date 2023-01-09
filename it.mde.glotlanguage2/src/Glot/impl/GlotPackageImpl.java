/**
 */
package Glot.impl;

import Glot.ContentConcern.ContentConcernPackage;

import Glot.ContentConcern.impl.ContentConcernPackageImpl;

import Glot.DataConcern.DataConcernPackage;

import Glot.DataConcern.impl.DataConcernPackageImpl;

import Glot.FormConcern.FormConcernPackage;

import Glot.FormConcern.impl.FormConcernPackageImpl;

import Glot.GlotFactory;
import Glot.GlotPackage;
import Glot.NamedElement;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class GlotPackageImpl extends EPackageImpl implements GlotPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass namedElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass systemEClass = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see Glot.GlotPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private GlotPackageImpl() {
		super(eNS_URI, GlotFactory.eINSTANCE);
	}
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 *
	 * <p>This method is used to initialize {@link GlotPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static GlotPackage init() {
		if (isInited) return (GlotPackage)EPackage.Registry.INSTANCE.getEPackage(GlotPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredGlotPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		GlotPackageImpl theGlotPackage = registeredGlotPackage instanceof GlotPackageImpl ? (GlotPackageImpl)registeredGlotPackage : new GlotPackageImpl();

		isInited = true;

		// Obtain or create and register interdependencies
		Object registeredPackage = EPackage.Registry.INSTANCE.getEPackage(ContentConcernPackage.eNS_URI);
		ContentConcernPackageImpl theContentConcernPackage = (ContentConcernPackageImpl)(registeredPackage instanceof ContentConcernPackageImpl ? registeredPackage : ContentConcernPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(DataConcernPackage.eNS_URI);
		DataConcernPackageImpl theDataConcernPackage = (DataConcernPackageImpl)(registeredPackage instanceof DataConcernPackageImpl ? registeredPackage : DataConcernPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(FormConcernPackage.eNS_URI);
		FormConcernPackageImpl theFormConcernPackage = (FormConcernPackageImpl)(registeredPackage instanceof FormConcernPackageImpl ? registeredPackage : FormConcernPackage.eINSTANCE);

		// Create package meta-data objects
		theGlotPackage.createPackageContents();
		theContentConcernPackage.createPackageContents();
		theDataConcernPackage.createPackageContents();
		theFormConcernPackage.createPackageContents();

		// Initialize created meta-data
		theGlotPackage.initializePackageContents();
		theContentConcernPackage.initializePackageContents();
		theDataConcernPackage.initializePackageContents();
		theFormConcernPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theGlotPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(GlotPackage.eNS_URI, theGlotPackage);
		return theGlotPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNamedElement() {
		return namedElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNamedElement_Name() {
		return (EAttribute)namedElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSystem() {
		return systemEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSystem_Version() {
		return (EAttribute)systemEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSystem_Subversion() {
		return (EAttribute)systemEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSystem_Entities() {
		return (EReference)systemEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSystem_Forms() {
		return (EReference)systemEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSystem_Pages() {
		return (EReference)systemEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GlotFactory getGlotFactory() {
		return (GlotFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		namedElementEClass = createEClass(NAMED_ELEMENT);
		createEAttribute(namedElementEClass, NAMED_ELEMENT__NAME);

		systemEClass = createEClass(SYSTEM);
		createEAttribute(systemEClass, SYSTEM__VERSION);
		createEAttribute(systemEClass, SYSTEM__SUBVERSION);
		createEReference(systemEClass, SYSTEM__ENTITIES);
		createEReference(systemEClass, SYSTEM__FORMS);
		createEReference(systemEClass, SYSTEM__PAGES);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		ContentConcernPackage theContentConcernPackage = (ContentConcernPackage)EPackage.Registry.INSTANCE.getEPackage(ContentConcernPackage.eNS_URI);
		DataConcernPackage theDataConcernPackage = (DataConcernPackage)EPackage.Registry.INSTANCE.getEPackage(DataConcernPackage.eNS_URI);
		FormConcernPackage theFormConcernPackage = (FormConcernPackage)EPackage.Registry.INSTANCE.getEPackage(FormConcernPackage.eNS_URI);

		// Add subpackages
		getESubpackages().add(theContentConcernPackage);
		getESubpackages().add(theDataConcernPackage);
		getESubpackages().add(theFormConcernPackage);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		systemEClass.getESuperTypes().add(this.getNamedElement());

		// Initialize classes, features, and operations; add parameters
		initEClass(namedElementEClass, NamedElement.class, "NamedElement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getNamedElement_Name(), ecorePackage.getEString(), "name", null, 0, 1, NamedElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(systemEClass, Glot.System.class, "System", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSystem_Version(), ecorePackage.getEInt(), "version", null, 1, 1, Glot.System.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSystem_Subversion(), ecorePackage.getEInt(), "subversion", null, 1, 1, Glot.System.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSystem_Entities(), theDataConcernPackage.getEntity(), null, "entities", null, 0, -1, Glot.System.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSystem_Forms(), theFormConcernPackage.getForm(), null, "forms", null, 0, -1, Glot.System.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSystem_Pages(), theContentConcernPackage.getPage(), null, "pages", null, 0, -1, Glot.System.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

} //GlotPackageImpl
