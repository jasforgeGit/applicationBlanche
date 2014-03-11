package sn.com.douane.ejb.tresor.model.keys;

import java.io.Serializable;

import javax.persistence.Column;


public class DosReglementDefKey implements Serializable{

	private static final long serialVersionUID = -4255231772562033816L;
	
	
	@Column(name="TRNUMDOSDEF")
    private java.lang.Integer trNumDosDef;
	
	
	@Column(name="TRMODEREGLEMENT", length=2,nullable=false)
    private java.lang.String trModeReglement;


	public DosReglementDefKey(Integer trNumDosDef, String trModeReglement) {
		super();
		this.trNumDosDef = trNumDosDef;
		this.trModeReglement = trModeReglement;
	}


	public DosReglementDefKey() {
		super();
		// TODO Auto-generated constructor stub
	}


	public java.lang.Integer getTrNumDosDef() {
		return trNumDosDef;
	}


	public void setTrNumDosDef(java.lang.Integer trNumDosDef) {
		this.trNumDosDef = trNumDosDef;
	}


	public java.lang.String getTrModeReglement() {
		return trModeReglement;
	}


	public void setTrModeReglement(java.lang.String trModeReglement) {
		this.trModeReglement = trModeReglement;
	}
	
	

}
