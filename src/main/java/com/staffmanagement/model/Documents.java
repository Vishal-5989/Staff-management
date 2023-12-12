package com.staffmanagement.model;

import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;
import org.springframework.web.multipart.MultipartFile;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.ForeignKey;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "documents")
@Getter
@Setter
@AllArgsConstructor
public class Documents {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private Integer id;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@Fetch(FetchMode.SELECT)
	@JoinColumn(name = "EMPLOYEE_ID", foreignKey = @ForeignKey(name ="a_employee_documents"))
	private ManageEmployee documents;

	@Column(name = "EMPLOYEE_ID", updatable = false, insertable = false)
	private Integer documentsId;
	
	@Column(name = "FILE_NAME")
	private String fileName;
	
	@Column(name = "FILE_SIZE")
	private String fileSize;
	
	@Column(name = "FILE")
	private MultipartFile file;

	/*
	public Documents() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Documents(Integer id, ManageEmployee documents, Integer documentsId, String fileName, String fileSize,
			MultipartFile file) {
		super();
		this.id = id;
		this.documents = documents;
		this.documentsId = documentsId;
		this.fileName = fileName;
		this.fileSize = fileSize;
		this.file = file;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public ManageEmployee getDocuments() {
		return documents;
	}

	public void setDocuments(ManageEmployee documents) {
		this.documents = documents;
	}

	public Integer getDocumentsId() {
		return documentsId;
	}

	public void setDocumentsId(Integer documentsId) {
		this.documentsId = documentsId;
	}

	public String getFileName() {
		return fileName;
	}

	public void setFileName(String fileName) {
		this.fileName = fileName;
	}

	public String getFileSize() {
		return fileSize;
	}

	public void setFileSize(String fileSize) {
		this.fileSize = fileSize;
	}

	public MultipartFile getFile() {
		return file;
	}

	public void setFile(MultipartFile file) {
		this.file = file;
	}
	*/
}
