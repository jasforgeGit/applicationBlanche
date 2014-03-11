package sn.com.douane.ejb.rc.model.entities;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Version;
/**
 * 
 * @author nesrine
 *
 */
@Entity
@Table(name="ETATMODEREGLEMENT")
public class EtatModeReglement implements Serializable{

	private static final long serialVersionUID = -7855914187983759016L;

	@Id
	@Column(name="RCCODETATMODEREGLEMENT", length=1, nullable=false)
	private String rcCodEtatModeReglement;

	@Column(name="RCLIBETATMODEREGLEMENT", length=100, nullable=false)
	private String rcLibEtatModeReglement;
	
	@OneToMany(mappedBy = "etatModReg")
	private List<ModeReglement> modeReglements; 
	
	/**
	 * Enable JPA optimstic lock.
	 */
	
//	@SuppressWarnings("unused")
//	@Version
//	@Column(nullable = false)
//	private int version;

	public EtatModeReglement() { }

	public EtatModeReglement(
			String rcCodEtatModeReglement,
			String rcLibEtatModeReglement) {
		super(); 
		this.rcCodEtatModeReglement = rcCodEtatModeReglement;
		this.rcLibEtatModeReglement = rcLibEtatModeReglement;
	}

	public EtatModeReglement(String rcCodEtatModeReglement,
			String rcLibEtatModeReglement, List<ModeReglement> modeReglements) {
		super();
		this.rcCodEtatModeReglement = rcCodEtatModeReglement;
		this.rcLibEtatModeReglement = rcLibEtatModeReglement;
		this.modeReglements = modeReglements;
	}

	/**
	 * Get accessor for persistent attribute: rcCodEtatModeReglement
	 */
	public String getRcCodEtatModeReglement() {
		return rcCodEtatModeReglement;
	}

	/**
	 * Set accessor for persistent attribute: rcCodEtatModeReglement
	 */
	public void setRcCodEtatModeReglement(String rcCodEtatModeReglement) {
		this.rcCodEtatModeReglement = rcCodEtatModeReglement;
	}

	/**
	 * Get accessor for persistent attribute: rcLibEtatModeReglement
	 */
	public String getRcLibEtatModeReglement() {
		return rcLibEtatModeReglement;
	}

	/**
	 * Set accessor for persistent attribute: rcLibEtatModeReglement
	 */
	public void setRcLibEtatModeReglement(String rcLibEtatModeReglement) {
		this.rcLibEtatModeReglement = rcLibEtatModeReglement;
	}
	
	/**
	 * This method was generated for supporting the relationship role named
	 * modereglement. 
	 */
	public List<ModeReglement> getModeReglements() {
		return modeReglements;
	}

	/**
	 *  This method was generated for supporting the relationship role named modeReglements
	 * @param modeReglements
	 */
	public void setModeReglements(List<ModeReglement> modeReglements) {
		this.modeReglements = modeReglements;
	}


}
