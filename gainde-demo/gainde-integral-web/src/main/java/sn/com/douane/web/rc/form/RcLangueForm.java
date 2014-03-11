package sn.com.douane.web.rc.form;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import sn.com.douane.ejb.rc.model.entities.Langue;


/**
 * Added by rkhaskhoussy
 * The Class RcLangueForm.
 */
public class RcLangueForm implements Serializable{

	
	/** The Constant serialVersionUID. */
	private static final long serialVersionUID = -3906470430056544261L;
	/** The pk. */
	private String pk;
	/** The etat. */
	private String etat;
	
	
	/** * Attributs Table LANGUE **. */
	//Champs de saisie
	private String numLibelleLangueOB;
	
	/** The num rc code langue ob. */
	private String numRcCodeLangueOB;

	//Champs de recherche
	/** The num libelle langue rech. */
	private String numLibelleLangueRech;
	
	/** The num rc codelangue rech. */
	private String numRcCodelangueRech;

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

		/** The liste rc langue. */
		private List listeRcLangue = new ArrayList();

		/** The Langue. */
		private Langue langue = new Langue();

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
		 * @param pk the new pk
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
		 * @param etat the new etat
		 */
		public void setEtat(String etat) {
			this.etat = etat;
		}

		/**
		 * Gets the num libelle langue ob.
		 *
		 * @return the num libelle langue ob
		 */
		public String getNumLibelleLangueOB() {
			return numLibelleLangueOB;
		}

		/**
		 * Sets the num libelle langue ob.
		 *
		 * @param numLibelleLangueOB the new num libelle langue ob
		 */
		public void setNumLibelleLangueOB(String numLibelleLangueOB) {
			this.numLibelleLangueOB = numLibelleLangueOB;
		}

		/**
		 * Gets the num rc code langue ob.
		 *
		 * @return the num rc code langue ob
		 */
		public String getNumRcCodeLangueOB() {
			return numRcCodeLangueOB;
		}

		/**
		 * Sets the num rc code langue ob.
		 *
		 * @param numRcCodeLangueOB the new num rc code langue ob
		 */
		public void setNumRcCodeLangueOB(String numRcCodeLangueOB) {
			this.numRcCodeLangueOB = numRcCodeLangueOB;
		}

		/**
		 * Gets the num libelle langue rech.
		 *
		 * @return the num libelle langue rech
		 */
		public String getNumLibelleLangueRech() {
			return numLibelleLangueRech;
		}

		/**
		 * Sets the num libelle langue rech.
		 *
		 * @param numLibelleLangueRech the new num libelle langue rech
		 */
		public void setNumLibelleLangueRech(String numLibelleLangueRech) {
			this.numLibelleLangueRech = numLibelleLangueRech;
		}

		/**
		 * Gets the num rc codelangue rech.
		 *
		 * @return the num rc codelangue rech
		 */
		public String getNumRcCodelangueRech() {
			return numRcCodelangueRech;
		}

		/**
		 * Sets the num rc codelangue rech.
		 *
		 * @param numRcCodelangueRech the new num rc codelangue rech
		 */
		public void setNumRcCodelangueRech(String numRcCodelangueRech) {
			this.numRcCodelangueRech = numRcCodelangueRech;
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

		/**
		 * Gets the liste rc langue.
		 *
		 * @return the liste rc langue
		 */
		public List getListeRcLangue() {
			return listeRcLangue;
		}

		/**
		 * Sets the liste rc langue.
		 *
		 * @param listeRcLangue the new liste rc langue
		 */
		public void setListeRcLangue(List listeRcLangue) {
			this.listeRcLangue = listeRcLangue;
		}

		/**
		 * Gets the langue.
		 *
		 * @return the langue
		 */
		public Langue getLangue() {
			return langue;
		}

		/**
		 * Sets the langue.
		 *
		 * @param langue the new langue
		 */
		public void setLangue(Langue langue) {

			if (langue.getRccodelangue() != null
					&& !langue.getRccodelangue().equals("")) {
				 setNumRcCodeLangueOB(langue.getRccodelangue());
			}

			if (langue.getLibellelangue() != null
					&& !langue.getLibellelangue().equals("")) {
				setNumLibelleLangueOB(langue.getLibellelangue());
			}
		
		}
		
		/**
		 * Reset.
		 */
		public void reset() {
			numLibelleLangueOB = "";
			numRcCodeLangueOB = "";

		}

		/**
		 * Reset champs recherche.
		 */
		public void resetChampsRecherche() {
			numLibelleLangueRech = "";
			numRcCodelangueRech = "";
		}
		
		
		
		/**
		 * Gets the new rc langue vo.
		 *
		 * @return the new rc langue vo
		 */
		public Langue getNewRcLangueVO() {

			Langue languevo = new Langue();
			if (getNumLibelleLangueOB() != null
					&& !getNumLibelleLangueOB().equals("")) {
				languevo.setLibellelangue(getNumLibelleLangueOB());
			}
			if (getNumRcCodeLangueOB() != null
					&& !getNumRcCodeLangueOB().equals("")) {
				languevo.setRccodelangue(getNumRcCodeLangueOB());
			}

			return languevo;
		}
		
		
		
}
