package com.chat.BaeWechat.controller.wechat;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.chat.BaeWechat.service.WechatService;


@Controller
@RequestMapping(value = "wechat")
public class WechatController {
	
	@Resource(name = "wechatService")
	private WechatService wechatService;

	/**
	 * 
	 * @Title: callback 
	 * @Description: TODO
	 * @param @param request
	 * @param @return
	 * @param @throws Exception   
	 * @return String    
	 * @url http://www.0412.party/wechat/callback.do
	 * @throws
	 */
	@ResponseBody
	@RequestMapping(value = "/callback", produces = "text/xml;charset=UTF-8")
	public void callback(HttpServletRequest request, HttpServletResponse response) throws Exception {
	        String result = wechatService.execute();
	        response.getOutputStream().write(result.getBytes());
	}

}
