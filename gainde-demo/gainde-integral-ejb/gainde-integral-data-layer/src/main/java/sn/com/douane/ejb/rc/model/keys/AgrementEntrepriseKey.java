package sn.com.douane.ejb.rc.model.keys;

import java.io.Serializable;

import javax.persistence.Column;

public class AgrementEntrepriseKey implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -4137281701503192528L;

	@Column(name="RCAGRENT", length=4, nullable=false)
	private String rcAgrent;   
	
	@Column(name="RCRGRPAYS", length=10, nullable=false)
	private String rcRgrPays; 
	
	@Column(name="RCCODPAYS", length=3, nullable=false) 
	private String rcCodPays;

	
	public AgrementEntrepriseKey(String rcAgrent, String rcRgrPays,
			String rcCodPays) {
		super();
		this.rcAgrent = rcAgrent;
		this.rcRgrPays = rcRgrPays;
		this.rcCodPays = rcCodPays;
	}

	public AgrementEntrepriseKey() {
		super();
	}

	public String getRcAgrent() {
		return rcAgrent;
	}

	public void setRcAgrent(String rcAgrent) {
		this.rcAgrent = rcAgrent;
	}

	public String getRcRgrPays() {
		return rcRgrPays;
	}

	public void setRcRgrPays(String rcRgrPays) {
		this.rcRgrPays = rcRgrPays;
	}

	public String getRcCodPays() {
		return rcCodPays;
	}

	public void setRcCodPays(String rcCodPays) {
		this.rcCodPays = rcCodPays;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((rcAgrent == null) ? 0 : rcAgrent.hashCode());
		result = prime * result
				+ ((rcCodPays == null) ? 0 : rcCodPays.hashCode());
		result = prime * result
				+ ((rcRgrPays == null) ? 0 : rcRgrPays.hashCode());
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
		AgrementEntrepriseKey other = (AgrementEntrepriseKey) obj;
		if (rcAgrent == null) {
			if (other.rcAgrent != null){
				return false;
			}
		} else if (!rcAgrent.equals(other.rcAgrent)){
			return false;
		}
		if (rcCodPays == null) {
			if (other.rcCodPays != null){
				return false;
			}
		} else if (!rcCodPays.equals(other.rcCodPays)){
			return false;
		}
		if (rcRgrPays == null) {
			if (other.rcRgrPays != null){
				return false;
			}
		} else if (!rcRgrPays.equals(other.rcRgrPays)){
			return false;
		}
		return true;
	} 
	
	
	
}
