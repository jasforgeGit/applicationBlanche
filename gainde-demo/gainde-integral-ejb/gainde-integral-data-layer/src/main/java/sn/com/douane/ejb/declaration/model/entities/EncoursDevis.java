package sn.com.douane.ejb.declaration.model.entities;

import java.io.Serializable;
import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.Table;

import sn.com.douane.ejb.declaration.model.keys.EncoursDevisKey;

@Entity
@IdClass(EncoursDevisKey.class)
@Table(name="ENCOURSDEVIS")

public class EncoursDevis implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 7756477185127159903L;
	
	@Id
	@Column(name="DECCODEDECLARANT", length=5, nullable=false)
	private java.lang.String decCodeDeclarant;
	
	@Id
	@Column(name="DECNUMREPERTOIRE", length=6, nullable=false)
	private java.lang.String decNumRepertoire;
	
	@Id
	@Column(name="DECDATEDEMANDE")
	private java.sql.Date decDateDemande;

	public EncoursDevis() {
		super();
		// TODO Auto-generated constructor stub
	}

	public EncoursDevis(String decCodeDeclarant, String decNumRepertoire,
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
