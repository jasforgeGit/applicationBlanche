package sn.com.douane.ejb.rc.model.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="SCORETYPENAVIRE")
public class ScoreTypeNavire implements Serializable{
	 /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	 
	   @Id
	   @Column(name="RCCODETYPENAVIRE",nullable=false)
	    private java.lang.Integer rccodetypenavire;
	   @Column(name="RCLIBELLETYPENAVIRE",length=100,nullable=false)
	    private java.lang.String rclibelletypenavire;
	   @Column(name="RCSCORETYPENAV",nullable=false)
	    private java.lang.Integer rcscoretypenav;
	   @Column(name="RCDDEBUTTYPNAV")
	    private java.sql.Date rcddebuttypnav;
	   @Column(name="RCDFINTYPNAV")
	    private java.sql.Date rcdfintypnav;

	 

		public ScoreTypeNavire(
	            java.lang.Integer rccodetypenavire) {
			super();
			this.rccodetypenavire = rccodetypenavire ;
			
		}

	  

		/**
		 * ejbCreate method for a CMP entity bean.
		 */
		public ScoreTypeNavire(
	            java.lang.Integer rccodetypenavire,
	            java.lang.String rclibelletypenavire,
	            java.lang.Integer rcscoretypenav, 
	            java.sql.Date rcddebuttypnav) {
			super();
			this.rccodetypenavire = rccodetypenavire ;
			this.rclibelletypenavire = rclibelletypenavire ;
			this.rcscoretypenav = rcscoretypenav;
			this.rcddebuttypnav= rcddebuttypnav;
			
			
		}
		
		public ScoreTypeNavire(Integer rccodetypenavire, String rclibelletypenavire) {
			this.rccodetypenavire = rccodetypenavire ;
			this.rclibelletypenavire = rclibelletypenavire ;
		}

	    /**
		 * Get accessor for persistent attribute: rccodetypenavire
		 */
		
	    public java.lang.Integer getRccodetypenavire() {
	        return rccodetypenavire;
	    }

	    /**
		 * Set accessor for persistent attribute: rccodetypenavire
		 */
		public void setRccodetypenavire(
				java.lang.Integer rccodetypenavire) {
	        this.rccodetypenavire = rccodetypenavire;
	    }

	    /**
		 * Get accessor for persistent attribute: rclibelletypenavire
		 */
		
	    public java.lang.String getRclibelletypenavire() {
	        return rclibelletypenavire;
	    }

	    /**
		 * Set accessor for persistent attribute: rclibelletypenavire
		 */
		public void setRclibelletypenavire(
				java.lang.String rclibelletypenavire) {
	        this.rclibelletypenavire = rclibelletypenavire;
	    }

	    /**
		 * Get accessor for persistent attribute: rcscoretypenav
		 */
		
	    public java.lang.Integer getRcscoretypenav() {
	        return rcscoretypenav;
	    }

	    /**
		 * Set accessor for persistent attribute: rcscoretypenav
		 */
		public void setRcscoretypenav(java.lang.Integer rcscoretypenav) {
	        this.rcscoretypenav = rcscoretypenav;
	    }

	    /**
		 * Get accessor for persistent attribute: rcddebuttypnav
		 */
		
	    public java.sql.Date getRcddebuttypnav() {
	        return rcddebuttypnav;
	    }

	    /**
		 * Set accessor for persistent attribute: rcddebuttypnav
		 */
		public void setRcddebuttypnav(java.sql.Date rcddebuttypnav) {
	        this.rcddebuttypnav = rcddebuttypnav;
	    }

	    /**
		 * Get accessor for persistent attribute: rcdfintypnav
		 */
		
	    public java.sql.Date getRcdfintypnav() {
	        return rcdfintypnav;
	    }

	    /**
		 * Set accessor for persistent attribute: rcdfintypnav
		 */
		public void setRcdfintypnav(java.sql.Date rcdfintypnav) {
	        this.rcdfintypnav = rcdfintypnav;
	    }

	  
	    public ScoreTypeNavire() {
	    }



		
	}



