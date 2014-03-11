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
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Transient;

import sn.com.douane.ejb.declaration.model.keys.BrouillonDevisArtKey;
import sn.com.douane.ejb.rc.model.entities.Taxe;

/**
 * Bean implementation class for Enterprise Bean: Brouillondevisart
 */

@Entity
@IdClass(BrouillonDevisArtKey.class)
@Table(name="BROUILLONDEVISART")
@NamedQueries({
	@NamedQuery(name = "BrouillonDevisArt.findByArticle", query = "select object(o) from BrouillonDevisArt o where o.decAnneeDecl = ?1 and o.decCodePpmDeclarant = ?2 and o.decNumRepertoire = ?3 and o.decNumArtDecl = ?4 order by o.decCodeTaxe"),
	@NamedQuery(name = "BrouillonDevisArt.findByRepertoire", query = "select object(o) from BrouillonDevisArt o where o.decAnneeDecl = ?1 and o.decCodePpmDeclarant = ?2 and o.decNumRepertoire = ?3")})

public class BrouillonDevisArt implements Serializable{

	private static final long serialVersionUID = 56316242305327446L;

	@Id
	@Column(name="DECANNEEDECLARATION", length= 4, nullable = false)
	private String decAnneeDecl;

	@Id
	@Column(name="DECCODEPPMDECLARANT", length= 5, nullable = false)
	private String decCodePpmDeclarant;

	@Id
	@Column(name="DECNUMREPERTOIRE", length= 6, nullable = false)
	private String decNumRepertoire;

	@Id
	@Column(name="DECNUMARTDECL", nullable = false)
	private Integer decNumArtDecl;

	@Id
	@Column(name="DECCODETAXE", length= 2, nullable = false)
	private String decCodeTaxe;

	@Column(name="DECBASETAXENORMAL",  columnDefinition = "DECIMAL(11,0)")
	private BigDecimal decBaseTaxeNormal;

	@Column(name="DECVALQTITENORMAL", columnDefinition = "DECIMAL(9,2)" )
	private BigDecimal decValQtiteNormal;

	@Column(name="DECMTTAXENORMALE", columnDefinition = "DECIMAL(13,0)")
	private BigDecimal decMtTaxeNormale;

	@Column(name="DECBASETAXELIQUID", columnDefinition = "DECIMAL(11,0)")
	private BigDecimal decBaseTaxeLiquid;

	@Column(name="DECVALQTITELIQUID", columnDefinition = "DECIMAL(9,2)" )
	private BigDecimal decValQtiteLiquid;

	@Column(name="DECMTTAXELIQUID", columnDefinition = "DECIMAL(13,0)")
	private BigDecimal decMtTaxeLiquid;

	@Column(name="DECDATEDEVIS",nullable = false)
	private Timestamp decDateDevis;

	@Column(name="DECMTTAXESUSPEND", columnDefinition = "DECIMAL(11,0)")
	private BigDecimal decMtTaxeSuspend;
	
    @Transient
	private String decLibTaxe;
    
    @Transient
    private String libelleTaxe;


	@ManyToOne(targetEntity = BrouillonArtDec.class, fetch = FetchType.LAZY)	
	@JoinColumns({
			@JoinColumn(name = "DECNUMARTDECL", referencedColumnName = "DECNUMARTDECL", insertable = false, updatable = false,nullable = false),
			@JoinColumn(name = "DECANNEEDECLARATION", referencedColumnName = "DECANNEEDECLARATION", insertable = false, updatable = false,nullable = false),
			@JoinColumn(name = "DECCODEPPMDECLARANT", referencedColumnName = "DECCODEPPMDECLARANT", insertable = false, updatable = false,nullable = false),
			@JoinColumn(name = "DECNUMREPERTOIRE", referencedColumnName = "DECNUMREPERTOIRE", insertable = false, updatable = false,nullable = false) })
	private BrouillonArtDec devisArt;
	
	@ManyToOne(targetEntity = Taxe.class, fetch = FetchType.LAZY)
	@JoinColumn(name = "DECCODETAXE",referencedColumnName="RCCODETAXE",insertable = false, updatable = false,nullable = false)
	private Taxe taxe;


	public BrouillonDevisArt(String decAnneeDecl, String decCodePpmDeclarant, String decNumRepertoire, Integer decNumArtDecl, String decCodeTaxe) {
		this.decAnneeDecl = decAnneeDecl;
		this.decCodePpmDeclarant = decCodePpmDeclarant;
		this.decNumRepertoire = decNumRepertoire;
		this.decNumArtDecl = decNumArtDecl;
		this.decCodeTaxe = decCodeTaxe;
	}

