package sn.com.douane.ejb.rc.model.entities;

import java.io.Serializable;
import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Column;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.JoinColumn;
/**
 * 
 * @author nesrine
 *
 */
@Entity
@Table(name="MODEREGLEMENT")
public class ModeReglement implements Serializable{

	private static final long serialVersionUID = 31926427101917292L;

	@Id
	@Column(name="RCCODEMODEREG", length=2, nullable=false)
	private String rcCodeModeReg;
	
	@Column(name="RCLIBREGLEMENT", length=50, nullable=false)
    private String rcLibReglement;
	
	@ManyToOne
	@JoinColumn(name="RCIDJRNALREGLEMENT")
	private JournalTresor jourTresModReg;
	
	@Column(name="RCREFREGLEMENT", length=30)
    private String rcRefReglement;
	
	@ManyToOne 
	@JoinColumn(name = "RCETATMODEREGLEMENT")
	private EtatModeReglement etatModReg;
	
	@Column(name="RCDATEDECISIONREG")
    private Date rcDateDecisionReg;	
	
    public ModeReglement () {  }
    
    public ModeReglement(String rcCodeReglement, String rcLibReglement) {
		super();
		this.rcCodeModeReg = rcCodeReglement; 
		this.rcLibReglement = rcLibReglement;		
	}
 
	/**
	 * Get accessor for persistent attribute: rcCodeModeReg
     * @return rcCodeModeReg
     */
    public String getRcCodeModeReg() {
        return rcCodeModeReg;
    }

    /**
	 * Set accessor for persistent attribute: rcCodeModeReg
     * @param rcCodeModeReg
     */
	public void setRcCodeModeReg(String rcCodeModeReg) {
        this.rcCodeModeReg = rcCodeModeReg;
    }

    /**
	 * Get accessor for persistent attribute: rcLibReglement
	 * @return rcLibReglement
	 */
    public String getRcLibReglement() {
        return rcLibReglement;
    }

    /**
     * Set accessor for persistent attribute: rcLibReglement
     * @param rcLibReglement
     */
	public void setRcLibReglement(String rcLibReglement) {
        this.rcLibReglement = rcLibReglement;
    }

    /**
	 * Get accessor for persistent attribute: rcRefReglement
	 * @return rcRefReglement
	 */
    public String getRcRefReglement() {
        return rcRefReglement;
    }

    /**
	 * Set accessor for persistent attribute: rcRefReglement
     * @param rcRefReglement
     */
	public void setRcRefReglement(String rcRefReglement) {
        this.rcRefReglement = rcRefReglement;
    }

    /**
	 * Get accessor for persistent attribute: rcDateDecisionReg
	 * @return rcDateDecisionReg
	 */
    public Date getRcDateDecisionReg() {
        return rcDateDecisionReg;
    }

    /**
	 * Set accessor for persistent attribute: rcDateDecisionReg
     * @param rcDateDecisionReg
     */
	public void setRcDateDecisionReg(Date rcDateDecisionReg) {
        this.rcDateDecisionReg = rcDateDecisionReg;
    }

    /**
	 * This method was generated for supporting the relationship role named etatModReg. 
	 * @return etatModReg
	 */
    public EtatModeReglement getEtatModReg() {
        return etatModReg;
    }

    /**
	 * This method was generated for supporting the relationship role named etatModReg. 
	 */
	public void setEtatModReg(EtatModeReglement etatModReg) {
        this.etatModReg = etatModReg;
    }
	
	/**
	 * This method was generated for supporting the relationship role named jourTresModReg.
	 * @return etatModReg
	 */
    public JournalTresor getJourTresModReg() {
        return jourTresModReg;
    }

    /**
	 * This method was generated for supporting the relationship role named jourTresModReg.
	 * @param jourTresModReg
	 */
	public void setJourTresModReg(JournalTresor jourTresModReg) {
        this.jourTresModReg = jourTresModReg;
    }
}
