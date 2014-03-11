package sn.com.douane.ejb.rc.model.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;



@Entity
@Table (name="MESSAGESERREUR")
public class MessagesErreur implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
   
	@Id
    @Column (name ="RCCODEMSGERREUR" ,length=5 ,nullable=false)
	 private java.lang.String rccodemsgerreur;
	 
	@Column(name="RCMESSAGEERREUR", length=30)
	private java.lang.String rcmessageerreur;

	   
		public MessagesErreur(
	            java.lang.String rccodemsgerreur, java.lang.String rcmessageerreur) {
			super();
			this.rccodemsgerreur = rccodemsgerreur;
			this.rcmessageerreur = rcmessageerreur;
			
		}

	    /**
		 * Get accessor for persistent attribute: rccodemsgerreur
		 */
		
	    public java.lang.String getRccodemsgerreur() {
	        return rccodemsgerreur;
	    }

	    /**
		 * Set accessor for persistent attribute: rccodemsgerreur
		 */
		public void setRccodemsgerreur(java.lang.String rccodemsgerreur) {
	        this.rccodemsgerreur = rccodemsgerreur;
	    }

	    /**
		 * Get accessor for persistent attribute: rcmessageerreur
		 */
		
	    public java.lang.String getRcmessageerreur() {
	        return rcmessageerreur;
	    }

	    /**
		 * Set accessor for persistent attribute: rcmessageerreur
		 */
		public void setRcmessageerreur(java.lang.String rcmessageerreur) {
	        this.rcmessageerreur = rcmessageerreur;
	    }

	    
		
		



	    public MessagesErreur() {
	    }
	}
