package sn.com.douane.ejb.rc.model.entities;

import java.io.Serializable;
import java.sql.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import sn.com.douane.ejb.demat.model.entities.Compte;
import sn.com.douane.ejb.manifeste.model.entities.ArticleManifeste;
import sn.com.douane.ejb.manifeste.model.entities.BrouillonSegenMan;
/**
 * 
 * @author nesrine
 *
 */
@Entity
@Table(name="CONSIGNATAIRES")
public class Consignataire implements Serializable {

	private static final long serialVersionUID = 2978080234857052991L;
	
	@Id
	@Column(name="RCCODECONSIGNATAIRE", length=3, nullable=false)
	private String rcCodeConsignataire;
	 
	@Column(name="RCCODEPPM", length=5)
	private String rcCodePpm;
	
	@Column(name="RCDATECREATIONCONSIG")
	private Date rcDateCreationConsig;
	
	@Column(name="RCCODEPARTIEL", length=1)
	private String rcCodePartiel;
	
	@Column(name="RCDATEPARTIEL")
	private Date rcDatePartiel;
	
	@Column(name="RCNUMSUSPENSION", length=15)
	private String rcNumSuspension;
	
	@Column(name="RCNUMRETRAITCARTEIE", length=6)
	private String rcNumRetraitCarteie;
	
	@Column(name="RCRETRAITCREDIT")
	private Date rcRetraitCredit;
	
	@Column(name="RCDATESUSPENSION")
	private Date rcDateSuspension;
	
	@Column(name="RCINDSUSPENSCREDIT", length=1)
	private String rcIndSuspensCredit;
	
	@Column(name="RCNUMDECISION", length=50)
	private String rcNumDecision;
	
	@Column(name="RCDATEDECISION")
	private Date rcDateDecision;
	
	@Column(name = "IDCOMPTE")
	private Long idcompte;		
	
	@ManyToOne
	@JoinColumn(name = "IDCOMPTE",referencedColumnName="IDCOMPTE", insertable = false, updatable = false)
	private Compte compte;
	
	@OneToMany(mappedBy = "consigScoreC", targetEntity = ScoreConsignataire.class)
	private List<ScoreConsignataire> scoreConsignataires;
	
	@OneToMany(mappedBy = "consignataire",targetEntity = BrouillonSegenMan.class)
	private List<Consignataire> listConsignataire;	
	
	@OneToMany(mappedBy = "consignataire",targetEntity = ArticleManifeste.class)
	private List<ArticleManifeste> listArticleManifeste;

	public Consignataire() {
	}

	public Consignataire(String rcCodeConsignataire) {
		super();
		this.rcCodeConsignataire = rcCodeConsignataire;
	}

	public String getRcCodeConsignataire() {
		return rcCodeConsignataire;
	}

	public void setRcCodeConsignataire(String rcCodeConsignataire) {
		this.rcCodeConsignataire = rcCodeConsignataire;
	}

	public java.lang.String getRcCodePpm() {
		return rcCodePpm;
	}

	public void setRcCodePpm(java.lang.String rcCodePpm) {
		this.rcCodePpm = rcCodePpm;
	}

	public java.sql.Date getRcDateCreationConsig() {
		return rcDateCreationConsig;
	}

	public void setRcDateCreationConsig(java.sql.Date rcDateCreationConsig) {
		this.rcDateCreationConsig = rcDateCreationConsig;
	}

	public java.lang.String getRcCodePartiel() {
		return rcCodePartiel;
	}

	public void setRcCodePartiel(java.lang.String rcCodePartiel) {
		this.rcCodePartiel = rcCodePartiel;
	}

	public java.sql.Date getRcDatePartiel() {
		return rcDatePartiel;
	}

	public void setRcDatePartiel(java.sql.Date rcDatePartiel) {
		this.rcDatePartiel = rcDatePartiel;
	}

	public java.lang.String getRcNumSuspension() {
		return rcNumSuspension;
	}

	public void setRcNumSuspension(java.lang.String rcNumSuspension) {
		this.rcNumSuspension = rcNumSuspension;
	}

	public java.lang.String getRcNumRetraitCarteie() {
		return rcNumRetraitCarteie;
	}

	public void setRcNumRetraitCarteie(java.lang.String rcNumRetraitCarteie) {
		this.rcNumRetraitCarteie = rcNumRetraitCarteie;
	}

	public java.sql.Date getRcRetraitCredit() {
		return rcRetraitCredit;
	}

	public void setRcRetraitCredit(java.sql.Date rcRetraitCredit) {
		this.rcRetraitCredit = rcRetraitCredit;
	}

	public java.sql.Date getRcDateSuspension() {
		return rcDateSuspension;
	}

	public void setRcDateSuspension(java.sql.Date rcDateSuspension) {
		this.rcDateSuspension = rcDateSuspension;
	}

	public java.lang.String getRcIndSuspensCredit() {
		return rcIndSuspensCredit;
	}

	public void setRcIndSuspensCredit(java.lang.String rcIndSuspensCredit) {
		this.rcIndSuspensCredit = rcIndSuspensCredit;
	}

	public java.lang.String getRcNumDecision() {
		return rcNumDecision;
	}

	public void setRcNumDecision(java.lang.String rcNumDecision) {
		this.rcNumDecision = rcNumDecision;
	}

	public java.sql.Date getRcDateDecision() {
		return rcDateDecision;
	}

	public void setRcDateDecision(java.sql.Date rcDateDecision) {
		this.rcDateDecision = rcDateDecision;
	}

	public List<ScoreConsignataire> getScoreConsignataires() {
		return scoreConsignataires;
	}

	public void setScoreConsignataires(List<ScoreConsignataire> scoreConsignataires) {
		this.scoreConsignataires = scoreConsignataires;
	}

	public List<Consignataire> getListConsignataire() {
		return listConsignataire;
	}

	public void setListConsignataire(List<Consignataire> listConsignataire) {
		this.listConsignataire = listConsignataire;
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

	public List<ArticleManifeste> getListArticleManifeste() {
		return listArticleManifeste;
	}

	public void setListArticleManifeste(List<ArticleManifeste> listArticleManifeste) {
		this.listArticleManifeste = listArticleManifeste;
	}	


}
