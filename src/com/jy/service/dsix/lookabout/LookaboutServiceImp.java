package com.jy.service.dsix.lookabout;

import java.text.SimpleDateFormat;
import java.util.List;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.jy.entity.dsix.lookabout.Lookabout;
import com.jy.repository.dsix.lookabout.LookaboutDAO;
import com.jy.service.base.BaseServiceImp;



@Service("LookaboutService")
public class LookaboutServiceImp extends BaseServiceImp<Lookabout> implements LookaboutService {
	@Autowired
	private LookaboutDAO squareDAO;
	
	@Override
	public int insertLookabout(Lookabout o) throws Exception {
		int res=0;
		SimpleDateFormat myFmt=new SimpleDateFormat("yyyy-MM-dd");
		if(StringUtils.isNotBlank(o.getLooknumber())){
			squareDAO.insert(o);	
			res=1;
		}
		return res;
	}
	
	@Override
	@Transactional
	public void deleteLookabout(Lookabout o) {
		//事务删除
		squareDAO.delete(o);
	}
	
	@Override
	public List<Lookabout> findauto() {
		// TODO Auto-generated method stub
		return squareDAO.findauto();
	}
}
