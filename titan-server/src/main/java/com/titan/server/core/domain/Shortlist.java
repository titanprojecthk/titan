package com.titan.server.core.domain;

import java.io.Serializable;

import javax.persistence.*;

import java.sql.Timestamp;
import java.util.List;


/**
 * The persistent class for the shortlist database table.
 * 
 */
@Entity
@Table(name = "shortlist")
@NamedQuery(name="Shortlist.findAll", query="SELECT s FROM Shortlist s")
public class Shortlist implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Integer id;

	@Column(name="create_time")
	private Timestamp createTime;

	private String name;

	private String type;

	@Column(name="update_time")
	private Timestamp updateTime;

	//bi-directional many-to-one association to Trip
	@ManyToOne
	private Trip trip;

	//bi-directional many-to-one association to ShortlistAttraction
	@OneToMany(mappedBy="shortlist")
	private List<ShortlistAttraction> shortlistAttractions;

	public Shortlist() {
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

	public Trip getTrip() {
		return this.trip;
	}

	public void setTrip(Trip trip) {
		this.trip = trip;
	}

	public List<ShortlistAttraction> getShortlistAttractions() {
		return this.shortlistAttractions;
	}

	public void setShortlistAttractions(List<ShortlistAttraction> shortlistAttractions) {
		this.shortlistAttractions = shortlistAttractions;
	}

	public ShortlistAttraction addShortlistAttraction(ShortlistAttraction shortlistAttraction) {
		getShortlistAttractions().add(shortlistAttraction);
		shortlistAttraction.setShortlist(this);

		return shortlistAttraction;
	}

	public ShortlistAttraction removeShortlistAttraction(ShortlistAttraction shortlistAttraction) {
		getShortlistAttractions().remove(shortlistAttraction);
		shortlistAttraction.setShortlist(null);

		return shortlistAttraction;
	}

}