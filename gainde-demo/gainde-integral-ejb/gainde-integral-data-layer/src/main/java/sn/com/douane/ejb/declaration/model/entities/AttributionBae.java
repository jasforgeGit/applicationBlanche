package sn.com.douane.ejb.declaration.model.entities;

import java.io.Serializable;
import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.Table;

import sn.com.douane.ejb.declaration.model.keys.AttributionBaeKey;

@Entity
@IdClass(AttributionBaeKey.class)
@Table(name = "ATTRIBUTIONBAE")
public class AttributionBae implements Serializable {

	private static final long serialVersionUID = -8480691569782346287L;

	
	@Id
	@Column(name = "DECANNEEDECL", length = 4,nullable = false)
	private String decAnneeDecl;
	
	@Id
	@Column(name = "DECBURDECL", length = 3,nullable = false)
	private String decBurDecl;
	
	@Id
	@Column(name = "DECNUMDECL",nullable = false)
	private Integer decNumDecl;
	
	@Column(name = "DECDATEBAE",nullable = false)
	private java.sql.Timestamp decDateBae;
	
	@Column(name = "DECCODEATTRIBUTION",length = 1)
	private String decCodeAttribution;
	
	@Column(name = "DECCODESECRETBAE",length = 50)
	private String decCodeSecretBae;
	
	@Column(name = "DECDATECREATIONBAE",nullable = false)
	private java.sql.Timestamp decDateCreationBae;
	
	@Column(name = "DECDATEMAJ")
	private java.sql.Timestamp decDateMaj;

	public AttributionBae(String decAnneeDecl, String decBurDecl,
			Integer decNumDecl, Timestamp decDateBae,
			Timestamp decDateCreationBae) {
		super();
		this.decAnneeDecl = decAnneeDecl;
		this.decBurDecl = decBurDecl;
		this.decNumDecl = decNumDecl;
		this.decDateBae = decDateBae;
		this.decDateCreationBae = decDateCreationBae;
	}

	public AttributionBae() {
		super();
	}

	public String getDecAnneeDecl() {
		return decAnneeDecl;
	}

	public void setDecAnneeDecl(String decAnneeDecl) {
		this.decAnneeDecl = decAnneeDecl;
	}

	public String getDecBurDecl() {
		return decBurDecl;
	}

	public void setDecBurDecl(String decBurDecl) {
		this.decBurDecl = decBurDecl;
	}

	public Integer getDecNumDecl() {
		return decNumDecl;
	}

	public void setDecNumDecl(Integer decNumDecl) {
		this.decNumDecl = decNumDecl;
	}

	public java.sql.Timestamp getDecDateBae() {
		return decDateBae;
	}

	public void setDecDateBae(java.sql.Timestamp decDateBae) {
		this.decDateBae = decDateBae;
	}

	public String getDecCodeAttribution() {
		return decCodeAttribution;
	}

	public void setDecCodeAttribution(String decCodeAttribution) {
		this.decCodeAttribution = decCodeAttribution;
	}

	public String getDecCodeSecretBae() {
		return decCodeSecretBae;
	}

	public void setDecCodeSecretBae(String decCodeSecretBae) {
		this.decCodeSecretBae = decCodeSecretBae;
	}

	public java.sql.Timestamp getDecDateCreationBae() {
		return decDateCreationBae;
	}

	public void setDecDateCreationBae(java.sql.Timestamp decDateCreationBae) {
		this.decDateCreationBae = decDateCreationBae;
	}

	public java.sql.Timestamp getDecDateMaj() {
		return decDateMaj;
	}

	public void setDecDateMaj(java.sql.Timestamp decDateMaj) {
		this.decDateMaj = decDateMaj;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((decAnneeDecl == null) ? 0 : decAnneeDecl.hashCode());
		result = prime * result
				+ ((decBurDecl == null) ? 0 : decBurDecl.hashCode());
		result = prime
				* result
				+ ((decCodeAttribution == null) ? 0 : decCodeAttribution
						.hashCode());
		result = prime
				* result
				+ ((decCodeSecretBae == null) ? 0 : decCodeSecretBae.hashCode());
		result = prime * result
				+ ((decDateBae == null) ? 0 : decDateBae.hashCode());
		result = prime
				* result
				+ ((decDateCreationBae == null) ? 0 : decDateCreationBae
						.hashCode());
		result = prime * result
				+ ((decDateMaj == null) ? 0 : decDateMaj.hashCode());
		result = prime * result
				+ ((decNumDecl == null) ? 0 : decNumDecl.hashCode());
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
		AttributionBae other = (AttributionBae) obj;
		if (decAnneeDecl == null) {
			if (other.decAnneeDecl != null){
				return false;
			}
		} else if (!decAnneeDecl.equals(other.decAnneeDecl)){
			return false;
		}
		if (decBurDecl == null) {
			if (other.decBurDecl != null){
				return false;
			}
		} else if (!decBurDecl.equals(other.decBurDecl)){
			return false;
		}
		if (decCodeAttribution == null) {
			if (other.decCodeAttribution != null){
				return false;
			}
		} else if (!decCodeAttribution.equals(other.decCodeAttribution)){
			return false;
		}
		if (decCodeSecretBae == null) {
			if (other.decCodeSecretBae != null){
				return false;
			}
		} else if (!decCodeSecretBae.equals(other.decCodeSecretBae)){
			return false;
		}
		if (decDateBae == null) {
			if (other.decDateBae != null){
				return false;
			}
		} else if (!decDateBae.equals(other.decDateBae)){
			return false;
		}
		if (decDateCreationBae == null) {
			if (other.decDateCreationBae != null){
				return false;
			}
		} else if (!decDateCreationBae.equals(other.decDateCreationBae)){
			return false;
		}
		if (decDateMaj == null) {
			if (other.decDateMaj != null){
				return false;
			}
		} else if (!decDateMaj.equals(other.decDateMaj)){
			return false;
		}
		if (decNumDecl == null) {
			if (other.decNumDecl != null){
				return false;
			}
		} else if (!decNumDecl.equals(other.decNumDecl)){
			return false;
		}
		return true;
	}
	
	
	

}
