package sn.com.douane.ejb.rc.model.entities;

import java.io.Serializable;
import java.math.BigDecimal;
import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import sn.com.douane.ejb.rc.model.keys.TaxesRegroupKey;
	
	@Entity
	@Table(name = "TAXESREGROUP")
	@IdClass(TaxesRegroupKey.class)
	public class TaxesRegroup implements Serializable{
	   
		private static final long serialVersionUID = -6210907610293233019L;
		
		@Id
		@Column(name = "RCCODETAXE",length = 2,nullable = false)
		private String rcCodeTaxe;

		@Id
		@Column(name = "RCCODEREGROUP",length = 10,nullable = false)
		private String rcCodeRegroup;
		
		@Id
		@Column(name = "RCDATEVALEUR",nullable = false)
		private java.sql.Date rcDateValeur;
		
		@Column(name = "RCDATECLOTURE")
	    private java.sql.Date rcDateCloture;
		
		@Column(name = "RCTAUX",nullable = false,columnDefinition="DECIMAL(5 , 0)")
	    private java.math.BigDecimal rcTaux;
	  
		public TaxesRegroup(){
			
		}
		
		public TaxesRegroup(String codeTaxe,String codeRegroup,java.sql.Date dateValeur) {
				this.rcCodeTaxe = codeTaxe;
				this.rcCodeRegroup = codeRegroup;
				this.rcDateValeur = dateValeur;
			
		}		
	
		public TaxesRegroup(String rcCodeTaxe, String rcCodeRegroup,
				Date rcDateValeur, BigDecimal rcTaux) {
			super();
			this.rcCodeTaxe = rcCodeTaxe;
			this.rcCodeRegroup = rcCodeRegroup;
			this.rcDateValeur = rcDateValeur;
			this.rcTaux = rcTaux;
		}


		@ManyToOne(targetEntity = Taxe.class)
		@JoinColumn(name="RCCODETAXE",insertable=false, updatable=false)		
	    private Taxe taxe;
		
		@ManyToOne(targetEntity = Regroupement.class)
	    @JoinColumn(name="RCCODEREGROUP",insertable=false, updatable=false)
	    private Regroupement regroupement;   
		
		
		public String getRcCodeTaxe() {
			return rcCodeTaxe;
		}

		public void setRcCodeTaxe(String rcCodeTaxe) {
			this.rcCodeTaxe = rcCodeTaxe;
		}

		public String getRcCodeRegroup() {
			return rcCodeRegroup;
		}

		public void setRcCodeRegroup(String rcCodeRegroup) {
			this.rcCodeRegroup = rcCodeRegroup;
		}

		public java.sql.Date getRcDateValeur() {
			return rcDateValeur;
		}

		public void setRcDateValeur(java.sql.Date rcDateValeur) {
			this.rcDateValeur = rcDateValeur;
		}

		public java.sql.Date getRcDateCloture() {
			return rcDateCloture;
		}

		public void setRcDateCloture(java.sql.Date rcDateCloture) {
			this.rcDateCloture = rcDateCloture;
		}

		public java.math.BigDecimal getRcTaux() {
			return rcTaux;
		}

		public void setRcTaux(java.math.BigDecimal rcTaux) {
			this.rcTaux = rcTaux;
		}
		
		public Taxe getTaxe() {
			return taxe;
		}

		public void setTaxe(Taxe taxe) {
			this.taxe = taxe;
		}
	
		
		public Regroupement getRegroupement() {
			return regroupement;
		}
		public void setRegroupement(Regroupement regroupement) {
			this.regroupement = regroupement;
		}



	}
