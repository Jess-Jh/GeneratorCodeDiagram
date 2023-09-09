/**
 */
package concrete.impl;

import concrete.*;

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
public class ConcreteFactoryImpl extends EFactoryImpl implements ConcreteFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ConcreteFactory init() {
		try {
			ConcreteFactory theConcreteFactory = (ConcreteFactory)EPackage.Registry.INSTANCE.getEFactory(ConcretePackage.eNS_URI);
			if (theConcreteFactory != null) {
				return theConcreteFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new ConcreteFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConcreteFactoryImpl() {
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
			case ConcretePackage.MODEL_FACTORY_CONCRETE_JJD: return createModelFactoryConcreteJJD();
			case ConcretePackage.CLASS_DIAGRAM_JJD: return createClassDiagramJJD();
			case ConcretePackage.PACKAGE_JJD: return createPackageJJD();
			case ConcretePackage.CLASS_JJD: return createClassJJD();
			case ConcretePackage.ATTRIBUTE_JJD: return createAttributeJJD();
			case ConcretePackage.METHOD_JJD: return createMethodJJD();
			case ConcretePackage.RELATION_JJD: return createRelationJJD();
			case ConcretePackage.AGREGATION_JJD: return createAgregationJJD();
			case ConcretePackage.INHERITANCE_JJD: return createInheritanceJJD();
			case ConcretePackage.CONTAINMENT_JJD: return createContainmentJJD();
			case ConcretePackage.ASSOCIATION_JJD: return createAssociationJJD();
			case ConcretePackage.IMPLEMENT_JJD: return createImplementJJD();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ModelFactoryConcreteJJD createModelFactoryConcreteJJD() {
		ModelFactoryConcreteJJDImpl modelFactoryConcreteJJD = new ModelFactoryConcreteJJDImpl();
		return modelFactoryConcreteJJD;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ClassDiagramJJD createClassDiagramJJD() {
		ClassDiagramJJDImpl classDiagramJJD = new ClassDiagramJJDImpl();
		return classDiagramJJD;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PackageJJD createPackageJJD() {
		PackageJJDImpl packageJJD = new PackageJJDImpl();
		return packageJJD;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ClassJJD createClassJJD() {
		ClassJJDImpl classJJD = new ClassJJDImpl();
		return classJJD;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AttributeJJD createAttributeJJD() {
		AttributeJJDImpl attributeJJD = new AttributeJJDImpl();
		return attributeJJD;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MethodJJD createMethodJJD() {
		MethodJJDImpl methodJJD = new MethodJJDImpl();
		return methodJJD;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RelationJJD createRelationJJD() {
		RelationJJDImpl relationJJD = new RelationJJDImpl();
		return relationJJD;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AgregationJJD createAgregationJJD() {
		AgregationJJDImpl agregationJJD = new AgregationJJDImpl();
		return agregationJJD;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public InheritanceJJD createInheritanceJJD() {
		InheritanceJJDImpl inheritanceJJD = new InheritanceJJDImpl();
		return inheritanceJJD;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ContainmentJJD createContainmentJJD() {
		ContainmentJJDImpl containmentJJD = new ContainmentJJDImpl();
		return containmentJJD;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AssociationJJD createAssociationJJD() {
		AssociationJJDImpl associationJJD = new AssociationJJDImpl();
		return associationJJD;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ImplementJJD createImplementJJD() {
		ImplementJJDImpl implementJJD = new ImplementJJDImpl();
		return implementJJD;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ConcretePackage getConcretePackage() {
		return (ConcretePackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static ConcretePackage getPackage() {
		return ConcretePackage.eINSTANCE;
	}

} //ConcreteFactoryImpl
