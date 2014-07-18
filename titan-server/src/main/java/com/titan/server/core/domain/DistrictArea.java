package com.titan.server.core.domain;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;


/**
 * The persistent class for the district_area database table.
 * 
 */
@Entity
@Table(name="district_area")
@NamedQuery(name="DistrictArea.findAll", query="SELECT d FROM DistrictArea d")
public class DistrictArea implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Integer id;

	@Column(name="ne_lat")
	private BigDecimal neLat;

	@Column(name="ne_lng")
	private BigDecimal neLng;

	@Column(name="ne_x")
	private int neX;

	@Column(name="ne_y")
	private int neY;

	@Column(name="sw_lat")
	private BigDecimal swLat;

	@Column(name="sw_lng")
	private BigDecimal swLng;

	@Column(name="sw_x")
	private int swX;

	@Column(name="sw_y")
	private int swY;

	//bi-directional many-to-one association to District
	@ManyToOne
	private District district;

	public DistrictArea() {
	}

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public BigDecimal getNeLat() {
		return this.neLat;
	}

	public void setNeLat(BigDecimal neLat) {
		this.neLat = neLat;
	}

	public BigDecimal getNeLng() {
		return this.neLng;
	}

	public void setNeLng(BigDecimal neLng) {
		this.neLng = neLng;
	}

	public int getNeX() {
		return this.neX;
	}

	public void setNeX(int neX) {
		this.neX = neX;
	}

	public int getNeY() {
		return this.neY;
	}

	public void setNeY(int neY) {
		this.neY = neY;
	}

	public BigDecimal getSwLat() {
		return this.swLat;
	}

	public void setSwLat(BigDecimal swLat) {
		this.swLat = swLat;
	}

	public BigDecimal getSwLng() {
		return this.swLng;
	}

	public void setSwLng(BigDecimal swLng) {
		this.swLng = swLng;
	}

	public int getSwX() {
		return this.swX;
	}

	public void setSwX(int swX) {
		this.swX = swX;
	}

	public int getSwY() {
		return this.swY;
	}

	public void setSwY(int swY) {
		this.swY = swY;
	}

	public District getDistrict() {
		return this.district;
	}

	public void setDistrict(District district) {
		this.district = district;
	}

}