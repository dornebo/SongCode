package party.w0412.cxdchat.resolver;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.HandlerExceptionResolver;
import org.springframework.web.servlet.ModelAndView;

/**
 * ��Ŀ���ƣ�BaeWechat   
 * �����ƣ�MyExceptionResolver   
 * ��������   
 * �����ˣ�Songcxd
 * ����ʱ�䣺2015��12��1�� ����2:40:20   
 * �޸��ˣ�
 * �޸�ʱ�䣺 
 * �޸ı�ע��   
 * @version    
 *
 */
public class MyExceptionResolver implements HandlerExceptionResolver{

	public ModelAndView resolveException(HttpServletRequest request,
			HttpServletResponse response, Object handler, Exception ex) {
		// TODO Auto-generated method stub
		System.out.println("==============�쳣��ʼ=============");
		ex.printStackTrace();
		System.out.println("==============�쳣����=============");
		ModelAndView mv = new ModelAndView("error");
		mv.addObject("exception", ex.toString().replaceAll("\n", "<br/>"));
		return mv;
	}

}
