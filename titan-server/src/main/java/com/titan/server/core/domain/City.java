package com.titan.server.core.domain;

import java.io.Serializable;

import javax.persistence.*;

import java.math.BigDecimal;
import java.util.List;


/**
 * The persistent class for the city database table.
 * 
 */
@Entity
@Table(name = "city")
@NamedQuery(name="City.findAll", query="SELECT c FROM City c")
public class City implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Integer id;

	private BigDecimal lat;

	private BigDecimal lng;

	private String name;

	//bi-directional many-to-one association to Country
	@ManyToOne
	@JoinColumn(name="city_id")
	private Country country;

	//bi-directional many-to-one association to District
	@OneToMany(mappedBy="city")
	private List<District> districts;

	//bi-directional many-to-one association to Trip
	@OneToMany(mappedBy="city")
	private List<Trip> trips;

	public City() {
	}

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public BigDecimal getLat() {
		return this.lat;
	}

	public void setLat(BigDecimal lat) {
		this.lat = lat;
	}

	public BigDecimal getLng() {
		return this.lng;
	}

	public void setLng(BigDecimal lng) {
		this.lng = lng;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Country getCountry() {
		return this.country;
	}

	public void setCountry(Country country) {
		this.country = country;
	}

	public List<District> getDistricts() {
		return this.districts;
	}

	public void setDistricts(List<District> districts) {
		this.districts = districts;
	}

	public District addDistrict(District district) {
		getDistricts().add(district);
		district.setCity(this);

		return district;
	}

	public District removeDistrict(District district) {
		getDistricts().remove(district);
		district.setCity(null);

		return district;
	}

	public List<Trip> getTrips() {
		return this.trips;
	}

	public void setTrips(List<Trip> trips) {
		this.trips = trips;
	}

	public Trip addTrip(Trip trip) {
		getTrips().add(trip);
		trip.setCity(this);

		return trip;
	}

	public Trip removeTrip(Trip trip) {
		getTrips().remove(trip);
		trip.setCity(null);

		return trip;
	}

}