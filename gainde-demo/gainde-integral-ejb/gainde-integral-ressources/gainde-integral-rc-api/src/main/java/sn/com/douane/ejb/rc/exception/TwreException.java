package sn.com.douane.ejb.rc.exception;


public class TwreException extends Exception{


	/**
	 * 
	 */
	private static final long serialVersionUID = -7585896801280068789L;
	/**
	 * @param message
	 */
	private String valeurAffiche;

	public TwreException(String message) {
		super(message);
	}

	public TwreException(String message, String valaffich) {
		super(message);
		setValeurAffiche(valaffich);
	}

	/**
	 * @param message
	 * @param cause
	 */
	public TwreException(String message, Throwable cause) {
		super(message, cause);
	}
	
	public TwreException(String message, String valaffich,Throwable cause) {
		super(message, cause);
		setValeurAffiche(valaffich);
	}

	/**
	 * @param cause
	 */
	public TwreException(Throwable cause) {
		super(cause);
	}

	public TwreException() {
		super();
	}

	public String getValeurAffiche() {
		return valeurAffiche;
	}

	public void setValeurAffiche(String valeurAffiche) {
		this.valeurAffiche = valeurAffiche;
	}

}
