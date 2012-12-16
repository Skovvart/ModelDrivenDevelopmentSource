/**
 */
package BDDModel;

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
 * @see BDDModel.BDDModelFactory
 * @model kind="package"
 * @generated
 */
public interface BDDModelPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "BDDModel";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "platform:/resource/BDDContracts/model/BDDModel.ecore";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "BDDModel";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	BDDModelPackage eINSTANCE = BDDModel.impl.BDDModelPackageImpl.init();

	/**
	 * The meta object id for the '{@link BDDModel.impl.ModelImpl <em>Model</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see BDDModel.impl.ModelImpl
	 * @see BDDModel.impl.BDDModelPackageImpl#getModel()
	 * @generated
	 */
	int MODEL = 0;

	/**
	 * The feature id for the '<em><b>Features</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL__FEATURES = 0;

	/**
	 * The number of structural features of the '<em>Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link BDDModel.impl.FeatureImpl <em>Feature</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see BDDModel.impl.FeatureImpl
	 * @see BDDModel.impl.BDDModelPackageImpl#getFeature()
	 * @generated
	 */
	int FEATURE = 1;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE__DESCRIPTION = 0;

	/**
	 * The feature id for the '<em><b>Summary</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE__SUMMARY = 1;

	/**
	 * The feature id for the '<em><b>Scenarios</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE__SCENARIOS = 2;

	/**
	 * The feature id for the '<em><b>Background</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE__BACKGROUND = 3;

	/**
	 * The feature id for the '<em><b>Behaviors</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE__BEHAVIORS = 4;

	/**
	 * The number of structural features of the '<em>Feature</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_FEATURE_COUNT = 5;

	/**
	 * The meta object id for the '{@link BDDModel.impl.ScenarioImpl <em>Scenario</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see BDDModel.impl.ScenarioImpl
	 * @see BDDModel.impl.BDDModelPackageImpl#getScenario()
	 * @generated
	 */
	int SCENARIO = 2;

	/**
	 * The feature id for the '<em><b>Given Blocks</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCENARIO__GIVEN_BLOCKS = 0;

	/**
	 * The feature id for the '<em><b>Then Blocks</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCENARIO__THEN_BLOCKS = 1;

	/**
	 * The feature id for the '<em><b>When Blocks</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCENARIO__WHEN_BLOCKS = 2;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCENARIO__DESCRIPTION = 3;

	/**
	 * The number of structural features of the '<em>Scenario</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCENARIO_FEATURE_COUNT = 4;

	/**
	 * The meta object id for the '{@link BDDModel.impl.ScenarioSpecificImpl <em>Scenario Specific</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see BDDModel.impl.ScenarioSpecificImpl
	 * @see BDDModel.impl.BDDModelPackageImpl#getScenarioSpecific()
	 * @generated
	 */
	int SCENARIO_SPECIFIC = 3;

	/**
	 * The feature id for the '<em><b>Given Blocks</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCENARIO_SPECIFIC__GIVEN_BLOCKS = SCENARIO__GIVEN_BLOCKS;

	/**
	 * The feature id for the '<em><b>Then Blocks</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCENARIO_SPECIFIC__THEN_BLOCKS = SCENARIO__THEN_BLOCKS;

	/**
	 * The feature id for the '<em><b>When Blocks</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCENARIO_SPECIFIC__WHEN_BLOCKS = SCENARIO__WHEN_BLOCKS;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCENARIO_SPECIFIC__DESCRIPTION = SCENARIO__DESCRIPTION;

	/**
	 * The number of structural features of the '<em>Scenario Specific</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCENARIO_SPECIFIC_FEATURE_COUNT = SCENARIO_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link BDDModel.impl.ScenarioOutlineImpl <em>Scenario Outline</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see BDDModel.impl.ScenarioOutlineImpl
	 * @see BDDModel.impl.BDDModelPackageImpl#getScenarioOutline()
	 * @generated
	 */
	int SCENARIO_OUTLINE = 4;

	/**
	 * The feature id for the '<em><b>Given Blocks</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCENARIO_OUTLINE__GIVEN_BLOCKS = SCENARIO__GIVEN_BLOCKS;

	/**
	 * The feature id for the '<em><b>Then Blocks</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCENARIO_OUTLINE__THEN_BLOCKS = SCENARIO__THEN_BLOCKS;

	/**
	 * The feature id for the '<em><b>When Blocks</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCENARIO_OUTLINE__WHEN_BLOCKS = SCENARIO__WHEN_BLOCKS;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCENARIO_OUTLINE__DESCRIPTION = SCENARIO__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Examples</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCENARIO_OUTLINE__EXAMPLES = SCENARIO_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Scenario Outline</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCENARIO_OUTLINE_FEATURE_COUNT = SCENARIO_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link BDDModel.impl.ContentImpl <em>Content</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see BDDModel.impl.ContentImpl
	 * @see BDDModel.impl.BDDModelPackageImpl#getContent()
	 * @generated
	 */
	int CONTENT = 5;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENT__VALUE = 0;

	/**
	 * The number of structural features of the '<em>Content</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENT_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link BDDModel.impl.ReferenceImpl <em>Reference</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see BDDModel.impl.ReferenceImpl
	 * @see BDDModel.impl.BDDModelPackageImpl#getReference()
	 * @generated
	 */
	int REFERENCE = 6;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCE__VALUE = CONTENT__VALUE;

	/**
	 * The number of structural features of the '<em>Reference</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCE_FEATURE_COUNT = CONTENT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link BDDModel.impl.WordImpl <em>Word</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see BDDModel.impl.WordImpl
	 * @see BDDModel.impl.BDDModelPackageImpl#getWord()
	 * @generated
	 */
	int WORD = 7;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORD__VALUE = CONTENT__VALUE;

	/**
	 * The number of structural features of the '<em>Word</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORD_FEATURE_COUNT = CONTENT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link BDDModel.impl.ExampleImpl <em>Example</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see BDDModel.impl.ExampleImpl
	 * @see BDDModel.impl.BDDModelPackageImpl#getExample()
	 * @generated
	 */
	int EXAMPLE = 8;

	/**
	 * The feature id for the '<em><b>Values</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXAMPLE__VALUES = 0;

	/**
	 * The feature id for the '<em><b>Keys</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXAMPLE__KEYS = 1;

	/**
	 * The number of structural features of the '<em>Example</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXAMPLE_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link BDDModel.impl.BackgroundImpl <em>Background</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see BDDModel.impl.BackgroundImpl
	 * @see BDDModel.impl.BDDModelPackageImpl#getBackground()
	 * @generated
	 */
	int BACKGROUND = 9;

	/**
	 * The feature id for the '<em><b>Given Blocks</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BACKGROUND__GIVEN_BLOCKS = 0;

	/**
	 * The number of structural features of the '<em>Background</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BACKGROUND_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link BDDModel.impl.BehaviorImpl <em>Behavior</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see BDDModel.impl.BehaviorImpl
	 * @see BDDModel.impl.BDDModelPackageImpl#getBehavior()
	 * @generated
	 */
	int BEHAVIOR = 10;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEHAVIOR__DESCRIPTION = 0;

	/**
	 * The feature id for the '<em><b>Requiring Blocks</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEHAVIOR__REQUIRING_BLOCKS = 1;

	/**
	 * The feature id for the '<em><b>Ensuring Blocks</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEHAVIOR__ENSURING_BLOCKS = 2;

	/**
	 * The number of structural features of the '<em>Behavior</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEHAVIOR_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link BDDModel.impl.SentenceImpl <em>Sentence</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see BDDModel.impl.SentenceImpl
	 * @see BDDModel.impl.BDDModelPackageImpl#getSentence()
	 * @generated
	 */
	int SENTENCE = 11;

	/**
	 * The feature id for the '<em><b>Words</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENTENCE__WORDS = 0;

	/**
	 * The number of structural features of the '<em>Sentence</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENTENCE_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link BDDModel.impl.ValueImpl <em>Value</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see BDDModel.impl.ValueImpl
	 * @see BDDModel.impl.BDDModelPackageImpl#getValue()
	 * @generated
	 */
	int VALUE = 12;

	/**
	 * The feature id for the '<em><b>Elements</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE__ELEMENTS = 0;

	/**
	 * The number of structural features of the '<em>Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_FEATURE_COUNT = 1;


	/**
	 * Returns the meta object for class '{@link BDDModel.Model <em>Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Model</em>'.
	 * @see BDDModel.Model
	 * @generated
	 */
	EClass getModel();

	/**
	 * Returns the meta object for the containment reference list '{@link BDDModel.Model#getFeatures <em>Features</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Features</em>'.
	 * @see BDDModel.Model#getFeatures()
	 * @see #getModel()
	 * @generated
	 */
	EReference getModel_Features();

	/**
	 * Returns the meta object for class '{@link BDDModel.Feature <em>Feature</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Feature</em>'.
	 * @see BDDModel.Feature
	 * @generated
	 */
	EClass getFeature();

	/**
	 * Returns the meta object for the attribute '{@link BDDModel.Feature#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see BDDModel.Feature#getDescription()
	 * @see #getFeature()
	 * @generated
	 */
	EAttribute getFeature_Description();

	/**
	 * Returns the meta object for the attribute '{@link BDDModel.Feature#getSummary <em>Summary</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Summary</em>'.
	 * @see BDDModel.Feature#getSummary()
	 * @see #getFeature()
	 * @generated
	 */
	EAttribute getFeature_Summary();

	/**
	 * Returns the meta object for the containment reference list '{@link BDDModel.Feature#getScenarios <em>Scenarios</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Scenarios</em>'.
	 * @see BDDModel.Feature#getScenarios()
	 * @see #getFeature()
	 * @generated
	 */
	EReference getFeature_Scenarios();

	/**
	 * Returns the meta object for the containment reference '{@link BDDModel.Feature#getBackground <em>Background</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Background</em>'.
	 * @see BDDModel.Feature#getBackground()
	 * @see #getFeature()
	 * @generated
	 */
	EReference getFeature_Background();

	/**
	 * Returns the meta object for the containment reference list '{@link BDDModel.Feature#getBehaviors <em>Behaviors</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Behaviors</em>'.
	 * @see BDDModel.Feature#getBehaviors()
	 * @see #getFeature()
	 * @generated
	 */
	EReference getFeature_Behaviors();

	/**
	 * Returns the meta object for class '{@link BDDModel.Scenario <em>Scenario</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Scenario</em>'.
	 * @see BDDModel.Scenario
	 * @generated
	 */
	EClass getScenario();

	/**
	 * Returns the meta object for the containment reference list '{@link BDDModel.Scenario#getGivenBlocks <em>Given Blocks</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Given Blocks</em>'.
	 * @see BDDModel.Scenario#getGivenBlocks()
	 * @see #getScenario()
	 * @generated
	 */
	EReference getScenario_GivenBlocks();

	/**
	 * Returns the meta object for the containment reference list '{@link BDDModel.Scenario#getThenBlocks <em>Then Blocks</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Then Blocks</em>'.
	 * @see BDDModel.Scenario#getThenBlocks()
	 * @see #getScenario()
	 * @generated
	 */
	EReference getScenario_ThenBlocks();

	/**
	 * Returns the meta object for the containment reference list '{@link BDDModel.Scenario#getWhenBlocks <em>When Blocks</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>When Blocks</em>'.
	 * @see BDDModel.Scenario#getWhenBlocks()
	 * @see #getScenario()
	 * @generated
	 */
	EReference getScenario_WhenBlocks();

	/**
	 * Returns the meta object for the attribute '{@link BDDModel.Scenario#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see BDDModel.Scenario#getDescription()
	 * @see #getScenario()
	 * @generated
	 */
	EAttribute getScenario_Description();

	/**
	 * Returns the meta object for class '{@link BDDModel.ScenarioSpecific <em>Scenario Specific</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Scenario Specific</em>'.
	 * @see BDDModel.ScenarioSpecific
	 * @generated
	 */
	EClass getScenarioSpecific();

	/**
	 * Returns the meta object for class '{@link BDDModel.ScenarioOutline <em>Scenario Outline</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Scenario Outline</em>'.
	 * @see BDDModel.ScenarioOutline
	 * @generated
	 */
	EClass getScenarioOutline();

	/**
	 * Returns the meta object for the containment reference list '{@link BDDModel.ScenarioOutline#getExamples <em>Examples</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Examples</em>'.
	 * @see BDDModel.ScenarioOutline#getExamples()
	 * @see #getScenarioOutline()
	 * @generated
	 */
	EReference getScenarioOutline_Examples();

	/**
	 * Returns the meta object for class '{@link BDDModel.Content <em>Content</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Content</em>'.
	 * @see BDDModel.Content
	 * @generated
	 */
	EClass getContent();

	/**
	 * Returns the meta object for the attribute '{@link BDDModel.Content#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see BDDModel.Content#getValue()
	 * @see #getContent()
	 * @generated
	 */
	EAttribute getContent_Value();

	/**
	 * Returns the meta object for class '{@link BDDModel.Reference <em>Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Reference</em>'.
	 * @see BDDModel.Reference
	 * @generated
	 */
	EClass getReference();

	/**
	 * Returns the meta object for class '{@link BDDModel.Word <em>Word</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Word</em>'.
	 * @see BDDModel.Word
	 * @generated
	 */
	EClass getWord();

	/**
	 * Returns the meta object for class '{@link BDDModel.Example <em>Example</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Example</em>'.
	 * @see BDDModel.Example
	 * @generated
	 */
	EClass getExample();

	/**
	 * Returns the meta object for the attribute list '{@link BDDModel.Example#getKeys <em>Keys</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Keys</em>'.
	 * @see BDDModel.Example#getKeys()
	 * @see #getExample()
	 * @generated
	 */
	EAttribute getExample_Keys();

	/**
	 * Returns the meta object for the containment reference list '{@link BDDModel.Example#getValues <em>Values</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Values</em>'.
	 * @see BDDModel.Example#getValues()
	 * @see #getExample()
	 * @generated
	 */
	EReference getExample_Values();

	/**
	 * Returns the meta object for class '{@link BDDModel.Background <em>Background</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Background</em>'.
	 * @see BDDModel.Background
	 * @generated
	 */
	EClass getBackground();

	/**
	 * Returns the meta object for the containment reference list '{@link BDDModel.Background#getGivenBlocks <em>Given Blocks</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Given Blocks</em>'.
	 * @see BDDModel.Background#getGivenBlocks()
	 * @see #getBackground()
	 * @generated
	 */
	EReference getBackground_GivenBlocks();

	/**
	 * Returns the meta object for class '{@link BDDModel.Behavior <em>Behavior</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Behavior</em>'.
	 * @see BDDModel.Behavior
	 * @generated
	 */
	EClass getBehavior();

	/**
	 * Returns the meta object for the attribute '{@link BDDModel.Behavior#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see BDDModel.Behavior#getDescription()
	 * @see #getBehavior()
	 * @generated
	 */
	EAttribute getBehavior_Description();

	/**
	 * Returns the meta object for the containment reference list '{@link BDDModel.Behavior#getRequiringBlocks <em>Requiring Blocks</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Requiring Blocks</em>'.
	 * @see BDDModel.Behavior#getRequiringBlocks()
	 * @see #getBehavior()
	 * @generated
	 */
	EReference getBehavior_RequiringBlocks();

	/**
	 * Returns the meta object for the containment reference list '{@link BDDModel.Behavior#getEnsuringBlocks <em>Ensuring Blocks</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Ensuring Blocks</em>'.
	 * @see BDDModel.Behavior#getEnsuringBlocks()
	 * @see #getBehavior()
	 * @generated
	 */
	EReference getBehavior_EnsuringBlocks();

	/**
	 * Returns the meta object for class '{@link BDDModel.Sentence <em>Sentence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sentence</em>'.
	 * @see BDDModel.Sentence
	 * @generated
	 */
	EClass getSentence();

	/**
	 * Returns the meta object for the containment reference list '{@link BDDModel.Sentence#getWords <em>Words</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Words</em>'.
	 * @see BDDModel.Sentence#getWords()
	 * @see #getSentence()
	 * @generated
	 */
	EReference getSentence_Words();

	/**
	 * Returns the meta object for class '{@link BDDModel.Value <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Value</em>'.
	 * @see BDDModel.Value
	 * @generated
	 */
	EClass getValue();

	/**
	 * Returns the meta object for the attribute list '{@link BDDModel.Value#getElements <em>Elements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Elements</em>'.
	 * @see BDDModel.Value#getElements()
	 * @see #getValue()
	 * @generated
	 */
	EAttribute getValue_Elements();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	BDDModelFactory getBDDModelFactory();

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
		 * The meta object literal for the '{@link BDDModel.impl.ModelImpl <em>Model</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see BDDModel.impl.ModelImpl
		 * @see BDDModel.impl.BDDModelPackageImpl#getModel()
		 * @generated
		 */
		EClass MODEL = eINSTANCE.getModel();

		/**
		 * The meta object literal for the '<em><b>Features</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODEL__FEATURES = eINSTANCE.getModel_Features();

		/**
		 * The meta object literal for the '{@link BDDModel.impl.FeatureImpl <em>Feature</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see BDDModel.impl.FeatureImpl
		 * @see BDDModel.impl.BDDModelPackageImpl#getFeature()
		 * @generated
		 */
		EClass FEATURE = eINSTANCE.getFeature();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FEATURE__DESCRIPTION = eINSTANCE.getFeature_Description();

		/**
		 * The meta object literal for the '<em><b>Summary</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FEATURE__SUMMARY = eINSTANCE.getFeature_Summary();

		/**
		 * The meta object literal for the '<em><b>Scenarios</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FEATURE__SCENARIOS = eINSTANCE.getFeature_Scenarios();

		/**
		 * The meta object literal for the '<em><b>Background</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FEATURE__BACKGROUND = eINSTANCE.getFeature_Background();

		/**
		 * The meta object literal for the '<em><b>Behaviors</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FEATURE__BEHAVIORS = eINSTANCE.getFeature_Behaviors();

		/**
		 * The meta object literal for the '{@link BDDModel.impl.ScenarioImpl <em>Scenario</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see BDDModel.impl.ScenarioImpl
		 * @see BDDModel.impl.BDDModelPackageImpl#getScenario()
		 * @generated
		 */
		EClass SCENARIO = eINSTANCE.getScenario();

		/**
		 * The meta object literal for the '<em><b>Given Blocks</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SCENARIO__GIVEN_BLOCKS = eINSTANCE.getScenario_GivenBlocks();

		/**
		 * The meta object literal for the '<em><b>Then Blocks</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SCENARIO__THEN_BLOCKS = eINSTANCE.getScenario_ThenBlocks();

		/**
		 * The meta object literal for the '<em><b>When Blocks</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SCENARIO__WHEN_BLOCKS = eINSTANCE.getScenario_WhenBlocks();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SCENARIO__DESCRIPTION = eINSTANCE.getScenario_Description();

		/**
		 * The meta object literal for the '{@link BDDModel.impl.ScenarioSpecificImpl <em>Scenario Specific</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see BDDModel.impl.ScenarioSpecificImpl
		 * @see BDDModel.impl.BDDModelPackageImpl#getScenarioSpecific()
		 * @generated
		 */
		EClass SCENARIO_SPECIFIC = eINSTANCE.getScenarioSpecific();

		/**
		 * The meta object literal for the '{@link BDDModel.impl.ScenarioOutlineImpl <em>Scenario Outline</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see BDDModel.impl.ScenarioOutlineImpl
		 * @see BDDModel.impl.BDDModelPackageImpl#getScenarioOutline()
		 * @generated
		 */
		EClass SCENARIO_OUTLINE = eINSTANCE.getScenarioOutline();

		/**
		 * The meta object literal for the '<em><b>Examples</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SCENARIO_OUTLINE__EXAMPLES = eINSTANCE.getScenarioOutline_Examples();

		/**
		 * The meta object literal for the '{@link BDDModel.impl.ContentImpl <em>Content</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see BDDModel.impl.ContentImpl
		 * @see BDDModel.impl.BDDModelPackageImpl#getContent()
		 * @generated
		 */
		EClass CONTENT = eINSTANCE.getContent();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTENT__VALUE = eINSTANCE.getContent_Value();

		/**
		 * The meta object literal for the '{@link BDDModel.impl.ReferenceImpl <em>Reference</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see BDDModel.impl.ReferenceImpl
		 * @see BDDModel.impl.BDDModelPackageImpl#getReference()
		 * @generated
		 */
		EClass REFERENCE = eINSTANCE.getReference();

		/**
		 * The meta object literal for the '{@link BDDModel.impl.WordImpl <em>Word</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see BDDModel.impl.WordImpl
		 * @see BDDModel.impl.BDDModelPackageImpl#getWord()
		 * @generated
		 */
		EClass WORD = eINSTANCE.getWord();

		/**
		 * The meta object literal for the '{@link BDDModel.impl.ExampleImpl <em>Example</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see BDDModel.impl.ExampleImpl
		 * @see BDDModel.impl.BDDModelPackageImpl#getExample()
		 * @generated
		 */
		EClass EXAMPLE = eINSTANCE.getExample();

		/**
		 * The meta object literal for the '<em><b>Keys</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EXAMPLE__KEYS = eINSTANCE.getExample_Keys();

		/**
		 * The meta object literal for the '<em><b>Values</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXAMPLE__VALUES = eINSTANCE.getExample_Values();

		/**
		 * The meta object literal for the '{@link BDDModel.impl.BackgroundImpl <em>Background</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see BDDModel.impl.BackgroundImpl
		 * @see BDDModel.impl.BDDModelPackageImpl#getBackground()
		 * @generated
		 */
		EClass BACKGROUND = eINSTANCE.getBackground();

		/**
		 * The meta object literal for the '<em><b>Given Blocks</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BACKGROUND__GIVEN_BLOCKS = eINSTANCE.getBackground_GivenBlocks();

		/**
		 * The meta object literal for the '{@link BDDModel.impl.BehaviorImpl <em>Behavior</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see BDDModel.impl.BehaviorImpl
		 * @see BDDModel.impl.BDDModelPackageImpl#getBehavior()
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
		 * The meta object literal for the '<em><b>Requiring Blocks</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BEHAVIOR__REQUIRING_BLOCKS = eINSTANCE.getBehavior_RequiringBlocks();

		/**
		 * The meta object literal for the '<em><b>Ensuring Blocks</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BEHAVIOR__ENSURING_BLOCKS = eINSTANCE.getBehavior_EnsuringBlocks();

		/**
		 * The meta object literal for the '{@link BDDModel.impl.SentenceImpl <em>Sentence</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see BDDModel.impl.SentenceImpl
		 * @see BDDModel.impl.BDDModelPackageImpl#getSentence()
		 * @generated
		 */
		EClass SENTENCE = eINSTANCE.getSentence();

		/**
		 * The meta object literal for the '<em><b>Words</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SENTENCE__WORDS = eINSTANCE.getSentence_Words();

		/**
		 * The meta object literal for the '{@link BDDModel.impl.ValueImpl <em>Value</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see BDDModel.impl.ValueImpl
		 * @see BDDModel.impl.BDDModelPackageImpl#getValue()
		 * @generated
		 */
		EClass VALUE = eINSTANCE.getValue();

		/**
		 * The meta object literal for the '<em><b>Elements</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VALUE__ELEMENTS = eINSTANCE.getValue_Elements();

	}

} //BDDModelPackage
