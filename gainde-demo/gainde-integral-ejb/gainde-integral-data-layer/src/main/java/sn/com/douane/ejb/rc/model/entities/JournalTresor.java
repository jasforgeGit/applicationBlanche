package sn.com.douane.ejb.rc.model.entities;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.OneToMany;

import sn.com.douane.ejb.tresor.model.entities.DosReglementDef;
import sn.com.douane.ejb.tresor.model.entities.DosReglementProv;
import sn.com.douane.ejb.tresor.model.entities.ReglementCredit;
/**
 * 
 * @author nesrine
 *
 */
@Entity

@Table(name="JOURNALTRESOR")
public class JournalTresor implements Serializable{

	private static final long serialVersionUID = 1333303104491872791L;

	@Id
	@Column(name="TRCODEJOURNAL", length=10, nullable=false)
	private String trCodeJournal;
	
	@Column(name="TRLIBELLEJOURNAL", length=100, nullable=false)
    private String trLibelleJournal;
	
	@OneToMany(mappedBy ="jourTresModReg")
	private List<ModeReglement> modeReglements;
	
	@OneToMany(mappedBy = "jrnTreDosPaie", targetEntity = DosReglementDef.class)
	private List<DosReglementDef> dosReglementDef;
   
	@OneToMany(mappedBy = "jrnTreDosPaieProv", targetEntity = DosReglementProv.class)
	private List<DosReglementProv> dosReglementProv;

	@OneToMany(mappedBy = "jnrTresRegCre", targetEntity = ReglementCredit.class)
	private List<ReglementCredit> reglementCredit;
	   
    public JournalTresor() {
    }
    
    public JournalTresor(String trCodeJournal) {
    	super(); 
		this.trCodeJournal= trCodeJournal;
	}
    
    
    public JournalTresor(String trCodeJournal, String trLibelleJournal) {
		super();
		this.trCodeJournal = trCodeJournal;
		this.trLibelleJournal = trLibelleJournal;
	}

	/**
	 * Get accessor for persistent attribute: trCodeJournal
	 */
    public String getTrCodeJournal() {
        return trCodeJournal;
    }

    /**
	 * Set accessor for persistent attribute: trCodeJournal
	 */
	public void setTrCodeJournal(String trCodeJournal) {
        this.trCodeJournal = trCodeJournal;
    }

    /**
	 * Get accessor for persistent attribute: trLibelleJournal
	 */
    public String getTrlibellejournal() {
        return trLibelleJournal;
    }

    /**
	 * Set accessor for persistent attribute: trLibelleJournal
	 */
	public void setTrlibellejournal(String trLibelleJournal) {
        this.trLibelleJournal = trLibelleJournal;
    }
	
	/**
	 * This method was generated for supporting the relationship role named modereglement.
	 * It will be deleted/edited when the relationship is deleted/edited.
	 */
    public List<ModeReglement> getModeReglements() {
        return modeReglements;
    }

    /**
	 * This method was generated for supporting the relationship role named modereglement.
	 * It will be deleted/edited when the relationship is deleted/edited.
	 */
	public void setModeReglements(List<ModeReglement> modeReglements) {
        this.modeReglements = modeReglements;
    }

	public List<DosReglementDef> getDosReglementDef() {
		return dosReglementDef;
	}

	public void setDosReglementDef(List<DosReglementDef> dosReglementDef) {
		this.dosReglementDef = dosReglementDef;
	}

	public List<DosReglementProv> getDosReglementProv() {
		return dosReglementProv;
	}

	public void setDosReglementProv(List<DosReglementProv> dosReglementProv) {
		this.dosReglementProv = dosReglementProv;
	}

	public List<ReglementCredit> getReglementCredit() {
		return reglementCredit;
	}

	public void setReglementCredit(List<ReglementCredit> reglementCredit) {
		this.reglementCredit = reglementCredit;
	}
	
}
