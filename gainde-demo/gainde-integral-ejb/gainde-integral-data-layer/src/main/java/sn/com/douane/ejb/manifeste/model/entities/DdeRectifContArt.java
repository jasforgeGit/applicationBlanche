/**
 * moussakare
 */
package sn.com.douane.ejb.manifeste.model.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

import sn.com.douane.ejb.manifeste.model.keys.DdeRectifContArtKey;



/**
 * @author moussakare
 *
 */

@Entity
@IdClass(DdeRectifContArtKey.class)
@NamedQueries({
	@NamedQuery(name = "DdeRectifContArt.findByArticle", 
			query = "select object(o) from DdeRectifContArt o where o.manifBurEnregManif = ?1 and  o.manifAnneeEngManif = ?2 " +
					"and  o.manifNumEnregManif = ?3 and  o.manifNumArticleManif = ?4 and  o.manifPrecisArtManif = ?5 " +
					"and  o.manifPrecisArtManif2 = ?6")
})

@Table(name="DDERECTIFCONTART")

public class DdeRectifContArt implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -5111272003190686772L;

	@Id
	@Column(name="MANIFBURENREGMANIF", length=3, nullable=false)
	private java.lang.String manifBurEnregManif;
	
	@Id
	@Column(name="MANIFNUMCONTENEUR", length=11, nullable=false)
    private java.lang.String manifNumConteneur;
	
	@Column(name="MANIFNUMPLOMB", length=8)
    private java.lang.String manifNumPlomb;
	
	@Column(name="MANIFCODETYPECONT", length=4)
    private java.lang.String manifCodeTypeCont;
	
	@Column(name="MANIFTAILLECONT", length=8)
    private java.lang.String manifTailleCont;
	
	@Column(name="MANIFINDCONTENEUR", length=15)
    private java.lang.String manifIndConteneur;
	
	@Column(name="MANIFNUMAPUREMENT")
    private java.lang.Integer manifNumApurement;
	
	@Column(name="MANIFCHASSIS", length=17)
    private java.lang.String manifChassis;
    
    @Id
	@Column(name="MANIFANNEEENREGMANIF", length=4, nullable=false)
    private java.lang.String manifAnneeEngManif;
    
    @Id
	@Column(name="MANIFNUMENREGMANIF", nullable=false)
    private java.lang.Integer manifNumEnregManif;
    
    @Id
	@Column(name="MANIFNUMARTICLEMANIF", nullable=false)
    private java.lang.Integer manifNumArticleManif;
    
    @Id
	@Column(name="MANIFPRECARTMANIF", nullable=false)
    private java.lang.Integer manifPrecisArtManif;
    
    @Id
	@Column(name="MANIFPRECARTMANIF2", nullable=false)
    private java.lang.Integer manifPrecisArtManif2;
    
    @ManyToOne(targetEntity = DdeRectifArtMan.class,fetch = FetchType.LAZY)
    @JoinColumns(value = { 
			@JoinColumn(name="MANIFBURENREGMANIF", referencedColumnName ="MANIFBURMANIF" , insertable = false, updatable = false),
			@JoinColumn(name="MANIFANNEEENREGMANIF", referencedColumnName ="MANIFANNEEENREG" , insertable = false, updatable = false),
			@JoinColumn(name="MANIFNUMENREGMANIF", referencedColumnName ="MANIFNUMENREGMANIF" , insertable = false, updatable = false),	
			@JoinColumn(name="MANIFNUMARTICLEMANIF", referencedColumnName ="MANIFNUMARTMANIF" , insertable = false, updatable = false),
			@JoinColumn(name="MANIFPRECARTMANIF", referencedColumnName ="MANIFPRECISARTMANIF" , insertable = false, updatable = false),
			@JoinColumn(name="MANIFPRECARTMANIF2", referencedColumnName ="MANIFPRECISARTMANIF2" , insertable = false, updatable = false)			
			})
    private DdeRectifArtMan ddeRectifArtMan;

	/**
	 * 
	 */
	public DdeRectifContArt() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param manifBureauEngManif
	 * @param manifNumConteneur
	 * @param manifNumPlomb
	 * @param manifCodeTypeCont
	 * @param manifTailleCont
	 * @param manifIndConteneur
	 * @param manifNumApurement
	 * @param manifChassis
	 * @param manifAnneeEngManif
	 * @param manifNumEnregManif
	 * @param manifNumArticleManif
	 * @param manifPrecisArtManif
	 * @param manifPrecisArtManif2
	 * @param ddeRectifArtMan
	 */
	public DdeRectifContArt(String manifBureauEngManif,
			String manifNumConteneur, String manifNumPlomb,
			String manifCodeTypeCont, String manifTailleCont,
			String manifIndConteneur, Integer manifNumApurement,
			String manifChassis, String manifAnneeEngManif,
			Integer manifNumEnregManif, Integer manifNumArticleManif,
			Integer manifPrecisArtManif, Integer manifPrecisArtManif2,
			DdeRectifArtMan ddeRectifArtMan) {
		super();
		this.manifBurEnregManif = manifBureauEngManif;
		this.manifNumConteneur = manifNumConteneur;
		this.manifNumPlomb = manifNumPlomb;
		this.manifCodeTypeCont = manifCodeTypeCont;
		this.manifTailleCont = manifTailleCont;
		this.manifIndConteneur = manifIndConteneur;
		this.manifNumApurement = manifNumApurement;
		this.manifChassis = manifChassis;
		this.manifAnneeEngManif = manifAnneeEngManif;
		this.manifNumEnregManif = manifNumEnregManif;
		this.manifNumArticleManif = manifNumArticleManif;
		this.manifPrecisArtManif = manifPrecisArtManif;
		this.manifPrecisArtManif2 = manifPrecisArtManif2;
		this.ddeRectifArtMan = ddeRectifArtMan;
	}
	
	public DdeRectifContArt(String manifBureauEngManif,
			String manifNumConteneur, String manifAnneeEngManif,
			Integer manifNumEnregManif, Integer manifNumArticleManif,
			Integer manifPrecisArtManif, Integer manifPrecisArtManif2) {
		super();
		this.manifBurEnregManif = manifBureauEngManif;
		this.manifNumConteneur = manifNumConteneur;
		this.manifAnneeEngManif = manifAnneeEngManif;
		this.manifNumEnregManif = manifNumEnregManif;
		this.manifNumArticleManif = manifNumArticleManif;
		this.manifPrecisArtManif = manifPrecisArtManif;
		this.manifPrecisArtManif2 = manifPrecisArtManif2;
	}

	/**
	 * @return the manifBureauEngManif
	 */
	public java.lang.String getManifBurEnregManif() {
		return manifBurEnregManif;
	}

	/**
	 * @param manifBureauEngManif the manifBureauEngManif to set
	 */
	public void setManifBurEnregManif(java.lang.String manifBureauEngManif) {
		this.manifBurEnregManif = manifBureauEngManif;
	}

	/**
	 * @return the manifNumConteneur
	 */
	public java.lang.String getManifNumConteneur() {
		return manifNumConteneur;
	}

	/**
	 * @param manifNumConteneur the manifNumConteneur to set
	 */
	public void setManifNumConteneur(java.lang.String manifNumConteneur) {
		this.manifNumConteneur = manifNumConteneur;
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
	 * @return the manifCodeTypeCont
	 */
	public java.lang.String getManifCodeTypeCont() {
		return manifCodeTypeCont;
	}

	/**
	 * @param manifCodeTypeCont the manifCodeTypeCont to set
	 */
	public void setManifCodeTypeCont(java.lang.String manifCodeTypeCont) {
		this.manifCodeTypeCont = manifCodeTypeCont;
	}

	/**
	 * @return the manifTailleCont
	 */
	public java.lang.String getManifTailleCont() {
		return manifTailleCont;
	}

	/**
	 * @param manifTailleCont the manifTailleCont to set
	 */
	public void setManifTailleCont(java.lang.String manifTailleCont) {
		this.manifTailleCont = manifTailleCont;
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
	 * @return the ddeRectifArtMan
	 */
	public DdeRectifArtMan getDdeRectifArtMan() {
		return ddeRectifArtMan;
	}

	/**
	 * @param ddeRectifArtMan the ddeRectifArtMan to set
	 */
	public void setDdeRectifArtMan(DdeRectifArtMan ddeRectifArtMan) {
		this.ddeRectifArtMan = ddeRectifArtMan;
	}
    
    

}