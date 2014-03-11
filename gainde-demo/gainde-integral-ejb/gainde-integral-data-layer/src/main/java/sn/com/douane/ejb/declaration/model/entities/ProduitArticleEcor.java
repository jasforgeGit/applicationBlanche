/**
 * 
 */
package sn.com.douane.ejb.declaration.model.entities;

import java.io.Serializable;
import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import sn.com.douane.ejb.declaration.model.keys.ProduitArticleEcorKey;

/**
 * @author moussakare
 *
 */
@Entity
@IdClass(ProduitArticleEcorKey.class)
@Table(name = "PRODUITARTICLEECOR")
public class ProduitArticleEcor implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -6020875789779702074L;
	@Id @Column(name="ECORCODEPRODUIT", length = 6, nullable=false)
	private java.lang.String ecorCodeProduit;
	@Id @Column(name="ECORPRECUEMOA", length = 2, nullable=false)
    private java.lang.String ecorPrecUemoa;
	@Id @Column(name="ECORPRECSENEGAL", length = 2, nullable=false)
    private java.lang.String ecorPrecSenegal;
    @Id @Column(name="ECORNUMART", nullable=false)
    private java.lang.Integer ecorNumArt;
    @Id @Column(name="ECORANNEE", length = 4, nullable=false)
    private java.lang.String ecorAnnee;
    @Id @Column(name="ECORCODEBUREAU", length = 3, nullable=false)
    private java.lang.String ecorCodeBureau;
    @Id @Column(name="ECORNUMERO", nullable=false)
    private java.lang.Integer ecorNumero;
    @Column(name="ECORVALEURPROD", columnDefinition = "DECIMAL(18 ,0)", nullable=false)
    private java.math.BigDecimal ecorValeurProd;
    @Column(name="ECORNBREUNITE")
    private java.lang.Integer ecorNbreUnite;
    @ManyToOne(targetEntity = ArticleEcor.class)
	@JoinColumns({
		@JoinColumn(name = "ECORANNEE", referencedColumnName = "ECORANNEE", insertable = false, updatable = false, nullable = false),
		@JoinColumn(name = "ECORCODEBUREAU", referencedColumnName = "ECORCODEBUREAU", insertable = false, updatable = false, nullable = false),
		@JoinColumn(name = "ECORNUMERO", referencedColumnName = "ECORNUMERO", insertable = false, updatable = false, nullable = false),
		@JoinColumn(name = "ECORNUMART", referencedColumnName = "ECORNUMART", insertable = false, updatable = false, nullable = false)
	})
    private ArticleEcor articleEcor;
	/**
	 * 
	 */
	public ProduitArticleEcor() {
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
	 * @param ecorValeurProd
	 */
	public ProduitArticleEcor(String ecorCodeProduit, String ecorPrecUemoa,
			String ecorPrecSenegal, Integer ecorNumArt, String ecorAnnee,
			String ecorCodeBureau, Integer ecorNumero, BigDecimal ecorValeurProd) {
		super();
		this.ecorCodeProduit = ecorCodeProduit;
		this.ecorPrecUemoa = ecorPrecUemoa;
		this.ecorPrecSenegal = ecorPrecSenegal;
		this.ecorNumArt = ecorNumArt;
		this.ecorAnnee = ecorAnnee;
		this.ecorCodeBureau = ecorCodeBureau;
		this.ecorNumero = ecorNumero;
		this.ecorValeurProd = ecorValeurProd;
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
	/**
	 * @return the ecorValeurProd
	 */
	public java.math.BigDecimal getEcorValeurProd() {
		return ecorValeurProd;
	}
	/**
	 * @param ecorValeurProd the ecorValeurProd to set
	 */
	public void setEcorValeurProd(java.math.BigDecimal ecorValeurProd) {
		this.ecorValeurProd = ecorValeurProd;
	}
	/**
	 * @return the ecorNbreUnite
	 */
	public java.lang.Integer getEcorNbreUnite() {
		return ecorNbreUnite;
	}
	/**
	 * @param ecorNbreUnite the ecorNbreUnite to set
	 */
	public void setEcorNbreUnite(java.lang.Integer ecorNbreUnite) {
		this.ecorNbreUnite = ecorNbreUnite;
	}
	/**
	 * @return the articleEcor
	 */
	public ArticleEcor getArticleEcor() {
		return articleEcor;
	}
	/**
	 * @param articleEcor the articleEcor to set
	 */
	public void setArticleEcor(ArticleEcor articleEcor) {
		this.articleEcor = articleEcor;
	}
	    

}
