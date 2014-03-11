package sn.com.douane.ejb.demat.model.entities;

import java.io.Serializable;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import sn.com.douane.ejb.manifeste.model.entities.ArticleManifeste;
import sn.com.douane.ejb.manifeste.model.entities.ConteneurArticle;
import sn.com.douane.ejb.rc.model.entities.Mad;

/**
 * The persistent class for the DECLARATIONEXT database table.
 * 
 */
@Entity
@Table(name = "DECLARATIONEXT")
public class DeclarationExt implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 6589374851191865355L;

	@Id
	@Column(name = "IDDECLTRANSFERT",nullable = false)
	private Long idDeclTransfert;

	@Column(name = "VERSION", nullable = false)
	private int version;

	@Column(name = "NUMDEMANDE", length = 15)
	private String numDemande;

	@Column(name = "NUMENREGDEC", length = 15)
	private String numenregdec;

	@Column(name = "DATE")
	private Timestamp date;

	@Column(name = "ETAT")
	private int etat;

	@Column(name = "TYPE")
	private int type;

	@Column(name = "STATUT")
	private int statut;

	@Column(name = "CODEPROVENANCE", nullable = false, length = 10)
	private String codeProvenance;

	@Column(name = "CODEDESTINATION", length = 10)
	private String codeDestination;

	@Column(name = "IDFACTURE")
	private Long idFacture;

	@Column(name = "CODECONSIGNATAIRE", nullable = false, length = 5)
	private String codeConsignataire;

	@Column(name = "CONCODECONSIGNATAIRE", length = 3)
	private String conCodeConsignataire;

	@Column(name = "CONANNEEENREGMANIF", length = 4)
	private String conAnneeEnregManif;

	@Column(name = "ANNEEENGMANIF", length = 4)
	private String anneeEngManif;

	@Column(name = "NUMENREGMANIF")
	private int numEnregManif;

	@Column(name = "NUMARTICLEMANIF")
	private int numArticleManif;

	@Column(name = "PRECISARTMANIF")
	private int precisArtManif;

	@Column(name = "PRECISARTMANIF2")
	private int precisArtManif2;

	@Column(name = "IDPROFILEDEST")
	private long idProfileDest;

	@Column(name = "DATEDERNMODIF")
	private Timestamp dateDernModif;

	@Column(name = "IDUSERDERNMODIF")
	private long idUserDernModif;

	@Column(name = "ACTIONDERNMODIF")
	private int actionDernModif;

	@Column(name = "BUREAUENREG", length = 3)
	private String bureauEnreg;

	@Column(name = "ANNEEENREG", length = 4)
	private String anneeEnreg;

	@Column(name = "MOTIFREJETCB", length = 255)
	private String motifRejetcb;

	@Column(name = "MOTIFSUSPENSION", length = 255)
	private String motifSuspension;

	@Column(name = "MOTIFREJETCX", length = 255)
	private String motifRejetcx;

	@Column(name = "IDFICHIERATTACHE")
	private Long idFichieRattache;

	@Column(name = "NUMEROMANIFESTE", length = 50)
	private String numeroManifeste;

	@Column(name = "ETATTSC")
	private int etatTsc;

	@Column(name = "ETATSIGNATURE", length = 5)
	private String etatSignature;

	@Column(name = "CONNUMREPMANIF", length = 6)
	private String conNumRepManif;

	@Column(name = "BUREAUENGMANIF", length = 3)
	private String bureauEngManif;

	@ManyToOne
	@JoinColumn(name = "IDFACTURE", insertable = false, updatable = false)
	private Facture facture;
	
	@ManyToOne
	@JoinColumn(name = "CODEPROVENANCE", insertable = false, updatable = false)
	private Mad codeMadProvenance;
	
	@ManyToOne
	@JoinColumn(name = "CODEDESTINATION", insertable = false, updatable = false)
	private Mad codeMadDestination;	
	
	@OneToOne
	    @JoinColumns( {
		  @JoinColumn(name="BUREAUENGMANIF", referencedColumnName="MANIFBUREAUENGMANIF", insertable=false, updatable=false), 
		  @JoinColumn(name="ANNEEENGMANIF", referencedColumnName="MANIFANNEEENGMANIF", insertable=false, updatable=false),
		  @JoinColumn(name="NUMENREGMANIF", referencedColumnName="MANIFNUMENREGMANIF", insertable=false, updatable=false),
		  @JoinColumn(name="NUMARTICLEMANIF", referencedColumnName="MANIFNUMARTICLEMANIF", insertable=false, updatable=false),
		  @JoinColumn(name="PRECISARTMANIF", referencedColumnName="MANIFPRECISARTMANIF", insertable=false, updatable=false),
		  @JoinColumn(name="PRECISARTMANIF2", referencedColumnName="MANIFPRECISARTMANIF2", insertable=false, updatable=false)
		  })	
	private ArticleManifeste articleManifeste;	
	
	@OneToMany(mappedBy = "declarationExt")
	private List<ConteneurArticle> listConteneurArticle = new ArrayList<ConteneurArticle>();
	

	public DeclarationExt() {

	}

	public Long getIdDeclTransfert() {
		return idDeclTransfert;
	}

	public void setIdDeclTransfert(Long idDeclTransfert) {
		this.idDeclTransfert = idDeclTransfert;
	}

	public int getVersion() {
		return version;
	}

	public void setVersion(int version) {
		this.version = version;
	}

	public String getNumDemande() {
		return numDemande;
	}

	public void setNumDemande(String numDemande) {
		this.numDemande = numDemande;
	}

	public String getNumenregdec() {
		return numenregdec;
	}

	public void setNumenregdec(String numenregdec) {
		this.numenregdec = numenregdec;
	}

	public Timestamp getDate() {
		return date;
	}

	public void setDate(Timestamp date) {
		this.date = date;
	}

	public int getEtat() {
		return etat;
	}

	public void setEtat(int etat) {
		this.etat = etat;
	}

	public int getType() {
		return type;
	}

	public void setType(int type) {
		this.type = type;
	}

	public int getStatut() {
		return statut;
	}

	public void setStatut(int statut) {
		this.statut = statut;
	}

	public String getCodeProvenance() {
		return codeProvenance;
	}

	public void setCodeProvenance(String codeProvenance) {
		this.codeProvenance = codeProvenance;
	}

	public String getCodeDestination() {
		return codeDestination;
	}

	public void setCodeDestination(String codeDestination) {
		this.codeDestination = codeDestination;
	}

	public Long getIdFacture() {
		return idFacture;
	}

	public void setIdFacture(Long idFacture) {
		this.idFacture = idFacture;
	}

	public String getCodeConsignataire() {
		return codeConsignataire;
	}

	public void setCodeConsignataire(String codeConsignataire) {
		this.codeConsignataire = codeConsignataire;
	}

	public String getConCodeConsignataire() {
		return conCodeConsignataire;
	}

	public void setConCodeConsignataire(String conCodeConsignataire) {
		this.conCodeConsignataire = conCodeConsignataire;
	}

	public String getConAnneeEnregManif() {
		return conAnneeEnregManif;
	}

	public void setConAnneeEnregManif(String conAnneeEnregManif) {
		this.conAnneeEnregManif = conAnneeEnregManif;
	}

	public String getAnneeEngManif() {
		return anneeEngManif;
	}

	public void setAnneeEngManif(String anneeEngManif) {
		this.anneeEngManif = anneeEngManif;
	}

	public int getNumEnregManif() {
		return numEnregManif;
	}

	public void setNumEnregManif(int numEnregManif) {
		this.numEnregManif = numEnregManif;
	}

	public int getNumArticleManif() {
		return numArticleManif;
	}

	public void setNumArticleManif(int numArticleManif) {
		this.numArticleManif = numArticleManif;
	}

	public int getPrecisArtManif() {
		return precisArtManif;
	}

	public void setPrecisArtManif(int precisArtManif) {
		this.precisArtManif = precisArtManif;
	}

	public int getPrecisArtManif2() {
		return precisArtManif2;
	}

	public void setPrecisArtManif2(int precisArtManif2) {
		this.precisArtManif2 = precisArtManif2;
	}

	public long getIdProfileDest() {
		return idProfileDest;
	}

	public void setIdProfileDest(long idProfileDest) {
		this.idProfileDest = idProfileDest;
	}

	public Timestamp getDateDernModif() {
		return dateDernModif;
	}

	public void setDateDernModif(Timestamp dateDernModif) {
		this.dateDernModif = dateDernModif;
	}

	public long getIdUserDernModif() {
		return idUserDernModif;
	}

	public void setIdUserDernModif(long idUserDernModif) {
		this.idUserDernModif = idUserDernModif;
	}

	public int getActionDernModif() {
		return actionDernModif;
	}

	public void setActionDernModif(int actionDernModif) {
		this.actionDernModif = actionDernModif;
	}

	public String getBureauEnreg() {
		return bureauEnreg;
	}

	public void setBureauEnreg(String bureauEnreg) {
		this.bureauEnreg = bureauEnreg;
	}

	public String getAnneeEnreg() {
		return anneeEnreg;
	}

	public void setAnneeEnreg(String anneeEnreg) {
		this.anneeEnreg = anneeEnreg;
	}

	public String getMotifRejetcb() {
		return motifRejetcb;
	}

	public void setMotifRejetcb(String motifRejetcb) {
		this.motifRejetcb = motifRejetcb;
	}

	public String getMotifSuspension() {
		return motifSuspension;
	}

	public void setMotifSuspension(String motifSuspension) {
		this.motifSuspension = motifSuspension;
	}

	public String getMotifRejetcx() {
		return motifRejetcx;
	}

	public void setMotifRejetcx(String motifRejetcx) {
		this.motifRejetcx = motifRejetcx;
	}

	public Long getIdFichieRattache() {
		return idFichieRattache;
	}

	public void setIdFichieRattache(Long idFichieRattache) {
		this.idFichieRattache = idFichieRattache;
	}

	public String getNumeroManifeste() {
		return numeroManifeste;
	}

	public void setNumeroManifeste(String numeroManifeste) {
		this.numeroManifeste = numeroManifeste;
	}

	public int getEtatTsc() {
		return etatTsc;
	}

	public void setEtatTsc(int etatTsc) {
		this.etatTsc = etatTsc;
	}

	public String getEtatSignature() {
		return etatSignature;
	}

	public void setEtatSignature(String etatSignature) {
		this.etatSignature = etatSignature;
	}

	public String getConNumRepManif() {
		return conNumRepManif;
	}

	public void setConNumRepManif(String conNumRepManif) {
		this.conNumRepManif = conNumRepManif;
	}

	public String getBureauEngManif() {
		return bureauEngManif;
	}

	public void setBureauEngManif(String bureauEngManif) {
		this.bureauEngManif = bureauEngManif;
	}

	public Facture getFacture() {
		return facture;
	}

	public void setFacture(Facture facture) {
		this.facture = facture;
	}

	public ArticleManifeste getArticleManifeste() {
		return articleManifeste;
	}

	public void setArticleManifeste(ArticleManifeste articleManifeste) {
		this.articleManifeste = articleManifeste;
	}

	public Mad getCodeMadProvenance() {
		return codeMadProvenance;
	}

	public void setCodeMadProvenance(Mad codeMadProvenance) {
		this.codeMadProvenance = codeMadProvenance;
	}

	public Mad getCodeMadDestination() {
		return codeMadDestination;
	}

	public void setCodeMadDestination(Mad codeMadDestination) {
		this.codeMadDestination = codeMadDestination;
	}

	public List<ConteneurArticle> getListConteneurArticle() {
		return listConteneurArticle;
	}

	public void setListConteneurArticle(List<ConteneurArticle> listConteneurArticle) {
		this.listConteneurArticle = listConteneurArticle;
	}
	
	
	
	

}