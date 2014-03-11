package sn.com.douane.ejb.rc.model.keys;

import java.io.Serializable;

import javax.persistence.Column;

public class BacDepotPetrolierKey implements Serializable {

	private static final long serialVersionUID = 3862111287136610613L;
	/**
	 * Implementation field for persistent attribute: rccodebac
	 */
	@Column(name="RCCODEBAC", length=10, nullable=false)
	private String rcCodeBac;
	/**
	 * Implementation field for persistent attribute: ce_bacdepotpetr_rccodedepot
	 */
	@Column(name="RCCODEDEPOT", length=10, nullable=false)
	private String rcCodeDepot;
	
	public String getRcCodeBac() {
		return rcCodeBac; 
	}
	
	public String getRcCodeDepot(){
		return rcCodeDepot; 
	}
	
	/**
	 * Creates an empty key for Entity Bean: Bacdepotpetrolier
	 */
	public BacDepotPetrolierKey() {
	}
	
	public BacDepotPetrolierKey(String rcCodeBac,
			String rcCodeDepot) {
		super();
		this.rcCodeBac = rcCodeBac;
		this.rcCodeDepot = rcCodeDepot;
	}

	@Override
	public int hashCode() {
		return (rcCodeBac.hashCode() + rcCodeDepot.hashCode());
	}

	@Override
	public boolean equals(java.lang.Object otherKey) {
		if (otherKey instanceof BacDepotPetrolierKey) {
			BacDepotPetrolierKey o = (BacDepotPetrolierKey) otherKey;
			return ((this.rcCodeBac.equals(o.rcCodeBac)) && (this.rcCodeDepot
				.equals(o.rcCodeDepot)));
		}
		return false;
	}	
}
