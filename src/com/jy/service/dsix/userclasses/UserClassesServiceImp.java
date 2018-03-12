package com.jy.service.dsix.userclasses;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.jy.entity.dsix.upuser.Userclasses;
import com.jy.repository.dsix.userclasses.UserClassesDAO;
import com.jy.service.base.BaseServiceImp;



@Service("UserclassessService")
public class UserClassesServiceImp extends BaseServiceImp<Userclasses> implements UserClassessService {
	@Autowired
	private UserClassesDAO UserclassesDAO;
	
	@Override
	public int insertUserClassess(Userclasses o) throws Exception {
		int res=0;
		String classesname=o.getClassesname();
		SimpleDateFormat myFmt=new SimpleDateFormat("yyyy-MM-dd");
		o.setUpdatetime(myFmt.format(new Date()));
		//查询数据库是否已经存在用户名
		if(StringUtils.isNotBlank(classesname)&&(UserclassesDAO.findCountByClassesname(classesname)==0)){
			UserclassesDAO.insert(o);	
			res=1;
		}
		return res;
	}
	
	@Override
	@Transactional
	public void deleteUserclasses(Userclasses o) {
		//事务删除
		UserclassesDAO.delete(o);
	}

	@Override
	public List<Userclasses> findauto() {
		// TODO Auto-generated method stub
		return UserclassesDAO.findauto();
	}
}
