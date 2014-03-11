package sn.com.douane.ejb.declaration.model.entities;

import java.io.Serializable;
import java.math.BigDecimal;
import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

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
import javax.persistence.OneToMany;
import javax.persistence.Table;

import sn.com.douane.ejb.declaration.model.keys.BrouillonSegGenDecKey;
import sn.com.douane.ejb.rc.model.entities.BureauDouane;
import sn.com.douane.ejb.rc.model.entities.BureauUemoa;
import sn.com.douane.ejb.rc.model.entities.Creditaire;
import sn.com.douane.ejb.rc.model.entities.ModeDeclaration;
import sn.com.douane.ejb.rc.model.entities.ModeTransport;
import sn.com.douane.ejb.rc.model.entities.Pays;
import sn.com.douane.ejb.rc.model.entities.Ppm;
import sn.com.douane.ejb.rc.model.entities.RegimeDouanier;
import sn.com.douane.ejb.rc.model.entities.TypeApurement;

/**
 * @author thouraya Bean implementation class for Enterprise Bean:
 *         Brouillonseggendec
 */

@Entity()
@IdClass(BrouillonSegGenDecKey.class)
@Table(name = "BROUILLONSEGGENDEC")
@NamedQueries(@NamedQuery(name = "BrouillonSegGenDec.findAll", query ="select object(o) from BrouillonSegGenDec o where o.decAnneeDecl = ?1 and o.decCodePpmDeclarant = ?2 order by o.decDateCreation DESC"))
public class BrouillonSegGenDec implements Serializable {

	private static final long serialVersionUID = 3226679107987748949L;

	@Id
	@Column(name = "DECANNEEDECL", length = 4, nullable = false)
	private String decAnneeDecl;

	@Id
	@Column(name = "DECCODEPPMDECLARANT", length = 5, nullable = false)
	private String decCodePpmDeclarant;

	@Id
	@Column(name = "DECNUMREPERTOIRE", length = 6, nullable = false)
	private String decNumRepertoire;

	@Column(name = "DECANNEEARTREFERENCE", length = 4)
	private String decaAnneeArtReference;

	@Column(name = "DECANNEEDEPPROVISOIRE", length = 4)
	private String decAnneeDepProvisoire;

	@Column(name = "DECANNEEDOCJOINT", length = 4)
	private String decAnneeDocJoint;

	@Column(name = "DECANNEEENREGMANIF", length = 4)
	private String decAnneeEnregManif;

	@Column(name = "DECANNEEREGECONO", length = 4)
	private String decAnneeRegEcono;

	@Column(name = "DECBPDECLARANT", length = 5)
	private String decBpDeclarant;

	@Column(name = "DECBPDESTINATAIRE", length = 50)
	private String decBpDestinataire;

	@Column(name = "DECBURDEPPROVISOIRE", length = 3)
	private String decBurDepProvisoire;

	@Column(name = "DECBURDESTUEMOA", length = 4)
	private String decBurDestUemoa;

	@Column(name = "DECBURDESTSENE", length = 3)
	private String decBurDestSene;

	@Column(name = "DECBURENREGMANIF", length = 3)
	private String decBurEnregManif;

	@Column(name = "DECBURFRONTIERE", length = 3)
	private String decBurFrontiere;

	@Column(name = "DECCODEAGREE", length = 3)
	private String decCodeAgree;

	@Column(name = "DECCODEBUREAU", length = 3)
	private String decCodeBureau;

	@Column(name = "DECCODECONTRIBDEST", length = 7)
	private String decCodeContribDest;

	@Column(name = "DECCODECREDITAIRE", length = 3)
	private String decCodeCreditaire;

	@Column(name = "DECCODEDESTINATAIRE", length = 5)
	private String decCodeDestinataire;

	@Column(name = "DECCODELIEUSTOCKAGE", length = 3)
	private String decCodeLieuStockage;

	@Column(name = "DECCODEPARTIEL", length = 1)
	private String decCodePartiel;

	@Column(name = "DECCODEPAYSPROVENANCE", length = 3)
	private String decCodePaysProvenance;

	@Column(name = "DECCODETRANSPORT", length = 4)
	private String decCodeTransport;

	@Column(name = "DECDATEDEVIS")
	private Date decDateDevis;

	@Column(name = "DECDATEDOCDEST")
	private Date decDateDocDest;

	@Column(name = "DECDATEMODIFICATION")
	private Date decDateModification;

	@Column(name = "DECDATEREPERTOIRE")
	private Date decDateRepertoire;

