package sn.com.douane.web.rc.form;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import sn.com.douane.ejb.rc.model.dto.BureauDouaneDto;
import sn.com.douane.ejb.rc.model.entities.BureauDouane;
import sn.com.douane.ejb.rc.model.entities.CompBureau;
import sn.com.douane.ejb.rc.model.entities.GenreBureau;
import sn.com.douane.ejb.rc.model.entities.TypeBureau;
import sn.com.douane.utils.ConvertUtil;
import sn.com.douane.utils.LabelValue;
import sn.com.douane.utils.sysEnv;


public class RcBureaudouaneForm implements Serializable {
	
	private static final long serialVersionUID = -1391114967950893859L;
	
	private String pk;
	private String etat;

	/** * Attributs Table BUREAUDOUANE ** */
	//Champs de saisie
	private String numManifesteOB;
	private String numRcCodeBurDouaneOB;
	private String numListRcCompetenceOB;
	private String numListRcGenreBurOB;
	private String numRcLibelleBurDouaneOB;
	private String numRcRepartition;
	private String numListRcTypeBurDouaneOB;

	//Champs de recherche
	private String numManifesteObligatoireRech;
	private String numRcCodeBurDouaneRech;
	private String numListRcComptenceRech;
	private String numListRcGenreBurRech;
	private String numRcLibelleBurDouaneRech;
	private String numRcRepartitionRech;
	private String numListRcTypeBurDouaneRech;
	
	private List<BureauDouaneDto> listRcBurDouane = new ArrayList<BureauDouaneDto>();
	
	private List<LabelValue> listTypeBurDouane = new ArrayList<LabelValue>();
	private List<LabelValue> listCompBureau = new ArrayList<LabelValue>();
	private List<LabelValue> listGenreBureau = new ArrayList<LabelValue>();
	
	private BureauDouane bureauDouane = new BureauDouane();
	
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
	
	public RcBureaudouaneForm(){
		
	}

	public BureauDouane getNewRcBureaudouane() {
		BureauDouane bureauDouane = new BureauDouane();
		bureauDouane.setManifesteobligatoire(getNumManifesteOB());
		bureauDouane.setRccodeburdouane(getNumRcCodeBurDouaneOB());
		bureauDouane.setRcCompetence(getNumListRcCompetenceOB());
		bureauDouane.setRcGenreBur(getNumListRcGenreBurOB());
		bureauDouane.setRclibelleburdouane(getNumRcLibelleBurDouaneOB());
		bureauDouane.setRcrepartition(getNumRcRepartition());
		if (!sysEnv.isNullOrEmpty(getNumListRcTypeBurDouaneOB())) {
			bureauDouane.setRcTypeBurDouane(Integer.valueOf(
					getNumListRcTypeBurDouaneOB()));
		}
		return bureauDouane;
	}

	public void setBureaudouane(BureauDouane bureauDouane) {
		setNumManifesteOB(bureauDouane.getManifesteobligatoire());
		setNumRcCodeBurDouaneOB(bureauDouane.getRccodeburdouane());
		setNumListRcCompetenceOB(bureauDouane.getRcCompetence());
		setNumListRcGenreBurOB(bureauDouane.getRcGenreBur());
		setNumRcLibelleBurDouaneOB(bureauDouane.getRclibelleburdouane());
		setNumRcRepartition(bureauDouane.getRcrepartition());
		if (bureauDouane.getRcTypeBurDouane() != null){
			setNumListRcTypeBurDouaneOB(ConvertUtil
					.converToString(bureauDouane.getRcTypeBurDouane()));
		}
	}

	public void reset() {
		numManifesteOB = "";
		numRcCodeBurDouaneOB = "";
		numListRcCompetenceOB = "";
		numListRcGenreBurOB = "";
		numRcLibelleBurDouaneOB = "";
		numRcRepartition = "";
		numListRcTypeBurDouaneOB = "";
	}

	public void resetChampsRecherche() {
		numManifesteObligatoireRech = "";
		numRcCodeBurDouaneRech = "";
		numListRcComptenceRech = "";
		numListRcGenreBurRech = "";
		numRcLibelleBurDouaneRech = "";
		numRcRepartitionRech = "";
		numListRcTypeBurDouaneRech = "";
	}

	public String getPk() {
		return pk;
	}

	public void setPk(String pk) {
		this.pk = pk;
	}

	public String getEtat() {
		return etat;
	}

	public void setEtat(String etat) {
		this.etat = etat;
	}

	public String getNumManifesteOB() {
		return numManifesteOB;
	}

	public void setNumManifesteOB(String numManifesteOB) {
		this.numManifesteOB = numManifesteOB;
	}

	public String getNumRcCodeBurDouaneOB() {
		return numRcCodeBurDouaneOB;
	}

	public void setNumRcCodeBurDouaneOB(String numRcCodeBurDouaneOB) {
		this.numRcCodeBurDouaneOB = numRcCodeBurDouaneOB;
	}

	public String getNumListRcCompetenceOB() {
		return numListRcCompetenceOB;
	}

	public void setNumListRcCompetenceOB(String numListRcCompetenceOB) {
		this.numListRcCompetenceOB = numListRcCompetenceOB;
	}

	public String getNumListRcGenreBurOB() {
		return numListRcGenreBurOB;
	}

	public void setNumListRcGenreBurOB(String numListRcGenreBurOB) {
		this.numListRcGenreBurOB = numListRcGenreBurOB;
	}

