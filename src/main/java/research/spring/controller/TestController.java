
package research.spring.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import research.spring.exception.TestException;


/**
 * 
 * @author Kenny Tai Huynh 
 *
 */
@RestController
@RequestMapping("/apps")
public class TestController {
	private static final Logger logger = LoggerFactory.getLogger(TestController.class);

	@RequestMapping(value = "/test/{number}", method = RequestMethod.GET)
	public ResponseEntity<?> testMessage(@PathVariable String number) {
		try {
			long num = Long.parseLong(number);
			//this is a test parsing
		} catch(NumberFormatException e) {
			logger.error("Not a number", e);
			throw new TestException(HttpStatus.NOT_FOUND.value(), "invalid number", "NumberFormatException", "invalid number");
		}
		return ResponseEntity.ok("Good");
	}
}
