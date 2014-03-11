package sn.com.douane.ejb.rc.model.keys;

import javax.persistence.Column;

/**
 * Key class for Entity Bean: TypeApuBurInterditKey
 */
public class TypeApuBurInterditKey implements java.io.Serializable {
	
	 static final long serialVersionUID = 3206093459760846163L;
	 
	/**
	 * Implementation field for persistent attribute rctypeapurement.
	 */
	 @Column(name = "RCTYPEAPUREMENT", nullable = false, length = 1)
	private String rctypeapurement;

	/**
	 * Implementation field for persistent attribute: ce_burtypeapu_rccodeburdouane
	 */
	 @Column(name = "RCCODEBUREAU", nullable = false, length = 3)
	private String rccodebureau;
	
	/**
	 * Creates an empty key for Entity Bean: Typeapuburinterdit
	 */
	public TypeApuBurInterditKey() { }
	
	public TypeApuBurInterditKey(String rctypeapurement, String rccodebureau) {
		super();
		this.rctypeapurement = rctypeapurement;
		this.rccodebureau = rccodebureau;
	}
	
	public String getRccodebureau() {
		return rccodebureau;
	}

	public void setRccodebureau(String rccodebureau) {
		this.rccodebureau = rccodebureau;
	}

	/**
	 * Get accessor for persistent attribute rctypeapurement
	 */
	public String getRctypeapurement() {
		return rctypeapurement;
	}

	/**
	 * Set accessor for persistent attribute rctypeapurement
	 */
	public void setRctypeapurement(String newRctypeapurement) {
		rctypeapurement = newRctypeapurement;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((rccodebureau == null) ? 0 : rccodebureau.hashCode());
		result = prime * result
				+ ((rctypeapurement == null) ? 0 : rctypeapurement.hashCode());
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
		TypeApuBurInterditKey other = (TypeApuBurInterditKey) obj;
		if (rccodebureau == null) {
			if (other.rccodebureau != null){
				return false;
			}
		} else if (!rccodebureau.equals(other.rccodebureau)){
			return false;
		}
		if (rctypeapurement == null) {
			if (other.rctypeapurement != null){
				return false;
			}
		} else if (!rctypeapurement.equals(other.rctypeapurement)){
			return false;
		}
		return true;
	}
	
	
}
