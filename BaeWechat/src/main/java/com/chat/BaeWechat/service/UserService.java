package com.chat.BaeWechat.service;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.chat.BaeWechat.dao.DaoSupport;
import com.chat.BaeWechat.entity.User;
import com.chat.BaeWechat.util.PageData;

@Service("userService")
public class UserService {
	
	@Resource(name = "daoSupport")
	private DaoSupport dao;
	
	/**
	 * 
	 * @Title: getUserByNameAndPwd 
	 * @Description: ÅÐ¶ÏµÇÂ¼
	 * @param @param pd
	 * @param @return
	 * @param @throws Exception   
	 * @return PageData    
	 * @throws
	 */
	public User getUserByNameAndPwd(PageData pd)throws Exception{
		return (User) dao.findForObject("UserMapper.getUserInfo", pd);
	}

}
