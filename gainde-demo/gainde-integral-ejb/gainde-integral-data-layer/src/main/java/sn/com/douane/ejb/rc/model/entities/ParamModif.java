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
@Table(name="PARAMMODIFS")
public class ParamModif implements Serializable{

	private static final long serialVersionUID = 5161515442959885344L;

	@Id
	@Column(name="RCINDICPARAM", length=30, nullable=false)
	private String rcIndicParam;
	  
	@Column(name="RCDESCRIPTIF", length=100, nullable=false)
	private String rcDescriptif;
	 
	@Column(name="RCVALEURALPHA", length=30)
	private String rcValeurAlpha;
	 
	@Column(name="RCVALEURNUM")
	private Integer rcValeurNum;

	public ParamModif() {

	}

	public ParamModif(String rcIndicParam, String rcDescriptif) {
		super();
		this.rcIndicParam = rcIndicParam;
		this.rcDescriptif = rcDescriptif;
	}

	public String getRcIndicParam() {
		return rcIndicParam;
	}

	public void setRcIndicParam(String rcIndicParam) {
		this.rcIndicParam = rcIndicParam;
	}

	public String getRcDescriptif() {
		return rcDescriptif;
	}

	public void setRcDescriptif(String rcDescriptif) {
		this.rcDescriptif = rcDescriptif;
	}

	public String getRcValeurAlpha() {
		return rcValeurAlpha;
	}

	public void setRcValeurAlpha(String rcValeurAlpha) {
		this.rcValeurAlpha = rcValeurAlpha;
	}

	public Integer getRcValeurNum() {
		return rcValeurNum;
	}

	public void setRcValeurNum(Integer rcValeurNum) {
		this.rcValeurNum = rcValeurNum;
	}
	 
	
}
