package sn.com.douane.ejb.declaration.model.entities;

import java.io.Serializable;
import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Column;
import javax.persistence.IdClass;
import javax.persistence.Table;

import sn.com.douane.ejb.declaration.model.keys.MutationAtKey;

@Entity
@IdClass(MutationAtKey.class)
@Table(name="MUTATIONAT")

public class MutationAt implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 3003054263714104153L;

	@Id
	@Column(name="DECANNEEMUT", length=4, nullable=false)
	private java.lang.String decAnneeMut;
	
	@Id
	@Column(name="DECPPMEMETTEUR", length=5, nullable=false)
	private java.lang.String decPpmeMetteur;
	
	@Id
	@Column(name="DECNUMREPERTOIRE", length=6, nullable=false)
	private java.lang.String decNumRepertoire;
	
	@Column(name="DECPPMRECEPTEUR", length=5, nullable=false)
	private java.lang.String decPpmRecepteur;
	
	@Column(name="DECDATEMUTATION")
	private java.sql.Date decDateMutation;
	
	@Column(name="DECUSERMUTATION", length=8)
	private java.lang.String decUserMutation;
	
	@Column(name="DECCODEPROD", length=6, nullable=false)
	private java.lang.String decCodeProd;
	
	@Column(name="DECPRECUEMOA", length=2, nullable=false)
	private java.lang.String decPrecUemoa;
	
	@Column(name="DECPRECSENEGAL", length=2, nullable=false)
	private java.lang.String decPrecSenegal;

	public MutationAt() {
		super();
		// TODO Auto-generated constructor stub
	}

	public MutationAt(String decAnneeMut, String decPpmeMetteur,
			String decNumRepertoire, String decPpmRecepteur,
			Date decDateMutation, String decUserMutation, String decCodeProd,
			String decPrecUemoa, String decPrecSenegal) {
		super();
		this.decAnneeMut = decAnneeMut;
		this.decPpmeMetteur = decPpmeMetteur;
		this.decNumRepertoire = decNumRepertoire;
		this.decPpmRecepteur = decPpmRecepteur;
		this.decDateMutation = decDateMutation;
		this.decUserMutation = decUserMutation;
		this.decCodeProd = decCodeProd;
		this.decPrecUemoa = decPrecUemoa;
		this.decPrecSenegal = decPrecSenegal;
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

	public java.lang.String getDecPpmRecepteur() {
		return decPpmRecepteur;
	}

	public void setDecPpmRecepteur(java.lang.String decPpmRecepteur) {
		this.decPpmRecepteur = decPpmRecepteur;
	}

	public java.sql.Date getDecDateMutation() {
		return decDateMutation;
	}

	public void setDecDateMutation(java.sql.Date decDateMutation) {
		this.decDateMutation = decDateMutation;
	}

	public java.lang.String getDecUserMutation() {
		return decUserMutation;
	}

	public void setDecUserMutation(java.lang.String decUserMutation) {
		this.decUserMutation = decUserMutation;
	}

	public java.lang.String getDecCodeProd() {
		return decCodeProd;
	}

	public void setDecCodeProd(java.lang.String decCodeProd) {
		this.decCodeProd = decCodeProd;
	}

	public java.lang.String getDecPrecUemoa() {
		return decPrecUemoa;
	}

	public void setDecPrecUemoa(java.lang.String decPrecUemoa) {
		this.decPrecUemoa = decPrecUemoa;
	}

	public java.lang.String getDecPrecSenegal() {
		return decPrecSenegal;
	}

	public void setDecPrecSenegal(java.lang.String decPrecSenegal) {
		this.decPrecSenegal = decPrecSenegal;
	}
	
}
