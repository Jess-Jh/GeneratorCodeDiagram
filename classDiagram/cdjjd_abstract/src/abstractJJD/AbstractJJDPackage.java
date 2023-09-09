/**
 */
package abstractJJD;

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
 * @see abstractJJD.AbstractJJDFactory
 * @model kind="package"
 *        annotation="gmf"
 * @generated
 */
public interface AbstractJJDPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "abstractJJD";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "abstractJJD";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "abstractJJD";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	AbstractJJDPackage eINSTANCE = abstractJJD.impl.AbstractJJDPackageImpl.init();

	/**
	 * The meta object id for the '{@link abstractJJD.impl.ModelFactoryAbstractJJDImpl <em>Model Factory Abstract JJD</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see abstractJJD.impl.ModelFactoryAbstractJJDImpl
	 * @see abstractJJD.impl.AbstractJJDPackageImpl#getModelFactoryAbstractJJD()
	 * @generated
	 */
	int MODEL_FACTORY_ABSTRACT_JJD = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_FACTORY_ABSTRACT_JJD__NAME = 0;

	/**
	 * The feature id for the '<em><b>List Packages JJD</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_FACTORY_ABSTRACT_JJD__LIST_PACKAGES_JJD = 1;

	/**
	 * The number of structural features of the '<em>Model Factory Abstract JJD</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_FACTORY_ABSTRACT_JJD_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link abstractJJD.impl.PackageJJDImpl <em>Package JJD</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see abstractJJD.impl.PackageJJDImpl
	 * @see abstractJJD.impl.AbstractJJDPackageImpl#getPackageJJD()
	 * @generated
	 */
	int PACKAGE_JJD = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE_JJD__NAME = 0;

	/**
	 * The feature id for the '<em><b>Name Space</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE_JJD__NAME_SPACE = 1;

	/**
	 * The feature id for the '<em><b>Sub Packages JJD</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE_JJD__SUB_PACKAGES_JJD = 2;

	/**
	 * The feature id for the '<em><b>List Class JJD</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE_JJD__LIST_CLASS_JJD = 3;

	/**
	 * The number of structural features of the '<em>Package JJD</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE_JJD_FEATURE_COUNT = 4;

	/**
	 * The meta object id for the '{@link abstractJJD.impl.ClassJJDImpl <em>Class JJD</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see abstractJJD.impl.ClassJJDImpl
	 * @see abstractJJD.impl.AbstractJJDPackageImpl#getClassJJD()
	 * @generated
	 */
	int CLASS_JJD = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_JJD__NAME = 0;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_JJD__DESCRIPTION = 1;

	/**
	 * The feature id for the '<em><b>Is Abstract</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_JJD__IS_ABSTRACT = 2;

	/**
	 * The feature id for the '<em><b>List Attributes JJD</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_JJD__LIST_ATTRIBUTES_JJD = 3;

	/**
	 * The feature id for the '<em><b>List Methods JJD</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_JJD__LIST_METHODS_JJD = 4;

	/**
	 * The feature id for the '<em><b>List Relations JJD</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_JJD__LIST_RELATIONS_JJD = 5;

	/**
	 * The number of structural features of the '<em>Class JJD</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_JJD_FEATURE_COUNT = 6;

	/**
	 * The meta object id for the '{@link abstractJJD.impl.AttributeJJDImpl <em>Attribute JJD</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see abstractJJD.impl.AttributeJJDImpl
	 * @see abstractJJD.impl.AbstractJJDPackageImpl#getAttributeJJD()
	 * @generated
	 */
	int ATTRIBUTE_JJD = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_JJD__NAME = 0;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_JJD__DESCRIPTION = 1;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_JJD__TYPE = 2;

	/**
	 * The number of structural features of the '<em>Attribute JJD</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_JJD_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link abstractJJD.impl.MethodJJDImpl <em>Method JJD</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see abstractJJD.impl.MethodJJDImpl
	 * @see abstractJJD.impl.AbstractJJDPackageImpl#getMethodJJD()
	 * @generated
	 */
	int METHOD_JJD = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD_JJD__NAME = 0;

	/**
	 * The feature id for the '<em><b>Modifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD_JJD__MODIFIER = 1;

	/**
	 * The feature id for the '<em><b>Semantic</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD_JJD__SEMANTIC = 2;

	/**
	 * The feature id for the '<em><b>Return Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD_JJD__RETURN_TYPE = 3;

	/**
	 * The feature id for the '<em><b>List Attributes JJD</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD_JJD__LIST_ATTRIBUTES_JJD = 4;

	/**
	 * The number of structural features of the '<em>Method JJD</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD_JJD_FEATURE_COUNT = 5;

	/**
	 * The meta object id for the '{@link abstractJJD.impl.RelationJJDImpl <em>Relation JJD</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see abstractJJD.impl.RelationJJDImpl
	 * @see abstractJJD.impl.AbstractJJDPackageImpl#getRelationJJD()
	 * @generated
	 */
	int RELATION_JJD = 5;

	/**
	 * The feature id for the '<em><b>Rol A</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATION_JJD__ROL_A = 0;

	/**
	 * The feature id for the '<em><b>Rol B</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATION_JJD__ROL_B = 1;

	/**
	 * The feature id for the '<em><b>Navigability A</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATION_JJD__NAVIGABILITY_A = 2;

	/**
	 * The feature id for the '<em><b>Navigability B</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATION_JJD__NAVIGABILITY_B = 3;

	/**
	 * The feature id for the '<em><b>Multiplicity A</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATION_JJD__MULTIPLICITY_A = 4;

	/**
	 * The feature id for the '<em><b>Multiplicity B</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATION_JJD__MULTIPLICITY_B = 5;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATION_JJD__SOURCE = 6;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATION_JJD__TARGET = 7;

	/**
	 * The number of structural features of the '<em>Relation JJD</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATION_JJD_FEATURE_COUNT = 8;

	/**
	 * The meta object id for the '{@link abstractJJD.impl.AgregationJJDImpl <em>Agregation JJD</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see abstractJJD.impl.AgregationJJDImpl
	 * @see abstractJJD.impl.AbstractJJDPackageImpl#getAgregationJJD()
	 * @generated
	 */
	int AGREGATION_JJD = 6;

	/**
	 * The feature id for the '<em><b>Rol A</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGREGATION_JJD__ROL_A = RELATION_JJD__ROL_A;

	/**
	 * The feature id for the '<em><b>Rol B</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGREGATION_JJD__ROL_B = RELATION_JJD__ROL_B;

	/**
	 * The feature id for the '<em><b>Navigability A</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGREGATION_JJD__NAVIGABILITY_A = RELATION_JJD__NAVIGABILITY_A;

	/**
	 * The feature id for the '<em><b>Navigability B</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGREGATION_JJD__NAVIGABILITY_B = RELATION_JJD__NAVIGABILITY_B;

	/**
	 * The feature id for the '<em><b>Multiplicity A</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGREGATION_JJD__MULTIPLICITY_A = RELATION_JJD__MULTIPLICITY_A;

	/**
	 * The feature id for the '<em><b>Multiplicity B</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGREGATION_JJD__MULTIPLICITY_B = RELATION_JJD__MULTIPLICITY_B;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGREGATION_JJD__SOURCE = RELATION_JJD__SOURCE;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGREGATION_JJD__TARGET = RELATION_JJD__TARGET;

	/**
	 * The number of structural features of the '<em>Agregation JJD</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGREGATION_JJD_FEATURE_COUNT = RELATION_JJD_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link abstractJJD.impl.InheritanceJJDImpl <em>Inheritance JJD</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see abstractJJD.impl.InheritanceJJDImpl
	 * @see abstractJJD.impl.AbstractJJDPackageImpl#getInheritanceJJD()
	 * @generated
	 */
	int INHERITANCE_JJD = 7;

	/**
	 * The feature id for the '<em><b>Rol A</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INHERITANCE_JJD__ROL_A = RELATION_JJD__ROL_A;

	/**
	 * The feature id for the '<em><b>Rol B</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INHERITANCE_JJD__ROL_B = RELATION_JJD__ROL_B;

	/**
	 * The feature id for the '<em><b>Navigability A</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INHERITANCE_JJD__NAVIGABILITY_A = RELATION_JJD__NAVIGABILITY_A;

	/**
	 * The feature id for the '<em><b>Navigability B</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INHERITANCE_JJD__NAVIGABILITY_B = RELATION_JJD__NAVIGABILITY_B;

	/**
	 * The feature id for the '<em><b>Multiplicity A</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INHERITANCE_JJD__MULTIPLICITY_A = RELATION_JJD__MULTIPLICITY_A;

	/**
	 * The feature id for the '<em><b>Multiplicity B</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INHERITANCE_JJD__MULTIPLICITY_B = RELATION_JJD__MULTIPLICITY_B;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INHERITANCE_JJD__SOURCE = RELATION_JJD__SOURCE;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INHERITANCE_JJD__TARGET = RELATION_JJD__TARGET;

	/**
	 * The number of structural features of the '<em>Inheritance JJD</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INHERITANCE_JJD_FEATURE_COUNT = RELATION_JJD_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link abstractJJD.impl.ContainmentJJDImpl <em>Containment JJD</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see abstractJJD.impl.ContainmentJJDImpl
	 * @see abstractJJD.impl.AbstractJJDPackageImpl#getContainmentJJD()
	 * @generated
	 */
	int CONTAINMENT_JJD = 8;

	/**
	 * The feature id for the '<em><b>Rol A</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINMENT_JJD__ROL_A = RELATION_JJD__ROL_A;

	/**
	 * The feature id for the '<em><b>Rol B</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINMENT_JJD__ROL_B = RELATION_JJD__ROL_B;

	/**
	 * The feature id for the '<em><b>Navigability A</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINMENT_JJD__NAVIGABILITY_A = RELATION_JJD__NAVIGABILITY_A;

	/**
	 * The feature id for the '<em><b>Navigability B</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINMENT_JJD__NAVIGABILITY_B = RELATION_JJD__NAVIGABILITY_B;

	/**
	 * The feature id for the '<em><b>Multiplicity A</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINMENT_JJD__MULTIPLICITY_A = RELATION_JJD__MULTIPLICITY_A;

	/**
	 * The feature id for the '<em><b>Multiplicity B</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINMENT_JJD__MULTIPLICITY_B = RELATION_JJD__MULTIPLICITY_B;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINMENT_JJD__SOURCE = RELATION_JJD__SOURCE;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINMENT_JJD__TARGET = RELATION_JJD__TARGET;

	/**
	 * The number of structural features of the '<em>Containment JJD</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINMENT_JJD_FEATURE_COUNT = RELATION_JJD_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link abstractJJD.impl.AssociationJJDImpl <em>Association JJD</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see abstractJJD.impl.AssociationJJDImpl
	 * @see abstractJJD.impl.AbstractJJDPackageImpl#getAssociationJJD()
	 * @generated
	 */
	int ASSOCIATION_JJD = 9;

	/**
	 * The feature id for the '<em><b>Rol A</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION_JJD__ROL_A = RELATION_JJD__ROL_A;

	/**
	 * The feature id for the '<em><b>Rol B</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION_JJD__ROL_B = RELATION_JJD__ROL_B;

	/**
	 * The feature id for the '<em><b>Navigability A</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION_JJD__NAVIGABILITY_A = RELATION_JJD__NAVIGABILITY_A;

	/**
	 * The feature id for the '<em><b>Navigability B</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION_JJD__NAVIGABILITY_B = RELATION_JJD__NAVIGABILITY_B;

	/**
	 * The feature id for the '<em><b>Multiplicity A</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION_JJD__MULTIPLICITY_A = RELATION_JJD__MULTIPLICITY_A;

	/**
	 * The feature id for the '<em><b>Multiplicity B</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION_JJD__MULTIPLICITY_B = RELATION_JJD__MULTIPLICITY_B;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION_JJD__SOURCE = RELATION_JJD__SOURCE;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION_JJD__TARGET = RELATION_JJD__TARGET;

	/**
	 * The number of structural features of the '<em>Association JJD</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION_JJD_FEATURE_COUNT = RELATION_JJD_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link abstractJJD.impl.ImplementJJDImpl <em>Implement JJD</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see abstractJJD.impl.ImplementJJDImpl
	 * @see abstractJJD.impl.AbstractJJDPackageImpl#getImplementJJD()
	 * @generated
	 */
	int IMPLEMENT_JJD = 10;

	/**
	 * The feature id for the '<em><b>Rol A</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPLEMENT_JJD__ROL_A = RELATION_JJD__ROL_A;

	/**
	 * The feature id for the '<em><b>Rol B</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPLEMENT_JJD__ROL_B = RELATION_JJD__ROL_B;

	/**
	 * The feature id for the '<em><b>Navigability A</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPLEMENT_JJD__NAVIGABILITY_A = RELATION_JJD__NAVIGABILITY_A;

	/**
	 * The feature id for the '<em><b>Navigability B</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPLEMENT_JJD__NAVIGABILITY_B = RELATION_JJD__NAVIGABILITY_B;

	/**
	 * The feature id for the '<em><b>Multiplicity A</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPLEMENT_JJD__MULTIPLICITY_A = RELATION_JJD__MULTIPLICITY_A;

	/**
	 * The feature id for the '<em><b>Multiplicity B</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPLEMENT_JJD__MULTIPLICITY_B = RELATION_JJD__MULTIPLICITY_B;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPLEMENT_JJD__SOURCE = RELATION_JJD__SOURCE;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPLEMENT_JJD__TARGET = RELATION_JJD__TARGET;

	/**
	 * The number of structural features of the '<em>Implement JJD</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPLEMENT_JJD_FEATURE_COUNT = RELATION_JJD_FEATURE_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link abstractJJD.ModelFactoryAbstractJJD <em>Model Factory Abstract JJD</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Model Factory Abstract JJD</em>'.
	 * @see abstractJJD.ModelFactoryAbstractJJD
	 * @generated
	 */
	EClass getModelFactoryAbstractJJD();

	/**
	 * Returns the meta object for the attribute '{@link abstractJJD.ModelFactoryAbstractJJD#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see abstractJJD.ModelFactoryAbstractJJD#getName()
	 * @see #getModelFactoryAbstractJJD()
	 * @generated
	 */
	EAttribute getModelFactoryAbstractJJD_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link abstractJJD.ModelFactoryAbstractJJD#getListPackagesJJD <em>List Packages JJD</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>List Packages JJD</em>'.
	 * @see abstractJJD.ModelFactoryAbstractJJD#getListPackagesJJD()
	 * @see #getModelFactoryAbstractJJD()
	 * @generated
	 */
	EReference getModelFactoryAbstractJJD_ListPackagesJJD();

	/**
	 * Returns the meta object for class '{@link abstractJJD.PackageJJD <em>Package JJD</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Package JJD</em>'.
	 * @see abstractJJD.PackageJJD
	 * @generated
	 */
	EClass getPackageJJD();

	/**
	 * Returns the meta object for the attribute '{@link abstractJJD.PackageJJD#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see abstractJJD.PackageJJD#getName()
	 * @see #getPackageJJD()
	 * @generated
	 */
	EAttribute getPackageJJD_Name();

	/**
	 * Returns the meta object for the attribute '{@link abstractJJD.PackageJJD#getNameSpace <em>Name Space</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name Space</em>'.
	 * @see abstractJJD.PackageJJD#getNameSpace()
	 * @see #getPackageJJD()
	 * @generated
	 */
	EAttribute getPackageJJD_NameSpace();

	/**
	 * Returns the meta object for the containment reference list '{@link abstractJJD.PackageJJD#getSubPackagesJJD <em>Sub Packages JJD</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Sub Packages JJD</em>'.
	 * @see abstractJJD.PackageJJD#getSubPackagesJJD()
	 * @see #getPackageJJD()
	 * @generated
	 */
	EReference getPackageJJD_SubPackagesJJD();

	/**
	 * Returns the meta object for the containment reference list '{@link abstractJJD.PackageJJD#getListClassJJD <em>List Class JJD</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>List Class JJD</em>'.
	 * @see abstractJJD.PackageJJD#getListClassJJD()
	 * @see #getPackageJJD()
	 * @generated
	 */
	EReference getPackageJJD_ListClassJJD();

	/**
	 * Returns the meta object for class '{@link abstractJJD.ClassJJD <em>Class JJD</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Class JJD</em>'.
	 * @see abstractJJD.ClassJJD
	 * @generated
	 */
	EClass getClassJJD();

	/**
	 * Returns the meta object for the attribute '{@link abstractJJD.ClassJJD#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see abstractJJD.ClassJJD#getName()
	 * @see #getClassJJD()
	 * @generated
	 */
	EAttribute getClassJJD_Name();

	/**
	 * Returns the meta object for the attribute '{@link abstractJJD.ClassJJD#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see abstractJJD.ClassJJD#getDescription()
	 * @see #getClassJJD()
	 * @generated
	 */
	EAttribute getClassJJD_Description();

	/**
	 * Returns the meta object for the attribute '{@link abstractJJD.ClassJJD#isIsAbstract <em>Is Abstract</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Abstract</em>'.
	 * @see abstractJJD.ClassJJD#isIsAbstract()
	 * @see #getClassJJD()
	 * @generated
	 */
	EAttribute getClassJJD_IsAbstract();

	/**
	 * Returns the meta object for the containment reference list '{@link abstractJJD.ClassJJD#getListAttributesJJD <em>List Attributes JJD</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>List Attributes JJD</em>'.
	 * @see abstractJJD.ClassJJD#getListAttributesJJD()
	 * @see #getClassJJD()
	 * @generated
	 */
	EReference getClassJJD_ListAttributesJJD();

	/**
	 * Returns the meta object for the containment reference list '{@link abstractJJD.ClassJJD#getListMethodsJJD <em>List Methods JJD</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>List Methods JJD</em>'.
	 * @see abstractJJD.ClassJJD#getListMethodsJJD()
	 * @see #getClassJJD()
	 * @generated
	 */
	EReference getClassJJD_ListMethodsJJD();

	/**
	 * Returns the meta object for the containment reference list '{@link abstractJJD.ClassJJD#getListRelationsJJD <em>List Relations JJD</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>List Relations JJD</em>'.
	 * @see abstractJJD.ClassJJD#getListRelationsJJD()
	 * @see #getClassJJD()
	 * @generated
	 */
	EReference getClassJJD_ListRelationsJJD();

	/**
	 * Returns the meta object for class '{@link abstractJJD.AttributeJJD <em>Attribute JJD</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Attribute JJD</em>'.
	 * @see abstractJJD.AttributeJJD
	 * @generated
	 */
	EClass getAttributeJJD();

	/**
	 * Returns the meta object for the attribute '{@link abstractJJD.AttributeJJD#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see abstractJJD.AttributeJJD#getName()
	 * @see #getAttributeJJD()
	 * @generated
	 */
	EAttribute getAttributeJJD_Name();

	/**
	 * Returns the meta object for the attribute '{@link abstractJJD.AttributeJJD#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see abstractJJD.AttributeJJD#getDescription()
	 * @see #getAttributeJJD()
	 * @generated
	 */
	EAttribute getAttributeJJD_Description();

	/**
	 * Returns the meta object for the attribute '{@link abstractJJD.AttributeJJD#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see abstractJJD.AttributeJJD#getType()
	 * @see #getAttributeJJD()
	 * @generated
	 */
	EAttribute getAttributeJJD_Type();

	/**
	 * Returns the meta object for class '{@link abstractJJD.MethodJJD <em>Method JJD</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Method JJD</em>'.
	 * @see abstractJJD.MethodJJD
	 * @generated
	 */
	EClass getMethodJJD();

	/**
	 * Returns the meta object for the attribute '{@link abstractJJD.MethodJJD#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see abstractJJD.MethodJJD#getName()
	 * @see #getMethodJJD()
	 * @generated
	 */
	EAttribute getMethodJJD_Name();

	/**
	 * Returns the meta object for the attribute '{@link abstractJJD.MethodJJD#getModifier <em>Modifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Modifier</em>'.
	 * @see abstractJJD.MethodJJD#getModifier()
	 * @see #getMethodJJD()
	 * @generated
	 */
	EAttribute getMethodJJD_Modifier();

	/**
	 * Returns the meta object for the attribute '{@link abstractJJD.MethodJJD#getSemantic <em>Semantic</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Semantic</em>'.
	 * @see abstractJJD.MethodJJD#getSemantic()
	 * @see #getMethodJJD()
	 * @generated
	 */
	EAttribute getMethodJJD_Semantic();

	/**
	 * Returns the meta object for the attribute '{@link abstractJJD.MethodJJD#getReturnType <em>Return Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Return Type</em>'.
	 * @see abstractJJD.MethodJJD#getReturnType()
	 * @see #getMethodJJD()
	 * @generated
	 */
	EAttribute getMethodJJD_ReturnType();

	/**
	 * Returns the meta object for the containment reference list '{@link abstractJJD.MethodJJD#getListAttributesJJD <em>List Attributes JJD</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>List Attributes JJD</em>'.
	 * @see abstractJJD.MethodJJD#getListAttributesJJD()
	 * @see #getMethodJJD()
	 * @generated
	 */
	EReference getMethodJJD_ListAttributesJJD();

	/**
	 * Returns the meta object for class '{@link abstractJJD.RelationJJD <em>Relation JJD</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Relation JJD</em>'.
	 * @see abstractJJD.RelationJJD
	 * @generated
	 */
	EClass getRelationJJD();

	/**
	 * Returns the meta object for the attribute '{@link abstractJJD.RelationJJD#getRolA <em>Rol A</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Rol A</em>'.
	 * @see abstractJJD.RelationJJD#getRolA()
	 * @see #getRelationJJD()
	 * @generated
	 */
	EAttribute getRelationJJD_RolA();

	/**
	 * Returns the meta object for the attribute '{@link abstractJJD.RelationJJD#getRolB <em>Rol B</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Rol B</em>'.
	 * @see abstractJJD.RelationJJD#getRolB()
	 * @see #getRelationJJD()
	 * @generated
	 */
	EAttribute getRelationJJD_RolB();

	/**
	 * Returns the meta object for the attribute '{@link abstractJJD.RelationJJD#getNavigabilityA <em>Navigability A</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Navigability A</em>'.
	 * @see abstractJJD.RelationJJD#getNavigabilityA()
	 * @see #getRelationJJD()
	 * @generated
	 */
	EAttribute getRelationJJD_NavigabilityA();

	/**
	 * Returns the meta object for the attribute '{@link abstractJJD.RelationJJD#getNavigabilityB <em>Navigability B</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Navigability B</em>'.
	 * @see abstractJJD.RelationJJD#getNavigabilityB()
	 * @see #getRelationJJD()
	 * @generated
	 */
	EAttribute getRelationJJD_NavigabilityB();

	/**
	 * Returns the meta object for the attribute '{@link abstractJJD.RelationJJD#getMultiplicityA <em>Multiplicity A</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Multiplicity A</em>'.
	 * @see abstractJJD.RelationJJD#getMultiplicityA()
	 * @see #getRelationJJD()
	 * @generated
	 */
	EAttribute getRelationJJD_MultiplicityA();

	/**
	 * Returns the meta object for the attribute '{@link abstractJJD.RelationJJD#getMultiplicityB <em>Multiplicity B</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Multiplicity B</em>'.
	 * @see abstractJJD.RelationJJD#getMultiplicityB()
	 * @see #getRelationJJD()
	 * @generated
	 */
	EAttribute getRelationJJD_MultiplicityB();

	/**
	 * Returns the meta object for the reference '{@link abstractJJD.RelationJJD#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Source</em>'.
	 * @see abstractJJD.RelationJJD#getSource()
	 * @see #getRelationJJD()
	 * @generated
	 */
	EReference getRelationJJD_Source();

	/**
	 * Returns the meta object for the reference '{@link abstractJJD.RelationJJD#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target</em>'.
	 * @see abstractJJD.RelationJJD#getTarget()
	 * @see #getRelationJJD()
	 * @generated
	 */
	EReference getRelationJJD_Target();

	/**
	 * Returns the meta object for class '{@link abstractJJD.AgregationJJD <em>Agregation JJD</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Agregation JJD</em>'.
	 * @see abstractJJD.AgregationJJD
	 * @generated
	 */
	EClass getAgregationJJD();

	/**
	 * Returns the meta object for class '{@link abstractJJD.InheritanceJJD <em>Inheritance JJD</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Inheritance JJD</em>'.
	 * @see abstractJJD.InheritanceJJD
	 * @generated
	 */
	EClass getInheritanceJJD();

	/**
	 * Returns the meta object for class '{@link abstractJJD.ContainmentJJD <em>Containment JJD</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Containment JJD</em>'.
	 * @see abstractJJD.ContainmentJJD
	 * @generated
	 */
	EClass getContainmentJJD();

	/**
	 * Returns the meta object for class '{@link abstractJJD.AssociationJJD <em>Association JJD</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Association JJD</em>'.
	 * @see abstractJJD.AssociationJJD
	 * @generated
	 */
	EClass getAssociationJJD();

	/**
	 * Returns the meta object for class '{@link abstractJJD.ImplementJJD <em>Implement JJD</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Implement JJD</em>'.
	 * @see abstractJJD.ImplementJJD
	 * @generated
	 */
	EClass getImplementJJD();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	AbstractJJDFactory getAbstractJJDFactory();

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
		 * The meta object literal for the '{@link abstractJJD.impl.ModelFactoryAbstractJJDImpl <em>Model Factory Abstract JJD</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see abstractJJD.impl.ModelFactoryAbstractJJDImpl
		 * @see abstractJJD.impl.AbstractJJDPackageImpl#getModelFactoryAbstractJJD()
		 * @generated
		 */
		EClass MODEL_FACTORY_ABSTRACT_JJD = eINSTANCE.getModelFactoryAbstractJJD();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MODEL_FACTORY_ABSTRACT_JJD__NAME = eINSTANCE.getModelFactoryAbstractJJD_Name();

		/**
		 * The meta object literal for the '<em><b>List Packages JJD</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODEL_FACTORY_ABSTRACT_JJD__LIST_PACKAGES_JJD = eINSTANCE.getModelFactoryAbstractJJD_ListPackagesJJD();

		/**
		 * The meta object literal for the '{@link abstractJJD.impl.PackageJJDImpl <em>Package JJD</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see abstractJJD.impl.PackageJJDImpl
		 * @see abstractJJD.impl.AbstractJJDPackageImpl#getPackageJJD()
		 * @generated
		 */
		EClass PACKAGE_JJD = eINSTANCE.getPackageJJD();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PACKAGE_JJD__NAME = eINSTANCE.getPackageJJD_Name();

		/**
		 * The meta object literal for the '<em><b>Name Space</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PACKAGE_JJD__NAME_SPACE = eINSTANCE.getPackageJJD_NameSpace();

		/**
		 * The meta object literal for the '<em><b>Sub Packages JJD</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PACKAGE_JJD__SUB_PACKAGES_JJD = eINSTANCE.getPackageJJD_SubPackagesJJD();

		/**
		 * The meta object literal for the '<em><b>List Class JJD</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PACKAGE_JJD__LIST_CLASS_JJD = eINSTANCE.getPackageJJD_ListClassJJD();

		/**
		 * The meta object literal for the '{@link abstractJJD.impl.ClassJJDImpl <em>Class JJD</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see abstractJJD.impl.ClassJJDImpl
		 * @see abstractJJD.impl.AbstractJJDPackageImpl#getClassJJD()
		 * @generated
		 */
		EClass CLASS_JJD = eINSTANCE.getClassJJD();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CLASS_JJD__NAME = eINSTANCE.getClassJJD_Name();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CLASS_JJD__DESCRIPTION = eINSTANCE.getClassJJD_Description();

		/**
		 * The meta object literal for the '<em><b>Is Abstract</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CLASS_JJD__IS_ABSTRACT = eINSTANCE.getClassJJD_IsAbstract();

		/**
		 * The meta object literal for the '<em><b>List Attributes JJD</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CLASS_JJD__LIST_ATTRIBUTES_JJD = eINSTANCE.getClassJJD_ListAttributesJJD();

		/**
		 * The meta object literal for the '<em><b>List Methods JJD</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CLASS_JJD__LIST_METHODS_JJD = eINSTANCE.getClassJJD_ListMethodsJJD();

		/**
		 * The meta object literal for the '<em><b>List Relations JJD</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CLASS_JJD__LIST_RELATIONS_JJD = eINSTANCE.getClassJJD_ListRelationsJJD();

		/**
		 * The meta object literal for the '{@link abstractJJD.impl.AttributeJJDImpl <em>Attribute JJD</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see abstractJJD.impl.AttributeJJDImpl
		 * @see abstractJJD.impl.AbstractJJDPackageImpl#getAttributeJJD()
		 * @generated
		 */
		EClass ATTRIBUTE_JJD = eINSTANCE.getAttributeJJD();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATTRIBUTE_JJD__NAME = eINSTANCE.getAttributeJJD_Name();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATTRIBUTE_JJD__DESCRIPTION = eINSTANCE.getAttributeJJD_Description();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATTRIBUTE_JJD__TYPE = eINSTANCE.getAttributeJJD_Type();

		/**
		 * The meta object literal for the '{@link abstractJJD.impl.MethodJJDImpl <em>Method JJD</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see abstractJJD.impl.MethodJJDImpl
		 * @see abstractJJD.impl.AbstractJJDPackageImpl#getMethodJJD()
		 * @generated
		 */
		EClass METHOD_JJD = eINSTANCE.getMethodJJD();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute METHOD_JJD__NAME = eINSTANCE.getMethodJJD_Name();

		/**
		 * The meta object literal for the '<em><b>Modifier</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute METHOD_JJD__MODIFIER = eINSTANCE.getMethodJJD_Modifier();

		/**
		 * The meta object literal for the '<em><b>Semantic</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute METHOD_JJD__SEMANTIC = eINSTANCE.getMethodJJD_Semantic();

		/**
		 * The meta object literal for the '<em><b>Return Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute METHOD_JJD__RETURN_TYPE = eINSTANCE.getMethodJJD_ReturnType();

		/**
		 * The meta object literal for the '<em><b>List Attributes JJD</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference METHOD_JJD__LIST_ATTRIBUTES_JJD = eINSTANCE.getMethodJJD_ListAttributesJJD();

		/**
		 * The meta object literal for the '{@link abstractJJD.impl.RelationJJDImpl <em>Relation JJD</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see abstractJJD.impl.RelationJJDImpl
		 * @see abstractJJD.impl.AbstractJJDPackageImpl#getRelationJJD()
		 * @generated
		 */
		EClass RELATION_JJD = eINSTANCE.getRelationJJD();

		/**
		 * The meta object literal for the '<em><b>Rol A</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RELATION_JJD__ROL_A = eINSTANCE.getRelationJJD_RolA();

		/**
		 * The meta object literal for the '<em><b>Rol B</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RELATION_JJD__ROL_B = eINSTANCE.getRelationJJD_RolB();

		/**
		 * The meta object literal for the '<em><b>Navigability A</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RELATION_JJD__NAVIGABILITY_A = eINSTANCE.getRelationJJD_NavigabilityA();

		/**
		 * The meta object literal for the '<em><b>Navigability B</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RELATION_JJD__NAVIGABILITY_B = eINSTANCE.getRelationJJD_NavigabilityB();

		/**
		 * The meta object literal for the '<em><b>Multiplicity A</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RELATION_JJD__MULTIPLICITY_A = eINSTANCE.getRelationJJD_MultiplicityA();

		/**
		 * The meta object literal for the '<em><b>Multiplicity B</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RELATION_JJD__MULTIPLICITY_B = eINSTANCE.getRelationJJD_MultiplicityB();

		/**
		 * The meta object literal for the '<em><b>Source</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RELATION_JJD__SOURCE = eINSTANCE.getRelationJJD_Source();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RELATION_JJD__TARGET = eINSTANCE.getRelationJJD_Target();

		/**
		 * The meta object literal for the '{@link abstractJJD.impl.AgregationJJDImpl <em>Agregation JJD</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see abstractJJD.impl.AgregationJJDImpl
		 * @see abstractJJD.impl.AbstractJJDPackageImpl#getAgregationJJD()
		 * @generated
		 */
		EClass AGREGATION_JJD = eINSTANCE.getAgregationJJD();

		/**
		 * The meta object literal for the '{@link abstractJJD.impl.InheritanceJJDImpl <em>Inheritance JJD</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see abstractJJD.impl.InheritanceJJDImpl
		 * @see abstractJJD.impl.AbstractJJDPackageImpl#getInheritanceJJD()
		 * @generated
		 */
		EClass INHERITANCE_JJD = eINSTANCE.getInheritanceJJD();

		/**
		 * The meta object literal for the '{@link abstractJJD.impl.ContainmentJJDImpl <em>Containment JJD</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see abstractJJD.impl.ContainmentJJDImpl
		 * @see abstractJJD.impl.AbstractJJDPackageImpl#getContainmentJJD()
		 * @generated
		 */
		EClass CONTAINMENT_JJD = eINSTANCE.getContainmentJJD();

		/**
		 * The meta object literal for the '{@link abstractJJD.impl.AssociationJJDImpl <em>Association JJD</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see abstractJJD.impl.AssociationJJDImpl
		 * @see abstractJJD.impl.AbstractJJDPackageImpl#getAssociationJJD()
		 * @generated
		 */
		EClass ASSOCIATION_JJD = eINSTANCE.getAssociationJJD();

		/**
		 * The meta object literal for the '{@link abstractJJD.impl.ImplementJJDImpl <em>Implement JJD</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see abstractJJD.impl.ImplementJJDImpl
		 * @see abstractJJD.impl.AbstractJJDPackageImpl#getImplementJJD()
		 * @generated
		 */
		EClass IMPLEMENT_JJD = eINSTANCE.getImplementJJD();

	}

} //AbstractJJDPackage
