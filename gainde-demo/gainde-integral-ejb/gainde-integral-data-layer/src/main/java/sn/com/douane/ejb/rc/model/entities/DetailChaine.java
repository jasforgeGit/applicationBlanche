package sn.com.douane.ejb.rc.model.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;


	@Entity
	@Table(name = "DETAILCHAINE")
	public class DetailChaine implements Serializable {		
		  
		/**
		 * 
		 */
		private static final long serialVersionUID = 57582813642378626L;		
		
		
		@Id
		@Column(name = "RCCODEDETAILCHAINE",nullable = false)
	    private Integer rcCodeDetailChaine;

		@Column(name = "RCCODECHAINE",nullable = false)
	    private Integer rcCodeChaine;
	    
		@Column(name = "RCCODECRITERE",length = 128,nullable = false)
	    private String rcCodeCritere;
	    
		@Column(name = "RCCODEOPERATEUR",length = 20,nullable = false)
	    private String rcCodeOperateur;
		
		@Column(name = "RCVALEUR",nullable = false)
		private String rcValeur; 
		

		@ManyToOne(targetEntity = Chaine.class)
		@JoinColumn(name="rcCodeChaine",insertable=false, updatable=false)
		private Chaine chaine;		

		@ManyToOne(targetEntity = Critere.class)
		@JoinColumn(name="rcCodeCritere",insertable=false, updatable=false)
		private Critere critere;
		

		public DetailChaine() {
			 
		}
		    
		public DetailChaine(Integer rccodedetailchaine) {
			super(); 
			this.rcCodeDetailChaine=rccodedetailchaine;
		}
	   
	    
	    public DetailChaine(Integer rcCodeDetailChaine, Integer rcCodeChaine,
				String rcCodeCritere, String rcCodeOperateur, String rcValeur) {
			super();
			this.rcCodeDetailChaine = rcCodeDetailChaine;
			this.rcCodeChaine = rcCodeChaine;
			this.rcCodeCritere = rcCodeCritere;
			this.rcCodeOperateur = rcCodeOperateur;
			this.rcValeur = rcValeur;
		}

		public Integer getRcCodeDetailChaine() {
			return rcCodeDetailChaine;
		}

		public void setRcCodeDetailChaine(Integer rcCodeDetailChaine) {
			this.rcCodeDetailChaine = rcCodeDetailChaine;
		}

		public Integer getRcCodeChaine() {
			return rcCodeChaine;
		}

		public void setRcCodeChaine(Integer rcCodeChaine) {
			this.rcCodeChaine = rcCodeChaine;
		}

		public String getRcCodeCritere() {
			return rcCodeCritere;
		}

		public void setRcCodeCritere(String rcCodeCritere) {
			this.rcCodeCritere = rcCodeCritere;
		}

		public String getRcCodeOperateur() {
			return rcCodeOperateur;
		}

		public void setRcCodeOperateur(String rcCodeOperateur) {
			this.rcCodeOperateur = rcCodeOperateur;
		}

		public String getRcValeur() {
			return rcValeur;
		}

		public void setRcValeur(String rcValeur) {
			this.rcValeur = rcValeur;
		}
		
		public Chaine getChaine() {
			return chaine;
		}

		public void setChaine(Chaine chaine) {
			this.chaine = chaine;
		}
		
		public Critere getCritere() {
			return critere;
		}

		public void setCritere(Critere critere) {
			this.critere = critere;
		}

	}
