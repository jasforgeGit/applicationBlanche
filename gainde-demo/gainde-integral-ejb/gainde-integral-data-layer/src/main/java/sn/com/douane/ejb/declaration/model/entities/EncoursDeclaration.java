package sn.com.douane.ejb.declaration.model.entities;

import java.io.Serializable;
import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Transient;

import sn.com.douane.ejb.declaration.model.keys.EncoursDeclarationKey;
import sn.com.douane.ejb.rc.model.entities.CircuitVisite;

/**
 * @author: issam Bean implementation class for Enterprise Bean:
 *          EncoursDeclaration
 */

@Entity
@Table(name = "ENCOURSDECLARATION")
@IdClass(EncoursDeclarationKey.class)
// @javax.persistence.NamedQueries({@javax.persistence.NamedQuery(name =
// "findById" , query =
// "select object(o) from Encoursdeclaration o where  o.ce_sgdecapusom.decanneeenregdec = ?1 and  o.ce_sgdecapusom.decburenregdec = ?2 and  o.ce_sgdecapusom.decnumdeclaration = ?3")
// , @javax.persistence.NamedQuery(name = "findByIdLocal" , query =
// "select object(o) from Encoursdeclaration o where  o.ce_sgdecapusom.decanneeenregdec = ?1 and  o.ce_sgdecapusom.decburenregdec = ?2 and  o.ce_sgdecapusom.decnumdeclaration = ?3")
// , @javax.persistence.NamedQuery(name = "findByCriteres" , query =
// "select object(o) from Encoursdeclaration o where o.deccodeppmdec = ?1 and o.decmodedeclaration <> ?2 and  o.ce_sgdecapusom.decanneeenregdec = ?3 and  o.ce_sgdecapusom.decburenregdec = ?4 and  o.ce_sgdecapusom.decnumdeclaration = ?5 and o.decdossier = ?6 and o.decdateenregdec = ?7")})
public class EncoursDeclaration implements Serializable {

	private static final long serialVersionUID = 4664194032020510776L;
	@Id
	@Column(name = "DECANNEEENREGDEC", length = 4, nullable = false)
	private String decAnneeEnregDec;
	@Id
	@Column(name = "DECBURENREGDEC", length = 3, nullable = false)
	private String decBurEnregDec;
	@Id
	@Column(name = "DECNUMDECLARATION", nullable = false)
	private Integer decNumDeclaration;
	@Column(name = "DECDATEENREGDEC")
	private Date decDateEnregDec;
	@Column(name = "DECUSERENREGISTREMENT", length = 8)
	private String decUserEnregistrement;
	@Column(name = "DECCIRCUITVISITE", length = 1)
	private String decCircuitVisite;
	@Column(name = "DECCODEVERIFICATEUR", length = 5)
	private String decCodeVerificateur;
	@Column(name = "DECNBREUNITEMESURE")
	private Integer decNbreUniteMesure;
	@Column(name = "DECDATEVISITEPREVUE")
	private Date decDateVisitePrevue;
	@Column(name = "DECDATEVISITE")
	private Date decDateVisite;
	@Column(name = "DECDATEBAE")
	private Date decDateBae;
	@Column(name = "DECTYPEREGIME", length = 1)
	private String decTypeRegime;
	@Column(name = "DECREGDOUANIER", length = 1)
	private String decRegDouanier;
	@Column(name = "DECINDDDEDEPOT", length = 1)
	private String decIndDdeDepot;
	@Column(name = "DECNOMDESTINATAIRE", length = 255)
	private String decNomDestinataire;
	@Column(name = "DECDATEENLEVEMENT")
	private Date decDateEnlevement;
	@Column(name = "DECINDEDITION", length = 1)
	private String decIndEdition;
	@Column(name = "DECDOSSIER", length = 3)
	private String decDossier;
	@Column(name = "DECDOSSIERTPS", length = 10)
	private String decDossierTps;
	@Column(name = "DECINDENLEVEMENT", length = 1)
	private String decIndEnlevement;
	@Column(name = "DECINDREGULARISATION", length = 1)
	private String decIndRegularisation;
	@Column(name = "DECINDREGULCHANGE", length = 1)
	private String decIndRegulChange;
	@Column(name = "DECMODEDECLARATION", length = 4)
	private String decModeDeclaration;
	@Column(name = "DECINDDEPOTDEC", length = 1)
	private String decIndDepotDec;
	@Column(name = "DECDATEDEPOTDEC")
	private Date decDateDepotDec;
	@Column(name = "DECINDBAEAUTOMATIQUE", length = 1)
	private String decIndBaeAutomatique;
	@Column(name = "DECETATDECL", length = 1)
	private String decEtatDecl;
	@Column(name = "DECTYPEMESSAGE", length = 1)
	private String decTypeMessage;
	@Column(name = "DECETATTRAITEMENTDEP", length = 2)
	private String decEtatTraitementDep;
	@Column(name = "DECCODEPPMDEC", length = 5)
	private String decCodePpmDec;
	@Column(name = "DECNUMREPERTOIRE", length = 6)
	private String decNumRepertoire;

