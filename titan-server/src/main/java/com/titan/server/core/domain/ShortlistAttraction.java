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
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;


/**
 * The persistent class for the shortlist_attraction database table.
 * 
 */
@Entity
@Table(name="shortlist_attraction")
@NamedQuery(name="ShortlistAttraction.findAll", query="SELECT s FROM ShortlistAttraction s")
public class ShortlistAttraction implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Integer id;

	@Column(name="create_time")
	private Timestamp createTime;

	@Column(name="memo_id")
	private int memoId;

	private String type;

	@Column(name="update_time")
	private Timestamp updateTime;

	//bi-directional many-to-one association to Memo
	@OneToMany(mappedBy="shortlistAttraction")
	private List<Memo> memos;

	//bi-directional many-to-one association to Attraction
	@ManyToOne
	private Attraction attraction;

	//bi-directional many-to-one association to Shortlist
	@ManyToOne
	private Shortlist shortlist;

	public ShortlistAttraction() {
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

	public int getMemoId() {
		return this.memoId;
	}

	public void setMemoId(int memoId) {
		this.memoId = memoId;
	}

	public String getType() {
		return this.type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public Timestamp getUpdateTime() {
		return this.updateTime;
	}

	public void setUpdateTime(Timestamp updateTime) {
		this.updateTime = updateTime;
	}

	public List<Memo> getMemos() {
		return this.memos;
	}

	public void setMemos(List<Memo> memos) {
		this.memos = memos;
	}

	public Memo addMemo(Memo memo) {
		getMemos().add(memo);
		memo.setShortlistAttraction(this);

		return memo;
	}

	public Memo removeMemo(Memo memo) {
		getMemos().remove(memo);
		memo.setShortlistAttraction(null);

		return memo;
	}

	public Attraction getAttraction() {
		return this.attraction;
	}

	public void setAttraction(Attraction attraction) {
		this.attraction = attraction;
	}

	public Shortlist getShortlist() {
		return this.shortlist;
	}

	public void setShortlist(Shortlist shortlist) {
		this.shortlist = shortlist;
	}

}