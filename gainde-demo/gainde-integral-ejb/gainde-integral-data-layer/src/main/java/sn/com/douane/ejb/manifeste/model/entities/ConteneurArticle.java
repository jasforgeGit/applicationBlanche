/**
 * moussakare
 */
package sn.com.douane.ejb.manifeste.model.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Transient;

import sn.com.douane.ejb.demat.model.entities.DeclarationExt;
import sn.com.douane.ejb.manifeste.model.keys.ConteneurArticleKey;
import sn.com.douane.ejb.rc.model.entities.TypeConteneur;



/**
 * @author moussakare
 *
 */

@Entity
@IdClass(ConteneurArticleKey.class)
@NamedQueries({
	@NamedQuery(name = "findKeyByArticle", 
			query = "select object(o) from ConteneurArticle o where o.manifBureauEngManif = ?1 " +
					"and  o.manifAnneeEngManif = ?2 and  o.manifNumEnregManif = ?3 and  o.manifNumArticleManif = ?4 " +
					"and  o.manifPrecisArtManif = ?5 and  o.manifPrecisArtManif2 = ?6 and  o.manifNumConteneurs = ?7"), 
	@NamedQuery(name = "findVectorByArticle", 
			query = "select object(o) from ConteneurArticle o where o.manifBureauEngManif = ?1 " +
					"and  o.manifAnneeEngManif = ?2 and  o.manifNumEnregManif = ?3 and  o.manifNumArticleManif = ?4 " +
					"and  o.manifPrecisArtManif = ?5 and  o.manifPrecisArtManif2 = ?6")
	})
@Table(name="CONTENEURARTICLE")

