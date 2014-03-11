package sn.com.douane.ejb.rc.model.dto;

import java.io.Serializable;
import java.util.List;
import sn.com.douane.ejb.rc.model.entities.ProfilGroupe;
import sn.com.douane.utils.sysEnv;


public class GroupefonctionDto implements Serializable{


	private static final long serialVersionUID = 1403539986316138736L;
	private Integer rcCodeGroupe;
	private Integer rcCodeGrpPere;
	private String rcLibGroupe;
	private Integer rcOrdreAffichage;
	private List<ProfilGroupe> profilGroupes;
	private String pk; 
	private String editCell; 
	private String delCell;
	
	public GroupefonctionDto() {
		super();
	}

	public Integer getRcCodeGroupe() {
		return rcCodeGroupe;
	}

	public void setRcCodeGroupe(Integer rcCodeGroupe) {
		this.rcCodeGroupe = rcCodeGroupe;
	}

	public Integer getRcCodeGrpPere() {
		return rcCodeGrpPere;
	}

	public void setRcCodeGrpPere(Integer rcCodeGrpPere) {
		this.rcCodeGrpPere = rcCodeGrpPere;
	}

	public String getRcLibGroupe() {
		return rcLibGroupe;
	}

	public void setRcLibGroupe(String rcLibGroupe) {
		this.rcLibGroupe = rcLibGroupe;
	}

	public Integer getRcOrdreAffichage() {
		return rcOrdreAffichage;
	}

	public void setRcOrdreAffichage(Integer rcOrdreAffichage) {
		this.rcOrdreAffichage = rcOrdreAffichage;
	}

	public List<ProfilGroupe> getProfilGroupes() {
		return profilGroupes;
	}

	public void setProfilGroupes(List<ProfilGroupe> profilGroupes) {
		this.profilGroupes = profilGroupes;
	}

	public String getPk() {
		pk = sysEnv.IntegerToStr(rcCodeGroupe);
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
