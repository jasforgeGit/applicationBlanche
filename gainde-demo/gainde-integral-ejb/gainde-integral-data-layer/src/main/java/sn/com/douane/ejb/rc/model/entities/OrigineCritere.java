package sn.com.douane.ejb.rc.model.entities;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.*;


	@Entity
	@Table(name = "ORIGINECRITERE")
	public class OrigineCritere implements Serializable{
		
	
		private static final long serialVersionUID = 8710383627187889021L;
		
		@Id
		@Column(name = "RCNOMTABLE",length = 128,nullable = false)
		private String rcNomTable;	    

		@Column(name = "RCLIBELLETABLE",length=255, nullable = false)
		private String rcLibelleTable;
	    
	    @OneToMany(mappedBy = "origineCritere", targetEntity = Critere.class)		   
	    private List<Critere> critere = new ArrayList<Critere>();

	    public OrigineCritere() {
	    
	    }
	    
		public OrigineCritere(String rcnomtable) {
			this.rcNomTable=rcnomtable;
		}

		public OrigineCritere(String rcnomtable, String rclibelletable) {
			this.rcNomTable= rcnomtable;
			this.rcLibelleTable= rclibelletable;
		}
		
		public String getRcNomTable() {
			return rcNomTable;
		}

		public void setRcNomTable(String rcNomTable) {
			this.rcNomTable = rcNomTable;
		}

		public String getRcLibelleTable() {
			return rcLibelleTable;
		}

		public void setRcLibelleTable(String rcLibelleTable) {
			this.rcLibelleTable = rcLibelleTable;
		}

		public List<Critere> getCritere() {
			return critere;
		}

		public void setCritere(ArrayList<Critere> critere) {
			this.critere = critere;
		}

	}
