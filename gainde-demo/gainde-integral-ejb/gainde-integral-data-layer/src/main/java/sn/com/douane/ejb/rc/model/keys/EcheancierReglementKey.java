package sn.com.douane.ejb.rc.model.keys;

import java.io.Serializable;

import javax.persistence.Column;

public class EcheancierReglementKey implements Serializable{

	private static final long serialVersionUID = 6157427759374389095L;
	
	@Column(name="TRANNEEDECL", length=4, nullable=false)
	private String trAnneeDecl;
    
	@Column(name="TRBURDECLARATION", length=3, nullable=false)
	private String trBurDeclaration;
   	
	@Column(name="TRNUMDECLARATION", nullable=false)
	private Integer trNumDeclaration;
		
	public EcheancierReglementKey() {

	}

	public EcheancierReglementKey(String trAnneeDecl, String trBurDeclaration,
			Integer trNumDeclaration) {
		super();
		this.trAnneeDecl = trAnneeDecl;
		this.trBurDeclaration = trBurDeclaration;
		this.trNumDeclaration = trNumDeclaration;
	}

	/**
	 * Returns true if both keys are equal.
	 */
	public boolean equals(java.lang.Object otherKey) {
		if (otherKey instanceof EcheancierReglementKey) {
			EcheancierReglementKey o = (EcheancierReglementKey) otherKey;
			return ((this.trAnneeDecl.equals(o.trAnneeDecl))
				&& (this.trBurDeclaration.equals(o.trBurDeclaration)) && (this.trNumDeclaration
				.equals(o.trNumDeclaration)));
		}
		return false;
	}
	
	/**
	 * Returns the hash code for the key.
	 */
	public int hashCode() {
		return (trAnneeDecl.hashCode() + trBurDeclaration.hashCode()
				+ trNumDeclaration.hashCode());
	}

}
