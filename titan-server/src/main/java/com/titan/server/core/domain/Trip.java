package com.titan.server.core.domain;

import java.io.Serializable;

import javax.persistence.*;

import java.sql.Timestamp;
import java.util.List;


/**
 * The persistent class for the trip database table.
 * 
 */
@Entity
@Table(name = "trip")
@NamedQuery(name="Trip.findAll", query="SELECT t FROM Trip t")
public class Trip implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Integer id;

	@Column(name="create_time")
	private Timestamp createTime;

	private String description;

	private String name;

	@Column(name="update_time")
	private Timestamp updateTime;

	//bi-directional many-to-one association to Shortlist
	@OneToMany(mappedBy="trip")
	private List<Shortlist> shortlists;

	//bi-directional many-to-one association to User
	@ManyToOne
	private User user;

	//bi-directional many-to-one association to City
	@ManyToOne
	private City city;

	public Trip() {
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

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Timestamp getUpdateTime() {
		return this.updateTime;
	}

	public void setUpdateTime(Timestamp updateTime) {
		this.updateTime = updateTime;
	}

	public List<Shortlist> getShortlists() {
		return this.shortlists;
	}

	public void setShortlists(List<Shortlist> shortlists) {
		this.shortlists = shortlists;
	}

	public Shortlist addShortlist(Shortlist shortlist) {
		getShortlists().add(shortlist);
		shortlist.setTrip(this);

		return shortlist;
	}

	public Shortlist removeShortlist(Shortlist shortlist) {
		getShortlists().remove(shortlist);
		shortlist.setTrip(null);

		return shortlist;
	}

	public User getUser() {
		return this.user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public City getCity() {
		return this.city;
	}

	public void setCity(City city) {
		this.city = city;
	}

}