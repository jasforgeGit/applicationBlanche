package sn.com.douane.ejb.rc.model.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import sn.com.douane.ejb.rc.model.keys.DispensePieceJointeKey;

/**
 * Bean implementation class for Enterprise Bean: Dispensespj
 */
@Entity
@IdClass(DispensePieceJointeKey.class)
@Table(name = "DISPENSESPJ")
public class DispensePieceJointe implements Serializable {
   
	private static final long serialVersionUID = -6426264231715391706L;
	
	@Id
	@Column(name = "RCCODEDISPENSE",length = 5,nullable = false)
	private String rccodedispense;

	@Id
	@Column(name = "RCCODEPIECEJOINTE",length = 3,nullable = false)
	private String rccodepiecejointe;
		
	@ManyToOne
    @JoinColumn(name = "RCCODEDISPENSE",insertable = false,updatable = false)
	private Dispense dispense;
	
	@ManyToOne
	@JoinColumn(name = "RCCODEPIECEJOINTE",insertable = false,updatable = false)
    private PieceJointe pieceJointe;	

	/**
	 * Enable JPA optimstic lock.
	 */
//	@Version
//	@Column(nullable = false)
//	private int version;
//	
//	
	
	public DispensePieceJointe() {
		super();
	}

	/**
	 * 2-args default constructor.
	 * 
	 * @param rccodedispense
	 * @param rccodepiecejointe
	 */
	public DispensePieceJointe(String rccodedispense,String rccodepiecejointe) {
		super();
		this.rccodedispense = rccodedispense;
		this.rccodepiecejointe = rccodepiecejointe;
	}

	public String getRccodedispense() {
		return rccodedispense;
	}

	public void setRccodedispense(String rccodedispense) {
		this.rccodedispense = rccodedispense;
	}

	public String getRccodepiecejointe() {
		return rccodepiecejointe;
	}

	public void setRccodepiecejointe(String rccodepiecejointe) {
		this.rccodepiecejointe = rccodepiecejointe;
	}

	public Dispense getDispense() {
		return dispense;
	}

	public void setDispense(Dispense dispense) {
		this.dispense = dispense;
	}

	public PieceJointe getPieceJointe() {
		return pieceJointe;
	}

	public void setPieceJointe(PieceJointe pieceJointe) {
		this.pieceJointe = pieceJointe;
	}

	
	
}
