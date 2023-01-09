/**
 */
package Glot2.impl;

import Glot2.ContentConcern.Page;

import Glot2.DataConcern.Entity;

import Glot2.FormConcern.Form;

import Glot2.Glot2Package;
import Glot2.Glot2Tables;

import java.lang.reflect.InvocationTargetException;

import java.util.Collection;
import java.util.Map;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipse.ocl.pivot.evaluation.Executor;

import org.eclipse.ocl.pivot.ids.TypeId;

import org.eclipse.ocl.pivot.library.oclany.OclAnyToStringOperation;
import org.eclipse.ocl.pivot.library.oclany.OclComparableGreaterThanEqualOperation;
import org.eclipse.ocl.pivot.library.oclany.OclComparableLessThanEqualOperation;
import org.eclipse.ocl.pivot.library.oclany.OclComparableLessThanOperation;

import org.eclipse.ocl.pivot.library.string.CGStringGetSeverityOperation;
import org.eclipse.ocl.pivot.library.string.CGStringLogDiagnosticOperation;
import org.eclipse.ocl.pivot.library.string.StringConcatOperation;

import org.eclipse.ocl.pivot.utilities.PivotUtil;
import org.eclipse.ocl.pivot.utilities.ValueUtil;

import org.eclipse.ocl.pivot.values.IntegerValue;
import org.eclipse.ocl.pivot.values.TupleValue;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>System</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Glot2.impl.SystemImpl#getVersion <em>Version</em>}</li>
 *   <li>{@link Glot2.impl.SystemImpl#getSubversion <em>Subversion</em>}</li>
 *   <li>{@link Glot2.impl.SystemImpl#getEntities <em>Entities</em>}</li>
 *   <li>{@link Glot2.impl.SystemImpl#getForms <em>Forms</em>}</li>
 *   <li>{@link Glot2.impl.SystemImpl#getPages <em>Pages</em>}</li>
 *   <li>{@link Glot2.impl.SystemImpl#getFullVersion <em>Full Version</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SystemImpl extends NamedElementImpl implements Glot2.System {
	/**
	 * The default value of the '{@link #getVersion() <em>Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVersion()
	 * @generated
	 * @ordered
	 */
	protected static final int VERSION_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getVersion() <em>Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVersion()
	 * @generated
	 * @ordered
	 */
	protected int version = VERSION_EDEFAULT;

	/**
	 * The default value of the '{@link #getSubversion() <em>Subversion</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubversion()
	 * @generated
	 * @ordered
	 */
	protected static final int SUBVERSION_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getSubversion() <em>Subversion</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubversion()
	 * @generated
	 * @ordered
	 */
	protected int subversion = SUBVERSION_EDEFAULT;

	/**
	 * The cached value of the '{@link #getEntities() <em>Entities</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEntities()
	 * @generated
	 * @ordered
	 */
	protected EList<Entity> entities;

	/**
	 * The cached value of the '{@link #getForms() <em>Forms</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getForms()
	 * @generated
	 * @ordered
	 */
	protected EList<Form> forms;

	/**
	 * The cached value of the '{@link #getPages() <em>Pages</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPages()
	 * @generated
	 * @ordered
	 */
	protected EList<Page> pages;

	/**
	 * The default value of the '{@link #getFullVersion() <em>Full Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFullVersion()
	 * @generated
	 * @ordered
	 */
	protected static final String FULL_VERSION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFullVersion() <em>Full Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFullVersion()
	 * @generated
	 * @ordered
	 */
	protected String fullVersion = FULL_VERSION_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SystemImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Glot2Package.Literals.SYSTEM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getVersion() {
		return version;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVersion(int newVersion) {
		int oldVersion = version;
		version = newVersion;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Glot2Package.SYSTEM__VERSION, oldVersion, version));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getSubversion() {
		return subversion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSubversion(int newSubversion) {
		int oldSubversion = subversion;
		subversion = newSubversion;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Glot2Package.SYSTEM__SUBVERSION, oldSubversion, subversion));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Entity> getEntities() {
		if (entities == null) {
			entities = new EObjectContainmentEList<Entity>(Entity.class, this, Glot2Package.SYSTEM__ENTITIES);
		}
		return entities;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Form> getForms() {
		if (forms == null) {
			forms = new EObjectContainmentEList<Form>(Form.class, this, Glot2Package.SYSTEM__FORMS);
		}
		return forms;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Page> getPages() {
		if (pages == null) {
			pages = new EObjectContainmentEList<Page>(Page.class, this, Glot2Package.SYSTEM__PAGES);
		}
		return pages;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getFullVersion() {
		return fullVersion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFullVersion(String newFullVersion) {
		String oldFullVersion = fullVersion;
		fullVersion = newFullVersion;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Glot2Package.SYSTEM__FULL_VERSION, oldFullVersion, fullVersion));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String JoinVersion(final int version, final int subversion) {
		/**
		 *
		 * version.toString()
		 * .concat('.')
		 * .concat(subversion.toString())
		 */
		final /*@NonInvalid*/ IntegerValue BOXED_version = ValueUtil.integerValueOf(version);
		final /*@NonInvalid*/ String toString = OclAnyToStringOperation.INSTANCE.evaluate(BOXED_version);
		final /*@NonInvalid*/ String concat = StringConcatOperation.INSTANCE.evaluate(toString, Glot2Tables.STR__0);
		final /*@NonInvalid*/ IntegerValue BOXED_subversion = ValueUtil.integerValueOf(subversion);
		final /*@NonInvalid*/ String toString_0 = OclAnyToStringOperation.INSTANCE.evaluate(BOXED_subversion);
		final /*@NonInvalid*/ String concat_0 = StringConcatOperation.INSTANCE.evaluate(concat, toString_0);
		return concat_0;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean SubVersionBetweenZeroAndNine(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		final String constraintName = "System::SubVersionBetweenZeroAndNine";
		try {
			/**
			 *
			 * inv SubVersionBetweenZeroAndNine:
			 *   let severity : Integer[1] = constraintName.getSeverity()
			 *   in
			 *     if severity <= 0
			 *     then true
			 *     else
			 *       let
			 *         result : OclAny[1] = let status : Boolean[?] = self.subversion < 10 and self.subversion >= 0
			 *         in
			 *           if status = true
			 *           then true
			 *           else
			 *             Tuple{message = 'Subversion should be between zero and nine', status = status
			 *             }
			 *           endif
			 *       in
			 *         constraintName.logDiagnostic(self, null, diagnostics, context, null, severity, result, 0)
			 *     endif
			 */
			final /*@NonInvalid*/ Executor executor = PivotUtil.getExecutor(this, context);
			final /*@NonInvalid*/ IntegerValue severity_0 = CGStringGetSeverityOperation.INSTANCE.evaluate(executor, Glot2Package.Literals.SYSTEM___SUB_VERSION_BETWEEN_ZERO_AND_NINE__DIAGNOSTICCHAIN_MAP);
			final /*@NonInvalid*/ boolean le = OclComparableLessThanEqualOperation.INSTANCE.evaluate(executor, severity_0, Glot2Tables.INT_0).booleanValue();
			/*@NonInvalid*/ boolean local_2;
			if (le) {
				local_2 = true;
			}
			else {
				final /*@NonInvalid*/ int subversion_0 = this.getSubversion();
				final /*@NonInvalid*/ IntegerValue BOXED_subversion_0 = ValueUtil.integerValueOf(subversion_0);
				final /*@NonInvalid*/ boolean lt = OclComparableLessThanOperation.INSTANCE.evaluate(executor, BOXED_subversion_0, Glot2Tables.INT_10).booleanValue();
				final /*@NonInvalid*/ Boolean status;
				if (!lt) {
					status = ValueUtil.FALSE_VALUE;
				}
				else {
					final /*@NonInvalid*/ boolean ge = OclComparableGreaterThanEqualOperation.INSTANCE.evaluate(executor, BOXED_subversion_0, Glot2Tables.INT_0).booleanValue();
					if (!ge) {
						status = ValueUtil.FALSE_VALUE;
					}
					else {
						status = ValueUtil.TRUE_VALUE;
					}
				}
				final /*@NonInvalid*/ boolean eq = status == Boolean.TRUE;
				/*@NonInvalid*/ Object local_1;
				if (eq) {
					local_1 = ValueUtil.TRUE_VALUE;
				}
				else {
					final /*@NonInvalid*/ TupleValue local_0 = ValueUtil.createTupleOfEach(Glot2Tables.TUPLid_, Glot2Tables.STR_Subversion_32_should_32_be_32_between_32_zero_32_and_32_nine, status);
					local_1 = local_0;
				}
				final /*@NonInvalid*/ boolean logDiagnostic = CGStringLogDiagnosticOperation.INSTANCE.evaluate(executor, TypeId.BOOLEAN, constraintName, this, (Object)null, diagnostics, context, (Object)null, severity_0, local_1, Glot2Tables.INT_0).booleanValue();
				local_2 = logDiagnostic;
			}
			return local_2;
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
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Glot2Package.SYSTEM__ENTITIES:
				return ((InternalEList<?>)getEntities()).basicRemove(otherEnd, msgs);
			case Glot2Package.SYSTEM__FORMS:
				return ((InternalEList<?>)getForms()).basicRemove(otherEnd, msgs);
			case Glot2Package.SYSTEM__PAGES:
				return ((InternalEList<?>)getPages()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Glot2Package.SYSTEM__VERSION:
				return getVersion();
			case Glot2Package.SYSTEM__SUBVERSION:
				return getSubversion();
			case Glot2Package.SYSTEM__ENTITIES:
				return getEntities();
			case Glot2Package.SYSTEM__FORMS:
				return getForms();
			case Glot2Package.SYSTEM__PAGES:
				return getPages();
			case Glot2Package.SYSTEM__FULL_VERSION:
				return getFullVersion();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case Glot2Package.SYSTEM__VERSION:
				setVersion((Integer)newValue);
				return;
			case Glot2Package.SYSTEM__SUBVERSION:
				setSubversion((Integer)newValue);
				return;
			case Glot2Package.SYSTEM__ENTITIES:
				getEntities().clear();
				getEntities().addAll((Collection<? extends Entity>)newValue);
				return;
			case Glot2Package.SYSTEM__FORMS:
				getForms().clear();
				getForms().addAll((Collection<? extends Form>)newValue);
				return;
			case Glot2Package.SYSTEM__PAGES:
				getPages().clear();
				getPages().addAll((Collection<? extends Page>)newValue);
				return;
			case Glot2Package.SYSTEM__FULL_VERSION:
				setFullVersion((String)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case Glot2Package.SYSTEM__VERSION:
				setVersion(VERSION_EDEFAULT);
				return;
			case Glot2Package.SYSTEM__SUBVERSION:
				setSubversion(SUBVERSION_EDEFAULT);
				return;
			case Glot2Package.SYSTEM__ENTITIES:
				getEntities().clear();
				return;
			case Glot2Package.SYSTEM__FORMS:
				getForms().clear();
				return;
			case Glot2Package.SYSTEM__PAGES:
				getPages().clear();
				return;
			case Glot2Package.SYSTEM__FULL_VERSION:
				setFullVersion(FULL_VERSION_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case Glot2Package.SYSTEM__VERSION:
				return version != VERSION_EDEFAULT;
			case Glot2Package.SYSTEM__SUBVERSION:
				return subversion != SUBVERSION_EDEFAULT;
			case Glot2Package.SYSTEM__ENTITIES:
				return entities != null && !entities.isEmpty();
			case Glot2Package.SYSTEM__FORMS:
				return forms != null && !forms.isEmpty();
			case Glot2Package.SYSTEM__PAGES:
				return pages != null && !pages.isEmpty();
			case Glot2Package.SYSTEM__FULL_VERSION:
				return FULL_VERSION_EDEFAULT == null ? fullVersion != null : !FULL_VERSION_EDEFAULT.equals(fullVersion);
		}
		return super.eIsSet(featureID);
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
			case Glot2Package.SYSTEM___JOIN_VERSION__INT_INT:
				return JoinVersion((Integer)arguments.get(0), (Integer)arguments.get(1));
			case Glot2Package.SYSTEM___SUB_VERSION_BETWEEN_ZERO_AND_NINE__DIAGNOSTICCHAIN_MAP:
				return SubVersionBetweenZeroAndNine((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
		}
		return super.eInvoke(operationID, arguments);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (version: ");
		result.append(version);
		result.append(", subversion: ");
		result.append(subversion);
		result.append(", fullVersion: ");
		result.append(fullVersion);
		result.append(')');
		return result.toString();
	}

} //SystemImpl
