package sn.com.douane.ejb.declaration.model.keys;

import java.io.Serializable;
import java.sql.Date;

import javax.persistence.Column;

public class EncoursDevisKey implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 4987318127983034071L;

	@Column(name="DECCODEDECLARANT", length=5, nullable=false)
	private java.lang.String decCodeDeclarant;
	
	@Column(name="DECNUMREPERTOIRE", length=6, nullable=false)
	private java.lang.String decNumRepertoire;
	
	@Column(name="DECDATEDEMANDE")
	private java.sql.Date decDateDemande;

	public EncoursDevisKey() {
		super();
		// TODO Auto-generated constructor stub
	}

	public EncoursDevisKey(String decCodeDeclarant, String decNumRepertoire,
			Date decDateDemande) {
		super();
		this.decCodeDeclarant = decCodeDeclarant;
		this.decNumRepertoire = decNumRepertoire;
		this.decDateDemande = decDateDemande;
	}

	public java.lang.String getDecCodeDeclarant() {
		return decCodeDeclarant;
	}

	public void setDecCodeDeclarant(java.lang.String decCodeDeclarant) {
		this.decCodeDeclarant = decCodeDeclarant;
	}

	public java.lang.String getDecNumRepertoire() {
		return decNumRepertoire;
	}

	public void setDecNumRepertoire(java.lang.String decNumRepertoire) {
		this.decNumRepertoire = decNumRepertoire;
	}

	public java.sql.Date getDecDateDemande() {
		return decDateDemande;
	}

	public void setDecDateDemande(java.sql.Date decDateDemande) {
		this.decDateDemande = decDateDemande;
	}

}
