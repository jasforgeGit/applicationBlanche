/**
 * moussakare
 */
package sn.com.douane.ejb.manifeste.model.entities;

import java.io.Serializable;
import java.math.BigDecimal;
import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

import sn.com.douane.ejb.manifeste.model.keys.ArticleManifesteKey;
import sn.com.douane.ejb.manifeste.model.keys.RegistreDepotKey;



/**
 * @author moussakare
 *
 */
@Entity
@IdClass(RegistreDepotKey.class)

@NamedQueries({
	@NamedQuery(name = "findRegistreOfArticleManifeste", 
			query = "select object(o) from RegistreDepot o where o.manifAnneeEnregManif = ?1 and o.manifBurEnregManif = ?2 " +
					"and o.manifNumEnregManif= ?3 and o.manifNumArtManif = ?4 and o.manifPrecArtManif = ?5 " +
					"and o.manifPrec2ArtManif = ?6")
})

@Table(name = "REGISTREDEPOT")

public class RegistreDepot implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 4706390363141376182L;
	
	@Id
	@Column(name ="MANIFANNEEREGDEPOT", length = 4, nullable = false)	
	private java.lang.String manifAnneeRegDepot;
	
	@Id
	@Column(name = "MANIFBURREGDEPOT" , length = 3 , nullable = false)
    private java.lang.String manifBurRegDepot;
	
	@Id
	@Column(name = "MANIFNUMREGDEPOT", nullable = false)
    private java.lang.Integer manifNumRegDepot;
	
	@Column(name = "MANIFANNEEENREGMANIF", length = 4)
    private java.lang.String manifAnneeEnregManif;
	@Column(name = "MANIFBURENREGMANIF", length = 3)
    private java.lang.String manifBurEnregManif;
	@Column(name = "MANIFNUMENREGMANIF")
    private java.lang.Integer manifNumEnregManif;
	@Column(name = "MANIFNUMARTMANIF")
    private java.lang.Integer manifNumArtManif;
	@Column(name = "MANIFPRECARTMANIF")
    private java.lang.Integer manifPrecArtManif;
	@Column(name = "MANIFPREC2ARTMANIF")
    private java.lang.Integer manifPrec2ArtManif;
	@Column(name = "MANIFDATEDEPOT")
    private java.sql.Date manifDateDepot;
	@Column(name = "MANIFCODECONSIGN", length = 3)
    private java.lang.String manifCodeConsign;
	@Column(name = "MANIFTYPEMISEENDEPOT",  length = 1)
    private java.lang.String manifTypeMiseEnDepot;
	@Column(name = "MANIFCODELIEUSTOCK", length = 4)
    private java.lang.String manifCodeLieuStock;
	@Column(name = "MANIFNBREAPURPHYSIQUE")
    private java.lang.Integer manifNbreApurPhysique;
	@Column(name = "MANIFPDAPURPHYSIQUE",  columnDefinition="DECIMAL(9 , 0)")
    private java.math.BigDecimal manifPdApurPhysique;
	@Column(name = "MANIFNBREAPURCOMPTA")
    private java.lang.Integer manifNbreApurCompta;
	@Column(name = "MANIFPDAPURCOMPTA", columnDefinition="DECIMAL(9 , 0)")
    private java.math.BigDecimal manifPdApurCompta;
	@Column(name = "MANIFNUMTITRETRANSPORT", length = 12)
    private java.lang.String manifNumTitreTransport;
	@Column(name = "MANIFPDMISEENDEPOT",columnDefinition="DECIMAL(9 , 0)")
    private java.math.BigDecimal manifPdMiseEnDepot;
	@Column(name = "MANIFNBRECOLISDEPOT", columnDefinition="DECIMAL(6 , 0)")
    private java.math.BigDecimal manifNbreColisDepot;
	@Column(name = "MANIFCODEEMETTEUR", length = 8)
    private java.lang.String manifCodeEmetteur;
	@Column(name = "MANIFUSERVALIDATION", length = 8)
    private java.lang.String manifUserValidation;
	@Column(name = "MANIFNUMMESSAGE")
    private java.lang.Integer manifNumMessage;
	@Column(name = "MANIFDATEDEPOTBRIGADE", length = 3)
    private java.lang.String manifDateDepotBrigade;
	@Column(name = "MANIFAGENTBRIGADE", length = 8)
    private java.lang.String manifAgentBrigade;
	@Column(name = "MANIFANNEEDECL", length = 4)
    private java.lang.String manifAnneeDecl;
	@Column(name = "MANIFBURDECL", length = 3)
    private java.lang.String manifBurDecl;
	@Column(name = "MANIFNUMDECL")
    private java.lang.Integer manifNumDecl;
	/**
	 * 
	 */
	public RegistreDepot() {
		// TODO Auto-generated constructor stub
	}
	/**
	 * @param manifAnneeRegDepot
	 * @param manifBurRegDepot
	 * @param manifNumRegDepot
	 * @param manifAnneeEnregManif
	 * @param manifBurEnregManif
	 * @param manifNumEnregManif
	 * @param manifNumArtManif
	 * @param manifPrecArtManif
	 * @param manifPrec2ArtManif
	 * @param manifDateDepot
	 * @param manifCodeConsign
	 * @param manifTypeMiseEnDepot
	 * @param manifCodeLieuStock
	 * @param manifNbreApurPhysique
	 * @param manifPdApurPhysique
	 * @param manifNbreApurCompta
	 * @param manifPdApurCompta
	 * @param manifNumTitreTransport
	 * @param manifPdMiseEnDepot
	 * @param manifNbreColisDepot
	 * @param manifCodeEmetteur
	 * @param manifUserValidation
	 * @param manifNumMessage
	 * @param manifDateDepotBrigade
	 * @param manifAgentBrigade
	 * @param manifAnneeDecl
	 * @param manifBurDecl
	 * @param manifNumDecl
	 */
	public RegistreDepot(String manifAnneeRegDepot, String manifBurRegDepot,
			Integer manifNumRegDepot, String manifAnneeEnregManif,
			String manifBurEnregManif, Integer manifNumEnregManif,
			Integer manifNumArtManif, Integer manifPrecArtManif,
			Integer manifPrec2ArtManif, Date manifDateDepot,
			String manifCodeConsign, String manifTypeMiseEnDepot,
			String manifCodeLieuStock, Integer manifNbreApurPhysique,
			BigDecimal manifPdApurPhysique, Integer manifNbreApurCompta,
			BigDecimal manifPdApurCompta, String manifNumTitreTransport,
			BigDecimal manifPdMiseEnDepot, BigDecimal manifNbreColisDepot,
			String manifCodeEmetteur, String manifUserValidation,
			Integer manifNumMessage, String manifDateDepotBrigade,
			String manifAgentBrigade, String manifAnneeDecl,
			String manifBurDecl, Integer manifNumDecl) {
		super();
		this.manifAnneeRegDepot = manifAnneeRegDepot;
		this.manifBurRegDepot = manifBurRegDepot;
		this.manifNumRegDepot = manifNumRegDepot;
		this.manifAnneeEnregManif = manifAnneeEnregManif;
		this.manifBurEnregManif = manifBurEnregManif;
		this.manifNumEnregManif = manifNumEnregManif;
		this.manifNumArtManif = manifNumArtManif;
		this.manifPrecArtManif = manifPrecArtManif;
		this.manifPrec2ArtManif = manifPrec2ArtManif;
		this.manifDateDepot = manifDateDepot;
		this.manifCodeConsign = manifCodeConsign;
		this.manifTypeMiseEnDepot = manifTypeMiseEnDepot;
		this.manifCodeLieuStock = manifCodeLieuStock;
		this.manifNbreApurPhysique = manifNbreApurPhysique;
		this.manifPdApurPhysique = manifPdApurPhysique;
		this.manifNbreApurCompta = manifNbreApurCompta;
		this.manifPdApurCompta = manifPdApurCompta;
		this.manifNumTitreTransport = manifNumTitreTransport;
		this.manifPdMiseEnDepot = manifPdMiseEnDepot;
		this.manifNbreColisDepot = manifNbreColisDepot;
		this.manifCodeEmetteur = manifCodeEmetteur;
		this.manifUserValidation = manifUserValidation;
		this.manifNumMessage = manifNumMessage;
		this.manifDateDepotBrigade = manifDateDepotBrigade;
		this.manifAgentBrigade = manifAgentBrigade;
		this.manifAnneeDecl = manifAnneeDecl;
		this.manifBurDecl = manifBurDecl;
		this.manifNumDecl = manifNumDecl;
	}
	/**
	 * @return the manifAnneeRegDepot
	 */
	public java.lang.String getManifAnneeRegDepot() {
		return manifAnneeRegDepot;
	}
	/**
	 * @param manifAnneeRegDepot the manifAnneeRegDepot to set
	 */
	public void setManifAnneeRegDepot(java.lang.String manifAnneeRegDepot) {
		this.manifAnneeRegDepot = manifAnneeRegDepot;
	}
	/**
	 * @return the manifBurRegDepot
	 */
	public java.lang.String getManifBurRegDepot() {
		return manifBurRegDepot;
	}
	/**
	 * @param manifBurRegDepot the manifBurRegDepot to set
	 */
	public void setManifBurRegDepot(java.lang.String manifBurRegDepot) {
		this.manifBurRegDepot = manifBurRegDepot;
	}
	/**
	 * @return the manifNumRegDepot
	 */
	public java.lang.Integer getManifNumRegDepot() {
		return manifNumRegDepot;
	}
	/**
	 * @param manifNumRegDepot the manifNumRegDepot to set
	 */
	public void setManifNumRegDepot(java.lang.Integer manifNumRegDepot) {
		this.manifNumRegDepot = manifNumRegDepot;
	}
	/**
	 * @return the manifAnneeEnregManif
	 */
	public java.lang.String getManifAnneeEnregManif() {
		return manifAnneeEnregManif;
	}
	/**
	 * @param manifAnneeEnregManif the manifAnneeEnregManif to set
	 */
	public void setManifAnneeEnregManif(java.lang.String manifAnneeEnregManif) {
		this.manifAnneeEnregManif = manifAnneeEnregManif;
	}
	/**
	 * @return the manifBurEnregManif
	 */
	public java.lang.String getManifBurEnregManif() {
		return manifBurEnregManif;
	}
	/**
	 * @param manifBurEnregManif the manifBurEnregManif to set
	 */
	public void setManifBurEnregManif(java.lang.String manifBurEnregManif) {
		this.manifBurEnregManif = manifBurEnregManif;
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
	 * @return the manifNumArtManif
	 */
	public java.lang.Integer getManifNumArtManif() {
		return manifNumArtManif;
	}
	/**
	 * @param manifNumArtManif the manifNumArtManif to set
	 */
	public void setManifNumArtManif(java.lang.Integer manifNumArtManif) {
		this.manifNumArtManif = manifNumArtManif;
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
	 * @return the manifPrec2ArtManif
	 */
	public java.lang.Integer getManifPrec2ArtManif() {
		return manifPrec2ArtManif;
	}
	/**
	 * @param manifPrec2ArtManif the manifPrec2ArtManif to set
	 */
	public void setManifPrec2ArtManif(java.lang.Integer manifPrec2ArtManif) {
		this.manifPrec2ArtManif = manifPrec2ArtManif;
	}
	/**
	 * @return the manifDateDepot
	 */
	public java.sql.Date getManifDateDepot() {
		return manifDateDepot;
	}
	/**
	 * @param manifDateDepot the manifDateDepot to set
	 */
	public void setManifDateDepot(java.sql.Date manifDateDepot) {
		this.manifDateDepot = manifDateDepot;
	}
	/**
	 * @return the manifCodeConsign
	 */
	public java.lang.String getManifCodeConsign() {
		return manifCodeConsign;
	}
	/**
	 * @param manifCodeConsign the manifCodeConsign to set
	 */
	public void setManifCodeConsign(java.lang.String manifCodeConsign) {
		this.manifCodeConsign = manifCodeConsign;
	}
	/**
	 * @return the manifTypeMiseEnDepot
	 */
	public java.lang.String getManifTypeMiseEnDepot() {
		return manifTypeMiseEnDepot;
	}
	/**
	 * @param manifTypeMiseEnDepot the manifTypeMiseEnDepot to set
	 */
	public void setManifTypeMiseEnDepot(java.lang.String manifTypeMiseEnDepot) {
		this.manifTypeMiseEnDepot = manifTypeMiseEnDepot;
	}
	/**
	 * @return the manifCodeLieuStock
	 */
	public java.lang.String getManifCodeLieuStock() {
		return manifCodeLieuStock;
	}
	/**
	 * @param manifCodeLieuStock the manifCodeLieuStock to set
	 */
	public void setManifCodeLieuStock(java.lang.String manifCodeLieuStock) {
		this.manifCodeLieuStock = manifCodeLieuStock;
	}
	/**
	 * @return the manifNbreApurPhysique
	 */
	public java.lang.Integer getManifNbreApurPhysique() {
		return manifNbreApurPhysique;
	}
	/**
	 * @param manifNbreApurPhysique the manifNbreApurPhysique to set
	 */
	public void setManifNbreApurPhysique(java.lang.Integer manifNbreApurPhysique) {
		this.manifNbreApurPhysique = manifNbreApurPhysique;
	}
	/**
	 * @return the manifPdApurPhysique
	 */
	public java.math.BigDecimal getManifPdApurPhysique() {
		return manifPdApurPhysique;
	}
	/**
	 * @param manifPdApurPhysique the manifPdApurPhysique to set
	 */
	public void setManifPdApurPhysique(java.math.BigDecimal manifPdApurPhysique) {
		this.manifPdApurPhysique = manifPdApurPhysique;
	}
	/**
	 * @return the manifNbreApurCompta
	 */
	public java.lang.Integer getManifNbreApurCompta() {
		return manifNbreApurCompta;
	}
	/**
	 * @param manifNbreApurCompta the manifNbreApurCompta to set
	 */
	public void setManifNbreApurCompta(java.lang.Integer manifNbreApurCompta) {
		this.manifNbreApurCompta = manifNbreApurCompta;
	}
	/**
	 * @return the manifPdApurCompta
	 */
	public java.math.BigDecimal getManifPdApurCompta() {
		return manifPdApurCompta;
	}
	/**
	 * @param manifPdApurCompta the manifPdApurCompta to set
	 */
	public void setManifPdApurCompta(java.math.BigDecimal manifPdApurCompta) {
		this.manifPdApurCompta = manifPdApurCompta;
	}
	/**
	 * @return the manifNumTitreTransport
	 */
	public java.lang.String getManifNumTitreTransport() {
		return manifNumTitreTransport;
	}
	/**
	 * @param manifNumTitreTransport the manifNumTitreTransport to set
	 */
	public void setManifNumTitreTransport(java.lang.String manifNumTitreTransport) {
		this.manifNumTitreTransport = manifNumTitreTransport;
	}
	/**
	 * @return the manifPdMiseEnDepot
	 */
	public java.math.BigDecimal getManifPdMiseEnDepot() {
		return manifPdMiseEnDepot;
	}
	/**
	 * @param manifPdMiseEnDepot the manifPdMiseEnDepot to set
	 */
	public void setManifPdMiseEnDepot(java.math.BigDecimal manifPdMiseEnDepot) {
		this.manifPdMiseEnDepot = manifPdMiseEnDepot;
	}
	/**
	 * @return the manifNbreColisDepot
	 */
	public java.math.BigDecimal getManifNbreColisDepot() {
		return manifNbreColisDepot;
	}
	/**
	 * @param manifNbreColisDepot the manifNbreColisDepot to set
	 */
	public void setManifNbreColisDepot(java.math.BigDecimal manifNbreColisDepot) {
		this.manifNbreColisDepot = manifNbreColisDepot;
	}
	/**
	 * @return the manifCodeEmetteur
	 */
	public java.lang.String getManifCodeEmetteur() {
		return manifCodeEmetteur;
	}
	/**
	 * @param manifCodeEmetteur the manifCodeEmetteur to set
	 */
	public void setManifCodeEmetteur(java.lang.String manifCodeEmetteur) {
		this.manifCodeEmetteur = manifCodeEmetteur;
	}
	/**
	 * @return the manifUserValidation
	 */
	public java.lang.String getManifUserValidation() {
		return manifUserValidation;
	}
	/**
	 * @param manifUserValidation the manifUserValidation to set
	 */
	public void setManifUserValidation(java.lang.String manifUserValidation) {
		this.manifUserValidation = manifUserValidation;
	}
	/**
	 * @return the manifNumMessage
	 */
	public java.lang.Integer getManifNumMessage() {
		return manifNumMessage;
	}
	/**
	 * @param manifNumMessage the manifNumMessage to set
	 */
	public void setManifNumMessage(java.lang.Integer manifNumMessage) {
		this.manifNumMessage = manifNumMessage;
	}
	/**
	 * @return the manifDateDepotBrigade
	 */
	public java.lang.String getManifDateDepotBrigade() {
		return manifDateDepotBrigade;
	}
	/**
	 * @param manifDateDepotBrigade the manifDateDepotBrigade to set
	 */
	public void setManifDateDepotBrigade(java.lang.String manifDateDepotBrigade) {
		this.manifDateDepotBrigade = manifDateDepotBrigade;
	}
	/**
	 * @return the manifAgentBrigade
	 */
	public java.lang.String getManifAgentBrigade() {
		return manifAgentBrigade;
	}
	/**
	 * @param manifAgentBrigade the manifAgentBrigade to set
	 */
	public void setManifAgentBrigade(java.lang.String manifAgentBrigade) {
		this.manifAgentBrigade = manifAgentBrigade;
	}
	/**
	 * @return the manifAnneeDecl
	 */
	public java.lang.String getManifAnneeDecl() {
		return manifAnneeDecl;
	}
	/**
	 * @param manifAnneeDecl the manifAnneeDecl to set
	 */
	public void setManifAnneeDecl(java.lang.String manifAnneeDecl) {
		this.manifAnneeDecl = manifAnneeDecl;
	}
	/**
	 * @return the manifBurDecl
	 */
	public java.lang.String getManifBurDecl() {
		return manifBurDecl;
	}
	/**
	 * @param manifBurDecl the manifBurDecl to set
	 */
	public void setManifBurDecl(java.lang.String manifBurDecl) {
		this.manifBurDecl = manifBurDecl;
	}
	/**
	 * @return the manifNumDecl
	 */
	public java.lang.Integer getManifNumDecl() {
		return manifNumDecl;
	}
	/**
	 * @param manifNumDecl the manifNumDecl to set
	 */
	public void setManifNumDecl(java.lang.Integer manifNumDecl) {
		this.manifNumDecl = manifNumDecl;
	}


}
