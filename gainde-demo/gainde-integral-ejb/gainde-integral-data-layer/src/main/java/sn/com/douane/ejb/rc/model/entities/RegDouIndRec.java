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

import sn.com.douane.ejb.rc.model.keys.RegDouIndRecKey;

@Entity
@IdClass(RegDouIndRecKey.class)
@Table(name="REGDOUINDREC")
public class RegDouIndRec implements Serializable {

	private static final long serialVersionUID = 7220264336745441046L;
	
	@Id
	@Column(name="RCTYPEREGIMEDOUANE", length=1, nullable=false)
	private String rcTypeRegime;
	
	@Id
	@Column(name="RCCODEREGIMEDOUANE", length=1, nullable=false)
	private String rcCodeRegimeDouanier; 
	
	@Id
	@Column(name="RCINDRECEVAB", length=15, nullable=false)
	private String rcIndRecevab;
	
	@Id
	@Column(name="RCDATEVALEUR", nullable=false)
    private Date rcDateValeur;
    
    @Column(name="RCDATECLOTURE", nullable=false)
    private Date rcDateCloture; 
    
    @ManyToOne(targetEntity = RegimeDouanier.class)
    @JoinColumns({
    	@JoinColumn(name="RCTYPEREGIMEDOUANE", referencedColumnName="rcTypeRegime",  updatable=false, insertable=false),
    	@JoinColumn(name="RCCODEREGIMEDOUANE", referencedColumnName="rcCodeRegimeDouanier",updatable=false, insertable=false)})
    private RegimeDouanier regDouRegInd;

    public RegDouIndRec() {
    	
    }
    
	public RegDouIndRec(String rcTypeRegime, String rcCodeRegimeDouanier,
			String rcIndRecevab, Date rcDateValeur) {
		super();
		this.rcTypeRegime = rcTypeRegime;
		this.rcCodeRegimeDouanier = rcCodeRegimeDouanier;
		this.rcIndRecevab = rcIndRecevab;
		this.rcDateValeur = rcDateValeur;
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

	public String getRcIndRecevab() {
		return rcIndRecevab;
	}

	public void setRcIndRecevab(String rcIndRecevab) {
		this.rcIndRecevab = rcIndRecevab;
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

	public RegimeDouanier getRegDouRegInd() {
		return regDouRegInd;
	}

	public void setRegDouRegInd(RegimeDouanier regDouRegInd) {
		this.regDouRegInd = regDouRegInd;
	}

}