	public BrouillonDevisArt() {

	}

	public String getDecAnneeDecl() {
		return decAnneeDecl;
	}

	public void setDecAnneeDecl(String decAnneeDecl) {
		this.decAnneeDecl = decAnneeDecl;
	}

	public String getDecCodePpmDeclarant() {
		return decCodePpmDeclarant;
	}

	public void setDecCodePpmDeclarant(String decCodePpmDeclarant) {
		this.decCodePpmDeclarant = decCodePpmDeclarant;
	}

	public String getDecNumRepertoire() {
		return decNumRepertoire;
	}

	public void setDecNumRepertoire(String decNumRepertoire) {
		this.decNumRepertoire = decNumRepertoire;
	}

	public Integer getDecNumArtDecl() {
		return decNumArtDecl;
	}

	public void setDecNumArtDecl(Integer decNumArtDecl) {
		this.decNumArtDecl = decNumArtDecl;
	}

	public String getDecCodeTaxe() {
		return decCodeTaxe;
	}

	public void setDecCodeTaxe(String decCodeTaxe) {
		this.decCodeTaxe = decCodeTaxe;
	}

	public BigDecimal getDecBaseTaxeNormal() {
		return decBaseTaxeNormal;
	}

	public void setDecBaseTaxeNormal(BigDecimal decBaseTaxeNormal) {
		this.decBaseTaxeNormal = decBaseTaxeNormal;
	}

	public BigDecimal getDecValQtiteNormal() {
		return decValQtiteNormal;
	}

	public void setDecValQtiteNormal(BigDecimal decValQtiteNormal) {
		this.decValQtiteNormal = decValQtiteNormal;
	}

	public BigDecimal getDecMtTaxeNormale() {
		return decMtTaxeNormale;
	}

	public void setDecMtTaxeNormale(BigDecimal decMtTaxeNormale) {
		this.decMtTaxeNormale = decMtTaxeNormale;
	}

	public BigDecimal getDecBaseTaxeLiquid() {
		return decBaseTaxeLiquid;
	}

	public void setDecBaseTaxeLiquid(BigDecimal decBaseTaxeLiquid) {
		this.decBaseTaxeLiquid = decBaseTaxeLiquid;
	}

	public BigDecimal getDecValQtiteLiquid() {
		return decValQtiteLiquid;
	}

	public void setDecValQtiteLiquid(BigDecimal decValQtiteLiquid) {
		this.decValQtiteLiquid = decValQtiteLiquid;
	}

	public BigDecimal getDecMtTaxeLiquid() {
		return decMtTaxeLiquid;
	}

	public void setDecMtTaxeLiquid(BigDecimal decMtTaxeLiquid) {
		this.decMtTaxeLiquid = decMtTaxeLiquid;
	}

	public Timestamp getDecDateDevis() {
		return decDateDevis;
	}

	public void setDecDateDevis(Timestamp decDateDevis) {
		this.decDateDevis = decDateDevis;
	}

	public BigDecimal getDecMtTaxeSuspend() {
		return decMtTaxeSuspend;
	}

	public void setDecMtTaxeSuspend(BigDecimal decMtTaxeSuspend) {
		this.decMtTaxeSuspend = decMtTaxeSuspend;
	}

	public BrouillonArtDec getDevisArt() {
		return devisArt;
	}

	public void setDevisArt(BrouillonArtDec devisArt) {
		this.devisArt = devisArt;
	}

	public Taxe getTaxe() {
		return taxe;
	}

	public void setTaxe(Taxe taxe) {
		this.taxe = taxe;
	}

	/**
	 * @return the libelleTaxe
	 */
	public String getLibelleTaxe() {
		return libelleTaxe;
	}

	/**
	 * @param libelleTaxe the libelleTaxe to set
	 */
	public void setLibelleTaxe(String libelleTaxe) {
		this.libelleTaxe = libelleTaxe;
	}

	/**
	 * @return the decLibTaxe
	 */
	public String getDecLibTaxe() {
		return decLibTaxe;
	}

	/**
	 * @param decLibTaxe the decLibTaxe to set
	 */
	public void setDecLibTaxe(String decLibTaxe) {
		this.decLibTaxe = decLibTaxe;
	}

	
}