package sn.com.douane.ejb.rc.model.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import sn.com.douane.ejb.rc.model.keys.TaxesSuspendusKey;

@Entity
@IdClass(TaxesSuspendusKey.class)
@Table(name="TAXESSUSPENDUS")
public class TaxesSuspendus implements Serializable{

	private static final long serialVersionUID = -6254589044720546524L;

	@Id
	@Column(name="RCTYPEREGIME", length=1, nullable=false)
	private String rcTypeRegime;
	
	@Id
	@Column(name="RCCODEREGIMEDOUANIER", length=1, nullable=false)
	private String rcCodeRegimeDouanier; 
	
	@Id
	@Column(name="RCCODEREGIMEFISCAL", length=2, nullable=false)
	private String rcCodeRegimeFiscal;
	
	@Id
	@Column(name="RCCODETAXE", length=2, nullable=false)
	private String rcCodeTaxe; 
	
	@Id
	@Column(name="RCCODEINDICATEUR", length=15, nullable=false)
	private String rcCodeIndicateur; 
	
	@ManyToOne(targetEntity = Indicateur.class)
	@JoinColumn(name="RCCODEINDICATEUR", insertable=false, updatable=false)
	private Indicateur indTaxSusp;
	
	@ManyToOne(targetEntity = Taxe.class)
	@JoinColumn(name="RCCODETAXE", insertable=false, updatable=false)
	private Taxe taxTaxSusp;
	
	
	public TaxesSuspendus() {
	}

	public TaxesSuspendus(String rcTypeRegime, String rcCodeRegimeDouanier,
			String rcCodeRegimeFiscal, String rcCodeTaxe,
			String rcCodeIndicateur) {
		super();
		this.rcTypeRegime = rcTypeRegime;
		this.rcCodeRegimeDouanier = rcCodeRegimeDouanier;
		this.rcCodeRegimeFiscal = rcCodeRegimeFiscal;
		this.rcCodeTaxe = rcCodeTaxe;
		this.rcCodeIndicateur = rcCodeIndicateur;
	}

	public String getRcCodeRegimeDouanier() {
		return rcCodeRegimeDouanier;
	}

	public void setRcCodeRegimeDouanier(String rcCodeRegimeDouanier) {
		this.rcCodeRegimeDouanier = rcCodeRegimeDouanier;
	}

	public String getRcCodeRegimeFiscal() {
		return rcCodeRegimeFiscal;
	}

	public void setRcCodeRegimeFiscal(String rcCodeRegimeFiscal) {
		this.rcCodeRegimeFiscal = rcCodeRegimeFiscal;
	}

	public String getRcCodeTaxe() {
		return rcCodeTaxe;
	}

	public void setRcCodeTaxe(String rcCodeTaxe) {
		this.rcCodeTaxe = rcCodeTaxe;
	}

	public String getRcCodeIndicateur() {
		return rcCodeIndicateur;
	}

	public void setRcCodeIndicateur(String rcCodeIndicateur) {
		this.rcCodeIndicateur = rcCodeIndicateur;
	}

	public String getRcTypeRegime() {
		return rcTypeRegime;
	}

	public void setRcTypeRegime(String rcTypeRegime) {
		this.rcTypeRegime = rcTypeRegime;
	}

	public Indicateur getIndTaxSusp() {
		return indTaxSusp;
	}

	public void setIndTaxSusp(Indicateur indTaxSusp) {
		this.indTaxSusp = indTaxSusp;
	}

	public Taxe getTaxTaxSusp() {
		return taxTaxSusp;
	}

	public void setTaxTaxSusp(Taxe taxTaxSusp) {
		this.taxTaxSusp = taxTaxSusp;
	} 
}
