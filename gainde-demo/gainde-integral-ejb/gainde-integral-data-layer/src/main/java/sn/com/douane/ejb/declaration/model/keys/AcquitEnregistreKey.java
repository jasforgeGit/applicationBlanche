package sn.com.douane.ejb.declaration.model.keys;

import java.io.Serializable;

import javax.persistence.Column;


/**
 * @author: issam
 * Key class for Entity Bean: AcquitEnregistre
 */


public class AcquitEnregistreKey implements Serializable{

	private static final long serialVersionUID = -5317710868381356573L;

	@Column(name="ANNEEDECLARATION", length=4, nullable=false)
	private java.lang.String anneeDeclaration;
	
	@Column(name="BUREAUDEC", length=3, nullable=false)
    private String bureauDec;
	
	@Column(name="NUMERODECLARATION",nullable=false)
    private Integer numeroDeclaration;
	
	 public AcquitEnregistreKey(String anneeDeclaration, String bureauDec,Integer numeroDeclaration) {
        this.anneeDeclaration = anneeDeclaration;
        this.bureauDec = bureauDec;
        this.numeroDeclaration = numeroDeclaration;
    }

   
    public AcquitEnregistreKey() {
    }
	    

	public java.lang.String getAnneeDeclaration() {
		return anneeDeclaration;
	}

	public void setAnneeDeclaration(java.lang.String anneeDeclaration) {
		this.anneeDeclaration = anneeDeclaration;
	}

	public String getBureauDec() {
		return bureauDec;
	}

	public void setBureauDec(String bureauDec) {
		this.bureauDec = bureauDec;
	}

	public Integer getNumeroDeclaration() {
		return numeroDeclaration;
	}

	public void setNumeroDeclaration(Integer numeroDeclaration) {
		this.numeroDeclaration = numeroDeclaration;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime
				* result
				+ ((anneeDeclaration == null) ? 0 : anneeDeclaration.hashCode());
		result = prime * result
				+ ((bureauDec == null) ? 0 : bureauDec.hashCode());
		result = prime
				* result
				+ ((numeroDeclaration == null) ? 0 : numeroDeclaration
						.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
			if (obj instanceof AcquitEnregistreKey) {
				AcquitEnregistreKey o = (AcquitEnregistreKey) obj;
				return ((this.anneeDeclaration.equals(o.anneeDeclaration))
					&& (this.bureauDec.equals(o.bureauDec))
					&& (this.numeroDeclaration.equals(o.numeroDeclaration)));
			}
			return false;
		}
	
}
