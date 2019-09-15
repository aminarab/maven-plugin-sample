package com.tls.credit.generator;

import java.util.Map;

import com.thoughtworks.qdox.model.JavaAnnotation;
import com.thoughtworks.qdox.model.JavaClass;
import com.thoughtworks.qdox.model.expression.AnnotationValue;

public class AnnotationGenerator implements JavaAnnotation {

	private JavaClass type;

	private Map<String, AnnotationValue> propertyMap;

	private AnnotationValue property;

	private Map<String, Object> namedParameterMap;

	private Object namedParameter;

	public Object getNamedParameter(String arg0) {
		return namedParameter;
	}

	public Map<String, Object> getNamedParameterMap() {
		return namedParameterMap;
	}

	public AnnotationValue getProperty(String arg0) {
		return property;
	}

	public Map<String, AnnotationValue> getPropertyMap() {
		return propertyMap;
	}

	public JavaClass getType() {
		return type;
	}

	public void setType(JavaClass type) {
		this.type = type;
	}

	public void setPropertyMap(Map<String, AnnotationValue> propertyMap) {
		this.propertyMap = propertyMap;
	}

	public AnnotationValue getProperty() {
		return property;
	}

	public void setProperty(AnnotationValue property) {
		this.property = property;
	}

	public void setNamedParameterMap(Map<String, Object> namedParameterMap) {
		this.namedParameterMap = namedParameterMap;
	}

	public void setNamedParameter(Object namedParameter) {
		this.namedParameter = namedParameter;
	}

}