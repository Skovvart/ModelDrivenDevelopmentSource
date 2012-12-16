/**
 */
package SimplifiedJML.impl;

import SimplifiedJML.*;

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
public class SimplifiedJMLFactoryImpl extends EFactoryImpl implements SimplifiedJMLFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static SimplifiedJMLFactory init() {
		try {
			SimplifiedJMLFactory theSimplifiedJMLFactory = (SimplifiedJMLFactory)EPackage.Registry.INSTANCE.getEFactory("platform:/resource/SimplifiedJML/model/SimplifiedJMLModel.ecore"); 
			if (theSimplifiedJMLFactory != null) {
				return theSimplifiedJMLFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new SimplifiedJMLFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SimplifiedJMLFactoryImpl() {
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
			case SimplifiedJMLPackage.SIMPLIFIED_JML_MODEL: return createSimplifiedJMLModel();
			case SimplifiedJMLPackage.STRUCTURE: return createStructure();
			case SimplifiedJMLPackage.METHOD: return createMethod();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SimplifiedJMLModel createSimplifiedJMLModel() {
		SimplifiedJMLModelImpl simplifiedJMLModel = new SimplifiedJMLModelImpl();
		return simplifiedJMLModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Structure createStructure() {
		StructureImpl structure = new StructureImpl();
		return structure;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Method createMethod() {
		MethodImpl method = new MethodImpl();
		return method;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SimplifiedJMLPackage getSimplifiedJMLPackage() {
		return (SimplifiedJMLPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static SimplifiedJMLPackage getPackage() {
		return SimplifiedJMLPackage.eINSTANCE;
	}

} //SimplifiedJMLFactoryImpl
