package sn.com.douane.ejb.rc.model.entities;

import java.io.Serializable;
import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.Table;

import sn.com.douane.ejb.rc.model.keys.ReglementImportKey;
/**
 * 
 * @author nesrine
 *
 */
@Entity
@IdClass(ReglementImportKey.class)
@Table(name="REGLEMENTIMPORT")
public class ReglementImport implements Serializable{

	private static final long serialVersionUID = -6022139830119914601L;
	
	@Id
	@Column(name="RCCODEPROD", length=6, nullable=false)
	private String rcCodeProd;
	
	@Id
	@Column(name="RCPRECUEMOA", length=2, nullable=false)
    private String rcPrecUemoa;
	
	@Id
	@Column(name="RCPRECSENEGAL", length=2, nullable=false)
    private String rcPrecSenegal;
	
	@Id
	@Column(name="RCCODEIMP", length=1, nullable=false)
    private String rcCodeImp;
	
	@Column(name="RCCIRCUITVISITE", length=1)
    private String rcCircuitVisite;
	
	@Column(name="RCCODEESCORT", length=1)
    private String rcCodeEscort;
	
	@Column(name="RCCODEADMISDES", length=1)
    private String rcCodeAdmisDes;
	
	@Column(name="RCCODEADMISDEP", length=1)
    private String rcCodeAdmisDep;
	
	@Column(name="RCCODEPROHIBITION", length=1)
    private String rcCodeProhibition;
	
	@Column(name="RCAGREMENTPROD", length=5)
    private String rcAgrementProd;
	
	@Column(name="RCDATEAGREMENT")
    private Date rcDateAgrement;
	
	@Column(name="RCCATEGPROD", length=2)
    private String rcCategProd;
	
	@Column(name="RCUNITEMERC", length=2)
    private String rcUniteMerc;
	
	@Column(name="RCVALEURMERC")
    private Double rcValeurMerc;
	
	@Column(name="RCDATEMERC")
    private Date rcDateMerc;
	
	@Column(name="RCBAREMMIN")
    private Double rcBaremMin;
	
	@Column(name="RCBAREMEMED")
    private Double rcBaremeMed;
	
	@Column(name="RCVALEURMINPERC")
    private Double rcValeurMinPerc;
	
	@Column(name="RCCODDECONTINGENT", length=1)
    private String rcCodDeContingent;
	
	@Column(name="RCMTCONTINGENT")
	private Double rcMtContingent;
	
	@Column(name="RCRELCONTING")
	private Double rcRelConting;
	
	@Column(name="RCDATECONTING")
	private Date rcDateConting;
	
	@Column(name="RCTYPEMERC", length=1)
	private String rcTypeMerc;
	
	@Column(name="RCCODEANNEXE4", length=1)
	private String rcCodeAnnexe4;
	
	@Column(name="RCAUTCHANGE", columnDefinition="CHAR(1)")
	private String rcAutChange;

	
	public ReglementImport() {

	}


	public ReglementImport(String rcCodeProd, String rcPrecUemoa,
			String rcPrecSenegal, String rcCodeImp) {
		super();
		this.rcCodeProd = rcCodeProd;
		this.rcPrecUemoa = rcPrecUemoa;
		this.rcPrecSenegal = rcPrecSenegal;
		this.rcCodeImp = rcCodeImp;
	}


	public String getRcCodeProd() {
		return rcCodeProd;
	}


	public void setRcCodeProd(String rcCodeProd) {
		this.rcCodeProd = rcCodeProd;
	}


	public String getRcPrecUemoa() {
		return rcPrecUemoa;
	}


	public void setRcPrecUemoa(String rcPrecUemoa) {
		this.rcPrecUemoa = rcPrecUemoa;
	}


	public String getRcPrecSenegal() {
		return rcPrecSenegal;
	}


	public void setRcPrecSenegal(String rcPrecSenegal) {
		this.rcPrecSenegal = rcPrecSenegal;
	}


	public String getRcCodeImp() {
		return rcCodeImp;
	}


	public void setRcCodeImp(String rcCodeImp) {
		this.rcCodeImp = rcCodeImp;
	}


	public String getRcCircuitVisite() {
		return rcCircuitVisite;
	}


