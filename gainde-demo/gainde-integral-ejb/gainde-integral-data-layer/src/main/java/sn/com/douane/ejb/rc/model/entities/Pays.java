package sn.com.douane.ejb.rc.model.entities;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import sn.com.douane.ejb.declaration.model.entities.BrouillonArtDec;
import sn.com.douane.ejb.declaration.model.entities.BrouillonSegGenDec;
import sn.com.douane.ejb.declaration.model.entities.DdeModifSegenDec;
import sn.com.douane.ejb.declaration.model.entities.ExclusionPays;
import sn.com.douane.ejb.declaration.model.entities.HSegArtDec;
import sn.com.douane.ejb.declaration.model.entities.SegArtDec;
import sn.com.douane.ejb.manifeste.model.entities.BrouillonSegArt;
import sn.com.douane.ejb.manifeste.model.entities.BrouillonSegenMan;
import sn.com.douane.ejb.manifeste.model.entities.SegmentGenManifeste;

@Entity
@Table(name = "PAYS")
public class Pays implements Serializable {

	private static final long serialVersionUID = -1867928906442539290L;

	@Id
	@Column(name = "RCCODEPAYS", length = 3, nullable = false)
	private String rccodepays;

	@Column(name = "RCPAYSALPHABETIQUE", length = 3, nullable = false)
	private String rcpaysalphabetique;

	@Column(name = "RCLIBELLEPAYS", length = 100, nullable = false)
	private String rclibellepays;

	@Column(name = "RCCODEDEVISE", length = 3, nullable = false)
	private String rccodedevise;

	@Column(name = "RCCODELANGUE", length = 3, nullable = false)
	private String rccodelangue;

	@Column(name = "RCCODEMONNETAIRE", length = 2)
	private String rccodemonnetaire;

	@Column(name = "RCCODEPROHIBITION", length = 1)
	private String rccodeprohibition;

	@Column(name = "RCDATEPROHIBITION")
	private java.sql.Date rcdateprohibition;

	@Column(name = "RCNATUREFISCALITE", length = 1, nullable = false)
	private String rcnaturefiscalite;

	@Column(name = "RCCIRCUITVISITE", length = 1, nullable = false)
	private String rccircuitvisite;

	@Column(name = "RCDATEFISCALITE")
	private java.sql.Date rcdatefiscalite;

	@ManyToOne(targetEntity = CircuitVisite.class)
	@JoinColumn(name = "RCCIRCUITVISITE", insertable = false, updatable = false)
	private CircuitVisite circuitVisite;

	@ManyToOne(targetEntity = Devises.class)
	@JoinColumn(name = "RCCODEDEVISE", insertable = false, updatable = false)
	private Devises devises;

	@ManyToOne(targetEntity = Langue.class)
	@JoinColumn(name = "RCCODELANGUE", insertable = false, updatable = false)
	private Langue langue;

	@ManyToOne(targetEntity = NatureFiscalite.class)
	@JoinColumn(name = "RCNATUREFISCALITE", insertable = false, updatable = false)
	private NatureFiscalite natureFiscalite;

	@OneToMany(mappedBy = "pays", targetEntity = LieuEmbarquement.class)
	private List<LieuEmbarquement> lieuEmbarquement = new ArrayList<LieuEmbarquement>();

	@OneToMany(mappedBy = "pays", targetEntity = PpmEtranger.class)
	private List<PpmEtranger> ppmEtranger = new ArrayList<PpmEtranger>();

	@OneToMany(mappedBy = "pays", targetEntity = Rcsite.class)
	private List<Rcsite> rcsite = new ArrayList<Rcsite>();

	@OneToMany(mappedBy = "paysProvenance", targetEntity = BrouillonSegenMan.class)
	private List<BrouillonSegenMan> listBrouillonPaysProv;

	@OneToMany(mappedBy = "paysPavillon", targetEntity = BrouillonSegenMan.class)
	private List<BrouillonSegenMan> listBrouillonPaysPav;

	@OneToMany(mappedBy = "pays", targetEntity = RegroupPays.class)
	private List<RegroupPays> regroupPays = new ArrayList<RegroupPays>();

	@OneToMany(mappedBy = "pays", targetEntity = BrouillonSegArt.class)
	private List<BrouillonSegArt> listeBrouillonSegart = new ArrayList<BrouillonSegArt>();

	@OneToMany(mappedBy = "pays", targetEntity = SegmentGenManifeste.class)
	private List<SegmentGenManifeste> listeSegmentGenMan = new ArrayList<SegmentGenManifeste>();

	@OneToMany(mappedBy = "paysDestination", targetEntity = BrouillonSegGenDec.class)
	private List<BrouillonSegGenDec> listeBrouillonPays;

