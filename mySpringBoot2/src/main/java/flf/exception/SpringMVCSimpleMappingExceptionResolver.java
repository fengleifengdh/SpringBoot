package flf.exception;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.handler.SimpleMappingExceptionResolver;

public class SpringMVCSimpleMappingExceptionResolver extends SimpleMappingExceptionResolver {

	private static Logger logger = LoggerFactory.getLogger(SpringMVCSimpleMappingExceptionResolver.class);

	@Override
	protected ModelAndView doResolveException(HttpServletRequest request, HttpServletResponse response, 
			Object handler,Exception ex) {
		ModelAndView mv = super.doResolveException(request, response, handler, ex);
		// 异常信息打印出来
		ex.printStackTrace();
		return mv;
	}
	
}
