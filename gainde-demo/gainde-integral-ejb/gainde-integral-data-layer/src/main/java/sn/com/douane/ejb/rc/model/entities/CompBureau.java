package sn.com.douane.ejb.rc.model.entities;


import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * CompBureau EJB3 Entity Bean.
 * 
 * @author Wadii
 */
@Entity
@Table(name = "COMPBUREAU")
public class CompBureau implements Serializable {	
  
	private static final long serialVersionUID = 374898981919162216L;

	@Id
	@Column(name = "RCCODECOMPETENCE", length = 2, nullable=false)
	private String rccodecompetence ;
	
	@Column(name = "RCDESCOMPETENCES", nullable=false)
    private String rcdescompetences;
    
    @OneToMany(mappedBy = "compBureau")
    private List<BureauDouane> bureaux = new ArrayList<BureauDouane>();   
    
   
	/**
     * 0-args Constructor.
     */
    public CompBureau() { }
    
    /**
     * 1-args Constructor.
     */
    public CompBureau(String rccodecompetence) {
		super();
		this.rccodecompetence= rccodecompetence;		
	}

    /**
     * 2-args constructor.
     * 
     * @param rccodecompetence
     * @param rcdescompetences
     */
	public CompBureau(String rccodecompetence, String rcdescompetences) {
		super();
		this.rccodecompetence = rccodecompetence;
		this.rcdescompetences = rcdescompetences;
	}

    /**
	 * Get accessor for persistent attribute: rccodecompetence
	 */
    public String getRccodecompetence() {
        return rccodecompetence;
    }

    /**
	 * Set accessor for persistent attribute: rccodecompetence
	 */
	public void setRccodecompetence(String rccodecompetence) {
        this.rccodecompetence = rccodecompetence;
    }

    /**
	 * Get accessor for persistent attribute: rcdescompetences
	 */
	public String getRcdescompetences() {
        return rcdescompetences;
    }

    /**
	 * Set accessor for persistent attribute: rcdescompetences
	 */
	public void setRcdescompetences(String rcdescompetences) {
        this.rcdescompetences = rcdescompetences;
    } 



	public List<BureauDouane> getBureaux() {
		return bureaux;
	}

	public void setBureaux(List<BureauDouane> bureaux) {
		this.bureaux = bureaux;
	}
	
}
