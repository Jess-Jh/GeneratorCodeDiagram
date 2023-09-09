/**
 */
package concrete.util;

import concrete.*;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see concrete.ConcretePackage
 * @generated
 */
public class ConcreteSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static ConcretePackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConcreteSwitch() {
		if (modelPackage == null) {
			modelPackage = ConcretePackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case ConcretePackage.MODEL_FACTORY_CONCRETE_JJD: {
				ModelFactoryConcreteJJD modelFactoryConcreteJJD = (ModelFactoryConcreteJJD)theEObject;
				T result = caseModelFactoryConcreteJJD(modelFactoryConcreteJJD);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ConcretePackage.CLASS_DIAGRAM_JJD: {
				ClassDiagramJJD classDiagramJJD = (ClassDiagramJJD)theEObject;
				T result = caseClassDiagramJJD(classDiagramJJD);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ConcretePackage.PACKAGE_JJD: {
				PackageJJD packageJJD = (PackageJJD)theEObject;
				T result = casePackageJJD(packageJJD);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ConcretePackage.CLASS_JJD: {
				ClassJJD classJJD = (ClassJJD)theEObject;
				T result = caseClassJJD(classJJD);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ConcretePackage.ATTRIBUTE_JJD: {
				AttributeJJD attributeJJD = (AttributeJJD)theEObject;
				T result = caseAttributeJJD(attributeJJD);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ConcretePackage.METHOD_JJD: {
				MethodJJD methodJJD = (MethodJJD)theEObject;
				T result = caseMethodJJD(methodJJD);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ConcretePackage.RELATION_JJD: {
				RelationJJD relationJJD = (RelationJJD)theEObject;
				T result = caseRelationJJD(relationJJD);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ConcretePackage.AGREGATION_JJD: {
				AgregationJJD agregationJJD = (AgregationJJD)theEObject;
				T result = caseAgregationJJD(agregationJJD);
				if (result == null) result = caseRelationJJD(agregationJJD);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ConcretePackage.INHERITANCE_JJD: {
				InheritanceJJD inheritanceJJD = (InheritanceJJD)theEObject;
				T result = caseInheritanceJJD(inheritanceJJD);
				if (result == null) result = caseRelationJJD(inheritanceJJD);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ConcretePackage.CONTAINMENT_JJD: {
				ContainmentJJD containmentJJD = (ContainmentJJD)theEObject;
				T result = caseContainmentJJD(containmentJJD);
				if (result == null) result = caseRelationJJD(containmentJJD);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ConcretePackage.ASSOCIATION_JJD: {
				AssociationJJD associationJJD = (AssociationJJD)theEObject;
				T result = caseAssociationJJD(associationJJD);
				if (result == null) result = caseRelationJJD(associationJJD);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ConcretePackage.IMPLEMENT_JJD: {
				ImplementJJD implementJJD = (ImplementJJD)theEObject;
				T result = caseImplementJJD(implementJJD);
				if (result == null) result = caseRelationJJD(implementJJD);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Model Factory Concrete JJD</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Model Factory Concrete JJD</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseModelFactoryConcreteJJD(ModelFactoryConcreteJJD object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Class Diagram JJD</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Class Diagram JJD</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseClassDiagramJJD(ClassDiagramJJD object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Package JJD</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Package JJD</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePackageJJD(PackageJJD object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Class JJD</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Class JJD</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseClassJJD(ClassJJD object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Attribute JJD</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Attribute JJD</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAttributeJJD(AttributeJJD object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Method JJD</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Method JJD</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMethodJJD(MethodJJD object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Relation JJD</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Relation JJD</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRelationJJD(RelationJJD object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Agregation JJD</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Agregation JJD</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAgregationJJD(AgregationJJD object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Inheritance JJD</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Inheritance JJD</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInheritanceJJD(InheritanceJJD object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Containment JJD</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Containment JJD</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseContainmentJJD(ContainmentJJD object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Association JJD</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Association JJD</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAssociationJJD(AssociationJJD object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Implement JJD</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Implement JJD</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseImplementJJD(ImplementJJD object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //ConcreteSwitch
