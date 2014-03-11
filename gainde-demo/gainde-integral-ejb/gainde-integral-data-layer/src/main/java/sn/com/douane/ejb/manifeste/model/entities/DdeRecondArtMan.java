/**
 * CGPID
 */
package sn.com.douane.ejb.manifeste.model.entities;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Transient;

import sn.com.douane.ejb.manifeste.model.keys.DdeRecondArtManKey;

/**
 * @author CGPID
 *
 */
@Entity
@IdClass(DdeRecondArtManKey.class)
@NamedQueries({
	@NamedQuery(name = "findDdeRecondArtManOne", query = "select object(o) from DdeRecondArtMan o where  " +
			" o.manifAnneeEnregManif = ?1 and  o.manifBurEnregManif = ?2 and  o.manifNumEnregManif = ?3 and  " +
			" o.manifNumArtManif = ?4 and  o.manifPrecArtManif = ?5 "), 
			
	@NamedQuery(name = "findDdeRecondArtMan", query = "select object(o) from DdeRecondArtMan o where  " +
			" o.manifAnneeEnregManif = ?1 and  o.manifBurEnregManif = ?2 and  o.manifNumEnregManif = ?3 and  " +
			" o.manifNumArtManif = ?4 ")
		     })

@Table(name="DDERECONDARTMAN")
public class DdeRecondArtMan implements Serializable{
		
	private static final long serialVersionUID = -2354302396279165062L;

		@Id
	    @Column(name="MANIFANNEEENREGMANIF", length=4, nullable=false)
	    private java.lang.String manifAnneeEnregManif;
	    
	    @Id
	    @Column(name="MANIFBURENREGMANIF", nullable=false)
	    private java.lang.String manifBurEnregManif;
	    
	    @Id
	    @Column(name="MANIFNUMENREGMANIF", nullable=false)
	    private java.lang.Integer manifNumEnregManif;
	    
	    @Id
	    @Column(name="MANIFNUMARTMANIF", nullable=false)
	    private java.lang.Integer manifNumArtManif;
	    
	    @Id
	    @Column(name="MANIFPRECARTMANIF", nullable=false)
	    private java.lang.Integer manifPrecArtManif;
	    
	    @Id
	    @Column(name="MANIFPRECARTMANIF2", nullable=false)
	    private java.lang.Integer manifPrecArtManif2;
	    
	    @Column(name="MANIFADRESSEAORDREDE")
	    private java.lang.String manifAdresseAOrdreDe;
	    
	    @Column(name="MANIFAGENTCORRECT", length=5)
	    private java.lang.String manifAgentCorrect;
	    
	    @Column(name="MANIFANNEEDDE", length=4)
	    private java.lang.String manifAnneeDde;
	    
	    @Column(name="MANIFAORDREDE")
	    private java.lang.String manifAOrdreDe;
	    
	    @Column(name="MANIFAPUPHYSMANIF", columnDefinition="DECIMAL(9 , 0)")
	    private java.math.BigDecimal manifApuPhysManif;
	    
	    @Column(name="MANIFBPDEST", length=50)
	    private java.lang.String manifBpDest;
	    
	    @Column(name="MANIFCODEAORDREDE", length=5)
	    private java.lang.String manifCodeAOrdreDe;
	    
	    @Column(name="MANIFCODEATTACHECONT", length=1)
	    private java.lang.String manifCodeAttacheCont;
	    
	    @Column(name="MANIFCODECONSIGN", length=3)
	    private java.lang.String manifCodeConsign;
	    
	    @Column(name="MANIFCODEDEPO", length=4)
	    private java.lang.String manifCodeDepo;
	    
	    @Column(name="MANIFCODEDEST", length=5)
	    private java.lang.String manifCodeDest;
	    
	    @Column(name="MANIFCODEHD", length=1)
	    private java.lang.String manifCodeHd;
	    
	    @Column(name="MANIFCODELIEUEMB", length=5)
	    private java.lang.String manifCodeLieuEmb;
	    
