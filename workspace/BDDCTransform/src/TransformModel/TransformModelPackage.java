/**
 */
package TransformModel;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see TransformModel.TransformModelFactory
 * @model kind="package"
 * @generated
 */
public interface TransformModelPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "TransformModel";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "platform:/resource/BDDCTransform/model/TransformModel.ecore";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "TransformModel";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	TransformModelPackage eINSTANCE = TransformModel.impl.TransformModelPackageImpl.init();

	/**
	 * The meta object id for the '{@link TransformModel.impl.TransformModel_Impl <em>Transform Model </em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see TransformModel.impl.TransformModel_Impl
	 * @see TransformModel.impl.TransformModelPackageImpl#getTransformModel_()
	 * @generated
	 */
	int TRANSFORM_MODEL_ = 0;

	/**
	 * The feature id for the '<em><b>Behaviors</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORM_MODEL___BEHAVIORS = 0;

	/**
	 * The feature id for the '<em><b>Rules</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORM_MODEL___RULES = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORM_MODEL___NAME = 2;

	/**
	 * The number of structural features of the '<em>Transform Model </em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORM_MODEL__FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link TransformModel.impl.BehaviorImpl <em>Behavior</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see TransformModel.impl.BehaviorImpl
	 * @see TransformModel.impl.TransformModelPackageImpl#getBehavior()
	 * @generated
	 */
	int BEHAVIOR = 1;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEHAVIOR__DESCRIPTION = 0;

	/**
	 * The feature id for the '<em><b>Signature</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEHAVIOR__SIGNATURE = 1;

	/**
	 * The feature id for the '<em><b>Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEHAVIOR__CLASS = 2;

	/**
	 * The number of structural features of the '<em>Behavior</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEHAVIOR_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link TransformModel.impl.RuleImpl <em>Rule</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see TransformModel.impl.RuleImpl
	 * @see TransformModel.impl.TransformModelPackageImpl#getRule()
	 * @generated
	 */
	int RULE = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE__NAME = 0;

	/**
	 * The feature id for the '<em><b>Patterns</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE__PATTERNS = 1;

	/**
	 * The feature id for the '<em><b>Transformation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE__TRANSFORMATION = 2;

	/**
	 * The number of structural features of the '<em>Rule</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link TransformModel.Pattern <em>Pattern</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see TransformModel.Pattern
	 * @see TransformModel.impl.TransformModelPackageImpl#getPattern()
	 * @generated
	 */
	int PATTERN = 3;

	/**
	 * The number of structural features of the '<em>Pattern</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link TransformModel.impl.ExactStingImpl <em>Exact Sting</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see TransformModel.impl.ExactStingImpl
	 * @see TransformModel.impl.TransformModelPackageImpl#getExactSting()
	 * @generated
	 */
	int EXACT_STING = 4;

	/**
	 * The feature id for the '<em><b>Content</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXACT_STING__CONTENT = PATTERN_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Exact Sting</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXACT_STING_FEATURE_COUNT = PATTERN_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link TransformModel.impl.VariableImpl <em>Variable</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see TransformModel.impl.VariableImpl
	 * @see TransformModel.impl.TransformModelPackageImpl#getVariable()
	 * @generated
	 */
	int VARIABLE = 5;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE__NAME = PATTERN_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Variable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_FEATURE_COUNT = PATTERN_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link TransformModel.impl.AlternationImpl <em>Alternation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see TransformModel.impl.AlternationImpl
	 * @see TransformModel.impl.TransformModelPackageImpl#getAlternation()
	 * @generated
	 */
	int ALTERNATION = 6;

	/**
	 * The feature id for the '<em><b>Choices</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALTERNATION__CHOICES = PATTERN_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Alternation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALTERNATION_FEATURE_COUNT = PATTERN_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link TransformModel.impl.OptionalImpl <em>Optional</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see TransformModel.impl.OptionalImpl
	 * @see TransformModel.impl.TransformModelPackageImpl#getOptional()
	 * @generated
	 */
	int OPTIONAL = 7;

	/**
	 * The feature id for the '<em><b>Value</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPTIONAL__VALUE = PATTERN_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Optional</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPTIONAL_FEATURE_COUNT = PATTERN_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link TransformModel.Transformation <em>Transformation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see TransformModel.Transformation
	 * @see TransformModel.impl.TransformModelPackageImpl#getTransformation()
	 * @generated
	 */
	int TRANSFORMATION = 8;

	/**
	 * The number of structural features of the '<em>Transformation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORMATION_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link TransformModel.impl.ExpressionImpl <em>Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see TransformModel.impl.ExpressionImpl
	 * @see TransformModel.impl.TransformModelPackageImpl#getExpression()
	 * @generated
	 */
	int EXPRESSION = 9;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION__VALUE = TRANSFORMATION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION_FEATURE_COUNT = TRANSFORMATION_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link TransformModel.impl.IfDefImpl <em>If Def</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see TransformModel.impl.IfDefImpl
	 * @see TransformModel.impl.TransformModelPackageImpl#getIfDef()
	 * @generated
	 */
	int IF_DEF = 10;

	/**
	 * The feature id for the '<em><b>Variables</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IF_DEF__VARIABLES = TRANSFORMATION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>True body</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IF_DEF__TRUE_BODY = TRANSFORMATION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>False body</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IF_DEF__FALSE_BODY = TRANSFORMATION_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>If Def</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IF_DEF_FEATURE_COUNT = TRANSFORMATION_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link TransformModel.impl.MatchImpl <em>Match</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see TransformModel.impl.MatchImpl
	 * @see TransformModel.impl.TransformModelPackageImpl#getMatch()
	 * @generated
	 */
	int MATCH = 11;

	/**
	 * The feature id for the '<em><b>Rule</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MATCH__RULE = TRANSFORMATION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Assignments</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MATCH__ASSIGNMENTS = TRANSFORMATION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Match</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MATCH_FEATURE_COUNT = TRANSFORMATION_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link TransformModel.impl.KeyValueImpl <em>Key Value</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see TransformModel.impl.KeyValueImpl
	 * @see TransformModel.impl.TransformModelPackageImpl#getKeyValue()
	 * @generated
	 */
	int KEY_VALUE = 12;

	/**
	 * The feature id for the '<em><b>Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KEY_VALUE__KEY = 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KEY_VALUE__VALUE = 1;

	/**
	 * The number of structural features of the '<em>Key Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KEY_VALUE_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link TransformModel.impl.FailImpl <em>Fail</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see TransformModel.impl.FailImpl
	 * @see TransformModel.impl.TransformModelPackageImpl#getFail()
	 * @generated
	 */
	int FAIL = 13;

	/**
	 * The feature id for the '<em><b>Message</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAIL__MESSAGE = TRANSFORMATION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Fail</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAIL_FEATURE_COUNT = TRANSFORMATION_FEATURE_COUNT + 1;


	/**
	 * Returns the meta object for class '{@link TransformModel.TransformModel_ <em>Transform Model </em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Transform Model </em>'.
	 * @see TransformModel.TransformModel_
	 * @generated
	 */
	EClass getTransformModel_();

	/**
	 * Returns the meta object for the containment reference list '{@link TransformModel.TransformModel_#getBehaviors <em>Behaviors</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Behaviors</em>'.
	 * @see TransformModel.TransformModel_#getBehaviors()
	 * @see #getTransformModel_()
	 * @generated
	 */
	EReference getTransformModel__Behaviors();

	/**
	 * Returns the meta object for the containment reference list '{@link TransformModel.TransformModel_#getRules <em>Rules</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Rules</em>'.
	 * @see TransformModel.TransformModel_#getRules()
	 * @see #getTransformModel_()
	 * @generated
	 */
	EReference getTransformModel__Rules();

	/**
	 * Returns the meta object for the attribute '{@link TransformModel.TransformModel_#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see TransformModel.TransformModel_#getName()
	 * @see #getTransformModel_()
	 * @generated
	 */
	EAttribute getTransformModel__Name();

	/**
	 * Returns the meta object for class '{@link TransformModel.Behavior <em>Behavior</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Behavior</em>'.
	 * @see TransformModel.Behavior
	 * @generated
	 */
	EClass getBehavior();

	/**
	 * Returns the meta object for the attribute '{@link TransformModel.Behavior#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see TransformModel.Behavior#getDescription()
	 * @see #getBehavior()
	 * @generated
	 */
	EAttribute getBehavior_Description();

	/**
	 * Returns the meta object for the attribute '{@link TransformModel.Behavior#getSignature <em>Signature</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Signature</em>'.
	 * @see TransformModel.Behavior#getSignature()
	 * @see #getBehavior()
	 * @generated
	 */
	EAttribute getBehavior_Signature();

	/**
	 * Returns the meta object for the attribute '{@link TransformModel.Behavior#getClass_ <em>Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Class</em>'.
	 * @see TransformModel.Behavior#getClass_()
	 * @see #getBehavior()
	 * @generated
	 */
	EAttribute getBehavior_Class();

	/**
	 * Returns the meta object for class '{@link TransformModel.Rule <em>Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Rule</em>'.
	 * @see TransformModel.Rule
	 * @generated
	 */
	EClass getRule();

	/**
	 * Returns the meta object for the attribute '{@link TransformModel.Rule#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see TransformModel.Rule#getName()
	 * @see #getRule()
	 * @generated
	 */
	EAttribute getRule_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link TransformModel.Rule#getPatterns <em>Patterns</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Patterns</em>'.
	 * @see TransformModel.Rule#getPatterns()
	 * @see #getRule()
	 * @generated
	 */
	EReference getRule_Patterns();

	/**
	 * Returns the meta object for the containment reference '{@link TransformModel.Rule#getTransformation <em>Transformation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Transformation</em>'.
	 * @see TransformModel.Rule#getTransformation()
	 * @see #getRule()
	 * @generated
	 */
	EReference getRule_Transformation();

	/**
	 * Returns the meta object for class '{@link TransformModel.Pattern <em>Pattern</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Pattern</em>'.
	 * @see TransformModel.Pattern
	 * @generated
	 */
	EClass getPattern();

	/**
	 * Returns the meta object for class '{@link TransformModel.ExactSting <em>Exact Sting</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Exact Sting</em>'.
	 * @see TransformModel.ExactSting
	 * @generated
	 */
	EClass getExactSting();

	/**
	 * Returns the meta object for the attribute '{@link TransformModel.ExactSting#getContent <em>Content</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Content</em>'.
	 * @see TransformModel.ExactSting#getContent()
	 * @see #getExactSting()
	 * @generated
	 */
	EAttribute getExactSting_Content();

	/**
	 * Returns the meta object for class '{@link TransformModel.Variable <em>Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Variable</em>'.
	 * @see TransformModel.Variable
	 * @generated
	 */
	EClass getVariable();

	/**
	 * Returns the meta object for the attribute '{@link TransformModel.Variable#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see TransformModel.Variable#getName()
	 * @see #getVariable()
	 * @generated
	 */
	EAttribute getVariable_Name();

	/**
	 * Returns the meta object for class '{@link TransformModel.Alternation <em>Alternation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Alternation</em>'.
	 * @see TransformModel.Alternation
	 * @generated
	 */
	EClass getAlternation();

	/**
	 * Returns the meta object for the containment reference list '{@link TransformModel.Alternation#getChoices <em>Choices</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Choices</em>'.
	 * @see TransformModel.Alternation#getChoices()
	 * @see #getAlternation()
	 * @generated
	 */
	EReference getAlternation_Choices();

	/**
	 * Returns the meta object for class '{@link TransformModel.Optional <em>Optional</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Optional</em>'.
	 * @see TransformModel.Optional
	 * @generated
	 */
	EClass getOptional();

	/**
	 * Returns the meta object for the containment reference list '{@link TransformModel.Optional#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Value</em>'.
	 * @see TransformModel.Optional#getValue()
	 * @see #getOptional()
	 * @generated
	 */
	EReference getOptional_Value();

	/**
	 * Returns the meta object for class '{@link TransformModel.Transformation <em>Transformation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Transformation</em>'.
	 * @see TransformModel.Transformation
	 * @generated
	 */
	EClass getTransformation();

	/**
	 * Returns the meta object for class '{@link TransformModel.Expression <em>Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Expression</em>'.
	 * @see TransformModel.Expression
	 * @generated
	 */
	EClass getExpression();

	/**
	 * Returns the meta object for the attribute '{@link TransformModel.Expression#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see TransformModel.Expression#getValue()
	 * @see #getExpression()
	 * @generated
	 */
	EAttribute getExpression_Value();

	/**
	 * Returns the meta object for class '{@link TransformModel.IfDef <em>If Def</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>If Def</em>'.
	 * @see TransformModel.IfDef
	 * @generated
	 */
	EClass getIfDef();

	/**
	 * Returns the meta object for the attribute list '{@link TransformModel.IfDef#getVariables <em>Variables</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Variables</em>'.
	 * @see TransformModel.IfDef#getVariables()
	 * @see #getIfDef()
	 * @generated
	 */
	EAttribute getIfDef_Variables();

	/**
	 * Returns the meta object for the containment reference '{@link TransformModel.IfDef#getTrue_body <em>True body</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>True body</em>'.
	 * @see TransformModel.IfDef#getTrue_body()
	 * @see #getIfDef()
	 * @generated
	 */
	EReference getIfDef_True_body();

	/**
	 * Returns the meta object for the containment reference '{@link TransformModel.IfDef#getFalse_body <em>False body</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>False body</em>'.
	 * @see TransformModel.IfDef#getFalse_body()
	 * @see #getIfDef()
	 * @generated
	 */
	EReference getIfDef_False_body();

	/**
	 * Returns the meta object for class '{@link TransformModel.Match <em>Match</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Match</em>'.
	 * @see TransformModel.Match
	 * @generated
	 */
	EClass getMatch();

	/**
	 * Returns the meta object for the reference '{@link TransformModel.Match#getRule <em>Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Rule</em>'.
	 * @see TransformModel.Match#getRule()
	 * @see #getMatch()
	 * @generated
	 */
	EReference getMatch_Rule();

	/**
	 * Returns the meta object for the containment reference list '{@link TransformModel.Match#getAssignments <em>Assignments</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Assignments</em>'.
	 * @see TransformModel.Match#getAssignments()
	 * @see #getMatch()
	 * @generated
	 */
	EReference getMatch_Assignments();

	/**
	 * Returns the meta object for class '{@link TransformModel.KeyValue <em>Key Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Key Value</em>'.
	 * @see TransformModel.KeyValue
	 * @generated
	 */
	EClass getKeyValue();

	/**
	 * Returns the meta object for the attribute '{@link TransformModel.KeyValue#getKey <em>Key</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Key</em>'.
	 * @see TransformModel.KeyValue#getKey()
	 * @see #getKeyValue()
	 * @generated
	 */
	EAttribute getKeyValue_Key();

	/**
	 * Returns the meta object for the attribute '{@link TransformModel.KeyValue#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see TransformModel.KeyValue#getValue()
	 * @see #getKeyValue()
	 * @generated
	 */
	EAttribute getKeyValue_Value();

	/**
	 * Returns the meta object for class '{@link TransformModel.Fail <em>Fail</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Fail</em>'.
	 * @see TransformModel.Fail
	 * @generated
	 */
	EClass getFail();

	/**
	 * Returns the meta object for the attribute '{@link TransformModel.Fail#getMessage <em>Message</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Message</em>'.
	 * @see TransformModel.Fail#getMessage()
	 * @see #getFail()
	 * @generated
	 */
	EAttribute getFail_Message();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	TransformModelFactory getTransformModelFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link TransformModel.impl.TransformModel_Impl <em>Transform Model </em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see TransformModel.impl.TransformModel_Impl
		 * @see TransformModel.impl.TransformModelPackageImpl#getTransformModel_()
		 * @generated
		 */
		EClass TRANSFORM_MODEL_ = eINSTANCE.getTransformModel_();

		/**
		 * The meta object literal for the '<em><b>Behaviors</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRANSFORM_MODEL___BEHAVIORS = eINSTANCE.getTransformModel__Behaviors();

		/**
		 * The meta object literal for the '<em><b>Rules</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRANSFORM_MODEL___RULES = eINSTANCE.getTransformModel__Rules();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRANSFORM_MODEL___NAME = eINSTANCE.getTransformModel__Name();

		/**
		 * The meta object literal for the '{@link TransformModel.impl.BehaviorImpl <em>Behavior</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see TransformModel.impl.BehaviorImpl
		 * @see TransformModel.impl.TransformModelPackageImpl#getBehavior()
		 * @generated
		 */
		EClass BEHAVIOR = eINSTANCE.getBehavior();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BEHAVIOR__DESCRIPTION = eINSTANCE.getBehavior_Description();

		/**
		 * The meta object literal for the '<em><b>Signature</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BEHAVIOR__SIGNATURE = eINSTANCE.getBehavior_Signature();

		/**
		 * The meta object literal for the '<em><b>Class</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BEHAVIOR__CLASS = eINSTANCE.getBehavior_Class();

		/**
		 * The meta object literal for the '{@link TransformModel.impl.RuleImpl <em>Rule</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see TransformModel.impl.RuleImpl
		 * @see TransformModel.impl.TransformModelPackageImpl#getRule()
		 * @generated
		 */
		EClass RULE = eINSTANCE.getRule();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RULE__NAME = eINSTANCE.getRule_Name();

		/**
		 * The meta object literal for the '<em><b>Patterns</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RULE__PATTERNS = eINSTANCE.getRule_Patterns();

		/**
		 * The meta object literal for the '<em><b>Transformation</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RULE__TRANSFORMATION = eINSTANCE.getRule_Transformation();

		/**
		 * The meta object literal for the '{@link TransformModel.Pattern <em>Pattern</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see TransformModel.Pattern
		 * @see TransformModel.impl.TransformModelPackageImpl#getPattern()
		 * @generated
		 */
		EClass PATTERN = eINSTANCE.getPattern();

		/**
		 * The meta object literal for the '{@link TransformModel.impl.ExactStingImpl <em>Exact Sting</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see TransformModel.impl.ExactStingImpl
		 * @see TransformModel.impl.TransformModelPackageImpl#getExactSting()
		 * @generated
		 */
		EClass EXACT_STING = eINSTANCE.getExactSting();

		/**
		 * The meta object literal for the '<em><b>Content</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EXACT_STING__CONTENT = eINSTANCE.getExactSting_Content();

		/**
		 * The meta object literal for the '{@link TransformModel.impl.VariableImpl <em>Variable</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see TransformModel.impl.VariableImpl
		 * @see TransformModel.impl.TransformModelPackageImpl#getVariable()
		 * @generated
		 */
		EClass VARIABLE = eINSTANCE.getVariable();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VARIABLE__NAME = eINSTANCE.getVariable_Name();

		/**
		 * The meta object literal for the '{@link TransformModel.impl.AlternationImpl <em>Alternation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see TransformModel.impl.AlternationImpl
		 * @see TransformModel.impl.TransformModelPackageImpl#getAlternation()
		 * @generated
		 */
		EClass ALTERNATION = eINSTANCE.getAlternation();

		/**
		 * The meta object literal for the '<em><b>Choices</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ALTERNATION__CHOICES = eINSTANCE.getAlternation_Choices();

		/**
		 * The meta object literal for the '{@link TransformModel.impl.OptionalImpl <em>Optional</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see TransformModel.impl.OptionalImpl
		 * @see TransformModel.impl.TransformModelPackageImpl#getOptional()
		 * @generated
		 */
		EClass OPTIONAL = eINSTANCE.getOptional();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OPTIONAL__VALUE = eINSTANCE.getOptional_Value();

		/**
		 * The meta object literal for the '{@link TransformModel.Transformation <em>Transformation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see TransformModel.Transformation
		 * @see TransformModel.impl.TransformModelPackageImpl#getTransformation()
		 * @generated
		 */
		EClass TRANSFORMATION = eINSTANCE.getTransformation();

		/**
		 * The meta object literal for the '{@link TransformModel.impl.ExpressionImpl <em>Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see TransformModel.impl.ExpressionImpl
		 * @see TransformModel.impl.TransformModelPackageImpl#getExpression()
		 * @generated
		 */
		EClass EXPRESSION = eINSTANCE.getExpression();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EXPRESSION__VALUE = eINSTANCE.getExpression_Value();

		/**
		 * The meta object literal for the '{@link TransformModel.impl.IfDefImpl <em>If Def</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see TransformModel.impl.IfDefImpl
		 * @see TransformModel.impl.TransformModelPackageImpl#getIfDef()
		 * @generated
		 */
		EClass IF_DEF = eINSTANCE.getIfDef();

		/**
		 * The meta object literal for the '<em><b>Variables</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute IF_DEF__VARIABLES = eINSTANCE.getIfDef_Variables();

		/**
		 * The meta object literal for the '<em><b>True body</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IF_DEF__TRUE_BODY = eINSTANCE.getIfDef_True_body();

		/**
		 * The meta object literal for the '<em><b>False body</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IF_DEF__FALSE_BODY = eINSTANCE.getIfDef_False_body();

		/**
		 * The meta object literal for the '{@link TransformModel.impl.MatchImpl <em>Match</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see TransformModel.impl.MatchImpl
		 * @see TransformModel.impl.TransformModelPackageImpl#getMatch()
		 * @generated
		 */
		EClass MATCH = eINSTANCE.getMatch();

		/**
		 * The meta object literal for the '<em><b>Rule</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MATCH__RULE = eINSTANCE.getMatch_Rule();

		/**
		 * The meta object literal for the '<em><b>Assignments</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MATCH__ASSIGNMENTS = eINSTANCE.getMatch_Assignments();

		/**
		 * The meta object literal for the '{@link TransformModel.impl.KeyValueImpl <em>Key Value</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see TransformModel.impl.KeyValueImpl
		 * @see TransformModel.impl.TransformModelPackageImpl#getKeyValue()
		 * @generated
		 */
		EClass KEY_VALUE = eINSTANCE.getKeyValue();

		/**
		 * The meta object literal for the '<em><b>Key</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute KEY_VALUE__KEY = eINSTANCE.getKeyValue_Key();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute KEY_VALUE__VALUE = eINSTANCE.getKeyValue_Value();

		/**
		 * The meta object literal for the '{@link TransformModel.impl.FailImpl <em>Fail</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see TransformModel.impl.FailImpl
		 * @see TransformModel.impl.TransformModelPackageImpl#getFail()
		 * @generated
		 */
		EClass FAIL = eINSTANCE.getFail();

		/**
		 * The meta object literal for the '<em><b>Message</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FAIL__MESSAGE = eINSTANCE.getFail_Message();

	}

} //TransformModelPackage
