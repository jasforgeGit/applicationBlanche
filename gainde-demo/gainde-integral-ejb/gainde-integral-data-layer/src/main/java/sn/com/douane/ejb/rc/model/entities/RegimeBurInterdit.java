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
import javax.persistence.Version;

import sn.com.douane.ejb.rc.model.keys.RegimeBurInterditKey;

/**
 * RegeCoprodFiniBur EJB3 Entity Bean.
 * 
 * @author Wadii
 */
@Entity
@Table(name = "RegimeBurInterdit")
@IdClass(RegimeBurInterditKey.class)
public class RegimeBurInterdit implements Serializable {

	private static final long serialVersionUID = -4556334850149761661L;

	@Id
	@Column(name = "RCTYPEREGIME", length=1, nullable=false)	
	private String rcTypeRegime;
	
	@Id
	@Column(name = "RCCODEBUREAU", length=3, nullable=false)	
	private String rcCodeBurDouane;

	@Id
	@Column(name = "RCREGIMEDOUANIER", length=1, nullable=false)	
	private String rcCodeRegimeDouanier;	
	
	@ManyToOne(targetEntity=BureauDouane.class)
	@JoinColumn(name = "RCCODEBUREAU", insertable=false, updatable=false, referencedColumnName="rccodeburdouane")
    private BureauDouane burburinterdit;
    
	@ManyToOne(targetEntity = RegimeDouanier.class)
	@JoinColumns({
		@JoinColumn(name="RCTYPEREGIME",referencedColumnName="rcTypeRegime", insertable=false, updatable=false),
		@JoinColumn(name="RCREGIMEDOUANIER", referencedColumnName="rcCodeRegimeDouanier", insertable=false, updatable=false)
	})
    private RegimeDouanier regDouBurInt;    	
	
	/**
	 * Enable JPA optimstic lock.
	 */
//	@SuppressWarnings("unused")
//	@Version
//	@Column(nullable = false)
//	private int version;

    public RegimeBurInterdit() { }
   
    public RegimeBurInterdit(String rcTypeRegime, String rcCodeBurDouane,
			String rcCodeRegimeDouanier) {
		super();
		this.rcTypeRegime = rcTypeRegime;
		this.rcCodeBurDouane = rcCodeBurDouane;
		this.rcCodeRegimeDouanier = rcCodeRegimeDouanier;
	}




	public RegimeDouanier getRegDouBurInt() {
		return regDouBurInt;
	}

	public void setRegDouBurInt(RegimeDouanier regDouBurInt) {
		this.regDouBurInt = regDouBurInt;
	}

	public BureauDouane getBurburinterdit() {
		return burburinterdit;
	}

	public void setBurburinterdit(BureauDouane burburinterdit) {
		this.burburinterdit = burburinterdit;
	}

	public String getRcTypeRegime() {
		return rcTypeRegime;
	}


	public void setRcTypeRegime(String rcTypeRegime) {
		this.rcTypeRegime = rcTypeRegime;
	}


	public String getRcCodeBurDouane() {
		return rcCodeBurDouane;
	}


	public void setRcCodeBurDouane(String rcCodeBurDouane) {
		this.rcCodeBurDouane = rcCodeBurDouane;
	}


	public String getRcCodeRegimeDouanier() {
		return rcCodeRegimeDouanier;
	}


	public void setRcCodeRegimeDouanier(String rcCodeRegimeDouanier) {
		this.rcCodeRegimeDouanier = rcCodeRegimeDouanier;
	}
}
