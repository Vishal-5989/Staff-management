package com.staffmanagement.model;

import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.ForeignKey;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "bank_details")
@Getter
@Setter
@AllArgsConstructor
public class BankDetails {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private Integer id;
	
	@OneToOne(fetch = FetchType.LAZY)
	@Fetch(FetchMode.SELECT)
	@JoinColumn(name = "EMPLOYEE_ID", foreignKey = @ForeignKey(name ="a_employee_bank_details"))
	private ManageEmployee bankDetails;

	@Column(name = "EMPLOYEE_ID", updatable = false, insertable = false)
	private Integer bankDetailsId;
	
	@Column(name = "ACCOUNT_NUMBER", nullable = false, length = 15)
	private String accountNumber;
	
	@Column(name = "BRANCH_NAME", nullable = false, length = 15)
	private String branchName;
	
	@Column(name = "IFSC_CODE", nullable = false, length = 15)
	private String ifscCode;

	/*
	public BankDetails(Integer id, ManageEmployee bankDetails, Integer bankDetailsId, String accountNumber,
			String branchName, String ifscCode) {
		super();
		this.id = id;
		this.bankDetails = bankDetails;
		this.bankDetailsId = bankDetailsId;
		this.accountNumber = accountNumber;
		this.branchName = branchName;
		this.ifscCode = ifscCode;
	}

	public BankDetails() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public ManageEmployee getBankDetails() {
		return bankDetails;
	}

	public void setBankDetails(ManageEmployee bankDetails) {
		this.bankDetails = bankDetails;
	}

	public Integer getBankDetailsId() {
		return bankDetailsId;
	}

	public void setBankDetailsId(Integer bankDetailsId) {
		this.bankDetailsId = bankDetailsId;
	}

	public String getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}

	public String getBranchName() {
		return branchName;
	}

	public void setBranchName(String branchName) {
		this.branchName = branchName;
	}

	public String getIfscCode() {
		return ifscCode;
	}

	public void setIfscCode(String ifscCode) {
		this.ifscCode = ifscCode;
	}
	*/

}
