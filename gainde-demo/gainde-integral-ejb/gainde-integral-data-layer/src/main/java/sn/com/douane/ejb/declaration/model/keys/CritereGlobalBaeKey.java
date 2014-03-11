package sn.com.douane.ejb.declaration.model.keys;

import java.io.Serializable;
import java.math.BigDecimal;

import javax.persistence.Column;

public class CritereGlobalBaeKey implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 8454285372484901188L;

	@Column(name = "TYPEREGIME", length = 1, nullable = false)
	private String typeRegime;

	@Column(name = "REGIMEDOUANIER", length = 1, nullable = false)
	private String regimeDouanier;

	@Column(name = "REGIMEFISCAL", length = 2, nullable = false)
	private String regimeFiscal;

	@Column(name = "MONTANTDEVIS", columnDefinition = "DECIMAL(11,0)", length = 1, nullable = false)
	private BigDecimal montantDevis;

	@Column(name = "MODEPAY", columnDefinition = "CHAR(1)", nullable = false)
	private String modePay;

	public CritereGlobalBaeKey(String typeRegime) {
		super();
		this.typeRegime = typeRegime;
	}

	public CritereGlobalBaeKey() {
		super();
	}

	public String getTypeRegime() {
		return typeRegime;
	}

	public void setTypeRegime(String typeRegime) {
		this.typeRegime = typeRegime;
	}

	public String getRegimeDouanier() {
		return regimeDouanier;
	}

	public void setRegimeDouanier(String regimeDouanier) {
		this.regimeDouanier = regimeDouanier;
	}

	public String getRegimeFiscal() {
		return regimeFiscal;
	}

	public void setRegimeFiscal(String regimeFiscal) {
		this.regimeFiscal = regimeFiscal;
	}

	public BigDecimal getMontantDevis() {
		return montantDevis;
	}

	public void setMontantDevis(BigDecimal montantDevis) {
		this.montantDevis = montantDevis;
	}

	public String getModePay() {
		return modePay;
	}

	public void setModePay(String modePay) {
		this.modePay = modePay;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((modePay == null) ? 0 : modePay.hashCode());
		result = prime * result
				+ ((montantDevis == null) ? 0 : montantDevis.hashCode());
		result = prime * result
				+ ((regimeDouanier == null) ? 0 : regimeDouanier.hashCode());
		result = prime * result
				+ ((regimeFiscal == null) ? 0 : regimeFiscal.hashCode());
		result = prime * result
				+ ((typeRegime == null) ? 0 : typeRegime.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj){
			return true;
		}
		if (obj == null){
			return false;
		}
		if (getClass() != obj.getClass()){
			return false;
		}
		CritereGlobalBaeKey other = (CritereGlobalBaeKey) obj;
		if (modePay == null) {
			if (other.modePay != null){
				return false;
			}
		} else if (!modePay.equals(other.modePay)){
			return false;
		}
		if (montantDevis == null) {
			if (other.montantDevis != null){
				return false;
			}
		} else if (!montantDevis.equals(other.montantDevis)){
			return false;
		}
		if (regimeDouanier == null) {
			if (other.regimeDouanier != null){
				return false;
			}
		} else if (!regimeDouanier.equals(other.regimeDouanier)){
			return false;
		}
		if (regimeFiscal == null) {
			if (other.regimeFiscal != null){
				return false;
			}
		} else if (!regimeFiscal.equals(other.regimeFiscal)){
			return false;
		}
		if (typeRegime == null) {
			if (other.typeRegime != null){
				return false;
			}
		} else if (!typeRegime.equals(other.typeRegime)){
			return false;
		}
		return true;
	}

	public CritereGlobalBaeKey(String typeRegime, String regimeDouanier,
			String regimeFiscal, BigDecimal montantDevis, String modePay) {
		super();
		this.typeRegime = typeRegime;
		this.regimeDouanier = regimeDouanier;
		this.regimeFiscal = regimeFiscal;
		this.montantDevis = montantDevis;
		this.modePay = modePay;
	}
	

}
