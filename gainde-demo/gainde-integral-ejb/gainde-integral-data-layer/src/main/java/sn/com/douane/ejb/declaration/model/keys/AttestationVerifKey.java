package sn.com.douane.ejb.declaration.model.keys;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Id;

public class AttestationVerifKey implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -3223726086839269277L;

	@Id
	@Column(name="DOUAVSR" , length=6 , nullable=false)
    private String douAVsr;
	
	@Id
	@Column(name="DOUAVPAY" , length=3 , nullable=false)
    private String douAVPay;

	public AttestationVerifKey(){
		
	}
	
	public AttestationVerifKey(String douAVsr, String douAVPay){
		this.douAVsr=douAVsr;
		this.douAVPay=douAVPay;
	}

	/**
	 * @return the douAVsr
	 */
	public String getDouAVsr() {
		return douAVsr;
	}

	/**
	 * @param douAVsr the douAVsr to set
	 */
	public void setDouAVsr(String douAVsr) {
		this.douAVsr = douAVsr;
	}

	/**
	 * @return the douAVPay
	 */
	public String getDouAVPay() {
		return douAVPay;
	}

	/**
	 * @param douAVPay the douAVPay to set
	 */
	public void setDouAVPay(String douAVPay) {
		this.douAVPay = douAVPay;
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((douAVsr == null) ? 0 : douAVsr.hashCode());
		result = prime * result
				+ ((douAVPay == null) ? 0 : douAVPay.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
			if (obj instanceof AttestationVerifKey) {
				AttestationVerifKey o = (AttestationVerifKey) obj;
				return ((this.douAVsr.equals(o.douAVsr))
					&& (this.douAVPay.equals(o.douAVPay)));
			}
			return false;
		}

}
