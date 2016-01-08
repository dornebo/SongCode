package party.w0412.cxdchat.controller.wechat;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.sword.wechat4j.Wechat;

/**
 * 项目名称：cxdchat   
 * 类名称：WechatController   
 * 类描述：   
 * 创建人：Songcxd
 * 创建时间：2016年1月7日 下午2:53:57   
 * 修改人：
 * 修改时间： 
 * 修改备注：   
 * @version    
 *
 */
@Controller
@RequestMapping(value = "wechat")
public class WechatController {
	
	/*@Resource(name = "wechatService")
	private WechatService wechatService;*/

	/**
	 * 
	 * @Title: callback 
	 * @Description: TODO
	 * @param @param request
	 * @param @return
	 * @param @throws Exception   
	 * @return String    
	 * @url http://localhost:/wechat/callback.do
	 * @throws
	 */
	@ResponseBody
	@RequestMapping(value = "/callback", produces = "text/xml;charset=UTF-8")
	public void callback(HttpServletRequest request, HttpServletResponse response) throws Exception {
			Wechat wc = new Wechat(request);
	        String result = wc.execute();
	        response.getOutputStream().write(result.getBytes());
	}

}
