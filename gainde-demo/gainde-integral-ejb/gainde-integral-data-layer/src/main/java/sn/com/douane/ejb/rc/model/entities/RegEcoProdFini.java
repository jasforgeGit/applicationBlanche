package sn.com.douane.ejb.rc.model.entities;

import java.io.Serializable;
import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery; 
import javax.persistence.Table;

import sn.com.douane.ejb.rc.model.keys.RegEcoProdFiniKey;
/**
 * 
 * @author nesrine
 *
 */
@Entity
@IdClass(RegEcoProdFiniKey.class)
@NamedQueries(
	@NamedQuery(name = "findByRegimeDlpp", 
	query = "select object(o) from RegEcoProdFini o " +
			"where  o.rcCodePpm = ?1 and  o.rcAnneeRegEco = ?2 " +
			"and  o.rcNumRegEco = ?3 and  o.rcCodeProd = ?4 " +
			"and  o.rcPrecUemoa = ?5 and  o.rcPrecSen = ?6"))
@Table(name="REGECOPRODFINI")
public class RegEcoProdFini implements Serializable{

	private static final long serialVersionUID = 332516950289896902L;

	@Id
	@Column(name="RCCODEPPM", length=5, nullable=false)
	private String rcCodePpm;
	
	@Id
	@Column(name="RCANNEEREGECO", length=4, nullable=false)
    private String rcAnneeRegEco;
    
	@Id
	@Column(name="RCNUMREGECO", length=6, nullable=false)
    private String rcNumRegEco;
    
	@Id
	@Column(name="RCCODEPROD", length=6, nullable=false)
    private String rcCodeProd;
    
	@Id
	@Column(name="RCPRECUEMOA", length=2, nullable=false)
    private String rcPrecUemoa;
    
	@Id
	@Column(name="RCPRECSEN", length=2, nullable=false)
    private String rcPrecSen;
    
	@Id
	@Column(name="RCNUMGAMME", nullable=false)
    private Integer rcNumGamme;
    
	@Column(name="RCNATURERENDEMENT", length=2)
    private String rcNatureRendement;
    
	@Column(name="RCQTEUNITAIRE", columnDefinition="DECIMAL(9,0)")
    private BigDecimal rcQteUnitaire;
    
    @Column(name="RCUNITEMESURE", length=3)
    private String rcUniteMesure;
    
    @Column(name="RCNBREMATPREMIERES")
    private Integer rcNbreMatPremieres;
    
	public RegEcoProdFini() {

	}

	public RegEcoProdFini(String rcCodePpm, String rcAnneeRegEco,
			String rcNumRegEco, String rcCodeProd, String rcPrecUemoa,
			String rcPrecSen, Integer rcNumGamme) {
		super();
		this.rcCodePpm = rcCodePpm;
		this.rcAnneeRegEco = rcAnneeRegEco;
		this.rcNumRegEco = rcNumRegEco;
		this.rcCodeProd = rcCodeProd;
		this.rcPrecUemoa = rcPrecUemoa;
		this.rcPrecSen = rcPrecSen;
		this.rcNumGamme = rcNumGamme;
	}

	public String getRcCodePpm() {
		return rcCodePpm;
	}

	public void setRcCodePpm(String rcCodePpm) {
		this.rcCodePpm = rcCodePpm;
	}

	public String getRcAnneeRegEco() {
		return rcAnneeRegEco;
	}

	public void setRcAnneeRegEco(String rcAnneeRegEco) {
		this.rcAnneeRegEco = rcAnneeRegEco;
	}

	public String getRcNumRegEco() {
		return rcNumRegEco;
	}

	public void setRcNumRegEco(String rcNumRegEco) {
		this.rcNumRegEco = rcNumRegEco;
	}

	public String getRcCodeProd() {
		return rcCodeProd;
	}

	public void setRcCodeProd(String rcCodeProd) {
		this.rcCodeProd = rcCodeProd;
	}

	public String getRcPrecUemoa() {
		return rcPrecUemoa;
	}

	public void setRcPrecUemoa(String rcPrecUemoa) {
		this.rcPrecUemoa = rcPrecUemoa;
	}

	public String getRcPrecSen() {
		return rcPrecSen;
	}

	public void setRcPrecSen(String rcPrecSen) {
		this.rcPrecSen = rcPrecSen;
	}

	public Integer getRcNumGamme() {
		return rcNumGamme;
	}

	public void setRcNumGamme(Integer rcNumGamme) {
		this.rcNumGamme = rcNumGamme;
	}

	public String getRcNatureRendement() {
		return rcNatureRendement;
	}

	public void setRcNatureRendement(String rcNatureRendement) {
		this.rcNatureRendement = rcNatureRendement;
	}

	public BigDecimal getRcQteUnitaire() {
		return rcQteUnitaire;
	}

	public void setRcQteUnitaire(BigDecimal rcQteUnitaire) {
		this.rcQteUnitaire = rcQteUnitaire;
	}

	public String getRcUniteMesure() {
		return rcUniteMesure;
	}

	public void setRcUniteMesure(String rcUniteMesure) {
		this.rcUniteMesure = rcUniteMesure;
	}

	public Integer getRcNbreMatPremieres() {
		return rcNbreMatPremieres;
	}

	public void setRcNbreMatPremieres(Integer rcNbreMatPremieres) {
		this.rcNbreMatPremieres = rcNbreMatPremieres;
	}
    

}
