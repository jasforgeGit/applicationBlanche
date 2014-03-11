package sn.com.douane.ejb.rc.model.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.JoinColumn;
import javax.persistence.Table;

import sn.com.douane.ejb.rc.model.keys.BasesTaxableKey;


@Entity
@IdClass(BasesTaxableKey.class)
@Table(name="BASESTAXABLES")
public class BasesTaxable implements Serializable{
	
	
	private static final long serialVersionUID = -1592442751678569182L;

	@Id
	@Column(name = "RCCODETAXE",length = 2,nullable = false)
	private String rcCodeTaxe;	
	
	@Id
	@Column(name = "RCCODETAXEBASE",length = 2,nullable = false)
	private String rcCodeTaxeBase;	
	
	@Column(name = "RCORDRECALCUL",nullable = false)
	private Integer rcOrdreCalcul;
	
	@javax.persistence.ManyToOne(targetEntity = Taxe.class)
    @JoinColumn(name = "RCCODETAXE",insertable = false,updatable = false)
	private Taxe refTaxe;
	
	@javax.persistence.ManyToOne(targetEntity = Taxe.class)
    @JoinColumn(name = "RCCODETAXEBASE",insertable = false,updatable = false)
	private Taxe cumulTaxe;
	
	public BasesTaxable(){
		
	}	
	
	public BasesTaxable(String codeTaxe,String codeTaxeBase) {
		super(); 
		this.rcCodeTaxe = codeTaxe;
		this.rcCodeTaxeBase = codeTaxeBase;
	}

	public BasesTaxable(String codeTaxe,String codeTaxeBase,Integer ordreCalcul) {
		super(); 
		this.rcCodeTaxe = codeTaxe;
		this.rcCodeTaxeBase = codeTaxeBase;
		this.rcOrdreCalcul = ordreCalcul;
	}


	public String getRcCodeTaxe() {
		return rcCodeTaxe;
	}


	public void setRcCodeTaxe(String rcCodeTaxe) {
		this.rcCodeTaxe = rcCodeTaxe;
	}


	public String getRcCodeTaxeBase() {
		return rcCodeTaxeBase;
	}


	public void setRcCodeTaxeBase(String rcCodeTaxeBase) {
		this.rcCodeTaxeBase = rcCodeTaxeBase;
	}


	public Integer getRcOrdreCalcul() {
		return rcOrdreCalcul;
	}


	public void setRcOrdreCalcul(Integer rcOrdreCalcul) {
		this.rcOrdreCalcul = rcOrdreCalcul;
	}

	public Taxe getRefTaxe() {
		return refTaxe;
	}

	public void setRefTaxe(Taxe refTaxe) {
		this.refTaxe = refTaxe;
	}

	public Taxe getCumulTaxe() {
		return cumulTaxe;
	}

	public void setCumulTaxe(Taxe cumulTaxe) {
		this.cumulTaxe = cumulTaxe;
	}
	
	
	
	
	

}
