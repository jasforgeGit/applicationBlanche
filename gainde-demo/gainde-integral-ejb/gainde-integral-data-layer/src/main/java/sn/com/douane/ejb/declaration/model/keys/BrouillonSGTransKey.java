/**
 * 
 */
package sn.com.douane.ejb.declaration.model.keys;

import java.io.Serializable;

import javax.persistence.Column;

/**
 * @author moussakare
 *
 */
public class BrouillonSGTransKey implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -219061637457682768L;
	@Column(name = "DECANNEEENREGTRANS", length = 4, nullable = false)
	private java.lang.String decAnneeEnregTrans;
	@Column(name = "DECPPMDECTRANS", length = 5, nullable = false)
    private java.lang.String decPpmDecTrans;
	@Column(name = "DECREPDECTRANS", length = 6, nullable = false)
    private java.lang.String decRepDecTrans;
	/**
	 * 
	 */
	public BrouillonSGTransKey() {
		super();
		// TODO Auto-generated constructor stub
	}
	/**
	 * @param decAnneeEnregTrans
	 * @param decPpmDecTrans
	 * @param decRepDecTrans
	 */
	public BrouillonSGTransKey(String decAnneeEnregTrans,
			String decPpmDecTrans, String decRepDecTrans) {
		super();
		this.decAnneeEnregTrans = decAnneeEnregTrans;
		this.decPpmDecTrans = decPpmDecTrans;
		this.decRepDecTrans = decRepDecTrans;
	}
	/**
	 * @return the decAnneeEnregTrans
	 */
	public java.lang.String getDecAnneeEnregTrans() {
		return decAnneeEnregTrans;
	}
	/**
	 * @param decAnneeEnregTrans the decAnneeEnregTrans to set
	 */
	public void setDecAnneeEnregTrans(java.lang.String decAnneeEnregTrans) {
		this.decAnneeEnregTrans = decAnneeEnregTrans;
	}
	/**
	 * @return the decPpmDecTrans
	 */
	public java.lang.String getDecPpmDecTrans() {
		return decPpmDecTrans;
	}
	/**
	 * @param decPpmDecTrans the decPpmDecTrans to set
	 */
	public void setDecPpmDecTrans(java.lang.String decPpmDecTrans) {
		this.decPpmDecTrans = decPpmDecTrans;
	}
	/**
	 * @return the decRepDecTrans
	 */
	public java.lang.String getDecRepDecTrans() {
		return decRepDecTrans;
	}
	/**
	 * @param decRepDecTrans the decRepDecTrans to set
	 */
	public void setDecRepDecTrans(java.lang.String decRepDecTrans) {
		this.decRepDecTrans = decRepDecTrans;
	}
	
	

}
