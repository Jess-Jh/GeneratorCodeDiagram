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

import javax.swing.JFileChooser;
import javax.swing.filechooser.FileNameExtensionFilter;

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
					
					abstractJJD.RelationJJD relationJJDSource = AbstractJJDFactory.eINSTANCE.createRelationJJD();
					relationJJDSource.setTarget(classJJDSource);
					relationJJDSource.setSource(classJJDTarget);
					
					classJJDSource.getListRelationsJJD().add(relationJJDSource);
					
					abstractJJD.RelationJJD relationJJDTarget = AbstractJJDFactory.eINSTANCE.createRelationJJD();
					relationJJDTarget.setTarget(classJJDSource);
					relationJJDTarget.setSource(classJJDTarget);
					
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
			methodJJD.setReturnType(method.getModifier());
			
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
		
		content.append("class " + classJJD.getName() + " {\n"
				+ "\n"
				+ "\t" + classJJD.getName() + "();\n\n"
				+ getAttributesClass(classJJD) + "\n"
				+ "\n"
				+ getMethodsClass(classJJD) + "\n"
				+ "}");
		
		CreateFile(classJJD.getName()+".dart",content);
	}

	private void CreateFile(String nombreClase, StringBuilder content) {
		
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
		
		
		String routeDesktop = System.getProperty("user.home") + "/Desktop/ClassDart";
		String routeFile = routeDesktop + "/" + nombreClase;
		
		File carpeta = new File(routeDesktop);
	    if (!carpeta.exists()) {
	        carpeta.mkdirs();
	    }
       
	    try (BufferedWriter write = new BufferedWriter(new FileWriter(routeFile))){
	        	
            write.write(content.toString());
            write.close();
	        System.out.println("Se ha creado el archivo " + nombreClase + " en la siguiente ruta: " + routeDesktop);
	    } catch (IOException e) {
	        System.out.print(e);
	        e.printStackTrace();
	            
	    }
	}

	private String getAttributesClass(abstractJJD.ClassJJD classJJD) {
		String attribute = "";
		
		for (abstractJJD.AttributeJJD attibuteJJD : classJJD.getListAttributesJJD()) {
			attribute += "\tfinal " + attibuteJJD.getType() +"? " + attibuteJJD.getName() + ";" + "\n";		
		}
		return attribute;	
	}
	
	private String getMethodsClass(abstractJJD.ClassJJD classJJD) {
		String method = "";
		
		for (abstractJJD.MethodJJD methodJJD : classJJD.getListMethodsJJD()) {
			
			System.out.println(methodJJD.getName());
			System.out.println(methodJJD.getReturnType());
			
			method += "" + methodJJD.getReturnType() + " " + methodJJD.getName()
					+ methodJJD.getListAttributesJJD().size() == "0" ? "(" : "({" + getParametersMethod(methodJJD) + methodJJD.getListAttributesJJD().size() == "0" ? ")" : "}) {" + "\n"
					+ "\t" + methodJJD.getReturnType() + "returnVariable;" + "\n\n"
					+ methodJJD.getReturnType() != "void" ?  "return " + " returnVariable;" : "" + "\n"
					+ "} \n\n";
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
