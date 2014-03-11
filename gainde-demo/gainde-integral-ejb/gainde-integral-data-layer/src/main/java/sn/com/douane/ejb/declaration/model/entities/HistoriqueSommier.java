/**
 * 
 */
package sn.com.douane.ejb.declaration.model.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import sn.com.douane.ejb.declaration.model.keys.HistoriqueSommierKey;

/**
 * @author moussakare
 *
 */
@Entity()
@IdClass(HistoriqueSommierKey.class)
@Table(name = "HISTORIQUESOMMIER")
public class HistoriqueSommier implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -5792579754290682382L;
	
	@Id @Column(name = "DECANNEEENREGDEC", length = 4, nullable = false)
    private java.lang.String decAnneeEnregDec;
	@Id @Column(name = "DECBURENREGDEC", length = 3, nullable = false)
    private java.lang.String decBurEnregDec;
	@Id @Column(name = "DECNUMDECLARATION", nullable = false)
    private java.lang.Integer decNumDeclaration;
	@Id @Column(name = "DECNUMARTDEC", nullable = false)
    private java.lang.Integer decNumArtDec;
    @Column(name = "DECCODEPROD", length = 6, nullable = false)
 	private java.lang.String decCodeProd;
    @Column(name = "DECPRECSENEGAL", length = 2, nullable = false)
    private java.lang.String decPrecSenegal;
    @Column(name = "DECPRECUEMOA", length = 2, nullable = false)
    private java.lang.String decPrecUemoa;
    @Column(name = "DECREGFISCAL", length = 2, nullable = false)
    private java.lang.String decRegFiscal;
    @Column(name = "DECCODEPPMDECLARANT", length = 5)
    private java.lang.String decCodePpmDeclarant;
    @Column(name = "DECCODEAGREE", length = 3)
    private java.lang.String decCodeAgree;
    @Column(name = "DECNUMIMPORTEXPORT", length = 10)
    private java.lang.String decNumImportExport;
    @Column(name = "DECDATESOMMIER")
    private java.sql.Date decDateSommier;
    @Column(name = "DECDATEVALSOM")
    private java.sql.Date decDateValSom;
    @Column(name = "DECDATEPROROGATION")
    private java.sql.Date decDateProrogation;
    @Column(name = "DECNBREPROROG")
    private java.lang.Integer decNbreProrog;
    @Column(name = "DECNBRECOLISDECLARES")
    private java.lang.Integer decnbreColisDeclares;
    @Column(name = "DECPDNETDECSOM", columnDefinition="DECIMAL(11,0)")
    private java.math.BigDecimal decPdNetDecSom;
    @Column(name = "DECVALEURCAF", columnDefinition="DECIMAL(13,0)")
    private java.math.BigDecimal decValeurCaf;
    @Column(name = "DECNBRERESISOM")
    private java.lang.Integer decNbreResiSom;
    @Column(name = "DECPDRESTANTSOM")
    private java.lang.Integer decPdRestantSom;
    @Column(name = "DECNBREMOISINTRET4")
    private java.lang.Integer decNbreMoisIntret4;
    @Column(name = "DECQTECOMPLEMENTAIRE")
    private java.lang.Integer decQteComplementaire;
    @Column(name = "DECNBCOLISCONSREPSOM")
    private java.lang.Integer decnbColisconsRepSom;
    @Column(name = "DECPDCONSSOM")
    private java.lang.Integer decPdConsSom;
    @Column(name = "DECQTECOMPCONS", columnDefinition="DECIMAL(10,0)")
    private java.lang.Integer decQteCompCons;
    @Column(name = "DECQTERESISOM")
    private java.lang.Integer decQteResiSom;
    @Column(name = "DECCODELIEUSTOCK", length = 3)
    private java.lang.String decCodeLieuStock;
    @Column(name = "DECTYPEREGIME", length = 2)
    private java.lang.String decTypeRegime;
    @Column(name = "DECREGIMEDOUANIER", length = 1)
    private java.lang.String decRegimeDouanier;
    @Column(name = "DECVALEURRESIDUELLE", columnDefinition="DECIMAL(13,0)")
    private java.math.BigDecimal decValeurResiduelle;
    @Column(name = "DECVALCAFCONSTATEE", columnDefinition="DECIMAL(13,0)")
    private java.math.BigDecimal decValCafConstatee;
    @Column(name = "DECUSERCTRLSOMMIER", length = 8)
    private java.lang.String decUserCtrlSommier;
    @Column(name = "DECDATEECOR")
    private java.sql.Date decDateEcor;
    @Column(name = "DECCODECREDITAIRE", length = 3)
    private java.lang.String decCodeCreditaire;
    @Column(name = "DECNUMDEVARCHARGETRANS", length = 6)
    private java.lang.String decNumDevarChargeTrans;
    @Column(name = "DECDATEAT")
    private java.sql.Date decDateAT;
    @Column(name = "DECDATEDECISION")
    private java.sql.Date decDateDecision;
    @Column(name="DECDECISIONPROROG", length = 20)
    private java.lang.String decDecisionProrog;
    @Column(name = "DECQTEMERCURIALE", columnDefinition="DECIMAL(11,0)")
    private java.math.BigDecimal decQteMercuriale;
    @Column(name = "DECQTEMERCRESIDUELLE", columnDefinition="DECIMAL(6,0)")
    private java.math.BigDecimal decQteMercResiduelle;
    @Column(name = "DECANNEEREGECO", length = 4)
    private java.lang.String decAnneeRegEco;
    @Column(name = "DECNUMREGECO", length = 6)
    private java.lang.String decNumRegEco;
    @Column(name = "DECMUTATIONAT", length = 1)
    private java.lang.String decMutationAT;
    @Column(name = "DECPAYSORIGINE", length = 3)
    private java.lang.String decPaysOrigine;
    @Column(name = "DECUNITECOMPL", length = 2)
    private java.lang.String decUniteCompl;
    @Column(name = "DECUNITEMERCURIALE", length = 2)
    private java.lang.String decUniteMercuriale;
    @Column(name = "DECNBRECOLISAPSOM", columnDefinition="DECIMAL(6,0)")
    private java.math.BigDecimal decNbreColisApSom;
    @Column(name = "DECPDAPURSOM", columnDefinition="DECIMAL(9,0)")
    private java.math.BigDecimal decPdApurSom;
    @Column(name = "DECETATSOMMIER", length = 1)
    private java.lang.String decEtatSommier;
