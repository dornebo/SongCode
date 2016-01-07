package party.w0412.cxdchat.controller.base;

import javax.servlet.http.HttpServletRequest;

import org.apache.log4j.Logger;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;
import org.springframework.web.servlet.ModelAndView;

import party.w0412.cxdchat.util.PageData;

/**
 * ��Ŀ���ƣ�BaeWechat   
 * �����ƣ�BaseController   
 * ��������   
 * �����ˣ�Songcxd
 * ����ʱ�䣺2015��12��1�� ����5:22:18   
 * �޸��ˣ�
 * �޸�ʱ�䣺 
 * �޸ı�ע��   
 * @version    
 *
 */
@SuppressWarnings("unused")
public class BaseController {

	protected Logger logger = Logger.getLogger(this.getClass());

	
	private static final long serialVersionUID = 6357869213649815390L;
	
	/**
	 * �õ�PageData
	 */
	public PageData getPageData(){
		return new PageData(this.getRequest());
	}
	
	/**
	 * �õ�ModelAndView
	 */
	public ModelAndView getModelAndView(){
		return new ModelAndView();
	}
	
	/**
	 * �õ�request����
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
