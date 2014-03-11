package sn.com.douane.ejb.declaration.model.keys;

import java.io.Serializable;
import java.sql.Date;

import javax.persistence.Column;

public class ComptaBurTaxJKey implements Serializable {

	private static final long serialVersionUID = -6231158812872692017L;
	

	
	@Column(name="DECCODEBUREAU",length=3, nullable=false)
	 private java.lang.String decCodeBureau;
	
	
	@Column(name="DECDATEEMISSION", nullable=false)
	    private java.sql.Date decDateEmission;
	
	
	@Column(name="DECCODETAXE",length=2, nullable=false)
	    private java.lang.String decCodeTaxe;


	public ComptaBurTaxJKey() {
		super();
	}


	public ComptaBurTaxJKey(String decCodeBureau, Date decDateEmission,
			String decCodeTaxe) {
		super();
		this.decCodeBureau = decCodeBureau;
		this.decDateEmission = decDateEmission;
		this.decCodeTaxe = decCodeTaxe;
	}


	public java.lang.String getDecCodeBureau() {
		return decCodeBureau;
	}


	public void setDecCodeBureau(java.lang.String decCodeBureau) {
		this.decCodeBureau = decCodeBureau;
	}


	public java.sql.Date getDecDateEmission() {
		return decDateEmission;
	}


	public void setDecDateEmission(java.sql.Date decDateEmission) {
		this.decDateEmission = decDateEmission;
	}


	public java.lang.String getDecCodeTaxe() {
		return decCodeTaxe;
	}


	public void setDecCodeTaxe(java.lang.String decCodeTaxe) {
		this.decCodeTaxe = decCodeTaxe;
	}

	
	
}
