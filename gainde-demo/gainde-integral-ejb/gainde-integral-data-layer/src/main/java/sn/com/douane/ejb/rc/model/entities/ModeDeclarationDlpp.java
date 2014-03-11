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
@Table(name="MODEDECLARATIONDLPP")
public class ModeDeclarationDlpp implements Serializable{

	private static final long serialVersionUID = 3298942841610329648L;

	@Id
	@Column(name="RCCODEMODEDECDLPP", length=2, nullable=false)
	private String rcCodeModeDecDlpp;

	@Column(name="RCLIBELLEMODEDECDLPP", length=50, nullable=false)
	private String rcLibelleModeDecDlpp;

	public ModeDeclarationDlpp() {

	}

	public ModeDeclarationDlpp(String rcCodeModeDecDlpp,
			String rcLibelleModeDecDlpp) {
		super();
		this.rcCodeModeDecDlpp = rcCodeModeDecDlpp;
		this.rcLibelleModeDecDlpp = rcLibelleModeDecDlpp;
	}

	/**
	 * @return the rcCodeModeDecDlpp
	 */
	public String getRcCodeModeDecDlpp() {
		return rcCodeModeDecDlpp;
	}

	/**
	 * @param rcCodeModeDecDlpp the rcCodeModeDecDlpp to set
	 */
	public void setRcCodeModeDecDlpp(String rcCodeModeDecDlpp) {
		this.rcCodeModeDecDlpp = rcCodeModeDecDlpp;
	}

	/**
	 * @return the rcLibelleModeDecDlpp
	 */
	public String getRcLibelleModeDecDlpp() {
		return rcLibelleModeDecDlpp;
	}

	/**
	 * @param rcLibelleModeDecDlpp the rcLibelleModeDecDlpp to set
	 */
	public void setRcLibelleModeDecDlpp(String rcLibelleModeDecDlpp) {
		this.rcLibelleModeDecDlpp = rcLibelleModeDecDlpp;
	}
	

}
