
package research.spring.exception;

/**
 * @author Kenny Tai Huynh 
 **/
public abstract class CustomException extends RuntimeException{

	/**
	 * 
	 */
	private static final long serialVersionUID = 8550615863092041390L;
	
	private final int status;
	private final String error;
	private final String exception;
	private final String message;
	
	/**
	 * @param status
	 * @param error
	 * @param exception
	 * @param message
	 */
	public CustomException(int status, String error, String exception, String message) {
		this.status = status;
		this.error = error;
		this.exception = exception;
		this.message = message;
	}

	/**
	 * @return the status
	 */
	public int getStatus() {
		return status;
	}

	/**
	 * @return the error
	 */
	public String getError() {
		return error;
	}

	/**
	 * @return the exception
	 */
	public String getException() {
		return exception;
	}

	/**
	 * @return the message
	 */
	@Override
	public String getMessage() {
		return message;
	}
	
}
