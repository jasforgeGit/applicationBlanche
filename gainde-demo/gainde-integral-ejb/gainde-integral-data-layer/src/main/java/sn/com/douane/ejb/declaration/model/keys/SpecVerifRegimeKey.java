package sn.com.douane.ejb.declaration.model.keys;

import java.io.Serializable;

import javax.persistence.Column;

public class SpecVerifRegimeKey implements Serializable {

	
	private static final long serialVersionUID = 1708758941344980718L;

	

	
	@Column(name="DECCODEBUREAU", length=3, nullable=false)
	private java.lang.String decCodeBureau;
	
	@Column(name="DECVERIFICATEUR", length=5, nullable=false)
	private java.lang.String decVerificateur;
		
	@Column(name="DECTYPEREGIME", length=1, nullable=false)
	private java.lang.String decTypeRegime;

	@Column(name="DECREGDOUANIER", length=1, nullable=false)
	private java.lang.String decRegDouanier;
	
	@Column(name="DECREGIMEFISCAL", length=2, nullable=false)
	private java.lang.String decRegimeFiscal;


	public SpecVerifRegimeKey() {
		super();
	}


	public SpecVerifRegimeKey(String decCodeBureau, String decVerificateur,
			String decTypeRegime, String decRegDouanier, String decRegimeFiscal) {
		super();
		this.decCodeBureau = decCodeBureau;
		this.decVerificateur = decVerificateur;
		this.decTypeRegime = decTypeRegime;
		this.decRegDouanier = decRegDouanier;
		this.decRegimeFiscal = decRegimeFiscal;
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


	public java.lang.String getDecTypeRegime() {
		return decTypeRegime;
	}


	public void setDecTypeRegime(java.lang.String decTypeRegime) {
		this.decTypeRegime = decTypeRegime;
	}


	public java.lang.String getDecRegDouanier() {
		return decRegDouanier;
	}


	public void setDecRegDouanier(java.lang.String decRegDouanier) {
		this.decRegDouanier = decRegDouanier;
	}


	public java.lang.String getDecRegimeFiscal() {
		return decRegimeFiscal;
	}


	public void setDecRegimeFiscal(java.lang.String decRegimeFiscal) {
		this.decRegimeFiscal = decRegimeFiscal;
	}

	
	
}
