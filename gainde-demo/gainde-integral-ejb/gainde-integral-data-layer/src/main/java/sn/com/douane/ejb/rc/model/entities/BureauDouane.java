package sn.com.douane.ejb.rc.model.entities;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import sn.com.douane.ejb.declaration.model.entities.BrouillonSegGenDec;
import sn.com.douane.ejb.declaration.model.entities.CritereLocalBae;
import sn.com.douane.ejb.declaration.model.entities.DdeModifSegenDec;
import sn.com.douane.ejb.declaration.model.entities.ExclusionPpm;
import sn.com.douane.ejb.declaration.model.entities.HSegArtDec;
import sn.com.douane.ejb.declaration.model.entities.LiquidArtDecl;
import sn.com.douane.ejb.declaration.model.entities.SpecVerifProd;
import sn.com.douane.ejb.declaration.model.entities.SpecVerifRegime;
import sn.com.douane.ejb.demat.model.entities.Agenda;
import sn.com.douane.ejb.demat.model.entities.Compte;
import sn.com.douane.ejb.demat.model.entities.Facture;
import sn.com.douane.ejb.demat.model.entities.UniteDeVisitePhysique;
import sn.com.douane.ejb.manifeste.model.entities.ArticleManifeste;
import sn.com.douane.ejb.manifeste.model.entities.BrouillonSegenMan;

/**
 * BureauDouane EJB3 Entity Bean.
 * 
 * @author Wadii
 */
@Entity
@Table(name = "BUREAUDOUANE")
public class BureauDouane implements Serializable {

	private static final long serialVersionUID = -5807443478607171903L;

	@Id
	@Column(name = "RCCODEBURDOUANE", length = 3, nullable = false)
	private String rccodeburdouane;

	@Column(name = "RCLIBELLEBURDOUANE", length = 100, nullable = false)
	private String rclibelleburdouane;

	@Column(name = "MANIFESTEOBLIGATOIRE", length = 1)
	private String manifesteobligatoire;

	@Column(name = "RCREPARTITION", length = 1)
	private String rcrepartition ;

	@Column(name = "RCCOMPETENCE", length = 2, nullable = false)
	private String rcCompetence;

	@Column(name = "RCTYPEBURDOUANE", nullable = false)
	private Integer rcTypeBurDouane;

	@Column(name = "RCGENREBUR", length = 10, nullable = false)
	private String rcGenreBur;
	
	@Column(name = "AGENDA")
	private Long agenda;

	@Column(name = "IDCOMPTE")
	private Long idcompte;	
	
	@ManyToOne
	@JoinColumn(name = "AGENDA",referencedColumnName="IDAGENDA", insertable = false, updatable = false)
	private Agenda agendas;
	
	@ManyToOne
	@JoinColumn(name = "IDCOMPTE",referencedColumnName="IDCOMPTE", insertable = false, updatable = false)
	private Compte compte;

	@ManyToOne
	@JoinColumn(name = "RCCOMPETENCE", insertable = false, updatable = false, nullable = false)
	private CompBureau compBureau;

	@ManyToOne
	@JoinColumn(name = "RCGENREBUR", insertable = false, updatable = false, nullable = false)
	private GenreBureau genreBureau;

	@ManyToOne
	@JoinColumn(name = "RCTYPEBURDOUANE", insertable = false, updatable = false, nullable = false)
	private TypeBureau typeBureau;

	@OneToMany(mappedBy = "bureauDouane")
	private Set<BureauDouaneTypeManifeste> bureauDouaneTypeManif = new HashSet<BureauDouaneTypeManifeste>();

	@OneToMany(mappedBy = "burprodbur")
	private List<BureauProduit> bureauxProduit = new ArrayList<BureauProduit>();

	@OneToMany(mappedBy = "burscorebur")
	private List<ScoreBureau> scoresBureau = new ArrayList<ScoreBureau>();

	@OneToMany(mappedBy = "baremebur")
	private List<Bareme> baremes = new ArrayList<Bareme>();

	@OneToMany(mappedBy = "burtypeapu")
	private Set<TypeApuBurInterdit> typesApuBurInterdit = new HashSet<TypeApuBurInterdit>();

