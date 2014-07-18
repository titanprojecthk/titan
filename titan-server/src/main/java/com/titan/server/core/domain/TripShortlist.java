package com.titan.server.core.domain;

import java.io.Serializable;

import javax.persistence.*;

import java.sql.Timestamp;


/**
 * The persistent class for the trip_shortlist database table.
 * 
 */
@Entity
@Table(name="trip_shortlist")
@NamedQuery(name="TripShortlist.findAll", query="SELECT t FROM TripShortlist t")
public class TripShortlist implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Integer id;

	@Column(name="create_time")
	private Timestamp createTime;

	private String name;

	@Column(name="trip_id")
	private int tripId;

	private String type;

	@Column(name="update_time")
	private Timestamp updateTime;

	public TripShortlist() {
	}

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Timestamp getCreateTime() {
		return this.createTime;
	}

	public void setCreateTime(Timestamp createTime) {
		this.createTime = createTime;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getTripId() {
		return this.tripId;
	}

	public void setTripId(int tripId) {
		this.tripId = tripId;
	}

	public String getType() {
		return this.type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public Timestamp getUpdateTime() {
		return this.updateTime;
	}

	public void setUpdateTime(Timestamp updateTime) {
		this.updateTime = updateTime;
	}

}