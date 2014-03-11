package sn.com.douane.ejb.rc.model.entities;

import java.io.Serializable;
import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import sn.com.douane.ejb.rc.model.keys.DispTRegimeInterditKey;
/**
 * 
 * @author nesrine
 *
 */
@Entity
@IdClass(DispTRegimeInterditKey.class)
@Table(name="DISPTREGIMINTERDIT")
public class DispTRegimeInterdit implements Serializable{

	private static final long serialVersionUID = -8512513822102240186L;
	
	@Id
	@Column(name="RCCODEDISPENSE", length=5, nullable=false)
	private String rcCodeDispense;
	
	@Id
	@Column(name="RCTYPEREGIME", length=1, nullable=false)
	private String rcTypeRegime;
	 
	@Id
	@Column(name="RCDATEVALEUR", nullable=false)
	private Date rcDateValeur;
	
	@Column(name="RCDATECLOTURE")
    private Date rcDateCloture;
  
	@ManyToOne(targetEntity = Dispense.class)
	@JoinColumn(name="RCCODEDISPENSE", insertable=false, updatable=false)
    private Dispense dispDTRInterd;
    
	@ManyToOne(targetEntity = TypeRegimeDouane.class)
	@JoinColumn(name="RCTYPEREGIME", insertable=false, updatable=false)
    private TypeRegimeDouane tRegDTRInterd;

	/**
	 * 
	 */
	public DispTRegimeInterdit() {
	}

	/**
	 * 
	 * @param rcCodeDispense
	 * @param rcTypeRegime
	 * @param rcDateValeur
	 */
	public DispTRegimeInterdit(String rcCodeDispense, String rcTypeRegime,
			Date rcDateValeur) {
		super();
		this.rcCodeDispense = rcCodeDispense;
		this.rcTypeRegime = rcTypeRegime;
		this.rcDateValeur = rcDateValeur;
	}

	public String getRcCodeDispense() {
		return rcCodeDispense;
	}

	public void setRcCodeDispense(String rcCodeDispense) {
		this.rcCodeDispense = rcCodeDispense;
	}

	public String getRcTypeRegime() {
		return rcTypeRegime;
	}

	public void setRcTypeRegime(String rcTypeRegime) {
		this.rcTypeRegime = rcTypeRegime;
	}

	public Date getRcDateValeur() {
		return rcDateValeur;
	}

	public void setRcDateValeur(Date rcDateValeur) {
		this.rcDateValeur = rcDateValeur;
	}

	public Date getRcDateCloture() {
		return rcDateCloture;
	}

	public void setRcDateCloture(Date rcDateCloture) {
		this.rcDateCloture = rcDateCloture;
	}

	public Dispense getDispDTRInterd() {
		return dispDTRInterd;
	}

	public void setDispDTRInterd(Dispense dispDTRInterd) {
		this.dispDTRInterd = dispDTRInterd;
	}

	public TypeRegimeDouane gettRegDTRInterd() {
		return tRegDTRInterd;
	}

	public void settRegDTRInterd(TypeRegimeDouane tRegDTRInterd) {
		this.tRegDTRInterd = tRegDTRInterd;
	}

}
