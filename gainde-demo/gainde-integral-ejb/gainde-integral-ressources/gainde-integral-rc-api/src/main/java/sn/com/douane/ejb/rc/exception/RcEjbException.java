package sn.com.douane.ejb.rc.exception;

import javax.ejb.ApplicationException;



/**
 * @version 1.0
 * @author
 */
@ApplicationException(rollback=true)
public class RcEjbException extends Exception {
	/**
	 * 
	 */
	private static final long serialVersionUID = 4790283442388861787L;

	// champs privés nature de opetation
	// Crud
	private int code = 0;
	
	private String valeurAffiche;

	public RcEjbException() {
		super();
	}

	public RcEjbException(String message) {
		super(message);
	}
	
	public RcEjbException(String message, String valaffich) {
		super(message);
		setValeurAffiche(valaffich);
	}


	public RcEjbException(String message, Throwable cause) {
		super(message, cause);
	}

	public RcEjbException(Throwable cause) {
		super(cause);
	}

	public RcEjbException(String message, int code) {
		super(message);
		this.code=code;
	}

	public RcEjbException(Throwable cause, int code) {
		super(cause);
		this.code=code;
	}

	public RcEjbException(String message, Throwable cause, int code) {
		super(message, cause);
		this.code=code;
	}

	public int getCode() {
		return code;
	}

	public void setCode(int code) {
		this.code = code;
	}

	public String getValeurAffiche() {
		return valeurAffiche;
	}

	public void setValeurAffiche(String valeurAffiche) {
		this.valeurAffiche = valeurAffiche;
	}

}
