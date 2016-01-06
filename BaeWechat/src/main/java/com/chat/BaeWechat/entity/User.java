package com.chat.BaeWechat.entity;

/**
 * 项目名称：BaeWechat   
 * 类名称：User   
 * 类描述：   
 * 创建人：Songcxd
 * 创建时间：2015年12月1日 下午2:35:23   
 * 修改人：
 * 修改时间： 
 * 修改备注：   
 * @version    
 *
 */
public class User {
	
	private String USER_ID;	
	private String USERNAME;
	private String PASSWORD;
	private String NICKNAME;
	private String ROLE_ID;
	
	public String getUSER_ID() {
		return USER_ID;
	}
	public void setUSER_ID(String uSER_ID) {
		USER_ID = uSER_ID;
	}
	public String getUSERNAME() {
		return USERNAME;
	}
	public void setUSERNAME(String uSERNAME) {
		USERNAME = uSERNAME;
	}
	public String getPASSWORD() {
		return PASSWORD;
	}
	public void setPASSWORD(String pASSWORD) {
		PASSWORD = pASSWORD;
	}
	public String getNICKNAME() {
		return NICKNAME;
	}
	public void setNICKNAME(String nICKNAME) {
		NICKNAME = nICKNAME;
	}
	public String getROLE_ID() {
		return ROLE_ID;
	}
	public void setROLE_ID(String rOLE_ID) {
		ROLE_ID = rOLE_ID;
	}
	
	
	
}
