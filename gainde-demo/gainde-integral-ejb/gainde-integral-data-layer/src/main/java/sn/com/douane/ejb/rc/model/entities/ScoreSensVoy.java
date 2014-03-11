package sn.com.douane.ejb.rc.model.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

@Entity
@Table(name="SCORESENSVOY")

@NamedQuery(name = "findTypeSensVoy", 
		query = "select object(s) from ScoreSensVoy s ")

public class ScoreSensVoy implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
    @Id
	@Column(name="RCCODETYPESENSVOY",nullable=false)
	 private java.lang.Integer rccodetypesensvoy;
	@Column(name="RCLIBELLETYPESENSVOY",length =100,nullable=false)
	 private java.lang.String rclibelletypesensvoy;
	@Column(name="RCSCORESENSVOY",nullable=false)
	 private java.lang.Integer rcscoresensvoy;
	@Column(name="RCDDEBUTSENSVOY")
	 private java.sql.Date rcddebutsensvoy;
	@Column(name="RCDFINSENSVOY")
	 private java.sql.Date rcdfinsensvoy;

	   
		
		public ScoreSensVoy(
	            java.lang.Integer rccodetypesensvoy) {
			
			super();
			this.rccodetypesensvoy = rccodetypesensvoy;
			
		}

	    

		
		public ScoreSensVoy(
	            java.lang.Integer rccodetypesensvoy,
	            java.lang.String rclibelletypesensvoy,
	            java.lang.Integer rcscoresensvoy, java.sql.Date rcddebutsensvoy) {
			super();
			this.rccodetypesensvoy = rccodetypesensvoy;
			this.rclibelletypesensvoy= rclibelletypesensvoy ;
			this.rcscoresensvoy = rcscoresensvoy ;
			this.rcddebutsensvoy = rcddebutsensvoy ;
		
		}

	    /**
		 * Get accessor for persistent attribute: rccodetypesensvoy
		 */
		
	    public java.lang.Integer getRccodetypesensvoy() {
	        return rccodetypesensvoy;
	    }

	    /**
		 * Set accessor for persistent attribute: rccodetypesensvoy
		 */
		public void setRccodetypesensvoy(
				java.lang.Integer rccodetypesensvoy) {
	        this.rccodetypesensvoy = rccodetypesensvoy;
	    }

	    /**
		 * Get accessor for persistent attribute: rclibelletypesensvoy
		 */
		
	    public java.lang.String getRclibelletypesensvoy() {
	        return rclibelletypesensvoy;
	    }

	    /**
		 * Set accessor for persistent attribute: rclibelletypesensvoy
		 */
		public void setRclibelletypesensvoy(
				java.lang.String rclibelletypesensvoy) {
	        this.rclibelletypesensvoy = rclibelletypesensvoy;
	    }

	    /**
		 * Get accessor for persistent attribute: rcscoresensvoy
		 */
		
	    public java.lang.Integer getRcscoresensvoy() {
	        return rcscoresensvoy;
	    }

	    /**
		 * Set accessor for persistent attribute: rcscoresensvoy
		 */
		public void setRcscoresensvoy(java.lang.Integer rcscoresensvoy) {
	        this.rcscoresensvoy = rcscoresensvoy;
	    }

	    /**
		 * Get accessor for persistent attribute: rcddebutsensvoy
		 */
		
	    public java.sql.Date getRcddebutsensvoy() {
	        return rcddebutsensvoy;
	    }

	    /**
		 * Set accessor for persistent attribute: rcddebutsensvoy
		 */
		public void setRcddebutsensvoy(java.sql.Date rcddebutsensvoy) {
	        this.rcddebutsensvoy = rcddebutsensvoy;
	    }

	    /**
		 * Get accessor for persistent attribute: rcdfinsensvoy
		 */
		
	    public java.sql.Date getRcdfinsensvoy() {
	        return rcdfinsensvoy;
	    }

	    /**
		 * Set accessor for persistent attribute: rcdfinsensvoy
		 */
		public void setRcdfinsensvoy(java.sql.Date rcdfinsensvoy) {
	        this.rcdfinsensvoy = rcdfinsensvoy;
	    }

	

	    public ScoreSensVoy() {
	    }
	}

