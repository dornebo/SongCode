package party.w0412.cxdchat.controller.base;

import javax.servlet.http.HttpServletRequest;

import org.apache.log4j.Logger;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;
import org.springframework.web.servlet.ModelAndView;

import party.w0412.cxdchat.util.PageData;

/**
 *    
 * 项目名称：cxdchat   
 * 类名称：BaseController   
 * 类描述：   
 * 创建人：Songcxd
 * 创建时间：2016年1月7日 下午4:08:37   
 * 修改人：
 * 修改时间： 
 * 修改备注：   
 * @version    
 *
 */
@SuppressWarnings("unused")
public class BaseController {

	protected Logger logger = Logger.getLogger(this.getClass());

	
	private static final long serialVersionUID = 6357869213649815390L;
	
	/**
	 * 得到PageData
	 */
	public PageData getPageData(){
		return new PageData(this.getRequest());
	}
	
	/**
	 * 得到ModelAndView
	 */
	public ModelAndView getModelAndView(){
		return new ModelAndView();
	}
	
	/**
	 * 得到request对象
	 */
	public HttpServletRequest getRequest() {
		HttpServletRequest request = ((ServletRequestAttributes)RequestContextHolder.getRequestAttributes()).getRequest();
		
		return request;
	}

	public static void logBefore(Logger logger, String interfaceName){
		logger.info("");
		logger.info("start");
		logger.info(interfaceName);
	}
	
	public static void logAfter(Logger logger){
		logger.info("end");
		logger.info("");
	}
}
