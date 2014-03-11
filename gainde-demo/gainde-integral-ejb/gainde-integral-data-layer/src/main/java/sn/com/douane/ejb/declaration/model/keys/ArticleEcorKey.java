/**
 * 
 */
package sn.com.douane.ejb.declaration.model.keys;

import java.io.Serializable;

import javax.persistence.Column;

/**
 * @author moussakare
 *
 */
public class ArticleEcorKey implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -5210684133721266397L;
	
	@Column(name="ECORANNEE" , length=4, nullable=false)
    private java.lang.String ecorAnnee;
	@Column(name="ECORCODEBUREAU" , length=3 , nullable=false)
    private java.lang.String ecorCodeBureau;
	@Column(name="ECORNUMERO" , length=3 , nullable=false)
    private java.lang.Integer ecorNumero;
	@Column(name="ECORNUMART", nullable=false)
	private java.lang.Integer ecorNumArt;
	/**
	 * 
	 */
	public ArticleEcorKey() {
		super();
		// TODO Auto-generated constructor stub
	}
	/**
	 * @param ecorAnnee
	 * @param ecorCodeBureau
	 * @param ecorNumero
	 * @param ecorNumArt
	 */
	public ArticleEcorKey(String ecorAnnee, String ecorCodeBureau,
			Integer ecorNumero, Integer ecorNumArt) {
		super();
		this.ecorAnnee = ecorAnnee;
		this.ecorCodeBureau = ecorCodeBureau;
		this.ecorNumero = ecorNumero;
		this.ecorNumArt = ecorNumArt;
	}
	/**
	 * @return the ecorAnnee
	 */
	public java.lang.String getEcorAnnee() {
		return ecorAnnee;
	}
	/**
	 * @param ecorAnnee the ecorAnnee to set
	 */
	public void setEcorAnnee(java.lang.String ecorAnnee) {
		this.ecorAnnee = ecorAnnee;
	}
	/**
	 * @return the ecorCodeBureau
	 */
	public java.lang.String getEcorCodeBureau() {
		return ecorCodeBureau;
	}
	/**
	 * @param ecorCodeBureau the ecorCodeBureau to set
	 */
	public void setEcorCodeBureau(java.lang.String ecorCodeBureau) {
		this.ecorCodeBureau = ecorCodeBureau;
	}
	/**
	 * @return the ecorNumero
	 */
	public java.lang.Integer getEcorNumero() {
		return ecorNumero;
	}
	/**
	 * @param ecorNumero the ecorNumero to set
	 */
	public void setEcorNumero(java.lang.Integer ecorNumero) {
		this.ecorNumero = ecorNumero;
	}
	/**
	 * @return the ecorNumArt
	 */
	public java.lang.Integer getEcorNumArt() {
		return ecorNumArt;
	}
	/**
	 * @param ecorNumArt the ecorNumArt to set
	 */
	public void setEcorNumArt(java.lang.Integer ecorNumArt) {
		this.ecorNumArt = ecorNumArt;
	}
	
	

}
