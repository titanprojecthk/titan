package com.titan.server.core.domain;

import java.io.Serializable;

import javax.persistence.*;

import java.sql.Timestamp;


/**
 * The persistent class for the memo database table.
 * 
 */
@Entity
@Table(name = "memo")
@NamedQuery(name="Memo.findAll", query="SELECT m FROM Memo m")
public class Memo implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Integer id;

	@Lob
	private String content;

	@Column(name="create_time")
	private Timestamp createTime;

	private String title;

	@Column(name="update_time")
	private Timestamp updateTime;

	//bi-directional many-to-one association to ShortlistAttraction
	@ManyToOne
	@JoinColumn(name="shortlist_attraction_id")
	private ShortlistAttraction shortlistAttraction;

	public Memo() {
	}

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getContent() {
		return this.content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public Timestamp getCreateTime() {
		return this.createTime;
	}

	public void setCreateTime(Timestamp createTime) {
		this.createTime = createTime;
	}

	public String getTitle() {
		return this.title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public Timestamp getUpdateTime() {
		return this.updateTime;
	}

	public void setUpdateTime(Timestamp updateTime) {
		this.updateTime = updateTime;
	}

	public ShortlistAttraction getShortlistAttraction() {
		return this.shortlistAttraction;
	}

	public void setShortlistAttraction(ShortlistAttraction shortlistAttraction) {
		this.shortlistAttraction = shortlistAttraction;
	}

}