/*
 * Cree le 12 dec. 2005
 *
 * TODO Pour changer le modele de ce fichier genere, allez e :
 * Fenetre - Preferences - Java - Style de code - Modeles de code
 */
package tn.com.tw.java.exception;

/**
 * @author user
 * 
 * TODO Pour changer le modele de ce commentaire de type genere, allez e :
 * Fenetre - Preferences - Java - Style de code - Modeles de code
 */
public class TwreException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 4466587262556326630L;
	/**
	 * @param message
	 */
	private String valeurAffiche;

	public TwreException(String message) {
		super(message);
		// TODO Raccord de constructeur auto-genere
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
		// TODO Raccord de constructeur auto-genere
	}

	/**
	 * @param cause
	 */
	public TwreException(Throwable cause) {
		super(cause);
		// TODO Raccord de constructeur auto-genere
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