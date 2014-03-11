package sn.com.douane.ejb.rc.model.entities;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Basic;
import javax.persistence.Column;

@Entity
@Table(name="TYPELIQUIDATION")
public class TypeLiquidation implements Serializable{

	private static final long serialVersionUID = 7062004105932825958L;

	@Id
	@Column(name="RCCODETYPELIQUID",length = 1,nullable = false)
	private String rccodetypeliquid;

	@Column(name="RCLIBELLETYPELIQUID",length = 100,nullable = false)
	private String rclibelletypeliquid;

	public TypeLiquidation () {
	}
	
	public TypeLiquidation(
			String rccodetypeliquid,
			String rclibelletypeliquid) {
		this.rccodetypeliquid = rccodetypeliquid;
		this.rclibelletypeliquid = rclibelletypeliquid;
		return;
	}

	/**
	 * Get accessor for persistent attribute: rccodetypeliquid
	 */
	public String getRccodetypeliquid() {
		return rccodetypeliquid;
	}

	/**
	 * Set accessor for persistent attribute: rccodetypeliquid
	 */
	public void setRccodetypeliquid(
			String rccodetypeliquid) {
		this.rccodetypeliquid = rccodetypeliquid;
	}

	/**
	 * Get accessor for persistent attribute: rclibelletypeliquid
	 */
	@Basic
	public String getRclibelletypeliquid() {
		return rclibelletypeliquid;
	}

	/**
	 * Set accessor for persistent attribute: rclibelletypeliquid
	 */
	public void setRclibelletypeliquid(
			String rclibelletypeliquid) {
		this.rclibelletypeliquid = rclibelletypeliquid;
	}

}
