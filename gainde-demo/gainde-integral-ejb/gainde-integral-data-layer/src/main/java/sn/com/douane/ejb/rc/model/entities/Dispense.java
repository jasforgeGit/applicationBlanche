package sn.com.douane.ejb.rc.model.entities;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Version;

/**
 * Dispense EJB3 Entity Bean.
 * 
 * @author Wadii
 */
@Entity
@Table(name = "DISPENSES")
@NamedQueries(@javax.persistence.NamedQuery(name = "Dispense.findByDispCodetaxe" ,
query = "select object(o) from Dispense o where  o.rccodedispense = ?1 and o.rcCodeTaxe = ?2"))

public class Dispense implements Serializable {
 
	private static final long serialVersionUID = 2527980088731528707L;
	
	@Id
	@Column(name = "RCCODEDISPENSE", length=5, nullable=false)
	private String rccodedispense;
	
	@Column(name = "RCDESDISPENSE", length=100, nullable=false)
    private String rcdesdispense;    
    
	@Column(name="RCCODETAXE", length=2, nullable=false)
	private String rcCodeTaxe; 
	
	@OneToMany(mappedBy = "dispense")
    private List<DispensePieceJointe> dispensespj = new ArrayList<DispensePieceJointe>();	

	@ManyToOne(targetEntity = Taxe.class)
	@JoinColumn(name = "rcCodeTaxe",insertable=false, updatable=false)
    private Taxe taxe;
    
	@OneToMany(mappedBy = "dispDTRInterd", targetEntity = DispTRegimeInterdit.class)
    private List<DispTRegimeInterdit> dispTRegimInterdits;
	
	/**
	 * Enable JPA optimstic lock.
	 */
//	@SuppressWarnings("unused")
//	@Version
//	@Column(nullable = false)
//	private int version;
	
	/**
	 * 0-arg constructor.
	 */
	public Dispense() {
		super();
	}
	
	/**
	 * 1-arg constructor.
	 * 
	 * @param rccodedispense
	 */
	public Dispense(String rccodedispense) {
		super();
		this.rccodedispense = rccodedispense;
	}

	/**
	 * 3-args constructor.
	 * 
	 * @param rccodedispense
	 * @param rcdesdispense
	 * @param rcCodeTaxe
	 */
	public Dispense(String rccodedispense, String rcdesdispense,
			String rcCodeTaxe) {
		super();
		this.rccodedispense = rccodedispense;
		this.rcdesdispense = rcdesdispense;
		this.rcCodeTaxe = rcCodeTaxe;
	}

	/**
	 * Get accessor for persistent attribute: rccodedispense
	 */	
    public String getRccodedispense() {
        return rccodedispense;
    }

    /**
	 * Set accessor for persistent attribute: rccodedispense
	 */
	public void setRccodedispense(String rccodedispense) {
        this.rccodedispense = rccodedispense;
    }

    /**
	 * Get accessor for persistent attribute: rcdesdispense
	 */
	
    public String getRcdesdispense() {
        return rcdesdispense;
    }

    /**
	 * Set accessor for persistent attribute: rcdesdispense
	 */
	public void setRcdesdispense(String rcdesdispense) {
        this.rcdesdispense = rcdesdispense;
    }

	public List<DispensePieceJointe> getDispensespj() {
		return dispensespj;
	}

	public void setDispensespj(List<DispensePieceJointe> dispensespj) {
		this.dispensespj = dispensespj;
	}
	
	public Taxe getTaxe() {
		return taxe;
	}

	public void setTaxe(Taxe taxe) {
		this.taxe = taxe;
	}

	public List<DispTRegimeInterdit> getDispTRegimInterdits() {
		return dispTRegimInterdits;
	}

	public void setDispTRegimInterdits(List<DispTRegimeInterdit> dispTRegimInterdits) {
		this.dispTRegimInterdits = dispTRegimInterdits;
	}

	/**
	 * @return the rcCodeTaxe
	 */
	public String getRcCodeTaxe() {
		return rcCodeTaxe;
	}

	/**
	 * @param rcCodeTaxe the rcCodeTaxe to set
	 */
	public void setRcCodeTaxe(String rcCodeTaxe) {
		this.rcCodeTaxe = rcCodeTaxe;
	}



  

}
