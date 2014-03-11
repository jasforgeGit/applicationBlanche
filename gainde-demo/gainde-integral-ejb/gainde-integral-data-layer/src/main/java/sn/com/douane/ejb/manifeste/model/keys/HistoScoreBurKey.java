/**
 * moussakare
 */
package sn.com.douane.ejb.manifeste.model.keys;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Id;

/**
 * @author moussakare
 *
 */
public class HistoScoreBurKey implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 8020904906581073989L;
	
	@Id
	@Column(name="CODEBUREAU", length=3, nullable=false)
	private java.lang.String codeBureau;
	
	@Id
	@Column(name="NUMMANIFESTE", length=100, nullable=false)
	private java.lang.String numManifeste;

	/**
	 * 
	 */
	public HistoScoreBurKey() {
	}

	/**
	 * @param codeBureau
	 * @param numManifeste
	 */
	public HistoScoreBurKey(String codeBureau, String numManifeste) {
		super();
		this.codeBureau = codeBureau;
		this.numManifeste = numManifeste;
	}

	/**
	 * @return the codeBureau
	 */
	public java.lang.String getCodeBureau() {
		return codeBureau;
	}

	/**
	 * @param codeBureau the codeBureau to set
	 */
	public void setCodeBureau(java.lang.String codeBureau) {
		this.codeBureau = codeBureau;
	}

	/**
	 * @return the numManifeste
	 */
	public java.lang.String getNumManifeste() {
		return numManifeste;
	}

	/**
	 * @param numManifeste the numManifeste to set
	 */
	public void setNumManifeste(java.lang.String numManifeste) {
		this.numManifeste = numManifeste;
	}

	
}
