package sn.com.douane.ejb.rc.exception;

import javax.ejb.ApplicationException;

/**
 * @version 1.0
 * @authr
 */

@ApplicationException(rollback=true)
public class RcException extends RuntimeException {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public RcException(String message) {
		super(message);

	}

	/**
	 */
	public RcException(String message, Throwable cause) {
		super(message, cause);

	}

	public RcException(Throwable cause) {
		super(cause);
	}

}
