/**
 */
package abstractrelationalmodel.impl;

import abstractrelationalmodel.*;

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
public class AbstractrelationalmodelFactoryImpl extends EFactoryImpl implements AbstractrelationalmodelFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static AbstractrelationalmodelFactory init() {
		try {
			AbstractrelationalmodelFactory theAbstractrelationalmodelFactory = (AbstractrelationalmodelFactory)EPackage.Registry.INSTANCE.getEFactory(AbstractrelationalmodelPackage.eNS_URI);
			if (theAbstractrelationalmodelFactory != null) {
				return theAbstractrelationalmodelFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new AbstractrelationalmodelFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AbstractrelationalmodelFactoryImpl() {
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
			case AbstractrelationalmodelPackage.MODEL_FACTORY_ABSTRACT_RELATIONAL_MODEL: return createModelFactoryAbstractRelationalModel();
			case AbstractrelationalmodelPackage.SCHEMA: return createSchema();
			case AbstractrelationalmodelPackage.TABLE: return createTable();
			case AbstractrelationalmodelPackage.COLUMN: return createColumn();
			case AbstractrelationalmodelPackage.DATA_TYPE: return createDataType();
			case AbstractrelationalmodelPackage.RELATION_TABLES: return createRelationTables();
			case AbstractrelationalmodelPackage.RELATION_ONE_TO_ONE: return createRelationOneToOne();
			case AbstractrelationalmodelPackage.RELATION_ONE_TO_MANY: return createRelationOneToMany();
			case AbstractrelationalmodelPackage.RELATION_MANY_TO_ONE: return createRelationManyToOne();
			case AbstractrelationalmodelPackage.RELATION_MANY_TO_MANY: return createRelationManyToMany();
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
	public AbstractrelationalmodelPackage getAbstractrelationalmodelPackage() {
		return (AbstractrelationalmodelPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static AbstractrelationalmodelPackage getPackage() {
		return AbstractrelationalmodelPackage.eINSTANCE;
	}

} //AbstractrelationalmodelFactoryImpl
