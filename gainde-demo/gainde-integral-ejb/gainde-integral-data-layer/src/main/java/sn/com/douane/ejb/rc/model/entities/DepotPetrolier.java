package sn.com.douane.ejb.rc.model.entities;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
/**
 * 
 * @author nesrine
 *
 */
@Entity
@Table(name="DEPOTPETROLIER")
@NamedQueries(
		@NamedQuery(name = "findByConcessionnaire", 
		query = "select object(o) from DepotPetrolier o where  o.rcCodePpm = ?1"))
public class DepotPetrolier implements Serializable{

	private static final long serialVersionUID = -7426572174536657885L;

	@Id
	@Column(name="RCCODEDEPOT", length=10, nullable=false)
	private String rcCodeDepot; 
    
	@Column(name="RCLIBELLEDEPOT", length=100)
	private String rcLibelleDepot;
    
	@Column(name="RCADRESSEDEPOT", length=100)
	private String rcAdresseDepot;
    
	@Column(name="RCCODEPPM", length=5,nullable=false)
	private String rcCodePpm;
	
	@Column(name="AGREMENT",length=50)
	private String agrement;  
	
	@ManyToOne(targetEntity = Ppm.class)
	@JoinColumn(name = "RCCODEPPM",referencedColumnName="RCCODEPPM", insertable = false, updatable = false)
	private Ppm ppm;
	
	@OneToMany(mappedBy = "bacDepotPetr")
	private List<BacDepotPetrolier> bacDepotPetroliers;
    
	public DepotPetrolier() {
    }
    
	/**
     * 4-args constructeur
     * @param rcCodeDepot
     * @param rcLibelleDepot
     * @param rcAdresseDepot
     * @param rcPpmConcess
     */
    public DepotPetrolier(String rcCodeDepot, String rcLibelleDepot,
			String rcAdresseDepot, String rcPpm) {
		super();
		this.rcCodeDepot = rcCodeDepot;
		this.rcLibelleDepot = rcLibelleDepot;
		this.rcAdresseDepot = rcAdresseDepot;
		this.rcCodePpm = rcPpm;
	}
    
    public DepotPetrolier(String rcCodeDepot,String rcPpm) {
		super();
		this.rcCodeDepot = rcCodeDepot;
		this.rcCodePpm = rcPpm;
	}

    /**
	 * Get accessor for persistent attribute: rcCodeDepot
	 */
    public String getRcCodeDepot() {
        return rcCodeDepot;
    }
	/**
	 * Set accessor for persistent attribute: rcCodeDepot
	 */
	public void setRcCodeDepot(String rcCodeDepot) {
        this.rcCodeDepot = rcCodeDepot;
    }

    /**
	 * Get accessor for persistent attribute: rcLibelleDepot
	 */
    public String getRcLibelleDepot() {
        return rcLibelleDepot;
    }

    /**
	 * Set accessor for persistent attribute: rcLibelleDepot
	 */
	public void setRcLibelleDepot(String rcLibelleDepot) {
        this.rcLibelleDepot = rcLibelleDepot;
    }

    /**
	 * Get accessor for persistent attribute: rcAdresseDepot
	 */
    public String getRcAdresseDepot() {
        return rcAdresseDepot;
    }

    /**
	 * Set accessor for persistent attribute: rcAdresseDepot
	 */
	public void setRcAdresseDepot(String rcAdresseDepot) {
        this.rcAdresseDepot = rcAdresseDepot;
    }

    	
	/**
	 * This method was generated for supporting the relationship role named bacDepotPetroliers.
	 * It will be deleted/edited when the relationship is deleted/edited.
	 */
    public List<BacDepotPetrolier> getBacDepotPetroliers() {
        return bacDepotPetroliers;
    }

    /**
	 * This method was generated for supporting the relationship role named bacDepotPetroliers.
	 * It will be deleted/edited when the relationship is deleted/edited.
	 */
	public void setBacDepotPetroliers(List<BacDepotPetrolier> bacDepotPetroliers) {
        this.bacDepotPetroliers = bacDepotPetroliers;
    }

	public String getRcCodePpm() {
		return rcCodePpm;
	}

	public void setRcCodePpm(String rcCodePpm) {
		this.rcCodePpm = rcCodePpm;
	}

	public String getAgrement() {
		return agrement;
	}

	public void setAgrement(String agrement) {
		this.agrement = agrement;
	}

	public Ppm getPpm() {
		return ppm;
	}

	public void setPpm(Ppm ppm) {
		this.ppm = ppm;
	}   
	
	
	
	

}
