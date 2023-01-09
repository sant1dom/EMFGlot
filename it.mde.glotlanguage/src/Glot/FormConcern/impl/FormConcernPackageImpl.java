/**
 */
package Glot.FormConcern.impl;

import Glot.ContentConcern.ContentConcernPackage;

import Glot.ContentConcern.impl.ContentConcernPackageImpl;

import Glot.DataConcern.DataConcernPackage;

import Glot.DataConcern.impl.DataConcernPackageImpl;

import Glot.FormConcern.Element;
import Glot.FormConcern.Form;
import Glot.FormConcern.FormConcernFactory;
import Glot.FormConcern.FormConcernPackage;
import Glot.FormConcern._MethodType;

import Glot.GlotPackage;

import Glot.impl.GlotPackageImpl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class FormConcernPackageImpl extends EPackageImpl implements FormConcernPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass elementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass formEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum _MethodTypeEEnum = null;

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
	 * @see Glot.FormConcern.FormConcernPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private FormConcernPackageImpl() {
		super(eNS_URI, FormConcernFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link FormConcernPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static FormConcernPackage init() {
		if (isInited) return (FormConcernPackage)EPackage.Registry.INSTANCE.getEPackage(FormConcernPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredFormConcernPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		FormConcernPackageImpl theFormConcernPackage = registeredFormConcernPackage instanceof FormConcernPackageImpl ? (FormConcernPackageImpl)registeredFormConcernPackage : new FormConcernPackageImpl();

		isInited = true;

		// Obtain or create and register interdependencies
		Object registeredPackage = EPackage.Registry.INSTANCE.getEPackage(GlotPackage.eNS_URI);
		GlotPackageImpl theGlotPackage = (GlotPackageImpl)(registeredPackage instanceof GlotPackageImpl ? registeredPackage : GlotPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(ContentConcernPackage.eNS_URI);
		ContentConcernPackageImpl theContentConcernPackage = (ContentConcernPackageImpl)(registeredPackage instanceof ContentConcernPackageImpl ? registeredPackage : ContentConcernPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(DataConcernPackage.eNS_URI);
		DataConcernPackageImpl theDataConcernPackage = (DataConcernPackageImpl)(registeredPackage instanceof DataConcernPackageImpl ? registeredPackage : DataConcernPackage.eINSTANCE);

		// Create package meta-data objects
		theFormConcernPackage.createPackageContents();
		theGlotPackage.createPackageContents();
		theContentConcernPackage.createPackageContents();
		theDataConcernPackage.createPackageContents();

		// Initialize created meta-data
		theFormConcernPackage.initializePackageContents();
		theGlotPackage.initializePackageContents();
		theContentConcernPackage.initializePackageContents();
		theDataConcernPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theFormConcernPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(FormConcernPackage.eNS_URI, theFormConcernPackage);
		return theFormConcernPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getElement() {
		return elementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getElement_Label() {
		return (EAttribute)elementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getElement_Tooltip() {
		return (EAttribute)elementEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getElement_Attribute() {
		return (EReference)elementEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getForm() {
		return formEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getForm_Method() {
		return (EAttribute)formEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getForm_Elements() {
		return (EReference)formEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getForm_Entity() {
		return (EReference)formEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getForm_ElementsNumber() {
		return (EAttribute)formEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum get_MethodType() {
		return _MethodTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FormConcernFactory getFormConcernFactory() {
		return (FormConcernFactory)getEFactoryInstance();
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
		elementEClass = createEClass(ELEMENT);
		createEAttribute(elementEClass, ELEMENT__LABEL);
		createEAttribute(elementEClass, ELEMENT__TOOLTIP);
		createEReference(elementEClass, ELEMENT__ATTRIBUTE);

		formEClass = createEClass(FORM);
		createEAttribute(formEClass, FORM__METHOD);
		createEReference(formEClass, FORM__ELEMENTS);
		createEReference(formEClass, FORM__ENTITY);
		createEAttribute(formEClass, FORM__ELEMENTS_NUMBER);

		// Create enums
		_MethodTypeEEnum = createEEnum(_METHOD_TYPE);
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

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		elementEClass.getESuperTypes().add(theGlotPackage.getNamedElement());
		formEClass.getESuperTypes().add(theGlotPackage.getNamedElement());

		// Initialize classes, features, and operations; add parameters
		initEClass(elementEClass, Element.class, "Element", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getElement_Label(), ecorePackage.getEString(), "label", null, 0, 1, Element.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getElement_Tooltip(), ecorePackage.getEString(), "tooltip", null, 0, 1, Element.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getElement_Attribute(), theDataConcernPackage.getAttribute(), null, "attribute", null, 0, 1, Element.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(formEClass, Form.class, "Form", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getForm_Method(), this.get_MethodType(), "method", null, 0, 1, Form.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getForm_Elements(), this.getElement(), null, "elements", null, 0, -1, Form.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getForm_Entity(), theDataConcernPackage.getEntity(), null, "entity", null, 0, 1, Form.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getForm_ElementsNumber(), ecorePackage.getEInt(), "elementsNumber", null, 1, 1, Form.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(_MethodTypeEEnum, _MethodType.class, "_MethodType");
		addEEnumLiteral(_MethodTypeEEnum, _MethodType.POST);
		addEEnumLiteral(_MethodTypeEEnum, _MethodType.GET);
		addEEnumLiteral(_MethodTypeEEnum, _MethodType.PUT);
		addEEnumLiteral(_MethodTypeEEnum, _MethodType.DELETE);
		addEEnumLiteral(_MethodTypeEEnum, _MethodType.PATCH);

		// Create annotations
		// http://www.eclipse.org/emf/2002/Ecore
		createEcoreAnnotations();
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
	}

} //FormConcernPackageImpl
