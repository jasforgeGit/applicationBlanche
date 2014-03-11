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


/**
 * NaturePieceJointe EJB3 Entity Bean.
 * 
 * @author Wadii
 */
@Entity
@Table(name = "NaturePieceJointe")
public class NaturePieceJointe implements Serializable {
   
	private static final long serialVersionUID = 5937842522737588009L;
		
	@Id
	@Column(name = "RCCODEPIECEJOINTE", length = 1, nullable = false)
	private String rccodepiecejointe;
	
	@Column(name = "RCLIBPIECEJOINTE", length = 100, nullable = false)
    private String rclibpiecejointe;
    
    @OneToMany(mappedBy = "naturePieceJointe", targetEntity = PieceJointe.class)
    private List<PieceJointe> pieceJointes = new ArrayList<PieceJointe>();
    
    /**
	 * Enable JPA optimstic lock.
	 */
//	@Version
//	@Column(nullable = false)
//	private int version;
    
    /**
     * 0-args Constructor.
     */
    public NaturePieceJointe() {
		super();
	}

    /**
     * 2-args Constructor.
     */
	public NaturePieceJointe(String rccodepiecejointe, String rclibpiecejointe) {
		super();
		this.rccodepiecejointe = rccodepiecejointe;
		this.rclibpiecejointe = rclibpiecejointe;
	}

	/**
	 * Get accessor for persistent attribute: rccodepiecejointe
	 */
    public String getRccodepiecejointe() {
        return rccodepiecejointe;
    }

    /**
	 * Set accessor for persistent attribute: rccodepiecejointe
	 */
	public void setRccodepiecejointe(String rccodepiecejointe) {
        this.rccodepiecejointe = rccodepiecejointe;
    }

    /**
	 * Get accessor for persistent attribute: rclibpiecejointe
	 */
    public String getRclibpiecejointe() {
        return rclibpiecejointe;
    }

    /**
	 * Set accessor for persistent attribute: rclibpiecejointe
	 */
	public void setRclibpiecejointe(String rclibpiecejointe) {
        this.rclibpiecejointe = rclibpiecejointe;
    }

	public List<PieceJointe> getPieceJointes() {
		return pieceJointes;
	}

	public void setPieceJointes(List<PieceJointe> pieceJointes) {
		this.pieceJointes = pieceJointes;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((pieceJointes == null) ? 0 : pieceJointes.hashCode());
		result = prime
				* result
				+ ((rccodepiecejointe == null) ? 0 : rccodepiecejointe
						.hashCode());
		result = prime
				* result
				+ ((rclibpiecejointe == null) ? 0 : rclibpiecejointe.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj){
			return true;
		}
		if (obj == null){
			return false;
		}
		if (getClass() != obj.getClass()){
			return false;
		}
		NaturePieceJointe other = (NaturePieceJointe) obj;
		if (pieceJointes == null) {
			if (other.pieceJointes != null){
				return false;
			}
		} else if (!pieceJointes.equals(other.pieceJointes)){
			return false;
		}
		if (rccodepiecejointe == null) {
			if (other.rccodepiecejointe != null){
				return false;
			}
		} else if (!rccodepiecejointe.equals(other.rccodepiecejointe)){
			return false;
		}
		if (rclibpiecejointe == null) {
			if (other.rclibpiecejointe != null){
				return false;
			}
		} else if (!rclibpiecejointe.equals(other.rclibpiecejointe)){
			return false;
		}
		return true;
	}

	
	
	
	
	
}

