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
@Table(name="UNITEFACTURATION")
public class UniteFacturation implements Serializable{

	private static final long serialVersionUID = -7640786402087914917L;

	@Id
	@Column(name="UNITFAC", columnDefinition="CHAR(2)", nullable=false)
	private String unitFac;
	
	@Column(name="LIBUNITE", length=35, nullable=false)
    private String libUnite;

	public UniteFacturation() {

	}

	public UniteFacturation(String unitFac, String libUnite) {
		super();
		this.unitFac = unitFac;
		this.libUnite = libUnite;
	}


	public String getUnitFac() {
		return unitFac;
	}

	public void setUnitFac(String unitFac) {
		this.unitFac = unitFac;
	}

	public String getLibUnite() {
		return libUnite;
	}

	public void setLibUnite(String libUnite) {
		this.libUnite = libUnite;
	}
    
    
}
