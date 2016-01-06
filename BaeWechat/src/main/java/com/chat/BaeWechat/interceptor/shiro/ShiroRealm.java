package com.chat.BaeWechat.interceptor.shiro;


import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.AuthenticationInfo;
import org.apache.shiro.authc.AuthenticationToken;
import org.apache.shiro.authc.SimpleAuthenticationInfo;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;

/**
 * 项目名称：BaeWechat   
 * 类名称：ShiroRealm   
 * 类描述：   
 * 创建人：Songcxd
 * 创建时间：2015年12月1日 下午4:40:54   
 * 修改人：
 * 修改时间： 
 * 修改备注：   
 * @version    
 *
 */
public class ShiroRealm extends AuthorizingRealm {

	/*
	 * 登录信息和用户验证信息验证(non-Javadoc)
	 * @see org.apache.shiro.realm.AuthenticatingRealm#doGetAuthenticationInfo(org.apache.shiro.authc.AuthenticationToken)
	 */
	@Override
	protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken token) throws AuthenticationException {

		 String username = (String)token.getPrincipal();  				//得到用户名
	     String password = new String((char[])token.getCredentials()); 	//得到密码
		
	     if(null != username && null != password){
	    	 return new SimpleAuthenticationInfo(username, password, getName());
	     }else{
	    	 return null;
	     }
	     
	}
	
	/*
	 * 授权查询回调函数, 进行鉴权但缓存中无用户的授权信息时调试,负责在应用程序中决定用户的访问控制的方法(non-Javadoc)
	 * @see org.apache.shiro.realm.AuthorizingRealm#doGetAuthorizationInfo(org.apache.shiro.subject.PrincipalCollection)
	 */
	@Override
	protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection pc) {

		System.out.println("========2");
		
		return null;
	}

}
