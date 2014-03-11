package sn.com.douane.ejb.rc.model.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name = "TypeSoumission")
public class TypeSoumission implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Id
	@Column(name = "RCCODESOUMISS")
	private Integer rccodesoumiss;

	@Column(name = "RCLIBELLESOUMISS" ,length = 100,nullable = false)
    private String rclibellesoumiss;

	@Column(name = "RCSCORETYPESOUM" ,nullable = false)
    private Integer rcscoretypesoum;
    
	
	public TypeSoumission() {
		super();
	}
	public TypeSoumission(Integer rccodesoumiss) {
		super();
		this.rccodesoumiss = rccodesoumiss;
	}
	public TypeSoumission(Integer rccodesoumiss, String rclibellesoumiss,
			Integer rcscoretypesoum) {
		super();
		this.rccodesoumiss = rccodesoumiss;
		this.rclibellesoumiss = rclibellesoumiss;
		this.rcscoretypesoum = rcscoretypesoum;
	}
	
	
	public java.lang.Integer getRccodesoumiss() {
		return rccodesoumiss;
	}
	public void setRccodesoumiss(java.lang.Integer rccodesoumiss) {
		this.rccodesoumiss = rccodesoumiss;
	}
	public java.lang.String getRclibellesoumiss() {
		return rclibellesoumiss;
	}
	public void setRclibellesoumiss(java.lang.String rclibellesoumiss) {
		this.rclibellesoumiss = rclibellesoumiss;
	}
	public java.lang.Integer getRcscoretypesoum() {
		return rcscoretypesoum;
	}
	public void setRcscoretypesoum(java.lang.Integer rcscoretypesoum) {
		this.rcscoretypesoum = rcscoretypesoum;
	}
	
	
	
	
}