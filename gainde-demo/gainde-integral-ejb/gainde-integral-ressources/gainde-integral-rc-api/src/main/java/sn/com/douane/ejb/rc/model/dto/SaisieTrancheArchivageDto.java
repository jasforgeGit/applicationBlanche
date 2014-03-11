package sn.com.douane.ejb.rc.model.dto;

import java.io.Serializable;

/**
 * @author DEV5
 *
 * TODO Pour changer le mod�le de ce commentaire de type g�n�r�, allez � :
 * Fen�tre - Pr�f�rences - Java - Style de code - Mod�les de code
 */
public class SaisieTrancheArchivageDto implements Serializable{

	private static final long serialVersionUID = 1L;

	private String trArBornInf;

	private String trArBornSup;

	private java.lang.String trArTypeTranches;
	
	private String trArDateTranches;
	
	private String trArDateAjoutTranches;
	
	private String pk;
	/**
	 * @return Renvoie trArDateAjoutTranches.
	 */
	public String getTrArDateAjoutTranches() {
		return trArDateAjoutTranches;
	}
	/**
	 * @param trArDateAjoutTranches trArDateAjoutTranches � d�finir.
	 */
	public void setTrArDateAjoutTranches(String trArDateAjoutTranches) {
		this.trArDateAjoutTranches = trArDateAjoutTranches;
	}
	
	/**
	 * @return Renvoie trArDateTranches.
	 */
	public String getTrArDateTranches() {
		return trArDateTranches;
	}
	/**
	 * @param trArDateTranches trArDateTranches � d�finir.
	 */
	public void setTrArDateTranches(String trArDateTranches) {
		this.trArDateTranches = trArDateTranches;
	}

	
	/**
	 * @return Renvoie pk.
	 */
	public String getPk() {
		return pk;
	}
	/**
	 * @param pk pk � d�finir.
	 */
	public void setPk(String pk) {
		this.pk = pk;
	}
	/**
	 * @return Renvoie trArBornInf.
	 */
	public String getTrArBornInf() {
		return trArBornInf;
	}
	/**
	 * @param trArBornInf trArBornInf � d�finir.
	 */
	public void setTrArBornInf(String trArBornInf) {
		this.trArBornInf = trArBornInf;
	}
	/**
	 * @return Renvoie trArBornSup.
	 */
	public String getTrArBornSup() {
		return trArBornSup;
	}
	/**
	 * @param trArBornSup trArBornSup � d�finir.
	 */
	public void setTrArBornSup(String trArBornSup) {
		this.trArBornSup = trArBornSup;
	}
	
	
	/**
	 * @return Renvoie trArTypeTranches.
	 */
	public java.lang.String getTrArTypeTranches() {
		return trArTypeTranches;
	}
	/**
	 * @param trArTypeTranches trArTypeTranches � d�finir.
	 */
	public void setTrArTypeTranches(java.lang.String trArTypeTranches) {
		this.trArTypeTranches = trArTypeTranches;
	}
}
