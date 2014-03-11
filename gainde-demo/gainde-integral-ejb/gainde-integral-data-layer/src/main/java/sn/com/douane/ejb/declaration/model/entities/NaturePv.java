package sn.com.douane.ejb.declaration.model.entities;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="NATUREPV")
public class NaturePv implements Serializable{
	
	
	private static final long serialVersionUID = 3483381199588465831L;
	
	
	@Id
	@javax.persistence.Column(name="RCCODENATUREPV", length=2, nullable=false)
	private java.lang.String rcCodeNaturePv;
	
	@javax.persistence.Column(name="LIBNATUREPV", length=100)
	private java.lang.String libNaturePv;
	
	public java.lang.String getRcCodeNaturePv() {
		return rcCodeNaturePv;
	}
	public void setRcCodeNaturePv(java.lang.String rcCodeNaturePv) {
		this.rcCodeNaturePv = rcCodeNaturePv;
	}
	public java.lang.String getLibNaturePv() {
		return libNaturePv;
	}
	public void setLibNaturePv(java.lang.String libNaturePv) {
		this.libNaturePv = libNaturePv;
	}
	public NaturePv() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
}