	@OneToMany(mappedBy = "paysDestinationFinal", targetEntity = BrouillonSegGenDec.class)
	private List<BrouillonSegGenDec> listeBrouillonPaysFinal;

	@OneToMany(mappedBy = "paysProvenance", targetEntity = BrouillonSegGenDec.class)
	private List<BrouillonSegGenDec> listeBrouillonPaysPv;

	@OneToMany(mappedBy = "paysDoc", targetEntity = BrouillonArtDec.class)
	private List<BrouillonArtDec> listeBrouillonArtPaysDoc;

	@OneToMany(mappedBy = "paysDestination", targetEntity = BrouillonArtDec.class)
	private List<BrouillonArtDec> listeBrouillonArtPaysDest;

	@OneToMany(mappedBy = "paysOrigine", targetEntity = BrouillonArtDec.class)
	private List<BrouillonArtDec> listeBrouillonArtPaysOrigine;

	@OneToMany(mappedBy = "pays", targetEntity = DdeModifSegenDec.class)
	private List<DdeModifSegenDec> listeDdeModifSegenDec;
	
	@OneToMany(mappedBy = "paysOrigine", targetEntity = SegArtDec.class)
	private List<SegArtDec> listeSegArtPaysOrigine;
	
	@OneToMany(mappedBy = "paysAssur", targetEntity = SegArtDec.class)
	private List<SegArtDec> listeSegArtPaysAssur;
	
	@OneToMany(mappedBy = "paysFacturation", targetEntity = SegArtDec.class)
	private List<SegArtDec> listeSegArtPaysFacture;
	
	@OneToMany(mappedBy = "paysFret", targetEntity = SegArtDec.class)
	private List<SegArtDec> listeSegArtPaysFret;
	
	@OneToMany(mappedBy = "paysOrigine", targetEntity = HSegArtDec.class)
	private List<HSegArtDec> listHSegArtPaysOrigine;
	
	@OneToMany(mappedBy = "paysAssur", targetEntity = HSegArtDec.class)
	private List<HSegArtDec> listHSegArtPaysAssur;
	
	@OneToMany(mappedBy = "paysFacturation", targetEntity = HSegArtDec.class)
	private List<HSegArtDec> listHSegArtPaysFacture;
	
	@OneToMany(mappedBy = "paysFret", targetEntity = HSegArtDec.class)
	private List<HSegArtDec> listHSegArtPaysFret;
	
	@OneToMany(mappedBy = "pay", targetEntity = ExclusionPays.class)
	private List<ExclusionPays> listExclusionPays;
	
	@OneToMany(mappedBy = "pays", targetEntity = AgrementEntreprise.class)
	private List<AgrementEntreprise> listAgrementEnreprises;
	

	public Pays() {

	}

	public Pays(String rccodepays) {
		super();
		this.rccodepays = rccodepays;
	}

	public Pays(String rccodepays, String rcpaysalphabetique,
			String rclibellepays, CircuitVisite circuitViste, Devises devises,
			Langue langue, NatureFiscalite natureFiscalite) {
		super();
		this.rccodepays = rccodepays;
		this.rcpaysalphabetique = rcpaysalphabetique;
		this.rclibellepays = rclibellepays;
	}

	public String getRccodepays() {
		return rccodepays;
	}

	public void setRccodepays(String rccodepays) {
		this.rccodepays = rccodepays;
	}

	public String getRcpaysalphabetique() {
		return rcpaysalphabetique;
	}

	public void setRcpaysalphabetique(String rcpaysalphabetique) {
		this.rcpaysalphabetique = rcpaysalphabetique;
	}

	public String getRclibellepays() {
		return rclibellepays;
	}

	public void setRclibellepays(String rclibellepays) {
		this.rclibellepays = rclibellepays;
	}

	public String getRccodemonnetaire() {
		return rccodemonnetaire;
	}

	public void setRccodemonnetaire(String rccodemonnetaire) {
		this.rccodemonnetaire = rccodemonnetaire;
	}

	public String getRccodeprohibition() {
		return rccodeprohibition;
	}

	public void setRccodeprohibition(String rccodeprohibition) {
		this.rccodeprohibition = rccodeprohibition;
	}

	public java.sql.Date getRcdateprohibition() {
		return rcdateprohibition;
	}

	public void setRcdateprohibition(java.sql.Date rcdateprohibition) {
		this.rcdateprohibition = rcdateprohibition;
	}

	public java.sql.Date getRcdatefiscalite() {
		return rcdatefiscalite;
	}

	public void setRcdatefiscalite(java.sql.Date rcdatefiscalite) {
		this.rcdatefiscalite = rcdatefiscalite;
	}

