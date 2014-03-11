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

import sn.com.douane.ejb.rc.model.keys.SoumissionProduitKey;

@Entity
@IdClass(SoumissionProduitKey.class)
@Table(name="SOUMISSIONPRODUIT")
public class SoumissionProduit implements Serializable{

	private static final long serialVersionUID = -6082667579502079253L;

	@Id
	@Column(name="RCCODEPROD", length=6, nullable=false)
	private String rcCodeProd;
    
	@Id
	@Column(name="RCPRECUEMOA", length=2, nullable=false)
    private String rcPrecUemoa;
    
	@Id
	@Column(name="RCPRECSENEGAL", length=2, nullable=false)
    private String rcPrecSenegal;
	
	@Id
	@Column(name="RCCODEINDICATEUR", length=15, nullable=false)
	private String rcCodeIndicateur; 
    
	@Id
	@Column(name="RCDATEVALIDITE", nullable=false)
	private Date rcDateValidite;
	
	@Column(name="RCDATECLOTURE")
    private Date rcDateCloture;   
    
	@ManyToOne(targetEntity = Indicateur.class)
	@JoinColumn(name="RCCODEINDICATEUR", updatable=false, insertable=false)
    private Indicateur indicateurProd;
    
	@ManyToOne(targetEntity = Produit.class)
	@JoinColumns({
		@JoinColumn(name="RCCODEPROD", referencedColumnName="rccodeprod",  updatable=false, insertable=false), 
		@JoinColumn(name="RCPRECUEMOA", referencedColumnName="rcprecuemoa", updatable=false, insertable=false),
		@JoinColumn(name="RCPRECSENEGAL", referencedColumnName="rcprecsenegal", updatable=false, insertable=false)})
    private Produit prodIndProd;

	public SoumissionProduit() {
		
	}
	
	public SoumissionProduit(String rcCodeProd, String rcPrecUemoa,
			String rcPrecSenegal, String rcCodeIndicateur, Date rcDateValidite) {
		super();
		this.rcCodeProd = rcCodeProd;
		this.rcPrecUemoa = rcPrecUemoa;
		this.rcPrecSenegal = rcPrecSenegal;
		this.rcCodeIndicateur = rcCodeIndicateur;
		this.rcDateValidite = rcDateValidite;
	}

	public String getRcCodeProd() {
		return rcCodeProd;
	}

	public void setRcCodeProd(String rcCodeProd) {
		this.rcCodeProd = rcCodeProd;
	}

	public String getRcPrecUemoa() {
		return rcPrecUemoa;
	}

	public void setRcPrecUemoa(String rcPrecUemoa) {
		this.rcPrecUemoa = rcPrecUemoa;
	}

	public String getRcPrecSenegal() {
		return rcPrecSenegal;
	}

	public void setRcPrecSenegal(String rcPrecSenegal) {
		this.rcPrecSenegal = rcPrecSenegal;
	}

	public String getRcCodeIndicateur() {
		return rcCodeIndicateur;
	}

	public void setRcCodeIndicateur(String rcCodeIndicateur) {
		this.rcCodeIndicateur = rcCodeIndicateur;
	}

	public Date getRcDateValidite() {
		return rcDateValidite;
	}

	public void setRcDateValidite(Date rcDateValidite) {
		this.rcDateValidite = rcDateValidite;
	}

	public Date getRcDateCloture() {
		return rcDateCloture;
	}

	public void setRcDateCloture(Date rcDateCloture) {
		this.rcDateCloture = rcDateCloture;
	}

	public Indicateur getIndicateurProd() {
		return indicateurProd;
	}

	public void setIndicateurProd(Indicateur indicateurProd) {
		this.indicateurProd = indicateurProd;
	}

	public Produit getProdIndProd() {
		return prodIndProd;
	}

	public void setProdIndProd(Produit prodIndProd) {
		this.prodIndProd = prodIndProd;
	}

 
}
