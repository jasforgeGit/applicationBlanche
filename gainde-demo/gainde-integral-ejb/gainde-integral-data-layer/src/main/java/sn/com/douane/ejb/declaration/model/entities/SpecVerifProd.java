package sn.com.douane.ejb.declaration.model.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

import sn.com.douane.ejb.declaration.model.keys.SpecVerifProdKey;
import sn.com.douane.ejb.rc.model.entities.BureauDouane;
import sn.com.douane.ejb.rc.model.entities.Pays;
import sn.com.douane.ejb.rc.model.entities.Produit;



@Entity
@IdClass(SpecVerifProdKey.class)
@NamedQueries({
	@NamedQuery(name = "findCodeVerificateurProd", 
			query = "select object(o) from SpecVerifProd o where  o.decCodeBureau = ?1 and  o.decVerificateur = ?2 and  o.decCodeProd = ?3 and  o.decPrecSen = ?4 and  o.decPrecUemoa = ?5")})
@Table(name="SPECVERIFPROD")
public class SpecVerifProd implements Serializable {
	
	 /**
	 * 
	 */
	private static final long serialVersionUID = -6456766922539972646L;
	
	

	@Id
	@Column(name="DECCODEBUREAU",length=3, nullable=false)
	private java.lang.String decCodeBureau;
	

	@Id
	@Column(name="DECVERIFICATEUR",length=5, nullable=false)
	    private java.lang.String decVerificateur;
	

	@Id
	@Column(name="DECCODEPROD",length=6, nullable=false)
	    private java.lang.String decCodeProd;
	

	@Id
	@Column(name="DECPRECSEN",length=2, nullable=false)
	    private java.lang.String decPrecSen;
	

	@Id
	@Column(name="DECPRECUEMOA",length=2, nullable=false)
	    private java.lang.String decPrecUemoa;
	
	@Column(name="DECVALSPECIAL", nullable=false)
	    private java.lang.Integer decValSpecial;
	
	@ManyToOne(targetEntity = Produit.class)
	@JoinColumns({
			@JoinColumn(name = "DECCODEPROD", referencedColumnName = "RCCODEPROD", insertable = false, updatable = false,nullable = false),
			@JoinColumn(name = "DECPRECUEMOA", referencedColumnName = "RCPRECUEMOA", insertable = false, updatable = false,nullable = false),
			@JoinColumn(name = "DECPRECSEN", referencedColumnName = "RCPRECSENEGAL", insertable = false, updatable = false,nullable = false) })
	private Produit produit;
	
	@ManyToOne(targetEntity = BureauDouane.class)
	@JoinColumn(name = "DECCODEBUREAU", insertable = false, updatable = false,nullable = false)
	private BureauDouane bureauDouane;	

	public SpecVerifProd(String decCodeBureau, String decVerificateur,
			String decCodeProd, String decPrecSen, String decPrecUemoa,
			Integer decValSpecial) {
		super();
		this.decCodeBureau = decCodeBureau;
		this.decVerificateur = decVerificateur;
		this.decCodeProd = decCodeProd;
		this.decPrecSen = decPrecSen;
		this.decPrecUemoa = decPrecUemoa;
		this.decValSpecial = decValSpecial;
	}

	public SpecVerifProd() {
		super();
	}

	public java.lang.String getDecCodeBureau() {
		return decCodeBureau;
	}

	public void setDecCodeBureau(java.lang.String decCodeBureau) {
		this.decCodeBureau = decCodeBureau;
	}

	public java.lang.String getDecVerificateur() {
		return decVerificateur;
	}

	public void setDecVerificateur(java.lang.String decVerificateur) {
		this.decVerificateur = decVerificateur;
	}

	public java.lang.String getDecCodeProd() {
		return decCodeProd;
	}

	public void setDecCodeProd(java.lang.String decCodeProd) {
		this.decCodeProd = decCodeProd;
	}

	public java.lang.String getDecPrecSen() {
		return decPrecSen;
	}

	public void setDecPrecSen(java.lang.String decPrecSen) {
		this.decPrecSen = decPrecSen;
	}

	public java.lang.String getDecPrecUemoa() {
		return decPrecUemoa;
	}

	public void setDecPrecUemoa(java.lang.String decPrecUemoa) {
		this.decPrecUemoa = decPrecUemoa;
	}

	public java.lang.Integer getDecValSpecial() {
		return decValSpecial;
	}

	public void setDecValSpecial(java.lang.Integer decValSpecial) {
		this.decValSpecial = decValSpecial;
	}

	public Produit getProduit() {
		return produit;
	}

	public void setProduit(Produit produit) {
		this.produit = produit;
	}

	public BureauDouane getBureauDouane() {
		return bureauDouane;
	}

	public void setBureauDouane(BureauDouane bureauDouane) {
		this.bureauDouane = bureauDouane;
	}

	
}
