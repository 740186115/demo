package com.jy.entity.dsix.imessage;

import java.util.Date;

import org.apache.ibatis.type.Alias;

import com.jy.entity.base.BaseEntity;
@Alias("Imessage")
public class Imessage extends BaseEntity {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private int id;
	private String title;
	private String content;
	private String createUser;
	private String lookwhere;
	private String sex;
	private String classesid;
	private String createTime;
	private String beginTime;
	private String endTime;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public String getCreateUser() {
		return createUser;
	}
	public void setCreateUser(String createUser) {
		this.createUser = createUser;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	
	public String getClassesid() {
		return classesid;
	}
	public void setClassesid(String classesid) {
		this.classesid = classesid;
	}
	
	public String getCreateTime() {
		return createTime;
	}
	public void setCreateTime(String createTime) {
		this.createTime = createTime;
	}
	public String getBeginTime() {
		return beginTime;
	}
	public void setBeginTime(String beginTime) {
		this.beginTime = beginTime;
	}
	public String getEndTime() {
		return endTime;
	}
	public void setEndTime(String endTime) {
		this.endTime = endTime;
	}
	public String getLookwhere() {
		return lookwhere;
	}
	public void setLookwhere(String lookwhere) {
		this.lookwhere = lookwhere;
	}
	
}

