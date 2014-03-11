package sn.com.douane.ejb.rc.model.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
/**
 * 
 * @author nesrine
 *
 */
@Entity
@Table(name="BACDEPOTPETROLIER")
public class BacDepotPetrolier implements Serializable{

	private static final long serialVersionUID = -4723725596759666275L;

	@Id
	@Column(name="RCCODEBAC", length=10, nullable=false)
	private String rcCodeBac;
	
	@Column(name="RCCODEDEPOT", length=10, nullable=false)
	private String rcCodeDepot;
	
	@Column(name="RCLIBELLEBAC", length=255)
	private String rcLibelleBac;
	
	@ManyToOne
	@JoinColumn(name="rcCodeDepot",insertable=false, updatable=false)
	private DepotPetrolier bacDepotPetr;


	/**
	 * 0-args constructeur
	 */
	public BacDepotPetrolier() {
	}

	/**
	 * 3-args constructeurs
	 * @param rcCodeBac
	 * @param rcLibelleBac
	 * @param bacDepotPetr
	 */
	public BacDepotPetrolier(String rcCodeBac, String rcLibelleBac,
			DepotPetrolier bacDepotPetr) {
		super();
		this.rcCodeBac = rcCodeBac;
		this.rcLibelleBac = rcLibelleBac;
		this.bacDepotPetr = bacDepotPetr;
	}

	/**
	 * 3-args constructeurs
	 * @param rcCodeBac
	 * @param rcLibelleBac
	 * @param rcCodeDepot
	 */
	public BacDepotPetrolier(String rcCodeBac, String rcLibelleBac,
			String rcCodeDepot) {
		super();
		this.rcCodeBac = rcCodeBac;
		this.rcLibelleBac = rcLibelleBac;
		this.rcCodeDepot = rcCodeDepot;
	}

	/**
	 * Get accessor for persistent attribute: rcCodeBac
	 * @return rcCodeBac
	 */
	public String getRcCodeBac() {
		return rcCodeBac;
	}

	/**
	 * Set accessor for persistent attribute: rcCodeBac
	 * @param rcCodeBac 
	 */
	public void setRccodebac(String rcCodeBac) {
		this.rcCodeBac = rcCodeBac;
	}

	/**
	 * Get accessor for persistent attribute: rcLibelleBac
	 * @return rcLibelleBac
	 */
	public String getRcLibelleBac() {
		return rcLibelleBac;
	}

	/**
	 * Set accessor for persistent attribute: rcLibelleBac
	 * @param rcLibelleBac
	 */
	public void setRcLibelleBac(String rcLibelleBac) {
		this.rcLibelleBac = rcLibelleBac;
	}

	/**
	 * Get accessor for persistent attribute: rcCodeDepot
	 * @return rcCodeDepot
	 */
	public String getRcCodeDepot() {
		return rcCodeDepot;
	}

	/**
	 * Set accessor for persistent attribute: rcCodeDepot
	 * @param rcCodeDepot
	 */
	public void setRcCodeDepot(String rcCodeDepot) {
		this.rcCodeDepot = rcCodeDepot;
	}
	
	/**
	 * This method was generated for supporting the relationship role named bacDepotPetr.
	 * @return bacDepotPetr
	 */
	public DepotPetrolier getBacDepotPetr() {
		return bacDepotPetr;
	}

	/**
	 * This method was generated for supporting the relationship role named bacDepotPetr.
	 * @return bacDepotPetr
	 */
	public void setBacDepotPetr(DepotPetrolier bacDepotPetr) {
		this.bacDepotPetr = bacDepotPetr;
	}

}