	public String getRccodedevise() {
		return rccodedevise;
	}

	public void setRccodedevise(String rccodedevise) {
		this.rccodedevise = rccodedevise;
	}

	public String getRccodelangue() {
		return rccodelangue;
	}

	public void setRccodelangue(String rccodelangue) {
		this.rccodelangue = rccodelangue;
	}

	public String getRcnaturefiscalite() {
		return rcnaturefiscalite;
	}

	public void setRcnaturefiscalite(String rcnaturefiscalite) {
		this.rcnaturefiscalite = rcnaturefiscalite;
	}

	public String getRccircuitvisite() {
		return rccircuitvisite;
	}

	public void setRccircuitvisite(String rccircuitvisite) {
		this.rccircuitvisite = rccircuitvisite;
	}

	public CircuitVisite getCircuitVisite() {
		return circuitVisite;
	}

	public void setCircuitVisite(CircuitVisite circuitVisite) {
		this.circuitVisite = circuitVisite;
	}

	public Devises getDevises() {
		return devises;
	}

	public void setDevises(Devises devises) {
		this.devises = devises;
	}

	public Langue getLangue() {
		return langue;
	}

	public void setLangue(Langue langue) {
		this.langue = langue;
	}

	public NatureFiscalite getNatureFiscalite() {
		return natureFiscalite;
	}

	public List<LieuEmbarquement> getLieuEmbarquement() {
		return lieuEmbarquement;
	}

	public void setLieuEmbarquement(ArrayList<LieuEmbarquement> lieuEmbarquement) {
		this.lieuEmbarquement = lieuEmbarquement;
	}

	public List<PpmEtranger> getPpmEtranger() {
		return ppmEtranger;
	}

	public void setPpmEtranger(ArrayList<PpmEtranger> ppmEtranger) {
		this.ppmEtranger = ppmEtranger;
	}

	public List<RegroupPays> getRegroupPays() {
		return regroupPays;
	}

	public void setRegroupPays(ArrayList<RegroupPays> regroupPays) {
		this.regroupPays = regroupPays;
	}

	public void setNatureFiscalite(NatureFiscalite natureFiscalite) {
		this.natureFiscalite = natureFiscalite;
	}

	public List<Rcsite> getRcsite() {
		return rcsite;
	}

	public void setRcsite(List<Rcsite> rcsite) {
		this.rcsite = rcsite;
	}

	public void setLieuEmbarquement(List<LieuEmbarquement> lieuEmbarquement) {
		this.lieuEmbarquement = lieuEmbarquement;
	}

	public void setPpmEtranger(List<PpmEtranger> ppmEtranger) {
		this.ppmEtranger = ppmEtranger;
	}

	public void setRegroupPays(List<RegroupPays> regroupPays) {
		this.regroupPays = regroupPays;
	}

	public List<BrouillonSegenMan> getListBrouillonPaysProv() {
		return listBrouillonPaysProv;
	}

	public void setListBrouillonPaysProv(
			List<BrouillonSegenMan> listBrouillonPaysProv) {
		this.listBrouillonPaysProv = listBrouillonPaysProv;
	}

	public List<BrouillonSegenMan> getListBrouillonPaysPav() {
		return listBrouillonPaysPav;
	}

	public void setListBrouillonPaysPav(
			List<BrouillonSegenMan> listBrouillonPaysPav) {
		this.listBrouillonPaysPav = listBrouillonPaysPav;
	}

	public List<BrouillonSegArt> getListeBrouillonSegart() {
		return listeBrouillonSegart;
	}

	public void setListeBrouillonSegart(
			List<BrouillonSegArt> listeBrouillonSegart) {
		this.listeBrouillonSegart = listeBrouillonSegart;
	}

	public List<SegmentGenManifeste> getListeSegmentGenMan() {
		return listeSegmentGenMan;
	}

	public void setListeSegmentGenMan(
			List<SegmentGenManifeste> listeSegmentGenMan) {
		this.listeSegmentGenMan = listeSegmentGenMan;
	}

	public List<BrouillonSegGenDec> getListeBrouillonPays() {
		return listeBrouillonPays;
	}

	public void setListeBrouillonPays(
			List<BrouillonSegGenDec> listeBrouillonPays) {
		this.listeBrouillonPays = listeBrouillonPays;
	}

	public List<BrouillonSegGenDec> getListeBrouillonPaysFinal() {
		return listeBrouillonPaysFinal;
	}

	public void setListeBrouillonPaysFinal(
			List<BrouillonSegGenDec> listeBrouillonPaysFinal) {
		this.listeBrouillonPaysFinal = listeBrouillonPaysFinal;
	}

