/*******************************************************************************
 *************************************************************************
 * This code is 100% auto-generated
 * from:
 * using:
 *   /it.mde.glotlanguage2/WebApplication2/glotlanguage2.genmodel
 *   org.eclipse.ocl.examples.codegen.oclinecore.OCLinEcoreTables
 *
 * Do not edit it.
 *******************************************************************************/
package Glot2.ContentConcern;

// import Glot2.ContentConcern.ContentConcernPackage;
// import Glot2.ContentConcern.ContentConcernTables;
import Glot2.DataConcern.DataConcernPackage;
import Glot2.FormConcern.FormConcernPackage;
import Glot2.Glot2Package;
import Glot2.Glot2Tables;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.ocl.pivot.ids.ClassId;
import org.eclipse.ocl.pivot.ids.CollectionTypeId;
import org.eclipse.ocl.pivot.ids.IdManager;
import org.eclipse.ocl.pivot.ids.NsURIPackageId;
import org.eclipse.ocl.pivot.ids.RootPackageId;
import org.eclipse.ocl.pivot.ids.TypeId;
import org.eclipse.ocl.pivot.internal.library.ecore.EcoreExecutorPackage;
import org.eclipse.ocl.pivot.internal.library.ecore.EcoreExecutorProperty;
import org.eclipse.ocl.pivot.internal.library.ecore.EcoreExecutorType;
import org.eclipse.ocl.pivot.internal.library.ecore.EcoreLibraryOppositeProperty;
import org.eclipse.ocl.pivot.internal.library.executor.ExecutorFragment;
import org.eclipse.ocl.pivot.internal.library.executor.ExecutorOperation;
import org.eclipse.ocl.pivot.internal.library.executor.ExecutorProperty;
import org.eclipse.ocl.pivot.internal.library.executor.ExecutorPropertyWithImplementation;
import org.eclipse.ocl.pivot.internal.library.executor.ExecutorStandardLibrary;
import org.eclipse.ocl.pivot.internal.library.executor.ExecutorType;
import org.eclipse.ocl.pivot.oclstdlib.OCLstdlibTables;
import org.eclipse.ocl.pivot.utilities.AbstractTables;
import org.eclipse.ocl.pivot.utilities.ValueUtil;
import org.eclipse.ocl.pivot.values.IntegerValue;

/**
 * ContentConcernTables provides the dispatch tables for the ContentConcern for use by the OCL dispatcher.
 *
 * In order to ensure correct static initialization, a top level class element must be accessed
 * before any nested class element. Therefore an access to PACKAGE.getClass() is recommended.
 */
public class ContentConcernTables extends AbstractTables
{
	static {
		Init.initStart();
	}

	/**
	 *	The package descriptor for the package.
	 */
	public static final EcoreExecutorPackage PACKAGE = new EcoreExecutorPackage(ContentConcernPackage.eINSTANCE);

	/**
	 *	The library of all packages and types.
	 */
	public static final ExecutorStandardLibrary LIBRARY = OCLstdlibTables.LIBRARY;

