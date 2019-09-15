package com.tls.credit.validator;

import java.util.List;

import com.thoughtworks.qdox.model.JavaSource;
import com.tls.credit.plugin.ExceptionMessage;

public class BLValidator extends BaseValidator implements IValidator {

	private JavaSource javaSource;

	public BLValidator(JavaSource javaSource) {
		this.javaSource = javaSource;
	}

	public Boolean valid() {
		// TODO Auto-generated method stub
		return null;
	}

	public List<ExceptionMessage> getExcepMessages() {
		// TODO Auto-generated method stub
		return null;
	}

}
