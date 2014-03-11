package sn.com.douane.ejb.rc.model.dto;

import java.io.Serializable;
import sn.com.douane.utils.ConstManif;

/**
 * The Class ProduitDto.
 *
 * @author kerfahi ghazi
 */
public class ProduitDto implements Serializable{


	/** The Constant serialVersionUID. */
	private static final long serialVersionUID = -6129305199315358996L;
	
	/** The rccodeprod. */
	private String rccodeprod;
	
	/** The rcprecuemoa. */
	private String rcprecuemoa;
	
	/** The rcprecsenegal. */
	private String rcprecsenegal;
	
	/** The rclibelletarif. */
	private String rclibelletarif;
	
	/** The rccodeposition. */
	private String rccodeposition;
	
	/** The rccommprod. */
	private String rccommprod;
	
	/** The rcindprodpetrolier. */
	private String rcindprodpetrolier;
	
	/** The rccodeprodcru. */
	private String rccodeprodcru;
	
	/** The rccodeprodartisanal. */
	private String rccodeprodartisanal;
	
	/** The rcunitecomp. */
	private String rcunitecomp;
	
	/** The rcsectactprod. */
	private String rcsectactprod;
	
	/** The rccodetransit. */
	private String rccodetransit;
	
	/** The rccodebienequip. */
	private String rccodebienequip;
	
	/** The rcvalequipprod. */
	private Integer rcvalequipprod;
	
	/** The rccodeentrepot. */
	private String rccodeentrepot;
	
	/** The rccodeprodsocial. */
	private String rccodeprodsocial;
	
	/** The rcvalspecprod. */
	private Double rcvalspecprod;
	
	/** The rcvalchapitre. */
	private String rcvalchapitre;
	
	/** The rccodeclasse. */
	private Integer rccodeclasse;
	
	/** The rccodeperissable. */
	private String rccodeperissable;
	
	/** The rccodesection. */
	private String rccodesection;
	
	/** The rcactif. */
	private String rcactif;
	
	/** The rcexonorepvi. */
	private String rcexonorepvi;
	
	/** The pk. */
	private String pk; 
	
	/** The edit cell. */
	private String editCell; 
	
	/** The del cell. */
	private String delCell;
	
	/**
	 * Instantiates a new produit dto.
	 */
	public ProduitDto() {
		super();
	}

	
	/**
	 * Gets the rccodeprod.
	 *
	 * @return the rccodeprod
	 */
	public String getRccodeprod() {
		return rccodeprod;
	}

	
	/**
	 * Sets the rccodeprod.
	 *
	 * @param rccodeprod the new rccodeprod
	 */
	public void setRccodeprod(String rccodeprod) {
		this.rccodeprod = rccodeprod;
	}

	
	/**
	 * Gets the rcprecuemoa.
	 *
	 * @return the rcprecuemoa
	 */
	public String getRcprecuemoa() {
		return rcprecuemoa;
	}


