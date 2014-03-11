package sn.com.douane.ejb.declaration.model.entities;

import java.io.Serializable;
import java.math.BigDecimal;
import java.sql.Timestamp;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Transient;

import sn.com.douane.ejb.declaration.model.keys.LiquidArtDeclKey;
import sn.com.douane.ejb.rc.model.entities.BureauDouane;
import sn.com.douane.ejb.rc.model.entities.Ppm;
import sn.com.douane.ejb.rc.model.entities.Taxe;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;;

/**
 * @author: issam Bean implementation class for Enterprise Bean: LiquidArtDecl
 */
@Entity
@Table(name = "LIQUIDARTDECL")
@IdClass(LiquidArtDeclKey.class)
 @NamedQueries({@NamedQuery(name = "LiquidArtDecl.findByRepertoire", query =
 "select object(o) from LiquidArtDecl o where o.decAnneeLiquid = ?1 and o.decBureauEnregDec = ?2 and o.decNumDec = ?3"),
 @NamedQuery(name = "LiquidArtDecl.findByarticle", query =
 "select object(o) from LiquidArtDecl o where o.decNumArtDec = ?1 and o.decAnneeLiquid = ?2 and o.decBureauEnregDec = ?3 and o.decNumDec = ?4 order by o.decCodeTaxe ASC"),
 @NamedQuery(name = "LiquidArtDecl.findByTaxesDates", query =
 "select object(o) from LiquidArtDecl o where  o.decCodeTaxe = ?1 and  o.decDateLiquid >= ?2 and  o.decDateLiquid <= ?3")})
public class LiquidArtDecl implements Serializable {

	/**
	 * 
	 * 
	 */
	private static final long serialVersionUID = 1617341750096640481L;
	@Id
	@Column(name = "DECANNEELIQUID", length = 4, nullable = false)
	private String decAnneeLiquid;
	@Id
	@Column(name = "DECBUREAUENREGDEC", length = 3, nullable = false)
	private String decBureauEnregDec;
	@Id
	@Column(name = "DECNUMDEC", nullable = false)
	private Integer decNumDec;
	@Id
	@Column(name = "DECNUMARTDEC", nullable = false)
	private Integer decNumArtDec;
	@Id
	@Column(name = "DECCODETAXE", length = 2, nullable = false)
	private String decCodeTaxe;
	@Column(name = "DECCODEPPMDECLARANT", length = 5, nullable = false)
	private String decCodePpmDeclarant;
	@Column(name = "DECBASETAXENORM", columnDefinition = "DECIMAL(11 , 0)", nullable = false)
	private BigDecimal decBaseTaxeNorm;
	@Column(name = "DECQUOTITENORM", columnDefinition = "DECIMAL(9,2)", nullable = false)
	private BigDecimal decQuotiteNorm;
	@Column(name = "DECMTTAXENORM", columnDefinition = "DECIMAL(11 , 0)", nullable = false)
	private BigDecimal decMtTaxeNorm;
	@Column(name = "DECBASETAXELIQ", columnDefinition = "DECIMAL(11 , 0)", nullable = false)
	private BigDecimal decBaseTaxeLiq;
	@Column(name = "DECQUOTITELIQ", columnDefinition = "DECIMAL(9,2)")
	private BigDecimal decQuotiteLiq;
	@Column(name = "DECMTTAXELIQ", columnDefinition = "DECIMAL(11 , 0)", nullable = false)
	private BigDecimal decMtTaxeLiq;
	@Column(name = "DECMTTAXESUSPENDU", columnDefinition = "DECIMAL(11 , 0)")
	private BigDecimal decMtTaxeSuspendu;
	@Column(name = "DECDATELIQUID", nullable = false)
	private Timestamp decDateLiquid;
	@Column(name = "DECTYPETRAITEMENT", length = 1)
	private String decTypeTraitement;

	@ManyToOne(targetEntity = SegArtDec.class, fetch=FetchType.LAZY)
	@JoinColumns({
			@JoinColumn(name = "DECNUMARTDEC", referencedColumnName = "DECNUMARTDEC", insertable = false, updatable = false, nullable = false),
			@JoinColumn(name = "DECANNEELIQUID", referencedColumnName = "DECANNEEENREGDEC", insertable = false, updatable = false, nullable = false),
			@JoinColumn(name = "DECBUREAUENREGDEC", referencedColumnName = "DECBURENREGDEC", insertable = false, updatable = false, nullable = false),
			@JoinColumn(name = "DECNUMDEC", referencedColumnName = "DECNUMDECLARATION", insertable = false, updatable = false, nullable = false) })
	private SegArtDec segArtDec;

	@ManyToOne(targetEntity = BureauDouane.class, fetch=FetchType.LAZY)
	@JoinColumn(name = "DECBUREAUENREGDEC", insertable = false, updatable = false, nullable = false)
	private BureauDouane bureauDouane;

	@ManyToOne(targetEntity = Ppm.class, fetch=FetchType.LAZY)
	@JoinColumn(name = "DECCODEPPMDECLARANT", insertable = false, updatable = false, nullable = false)
	private Ppm ppm;

	@ManyToOne(targetEntity = Taxe.class , fetch=FetchType.LAZY)
	@JoinColumn(name = "DECCODETAXE", insertable = false, updatable = false, nullable = false)
	private Taxe taxe;
	
	@Transient
	private String libelleTaxe;

	public LiquidArtDecl() {
	}

