package sn.com.douane.ejb.rc.model.entities;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table; 
import javax.persistence.Column; 

@Entity
@Table(name="LIEUDEPOT")
public class LieuDepot implements Serializable{

	/**
	 * serialVersionUID
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="RCCODELIEUDEPOT", length=3, nullable=false)
	private String rcCodeLieuDepot;
	
    @Column(name="RCLIBELLELIEUDEPOT", length=50)
	private String rcLibelleLieuDepot;
    
    public LieuDepot() {
    	
    }
    
    public LieuDepot(String rccodelieudepot) {
    	super(); 
		this.rcCodeLieuDepot = rccodelieudepot;
	}
    
    /**
	 * Get accessor for persistent attribute: rccodelieudepot
	 */
    public String getRcCodeLieuDepot() {
        return rcCodeLieuDepot;
    }
 
    /**
	 * Set accessor for persistent attribute: rccodelieudepot
	 */
	public void setRcCodeLieuDepot(String rcCodeLieuDepot) {
        this.rcCodeLieuDepot = rcCodeLieuDepot;
    }

    /**
	 * Get accessor for persistent attribute: rclibellelieudepot
	 */
    public String getRcLibelleLieuDepot() {
        return rcLibelleLieuDepot;
    }

    /**
	 * Set accessor for persistent attribute: rclibellelieudepot
	 */
	public void setRcLibelleLieuDepot(String rcLibelleLieuDepot) {
        this.rcLibelleLieuDepot = rcLibelleLieuDepot;
    }
}
