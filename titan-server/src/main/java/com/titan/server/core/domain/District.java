package com.titan.server.core.domain;

import java.io.Serializable;

import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;

import java.util.List;


/**
 * The persistent class for the district database table.
 * 
 */
@Entity
@Table(name = "district")
@NamedQuery(name="District.findAll", query="SELECT d FROM District d")
@JsonIdentityInfo(generator=ObjectIdGenerators.IntSequenceGenerator.class, property="@district_id")
public class District implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer id;

	private String name;

	//bi-directional many-to-one association to Attraction
	@OneToMany(mappedBy="district")
	private List<Attraction> attractions;

	//bi-directional many-to-one association to City
	@ManyToOne
	private City city;

	//bi-directional many-to-one association to DistrictArea
	@OneToMany(mappedBy="district")
	private List<DistrictArea> districtAreas;

	public District() {
	}

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<Attraction> getAttractions() {
		return this.attractions;
	}

	public void setAttractions(List<Attraction> attractions) {
		this.attractions = attractions;
	}

	public Attraction addAttraction(Attraction attraction) {
		getAttractions().add(attraction);
		attraction.setDistrict(this);

		return attraction;
	}

	public Attraction removeAttraction(Attraction attraction) {
		getAttractions().remove(attraction);
		attraction.setDistrict(null);

		return attraction;
	}

	public City getCity() {
		return this.city;
	}

	public void setCity(City city) {
		this.city = city;
	}

	public List<DistrictArea> getDistrictAreas() {
		return this.districtAreas;
	}

	public void setDistrictAreas(List<DistrictArea> districtAreas) {
		this.districtAreas = districtAreas;
	}

	public DistrictArea addDistrictArea(DistrictArea districtArea) {
		getDistrictAreas().add(districtArea);
		districtArea.setDistrict(this);

		return districtArea;
	}

	public DistrictArea removeDistrictArea(DistrictArea districtArea) {
		getDistrictAreas().remove(districtArea);
		districtArea.setDistrict(null);

		return districtArea;
	}

}