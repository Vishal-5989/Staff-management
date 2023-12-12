package com.staffmanagement.service.impl;

import com.staffmanagement.service.ManageEmployeeService;
import com.staffmanagement.view.ManageEmployeeView;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class ManageEmployeeServiceImpl implements ManageEmployeeService {

    @Override
    public ResponseEntity<Object> doSaveOperation(ManageEmployeeView manageEmployeeView) {
        return null;
    }
}