	public LiquidArtDecl(String decAnneeEnregDec, String decBurEnregDec,
			Integer decNumDec, Integer decNumArtDec, String decCodeTaxe,
			String decCodePpmDeclarant, BigDecimal decBaseTaxeNorm,
			BigDecimal decQuotiteNorm, BigDecimal decMtTaxeNorm,
			BigDecimal decBaseTaxeLiq, BigDecimal decMtTaxeLiq,
			Timestamp decDateLiquid) {
		this.decAnneeLiquid = decAnneeEnregDec;
		this.decBureauEnregDec = decBurEnregDec;
		this.decNumDec = decNumDec;
		this.decNumArtDec = decNumArtDec;
		this.decCodeTaxe = decCodeTaxe;
		this.decCodePpmDeclarant = decCodePpmDeclarant;
		this.decBaseTaxeNorm = decBaseTaxeNorm;
		this.decQuotiteNorm = decQuotiteNorm;
		this.decMtTaxeNorm = decMtTaxeNorm;
		this.decBaseTaxeLiq = decBaseTaxeLiq;
		this.decMtTaxeLiq = decMtTaxeLiq;
		this.decDateLiquid = decDateLiquid;
	}

	public String getDecAnneeLiquid() {
		return decAnneeLiquid;
	}

	public void setDecAnneeLiquid(String decAnneeLiquid) {
		this.decAnneeLiquid = decAnneeLiquid;
	}

	public String getDecBurEnregDec() {
		return decBureauEnregDec;
	}

	public void setDecBurEnregDec(String decBurEnregDec) {
		this.decBureauEnregDec = decBurEnregDec;
	}

	public Integer getDecNumDec() {
		return decNumDec;
	}

	public void setDecNumDec(Integer decNumDec) {
		this.decNumDec = decNumDec;
	}

	public Integer getDecNumArtDec() {
		return decNumArtDec;
	}

	public void setDecNumArtDec(Integer decNumArtDec) {
		this.decNumArtDec = decNumArtDec;
	}

	public String getDecCodeTaxe() {
		return decCodeTaxe;
	}

	public void setDecCodeTaxe(String decCodeTaxe) {
		this.decCodeTaxe = decCodeTaxe;
	}

	public String getDecCodePpmDeclarant() {
		return decCodePpmDeclarant;
	}

	public void setDecCodePpmDeclarant(String decCodePpmDeclarant) {
		this.decCodePpmDeclarant = decCodePpmDeclarant;
	}

	public BigDecimal getDecBaseTaxeNorm() {
		return decBaseTaxeNorm;
	}

	public void setDecBaseTaxeNorm(BigDecimal decBaseTaxeNorm) {
		this.decBaseTaxeNorm = decBaseTaxeNorm;
	}

	public BigDecimal getDecQuotiteNorm() {
		return decQuotiteNorm;
	}

	public void setDecQuotiteNorm(BigDecimal decQuotiteNorm) {
		this.decQuotiteNorm = decQuotiteNorm;
	}

	public BigDecimal getDecMtTaxeNorm() {
		return decMtTaxeNorm;
	}

	public void setDecMtTaxeNorm(BigDecimal decMtTaxeNorm) {
		this.decMtTaxeNorm = decMtTaxeNorm;
	}

	public BigDecimal getDecBaseTaxeLiq() {
		return decBaseTaxeLiq;
	}

	public void setDecBaseTaxeLiq(BigDecimal decBaseTaxeLiq) {
		this.decBaseTaxeLiq = decBaseTaxeLiq;
	}

	public BigDecimal getDecQuotiteLiq() {
		return decQuotiteLiq;
	}

	public void setDecQuotiteLiq(BigDecimal decQuotiteLiq) {
		this.decQuotiteLiq = decQuotiteLiq;
	}

	public BigDecimal getDecMtTaxeLiq() {
		return decMtTaxeLiq;
	}

	public void setDecMtTaxeLiq(BigDecimal decMtTaxeLiq) {
		this.decMtTaxeLiq = decMtTaxeLiq;
	}

	public BigDecimal getDecMtTaxeSuspendu() {
		return decMtTaxeSuspendu;
	}

	public void setDecMtTaxeSuspendu(BigDecimal decMtTaxeSuspendu) {
		this.decMtTaxeSuspendu = decMtTaxeSuspendu;
	}

	public Timestamp getDecDateLiquid() {
		return decDateLiquid;
	}

	public void setDecDateLiquid(Timestamp decDateLiquid) {
		this.decDateLiquid = decDateLiquid;
	}

	public String getDecTypeTraitement() {
		return decTypeTraitement;
	}

	public void setDecTypeTraitement(String decTypeTraitement) {
		this.decTypeTraitement = decTypeTraitement;
	}

	public SegArtDec getSegArtDec() {
		return segArtDec;
	}

	public void setSegArtDec(SegArtDec segArtDec) {
		this.segArtDec = segArtDec;
	}

	public String getDecBureauEnregDec() {
		return decBureauEnregDec;
	}

	public void setDecBureauEnregDec(String decBureauEnregDec) {
		this.decBureauEnregDec = decBureauEnregDec;
	}

	public BureauDouane getBureauDouane() {
		return bureauDouane;
	}

	public void setBureauDouane(BureauDouane bureauDouane) {
		this.bureauDouane = bureauDouane;
	}

	public Ppm getPpm() {
		return ppm;
	}

	public void setPpm(Ppm ppm) {
		this.ppm = ppm;
	}

	public Taxe getTaxe() {
		return taxe;
	}

	public void setTaxe(Taxe taxe) {
		this.taxe = taxe;
	}

	public void setLibelleTaxe(String libelleTaxe) {
		this.libelleTaxe = libelleTaxe;
		
	}

	public String getLibelleTaxe() {
		return libelleTaxe;
	}
	
	

}