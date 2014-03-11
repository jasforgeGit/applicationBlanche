package sn.com.douane.ejb.declaration.model.keys;

import java.io.Serializable;

import javax.persistence.Column;



public class ComptaBurTaxmKey implements Serializable{

	private static final long serialVersionUID = -2874130778683222153L;

	@Column(name="DECCODEBUREAU", length=3, nullable=false)
	private java.lang.String decCodeBureau;

	@Column(name="DECMOISEMISSION", length=2, nullable=false)
	private java.lang.String decMoisEmission;

	@Column(name="DECANNEEEMISSION", length=4, nullable=false)
	private java.lang.String decAnneeEmission;

	@Column(name="DECCODETAXE", length=2 ,nullable=false)
	private java.lang.String  decCodeTaxe;

	
	
	public ComptaBurTaxmKey(String decCodeBureau, String decMoisEmission,
			String decAnneeEmission, String decCodeTaxe) {
		super();
		this.decCodeBureau = decCodeBureau;
		this.decMoisEmission = decMoisEmission;
		this.decAnneeEmission = decAnneeEmission;
		this.decCodeTaxe = decCodeTaxe;
	}

	public ComptaBurTaxmKey() {
		super();
		// TODO Auto-generated constructor stub
	}

	public java.lang.String getDecCodeBureau() {
		return decCodeBureau;
	}

	public void setDecCodeBureau(java.lang.String decCodeBureau) {
		this.decCodeBureau = decCodeBureau;
	}

	public java.lang.String getDecMoisEmission() {
		return decMoisEmission;
	}

	public void setDecMoisEmission(java.lang.String decMoisEmission) {
		this.decMoisEmission = decMoisEmission;
	}

	public java.lang.String getDecAnneeEmission() {
		return decAnneeEmission;
	}

	public void setDecAnneeEmission(java.lang.String decAnneeEmission) {
		this.decAnneeEmission = decAnneeEmission;
	}

	public String getDecCodeTaxe() {
		return decCodeTaxe;
	}

	public void setDecCodeTaxe(java.lang.String decCodeTaxe) {
		this.decCodeTaxe = decCodeTaxe;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime
				* result
				+ ((decAnneeEmission == null) ? 0 : decAnneeEmission.hashCode());
		result = prime * result
				+ ((decCodeBureau == null) ? 0 : decCodeBureau.hashCode());
		result = prime * result
				+ ((decCodeTaxe == null) ? 0 : decCodeTaxe.hashCode());
		result = prime * result
				+ ((decMoisEmission == null) ? 0 : decMoisEmission.hashCode());
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
		ComptaBurTaxmKey other = (ComptaBurTaxmKey) obj;
		if (decAnneeEmission == null) {
			if (other.decAnneeEmission != null){
				return false;
			}
		} else if (!decAnneeEmission.equals(other.decAnneeEmission)){
			return false;
		}
		if (decCodeBureau == null) {
			if (other.decCodeBureau != null){
				return false;
			}
		} else if (!decCodeBureau.equals(other.decCodeBureau)){
			return false;
		}
		if (decCodeTaxe == null) {
			if (other.decCodeTaxe != null){
				return false;
			}
		} else if (!decCodeTaxe.equals(other.decCodeTaxe)){
			return false;
		}
		if (decMoisEmission == null) {
			if (other.decMoisEmission != null){
				return false;
			}
		} else if (!decMoisEmission.equals(other.decMoisEmission)){
			return false;
		}
		return true;
	}

	
	

	
}
