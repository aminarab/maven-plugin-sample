package com.tls.credit.plugin;

import java.util.ArrayList;
import java.util.List;

import org.apache.maven.plugin.AbstractMojo;
import org.apache.maven.plugin.MojoExecutionException;
import org.apache.maven.plugin.MojoFailureException;
import org.apache.maven.plugins.annotations.LifecyclePhase;
import org.apache.maven.plugins.annotations.Mojo;
import org.apache.maven.plugins.annotations.Parameter;
import org.apache.maven.project.MavenProject;

import com.thoughtworks.qdox.JavaProjectBuilder;
import com.thoughtworks.qdox.model.JavaSource;
import com.tls.credit.validator.BLValidator;
import com.tls.credit.validator.ClassValidator;
import com.tls.credit.validator.EntityValidator;
import com.tls.credit.validator.IValidator;
import com.tls.credit.validator.ORMXMLValidator;

/**
 * usage com.tls.credit.plugin:credit-maven-plugin:0.0.1-SNAPSHOT:CodeReview
 *
 */
@Mojo(name = "CodeReview", defaultPhase = LifecyclePhase.COMPILE)
public class CreditPlugin extends AbstractMojo {

	@Parameter(defaultValue = "${project}", required = true, readonly = true)
	private MavenProject project;

	@Parameter(property = "CodeReview.enable", defaultValue = "true")
	private Boolean enable;

	public void execute() throws MojoExecutionException, MojoFailureException {
		if (enable) {
			JavaProjectBuilder builder = new JavaProjectBuilder();
			builder.addSourceTree(project.getBasedir());
			for (JavaSource javaSource : builder.getSources()) {
				List<IValidator> validators = new ArrayList<IValidator>();
				ArtifactType artifactType = findArtifactType(javaSource);
				switch (artifactType) {
				case ENTITY:
					validators.add(new EntityValidator(javaSource));
					break;	
				case BL_CLASS:
					validators.add(new BLValidator(javaSource));
					break;	
				case ORM_XML:
					validators.add(new ORMXMLValidator(javaSource));
					break;					
				default:
					validators.add(new ClassValidator(javaSource));
					break;
				}
				
				printExceptionMessages(validate(validators));
				
				
				
//				EntityValidator entityValidator = new EntityValidator();
//				
//				entityValidator.setJavaSource(javaSource);
//				entityValidator.valid();
//				for (JavaClass javaClass : javaSource.getClasses()) {
//					Generator generator = new Generator(javaClass);
//					generator.addEquelMethod();
//					generator.generate();
//					javaClass.getMethods();
//
//					
//					
//					if (javaClass.getName().equalsIgnoreCase("Bootstrap")) {
//						System.out.println(javaClass.getPackageName());
//					}
//					// for (JavaField javaField : javaClass.getFields()) {
//					// columns.put(javaField.getName(), javaField.getType()
//					// .getValue());
//					// }
//				}
//			getLog().info("salam jahan");
			}
		}
	}
	
	private ArtifactType findArtifactType(JavaSource javaSource){
		return null;
	}
	
	private List<ExceptionMessage> validate(List<IValidator> validators){
		List<ExceptionMessage> exceptionMessages = new ArrayList<ExceptionMessage>();
		for (IValidator validator : validators) {
			if(!validator.valid()){
				exceptionMessages.addAll(validator.getExcepMessages()); 
			}
		}
		return exceptionMessages;
	}
	
	private void printExceptionMessages(List<ExceptionMessage> exceptionMessages){
		
	}
	
}