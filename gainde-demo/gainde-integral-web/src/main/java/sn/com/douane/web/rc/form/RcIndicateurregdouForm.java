package sn.com.douane.web.rc.form;

import java.io.Serializable;
import java.sql.Date;
import java.util.ArrayList;
import java.util.List;
import sn.com.douane.ejb.rc.exception.ConstErrCodRC;
import sn.com.douane.ejb.rc.exception.TwreException;
import sn.com.douane.ejb.rc.model.entities.IndicateurRegdou;
import sn.com.douane.utils.DateUtil;


public class RcIndicateurregdouForm implements Serializable {

	private static final long serialVersionUID = 1L;
	private String pk;
	private String etat;

	/*** Attributs Table INDICATEURREGDOU ***/
	//Champs de saisie
	private String numListRcCodeIndicateurOB;
	private String numListRcCodeRegimeDouanierOB;
	private String datRcDateCloture;
	private String datRcDateValiditeOB;
	private String numListRcTypeRegimeOB;

	//Champs de recherche
	private String numListRcCodeIndicateurRech;
	private String numListRcCodeRegimeDouanierRech;
	private String datRcDateClotureRech;
	private String datRcDateValiditeRech;
	private String numListRcTypeRegimeRech;

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
	
	List listeRcIndicateurregdou = new ArrayList();
	IndicateurRegdou indicateurregdouvo = new IndicateurRegdou();

	/*** M�thode getNewINDICATEURREGDOUVO () **
	 * @throws TwreException*/
	public IndicateurRegdou getNewRcIndicateurregdouVO() throws TwreException {
		IndicateurRegdou indicateurregdouvo = new IndicateurRegdou();

		indicateurregdouvo.setRcCodeIndicateur(getNumListRcCodeIndicateurOB());
		String regdou=getNumListRcCodeRegimeDouanierOB();
		if(regdou!=null && regdou.length()==2){
			System.err.println(regdou.substring(0,1)+"=codereg=="+regdou.substring(1));
		 indicateurregdouvo.setRcCodeRegimeDouanier(regdou.substring(1));
		 indicateurregdouvo.setRcTypeRegime(regdou.substring(0,1));
		}else
			if(regdou != null && regdou.length()==1)
				throw new TwreException(ConstErrCodRC.regimedouanierKey);
			
		if (getDatRcDateCloture()!=null && !getDatRcDateCloture().equals(""))
			indicateurregdouvo.setRcDateCloture(new Date(DateUtil.convertStringToDate(getDatRcDateCloture()).getTime()));
		if (getDatRcDateValiditeOB()!=null && !getDatRcDateValiditeOB().equals(""))
			indicateurregdouvo.setRcDateValidite(new Date(DateUtil.convertStringToDate(getDatRcDateValiditeOB()).getTime()));

		return indicateurregdouvo;
	}

	/*** M�thode setIndicateurregdou () ***/
	public void setIndicateurregdou (IndicateurRegdou indicateurregdouvo) {

		setNumListRcCodeIndicateurOB (indicateurregdouvo.getRcCodeIndicateur());
		setNumListRcCodeRegimeDouanierOB (indicateurregdouvo.getRcTypeRegime()+indicateurregdouvo.getRcCodeRegimeDouanier());
		if (indicateurregdouvo.getRcDateCloture()!=null)
			setDatRcDateCloture (DateUtil.getDate(new Date(indicateurregdouvo.getRcDateCloture().getTime())));
		if (indicateurregdouvo.getRcDateValidite()!=null)
			setDatRcDateValiditeOB (DateUtil.getDate(new Date(indicateurregdouvo.getRcDateValidite().getTime())));

	}

	/*** M�thodes reset ***/
	public void reset() {
		numListRcCodeIndicateurOB="";
		numListRcCodeRegimeDouanierOB="";
		datRcDateCloture="";
		datRcDateValiditeOB="";
		numListRcTypeRegimeOB="";
	}
	public void resetChampsRecherche() {
		numListRcCodeIndicateurRech="";
		numListRcCodeRegimeDouanierRech="";
		datRcDateClotureRech="";
		datRcDateValiditeRech="";
		numListRcTypeRegimeRech="";
	}

	public String getNumListRcCodeIndicateurOB() {
		return numListRcCodeIndicateurOB;
	}

	public void setNumListRcCodeIndicateurOB(String numListRcCodeIndicateurOB) {
		this.numListRcCodeIndicateurOB = numListRcCodeIndicateurOB;
	}

	public String getNumListRcCodeRegimeDouanierOB() {
		return numListRcCodeRegimeDouanierOB;
	}

	public void setNumListRcCodeRegimeDouanierOB(String numListRcCodeRegimeDouanierOB) {
		this.numListRcCodeRegimeDouanierOB = numListRcCodeRegimeDouanierOB;
	}

	public String getDatRcDateCloture() {
		return datRcDateCloture;
	}

	public void setDatRcDateCloture(String datRcDateCloture) {
		this.datRcDateCloture = datRcDateCloture;
	}

	public String getDatRcDateValiditeOB() {
		return datRcDateValiditeOB;
	}

	public void setDatRcDateValiditeOB(String datRcDateValiditeOB) {
		this.datRcDateValiditeOB = datRcDateValiditeOB;
	}

	public String getNumListRcTypeRegimeOB() {
		return numListRcTypeRegimeOB;
	}

	public void setNumListRcTypeRegimeOB(String numListRcTypeRegimeOB) {
		this.numListRcTypeRegimeOB = numListRcTypeRegimeOB;
	}

	public String getNumListRcCodeIndicateurRech() {
		return numListRcCodeIndicateurRech;
	}

	public void setNumListRcCodeIndicateurRech(String numListRcCodeIndicateurRech) {
		this.numListRcCodeIndicateurRech = numListRcCodeIndicateurRech;
	}

	public String getNumListRcCodeRegimeDouanierRech() {
		return numListRcCodeRegimeDouanierRech;
	}

	public void setNumListRcCodeRegimeDouanierRech(String numListRcCodeRegimeDouanierRech) {
		this.numListRcCodeRegimeDouanierRech = numListRcCodeRegimeDouanierRech;
	}

	public String getDatRcDateClotureRech() {
		return datRcDateClotureRech;
	}

	public void setDatRcDateClotureRech(String datRcDateClotureRech) {
		this.datRcDateClotureRech = datRcDateClotureRech;
	}

	public String getDatRcDateValiditeRech() {
		return datRcDateValiditeRech;
	}

	public void setDatRcDateValiditeRech(String datRcDateValiditeRech) {
		this.datRcDateValiditeRech = datRcDateValiditeRech;
	}

	public String getNumListRcTypeRegimeRech() {
		return numListRcTypeRegimeRech;
	}

	public void setNumListRcTypeRegimeRech(String numListRcTypeRegimeRech) {
		this.numListRcTypeRegimeRech = numListRcTypeRegimeRech;
	}

	public List getListeRcIndicateurregdou() {
		return listeRcIndicateurregdou;
	}

	public void setListeRcIndicateurregdou(List listeRcIndicateurregdou) {
		this.listeRcIndicateurregdou = listeRcIndicateurregdou;
	}

	public IndicateurRegdou getIndicateurregdouvo() {
		return indicateurregdouvo;
	}

	public void setIndicateurregdouvo(IndicateurRegdou indicateurregdouvo) {
		this.indicateurregdouvo = indicateurregdouvo;
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