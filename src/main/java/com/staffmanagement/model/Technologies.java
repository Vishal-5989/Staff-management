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
import jakarta.persistence.Table;

import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;

@Entity
@Table(name = "technologies")
public class Technologies {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private Integer id;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@Fetch(FetchMode.SELECT)
	@JoinColumn(name = "EMPLOYEE_ID", foreignKey = @ForeignKey(name ="a_employee_skills"))
	private ManageEmployee technologies;

	@Column(name = "EMPLOYEE_ID", updatable = false, insertable = false)
	private Integer technologiesId;
	
	@Column(name = "SKILLS", nullable = true, length = 15)
	private String skill;
	
	/*
	public Technologies(Integer id, ManageEmployee technologies, Integer technologiesId, String skill) {
		super();
		this.id = id;
		this.technologies = technologies;
		this.technologiesId = technologiesId;
		this.skill = skill;
	}

	public Technologies() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public ManageEmployee getTechnologies() {
		return technologies;
	}

	public void setTechnologies(ManageEmployee technologies) {
		this.technologies = technologies;
	}

	public Integer gettechnologiesId() {
		return technologiesId;
	}

	public void settechnologiesId(Integer technologiesId) {
		this.technologiesId = technologiesId;
	}

	public String getSkill() {
		return skill;
	}

	public void setSkill(String skill) {
		this.skill = skill;
	}
	*/

}
