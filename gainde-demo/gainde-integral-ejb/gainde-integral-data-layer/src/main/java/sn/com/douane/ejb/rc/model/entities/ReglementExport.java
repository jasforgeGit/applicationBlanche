package sn.com.douane.ejb.rc.model.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.Table;

import sn.com.douane.ejb.rc.model.keys.ReglementExportKey;



	@Entity
	@Table(name = "REGLEMENTEXPORT")
	@IdClass(ReglementExportKey.class)
	public class ReglementExport implements Serializable {
		

		private static final long serialVersionUID = -1062482003510164846L;
		
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
		@Column(name = "RCCODEEXP",length = 1,nullable = false)
	    private String rccodeexp;
		
		@Column(name = "RCCODEPROHIBITION",length = 1)
	    private String rccodeprohibition;
		
		@Column(name = "RCUNITEMERC",length = 2)
	    private String rcunitemerc;
		
		@Column(name = "RCVALEURMERC")
	    private Double rcvaleurmerc;
		
		@Column(name = "RCDATEMERC")
	    private java.sql.Date rcdatemerc;
		
		@Column(name = "RCBAREMMIN")
	    private Double rcbaremmin;
		
		@Column(name = "RCBAREMEMED")
	    private Double rcbarememed;
		
		@Column(name = "RCVALEURMINPERC")
	    private Double rcvaleurminperc;
		
		@Column(name = "RCTYPEMERC",length = 1)
	    private String rctypemerc;
		
		@Column(name = "RCAUTCHANGE", columnDefinition="CHAR(1)")
	    private String rcautchange;
		
		@Column(name = "RCSUBVENTIONEXPORT",length = 1)
	    private String rcsubventionexport;


	    public ReglementExport() {
	    
	    }
	    
		public ReglementExport(
	            String rccodeprod, String rcprecuemoa,
	            String rcprecsenegal, String rccodeexp) {
			super(); 
			this.rccodeprod = rccodeprod;
			this.rcprecuemoa = rcprecuemoa;
			this.rcprecsenegal = rcprecsenegal;
			this.rccodeexp = rccodeexp;
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

		public String getRccodeexp() {
			return rccodeexp;
		}

		public void setRccodeexp(String rccodeexp) {
			this.rccodeexp = rccodeexp;
		}

		public String getRccodeprohibition() {
			return rccodeprohibition;
		}

		public void setRccodeprohibition(String rccodeprohibition) {
			this.rccodeprohibition = rccodeprohibition;
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

		public java.sql.Date getRcdatemerc() {
			return rcdatemerc;
		}

		public void setRcdatemerc(java.sql.Date rcdatemerc) {
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

		public String getRctypemerc() {
			return rctypemerc;
		}

		public void setRctypemerc(String rctypemerc) {
			this.rctypemerc = rctypemerc;
		}

		public String getRcautchange() {
			return rcautchange;
		}

		public void setRcautchange(String rcautchange) {
			this.rcautchange = rcautchange;
		}

		public String getRcsubventionexport() {
			return rcsubventionexport;
		}

		public void setRcsubventionexport(String rcsubventionexport) {
			this.rcsubventionexport = rcsubventionexport;
		}


		
		
	   
	}
