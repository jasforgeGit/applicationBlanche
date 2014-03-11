package sn.com.douane.ejb.rc.model.entities;

import java.io.Serializable;
import java.math.BigDecimal;
import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.Table;

import sn.com.douane.ejb.rc.model.keys.AgrementRgrpProdKey;
/**
 * 
 * @author nesrine
 *
 */
@Entity
@IdClass(AgrementRgrpProdKey.class)
@Table(name="AGREMENTRGRPPROD")
public class AgrementRgrpProd implements Serializable{

	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="RCCODEPAYS", length=3, nullable=false)
	private String rcCodePays;
	
	@Id
	@Column(name="RCNUMENTREPRISE", length=4, nullable=false)
    private String rcNumEntreprise;
    
	@Id
	@Column(name="RCCODEPROD", length=6, nullable=false)
    private String rcCodeProd;
    
	@Id
	@Column(name="RCPRECUEMOAPROD", length=2, nullable=false)
    private String rcPrecUemoaProd;
    
	@Id
	@Column(name="RCPRECSENPROD", length=2, nullable=false)
    private String rcPrecSenProd;
    
	@Id
	@Column(name="RCCODEIMPEXP", length=1, nullable=false)
    private String rcCodeImpExp;
    
	@Id
	@Column(name="RCCODEREGROUPEMENT", length=10, nullable=false)
    private String rcCodeRegroupement;
    
	@Column(name="RCCODETAXE", length=2)
    private String rcCodeTaxe;
    
	@Column(name="RCDATEAPPLICATION")
    private Date rcDateApplication;
    
	@Column(name="RCCODETAUX", length=3)
    private String rcCodeTaux;
    
	@Column(name="RCVALQUOTITE",  columnDefinition="DECIMAL(18, 2)")
    private BigDecimal rcValQuotite;
    
	@Column(name="RCDATECLOTURE")
    private Date rcDateCloture;

	public AgrementRgrpProd() {
		
	}

	public AgrementRgrpProd(String rcCodePays, String rcNumEntreprise,
			String rcCodeProd, String rcPrecUemoaProd, String rcPrecSenProd,
			String rcCodeImpExp, String rcCodeRegroupement) {
		super();
		this.rcCodePays = rcCodePays;
		this.rcNumEntreprise = rcNumEntreprise;
		this.rcCodeProd = rcCodeProd;
		this.rcPrecUemoaProd = rcPrecUemoaProd;
		this.rcPrecSenProd = rcPrecSenProd;
		this.rcCodeImpExp = rcCodeImpExp;
		this.rcCodeRegroupement = rcCodeRegroupement;
	}

	public String getRcCodePays() {
		return rcCodePays;
	}

	public void setRcCodePays(String rcCodePays) {
		this.rcCodePays = rcCodePays;
	}

	public String getRcNumEntreprise() {
		return rcNumEntreprise;
	}

	public void setRcNumEntreprise(String rcNumEntreprise) {
		this.rcNumEntreprise = rcNumEntreprise;
	}

	public String getRcCodeProd() {
		return rcCodeProd;
	}

	public void setRcCodeProd(String rcCodeProd) {
		this.rcCodeProd = rcCodeProd;
	}

	public String getRcPrecUemoaProd() {
		return rcPrecUemoaProd;
	}

	public void setRcPrecUemoaProd(String rcPrecUemoaProd) {
		this.rcPrecUemoaProd = rcPrecUemoaProd;
	}

	public String getRcPrecSenProd() {
		return rcPrecSenProd;
	}

	public void setRcPrecSenProd(String rcPrecSenProd) {
		this.rcPrecSenProd = rcPrecSenProd;
	}

	public String getRcCodeImpExp() {
		return rcCodeImpExp;
	}

	public void setRcCodeImpExp(String rcCodeImpExp) {
		this.rcCodeImpExp = rcCodeImpExp;
	}

	public String getRcCodeRegroupement() {
		return rcCodeRegroupement;
	}

	public void setRcCodeRegroupement(String rcCodeRegroupement) {
		this.rcCodeRegroupement = rcCodeRegroupement;
	}

	public String getRcCodeTaxe() {
		return rcCodeTaxe;
	}

	public void setRcCodeTaxe(String rcCodeTaxe) {
		this.rcCodeTaxe = rcCodeTaxe;
	}

	public Date getRcDateApplication() {
		return rcDateApplication;
	}

	public void setRcDateApplication(Date rcDateApplication) {
		this.rcDateApplication = rcDateApplication;
	}

	public String getRcCodeTaux() {
		return rcCodeTaux;
	}

	public void setRcCodeTaux(String rcCodeTaux) {
		this.rcCodeTaux = rcCodeTaux;
	}

	public BigDecimal getRcValQuotite() {
		return rcValQuotite;
	}

	public void setRcValQuotite(BigDecimal rcValQuotite) {
		this.rcValQuotite = rcValQuotite;
	}

	public Date getRcDateCloture() {
		return rcDateCloture;
	}

	public void setRcDateCloture(Date rcDateCloture) {
		this.rcDateCloture = rcDateCloture;
	}
	
}
