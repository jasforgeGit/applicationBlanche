package sn.com.douane.ejb.declaration.model.keys;

import java.io.Serializable;

import javax.persistence.Column;

public class ExclusionProduitKey implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -4239340026193890394L;

	@Column(name = "CODEBUREAU", length = 3, nullable = false)
	private String codeBureau;

	@Column(name = "CODEPRODUIT", length = 6, nullable = false)
	private String codeProduit;

	@Column(name = "PRECUEMOA", length = 2, nullable = false)
	private String precisionMoa;

	@Column(name = "PRECSENEGAL", length = 2, nullable = false)
	private String precisionSen;

	public ExclusionProduitKey(String codeBureau, String codeProduit,
			String precisionMoa, String precisionSen) {
		super();
		this.codeBureau = codeBureau;
		this.codeProduit = codeProduit;
		this.precisionMoa = precisionMoa;
		this.precisionSen = precisionSen;
	}

	public ExclusionProduitKey() {
		super();
	}

	public String getCodeBureau() {
		return codeBureau;
	}

	public void setCodeBureau(String codeBureau) {
		this.codeBureau = codeBureau;
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

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((codeBureau == null) ? 0 : codeBureau.hashCode());
		result = prime * result
				+ ((codeProduit == null) ? 0 : codeProduit.hashCode());
		result = prime * result
				+ ((precisionMoa == null) ? 0 : precisionMoa.hashCode());
		result = prime * result
				+ ((precisionSen == null) ? 0 : precisionSen.hashCode());
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
		ExclusionProduitKey other = (ExclusionProduitKey) obj;
		if (codeBureau == null) {
			if (other.codeBureau != null){
				return false;
			}
		} else if (!codeBureau.equals(other.codeBureau)){
			return false;
		}
		if (codeProduit == null) {
			if (other.codeProduit != null){
				return false;
			}
		} else if (!codeProduit.equals(other.codeProduit)){
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
		return true;
	}
	
	
	
	
	
	
}
