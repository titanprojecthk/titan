package com.titan.server.web.model;

import java.util.ArrayList;
import java.util.List;

public class UserVo extends BaseVo {

	private static final long serialVersionUID = 1L;
	private Integer id;
	private String email;
	private List<TripVo> trips = new ArrayList<TripVo>();

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public List<TripVo> getTrips() {
		return trips;
	}

	public void setTrips(List<TripVo> trips) {
		this.trips = trips;
	}

}
