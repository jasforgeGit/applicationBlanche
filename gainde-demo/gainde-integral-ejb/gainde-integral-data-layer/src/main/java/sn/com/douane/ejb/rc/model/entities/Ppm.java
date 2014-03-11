package sn.com.douane.ejb.rc.model.entities;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Transient;

import sn.com.douane.ejb.declaration.model.entities.BrouillonArtDec;
import sn.com.douane.ejb.declaration.model.entities.BrouillonSegGenDec;
import sn.com.douane.ejb.declaration.model.entities.DdeModifSegartDec;
import sn.com.douane.ejb.declaration.model.entities.DdeModifSegenDec;
import sn.com.douane.ejb.declaration.model.entities.ExclusionPpm;
import sn.com.douane.ejb.declaration.model.entities.LiquidArtDecl;
import sn.com.douane.utils.ConstManif;

@Entity
@Table(name = "PPM")
@NamedQueries({
		@NamedQuery(name = "findAll", query = "select object(o) from Ppm o"),
		@NamedQuery(name = "findPpm", query = "select object(o) from Ppm o where  o.rccodeppm like ?1 or o.rcnomppm like ?1 or o.rcprenomppm like ?1 or o.rcraisonsociale like ?1"),
		@NamedQuery(name = "findPpmByCodeNomRaisSoc", query = "select object(o) from Ppm o where o.rccodeppm LIKE ?1 and (o.rcraisonsociale LIKE ?2 or o.rcnomppm LIKE ?2)"),
		@NamedQuery(name = "findPpmByCodePpm", query = "select object(o) from Ppm o where o.rccodeppm like ?1"),
		@NamedQuery(name = "findPpmByNomRaisSoc", query = "select object(o) from Ppm o where o.rcraisonsociale like ?1 or o.rcnomppm LIKE ?1"),
		@NamedQuery(name = "findByCreditaire", query = "select object(o) from Ppm o where  o.rccodecreditaire = ?1") })
public class Ppm implements Serializable {

	private static final long serialVersionUID = -3719343866898755861L;

	@Id
	@Column(name = "RCCODEPPM", length = 5, nullable = false)
	private String rccodeppm;

	@Column(name = "RCTITREPPM", length = 3)
	private String rctitreppm;

	@Column(name = "RCPRENOMPPM", length = 18)
	private String rcprenomppm;

	@Column(name = "RCNOMPPM", length = 12)
	private String rcnomppm;

	@Column(name = "RCTYPEVOIEPPM", length = 5)
	private String rctypevoieppm;

	@Column(name = "RCNOMVOIEPPM", length = 50)
	private String rcnomvoieppm;

	@Column(name = "RCNUMPPM", length = 5)
	private String rcnumppm;

	@Column(name = "RCQUARTIERPPM", length = 50)
	private String rcquartierppm;

	@Column(name = "RCVILLEPPM", length = 50)
	private String rcvilleppm;

	@Column(name = "RCBOITEPOSTALEPPM", length = 5)
	private String rcboitepostaleppm;

	@Column(name = "RCTYPEVOIEETABLSEC", length = 5)
	private String rctypevoieetablsec;

	@Column(name = "RCNOMVOIEETABLSEC", length = 50)
	private String rcnomvoieetablsec;

	@Column(name = "RCNUMVOIEETABLSEC", length = 10)
	private String rcnumvoieetablsec;

	@Column(name = "RCQUARTIERETABLSEC", length = 50)
	private String rcquartieretablsec;

	@Column(name = "RCVILLEETABLSEC", length = 50)
	private String rcvilleetablsec;

	@Column(name = "RCBPETABLSEC", length = 5)
	private String rcbpetablsec;

	@Column(name = "RCCODEAGREE", length = 3)
	private String rccodeagree;

	@Column(name = "RCCODECREDITAIRE", length = 3)
	private String rccodecreditaire;

	@Column(name = "RCCODECONTRIBUABLE", length = 7)
	private String rccodecontribuable;

	@Column(name = "RCCODECONSIGNATAIRE", length = 3)
	private String rccodeconsignataire;

	@Column(name = "RCCODEAMBORG", length = 5)
	private String rccodeamborg;

