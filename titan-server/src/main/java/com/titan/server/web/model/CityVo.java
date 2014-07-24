package com.titan.server.web.model;

import java.math.BigDecimal;

public class CityVo extends BaseVo {

	private static final long serialVersionUID = 3492106292427939480L;
	private String name;
	private BigDecimal lng;
	private BigDecimal lat;
	private CountryVo country;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public BigDecimal getLng() {
		return lng;
	}

	public void setLng(BigDecimal lng) {
		this.lng = lng;
	}

	public BigDecimal getLat() {
		return lat;
	}

	public void setLat(BigDecimal lat) {
		this.lat = lat;
	}

	public CountryVo getCountry() {
		return country;
	}

	public void setCountry(CountryVo country) {
		this.country = country;
	}

}
