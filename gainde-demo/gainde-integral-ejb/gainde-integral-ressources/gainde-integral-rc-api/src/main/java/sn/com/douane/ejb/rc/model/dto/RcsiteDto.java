package sn.com.douane.ejb.rc.model.dto;

import sn.com.douane.ejb.rc.model.entities.Pays;

public class RcsiteDto {

	/** ********************++++++++++++++++++++++++++++++++++++++++++++++********************** */
	private Integer nbreDecimal;

	/**
	 * nbreArtMaxDeclaration utiliser dans
	 * traitBrouillon.creerNumeroArticleBrouillon() nbreArtMaxDeclaration=11
	 */
	private String nbreArtMaxDeclaration;

	/**
	 * circuit visite automatique =8 utiliser dans traitEnregistrement
	 */
	private String cirvisitauto;

	/**
	 * indicateur regime est exonéré =1 à sénégal
	 */
	private String indregexon;

	/**
	 * valeur correspond à regularisation valeur=0 à sénégal utilisé dans
	 * traitenregistrement
	 */
	private String valregulval;

	/**
	 * mode declaration DEP=DEP au senegale utiliser lors de traitEnregistrement
	 */
	private String moddecDEP;

	/**
	 * mode declaration DES=DES au senegale utiliser lors de traitEnregistrement
	 */
	private String moddecDES;

	/**
	 * codesuspondu=1 utiliser dans controlerCredit
	 */
	private String codesuspondu;

	/**
	 * typeimputation utilise lors imputation credit
	 */
	private String typeImputation;

	/**
	 * nature apurement de declaration =5 à sénégale
	 */
	private String natureApurement;

	/**
	 * typeapurDepotprovis:correspond au type apurement Depotprovis=2 utilisé
	 * dans imputation
	 */
	private String typeapurDepotprovis;

	/**
	 * typeapurSommier:correspond au type apurement sommiers=1 utilisé dans
	 * imputation
	 */
	private String typeapurSommier;

	/**
	 * typeapurManifeste:correspond au type apurement manifeste=3 utilisé dans
	 * imputation
	 */
	private String typeapurManifeste;

	/**
	 * typeApurTitrPrec : correspond au code type apurement intitulé titre
	 * précedent
	 */
	private String typeApurTitrPrec;

	/**
	 * modepaiementcompt :mode de paiement au comptant=1 au senegal
	 */
	private String modepaiementcompt;

	/**
	 * modepaiementcredit :mode de paiement au credit=2 au senegal
	 */
	private String modepaiementcredit;

	/**
	 * modepaiementmixte :mode de paiement au mixte=3 au senegal
	 */
	private String modepaiementmixte;

	/**
	 * indTaxeComptant=1 au senegal représente l'indicateur de taxe s'il doit
	 * être payé au comptant sinon dans une autre pays on met la valeur
	 * équivalente à cette valeur
	 */
	private String indTaxeComptant;

	/**
	 * valImportExport=0 au sénégal sinon dans une autre pays on met la valeur
	 * équivalente à cette valeur (NB:elle peut être null)
	 */
	private String valImportExport;

	/**
	 * TypeMerc=1 au sénégal sinon dans une autre pays on met la valeur
	 * équivalente à cette valeur (NB:elle ne peut pas être null)
	 */
	private String TypeMerc;

	/**
	 * la première valeur d'unite de Liquidation au sénégal=1
	 */
	private String val1UniteLiquidation;

	/**
	 * la deuscième valeur d'unite de Liquidation au sénégal=2
	 */
	private String val2UniteLiquidation;

	/**
	 * valeur basetaxe1 ,au sénégale=1
	 */
	private String basetaxe1;

	/**
	 * les codes DD,DF,TVA selon pays au sénégal DD=01,DF=02,TVA=05
	 */
	private String codDroitDouane;

	private String codDroitFiscal;

	private String codTVA;

	private String typeCreditAdministratif;

	/** ****************************************** */
	/**
	 * ****indicateur de regime non taxable utiliser dans taxation
	 * =N**************
	 */
	private String regNonTaxable;

	/** ****************************************** */
	private java.lang.String rccodepays;

