package sn.com.douane.ejb.rc.model.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="TYPECONVOCATION")
public class TypeConvocation implements Serializable{

	private static final long serialVersionUID = 2589129754913952311L;

	@Id
	@Column(name="RCCODETYPECONVOC", length=2, nullable=false)
	private String rcCodeTypeConvoc;
	
	@Column(name="RCLIBELLETYPECONVOC", length=100, nullable=false)
    private String rcLibelleTypeConvoc;

	public TypeConvocation() {

	}

	public TypeConvocation(String rcCodeTypeConvoc, String rcLibelleTypeConvoc) {
		super();
		this.rcCodeTypeConvoc = rcCodeTypeConvoc;
		this.rcLibelleTypeConvoc = rcLibelleTypeConvoc;
	}

	/**
	 * @return the rcCodeTypeConvoc
	 */
	public String getRcCodeTypeConvoc() {
		return rcCodeTypeConvoc;
	}

	/**
	 * @param rcCodeTypeConvoc the rcCodeTypeConvoc to set
	 */
	public void setRcCodeTypeConvoc(String rcCodeTypeConvoc) {
		this.rcCodeTypeConvoc = rcCodeTypeConvoc;
	}

	/**
	 * @return the rcLibelleTypeConvoc
	 */
	public String getRcLibelleTypeConvoc() {
		return rcLibelleTypeConvoc;
	}

	/**
	 * @param rcLibelleTypeConvoc the rcLibelleTypeConvoc to set
	 */
	public void setRcLibelleTypeConvoc(String rcLibelleTypeConvoc) {
		this.rcLibelleTypeConvoc = rcLibelleTypeConvoc;
	}
	
	
}
