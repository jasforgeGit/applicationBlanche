/*
 * 
 */
package sn.com.douane.web.rc.form;

import java.io.Serializable;
import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.ServletActionContext;

import sn.com.douane.ejb.rc.model.entities.Devises;
import sn.com.douane.ejb.rc.model.entities.Utilisateur;
import sn.com.douane.utils.ConvertUtil;
import sn.com.douane.utils.DateUtil;
import sn.com.douane.utils.sysEnv;

// TODO: Auto-generated Javadoc
/**
 * The Class RcDevisesForm.
 * 
 * @author rkhaskhoussy
 */
public class RcDevisesForm implements Serializable {

	/** The Constant serialVersionUID. */
	private static final long serialVersionUID = 1L;
	/** The pk. */
	private String pk;
	/** The etat. */
	private String etat;

	/** * Attributes Table DEVISES **. */
	// input fields
	private String numRcCodeDeviseOB;
	/** The num rc coefficient ob. */
	private String numRcCoefficientOB;

	/** The dat rc date devise ob. */
	private String datRcDateDeviseOB;

	/** The num rc libelle debise ob. */
	private String numRcLibelleDeviseOB;

	/** The num rc precision dev ob. */
	private String numRcPrecisionDevOB;

	/** The num rc qte c fa ob. */
	private String numRcQteCFaOB;

	/** The num rc qte devise ob. */
	private String numRcQteDeviseOB;

	/** The num rc user modif ob. */
	private String numRcUserModifOB;

	// search criteria
	/** The num rc code devise rech. */
	private String numRcCodeDeviseRech;

	/** The num rc coefficient rech. */
	private String numRcCoefficientRech;

	/** The dat rc date devise rech. */
	private String datRcDateDeviseRech;

	/** The num rc libelle debise rech. */
	private String numRcLibelleDeviseRech;

	/** The num rc precision dev rech. */
	private String numRcPrecisionDevRech;

	/** The num rc qte c fa rech. */
	private String numRcQteCFaRech;

	/** The num rc qte devise rech. */
	private String numRcQteDeviseRech;

	/** The num rc user modif rech. */
	private String numRcUserModifRech;

	/** variables du Grid. */
	private Integer rows;
	
	/** The page. */
	private Integer page;
	
	/** The sord. */
	private String sord;
	
	/** The sidx. */
	private String sidx;
	
	/** The total. */
	private Integer total;
	
	/** The records. */
	private Integer records;
	
	/** The index. */
	private String index;

	/** The liste rc devises. */
	private List listeRcDevises = new ArrayList();

	/** The devises. */
	private Devises devisesvo = new Devises();

	/**
	 * * Getting a new devises **.
	 *
	 * @return the new rc devises
	 */
	/*** Method getNewDEVISESVO () ***/
	public Devises getNewRcDevisesVO() {
		Devises devisesvo = new Devises();

		// Getting the current user responsible for modification
		HttpServletRequest request = ServletActionContext.getRequest();
		Utilisateur utilisateur = (Utilisateur) request.getSession()
				.getAttribute("user");

		devisesvo.setRccodedevise(getNumRcCodeDeviseOB());

		if (getNumRcCoefficientOB() != null
				&& !getNumRcCodeDeviseOB().equals(""))
			devisesvo
					.setRccoefficient(Integer.valueOf(getNumRcCoefficientOB()));
		if (getDatRcDateDeviseOB() != null
				&& !getDatRcDateDeviseOB().equals(""))
			devisesvo.setRcdatedevise(new Date(DateUtil.convertStringToDate(
					getDatRcDateDeviseOB()).getTime()));
		devisesvo.setRclibelledevise(getNumRcLibelleDeviseOB());
		if (getNumRcPrecisionDevOB() != null
				&& !getNumRcPrecisionDevOB().equals(""))
			devisesvo.setRcprecisiondev(Integer
					.valueOf(getNumRcPrecisionDevOB()));
		if (getNumRcQteCFaOB() != null && !getNumRcQteCFaOB().equals(""))
			devisesvo.setRcqtecfa(sysEnv.strToBigDecimal(getNumRcQteCFaOB()));
		if (getNumRcQteDeviseOB() != null && !getNumRcQteDeviseOB().equals(""))
			devisesvo.setRcqtedevise(sysEnv
					.strToBigDecimal(getNumRcQteDeviseOB()));

		devisesvo.setRcusermodif(utilisateur.getRcCodUser());

		return devisesvo;
	}