	@OneToMany(mappedBy = "burregecopfbr")
	private List<RegeCoprodFiniBur> regesCoprodFiniBur = new ArrayList<RegeCoprodFiniBur>();

	@OneToMany(mappedBy = "burcriterelog")
	private Set<CritereLogique> criteresLogiques = new HashSet<CritereLogique>();

	@OneToMany(mappedBy = "burrepfbur")
	private List<ReprodFiniBur> reprodsFiniBur = new ArrayList<ReprodFiniBur>();

	@OneToMany(mappedBy = "burburinterdit")
	private List<RegimeBurInterdit> regimesBurInterdit = new ArrayList<RegimeBurInterdit>();

	@OneToMany(mappedBy = "burDouaneAff")
	private List<AgentDouane> agentDouaneAffs = new ArrayList<AgentDouane>();

	@OneToMany(mappedBy = "burDouaneAct")
	private List<AgentDouane> agentDouaneActs = new ArrayList<AgentDouane>();

	@OneToMany(mappedBy = "burDouane")
	private List<BurModDecl> burModDecls = new ArrayList<BurModDecl>();

	@OneToMany(mappedBy = "bureauEnreg", targetEntity = BrouillonSegenMan.class)
	private List<BrouillonSegenMan> listBrouillonEnreg;

	@OneToMany(mappedBy = "bureauEntree", targetEntity = BrouillonSegenMan.class)
	private List<BrouillonSegenMan> listBrouillonEntree;

	@OneToMany(mappedBy = "bureauProvisoire", targetEntity = BrouillonSegGenDec.class)
	private List<BrouillonSegGenDec> listBrouillonProvisaoire;

	@OneToMany(mappedBy = "bureauDestSen", targetEntity = BrouillonSegGenDec.class)
	private List<BrouillonSegGenDec> listBrouillonDestSen;

	@OneToMany(mappedBy = "bureauFrontiere", targetEntity = BrouillonSegGenDec.class)
	private List<BrouillonSegGenDec> listBrouillonFrontiere;

	@OneToMany(mappedBy = "bureauEnregManif", targetEntity = BrouillonSegGenDec.class)
	private List<BrouillonSegGenDec> listBrouillonEnregManif;

	@OneToMany(mappedBy = "bureau", targetEntity = BrouillonSegGenDec.class)
	private List<BrouillonSegGenDec> listBrouillonBur;

	@OneToMany(mappedBy = "bureauDouane", targetEntity = DdeModifSegenDec.class)
	private List<DdeModifSegenDec> listDdeModifSegen;

	@OneToMany(mappedBy = "bureauDouane", targetEntity = SpecVerifProd.class)
	private List<SpecVerifProd> listSpecVerifProd;

	@OneToMany(mappedBy = "bureauDouane", targetEntity = SpecVerifRegime.class)
	private List<SpecVerifRegime> listSpecVerifRegime;

	@OneToMany(mappedBy = "bureauDouane", targetEntity = LiquidArtDecl.class)
	private List<LiquidArtDecl> listLiquidArtDecl;

	@OneToMany(mappedBy = "bureauEnreg", targetEntity = HSegArtDec.class)
	private List<HSegArtDec> listHSegArtBurEnreg;

	@OneToMany(mappedBy = "bureauProvenance", targetEntity = HSegArtDec.class)
	private List<HSegArtDec> listHSegArtBurProv;
	
	@OneToMany(mappedBy = "bureauDaouane", targetEntity = CritereLocalBae.class)
	private List<CritereLocalBae> listCritereLocalBae;
	
	@OneToMany(mappedBy = "bureauDaoune", targetEntity = ExclusionPpm.class)
	private List<ExclusionPpm> listExclusionPpm;
	
	@OneToMany(mappedBy = "bureauDouane", targetEntity = UniteDeVisitePhysique.class)
	private List<UniteDeVisitePhysique> listUniteDeVisitePhysique = new ArrayList<UniteDeVisitePhysique>();
	
	@OneToMany(mappedBy = "bureauDouanes", targetEntity = Facture.class)
	private List<Facture> listFacture = new ArrayList<Facture>();
	
