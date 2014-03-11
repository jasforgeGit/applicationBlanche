package sn.com.douane.ejb.rc.model.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Version;


// import tn.com.tw.java.exception.TwreException;

/**
 * BureauProduit EJB3 Entity Bean.
 * 
 * @author Wadii
 */
@Entity
@Table(name = "BureauProduit")
public class BureauProduit implements Serializable {
	
	private static final long serialVersionUID = 3813165953862857426L;
	
	@Id
	@Column(name = "RCCODEPROD", nullable = false, length = 6)
    private String rccodeprod;
	    
	@Column(name = "RCPRECUEMOAPROD", nullable = false, length = 2)
    private String rcprecuemoaprod;
    
	@Column(name = "RCPRECSENPROD", nullable = false, length = 2)
    private String rcprecsenprod;
    
	@ManyToOne
	@JoinColumn(name = "RCCODEBUREAU", nullable = false)
    private BureauDouane burprodbur;
	
	/**
	 * Enable JPA optimstic lock.
	 */
//	@SuppressWarnings("unused")
//	@Version
//	@Column(nullable = false)
//	private int version;
//	
	/**
	 * 0-args default constructor.
	 */
	public BureauProduit() {
		super();
	}

	/**
	 * 4-args default constructor.
	 * 
	 * @param rccodeprod
	 * @param rcprecuemoaprod
	 * @param rcprecsenprod
	 */
	public BureauProduit(String rccodeprod, String rcprecuemoaprod, String rcprecsenprod) {
		super();
		this.rccodeprod = rccodeprod;		
		this.rcprecuemoaprod = rcprecuemoaprod;
		this.rcprecsenprod = rcprecsenprod;
	}

	public String getRccodeprod() {
		return rccodeprod;
	}

	public void setRccodeprod(String rccodeprod) {
		this.rccodeprod = rccodeprod;
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

	public BureauDouane getBurprodbur() {
		return burprodbur;
	}

	public void setBurprodbur(BureauDouane burprodbur) {
		this.burprodbur = burprodbur;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((burprodbur == null) ? 0 : burprodbur.hashCode());
		result = prime * result
				+ ((rccodeprod == null) ? 0 : rccodeprod.hashCode());
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
		BureauProduit other = (BureauProduit) obj;
		if (burprodbur == null) {
			if (other.burprodbur != null){
				return false;
			}
		} else if (!burprodbur.equals(other.burprodbur)){
			return false;
		}
		if (rccodeprod == null) {
			if (other.rccodeprod != null){
				return false;
			}
		} else if (!rccodeprod.equals(other.rccodeprod)){
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
