/**
 * 
 */
package sn.com.douane.ejb.declaration.model.keys;

import java.io.Serializable;
import java.sql.Date;

import javax.persistence.Column;

/**
 * @author moussakare
 *
 */
public class CessionSommierKey implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -5436828900270465046L;
	
	@Column(name = "DECANNEEENREGDEC", length = 4, nullable = false)
	private java.lang.String decAnneeEnregDec;
	@Column(name = "DECBURENREGDEC", length = 3, nullable = false)
    private java.lang.String decBurEnregDec;
	@Column(name = "DECNUMDECLARATION", nullable = false)
    private java.lang.Integer decNumDeclaration;
	@Column(name = "DECNUMARTDECL", nullable = false)
    private java.lang.Integer decNumArtDec;
	@Column(name = "DECPPMEMETTEUR", length = 5, nullable = false)
    private java.lang.String decPpmEmetteur;
	@Column(name = "DECPPMDESTINATAIRE", length = 5, nullable = false)
    private java.lang.String decPpmDestinataire;
	@Column(name = "DECDATECESSION", nullable = false)
    private java.sql.Date decDateCession;
	/**
	 * 
	 */
	public CessionSommierKey() {
		super();
		// TODO Auto-generated constructor stub
	}
	/**
	 * @param decAnneeEnregDec
	 * @param decBurEnregDec
	 * @param decNumDeclaration
	 * @param decNumArtDec
	 * @param decPpmEmetteur
	 * @param decPpmDestinataire
	 * @param decDateCession
	 */
	public CessionSommierKey(String decAnneeEnregDec, String decBurEnregDec,
			Integer decNumDeclaration, Integer decNumArtDec,
			String decPpmEmetteur, String decPpmDestinataire,
			Date decDateCession) {
		super();
		this.decAnneeEnregDec = decAnneeEnregDec;
		this.decBurEnregDec = decBurEnregDec;
		this.decNumDeclaration = decNumDeclaration;
		this.decNumArtDec = decNumArtDec;
		this.decPpmEmetteur = decPpmEmetteur;
		this.decPpmDestinataire = decPpmDestinataire;
		this.decDateCession = decDateCession;
	}
	/**
	 * @return the decAnneeEnregDec
	 */
	public java.lang.String getDecAnneeEnregDec() {
		return decAnneeEnregDec;
	}
	/**
	 * @param decAnneeEnregDec the decAnneeEnregDec to set
	 */
	public void setDecAnneeEnregDec(java.lang.String decAnneeEnregDec) {
		this.decAnneeEnregDec = decAnneeEnregDec;
	}
	/**
	 * @return the decBurEnregDec
	 */
	public java.lang.String getDecBurEnregDec() {
		return decBurEnregDec;
	}
	/**
	 * @param decBurEnregDec the decBurEnregDec to set
	 */
	public void setDecBurEnregDec(java.lang.String decBurEnregDec) {
		this.decBurEnregDec = decBurEnregDec;
	}
	/**
	 * @return the decNumDeclaration
	 */
	public java.lang.Integer getDecNumDeclaration() {
		return decNumDeclaration;
	}
	/**
	 * @param decNumDeclaration the decNumDeclaration to set
	 */
	public void setDecNumDeclaration(java.lang.Integer decNumDeclaration) {
		this.decNumDeclaration = decNumDeclaration;
	}
	/**
	 * @return the decNumArtDec
	 */
	public java.lang.Integer getDecNumArtDec() {
		return decNumArtDec;
	}
	/**
	 * @param decNumArtDec the decNumArtDec to set
	 */
	public void setDecNumArtDec(java.lang.Integer decNumArtDec) {
		this.decNumArtDec = decNumArtDec;
	}
	/**
	 * @return the decPpmEmetteur
	 */
	public java.lang.String getDecPpmEmetteur() {
		return decPpmEmetteur;
	}
	/**
	 * @param decPpmEmetteur the decPpmEmetteur to set
	 */
	public void setDecPpmEmetteur(java.lang.String decPpmEmetteur) {
		this.decPpmEmetteur = decPpmEmetteur;
	}
	/**
	 * @return the decPpmDestinataire
	 */
	public java.lang.String getDecPpmDestinataire() {
		return decPpmDestinataire;
	}
	/**
	 * @param decPpmDestinataire the decPpmDestinataire to set
	 */
	public void setDecPpmDestinataire(java.lang.String decPpmDestinataire) {
		this.decPpmDestinataire = decPpmDestinataire;
	}
	/**
	 * @return the decDateCession
	 */
	public java.sql.Date getDecDateCession() {
		return decDateCession;
	}
	/**
	 * @param decDateCession the decDateCession to set
	 */
	public void setDecDateCession(java.sql.Date decDateCession) {
		this.decDateCession = decDateCession;
	}
	
	

}