	@OneToMany(mappedBy = "bureauDaoune", targetEntity = ArticleManifeste.class)
	private List<ArticleManifeste> listArticleManifeste = new ArrayList<ArticleManifeste>();
	
	@OneToMany(mappedBy = "bureauDouane", targetEntity = Mad.class)
	private List<Mad> listMad = new ArrayList<Mad>();	
	

	/**
	 * 0-args contructor.
	 */
	public BureauDouane() {
		super();
	}

	/**
	 * 2-args Constructor.
	 */
	public BureauDouane(String rccodeburdouane, String rclibelleburdouane) {
		super();
		this.rccodeburdouane = rccodeburdouane;
		this.rclibelleburdouane = rclibelleburdouane;
	}

	public BureauDouane(String rccodeburdouane, String rclibelleburdouane,
			String rcCompetence, Integer rcTypeBurDouane, String rcGenreBur) {
		super();
		this.rccodeburdouane = rccodeburdouane;
		this.rclibelleburdouane = rclibelleburdouane;
		this.rcCompetence = rcCompetence;
		this.rcTypeBurDouane = rcTypeBurDouane;
		this.rcGenreBur = rcGenreBur;
	}

	public List<BureauProduit> getBureauxProduit() {
		return bureauxProduit;
	}

	public void setBureauxProduit(List<BureauProduit> bureauxProduit) {
		this.bureauxProduit = bureauxProduit;
	}

	public List<ScoreBureau> getScoresBureau() {
		return scoresBureau;
	}

	public void setScoresBureau(List<ScoreBureau> scoresBureau) {
		this.scoresBureau = scoresBureau;
	}

	public List<Bareme> getBaremes() {
		return baremes;
	}

	public void setBaremes(List<Bareme> baremes) {
		this.baremes = baremes;
	}

	public Set<TypeApuBurInterdit> getTypesApuBurInterdit() {
		return typesApuBurInterdit;
	}

	public void setTypesApuBurInterdit(
			Set<TypeApuBurInterdit> typesApuBurInterdit) {
		this.typesApuBurInterdit = typesApuBurInterdit;
	}

	public List<RegeCoprodFiniBur> getRegesCoprodFiniBur() {
		return regesCoprodFiniBur;
	}

	public void setRegesCoprodFiniBur(List<RegeCoprodFiniBur> regesCoprodFiniBur) {
		this.regesCoprodFiniBur = regesCoprodFiniBur;
	}

	public Set<CritereLogique> getCriteresLogiques() {
		return criteresLogiques;
	}

	public void setCriteresLogiques(Set<CritereLogique> criteresLogiques) {
		this.criteresLogiques = criteresLogiques;
	}

	public List<ReprodFiniBur> getReprodsFiniBur() {
		return reprodsFiniBur;
	}

	public void setReprodsFiniBur(List<ReprodFiniBur> reprodsFiniBur) {
		this.reprodsFiniBur = reprodsFiniBur;
	}

	public List<RegimeBurInterdit> getRegimesBurInterdit() {
		return regimesBurInterdit;
	}

	public void setRegimesBurInterdit(List<RegimeBurInterdit> regimesBurInterdit) {
		this.regimesBurInterdit = regimesBurInterdit;
	}

	public void setManifesteobligatoire(String manifesteobligatoire) {
		this.manifesteobligatoire = manifesteobligatoire;
	}

	public void setRcrepartition(String rcrepartition) {
		this.rcrepartition = rcrepartition;
	}

	/**
	 * Get accessor for persistent attribute : rclibelleburdouane
	 */
	public String getRclibelleburdouane() {
		return rclibelleburdouane;
	}

	/**
	 * Set accessor for persistent attribute : rclibelleburdouane
	 */
	public void setRclibelleburdouane(String rclibelleburdouane) {
		this.rclibelleburdouane = rclibelleburdouane;
	}

	/**
	 * Get accessor for persistent attribute : manifesteobligatoire
	 */
	public String getManifesteobligatoire() {
		return manifesteobligatoire;
	}

	/**
	 * Get accessor for persistent attribute: rcrepartition
	 */
	public String getRcrepartition() {
		return rcrepartition;
	}

