/**
 * moussakare
 */
package sn.com.douane.ejb.manifeste.model.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.Table;

import sn.com.douane.ejb.manifeste.model.keys.HistoScoreBurKey;



/**
 * @author moussakare
 *
 */

@Entity
@IdClass(HistoScoreBurKey.class)
@Table(name="HISTOSCOREBUR")

public class HistoScoreBur implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -8655653586172074298L;
	
	@Id
	@Column(name="CODEBUREAU", length=3, nullable=false)
	private java.lang.String codeBureau;
	
	@Id
	@Column(name="NUMMANIFESTE", length=100, nullable=false)
	private java.lang.String numManifeste;
	
	@Column(name="SCOREOBTENU", nullable=false)
	private java.lang.Integer scoreObtenu;

	/**
	 * 
	 */
	public HistoScoreBur() {
	}

	/**
	 * @param codeBureau
	 * @param numManifeste
	 * @param scoreObtenu
	 */
	public HistoScoreBur(String codeBureau, String numManifeste,
			Integer scoreObtenu) {
		super();
		this.codeBureau = codeBureau;
		this.numManifeste = numManifeste;
		this.scoreObtenu = scoreObtenu;
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

	/**
	 * @return the scoreObtenu
	 */
	public java.lang.Integer getScoreObtenu() {
		return scoreObtenu;
	}

	/**
	 * @param scoreObtenu the scoreObtenu to set
	 */
	public void setScoreObtenu(java.lang.Integer scoreObtenu) {
		this.scoreObtenu = scoreObtenu;
	}
	
}
