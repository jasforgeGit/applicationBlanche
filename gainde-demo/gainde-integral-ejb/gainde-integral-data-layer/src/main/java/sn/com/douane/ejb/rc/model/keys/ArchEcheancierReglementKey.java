package sn.com.douane.ejb.rc.model.keys;

import java.io.Serializable;
import java.sql.Timestamp;

import javax.persistence.Column;

public class ArchEcheancierReglementKey implements Serializable{

	private static final long serialVersionUID = 6157427759374389095L;	
	
	
	@Column(name="TRANNEEDECL", length=4, nullable=false)
	private String trAnneeDecl;    
	
	@Column(name="TRBURDECLARATION", length=3, nullable=false)
	private String trBurDeclaration;
    
	
	@Column(name="TRNUMDECLARATION", nullable=false)
	private Integer trNumDeclaration;
	
	
	@Column(name="TRCODECREDITAIRE", length=3, nullable=false)
	private String trCodeCreditaire;  
	
	
	@Column(name="TRDATEARCH")
	private Timestamp trDateArch;


	public ArchEcheancierReglementKey(String trAnneeDecl,
			String trBurDeclaration, Integer trNumDeclaration,
			String trCodeCreditaire, Timestamp trDateArch) {
		super();
		this.trAnneeDecl = trAnneeDecl;
		this.trBurDeclaration = trBurDeclaration;
		this.trNumDeclaration = trNumDeclaration;
		this.trCodeCreditaire = trCodeCreditaire;
		this.trDateArch = trDateArch;
	}


	public ArchEcheancierReglementKey() {
		super();
	}


	public String getTrAnneeDecl() {
		return trAnneeDecl;
	}


	public void setTrAnneeDecl(String trAnneeDecl) {
		this.trAnneeDecl = trAnneeDecl;
	}


	public String getTrBurDeclaration() {
		return trBurDeclaration;
	}


	public void setTrBurDeclaration(String trBurDeclaration) {
		this.trBurDeclaration = trBurDeclaration;
	}


	public Integer getTrNumDeclaration() {
		return trNumDeclaration;
	}


	public void setTrNumDeclaration(Integer trNumDeclaration) {
		this.trNumDeclaration = trNumDeclaration;
	}


	public String getTrCodeCreditaire() {
		return trCodeCreditaire;
	}


	public void setTrCodeCreditaire(String trCodeCreditaire) {
		this.trCodeCreditaire = trCodeCreditaire;
	}


	public Timestamp getTrDateArch() {
		return trDateArch;
	}


	public void setTrDateArch(Timestamp trDateArch) {
		this.trDateArch = trDateArch;
	}


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((trAnneeDecl == null) ? 0 : trAnneeDecl.hashCode());
		result = prime
				* result
				+ ((trBurDeclaration == null) ? 0 : trBurDeclaration.hashCode());
		result = prime
				* result
				+ ((trCodeCreditaire == null) ? 0 : trCodeCreditaire.hashCode());
		result = prime * result
				+ ((trDateArch == null) ? 0 : trDateArch.hashCode());
		result = prime
				* result
				+ ((trNumDeclaration == null) ? 0 : trNumDeclaration.hashCode());
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
		ArchEcheancierReglementKey other = (ArchEcheancierReglementKey) obj;
		if (trAnneeDecl == null) {
			if (other.trAnneeDecl != null){
				return false;
			}
		} else if (!trAnneeDecl.equals(other.trAnneeDecl)){
			return false;
		}
		if (trBurDeclaration == null) {
			if (other.trBurDeclaration != null){
				return false;
			}
		} else if (!trBurDeclaration.equals(other.trBurDeclaration)){
			return false;
		}
		if (trCodeCreditaire == null) {
			if (other.trCodeCreditaire != null){
				return false;
			}
		} else if (!trCodeCreditaire.equals(other.trCodeCreditaire)){
			return false;
		}
		if (trDateArch == null) {
			if (other.trDateArch != null){
				return false;
			}
		} else if (!trDateArch.equals(other.trDateArch)){
			return false;
		}
		if (trNumDeclaration == null) {
			if (other.trNumDeclaration != null){
				return false;
			}
		} else if (!trNumDeclaration.equals(other.trNumDeclaration)){
			return false;
		}
		return true;
	} 	
	
	
}