/**
 * 
 */
package sn.com.douane.ejb.declaration.model.keys;

import java.io.Serializable;
import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Id;

/**
 * @author moussakare
 *
 */
public class HistoBulletinEcorKey implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 4379524583739240160L;
	
	@Column(name = "ECORANNEE", length = 4, nullable = false)
	private java.lang.String ecorAnnee;
	
	@Column(name = "ECORCODEBUREAU", length = 3, nullable = false)
    private java.lang.String ecorCodeBureau;
	
	@Column(name = "ECORNUMERO", nullable = false)
    private java.lang.Integer ecorNumero;
	
	@Column(name = "ECORDATEDERNIERMAJ", nullable = false)
    private java.sql.Timestamp ecorDateDernierMaj;

	/**
	 * 
	 */
	public HistoBulletinEcorKey() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param ecorAnnee
	 * @param ecorCodeBureau
	 * @param ecorNumero
	 * @param ecorDateDernierMaj
	 */
	public HistoBulletinEcorKey(String ecorAnnee, String ecorCodeBureau,
			Integer ecorNumero, Timestamp ecorDateDernierMaj) {
		super();
		this.ecorAnnee = ecorAnnee;
		this.ecorCodeBureau = ecorCodeBureau;
		this.ecorNumero = ecorNumero;
		this.ecorDateDernierMaj = ecorDateDernierMaj;
	}

	/**
	 * @return the ecorAnnee
	 */
	public java.lang.String getEcorAnnee() {
		return ecorAnnee;
	}

	/**
	 * @param ecorAnnee the ecorAnnee to set
	 */
	public void setEcorAnnee(java.lang.String ecorAnnee) {
		this.ecorAnnee = ecorAnnee;
	}

	/**
	 * @return the ecorCodeBureau
	 */
	public java.lang.String getEcorCodeBureau() {
		return ecorCodeBureau;
	}

	/**
	 * @param ecorCodeBureau the ecorCodeBureau to set
	 */
	public void setEcorCodeBureau(java.lang.String ecorCodeBureau) {
		this.ecorCodeBureau = ecorCodeBureau;
	}

	/**
	 * @return the ecorNumero
	 */
	public java.lang.Integer getEcorNumero() {
		return ecorNumero;
	}

	/**
	 * @param ecorNumero the ecorNumero to set
	 */
	public void setEcorNumero(java.lang.Integer ecorNumero) {
		this.ecorNumero = ecorNumero;
	}

	/**
	 * @return the ecorDateDernierMaj
	 */
	public java.sql.Timestamp getEcorDateDernierMaj() {
		return ecorDateDernierMaj;
	}

	/**
	 * @param ecorDateDernierMaj the ecorDateDernierMaj to set
	 */
	public void setEcorDateDernierMaj(java.sql.Timestamp ecorDateDernierMaj) {
		this.ecorDateDernierMaj = ecorDateDernierMaj;
	}
	
}
