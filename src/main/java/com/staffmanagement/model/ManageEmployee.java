package com.staffmanagement.model;

import java.util.Date;
import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "employee_details")
@Getter
@Setter
@AllArgsConstructor
public class ManageEmployee {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private Integer id;
	
	@Column(name = "ACTIVATION_STATUS")
	private Integer activationStatusId;
	
	@Column(name = "FIRST_NAME", nullable = false, length = 50)
	private String firstName;
	
	@Column(name = "MIDDLE_NAME", nullable = false, length = 50)
	private String middleName;
	
	@Column(name = "LAST_NAME", nullable = false, length = 50)
	private String lastName;
	
	@Column(name = "ADDRESS", nullable = false, length = 500)
	private String address;

	@Column(name = "CITY", nullable = false, length = 20)
	private String city;

	@Column(name = "STATE", nullable = false, length = 20)
	private String state;
	
	@Column(name = "PIN_CODE", nullable = false)
	private String pinCode;
	
	@OneToMany(mappedBy = "employeeContactDetails")
	private List<EmployeeContacts> contactDetails;
	
	@Column(name = "ADHARCARD_NUMBER", nullable = false, length = 12)
	private String adharcardNumber;
	
	@Column(name = "PANCARD_NUMBER", nullable = false, length = 10)
	private String pancardNumber;
	
	@OneToMany(mappedBy = "technologies")
	private List<Technologies> technologies;
	
	@Column(name = "DEPARTMENT", nullable = false, length = 20)
	private String department;
	
	@Column(name = "MANAGER", nullable = false, length = 20)
	private String manager;
	
	@Column(name = "DOB", nullable = false)
	private Date dateOfBirth;

	@Column(name = "EXPERIENCE", nullable = true)
	private float experience;
	
	@OneToOne(mappedBy = "bankDetails")
	private List<BankDetails> bankDetails;
	
	@OneToMany(mappedBy = "documents")
	private List<Documents> documents;
	
	@OneToOne(mappedBy = "familyDetails")
	private List<FamilyDetails> familyDetails;

	/*
	public ManageEmployee(Integer id, Integer activationStatusId, String firstName, String middleName, String lastName,
			String address, String city, String state, String pinCode, List<EmployeeContacts> contactDetails,
			String adharcardNumber, String pancardNumber, List<Technologies> technologies, String department,
			String manager, Date dateOfBirth, float experience, List<BankDetails> bankDetails,
			List<Documents> documents, List<FamilyDetails> familyDetails) {
		super();
		this.id = id;
		this.activationStatusId = activationStatusId;
		this.firstName = firstName;
		this.middleName = middleName;
		this.lastName = lastName;
		this.address = address;
		this.city = city;
		this.state = state;
		this.pinCode = pinCode;
		this.contactDetails = contactDetails;
		this.adharcardNumber = adharcardNumber;
		this.pancardNumber = pancardNumber;
		this.technologies = technologies;
		this.department = department;
		this.manager = manager;
		this.dateOfBirth = dateOfBirth;
		this.experience = experience;
		this.bankDetails = bankDetails;
		this.documents = documents;
		this.familyDetails = familyDetails;
	}

	public ManageEmployee() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getActivationStatusId() {
		return activationStatusId;
	}

	public void setActivationStatusId(Integer activationStatusId) {
		this.activationStatusId = activationStatusId;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getMiddleName() {
		return middleName;
	}

	public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getPinCode() {
		return pinCode;
	}

	public void setPinCode(String pinCode) {
		this.pinCode = pinCode;
	}

	public List<EmployeeContacts> getContactDetails() {
		return contactDetails;
	}

	public void setContactDetails(List<EmployeeContacts> contactDetails) {
		this.contactDetails = contactDetails;
	}

	public String getAdharcardNumber() {
		return adharcardNumber;
	}

	public void setAdharcardNumber(String adharcardNumber) {
		this.adharcardNumber = adharcardNumber;
	}

	public String getPancardNumber() {
		return pancardNumber;
	}

	public void setPancardNumber(String pancardNumber) {
		this.pancardNumber = pancardNumber;
	}

	public List<Technologies> getTechnologies() {
		return technologies;
	}

	public void setTechnologies(List<Technologies> technologies) {
		this.technologies = technologies;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public String getManager() {
		return manager;
	}

	public void setManager(String manager) {
		this.manager = manager;
	}

	public Date getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(Date dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public float getExperience() {
		return experience;
	}

	public void setExperience(float experience) {
		this.experience = experience;
	}

	public List<BankDetails> getBankDetails() {
		return bankDetails;
	}

	public void setBankDetails(List<BankDetails> bankDetails) {
		this.bankDetails = bankDetails;
	}

	public List<Documents> getDocuments() {
		return documents;
	}

	public void setDocuments(List<Documents> documents) {
		this.documents = documents;
	}

	public List<FamilyDetails> getFamilyDetails() {
		return familyDetails;
	}

	public void setFamilyDetails(List<FamilyDetails> familyDetails) {
		this.familyDetails = familyDetails;
	}
	*/
}
