package party.w0412.cxdchat.resolver;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.HandlerExceptionResolver;
import org.springframework.web.servlet.ModelAndView;

/**
 *    
 * 项目名称：cxdchat   
 * 类名称：MyExceptionResolver   
 * 类描述：   
 * 创建人：Songcxd
 * 创建时间：2016年1月7日 下午5:45:10   
 * 修改人：
 * 修改时间： 
 * 修改备注：   
 * @version    
 *
 */
public class MyExceptionResolver implements HandlerExceptionResolver{

	public ModelAndView resolveException(HttpServletRequest request,
			HttpServletResponse response, Object handler, Exception ex) {
		// TODO Auto-generated method stub
		System.out.println("==============异常开始=============");
		ex.printStackTrace();
		System.out.println("==============异常结束=============");
		ModelAndView mv = new ModelAndView("error");
		mv.addObject("exception", ex.toString().replaceAll("\n", "<br/>"));
		return mv;
	}

}