	//champs utilisés par le trésor
	private java.lang.String codetypedecisionretrait;

	private java.lang.String codetypedecisionsuspension;

	private java.lang.String codetypedecileveesusp;

	private java.lang.String codetypedecirenouvel;

	private java.lang.String codecreditsuspendu;

	private java.lang.String codecreditnonsuspendu;

	private Double montantmincredit;

	private java.lang.String codetypedecisionextension;
	
	private java.lang.String rctypedecautorisation;

	private Pays paysLocal;

	private String pk;

	//Champs utilisés niveau Traitement DEP (Module douane)
	private String attentevalidation; //Attente validation (AV)

	private String attentereglement; //Attente réglement (AR)

	private String attentebae; //Attente BAE (AB)

	private String traite; //Traité (TR)

	private String moddecAPE; //Mode déclaration APE (APE)

	private String moddecAPDE; //Mode déclaration APDE (APDE)

	private String typedecautorisation;

	/**
	 *  
	 */
	public RcsiteDto() {
		super();
	}

	/**
	 * @return Renvoie pk.
	 */
	public String getPk() {
		pk = rccodepays;
		return pk; 
	}

	/**
	 * @param pk
	 *            pk à définir.
	 */
	public void setPk(String pk) {
		this.pk = pk;
	}

	public java.lang.String getRccodepays() {
		return rccodepays;
	}

	public void setRccodepays(java.lang.String rccodepays) {
		this.rccodepays = rccodepays;
	}

	/**
	 * @return Renvoie basetaxe1.
	 */
	public String getBasetaxe1() {
		return basetaxe1;
	}

	/**
	 * @param basetaxe1
	 *            basetaxe1 à définir.
	 */
	public void setBasetaxe1(String basetaxe1) {
		this.basetaxe1 = basetaxe1;
	}

	/**
	 * @return Renvoie cirvisitauto.
	 */
	public String getCirvisitauto() {
		return cirvisitauto;
	}

	/**
	 * @param cirvisitauto
	 *            cirvisitauto à définir.
	 */
	public void setCirvisitauto(String cirvisitauto) {
		this.cirvisitauto = cirvisitauto;
	}

	/**
	 * @return Renvoie codDroitDouane.
	 */
	public String getCodDroitDouane() {
		return codDroitDouane;
	}

	/**
	 * @param codDroitDouane
	 *            codDroitDouane à définir.
	 */
	public void setCodDroitDouane(String codDroitDouane) {
		this.codDroitDouane = codDroitDouane;
	}

	/**
	 * @return Renvoie codDroitFiscal.
	 */
	public String getCodDroitFiscal() {
		return codDroitFiscal;
	}

	/**
	 * @param codDroitFiscal
	 *            codDroitFiscal à définir.
	 */
	public void setCodDroitFiscal(String codDroitFiscal) {
		this.codDroitFiscal = codDroitFiscal;
	}

	/**
	 * @return Renvoie codesuspondu.
	 */
	public String getCodesuspondu() {
		return codesuspondu;
	}

	/**
	 * @param codesuspondu
	 *            codesuspondu à définir.
	 */
	public void setCodesuspondu(String codesuspondu) {
		this.codesuspondu = codesuspondu;
	}

	/**
	 * @return Renvoie codTVA.
	 */
	public String getCodTVA() {
		return codTVA;
	}

	/**
	 * @param codTVA
	 *            codTVA à définir.
	 */
	public void setCodTVA(String codTVA) {
		this.codTVA = codTVA;
	}

	/**
	 * @return Renvoie indregexon.
	 */
	public String getIndregexon() {
		return indregexon;
	}

	/**
	 * @param indregexon
	 *            indregexon à définir.
	 */
	public void setIndregexon(String indregexon) {
		this.indregexon = indregexon;
	}

	/**
	 * @return Renvoie indTaxeComptant.
	 */
	public String getIndTaxeComptant() {
		return indTaxeComptant;
	}

	/**
	 * @param indTaxeComptant
	 *            indTaxeComptant à définir.
	 */
	public void setIndTaxeComptant(String indTaxeComptant) {
		this.indTaxeComptant = indTaxeComptant;
	}

