package sn.com.douane.ejb.rc.model.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import sn.com.douane.ejb.rc.model.keys.RegapuregapureKey;
/**
 * 
 * @author nesrine
 *
 */
@Entity
@IdClass(RegapuregapureKey.class)
@Table(name="REGAPUREGAPURE")
public class Regapuregapure implements Serializable{

	private static final long serialVersionUID = -5028056622745406927L;
	
	@Id
	@Column(name="RCTYPEREGAPURE", length=1, nullable=false)
	private String rcTypeRegApure;
	 
	@Id
	@Column(name="RCREGDOUAPURE", length=1, nullable=false)
	private String rcRegDouApure; 
	
	@Id
	@Column(name="RCTYPEREGAPURANT", length=1, nullable=false)
	private String rcTypeRegApurant;
	
	@Id
	@Column(name="RCREGDOUAPURANT", length=1, nullable=false)
	private String rcRegDouApurant; 
	 
	@ManyToOne(targetEntity = RegimeDouanier.class)
	@JoinColumns({
    	@JoinColumn(name="RCTYPEREGAPURE",referencedColumnName="rcTypeRegime", updatable=false, insertable=false),
    	@JoinColumn(name="RCREGDOUAPURE", referencedColumnName="rcCodeRegimeDouanier", updatable=false, insertable=false)})
	private RegimeDouanier regRegApu;
	 
	@ManyToOne(targetEntity = RegimeDouanier.class)
	@JoinColumns({
    	@JoinColumn(name="RCTYPEREGAPURANT", referencedColumnName="rcTypeRegime", updatable=false, insertable=false),
    	@JoinColumn(name="RCREGDOUAPURANT", referencedColumnName="rcCodeRegimeDouanier",  updatable=false, insertable=false)})
	private RegimeDouanier regRegApure;

	
	public Regapuregapure() {
	}

	public Regapuregapure(String rcTypeRegApure, String rcRegDouApure,
			String rcTypeRegApurant, String rcRegDouApurant) {
		super();
		this.rcTypeRegApure = rcTypeRegApure;
		this.rcRegDouApure = rcRegDouApure;
		this.rcTypeRegApurant = rcTypeRegApurant;
		this.rcRegDouApurant = rcRegDouApurant;
	}

	public String getRcTypeRegApure() {
		return rcTypeRegApure;
	}

	public void setRcTypeRegApure(String rcTypeRegApure) {
		this.rcTypeRegApure = rcTypeRegApure;
	}

	public String getRcRegDouApure() {
		return rcRegDouApure;
	}

	public void setRcRegDouApure(String rcRegDouApure) {
		this.rcRegDouApure = rcRegDouApure;
	}

	public String getRcTypeRegApurant() {
		return rcTypeRegApurant;
	}

	public void setRcTypeRegApurant(String rcTypeRegApurant) {
		this.rcTypeRegApurant = rcTypeRegApurant;
	}

	public String getRcRegDouApurant() {
		return rcRegDouApurant;
	}

	public void setRcRegDouApurant(String rcRegDouApurant) {
		this.rcRegDouApurant = rcRegDouApurant;
	}

	public RegimeDouanier getRegRegApu() {
		return regRegApu;
	}

	public void setRegRegApu(RegimeDouanier regRegApu) {
		this.regRegApu = regRegApu;
	}

	public RegimeDouanier getRegRegApure() {
		return regRegApure;
	}

	public void setRegRegApure(RegimeDouanier regRegApure) {
		this.regRegApure = regRegApure;
	}

}
