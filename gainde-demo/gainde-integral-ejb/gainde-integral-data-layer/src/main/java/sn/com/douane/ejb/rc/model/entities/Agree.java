package sn.com.douane.ejb.rc.model.entities;

import java.io.Serializable;
import java.sql.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import sn.com.douane.ejb.declaration.model.entities.Declaration;
import sn.com.douane.ejb.declaration.model.entities.Sommiers;
import sn.com.douane.ejb.demat.model.entities.Compte;
import sn.com.douane.ejb.demat.model.entities.Facture;
/**
 * 
 * @author nesrine
 *
 */
@Entity
@Table(name="AGREE")
@NamedQueries(@NamedQuery(name = "findByCodeUser", 
	query = "select object(o)  from Agree o where o.rcCodePpm = ?1"))
public class Agree implements Serializable{

	private static final long serialVersionUID = -4188932272347833121L;

	@Id
	@Column(name="RCCODEAGREE", length=3, nullable=false)
	private String rcCodeAgree;

	@Column(name="RCCODEPPM", length=5, nullable=false)
	private String rcCodePpm; 
	
	@Column(name="RCSUSPENDU", length=1)
	private String rcSuspendu;

	@Column(name="RCRETRAIT", length=1)
	private String rcRetrait;
	
	@Column(name="RCETATAGREE", length=1)
	private String rcEtatAgree;
	 
	@Column(name="RCTYPEDECISION", length=1)
	private String rcTypeDecision;
	 
	@Column(name="RCNUMDECISION", length=50)
	private String rcNumDecision;
	 
	@Column(name="RCDATEDECISION")
	private Date rcDateDecision;
	
	@Column(name = "IDCOMPTE")
	private Long idcompte;		
	
	@ManyToOne
	@JoinColumn(name = "IDCOMPTE",referencedColumnName="IDCOMPTE", insertable = false, updatable = false)
	private Compte compte;
	 
	@ManyToOne(targetEntity = Ppm.class)
	@JoinColumn(name="RCCODEPPM", insertable=false, updatable=false)
	private Ppm ppmAgree;
	
	@OneToMany(mappedBy = "agree", targetEntity = Sommiers.class)
	private List<Sommiers> listAgree;
	
	@OneToMany(mappedBy = "agrees", targetEntity = Facture.class)
	private List<Facture> listFacture;		
	
	public Agree() {
	}

	public Agree(String rcCodeAgree, String rcCodePpm) {
		super();
		this.rcCodeAgree = rcCodeAgree;
		this.rcCodePpm = rcCodePpm;
	}

	public String getRcCodeAgree() {
		return rcCodeAgree;
	}

	public void setRcCodeAgree(String rcCodeAgree) {
		this.rcCodeAgree = rcCodeAgree;
	}

	public String getRcCodePpm() {
		return rcCodePpm;
	}

	public void setRcCodePpm(String rcCodePpm) {
		this.rcCodePpm = rcCodePpm;
	}

	public String getRcSuspendu() {
		return rcSuspendu;
	}

	public void setRcSuspendu(String rcSuspendu) {
		this.rcSuspendu = rcSuspendu;
	}

	public String getRcRetrait() {
		return rcRetrait;
	}

	public void setRcRetrait(String rcRetrait) {
		this.rcRetrait = rcRetrait;
	}

	public String getRcEtatAgree() {
		return rcEtatAgree;
	}

	public void setRcEtatAgree(String rcEtatAgree) {
		this.rcEtatAgree = rcEtatAgree;
	}

	public String getRcTypeDecision() {
		return rcTypeDecision;
	}

	public void setRcTypeDecision(String rcTypeDecision) {
		this.rcTypeDecision = rcTypeDecision;
	}

	public String getRcNumDecision() {
		return rcNumDecision;
	}

	public void setRcNumDecision(String rcNumDecision) {
		this.rcNumDecision = rcNumDecision;
	}

	public Date getRcDateDecision() {
		return rcDateDecision;
	}

	public void setRcDateDecision(Date rcDateDecision) {
		this.rcDateDecision = rcDateDecision;
	}

	public Ppm getPpmAgree() {
		return ppmAgree;
	}

	public void setPpmAgree(Ppm ppmAgree) {
		this.ppmAgree = ppmAgree;
	}

	public List<Sommiers> getListAgree() {
		return listAgree;
	}

	public void setListAgree(List<Sommiers> listAgree) {
		this.listAgree = listAgree;
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

	   
}