	public String getNumRcLibelleBurDouaneOB() {
		return numRcLibelleBurDouaneOB;
	}

	public void setNumRcLibelleBurDouaneOB(String numRcLibelleBurDouaneOB) {
		this.numRcLibelleBurDouaneOB = numRcLibelleBurDouaneOB;
	}

	public String getNumRcRepartition() {
		return numRcRepartition;
	}

	public void setNumRcRepartition(String numRcRepartition) {
		this.numRcRepartition = numRcRepartition;
	}

	public String getNumListRcTypeBurDouaneOB() {
		return numListRcTypeBurDouaneOB;
	}

	public void setNumListRcTypeBurDouaneOB(String numListRcTypeBurDouaneOB) {
		this.numListRcTypeBurDouaneOB = numListRcTypeBurDouaneOB;
	}

	public String getNumManifesteObligatoireRech() {
		return numManifesteObligatoireRech;
	}

	public void setNumManifesteObligatoireRech(String numManifesteObligatoireRech) {
		this.numManifesteObligatoireRech = numManifesteObligatoireRech;
	}

	public String getNumRcCodeBurDouaneRech() {
		return numRcCodeBurDouaneRech;
	}

	public void setNumRcCodeBurDouaneRech(String numRcCodeBurDouaneRech) {
		this.numRcCodeBurDouaneRech = numRcCodeBurDouaneRech;
	}

	public String getNumListRcComptenceRech() {
		return numListRcComptenceRech;
	}

	public void setNumListRcComptenceRech(String numListRcComptenceRech) {
		this.numListRcComptenceRech = numListRcComptenceRech;
	}

	public String getNumListRcGenreBurRech() {
		return numListRcGenreBurRech;
	}

	public void setNumListRcGenreBurRech(String numListRcGenreBurRech) {
		this.numListRcGenreBurRech = numListRcGenreBurRech;
	}

	public String getNumRcLibelleBurDouaneRech() {
		return numRcLibelleBurDouaneRech;
	}

	public void setNumRcLibelleBurDouaneRech(String numRcLibelleBurDouaneRech) {
		this.numRcLibelleBurDouaneRech = numRcLibelleBurDouaneRech;
	}

	public String getNumRcRepartitionRech() {
		return numRcRepartitionRech;
	}

	public void setNumRcRepartitionRech(String numRcRepartitionRech) {
		this.numRcRepartitionRech = numRcRepartitionRech;
	}

	public String getNumListRcTypeBurDouaneRech() {
		return numListRcTypeBurDouaneRech;
	}

	public void setNumListRcTypeBurDouaneRech(String numListRcTypeBurDouaneRech) {
		this.numListRcTypeBurDouaneRech = numListRcTypeBurDouaneRech;
	}

	public List<BureauDouaneDto> getListRcBurDouane() {
		return listRcBurDouane;
	}

	public void setListRcBurDouane(List<BureauDouaneDto> listBureauDouaneDto) {
		this.listRcBurDouane = listBureauDouaneDto;
	}

	public List<LabelValue> getListTypeBurDouane() {
		return listTypeBurDouane;
	}

	public void setListTypeBurDouane(List<LabelValue> listTypeBurDouane) {
		this.listTypeBurDouane = listTypeBurDouane;
	}

	public List<LabelValue> getListCompBureau() {
		return listCompBureau;
	}

	public void setListCompBureau(List<LabelValue> listCompBureau) {
		this.listCompBureau = listCompBureau;
	}

	public List<LabelValue> getListGenreBureau() {
		return listGenreBureau;
	}

	public void setListGenreBureau(List<LabelValue> listGenreBureau) {
		this.listGenreBureau = listGenreBureau;
	}

	public BureauDouane getBureauDouane() {
		return bureauDouane;
	}

	public void setBureauDouane(BureauDouane bureauDouane) {
		this.bureauDouane = bureauDouane;
	}

	public List<LabelValue> convertListTypeBurDouane(List<TypeBureau> listTypeBureau) {
		List<LabelValue> convertedList=null;
		if(!sysEnv.isNullOrEmpty(listTypeBureau)){
			convertedList=new ArrayList<LabelValue>();
			for (TypeBureau element : listTypeBureau) {
				LabelValue labelValue=new LabelValue(element.getRccodetypebur()+ " - "+element.getRclibelletypebur(), element.getRccodetypebur()+"");
				convertedList.add(labelValue);
			}
		}
		return convertedList;
	}

	public List<LabelValue> convertListCompBureau(
			List<CompBureau> listCompBureau) {
		List<LabelValue> convertedList=null;
		if(!sysEnv.isNullOrEmpty(listCompBureau)){
			convertedList=new ArrayList<LabelValue>();
			for (CompBureau element : listCompBureau) {
				LabelValue labelValue=new LabelValue(element.getRccodecompetence()+ " - "+element.getRcdescompetences(), element.getRccodecompetence());
				convertedList.add(labelValue);
			}
		}
		return convertedList;
	}

	public List<LabelValue> convertListGenreBureau(
			List<GenreBureau> listGenreBureau) {
		List<LabelValue> convertedList=null;
		if(!sysEnv.isNullOrEmpty(listGenreBureau)){
			convertedList=new ArrayList<LabelValue>();
			for (GenreBureau element : listGenreBureau) {
				LabelValue labelValue=new LabelValue(element.getRcgenrebureau()+ " - "+element.getRcdesgenrebureau(), element.getRcgenrebureau());
				convertedList.add(labelValue);
			}
		}
		return convertedList;
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