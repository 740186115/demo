package com.jy.service.dsix.squareclasses;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.jy.entity.dsix.squareclasses.Squareclasses;
import com.jy.repository.dsix.squareclasses.SquareClassesDAO;
import com.jy.service.base.BaseServiceImp;



@Service("SquareClassessService")
public class SquareClassesServiceImp extends BaseServiceImp<Squareclasses> implements SquareClassessService {
	@Autowired
	private SquareClassesDAO squareClassesDAO;
	
	@Override
	public int insertSquareClassess(Squareclasses o) throws Exception {
		int res=0;
		String classesname=o.getClassesname();
		SimpleDateFormat myFmt=new SimpleDateFormat("yyyy-MM-dd");
		o.setUpdatetime(myFmt.format(new Date()));
		//查询数据库是否已经存在用户名
		if(StringUtils.isNotBlank(classesname)&&(squareClassesDAO.findCountByClassesname(classesname)==0)){
			squareClassesDAO.insert(o);	
			res=1;
		}
		return res;
	}
	
	@Override
	@Transactional
	public void deleteSquareclasses(Squareclasses o) {
		//事务删除
		squareClassesDAO.delete(o);
	}

	@Override
	public List<Squareclasses> findauto() {
		// TODO Auto-generated method stub
		return squareClassesDAO.findauto();
	}
}