	public List<BrouillonSegGenDec> getListeBrouillonPaysPv() {
		return listeBrouillonPaysPv;
	}

	public void setListeBrouillonPaysPv(
			List<BrouillonSegGenDec> listeBrouillonPaysPv) {
		this.listeBrouillonPaysPv = listeBrouillonPaysPv;
	}

	public List<BrouillonArtDec> getListeBrouillonArtPaysDoc() {
		return listeBrouillonArtPaysDoc;
	}

	public void setListeBrouillonArtPaysDoc(
			List<BrouillonArtDec> listeBrouillonArtPaysDoc) {
		this.listeBrouillonArtPaysDoc = listeBrouillonArtPaysDoc;
	}

	public List<BrouillonArtDec> getListeBrouillonArtPaysDest() {
		return listeBrouillonArtPaysDest;
	}

	public void setListeBrouillonArtPaysDest(
			List<BrouillonArtDec> listeBrouillonArtPaysDest) {
		this.listeBrouillonArtPaysDest = listeBrouillonArtPaysDest;
	}

	public List<BrouillonArtDec> getListeBrouillonArtPaysOrigine() {
		return listeBrouillonArtPaysOrigine;
	}

	public void setListeBrouillonArtPaysOrigine(
			List<BrouillonArtDec> listeBrouillonArtPaysOrigine) {
		this.listeBrouillonArtPaysOrigine = listeBrouillonArtPaysOrigine;
	}

	public List<DdeModifSegenDec> getListeDdeModifSegenDec() {
		return listeDdeModifSegenDec;
	}

	public void setListeDdeModifSegenDec(
			List<DdeModifSegenDec> listeDdeModifSegenDec) {
		this.listeDdeModifSegenDec = listeDdeModifSegenDec;
	}

	public List<SegArtDec> getListeSegArtPaysOrigine() {
		return listeSegArtPaysOrigine;
	}

	public void setListeSegArtPaysOrigine(List<SegArtDec> listeSegArtPaysOrigine) {
		this.listeSegArtPaysOrigine = listeSegArtPaysOrigine;
	}

	public List<SegArtDec> getListeSegArtPaysAssur() {
		return listeSegArtPaysAssur;
	}

	public void setListeSegArtPaysAssur(List<SegArtDec> listeSegArtPaysAssur) {
		this.listeSegArtPaysAssur = listeSegArtPaysAssur;
	}

	public List<SegArtDec> getListeSegArtPaysFacture() {
		return listeSegArtPaysFacture;
	}

	public void setListeSegArtPaysFacture(List<SegArtDec> listeSegArtPaysFacture) {
		this.listeSegArtPaysFacture = listeSegArtPaysFacture;
	}

	public List<SegArtDec> getListeSegArtPaysFret() {
		return listeSegArtPaysFret;
	}

	public void setListeSegArtPaysFret(List<SegArtDec> listeSegArtPaysFret) {
		this.listeSegArtPaysFret = listeSegArtPaysFret;
	}

	public List<HSegArtDec> getListHSegArtPaysOrigine() {
		return listHSegArtPaysOrigine;
	}

	public void setListHSegArtPaysOrigine(List<HSegArtDec> listHSegArtPaysOrigine) {
		this.listHSegArtPaysOrigine = listHSegArtPaysOrigine;
	}

	public List<HSegArtDec> getListHSegArtPaysAssur() {
		return listHSegArtPaysAssur;
	}

	public void setListHSegArtPaysAssur(List<HSegArtDec> listHSegArtPaysAssur) {
		this.listHSegArtPaysAssur = listHSegArtPaysAssur;
	}

	public List<HSegArtDec> getListHSegArtPaysFacture() {
		return listHSegArtPaysFacture;
	}

	public void setListHSegArtPaysFacture(List<HSegArtDec> listHSegArtPaysFacture) {
		this.listHSegArtPaysFacture = listHSegArtPaysFacture;
	}

	public List<HSegArtDec> getListHSegArtPaysFret() {
		return listHSegArtPaysFret;
	}

	public void setListHSegArtPaysFret(List<HSegArtDec> listHSegArtPaysFret) {
		this.listHSegArtPaysFret = listHSegArtPaysFret;
	}

	public List<ExclusionPays> getListExclusionPays() {
		return listExclusionPays;
	}

	public void setListExclusionPays(List<ExclusionPays> listExclusionPays) {
		this.listExclusionPays = listExclusionPays;
	}

	public List<AgrementEntreprise> getListAgrementEnreprises() {
		return listAgrementEnreprises;
	}

	public void setListAgrementEnreprises(List<AgrementEntreprise> listAgrementEnreprises) {
		this.listAgrementEnreprises = listAgrementEnreprises;
	}	
	

}
