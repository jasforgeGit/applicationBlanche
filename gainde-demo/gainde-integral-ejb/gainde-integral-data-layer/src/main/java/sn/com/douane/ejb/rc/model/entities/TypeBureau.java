package sn.com.douane.ejb.rc.model.entities;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Version;

// import tn.com.tw.java.exception.TwreException;

/**
 * TypeBureau EJB3 Entity Bean.
 * 
 * @author Wadii
 */
@Entity
@Table(name = "TypeBureau")
public class TypeBureau implements Serializable {	
  
	private static final long serialVersionUID = -5778995898045292392L;
	
	@Id
	@Column(name = "RCCODETYPEBUR", nullable=false)
	private Integer rccodetypebur;
	
	@Column(name = "RCLIBELLETYPEBUR", length=100, nullable=false)
    private String rclibelletypebur;
    
	@OneToMany(mappedBy = "typeBureau")
    private List<BureauDouane> bureauxDouane = new ArrayList<BureauDouane>();    
	
	/**
	 * Enable JPA optimstic lock.
	 */
//	@SuppressWarnings("unused")
//	@Version
//	@Column(nullable = false)
//	private int version;

	/**
     * 0-args Constructor.
     */
    public TypeBureau() { }

    public TypeBureau(Integer rccodetypebur, String rclibelletypebur) {
		super();
		this.rccodetypebur=rccodetypebur;
		this.rclibelletypebur=rclibelletypebur;
		
	}
    
    /**
     * 1-args constructor.
     * 
     * @param rccodetypebur
     */
	public TypeBureau(Integer rccodetypebur) {
		super();
		this.rccodetypebur=rccodetypebur;		
	}
	
    /**
	 * Get accessor for persistent attribute: rccodetypebur
	 */	
    public Integer getRccodetypebur() {
        return rccodetypebur;
    }

    /**
	 * Set accessor for persistent attribute: rccodetypebur
	 */
	public void setRccodetypebur(Integer rccodetypebur) {
        this.rccodetypebur = rccodetypebur;
    }

    /**
	 * Get accessor for persistent attribute: rclibelletypebur
	 */	
    public String getRclibelletypebur() {
        return rclibelletypebur;
    }

    /**
	 * Set accessor for persistent attribute: rclibelletypebur
	 */
	public void setRclibelletypebur(String rclibelletypebur) {
        this.rclibelletypebur = rclibelletypebur;
    }

	public List<BureauDouane> getBureauxDouane() {
		return bureauxDouane;
	}

	public void setBureauxDouane(List<BureauDouane> bureauxDouane) {
		this.bureauxDouane = bureauxDouane;
	}

}
