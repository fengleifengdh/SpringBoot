package flf.interceptor;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.method.HandlerMethod;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

/**
 * 
 * @author Deng
 *
 */
public class MobileUserAuthenticationInterceptor implements HandlerInterceptor  {
	
	
	
	
	private static Logger logger = LoggerFactory.getLogger(MobileUserAuthenticationInterceptor.class);

	@Override
	public boolean preHandle(HttpServletRequest request,
			HttpServletResponse response, Object handler) throws Exception {
//		String tokenId = request.getHeader("tokenId");
//		if(StringUtils.isEmpty(tokenId)){
//			tokenId = request.getParameter("tokenId");
//		}
//		request.setAttribute("tokenIdFromHead", tokenId);
//		logger.debug("Token id is "+tokenId);
	
		if(handler instanceof HandlerMethod){
			HandlerMethod handlerMethod = (HandlerMethod)handler;
			String returnTypeName = handlerMethod.getReturnType().getGenericParameterType().toString();
		}
		return true;
	}

	@Override
	public void postHandle(HttpServletRequest request,
			HttpServletResponse response, Object handler,
			ModelAndView modelAndView) throws Exception {
		if(modelAndView != null){
//			modelAndView.addObject("tokenId", request.getAttribute("tokenIdFromHead"));
//			System.out.println(request.getContextPath());
//			StringBuffer url=request.getRequestURL();
//			String requestUrl = "";
//	        if(StringUtil.isblank(request.getQueryString())) {
//	        	requestUrl = url.toString();
//	        }else {
//	        	requestUrl += url.toString();
//	        	requestUrl += "?";
//	        	requestUrl += request.getQueryString();
//	        }
			modelAndView.addObject("ctx", request.getContextPath());
//			modelAndView.addObject("version", version);
		}
	}

	@Override
	public void afterCompletion(HttpServletRequest request,
			HttpServletResponse response, Object handler, Exception ex)
			throws Exception {
		
	}


	
}