	@Column(name = "RCSUSPENSIONADM", length = 1)
	private String rcsuspensionadm;

	@Column(name = "RCCIRCUITVISITE", length = 1)
	private String rccircuitvisite;

	@Column(name = "RCNUMIMPORTEXPORT", length = 10)
	private String rcnumimportexport;

	@Column(name = "RCNUMREGPREFERENTIEL", length = 5)
	private String rcnumregpreferentiel;

	@Column(name = "RCDATESUSPENSIONADM")
	private java.sql.Date rcdatesuspensionadm;

	@Column(name = "RCINDUSINEEXERCEE", length = 1)
	private String rcindusineexercee;

	@Column(name = "RCINDSHIPSANDLER", length = 1)
	private String rcindshipsandler;

	@Column(name = "RCINDZONEFRINDUST", length = 1)
	private String rcindzonefrindust;

	@Column(name = "RCNINEA", length = 18)
	private String rcninea;

	@Column(name = "RCRAISONSOCIALE", length = 18)
	private String rcraisonsociale;

	@Column(name = "RCEXONOREPVI", length = 1, nullable = false)
	private String rcexonorepvi;
	
	@Column(name = "INDPETROLIER", length = 2)
	private String indPetrolier;	

	@OneToMany(mappedBy = "ppmAgree", targetEntity = Agree.class)
	private List<Agree> agrees = new ArrayList<Agree>();

	@OneToMany(mappedBy = "ppmRegDecl", targetEntity = RegimeDeclarant.class)
	private List<RegimeDeclarant> regimeDeclarants = new ArrayList<RegimeDeclarant>();

	@OneToMany(mappedBy = "ppmRegimeDest", targetEntity = RegimeDestinataire.class)
	private List<RegimeDestinataire> regimeDestinataires = new ArrayList<RegimeDestinataire>();

	@OneToMany(mappedBy = "ppmIndPpm", targetEntity = IndicateurPpm.class)
	private List<IndicateurPpm> indicateurPpms = new ArrayList<IndicateurPpm>();

	@OneToMany(mappedBy = "ppmMad", targetEntity = Mad.class)
	private List<Mad> mads = new ArrayList<Mad>();

	@OneToMany(mappedBy = "ppmAutorisants", targetEntity = AutoCreditaire.class)
	private List<AutoCreditaire> creditaireAutorisants = new ArrayList<AutoCreditaire>();

	@OneToMany(mappedBy = "ppmAutorises", targetEntity = AutoCreditaire.class)
	private List<AutoCreditaire> creditaireAutorises = new ArrayList<AutoCreditaire>();

	@OneToMany(mappedBy = "ppmDeclarant", targetEntity = BrouillonSegGenDec.class)
	private List<BrouillonSegGenDec> listBrouillonPpmDeclarant;

	@OneToMany(mappedBy = "ppmExpediteur", targetEntity = BrouillonSegGenDec.class)
	private List<BrouillonSegGenDec> listBrouillonPpmExpediteur;

	@OneToMany(mappedBy = "ppmDeclarant", targetEntity = BrouillonArtDec.class)
	private List<BrouillonArtDec> listBrouillonArtDec;

	@OneToMany(mappedBy = "ppm", targetEntity = DdeModifSegartDec.class)
	private List<DdeModifSegartDec> listDdeModifSegArt;

	@OneToMany(mappedBy = "ppm", targetEntity = DdeModifSegenDec.class)
	private List<DdeModifSegenDec> listDdeModifSegart;

	@OneToMany(mappedBy = "ppm", targetEntity = LiquidArtDecl.class)
	private List<LiquidArtDecl> listLiquidArtDecl;
	
	@OneToMany(mappedBy = "ppm", targetEntity = ExclusionPpm.class)
	private List<ExclusionPpm> listExclusionPpm;	
	
	@OneToMany(mappedBy = "ppm", targetEntity = DepotPetrolier.class)
	private List<DepotPetrolier> listDepotPetrolier;
	

	@Transient
	private String nomPrenom;

	@Transient
	private List listTypeCredit = new ArrayList(); 
	
