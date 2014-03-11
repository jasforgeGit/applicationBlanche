package sn.com.douane.ejb.rc.model.entities;

import java.io.Serializable;
import java.sql.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import sn.com.douane.ejb.declaration.model.entities.Sommiers;
import sn.com.douane.ejb.rc.model.keys.RegimeEconomiqueKey;


	@Entity
	@Table(name = "REGIMEECONOMIQUE")
	@IdClass(RegimeEconomiqueKey.class)
	@NamedQueries(@NamedQuery(name = "findByAnneeNumero", query = "select object(o) from RegimeEconomique o where  o.rcanneeregeco = ?1 and  o.rcnumregeco = ?2"))
	public class RegimeEconomique implements Serializable {
	
		private static final long serialVersionUID = 8678008413677381283L;
		
		@Id
		@Column(name = "RCANNEEREGECO",length = 4,nullable = false)
		private String rcanneeregeco;
		
		@Id
		@Column(name = "RCNUMREGECO",length = 6,nullable = false)
	    private String rcnumregeco;
		
		@Column(name = "RCCODENATREGECO",length = 1,nullable = false)
		private String rccodenatregeco;		
		
		@Column(name = "RCDATEDECISIONREGECO",nullable = false)
	    private java.sql.Date rcdatedecisionregeco;
		
		@Column(name = "RCREFJURIDIQUEREGECO",length = 10)
	    private String rcrefjuridiqueregeco;
		
		@Column(name = "RCNBREPROROREGECO")
	    private Integer rcnbreprororegeco;
		
		@Column(name = "RCDATEVALIDITEREGECO")
	    private java.sql.Date rcdatevaliditeregeco;
		
		@Column(name = "RCDATEPROROREGECO")
	    private java.sql.Date rcdateprororegeco;		
		
		@Column(name = "RCDUREEREGECO")
	    private Integer rcdureeregeco;
		
		@Column(name = "RCDUREEPROROREGECO")
	    private Integer rcdureeprororegeco;
		
		@Column(name = "RCPPMBENEFICIAIRE", columnDefinition="CHAR(5)")
	    private String rcppmbeneficiaire;
		
		@Column(name = "RCMODEREGECO",length = 1)
	    private String rcmoderegeco;
		
		@Column(name = "RCDATESUSPENSIONREGECO")
	    private java.sql.Date rcdatesuspensionregeco;
		
		@Column(name = "RCETATREGECO",length = 1)
	    private String rcetatregeco;	    

		@ManyToOne(targetEntity = NatureRegEco.class)
		@JoinColumn(name="RCCODENATREGECO",insertable=false, updatable=false)
		private NatureRegEco natRegEco;
		
		@OneToMany(mappedBy = "regimeEconomique", targetEntity = Sommiers.class)
		private List<Sommiers> listRegimeEconomique;
		
	    
	    public RegimeEconomique(){	    	
	    	
	    }	    
	  
		public RegimeEconomique(String rcanneeregeco, String rcnumregeco,
				String rccodenatregeco, Date rcdatedecisionregeco) {
			super();
			this.rcanneeregeco = rcanneeregeco;
			this.rcnumregeco = rcnumregeco;
			this.rccodenatregeco = rccodenatregeco;
			this.rcdatedecisionregeco = rcdatedecisionregeco;
		}

		public RegimeEconomique(
	            String rcanneeregeco, String rcnumregeco) {
			super();
			this.rcanneeregeco=rcanneeregeco;
			this.rcnumregeco=rcnumregeco;
		}	
	
		public String getRcanneeregeco() {
			return rcanneeregeco;
		}

		public void setRcanneeregeco(String rcanneeregeco) {
			this.rcanneeregeco = rcanneeregeco;
		}

		public String getRcnumregeco() {
			return rcnumregeco;
		}

		public void setRcnumregeco(String rcnumregeco) {
			this.rcnumregeco = rcnumregeco;
		}

		public String getRccodenatregeco() {
			return rccodenatregeco;
		}

		public void setRccodenatregeco(String rcCodeNatRegEco) {
			this.rccodenatregeco = rcCodeNatRegEco;
		}

		public java.sql.Date getRcdatedecisionregeco() {
			return rcdatedecisionregeco;
		}

		public void setRcdatedecisionregeco(java.sql.Date rcdatedecisionregeco) {
			this.rcdatedecisionregeco = rcdatedecisionregeco;
		}

		public String getRcrefjuridiqueregeco() {
			return rcrefjuridiqueregeco;
		}

		public void setRcrefjuridiqueregeco(String rcrefjuridiqueregeco) {
			this.rcrefjuridiqueregeco = rcrefjuridiqueregeco;
		}

		public Integer getRcnbreprororegeco() {
			return rcnbreprororegeco;
		}

		public void setRcnbreprororegeco(Integer rcnbreprororegeco) {
			this.rcnbreprororegeco = rcnbreprororegeco;
		}

		public java.sql.Date getRcdatevaliditeregeco() {
			return rcdatevaliditeregeco;
		}

		public void setRcdatevaliditeregeco(java.sql.Date rcdatevaliditeregeco) {
			this.rcdatevaliditeregeco = rcdatevaliditeregeco;
		}

		public java.sql.Date getRcdateprororegeco() {
			return rcdateprororegeco;
		}

		public void setRcdateprororegeco(java.sql.Date rcdateprororegeco) {
			this.rcdateprororegeco = rcdateprororegeco;
		}

		public Integer getRcdureeregeco() {
			return rcdureeregeco;
		}

		public void setRcdureeregeco(Integer rcdureeregeco) {
			this.rcdureeregeco = rcdureeregeco;
		}

		public Integer getRcdureeprororegeco() {
			return rcdureeprororegeco;
		}

		public void setRcdureeprororegeco(Integer rcdureeprororegeco) {
			this.rcdureeprororegeco = rcdureeprororegeco;
		}

		public String getRcppmbeneficiaire() {
			return rcppmbeneficiaire;
		}

		public void setRcppmbeneficiaire(String rcppmbeneficiaire) {
			this.rcppmbeneficiaire = rcppmbeneficiaire;
		}

		public String getRcmoderegeco() {
			return rcmoderegeco;
		}

		public void setRcmoderegeco(String rcmoderegeco) {
			this.rcmoderegeco = rcmoderegeco;
		}

		public java.sql.Date getRcdatesuspensionregeco() {
			return rcdatesuspensionregeco;
		}

		public void setRcdatesuspensionregeco(java.sql.Date rcdatesuspensionregeco) {
			this.rcdatesuspensionregeco = rcdatesuspensionregeco;
		}

		public String getRcetatregeco() {
			return rcetatregeco;
		}

		public void setRcetatregeco(String rcetatregeco) {
			this.rcetatregeco = rcetatregeco;
		}

		public NatureRegEco getNatRegEco() {
			return natRegEco;
		}

		public void setNatRegEco(NatureRegEco natRegEco) {
			this.natRegEco = natRegEco;
		}

		public List<Sommiers> getListRegimeEconomique() {
			return listRegimeEconomique;
		}

		public void setListRegimeEconomique(List<Sommiers> listRegimeEconomique) {
			this.listRegimeEconomique = listRegimeEconomique;
		}


	}
