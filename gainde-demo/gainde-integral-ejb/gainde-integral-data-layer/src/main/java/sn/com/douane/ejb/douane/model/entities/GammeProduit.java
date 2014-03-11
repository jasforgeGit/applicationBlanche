package sn.com.douane.ejb.douane.model.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.Table;

import sn.com.douane.ejb.douane.model.keys.GammeProduitKey;






@Entity
@IdClass(GammeProduitKey.class)
@Table(name="GAMMEPRODUIT")
public class GammeProduit implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 2511045752248902433L;
	
	@Id
	@Column(name="CODEPRODUIT", length=6, nullable=false)
	 private java.lang.String codeProduit;
	
	@Id
	@Column(name="NUMEROGAMME", length=5, nullable=false)
	    private java.lang.String numeroGamme;
	
	@Column(name="PRECUEMOA", length=2, nullable=false)
	 private java.lang.String precUemoa;
	
	@Column(name="PRECSEN", length=2, nullable=false)
	 private java.lang.String precSen;
	
	@Column(name="CODEDOCUMENT",columnDefinition="CHAR(1)",nullable=false)
	    private java.lang.String codeDocument;
	
	@Column(name="UTEFACTURATION", length=2)
	    private java.lang.String uteFacturation;
	
	@Column(name="QTEFACTUREE", columnDefinition="DECIMAL(5,0)")
	    private java.math.BigDecimal qteFacturee;
	
	@Column(name="VALFOB", columnDefinition="DECIMAL(11,2)")
	    private java.math.BigDecimal valFob;
	
	@Column(name="DEVFOB", length=3)
	    private java.lang.String devFob;
	
	@Column(name="COUT", columnDefinition="DECIMAL(11,2)")
	    private java.math.BigDecimal cout;
	
	@Column(name="DEVCOUT", length=3)
	    private java.lang.String devCout;
	
	@Column(name="VALCAF", columnDefinition="DECIMAL(11,2)")
	    private java.math.BigDecimal valcaf;
	
	@Column(name="DEVCAF", length=3)
	    private java.lang.String devCaf;
	
	@Column(name="CF",columnDefinition="DECIMAL(11,2)")
	    private java.math.BigDecimal cf;
	
	@Column(name="DEVCF",length=3)
	    private java.lang.String devcf;
	
	@Column(name="FRET",columnDefinition="DECIMAL(11,2)")
	    private java.math.BigDecimal fret;
	
	@Column(name="DEVFRET", length=3)
	    private java.lang.String devFret;
	
	@Column(name="CODEDOC", length=5)
	    private java.lang.String codeDoc;
	
	@Column(name="DATEDOC", length=15)
	    private java.lang.String dateDoc;
	
	@Column(name="LIEUFOB", length=50)
	    private java.lang.String lieuFob;
	
	@Column(name="INDICEDERISQUE", columnDefinition="CHAR(1)")
	    private java.lang.String indiceDeRisque;
	
	@Column(name="PAYSDOC", length=3)
	    private java.lang.String paysDoc;
	
	@Column(name="PAYSORIGINE", length=3, nullable=false)
	    private java.lang.String paysOrigine;
	
	@Column(name="MODECONDITIONNEMENT", length=4)
	    private java.lang.String modeConditionnement;

	
	
	public GammeProduit(String codeProduit, String numeroGamme,
			String precUemoa, String precSen, String codeDocument,
			String paysOrigine) {
		super();
		this.codeProduit = codeProduit;
		this.numeroGamme = numeroGamme;
		this.precUemoa = precUemoa;
		this.precSen = precSen;
		this.codeDocument = codeDocument;
		this.paysOrigine = paysOrigine;
	}
	
	

	public GammeProduit() {
		super();
		// TODO Auto-generated constructor stub
	}



	public java.lang.String getCodeProduit() {
		return codeProduit;
	}

	public void setCodeProduit(java.lang.String codeProduit) {
		this.codeProduit = codeProduit;
	}

	public java.lang.String getNumeroGamme() {
		return numeroGamme;
	}

	public void setNumeroGamme(java.lang.String numeroGamme) {
		this.numeroGamme = numeroGamme;
	}

	public java.lang.String getPrecUemoa() {
		return precUemoa;
	}

	public void setPrecUemoa(java.lang.String precUemoa) {
		this.precUemoa = precUemoa;
	}

	public java.lang.String getPrecSen() {
		return precSen;
	}

	public void setPrecSen(java.lang.String precSen) {
		this.precSen = precSen;
	}

	public java.lang.String getCodeDocument() {
		return codeDocument;
	}

	public void setCodeDocument(java.lang.String codeDocument) {
		this.codeDocument = codeDocument;
	}

	public java.lang.String getUteFacturation() {
		return uteFacturation;
	}

	public void setUteFacturation(java.lang.String uteFacturation) {
		this.uteFacturation = uteFacturation;
	}

	public java.math.BigDecimal getQteFacturee() {
		return qteFacturee;
	}

	public void setQteFacturee(java.math.BigDecimal qteFacturee) {
		this.qteFacturee = qteFacturee;
	}

	public java.math.BigDecimal getValFob() {
		return valFob;
	}

	public void setValFob(java.math.BigDecimal valFob) {
		this.valFob = valFob;
	}

	public java.lang.String getDevFob() {
		return devFob;
	}

	public void setDevFob(java.lang.String devFob) {
		this.devFob = devFob;
	}

	public java.math.BigDecimal getCout() {
		return cout;
	}

	public void setCout(java.math.BigDecimal cout) {
		this.cout = cout;
	}

	public java.lang.String getDevCout() {
		return devCout;
	}

	public void setDevCout(java.lang.String devCout) {
		this.devCout = devCout;
	}

	public java.math.BigDecimal getValcaf() {
		return valcaf;
	}

	public void setValcaf(java.math.BigDecimal valcaf) {
		this.valcaf = valcaf;
	}

	public java.lang.String getDevCaf() {
		return devCaf;
	}

	public void setDevCaf(java.lang.String devCaf) {
		this.devCaf = devCaf;
	}

	public java.math.BigDecimal getCf() {
		return cf;
	}

	public void setCf(java.math.BigDecimal cf) {
		this.cf = cf;
	}

	public java.lang.String getDevcf() {
		return devcf;
	}

	public void setDevcf(java.lang.String devcf) {
		this.devcf = devcf;
	}

	public java.math.BigDecimal getFret() {
		return fret;
	}

	public void setFret(java.math.BigDecimal fret) {
		this.fret = fret;
	}

	public java.lang.String getDevFret() {
		return devFret;
	}

	public void setDevFret(java.lang.String devFret) {
		this.devFret = devFret;
	}

	public java.lang.String getCodeDoc() {
		return codeDoc;
	}

	public void setCodeDoc(java.lang.String codeDoc) {
		this.codeDoc = codeDoc;
	}

	public java.lang.String getDateDoc() {
		return dateDoc;
	}

	public void setDateDoc(java.lang.String dateDoc) {
		this.dateDoc = dateDoc;
	}

	public java.lang.String getLieuFob() {
		return lieuFob;
	}

	public void setLieuFob(java.lang.String lieuFob) {
		this.lieuFob = lieuFob;
	}

	public java.lang.String getIndiceDeRisque() {
		return indiceDeRisque;
	}

	public void setIndiceDeRisque(java.lang.String indiceDeRisque) {
		this.indiceDeRisque = indiceDeRisque;
	}

	public java.lang.String getPaysDoc() {
		return paysDoc;
	}

	public void setPaysDoc(java.lang.String paysDoc) {
		this.paysDoc = paysDoc;
	}

	public java.lang.String getPaysOrigine() {
		return paysOrigine;
	}

	public void setPaysOrigine(java.lang.String paysOrigine) {
		this.paysOrigine = paysOrigine;
	}

	public java.lang.String getModeConditionnement() {
		return modeConditionnement;
	}

	public void setModeConditionnement(java.lang.String modeConditionnement) {
		this.modeConditionnement = modeConditionnement;
	}
	
	
	
}
