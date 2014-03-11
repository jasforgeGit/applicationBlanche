
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

import sn.com.douane.ejb.declaration.model.keys.BrouillonArtTransbKey;

/**
 * @author moussakare
 *
 */
@Entity
@IdClass(BrouillonArtTransbKey.class)
@Table(name = "BROUILLONARTTRANSB")
public class BrouillonArtTransb implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -4270465950265266362L;
	
	@Id
	@Column(name = "DECNUMARTDECL", nullable = false)
	private java.lang.Integer decNumArtDecl;
	@Id
	@Column(name = "DECANNEEDECL", length = 4,nullable = false)
	private java.lang.String decAnneeEnregTrans;
	@Id
	@Column(name = "DECCODEPPM", length = 5, nullable = false)
	private java.lang.String decPpmDecTrans;
	@Id
	@Column(name = "DECNUMREPTRANS", length = 6, nullable = false)
	private java.lang.String decRepDecTrans;
	@Column(name = "DECCODEAGREE", length = 3, nullable = false)
    private java.lang.String decCodeAgree;
	@Column(name = "DECANNEEENREGMANIF", length = 4)
    private java.lang.String decAnneeEnregManif;
	@Column(name = "DECBURENREGMANIF", length = 3)
    private java.lang.String decburenregmanif;
	@Column(name = "DECNUMENREGMANIF")
    private java.lang.Integer decNumEnregManif;
	@Column(name = "DECNUMARTMANIF")
    private java.lang.Integer decNumArtManif;
	@Column(name = "DECPRECARTMANIF")
    private java.lang.Integer decPrecArtManif;
	@Column(name = "DECPREC2ARTMANIF")
    private java.lang.Integer decPrec2ArtManif;
	@Column(name = "DECNBRECOLISTRANS", columnDefinition = "DECIMAL(6,0)")
    private java.math.BigDecimal decNbreColisTrans;
	@Column(name = "DECPOIDSTRANS",  columnDefinition = "DECIMAL(9,0)")
    private java.math.BigDecimal decPoidsTrans;
	@Column(name = "DECDESTDEFINITIVE", length = 20)
    private java.lang.String decDestDefinitive;
	@Column(name = "DECNOMDESTINATAIRE", length = 255)
    private java.lang.String decNomDestinataire;
	@Column(name = "DECTYPEVOIEDEST", length = 25)
    private java.lang.String decTypeVoieDest;
	@Column(name = "DECNOMVOIEDEST", length = 25)
    private java.lang.String decNomVoieDest;
	@Column(name = "DECNUMVOIEDEST", length = 5)
    private java.lang.String decNumVoieDest;
	@Column(name = "DECQTIERDEST", length = 50)
    private java.lang.String decQtierDest;
	@Column(name = "DECVILLEDEST", length = 50)
    private java.lang.String decVilleDest;
	@Column(name = "DECBPDEST", length = 4)
    private java.lang.String decBpDest;
	@Column(name = "DECMODECOND", length = 4)
    private java.lang.String decModeCond;
	@Column(name = "DECVALDOUANE", columnDefinition = "DECIMAL(11,0)")
    private java.math.BigDecimal decValDouane;
	@ManyToOne(targetEntity = BrouillonSGTrans.class)
	@JoinColumns({
		@JoinColumn(name = "DECANNEEDECL", referencedColumnName = "DECANNEEENREGTRANS", insertable = false, updatable = false, nullable = false),
		@JoinColumn(name = "DECCODEPPM", referencedColumnName = "DECPPMDECTRANS", insertable = false, updatable = false, nullable = false),
		@JoinColumn(name = "DECNUMREPTRANS", referencedColumnName = "DECREPDECTRANS", insertable = false, updatable = false, nullable = false)
	})
    private BrouillonSGTrans brSGArtTrans;
	/**
	 * 
	 */
	public BrouillonArtTransb() {
		super();
		// TODO Auto-generated constructor stub
	}
	/**
	 * @param decNumArtDecl
	 * @param decAnneeEnregTrans
	 * @param decPpmDecTrans
	 * @param decRepDecTrans
	 * @param decCodeAgree
	 */
	public BrouillonArtTransb(Integer decNumArtDecl, String decAnneeEnregTrans,
			String decPpmDecTrans, String decRepDecTrans, String decCodeAgree) {
		super();
		this.decNumArtDecl = decNumArtDecl;
		this.decAnneeEnregTrans = decAnneeEnregTrans;
		this.decPpmDecTrans = decPpmDecTrans;
		this.decRepDecTrans = decRepDecTrans;
		this.decCodeAgree = decCodeAgree;
	}
	/**
	 * @return the decNumArtDecl
	 */
	public java.lang.Integer getDecNumArtDecl() {
		return decNumArtDecl;
	}
	/**
	 * @param decNumArtDecl the decNumArtDecl to set
	 */
	public void setDecNumArtDecl(java.lang.Integer decNumArtDecl) {
		this.decNumArtDecl = decNumArtDecl;
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
	 * @return the decburenregmanif
	 */
	public java.lang.String getDecburenregmanif() {
		return decburenregmanif;
	}
	/**
	 * @param decburenregmanif the decburenregmanif to set
	 */
	public void setDecburenregmanif(java.lang.String decburenregmanif) {
		this.decburenregmanif = decburenregmanif;
	}
	/**
	 * @return the decNumEnregManif
	 */
	public java.lang.Integer getDecNumEnregManif() {
		return decNumEnregManif;
	}
	/**
	 * @param decNumEnregManif the decNumEnregManif to set
	 */
	public void setDecNumEnregManif(java.lang.Integer decNumEnregManif) {
		this.decNumEnregManif = decNumEnregManif;
	}
	/**
	 * @return the decNumArtManif
	 */
	public java.lang.Integer getDecNumArtManif() {
		return decNumArtManif;
	}
	/**
	 * @param decNumArtManif the decNumArtManif to set
	 */
	public void setDecNumArtManif(java.lang.Integer decNumArtManif) {
		this.decNumArtManif = decNumArtManif;
	}
	/**
	 * @return the decPrecArtManif
	 */
	public java.lang.Integer getDecPrecArtManif() {
		return decPrecArtManif;
	}
	/**
	 * @param decPrecArtManif the decPrecArtManif to set
	 */
	public void setDecPrecArtManif(java.lang.Integer decPrecArtManif) {
		this.decPrecArtManif = decPrecArtManif;
	}
	/**
	 * @return the decPrec2ArtManif
	 */
	public java.lang.Integer getDecPrec2ArtManif() {
		return decPrec2ArtManif;
	}
	/**
	 * @param decPrec2ArtManif the decPrec2ArtManif to set
	 */
	public void setDecPrec2ArtManif(java.lang.Integer decPrec2ArtManif) {
		this.decPrec2ArtManif = decPrec2ArtManif;
	}
	/**
	 * @return the decNbreColisTrans
	 */
	public java.math.BigDecimal getDecNbreColisTrans() {
		return decNbreColisTrans;
	}
	/**
	 * @param decNbreColisTrans the decNbreColisTrans to set
	 */
	public void setDecNbreColisTrans(java.math.BigDecimal decNbreColisTrans) {
		this.decNbreColisTrans = decNbreColisTrans;
	}
	/**
	 * @return the decPoidsTrans
	 */
	public java.math.BigDecimal getDecPoidsTrans() {
		return decPoidsTrans;
	}
	/**
	 * @param decPoidsTrans the decPoidsTrans to set
	 */
	public void setDecPoidsTrans(java.math.BigDecimal decPoidsTrans) {
		this.decPoidsTrans = decPoidsTrans;
	}
	/**
	 * @return the decDestDefinitive
	 */
	public java.lang.String getDecDestDefinitive() {
		return decDestDefinitive;
	}
	/**
	 * @param decDestDefinitive the decDestDefinitive to set
	 */
	public void setDecDestDefinitive(java.lang.String decDestDefinitive) {
		this.decDestDefinitive = decDestDefinitive;
	}
	/**
	 * @return the decNomDestinataire
	 */
	public java.lang.String getDecNomDestinataire() {
		return decNomDestinataire;
	}
	/**
	 * @param decNomDestinataire the decNomDestinataire to set
	 */
	public void setDecNomDestinataire(java.lang.String decNomDestinataire) {
		this.decNomDestinataire = decNomDestinataire;
	}
	/**
	 * @return the decTypeVoieDest
	 */
	public java.lang.String getDecTypeVoieDest() {
		return decTypeVoieDest;
	}
	/**
	 * @param decTypeVoieDest the decTypeVoieDest to set
	 */
	public void setDecTypeVoieDest(java.lang.String decTypeVoieDest) {
		this.decTypeVoieDest = decTypeVoieDest;
	}
	/**
	 * @return the decNomVoieDest
	 */
	public java.lang.String getDecNomVoieDest() {
		return decNomVoieDest;
	}
	/**
	 * @param decNomVoieDest the decNomVoieDest to set
	 */
	public void setDecNomVoieDest(java.lang.String decNomVoieDest) {
		this.decNomVoieDest = decNomVoieDest;
	}
	/**
	 * @return the decNumVoieDest
	 */
	public java.lang.String getDecNumVoieDest() {
		return decNumVoieDest;
	}
	/**
	 * @param decNumVoieDest the decNumVoieDest to set
	 */
	public void setDecNumVoieDest(java.lang.String decNumVoieDest) {
		this.decNumVoieDest = decNumVoieDest;
	}
	/**
	 * @return the decQtierDest
	 */
	public java.lang.String getDecQtierDest() {
		return decQtierDest;
	}
	/**
	 * @param decQtierDest the decQtierDest to set
	 */
	public void setDecQtierDest(java.lang.String decQtierDest) {
		this.decQtierDest = decQtierDest;
	}
	/**
	 * @return the decVilleDest
	 */
	public java.lang.String getDecVilleDest() {
		return decVilleDest;
	}
	/**
	 * @param decVilleDest the decVilleDest to set
	 */
	public void setDecVilleDest(java.lang.String decVilleDest) {
		this.decVilleDest = decVilleDest;
	}
	/**
	 * @return the decBpDest
	 */
	public java.lang.String getDecBpDest() {
		return decBpDest;
	}
	/**
	 * @param decBpDest the decBpDest to set
	 */
	public void setDecBpDest(java.lang.String decBpDest) {
		this.decBpDest = decBpDest;
	}
	/**
	 * @return the decModeCond
	 */
	public java.lang.String getDecModeCond() {
		return decModeCond;
	}
	/**
	 * @param decModeCond the decModeCond to set
	 */
	public void setDecModeCond(java.lang.String decModeCond) {
		this.decModeCond = decModeCond;
	}
	/**
	 * @return the decValDouane
	 */
	public java.math.BigDecimal getDecValDouane() {
		return decValDouane;
	}
	/**
	 * @param decValDouane the decValDouane to set
	 */
	public void setDecValDouane(java.math.BigDecimal decValDouane) {
		this.decValDouane = decValDouane;
	}
	/**
	 * @return the brSGArtTrans
	 */
	public BrouillonSGTrans getBrSGArtTrans() {
		return brSGArtTrans;
	}
	/**
	 * @param brSGArtTrans the brSGArtTrans to set
	 */
	public void setBrSGArtTrans(BrouillonSGTrans brSGArtTrans) {
		this.brSGArtTrans = brSGArtTrans;
	}
	@Override
	public String toString() {
		return "BrouillonArtTransb [decNumArtDecl=" + decNumArtDecl
				+ ", decAnneeEnregTrans=" + decAnneeEnregTrans
				+ ", decPpmDecTrans=" + decPpmDecTrans + ", decRepDecTrans="
				+ decRepDecTrans + ", decCodeAgree=" + decCodeAgree
				+ ", decAnneeEnregManif=" + decAnneeEnregManif
				+ ", decburenregmanif=" + decburenregmanif
				+ ", decNumEnregManif=" + decNumEnregManif
				+ ", decNumArtManif=" + decNumArtManif + ", decPrecArtManif="
				+ decPrecArtManif + ", decPrec2ArtManif=" + decPrec2ArtManif
				+ ", decNbreColisTrans=" + decNbreColisTrans
				+ ", decPoidsTrans=" + decPoidsTrans + ", decDestDefinitive="
				+ decDestDefinitive + ", decNomDestinataire="
				+ decNomDestinataire + ", decTypeVoieDest=" + decTypeVoieDest
				+ ", decNomVoieDest=" + decNomVoieDest + ", decNumVoieDest="
				+ decNumVoieDest + ", decQtierDest=" + decQtierDest
				+ ", decVilleDest=" + decVilleDest + ", decBpDest=" + decBpDest
				+ ", decModeCond=" + decModeCond + ", decValDouane="
				+ decValDouane + ", brSGArtTrans=" + brSGArtTrans + "]";
	}
	
	
	
	

}
