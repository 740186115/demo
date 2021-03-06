package com.jy.entity.dsix.comments;

import org.apache.ibatis.type.Alias;

import com.jy.entity.base.BaseEntity;
@Alias("Comments")
public class Comments extends BaseEntity {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private int id;
	private String  memberId;
	private String  memberName;
	private String  newsId;
	private String  content;
	private String  isShow;
	private String  createTime;
	private String  beginTime;
	private String  endTime;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNewsId() {
		return newsId;
	}
	public void setNewsId(String newsId) {
		this.newsId = newsId;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
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
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	public String getIsShow() {
		return isShow;
	}
	public void setIsShow(String isShow) {
		this.isShow = isShow;
	}
	public String getMemberId() {
		return memberId;
	}
	public void setMemberId(String memberId) {
		this.memberId = memberId;
	}
	public String getMemberName() {
		return memberName;
	}
	public void setMemberName(String memberName) {
		this.memberName = memberName;
	}
	
	
}
