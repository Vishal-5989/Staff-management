package com.staffmanagement.view;

import com.staffmanagement.commonView.KeyValueView;

import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class FamilyDetailsView {

	private Integer id;
	
	private KeyValueView familyDetails;
	
	@NotBlank(message = "Father's/Gaurdian name is required")
	private String fatherName;
	
	@NotBlank(message = "Mother's/Gaurdian name is required")
	private String motherName;
	
	@NotBlank(message = "Sister's/Gaurdian name is required")
	private String sisterName;
	
	private String spouseName;

	/*
	public FamilyDetailsView(Integer id, KeyValueView familyDetails, String fatherName, String motherName,
			String sisterName, String spouseName) {
		super();
		this.id = id;
		this.familyDetails = familyDetails;
		this.fatherName = fatherName;
		this.motherName = motherName;
		this.sisterName = sisterName;
		this.spouseName = spouseName;
	}

	public FamilyDetailsView() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public KeyValueView getFamilyDetails() {
		return familyDetails;
	}

	public void setFamilyDetails(KeyValueView familyDetails) {
		this.familyDetails = familyDetails;
	}

	public String getFatherName() {
		return fatherName;
	}

	public void setFatherName(String fatherName) {
		this.fatherName = fatherName;
	}

	public String getMotherName() {
		return motherName;
	}

	public void setMotherName(String motherName) {
		this.motherName = motherName;
	}

	public String getSisterName() {
		return sisterName;
	}

	public void setSisterName(String sisterName) {
		this.sisterName = sisterName;
	}

	public String getSpouseName() {
		return spouseName;
	}

	public void setSpouseName(String spouseName) {
		this.spouseName = spouseName;
	}
	*/
}
