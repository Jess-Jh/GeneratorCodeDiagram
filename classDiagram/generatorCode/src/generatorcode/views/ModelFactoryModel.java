package generatorcode.views;

import concrete.AttributeJJD;
import concrete.ClassDiagramJJD;
import concrete.ClassJJD;
import concrete.ConcreteFactory;
import concrete.ConcretePackage;
import concrete.MethodJJD;
import concrete.ModelFactoryConcreteJJD;
import concrete.PackageJJD;
import concrete.RelationJJD;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.common.util.EList;

import abstractJJD.AbstractJJDFactory;
import abstractJJD.ModelFactoryAbstractJJD;

public class ModelFactoryModel {
	
	//------------------------------  Singleton ------------------------------------------------
	// Clase estatica oculta. Tan solo se instanciara el singleton una vez
	private static class SingletonHolder { 
		// El constructor de Singleton puede ser llamado desde aquí al ser protected
		private final static ModelFactoryModel eINSTANCE = new ModelFactoryModel();
	}

	// Método para obtener la instancia de nuestra clase
	public static ModelFactoryModel getInstance() {
		return SingletonHolder.eINSTANCE;
	}
	//------------------------------  Singleton ------------------------------------------------
	ModelFactoryConcreteJJD modelFactoryConcrete = ConcreteFactory.eINSTANCE.createModelFactoryConcreteJJD();
	ModelFactoryAbstractJJD modelFactoryAbstract = AbstractJJDFactory.eINSTANCE.createModelFactoryAbstractJJD();

	public ModelFactoryModel() {
	// TODO Auto-generated constructor stub

	modelFactoryConcrete = uploadConcrete();
	modelFactoryAbstract = uploadAbstract();

//			if ( modelFactoryConcrete == null ){
//				modelFactoryConcrete = tempModelFactory;
//
//			}
	}

	public ModelFactoryConcreteJJD uploadConcrete() {
		ModelFactoryConcreteJJD modelFactoryConcrete = null;

		ConcretePackage whoownmePackage =  ConcretePackage.eINSTANCE;
		org.eclipse.emf.ecore.resource.ResourceSet resourceSet = new org.eclipse.emf.ecore.resource.impl.ResourceSetImpl();		
		org.eclipse.emf.common.util.URI uri = org.eclipse.emf.common.util.URI.createURI("platform:/resource/test/src/model/model%20.concrete");
		org.eclipse.emf.ecore.resource.Resource resource = resourceSet.createResource(uri);

		try {
			resource.load(null);
			modelFactoryConcrete = (ModelFactoryConcreteJJD)resource.getContents().get(0);
			System.out.println("loaded: " + modelFactoryConcrete);
		}
		catch (java.io.IOException e) {
			System.out.println("failed to read " + uri); 		
			System.out.println(e);
		}
		return modelFactoryConcrete;
	}
	
	public ModelFactoryAbstractJJD uploadAbstract() {
		ModelFactoryAbstractJJD modelFactoryAbstract = null;

		ConcretePackage whoownmePackage =  ConcretePackage.eINSTANCE;
		org.eclipse.emf.ecore.resource.ResourceSet resourceSet = new org.eclipse.emf.ecore.resource.impl.ResourceSetImpl();		
		org.eclipse.emf.common.util.URI uri = org.eclipse.emf.common.util.URI.createURI("platform:/resource/test/src/model/model.abstractjjd");
		org.eclipse.emf.ecore.resource.Resource resource = resourceSet.createResource(uri);

		try {
			resource.load(null);
			modelFactoryAbstract = (ModelFactoryAbstractJJD)resource.getContents().get(0);
			System.out.println("loaded: " + modelFactoryAbstract);
		}
		catch (java.io.IOException e) {
			System.out.println("failed to read " + uri); 		
			System.out.println(e);
		}
		return modelFactoryAbstract;
	}
	
