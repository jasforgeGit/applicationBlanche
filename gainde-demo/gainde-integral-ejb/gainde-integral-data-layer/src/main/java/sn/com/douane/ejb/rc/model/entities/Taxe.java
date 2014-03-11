package sn.com.douane.ejb.rc.model.entities;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Transient;

import sn.com.douane.ejb.declaration.model.entities.BrouillonDevisArt;
import sn.com.douane.ejb.declaration.model.entities.LiquidArtDecl;

@Entity
@Table(name = "TAXES")
@javax.persistence.NamedQueries(
		@javax.persistence.NamedQuery(name = "findByCodetaxe", query = "select object(o) from Taxe o where  o.rcCodeTaxe = ?1"))
public class Taxe implements Serializable {

	private static final long serialVersionUID = -6119165975108569097L;

	@Id
	@Column(name = "RCCODETAXE", length = 2, nullable = false)
	private String rcCodeTaxe;

	@Column(name = "RCLIBELLETAXE", length = 255, nullable = false)
	private String rcLibelleTaxe;

	@Column(name = "RCCODEIMPTRESOR", length = 8)
	private String rcCodeImpTresor;

	@Column(name = "RCCODEIMPBUDGET", length = 8)
	private String rcCodeImpBudget;

	@Column(name = "RCUNITELIQUIDATION", length = 1)
	private String rcUniteLiquidation;

	@Column(name = "RCMINPERCEPTIONTAXE", columnDefinition="DECIMAL(9 , 0)")
	private java.math.BigDecimal rcMinPerceptionTaxe;

	@Column(name = "RCBASETAXE1", length = 1)
	private String rcBaseTaxe1;

	@Column(name = "RCNATURETAXE", length = 3)
	private String rcNatureTaxe;

	@Column(name = "RCORDREEVALTAXE", nullable = false)
	private Integer rcOrdreEvalTaxe;

	@Column(name = "RCFORMULETAXE", length = 255, nullable = false)
	private String rcFormuleTaxe;

	@Column(name = "RCINDCOMPTANT", length = 1, nullable = false)
	private String rcIndComptant;	
	
	@OneToMany(mappedBy = "taxe", targetEntity =TaxesTransport.class, fetch = FetchType.LAZY)
	private List<TaxesTransport> taxesTransport = new ArrayList<TaxesTransport>();
	
	@OneToMany(mappedBy = "taxTxRegDou", targetEntity = TaxesRegDou.class , fetch = FetchType.LAZY)
	private List<TaxesRegDou> taxesRegDous = new ArrayList<TaxesRegDou>();

	@OneToMany(mappedBy = "taxRegTaxes", targetEntity = TaxesRegime.class, fetch = FetchType.LAZY)
	private List<TaxesRegime> taxesRegimes = new ArrayList<TaxesRegime>();

	@OneToMany(mappedBy = "taxTaxSusp", targetEntity = TaxesSuspendus.class, fetch = FetchType.LAZY)
	private List<TaxesSuspendus> taxesSuspendus = new ArrayList<TaxesSuspendus>();

	@OneToMany(mappedBy = "taxe", targetEntity = TaxesRegroup.class, fetch = FetchType.LAZY)
	private List<TaxesRegroup> taxesRegroup = new ArrayList<TaxesRegroup>();

	@OneToMany(mappedBy = "taxe", targetEntity = Dispense.class, fetch = FetchType.LAZY)
	private List<Dispense> dispenses = new ArrayList<Dispense>();

	@OneToMany(mappedBy = "taxe", targetEntity = Taux.class, fetch = FetchType.LAZY)
	private List<Taux> taux = new ArrayList<Taux>();

	@OneToMany(mappedBy = "taxe", targetEntity = ExceptionsTaxes.class, fetch = FetchType.LAZY)
	private List<ExceptionsTaxes> exceptionsTaxes = new ArrayList<ExceptionsTaxes>();

