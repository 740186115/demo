package com.jy.controller.dsix.speedabout;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.jy.common.ajax.AjaxRes;
import com.jy.common.annotation.ControllerOptLog;
import com.jy.common.mybatis.Page;
import com.jy.common.utils.base.Const;
import com.jy.controller.base.BaseController;
import com.jy.entity.dsix.speedabout.Speedabout;
import com.jy.entity.system.account.Account;
import com.jy.service.dsix.speedabout.SpeedaboutService;
import com.jy.service.system.account.AccountService;

@Controller
@RequestMapping("/backstage/speedabout/")
public class SpeedAboutController  extends BaseController<Speedabout>{
	
	@Autowired
	private SpeedaboutService service;
	
	@Autowired
	private AccountService accountservice;
	
	@RequestMapping("index")	
	public String index(Model model){
		if(doSecurityIntercept(Const.RESOURCES_TYPE_MENU)){
			model.addAttribute("permitBtn", getPermitBtn(Const.RESOURCES_TYPE_FUNCTION));	
			return "/system/dsix/speedabout/list";
		}
		return Const.NO_AUTHORIZED_URL;
	}
	
	@RequestMapping(value="findByPage", method=RequestMethod.POST)
	@ResponseBody
	public AjaxRes findByPage(Page<Speedabout> page,Speedabout o){
		AjaxRes ar=getAjaxRes();
		if(ar.setNoAuth(doSecurityIntercept(Const.RESOURCES_TYPE_MENU,"/backstage/speedabout/index"))){
			try {
				Page<Speedabout> accounts=service.findByPage(o, page);
				Map<String, Object> p=new HashMap<String, Object>();
				p.put("permitBtn",getPermitBtn(Const.RESOURCES_TYPE_BUTTON));
				p.put("list",accounts);		
				ar.setSucceed(p);
			} catch (Exception e) {
				logger.error(e.toString(),e);
				ar.setFailMsg(Const.DATA_FAIL);
			}
		}	
		return ar;
	}
	
	
	@ControllerOptLog(desc="新增")
	@RequestMapping(value="add", method=RequestMethod.POST)
	@ResponseBody
	public AjaxRes add(Speedabout o,Account a){
		AjaxRes ar=getAjaxRes();
			try {
				a.setAccountId(o.getUserid());
				accountservice.update(a);
				int res=service.insertSpeedabout(o);
				if(res==1)ar.setSucceedMsg(Const.SAVE_SUCCEED);
				else ar.setFailMsg("数据有误，请重试");	
			} catch (Exception e) {
				logger.error(e.toString(),e);
				ar.setFailMsg(Const.SAVE_FAIL);
			}
		return ar;
	}
	
	@ControllerOptLog(desc="更新")
	@RequestMapping(value="update", method=RequestMethod.POST)
	@ResponseBody
	public AjaxRes update(Speedabout o,Account a){
		AjaxRes ar=getAjaxRes();
		
		if(ar.setNoAuth(doSecurityIntercept(Const.RESOURCES_TYPE_BUTTON))){
			try {
				service.update(o);
				a.setAccountId(o.getUserid());
				accountservice.update(a);
				ar.setSucceedMsg(Const.UPDATE_SUCCEED);
			} catch (Exception e) {
				logger.error(e.toString(),e);
				ar.setFailMsg(Const.UPDATE_FAIL);
			}
		}	
		return ar;
	}
	
	@ControllerOptLog(desc="删除")
	@RequestMapping(value="del", method=RequestMethod.POST)
	@ResponseBody
	public AjaxRes del(Speedabout o){
		AjaxRes ar=getAjaxRes();
		if(ar.setNoAuth(doSecurityIntercept(Const.RESOURCES_TYPE_BUTTON))){
			try {
				service.deleteSpeedabout(o);
				ar.setSucceedMsg(Const.DEL_SUCCEED);
			} catch (Exception e) {
				logger.error(e.toString(),e);
				ar.setFailMsg(Const.DEL_FAIL);
			}
		}	
		return ar;
	}
	
	@RequestMapping(value="find", method=RequestMethod.POST)
	@ResponseBody
	public AjaxRes find(Speedabout o){
		AjaxRes ar=getAjaxRes();
		if(ar.setNoAuth(doSecurityIntercept(Const.RESOURCES_TYPE_BUTTON))){	
			try {
				List<Speedabout> list=service.find(o);
				Speedabout acount =list.get(0);
				ar.setSucceed(acount);
			} catch (Exception e) {
				logger.error(e.toString(),e);
				ar.setFailMsg(Const.DATA_FAIL);
			}
		}
		return ar;
	}
	
	@RequestMapping(value="findauto", method=RequestMethod.POST)
	@ResponseBody
	public AjaxRes findauto(){
		AjaxRes ar=getAjaxRes();
			try {
				List<Speedabout> list=service.findauto();
				ar.setSucceed(list);
			} catch (Exception e) {
				logger.error(e.toString(),e);
				ar.setFailMsg(Const.DATA_FAIL);
			}
		return ar;
	}
}
