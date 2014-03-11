package sn.com.douane.ejb.declaration.model.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import sn.com.douane.ejb.declaration.model.keys.BrComplementTaxesKey;

@Entity
@Table(name = "BRCOMPLEMENTTAXES")
@IdClass(BrComplementTaxesKey.class)
public class BrComplementTaxes implements Serializable {

	/**
	 * The EJB entity BrComplementTaxes
	 */
	private static final long serialVersionUID = -5311491288605824418L;
	
	@Id
	@Column(name = "DECANNEEDECL", length=4, nullable=false)
	private String decAnneeDecl;
	
	@Id
	@Column(name = "DECCODEPPMDECLARANT",length=5, nullable=false)
	private String decCodePpmDeclarant;
	
	@Id
	@Column(name = "DECNUMREPERTOIRE",length=6, nullable=false)
	private String decNumRepertoire;
	
	@Id
	@Column(name = "DECCODETAXE",length=2, nullable=false)
	private String decCodetaxe;
	
	@Column(name="DECMONTANTCOMP",columnDefinition="DECIMAL(5,0)")
    private java.math.BigDecimal DecMontantComp;
	
	@ManyToOne(targetEntity = BrouillonSegGenDec.class, fetch = FetchType.LAZY)
	@JoinColumns({
			@JoinColumn(name = "DECANNEEDECL", referencedColumnName = "DECANNEEDECL", insertable = false, updatable = false),
			@JoinColumn(name = "DECCODEPPMDECLARANT", referencedColumnName = "DECCODEPPMDECLARANT", insertable = false, updatable = false),
			@JoinColumn(name = "DECNUMREPERTOIRE", referencedColumnName = "DECNUMREPERTOIRE", insertable = false, updatable = false) })
	private BrouillonSegGenDec brouillonSegGenDec;

	
	/**
	 * Instantiates a new br complement taxes.
	 */
	public BrComplementTaxes(){
		
	}
	
	/**
	 * Instantiates a new br complement taxes.
	 */
	public BrComplementTaxes(String decAnneeDecl, String decCodePpmDeclarant, String decNumRepertoire, String decCodetaxe){
		super();
		this.decAnneeDecl=decAnneeDecl;
		this.decCodePpmDeclarant=decCodePpmDeclarant;
		this.decNumRepertoire=decNumRepertoire;
		this.decCodetaxe=decCodetaxe;
	}
	

	/**
	 * @return the decAnneeDecl
	 */
	public String getDecAnneeDecl() {
		return decAnneeDecl;
	}

	/**
	 * @param decAnneeDecl the decAnneeDecl to set
	 */
	public void setDecAnneeDecl(String decAnneeDecl) {
		this.decAnneeDecl = decAnneeDecl;
	}

	/**
	 * @return the decCodePpmDeclarant
	 */
	public String getDecCodePpmDeclarant() {
		return decCodePpmDeclarant;
	}

	/**
	 * @param decCodePpmDeclarant the decCodePpmDeclarant to set
	 */
	public void setDecCodePpmDeclarant(String decCodePpmDeclarant) {
		this.decCodePpmDeclarant = decCodePpmDeclarant;
	}

	/**
	 * @return the decNumRepertoire
	 */
	public String getDecNumRepertoire() {
		return decNumRepertoire;
	}

	/**
	 * @param decNumRepertoire the decNumRepertoire to set
	 */
	public void setDecNumRepertoire(String decNumRepertoire) {
		this.decNumRepertoire = decNumRepertoire;
	}

	/**
	 * @return the decCodetaxe
	 */
	public String getDecCodetaxe() {
		return decCodetaxe;
	}

	/**
	 * @param decCodetaxe the decCodetaxe to set
	 */
	public void setDecCodetaxe(String decCodetaxe) {
		this.decCodetaxe = decCodetaxe;
	}

	/**
	 * @return the decMontantComp
	 */
	public java.math.BigDecimal getDecMontantComp() {
		return DecMontantComp;
	}

	/**
	 * @param decMontantComp the decMontantComp to set
	 */
	public void setDecMontantComp(java.math.BigDecimal decMontantComp) {
		DecMontantComp = decMontantComp;
	}

	/**
	 * @return the brouillonSegGenDec
	 */
	public BrouillonSegGenDec getBrouillonSegGenDec() {
		return brouillonSegGenDec;
	}

	/**
	 * @param brouillonSegGenDec the brouillonSegGenDec to set
	 */
	public void setBrouillonSegGenDec(BrouillonSegGenDec brouillonSegGenDec) {
		this.brouillonSegGenDec = brouillonSegGenDec;
	}




}
