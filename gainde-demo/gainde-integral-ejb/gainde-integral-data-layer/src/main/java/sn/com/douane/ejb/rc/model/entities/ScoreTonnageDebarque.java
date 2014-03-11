package sn.com.douane.ejb.rc.model.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="SCORETONNAGEDEBARQUE")
public class ScoreTonnageDebarque implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Id
	@Column(name="RCCODETONNNAGE",nullable=false)
	private java.lang.Integer rccodetonnnage;
	@Column(name="RCINDICEDEBTONNDEBARQ",nullable=false)
    private java.lang.Integer rcindicedebtonndebarq;
	@Column(name="RCINDICEFINTONNDEBARQ",nullable=false)
    private java.lang.Integer rcindicefintonndebarq;
	@Column(name="RCDATEFINTONNDEB",nullable=false)
    private java.sql.Date rcdatefintonndeb;
	@Column(name="RCDATEDEBTONNDEB")
    private java.sql.Date rcdatedebtonndeb;
	@Column(name="RCSCORETONNDEB",nullable=false)
    private java.lang.Integer rcscoretonndeb;

    
	
	/**
	 * ejbCreate
	 */
	public ScoreTonnageDebarque(
            java.lang.Integer rccodetonnnage) {
		super();
		this.rccodetonnnage = rccodetonnnage ;
	}

    


	/**
	 * ejbCreate method for a CMP entity bean.
	 */
	public ScoreTonnageDebarque(
            java.lang.Integer rccodetonnnage,
            java.lang.Integer rcindicedebtonndebarq,
            java.lang.Integer rcindicefintonndebarq,
            java.sql.Date rcdatefintonndeb, 
            java.lang.Integer rcscoretonndeb) {
		super();
		this.rccodetonnnage= rccodetonnnage;
		this.rcindicedebtonndebarq = rcindicedebtonndebarq;
		this.rcindicefintonndebarq = rcindicefintonndebarq;
		this.rcdatefintonndeb = rcdatefintonndeb;
		this.rcscoretonndeb= rcscoretonndeb;
		
	}

    /**
	 * Get accessor for persistent attribute: rccodetonnnage
	 */

    public java.lang.Integer getRccodetonnnage() {
        return rccodetonnnage;
    }

    /**
	 * Set accessor for persistent attribute: rccodetonnnage
	 */
	public void setRccodetonnnage(java.lang.Integer rccodetonnnage) {
        this.rccodetonnnage = rccodetonnnage;
    }

    /**
	 * Get accessor for persistent attribute: rcindicedebtonndebarq
	 */
	
    public java.lang.Integer getRcindicedebtonndebarq() {
        return rcindicedebtonndebarq;
    }

    /**
	 * Set accessor for persistent attribute: rcindicedebtonndebarq
	 */
	public void setRcindicedebtonndebarq(
			java.lang.Integer rcindicedebtonndebarq) {
        this.rcindicedebtonndebarq = rcindicedebtonndebarq;
    }

    /**
	 * Get accessor for persistent attribute: rcindicefintonndebarq
	 */
	
    public java.lang.Integer getRcindicefintonndebarq() {
        return rcindicefintonndebarq;
    }

    /**
	 * Set accessor for persistent attribute: rcindicefintonndebarq
	 */
	public void setRcindicefintonndebarq(
			java.lang.Integer rcindicefintonndebarq) {
        this.rcindicefintonndebarq = rcindicefintonndebarq;
    }

    /**
	 * Get accessor for persistent attribute: rcdatefintonndeb
	 */
	
    public java.sql.Date getRcdatefintonndeb() {
        return rcdatefintonndeb;
    }

    /**
	 * Set accessor for persistent attribute: rcdatefintonndeb
	 */
	public void setRcdatefintonndeb(java.sql.Date rcdatefintonndeb) {
        this.rcdatefintonndeb = rcdatefintonndeb;
    }

    /**
	 * Get accessor for persistent attribute: rcdatedebtonndeb
	 */
	
    public java.sql.Date getRcdatedebtonndeb() {
        return rcdatedebtonndeb;
    }

    /**
	 * Set accessor for persistent attribute: rcdatedebtonndeb
	 */
	public void setRcdatedebtonndeb(java.sql.Date rcdatedebtonndeb) {
        this.rcdatedebtonndeb = rcdatedebtonndeb;
    }

    /**
	 * Get accessor for persistent attribute: rcscoretonndeb
	 */
	
    public java.lang.Integer getRcscoretonndeb() {
        return rcscoretonndeb;
    }

    /**
	 * Set accessor for persistent attribute: rcscoretonndeb
	 */
	public void setRcscoretonndeb(java.lang.Integer rcscoretonndeb) {
        this.rcscoretonndeb = rcscoretonndeb;
    }

    
    public ScoreTonnageDebarque() {
    }
}

