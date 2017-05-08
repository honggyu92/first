package first.common.logger;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

<<<<<<< HEAD
import first.common.logger.LoggerInterceptor;
=======
>>>>>>> 5da739f99efce9f5a88cb0a3c908b6e67d04ae2e

public class LoggerInterceptor extends HandlerInterceptorAdapter {
	protected Log log = LogFactory.getLog(LoggerInterceptor.class);
	
	@Override
<<<<<<< HEAD
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
		if (log.isDebugEnabled()) {
=======
	public boolean preHandle(
			
			HttpServletRequest request, 
			HttpServletResponse response, 
			Object handler
			
	) throws Exception {
		
		if ( log.isDebugEnabled() ) {
>>>>>>> 5da739f99efce9f5a88cb0a3c908b6e67d04ae2e
			log.debug("======================================          START         ======================================");
			log.debug(" Request URI \t:  " + request.getRequestURI());
		}
		return super.preHandle(request, response, handler);
<<<<<<< HEAD
	}
	
	@Override
	public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception {
		if (log.isDebugEnabled()) {
			log.debug("======================================           END          ======================================\n");
		}
	}
}
=======
		
	}
	
	@Override
	public void postHandle(
			
			HttpServletRequest request,
			HttpServletResponse response,
			Object handler,
			ModelAndView modelAndView
	) throws Exception {
		
		if ( log.isDebugEnabled() ) {
			log.debug("======================================           END          ======================================\n");
		}
	}


}
>>>>>>> 5da739f99efce9f5a88cb0a3c908b6e67d04ae2e