	/**
	 * Sets the rcprecuemoa.
	 *
	 * @param rcprecuemoa the new rcprecuemoa
	 */
	public void setRcprecuemoa(String rcprecuemoa) {
		this.rcprecuemoa = rcprecuemoa;
	}

	
	/**
	 * Gets the rcprecsenegal.
	 *
	 * @return the rcprecsenegal
	 */
	public String getRcprecsenegal() {
		return rcprecsenegal;
	}

	
	/**
	 * Sets the rcprecsenegal.
	 *
	 * @param rcprecsenegal the new rcprecsenegal
	 */
	public void setRcprecsenegal(String rcprecsenegal) {
		this.rcprecsenegal = rcprecsenegal;
	}

	
	/**
	 * Gets the rclibelletarif.
	 *
	 * @return the rclibelletarif
	 */
	public String getRclibelletarif() {
		return rclibelletarif;
	}

	
	/**
	 * Sets the rclibelletarif.
	 *
	 * @param rclibelletarif the new rclibelletarif
	 */
	public void setRclibelletarif(String rclibelletarif) {
		this.rclibelletarif = rclibelletarif;
	}

	
	/**
	 * Gets the rccodeposition.
	 *
	 * @return the rccodeposition
	 */
	public String getRccodeposition() {
		return rccodeposition;
	}

	
	/**
	 * Sets the rccodeposition.
	 *
	 * @param rccodeposition the new rccodeposition
	 */
	public void setRccodeposition(String rccodeposition) {
		this.rccodeposition = rccodeposition;
	}

	
	/**
	 * Gets the rccommprod.
	 *
	 * @return the rccommprod
	 */
	public String getRccommprod() {
		return rccommprod;
	}

	
	/**
	 * Sets the rccommprod.
	 *
	 * @param rccommprod the new rccommprod
	 */
	public void setRccommprod(String rccommprod) {
		this.rccommprod = rccommprod;
	}

	
	/**
	 * Gets the rcindprodpetrolier.
	 *
	 * @return the rcindprodpetrolier
	 */
	public String getRcindprodpetrolier() {
		return rcindprodpetrolier;
	}

	
	/**
	 * Sets the rcindprodpetrolier.
	 *
	 * @param rcindprodpetrolier the new rcindprodpetrolier
	 */
	public void setRcindprodpetrolier(String rcindprodpetrolier) {
		this.rcindprodpetrolier = rcindprodpetrolier;
	}

	
	/**
	 * Gets the rccodeprodcru.
	 *
	 * @return the rccodeprodcru
	 */
	public String getRccodeprodcru() {
		return rccodeprodcru;
	}

	
	/**
	 * Sets the rccodeprodcru.
	 *
	 * @param rccodeprodcru the new rccodeprodcru
	 */
	public void setRccodeprodcru(String rccodeprodcru) {
		this.rccodeprodcru = rccodeprodcru;
	}

	
	/**
	 * Gets the rccodeprodartisanal.
	 *
	 * @return the rccodeprodartisanal
	 */
	public String getRccodeprodartisanal() {
		return rccodeprodartisanal;
	}

	
	/**
	 * Sets the rccodeprodartisanal.
	 *
	 * @param rccodeprodartisanal the new rccodeprodartisanal
	 */
	public void setRccodeprodartisanal(String rccodeprodartisanal) {
		this.rccodeprodartisanal = rccodeprodartisanal;
	}

	
	/**
	 * Gets the rcunitecomp.
	 *
	 * @return the rcunitecomp
	 */
	public String getRcunitecomp() {
		return rcunitecomp;
	}

	
	/**
	 * Sets the rcunitecomp.
	 *
	 * @param rcunitecomp the new rcunitecomp
	 */
	public void setRcunitecomp(String rcunitecomp) {
		this.rcunitecomp = rcunitecomp;
	}

	
	/**
	 * Gets the rcsectactprod.
	 *
	 * @return the rcsectactprod
	 */
	public String getRcsectactprod() {
		return rcsectactprod;
	}

	
	/**
	 * Sets the rcsectactprod.
	 *
	 * @param rcsectactprod the new rcsectactprod
	 */
	public void setRcsectactprod(String rcsectactprod) {
		this.rcsectactprod = rcsectactprod;
	}

	
	/**
	 * Gets the rccodetransit.
	 *
	 * @return the rccodetransit
	 */
	public String getRccodetransit() {
		return rccodetransit;
	}

	
	/**
	 * Sets the rccodetransit.
	 *
	 * @param rccodetransit the new rccodetransit
	 */
	public void setRccodetransit(String rccodetransit) {
		this.rccodetransit = rccodetransit;
	}

	
	/**
	 * Gets the rccodebienequip.
	 *
	 * @return the rccodebienequip
	 */
	public String getRccodebienequip() {
		return rccodebienequip;
	}

	
	/**
	 * Sets the rccodebienequip.
	 *
	 * @param rccodebienequip the new rccodebienequip
	 */
	public void setRccodebienequip(String rccodebienequip) {
		this.rccodebienequip = rccodebienequip;
	}

	
	/**
	 * Gets the rcvalequipprod.
	 *
	 * @return the rcvalequipprod
	 */
	public Integer getRcvalequipprod() {
		return rcvalequipprod;
	}

	
	/**
	 * Sets the rcvalequipprod.
	 *
	 * @param rcvalequipprod the new rcvalequipprod
	 */
	public void setRcvalequipprod(Integer rcvalequipprod) {
		this.rcvalequipprod = rcvalequipprod;
	}

	
	/**
	 * Gets the rccodeentrepot.
	 *
	 * @return the rccodeentrepot
	 */
	public String getRccodeentrepot() {
		return rccodeentrepot;
	}

	
	/**
	 * Sets the rccodeentrepot.
	 *
	 * @param rccodeentrepot the new rccodeentrepot
	 */
	public void setRccodeentrepot(String rccodeentrepot) {
		this.rccodeentrepot = rccodeentrepot;
	}

	
	/**
	 * Gets the rccodeprodsocial.
	 *
	 * @return the rccodeprodsocial
	 */
	public String getRccodeprodsocial() {
		return rccodeprodsocial;
	}

	
	/**
	 * Sets the rccodeprodsocial.
	 *
	 * @param rccodeprodsocial the new rccodeprodsocial
	 */
	public void setRccodeprodsocial(String rccodeprodsocial) {
		this.rccodeprodsocial = rccodeprodsocial;
	}

	
	/**
	 * Gets the rcvalspecprod.
	 *
	 * @return the rcvalspecprod
	 */
	public Double getRcvalspecprod() {
		return rcvalspecprod;
	}

	
	/**
	 * Sets the rcvalspecprod.
	 *
	 * @param rcvalspecprod the new rcvalspecprod
	 */
	public void setRcvalspecprod(Double rcvalspecprod) {
		this.rcvalspecprod = rcvalspecprod;
	}

	
	/**
	 * Gets the rcvalchapitre.
	 *
	 * @return the rcvalchapitre
	 */
	public String getRcvalchapitre() {
		return rcvalchapitre;
	}

	
	/**
	 * Sets the rcvalchapitre.
	 *
	 * @param rcvalchapitre the new rcvalchapitre
	 */
	public void setRcvalchapitre(String rcvalchapitre) {
		this.rcvalchapitre = rcvalchapitre;
	}


