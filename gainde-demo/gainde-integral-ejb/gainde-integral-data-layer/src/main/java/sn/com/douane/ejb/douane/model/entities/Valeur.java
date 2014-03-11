package sn.com.douane.ejb.douane.model.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

import javax.persistence.Table;



@Entity
@Table(name="VALEUR")
public class Valeur  implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 2511045752248902433L;
	
	
	@Id
	@Column(name="NUMEROFICHE",  nullable=false)
	private java.lang.Integer numeroFiche;
	
	@Column(name="COMPTEUR", nullable=false)
    private java.lang.Integer compteur;
	
	@Column(name="POSITIONTARIFAIRE", length=15, nullable=false)
    private java.lang.String positionTarifaire;
	
	@Column(name="ORIGINE", length=3, nullable=false)
    private java.lang.String origine;
	
	@Column(name="MODECONDITIONNEMENT", length=4)
    private java.lang.String modeConditionnement;
	
	@Column(name="UNITEFACTURATION", length=5)
    private java.lang.String uniteFacturation;
	
	@Column(name="PAYSPROVENANCE", length=4)
    private java.lang.String paysProvenance;
	
	@Column(name="PAYSDESTINATION", length=3)
    private java.lang.String paysDestination;
	
	@Column(name="CODEDOCUMENT", columnDefinition="CHAR(1)")
    private java.lang.String codeDocument;
	
	@Column(name="NUMERODOCUMENT", length=50)
    private java.lang.String numeroDocument;
	
	@Column(name="DATEDOCUMENT", length=10)
    private java.lang.String dateDocument;
	
	@Column(name="PAYSDOC", length=3)
    private java.lang.String paysDoc;
	
	@Column(name="COUT", columnDefinition="DECIMAL(11,2)")
    private java.math.BigDecimal cout;
	
	@Column(name="UNITEMONETAIRECOUT", length=10,nullable=false)
    private java.lang.String uniteMonetaireCout;
	
	@Column(name="FRET", columnDefinition="DECIMAL(11,2)")
    private java.math.BigDecimal Fret;
	
	@Column(name="UNITEMONETAIREFRET", length=10)
    private java.lang.String UniteMonetaireFret;
	
	@Column(name="ASSURANCES", columnDefinition="DECIMAL(11,2)")
    private java.math.BigDecimal assurances;
	
	@Column(name="UNITEMONETAIREASSURANCES", length=10)
    private java.lang.String uniteMonetaireAssurances;
	
	@Column(name="CF", columnDefinition="DECIMAL(11,2)")
    private java.math.BigDecimal cf;
	
	@Column(name="UNITETEMONETAIRECF", length=10)
    private java.lang.String uniteTeMonetaireCf;
	
	@Column(name="VALEURFOB", columnDefinition="DECIMAL(11,2)")
    private java.math.BigDecimal valeurFob;
	
	@Column(name="UNITEMONETAIREVALFOB", length=10)
    private java.lang.String uniteMonetaireValFob;
	
	@Column(name="VALEURCAF",columnDefinition="DECIMAL(11,2)")
    private java.math.BigDecimal valeurCaf;
	
	@Column(name="UNITEMONETAIRECAF", length=10)
    private java.lang.String uniteMonetaireCaf;
	
	@Column(name="LIEUFOB", length=50)
	private java.lang.String lieuFob;
	
	@Column(name="AUTRESINFOS", length=50)
    private java.lang.String autresInfos;
	
	@Column(name="DATESAISIE", length=10)
    private java.lang.String dateSaisie;
	
	@Column(name="HEURESAISIE", length=10)
    private java.lang.String heureSaisie;
	
	@Column(name="DATEDERNIEREMAJ", length=10)
    private java.lang.String dateDerniereMaj;
	
	@Column(name="HEUREDERNIEREMAJ", length=10)
    private java.lang.String heureDerniereMaj;
	
	@Column(name="QUANTITE", columnDefinition="DECIMAL(11,2)")
    private java.math.BigDecimal quantite;
	
	@Column(name="INDICERISQUE", columnDefinition="CHAR(1)")
    private java.lang.String indiceRisque;
	
	@Column(name="DESIGNATIONCOMMERCIALE", length=100)
    private java.lang.String designationCommerciale;

	

	public Valeur(Integer numeroFiche, Integer compteur,
			String positionTarifaire, String origine, String uniteMonetaireCout) {
		super();
		this.numeroFiche = numeroFiche;
		this.compteur = compteur;
		this.positionTarifaire = positionTarifaire;
		this.origine = origine;
		this.uniteMonetaireCout = uniteMonetaireCout;
	}

	public Valeur() {
		super();
		// TODO Auto-generated constructor stub
	}

	public java.lang.Integer getNumeroFiche() {
		return numeroFiche;
	}

	public void setNumeroFiche(java.lang.Integer numeroFiche) {
		this.numeroFiche = numeroFiche;
	}

	public java.lang.Integer getCompteur() {
		return compteur;
	}

	public void setCompteur(java.lang.Integer compteur) {
		this.compteur = compteur;
	}

	public java.lang.String getPositionTarifaire() {
		return positionTarifaire;
	}

	public void setPositionTarifaire(java.lang.String positionTarifaire) {
		this.positionTarifaire = positionTarifaire;
	}

	public java.lang.String getOrigine() {
		return origine;
	}

	public void setOrigine(java.lang.String origine) {
		this.origine = origine;
	}

	public java.lang.String getModeConditionnement() {
		return modeConditionnement;
	}

	public void setModeConditionnement(java.lang.String modeConditionnement) {
		this.modeConditionnement = modeConditionnement;
	}

	public java.lang.String getUniteFacturation() {
		return uniteFacturation;
	}

	public void setUniteFacturation(java.lang.String uniteFacturation) {
		this.uniteFacturation = uniteFacturation;
	}

	public java.lang.String getPaysProvenance() {
		return paysProvenance;
	}

	public void setPaysProvenance(java.lang.String paysProvenance) {
		this.paysProvenance = paysProvenance;
	}

	public java.lang.String getPaysDestination() {
		return paysDestination;
	}

	public void setPaysDestination(java.lang.String paysDestination) {
		this.paysDestination = paysDestination;
	}

	public java.lang.String getCodeDocument() {
		return codeDocument;
	}

	public void setCodeDocument(java.lang.String codeDocument) {
		this.codeDocument = codeDocument;
	}

	public java.lang.String getNumeroDocument() {
		return numeroDocument;
	}

	public void setNumeroDocument(java.lang.String numeroDocument) {
		this.numeroDocument = numeroDocument;
	}

	public java.lang.String getDateDocument() {
		return dateDocument;
	}

	public void setDateDocument(java.lang.String dateDocument) {
		this.dateDocument = dateDocument;
	}

	public java.lang.String getPaysDoc() {
		return paysDoc;
	}

	public void setPaysDoc(java.lang.String paysDoc) {
		this.paysDoc = paysDoc;
	}

	public java.math.BigDecimal getCout() {
		return cout;
	}

	public void setCout(java.math.BigDecimal cout) {
		this.cout = cout;
	}

	public java.lang.String getUniteMonetaireCout() {
		return uniteMonetaireCout;
	}

	public void setUniteMonetaireCout(java.lang.String uniteMonetaireCout) {
		this.uniteMonetaireCout = uniteMonetaireCout;
	}

	public java.math.BigDecimal getFret() {
		return Fret;
	}

	public void setFret(java.math.BigDecimal fret) {
		Fret = fret;
	}

	public java.lang.String getUniteMonetaireFret() {
		return UniteMonetaireFret;
	}

	public void setUniteMonetaireFret(java.lang.String uniteMonetaireFret) {
		UniteMonetaireFret = uniteMonetaireFret;
	}

	public java.math.BigDecimal getAssurances() {
		return assurances;
	}

	public void setAssurances(java.math.BigDecimal assurances) {
		this.assurances = assurances;
	}

	public java.lang.String getUniteMonetaireAssurances() {
		return uniteMonetaireAssurances;
	}

	public void setUniteMonetaireAssurances(
			java.lang.String uniteMonetaireAssurances) {
		this.uniteMonetaireAssurances = uniteMonetaireAssurances;
	}

	public java.math.BigDecimal getCf() {
		return cf;
	}

	public void setCf(java.math.BigDecimal cf) {
		this.cf = cf;
	}

	public java.lang.String getUniteTeMonetaireCf() {
		return uniteTeMonetaireCf;
	}

	public void setUniteTeMonetaireCf(java.lang.String uniteTeMonetaireCf) {
		this.uniteTeMonetaireCf = uniteTeMonetaireCf;
	}

	public java.math.BigDecimal getValeurFob() {
		return valeurFob;
	}

	public void setValeurFob(java.math.BigDecimal valeurFob) {
		this.valeurFob = valeurFob;
	}

	public java.lang.String getUniteMonetaireValFob() {
		return uniteMonetaireValFob;
	}

	public void setUniteMonetaireValFob(java.lang.String uniteMonetaireValFob) {
		this.uniteMonetaireValFob = uniteMonetaireValFob;
	}

	public java.math.BigDecimal getValeurCaf() {
		return valeurCaf;
	}

	public void setValeurCaf(java.math.BigDecimal valeurCaf) {
		this.valeurCaf = valeurCaf;
	}

	public java.lang.String getUniteMonetaireCaf() {
		return uniteMonetaireCaf;
	}

	public void setUniteMonetaireCaf(java.lang.String uniteMonetaireCaf) {
		this.uniteMonetaireCaf = uniteMonetaireCaf;
	}

	public java.lang.String getLieuFob() {
		return lieuFob;
	}

	public void setLieuFob(java.lang.String lieuFob) {
		this.lieuFob = lieuFob;
	}

	public java.lang.String getAutresInfos() {
		return autresInfos;
	}

	public void setAutresInfos(java.lang.String autresInfos) {
		this.autresInfos = autresInfos;
	}

	public java.lang.String getDateSaisie() {
		return dateSaisie;
	}

	public void setDateSaisie(java.lang.String dateSaisie) {
		this.dateSaisie = dateSaisie;
	}

	public java.lang.String getHeureSaisie() {
		return heureSaisie;
	}

	public void setHeureSaisie(java.lang.String heureSaisie) {
		this.heureSaisie = heureSaisie;
	}

	public java.lang.String getDateDerniereMaj() {
		return dateDerniereMaj;
	}

	public void setDateDerniereMaj(java.lang.String dateDerniereMaj) {
		this.dateDerniereMaj = dateDerniereMaj;
	}

	public java.lang.String getHeureDerniereMaj() {
		return heureDerniereMaj;
	}

	public void setHeureDerniereMaj(java.lang.String heureDerniereMaj) {
		this.heureDerniereMaj = heureDerniereMaj;
	}

	public java.math.BigDecimal getQuantite() {
		return quantite;
	}

	public void setQuantite(java.math.BigDecimal quantite) {
		this.quantite = quantite;
	}

	public java.lang.String getIndiceRisque() {
		return indiceRisque;
	}

	public void setIndiceRisque(java.lang.String indiceRisque) {
		this.indiceRisque = indiceRisque;
	}

	public java.lang.String getDesignationCommerciale() {
		return designationCommerciale;
	}

	public void setDesignationCommerciale(java.lang.String designationCommerciale) {
		this.designationCommerciale = designationCommerciale;
	}
	
	
}