	@ManyToOne(targetEntity = SegGenDec.class)
	@JoinColumns({
			@JoinColumn(name = "DECNUMDECLARATION", referencedColumnName = "DECNUMDECLARATION", insertable = false, updatable = false, nullable = false),
			@JoinColumn(name = "DECANNEEENREGDEC", referencedColumnName = "DECANNEEENREGDEC", insertable = false, updatable = false, nullable = false),
			@JoinColumn(name = "DECBURENREGDEC", referencedColumnName = "DECBURENREGDEC", insertable = false, updatable = false, nullable = false) })
	private SegGenDec segGenDec;
	
	@ManyToOne(targetEntity = CircuitVisite.class)
	@JoinColumn(name = "DECCIRCUITVISITE", referencedColumnName = "RCCODECIRCUIT", insertable = false, updatable = false)
	private CircuitVisite circuitVisite;

	
	@Transient
	 private String dateBae;
	@Transient
	private String ciblage;

    

    @Transient
    private String dossier;
	
	public String getCiblage() {
		return ciblage;
	}

	public void setCiblage(String ciblage) {
		this.ciblage = ciblage;
	}

	public String getDossier() {
		return dossier;
	}

	public void setDossier(String dossier) {
		this.dossier = dossier;
	}

	public String getDateBae() {
		return dateBae;
	}

	public void setDateBae(String dateBae) {
		this.dateBae = dateBae;
	}

	public EncoursDeclaration() {
	}

	public EncoursDeclaration(String decAnneeEnregDec, String decBurEnregDec,
			Integer decNumDeclaration) {
		this.decAnneeEnregDec = decAnneeEnregDec;
		this.decBurEnregDec = decBurEnregDec;
		this.decNumDeclaration = decNumDeclaration;
	}

	public String getDecAnneeEnregDec() {
		return decAnneeEnregDec;
	}

	public void setDecAnneeEnregDec(String decAnneeEnregDec) {
		this.decAnneeEnregDec = decAnneeEnregDec;
	}

	public String getDecBurEnregDec() {
		return decBurEnregDec;
	}

	public void setDecBurEnregDec(String decBurEnregDec) {
		this.decBurEnregDec = decBurEnregDec;
	}

	public Integer getDecNumDeclaration() {
		return decNumDeclaration;
	}

	public void setDecNumDeclaration(Integer decNumDeclaration) {
		this.decNumDeclaration = decNumDeclaration;
	}

	public Date getDecDateEnregDec() {
		return decDateEnregDec;
	}

	public void setDecDateEnregDec(Date decDateEnregDec) {
		this.decDateEnregDec = decDateEnregDec;
	}

	public String getDecUserEnregistrement() {
		return decUserEnregistrement;
	}

	public void setDecUserEnregistrement(String decUserEnregistrement) {
		this.decUserEnregistrement = decUserEnregistrement;
	}

	public String getDecCircuitVisite() {
		return decCircuitVisite;
	}

	public void setDecCircuitVisite(String decCircuitVisite) {
		this.decCircuitVisite = decCircuitVisite;
	}

	public String getDecCodeVerificateur() {
		return decCodeVerificateur;
	}

	public void setDecCodeVerificateur(String decCodeVerificateur) {
		this.decCodeVerificateur = decCodeVerificateur;
	}

	public Integer getDecNbreUniteMesure() {
		return decNbreUniteMesure;
	}

	public void setDecNbreUniteMesure(Integer decNbreUniteMesure) {
		this.decNbreUniteMesure = decNbreUniteMesure;
	}

	public Date getDecDateVisitePrevue() {
		return decDateVisitePrevue;
	}

	public void setDecDateVisitePrevue(Date decDateVisitePrevue) {
		this.decDateVisitePrevue = decDateVisitePrevue;
	}

	public Date getDecDateVisite() {
		return decDateVisite;
	}

	public void setDecDateVisite(Date decDateVisite) {
		this.decDateVisite = decDateVisite;
	}

	public Date getDecDateBae() {
		return decDateBae;
	}

