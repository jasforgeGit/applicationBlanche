package sn.com.douane.ejb.declaration.model.entities;

import java.io.Serializable;
import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Transient;

import sn.com.douane.ejb.declaration.model.keys.DdeModifSegartDecKey;
import sn.com.douane.ejb.rc.model.entities.BureauFranchise;
import sn.com.douane.ejb.rc.model.entities.Mad;
import sn.com.douane.ejb.rc.model.entities.Ppm;

/**
 * @author: ahmed The Entity Bean DdeModifSegartDec.
 */
@Entity
@Table(name = "DDEMODIFSEGARTDEC")
@IdClass(DdeModifSegartDecKey.class)
public class DdeModifSegartDec implements Serializable {

	/** The Constant serialVersionUID. */
	private static final long serialVersionUID = -4836262506136482576L;

	/** The dec annee enreg dec. */
	@Id
	@Column(name = "DECANNEEENREGDEC", length = 4, nullable = false)
	private String decAnneeEnregDec;

	/** The dec bur enreg dec. */
	@Id
	@Column(name = "DECBURENREGDEC", length = 3, nullable = false)
	private String decBurEnregDec;

	/** The dec num declaration. */
	@Id
	@Column(name = "DECNUMDECLARATION", nullable = false)
	private Integer decNumDeclaration;

	/** The dec num art dec. */
	@Id
	@Column(name = "DECNUMARTDEC", nullable = false)
	private Integer decNumArtDec;

	/** The dec ppm user final. */
	@Column(name = "DECPPMUSERFINAL", length = 5)
	private String decPpmUserFinal;

	/** The dec annee exoneration. */
	@Column(name = "DECANNEEEXONERATION", length = 4)
	private String decAnneeExoneration;

	/** The dec bur exoneration. */
	@Column(name = "DECBUREXONERATION", length = 3)
	private String decBurExoneration;

	/** The dec num exoneration. */
	@Column(name = "DECNUMEXONERATION", length = 6)
	private String decNumExoneration;

	/** The dec num sg sdpi. */
	@Column(name = "DECNUMSGSDPI", length = 7)
	private String decNumSgSdpi;

	/** The dec annee av sgs. */
	@Column(name = "DECANNEEAVSGS", length = 2)
	private String decAnneeAvSgs;

	/** The dec num av sgs. */
	@Column(name = "DECNUMAVSGS", length = 6)
	private String decNumAvSgs;

	/** The dec marq colis. */
	@Column(name = "DECMARQCOLIS")
	private String decMarqColis;

	/** The dec des commerciale. */
	@Column(name = "DECDESCOMMERCIALE")
	private String decDesCommerciale;

	/** The dec code lieu stokage. */
	@Column(name = "DECCODELIEUSTOKAGE", length = 10)
	private String decCodeLieuStokage;

	/** The dec num titre trans. */
	@Column(name = "DECNUMTITRETRANS", length = 12)
	private String decNumTitreTrans;

	/** The dec num message. */
	@Column(name = "DECNUMMESSAGE")
	private Integer decNumMessage;

	/** The dec type message. */
	@Column(name = "DECTYPEMESSAGE", length = 1)
	private String decTypeMessage;

	/** The dec date dde modif. */
	@Column(name = "DECDATEDDEMODIF")
	private Date decDateDdeModif;

	/** The Bureau franchise dde modif segart dec. */
	@ManyToOne(targetEntity = BureauFranchise.class)
	@JoinColumn(name = "DECBUREXONERATION", insertable = false, updatable = false)
	private BureauFranchise bureauFranchise;

	/** The mad dde modif segart dec. */
	@ManyToOne(targetEntity = Mad.class)
	@JoinColumn(name = "DECCODELIEUSTOKAGE", insertable = false, updatable = false)
	private Mad mad;

	/** The ppm dde modif segart dec. */
	@ManyToOne(targetEntity = Ppm.class)
	@JoinColumn(name = "DECPPMUSERFINAL", insertable = false, updatable = false)
	private Ppm ppm;

	@Transient
	private String decRegimeFiscal;
	@Transient
	private String decTypeRegime;
	@Transient
	private String decRegimeDouanier;

	/**
	 * Instantiates a new dde modif segart dec.
	 * 
	 * @param decAnneeEnregDec
	 *            the dec annee enreg dec
	 * @param decBurEnregDec
	 *            the dec bur enreg dec
	 * @param decNumDeclaration
	 *            the dec num declaration
	 * @param decNumArtDec
	 *            the dec num art dec
	 */
	public DdeModifSegartDec(String decAnneeEnregDec, String decBurEnregDec,
			Integer decNumDeclaration, Integer decNumArtDec) {
		this.decAnneeEnregDec = decAnneeEnregDec;
		this.decBurEnregDec = decBurEnregDec;
		this.decNumDeclaration = decNumDeclaration;
		this.decNumArtDec = decNumArtDec;
	}