	@OneToMany(mappedBy = "taxe", targetEntity = Tarif.class, fetch = FetchType.LAZY)
	private List<Tarif> tarifs = new ArrayList<Tarif>();
	
	@OneToMany(mappedBy = "cumulTaxe", targetEntity = BasesTaxable.class, fetch = FetchType.LAZY)	
	private List<BasesTaxable> cumlBaseTaxable = new ArrayList<BasesTaxable>();	
		
	@OneToMany(mappedBy = "refTaxe", targetEntity = BasesTaxable.class, fetch = FetchType.LAZY)	
	private List<BasesTaxable> refBaseTaxable = new ArrayList<BasesTaxable>();
	
	@OneToMany(mappedBy = "taxe", targetEntity = LiquidArtDecl.class, fetch = FetchType.LAZY)
	private List<LiquidArtDecl> listLiquidArtDecl;
	
	@OneToMany(mappedBy = "taxe", targetEntity = BrouillonDevisArt.class, fetch = FetchType.LAZY)
	private List<BrouillonDevisArt> listBrouillonDevisArt;
	
	@Transient
	private String rcCodeTaux;

	public Taxe() {
		
	}
	
	public Taxe(String rcCodeTaxe) {
		super();
		this.rcCodeTaxe=rcCodeTaxe;
	}

	public Taxe(String rcCodeTaxe, String rcLibelleTaxe,
			Integer rcOrdreeValTaxe, String rcFormuleTaxe, String rcIndComptant) {
		super();
		this.rcCodeTaxe=rcCodeTaxe;
		this.rcLibelleTaxe=rcLibelleTaxe;
		this.rcOrdreEvalTaxe =rcOrdreeValTaxe;
		this.rcFormuleTaxe=rcFormuleTaxe;
		this.rcIndComptant=rcIndComptant;
	}	

	public List<Tarif> getTarifs() {
		return tarifs;
	}

	public void setTarifs(List<Tarif> tarifs) {
		this.tarifs = tarifs;
	}

	public List<Taux> getTaux() {
		return taux;
	}

	public void setTaux(List<Taux> taux) {
		this.taux = taux;
	}

	public List<ExceptionsTaxes> getExceptionsTaxes() {
		return exceptionsTaxes;
	}

	public void setExceptionsTaxes(List<ExceptionsTaxes> exceptionsTaxes) {
		this.exceptionsTaxes = exceptionsTaxes;
	}

	public List<Dispense> getDispenses() {
		return dispenses;
	}

	public void setDispenses(List<Dispense> dispenses) {
		this.dispenses = dispenses;
	}

	public List<TaxesRegroup> getTaxesRegroup() {
		return taxesRegroup;
	}

	public void setTaxesRegroup(List<TaxesRegroup> taxeRegroup) {
		this.taxesRegroup = taxeRegroup;
	}

	public String getRcCodeTaxe() {
		return rcCodeTaxe;
	}

	public void setRcCodeTaxe(String rcCodeTaxe) {
		this.rcCodeTaxe = rcCodeTaxe;
	}

	public String getRcLibelleTaxe() {
		return rcLibelleTaxe;
	}

	public void setRcLibelleTaxe(String rcLibelleTaxe) {
		this.rcLibelleTaxe = rcLibelleTaxe;
	}

	public String getRcCodeImpTresor() {
		return rcCodeImpTresor;
	}

	public void setRcCodeImpTresor(String rcCodeImpTresor) {
		this.rcCodeImpTresor = rcCodeImpTresor;
	}

	public String getRcCodeImpBudget() {
		return rcCodeImpBudget;
	}

	public void setRcCodeImpBudget(String rcCodeImpBudget) {
		this.rcCodeImpBudget = rcCodeImpBudget;
	}

	public String getRcUniteLiquidation() {
		return rcUniteLiquidation;
	}

	public void setRcUniteLiquidation(String rcUniteLiquidation) {
		this.rcUniteLiquidation = rcUniteLiquidation;
	}

