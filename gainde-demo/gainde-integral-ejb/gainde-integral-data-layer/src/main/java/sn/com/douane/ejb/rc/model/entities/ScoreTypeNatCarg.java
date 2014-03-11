package sn.com.douane.ejb.rc.model.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="SCORETYPENATCARG")
public class ScoreTypeNatCarg implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@Column(name ="RCCODETYPENATCARG",nullable=false)
	private java.lang.Integer rccodetypenatcarg;
	@Column(name ="RCLIBELLETYPENATCARG",length=100,nullable=false)
    private java.lang.String rclibelletypenatcarg;
	@Column(name ="RCSCORENATCARG",nullable=false)
    private java.lang.Integer rcscorenatcarg;
	@Column(name ="RCDDEBUTNATCARG",nullable=false)
    private java.sql.Date ddebutnatcarg;
	@Column(name ="RCDFINNATCARG")
    private java.sql.Date dfinnatcarg;

    
	public ScoreTypeNatCarg(
            java.lang.Integer rccodetypenatcarg) {
		super();
		this.rccodetypenatcarg = rccodetypenatcarg;
		
	}

    
	public ScoreTypeNatCarg(
            java.lang.Integer rccodetypenatcarg,
            java.lang.String rclibelletypenatcarg,
            java.lang.Integer rcscorenatcarg, java.sql.Date ddebutnatcarg) {
		super();
		this.rccodetypenatcarg= rccodetypenatcarg;
		this.rclibelletypenatcarg = rclibelletypenatcarg;
		this.rcscorenatcarg = rcscorenatcarg;
		this.ddebutnatcarg = ddebutnatcarg ;
		
	}

    /**
	 * Get accessor for persistent attribute: rccodetypenatcarg
	 */
	
    public java.lang.Integer getRccodetypenatcarg() {
        return rccodetypenatcarg;
    }

    /**
	 * Set accessor for persistent attribute: rccodetypenatcarg
	 */
	public void setRccodetypenatcarg(
			java.lang.Integer rccodetypenatcarg) {
        this.rccodetypenatcarg = rccodetypenatcarg;
    }

    /**
	 * Get accessor for persistent attribute: rclibelletypenatcarg
	 */
	
    public java.lang.String getRclibelletypenatcarg() {
        return rclibelletypenatcarg;
    }

    /**
	 * Set accessor for persistent attribute: rclibelletypenatcarg
	 */
	public void setRclibelletypenatcarg(
			java.lang.String rclibelletypenatcarg) {
        this.rclibelletypenatcarg = rclibelletypenatcarg;
    }

    /**
	 * Get accessor for persistent attribute: ddebutnatcarg
	 */
	
    public java.sql.Date getDdebutnatcarg() {
        return ddebutnatcarg;
    }

    /**
	 * Set accessor for persistent attribute: ddebutnatcarg
	 */
	public void setDdebutnatcarg(java.sql.Date ddebutnatcarg) {
        this.ddebutnatcarg = ddebutnatcarg;
    }

    /**
	 * Get accessor for persistent attribute: dfinnatcarg
	 */
	
    public java.sql.Date getDfinnatcarg() {
        return dfinnatcarg;
    }

    /**
	 * Set accessor for persistent attribute: dfinnatcarg
	 */
	public void setDfinnatcarg(java.sql.Date dfinnatcarg) {
        this.dfinnatcarg = dfinnatcarg;
    }

   


	/**
	 * Get accessor for persistent attribute: rcscorenatcarg
	 */
	
    public java.lang.Integer getRcscorenatcarg() {
        return rcscorenatcarg;
    }

    /**
	 * Set accessor for persistent attribute: rcscorenatcarg
	 */
	public void setRcscorenatcarg(java.lang.Integer rcscorenatcarg) {
        this.rcscorenatcarg = rcscorenatcarg;
    }

    public ScoreTypeNatCarg() {
    }
}