	public void setDecDateBae(Date decDateBae) {
		this.decDateBae = decDateBae;
	}

	public String getDecTypeRegime() {
		return decTypeRegime;
	}

	public void setDecTypeRegime(String decTypeRegime) {
		this.decTypeRegime = decTypeRegime;
	}

	public String getDecRegDouanier() {
		return decRegDouanier;
	}

	public void setDecRegDouanier(String decRegDouanier) {
		this.decRegDouanier = decRegDouanier;
	}

	public String getDecIndDdeDepot() {
		return decIndDdeDepot;
	}

	public void setDecIndDdeDepot(String decIndDdeDepot) {
		this.decIndDdeDepot = decIndDdeDepot;
	}

	public String getDecNomDestinataire() {
		return decNomDestinataire;
	}

	public void setDecNomDestinataire(String decNomDestinataire) {
		this.decNomDestinataire = decNomDestinataire;
	}

	public Date getDecDateEnlevement() {
		return decDateEnlevement;
	}

	public void setDecDateEnlevement(Date decDateEnlevement) {
		this.decDateEnlevement = decDateEnlevement;
	}

	public String getDecIndEdition() {
		return decIndEdition;
	}

	public void setDecIndEdition(String decIndEdition) {
		this.decIndEdition = decIndEdition;
	}

	public String getDecDossier() {
		return decDossier;
	}

	public void setDecDossier(String decDossier) {
		this.decDossier = decDossier;
	}

	public String getDecDossierTps() {
		return decDossierTps;
	}

	public void setDecDossierTps(String decDossierTps) {
		this.decDossierTps = decDossierTps;
	}

	public String getDecIndEnlevement() {
		return decIndEnlevement;
	}

	public void setDecIndEnlevement(String decIndEnlevement) {
		this.decIndEnlevement = decIndEnlevement;
	}

	public String getDecIndRegularisation() {
		return decIndRegularisation;
	}

	public void setDecIndRegularisation(String decIndRegularisation) {
		this.decIndRegularisation = decIndRegularisation;
	}

	public String getDecIndRegulChange() {
		return decIndRegulChange;
	}

	public void setDecIndRegulChange(String decIndRegulChange) {
		this.decIndRegulChange = decIndRegulChange;
	}

	public String getDecModeDeclaration() {
		return decModeDeclaration;
	}

	public void setDecModeDeclaration(String decModeDeclaration) {
		this.decModeDeclaration = decModeDeclaration;
	}

	public String getDecIndDepotDec() {
		return decIndDepotDec;
	}

	public void setDecIndDepotDec(String decIndDepotDec) {
		this.decIndDepotDec = decIndDepotDec;
	}

	public Date getDecDateDepotDec() {
		return decDateDepotDec;
	}

	public void setDecDateDepotDec(Date decDateDepotDec) {
		this.decDateDepotDec = decDateDepotDec;
	}

	public String getDecIndBaeAutomatique() {
		return decIndBaeAutomatique;
	}

	public void setDecIndBaeAutomatique(String decIndBaeAutomatique) {
		this.decIndBaeAutomatique = decIndBaeAutomatique;
	}

	public String getDecEtatDecl() {
		return decEtatDecl;
	}

	public void setDecEtatDecl(String decEtatDecl) {
		this.decEtatDecl = decEtatDecl;
	}

	public String getDecTypeMessage() {
		return decTypeMessage;
	}

	public void setDecTypeMessage(String decTypeMessage) {
		this.decTypeMessage = decTypeMessage;
	}

	public String getDecEtatTraitementDep() {
		return decEtatTraitementDep;
	}

	public void setDecEtatTraitementDep(String decEtatTraitementDep) {
		this.decEtatTraitementDep = decEtatTraitementDep;
	}

	public String getDecCodePpmDec() {
		return decCodePpmDec;
	}

	public void setDecCodePpmDec(String decCodePpmDec) {
		this.decCodePpmDec = decCodePpmDec;
	}

	public String getDecNumRepertoire() {
		return decNumRepertoire;
	}

	public void setDecNumRepertoire(String decNumRepertoire) {
		this.decNumRepertoire = decNumRepertoire;
	}

	public SegGenDec getSegGenDec() {
		return segGenDec;
	}

	public void setSegGenDec(SegGenDec segGenDec) {
		this.segGenDec = segGenDec;
	}

	public CircuitVisite getCircuitVisite() {
		return circuitVisite;
	}

	public void setCircuitVisite(CircuitVisite circuitVisite) {
		this.circuitVisite = circuitVisite;
	}

}