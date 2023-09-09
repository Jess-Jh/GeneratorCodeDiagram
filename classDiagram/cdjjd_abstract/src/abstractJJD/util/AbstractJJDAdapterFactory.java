/**
 */
package abstractJJD.util;

import abstractJJD.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see abstractJJD.AbstractJJDPackage
 * @generated
 */
public class AbstractJJDAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static AbstractJJDPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AbstractJJDAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = AbstractJJDPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AbstractJJDSwitch<Adapter> modelSwitch =
		new AbstractJJDSwitch<Adapter>() {
			@Override
			public Adapter caseModelFactoryAbstractJJD(ModelFactoryAbstractJJD object) {
				return createModelFactoryAbstractJJDAdapter();
			}
			@Override
			public Adapter casePackageJJD(PackageJJD object) {
				return createPackageJJDAdapter();
			}
			@Override
			public Adapter caseClassJJD(ClassJJD object) {
				return createClassJJDAdapter();
			}
			@Override
			public Adapter caseAttributeJJD(AttributeJJD object) {
				return createAttributeJJDAdapter();
			}
			@Override
			public Adapter caseMethodJJD(MethodJJD object) {
				return createMethodJJDAdapter();
			}
			@Override
			public Adapter caseRelationJJD(RelationJJD object) {
				return createRelationJJDAdapter();
			}
			@Override
			public Adapter caseAgregationJJD(AgregationJJD object) {
				return createAgregationJJDAdapter();
			}
			@Override
			public Adapter caseInheritanceJJD(InheritanceJJD object) {
				return createInheritanceJJDAdapter();
			}
			@Override
			public Adapter caseContainmentJJD(ContainmentJJD object) {
				return createContainmentJJDAdapter();
			}
			@Override
			public Adapter caseAssociationJJD(AssociationJJD object) {
				return createAssociationJJDAdapter();
			}
			@Override
			public Adapter caseImplementJJD(ImplementJJD object) {
				return createImplementJJDAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link abstractJJD.ModelFactoryAbstractJJD <em>Model Factory Abstract JJD</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see abstractJJD.ModelFactoryAbstractJJD
	 * @generated
	 */
	public Adapter createModelFactoryAbstractJJDAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link abstractJJD.PackageJJD <em>Package JJD</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see abstractJJD.PackageJJD
	 * @generated
	 */
	public Adapter createPackageJJDAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link abstractJJD.ClassJJD <em>Class JJD</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see abstractJJD.ClassJJD
	 * @generated
	 */
	public Adapter createClassJJDAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link abstractJJD.AttributeJJD <em>Attribute JJD</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see abstractJJD.AttributeJJD
	 * @generated
	 */
	public Adapter createAttributeJJDAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link abstractJJD.MethodJJD <em>Method JJD</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see abstractJJD.MethodJJD
	 * @generated
	 */
	public Adapter createMethodJJDAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link abstractJJD.RelationJJD <em>Relation JJD</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see abstractJJD.RelationJJD
	 * @generated
	 */
	public Adapter createRelationJJDAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link abstractJJD.AgregationJJD <em>Agregation JJD</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see abstractJJD.AgregationJJD
	 * @generated
	 */
	public Adapter createAgregationJJDAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link abstractJJD.InheritanceJJD <em>Inheritance JJD</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see abstractJJD.InheritanceJJD
	 * @generated
	 */
	public Adapter createInheritanceJJDAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link abstractJJD.ContainmentJJD <em>Containment JJD</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see abstractJJD.ContainmentJJD
	 * @generated
	 */
	public Adapter createContainmentJJDAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link abstractJJD.AssociationJJD <em>Association JJD</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see abstractJJD.AssociationJJD
	 * @generated
	 */
	public Adapter createAssociationJJDAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link abstractJJD.ImplementJJD <em>Implement JJD</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see abstractJJD.ImplementJJD
	 * @generated
	 */
	public Adapter createImplementJJDAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //AbstractJJDAdapterFactory
