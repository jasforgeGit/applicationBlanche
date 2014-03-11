package sn.com.douane.ejb.declaration.model.keys;

import java.io.Serializable;

import javax.persistence.Column;

public class SpecVerifProdKey implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 4954144308082108763L;

	
	
	
	@Column(name="DECCODEBUREAU",length=3, nullable=false)
	private java.lang.String decCodeBureau;
	

	
	@Column(name="DECVERIFICATEUR",length=5, nullable=false)
	    private java.lang.String decVerificateur;
	

	
	@Column(name="DECCODEPROD",length=6, nullable=false)
	    private java.lang.String decCodeProd;
	

	
	@Column(name="DECPRECSEN",length=2, nullable=false)
	    private java.lang.String decPrecSen;
	

	
	@Column(name="DECPRECUEMOA",length=2, nullable=false)
	    private java.lang.String decPrecUemoa;



	public SpecVerifProdKey(String decCodeBureau, String decVerificateur,
			String decCodeProd, String decPrecSen, String decPrecUemoa) {
		super();
		this.decCodeBureau = decCodeBureau;
		this.decVerificateur = decVerificateur;
		this.decCodeProd = decCodeProd;
		this.decPrecSen = decPrecSen;
		this.decPrecUemoa = decPrecUemoa;
	}



	public SpecVerifProdKey() {
		super();
	}



	public java.lang.String getDecCodeBureau() {
		return decCodeBureau;
	}



	public void setDecCodeBureau(java.lang.String decCodeBureau) {
		this.decCodeBureau = decCodeBureau;
	}



	public java.lang.String getDecVerificateur() {
		return decVerificateur;
	}



	public void setDecVerificateur(java.lang.String decVerificateur) {
		this.decVerificateur = decVerificateur;
	}



	public java.lang.String getDecCodeProd() {
		return decCodeProd;
	}



	public void setDecCodeProd(java.lang.String decCodeProd) {
		this.decCodeProd = decCodeProd;
	}



	public java.lang.String getDecPrecSen() {
		return decPrecSen;
	}



	public void setDecPrecSen(java.lang.String decPrecSen) {
		this.decPrecSen = decPrecSen;
	}



	public java.lang.String getDecPrecUemoa() {
		return decPrecUemoa;
	}



	public void setDecPrecUemoa(java.lang.String decPrecUemoa) {
		this.decPrecUemoa = decPrecUemoa;
	}

	
}