	@Column(name = "DECDELAIROUTETRANSIT")
	private Integer decDelaiRouteTransit;

	@Column(name = "DECDOSSIER", length = 4)
	private String decDossier;

	@Column(name = "DECHEUREDEVIS", length = 15)
	private String decHeureDevis;

	@Column(name = "DECHEUREMODIFICATION", length = 15)
	private String decHeureModification;

	@Column(name = "DECIMMAVEHICULE", length = 10)
	private String decImmaVehicule;

	@Column(name = "DECMCFAASSURANCE", columnDefinition = "DECIMAL(11,0)")
	private BigDecimal decMcfaAssurance;

	@Column(name = "DECMCFAELEMENTS", columnDefinition = "DECIMAL(11,0)")
	private BigDecimal decMcfaElements;

	@Column(name = "DECMODEDECLARATION", length = 4)
	private String decModeDeclaration;

	@Column(name = "DECMODETRANSPORT", length = 2)
	private String decModeTransport;

	@Column(name = "DECMONTDIFFCOSEC", columnDefinition = "DECIMAL(4,0)")
	private BigDecimal decMontDiffCosec;

	@Column(name = "DECMONTCFAFACTURE", columnDefinition = "DECIMAL(11,0)")
	private BigDecimal decMontCfaFacture;

	@Column(name = "DECMONTCFAFRET", columnDefinition = "DECIMAL(11,0)")
	private BigDecimal decMontCfaFret;

	@Column(name = "DECMOYENTRANSPORT", length = 255)
	private String decMoyenTransport;

	@Column(name = "DECMTDROITCOMMDEC", columnDefinition = "DECIMAL(18,0)")
	private BigDecimal decMtDroitCommDec;

	@Column(name = "DECNBREARTICLES")
	private Integer decNbreArticles;

	@Column(name = "DECNOMDECLARANT", length = 255)
	private String decnomdeclarant;

	@Column(name = "DECNOMDESTINATAIRE", length = 255)
	private String decNomDestinataire;

	@Column(name = "DECNOMVOIEDECLARANT", length = 60)
	private String decNomVoieDeclarant;

	@Column(name = "DECNOMVOIEDESTINATAIRE", length = 60)
	private String decNomVoieDestinataire;

	@Column(name = "DECNUMCODECONTRIBUABLE", length = 7)
	private String decNumCodeContribuable;

	@Column(name = "DECNUMDEVARCHARGEDEST", length = 7)
	private String decNumDevArChargeDest;

	@Column(name = "DECNUMDEPPROVISOIRE")
	private Integer decNumDepProvisoire;

	@Column(name = "DECNUMDOCJOINT", length = 4)
	private String decNumDocJoint;

	@Column(name = "DECNUMENREGMANIF")
	private Integer decNumEnregManif;

	@Column(name = "DECNUMREGECONOMIQUE", length = 6)
	private String decNumRegEconomique;

	@Column(name = "DECNUMGAMME")
	private Integer decNumGamme;

	@Column(name = "DECNUMIMPORTEXPORT", length = 10)
	private String decNumImportExport;

	@Column(name = "DECNUMREGECONO", length = 6)
	private String decNumRegecono;

	@Column(name = "DECNUMREGIMEPREF", length = 5)
	private String decNumRegimePref;

	@Column(name = "DECNUMVOIEDECLARANT", length = 5)
	private String decNumVoieDeclarant;

	@Column(name = "DECNUMVOIEDESTINATAIRE", length = 5)
	private String decNumVoieDestinataire;

	@Column(name = "DECPAYSDESTDEFINITIVE", length = 3)
	private String decPaysDestDefinitive;

	@Column(name = "DECPAYSDESTINATION", length = 3)
	private String decPaysDestination;

	@Column(name = "DECQUARTIERDECLARANT", length = 50)
	private String decQuartierDeclarant;

	@Column(name = "DECQUARTIERDESTINATAIRE", length = 50)
	private String decQuartierDestinataire;

	@Column(name = "DECREFDECLARATION", length = 30)
	private String decRefDeclaration;

	@Column(name = "DECREGIMEDESTINATION", length = 4)
	private String decRegimeDestination;

	@Column(name = "DECREGIMEDOUANIER", length = 1)
	private String decRegimeDouanier;

	@Column(name = "DECTITREDECLARANT", length = 3)
	private String decTitreDeclarant;

	@Column(name = "DECTITREDESTINATAIRE", length = 3)
	private String decTitreDestinataire;

	@Column(name = "DECTOTDEVISDECLARATION", columnDefinition = "DECIMAL(18,0)")
	private BigDecimal decTotDevisDeclaration;