	/**
	 * @return Renvoie moddecDEP.
	 */
	public String getModdecDEP() {
		return moddecDEP;
	}

	/**
	 * @param moddecDEP
	 *            moddecDEP à définir.
	 */
	public void setModdecDEP(String moddecDEP) {
		this.moddecDEP = moddecDEP;
	}

	/**
	 * @return Renvoie moddecDES.
	 */
	public String getModdecDES() {
		return moddecDES;
	}

	/**
	 * @param moddecDES
	 *            moddecDES à définir.
	 */
	public void setModdecDES(String moddecDES) {
		this.moddecDES = moddecDES;
	}

	/**
	 * @return Renvoie modepaiementcompt.
	 */
	public String getModepaiementcompt() {
		return modepaiementcompt;
	}

	/**
	 * @param modepaiementcompt
	 *            modepaiementcompt à définir.
	 */
	public void setModepaiementcompt(String modepaiementcompt) {
		this.modepaiementcompt = modepaiementcompt;
	}

	/**
	 * @return Renvoie modepaiementcredit.
	 */
	public String getModepaiementcredit() {
		return modepaiementcredit;
	}

	/**
	 * @param modepaiementcredit
	 *            modepaiementcredit à définir.
	 */
	public void setModepaiementcredit(String modepaiementcredit) {
		this.modepaiementcredit = modepaiementcredit;
	}

	/**
	 * @return Renvoie modepaiementmixte.
	 */
	public String getModepaiementmixte() {
		return modepaiementmixte;
	}

	/**
	 * @param modepaiementmixte
	 *            modepaiementmixte à définir.
	 */
	public void setModepaiementmixte(String modepaiementmixte) {
		this.modepaiementmixte = modepaiementmixte;
	}

	/**
	 * @return Renvoie natureApurement.
	 */
	public String getNatureApurement() {
		return natureApurement;
	}

	/**
	 * @param natureApurement
	 *            natureApurement à définir.
	 */
	public void setNatureApurement(String natureApurement) {
		this.natureApurement = natureApurement;
	}

	/**
	 * @return Renvoie typeapurDepotprovis.
	 */
	public String getTypeapurDepotprovis() {
		return typeapurDepotprovis;
	}

	/**
	 * @param typeapurDepotprovis
	 *            typeapurDepotprovis à définir.
	 */
	public void setTypeapurDepotprovis(String typeapurDepotprovis) {
		this.typeapurDepotprovis = typeapurDepotprovis;
	}

	/**
	 * @return Renvoie typeapurManifeste.
	 */
	public String getTypeapurManifeste() {
		return typeapurManifeste;
	}

	/**
	 * @param typeapurManifeste
	 *            typeapurManifeste à définir.
	 */
	public void setTypeapurManifeste(String typeapurManifeste) {
		this.typeapurManifeste = typeapurManifeste;
	}

	/**
	 * @return Renvoie typeapurSommier.
	 */
	public String getTypeapurSommier() {
		return typeapurSommier;
	}

	/**
	 * @param typeapurSommier
	 *            typeapurSommier à définir.
	 */
	public void setTypeapurSommier(String typeapurSommier) {
		this.typeapurSommier = typeapurSommier;
	}

	/**
	 * @return Renvoie typeApurTitrPrec.
	 */
	public String getTypeApurTitrPrec() {
		return typeApurTitrPrec;
	}

	/**
	 * @param typeApurTitrPrec
	 *            typeApurTitrPrec à définir.
	 */
	public void setTypeApurTitrPrec(String typeApurTitrPrec) {
		this.typeApurTitrPrec = typeApurTitrPrec;
	}

	/**
	 * @return Renvoie typeCreditAdministratif.
	 */
	public String getTypeCreditAdministratif() {
		return typeCreditAdministratif;
	}

	/**
	 * @param typeCreditAdministratif
	 *            typeCreditAdministratif à définir.
	 */
	public void setTypeCreditAdministratif(String typeCreditAdministratif) {
		this.typeCreditAdministratif = typeCreditAdministratif;
	}

	/**
	 * @return Renvoie typeImputation.
	 */
	public String getTypeImputation() {
		return typeImputation;
	}

