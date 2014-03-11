package sn.com.douane.ejb.declaration.model.keys;

import java.io.Serializable;

import javax.persistence.Column;

public class CritereLocalBaeKey implements Serializable {
	

	/**
	 * 
	 */
	private static final long serialVersionUID = 3778983986379391864L;

	
	@Column(name = "CODEBUREAU", length = 3, nullable = false)
	private String codeBureau;

	
	@Column(name = "CODEPPM", length = 5, nullable = false)
	private String codePpm;

	
	@Column(name = "TYPEREGIME", length = 1, nullable = false)
	private String typeRegime = null;

	
	@Column(name = "REGIMEDOUANIER", length = 1, nullable = false)
	private String codeRegimeDouanier = null;

	
	@Column(name = "REGIMEFISCAL", length = 2, nullable = false)
	private String regimeFiscal = null;

	
	@Column(name = "CODEPRODUIT", length = 6, nullable = false)
	private String codeProduit = null;

	
	@Column(name = "PRECISIONUEMOA", length = 2, nullable = false)
	private String precisionMoa = null;

	
	@Column(name = "PRECISIONSEN", length = 2, nullable = false)
	private String precisionSen = null;
	
	
	

	public CritereLocalBaeKey() {
		super();
	}

	public CritereLocalBaeKey(String codeBureau, String codePpm,
			String typeRegime, String codeRegimeDouanier, String regimefiscal,
			String codeProduit, String precisionMoa, String precisionSen) {
		super();
		this.codeBureau = codeBureau;
		this.codePpm = codePpm;
		this.typeRegime = typeRegime;
		this.codeRegimeDouanier = codeRegimeDouanier;
		this.regimeFiscal = regimefiscal;
		this.codeProduit = codeProduit;
		this.precisionMoa = precisionMoa;
		this.precisionSen = precisionSen;
	}

	public String getCodeBureau() {
		return codeBureau;
	}

	public void setCodeBureau(String codeBureau) {
		this.codeBureau = codeBureau;
	}

	public String getCodePpm() {
		return codePpm;
	}

	public void setCodePpm(String codePpm) {
		this.codePpm = codePpm;
	}

	public String getTypeRegime() {
		return typeRegime;
	}

	public void setTypeRegime(String typeRegime) {
		this.typeRegime = typeRegime;
	}

	public String getCodeRegimeDouanier() {
		return codeRegimeDouanier;
	}

	public void setCodeRegimeDouanier(String codeRegimeDouanier) {
		this.codeRegimeDouanier = codeRegimeDouanier;
	}
	
	public String getCodeProduit() {
		return codeProduit;
	}

	public void setCodeProduit(String codeProduit) {
		this.codeProduit = codeProduit;
	}

	public String getPrecisionMoa() {
		return precisionMoa;
	}

	public void setPrecisionMoa(String precisionMoa) {
		this.precisionMoa = precisionMoa;
	}

	public String getPrecisionSen() {
		return precisionSen;
	}

	public void setPrecisionSen(String precisionSen) {
		this.precisionSen = precisionSen;
	}	

	public String getRegimeFiscal() {
		return regimeFiscal;
	}

	public void setRegimeFiscal(String regimeFiscal) {
		this.regimeFiscal = regimeFiscal;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((codeBureau == null) ? 0 : codeBureau.hashCode());
		result = prime * result + ((codePpm == null) ? 0 : codePpm.hashCode());
		result = prime * result
				+ ((codeProduit == null) ? 0 : codeProduit.hashCode());
		result = prime
				* result
				+ ((codeRegimeDouanier == null) ? 0 : codeRegimeDouanier
						.hashCode());
		result = prime * result
				+ ((precisionMoa == null) ? 0 : precisionMoa.hashCode());
		result = prime * result
				+ ((precisionSen == null) ? 0 : precisionSen.hashCode());
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
		CritereLocalBaeKey other = (CritereLocalBaeKey) obj;
		if (codeBureau == null) {
			if (other.codeBureau != null){
				return false;
			}
		} else if (!codeBureau.equals(other.codeBureau)){
			return false;
		}
		if (codePpm == null) {
			if (other.codePpm != null){
				return false;
			}
		} else if (!codePpm.equals(other.codePpm)){
			return false;
		}
		if (codeProduit == null) {
			if (other.codeProduit != null){
				return false;
			}
		} else if (!codeProduit.equals(other.codeProduit)){
			return false;
		}
		if (codeRegimeDouanier == null) {
			if (other.codeRegimeDouanier != null){
				return false;
			}
		} else if (!codeRegimeDouanier.equals(other.codeRegimeDouanier)){
			return false;
		}
		if (precisionMoa == null) {
			if (other.precisionMoa != null){
				return false;
			}
		} else if (!precisionMoa.equals(other.precisionMoa)){
			return false;
		}
		if (precisionSen == null) {
			if (other.precisionSen != null){
				return false;
			}
		} else if (!precisionSen.equals(other.precisionSen)){
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
	
	
	
	

}
