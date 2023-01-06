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
package Glot.DataConcern;

import Glot.ContentConcern.ContentConcernPackage;
// import Glot.DataConcern.DataConcernPackage;
// import Glot.DataConcern.DataConcernTables;
import Glot.FormConcern.FormConcernPackage;
import Glot.GlotPackage;
import Glot.GlotTables;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.ocl.pivot.ids.ClassId;
import org.eclipse.ocl.pivot.ids.CollectionTypeId;
import org.eclipse.ocl.pivot.ids.DataTypeId;
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
import org.eclipse.ocl.pivot.internal.library.executor.ExecutorType;
import org.eclipse.ocl.pivot.oclstdlib.OCLstdlibTables;
import org.eclipse.ocl.pivot.utilities.AbstractTables;

/**
 * DataConcernTables provides the dispatch tables for the DataConcern for use by the OCL dispatcher.
 *
 * In order to ensure correct static initialization, a top level class element must be accessed
 * before any nested class element. Therefore an access to PACKAGE.getClass() is recommended.
 */
public class DataConcernTables extends AbstractTables
{
	static {
		Init.initStart();
	}

	/**
	 *	The package descriptor for the package.
	 */
	public static final EcoreExecutorPackage PACKAGE = new EcoreExecutorPackage(DataConcernPackage.eINSTANCE);

	/**
	 *	The library of all packages and types.
	 */
	public static final ExecutorStandardLibrary LIBRARY = OCLstdlibTables.LIBRARY;

