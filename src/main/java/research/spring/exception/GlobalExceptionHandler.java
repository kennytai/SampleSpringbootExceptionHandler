
package research.spring.exception;

import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;


/**
 * @author Kenny Tai Huynh
 */
@ControllerAdvice
public class GlobalExceptionHandler {

	private static final Logger logger = LoggerFactory.getLogger(GlobalExceptionHandler.class);

	@ExceptionHandler(TestException.class)
	@ResponseStatus(value=HttpStatus.NOT_FOUND, reason="Exception message")
	public String handleInvalidStarException(HttpServletRequest request, Exception ex){
		if(logger.isDebugEnabled()) {
			logger.debug("Exception at: " + request.getRequestURL());
		}
		return "User_error";
	}
}
