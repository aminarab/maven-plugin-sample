package com.tls.credit.generator;

import java.util.List;

import com.thoughtworks.qdox.model.DocletTag;
import com.thoughtworks.qdox.model.JavaAnnotation;
import com.thoughtworks.qdox.model.JavaClass;
import com.thoughtworks.qdox.model.JavaGenericDeclaration;
import com.thoughtworks.qdox.model.JavaMethod;
import com.thoughtworks.qdox.model.JavaParameter;
import com.thoughtworks.qdox.model.JavaSource;
import com.thoughtworks.qdox.model.JavaType;
import com.thoughtworks.qdox.model.JavaTypeVariable;

public class MethodGenerator implements JavaMethod{

	private static final long serialVersionUID = 1L;

	private String comment;

	private List<JavaAnnotation> annotations;
	
	public String getComment() {
		return comment;
	}

	public void setComment(String comment) {
		this.comment = comment;
	}
	
	public List<JavaAnnotation> getAnnotations() {
		return annotations;
	}
	
	public void setAnnotations(List<JavaAnnotation> annotations) {
		this.annotations = annotations;
	}

	public String getNamedParameter(String arg0, String arg1) {
		// TODO Auto-generated method stub
		return null;
	}

	public DocletTag getTagByName(String arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	public List<DocletTag> getTags() {
		// TODO Auto-generated method stub
		return null;
	}

	public List<DocletTag> getTagsByName(String arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	public JavaClass getDeclaringClass() {
		// TODO Auto-generated method stub
		return null;
	}

	public List<String> getModifiers() {
		// TODO Auto-generated method stub
		return null;
	}

	public String getName() {
		// TODO Auto-generated method stub
		return null;
	}

	public boolean isAbstract() {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean isFinal() {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean isNative() {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean isPrivate() {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean isProtected() {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean isPublic() {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean isStatic() {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean isStrictfp() {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean isSynchronized() {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean isTransient() {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean isVolatile() {
		// TODO Auto-generated method stub
		return false;
	}

	public String getCodeBlock() {
		// TODO Auto-generated method stub
		return null;
	}

	public int getLineNumber() {
		// TODO Auto-generated method stub
		return 0;
	}

	public JavaSource getSource() {
		// TODO Auto-generated method stub
		return null;
	}

	public <D extends JavaGenericDeclaration> List<JavaTypeVariable<D>> getTypeParameters() {
		// TODO Auto-generated method stub
		return null;
	}

	public String getCallSignature() {
		// TODO Auto-generated method stub
		return null;
	}

	public String getDeclarationSignature(boolean arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	public List<JavaType> getExceptionTypes() {
		// TODO Auto-generated method stub
		return null;
	}

	public List<JavaClass> getExceptions() {
		// TODO Auto-generated method stub
		return null;
	}

	public JavaClass getGenericReturnType() {
		// TODO Auto-generated method stub
		return null;
	}

	public JavaParameter getParameterByName(String arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	public List<JavaType> getParameterTypes() {
		// TODO Auto-generated method stub
		return null;
	}

	public List<JavaType> getParameterTypes(boolean arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	public List<JavaParameter> getParameters() {
		// TODO Auto-generated method stub
		return null;
	}

	public JavaClass getParentClass() {
		// TODO Auto-generated method stub
		return null;
	}

	public String getPropertyName() {
		// TODO Auto-generated method stub
		return null;
	}

	public JavaType getPropertyType() {
		// TODO Auto-generated method stub
		return null;
	}

	public JavaType getReturnType() {
		// TODO Auto-generated method stub
		return null;
	}

	public JavaType getReturnType(boolean arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	public JavaClass getReturns() {
		// TODO Auto-generated method stub
		return null;
	}

	public String getSourceCode() {
		// TODO Auto-generated method stub
		return null;
	}

	public DocletTag getTagByName(String arg0, boolean arg1) {
		// TODO Auto-generated method stub
		return null;
	}

	public List<DocletTag> getTagsByName(String arg0, boolean arg1) {
		// TODO Auto-generated method stub
		return null;
	}

	public boolean isPropertyAccessor() {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean isPropertyMutator() {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean isVarArgs() {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean signatureMatches(String arg0, List<JavaType> arg1) {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean signatureMatches(String arg0, List<JavaType> arg1,
			boolean arg2) {
		// TODO Auto-generated method stub
		return false;
	}

	
}