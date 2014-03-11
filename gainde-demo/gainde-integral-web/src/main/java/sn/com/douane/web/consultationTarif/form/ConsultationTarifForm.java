package sn.com.douane.web.consultationTarif.form;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class ConsultationTarifForm implements Serializable{

	private static final long serialVersionUID = 1L;
	private String etat;
	private String pk;

	// Attributs de recherche section
	private String numRcCodeSectionRech;
	private String numRcLibelleSectionRech;

	// Attributs de recherche chapitre
	private String numRcCodeChapitreRech;
	private String numRcLibelleChapitreRech;

	// Attributs de recherche position
	private String numRcCodePositionRech;
	private String numRcLibellePositionRech;

	// Attributs de recherche produit
	private String numRcCodeProdRech;
	private String numRcPrecUemoaRech;
	private String numRcPrecSenegalRech;
	private String numRcLibelleTarifRech;

	private List listeSection = new ArrayList();
	private List listeChapitre = new ArrayList();
	private List listePosition = new ArrayList();
	private List listeProduit = new ArrayList();

	private List listeFiscaliteImp = new ArrayList();

	private List listeFiscaliteExp = new ArrayList();

	private List listePieceJointe = new ArrayList();

	private List listePieceJointeExp = new ArrayList();

	private List listeReglementImp = new ArrayList();

	private List listeReglementExp = new ArrayList();

	// Champs permettant de mémoriser les pk
	private String rcCodeSection;
	private String rcCodeRomainSection;
	private String rcCodeChapitre;
	private String rcCodePosition;

	private String visiteImp;
	private String visiteExp;
	private String escorte;
	private String subvention;

	private String prohibitionImp;
	private String prohibitionExp;
	private String timbreDouane;
	private String valeurPerImp;
	private String valeurPerExp;

	private String uniteMercurialeImp;
	private String uniteMercurialeExp;

	private String valeurMercurialeImp;
	private String valeurMercurialeExp;

	private String baseCalculImp;
	private String baseCalculExp;

	private String valeurMinimalImp;
	private String valeurMinimalExp;

	private String valeurMedianeImp;
	private String valeurMedianeExp;

	private String classeProduit;

	private java.lang.String rcIndProdPetrolier;

	private java.lang.String rcCodeProdCru;

	private java.lang.String rcCodeProdArtisanal;

	private java.lang.String rcUniteComp;

	private java.lang.String rcCodeTransit;

	private java.lang.String rcCodebienEquip;

	private java.lang.String rcCodeEntrepot;

	private java.lang.String rcCodeProdSocial;

	private java.lang.String rcCodePerissable;

	private java.lang.String rcExonorePvi;

	public String getEtat() {
		return etat;
	}

	public void setEtat(String etat) {
		this.etat = etat;
	}

	public String getPk() {
		return pk;
	}

	public void setPk(String pk) {
		this.pk = pk;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.apache.struts.action.ActionForm#reset(org.apache.struts.action.
	 * ActionMapping, javax.servlet.http.HttpServletRequest)
	 */
	public void reset() {
		// TODO Raccord de méthode auto-généré
		listeFiscaliteImp = new ArrayList();

		listeFiscaliteExp = new ArrayList();

		listePieceJointe = new ArrayList();

		listePieceJointeExp = new ArrayList();

		listeReglementImp = new ArrayList();

		listeReglementExp = new ArrayList();

	}

	/**
	 * @return Renvoie baseCalculExp.
	 */
	public String getBaseCalculExp() {
		return baseCalculExp;
	}

	/**
	 * @param baseCalculExp
	 *            baseCalculExp à définir.
	 */
	public void setBaseCalculExp(String baseCalculExp) {
		this.baseCalculExp = baseCalculExp;
	}

	/**
	 * @return Renvoie baseCalculImp.
	 */
	public String getBaseCalculImp() {
		return baseCalculImp;
	}

	/**
	 * @param baseCalculImp
	 *            baseCalculImp à définir.
	 */
	public void setBaseCalculImp(String baseCalculImp) {
		this.baseCalculImp = baseCalculImp;
	}

	/**
	 * @return Renvoie classeProduit.
	 */
	public String getClasseProduit() {
		return classeProduit;
	}

	/**
	 * @param classeProduit
	 *            classeProduit à définir.
	 */
	public void setClasseProduit(String classeProduit) {
		this.classeProduit = classeProduit;
	}

	/**
	 * @return Renvoie escorte.
	 */
	public String getEscorte() {
		return escorte;
	}

	/**
	 * @param escorte
	 *            escorte à définir.
	 */
	public void setEscorte(String escorte) {
		this.escorte = escorte;
	}

	/**
	 * @return Renvoie prohibitionExp.
	 */
	public String getProhibitionExp() {
		return prohibitionExp;
	}

	/**
	 * @param prohibitionExp
	 *            prohibitionExp à définir.
	 */
	public void setProhibitionExp(String prohibitionExp) {
		this.prohibitionExp = prohibitionExp;
	}

	/**
	 * @return Renvoie prohibitionImp.
	 */
	public String getProhibitionImp() {
		return prohibitionImp;
	}

	/**
	 * @param prohibitionImp
	 *            prohibitionImp à définir.
	 */
	public void setProhibitionImp(String prohibitionImp) {
		this.prohibitionImp = prohibitionImp;
	}

	/**
	 * @return Renvoie subvention.
	 */
	public String getSubvention() {
		return subvention;
	}

	/**
	 * @param subvention
	 *            subvention à définir.
	 */
	public void setSubvention(String subvention) {
		this.subvention = subvention;
	}

	/**
	 * @return Renvoie timbreDouane.
	 */
	public String getTimbreDouane() {
		return timbreDouane;
	}

	/**
	 * @param timbreDouane
	 *            timbreDouane à définir.
	 */
	public void setTimbreDouane(String timbreDouane) {
		this.timbreDouane = timbreDouane;
	}

	/**
	 * @return Renvoie uniteMercurialeExp.
	 */
	public String getUniteMercurialeExp() {
		return uniteMercurialeExp;
	}

	/**
	 * @param uniteMercurialeExp
	 *            uniteMercurialeExp à définir.
	 */
	public void setUniteMercurialeExp(String uniteMercurialeExp) {
		this.uniteMercurialeExp = uniteMercurialeExp;
	}

	/**
	 * @return Renvoie uniteMercurialeImp.
	 */
	public String getUniteMercurialeImp() {
		return uniteMercurialeImp;
	}

	/**
	 * @param uniteMercurialeImp
	 *            uniteMercurialeImp à définir.
	 */
	public void setUniteMercurialeImp(String uniteMercurialeImp) {
		this.uniteMercurialeImp = uniteMercurialeImp;
	}

	/**
	 * @return Renvoie valeurMedianeExp.
	 */
	public String getValeurMedianeExp() {
		return valeurMedianeExp;
	}

	/**
	 * @param valeurMedianeExp
	 *            valeurMedianeExp à définir.
	 */
	public void setValeurMedianeExp(String valeurMedianeExp) {
		this.valeurMedianeExp = valeurMedianeExp;
	}

	/**
	 * @return Renvoie valeurMedianeImp.
	 */
	public String getValeurMedianeImp() {
		return valeurMedianeImp;
	}

	/**
	 * @param valeurMedianeImp
	 *            valeurMedianeImp à définir.
	 */
	public void setValeurMedianeImp(String valeurMedianeImp) {
		this.valeurMedianeImp = valeurMedianeImp;
	}

	/**
	 * @return Renvoie valeurMercurialeExp.
	 */
	public String getValeurMercurialeExp() {
		return valeurMercurialeExp;
	}

	/**
	 * @param valeurMercurialeExp
	 *            valeurMercurialeExp à définir.
	 */
	public void setValeurMercurialeExp(String valeurMercurialeExp) {
		this.valeurMercurialeExp = valeurMercurialeExp;
	}

	/**
	 * @return Renvoie valeurMercurialeImp.
	 */
	public String getValeurMercurialeImp() {
		return valeurMercurialeImp;
	}

	/**
	 * @param valeurMercurialeImp
	 *            valeurMercurialeImp à définir.
	 */
	public void setValeurMercurialeImp(String valeurMercurialeImp) {
		this.valeurMercurialeImp = valeurMercurialeImp;
	}

	/**
	 * @return Renvoie valeurMinimalExp.
	 */
	public String getValeurMinimalExp() {
		return valeurMinimalExp;
	}

	/**
	 * @param valeurMinimalExp
	 *            valeurMinimalExp à définir.
	 */
	public void setValeurMinimalExp(String valeurMinimalExp) {
		this.valeurMinimalExp = valeurMinimalExp;
	}

	/**
	 * @return Renvoie valeurMinimalImp.
	 */
	public String getValeurMinimalImp() {
		return valeurMinimalImp;
	}

	/**
	 * @param valeurMinimalImp
	 *            valeurMinimalImp à définir.
	 */
	public void setValeurMinimalImp(String valeurMinimalImp) {
		this.valeurMinimalImp = valeurMinimalImp;
	}

	/**
	 * @return Renvoie valeurPerExp.
	 */
	public String getValeurPerExp() {
		return valeurPerExp;
	}

	/**
	 * @param valeurPerExp
	 *            valeurPerExp à définir.
	 */
	public void setValeurPerExp(String valeurPerExp) {
		this.valeurPerExp = valeurPerExp;
	}

	/**
	 * @return Renvoie valeurPerImp.
	 */
	public String getValeurPerImp() {
		return valeurPerImp;
	}

	/**
	 * @param valeurPerImp
	 *            valeurPerImp à définir.
	 */
	public void setValeurPerImp(String valeurPerImp) {
		this.valeurPerImp = valeurPerImp;
	}

	/**
	 * @return Renvoie visiteExp.
	 */
	public String getVisiteExp() {
		return visiteExp;
	}

	/**
	 * @param visiteExp
	 *            visiteExp à définir.
	 */
	public void setVisiteExp(String visiteExp) {
		this.visiteExp = visiteExp;
	}

	/**
	 * @return Renvoie visiteImp.
	 */
	public String getVisiteImp() {
		return visiteImp;
	}

	/**
	 * @param visiteImp
	 *            visiteImp à définir.
	 */
	public void setVisiteImp(String visiteImp) {
		this.visiteImp = visiteImp;
	}	

	public String getNumRcCodeSectionRech() {
		return numRcCodeSectionRech;
	}

	public void setNumRcCodeSectionRech(String numRcCodeSectionRech) {
		this.numRcCodeSectionRech = numRcCodeSectionRech;
	}

	public String getNumRcLibelleSectionRech() {
		return numRcLibelleSectionRech;
	}

	public void setNumRcLibelleSectionRech(String numRcLibelleSectionRech) {
		this.numRcLibelleSectionRech = numRcLibelleSectionRech;
	}

	public String getNumRcCodeChapitreRech() {
		return numRcCodeChapitreRech;
	}

	public void setNumRcCodeChapitreRech(String numRcCodeChapitreRech) {
		this.numRcCodeChapitreRech = numRcCodeChapitreRech;
	}

	public String getNumRcLibelleChapitreRech() {
		return numRcLibelleChapitreRech;
	}

	public void setNumRcLibelleChapitreRech(String numRcLibelleChapitreRech) {
		this.numRcLibelleChapitreRech = numRcLibelleChapitreRech;
	}

	public String getNumRcCodePositionRech() {
		return numRcCodePositionRech;
	}

	public void setNumRcCodePositionRech(String numRcCodePositionRech) {
		this.numRcCodePositionRech = numRcCodePositionRech;
	}

	public String getNumRcLibellePositionRech() {
		return numRcLibellePositionRech;
	}

	public void setNumRcLibellePositionRech(String numRcLibellePositionRech) {
		this.numRcLibellePositionRech = numRcLibellePositionRech;
	}

	public String getNumRcCodeProdRech() {
		return numRcCodeProdRech;
	}

	public void setNumRcCodeProdRech(String numRcCodeProdRech) {
		this.numRcCodeProdRech = numRcCodeProdRech;
	}

	public String getNumRcPrecUemoaRech() {
		return numRcPrecUemoaRech;
	}

	public void setNumRcPrecUemoaRech(String numRcPrecUemoaRech) {
		this.numRcPrecUemoaRech = numRcPrecUemoaRech;
	}

	public String getNumRcPrecSenegalRech() {
		return numRcPrecSenegalRech;
	}

	public void setNumRcPrecSenegalRech(String numRcPrecSenegalRech) {
		this.numRcPrecSenegalRech = numRcPrecSenegalRech;
	}

	public String getNumRcLibelleTarifRech() {
		return numRcLibelleTarifRech;
	}

	public void setNumRcLibelleTarifRech(String numRcLibelleTarifRech) {
		this.numRcLibelleTarifRech = numRcLibelleTarifRech;
	}

	public List getListeSection() {
		return listeSection;
	}

	public void setListeSection(List listeSection) {
		this.listeSection = listeSection;
	}

	public List getListeChapitre() {
		return listeChapitre;
	}

	public void setListeChapitre(List listeChapitre) {
		this.listeChapitre = listeChapitre;
	}

	public List getListePosition() {
		return listePosition;
	}

	public void setListePosition(List listePosition) {
		this.listePosition = listePosition;
	}

	public List getListeProduit() {
		return listeProduit;
	}

	public void setListeProduit(List listeProduit) {
		this.listeProduit = listeProduit;
	}

	public List getListeFiscaliteImp() {
		return listeFiscaliteImp;
	}

	public void setListeFiscaliteImp(List listeFiscaliteImp) {
		this.listeFiscaliteImp = listeFiscaliteImp;
	}

	public List getListeFiscaliteExp() {
		return listeFiscaliteExp;
	}

	public void setListeFiscaliteExp(List listeFiscaliteExp) {
		this.listeFiscaliteExp = listeFiscaliteExp;
	}

	public List getListePieceJointe() {
		return listePieceJointe;
	}

	public void setListePieceJointe(List listePieceJointe) {
		this.listePieceJointe = listePieceJointe;
	}

	public List getListePieceJointeExp() {
		return listePieceJointeExp;
	}

	public void setListePieceJointeExp(List listePieceJointeExp) {
		this.listePieceJointeExp = listePieceJointeExp;
	}

	public List getListeReglementImp() {
		return listeReglementImp;
	}

	public void setListeReglementImp(List listeReglementImp) {
		this.listeReglementImp = listeReglementImp;
	}

	public List getListeReglementExp() {
		return listeReglementExp;
	}

	public void setListeReglementExp(List listeReglementExp) {
		this.listeReglementExp = listeReglementExp;
	}

	public String getRcCodeSection() {
		return rcCodeSection;
	}

	public void setRcCodeSection(String rcCodeSection) {
		this.rcCodeSection = rcCodeSection;
	}

	public String getRcCodeRomainSection() {
		return rcCodeRomainSection;
	}

	public void setRcCodeRomainSection(String rcCodeRomainSection) {
		this.rcCodeRomainSection = rcCodeRomainSection;
	}

	public String getRcCodeChapitre() {
		return rcCodeChapitre;
	}

	public void setRcCodeChapitre(String rcCodeChapitre) {
		this.rcCodeChapitre = rcCodeChapitre;
	}

	public String getRcCodePosition() {
		return rcCodePosition;
	}

	public void setRcCodePosition(String rcCodePosition) {
		this.rcCodePosition = rcCodePosition;
	}

	public java.lang.String getRcIndProdPetrolier() {
		return rcIndProdPetrolier;
	}

	public void setRcIndProdPetrolier(java.lang.String rcIndProdPetrolier) {
		this.rcIndProdPetrolier = rcIndProdPetrolier;
	}

	public java.lang.String getRcCodeProdCru() {
		return rcCodeProdCru;
	}

	public void setRcCodeProdCru(java.lang.String rcCodeProdCru) {
		this.rcCodeProdCru = rcCodeProdCru;
	}

	public java.lang.String getRcCodeProdArtisanal() {
		return rcCodeProdArtisanal;
	}

	public void setRcCodeProdArtisanal(java.lang.String rcCodeProdArtisanal) {
		this.rcCodeProdArtisanal = rcCodeProdArtisanal;
	}

	public java.lang.String getRcUniteComp() {
		return rcUniteComp;
	}

	public void setRcUniteComp(java.lang.String rcUniteComp) {
		this.rcUniteComp = rcUniteComp;
	}

	public java.lang.String getRcCodeTransit() {
		return rcCodeTransit;
	}

	public void setRcCodeTransit(java.lang.String rcCodeTransit) {
		this.rcCodeTransit = rcCodeTransit;
	}

	public java.lang.String getRcCodebienEquip() {
		return rcCodebienEquip;
	}

	public void setRcCodebienEquip(java.lang.String rcCodebienEquip) {
		this.rcCodebienEquip = rcCodebienEquip;
	}

	public java.lang.String getRcCodeEntrepot() {
		return rcCodeEntrepot;
	}

	public void setRcCodeEntrepot(java.lang.String rcCodeEntrepot) {
		this.rcCodeEntrepot = rcCodeEntrepot;
	}

	public java.lang.String getRcCodeProdSocial() {
		return rcCodeProdSocial;
	}

	public void setRcCodeProdSocial(java.lang.String rcCodeProdSocial) {
		this.rcCodeProdSocial = rcCodeProdSocial;
	}

	public java.lang.String getRcCodePerissable() {
		return rcCodePerissable;
	}

	public void setRcCodePerissable(java.lang.String rcCodePerissable) {
		this.rcCodePerissable = rcCodePerissable;
	}

	public java.lang.String getRcExonorePvi() {
		return rcExonorePvi;
	}

	public void setRcExonorePvi(java.lang.String rcExonorePvi) {
		this.rcExonorePvi = rcExonorePvi;
	}

	
	
}
