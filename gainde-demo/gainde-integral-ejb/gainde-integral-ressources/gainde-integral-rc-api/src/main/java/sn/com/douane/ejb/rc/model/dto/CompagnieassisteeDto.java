package sn.com.douane.ejb.rc.model.dto;

import java.io.Serializable;
import sn.com.douane.utils.sysEnv;
public class CompagnieassisteeDto implements Serializable {


private static final long serialVersionUID = -9154455716898092216L;

	private Integer codeCieAssistee;
	private String nomCieAssistee;
	private String pk;
	private String editCell; 
	private String delCell;
	
	public CompagnieassisteeDto() {
		super();
	}

	public Integer getCodeCieAssistee() {
		return codeCieAssistee;
	}

	public void setCodeCieAssistee(Integer codeCieAssistee) {
		this.codeCieAssistee = codeCieAssistee;
	}

	public String getNomCieAssistee() {
		return nomCieAssistee;
	}

	public void setNomCieAssistee(String nomCieAssistee) {
		this.nomCieAssistee = nomCieAssistee;
	}

	public String getPk() {
		pk = sysEnv.IntegerToStr(codeCieAssistee);
		return pk;
	}

	public void setPk(String pk) {
		this.pk = pk;
	}

	public String getEditCell() {
		return editCell;
	}

	public void setEditCell(String editCell) {
		this.editCell = editCell;
	}

	public String getDelCell() {
		return delCell;
	}

	public void setDelCell(String delCell) {
		this.delCell = delCell;
	}

	
}