	@Column(name = "DECTYPEAPUREMENT", length = 1)
	private String decTypeApurement;

	@Column(name = "DECTYPEMANIFESTE", length = 1)
	private String decTypeManifeste;

	@Column(name = "DECTYPEREGIME", length = 1)
	private String decTypeRegime;

	@Column(name = "DECTYPEVOIEDECLARANT", length = 25)
	private String decTypeVoieDeclarant;

	@Column(name = "DECTYPEVOIEDESTINATAIRE", length = 25)
	private String decTypeVoieDestinataire;

	@Column(name = "DECVILLEDECLARANT", length = 50)
	private String decVilleDeclarant;

	@Column(name = "DECVILLEDESTINATAIRE", length = 50)
	private String decVilleDestinataire;

	@Column(name = "DECDATECREATION")
	private Date decDateCreation;

	@Column(name = "DECNINEADESTINATAIRE", length = 11)
	private String decNineaDestinataire;

	@Column(name = "DECPPMEXPEDITEUR", length = 5)
	private String decPpmExpediteur;

	@Column(name = "DECDERNIERARTICLE")
	private Integer decDernierArticle;

	@ManyToOne(targetEntity = BureauDouane.class, fetch = FetchType.LAZY)
	@JoinColumn(name = "DECBURDEPPROVISOIRE", insertable = false, updatable = false)
	private BureauDouane bureauProvisoire;

	@ManyToOne(targetEntity = BureauDouane.class, fetch = FetchType.LAZY)
	@JoinColumn(name = "DECBURDESTSENE", insertable = false, updatable = false)
	private BureauDouane bureauDestSen;

	@ManyToOne(targetEntity = BureauDouane.class, fetch = FetchType.LAZY)
	@JoinColumn(name = "DECBURFRONTIERE", insertable = false, updatable = false)
	private BureauDouane bureauFrontiere;

	@ManyToOne(targetEntity = BureauDouane.class, fetch = FetchType.LAZY)
	@JoinColumn(name = "DECBURENREGMANIF", insertable = false, updatable = false)
	private BureauDouane bureauEnregManif;

	@ManyToOne(targetEntity = BureauDouane.class, fetch = FetchType.LAZY)
	@JoinColumn(name = "DECCODEBUREAU", insertable = false, updatable = false)
	private BureauDouane bureau;

	@ManyToOne(targetEntity = BureauUemoa.class, fetch = FetchType.LAZY)
	@JoinColumn(name = "DECBURDESTUEMOA", insertable = false, updatable = false)
	private BureauUemoa bureauMoa;

	@ManyToOne(targetEntity = Creditaire.class, fetch = FetchType.LAZY)
	@JoinColumn(name = "DECCODECREDITAIRE", insertable = false, updatable = false)
	private Creditaire creditaire;

	@ManyToOne(targetEntity = ModeDeclaration.class, fetch = FetchType.LAZY)
	@JoinColumn(name = "DECMODEDECLARATION", insertable = false, updatable = false)
	private ModeDeclaration modeDeclaration;

	@ManyToOne(targetEntity = ModeTransport.class, fetch = FetchType.LAZY)
	@JoinColumn(name = "DECMODETRANSPORT", insertable = false, updatable = false)
	private ModeTransport modeTransport;

	@ManyToOne(targetEntity = Pays.class, fetch = FetchType.LAZY)
	@JoinColumn(name = "DECPAYSDESTINATION", insertable = false, updatable = false)
	private Pays paysDestination;

	@ManyToOne(targetEntity = Pays.class, fetch = FetchType.LAZY)
	@JoinColumn(name = "DECPAYSDESTDEFINITIVE", insertable = false, updatable = false)
	private Pays paysDestinationFinal;

	@ManyToOne(targetEntity = Pays.class, fetch = FetchType.LAZY)
	@JoinColumn(name = "DECCODEPAYSPROVENANCE", insertable = false, updatable = false)
	private Pays paysProvenance;

	@ManyToOne(targetEntity = Ppm.class, fetch = FetchType.LAZY)
	@JoinColumn(name = "DECCODEPPMDECLARANT", insertable = false, updatable = false)
	private Ppm ppmDeclarant;

	@ManyToOne(targetEntity = Ppm.class, fetch = FetchType.LAZY)
	@JoinColumn(name = "DECPPMEXPEDITEUR", insertable = false, updatable = false)
	private Ppm ppmExpediteur;

