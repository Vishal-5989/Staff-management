package com.staffmanagement.model;

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

import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;

@Entity
@Table(name = "family_details")
@Getter
@Setter
@AllArgsConstructor
public class FamilyDetails {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private Integer id;
	
	@OneToOne(fetch = FetchType.LAZY)
	@Fetch(FetchMode.SELECT)
	@JoinColumn(name = "EMPLOYEE_ID", foreignKey = @ForeignKey(name ="a_employee_documents"))
	private ManageEmployee familyDetails;

	@Column(name = "EMPLOYEE_ID", updatable = false, insertable = false)
	private Integer familyDetailsId;
	
	@Column(name = "FATHER'S NAME", nullable = false, length = 50)
	private String fatherName;
	
	@Column(name = "MOTHER'S NAME", nullable = false, length = 50)
	private String motherName;
	
	@Column(name = "SISTER'S NAME", nullable = false, length = 50)
	private String sisterName;
	
	@Column(name = "SPOUSE'S NAME", nullable = true, length = 50)
	private String spouseName;

	/*
	public FamilyDetails(Integer id, ManageEmployee familyDetails, Integer familyDetailsId, String fatherName,
			String motherName, String sisterName, String spouseName) {
		super();
		this.id = id;
		this.familyDetails = familyDetails;
		this.familyDetailsId = familyDetailsId;
		this.fatherName = fatherName;
		this.motherName = motherName;
		this.sisterName = sisterName;
		this.spouseName = spouseName;
	}

	public FamilyDetails() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public ManageEmployee getFamilyDetails() {
		return familyDetails;
	}

	public void setFamilyDetails(ManageEmployee familyDetails) {
		this.familyDetails = familyDetails;
	}

	public Integer getFamilyDetailsId() {
		return familyDetailsId;
	}

	public void setFamilyDetailsId(Integer familyDetailsId) {
		this.familyDetailsId = familyDetailsId;
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