public class ConteneurArticle implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 3778607185113083394L;
	
	@Id
	@Column(name="MANIFBUREAUENGMANIF", length=3, nullable=false)
	private java.lang.String manifBureauEngManif;
	
	@Id
	@Column(name="MANIFANNEEENGMANIF", length=4, nullable=false)
	private java.lang.String manifAnneeEngManif;
	
	@Id
	@Column(name="MANIFNUMENREGMANIF", nullable=false)
	private java.lang.Integer manifNumEnregManif;
	
	@Id
	@Column(name="MANIFNUMARTICLEMANIF", nullable=false)
	private java.lang.Integer manifNumArticleManif;
	
	@Id
	@Column(name="MANIFPRECISARTMANIF", nullable=false)
	private java.lang.Integer manifPrecisArtManif;
	
	@Id
	@Column(name="MANIFPRECIS2ARTMANIF", nullable=false)
	private java.lang.Integer manifPrecisArtManif2;

	@Id
	@Column(name="MANIFNUMCONTENEURS", length=11, nullable=false)
	private java.lang.String manifNumConteneurs;
	
	@Column(name="MANIFNUMAPUREMENT")
	private java.lang.Integer manifNumApurement;
	
	@Column(name="MANIFNUMPLOMB", length=8)
	private java.lang.String manifNumPlomb;
	
	@Column(name="MANIFTYPECONTENEUR", length=4)
	private java.lang.String manifTypeConteneur;
	
	@Column(name="MANIFTAILLECONTENEUR", length=8)
	private java.lang.String manifTailleConteneur;
	
	@Column(name="MANIFINDCONTENEUR", length=15)
	private java.lang.String manifIndConteneur;
	
	@Column(name="MANIFCHASSIS", length=17)
	private java.lang.String manifChassis;
	
	@Column(name="IDDECLTRANSFERT")
	private Long idDeclTransfert;
	
	 @ManyToOne(targetEntity = DeclarationExt.class)
	 @JoinColumn(name="IDDECLTRANSFERT", referencedColumnName="IDDECLTRANSFERT", insertable=false, updatable=false) 
	 private DeclarationExt declarationExt;	
	 
	 @ManyToOne(targetEntity = TypeConteneur.class)
	 @JoinColumn(name="MANIFTYPECONTENEUR", referencedColumnName="RCCODETYPECONT", insertable=false, updatable=false) 
	 private TypeConteneur typeConteneur;	 
	
	
	 @ManyToOne(targetEntity = ArticleManifeste.class)
	    @JoinColumns( {
	      @JoinColumn(name="MANIFBUREAUENGMANIF", referencedColumnName="MANIFBUREAUENGMANIF", insertable=false, updatable=false), 
	  	  @JoinColumn(name="MANIFANNEEENGMANIF", referencedColumnName="MANIFANNEEENGMANIF", insertable=false, updatable=false),
	  	  @JoinColumn(name="MANIFNUMENREGMANIF", referencedColumnName="MANIFNUMENREGMANIF", insertable=false, updatable=false),
	  	  @JoinColumn(name="MANIFNUMARTICLEMANIF", referencedColumnName="MANIFNUMARTICLEMANIF", insertable=false, updatable=false),
	  	  @JoinColumn(name="MANIFPRECISARTMANIF", referencedColumnName="MANIFPRECISARTMANIF", insertable=false, updatable=false),
	  	  @JoinColumn(name="MANIFPRECIS2ARTMANIF", referencedColumnName="MANIFPRECISARTMANIF2", insertable=false, updatable=false)
	  	 })
	   private ArticleManifeste articleManifeste;
	 
	 @Transient
	 private String manifLibTypeConteneur;

	/**
	 * 
	 */
	public ConteneurArticle() {
	}

	public ConteneurArticle(String manifNumConteneurs,
			Integer manifNumApurement, String manifNumPlomb,
			String manifTypeConteneur, String manifTailleConteneur,
			String manifIndConteneur, String manifChassis,
			String manifBureauEngManif, String manifAnneeEngManif,
			Integer manifNumEnregManif, Integer manifNumArticleManif,
			Integer manifPrecisArtManif, Integer manifPrecisArtManif2
			
			)
			{
		super();
		this.manifNumConteneurs = manifNumConteneurs;
		this.manifNumApurement = manifNumApurement;
		this.manifNumPlomb = manifNumPlomb;
		this.manifTypeConteneur = manifTypeConteneur;
		this.manifTailleConteneur = manifTailleConteneur;
		this.manifIndConteneur = manifIndConteneur;
		this.manifChassis = manifChassis;
		this.manifBureauEngManif = manifBureauEngManif;
		this.manifAnneeEngManif = manifAnneeEngManif;
		this.manifNumEnregManif = manifNumEnregManif;
		this.manifNumArticleManif = manifNumArticleManif;
		this.manifPrecisArtManif = manifPrecisArtManif;
		this.manifPrecisArtManif2 = manifPrecisArtManif2;
	
	}

	/**
	 * @return the manifNumConteneurs
	 */
	public java.lang.String getManifNumConteneurs() {
		return manifNumConteneurs;
	}

	/**
	 * @param manifNumConteneurs the manifNumConteneurs to set
	 */
	public void setManifNumConteneurs(java.lang.String manifNumConteneurs) {
		this.manifNumConteneurs = manifNumConteneurs;
	}

	/**
	 * @return the manifNumApurement
	 */
	public java.lang.Integer getManifNumApurement() {
		return manifNumApurement;
	}

	/**
	 * @param manifNumApurement the manifNumApurement to set
	 */
	public void setManifNumApurement(java.lang.Integer manifNumApurement) {
		this.manifNumApurement = manifNumApurement;
	}

	/**
	 * @return the manifNumPlomb
	 */
	public java.lang.String getManifNumPlomb() {
		return manifNumPlomb;
	}

	/**
	 * @param manifNumPlomb the manifNumPlomb to set
	 */
	public void setManifNumPlomb(java.lang.String manifNumPlomb) {
		this.manifNumPlomb = manifNumPlomb;
	}

	/**
	 * @return the manifTypeConteneur
	 */
	public java.lang.String getManifTypeConteneur() {
		return manifTypeConteneur;
	}

	/**
	 * @param manifTypeConteneur the manifTypeConteneur to set
	 */
	public void setManifTypeConteneur(java.lang.String manifTypeConteneur) {
		this.manifTypeConteneur = manifTypeConteneur;
	}

	/**
	 * @return the manifTailleConteneur
	 */
	public java.lang.String getManifTailleConteneur() {
		return manifTailleConteneur;
	}

	/**
	 * @param manifTailleConteneur the manifTailleConteneur to set
	 */
	public void setManifTailleConteneur(java.lang.String manifTailleConteneur) {
		this.manifTailleConteneur = manifTailleConteneur;
	}

	/**
	 * @return the manifIndConteneur
	 */
	public java.lang.String getManifIndConteneur() {
		return manifIndConteneur;
	}

	/**
	 * @param manifIndConteneur the manifIndConteneur to set
	 */
	public void setManifIndConteneur(java.lang.String manifIndConteneur) {
		this.manifIndConteneur = manifIndConteneur;
	}

	/**
	 * @return the manifChassis
	 */
	public java.lang.String getManifChassis() {
		return manifChassis;
	}

	/**
	 * @param manifChassis the manifChassis to set
	 */
	public void setManifChassis(java.lang.String manifChassis) {
		this.manifChassis = manifChassis;
	}

	/**
	 * @return the manifBureauEngManif
	 */
	public java.lang.String getManifBureauEngManif() {
		return manifBureauEngManif;
	}

	/**
	 * @param manifBureauEngManif the manifBureauEngManif to set
	 */
	public void setManifBureauEngManif(java.lang.String manifBureauEngManif) {
		this.manifBureauEngManif = manifBureauEngManif;
	}

	/**
	 * @return the manifAnneeEngManif
	 */
	public java.lang.String getManifAnneeEngManif() {
		return manifAnneeEngManif;
	}

	/**
	 * @param manifAnneeEngManif the manifAnneeEngManif to set
	 */
	public void setManifAnneeEngManif(java.lang.String manifAnneeEngManif) {
		this.manifAnneeEngManif = manifAnneeEngManif;
	}

	/**
	 * @return the manifNumEnregManif
	 */
	public java.lang.Integer getManifNumEnregManif() {
		return manifNumEnregManif;
	}

	/**
	 * @param manifNumEnregManif the manifNumEnregManif to set
	 */
	public void setManifNumEnregManif(java.lang.Integer manifNumEnregManif) {
		this.manifNumEnregManif = manifNumEnregManif;
	}

	/**
	 * @return the manifNumArticleManif
	 */
	public java.lang.Integer getManifNumArticleManif() {
		return manifNumArticleManif;
	}

	/**
	 * @param manifNumArticleManif the manifNumArticleManif to set
	 */
	public void setManifNumArticleManif(java.lang.Integer manifNumArticleManif) {
		this.manifNumArticleManif = manifNumArticleManif;
	}

	/**
	 * @return the manifPrecisArtManif
	 */
	public java.lang.Integer getManifPrecisArtManif() {
		return manifPrecisArtManif;
	}

	/**
	 * @param manifPrecisArtManif the manifPrecisArtManif to set
	 */
	public void setManifPrecisArtManif(java.lang.Integer manifPrecisArtManif) {
		this.manifPrecisArtManif = manifPrecisArtManif;
	}

	/**
	 * @return the manifPrecisArtManif2
	 */
	public java.lang.Integer getManifPrecisArtManif2() {
		return manifPrecisArtManif2;
	}

	/**
	 * @param manifPrecisArtManif2 the manifPrecisArtManif2 to set
	 */
	public void setManifPrecisArtManif2(java.lang.Integer manifPrecisArtManif2) {
		this.manifPrecisArtManif2 = manifPrecisArtManif2;
	}

	/**
	 * @return the articleManifeste
	 */
	public ArticleManifeste getArticleManifeste() {
		return articleManifeste;
	}

	/**
	 * @param articleManifeste the articleManifeste to set
	 */
	public void setArticleManifeste(ArticleManifeste articleManifeste) {
		this.articleManifeste = articleManifeste;
	}

	public String getManifLibTypeConteneur() {
		return manifLibTypeConteneur;
	}

	public void setManifLibTypeConteneur(String manifLibTypeConteneur) {
		this.manifLibTypeConteneur = manifLibTypeConteneur;
	}

	public Long getIdDeclTransfert() {
		return idDeclTransfert;
	}

	public void setIdDeclTransfert(Long idDeclTransfert) {
		this.idDeclTransfert = idDeclTransfert;
	}

	public DeclarationExt getDeclarationExt() {
		return declarationExt;
	}

	public void setDeclarationExt(DeclarationExt declarationExt) {
		this.declarationExt = declarationExt;
	}

	public TypeConteneur getTypeConteneur() {
		return typeConteneur;
	}

	public void setTypeConteneur(TypeConteneur typeConteneur) {
		this.typeConteneur = typeConteneur;
	}

	

}
