/**
 */
package Glot.ContentConcern.impl;

import Glot.ContentConcern.Content;
import Glot.ContentConcern.ContentConcernFactory;
import Glot.ContentConcern.ContentConcernPackage;
import Glot.ContentConcern.DContent;
import Glot.ContentConcern.DForm;
import Glot.ContentConcern.Index;
import Glot.ContentConcern.Individual;
import Glot.ContentConcern.Page;

import Glot.ContentConcern.util.ContentConcernValidator;
import Glot.DataConcern.DataConcernPackage;

import Glot.DataConcern.impl.DataConcernPackageImpl;

import Glot.FormConcern.FormConcernPackage;

import Glot.FormConcern.impl.FormConcernPackageImpl;

import Glot.GlotPackage;

import Glot.impl.GlotPackageImpl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EGenericType;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.EValidator;
import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ContentConcernPackageImpl extends EPackageImpl implements ContentConcernPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass contentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dContentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dFormEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass individualEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass indexEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pageEClass = null;

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
	 * @see Glot.ContentConcern.ContentConcernPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private ContentConcernPackageImpl() {
		super(eNS_URI, ContentConcernFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link ContentConcernPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static ContentConcernPackage init() {
		if (isInited) return (ContentConcernPackage)EPackage.Registry.INSTANCE.getEPackage(ContentConcernPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredContentConcernPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		ContentConcernPackageImpl theContentConcernPackage = registeredContentConcernPackage instanceof ContentConcernPackageImpl ? (ContentConcernPackageImpl)registeredContentConcernPackage : new ContentConcernPackageImpl();

		isInited = true;

		// Obtain or create and register interdependencies
		Object registeredPackage = EPackage.Registry.INSTANCE.getEPackage(GlotPackage.eNS_URI);
		GlotPackageImpl theGlotPackage = (GlotPackageImpl)(registeredPackage instanceof GlotPackageImpl ? registeredPackage : GlotPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(DataConcernPackage.eNS_URI);
		DataConcernPackageImpl theDataConcernPackage = (DataConcernPackageImpl)(registeredPackage instanceof DataConcernPackageImpl ? registeredPackage : DataConcernPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(FormConcernPackage.eNS_URI);
		FormConcernPackageImpl theFormConcernPackage = (FormConcernPackageImpl)(registeredPackage instanceof FormConcernPackageImpl ? registeredPackage : FormConcernPackage.eINSTANCE);

		// Create package meta-data objects
		theContentConcernPackage.createPackageContents();
		theGlotPackage.createPackageContents();
		theDataConcernPackage.createPackageContents();
		theFormConcernPackage.createPackageContents();

		// Initialize created meta-data
		theContentConcernPackage.initializePackageContents();
		theGlotPackage.initializePackageContents();
		theDataConcernPackage.initializePackageContents();
		theFormConcernPackage.initializePackageContents();

		// Register package validator
		EValidator.Registry.INSTANCE.put
			(theContentConcernPackage,
			 new EValidator.Descriptor() {
				 public EValidator getEValidator() {
					 return ContentConcernValidator.INSTANCE;
				 }
			 });

		// Mark meta-data to indicate it can't be changed
		theContentConcernPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(ContentConcernPackage.eNS_URI, theContentConcernPackage);
		return theContentConcernPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getContent() {
		return contentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDContent() {
		return dContentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDContent_Entity() {
		return (EReference)dContentEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDContent_Features() {
		return (EReference)dContentEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getDContent__OnlyFeaturesFromRef__DiagnosticChain_Map() {
		return dContentEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDForm() {
		return dFormEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDForm_Form() {
		return (EReference)dFormEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIndividual() {
		return individualEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getIndividual__SameEntityAsParent__DiagnosticChain_Map() {
		return individualEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIndex() {
		return indexEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getIndex_Individuals() {
		return (EReference)indexEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getIndex__NoDuplicates__DiagnosticChain_Map() {
		return indexEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPage() {
		return pageEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPage_Indexes() {
		return (EReference)pageEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPage_Forms() {
		return (EReference)pageEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPage_Links() {
		return (EReference)pageEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ContentConcernFactory getContentConcernFactory() {
		return (ContentConcernFactory)getEFactoryInstance();
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
		contentEClass = createEClass(CONTENT);

		dContentEClass = createEClass(DCONTENT);
		createEReference(dContentEClass, DCONTENT__ENTITY);
		createEReference(dContentEClass, DCONTENT__FEATURES);
		createEOperation(dContentEClass, DCONTENT___ONLY_FEATURES_FROM_REF__DIAGNOSTICCHAIN_MAP);

		dFormEClass = createEClass(DFORM);
		createEReference(dFormEClass, DFORM__FORM);

		indexEClass = createEClass(INDEX);
		createEReference(indexEClass, INDEX__INDIVIDUALS);
		createEOperation(indexEClass, INDEX___NO_DUPLICATES__DIAGNOSTICCHAIN_MAP);

		individualEClass = createEClass(INDIVIDUAL);
		createEOperation(individualEClass, INDIVIDUAL___SAME_ENTITY_AS_PARENT__DIAGNOSTICCHAIN_MAP);

		pageEClass = createEClass(PAGE);
		createEReference(pageEClass, PAGE__INDEXES);
		createEReference(pageEClass, PAGE__FORMS);
		createEReference(pageEClass, PAGE__LINKS);
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
		GlotPackage theGlotPackage = (GlotPackage)EPackage.Registry.INSTANCE.getEPackage(GlotPackage.eNS_URI);
		DataConcernPackage theDataConcernPackage = (DataConcernPackage)EPackage.Registry.INSTANCE.getEPackage(DataConcernPackage.eNS_URI);
		FormConcernPackage theFormConcernPackage = (FormConcernPackage)EPackage.Registry.INSTANCE.getEPackage(FormConcernPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		contentEClass.getESuperTypes().add(theGlotPackage.getNamedElement());
		dContentEClass.getESuperTypes().add(this.getContent());
		dFormEClass.getESuperTypes().add(this.getContent());
		indexEClass.getESuperTypes().add(this.getDContent());
		individualEClass.getESuperTypes().add(this.getDContent());
		pageEClass.getESuperTypes().add(theGlotPackage.getNamedElement());

		// Initialize classes, features, and operations; add parameters
		initEClass(contentEClass, Content.class, "Content", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(dContentEClass, DContent.class, "DContent", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDContent_Entity(), theDataConcernPackage.getEntity(), null, "entity", null, 1, 1, DContent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDContent_Features(), theDataConcernPackage.getFeature(), null, "features", null, 1, -1, DContent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		EOperation op = initEOperation(getDContent__OnlyFeaturesFromRef__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "OnlyFeaturesFromRef", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		EGenericType g1 = createEGenericType(ecorePackage.getEMap());
		EGenericType g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(dFormEClass, DForm.class, "DForm", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDForm_Form(), theFormConcernPackage.getForm(), null, "form", null, 1, 1, DForm.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(indexEClass, Index.class, "Index", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getIndex_Individuals(), this.getIndividual(), null, "individuals", null, 0, -1, Index.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		op = initEOperation(getIndex__NoDuplicates__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "NoDuplicates", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(individualEClass, Individual.class, "Individual", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		op = initEOperation(getIndividual__SameEntityAsParent__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "SameEntityAsParent", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(pageEClass, Page.class, "Page", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPage_Indexes(), this.getIndex(), null, "indexes", null, 0, -1, Page.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPage_Forms(), this.getDForm(), null, "forms", null, 0, -1, Page.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPage_Links(), this.getPage(), null, "links", null, 0, -1, Page.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create annotations
		// http://www.eclipse.org/emf/2002/Ecore
		createEcoreAnnotations();
		// http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot
		createPivotAnnotations();
		// http://www.eclipse.org/OCL/Collection
		createCollectionAnnotations();
	}

	/**
	 * Initializes the annotations for <b>http://www.eclipse.org/emf/2002/Ecore</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createEcoreAnnotations() {
		String source = "http://www.eclipse.org/emf/2002/Ecore";
		addAnnotation
		  (this,
		   source,
		   new String[] {
		   });
		addAnnotation
		  (dContentEClass,
		   source,
		   new String[] {
			   "constraints", "OnlyFeaturesFromRef"
		   });
		addAnnotation
		  (indexEClass,
		   source,
		   new String[] {
			   "constraints", "NoDuplicates"
		   });
		addAnnotation
		  (individualEClass,
		   source,
		   new String[] {
			   "constraints", "SameEntityAsParent"
		   });
	}

	/**
	 * Initializes the annotations for <b>http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createPivotAnnotations() {
		String source = "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot";
		addAnnotation
		  (getDContent__OnlyFeaturesFromRef__DiagnosticChain_Map(),
		   source,
		   new String[] {
			   "body", "entity.features->includesAll(features)"
		   });
		addAnnotation
		  (getIndex__NoDuplicates__DiagnosticChain_Map(),
		   source,
		   new String[] {
			   "body", "Index.allInstances()->select(name=self.name)->size()=1"
		   });
		addAnnotation
		  (getIndividual__SameEntityAsParent__DiagnosticChain_Map(),
		   source,
		   new String[] {
			   "body", "Index.allInstances()->select(a | a.individuals->includes(self))->asSequence()->first().entity = self.entity"
		   });
	}

	/**
	 * Initializes the annotations for <b>http://www.eclipse.org/OCL/Collection</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createCollectionAnnotations() {
		String source = "http://www.eclipse.org/OCL/Collection";
		addAnnotation
		  (getIndex_Individuals(),
		   source,
		   new String[] {
			   "nullFree", "false"
		   });
	}

} //ContentConcernPackageImpl
