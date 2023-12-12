package com.staffmanagement.model;

import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.ForeignKey;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
@Table(name = "employee_contact_details")
@Getter
@Setter
@AllArgsConstructor
public class EmployeeContacts {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private Integer id;
	
	@Column(name = "ACTIVATION_STATUS")
	private Integer activationStatusID;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@Fetch(FetchMode.SELECT)
	@JoinColumn(name = "EMPLOYEE_ID", foreignKey = @ForeignKey(name ="a_employee_contact_detail"))
	private ManageEmployee employeeContactDetails;

	@Column(name = "EMPLOYEE_ID", updatable = false, insertable = false)
	private Integer employeeContactDetailsId;
	
	@Column(name = "OWNER_PHONE_NUMBER", nullable = true, length = 15)
	private String ownerphoneNumber;

	@Column(name = "OWNER_EMAIL", nullable = true, length = 100)
	private String ownerEmail;

	/*
	public EmployeeContacts(Integer id, Integer activationStatusID, ManageEmployee employeeContactDetails,
			Integer employeeContactDetailsId, String ownerphoneNumber, String ownerEmail) {
		super();
		this.id = id;
		this.activationStatusID = activationStatusID;
		this.employeeContactDetails = employeeContactDetails;
		this.employeeContactDetailsId = employeeContactDetailsId;
		this.ownerphoneNumber = ownerphoneNumber;
		this.ownerEmail = ownerEmail;
	}

	public EmployeeContacts() {
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

	public ManageEmployee getEmployeeContactDetails() {
		return employeeContactDetails;
	}

	public void setEmployeeContactDetails(ManageEmployee employeeContactDetails) {
		this.employeeContactDetails = employeeContactDetails;
	}

	public Integer getEmployeeContactDetailsId() {
		return employeeContactDetailsId;
	}

	public void setEmployeeContactDetailsId(Integer employeeContactDetailsId) {
		this.employeeContactDetailsId = employeeContactDetailsId;
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
