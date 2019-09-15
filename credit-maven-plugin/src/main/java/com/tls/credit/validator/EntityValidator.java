package com.tls.credit.validator;

import java.util.Date;
import java.util.List;

import com.thoughtworks.qdox.model.JavaSource;
import com.tls.credit.plugin.ExceptionMessage;

public class EntityValidator extends BaseValidator implements IValidator{

	private JavaSource javaSource;
	
	public EntityValidator(JavaSource javaSource){
		
	}
	


	public Boolean valid() {
		
		changeLogger.debug(javaSource.getClass().getSimpleName());
		errorLogger.debug(" امین " + new Date());
		return null;
	}

	public List<ExceptionMessage> getExcepMessages() {
		// TODO Auto-generated method stub
		return null;
	}

}