	/**
	 * @param typeImputation
	 *            typeImputation à définir.
	 */
	public void setTypeImputation(String typeImputation) {
		this.typeImputation = typeImputation;
	}

	/**
	 * @return Renvoie typeMerc.
	 */
	public String getTypeMerc() {
		return TypeMerc;
	}

	/**
	 * @param typeMerc
	 *            typeMerc à définir.
	 */
	public void setTypeMerc(String typeMerc) {
		TypeMerc = typeMerc;
	}

	/**
	 * @return Renvoie val1UniteLiquidation.
	 */
	public String getVal1UniteLiquidation() {
		return val1UniteLiquidation;
	}

	/**
	 * @param val1UniteLiquidation
	 *            val1UniteLiquidation à définir.
	 */
	public void setVal1UniteLiquidation(String val1UniteLiquidation) {
		this.val1UniteLiquidation = val1UniteLiquidation;
	}

	/**
	 * @return Renvoie val2UniteLiquidation.
	 */
	public String getVal2UniteLiquidation() {
		return val2UniteLiquidation;
	}

	/**
	 * @param val2UniteLiquidation
	 *            val2UniteLiquidation à définir.
	 */
	public void setVal2UniteLiquidation(String val2UniteLiquidation) {
		this.val2UniteLiquidation = val2UniteLiquidation;
	}

	/**
	 * @return Renvoie valImportExport.
	 */
	public String getValImportExport() {
		return valImportExport;
	}

	/**
	 * @param valImportExport
	 *            valImportExport à définir.
	 */
	public void setValImportExport(String valImportExport) {
		this.valImportExport = valImportExport;
	}

	/**
	 * @return Renvoie valregulval.
	 */
	public String getValregulval() {
		return valregulval;
	}

	/**
	 * @param valregulval
	 *            valregulval à définir.
	 */
	public void setValregulval(String valregulval) {
		this.valregulval = valregulval;
	}

	public Pays getPaysLocal() {
		return paysLocal;
	}

	public void setPaysLocal(Pays local) {
		this.paysLocal = local;
	}

	/**
	 * @return Renvoie nbreDecimal.
	 */
	public Integer getNbreDecimal() {
		return nbreDecimal;
	}

	/**
	 * @param nbreDecimal
	 *            nbreDecimal à définir.
	 */
	public void setNbreDecimal(Integer nbreDecimal) {
		this.nbreDecimal = nbreDecimal;
	}

	/**
	 * @return Renvoie nbreArtMaxDeclaration.
	 */
	public String getNbreArtMaxDeclaration() {
		return nbreArtMaxDeclaration;
	}

	/**
	 * @param nbreArtMaxDeclaration
	 *            nbreArtMaxDeclaration à définir.
	 */
	public void setNbreArtMaxDeclaration(String nbreArtMaxDeclaration) {
		this.nbreArtMaxDeclaration = nbreArtMaxDeclaration;
	}

	/**
	 * @return Renvoie codecreditnonsuspendu.
	 */
	public java.lang.String getCodecreditnonsuspendu() {
		return codecreditnonsuspendu;
	}

	/**
	 * @param codecreditnonsuspendu
	 *            codecreditnonsuspendu à définir.
	 */
	public void setCodecreditnonsuspendu(java.lang.String codecreditnonsuspendu) {
		this.codecreditnonsuspendu = codecreditnonsuspendu;
	}

	/**
	 * @return Renvoie codecreditsuspendu.
	 */
	public java.lang.String getCodecreditsuspendu() {
		return codecreditsuspendu;
	}

	/**
	 * @param codecreditsuspendu
	 *            codecreditsuspendu à définir.
	 */
	public void setCodecreditsuspendu(java.lang.String codecreditsuspendu) {
		this.codecreditsuspendu = codecreditsuspendu;
	}

	/**
	 * @return Renvoie codetypedecileveesusp.
	 */
	public java.lang.String getCodetypedecileveesusp() {
		return codetypedecileveesusp;
	}

	/**
	 * @param codetypedecileveesusp
	 *            codetypedecileveesusp à définir.
	 */
	public void setCodetypedecileveesusp(java.lang.String codetypedecileveesusp) {
		this.codetypedecileveesusp = codetypedecileveesusp;
	}

