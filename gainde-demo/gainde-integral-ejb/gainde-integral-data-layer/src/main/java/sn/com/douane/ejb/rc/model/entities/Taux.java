package sn.com.douane.ejb.rc.model.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import sn.com.douane.ejb.rc.model.keys.TauxKey;

@Entity
@Table(name = "TAUX")
@IdClass(TauxKey.class)
public class Taux implements Serializable{

	private static final long serialVersionUID = 879739075185538452L;

	@Id
	@Column(name = "RCCODETAUX", length = 3, nullable = false)
	private String rcCodeTaux;

	@Id
	@Column(name = "RCCODETAXE", length = 2, nullable = false)
	private String rcCodeTaxe;

	@Id
	@Column(name = "RCDATEVALEUR", nullable = false)
	private java.sql.Date rcDateValeur;

	@Column(name = "LIBELLETAUX")
	private String libelleTaux;

	@Column(name = "RCDATECLOTURE")
	private java.sql.Date rcDateCloture;

	@Column(name = "RCVALEURTAUX", columnDefinition="DECIMAL(9 , 2)", nullable = false)
	private java.math.BigDecimal rcValeurTaux;

	@ManyToOne(targetEntity = Taxe.class)
	@JoinColumn(name = "rcCodeTaxe", insertable = false, updatable = false)
	private Taxe taxe;

	public Taux() {

	}

	public Taux(String rcCodeTaux, java.sql.Date rcDateValeur, String rcCodeTaxe) {
		
		super();
		
		this.rcCodeTaux = rcCodeTaux;
		this.rcDateValeur=rcDateValeur;
		this.rcCodeTaxe=rcCodeTaxe ;
	}

	public Taux(String rcCodeTaux, java.sql.Date rcDateValeur,
			String rcCodeTaxe, java.math.BigDecimal rcValeurTaux) {
         
		super();
		
		this.rcCodeTaux = rcCodeTaux;
		this.rcDateValeur=rcDateValeur;
		this.rcCodeTaxe=rcCodeTaxe ;
		this.rcValeurTaux= rcValeurTaux;
	}

	public String getRcCodeTaux() {
		return rcCodeTaux;
	}

	public void setRcCodeTaux(String rcCodeTaux) {
		this.rcCodeTaux = rcCodeTaux;
	}

	public String getRcCodeTaxe() {
		return rcCodeTaxe;
	}

	public void setRcCodeTaxe(String rcCodeTaxe) {
		this.rcCodeTaxe = rcCodeTaxe;
	}

	public java.sql.Date getRcDateValeur() {
		return rcDateValeur;
	}

	public void setRcDateValeur(java.sql.Date rcDateValeur) {
		this.rcDateValeur = rcDateValeur;
	}

	public String getLibelleTaux() {
		return libelleTaux;
	}

	public void setLibelleTaux(String libelleTaux) {
		this.libelleTaux = libelleTaux;
	}

	public java.sql.Date getRcDateCloture() {
		return rcDateCloture;
	}

	public void setRcDateCloture(java.sql.Date rcDateCloture) {
		this.rcDateCloture = rcDateCloture;
	}

	public java.math.BigDecimal getRcValeurTaux() {
		return rcValeurTaux;
	}

	public void setRcValeurTaux(java.math.BigDecimal rcValeurTaux) {
		this.rcValeurTaux = rcValeurTaux;
	}

	public Taxe getTaxe() {
		return taxe;
	}

	public void setTaxe(Taxe taxe) {
		this.taxe = taxe;
	}

}