	/**
	 * Instantiates a new dde modif segart dec.
	 */
	public DdeModifSegartDec() {

	}

	/**
	 * Gets the dec annee enreg dec.
	 * 
	 * @return the decAnneeEnregDec
	 */
	public String getDecAnneeEnregDec() {
		return decAnneeEnregDec;
	}

	/**
	 * Sets the dec annee enreg dec.
	 * 
	 * @param decAnneeEnregDec
	 *            the decAnneeEnregDec to set
	 */
	public void setDecAnneeEnregDec(String decAnneeEnregDec) {
		this.decAnneeEnregDec = decAnneeEnregDec;
	}

	/**
	 * Gets the dec bur enreg dec.
	 * 
	 * @return the decBurEnregDec
	 */
	public String getDecBurEnregDec() {
		return decBurEnregDec;
	}

	/**
	 * Sets the dec bur enreg dec.
	 * 
	 * @param decBurEnregDec
	 *            the decBurEnregDec to set
	 */
	public void setDecBurEnregDec(String decBurEnregDec) {
		this.decBurEnregDec = decBurEnregDec;
	}

	/**
	 * Gets the dec num declaration.
	 * 
	 * @return the decNumDeclaration
	 */
	public Integer getDecNumDeclaration() {
		return decNumDeclaration;
	}

	/**
	 * Sets the dec num declaration.
	 * 
	 * @param decNumDeclaration
	 *            the decNumDeclaration to set
	 */
	public void setDecNumDeclaration(Integer decNumDeclaration) {
		this.decNumDeclaration = decNumDeclaration;
	}

	/**
	 * Gets the dec num art dec.
	 * 
	 * @return the decNumArtDec
	 */
	public Integer getDecNumArtDec() {
		return decNumArtDec;
	}

	/**
	 * Sets the dec num art dec.
	 * 
	 * @param decNumArtDec
	 *            the decNumArtDec to set
	 */
	public void setDecNumArtDec(Integer decNumArtDec) {
		this.decNumArtDec = decNumArtDec;
	}

	/**
	 * Gets the dec ppm user final.
	 * 
	 * @return the decPpmUserFinal
	 */
	public String getDecPpmUserFinal() {
		return decPpmUserFinal;
	}

	/**
	 * Sets the dec ppm user final.
	 * 
	 * @param decPpmUserFinal
	 *            the decPpmUserFinal to set
	 */
	public void setDecPpmUserFinal(String decPpmUserFinal) {
		this.decPpmUserFinal = decPpmUserFinal;
	}

	/**
	 * Gets the dec annee exoneration.
	 * 
	 * @return the decAnneeExoneration
	 */
	public String getDecAnneeExoneration() {
		return decAnneeExoneration;
	}

	/**
	 * Sets the dec annee exoneration.
	 * 
	 * @param decAnneeExoneration
	 *            the decAnneeExoneration to set
	 */
	public void setDecAnneeExoneration(String decAnneeExoneration) {
		this.decAnneeExoneration = decAnneeExoneration;
	}

	/**
	 * Gets the dec bur exoneration.
	 * 
	 * @return the decBurExoneration
	 */
	public String getDecBurExoneration() {
		return decBurExoneration;
	}

	/**
	 * Sets the dec bur exoneration.
	 * 
	 * @param decBurExoneration
	 *            the decBurExoneration to set
	 */
	public void setDecBurExoneration(String decBurExoneration) {
		this.decBurExoneration = decBurExoneration;
	}

	/**
	 * Gets the dec num exoneration.
	 * 
	 * @return the decNumExoneration
	 */
	public String getDecNumExoneration() {
		return decNumExoneration;
	}

	/**
	 * Sets the dec num exoneration.
	 * 
	 * @param decNumExoneration
	 *            the decNumExoneration to set
	 */
	public void setDecNumExoneration(String decNumExoneration) {
		this.decNumExoneration = decNumExoneration;
	}

	/**
	 * Gets the dec num sg sdpi.
	 * 
	 * @return the decNumSgSdpi
	 */
	public String getDecNumSgSdpi() {
		return decNumSgSdpi;
	}

	/**
	 * Sets the dec num sg sdpi.
	 * 
	 * @param decNumSgSdpi
	 *            the decNumSgSdpi to set
	 */
	public void setDecNumSgSdpi(String decNumSgSdpi) {
		this.decNumSgSdpi = decNumSgSdpi;
	}

	/**
	 * Gets the dec annee av sgs.
	 * 
	 * @return the decAnneeAvSgs
	 */
	public String getDecAnneeAvSgs() {
		return decAnneeAvSgs;
	}

	/**
	 * Sets the dec annee av sgs.
	 * 
	 * @param decAnneeAvSgs
	 *            the decAnneeAvSgs to set
	 */
	public void setDecAnneeAvSgs(String decAnneeAvSgs) {
		this.decAnneeAvSgs = decAnneeAvSgs;
	}