	public CompBureau getCompBureau() {
		return compBureau;
	}

	public void setCompBureau(CompBureau compBureau) {
		this.compBureau = compBureau;
	}

	public GenreBureau getGenreBureau() {
		return genreBureau;
	}

	public void setGenreBureau(GenreBureau genreBureau) {
		this.genreBureau = genreBureau;
	}

	public TypeBureau getTypeBureau() {
		return typeBureau;
	}

	public void setTypeBureau(TypeBureau typeBureau) {
		this.typeBureau = typeBureau;
	}

	public String getRccodeburdouane() {
		return rccodeburdouane;
	}

	public void setRccodeburdouane(String rccodeburdouane) {
		this.rccodeburdouane = rccodeburdouane;
	}

	public List<AgentDouane> getAgentDouaneAffs() {
		return agentDouaneAffs;
	}

	public void setAgentDouaneAffs(List<AgentDouane> agentDouaneAffs) {
		this.agentDouaneAffs = agentDouaneAffs;
	}

	public List<AgentDouane> getAgentDouaneActs() {
		return agentDouaneActs;
	}

	public void setAgentDouaneActs(List<AgentDouane> agentDouaneActs) {
		this.agentDouaneActs = agentDouaneActs;
	}

	public List<BurModDecl> getBurModDecls() {
		return burModDecls;
	}

	public void setBurModDecls(List<BurModDecl> burModDecls) {
		this.burModDecls = burModDecls;
	}

	public Set<BureauDouaneTypeManifeste> getBureauDouaneTypeManif() {
		return bureauDouaneTypeManif;
	}

	public void setBureauDouaneTypeManif(
			Set<BureauDouaneTypeManifeste> bureauDouaneTypeManif) {
		this.bureauDouaneTypeManif = bureauDouaneTypeManif;
	}

	public String getRcCompetence() {
		return rcCompetence;
	}

	public void setRcCompetence(String rcCompetence) {
		this.rcCompetence = rcCompetence;
	}

	public Integer getRcTypeBurDouane() {
		return rcTypeBurDouane;
	}

	public void setRcTypeBurDouane(Integer rcTypeBurDouane) {
		this.rcTypeBurDouane = rcTypeBurDouane;
	}

	public String getRcGenreBur() {
		return rcGenreBur;
	}

	public void setRcGenreBur(String rcGenreBur) {
		this.rcGenreBur = rcGenreBur;
	}

	public List<BrouillonSegenMan> getListBrouillonEnreg() {
		return listBrouillonEnreg;
	}

	public void setListBrouillonEnreg(List<BrouillonSegenMan> listBrouillonEnreg) {
		this.listBrouillonEnreg = listBrouillonEnreg;
	}

	public List<BrouillonSegenMan> getListBrouillonEntree() {
		return listBrouillonEntree;
	}

	public void setListBrouillonEntree(
			List<BrouillonSegenMan> listBrouillonEntree) {
		this.listBrouillonEntree = listBrouillonEntree;
	}

	public List<BrouillonSegGenDec> getListBrouillonProvisaoire() {
		return listBrouillonProvisaoire;
	}

	public void setListBrouillonProvisaoire(
			List<BrouillonSegGenDec> listBrouillonProvisaoire) {
		this.listBrouillonProvisaoire = listBrouillonProvisaoire;
	}

	public List<BrouillonSegGenDec> getListBrouillonDestSen() {
		return listBrouillonDestSen;
	}

	public void setListBrouillonDestSen(
			List<BrouillonSegGenDec> listBrouillonDestSen) {
		this.listBrouillonDestSen = listBrouillonDestSen;
	}

	public List<BrouillonSegGenDec> getListBrouillonFrontiere() {
		return listBrouillonFrontiere;
	}

	public void setListBrouillonFrontiere(
			List<BrouillonSegGenDec> listBrouillonFrontiere) {
		this.listBrouillonFrontiere = listBrouillonFrontiere;
	}

	public List<BrouillonSegGenDec> getListBrouillonEnregManif() {
		return listBrouillonEnregManif;
	}

