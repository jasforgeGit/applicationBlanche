package sn.com.douane.ejb.rc.model.keys;

import java.io.Serializable;

import javax.persistence.Column;

public class AgrementRgrpProdKey implements Serializable {

	private static final long serialVersionUID = -3952863202984487095L;
	
	@Column(name="RCCODEPAYS", length=3, nullable=false)
	private String rcCodePays;
	
	@Column(name="RCNUMENTREPRISE", length=4, nullable=false)
    private String rcNumEntreprise;
    
	@Column(name="RCCODEPROD", length=6, nullable=false)
    private String rcCodeProd;
    
	@Column(name="RCPRECUEMOAPROD", length=2, nullable=false)
    private String rcPrecUemoaProd;
    
	@Column(name="RCPRECSENPROD", length=2, nullable=false)
    private String rcPrecSenProd;
    
	@Column(name="RCCODEIMPEXP", length=1, nullable=false)
    private String rcCodeImpExp;
    
	@Column(name="RCCODEREGROUPEMENT", length=10, nullable=false)
    private String rcCodeRegroupement;

	public AgrementRgrpProdKey() {

	}

	public AgrementRgrpProdKey(String rcCodePays, String rcNumEntreprise,
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
	/**
	 * Returns true if both keys are equal.
	 */
	public boolean equals(java.lang.Object otherKey) {
		if (otherKey instanceof AgrementRgrpProdKey) {
			AgrementRgrpProdKey o = (AgrementRgrpProdKey) otherKey;
			return ((this.rcCodePays.equals(o.rcCodePays))
					&& (this.rcNumEntreprise.equals(o.rcNumEntreprise))
					&& (this.rcCodeProd.equals(o.rcCodeProd))
					&& (this.rcPrecUemoaProd.equals(o.rcPrecUemoaProd))
					&& (this.rcPrecSenProd.equals(o.rcPrecSenProd))
					&& (this.rcCodeImpExp.equals(o.rcCodeImpExp)) && (this.rcCodeRegroupement
					.equals(o.rcCodeRegroupement)));
		}
		return false;
	}

	/**
	 * Returns the hash code for the key.
	 */
	public int hashCode() {
		return (rcCodePays.hashCode() + rcNumEntreprise.hashCode()
				+ rcCodeProd.hashCode() + rcPrecUemoaProd.hashCode()
				+ rcPrecSenProd.hashCode() + rcCodeImpExp.hashCode() 
				+ rcCodeRegroupement.hashCode());
	}

}
