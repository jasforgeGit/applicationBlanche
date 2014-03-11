/**
 * CGPID
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
import javax.persistence.Table;
import javax.persistence.Transient;

import sn.com.douane.ejb.manifeste.model.keys.BrouillonConteneurartKey;
import sn.com.douane.ejb.rc.model.entities.TypeConteneur;

/**
 * @author CGPID
 *
 */
@Entity
@IdClass(BrouillonConteneurartKey.class)

@Table(name="BROUILLONCONTENEURART")
public class BrouillonConteneurArt implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 4526127681707095235L;

	@Id
	@Column(name="MANIFCODECONSIGNATAIRE", length=3, nullable=false)
	private java.lang.String manifCodeConsignataire;
	
	@Id
	@Column(name="MANIFNUMCONTENEUR", length=11, nullable=false)
    private java.lang.String manifNumConteneur;
	
	@Id
	@Column(name="MANIFANNEEENREGMANIF", length=4, nullable=false)
    private java.lang.String manifAnneeEnreg;
    
	@Id
	@Column(name="MANIFNUMREPERTOIRE", length=6, nullable=false)
    private java.lang.String manifNumRepertoire;
    
	@Id
	@Column(name="MANIFCODELIEUEMBARQ", length=5, nullable=false)
    private java.lang.String manifCodeLieuEmbarq;
    
	@Id
	@Column(name="MANIFNUMARTMANIFESTE", nullable=false)
    private java.lang.Integer manifNumArt;
    
	@Id
	@Column(name="MANIFPRECISARTBROUMANIF", nullable=false)
    private java.lang.Integer manifPrecArtManif;
    
	@Column(name="MANIFNUMAPUREMENT")
    private java.lang.Integer manifNumApurement;
    
	@Column(name="MANIFCODETYPECONTENEUR", length=4)
    private java.lang.String manifCodeTypeConteneur;
    
	@Column(name="MANIFTAILLECONTENEUR", length=8)
    private java.lang.String manifTailleConteneur;
    
	@Column(name="MANIFNUMPLOMBCONT", length=8)
    private java.lang.String manifNumPlombCont;
    
	@Column(name="MANIFNUMCHASSISCONT", length=17)
    private java.lang.String manifNumChassisCont;
    
    
	@ManyToOne(targetEntity = BrouillonSegArt.class)
	@JoinColumns( value = {
	  @JoinColumn(name="MANIFCODECONSIGNATAIRE", referencedColumnName="MANIFCODECONSIG", insertable=false, updatable=false), 
	  @JoinColumn(name="MANIFANNEEENREGMANIF", referencedColumnName="MANIFANNEEENREG", insertable=false, updatable=false),
	  @JoinColumn(name="MANIFNUMREPERTOIRE", referencedColumnName="MANIFNUMREP", insertable=false, updatable=false),
	  @JoinColumn(name="MANIFNUMARTMANIFESTE", referencedColumnName="MANIFNUMART", insertable=false, updatable=false), 
	  @JoinColumn(name="MANIFCODELIEUEMBARQ", referencedColumnName="MANIFCODELIEUEMBARQ", insertable=false, updatable=false),
	  @JoinColumn(name="MANIFPRECISARTBROUMANIF", referencedColumnName="MANIFPRECARTMANIF", insertable=false, updatable=false)
      })
      
    private BrouillonSegArt brouillonSegArt;
	
	@ManyToOne(targetEntity = TypeConteneur.class)
	@JoinColumn(name = "MANIFCODETYPECONTENEUR", insertable = false, updatable = false)
	private TypeConteneur typeContenur;
	
	
	@Transient
	private String maniflibtypeconteneur;

	/**
	 * 
	 */
	public BrouillonConteneurArt() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * 
	 * @param manifCodeConsignataire
	 * @param manifNumConteneur
	 * @param manifAnneeEnreg
	 * @param manifNumRepertoire
	 * @param manifCodeLieuEmbarq
	 * @param manifNumArt
	 * @param manifPrecArtManif
	 */
	public BrouillonConteneurArt(String manifCodeConsignataire,
			String manifNumConteneur, String manifAnneeEnreg,
			String manifNumRepertoire, String manifCodeLieuEmbarq,
			Integer manifNumArt, Integer manifPrecArtManif) {
		super();
		this.manifCodeConsignataire = manifCodeConsignataire;
		this.manifNumConteneur = manifNumConteneur;
		this.manifAnneeEnreg = manifAnneeEnreg;
		this.manifNumRepertoire = manifNumRepertoire;
		this.manifCodeLieuEmbarq = manifCodeLieuEmbarq;
		this.manifNumArt = manifNumArt;
		this.manifPrecArtManif = manifPrecArtManif;
	}


	/**
	 * @return the manifCodeConsignataire
	 */
	public java.lang.String getManifCodeConsignataire() {
		return manifCodeConsignataire;
	}

	/**
	 * @param manifCodeConsignataire the manifCodeConsignataire to set
	 */
	public void setManifCodeConsignataire(java.lang.String manifCodeConsignataire) {
		this.manifCodeConsignataire = manifCodeConsignataire;
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
	 * @return the manifCodeTypeConteneur
	 */
	public java.lang.String getManifCodeTypeConteneur() {
		return manifCodeTypeConteneur;
	}

	/**
	 * @param manifCodeTypeConteneur the manifCodeTypeConteneur to set
	 */
	public void setManifCodeTypeConteneur(java.lang.String manifCodeTypeConteneur) {
		this.manifCodeTypeConteneur = manifCodeTypeConteneur;
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
	 * @return the manifNumPlombCont
	 */
	public java.lang.String getManifNumPlombCont() {
		return manifNumPlombCont;
	}

	/**
	 * @param manifNumPlombCont the manifNumPlombCont to set
	 */
	public void setManifNumPlombCont(java.lang.String manifNumPlombCont) {
		this.manifNumPlombCont = manifNumPlombCont;
	}

	/**
	 * @return the manifNumChassisCont
	 */
	public java.lang.String getManifNumChassisCont() {
		return manifNumChassisCont;
	}

	/**
	 * @param manifNumChassisCont the manifNumChassisCont to set
	 */
	public void setManifNumChassisCont(java.lang.String manifNumChassisCont) {
		this.manifNumChassisCont = manifNumChassisCont;
	}

	/**
	 * @return the manifAnneeEnreg
	 */
	public java.lang.String getManifAnneeEnreg() {
		return manifAnneeEnreg;
	}

	/**
	 * @param manifAnneeEnreg the manifAnneeEnreg to set
	 */
	public void setManifAnneeEnreg(java.lang.String manifAnneeEnreg) {
		this.manifAnneeEnreg = manifAnneeEnreg;
	}

	/**
	 * @return the manifNumRepertoire
	 */
	public java.lang.String getManifNumRepertoire() {
		return manifNumRepertoire;
	}

	/**
	 * @param manifNumRepertoire the manifNumRepertoire to set
	 */
	public void setManifNumRepertoire(java.lang.String manifNumRepertoire) {
		this.manifNumRepertoire = manifNumRepertoire;
	}

	/**
	 * @return the manifCodeLieuEmbarq
	 */
	public java.lang.String getManifCodeLieuEmbarq() {
		return manifCodeLieuEmbarq;
	}

	/**
	 * @param manifCodeLieuEmbarq the manifCodeLieuEmbarq to set
	 */
	public void setManifCodeLieuEmbarq(java.lang.String manifCodeLieuEmbarq) {
		this.manifCodeLieuEmbarq = manifCodeLieuEmbarq;
	}

	/**
	 * @return the manifNumArt
	 */
	public java.lang.Integer getManifNumArt() {
		return manifNumArt;
	}

	/**
	 * @param manifNumArt the manifNumArt to set
	 */
	public void setManifNumArt(java.lang.Integer manifNumArt) {
		this.manifNumArt = manifNumArt;
	}

	/**
	 * @return the manifPrecArtManif
	 */
	public java.lang.Integer getManifPrecArtManif() {
		return manifPrecArtManif;
	}

	/**
	 * @param manifPrecArtManif the manifPrecArtManif to set
	 */
	public void setManifPrecArtManif(java.lang.Integer manifPrecArtManif) {
		this.manifPrecArtManif = manifPrecArtManif;
	}

	/**
	 * @return the brouillonSegArt
	 */
	public BrouillonSegArt getBrouillonSegArt() {
		return brouillonSegArt;
	}

	/**
	 * @param brouillonSegArt the brouillonSegArt to set
	 */
	public void setBrouillonSegArt(BrouillonSegArt brouillonSegArt) {
		this.brouillonSegArt = brouillonSegArt;
	}
    
	
	public String getManiflibtypeconteneur() {
		return maniflibtypeconteneur;
	}
	
	public void setManiflibtypeconteneur(String maniflibtypeconteneur) {
		this.maniflibtypeconteneur = maniflibtypeconteneur;
	}

	public TypeConteneur getTypeContenur() {
		return typeContenur;
	}

	public void setTypeContenur(TypeConteneur typeContenur) {
		this.typeContenur = typeContenur;
	}

}