	    @Column(name="MANIFCODEPDT", length=6)
	    private java.lang.String manifCodePdt;
	    
	    @Column(name="MANIFDATECREATION")
	    private java.sql.Date manifDateCreation;
	    
	    @Column(name="MANIFDATEEMB")
	    private java.sql.Date manifDateEmb;
	    
	    @Column(name="MANIFDATEMAJ")
	    private java.sql.Date manifDateMaj;
	    
	    @Column(name="MANIFDATEVALIDATION")
	    private java.sql.Date manifDateValidation;
	    
	    @Column(name="MANIFDESIGNCIALE")
	    private java.lang.String manifDesignCiale;
	    
	    @Column(name="MANIFDESTDEF", length=20)
	    private java.lang.String manifDestDef;
	    
	    @Column(name="MANIFETATARTMANIF", length=2)
	    private java.lang.String manifEtatArtManif;
	    
	    @Column(name="MANIFETATDDEMANIF", length=1)
	    private java.lang.String manifEtatDdeManif;
	    
	    @Column(name="MANIFINDPARTIEL", length=1)
	    private java.lang.String manifIndPartiel;
	    
	    @Column(name="MANIFINDVALIDATION", length=1)
	    private java.lang.String manifIndValidation;
	    
	    @Column(name="MANIFJULDATERECOND")
	    private java.sql.Date manifJulDateRecond;
	    
	    @Column(name="MANIFMARQCOLIS")
	    private java.lang.String manifMarqColis;
	    
	    @Column(name="MANIFMODECOND", length=4)
	    private java.lang.String manifModeCond;
	    
	    @Column(name="MANIFNBRECOLIS")
	    private java.lang.Integer manifNbreColis;
	    
	    @Column(name="MANIFNBRECOLISAPU")
	    private java.lang.Integer manifNbreColisApu;
	    
	    @Column(name="MANIFNBRECOLISDECL")
	    private java.lang.Integer manifNbreColisDecl;
	    
	    @Column(name="MANIFNBRECOLISECORE")
	    private java.lang.Integer manifNbreColisEcore;
	    
	    @Column(name="MANIFNBRECOLISRECT")
	    private java.lang.Integer manifNbreColisRect;
	    
	    @Column(name="MANIFNBRECONT")
	    private java.lang.Integer manifNbreCont;
	    
	    @Column(name="MANIFNINEADEST", length=18)
	    private java.lang.String manifNineaDest;
	    
	    @Column(name="MANIFNOMDEST")
	    private java.lang.String manifNomDest;
	    
	    @Column(name="MANIFNOMEXPED")
	    private java.lang.String manifNomExped;
	    
	    @Column(name="MANIFNOMVOIEDEST", length=60)
	    private java.lang.String manifNomVoieDest;
	    
	    @Column(name="MANIFNUMMSG", columnDefinition="DECIMAL(18 , 0)")
	    private java.math.BigDecimal manifNumMsg;
	    
	    @Id
	    @Column(name="MANIFNUMRECOND", nullable=false)
	    private java.lang.Integer manifNumRecond;
	    
	    @Id
	    @Column(name="MANIFNUMRECOND2", nullable=false)
	    private java.lang.Integer manifNumRecond2;
	    
	    @Column(name="MANIFNUMTITRETRANS", length=12)
	    private java.lang.String manifNumTitreTrans;
	    
	    @Column(name="MANIFNUMVOIEDEST", length=5)
	    private java.lang.String manifNumVoieDest;
	    
	    @Column(name="MANIFPOIDSBTCOQ",columnDefinition="DECIMAL(9 , 0)")
	    private java.math.BigDecimal manifPoidsBtCoq;
	    
	    @Column(name="MANIFPOIDSBTECORE", columnDefinition="DECIMAL(9 , 0)")
	    private java.math.BigDecimal manifPoidsBtEcore;
	    
	    @Column(name="MANIFPOIDSBTMANIF", columnDefinition="DECIMAL(9 , 0)")
	    private java.math.BigDecimal manifPoidsBtManif;
	    
