package sn.com.douane.ejb.rc.model.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
/**
 * 
 * @author nesrine
 *
 */
@Entity
@Table(name="TYPEDECISION")
public class TypeDecision implements Serializable {

	private static final long serialVersionUID = -836405281643657184L;
	
	@Id
	@Column(name="RCCODETYPEDECISION", length=1, nullable=false)
	private String rcCodeTypeDecision;
	
	@Column(name="RCLIBELLEDECISION", length=100, nullable=false)
    private String rcLibelleDecision;

	public TypeDecision() {

	}

	public TypeDecision(String rcCodeTypeDecision, String rcLibelleDecision) {
		super();
		this.rcCodeTypeDecision = rcCodeTypeDecision;
		this.rcLibelleDecision = rcLibelleDecision;
	}

	/**
	 * @return the rcCodeTypeDecision
	 */
	public String getRcCodeTypeDecision() {
		return rcCodeTypeDecision;
	}

	/**
	 * @param rcCodeTypeDecision the rcCodeTypeDecision to set
	 */
	public void setRcCodeTypeDecision(String rcCodeTypeDecision) {
		this.rcCodeTypeDecision = rcCodeTypeDecision;
	}

	/**
	 * @return the rcLibelleDecision
	 */
	public String getRcLibelleDecision() {
		return rcLibelleDecision;
	}

	/**
	 * @param rcLibelleDecision the rcLibelleDecision to set
	 */
	public void setRcLibelleDecision(String rcLibelleDecision) {
		this.rcLibelleDecision = rcLibelleDecision;
	}


}
