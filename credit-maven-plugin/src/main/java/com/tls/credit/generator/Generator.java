package com.tls.credit.generator;

import java.util.ArrayList;
import java.util.List;

import com.thoughtworks.qdox.model.BeanProperty;
import com.thoughtworks.qdox.model.JavaAnnotation;
import com.thoughtworks.qdox.model.JavaClass;
import com.thoughtworks.qdox.model.JavaField;
import com.thoughtworks.qdox.model.JavaMethod;

public class Generator {

	private JavaClass javaClass;
	private StringBuilder source;
	
	public Generator(JavaClass javaClass){
		this.javaClass = javaClass;
		source = removeEndBlock(javaClass.getSource().getCodeBlock());
		
	}
	
	private StringBuilder removeEndBlock(String source){
		int lastIndexOf = source.lastIndexOf("}");
		return new StringBuilder(source.substring(0, lastIndexOf));
	}
	
	private void addEndBlock(){
		source.append("\n");
		source.append("}");
	}
	
	
	public void addEquelMethod(){
		
		MethodGenerator methodGenerator = new MethodGenerator();
		methodGenerator.setComment("ok");
		AnnotationGenerator annotationGenerator = new AnnotationGenerator();
		
		List<JavaField> identifications = new ArrayList<JavaField>();
		for (JavaField javaField : javaClass.getFields()) {
			for (JavaAnnotation javaAnnotation : javaField.getAnnotations()) {
				if(javaAnnotation.getType().getName().equalsIgnoreCase("Id")){
					identifications.add(javaField);
				}
			}
		}
		
		
		
		System.out.println(javaClass.getMethods().add(methodGenerator));
		
		

		
//		
//			
//				
//
//			User other = (User) object;
//			if (this.id != null && other.id != null)
//				return this.id.longValue() == other.id.longValue();
//
//			return false;
		
		
		source.append("@Override\n");
		source.append("public boolean equals(Object object) {\n");
		
		
		source.append("if (object == null || !(object instanceof " + javaClass.getName() + "))\n");
		source.append("\t return false;\n");
		source.append("\n");
		source.append("\n");
		source.append("\n");
		source.append("\n");
		source.append("}\n");
		
	}
	
	
	public void generate(){
		addEndBlock();
		System.out.println(source);
		
	}
	
}
