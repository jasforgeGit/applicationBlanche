package sn.com.douane.ejb.declaration.model.entities;

import java.io.Serializable;
import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import sn.com.douane.ejb.declaration.model.keys.CritereGlobalBaeKey;
import sn.com.douane.ejb.rc.model.entities.RegimeDouanier;

@Entity
@IdClass(CritereGlobalBaeKey.class)
@Table(name = "CRITEREGLOBALBAE")
public class CritereGlobalBae implements Serializable {

		
	private static final long serialVersionUID = 1935045186930042224L;

	@Id
	@Column(name = "TYPEREGIME", length = 1, nullable = false)
	private String typeRegime ;
	
	@Id
	@Column(name = "REGIMEDOUANIER", length = 1, nullable = false)
	private String regimeDouanier;
	
	@Id
	@Column(name = "REGIMEFISCAL", length = 2, nullable = false)
	private String regimeFiscal;

	@Id
	@Column(name = "MONTANTDEVIS",columnDefinition="DECIMAL(11,0)", length = 1, nullable = false)
	private BigDecimal montantDevis ;

	@Id
	@Column(name = "MODEPAY", columnDefinition="CHAR(1)", nullable = false)
	private String modePay ;
	
	@ManyToOne(targetEntity = RegimeDouanier.class) 
	@JoinColumns({
    	@JoinColumn(name="TYPEREGIME", referencedColumnName="RCTYPEREGIME",  updatable=false, insertable=false),
    	@JoinColumn(name="REGIMEDOUANIER", referencedColumnName="RCCODEREGIMEDOUANIER",  updatable=false, insertable=false)})
	private RegimeDouanier regimesDouanier;

	public CritereGlobalBae(String typeRegime, String regimeDouanier,
			String regimeFiscal, BigDecimal montantDevis, String modePay) {
		super();
		this.typeRegime = typeRegime;
		this.regimeDouanier = regimeDouanier;
		this.regimeFiscal = regimeFiscal;
		this.montantDevis = montantDevis;
		this.modePay = modePay;
	}

	public CritereGlobalBae() {
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
		CritereGlobalBae other = (CritereGlobalBae) obj;
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

	public RegimeDouanier getRegimesDouanier() {
		return regimesDouanier;
	}

	public void setRegimesDouanier(RegimeDouanier regimesDouanier) {
		this.regimesDouanier = regimesDouanier;
	}
	
	
	
	
	
	

}
