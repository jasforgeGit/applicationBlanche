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

import sn.com.douane.ejb.rc.model.keys.RegimeDestinataireKey;
/**
 * 
 * @author nesrine
 *
 */
@Entity
@IdClass(RegimeDestinataireKey.class)
@Table(name="REGIMEDESTINATAIRE")
public class RegimeDestinataire implements Serializable{

	private static final long serialVersionUID = 5529515673713127437L;
	
	@Id
	@Column(name="RCTYPEREGIME", length=1, nullable=false)
	private String rcTypeRegime;	
	
	@Id
	@Column(name="RCCODEREGIMEDOUANIER", length=1, nullable=false)
	private String rcCodeRegimeDouanier;
	
	@Id
	@Column(name="RCCODEREGIMEFISCAL", length=2, nullable=false)
	private String rcCodeRegimeFiscal;
	
	@Id
	@Column(name="RCCODEPPM", length=5, nullable=false)
	private String rcCodePpm;
		
	@ManyToOne(targetEntity = Ppm.class)
	@JoinColumn(name="RCCODEPPM", updatable=false, insertable=false)
	private Ppm ppmRegimeDest;
	
	@ManyToOne(targetEntity = Regime.class)
	@JoinColumns({
    	@JoinColumn(name="RCTYPEREGIME",referencedColumnName="rcTypeRegime",  updatable=false, insertable=false),
    	@JoinColumn(name="RCCODEREGIMEDOUANIER",referencedColumnName="rcCodeRegimeDouanier",  updatable=false, insertable=false),
    	@JoinColumn(name="RCCODEREGIMEFISCAL", referencedColumnName="rcCodeRegimeFiscal",  updatable=false, insertable=false)})
	private Regime regimeRegDest;
	
	/**
	 * 
	 */
	public RegimeDestinataire() {
		
	}
	
	/**
	 * 
	 * @param rcTypeRegime
	 * @param rcCodeRegimeDouanier
	 * @param rcCodeRegimeFiscal
	 * @param rcCodePpm
	 */
	public RegimeDestinataire(String rcTypeRegime, String rcCodeRegimeDouanier,
			String rcCodeRegimeFiscal, String rcCodePpm) {
		super();
		this.rcTypeRegime = rcTypeRegime;
		this.rcCodeRegimeDouanier = rcCodeRegimeDouanier;
		this.rcCodeRegimeFiscal = rcCodeRegimeFiscal;
		this.rcCodePpm = rcCodePpm;
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

	public String getRcCodeRegimeFiscal() {
		return rcCodeRegimeFiscal;
	}

	public void setRcCodeRegimeFiscal(String rcCodeRegimeFiscal) {
		this.rcCodeRegimeFiscal = rcCodeRegimeFiscal;
	}

	public String getRcCodePpm() {
		return rcCodePpm;
	}

	public void setRcCodePpm(String rcCodePpm) {
		this.rcCodePpm = rcCodePpm;
	}

	public Ppm getPpmRegimeDest() {
		return ppmRegimeDest;
	}

	public void setPpmRegimeDest(Ppm ppmRegimeDest) {
		this.ppmRegimeDest = ppmRegimeDest;
	}

	public Regime getRegimeRegDest() {
		return regimeRegDest;
	}

	public void setRegimeRegDest(Regime regimeRegDest) {
		this.regimeRegDest = regimeRegDest;
	}

}
