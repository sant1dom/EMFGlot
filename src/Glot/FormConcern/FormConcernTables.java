/*******************************************************************************
 *************************************************************************
 * This code is 100% auto-generated
 * from:
 * using:
 *   /it.mde.glotlanguage/WebApplication/model.genmodel
 *   org.eclipse.ocl.examples.codegen.oclinecore.OCLinEcoreTables
 *
 * Do not edit it.
 *******************************************************************************/
package Glot.FormConcern;

import Glot.ContentConcern.ContentConcernPackage;
import Glot.DataConcern.DataConcernPackage;
// import Glot.FormConcern.FormConcernPackage;
// import Glot.FormConcern.FormConcernTables;
import Glot.GlotPackage;
import Glot.GlotTables;
import org.eclipse.ocl.pivot.ids.ClassId;
import org.eclipse.ocl.pivot.ids.CollectionTypeId;
import org.eclipse.ocl.pivot.ids.EnumerationId;
import org.eclipse.ocl.pivot.ids.IdManager;
import org.eclipse.ocl.pivot.ids.NsURIPackageId;
import org.eclipse.ocl.pivot.ids.TypeId;
import org.eclipse.ocl.pivot.internal.library.ecore.EcoreExecutorEnumeration;
import org.eclipse.ocl.pivot.internal.library.ecore.EcoreExecutorEnumerationLiteral;
import org.eclipse.ocl.pivot.internal.library.ecore.EcoreExecutorPackage;
import org.eclipse.ocl.pivot.internal.library.ecore.EcoreExecutorProperty;
import org.eclipse.ocl.pivot.internal.library.ecore.EcoreExecutorType;
import org.eclipse.ocl.pivot.internal.library.ecore.EcoreLibraryOppositeProperty;
import org.eclipse.ocl.pivot.internal.library.executor.ExecutorFragment;
import org.eclipse.ocl.pivot.internal.library.executor.ExecutorOperation;
import org.eclipse.ocl.pivot.internal.library.executor.ExecutorProperty;
import org.eclipse.ocl.pivot.internal.library.executor.ExecutorPropertyWithImplementation;
import org.eclipse.ocl.pivot.internal.library.executor.ExecutorStandardLibrary;
import org.eclipse.ocl.pivot.oclstdlib.OCLstdlibTables;
import org.eclipse.ocl.pivot.utilities.AbstractTables;

/**
 * FormConcernTables provides the dispatch tables for the FormConcern for use by the OCL dispatcher.
 *
 * In order to ensure correct static initialization, a top level class element must be accessed
 * before any nested class element. Therefore an access to PACKAGE.getClass() is recommended.
 */
public class FormConcernTables extends AbstractTables
{
	static {
		Init.initStart();
	}

	/**
	 *	The package descriptor for the package.
	 */
	public static final EcoreExecutorPackage PACKAGE = new EcoreExecutorPackage(FormConcernPackage.eINSTANCE);

	/**
	 *	The library of all packages and types.
	 */
	public static final ExecutorStandardLibrary LIBRARY = OCLstdlibTables.LIBRARY;

