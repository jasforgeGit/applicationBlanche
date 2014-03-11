package sn.com.douane.ejb.rc.model.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import sn.com.douane.ejb.rc.model.keys.RegimeDeclarantKey;

@Entity
@IdClass(RegimeDeclarantKey.class)
@Table(name="REGIMEDECLARANT")
public class RegimeDeclarant implements Serializable{

	private static final long serialVersionUID = 2773107799816239744L;

	@Id
	@Column(name="RCTYPEREGIME", length=1, nullable=false)
	private String rcTypeRegime;

	@Id
	@Column(name="RCREGIMEDOUANIER", length=1, nullable=false)
	private String rcRegimeDouanier;
	    
	@Id
	@Column(name="RCREGIMEFISCAL", length=1, nullable=false)
	private String rcRegimeFiscal;
	
	@Id
	@Column(name="RCCODEPPM", length=1, nullable=false)
	private String rcCodePpm; 
	    
	@ManyToOne(targetEntity = Ppm.class)
	@JoinColumn(name="RCCODEPPM", insertable=false, updatable=false)
	private Ppm ppmRegDecl;

	
	public RegimeDeclarant() {
	}

	public RegimeDeclarant(String rcTypeRegime, String rcRegimeDouanier,
			String rcRegimeFiscal, String rcCodePpm) {
		super();
		this.rcTypeRegime = rcTypeRegime;
		this.rcRegimeDouanier = rcRegimeDouanier;
		this.rcRegimeFiscal = rcRegimeFiscal;
		this.rcCodePpm = rcCodePpm;
	}

	public String getRcTypeRegime() {
		return rcTypeRegime;
	}

	public void setRcTypeRegime(String rcTypeRegime) {
		this.rcTypeRegime = rcTypeRegime;
	}

	public String getRcRegimeDouanier() {
		return rcRegimeDouanier;
	}

	public void setRcRegimeDouanier(String rcRegimeDouanier) {
		this.rcRegimeDouanier = rcRegimeDouanier;
	}

	public String getRcRegimeFiscal() {
		return rcRegimeFiscal;
	}

	public void setRcRegimeFiscal(String rcRegimeFiscal) {
		this.rcRegimeFiscal = rcRegimeFiscal;
	}

	public Ppm getPpmRegDecl() {
		return ppmRegDecl;
	}

	public void setPpmRegDecl(Ppm ppmRegDecl) {
		this.ppmRegDecl = ppmRegDecl;
	}

	public String getRcCodePpm() {
		return rcCodePpm;
	}

	public void setRcCodePpm(String rcCodePpm) {
		this.rcCodePpm = rcCodePpm;
	}
	
}
