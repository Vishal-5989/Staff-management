package com.staffmanagement.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.staffmanagement.view.ManageEmployeeView;

public interface ManageEmployee {
	@RequestMapping(value = "/save", method = RequestMethod.POST)
	@ResponseBody
	public ResponseEntity<Object> save(ManageEmployeeView manageEmployeeView) throws Exception;
}