	@Transient
	private List<Indicateur> listIndicateur = new ArrayList<Indicateur>(); 
	
	@Transient
	private String adresse; 
	
	public Ppm() {

	}

	public Ppm(String rccodeppm) {
		super();
		this.rccodeppm = rccodeppm;
	}

	public String getRccodeppm() {
		return rccodeppm;
	}

	public void setRccodeppm(String rccodeppm) {
		this.rccodeppm = rccodeppm;
	}

	public String getRctitreppm() {
		return rctitreppm;
	}

	public void setRctitreppm(String rctitreppm) {
		this.rctitreppm = rctitreppm;
	}

	public String getRcprenomppm() {
		return rcprenomppm;
	}

	public void setRcprenomppm(String rcprenomppm) {
		this.rcprenomppm = rcprenomppm;
	}

	public String getRcnomppm() {
		return rcnomppm;
	}

	public void setRcnomppm(String rcnomppm) {
		this.rcnomppm = rcnomppm;
	}

	public String getRctypevoieppm() {
		return rctypevoieppm;
	}

	public void setRctypevoieppm(String rctypevoieppm) {
		this.rctypevoieppm = rctypevoieppm;
	}

	public String getRcnomvoieppm() {
		return rcnomvoieppm;
	}

	public void setRcnomvoieppm(String rcnomvoieppm) {
		this.rcnomvoieppm = rcnomvoieppm;
	}

	public String getRcnumppm() {
		return rcnumppm;
	}

	public void setRcnumppm(String rcnumppm) {
		this.rcnumppm = rcnumppm;
	}

	public String getRcquartierppm() {
		return rcquartierppm;
	}

	public void setRcquartierppm(String rcquartierppm) {
		this.rcquartierppm = rcquartierppm;
	}

	public String getRcvilleppm() {
		return rcvilleppm;
	}

	public void setRcvilleppm(String rcvilleppm) {
		this.rcvilleppm = rcvilleppm;
	}

	public String getRcboitepostaleppm() {
		return rcboitepostaleppm;
	}

	public void setRcboitepostaleppm(String rcboitepostaleppm) {
		this.rcboitepostaleppm = rcboitepostaleppm;
	}

	public String getRctypevoieetablsec() {
		return rctypevoieetablsec;
	}

	public void setRctypevoieetablsec(String rctypevoieetablsec) {
		this.rctypevoieetablsec = rctypevoieetablsec;
	}

	public String getRcnomvoieetablsec() {
		return rcnomvoieetablsec;
	}

	public void setRcnomvoieetablsec(String rcnomvoieetablsec) {
		this.rcnomvoieetablsec = rcnomvoieetablsec;
	}

	public String getRcnumvoieetablsec() {
		return rcnumvoieetablsec;
	}

	public void setRcnumvoieetablsec(String rcnumvoieetablsec) {
		this.rcnumvoieetablsec = rcnumvoieetablsec;
	}

	public String getRcquartieretablsec() {
		return rcquartieretablsec;
	}

	public void setRcquartieretablsec(String rcquartieretablsec) {
		this.rcquartieretablsec = rcquartieretablsec;
	}

	public String getRcvilleetablsec() {
		return rcvilleetablsec;
	}

	public void setRcvilleetablsec(String rcvilleetablsec) {
		this.rcvilleetablsec = rcvilleetablsec;
	}

	public String getRcbpetablsec() {
		return rcbpetablsec;
	}

	public void setRcbpetablsec(String rcbpetablsec) {
		this.rcbpetablsec = rcbpetablsec;
	}

	public String getRccodeagree() {
		return rccodeagree;
	}

	public void setRccodeagree(String rccodeagree) {
		this.rccodeagree = rccodeagree;
	}

	public String getRccodecreditaire() {
		return rccodecreditaire;
	}

	public void setRccodecreditaire(String rccodecreditaire) {
		this.rccodecreditaire = rccodecreditaire;
	}

	public String getRccodecontribuable() {
		return rccodecontribuable;
	}

	public void setRccodecontribuable(String rccodecontribuable) {
		this.rccodecontribuable = rccodecontribuable;
	}

	public String getRccodeconsignataire() {
		return rccodeconsignataire;
	}

