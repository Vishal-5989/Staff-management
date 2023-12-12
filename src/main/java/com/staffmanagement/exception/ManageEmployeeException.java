package com.staffmanagement.exception;

import java.util.Map;

import com.staffmanagement.commonUtils.ResponseCode;

public class ManageEmployeeException extends Exception{

	private static long serialVersionUID = 1L;

	private int code;
	
	private String message;
	
	private Map<String, String> properties;
	
	private String className;
	
	private String transactionName;
	
	private String identificationValue;

	public ManageEmployeeException(int code, Map<String, String> properties, String className, String transactionName) {
		super();
		this.code = code;
		this.properties = properties;
		this.className = className;
		this.transactionName = transactionName;
	}

	public ManageEmployeeException(int code2, String className2, String transactionName2) {
		super(ResponseCode.fromId(code2).getMessage());
		this.code = code2;
		this.className = className2;
		this.transactionName = transactionName2;
		this.message = ResponseCode.fromId(code).getMessage();	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	public static void setSerialversionuid(long serialversionuid) {
		serialVersionUID = serialversionuid;
	}
	
	public int getCode() {
		return code;
	}

	public void setCode(int code) {
		this.code = code;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public Map<String, String> getProperties() {
		return properties;
	}

	public void setProperties(Map<String, String> properties) {
		this.properties = properties;
	}

	public String getClassName() {
		return className;
	}

	public void setClassName(String className) {
		this.className = className;
	}

	public String getTransactionName() {
		return transactionName;
	}

	public void setTransactionName(String transactionName) {
		this.transactionName = transactionName;
	}

	public String getIdentificationValue() {
		return identificationValue;
	}

	public void setIdentificationValue(String identificationValue) {
		this.identificationValue = identificationValue;
	}	
	
}
