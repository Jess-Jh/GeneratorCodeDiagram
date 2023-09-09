/**
 */
package abstractJJD.impl;

import abstractJJD.*;

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
public class AbstractJJDFactoryImpl extends EFactoryImpl implements AbstractJJDFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static AbstractJJDFactory init() {
		try {
			AbstractJJDFactory theAbstractJJDFactory = (AbstractJJDFactory)EPackage.Registry.INSTANCE.getEFactory(AbstractJJDPackage.eNS_URI);
			if (theAbstractJJDFactory != null) {
				return theAbstractJJDFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new AbstractJJDFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AbstractJJDFactoryImpl() {
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
			case AbstractJJDPackage.MODEL_FACTORY_ABSTRACT_JJD: return createModelFactoryAbstractJJD();
			case AbstractJJDPackage.PACKAGE_JJD: return createPackageJJD();
			case AbstractJJDPackage.CLASS_JJD: return createClassJJD();
			case AbstractJJDPackage.ATTRIBUTE_JJD: return createAttributeJJD();
			case AbstractJJDPackage.METHOD_JJD: return createMethodJJD();
			case AbstractJJDPackage.RELATION_JJD: return createRelationJJD();
			case AbstractJJDPackage.AGREGATION_JJD: return createAgregationJJD();
			case AbstractJJDPackage.INHERITANCE_JJD: return createInheritanceJJD();
			case AbstractJJDPackage.CONTAINMENT_JJD: return createContainmentJJD();
			case AbstractJJDPackage.ASSOCIATION_JJD: return createAssociationJJD();
			case AbstractJJDPackage.IMPLEMENT_JJD: return createImplementJJD();
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
	public ModelFactoryAbstractJJD createModelFactoryAbstractJJD() {
		ModelFactoryAbstractJJDImpl modelFactoryAbstractJJD = new ModelFactoryAbstractJJDImpl();
		return modelFactoryAbstractJJD;
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
	public AbstractJJDPackage getAbstractJJDPackage() {
		return (AbstractJJDPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static AbstractJJDPackage getPackage() {
		return AbstractJJDPackage.eINSTANCE;
	}

} //AbstractJJDFactoryImpl
