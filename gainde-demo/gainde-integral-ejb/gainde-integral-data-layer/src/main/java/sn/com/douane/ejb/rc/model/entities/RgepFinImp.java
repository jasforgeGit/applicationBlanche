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

import sn.com.douane.ejb.rc.model.keys.RgepFinImpKey;
/**
 * 
 * @author nesrine
 *
 */
@Entity
@IdClass(RgepFinImpKey.class)
@NamedQueries(@NamedQuery(name = "findControlProduitFini", 
	query = "select object(o) from RgepFinImp o " +
			"where  o.rcCodePpm = ?1 and  o.rcAnneeRegEco = ?2 " +
			"and  o.rcNumRegEco = ?3 and  o.rcCodeProd = ?4 " +
			"and  o.rcPrecUemoa = ?5 and  o.rcPrecSen = ?6 " +
			"and  o.rcNumeroGamme = ?7"))
@Table(name="RGEPFINIMP")
public class RgepFinImp implements Serializable{

	private static final long serialVersionUID = -3967773729561715729L;

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
	@Column(name="RCNUMEROGAMME", nullable=false)
    private Integer rcNumeroGamme;
    
	@Id
	@Column(name="RCCODEMATPREM", length=6, nullable=false)
    private String rcCodeMatPrem;
    
	@Id
	@Column(name="RCPRECUEMOAMATPREM", length=2, nullable=false)
    private String rcPrecUemoAmatPrem;
    
	@Id
	@Column(name="RCPRECSENMATPREM", length=2, nullable=false)
    private String rcPrecSenMatPrem;
    
	@Column(name="RCQTEIMPMATPREM", columnDefinition="DECIMAL(11,2)")
    private BigDecimal rcQteImpMatPrem;
    
	@Column(name="RCUNITEMESURE", length=3)
    private String rcUniteMesure;
    
	@Column(name="RCTAUXRENDEMENT", columnDefinition="DECIMAL(11,2)")
    private BigDecimal rcTauxRendement;
    
	@Column(name="RCQTEUNITAIRE", columnDefinition="DECIMAL(9,2)")
    private BigDecimal rcQteUnitaire;
    
	@Column(name="RCNATPRODREGECO", length=3)
    private String rcNatProdRegEco;
    
	@Column(name="RCNATTYPEDECHET", length=1)
    private String rcNatTypeDechet;
    
	@Column(name="RCTAUXDECHET", columnDefinition="DECIMAL(11,2)")
    private BigDecimal rcTauxDechet;
	
	public RgepFinImp() {

	}

	public RgepFinImp(String rcCodePpm, String rcAnneeRegEco,
			String rcNumRegEco, String rcCodeProd, String rcPrecUemoa,
			String rcPrecSen, Integer rcNumeroGamme, String rcCodeMatPrem,
			String rcPrecUemoAmatPrem, String rcPrecSenMatPrem) {
		super();
		this.rcCodePpm = rcCodePpm;
		this.rcAnneeRegEco = rcAnneeRegEco;
		this.rcNumRegEco = rcNumRegEco;
		this.rcCodeProd = rcCodeProd;
		this.rcPrecUemoa = rcPrecUemoa;
		this.rcPrecSen = rcPrecSen;
		this.rcNumeroGamme = rcNumeroGamme;
		this.rcCodeMatPrem = rcCodeMatPrem;
		this.rcPrecUemoAmatPrem = rcPrecUemoAmatPrem;
		this.rcPrecSenMatPrem = rcPrecSenMatPrem;
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

	public Integer getRcNumeroGamme() {
		return rcNumeroGamme;
	}

	public void setRcNumeroGamme(Integer rcNumeroGamme) {
		this.rcNumeroGamme = rcNumeroGamme;
	}

	public String getRcCodeMatPrem() {
		return rcCodeMatPrem;
	}

	public void setRcCodeMatPrem(String rcCodeMatPrem) {
		this.rcCodeMatPrem = rcCodeMatPrem;
	}

	public String getRcPrecUemoAmatPrem() {
		return rcPrecUemoAmatPrem;
	}

	public void setRcPrecUemoAmatPrem(String rcPrecUemoAmatPrem) {
		this.rcPrecUemoAmatPrem = rcPrecUemoAmatPrem;
	}

	public String getRcPrecSenMatPrem() {
		return rcPrecSenMatPrem;
	}

	public void setRcPrecSenMatPrem(String rcPrecSenMatPrem) {
		this.rcPrecSenMatPrem = rcPrecSenMatPrem;
	}

	public BigDecimal getRcQteImpMatPrem() {
		return rcQteImpMatPrem;
	}

	public void setRcQteImpMatPrem(BigDecimal rcQteImpMatPrem) {
		this.rcQteImpMatPrem = rcQteImpMatPrem;
	}

	public String getRcUniteMesure() {
		return rcUniteMesure;
	}

	public void setRcUniteMesure(String rcUniteMesure) {
		this.rcUniteMesure = rcUniteMesure;
	}

	public BigDecimal getRcTauxRendement() {
		return rcTauxRendement;
	}

	public void setRcTauxRendement(BigDecimal rcTauxRendement) {
		this.rcTauxRendement = rcTauxRendement;
	}

	public BigDecimal getRcQteUnitaire() {
		return rcQteUnitaire;
	}

	public void setRcQteUnitaire(BigDecimal rcQteUnitaire) {
		this.rcQteUnitaire = rcQteUnitaire;
	}

	public String getRcNatProdRegEco() {
		return rcNatProdRegEco;
	}

	public void setRcNatProdRegEco(String rcNatProdRegEco) {
		this.rcNatProdRegEco = rcNatProdRegEco;
	}

	public String getRcNatTypeDechet() {
		return rcNatTypeDechet;
	}

	public void setRcNatTypeDechet(String rcNatTypeDechet) {
		this.rcNatTypeDechet = rcNatTypeDechet;
	}

	public BigDecimal getRcTauxDechet() {
		return rcTauxDechet;
	}

	public void setRcTauxDechet(BigDecimal rcTauxDechet) {
		this.rcTauxDechet = rcTauxDechet;
	}
	
}
