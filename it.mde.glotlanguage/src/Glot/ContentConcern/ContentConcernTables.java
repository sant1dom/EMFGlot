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
package Glot.ContentConcern;

// import Glot.ContentConcern.ContentConcernPackage;
// import Glot.ContentConcern.ContentConcernTables;
import Glot.DataConcern.DataConcernPackage;
import Glot.FormConcern.FormConcernPackage;
import Glot.GlotPackage;
import Glot.GlotTables;
import org.eclipse.ocl.pivot.ids.ClassId;
import org.eclipse.ocl.pivot.ids.CollectionTypeId;
import org.eclipse.ocl.pivot.ids.IdManager;
import org.eclipse.ocl.pivot.ids.NsURIPackageId;
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
	public static final /*@NonInvalid*/ NsURIPackageId PACKid_https_c_s_s_it_mde_glotlanguage = IdManager.getNsURIPackageId("https://it.mde.glotlanguage", null, GlotPackage.eINSTANCE);
	public static final /*@NonInvalid*/ NsURIPackageId PACKid_https_c_s_s_it_mde_glotlanguage_s_contenConcern = IdManager.getNsURIPackageId("https://it.mde.glotlanguage/contenConcern", null, ContentConcernPackage.eINSTANCE);
	public static final /*@NonInvalid*/ NsURIPackageId PACKid_https_c_s_s_it_mde_glotlanguage_s_dataConcern = IdManager.getNsURIPackageId("https://it.mde.glotlanguage/dataConcern", null, DataConcernPackage.eINSTANCE);
	public static final /*@NonInvalid*/ NsURIPackageId PACKid_https_c_s_s_it_mde_glotlanguage_s_formConcern = IdManager.getNsURIPackageId("https://it.mde.glotlanguage/formConcern", null, FormConcernPackage.eINSTANCE);
	public static final /*@NonInvalid*/ ClassId CLSSid_DForm = ContentConcernTables.PACKid_https_c_s_s_it_mde_glotlanguage_s_contenConcern.getClassId("DForm", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_Entity = ContentConcernTables.PACKid_https_c_s_s_it_mde_glotlanguage_s_dataConcern.getClassId("Entity", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_Feature = ContentConcernTables.PACKid_https_c_s_s_it_mde_glotlanguage_s_dataConcern.getClassId("Feature", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_Form = ContentConcernTables.PACKid_https_c_s_s_it_mde_glotlanguage_s_formConcern.getClassId("Form", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_Index = ContentConcernTables.PACKid_https_c_s_s_it_mde_glotlanguage_s_contenConcern.getClassId("Index", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_Individual = ContentConcernTables.PACKid_https_c_s_s_it_mde_glotlanguage_s_contenConcern.getClassId("Individual", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_Page = ContentConcernTables.PACKid_https_c_s_s_it_mde_glotlanguage_s_contenConcern.getClassId("Page", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_System = ContentConcernTables.PACKid_https_c_s_s_it_mde_glotlanguage.getClassId("System", 0);
	public static final /*@NonInvalid*/ CollectionTypeId BAG_CLSSid_Page = TypeId.BAG.getSpecializedId(ContentConcernTables.CLSSid_Page);
	public static final /*@NonInvalid*/ CollectionTypeId ORD_CLSSid_DForm = TypeId.ORDERED_SET.getSpecializedId(ContentConcernTables.CLSSid_DForm);
	public static final /*@NonInvalid*/ CollectionTypeId ORD_CLSSid_Feature = TypeId.ORDERED_SET.getSpecializedId(ContentConcernTables.CLSSid_Feature);
	public static final /*@NonInvalid*/ CollectionTypeId ORD_CLSSid_Index = TypeId.ORDERED_SET.getSpecializedId(ContentConcernTables.CLSSid_Index);
	public static final /*@NonInvalid*/ CollectionTypeId ORD_CLSSid_Individual = TypeId.ORDERED_SET.getSpecializedId(ContentConcernTables.CLSSid_Individual);
	public static final /*@NonInvalid*/ CollectionTypeId ORD_CLSSid_Page = TypeId.ORDERED_SET.getSpecializedId(ContentConcernTables.CLSSid_Page);

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
		public static final EcoreExecutorType _DContent = new EcoreExecutorType(ContentConcernPackage.Literals.DCONTENT, PACKAGE, 0 | ExecutorType.ABSTRACT);
		public static final EcoreExecutorType _DForm = new EcoreExecutorType(ContentConcernPackage.Literals.DFORM, PACKAGE, 0);
		public static final EcoreExecutorType _Index = new EcoreExecutorType(ContentConcernPackage.Literals.INDEX, PACKAGE, 0);
		public static final EcoreExecutorType _Individual = new EcoreExecutorType(ContentConcernPackage.Literals.INDIVIDUAL, PACKAGE, 0);
		public static final EcoreExecutorType _Page = new EcoreExecutorType(ContentConcernPackage.Literals.PAGE, PACKAGE, 0);

		private static final EcoreExecutorType /*@NonNull*/ [] types = {
			_Content,
			_DContent,
			_DForm,
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
		private static final ExecutorFragment _Content__NamedElement = new ExecutorFragment(Types._Content, GlotTables.Types._NamedElement);
		private static final ExecutorFragment _Content__OclAny = new ExecutorFragment(Types._Content, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _Content__OclElement = new ExecutorFragment(Types._Content, OCLstdlibTables.Types._OclElement);

		private static final ExecutorFragment _DContent__Content = new ExecutorFragment(Types._DContent, ContentConcernTables.Types._Content);
		private static final ExecutorFragment _DContent__DContent = new ExecutorFragment(Types._DContent, ContentConcernTables.Types._DContent);
		private static final ExecutorFragment _DContent__NamedElement = new ExecutorFragment(Types._DContent, GlotTables.Types._NamedElement);
		private static final ExecutorFragment _DContent__OclAny = new ExecutorFragment(Types._DContent, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _DContent__OclElement = new ExecutorFragment(Types._DContent, OCLstdlibTables.Types._OclElement);

		private static final ExecutorFragment _DForm__Content = new ExecutorFragment(Types._DForm, ContentConcernTables.Types._Content);
		private static final ExecutorFragment _DForm__DForm = new ExecutorFragment(Types._DForm, ContentConcernTables.Types._DForm);
		private static final ExecutorFragment _DForm__NamedElement = new ExecutorFragment(Types._DForm, GlotTables.Types._NamedElement);
		private static final ExecutorFragment _DForm__OclAny = new ExecutorFragment(Types._DForm, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _DForm__OclElement = new ExecutorFragment(Types._DForm, OCLstdlibTables.Types._OclElement);

		private static final ExecutorFragment _Index__Content = new ExecutorFragment(Types._Index, ContentConcernTables.Types._Content);
		private static final ExecutorFragment _Index__DContent = new ExecutorFragment(Types._Index, ContentConcernTables.Types._DContent);
		private static final ExecutorFragment _Index__Index = new ExecutorFragment(Types._Index, ContentConcernTables.Types._Index);
		private static final ExecutorFragment _Index__NamedElement = new ExecutorFragment(Types._Index, GlotTables.Types._NamedElement);
		private static final ExecutorFragment _Index__OclAny = new ExecutorFragment(Types._Index, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _Index__OclElement = new ExecutorFragment(Types._Index, OCLstdlibTables.Types._OclElement);

		private static final ExecutorFragment _Individual__Content = new ExecutorFragment(Types._Individual, ContentConcernTables.Types._Content);
		private static final ExecutorFragment _Individual__DContent = new ExecutorFragment(Types._Individual, ContentConcernTables.Types._DContent);
		private static final ExecutorFragment _Individual__Individual = new ExecutorFragment(Types._Individual, ContentConcernTables.Types._Individual);
		private static final ExecutorFragment _Individual__NamedElement = new ExecutorFragment(Types._Individual, GlotTables.Types._NamedElement);
		private static final ExecutorFragment _Individual__OclAny = new ExecutorFragment(Types._Individual, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _Individual__OclElement = new ExecutorFragment(Types._Individual, OCLstdlibTables.Types._OclElement);

		private static final ExecutorFragment _Page__NamedElement = new ExecutorFragment(Types._Page, GlotTables.Types._NamedElement);
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


		public static final ExecutorProperty _DContent__entity = new EcoreExecutorProperty(ContentConcernPackage.Literals.DCONTENT__ENTITY, Types._DContent, 0);
		public static final ExecutorProperty _DContent__features = new EcoreExecutorProperty(ContentConcernPackage.Literals.DCONTENT__FEATURES, Types._DContent, 1);

		public static final ExecutorProperty _DForm__form = new EcoreExecutorProperty(ContentConcernPackage.Literals.DFORM__FORM, Types._DForm, 0);
		public static final ExecutorProperty _DForm__Page__forms = new ExecutorPropertyWithImplementation("Page", Types._DForm, 1, new EcoreLibraryOppositeProperty(ContentConcernPackage.Literals.PAGE__FORMS));

		public static final ExecutorProperty _Index__individualsList = new EcoreExecutorProperty(ContentConcernPackage.Literals.INDEX__INDIVIDUALS_LIST, Types._Index, 0);
		public static final ExecutorProperty _Index__Page__indexes = new ExecutorPropertyWithImplementation("Page", Types._Index, 1, new EcoreLibraryOppositeProperty(ContentConcernPackage.Literals.PAGE__INDEXES));

		public static final ExecutorProperty _Individual__Index__individualsList = new ExecutorPropertyWithImplementation("Index", Types._Individual, 0, new EcoreLibraryOppositeProperty(ContentConcernPackage.Literals.INDEX__INDIVIDUALS_LIST));

		public static final ExecutorProperty _Page__forms = new EcoreExecutorProperty(ContentConcernPackage.Literals.PAGE__FORMS, Types._Page, 0);
		public static final ExecutorProperty _Page__indexes = new EcoreExecutorProperty(ContentConcernPackage.Literals.PAGE__INDEXES, Types._Page, 1);
		public static final ExecutorProperty _Page__links = new EcoreExecutorProperty(ContentConcernPackage.Literals.PAGE__LINKS, Types._Page, 2);
		public static final ExecutorProperty _Page__Page__links = new ExecutorPropertyWithImplementation("Page", Types._Page, 3, new EcoreLibraryOppositeProperty(ContentConcernPackage.Literals.PAGE__LINKS));
		public static final ExecutorProperty _Page__System__pages = new ExecutorPropertyWithImplementation("System", Types._Page, 4, new EcoreLibraryOppositeProperty(GlotPackage.Literals.SYSTEM__PAGES));
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

		private static final ExecutorFragment /*@NonNull*/ [] _DContent =
			{
				Fragments._DContent__OclAny /* 0 */,
				Fragments._DContent__OclElement /* 1 */,
				Fragments._DContent__NamedElement /* 2 */,
				Fragments._DContent__Content /* 3 */,
				Fragments._DContent__DContent /* 4 */
			};
		private static final int /*@NonNull*/ [] __DContent = { 1,1,1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _DForm =
			{
				Fragments._DForm__OclAny /* 0 */,
				Fragments._DForm__OclElement /* 1 */,
				Fragments._DForm__NamedElement /* 2 */,
				Fragments._DForm__Content /* 3 */,
				Fragments._DForm__DForm /* 4 */
			};
		private static final int /*@NonNull*/ [] __DForm = { 1,1,1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _Index =
			{
				Fragments._Index__OclAny /* 0 */,
				Fragments._Index__OclElement /* 1 */,
				Fragments._Index__NamedElement /* 2 */,
				Fragments._Index__Content /* 3 */,
				Fragments._Index__DContent /* 4 */,
				Fragments._Index__Index /* 5 */
			};
		private static final int /*@NonNull*/ [] __Index = { 1,1,1,1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _Individual =
			{
				Fragments._Individual__OclAny /* 0 */,
				Fragments._Individual__OclElement /* 1 */,
				Fragments._Individual__NamedElement /* 2 */,
				Fragments._Individual__Content /* 3 */,
				Fragments._Individual__DContent /* 4 */,
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
			Types._DContent.initFragments(_DContent, __DContent);
			Types._DForm.initFragments(_DForm, __DForm);
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
		private static final ExecutorOperation /*@NonNull*/ [] _Content__NamedElement = {};
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

		private static final ExecutorOperation /*@NonNull*/ [] _DContent__DContent = {};
		private static final ExecutorOperation /*@NonNull*/ [] _DContent__Content = {};
		private static final ExecutorOperation /*@NonNull*/ [] _DContent__NamedElement = {};
		private static final ExecutorOperation /*@NonNull*/ [] _DContent__OclAny = {
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
		private static final ExecutorOperation /*@NonNull*/ [] _DContent__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _DForm__DForm = {};
		private static final ExecutorOperation /*@NonNull*/ [] _DForm__Content = {};
		private static final ExecutorOperation /*@NonNull*/ [] _DForm__NamedElement = {};
		private static final ExecutorOperation /*@NonNull*/ [] _DForm__OclAny = {
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
		private static final ExecutorOperation /*@NonNull*/ [] _DForm__OclElement = {
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
		private static final ExecutorOperation /*@NonNull*/ [] _Index__DContent = {};
		private static final ExecutorOperation /*@NonNull*/ [] _Index__NamedElement = {};
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
		private static final ExecutorOperation /*@NonNull*/ [] _Individual__DContent = {};
		private static final ExecutorOperation /*@NonNull*/ [] _Individual__NamedElement = {};
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
		private static final ExecutorOperation /*@NonNull*/ [] _Page__NamedElement = {};
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

			Fragments._DContent__Content.initOperations(_DContent__Content);
			Fragments._DContent__DContent.initOperations(_DContent__DContent);
			Fragments._DContent__NamedElement.initOperations(_DContent__NamedElement);
			Fragments._DContent__OclAny.initOperations(_DContent__OclAny);
			Fragments._DContent__OclElement.initOperations(_DContent__OclElement);

			Fragments._DForm__Content.initOperations(_DForm__Content);
			Fragments._DForm__DForm.initOperations(_DForm__DForm);
			Fragments._DForm__NamedElement.initOperations(_DForm__NamedElement);
			Fragments._DForm__OclAny.initOperations(_DForm__OclAny);
			Fragments._DForm__OclElement.initOperations(_DForm__OclElement);

			Fragments._Index__Content.initOperations(_Index__Content);
			Fragments._Index__DContent.initOperations(_Index__DContent);
			Fragments._Index__Index.initOperations(_Index__Index);
			Fragments._Index__NamedElement.initOperations(_Index__NamedElement);
			Fragments._Index__OclAny.initOperations(_Index__OclAny);
			Fragments._Index__OclElement.initOperations(_Index__OclElement);

			Fragments._Individual__Content.initOperations(_Individual__Content);
			Fragments._Individual__DContent.initOperations(_Individual__DContent);
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
			GlotTables.Properties._NamedElement__name,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents
		};

		private static final ExecutorProperty /*@NonNull*/ [] _DContent = {
			ContentConcernTables.Properties._DContent__entity,
			ContentConcernTables.Properties._DContent__features,
			GlotTables.Properties._NamedElement__name,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents
		};

		private static final ExecutorProperty /*@NonNull*/ [] _DForm = {
			ContentConcernTables.Properties._DForm__form,
			GlotTables.Properties._NamedElement__name,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents
		};

		private static final ExecutorProperty /*@NonNull*/ [] _Index = {
			ContentConcernTables.Properties._DContent__entity,
			ContentConcernTables.Properties._DContent__features,
			ContentConcernTables.Properties._Index__individualsList,
			GlotTables.Properties._NamedElement__name,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents
		};

		private static final ExecutorProperty /*@NonNull*/ [] _Individual = {
			ContentConcernTables.Properties._DContent__entity,
			ContentConcernTables.Properties._DContent__features,
			GlotTables.Properties._NamedElement__name,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents
		};

		private static final ExecutorProperty /*@NonNull*/ [] _Page = {
			ContentConcernTables.Properties._Page__forms,
			ContentConcernTables.Properties._Page__indexes,
			ContentConcernTables.Properties._Page__links,
			GlotTables.Properties._NamedElement__name,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents
		};

		/**
		 *	Install the property descriptors in the fragment descriptors.
		 */
		static {
			Fragments._Content__Content.initProperties(_Content);
			Fragments._DContent__DContent.initProperties(_DContent);
			Fragments._DForm__DForm.initProperties(_DForm);
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
}
