package sn.com.douane.web.rc.form;

import java.io.Serializable;
import java.sql.Date;
import java.util.ArrayList;
import java.util.List;
import sn.com.douane.ejb.rc.model.entities.AmbassadeOrganisme;
import sn.com.douane.utils.sysEnv;


public class RcAmbassadeorganismeForm implements Serializable {

	private static final long serialVersionUID = 1L;
	private String pk;
	private String etat;

	/*** Attributs Table AMBASSADEORGANISME ***/
	//Champs de saisie
	private String numListRcCodePPM;
	private String numRcCodeSuspension;
	private String datRcDateRegimePref;
	private String datRcDateRetrait;
	private String datRcDateSuspension;
	private String numRcNatRegimePref;
	private String numRcNumRegimePref;
	private String numRcNumRetrait;
	private String numRsNumSuspension;
	private String numTypeOB;

	//Champs de recherche
	private String numListRcCodePPMRech;
	private String numRcCodeSuspensionRech;
	private String datRcDateRegimePrefRech;
	private String datRcDateRetraitRech;
	private String datRcDateSuspensionRech;
	private String numRcNatRegimePrefRech;
	private String numRcNumRegimePrefRech;
	private String numRcNumRetraitRech;
	private String numRsNumSuspensionRech;

	/**
	 * variables du Grid 
	 */
	private Integer rows ;
	private Integer page ;
	private String  sord;
	private String  sidx;
	private Integer total;
	private Integer records;
	private String index;
	
	private List listeRcAmbassadeorganisme = new ArrayList();
	private AmbassadeOrganisme ambassadeorganismevo = new AmbassadeOrganisme();

	/*** M�thode getNewAMBASSADEORGANISMEVO () ***/
	public AmbassadeOrganisme getNewRcAmbassadeorganismeVO() {
		AmbassadeOrganisme ambassadeorganismevo = new AmbassadeOrganisme();

		ambassadeorganismevo.setRcCodePpm(getNumListRcCodePPM());
		ambassadeorganismevo.setRcCodeSuspension(getNumRcCodeSuspension());
		if (getDatRcDateRegimePref()!=null && !getDatRcDateRegimePref().equals("")){
			ambassadeorganismevo.setRcDateRegimePref(new Date(sysEnv.strToDate(getDatRcDateRegimePref()).getTime()));
		}
		if (getDatRcDateRetrait()!=null && !getDatRcDateRetrait().equals("")){
			ambassadeorganismevo.setRcDateRetrait(new Date(sysEnv.strToDate(getDatRcDateRetrait()).getTime()));
		}
		if (getDatRcDateSuspension()!=null && !getDatRcDateSuspension().equals("")){
			ambassadeorganismevo.setRcDateSuspension(new Date(sysEnv.strToDate(getDatRcDateSuspension()).getTime()));
		}
		ambassadeorganismevo.setRcNatRegimePref(getNumRcNatRegimePref());
		ambassadeorganismevo.setRcNumRegimePref(getNumRcNumRegimePref());
		ambassadeorganismevo.setRcNumRetrait(getNumRcNumRetrait());
		ambassadeorganismevo.setRsNumSuspension(getNumRsNumSuspension());
//		ambassadeorganismevo.setTypeorgamb(getNumTypeOB());
		return ambassadeorganismevo;
	}

	/*** M�thode setAmbassadeorganisme () ***/
	public void setAmbassadeorganisme (AmbassadeOrganisme ambassadeorganismevo) {

		setNumListRcCodePPM (ambassadeorganismevo.getRcCodePpm());
		setNumRcCodeSuspension (ambassadeorganismevo.getRcCodeSuspension());
		if (ambassadeorganismevo.getRcDateRegimePref()!=null){
			setDatRcDateRegimePref (sysEnv.dateToStr(new Date(ambassadeorganismevo.getRcDateRegimePref().getTime())));
		}
		if (ambassadeorganismevo.getRcDateRetrait()!=null){
			setDatRcDateRetrait (sysEnv.dateToStr(new Date(ambassadeorganismevo.getRcDateRetrait().getTime())));
		}
		if (ambassadeorganismevo.getRcDateSuspension()!=null){
			setDatRcDateSuspension (sysEnv.dateToStr(new Date(ambassadeorganismevo.getRcDateSuspension().getTime())));
		}
		setNumRcNatRegimePref (ambassadeorganismevo.getRcNatRegimePref());
		setNumRcNumRegimePref(ambassadeorganismevo.getRcNumRegimePref());
		setNumRcNumRetrait (ambassadeorganismevo.getRcNumRetrait());
		setNumRsNumSuspension (ambassadeorganismevo.getRsNumSuspension());

	}

