package sn.com.douane.ejb.declaration.model.entities;

import java.io.Serializable;
import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Transient;

import sn.com.douane.ejb.declaration.model.keys.DdeRectifArtDeclKey;

/**
 * @author: issam
 * Bean implementation class for Enterprise Bean: DdeRectifArtDecl
 */

@Entity
@Table(name = "DDERECTIFARTDECL")
@IdClass(DdeRectifArtDeclKey.class)
//@javax.persistence.NamedQueries(@javax.persistence.NamedQuery(name = "findDdeRectifByAnneeBurNumenreg" , query = "select object(o) from Dderectifartdecl o where o.ce_artdecdderectif.ce_sgenartdec.decanneeenregdec = ?1 and o.ce_artdecdderectif.ce_sgenartdec.decburenregdec = ?2 and o.ce_artdecdderectif.ce_sgenartdec.decnumdeclaration = ?3  and o.ce_artdecdderectif.decnumartdec = ?4"))

public class DdeRectifArtDecl implements Serializable {

	private static final long serialVersionUID = -5409639200073149708L;
	@Id
	@Column(name = "DECANNEEENREGDEC" , length = 4 , nullable = false)
	private String decAnneeEnregDec;
	@Id
	@Column(name = "DECBURENREGDEC" , length = 4 , nullable = false)
	private String decBurEnregDec;	
	@Id
	@Column(name = "DECNUMDECLARATION" , nullable = false)
	private Integer decNumDeclaration;
	@Id
	@Column(name = "DECNUMARTDEC" ,nullable = false)
	private Integer decNumArtDec;
	@Column(name = "DECPDBRUTARTDEC" , columnDefinition="DECIMAL(9 , 0)")
	private java.math.BigDecimal decPdBrutArtDec;
	@Column(name = "DECPDNETARTDEC" , columnDefinition="DECIMAL(11 , 0)")
	private java.math.BigDecimal decPdNetArtDec;
	@Column(name = "DECQTECOMPLEMENT" , columnDefinition="DECIMAL(11 , 0)")
	private java.math.BigDecimal decQteComplement;
	@Column(name = "DECQTEMERCURIALE" , columnDefinition="DECIMAL(11 , 0)")
	private java.math.BigDecimal decQteMercuriale;
	@Column(name = "DECVALEURFOB" , columnDefinition="DECIMAL(13 , 0)")
	private java.math.BigDecimal decValeurFob;
	@Column(name = "DECVALEURFRET" , columnDefinition="DECIMAL(13 , 0)")
	private java.math.BigDecimal decValeurFret;
	@Column(name = "DECVALELEMENT" , columnDefinition="DECIMAL(13 , 0)")
	private java.math.BigDecimal decValElement;
	@Column(name = "DECVALFACTURE" , columnDefinition="DECIMAL(13 , 0)")
	private java.math.BigDecimal decValFacture;
	@Column(name = "DECVALASSURANCES" , columnDefinition="DECIMAL(13 , 0)")
	private java.math.BigDecimal decValAssurances;
	@Column(name = "DECDEVISEFACTURE" , length = 3)
	private String decDeviseFacture;
	@Column(name = "DECDEVISEFOB" , length = 3)
	private String decDeviseFob;
	@Column(name = "DECDEVISEFRET" , length = 3)
	private String decDeviseFret;	
	@Column(name = "DECDEVISEASSURANCE" , length = 3)
	private String decDeviseAssurance;
	@Column(name = "DECDEVISEAUTREELEM" , length = 3)
	private String decDeviseAutreElem;
	@Column(name = "DECCODESOUMISSION" , length = 1)
	private String decCodeSoumission;
	@Column(name = "DECVALCAF" , columnDefinition="DECIMAL(11 , 0)")
	private java.math.BigDecimal decValCaf;
	@Column(name = "DECVALMERCURIALE" , columnDefinition="DECIMAL(11 , 0)")
	private java.math.BigDecimal decValMercuriale;
	@Column(name = "DECVALENDOUANE" , columnDefinition="DECIMAL(11 , 0)")
	private java.math.BigDecimal decValEnDouane;
	@Column(name = "DECVALCFAFACTURE" , columnDefinition="DECIMAL(11 , 0)")
	private java.math.BigDecimal decValCfaFacture;
	@Column(name = "DECMONTCFAFOB" , columnDefinition="DECIMAL(11 , 0)")
	private java.math.BigDecimal decMontCfaFob;
	@Column(name = "DECMONTCFAFRET" , columnDefinition="DECIMAL(11 , 0)")
	private java.math.BigDecimal decMontCfaFret;
	@Column(name = "DECASSURENCFA" , columnDefinition="DECIMAL(11 , 0)")
	private java.math.BigDecimal decAssurEnCfa;
	@Column(name = "DECMONTCFAELEM" , columnDefinition="DECIMAL(11 , 0)")
	private java.math.BigDecimal decMontCfaElem;
	@Column(name = "DECTYPEMERCURIALE" , length = 1)
	private String decTypeMercuriale;
	@Column(name = "DECNBRECOLISDECLARE" )
	private Integer decNbreColisDeclare;
	@Column(name = "DECPRECUEMOA" , length = 2)
	private String decPrecueMoa;
	@Column(name = "DECPRECSENEGAL" , length = 2)
	private String decPrecSenegal;
	@Column(name = "DECCODEPROD" , length = 6)
	private String decCodeProd;
	@Column(name = "DECNBRECHEVAUX")
	private Integer decNbreChevaux;
	@Column(name = "DECDATEDDERECTIF")
	private Timestamp decDateDdeRectif;
	@Column(name = "DECMTLIQUIDEE" , columnDefinition="DECIMAL(13 , 0)")
	private java.math.BigDecimal decMtLiquidee;
	@Column(name = "DECQTEREGECO" , columnDefinition="DECIMAL(11 , 0)")
	private java.math.BigDecimal decQteRegEco;
	@Column(name = "DECUNITECOMP" , length = 2)
	private String decUniteComp;
	@Column(name = "DECUNITEMERCURIALE" , length = 2)
	private String decUniteMercuriale;
	@Column(name = "DECUNITEREGECO" , length = 2)
	private String decUniteRegEco;
	@Column(name = "DECINDCONTENER" , length = 1)
	private String decIndContener;
	@Column(name = "DECINDCALCUL" , length = 1)
	private String decIndCalcul;

