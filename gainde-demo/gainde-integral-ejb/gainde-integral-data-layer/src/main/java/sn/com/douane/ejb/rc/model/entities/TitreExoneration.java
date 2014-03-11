package sn.com.douane.ejb.rc.model.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import sn.com.douane.ejb.rc.model.keys.TitreExonerationKey;

	@Entity
	@IdClass(TitreExonerationKey.class)
	@Table(name = "TITREEXONERATION")
	public class TitreExoneration implements Serializable {
		

	
		private static final long serialVersionUID = -8173884418315466609L;

		@Id
		@Column(name = "RCANNEETITREEXO",length = 4,nullable = false)
	    private String rcAnneeTitreExo;
		
		@Id
		@Column(name = "RCBURFRANCHISE",length = 2,nullable = false)
		private String rcBurFranchise;
		
		@Id
		@Column(name = "RCNUMTITREEXO",nullable = false)
	    private Integer rcNumTitreExo;
		
		@Column(name = "RCNBRECOLISINITIAL",nullable = false)
	    private Integer rcNbreColisInitial;
		
		@Column(name = "RCQTECOMPLINITIAL",columnDefinition="DECIMAL(9 , 0)",nullable = false)
	    private java.math.BigDecimal rcQteComplInitial;
		
		@Column(name = "RCPDSINITIAL",columnDefinition="DECIMAL(9 , 0)",nullable = false)
	    private java.math.BigDecimal rcPdsInitial;
		
		@Column(name = "RCVALEURINITIAL",columnDefinition="DECIMAL(9 , 0)",nullable = false)
	    private java.math.BigDecimal rcValeurInitial;
		
		@Column(name = "RCNBRECOLISRESIDUEL",nullable = false)
	    private Integer rcNbreColisResiduel;
		
		@Column(name = "RCQTECOMPLRESIDUEL",columnDefinition="DECIMAL(9 , 0)",nullable = false)
	    private java.math.BigDecimal rcQteComplResiduel;
		
		@Column(name = "RCPDSRESIDUEL",columnDefinition="DECIMAL(9 , 0)",nullable = false)
	    private java.math.BigDecimal rcPdsResiduel;
		
		@ManyToOne(targetEntity = BureauFranchise.class)
		@JoinColumn(name="RCBURFRANCHISE",referencedColumnName = "RCCODEBURFRANCHISE",insertable=false, updatable=false)	    
	    private BureauFranchise bureauFranchise;

	    public TitreExoneration() {
	    
	    }
	    
		public TitreExoneration(String rcAnneeTitreExo, Integer rcNumTitreExo,
	            				String rcBurFranchise) {
			super();
			this.rcAnneeTitreExo=rcAnneeTitreExo;
			this.rcNumTitreExo= rcNumTitreExo;
			this.rcBurFranchise= rcBurFranchise;
					
		}


		public TitreExoneration(
				String rcAnneeTitreExo, Integer rcNumTitreExo,
				String rcBurFranchise,
						            Integer rcNbreColisInitial,
						            java.math.BigDecimal rcQteComplInitial,
						            java.math.BigDecimal rcPdsInitial,
						            java.math.BigDecimal rcValeurInitial) {
			super()	;
			this.rcAnneeTitreExo=rcAnneeTitreExo;
			this.rcNumTitreExo= rcNumTitreExo;
			this.rcBurFranchise= rcBurFranchise;
			this.rcNbreColisInitial = rcNbreColisInitial;
			this.rcQteComplInitial= rcQteComplInitial;
			this.rcPdsInitial= rcPdsInitial;
			this.rcValeurInitial= rcValeurInitial;
		}

		public String getRcAnneeTitreExo() {
			return rcAnneeTitreExo;
		}

		public void setRcAnneeTitreExo(String rcAnneeTitreExo) {
			this.rcAnneeTitreExo = rcAnneeTitreExo;
		}

		public Integer getRcNumTitreExo() {
			return rcNumTitreExo;
		}

		public void setRcNumTitreExo(Integer rcNumTitreExo) {
			this.rcNumTitreExo = rcNumTitreExo;
		}

		public Integer getRcNbreColisInitial() {
			return rcNbreColisInitial;
		}

		public void setRcNbreColisInitial(Integer rcNbreColisInitial) {
			this.rcNbreColisInitial = rcNbreColisInitial;
		}

		public java.math.BigDecimal getRcQteComplInitial() {
			return rcQteComplInitial;
		}

		public void setRcQteComplInitial(java.math.BigDecimal rcQteComplInitial) {
			this.rcQteComplInitial = rcQteComplInitial;
		}

		public java.math.BigDecimal getRcPdsInitial() {
			return rcPdsInitial;
		}

		public void setRcPdsInitial(java.math.BigDecimal rcPdsInitial) {
			this.rcPdsInitial = rcPdsInitial;
		}

		public java.math.BigDecimal getRcValeurInitial() {
			return rcValeurInitial;
		}

		public void setRcValeurInitial(java.math.BigDecimal rcValeurInitial) {
			this.rcValeurInitial = rcValeurInitial;
		}

		public Integer getRcNbreColisResiduel() {
			return rcNbreColisResiduel;
		}

		public void setRcNbreColisResiduel(Integer rcNbreColisResiduel) {
			this.rcNbreColisResiduel = rcNbreColisResiduel;
		}

		public java.math.BigDecimal getRcQteComplResiduel() {
			return rcQteComplResiduel;
		}

		public void setRcQteComplResiduel(java.math.BigDecimal rcQteComplResiduel) {
			this.rcQteComplResiduel = rcQteComplResiduel;
		}

		public java.math.BigDecimal getRcPdsResiduel() {
			return rcPdsResiduel;
		}

		public void setRcPdsResiduel(java.math.BigDecimal rcPdsResiduel) {
			this.rcPdsResiduel = rcPdsResiduel;
		}

		public BureauFranchise getBureauFranchise() {
			return bureauFranchise;
		}

		public void setBureauFranchise(BureauFranchise bureauFranchise) {
			this.bureauFranchise = bureauFranchise;
		}

		public String getRcBurFranchise() {
			return rcBurFranchise;
		}

		public void setRcBurFranchise(String rcBurfranchise) {
			this.rcBurFranchise = rcBurfranchise;
		}

	 





	   
	}
