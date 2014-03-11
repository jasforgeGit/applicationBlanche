package sn.com.douane.ejb.rc.model.entities;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import sn.com.douane.ejb.declaration.model.entities.Sommiers;
import sn.com.douane.ejb.rc.model.keys.RegimeKey;

/**
 * 
 * @author nesrine
 * 
 */
@Entity
@IdClass(RegimeKey.class)
@Table(name = "REGIME")
public class Regime implements Serializable {

	private static final long serialVersionUID = 5130542311415500573L;

	@Id
	@Column(name = "RCTYPEREGIME", length = 1, nullable = false)
	private String rcTypeRegime;

	@Id
	@Column(name = "RCCODEREGIMEDOUANIER", length = 1, nullable = false)
	private String rcCodeRegimeDouanier;

	@Id
	@Column(name = "RCCODEREGIMEFISCAL", length = 2, nullable = false)
	private String rcCodeRegimeFiscal;

	@Column(name = "RCLIBELLEREGIME", length = 250, nullable = false)
	private String rcLibelleRegime;

	@Column(name = "RCREGIMETAXABLE", length = 1, nullable = false)
	private String rcRegimeTaxable;

	@Column(name = "RCINDICMUTAT", length = 1, nullable = false)
	private String rcIndicMutat;

	@Column(name = "RCCIRCUITVISITE", length = 1, nullable = false)
	private String rcCircuitVisite;

	@Column(name = "RCDUREEENTREPOT")
	private Integer rcDureeEntrepot;

	@Column(name = "RCINDICATEUREXO", columnDefinition = "CHAR(1)")
	private String rcIndicateurExo;

	@Column(name = "RCINDICATEURSUSP", columnDefinition = "CHAR(1)", nullable = false)
	private String rcIndicateurSusp;

	@ManyToOne(targetEntity = RegimeFiscal.class)
	@JoinColumn(name = "RCCODEREGIMEFISCAL", referencedColumnName = "rcCodeRegimeFiscal", insertable = false, updatable = false)
	private RegimeFiscal regFscRegime;

	@ManyToOne(targetEntity = RegimeDouanier.class)
	@JoinColumns({
			@JoinColumn(name = "RCTYPEREGIME", referencedColumnName = "rcTypeRegime", updatable = false, insertable = false),
			@JoinColumn(name = "RCCODEREGIMEDOUANIER", referencedColumnName = "rcCodeRegimeDouanier", updatable = false, insertable = false) })
	private RegimeDouanier regDouRegime;

	@OneToMany(mappedBy = "regimeIndReg", targetEntity = IndicateurRegime.class)
	private List<IndicateurRegime> indicateurRegimes;

	@OneToMany(mappedBy = "regimeRegDest", targetEntity = RegimeDestinataire.class)
	private List<RegimeDestinataire> regimeDestinataires;

	@OneToMany(mappedBy = "regRegProd", targetEntity = RegimeProduit.class)
	private List<RegimeProduit> regimeProduits;

	@OneToMany(mappedBy = "regTaxReg", targetEntity = TaxesRegime.class)
	private List<TaxesRegime> taxesRegimes;

	@OneToMany(mappedBy = "regime", targetEntity = Sommiers.class)
	private List<Sommiers> listRegime;

	public Regime() {
	}

	public Regime(String rcTypeRegime, String rcCodeRegimeDouanier,
			String rcCodeRegimeFiscal) {
		super();
		this.rcTypeRegime = rcTypeRegime;
		this.rcCodeRegimeDouanier = rcCodeRegimeDouanier;
		this.rcCodeRegimeFiscal = rcCodeRegimeFiscal;
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

	public String getRcLibelleRegime() {
		return rcLibelleRegime;
	}

	public void setRcLibelleRegime(String rcLibelleRegime) {
		this.rcLibelleRegime = rcLibelleRegime;
	}

	public String getRcRegimeTaxable() {
		return rcRegimeTaxable;
	}

	public void setRcRegimeTaxable(String rcRegimeTaxable) {
		this.rcRegimeTaxable = rcRegimeTaxable;
	}

	public String getRcIndicMutat() {
		return rcIndicMutat;
	}

	public void setRcIndicMutat(String rcIndicMutat) {
		this.rcIndicMutat = rcIndicMutat;
	}

	public String getRcCircuitVisite() {
		return rcCircuitVisite;
	}

	public void setRcCircuitVisite(String rcCircuitVisite) {
		this.rcCircuitVisite = rcCircuitVisite;
	}

	public Integer getRcDureeEntrepot() {
		return rcDureeEntrepot;
	}

	public void setRcDureeEntrepot(Integer rcDureeEntrepot) {
		this.rcDureeEntrepot = rcDureeEntrepot;
	}

	public String getRcIndicateurExo() {
		return rcIndicateurExo;
	}

	public void setRcIndicateurExo(String rcIndicateurExo) {
		this.rcIndicateurExo = rcIndicateurExo;
	}

	public String getRcIndicateurSusp() {
		return rcIndicateurSusp;
	}

	public void setRcIndicateurSusp(String rcIndicateurSusp) {
		this.rcIndicateurSusp = rcIndicateurSusp;
	}

	public List<IndicateurRegime> getIndicateurRegimes() {
		return indicateurRegimes;
	}

	public void setIndicateurRegimes(List<IndicateurRegime> indicateurRegimes) {
		this.indicateurRegimes = indicateurRegimes;
	}

	public RegimeDouanier getRegDouRegime() {
		return regDouRegime;
	}

	public void setRegDouRegime(RegimeDouanier regDouRegime) {
		this.regDouRegime = regDouRegime;
	}

	public RegimeFiscal getRegFscRegime() {
		return regFscRegime;
	}

	public void setRegFscRegime(RegimeFiscal regFscRegime) {
		this.regFscRegime = regFscRegime;
	}

	public List<RegimeProduit> getRegimeProduits() {
		return regimeProduits;
	}

	public void setRegimeProduits(List<RegimeProduit> regimeProduits) {
		this.regimeProduits = regimeProduits;
	}

	public List<RegimeDestinataire> getRegimeDestinataires() {
		return regimeDestinataires;
	}

	public void setRegimeDestinataires(
			List<RegimeDestinataire> regimeDestinataires) {
		this.regimeDestinataires = regimeDestinataires;
	}

	public List<TaxesRegime> getTaxesRegimes() {
		return taxesRegimes;
	}

	public void setTaxesRegimes(List<TaxesRegime> taxesRegimes) {
		this.taxesRegimes = taxesRegimes;
	}

	public List<Sommiers> getListRegime() {
		return listRegime;
	}

	public void setListRegime(List<Sommiers> listRegime) {
		this.listRegime = listRegime;
	}

}
