package sn.com.douane.web.rc.form;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import sn.com.douane.ejb.rc.model.entities.GenreBureau;

/**
 * Added by rkhaskhoussy
 * The Class RcGenreBureauForm.
 */
/**
 * @author Najah
 * 
 */
public class RcGenreBureauForm implements Serializable {

	/** The pk. */
	private String pk;
	/** The etat. */
	private String etat;

	/** The Constant serialVersionUID. */
	private static final long serialVersionUID = 2449705126317819008L;
	/*** Attributs Table GENREBUREAU ***/
	// Champs de saisie
	private String numRcGenreBureauOB;
	private String numRcDesGenreBureauOB;

	// Champs de recherche
	private String numRcGenreBureauRech;
	private String numRcDesGenreBureauRech;

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

	/** The liste rc genre bureau. */
	private List listeRcGenrebureau = new ArrayList();

	/** The genre bureau. */
	private GenreBureau genreBureau = new GenreBureau();

	public String getNumRcGenreBureauOB() {
		return numRcGenreBureauOB;
	}

	public void setNumRcGenreBureauOB(String numRcGenreBureauOB) {
		this.numRcGenreBureauOB = numRcGenreBureauOB;
	}

	public String getNumRcDesGenreBureauOB() {
		return numRcDesGenreBureauOB;
	}

	public void setNumRcDesGenreBureauOB(String numRcDesGenreBureauOB) {
		this.numRcDesGenreBureauOB = numRcDesGenreBureauOB;
	}

	public String getNumRcGenreBureauRech() {
		return numRcGenreBureauRech;
	}

	public void setNumRcGenreBureauRech(String numRcGenreBureauRech) {
		this.numRcGenreBureauRech = numRcGenreBureauRech;
	}

	public String getNumRcDesGenreBureauRech() {
		return numRcDesGenreBureauRech;
	}

	public void setNumRcDesGenreBureauRech(String numRcDesGenreBureauRech) {
		this.numRcDesGenreBureauRech = numRcDesGenreBureauRech;
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


	public List getListeRcGenrebureau() {
		return listeRcGenrebureau;
	}

	public void setListeRcGenrebureau(List listeRcGenrebureau) {
		this.listeRcGenrebureau = listeRcGenrebureau;
	}

	public GenreBureau getGenreBureau() {
		return genreBureau;
	}

	public void setGenreBureau(GenreBureau genreBureau) {
		if (genreBureau.getRcdesgenrebureau() != null
				&& !genreBureau.getRcdesgenrebureau().equals("")) {
			setNumRcDesGenreBureauOB(genreBureau.getRcdesgenrebureau());
		}

		if (genreBureau.getRcgenrebureau() != null
				&& !genreBureau.getRcgenrebureau().equals("")) {
			setNumRcGenreBureauOB(genreBureau.getRcgenrebureau());
		}
	}

	public void reset() {
		numRcDesGenreBureauOB = "";
		numRcGenreBureauOB = "";

	}

	public void resetChampsRecherche() {
		numRcDesGenreBureauRech = "";
		numRcGenreBureauRech = "";
	}

	public GenreBureau getNewRcGenreBureauVO() {

		GenreBureau genrebureauvo = new GenreBureau();
		if (getNumRcDesGenreBureauOB() != null
				&& !getNumRcDesGenreBureauOB().equals("")) {
			genrebureauvo.setRcdesgenrebureau(getNumRcDesGenreBureauOB());
		}
		if (getNumRcGenreBureauOB() != null
				&& !getNumRcGenreBureauOB().equals("")) {
			genrebureauvo.setRcgenrebureau(getNumRcGenreBureauOB());
		}

		return genrebureauvo;
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

	

}