	public void saveConcrete() {
		//EXISTEN 2 FORMAS DE GUARDAR EL RECURSO
		org.eclipse.emf.common.util.URI uri = org.eclipse.emf.common.util.URI.createURI("platform:/resource/test/src/model/model%20.concrete");
		org.eclipse.emf.ecore.resource.ResourceSet resourceSet= new org.eclipse.emf.ecore.resource.impl.ResourceSetImpl();
		org.eclipse.emf.ecore.resource.Resource resource = resourceSet.createResource(uri);
		resource.getContents().add(modelFactoryConcrete);
		
		try {
			resource.save(java.util.Collections.EMPTY_MAP);
		} catch (java.io.IOException e) {
			e.printStackTrace();
		}
		return;
	}
	
	public void saveAbstract() {
		//EXISTEN 2 FORMAS DE GUARDAR EL RECURSO
		org.eclipse.emf.common.util.URI uri = org.eclipse.emf.common.util.URI.createURI("platform:/resource/test/src/model/model.abstractjjd");
		org.eclipse.emf.ecore.resource.ResourceSet resourceSet = new org.eclipse.emf.ecore.resource.impl.ResourceSetImpl();
		org.eclipse.emf.ecore.resource.Resource resource = resourceSet.createResource(uri);
		resource.getContents().add(modelFactoryAbstract);
		
		try {
			resource.save(java.util.Collections.EMPTY_MAP);
		} catch (java.io.IOException e) {
			e.printStackTrace();
		}
		return;
	}

	public void transformationM2M() {
						
		for (ClassDiagramJJD diagram : modelFactoryConcrete.getListClassDiagramJJD()) {
			
			for (PackageJJD packageJJD : diagram.getListPackagesJJD()) {
				
				for (ClassJJD classConcrete : packageJJD.getListClassJJD()) {
				
					abstractJJD.ClassJJD classJJD = AbstractJJDFactory.eINSTANCE.createClassJJD();
					classJJD.setName(classConcrete.getName());
					classJJD.setDescription(classConcrete.getDescription());
					classJJD.setIsAbstract(classConcrete.isIsAbstract());
					
					addAttributeToClass(classJJD, classConcrete);
					addMethodToClass(classJJD, classConcrete);
					addClassJJDToPackage(classJJD, packageJJD);

				}
				
				for (RelationJJD relationConcrete : diagram.getListRelationsJJD()) {
					
					ClassJJD sourceConcrete = relationConcrete.getSource();
					ClassJJD targetConcrete = relationConcrete.getTarget();
					
					abstractJJD.ClassJJD classJJDSource = getClass(sourceConcrete.getName(), packageJJD.getNameSpace());
					abstractJJD.ClassJJD classJJDTarget = getClass(targetConcrete.getName(), packageJJD.getNameSpace());
					
					abstractJJD.RelationJJD relationJJDSource = null;
					
					
					if(relationConcrete.getClass().getName().contains("ContainmentJJDImpl")) 
						relationJJDSource = AbstractJJDFactory.eINSTANCE.createContainmentJJD();
					
					if(relationConcrete.getClass().getName().contains("AgregationJJDImpl")) 
						relationJJDSource = AbstractJJDFactory.eINSTANCE.createAgregationJJD();
					
					if(relationConcrete.getClass().getName().contains("InheritanceJJDImpl")) 
						relationJJDSource = AbstractJJDFactory.eINSTANCE.createInheritanceJJD();
					
					if(relationConcrete.getClass().getName().contains("AssociationJJDImpl")) 
						relationJJDSource = AbstractJJDFactory.eINSTANCE.createAssociationJJD();
					
					if(relationConcrete.getClass().getName().contains("ImplementJJDImpl")) 
						relationJJDSource = AbstractJJDFactory.eINSTANCE.createImplementJJD();
					
					
					relationJJDSource.setTarget(classJJDSource);
					relationJJDSource.setSource(classJJDTarget);
					relationJJDSource.setMultiplicityA(relationConcrete.getMultiplicityA());
					relationJJDSource.setMultiplicityB(relationConcrete.getMultiplicityB());
					relationJJDSource.setNavigabilityA(relationConcrete.getNavigabilityA());
					relationJJDSource.setNavigabilityB(relationConcrete.getNavigabilityB());
					relationJJDSource.setRolA(relationConcrete.getRolA());
					relationJJDSource.setRolB(relationConcrete.getRolB());
					
					classJJDSource.getListRelationsJJD().add(relationJJDSource);
					
					
					abstractJJD.RelationJJD relationJJDTarget = null;
					
					if(relationConcrete.getClass().getName().contains("ContainmentJJDImpl")) 
						relationJJDTarget = AbstractJJDFactory.eINSTANCE.createContainmentJJD();
					
					if(relationConcrete.getClass().getName().contains("AgregationJJDImpl")) 
						relationJJDTarget = AbstractJJDFactory.eINSTANCE.createAgregationJJD();
					
					if(relationConcrete.getClass().getName().contains("InheritanceJJDImpl")) 
						relationJJDTarget = AbstractJJDFactory.eINSTANCE.createInheritanceJJD();
					
					if(relationConcrete.getClass().getName().contains("AssociationJJDImpl")) 
						relationJJDTarget = AbstractJJDFactory.eINSTANCE.createAssociationJJD();
					
					if(relationConcrete.getClass().getName().contains("ImplementJJDImpl")) 
						relationJJDTarget = AbstractJJDFactory.eINSTANCE.createImplementJJD();
					
					relationJJDTarget.setTarget(classJJDSource);
					relationJJDTarget.setSource(classJJDTarget);
					relationJJDTarget.setMultiplicityA(relationConcrete.getMultiplicityA());
					relationJJDTarget.setMultiplicityB(relationConcrete.getMultiplicityB());
					relationJJDTarget.setNavigabilityA(relationConcrete.getNavigabilityA());
					relationJJDTarget.setNavigabilityB(relationConcrete.getNavigabilityB());
					relationJJDTarget.setRolA(relationConcrete.getRolA());
					relationJJDTarget.setRolB(relationConcrete.getRolB());
					
					classJJDTarget.getListRelationsJJD().add(relationJJDTarget);
				}
			}
		}
		saveAbstract();
	}