	/**
	 *	Constants used by auto-generated code.
	 */
	public static final /*@NonInvalid*/ NsURIPackageId PACKid_https_c_s_s_it_mde_glotlanguage = IdManager.getNsURIPackageId("https://it.mde.glotlanguage", null, GlotPackage.eINSTANCE);
	public static final /*@NonInvalid*/ NsURIPackageId PACKid_https_c_s_s_it_mde_glotlanguage_s_contenConcern = IdManager.getNsURIPackageId("https://it.mde.glotlanguage/contenConcern", null, ContentConcernPackage.eINSTANCE);
	public static final /*@NonInvalid*/ NsURIPackageId PACKid_https_c_s_s_it_mde_glotlanguage_s_dataConcern = IdManager.getNsURIPackageId("https://it.mde.glotlanguage/dataConcern", null, DataConcernPackage.eINSTANCE);
	public static final /*@NonInvalid*/ NsURIPackageId PACKid_https_c_s_s_it_mde_glotlanguage_s_formConcern = IdManager.getNsURIPackageId("https://it.mde.glotlanguage/formConcern", null, FormConcernPackage.eINSTANCE);
	public static final /*@NonInvalid*/ ClassId CLSSid_Attribute = FormConcernTables.PACKid_https_c_s_s_it_mde_glotlanguage_s_dataConcern.getClassId("Attribute", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_DForm = FormConcernTables.PACKid_https_c_s_s_it_mde_glotlanguage_s_contenConcern.getClassId("DForm", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_Element = FormConcernTables.PACKid_https_c_s_s_it_mde_glotlanguage_s_formConcern.getClassId("Element", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_Entity = FormConcernTables.PACKid_https_c_s_s_it_mde_glotlanguage_s_dataConcern.getClassId("Entity", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_Form = FormConcernTables.PACKid_https_c_s_s_it_mde_glotlanguage_s_formConcern.getClassId("Form", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_System = FormConcernTables.PACKid_https_c_s_s_it_mde_glotlanguage.getClassId("System", 0);
	public static final /*@NonInvalid*/ EnumerationId ENUMid__MethodType = FormConcernTables.PACKid_https_c_s_s_it_mde_glotlanguage_s_formConcern.getEnumerationId("_MethodType");
	public static final /*@NonInvalid*/ CollectionTypeId BAG_CLSSid_DForm = TypeId.BAG.getSpecializedId(FormConcernTables.CLSSid_DForm);
	public static final /*@NonInvalid*/ CollectionTypeId ORD_CLSSid_Element = TypeId.ORDERED_SET.getSpecializedId(FormConcernTables.CLSSid_Element);

	/**
	 *	The type parameters for templated types and operations.
	 */
	public static class TypeParameters {
		static {
			Init.initStart();
			FormConcernTables.init();
		}

		static {
			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of FormConcernTables::TypeParameters and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 *	The type descriptors for each type.
	 */
	public static class Types {
		static {
			Init.initStart();
			TypeParameters.init();
		}

		public static final EcoreExecutorType _Element = new EcoreExecutorType(FormConcernPackage.Literals.ELEMENT, PACKAGE, 0);
		public static final EcoreExecutorType _Form = new EcoreExecutorType(FormConcernPackage.Literals.FORM, PACKAGE, 0);
		public static final EcoreExecutorEnumeration __MethodType = new EcoreExecutorEnumeration(FormConcernPackage.Literals._METHOD_TYPE, PACKAGE, 0);

		private static final EcoreExecutorType /*@NonNull*/ [] types = {
			_Element,
			_Form,
			__MethodType
		};

		/*
		 *	Install the type descriptors in the package descriptor.
		 */
		static {
			PACKAGE.init(LIBRARY, types);
			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of FormConcernTables::Types and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 *	The fragment descriptors for the local elements of each type and its supertypes.
	 */
	public static class Fragments {
		static {
			Init.initStart();
			Types.init();
		}

		private static final ExecutorFragment _Element__Element = new ExecutorFragment(Types._Element, FormConcernTables.Types._Element);
		private static final ExecutorFragment _Element__NamedElement = new ExecutorFragment(Types._Element, GlotTables.Types._NamedElement);
		private static final ExecutorFragment _Element__OclAny = new ExecutorFragment(Types._Element, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _Element__OclElement = new ExecutorFragment(Types._Element, OCLstdlibTables.Types._OclElement);

		private static final ExecutorFragment _Form__Form = new ExecutorFragment(Types._Form, FormConcernTables.Types._Form);
		private static final ExecutorFragment _Form__NamedElement = new ExecutorFragment(Types._Form, GlotTables.Types._NamedElement);
		private static final ExecutorFragment _Form__OclAny = new ExecutorFragment(Types._Form, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _Form__OclElement = new ExecutorFragment(Types._Form, OCLstdlibTables.Types._OclElement);

		private static final ExecutorFragment __MethodType__OclAny = new ExecutorFragment(Types.__MethodType, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment __MethodType__OclElement = new ExecutorFragment(Types.__MethodType, OCLstdlibTables.Types._OclElement);
		private static final ExecutorFragment __MethodType__OclEnumeration = new ExecutorFragment(Types.__MethodType, OCLstdlibTables.Types._OclEnumeration);
		private static final ExecutorFragment __MethodType__OclType = new ExecutorFragment(Types.__MethodType, OCLstdlibTables.Types._OclType);
		private static final ExecutorFragment __MethodType___MethodType = new ExecutorFragment(Types.__MethodType, FormConcernTables.Types.__MethodType);

		static {
			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of FormConcernTables::Fragments and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 *	The parameter lists shared by operations.
	 *
	 * @noextend This class is not intended to be subclassed by clients.
	 * @noinstantiate This class is not intended to be instantiated by clients.
	 * @noreference This class is not intended to be referenced by clients.
	 */
	public static class Parameters {
		static {
			Init.initStart();
			Fragments.init();
		}


		static {
			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of FormConcernTables::Parameters and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 *	The operation descriptors for each operation of each type.
	 *
	 * @noextend This class is not intended to be subclassed by clients.
	 * @noinstantiate This class is not intended to be instantiated by clients.
	 * @noreference This class is not intended to be referenced by clients.
	 */
	public static class Operations {
		static {
			Init.initStart();
			Parameters.init();
		}

		static {
			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of FormConcernTables::Operations and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 *	The property descriptors for each property of each type.
	 *
	 * @noextend This class is not intended to be subclassed by clients.
	 * @noinstantiate This class is not intended to be instantiated by clients.
	 * @noreference This class is not intended to be referenced by clients.
	 */
	public static class Properties {
		static {
			Init.initStart();
			Operations.init();
		}

		public static final ExecutorProperty _Element__attribute = new EcoreExecutorProperty(FormConcernPackage.Literals.ELEMENT__ATTRIBUTE, Types._Element, 0);
		public static final ExecutorProperty _Element__label = new EcoreExecutorProperty(FormConcernPackage.Literals.ELEMENT__LABEL, Types._Element, 1);
		public static final ExecutorProperty _Element__tooltip = new EcoreExecutorProperty(FormConcernPackage.Literals.ELEMENT__TOOLTIP, Types._Element, 2);
		public static final ExecutorProperty _Element__Form__elements = new ExecutorPropertyWithImplementation("Form", Types._Element, 3, new EcoreLibraryOppositeProperty(FormConcernPackage.Literals.FORM__ELEMENTS));

		public static final ExecutorProperty _Form__elements = new EcoreExecutorProperty(FormConcernPackage.Literals.FORM__ELEMENTS, Types._Form, 0);
		public static final ExecutorProperty _Form__elementsNumber = new EcoreExecutorProperty(FormConcernPackage.Literals.FORM__ELEMENTS_NUMBER, Types._Form, 1);
		public static final ExecutorProperty _Form__entity = new EcoreExecutorProperty(FormConcernPackage.Literals.FORM__ENTITY, Types._Form, 2);
		public static final ExecutorProperty _Form__method = new EcoreExecutorProperty(FormConcernPackage.Literals.FORM__METHOD, Types._Form, 3);
		public static final ExecutorProperty _Form__DForm__form = new ExecutorPropertyWithImplementation("DForm", Types._Form, 4, new EcoreLibraryOppositeProperty(ContentConcernPackage.Literals.DFORM__FORM));
		public static final ExecutorProperty _Form__System__forms = new ExecutorPropertyWithImplementation("System", Types._Form, 5, new EcoreLibraryOppositeProperty(GlotPackage.Literals.SYSTEM__FORMS));
		static {
			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of FormConcernTables::Properties and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 *	The fragments for all base types in depth order: OclAny first, OclSelf last.
	 */
	public static class TypeFragments {
		static {
			Init.initStart();
			Properties.init();
		}

		private static final ExecutorFragment /*@NonNull*/ [] _Element =
			{
				Fragments._Element__OclAny /* 0 */,
				Fragments._Element__OclElement /* 1 */,
				Fragments._Element__NamedElement /* 2 */,
				Fragments._Element__Element /* 3 */
			};
		private static final int /*@NonNull*/ [] __Element = { 1,1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _Form =
			{
				Fragments._Form__OclAny /* 0 */,
				Fragments._Form__OclElement /* 1 */,
				Fragments._Form__NamedElement /* 2 */,
				Fragments._Form__Form /* 3 */
			};
		private static final int /*@NonNull*/ [] __Form = { 1,1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] __MethodType =
			{
				Fragments.__MethodType__OclAny /* 0 */,
				Fragments.__MethodType__OclElement /* 1 */,
				Fragments.__MethodType__OclType /* 2 */,
				Fragments.__MethodType__OclEnumeration /* 3 */,
				Fragments.__MethodType___MethodType /* 4 */
			};
		private static final int /*@NonNull*/ [] ___MethodType = { 1,1,1,1,1 };

		/**
		 *	Install the fragment descriptors in the class descriptors.
		 */
		static {
			Types._Element.initFragments(_Element, __Element);
			Types._Form.initFragments(_Form, __Form);
			Types.__MethodType.initFragments(__MethodType, ___MethodType);

			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of FormConcernTables::TypeFragments and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 *	The lists of local operations or local operation overrides for each fragment of each type.
	 */
	public static class FragmentOperations {
		static {
			Init.initStart();
			TypeFragments.init();
		}

		private static final ExecutorOperation /*@NonNull*/ [] _Element__Element = {};
		private static final ExecutorOperation /*@NonNull*/ [] _Element__NamedElement = {};
		private static final ExecutorOperation /*@NonNull*/ [] _Element__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _Element__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _Form__Form = {};
		private static final ExecutorOperation /*@NonNull*/ [] _Form__NamedElement = {};
		private static final ExecutorOperation /*@NonNull*/ [] _Form__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _Form__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final ExecutorOperation /*@NonNull*/ [] __MethodType___MethodType = {};
		private static final ExecutorOperation /*@NonNull*/ [] __MethodType__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] __MethodType__OclElement = {
			OCLstdlibTables.Operations._OclEnumeration__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] __MethodType__OclEnumeration = {
			OCLstdlibTables.Operations._OclEnumeration__allInstances /* allInstances() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] __MethodType__OclType = {
			OCLstdlibTables.Operations._OclType__conformsTo /* conformsTo(OclType[?]) */
		};

		/*
		 *	Install the operation descriptors in the fragment descriptors.
		 */
		static {
			Fragments._Element__Element.initOperations(_Element__Element);
			Fragments._Element__NamedElement.initOperations(_Element__NamedElement);
			Fragments._Element__OclAny.initOperations(_Element__OclAny);
			Fragments._Element__OclElement.initOperations(_Element__OclElement);

			Fragments._Form__Form.initOperations(_Form__Form);
			Fragments._Form__NamedElement.initOperations(_Form__NamedElement);
			Fragments._Form__OclAny.initOperations(_Form__OclAny);
			Fragments._Form__OclElement.initOperations(_Form__OclElement);

			Fragments.__MethodType__OclAny.initOperations(__MethodType__OclAny);
			Fragments.__MethodType__OclElement.initOperations(__MethodType__OclElement);
			Fragments.__MethodType__OclEnumeration.initOperations(__MethodType__OclEnumeration);
			Fragments.__MethodType__OclType.initOperations(__MethodType__OclType);
			Fragments.__MethodType___MethodType.initOperations(__MethodType___MethodType);

			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of FormConcernTables::FragmentOperations and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 *	The lists of local properties for the local fragment of each type.
	 */
	public static class FragmentProperties {
		static {
			Init.initStart();
			FragmentOperations.init();
		}

		private static final ExecutorProperty /*@NonNull*/ [] _Element = {
			FormConcernTables.Properties._Element__attribute,
			FormConcernTables.Properties._Element__label,
			GlotTables.Properties._NamedElement__name,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents,
			FormConcernTables.Properties._Element__tooltip
		};

		private static final ExecutorProperty /*@NonNull*/ [] _Form = {
			FormConcernTables.Properties._Form__elements,
			FormConcernTables.Properties._Form__elementsNumber,
			FormConcernTables.Properties._Form__entity,
			FormConcernTables.Properties._Form__method,
			GlotTables.Properties._NamedElement__name,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents
		};

		private static final ExecutorProperty /*@NonNull*/ [] __MethodType = {
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents
		};

		/**
		 *	Install the property descriptors in the fragment descriptors.
		 */
		static {
			Fragments._Element__Element.initProperties(_Element);
			Fragments._Form__Form.initProperties(_Form);
			Fragments.__MethodType___MethodType.initProperties(__MethodType);

			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of FormConcernTables::FragmentProperties and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 *	The lists of enumeration literals for each enumeration.
	 */
	public static class EnumerationLiterals {
		static {
			Init.initStart();
			FragmentProperties.init();
		}

		public static final EcoreExecutorEnumerationLiteral __MethodType__POST = new EcoreExecutorEnumerationLiteral(FormConcernPackage.Literals._METHOD_TYPE.getEEnumLiteral("POST"), Types.__MethodType, 0);
		public static final EcoreExecutorEnumerationLiteral __MethodType__GET = new EcoreExecutorEnumerationLiteral(FormConcernPackage.Literals._METHOD_TYPE.getEEnumLiteral("GET"), Types.__MethodType, 1);
		public static final EcoreExecutorEnumerationLiteral __MethodType__DELETE = new EcoreExecutorEnumerationLiteral(FormConcernPackage.Literals._METHOD_TYPE.getEEnumLiteral("DELETE"), Types.__MethodType, 2);
		private static final EcoreExecutorEnumerationLiteral /*@NonNull*/ [] __MethodType = {
			__MethodType__POST,
			__MethodType__GET,
			__MethodType__DELETE
		};

		/**
		 *	Install the enumeration literals in the enumerations.
		 */
		static {
			Types.__MethodType.initLiterals(__MethodType);

			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of FormConcernTables::EnumerationLiterals and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 * The multiple packages above avoid problems with the Java 65536 byte limit but introduce a difficulty in ensuring that
	 * static construction occurs in the disciplined order of the packages when construction may start in any of the packages.
	 * The problem is resolved by ensuring that the static construction of each package first initializes its immediate predecessor.
	 * On completion of predecessor initialization, the residual packages are initialized by starting an initialization in the last package.
	 * This class maintains a count so that the various predecessors can distinguish whether they are the starting point and so
	 * ensure that residual construction occurs just once after all predecessors.
	 */
	private static class Init {
		/**
		 * Counter of nested static constructions. On return to zero residual construction starts. -ve once residual construction started.
		 */
		private static int initCount = 0;

		/**
		 * Invoked at the start of a static construction to defer residual construction until primary constructions complete.
		 */
		private static void initStart() {
			if (initCount >= 0) {
				initCount++;
			}
		}

		/**
		 * Invoked at the end of a static construction to activate residual construction once primary constructions complete.
		 */
		private static void initEnd() {
			if (initCount > 0) {
				if (--initCount == 0) {
					initCount = -1;
					EnumerationLiterals.init();
				}
			}
		}
	}

	static {
		Init.initEnd();
	}

	/*
	 * Force initialization of outer fields. Inner fields are lazily initialized.
	 */
	public static void init() {
		new FormConcernTables();
	}

	private FormConcernTables() {
		super(FormConcernPackage.eNS_URI);
	}
}