	/**
	 *	Constants used by auto-generated code.
	 */
	public static final /*@NonInvalid*/ NsURIPackageId PACKid_http_c_s_s_www_eclipse_org_s_emf_s_2002_s_Ecore = IdManager.getNsURIPackageId("http://www.eclipse.org/emf/2002/Ecore", null, EcorePackage.eINSTANCE);
	public static final /*@NonInvalid*/ NsURIPackageId PACKid_https_c_s_s_it_mde_glotlanguage = IdManager.getNsURIPackageId("https://it.mde.glotlanguage", null, GlotPackage.eINSTANCE);
	public static final /*@NonInvalid*/ NsURIPackageId PACKid_https_c_s_s_it_mde_glotlanguage_s_contenConcern = IdManager.getNsURIPackageId("https://it.mde.glotlanguage/contenConcern", null, ContentConcernPackage.eINSTANCE);
	public static final /*@NonInvalid*/ NsURIPackageId PACKid_https_c_s_s_it_mde_glotlanguage_s_dataConcern = IdManager.getNsURIPackageId("https://it.mde.glotlanguage/dataConcern", null, DataConcernPackage.eINSTANCE);
	public static final /*@NonInvalid*/ NsURIPackageId PACKid_https_c_s_s_it_mde_glotlanguage_s_formConcern = IdManager.getNsURIPackageId("https://it.mde.glotlanguage/formConcern", null, FormConcernPackage.eINSTANCE);
	public static final /*@NonInvalid*/ ClassId CLSSid_DContent = DataConcernTables.PACKid_https_c_s_s_it_mde_glotlanguage_s_contenConcern.getClassId("DContent", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_Element = DataConcernTables.PACKid_https_c_s_s_it_mde_glotlanguage_s_formConcern.getClassId("Element", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_Entity = DataConcernTables.PACKid_https_c_s_s_it_mde_glotlanguage_s_dataConcern.getClassId("Entity", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_Feature = DataConcernTables.PACKid_https_c_s_s_it_mde_glotlanguage_s_dataConcern.getClassId("Feature", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_Form = DataConcernTables.PACKid_https_c_s_s_it_mde_glotlanguage_s_formConcern.getClassId("Form", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_Reference = DataConcernTables.PACKid_https_c_s_s_it_mde_glotlanguage_s_dataConcern.getClassId("Reference", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_System = DataConcernTables.PACKid_https_c_s_s_it_mde_glotlanguage.getClassId("System", 0);
	public static final /*@NonInvalid*/ DataTypeId DATAid_EInt = DataConcernTables.PACKid_http_c_s_s_www_eclipse_org_s_emf_s_2002_s_Ecore.getDataTypeId("EInt", 0);
	public static final /*@NonInvalid*/ EnumerationId ENUMid__DataType = DataConcernTables.PACKid_https_c_s_s_it_mde_glotlanguage_s_dataConcern.getEnumerationId("_DataType");
	public static final /*@NonInvalid*/ CollectionTypeId BAG_CLSSid_DContent = TypeId.BAG.getSpecializedId(DataConcernTables.CLSSid_DContent);
	public static final /*@NonInvalid*/ CollectionTypeId BAG_CLSSid_Element = TypeId.BAG.getSpecializedId(DataConcernTables.CLSSid_Element);
	public static final /*@NonInvalid*/ CollectionTypeId BAG_CLSSid_Form = TypeId.BAG.getSpecializedId(DataConcernTables.CLSSid_Form);
	public static final /*@NonInvalid*/ CollectionTypeId BAG_CLSSid_Reference = TypeId.BAG.getSpecializedId(DataConcernTables.CLSSid_Reference);
	public static final /*@NonInvalid*/ CollectionTypeId ORD_CLSSid_Feature = TypeId.ORDERED_SET.getSpecializedId(DataConcernTables.CLSSid_Feature);

	/**
	 *	The type parameters for templated types and operations.
	 */
	public static class TypeParameters {
		static {
			Init.initStart();
			DataConcernTables.init();
		}

		static {
			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of DataConcernTables::TypeParameters and all preceding sub-packages.
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

		public static final EcoreExecutorType _Attribute = new EcoreExecutorType(DataConcernPackage.Literals.ATTRIBUTE, PACKAGE, 0);
		public static final EcoreExecutorType _Entity = new EcoreExecutorType(DataConcernPackage.Literals.ENTITY, PACKAGE, 0);
		public static final EcoreExecutorType _Feature = new EcoreExecutorType(DataConcernPackage.Literals.FEATURE, PACKAGE, 0 | ExecutorType.ABSTRACT);
		public static final EcoreExecutorType _Reference = new EcoreExecutorType(DataConcernPackage.Literals.REFERENCE, PACKAGE, 0);
		public static final EcoreExecutorEnumeration __DataType = new EcoreExecutorEnumeration(DataConcernPackage.Literals._DATA_TYPE, PACKAGE, 0);

		private static final EcoreExecutorType /*@NonNull*/ [] types = {
			_Attribute,
			_Entity,
			_Feature,
			_Reference,
			__DataType
		};

		/*
		 *	Install the type descriptors in the package descriptor.
		 */
		static {
			PACKAGE.init(LIBRARY, types);
			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of DataConcernTables::Types and all preceding sub-packages.
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

		private static final ExecutorFragment _Attribute__Attribute = new ExecutorFragment(Types._Attribute, DataConcernTables.Types._Attribute);
		private static final ExecutorFragment _Attribute__Feature = new ExecutorFragment(Types._Attribute, DataConcernTables.Types._Feature);
		private static final ExecutorFragment _Attribute__NamedElement = new ExecutorFragment(Types._Attribute, GlotTables.Types._NamedElement);
		private static final ExecutorFragment _Attribute__OclAny = new ExecutorFragment(Types._Attribute, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _Attribute__OclElement = new ExecutorFragment(Types._Attribute, OCLstdlibTables.Types._OclElement);

		private static final ExecutorFragment _Entity__Entity = new ExecutorFragment(Types._Entity, DataConcernTables.Types._Entity);
		private static final ExecutorFragment _Entity__NamedElement = new ExecutorFragment(Types._Entity, GlotTables.Types._NamedElement);
		private static final ExecutorFragment _Entity__OclAny = new ExecutorFragment(Types._Entity, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _Entity__OclElement = new ExecutorFragment(Types._Entity, OCLstdlibTables.Types._OclElement);

		private static final ExecutorFragment _Feature__Feature = new ExecutorFragment(Types._Feature, DataConcernTables.Types._Feature);
		private static final ExecutorFragment _Feature__NamedElement = new ExecutorFragment(Types._Feature, GlotTables.Types._NamedElement);
		private static final ExecutorFragment _Feature__OclAny = new ExecutorFragment(Types._Feature, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _Feature__OclElement = new ExecutorFragment(Types._Feature, OCLstdlibTables.Types._OclElement);

		private static final ExecutorFragment _Reference__Feature = new ExecutorFragment(Types._Reference, DataConcernTables.Types._Feature);
		private static final ExecutorFragment _Reference__NamedElement = new ExecutorFragment(Types._Reference, GlotTables.Types._NamedElement);
		private static final ExecutorFragment _Reference__OclAny = new ExecutorFragment(Types._Reference, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _Reference__OclElement = new ExecutorFragment(Types._Reference, OCLstdlibTables.Types._OclElement);
		private static final ExecutorFragment _Reference__Reference = new ExecutorFragment(Types._Reference, DataConcernTables.Types._Reference);

		private static final ExecutorFragment __DataType__OclAny = new ExecutorFragment(Types.__DataType, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment __DataType__OclElement = new ExecutorFragment(Types.__DataType, OCLstdlibTables.Types._OclElement);
		private static final ExecutorFragment __DataType__OclEnumeration = new ExecutorFragment(Types.__DataType, OCLstdlibTables.Types._OclEnumeration);
		private static final ExecutorFragment __DataType__OclType = new ExecutorFragment(Types.__DataType, OCLstdlibTables.Types._OclType);
		private static final ExecutorFragment __DataType___DataType = new ExecutorFragment(Types.__DataType, DataConcernTables.Types.__DataType);

		static {
			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of DataConcernTables::Fragments and all preceding sub-packages.
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
		 * Force initialization of the fields of DataConcernTables::Parameters and all preceding sub-packages.
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
		 * Force initialization of the fields of DataConcernTables::Operations and all preceding sub-packages.
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

		public static final ExecutorProperty _Attribute__isPrimaryKey = new EcoreExecutorProperty(DataConcernPackage.Literals.ATTRIBUTE__IS_PRIMARY_KEY, Types._Attribute, 0);
		public static final ExecutorProperty _Attribute__type = new EcoreExecutorProperty(DataConcernPackage.Literals.ATTRIBUTE__TYPE, Types._Attribute, 1);
		public static final ExecutorProperty _Attribute__Element__attribute = new ExecutorPropertyWithImplementation("Element", Types._Attribute, 2, new EcoreLibraryOppositeProperty(FormConcernPackage.Literals.ELEMENT__ATTRIBUTE));

		public static final ExecutorProperty _Entity__features = new EcoreExecutorProperty(DataConcernPackage.Literals.ENTITY__FEATURES, Types._Entity, 0);
		public static final ExecutorProperty _Entity__test = new EcoreExecutorProperty(DataConcernPackage.Literals.ENTITY__TEST, Types._Entity, 1);
		public static final ExecutorProperty _Entity__DContent__entity = new ExecutorPropertyWithImplementation("DContent", Types._Entity, 2, new EcoreLibraryOppositeProperty(ContentConcernPackage.Literals.DCONTENT__ENTITY));
		public static final ExecutorProperty _Entity__Form__entity = new ExecutorPropertyWithImplementation("Form", Types._Entity, 3, new EcoreLibraryOppositeProperty(FormConcernPackage.Literals.FORM__ENTITY));
		public static final ExecutorProperty _Entity__Reference__foreignKey = new ExecutorPropertyWithImplementation("Reference", Types._Entity, 4, new EcoreLibraryOppositeProperty(DataConcernPackage.Literals.REFERENCE__FOREIGN_KEY));
		public static final ExecutorProperty _Entity__System__entities = new ExecutorPropertyWithImplementation("System", Types._Entity, 5, new EcoreLibraryOppositeProperty(GlotPackage.Literals.SYSTEM__ENTITIES));

		public static final ExecutorProperty _Feature__DContent__features = new ExecutorPropertyWithImplementation("DContent", Types._Feature, 0, new EcoreLibraryOppositeProperty(ContentConcernPackage.Literals.DCONTENT__FEATURES));
		public static final ExecutorProperty _Feature__Entity__features = new ExecutorPropertyWithImplementation("Entity", Types._Feature, 1, new EcoreLibraryOppositeProperty(DataConcernPackage.Literals.ENTITY__FEATURES));

		public static final ExecutorProperty _Reference__foreignKey = new EcoreExecutorProperty(DataConcernPackage.Literals.REFERENCE__FOREIGN_KEY, Types._Reference, 0);
		static {
			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of DataConcernTables::Properties and all preceding sub-packages.
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

		private static final ExecutorFragment /*@NonNull*/ [] _Attribute =
			{
				Fragments._Attribute__OclAny /* 0 */,
				Fragments._Attribute__OclElement /* 1 */,
				Fragments._Attribute__NamedElement /* 2 */,
				Fragments._Attribute__Feature /* 3 */,
				Fragments._Attribute__Attribute /* 4 */
			};
		private static final int /*@NonNull*/ [] __Attribute = { 1,1,1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _Entity =
			{
				Fragments._Entity__OclAny /* 0 */,
				Fragments._Entity__OclElement /* 1 */,
				Fragments._Entity__NamedElement /* 2 */,
				Fragments._Entity__Entity /* 3 */
			};
		private static final int /*@NonNull*/ [] __Entity = { 1,1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _Feature =
			{
				Fragments._Feature__OclAny /* 0 */,
				Fragments._Feature__OclElement /* 1 */,
				Fragments._Feature__NamedElement /* 2 */,
				Fragments._Feature__Feature /* 3 */
			};
		private static final int /*@NonNull*/ [] __Feature = { 1,1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _Reference =
			{
				Fragments._Reference__OclAny /* 0 */,
				Fragments._Reference__OclElement /* 1 */,
				Fragments._Reference__NamedElement /* 2 */,
				Fragments._Reference__Feature /* 3 */,
				Fragments._Reference__Reference /* 4 */
			};
		private static final int /*@NonNull*/ [] __Reference = { 1,1,1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] __DataType =
			{
				Fragments.__DataType__OclAny /* 0 */,
				Fragments.__DataType__OclElement /* 1 */,
				Fragments.__DataType__OclType /* 2 */,
				Fragments.__DataType__OclEnumeration /* 3 */,
				Fragments.__DataType___DataType /* 4 */
			};
		private static final int /*@NonNull*/ [] ___DataType = { 1,1,1,1,1 };

		/**
		 *	Install the fragment descriptors in the class descriptors.
		 */
		static {
			Types._Attribute.initFragments(_Attribute, __Attribute);
			Types._Entity.initFragments(_Entity, __Entity);
			Types._Feature.initFragments(_Feature, __Feature);
			Types._Reference.initFragments(_Reference, __Reference);
			Types.__DataType.initFragments(__DataType, ___DataType);

			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of DataConcernTables::TypeFragments and all preceding sub-packages.
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

		private static final ExecutorOperation /*@NonNull*/ [] _Attribute__Attribute = {};
		private static final ExecutorOperation /*@NonNull*/ [] _Attribute__Feature = {};
		private static final ExecutorOperation /*@NonNull*/ [] _Attribute__NamedElement = {};
		private static final ExecutorOperation /*@NonNull*/ [] _Attribute__OclAny = {
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
		private static final ExecutorOperation /*@NonNull*/ [] _Attribute__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _Entity__Entity = {};
		private static final ExecutorOperation /*@NonNull*/ [] _Entity__NamedElement = {};
		private static final ExecutorOperation /*@NonNull*/ [] _Entity__OclAny = {
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
		private static final ExecutorOperation /*@NonNull*/ [] _Entity__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _Feature__Feature = {};
		private static final ExecutorOperation /*@NonNull*/ [] _Feature__NamedElement = {};
		private static final ExecutorOperation /*@NonNull*/ [] _Feature__OclAny = {
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
		private static final ExecutorOperation /*@NonNull*/ [] _Feature__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _Reference__Reference = {};
		private static final ExecutorOperation /*@NonNull*/ [] _Reference__Feature = {};
		private static final ExecutorOperation /*@NonNull*/ [] _Reference__NamedElement = {};
		private static final ExecutorOperation /*@NonNull*/ [] _Reference__OclAny = {
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
		private static final ExecutorOperation /*@NonNull*/ [] _Reference__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final ExecutorOperation /*@NonNull*/ [] __DataType___DataType = {};
		private static final ExecutorOperation /*@NonNull*/ [] __DataType__OclAny = {
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
		private static final ExecutorOperation /*@NonNull*/ [] __DataType__OclElement = {
			OCLstdlibTables.Operations._OclEnumeration__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] __DataType__OclEnumeration = {
			OCLstdlibTables.Operations._OclEnumeration__allInstances /* allInstances() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] __DataType__OclType = {
			OCLstdlibTables.Operations._OclType__conformsTo /* conformsTo(OclType[?]) */
		};

		/*
		 *	Install the operation descriptors in the fragment descriptors.
		 */
		static {
			Fragments._Attribute__Attribute.initOperations(_Attribute__Attribute);
			Fragments._Attribute__Feature.initOperations(_Attribute__Feature);
			Fragments._Attribute__NamedElement.initOperations(_Attribute__NamedElement);
			Fragments._Attribute__OclAny.initOperations(_Attribute__OclAny);
			Fragments._Attribute__OclElement.initOperations(_Attribute__OclElement);

			Fragments._Entity__Entity.initOperations(_Entity__Entity);
			Fragments._Entity__NamedElement.initOperations(_Entity__NamedElement);
			Fragments._Entity__OclAny.initOperations(_Entity__OclAny);
			Fragments._Entity__OclElement.initOperations(_Entity__OclElement);

			Fragments._Feature__Feature.initOperations(_Feature__Feature);
			Fragments._Feature__NamedElement.initOperations(_Feature__NamedElement);
			Fragments._Feature__OclAny.initOperations(_Feature__OclAny);
			Fragments._Feature__OclElement.initOperations(_Feature__OclElement);

			Fragments._Reference__Feature.initOperations(_Reference__Feature);
			Fragments._Reference__NamedElement.initOperations(_Reference__NamedElement);
			Fragments._Reference__OclAny.initOperations(_Reference__OclAny);
			Fragments._Reference__OclElement.initOperations(_Reference__OclElement);
			Fragments._Reference__Reference.initOperations(_Reference__Reference);

			Fragments.__DataType__OclAny.initOperations(__DataType__OclAny);
			Fragments.__DataType__OclElement.initOperations(__DataType__OclElement);
			Fragments.__DataType__OclEnumeration.initOperations(__DataType__OclEnumeration);
			Fragments.__DataType__OclType.initOperations(__DataType__OclType);
			Fragments.__DataType___DataType.initOperations(__DataType___DataType);

			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of DataConcernTables::FragmentOperations and all preceding sub-packages.
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

		private static final ExecutorProperty /*@NonNull*/ [] _Attribute = {
			DataConcernTables.Properties._Attribute__isPrimaryKey,
			GlotTables.Properties._NamedElement__name,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents,
			DataConcernTables.Properties._Attribute__type
		};

		private static final ExecutorProperty /*@NonNull*/ [] _Entity = {
			DataConcernTables.Properties._Entity__features,
			GlotTables.Properties._NamedElement__name,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents,
			DataConcernTables.Properties._Entity__test
		};

		private static final ExecutorProperty /*@NonNull*/ [] _Feature = {
			GlotTables.Properties._NamedElement__name,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents
		};

		private static final ExecutorProperty /*@NonNull*/ [] _Reference = {
			DataConcernTables.Properties._Reference__foreignKey,
			GlotTables.Properties._NamedElement__name,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents
		};

		private static final ExecutorProperty /*@NonNull*/ [] __DataType = {
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents
		};

		/**
		 *	Install the property descriptors in the fragment descriptors.
		 */
		static {
			Fragments._Attribute__Attribute.initProperties(_Attribute);
			Fragments._Entity__Entity.initProperties(_Entity);
			Fragments._Feature__Feature.initProperties(_Feature);
			Fragments._Reference__Reference.initProperties(_Reference);
			Fragments.__DataType___DataType.initProperties(__DataType);

			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of DataConcernTables::FragmentProperties and all preceding sub-packages.
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

		public static final EcoreExecutorEnumerationLiteral __DataType__String = new EcoreExecutorEnumerationLiteral(DataConcernPackage.Literals._DATA_TYPE.getEEnumLiteral("String"), Types.__DataType, 0);
		public static final EcoreExecutorEnumerationLiteral __DataType__int = new EcoreExecutorEnumerationLiteral(DataConcernPackage.Literals._DATA_TYPE.getEEnumLiteral("int"), Types.__DataType, 1);
		public static final EcoreExecutorEnumerationLiteral __DataType__text = new EcoreExecutorEnumerationLiteral(DataConcernPackage.Literals._DATA_TYPE.getEEnumLiteral("text"), Types.__DataType, 2);
		public static final EcoreExecutorEnumerationLiteral __DataType__boolean = new EcoreExecutorEnumerationLiteral(DataConcernPackage.Literals._DATA_TYPE.getEEnumLiteral("boolean"), Types.__DataType, 3);
		public static final EcoreExecutorEnumerationLiteral __DataType__Date = new EcoreExecutorEnumerationLiteral(DataConcernPackage.Literals._DATA_TYPE.getEEnumLiteral("Date"), Types.__DataType, 4);
		public static final EcoreExecutorEnumerationLiteral __DataType__File = new EcoreExecutorEnumerationLiteral(DataConcernPackage.Literals._DATA_TYPE.getEEnumLiteral("File"), Types.__DataType, 5);
		public static final EcoreExecutorEnumerationLiteral __DataType__currency = new EcoreExecutorEnumerationLiteral(DataConcernPackage.Literals._DATA_TYPE.getEEnumLiteral("currency"), Types.__DataType, 6);
		public static final EcoreExecutorEnumerationLiteral __DataType__percent = new EcoreExecutorEnumerationLiteral(DataConcernPackage.Literals._DATA_TYPE.getEEnumLiteral("percent"), Types.__DataType, 7);
		public static final EcoreExecutorEnumerationLiteral __DataType__image = new EcoreExecutorEnumerationLiteral(DataConcernPackage.Literals._DATA_TYPE.getEEnumLiteral("image"), Types.__DataType, 8);
		public static final EcoreExecutorEnumerationLiteral __DataType__images = new EcoreExecutorEnumerationLiteral(DataConcernPackage.Literals._DATA_TYPE.getEEnumLiteral("images"), Types.__DataType, 9);
		public static final EcoreExecutorEnumerationLiteral __DataType__double = new EcoreExecutorEnumerationLiteral(DataConcernPackage.Literals._DATA_TYPE.getEEnumLiteral("double"), Types.__DataType, 10);
		private static final EcoreExecutorEnumerationLiteral /*@NonNull*/ [] __DataType = {
			__DataType__String,
			__DataType__int,
			__DataType__text,
			__DataType__boolean,
			__DataType__Date,
			__DataType__File,
			__DataType__currency,
			__DataType__percent,
			__DataType__image,
			__DataType__images,
			__DataType__double
		};

		/**
		 *	Install the enumeration literals in the enumerations.
		 */
		static {
			Types.__DataType.initLiterals(__DataType);

			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of DataConcernTables::EnumerationLiterals and all preceding sub-packages.
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
		new DataConcernTables();
	}

	private DataConcernTables() {
		super(DataConcernPackage.eNS_URI);
	}
}
