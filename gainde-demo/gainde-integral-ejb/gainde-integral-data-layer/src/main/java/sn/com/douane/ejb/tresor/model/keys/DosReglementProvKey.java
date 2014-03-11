package sn.com.douane.ejb.tresor.model.keys;

import java.io.Serializable;

import javax.persistence.Column;


public class DosReglementProvKey implements Serializable{

	private static final long serialVersionUID = -4255231772562033816L;
	
	
	@Column(name="TRNUMDOSPROV", nullable=false)
	private java.lang.Integer trNumDosProv;
	
	
	@Column(name="TRMODEREGLEMENT", length=2, nullable=false)
	private java.lang.String trModeReglement;


	public DosReglementProvKey(Integer trNumDosProv, String trModeReglement) {
		super();
		this.trNumDosProv = trNumDosProv;
		this.trModeReglement = trModeReglement;
	}


	public DosReglementProvKey() {
		super();
		// TODO Auto-generated constructor stub
	}


	public java.lang.Integer getTrNumDosProv() {
		return trNumDosProv;
	}


	public void setTrNumDosProv(java.lang.Integer trNumDosProv) {
		this.trNumDosProv = trNumDosProv;
	}


	public java.lang.String getTrModeReglement() {
		return trModeReglement;
	}


	public void setTrModeReglement(java.lang.String trModeReglement) {
		this.trModeReglement = trModeReglement;
	}

}
