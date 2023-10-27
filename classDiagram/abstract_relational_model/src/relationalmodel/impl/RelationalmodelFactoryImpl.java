/**
 */
package relationalmodel.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import relationalmodel.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class RelationalmodelFactoryImpl extends EFactoryImpl implements RelationalmodelFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static RelationalmodelFactory init() {
		try {
			RelationalmodelFactory theRelationalmodelFactory = (RelationalmodelFactory)EPackage.Registry.INSTANCE.getEFactory(RelationalmodelPackage.eNS_URI);
			if (theRelationalmodelFactory != null) {
				return theRelationalmodelFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new RelationalmodelFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RelationalmodelFactoryImpl() {
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
			case RelationalmodelPackage.MODEL_FACTORY_ABSTRACT_RELATIONAL_MODEL: return createModelFactoryAbstractRelationalModel();
			case RelationalmodelPackage.SCHEMA: return createSchema();
			case RelationalmodelPackage.TABLE: return createTable();
			case RelationalmodelPackage.COLUMN: return createColumn();
			case RelationalmodelPackage.DATA_TYPE: return createDataType();
			case RelationalmodelPackage.RELATION_TABLES: return createRelationTables();
			case RelationalmodelPackage.RELATION_ONE_TO_ONE: return createRelationOneToOne();
			case RelationalmodelPackage.RELATION_ONE_TO_MANY: return createRelationOneToMany();
			case RelationalmodelPackage.RELATION_MANY_TO_ONE: return createRelationManyToOne();
			case RelationalmodelPackage.RELATION_MANY_TO_MANY: return createRelationManyToMany();
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
	public ModelFactoryAbstractRelationalModel createModelFactoryAbstractRelationalModel() {
		ModelFactoryAbstractRelationalModelImpl modelFactoryAbstractRelationalModel = new ModelFactoryAbstractRelationalModelImpl();
		return modelFactoryAbstractRelationalModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Schema createSchema() {
		SchemaImpl schema = new SchemaImpl();
		return schema;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Table createTable() {
		TableImpl table = new TableImpl();
		return table;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Column createColumn() {
		ColumnImpl column = new ColumnImpl();
		return column;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DataType createDataType() {
		DataTypeImpl dataType = new DataTypeImpl();
		return dataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RelationTables createRelationTables() {
		RelationTablesImpl relationTables = new RelationTablesImpl();
		return relationTables;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RelationOneToOne createRelationOneToOne() {
		RelationOneToOneImpl relationOneToOne = new RelationOneToOneImpl();
		return relationOneToOne;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RelationOneToMany createRelationOneToMany() {
		RelationOneToManyImpl relationOneToMany = new RelationOneToManyImpl();
		return relationOneToMany;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RelationManyToOne createRelationManyToOne() {
		RelationManyToOneImpl relationManyToOne = new RelationManyToOneImpl();
		return relationManyToOne;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RelationManyToMany createRelationManyToMany() {
		RelationManyToManyImpl relationManyToMany = new RelationManyToManyImpl();
		return relationManyToMany;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RelationalmodelPackage getRelationalmodelPackage() {
		return (RelationalmodelPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static RelationalmodelPackage getPackage() {
		return RelationalmodelPackage.eINSTANCE;
	}

} //RelationalmodelFactoryImpl