//    @OneToOne(targetEntity = Sommiers.class, mappedBy = "historiqueSommier")
//    private Sommiers somHistSom;
	/**
	 * 
	 */
	public HistoriqueSommier() {
		super();
		// TODO Auto-generated constructor stub
	}
	/**
	 * @param decAnneeEnregDec
	 * @param decBurEnregDec
	 * @param decNumDeclaration
	 * @param decNumArtDec
	 * @param decCodeProd
	 * @param decPrecSenegal
	 * @param decPrecUemoa
	 * @param decRegFiscal
	 */
	public HistoriqueSommier(String decAnneeEnregDec, String decBurEnregDec,
			Integer decNumDeclaration, Integer decNumArtDec,
			String decCodeProd, String decPrecSenegal, String decPrecUemoa,
			String decRegFiscal) {
		super();
		this.decAnneeEnregDec = decAnneeEnregDec;
		this.decBurEnregDec = decBurEnregDec;
		this.decNumDeclaration = decNumDeclaration;
		this.decNumArtDec = decNumArtDec;
		this.decCodeProd = decCodeProd;
		this.decPrecSenegal = decPrecSenegal;
		this.decPrecUemoa = decPrecUemoa;
		this.decRegFiscal = decRegFiscal;
	}
	/**
	 * @return the decAnneeEnregDec
	 */
	public java.lang.String getDecAnneeEnregDec() {
		return decAnneeEnregDec;
	}
	/**
	 * @param decAnneeEnregDec the decAnneeEnregDec to set
	 */
	public void setDecAnneeEnregDec(java.lang.String decAnneeEnregDec) {
		this.decAnneeEnregDec = decAnneeEnregDec;
	}
	/**
	 * @return the decBurEnregDec
	 */
	public java.lang.String getDecBurEnregDec() {
		return decBurEnregDec;
	}
	/**
	 * @param decBurEnregDec the decBurEnregDec to set
	 */
	public void setDecBurEnregDec(java.lang.String decBurEnregDec) {
		this.decBurEnregDec = decBurEnregDec;
	}
	/**
	 * @return the decNumDeclaration
	 */
	public java.lang.Integer getDecNumDeclaration() {
		return decNumDeclaration;
	}
	/**
	 * @param decNumDeclaration the decNumDeclaration to set
	 */
	public void setDecNumDeclaration(java.lang.Integer decNumDeclaration) {
		this.decNumDeclaration = decNumDeclaration;
	}
	/**
	 * @return the decNumArtDec
	 */
	public java.lang.Integer getDecNumArtDec() {
		return decNumArtDec;
	}
	/**
	 * @param decNumArtDec the decNumArtDec to set
	 */
	public void setDecNumArtDec(java.lang.Integer decNumArtDec) {
		this.decNumArtDec = decNumArtDec;
	}
	/**
	 * @return the decCodeProd
	 */
	public java.lang.String getDecCodeProd() {
		return decCodeProd;
	}
	/**
	 * @param decCodeProd the decCodeProd to set
	 */
	public void setDecCodeProd(java.lang.String decCodeProd) {
		this.decCodeProd = decCodeProd;
	}
	/**
	 * @return the decPrecSenegal
	 */
	public java.lang.String getDecPrecSenegal() {
		return decPrecSenegal;
	}
	/**
	 * @param decPrecSenegal the decPrecSenegal to set
	 */
	public void setDecPrecSenegal(java.lang.String decPrecSenegal) {
		this.decPrecSenegal = decPrecSenegal;
	}
	/**
	 * @return the decPrecUemoa
	 */
	public java.lang.String getDecPrecUemoa() {
		return decPrecUemoa;
	}
	/**
	 * @param decPrecUemoa the decPrecUemoa to set
	 */
	public void setDecPrecUemoa(java.lang.String decPrecUemoa) {
		this.decPrecUemoa = decPrecUemoa;
	}
	/**
	 * @return the decRegFiscal
	 */
	public java.lang.String getDecRegFiscal() {
		return decRegFiscal;
	}
	/**
	 * @param decRegFiscal the decRegFiscal to set
	 */
	public void setDecRegFiscal(java.lang.String decRegFiscal) {
		this.decRegFiscal = decRegFiscal;
	}
	/**
	 * @return the decCodePpmDeclarant
	 */
	public java.lang.String getDecCodePpmDeclarant() {
		return decCodePpmDeclarant;
	}
	/**
	 * @param decCodePpmDeclarant the decCodePpmDeclarant to set
	 */
	public void setDecCodePpmDeclarant(java.lang.String decCodePpmDeclarant) {
		this.decCodePpmDeclarant = decCodePpmDeclarant;
	}
	/**
	 * @return the decCodeAgree
	 */
	public java.lang.String getDecCodeAgree() {
		return decCodeAgree;
	}
	/**
	 * @param decCodeAgree the decCodeAgree to set
	 */
	public void setDecCodeAgree(java.lang.String decCodeAgree) {
		this.decCodeAgree = decCodeAgree;
	}
	/**
	 * @return the decNumImportExport
	 */
	public java.lang.String getDecNumImportExport() {
		return decNumImportExport;
	}
	/**
	 * @param decNumImportExport the decNumImportExport to set
	 */
	public void setDecNumImportExport(java.lang.String decNumImportExport) {
		this.decNumImportExport = decNumImportExport;
	}
	/**
	 * @return the decDateSommier
	 */
	public java.sql.Date getDecDateSommier() {
		return decDateSommier;
	}
	/**
	 * @param decDateSommier the decDateSommier to set
	 */
	public void setDecDateSommier(java.sql.Date decDateSommier) {
		this.decDateSommier = decDateSommier;
	}
	/**
	 * @return the decDateValSom
	 */
	public java.sql.Date getDecDateValSom() {
		return decDateValSom;
	}
	/**
	 * @param decDateValSom the decDateValSom to set
	 */
	public void setDecDateValSom(java.sql.Date decDateValSom) {
		this.decDateValSom = decDateValSom;
	}
	/**
	 * @return the decDateProrogation
	 */
	public java.sql.Date getDecDateProrogation() {
		return decDateProrogation;
	}
	/**
	 * @param decDateProrogation the decDateProrogation to set
	 */
	public void setDecDateProrogation(java.sql.Date decDateProrogation) {
		this.decDateProrogation = decDateProrogation;
	}
	/**
	 * @return the decNbreProrog
	 */
	public java.lang.Integer getDecNbreProrog() {
		return decNbreProrog;
	}
	/**
	 * @param decNbreProrog the decNbreProrog to set
	 */
	public void setDecNbreProrog(java.lang.Integer decNbreProrog) {
		this.decNbreProrog = decNbreProrog;
	}
	/**
	 * @return the decnbreColisDeclares
	 */
	public java.lang.Integer getDecnbreColisDeclares() {
		return decnbreColisDeclares;
	}
	/**
	 * @param decnbreColisDeclares the decnbreColisDeclares to set
	 */
	public void setDecnbreColisDeclares(java.lang.Integer decnbreColisDeclares) {
		this.decnbreColisDeclares = decnbreColisDeclares;
	}
	/**
	 * @return the decPdNetDecSom
	 */
	public java.math.BigDecimal getDecPdNetDecSom() {
		return decPdNetDecSom;
	}
	/**
	 * @param decPdNetDecSom the decPdNetDecSom to set
	 */
	public void setDecPdNetDecSom(java.math.BigDecimal decPdNetDecSom) {
		this.decPdNetDecSom = decPdNetDecSom;
	}
	/**
	 * @return the decValeurCaf
	 */
	public java.math.BigDecimal getDecValeurCaf() {
		return decValeurCaf;
	}
	/**
	 * @param decValeurCaf the decValeurCaf to set
	 */
	public void setDecValeurCaf(java.math.BigDecimal decValeurCaf) {
		this.decValeurCaf = decValeurCaf;
	}
	/**
	 * @return the decNbreResiSom
	 */
	public java.lang.Integer getDecNbreResiSom() {
		return decNbreResiSom;
	}
	/**
	 * @param decNbreResiSom the decNbreResiSom to set
	 */
	public void setDecNbreResiSom(java.lang.Integer decNbreResiSom) {
		this.decNbreResiSom = decNbreResiSom;
	}
	/**
	 * @return the decPdRestantSom
	 */
	public java.lang.Integer getDecPdRestantSom() {
		return decPdRestantSom;
	}
	/**
	 * @param decPdRestantSom the decPdRestantSom to set
	 */
	public void setDecPdRestantSom(java.lang.Integer decPdRestantSom) {
		this.decPdRestantSom = decPdRestantSom;
	}
	/**
	 * @return the decNbreMoisIntret4
	 */
	public java.lang.Integer getDecNbreMoisIntret4() {
		return decNbreMoisIntret4;
	}
	/**
	 * @param decNbreMoisIntret4 the decNbreMoisIntret4 to set
	 */
	public void setDecNbreMoisIntret4(java.lang.Integer decNbreMoisIntret4) {
		this.decNbreMoisIntret4 = decNbreMoisIntret4;
	}
	/**
	 * @return the decQteComplementaire
	 */
	public java.lang.Integer getDecQteComplementaire() {
		return decQteComplementaire;
	}
	/**
	 * @param decQteComplementaire the decQteComplementaire to set
	 */
	public void setDecQteComplementaire(java.lang.Integer decQteComplementaire) {
		this.decQteComplementaire = decQteComplementaire;
	}
	/**
	 * @return the decnbColisconsRepSom
	 */
	public java.lang.Integer getDecnbColisconsRepSom() {
		return decnbColisconsRepSom;
	}
	/**
	 * @param decnbColisconsRepSom the decnbColisconsRepSom to set
	 */
	public void setDecnbColisconsRepSom(java.lang.Integer decnbColisconsRepSom) {
		this.decnbColisconsRepSom = decnbColisconsRepSom;
	}
	/**
	 * @return the decPdConsSom
	 */
	public java.lang.Integer getDecPdConsSom() {
		return decPdConsSom;
	}
	/**
	 * @param decPdConsSom the decPdConsSom to set
	 */
	public void setDecPdConsSom(java.lang.Integer decPdConsSom) {
		this.decPdConsSom = decPdConsSom;
	}
	/**
	 * @return the decQteCompCons
	 */
	public java.lang.Integer getDecQteCompCons() {
		return decQteCompCons;
	}
	/**
	 * @param decQteCompCons the decQteCompCons to set
	 */
	public void setDecQteCompCons(java.lang.Integer decQteCompCons) {
		this.decQteCompCons = decQteCompCons;
	}
	/**
	 * @return the decQteResiSom
	 */
	public java.lang.Integer getDecQteResiSom() {
		return decQteResiSom;
	}
	/**
	 * @param decQteResiSom the decQteResiSom to set
	 */
	public void setDecQteResiSom(java.lang.Integer decQteResiSom) {
		this.decQteResiSom = decQteResiSom;
	}
	/**
	 * @return the decCodeLieuStock
	 */
	public java.lang.String getDecCodeLieuStock() {
		return decCodeLieuStock;
	}
	/**
	 * @param decCodeLieuStock the decCodeLieuStock to set
	 */
	public void setDecCodeLieuStock(java.lang.String decCodeLieuStock) {
		this.decCodeLieuStock = decCodeLieuStock;
	}
	/**
	 * @return the decTypeRegime
	 */
	public java.lang.String getDecTypeRegime() {
		return decTypeRegime;
	}
	/**
	 * @param decTypeRegime the decTypeRegime to set
	 */
	public void setDecTypeRegime(java.lang.String decTypeRegime) {
		this.decTypeRegime = decTypeRegime;
	}
	/**
	 * @return the decRegimeDouanier
	 */
	public java.lang.String getDecRegimeDouanier() {
		return decRegimeDouanier;
	}
	/**
	 * @param decRegimeDouanier the decRegimeDouanier to set
	 */
	public void setDecRegimeDouanier(java.lang.String decRegimeDouanier) {
		this.decRegimeDouanier = decRegimeDouanier;
	}
	/**
	 * @return the decValeurResiduelle
	 */
	public java.math.BigDecimal getDecValeurResiduelle() {
		return decValeurResiduelle;
	}
	/**
	 * @param decValeurResiduelle the decValeurResiduelle to set
	 */
	public void setDecValeurResiduelle(java.math.BigDecimal decValeurResiduelle) {
		this.decValeurResiduelle = decValeurResiduelle;
	}
	/**
	 * @return the decValCafConstatee
	 */
	public java.math.BigDecimal getDecValCafConstatee() {
		return decValCafConstatee;
	}
	/**
	 * @param decValCafConstatee the decValCafConstatee to set
	 */
	public void setDecValCafConstatee(java.math.BigDecimal decValCafConstatee) {
		this.decValCafConstatee = decValCafConstatee;
	}
	/**
	 * @return the decUserCtrlSommier
	 */
	public java.lang.String getDecUserCtrlSommier() {
		return decUserCtrlSommier;
	}
	/**
	 * @param decUserCtrlSommier the decUserCtrlSommier to set
	 */
	public void setDecUserCtrlSommier(java.lang.String decUserCtrlSommier) {
		this.decUserCtrlSommier = decUserCtrlSommier;
	}
	/**
	 * @return the decDateEcor
	 */
	public java.sql.Date getDecDateEcor() {
		return decDateEcor;
	}
	/**
	 * @param decDateEcor the decDateEcor to set
	 */
	public void setDecDateEcor(java.sql.Date decDateEcor) {
		this.decDateEcor = decDateEcor;
	}
	/**
	 * @return the decCodeCreditaire
	 */
	public java.lang.String getDecCodeCreditaire() {
		return decCodeCreditaire;
	}
	/**
	 * @param decCodeCreditaire the decCodeCreditaire to set
	 */
	public void setDecCodeCreditaire(java.lang.String decCodeCreditaire) {
		this.decCodeCreditaire = decCodeCreditaire;
	}
	/**
	 * @return the decNumDevarChargeTrans
	 */
	public java.lang.String getDecNumDevarChargeTrans() {
		return decNumDevarChargeTrans;
	}
	/**
	 * @param decNumDevarChargeTrans the decNumDevarChargeTrans to set
	 */
	public void setDecNumDevarChargeTrans(java.lang.String decNumDevarChargeTrans) {
		this.decNumDevarChargeTrans = decNumDevarChargeTrans;
	}
	/**
	 * @return the decDateAT
	 */
	public java.sql.Date getDecDateAT() {
		return decDateAT;
	}
	/**
	 * @param decDateAT the decDateAT to set
	 */
	public void setDecDateAT(java.sql.Date decDateAT) {
		this.decDateAT = decDateAT;
	}
	/**
	 * @return the decDateDecision
	 */
	public java.sql.Date getDecDateDecision() {
		return decDateDecision;
	}
	/**
	 * @param decDateDecision the decDateDecision to set
	 */
	public void setDecDateDecision(java.sql.Date decDateDecision) {
		this.decDateDecision = decDateDecision;
	}
	/**
	 * @return the decDecisionProrog
	 */
	public java.lang.String getDecDecisionProrog() {
		return decDecisionProrog;
	}
	/**
	 * @param decDecisionProrog the decDecisionProrog to set
	 */
	public void setDecDecisionProrog(java.lang.String decDecisionProrog) {
		this.decDecisionProrog = decDecisionProrog;
	}
	/**
	 * @return the decQteMercuriale
	 */
	public java.math.BigDecimal getDecQteMercuriale() {
		return decQteMercuriale;
	}
	/**
	 * @param decQteMercuriale the decQteMercuriale to set
	 */
	public void setDecQteMercuriale(java.math.BigDecimal decQteMercuriale) {
		this.decQteMercuriale = decQteMercuriale;
	}
	/**
	 * @return the decQteMercResiduelle
	 */
	public java.math.BigDecimal getDecQteMercResiduelle() {
		return decQteMercResiduelle;
	}
	/**
	 * @param decQteMercResiduelle the decQteMercResiduelle to set
	 */
	public void setDecQteMercResiduelle(java.math.BigDecimal decQteMercResiduelle) {
		this.decQteMercResiduelle = decQteMercResiduelle;
	}
	/**
	 * @return the decAnneeRegEco
	 */
	public java.lang.String getDecAnneeRegEco() {
		return decAnneeRegEco;
	}
	/**
	 * @param decAnneeRegEco the decAnneeRegEco to set
	 */
	public void setDecAnneeRegEco(java.lang.String decAnneeRegEco) {
		this.decAnneeRegEco = decAnneeRegEco;
	}
	/**
	 * @return the decNumRegEco
	 */
	public java.lang.String getDecNumRegEco() {
		return decNumRegEco;
	}
	/**
	 * @param decNumRegEco the decNumRegEco to set
	 */
	public void setDecNumRegEco(java.lang.String decNumRegEco) {
		this.decNumRegEco = decNumRegEco;
	}
	/**
	 * @return the decMutationAT
	 */
	public java.lang.String getDecMutationAT() {
		return decMutationAT;
	}
	/**
	 * @param decMutationAT the decMutationAT to set
	 */
	public void setDecMutationAT(java.lang.String decMutationAT) {
		this.decMutationAT = decMutationAT;
	}
	/**
	 * @return the decPaysOrigine
	 */
	public java.lang.String getDecPaysOrigine() {
		return decPaysOrigine;
	}
	/**
	 * @param decPaysOrigine the decPaysOrigine to set
	 */
	public void setDecPaysOrigine(java.lang.String decPaysOrigine) {
		this.decPaysOrigine = decPaysOrigine;
	}
	/**
	 * @return the decUniteCompl
	 */
	public java.lang.String getDecUniteCompl() {
		return decUniteCompl;
	}
	/**
	 * @param decUniteCompl the decUniteCompl to set
	 */
	public void setDecUniteCompl(java.lang.String decUniteCompl) {
		this.decUniteCompl = decUniteCompl;
	}
	/**
	 * @return the decUniteMercuriale
	 */
	public java.lang.String getDecUniteMercuriale() {
		return decUniteMercuriale;
	}
	/**
	 * @param decUniteMercuriale the decUniteMercuriale to set
	 */
	public void setDecUniteMercuriale(java.lang.String decUniteMercuriale) {
		this.decUniteMercuriale = decUniteMercuriale;
	}
	/**
	 * @return the decNbreColisApSom
	 */
	public java.math.BigDecimal getDecNbreColisApSom() {
		return decNbreColisApSom;
	}
	/**
	 * @param decNbreColisApSom the decNbreColisApSom to set
	 */
	public void setDecNbreColisApSom(java.math.BigDecimal decNbreColisApSom) {
		this.decNbreColisApSom = decNbreColisApSom;
	}
	/**
	 * @return the decPdApurSom
	 */
	public java.math.BigDecimal getDecPdApurSom() {
		return decPdApurSom;
	}
	/**
	 * @param decPdApurSom the decPdApurSom to set
	 */
	public void setDecPdApurSom(java.math.BigDecimal decPdApurSom) {
		this.decPdApurSom = decPdApurSom;
	}
	/**
	 * @return the decEtatSommier
	 */
	public java.lang.String getDecEtatSommier() {
		return decEtatSommier;
	}
	/**
	 * @param decEtatSommier the decEtatSommier to set
	 */
	public void setDecEtatSommier(java.lang.String decEtatSommier) {
		this.decEtatSommier = decEtatSommier;
	}
//	/**
//	 * @return the somHistSom
//	 */
//	public Sommiers getSomHistSom() {
//		return somHistSom;
//	}
//	/**
//	 * @param somHistSom the somHistSom to set
//	 */
//	public void setSomHistSom(Sommiers somHistSom) {
//		this.somHistSom = somHistSom;
//	}	
	
	
    
	
	

}
