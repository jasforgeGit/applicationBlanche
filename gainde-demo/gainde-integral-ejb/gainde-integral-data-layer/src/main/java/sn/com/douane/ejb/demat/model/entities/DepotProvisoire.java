package sn.com.douane.ejb.demat.model.entities;

import java.io.Serializable;
import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Version;

import sn.com.douane.ejb.rc.model.entities.Agree;
import sn.com.douane.ejb.rc.model.entities.BureauDouane;


/**
 * @author amba Bean implementation class for Enterprise Bean:
 *         DepotProvisoire
 */

@Entity
@Table(name = "DEPOTPROVISOIRE")
public class DepotProvisoire implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Id 
	@Column(name = "IDDEPOTPROVISOIRE", nullable = false)
	private Long idDepotProvisoire;
	
	@Version
	@Column(name= "VERSION", nullable = false)
	private Integer version;
	
	@Column(name = "NUMDEMANDE", length = 35)
	private String numDemande;
	
	@Column(name = "NUMPROVISOIRE", length = 35)
	private String numProvisoire;
	
	@Column(name = "DATE")
	private Timestamp date;
	
	@Column(name = "ETATDEPOTPROVISOIRE", nullable = false)
	private Integer etatDepotProvisoire;
	
	@Column(name = "RCCODEAGREE", length = 3)
	private String rcCodeAgree;
	
	@Column(name = "BUREAUENREG", length = 3)
	private String bureauEnreg;
	
	@Column(name = "NOMDOCUMENT", length = 50)
	private String nomDocument;
	
//	@Column(name = "RCCODECREDITAIRE", length = 3)
//	private String rcCodeCreditaire;
	
	@ManyToOne(targetEntity = Agree.class)
	@JoinColumn(name = "RCCODEAGREE",referencedColumnName="RCCODEAGREE",  insertable = false, updatable = false)
	private Agree agree;
	
	@ManyToOne(targetEntity = BureauDouane.class)
	@JoinColumn(name = "BUREAUENREG", referencedColumnName="RCCODEBURDOUANE", insertable = false, updatable = false)
	private BureauDouane bureauDouane;

	public Long getIdDepotProvisoire() {
		return idDepotProvisoire;
	}

	public void setIdDepotProvisoire(Long idDepotProvisoire) {
		this.idDepotProvisoire = idDepotProvisoire;
	}

	public String getNumDemande() {
		return numDemande;
	}

	public void setNumDemande(String numDemande) {
		this.numDemande = numDemande;
	}

	public String getNumProvisoire() {
		return numProvisoire;
	}

	public void setNumProvisoire(String numProvisoire) {
		this.numProvisoire = numProvisoire;
	}

	public Timestamp getDate() {
		return date;
	}

	public void setDate(Timestamp date) {
		this.date = date;
	}

	public String getNomDocument() {
		return nomDocument;
	}

	public void setNomDocument(String nomDocument) {
		this.nomDocument = nomDocument;
	}

//	public String getRcCodeCreditaire() {
//		return rcCodeCreditaire;
//	}
//
//	public void setRcCodeCreditaire(String rcCodeCreditaire) {
//		this.rcCodeCreditaire = rcCodeCreditaire;
//	}


	public Integer getEtatDepotProvisoire() {
		return etatDepotProvisoire;
	}

	public void setEtatDepotProvisoire(Integer etatDepotProvisoire) {
		this.etatDepotProvisoire = etatDepotProvisoire;
	}

	public String getRcCodeAgree() {
		return rcCodeAgree;
	}

	public void setRcCodeAgree(String rcCodeAgree) {
		this.rcCodeAgree = rcCodeAgree;
	}

	public String getBureauEnreg() {
		return bureauEnreg;
	}

	public void setBureauEnreg(String bureauEnreg) {
		this.bureauEnreg = bureauEnreg;
	}

	public Agree getAgree() {
		return agree;
	}

	public void setAgree(Agree agree) {
		this.agree = agree;
	}

	public BureauDouane getBureauDouane() {
		return bureauDouane;
	}

	public void setBureauDouane(BureauDouane bureauDouane) {
		this.bureauDouane = bureauDouane;
	}

	public Integer getVersion() {
		return version;
	}

	public void setVersion(Integer version) {
		this.version = version;
	}
	
	

}
