package sn.com.douane.ejb.rc.model.entities;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import sn.com.douane.ejb.declaration.model.entities.BrouillonSegGenDec;
import sn.com.douane.ejb.declaration.model.entities.CritereLocalBae;
import sn.com.douane.ejb.rc.model.keys.RegimeDouanierKey;

/**
 * 
 * @author nesrine
 * 
 */
@Entity
@IdClass(RegimeDouanierKey.class)
@Table(name = "REGIMEDOUANIER")
public class RegimeDouanier implements Serializable {

	private static final long serialVersionUID = -4835934005083001643L;

	@Id
	@Column(name = "RCTYPEREGIME", length = 1, nullable = false)
	private String rcTypeRegime;

	@Id
	@Column(name = "RCCODEREGIMEDOUANIER", length = 1, nullable = false)
	private String rcCodeRegimeDouanier;

	@Column(name = "RCLIBELLEREGIMEDOUANIER", length = 250)
	private String rcLibelleRegimeDouanier;

	@ManyToOne(targetEntity = TypeRegimeDouane.class)
	@JoinColumn(name = "RCTYPEREGIME", updatable = false, insertable = false)
	private TypeRegimeDouane typeRegRegdou;

	@OneToMany(mappedBy = "regdouIndrRou", targetEntity = IndicateurRegdou.class)
	private List<IndicateurRegdou> indicateurRegdous;

	@OneToMany(mappedBy = "regRegApu", targetEntity = Regapuregapure.class)
	private List<Regapuregapure> regapuregapures;

	@OneToMany(mappedBy = "regRegApure", targetEntity = Regapuregapure.class)
	private List<Regapuregapure> regapuregapures1;

	@OneToMany(mappedBy = "regDouRegInd", targetEntity = RegDouIndRec.class)
	private List<RegDouIndRec> regDouIndRecs;

	@OneToMany(mappedBy = "regDouModDecl", targetEntity = RegDouModeDecl.class)
	private List<RegDouModeDecl> regDouModeDecls;

	@OneToMany(mappedBy = "regDouRegime", targetEntity = Regime.class)
	private List<Regime> regimes;

	@OneToMany(mappedBy = "regDouBurInt", targetEntity = RegimeBurInterdit.class)
	private List<RegimeBurInterdit> regimeBurInterdits;

	@OneToMany(mappedBy = "regDouTaxes", targetEntity = TaxesRegDou.class)
	private List<TaxesRegDou> taxesRegDou;

	@OneToMany(mappedBy = "regTypApReg", targetEntity = TypeApurRegInterdit.class)
	private List<TypeApurRegInterdit> typeApurRegInterdits;

	@OneToMany(mappedBy = "regimeDouanier", targetEntity = BrouillonSegGenDec.class)
	private List<BrouillonSegGenDec> listBrouillonSegGenDec;
		
	@OneToMany(mappedBy = "regimeDouanier",targetEntity = CritereLocalBae.class)
	private List<CritereLocalBae> listCritereLocalBae;

	

	public RegimeDouanier() {

	}

	public RegimeDouanier(String rcTypeRegime, String rcCodeRegimeDouanier) {
		super();
		this.rcTypeRegime = rcTypeRegime;
		this.rcCodeRegimeDouanier = rcCodeRegimeDouanier;
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
	public String getRcLibelleRegimeDouanier() {
		return rcLibelleRegimeDouanier;
	}

	/**
	 * 
	 * @param rcLibelleRegimeDouanier
	 */
	public void setRcLibelleRegimeDouanier(String rcLibelleRegimeDouanier) {
		this.rcLibelleRegimeDouanier = rcLibelleRegimeDouanier;
	}

	/**
	 * 
	 * @return
	 */
	public TypeRegimeDouane getTypeRegRegdou() {
		return typeRegRegdou;
	}

	/**
	 * 
	 * @param typeRegRegdou
	 */
	public void setTypeRegRegdou(TypeRegimeDouane typeRegRegdou) {
		this.typeRegRegdou = typeRegRegdou;
	}

	/**
	 * 
	 * @return
	 */
	public List<IndicateurRegdou> getIndicateurRegdous() {
		return indicateurRegdous;
	}

	/**
	 * 
	 * @param indicateurRegdous
	 */
	public void setIndicateurRegdous(List<IndicateurRegdou> indicateurRegdous) {
		this.indicateurRegdous = indicateurRegdous;
	}

	public List<Regime> getRegimes() {
		return regimes;
	}

	public void setRegimes(List<Regime> regimes) {
		this.regimes = regimes;
	}

	public String getRcTypeRegime() {
		return rcTypeRegime;
	}

	public void setRcTypeRegime(String rcTypeRegime) {
		this.rcTypeRegime = rcTypeRegime;
	}

	public List<RegDouModeDecl> getRegDouModeDecls() {
		return regDouModeDecls;
	}

	public void setRegDouModeDecls(List<RegDouModeDecl> regDouModeDecls) {
		this.regDouModeDecls = regDouModeDecls;
	}

	public List<Regapuregapure> getRegapuregapures() {
		return regapuregapures;
	}

	public void setRegapuregapures(List<Regapuregapure> regapuregapures) {
		this.regapuregapures = regapuregapures;
	}

	public List<Regapuregapure> getRegapuregapures1() {
		return regapuregapures1;
	}

	public void setRegapuregapures1(List<Regapuregapure> regapuregapures1) {
		this.regapuregapures1 = regapuregapures1;
	}

	public List<TypeApurRegInterdit> getTypeApurRegInterdits() {
		return typeApurRegInterdits;
	}

	public void setTypeApurRegInterdits(
			List<TypeApurRegInterdit> typeApurRegInterdits) {
		this.typeApurRegInterdits = typeApurRegInterdits;
	}

	public List<RegDouIndRec> getRegDouIndRecs() {
		return regDouIndRecs;
	}

	public void setRegDouIndRecs(List<RegDouIndRec> regDouIndRecs) {
		this.regDouIndRecs = regDouIndRecs;
	}

	public List<TaxesRegDou> getTaxesRegDou() {
		return taxesRegDou;
	}

	public void setTaxesRegDou(List<TaxesRegDou> taxesRegDou) {
		this.taxesRegDou = taxesRegDou;
	}

	public List<RegimeBurInterdit> getRegimeBurInterdits() {
		return regimeBurInterdits;
	}

	public void setRegimeBurInterdits(List<RegimeBurInterdit> regimeBurInterdits) {
		this.regimeBurInterdits = regimeBurInterdits;
	}

	public List<BrouillonSegGenDec> getListBrouillonSegGenDec() {
		return listBrouillonSegGenDec;
	}

	public void setListBrouillonSegGenDec(
			List<BrouillonSegGenDec> listBrouillonSegGenDec) {
		this.listBrouillonSegGenDec = listBrouillonSegGenDec;
	}

	public List<CritereLocalBae> getListCritereLocalBae() {
		return listCritereLocalBae;
	}

	public void setListCritereLocalBae(List<CritereLocalBae> listCritereLocalBae) {
		this.listCritereLocalBae = listCritereLocalBae;
	}	
	
}
