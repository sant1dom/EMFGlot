/**
 */
package Glot.DataConcern.impl;

import Glot.ContentConcern.ContentConcernPackage;

import Glot.ContentConcern.impl.ContentConcernPackageImpl;

import Glot.DataConcern.Attribute;
import Glot.DataConcern.DataConcernFactory;
import Glot.DataConcern.DataConcernPackage;
import Glot.DataConcern.Entity;
import Glot.DataConcern.Feature;
import Glot.DataConcern.Reference;
import Glot.DataConcern._DataType;

import Glot.DataConcern.util.DataConcernValidator;
import Glot.FormConcern.FormConcernPackage;

import Glot.FormConcern.impl.FormConcernPackageImpl;

import Glot.GlotPackage;

import Glot.impl.GlotPackageImpl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
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
public class DataConcernPackageImpl extends EPackageImpl implements DataConcernPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass attributeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass entityEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass featureEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass referenceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum _DataTypeEEnum = null;

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
	 * @see Glot.DataConcern.DataConcernPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private DataConcernPackageImpl() {
		super(eNS_URI, DataConcernFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link DataConcernPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static DataConcernPackage init() {
		if (isInited) return (DataConcernPackage)EPackage.Registry.INSTANCE.getEPackage(DataConcernPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredDataConcernPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		DataConcernPackageImpl theDataConcernPackage = registeredDataConcernPackage instanceof DataConcernPackageImpl ? (DataConcernPackageImpl)registeredDataConcernPackage : new DataConcernPackageImpl();

		isInited = true;

		// Obtain or create and register interdependencies
		Object registeredPackage = EPackage.Registry.INSTANCE.getEPackage(GlotPackage.eNS_URI);
		GlotPackageImpl theGlotPackage = (GlotPackageImpl)(registeredPackage instanceof GlotPackageImpl ? registeredPackage : GlotPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(ContentConcernPackage.eNS_URI);
		ContentConcernPackageImpl theContentConcernPackage = (ContentConcernPackageImpl)(registeredPackage instanceof ContentConcernPackageImpl ? registeredPackage : ContentConcernPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(FormConcernPackage.eNS_URI);
		FormConcernPackageImpl theFormConcernPackage = (FormConcernPackageImpl)(registeredPackage instanceof FormConcernPackageImpl ? registeredPackage : FormConcernPackage.eINSTANCE);

		// Create package meta-data objects
		theDataConcernPackage.createPackageContents();
		theGlotPackage.createPackageContents();
		theContentConcernPackage.createPackageContents();
		theFormConcernPackage.createPackageContents();

		// Initialize created meta-data
		theDataConcernPackage.initializePackageContents();
		theGlotPackage.initializePackageContents();
		theContentConcernPackage.initializePackageContents();
		theFormConcernPackage.initializePackageContents();

		// Register package validator
		EValidator.Registry.INSTANCE.put
			(theDataConcernPackage,
			 new EValidator.Descriptor() {
				 public EValidator getEValidator() {
					 return DataConcernValidator.INSTANCE;
				 }
			 });

		// Mark meta-data to indicate it can't be changed
		theDataConcernPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(DataConcernPackage.eNS_URI, theDataConcernPackage);
		return theDataConcernPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAttribute() {
		return attributeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAttribute_IsPrimaryKey() {
		return (EAttribute)attributeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAttribute_Type() {
		return (EAttribute)attributeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEntity() {
		return entityEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEntity_Features() {
		return (EReference)entityEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getEntity__NoDuplicates__DiagnosticChain_Map() {
		return entityEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getEntity__AtLeastOnePK__DiagnosticChain_Map() {
		return entityEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFeature() {
		return featureEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getReference() {
		return referenceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getReference_ForeignKey() {
		return (EReference)referenceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum get_DataType() {
		return _DataTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataConcernFactory getDataConcernFactory() {
		return (DataConcernFactory)getEFactoryInstance();
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
		attributeEClass = createEClass(ATTRIBUTE);
		createEAttribute(attributeEClass, ATTRIBUTE__IS_PRIMARY_KEY);
		createEAttribute(attributeEClass, ATTRIBUTE__TYPE);

		entityEClass = createEClass(ENTITY);
		createEReference(entityEClass, ENTITY__FEATURES);
		createEOperation(entityEClass, ENTITY___NO_DUPLICATES__DIAGNOSTICCHAIN_MAP);
		createEOperation(entityEClass, ENTITY___AT_LEAST_ONE_PK__DIAGNOSTICCHAIN_MAP);

		featureEClass = createEClass(FEATURE);

		referenceEClass = createEClass(REFERENCE);
		createEReference(referenceEClass, REFERENCE__FOREIGN_KEY);

		// Create enums
		_DataTypeEEnum = createEEnum(_DATA_TYPE);
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

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		attributeEClass.getESuperTypes().add(this.getFeature());
		entityEClass.getESuperTypes().add(theGlotPackage.getNamedElement());
		featureEClass.getESuperTypes().add(theGlotPackage.getNamedElement());
		referenceEClass.getESuperTypes().add(this.getFeature());

		// Initialize classes, features, and operations; add parameters
		initEClass(attributeEClass, Attribute.class, "Attribute", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAttribute_IsPrimaryKey(), ecorePackage.getEBoolean(), "isPrimaryKey", null, 1, 1, Attribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAttribute_Type(), this.get_DataType(), "type", null, 0, 1, Attribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(entityEClass, Entity.class, "Entity", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getEntity_Features(), this.getFeature(), null, "features", null, 1, -1, Entity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		EOperation op = initEOperation(getEntity__NoDuplicates__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "NoDuplicates", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		EGenericType g1 = createEGenericType(ecorePackage.getEMap());
		EGenericType g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getEntity__AtLeastOnePK__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "AtLeastOnePK", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(featureEClass, Feature.class, "Feature", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(referenceEClass, Reference.class, "Reference", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getReference_ForeignKey(), this.getEntity(), null, "foreignKey", null, 0, 1, Reference.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(_DataTypeEEnum, _DataType.class, "_DataType");
		addEEnumLiteral(_DataTypeEEnum, _DataType.STRING);
		addEEnumLiteral(_DataTypeEEnum, _DataType.INT);
		addEEnumLiteral(_DataTypeEEnum, _DataType.TEXT);
		addEEnumLiteral(_DataTypeEEnum, _DataType.BOOLEAN);
		addEEnumLiteral(_DataTypeEEnum, _DataType.DATE);
		addEEnumLiteral(_DataTypeEEnum, _DataType.FILE);
		addEEnumLiteral(_DataTypeEEnum, _DataType.CURRENCY);
		addEEnumLiteral(_DataTypeEEnum, _DataType.PERCENT);
		addEEnumLiteral(_DataTypeEEnum, _DataType.IMAGE);
		addEEnumLiteral(_DataTypeEEnum, _DataType.IMAGES);
		addEEnumLiteral(_DataTypeEEnum, _DataType.DOUBLE);

		// Create annotations
		// http://www.eclipse.org/emf/2002/Ecore
		createEcoreAnnotations();
		// http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot
		createPivotAnnotations();
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
		  (entityEClass,
		   source,
		   new String[] {
			   "constraints", "AtLeastOnePK"
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
		  (getEntity__NoDuplicates__DiagnosticChain_Map(),
		   source,
		   new String[] {
			   "body", "Entity.allInstances()->select(name=self.name)->size()=1"
		   });
		addAnnotation
		  (getEntity__AtLeastOnePK__DiagnosticChain_Map(),
		   source,
		   new String[] {
			   "body", "features->select(a | a.oclIsKindOf(Attribute) and a.oclAsType(Attribute).isPrimaryKey=true)->size() > 0"
		   });
	}

} //DataConcernPackageImpl
