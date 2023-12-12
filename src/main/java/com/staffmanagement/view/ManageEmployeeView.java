package com.staffmanagement.view;

import java.util.Date;
import java.util.List;

import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class ManageEmployeeView {

	private Integer id;
	
	private Integer activationStatusId;
	
	@NotBlank(message = "First name is required")
	private String firstName;
	
	@NotBlank(message = "Middle name is required")
	private String middleName;
	
	@NotBlank(message = "Last name is required")
	private String lastName;
	
	@NotBlank(message = "Address is required")
	private String address;

	@NotBlank(message = "City is required")
	private String city;

	@NotBlank(message = "State is required")
	private String state;
	
	@NotBlank(message = "Pin code is required")
	private String pinCode;
	
	@NotBlank(message = "Contactdetails are required")
	private List<EmployeeContactsView> contactDetails;
	
	@NotBlank(message = "Adharcard number is required")
	private String adharcardNumber;
	
	@NotBlank(message = "Pancard number is required")
	private String pancardNumber;
	
	@NotBlank(message = "Technologies are required")
	private List<TechnologiesView> technologies;
	
	private String department;
	
	private String manager;
	
	@NotBlank(message = "DOB is required")
	private Date dateOfBirth;

	@NotBlank(message = "Experience is required")
	private float experience;
	
	@NotBlank(message = "Bank details are required")
	private List<BankDetailsView> bankDetails;
	
	@NotBlank(message = "Documents are required")
	private List<DocumentsView> documents;
	
	@NotBlank(message = "Family details are required")
	private List<FamilyDetailsView> familyDetails;

	/*
	public ManageEmployeeView(Integer id, Integer activationStatusId, String firstName, String middleName,
			String lastName, String address, String city, String state, String pinCode,
			List<EmployeeContactsView> contactDetails, String adharcardNumber, String pancardNumber,
			List<TechnologiesView> technologies, String department, String manager, Date dateOfBirth, float experience,
			List<BankDetailsView> bankDetails, List<DocumentsView> documents, List<FamilyDetailsView> familyDetails) {
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

	public ManageEmployeeView() {
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

	public List<EmployeeContactsView> getContactDetails() {
		return contactDetails;
	}

	public void setContactDetails(List<EmployeeContactsView> contactDetails) {
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

	public List<TechnologiesView> getTechnologies() {
		return technologies;
	}

	public void setTechnologies(List<TechnologiesView> technologies) {
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

	public List<BankDetailsView> getBankDetails() {
		return bankDetails;
	}

	public void setBankDetails(List<BankDetailsView> bankDetails) {
		this.bankDetails = bankDetails;
	}

	public List<DocumentsView> getDocuments() {
		return documents;
	}

	public void setDocuments(List<DocumentsView> documents) {
		this.documents = documents;
	}

	public List<FamilyDetailsView> getFamilyDetails() {
		return familyDetails;
	}

	public void setFamilyDetails(List<FamilyDetailsView> familyDetails) {
		this.familyDetails = familyDetails;
	}
	*/
}
