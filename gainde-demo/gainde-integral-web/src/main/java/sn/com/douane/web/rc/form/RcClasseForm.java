package sn.com.douane.web.rc.form;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import sn.com.douane.ejb.rc.model.entities.Classe;
import sn.com.douane.utils.ConvertUtil;

/**
 * The Class RcClasseForm.
 * 
 * @author kerfahi ghazi
 */
public class RcClasseForm implements Serializable {

	/** The Constant serialVersionUID. */
	private static final long serialVersionUID = 1L;
	
	/** The pk. */
	private String pk;
	
	/** The etat. */
	private String etat;

	/** * Attributs Table CLASSE **. */
	//Champs de saisie
	private String numRcCodeClasseOB;
	
	/** The num rc libelle classe ob. */
	private String numRcLibelleClasseOB;

	//Champs de recherche
	/** The num rc code classe rech. */
	private String numRcCodeClasseRech;
	
	/** The num rc libelle classe rech. */
	private String numRcLibelleClasseRech;

	/** The liste rc classe. */
	List listeRcClasse = new ArrayList();
	
	/** The classevo. */
	Classe classevo = new Classe();

	/** variables du Grid. */
	private Integer rows ;
	
	/** The page. */
	private Integer page ;
	
	/** The sord. */
	private String  sord;
	
	/** The sidx. */
	private String  sidx;
	
	/** The total. */
	private Integer total;
	
	/** The records. */
	private Integer records;
	
	/** The index. */
	private String index;
	
	/**
	 * * M�thode getNewCLASSEVO () **.
	 *
	 * @return the new rc classe vo
	 */
	public Classe getNewRcClasseVO() {
		Classe classevo = new Classe();

		if (getNumRcCodeClasseOB()!=null && !getNumRcCodeClasseOB().equals(""))
			classevo.setRccodeclasse(new Integer(getNumRcCodeClasseOB()));
		classevo.setRclibelleclasse(getNumRcLibelleClasseOB());

		return classevo;
	}

	/**
	 * * M�thode setClasse () **.
	 *
	 * @param classevo the new classe
	 */
	public void setClasse (Classe classevo) {

		if (classevo.getRccodeclasse()!=null)
			setNumRcCodeClasseOB (ConvertUtil.converToString(classevo.getRccodeclasse()));
		setNumRcLibelleClasseOB (classevo.getRclibelleclasse());

	}

	/**
	 * * M�thodes reset **.
	 */
	public void reset() {
		numRcCodeClasseOB="";
		numRcLibelleClasseOB="";
	}
	
	/**
	 * Reset champs recherche.
	 */
	public void resetChampsRecherche() {
		numRcCodeClasseRech="";
		numRcLibelleClasseRech="";
	}

	
	/**
	 * Gets the num rc code classe ob.
	 *
	 * @return the num rc code classe ob
	 */
	public String getNumRcCodeClasseOB() {
		return numRcCodeClasseOB;
	}

	
	/**
	 * Sets the num rc code classe ob.
	 *
	 * @param numRcCodeClasseOB the new num rc code classe ob
	 */
	public void setNumRcCodeClasseOB(String numRcCodeClasseOB) {
		this.numRcCodeClasseOB = numRcCodeClasseOB;
	}

	
	/**
	 * Gets the num rc libelle classe ob.
	 *
	 * @return the num rc libelle classe ob
	 */
	public String getNumRcLibelleClasseOB() {
		return numRcLibelleClasseOB;
	}

	
	/**
	 * Sets the num rc libelle classe ob.
	 *
	 * @param numRcLibelleClasseOB the new num rc libelle classe ob
	 */
	public void setNumRcLibelleClasseOB(String numRcLibelleClasseOB) {
		this.numRcLibelleClasseOB = numRcLibelleClasseOB;
	}

	
	/**
	 * Gets the num rc code classe rech.
	 *
	 * @return the num rc code classe rech
	 */
	public String getNumRcCodeClasseRech() {
		return numRcCodeClasseRech;
	}

	
	/**
	 * Sets the num rc code classe rech.
	 *
	 * @param numRcCodeClasseRech the new num rc code classe rech
	 */
	public void setNumRcCodeClasseRech(String numRcCodeClasseRech) {
		this.numRcCodeClasseRech = numRcCodeClasseRech;
	}

	
	/**
	 * Gets the num rc libelle classe rech.
	 *
	 * @return the num rc libelle classe rech
	 */
	public String getNumRcLibelleClasseRech() {
		return numRcLibelleClasseRech;
	}

	
	/**
	 * Sets the num rc libelle classe rech.
	 *
	 * @param numRcLibelleClasseRech the new num rc libelle classe rech
	 */
	public void setNumRcLibelleClasseRech(String numRcLibelleClasseRech) {
		this.numRcLibelleClasseRech = numRcLibelleClasseRech;
	}

	
	/**
	 * Gets the liste rc classe.
	 *
	 * @return the liste rc classe
	 */
	public List getListeRcClasse() {
		return listeRcClasse;
	}

	
	/**
	 * Sets the liste rc classe.
	 *
	 * @param listeRcClasse the new liste rc classe
	 */
	public void setListeRcClasse(List listeRcClasse) {
		this.listeRcClasse = listeRcClasse;
	}

	
	/**
	 * Gets the classevo.
	 *
	 * @return the classevo
	 */
	public Classe getClassevo() {
		return classevo;
	}

	
	/**
	 * Sets the classevo.
	 *
	 * @param classevo the new classevo
	 */
	public void setClassevo(Classe classevo) {
		this.classevo = classevo;
	}

	/**
	 * Gets the pk.
	 *
	 * @return the pk
	 */
	public String getPk () {
		return pk;
	}

	/**
	 * Sets the pk.
	 *
	 * @param pk the new pk
	 */
	public void setPk (String pk) {
		this.pk = pk;
	}

	/**
	 * Gets the etat.
	 *
	 * @return the etat
	 */
	public String getEtat () {
		return etat;
	}

	/**
	 * Sets the etat.
	 *
	 * @param etat the new etat
	 */
	public void setEtat (String etat) {
		this.etat = etat;
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
	 * @param rows the new rows
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
	 * @param page the new page
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
	 * @param sord the new sord
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
	 * @param sidx the new sidx
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
	 * @param total the new total
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
	 * @param records the new records
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
	 * @param index the new index
	 */
	public void setIndex(String index) {
		this.index = index;
	}
	
	
}