package sn.com.douane.ejb.rc.model.entities;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.ManyToOne;


	@Entity
	@Table(name = "CRITERE")
	public class Critere implements Serializable{
		
	
		private static final long serialVersionUID = -5051491565513624793L;
		
		@Id
		@Column(name = "RCCODECRITERE",length = 128,nullable = false)
		private String rcCodeCritere;

		@Column(name = "RCLIBELLECRITERE",length = 255,nullable = false)
	    private String rcLibelleCritere;
		
		@Column(name = "RCNOMTABLE",length = 255,nullable = false)
	    private String rcNomTable;
	    
		@ManyToOne(targetEntity = OrigineCritere.class)
		@JoinColumn(name="rcNomTable",insertable=false, updatable=false)
	    private OrigineCritere origineCritere;		

		@OneToMany(mappedBy = "critere", targetEntity = DetailChaine.class)
	    private List<DetailChaine> detailchaines = new ArrayList<DetailChaine>();

		
	    public List<DetailChaine> getDetailchaine() {
			return detailchaines;
		}

		public void setDetailchaine(List<DetailChaine> detailchaine) {
			this.detailchaines = detailchaine;
		}

		public Critere() {
	    
	    }
	    
		public Critere(String rccodecritere,String rclibellecritere, String rcNomTable) {
			super(); 
			this.rcCodeCritere = rccodecritere;
			this.rcLibelleCritere = rclibellecritere;	
			this.rcNomTable = rcNomTable; 
		}
		
		public String getRcCodeCritere() {
			return rcCodeCritere;
		}

		public void setRcCodeCritere(String rcCodeCritere) {
			this.rcCodeCritere = rcCodeCritere;
		}

		public String getRcLibelleCritere() {
			return rcLibelleCritere;
		}

		public void setRcLibelleCritere(String rcLibelleCritere) {
			this.rcLibelleCritere = rcLibelleCritere;
		}

		public String getRcNomTable() {
			return rcNomTable;
		}

		public void setRcNomTable(String rcNomTable) {
			this.rcNomTable = rcNomTable;
		}

		public OrigineCritere getOrigineCritere() {
			return origineCritere;
		}

		public void setOrigineCritere(OrigineCritere origineCritere) {
			this.origineCritere = origineCritere;
		}
	    
	}
