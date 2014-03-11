/**
 * 
 */
package sn.com.douane.ejb.declaration.model.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import sn.com.douane.ejb.declaration.model.keys.ArticleFicheDedouanementKey;

/**
 * @author moussakare
 *
 */
@Entity
@IdClass(ArticleFicheDedouanementKey.class)
@Table(name = "ARTICLEFICHEDEDOUANEMENT")
public class ArticleFicheDedouanement implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -6796004567433358242L;
	
	@Id
	@Column(name = "ECORANNEE", length = 4, nullable = false)
	private java.lang.String ecorAnnee;
	@Id
	@Column(name = "ECORCODEBUREAU", length = 3, nullable = false)
	private java.lang.String ecorCodeBureau;
	@Id
	@Column(name = "ECORNUMERO", nullable = false)
    private java.lang.Integer ecorNumero;
	@Id
	@Column(name = "ECORNUMART", nullable = false)
	private java.lang.Integer ecorNumArt;
	
	@Column(name = "ECORNBRECOLIS")
    private java.lang.Integer ecorNbreColis;
	@Column(name = "ECORVALEURDOUANE", columnDefinition = "DECIMAL(18,0)")
    private java.math.BigDecimal ecorValeurDouane;
	@Column(name = "ECORNATURE", length = 60)
    private java.lang.String ecorNature;
	@Column(name = "ECORCODEDEPOTPROV", length = 10)
    private java.lang.String ecorCodeDepotProv;
	@Column(name = "ECORCODEDEPOTDEF", length = 10)
    private java.lang.String ecorCodeDepotDef;
	
    @ManyToOne(targetEntity = FicheDedouanement.class)
    @JoinColumns(value = {
    		@JoinColumn(name="ECORANNEE", referencedColumnName ="ECORANNEE" , insertable = false, updatable = false),
    		@JoinColumn(name="ECORCODEBUREAU", referencedColumnName ="ECORCODEBUREAU" , insertable = false, updatable = false),
    		@JoinColumn(name="ECORNUMERO", referencedColumnName ="ECORNUMERO" , insertable = false, updatable = false)
    })
    private FicheDedouanement artFiche;
	/**
	 * 
	 */
	public ArticleFicheDedouanement() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	/**
	 * @param ecorAnnee
	 * @param ecorCodeBureau
	 * @param ecorNumero
	 * @param ecorNumArt
	 */
	public ArticleFicheDedouanement(String ecorAnnee, String ecorCodeBureau,
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
	/**
	 * @return the ecorNbreColis
	 */
	public java.lang.Integer getEcorNbreColis() {
		return ecorNbreColis;
	}
	/**
	 * @param ecorNbreColis the ecorNbreColis to set
	 */
	public void setEcorNbreColis(java.lang.Integer ecorNbreColis) {
		this.ecorNbreColis = ecorNbreColis;
	}
	/**
	 * @return the ecorValeurDouane
	 */
	public java.math.BigDecimal getEcorValeurDouane() {
		return ecorValeurDouane;
	}
	/**
	 * @param ecorValeurDouane the ecorValeurDouane to set
	 */
	public void setEcorValeurDouane(java.math.BigDecimal ecorValeurDouane) {
		this.ecorValeurDouane = ecorValeurDouane;
	}
	/**
	 * @return the ecorNature
	 */
	public java.lang.String getEcorNature() {
		return ecorNature;
	}
	/**
	 * @param ecorNature the ecorNature to set
	 */
	public void setEcorNature(java.lang.String ecorNature) {
		this.ecorNature = ecorNature;
	}
	/**
	 * @return the ecorCodeDepotProv
	 */
	public java.lang.String getEcorCodeDepotProv() {
		return ecorCodeDepotProv;
	}
	/**
	 * @param ecorCodeDepotProv the ecorCodeDepotProv to set
	 */
	public void setEcorCodeDepotProv(java.lang.String ecorCodeDepotProv) {
		this.ecorCodeDepotProv = ecorCodeDepotProv;
	}
	/**
	 * @return the ecorCodeDepotDef
	 */
	public java.lang.String getEcorCodeDepotDef() {
		return ecorCodeDepotDef;
	}
	/**
	 * @param ecorCodeDepotDef the ecorCodeDepotDef to set
	 */
	public void setEcorCodeDepotDef(java.lang.String ecorCodeDepotDef) {
		this.ecorCodeDepotDef = ecorCodeDepotDef;
	}
	/**
	 * @return the artFiche
	 */
	public FicheDedouanement getArtFiche() {
		return artFiche;
	}
	/**
	 * @param artFiche the artFiche to set
	 */
	public void setArtFiche(FicheDedouanement artFiche) {
		this.artFiche = artFiche;
	}
    
}
