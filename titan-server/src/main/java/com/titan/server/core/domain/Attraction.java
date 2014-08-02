package com.titan.server.core.domain;

import java.io.Serializable;
import java.math.BigDecimal;
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

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;


/**
 * The persistent class for the attraction database table.
 * 
 */
@Entity
@Table(name = "attraction")
@NamedQueries({
		@NamedQuery(name = "Attraction.findAll", query = "SELECT a FROM Attraction a"),
//		@NamedQuery(name = "Attraction.findByShortlistId", query = "SELECT a FROM Attraction a where a.shortlistAttraction.shortlist.id = ?1") 
})
@JsonIdentityInfo(generator=ObjectIdGenerators.IntSequenceGenerator.class, property="@attraction_id")
public class Attraction implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer id;

	@Column(name="create_by")
	private int createBy;

	@Column(name="create_time")
	private Timestamp createTime;

	private String description;

	private BigDecimal lat;

	private BigDecimal lng;

	private String name;

	private String status;

	private String type;

	@Column(name="update_by")
	private int updateBy;

	@Column(name="update_time")
	private Timestamp updateTime;

	//bi-directional many-to-one association to District
	@ManyToOne
	private District district;

	//bi-directional many-to-one association to AttractionContent
	@OneToMany(mappedBy="attraction")
	private List<AttractionContent> attractionContents;

	//bi-directional many-to-one association to ShortlistAttraction
	@OneToMany(mappedBy="attraction")
	private List<ShortlistAttraction> shortlistAttractions;

	public Attraction() {
	}

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public int getCreateBy() {
		return this.createBy;
	}

	public void setCreateBy(int createBy) {
		this.createBy = createBy;
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

	public String getStatus() {
		return this.status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getType() {
		return this.type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public int getUpdateBy() {
		return this.updateBy;
	}

	public void setUpdateBy(int updateBy) {
		this.updateBy = updateBy;
	}

	public Timestamp getUpdateTime() {
		return this.updateTime;
	}

	public void setUpdateTime(Timestamp updateTime) {
		this.updateTime = updateTime;
	}

	public District getDistrict() {
		return this.district;
	}

	public void setDistrict(District district) {
		this.district = district;
	}

	public List<AttractionContent> getAttractionContents() {
		return this.attractionContents;
	}

	public void setAttractionContents(List<AttractionContent> attractionContents) {
		this.attractionContents = attractionContents;
	}

	public AttractionContent addAttractionContent(AttractionContent attractionContent) {
		getAttractionContents().add(attractionContent);
		attractionContent.setAttraction(this);

		return attractionContent;
	}

	public AttractionContent removeAttractionContent(AttractionContent attractionContent) {
		getAttractionContents().remove(attractionContent);
		attractionContent.setAttraction(null);

		return attractionContent;
	}

	public List<ShortlistAttraction> getShortlistAttractions() {
		return this.shortlistAttractions;
	}

	public void setShortlistAttractions(List<ShortlistAttraction> shortlistAttractions) {
		this.shortlistAttractions = shortlistAttractions;
	}

	public ShortlistAttraction addShortlistAttraction(ShortlistAttraction shortlistAttraction) {
		getShortlistAttractions().add(shortlistAttraction);
		shortlistAttraction.setAttraction(this);

		return shortlistAttraction;
	}

	public ShortlistAttraction removeShortlistAttraction(ShortlistAttraction shortlistAttraction) {
		getShortlistAttractions().remove(shortlistAttraction);
		shortlistAttraction.setAttraction(null);

		return shortlistAttraction;
	}

}