	/**
	 * Gets the rccodeclasse.
	 *
	 * @return the rccodeclasse
	 */
	public Integer getRccodeclasse() {
		return rccodeclasse;
	}

	
	/**
	 * Sets the rccodeclasse.
	 *
	 * @param rccodeclasse the new rccodeclasse
	 */
	public void setRccodeclasse(Integer rccodeclasse) {
		this.rccodeclasse = rccodeclasse;
	}

	
	/**
	 * Gets the rccodeperissable.
	 *
	 * @return the rccodeperissable
	 */
	public String getRccodeperissable() {
		return rccodeperissable;
	}

	
	/**
	 * Sets the rccodeperissable.
	 *
	 * @param rccodeperissable the new rccodeperissable
	 */
	public void setRccodeperissable(String rccodeperissable) {
		this.rccodeperissable = rccodeperissable;
	}

	
	/**
	 * Gets the rccodesection.
	 *
	 * @return the rccodesection
	 */
	public String getRccodesection() {
		return rccodesection;
	}

	
	/**
	 * Sets the rccodesection.
	 *
	 * @param rccodesection the new rccodesection
	 */
	public void setRccodesection(String rccodesection) {
		this.rccodesection = rccodesection;
	}

	
	/**
	 * Gets the rcactif.
	 *
	 * @return the rcactif
	 */
	public String getRcactif() {
		return rcactif;
	}

	
	/**
	 * Sets the rcactif.
	 *
	 * @param rcactif the new rcactif
	 */
	public void setRcactif(String rcactif) {
		this.rcactif = rcactif;
	}

	
	/**
	 * Gets the rcexonorepvi.
	 *
	 * @return the rcexonorepvi
	 */
	public String getRcexonorepvi() {
		return rcexonorepvi;
	}

	
	/**
	 * Sets the rcexonorepvi.
	 *
	 * @param rcexonorepvi the new rcexonorepvi
	 */
	public void setRcexonorepvi(String rcexonorepvi) {
		this.rcexonorepvi = rcexonorepvi;
	}

	
	/**
	 * Gets the pk.
	 *
	 * @return the pk
	 */
	public String getPk() {
		pk	= rccodeprod + ConstManif.TIELD + rcprecuemoa + ConstManif.TIELD + rcprecsenegal;
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
	 * Gets the edits the cell.
	 *
	 * @return the edits the cell
	 */
	public String getEditCell() {
		return editCell;
	}

	/**
	 * Sets the edits the cell.
	 *
	 * @param editCell the new edits the cell
	 */
	public void setEditCell(String editCell) {
		this.editCell = editCell;
	}

	/**
	 * Gets the del cell.
	 *
	 * @return the del cell
	 */
	public String getDelCell() {
		return delCell;
	}

	/**
	 * Sets the del cell.
	 *
	 * @param delCell the new del cell
	 */
	public void setDelCell(String delCell) {
		this.delCell = delCell;
	}
	
}
