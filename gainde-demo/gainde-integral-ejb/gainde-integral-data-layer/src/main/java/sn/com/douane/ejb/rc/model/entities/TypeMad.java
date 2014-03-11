package sn.com.douane.ejb.rc.model.entities;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="TYPEMAD")
public class TypeMad implements Serializable{

	private static final long serialVersionUID = 1565242096755084514L;

	@Id
	@Column(name="RCCODETYPEMAD", length=1, nullable=false)
	private String rcCodeTypeMad;

	@Column(name="RCLIBTYPEMAD", length=50, nullable=false)
	private String rcLibTypeMad;
	 
	@OneToMany(mappedBy = "typeMad", targetEntity = Mad.class)
	private List<Mad> mads;
	
	public TypeMad() {
		
	}

	public TypeMad(String rcCodeTypeMad, String rcLibTypeMad) {
		super();
		this.rcCodeTypeMad = rcCodeTypeMad;
		this.rcLibTypeMad = rcLibTypeMad;
	}

	public String getRcCodeTypeMad() {
		return rcCodeTypeMad;
	}

	public void setRcCodeTypeMad(String rcCodeTypeMad) {
		this.rcCodeTypeMad = rcCodeTypeMad;
	}

	public String getRcLibTypeMad() {
		return rcLibTypeMad;
	}

	public void setRcLibTypeMad(String rcLibTypeMad) {
		this.rcLibTypeMad = rcLibTypeMad;
	}

	public List<Mad> getMads() {
		return mads;
	}

	public void setMads(List<Mad> mads) {
		this.mads = mads;
	}
	
	
	
}
