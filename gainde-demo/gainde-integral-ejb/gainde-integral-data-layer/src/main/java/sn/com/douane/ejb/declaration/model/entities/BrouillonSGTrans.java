/**
 * 
 */
package sn.com.douane.ejb.declaration.model.entities;

import java.io.Serializable;
import java.sql.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import sn.com.douane.ejb.declaration.model.keys.BrouillonSGTransKey;

/**
 * @author moussakare
 *
 */
@Entity
@IdClass(BrouillonSGTransKey.class)
@Table(name = "BROUILLONSGTRANS")
public class BrouillonSGTrans implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -5544428473161412525L;
	@Id
	@Column(name = "DECANNEEENREGTRANS", length = 4, nullable = false)
	private java.lang.String decAnneeEnregTrans;
	@Id
	@Column(name = "DECPPMDECTRANS", length = 5, nullable = false)
    private java.lang.String decPpmDecTrans;
	@Id
	@Column(name = "DECREPDECTRANS", length = 6, nullable = false)
    private java.lang.String decRepDecTrans;
	@Column(name = "DECCODEAGREE", length = 3)
    private java.lang.String decCodeAgree;
	@Column(name = "DECANNEEENREGMANIF", length = 4)
    private java.lang.String decAnneeEnregManif;
	@Column(name = "DECBURENREGMANIF", length = 3)
	private java.lang.String decBurEnregManif;
	@Column(name = "DECNUMMANIF")
    private java.lang.Integer decNumManif;
	@Column(name = "DECPAYSPROV", length = 3, nullable = false)
    private java.lang.String decPaysProv;
	@Column(name = "DECMODETRANS", length = 1)
    private java.lang.String decModeTrans;
	@Column(name = "DECMOYENTRANS", length = 20)
    private java.lang.String decMoyenTrans;
	@Column(name = "DECPAYSDEST", length = 3, nullable = false)
    private java.lang.String decPaysDest;
	@Column(name = "DECDATECREATION", nullable = false)
    private java.sql.Date decDateCreation;
	@Column(name = "DECIDPPMDEST", length = 11)
    private java.lang.String decIdPpmDest;
	@Column(name = "DECNBREARTICLES")
    private java.lang.Integer decNbreArticles;
	
	@OneToMany(targetEntity = BrouillonArtTransb.class, mappedBy = "brSGArtTrans", fetch = FetchType.LAZY)
    private List<BrouillonArtTransb> brouillonArtTransb;
	/**
	 * 
	 */
	public BrouillonSGTrans() {
		super();
		// TODO Auto-generated constructor stub
	}
	/**
	 * @param decAnneeEnregTrans
	 * @param decPpmDecTrans
	 * @param decRepDecTrans
	 * @param decPaysProv
	 * @param decPaysDest
	 * @param decDateCreation
	 */
	public BrouillonSGTrans(String decAnneeEnregTrans, String decPpmDecTrans,
			String decRepDecTrans, String decPaysProv, String decPaysDest,
			Date decDateCreation) {
		super();
		this.decAnneeEnregTrans = decAnneeEnregTrans;
		this.decPpmDecTrans = decPpmDecTrans;
		this.decRepDecTrans = decRepDecTrans;
		this.decPaysProv = decPaysProv;
		this.decPaysDest = decPaysDest;
		this.decDateCreation = decDateCreation;
	}
	/**
	 * @return the decAnneeEnregTrans
	 */
	public java.lang.String getDecAnneeEnregTrans() {
		return decAnneeEnregTrans;
	}
	/**
	 * @param decAnneeEnregTrans the decAnneeEnregTrans to set
	 */
	public void setDecAnneeEnregTrans(java.lang.String decAnneeEnregTrans) {
		this.decAnneeEnregTrans = decAnneeEnregTrans;
	}
	/**
	 * @return the decPpmDecTrans
	 */
	public java.lang.String getDecPpmDecTrans() {
		return decPpmDecTrans;
	}
	/**
	 * @param decPpmDecTrans the decPpmDecTrans to set
	 */
	public void setDecPpmDecTrans(java.lang.String decPpmDecTrans) {
		this.decPpmDecTrans = decPpmDecTrans;
	}
	/**
	 * @return the decRepDecTrans
	 */
	public java.lang.String getDecRepDecTrans() {
		return decRepDecTrans;
	}
	/**
	 * @param decRepDecTrans the decRepDecTrans to set
	 */
	public void setDecRepDecTrans(java.lang.String decRepDecTrans) {
		this.decRepDecTrans = decRepDecTrans;
	}
	/**
	 * @return the decCodeAgree
	 */
	public java.lang.String getDecCodeAgree() {
		return decCodeAgree;
	}
	/**
	 * @param decCodeAgree the decCodeAgree to set
	 */
	public void setDecCodeAgree(java.lang.String decCodeAgree) {
		this.decCodeAgree = decCodeAgree;
	}
	/**
	 * @return the decAnneeEnregManif
	 */
	public java.lang.String getDecAnneeEnregManif() {
		return decAnneeEnregManif;
	}
	/**
	 * @param decAnneeEnregManif the decAnneeEnregManif to set
	 */
	public void setDecAnneeEnregManif(java.lang.String decAnneeEnregManif) {
		this.decAnneeEnregManif = decAnneeEnregManif;
	}
	/**
	 * @return the decBurEnregManif
	 */
	public java.lang.String getDecBurEnregManif() {
		return decBurEnregManif;
	}
	/**
	 * @param decBurEnregManif the decBurEnregManif to set
	 */
	public void setDecBurEnregManif(java.lang.String decBurEnregManif) {
		this.decBurEnregManif = decBurEnregManif;
	}
	/**
	 * @return the decNumManif
	 */
	public java.lang.Integer getDecNumManif() {
		return decNumManif;
	}
	/**
	 * @param decNumManif the decNumManif to set
	 */
	public void setDecNumManif(java.lang.Integer decNumManif) {
		this.decNumManif = decNumManif;
	}
	/**
	 * @return the decPaysProv
	 */
	public java.lang.String getDecPaysProv() {
		return decPaysProv;
	}
	/**
	 * @param decPaysProv the decPaysProv to set
	 */
	public void setDecPaysProv(java.lang.String decPaysProv) {
		this.decPaysProv = decPaysProv;
	}
	/**
	 * @return the decModeTrans
	 */
	public java.lang.String getDecModeTrans() {
		return decModeTrans;
	}
	/**
	 * @param decModeTrans the decModeTrans to set
	 */
	public void setDecModeTrans(java.lang.String decModeTrans) {
		this.decModeTrans = decModeTrans;
	}
	/**
	 * @return the decMoyenTrans
	 */
	public java.lang.String getDecMoyenTrans() {
		return decMoyenTrans;
	}
	/**
	 * @param decMoyenTrans the decMoyenTrans to set
	 */
	public void setDecMoyenTrans(java.lang.String decMoyenTrans) {
		this.decMoyenTrans = decMoyenTrans;
	}
	/**
	 * @return the decPaysDest
	 */
	public java.lang.String getDecPaysDest() {
		return decPaysDest;
	}
	/**
	 * @param decPaysDest the decPaysDest to set
	 */
	public void setDecPaysDest(java.lang.String decPaysDest) {
		this.decPaysDest = decPaysDest;
	}
	/**
	 * @return the decDateCreation
	 */
	public java.sql.Date getDecDateCreation() {
		return decDateCreation;
	}
	/**
	 * @param decDateCreation the decDateCreation to set
	 */
	public void setDecDateCreation(java.sql.Date decDateCreation) {
		this.decDateCreation = decDateCreation;
	}
	/**
	 * @return the decIdPpmDest
	 */
	public java.lang.String getDecIdPpmDest() {
		return decIdPpmDest;
	}
	/**
	 * @param decIdPpmDest the decIdPpmDest to set
	 */
	public void setDecIdPpmDest(java.lang.String decIdPpmDest) {
		this.decIdPpmDest = decIdPpmDest;
	}
	/**
	 * @return the decNbreArticles
	 */
	public java.lang.Integer getDecNbreArticles() {
		return decNbreArticles;
	}
	/**
	 * @param decNbreArticles the decNbreArticles to set
	 */
	public void setDecNbreArticles(java.lang.Integer decNbreArticles) {
		this.decNbreArticles = decNbreArticles;
	}
	/**
	 * @return the brouillonArtTransb
	 */
	public List<BrouillonArtTransb> getBrouillonArtTransb() {
		return brouillonArtTransb;
	}
	/**
	 * @param brouillonArtTransb the brouillonArtTransb to set
	 */
	public void setBrouillonArtTransb(List<BrouillonArtTransb> brouillonArtTransb) {
		this.brouillonArtTransb = brouillonArtTransb;
	}
	
	

}
