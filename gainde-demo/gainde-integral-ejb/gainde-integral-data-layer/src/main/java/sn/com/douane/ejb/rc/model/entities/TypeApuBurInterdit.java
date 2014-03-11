package sn.com.douane.ejb.rc.model.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.IdClass;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Version;

import sn.com.douane.ejb.rc.model.keys.TypeApuBurInterditKey;

/**
 * TypeApuBurInterdit EJB3 Entity Bean.
 * 
 * @author Wadii
 */
@Entity
@IdClass(TypeApuBurInterditKey.class)
@Table(name = "TYPEAPUBURINTERDIT")
public class TypeApuBurInterdit implements Serializable {

	private static final long serialVersionUID = -2922254205174476724L;
	
	@Id
	private String rctypeapurement;
    
	@Id
	private String rccodebureau;
    
    @ManyToOne
    @JoinColumn(name = "RCCODEBUREAU", insertable = false, updatable = false)
    private BureauDouane burtypeapu;
    
    /**
	 * Enable JPA optimstic lock.
	 */
//	@SuppressWarnings("unused")
//	@Version
//	@Column(nullable = false)
//	private int version;
//    
	/**
	 * 0-args default constructor.
	 */
    public TypeApuBurInterdit() { 
    	super();
    }    
    
	/**
	 * 2-args default constructor.
	 */
	public TypeApuBurInterdit(String rctypeapurement, String rccodebureau) {
		super();
		this.rctypeapurement = rctypeapurement;
		this.rccodebureau = rccodebureau;
	}
	
	/**
	 * Get accessor for persistent attribute rctypeapurement.
	 */
    public String getRctypeapurement() {
        return rctypeapurement;
    }

	public BureauDouane getBurtypeapu() {
		return burtypeapu;
	}

	public void setBurtypeapu(BureauDouane burtypeapu) {
		this.burtypeapu = burtypeapu;
	}

	public String getRccodebureau() {
		return rccodebureau;
	}

	public void setRccodebureau(String rccodebureau) {
		this.rccodebureau = rccodebureau;
	}   

}