	/**
	 * Sets the devises.
	 *
	 * @param devisesvo the new devises
	 */
	public void setDevises(Devises devisesvo) {

		setNumRcCodeDeviseOB(devisesvo.getRccodedevise());
		if (devisesvo.getRccoefficient() != null)
			setNumRcCoefficientOB(ConvertUtil.converToString(devisesvo
					.getRccoefficient()));
		if (devisesvo.getRcdatedevise() != null)
			setDatRcDateDeviseOB(DateUtil.getDate(new Date(devisesvo
					.getRcdatedevise().getTime())));
		setNumRcLibelleDeviseOB(devisesvo.getRclibelledevise());
		if (devisesvo.getRcprecisiondev() != null)
			setNumRcPrecisionDevOB(ConvertUtil.converToString(devisesvo
					.getRcprecisiondev()));
		if (devisesvo.getRcqtecfa() != null)
			setNumRcQteCFaOB(ConvertUtil
					.converToString(devisesvo.getRcqtecfa()));
		if (devisesvo.getRcqtedevise() != null)
		{
			setNumRcQteDeviseOB(ConvertUtil.converToString(devisesvo
					.getRcqtedevise()));
			}
		setNumRcUserModifOB(DateUtil.getDate(new Date(devisesvo
				.getRcdatedevise().getTime())));

	}

	/**
	 * * Reset Method **.
	 */
	public void reset() {
		numRcCodeDeviseOB = "";
		numRcCoefficientOB = "";
		datRcDateDeviseOB = "";
		numRcLibelleDeviseOB = "";
		numRcPrecisionDevOB = "";
		numRcQteCFaOB = "";
		numRcQteDeviseOB = "";
		numRcUserModifOB = "";
	}

	/**
	 * Reset Method for the search criteria *.
	 */
	public void resetChampsRecherche() {
		numRcCodeDeviseRech = "";
		numRcCoefficientRech = "";
		datRcDateDeviseRech = "";
		numRcLibelleDeviseRech = "";
		numRcPrecisionDevRech = "";
		numRcQteCFaRech = "";
		numRcQteDeviseRech = "";
		numRcUserModifRech = "";
	}

	// Setters and getters
	/**
	 * Gets the pk.
	 *
	 * @return the pk
	 */
	public String getPk() {
		return pk;
	}

	/**
	 * Sets the pk.
	 *
	 * @param pk the pk to set
	 */
	public void setPk(String pk) {
		this.pk = pk;
	}

	/**
	 * Gets the etat.
	 *
	 * @return the etat
	 */
	public String getEtat() {
		return etat;
	}

	/**
	 * Sets the etat.
	 *
	 * @param etat the etat to set
	 */
	public void setEtat(String etat) {
		this.etat = etat;
	}

	/**
	 * Gets the num rc code devise ob.
	 *
	 * @return the numRcCodeDeviseOB
	 */
	public String getNumRcCodeDeviseOB() {
		return numRcCodeDeviseOB;
	}

	/**
	 * Sets the num rc code devise ob.
	 *
	 * @param numRcCodeDeviseOB the numRcCodeDeviseOB to set
	 */
	public void setNumRcCodeDeviseOB(String numRcCodeDeviseOB) {
		this.numRcCodeDeviseOB = numRcCodeDeviseOB;
	}

	/**
	 * Gets the num rc coefficient ob.
	 *
	 * @return the numRcCoefficientOB
	 */
	public String getNumRcCoefficientOB() {
		return numRcCoefficientOB;
	}

	/**
	 * Sets the num rc coefficient ob.
	 *
	 * @param numRcCoefficientOB the numRcCoefficientOB to set
	 */
	public void setNumRcCoefficientOB(String numRcCoefficientOB) {
		this.numRcCoefficientOB = numRcCoefficientOB;
	}

	/**
	 * Gets the dat rc date devise ob.
	 *
	 * @return the datRcDateDeviseOB
	 */
	public String getDatRcDateDeviseOB() {
		return datRcDateDeviseOB;
	}

	/**
	 * Sets the dat rc date devise ob.
	 *
	 * @param datRcDateDeviseOB the datRcDateDeviseOB to set
	 */
	public void setDatRcDateDeviseOB(String datRcDateDeviseOB) {
		this.datRcDateDeviseOB = datRcDateDeviseOB;
	}

	/**
	 * Gets the num rc libelle devise ob.
	 *
	 * @return the numRcLibelleDebiseOB
	 */
	public String getNumRcLibelleDeviseOB() {
		return numRcLibelleDeviseOB;
	}

	/**
	 * Sets the num rc libelle devise ob.
	 *
	 * @param numRcLibelleDebiseOB the numRcLibelleDebiseOB to set
	 */
	public void setNumRcLibelleDeviseOB(String numRcLibelleDebiseOB) {
		this.numRcLibelleDeviseOB = numRcLibelleDebiseOB;
	}

