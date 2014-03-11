package sn.com.douane.ejb.demat.model.entities;



import java.io.Serializable;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import sn.com.douane.ejb.manifeste.model.entities.SegmentGenManifeste;
import sn.com.douane.ejb.rc.model.entities.Agree;
import sn.com.douane.ejb.rc.model.entities.BureauDouane;

/**
 * The persistent class for the FACTURE database table.
 * 
 */
@Entity
@Table(name="FACTURE")
public class Facture implements Serializable {
	

	/**
	 * 
	 */
	private static final long serialVersionUID = -5309096821335147345L;

	@Id	
	@Column(name="IDFACTURE",nullable=false)
	private Long idFacture;
	
	@Column(name="VERSION", nullable=false)
	private int version;
	
	@Column(name="NUMERO",length=25)
	private String numero;
	
	@Column(name="DATEFACTURE")
	private Timestamp dateFacture;
	
	@Column(name="DATEECHEANCE")
	private Timestamp dateEcheance;
	
	@Column(name="MONTANTHT")	
	private double montantHt;
	
	@Column(name="NBDECLAR")	
	private int nbDeclar;
	
	@Column(name="LIBFACTURE",length=100)
	private String libFacture;
	
	@Column(name="STATUTFACTURE")	
	private int statutFacture;	
	
	@Column(name="REFERENCEVERSEMENT",length=100)
	private String referenceVersement;	
	
	@Column(name="REFERENCEBCEAO",length=100)
	private String referenceBceao;
	
	@Column(name="BUREAUDOUANE",nullable=false, length=3)
	private String bureauDouane;
	
	@Column(name="AGREE",nullable=false, length=3)
	private String agree;
	
	
	@Column(name="IDFICHIERATTACHE")	
	private Long idFichieRattache;

	@Column(name="PPM",columnDefinition="CHAR(5)",nullable=false)
	private String ppm;
	
	@Column(name="MONTANTTVA")
	private double montantTva;
	
	@ManyToOne
	@JoinColumn(name = "BUREAUDOUANE",referencedColumnName="RCCODEBURDOUANE", insertable = false, updatable = false)
	private BureauDouane bureauDouanes;
	
	@ManyToOne
	@JoinColumn(name = "AGREE",referencedColumnName="RCCODEAGREE", insertable = false, updatable = false)
	private Agree agrees;
	
	@OneToMany(mappedBy="facture")
	private List<DeclarationExt> declarationexts = new ArrayList<DeclarationExt>();
	
	@OneToMany(mappedBy="facture")
	private List<SegmentGenManifeste> factures = new ArrayList<SegmentGenManifeste>();
	
	
	
    public Facture() {
    }

	public String getAgree() {
		return this.agree;
	}

	public void setAgree(String agree) {
		this.agree = agree;
	}	

	
	public String getNumero() {
		return this.numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public String getPpm() {
		return this.ppm;
	}

	public void setPpm(String ppm) {
		this.ppm = ppm;
	}

	public int getVersion() {
		return this.version;
	}

	public void setVersion(int version) {
		this.version = version;
	}

	public List<DeclarationExt> getDeclarationexts() {
		return this.declarationexts;
	}

	public void setDeclarationexts(List<DeclarationExt> declarationexts) {
		this.declarationexts = declarationexts;
	}

	public long getIdFacture() {
		return idFacture;
	}

	public void setIdFacture(long idFacture) {
		this.idFacture = idFacture;
	}

	public Timestamp getDateFacture() {
		return dateFacture;
	}

	public void setDateFacture(Timestamp dateFacture) {
		this.dateFacture = dateFacture;
	}

	public Timestamp getDateEcheance() {
		return dateEcheance;
	}

	public void setDateEcheance(Timestamp dateEcheance) {
		this.dateEcheance = dateEcheance;
	}

	public double getMontantHt() {
		return montantHt;
	}

	public void setMontantHt(double montantHt) {
		this.montantHt = montantHt;
	}

	public int getNbDeclar() {
		return nbDeclar;
	}

	public void setNbDeclar(int nbDeclar) {
		this.nbDeclar = nbDeclar;
	}

	public String getLibFacture() {
		return libFacture;
	}

	public void setLibFacture(String libFacture) {
		this.libFacture = libFacture;
	}

	public int getStatutFacture() {
		return statutFacture;
	}

	public void setStatutFacture(int statutFacture) {
		this.statutFacture = statutFacture;
	}

	public String getReferenceVersement() {
		return referenceVersement;
	}

	public void setReferenceVersement(String referenceVersement) {
		this.referenceVersement = referenceVersement;
	}

	public String getReferenceBceao() {
		return referenceBceao;
	}

	public void setReferenceBceao(String referenceBceao) {
		this.referenceBceao = referenceBceao;
	}

	public String getBureauDouane() {
		return bureauDouane;
	}

	public void setBureauDouane(String bureauDouane) {
		this.bureauDouane = bureauDouane;
	}

	public Long getIdFichieRattache() {
		return idFichieRattache;
	}

	public void setIdFichieRattache(Long idFichieRattache) {
		this.idFichieRattache = idFichieRattache;
	}

	public double getMontantTva() {
		return montantTva;
	}

	public void setMontantTva(double montantTva) {
		this.montantTva = montantTva;
	}

	public BureauDouane getBureauDouanes() {
		return bureauDouanes;
	}

	public void setBureauDouanes(BureauDouane bureauDouanes) {
		this.bureauDouanes = bureauDouanes;
	}

	public Agree getAgrees() {
		return agrees;
	}

	public void setAgrees(Agree agrees) {
		this.agrees = agrees;
	}	

	public List<SegmentGenManifeste> getFactures() {
		return factures;
	}

	public void setFactures(List<SegmentGenManifeste> factures) {
		this.factures = factures;
	}
	
	
	
	
}