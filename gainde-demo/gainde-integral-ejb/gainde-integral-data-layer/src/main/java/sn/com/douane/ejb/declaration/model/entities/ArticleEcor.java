/**
 * 
 */
package sn.com.douane.ejb.declaration.model.entities;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import sn.com.douane.ejb.declaration.model.keys.ArticleEcorKey;

/**
 * @author moussakare
 *
 */
@Entity
@IdClass(ArticleEcorKey.class)
@Table(name = "ARTICLEECOR")
public class ArticleEcor implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -4532989062057189142L;
	@Id
	@Column(name="ECORNUMART", nullable=false)
	private java.lang.Integer ecorNumArt;
	@Column(name="ECORNBRECOLIS")
    private java.lang.Integer ecorNbreColis;
	@Column(name="ECORVALEURDOUANE" , columnDefinition = "DECIMAL(18,0)")
    private java.math.BigDecimal ecorValeurDouane;
	@Column(name="ECORNATURE" , length=60)
    private java.lang.String ecorNature;
	@Column(name="ECORCODEDEPOTPROV" , length=10)
    private java.lang.String ecorCodeDepotProv;
	@Column(name="ECORCODEDEPOTDEF" , length=10)
    private java.lang.String ecorCodeDepotDef;
	@Id
	@Column(name="ECORANNEE" , length=4, nullable=false)
    private java.lang.String ecorAnnee;
	@Id
	@Column(name="ECORCODEBUREAU" , length=3 , nullable=false)
    private java.lang.String ecorCodeBureau;
	@Id
	@Column(name="ECORNUMERO" , length=3 , nullable=false)
    private java.lang.Integer ecorNumero;
	@ManyToOne(targetEntity = Ecor.class)
	@JoinColumns({
		@JoinColumn(name = "ECORANNEE", referencedColumnName = "ECORANNEE", insertable = false, updatable = false, nullable = false),
		@JoinColumn(name = "ECORCODEBUREAU", referencedColumnName = "ECORCODEBUREAU", insertable = false, updatable = false, nullable = false),
		@JoinColumn(name = "ECORNUMERO", referencedColumnName = "ECORNUMERO", insertable = false, updatable = false, nullable = false)
	})
    private Ecor articleEcor;
	@OneToMany(targetEntity = ProduitArticleEcor.class, mappedBy = "articleEcor")
    private List<ProduitArticleEcor> listeProduitArticleEcor;
	/**
	 * 
	 */
	public ArticleEcor() {
		super();
		// TODO Auto-generated constructor stub
	}
	/**
	 * @param ecorNumArt
	 * @param ecorAnnee
	 * @param ecorCodeBureau
	 * @param ecorNumero
	 */
	public ArticleEcor(Integer ecorNumArt, String ecorAnnee,
			String ecorCodeBureau, Integer ecorNumero) {
		super();
		this.ecorNumArt = ecorNumArt;
		this.ecorAnnee = ecorAnnee;
		this.ecorCodeBureau = ecorCodeBureau;
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
	 * @return the articleEcor
	 */
	public Ecor getArticleEcor() {
		return articleEcor;
	}
	/**
	 * @param articleEcor the articleEcor to set
	 */
	public void setArticleEcor(Ecor articleEcor) {
		this.articleEcor = articleEcor;
	}
	/**
	 * @return the listeProduitArticleEcor
	 */
	public List<ProduitArticleEcor> getListeProduitArticleEcor() {
		return listeProduitArticleEcor;
	}
	/**
	 * @param listeProduitArticleEcor the listeProduitArticleEcor to set
	 */
	public void setListeProduitArticleEcor(
			List<ProduitArticleEcor> listeProduitArticleEcor) {
		this.listeProduitArticleEcor = listeProduitArticleEcor;
	}
	
	


}
