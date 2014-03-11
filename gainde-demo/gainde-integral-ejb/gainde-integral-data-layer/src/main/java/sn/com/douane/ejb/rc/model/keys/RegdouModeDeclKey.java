package sn.com.douane.ejb.rc.model.keys;

import java.io.Serializable;

import javax.persistence.Column;

public class RegdouModeDeclKey implements Serializable{

	private static final long serialVersionUID = -8631868104226234488L;

	/**
	 * Implementation field for persistent attribute: rcTypeRegime
	 */
	@Column(name="RCTYPEREGIME", length=1, nullable=false)
	private String rcTypeRegime;
	
	/**
	 * Implementation field for persistent attribute: rcCodeRegimeDouanier
	 */
	@Column(name="RCCODEREGIMEDOUANIER", length=1, nullable=false)
	private String rcCodeRegimeDouanier;

	/**
	 * Implementation field for persistent attribute : rcCodeModeDec
	 */
	@Column(name="RCCODEMODEDECLARATION", length=4, nullable=false)
	private String rcCodeModeDeclaration;

	
	
	/**
	 * 
	 */
	public RegdouModeDeclKey(){
		
	}
	
	/**
	 * 
	 * @param rcCodeModeDec
	 * @param rcCodeRegimeDouanier
	 * @param rcTypeRegime
	 */
	public RegdouModeDeclKey(String rcCodeModeDeclaration, String rcCodeRegimeDouanier,
			String rcTypeRegime) {
		super();
		this.rcCodeModeDeclaration = rcCodeModeDeclaration;
		this.rcCodeRegimeDouanier = rcCodeRegimeDouanier;
		this.rcTypeRegime = rcTypeRegime;
	}


	/**
	 * Returns true if both keys are equal.
	 */
	public boolean equals(java.lang.Object otherKey) {
		if (otherKey instanceof RegdouModeDeclKey) {
			RegdouModeDeclKey o = (RegdouModeDeclKey) otherKey;
			return ((this.rcCodeModeDeclaration
					.equals(o.rcCodeModeDeclaration))
					&& (this.rcCodeRegimeDouanier
							.equals(o.rcCodeRegimeDouanier)) && (this.rcTypeRegime
					.equals(o.rcTypeRegime)));
		}
		return false;
	}

	/**
	 * Returns the hash code for the key.
	 */
	public int hashCode() {
		return (rcCodeModeDeclaration.hashCode()
				+ rcCodeRegimeDouanier.hashCode() + rcTypeRegime
				.hashCode());
	}

	public String getRcTypeRegime() {
		return rcTypeRegime;
	}

	public void setRcTypeRegime(String rcTypeRegime) {
		this.rcTypeRegime = rcTypeRegime;
	}

	public String getRcCodeModeDeclaration() {
		return rcCodeModeDeclaration;
	}

	public void setRcCodeModeDeclaration(String rcCodeModeDeclaration) {
		this.rcCodeModeDeclaration = rcCodeModeDeclaration;
	}

	public String getRcCodeRegimeDouanier() {
		return rcCodeRegimeDouanier;
	}

	public void setRcCodeRegimeDouanier(String rcCodeRegimeDouanier) {
		this.rcCodeRegimeDouanier = rcCodeRegimeDouanier;
	}
	
}
