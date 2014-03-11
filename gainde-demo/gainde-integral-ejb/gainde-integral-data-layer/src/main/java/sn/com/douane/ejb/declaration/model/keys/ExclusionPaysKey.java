package sn.com.douane.ejb.declaration.model.keys;

import java.io.Serializable;

import javax.persistence.Column;

public class ExclusionPaysKey implements Serializable{
	
	
	private static final long serialVersionUID = 5492402795107425603L;

	
	@Column(name = "CODEBUREAU",length = 3,nullable = false)
	private String codeBureau;
	
	@Column(name = "CODEPAYS",length = 3,nullable = false)
	private String codePay;

	public ExclusionPaysKey() {
		super();
	}

	public ExclusionPaysKey(String codeBureau, String codePay) {
		super();
		this.codeBureau = codeBureau;
		this.codePay = codePay;
	}

	public String getCodeBureau() {
		return codeBureau;
	}

	public void setCodeBureau(String codeBureau) {
		this.codeBureau = codeBureau;
	}

	public String getCodePay() {
		return codePay;
	}

	public void setCodePay(String codePay) {
		this.codePay = codePay;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((codeBureau == null) ? 0 : codeBureau.hashCode());
		result = prime * result + ((codePay == null) ? 0 : codePay.hashCode());
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
		ExclusionPaysKey other = (ExclusionPaysKey) obj;
		if (codeBureau == null) {
			if (other.codeBureau != null){
				return false;
			}
		} else if (!codeBureau.equals(other.codeBureau)){
			return false;
		}
		if (codePay == null) {
			if (other.codePay != null){
				return false;
			}
		} else if (!codePay.equals(other.codePay)){
			return false;
		}
		return true;
	}
	
	
	
	

}