	    @Column(name="MANIFPOIDSDECLMANIF", columnDefinition="DECIMAL(9 , 0)")
	    private java.math.BigDecimal manifPoidsDeclManif;
	    
	    @Column(name="MANIFPPMDEST", length=100)
	    private java.lang.String manifPpmDest;
	    
	    @Column(name="MANIFPRECSENEGAL", length=2)
	    private java.lang.String manifPrecSenegal;
	    
	    @Column(name="MANIFPRECUEMOA", length=2)
	    private java.lang.String manifPrecUemoa;
	    
	    @Column(name="MANIFQUARTIERDEST", length=50)
	    private java.lang.String manifQuartierDest;
	    
	    @Column(name="MANIFTYPEVOIEDEST", length=60)
	    private java.lang.String maniftypevoieDest;
	    
	    @Column(name="MANIFUSERRECTIF", length=7)
	    private java.lang.String manifUserRectif;
	    
	    @Column(name="MANIFVILLEDEF", length=50)
	    private java.lang.String manifVilleDef;
	    
	    @Column(name="MANIFVILLEDEST", length=50)
	    private java.lang.String manifVilleDest;
	    
	    @Column(name="MANIFVOLUME", columnDefinition="DECIMAL(9 , 0)")
	    private java.math.BigDecimal manifVolume;
	    
	    @Column(name="MANIFVOLUMEECORE", columnDefinition="DECIMAL(9 , 0)")
	    private java.math.BigDecimal manifVolumeEcore;
	    
	    @OneToMany(mappedBy = "ddeRecondArtMan", targetEntity = DdeRecondCont.class)
	    private List<DdeRecondCont> ddeRecondConts;
	    
	    @Transient
	    private String etatListeRecond;

