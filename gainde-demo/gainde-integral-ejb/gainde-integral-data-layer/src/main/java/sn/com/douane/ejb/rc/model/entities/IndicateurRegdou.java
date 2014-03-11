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

import sn.com.douane.ejb.rc.model.keys.IndicateurRegdouKey;
/**
 * 
 * @author nesrine
 *
 */
@Entity
@IdClass(IndicateurRegdouKey.class)
@Table(name="INDICATEURREGDOU")
public class IndicateurRegdou implements Serializable{

	private static final long serialVersionUID = -7568917002567946333L;

	@Id
	@Column(name="RCTYPEREGIME", length=1, nullable=false)
	private String rcTypeRegime;
	
	@Id
	@Column(name="RCCODEREGIMEDOUANIER", length=1, nullable=false)
	private String rcCodeRegimeDouanier; 
	
	@Id
	@Column(name="RCCODEINDICATEUR", length=15, nullable=false)
	private String rcCodeIndicateur;
	
	@Id
	@Column(name="RCDATEVALIDITE", nullable=false) 
	private Date rcDateValidite;
	
	@Column(name="RCDATECLOTURE")
	private Date rcDateCloture;
	
	@ManyToOne(targetEntity = Indicateur.class)
	@JoinColumn(name="rcCodeIndicateur", insertable=false, updatable=false)
	private Indicateur indIndRegdou;
	
	@ManyToOne(targetEntity = RegimeDouanier.class) 
	@JoinColumns({
    	@JoinColumn(name="RCTYPEREGIME", referencedColumnName="rcTypeRegime",  updatable=false, insertable=false),
    	@JoinColumn(name="RCCODEREGIMEDOUANIER", referencedColumnName="rcCodeRegimeDouanier",  updatable=false, insertable=false)})
	private RegimeDouanier regdouIndrRou;
	
	/**
	 * 0-args constructor
	 */
	public IndicateurRegdou(){
		
	}
	/**
	 * 
	 * @param rcTypeRegime
	 * @param rcCodeRegimeDouanier
	 * @param rcCodeIndicateur
	 * @param rcDateValidite
	 */
	public IndicateurRegdou(String rcTypeRegime, String rcCodeRegimeDouanier,
			String rcCodeIndicateur, Date rcDateValidite) {
		super();
		this.rcTypeRegime = rcTypeRegime;
		this.rcCodeRegimeDouanier = rcCodeRegimeDouanier;
		this.rcCodeIndicateur = rcCodeIndicateur;
		this.rcDateValidite = rcDateValidite; 
	}

	/**
	 * 
	 * @return
	 */
	 public Date getRcDateValidite() {
		return rcDateValidite;
	}
	 /**
	  * 
	  * @param rcDateValidite
	  */
	public void setRcDateValidite(Date rcDateValidite) {
		this.rcDateValidite = rcDateValidite;
	}
	/**
	 * 
	 * @return
	 */
	public Date getRcDateCloture() {
		return rcDateCloture;
	}
	/**
	 * 
	 * @param rcDateCloture
	 */
	public void setRcDateCloture(Date rcDateCloture) {
		this.rcDateCloture = rcDateCloture;
	}
	/**
	 * 
	 * @return
	 */
	public Indicateur getIndIndRegdou() {
		return indIndRegdou;
	}
	/**
	 * 
	 * @param indIndRegdou
	 */
	public void setIndIndRegdou(Indicateur indIndRegdou) {
		this.indIndRegdou = indIndRegdou;
	}
	/**
	 * 
	 * @return
	 */
	public RegimeDouanier getRegdouIndrRou() {
		return regdouIndrRou;
	}
	/**
	 * 
	 * @param regdouIndrRou
	 */
	public void setRegdouIndrRou(RegimeDouanier regdouIndrRou) {
		this.regdouIndrRou = regdouIndrRou;
	}
	/**
	 * 
	 * @return
	 */
	public String getRcTypeRegime() {
		return rcTypeRegime;
	}
	/**
	 * 
	 * @param rcTypeRegime
	 */
	public void setRcTypeRegime(String rcTypeRegime) {
		this.rcTypeRegime = rcTypeRegime;
	}
	/**
	 * 
	 * @return
	 */
	public String getRcCodeRegimeDouanier() {
		return rcCodeRegimeDouanier;
	}
	/**
	 * 
	 * @param rcCodeRegimeDouanier
	 */
	public void setRcCodeRegimeDouanier(String rcCodeRegimeDouanier) {
		this.rcCodeRegimeDouanier = rcCodeRegimeDouanier;
	}
	/**
	 * 
	 * @return
	 */
	public String getRcCodeIndicateur() {
		return rcCodeIndicateur;
	}
	/**
	 * 
	 * @param rcCodeIndicateur
	 */
	public void setRcCodeIndicateur(String rcCodeIndicateur) {
		this.rcCodeIndicateur = rcCodeIndicateur;
	}
	
}
