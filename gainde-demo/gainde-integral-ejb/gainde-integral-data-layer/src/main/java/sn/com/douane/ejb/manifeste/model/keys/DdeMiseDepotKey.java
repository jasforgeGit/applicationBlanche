/**
 * CGPID
 */
package sn.com.douane.ejb.manifeste.model.keys;

import java.io.Serializable;

import javax.persistence.Column;

/**
 * @author CGPID
 *
 */
public class DdeMiseDepotKey implements Serializable{
	
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -3173355499846674407L;

	/**
	 * Implementation field for persistent attribute: manifanneeddedepot
	 */
	@Column(name="MANIFANNEEDDEDEPOT", length=4, nullable=false)
	private java.lang.String manifAnneeDdeDepot;

	/**
	 * Implementation field for persistent attribute: manifburddedepot
	 */
	@Column(name="MANIFBURDDEDEPOT", length=3, nullable=false)
	private java.lang.String manifBurDdeDepot;

	/**
	 * Implementation field for persistent attribute: manifnumddedepot
	 */
	 @Column(name="MANIFNUMDDEDEPOT", nullable=false)
	private java.lang.Integer manifNumDdeDepot;

	/**
	 * 
	 */
	public DdeMiseDepotKey() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	

	/**
	 * @param manifAnneeDdeDepot
	 * @param manifBurDdeDepot
	 * @param manifNumDdeDepot
	 */
	public DdeMiseDepotKey(String manifAnneeDdeDepot, String manifBurDdeDepot,
			Integer manifNumDdeDepot) {
		super();
		this.manifAnneeDdeDepot = manifAnneeDdeDepot;
		this.manifBurDdeDepot = manifBurDdeDepot;
		this.manifNumDdeDepot = manifNumDdeDepot;
	}



	/**
	 * @return the manifAnneeDdeDepot
	 */
	public java.lang.String getManifAnneeDdeDepot() {
		return manifAnneeDdeDepot;
	}

	/**
	 * @param manifAnneeDdeDepot the manifAnneeDdeDepot to set
	 */
	public void setManifAnneeDdeDepot(java.lang.String manifAnneeDdeDepot) {
		this.manifAnneeDdeDepot = manifAnneeDdeDepot;
	}

	/**
	 * @return the manifBurDdeDepot
	 */
	public java.lang.String getManifBurDdeDepot() {
		return manifBurDdeDepot;
	}

	/**
	 * @param manifBurDdeDepot the manifBurDdeDepot to set
	 */
	public void setManifBurDdeDepot(java.lang.String manifBurDdeDepot) {
		this.manifBurDdeDepot = manifBurDdeDepot;
	}

	/**
	 * @return the manifNumDdeDepot
	 */
	public java.lang.Integer getManifNumDdeDepot() {
		return manifNumDdeDepot;
	}

	/**
	 * @param manifNumDdeDepot the manifNumDdeDepot to set
	 */
	public void setManifNumDdeDepot(java.lang.Integer manifNumDdeDepot) {
		this.manifNumDdeDepot = manifNumDdeDepot;
	}

	
	
	

}
