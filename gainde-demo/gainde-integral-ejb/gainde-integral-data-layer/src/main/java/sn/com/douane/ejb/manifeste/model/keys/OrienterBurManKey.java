/**
 * moussakare
 */
package sn.com.douane.ejb.manifeste.model.keys;

import java.io.Serializable;

import javax.persistence.Column;

/**
 * @author moussakare
 *
 */
public class OrienterBurManKey implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 4291097778086681332L;
	
	@Column(name="CODEBUR", length=3, nullable=false)
	private java.lang.String codeBur;
	
	@Column(name="MANIFCODECONSIGNATAIRE", length=3, nullable=false)
    private java.lang.String manifCodeConsignataire;
	
	@Column(name="MANIFANNEEENREGMANIF", length=4, nullable=false)
    private java.lang.String manifAnneeEnregManif;
	
	@Column(name="MANIFNUMREP", length=3, nullable=false)
    private java.lang.String manifNumRep;

	/**
	 * 
	 */
	public OrienterBurManKey() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param codeBur
	 * @param manifCodeConsignataire
	 * @param manifAnneeEnregManif
	 * @param manifNumRep
	 */
	public OrienterBurManKey(String codeBur, String manifCodeConsignataire,
			String manifAnneeEnregManif, String manifNumRep) {
		super();
		this.codeBur = codeBur;
		this.manifCodeConsignataire = manifCodeConsignataire;
		this.manifAnneeEnregManif = manifAnneeEnregManif;
		this.manifNumRep = manifNumRep;
	}

	/**
	 * @return the codeBur
	 */
	public java.lang.String getCodeBur() {
		return codeBur;
	}

	/**
	 * @param codeBur the codeBur to set
	 */
	public void setCodeBur(java.lang.String codeBur) {
		this.codeBur = codeBur;
	}

	/**
	 * @return the manifCodeConsignataire
	 */
	public java.lang.String getManifCodeConsignataire() {
		return manifCodeConsignataire;
	}

	/**
	 * @param manifCodeConsignataire the manifCodeConsignataire to set
	 */
	public void setManifCodeConsignataire(java.lang.String manifCodeConsignataire) {
		this.manifCodeConsignataire = manifCodeConsignataire;
	}

	/**
	 * @return the manifAnneeEnregManif
	 */
	public java.lang.String getManifAnneeEnregManif() {
		return manifAnneeEnregManif;
	}

	/**
	 * @param manifAnneeEnregManif the manifAnneeEnregManif to set
	 */
	public void setManifAnneeEnregManif(java.lang.String manifAnneeEnregManif) {
		this.manifAnneeEnregManif = manifAnneeEnregManif;
	}

	/**
	 * @return the manifNumRep
	 */
	public java.lang.String getManifNumRep() {
		return manifNumRep;
	}

	/**
	 * @param manifNumRep the manifNumRep to set
	 */
	public void setManifNumRep(java.lang.String manifNumRep) {
		this.manifNumRep = manifNumRep;
	}
	
	

}
