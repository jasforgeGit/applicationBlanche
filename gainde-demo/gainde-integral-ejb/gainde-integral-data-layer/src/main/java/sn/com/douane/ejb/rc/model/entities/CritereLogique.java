package sn.com.douane.ejb.rc.model.entities;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Version;

/**
 * CritereLogique EJB3 Entity Bean.
 * 
 * @author Wadii
 */
@Entity
@Table(name = "CRITERESLOGIQUES")
public class CritereLogique implements Serializable {
	
	private static final long serialVersionUID = -2258928712194916679L;
	
	@Id
	@Column(name = "RCCODECRITERELOGIQUE", nullable = false)
	private Integer rccodecriterelogique;
	
	@Column(name = "RCLIBELLECRITERELOGIQUE",length = 500, nullable = false)
    private String rclibellecriterelogique;
    
	@Column(name = "RCDATEDEBUTCRITERELOGIQUE", nullable = false)
    private java.sql.Date rcdatedebutcriterelogique;
    
	@Column(name = "RCCIRCUITVISITE", length = 1,nullable = false)
    private String rccircuitvisite;
    
	@Column(name = "RCDATEFINCRITERELOGIQUE")
    private java.sql.Date rcdatefincriterelogique;
    
	@Column(name = "RCCODEBUREAU", length=3)
    private String rccodebureau;
	
	@OneToMany(mappedBy = "critereLogique", targetEntity = Chaine.class)
	private List<Chaine> chaine = new ArrayList<Chaine>();
    
	@ManyToOne
	@JoinColumn(name = "rccodebureau", insertable = false, updatable = false)
    private BureauDouane burcriterelog;   	
    
	@ManyToOne(targetEntity = CircuitVisite.class)
	@JoinColumn(name = "RCCIRCUITVISITE", insertable = false, updatable = false)
    private CircuitVisite circuitVisite; 	

	/**
	 * Enable JPA optimstic lock.
	 */
//	@SuppressWarnings("unused")
//	@Version
//	@Column(nullable = false)
//	private int version;

	/**
	 * 0-args Default constructor.
	 */
	 public CritereLogique() { }
	 
	/**
	 * 1-args Default constructor.
	 */
	public CritereLogique(Integer rccodecriterelogique) {
		super(); 
		this.rccodecriterelogique=rccodecriterelogique;		
	}  

	/**
	 * Get accessor for persistent attribute: rclibellecriterelogique
	 */	
    public String getRclibellecriterelogique() {
        return rclibellecriterelogique;
    }

    /**
	 * Set accessor for persistent attribute: rclibellecriterelogique
	 */
	public void setRclibellecriterelogique(String rclibellecriterelogique) {
        this.rclibellecriterelogique = rclibellecriterelogique;
    }

    /**
	 * Get accessor for persistent attribute : rcdatedebutcriterelogique
	 */	
    public java.sql.Date getRcdatedebutcriterelogique() {
        return rcdatedebutcriterelogique;
    }

    /**
	 * Set accessor for persistent attribute: rcdatedebutcriterelogique
	 */
	public void setRcdatedebutcriterelogique(java.sql.Date rcdatedebutcriterelogique) {
        this.rcdatedebutcriterelogique = rcdatedebutcriterelogique;
    }

    /**
	 * Get accessor for persistent attribute: rccircuitvisite
	 */
    public String getRccircuitvisite() {
        return rccircuitvisite;
    }

    /**
	 * Set accessor for persistent attribute: rccircuitvisite
	 */
	public void setRccircuitvisite(java.lang.String rccircuitvisite) {
        this.rccircuitvisite = rccircuitvisite;
    }

    /**
	 * Get accessor for persistent attribute: rcdatefincriterelogique
	 */	
    public java.sql.Date getRcdatefincriterelogique() {
        return rcdatefincriterelogique;
    }

    /**
	 * Set accessor for persistent attribute: rcdatefincriterelogique
	 */
	public void setRcdatefincriterelogique(java.sql.Date rcdatefincriterelogique) {
        this.rcdatefincriterelogique = rcdatefincriterelogique;
    }

    /**
	 * Get accessor for persistent attribute: rccodebureau
	 */	
    public String getRccodebureau() {
        return rccodebureau;
    }

    /**
	 * Set accessor for persistent attribute: rccodebureau
	 */
	public void setRccodebureau(java.lang.String rccodebureau) {
        this.rccodebureau = rccodebureau;
    }

    /**
	 * Get accessor for persistent attribute: rccodecriterelogique
	 */	
    public Integer getRccodecriterelogique() {
        return rccodecriterelogique;
    }

    /**
	 * Set accessor for persistent attribute: rccodecriterelogique
	 */
	public void setRccodecriterelogique(Integer rccodecriterelogique) {
        this.rccodecriterelogique = rccodecriterelogique;
    }
		
	public List<Chaine> getChaine() {
		return chaine;
	}

	public void setChaine(List<Chaine> chaine) {
		this.chaine = chaine;
	}
	
	public CircuitVisite getCircuitVisite() {
		return circuitVisite;
	}

	public void setCircuitVisite(CircuitVisite circuitVisite) {
		this.circuitVisite = circuitVisite;
	}
	
	@Override
	public boolean equals(Object o) {
		if (o instanceof CritereLogique) {			
			if ( (this.getRccodecriterelogique().equals(((CritereLogique) o).getRccodecriterelogique()))) {
				return true;
			}			
		}
		return false;		
	}
	
	@Override
	public int hashCode(){
		return this.getRccodebureau().length() * this.getRclibellecriterelogique().length();
    }

	public BureauDouane getBurcriterelog() {
		return burcriterelog;
	}

	public void setBurcriterelog(BureauDouane burcriterelog) {
		this.burcriterelog = burcriterelog;
	}

}