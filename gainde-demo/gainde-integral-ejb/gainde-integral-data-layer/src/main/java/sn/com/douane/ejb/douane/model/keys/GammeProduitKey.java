package sn.com.douane.ejb.douane.model.keys;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Id;

public class GammeProduitKey implements Serializable{

	private static final long serialVersionUID = -4255231772562033816L;
	
	@Column(name="CODEPRODUIT", length=6, nullable=false)
	 private java.lang.String codeProduit;
	
	
	@Column(name="NUMEROGAMME", length=5, nullable=false)
	    private java.lang.String numeroGamme;


	public GammeProduitKey(String codeProduit, String numeroGamme) {
		super();
		this.codeProduit = codeProduit;
		this.numeroGamme = numeroGamme;
	}


	public GammeProduitKey() {
		super();
		// TODO Auto-generated constructor stub
	}


	public java.lang.String getCodeProduit() {
		return codeProduit;
	}


	public void setCodeProduit(java.lang.String codeProduit) {
		this.codeProduit = codeProduit;
	}


	public java.lang.String getNumeroGamme() {
		return numeroGamme;
	}


	public void setNumeroGamme(java.lang.String numeroGamme) {
		this.numeroGamme = numeroGamme;
	}
	
}
