package sn.com.douane.ejb.rc.model.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id; 
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;

import javax.persistence.IdClass;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import sn.com.douane.ejb.rc.model.keys.TypeApureRegInterditKey;

@Entity
@IdClass(TypeApureRegInterditKey.class)
@Table(name="TYPEAPURREGINTERDIT")
public class TypeApurRegInterdit implements Serializable{

	private static final long serialVersionUID = 2350419647900898634L;
	
	@Id
	@Column(name="RCTYPEAPUREMENT", length=1, nullable=false)
	private String rcTypeApurement;
	
	@Id
	@Column(name="RCTYPEREGIME", length=1, nullable=false)
	private String rcTypeRegime;
	
	@Id
	@Column(name="RCREGIMEDOUANIER", length=1, nullable=false)
	private String rcCodeRegimeDouanier;
	
	@ManyToOne(targetEntity = RegimeDouanier.class)
	@JoinColumns({
    	@JoinColumn(name="RCTYPEREGIME",referencedColumnName="rcTypeRegime",  updatable=false, insertable=false),
    	@JoinColumn(name="RCREGIMEDOUANIER",referencedColumnName="rcCodeRegimeDouanier", updatable=false, insertable=false)})
	private RegimeDouanier regTypApReg;

	
	public TypeApurRegInterdit() {
	}

	public TypeApurRegInterdit(String rcTypeApurement, String rcTypeRegime,
			String rcCodeRegimeDouanier) {
		super();
		this.rcTypeApurement = rcTypeApurement;
		this.rcTypeRegime = rcTypeRegime;
		this.rcCodeRegimeDouanier = rcCodeRegimeDouanier;
	}

	public String getRcTypeApurement() {
		return rcTypeApurement;
	}

	public void setRcTypeApurement(String rcTypeApurement) {
		this.rcTypeApurement = rcTypeApurement;
	}

	public String getRcTypeRegime() {
		return rcTypeRegime;
	}

	public void setRcTypeRegime(String rcTypeRegime) {
		this.rcTypeRegime = rcTypeRegime;
	}

	public String getRcCodeRegimeDouanier() {
		return rcCodeRegimeDouanier;
	}

	public void setRcCodeRegimeDouanier(String rcCodeRegimeDouanier) {
		this.rcCodeRegimeDouanier = rcCodeRegimeDouanier;
	}

	public RegimeDouanier getRegTypApReg() {
		return regTypApReg;
	}

	public void setRegTypApReg(RegimeDouanier regTypApReg) {
		this.regTypApReg = regTypApReg;
	}	

}
