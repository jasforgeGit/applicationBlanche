package sn.com.douane.ejb.rc.model.entities;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import sn.com.douane.ejb.manifeste.model.entities.ApurementManifeste;
import sn.com.douane.ejb.manifeste.model.entities.ArticleManifeste;


	@Entity
	@Table(name = "LIEUEMBARQUEMENT")
	public class LieuEmbarquement implements Serializable {		
		
		/**
		 * 
		 */
		private static final long serialVersionUID = 6827594184637250665L;

		@Id
		@Column(name = "RCCODELIEUEMB",length = 5,nullable = false)
	    private String rccodelieuemb;
		
		@Column(name = "RCLIBELLELIEUEMB",length = 100)
	    private String rclibellelieuemb;
		
		@Column(name = "RCCODEPAYS",length = 3,nullable = false)
	    private String rccodepays;
		
		@Column(name = "RCTYPELIEUEMB",length = 1,nullable = false)
	    private String rctypelieuemb;

		@ManyToOne(targetEntity = Pays.class)
	    @JoinColumn(name="RCCODEPAYS",insertable=false, updatable=false)
	    private Pays pays;	
		
		@ManyToOne(targetEntity = TypeLieuEmb.class)
	    @JoinColumn(name="RCTYPELIEUEMB",insertable=false, updatable=false)
	    private TypeLieuEmb typeLieuEmb;
		
		
		@OneToMany(mappedBy = "lieuEmbarquement", targetEntity = ArticleManifeste.class) 
		private List<ArticleManifeste> listeArticleManifeste = new ArrayList<ArticleManifeste>();
	    

		public String getRccodepays() {
			return rccodepays;
		}


		public void setRccodepays(String rccodepays) {
			this.rccodepays = rccodepays;
		}


		public String getRctypelieuemb() {
			return rctypelieuemb;
		}


		public void setRctypelieuemb(String rctypelieuemb) {
			this.rctypelieuemb = rctypelieuemb;
		}		
	   
		public LieuEmbarquement(){
			
		}
		public LieuEmbarquement(
	            String rccodelieuemb) {
			super();
			this.rccodelieuemb=rccodelieuemb;
		}
		
	
	    public String getRccodelieuemb() {
	        return rccodelieuemb;
	    }


		public void setRccodelieuemb(String rccodelieuemb) {
	        this.rccodelieuemb = rccodelieuemb;
	    }

	
	    public String getRclibellelieuemb() {
	        return rclibellelieuemb;
	    }

	
		public void setRclibellelieuemb(
				String rclibellelieuemb) {
	        this.rclibellelieuemb = rclibellelieuemb;
	    }
		
		public Pays getPays() {
			return pays;
		}


		public void setPays(Pays pays) {
			this.pays = pays;
		}
		
		public TypeLieuEmb getTypeLieuEmb() {
			return typeLieuEmb;
		}


		public void setTypeLieuEmb(TypeLieuEmb typeLieuEmb) {
			this.typeLieuEmb = typeLieuEmb;
		}


		public List<ArticleManifeste> getListeArticleManifeste() {
			return listeArticleManifeste;
		}


		public void setListeArticleManifeste(
				List<ArticleManifeste> listeArticleManifeste) {
			this.listeArticleManifeste = listeArticleManifeste;
		}

	   
	}