	/*** M�thodes reset ***/
	public void reset() {
		 numListRcCodePPM ="";
		 numRcCodeSuspension ="";
		 datRcDateRegimePref ="";
		 datRcDateRetrait ="";
		 datRcDateSuspension ="";
		 numRcNatRegimePref ="";
		 numRcNumRegimePref ="";
		 numRcNumRetrait ="";
		 numRsNumSuspension ="";
	}
	public void resetChampsRecherche() {
		 numListRcCodePPMRech ="";
		 numRcCodeSuspensionRech ="";
		 datRcDateRegimePrefRech ="";
		 datRcDateRetraitRech ="";
		 datRcDateSuspensionRech ="";
		 numRcNatRegimePrefRech ="";
		 numRcNumRegimePrefRech ="";
		 numRcNumRetraitRech ="";
		 numRsNumSuspensionRech ="";
	}

	/*** M�thodes get et set ***/

	public String getNumListRcCodePPM() {
		return numListRcCodePPM;
	}

	public void setNumListRcCodePPM(String numListRcCodePPM) {
		this.numListRcCodePPM = numListRcCodePPM;
	}

	public String getNumRcCodeSuspension() {
		return numRcCodeSuspension;
	}

	public void setNumRcCodeSuspension(String numRcCodeSuspension) {
		this.numRcCodeSuspension = numRcCodeSuspension;
	}

	public String getDatRcDateRegimePref() {
		return datRcDateRegimePref;
	}

	public void setDatRcDateRegimePref(String datRcDateRegimePref) {
		this.datRcDateRegimePref = datRcDateRegimePref;
	}

	public String getDatRcDateRetrait() {
		return datRcDateRetrait;
	}

	public void setDatRcDateRetrait(String datRcDateRetrait) {
		this.datRcDateRetrait = datRcDateRetrait;
	}

	public String getDatRcDateSuspension() {
		return datRcDateSuspension;
	}

	public void setDatRcDateSuspension(String datRcDateSuspension) {
		this.datRcDateSuspension = datRcDateSuspension;
	}

	public String getNumRcNatRegimePref() {
		return numRcNatRegimePref;
	}

	public void setNumRcNatRegimePref(String numRcNatRegimePref) {
		this.numRcNatRegimePref = numRcNatRegimePref;
	}

	public String getNumRcNumRegimePref() {
		return numRcNumRegimePref;
	}

	public void setNumRcNumRegimePref(String numRcNumRegimePref) {
		this.numRcNumRegimePref = numRcNumRegimePref;
	}

	public String getNumRcNumRetrait() {
		return numRcNumRetrait;
	}

	public void setNumRcNumRetrait(String numRcNumRetrait) {
		this.numRcNumRetrait = numRcNumRetrait;
	}

	public String getNumRsNumSuspension() {
		return numRsNumSuspension;
	}

	public void setNumRsNumSuspension(String numRsNumSuspension) {
		this.numRsNumSuspension = numRsNumSuspension;
	}

	public String getNumTypeOB() {
		return numTypeOB;
	}

	public void setNumTypeOB(String numTypeOB) {
		this.numTypeOB = numTypeOB;
	}

	public String getNumListRcCodePPMRech() {
		return numListRcCodePPMRech;
	}

	public void setNumListRcCodePPMRech(String numListRcCodePPMRech) {
		this.numListRcCodePPMRech = numListRcCodePPMRech;
	}

