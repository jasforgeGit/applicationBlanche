package sn.com.douane.ejb.rc.model.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
/**
 * 
 * @author nesrine
 *
 */
@Entity
@Table(name="NATUREPV")
public class NaturePV implements Serializable{

	private static final long serialVersionUID = -7834708303055717589L;

	@Id
	@Column(name="RCCODENATUREPV", length=2, nullable=false)
	private String rcCodeNaturePV;
	
	@Column(name="LIBNATUREPV", length=100, nullable=false)
    private String libNaturePV;

	
	public NaturePV() {
		
	}

	public NaturePV(String rcCodeNaturePV, String libNaturePV) {
		super();
		this.rcCodeNaturePV = rcCodeNaturePV;
		this.libNaturePV = libNaturePV;
	}

	/**
	 * @return the rcCodeNaturePV
	 */
	public String getRcCodeNaturePV() {
		return rcCodeNaturePV;
	}

	/**
	 * @param rcCodeNaturePV the rcCodeNaturePV to set
	 */
	public void setRcCodeNaturePV(String rcCodeNaturePV) {
		this.rcCodeNaturePV = rcCodeNaturePV;
	}

	/**
	 * @return the libNaturePV
	 */
	public String getLibNaturePV() {
		return libNaturePV;
	}

	/**
	 * @param libNaturePV the libNaturePV to set
	 */
	public void setLibNaturePV(String libNaturePV) {
		this.libNaturePV = libNaturePV;
	}
	
	
    
}