	public java.math.BigDecimal getRcMinPerceptionTaxe() {
		return rcMinPerceptionTaxe;
	}

	public void setRcMinPerceptionTaxe(java.math.BigDecimal rcMinPerceptionTaxe) {
		this.rcMinPerceptionTaxe = rcMinPerceptionTaxe;
	}

	public String getRcBaseTaxe1() {
		return rcBaseTaxe1;
	}

	public void setRcBaseTaxe1(String rcBaseTaxe) {
		this.rcBaseTaxe1 = rcBaseTaxe;
	}

	public String getRcNatureTaxe() {
		return rcNatureTaxe;
	}

	public void setRcNatureTaxe(String rcNatureTaxe) {
		this.rcNatureTaxe = rcNatureTaxe;
	}

	public Integer getRcOrdreEvalTaxe() {
		return rcOrdreEvalTaxe;
	}

	public void setRcOrdreEvalTaxe(Integer rcOrdreEvalTaxe) {
		this.rcOrdreEvalTaxe = rcOrdreEvalTaxe;
	}

	public String getRcFormuleTaxe() {
		return rcFormuleTaxe;
	}

	public void setRcFormuleTaxe(String rcFormuleTaxe) {
		this.rcFormuleTaxe = rcFormuleTaxe;
	}

	public String getRcIndComptant() {
		return rcIndComptant;
	}

	public void setRcIndComptant(String rcIndComptant) {
		this.rcIndComptant = rcIndComptant;
	}

	public List<TaxesRegDou> getTaxesRegDous() {
		return taxesRegDous;
	}

	public void setTaxesRegDous(List<TaxesRegDou> taxesRegDous) {
		this.taxesRegDous = taxesRegDous;
	}

	public List<TaxesSuspendus> getTaxesSuspendus() {
		return taxesSuspendus;
	}

	public void setTaxesSuspendus(List<TaxesSuspendus> taxesSuspendus) {
		this.taxesSuspendus = taxesSuspendus;
	}

	public List<TaxesRegime> getTaxesRegimes() {
		return taxesRegimes;
	}

	public void setTaxesRegimes(List<TaxesRegime> taxesRegimes) {
		this.taxesRegimes = taxesRegimes;
	}

	public List<TaxesTransport> getTaxesTransport() {
		return taxesTransport;
	}

	public void setTaxesTransport(List<TaxesTransport> taxesTransport) {
		this.taxesTransport = taxesTransport;
	}

	public List<BasesTaxable> getCumlBaseTaxable() {
		return cumlBaseTaxable;
	}

	public void setCumlBaseTaxable(List<BasesTaxable> cumlBaseTaxable) {
		this.cumlBaseTaxable = cumlBaseTaxable;
	}

	public List<BasesTaxable> getRefBaseTaxable() {
		return refBaseTaxable;
	}

	public void setRefBaseTaxable(List<BasesTaxable> refBaseTaxable) {
		this.refBaseTaxable = refBaseTaxable;
	}

	public List<LiquidArtDecl> getListLiquidArtDecl() {
		return listLiquidArtDecl;
	}

	public void setListLiquidArtDecl(List<LiquidArtDecl> listLiquidArtDecl) {
		this.listLiquidArtDecl = listLiquidArtDecl;
	}

	public List<BrouillonDevisArt> getListBrouillonDevisArt() {
		return listBrouillonDevisArt;
	}

	public void setListBrouillonDevisArt(List<BrouillonDevisArt> listBrouillonDevisArt) {
		this.listBrouillonDevisArt = listBrouillonDevisArt;
	}

	/**
	 * @return the rcCodeTaux
	 */
	public String getRcCodeTaux() {
		return rcCodeTaux;
	}

	/**
	 * @param rcCodeTaux the rcCodeTaux to set
	 */
	public void setRcCodeTaux(String rcCodeTaux) {
		this.rcCodeTaux = rcCodeTaux;
	}
	
	

}
