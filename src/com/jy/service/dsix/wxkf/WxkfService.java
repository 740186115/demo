package com.jy.service.dsix.wxkf;

import java.util.List;

import com.jy.entity.dsix.wxkf.Wxkf;
import com.jy.service.base.BaseService;

public interface WxkfService extends BaseService<Wxkf> {

	
	  /**
     * 新增用户(后台)
     * @param Wxkf
     * @return
     */
  /*  public int insertWxkf(Wxkf wxkf) throws Exception;*/
    
    /**
     * 获取客服信息
     * @return
     */
    public Wxkf getWxkfData(String kfid);
    
    
    /**
     * 获得客服列表
     * @return
     */
    public List<Wxkf> getWxkfList(String kfName,String createTime);
    
    /**
	* 删除客服Id
	*/
	public int deleteWxkf(String KfId);
}
