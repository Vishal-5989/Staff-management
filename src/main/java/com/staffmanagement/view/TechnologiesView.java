package com.staffmanagement.view;

import com.staffmanagement.commonView.KeyValueView;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class TechnologiesView {
	
	private Integer id;

	private KeyValueView technologies;
	
	private String skill;

	/*
	public TechnologiesView(Integer id, KeyValueView technologies, String skill) {
		super();
		this.id = id;
		this.technologies = technologies;
		this.skill = skill;
	}

	public TechnologiesView() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public KeyValueView getTechnologies() {
		return technologies;
	}

	public void setTechnologies(KeyValueView technologies) {
		this.technologies = technologies;
	}

	public String getSkill() {
		return skill;
	}

	public void setSkill(String skill) {
		this.skill = skill;
	}
	*/
}
