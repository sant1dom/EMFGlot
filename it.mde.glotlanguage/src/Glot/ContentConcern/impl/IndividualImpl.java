/**
 */
package Glot.ContentConcern.impl;

import Glot.ContentConcern.ContentConcernPackage;
import Glot.ContentConcern.ContentConcernTables;
import Glot.ContentConcern.Index;
import Glot.ContentConcern.Individual;

import Glot.DataConcern.Entity;
import java.lang.reflect.InvocationTargetException;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.ocl.pivot.evaluation.Executor;
import org.eclipse.ocl.pivot.ids.IdResolver;
import org.eclipse.ocl.pivot.ids.TypeId;
import org.eclipse.ocl.pivot.library.classifier.ClassifierAllInstancesOperation;
import org.eclipse.ocl.pivot.library.collection.CollectionAsSequenceOperation;
import org.eclipse.ocl.pivot.library.collection.CollectionIncludesOperation;
import org.eclipse.ocl.pivot.library.collection.OrderedCollectionFirstOperation;
import org.eclipse.ocl.pivot.library.oclany.OclComparableLessThanEqualOperation;
import org.eclipse.ocl.pivot.library.string.CGStringGetSeverityOperation;
import org.eclipse.ocl.pivot.library.string.CGStringLogDiagnosticOperation;
import org.eclipse.ocl.pivot.utilities.PivotUtil;
import org.eclipse.ocl.pivot.utilities.ValueUtil;
import org.eclipse.ocl.pivot.values.IntegerValue;
import org.eclipse.ocl.pivot.values.InvalidValueException;
import org.eclipse.ocl.pivot.values.OrderedSetValue;
import org.eclipse.ocl.pivot.values.SequenceValue;
import org.eclipse.ocl.pivot.values.SetValue;
import org.eclipse.ocl.pivot.values.SetValue.Accumulator;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Individual</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class IndividualImpl extends DContentImpl implements Individual {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IndividualImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ContentConcernPackage.Literals.INDIVIDUAL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean SameEntityAsParent(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		final String constraintName = "Individual::SameEntityAsParent";
		try {
			/**
			 *
			 * inv SameEntityAsParent:
			 *   let severity : Integer[1] = constraintName.getSeverity()
			 *   in
			 *     if severity <= 0
			 *     then true
			 *     else
			 *       let
			 *         result : Boolean[1] = Index.allInstances()
			 *         ->select(a | a.individuals->includes(self))
			 *         ->asSequence()
			 *         ->first().entity = self.entity
			 *       in
			 *         constraintName.logDiagnostic(self, null, diagnostics, context, null, severity, result, 0)
			 *     endif
			 */
			final /*@NonInvalid*/ Executor executor = PivotUtil.getExecutor(this, context);
			final /*@NonInvalid*/ IdResolver idResolver = executor.getIdResolver();
			final /*@NonInvalid*/ IntegerValue severity_0 = CGStringGetSeverityOperation.INSTANCE.evaluate(executor, ContentConcernPackage.Literals.INDIVIDUAL___SAME_ENTITY_AS_PARENT__DIAGNOSTICCHAIN_MAP);
			final /*@NonInvalid*/ boolean le = OclComparableLessThanEqualOperation.INSTANCE.evaluate(executor, severity_0, ContentConcernTables.INT_0).booleanValue();
			/*@NonInvalid*/ boolean local_0;
			if (le) {
				local_0 = true;
			}
			else {
				/*@Caught*/ Object CAUGHT_result;
				try {
					final /*@NonInvalid*/ org.eclipse.ocl.pivot.Class TYP_Glot_c_c_ContentConcern_c_c_Index_0 = idResolver.getClass(ContentConcernTables.CLSSid_Index, null);
					final /*@NonInvalid*/ SetValue allInstances = ClassifierAllInstancesOperation.INSTANCE.evaluate(executor, ContentConcernTables.SET_CLSSid_Index, TYP_Glot_c_c_ContentConcern_c_c_Index_0);
					/*@Thrown*/ Accumulator accumulator = ValueUtil.createSetAccumulatorValue(ContentConcernTables.SET_CLSSid_Index);
					Iterator<Object> ITERATOR_a = allInstances.iterator();
					/*@NonInvalid*/ SetValue select;
					while (true) {
						if (!ITERATOR_a.hasNext()) {
							select = accumulator;
							break;
						}
						/*@NonInvalid*/ Index a = (Index)ITERATOR_a.next();
						/**
						 * a.individuals->includes(self)
						 */
						final /*@NonInvalid*/ List<Individual> individuals = a.getIndividuals();
						final /*@NonInvalid*/ OrderedSetValue BOXED_individuals = idResolver.createOrderedSetOfAll(ContentConcernTables.ORD_CLSSid_Individual, individuals);
						final /*@NonInvalid*/ boolean includes = CollectionIncludesOperation.INSTANCE.evaluate(BOXED_individuals, this).booleanValue();
						//
						if (includes) {
							accumulator.add(a);
						}
					}
					final /*@NonInvalid*/ SequenceValue asSequence = CollectionAsSequenceOperation.INSTANCE.evaluate(select);
					final /*@Thrown*/ Index first = (Index)OrderedCollectionFirstOperation.INSTANCE.evaluate(asSequence);
					if (first == null) {
						throw new InvalidValueException("Null source for \'\'https://it.mde.glotlanguage/contenConcern\'::DContent::entity\'");
					}
					final /*@Thrown*/ Entity entity = first.getEntity();
					final /*@NonInvalid*/ Entity entity_0 = this.getEntity();
					final /*@Thrown*/ boolean result = entity.equals(entity_0);
					CAUGHT_result = result;
				}
				catch (Exception e) {
					CAUGHT_result = ValueUtil.createInvalidValue(e);
				}
				final /*@NonInvalid*/ boolean logDiagnostic = CGStringLogDiagnosticOperation.INSTANCE.evaluate(executor, TypeId.BOOLEAN, constraintName, this, (Object)null, diagnostics, context, (Object)null, severity_0, CAUGHT_result, ContentConcernTables.INT_0).booleanValue();
				local_0 = logDiagnostic;
			}
			return local_0;
		}
		catch (Throwable e) {
			return ValueUtil.validationFailedDiagnostic(constraintName, this, diagnostics, context, e);
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	@SuppressWarnings("unchecked")
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case ContentConcernPackage.INDIVIDUAL___SAME_ENTITY_AS_PARENT__DIAGNOSTICCHAIN_MAP:
				return SameEntityAsParent((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
		}
		return super.eInvoke(operationID, arguments);
	}

} //IndividualImpl