	public void setListBrouillonEnregManif(
			List<BrouillonSegGenDec> listBrouillonEnregManif) {
		this.listBrouillonEnregManif = listBrouillonEnregManif;
	}

	public List<BrouillonSegGenDec> getListBrouillonBur() {
		return listBrouillonBur;
	}

	public void setListBrouillonBur(List<BrouillonSegGenDec> listBrouillonBur) {
		this.listBrouillonBur = listBrouillonBur;
	}

	public List<DdeModifSegenDec> getListDdeModifSegen() {
		return listDdeModifSegen;
	}

	public void setListDdeModifSegen(List<DdeModifSegenDec> listDdeModifSegen) {
		this.listDdeModifSegen = listDdeModifSegen;
	}

	public List<SpecVerifProd> getListSpecVerifProd() {
		return listSpecVerifProd;
	}

	public void setListSpecVerifProd(List<SpecVerifProd> listSpecVerifProd) {
		this.listSpecVerifProd = listSpecVerifProd;
	}

	public List<SpecVerifRegime> getListSpecVerifRegime() {
		return listSpecVerifRegime;
	}

	public void setListSpecVerifRegime(List<SpecVerifRegime> listSpecVerifRegime) {
		this.listSpecVerifRegime = listSpecVerifRegime;
	}

	public List<LiquidArtDecl> getListLiquidArtDecl() {
		return listLiquidArtDecl;
	}

	public void setListLiquidArtDecl(List<LiquidArtDecl> listLiquidArtDecl) {
		this.listLiquidArtDecl = listLiquidArtDecl;
	}

	public List<HSegArtDec> getListHSegArtBurEnreg() {
		return listHSegArtBurEnreg;
	}

	public void setListHSegArtBurEnreg(List<HSegArtDec> listHSegArtBurEnreg) {
		this.listHSegArtBurEnreg = listHSegArtBurEnreg;
	}

	public List<HSegArtDec> getListHSegArtBurProv() {
		return listHSegArtBurProv;
	}

	public void setListHSegArtBurProv(List<HSegArtDec> listHSegArtBurProv) {
		this.listHSegArtBurProv = listHSegArtBurProv;
	}

	public List<CritereLocalBae> getListCritereLocalBae() {
		return listCritereLocalBae;
	}

	public void setListCritereLocalBae(List<CritereLocalBae> listCritereLocalBae) {
		this.listCritereLocalBae = listCritereLocalBae;
	}

	public List<ExclusionPpm> getListExclusionPpm() {
		return listExclusionPpm;
	}

	public void setListExclusionPpm(List<ExclusionPpm> listExclusionPpm) {
		this.listExclusionPpm = listExclusionPpm;
	}

	public List<UniteDeVisitePhysique> getListUniteDeVisitePhysique() {
		return listUniteDeVisitePhysique;
	}

	public void setListUniteDeVisitePhysique(
			List<UniteDeVisitePhysique> listUniteDeVisitePhysique) {
		this.listUniteDeVisitePhysique = listUniteDeVisitePhysique;
	}

	public Long getAgenda() {
		return agenda;
	}

	public void setAgenda(Long agenda) {
		this.agenda = agenda;
	}

	public Agenda getAgendas() {
		return agendas;
	}

	public void setAgendas(Agenda agendas) {
		this.agendas = agendas;
	}

	public Long getIdcompte() {
		return idcompte;
	}

	public void setIdcompte(Long idcompte) {
		this.idcompte = idcompte;
	}

	public Compte getCompte() {
		return compte;
	}

	public void setCompte(Compte compte) {
		this.compte = compte;
	}

	public List<Facture> getListFacture() {
		return listFacture;
	}

	public void setListFacture(List<Facture> listFacture) {
		this.listFacture = listFacture;
	}

	public List<Mad> getListMad() {
		return listMad;
	}

	public void setListMad(List<Mad> listMad) {
		this.listMad = listMad;
	}	

	public List<ArticleManifeste> getListArticleManifeste() {
		return listArticleManifeste;
	}

	public void setListArticleManifeste(List<ArticleManifeste> listArticleManifeste) {
		this.listArticleManifeste = listArticleManifeste;
	}
	

}
