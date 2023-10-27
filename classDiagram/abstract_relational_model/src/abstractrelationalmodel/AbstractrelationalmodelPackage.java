/**
 */
package abstractrelationalmodel;

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
 * @see abstractrelationalmodel.AbstractrelationalmodelFactory
 * @model kind="package"
 *        annotation="gmf"
 * @generated
 */
public interface AbstractrelationalmodelPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "abstractrelationalmodel";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "abstractrelationalmodel";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "abstractrelationalmodel";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	AbstractrelationalmodelPackage eINSTANCE = abstractrelationalmodel.impl.AbstractrelationalmodelPackageImpl.init();

	/**
	 * The meta object id for the '{@link abstractrelationalmodel.impl.ModelFactoryAbstractRelationalModelImpl <em>Model Factory Abstract Relational Model</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see abstractrelationalmodel.impl.ModelFactoryAbstractRelationalModelImpl
	 * @see abstractrelationalmodel.impl.AbstractrelationalmodelPackageImpl#getModelFactoryAbstractRelationalModel()
	 * @generated
	 */
	int MODEL_FACTORY_ABSTRACT_RELATIONAL_MODEL = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_FACTORY_ABSTRACT_RELATIONAL_MODEL__NAME = 0;

	/**
	 * The feature id for the '<em><b>List Schemas</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_FACTORY_ABSTRACT_RELATIONAL_MODEL__LIST_SCHEMAS = 1;

	/**
	 * The number of structural features of the '<em>Model Factory Abstract Relational Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_FACTORY_ABSTRACT_RELATIONAL_MODEL_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link abstractrelationalmodel.impl.SchemaImpl <em>Schema</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see abstractrelationalmodel.impl.SchemaImpl
	 * @see abstractrelationalmodel.impl.AbstractrelationalmodelPackageImpl#getSchema()
	 * @generated
	 */
	int SCHEMA = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEMA__NAME = 0;

	/**
	 * The feature id for the '<em><b>List Tables</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEMA__LIST_TABLES = 1;

	/**
	 * The feature id for the '<em><b>Relation Tables</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEMA__RELATION_TABLES = 2;

	/**
	 * The number of structural features of the '<em>Schema</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEMA_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link abstractrelationalmodel.impl.TableImpl <em>Table</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see abstractrelationalmodel.impl.TableImpl
	 * @see abstractrelationalmodel.impl.AbstractrelationalmodelPackageImpl#getTable()
	 * @generated
	 */
	int TABLE = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE__NAME = 0;

	/**
	 * The feature id for the '<em><b>List Columns</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE__LIST_COLUMNS = 1;

	/**
	 * The number of structural features of the '<em>Table</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link abstractrelationalmodel.impl.ColumnImpl <em>Column</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see abstractrelationalmodel.impl.ColumnImpl
	 * @see abstractrelationalmodel.impl.AbstractrelationalmodelPackageImpl#getColumn()
	 * @generated
	 */
	int COLUMN = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLUMN__NAME = 0;

	/**
	 * The feature id for the '<em><b>Data Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLUMN__DATA_TYPE = 1;

	/**
	 * The feature id for the '<em><b>Is Primary Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLUMN__IS_PRIMARY_KEY = 2;

	/**
	 * The feature id for the '<em><b>Not Null</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLUMN__NOT_NULL = 3;

	/**
	 * The feature id for the '<em><b>Unique Index</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLUMN__UNIQUE_INDEX = 4;

	/**
	 * The feature id for the '<em><b>Is Binary Column</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLUMN__IS_BINARY_COLUMN = 5;

	/**
	 * The feature id for the '<em><b>Unsigned Data Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLUMN__UNSIGNED_DATA_TYPE = 6;

	/**
	 * The feature id for the '<em><b>Fill Up Values Column</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLUMN__FILL_UP_VALUES_COLUMN = 7;

	/**
	 * The feature id for the '<em><b>Is Auto Incremental</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLUMN__IS_AUTO_INCREMENTAL = 8;

	/**
	 * The feature id for the '<em><b>Generated Column</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLUMN__GENERATED_COLUMN = 9;

	/**
	 * The feature id for the '<em><b>Expression</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLUMN__EXPRESSION = 10;

	/**
	 * The feature id for the '<em><b>List Data Type</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLUMN__LIST_DATA_TYPE = 11;

	/**
	 * The number of structural features of the '<em>Column</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLUMN_FEATURE_COUNT = 12;

	/**
	 * The meta object id for the '{@link abstractrelationalmodel.impl.DataTypeImpl <em>Data Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see abstractrelationalmodel.impl.DataTypeImpl
	 * @see abstractrelationalmodel.impl.AbstractrelationalmodelPackageImpl#getDataType()
	 * @generated
	 */
	int DATA_TYPE = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_TYPE__NAME = 0;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_TYPE__DESCRIPTION = 1;

	/**
	 * The feature id for the '<em><b>Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_TYPE__SIZE = 2;

	/**
	 * The number of structural features of the '<em>Data Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_TYPE_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link abstractrelationalmodel.impl.RelationTablesImpl <em>Relation Tables</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see abstractrelationalmodel.impl.RelationTablesImpl
	 * @see abstractrelationalmodel.impl.AbstractrelationalmodelPackageImpl#getRelationTables()
	 * @generated
	 */
	int RELATION_TABLES = 5;

	/**
	 * The feature id for the '<em><b>Rol A</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATION_TABLES__ROL_A = 0;

	/**
	 * The feature id for the '<em><b>Rol B</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATION_TABLES__ROL_B = 1;

	/**
	 * The feature id for the '<em><b>Navigability A</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATION_TABLES__NAVIGABILITY_A = 2;

	/**
	 * The feature id for the '<em><b>Navigability B</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATION_TABLES__NAVIGABILITY_B = 3;

	/**
	 * The feature id for the '<em><b>Multiplicity A</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATION_TABLES__MULTIPLICITY_A = 4;

	/**
	 * The feature id for the '<em><b>Multiplicity B</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATION_TABLES__MULTIPLICITY_B = 5;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATION_TABLES__SOURCE = 6;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATION_TABLES__TARGET = 7;

	/**
	 * The number of structural features of the '<em>Relation Tables</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATION_TABLES_FEATURE_COUNT = 8;

	/**
	 * The meta object id for the '{@link abstractrelationalmodel.impl.RelationOneToOneImpl <em>Relation One To One</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see abstractrelationalmodel.impl.RelationOneToOneImpl
	 * @see abstractrelationalmodel.impl.AbstractrelationalmodelPackageImpl#getRelationOneToOne()
	 * @generated
	 */
	int RELATION_ONE_TO_ONE = 6;

	/**
	 * The feature id for the '<em><b>Rol A</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATION_ONE_TO_ONE__ROL_A = RELATION_TABLES__ROL_A;

	/**
	 * The feature id for the '<em><b>Rol B</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATION_ONE_TO_ONE__ROL_B = RELATION_TABLES__ROL_B;

	/**
	 * The feature id for the '<em><b>Navigability A</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATION_ONE_TO_ONE__NAVIGABILITY_A = RELATION_TABLES__NAVIGABILITY_A;

	/**
	 * The feature id for the '<em><b>Navigability B</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATION_ONE_TO_ONE__NAVIGABILITY_B = RELATION_TABLES__NAVIGABILITY_B;

	/**
	 * The feature id for the '<em><b>Multiplicity A</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATION_ONE_TO_ONE__MULTIPLICITY_A = RELATION_TABLES__MULTIPLICITY_A;

	/**
	 * The feature id for the '<em><b>Multiplicity B</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATION_ONE_TO_ONE__MULTIPLICITY_B = RELATION_TABLES__MULTIPLICITY_B;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATION_ONE_TO_ONE__SOURCE = RELATION_TABLES__SOURCE;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATION_ONE_TO_ONE__TARGET = RELATION_TABLES__TARGET;

	/**
	 * The number of structural features of the '<em>Relation One To One</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATION_ONE_TO_ONE_FEATURE_COUNT = RELATION_TABLES_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link abstractrelationalmodel.impl.RelationOneToManyImpl <em>Relation One To Many</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see abstractrelationalmodel.impl.RelationOneToManyImpl
	 * @see abstractrelationalmodel.impl.AbstractrelationalmodelPackageImpl#getRelationOneToMany()
	 * @generated
	 */
	int RELATION_ONE_TO_MANY = 7;

	/**
	 * The feature id for the '<em><b>Rol A</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATION_ONE_TO_MANY__ROL_A = RELATION_TABLES__ROL_A;

	/**
	 * The feature id for the '<em><b>Rol B</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATION_ONE_TO_MANY__ROL_B = RELATION_TABLES__ROL_B;

	/**
	 * The feature id for the '<em><b>Navigability A</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATION_ONE_TO_MANY__NAVIGABILITY_A = RELATION_TABLES__NAVIGABILITY_A;

	/**
	 * The feature id for the '<em><b>Navigability B</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATION_ONE_TO_MANY__NAVIGABILITY_B = RELATION_TABLES__NAVIGABILITY_B;

	/**
	 * The feature id for the '<em><b>Multiplicity A</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATION_ONE_TO_MANY__MULTIPLICITY_A = RELATION_TABLES__MULTIPLICITY_A;

	/**
	 * The feature id for the '<em><b>Multiplicity B</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATION_ONE_TO_MANY__MULTIPLICITY_B = RELATION_TABLES__MULTIPLICITY_B;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATION_ONE_TO_MANY__SOURCE = RELATION_TABLES__SOURCE;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATION_ONE_TO_MANY__TARGET = RELATION_TABLES__TARGET;

	/**
	 * The number of structural features of the '<em>Relation One To Many</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATION_ONE_TO_MANY_FEATURE_COUNT = RELATION_TABLES_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link abstractrelationalmodel.impl.RelationManyToOneImpl <em>Relation Many To One</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see abstractrelationalmodel.impl.RelationManyToOneImpl
	 * @see abstractrelationalmodel.impl.AbstractrelationalmodelPackageImpl#getRelationManyToOne()
	 * @generated
	 */
	int RELATION_MANY_TO_ONE = 8;

	/**
	 * The feature id for the '<em><b>Rol A</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATION_MANY_TO_ONE__ROL_A = RELATION_TABLES__ROL_A;

	/**
	 * The feature id for the '<em><b>Rol B</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATION_MANY_TO_ONE__ROL_B = RELATION_TABLES__ROL_B;

	/**
	 * The feature id for the '<em><b>Navigability A</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATION_MANY_TO_ONE__NAVIGABILITY_A = RELATION_TABLES__NAVIGABILITY_A;

	/**
	 * The feature id for the '<em><b>Navigability B</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATION_MANY_TO_ONE__NAVIGABILITY_B = RELATION_TABLES__NAVIGABILITY_B;

	/**
	 * The feature id for the '<em><b>Multiplicity A</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATION_MANY_TO_ONE__MULTIPLICITY_A = RELATION_TABLES__MULTIPLICITY_A;

	/**
	 * The feature id for the '<em><b>Multiplicity B</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATION_MANY_TO_ONE__MULTIPLICITY_B = RELATION_TABLES__MULTIPLICITY_B;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATION_MANY_TO_ONE__SOURCE = RELATION_TABLES__SOURCE;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATION_MANY_TO_ONE__TARGET = RELATION_TABLES__TARGET;

	/**
	 * The number of structural features of the '<em>Relation Many To One</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATION_MANY_TO_ONE_FEATURE_COUNT = RELATION_TABLES_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link abstractrelationalmodel.impl.RelationManyToManyImpl <em>Relation Many To Many</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see abstractrelationalmodel.impl.RelationManyToManyImpl
	 * @see abstractrelationalmodel.impl.AbstractrelationalmodelPackageImpl#getRelationManyToMany()
	 * @generated
	 */
	int RELATION_MANY_TO_MANY = 9;

	/**
	 * The feature id for the '<em><b>Rol A</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATION_MANY_TO_MANY__ROL_A = RELATION_TABLES__ROL_A;

	/**
	 * The feature id for the '<em><b>Rol B</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATION_MANY_TO_MANY__ROL_B = RELATION_TABLES__ROL_B;

	/**
	 * The feature id for the '<em><b>Navigability A</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATION_MANY_TO_MANY__NAVIGABILITY_A = RELATION_TABLES__NAVIGABILITY_A;

	/**
	 * The feature id for the '<em><b>Navigability B</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATION_MANY_TO_MANY__NAVIGABILITY_B = RELATION_TABLES__NAVIGABILITY_B;

	/**
	 * The feature id for the '<em><b>Multiplicity A</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATION_MANY_TO_MANY__MULTIPLICITY_A = RELATION_TABLES__MULTIPLICITY_A;

	/**
	 * The feature id for the '<em><b>Multiplicity B</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATION_MANY_TO_MANY__MULTIPLICITY_B = RELATION_TABLES__MULTIPLICITY_B;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATION_MANY_TO_MANY__SOURCE = RELATION_TABLES__SOURCE;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATION_MANY_TO_MANY__TARGET = RELATION_TABLES__TARGET;

	/**
	 * The number of structural features of the '<em>Relation Many To Many</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATION_MANY_TO_MANY_FEATURE_COUNT = RELATION_TABLES_FEATURE_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link abstractrelationalmodel.ModelFactoryAbstractRelationalModel <em>Model Factory Abstract Relational Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Model Factory Abstract Relational Model</em>'.
	 * @see abstractrelationalmodel.ModelFactoryAbstractRelationalModel
	 * @generated
	 */
	EClass getModelFactoryAbstractRelationalModel();

	/**
	 * Returns the meta object for the attribute '{@link abstractrelationalmodel.ModelFactoryAbstractRelationalModel#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see abstractrelationalmodel.ModelFactoryAbstractRelationalModel#getName()
	 * @see #getModelFactoryAbstractRelationalModel()
	 * @generated
	 */
	EAttribute getModelFactoryAbstractRelationalModel_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link abstractrelationalmodel.ModelFactoryAbstractRelationalModel#getListSchemas <em>List Schemas</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>List Schemas</em>'.
	 * @see abstractrelationalmodel.ModelFactoryAbstractRelationalModel#getListSchemas()
	 * @see #getModelFactoryAbstractRelationalModel()
	 * @generated
	 */
	EReference getModelFactoryAbstractRelationalModel_ListSchemas();

	/**
	 * Returns the meta object for class '{@link abstractrelationalmodel.Schema <em>Schema</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Schema</em>'.
	 * @see abstractrelationalmodel.Schema
	 * @generated
	 */
	EClass getSchema();

	/**
	 * Returns the meta object for the attribute '{@link abstractrelationalmodel.Schema#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see abstractrelationalmodel.Schema#getName()
	 * @see #getSchema()
	 * @generated
	 */
	EAttribute getSchema_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link abstractrelationalmodel.Schema#getListTables <em>List Tables</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>List Tables</em>'.
	 * @see abstractrelationalmodel.Schema#getListTables()
	 * @see #getSchema()
	 * @generated
	 */
	EReference getSchema_ListTables();

	/**
	 * Returns the meta object for the containment reference list '{@link abstractrelationalmodel.Schema#getRelationTables <em>Relation Tables</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Relation Tables</em>'.
	 * @see abstractrelationalmodel.Schema#getRelationTables()
	 * @see #getSchema()
	 * @generated
	 */
	EReference getSchema_RelationTables();

	/**
	 * Returns the meta object for class '{@link abstractrelationalmodel.Table <em>Table</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Table</em>'.
	 * @see abstractrelationalmodel.Table
	 * @generated
	 */
	EClass getTable();

	/**
	 * Returns the meta object for the attribute '{@link abstractrelationalmodel.Table#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see abstractrelationalmodel.Table#getName()
	 * @see #getTable()
	 * @generated
	 */
	EAttribute getTable_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link abstractrelationalmodel.Table#getListColumns <em>List Columns</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>List Columns</em>'.
	 * @see abstractrelationalmodel.Table#getListColumns()
	 * @see #getTable()
	 * @generated
	 */
	EReference getTable_ListColumns();

	/**
	 * Returns the meta object for class '{@link abstractrelationalmodel.Column <em>Column</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Column</em>'.
	 * @see abstractrelationalmodel.Column
	 * @generated
	 */
	EClass getColumn();

	/**
	 * Returns the meta object for the attribute '{@link abstractrelationalmodel.Column#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see abstractrelationalmodel.Column#getName()
	 * @see #getColumn()
	 * @generated
	 */
	EAttribute getColumn_Name();

	/**
	 * Returns the meta object for the containment reference '{@link abstractrelationalmodel.Column#getDataType <em>Data Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Data Type</em>'.
	 * @see abstractrelationalmodel.Column#getDataType()
	 * @see #getColumn()
	 * @generated
	 */
	EReference getColumn_DataType();

	/**
	 * Returns the meta object for the attribute '{@link abstractrelationalmodel.Column#isIsPrimaryKey <em>Is Primary Key</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Primary Key</em>'.
	 * @see abstractrelationalmodel.Column#isIsPrimaryKey()
	 * @see #getColumn()
	 * @generated
	 */
	EAttribute getColumn_IsPrimaryKey();

	/**
	 * Returns the meta object for the attribute '{@link abstractrelationalmodel.Column#isNotNull <em>Not Null</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Not Null</em>'.
	 * @see abstractrelationalmodel.Column#isNotNull()
	 * @see #getColumn()
	 * @generated
	 */
	EAttribute getColumn_NotNull();

	/**
	 * Returns the meta object for the attribute '{@link abstractrelationalmodel.Column#isUniqueIndex <em>Unique Index</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Unique Index</em>'.
	 * @see abstractrelationalmodel.Column#isUniqueIndex()
	 * @see #getColumn()
	 * @generated
	 */
	EAttribute getColumn_UniqueIndex();

	/**
	 * Returns the meta object for the attribute '{@link abstractrelationalmodel.Column#isIsBinaryColumn <em>Is Binary Column</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Binary Column</em>'.
	 * @see abstractrelationalmodel.Column#isIsBinaryColumn()
	 * @see #getColumn()
	 * @generated
	 */
	EAttribute getColumn_IsBinaryColumn();

	/**
	 * Returns the meta object for the attribute '{@link abstractrelationalmodel.Column#isUnsignedDataType <em>Unsigned Data Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Unsigned Data Type</em>'.
	 * @see abstractrelationalmodel.Column#isUnsignedDataType()
	 * @see #getColumn()
	 * @generated
	 */
	EAttribute getColumn_UnsignedDataType();

	/**
	 * Returns the meta object for the attribute '{@link abstractrelationalmodel.Column#isFillUpValuesColumn <em>Fill Up Values Column</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Fill Up Values Column</em>'.
	 * @see abstractrelationalmodel.Column#isFillUpValuesColumn()
	 * @see #getColumn()
	 * @generated
	 */
	EAttribute getColumn_FillUpValuesColumn();

	/**
	 * Returns the meta object for the attribute '{@link abstractrelationalmodel.Column#isIsAutoIncremental <em>Is Auto Incremental</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Auto Incremental</em>'.
	 * @see abstractrelationalmodel.Column#isIsAutoIncremental()
	 * @see #getColumn()
	 * @generated
	 */
	EAttribute getColumn_IsAutoIncremental();

	/**
	 * Returns the meta object for the attribute '{@link abstractrelationalmodel.Column#isGeneratedColumn <em>Generated Column</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Generated Column</em>'.
	 * @see abstractrelationalmodel.Column#isGeneratedColumn()
	 * @see #getColumn()
	 * @generated
	 */
	EAttribute getColumn_GeneratedColumn();

	/**
	 * Returns the meta object for the attribute '{@link abstractrelationalmodel.Column#getExpression <em>Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Expression</em>'.
	 * @see abstractrelationalmodel.Column#getExpression()
	 * @see #getColumn()
	 * @generated
	 */
	EAttribute getColumn_Expression();

	/**
	 * Returns the meta object for the containment reference list '{@link abstractrelationalmodel.Column#getListDataType <em>List Data Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>List Data Type</em>'.
	 * @see abstractrelationalmodel.Column#getListDataType()
	 * @see #getColumn()
	 * @generated
	 */
	EReference getColumn_ListDataType();

	/**
	 * Returns the meta object for class '{@link abstractrelationalmodel.DataType <em>Data Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Data Type</em>'.
	 * @see abstractrelationalmodel.DataType
	 * @generated
	 */
	EClass getDataType();

	/**
	 * Returns the meta object for the attribute '{@link abstractrelationalmodel.DataType#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see abstractrelationalmodel.DataType#getName()
	 * @see #getDataType()
	 * @generated
	 */
	EAttribute getDataType_Name();

	/**
	 * Returns the meta object for the attribute '{@link abstractrelationalmodel.DataType#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see abstractrelationalmodel.DataType#getDescription()
	 * @see #getDataType()
	 * @generated
	 */
	EAttribute getDataType_Description();

	/**
	 * Returns the meta object for the attribute '{@link abstractrelationalmodel.DataType#getSize <em>Size</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Size</em>'.
	 * @see abstractrelationalmodel.DataType#getSize()
	 * @see #getDataType()
	 * @generated
	 */
	EAttribute getDataType_Size();

	/**
	 * Returns the meta object for class '{@link abstractrelationalmodel.RelationTables <em>Relation Tables</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Relation Tables</em>'.
	 * @see abstractrelationalmodel.RelationTables
	 * @generated
	 */
	EClass getRelationTables();

	/**
	 * Returns the meta object for the attribute '{@link abstractrelationalmodel.RelationTables#getRolA <em>Rol A</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Rol A</em>'.
	 * @see abstractrelationalmodel.RelationTables#getRolA()
	 * @see #getRelationTables()
	 * @generated
	 */
	EAttribute getRelationTables_RolA();

	/**
	 * Returns the meta object for the attribute '{@link abstractrelationalmodel.RelationTables#getRolB <em>Rol B</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Rol B</em>'.
	 * @see abstractrelationalmodel.RelationTables#getRolB()
	 * @see #getRelationTables()
	 * @generated
	 */
	EAttribute getRelationTables_RolB();

	/**
	 * Returns the meta object for the attribute '{@link abstractrelationalmodel.RelationTables#getNavigabilityA <em>Navigability A</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Navigability A</em>'.
	 * @see abstractrelationalmodel.RelationTables#getNavigabilityA()
	 * @see #getRelationTables()
	 * @generated
	 */
	EAttribute getRelationTables_NavigabilityA();

	/**
	 * Returns the meta object for the attribute '{@link abstractrelationalmodel.RelationTables#getNavigabilityB <em>Navigability B</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Navigability B</em>'.
	 * @see abstractrelationalmodel.RelationTables#getNavigabilityB()
	 * @see #getRelationTables()
	 * @generated
	 */
	EAttribute getRelationTables_NavigabilityB();

	/**
	 * Returns the meta object for the attribute '{@link abstractrelationalmodel.RelationTables#getMultiplicityA <em>Multiplicity A</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Multiplicity A</em>'.
	 * @see abstractrelationalmodel.RelationTables#getMultiplicityA()
	 * @see #getRelationTables()
	 * @generated
	 */
	EAttribute getRelationTables_MultiplicityA();

	/**
	 * Returns the meta object for the attribute '{@link abstractrelationalmodel.RelationTables#getMultiplicityB <em>Multiplicity B</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Multiplicity B</em>'.
	 * @see abstractrelationalmodel.RelationTables#getMultiplicityB()
	 * @see #getRelationTables()
	 * @generated
	 */
	EAttribute getRelationTables_MultiplicityB();

	/**
	 * Returns the meta object for the reference '{@link abstractrelationalmodel.RelationTables#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Source</em>'.
	 * @see abstractrelationalmodel.RelationTables#getSource()
	 * @see #getRelationTables()
	 * @generated
	 */
	EReference getRelationTables_Source();

	/**
	 * Returns the meta object for the reference '{@link abstractrelationalmodel.RelationTables#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target</em>'.
	 * @see abstractrelationalmodel.RelationTables#getTarget()
	 * @see #getRelationTables()
	 * @generated
	 */
	EReference getRelationTables_Target();

	/**
	 * Returns the meta object for class '{@link abstractrelationalmodel.RelationOneToOne <em>Relation One To One</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Relation One To One</em>'.
	 * @see abstractrelationalmodel.RelationOneToOne
	 * @generated
	 */
	EClass getRelationOneToOne();

	/**
	 * Returns the meta object for class '{@link abstractrelationalmodel.RelationOneToMany <em>Relation One To Many</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Relation One To Many</em>'.
	 * @see abstractrelationalmodel.RelationOneToMany
	 * @generated
	 */
	EClass getRelationOneToMany();

	/**
	 * Returns the meta object for class '{@link abstractrelationalmodel.RelationManyToOne <em>Relation Many To One</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Relation Many To One</em>'.
	 * @see abstractrelationalmodel.RelationManyToOne
	 * @generated
	 */
	EClass getRelationManyToOne();

	/**
	 * Returns the meta object for class '{@link abstractrelationalmodel.RelationManyToMany <em>Relation Many To Many</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Relation Many To Many</em>'.
	 * @see abstractrelationalmodel.RelationManyToMany
	 * @generated
	 */
	EClass getRelationManyToMany();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	AbstractrelationalmodelFactory getAbstractrelationalmodelFactory();

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
		 * The meta object literal for the '{@link abstractrelationalmodel.impl.ModelFactoryAbstractRelationalModelImpl <em>Model Factory Abstract Relational Model</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see abstractrelationalmodel.impl.ModelFactoryAbstractRelationalModelImpl
		 * @see abstractrelationalmodel.impl.AbstractrelationalmodelPackageImpl#getModelFactoryAbstractRelationalModel()
		 * @generated
		 */
		EClass MODEL_FACTORY_ABSTRACT_RELATIONAL_MODEL = eINSTANCE.getModelFactoryAbstractRelationalModel();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MODEL_FACTORY_ABSTRACT_RELATIONAL_MODEL__NAME = eINSTANCE.getModelFactoryAbstractRelationalModel_Name();

		/**
		 * The meta object literal for the '<em><b>List Schemas</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODEL_FACTORY_ABSTRACT_RELATIONAL_MODEL__LIST_SCHEMAS = eINSTANCE.getModelFactoryAbstractRelationalModel_ListSchemas();

		/**
		 * The meta object literal for the '{@link abstractrelationalmodel.impl.SchemaImpl <em>Schema</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see abstractrelationalmodel.impl.SchemaImpl
		 * @see abstractrelationalmodel.impl.AbstractrelationalmodelPackageImpl#getSchema()
		 * @generated
		 */
		EClass SCHEMA = eINSTANCE.getSchema();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SCHEMA__NAME = eINSTANCE.getSchema_Name();

		/**
		 * The meta object literal for the '<em><b>List Tables</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SCHEMA__LIST_TABLES = eINSTANCE.getSchema_ListTables();

		/**
		 * The meta object literal for the '<em><b>Relation Tables</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SCHEMA__RELATION_TABLES = eINSTANCE.getSchema_RelationTables();

		/**
		 * The meta object literal for the '{@link abstractrelationalmodel.impl.TableImpl <em>Table</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see abstractrelationalmodel.impl.TableImpl
		 * @see abstractrelationalmodel.impl.AbstractrelationalmodelPackageImpl#getTable()
		 * @generated
		 */
		EClass TABLE = eINSTANCE.getTable();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TABLE__NAME = eINSTANCE.getTable_Name();

		/**
		 * The meta object literal for the '<em><b>List Columns</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TABLE__LIST_COLUMNS = eINSTANCE.getTable_ListColumns();

		/**
		 * The meta object literal for the '{@link abstractrelationalmodel.impl.ColumnImpl <em>Column</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see abstractrelationalmodel.impl.ColumnImpl
		 * @see abstractrelationalmodel.impl.AbstractrelationalmodelPackageImpl#getColumn()
		 * @generated
		 */
		EClass COLUMN = eINSTANCE.getColumn();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COLUMN__NAME = eINSTANCE.getColumn_Name();

		/**
		 * The meta object literal for the '<em><b>Data Type</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COLUMN__DATA_TYPE = eINSTANCE.getColumn_DataType();

		/**
		 * The meta object literal for the '<em><b>Is Primary Key</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COLUMN__IS_PRIMARY_KEY = eINSTANCE.getColumn_IsPrimaryKey();

		/**
		 * The meta object literal for the '<em><b>Not Null</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COLUMN__NOT_NULL = eINSTANCE.getColumn_NotNull();

		/**
		 * The meta object literal for the '<em><b>Unique Index</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COLUMN__UNIQUE_INDEX = eINSTANCE.getColumn_UniqueIndex();

		/**
		 * The meta object literal for the '<em><b>Is Binary Column</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COLUMN__IS_BINARY_COLUMN = eINSTANCE.getColumn_IsBinaryColumn();

		/**
		 * The meta object literal for the '<em><b>Unsigned Data Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COLUMN__UNSIGNED_DATA_TYPE = eINSTANCE.getColumn_UnsignedDataType();

		/**
		 * The meta object literal for the '<em><b>Fill Up Values Column</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COLUMN__FILL_UP_VALUES_COLUMN = eINSTANCE.getColumn_FillUpValuesColumn();

		/**
		 * The meta object literal for the '<em><b>Is Auto Incremental</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COLUMN__IS_AUTO_INCREMENTAL = eINSTANCE.getColumn_IsAutoIncremental();

		/**
		 * The meta object literal for the '<em><b>Generated Column</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COLUMN__GENERATED_COLUMN = eINSTANCE.getColumn_GeneratedColumn();

		/**
		 * The meta object literal for the '<em><b>Expression</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COLUMN__EXPRESSION = eINSTANCE.getColumn_Expression();

		/**
		 * The meta object literal for the '<em><b>List Data Type</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COLUMN__LIST_DATA_TYPE = eINSTANCE.getColumn_ListDataType();

		/**
		 * The meta object literal for the '{@link abstractrelationalmodel.impl.DataTypeImpl <em>Data Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see abstractrelationalmodel.impl.DataTypeImpl
		 * @see abstractrelationalmodel.impl.AbstractrelationalmodelPackageImpl#getDataType()
		 * @generated
		 */
		EClass DATA_TYPE = eINSTANCE.getDataType();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATA_TYPE__NAME = eINSTANCE.getDataType_Name();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATA_TYPE__DESCRIPTION = eINSTANCE.getDataType_Description();

		/**
		 * The meta object literal for the '<em><b>Size</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATA_TYPE__SIZE = eINSTANCE.getDataType_Size();

		/**
		 * The meta object literal for the '{@link abstractrelationalmodel.impl.RelationTablesImpl <em>Relation Tables</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see abstractrelationalmodel.impl.RelationTablesImpl
		 * @see abstractrelationalmodel.impl.AbstractrelationalmodelPackageImpl#getRelationTables()
		 * @generated
		 */
		EClass RELATION_TABLES = eINSTANCE.getRelationTables();

		/**
		 * The meta object literal for the '<em><b>Rol A</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RELATION_TABLES__ROL_A = eINSTANCE.getRelationTables_RolA();

		/**
		 * The meta object literal for the '<em><b>Rol B</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RELATION_TABLES__ROL_B = eINSTANCE.getRelationTables_RolB();

		/**
		 * The meta object literal for the '<em><b>Navigability A</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RELATION_TABLES__NAVIGABILITY_A = eINSTANCE.getRelationTables_NavigabilityA();

		/**
		 * The meta object literal for the '<em><b>Navigability B</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RELATION_TABLES__NAVIGABILITY_B = eINSTANCE.getRelationTables_NavigabilityB();

		/**
		 * The meta object literal for the '<em><b>Multiplicity A</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RELATION_TABLES__MULTIPLICITY_A = eINSTANCE.getRelationTables_MultiplicityA();

		/**
		 * The meta object literal for the '<em><b>Multiplicity B</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RELATION_TABLES__MULTIPLICITY_B = eINSTANCE.getRelationTables_MultiplicityB();

		/**
		 * The meta object literal for the '<em><b>Source</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RELATION_TABLES__SOURCE = eINSTANCE.getRelationTables_Source();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RELATION_TABLES__TARGET = eINSTANCE.getRelationTables_Target();

		/**
		 * The meta object literal for the '{@link abstractrelationalmodel.impl.RelationOneToOneImpl <em>Relation One To One</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see abstractrelationalmodel.impl.RelationOneToOneImpl
		 * @see abstractrelationalmodel.impl.AbstractrelationalmodelPackageImpl#getRelationOneToOne()
		 * @generated
		 */
		EClass RELATION_ONE_TO_ONE = eINSTANCE.getRelationOneToOne();

		/**
		 * The meta object literal for the '{@link abstractrelationalmodel.impl.RelationOneToManyImpl <em>Relation One To Many</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see abstractrelationalmodel.impl.RelationOneToManyImpl
		 * @see abstractrelationalmodel.impl.AbstractrelationalmodelPackageImpl#getRelationOneToMany()
		 * @generated
		 */
		EClass RELATION_ONE_TO_MANY = eINSTANCE.getRelationOneToMany();

		/**
		 * The meta object literal for the '{@link abstractrelationalmodel.impl.RelationManyToOneImpl <em>Relation Many To One</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see abstractrelationalmodel.impl.RelationManyToOneImpl
		 * @see abstractrelationalmodel.impl.AbstractrelationalmodelPackageImpl#getRelationManyToOne()
		 * @generated
		 */
		EClass RELATION_MANY_TO_ONE = eINSTANCE.getRelationManyToOne();

		/**
		 * The meta object literal for the '{@link abstractrelationalmodel.impl.RelationManyToManyImpl <em>Relation Many To Many</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see abstractrelationalmodel.impl.RelationManyToManyImpl
		 * @see abstractrelationalmodel.impl.AbstractrelationalmodelPackageImpl#getRelationManyToMany()
		 * @generated
		 */
		EClass RELATION_MANY_TO_MANY = eINSTANCE.getRelationManyToMany();

	}

} //AbstractrelationalmodelPackage
