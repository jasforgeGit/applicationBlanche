/**
 * 
 */
package sn.com.douane.ejb.declaration.model.keys;

import java.io.Serializable;
import java.sql.Date;

import javax.persistence.Column;

/**
 * @author moussakare
 *
 */
public class CessionSommierDlppKey implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -2785194723800922065L;
	
	
	@Column(name = "DECANNEEENREGDEC", length = 4, nullable = false)
    private java.lang.String decAnneeEnregDec;
	
	
	@Column(name = "DECBURENREGDEC", length = 3, nullable = false)
    private java.lang.String decBurEnregDec;
	
	
	@Column(name = "DECNUMDECLARATION", nullable = false)
    private java.lang.Integer decNumDeclaration;
	
	
	@Column(name = "DECNUMARTDECL", nullable = false)	
	private java.lang.Integer decNumArtDecl;
	
	
	@Column(name = "DECPPMEMETTEUR", length = 5, nullable = false)
	private java.lang.String decPpmEmetteur;
	
	
	@Column(name = "DECPPMDESTINATAIRE", length = 5, nullable = false)
    private java.lang.String decPpmDestinataire;
	
	
	@Column(name = "DECDATECESSION", nullable = false)
    private java.sql.Date decDateCession;

	
	

	public CessionSommierDlppKey() {
		super();
	}


	public CessionSommierDlppKey(String decAnneeEnregDec,
			String decBurEnregDec, Integer decNumDeclaration,
			Integer decNumArtDecl, String decPpmEmetteur,
			String decPpmDestinataire, Date decDateCession) {
		super();
		this.decAnneeEnregDec = decAnneeEnregDec;
		this.decBurEnregDec = decBurEnregDec;
		this.decNumDeclaration = decNumDeclaration;
		this.decNumArtDecl = decNumArtDecl;
		this.decPpmEmetteur = decPpmEmetteur;
		this.decPpmDestinataire = decPpmDestinataire;
		this.decDateCession = decDateCession;
	}


	public java.lang.String getDecAnneeEnregDec() {
		return decAnneeEnregDec;
	}


	public void setDecAnneeEnregDec(java.lang.String decAnneeEnregDec) {
		this.decAnneeEnregDec = decAnneeEnregDec;
	}


	public java.lang.String getDecBurEnregDec() {
		return decBurEnregDec;
	}


	public void setDecBurEnregDec(java.lang.String decBurEnregDec) {
		this.decBurEnregDec = decBurEnregDec;
	}


	public java.lang.Integer getDecNumDeclaration() {
		return decNumDeclaration;
	}


	public void setDecNumDeclaration(java.lang.Integer decNumDeclaration) {
		this.decNumDeclaration = decNumDeclaration;
	}


	public java.lang.Integer getDecNumArtDecl() {
		return decNumArtDecl;
	}


	public void setDecNumArtDecl(java.lang.Integer decNumArtDecl) {
		this.decNumArtDecl = decNumArtDecl;
	}


	public java.lang.String getDecPpmEmetteur() {
		return decPpmEmetteur;
	}


	public void setDecPpmEmetteur(java.lang.String decPpmEmetteur) {
		this.decPpmEmetteur = decPpmEmetteur;
	}


	public java.lang.String getDecPpmDestinataire() {
		return decPpmDestinataire;
	}


	public void setDecPpmDestinataire(java.lang.String decPpmDestinataire) {
		this.decPpmDestinataire = decPpmDestinataire;
	}


	public java.sql.Date getDecDateCession() {
		return decDateCession;
	}


	public void setDecDateCession(java.sql.Date decDateCession) {
		this.decDateCession = decDateCession;
	}


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime
				* result
				+ ((decAnneeEnregDec == null) ? 0 : decAnneeEnregDec.hashCode());
		result = prime * result
				+ ((decBurEnregDec == null) ? 0 : decBurEnregDec.hashCode());
		result = prime * result
				+ ((decDateCession == null) ? 0 : decDateCession.hashCode());
		result = prime * result
				+ ((decNumArtDecl == null) ? 0 : decNumArtDecl.hashCode());
		result = prime
				* result
				+ ((decNumDeclaration == null) ? 0 : decNumDeclaration
						.hashCode());
		result = prime
				* result
				+ ((decPpmDestinataire == null) ? 0 : decPpmDestinataire
						.hashCode());
		result = prime * result
				+ ((decPpmEmetteur == null) ? 0 : decPpmEmetteur.hashCode());
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
		CessionSommierDlppKey other = (CessionSommierDlppKey) obj;
		if (decAnneeEnregDec == null) {
			if (other.decAnneeEnregDec != null){
				return false;
			}
		} else if (!decAnneeEnregDec.equals(other.decAnneeEnregDec)){
			return false;
		}
		if (decBurEnregDec == null) {
			if (other.decBurEnregDec != null){
				return false;
			}
		} else if (!decBurEnregDec.equals(other.decBurEnregDec)){
			return false;
		}
		if (decDateCession == null) {
			if (other.decDateCession != null){
				return false;
			}
		} else if (!decDateCession.equals(other.decDateCession)){
			return false;
		}
		if (decNumArtDecl == null) {
			if (other.decNumArtDecl != null){
				return false;
			}
		} else if (!decNumArtDecl.equals(other.decNumArtDecl)){
			return false;
		}
		if (decNumDeclaration == null) {
			if (other.decNumDeclaration != null){
				return false;
			}
		} else if (!decNumDeclaration.equals(other.decNumDeclaration)){
			return false;
		}
		if (decPpmDestinataire == null) {
			if (other.decPpmDestinataire != null){
				return false;
			}
		} else if (!decPpmDestinataire.equals(other.decPpmDestinataire)){
			return false;
		}
		if (decPpmEmetteur == null) {
			if (other.decPpmEmetteur != null){
				return false;
			}
		} else if (!decPpmEmetteur.equals(other.decPpmEmetteur)){
			return false;
		}
		return true;
	}
	
	
	
	

}
