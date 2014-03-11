package sn.com.douane.ejb.declaration.model.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import sn.com.douane.ejb.declaration.model.keys.ExclusionProduitKey;
import sn.com.douane.ejb.rc.model.entities.Produit;


@Entity
@Table(name = "EXCLUSIONPRODUIT")
@IdClass(ExclusionProduitKey.class)
public class ExclusionProduit implements Serializable{
	
	private static final long serialVersionUID = -8984732116387370610L;

	
	@Id
	@Column(name = "CODEBUREAU",length = 3,nullable = false)
	private String codeBureau;	

	@Id
	@Column(name = "CODEPRODUIT",length = 6,nullable = false)
	private String codeProduit;
	
	@Id
	@Column(name = "PRECUEMOA",length = 2,nullable = false)
	private String precisionMoa;
	
	@Id
	@Column(name = "PRECSENEGAL",length = 2,nullable = false)
	private String precisionSen;
	
	@ManyToOne(targetEntity = Produit.class)
	@JoinColumns({
			@JoinColumn(name = "CODEPRODUIT", referencedColumnName = "RCCODEPROD", insertable = false, updatable = false, nullable = false),
			@JoinColumn(name = "PRECUEMOA", referencedColumnName = "RCPRECUEMOA", insertable = false, updatable = false, nullable = false),
			@JoinColumn(name = "PRECSENEGAL", referencedColumnName = "RCPRECSENEGAL", insertable = false, updatable = false, nullable = false) })
	private Produit produit;


	public ExclusionProduit(String codeBureau, String codeProduit,
			String precisionMoa, String precisionSen) {
		super();
		this.codeBureau = codeBureau;
		this.codeProduit = codeProduit;
		this.precisionMoa = precisionMoa;
		this.precisionSen = precisionSen;
	}

	public ExclusionProduit() {
		super();
	}

	public String getCodeBureau() {
		return codeBureau;
	}

	public void setCodeBureau(String codeBureau) {
		this.codeBureau = codeBureau;
	}

	public String getCodeProduit() {
		return codeProduit;
	}

	public void setCodeProduit(String codeProduit) {
		this.codeProduit = codeProduit;
	}

	public String getPrecisionMoa() {
		return precisionMoa;
	}

	public void setPrecisionMoa(String precisionMoa) {
		this.precisionMoa = precisionMoa;
	}

	public String getPrecisionSen() {
		return precisionSen;
	}

	public void setPrecisionSen(String precisionSen) {
		this.precisionSen = precisionSen;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((codeBureau == null) ? 0 : codeBureau.hashCode());
		result = prime * result
				+ ((codeProduit == null) ? 0 : codeProduit.hashCode());
		result = prime * result
				+ ((precisionMoa == null) ? 0 : precisionMoa.hashCode());
		result = prime * result
				+ ((precisionSen == null) ? 0 : precisionSen.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj){
			return true;
		}
		if (obj == null){
			return false;
		}
		if (getClass() != obj.getClass()){
			return false;
		}
		ExclusionProduit other = (ExclusionProduit) obj;
		if (codeBureau == null) {
			if (other.codeBureau != null){
				return false;
			}
		} else if (!codeBureau.equals(other.codeBureau)){
			return false;
		}
		if (codeProduit == null) {
			if (other.codeProduit != null){
				return false;
			}
		} else if (!codeProduit.equals(other.codeProduit)){
			return false;
		}
		if (precisionMoa == null) {
			if (other.precisionMoa != null){
				return false;
			}
		} else if (!precisionMoa.equals(other.precisionMoa)){
			return false;
		}
		if (precisionSen == null) {
			if (other.precisionSen != null){
				return false;
			}
		} else if (!precisionSen.equals(other.precisionSen)){
			return false;
		}
		return true;
	}

	public Produit getProduit() {
		return produit;
	}

	public void setProduit(Produit produit) {
		this.produit = produit;
	}
	
	
	
	
	
	
	
	
}
