package sn.com.douane.ejb.declaration.model.keys;

import java.io.Serializable;

import javax.persistence.Column;


public class EcorKey implements Serializable{
	private static final long serialVersionUID = 1L;

	@Column(name="ECORANNEE", length=4, nullable=false)
	private String ecorAnnee;
	
	@Column(name="ECORCODEBUREAU", length=3, nullable=false)
    private String ecorCodeBureau;
	
	@Column(name="ECORNUMERO",nullable=false)
    private Integer ecorNumero;

	public EcorKey(){
		
	}
	
	public EcorKey(String ecorAnnee,String ecorCodeBureau,Integer ecorNumero) {
		this.ecorAnnee = ecorAnnee;
		this.ecorCodeBureau = ecorCodeBureau;
		this.ecorNumero = ecorNumero;
	}
	
	public String getEcorAnnee() {
		return ecorAnnee;
	}

	public void setEcorAnnee(String ecorAnnee) {
		this.ecorAnnee = ecorAnnee;
	}

	public String getEcorCodeBureau() {
		return ecorCodeBureau;
	}

	public void setEcorCodeBureau(String ecorCodeBureau) {
		this.ecorCodeBureau = ecorCodeBureau;
	}

	public Integer getEcorNumero() {
		return ecorNumero;
	}

	public void setEcorNumero(Integer ecorNumero) {
		this.ecorNumero = ecorNumero;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((ecorAnnee == null) ? 0 : ecorAnnee.hashCode());
		result = prime * result
				+ ((ecorCodeBureau == null) ? 0 : ecorCodeBureau.hashCode());
		result = prime * result
				+ ((ecorNumero == null) ? 0 : ecorNumero.hashCode());
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
		EcorKey other = (EcorKey) obj;
		if (ecorAnnee == null) {
			if (other.ecorAnnee != null){
				return false;
			}
		} else if (!ecorAnnee.equals(other.ecorAnnee)){
			return false;
		}
		if (ecorCodeBureau == null) {
			if (other.ecorCodeBureau != null){
				return false;
			}
		} else if (!ecorCodeBureau.equals(other.ecorCodeBureau)){
			return false;
		}
		if (ecorNumero == null) {
			if (other.ecorNumero != null){
				return false;
			}
		} else if (!ecorNumero.equals(other.ecorNumero)){
			return false;
		}
		return true;
	}
	
	
}
