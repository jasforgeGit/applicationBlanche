package sn.com.douane.ejb.rc.model.keys;


import java.io.Serializable;

import javax.persistence.Column;

/**
 * Key class for Entity Bean : DispensePieceJointe
 */
public class DispensePieceJointeKey implements Serializable {
	
    static final long serialVersionUID = 3206093459760846163L;
   
	@Column(name = "RCCODEDISPENSE",length = 5,nullable = false)
	private String rccodedispense;
	
	@Column(name = "RCCODEPIECEJOINTE",length = 3,nullable = false)
	private String rccodepiecejointe;
	
	/**
	 * 0-args constructor.
	 */
	public DispensePieceJointeKey() {
		super();
	}

	/**
	 * 2-args constructor.
	 */
	public DispensePieceJointeKey(String rccodedispense,
			String rccodepiecejointe) {
		super();
		this.rccodedispense = rccodedispense;
		this.rccodepiecejointe = rccodepiecejointe;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((rccodedispense == null) ? 0 : rccodedispense.hashCode());
		result = prime
				* result
				+ ((rccodepiecejointe == null) ? 0 : rccodepiecejointe
						.hashCode());
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
		DispensePieceJointeKey other = (DispensePieceJointeKey) obj;
		if (rccodedispense == null) {
			if (other.rccodedispense != null){
				return false;
			}
		} else if (!rccodedispense.equals(other.rccodedispense)){
			return false;
		}
		if (rccodepiecejointe == null) {
			if (other.rccodepiecejointe != null){
				return false;
			}
		} else if (!rccodepiecejointe.equals(other.rccodepiecejointe)){
			return false;
		}
		return true;
	}
	
    
	
	
	
}