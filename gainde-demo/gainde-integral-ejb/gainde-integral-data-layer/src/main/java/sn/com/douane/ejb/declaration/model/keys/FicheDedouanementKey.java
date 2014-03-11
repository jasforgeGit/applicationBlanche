package sn.com.douane.ejb.declaration.model.keys;

import java.io.Serializable;

import javax.persistence.Column;

public class FicheDedouanementKey implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 3803780052164215964L;

	
	@Column(name="ECORANNEE", length=4, nullable=false)
	 private java.lang.String ecorAnnee;
	
	
	@Column(name="ECORCODEBUREAU", length=3, nullable=false)
	    private java.lang.String ecorCodeBureau;
	
	
	@Column(name="ECORNUMERO", nullable=false)
	    private java.lang.Integer ecorNumero;


	public FicheDedouanementKey(String ecorAnnee, String ecorCodeBureau,
			Integer ecorNumero) {
		super();
		this.ecorAnnee = ecorAnnee;
		this.ecorCodeBureau = ecorCodeBureau;
		this.ecorNumero = ecorNumero;
	}


	public FicheDedouanementKey() {
		super();
	}


	public java.lang.String getEcorAnnee() {
		return ecorAnnee;
	}


	public void setEcorAnnee(java.lang.String ecorAnnee) {
		this.ecorAnnee = ecorAnnee;
	}


	public java.lang.String getEcorCodeBureau() {
		return ecorCodeBureau;
	}


	public void setEcorCodeBureau(java.lang.String ecorCodeBureau) {
		this.ecorCodeBureau = ecorCodeBureau;
	}


	public java.lang.Integer getEcorNumero() {
		return ecorNumero;
	}


	public void setEcorNumero(java.lang.Integer ecorNumero) {
		this.ecorNumero = ecorNumero;
	}
	
	
	
}
