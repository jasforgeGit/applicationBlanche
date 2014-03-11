package sn.com.douane.ejb.declaration.model.keys;

import java.io.Serializable;
import java.math.BigDecimal;

import javax.persistence.Column;

public class DetailsDosAPayerAutoKey implements Serializable {

	private static final long serialVersionUID = -5317710868381356573L;

	@Column(name = "ANDCL", length = 4, nullable = false)
	private java.lang.String anDcl;

	@Column(name = "BURDCL", length = 3, nullable = false)
	private java.lang.String burDcl;

	@Column(name = "NUMDCL", columnDefinition = "DECIMAL(18,2)", nullable = false)
	private java.math.BigDecimal numDcl;
	
	

	public DetailsDosAPayerAutoKey() {
		super();
			}

	public DetailsDosAPayerAutoKey(String anDcl, String burDcl,
			BigDecimal numDcl) {
		super();
		this.anDcl = anDcl;
		this.burDcl = burDcl;
		this.numDcl = numDcl;
	}

	public java.lang.String getAnDcl() {
		return anDcl;
	}

	public void setAnDcl(java.lang.String anDcl) {
		this.anDcl = anDcl;
	}

	public java.lang.String getBurDcl() {
		return burDcl;
	}

	public void setBurDcl(java.lang.String burDcl) {
		this.burDcl = burDcl;
	}

	public java.math.BigDecimal getNumDcl() {
		return numDcl;
	}

	public void setNumDcl(java.math.BigDecimal numDcl) {
		this.numDcl = numDcl;
	}
	
	

}
