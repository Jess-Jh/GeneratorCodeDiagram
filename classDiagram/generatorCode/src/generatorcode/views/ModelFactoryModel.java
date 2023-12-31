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
import relationalmodel.DataType;
import relationalmodel.ModelFactoryAbstractRelationalModel;
import relationalmodel.RelationalmodelFactory;
import relationalmodel.Schema;

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
	ModelFactoryAbstractRelationalModel modelFactoryAbstractRelationalModel = RelationalmodelFactory.eINSTANCE.createModelFactoryAbstractRelationalModel();

	public ModelFactoryModel() {

		modelFactoryConcrete = uploadConcrete();
		modelFactoryAbstract = uploadAbstract();
		modelFactoryUiDiagram = uploadUIDiagram();
		modelFactoryAbstractRelationalModel = uploadRelationalModel();
		
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
	
	public ModelFactoryAbstractRelationalModel uploadRelationalModel() {
		ModelFactoryAbstractRelationalModel modelFactory = null;
		
		ConcretePackage whoownmePackage =  ConcretePackage.eINSTANCE;
		org.eclipse.emf.ecore.resource.ResourceSet resourceSet = new org.eclipse.emf.ecore.resource.impl.ResourceSetImpl();		
		org.eclipse.emf.common.util.URI uri = org.eclipse.emf.common.util.URI.createURI("platform:/resource/test/src/model/model.relationalmodel");
		org.eclipse.emf.ecore.resource.Resource resource = resourceSet.createResource(uri);
		
		try {
			resource.load(null);
			modelFactory = (ModelFactoryAbstractRelationalModel)resource.getContents().get(0);
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
	
	public void transformationFramework() {
		for(uidiagram.UIDiagram uidiagram : modelFactoryUiDiagram.getListDiagrams()) {
			createFlutterFile(uidiagram.getUserInterface());	
		}
	}

	private void createFlutterFile(UserInterface userInterface) {
		StringBuilder content = new StringBuilder();
		
			
			content.append("import 'package:flutter/cupertino.dart';\n"
					+ "import 'package:flutter/material.dart';\n"
					+ "\n"
					+ "class " +  (userInterface.getName() != "" ? userInterface.getName()+"Page" : "RegisterPage")  + " extends StatefulWidget {\n"
					+ "  const " + (userInterface.getName() != "" ? userInterface.getName()+"Page" : "RegisterPage")  + "({super.key});\n"
					+ "\n"
					+ "  @override\n"
					+ "  State<"+ (userInterface.getName() != "" ? userInterface.getName()+"Page" : "RegisterPage") + "> createState() =>" + (userInterface.getName() != "" ? "_"+userInterface.getName()+"PageState()" : "_RegisterPageState()")  + ";\n"
					+ "}\n"
					+ "\n"
					+ "class " + (userInterface.getName() != "" ? "_"+userInterface.getName()+"PageState" : "_RegisterPageState")  + " extends State<" + (userInterface.getName() != "" ? userInterface.getName()+"Page" : "RegisterPage")  + "> {\n"
					+ "  DateTime? selectedDate;\n"
					+ "  bool isSwitch = false, checkboxSelected = false, radiosButtonSelected = false;\n"
					+ "  String selectedValue = 'Opción 1';\n"
					+ "  List<String> options = ['Opción 1', 'Opción 2', 'Opción 3', 'Opción 4'];\n"
					+ "\n"
					+ "  @override\n"
					+ "  Widget build(BuildContext context) {\n"
					+ "    return DefaultTabController(\n"
					+ "    length: " + (getNumberButtons(userInterface) != 0 ? getNumberButtons(userInterface) : "10") + ",\n"
					+ "    child: Scaffold(\n");
					
			for (uidiagram.TemplateWidget template : userInterface.getListTemplateWidget()) {

				if (template instanceof Appbar) {
					content.append(generateAppbar((Appbar) template));
				}
			}


			content.append("body: Container(\n"
			 + "            padding: const EdgeInsets.symmetric(horizontal: 14, vertical: 16),\n"
				   + "            child: SingleChildScrollView(\n"
			 + "              child: Column(\n" 
			 + "			  crossAxisAlignment: CrossAxisAlignment.start,\n"
			 + "	      	  children: [\n");
			for (uidiagram.TemplateWidget template : userInterface.getListTemplateWidget()) {
				content.append(validateTypeTemplate(template));
				content.append("SizedBox(height: 20),\n");
			}

		    content.append("	],\n" 
				    + "  	),\n");
			
		content.append( "  	),\n"
				+ "		   ),\n"
				+ "		  ),\n"				
				+ "		);\n"
				+ "  }\n"
				+ "}\n"
			);
//			System.out.println(content.toString());
			CreateFile(userInterface.getName()+"Page"+".dart",content, false);
	}
	
	private int getNumberButtons(UserInterface userInterface) {
		int cont = 0;
		for (uidiagram.TemplateWidget template : userInterface.getListTemplateWidget()) {

			if (template instanceof Appbar) {
				cont =+ ((Appbar)template).getListButtons().size();
				cont =+ ((Appbar)template).getListLabels().size();
				
				return cont;
			}
		}
		return cont;
	}
	
	private StringBuilder validateTypeTemplate(TemplateWidget template) {
		StringBuilder content = new StringBuilder();
		
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
			
			content.append("Container(\n"
					+ "          width: " + (group.getWidth() != 0 ? group.getWidth() : " double.infinity") + ",\n"
					+ "          constraints: const BoxConstraints(minHeight: " + (group.getHeight() != 0 ? group.getHeight() : "44") + "),\n"
					+ "          padding: const EdgeInsets.symmetric(vertical: 10, horizontal: 16),\n"
					+ "          decoration: BoxDecoration(\n"
					+ "            borderRadius: BorderRadius.circular("+ (group.getBorderRadius() != null ? group.getBorderRadius() : "0") +"),\n"		
					+ "            color: " + (group.getBackgroundColor() != null ? "Color(0xFF"+ group.getBackgroundColor()+"),"  : "Colors.transparent,") + "\n"
					+ "            border: Border.all(\n"
					+ "            	width: " + (group.getBorderWidth() != null ? group.getBorderWidth() : " 1" + ",\n")
					+ "            	color: " + (group.getBorderColor() != null ? group.getBorderColor() : "Colors.transparent" + ",\n")
					+ "            ),\n"
					+ "          ),\n"
					+           (group.getTemplateWidget() != null ? "child: " : "" ));						
				
			content.append(validateTypeTemplate(group.getTemplateWidget()) + "\n");
			
			content.append( "    ),\n");
		return content;
	}

	private StringBuilder generateGroupColumn(GroupColumn groupColumn) {
		StringBuilder content = new StringBuilder();

			content.append("Column(\n"
					+ "		  crossAxisAlignment: CrossAxisAlignment."+ (groupColumn.getAlignment() != null ? groupColumn.getAlignment() : "start" ) +",\n"
					+ "		  children: [\n");
			
			for(uidiagram.TemplateWidget groupColumnChild : groupColumn.getListTemplateWidget()) {
				
				content.append(validateTypeTemplate(groupColumnChild));     
				content.append("SizedBox(height: 20),\n");
			}
			
		content.append( "	  ],\n"
					+ "    ),\n"
			);
		return content;
	}
	private StringBuilder generateGroupRow(GroupRow groupRow) {
		StringBuilder content = new StringBuilder();
		 
			
			content.append("\tRow(\n"
					+ "		   mainAxisAlignment: MainAxisAlignment." + (groupRow.getAlignment() != null ? groupRow.getAlignment() : "spaceBetween" ) +  ",\n"
					+ "		  children: [\n");

			for(uidiagram.TemplateWidget groupRowChild : groupRow.getListTemplateWidget()) {
				
				content.append(  validateTypeTemplate(groupRowChild));
				content.append("SizedBox(width: 10),\n");
			}
			
			content.append("  ],\n"
					+ "		),\n"
			);
		return content;
		
	}
	private StringBuilder generateAppbar(Appbar appbar) { 
		StringBuilder content = new StringBuilder();
				
			
			content.append("\tappBar: AppBar(\n"
						+ "      title: Text(\n"
						+ "'" +    appbar.getName() + "',\n"
						+ "        style: TextStyle(\n"
						+ "               fontSize: 30,\n"
						+ "        ),\n"
						+ "      ),\n"
						+ "      centerTitle: true,\n"
						+ "      bottom: TabBar(\n"
						+ "			tabs: [\n");
						
						for(uidiagram.TemplateWidget appbarChild : appbar.getListButtons()) content.append(generateButton((Button)appbarChild));
						for(uidiagram.TemplateWidget appbarChild : appbar.getListLabels()) content.append(generateLabel((Label)appbarChild));
						
						
		  content.append( "			],\n"
				  		+ "      ),"
						+ "      shape: const RoundedRectangleBorder(\n"
						+ "        borderRadius: BorderRadius.vertical(\n"
						+ "          bottom: Radius.circular(12),\n"
						+ "        ),\n"
						+ "      ),\n"
						+ "      shadowColor: const Color(0xFF000000),\n"
						+ "      elevation: Theme.of(context).brightness == Brightness.light ? 5 : 0.3,\n"
						+ "    ),\n"
			);
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
					+ "      onTap: () {\n"
					+ "		    Navigator.push(\n"
					+ "              context,\n"
					+ "              MaterialPageRoute(\n"
					+ "                  builder: (context) => " + (button.getNavigateTo() != null ? button.getNavigateTo()+"Page()" : "const SizedBox()") +"),\n"
					+ "            );"
					+ "		 },\n"
					+ "      child: Container(\n"
					+ "        alignment: Alignment.center,\n"
					+ "        padding: const EdgeInsets.symmetric(horizontal: 8),\n"
					+ "        height: " + (button.getHeight() != 0 ? button.getHeight() : "20") + ",\n"
					+ "        constraints: BoxConstraints(minWidth: " + (button.getWidth() != 0 ? button.getWidth() : "10") + "),\n"
					+ "        decoration: BoxDecoration(\n"
					+ "          color: " + (button.getBackgroundColor() != null ? "Color(0xFF" + button.getBackgroundColor() + ")" : "  Colors.white,") + ",\n"
					+ "          borderRadius: BorderRadius.circular(5),\n"
					+ "        ),\n"
					+ "        child:Text(\n"
					+                  (button.getName() != null ?  "'" + button.getName() + "'" : "") + ",\n"               
					+ "                style: TextStyle(\n"
					+ "                  fontWeight: FontWeight.bold,\n"
					+ "					 color: Colors.white,\n"
					+ "                  fontSize: 16,\n"
					+ "                ),\n"
					+ "              ),\n"
					+ "       ),\n"
					+ "     ),\n"
			);
		return content;
		
	}
	private StringBuilder generateLabel(Label label) {
		StringBuilder content = new StringBuilder();
		
		content.append("Text(\n"
				+        (label.getName() != null ? "'" +  label.getName() + "'" : "'Name'") + ",\n"
				+ "      style: TextStyle(\n"
				+ "        fontSize: " + (label.getFontSize() != null ? label.getFontSize() : " 16") + ",\n"
				+ "        fontWeight: " + (label.getFontWeight() != null && !(label.getFontWeight().isBlank()) ? "FontWeight."+ label.getFontWeight() : " FontWeight.w500") + ",\n"
				+ "        color: " + (label.getFontColor() != null ? "Color(0xFF"+ label.getFontColor()+")" :  " Colors.black") + ",\n"
				+ "      ),\n"
				+ "   ),\n"
		);
		return content;
	}
	private StringBuilder generateCheckbox(Checkbox checkbox) {
		StringBuilder content = new StringBuilder();
		
		content.append("Align(\n"
				+ "     alignment: Alignment.center,\n"
				+ "     child: GestureDetector(\n"
				+ "       onTap: () => setState(() {\n"
				+ "         checkboxSelected = !checkboxSelected;\n"
				+ "       }),\n"
				+ "       child: Icon(\n"
				+ "         checkboxSelected ? Icons.check_box : Icons.square,\n"
				+ "         size: 20,\n"
				+ "         color:\n"
				+ "             checkboxSelected ? " + (checkbox.getBackgroundColor() != null ? "Color(0xFF" +checkbox.getBackgroundColor() +")" : " Colors.blue") + " : Colors.grey[300],\n"
				+ "       ),\n"
				+ "     ),\n"
				+ "   ),"

		);
		return content;
		
	}
	private StringBuilder generateInput(Input input) {
		StringBuilder content = new StringBuilder();
		
		content.append("\tContainer(\n"
				+ "     height: " + (input.getHeight() != 0 ? input.getHeight() : "30") + ",\n"
				+ "     width: " + (input.getWidth() != 0 ? input.getWidth() : "MediaQuery.of(context).size.width * 0.7") + ",\n"
				+ "     decoration: BoxDecoration(\n"
				+ "        color: " + (input.getBackgroundColor() != null ? "Color(0xFF"+ input.getBackgroundColor() +")" : "const Color.fromARGB(255, 218, 216, 216),") + ",\n"
				+ "        borderRadius: BorderRadius.circular(5)),\n"
				+ "     child:TextField(\n"
				+ "       textAlignVertical: TextAlignVertical.center,\n"
				+ "       decoration: InputDecoration(\n"
				+ "       	isDense: true,\n"
				+ "       	hintText: " + (input.getName() != null ? input.getName() : "'Escribe tu texto...'") + ",\n"
				+ "       	contentPadding: const EdgeInsets.symmetric("
				+ "				horizontal: 15,\n"
				+ "         	vertical: 8,\n"
				+ "			),\n"
				+ "        	border: InputBorder.none,\n"
				+ "       ),\n"
				+ "       onChanged: (value) {},\n"
				+ "       style: const TextStyle(\n"
				+ "         height: 1.5,\n"
				+ "       ),\n"
				+ "   ),\n"
				+ "),\n"
		);
		return content;	
	}
	private StringBuilder generateListView(ListView listView) {
		StringBuilder content = new StringBuilder();
		
		content.append("ListView.builder(\n"
				+ "          physics: const BouncingScrollPhysics(),\n"
				+ "          itemCount: 10,\n"
				+ "		     shrinkWrap: true,\n"
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
		
		content.append("GestureDetector(\n"
				+ "     onTap: () => setState(() {\n"
				+ "       radiosButtonSelected = !radiosButtonSelected;\n"
				+ "     }),\n"
				+ "     child: AnimatedSwitcher(\n"
				+ "       duration: const Duration(milliseconds: 100),\n"
				+ "       child: AnimatedSwitcher(\n"
				+ "         duration: const Duration(milliseconds: 100),\n"
				+ "         child: AnimatedContainer(\n"
				+ "           duration: const Duration(milliseconds: 200),\n"
				+ "           width: 20,\n"
				+ "           height: 20,\n"
				+ "           decoration: BoxDecoration(\n"
				+ "             border: Border.all(\n"
				+ "               width: 1.5,\n"
				+ "               color: radiosButtonSelected\n"
				+ "                   ? " + (radioButton.getBackgroundColor() != null ? "Color(0xFF" +radioButton.getBackgroundColor() +")" : "Colors.blue") + "\n"
				+ "                   : Colors.grey,\n"
				+ "             ),\n"
				+ "             borderRadius: BorderRadius.circular(20 / 2),\n"
				+ "           ),\n"
				+ "           child: Align(\n"
				+ "             alignment: Alignment.center,\n"
				+ "             child: AnimatedOpacity(\n"
				+ "               duration: const Duration(milliseconds: 200),\n"
				+ "               opacity: radiosButtonSelected ? 1 : 0,\n"
				+ "               child: Container(\n"
				+ "                 height: (20.0 - 10).clamp(4, 8),\n"
				+ "                 width: (20.0 - 10).clamp(4, 8),\n"
				+ "                 decoration: BoxDecoration(\n"
				+ "                   color: radiosButtonSelected\n"
				+ "                       ? " + (radioButton.getBackgroundColor() != null ? "Color(0xFF" +radioButton.getBackgroundColor() +")" : "Colors.blue") + "\n"
				+ "                       : Colors.grey,\n"
				+ "                   borderRadius: BorderRadius.circular(8 / 2),\n"
				+ "                 ),\n"
				+ "               ),\n"
				+ "             ),\n"
				+ "           ),\n"
				+ "         ),\n"
				+ "       ),\n"
				+ "     ),\n"
				+ "   ),"

		);
		return content;
	}
	private StringBuilder generateComboBox(ComboBox comboBox) {
		StringBuilder content = new StringBuilder();
		
		content.append("DropdownButton<String>(\n"
				+ "     value: selectedValue,\n"
				+ "     items: options.map((String value) {\n"
				+ "       return DropdownMenuItem<String>(\n"
				+ "         value: value,\n"
				+ "         child: Text(value),\n"
				+ "       );\n"
				+ "     }).toList(),\n"
				+ "     onChanged: (value) => setState(() {\n"
				+ "       selectedValue = value ?? '';\n"
				+ "     }),\n"
				+ "   ),"
		);
		return content;
		
	}
	private StringBuilder generateDatePicker(DatePicker datePicker) {
		StringBuilder content = new StringBuilder();
		
		content.append("SizedBox(\n"
				+ "      height: 30,\n"
				+ "      width: 200,\n"
				+ "      child: ElevatedButton(\n"
				+ "        child: Text(selectedDate == null\n"
				+ "            ? 'Seleccionar Fecha'\n"
				+ "            : '${selectedDate?.day}/${selectedDate?.month}/${selectedDate?.year}'),\n"
				+ "        onPressed: () {\n"
				+ "        selectedDate = DateTime.now();\n"
				+ "\n"
				+ "        showCupertinoModalPopup(\n"
				+ "          context: context,\n"
				+ "          builder: (BuildContext context) {\n"
				+ "            return SizedBox(\n"
				+ "              height: 250,\n"
				+ "              width: double.infinity,\n"
				+ "              child: CupertinoDatePicker(\n"
				+ "                backgroundColor: Colors.white,\n"
				+ "                mode: CupertinoDatePickerMode.date,\n"
				+ "                initialDateTime: selectedDate,\n"
				+ "                onDateTimeChanged: (DateTime newDate) {\n"
				+ "                  setState(() {\n"
				+ "                    selectedDate = newDate;\n"
				+ "                  });\n"
				+ "                },\n"
				+ "              ),\n"
				+ "            );\n"
				+ "          },\n"
				+ "        );\n"
				+ "      },\n"
				+ "    ),\n"
				+ "  ),"
		);
		return content;
		
	}
	private StringBuilder generateSwitch(Switch template) {
		StringBuilder content = new StringBuilder();
		
		content.append("GestureDetector(\n"
				+ "     onTap: () => setState(() {\n"
				+ "       isSwitch = !isSwitch;\n"
				+ "     }),\n"
				+ "     child: AnimatedContainer(\n"
				+ "       height: 24,\n"
				+ "       width: 44,\n"
				+ "       duration: const Duration(milliseconds: 200),\n"
				+ "       curve: Curves.easeInOut,\n"
				+ "       decoration: BoxDecoration(\n"
				+ "         color: isSwitch\n"
				+ "             ? " + (template.getBackgroundColor() != null ? "Color(0xFF" + template.getBackgroundColor() +")" : "Colors.blue") + "\n"
				+ "             : const Color(0xFFC9CFD3),\n"
				+ "         borderRadius: BorderRadius.circular(11),\n"
				+ "       ),\n"
				+ "       child: AnimatedAlign(\n"
				+ "         alignment: isSwitch\n"
				+ "             ? Alignment.centerRight\n"
				+ "             : Alignment.centerLeft,\n"
				+ "         duration: const Duration(milliseconds: 200),\n"
				+ "         curve: Curves.easeInOut,\n"
				+ "         child: Container(\n"
				+ "           height: 20,\n"
				+ "           width: 20,\n"
				+ "           margin: const EdgeInsets.symmetric(horizontal: 2),\n"
				+ "           decoration: BoxDecoration(\n"
				+ "             color: Colors.white,\n"
				+ "             borderRadius: BorderRadius.circular(18),\n"
				+ "           ),\n"
				+ "         ),\n"
				+ "       ),\n"
				+ "     ),\n"
				+ "   ),\n"
		);
		return content;
		
	}
	private StringBuilder generateTable(Table table) {
		StringBuilder content = new StringBuilder();
		
		content.append("DataTable(\n"
			+ "		 columns: [\n"
			
			+        generateColumnsTable(table)
			
			+ "		 ],\n"
			+ "rows: const [\n"
			+ "  DataRow(selected: true, cells: [\n"
			+        generateRowsTable(table)
			+ "  ]),\n"
			+ " ],"
			
			+ "),\n"
		);
		
		return content;
		
	}

	private StringBuilder generateColumnsTable(Table table) {
		StringBuilder content = new StringBuilder();
		
		for(uidiagram.Column column : table.getListCoulmns()) {
			content.append("DataColumn(label: SizedBox(\n"
					+ "         width: MediaQuery.of(context).size.width * 0.2,\n"
					+ "			child: const Text("+  "'"+column.getName()+"'" + "),"
				    + "         ),"
				    + "     ),\n");
		}
		
		return content;
	}
	
	private StringBuilder generateRowsTable(Table table) {
		StringBuilder content = new StringBuilder();
	
		for(uidiagram.Column column : table.getListCoulmns()) {
			content.append("DataCell(Text('data')),\n");
		}

		return content;
	}
	//---------------------------------------------------------------------------------------------------------------------------------------------------------------||
	
	// ----------------------------------------------------- TRANSFORMACION MODELO ABSTRACTO A DSL ------------------------------------------------------------------>>
	public void saveAbstractRelationalModel() {
		//EXISTEN 2 FORMAS DE GUARDAR EL RECURSO
		org.eclipse.emf.common.util.URI uri = org.eclipse.emf.common.util.URI.createURI("platform:/resource/test/src/model/model.relationalmodel");
		org.eclipse.emf.ecore.resource.ResourceSet resourceSet = new org.eclipse.emf.ecore.resource.impl.ResourceSetImpl();
		org.eclipse.emf.ecore.resource.Resource resource = resourceSet.createResource(uri);
		resource.getContents().add(modelFactoryAbstractRelationalModel);
		
		try {
			resource.save(java.util.Collections.EMPTY_MAP);
		} catch (java.io.IOException e) {
			e.printStackTrace();
		}
		return;
	}
	
	public void transformationDSL() {
		
		for (abstractJJD.PackageJJD packageJJD : modelFactoryAbstract.getListPackagesJJD()) {	
			createSchema(packageJJD);
			addRelationsToTable(packageJJD);
		}
		saveAbstractRelationalModel();
	}
	
	private void createSchema(abstractJJD.PackageJJD parentPackage) {
		
		for (abstractJJD.PackageJJD packageJJD : parentPackage.getSubPackagesJJD()) {
			
			if(packageJJD.getListClassJJD().size() > 0) {
				
				relationalmodel.Schema schema = RelationalmodelFactory.eINSTANCE.createSchema();
				schema.setName(packageJJD.getName());
				
				for (abstractJJD.ClassJJD classJJD : packageJJD.getListClassJJD()) {
					relationalmodel.Table table = RelationalmodelFactory.eINSTANCE.createTable();
					table.setName(classJJD.getName());

					addAttributeToTable(classJJD, table, schema);
				}				
			}
			
			// Llamada recursiva solo si hay subpaquetes
	        if (!packageJJD.getSubPackagesJJD().isEmpty()) {
	            createSchema(packageJJD);
	        }			
		}
		
	}

	private void addAttributeToTable(abstractJJD.ClassJJD classJJD, relationalmodel.Table table, Schema schema) {
		
		relationalmodel.Column column = RelationalmodelFactory.eINSTANCE.createColumn();
		column.setName(table.getName()+"ID");
		column.setDataType(DataType.INT);
		column.setIsPrimaryKey(true);
		column.setUniqueIndex(true);
		column.setIsAutoIncremental(true);
		column.setNotNull(true);
				
		for(abstractJJD.AttributeJJD attribute : classJJD.getListAttributesJJD()) {
			
			if(attribute.getType().contains("List")) {
				
				relationalmodel.Table tableRelation = RelationalmodelFactory.eINSTANCE.createTable();
				tableRelation.setName(attribute.getName());
				
				relationalmodel.Column columnId = RelationalmodelFactory.eINSTANCE.createColumn();
				columnId.setName(tableRelation.getName()+"ID");
				columnId.setDataType(DataType.INT);
				columnId.setIsPrimaryKey(true);
				columnId.setUniqueIndex(true);
				columnId.setIsAutoIncremental(true);
				columnId.setNotNull(true);
				
				relationalmodel.Column column2 = RelationalmodelFactory.eINSTANCE.createColumn();
				column2.setName(attribute.getName());
				column2.setDataType(DataType.VARCHAR);
				column2.setSize(255);
				
				
				relationalmodel.Column column3 = RelationalmodelFactory.eINSTANCE.createColumn();
				
				column3.setName(table.getName()+"ID");
				column3.setDataType(DataType.INT);
				
				
				relationalmodel.Column column4 = RelationalmodelFactory.eINSTANCE.createColumn();
				column4.setName("FOREIGN KEY (" + column3.getName() + ") REFERENCES " + table.getName() + "(" + column3.getName() + ")");
				
				tableRelation.getListColumns().add(columnId);
				tableRelation.getListColumns().add(column2);
				tableRelation.getListColumns().add(column3);
				tableRelation.getListColumns().add(column4);
				
				schema.getListTables().add(tableRelation);
				
			} else {
				
				relationalmodel.Column column1 = RelationalmodelFactory.eINSTANCE.createColumn();
				
				column1.setName(attribute.getName());
				
				if(attribute.getType().equalsIgnoreCase("String")) {
					column1.setDataType(DataType.VARCHAR);
				}
				if(attribute.getType().equalsIgnoreCase("int")) column1.setDataType(DataType.INT);
				if(attribute.getType().equalsIgnoreCase("double")) column1.setDataType(DataType.DOUBLE);
				if(attribute.getType().equalsIgnoreCase("LocalDate")) column1.setDataType(DataType.DATE);
				if(attribute.getType().equalsIgnoreCase("boolean")) column1.setDataType(DataType.BOOLEAN);
				
				if(attribute.getType().equalsIgnoreCase("String")) {
					column1.setSize(255);		
				}
								
				table.getListColumns().add(column);
				table.getListColumns().add(column1);
				schema.getListTables().add(table);
				
			}	
			modelFactoryAbstractRelationalModel.getListSchemas().add(schema);
		}
	}
	
	private void addRelationsToTable(abstractJJD.PackageJJD parentPackage) {
		
		for (abstractJJD.PackageJJD packageJJD : parentPackage.getSubPackagesJJD()) {
			
			if(packageJJD.getListClassJJD().size() > 0) {
				
				for (relationalmodel.Schema schema : modelFactoryAbstractRelationalModel.getListSchemas()) {
					for (relationalmodel.Table table : schema.getListTables()) {
						
						for (abstractJJD.ClassJJD classJJD : packageJJD.getListClassJJD()) {
							
							if(table.getName().equalsIgnoreCase(classJJD.getName())) {
								
								for (abstractJJD.RelationJJD relationJJD : classJJD.getListRelationsJJD()) {
									
									if(relationJJD.getClass().getName().contains("ContainmentJJDImpl") || relationJJD.getClass().getName().contains("AgregationJJDImpl")) {
										
										if(relationJJD.getSource().getName().equalsIgnoreCase(table.getName())) {
											
											relationalmodel.Column column = RelationalmodelFactory.eINSTANCE.createColumn();
											
											column.setName(relationJJD.getTarget().getName()+"ID");
											column.setDataType(DataType.INT);
											
											relationalmodel.Column column1 = RelationalmodelFactory.eINSTANCE.createColumn();
											column1.setName("FOREIGN KEY (" + column.getName() + ") REFERENCES " + relationJJD.getTarget().getName() + "(" + column.getName() + ")");
											
											table.getListColumns().add(column);
											table.getListColumns().add(column1);
											
										}
										
									}
									
									if(relationJJD.getClass().getName().contains("AssociationJJDImpl") || relationJJD.getClass().getName().contains("InheritanceJJDImpl")) {
										
										if(relationJJD.getTarget().getName().equalsIgnoreCase(table.getName())) {
											
											relationalmodel.Column column = RelationalmodelFactory.eINSTANCE.createColumn();
											
											column.setName(relationJJD.getSource().getName()+"ID");
											column.setDataType(DataType.INT);
											
											relationalmodel.Column column1 = RelationalmodelFactory.eINSTANCE.createColumn();
											column1.setName("FOREIGN KEY (" + column.getName() + ") REFERENCES " + relationJJD.getSource().getName() + "(" + column.getName() + ")");
											
											table.getListColumns().add(column);
											table.getListColumns().add(column1);	
										}	
									}
								}
							}
						}
					}
				}
		
			}
			
			// Llamada recursiva solo si hay subpaquetes
	        if (!packageJJD.getSubPackagesJJD().isEmpty()) {
	        	addRelationsToTable(packageJJD);
	        }			
		}
		
	}
	
}