	/**
	 * Gets the dec num av sgs.
	 * 
	 * @return the decNumAvSgs
	 */
	public String getDecNumAvSgs() {
		return decNumAvSgs;
	}

	/**
	 * Sets the dec num av sgs.
	 * 
	 * @param decNumAvSgs
	 *            the decNumAvSgs to set
	 */
	public void setDecNumAvSgs(String decNumAvSgs) {
		this.decNumAvSgs = decNumAvSgs;
	}

	/**
	 * Gets the dec marq colis.
	 * 
	 * @return the decMarqColis
	 */
	public String getDecMarqColis() {
		return decMarqColis;
	}

	/**
	 * Sets the dec marq colis.
	 * 
	 * @param decMarqColis
	 *            the decMarqColis to set
	 */
	public void setDecMarqColis(String decMarqColis) {
		this.decMarqColis = decMarqColis;
	}

	/**
	 * Gets the dec des commerciale.
	 * 
	 * @return the decDesCommerciale
	 */
	public String getDecDesCommerciale() {
		return decDesCommerciale;
	}

	/**
	 * Sets the dec des commerciale.
	 * 
	 * @param decDesCommerciale
	 *            the decDesCommerciale to set
	 */
	public void setDecDesCommerciale(String decDesCommerciale) {
		this.decDesCommerciale = decDesCommerciale;
	}

	/**
	 * Gets the dec code lieu stokage.
	 * 
	 * @return the decCodeLieuStokage
	 */
	public String getDecCodeLieuStokage() {
		return decCodeLieuStokage;
	}

	/**
	 * Sets the dec code lieu stokage.
	 * 
	 * @param decCodeLieuStokage
	 *            the decCodeLieuStokage to set
	 */
	public void setDecCodeLieuStokage(String decCodeLieuStokage) {
		this.decCodeLieuStokage = decCodeLieuStokage;
	}

	/**
	 * Gets the dec num titre trans.
	 * 
	 * @return the decNumTitreTrans
	 */
	public String getDecNumTitreTrans() {
		return decNumTitreTrans;
	}

	/**
	 * Sets the dec num titre trans.
	 * 
	 * @param decNumTitreTrans
	 *            the decNumTitreTrans to set
	 */
	public void setDecNumTitreTrans(String decNumTitreTrans) {
		this.decNumTitreTrans = decNumTitreTrans;
	}

	/**
	 * Gets the dec num message.
	 * 
	 * @return the decNumMessage
	 */
	public Integer getDecNumMessage() {
		return decNumMessage;
	}

	/**
	 * Sets the dec num message.
	 * 
	 * @param decNumMessage
	 *            the decNumMessage to set
	 */
	public void setDecNumMessage(Integer decNumMessage) {
		this.decNumMessage = decNumMessage;
	}

	/**
	 * Gets the dec type message.
	 * 
	 * @return the decTypeMessage
	 */
	public String getDecTypeMessage() {
		return decTypeMessage;
	}

	/**
	 * Sets the dec type message.
	 * 
	 * @param decTypeMessage
	 *            the decTypeMessage to set
	 */
	public void setDecTypeMessage(String decTypeMessage) {
		this.decTypeMessage = decTypeMessage;
	}

	/**
	 * Gets the dec date dde modif.
	 * 
	 * @return the decDateDdeModif
	 */
	public Date getDecDateDdeModif() {
		return decDateDdeModif;
	}

	/**
	 * Sets the dec date dde modif.
	 * 
	 * @param decDateDdeModif
	 *            the decDateDdeModif to set
	 */
	public void setDecDateDdeModif(Date decDateDdeModif) {
		this.decDateDdeModif = decDateDdeModif;
	}

	public BureauFranchise getBureauFranchise() {
		return bureauFranchise;
	}

	public void setBureauFranchise(BureauFranchise bureauFranchise) {
		this.bureauFranchise = bureauFranchise;
	}

	public Mad getMad() {
		return mad;
	}

	public void setMad(Mad mad) {
		this.mad = mad;
	}

	public Ppm getPpm() {
		return ppm;
	}

	public void setPpm(Ppm ppm) {
		this.ppm = ppm;
	}
	
	public String getDecRegimeFiscal() {
		return decRegimeFiscal;
	}

	public void setDecRegimeFiscal(String decRegimeFiscal) {
		this.decRegimeFiscal = decRegimeFiscal;
	}

	public String getDecTypeRegime() {
		return decTypeRegime;
	}

	public void setDecTypeRegime(String decTypeRegime) {
		this.decTypeRegime = decTypeRegime;
	}

	public String getDecRegimeDouanier() {
		return decRegimeDouanier;
	}

	public void setDecRegimeDouanier(String decRegimeDouanier) {
		this.decRegimeDouanier = decRegimeDouanier;
	}

}