	public void setRcCircuitVisite(String rcCircuitVisite) {
		this.rcCircuitVisite = rcCircuitVisite;
	}


	public String getRcCodeEscort() {
		return rcCodeEscort;
	}


	public void setRcCodeEscort(String rcCodeEscort) {
		this.rcCodeEscort = rcCodeEscort;
	}


	public String getRcCodeAdmisDes() {
		return rcCodeAdmisDes;
	}


	public void setRcCodeAdmisDes(String rcCodeAdmisDes) {
		this.rcCodeAdmisDes = rcCodeAdmisDes;
	}


	public String getRcCodeAdmisDep() {
		return rcCodeAdmisDep;
	}


	public void setRcCodeAdmisDep(String rcCodeAdmisDep) {
		this.rcCodeAdmisDep = rcCodeAdmisDep;
	}


	public String getRcCodeProhibition() {
		return rcCodeProhibition;
	}


	public void setRcCodeProhibition(String rcCodeProhibition) {
		this.rcCodeProhibition = rcCodeProhibition;
	}


	public String getRcAgrementProd() {
		return rcAgrementProd;
	}


	public void setRcAgrementProd(String rcAgrementProd) {
		this.rcAgrementProd = rcAgrementProd;
	}


	public Date getRcDateAgrement() {
		return rcDateAgrement;
	}


	public void setRcDateAgrement(Date rcDateAgrement) {
		this.rcDateAgrement = rcDateAgrement;
	}


	public String getRcCategProd() {
		return rcCategProd;
	}


	public void setRcCategProd(String rcCategProd) {
		this.rcCategProd = rcCategProd;
	}


	public String getRcUniteMerc() {
		return rcUniteMerc;
	}


	public void setRcUniteMerc(String rcUniteMerc) {
		this.rcUniteMerc = rcUniteMerc;
	}


	public Double getRcValeurMerc() {
		return rcValeurMerc;
	}


	public void setRcValeurMerc(Double rcValeurMerc) {
		this.rcValeurMerc = rcValeurMerc;
	}


	public Date getRcDateMerc() {
		return rcDateMerc;
	}


	public void setRcDateMerc(Date rcDateMerc) {
		this.rcDateMerc = rcDateMerc;
	}


	public Double getRcBaremMin() {
		return rcBaremMin;
	}


	public void setRcBaremMin(Double rcBaremMin) {
		this.rcBaremMin = rcBaremMin;
	}


	public Double getRcBaremeMed() {
		return rcBaremeMed;
	}


	public void setRcBaremeMed(Double rcBaremeMed) {
		this.rcBaremeMed = rcBaremeMed;
	}


	public Double getRcValeurMinPerc() {
		return rcValeurMinPerc;
	}


	public void setRcValeurMinPerc(Double rcValeurMinPerc) {
		this.rcValeurMinPerc = rcValeurMinPerc;
	}


	public String getRcCodDeContingent() {
		return rcCodDeContingent;
	}


	public void setRcCodDeContingent(String rcCodDeContingent) {
		this.rcCodDeContingent = rcCodDeContingent;
	}


	public Double getRcMtContingent() {
		return rcMtContingent;
	}


	public void setRcMtContingent(Double rcMtContingent) {
		this.rcMtContingent = rcMtContingent;
	}


	public Double getRcRelConting() {
		return rcRelConting;
	}


	public void setRcRelConting(Double rcRelConting) {
		this.rcRelConting = rcRelConting;
	}


	public Date getRcDateConting() {
		return rcDateConting;
	}


	public void setRcDateConting(Date rcDateConting) {
		this.rcDateConting = rcDateConting;
	}


	public String getRcTypeMerc() {
		return rcTypeMerc;
	}


	public void setRcTypeMerc(String rcTypeMerc) {
		this.rcTypeMerc = rcTypeMerc;
	}


	public String getRcCodeAnnexe4() {
		return rcCodeAnnexe4;
	}


	public void setRcCodeAnnexe4(String rcCodeAnnexe4) {
		this.rcCodeAnnexe4 = rcCodeAnnexe4;
	}


	public String getRcAutChange() {
		return rcAutChange;
	}


	public void setRcAutChange(String rcAutChange) {
		this.rcAutChange = rcAutChange;
	}

	
}
