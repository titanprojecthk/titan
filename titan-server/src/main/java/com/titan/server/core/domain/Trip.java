package com.titan.server.core.domain;

import java.io.Serializable;
import java.sql.Timestamp;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.springframework.data.jpa.domain.AbstractPersistable;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;


/**
 * The persistent class for the trip database table.
 * 
 */
@Entity
@Table(name = "trip")
@NamedQueries({
	@NamedQuery(name = "Trip.findByUser", query = "from Trip t where t.user = ?1"),
	@NamedQuery(name = "Trip.findByCityAndUser", query = "from Trip t where t.city = ?1 and t.user = ?2"),
})
@JsonIdentityInfo(generator=ObjectIdGenerators.IntSequenceGenerator.class, property="@trip_id")
public class Trip extends AbstractPersistable<Integer> implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
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