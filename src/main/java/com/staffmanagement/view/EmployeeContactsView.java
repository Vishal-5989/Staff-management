package com.staffmanagement.view;

import com.staffmanagement.commonView.KeyValueView;

import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class EmployeeContactsView {

	private Integer id;
	
	private Integer activationStatusID;
	
	private KeyValueView employeeContactDetails;
	
	@NotBlank(message = "Mobile number is required")
	private String ownerphoneNumber;

	@NotBlank(message = "Email is required")
	private String ownerEmail;
	
	/*
	public EmployeeContactsView(Integer id, Integer activationStatusID, KeyValueView employeeContactDetails,
			String ownerphoneNumber, String ownerEmail) {
		super();
		this.id = id;
		this.activationStatusID = activationStatusID;
		this.employeeContactDetails = employeeContactDetails;
		this.ownerphoneNumber = ownerphoneNumber;
		this.ownerEmail = ownerEmail;
	}

	public EmployeeContactsView() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getActivationStatusID() {
		return activationStatusID;
	}

	public void setActivationStatusID(Integer activationStatusID) {
		this.activationStatusID = activationStatusID;
	}

	public KeyValueView getEmployeeContactDetails() {
		return employeeContactDetails;
	}

	public void setEmployeeContactDetails(KeyValueView employeeContactDetails) {
		this.employeeContactDetails = employeeContactDetails;
	}

	public String getOwnerphoneNumber() {
		return ownerphoneNumber;
	}

	public void setOwnerphoneNumber(String ownerphoneNumber) {
		this.ownerphoneNumber = ownerphoneNumber;
	}

	public String getOwnerEmail() {
		return ownerEmail;
	}

	public void setOwnerEmail(String ownerEmail) {
		this.ownerEmail = ownerEmail;
	}
	*/
}