		/**
		 * 
		 */
		public DdeRecondArtMan() {
			super();			
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
		 * @return the manifPrecArtManif2
		 */
		public java.lang.Integer getManifPrecArtManif2() {
			return manifPrecArtManif2;
		}

		/**
		 * @param manifPrecArtManif2 the manifPrecArtManif2 to set
		 */
		public void setManifPrecArtManif2(java.lang.Integer manifPrecArtManif2) {
			this.manifPrecArtManif2 = manifPrecArtManif2;
		}

		/**
		 * @return the manifAdresseAOrdreDe
		 */
		public java.lang.String getManifAdresseAOrdreDe() {
			return manifAdresseAOrdreDe;
		}

		/**
		 * @param manifAdresseAOrdreDe the manifAdresseAOrdreDe to set
		 */
		public void setManifAdresseAOrdreDe(java.lang.String manifAdresseAOrdreDe) {
			this.manifAdresseAOrdreDe = manifAdresseAOrdreDe;
		}

		/**
		 * @return the manifAgentCorrect
		 */
		public java.lang.String getManifAgentCorrect() {
			return manifAgentCorrect;
		}

		/**
		 * @param manifAgentCorrect the manifAgentCorrect to set
		 */
		public void setManifAgentCorrect(java.lang.String manifAgentCorrect) {
			this.manifAgentCorrect = manifAgentCorrect;
		}

		/**
		 * @return the manifAnneeDde
		 */
		public java.lang.String getManifAnneeDde() {
			return manifAnneeDde;
		}

		/**
		 * @param manifAnneeDde the manifAnneeDde to set
		 */
		public void setManifAnneeDde(java.lang.String manifAnneeDde) {
			this.manifAnneeDde = manifAnneeDde;
		}

		/**
		 * @return the manifAOrdreDe
		 */
		public java.lang.String getManifAOrdreDe() {
			return manifAOrdreDe;
		}

		/**
		 * @param manifAOrdreDe the manifAOrdreDe to set
		 */
		public void setManifAOrdreDe(java.lang.String manifAOrdreDe) {
			this.manifAOrdreDe = manifAOrdreDe;
		}

		/**
		 * @return the manifApuPhysManif
		 */
		public java.math.BigDecimal getManifApuPhysManif() {
			return manifApuPhysManif;
		}

		/**
		 * @param manifApuPhysManif the manifApuPhysManif to set
		 */
		public void setManifApuPhysManif(java.math.BigDecimal manifApuPhysManif) {
			this.manifApuPhysManif = manifApuPhysManif;
		}

		/**
		 * @return the manifBpDest
		 */
		public java.lang.String getManifBpDest() {
			return manifBpDest;
		}

		/**
		 * @param manifBpDest the manifBpDest to set
		 */
		public void setManifBpDest(java.lang.String manifBpDest) {
			this.manifBpDest = manifBpDest;
		}

		/**
		 * @return the manifCodeAOrdreDe
		 */
		public java.lang.String getManifCodeAOrdreDe() {
			return manifCodeAOrdreDe;
		}

		/**
		 * @param manifCodeAOrdreDe the manifCodeAOrdreDe to set
		 */
		public void setManifCodeAOrdreDe(java.lang.String manifCodeAOrdreDe) {
			this.manifCodeAOrdreDe = manifCodeAOrdreDe;
		}

		/**
		 * @return the manifCodeAttacheCont
		 */
		public java.lang.String getManifCodeAttacheCont() {
			return manifCodeAttacheCont;
		}

		/**
		 * @param manifCodeAttacheCont the manifCodeAttacheCont to set
		 */
		public void setManifCodeAttacheCont(java.lang.String manifCodeAttacheCont) {
			this.manifCodeAttacheCont = manifCodeAttacheCont;
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
		 * @return the manifCodeDepo
		 */
		public java.lang.String getManifCodeDepo() {
			return manifCodeDepo;
		}

		/**
		 * @param manifCodeDepo the manifCodeDepo to set
		 */
		public void setManifCodeDepo(java.lang.String manifCodeDepo) {
			this.manifCodeDepo = manifCodeDepo;
		}

		/**
		 * @return the manifCodeDest
		 */
		public java.lang.String getManifCodeDest() {
			return manifCodeDest;
		}

		/**
		 * @param manifCodeDest the manifCodeDest to set
		 */
		public void setManifCodeDest(java.lang.String manifCodeDest) {
			this.manifCodeDest = manifCodeDest;
		}

		/**
		 * @return the manifCodeHd
		 */
		public java.lang.String getManifCodeHd() {
			return manifCodeHd;
		}

		/**
		 * @param manifCodeHd the manifCodeHd to set
		 */
		public void setManifCodeHd(java.lang.String manifCodeHd) {
			this.manifCodeHd = manifCodeHd;
		}

		/**
		 * @return the manifCodeLieuEmb
		 */
		public java.lang.String getManifCodeLieuEmb() {
			return manifCodeLieuEmb;
		}

		/**
		 * @param manifCodeLieuEmb the manifCodeLieuEmb to set
		 */
		public void setManifCodeLieuEmb(java.lang.String manifCodeLieuEmb) {
			this.manifCodeLieuEmb = manifCodeLieuEmb;
		}

		/**
		 * @return the manifCodePdt
		 */
		public java.lang.String getManifCodePdt() {
			return manifCodePdt;
		}

		/**
		 * @param manifCodePdt the manifCodePdt to set
		 */
		public void setManifCodePdt(java.lang.String manifCodePdt) {
			this.manifCodePdt = manifCodePdt;
		}

		/**
		 * @return the manifDateCreation
		 */
		public java.sql.Date getManifDateCreation() {
			return manifDateCreation;
		}

		/**
		 * @param manifDateCreation the manifDateCreation to set
		 */
		public void setManifDateCreation(java.sql.Date manifDateCreation) {
			this.manifDateCreation = manifDateCreation;
		}

		/**
		 * @return the manifDateEmb
		 */
		public java.sql.Date getManifDateEmb() {
			return manifDateEmb;
		}

		/**
		 * @param manifDateEmb the manifDateEmb to set
		 */
		public void setManifDateEmb(java.sql.Date manifDateEmb) {
			this.manifDateEmb = manifDateEmb;
		}

		/**
		 * @return the manifDateMaj
		 */
		public java.sql.Date getManifDateMaj() {
			return manifDateMaj;
		}

		/**
		 * @param manifDateMaj the manifDateMaj to set
		 */
		public void setManifDateMaj(java.sql.Date manifDateMaj) {
			this.manifDateMaj = manifDateMaj;
		}

		/**
		 * @return the manifDateValidation
		 */
		public java.sql.Date getManifDateValidation() {
			return manifDateValidation;
		}

		/**
		 * @param manifDateValidation the manifDateValidation to set
		 */
		public void setManifDateValidation(java.sql.Date manifDateValidation) {
			this.manifDateValidation = manifDateValidation;
		}

		/**
		 * @return the manifDesignCiale
		 */
		public java.lang.String getManifDesignCiale() {
			return manifDesignCiale;
		}

		/**
		 * @param manifDesignCiale the manifDesignCiale to set
		 */
		public void setManifDesignCiale(java.lang.String manifDesignCiale) {
			this.manifDesignCiale = manifDesignCiale;
		}

		/**
		 * @return the manifDestDef
		 */
		public java.lang.String getManifDestDef() {
			return manifDestDef;
		}

		/**
		 * @param manifDestDef the manifDestDef to set
		 */
		public void setManifDestDef(java.lang.String manifDestDef) {
			this.manifDestDef = manifDestDef;
		}

		/**
		 * @return the manifEtatArtManif
		 */
		public java.lang.String getManifEtatArtManif() {
			return manifEtatArtManif;
		}

		/**
		 * @param manifEtatArtManif the manifEtatArtManif to set
		 */
		public void setManifEtatArtManif(java.lang.String manifEtatArtManif) {
			this.manifEtatArtManif = manifEtatArtManif;
		}

		/**
		 * @return the manifEtatDdeManif
		 */
		public java.lang.String getManifEtatDdeManif() {
			return manifEtatDdeManif;
		}

		/**
		 * @param manifEtatDdeManif the manifEtatDdeManif to set
		 */
		public void setManifEtatDdeManif(java.lang.String manifEtatDdeManif) {
			this.manifEtatDdeManif = manifEtatDdeManif;
		}

		/**
		 * @return the manifIndPartiel
		 */
		public java.lang.String getManifIndPartiel() {
			return manifIndPartiel;
		}

		/**
		 * @param manifIndPartiel the manifIndPartiel to set
		 */
		public void setManifIndPartiel(java.lang.String manifIndPartiel) {
			this.manifIndPartiel = manifIndPartiel;
		}

		/**
		 * @return the manifIndValidation
		 */
		public java.lang.String getManifIndValidation() {
			return manifIndValidation;
		}

		/**
		 * @param manifIndValidation the manifIndValidation to set
		 */
		public void setManifIndValidation(java.lang.String manifIndValidation) {
			this.manifIndValidation = manifIndValidation;
		}

		/**
		 * @return the manifJulDateRecond
		 */
		public java.sql.Date getManifJulDateRecond() {
			return manifJulDateRecond;
		}

		/**
		 * @param manifJulDateRecond the manifJulDateRecond to set
		 */
		public void setManifJulDateRecond(java.sql.Date manifJulDateRecond) {
			this.manifJulDateRecond = manifJulDateRecond;
		}

		/**
		 * @return the manifMarqColis
		 */
		public java.lang.String getManifMarqColis() {
			return manifMarqColis;
		}

		/**
		 * @param manifMarqColis the manifMarqColis to set
		 */
		public void setManifMarqColis(java.lang.String manifMarqColis) {
			this.manifMarqColis = manifMarqColis;
		}

		/**
		 * @return the manifModeCond
		 */
		public java.lang.String getManifModeCond() {
			return manifModeCond;
		}

		/**
		 * @param manifModeCond the manifModeCond to set
		 */
		public void setManifModeCond(java.lang.String manifModeCond) {
			this.manifModeCond = manifModeCond;
		}

		/**
		 * @return the manifNbreColis
		 */
		public java.lang.Integer getManifNbreColis() {
			return manifNbreColis;
		}

		/**
		 * @param manifNbreColis the manifNbreColis to set
		 */
		public void setManifNbreColis(java.lang.Integer manifNbreColis) {
			this.manifNbreColis = manifNbreColis;
		}

		/**
		 * @return the manifNbreColisApu
		 */
		public java.lang.Integer getManifNbreColisApu() {
			return manifNbreColisApu;
		}

		/**
		 * @param manifNbreColisApu the manifNbreColisApu to set
		 */
		public void setManifNbreColisApu(java.lang.Integer manifNbreColisApu) {
			this.manifNbreColisApu = manifNbreColisApu;
		}

		/**
		 * @return the manifNbreColisDecl
		 */
		public java.lang.Integer getManifNbreColisDecl() {
			return manifNbreColisDecl;
		}

		/**
		 * @param manifNbreColisDecl the manifNbreColisDecl to set
		 */
		public void setManifNbreColisDecl(java.lang.Integer manifNbreColisDecl) {
			this.manifNbreColisDecl = manifNbreColisDecl;
		}

		/**
		 * @return the manifNbreColisEcore
		 */
		public java.lang.Integer getManifNbreColisEcore() {
			return manifNbreColisEcore;
		}

		/**
		 * @param manifNbreColisEcore the manifNbreColisEcore to set
		 */
		public void setManifNbreColisEcore(java.lang.Integer manifNbreColisEcore) {
			this.manifNbreColisEcore = manifNbreColisEcore;
		}

		/**
		 * @return the manifNbreColisRect
		 */
		public java.lang.Integer getManifNbreColisRect() {
			return manifNbreColisRect;
		}

		/**
		 * @param manifNbreColisRect the manifNbreColisRect to set
		 */
		public void setManifNbreColisRect(java.lang.Integer manifNbreColisRect) {
			this.manifNbreColisRect = manifNbreColisRect;
		}

		/**
		 * @return the manifNbreCont
		 */
		public java.lang.Integer getManifNbreCont() {
			return manifNbreCont;
		}

		/**
		 * @param manifNbreCont the manifNbreCont to set
		 */
		public void setManifNbreCont(java.lang.Integer manifNbreCont) {
			this.manifNbreCont = manifNbreCont;
		}

		/**
		 * @return the manifNineaDest
		 */
		public java.lang.String getManifNineaDest() {
			return manifNineaDest;
		}

		/**
		 * @param manifNineaDest the manifNineaDest to set
		 */
		public void setManifNineaDest(java.lang.String manifNineaDest) {
			this.manifNineaDest = manifNineaDest;
		}

		/**
		 * @return the manifNomDest
		 */
		public java.lang.String getManifNomDest() {
			return manifNomDest;
		}

		/**
		 * @param manifNomDest the manifNomDest to set
		 */
		public void setManifNomDest(java.lang.String manifNomDest) {
			this.manifNomDest = manifNomDest;
		}

		/**
		 * @return the manifNomExped
		 */
		public java.lang.String getManifNomExped() {
			return manifNomExped;
		}

		/**
		 * @param manifNomExped the manifNomExped to set
		 */
		public void setManifNomExped(java.lang.String manifNomExped) {
			this.manifNomExped = manifNomExped;
		}

		/**
		 * @return the manifNomVoieDest
		 */
		public java.lang.String getManifNomVoieDest() {
			return manifNomVoieDest;
		}

		/**
		 * @param manifNomVoieDest the manifNomVoieDest to set
		 */
		public void setManifNomVoieDest(java.lang.String manifNomVoieDest) {
			this.manifNomVoieDest = manifNomVoieDest;
		}

		/**
		 * @return the manifNumMsg
		 */
		public java.math.BigDecimal getManifNumMsg() {
			return manifNumMsg;
		}

		/**
		 * @param manifNumMsg the manifNumMsg to set
		 */
		public void setManifNumMsg(java.math.BigDecimal manifNumMsg) {
			this.manifNumMsg = manifNumMsg;
		}

		/**
		 * @return the manifNumRecond
		 */
		public java.lang.Integer getManifNumRecond() {
			return manifNumRecond;
		}

		/**
		 * @param manifNumRecond the manifNumRecond to set
		 */
		public void setManifNumRecond(java.lang.Integer manifNumRecond) {
			this.manifNumRecond = manifNumRecond;
		}

		/**
		 * @return the manifNumRecond2
		 */
		public java.lang.Integer getManifNumRecond2() {
			return manifNumRecond2;
		}

		/**
		 * @param manifNumRecond2 the manifNumRecond2 to set
		 */
		public void setManifNumRecond2(java.lang.Integer manifNumRecond2) {
			this.manifNumRecond2 = manifNumRecond2;
		}

		/**
		 * @return the manifNumTitreTrans
		 */
		public java.lang.String getManifNumTitreTrans() {
			return manifNumTitreTrans;
		}

		/**
		 * @param manifNumTitreTrans the manifNumTitreTrans to set
		 */
		public void setManifNumTitreTrans(java.lang.String manifNumTitreTrans) {
			this.manifNumTitreTrans = manifNumTitreTrans;
		}

		/**
		 * @return the manifNumVoieDest
		 */
		public java.lang.String getManifNumVoieDest() {
			return manifNumVoieDest;
		}

		/**
		 * @param manifNumVoieDest the manifNumVoieDest to set
		 */
		public void setManifNumVoieDest(java.lang.String manifNumVoieDest) {
			this.manifNumVoieDest = manifNumVoieDest;
		}

		/**
		 * @return the manifPoidsBtCoq
		 */
		public java.math.BigDecimal getManifPoidsBtCoq() {
			return manifPoidsBtCoq;
		}

		/**
		 * @param manifPoidsBtCoq the manifPoidsBtCoq to set
		 */
		public void setManifPoidsBtCoq(java.math.BigDecimal manifPoidsBtCoq) {
			this.manifPoidsBtCoq = manifPoidsBtCoq;
		}

		/**
		 * @return the manifPoidsBtEcore
		 */
		public java.math.BigDecimal getManifPoidsBtEcore() {
			return manifPoidsBtEcore;
		}

		/**
		 * @param manifPoidsBtEcore the manifPoidsBtEcore to set
		 */
		public void setManifPoidsBtEcore(java.math.BigDecimal manifPoidsBtEcore) {
			this.manifPoidsBtEcore = manifPoidsBtEcore;
		}

		/**
		 * @return the manifPoidsBtManif
		 */
		public java.math.BigDecimal getManifPoidsBtManif() {
			return manifPoidsBtManif;
		}

		/**
		 * @param manifPoidsBtManif the manifPoidsBtManif to set
		 */
		public void setManifPoidsBtManif(java.math.BigDecimal manifPoidsBtManif) {
			this.manifPoidsBtManif = manifPoidsBtManif;
		}

		/**
		 * @return the manifPoidsDeclManif
		 */
		public java.math.BigDecimal getManifPoidsDeclManif() {
			return manifPoidsDeclManif;
		}

		/**
		 * @param manifPoidsDeclManif the manifPoidsDeclManif to set
		 */
		public void setManifPoidsDeclManif(java.math.BigDecimal manifPoidsDeclManif) {
			this.manifPoidsDeclManif = manifPoidsDeclManif;
		}

		/**
		 * @return the manifPpmDest
		 */
		public java.lang.String getManifPpmDest() {
			return manifPpmDest;
		}

		/**
		 * @param manifPpmDest the manifPpmDest to set
		 */
		public void setManifPpmDest(java.lang.String manifPpmDest) {
			this.manifPpmDest = manifPpmDest;
		}

		/**
		 * @return the manifPrecSenegal
		 */
		public java.lang.String getManifPrecSenegal() {
			return manifPrecSenegal;
		}

		/**
		 * @param manifPrecSenegal the manifPrecSenegal to set
		 */
		public void setManifPrecSenegal(java.lang.String manifPrecSenegal) {
			this.manifPrecSenegal = manifPrecSenegal;
		}

		/**
		 * @return the manifPrecUemoa
		 */
		public java.lang.String getManifPrecUemoa() {
			return manifPrecUemoa;
		}

		/**
		 * @param manifPrecUemoa the manifPrecUemoa to set
		 */
		public void setManifPrecUemoa(java.lang.String manifPrecUemoa) {
			this.manifPrecUemoa = manifPrecUemoa;
		}

		/**
		 * @return the manifQuartierDest
		 */
		public java.lang.String getManifQuartierDest() {
			return manifQuartierDest;
		}

		/**
		 * @param manifQuartierDest the manifQuartierDest to set
		 */
		public void setManifQuartierDest(java.lang.String manifQuartierDest) {
			this.manifQuartierDest = manifQuartierDest;
		}

		/**
		 * @return the maniftypevoieDest
		 */
		public java.lang.String getManiftypevoieDest() {
			return maniftypevoieDest;
		}

		/**
		 * @param maniftypevoieDest the maniftypevoieDest to set
		 */
		public void setManiftypevoieDest(java.lang.String maniftypevoieDest) {
			this.maniftypevoieDest = maniftypevoieDest;
		}

		/**
		 * @return the manifUserRectif
		 */
		public java.lang.String getManifUserRectif() {
			return manifUserRectif;
		}

		/**
		 * @param manifUserRectif the manifUserRectif to set
		 */
		public void setManifUserRectif(java.lang.String manifUserRectif) {
			this.manifUserRectif = manifUserRectif;
		}

		/**
		 * @return the manifVilleDef
		 */
		public java.lang.String getManifVilleDef() {
			return manifVilleDef;
		}

		/**
		 * @param manifVilleDef the manifVilleDef to set
		 */
		public void setManifVilleDef(java.lang.String manifVilleDef) {
			this.manifVilleDef = manifVilleDef;
		}

		/**
		 * @return the manifVilleDest
		 */
		public java.lang.String getManifVilleDest() {
			return manifVilleDest;
		}

		/**
		 * @param manifVilleDest the manifVilleDest to set
		 */
		public void setManifVilleDest(java.lang.String manifVilleDest) {
			this.manifVilleDest = manifVilleDest;
		}

		/**
		 * @return the manifVolume
		 */
		public java.math.BigDecimal getManifVolume() {
			return manifVolume;
		}

		/**
		 * @param manifVolume the manifVolume to set
		 */
		public void setManifVolume(java.math.BigDecimal manifVolume) {
			this.manifVolume = manifVolume;
		}

		/**
		 * @return the manifVolumeEcore
		 */
		public java.math.BigDecimal getManifVolumeEcore() {
			return manifVolumeEcore;
		}

		/**
		 * @param manifVolumeEcore the manifVolumeEcore to set
		 */
		public void setManifVolumeEcore(java.math.BigDecimal manifVolumeEcore) {
			this.manifVolumeEcore = manifVolumeEcore;
		}

		/**
		 * @return the ddeRecondConts
		 */
		public List<DdeRecondCont> getDdeRecondConts() {
			return ddeRecondConts;
		}

		/**
		 * @param ddeRecondConts the ddeRecondConts to set
		 */
		public void setDdeRecondConts(List<DdeRecondCont> ddeRecondConts) {
			this.ddeRecondConts = ddeRecondConts;
		}

		public String getEtatListeRecond() {
			return etatListeRecond;
		}

		public void setEtatListeRecond(String etatListeRecond) {
			this.etatListeRecond = etatListeRecond;
		}

		
	    
	    

}