	public void setRccodeconsignataire(String rccodeconsignataire) {
		this.rccodeconsignataire = rccodeconsignataire;
	}

	public String getRccodeamborg() {
		return rccodeamborg;
	}

	public void setRccodeamborg(String rccodeamborg) {
		this.rccodeamborg = rccodeamborg;
	}

	public String getRcsuspensionadm() {
		return rcsuspensionadm;
	}

	public void setRcsuspensionadm(String rcsuspensionadm) {
		this.rcsuspensionadm = rcsuspensionadm;
	}

	public String getRccircuitvisite() {
		return rccircuitvisite;
	}

	public void setRccircuitvisite(String rccircuitvisite) {
		this.rccircuitvisite = rccircuitvisite;
	}

	public String getRcnumimportexport() {
		return rcnumimportexport;
	}

	public void setRcnumimportexport(String rcnumimportexport) {
		this.rcnumimportexport = rcnumimportexport;
	}

	public String getRcnumregpreferentiel() {
		return rcnumregpreferentiel;
	}

	public void setRcnumregpreferentiel(String rcnumregpreferentiel) {
		this.rcnumregpreferentiel = rcnumregpreferentiel;
	}

	public java.sql.Date getRcdatesuspensionadm() {
		return rcdatesuspensionadm;
	}

	public void setRcdatesuspensionadm(java.sql.Date rcdatesuspensionadm) {
		this.rcdatesuspensionadm = rcdatesuspensionadm;
	}

	public String getRcindusineexercee() {
		return rcindusineexercee;
	}

	public void setRcindusineexercee(String rcindusineexercee) {
		this.rcindusineexercee = rcindusineexercee;
	}

	public String getRcindshipsandler() {
		return rcindshipsandler;
	}

	public void setRcindshipsandler(String rcindshipsandler) {
		this.rcindshipsandler = rcindshipsandler;
	}

	public String getRcindzonefrindust() {
		return rcindzonefrindust;
	}

	public void setRcindzonefrindust(String rcindzonefrindust) {
		this.rcindzonefrindust = rcindzonefrindust;
	}

	public String getRcninea() {
		return rcninea;
	}

	public void setRcninea(String rcninea) {
		this.rcninea = rcninea;
	}

	public String getRcraisonsociale() {
		return rcraisonsociale;
	}

	public void setRcraisonsociale(String rcraisonsociale) {
		this.rcraisonsociale = rcraisonsociale;
	}

	public String getRcexonorepvi() {
		return rcexonorepvi;
	}

	public void setRcexonorepvi(String rcexonorepvi) {
		this.rcexonorepvi = rcexonorepvi;
	}

	public List<RegimeDestinataire> getRegimeDestinataires() {
		return regimeDestinataires;
	}

	public void setRegimeDestinataires(
			List<RegimeDestinataire> regimeDestinataires) {
		this.regimeDestinataires = regimeDestinataires;
	}

	public List<RegimeDeclarant> getRegimeDeclarants() {
		return regimeDeclarants;
	}

	public void setRegimeDeclarants(List<RegimeDeclarant> regimeDeclarants) {
		this.regimeDeclarants = regimeDeclarants;
	}

	public List<IndicateurPpm> getIndicateurPpms() {
		return indicateurPpms;
	}

	public void setIndicateurPpms(List<IndicateurPpm> indicateurPpms) {
		this.indicateurPpms = indicateurPpms;
	}

	public List<AutoCreditaire> getCreditaireAutorisants() {
		return creditaireAutorisants;
	}

	public void setCreditaireAutorisants(
			List<AutoCreditaire> creditaireAutorisants) {
		this.creditaireAutorisants = creditaireAutorisants;
	}

	public List<AutoCreditaire> getCreditaireAutorises() {
		return creditaireAutorises;
	}

	public void setCreditaireAutorises(List<AutoCreditaire> creditaireAutorises) {
		this.creditaireAutorises = creditaireAutorises;
	}

	public List<Agree> getAgrees() {
		return agrees;
	}

	public void setAgrees(List<Agree> agrees) {
		this.agrees = agrees;
	}

	public List<Mad> getMads() {
		return mads;
	}

