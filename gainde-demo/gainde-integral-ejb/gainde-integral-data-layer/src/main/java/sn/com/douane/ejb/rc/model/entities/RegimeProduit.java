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

import sn.com.douane.ejb.rc.model.keys.RegimeProduitKey;
/**
 * 
 * @author nesrine
 *
 */
@Entity
@IdClass(RegimeProduitKey.class)
@Table(name="REGIMEPRODUIT")
public class RegimeProduit implements Serializable{

	private static final long serialVersionUID = 4948010457257669976L;
    
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
	@Column(name="RCCODEPROD", length=6, nullable=false)
    private String rcCodeProd;
	
	@Id
	@Column(name="RCPRECUEMOA", length=2, nullable=false)
    private String rcPrecuemoa;
    
	@Id
	@Column(name="RCPRECSENEGAL", length=2, nullable=false)
    private String rcPrecSenegal;

    @ManyToOne(targetEntity = Produit.class)
    @JoinColumns({
    	@JoinColumn(name="RCCODEPROD", updatable=false, insertable=false),
    	@JoinColumn(name="RCPRECUEMOA", updatable=false, insertable=false),
    	@JoinColumn(name="RCPRECSENEGAL", updatable=false, insertable=false)})
    private Produit prodRegProd;
    
    @ManyToOne(targetEntity = Regime.class)
    @JoinColumns({
    	@JoinColumn(name="RCTYPEREGIME", updatable=false, insertable=false),
    	@JoinColumn(name="RCCODEREGIMEDOUANIER", updatable=false, insertable=false),
    	@JoinColumn(name="RCCODEREGIMEFISCAL", updatable=false, insertable=false)})
    private Regime regRegProd;
    
	public RegimeProduit() {
	}

	public RegimeProduit(String rcTypeRegime, String rcCodeRegimeDouanier,
			String rcCodeRegimeFiscal, String rcCodeProd, String rcPrecuemoa,
			String rcPrecSenegal) {
		super();
		this.rcTypeRegime = rcTypeRegime;
		this.rcCodeRegimeDouanier = rcCodeRegimeDouanier;
		this.rcCodeRegimeFiscal = rcCodeRegimeFiscal;
		this.rcCodeProd = rcCodeProd;
		this.rcPrecuemoa = rcPrecuemoa;
		this.rcPrecSenegal = rcPrecSenegal;
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

	public String getRcCodeProd() {
		return rcCodeProd;
	}

	public void setRcCodeProd(String rcCodeProd) {
		this.rcCodeProd = rcCodeProd;
	}

	public String getRcPrecuemoa() {
		return rcPrecuemoa;
	}

	public void setRcPrecuemoa(String rcPrecuemoa) {
		this.rcPrecuemoa = rcPrecuemoa;
	}

	public String getRcPrecSenegal() {
		return rcPrecSenegal;
	}

	public void setRcPrecSenegal(String rcPrecSenegal) {
		this.rcPrecSenegal = rcPrecSenegal;
	}

	public Produit getProdRegProd() {
		return prodRegProd;
	}

	public void setProdRegProd(Produit prodRegProd) {
		this.prodRegProd = prodRegProd;
	}

	public Regime getRegRegProd() {
		return regRegProd;
	}

	public void setRegRegProd(Regime regRegProd) {
		this.regRegProd = regRegProd;
	}
	

}