	/**
	 * Gets the num rc precision dev ob.
	 *
	 * @return the numRcPrecisionDevOB
	 */
	public String getNumRcPrecisionDevOB() {
		return numRcPrecisionDevOB;
	}

	/**
	 * Sets the num rc precision dev ob.
	 *
	 * @param numRcPrecisionDevOB the numRcPrecisionDevOB to set
	 */
	public void setNumRcPrecisionDevOB(String numRcPrecisionDevOB) {
		this.numRcPrecisionDevOB = numRcPrecisionDevOB;
	}

	/**
	 * Gets the num rc qte c fa ob.
	 *
	 * @return the numRcQteCFaOB
	 */
	public String getNumRcQteCFaOB() {
		return numRcQteCFaOB;
	}

	/**
	 * Sets the num rc qte c fa ob.
	 *
	 * @param numRcQteCFaOB the numRcQteCFaOB to set
	 */
	public void setNumRcQteCFaOB(String numRcQteCFaOB) {
		this.numRcQteCFaOB = numRcQteCFaOB;
	}

	/**
	 * Gets the num rc qte devise ob.
	 *
	 * @return the numRcQteDeviseOB
	 */
	public String getNumRcQteDeviseOB() {
		return numRcQteDeviseOB;
	}

	/**
	 * Sets the num rc qte devise ob.
	 *
	 * @param numRcQteDeviseOB the numRcQteDeviseOB to set
	 */
	public void setNumRcQteDeviseOB(String numRcQteDeviseOB) {
		this.numRcQteDeviseOB = numRcQteDeviseOB;
	}

	/**
	 * Gets the num rc user modif ob.
	 *
	 * @return the numRcUserModifOB
	 */
	public String getNumRcUserModifOB() {
		return numRcUserModifOB;
	}

	/**
	 * Sets the num rc user modif ob.
	 *
	 * @param numRcUserModifOB the numRcUserModifOB to set
	 */
	public void setNumRcUserModifOB(String numRcUserModifOB) {
		this.numRcUserModifOB = numRcUserModifOB;
	}

	/**
	 * Gets the num rc code devise rech.
	 *
	 * @return the numRcCodeDeviseRech
	 */
	public String getNumRcCodeDeviseRech() {
		return numRcCodeDeviseRech;
	}

	/**
	 * Sets the num rc code devise rech.
	 *
	 * @param numRcCodeDeviseRech the numRcCodeDeviseRech to set
	 */
	public void setNumRcCodeDeviseRech(String numRcCodeDeviseRech) {
		this.numRcCodeDeviseRech = numRcCodeDeviseRech;
	}

	/**
	 * Gets the num rc coefficient rech.
	 *
	 * @return the numRcCoefficientRech
	 */
	public String getNumRcCoefficientRech() {
		return numRcCoefficientRech;
	}

	/**
	 * Sets the num rc coefficient rech.
	 *
	 * @param numRcCoefficientRech the numRcCoefficientRech to set
	 */
	public void setNumRcCoefficientRech(String numRcCoefficientRech) {
		this.numRcCoefficientRech = numRcCoefficientRech;
	}

	/**
	 * Gets the dat rc date devise rech.
	 *
	 * @return the datRcDateDeviseRech
	 */
	public String getDatRcDateDeviseRech() {
		return datRcDateDeviseRech;
	}

	/**
	 * Sets the dat rc date devise rech.
	 *
	 * @param datRcDateDeviseRech the datRcDateDeviseRech to set
	 */
	public void setDatRcDateDeviseRech(String datRcDateDeviseRech) {
		this.datRcDateDeviseRech = datRcDateDeviseRech;
	}

	/**
	 * Gets the num rc libelle devise rech.
	 *
	 * @return the numRcLibelleDebiseRech
	 */
	public String getNumRcLibelleDeviseRech() {
		return numRcLibelleDeviseRech;
	}

	/**
	 * Sets the num rc libelle devise rech.
	 *
	 * @param numRcLibelleDebiseRech the numRcLibelleDebiseRech to set
	 */
	public void setNumRcLibelleDeviseRech(String numRcLibelleDebiseRech) {
		this.numRcLibelleDeviseRech = numRcLibelleDebiseRech;
	}

	/**
	 * Gets the num rc precision dev rech.
	 *
	 * @return the numRcPrecisionDevRech
	 */
	public String getNumRcPrecisionDevRech() {
		return numRcPrecisionDevRech;
	}

	/**
	 * Sets the num rc precision dev rech.
	 *
	 * @param numRcPrecisionDevRech the numRcPrecisionDevRech to set
	 */
	public void setNumRcPrecisionDevRech(String numRcPrecisionDevRech) {
		this.numRcPrecisionDevRech = numRcPrecisionDevRech;
	}