	private void addAttributeToClass(abstractJJD.ClassJJD classJJD, ClassJJD classConcrete) {
		for(AttributeJJD attibute : classConcrete.getListAttributesJJD()) {
			abstractJJD.AttributeJJD attibuteJJD = AbstractJJDFactory.eINSTANCE.createAttributeJJD();
			attibuteJJD.setName(attibute.getName());
			attibuteJJD.setType(attibute.getType());
			attibuteJJD.setDescription(attibute.getDescription());
			
			classJJD.getListAttributesJJD().add(attibuteJJD);
		}
	}
	
	private void addMethodToClass(abstractJJD.ClassJJD classJJD, ClassJJD classConcrete) {
		for(MethodJJD method : classConcrete.getListMethodsJJD()) {
			abstractJJD.MethodJJD methodJJD = AbstractJJDFactory.eINSTANCE.createMethodJJD();
			methodJJD.setName(method.getName());
			methodJJD.setModifier(method.getModifier());
			methodJJD.setSemantic(method.getSemantic());
			methodJJD.setReturnType(method.getReturnType());
			
			addAttributeToMethod(methodJJD, method.getListAttributesJJD());
			
			classJJD.getListMethodsJJD().add(methodJJD);
		}
	}

	private void addAttributeToMethod(abstractJJD.MethodJJD methodJJD, EList<AttributeJJD> listAttributesJJD) {
		for(AttributeJJD attibute : listAttributesJJD) {
			abstractJJD.AttributeJJD attibuteJJD = AbstractJJDFactory.eINSTANCE.createAttributeJJD();
			attibuteJJD.setName(attibute.getName());
			attibuteJJD.setType(attibute.getType());
			attibuteJJD.setDescription(attibute.getDescription());
			
			methodJJD.getListAttributesJJD().add(attibuteJJD);
		}
		
	}

