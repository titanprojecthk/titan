package com.titan.server.core.domain;

import java.io.Serializable;

import javax.persistence.*;

import java.sql.Timestamp;
import java.util.List;


/**
 * The persistent class for the content database table.
 * 
 */
@Entity
@Table(name = "content")
@NamedQuery(name="Content.findAll", query="SELECT c FROM Content c")
public class Content implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private String id;

	@Column(name="create_by")
	private int createBy;

	@Column(name="create_time")
	private Timestamp createTime;

	private String path;

	private String status;

	private String type;

	@Column(name="update_by")
	private int updateBy;

	@Column(name="update_time")
	private Timestamp updateTime;

	//bi-directional many-to-one association to AttractionContent
	@OneToMany(mappedBy="content")
	private List<AttractionContent> attractionContents;

	public Content() {
	}

	public String getId() {
		return this.id;
	}

	public void setId(String id) {
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

	public String getPath() {
		return this.path;
	}

	public void setPath(String path) {
		this.path = path;
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

	public List<AttractionContent> getAttractionContents() {
		return this.attractionContents;
	}

	public void setAttractionContents(List<AttractionContent> attractionContents) {
		this.attractionContents = attractionContents;
	}

	public AttractionContent addAttractionContent(AttractionContent attractionContent) {
		getAttractionContents().add(attractionContent);
		attractionContent.setContent(this);

		return attractionContent;
	}

	public AttractionContent removeAttractionContent(AttractionContent attractionContent) {
		getAttractionContents().remove(attractionContent);
		attractionContent.setContent(null);

		return attractionContent;
	}

}