package sn.com.douane.ejb.rc.model.keys;

import java.io.Serializable;

import javax.persistence.Column;


/**
 * Key class for Entity Bean: CatreGroupPieceJointe
 */
public class CatreGroupPieceJointeKey  implements Serializable {	

    static final long serialVersionUID = 3206093459760846163L;

    @Column(name = "RCCODECATREGROUP",length = 3,nullable = false)
	private String rcCodeCatreGroup;
	
	@Column(name = "RCCODEPJ",length = 3,nullable = false)
	private String rcCodePieceJointe;

	/**
	 * 0-args constructor.
	 */
	public CatreGroupPieceJointeKey() {
		super();
	}

	/**
	 * 2-args constructor.
	 * 
	 * @param rcCodeCatreGroup
	 * @param rcCodePieceJointe
	 */
	public CatreGroupPieceJointeKey(String rcCodeCatreGroup,
			String rcCodePieceJointe) {
		super();
		this.rcCodeCatreGroup = rcCodeCatreGroup;
		this.rcCodePieceJointe = rcCodePieceJointe;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime
				* result
				+ ((rcCodeCatreGroup == null) ? 0 : rcCodeCatreGroup.hashCode());
		result = prime
				* result
				+ ((rcCodePieceJointe == null) ? 0 : rcCodePieceJointe
						.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj){
			return true;}
		if (obj == null){
			return false;}
		if (getClass() != obj.getClass()){
			return false;}
		CatreGroupPieceJointeKey other = (CatreGroupPieceJointeKey) obj;
		if (rcCodeCatreGroup == null) {
			if (other.rcCodeCatreGroup != null){
				return false;}
		} else if (!rcCodeCatreGroup.equals(other.rcCodeCatreGroup)){
			return false;}
		if (rcCodePieceJointe == null) {
			if (other.rcCodePieceJointe != null){
				return false;}
		} else if (!rcCodePieceJointe.equals(other.rcCodePieceJointe)){
			return false;}
		return true;
	}
	

	public String getRcCodeCatreGroup() {
		return rcCodeCatreGroup;
	}

	public void setRcCodeCatreGroup(String rcCodeCatreGroup) {
		this.rcCodeCatreGroup = rcCodeCatreGroup;
	}

	public String getRcCodePieceJointe() {
		return rcCodePieceJointe;
	}

	public void setRcCodePieceJointe(String rcCodePieceJointe) {
		this.rcCodePieceJointe = rcCodePieceJointe;
	}

	
  

}
