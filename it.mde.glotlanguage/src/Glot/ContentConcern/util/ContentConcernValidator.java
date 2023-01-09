/**
 */
package Glot.ContentConcern.util;

import Glot.ContentConcern.*;

import Glot.util.GlotValidator;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.EObjectValidator;

/**
 * <!-- begin-user-doc -->
 * The <b>Validator</b> for the model.
 * <!-- end-user-doc -->
 * @see Glot.ContentConcern.ContentConcernPackage
 * @generated
 */
public class ContentConcernValidator extends EObjectValidator {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final ContentConcernValidator INSTANCE = new ContentConcernValidator();

	/**
	 * A constant for the {@link org.eclipse.emf.common.util.Diagnostic#getSource() source} of diagnostic {@link org.eclipse.emf.common.util.Diagnostic#getCode() codes} from this package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.common.util.Diagnostic#getSource()
	 * @see org.eclipse.emf.common.util.Diagnostic#getCode()
	 * @generated
	 */
	public static final String DIAGNOSTIC_SOURCE = "Glot.ContentConcern";

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Only Features From Ref' of 'DContent'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int DCONTENT__ONLY_FEATURES_FROM_REF = 1;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'No Duplicates' of 'Index'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int INDEX__NO_DUPLICATES = 2;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Same Entity As Parent' of 'Individual'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int INDIVIDUAL__SAME_ENTITY_AS_PARENT = 3;

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final int GENERATED_DIAGNOSTIC_CODE_COUNT = 3;

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants in a derived class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final int DIAGNOSTIC_CODE_COUNT = GENERATED_DIAGNOSTIC_CODE_COUNT;

	/**
	 * The cached base package validator.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GlotValidator glotValidator;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ContentConcernValidator() {
		super();
		glotValidator = GlotValidator.INSTANCE;
	}

	/**
	 * Returns the package of this validator switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EPackage getEPackage() {
	  return ContentConcernPackage.eINSTANCE;
	}

	/**
	 * Calls <code>validateXXX</code> for the corresponding classifier of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected boolean validate(int classifierID, Object value, DiagnosticChain diagnostics, Map<Object, Object> context) {
		switch (classifierID) {
			case ContentConcernPackage.CONTENT:
				return validateContent((Content)value, diagnostics, context);
			case ContentConcernPackage.DCONTENT:
				return validateDContent((DContent)value, diagnostics, context);
			case ContentConcernPackage.DFORM:
				return validateDForm((DForm)value, diagnostics, context);
			case ContentConcernPackage.INDEX:
				return validateIndex((Index)value, diagnostics, context);
			case ContentConcernPackage.INDIVIDUAL:
				return validateIndividual((Individual)value, diagnostics, context);
			case ContentConcernPackage.PAGE:
				return validatePage((Page)value, diagnostics, context);
			default:
				return true;
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateContent(Content content, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(content, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(content, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(content, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(content, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(content, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(content, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(content, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(content, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(content, diagnostics, context);
		if (result || diagnostics != null) result &= glotValidator.validateNamedElement_NameNotEmpty(content, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDContent(DContent dContent, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(dContent, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(dContent, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(dContent, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(dContent, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(dContent, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(dContent, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(dContent, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(dContent, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(dContent, diagnostics, context);
		if (result || diagnostics != null) result &= glotValidator.validateNamedElement_NameNotEmpty(dContent, diagnostics, context);
		if (result || diagnostics != null) result &= validateDContent_OnlyFeaturesFromRef(dContent, diagnostics, context);
		return result;
	}

	/**
	 * Validates the OnlyFeaturesFromRef constraint of '<em>DContent</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDContent_OnlyFeaturesFromRef(DContent dContent, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return dContent.OnlyFeaturesFromRef(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDForm(DForm dForm, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(dForm, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(dForm, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(dForm, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(dForm, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(dForm, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(dForm, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(dForm, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(dForm, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(dForm, diagnostics, context);
		if (result || diagnostics != null) result &= glotValidator.validateNamedElement_NameNotEmpty(dForm, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIndex(Index index, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(index, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(index, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(index, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(index, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(index, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(index, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(index, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(index, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(index, diagnostics, context);
		if (result || diagnostics != null) result &= glotValidator.validateNamedElement_NameNotEmpty(index, diagnostics, context);
		if (result || diagnostics != null) result &= validateDContent_OnlyFeaturesFromRef(index, diagnostics, context);
		if (result || diagnostics != null) result &= validateIndex_NoDuplicates(index, diagnostics, context);
		return result;
	}

	/**
	 * Validates the NoDuplicates constraint of '<em>Index</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIndex_NoDuplicates(Index index, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return index.NoDuplicates(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIndividual(Individual individual, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(individual, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(individual, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(individual, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(individual, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(individual, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(individual, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(individual, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(individual, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(individual, diagnostics, context);
		if (result || diagnostics != null) result &= glotValidator.validateNamedElement_NameNotEmpty(individual, diagnostics, context);
		if (result || diagnostics != null) result &= validateDContent_OnlyFeaturesFromRef(individual, diagnostics, context);
		if (result || diagnostics != null) result &= validateIndividual_SameEntityAsParent(individual, diagnostics, context);
		return result;
	}

	/**
	 * Validates the SameEntityAsParent constraint of '<em>Individual</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIndividual_SameEntityAsParent(Individual individual, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return individual.SameEntityAsParent(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePage(Page page, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(page, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(page, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(page, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(page, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(page, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(page, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(page, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(page, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(page, diagnostics, context);
		if (result || diagnostics != null) result &= glotValidator.validateNamedElement_NameNotEmpty(page, diagnostics, context);
		return result;
	}

	/**
	 * Returns the resource locator that will be used to fetch messages for this validator's diagnostics.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		// TODO
		// Specialize this to return a resource locator for messages specific to this validator.
		// Ensure that you remove @generated or mark it @generated NOT
		return super.getResourceLocator();
	}

} //ContentConcernValidator
