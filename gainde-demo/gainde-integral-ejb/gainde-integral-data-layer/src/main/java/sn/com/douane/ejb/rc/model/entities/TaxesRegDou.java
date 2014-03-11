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

import sn.com.douane.ejb.rc.model.keys.TaxesRegDouKey;
/**
 * 
 * @author nesrine
 *
 */
@Entity
@IdClass(TaxesRegDouKey.class)
@Table(name="TAXESREGDOU")
public class TaxesRegDou implements Serializable{

	private static final long serialVersionUID = -7153210357668517920L;

	@Id
	@Column(name="RCCODETAXE", length=2, nullable=false)
	private  String rcCodeTaxe; 
	
	@Id
	@Column(name="RCTYPEREGIME", length=1, nullable=false)
	private String rcTypeRegime;
	
	@Id
	@Column(name="RCCODEREGIMEDOUNIER", length=1, nullable=false)
	private String rcCodeRegimeDouanier; 
	
	@Id
	@Column(name="RCDATEVALEUR", nullable=false)
	private Date rcDateValeur;
	
	@Column(name="RCDATECLOTURE")
    private Date rcDateCloture;
    
	@Column(name="RCCODETAUX", length=3, nullable=false)
    private String rcCodeTaux;   
    
    @ManyToOne(targetEntity = Taxe.class)
    @JoinColumn(name="RCCODETAXE", updatable=false, insertable=false)
    private Taxe taxTxRegDou;
    
    @ManyToOne(targetEntity = RegimeDouanier.class)
    @JoinColumns({
    	@JoinColumn(name="RCTYPEREGIME", referencedColumnName="rcTypeRegime", updatable=false, insertable=false),
    	@JoinColumn(name="RCCODEREGIMEDOUNIER", referencedColumnName="rcCodeRegimeDouanier",  updatable=false, insertable=false)})
    private RegimeDouanier regDouTaxes;

    public TaxesRegDou() {
    	
    }
    
    /**
     * 
     * @param rcCodeTaxe
     * @param rcTypeRegime
     * @param rcCodeRegimeDouanier
     * @param rcDateValeur
     * @param rcCodeTaux
     */
	public TaxesRegDou(String rcCodeTaxe, String rcTypeRegime,
			String rcCodeRegimeDouanier, Date rcDateValeur, String rcCodeTaux) {
		super();
		this.rcCodeTaxe = rcCodeTaxe;
		this.rcTypeRegime = rcTypeRegime;
		this.rcCodeRegimeDouanier = rcCodeRegimeDouanier;
		this.rcDateValeur = rcDateValeur;
		this.rcCodeTaux = rcCodeTaux;
	}

	public String getRcCodeTaxe() {
		return rcCodeTaxe;
	}

	public void setRcCodeTaxe(String rcCodeTaxe) {
		this.rcCodeTaxe = rcCodeTaxe;
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

	public String getRcCodeTaux() {
		return rcCodeTaux;
	}

	public void setRcCodeTaux(String rcCodeTaux) {
		this.rcCodeTaux = rcCodeTaux;
	}

	public Taxe getTaxTxRegDou() {
		return taxTxRegDou;
	}

	public void setTaxTxRegDou(Taxe taxTxRegDou) {
		this.taxTxRegDou = taxTxRegDou;
	}

	public RegimeDouanier getRegDouTaxes() {
		return regDouTaxes;
	}

	public void setRegDouTaxes(RegimeDouanier regDouTaxes) {
		this.regDouTaxes = regDouTaxes;
	}
    
}