	/**
	 *	Constants used by auto-generated code.
	 */
	public static final /*@NonInvalid*/ RootPackageId PACKid_$metamodel$ = IdManager.getRootPackageId("$metamodel$");
	public static final /*@NonInvalid*/ NsURIPackageId PACKid_https_c_s_s_it_mde_glotlanguage2 = IdManager.getNsURIPackageId("https://it.mde.glotlanguage2", null, Glot2Package.eINSTANCE);
	public static final /*@NonInvalid*/ NsURIPackageId PACKid_https_c_s_s_it_mde_glotlanguage2_s_contenConcern = IdManager.getNsURIPackageId("https://it.mde.glotlanguage2/contenConcern", null, ContentConcernPackage.eINSTANCE);
	public static final /*@NonInvalid*/ NsURIPackageId PACKid_https_c_s_s_it_mde_glotlanguage2_s_dataConcern = IdManager.getNsURIPackageId("https://it.mde.glotlanguage2/dataConcern", null, DataConcernPackage.eINSTANCE);
	public static final /*@NonInvalid*/ NsURIPackageId PACKid_https_c_s_s_it_mde_glotlanguage2_s_formConcern = IdManager.getNsURIPackageId("https://it.mde.glotlanguage2/formConcern", null, FormConcernPackage.eINSTANCE);
	public static final /*@NonInvalid*/ ClassId CLSSid_Class = ContentConcernTables.PACKid_$metamodel$.getClassId("Class", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_DynamicContent = ContentConcernTables.PACKid_https_c_s_s_it_mde_glotlanguage2_s_contenConcern.getClassId("DynamicContent", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_Entity = ContentConcernTables.PACKid_https_c_s_s_it_mde_glotlanguage2_s_dataConcern.getClassId("Entity", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_Feature = ContentConcernTables.PACKid_https_c_s_s_it_mde_glotlanguage2_s_dataConcern.getClassId("Feature", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_Form = ContentConcernTables.PACKid_https_c_s_s_it_mde_glotlanguage2_s_formConcern.getClassId("Form", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_Index = ContentConcernTables.PACKid_https_c_s_s_it_mde_glotlanguage2_s_contenConcern.getClassId("Index", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_Individual = ContentConcernTables.PACKid_https_c_s_s_it_mde_glotlanguage2_s_contenConcern.getClassId("Individual", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_Page = ContentConcernTables.PACKid_https_c_s_s_it_mde_glotlanguage2_s_contenConcern.getClassId("Page", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_System = ContentConcernTables.PACKid_https_c_s_s_it_mde_glotlanguage2.getClassId("System", 0);
	public static final /*@NonInvalid*/ IntegerValue INT_0 = ValueUtil.integerValueOf("0");
	public static final /*@NonInvalid*/ IntegerValue INT_1 = ValueUtil.integerValueOf("1");
	public static final /*@NonInvalid*/ CollectionTypeId BAG_CLSSid_Index = TypeId.BAG.getSpecializedId(ContentConcernTables.CLSSid_Index);
	public static final /*@NonInvalid*/ CollectionTypeId BAG_CLSSid_Individual = TypeId.BAG.getSpecializedId(ContentConcernTables.CLSSid_Individual);
	public static final /*@NonInvalid*/ CollectionTypeId BAG_CLSSid_Page = TypeId.BAG.getSpecializedId(ContentConcernTables.CLSSid_Page);
	public static final /*@NonInvalid*/ CollectionTypeId ORD_CLSSid_Feature = TypeId.ORDERED_SET.getSpecializedId(ContentConcernTables.CLSSid_Feature);
	public static final /*@NonInvalid*/ CollectionTypeId ORD_CLSSid_Form = TypeId.ORDERED_SET.getSpecializedId(ContentConcernTables.CLSSid_Form);
	public static final /*@NonInvalid*/ CollectionTypeId ORD_CLSSid_Index = TypeId.ORDERED_SET.getSpecializedId(ContentConcernTables.CLSSid_Index);
	public static final /*@NonInvalid*/ CollectionTypeId ORD_CLSSid_Individual = TypeId.ORDERED_SET.getSpecializedId(ContentConcernTables.CLSSid_Individual);
	public static final /*@NonInvalid*/ CollectionTypeId ORD_CLSSid_Page = TypeId.ORDERED_SET.getSpecializedId(ContentConcernTables.CLSSid_Page);
	public static final /*@NonInvalid*/ CollectionTypeId SEQ_CLSSid_Index = TypeId.SEQUENCE.getSpecializedId(ContentConcernTables.CLSSid_Index);
	public static final /*@NonInvalid*/ CollectionTypeId SET_CLSSid_Index = TypeId.SET.getSpecializedId(ContentConcernTables.CLSSid_Index);

	/**
	 *	The type parameters for templated types and operations.
	 */
	public static class TypeParameters {
		static {
			Init.initStart();
			ContentConcernTables.init();
		}

		static {
			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of ContentConcernTables::TypeParameters and all preceding sub-packages.
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

		public static final EcoreExecutorType _Content = new EcoreExecutorType(ContentConcernPackage.Literals.CONTENT, PACKAGE, 0 | ExecutorType.ABSTRACT);
		public static final EcoreExecutorType _DynamicContent = new EcoreExecutorType(ContentConcernPackage.Literals.DYNAMIC_CONTENT, PACKAGE, 0 | ExecutorType.ABSTRACT);
		public static final EcoreExecutorType _Index = new EcoreExecutorType(ContentConcernPackage.Literals.INDEX, PACKAGE, 0);
		public static final EcoreExecutorType _Individual = new EcoreExecutorType(ContentConcernPackage.Literals.INDIVIDUAL, PACKAGE, 0);
		public static final EcoreExecutorType _Page = new EcoreExecutorType(ContentConcernPackage.Literals.PAGE, PACKAGE, 0);

		private static final EcoreExecutorType /*@NonNull*/ [] types = {
			_Content,
			_DynamicContent,
			_Index,
			_Individual,
			_Page
		};

		/*
		 *	Install the type descriptors in the package descriptor.
		 */
		static {
			PACKAGE.init(LIBRARY, types);
			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of ContentConcernTables::Types and all preceding sub-packages.
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

		private static final ExecutorFragment _Content__Content = new ExecutorFragment(Types._Content, ContentConcernTables.Types._Content);
		private static final ExecutorFragment _Content__NamedElement = new ExecutorFragment(Types._Content, Glot2Tables.Types._NamedElement);
		private static final ExecutorFragment _Content__OclAny = new ExecutorFragment(Types._Content, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _Content__OclElement = new ExecutorFragment(Types._Content, OCLstdlibTables.Types._OclElement);

		private static final ExecutorFragment _DynamicContent__Content = new ExecutorFragment(Types._DynamicContent, ContentConcernTables.Types._Content);
		private static final ExecutorFragment _DynamicContent__DynamicContent = new ExecutorFragment(Types._DynamicContent, ContentConcernTables.Types._DynamicContent);
		private static final ExecutorFragment _DynamicContent__NamedElement = new ExecutorFragment(Types._DynamicContent, Glot2Tables.Types._NamedElement);
		private static final ExecutorFragment _DynamicContent__OclAny = new ExecutorFragment(Types._DynamicContent, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _DynamicContent__OclElement = new ExecutorFragment(Types._DynamicContent, OCLstdlibTables.Types._OclElement);

		private static final ExecutorFragment _Index__Content = new ExecutorFragment(Types._Index, ContentConcernTables.Types._Content);
		private static final ExecutorFragment _Index__DynamicContent = new ExecutorFragment(Types._Index, ContentConcernTables.Types._DynamicContent);
		private static final ExecutorFragment _Index__Index = new ExecutorFragment(Types._Index, ContentConcernTables.Types._Index);
		private static final ExecutorFragment _Index__NamedElement = new ExecutorFragment(Types._Index, Glot2Tables.Types._NamedElement);
		private static final ExecutorFragment _Index__OclAny = new ExecutorFragment(Types._Index, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _Index__OclElement = new ExecutorFragment(Types._Index, OCLstdlibTables.Types._OclElement);

		private static final ExecutorFragment _Individual__Content = new ExecutorFragment(Types._Individual, ContentConcernTables.Types._Content);
		private static final ExecutorFragment _Individual__DynamicContent = new ExecutorFragment(Types._Individual, ContentConcernTables.Types._DynamicContent);
		private static final ExecutorFragment _Individual__Individual = new ExecutorFragment(Types._Individual, ContentConcernTables.Types._Individual);
		private static final ExecutorFragment _Individual__NamedElement = new ExecutorFragment(Types._Individual, Glot2Tables.Types._NamedElement);
		private static final ExecutorFragment _Individual__OclAny = new ExecutorFragment(Types._Individual, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _Individual__OclElement = new ExecutorFragment(Types._Individual, OCLstdlibTables.Types._OclElement);

		private static final ExecutorFragment _Page__NamedElement = new ExecutorFragment(Types._Page, Glot2Tables.Types._NamedElement);
		private static final ExecutorFragment _Page__OclAny = new ExecutorFragment(Types._Page, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _Page__OclElement = new ExecutorFragment(Types._Page, OCLstdlibTables.Types._OclElement);
		private static final ExecutorFragment _Page__Page = new ExecutorFragment(Types._Page, ContentConcernTables.Types._Page);

		static {
			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of ContentConcernTables::Fragments and all preceding sub-packages.
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
		 * Force initialization of the fields of ContentConcernTables::Parameters and all preceding sub-packages.
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
		 * Force initialization of the fields of ContentConcernTables::Operations and all preceding sub-packages.
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


		public static final ExecutorProperty _DynamicContent__entity = new EcoreExecutorProperty(ContentConcernPackage.Literals.DYNAMIC_CONTENT__ENTITY, Types._DynamicContent, 0);
		public static final ExecutorProperty _DynamicContent__features = new EcoreExecutorProperty(ContentConcernPackage.Literals.DYNAMIC_CONTENT__FEATURES, Types._DynamicContent, 1);

		public static final ExecutorProperty _Index__individuals = new EcoreExecutorProperty(ContentConcernPackage.Literals.INDEX__INDIVIDUALS, Types._Index, 0);
		public static final ExecutorProperty _Index__Individual__index = new ExecutorPropertyWithImplementation("Individual", Types._Index, 1, new EcoreLibraryOppositeProperty(ContentConcernPackage.Literals.INDIVIDUAL__INDEX));
		public static final ExecutorProperty _Index__Page__indexes = new ExecutorPropertyWithImplementation("Page", Types._Index, 2, new EcoreLibraryOppositeProperty(ContentConcernPackage.Literals.PAGE__INDEXES));

		public static final ExecutorProperty _Individual__index = new EcoreExecutorProperty(ContentConcernPackage.Literals.INDIVIDUAL__INDEX, Types._Individual, 0);
		public static final ExecutorProperty _Individual__Index__individuals = new ExecutorPropertyWithImplementation("Index", Types._Individual, 1, new EcoreLibraryOppositeProperty(ContentConcernPackage.Literals.INDEX__INDIVIDUALS));
		public static final ExecutorProperty _Individual__Page__individuals = new ExecutorPropertyWithImplementation("Page", Types._Individual, 2, new EcoreLibraryOppositeProperty(ContentConcernPackage.Literals.PAGE__INDIVIDUALS));

		public static final ExecutorProperty _Page__forms = new EcoreExecutorProperty(ContentConcernPackage.Literals.PAGE__FORMS, Types._Page, 0);
		public static final ExecutorProperty _Page__indexes = new EcoreExecutorProperty(ContentConcernPackage.Literals.PAGE__INDEXES, Types._Page, 1);
		public static final ExecutorProperty _Page__individuals = new EcoreExecutorProperty(ContentConcernPackage.Literals.PAGE__INDIVIDUALS, Types._Page, 2);
		public static final ExecutorProperty _Page__links = new EcoreExecutorProperty(ContentConcernPackage.Literals.PAGE__LINKS, Types._Page, 3);
		public static final ExecutorProperty _Page__Page__links = new ExecutorPropertyWithImplementation("Page", Types._Page, 4, new EcoreLibraryOppositeProperty(ContentConcernPackage.Literals.PAGE__LINKS));
		public static final ExecutorProperty _Page__System__pages = new ExecutorPropertyWithImplementation("System", Types._Page, 5, new EcoreLibraryOppositeProperty(Glot2Package.Literals.SYSTEM__PAGES));
		static {
			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of ContentConcernTables::Properties and all preceding sub-packages.
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

		private static final ExecutorFragment /*@NonNull*/ [] _Content =
			{
				Fragments._Content__OclAny /* 0 */,
				Fragments._Content__OclElement /* 1 */,
				Fragments._Content__NamedElement /* 2 */,
				Fragments._Content__Content /* 3 */
			};
		private static final int /*@NonNull*/ [] __Content = { 1,1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _DynamicContent =
			{
				Fragments._DynamicContent__OclAny /* 0 */,
				Fragments._DynamicContent__OclElement /* 1 */,
				Fragments._DynamicContent__NamedElement /* 2 */,
				Fragments._DynamicContent__Content /* 3 */,
				Fragments._DynamicContent__DynamicContent /* 4 */
			};
		private static final int /*@NonNull*/ [] __DynamicContent = { 1,1,1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _Index =
			{
				Fragments._Index__OclAny /* 0 */,
				Fragments._Index__OclElement /* 1 */,
				Fragments._Index__NamedElement /* 2 */,
				Fragments._Index__Content /* 3 */,
				Fragments._Index__DynamicContent /* 4 */,
				Fragments._Index__Index /* 5 */
			};
		private static final int /*@NonNull*/ [] __Index = { 1,1,1,1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _Individual =
			{
				Fragments._Individual__OclAny /* 0 */,
				Fragments._Individual__OclElement /* 1 */,
				Fragments._Individual__NamedElement /* 2 */,
				Fragments._Individual__Content /* 3 */,
				Fragments._Individual__DynamicContent /* 4 */,
				Fragments._Individual__Individual /* 5 */
			};
		private static final int /*@NonNull*/ [] __Individual = { 1,1,1,1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _Page =
			{
				Fragments._Page__OclAny /* 0 */,
				Fragments._Page__OclElement /* 1 */,
				Fragments._Page__NamedElement /* 2 */,
				Fragments._Page__Page /* 3 */
			};
		private static final int /*@NonNull*/ [] __Page = { 1,1,1,1 };

		/**
		 *	Install the fragment descriptors in the class descriptors.
		 */
		static {
			Types._Content.initFragments(_Content, __Content);
			Types._DynamicContent.initFragments(_DynamicContent, __DynamicContent);
			Types._Index.initFragments(_Index, __Index);
			Types._Individual.initFragments(_Individual, __Individual);
			Types._Page.initFragments(_Page, __Page);

			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of ContentConcernTables::TypeFragments and all preceding sub-packages.
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

		private static final ExecutorOperation /*@NonNull*/ [] _Content__Content = {};
		private static final ExecutorOperation /*@NonNull*/ [] _Content__NamedElement = {
			Glot2Tables.Operations._NamedElement__NameIsDefined /* NameIsDefined(String[1]) */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _Content__OclAny = {
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
		private static final ExecutorOperation /*@NonNull*/ [] _Content__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _DynamicContent__DynamicContent = {};
		private static final ExecutorOperation /*@NonNull*/ [] _DynamicContent__Content = {};
		private static final ExecutorOperation /*@NonNull*/ [] _DynamicContent__NamedElement = {
			Glot2Tables.Operations._NamedElement__NameIsDefined /* NameIsDefined(String[1]) */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _DynamicContent__OclAny = {
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
		private static final ExecutorOperation /*@NonNull*/ [] _DynamicContent__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _Index__Index = {};
		private static final ExecutorOperation /*@NonNull*/ [] _Index__Content = {};
		private static final ExecutorOperation /*@NonNull*/ [] _Index__DynamicContent = {};
		private static final ExecutorOperation /*@NonNull*/ [] _Index__NamedElement = {
			Glot2Tables.Operations._NamedElement__NameIsDefined /* NameIsDefined(String[1]) */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _Index__OclAny = {
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
		private static final ExecutorOperation /*@NonNull*/ [] _Index__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _Individual__Individual = {};
		private static final ExecutorOperation /*@NonNull*/ [] _Individual__Content = {};
		private static final ExecutorOperation /*@NonNull*/ [] _Individual__DynamicContent = {};
		private static final ExecutorOperation /*@NonNull*/ [] _Individual__NamedElement = {
			Glot2Tables.Operations._NamedElement__NameIsDefined /* NameIsDefined(String[1]) */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _Individual__OclAny = {
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
		private static final ExecutorOperation /*@NonNull*/ [] _Individual__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _Page__Page = {};
		private static final ExecutorOperation /*@NonNull*/ [] _Page__NamedElement = {
			Glot2Tables.Operations._NamedElement__NameIsDefined /* NameIsDefined(String[1]) */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _Page__OclAny = {
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
		private static final ExecutorOperation /*@NonNull*/ [] _Page__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		/*
		 *	Install the operation descriptors in the fragment descriptors.
		 */
		static {
			Fragments._Content__Content.initOperations(_Content__Content);
			Fragments._Content__NamedElement.initOperations(_Content__NamedElement);
			Fragments._Content__OclAny.initOperations(_Content__OclAny);
			Fragments._Content__OclElement.initOperations(_Content__OclElement);

			Fragments._DynamicContent__Content.initOperations(_DynamicContent__Content);
			Fragments._DynamicContent__DynamicContent.initOperations(_DynamicContent__DynamicContent);
			Fragments._DynamicContent__NamedElement.initOperations(_DynamicContent__NamedElement);
			Fragments._DynamicContent__OclAny.initOperations(_DynamicContent__OclAny);
			Fragments._DynamicContent__OclElement.initOperations(_DynamicContent__OclElement);

			Fragments._Index__Content.initOperations(_Index__Content);
			Fragments._Index__DynamicContent.initOperations(_Index__DynamicContent);
			Fragments._Index__Index.initOperations(_Index__Index);
			Fragments._Index__NamedElement.initOperations(_Index__NamedElement);
			Fragments._Index__OclAny.initOperations(_Index__OclAny);
			Fragments._Index__OclElement.initOperations(_Index__OclElement);

			Fragments._Individual__Content.initOperations(_Individual__Content);
			Fragments._Individual__DynamicContent.initOperations(_Individual__DynamicContent);
			Fragments._Individual__Individual.initOperations(_Individual__Individual);
			Fragments._Individual__NamedElement.initOperations(_Individual__NamedElement);
			Fragments._Individual__OclAny.initOperations(_Individual__OclAny);
			Fragments._Individual__OclElement.initOperations(_Individual__OclElement);

			Fragments._Page__NamedElement.initOperations(_Page__NamedElement);
			Fragments._Page__OclAny.initOperations(_Page__OclAny);
			Fragments._Page__OclElement.initOperations(_Page__OclElement);
			Fragments._Page__Page.initOperations(_Page__Page);

			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of ContentConcernTables::FragmentOperations and all preceding sub-packages.
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

		private static final ExecutorProperty /*@NonNull*/ [] _Content = {
			Glot2Tables.Properties._NamedElement__name,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents
		};

		private static final ExecutorProperty /*@NonNull*/ [] _DynamicContent = {
			ContentConcernTables.Properties._DynamicContent__entity,
			ContentConcernTables.Properties._DynamicContent__features,
			Glot2Tables.Properties._NamedElement__name,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents
		};

		private static final ExecutorProperty /*@NonNull*/ [] _Index = {
			ContentConcernTables.Properties._DynamicContent__entity,
			ContentConcernTables.Properties._DynamicContent__features,
			ContentConcernTables.Properties._Index__individuals,
			Glot2Tables.Properties._NamedElement__name,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents
		};

		private static final ExecutorProperty /*@NonNull*/ [] _Individual = {
			ContentConcernTables.Properties._DynamicContent__entity,
			ContentConcernTables.Properties._DynamicContent__features,
			ContentConcernTables.Properties._Individual__index,
			Glot2Tables.Properties._NamedElement__name,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents
		};

		private static final ExecutorProperty /*@NonNull*/ [] _Page = {
			ContentConcernTables.Properties._Page__forms,
			ContentConcernTables.Properties._Page__indexes,
			ContentConcernTables.Properties._Page__individuals,
			ContentConcernTables.Properties._Page__links,
			Glot2Tables.Properties._NamedElement__name,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents
		};

		/**
		 *	Install the property descriptors in the fragment descriptors.
		 */
		static {
			Fragments._Content__Content.initProperties(_Content);
			Fragments._DynamicContent__DynamicContent.initProperties(_DynamicContent);
			Fragments._Index__Index.initProperties(_Index);
			Fragments._Individual__Individual.initProperties(_Individual);
			Fragments._Page__Page.initProperties(_Page);

			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of ContentConcernTables::FragmentProperties and all preceding sub-packages.
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

		/**
		 *	Install the enumeration literals in the enumerations.
		 */
		static {

			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of ContentConcernTables::EnumerationLiterals and all preceding sub-packages.
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
		new ContentConcernTables();
	}

	private ContentConcernTables() {
		super(ContentConcernPackage.eNS_URI);
	}

	/*
	 * The EClasses whose instances should be cached to support allInstances().
	 */
	private static final EClass allInstancesEClasses /*@NonNull*/ [] = {
		ContentConcernPackage.Literals.INDEX
	};

	@Override
	public EClass /*@NonNull*/ [] basicGetAllInstancesClasses() {
		return allInstancesEClasses;
	}
}