	@ManyToOne(targetEntity = TypeApurement.class, fetch = FetchType.LAZY)
	@JoinColumn(name = "DECTYPEAPUREMENT", insertable = false, updatable = false)
	private TypeApurement typeApurement;

	@ManyToOne(targetEntity = RegimeDouanier.class, fetch = FetchType.LAZY)
	@JoinColumns({
			@JoinColumn(name = "DECTYPEREGIME", referencedColumnName = "RCTYPEREGIME", updatable = false, insertable = false),
			@JoinColumn(name = "DECREGIMEDOUANIER", referencedColumnName = "RCCODEREGIMEDOUANIER", updatable = false, insertable = false) })
	private RegimeDouanier regimeDouanier;	

	@OneToMany(mappedBy = "brouillonSegGenDec", targetEntity = BrouillonArtDec.class, fetch = FetchType.LAZY)
	private List<BrouillonArtDec> brouillonArtDec = new ArrayList<BrouillonArtDec>();

	
	 @OneToMany(mappedBy = "brouillonSegGenDec", targetEntity = BrComplementTaxes.class, fetch = FetchType.LAZY)
	 private List<BrComplementTaxes> brcomplementtaxes;

	public BrouillonSegGenDec(String decAnneeDecl, String decCodePpmDeclarant,
			String decNumRepertoire) {
		this.decAnneeDecl = decAnneeDecl;
		this.decCodePpmDeclarant = decCodePpmDeclarant;
		this.decNumRepertoire = decNumRepertoire;
	}

	public BrouillonSegGenDec() {
	}

	public String getDecAnneeDecl() {
		return decAnneeDecl;
	}

	public void setDecAnneeDecl(String decAnneeDecl) {
		this.decAnneeDecl = decAnneeDecl;
	}

	public String getDecCodePpmDeclarant() {
		return decCodePpmDeclarant;
	}

	public void setDecCodePpmDeclarant(String decCodePpmDeclarant) {
		this.decCodePpmDeclarant = decCodePpmDeclarant;
	}

	public String getDecNumRepertoire() {
		return decNumRepertoire;
	}

	public void setDecNumRepertoire(String decNumRepertoire) {
		this.decNumRepertoire = decNumRepertoire;
	}

	public String getDecaAnneeArtReference() {
		return decaAnneeArtReference;
	}

	public void setDecaAnneeArtReference(String decaAnneeArtReference) {
		this.decaAnneeArtReference = decaAnneeArtReference;
	}

	public String getDecAnneeDepProvisoire() {
		return decAnneeDepProvisoire;
	}

	public void setDecAnneeDepProvisoire(String decAnneeDepProvisoire) {
		this.decAnneeDepProvisoire = decAnneeDepProvisoire;
	}

	public String getDecAnneeDocJoint() {
		return decAnneeDocJoint;
	}

	public void setDecAnneeDocJoint(String decAnneeDocJoint) {
		this.decAnneeDocJoint = decAnneeDocJoint;
	}

	public String getDecAnneeEnregManif() {
		return decAnneeEnregManif;
	}

	public void setDecAnneeEnregManif(String decAnneeEnregManif) {
		this.decAnneeEnregManif = decAnneeEnregManif;
	}

	public String getDecAnneeRegEcono() {
		return decAnneeRegEcono;
	}

	public void setDecAnneeRegEcono(String decAnneeRegEcono) {
		this.decAnneeRegEcono = decAnneeRegEcono;
	}

	public String getDecBpDeclarant() {
		return decBpDeclarant;
	}

	public void setDecBpDeclarant(String decBpDeclarant) {
		this.decBpDeclarant = decBpDeclarant;
	}

	public String getDecBpDestinataire() {
		return decBpDestinataire;
	}

	public void setDecBpDestinataire(String decBpDestinataire) {
		this.decBpDestinataire = decBpDestinataire;
	}

	public String getDecBurDepProvisoire() {
		return decBurDepProvisoire;
	}

	public void setDecBurDepProvisoire(String decBurDepProvisoire) {
		this.decBurDepProvisoire = decBurDepProvisoire;
	}

	public String getDecBurDestUemoa() {
		return decBurDestUemoa;
	}

	public void setDecBurDestUemoa(String decBurDestUemoa) {
		this.decBurDestUemoa = decBurDestUemoa;
	}

	public String getDecBurDestSene() {
		return decBurDestSene;
	}

	public void setDecBurDestSene(String decBurDestSene) {
		this.decBurDestSene = decBurDestSene;
	}

	public String getDecBurEnregManif() {
		return decBurEnregManif;
	}

