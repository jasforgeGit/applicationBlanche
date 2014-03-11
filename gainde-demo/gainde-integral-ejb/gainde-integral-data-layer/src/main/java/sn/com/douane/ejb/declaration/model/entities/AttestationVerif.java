package sn.com.douane.ejb.declaration.model.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

import sn.com.douane.ejb.declaration.model.keys.AttestationVerifKey;
import sn.com.douane.ejb.rc.model.entities.Ppm;
@Entity
@IdClass(AttestationVerifKey.class)
@Table(name = "ATTESTATIONVERIF")
@NamedQueries({@NamedQuery(name = "findByAV", query = "select object(o) from AttestationVerif o where  o.douAVsr = ?1 and  o.douAVPay = ?2"), 
			   @NamedQuery(name = "findByDPIAV", query = "select object(o) from AttestationVerif o where  o.douAVsr = ?1 and  o.douAVPay = ?2 and o.douNumDPI = ?3")})
public class AttestationVerif implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -5522476111221229563L;

	
	@Column(name="DOUDOCID" , columnDefinition="CHAR(10)" , nullable=false)
    private java.lang.String douDocId;
	
	@Column(name="DOUAVSRO" , length=1 , nullable=false)
    private java.lang.String douAVsro;

	@Id
	@Column(name="DOUAVSR" , length=6 , nullable=false)
    private java.lang.String douAVsr;
	
	@Id
	@Column(name="DOUAVPAY" , length=3 , nullable=false)
    private java.lang.String douAVPay;
	
	@Column(name="DOUCODEPPM" , length=5 , nullable=false)
    private java.lang.String douCodePPM;
	
	@Column(name="DOUNBRETRANS" , length=6 , nullable=false)
    private java.lang.String douNbreTrans;	
	
	@Column(name="DOUSCORE" , length=6 , nullable=false)
    private java.lang.String douScore;		
	
	@Column(name="DOUDATEMI" , length=10 , nullable=false)
    private java.lang.String douDateEmi;		
	
	@Column(name="DOUCIRCUIT" , length=1 , nullable=false)
    private java.lang.String douCircuit;	
	
	@Column(name="DOUPRODUIT" , length=10 , nullable=false)
    private java.lang.String douProduit;		
	
	@Column(name="DOUVALFOB" , length=15 , nullable=false)
    private java.lang.String douValFOB;		
	
	@Column(name="DOUQUANTITE" , length=9 , nullable=false)
    private java.lang.String douQuantite;		
	
	@Column(name="DOUUNITE" , length=40 , nullable=false)
    private java.lang.String douUnite;		
	
	@Column(name="DOUNUMART" , length=3 , nullable=false)
    private java.lang.String douNumArt;	
	
	@Column(name="DOUNOMPPM" , length=60 , nullable=false)
    private java.lang.String douNomPPM;		
	
	@Column(name="DOUSTATUTDPI" , length=1 , nullable=false)
    private java.lang.String douStatuDPI;		
	
	@Column(name="DOUTYPEINTERVENTION" , length=20 )
    private java.lang.String douTypeIntervention;		
	
	@Column(name="DOUNUMERODPI" , length=7 )
    private java.lang.String douNumDPI;	
	
	@Column(name="DOUDATEDPI" , length=10 )
    private java.lang.String douDateDPI;		
	
	@Column(name="DOUVERSION" , columnDefinition="CHAR(1)" )
    private java.lang.String douVersion;	
	
	@Column(name="DOUPAYPROV" , columnDefinition="CHAR(2)"  )
    private java.lang.String douPayProv;	
	
	@Column(name="DOUBATEAU" , length=50 )
    private java.lang.String douBateau;	
	
	@Column(name="DOUPAYORIG" , length=2 )
    private java.lang.String douPayOrig;		
	
	@ManyToOne(targetEntity = Ppm.class)
	@JoinColumn(name = "DOUCODEPPM", insertable = false, updatable = false, nullable = false)
	private Ppm ppm;

	public AttestationVerif() {
		super();
	}
	
	public AttestationVerif(String douDocId, String douAVsro, String douAVsr,
			String douAVPay, String douCodePPM, String douNbreTrans,
			String douScore, String douDateEmi, String douCircuit,
			String douProduit, String douValFOB, String douQuantite,
			String douUnite, String douNumArt, String douNomPPM,
			String douStatuDPI) {
		super();
		this.douDocId = douDocId;
		this.douAVsro = douAVsro;
		this.douAVsr = douAVsr;
		this.douAVPay = douAVPay;
		this.douCodePPM = douCodePPM;
		this.douNbreTrans = douNbreTrans;
		this.douScore = douScore;
		this.douDateEmi = douDateEmi;
		this.douCircuit = douCircuit;
		this.douProduit = douProduit;
		this.douValFOB = douValFOB;
		this.douQuantite = douQuantite;
		this.douUnite = douUnite;
		this.douNumArt = douNumArt;
		this.douNomPPM = douNomPPM;
		this.douStatuDPI = douStatuDPI;
	}


	public java.lang.String getDouDocId() {
		return douDocId;
	}

	public void setDouDocId(java.lang.String douDocId) {
		this.douDocId = douDocId;
	}

	public java.lang.String getDouAVsro() {
		return douAVsro;
	}

	public void setDouAVsro(java.lang.String douAVsro) {
		this.douAVsro = douAVsro;
	}

	public java.lang.String getDouAVsr() {
		return douAVsr;
	}

	public void setDouAVsr(java.lang.String douAVsr) {
		this.douAVsr = douAVsr;
	}

	public java.lang.String getDouAVPay() {
		return douAVPay;
	}

	public void setDouAVPay(java.lang.String douAVPay) {
		this.douAVPay = douAVPay;
	}

	public java.lang.String getDouCodePPM() {
		return douCodePPM;
	}

	public void setDouCodePPM(java.lang.String douCodePPM) {
		this.douCodePPM = douCodePPM;
	}

	public java.lang.String getDouNbreTrans() {
		return douNbreTrans;
	}

	public void setDouNbreTrans(java.lang.String douNbreTrans) {
		this.douNbreTrans = douNbreTrans;
	}

	public java.lang.String getDouScore() {
		return douScore;
	}

	public void setDouScore(java.lang.String douScore) {
		this.douScore = douScore;
	}

	public java.lang.String getDouDateEmi() {
		return douDateEmi;
	}

	public void setDouDateEmi(java.lang.String douDateEmi) {
		this.douDateEmi = douDateEmi;
	}

	public java.lang.String getDouCircuit() {
		return douCircuit;
	}

	public void setDouCircuit(java.lang.String douCircuit) {
		this.douCircuit = douCircuit;
	}

	public java.lang.String getDouProduit() {
		return douProduit;
	}

	public void setDouProduit(java.lang.String douProduit) {
		this.douProduit = douProduit;
	}

	public java.lang.String getDouValFOB() {
		return douValFOB;
	}

	public void setDouValFOB(java.lang.String douValFOB) {
		this.douValFOB = douValFOB;
	}

	public java.lang.String getDouQuantite() {
		return douQuantite;
	}

	public void setDouQuantite(java.lang.String douQuantite) {
		this.douQuantite = douQuantite;
	}

	public java.lang.String getDouUnite() {
		return douUnite;
	}

	public void setDouUnite(java.lang.String douUnite) {
		this.douUnite = douUnite;
	}

	public java.lang.String getDouNumArt() {
		return douNumArt;
	}

	public void setDouNumArt(java.lang.String douNumArt) {
		this.douNumArt = douNumArt;
	}

	public java.lang.String getDouNomPPM() {
		return douNomPPM;
	}

	public void setDouNomPPM(java.lang.String douNomPPM) {
		this.douNomPPM = douNomPPM;
	}

	public java.lang.String getDouStatuDPI() {
		return douStatuDPI;
	}

	public void setDouStatuDPI(java.lang.String douStatuDPI) {
		this.douStatuDPI = douStatuDPI;
	}

	public java.lang.String getDouTypeIntervention() {
		return douTypeIntervention;
	}

	public void setDouTypeIntervention(java.lang.String douTypeIntervention) {
		this.douTypeIntervention = douTypeIntervention;
	}

	public java.lang.String getDouNumDPI() {
		return douNumDPI;
	}

	public void setDouNumDPI(java.lang.String douNumDPI) {
		this.douNumDPI = douNumDPI;
	}

	public java.lang.String getDouDateDPI() {
		return douDateDPI;
	}

	public void setDouDateDPI(java.lang.String douDateDPI) {
		this.douDateDPI = douDateDPI;
	}

	public java.lang.String getDouVersion() {
		return douVersion;
	}

	public void setDouVersion(java.lang.String douVersion) {
		this.douVersion = douVersion;
	}

	public java.lang.String getDouPayProv() {
		return douPayProv;
	}

	public void setDouPayProv(java.lang.String douPayProv) {
		this.douPayProv = douPayProv;
	}

	public java.lang.String getDouBateau() {
		return douBateau;
	}

	public void setDouBateau(java.lang.String douBateau) {
		this.douBateau = douBateau;
	}

	public java.lang.String getDouPayOrig() {
		return douPayOrig;
	}

	public void setDouPayOrig(java.lang.String douPayOrig) {
		this.douPayOrig = douPayOrig;
	}

	public Ppm getPpm() {
		return ppm;
	}

	public void setPpm(Ppm ppm) {
		this.ppm = ppm;
	}
	
	
}
