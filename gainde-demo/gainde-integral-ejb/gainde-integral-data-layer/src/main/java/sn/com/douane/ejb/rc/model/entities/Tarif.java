package sn.com.douane.ejb.rc.model.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumns;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.IdClass;
import javax.persistence.Transient;

import sn.com.douane.ejb.rc.model.keys.TarifsKey;

@Entity
@IdClass(TarifsKey.class)
@Table(name = "TARIFS")
public class Tarif implements Serializable {

	private static final long serialVersionUID = -904873575906220316L;

	@Id
	@Column(name = "RCCODEPROD", length = 6, nullable = false)
	private String rcCodeProd;
	@Id
	@Column(name = "RCPRECUEMOA", length = 2, nullable = false)
	private String rcPrecueMoa;
	@Id
	@Column(name = "RCPRECSENEGAL", length = 2, nullable = false)
	private String rcPrecSenegal;
	@Id
	@Column(name = "RCCODETAXE", length = 2, nullable = false)
	private String rcCodeTaxe;
	@Id
	@Column(name = "RCCODETAUX", length = 3, nullable = false)
	private String rcCodeTaux;
	@Id
	@Column(name = "RCDATEVALEUR", nullable = false)
	private java.sql.Date rcDateValeur;
	@Column(name = "RCDATECLOTURE")
	private java.sql.Date rcDateCloture;
	@Id
	@Column(name = "RCCODECIMEX", columnDefinition="CHAR(1)", nullable = false)
	private String rcCodeCimex;

	@ManyToOne(targetEntity = Produit.class)
	@JoinColumns({
			@JoinColumn(name = "RCCODEPROD", referencedColumnName = "rcCodeProd", insertable = false, updatable = false, nullable = false),
			@JoinColumn(name = "RCPRECUEMOA", referencedColumnName = "rcPrecueMoa", insertable = false, updatable = false, nullable = false),
			@JoinColumn(name = "RCPRECSENEGAL", referencedColumnName = "rcPrecSenegal", insertable = false, updatable = false, nullable = false) })
	private Produit produit;

	@ManyToOne(targetEntity = Taxe.class)
	@JoinColumn(name = "RCCODETAXE", insertable = false, updatable = false)
	private Taxe taxe;
	
	@Transient
	private String dateValeurTaux;
	
	@Transient
	private String libelleTaux;
	
	@Transient
	private java.math.BigDecimal rcValeurTaux;

	public Tarif() {

	}

	public Tarif(String rcCodeProd, String rcPrecueMoa, String rcPrecSenegal,
			String rcCodeTaxe, String rcCodeTaux, java.sql.Date rcDateValeur,
			String rcCodeCimex) {
		super();
		this.rcCodeProd=rcCodeProd;
		this.rcPrecueMoa=rcPrecueMoa;
		this.rcPrecSenegal=rcPrecSenegal;
		this.rcCodeTaxe=rcCodeTaxe;
		this.rcCodeTaux=rcCodeTaux;
		this.rcDateValeur= rcDateValeur;
		this.rcCodeCimex=rcCodeCimex;
		
	}

	public String getRcCodeProd() {
		return rcCodeProd;
	}

	public void setRcCodeProd(String rcCodeProd) {
		this.rcCodeProd = rcCodeProd;
	}

	public String getRcPrecueMoa() {
		return rcPrecueMoa;
	}

	public void setRcPrecueMoa(String rcPrecueMoa) {
		this.rcPrecueMoa = rcPrecueMoa;
	}

	public String getRcPrecSenegal() {
		return rcPrecSenegal;
	}

	public void setRcPrecSenegal(String rcPrecSenegal) {
		this.rcPrecSenegal = rcPrecSenegal;
	}

	public String getRcCodeTaxe() {
		return rcCodeTaxe;
	}

	public void setRcCodeTaxe(String rcCodeTaxe) {
		this.rcCodeTaxe = rcCodeTaxe;
	}

	public String getRcCodeTaux() {
		return rcCodeTaux;
	}

	public void setRcCodeTaux(String rcCodeTaux) {
		this.rcCodeTaux = rcCodeTaux;
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

	public String getRcCodeCimex() {
		return rcCodeCimex;
	}

	public void setRcCodeCimex(String rcCodeCimex) {
		this.rcCodeCimex = rcCodeCimex;
	}

	public Produit getProduit() {
		return produit;
	}

	public void setProduit(Produit produit) {
		this.produit = produit;
	}

	public Taxe getTaxe() {
		return taxe;
	}

	public void setTaxe(Taxe taxe) {
		this.taxe = taxe;
	}

	public String getDateValeurTaux() {
		return dateValeurTaux;
	}

	public void setDateValeurTaux(String dateValeurTaux) {
		this.dateValeurTaux = dateValeurTaux;
	}

	public String getLibelleTaux() {
		return libelleTaux;
	}

	public void setLibelleTaux(String libelleTaux) {
		this.libelleTaux = libelleTaux;
	}

	public java.math.BigDecimal getRcValeurTaux() {
		return rcValeurTaux;
	}

	public void setRcValeurTaux(java.math.BigDecimal rcValeurTaux) {
		this.rcValeurTaux = rcValeurTaux;
	}

}