	public void setDecBurEnregManif(String decBurEnregManif) {
		this.decBurEnregManif = decBurEnregManif;
	}

	public String getDecBurFrontiere() {
		return decBurFrontiere;
	}

	public void setDecBurFrontiere(String decBurFrontiere) {
		this.decBurFrontiere = decBurFrontiere;
	}

	public String getDecCodeAgree() {
		return decCodeAgree;
	}

	public void setDecCodeAgree(String decCodeAgree) {
		this.decCodeAgree = decCodeAgree;
	}

	public String getDecCodeBureau() {
		return decCodeBureau;
	}

	public void setDecCodeBureau(String decCodeBureau) {
		this.decCodeBureau = decCodeBureau;
	}

	public String getDecCodeContribDest() {
		return decCodeContribDest;
	}

	public void setDecCodeContribDest(String decCodeContribDest) {
		this.decCodeContribDest = decCodeContribDest;
	}

	public String getDecCodeCreditaire() {
		return decCodeCreditaire;
	}

	public void setDecCodeCreditaire(String decCodeCreditaire) {
		this.decCodeCreditaire = decCodeCreditaire;
	}

	public String getDecCodeDestinataire() {
		return decCodeDestinataire;
	}

	public void setDecCodeDestinataire(String decCodeDestinataire) {
		this.decCodeDestinataire = decCodeDestinataire;
	}

	public String getDecCodeLieuStockage() {
		return decCodeLieuStockage;
	}

	public void setDecCodeLieuStockage(String decCodeLieuStockage) {
		this.decCodeLieuStockage = decCodeLieuStockage;
	}

	public String getDecCodePartiel() {
		return decCodePartiel;
	}

	public void setDecCodePartiel(String decCodePartiel) {
		this.decCodePartiel = decCodePartiel;
	}

	public String getDecCodePaysProvenance() {
		return decCodePaysProvenance;
	}

	public void setDecCodePaysProvenance(String decCodePaysProvenance) {
		this.decCodePaysProvenance = decCodePaysProvenance;
	}

	public String getDecCodeTransport() {
		return decCodeTransport;
	}

	public void setDecCodeTransport(String decCodeTransport) {
		this.decCodeTransport = decCodeTransport;
	}

	public Date getDecDateDevis() {
		return decDateDevis;
	}

	public void setDecDateDevis(Date decDateDevis) {
		this.decDateDevis = decDateDevis;
	}

	public Date getDecDateDocDest() {
		return decDateDocDest;
	}

	public void setDecDateDocDest(Date decDateDocDest) {
		this.decDateDocDest = decDateDocDest;
	}

	public Date getDecDateModification() {
		return decDateModification;
	}

	public void setDecDateModification(Date decDateModification) {
		this.decDateModification = decDateModification;
	}

	public Date getDecDateRepertoire() {
		return decDateRepertoire;
	}

	public void setDecDateRepertoire(Date decDateRepertoire) {
		this.decDateRepertoire = decDateRepertoire;
	}

	public Integer getDecDelaiRouteTransit() {
		return decDelaiRouteTransit;
	}

	public void setDecDelaiRouteTransit(Integer decDelaiRouteTransit) {
		this.decDelaiRouteTransit = decDelaiRouteTransit;
	}

	public String getDecDossier() {
		return decDossier;
	}

	public void setDecDossier(String decDossier) {
		this.decDossier = decDossier;
	}

	public String getDecHeureDevis() {
		return decHeureDevis;
	}

	public void setDecHeureDevis(String decHeureDevis) {
		this.decHeureDevis = decHeureDevis;
	}

	public String getDecHeureModification() {
		return decHeureModification;
	}

	public void setDecHeureModification(String decHeureModification) {
		this.decHeureModification = decHeureModification;
	}

	public String getDecImmaVehicule() {
		return decImmaVehicule;
	}

	public void setDecImmaVehicule(String decImmaVehicule) {
		this.decImmaVehicule = decImmaVehicule;
	}

	public BigDecimal getDecMcfaAssurance() {
		return decMcfaAssurance;
	}

	public void setDecMcfaAssurance(BigDecimal decMcfaAssurance) {
		this.decMcfaAssurance = decMcfaAssurance;
	}

	public BigDecimal getDecMcfaElements() {
		return decMcfaElements;
	}

	public void setDecMcfaElements(BigDecimal decMcfaElements) {
		this.decMcfaElements = decMcfaElements;
	}

	public String getDecModeDeclaration() {
		return decModeDeclaration;
	}

	public void setDecModeDeclaration(String decModeDeclaration) {
		this.decModeDeclaration = decModeDeclaration;
	}

