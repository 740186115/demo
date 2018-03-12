package com.jy.repository.dsix.comments;

import org.apache.ibatis.annotations.Param;

import com.jy.entity.dsix.comments.Comments;
import com.jy.repository.base.BaseDao;
import com.jy.repository.base.JYBatis;

@JYBatis
public interface CommentsDao extends BaseDao<Comments> {

	public void editIsShow(@Param("id")Integer id);
	public void editShow(@Param("id")Integer id);
}
