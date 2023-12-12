package com.staffmanagement.controller.impl;

import java.util.HashMap;
import java.util.Map;

import com.staffmanagement.commonUtils.LogMessage;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.util.CollectionUtils;

import com.staffmanagement.commonUtils.OperationName;
import com.staffmanagement.commonUtils.ResponseCode;
import com.staffmanagement.controller.ManageEmployee;
import com.staffmanagement.exception.InvalidDataException;
import com.staffmanagement.service.ManageEmployeeService;
import com.staffmanagement.validation.DataType;
import com.staffmanagement.validation.InputField;
import com.staffmanagement.validation.StaticFormValidator;
import com.staffmanagement.view.ManageEmployeeView;

import org.springframework.web.bind.annotation.RequestBody;

public class ManageEmployeeImpl implements ManageEmployee{

	@Autowired
	ManageEmployeeService manageEmployeeService;

	public ManageEmployeeService getService() {
		return manageEmployeeService;
	}
	private static final Logger log = LogManager.getLogger(ManageEmployeeImpl.class);

	private void isValidSaveData(ManageEmployeeView manageEmployeeView) throws InvalidDataException {

		Map<String, String> errorProperties = new HashMap<>();

		commonValidation(manageEmployeeView, errorProperties);

		if (!CollectionUtils.isEmpty(errorProperties)) {
			log.error(ResponseCode.INVALID_FORM_DATA.getCode() + " Invalid Form Data");
			throw new InvalidDataException(ResponseCode.INVALID_FORM_DATA.getCode(), errorProperties,
					this.getClass().getName(),
					OperationName.SAVE);
		}
	}
	
	private void commonValidation(ManageEmployeeView manageEmployeeView, Map<String, String> errorProperties) {

		StaticFormValidator.VALIDATE_STRING_NULL
				.isValid(new InputField("firstName", manageEmployeeView.getFirstName(),
						DataType.STRING, 0, 0, null, errorProperties));
		
		StaticFormValidator.VALIDATE_STRING_WITHOUT_REGEX
				.isValid(new InputField("middleName", manageEmployeeView.getMiddleName(),
						DataType.STRING, 0, 20, null, errorProperties));
		
		StaticFormValidator.VALIDATE_STRING_WITHOUT_REGEX
				.isValid(new InputField("lastName", manageEmployeeView.getLastName(),
						DataType.STRING, 0, 20, null, errorProperties));
		
		StaticFormValidator.VALIDATE_STRING_WITHOUT_REGEX
				.isValid(new InputField("address", manageEmployeeView.getAddress(),
						DataType.STRING, 0, 10, null, errorProperties));

		StaticFormValidator.VALIDATE_STRING_WITHOUT_REGEX
				.isValid(new InputField("city", manageEmployeeView.getCity(),
						DataType.STRING, 0, 10, null, errorProperties));

		StaticFormValidator.VALIDATE_STRING_WITHOUT_REGEX
				.isValid(new InputField("pinCode", manageEmployeeView.getPinCode(),
						DataType.STRING, 0, 10, null, errorProperties));

		StaticFormValidator.VALIDATE_STRING_WITHOUT_REGEX
				.isValid(new InputField("adharcardNumber", manageEmployeeView.getAdharcardNumber(),
						DataType.STRING, 0, 10, null, errorProperties));

		StaticFormValidator.VALIDATE_STRING_WITHOUT_REGEX
				.isValid(new InputField("pancardNumber", manageEmployeeView.getPancardNumber(),
						DataType.STRING, 0, 10, null, errorProperties));

		StaticFormValidator.VALIDATE_STRING_WITHOUT_REGEX
				.isValid(new InputField("department", manageEmployeeView.getDepartment(),
						DataType.STRING, 0, 10, null, errorProperties));

		StaticFormValidator.VALIDATE_STRING_WITHOUT_REGEX
				.isValid(new InputField("manager", manageEmployeeView.getManager(),
						DataType.STRING, 0, 10, null, errorProperties));

	}

	@Override
	public ResponseEntity<Object> save(@RequestBody ManageEmployeeView manageEmployeeView) throws Exception {

		try {
			isValidSaveData(manageEmployeeView);
			return manageEmployeeService.doSaveOperation(manageEmployeeView);
		} finally {
			log.info(this.getClass().getSimpleName() + " " + OperationName.SAVE + " "
					+ LogMessage.REQUEST_COMPLETED + " saveEmployee");
		}
	}

}