	public void setMads(List<Mad> mads) {
		this.mads = mads;
	}

	public String getNomPrenom() {
		if (rcnomppm == null) {
			rcnomppm = "";
		}
		if (rcprenomppm == null) {
			rcprenomppm = "";
		}
		return rcprenomppm + ConstManif.SPACE + rcnomppm;
	}

	public void setNomPrenom(String nomPrenom) {
		this.nomPrenom = nomPrenom;
	}

	public List<BrouillonSegGenDec> getListBrouillonPpmDeclarant() {
		return listBrouillonPpmDeclarant;
	}

	public void setListBrouillonPpmDeclarant(
			List<BrouillonSegGenDec> listBrouillonPpmDeclarant) {
		this.listBrouillonPpmDeclarant = listBrouillonPpmDeclarant;
	}

	public List<BrouillonSegGenDec> getListBrouillonPpmExpediteur() {
		return listBrouillonPpmExpediteur;
	}

	public void setListBrouillonPpmExpediteur(
			List<BrouillonSegGenDec> listBrouillonPpmExpediteur) {
		this.listBrouillonPpmExpediteur = listBrouillonPpmExpediteur;
	}

	public List<BrouillonArtDec> getListBrouillonArtDec() {
		return listBrouillonArtDec;
	}

	public void setListBrouillonArtDec(List<BrouillonArtDec> listBrouillonArtDec) {
		this.listBrouillonArtDec = listBrouillonArtDec;
	}

	public List<DdeModifSegartDec> getListDdeModifSegArt() {
		return listDdeModifSegArt;
	}

	public void setListDdeModifSegArt(List<DdeModifSegartDec> listDdeModifSegArt) {
		this.listDdeModifSegArt = listDdeModifSegArt;
	}

	public List<DdeModifSegenDec> getListDdeModifSegart() {
		return listDdeModifSegart;
	}

	public void setListDdeModifSegart(List<DdeModifSegenDec> listDdeModifSegart) {
		this.listDdeModifSegart = listDdeModifSegart;
	}

	public List<LiquidArtDecl> getListLiquidArtDecl() {
		return listLiquidArtDecl;
	}

	public void setListLiquidArtDecl(List<LiquidArtDecl> listLiquidArtDecl) {
		this.listLiquidArtDecl = listLiquidArtDecl;
	}

	public List<ExclusionPpm> getListExclusionPpm() {
		return listExclusionPpm;
	}

	public void setListExclusionPpm(List<ExclusionPpm> listExclusionPpm) {
		this.listExclusionPpm = listExclusionPpm;
	}

	public List getListTypeCredit() {
		return listTypeCredit;
	}

	public void setListTypeCredit(List listTypeCredit) {
		this.listTypeCredit = listTypeCredit;
	}

	public List<Indicateur> getListIndicateur() {
		return listIndicateur;
	}

	public void setListIndicateur(List<Indicateur> listIndicateur) {
		this.listIndicateur = listIndicateur;
	}

	public String getAdresse() {
		if(rcnomvoieetablsec==null){
			rcnomvoieetablsec="";
		}
		if(rctypevoieppm==null){
			rctypevoieppm="";
		}
		if(rcnumvoieetablsec==null){
			rcnumvoieetablsec="";
		}
		if(rcquartierppm==null){
			rcquartierppm="";
		}
		if(rcvilleppm==null){
			rcvilleppm="";
		}
		return rcnomvoieetablsec + ConstManif.SPACE + rctypevoieppm
					+ ConstManif.SPACE + rcnumvoieetablsec + ConstManif.SPACE
					+ rcquartierppm + ConstManif.SPACE + rcvilleppm;
	}

	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}

	public String getIndPetrolier() {
		return indPetrolier;
	}

	public void setIndPetrolier(String indPetrolier) {
		this.indPetrolier = indPetrolier;
	}

	public List<DepotPetrolier> getListDepotPetrolier() {
		return listDepotPetrolier;
	}

	public void setListDepotPetrolier(List<DepotPetrolier> listDepotPetrolier) {
		this.listDepotPetrolier = listDepotPetrolier;
	}
	
	
}
