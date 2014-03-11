package sn.com.douane.ejb.rc.model.entities;

import java.io.Serializable;
import javax.persistence.IdClass;
import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Version;

import sn.com.douane.ejb.rc.model.keys.BaremePK;

/**
 * Bareme EJB3 Entity Bean.
 * 
 * @author Wadii
 */
@Entity
@IdClass(BaremePK.class)
@Table(name = "BAREME")
public class Bareme implements Serializable {

	private static final long serialVersionUID = -5693880971538668371L;

	@Id
	@Column(name = "RCCODEBUREAU", length = 3, nullable = false)
	private String rccodebureau;

	@Id
	@Column(name = "RCCODEPROD", length = 6, nullable = false)
	private String rccodeprod;

	@Id
	@Column(name = "RCPRECUEMOA", length = 2, nullable = false)
	private String rcprecuemoa;

	@Id
	@Column(name = "RCPRECSEN", length = 2, nullable = false)
	private String rcprecsenegal;

	@Column(name = "RCVALEURUNITAIRE", nullable = false, columnDefinition = "DECIMAL(18,0)")
	private BigDecimal rcvaleurunitaire;
	
	@Column(name = "UNITETAXATION", nullable = false, columnDefinition = "CHAR(2)")
	private String uniteTaxation;
	
	@Column(name = "ASSIETTE",columnDefinition = "DECIMAL(18,0)")
	private BigDecimal assiette;	

	@ManyToOne(targetEntity = BureauDouane.class)
	@JoinColumn(name = "RCCODEBUREAU", insertable = false, updatable = false)
	private BureauDouane baremebur;

	@ManyToOne(targetEntity = Produit.class)
	@JoinColumns({
			@JoinColumn(name = "RCCODEPROD", referencedColumnName = "RCCODEPROD", insertable = false, updatable = false),
			@JoinColumn(name = "RCPRECUEMOA", referencedColumnName = "RCPRECUEMOA", insertable = false, updatable = false),
			@JoinColumn(name = "RCPRECSEN", referencedColumnName = "RCPRECSENEGAL", insertable = false, updatable = false) })
	private Produit baremeprod;

	/**
	 * 0-args default constructor.
	 */
	public Bareme() {
		super();
	}

	public Bareme(String rccodebureau, String rccodeprod, String rcprecuemoa,
			String rcprecsenegal) {
		super();
		this.rccodebureau = rccodebureau;
		this.rccodeprod = rccodeprod;
		this.rcprecuemoa = rcprecuemoa;
		this.rcprecsenegal = rcprecsenegal;
	}

	public Bareme(String rccodebureau, String rccodeprod, String rcprecuemoa,
			String rcprecsenegal, BigDecimal rcvaleurunitaire) {
		super();
		this.rccodebureau = rccodebureau;
		this.rccodeprod = rccodeprod;
		this.rcprecuemoa = rcprecuemoa;
		this.rcprecsenegal = rcprecsenegal;
		this.rcvaleurunitaire = rcvaleurunitaire;
	}

	public BureauDouane getBaremebur() {
		return baremebur;
	}

	public void setBaremebur(BureauDouane baremebur) {
		this.baremebur = baremebur;
	}

	public BigDecimal getRcvaleurunitaire() {
		return rcvaleurunitaire;
	}

	public void setRcvaleurunitaire(BigDecimal rcvaleurunitaire) {
		this.rcvaleurunitaire = rcvaleurunitaire;
	}

	public String getRccodebureau() {
		return rccodebureau;
	}

	public void setRccodebureau(String rccodebureau) {
		this.rccodebureau = rccodebureau;
	}

	public String getRccodeprod() {
		return rccodeprod;
	}

	public void setRccodeprod(String rccodeprod) {
		this.rccodeprod = rccodeprod;
	}

	public String getRcprecuemoa() {
		return rcprecuemoa;
	}

	public void setRcprecuemoa(String rcprecuemoa) {
		this.rcprecuemoa = rcprecuemoa;
	}

	public String getRcprecsenegal() {
		return rcprecsenegal;
	}

	public void setRcprecsenegal(String rcprecsenegal) {
		this.rcprecsenegal = rcprecsenegal;
	}

	public Produit getBaremeprod() {
		return baremeprod;
	}

	public void setBaremeprod(Produit baremeprod) {
		this.baremeprod = baremeprod;
	}

	public String getUniteTaxation() {
		return uniteTaxation;
	}

	public void setUniteTaxation(String uniteTaxation) {
		this.uniteTaxation = uniteTaxation;
	}

	public BigDecimal getAssiette() {
		return assiette;
	}

	public void setAssiette(BigDecimal assiette) {
		this.assiette = assiette;
	}
	

}
