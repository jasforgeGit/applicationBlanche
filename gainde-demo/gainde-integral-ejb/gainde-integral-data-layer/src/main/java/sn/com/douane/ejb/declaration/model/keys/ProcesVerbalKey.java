package sn.com.douane.ejb.declaration.model.keys;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Id;

public class ProcesVerbalKey implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = -2973373758994606717L;

	@javax.persistence.Column(name = "ANNEEPV", length = 4, nullable = false)
	private java.lang.String anneepv;

	@javax.persistence.Column(name = "BUREAUPV", length = 3, nullable = false)
	private java.lang.String bureaupv;

	@javax.persistence.Column(name = "NUMEROPV", length = 25, nullable = false)
	private java.lang.String numeropv;

	public java.lang.String getAnneepv() {
		return anneepv;
	}

	public void setAnneepv(java.lang.String anneepv) {
		this.anneepv = anneepv;
	}

	public java.lang.String getBureaupv() {
		return bureaupv;
	}

	public void setBureaupv(java.lang.String bureaupv) {
		this.bureaupv = bureaupv;
	}

	public java.lang.String getNumeropv() {
		return numeropv;
	}

	public void setNumeropv(java.lang.String numeropv) {
		this.numeropv = numeropv;
	}

	public ProcesVerbalKey() {
		super();
		// TODO Auto-generated constructor stub
	}

}
