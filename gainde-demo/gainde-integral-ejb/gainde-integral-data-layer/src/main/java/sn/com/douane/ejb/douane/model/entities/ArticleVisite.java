package sn.com.douane.ejb.douane.model.entities;

import java.io.Serializable;
import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;

import javax.persistence.Table;

import sn.com.douane.ejb.douane.model.keys.ArticleVisiteKey;



@Entity
@IdClass(ArticleVisiteKey.class)
@javax.persistence.NamedQueries(@javax.persistence.NamedQuery(name = "findByPK", query = "select object(o) from ArticleVisite o where  o.visAnneeEnreg = ?1 and  o.visBurEnreg = ?2 and  o.visNumDeclaration = ?3 and  o.visNumArt = ?4"))
@Table(name="ARTICLEVISITE")
public class ArticleVisite implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 2511045752248902433L;

	
	@Id
	@Column(name="VISANNEEENREG", length=4, nullable=false)
    private java.lang.String visAnneeEnreg;
	
	@Id
	@Column(name="VISBURENREG", length=3, nullable=false)
    private java.lang.String visBurEnreg;
		
	@Id
	@Column(name="VISNUMDECLARATION", nullable=false)
    private java.lang.Integer visNumDeclaration;
	
	@Id
	@Column(name="VISNUMART", nullable=false)
	 private java.lang.Integer visNumArt;
	
	@Column(name="VISCODEPROD", length=6, nullable=false)
	 private java.lang.String visCodeProd;
	
	@Column(name="VISPRECUEMOA", length=2, nullable=false)
	    private java.lang.String visPrecUemoa;
	
	@Column(name="VISPRECSEN", length=2, nullable=false)
	    private java.lang.String visPrecSen;
	
	@Column(name="VISNUMARTMANIF")
	    private java.lang.Integer visNumArtManif;
	
	@Column(name="VISREGFISCAL", length=2, nullable=false)
	    private java.lang.String visRegFiscal;
	
	@Column(name="VISNBRECOLISDECL", nullable=false)
	    private java.lang.Integer visNbreColisDecl;
	
	@Column(name="VISPOIDSBRUT",columnDefinition="DECIMAL(9,0)", nullable=false)
	    private java.math.BigDecimal visPoidsBrut;
	
	@Column(name="VISPDNET",columnDefinition="DECIMAL(11,0)", nullable=false)
	    private java.math.BigDecimal visPdNet;
	
	@Column(name="VISQTECOMPLEMENT",columnDefinition="DECIMAL(11,0)")
	    private java.math.BigDecimal visQteComplement;
	
	@Column(name="VISQTEMERC",columnDefinition="DECIMAL(11,0)")
	    private java.math.BigDecimal visQteMerc;
	
	@Column(name="VISNBRECHEVAUX")
	    private java.lang.Integer visNbreChevaux;
	
	@Column(name="VISMODECOND", length=4, nullable=false)
	    private java.lang.String visModeCond;
	
	@Column(name="VISPAYSORIGINE", length=3)
	    private java.lang.String visPaysOrigine;
	
	@Column(name="VISVALDEVFACTURE",columnDefinition="DECIMAL(13,0)")
	    private java.math.BigDecimal visValDevFacture;
	
	@Column(name="VISCODEDEVFACTURE", length=3)
	    private java.lang.String visCodeDevFacture;
	
	@Column(name="VISMTFACTURE",columnDefinition="DECIMAL(11,0)")
	    private java.math.BigDecimal visMtFacture;
	
	@Column(name="VISVALDEVFOB",columnDefinition="DECIMAL(13,0)")
	    private java.math.BigDecimal visValDevFob;
	
	@Column(name="VISCODEDEVFOB", length=3)
	    private java.lang.String visCodeDevFob;
	
	@Column(name="VISMTCFAFOB",columnDefinition="DECIMAL(11,0)")
	    private java.math.BigDecimal visMtcFaFob;
	
	@Column(name="VISVALDEVFRET", columnDefinition="DECIMAL(13,0)")
	    private java.math.BigDecimal visValDevFret;
	
	@Column(name="VISDEVISEFRET", length=3)
	    private java.lang.String visDeviseFret;
	
	@Column(name="VISMTCFAFRET",columnDefinition="DECIMAL(11,0)")
	    private java.math.BigDecimal visMtcFaFret;
	
	@Column(name="VISVALDEV",columnDefinition="DECIMAL(13,0)")
	    private java.math.BigDecimal visValDev;
	
	@Column(name="VISDEVISEASSUR", length=3)
	    private java.lang.String visDeviseAssur;
	
	@Column(name="VISVALCFAASSUR", columnDefinition="DECIMAL(11,0)")
	    private java.math.BigDecimal visValCfaAssur;
	
	@Column(name="VISVALASS", columnDefinition="DECIMAL(11,0)")
    private java.math.BigDecimal visValAss;
	
	@Column(name="VISVALDEVAUTRESELT",columnDefinition="DECIMAL(13,0)")
	    private java.math.BigDecimal visValDevAutresElt;
	
	@Column(name="VISDEVAUTRESELT", length=3)
	    private java.lang.String visDevAutresElt;
	
	@Column(name="VISMTCFAAUTRESELT", columnDefinition="DECIMAL(11,0)")
	    private java.math.BigDecimal visMtcfaAutresElt;
	
	@Column(name="VISPAYSFACTURATION", length=3)
	    private java.lang.String visPaysFacturation;
	
	@Column(name="VISPAYSFOB", length=3)
	    private java.lang.String visPaysFob;
	
	@Column(name="VISPAYSASSUR", length=3)
	    private java.lang.String visPaysAssur;
	
	@Column(name="VISPAYSFRET", length=3)
	    private java.lang.String visPaysFret;
	
	@Column(name="VISPAYSAUTRESELT", length=3)
	    private java.lang.String visPaysAutresElt;
	
	@Column(name="VISVALCAF",columnDefinition="DECIMAL(13,0)")
	    private java.math.BigDecimal visValCaf;
	
	@Column(name="VISVALMERC", columnDefinition="DECIMAL(11,0)")
	    private java.math.BigDecimal visValMerc;
	
	@Column(name="VISVALDOUANE", columnDefinition="DECIMAL(11,0)")
	    private java.math.BigDecimal visValDouane;
	
	@Column(name="VISMTLIQUIDART", columnDefinition="DECIMAL(11,0)")
	    private java.math.BigDecimal visMtLiquidArt;
	
	@Column(name="VISANNEESGSDPI", length=4)
	    private java.lang.String visAnneeSgsdpi;
	
	@Column(name="VISSGSDPICODEBQUE", length=5)
	    private java.lang.String visSgsdpiCodeBque;
	
	@Column(name="VISNUMSGSDPI", length=7)
	    private java.lang.String visNumSgsdpi;
	
	@Column(name="VISANNEEAVSGS", length=4)
	    private java.lang.String visAnneeAvSgs;
	
	@Column(name="VISNUMAVSGS", length=6)
	    private java.lang.String visNumAvSgs;
	
	@Column(name="VISSGSEXEMPTION", length=10)
	    private java.lang.String visSgsExemption;
	
	@Column(name="VISTYPEMANIF", length=1)
	    private java.lang.String visTypeManif;
	
	@Column(name="VISANNEEENREGMANIF", length=4)
	    private java.lang.String visAnneeEnregManif;
	
	@Column(name="VISBURENREGMANIF", length=3)
	    private java.lang.String visBurEnregManif;
	
	@Column(name="VISNUMENREGMANIF")
	    private java.lang.Integer visNumEnregManif;
	
	@Column(name="VISPRECARTMANIF")
	    private java.lang.Integer visPreCartManif;
	
	@Column(name="VISPREC2ARTMANIF")
	    private java.lang.Integer visPreC2artManif;
	
	@Column(name="VISMARQCOLIS")
	    private java.lang.String visMarqColis;
	
	@Column(name="VISDESCOMMERCIALE")
	    private java.lang.String visDesCommerciale;
	
	@Column(name="VISANNEETITPRECARR", length=4)
	    private java.lang.String visAnneeTitPrecArr;
	
	@Column(name="VISBURAPURDECL", length=3)
	    private java.lang.String visBurApurDecl;
	
	@Column(name="VISNUMDECLAPURANT")
	    private java.lang.Integer visNumDeclApurant;
	
	@Column(name="VISNUMARTDECAPURANTE")
	    private java.lang.Integer visNumArtDecApurante;
	
	@Column(name="VISCODELIEUSTOKAGE", length=3)
	    private java.lang.String visCodeLieuStokage;
	
	@Column(name="VISANNEEDEPPROV", length=4)
	    private java.lang.String visAnneeDepProv;
	
	@Column(name="VISBURDEPPROV", length=3)
	    private java.lang.String visBurDepProv;
	
	@Column(name="VISNUMDEPPROV")
	    private java.lang.Integer visNumDepProv;
	
	@Column(name="VISANNEEAUTADM", length=4)
	    private java.lang.String visAnneeAutAdm;
	
	@Column(name="VISNUMAUTORISATION", length=6)
	    private java.lang.String visNumAutorisation;
	
	@Column(name="VISPPMUSERFINAL", length=5)
	    private java.lang.String visPpmUserFinal;
	
	@Column(name="VISCATPRODUEMOA", length=2)
	    private java.lang.String visCatProdUemoa;
	
	@Column(name="VISAGMTENTUEMOA", length=4)
	    private java.lang.String visAgmtentUemoa;
	
	@Column(name="VISBUREXPORT", length=4)
	    private java.lang.String visBurExport;
	
	@Column(name="VISREGDOCEXPORT", length=4)
	    private java.lang.String visRegDocExport;
	
	@Column(name="VISBURMISECONS", length=4)
	    private java.lang.String visBurMiseCons;
	
	@Column(name="VISPAYSMISECONS", length=3)
	    private java.lang.String visPaysMiseCons;
	
	@Column(name="VISPAYSDEST", length=3)
	    private java.lang.String visPaysDest;
	
	@Column(name="VISNUMDOCEXPORT", length=7)
	    private java.lang.String visNumDocExport;
	
	@Column(name="VISNUMDECMISECONS", length=7)
	    private java.lang.String visNumDecMiseCons;
	
	@Column(name="VISDATEDOCEXPORT")
	    private java.sql.Date visDateDocExport;
	
	@Column(name="VISDATEMISECONS")
	    private java.sql.Date visDateMiseCons;
	
	@Column(name="VISTYPECONV", length=1)
	    private java.lang.String visTypeConv;
	
	@Column(name="VISANNEECONV", length=4)
	    private java.lang.String visAnneeConv;
	
	@Column(name="VISNUMCONV", length=6)
	    private java.lang.String visNumConv;
	
	@Column(name="VISNBRECOLIS",columnDefinition="DECIMAL(6,0)")
	    private java.math.BigDecimal visNbreColis;
	
	@Column(name="VISNBRECOLISENLEVES", columnDefinition="DECIMAL(6,0)")
	    private java.math.BigDecimal visNbreColisEnleves;
	
	@Column(name="VISPDBRUTENLART",columnDefinition="DECIMAL(9,0)")
	    private java.math.BigDecimal visPdBrutEnlArt;
	
	@Column(name="VISCODESOUMFACT", length=1)
	    private java.lang.String visCodeSoumFact;
	
	@Column(name="VISSOUMORIGINE", length=1)
	    private java.lang.String visSoumOrigine;
	
	@Column(name="VISCODEEXCLUTRANSIT", length=1)
	    private java.lang.String visCodeExcluTransit;
	
	@Column(name="VISCODEPRODCRU", length=1)
	    private java.lang.String visCodeProdCru;
	
	@Column(name="VISUNITECOMPLEMENT", length=2)
	    private java.lang.String visUniteComplement;
	
	@Column(name="VISUNITEMERCURIALE", length=2)
	    private java.lang.String visUniteMercuriale;
	
	@Column(name="VISTYPEMERCURIALE", length=1)
	    private java.lang.String visTypeMercuriale;
	
	@Column(name="VISVALMERCURIALE", columnDefinition="DECIMAL(11,0)")
	    private java.math.BigDecimal visValMercuriale;
	
	@Column(name="VISUNITEREGECO",  length=2)
	    private java.lang.String visUniteRegEco;
	
	@Column(name="VISQTEREGECO", columnDefinition="DECIMAL(8,0)")
	    private java.math.BigDecimal visQteRegEco;
	
	@Column(name="VISTOPMODIFICATION", length=1)
	    private java.lang.String visTopModification;
	
	@Column(name="VISAUTOMODIF", length=1)
	    private java.lang.String visAutoModif;
	
	@Column(name="VISNUMRECTIFVISITE")
	    private java.lang.Integer visNumRectifVisite;
	
	@Column(name="VISETATRECTIF", length=1)
	    private java.lang.String visEtatRectif;
	
	@Column(name="VISANNEEEXONERATION", length=4)
	    private java.lang.String visAnneeExoneration;
	
	@Column(name="VISPIECEFRANCHISE", length=2)
	    private java.lang.String visPieceFranchise;
	
	@Column(name="VISNUMEXONERATION", length=5)
	    private java.lang.String visNumExoneration;
	
	@Column(name="VISTXTBREDOUPREC")
	    private java.lang.Integer visTxtbRedouPrec;
	
	@Column(name="VISNUMTITRETRANS", length=12)
	    private java.lang.String visNumTitreTrans;
	
	@Column(name="VISINDICATEURSH", length=1)
	    private java.lang.String visIndicateurSh;
	
	@Column(name="VISQTEARTCONSTATEE", columnDefinition="DECIMAL(18,0)")
	    private java.math.BigDecimal visQteArtConstatee;
	
	@Column(name="VISTYPETRAITEMENT", length=1)
	    private java.lang.String visTypeTraitement;
	
	@Column(name="VISDOSSIERTPS", length=10)
	    private java.lang.String visDossierTps;
	
	@Column(name="DECOUVRAISON", columnDefinition="CHAR(1)")
    private java.lang.String decouvraison;

	public java.lang.String getVisAnneeEnreg() {
		return visAnneeEnreg;
	}

	public void setVisAnneeEnreg(java.lang.String visAnneeEnreg) {
		this.visAnneeEnreg = visAnneeEnreg;
	}

	public java.lang.String getVisBurEnreg() {
		return visBurEnreg;
	}

	public void setVisBurEnreg(java.lang.String visBurEnreg) {
		this.visBurEnreg = visBurEnreg;
	}

	public java.lang.Integer getVisNumDeclaration() {
		return visNumDeclaration;
	}

	public void setVisNumDeclaration(java.lang.Integer visNumDeclaration) {
		this.visNumDeclaration = visNumDeclaration;
	}

	public Integer getVisNumArt() {
		return visNumArt;
	}

	public void setVisNumArt(java.lang.Integer visNumArt) {
		this.visNumArt = visNumArt;
	}

	public java.lang.String getVisCodeProd() {
		return visCodeProd;
	}

	public void setVisCodeProd(java.lang.String visCodeProd) {
		this.visCodeProd = visCodeProd;
	}

	public java.lang.String getVisPrecUemoa() {
		return visPrecUemoa;
	}

	public void setVisPrecUemoa(java.lang.String visPrecUemoa) {
		this.visPrecUemoa = visPrecUemoa;
	}

	public java.lang.String getVisPrecSen() {
		return visPrecSen;
	}

	public void setVisPrecSen(java.lang.String visPrecSen) {
		this.visPrecSen = visPrecSen;
	}

	public java.lang.Integer getVisNumArtManif() {
		return visNumArtManif;
	}

	public void setVisNumArtManif(java.lang.Integer visNumArtManif) {
		this.visNumArtManif = visNumArtManif;
	}

	public java.lang.String getVisRegFiscal() {
		return visRegFiscal;
	}

	public void setVisRegFiscal(java.lang.String visRegFiscal) {
		this.visRegFiscal = visRegFiscal;
	}

	public java.lang.Integer getVisNbreColisDecl() {
		return visNbreColisDecl;
	}

	public void setVisNbreColisDecl(java.lang.Integer visNbreColisDecl) {
		this.visNbreColisDecl = visNbreColisDecl;
	}

	public java.math.BigDecimal getVisPoidsBrut() {
		return visPoidsBrut;
	}

	public void setVisPoidsBrut(java.math.BigDecimal visPoidsBrut) {
		this.visPoidsBrut = visPoidsBrut;
	}

	public java.math.BigDecimal getVisPdNet() {
		return visPdNet;
	}

	public void setVisPdNet(java.math.BigDecimal visPdNet) {
		this.visPdNet = visPdNet;
	}

	public java.math.BigDecimal getVisQteComplement() {
		return visQteComplement;
	}

	public void setVisQteComplement(java.math.BigDecimal visQteComplement) {
		this.visQteComplement = visQteComplement;
	}

	public java.math.BigDecimal getVisQteMerc() {
		return visQteMerc;
	}

	public void setVisQteMerc(java.math.BigDecimal visQteMerc) {
		this.visQteMerc = visQteMerc;
	}

	public java.lang.Integer getVisNbreChevaux() {
		return visNbreChevaux;
	}

	public void setVisNbreChevaux(java.lang.Integer visNbreChevaux) {
		this.visNbreChevaux = visNbreChevaux;
	}

	public java.lang.String getVisModeCond() {
		return visModeCond;
	}

	public void setVisModeCond(java.lang.String visModeCond) {
		this.visModeCond = visModeCond;
	}

	public java.lang.String getVisPaysOrigine() {
		return visPaysOrigine;
	}

	public void setVisPaysOrigine(java.lang.String visPaysOrigine) {
		this.visPaysOrigine = visPaysOrigine;
	}

	public java.math.BigDecimal getVisValDevFacture() {
		return visValDevFacture;
	}

	public void setVisValDevFacture(java.math.BigDecimal visValDevFacture) {
		this.visValDevFacture = visValDevFacture;
	}

	public java.lang.String getVisCodeDevFacture() {
		return visCodeDevFacture;
	}

	public void setVisCodeDevFacture(java.lang.String visCodeDevFacture) {
		this.visCodeDevFacture = visCodeDevFacture;
	}

	public java.math.BigDecimal getVisMtFacture() {
		return visMtFacture;
	}

	public void setVisMtFacture(java.math.BigDecimal visMtFacture) {
		this.visMtFacture = visMtFacture;
	}

	public java.math.BigDecimal getVisValDevFob() {
		return visValDevFob;
	}

	public void setVisValDevFob(java.math.BigDecimal visValDevFob) {
		this.visValDevFob = visValDevFob;
	}

	public java.lang.String getVisCodeDevFob() {
		return visCodeDevFob;
	}

	public void setVisCodeDevFob(java.lang.String visCodeDevFob) {
		this.visCodeDevFob = visCodeDevFob;
	}

	public java.math.BigDecimal getVisMtcFaFob() {
		return visMtcFaFob;
	}

	public void setVisMtcFaFob(java.math.BigDecimal visMtcFaFob) {
		this.visMtcFaFob = visMtcFaFob;
	}

	public java.math.BigDecimal getVisValDevFret() {
		return visValDevFret;
	}

	public void setVisValDevFret(java.math.BigDecimal visValDevFret) {
		this.visValDevFret = visValDevFret;
	}

	public java.lang.String getVisDeviseFret() {
		return visDeviseFret;
	}

	public void setVisDeviseFret(java.lang.String visDeviseFret) {
		this.visDeviseFret = visDeviseFret;
	}

	public java.math.BigDecimal getVisMtcFaFret() {
		return visMtcFaFret;
	}

	public void setVisMtcFaFret(java.math.BigDecimal visMtcFaFret) {
		this.visMtcFaFret = visMtcFaFret;
	}

	public java.math.BigDecimal getVisValDev() {
		return visValDev;
	}

	public void setVisValDev(java.math.BigDecimal visValDev) {
		this.visValDev = visValDev;
	}

	public java.lang.String getVisDeviseAssur() {
		return visDeviseAssur;
	}

	public void setVisDeviseAssur(java.lang.String visDeviseAssur) {
		this.visDeviseAssur = visDeviseAssur;
	}

	public java.math.BigDecimal getVisValCfaAssur() {
		return visValCfaAssur;
	}

	public void setVisValCfaAssur(java.math.BigDecimal visValCfaAssur) {
		this.visValCfaAssur = visValCfaAssur;
	}

	public java.math.BigDecimal getVisValAss() {
		return visValAss;
	}

	public void setVisValAss(java.math.BigDecimal visValAss) {
		this.visValAss = visValAss;
	}

	public java.math.BigDecimal getVisValDevAutresElt() {
		return visValDevAutresElt;
	}

	public void setVisValDevAutresElt(java.math.BigDecimal visValDevAutresElt) {
		this.visValDevAutresElt = visValDevAutresElt;
	}

	public java.lang.String getVisDevAutresElt() {
		return visDevAutresElt;
	}

	public void setVisDevAutresElt(java.lang.String visDevAutresElt) {
		this.visDevAutresElt = visDevAutresElt;
	}

	public java.math.BigDecimal getVisMtcfaAutresElt() {
		return visMtcfaAutresElt;
	}

	public void setVisMtcfaAutresElt(java.math.BigDecimal visMtcfaAutresElt) {
		this.visMtcfaAutresElt = visMtcfaAutresElt;
	}

	public java.lang.String getVisPaysFacturation() {
		return visPaysFacturation;
	}

	public void setVisPaysFacturation(java.lang.String visPaysFacturation) {
		this.visPaysFacturation = visPaysFacturation;
	}

	public java.lang.String getVisPaysFob() {
		return visPaysFob;
	}

	public void setVisPaysFob(java.lang.String visPaysFob) {
		this.visPaysFob = visPaysFob;
	}

	public java.lang.String getVisPaysAssur() {
		return visPaysAssur;
	}

	public void setVisPaysAssur(java.lang.String visPaysAssur) {
		this.visPaysAssur = visPaysAssur;
	}

	public java.lang.String getVisPaysFret() {
		return visPaysFret;
	}

	public void setVisPaysFret(java.lang.String visPaysFret) {
		this.visPaysFret = visPaysFret;
	}

	public java.lang.String getVisPaysAutresElt() {
		return visPaysAutresElt;
	}

	public void setVisPaysAutresElt(java.lang.String visPaysAutresElt) {
		this.visPaysAutresElt = visPaysAutresElt;
	}

	public java.math.BigDecimal getVisValCaf() {
		return visValCaf;
	}

	public void setVisValCaf(java.math.BigDecimal visValCaf) {
		this.visValCaf = visValCaf;
	}

	public java.math.BigDecimal getVisValMerc() {
		return visValMerc;
	}

	public void setVisValMerc(java.math.BigDecimal visValMerc) {
		this.visValMerc = visValMerc;
	}

	public java.math.BigDecimal getVisValDouane() {
		return visValDouane;
	}

	public void setVisValDouane(java.math.BigDecimal visValDouane) {
		this.visValDouane = visValDouane;
	}

	public java.math.BigDecimal getVisMtLiquidArt() {
		return visMtLiquidArt;
	}

	public void setVisMtLiquidArt(java.math.BigDecimal visMtLiquidArt) {
		this.visMtLiquidArt = visMtLiquidArt;
	}

	public java.lang.String getVisAnneeSgsdpi() {
		return visAnneeSgsdpi;
	}

	public void setVisAnneeSgsdpi(java.lang.String visAnneeSgsdpi) {
		this.visAnneeSgsdpi = visAnneeSgsdpi;
	}

	public java.lang.String getVisSgsdpiCodeBque() {
		return visSgsdpiCodeBque;
	}

	public void setVisSgsdpiCodeBque(java.lang.String visSgsdpiCodeBque) {
		this.visSgsdpiCodeBque = visSgsdpiCodeBque;
	}

	public java.lang.String getVisNumSgsdpi() {
		return visNumSgsdpi;
	}

	public void setVisNumSgsdpi(java.lang.String visNumSgsdpi) {
		this.visNumSgsdpi = visNumSgsdpi;
	}

	public java.lang.String getVisAnneeAvSgs() {
		return visAnneeAvSgs;
	}

	public void setVisAnneeAvSgs(java.lang.String visAnneeAvSgs) {
		this.visAnneeAvSgs = visAnneeAvSgs;
	}

	public java.lang.String getVisNumAvSgs() {
		return visNumAvSgs;
	}

	public void setVisNumAvSgs(java.lang.String visNumAvSgs) {
		this.visNumAvSgs = visNumAvSgs;
	}

	public java.lang.String getVisSgsExemption() {
		return visSgsExemption;
	}

	public void setVisSgsExemption(java.lang.String visSgsExemption) {
		this.visSgsExemption = visSgsExemption;
	}

	public java.lang.String getVisTypeManif() {
		return visTypeManif;
	}

	public void setVisTypeManif(java.lang.String visTypeManif) {
		this.visTypeManif = visTypeManif;
	}

	public java.lang.String getVisAnneeEnregManif() {
		return visAnneeEnregManif;
	}

	public void setVisAnneeEnregManif(java.lang.String visAnneeEnregManif) {
		this.visAnneeEnregManif = visAnneeEnregManif;
	}

	public java.lang.String getVisBurEnregManif() {
		return visBurEnregManif;
	}

	public void setVisBurEnregManif(java.lang.String visBurEnregManif) {
		this.visBurEnregManif = visBurEnregManif;
	}

	public java.lang.Integer getVisNumEnregManif() {
		return visNumEnregManif;
	}

	public void setVisNumEnregManif(java.lang.Integer visNumEnregManif) {
		this.visNumEnregManif = visNumEnregManif;
	}

	public java.lang.Integer getVisPreCartManif() {
		return visPreCartManif;
	}

	public void setVisPreCartManif(java.lang.Integer visPreCartManif) {
		this.visPreCartManif = visPreCartManif;
	}

	public java.lang.Integer getVisPreC2artManif() {
		return visPreC2artManif;
	}

	public void setVisPreC2artManif(java.lang.Integer visPreC2artManif) {
		this.visPreC2artManif = visPreC2artManif;
	}

	public java.lang.String getVisMarqColis() {
		return visMarqColis;
	}

	public void setVisMarqColis(java.lang.String visMarqColis) {
		this.visMarqColis = visMarqColis;
	}

	public java.lang.String getVisDesCommerciale() {
		return visDesCommerciale;
	}

	public void setVisDesCommerciale(java.lang.String visDesCommerciale) {
		this.visDesCommerciale = visDesCommerciale;
	}

	public java.lang.String getVisAnneeTitPrecArr() {
		return visAnneeTitPrecArr;
	}

	public void setVisAnneeTitPrecArr(java.lang.String visAnneeTitPrecArr) {
		this.visAnneeTitPrecArr = visAnneeTitPrecArr;
	}

	public java.lang.String getVisBurApurDecl() {
		return visBurApurDecl;
	}

	public void setVisBurApurDecl(java.lang.String visBurApurDecl) {
		this.visBurApurDecl = visBurApurDecl;
	}

	public java.lang.Integer getVisNumDeclApurant() {
		return visNumDeclApurant;
	}

	public void setVisNumDeclApurant(java.lang.Integer visNumDeclApurant) {
		this.visNumDeclApurant = visNumDeclApurant;
	}

	public java.lang.Integer getVisNumArtDecApurante() {
		return visNumArtDecApurante;
	}

	public void setVisNumArtDecApurante(java.lang.Integer visNumArtDecApurante) {
		this.visNumArtDecApurante = visNumArtDecApurante;
	}

	public java.lang.String getVisCodeLieuStokage() {
		return visCodeLieuStokage;
	}

	public void setVisCodeLieuStokage(java.lang.String visCodeLieuStokage) {
		this.visCodeLieuStokage = visCodeLieuStokage;
	}

	public java.lang.String getVisAnneeDepProv() {
		return visAnneeDepProv;
	}

	public void setVisAnneeDepProv(java.lang.String visAnneeDepProv) {
		this.visAnneeDepProv = visAnneeDepProv;
	}

	public java.lang.String getVisBurDepProv() {
		return visBurDepProv;
	}

	public void setVisBurDepProv(java.lang.String visBurDepProv) {
		this.visBurDepProv = visBurDepProv;
	}

	public java.lang.Integer getVisNumDepProv() {
		return visNumDepProv;
	}

	public void setVisNumDepProv(java.lang.Integer visNumDepProv) {
		this.visNumDepProv = visNumDepProv;
	}

	public java.lang.String getVisAnneeAutAdm() {
		return visAnneeAutAdm;
	}

	public void setVisAnneeAutAdm(java.lang.String visAnneeAutAdm) {
		this.visAnneeAutAdm = visAnneeAutAdm;
	}

	public java.lang.String getVisNumAutorisation() {
		return visNumAutorisation;
	}

	public void setVisNumAutorisation(java.lang.String visNumAutorisation) {
		this.visNumAutorisation = visNumAutorisation;
	}

	public java.lang.String getVisPpmUserFinal() {
		return visPpmUserFinal;
	}

	public void setVisPpmUserFinal(java.lang.String visPpmUserFinal) {
		this.visPpmUserFinal = visPpmUserFinal;
	}

	public java.lang.String getVisCatProdUemoa() {
		return visCatProdUemoa;
	}

	public void setVisCatProdUemoa(java.lang.String visCatProdUemoa) {
		this.visCatProdUemoa = visCatProdUemoa;
	}

	public java.lang.String getVisAgmtentUemoa() {
		return visAgmtentUemoa;
	}

	public void setVisAgmtentUemoa(java.lang.String visAgmtentUemoa) {
		this.visAgmtentUemoa = visAgmtentUemoa;
	}

	public java.lang.String getVisBurExport() {
		return visBurExport;
	}

	public void setVisBurExport(java.lang.String visBurExport) {
		this.visBurExport = visBurExport;
	}

	public java.lang.String getVisRegDocExport() {
		return visRegDocExport;
	}

	public void setVisRegDocExport(java.lang.String visRegDocExport) {
		this.visRegDocExport = visRegDocExport;
	}

	public java.lang.String getVisBurMiseCons() {
		return visBurMiseCons;
	}

	public void setVisBurMiseCons(java.lang.String visBurMiseCons) {
		this.visBurMiseCons = visBurMiseCons;
	}

	public java.lang.String getVisPaysMiseCons() {
		return visPaysMiseCons;
	}

	public void setVisPaysMiseCons(java.lang.String visPaysMiseCons) {
		this.visPaysMiseCons = visPaysMiseCons;
	}

	public java.lang.String getVisPaysDest() {
		return visPaysDest;
	}

	public void setVisPaysDest(java.lang.String visPaysDest) {
		this.visPaysDest = visPaysDest;
	}

	public java.lang.String getVisNumDocExport() {
		return visNumDocExport;
	}

	public void setVisNumDocExport(java.lang.String visNumDocExport) {
		this.visNumDocExport = visNumDocExport;
	}

	public java.lang.String getVisNumDecMiseCons() {
		return visNumDecMiseCons;
	}

	public void setVisNumDecMiseCons(java.lang.String visNumDecMiseCons) {
		this.visNumDecMiseCons = visNumDecMiseCons;
	}

	public java.sql.Date getVisDateDocExport() {
		return visDateDocExport;
	}

	public void setVisDateDocExport(java.sql.Date visDateDocExport) {
		this.visDateDocExport = visDateDocExport;
	}

	public java.sql.Date getVisDateMiseCons() {
		return visDateMiseCons;
	}

	public void setVisDateMiseCons(java.sql.Date visDateMiseCons) {
		this.visDateMiseCons = visDateMiseCons;
	}

	public java.lang.String getVisTypeConv() {
		return visTypeConv;
	}

	public void setVisTypeConv(java.lang.String visTypeConv) {
		this.visTypeConv = visTypeConv;
	}

	public java.lang.String getVisAnneeConv() {
		return visAnneeConv;
	}

	public void setVisAnneeConv(java.lang.String visAnneeConv) {
		this.visAnneeConv = visAnneeConv;
	}

	public java.lang.String getVisNumConv() {
		return visNumConv;
	}

	public void setVisNumConv(java.lang.String visNumConv) {
		this.visNumConv = visNumConv;
	}

	public java.math.BigDecimal getVisNbreColis() {
		return visNbreColis;
	}

	public void setVisNbreColis(java.math.BigDecimal visNbreColis) {
		this.visNbreColis = visNbreColis;
	}

	public java.math.BigDecimal getVisNbreColisEnleves() {
		return visNbreColisEnleves;
	}

	public void setVisNbreColisEnleves(java.math.BigDecimal visNbreColisEnleves) {
		this.visNbreColisEnleves = visNbreColisEnleves;
	}

	public java.math.BigDecimal getVisPdBrutEnlArt() {
		return visPdBrutEnlArt;
	}

	public void setVisPdBrutEnlArt(java.math.BigDecimal visPdBrutEnlArt) {
		this.visPdBrutEnlArt = visPdBrutEnlArt;
	}

	public java.lang.String getVisCodeSoumFact() {
		return visCodeSoumFact;
	}

	public void setVisCodeSoumFact(java.lang.String visCodeSoumFact) {
		this.visCodeSoumFact = visCodeSoumFact;
	}

	public java.lang.String getVisSoumOrigine() {
		return visSoumOrigine;
	}

	public void setVisSoumOrigine(java.lang.String visSoumOrigine) {
		this.visSoumOrigine = visSoumOrigine;
	}

	public java.lang.String getVisCodeExcluTransit() {
		return visCodeExcluTransit;
	}

	public void setVisCodeExcluTransit(java.lang.String visCodeExcluTransit) {
		this.visCodeExcluTransit = visCodeExcluTransit;
	}

	public java.lang.String getVisCodeProdCru() {
		return visCodeProdCru;
	}

	public void setVisCodeProdCru(java.lang.String visCodeProdCru) {
		this.visCodeProdCru = visCodeProdCru;
	}

	public java.lang.String getVisUniteComplement() {
		return visUniteComplement;
	}

	public void setVisUniteComplement(java.lang.String visUniteComplement) {
		this.visUniteComplement = visUniteComplement;
	}

	public java.lang.String getVisUniteMercuriale() {
		return visUniteMercuriale;
	}

	public void setVisUniteMercuriale(java.lang.String visUniteMercuriale) {
		this.visUniteMercuriale = visUniteMercuriale;
	}

	public java.lang.String getVisTypeMercuriale() {
		return visTypeMercuriale;
	}

	public void setVisTypeMercuriale(java.lang.String visTypeMercuriale) {
		this.visTypeMercuriale = visTypeMercuriale;
	}

	public java.math.BigDecimal getVisValMercuriale() {
		return visValMercuriale;
	}

	public void setVisValMercuriale(java.math.BigDecimal visValMercuriale) {
		this.visValMercuriale = visValMercuriale;
	}

	public java.lang.String getVisUniteRegEco() {
		return visUniteRegEco;
	}

	public void setVisUniteRegEco(java.lang.String visUniteRegEco) {
		this.visUniteRegEco = visUniteRegEco;
	}

	public java.math.BigDecimal getVisQteRegEco() {
		return visQteRegEco;
	}

	public void setVisQteRegEco(java.math.BigDecimal visQteRegEco) {
		this.visQteRegEco = visQteRegEco;
	}

	public java.lang.String getVisTopModification() {
		return visTopModification;
	}

	public void setVisTopModification(java.lang.String visTopModification) {
		this.visTopModification = visTopModification;
	}

	public java.lang.String getVisAutoModif() {
		return visAutoModif;
	}

	public void setVisAutoModif(java.lang.String visAutoModif) {
		this.visAutoModif = visAutoModif;
	}

	public java.lang.Integer getVisNumRectifVisite() {
		return visNumRectifVisite;
	}

	public void setVisNumRectifVisite(java.lang.Integer visNumRectifVisite) {
		this.visNumRectifVisite = visNumRectifVisite;
	}

	public java.lang.String getVisEtatRectif() {
		return visEtatRectif;
	}

	public void setVisEtatRectif(java.lang.String visEtatRectif) {
		this.visEtatRectif = visEtatRectif;
	}

	public java.lang.String getVisAnneeExoneration() {
		return visAnneeExoneration;
	}

	public void setVisAnneeExoneration(java.lang.String visAnneeExoneration) {
		this.visAnneeExoneration = visAnneeExoneration;
	}

	public java.lang.String getVisPieceFranchise() {
		return visPieceFranchise;
	}

	public void setVisPieceFranchise(java.lang.String visPieceFranchise) {
		this.visPieceFranchise = visPieceFranchise;
	}

	public java.lang.String getVisNumExoneration() {
		return visNumExoneration;
	}

	public void setVisNumExoneration(java.lang.String visNumExoneration) {
		this.visNumExoneration = visNumExoneration;
	}

	public java.lang.Integer getVisTxtbRedouPrec() {
		return visTxtbRedouPrec;
	}

	public void setVisTxtbRedouPrec(java.lang.Integer visTxtbRedouPrec) {
		this.visTxtbRedouPrec = visTxtbRedouPrec;
	}

	public java.lang.String getVisNumTitreTrans() {
		return visNumTitreTrans;
	}

	public void setVisNumTitreTrans(java.lang.String visNumTitreTrans) {
		this.visNumTitreTrans = visNumTitreTrans;
	}

	public java.lang.String getVisIndicateurSh() {
		return visIndicateurSh;
	}

	public void setVisIndicateurSh(java.lang.String visIndicateurSh) {
		this.visIndicateurSh = visIndicateurSh;
	}

	public java.math.BigDecimal getVisQteArtConstatee() {
		return visQteArtConstatee;
	}

	public void setVisQteArtConstatee(java.math.BigDecimal visQteArtConstatee) {
		this.visQteArtConstatee = visQteArtConstatee;
	}

	public java.lang.String getVisTypeTraitement() {
		return visTypeTraitement;
	}

	public void setVisTypeTraitement(java.lang.String visTypeTraitement) {
		this.visTypeTraitement = visTypeTraitement;
	}

	public java.lang.String getVisDossierTps() {
		return visDossierTps;
	}

	public void setVisDossierTps(java.lang.String visDossierTps) {
		this.visDossierTps = visDossierTps;
	}

	public java.lang.String getDecouvraison() {
		return decouvraison;
	}

	public void setDecouvraison(java.lang.String decouvraison) {
		this.decouvraison = decouvraison;
	}

}