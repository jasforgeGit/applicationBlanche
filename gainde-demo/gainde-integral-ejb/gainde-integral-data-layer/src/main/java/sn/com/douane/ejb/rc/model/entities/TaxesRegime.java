package sn.com.douane.ejb.rc.model.entities;

import java.io.Serializable;
import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import sn.com.douane.ejb.rc.model.keys.TaxesRegimeKey;

@Entity
@IdClass(TaxesRegimeKey.class)
@Table(name="TAXESREGIME")
public class TaxesRegime implements Serializable{
	
	private static final long serialVersionUID = 8148871760012253862L;

	@Id
	@Column(name="RCTYPEREGIMEDOUANIER", length=1, nullable=false)
	private String rcTypeRegime;
	
	@Id
	@Column(name="RCREGIMEDOUANIER" , length=1, nullable=false)
	private String rcCodeRegimeDouanier;
	
	@Id
	@Column(name="RCREGIMEFISCAL" , length=2, nullable=false)
	private String rcRegimeFiscal; 
	
	@Id
	@Column(name="RCCODETAXE", length=2, nullable=false)
	private String rcCodeTaxes; 
	
	@Id
	@Column(name="RCDATEVALEUR", nullable=false)
	private Date rcDateValeur;
	    
	@Column(name="RCDATECLOTURE")
	private Date rcDateCloture;

	@Column(name="RCCODETAUX", length=3, nullable=false)
	private String rcCodeTaux;

	@ManyToOne(targetEntity = Taxe.class)
	@JoinColumn(name="RCCODETAXE", insertable=false, updatable=false)
	private Taxe taxRegTaxes;
	    
	@ManyToOne(targetEntity = Regime.class)
	@JoinColumns({
    	@JoinColumn(name="RCTYPEREGIMEDOUANIER", referencedColumnName="rcTypeRegime", updatable=false, insertable=false),
    	@JoinColumn(name="RCREGIMEDOUANIER",referencedColumnName="rcCodeRegimeDouanier", updatable=false, insertable=false), 
    	@JoinColumn(name="RCREGIMEFISCAL", referencedColumnName="rcCodeRegimeFiscal", updatable=false, insertable=false)})
	private Regime regTaxReg;

	public TaxesRegime() {
		
	}
	
	public TaxesRegime(String rcTypeRegime, String rcCodeRegimeDouanier,
			String rcRegimeFiscal, String rcCodeTaxes, Date rcDateValeur, String rcCodeTaux) {
		super();
		this.rcTypeRegime = rcTypeRegime;
		this.rcCodeRegimeDouanier = rcCodeRegimeDouanier;
		this.rcRegimeFiscal = rcRegimeFiscal;
		this.rcCodeTaxes = rcCodeTaxes;
		this.rcDateValeur = rcDateValeur;
		this.rcCodeTaux = rcCodeTaux; 
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

	public String getRcCodeRegimeDouanier() {
		return rcCodeRegimeDouanier;
	}

	public void setRcCodeRegimeDouanier(String rcCodeRegimeDouanier) {
		this.rcCodeRegimeDouanier = rcCodeRegimeDouanier;
	}

	public String getRcTypeRegime() {
		return rcTypeRegime;
	}

	public void setRcTypeRegime(String rcTypeRegime) {
		this.rcTypeRegime = rcTypeRegime;
	}

	public Taxe getTaxRegTaxes() {
		return taxRegTaxes;
	}

	public void setTaxRegTaxes(Taxe taxRegTaxes) {
		this.taxRegTaxes = taxRegTaxes;
	}

	public Regime getRegTaxReg() {
		return regTaxReg;
	}

	public void setRegTaxReg(Regime regTaxReg) {
		this.regTaxReg = regTaxReg;
	}

	public String getRcRegimeFiscal() {
		return rcRegimeFiscal;
	}

	public void setRcRegimeFiscal(String rcRegimeFiscal) {
		this.rcRegimeFiscal = rcRegimeFiscal;
	}

	public String getRcCodeTaxes() {
		return rcCodeTaxes;
	}

	public void setRcCodeTaxes(String rcCodeTaxes) {
		this.rcCodeTaxes = rcCodeTaxes;
	}


}
