package sn.com.douane.ejb.rc.model.dto;

import java.io.Serializable;
import sn.com.douane.utils.ConstManif;


public class RegimeDto implements Serializable{

	private static final long serialVersionUID = -2002379868130836869L;
	private String rcTypeRegime;
	private String rcCodeRegimeDouanier;
	private String rcCodeRegimeFiscal;
	private String rcLibelleRegime;
	private String rcRegimeTaxable;
	private String rcIndicMutat;
	private String rcCircuitVisite;
	private Integer rcDureeEntrepot;
	private String rcIndicateurExo;
	private String rcIndicateurSusp;
	private String typeRegimeCodeDouanier;
	private String pk; 
	private String editCell; 
	private String delCell;
	
	public RegimeDto() {
		super();
	}

	public String getRcTypeRegime() {
		return rcTypeRegime;
	}

	public void setRcTypeRegime(String rcTypeRegime) {
		this.rcTypeRegime = rcTypeRegime;
	}

	public String getRcCodeRegimeDouanier() {
		return rcCodeRegimeDouanier;
	}

	public void setRcCodeRegimeDouanier(String rcCodeRegimeDouanier) {
		this.rcCodeRegimeDouanier = rcCodeRegimeDouanier;
	}

	public String getRcCodeRegimeFiscal() {
		return rcCodeRegimeFiscal;
	}

	public void setRcCodeRegimeFiscal(String rcCodeRegimeFiscal) {
		this.rcCodeRegimeFiscal = rcCodeRegimeFiscal;
	}

	public String getRcLibelleRegime() {
		return rcLibelleRegime;
	}

	public void setRcLibelleRegime(String rcLibelleRegime) {
		this.rcLibelleRegime = rcLibelleRegime;
	}

	public String getRcRegimeTaxable() {
		return rcRegimeTaxable;
	}

	public void setRcRegimeTaxable(String rcRegimeTaxable) {
		this.rcRegimeTaxable = rcRegimeTaxable;
	}

	public String getRcIndicMutat() {
		return rcIndicMutat;
	}

	public void setRcIndicMutat(String rcIndicMutat) {
		this.rcIndicMutat = rcIndicMutat;
	}

	public String getRcCircuitVisite() {
		return rcCircuitVisite;
	}

	public void setRcCircuitVisite(String rcCircuitVisite) {
		this.rcCircuitVisite = rcCircuitVisite;
	}

	public Integer getRcDureeEntrepot() {
		return rcDureeEntrepot;
	}

	public void setRcDureeEntrepot(Integer rcDureeEntrepot) {
		this.rcDureeEntrepot = rcDureeEntrepot;
	}

	public String getRcIndicateurExo() {
		return rcIndicateurExo;
	}

	public void setRcIndicateurExo(String rcIndicateurExo) {
		this.rcIndicateurExo = rcIndicateurExo;
	}

	public String getRcIndicateurSusp() {
		return rcIndicateurSusp;
	}

	public void setRcIndicateurSusp(String rcIndicateurSusp) {
		this.rcIndicateurSusp = rcIndicateurSusp;
	}

	public String getTypeRegimeCodeDouanier() {
		typeRegimeCodeDouanier = rcTypeRegime + rcCodeRegimeDouanier;
		return typeRegimeCodeDouanier;
	}

	public void setTypeRegimeCodeDouanier(String typeRegimeCodeDouanier) {
		this.typeRegimeCodeDouanier = typeRegimeCodeDouanier;
	}

	public String getPk() {
		pk = rcTypeRegime + ConstManif.TIELD + rcCodeRegimeDouanier + ConstManif.TIELD + rcCodeRegimeFiscal;
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
