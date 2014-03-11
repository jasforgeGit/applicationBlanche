package sn.com.douane.ejb.declaration.model.keys;

import java.io.Serializable;

import javax.persistence.Column;

/**
 * @author Taher
 *
 */
public class DossiersPaieAutoKey implements Serializable {

	private static final long serialVersionUID = -5317710868381356573L;

	@Column(name = "CODCRD",  columnDefinition="CHAR(3)", nullable = false)
	private java.lang.String codCrd;

	@Column(name = "NODOSSPROVISOIRE", nullable = false)
	private java.lang.Integer noDossProvisoire;
	
	

	public DossiersPaieAutoKey() {
		super();
			}

	public DossiersPaieAutoKey(String codCrd, Integer noDossProvisoire) {
		super();
		this.codCrd = codCrd;
		this.noDossProvisoire = noDossProvisoire;
	}

	public java.lang.String getCodCrd() {
		return codCrd;
	}

	public void setCodCrd(java.lang.String codCrd) {
		this.codCrd = codCrd;
	}

	public java.lang.Integer getNoDossProvisoire() {
		return noDossProvisoire;
	}

	public void setNoDossProvisoire(java.lang.Integer noDossProvisoire) {
		this.noDossProvisoire = noDossProvisoire;
	}

}
