package com.tls.credit.validator;

import java.util.List;

import com.tls.credit.plugin.ExceptionMessage;

public interface IValidator {

	public Boolean valid();
	public List<ExceptionMessage> getExcepMessages();
	
}
