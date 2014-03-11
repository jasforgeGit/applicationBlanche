package sn.com.douane.ejb.declaration.model.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import sn.com.douane.ejb.declaration.model.keys.ExclusionPaysKey;
import sn.com.douane.ejb.rc.model.entities.Pays;

@Entity
@IdClass(ExclusionPaysKey.class)
@Table(name = "EXCLUSIONPAYS")
public class ExclusionPays implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 6796083549203103312L;

	@Id
	@Column(name = "CODEBUREAU",length = 3,nullable = false)
	private String codeBureau;

	@Id
	@Column(name = "CODEPAYS",length = 3,nullable = false)
	private String codePay;
	
	@ManyToOne(targetEntity = Pays.class)
    @JoinColumn(name="CODEPAYS",referencedColumnName = "RCCODEPAYS",insertable=false, updatable=false,nullable = false)
    private Pays pay;

	public ExclusionPays(String codeBureau, String codePay) {
		super();
		this.codeBureau = codeBureau;
		this.codePay = codePay;
	}

	public ExclusionPays() {
		super();
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
		ExclusionPays other = (ExclusionPays) obj;
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

	public Pays getPay() {
		return pay;
	}

	public void setPay(Pays pay) {
		this.pay = pay;
	}
	
	
	

}
