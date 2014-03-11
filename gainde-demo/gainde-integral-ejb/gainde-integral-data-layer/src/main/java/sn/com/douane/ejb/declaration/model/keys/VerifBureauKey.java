/**
 * @author Zackaria
 *
 */
package sn.com.douane.ejb.declaration.model.keys;

import java.io.Serializable;

import javax.persistence.Column;

public class VerifBureauKey implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -8876558137589451459L;

	@Column(name="DECCODEBUREAU", length=3, nullable=false)
	private java.lang.String decCodeBureau;
	
	@Column(name="DECCODEVERIF", length=5, nullable=false)
    private java.lang.String decCodeVerif;

	public VerifBureauKey() {
		super();
		// TODO Auto-generated constructor stub
	}

	public VerifBureauKey(String decCodeBureau, String decCodeVerif) {
		super();
		this.decCodeBureau = decCodeBureau;
		this.decCodeVerif = decCodeVerif;
	}

	public java.lang.String getDecCodeBureau() {
		return decCodeBureau;
	}

	public void setDecCodeBureau(java.lang.String decCodeBureau) {
		this.decCodeBureau = decCodeBureau;
	}

	public java.lang.String getDecCodeVerif() {
		return decCodeVerif;
	}

	public void setDecCodeVerif(java.lang.String decCodeVerif) {
		this.decCodeVerif = decCodeVerif;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((decCodeBureau == null) ? 0 : decCodeBureau.hashCode());
		result = prime * result
				+ ((decCodeVerif == null) ? 0 : decCodeVerif.hashCode());
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
		VerifBureauKey other = (VerifBureauKey) obj;
		if (decCodeBureau == null) {
			if (other.decCodeBureau != null){
				return false;
			}
		} else if (!decCodeBureau.equals(other.decCodeBureau)){
			return false;
		}
		if (decCodeVerif == null) {
			if (other.decCodeVerif != null){
				return false;
			}
		} else if (!decCodeVerif.equals(other.decCodeVerif)){
			return false;
		}
		return true;
	}
	
	
}
