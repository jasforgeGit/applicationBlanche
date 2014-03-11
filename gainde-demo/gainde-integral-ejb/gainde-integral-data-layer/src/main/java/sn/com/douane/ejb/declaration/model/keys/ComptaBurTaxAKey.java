package sn.com.douane.ejb.declaration.model.keys;

import java.io.Serializable;

import javax.persistence.Column;

public class ComptaBurTaxAKey implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 9223303433846318671L;

	@Column(name="DECCODEBUREAU", length=3, nullable=false)
	private java.lang.String decCodeBureau;

	@Column(name="DECANNEEEMISSION", length=4, nullable=false)
	private java.lang.String decAnneeeMission;

	@Column(name="DECCODETAXE",length=2 ,nullable=false)
	private java.lang.String decCodeTaxe;

	public ComptaBurTaxAKey() {
		super();
		// TODO Auto-generated constructor stub
	}

	public ComptaBurTaxAKey(String decCodeBureau, String decAnneeeMission,
			String decCodeTaxe) {
		super();
		this.decCodeBureau = decCodeBureau;
		this.decAnneeeMission = decAnneeeMission;
		this.decCodeTaxe = decCodeTaxe;
	}

	public java.lang.String getDecCodeBureau() {
		return decCodeBureau;
	}

	public void setDecCodeBureau(java.lang.String decCodeBureau) {
		this.decCodeBureau = decCodeBureau;
	}

	public java.lang.String getDecAnneeeMission() {
		return decAnneeeMission;
	}

	public void setDecAnneeeMission(java.lang.String decAnneeeMission) {
		this.decAnneeeMission = decAnneeeMission;
	}

	public java.lang.String getDecCodeTaxe() {
		return decCodeTaxe;
	}

	public void setDecCodeTaxe(java.lang.String decCodeTaxe) {
		this.decCodeTaxe = decCodeTaxe;
	}

}
