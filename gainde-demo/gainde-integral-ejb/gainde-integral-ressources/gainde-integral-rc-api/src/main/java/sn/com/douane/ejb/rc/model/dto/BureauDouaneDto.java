package sn.com.douane.ejb.rc.model.dto;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import sn.com.douane.ejb.rc.model.entities.BureauDouane;
import sn.com.douane.utils.sysEnv;

public class BureauDouaneDto implements Serializable {

	private static final long serialVersionUID = -6442817499319481248L;

	private String rccodeburdouane;
	private String rclibelleburdouane;
	private String manifesteobligatoire;
	private String rcrepartition;
	private String rcCompetence;
	private Integer rcTypeBurDouane;
	private String rcGenreBur;

	private String libCompBureau;
	private String libGenreBureau;
	private String libTypeBureau;

	private String pk;
	private String editCellSM;
	private String editCellC;
	private String deleteCell;
	
	public static BureauDouaneDto getBureauDouaneDto(BureauDouane bureauDouane) {
		BureauDouaneDto bureauDouaneDto = new BureauDouaneDto();
		if (bureauDouane != null) {
			bureauDouaneDto.setPk(bureauDouane.getRccodeburdouane());
			bureauDouaneDto.setDeleteCell(bureauDouane.getRccodeburdouane());
			bureauDouaneDto.setEditCellC(bureauDouane.getRccodeburdouane());
			bureauDouaneDto.setEditCellSM(bureauDouane.getRccodeburdouane());
			bureauDouaneDto.setRccodeburdouane(bureauDouane.getRccodeburdouane());
			bureauDouaneDto.setRclibelleburdouane(bureauDouane.getRclibelleburdouane());
			bureauDouaneDto.setManifesteobligatoire(bureauDouane.getManifesteobligatoire());
			bureauDouaneDto.setRcrepartition(bureauDouane.getRcrepartition());
			bureauDouaneDto.setRcCompetence(bureauDouaneDto.getRcCompetence());
			bureauDouaneDto.setRcTypeBurDouane(bureauDouane.getRcTypeBurDouane());
			bureauDouaneDto.setRcGenreBur(bureauDouaneDto.getRcGenreBur());
			if (bureauDouane.getCompBureau() != null) {
				bureauDouaneDto.setLibCompBureau(bureauDouane.getCompBureau()
						.getRccodecompetence()
						+ " - "
						+ bureauDouane.getCompBureau().getRcdescompetences());
			}
			if (bureauDouane.getGenreBureau() != null) {
				bureauDouaneDto.setLibGenreBureau(bureauDouane.getGenreBureau()
						.getRcgenrebureau()
						+ " - "
						+ bureauDouane.getGenreBureau().getRcdesgenrebureau());
			}
			if (bureauDouane.getTypeBureau() != null) {
				bureauDouaneDto.setLibTypeBureau(bureauDouane.getTypeBureau()
						.getRclibelletypebur());
			}
		}
		return bureauDouaneDto;
	}
	
	public static List<BureauDouaneDto> getListBureauDouaneDto(List<BureauDouane> listBureauDouane){
		List<BureauDouaneDto> listBureauDouaneDto=new ArrayList<BureauDouaneDto>();
		if(!sysEnv.isNullOrEmpty(listBureauDouane)){
			for (BureauDouane bureauDouane : listBureauDouane) {
				listBureauDouaneDto.add(getBureauDouaneDto(bureauDouane));
			}
		}
		return listBureauDouaneDto;
	}

	public String getRccodeburdouane() {
		return rccodeburdouane;
	}

	public void setRccodeburdouane(String rccodeburdouane) {
		this.rccodeburdouane = rccodeburdouane;
	}

	public String getRclibelleburdouane() {
		return rclibelleburdouane;
	}

	public void setRclibelleburdouane(String rclibelleburdouane) {
		this.rclibelleburdouane = rclibelleburdouane;
	}

	public String getManifesteobligatoire() {
		return manifesteobligatoire;
	}

	public void setManifesteobligatoire(String manifesteobligatoire) {
		this.manifesteobligatoire = manifesteobligatoire;
	}

	public String getRcrepartition() {
		return rcrepartition;
	}

	public void setRcrepartition(String rcrepartition) {
		this.rcrepartition = rcrepartition;
	}

	public String getRcCompetence() {
		return rcCompetence;
	}

	public void setRcCompetence(String rcCompetence) {
		this.rcCompetence = rcCompetence;
	}

	public Integer getRcTypeBurDouane() {
		return rcTypeBurDouane;
	}

	public void setRcTypeBurDouane(Integer rcTypeBurDouane) {
		this.rcTypeBurDouane = rcTypeBurDouane;
	}

	public String getRcGenreBur() {
		return rcGenreBur;
	}

	public void setRcGenreBur(String rcGenreBur) {
		this.rcGenreBur = rcGenreBur;
	}

	public String getLibCompBureau() {
		return libCompBureau;
	}

	public void setLibCompBureau(String libCompBureau) {
		this.libCompBureau = libCompBureau;
	}

	public String getLibGenreBureau() {
		return libGenreBureau;
	}

	public void setLibGenreBureau(String libGenreBureau) {
		this.libGenreBureau = libGenreBureau;
	}

	public String getLibTypeBureau() {
		return libTypeBureau;
	}

	public void setLibTypeBureau(String libTypeBureau) {
		this.libTypeBureau = libTypeBureau;
	}

	public String getPk() {
		pk=rccodeburdouane;
		return pk;
	}

	public void setPk(String pk) {
		this.pk = pk;
	}

	public String getEditCellSM() {
		return editCellSM;
	}

	public void setEditCellSM(String editCellSM) {
		this.editCellSM = editCellSM;
	}

	public String getEditCellC() {
		return editCellC;
	}

	public void setEditCellC(String editCellC) {
		this.editCellC = editCellC;
	}

	public String getDeleteCell() {
		return deleteCell;
	}

	public void setDeleteCell(String deleteCell) {
		this.deleteCell = deleteCell;
	}

}
