package com.staffmanagement.service;

import com.staffmanagement.view.ManageEmployeeView;
import org.springframework.http.ResponseEntity;

public interface ManageEmployeeService {

    ResponseEntity<Object> doSaveOperation(ManageEmployeeView manageEmployeeView);
}
