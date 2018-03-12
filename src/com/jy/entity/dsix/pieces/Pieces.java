package com.jy.entity.dsix.pieces;

import java.util.Date;

import org.apache.ibatis.type.Alias;

import com.jy.entity.base.BaseEntity;
@Alias("Pieces")
public class Pieces extends BaseEntity {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String id;
	private String piecesMark;
	private String title;
	private String keywork;
	private String description;
	private String picUrl;
	private String sortId;
	private String createUser;
	private String content;
	private Date createTime;
	private Date beginTime;
	private Date endTime;
	
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getPiecesMark() {
		return piecesMark;
	}
	public void setPiecesMark(String piecesMark) {
		this.piecesMark = piecesMark;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getKeywork() {
		return keywork;
	}
	public void setKeywork(String keywork) {
		this.keywork = keywork;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getPicUrl() {
		return picUrl;
	}
	public void setPicUrl(String picUrl) {
		this.picUrl = picUrl;
	}
	public String getSortId() {
		return sortId;
	}
	public void setSortId(String sortId) {
		this.sortId = sortId;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public Date getCreateTime() {
		return createTime;
	}
	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}
	public Date getBeginTime() {
		return beginTime;
	}
	public void setBeginTime(Date beginTime) {
		this.beginTime = beginTime;
	}
	public Date getEndTime() {
		return endTime;
	}
	public void setEndTime(Date endTime) {
		this.endTime = endTime;
	}
	public String getCreateUser() {
		return createUser;
	}
	public void setCreateUser(String createUser) {
		this.createUser = createUser;
	}
	
}
