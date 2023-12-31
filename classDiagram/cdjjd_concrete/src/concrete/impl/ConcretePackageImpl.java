/**
 */
package concrete.impl;

import concrete.AgregationJJD;
import concrete.AssociationJJD;
import concrete.AttributeJJD;
import concrete.ClassDiagramJJD;
import concrete.ClassJJD;
import concrete.ConcreteFactory;
import concrete.ConcretePackage;
import concrete.ContainmentJJD;
import concrete.ImplementJJD;
import concrete.InheritanceJJD;
import concrete.MethodJJD;
import concrete.ModelFactoryConcreteJJD;
import concrete.PackageJJD;
import concrete.RelationJJD;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ConcretePackageImpl extends EPackageImpl implements ConcretePackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass modelFactoryConcreteJJDEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass classDiagramJJDEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass packageJJDEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass classJJDEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass attributeJJDEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass methodJJDEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass relationJJDEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass agregationJJDEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass inheritanceJJDEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass containmentJJDEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass associationJJDEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass implementJJDEClass = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see concrete.ConcretePackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private ConcretePackageImpl() {
		super(eNS_URI, ConcreteFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 *
	 * <p>This method is used to initialize {@link ConcretePackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static ConcretePackage init() {
		if (isInited) return (ConcretePackage)EPackage.Registry.INSTANCE.getEPackage(ConcretePackage.eNS_URI);

		// Obtain or create and register package
		Object registeredConcretePackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		ConcretePackageImpl theConcretePackage = registeredConcretePackage instanceof ConcretePackageImpl ? (ConcretePackageImpl)registeredConcretePackage : new ConcretePackageImpl();

		isInited = true;

		// Create package meta-data objects
		theConcretePackage.createPackageContents();

		// Initialize created meta-data
		theConcretePackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theConcretePackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(ConcretePackage.eNS_URI, theConcretePackage);
		return theConcretePackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getModelFactoryConcreteJJD() {
		return modelFactoryConcreteJJDEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getModelFactoryConcreteJJD_Name() {
		return (EAttribute)modelFactoryConcreteJJDEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getModelFactoryConcreteJJD_ListClassDiagramJJD() {
		return (EReference)modelFactoryConcreteJJDEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getClassDiagramJJD() {
		return classDiagramJJDEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getClassDiagramJJD_Name() {
		return (EAttribute)classDiagramJJDEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getClassDiagramJJD_ListPackagesJJD() {
		return (EReference)classDiagramJJDEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getClassDiagramJJD_ListClassJJD() {
		return (EReference)classDiagramJJDEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getClassDiagramJJD_ListRelationsJJD() {
		return (EReference)classDiagramJJDEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPackageJJD() {
		return packageJJDEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPackageJJD_Name() {
		return (EAttribute)packageJJDEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPackageJJD_NameSpace() {
		return (EAttribute)packageJJDEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPackageJJD_SubPackagesJJD() {
		return (EReference)packageJJDEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPackageJJD_ListClassJJD() {
		return (EReference)packageJJDEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getClassJJD() {
		return classJJDEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getClassJJD_Name() {
		return (EAttribute)classJJDEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getClassJJD_Description() {
		return (EAttribute)classJJDEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getClassJJD_IsAbstract() {
		return (EAttribute)classJJDEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getClassJJD_ListAttributesJJD() {
		return (EReference)classJJDEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getClassJJD_ListMethodsJJD() {
		return (EReference)classJJDEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAttributeJJD() {
		return attributeJJDEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAttributeJJD_Name() {
		return (EAttribute)attributeJJDEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAttributeJJD_Description() {
		return (EAttribute)attributeJJDEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAttributeJJD_Type() {
		return (EAttribute)attributeJJDEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getMethodJJD() {
		return methodJJDEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMethodJJD_Name() {
		return (EAttribute)methodJJDEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMethodJJD_Modifier() {
		return (EAttribute)methodJJDEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMethodJJD_Semantic() {
		return (EAttribute)methodJJDEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMethodJJD_ReturnType() {
		return (EAttribute)methodJJDEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getMethodJJD_ListAttributesJJD() {
		return (EReference)methodJJDEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getRelationJJD() {
		return relationJJDEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getRelationJJD_RolA() {
		return (EAttribute)relationJJDEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getRelationJJD_RolB() {
		return (EAttribute)relationJJDEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getRelationJJD_NavigabilityA() {
		return (EAttribute)relationJJDEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getRelationJJD_NavigabilityB() {
		return (EAttribute)relationJJDEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getRelationJJD_MultiplicityA() {
		return (EAttribute)relationJJDEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getRelationJJD_MultiplicityB() {
		return (EAttribute)relationJJDEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getRelationJJD_Source() {
		return (EReference)relationJJDEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getRelationJJD_Target() {
		return (EReference)relationJJDEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAgregationJJD() {
		return agregationJJDEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getInheritanceJJD() {
		return inheritanceJJDEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getContainmentJJD() {
		return containmentJJDEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAssociationJJD() {
		return associationJJDEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getImplementJJD() {
		return implementJJDEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ConcreteFactory getConcreteFactory() {
		return (ConcreteFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		modelFactoryConcreteJJDEClass = createEClass(MODEL_FACTORY_CONCRETE_JJD);
		createEAttribute(modelFactoryConcreteJJDEClass, MODEL_FACTORY_CONCRETE_JJD__NAME);
		createEReference(modelFactoryConcreteJJDEClass, MODEL_FACTORY_CONCRETE_JJD__LIST_CLASS_DIAGRAM_JJD);

		classDiagramJJDEClass = createEClass(CLASS_DIAGRAM_JJD);
		createEAttribute(classDiagramJJDEClass, CLASS_DIAGRAM_JJD__NAME);
		createEReference(classDiagramJJDEClass, CLASS_DIAGRAM_JJD__LIST_PACKAGES_JJD);
		createEReference(classDiagramJJDEClass, CLASS_DIAGRAM_JJD__LIST_CLASS_JJD);
		createEReference(classDiagramJJDEClass, CLASS_DIAGRAM_JJD__LIST_RELATIONS_JJD);

		packageJJDEClass = createEClass(PACKAGE_JJD);
		createEAttribute(packageJJDEClass, PACKAGE_JJD__NAME);
		createEAttribute(packageJJDEClass, PACKAGE_JJD__NAME_SPACE);
		createEReference(packageJJDEClass, PACKAGE_JJD__SUB_PACKAGES_JJD);
		createEReference(packageJJDEClass, PACKAGE_JJD__LIST_CLASS_JJD);

		classJJDEClass = createEClass(CLASS_JJD);
		createEAttribute(classJJDEClass, CLASS_JJD__NAME);
		createEAttribute(classJJDEClass, CLASS_JJD__DESCRIPTION);
		createEAttribute(classJJDEClass, CLASS_JJD__IS_ABSTRACT);
		createEReference(classJJDEClass, CLASS_JJD__LIST_ATTRIBUTES_JJD);
		createEReference(classJJDEClass, CLASS_JJD__LIST_METHODS_JJD);

		attributeJJDEClass = createEClass(ATTRIBUTE_JJD);
		createEAttribute(attributeJJDEClass, ATTRIBUTE_JJD__NAME);
		createEAttribute(attributeJJDEClass, ATTRIBUTE_JJD__DESCRIPTION);
		createEAttribute(attributeJJDEClass, ATTRIBUTE_JJD__TYPE);

		methodJJDEClass = createEClass(METHOD_JJD);
		createEAttribute(methodJJDEClass, METHOD_JJD__NAME);
		createEAttribute(methodJJDEClass, METHOD_JJD__MODIFIER);
		createEAttribute(methodJJDEClass, METHOD_JJD__SEMANTIC);
		createEAttribute(methodJJDEClass, METHOD_JJD__RETURN_TYPE);
		createEReference(methodJJDEClass, METHOD_JJD__LIST_ATTRIBUTES_JJD);

		relationJJDEClass = createEClass(RELATION_JJD);
		createEAttribute(relationJJDEClass, RELATION_JJD__ROL_A);
		createEAttribute(relationJJDEClass, RELATION_JJD__ROL_B);
		createEAttribute(relationJJDEClass, RELATION_JJD__NAVIGABILITY_A);
		createEAttribute(relationJJDEClass, RELATION_JJD__NAVIGABILITY_B);
		createEAttribute(relationJJDEClass, RELATION_JJD__MULTIPLICITY_A);
		createEAttribute(relationJJDEClass, RELATION_JJD__MULTIPLICITY_B);
		createEReference(relationJJDEClass, RELATION_JJD__SOURCE);
		createEReference(relationJJDEClass, RELATION_JJD__TARGET);

		agregationJJDEClass = createEClass(AGREGATION_JJD);

		inheritanceJJDEClass = createEClass(INHERITANCE_JJD);

		containmentJJDEClass = createEClass(CONTAINMENT_JJD);

		associationJJDEClass = createEClass(ASSOCIATION_JJD);

		implementJJDEClass = createEClass(IMPLEMENT_JJD);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		agregationJJDEClass.getESuperTypes().add(this.getRelationJJD());
		inheritanceJJDEClass.getESuperTypes().add(this.getRelationJJD());
		containmentJJDEClass.getESuperTypes().add(this.getRelationJJD());
		associationJJDEClass.getESuperTypes().add(this.getRelationJJD());
		implementJJDEClass.getESuperTypes().add(this.getRelationJJD());

		// Initialize classes and features; add operations and parameters
		initEClass(modelFactoryConcreteJJDEClass, ModelFactoryConcreteJJD.class, "ModelFactoryConcreteJJD", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getModelFactoryConcreteJJD_Name(), ecorePackage.getEString(), "name", null, 0, 1, ModelFactoryConcreteJJD.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getModelFactoryConcreteJJD_ListClassDiagramJJD(), this.getClassDiagramJJD(), null, "listClassDiagramJJD", null, 0, -1, ModelFactoryConcreteJJD.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(classDiagramJJDEClass, ClassDiagramJJD.class, "ClassDiagramJJD", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getClassDiagramJJD_Name(), ecorePackage.getEString(), "name", null, 0, 1, ClassDiagramJJD.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getClassDiagramJJD_ListPackagesJJD(), this.getPackageJJD(), null, "listPackagesJJD", null, 0, -1, ClassDiagramJJD.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getClassDiagramJJD_ListClassJJD(), this.getClassJJD(), null, "listClassJJD", null, 0, -1, ClassDiagramJJD.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getClassDiagramJJD_ListRelationsJJD(), this.getRelationJJD(), null, "listRelationsJJD", null, 0, -1, ClassDiagramJJD.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(packageJJDEClass, PackageJJD.class, "PackageJJD", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPackageJJD_Name(), ecorePackage.getEString(), "name", null, 0, 1, PackageJJD.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPackageJJD_NameSpace(), ecorePackage.getEString(), "nameSpace", null, 0, 1, PackageJJD.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPackageJJD_SubPackagesJJD(), this.getPackageJJD(), null, "subPackagesJJD", null, 0, -1, PackageJJD.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPackageJJD_ListClassJJD(), this.getClassJJD(), null, "listClassJJD", null, 0, -1, PackageJJD.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(classJJDEClass, ClassJJD.class, "ClassJJD", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getClassJJD_Name(), ecorePackage.getEString(), "name", null, 0, 1, ClassJJD.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getClassJJD_Description(), ecorePackage.getEString(), "description", null, 0, 1, ClassJJD.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getClassJJD_IsAbstract(), ecorePackage.getEBoolean(), "isAbstract", null, 0, 1, ClassJJD.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getClassJJD_ListAttributesJJD(), this.getAttributeJJD(), null, "listAttributesJJD", null, 0, -1, ClassJJD.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getClassJJD_ListMethodsJJD(), this.getMethodJJD(), null, "listMethodsJJD", null, 0, -1, ClassJJD.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(attributeJJDEClass, AttributeJJD.class, "AttributeJJD", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAttributeJJD_Name(), ecorePackage.getEString(), "name", null, 0, 1, AttributeJJD.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAttributeJJD_Description(), ecorePackage.getEString(), "description", null, 0, 1, AttributeJJD.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAttributeJJD_Type(), ecorePackage.getEString(), "type", null, 0, 1, AttributeJJD.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(methodJJDEClass, MethodJJD.class, "MethodJJD", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getMethodJJD_Name(), ecorePackage.getEString(), "name", null, 0, 1, MethodJJD.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMethodJJD_Modifier(), ecorePackage.getEString(), "modifier", null, 0, 1, MethodJJD.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMethodJJD_Semantic(), ecorePackage.getEString(), "semantic", null, 0, 1, MethodJJD.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMethodJJD_ReturnType(), ecorePackage.getEString(), "returnType", null, 0, 1, MethodJJD.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMethodJJD_ListAttributesJJD(), this.getAttributeJJD(), null, "listAttributesJJD", null, 0, -1, MethodJJD.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(relationJJDEClass, RelationJJD.class, "RelationJJD", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRelationJJD_RolA(), ecorePackage.getEString(), "rolA", null, 0, 1, RelationJJD.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRelationJJD_RolB(), ecorePackage.getEString(), "rolB", null, 0, 1, RelationJJD.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRelationJJD_NavigabilityA(), ecorePackage.getEString(), "navigabilityA", null, 0, 1, RelationJJD.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRelationJJD_NavigabilityB(), ecorePackage.getEString(), "navigabilityB", null, 0, 1, RelationJJD.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRelationJJD_MultiplicityA(), ecorePackage.getEString(), "multiplicityA", null, 0, 1, RelationJJD.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRelationJJD_MultiplicityB(), ecorePackage.getEString(), "multiplicityB", null, 0, 1, RelationJJD.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRelationJJD_Source(), this.getClassJJD(), null, "source", null, 0, 1, RelationJJD.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRelationJJD_Target(), this.getClassJJD(), null, "target", null, 0, 1, RelationJJD.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(agregationJJDEClass, AgregationJJD.class, "AgregationJJD", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(inheritanceJJDEClass, InheritanceJJD.class, "InheritanceJJD", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(containmentJJDEClass, ContainmentJJD.class, "ContainmentJJD", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(associationJJDEClass, AssociationJJD.class, "AssociationJJD", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(implementJJDEClass, ImplementJJD.class, "ImplementJJD", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// gmf
		createGmfAnnotations();
		// gmf.diagram
		createGmf_1Annotations();
		// gmf.node
		createGmf_2Annotations();
		// gmf.compartment
		createGmf_3Annotations();
		// gmf.link
		createGmf_4Annotations();
	}

	/**
	 * Initializes the annotations for <b>gmf</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createGmfAnnotations() {
		String source = "gmf";
		addAnnotation
		  (this,
		   source,
		   new String[] {
		   });
	}

	/**
	 * Initializes the annotations for <b>gmf.diagram</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createGmf_1Annotations() {
		String source = "gmf.diagram";
		addAnnotation
		  (classDiagramJJDEClass,
		   source,
		   new String[] {
		   });
	}

	/**
	 * Initializes the annotations for <b>gmf.node</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createGmf_2Annotations() {
		String source = "gmf.node";
		addAnnotation
		  (packageJJDEClass,
		   source,
		   new String[] {
			   "label", "name"
		   });
		addAnnotation
		  (classJJDEClass,
		   source,
		   new String[] {
			   "label", "name",
			   "color", "205,234,239",
			   "border.color", "0,0,0"
		   });
		addAnnotation
		  (attributeJJDEClass,
		   source,
		   new String[] {
			   "label", "name, type",
			   "label.pattern", "{0} : {1}",
			   "border.width", "0",
			   "size", "200,25",
			   "color", "205,234,239"
		   });
		addAnnotation
		  (methodJJDEClass,
		   source,
		   new String[] {
			   "label", "name",
			   "color", "205,234,239",
			   "border.width", "0"
		   });
	}

	/**
	 * Initializes the annotations for <b>gmf.compartment</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createGmf_3Annotations() {
		String source = "gmf.compartment";
		addAnnotation
		  (getPackageJJD_SubPackagesJJD(),
		   source,
		   new String[] {
		   });
		addAnnotation
		  (getPackageJJD_ListClassJJD(),
		   source,
		   new String[] {
		   });
		addAnnotation
		  (getClassJJD_ListAttributesJJD(),
		   source,
		   new String[] {
			   "layout", "list"
		   });
		addAnnotation
		  (getClassJJD_ListMethodsJJD(),
		   source,
		   new String[] {
			   "layout", "list"
		   });
		addAnnotation
		  (getMethodJJD_ListAttributesJJD(),
		   source,
		   new String[] {
			   "layout", "list"
		   });
	}

	/**
	 * Initializes the annotations for <b>gmf.link</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createGmf_4Annotations() {
		String source = "gmf.link";
		addAnnotation
		  (agregationJJDEClass,
		   source,
		   new String[] {
			   "source", "source",
			   "target", "target",
			   "style", "solid",
			   "width", "2",
			   "source.decoration", "rhomb",
			   "color", "1,24,146"
		   });
		addAnnotation
		  (inheritanceJJDEClass,
		   source,
		   new String[] {
			   "source", "source",
			   "target", "target",
			   "style", "solid",
			   "width", "2",
			   "figure", "rounded",
			   "target.decoration", "closedarrow",
			   "color", "1,24,146"
		   });
		addAnnotation
		  (containmentJJDEClass,
		   source,
		   new String[] {
			   "label", "rolB",
			   "source", "source",
			   "target", "target",
			   "style", "solid",
			   "width", "2",
			   "figure", "rounded",
			   "source.decoration", "filledrhomb",
			   "color", "1,24,146"
		   });
		addAnnotation
		  (associationJJDEClass,
		   source,
		   new String[] {
			   "source", "source",
			   "target", "target",
			   "style", "solid",
			   "width", "2",
			   "figure", "rounded",
			   "target.decoration", "arrow",
			   "color", "1,24,146"
		   });
		addAnnotation
		  (implementJJDEClass,
		   source,
		   new String[] {
			   "source", "source",
			   "target", "target",
			   "style", "dot",
			   "width", "2",
			   "figure", "rounded",
			   "source.decoration", "closedarrow",
			   "color", "1,24,146"
		   });
	}

} //ConcretePackageImpl