	/**
	 * @return Renvoie codetypedecirenouvel.
	 */
	public java.lang.String getCodetypedecirenouvel() {
		return codetypedecirenouvel;
	}

	/**
	 * @param codetypedecirenouvel
	 *            codetypedecirenouvel à définir.
	 */
	public void setCodetypedecirenouvel(java.lang.String codetypedecirenouvel) {
		this.codetypedecirenouvel = codetypedecirenouvel;
	}

	/**
	 * @return Renvoie codetypedecisionretrait.
	 */
	public java.lang.String getCodetypedecisionretrait() {
		return codetypedecisionretrait;
	}

	/**
	 * @param codetypedecisionretrait
	 *            codetypedecisionretrait à définir.
	 */
	public void setCodetypedecisionretrait(
			java.lang.String codetypedecisionretrait) {
		this.codetypedecisionretrait = codetypedecisionretrait;
	}

	/**
	 * @return Renvoie codetypedecisionsuspension.
	 */
	public java.lang.String getCodetypedecisionsuspension() {
		return codetypedecisionsuspension;
	}

	/**
	 * @param codetypedecisionsuspension
	 *            codetypedecisionsuspension à définir.
	 */
	public void setCodetypedecisionsuspension(
			java.lang.String codetypedecisionsuspension) {
		this.codetypedecisionsuspension = codetypedecisionsuspension;
	}

	/**
	 * @return Renvoie montantmincredit.
	 */
	public Double getMontantmincredit() {
		return montantmincredit;
	}

	/**
	 * @param montantmincredit
	 *            montantmincredit à définir.
	 */
	public void setMontantmincredit(Double montantmincredit) {
		this.montantmincredit = montantmincredit;
	}

	/**
	 * @return Renvoie codetypedecisionextension.
	 */
	public java.lang.String getCodetypedecisionextension() {
		return codetypedecisionextension;
	}

	/**
	 * @param codetypedecisionextension
	 *            codetypedecisionextension à définir.
	 */
	public void setCodetypedecisionextension(
			java.lang.String codetypedecisionextension) {
		this.codetypedecisionextension = codetypedecisionextension;
	}

	public String getAttentebae() {
		return attentebae;
	}

	public void setAttentebae(String attentebae) {
		this.attentebae = attentebae;
	}

	public String getAttentereglement() {
		return attentereglement;
	}

	public void setAttentereglement(String attentereglement) {
		this.attentereglement = attentereglement;
	}

	public String getAttentevalidation() {
		return attentevalidation;
	}

	public void setAttentevalidation(String attentevalidation) {
	}

	public String getModdecAPDE() {
		return moddecAPDE;
	}

	public void setModdecAPDE(String moddecAPDE) {
		this.moddecAPDE = moddecAPDE;
	}

	public String getModdecAPE() {
		return moddecAPE;
	}

	public void setModdecAPE(String moddecAPE) {
		this.moddecAPE = moddecAPE;
	}

	public String getTraite() {
		return traite;
	}

	public void setTraite(String traite) {
		this.traite = traite;
	}

	/**
	 * @return Renvoie regNonTaxable.
	 */
	public String getRegNonTaxable() {
		return regNonTaxable;
	}

	/**
	 * @param regNonTaxable
	 *            regNonTaxable à définir.
	 */
	public void setRegNonTaxable(String regNonTaxable) {
		this.regNonTaxable = regNonTaxable;
	}

	/**
	 * @return Renvoie typedecautorisation.
	 */
	public String getTypedecautorisation() {
		return typedecautorisation;
	}

	/**
	 * @param typedecautorisation
	 *            typedecautorisation à définir.
	 */
	public void setTypedecautorisation(String typedecautorisation) {
		this.typedecautorisation = typedecautorisation;
	}
	/**
	 * @return Renvoie rctypedecautorisation.
	 */
	public java.lang.String getRctypedecautorisation() {
		return rctypedecautorisation;
	}
	/**
	 * @param rctypedecautorisation rctypedecautorisation à définir.
	 */
	public void setRctypedecautorisation(java.lang.String rctypedecautorisation) {
		this.rctypedecautorisation = rctypedecautorisation;
	}

}
