package sn.com.douane.ejb.rc.model.entities;

import java.io.Serializable;
import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import sn.com.douane.ejb.rc.model.keys.IndicateurRegimeKey;
/**
 * 
 * @author nesrine
 *
 */
@Entity
@IdClass(IndicateurRegimeKey.class)
@Table(name="INDICATEURREGIME")
public class IndicateurRegime implements Serializable{

	private static final long serialVersionUID = 3520020307925116680L;
	
	@Id
	@Column(name="RCTYPEREGIME", length=1,  nullable=false)
	private String rcTypeRegime;
	
	@Id
	@Column(name="RCCODEREGIMEDOUANIER", length=1,  nullable=false)
	private String rcCodeRegimeDouanier;
	
	@Id
	@Column(name="RCCODEREGIMEFISCAL", length=2,  nullable=false)
	private String rcCodeRegimeFiscal;
	
	@Id
	@Column(name="RCCODEINDICATEUR", length=15,  nullable=false)
	private String rcCodeIndicateur; 
	
	@Id
	@Column(name="RCDATEVALIDITE", nullable=false)
	private Date rcDateValidite;
    
	@Column(name="RCDATECLOTURE")
	private Date rcDateCloture;
	
	@ManyToOne(targetEntity = Indicateur.class)
	@JoinColumn(name="RCCODEINDICATEUR", insertable=false, updatable=false)
	private Indicateur indIndRegime;	
	
	@ManyToOne(targetEntity = Regime.class)
	@JoinColumns({
    	@JoinColumn(name="RCTYPEREGIME", referencedColumnName="rcTypeRegime", updatable=false, insertable=false),
    	@JoinColumn(name="RCCODEREGIMEDOUANIER", referencedColumnName="rcCodeRegimeDouanier",  updatable=false, insertable=false),
    	@JoinColumn(name="RCCODEREGIMEFISCAL", referencedColumnName="rcCodeRegimeFiscal", updatable=false, insertable=false)})
	private Regime regimeIndReg;    

	/**
	 * 
	 */
	public IndicateurRegime() {
	}

	/**
	 * 
	 * @param rcTypeRegime
	 * @param rcCodeRegimeDouanier
	 * @param rcCodeRegimeFiscal
	 * @param rcCodeIndicateur
	 * @param rcDateValidite
	 */
	public IndicateurRegime(String rcTypeRegime, String rcCodeRegimeDouanier,
		String rcCodeRegimeFiscal, String rcCodeIndicateur, Date rcDateValidite) {
		super();
		this.rcTypeRegime = rcTypeRegime;
		this.rcCodeRegimeDouanier = rcCodeRegimeDouanier;
		this.rcCodeRegimeFiscal = rcCodeRegimeFiscal;
		this.rcCodeIndicateur = rcCodeIndicateur;
		this.rcDateValidite = rcDateValidite;
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

	public String getRcCodeIndicateur() {
		return rcCodeIndicateur;
	}

	public void setRcCodeIndicateur(String rcCodeIndicateur) {
		this.rcCodeIndicateur = rcCodeIndicateur;
	}

	public Date getRcDateValidite() {
		return rcDateValidite;
	}

	public void setRcDateValidite(Date rcDateValidite) {
		this.rcDateValidite = rcDateValidite;
	}

	public Date getRcDateCloture() {
		return rcDateCloture;
	}

	public void setRcDateCloture(Date rcDateCloture) {
		this.rcDateCloture = rcDateCloture;
	}

	public Indicateur getIndIndRegime() {
		return indIndRegime;
	}

	public void setIndIndRegime(Indicateur indIndRegime) {
		this.indIndRegime = indIndRegime;
	}

	public Regime getRegimeIndReg() {
		return regimeIndReg;
	}

	public void setRegimeIndReg(Regime regimeIndReg) {
		this.regimeIndReg = regimeIndReg;
	}
    
}
