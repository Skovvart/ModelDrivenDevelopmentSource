/**
 */
package SimplifiedJML;

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
 * @see SimplifiedJML.SimplifiedJMLFactory
 * @model kind="package"
 * @generated
 */
public interface SimplifiedJMLPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "SimplifiedJML";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "platform:/resource/SimplifiedJML/model/SimplifiedJMLModel.ecore";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "SimplifiedJML";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	SimplifiedJMLPackage eINSTANCE = SimplifiedJML.impl.SimplifiedJMLPackageImpl.init();

	/**
	 * The meta object id for the '{@link SimplifiedJML.impl.SimplifiedJMLModelImpl <em>Model</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see SimplifiedJML.impl.SimplifiedJMLModelImpl
	 * @see SimplifiedJML.impl.SimplifiedJMLPackageImpl#getSimplifiedJMLModel()
	 * @generated
	 */
	int SIMPLIFIED_JML_MODEL = 0;

	/**
	 * The feature id for the '<em><b>Structures</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLIFIED_JML_MODEL__STRUCTURES = 0;

	/**
	 * The number of structural features of the '<em>Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLIFIED_JML_MODEL_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link SimplifiedJML.impl.StructureImpl <em>Structure</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see SimplifiedJML.impl.StructureImpl
	 * @see SimplifiedJML.impl.SimplifiedJMLPackageImpl#getStructure()
	 * @generated
	 */
	int STRUCTURE = 1;

	/**
	 * The feature id for the '<em><b>Methods</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURE__METHODS = 0;

	/**
	 * The feature id for the '<em><b>Invariants</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURE__INVARIANTS = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURE__NAME = 2;

	/**
	 * The number of structural features of the '<em>Structure</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURE_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link SimplifiedJML.impl.MethodImpl <em>Method</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see SimplifiedJML.impl.MethodImpl
	 * @see SimplifiedJML.impl.SimplifiedJMLPackageImpl#getMethod()
	 * @generated
	 */
	int METHOD = 2;

	/**
	 * The feature id for the '<em><b>Signature</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD__SIGNATURE = 0;

	/**
	 * The feature id for the '<em><b>Ensures</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD__ENSURES = 1;

	/**
	 * The feature id for the '<em><b>Requirements</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD__REQUIREMENTS = 2;

	/**
	 * The number of structural features of the '<em>Method</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD_FEATURE_COUNT = 3;


	/**
	 * Returns the meta object for class '{@link SimplifiedJML.SimplifiedJMLModel <em>Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Model</em>'.
	 * @see SimplifiedJML.SimplifiedJMLModel
	 * @generated
	 */
	EClass getSimplifiedJMLModel();

	/**
	 * Returns the meta object for the containment reference list '{@link SimplifiedJML.SimplifiedJMLModel#getStructures <em>Structures</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Structures</em>'.
	 * @see SimplifiedJML.SimplifiedJMLModel#getStructures()
	 * @see #getSimplifiedJMLModel()
	 * @generated
	 */
	EReference getSimplifiedJMLModel_Structures();

	/**
	 * Returns the meta object for class '{@link SimplifiedJML.Structure <em>Structure</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Structure</em>'.
	 * @see SimplifiedJML.Structure
	 * @generated
	 */
	EClass getStructure();

	/**
	 * Returns the meta object for the containment reference list '{@link SimplifiedJML.Structure#getMethods <em>Methods</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Methods</em>'.
	 * @see SimplifiedJML.Structure#getMethods()
	 * @see #getStructure()
	 * @generated
	 */
	EReference getStructure_Methods();

	/**
	 * Returns the meta object for the attribute list '{@link SimplifiedJML.Structure#getInvariants <em>Invariants</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Invariants</em>'.
	 * @see SimplifiedJML.Structure#getInvariants()
	 * @see #getStructure()
	 * @generated
	 */
	EAttribute getStructure_Invariants();

	/**
	 * Returns the meta object for the attribute '{@link SimplifiedJML.Structure#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see SimplifiedJML.Structure#getName()
	 * @see #getStructure()
	 * @generated
	 */
	EAttribute getStructure_Name();

	/**
	 * Returns the meta object for class '{@link SimplifiedJML.Method <em>Method</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Method</em>'.
	 * @see SimplifiedJML.Method
	 * @generated
	 */
	EClass getMethod();

	/**
	 * Returns the meta object for the attribute '{@link SimplifiedJML.Method#getSignature <em>Signature</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Signature</em>'.
	 * @see SimplifiedJML.Method#getSignature()
	 * @see #getMethod()
	 * @generated
	 */
	EAttribute getMethod_Signature();

	/**
	 * Returns the meta object for the attribute list '{@link SimplifiedJML.Method#getEnsures <em>Ensures</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Ensures</em>'.
	 * @see SimplifiedJML.Method#getEnsures()
	 * @see #getMethod()
	 * @generated
	 */
	EAttribute getMethod_Ensures();

	/**
	 * Returns the meta object for the attribute list '{@link SimplifiedJML.Method#getRequirements <em>Requirements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Requirements</em>'.
	 * @see SimplifiedJML.Method#getRequirements()
	 * @see #getMethod()
	 * @generated
	 */
	EAttribute getMethod_Requirements();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	SimplifiedJMLFactory getSimplifiedJMLFactory();

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
		 * The meta object literal for the '{@link SimplifiedJML.impl.SimplifiedJMLModelImpl <em>Model</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see SimplifiedJML.impl.SimplifiedJMLModelImpl
		 * @see SimplifiedJML.impl.SimplifiedJMLPackageImpl#getSimplifiedJMLModel()
		 * @generated
		 */
		EClass SIMPLIFIED_JML_MODEL = eINSTANCE.getSimplifiedJMLModel();

		/**
		 * The meta object literal for the '<em><b>Structures</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SIMPLIFIED_JML_MODEL__STRUCTURES = eINSTANCE.getSimplifiedJMLModel_Structures();

		/**
		 * The meta object literal for the '{@link SimplifiedJML.impl.StructureImpl <em>Structure</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see SimplifiedJML.impl.StructureImpl
		 * @see SimplifiedJML.impl.SimplifiedJMLPackageImpl#getStructure()
		 * @generated
		 */
		EClass STRUCTURE = eINSTANCE.getStructure();

		/**
		 * The meta object literal for the '<em><b>Methods</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STRUCTURE__METHODS = eINSTANCE.getStructure_Methods();

		/**
		 * The meta object literal for the '<em><b>Invariants</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STRUCTURE__INVARIANTS = eINSTANCE.getStructure_Invariants();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STRUCTURE__NAME = eINSTANCE.getStructure_Name();

		/**
		 * The meta object literal for the '{@link SimplifiedJML.impl.MethodImpl <em>Method</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see SimplifiedJML.impl.MethodImpl
		 * @see SimplifiedJML.impl.SimplifiedJMLPackageImpl#getMethod()
		 * @generated
		 */
		EClass METHOD = eINSTANCE.getMethod();

		/**
		 * The meta object literal for the '<em><b>Signature</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute METHOD__SIGNATURE = eINSTANCE.getMethod_Signature();

		/**
		 * The meta object literal for the '<em><b>Ensures</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute METHOD__ENSURES = eINSTANCE.getMethod_Ensures();

		/**
		 * The meta object literal for the '<em><b>Requirements</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute METHOD__REQUIREMENTS = eINSTANCE.getMethod_Requirements();

	}

} //SimplifiedJMLPackage
