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
public class ProduitArticleEcorKey implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -118014261924559237L;
	@Column(name="ECORCODEPRODUIT", length = 6, nullable=false)
	private java.lang.String ecorCodeProduit;
	@Column(name="ECORPRECUEMOA", length = 2, nullable=false)
    private java.lang.String ecorPrecUemoa;
	@Column(name="ECORPRECSENEGAL", length = 2, nullable=false)
    private java.lang.String ecorPrecSenegal;
    @Column(name="ECORNUMART", nullable=false)
    private java.lang.Integer ecorNumArt;
    @Column(name="ECORANNEE", length = 4, nullable=false)
    private java.lang.String ecorAnnee;
    @Column(name="ECORCODEBUREAU", length = 3, nullable=false)
    private java.lang.String ecorCodeBureau;
    @Column(name="ECORNUMERO", nullable=false)
    private java.lang.Integer ecorNumero;
	/**
	 * 
	 */
	public ProduitArticleEcorKey() {
		super();
		// TODO Auto-generated constructor stub
	}
	/**
	 * @param ecorCodeProduit
	 * @param ecorPrecUemoa
	 * @param ecorPrecSenegal
	 * @param ecorNumArt
	 * @param ecorAnnee
	 * @param ecorCodeBureau
	 * @param ecorNumero
	 */
	public ProduitArticleEcorKey(String ecorCodeProduit, String ecorPrecUemoa,
			String ecorPrecSenegal, Integer ecorNumArt, String ecorAnnee,
			String ecorCodeBureau, Integer ecorNumero) {
		super();
		this.ecorCodeProduit = ecorCodeProduit;
		this.ecorPrecUemoa = ecorPrecUemoa;
		this.ecorPrecSenegal = ecorPrecSenegal;
		this.ecorNumArt = ecorNumArt;
		this.ecorAnnee = ecorAnnee;
		this.ecorCodeBureau = ecorCodeBureau;
		this.ecorNumero = ecorNumero;
	}
	/**
	 * @return the ecorCodeProduit
	 */
	public java.lang.String getEcorCodeProduit() {
		return ecorCodeProduit;
	}
	/**
	 * @param ecorCodeProduit the ecorCodeProduit to set
	 */
	public void setEcorCodeProduit(java.lang.String ecorCodeProduit) {
		this.ecorCodeProduit = ecorCodeProduit;
	}
	/**
	 * @return the ecorPrecUemoa
	 */
	public java.lang.String getEcorPrecUemoa() {
		return ecorPrecUemoa;
	}
	/**
	 * @param ecorPrecUemoa the ecorPrecUemoa to set
	 */
	public void setEcorPrecUemoa(java.lang.String ecorPrecUemoa) {
		this.ecorPrecUemoa = ecorPrecUemoa;
	}
	/**
	 * @return the ecorPrecSenegal
	 */
	public java.lang.String getEcorPrecSenegal() {
		return ecorPrecSenegal;
	}
	/**
	 * @param ecorPrecSenegal the ecorPrecSenegal to set
	 */
	public void setEcorPrecSenegal(java.lang.String ecorPrecSenegal) {
		this.ecorPrecSenegal = ecorPrecSenegal;
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
    
    

}
