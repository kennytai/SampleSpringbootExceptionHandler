
package research.spring.exception;

/**
 * @author Kenny Tai Huynh 
 *
 */
public class TestException extends CustomException{

	/**
	 * 
	 */
	private static final long serialVersionUID = 7355565041930591354L;

	
	public TestException(int status, String error, String exception, String message) {
		super(status, error, exception, message);
	}

}
