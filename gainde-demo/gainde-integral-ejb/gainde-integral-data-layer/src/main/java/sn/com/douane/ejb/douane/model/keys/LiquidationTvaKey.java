package sn.com.douane.ejb.douane.model.keys;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Id;


public class LiquidationTvaKey implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 5040400579926035302L;

	@Id
	@Column(name = "ANNEEDECLARATION", columnDefinition = "CHAR(4)", nullable = false)
	private String anneeDeclaration;

	@Id
	@Column(name = "BUREAUDECLARATION", columnDefinition = "CHAR(3)", nullable = false)
	private String bureauDeclaration;

	@Id
	@Column(name = "NUMERODECLARATION", nullable = false)
	private Integer numeroDeclaration;

	@Id
	@Column(name = "CODETAXE", columnDefinition = "CHAR(2)", nullable = false)
	private String codeTaxe;

	public LiquidationTvaKey(){
		
	}
	
	/**
	 * @param anneeDeclaration
	 * @param bureauDeclaration
	 * @param numeroDeclaration
	 * @param codeTaxe
	 */
	public LiquidationTvaKey(String anneeDeclaration, String bureauDeclaration,
			Integer numeroDeclaration, String codeTaxe) {
		this.anneeDeclaration = anneeDeclaration;
		this.bureauDeclaration = bureauDeclaration;
		this.numeroDeclaration = numeroDeclaration;
		this.codeTaxe = codeTaxe;
	}

	/**
	 * @return the anneeDeclaration
	 */
	public String getAnneeDeclaration() {
		return anneeDeclaration;
	}

	/**
	 * @param anneeDeclaration the anneeDeclaration to set
	 */
	public void setAnneeDeclaration(String anneeDeclaration) {
		this.anneeDeclaration = anneeDeclaration;
	}

	/**
	 * @return the bureauDeclaration
	 */
	public String getBureauDeclaration() {
		return bureauDeclaration;
	}

	/**
	 * @param bureauDeclaration the bureauDeclaration to set
	 */
	public void setBureauDeclaration(String bureauDeclaration) {
		this.bureauDeclaration = bureauDeclaration;
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

	/**
	 * @return the codeTaxe
	 */
	public String getCodeTaxe() {
		return codeTaxe;
	}

	/**
	 * @param codeTaxe the codeTaxe to set
	 */
	public void setCodeTaxe(String codeTaxe) {
		this.codeTaxe = codeTaxe;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime
				* result
				+ ((anneeDeclaration == null) ? 0 : anneeDeclaration.hashCode());
		result = prime * result
				+ ((bureauDeclaration == null) ? 0 : bureauDeclaration.hashCode());
		result = prime * result
				+ ((numeroDeclaration == null) ? 0 : numeroDeclaration.hashCode());
		result = prime * result
				+ ((codeTaxe == null) ? 0 : codeTaxe.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
			if (obj instanceof LiquidationTvaKey) {
				LiquidationTvaKey o = (LiquidationTvaKey) obj;
				return ((this.anneeDeclaration.equals(o.anneeDeclaration))
					&& (this.bureauDeclaration.equals(o.bureauDeclaration))
					&& (this.numeroDeclaration.equals(o.numeroDeclaration))
					&& (this.codeTaxe.equals(o.codeTaxe)));
			}
			return false;
		}
}
