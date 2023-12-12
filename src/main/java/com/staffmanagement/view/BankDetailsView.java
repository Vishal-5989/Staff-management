package com.staffmanagement.view;

import com.staffmanagement.commonView.KeyValueView;

import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class BankDetailsView {
	
	private Integer id;
	
	private KeyValueView bankDetails;
	
	@NotBlank(message = "Account number is required")
	private String accountNumber;
	
	@NotBlank(message = "Branch name is required")
	private String branchName;
	
	@NotBlank(message = "IFSC code is required")
	private String ifscCode;

	/*
	public BankDetailsView(Integer id, KeyValueView bankDetails, String accountNumber,
			String branchName, String ifscCode) {
		super();
		this.id = id;
		this.bankDetails = bankDetails;
		this.accountNumber = accountNumber;
		this.branchName = branchName;
		this.ifscCode = ifscCode;
	}

	public BankDetailsView() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public KeyValueView getBankDetails() {
		return bankDetails;
	}

	public void setBankDetails(KeyValueView bankDetails) {
		this.bankDetails = bankDetails;
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
