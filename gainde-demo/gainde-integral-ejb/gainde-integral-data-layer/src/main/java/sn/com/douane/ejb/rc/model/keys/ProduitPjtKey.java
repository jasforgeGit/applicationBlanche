package sn.com.douane.ejb.rc.model.keys;

import java.io.Serializable;

import javax.persistence.Column;

public class ProduitPjtKey implements Serializable {
	

	private static final long serialVersionUID = 2105282157514605681L;

	@Column(name = "RCCODEPRODUIT",length = 6,nullable = false)
	private String rccodeproduit;
	
	@Column(name = "RCPRECUEMOAPROD",length = 2,nullable = false)
    private String rcprecuemoaprod;
	
	@Column(name = "RCPRECSENPROD",length = 2,nullable = false)
    private String rcprecsenprod;
	
	@Column(name = "RCCODEPIECEJOINTE",length = 3,nullable = false)
	private String rccodepiecejointe;
	
	
	public ProduitPjtKey(){
		
	}	

	public ProduitPjtKey(String rccodeproduit, String rcprecuemoaprod,
			String rcprecsenprod, String rccodepiecejointe) {
		super();
		this.rccodeproduit = rccodeproduit;
		this.rcprecuemoaprod = rcprecuemoaprod;
		this.rcprecsenprod = rcprecsenprod;
		this.rccodepiecejointe = rccodepiecejointe;
	}

	public String getRccodeproduit() {
		return rccodeproduit;
	}

	public void setRccodeproduit(String rccodeproduit) {
		this.rccodeproduit = rccodeproduit;
	}

	public String getRcprecuemoaprod() {
		return rcprecuemoaprod;
	}

	public void setRcprecuemoaprod(String rcprecuemoaprod) {
		this.rcprecuemoaprod = rcprecuemoaprod;
	}

	public String getRcprecsenprod() {
		return rcprecsenprod;
	}

	public void setRcprecsenprod(String rcprecsenprod) {
		this.rcprecsenprod = rcprecsenprod;
	}

	public String getRccodepiecejointe() {
		return rccodepiecejointe;
	}

	public void setRccodepiecejointe(String rccodepiecejointe) {
		this.rccodepiecejointe = rccodepiecejointe;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime
				* result
				+ ((rccodepiecejointe == null) ? 0 : rccodepiecejointe
						.hashCode());
		result = prime * result
				+ ((rccodeproduit == null) ? 0 : rccodeproduit.hashCode());
		result = prime * result
				+ ((rcprecsenprod == null) ? 0 : rcprecsenprod.hashCode());
		result = prime * result
				+ ((rcprecuemoaprod == null) ? 0 : rcprecuemoaprod.hashCode());
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
		ProduitPjtKey other = (ProduitPjtKey) obj;
		if (rccodepiecejointe == null) {
			if (other.rccodepiecejointe != null){
				return false;
			}
		} else if (!rccodepiecejointe.equals(other.rccodepiecejointe)){
			return false;
		}
		if (rccodeproduit == null) {
			if (other.rccodeproduit != null){
				return false;
			}
		} else if (!rccodeproduit.equals(other.rccodeproduit)){
			return false;
		}
		if (rcprecsenprod == null) {
			if (other.rcprecsenprod != null){
				return false;
			}
		} else if (!rcprecsenprod.equals(other.rcprecsenprod)){
			return false;
		}
		if (rcprecuemoaprod == null) {
			if (other.rcprecuemoaprod != null){
				return false;
			}
		} else if (!rcprecuemoaprod.equals(other.rcprecuemoaprod)){
			return false;
		}
		return true;
	}
	
	
	
	

}
