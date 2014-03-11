package sn.com.douane.ejb.rc.model.entities;

import java.io.Serializable;
import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.Table;

import sn.com.douane.ejb.rc.model.keys.HReglementExportKey;
/**
 * 
 * @author nesrine
 *
 */
@Entity
@IdClass(HReglementExportKey.class)
@Table(name="HREGLEMENTEXPORT")
public class HReglementExport implements Serializable{

	private static final long serialVersionUID = 1960903825297524223L;
	
	@Id
	@Column(name="RCCODEPROD" , length=6, nullable=false)
	private String rcCodeProd;
	
	@Id
	@Column(name="RCPRECUEMOA", length=2, nullable=false)
    private String rcPrecUemoa; 
    
    @Id
    @Column(name="RCPRECSENEGAL", length=2, nullable=false)
    private String rcPrecSenegal; 
    
    @Id
    @Column(name="RCCODEEXP", length=1, nullable=false)
    private String rcCodeExp;
    
    @Id
    @Column(name="RCCODEUSERMAJ", length=8, nullable=false)
    private String rcCodeUserMaj;
    
    @Id
    @Column(name="RCTERMINALMAJ", length=70, nullable=false)
    private String rcTerminalMaj;
    
    @Id
    @Column(name="RCDATEMAJ", nullable=false)
    private Date rcDateMaj; 
    
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
    
    @Column(name="RCTYPEMERC", length=1)
    private String rcTypeMerc; 
    
    @Column(name="RCAUTCHANGE", length=1)
    private String rcAutChange; 
    
    @Column(name="RCSUBVENTIONEXPORT", length=1)
    private String rcSubventionExport;

    
	public HReglementExport() {
	}


	public HReglementExport(String rcCodeProd, String rcPrecUemoa,
			String rcPrecSenegal, String rcCodeExp, String rcCodeUserMaj,
			String rcTerminalMaj, Date rcDateMaj) {
		super();
		this.rcCodeProd = rcCodeProd;
		this.rcPrecUemoa = rcPrecUemoa;
		this.rcPrecSenegal = rcPrecSenegal;
		this.rcCodeExp = rcCodeExp;
		this.rcCodeUserMaj = rcCodeUserMaj;
		this.rcTerminalMaj = rcTerminalMaj;
		this.rcDateMaj = rcDateMaj;
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


	public String getRcCodeExp() {
		return rcCodeExp;
	}


	public void setRcCodeExp(String rcCodeExp) {
		this.rcCodeExp = rcCodeExp;
	}


	public String getRcCodeUserMaj() {
		return rcCodeUserMaj;
	}


	public void setRcCodeUserMaj(String rcCodeUserMaj) {
		this.rcCodeUserMaj = rcCodeUserMaj;
	}


	public String getRcTerminalMaj() {
		return rcTerminalMaj;
	}


	public void setRcTerminalMaj(String rcTerminalMaj) {
		this.rcTerminalMaj = rcTerminalMaj;
	}


	public Date getRcDateMaj() {
		return rcDateMaj;
	}


	public void setRcDateMaj(Date rcDateMaj) {
		this.rcDateMaj = rcDateMaj;
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


	public String getRcTypeMerc() {
		return rcTypeMerc;
	}


	public void setRcTypeMerc(String rcTypeMerc) {
		this.rcTypeMerc = rcTypeMerc;
	}


	public String getRcAutChange() {
		return rcAutChange;
	}


	public void setRcAutChange(String rcAutChange) {
		this.rcAutChange = rcAutChange;
	}


	public String getRcSubventionExport() {
		return rcSubventionExport;
	}


	public void setRcSubventionExport(String rcSubventionExport) {
		this.rcSubventionExport = rcSubventionExport;
	}  

    
    
}