	private void addClassJJDToPackage(abstractJJD.ClassJJD classJJD, PackageJJD packagejjd) {
		String[] split = packagejjd.getNameSpace().split("/");
		abstractJJD.PackageJJD parentPackageJJD = null;
		
		
		for(int i = 0; i < split.length; i++) {
			String namePackage = split[i];
			parentPackageJJD = getPackage(namePackage, parentPackageJJD, packagejjd.getNameSpace());
		}
		parentPackageJJD.getListClassJJD().add(classJJD);
	}

	private abstractJJD.PackageJJD getPackage(String namePackage, abstractJJD.PackageJJD parentPackageJJD, String nameSpace) {
		
		abstractJJD.PackageJJD packageJJD = modelFactoryAbstract.getListPackagesJJD().get(0);
		
		if(packageJJD.getName().equals(namePackage)) {
			return packageJJD;
		}
		
		for(abstractJJD.PackageJJD packagejjd : parentPackageJJD.getSubPackagesJJD()) {
			if(packagejjd.getName().equalsIgnoreCase(namePackage)) {
				return packagejjd;
			}
		}
		
		abstractJJD.PackageJJD newPackage = AbstractJJDFactory.eINSTANCE.createPackageJJD();
		newPackage.setName(namePackage);
		newPackage.setNameSpace(nameSpace);
		
		parentPackageJJD.getSubPackagesJJD().add(newPackage);
		return newPackage;
	}
	

	private abstractJJD.ClassJJD getClass(String name, String namePackage) { 
		abstractJJD.PackageJJD packageAbs = null;
		String[] split = namePackage.split("/");
		
		for (int i = 0; i < split.length; i++) {
			String nameRoute = split[i];
			packageAbs = getPackage(nameRoute, packageAbs, "");
		}
				
		for (abstractJJD.ClassJJD classJJD : packageAbs.getListClassJJD()) {
			if(classJJD.getName().equals(name)) {
				return classJJD;
			}
		}
		return null;
	}

	public void transformationM2T() {
		
		for (abstractJJD.PackageJJD packageJJD : modelFactoryAbstract.getListPackagesJJD()) {
			abstractJJD.PackageJJD packageAbs = null;
			String[] split = packageJJD.getNameSpace().split("/");
			
			for (int i = 0; i < split.length; i++) {
				String nameRoute = split[i];
				packageAbs = getPackage(nameRoute, packageAbs, "");
				
				for (abstractJJD.ClassJJD classJJD : packageAbs.getListClassJJD()) {
					CreateDartFile(classJJD);
				}
			}
		}	
	}

	private void CreateDartFile(abstractJJD.ClassJJD classJJD) {
		
		StringBuilder content = new StringBuilder();
		List<String> inheritanceClass = getRelationInheritanceJJD(classJJD);
		List<String> listAttributes = getAttributesClass(classJJD);
		List<String> listAttributesRelations = getAttributesRelations(classJJD);
				
		content.append((classJJD.isIsAbstract() ? "abstract " : "") + "class " + classJJD.getName() + (inheritanceClass.get(1).length() > 0 ? " extends " + inheritanceClass.get(0) : "") +" {\n"
				+ "\t" + classJJD.getName() + "({\n" +  listAttributes.get(1) + listAttributesRelations.get(1) + "\t})" + (inheritanceClass.get(1).length() > 0 ? ": super(" + inheritanceClass.get(1) + ")"  : "") + ";\n\n"
				+ listAttributes.get(0)
				+ listAttributesRelations.get(0)
				+ "\n"
				+ getMethodsClass(classJJD) + "\n"
				+ "}");
		
		CreateFile(classJJD.getName()+".dart",content);
	}

