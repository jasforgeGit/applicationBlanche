/**
 * 
 */
package sn.com.douane.ejb.declaration.model.keys;

import java.io.Serializable;
import java.sql.Timestamp;

import javax.persistence.Column;

/**
 * @author moussakare
 *
 */
public class HAcquitEnregistreKey implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -1771354193212960825L;
	@Column(name = "DECDATEARCHIVE")	
	private java.sql.Timestamp decDateArchive;
	
	@Column(name = "ANNEEDECLARATION" ,  length = 4 ,  nullable = false)
	private java.lang.String anneeDeclaration;

	@Column(name = "BUREAUDEC" ,  length = 3 ,  nullable = false)
	private String bureauDec;

	@Column(name = "NUMERODECLARATION" , nullable = false)
	private Integer numeroDeclaration;

	/**
	 * 
	 */
	public HAcquitEnregistreKey() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param decDateArchive
	 * @param anneeDeclaration
	 * @param bureauDec
	 * @param numeroDeclaration
	 */
	public HAcquitEnregistreKey(Timestamp decDateArchive,
			String anneeDeclaration, String bureauDec, Integer numeroDeclaration) {
		super();
		this.decDateArchive = decDateArchive;
		this.anneeDeclaration = anneeDeclaration;
		this.bureauDec = bureauDec;
		this.numeroDeclaration = numeroDeclaration;
	}

	/**
	 * @return the decDateArchive
	 */
	public java.sql.Timestamp getDecDateArchive() {
		return decDateArchive;
	}

	/**
	 * @param decDateArchive the decDateArchive to set
	 */
	public void setDecDateArchive(java.sql.Timestamp decDateArchive) {
		this.decDateArchive = decDateArchive;
	}

	/**
	 * @return the anneeDeclaration
	 */
	public java.lang.String getAnneeDeclaration() {
		return anneeDeclaration;
	}

	/**
	 * @param anneeDeclaration the anneeDeclaration to set
	 */
	public void setAnneeDeclaration(java.lang.String anneeDeclaration) {
		this.anneeDeclaration = anneeDeclaration;
	}

	/**
	 * @return the bureauDec
	 */
	public String getBureauDec() {
		return bureauDec;
	}

	/**
	 * @param bureauDec the bureauDec to set
	 */
	public void setBureauDec(String bureauDec) {
		this.bureauDec = bureauDec;
	}

	/**
	 * @return the numeroDeclaration
	 */
	public Integer getNumeroDeclaration() {
		return numeroDeclaration;
	}

	/**
	 * @param numeroDeclaration the numeroDeclaration to set
	 */
	public void setNumeroDeclaration(Integer numeroDeclaration) {
		this.numeroDeclaration = numeroDeclaration;
	}
	
}
