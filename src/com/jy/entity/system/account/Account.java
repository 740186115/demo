package com.jy.entity.system.account;

import java.util.ArrayList;
import java.util.List;

import org.apache.ibatis.type.Alias;

import com.jy.entity.base.BaseEntity;
import com.jy.entity.dsix.lookabout.Lookabout;
import com.jy.entity.dsix.speedabout.Speedabout;
import com.jy.entity.system.log.LoginLog;
import com.jy.entity.system.org.Position;

/**
 * 用户帐号表
 */
@Alias("BaseAccount")
public class Account extends BaseEntity {

	private static final long serialVersionUID = 1L;

	private String accountId;

	private String loginName;

	private String password;

	private String salt;

	private String name;

	private String picUrl;

	private String skin;

	private String roleId;

	private String roleName;

	private String email;

	private String description;

	private Integer isValid;

	private String createTime;

	private String updateTime;

	private LoginLog loginLog = new LoginLog();

	private String keyWord;
	//////////////////////////////
	private String phone;

	private String userclassesid;

	private String classesname;

	private String sex;

	private String city;

	private String screen;

	private String xingquaihao;
	
	private String zhiye;
	
	private String nianling;
	
	private String shengao;
	
	private String tizhong;
	
	private String gexingqianming;
	
	private String xingzuo;

	private List<Position> poss = new ArrayList<Position>();
	
	private List<Speedabout> speedabout = new ArrayList<Speedabout>();
	
	private List<Lookabout> lookabout = new ArrayList<Lookabout>();

	public String getScreen() {
		return screen;
	}

	public void setScreen(String screen) {
		this.screen = screen;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getUserclassesid() {
		return userclassesid;
	}

	public void setUserclassesid(String userclassesid) {
		this.userclassesid = userclassesid;
	}

	public String getClassesname() {
		return classesname;
	}

	public void setClassesname(String classesname) {
		this.classesname = classesname;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getAccountId() {
		return accountId;
	}

	public void setAccountId(String accountId) {
		this.accountId = accountId;
	}

	public String getLoginName() {
		return loginName;
	}

	public void setLoginName(String loginName) {
		this.loginName = loginName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getRoleId() {
		return roleId;
	}

	public void setRoleId(String roleId) {
		this.roleId = roleId;
	}

	public String getRoleName() {
		return roleName;
	}

	public void setRoleName(String roleName) {
		this.roleName = roleName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Integer getIsValid() {
		return isValid;
	}

	public void setIsValid(Integer isValid) {
		this.isValid = isValid;
	}

	public String getCreateTime() {
		return createTime;
	}

	public void setCreateTime(String createTime) {
		this.createTime = createTime;
	}

	public String getSkin() {
		return skin;
	}

	public void setSkin(String skin) {
		this.skin = skin;
	}

	public String getUpdateTime() {
		return updateTime;
	}

	public void setUpdateTime(String updateTime) {
		this.updateTime = updateTime;
	}

	public String getPicUrl() {
		return picUrl;
	}

	public void setPicUrl(String picUrl) {
		this.picUrl = picUrl;
	}

	public String getSalt() {
		return salt;
	}

	public void setSalt(String salt) {
		this.salt = salt;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	@Override
	public String toString() {
		return "Account [accountId=" + accountId + ", loginName=" + loginName + ", password=" + password + ", name="
				+ name + ", skin=" + skin + ", roleId=" + roleId + ", email=" + email + ", isValid=" + isValid
				+ ", createTime=" + createTime + ", updateTime=" + updateTime + "]";
	}

	public String getKeyWord() {
		return keyWord;
	}

	public void setKeyWord(String keyWord) {
		this.keyWord = keyWord;
	}

	public LoginLog getLoginLog() {
		return loginLog;
	}

	public void setLoginLog(LoginLog loginLog) {
		this.loginLog = loginLog;
	}

	public List<Position> getPoss() {
		return poss;
	}

	public void setPoss(List<Position> poss) {
		this.poss = poss;
	}
	
	public List<Speedabout> getSpeedabout() {
		return speedabout;
	}

	public void setSpeedabout(List<Speedabout> speedabout) {
		this.speedabout = speedabout;
	}

	public List<Lookabout> getLookabout() {
		return lookabout;
	}

	public void setLookabout(List<Lookabout> lookabout) {
		this.lookabout = lookabout;
	}

	public String getXingquaihao() {
		return xingquaihao;
	}

	public void setXingquaihao(String xingquaihao) {
		this.xingquaihao = xingquaihao;
	}

	public String getZhiye() {
		return zhiye;
	}

	public void setZhiye(String zhiye) {
		this.zhiye = zhiye;
	}

	public String getNianling() {
		return nianling;
	}

	public void setNianling(String nianling) {
		this.nianling = nianling;
	}

	public String getShengao() {
		return shengao;
	}

	public void setShengao(String shengao) {
		this.shengao = shengao;
	}

	public String getTizhong() {
		return tizhong;
	}

	public void setTizhong(String tizhong) {
		this.tizhong = tizhong;
	}

	public String getGexingqianming() {
		return gexingqianming;
	}

	public void setGexingqianming(String gexingqianming) {
		this.gexingqianming = gexingqianming;
	}

	public String getXingzuo() {
		return xingzuo;
	}

	public void setXingzuo(String xingzuo) {
		this.xingzuo = xingzuo;
	}
	
	
}