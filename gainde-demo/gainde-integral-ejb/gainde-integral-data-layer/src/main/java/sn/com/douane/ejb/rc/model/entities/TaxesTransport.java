package sn.com.douane.ejb.rc.model.entities;

import java.io.Serializable;
import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import sn.com.douane.ejb.rc.model.keys.TaxesTransportKey;


	@Entity
	@IdClass(TaxesTransportKey.class)
	@Table(name = "TAXESTRANSPORT")
	public class TaxesTransport  implements Serializable{
		
		/**
		 * serialVersionUID
		 */
		private static final long serialVersionUID = 1L;

		@Id
		@Column(name = "RCCODETRANSPORT",length = 2,nullable = false)
		private String rcCodeTransport;
		
		@Id
		@Column(name = "RCCODETAXE",length = 2,nullable = false)
		private String rcCodeTaxe;		
		
		@Id
		@Column(name = "RCDATEVALEUR",nullable = false)
	    private Date rcDateValeur;
		
		@Column(name = "RCDATECLOTURE")
	    private Date rcDateCloture;
	    
	    @Column(name = "RCCODETAUX",length = 3,nullable = false)
	    private String rcCodeTaux;
	    
	    @ManyToOne(targetEntity = Taxe.class)
	    @JoinColumn(name="RCCODETAXE",insertable=false, updatable=false)	
	    private Taxe taxe;
	    
	    @ManyToOne(targetEntity = ModeTransport.class)
	    @JoinColumn(name="RCCODETRANSPORT",insertable=false, updatable=false)	    
	    private ModeTransport modeTransport;	  

	    public TaxesTransport() {
	    
	    }
	    
		public TaxesTransport(Date rcDateValeur,String rcCodeTaxe,String rcCodeTransport,String rcCodeTaux) {
			super();
			this.rcDateValeur=rcDateValeur;
			this.rcCodeTransport=rcCodeTransport;
			this.rcCodeTaxe=rcCodeTaxe;
			this.rcCodeTaux=rcCodeTaux;
			
		}		
	   

		public String getRcCodeTransport() {
			return rcCodeTransport;
		}

		public void setRcCodeTransport(String rcCodeTransport) {
			this.rcCodeTransport = rcCodeTransport;
		}

		public String getRcCodeTaxe() {
			return rcCodeTaxe;
		}

		public void setRcCodeTaxe(String rcCodeTaxe) {
			this.rcCodeTaxe = rcCodeTaxe;
		}

		public Date getRcDateValeur() {
			return rcDateValeur;
		}

		public void setRcDateValeur(Date rcDateValeur) {
			this.rcDateValeur = rcDateValeur;
		}

		public Date getRcDateCloture() {
			return rcDateCloture;
		}

		public void setRcDateCloture(Date rcDateCloture) {
			this.rcDateCloture = rcDateCloture;
		}

		public String getRcCodeTaux() {
			return rcCodeTaux;
		}

		public void setRcCodeTaux(String rcCodeTaux) {
			this.rcCodeTaux = rcCodeTaux;
		}

		public Taxe getTaxe() {
			return taxe;
		}

		public void setTaxe(Taxe taxe) {
			this.taxe = taxe;
		}

		public ModeTransport getModeTransport() {
			return modeTransport;
		}

		public void setModeTransport(ModeTransport modeTransport) {
			this.modeTransport = modeTransport;
		}

	

	}