	@ManyToOne(targetEntity = SegArtDec.class)
	@JoinColumns({
			@JoinColumn(name = "DECNUMARTDEC", referencedColumnName = "DECNUMARTDEC", insertable = false, updatable = false, nullable = false),
			@JoinColumn(name = "DECANNEEENREGDEC", referencedColumnName = "DECANNEEENREGDEC", insertable = false, updatable = false, nullable = false),
			@JoinColumn(name = "DECBURENREGDEC", referencedColumnName = "DECBURENREGDEC", insertable = false, updatable = false, nullable = false),
			@JoinColumn(name = "DECNUMDECLARATION", referencedColumnName = "DECNUMDECLARATION", insertable = false, updatable = false, nullable = false) })
	private SegArtDec segArtDec;
	
	@Transient
	private String codPpmDeclarant;
	
	@Transient
	private String numRepertoire;

	public DdeRectifArtDecl( String decAnneeEnregDec , String decBurEnregDec , Integer decNumDeclaration , Integer decNumArtDec) {
		this.decAnneeEnregDec = decAnneeEnregDec;
		this.decBurEnregDec = decBurEnregDec;	
		this.decNumDeclaration = decNumDeclaration;
		this.decNumArtDec = decNumArtDec;
	}
	public DdeRectifArtDecl(){

	}
	public String getDecAnneeEnregDec() {
		return decAnneeEnregDec;
	}
	public void setDecAnneeEnregDec(String decAnneeEnregDec) {
		this.decAnneeEnregDec = decAnneeEnregDec;
	}
	public String getDecBurEnregDec() {
		return decBurEnregDec;
	}
	public void setDecBurEnregDec(String decBurEnregDec) {
		this.decBurEnregDec = decBurEnregDec;
	}
	public Integer getDecNumDeclaration() {
		return decNumDeclaration;
	}
	public void setDecNumDeclaration(Integer decNumDeclaration) {
		this.decNumDeclaration = decNumDeclaration;
	}
	public Integer getDecNumArtDec() {
		return decNumArtDec;
	}
	public void setDecNumArtDec(Integer decNumArtDec) {
		this.decNumArtDec = decNumArtDec;
	}
	public java.math.BigDecimal getDecPdBrutArtDec() {
		return decPdBrutArtDec;
	}
	public void setDecPdBrutArtDec(java.math.BigDecimal decPdBrutArtDec) {
		this.decPdBrutArtDec = decPdBrutArtDec;
	}
	public java.math.BigDecimal getDecPdNetArtDec() {
		return decPdNetArtDec;
	}
	public void setDecPdNetArtDec(java.math.BigDecimal decPdNetArtDec) {
		this.decPdNetArtDec = decPdNetArtDec;
	}
	public java.math.BigDecimal getDecQteComplement() {
		return decQteComplement;
	}
	public void setDecQteComplement(java.math.BigDecimal decQteComplement) {
		this.decQteComplement = decQteComplement;
	}
	public java.math.BigDecimal getDecQteMercuriale() {
		return decQteMercuriale;
	}
	public void setDecQteMercuriale(java.math.BigDecimal decQteMercuriale) {
		this.decQteMercuriale = decQteMercuriale;
	}
	public java.math.BigDecimal getDecValeurFob() {
		return decValeurFob;
	}
	public void setDecValeurFob(java.math.BigDecimal decValeurFob) {
		this.decValeurFob = decValeurFob;
	}
	public java.math.BigDecimal getDecValeurFret() {
		return decValeurFret;
	}
	public void setDecValeurFret(java.math.BigDecimal decValeurFret) {
		this.decValeurFret = decValeurFret;
	}
	public java.math.BigDecimal getDecValElement() {
		return decValElement;
	}
	public void setDecValElement(java.math.BigDecimal decValElement) {
		this.decValElement = decValElement;
	}
	public java.math.BigDecimal getDecValFacture() {
		return decValFacture;
	}
	public void setDecValFacture(java.math.BigDecimal decValFacture) {
		this.decValFacture = decValFacture;
	}
	public java.math.BigDecimal getDecValAssurances() {
		return decValAssurances;
	}
	public void setDecValAssurances(java.math.BigDecimal decValAssurances) {
		this.decValAssurances = decValAssurances;
	}
	public String getDecDeviseFacture() {
		return decDeviseFacture;
	}
	public void setDecDeviseFacture(String decDeviseFacture) {
		this.decDeviseFacture = decDeviseFacture;
	}
	public String getDecDeviseFob() {
		return decDeviseFob;
	}
	public void setDecDeviseFob(String decDeviseFob) {
		this.decDeviseFob = decDeviseFob;
	}
	public String getDecDeviseFret() {
		return decDeviseFret;
	}
	public void setDecDeviseFret(String decDeviseFret) {
		this.decDeviseFret = decDeviseFret;
	}
	public String getDecDeviseAssurance() {
		return decDeviseAssurance;
	}
	public void setDecDeviseAssurance(String decDeviseAssurance) {
		this.decDeviseAssurance = decDeviseAssurance;
	}
	public String getDecDeviseAutreElem() {
		return decDeviseAutreElem;
	}
	public void setDecDeviseAutreElem(String decDeviseAutreElem) {
		this.decDeviseAutreElem = decDeviseAutreElem;
	}
	public String getDecCodeSoumission() {
		return decCodeSoumission;
	}
	public void setDecCodeSoumission(String decCodeSoumission) {
		this.decCodeSoumission = decCodeSoumission;
	}
	public java.math.BigDecimal getDecValCaf() {
		return decValCaf;
	}
	public void setDecValCaf(java.math.BigDecimal decValCaf) {
		this.decValCaf = decValCaf;
	}
	public java.math.BigDecimal getDecValMercuriale() {
		return decValMercuriale;
	}
	public void setDecValMercuriale(java.math.BigDecimal decValMercuriale) {
		this.decValMercuriale = decValMercuriale;
	}
	public java.math.BigDecimal getDecValEnDouane() {
		return decValEnDouane;
	}
	public void setDecValEnDouane(java.math.BigDecimal decValEnDouane) {
		this.decValEnDouane = decValEnDouane;
	}
	public java.math.BigDecimal getDecValCfaFacture() {
		return decValCfaFacture;
	}
	public void setDecValCfaFacture(java.math.BigDecimal decValCfaFacture) {
		this.decValCfaFacture = decValCfaFacture;
	}
	public java.math.BigDecimal getDecMontCfaFob() {
		return decMontCfaFob;
	}
	public void setDecMontCfaFob(java.math.BigDecimal decMontCfaFob) {
		this.decMontCfaFob = decMontCfaFob;
	}
	public java.math.BigDecimal getDecMontCfaFret() {
		return decMontCfaFret;
	}
	public void setDecMontCfaFret(java.math.BigDecimal decMontCfaFret) {
		this.decMontCfaFret = decMontCfaFret;
	}
	public java.math.BigDecimal getDecAssurEnCfa() {
		return decAssurEnCfa;
	}
	public void setDecAssurEnCfa(java.math.BigDecimal decAssurEnCfa) {
		this.decAssurEnCfa = decAssurEnCfa;
	}
	public java.math.BigDecimal getDecMontCfaElem() {
		return decMontCfaElem;
	}
	public void setDecMontCfaElem(java.math.BigDecimal decMontCfaElem) {
		this.decMontCfaElem = decMontCfaElem;
	}
	public String getDecTypeMercuriale() {
		return decTypeMercuriale;
	}
	public void setDecTypeMercuriale(String decTypeMercuriale) {
		this.decTypeMercuriale = decTypeMercuriale;
	}
	public Integer getDecNbreColisDeclare() {
		return decNbreColisDeclare;
	}
	public void setDecNbreColisDeclare(Integer decNbreColisDeclare) {
		this.decNbreColisDeclare = decNbreColisDeclare;
	}
	public String getDecPrecueMoa() {
		return decPrecueMoa;
	}
	public void setDecPrecueMoa(String decPrecueMoa) {
		this.decPrecueMoa = decPrecueMoa;
	}
	public String getDecPrecSenegal() {
		return decPrecSenegal;
	}
	public void setDecPrecSenegal(String decPrecSenegal) {
		this.decPrecSenegal = decPrecSenegal;
	}
	public String getDecCodeProd() {
		return decCodeProd;
	}
	public void setDecCodeProd(String decCodeProd) {
		this.decCodeProd = decCodeProd;
	}
	public Integer getDecNbreChevaux() {
		return decNbreChevaux;
	}
	public void setDecNbreChevaux(Integer decNbreChevaux) {
		this.decNbreChevaux = decNbreChevaux;
	}
	public Timestamp getDecDateDdeRectif() {
		return decDateDdeRectif;
	}
	public void setDecDateDdeRectif(Timestamp decDateDdeRectif) {
		this.decDateDdeRectif = decDateDdeRectif;
	}
	public java.math.BigDecimal getDecMtLiquidee() {
		return decMtLiquidee;
	}
	public void setDecMtLiquidee(java.math.BigDecimal decMtLiquidee) {
		this.decMtLiquidee = decMtLiquidee;
	}
	public java.math.BigDecimal getDecQteRegEco() {
		return decQteRegEco;
	}
	public void setDecQteRegEco(java.math.BigDecimal decQteRegEco) {
		this.decQteRegEco = decQteRegEco;
	}
	public String getDecUniteComp() {
		return decUniteComp;
	}
	public void setDecUniteComp(String decUniteComp) {
		this.decUniteComp = decUniteComp;
	}
	public String getDecUniteMercuriale() {
		return decUniteMercuriale;
	}
	public void setDecUniteMercuriale(String decUniteMercuriale) {
		this.decUniteMercuriale = decUniteMercuriale;
	}
	public String getDecUniteRegEco() {
		return decUniteRegEco;
	}
	public void setDecUniteRegEco(String decUniteRegEco) {
		this.decUniteRegEco = decUniteRegEco;
	}
	public String getDecIndContener() {
		return decIndContener;
	}
	public void setDecIndContener(String decIndContener) {
		this.decIndContener = decIndContener;
	}
	public String getDecIndCalcul() {
		return decIndCalcul;
	}
	public void setDecIndCalcul(String decIndCalcul) {
		this.decIndCalcul = decIndCalcul;
	}
	public SegArtDec getSegArtDec() {
		return segArtDec;
	}
	public void setSegArtDec(SegArtDec segArtDec) {
		this.segArtDec = segArtDec;
	}
	
	public String getCodPpmDeclarant() {
		return codPpmDeclarant;
	}
	public void setCodPpmDeclarant(String codPpmDeclarant) {
		this.codPpmDeclarant = codPpmDeclarant;
	}
	public String getNumRepertoire() {
		return numRepertoire;
	}
	public void setNumRepertoire(String numRepertoire) {
		this.numRepertoire = numRepertoire;
	}
	
	
  

}