	public String getDecModeTransport() {
		return decModeTransport;
	}

	public void setDecModeTransport(String decModeTransport) {
		this.decModeTransport = decModeTransport;
	}

	public BigDecimal getDecMontDiffCosec() {
		return decMontDiffCosec;
	}

	public void setDecMontDiffCosec(BigDecimal decMontDiffCosec) {
		this.decMontDiffCosec = decMontDiffCosec;
	}

	public BigDecimal getDecMontCfaFacture() {
		return decMontCfaFacture;
	}

	public void setDecMontCfaFacture(BigDecimal decMontCfaFacture) {
		this.decMontCfaFacture = decMontCfaFacture;
	}

	public BigDecimal getDecMontCfaFret() {
		return decMontCfaFret;
	}

	public void setDecMontCfaFret(BigDecimal decMontCfaFret) {
		this.decMontCfaFret = decMontCfaFret;
	}

	public String getDecMoyenTransport() {
		return decMoyenTransport;
	}

	public void setDecMoyenTransport(String decMoyenTransport) {
		this.decMoyenTransport = decMoyenTransport;
	}

	public BigDecimal getDecMtDroitCommDec() {
		return decMtDroitCommDec;
	}

	public void setDecMtDroitCommDec(BigDecimal decMtDroitCommDec) {
		this.decMtDroitCommDec = decMtDroitCommDec;
	}

	public Integer getDecNbreArticles() {
		return decNbreArticles;
	}

	public void setDecNbreArticles(Integer decNbreArticles) {
		this.decNbreArticles = decNbreArticles;
	}

	public String getDecnomdeclarant() {
		return decnomdeclarant;
	}

	public void setDecnomdeclarant(String decnomdeclarant) {
		this.decnomdeclarant = decnomdeclarant;
	}

	public String getDecNomDestinataire() {
		return decNomDestinataire;
	}

	public void setDecNomDestinataire(String decNomDestinataire) {
		this.decNomDestinataire = decNomDestinataire;
	}

	public String getDecNomVoieDeclarant() {
		return decNomVoieDeclarant;
	}

	public void setDecNomVoieDeclarant(String decNomVoieDeclarant) {
		this.decNomVoieDeclarant = decNomVoieDeclarant;
	}

	public String getDecNomVoieDestinataire() {
		return decNomVoieDestinataire;
	}

	public void setDecNomVoieDestinataire(String decNomVoieDestinataire) {
		this.decNomVoieDestinataire = decNomVoieDestinataire;
	}

	public String getDecNumCodeContribuable() {
		return decNumCodeContribuable;
	}

	public void setDecNumCodeContribuable(String decNumCodeContribuable) {
		this.decNumCodeContribuable = decNumCodeContribuable;
	}

	public String getDecNumDevArChargeDest() {
		return decNumDevArChargeDest;
	}

	public void setDecNumDevArChargeDest(String decNumDevArChargeDest) {
		this.decNumDevArChargeDest = decNumDevArChargeDest;
	}

	public Integer getDecNumDepProvisoire() {
		return decNumDepProvisoire;
	}

	public void setDecNumDepProvisoire(Integer decNumDepProvisoire) {
		this.decNumDepProvisoire = decNumDepProvisoire;
	}

	public String getDecNumDocJoint() {
		return decNumDocJoint;
	}

	public void setDecNumDocJoint(String decNumDocJoint) {
		this.decNumDocJoint = decNumDocJoint;
	}

	public Integer getDecNumEnregManif() {
		return decNumEnregManif;
	}

	public void setDecNumEnregManif(Integer decNumEnregManif) {
		this.decNumEnregManif = decNumEnregManif;
	}

	public String getDecNumRegEconomique() {
		return decNumRegEconomique;
	}

	public void setDecNumRegEconomique(String decNumRegEconomique) {
		this.decNumRegEconomique = decNumRegEconomique;
	}

	public Integer getDecNumGamme() {
		return decNumGamme;
	}

	public void setDecNumGamme(Integer decNumGamme) {
		this.decNumGamme = decNumGamme;
	}

	public String getDecNumImportExport() {
		return decNumImportExport;
	}

	public void setDecNumImportExport(String decNumImportExport) {
		this.decNumImportExport = decNumImportExport;
	}

	public String getDecNumRegecono() {
		return decNumRegecono;
	}

	public void setDecNumRegecono(String decNumRegecono) {
		this.decNumRegecono = decNumRegecono;
	}

	public String getDecNumRegimePref() {
		return decNumRegimePref;
	}

