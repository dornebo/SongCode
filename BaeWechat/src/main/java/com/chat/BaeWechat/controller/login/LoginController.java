package com.chat.BaeWechat.controller.login;

import java.util.HashMap;
import java.util.Map;

import javax.annotation.Resource;

import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.session.Session;
import org.apache.shiro.subject.Subject;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.chat.BaeWechat.controller.base.BaseController;
import com.chat.BaeWechat.entity.User;
import com.chat.BaeWechat.service.UserService;
import com.chat.BaeWechat.util.Constants;
import com.chat.BaeWechat.util.PageData;
import com.chat.BaeWechat.util.Tools;

/**
 * 项目名称：BaeWechat   
 * 类名称：LoginController   
 * 类描述：   
 * 创建人：Songcxd
 * 创建时间：2015年12月1日 下午5:28:48   
 * 修改人：
 * 修改时间： 
 * 修改备注：   
 * @version    
 *
 */
@SuppressWarnings("unused")
@Controller
public class LoginController extends BaseController {
	
	
	@Resource(name="userService")
	private UserService userService;
	
	/**
	 * 
	 * @Title: login 
	 * @Description: 请求登录，验证用户
	 * @param @return
	 * @param @throws Exception   
	 * @return Object    
	 * @throws
	 */
	
	@RequestMapping(value="/login_login")
	@ResponseBody
	public Object login() throws Exception{
		Map<String,String> map = new HashMap<String,String>();
		PageData pd = new PageData();
		pd = this.getPageData();
		
		String errInfo = "";
		//shiro管理的session
		Subject currentUser = SecurityUtils.getSubject();  
		Session session = currentUser.getSession();
		String sessionCode = (String)session.getAttribute(Constants.SESSION_SECURITY_CODE);		//获取session中的验证码
		
		User user = userService.getUserByNameAndPwd(pd);
		if(user!=null){
			session.setAttribute(Constants.SESSION_USER, user);
			session.removeAttribute(Constants.SESSION_SECURITY_CODE);
		}else{
			errInfo = "usererror！";
		}
		
		
		
		//shiro加入身份验证
		Subject subject = SecurityUtils.getSubject(); 
	    UsernamePasswordToken token = new UsernamePasswordToken(pd.get("username").toString(), pd.get("password").toString()); 
	    try { 
	        subject.login(token); 
	    } catch (AuthenticationException e) { 
	    	errInfo = "身份验证失败！";
	    }
	    
	    if(Tools.isEmpty(errInfo)){
			errInfo = "success";					//验证成功
		}
	    map.put("result", errInfo);
		return (Object)map;
	}
}
