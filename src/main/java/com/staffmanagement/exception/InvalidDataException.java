package com.staffmanagement.exception;

import java.util.Map;

public class InvalidDataException extends ManageEmployeeException{

	private static final long serialVersionUID = 1L;

	public InvalidDataException(int code, Map<String, String> properties, String className, String transactionName) {
		super(code, properties, className, transactionName);
	}

	public InvalidDataException(int code, String className, String transactionName) {
		super(code, className, transactionName);
	}
	
}
