/**
 */
package TransformModel.impl;

import TransformModel.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class TransformModelFactoryImpl extends EFactoryImpl implements TransformModelFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static TransformModelFactory init() {
		try {
			TransformModelFactory theTransformModelFactory = (TransformModelFactory)EPackage.Registry.INSTANCE.getEFactory("platform:/resource/BDDCTransform/model/TransformModel.ecore"); 
			if (theTransformModelFactory != null) {
				return theTransformModelFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new TransformModelFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TransformModelFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case TransformModelPackage.TRANSFORM_MODEL_: return createTransformModel_();
			case TransformModelPackage.BEHAVIOR: return createBehavior();
			case TransformModelPackage.RULE: return createRule();
			case TransformModelPackage.EXACT_STING: return createExactSting();
			case TransformModelPackage.VARIABLE: return createVariable();
			case TransformModelPackage.ALTERNATION: return createAlternation();
			case TransformModelPackage.OPTIONAL: return createOptional();
			case TransformModelPackage.EXPRESSION: return createExpression();
			case TransformModelPackage.IF_DEF: return createIfDef();
			case TransformModelPackage.MATCH: return createMatch();
			case TransformModelPackage.KEY_VALUE: return createKeyValue();
			case TransformModelPackage.FAIL: return createFail();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TransformModel_ createTransformModel_() {
		TransformModel_Impl transformModel_ = new TransformModel_Impl();
		return transformModel_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Behavior createBehavior() {
		BehaviorImpl behavior = new BehaviorImpl();
		return behavior;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Rule createRule() {
		RuleImpl rule = new RuleImpl();
		return rule;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExactSting createExactSting() {
		ExactStingImpl exactSting = new ExactStingImpl();
		return exactSting;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Variable createVariable() {
		VariableImpl variable = new VariableImpl();
		return variable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Alternation createAlternation() {
		AlternationImpl alternation = new AlternationImpl();
		return alternation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Optional createOptional() {
		OptionalImpl optional = new OptionalImpl();
		return optional;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Expression createExpression() {
		ExpressionImpl expression = new ExpressionImpl();
		return expression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfDef createIfDef() {
		IfDefImpl ifDef = new IfDefImpl();
		return ifDef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Match createMatch() {
		MatchImpl match = new MatchImpl();
		return match;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public KeyValue createKeyValue() {
		KeyValueImpl keyValue = new KeyValueImpl();
		return keyValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Fail createFail() {
		FailImpl fail = new FailImpl();
		return fail;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TransformModelPackage getTransformModelPackage() {
		return (TransformModelPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static TransformModelPackage getPackage() {
		return TransformModelPackage.eINSTANCE;
	}

} //TransformModelFactoryImpl
