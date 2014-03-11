package sn.com.douane.ejb.rc.model.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="SCORETYPEDESTFISCAL")
public class ScoreTypeDestFiscal implements Serializable {
	
	
	    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@Column(name ="CODETYPEDESTFISCAL",nullable=false)
		private java.lang.Integer codetypedestfiscal;
	@Column(name ="RCLIBELLETYPEDESTFISCAL",length=100,nullable=false)
	    private java.lang.String rclibelletypedestfiscal;
	@Column(name ="RCSCORETYPEFISC",nullable=false)
	    private java.lang.Integer rcscoretypefisc;
	@Column(name ="RCDDEBUTDESTFISC",nullable=false)
	    private java.sql.Date rcddebutdestfisc;
	@Column(name ="RCDFINDESTFISC")
	    private java.sql.Date rcdfindestfisc;

	public ScoreTypeDestFiscal(
            java.lang.Integer codetypedestfiscal) {
		
		super();
		this.codetypedestfiscal= codetypedestfiscal;
	}

    
	public ScoreTypeDestFiscal(
            java.lang.Integer codetypedestfiscal,
            java.lang.String rclibelletypedestfiscal,
            java.lang.Integer rcscoretypefisc, java.sql.Date rcddebutdestfisc) {
		super();
		this.codetypedestfiscal= codetypedestfiscal;
		this.rclibelletypedestfiscal= rclibelletypedestfiscal;
		this.rcscoretypefisc = rcscoretypefisc;
		this.rcddebutdestfisc= rcddebutdestfisc;
		
	}

    /**
	 * Get accessor for persistent attribute: codetypedestfiscal
	 */
	
    public java.lang.Integer getCodetypedestfiscal() {
        return codetypedestfiscal;
    }

    /**
	 * Set accessor for persistent attribute: codetypedestfiscal
	 */
	public void setCodetypedestfiscal(
			java.lang.Integer codetypedestfiscal) {
        this.codetypedestfiscal = codetypedestfiscal;
    }

    /**
	 * Get accessor for persistent attribute: rclibelletypedestfiscal
	 */
	
    public java.lang.String getRclibelletypedestfiscal() {
        return rclibelletypedestfiscal;
    }

    /**
	 * Set accessor for persistent attribute: rclibelletypedestfiscal
	 */
	public void setRclibelletypedestfiscal(
			java.lang.String rclibelletypedestfiscal) {
        this.rclibelletypedestfiscal = rclibelletypedestfiscal;
    }

    /**
	 * Get accessor for persistent attribute: rcscoretypefisc
	 */
	
    public java.lang.Integer getRcscoretypefisc() {
        return rcscoretypefisc;
    }

    /**
	 * Set accessor for persistent attribute: rcscoretypefisc
	 */
	public void setRcscoretypefisc(java.lang.Integer rcscoretypefisc) {
        this.rcscoretypefisc = rcscoretypefisc;
    }

    /**
	 * Get accessor for persistent attribute: rcddebutdestfisc
	 */
	
    public java.sql.Date getRcddebutdestfisc() {
        return rcddebutdestfisc;
    }

    /**
	 * Set accessor for persistent attribute: rcddebutdestfisc
	 */
	public void setRcddebutdestfisc(java.sql.Date rcddebutdestfisc) {
        this.rcddebutdestfisc = rcddebutdestfisc;
    }

    /**
	 * Get accessor for persistent attribute: rcdfindestfisc
	 */
	
    public java.sql.Date getRcdfindestfisc() {
        return rcdfindestfisc;
    }

    /**
	 * Set accessor for persistent attribute: rcdfindestfisc
	 */
	public void setRcdfindestfisc(java.sql.Date rcdfindestfisc) {
        this.rcdfindestfisc = rcdfindestfisc;
    }

 
    public ScoreTypeDestFiscal() {
    }
}