	private void CreateFile(String nameClass, StringBuilder content) {
		
//		JFileChooser fileChooser = new JFileChooser();
//		fileChooser.setCurrentDirectory(new File("."));
//		fileChooser.setDialogTitle("Selecciona la carpeta donde deseas almacenar las clas");
//		fileChooser.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
//		fileChooser.setAcceptAllFileFilterUsed(false);
//		
//		int answer = fileChooser.showOpenDialog(null);
//		
//		if(answer == JFileChooser.APPROVE_OPTION) {
//			File folderSelected = fileChooser.getSelectedFile();
//			
//			System.out.print(folderSelected);
//		}
		
		String operatingSystem = System.getProperty("os.name").toLowerCase();
		String routeDesktop = "";
		String routeFile = "";


        if (operatingSystem.contains("win")) {
        	routeDesktop = System.getProperty("user.home") + "\\Desktop\\ClassDart";
    		routeFile = routeDesktop + "\\" + nameClass;
        } else if (operatingSystem.contains("mac")) {
        	routeDesktop = System.getProperty("user.home") + "/Desktop/ClassDart";
    		routeFile = routeDesktop + "/" + nameClass;
        } else {
            System.out.println("Estás en un sistema diferente de Windows y Mac.");
        }
		
		File carpeta = new File(routeDesktop);
	    if (!carpeta.exists()) {
	        carpeta.mkdirs();
	    }
       
	    try (BufferedWriter write = new BufferedWriter(new FileWriter(routeFile))){
	        	
            write.write(content.toString());
            write.close();
	        System.out.println("Se ha creado el archivo " + nameClass + " en la siguiente ruta: " + routeDesktop);
	    } catch (IOException e) {
	        System.out.print(e);
	        e.printStackTrace();
	            
	    }
	}
	
	private List<String> getRelationInheritanceJJD(abstractJJD.ClassJJD classJJD) {
		
		List<String> inheritance = new ArrayList<>();
		String inheritanceClass = "";
		String attributes = "";
		boolean first = true;
		
		for (abstractJJD.RelationJJD relationJJD : classJJD.getListRelationsJJD()) {
			if(relationJJD.getClass().getName().contains("InheritanceJJDImpl")) {
				if(relationJJD.getSource().getName() != classJJD.getName()) {
					inheritanceClass = relationJJD.getSource().getName();
					
					for(abstractJJD.AttributeJJD attribute : relationJJD.getSource().getListAttributesJJD()) {
						
						if (!first) {
							attributes += ", ";
					    }
						attributes += attribute.getName() +": " + attribute.getName();
					    first = false; 
						
					}
				}
			}
		}
		
		inheritance.add(inheritanceClass);
		inheritance.add(attributes);
		
		return inheritance;
	}

	private List<String> getAttributesClass(abstractJJD.ClassJJD classJJD) {
		List<String> typesAttributes = new ArrayList<>();
		String attribute = "";
		String attribute2 = "";
		
		for (abstractJJD.AttributeJJD attibuteJJD : classJJD.getListAttributesJJD()) {
			attribute += "\tfinal " + attibuteJJD.getType() +"? " + attibuteJJD.getName() + ";" + "\n";		
			attribute2 += "\t\tthis." + attibuteJJD.getName() + "," + "\n";		
		}
		
		typesAttributes.add(attribute);
		typesAttributes.add(attribute2);
		
		return typesAttributes;	
	}
	
