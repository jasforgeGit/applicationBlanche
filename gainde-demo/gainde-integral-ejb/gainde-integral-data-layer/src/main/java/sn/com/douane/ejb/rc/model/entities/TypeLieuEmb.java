package sn.com.douane.ejb.rc.model.entities;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;


		@Entity
		@Table(name = "TYPELIEUEMB")
		public class TypeLieuEmb implements Serializable {
	
			
		private static final long serialVersionUID = -6665381791097874434L;

		@Id
		@Column(name = "CODETYPELIEUEMB",length = 1,nullable = false)
	    private String codetypelieuemb;
		
		@Column(name = "LIBELLETYPELIEUEMB",length = 100,nullable = false)
	    private String libelletypelieuemb;
		
		@OneToMany(mappedBy = "typeLieuEmb", targetEntity = LieuEmbarquement.class)	  
	    private List<LieuEmbarquement> lieuEmbarquement = new ArrayList<LieuEmbarquement>();		

	    public TypeLieuEmb() {
	    
	    }
	    
		public TypeLieuEmb(
	            String codetypelieuemb) {
			super(); 
			this.codetypelieuemb = codetypelieuemb;
		}


		public TypeLieuEmb(
	            String codetypelieuemb,
	            String libelletypelieuemb) {
			super(); 
			this.codetypelieuemb = codetypelieuemb;
			this.libelletypelieuemb = libelletypelieuemb;
		}

	
	    public String getCodetypelieuemb() {
	        return codetypelieuemb;
	    }

	  
		public void setCodetypelieuemb(String codetypelieuemb) {
	        this.codetypelieuemb = codetypelieuemb;
	    }

	   
	    public String getLibelletypelieuemb() {
	        return libelletypelieuemb;
	    }

		public void setLibelletypelieuemb(
				String libelletypelieuemb) {
	        this.libelletypelieuemb = libelletypelieuemb;
	    }

		public List<LieuEmbarquement> getLieuEmbarquement() {
			return lieuEmbarquement;
		}


		public void setLieuEmbarquement(List<LieuEmbarquement> lieuEmbarquement) {
			this.lieuEmbarquement = lieuEmbarquement;
		}


	    
	}
