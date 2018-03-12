package com.jy.service.dsix.squareclasses;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.jy.entity.dsix.squareclasses.Square;
import com.jy.repository.dsix.squareclasses.SquareDAO;
import com.jy.service.base.BaseServiceImp;



@Service("SquareService")
public class SquareServiceImp extends BaseServiceImp<Square> implements SquareService {
	@Autowired
	private SquareDAO squareDAO;
	
	@Override
	public int insertSquare(Square o) throws Exception {
		int res=0;
		SimpleDateFormat myFmt=new SimpleDateFormat("yyyy-MM-dd");
		o.setUpdatetime(myFmt.format(new Date()));
		//查询数据库是否已经存在用户名
		if(StringUtils.isNotBlank(o.getTitle())){
			squareDAO.insert(o);	
			res=1;
		}
		return res;
	}
	
	@Override
	@Transactional
	public void deleteSquare(Square o) {
		//事务删除
		squareDAO.delete(o);
	}
}
