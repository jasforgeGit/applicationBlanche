package sn.com.douane.ejb.rc.model.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.IdClass;

import sn.com.douane.ejb.rc.model.keys.RegroupPaysKey;


	@Entity
	@Table(name = "REGROUPPAYS")
	@IdClass(RegroupPaysKey.class)
	public class RegroupPays implements Serializable {
		

		private static final long serialVersionUID = -1697081519448513443L;
		
		@Id
		@Column(name = "RCCODEREGROUP",length = 10,nullable = false)
		private String rcCodeRegroup;

		@Id
		@Column(name = "RCCODEPAYS",length = 3,nullable = false)
		private String rcCodePays;

		
		@ManyToOne(targetEntity = Pays.class)
	    @JoinColumn(name="rcCodePays",insertable=false, updatable=false)
	    private Pays pays;		


		@ManyToOne(targetEntity = Regroupement.class)
		@JoinColumn(name="rcCodeRegroup",insertable=false, updatable=false)
	    private Regroupement regroupement;	
		
		
		public RegroupPays(){
			
		}
		
		public RegroupPays(String rcCodePays,String rcCodeRegroup) {
			super();
			this.rcCodePays=rcCodePays;
			this.rcCodeRegroup=rcCodeRegroup;
			
		}

		public Regroupement getRegroupement() {
			return regroupement;
		}


		public void setRegroupement(Regroupement regroupement) {
			this.regroupement = regroupement;
		}


		public Pays getPays() {
			return pays;
		}


		public void setPays(Pays pays) {
			this.pays = pays;
		}
		
		public String getRcCodeRegroup() {
			return rcCodeRegroup;
		}

		public void setRcCodeRegroup(String rcCodeRegroup) {
			this.rcCodeRegroup = rcCodeRegroup;
		}

		public String getRcCodePays() {
			return rcCodePays;
		}

		public void setRcCodePays(String rcCodePays) {
			this.rcCodePays = rcCodePays;
		}
		
		
		
		

	}
