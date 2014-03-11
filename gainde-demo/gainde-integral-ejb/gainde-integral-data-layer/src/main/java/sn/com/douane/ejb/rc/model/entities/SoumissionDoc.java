package sn.com.douane.ejb.rc.model.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * SoumissionDoc EJB3 Entity Bean.
 * 
 * @author Wadii
 */
@Entity
@Table(name = "SoumissionDoc")
public class SoumissionDoc implements Serializable {

	private static final long serialVersionUID = 3611472226398922936L;	
		
	@Id
	@Column(name = "RCCODESOUMDOC", length = 2, nullable = false)
	private String rccodesoumdoc;
	
	@Column(name = "RCLIBELLESOUMDOC", length = 100, nullable = false)
    private String rclibellesoumdoc;
	
	@Column(name = "RCCODEPIECEJOINTE", length = 3, nullable = false)
	private String rccodepiecejointe;
    
    @ManyToOne
    @JoinColumn(name = "RCCODEPIECEJOINTE", insertable = false, updatable = false)
    private PieceJointe pieceJointe;
    
    /**
	 * Enable JPA optimstic lock.
	 */
//	@Version
//	@Column(nullable = false)
//	private int version;
    
    /**
     * 0-args constructor.
     */
	public SoumissionDoc() {
		super();
	}

	/**
     * 2-args constructor.
     */
	public SoumissionDoc(String rccodesoumdoc, String rclibellesoumdoc) {
		super();
		this.rccodesoumdoc = rccodesoumdoc;
		this.rclibellesoumdoc = rclibellesoumdoc;
	}
	
	/**
	 * Get accessor for persistent attribute: rccodesoumdoc
	 */	
    public String getRccodesoumdoc() {
        return rccodesoumdoc;
    }

    /**
	 * Set accessor for persistent attribute: rccodesoumdoc
	 */
	public void setRccodesoumdoc(String rccodesoumdoc) {
        this.rccodesoumdoc = rccodesoumdoc;
    }

    /**
	 * Get accessor for persistent attribute: rclibellesoumdoc
	 */	
    public String getRclibellesoumdoc() {
        return rclibellesoumdoc;
    }

    /**
	 * Set accessor for persistent attribute: rclibellesoumdoc
	 */
	public void setRclibellesoumdoc(String rclibellesoumdoc) {
        this.rclibellesoumdoc = rclibellesoumdoc;
    }

	public String getRccodepiecejointe() {
		return rccodepiecejointe;
	}

	public void setRccodepiecejointe(String rccodepiecejointe) {
		this.rccodepiecejointe = rccodepiecejointe;
	}

	public PieceJointe getPieceJointe() {
		return pieceJointe;
	}

	public void setPieceJointe(PieceJointe pieceJointe) {
		this.pieceJointe = pieceJointe;
	}



	
}