	private List<String> getAttributesRelations(abstractJJD.ClassJJD classJJD) {
		List<String> typesAttributes = new ArrayList<>();
		String attribute = "";
		String attribute2 = "";
		
		for (abstractJJD.RelationJJD relationJJD : classJJD.getListRelationsJJD()) {
						
			if(relationJJD.getClass().getName().contains("ContainmentJJDImpl") || relationJJD.getClass().getName().contains("AgregationJJDImpl")) {
				
				if(relationJJD.getNavigabilityA().equalsIgnoreCase("true")) {
					if(relationJJD.getRolA() != null && relationJJD.getRolA().equalsIgnoreCase(classJJD.getName())) {
							attribute += relationJJD.getMultiplicityB().equalsIgnoreCase("*") ? "\tfinal List<" + relationJJD.getSource().getName() + ">" +"? " + relationJJD.getRolB() + ";" : "\n";		
							attribute += relationJJD.getMultiplicityB().equalsIgnoreCase("1") ? "\tfinal " + relationJJD.getSource().getName() +"? " + relationJJD.getRolB().toLowerCase() + ";" : "\n";		
							attribute2 += "\t\tthis." + relationJJD.getRolB().toLowerCase() + ",\n";		
					}
				}
				if(relationJJD.getNavigabilityB().equalsIgnoreCase("true")) {
					if(relationJJD.getRolB() != null && relationJJD.getSource().getName().equalsIgnoreCase(classJJD.getName())) {
							attribute += relationJJD.getMultiplicityA().equalsIgnoreCase("*") ? "\tfinal List<" + relationJJD.getTarget().getName() + ">" +"? " + relationJJD.getRolA() + ";" : "\n";		
							attribute += relationJJD.getMultiplicityA().equalsIgnoreCase("1") ? "\tfinal " + relationJJD.getTarget().getName() +"? " + relationJJD.getRolA().toLowerCase() + ";" : "\n";		
							attribute2 += "\t\tthis." + relationJJD.getRolA().toLowerCase() + ",\n";		
					}
				}
			}
			
			if(relationJJD.getClass().getName().contains("AssociationJJDImpl") && !(relationJJD.getSource().getName().equalsIgnoreCase(classJJD.getName()))) {
				if(relationJJD.getNavigabilityA().equalsIgnoreCase("true")) {
					attribute += relationJJD.getMultiplicityB().equalsIgnoreCase("*") ? "\tfinal List<" + relationJJD.getSource().getName() + ">" +"? " + relationJJD.getRolB() + ";" : "\n";		
					attribute += relationJJD.getMultiplicityB().equalsIgnoreCase("1") ? "\tfinal " + relationJJD.getSource().getName() +"? " + relationJJD.getRolB().toLowerCase() + ";" : "\n";
					attribute2 += "\t\tthis." + relationJJD.getRolB().toLowerCase() + ",\n";		
				}
				if(relationJJD.getNavigabilityB().equalsIgnoreCase("true")) {
					attribute += relationJJD.getMultiplicityA().equalsIgnoreCase("*") ? "\tfinal List<" + relationJJD.getSource().getName() + ">" +"? " + relationJJD.getRolA() + ";" : "\n";		
					attribute += relationJJD.getMultiplicityA().equalsIgnoreCase("1") ? "\tfinal " + relationJJD.getSource().getName() +"? " + relationJJD.getRolA().toLowerCase() + ";" : "\n";
					attribute2 += "\t\tthis." + relationJJD.getRolA().toLowerCase() + "\n";		
				}
			}
		}
		typesAttributes.add(attribute);
		typesAttributes.add(attribute2);
		return typesAttributes;
	}
	
	private String getMethodsClass(abstractJJD.ClassJJD classJJD) {
		String method = "";
		
		for (abstractJJD.MethodJJD methodJJD : classJJD.getListMethodsJJD()) {
			
			method += "\t" + methodJJD.getReturnType() + " " + (methodJJD.getModifier() != null && methodJJD.getModifier().equalsIgnoreCase("private") ? "_" : "" ) + methodJJD.getName() + "(" + getParametersMethod(methodJJD) + ") {\n";
			method += methodJJD.getReturnType().equalsIgnoreCase("void") ? "" : "\t\t" + methodJJD.getReturnType() + " variable; \n";
			method += methodJJD.getReturnType().equalsIgnoreCase("void") ? "" : "\t\treturn variable;" + "\n";
			method += "\t}\n\n";
		}
		return method;
	}

	private String getParametersMethod(abstractJJD.MethodJJD methodJJD) {
		String parameter = "";
				
		for (abstractJJD.AttributeJJD attibuteJJD : methodJJD.getListAttributesJJD()) {
			parameter += attibuteJJD.getType()+ "? " + attibuteJJD.getName() + ", ";		
		}
		return parameter;
	}

}