	/**
	 * Gets the num rc qte c fa rech.
	 *
	 * @return the numRcQteCFaRech
	 */
	public String getNumRcQteCFaRech() {
		return numRcQteCFaRech;
	}

	/**
	 * Sets the num rc qte c fa rech.
	 *
	 * @param numRcQteCFaRech the numRcQteCFaRech to set
	 */
	public void setNumRcQteCFaRech(String numRcQteCFaRech) {
		this.numRcQteCFaRech = numRcQteCFaRech;
	}

	/**
	 * Gets the num rc qte devise rech.
	 *
	 * @return the numRcQteDeviseRech
	 */
	public String getNumRcQteDeviseRech() {
		return numRcQteDeviseRech;
	}

	/**
	 * Sets the num rc qte devise rech.
	 *
	 * @param numRcQteDeviseRech the numRcQteDeviseRech to set
	 */
	public void setNumRcQteDeviseRech(String numRcQteDeviseRech) {
		this.numRcQteDeviseRech = numRcQteDeviseRech;
	}

	/**
	 * Gets the num rc user modif rech.
	 *
	 * @return the numRcUserModifRech
	 */
	public String getNumRcUserModifRech() {
		return numRcUserModifRech;
	}

	/**
	 * Sets the num rc user modif rech.
	 *
	 * @param numRcUserModifRech the numRcUserModifRech to set
	 */
	public void setNumRcUserModifRech(String numRcUserModifRech) {
		this.numRcUserModifRech = numRcUserModifRech;
	}

	/**
	 * Gets the liste rc devises.
	 *
	 * @return the listeRcDevises
	 */
	public List getListeRcDevises() {
		return listeRcDevises;
	}

	/**
	 * Sets the liste rc devises.
	 *
	 * @param listeRcDevises the listeRcDevises to set
	 */
	public void setListeRcDevises(List listeRcDevises) {
		this.listeRcDevises = listeRcDevises;
	}

	/**
	 * Gets the serialversionuid.
	 *
	 * @return the serialversionuid
	 */
	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	/**
	 * Gets the devisesvo.
	 *
	 * @return the devisesvo
	 */
	public Devises getDevisesvo() {
		return devisesvo;
	}

	/**
	 * Sets the devisesvo.
	 *
	 * @param devisesvo the new devisesvo
	 */
	public void setDevisesvo(Devises devisesvo) {
		this.devisesvo = devisesvo;
	}

	/**
	 * Gets the rows.
	 *
	 * @return the rows
	 */
	public Integer getRows() {
		return rows;
	}

	/**
	 * Sets the rows.
	 *
	 * @param rows the rows to set
	 */
	public void setRows(Integer rows) {
		this.rows = rows;
	}

	/**
	 * Gets the page.
	 *
	 * @return the page
	 */
	public Integer getPage() {
		return page;
	}

	/**
	 * Sets the page.
	 *
	 * @param page the page to set
	 */
	public void setPage(Integer page) {
		this.page = page;
	}

	/**
	 * Gets the sord.
	 *
	 * @return the sord
	 */
	public String getSord() {
		return sord;
	}

	/**
	 * Sets the sord.
	 *
	 * @param sord the sord to set
	 */
	public void setSord(String sord) {
		this.sord = sord;
	}

	/**
	 * Gets the sidx.
	 *
	 * @return the sidx
	 */
	public String getSidx() {
		return sidx;
	}

	/**
	 * Sets the sidx.
	 *
	 * @param sidx the sidx to set
	 */
	public void setSidx(String sidx) {
		this.sidx = sidx;
	}

	/**
	 * Gets the total.
	 *
	 * @return the total
	 */
	public Integer getTotal() {
		return total;
	}

	/**
	 * Sets the total.
	 *
	 * @param total the total to set
	 */
	public void setTotal(Integer total) {
		this.total = total;
	}

	/**
	 * Gets the records.
	 *
	 * @return the records
	 */
	public Integer getRecords() {
		return records;
	}

	/**
	 * Sets the records.
	 *
	 * @param records the records to set
	 */
	public void setRecords(Integer records) {
		this.records = records;
		if (this.records > 0 && this.rows > 0) {
			this.total = (int) Math.ceil((double) this.records
					/ (double) this.rows);
		} else {
			this.total = 0;
		}
	}

	/**
	 * Gets the index.
	 *
	 * @return the index
	 */
	public String getIndex() {
		return index;
	}

	/**
	 * Sets the index.
	 *
	 * @param index the index to set
	 */
	public void setIndex(String index) {
		this.index = index;
	}

}
