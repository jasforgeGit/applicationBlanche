package sn.com.douane.ejb.rc.model.entities;

import java.io.Serializable;
import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import sn.com.douane.ejb.rc.model.keys.HreglementImportKey;


	@Entity
	@IdClass(HreglementImportKey.class)
	public class HreglementImport implements Serializable {
		

		private static final long serialVersionUID = 2431291181471903131L;
		
		
		@Id
		@Column(name = "RCCODEPROD",length = 6,nullable = false)
		private String rccodeprod;
		
		@Id
		@Column(name = "RCPRECUEMOA",length = 2,nullable = false)
	    private String rcprecuemoa;
		
		@Id
		@Column(name = "RCPRECSENEGAL",length = 2,nullable = false)
	    private String rcprecsenegal;
		
		@Id
		@Column(name = "RCCODEIMP",length = 1,nullable = false)
	    private String rccodeimp;
		
		@Id
		@Column(name = "RCCODEUSERMAJ",length = 8,nullable = false)
	    private String rccodeusermaj;
		
		@Id
		@Column(name = "RCTERMINALMAJ",length = 70,nullable = false)
	    private String rcterminalmaj;
		
		@Id
		@Column(name = "RCDATEMAJ",nullable = false)
	    private Date rcdatemaj;
		
		@Column(name = "RCCIRCUITVISITE",length = 1)
		private String rccircuitvisite;
		
		@Column(name = "RCCODEESCORT",length = 1)
	    private String rccodeescort;
		
		@Column(name = "RCCODEADMISDES",length = 1)
	    private String rccodeadmisdes;
		
		@Column(name = "RCCODEADMISDEP",length = 1)
	    private String rccodeadmisdep;
		
		@Column(name = "RCCODEPROHIBITION",length = 1)
	    private String rccodeprohibition;
		
		@Column(name = "RCAGREMENTPROD",length = 5)
	    private String rcagrementprod;
		
		@Column(name = "RCDATEAGREMENT")
	    private Date rcdateagrement;
		
		@Column(name = "RCCATEGPROD",length = 2)
	    private String rccategprod;
		
		@Column(name = "RCUNITEMERC",length = 2)
	    private String rcunitemerc;
		
		@Column(name = "RCVALEURMERC")
	    private Double rcvaleurmerc;
		
		@Column(name = "RCDATEMERC")
	    private Date rcdatemerc;
		
		@Column(name = "RCBAREMMIN")
	    private Double rcbaremmin;
		
		@Column(name = "RCBAREMEMED")
	    private Double rcbarememed;
		
		@Column(name = "RCVALEURMINPERC")
	    private Double rcvaleurminperc;
		
		@Column(name = "RCCODDECONTINGENT",length = 1)
	    private String rccoddecontingent;
		
		@Column(name = "RCMTCONTINGENT")
	    private Double rcmtcontingent;
		
		@Column(name = "RCRELCONTING",length = 1)
	    private Double rcrelconting;
		
		@Column(name = "RCDATECONTING")
	    private Date rcdateconting;
		
		@Column(name = "RCTYPEMERC",length = 1)
	    private String rctypemerc;
		
		@Column(name = "RCCODEANNEXE4",length = 1)
	    private String rccodeannexe4;
		
		@Column(name = "RCAUTCHANGE",columnDefinition="CHAR(1)")
	    private String rcautchange;
	    
	    @ManyToOne(targetEntity = CircuitVisite.class)
	    @JoinColumn(name="RCCIRCUITVISITE",insertable=false, updatable=false)		
		private CircuitVisite circuitVisite;	   

	    
	    public HreglementImport() {
	    	
	    }
 
 
	    public HreglementImport(String rccodeprod, String rcprecuemoa,String rcprecsenegal, String rccodeimp,
	    						String rccodeusermaj, String rcterminalmaj,Date rcdatemaj) {
			super();
			this.rccodeprod=rccodeprod;
			this.rcprecuemoa=rcprecuemoa;
			this.rcprecsenegal=rcprecsenegal;
			this.rccodeimp= rccodeimp;
			this.rccodeusermaj=rccodeusermaj;
			this.rcterminalmaj=rcterminalmaj;
			this.rcdatemaj=rcdatemaj;
	    	
		}	


		public String getRccodeprod() {
			return rccodeprod;
		}


		public void setRccodeprod(String rccodeprod) {
			this.rccodeprod = rccodeprod;
		}


		public String getRcprecuemoa() {
			return rcprecuemoa;
		}


		public void setRcprecuemoa(String rcprecuemoa) {
			this.rcprecuemoa = rcprecuemoa;
		}


		public String getRcprecsenegal() {
			return rcprecsenegal;
		}


		public void setRcprecsenegal(String rcprecsenegal) {
			this.rcprecsenegal = rcprecsenegal;
		}


		public String getRccodeimp() {
			return rccodeimp;
		}


		public void setRccodeimp(String rccodeimp) {
			this.rccodeimp = rccodeimp;
		}


		public String getRccodeusermaj() {
			return rccodeusermaj;
		}


		public void setRccodeusermaj(String rccodeusermaj) {
			this.rccodeusermaj = rccodeusermaj;
		}


		public String getRcterminalmaj() {
			return rcterminalmaj;
		}


		public void setRcterminalmaj(String rcterminalmaj) {
			this.rcterminalmaj = rcterminalmaj;
		}


		public Date getRcdatemaj() {
			return rcdatemaj;
		}


		public void setRcdatemaj(Date rcdatemaj) {
			this.rcdatemaj = rcdatemaj;
		}


		public String getRccodeescort() {
			return rccodeescort;
		}


		public void setRccodeescort(String rccodeescort) {
			this.rccodeescort = rccodeescort;
		}


		public String getRccodeadmisdes() {
			return rccodeadmisdes;
		}


		public void setRccodeadmisdes(String rccodeadmisdes) {
			this.rccodeadmisdes = rccodeadmisdes;
		}


		public String getRccodeadmisdep() {
			return rccodeadmisdep;
		}


		public void setRccodeadmisdep(String rccodeadmisdep) {
			this.rccodeadmisdep = rccodeadmisdep;
		}


		public String getRccodeprohibition() {
			return rccodeprohibition;
		}


		public void setRccodeprohibition(String rccodeprohibition) {
			this.rccodeprohibition = rccodeprohibition;
		}


		public String getRcagrementprod() {
			return rcagrementprod;
		}


		public void setRcagrementprod(String rcagrementprod) {
			this.rcagrementprod = rcagrementprod;
		}


		public Date getRcdateagrement() {
			return rcdateagrement;
		}


		public void setRcdateagrement(Date rcdateagrement) {
			this.rcdateagrement = rcdateagrement;
		}


		public String getRccategprod() {
			return rccategprod;
		}


		public void setRccategprod(String rccategprod) {
			this.rccategprod = rccategprod;
		}


		public String getRcunitemerc() {
			return rcunitemerc;
		}


		public void setRcunitemerc(String rcunitemerc) {
			this.rcunitemerc = rcunitemerc;
		}


		public Double getRcvaleurmerc() {
			return rcvaleurmerc;
		}


		public void setRcvaleurmerc(Double rcvaleurmerc) {
			this.rcvaleurmerc = rcvaleurmerc;
		}


		public Date getRcdatemerc() {
			return rcdatemerc;
		}


		public void setRcdatemerc(Date rcdatemerc) {
			this.rcdatemerc = rcdatemerc;
		}


		public Double getRcbaremmin() {
			return rcbaremmin;
		}


		public void setRcbaremmin(Double rcbaremmin) {
			this.rcbaremmin = rcbaremmin;
		}


		public Double getRcbarememed() {
			return rcbarememed;
		}


		public void setRcbarememed(Double rcbarememed) {
			this.rcbarememed = rcbarememed;
		}


		public Double getRcvaleurminperc() {
			return rcvaleurminperc;
		}


		public void setRcvaleurminperc(Double rcvaleurminperc) {
			this.rcvaleurminperc = rcvaleurminperc;
		}


		public String getRccoddecontingent() {
			return rccoddecontingent;
		}


		public void setRccoddecontingent(String rccoddecontingent) {
			this.rccoddecontingent = rccoddecontingent;
		}


		public Double getRcmtcontingent() {
			return rcmtcontingent;
		}


		public void setRcmtcontingent(Double rcmtcontingent) {
			this.rcmtcontingent = rcmtcontingent;
		}


		public Double getRcrelconting() {
			return rcrelconting;
		}


		public void setRcrelconting(Double rcrelconting) {
			this.rcrelconting = rcrelconting;
		}


		public Date getRcdateconting() {
			return rcdateconting;
		}


		public void setRcdateconting(Date rcdateconting) {
			this.rcdateconting = rcdateconting;
		}


		public String getRctypemerc() {
			return rctypemerc;
		}


		public void setRctypemerc(String rctypemerc) {
			this.rctypemerc = rctypemerc;
		}


		public String getRccodeannexe4() {
			return rccodeannexe4;
		}


		public void setRccodeannexe4(String rccodeannexe4) {
			this.rccodeannexe4 = rccodeannexe4;
		}


		public String getRcautchange() {
			return rcautchange;
		}


		public void setRcautchange(String rcautchange) {
			this.rcautchange = rcautchange;
		}


		public String getRccircuitvisite() {
			return rccircuitvisite;
		}


		public void setRccircuitvisite(String rccircuitvisite) {
			this.rccircuitvisite = rccircuitvisite;
		}


		public CircuitVisite getCircuitVisite() {
			return circuitVisite;
		}


		public void setCircuitVisite(CircuitVisite circuitVisite) {
			this.circuitVisite = circuitVisite;
		}

	
		
	   
	}
