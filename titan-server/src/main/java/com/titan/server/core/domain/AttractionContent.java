package com.titan.server.core.domain;

import java.io.Serializable;

import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;

import java.sql.Timestamp;


/**
 * The persistent class for the attraction_content database table.
 * 
 */
@Entity
@Table(name="attraction_content")
@NamedQuery(name="AttractionContent.findAll", query="SELECT a FROM AttractionContent a")
@JsonIdentityInfo(generator=ObjectIdGenerators.IntSequenceGenerator.class, property="@attraction_content_id")
public class AttractionContent implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer id;

	@Column(name="create_by")
	private int createBy;

	@Column(name="create_time")
	private Timestamp createTime;

	private String status;

	@Column(name="update_by")
	private int updateBy;

	@Column(name="update_time")
	private Timestamp updateTime;

	//bi-directional many-to-one association to Attraction
	@ManyToOne
	private Attraction attraction;

	//bi-directional many-to-one association to Content
	@ManyToOne
	private Content content;

	public AttractionContent() {
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

	public String getStatus() {
		return this.status;
	}

	public void setStatus(String status) {
		this.status = status;
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

	public Attraction getAttraction() {
		return this.attraction;
	}

	public void setAttraction(Attraction attraction) {
		this.attraction = attraction;
	}

	public Content getContent() {
		return this.content;
	}

	public void setContent(Content content) {
		this.content = content;
	}

}