	public void setDecNumRegimePref(String decNumRegimePref) {
		this.decNumRegimePref = decNumRegimePref;
	}

	public String getDecNumVoieDeclarant() {
		return decNumVoieDeclarant;
	}

	public void setDecNumVoieDeclarant(String decNumVoieDeclarant) {
		this.decNumVoieDeclarant = decNumVoieDeclarant;
	}

	public String getDecNumVoieDestinataire() {
		return decNumVoieDestinataire;
	}

	public void setDecNumVoieDestinataire(String decNumVoieDestinataire) {
		this.decNumVoieDestinataire = decNumVoieDestinataire;
	}

	public String getDecPaysDestDefinitive() {
		return decPaysDestDefinitive;
	}

	public void setDecPaysDestDefinitive(String decPaysDestDefinitive) {
		this.decPaysDestDefinitive = decPaysDestDefinitive;
	}

	public String getDecPaysDestination() {
		return decPaysDestination;
	}

	public void setDecPaysDestination(String decPaysDestination) {
		this.decPaysDestination = decPaysDestination;
	}

	public String getDecQuartierDeclarant() {
		return decQuartierDeclarant;
	}

	public void setDecQuartierDeclarant(String decQuartierDeclarant) {
		this.decQuartierDeclarant = decQuartierDeclarant;
	}

	public String getDecQuartierDestinataire() {
		return decQuartierDestinataire;
	}

	public void setDecQuartierDestinataire(String decQuartierDestinataire) {
		this.decQuartierDestinataire = decQuartierDestinataire;
	}

	public String getDecRefDeclaration() {
		return decRefDeclaration;
	}

	public void setDecRefDeclaration(String decRefDeclaration) {
		this.decRefDeclaration = decRefDeclaration;
	}

	public String getDecRegimeDestination() {
		return decRegimeDestination;
	}

	public void setDecRegimeDestination(String decRegimeDestination) {
		this.decRegimeDestination = decRegimeDestination;
	}

	public String getDecRegimeDouanier() {
		return decRegimeDouanier;
	}

	public void setDecRegimeDouanier(String decRegimeDouanier) {
		this.decRegimeDouanier = decRegimeDouanier;
	}

	public String getDecTitreDeclarant() {
		return decTitreDeclarant;
	}

	public void setDecTitreDeclarant(String decTitreDeclarant) {
		this.decTitreDeclarant = decTitreDeclarant;
	}

	public String getDecTitreDestinataire() {
		return decTitreDestinataire;
	}

	public void setDecTitreDestinataire(String decTitreDestinataire) {
		this.decTitreDestinataire = decTitreDestinataire;
	}

	public BigDecimal getDecTotDevisDeclaration() {
		return decTotDevisDeclaration;
	}

	public void setDecTotDevisDeclaration(BigDecimal decTotDevisDeclaration) {
		this.decTotDevisDeclaration = decTotDevisDeclaration;
	}

	public String getDecTypeApurement() {
		return decTypeApurement;
	}

	public void setDecTypeApurement(String decTypeApurement) {
		this.decTypeApurement = decTypeApurement;
	}

	public String getDecTypeManifeste() {
		return decTypeManifeste;
	}

	public void setDecTypeManifeste(String decTypeManifeste) {
		this.decTypeManifeste = decTypeManifeste;
	}

	public String getDecTypeRegime() {
		return decTypeRegime;
	}

	public void setDecTypeRegime(String decTypeRegime) {
		this.decTypeRegime = decTypeRegime;
	}

	public String getDecTypeVoieDeclarant() {
		return decTypeVoieDeclarant;
	}

	public void setDecTypeVoieDeclarant(String decTypeVoieDeclarant) {
		this.decTypeVoieDeclarant = decTypeVoieDeclarant;
	}

	public String getDecTypeVoieDestinataire() {
		return decTypeVoieDestinataire;
	}

	public void setDecTypeVoieDestinataire(String decTypeVoieDestinataire) {
		this.decTypeVoieDestinataire = decTypeVoieDestinataire;
	}

	public String getDecVilleDeclarant() {
		return decVilleDeclarant;
	}

	public void setDecVilleDeclarant(String decVilleDeclarant) {
		this.decVilleDeclarant = decVilleDeclarant;
	}

	public String getDecVilleDestinataire() {
		return decVilleDestinataire;
	}

	public void setDecVilleDestinataire(String decVilleDestinataire) {
		this.decVilleDestinataire = decVilleDestinataire;
	}

	public Date getDecDateCreation() {
		return decDateCreation;
	}

