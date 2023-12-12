package com.staffmanagement.view;

import org.springframework.web.multipart.MultipartFile;

import com.staffmanagement.commonView.KeyValueView;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class DocumentsView {

	private Integer id;
	
	private KeyValueView documents;
	
	private String fileName;
	
	private String fileSize;
	
	private MultipartFile file;

	public DocumentsView(Integer id, KeyValueView documents, String fileName, String fileSize, MultipartFile file) {
		super();
		this.id = id;
		this.documents = documents;
		this.fileName = fileName;
		this.fileSize = fileSize;
		this.file = file;
	}

	public DocumentsView() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public KeyValueView getDocuments() {
		return documents;
	}

	public void setDocuments(KeyValueView documents) {
		this.documents = documents;
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

}