	public String getNumRcCodeSuspensionRech() {
		return numRcCodeSuspensionRech;
	}

	public void setNumRcCodeSuspensionRech(String numRcCodeSuspensionRech) {
		this.numRcCodeSuspensionRech = numRcCodeSuspensionRech;
	}

	public String getDatRcDateRegimePrefRech() {
		return datRcDateRegimePrefRech;
	}

	public void setDatRcDateRegimePrefRech(String datRcDateRegimePrefRech) {
		this.datRcDateRegimePrefRech = datRcDateRegimePrefRech;
	}

	public String getDatRcDateRetraitRech() {
		return datRcDateRetraitRech;
	}

	public void setDatRcDateRetraitRech(String datRcDateRetraitRech) {
		this.datRcDateRetraitRech = datRcDateRetraitRech;
	}

	public String getDatRcDateSuspensionRech() {
		return datRcDateSuspensionRech;
	}

	public void setDatRcDateSuspensionRech(String datRcDateSuspensionRech) {
		this.datRcDateSuspensionRech = datRcDateSuspensionRech;
	}

	public String getNumRcNatRegimePrefRech() {
		return numRcNatRegimePrefRech;
	}

	public void setNumRcNatRegimePrefRech(String numRcNatRegimePrefRech) {
		this.numRcNatRegimePrefRech = numRcNatRegimePrefRech;
	}

	public String getNumRcNumRegimePrefRech() {
		return numRcNumRegimePrefRech;
	}

	public void setNumRcNumRegimePrefRech(String numRcNumRegimePrefRech) {
		this.numRcNumRegimePrefRech = numRcNumRegimePrefRech;
	}

	public String getNumRcNumRetraitRech() {
		return numRcNumRetraitRech;
	}

	public void setNumRcNumRetraitRech(String numRcNumRetraitRech) {
		this.numRcNumRetraitRech = numRcNumRetraitRech;
	}

	public String getNumRsNumSuspensionRech() {
		return numRsNumSuspensionRech;
	}

	public void setNumRsNumSuspensionRech(String numRsNumSuspensionRech) {
		this.numRsNumSuspensionRech = numRsNumSuspensionRech;
	}

	public List getListeRcAmbassadeorganisme() {
		return listeRcAmbassadeorganisme;
	}

	public void setListeRcAmbassadeorganisme(List listeRcAmbassadeorganisme) {
		this.listeRcAmbassadeorganisme = listeRcAmbassadeorganisme;
	}

	public AmbassadeOrganisme getAmbassadeorganismevo() {
		return ambassadeorganismevo;
	}

	public void setAmbassadeorganismevo(AmbassadeOrganisme ambassadeorganismevo) {
		this.ambassadeorganismevo = ambassadeorganismevo;
	}

	public String getPk () {
		return pk;
	}
	
	public void setPk (String pk) {
		this.pk = pk;
	}

	public String getEtat () {
		return etat;
	}

	public void setEtat (String etat) {
		this.etat = etat;
	}

	public Integer getRows() {
		return rows;
	}

	public void setRows(Integer rows) {
		this.rows = rows;
	}

	public Integer getPage() {
		return page;
	}

	public void setPage(Integer page) {
		this.page = page;
	}

	public String getSord() {
		return sord;
	}

	public void setSord(String sord) {
		this.sord = sord;
	}

	public String getSidx() {
		return sidx;
	}

	public void setSidx(String sidx) {
		this.sidx = sidx;
	}

	public Integer getTotal() {
		return total;
	}

	public void setTotal(Integer total) {
		this.total = total;
	}

	public Integer getRecords() {
		return records;
	}

	public void setRecords(Integer records) {
		this.records = records;
		if (this.records > 0 && this.rows > 0) {
			this.total = (int) Math.ceil((double) this.records
					/ (double) this.rows);
		} else {
			this.total = 0;
		}
	}

	public String getIndex() {
		return index;
	}

	public void setIndex(String index) {
		this.index = index;
	}
	
}