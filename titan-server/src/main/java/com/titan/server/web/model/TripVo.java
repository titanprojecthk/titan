package com.titan.server.web.model;

public class TripVo extends BaseVo {

	private static final long serialVersionUID = 7518103847585461717L;
	private Integer id;
	private String description;
	private String name;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}