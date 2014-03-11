package sn.com.douane.ejb.declaration.model.keys;

import java.io.Serializable;

import javax.persistence.Column;

public class MutationAtKey implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 221731163921640964L;
	
	@Column(name="DECANNEEMUT", length=4, nullable=false)
	private java.lang.String decAnneeMut;
	
	@Column(name="DECPPMEMETTEUR", length=5, nullable=false)
	private java.lang.String decPpmeMetteur;
	
	@Column(name="DECNUMREPERTOIRE", length=6, nullable=false)
	private java.lang.String decNumRepertoire;

	public MutationAtKey() {
		super();
		// TODO Auto-generated constructor stub
	}

	public MutationAtKey(String decAnneeMut, String decPpmeMetteur,
			String decNumRepertoire) {
		super();
		this.decAnneeMut = decAnneeMut;
		this.decPpmeMetteur = decPpmeMetteur;
		this.decNumRepertoire = decNumRepertoire;
	}

	public java.lang.String getDecAnneeMut() {
		return decAnneeMut;
	}

	public void setDecAnneeMut(java.lang.String decAnneeMut) {
		this.decAnneeMut = decAnneeMut;
	}

	public java.lang.String getDecPpmeMetteur() {
		return decPpmeMetteur;
	}

	public void setDecPpmeMetteur(java.lang.String decPpmeMetteur) {
		this.decPpmeMetteur = decPpmeMetteur;
	}

	public java.lang.String getDecNumRepertoire() {
		return decNumRepertoire;
	}

	public void setDecNumRepertoire(java.lang.String decNumRepertoire) {
		this.decNumRepertoire = decNumRepertoire;
	}

}
