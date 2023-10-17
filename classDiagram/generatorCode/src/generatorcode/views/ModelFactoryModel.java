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
import uidiagram.Appbar;
import uidiagram.Button;
import uidiagram.Checkbox;
import uidiagram.ComboBox;
import uidiagram.DatePicker;
import uidiagram.Group;
import uidiagram.GroupColumn;
import uidiagram.GroupRow;
import uidiagram.Input;
import uidiagram.Label;
import uidiagram.ListView;
import uidiagram.ModelFactory;
import uidiagram.RadioButton;
import uidiagram.Switch;
import uidiagram.Tabbar;
import uidiagram.Table;
import uidiagram.TemplateWidget;
import uidiagram.UidiagramFactory;
import uidiagram.UserInterface;

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
	ModelFactory modelFactoryUiDiagram = UidiagramFactory.eINSTANCE.createModelFactory();

	public ModelFactoryModel() {
	// TODO Auto-generated constructor stub

	modelFactoryConcrete = uploadConcrete();
	modelFactoryAbstract = uploadAbstract();
	modelFactoryUiDiagram = uploadUIDiagram();

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
	
	public ModelFactory uploadUIDiagram() {
		ModelFactory modelFactory = null;
		
		ConcretePackage whoownmePackage =  ConcretePackage.eINSTANCE;
		org.eclipse.emf.ecore.resource.ResourceSet resourceSet = new org.eclipse.emf.ecore.resource.impl.ResourceSetImpl();		
		org.eclipse.emf.common.util.URI uri = org.eclipse.emf.common.util.URI.createURI("platform:/resource/test/src/model/model.uidiagram");
		org.eclipse.emf.ecore.resource.Resource resource = resourceSet.createResource(uri);
		
		try {
			resource.load(null);
			modelFactory = (ModelFactory)resource.getContents().get(0);
			System.out.println("loaded: " + modelFactory);
		}
		catch (java.io.IOException e) {
			System.out.println("failed to read " + uri); 		
			System.out.println(e);
		}
		return modelFactory;
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
		
		CreateFile(classJJD.getName()+".dart",content, true);
	}

	private void CreateFile(String nameClass, StringBuilder content, boolean isModel) {
		
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
        	if(isModel) {
        		routeDesktop = System.getProperty("user.home") + "\\Desktop\\ProjectModeling\\Models";        		
        	} else {
        		routeDesktop = System.getProperty("user.home") + "\\Desktop\\ProjectModeling\\Pages";        		
        	}
    		routeFile = routeDesktop + "\\" + nameClass;
    		
        } else if (operatingSystem.contains("mac")) {
        	if(isModel) {
        		routeDesktop = System.getProperty("user.home") + "/Desktop/ProjectModeling/Models";        		
        	} else {
        		routeDesktop = System.getProperty("user.home") + "/Desktop/ProjectModeling/Pages";        		
        	}
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
	
	

	//--------------------------------------------------------------------------- TRANFORMATION FRAMEWORK --------------------------------------------------------------------------------------------------------------------------->>
	
	private boolean haveAppbar = false;
	public void transformationFramework() {
		for(uidiagram.UIDiagram uidiagram : modelFactoryUiDiagram.getListDiagrams()) {
			createFlutterFile(uidiagram.getUserInterface());	
		}
	}

	private void createFlutterFile(UserInterface userInterface) {
		StringBuilder content = new StringBuilder();
		
			
			content.append("import 'package:flutter/material.dart';\n"
					+ "\n"
					+ "class " +  "UserInterfacePage"  + " extends StatelessWidget {\n"
					+ "  const " + (userInterface.getName() != "" ? userInterface.getName()+"Page" : "UserInterfacePage")  + "({super.key});\n"
					+ "\n"
					+ "  @override\n"
					+ "  Widget build(BuildContext context) {\n"
					+ "    return Scaffold(\n");
					
					for(uidiagram.TemplateWidget template : userInterface.getListTemplateWidget()) {
					
						content.append(validateTypeTemplate(template));
					}
			
		content.append( "  );\n"
				+ "  }\n"
				+ "}\n"
			);
			System.out.println(content.toString());
//			CreateFile(userInterface.getName()+"Page"+".dart",content, false);
	}
	
	private StringBuilder validateTypeTemplate(TemplateWidget template) {
		StringBuilder content = new StringBuilder();
		
		if(template instanceof Appbar) {
			content.append(generateAppbar((Appbar)template));
		}
		if(template instanceof Group) {
			content.append(generateGroup((Group)template));
		}
		if(template instanceof GroupColumn) {
			content.append(generateGroupColumn((GroupColumn)template));
		}
		if(template instanceof GroupRow) {
			content.append(generateGroupRow((GroupRow)template));
		}
		if(template instanceof Tabbar) {
			content.append(generateTabbar((Tabbar)template));
		}
		if(template instanceof Button) {
			content.append(generateButton((Button)template));
		}
		if(template instanceof Label) {
			content.append(generateLabel((Label)template));
		}
		if(template instanceof Checkbox) {
			content.append(generateCheckbox((Checkbox)template));
		}
		if(template instanceof Input) {
			content.append(generateInput((Input)template));
		}
		if(template instanceof ListView) {
			content.append(generateListView((ListView)template));
		}
		if(template instanceof RadioButton) {
			content.append(generateRadioButton((RadioButton)template));
		}
		if(template instanceof ComboBox) {
			content.append(generateComboBox((ComboBox)template));
		}
		if(template instanceof DatePicker) {
			content.append(generateDatePicker((DatePicker)template));
		}
		if(template instanceof Switch) {
			content.append(generateSwitch((Switch)template));
		}
		if(template instanceof Table) {
			content.append(generateTable((Table)template));
		}	
		
		return content;
	}

	private StringBuilder generateGroup(Group group) {
		StringBuilder content = new StringBuilder();
			
			content.append( (haveAppbar ? "\tbody: " : "") + "Container(\n"
					+ "          width: " + (group.getWidth() != 0 ? group.getWidth() : " double.infinity,") + "\n"
					+ "          constraints: const BoxConstraints(minHeight: " + (group.getHeight() != 0 ? group.getHeight() : "44)") + ",\n"
					+ "          padding: const EdgeInsets.symmetric(vertical: 10, horizontal: 16),\n"
					+ "          borderRadius: BorderRadius.circular("+ (group.getBorderRadius() != null ? group.getBorderRadius() : "0") +"),\n"		
					+ "          decoration: BoxDecoration(\n"
					+ "            color: " + (group.getBackgroundColor() != null ? "Color(0xFF"+ group.getBackgroundColor()+"),"  : "Colors.transparent,") + "\n"
					+ "            border: Border.all(\n"
					+ "            	width: 1,\n"
					+ "            	color: scheme.lineMiddle,\n"
					+ "            ),\n"
					+ "          ),\n"
					+ "          child: ");
			
			haveAppbar = false;
						
				
			content.append(validateTypeTemplate(group.getTemplateWidget()) + "\n");
			
			content.append( "    ),\n");
		return content;
	}

	private StringBuilder generateGroupColumn(GroupColumn groupColumn) {
		StringBuilder content = new StringBuilder();

			content.append("Column(\n"
					+ "		  crossAxisAlignment: CrossAxisAlignment.start,\n"
					+ "		  children: [\n");
			
			for(uidiagram.TemplateWidget groupColumnChild : groupColumn.getListTemplateWidget()) {
				
				content.append(validateTypeTemplate(groupColumnChild));     
			}
			
		content.append( "	  ],\n"
					+ "    ),\n"
			);
		return content;
	}
	private StringBuilder generateGroupRow(GroupRow groupRow) {
		StringBuilder content = new StringBuilder();
		
			
			content.append("\tRow(\n"
					+ "		   mainAxisAlignment: MainAxisAlignment.center,\n"
					+ "		  children: [\n");

			for(uidiagram.TemplateWidget groupRowChild : groupRow.getListTemplateWidget()) {
			
				content.append(  validateTypeTemplate(groupRowChild));
			}
			
			content.append("  ],\n"
					+ "		),\n"
			);
		return content;
		
	}
	private StringBuilder generateAppbar(Appbar appbar) {
		StringBuilder content = new StringBuilder();
		
		haveAppbar = true;
		
//		for(uidiagram.TemplateWidget appbarChild : appbar.getListButtons()) {
			
			content.append("\tappbar: AppBar(\n"
						+ "      title: Text(\n"
						+ "        title,\n"
						+ "        style: Theme.of(context).textTheme.displayLarge!.copyWith(\n"
						+ "              fontSize: fontSizeTitle,\n"
						+ "              color: const Color(0xFFFFFFFF),\n"
						+ "            ),\n"
						+ "      ),\n"
						+ "      centerTitle: centerTitle,\n"
						+ "      automaticallyImplyLeading: false,\n"
						+ "      systemOverlayStyle: SystemUiOverlayStyle.light,\n"
						+ "      leading: leadingTap != null ? buildLeadingButton() : leading,\n"
						+ "      leadingWidth: 50,\n"
						+ "      actions: actionIcon != null || actionText != null\n"
						+ "          ? [buildActionButton()]\n"
						+ "          : actions,\n"
						+ "      shape: const RoundedRectangleBorder(\n"
						+ "        borderRadius: BorderRadius.vertical(\n"
						+ "          bottom: Radius.circular(12),\n"
						+ "        ),\n"
						+ "      ),\n"
						+ "      shadowColor: Theme.of(context).brightness == Brightness.light\n"
						+ "          ? const Color(0xFF000000)\n"
						+ "          : const Color(0xFFFFFFFF),\n"
						+ "      elevation: Theme.of(context).brightness == Brightness.light ? 5 : 0.3,\n"
						+ "    );\n"
			);
//		}
		return content;
		
	}
	private StringBuilder generateTabbar(Tabbar template) {
		// TODO Auto-generated method stub
		StringBuilder content = new StringBuilder();
		
		return content;
		
	}
	private StringBuilder generateButton(Button button) {
		StringBuilder content = new StringBuilder();
					
			content.append("GestureDetector(\n"
					+ "      onTap: () {},\n"
					+ "      child: Container(\n"
					+ "        constraints: BoxConstraints(minWidth: width ?? 0),\n"
					+ "        height: height,\n"
					+ "        padding: const EdgeInsets.symmetric(horizontal: 8),\n"
					+ "        decoration: BoxDecoration(\n"
					+ "          color: " + (button.getBackgroundColor() != null ? button.getBackgroundColor() : "  Colors.white,") + "\n"
					+ "          borderRadius: BorderRadius.circular(5),\n"
					+ "        ),\n"
					+ "        child:Text(\n"
					+                (button.getName() != null ? button.getName() : "")               
					+ "                style: TextStyle(\n"
					+ "                  fontWeight: FontWeight.bold,\n"
					+ "                  fontSize: 16,\n"
					+ "                ),\n"
					+ "              ),\n"
					+ "       ),\n"
					+ "     );\n"
			);
		return content;
		
	}
	private StringBuilder generateLabel(Label label) {
		StringBuilder content = new StringBuilder();
		
		content.append("Text(\n"
				+        label.getName()
				+ "      style: TextStyle(\n"
				+ "        fontSize: 16,\n"
				+ "        fontWeight: FontWeight.w500,\n"
				+ "        color: Scheme.colorScheme(context),\n"
				+ "      ),\n"
				+ "   ),\n"
		);
		return content;
	}
	private StringBuilder generateCheckbox(Checkbox checkbox) {
		StringBuilder content = new StringBuilder();
		
		content.append("Align(\n"
				+ "      alignment: Alignment.center,\n"
				+ "      child: Icon(\n"
				+ "              Icons.check_box,\n"
				+ "              size: 20,\n"
				+ "              color: " + (checkbox.getBackgroundColor() != null ? checkbox.getBackgroundColor() :  " Colors.blue,\n")
				+ "      )\n"
				+ "    );\n"
		);
		return content;
		
	}
	private StringBuilder generateInput(Input input) {
		StringBuilder content = new StringBuilder();
		
		content.append("\tTextField(\n"
				+ "       textAlignVertical: TextAlignVertical.center,\n"
				+ "       decoration: InputDecoration(\n"
				+ "       	isDense: true,\n"
				+ "       	hintText: " + (input.getName() != null ? input.getName() : "") + ",\n"
				+ "       	contentPadding: const EdgeInsets.symmetric(horizontal: 17),\n"
				+ "        	border: InputBorder.none,\n"
				+ "       ),\n"
				+ "       onChanged: (value) {},\n"
				+ "       style: const TextStyle(\n"
				+ "         height: 1.3,\n"
				+ "       ),\n"
				+ "   ),\n"
		);
		return content;	
	}
	private StringBuilder generateListView(ListView listView) {
		StringBuilder content = new StringBuilder();
		
		content.append("ListView.builder(\n"
				+ "          physics: const BouncingScrollPhysics(),\n"
				+ "          controller: ctrl.scrollContactsController,\n"
				+ "          itemCount: 10,\n"
				+ "          padding: const EdgeInsets.only(bottom: 100),\n"
				+ "          itemBuilder: (context, index) {\n"
				+ "\n"
				+ "            return "+ validateTypeTemplate(listView.getTemplateWidget())  +"\n"
				+ "          },\n"
				+ "     ),\n"
		);
		return content;
		
	}
	private StringBuilder generateRadioButton(RadioButton radioButton) {
		StringBuilder content = new StringBuilder();
		
		content.append("AnimatedSwitcher(\n"
				+ "			duration: const Duration(milliseconds: 100),\n"
				+ "		    child: AnimatedContainer(\n"
				+ "		    duration: const Duration(milliseconds: 200),\n"
				+ "		    width: " + (radioButton.getWidth() != 0 ? radioButton.getWidth() : "20")  + ",\n"
				+ "	        height: " + (radioButton.getHeight() != 0 ? radioButton.getHeight() : "20")  + ",\n"
				+ "		    decoration: BoxDecoration(\n"
				+ "	         border: Border.all(\n"
				+ "				width: 1.5,\n"
				+ "				color: Colors.blue,\n"
				+ "			 ),\n"
				+ "			 borderRadius: BorderRadius.circular(size / 2),\n"
				+ "			),\n"
				+ "			child: Align(\n"
				+ "				alignment: Alignment.center,\n"
				+ "				child: AnimatedOpacity(\n"
				+ "				duration: const Duration(milliseconds: 200),\n"
				+ "				opacity: 1,\n"
				+ "				child: Container(\n"
				+ "					height: (size - 10).clamp(4, 8),\n"
				+ "					width: (size - 10).clamp(4, 8),\n"
				+ "					decoration: BoxDecoration(\n"
				+ "			    		color: Colors.blue,\n"
				+ "			    	 	borderRadius: BorderRadius.circular(8 / 2),\n"
				+ "					),\n"
				+ "			  	),\n"
				+ "				),\n"
				+ "			),\n"
				+ "		  ),\n"
				+ "		);\n"
		);
		return content;
	}
	private StringBuilder generateComboBox(ComboBox comboBox) {
		StringBuilder content = new StringBuilder();
		
		content.append("DropdownButton(\n"
				+ "        value: '',\n"
				+ "        onChanged: (items) {},\n"
				+ "        underline: Container(),\n"
				+ "        icon: const Icon(Icons.keyboard_arrow_down),\n"
				+ "        isExpanded: true,\n"
				+ "        items: items,\n"
				+ "      ),\n"
		);
		return content;
		
	}
	private StringBuilder generateDatePicker(DatePicker datePicker) {
		StringBuilder content = new StringBuilder();
		
		content.append("CupertinoDatePicker(\n"
				+ "       mode: CupertinoDatePickerMode.date,\n"
				+ "       initialDateTime: DateTime.now(),\n"
				+ "       onDateTimeChanged: (d) {\n"
				+ "        \n"
				+ "       },\n"
				+ "    ),\n"
		);
		return content;
		
	}
	private StringBuilder generateSwitch(Switch template) {
		StringBuilder content = new StringBuilder();
		
		content.append("AnimatedContainer(\n"
				+ "      height: 24,\n"
				+ "      width: 44,\n"
				+ "      duration: const Duration(milliseconds: 200),\n"
				+ "      curve: Curves.easeInOut,\n"
				+ "      decoration: BoxDecoration(\n"
				+ "        color: const Color(0xFF39D047),\n"
				+ "        borderRadius: BorderRadius.circular(11),\n"
				+ "      ),\n"
				+ "      child: AnimatedAlign(\n"
				+ "        alignment: Alignment.centerLeft,\n"
				+ "        duration: const Duration(milliseconds: 200),\n"
				+ "        curve: Curves.easeInOut,\n"
				+ "        child: Container(\n"
				+ "          height: 20,\n"
				+ "          width: 20,\n"
				+ "          margin: const EdgeInsets.symmetric(horizontal: 2),\n"
				+ "          decoration: BoxDecoration(\n"
				+ "            color: Colors.white,\n"
				+ "            borderRadius: BorderRadius.circular(18),\n"
				+ "          ),\n"
				+ "        ),\n"
				+ "      ),\n"
				+ "    );\n"
		);
		return content;
		
	}
	private StringBuilder generateTable(Table table) {
		StringBuilder content = new StringBuilder();
		
		content.append("DataTable(\n"
			+ "		 columns: [\n"
			
			+        generateColumnsTable(table)
			
			+ "		 ],\n"
			+ "	   );\n"
		);
		
		return content;
		
	}

	private StringBuilder generateColumnsTable(Table table) {
		StringBuilder content = new StringBuilder();
		
		for(uidiagram.Column column : table.getListCoulmns()) {
			content.append("DataColumn(label: Text("+ column.getName() + ")),\n");
		}
		return content;
	}
}