	public void setDecDateCreation(Date decDateCreation) {
		this.decDateCreation = decDateCreation;
	}

	public String getDecNineaDestinataire() {
		return decNineaDestinataire;
	}

	public void setDecNineaDestinataire(String decNineaDestinataire) {
		this.decNineaDestinataire = decNineaDestinataire;
	}

	public String getDecPpmExpediteur() {
		return decPpmExpediteur;
	}

	public void setDecPpmExpediteur(String decPpmExpediteur) {
		this.decPpmExpediteur = decPpmExpediteur;
	}

	public Integer getDecDernierArticle() {
		return decDernierArticle;
	}

	public void setDecDernierArticle(Integer decDernierArticle) {
		this.decDernierArticle = decDernierArticle;
	}

	public List<BrouillonArtDec> getBrouillonArtDec() {
		return brouillonArtDec;
	}

	public void setBrouillonArtDec(List<BrouillonArtDec> brouillonArtDec) {
		this.brouillonArtDec = brouillonArtDec;
	}

	public BureauDouane getBureauProvisoire() {
		return bureauProvisoire;
	}

	public void setBureauProvisoire(BureauDouane bureauProvisoire) {
		this.bureauProvisoire = bureauProvisoire;
	}

	public BureauDouane getBureauDestSen() {
		return bureauDestSen;
	}

	public void setBureauDestSen(BureauDouane bureauDestSen) {
		this.bureauDestSen = bureauDestSen;
	}

	public BureauDouane getBureauFrontiere() {
		return bureauFrontiere;
	}

	public void setBureauFrontiere(BureauDouane bureauFrontiere) {
		this.bureauFrontiere = bureauFrontiere;
	}

	public BureauDouane getBureauEnregManif() {
		return bureauEnregManif;
	}

	public void setBureauEnregManif(BureauDouane bureauEnregManif) {
		this.bureauEnregManif = bureauEnregManif;
	}

	public BureauDouane getBureau() {
		return bureau;
	}

	public void setBureau(BureauDouane bureau) {
		this.bureau = bureau;
	}

	public BureauUemoa getBureauMoa() {
		return bureauMoa;
	}

	public void setBureauMoa(BureauUemoa bureauMoa) {
		this.bureauMoa = bureauMoa;
	}

	public Creditaire getCreditaire() {
		return creditaire;
	}

	public void setCreditaire(Creditaire creditaire) {
		this.creditaire = creditaire;
	}

	public ModeDeclaration getModeDeclaration() {
		return modeDeclaration;
	}

	public void setModeDeclaration(ModeDeclaration modeDeclaration) {
		this.modeDeclaration = modeDeclaration;
	}

	public ModeTransport getModeTransport() {
		return modeTransport;
	}

	public void setModeTransport(ModeTransport modeTransport) {
		this.modeTransport = modeTransport;
	}

	public Pays getPaysDestination() {
		return paysDestination;
	}

	public void setPaysDestination(Pays paysDestination) {
		this.paysDestination = paysDestination;
	}

	public Pays getPaysDestinationFinal() {
		return paysDestinationFinal;
	}

	public void setPaysDestinationFinal(Pays paysDestinationFinal) {
		this.paysDestinationFinal = paysDestinationFinal;
	}

	public Pays getPaysProvenance() {
		return paysProvenance;
	}

	public void setPaysProvenance(Pays paysProvenance) {
		this.paysProvenance = paysProvenance;
	}

	public Ppm getPpmDeclarant() {
		return ppmDeclarant;
	}

	public void setPpmDeclarant(Ppm ppmDeclarant) {
		this.ppmDeclarant = ppmDeclarant;
	}

	public Ppm getPpmExpediteur() {
		return ppmExpediteur;
	}

	public void setPpmExpediteur(Ppm ppmExpediteur) {
		this.ppmExpediteur = ppmExpediteur;
	}

	public TypeApurement getTypeApurement() {
		return typeApurement;
	}

	public void setTypeApurement(TypeApurement typeApurement) {
		this.typeApurement = typeApurement;
	}

	public RegimeDouanier getRegimeDouanier() {
		return regimeDouanier;
	}

	public void setRegimeDouanier(RegimeDouanier regimeDouanier) {
		this.regimeDouanier = regimeDouanier;
	}

	public List<BrComplementTaxes> getBrcomplementtaxes() {
		return brcomplementtaxes;
	}

	public void setBrcomplementtaxes(List<BrComplementTaxes> brcomplementtaxes) {
		this.brcomplementtaxes = brcomplementtaxes;
	}

}
