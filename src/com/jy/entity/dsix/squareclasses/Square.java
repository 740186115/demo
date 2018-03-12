package com.jy.entity.dsix.squareclasses;

import org.apache.ibatis.type.Alias;

import com.jy.entity.base.BaseEntity;
@Alias("BaseSquare")
public class Square   extends BaseEntity {
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private Integer ids;

    private Integer classesid;

    private String coverurl;

    private String orders;

    private String homepagerecommend;

    private String title;

    private String updatetime;

    private String content;
    
    private String keyWord;
    
    private String classesname;
    
    public String getClassesname() {
		return classesname;
	}
    public void setClassesname(String classesname) {
		this.classesname = classesname;
	}

    public Integer getIds() {
        return ids;
    }

    public void setIds(Integer ids) {
        this.ids = ids;
    }

    public Integer getClassesid() {
        return classesid;
    }

    public void setClassesid(Integer classesid) {
        this.classesid = classesid;
    }

    public String getCoverurl() {
        return coverurl;
    }

    public void setCoverurl(String coverurl) {
        this.coverurl = coverurl;
    }

    public String getOrders() {
		return orders;
	}
    public void setOrders(String orders) {
		this.orders = orders;
	}

    public String getHomepagerecommend() {
        return homepagerecommend;
    }

    public void setHomepagerecommend(String homepagerecommend) {
        this.homepagerecommend = homepagerecommend;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getUpdatetime() {
        return updatetime;
    }

    public void setUpdatetime(String updatetime) {
        this.updatetime = updatetime;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
    
    public String getKeyWord() {
		return keyWord;
	}

	public void setKeyWord(String keyWord) {
		this.keyWord = keyWord;
	}
}